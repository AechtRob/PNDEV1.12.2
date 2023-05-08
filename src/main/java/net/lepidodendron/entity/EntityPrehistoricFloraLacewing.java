
package net.lepidodendron.entity;

import net.ilexiconn.llibrary.server.animation.Animation;
import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.block.BlockGlassJar;
import net.lepidodendron.block.BlockInsectEggsPalaeodictyoptera;
import net.lepidodendron.entity.base.EntityPrehistoricFloraInsectFlyingBase;
import net.lepidodendron.item.entities.ItemBugRaw;
import net.minecraft.block.state.IBlockState;
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
import net.minecraft.util.text.translation.I18n;
import net.minecraft.world.DifficultyInstance;
import net.minecraft.world.World;
import net.minecraft.world.WorldServer;
import net.minecraft.world.storage.loot.LootContext;
import net.minecraft.world.storage.loot.LootTable;
import net.minecraftforge.oredict.OreDictionary;

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

//	@Override
//	public boolean processInteract(EntityPlayer player, EnumHand hand) {
//		if (player.getHeldItem(hand).getItem() instanceof ItemMonsterPlacer) {
//			//Cycle the variants:
//			ResourceLocation resourceLocation = ItemMonsterPlacer.getNamedIdFrom(player.getHeldItem(hand));
//			if (resourceLocation.toString().equalsIgnoreCase("lepidodendron:prehistoric_flora_palaeodictyoptera")) {
//				if (!player.capabilities.isCreativeMode)
//				{
//					player.getHeldItem(hand).shrink(1);
//				}
//				int type = this.getPNType().ordinal();
//				type = type + 1;
//				if (type > Type.values().length) {
//					type = 0;
//				}
//				this.setPNType(Type.byId(type));
//
//				float f = this.width;
//				this.width = getHitBoxSize()[0];
//				this.height = getHitBoxSize()[1];
//				if (this.width != f) {
//					double d0 = (double) width / 2.0D;
//					this.setEntityBoundingBox(new AxisAlignedBB(this.posX - d0, this.posY, this.posZ - d0, this.posX + d0, this.posY + (double) this.height, this.posZ + d0));
//				}
//			}
//		}
//
//		return super.processInteract(player, hand);
//	}

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
		switch (this.getPNType()) {
			case AETHEOGRAMMA: default:
				return LepidodendronMod.LACEWING_AETHEOGRAMMA_LOOT;

			case CRETAPSYCHOPS:
				return LepidodendronMod.LACEWING_CRETAPSYCHOPS_LOOT;

			case LACCOSMYLUS:
				return LepidodendronMod.LACEWING_LACCOSMYLUS_LOOT;

			case LICHENIPOLYSTOECHOTES:
				return LepidodendronMod.LACEWING_LICHENIPOLYSTOECHOTES_LOOT;

			case BELLINYMPHA:
				return LepidodendronMod.LACEWING_BELLINYMPHA_LOOT;

			case GRAMMOLINGIA:
				return LepidodendronMod.LACEWING_GRAMMOLINGIA_LOOT;
		}
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

	@Override
	public boolean isBreedingItem(ItemStack stack)
	{
		return stack.getItem() == ItemBugRaw.block;
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
		return false;
	}

	@Override
	public boolean laysEggs() {
		return true;
	}

	//TODO Make lacewing eggs
	@Override
	public IBlockState getEggBlockState() {
		return null; //BlockInsectEggsLacewing.block.getDefaultState();
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

}