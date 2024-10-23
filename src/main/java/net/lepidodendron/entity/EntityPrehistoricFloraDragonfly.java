
package net.lepidodendron.entity;

import net.ilexiconn.llibrary.server.animation.Animation;
import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.block.BlockGlassJar;
import net.lepidodendron.block.BlockInsectEggsDragonfly;
import net.lepidodendron.entity.ai.DietString;
import net.lepidodendron.entity.base.EntityPrehistoricFloraInsectFlyingBase;
import net.lepidodendron.entity.render.entity.RenderDragonfly;
import net.lepidodendron.entity.render.tile.RenderDisplays;
import net.lepidodendron.entity.util.ITrappableAir;
import net.lepidodendron.item.entities.spawneggs.ItemSpawnEggDragonfly;
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

public class EntityPrehistoricFloraDragonfly extends EntityPrehistoricFloraInsectFlyingBase implements ITrappableAir {

	private int animationTick;
	private Animation animation = NO_ANIMATION;
	private int hoverCooldown;
	private int hoverTick;

	private static final float[] SIZE_1 = new float[]{0.3F, 0.2F};
	private static final float[] SIZE_2 = new float[]{0.3F, 0.2F};
	private static final float[] SIZE_3 = new float[]{0.3F, 0.2F};
	private static final float[] SIZE_4 = new float[]{0.3F, 0.2F};
	private static final float[] SIZE_5 = new float[]{0.3F, 0.2F};
	private static final float[] SIZE_6 = new float[]{0.3F, 0.2F};
	private static final float[] SIZE_7 = new float[]{0.3F, 0.2F};
	private static final float[] SIZE_8 = new float[]{0.3F, 0.2F};
	private static final float[] SIZE_9 = new float[]{0.3F, 0.2F};
	private static final float[] SIZE_10 = new float[]{0.3F, 0.2F};

	private static final DataParameter<Integer> INSECT_TYPE = EntityDataManager.<Integer>createKey(EntityPrehistoricFloraDragonfly.class, DataSerializers.VARINT);

	public EntityPrehistoricFloraDragonfly(World world) {
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
					if (((EntityPrehistoricFloraDragonfly)otherAnimal).getPNType() == this.getPNType()) {
						return false;
					}
					break;

				case 1:
					if (((EntityPrehistoricFloraDragonfly)otherAnimal).getPNType() != this.getPNType()) {
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
		if (target.entityHit instanceof EntityPrehistoricFloraDragonfly) {
			return new ItemStack(ItemSpawnEggDragonfly.block, 1);
		}
		return ItemStack.EMPTY;
	}

	@Override
	public boolean hasPNVariants() {
		return true;
	}

	public enum Type
	{
		DRAGONFLY1(1, "dragonfly1"),
		DRAGONFLY2(2, "dragonfly2"),
		DRAGONFLY3(3, "dragonfly3"),
		DRAGONFLY4(4, "dragonfly4"),
		DRAGONFLY5(5, "dragonfly5"),
		DRAGONFLY6(6, "dragonfly6"),
		DRAGONFLY7(7, "dragonfly7"),
		DRAGONFLY8(8, "dragonfly8"),
		DRAGONFLY9(9, "dragonfly9"),
		DRAGONFLY10(10, "dragonfly10")
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
			case DRAGONFLY1: default:
				return LepidodendronMod.DRAGONFLY1_LOOT_JAR;

			case DRAGONFLY2:
				return LepidodendronMod.DRAGONFLY2_LOOT_JAR;

			case DRAGONFLY3:
				return LepidodendronMod.DRAGONFLY3_LOOT_JAR;

			case DRAGONFLY4:
				return LepidodendronMod.DRAGONFLY4_LOOT_JAR;

			case DRAGONFLY5:
				return LepidodendronMod.DRAGONFLY5_LOOT_JAR;

			case DRAGONFLY6:
				return LepidodendronMod.DRAGONFLY6_LOOT_JAR;

			case DRAGONFLY7:
				return LepidodendronMod.DRAGONFLY7_LOOT_JAR;

			case DRAGONFLY8:
				return LepidodendronMod.DRAGONFLY8_LOOT_JAR;

			case DRAGONFLY9:
				return LepidodendronMod.DRAGONFLY9_LOOT_JAR;

			case DRAGONFLY10:
				return LepidodendronMod.DRAGONFLY10_LOOT_JAR;
		}
	}

	public ResourceLocation getStandardLoot() {
		return LepidodendronMod.BUG_LOOT;
	}

	public float getFlySpeed() {
		switch (this.getPNType()) {
			case DRAGONFLY1: default:
				return 3f;

			case DRAGONFLY2:
				return 3f;

			case DRAGONFLY3:
				return 3f;

			case DRAGONFLY4:
				return 3f;

			case DRAGONFLY5:
				return 3f;

			case DRAGONFLY6:
				return 3f;

			case DRAGONFLY7:
				return 3f;

			case DRAGONFLY8:
				return 3f;

			case DRAGONFLY9:
				return 3f;

			case DRAGONFLY10:
				return 3f;
		}
	}

	public float[] getHitBoxSize() {
		switch (this.getPNType()) {
			case DRAGONFLY1: default:
				return SIZE_1;

			case DRAGONFLY2:
				return SIZE_2;

			case DRAGONFLY3:
				return SIZE_3;

			case DRAGONFLY4:
				return SIZE_4;

			case DRAGONFLY5:
				return SIZE_5;

			case DRAGONFLY6:
				return SIZE_6;

			case DRAGONFLY7:
				return SIZE_7;

			case DRAGONFLY8:
				return SIZE_8;

			case DRAGONFLY9:
				return SIZE_9;

			case DRAGONFLY10:
				return SIZE_10;
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

	public void onEntityUpdate() {
		if (!world.isRemote) {
			if (this.hoverTick > 0) {
				this.hoverTick--;
			}
			if (this.hoverCooldown > 0 && (!(hoverTick > 0))) {
				this.hoverCooldown--;
			}
			if (this.hoverCooldown == 0 && this.hoverTick == 0) {
				this.hoverTick = 100 + this.rand.nextInt(200);
				this.hoverCooldown = 300 + this.rand.nextInt(300);
			}

			//System.err.println("this.hoverTick " + this.hoverTick);
			//System.err.println("this.hoverCooldown " + this.hoverCooldown);
		}

		super.onEntityUpdate();

		if (!world.isRemote) {
			if (this.hoverTick > 0) {
				this.motionX = 0;
				this.motionY = 0;
				this.motionZ = 0;
			}
		}
	}

	@Override
	public IEntityLivingData onInitialSpawn(DifficultyInstance difficulty, @Nullable IEntityLivingData livingdata) {
		livingdata = super.onInitialSpawn(difficulty, livingdata);
		this.setPNType(Type.byId(rand.nextInt(Type.values().length) + 1));
		this.hoverCooldown = 300 + this.rand.nextInt(300);
		this.hoverTick = 0;
		return livingdata;
	}

	@Override
	public String getName() {
		if (this.hasCustomName())
		{
			return this.getCustomNameTag();
		}
		else if (this.dataManager.get(INSECT_TYPE) < 1) {
			return I18n.translateToLocal("entity.prehistoric_flora_dragonfly.name");
		}
		else
		{
			return I18n.translateToLocal("entity.prehistoric_flora_dragonfly_" + this.getPNType().getName() + ".name");
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

	public static String getPeriod() {return "Jurassic - Cretaceous - Paleogene - Neogene - Pleistocene [- present]";}

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
	public IBlockState getEggBlockState() {
		return BlockInsectEggsDragonfly.block.getDefaultState();
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
		if (!world.isRemote) {
			if (this.hoverTick > 0) {
				return 0.0F; //Is static for hovering
			}
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
		this.getEntityAttribute(SharedMonsterAttributes.MAX_HEALTH).setBaseValue(2.0D);
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
		return new ResourceLocation("lepidodendron:dragonfly_flight");
	}

	@Override
	public String[] getFoodOreDicts() {
		return ArrayUtils.addAll(DietString.BUG);
	}

	//Rendering taxidermy:
	//--------------------
	public static double offsetCase(@Nullable String variant) {
		switch (EntityPrehistoricFloraDragonfly.Type.getTypeFromString(variant)) {
			case DRAGONFLY1: default:
				return 0.30;

			case DRAGONFLY2:
				return 0.30;

			case DRAGONFLY3:
				return 0.30;

			case DRAGONFLY4:
				return 0.30;

			case DRAGONFLY5:
				return 0.30;

			case DRAGONFLY6:
				return 0.30;

			case DRAGONFLY7:
				return 0.30;

			case DRAGONFLY8:
				return 0.30;

			case DRAGONFLY9:
				return 0.30;

			case DRAGONFLY10:
				return 0.30;
		}
	}

	public static double offsetWall(@Nullable String variant) {
		switch (EntityPrehistoricFloraDragonfly.Type.getTypeFromString(variant)) {
			case DRAGONFLY1: default:
				return 0.30;

			case DRAGONFLY2:
				return 0.30;

			case DRAGONFLY3:
				return 0.30;

			case DRAGONFLY4:
				return 0.30;

			case DRAGONFLY5:
				return 0.30;

			case DRAGONFLY6:
				return 0.30;

			case DRAGONFLY7:
				return 0.30;

			case DRAGONFLY8:
				return 0.30;

			case DRAGONFLY9:
				return 0.30;

			case DRAGONFLY10:
				return 0.30;
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
		switch (EntityPrehistoricFloraDragonfly.Type.getTypeFromString(variant)) {
			case DRAGONFLY1:
			default:
				return RenderDragonfly.TEXTURE_DRAGONFLY1;

			case DRAGONFLY2:
				return RenderDragonfly.TEXTURE_DRAGONFLY2;

			case DRAGONFLY3:
				return RenderDragonfly.TEXTURE_DRAGONFLY3;

			case DRAGONFLY4:
				return RenderDragonfly.TEXTURE_DRAGONFLY4;

			case DRAGONFLY5:
				return RenderDragonfly.TEXTURE_DRAGONFLY5;

			case DRAGONFLY6:
				return RenderDragonfly.TEXTURE_DRAGONFLY6;

			case DRAGONFLY7:
				return RenderDragonfly.TEXTURE_DRAGONFLY7;

			case DRAGONFLY8:
				return RenderDragonfly.TEXTURE_DRAGONFLY8;

			case DRAGONFLY9:
				return RenderDragonfly.TEXTURE_DRAGONFLY9;

			case DRAGONFLY10:
				return RenderDragonfly.TEXTURE_DRAGONFLY10;
		}
	}
	@SideOnly(Side.CLIENT)
	public static ModelBase modelDisplay(@Nullable String variant) {
		switch (EntityPrehistoricFloraDragonfly.Type.getTypeFromString(variant)) {
			case DRAGONFLY1:
			default:
				return RenderDisplays.modelDragonfly;

			case DRAGONFLY2:
				return RenderDisplays.modelDragonfly;

			case DRAGONFLY3:
				return RenderDisplays.modelDragonfly;

			case DRAGONFLY4:
				return RenderDisplays.modelDragonfly;

			case DRAGONFLY5:
				return RenderDisplays.modelDragonfly;

			case DRAGONFLY6:
				return RenderDisplays.modelDragonfly;

			case DRAGONFLY7:
				return RenderDisplays.modelDragonfly;

			case DRAGONFLY8:
				return RenderDisplays.modelDragonfly;

			case DRAGONFLY9:
				return RenderDisplays.modelDragonfly;

			case DRAGONFLY10:
				return RenderDisplays.modelDragonfly;
		}
	}

	public static float getScaler(@Nullable String variant) {
		return RenderDragonfly.getScaler(EntityPrehistoricFloraDragonfly.Type.getTypeFromString(variant));
	}
}