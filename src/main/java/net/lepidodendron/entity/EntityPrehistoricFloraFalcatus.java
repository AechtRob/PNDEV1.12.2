
package net.lepidodendron.entity;

import com.google.common.base.Predicate;
import net.ilexiconn.llibrary.client.model.tools.ChainBuffer;
import net.ilexiconn.llibrary.server.animation.AnimationHandler;
import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.ai.*;
import net.lepidodendron.entity.base.EntityPrehistoricFloraAgeableFishBase;
import net.minecraft.entity.*;
import net.minecraft.entity.passive.EntityAnimal;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.network.datasync.DataParameter;
import net.minecraft.network.datasync.DataSerializers;
import net.minecraft.network.datasync.EntityDataManager;
import net.minecraft.util.DamageSource;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.DifficultyInstance;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import org.apache.commons.lang3.ArrayUtils;

import javax.annotation.Nullable;

public class EntityPrehistoricFloraFalcatus extends EntityPrehistoricFloraAgeableFishBase {

	public BlockPos currentTarget;
	@SideOnly(Side.CLIENT)
	public ChainBuffer chainBuffer;

	private static final DataParameter<Integer> FALCATUS_TYPE = EntityDataManager.<Integer>createKey(EntityPrehistoricFloraFalcatus.class, DataSerializers.VARINT);

	public EntityPrehistoricFloraFalcatus(World world) {
		super(world);
		setSize(0.2F, 0.25F);
		minWidth = 0.1F;
		maxWidth = 0.2F;
		maxHeight = 0.25F;
		maxHealthAgeable = 7.0D;
	}

	@Override
	protected void entityInit() {
		super.entityInit();
		this.dataManager.register(FALCATUS_TYPE, 0);
	}

	@Override
	public byte breedPNVariantsMatch() {
		return -1;
	}

	@Override
	public boolean canMateWith(EntityAnimal otherAnimal)
	{
		if (otherAnimal == this)
		{
			return false;
		}
		else if (otherAnimal.getClass() != this.getClass())
		{
			return false;
		}
		else {
			switch (this.breedPNVariantsMatch()) {
				case 0: default:
					break;

				case -1:
					if (((EntityPrehistoricFloraFalcatus)otherAnimal).getPNType() == this.getPNType()) {
						return false;
					}
					break;

				case 1:
					if (((EntityPrehistoricFloraFalcatus)otherAnimal).getPNType() != this.getPNType()) {
						return false;
					}
					break;

			}
		}

		return this.isInLove() && otherAnimal.isInLove();
	}

	@Override
	public boolean hasPNVariants() {
		return true;
	}

	public enum Type
	{
		MALE(1, "male"),
		FEMALE(2, "female")
		;

		private final String name;
		private final int metadata;

		Type(int metadataIn, String nameIn)
		{
			this.name = nameIn;
			this.metadata = metadataIn;
		}

		public String getName()
		{
			return this.name;
		}

		public int getMetadata()
		{
			return this.metadata;
		}

		public String toString()
		{
			return this.name;
		}

		public static EntityPrehistoricFloraFalcatus.Type byId(int id)
		{
			if (id < 0 || id >= values().length)
			{
				id = 0;
			}

			return values()[id];
		}

		public static EntityPrehistoricFloraFalcatus.Type getTypeFromString(String nameIn)
		{
			for (int i = 0; i < values().length; ++i)
			{
				if (values()[i].getName().equals(nameIn))
				{
					return values()[i];
				}
			}

			return values()[0];
		}

	}

	@Override
	public IEntityLivingData onInitialSpawn(DifficultyInstance difficulty, @Nullable IEntityLivingData livingdata) {
		livingdata = super.onInitialSpawn(difficulty, livingdata);
		this.setPNType(EntityPrehistoricFloraFalcatus.Type.byId(rand.nextInt(EntityPrehistoricFloraFalcatus.Type.values().length) + 1));
		return livingdata;
	}

	public void setPNType(EntityPrehistoricFloraFalcatus.Type type)
	{
		this.dataManager.set(FALCATUS_TYPE, Integer.valueOf(type.ordinal()));
	}

	public EntityPrehistoricFloraFalcatus.Type getPNType()
	{
		return EntityPrehistoricFloraFalcatus.Type.byId(((Integer)this.dataManager.get(FALCATUS_TYPE)).intValue());
	}

	public void writeEntityToNBT(NBTTagCompound compound) {
		super.writeEntityToNBT(compound);
		compound.setString("PNType", this.getPNType().getName());
	}

	public void readEntityFromNBT(NBTTagCompound compound) {
		super.readEntityFromNBT(compound);
		if (compound.hasKey("PNType", 8))
		{
			this.setPNType(EntityPrehistoricFloraFalcatus.Type.getTypeFromString(compound.getString("PNType")));
		}
	}

	@Nullable
	protected ResourceLocation getLootTable() {
		switch (this.getPNType()) {
			case MALE:
			default:
				return LepidodendronMod.FALCATUS_LOOT;

			case FEMALE:
				return LepidodendronMod.FALCATUS_LOOT_F;
		}
	}

	@Override
	public boolean isSmall() {
		return true;
	}

	public static String getPeriod() {return "Carboniferous";}

	//public static String getHabitat() {return "Aquatic";}

	@Override
	public void playLivingSound() {
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
	} //Only adults!

	@Override
	protected float getAISpeedFish() {
		float AIspeed = 0.324F;
		if (this.getIsFast()) {
			AIspeed = AIspeed * 3F;
		}
		return AIspeed;
	}

	@Override
	protected boolean isSlowAtBottom() {
		return false;
	}

	protected void initEntityAI() {
		tasks.addTask(0, new EntityMateAIAgeableBase(this, 1.0D));
		tasks.addTask(1, new EntityTemptAI(this, 1, false, true, (float) this.getEntityAttribute(SharedMonsterAttributes.ATTACK_DAMAGE).getAttributeValue() * 0.33F));
		tasks.addTask(2, new AttackAI(this, 1.0D, false, this.getAttackLength()));
		tasks.addTask(3, new AgeableFishWander(this, NO_ANIMATION, 1D, 0));
		this.targetTasks.addTask(0, new EatItemsEntityPrehistoricFloraAgeableBaseAI(this, 1));
		//this.targetTasks.addTask(0, new EatItemsEntityPrehistoricFloraAgeableBaseAI(this, 1));
		this.targetTasks.addTask(1, new HuntForDietEntityPrehistoricFloraAgeableBaseAI(this, EntityLivingBase.class, true, (Predicate<Entity>) entity -> entity instanceof EntityLivingBase, this.getEntityBoundingBox().getAverageEdgeLength() * 0.1F, this.getEntityBoundingBox().getAverageEdgeLength() * 1.2F, false));
//		this.targetTasks.addTask(1, new HuntAI(this, EntityPrehistoricFloraFishBase.class, true, (Predicate<Entity>) entity -> entity instanceof EntityLivingBase));
//		this.targetTasks.addTask(1, new HuntAI(this, EntitySquid. class, true, (Predicate<Entity>) entity -> entity instanceof EntityLivingBase));
	}

	@Override
	public String[] getFoodOreDicts() {
		return ArrayUtils.addAll(DietString.FISHFOOD, DietString.FISH);
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
		return EnumCreatureAttribute.UNDEFINED;
	}

	@Override
	protected boolean canDespawn() {
		return false;
	}

	@Override
	protected void applyEntityAttributes() {
		super.applyEntityAttributes();
		this.getAttributeMap().registerAttribute(SharedMonsterAttributes.ATTACK_DAMAGE);
		this.getEntityAttribute(SharedMonsterAttributes.ATTACK_DAMAGE).setBaseValue(2D);
		this.getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).setBaseValue(0.25D);
	}

	@Override
	public SoundEvent getAmbientSound() {
		return (SoundEvent) SoundEvent.REGISTRY.getObject(new ResourceLocation(""));
	}

	@Override
	public SoundEvent getHurtSound(DamageSource ds) {
		return (SoundEvent) SoundEvent.REGISTRY.getObject(new ResourceLocation("entity.generic.hurt"));
	}

	@Override
	public SoundEvent getDeathSound() {
		return (SoundEvent) SoundEvent.REGISTRY.getObject(new ResourceLocation("entity.generic.death"));
	}

	@Override
	protected float getSoundVolume() {
		return 1.0F;
	}

	@Override
	public void onLivingUpdate() {
		super.onLivingUpdate();
		//this.renderYawOffset = this.rotationYaw;

		if (this.getAnimation() == ATTACK_ANIMATION && this.getAnimationTick() == 5 && this.getAttackTarget() != null) {
			launchAttack();
		}

		AnimationHandler.INSTANCE.updateAnimations(this);

	}

	@Override
	public boolean attackEntityAsMob(Entity entity) {
		if (this.getAnimation() == NO_ANIMATION) {
			this.setAnimation(ATTACK_ANIMATION);
			//System.err.println("set attack");
		}
		return false;
	}

	@Override
	public float getAgeScale() {
		return 1;
	}

	public boolean isDirectPathBetweenPoints(Vec3d vec1, Vec3d vec2) {
		RayTraceResult movingobjectposition = this.world.rayTraceBlocks(vec1, new Vec3d(vec2.x, vec2.y, vec2.z), false, true, false);
		return movingobjectposition == null || movingobjectposition.typeOfHit != RayTraceResult.Type.BLOCK;
	}


}