
package net.lepidodendron.entity;

import net.ilexiconn.llibrary.client.model.tools.ChainBuffer;
import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.render.entity.RenderProsictodon;
import net.lepidodendron.item.ItemRoots;
import net.lepidodendron.util.CustomTrigger;
import net.lepidodendron.util.Functions;
import net.lepidodendron.util.ModTriggers;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.init.SoundEvents;
import net.minecraft.item.ItemStack;
import net.minecraft.util.DamageSource;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import javax.annotation.Nullable;
import java.util.List;

public class EntityPrehistoricFloraProsictodon extends EntityPrehistoricFloraDiictodon {

	public BlockPos currentTarget;
	@SideOnly(Side.CLIENT)
	public ChainBuffer chainBuffer;

	public EntityPrehistoricFloraProsictodon(World world) {
		super(world);
		setSize(0.22F, 0.25F);
		minWidth = 0.10F;
		maxWidth = 0.22F;
		maxHeight = 0.25F;
		maxHealthAgeable = 8.0D;
	}

	@Nullable
	@Override
	public CustomTrigger getModTrigger() {
		return ModTriggers.CLICK_PROSICTODON;
	}

	public float getAISpeedLand() {
		float speedBase = 0.22F;
		if (this.getTicks() < 0) {
			return 0.0F; //Is laying eggs
		}
		if (this.getAnimation() == DRINK_ANIMATION || this.getAnimation() == MAKE_NEST_ANIMATION || this.getAnimation() == GRAZE_ANIMATION) {
			return 0.0F;
		}
		if (this.getIsFast()) {
			speedBase = speedBase * 1.25F;
		}
		return speedBase;
	}

	@Override
	public int getDrinkLength() {
		return 45;
	}
	@Override
	public int getEatLength() {
		return 40;
	}

	@Override
	public boolean attackEntityFrom(DamageSource ds, float i) {
		Entity e = ds.getTrueSource();
		if (e instanceof EntityLivingBase) {
			EntityLivingBase ee = (EntityLivingBase) e;
			List<EntityPrehistoricFloraProsictodon> Prosictodon = this.world.getEntitiesWithinAABB(EntityPrehistoricFloraProsictodon.class, new AxisAlignedBB(this.getPosition().add(-8, -4, -8), this.getPosition().add(8, 4, 8)));
			for (EntityPrehistoricFloraProsictodon currentProsictodon : Prosictodon) {
				currentProsictodon.setRevengeTarget(ee);
				currentProsictodon.screamAlarmCooldown = rand.nextInt(20);
			}
		}
		return super.attackEntityFrom(ds, i);
	}

	@Override
	public int getTalkInterval() {
		return 80;
	}

	@Override
	public float getEyeHeight()
	{
		return Math.max(super.getEyeHeight(), this.height * 1.05F);
	}

	@Nullable
	protected ResourceLocation getLootTable() {
		if (!this.isPFAdult()) {
			return LepidodendronMod.PROSICTODON_LOOT_YOUNG;
		}
		return LepidodendronMod.PROSICTODON_LOOT;
	}

	private boolean isBlockGrazable(IBlockState state) {
		return (state.getMaterial() == Material.GROUND
				|| state.getMaterial() == Material.GRASS );
	}


	@Override
	public boolean isDrinking()
	{
		//Is GRAZING!
		if (!this.isPFAdult()) {
			return false;
		}

		BlockPos entityPos = Functions.getEntityBlockPos(this);

		boolean test = (this.getPFDrinking() <= 0
				&& !world.isRemote
				&& !this.getIsFast()
				//&& !this.getIsMoving()
				&& this.DRINK_ANIMATION.getDuration() > 0
				&& this.getAnimation() == NO_ANIMATION
				&& !this.isReallyInWater()
				&&
				(
						isBlockGrazable(this.world.getBlockState(entityPos.down()))
				)
				);
		if (test) {
			this.setDrinkingFrom(entityPos.down());
			this.faceBlock(this.getDrinkingFrom(), 10F, 10F);
		}
		return test;

	}

	@Override
	public boolean drinksWater() {
		return false;
	}


	@Override
	public void onLivingUpdate() {
		super.onLivingUpdate();

		if (this.getAnimation() == DRINK_ANIMATION) {
			if ((!world.isRemote) && this.getAnimationTick() == Math.round(this.getAnimation().getDuration() * 0.75F)) {
				ItemStack stack = new ItemStack(ItemRoots.block, 1);
				int i = this.rand.nextInt(8);
				boolean roots = false;
				for (int ii = 4; ii < i; ii++) {
					EntityItem entityToSpawn = new EntityItem(world, this.getDrinkingFrom().getX() + 0.5, this.getDrinkingFrom().getY() + 1, this.getDrinkingFrom().getZ() + 0.5, stack);
					entityToSpawn.setPickupDelay(20);
					entityToSpawn.addVelocity((world.rand.nextInt(3) - 1) * 0.05F,(world.rand.nextInt(3) + 1) * 0.05F,(world.rand.nextInt(3) - 1) * 0.05F);
					world.spawnEntity(entityToSpawn);
					roots = true;
				}
				if (roots) {
					world.playSound(null, this.getDrinkingFrom(), SoundEvents.ENTITY_CHICKEN_EGG, SoundCategory.BLOCKS, 0.5F, 1.0F + (world.rand.nextFloat() - world.rand.nextFloat()) * 0.8F);
				}
			}
		}

		if (this.getAnimation() == ATTACK_ANIMATION && this.getAnimationTick() == 11 && this.getAttackTarget() != null) {
			launchAttack();
		}

		//AnimationHandler.INSTANCE.updateAnimations(this);

	}
	@SideOnly(Side.CLIENT)
	public static ResourceLocation textureDisplay(@Nullable String variant) {
		return RenderProsictodon.TEXTURE;
	}
}