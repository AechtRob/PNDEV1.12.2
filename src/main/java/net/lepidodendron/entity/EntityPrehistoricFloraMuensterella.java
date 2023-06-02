
package net.lepidodendron.entity;

import net.ilexiconn.llibrary.client.model.tools.ChainBuffer;
import net.lepidodendron.LepidodendronConfig;
import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.ai.EatFishFoodAIAgeable;
import net.lepidodendron.entity.ai.EntityMateAIAgeableBase;
import net.lepidodendron.entity.ai.NautiloidWanderBottomDweller;
import net.lepidodendron.entity.base.EntityPrehistoricFloraNautiloidBase;
import net.lepidodendron.entity.render.entity.RenderMuensterella;
import net.lepidodendron.entity.render.tile.RenderDisplays;
import net.lepidodendron.item.entities.ItemNautiloidEggsMuensterella;
import net.minecraft.client.model.ModelBase;
import net.minecraft.entity.ai.EntityAILookIdle;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.item.ItemStack;
import net.minecraft.util.DamageSource;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import javax.annotation.Nullable;

public class EntityPrehistoricFloraMuensterella extends EntityPrehistoricFloraNautiloidBase {

	public BlockPos currentTarget;
	@SideOnly(Side.CLIENT)
	public ChainBuffer chainBuffer;

	public EntityPrehistoricFloraMuensterella(World world) {
		super(world);
		setSize(0.3F, 0.25F);
		minWidth = 0.07F;
		maxWidth = 0.3F;
		maxHeight = 0.25F;
		maxHealthAgeable = 3.0D;
	}

	@Override
	public boolean canShoal() {
		return (!(this.getAlarmCooldown() > 0));
	}

	@Override
	public int getShoalSize() {
		return 6;
	}

	@Override
	public int getShoalDist() {
		return 3;
	}

	@Override
	public boolean isSmall() {
		return true;
	}

	public static String getPeriod() {return "Jurassic";}

	public static String getHabitat() {return "Aquatic";}

	@Override
	public boolean dropsEggs() {
		return false;
	}
	
	@Override
	public boolean laysEggs() {
		return false;
	}

	@Override
	public int getAdultAge() {
		return 48000;
	}

	@Override
	protected float getAISpeedNautiloid() {
		//return 0;
		return 0.0698f;
	}

	protected void initEntityAI() {
		tasks.addTask(0, new EntityMateAIAgeableBase(this, 1));
		tasks.addTask(2, new NautiloidWanderBottomDweller(this, NO_ANIMATION));
		tasks.addTask(3, new EntityAILookIdle(this));
		this.targetTasks.addTask(0, new EatFishFoodAIAgeable(this));
	}

	@Override
	public boolean isAIDisabled() {
		return false;
	}

	@Override
	public String getTexture() {
		return this.getTexture();
	}

	@Override
	public SoundEvent getAmbientSound() {
		return (SoundEvent) SoundEvent.REGISTRY.getObject(new ResourceLocation(""));
	}

	@Override
	public SoundEvent getHurtSound(DamageSource ds) {
		return (SoundEvent) SoundEvent.REGISTRY.getObject(new ResourceLocation("entity.generic.hurt"));
	}

	public void onEntityUpdate() {
		super.onEntityUpdate();
		//Drop an egg perhaps:
		if (!world.isRemote && this.isPFAdult() && this.getCanBreed() && (LepidodendronConfig.doMultiplyMobs || this.getLaying())) {
			if (Math.random() > 0.5) {
				ItemStack itemstack = new ItemStack(ItemNautiloidEggsMuensterella.block, (int) (1));
				EntityItem entityToSpawn = new EntityItem(world, this.getPosition().getX(), this.getPosition().getY(), this.getPosition().getZ(), itemstack);
				entityToSpawn.setPickupDelay(10);
				world.spawnEntity(entityToSpawn);
			}
			this.setTicks(0);
		}
	}

	@Override
	public SoundEvent getDeathSound() {
		return (SoundEvent) SoundEvent.REGISTRY.getObject(new ResourceLocation("entity.generic.death"));
	}

	@Nullable
	protected ResourceLocation getLootTable() {
		if (!this.isPFAdult()) {
			return LepidodendronMod.MUENSTERELLA_LOOT_YOUNG;
		}
		return LepidodendronMod.MUENSTERELLA_LOOT;
	}

	//Rendering taxidermy:
	//--------------------
	public static double offsetCase() { return 0.3; }

	public static double offsetWall(@Nullable String variant) {
		return 0.01;
	}
	public static double upperfrontverticallinedepth(@Nullable String variant) {
		return 1.4;
	}
	public static double upperbackverticallinedepth(@Nullable String variant) {return 0.8;}
	public static double upperfrontlineoffset(@Nullable String variant) {
		return 0.4;
	}
	public static double upperfrontlineoffsetperpendiular(@Nullable String variant) {
		return -0F;
	}
	public static double upperbacklineoffset(@Nullable String variant) {
		return 0.4;
	}
	public static double upperbacklineoffsetperpendiular(@Nullable String variant) {
		return -0.15F;
	}
	public static double lowerfrontverticallinedepth(@Nullable String variant) {
		return 0;
	}
	public static double lowerbackverticallinedepth(@Nullable String variant) {
		return 0.6F;
	}
	public static double lowerfrontlineoffset(@Nullable String variant) {
		return 0;
	}
	public static double lowerfrontlineoffsetperpendiular(@Nullable String variant) {
		return -0F;
	}
	public static double lowerbacklineoffset(@Nullable String variant) {
		return 0;
	}
	public static double lowerbacklineoffsetperpendiular(@Nullable String variant) {
		return -0F;
	}
	@SideOnly(Side.CLIENT)
	public static ResourceLocation textureDisplay(@Nullable String variant) {
		return RenderMuensterella.TEXTURE;
	}
	@SideOnly(Side.CLIENT)
	public static ModelBase modelDisplay(@Nullable String variant) {
		return RenderDisplays.modelMuensterella;
	}
	public static float getScaler(@Nullable String variant) {
		return RenderMuensterella.getScaler();
	}

}
