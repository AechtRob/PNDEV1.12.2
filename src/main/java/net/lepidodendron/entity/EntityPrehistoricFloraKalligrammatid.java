
package net.lepidodendron.entity;

import net.ilexiconn.llibrary.server.animation.Animation;
import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.block.BlockGlassJar;
import net.lepidodendron.entity.ai.DietString;
import net.lepidodendron.entity.base.EntityPrehistoricFloraInsectFlyingBase;
import net.lepidodendron.entity.render.entity.RenderKalligrammatid;
import net.lepidodendron.entity.render.tile.RenderDisplays;
import net.lepidodendron.entity.util.ITrappableAir;
import net.lepidodendron.item.entities.ItemUnknownEggLand;
import net.lepidodendron.item.entities.spawneggs.*;
import net.minecraft.client.model.ModelBase;
import net.minecraft.entity.IEntityLivingData;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.passive.EntityAnimal;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.network.datasync.DataParameter;
import net.minecraft.network.datasync.DataSerializers;
import net.minecraft.network.datasync.EntityDataManager;
import net.minecraft.util.DamageSource;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.util.text.translation.I18n;
import net.minecraft.world.DifficultyInstance;
import net.minecraft.world.World;
import net.minecraft.world.WorldServer;
import net.minecraft.world.storage.loot.LootContext;
import net.minecraft.world.storage.loot.LootTable;
import net.minecraftforge.fml.common.registry.EntityRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import org.apache.commons.lang3.ArrayUtils;

import javax.annotation.Nullable;

public class EntityPrehistoricFloraKalligrammatid extends EntityPrehistoricFloraInsectFlyingBase implements ITrappableAir {

	private int animationTick;
	private Animation animation = NO_ANIMATION;

	private static final float[] KALLIGRAMMA_SIZE = new float[]{0.2F, 0.2F};
	private static final float[] APOCHRYSOGRAMMA_SIZE = new float[]{0.2F, 0.2F};
	private static final float[] HUIYINGOGRAMMA_SIZE = new float[]{0.2F, 0.2F};
	private static final float[] LIASSOPSYCHOPS_SIZE = new float[]{0.2F, 0.2F};
	private static final float[] MEIONEURITES_SIZE = new float[]{0.2F, 0.2F};
	private static final float[] ABRIGRAMMA_SIZE = new float[]{0.2F, 0.2F};
	private static final float[] ITHIGRAMMA_SIZE = new float[]{0.2F, 0.2F};
	private static final float[] OREGRAMMA_SIZE = new float[]{0.2F, 0.2F};
	private static final float[] MAKARKINIA_SIZE = new float[]{0.2F, 0.2F};
	private static final float[] SOPHOGRAMMA_SIZE = new float[]{0.2F, 0.2F};

	private static final DataParameter<Integer> INSECT_TYPE = EntityDataManager.<Integer>createKey(EntityPrehistoricFloraKalligrammatid.class, DataSerializers.VARINT);

	public EntityPrehistoricFloraKalligrammatid(World world) {
		super(world);

	//*****************************************************
	//Insect variant managers:

		setSize(getHitBoxSize()[0], getHitBoxSize()[1]);
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
					if (((EntityPrehistoricFloraKalligrammatid)otherAnimal).getPNType() == this.getPNType()) {
						return false;
					}
					break;

				case 1:
					if (((EntityPrehistoricFloraKalligrammatid)otherAnimal).getPNType() != this.getPNType()) {
						return false;
					}
					break;

			}
		}

		return this.isInLove() && otherAnimal.isInLove();
	}

	@Override
	public ItemStack getPickedResult(RayTraceResult target)
	{
		if (target.entityHit instanceof EntityPrehistoricFloraKalligrammatid) {
			EntityPrehistoricFloraKalligrammatid Kalligrammatid = (EntityPrehistoricFloraKalligrammatid) target.entityHit;
			switch (Kalligrammatid.getPNType()) {
				case KALLIGRAMMA: default:
					return new ItemStack(ItemSpawnEggKalligrammatidKalligramma.block, 1);

				case APOCHRYSOGRAMMA:
					return new ItemStack(ItemSpawnEggKalligrammatidApochrysogramma.block, 1);

				case HUIYINGOGRAMMA:
					return new ItemStack(ItemSpawnEggKalligrammatidHuiyingogramma.block, 1);

				case LIASSOPSYCHOPS:
					return new ItemStack(ItemSpawnEggKalligrammatidLiassopsychops.block, 1);

				case MEIONEURITES:
					return new ItemStack(ItemSpawnEggKalligrammatidMeioneurites.block, 1);

				case ABRIGRAMMA:
					return new ItemStack(ItemSpawnEggKalligrammatidAbrigramma.block, 1);

				case ITHIGRAMMA:
					return new ItemStack(ItemSpawnEggKalligrammatidIthigramma.block, 1);

				case OREGRAMMA:
					return new ItemStack(ItemSpawnEggKalligrammatidOregramma.block, 1);

				case MAKARKINIA:
					return new ItemStack(ItemSpawnEggKalligrammatidMakarkinia.block, 1);

				case SOPHOGRAMMA:
					return new ItemStack(ItemSpawnEggKalligrammatidSophogramma.block, 1);

			}
		}
		return ItemStack.EMPTY;
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

	public enum Type
	{
		KALLIGRAMMA(1, "kalligramma"),
		APOCHRYSOGRAMMA(2, "apochrysogramma"),
		HUIYINGOGRAMMA(3, "huiyingogramma"),
		LIASSOPSYCHOPS(4, "liassopsychops"),
		MEIONEURITES(5, "meioneurites"),
		ABRIGRAMMA(6, "abrigramma"),
		ITHIGRAMMA(7, "ithigramma"),
		OREGRAMMA(8, "oregramma"),
		MAKARKINIA(9, "makarkinia"),
		SOPHOGRAMMA(10, "sophogramma")
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

	public ResourceLocation getFreezeLoot() {
		switch (this.getPNType()) {
			case KALLIGRAMMA: default:
				return LepidodendronMod.KALLIGRAMMATID_KALLIGRAMMA_LOOT_JAR;

			case APOCHRYSOGRAMMA:
				return LepidodendronMod.KALLIGRAMMATID_APOCHRYSOGRAMMA_LOOT_JAR;

			case HUIYINGOGRAMMA:
				return LepidodendronMod.KALLIGRAMMATID_HUIYINGOGRAMMA_LOOT_JAR;

			case LIASSOPSYCHOPS:
				return LepidodendronMod.KALLIGRAMMATID_LIASSOPSYCHOPS_LOOT_JAR;

			case MEIONEURITES:
				return LepidodendronMod.KALLIGRAMMATID_MEIONEURITES_LOOT_JAR;

			case ABRIGRAMMA:
				return LepidodendronMod.KALLIGRAMMATID_ABRIGRAMMA_LOOT_JAR;

			case ITHIGRAMMA:
				return LepidodendronMod.KALLIGRAMMATID_ITHIGRAMMA_LOOT_JAR;

			case OREGRAMMA:
				return LepidodendronMod.KALLIGRAMMATID_OREGRAMMA_LOOT_JAR;

			case MAKARKINIA:
				return LepidodendronMod.KALLIGRAMMATID_MAKARKINIA_LOOT_JAR;

			case SOPHOGRAMMA:
				return LepidodendronMod.KALLIGRAMMATID_SOPHOGRAMMA_LOOT_JAR;
		}
	}

	public ResourceLocation getStandardLoot() {
		return LepidodendronMod.BUG_LOOT;
	}

	public float getFlySpeed() {
		switch (this.getPNType()) {
			case KALLIGRAMMA: default:
				return 3f;

			case APOCHRYSOGRAMMA:
				return 3f;

			case LIASSOPSYCHOPS:
				return 3f;

			case HUIYINGOGRAMMA:
				return 3f;

			case MEIONEURITES:
				return 3f;

			case ABRIGRAMMA:
				return 3f;

			case ITHIGRAMMA:
				return 3f;

			case OREGRAMMA:
				return 3f;

			case MAKARKINIA:
				return 3f;

			case SOPHOGRAMMA:
				return 3f;
		}
	}

	public float[] getHitBoxSize() {
		switch (this.getPNType()) {
			case KALLIGRAMMA: default:
				return KALLIGRAMMA_SIZE;

			case APOCHRYSOGRAMMA:
				return APOCHRYSOGRAMMA_SIZE;

			case HUIYINGOGRAMMA:
				return HUIYINGOGRAMMA_SIZE;

			case LIASSOPSYCHOPS:
				return LIASSOPSYCHOPS_SIZE;

			case MEIONEURITES:
				return MEIONEURITES_SIZE;

			case ABRIGRAMMA:
				return ABRIGRAMMA_SIZE;

			case ITHIGRAMMA:
				return ITHIGRAMMA_SIZE;

			case OREGRAMMA:
				return OREGRAMMA_SIZE;

			case MAKARKINIA:
				return MAKARKINIA_SIZE;

			case SOPHOGRAMMA:
				return SOPHOGRAMMA_SIZE;
		}
	}

	@Nullable
	protected ResourceLocation getLootTable() {
		return getStandardLoot();
	}

	//Rendering taxidermy:
	//--------------------
	public static double offsetCase(@Nullable String variant) {
		switch (EntityPrehistoricFloraKalligrammatid.Type.getTypeFromString(variant)) {
			case KALLIGRAMMA: default:
				return 0.0;

			case APOCHRYSOGRAMMA:
				return 0.0;

			case LIASSOPSYCHOPS:
				return 0.0;

			case MEIONEURITES:
				return 0.0;

			case ABRIGRAMMA:
				return 0.0;

			case ITHIGRAMMA:
				return 0.0;

			case OREGRAMMA:
				return 0.0;

			case MAKARKINIA:
				return 0.0;

			case SOPHOGRAMMA:
				return 0.0;
		}
	}

	public static double offsetWall(@Nullable String variant) {
		switch (EntityPrehistoricFloraKalligrammatid.Type.getTypeFromString(variant)) {
			case KALLIGRAMMA: default:
				return 0.0;

			case APOCHRYSOGRAMMA:
				return 0.0;

			case LIASSOPSYCHOPS:
				return 0.0;

			case MEIONEURITES:
				return 0.0;

			case ABRIGRAMMA:
				return 0.0;

			case ITHIGRAMMA:
				return 0.0;

			case OREGRAMMA:
				return 0.0;

			case MAKARKINIA:
				return 0.0;

			case SOPHOGRAMMA:
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
		return 0.6;
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

	@SideOnly(Side.CLIENT)
	public static ResourceLocation textureDisplay(@Nullable String variant) {
		switch (EntityPrehistoricFloraKalligrammatid.Type.getTypeFromString(variant)) {
			case KALLIGRAMMA:
			default:
				return RenderKalligrammatid.TEXTURE_KALLIGRAMMA;

			case APOCHRYSOGRAMMA:
				return RenderKalligrammatid.TEXTURE_APOCHRYSOGRAMMA;

			case LIASSOPSYCHOPS:
				return RenderKalligrammatid.TEXTURE_LIASSOPSYCHOPS;

			case MEIONEURITES:
				return RenderKalligrammatid.TEXTURE_MEIONEURITES;

			case ABRIGRAMMA:
				return RenderKalligrammatid.TEXTURE_ABRIGRAMMA;

			case ITHIGRAMMA:
				return RenderKalligrammatid.TEXTURE_ITHIGRAMMA;

			case OREGRAMMA:
				return RenderKalligrammatid.TEXTURE_OREGRAMMA;

			case MAKARKINIA:
				return RenderKalligrammatid.TEXTURE_MAKARKINIA;

			case SOPHOGRAMMA:
				return RenderKalligrammatid.TEXTURE_SOPHOGRAMMA;

			case HUIYINGOGRAMMA:
				return RenderKalligrammatid.TEXTURE_HUIYINGOGRAMMA;
		}
	}
	@SideOnly(Side.CLIENT)
	public static ModelBase modelDisplay(@Nullable String variant) {
		switch (EntityPrehistoricFloraKalligrammatid.Type.getTypeFromString(variant)) {
			case KALLIGRAMMA:
			default:
				return RenderDisplays.modelKalligrammatid;

			case APOCHRYSOGRAMMA:
				return RenderDisplays.modelKalligrammatid;

			case LIASSOPSYCHOPS:
				return RenderDisplays.modelKalligrammatid;

			case MEIONEURITES:
				return RenderDisplays.modelKalligrammatid;

			case ABRIGRAMMA:
				return RenderDisplays.modelKalligrammatid;

			case ITHIGRAMMA:
				return RenderDisplays.modelKalligrammatid;

			case OREGRAMMA:
				return RenderDisplays.modelKalligrammatid;

			case MAKARKINIA:
				return RenderDisplays.modelKalligrammatid;

			case SOPHOGRAMMA:
				return RenderDisplays.modelKalligrammatid;

			case HUIYINGOGRAMMA:
				return RenderDisplays.modelKalligrammatid;
		}
	}

	public static float getScaler(@Nullable String variant) {
		return RenderKalligrammatid.getScaler(EntityPrehistoricFloraKalligrammatid.Type.getTypeFromString(variant));
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
		this.setPNType(Type.byId(rand.nextInt(Type.values().length) + 1));
		return livingdata;
	}

	@Override
	public String getName() {
		if (this.hasCustomName())
		{
			return this.getCustomNameTag();
		}
		else
		{
			return I18n.translateToLocal("entity.prehistoric_flora_kalligrammatid_" + this.getPNType().getName() + ".name");
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
		this.dataManager.set(INSECT_TYPE, Integer.valueOf(type.ordinal()));
	}

	public Type getPNType()
	{
		return Type.byId(((Integer)this.dataManager.get(INSECT_TYPE)).intValue());
	}

	//*****************************************************

	@Override
	public boolean canJar() {
		return true;
	}

	public static String getPeriod() {return "Jurassic - Early Cretaceous - Late Cretaceoous";}

	//public static String getHabitat() {return "Terrestrial";}

	@Override
	public boolean dropsEggs() {
		return true;
	}

	@Override
	public ItemStack getDroppedEggItemStack() {
		ItemStack stack = new ItemStack(ItemUnknownEggLand.block, (int) (1));
		NBTTagCompound variantNBT = new NBTTagCompound();
		variantNBT.setString("PNType", this.getPNType().getName());
		variantNBT.setString("creature", "lepidodendron:prehistoric_fora_kalligrammatid");
		stack.setTagCompound(variantNBT);
		return stack;
	}

	@Override
	public boolean laysEggs() {
		return false;
	}

	@Override
	public int getAnimationTick() {
		return animationTick;
	}

	@Override
	public void setAnimationTick(int tick)
	{
		animationTick = tick;
	}

	@Override
	public Animation getAnimation()
	{
		return this.animation;
	}

	@Override
	public void setAnimation(Animation animation)
	{
		if (animation == NO_ANIMATION){
			onAnimationFinish(this.animation);
			setAnimationTick(0);
		}
		this.animation = animation;
	}

	@Override
	public Animation[] getAnimations()
	{
		return null;
	}

	protected void onAnimationFinish(Animation animation)
	{}

	@Override
	protected float getAISpeedInsect() {
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
		this.getEntityAttribute(SharedMonsterAttributes.MAX_HEALTH).setBaseValue(4.0D);
		this.getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).setBaseValue(0.25D);
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

	@Override
	public SoundEvent getDeathSound() {
		return (SoundEvent) SoundEvent.REGISTRY.getObject(new ResourceLocation("entity.generic.death"));
	}

	@Override
	protected float getSoundVolume() {
		return 1.0F;
	}

	@Override
	public ResourceLocation FlightSound() {
		return new ResourceLocation("lepidodendron:kalligrammatid_flight");
	}

	@Override
	public String[] getFoodOreDicts() {
		return ArrayUtils.addAll(DietString.PLANTS);
	}


}