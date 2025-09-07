
package net.lepidodendron.entity;

import com.google.common.base.Predicate;
import net.ilexiconn.llibrary.client.model.tools.ChainBuffer;
import net.ilexiconn.llibrary.server.animation.Animation;
import net.ilexiconn.llibrary.server.animation.AnimationHandler;
import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.block.base.IAdvancementGranter;
import net.lepidodendron.entity.ai.*;
import net.lepidodendron.entity.base.EntityPrehistoricFloraSwimmingBottomWalkingWaterBase;
import net.lepidodendron.entity.render.entity.RenderPygocephalomorpha;
import net.lepidodendron.entity.render.tile.RenderDisplays;
import net.lepidodendron.entity.util.ITrappableWater;
import net.lepidodendron.item.entities.ItemUnknownEgg;
import net.lepidodendron.item.entities.spawneggs.ItemSpawnEggPygocephalomorphaTealliocaris;
import net.lepidodendron.util.CustomTrigger;
import net.lepidodendron.util.ModTriggers;
import net.minecraft.client.model.ModelBase;
import net.minecraft.entity.*;
import net.minecraft.entity.passive.EntityAnimal;
import net.minecraft.item.ItemStack;
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
import net.minecraft.util.text.translation.I18n;
import net.minecraft.world.DifficultyInstance;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.FMLCommonHandler;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import org.apache.commons.lang3.ArrayUtils;

import javax.annotation.Nullable;

public class EntityPrehistoricFloraPygocephalomorpha extends EntityPrehistoricFloraSwimmingBottomWalkingWaterBase implements IAdvancementGranter, ITrappableWater {

	public Animation SWIM_ANIMATION;
	public Animation UNSWIM_ANIMATION;
	public BlockPos currentTarget;
	@SideOnly(Side.CLIENT)
	public ChainBuffer tailBuffer;
	@SideOnly(Side.CLIENT)
	public ChainBuffer chainBuffer;

	private static final DataParameter<Boolean> SWIMMINGPN = EntityDataManager.createKey(EntityPrehistoricFloraPygocephalomorpha.class, DataSerializers.BOOLEAN);
	//Needs to be here because it is not loaded in time to be accessed by the client if it's on the parent class!

	private static final float[] TEALLIOCARIS_SIZE = new float[]{0.2F, 0.1F};
	private static final float[] MAMAYOCARIS_SIZE = new float[]{0.2F, 0.1F};
	private static final float[] LAEVITEALLIOCARIS_SIZE = new float[]{0.2F, 0.1F};
	private static final float[] NOTOCARIS_SIZE = new float[]{0.2F, 0.1F};
	private static final float[] IRATICARIS_SIZE = new float[]{0.2F, 0.1F};
	private static final float[] TYLOCARIS_SIZE = new float[]{0.2F, 0.1F};
	private static final float[] FUJIANOCARIS_SIZE = new float[]{0.2F, 0.1F};


	private static final DataParameter<Integer> VAR_TYPE = EntityDataManager.<Integer>createKey(EntityPrehistoricFloraPygocephalomorpha.class, DataSerializers.VARINT);

	public EntityPrehistoricFloraPygocephalomorpha(World world) {
		super(world);
		setSize(0.1f, 0.1f);
		minWidth = 0.1F;
		maxWidth = getHitBoxSize()[0];
		maxHeight = getHitBoxSize()[1];
		maxHealthAgeable = 3.0D;
		SWIM_ANIMATION = Animation.create(this.swimTransitionLength());
		UNSWIM_ANIMATION = Animation.create(this.unswimTransitionLength());
		if (FMLCommonHandler.instance().getSide().isClient()) {
			tailBuffer = new ChainBuffer();
		}
	}
	public static String getHabitat() {
		return I18n.translateToLocal("helper.pf_aquatic.name");
	}

	public ItemStack getPropagule() {
		ItemStack stack = new ItemStack(ItemUnknownEgg.block, (int) (1));
		if (!stack.hasTagCompound()) {
			NBTTagCompound compound = new NBTTagCompound();
			stack.setTagCompound(compound);
		}
		stack.getTagCompound().setString("PNType", this.getPNType().getName());
		return stack;
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
					if (((EntityPrehistoricFloraPygocephalomorpha)otherAnimal).getPNType() == this.getPNType()) {
						return false;
					}
					break;

				case 1:
					if (((EntityPrehistoricFloraPygocephalomorpha)otherAnimal).getPNType() != this.getPNType()) {
						return false;
					}
					break;

			}
		}

		return this.isInLove() && otherAnimal.isInLove();
	}

	public ResourceLocation getStandardLoot() {
		switch (this.getPNType()) {
			case TEALLIOCARIS: default:
				return LepidodendronMod.TEALLIOCARIS_LOOT;

//			case MAMAYOCARIS:
//				return LepidodendronMod.MAMAYOCARIS_LOOT;
//
//			case TYLOCARIS:
//				return LepidodendronMod.TYLOCARIS_LOOT;
//
//			case FUJIANOCARIS:
//				return LepidodendronMod.FUJIANOCARIS_LOOT;
//
//			case LAEVITEALLIOCARIS:
//				return LepidodendronMod.LAEVITEALLIOCARIS_LOOT;
//
//			case IRATICARIS:
//				return LepidodendronMod.IRATICARIS_LOOT;
//
//			case NOTOCARIS:
//				return LepidodendronMod.NOTOCARAIS_LOOT;

		}
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
			case TEALLIOCARIS: default:
				return ModTriggers.CLICK_TEALLIOCARIS;

//			case MAMAYOCARIS:
//				return ModTriggers.CLICK_MAMAYOCARIS;
//
//			case TYLOCARIS:
//				return ModTriggers.CLICK_TYLOCARIS;
//
//			case FUJIANOCARIS:
//				return ModTriggers.CLICK_FUJIANOCARIS;
//
//			case LAEVITEALLIOCARIS:
//				return ModTriggers.CLICK_LAEVITEALLIOCARIS;
//
//			case IRATICARIS:
//				return ModTriggers.CLICK_IRATICARIS;
//
//			case NOTOCARIS:
//				return ModTriggers.CLICK_NOTOCARIS;

		}
	}
	public enum Type
	{
		TEALLIOCARIS(1, "tealliocaris"),
//		MAMAYOCARIS(2, "mamayocaris"),
//		TYLOCARIS(3, "tylocaris"),
//		FUJIANOCARIS(4, "fujianocaris"),
//		LAEVITEALLIOCARIS(5, "laevitealliocaris"),
//		IRATICARIS(6, "iraticaris"),
//		NOTOCARIS(7, "notocaris"),
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

		public static EntityPrehistoricFloraPygocephalomorpha.Type byId(int id)
		{
			if (id < 0 || id >= values().length)
			{
				id = 0;
			}

			return values()[id];
		}

		public static EntityPrehistoricFloraPygocephalomorpha.Type getTypeFromString(String nameIn)
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

	public float[] getHitBoxSize() {
		switch (this.getPNType()) {
			case TEALLIOCARIS: default:
				return TEALLIOCARIS_SIZE;

//			case MAMAYOCARIS:
//				return MAMAYOCARIS_SIZE;
//
//			case TYLOCARIS:
//				return TYLOCARIS_SIZE;
//
//			case FUJIANOCARIS:
//				return FUJIANOCARIS_SIZE;
//
//			case LAEVITEALLIOCARIS:
//				return LAEVITEALLIOCARIS_SIZE;
//
//			case IRATICARIS:
//				return IRATICARIS_SIZE;
//
//			case NOTOCARIS:
//				return NOTOCARIS_SIZE;
		}
	}
	

	@Override
	protected double getAISpeedSwim() {
		switch (this.getPNType()) {
			case TEALLIOCARIS: default:
				return 0.1f;

//			case MAMAYOCARIS:
//				return 0.1f;
//
//			case TYLOCARIS:
//				return 0.1f;
//
//			case FUJIANOCARIS:
//				return 0.1f;
//
//			case LAEVITEALLIOCARIS:
//				return 0.1f;
//
//			case IRATICARIS:
//				return 0.1f;
//
//			case NOTOCARIS:
//				return 0.1f;
		}
	}


	//an array of all the animations
	@Override
	public Animation[] getAnimations() {
		return new Animation[]{ATTACK_ANIMATION, ROAR_ANIMATION, LAY_ANIMATION, EAT_ANIMATION, SWIM_ANIMATION, UNSWIM_ANIMATION};
	}

	//a stricter check on if the animal is swimming, (It is not doing its transition animation)
	public boolean isReallySwimming() {
		return (this.getIsSwimming()) && (this.getAnimation() != this.SWIM_ANIMATION);
	}

	@Override
	public boolean attackEntityFrom(DamageSource source, float amount) {
		if (!this.world.isRemote && !this.isReallySwimming()) {
			this.setIsSwimming(true);
			this.setAnimation(SWIM_ANIMATION);
			this.setSwimTick(this.swimLength() + this.SWIM_ANIMATION.getDuration());
		}

		return super.attackEntityFrom(source, amount);
	}

	public void onEntityUpdate() {
		int i = this.getAir();
		super.onEntityUpdate();
		if (this.isEntityAlive() && !isInWater()) {
			--i;
			this.setAir(i);

			if (this.getAir() == -20) {
				this.setAir(0);
				this.attackEntityFrom(DamageSource.DROWN, 2.0F);
			}
		} else {
			this.setAir(300);
		}

		if (!world.isRemote) {

			if (!this.isReallyInWater()) {
				this.setIsSwimming(false);
				this.setWalkTick(1);
			} else {

				if (this.getSwimTick() > 0) {
					this.setSwimTick(this.getSwimTick() - this.rand.nextInt(3));
					if (this.getSwimTick() < 0) {
						this.setSwimTick(0);
					}
				}
				if (this.getWalkTick() > 0) {
					this.setWalkTick(this.getWalkTick() - this.rand.nextInt(3));
					if (this.getWalkTick() < 0) {
						this.setWalkTick(0);
					}
				}

				if ((!(this.getSwimTick() > 0)) && this.getIsSwimming()) {
					this.setIsSwimming(false);
					this.setAnimation(UNSWIM_ANIMATION);
					this.setWalkTick(this.walkLength() + this.UNSWIM_ANIMATION.getDuration());
				}

				if ((!(this.getWalkTick() > 0)) && !this.getIsSwimming()) {
					this.setIsSwimming(true);
					this.setAnimation(SWIM_ANIMATION);
					this.setSwimTick(this.swimLength() + this.SWIM_ANIMATION.getDuration());
				}
			}
		}
	}

	@Override
	protected void entityInit() {
		super.entityInit();
		this.dataManager.register(SWIMMINGPN, false);
		this.dataManager.register(VAR_TYPE, 0);
		this.setScaleForAge(false);
	}

	@Override
	public IEntityLivingData onInitialSpawn(DifficultyInstance difficulty, @Nullable IEntityLivingData livingdata) {
		livingdata = super.onInitialSpawn(difficulty, livingdata);
		this.setIsSwimming(false);
		return livingdata;
	}


	//checks if the animal is actually swimming
	@Override
	public boolean getIsSwimming() {
		return (Boolean)this.dataManager.get(SWIMMINGPN);
	}

	//sets the animal isSwimming variable to true if the data manager detects that the animal is swimming
	@Override
	public void setIsSwimming(boolean isSwimming) {
		this.dataManager.set(SWIMMINGPN, isSwimming);
	}


	@Override
	public EnumCreatureAttribute getCreatureAttribute() {
		return EnumCreatureAttribute.ARTHROPOD;
	}

	@Override
	public void onLivingUpdate() {
		super.onLivingUpdate();
		AnimationHandler.INSTANCE.updateAnimations(this);

	}

	@Override
	public void onUpdate() {
		super.onUpdate();
		if (world.isRemote && !this.isAIDisabled()) {
			tailBuffer.calculateChainSwingBuffer(120, 10, 5F, this);
		}
	}

	@Override
	public int swimTransitionLength() {
		return 20;
	}

	@Override
	public int unswimTransitionLength() {
		return 20;
	}

	@Override
	public int swimLength() {
		return 500;
	}

	@Override
	public int walkLength() {
		return 1300;
	}

	@Override
	public boolean isSmall() {
		return true;
	}

	public static String getPeriod() {
		return "Devonian - Permian";
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
		return 48000;
	}



	@Override
	protected void applyEntityAttributes() {
		super.applyEntityAttributes();
		this.getEntityAttribute(SharedMonsterAttributes.MAX_HEALTH).setBaseValue(4.0D);
		this.getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).setBaseValue(0.25D);
	}

	protected void initEntityAI() {
		tasks.addTask(0, new EntityMateAIAgeableBase(this, 1));
		tasks.addTask(1, new AttackAI(this, 1.0D, false, this.getAttackLength()));
		tasks.addTask(2, new SwimmingBottomWalkingSwimBottomDweller(this, NO_ANIMATION));
		tasks.addTask(3, new SwimmingBottomWalkingWalk(this, NO_ANIMATION));
		tasks.addTask(4, new EntityLookIdleAI(this));
		this.targetTasks.addTask(0, new EatItemsEntityPrehistoricFloraAgeableBaseAI(this, 1));
		//this.targetTasks.addTask(3, new HuntSmallerThanMeAIAgeable(this, EntityPrehistoricFloraAgeableFishBase.class, true, (Predicate<Entity>) entity -> entity instanceof EntityLivingBase, 0));
		this.targetTasks.addTask(1, new HuntForDietEntityPrehistoricFloraAgeableBaseAI(this, EntityLivingBase.class, true, (Predicate<Entity>) entity -> entity instanceof EntityLivingBase, 0.1F, 1.2F, false));
//		this.targetTasks.addTask(3, new HuntAI(this, EntitySquid.class, true, (Predicate<Entity>) entity -> entity instanceof EntityLivingBase));
//		this.targetTasks.addTask(3, new HuntAI(this, EntityPrehistoricFloraTrilobiteBottomBase.class, true, (Predicate<Entity>) entity -> entity instanceof EntityLivingBase));
//		this.targetTasks.addTask(3, new HuntAI(this, EntityPrehistoricFloraTrilobiteSwimBase.class, true, (Predicate<Entity>) entity -> entity instanceof EntityLivingBase));
	}



	@Override
	public String[] getFoodOreDicts() {
		return ArrayUtils.addAll(DietString.FISHFOOD);
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


	public void setPNType(EntityPrehistoricFloraPygocephalomorpha.Type type)
	{
		this.dataManager.set(VAR_TYPE, Integer.valueOf(type.ordinal()));
	}

	public EntityPrehistoricFloraPygocephalomorpha.Type getPNType()
	{
		return EntityPrehistoricFloraPygocephalomorpha.Type.byId(((Integer)this.dataManager.get(VAR_TYPE)).intValue());
	}

	@Nullable
	protected ResourceLocation getLootTable() {
		return getStandardLoot();
	}

	@Override
	public ItemStack getPickedResult(RayTraceResult target)
	{
		if (target.entityHit instanceof EntityPrehistoricFloraPygocephalomorpha) {
			EntityPrehistoricFloraPygocephalomorpha pygo = (EntityPrehistoricFloraPygocephalomorpha) target.entityHit;
			switch (pygo.getPNType()) {
				case TEALLIOCARIS: default:
					return new ItemStack(ItemSpawnEggPygocephalomorphaTealliocaris.block, 1);
//
//				case MAMAYOCARIS:
//					return new ItemStack(ItemSpawnEggPygocephalomorphaMamayocaris.block, 1);
//
//				case TYLOCARIS:
//					return new ItemStack(ItemSpawnEggPygocephalomorphaTylocaris.block, 1);
//
//				case FUJIANOCARIS:
//					return new ItemStack(ItemSpawnEggPygocephalomorphaFujianocaris.block, 1);
//
//				case LAEVITEALLIOCARIS:
//					return new ItemStack(ItemSpawnEggPygocephalomorphaLaevitealliocaris.block, 1);
//
//				case IRATICARIS:
//					return new ItemStack(ItemSpawnEggPygocephalomorphaIraticaris.block, 1);
//
//				case NOTOCARIS:
//					return new ItemStack(ItemSpawnEggPygocephalomorphaNotocaris.block, 1);
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
			return I18n.translateToLocal("entity.prehistoric_flora_pygocephalomorpha_" + this.getPNType().getName() + ".name");
		}
	}


	public void writeEntityToNBT(NBTTagCompound compound) {
		super.writeEntityToNBT(compound);
		compound.setBoolean("pfswimming", this.getIsSwimming());
		compound.setString("PNType", this.getPNType().getName());

	}

	public void readEntityFromNBT(NBTTagCompound compound) {
		super.readEntityFromNBT(compound);
		this.setIsSwimming(compound.getBoolean("pfswimming"));
		if (compound.hasKey("PNType", 8))
		{
			this.setPNType(EntityPrehistoricFloraPygocephalomorpha.Type.getTypeFromString(compound.getString("PNType")));
		}
	}


	//Rendering taxidermy:
	//--------------------
	public static double offsetWall(@Nullable String variant) {
		switch (EntityPrehistoricFloraPygocephalomorpha.Type.getTypeFromString(variant)) {
			case TEALLIOCARIS: default:
				return 0.0;

		}
	}

	public static double upperfrontverticallinedepth(@Nullable String variant) {
		return 0.0;
	}
	public static double upperbackverticallinedepth(@Nullable String variant) {
		return 0.75;
	}
	public static double upperfrontlineoffset(@Nullable String variant) {
		return 0.0;
	}
	public static double upperfrontlineoffsetperpendiular(@Nullable String variant) {
		return -0F;
	}
	public static double upperbacklineoffset(@Nullable String variant) {
		return 0.0;
	}
	public static double upperbacklineoffsetperpendiular(@Nullable String variant) {
		return 0.0F;
	}
	public static double lowerfrontverticallinedepth(@Nullable String variant) {
		return 0;
	}
	public static double lowerbackverticallinedepth(@Nullable String variant) {
		return 0.3;
	}
	public static double lowerfrontlineoffset(@Nullable String variant) {
		return 0;
	}
	public static double lowerfrontlineoffsetperpendiular(@Nullable String variant) {
		return 0.0F;
	}
	public static double lowerbacklineoffset(@Nullable String variant) {
		return -0.0;
	}
	public static double lowerbacklineoffsetperpendiular(@Nullable String variant) {
		return 0F;
	}
	public static float widthSupport(@Nullable String variant) {return 0.025F;}

	@SideOnly(Side.CLIENT)
	public static ResourceLocation textureDisplay(@Nullable String variant) {
		switch (EntityPrehistoricFloraPygocephalomorpha.Type.getTypeFromString(variant)) {
			case TEALLIOCARIS:
			default:
				return RenderPygocephalomorpha.TEXTURE_TEALLIOCARIS;
		}
	}
	@SideOnly(Side.CLIENT)
	public static ModelBase modelDisplay(@Nullable String variant) {
		switch (EntityPrehistoricFloraPygocephalomorpha.Type.getTypeFromString(variant)) {
			case TEALLIOCARIS:
			default:
				return RenderDisplays.modelTealliocaris;
		}
	}

	public static float getScaler(@Nullable String variant) {
		return RenderPygocephalomorpha.getScaler(EntityPrehistoricFloraPygocephalomorpha.Type.getTypeFromString(variant));
	}
	
}