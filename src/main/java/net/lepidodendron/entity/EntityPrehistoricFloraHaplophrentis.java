
package net.lepidodendron.entity;

import net.ilexiconn.llibrary.client.model.tools.ChainBuffer;
import net.ilexiconn.llibrary.server.animation.AnimationHandler;
import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.ai.EntityMateAIAgeableBase;
import net.lepidodendron.entity.ai.WalkingAmphibianWander;
import net.lepidodendron.entity.base.EntityPrehistoricFloraWalkingAmphibianBase;
import net.lepidodendron.item.ItemFishFood;
import net.minecraft.entity.EnumCreatureAttribute;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.item.ItemStack;
import net.minecraft.util.DamageSource;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import javax.annotation.Nullable;

public class EntityPrehistoricFloraHaplophrentis extends EntityPrehistoricFloraWalkingAmphibianBase {

	public BlockPos currentTarget;
	@SideOnly(Side.CLIENT)
	public ChainBuffer chainBuffer;

	public EntityPrehistoricFloraHaplophrentis(World world) {
		super(world);
		setSize(0.2F, 0.2F);
		minWidth = 0.1F;
		maxWidth = 0.2F;
		maxHeight = 0.2F;
		maxHealthAgeable = 2.0D;
	}

	@Override
	public boolean isSmall() {
		return true;
	}

	public boolean getMovingOnLand() {
		int animCycle = 28;
		double tickAnim = (this.ticksExisted + this.getTickOffset()) - (int) (Math.floor((double) (this.ticksExisted + this.getTickOffset()) / (double) animCycle) * (double) animCycle);
		if ((tickAnim >=0 && tickAnim < 20)) {
			return true;
		}
		else {
			return false;
		}
	}

	public static String getPeriod() {return "Cambrian";}

	//public static String getHabitat() {return "Amphibious";}

	@Override
	public void playLivingSound() {
		if (this.getAnimation() != null) {
			if (this.getAnimation() == NO_ANIMATION && !world.isRemote) {
				this.setAnimation(ROAR_ANIMATION);
			}
		}
	}

	@Override
	public int getRoarLength() {
		return 50;
	}

	@Override
	public boolean dropsEggs() {
		return true;
	}
	
	@Override
	public boolean laysEggs() {
		return false;
	}

	@Override
	public int getAdultAge() {
		return 0;
	}

	@Override
	public int WaterDist() {
		return 0;
	}

	@Override
	protected float getAISpeedWalkingAmphibian() {
		if (!this.isReallyInWater()){
			return 0;
		}
		if (this.getAnimation() == this.ROAR_ANIMATION){
			return 0;
		}
		if (!this.getMovingOnLand() && this.isReallyInWater()) {
			return 0;
		}
		return 0.1F;

	}

	@Override
	protected void initEntityAI() {
		tasks.addTask(0, new EntityMateAIAgeableBase(this, 1.0D));
		//tasks.addTask(1, new EntityTemptAI(this, 1, false, true, (float) 0.5F));
		tasks.addTask(2, new WalkingAmphibianWander(this, NO_ANIMATION, 1, 0));
		//tasks.addTask(3, new EntityAILookIdle(this));
	}

	@Override
	public boolean isBreedingItem(ItemStack stack)
	{
		return stack.getItem() == ItemFishFood.block;
	}

	@Override
	public boolean canJumpOutOfWater() {
		return false;
	}

	@Override
	public boolean isAIDisabled() {
		return false;
	}

	@Override
	public EnumCreatureAttribute getCreatureAttribute() {
		return EnumCreatureAttribute.UNDEFINED;
	}

	@Override
	protected boolean canDespawn() {
		return false;
	}

	@Override
	protected void applyEntityAttributes() {
		super.applyEntityAttributes();
		//this.getEntityAttribute(SharedMonsterAttributes.MAX_HEALTH).setBaseValue(15.0D);
		this.getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).setBaseValue(0.3D);
	}

	@Override
	public net.minecraft.util.SoundEvent getAmbientSound() {
		return (net.minecraft.util.SoundEvent) net.minecraft.util.SoundEvent.REGISTRY.getObject(new ResourceLocation(""));
	}

	@Override
	public net.minecraft.util.SoundEvent getHurtSound(DamageSource ds) {
		return (net.minecraft.util.SoundEvent) net.minecraft.util.SoundEvent.REGISTRY.getObject(new ResourceLocation("entity.generic.hurt"));
	}

	@Override
	public net.minecraft.util.SoundEvent getDeathSound() {
		return (net.minecraft.util.SoundEvent) net.minecraft.util.SoundEvent.REGISTRY.getObject(new ResourceLocation("entity.generic.death"));
	}

	@Override
	protected float getSoundVolume() {
		return 1.0F;
	}

	@Override
	public void onLivingUpdate() {
		super.onLivingUpdate();
		//this.renderYawOffset = this.rotationYaw;

		AnimationHandler.INSTANCE.updateAnimations(this);
	}

	@Override
	public void onEntityUpdate() {
		int i = this.getAir();
		super.onEntityUpdate();

		if ((this.isEntityAlive() && !isReallyInWater()) //Is not in water
		)
		{
			--i;
			this.setAir(i);

			if (this.getAir() == -20)
			{
				this.setAir(200);
				this.attackEntityFrom(DamageSource.DROWN, 0.5F);
			}
		}
		else
		{
			this.setAir(this.airTime());
		}
	}

	@Nullable
	protected ResourceLocation getLootTable() {
		return LepidodendronMod.HAPLOPHRENTIS_LOOT;
	}

}

