
package net.lepidodendron.entity;

import com.google.common.base.Predicate;
import net.ilexiconn.llibrary.client.model.tools.ChainBuffer;
import net.ilexiconn.llibrary.server.animation.AnimationHandler;
import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.block.base.IAdvancementGranter;
import net.lepidodendron.entity.ai.*;
import net.lepidodendron.entity.base.EntityPrehistoricFloraAgeableBase;
import net.lepidodendron.entity.base.EntityPrehistoricFloraAgeableFishBase;
import net.lepidodendron.entity.base.EntityPrehistoricFloraFishBase;
import net.lepidodendron.entity.render.entity.RenderXinpusaurus;
import net.lepidodendron.entity.render.tile.RenderDisplays;
import net.lepidodendron.entity.util.ITrappableWater;
import net.lepidodendron.util.CustomTrigger;
import net.lepidodendron.util.ModTriggers;
import net.minecraft.client.model.ModelBase;
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

public class EntityPrehistoricFloraXinpusaurus extends EntityPrehistoricFloraAgeableFishBase implements IAdvancementGranter, ITrappableWater {

	public BlockPos currentTarget;
	@SideOnly(Side.CLIENT)
	public ChainBuffer chainBuffer;

	private static final DataParameter<Integer> XINPUSAURUS_TYPE = EntityDataManager.<Integer>createKey(EntityPrehistoricFloraXinpusaurus.class, DataSerializers.VARINT);

	public EntityPrehistoricFloraXinpusaurus(World world) {
		super(world);
		setSize(0.5F, 0.3F);
		minWidth = 0.1F;
		maxWidth = 0.5F;
		maxHeight = 0.3F;
		maxHealthAgeable = 14.0D;
	}

	@Override
	protected void entityInit() {
		super.entityInit();
		this.dataManager.register(XINPUSAURUS_TYPE, 0);
	}

	@Override
	public byte breedPNVariantsMatch() {
		return 0;
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
					if (((EntityPrehistoricFloraXinpusaurus)otherAnimal).getPNType() == this.getPNType()) {
						return false;
					}
					break;

				case 1:
					if (((EntityPrehistoricFloraXinpusaurus)otherAnimal).getPNType() != this.getPNType()) {
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

	@Override
	public String getPNTypeName()
	{
		return this.getPNType().getName();
	}

	@Nullable
	@Override
	public CustomTrigger getModTrigger() {
		return ModTriggers.CLICK_XINPUSAURUS;
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

		public static EntityPrehistoricFloraXinpusaurus.Type byId(int id)
		{
			if (id < 0 || id >= values().length)
			{
				id = 0;
			}

			return values()[id];
		}

		public static EntityPrehistoricFloraXinpusaurus.Type getTypeFromString(String nameIn)
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
		this.setPNType(EntityPrehistoricFloraXinpusaurus.Type.byId(rand.nextInt(EntityPrehistoricFloraXinpusaurus.Type.values().length) + 1));
		return livingdata;
	}

	public void setPNType(EntityPrehistoricFloraXinpusaurus.Type type)
	{
		this.dataManager.set(XINPUSAURUS_TYPE, Integer.valueOf(type.ordinal()));
	}

	public EntityPrehistoricFloraXinpusaurus.Type getPNType()
	{
		return EntityPrehistoricFloraXinpusaurus.Type.byId(((Integer)this.dataManager.get(XINPUSAURUS_TYPE)).intValue());
	}

	public void writeEntityToNBT(NBTTagCompound compound) {
		super.writeEntityToNBT(compound);
		compound.setString("PNType", this.getPNType().getName());
	}

	public void readEntityFromNBT(NBTTagCompound compound) {
		if (this.world != null) {
			super.readEntityFromNBT(compound);
		}
		if (compound.hasKey("PNType", 8))
		{
			this.setPNType(EntityPrehistoricFloraXinpusaurus.Type.getTypeFromString(compound.getString("PNType")));
		}
	}

	@Nullable
	protected ResourceLocation getLootTable() {
		if (!this.isPFAdult()) {
			return LepidodendronMod.XINPUSAURUS_LOOT_YOUNG;
		}
		return LepidodendronMod.XINPUSAURUS_LOOT;
	}

	@Override
	public boolean isSmall() {
		return true;
	}

	public static String getPeriod() {return "Triassic";}

	@Override
	public int airTime() {
		return 10000;
	}

	@Override
	public void playLivingSound() {
	}

	@Override
	public boolean dropsEggs() {
		return false;
	}

	public int getRoarLength() {
		return 15;
	}


	@Override
	public boolean laysEggs() {
		return false;
	}

	@Override
	public boolean divesToLay() {
		return false;
	}

	@Override
	public int getAdultAge() {
		return 76000;
	}

	@Override
	protected float getAISpeedFish() {
		float calcSpeed = 0.11F;
		if (this.isReallyInWater()) {
			calcSpeed = 0.28f;
		}
		if (this.getTicks() < 0) {
			return 0.0F; //Is laying eggs
		}
		return Math.min(1F, (this.getAgeScale() * 2F)) * calcSpeed;
	}

	@Override
	protected boolean isSlowAtBottom() {
		return false;
	}

	protected void initEntityAI() {
		tasks.addTask(0, new EntityMateAI(this, 1.0D));
		tasks.addTask(1, new EntityTemptAI(this, 1, false, true, (float) this.getEntityAttribute(SharedMonsterAttributes.ATTACK_DAMAGE).getAttributeValue()));
		tasks.addTask(2, new AttackAI(this, 1.0D, false, this.getAttackLength()));
		tasks.addTask(3, new AgeableFishWander(this, NO_ANIMATION, 0.2, 5, true, 0));
		tasks.addTask(4, new EntityWatchClosestAI(this, EntityPrehistoricFloraFishBase.class, 8.0F));
		tasks.addTask(5, new EntityLookIdleAI(this));
		this.targetTasks.addTask(0, new EatItemsEntityPrehistoricFloraAgeableBaseAI(this, 1));
		this.targetTasks.addTask(1, new EntityHurtByTargetSmallerThanMeAI(this, false));
		this.targetTasks.addTask(2, new HuntForDietEntityPrehistoricFloraAgeableBaseAI(this, EntityLivingBase.class, true, (Predicate<Entity>) entity -> entity instanceof EntityLivingBase, this.getEntityBoundingBox().getAverageEdgeLength() * 10F, this.getEntityBoundingBox().getAverageEdgeLength() * 1.2F, false));
		//this.targetTasks.addTask(1, new HuntPlayerAlwaysAI(this, EntityPlayer.class, true, (Predicate<Entity>) entity -> entity instanceof EntityLivingBase));
		//this.targetTasks.addTask(3, new HuntAI(this, EntityPlayer.class, true, (Predicate<Entity>) entity -> entity instanceof EntityLivingBase));
		//this.targetTasks.addTask(4, new HuntAI(this, EntityPrehistoricFloraFishBase.class, true, (Predicate<Entity>) entity -> entity instanceof EntityLivingBase));
		//this.targetTasks.addTask(4, new HuntSmallerThanMeAIAgeable(this, EntityPrehistoricFloraAgeableFishBase.class, true, (Predicate<Entity>) entity -> entity instanceof EntityLivingBase, 0.2));
		//this.targetTasks.addTask(4, new HuntSmallerThanMeAIAgeable(this, EntityPrehistoricFloraAmphibianBase.class, true, (Predicate<Entity>) entity -> entity instanceof EntityLivingBase, 0.2));
		//this.targetTasks.addTask(4, new HuntSmallerThanMeAIAgeable(this, EntityPrehistoricFloraAgeableBase.class, true, (Predicate<Entity>) entity -> entity instanceof EntityLivingBase, 0.2));
		//this.targetTasks.addTask(4, new HuntSmallerThanMeAIAgeable(this, EntityLiving.class, true, (Predicate<Entity>) entity -> entity instanceof EntityLivingBase, 0.2));
		//this.targetTasks.addTask(5, new HuntAI(this, EntitySquid.class, true, (Predicate<Entity>) entity -> entity instanceof EntityLivingBase));
		//this.targetTasks.addTask(6, new HuntSmallerThanMeAIAgeable(this, EntityLivingBase.class, true, (Predicate<Entity>) entity -> entity instanceof EntityLivingBase, 0.2));
	}

	@Override
	public String[] getFoodOreDicts() {
		return ArrayUtils.addAll(DietString.SHELLFISH);
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
		this.getEntityAttribute(SharedMonsterAttributes.ATTACK_DAMAGE).setBaseValue(3D);
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
	public void onEntityUpdate() {
		super.onEntityUpdate();
	}

	@Override
	public boolean attackEntityAsMob(Entity entity) {
		if (this.getAnimation() == NO_ANIMATION) {
			this.setAnimation(ATTACK_ANIMATION);
			//System.err.println("set attack");
		}
		return false;
	}

	public boolean isDirectPathBetweenPoints(Vec3d vec1, Vec3d vec2) {
		RayTraceResult movingobjectposition = this.world.rayTraceBlocks(vec1, new Vec3d(vec2.x, vec2.y, vec2.z), false, true, false);
		return movingobjectposition == null || movingobjectposition.typeOfHit != RayTraceResult.Type.BLOCK;
	}

	@Override
	public EntityPrehistoricFloraAgeableBase createPFChild(EntityPrehistoricFloraAgeableBase entity) {
		EntityPrehistoricFloraXinpusaurus entityOut = new EntityPrehistoricFloraXinpusaurus(this.world);
		entityOut.setPNType(Type.MALE);
		if (this.rand.nextInt(2) == 0) {
			entityOut.setPNType(Type.FEMALE);
		}
		return entityOut;
	}

	//Rendering taxidermy:
	//--------------------
	public static double offsetWall(@Nullable String variant) {
		return 0.05;
	}
	public static double upperfrontverticallinedepth(@Nullable String variant) {
		return 0.9;
	}
	public static double upperbackverticallinedepth(@Nullable String variant) {
		return 0.8;
	}
	public static double upperfrontlineoffset(@Nullable String variant) {
		return 0.2;
	}
	public static double upperfrontlineoffsetperpendiular(@Nullable String variant) {
		return -0.04F;
	}
	public static double upperbacklineoffset(@Nullable String variant) {
		return 0.2;
	}
	public static double upperbacklineoffsetperpendiular(@Nullable String variant) {
		return -0.04F;
	}
	public static double lowerfrontverticallinedepth(@Nullable String variant) {
		return 1.1;
	}
	public static double lowerbackverticallinedepth(@Nullable String variant) {
		return 1.2;
	}
	public static double lowerfrontlineoffset(@Nullable String variant) {
		return 0.2;
	}
	public static double lowerfrontlineoffsetperpendiular(@Nullable String variant) {
		return -0.04F;
	}
	public static double lowerbacklineoffset(@Nullable String variant) {
		return 0.2;
	}
	public static double lowerbacklineoffsetperpendiular(@Nullable String variant) {
		return -0.04F;
	}
	@SideOnly(Side.CLIENT)
	public static ResourceLocation textureDisplay(@Nullable String variant) {
		if (variant.equalsIgnoreCase("female")) {
			return RenderXinpusaurus.TEXTURE_F;
		}
		return RenderXinpusaurus.TEXTURE;
	}
	@SideOnly(Side.CLIENT)
	public static ModelBase modelDisplay(@Nullable String variant) {
		return RenderDisplays.modelXinpusaurus;
	}
	public static float getScaler(@Nullable String variant) {
		if (variant.equalsIgnoreCase("female")) {
			return RenderXinpusaurus.getScaler() * (0.85F/0.7F);
		}
		return RenderXinpusaurus.getScaler();
	}

}

