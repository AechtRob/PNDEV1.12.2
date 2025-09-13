
package net.lepidodendron.entity;

import net.ilexiconn.llibrary.client.model.tools.ChainBuffer;
import net.ilexiconn.llibrary.server.animation.Animation;
import net.lepidodendron.LepidodendronConfig;
import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.block.BlockGlassJar;
import net.lepidodendron.block.base.IAdvancementGranter;
import net.lepidodendron.entity.ai.*;
import net.lepidodendron.entity.base.EntityPrehistoricFloraLandBase;
import net.lepidodendron.entity.model.llibraryextensions.MillipedeBuffer;
import net.lepidodendron.entity.render.entity.RenderMyriapod;
import net.lepidodendron.entity.render.tile.RenderDisplays;
import net.lepidodendron.entity.util.ILayableMoss;
import net.lepidodendron.entity.util.ITrappableAir;
import net.lepidodendron.item.entities.spawneggs.*;
import net.lepidodendron.util.CustomTrigger;
import net.lepidodendron.util.EggLayingConditions;
import net.lepidodendron.util.ModTriggers;
import net.minecraft.block.BlockDirectional;
import net.minecraft.block.properties.PropertyDirection;
import net.minecraft.client.model.ModelBase;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EnumCreatureAttribute;
import net.minecraft.entity.IEntityLivingData;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.EntityAIWanderAvoidWater;
import net.minecraft.entity.passive.EntityAnimal;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.network.datasync.DataParameter;
import net.minecraft.network.datasync.DataSerializers;
import net.minecraft.network.datasync.EntityDataManager;
import net.minecraft.util.DamageSource;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.util.text.translation.I18n;
import net.minecraft.world.DifficultyInstance;
import net.minecraft.world.World;
import net.minecraft.world.WorldServer;
import net.minecraft.world.storage.loot.LootContext;
import net.minecraft.world.storage.loot.LootTable;
import net.minecraftforge.fml.common.FMLCommonHandler;
import net.minecraftforge.fml.common.registry.EntityRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import org.apache.commons.lang3.ArrayUtils;

import javax.annotation.Nullable;


public class EntityPrehistoricFloraMyriapod extends EntityPrehistoricFloraLandBase implements ITrappableAir, IAdvancementGranter {

	public BlockPos currentTarget;
	@SideOnly(Side.CLIENT)
	public ChainBuffer chainBuffer;
	private int animationTick;
	private Animation animation = NO_ANIMATION;
	public MillipedeBuffer myriapodBuffer;
	public Animation HIDE_ANIMATION;

	private static final float[] PNEUMODESMUS_SIZE = new float[]{0.30F, 0.30F};
	private static final float[] EOARTHROPLEURA_SIZE = new float[]{0.30F, 0.30F};
	private static final float[] LATZELIA_SIZE = new float[]{0.30F, 0.30F};
	private static final float[] CRUSSOLUM_SIZE = new float[]{0.30F, 0.30F};
	private static final float[] VELOCIPEDE_SIZE = new float[]{0.30F, 0.30F};
	private static final float[] FULMENOCURSOR_SIZE = new float[]{0.30F, 0.30F};
	private static final float[] DEVONOBIUS_SIZE = new float[]{0.30F, 0.30F};
	private static final float[] JULIFORM_SIZE = new float[]{0.30F, 0.30F};
	private static final float[] POLYDESMID_SIZE = new float[]{0.30F, 0.30F};

	private static final DataParameter<Integer> INSECT_TYPE = EntityDataManager.<Integer>createKey(EntityPrehistoricFloraMyriapod.class, DataSerializers.VARINT);

	public EntityPrehistoricFloraMyriapod(World world) {
		super(world);
		setSize(0.3F, 0.3F);
		minWidth = 0.3F;
		maxWidth = 0.3F;
		maxHeight = 0.3F;
		maxHealthAgeable = 1D;
		HIDE_ANIMATION = Animation.create(this.hideAnimationLength());
		if (FMLCommonHandler.instance().getSide().isClient()) {
			myriapodBuffer = new MillipedeBuffer();
		}
	}

	public int hideAnimationLength() {
		return 160;
	}

	@Override
	public boolean canJar() {
		return true;
	}

	@Override
	public void onUpdate() {
		super.onUpdate();
		if (world.isRemote && !this.isAIDisabled()) {
			myriapodBuffer.calculateChainSwingBuffer(120, 16, 12.5F, this);
		}
	}



	@Override
	public int getEggType(@Nullable String variantIn) {
		return 20; //insect
	}

	public static String getPeriod() {return "Silurian - Devonian";}

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
	public int getAdultAge() {
		return 0;
	} //Only adults!

	@Override
	public float getAISpeedLand() {
		if (this.getTicks() < 0) {
			return 0.0F; //Is laying eggs
		}
		if (this.getAnimation() == DRINK_ANIMATION || this.getAnimation() == MAKE_NEST_ANIMATION
				|| this.getAnimation() == HIDE_ANIMATION || this.getAnimation() == GRAZE_ANIMATION) {
			return 0.0F;
		}
		return getCrawlSpeed();
	}

	@Override
	public Animation[] getAnimations() {
		return new Animation[]{HIDE_ANIMATION};
	}

	//This allows us to only allow the hide animation for specific variants
	public boolean canHide() {
		switch (this.getPNType()) {
			case JULIFORM:
				return true;
			case CRUSSOLUM: default:
            case PNEUMODESMUS:
			case LATZELIA:
			case EOARTHROPLEURA:
			case VELOCIPEDE:
			case FULMENOCURSOR:
			case DEVONOBIUS:
			case POLYDESMID:
                return false;
		}
	}

	@Override
	protected void collideWithEntity(Entity entityIn) {
		super.collideWithEntity(entityIn);
		if (this.onGround && (!this.isReallyInWater()) && this.canHide()){
			this.setAnimation(HIDE_ANIMATION);
		}
	}

	protected void onAnimationFinish(Animation animation)
	{}

	protected void initEntityAI() {
		tasks.addTask(0, new EntityMateAIAgeableBase(this, 1));
		tasks.addTask(1, new LandEntitySwimmingAI(this, 0.75, true));
		tasks.addTask(2, new EntityAIWanderAvoidWater(this, 1.0D));
		tasks.addTask(3, new EntityLookIdleAI(this));
		this.targetTasks.addTask(0, new EatItemsEntityPrehistoricFloraAgeableBaseAI(this, 1));
	}

	@Override
	public String[] getFoodOreDicts() {
		return ArrayUtils.addAll(DietString.MOSS);
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
		this.getEntityAttribute(SharedMonsterAttributes.MAX_HEALTH).setBaseValue(0.8D);
		this.getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).setBaseValue(0.3D);
	}

	@Override
	public net.minecraft.util.SoundEvent getAmbientSound() {
		return (net.minecraft.util.SoundEvent) net.minecraft.util.SoundEvent.REGISTRY
				.getObject(new ResourceLocation("lepidodendron:pneudodesmus_idle"));
	}

	@Override
	public net.minecraft.util.SoundEvent getHurtSound(DamageSource ds) {
		return (net.minecraft.util.SoundEvent) net.minecraft.util.SoundEvent.REGISTRY
				.getObject(new ResourceLocation("lepidodendron:pneudodesmus_hurt"));
	}

	@Override
	public net.minecraft.util.SoundEvent getDeathSound() {
		return (net.minecraft.util.SoundEvent) net.minecraft.util.SoundEvent.REGISTRY
				.getObject(new ResourceLocation("lepidodendron:pneudodesmus_death"));
	}

	@Override
	protected float getSoundVolume() {
		return 0.5F;
	}

	@Override
	public void onLivingUpdate() {
		super.onLivingUpdate();
		//this.renderYawOffset = this.rotationYaw;

		if (this.isReallyInWater() && this.getAnimation() == HIDE_ANIMATION){
			this.setAnimation(NO_ANIMATION);
		}

		this.setSizer(this.getHitBoxSize()[0], this.getHitBoxSize()[1]);
		
		//Eat moss!
		BlockPos pos = this.getPosition();
		if (LepidodendronConfig.doGrazeGrief && world.getGameRules().getBoolean("mobGriefing") && this.getWillHunt() && (!world.isRemote)
			&& ((world.getBlockState(pos).getBlock() instanceof ILayableMoss))
		) {
			this.world.destroyBlock(pos,false);
			this.setHealth(this.getHealth() + 0.5F);
		}

	}

	public static final PropertyDirection FACING = BlockDirectional.FACING;

	public boolean testLay(World world, BlockPos pos) {
		return EggLayingConditions.testLayMossAndWood(this, world, pos);
	}

	@Override
	public boolean nestBlockMatch(World world, BlockPos pos) {
		return (testLay(world, pos.down()) || testLay(world, pos)) ;
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
					if (((EntityPrehistoricFloraMyriapod)otherAnimal).getPNType() == this.getPNType()) {
						return false;
					}
					break;

				case 1:
					if (((EntityPrehistoricFloraMyriapod)otherAnimal).getPNType() != this.getPNType()) {
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

	@Nullable
	@Override
	public CustomTrigger getModTrigger() {
		switch (this.getPNType()) {
			case PNEUMODESMUS: default:
				return ModTriggers.CLICK_PNEUMODESMUS;
			case EOARTHROPLEURA:
				return ModTriggers.CLICK_EOARTHROPLEURA;
			case LATZELIA:
				return ModTriggers.CLICK_LATZELIA;
			case CRUSSOLUM:
				return ModTriggers.CLICK_CRUSSOLUM;
			case VELOCIPEDE:
				return ModTriggers.CLICK_VELOCIPEDE;
			case FULMENOCURSOR:
				return ModTriggers.CLICK_FULMENOCURSOR;
			case DEVONOBIUS:
				return ModTriggers.CLICK_DEVONOBIUS;
			case JULIFORM:
				return ModTriggers.CLICK_JULIFORM;
			case POLYDESMID:
				return ModTriggers.CLICK_POLYDESMID;
				
		}
	}

	public enum Type
	{
		PNEUMODESMUS(1, "pneumodesmus"),
		EOARTHROPLEURA(2, "eoarthropleura"),
		LATZELIA(3, "latzelia"),
		CRUSSOLUM(4, "crussolum"),
		VELOCIPEDE(5, "velocipede"),
		FULMENOCURSOR(6, "fulmenocursor"),
		DEVONOBIUS(7, "devonobius"),
		JULIFORM(8, "juliform"),
		POLYDESMID(9, "polydesmid"),
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

		public static EntityPrehistoricFloraMyriapod.Type byId(int id)
		{
			if (id < 0 || id >= values().length)
			{
				id = 0;
			}

			return values()[id];
		}

		public static EntityPrehistoricFloraMyriapod.Type getTypeFromString(String nameIn)
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

	public ResourceLocation getFreezeLoot() {
		switch (this.getPNType()) {
			case PNEUMODESMUS: default:
				return LepidodendronMod.PNEUMODESMUS_LOOT_JAR;

			case EOARTHROPLEURA:
				return LepidodendronMod.EOARTHROPLEURA_LOOT_JAR;
			case LATZELIA:
				return LepidodendronMod.LATZELIA_LOOT;
			case CRUSSOLUM:
				return LepidodendronMod.CRUSSOLUM_LOOT;
			case VELOCIPEDE:
				return LepidodendronMod.VELOCIPEDE_LOOT;
			case FULMENOCURSOR:
				return LepidodendronMod.FULMENOCURSOR_LOOT;
			case DEVONOBIUS:
				return LepidodendronMod.DEVONOBIUS_LOOT;
			case JULIFORM:
				return LepidodendronMod.JULIFORM_LOOT;
			case POLYDESMID:
				return LepidodendronMod.POLYDESMID_LOOT;

		}
	}

	public ResourceLocation getStandardLoot() {
		return LepidodendronMod.BUG_LOOT;
	}

	public float getCrawlSpeed() {
		switch (this.getPNType()) {
			case PNEUMODESMUS: default:
				return 0.12f;

			case EOARTHROPLEURA:
				return 0.12f;
			case CRUSSOLUM:
				return 0.18f;
			case LATZELIA:
				return 0.2f;
			case DEVONOBIUS:
				return 0.2f;
			case FULMENOCURSOR:
				return 0.2f;
			case VELOCIPEDE:
				return 0.2f;
			case POLYDESMID:
				return 0.2f;
			case JULIFORM:
				return 0.2f;

		}
	}

	public float[] getHitBoxSize() {
		switch (this.getPNType()) {
			case PNEUMODESMUS: default:
				return PNEUMODESMUS_SIZE;

			case EOARTHROPLEURA:
				return EOARTHROPLEURA_SIZE;

			case LATZELIA:
				return LATZELIA_SIZE;
			case CRUSSOLUM:
				return CRUSSOLUM_SIZE;
			case VELOCIPEDE:
				return VELOCIPEDE_SIZE;
			case FULMENOCURSOR:
				return FULMENOCURSOR_SIZE;
			case DEVONOBIUS:
				return DEVONOBIUS_SIZE;
			case JULIFORM:
				return JULIFORM_SIZE;
			case POLYDESMID:
				return POLYDESMID_SIZE;
				
		}
	}

	@Nullable
	protected ResourceLocation getLootTable() {
		return getStandardLoot();
	}

	@Override
	protected void dropLoot(boolean wasRecentlyHit, int lootingModifier, DamageSource source)
	{
		if (source == BlockGlassJar.BlockCustom.FREEZE) {
			ResourceLocation resourcelocation = getFreezeLoot();
			LootTable loottable = this.world.getLootTableManager().getLootTableFromLocation(resourcelocation);
			LootContext.Builder lootcontext$builder = (new LootContext.Builder((WorldServer)this.world)).withLootedEntity(this).withDamageSource(source);
			for (ItemStack itemstack : loottable.generateLootForPools(this.rand, lootcontext$builder.build()))
			{
				NBTTagCompound variantNBT = new NBTTagCompound();
				variantNBT.setString("PNType", this.getPNType().getName());
				String stringEgg = EntityRegistry.getEntry(this.getClass()).getRegistryName().toString();
				variantNBT.setString("PNDisplaycase", stringEgg);
				itemstack.setTagCompound(variantNBT);
				this.entityDropItem(itemstack, 0.0F);
			}
		}
		else {
			super.dropLoot(wasRecentlyHit, lootingModifier, source);
		}
	}

	@Override
	protected void entityInit() {
		super.entityInit();
		this.dataManager.register(INSECT_TYPE, 0);
	}

	@Override
	public IEntityLivingData onInitialSpawn(DifficultyInstance difficulty, @Nullable IEntityLivingData livingdata) {
		livingdata = super.onInitialSpawn(difficulty, livingdata);
		this.setPNType(EntityPrehistoricFloraMyriapod.Type.byId(rand.nextInt(EntityPrehistoricFloraMyriapod.Type.values().length) + 1));
		return livingdata;
	}

	protected void setSizer(float width, float height)
	{
		if (width != this.width || height != this.height)
		{
			float f = this.width;
			this.width = width;
			this.height = height;
			if (this.width != f) {
				double d0 = (double) width / 2.0D;
				this.setEntityBoundingBox(new AxisAlignedBB(this.posX - d0, this.posY, this.posZ - d0, this.posX + d0, this.posY + (double) this.height, this.posZ + d0));
			}
		}
	}

	@Override
	public ItemStack getPickedResult(RayTraceResult target)
	{
		if (target.entityHit instanceof EntityPrehistoricFloraMyriapod) {
			EntityPrehistoricFloraMyriapod palaeodictyoptera = (EntityPrehistoricFloraMyriapod) target.entityHit;
			switch (palaeodictyoptera.getPNType()) {
				case PNEUMODESMUS: default:
					return new ItemStack(ItemSpawnEggMyriapodPneumodesmus.block, 1);

				case EOARTHROPLEURA:
					return new ItemStack(ItemSpawnEggMyriapodEoarthropleura.block, 1);
				case LATZELIA:
					return new ItemStack(ItemSpawnEggMyriapodLatzelia.block, 1);
				case CRUSSOLUM:
					return new ItemStack(ItemSpawnEggMyriapodCrussolum.block, 1);
				case VELOCIPEDE:
					return new ItemStack(ItemSpawnEggMyriapodVelocipede.block, 1);
				case FULMENOCURSOR:
					return new ItemStack(ItemSpawnEggMyriapodFulmenocursor.block, 1);
				case DEVONOBIUS:
					return new ItemStack(ItemSpawnEggMyriapodDevonobius.block, 1);
				case JULIFORM:
					return new ItemStack(ItemSpawnEggMyriapodJuliform.block, 1);
				case POLYDESMID:
					return new ItemStack(ItemSpawnEggMyriapodPolydesmid.block, 1);
					
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
			return I18n.translateToLocal("entity.prehistoric_flora_myriapod_" + this.getPNType().getName() + ".name");
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
			this.setPNType(EntityPrehistoricFloraMyriapod.Type.getTypeFromString(compound.getString("PNType")));
		}
	}

	public void setPNType(EntityPrehistoricFloraMyriapod.Type type)
	{
		this.dataManager.set(INSECT_TYPE, Integer.valueOf(type.ordinal()));
	}

	@Nullable
	public EntityPrehistoricFloraMyriapod.Type getPNType()
	{
		return EntityPrehistoricFloraMyriapod.Type.byId(((Integer)this.dataManager.get(INSECT_TYPE)).intValue());
	}

	@Override
	public String getPNTypeName()
	{
		return this.getPNType().getName();
	}

	//Rendering taxidermy:
	//--------------------
	public static double offsetCase(@Nullable String variant) {
		switch (EntityPrehistoricFloraMyriapod.Type.getTypeFromString(variant)) {
			case PNEUMODESMUS:
			default:
				return 0.3;

			case EOARTHROPLEURA:
				return 0.40;

		}
	}
	public static double offsetWall(@Nullable String variant) {
		switch (EntityPrehistoricFloraMyriapod.Type.getTypeFromString(variant)) {
			case PNEUMODESMUS:
			default:
				return 0.0;

			case EOARTHROPLEURA:
				return 0.0;

		}
	}
	public static double upperfrontverticallinedepth(@Nullable String variant) {
		return 0.0;
	}
	public static double upperbackverticallinedepth(@Nullable String variant) {
		return 0.0;
	}
	public static double upperfrontlineoffset(@Nullable String variant) {
		return 0.0;
	}
	public static double upperfrontlineoffsetperpendiular(@Nullable String variant) {
		return 0.0;
	}
	public static double upperbacklineoffset(@Nullable String variant) {
		return 0.0;
	}
	public static double upperbacklineoffsetperpendiular(@Nullable String variant) {
		return 0.0;
	}
	public static double lowerfrontverticallinedepth(@Nullable String variant) {
		return 0.0;
	}
	public static double lowerbackverticallinedepth(@Nullable String variant) {
		return 0.25;
	}
	public static double lowerfrontlineoffset(@Nullable String variant) {
		return 0.0;
	}
	public static double lowerfrontlineoffsetperpendiular(@Nullable String variant) {
		return 0.0;
	}
	public static double lowerbacklineoffset(@Nullable String variant) {
		return 0.0;
	}
	public static double lowerbacklineoffsetperpendiular(@Nullable String variant) {
		return -0.0;
	}
	@SideOnly(Side.CLIENT)
	public static ResourceLocation textureDisplay(@Nullable String variant) {
		switch (EntityPrehistoricFloraMyriapod.Type.getTypeFromString(variant)) {
			case PNEUMODESMUS:
			default:
				return RenderMyriapod.TEXTURE_PNEUMODESMUS;

			case EOARTHROPLEURA:
				return RenderMyriapod.TEXTURE_EOARTHROPLEURA;

		}
	}
	@SideOnly(Side.CLIENT)
	public static ModelBase modelDisplay(@Nullable String variant) {
		switch (EntityPrehistoricFloraMyriapod.Type.getTypeFromString(variant)) {
			case PNEUMODESMUS:
			default:
				return RenderDisplays.modelPneumodesmus;

			case EOARTHROPLEURA:
				return RenderDisplays.modelEoarthropleura;

		}
	}
	public static float getScaler(@Nullable String variant) {
		return RenderMyriapod.getScaler(EntityPrehistoricFloraMyriapod.Type.getTypeFromString(variant));
	}
	public static float widthSupport(@Nullable String variant) {return 0.012F;}


}