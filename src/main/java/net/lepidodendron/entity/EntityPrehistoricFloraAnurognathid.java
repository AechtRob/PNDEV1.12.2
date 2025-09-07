
package net.lepidodendron.entity;

import com.google.common.base.Predicate;
import net.ilexiconn.llibrary.server.animation.AnimationHandler;
import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.block.base.IAdvancementGranter;
import net.lepidodendron.entity.ai.*;
import net.lepidodendron.entity.base.EntityPrehistoricFloraLandClimbingFlyingBase;
import net.lepidodendron.entity.render.entity.RenderAnurognathid;
import net.lepidodendron.entity.render.tile.RenderDisplays;
import net.lepidodendron.entity.util.IScreamerFlier;
import net.lepidodendron.entity.util.ITrappableLand;
import net.lepidodendron.item.entities.spawneggs.*;
import net.lepidodendron.util.CustomTrigger;
import net.lepidodendron.util.ModTriggers;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.BlockFaceShape;
import net.minecraft.client.model.ModelBase;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.IEntityLivingData;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.EntityAISwimming;
import net.minecraft.entity.passive.EntityAnimal;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.network.datasync.DataParameter;
import net.minecraft.network.datasync.DataSerializers;
import net.minecraft.network.datasync.EntityDataManager;
import net.minecraft.util.DamageSource;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.util.text.translation.I18n;
import net.minecraft.world.DifficultyInstance;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import org.apache.commons.lang3.ArrayUtils;

import javax.annotation.Nullable;
import java.util.List;

public class EntityPrehistoricFloraAnurognathid extends EntityPrehistoricFloraLandClimbingFlyingBase implements IAdvancementGranter, IScreamerFlier, ITrappableLand {

	private boolean screaming;
	public int screamAlarmCooldown;

	private static final float[] ANUROGNTHUS_SIZE = new float[]{0.40F, 0.25F};
	private static final float[] BATRACHOGNATHUS_SIZE = new float[]{0.60F, 0.33F};
	private static final float[] CASCOCAUDA_SIZE = new float[]{0.50F, 0.29F};
	private static final float[] DENDRORHYNCHOIDES_SIZE = new float[]{0.45F, 0.275F};
	private static final float[] JEHOLOPTERUS_SIZE = new float[]{0.90F, 0.4F};
	private static final float[] SINOMACROPS_SIZE = new float[]{0.40F, 0.25F};
	private static final float[] VESPEROPTERYLUS_SIZE = new float[]{0.40F, 0.25F};

	private static final DataParameter<Integer> CREATURE_TYPE = EntityDataManager.<Integer>createKey(EntityPrehistoricFloraAnurognathid.class, DataSerializers.VARINT);

	public EntityPrehistoricFloraAnurognathid(World world) {
		super(world);

	//*****************************************************
	//Insect variant managers:

		setSize(getHitBoxSize()[0], getHitBoxSize()[1]);
		minWidth = 0.10F;
		maxWidth = getHitBoxSize()[0];
		maxHeight = getHitBoxSize()[1];
		maxHealthAgeable = 6.0D;
		setNoAI(!true);
		enablePersistence();
	}

	@Override
	public boolean checkFlyConditions() {
		return !this.world.isDaytime();
	}

	@Override
	public boolean hasAlarm() {
		return true;
	}

	@Override
	public boolean attackEntityFrom(DamageSource ds, float i) {
		boolean dsCheck = super.attackEntityFrom(ds, i);
		if (dsCheck != false) {
			Entity e = ds.getTrueSource();
			if (e instanceof EntityLivingBase && this.hasAlarm()) {
				EntityLivingBase ee = (EntityLivingBase) e;
				this.setAlarmTarget(ee);
				List<EntityPrehistoricFloraAnurognathid> anurognathid = this.world.getEntitiesWithinAABB(EntityPrehistoricFloraAnurognathid.class, new AxisAlignedBB(this.getPosition().add(-8, -4, -8), this.getPosition().add(8, 4, 8)));
				for (EntityPrehistoricFloraAnurognathid currentAnurognathid : anurognathid) {
					if (currentAnurognathid.getPNType() == this.getPNType()) {
						currentAnurognathid.setAnimation(NO_ANIMATION);
						currentAnurognathid.setAlarmTarget(ee);
						currentAnurognathid.setRevengeTarget(ee);
						currentAnurognathid.screamAlarmCooldown = rand.nextInt(20);
						currentAnurognathid.setFlying();
					}
				}
			}
		}
		return dsCheck;
	}

	public void setScreaming(boolean screaming) {
		this.screaming = screaming;
	}

	public boolean getScreaming() {
		return this.screaming;
	}

	@Override
	public float getAgeScale() {
		return 1F;
	}

	@Override
	public float getClimbSpeed() {
		switch (this.getPNType()) {
			case ANUROGNTHUS:
			default:
				return 0.0035F;

			case BATRACHOGNATHUS:
				return 0.0045F;

			case CASCOCAUDA:
				return 0.0080F;

			case DENDRORHYNCHOIDES:
				return 0.0065F;

			case JEHOLOPTERUS:
				return 0.0065F;

			case SINOMACROPS:
				return 0.0035F;
		}

		//return 0.01F;
	}

	@Override
	public ResourceLocation FlightSound() {
		return null;
		//return new ResourceLocation("lepidodendron:anurognathid_flight");
	}

	@Override
	public byte breedPNVariantsMatch() {
		return 1;
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
					if (((EntityPrehistoricFloraAnurognathid)otherAnimal).getPNType() == this.getPNType()) {
						return false;
					}
					break;

				case 1:
					if (((EntityPrehistoricFloraAnurognathid)otherAnimal).getPNType() != this.getPNType()) {
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
		switch (this.getPNType()) {
			case ANUROGNTHUS: default:
				return ModTriggers.CLICK_ANUROGNATHUS;

			case BATRACHOGNATHUS:
				return ModTriggers.CLICK_BATRACHOGNATHUS;

			case CASCOCAUDA:
				return ModTriggers.CLICK_CASCOCAUDA;

			case DENDRORHYNCHOIDES:
				return ModTriggers.CLICK_DENDRORHYNCHOIDES;

			case JEHOLOPTERUS:
				return ModTriggers.CLICK_JEHOLOPTERUS;

			case SINOMACROPS:
				return ModTriggers.CLICK_SINOMACROPS;
			case VESPEROPTERYLUS:
				return ModTriggers.CLICK_VESPEROPTERYLUS;

		}
	}

	public enum Type
	{
		ANUROGNTHUS(1, "anurognathus"),
		BATRACHOGNATHUS(2, "batrachognathus"),
		CASCOCAUDA(3, "cascocauda"),
		DENDRORHYNCHOIDES(4, "dendrorhynchoides"),
		JEHOLOPTERUS(5, "jeholopterus"),
		SINOMACROPS(6, "sinomacrops"),
		VESPEROPTERYLUS(7, "vesperopterylus")
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

		public static Type byId(int id)
		{
			if (id < 0 || id >= values().length)
			{
				id = 0;
			}

			return values()[id];
		}

		public static Type getTypeFromString(String nameIn)
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


	public ResourceLocation getStandardLoot() {
		if (!this.isPFAdult()) {
			return null;
		}
		switch (this.getPNType()) {
			case ANUROGNTHUS: default:
				return LepidodendronMod.AGNURONATHID_ANUROGNATHUS_LOOT;

			case BATRACHOGNATHUS:
				return LepidodendronMod.AGNURONATHID_BATRACHOGNATHUS_LOOT;

			case CASCOCAUDA:
				return LepidodendronMod.AGNURONATHID_CASCOCAUDA_LOOT;

			case DENDRORHYNCHOIDES:
				return LepidodendronMod.AGNURONATHID_DENDRORHYNCHOIDES_LOOT;

			case JEHOLOPTERUS:
				return LepidodendronMod.AGNURONATHID_JEHOLOPTERUS_LOOT;

			case SINOMACROPS:
				return LepidodendronMod.AGNURONATHID_SINOMACROPS_LOOT;
			case VESPEROPTERYLUS:
				return LepidodendronMod.VESPEROPTERYLUS_LOOT;
		}
	}

	public float getFlySpeed() {
		switch (this.getPNType()) {
			case ANUROGNTHUS: default:
				return 1.6f;

			case BATRACHOGNATHUS:
				return 1.5f;

			case CASCOCAUDA:
				return 1.6f;

			case DENDRORHYNCHOIDES:
				return 1.6f;

			case JEHOLOPTERUS:
				return 2.2f;

			case SINOMACROPS:
				return 1.6f;
			case VESPEROPTERYLUS:
				return 1.6f;


		}
	}

	public float[] getHitBoxSize() {
		switch (this.getPNType()) {
			case ANUROGNTHUS: default:
				return ANUROGNTHUS_SIZE;

			case BATRACHOGNATHUS:
				return BATRACHOGNATHUS_SIZE;

			case CASCOCAUDA:
				return CASCOCAUDA_SIZE;

			case DENDRORHYNCHOIDES:
				return DENDRORHYNCHOIDES_SIZE;

			case JEHOLOPTERUS:
				return JEHOLOPTERUS_SIZE;

			case SINOMACROPS:
				return SINOMACROPS_SIZE;
			case VESPEROPTERYLUS:
				return VESPEROPTERYLUS_SIZE;

		}
	}

	@Nullable
	protected ResourceLocation getLootTable() {
		return getStandardLoot();
	}

	@Override
	protected void entityInit() {
		super.entityInit();
		this.dataManager.register(CREATURE_TYPE, 0);
	}

	@Override
	public int getAdultAge() {
		return 0;
	}

	@Override
	public IEntityLivingData onInitialSpawn(DifficultyInstance difficulty, @Nullable IEntityLivingData livingdata) {
		livingdata = super.onInitialSpawn(difficulty, livingdata);
		this.setPNType(Type.byId(rand.nextInt(Type.values().length) + 1));
		return livingdata;
	}

	@Override
	public float getMaxWidth() {
		Type type = Type.ANUROGNTHUS;
		try {
			type = this.getPNType();
		}
		catch (NullPointerException e) {
			return ANUROGNTHUS_SIZE[0];
		}
		switch (type) {
			case ANUROGNTHUS: default:
				return ANUROGNTHUS_SIZE[0];

			case BATRACHOGNATHUS:
				return BATRACHOGNATHUS_SIZE[0];

			case CASCOCAUDA:
				return CASCOCAUDA_SIZE[0];

			case DENDRORHYNCHOIDES:
				return DENDRORHYNCHOIDES_SIZE[0];

			case JEHOLOPTERUS:
				return JEHOLOPTERUS_SIZE[0];

			case SINOMACROPS:
				return SINOMACROPS_SIZE[0];
			case VESPEROPTERYLUS:
				return VESPEROPTERYLUS_SIZE[0];

		}
	}

	@Override
	public float getMaxHeight() {
		Type type = Type.ANUROGNTHUS;
		try {
			type = this.getPNType();
		}
		catch (NullPointerException e) {
			return ANUROGNTHUS_SIZE[1];
		}
		switch (this.getPNType()) {
			case ANUROGNTHUS: default:
				return ANUROGNTHUS_SIZE[1];

			case BATRACHOGNATHUS:
				return BATRACHOGNATHUS_SIZE[1];

			case CASCOCAUDA:
				return CASCOCAUDA_SIZE[1];

			case DENDRORHYNCHOIDES:
				return DENDRORHYNCHOIDES_SIZE[1];

			case JEHOLOPTERUS:
				return JEHOLOPTERUS_SIZE[1];

			case SINOMACROPS:
				return SINOMACROPS_SIZE[1];
			case VESPEROPTERYLUS:
				return VESPEROPTERYLUS_SIZE[1];

		}
	}

	@Override
	public void onLivingUpdate() {
		super.onLivingUpdate();
		this.setSizer(this.getHitBoxSize()[0], this.getHitBoxSize()[1]);

		if (this.getAnimation() == ATTACK_ANIMATION && this.getAnimationTick() == 8 && this.getAttackTarget() != null) {
			launchAttack();
		}

//		//System.err.println("this.getMateable() " + this.getMateable() + " inPFLove " + this.inPFLove);
//		if (this.getAnimation() == this.ROAR_ANIMATION) {
//			System.err.println("Tick: " + this.getAnimationTick());
//		}

		AnimationHandler.INSTANCE.updateAnimations(this);

	}

	@Override
	public ItemStack getPickedResult(RayTraceResult target)
	{
		if (target.entityHit instanceof EntityPrehistoricFloraAnurognathid) {
			EntityPrehistoricFloraAnurognathid anurognathid = (EntityPrehistoricFloraAnurognathid) target.entityHit;
			switch (anurognathid.getPNType()) {
				case ANUROGNTHUS: default:
					return new ItemStack(ItemSpawnEggAnurognathidAnurognathus.block, 1);

				case BATRACHOGNATHUS:
					return new ItemStack(ItemSpawnEggAnurognathidBatrachognathus.block, 1);

				case CASCOCAUDA:
					return new ItemStack(ItemSpawnEggAnurognathidCascocauda.block, 1);

				case DENDRORHYNCHOIDES:
					return new ItemStack(ItemSpawnEggAnurognathidDendrorhynchoides.block, 1);

				case JEHOLOPTERUS:
					return new ItemStack(ItemSpawnEggAnurognathidJeholopterus.block, 1);

				case SINOMACROPS:
					return new ItemStack(ItemSpawnEggAnurognathidSinomacrops.block, 1);
				case VESPEROPTERYLUS:
					return new ItemStack(ItemSpawnEggAnurognathidVesperopterylus.block, 1);


			}
		}
		return ItemStack.EMPTY;
	}

	@Override
	public String getName() {
		if (this.hasCustomName())
		{
			return this.getCustomNameTag();
		}
		else
		{
			return I18n.translateToLocal("entity.prehistoric_flora_anurognathid_" + this.getPNType().getName() + ".name");
		}
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
			this.setPNType(Type.getTypeFromString(compound.getString("PNType")));
		}
	}

	public void setPNType(Type type)
	{
		this.dataManager.set(CREATURE_TYPE, Integer.valueOf(type.ordinal()));
	}

	public Type getPNType()
	{
		return Type.byId(((Integer)this.dataManager.get(CREATURE_TYPE)).intValue());
	}

	//*****************************************************

	@Override
	public boolean canJar() {
		return false;
	}

	public static String getPeriod() {return "Jurassic";}

	//public static String getHabitat() {return "Terrestrial";}

	@Override
	public boolean dropsEggs() {
		return false;
	}

	@Override
	public boolean laysEggs() {
		return true;
	}

	@Override
	public boolean placesNest() {
		return true;
	}

	@Override
	public boolean hasNest() {
		return true;
	}

	public boolean testLay(World world, BlockPos pos) {
		return (
				nestBlockMatch(world, pos)
		);
	}

	@Override
	public boolean nestBlockMatch(World world, BlockPos pos) {
		if (isLayableNest(world, pos)) {
			return true;
		}
		if (world.isAirBlock(pos) && world.getBlockState(pos.down()).getMaterial() == Material.LEAVES) {
			return world.getBlockState(pos.down()).getBlockFaceShape(world, pos.down(), EnumFacing.UP) == BlockFaceShape.SOLID;
		}
		return false;
	}

	@Override
	public boolean canSpawnOnLeaves() {
		return true;
	}

	@Override
	public float getAISpeedLand() {
		if (this.getTicks() < 0) {
			return 0.0F; //Is laying eggs
		}
		return getFlySpeed();
	}

	@Override
	public boolean isAIDisabled() {
		return false;
	}

	@Override
	protected void applyEntityAttributes() {
		super.applyEntityAttributes();
		this.getAttributeMap().registerAttribute(SharedMonsterAttributes.ATTACK_DAMAGE);
		this.getEntityAttribute(SharedMonsterAttributes.ATTACK_DAMAGE).setBaseValue(2.0D);
		this.getEntityAttribute(SharedMonsterAttributes.MAX_HEALTH).setBaseValue(Math.floor(this.getHitBoxSize()[0] * 15F));
		//this.getEntityAttribute(SharedMonsterAttributes.MAX_HEALTH).setBaseValue(5.0D);
		this.getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).setBaseValue(0.25D);
	}

	@Override
	public String getTexture() {
		return this.getTexture();
	}

	@Override
	public int getRoarLength() {
		return 12;
	}

	@Override
	public int getAttackLength() {
		return 12;
	}

	@Override
	public void playLivingSound() {
		if (this.getAnimation() == NO_ANIMATION && ((this.getAttachmentPos() != null && this.checkFlyConditions())
				|| this.getAttachmentPos() == null)) {
			if (!this.world.isRemote) {
				this.setAnimation(ROAR_ANIMATION);
				SoundEvent soundevent = this.getAmbientSound();
				if (soundevent != null)
				{
					this.playSound(soundevent, this.getSoundVolume(), this.getSoundPitch());
				}
			}
		}
	}

	@Override
	public SoundEvent getAmbientSound() {
		return (SoundEvent) SoundEvent.REGISTRY.getObject(new ResourceLocation("lepidodendron:anurognathid_idle"));
	}

	@Override
	public SoundEvent getHurtSound(DamageSource ds) {
		return (SoundEvent) SoundEvent.REGISTRY.getObject(new ResourceLocation("lepidodendron:anurognathid_hurt"));
	}

	@Override
	public SoundEvent getDeathSound() {
		return (SoundEvent) SoundEvent.REGISTRY.getObject(new ResourceLocation("lepidodendron:anurognathid_death"));
	}

	public SoundEvent getAlarmSound() {
		return (SoundEvent) SoundEvent.REGISTRY
				.getObject(new ResourceLocation("lepidodendron:anurognathid_alarm"));
	}

	public void playAlarmSound()
	{
		SoundEvent soundevent = this.getAlarmSound();
		//System.err.println("looking for alarm sound");
		if (soundevent != null)
		{
			//System.err.println("playing alarm sound");
			this.playSound(soundevent, this.getSoundVolume(), this.getSoundPitch());
			this.screamAlarmCooldown = 25;
		}
	}

	@Override
	protected float getSoundVolume() {
		return 1.0F;
	}

	@Override
	public String[] getFoodOreDicts() {
		return ArrayUtils.addAll(DietString.BUG);
	}

	protected void initEntityAI() {
		tasks.addTask(0, new EntityMateAIAgeableBase(this, 1.0D));
		tasks.addTask(1, new EntityAISwimming(this));
		tasks.addTask(2, new AttackAI(this, 1.0D, false, this.getAttackLength()));
		tasks.addTask(3, new PanicScreamAI(this, 1.0F));
		tasks.addTask(4, new LandWanderNestInBlockAI(this));
		tasks.addTask(5, new LandClimbingFlyingBaseWanderFlightAI(this));
		tasks.addTask(6, new EntityLookIdleAI(this));
		this.targetTasks.addTask(0, new EatItemsEntityPrehistoricFloraAgeableBaseAI(this, 1));
		this.targetTasks.addTask(1, new HuntForDietEntityPrehistoricFloraAgeableBaseAI(this, EntityLivingBase.class, true, (Predicate<Entity>) entity -> entity instanceof EntityLivingBase, 0.1F, 1.2F, false));
	}

	@Override
	public AxisAlignedBB getAttackBoundingBox() {
		return this.getEntityBoundingBox().grow(0.5F, 2.0F, 0.5F);
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
	public void onEntityUpdate() {
		if (this.screamAlarmCooldown > 0) {
			this.screamAlarmCooldown -= 1;
		}
		if (this.getScreaming() && screamAlarmCooldown <= 0) {
			this.playAlarmSound();
		}

		super.onEntityUpdate();
	}


	@Override
	public int getEggType(@Nullable String variantIn) { //0-3
		return 0; //Small eggs
	}

	//Rendering taxidermy:
	//--------------------

	public static double offsetWall(@Nullable String variant) {
		switch (EntityPrehistoricFloraAnurognathid.Type.getTypeFromString(variant)) {
			case ANUROGNTHUS: default:
				return 0.01;

			case BATRACHOGNATHUS:
				return 0.01;

			case CASCOCAUDA:
				return 0.01;

			case DENDRORHYNCHOIDES:
				return 0.01;

			case JEHOLOPTERUS:
				return 0.01;

			case SINOMACROPS:
				return 0.01;
			case VESPEROPTERYLUS:
				return 0.01;

		}
	}

	public static double upperfrontverticallinedepth(@Nullable String variant) {
		return 0.95;
	}
	public static double upperbackverticallinedepth(@Nullable String variant) {
		return 0;
	}
	public static double upperfrontlineoffset(@Nullable String variant) {
		return 0;
	}
	public static double upperfrontlineoffsetperpendiular(@Nullable String variant) {
		return -0.05F;
	}
	public static double upperbacklineoffset(@Nullable String variant) {
		return 0.4;
	}
	public static double upperbacklineoffsetperpendiular(@Nullable String variant) {
		return -0.F;
	}
	public static double lowerfrontverticallinedepth(@Nullable String variant) {
		return 0;
	}
	public static double lowerbackverticallinedepth(@Nullable String variant) {
		return 1.2;
	}
	public static double lowerfrontlineoffset(@Nullable String variant) {
		return 0;
	}
	public static double lowerfrontlineoffsetperpendiular(@Nullable String variant) {
		return -0.F;
	}
	public static double lowerbacklineoffset(@Nullable String variant) {
		return -0.0;
	}
	public static double lowerbacklineoffsetperpendiular(@Nullable String variant) {
		return 0F;
	}

	public static float widthSupport(@Nullable String variant) {return 0.03F;}

	@SideOnly(Side.CLIENT)
	public static ResourceLocation textureDisplay(@Nullable String variant) {
		switch (EntityPrehistoricFloraAnurognathid.Type.getTypeFromString(variant)) {
			case ANUROGNTHUS:
			default:
				return RenderAnurognathid.TEXTURE_ANUROGNATHUS;

			case BATRACHOGNATHUS:
				return RenderAnurognathid.TEXTURE_BATRACHOGNATHUS;

			case CASCOCAUDA:
				return RenderAnurognathid.TEXTURE_CASCOCAUDA;

			case DENDRORHYNCHOIDES:
				return RenderAnurognathid.TEXTURE_DENDRORHYNCHOIDES;

			case JEHOLOPTERUS:
				return RenderAnurognathid.TEXTURE_JEHOLOPTERUS;

			case SINOMACROPS:
				return RenderAnurognathid.TEXTURE_SINOMACROPS;
			case VESPEROPTERYLUS:
				return RenderAnurognathid.TEXTURE_VESPEROPTERYLUS;

		}
	}

	@SideOnly(Side.CLIENT)
	public static ModelBase modelDisplay(@Nullable String variant) {
		switch (EntityPrehistoricFloraAnurognathid.Type.getTypeFromString(variant)) {
			case ANUROGNTHUS:
			default:
				return RenderDisplays.modelAnurognathus;

			case BATRACHOGNATHUS:
				return RenderDisplays.modelBatrachognathus;

			case CASCOCAUDA:
				return RenderDisplays.modelCascocauda;

			case DENDRORHYNCHOIDES:
				return RenderDisplays.modelDendrorhynchoides;

			case JEHOLOPTERUS:
				return RenderDisplays.modelJeholopterus;

			case SINOMACROPS:
				return RenderDisplays.modelSinomacrops;

		}
	}

	public static float getScaler(@Nullable String variant) {
		return RenderAnurognathid.getScaler(EntityPrehistoricFloraAnurognathid.Type.getTypeFromString(variant));
	}

}