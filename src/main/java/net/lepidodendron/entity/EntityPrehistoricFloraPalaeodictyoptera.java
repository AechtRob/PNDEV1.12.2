
package net.lepidodendron.entity;

import net.ilexiconn.llibrary.server.animation.Animation;
import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.block.BlockGlassJar;
import net.lepidodendron.block.BlockInsectEggsPalaeodictyoptera;
import net.lepidodendron.entity.base.EntityPrehistoricFloraInsectFlyingBase;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.IEntityLivingData;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.passive.EntityAnimal;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemMonsterPlacer;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.network.datasync.DataParameter;
import net.minecraft.network.datasync.DataSerializers;
import net.minecraft.network.datasync.EntityDataManager;
import net.minecraft.util.DamageSource;
import net.minecraft.util.EnumHand;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.text.translation.I18n;
import net.minecraft.world.DifficultyInstance;
import net.minecraft.world.World;
import net.minecraft.world.WorldServer;
import net.minecraft.world.storage.loot.LootContext;
import net.minecraft.world.storage.loot.LootTable;

import javax.annotation.Nullable;

public class EntityPrehistoricFloraPalaeodictyoptera extends EntityPrehistoricFloraInsectFlyingBase {

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

	private static final DataParameter<Integer> INSECT_TYPE = EntityDataManager.<Integer>createKey(EntityPrehistoricFloraPalaeodictyoptera.class, DataSerializers.VARINT);

	public EntityPrehistoricFloraPalaeodictyoptera(World world) {
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
		else if (((EntityPrehistoricFloraPalaeodictyoptera)otherAnimal).getPNType() != this.getPNType()) {
			return false;
		}
		return this.isInLove() && otherAnimal.isInLove();
	}

	@Override
	public boolean processInteract(EntityPlayer player, EnumHand hand) {
		if (player.getHeldItem(hand).getItem() instanceof ItemMonsterPlacer) {
			//Cycle the variants:
			ResourceLocation resourceLocation = ItemMonsterPlacer.getNamedIdFrom(player.getHeldItem(hand));
			if (resourceLocation.toString().equalsIgnoreCase("lepidodendron:prehistoric_flora_palaeodictyoptera")) {
				if (!player.capabilities.isCreativeMode)
				{
					player.getHeldItem(hand).shrink(1);
				}
				int type = this.getPNType().ordinal();
				type = type + 1;
				if (type > Type.values().length) {
					type = 0;
				}
				this.setPNType(Type.byId(type));

				float f = this.width;
				this.width = getHitBoxSize()[0];
				this.height = getHitBoxSize()[1];
				if (this.width != f) {
					double d0 = (double) width / 2.0D;
					this.setEntityBoundingBox(new AxisAlignedBB(this.posX - d0, this.posY, this.posZ - d0, this.posX + d0, this.posY + (double) this.height, this.posZ + d0));
				}
			}
		}

		return super.processInteract(player, hand);
	}

	@Override
	public boolean hasPNVariants() {
		return true;
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
		MAZOTHAIROS(9, "mazothairos")
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
			return I18n.translateToLocal("entity.prehistoric_flora_palaeodictyoptera_" + this.getPNType().getName() + ".name");
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
	public IBlockState getEggBlockState() {
		return BlockInsectEggsPalaeodictyoptera.block.getDefaultState();
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
		this.getEntityAttribute(SharedMonsterAttributes.MAX_HEALTH).setBaseValue(5.0D);
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

}