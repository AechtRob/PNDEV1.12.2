
package net.lepidodendron.entity;

import net.ilexiconn.llibrary.server.animation.Animation;
import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.block.BlockGlassJar;
import net.lepidodendron.entity.ai.*;
import net.lepidodendron.entity.base.EntityPrehistoricFloraCrawlingFlyingInsectBase;
import net.lepidodendron.item.entities.spawneggs.ItemSpawnEggTitanopteraClatrotitan;
import net.lepidodendron.item.entities.spawneggs.ItemSpawnEggTitanopteraGigatitan;
import net.lepidodendron.item.entities.spawneggs.ItemSpawnEggTitanopteraMesotitan;
import net.lepidodendron.util.CustomTrigger;
import net.lepidodendron.util.ModTriggers;
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
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.util.text.translation.I18n;
import net.minecraft.world.DifficultyInstance;
import net.minecraft.world.World;
import net.minecraft.world.WorldServer;
import net.minecraft.world.storage.loot.LootContext;
import net.minecraft.world.storage.loot.LootTable;
import net.minecraftforge.fml.common.registry.EntityRegistry;
import org.apache.commons.lang3.ArrayUtils;

import javax.annotation.Nullable;

public class EntityPrehistoricFloraTitanoptera extends EntityPrehistoricFloraArchoblattinaInsect {

	public BlockPos currentTarget;
	private int animationTick;
	private Animation animation = NO_ANIMATION;

	private static final float[] CLATROTITAN_SIZE = new float[]{0.3F, 0.21F};
	private static final float[] GIGATITAN_SIZE = new float[]{0.3F, 0.21F};
	private static final float[] MESOTITAN_SIZE = new float[]{0.3F, 0.21F};

	private static final DataParameter<Integer> INSECT_TYPE = EntityDataManager.<Integer>createKey(EntityPrehistoricFloraTitanoptera.class, DataSerializers.VARINT);

	public EntityPrehistoricFloraTitanoptera(World world) {
		super(world);

	//*****************************************************
	//Insect variant managers:

		setSize(getHitBoxSize()[0], getHitBoxSize()[1]);
	}

	@Nullable
	@Override
	public CustomTrigger getModTrigger() {
		switch (this.getPNType()) {
			case CLATROTITAN: default:
				return ModTriggers.CLICK_TITANOPTERA_CLATROTITAN;
			case GIGATITAN:
				return ModTriggers.CLICK_TITANOPTERA_GIGATITAN;
			case MESOTITAN:
				return ModTriggers.CLICK_TITANOPTERA_MESOTITAN;
		}
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
					if (((EntityPrehistoricFloraTitanoptera)otherAnimal).getPNType() == this.getPNType()) {
						return false;
					}
					break;

				case 1:
					if (((EntityPrehistoricFloraTitanoptera)otherAnimal).getPNType() != this.getPNType()) {
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

	public enum Type
	{
		CLATROTITAN(1, "clatrotitan"),
		GIGATITAN(2, "gigatitan"),
		MESOTITAN(3, "mesotitan")
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
			case CLATROTITAN: default:
				return LepidodendronMod.TITANOPTERA_CLATROTITAN_LOOT_JAR;

			case GIGATITAN:
				return LepidodendronMod.TITANOPTERA_GIGATITAN_LOOT_JAR;

			case MESOTITAN:
				return LepidodendronMod.TITANOPTERA_MESOTITAN_LOOT_JAR;
		}
	}

	public ResourceLocation getStandardLoot() {
		switch (this.getPNType()) {
			case CLATROTITAN: default:
				return LepidodendronMod.TITANOPTERA_CLATROTITAN_LOOT;

			case GIGATITAN:
				return LepidodendronMod.TITANOPTERA_GIGATITAN_LOOT;

			case MESOTITAN:
				return LepidodendronMod.TITANOPTERA_MESOTITAN_LOOT;

		}
	}

//	public float getFlySpeed() {
//		switch (this.getPNType()) {
//			case CLATROTITAN: default:
//				return 3f;
//
//			case GIGATITAN:
//				return 3f;
//
//			case MESOTITAN:
//				return 3f;
//
//		}
//	}

	public float[] getHitBoxSize() {
		switch (this.getPNType()) {
			case CLATROTITAN: default:
				return CLATROTITAN_SIZE;

			case GIGATITAN:
				return GIGATITAN_SIZE;

			case MESOTITAN:
				return MESOTITAN_SIZE;

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
			return I18n.translateToLocal("entity.prehistoric_flora_titanoptera_" + this.getPNType().getName() + ".name");
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

	@Override
	public ItemStack getPickedResult(RayTraceResult target)
	{
		if (target.entityHit instanceof EntityPrehistoricFloraTitanoptera) {
			EntityPrehistoricFloraTitanoptera titanoptera = (EntityPrehistoricFloraTitanoptera) target.entityHit;
			switch (titanoptera.getPNType()) {
				case CLATROTITAN: default:
					return new ItemStack(ItemSpawnEggTitanopteraClatrotitan.block, 1);

				case GIGATITAN:
					return new ItemStack(ItemSpawnEggTitanopteraGigatitan.block, 1);

				case MESOTITAN:
					return new ItemStack(ItemSpawnEggTitanopteraMesotitan.block, 1);

			}
		}
		return ItemStack.EMPTY;
	}

	//*****************************************************

	@Override
	public SoundEvent getAmbientSound() {
		return (SoundEvent) SoundEvent.REGISTRY
				.getObject(new ResourceLocation("lepidodendron:titanoptera_idle"));
	}

	@Override
	protected void applyEntityAttributes() {
		super.applyEntityAttributes();
		this.getEntityAttribute(SharedMonsterAttributes.MAX_HEALTH).setBaseValue(4.0D);
	}

	@Override
	public void playLivingSound()
	{
		SoundEvent soundevent = this.getAmbientSound();

		if (soundevent != null && !this.getIsFlying())
		{
			this.playSound(soundevent, this.getSoundVolume(), this.getSoundPitch());
		}
	}

	@Override
	protected void initEntityAI() {
		this.tasks.addTask(1, new EntityMateAIInsectCrawlingFlyingBase(this, 1));
		this.tasks.addTask(2, new EntityPrehistoricFloraCrawlingFlyingInsectBase.AIWanderInsect());
		this.tasks.addTask(3, new FlyingLandWanderAvoidWaterAI(this, 1, 10));
		this.tasks.addTask(4, new EntityLookIdleAI(this));
		this.targetTasks.addTask(0, new EatItemsEntityPrehistoricFloraCrawlingFlyingInsectBaseAI(this));
	}

	@Override
	public String[] getFoodOreDicts() {
		return ArrayUtils.addAll(DietString.PLANTS);
	}




	@Override
	public int getTalkInterval() {
		return 40;
	}

	@Override
	public boolean canJar() {
		return true;
	}

	@Override
	public int defaultFlyCooldown() {
		return 2400;
	}

	@Override
	public int defaultWanderCooldown() {
		return 800;
	}

	public static String getPeriod() {return "Triassic";}

	//public static String getHabitat() {return "Terrestrial";}

	@Override
	public String tagEgg () {
		return "insect_eggs_titanoptera";
	}


}