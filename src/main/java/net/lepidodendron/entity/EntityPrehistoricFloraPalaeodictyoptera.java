
package net.lepidodendron.entity;

import net.ilexiconn.llibrary.server.animation.Animation;
import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.block.BlockGlassJar;
import net.lepidodendron.block.base.IAdvancementGranter;
import net.lepidodendron.entity.ai.DietString;
import net.lepidodendron.entity.base.EntityPrehistoricFloraInsectFlyingBase;
import net.lepidodendron.entity.render.entity.LayerPalaeodictyopteraWing;
import net.lepidodendron.entity.render.entity.RenderPalaeodictyoptera;
import net.lepidodendron.entity.render.tile.RenderDisplays;
import net.lepidodendron.entity.util.ITrappableAir;
import net.lepidodendron.item.entities.spawneggs.*;
import net.lepidodendron.util.CustomTrigger;
import net.lepidodendron.util.EggLayingConditions;
import net.lepidodendron.util.ModTriggers;
import net.minecraft.client.model.ModelBase;
import net.minecraft.entity.Entity;
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
import net.minecraft.util.math.AxisAlignedBB;
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

public class EntityPrehistoricFloraPalaeodictyoptera extends EntityPrehistoricFloraInsectFlyingBase implements ITrappableAir, IAdvancementGranter {

	private int animationTick;
	private Animation animation = NO_ANIMATION;

	private static final float[] DELITZSCHALA_SIZE = new float[]{0.15F, 0.30F};
	private static final float[] DUNBARIA_SIZE = new float[]{0.17F, 0.34F};
	private static final float[] HOMALONEURA_SIZE = new float[]{0.18F, 0.36F};
	private static final float[] HOMOIOPTERA_SIZE = new float[]{0.26F, 0.52F};
	private static final float[] LITHOMANTIS_SIZE = new float[]{0.19F, 0.38F};
	private static final float[] LYCOCERCUS_SIZE = new float[]{0.19F, 0.38F};
	private static final float[] SINODUNBARIA_SIZE = new float[]{0.16F, 0.32F};
	private static final float[] STENODICTYA_SIZE = new float[]{0.20F, 0.40F};
	private static final float[] MAZOTHAIROS_SIZE = new float[]{0.30F, 0.60F};
	private static final float[] PSYCHROPTILUS_SIZE = new float[]{0.15F, 0.30F};

	private static final DataParameter<Integer> INSECT_TYPE = EntityDataManager.<Integer>createKey(EntityPrehistoricFloraPalaeodictyoptera.class, DataSerializers.VARINT);

	public EntityPrehistoricFloraPalaeodictyoptera(World world) {
		super(world);

	//*****************************************************
	//Insect variant managers:

		setSize(getHitBoxSize()[0], getHitBoxSize()[1]);
	}

	@Override
	public String getEntityId(Entity entity) {
		String mobid = "";
		net.minecraftforge.fml.common.registry.EntityEntry entry =
				net.minecraftforge.fml.common.registry.EntityRegistry.getEntry(entity.getClass());
		if (entry != null) {
			mobid = entry.getRegistryName().toString() + "_nymph";
		}
		if (this.hasPNVariants() && this.getPNTypeName() != null) {
			mobid = mobid + "@" + this.getPNTypeName();
		}
		return mobid;
	}

	@Override
	public ResourceLocation FlightSound() {
		if (this.getPNType() == Type.DELITZSCHALA || this.getPNType() == Type.SINODUNBARIA) {
			return new ResourceLocation("lepidodendron:dragonfly_flight");
		}
		return new ResourceLocation("lepidodendron:palaeodictyoptera_flight");
	}

	@Override
	public int getEggType(@Nullable String variantIn) {
		return 21; //cross model
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
					if (((EntityPrehistoricFloraPalaeodictyoptera)otherAnimal).getPNType() == this.getPNType()) {
						return false;
					}
					break;

				case 1:
					if (((EntityPrehistoricFloraPalaeodictyoptera)otherAnimal).getPNType() != this.getPNType()) {
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
			case DELITZSCHALA: default:
				return ModTriggers.CLICK_PALAEODICTYOPTERA_DELITZSCHALA;

			case DUNBARIA:
				return ModTriggers.CLICK_PALAEODICTYOPTERA_DUNBARIA;

			case HOMALONEURA:
				return ModTriggers.CLICK_PALAEODICTYOPTERA_HOMALONEURA;

			case HOMOIOPTERA:
				return ModTriggers.CLICK_PALAEODICTYOPTERA_HOMOIOPTERA;

			case LITHOMANTIS:
				return ModTriggers.CLICK_PALAEODICTYOPTERA_LITHOMANTIS;

			case LYCOCERCUS:
				return ModTriggers.CLICK_PALAEODICTYOPTERA_LYCOCERCUS;

			case SINODUNBARIA:
				return ModTriggers.CLICK_PALAEODICTYOPTERA_SINODUNBARIA;

			case STENODICTYA:
				return ModTriggers.CLICK_PALAEODICTYOPTERA_STENODICTYA;

			case MAZOTHAIROS:
				return ModTriggers.CLICK_PALAEODICTYOPTERA_MAZOTHAIROS;

			case PSYCHROPTILUS:
				return ModTriggers.CLICK_PALAEODICTYOPTERA_PSYCHROPTILUS;
		}
	}

	public enum Type
	{
		DELITZSCHALA(1, "delitzschala"),
		DUNBARIA(2, "dunbaria"),
		HOMALONEURA(3, "homaloneura"),
		HOMOIOPTERA(4, "homoioptera"),
		LITHOMANTIS(5, "lithomantis"),
		LYCOCERCUS(6, "lycocercus"),
		SINODUNBARIA(7, "sinodunbaria"),
		STENODICTYA(8, "stenodictya"),
		MAZOTHAIROS(9, "mazothairos"),
		PSYCHROPTILUS(10, "psychroptilus")
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
			case DELITZSCHALA: default:
				return LepidodendronMod.PALAEODICTYOPTERA_DELITZSCHALA_LOOT_JAR;

			case DUNBARIA:
				return LepidodendronMod.PALAEODICTYOPTERA_DUNBARIA_LOOT_JAR;

			case HOMALONEURA:
				return LepidodendronMod.PALAEODICTYOPTERA_HOMALONEURA_LOOT_JAR;

			case HOMOIOPTERA:
				return LepidodendronMod.PALAEODICTYOPTERA_HOMOIOPTERA_LOOT_JAR;

			case LITHOMANTIS:
				return LepidodendronMod.PALAEODICTYOPTERA_LITHOMANTIS_LOOT_JAR;

			case LYCOCERCUS:
				return LepidodendronMod.PALAEODICTYOPTERA_LYCOCERCUS_LOOT_JAR;

			case SINODUNBARIA:
				return LepidodendronMod.PALAEODICTYOPTERA_SINODUNBARIA_LOOT_JAR;

			case STENODICTYA:
				return LepidodendronMod.PALAEODICTYOPTERA_STENODICTYA_LOOT_JAR;

			case MAZOTHAIROS:
				return LepidodendronMod.PALAEODICTYOPTERA_MAZOTHAIROS_LOOT_JAR;

			case PSYCHROPTILUS:
				return LepidodendronMod.PALAEODICTYOPTERA_PSYCHROPTILUS_LOOT_JAR;
		}
	}

	public ResourceLocation getStandardLoot() {
		switch (this.getPNType()) {
			case DELITZSCHALA: default:
				return LepidodendronMod.PALAEODICTYOPTERA_DELITZSCHALA_LOOT;

			case DUNBARIA:
				return LepidodendronMod.PALAEODICTYOPTERA_DUNBARIA_LOOT;

			case HOMALONEURA:
				return LepidodendronMod.PALAEODICTYOPTERA_HOMALONEURA_LOOT;

			case HOMOIOPTERA:
				return LepidodendronMod.PALAEODICTYOPTERA_HOMOIOPTERA_LOOT;

			case LITHOMANTIS:
				return LepidodendronMod.PALAEODICTYOPTERA_LITHOMANTIS_LOOT;

			case LYCOCERCUS:
				return LepidodendronMod.PALAEODICTYOPTERA_LYCOCERCUS_LOOT;

			case SINODUNBARIA:
				return LepidodendronMod.PALAEODICTYOPTERA_SINODUNBARIA_LOOT;

			case STENODICTYA:
				return LepidodendronMod.PALAEODICTYOPTERA_STENODICTYA_LOOT;

			case MAZOTHAIROS:
				return LepidodendronMod.PALAEODICTYOPTERA_MAZOTHAIROS_LOOT;

			case PSYCHROPTILUS:
				return LepidodendronMod.PALAEODICTYOPTERA_PSYCHROPTILUS_LOOT;
		}
	}

	public float getFlySpeed() {
		switch (this.getPNType()) {
			case DELITZSCHALA: default:
				return 3f;

			case DUNBARIA:
				return 3f;

			case HOMALONEURA:
				return 3f;

			case HOMOIOPTERA:
				return 3f;

			case LITHOMANTIS:
				return 3f;

			case LYCOCERCUS:
				return 3f;

			case SINODUNBARIA:
				return 3f;

			case STENODICTYA:
				return 3f;

			case MAZOTHAIROS:
				return 3f;

			case PSYCHROPTILUS:
				return 3f;
		}
	}

	public float[] getHitBoxSize() {
		switch (this.getPNType()) {
			case DELITZSCHALA: default:
				return DELITZSCHALA_SIZE;

			case DUNBARIA:
				return DUNBARIA_SIZE;

			case HOMALONEURA:
				return HOMALONEURA_SIZE;

			case HOMOIOPTERA:
				return HOMOIOPTERA_SIZE;

			case LITHOMANTIS:
				return LITHOMANTIS_SIZE;

			case LYCOCERCUS:
				return LYCOCERCUS_SIZE;

			case SINODUNBARIA:
				return SINODUNBARIA_SIZE;

			case STENODICTYA:
				return STENODICTYA_SIZE;

			case MAZOTHAIROS:
				return MAZOTHAIROS_SIZE;

			case PSYCHROPTILUS:
				return PSYCHROPTILUS_SIZE;
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
		this.setPNType(Type.byId(rand.nextInt(Type.values().length) + 1));
		this.setSizer(this.getHitBoxSize()[0], this.getHitBoxSize()[1]);
		return livingdata;
	}

	@Override
	public void onLivingUpdate() {
		super.onLivingUpdate();
		this.setSizer(this.getHitBoxSize()[0], this.getHitBoxSize()[1]);
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
		if (target.entityHit instanceof EntityPrehistoricFloraPalaeodictyoptera) {
			EntityPrehistoricFloraPalaeodictyoptera palaeodictyoptera = (EntityPrehistoricFloraPalaeodictyoptera) target.entityHit;
			switch (palaeodictyoptera.getPNType()) {
				case DELITZSCHALA: default:
					return new ItemStack(ItemSpawnEggPalaeodictyopteraDelitzschala.block, 1);

				case DUNBARIA:
					return new ItemStack(ItemSpawnEggPalaeodictyopteraDunbaria.block, 1);

				case HOMALONEURA:
					return new ItemStack(ItemSpawnEggPalaeodictyopteraHomaloneura.block, 1);

				case HOMOIOPTERA:
					return new ItemStack(ItemSpawnEggPalaeodictyopteraHomoioptera.block, 1);

				case LITHOMANTIS:
					return new ItemStack(ItemSpawnEggPalaeodictyopteraLithomantis.block, 1);

				case LYCOCERCUS:
					return new ItemStack(ItemSpawnEggPalaeodictyopteraLycocercus.block, 1);

				case MAZOTHAIROS:
					return new ItemStack(ItemSpawnEggPalaeodictyopteraMazothairos.block, 1);

				case SINODUNBARIA:
					return new ItemStack(ItemSpawnEggPalaeodictyopteraSinodunbaria.block, 1);

				case STENODICTYA:
					return new ItemStack(ItemSpawnEggPalaeodictyopteraStenodictya.block, 1);

				case PSYCHROPTILUS:
					return new ItemStack(ItemSpawnEggPalaeodictyopteraPsychroptilus.block, 1);
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
			return I18n.translateToLocal("entity.prehistoric_flora_palaeodictyoptera_" + this.getPNType().getName() + ".name");
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

	@Nullable
	public Type getPNType()
	{
		return Type.byId(((Integer)this.dataManager.get(INSECT_TYPE)).intValue());
	}

	@Override
	public String getPNTypeName()
	{
		return this.getPNType().getName();
	}

	//*****************************************************

	@Override
	public boolean canJar() {
		return true;
	}

	public static String getPeriod() {return "mid Carboniferous - early Permian";}

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
		this.getEntityAttribute(SharedMonsterAttributes.MAX_HEALTH).setBaseValue(Math.floor(this.getHitBoxSize()[0] * 15F));
		//this.getEntityAttribute(SharedMonsterAttributes.MAX_HEALTH).setBaseValue(5.0D);
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

	//Rendering taxidermy:
	//--------------------
	public static double offsetCase(@Nullable String variant) {
		switch (EntityPrehistoricFloraPalaeodictyoptera.Type.getTypeFromString(variant)) {
			case DELITZSCHALA: default:
				return 0.30;
				
			case DUNBARIA:
				return 0.27;

			case HOMALONEURA:
				return 0.34;

			case HOMOIOPTERA:
				return 0.29;

			case LITHOMANTIS:
				return 0.30;

			case LYCOCERCUS:
				return 0.31;

			case SINODUNBARIA:
				return 0.27;

			case STENODICTYA:
				return 0.36;

			case PSYCHROPTILUS:
				return 0.27;
		}
	}

	public static double offsetWall(@Nullable String variant) {
		switch (EntityPrehistoricFloraPalaeodictyoptera.Type.getTypeFromString(variant)) {
			case DELITZSCHALA: default:
				return 0.01;

			case DUNBARIA:
				return 0.01;

			case HOMALONEURA:
				return 0.01;

			case HOMOIOPTERA:
				return 0.01;

			case LITHOMANTIS:
				return 0.01;

			case LYCOCERCUS:
				return 0.01;

			case SINODUNBARIA:
				return 0.01;

			case STENODICTYA:
				return 0.01;

			case MAZOTHAIROS:
				return 0.01;

			case PSYCHROPTILUS:
				return 0.01;
		}
	}

	public static double upperfrontverticallinedepth(@Nullable String variant) {
		return 0.0;
	}
	public static double upperbackverticallinedepth(@Nullable String variant) {
		return 0.67;
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
		return -0.0F;
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
		return -0.6F;
	}
	public static double lowerbacklineoffset(@Nullable String variant) {
		return -0.0;
	}
	public static double lowerbacklineoffsetperpendiular(@Nullable String variant) {
		return 0F;
	}
	public static float widthSupport(@Nullable String variant) {return 0.01F;}

	@SideOnly(Side.CLIENT)
	public static ResourceLocation textureDisplay(@Nullable String variant) {
		switch (EntityPrehistoricFloraPalaeodictyoptera.Type.getTypeFromString(variant)) {
			case DELITZSCHALA:
			default:
				return RenderPalaeodictyoptera.TEXTURE_DELITZSCHALA;

			case DUNBARIA:
				return RenderPalaeodictyoptera.TEXTURE_DUNBARIA;

			case HOMALONEURA:
				return RenderPalaeodictyoptera.TEXTURE_HOMALONEURA;

			case HOMOIOPTERA:
				return RenderPalaeodictyoptera.TEXTURE_HOMOIOPTERA;

			case LITHOMANTIS:
				return RenderPalaeodictyoptera.TEXTURE_LITHOMANTIS;

			case LYCOCERCUS:
				return RenderPalaeodictyoptera.TEXTURE_LYCOCERCUS;

			case SINODUNBARIA:
				return RenderPalaeodictyoptera.TEXTURE_SINODUNBARIA;

			case STENODICTYA:
				return RenderPalaeodictyoptera.TEXTURE_STENODICTYA;

			case MAZOTHAIROS:
				return RenderPalaeodictyoptera.TEXTURE_MAZOTHAIROS;

			case PSYCHROPTILUS:
				return RenderPalaeodictyoptera.TEXTURE_PSYCHROPTILUS;
		}
	}

	@SideOnly(Side.CLIENT)
	public static ResourceLocation textureDisplayTransparent(@Nullable String variant) {
		switch (EntityPrehistoricFloraPalaeodictyoptera.Type.getTypeFromString(variant)) {
			case DELITZSCHALA:
			default:
				return LayerPalaeodictyopteraWing.TEXTURE_DELITZSCHALA;

			case DUNBARIA:
				return LayerPalaeodictyopteraWing.TEXTURE_DUNBARIA;

			case HOMALONEURA:
				return LayerPalaeodictyopteraWing.TEXTURE_HOMALONEURA;

			case HOMOIOPTERA:
				return LayerPalaeodictyopteraWing.TEXTURE_HOMOIOPTERA;

			case LITHOMANTIS:
				return LayerPalaeodictyopteraWing.TEXTURE_LITHOMANTIS;

			case LYCOCERCUS:
				return LayerPalaeodictyopteraWing.TEXTURE_LYCOCERCUS;

			case SINODUNBARIA:
				return LayerPalaeodictyopteraWing.TEXTURE_SINODUNBARIA;

			case STENODICTYA:
				return LayerPalaeodictyopteraWing.TEXTURE_STENODICTYA;

			case MAZOTHAIROS:
				return LayerPalaeodictyopteraWing.TEXTURE_MAZOTHAIROS;

			case PSYCHROPTILUS:
				return LayerPalaeodictyopteraWing.TEXTURE_PSYCHROPTILUS;
		}
	}

	@SideOnly(Side.CLIENT)
	public static ModelBase modelDisplay(@Nullable String variant) {
		switch (EntityPrehistoricFloraPalaeodictyoptera.Type.getTypeFromString(variant)) {
			case DELITZSCHALA:
			default:
				return RenderDisplays.modelPalaeodictyopteraSmall;

			case DUNBARIA:
				return RenderDisplays.modelPalaeodictyopteraMedium;

			case HOMALONEURA:
				return RenderDisplays.modelPalaeodictyopteraMedium;

			case HOMOIOPTERA:
				return RenderDisplays.modelPalaeodictyopteraLarge;

			case LITHOMANTIS:
				return RenderDisplays.modelPalaeodictyopteraMedium;

			case LYCOCERCUS:
				return RenderDisplays.modelPalaeodictyopteraMedium;

			case SINODUNBARIA:
				return RenderDisplays.modelPalaeodictyopteraSmall;

			case STENODICTYA:
				return RenderDisplays.modelPalaeodictyopteraMedium;

			case MAZOTHAIROS:
				return RenderDisplays.modelPalaeodictyopteraLarge;

			case PSYCHROPTILUS:
				return RenderDisplays.modelPalaeodictyopteraSmall;
		}
	}

	public static float getScaler(@Nullable String variant) {
		return RenderPalaeodictyoptera.getScaler(EntityPrehistoricFloraPalaeodictyoptera.Type.getTypeFromString(variant));
	}

	@Override
	public String[] getFoodOreDicts() {
		return ArrayUtils.addAll(DietString.PLANTS);
	}

	@Override
	public void onEntityUpdate() {
		super.onEntityUpdate();

		EggLayingConditions.layWaterBottomEggsNoPause(this);
	}

}