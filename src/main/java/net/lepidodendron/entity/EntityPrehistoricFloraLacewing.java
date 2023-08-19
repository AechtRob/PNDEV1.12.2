
package net.lepidodendron.entity;

import net.ilexiconn.llibrary.server.animation.Animation;
import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.block.BlockGlassJar;
import net.lepidodendron.entity.ai.DietString;
import net.lepidodendron.entity.base.EntityPrehistoricFloraInsectFlyingBase;
import net.lepidodendron.entity.render.entity.LayerPalaeodictyopteraWing;
import net.lepidodendron.entity.render.entity.RenderLacewing;
import net.lepidodendron.entity.render.entity.RenderLacewing;
import net.lepidodendron.entity.render.tile.RenderDisplays;
import net.lepidodendron.item.ItemLacewingEggsItem;
import net.lepidodendron.item.entities.spawneggs.*;
import net.minecraft.block.state.IBlockState;
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

public class EntityPrehistoricFloraLacewing extends EntityPrehistoricFloraInsectFlyingBase {

	private int animationTick;
	private Animation animation = NO_ANIMATION;

	private static final float[] AETHEOGRAMMA_SIZE = new float[]{0.2F, 0.2F};
	private static final float[] CRETAPSYCHOPS_SIZE = new float[]{0.2F, 0.2F};
	private static final float[] LACCOSMYLUS_SIZE = new float[]{0.2F, 0.2F};
	private static final float[] LICHENIPOLYSTOECHOTES_SIZE = new float[]{0.2F, 0.2F};
	private static final float[] BELLINYMPHA_SIZE = new float[]{0.2F, 0.2F};
	private static final float[] GRAMMOLINGIA_SIZE = new float[]{0.2F, 0.2F};

	private static final DataParameter<Integer> INSECT_TYPE = EntityDataManager.<Integer>createKey(EntityPrehistoricFloraLacewing.class, DataSerializers.VARINT);

	public EntityPrehistoricFloraLacewing(World world) {
		super(world);

	//*****************************************************
	//Insect variant managers:

		setSize(getHitBoxSize()[0], getHitBoxSize()[1]);
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
		else if (((EntityPrehistoricFloraLacewing)otherAnimal).getPNType() != this.getPNType()) {
			return false;
		}
		return this.isInLove() && otherAnimal.isInLove();
	}

	@Override
	public ItemStack getPickedResult(RayTraceResult target)
	{
		if (target.entityHit instanceof EntityPrehistoricFloraLacewing) {
			EntityPrehistoricFloraLacewing Lacewing = (EntityPrehistoricFloraLacewing) target.entityHit;
			switch (Lacewing.getPNType()) {
				case AETHEOGRAMMA: default:
					return new ItemStack(ItemSpawnEggLacewingAetheogramma.block, 1);

				case CRETAPSYCHOPS:
					return new ItemStack(ItemSpawnEggLacewingCretapsychops.block, 1);

				case LACCOSMYLUS:
					return new ItemStack(ItemSpawnEggLacewingLaccosmylus.block, 1);

				case LICHENIPOLYSTOECHOTES:
					return new ItemStack(ItemSpawnEggLacewingLichenipolystoechotes.block, 1);

				case BELLINYMPHA:
					return new ItemStack(ItemSpawnEggLacewingBellinympha.block, 1);

				case GRAMMOLINGIA:
					return new ItemStack(ItemSpawnEggLacewingGrammolingia.block, 1);

			}
		}
		return ItemStack.EMPTY;
	}

	@Override
	public boolean hasPNVariants() {
		return true;
	}

	public enum Type
	{
		AETHEOGRAMMA(1, "aetheogramma"),
		CRETAPSYCHOPS(2, "cretapsychops"),
		LACCOSMYLUS(3, "laccosmylus"),
		LICHENIPOLYSTOECHOTES(4, "lichenipolystoechotes"),
		BELLINYMPHA(5, "bellinympha"),
		GRAMMOLINGIA(6, "grammolingia")
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
			case AETHEOGRAMMA: default:
				return LepidodendronMod.LACEWING_AETHEOGRAMMA_LOOT_JAR;

			case CRETAPSYCHOPS:
				return LepidodendronMod.LACEWING_CRETAPSYCHOPS_LOOT_JAR;

			case LACCOSMYLUS:
				return LepidodendronMod.LACEWING_LACCOSMYLUS_LOOT_JAR;

			case LICHENIPOLYSTOECHOTES:
				return LepidodendronMod.LACEWING_LICHENIPOLYSTOECHOTES_LOOT_JAR;

			case BELLINYMPHA:
				return LepidodendronMod.LACEWING_BELLINYMPHA_LOOT_JAR;

			case GRAMMOLINGIA:
				return LepidodendronMod.LACEWING_GRAMMOLINGIA_LOOT_JAR;
				
		}
	}

	public ResourceLocation getStandardLoot() {
		return LepidodendronMod.BUG_LOOT;
	}

	public float getFlySpeed() {
		switch (this.getPNType()) {
			case AETHEOGRAMMA: default:
				return 3f;

			case CRETAPSYCHOPS:
				return 3f;

			case LACCOSMYLUS:
				return 3f;

			case LICHENIPOLYSTOECHOTES:
				return 3f;

			case BELLINYMPHA:
				return 3f;

			case GRAMMOLINGIA:
				return 3f;

		}
	}

	public float[] getHitBoxSize() {
		switch (this.getPNType()) {
			case AETHEOGRAMMA: default:
				return AETHEOGRAMMA_SIZE;

			case CRETAPSYCHOPS:
				return CRETAPSYCHOPS_SIZE;

			case LACCOSMYLUS:
				return LACCOSMYLUS_SIZE;

			case LICHENIPOLYSTOECHOTES:
				return LICHENIPOLYSTOECHOTES_SIZE;

			case BELLINYMPHA:
				return BELLINYMPHA_SIZE;

			case GRAMMOLINGIA:
				return GRAMMOLINGIA_SIZE;
		}
	}

	@Nullable
	protected ResourceLocation getLootTable() {
		return getStandardLoot();
	}

	//Rendering taxidermy:
	//--------------------
	public static double offsetCase(@Nullable String variant) {
		switch (EntityPrehistoricFloraLacewing.Type.getTypeFromString(variant)) {
			case AETHEOGRAMMA: default:
				return 0.0;

			case CRETAPSYCHOPS:
				return 0.0;

			case LACCOSMYLUS:
				return 0.0;

			case LICHENIPOLYSTOECHOTES:
				return 0.0;

			case BELLINYMPHA:
				return 0.0;

			case GRAMMOLINGIA:
				return 0.0;
		}
	}

	public static double offsetWall(@Nullable String variant) {
		switch (EntityPrehistoricFloraLacewing.Type.getTypeFromString(variant)) {
			case AETHEOGRAMMA: default:
				return 0.0;

			case CRETAPSYCHOPS:
				return 0.0;

			case LACCOSMYLUS:
				return 0.0;

			case LICHENIPOLYSTOECHOTES:
				return 0.0;

			case BELLINYMPHA:
				return 0.0;

			case GRAMMOLINGIA:
				return 0.0;
		}
	}

	public static double upperfrontverticallinedepth(@Nullable String variant) {
		return 1.4;
	}
	public static double upperbackverticallinedepth(@Nullable String variant) {
		return 0.8;
	}
	public static double upperfrontlineoffset(@Nullable String variant) {
		return 0.4;
	}
	public static double upperfrontlineoffsetperpendiular(@Nullable String variant) {
		return -0F;
	}
	public static double upperbacklineoffset(@Nullable String variant) {
		return 0.4;
	}
	public static double upperbacklineoffsetperpendiular(@Nullable String variant) {
		return -0.15F;
	}
	public static double lowerfrontverticallinedepth(@Nullable String variant) {
		return 0;
	}
	public static double lowerbackverticallinedepth(@Nullable String variant) {
		return 0.95;
	}
	public static double lowerfrontlineoffset(@Nullable String variant) {
		return 0;
	}
	public static double lowerfrontlineoffsetperpendiular(@Nullable String variant) {
		return -0.6F;
	}
	public static double lowerbacklineoffset(@Nullable String variant) {
		return -0.06;
	}
	public static double lowerbacklineoffsetperpendiular(@Nullable String variant) {
		return 0F;
	}

	@SideOnly(Side.CLIENT)
	public static ResourceLocation textureDisplay(@Nullable String variant) {
		switch (EntityPrehistoricFloraLacewing.Type.getTypeFromString(variant)) {
			case AETHEOGRAMMA:
			default:
				return RenderLacewing.TEXTURE_AETHEOGRAMMA;

			case CRETAPSYCHOPS:
				return RenderLacewing.TEXTURE_CRETAPSYCHOPS;

			case LACCOSMYLUS:
				return RenderLacewing.TEXTURE_LACCOSMYLUS;

			case LICHENIPOLYSTOECHOTES:
				return RenderLacewing.TEXTURE_LICHENIPOLYSTOECHOTES;

			case BELLINYMPHA:
				return RenderLacewing.TEXTURE_BELLINYMPHA;

			case GRAMMOLINGIA:
				return RenderLacewing.TEXTURE_GRAMMOLINGIA;
		}
	}
	@SideOnly(Side.CLIENT)
	public static ModelBase modelDisplay(@Nullable String variant) {
		switch (EntityPrehistoricFloraLacewing.Type.getTypeFromString(variant)) {
			case AETHEOGRAMMA:
			default:
				return RenderDisplays.modelLacewing;

			case CRETAPSYCHOPS:
				return RenderDisplays.modelLacewing;

			case LACCOSMYLUS:
				return RenderDisplays.modelLacewing;

			case LICHENIPOLYSTOECHOTES:
				return RenderDisplays.modelLacewing;

			case BELLINYMPHA:
				return RenderDisplays.modelLacewing;

			case GRAMMOLINGIA:
				return RenderDisplays.modelLacewing;
		}
	}

	public static float getScaler(@Nullable String variant) {
		return RenderLacewing.getScaler(EntityPrehistoricFloraLacewing.Type.getTypeFromString(variant));
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
			return I18n.translateToLocal("entity.prehistoric_flora_lacewing_" + this.getPNType().getName() + ".name");
		}
	}

	public void writeEntityToNBT(NBTTagCompound compound) {
		super.writeEntityToNBT(compound);
		compound.setString("PNType", this.getPNType().getName());
	}

	public void readEntityFromNBT(NBTTagCompound compound) {
		super.readEntityFromNBT(compound);
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

	public static String getPeriod() {return "Jurassic - Cretaceous - Paleogene - Neogene - Pleistocene [-Present]";}

	//public static String getHabitat() {return "Terrestrial";}

	@Override
	public boolean dropsEggs() {
		return true;
	}

	@Override
	public IBlockState getEggBlockState() {
		return null;
	}

	@Override
	public ItemStack getDroppedEggItemStack() {
		ItemStack stack = new ItemStack(ItemLacewingEggsItem.block, (int) (1));
		NBTTagCompound variantNBT = new NBTTagCompound();
		variantNBT.setString("PNType", this.getPNType().getName());
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
		this.getEntityAttribute(SharedMonsterAttributes.MAX_HEALTH).setBaseValue(3.0D);
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
		return new ResourceLocation("lepidodendron:lacewing_flight");
	}

	@Override
	public String[] getFoodOreDicts() {
		return ArrayUtils.addAll(DietString.BUG);
	}

}