
package net.lepidodendron.entity;

import net.ilexiconn.llibrary.client.model.tools.ChainBuffer;
import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.ai.*;
import net.lepidodendron.entity.base.EntityPrehistoricFloraEurypteridBase;
import net.lepidodendron.entity.util.ITrappableWater;
import net.minecraft.block.material.Material;
import net.minecraft.entity.EnumCreatureAttribute;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.DamageSource;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import org.apache.commons.lang3.ArrayUtils;

import javax.annotation.Nullable;

public class EntityPrehistoricFloraEurypterus extends EntityPrehistoricFloraEurypteridBase implements ITrappableWater {

	public BlockPos currentTarget;
	@SideOnly(Side.CLIENT)
	public ChainBuffer chainBuffer;

	public EntityPrehistoricFloraEurypterus(World world) {
		super(world);
		setSize(0.5F, 0.3F);
		minWidth = 0.1F;
		maxWidth = 0.5F;
		maxHeight = 0.3F;
		maxHealthAgeable = 5.0D;
	}

	@Override
	public int getEggType(@Nullable String variantIn) {
		return 46; //eurypterid type
	}

	@Override
	public boolean isSmall() {
		return this.getAgeScale() < 0.8F;
	}

	public static String getPeriod() {return "Silurian";}

	//public static String getHabitat() {return "Aquatic";}

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
		return 24000;
	}

	protected void initEntityAI() {
		tasks.addTask(0, new EntityMateAIAgeableBase(this, 1.0D));
		tasks.addTask(1, new EntityTemptAI(this, 1, true, true, 0));
		tasks.addTask(2, new AttackAI(this, 1.0D, false, this.getAttackLength()));
		tasks.addTask(3, new EurypteridWander(this, NO_ANIMATION));
		tasks.addTask(4, new EntityLookIdleAI(this));
		this.targetTasks.addTask(0, new EatItemsEntityPrehistoricFloraAgeableBaseAI(this, 1));
	}

	@Override
	public String[] getFoodOreDicts() {
		return ArrayUtils.addAll(DietString.FISHFOOD);
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
	public EnumCreatureAttribute getCreatureAttribute() {
		return EnumCreatureAttribute.ARTHROPOD;
	}

	@Override
	protected boolean canDespawn() {
		return false;
	}

	@Override
	protected void applyEntityAttributes() {
		super.applyEntityAttributes();
		//this.getEntityAttribute(SharedMonsterAttributes.MAX_HEALTH).setBaseValue(5.0D);
		this.getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).setBaseValue(0.25D);
	}

	@Override
	protected boolean canTriggerWalking() {
		return false;
	}

	@Override
	protected double getSwimSpeed() {
		return this.getSwimSpeed();
	}

	@Override
	protected float getAISpeedEurypterid() {
		if (this.getTicks() < 0) {
			return 0.0F; //Is laying eggs
		}
		return (float) Math.min(1F, (this.getAgeScale() * 2F)) * 0.4F;
	}

	@Override
	public boolean isInWater() {
		return super.isInWater() || this.isInsideOfMaterial(Material.WATER) || this.isInsideOfMaterial(Material.CORAL);
	}

	@Override
	public boolean attackEntityFrom(DamageSource source, float amount) {

		return super.attackEntityFrom(source, (amount * 0.7F));

	}

	//@Override
	//public net.minecraft.util.SoundEvent getAmbientSound() {
	//    return (net.minecraft.util.SoundEvent) net.minecraft.util.SoundEvent.REGISTRY
	//            .getObject(new ResourceLocation("lepidodendron:eurypterus_idle"));
	//}

	@Override
	public SoundEvent getAmbientSound() {
		return (SoundEvent) SoundEvent.REGISTRY.getObject(new ResourceLocation(""));
	}


	//@Override
	//public net.minecraft.util.SoundEvent getHurtSound(DamageSource ds) {
	//    return (net.minecraft.util.SoundEvent) net.minecraft.util.SoundEvent.REGISTRY
	//            .getObject(new ResourceLocation("lepidodendron:eurypterus_hurt"));
	//}

	@Override
	public SoundEvent getHurtSound(DamageSource ds) {
		return (SoundEvent) SoundEvent.REGISTRY.getObject(new ResourceLocation("entity.generic.hurt"));
	}

	//@Override
	//public net.minecraft.util.SoundEvent getDeathSound() {
	//    return (net.minecraft.util.SoundEvent) net.minecraft.util.SoundEvent.REGISTRY
	//            .getObject(new ResourceLocation("lepidodendron:eurypterus_death"));
	//}
	@Override
	public SoundEvent getDeathSound() {
		return (SoundEvent) SoundEvent.REGISTRY.getObject(new ResourceLocation("entity.generic.death"));
	}

	@Override
	protected float getSoundVolume() {
		return 1.0F;
	}

	@Override
	public boolean canBreatheUnderwater() {
		return true;
	}

	@Override
	public boolean getCanSpawnHere() {
		return this.posY < (double) this.world.getSeaLevel() && this.isInWater();
	}

	public boolean isNotColliding() {
		return this.world.checkNoEntityCollision(this.getEntityBoundingBox(), this);
	}

	@Override
	public int getTalkInterval() {
		return 120;
	}

	@Override
	protected int getExperiencePoints(EntityPlayer player) {
		return 1 + this.world.rand.nextInt(3);
	}

	@Override
	public boolean isOnLadder() {
		return false;
	}

	@Override
	public void onLivingUpdate() {
		super.onLivingUpdate();
	}

	@Override
	public void onEntityUpdate() {
		super.onEntityUpdate();

	}

	@Nullable
	protected ResourceLocation getLootTable() {
		 		if (!this.isPFAdult()) {
			return LepidodendronMod.EURYPTERUS_LOOT_YOUNG;
		} return LepidodendronMod.EURYPTERUS_LOOT;
	}

}