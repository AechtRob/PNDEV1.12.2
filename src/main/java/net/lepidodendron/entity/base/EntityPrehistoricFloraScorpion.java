
package net.lepidodendron.entity.base;

import net.ilexiconn.llibrary.client.model.tools.ChainBuffer;
import net.lepidodendron.LepidodendronConfig;
import net.minecraft.block.BlockDirectional;
import net.minecraft.block.properties.PropertyDirection;
import net.minecraft.entity.Entity;
import net.minecraft.entity.IEntityLivingData;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.attributes.IAttributeInstance;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.MobEffects;
import net.minecraft.init.SoundEvents;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.network.datasync.DataParameter;
import net.minecraft.network.datasync.DataSerializers;
import net.minecraft.network.datasync.EntityDataManager;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.DamageSource;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.DifficultyInstance;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import javax.annotation.Nullable;

abstract public class EntityPrehistoricFloraScorpion extends EntityPrehistoricFloraLandClimbingBase {

	public BlockPos currentTarget;
	@SideOnly(Side.CLIENT)
	public ChainBuffer chainBuffer;
	private static final DataParameter<Boolean> BABIES = EntityDataManager.createKey(EntityPrehistoricFloraScorpion.class, DataSerializers.BOOLEAN);
	private static final DataParameter<Boolean> ISBABY = EntityDataManager.createKey(EntityPrehistoricFloraScorpion.class, DataSerializers.BOOLEAN);


	public EntityPrehistoricFloraScorpion(World world) {
		super(world);
		this.enablePersistence();
	}

	public int getAttackLength() {
		return 20;
	}

	public abstract int getAdultAge();

	@Override
	protected void entityInit() {
		super.entityInit();
		this.dataManager.register(BABIES, false);
		this.dataManager.register(ISBABY, false);
	}

	public void writeEntityToNBT(NBTTagCompound compound)
	{
		super.writeEntityToNBT(compound);
		compound.setBoolean("Babies", this.getBabies());
		compound.setBoolean("IsBaby", this.getIsBaby());
	}

	public void readEntityFromNBT(NBTTagCompound compound) {
		super.readEntityFromNBT(compound);
		this.setBabies(compound.getBoolean("Babies"));
		this.setIsBaby(compound.getBoolean("IsBaby"));
	}

	public boolean getBabies() {
		return this.dataManager.get(BABIES);
	}

	public void setBabies(boolean babies) {
		this.dataManager.set(BABIES, babies);
	}

	public boolean getIsBaby() {
		return this.dataManager.get(ISBABY);
	}

	public void setIsBaby(boolean babies) {
		this.dataManager.set(ISBABY, babies);
	}

	@Override
	public IEntityLivingData onInitialSpawn(DifficultyInstance difficulty, @Nullable IEntityLivingData livingdata) {
		livingdata = super.onInitialSpawn(difficulty, livingdata);
		this.setTicks(0);
		this.setAgeTicks(this.getAdultAge());
		if (Math.random() >= 0.8) {
			this.setBabies(true);
		}
		return livingdata;
	}

	@Override
	public boolean dropsEggs() {
		return false;
	}
	
	@Override
	public boolean laysEggs() {
		return false;
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
	protected boolean canDespawn() {
		return false;
	}

	@Override
	protected void applyEntityAttributes() {
		super.applyEntityAttributes();
		this.getAttributeMap().registerAttribute(SharedMonsterAttributes.ATTACK_DAMAGE);
		this.getEntityAttribute(SharedMonsterAttributes.ATTACK_DAMAGE).setBaseValue(2.0D);
		if (getIsBaby()) {
			this.getEntityAttribute(SharedMonsterAttributes.MAX_HEALTH).setBaseValue(4.0D);
		}
		else {
			this.getEntityAttribute(SharedMonsterAttributes.MAX_HEALTH).setBaseValue(6.0D);
		}
		this.getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).setBaseValue(0.185D);
	}

	@Override
	public net.minecraft.util.SoundEvent getAmbientSound() {
		return (net.minecraft.util.SoundEvent) net.minecraft.util.SoundEvent.REGISTRY
				.getObject(new ResourceLocation("lepidodendron:trigonotarbid_idle"));
	}

	@Override
	public net.minecraft.util.SoundEvent getHurtSound(DamageSource ds) {
		return (net.minecraft.util.SoundEvent) net.minecraft.util.SoundEvent.REGISTRY
				.getObject(new ResourceLocation("lepidodendron:trigonotarbid_hurt"));
	}

	@Override
	public net.minecraft.util.SoundEvent getDeathSound() {
		return (net.minecraft.util.SoundEvent) net.minecraft.util.SoundEvent.REGISTRY
				.getObject(new ResourceLocation("lepidodendron:trigonotarbid_death"));
	}

	@Override
	protected float getSoundVolume() {
		return 0.5F;
	}

	@Nullable
	protected ResourceLocation getLootTable() {
		return null;
	}

	public static final PropertyDirection FACING = BlockDirectional.FACING;

	public boolean testLay(World world, BlockPos pos) {
		return false;
	}

	public void launchAttack() {
		IAttributeInstance iattributeinstance = this.getEntityAttribute(SharedMonsterAttributes.ATTACK_DAMAGE);
		if (getAttackTarget() != null) {
			boolean b = this.getAttackTarget().attackEntityFrom(DamageSource.causeMobDamage(this), (float) iattributeinstance.getAttributeValue());
			Entity target = this.getAttackTarget();
			if (target instanceof EntityPlayer) {
				EntityPlayer player = (EntityPlayer) target;
				player.addPotionEffect(new PotionEffect(MobEffects.POISON, (int) 300, (int) 1));
			}
		}
	}

	@Override
	public void onLivingUpdate() {
		super.onLivingUpdate();

		////this.renderYawOffset = this.rotationYaw;
		//if (this.getAnimation() == ATTACK_ANIMATION) {
		//	System.err.println("attack tick " + this.getAnimationTick());
		//}
		if (this.getAnimation() == ATTACK_ANIMATION && this.getAnimationTick() == 13 && this.getAttackTarget() != null) {
			//System.err.println("launch on tick " + this.getAnimationTick());
			launchAttack();

		}

		//Bear eggs perhaps:
		if (!world.isRemote && this.getCanBreed() && (!this.getBabies()) && this.getLaying()) {
			this.setBabies(true);
			this.playSound(SoundEvents.ENTITY_CHICKEN_EGG, 1.0F, (this.rand.nextFloat() - this.rand.nextFloat()) * 0.2F + 1.0F);
			this.setLaying(false);
			this.setTicks(0);
		}

		//AnimationHandler.INSTANCE.updateAnimations(this);

	}

	public void onEntityUpdate() {
		super.onEntityUpdate();
		this.setIsBaby(!(this.getAgeTicks() >= getAdultAge()));
	}

	@Override
	public boolean attackEntityAsMob(Entity entity) {
		//System.err.println("here");
		if (this.getAnimation() == NO_ANIMATION) {
			this.setAnimation(ATTACK_ANIMATION);
			//System.err.println("set attack");
		}
		return false;
	}

}