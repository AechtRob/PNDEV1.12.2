
package net.lepidodendron.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.block.BlockGlassJar;
import net.lepidodendron.entity.ai.DietString;
import net.lepidodendron.entity.ai.EatItemsEntityPrehistoricFloraAgeableBaseAI;
import net.lepidodendron.entity.ai.EurypteridWander;
import net.lepidodendron.entity.base.EntityPrehistoricFloraEurypteridBase;
import net.lepidodendron.item.entities.spawneggs.*;
import net.minecraft.block.material.Material;
import net.minecraft.entity.*;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.SoundEvents;
import net.minecraft.item.ItemMonsterPlacer;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.network.datasync.DataParameter;
import net.minecraft.network.datasync.DataSerializers;
import net.minecraft.network.datasync.EntityDataManager;
import net.minecraft.util.*;
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

public class EntityPrehistoricFloraDragonflyNymph extends EntityPrehistoricFloraEurypteridBase {

	private static final float[] DRAGONFLY1_SIZE = new float[]{0.2F, 0.2F};
	private static final float[] DRAGONFLY2_SIZE = new float[]{0.2F, 0.2F};
	private static final float[] DRAGONFLY3_SIZE = new float[]{0.2F, 0.2F};
	private static final float[] DRAGONFLY4_SIZE = new float[]{0.2F, 0.2F};
	private static final float[] DRAGONFLY5_SIZE = new float[]{0.2F, 0.2F};
	private static final float[] DRAGONFLY6_SIZE = new float[]{0.2F, 0.2F};
	private static final float[] DRAGONFLY7_SIZE = new float[]{0.2F, 0.2F};
	private static final float[] DRAGONFLY8_SIZE = new float[]{0.2F, 0.2F};
	private static final float[] DRAGONFLY9_SIZE = new float[]{0.2F, 0.2F};
	private static final float[] DRAGONFLY10_SIZE = new float[]{0.2F, 0.2F};


	private static final DataParameter<Integer> INSECT_TYPE = EntityDataManager.<Integer>createKey(EntityPrehistoricFloraDragonflyNymph.class, DataSerializers.VARINT);

	public EntityPrehistoricFloraDragonflyNymph(World world) {
		super(world);
		setSize(getHitBoxSize()[0], getHitBoxSize()[1]);
		minWidth = 0.05F;
		maxWidth = getHitBoxSize()[0];
		maxHeight = getHitBoxSize()[1];
		maxHealthAgeable = 5.0D;
	}

	//*****************************************************
	//Insect variant managers:

	@Override
	public boolean processInteract(EntityPlayer player, EnumHand hand) {
		if (player.getHeldItem(hand).getItem() instanceof ItemMonsterPlacer) {
			//Cycle the variants:
			ResourceLocation resourceLocation = ItemMonsterPlacer.getNamedIdFrom(player.getHeldItem(hand));
			if (resourceLocation.toString().equalsIgnoreCase("lepidodendron:prehistoric_flora_dragonfly_nymph")) {
				if (!player.capabilities.isCreativeMode)
				{
					player.getHeldItem(hand).shrink(1);
				}
				int type = this.getPNType().ordinal();
				type = type + 1;
				if (type > EntityPrehistoricFloraDragonflyNymph.Type.values().length) {
					type = 0;
				}
				this.setPNType(EntityPrehistoricFloraDragonflyNymph.Type.byId(type));
			}
		}

		return super.processInteract(player, hand);
	}

	@Override
	public ItemStack getPickedResult(RayTraceResult target)
	{
		if (target.entityHit instanceof EntityPrehistoricFloraDragonflyNymph) {
			EntityPrehistoricFloraDragonflyNymph DragonflyNymph = (EntityPrehistoricFloraDragonflyNymph) target.entityHit;
			switch (DragonflyNymph.getPNType()) {
				case DRAGONFLY1: default:
					return new ItemStack(ItemSpawnEggDragonflyDragonfly1.block, 1);

				case DRAGONFLY2:
					return new ItemStack(ItemSpawnEggDragonflyDragonfly2.block, 1);

				case DRAGONFLY3:
					return new ItemStack(ItemSpawnEggDragonflyDragonfly3.block, 1);

				case DRAGONFLY4:
					return new ItemStack(ItemSpawnEggDragonflyDragonfly4.block, 1);

				case DRAGONFLY5:
					return new ItemStack(ItemSpawnEggDragonflyDragonfly5.block, 1);

				case DRAGONFLY6:
					return new ItemStack(ItemSpawnEggDragonflyDragonfly6.block, 1);

				case DRAGONFLY7:
					return new ItemStack(ItemSpawnEggDragonflyDragonfly7.block, 1);

				case DRAGONFLY8:
					return new ItemStack(ItemSpawnEggDragonflyDragonfly8.block, 1);

				case DRAGONFLY9:
					return new ItemStack(ItemSpawnEggDragonflyDragonfly9.block, 1);

				case DRAGONFLY10:
					return new ItemStack(ItemSpawnEggDragonflyDragonfly10.block, 1);

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
		DRAGONFLY1(1, "DRAGONFLY1"),
		DRAGONFLY2(2, "DRAGONFLY2"),
		DRAGONFLY3(3, "DRAGONFLY3"),
		DRAGONFLY4(4, "DRAGONFLY4"),
		DRAGONFLY5(5, "DRAGONFLY5"),
		DRAGONFLY6(6, "DRAGONFLY6"),
		DRAGONFLY7(7, "DRAGONFLY7"),
		DRAGONFLY8(8, "DRAGONFLY8"),
		DRAGONFLY9(9, "DRAGONFLY9"),
		DRAGONFLY10(10, "DRAGONFLY10")
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
	
		public static EntityPrehistoricFloraDragonflyNymph.Type byId(int id)
		{
			if (id < 0 || id >= values().length)
			{
				id = 0;
			}
	
			return values()[id];
		}
	
		public static EntityPrehistoricFloraDragonflyNymph.Type getTypeFromString(String nameIn)
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
				return LepidodendronMod.PALAEODICTYOPTERA_DELITZSCHALA_NYMPH_LOOT_JAR;

			case DRAGONFLY2:
				return LepidodendronMod.PALAEODICTYOPTERA_DUNBARIA_NYMPH_LOOT_JAR;

			case DRAGONFLY3:
				return LepidodendronMod.PALAEODICTYOPTERA_HOMALONEURA_NYMPH_LOOT_JAR;

			case DRAGONFLY4:
				return LepidodendronMod.PALAEODICTYOPTERA_HOMOIOPTERA_NYMPH_LOOT_JAR;

			case DRAGONFLY5:
				return LepidodendronMod.PALAEODICTYOPTERA_LITHOMANTIS_NYMPH_LOOT_JAR;

			case DRAGONFLY6:
				return LepidodendronMod.PALAEODICTYOPTERA_LYCOCERCUS_NYMPH_LOOT_JAR;

			case DRAGONFLY7:
				return LepidodendronMod.PALAEODICTYOPTERA_SINODUNBARIA_NYMPH_LOOT_JAR;

			case DRAGONFLY8:
				return LepidodendronMod.PALAEODICTYOPTERA_STENODICTYA_NYMPH_LOOT_JAR;

			case DRAGONFLY9:
			case DRAGONFLY10:
				return LepidodendronMod.PALAEODICTYOPTERA_MAZOTHAIROS_NYMPH_LOOT_JAR;
		}
	}

	public ResourceLocation getStandardLoot() {
		return LepidodendronMod.BUG_LOOT;
	}

	public float getFlySpeed() {
		return 3f;
	}

	public float[] getHitBoxSize() {
		switch (this.getPNType()) {
			case DRAGONFLY1: default:
				return DRAGONFLY1_SIZE;

			case DRAGONFLY2:
				return DRAGONFLY2_SIZE;

			case DRAGONFLY3:
				return DRAGONFLY3_SIZE;

			case DRAGONFLY4:
				return DRAGONFLY4_SIZE;

			case DRAGONFLY5:
				return DRAGONFLY5_SIZE;

			case DRAGONFLY6:
				return DRAGONFLY6_SIZE;

			case DRAGONFLY7:
				return DRAGONFLY7_SIZE;

			case DRAGONFLY8:
				return DRAGONFLY8_SIZE;

			case DRAGONFLY9:
				return DRAGONFLY9_SIZE;
				
			case DRAGONFLY10:
				return DRAGONFLY10_SIZE;
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
	public String getName() {
		if (this.hasCustomName())
		{
			return this.getCustomNameTag();
		}
		else
		{
			return I18n.translateToLocal("entity.prehistoric_flora_dragonfly_nymph_" + this.getPNType().getName() + ".name");
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
			this.setPNType(EntityPrehistoricFloraDragonflyNymph.Type.getTypeFromString(compound.getString("PNType")));
		}
	}

	public void setPNType(EntityPrehistoricFloraDragonflyNymph.Type type)
	{
		this.dataManager.set(INSECT_TYPE, Integer.valueOf(type.ordinal()));
	}

	public EntityPrehistoricFloraDragonflyNymph.Type getPNType()
	{
		return EntityPrehistoricFloraDragonflyNymph.Type.byId(((Integer)this.dataManager.get(INSECT_TYPE)).intValue());
	}

	//*****************************************************

	@Override
	public boolean isSmall() {
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
		return false;
	}

	@Override //Spawn as baby so it grows:
	public IEntityLivingData onInitialSpawn(DifficultyInstance difficulty, @Nullable IEntityLivingData livingdata) {
		livingdata = super.onInitialSpawn(difficulty, livingdata);
		this.setAgeTicks(0);
		this.heal(this.getMaxHealth());
		this.setNoAI(false);
		this.setPNType(EntityPrehistoricFloraDragonflyNymph.Type.byId(rand.nextInt(EntityPrehistoricFloraDragonflyNymph.Type.values().length) + 1));
		return livingdata;
	}

	@Override
	public int getAdultAge() {
		return 32000;
	}

	protected void initEntityAI() {
		tasks.addTask(0, new EurypteridWander(this, NO_ANIMATION));
		this.targetTasks.addTask(0, new EatItemsEntityPrehistoricFloraAgeableBaseAI(this, 1));
	}

	@Override
	public String[] getFoodOreDicts() {
		return ArrayUtils.addAll(DietString.FISHFOOD);
	}

	@Override
	protected float getAISpeedEurypterid() {
		return 0.41F;
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
		this.getEntityAttribute(SharedMonsterAttributes.MAX_HEALTH).setBaseValue(2.0D);
		this.getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).setBaseValue(0.25D);
	}

	@Override
	protected boolean canTriggerWalking() {
		return false;
	}

	@Override
	protected double getSwimSpeed() {
		return this.getSwimSpeed();
	}

	@Override
	public boolean isInWater() {
		return super.isInWater() || this.isInsideOfMaterial(Material.WATER) || this.isInsideOfMaterial(Material.CORAL);
	}

	@Override
	public boolean attackEntityFrom(DamageSource source, float amount) {
		return super.attackEntityFrom(source, (amount));

	}

	//@Override
	//public net.minecraft.util.SoundEvent getAmbientSound() {
	//    return (net.minecraft.util.SoundEvent) net.minecraft.util.SoundEvent.REGISTRY
	//            .getObject(new ResourceLocation("lepidodendron:eurypterus_idle"));
	//}

	@Override
	public SoundEvent getAmbientSound() {
		return (SoundEvent) SoundEvent.REGISTRY.getObject(new ResourceLocation(""));
	}


	//@Override
	//public net.minecraft.util.SoundEvent getHurtSound(DamageSource ds) {
	//    return (net.minecraft.util.SoundEvent) net.minecraft.util.SoundEvent.REGISTRY
	//            .getObject(new ResourceLocation("lepidodendron:eurypterus_hurt"));
	//}

	@Override
	public SoundEvent getHurtSound(DamageSource ds) {
		return (SoundEvent) SoundEvent.REGISTRY.getObject(new ResourceLocation("entity.generic.hurt"));
	}

	//@Override
	//public net.minecraft.util.SoundEvent getDeathSound() {
	//    return (net.minecraft.util.SoundEvent) net.minecraft.util.SoundEvent.REGISTRY
	//            .getObject(new ResourceLocation("lepidodendron:eurypterus_death"));
	//}
	@Override
	public SoundEvent getDeathSound() {
		return (SoundEvent) SoundEvent.REGISTRY.getObject(new ResourceLocation("entity.generic.death"));
	}



	@Override
	protected int getExperiencePoints(EntityPlayer player) {
		return 1 + this.world.rand.nextInt(1);
	}

	@Override
	public boolean isOnLadder() {
		return false;
	}

	@Override
	public void onLivingUpdate() {
		super.onLivingUpdate();
	}

	public void onEntityUpdate()
	{
		super.onEntityUpdate();
		Entity entity = null;
		if (this.getAgeScale() >= 0.99)
		{
			if (!(world.isRemote)) {
				BlockPos pos = this.getPosition();

				entity = ItemMonsterPlacer.spawnCreature(this.getEntityWorld(), EntityList.getKey(EntityPrehistoricFloraDragonfly.class), (double) pos.getX() + 0.5D, (double) pos.getY() + 0.5D, (double) pos.getZ() + 0.5D);

				if (entity != null) {
					if (entity instanceof EntityPrehistoricFloraDragonfly) {
						((EntityPrehistoricFloraDragonfly) entity).setPNType(EntityPrehistoricFloraDragonfly.Type.getTypeFromString(this.getPNType().getName()));
					}
					this.setDead();
					if (world instanceof WorldServer) {
						((WorldServer) world).playSound(null, pos.up(), SoundEvents.BLOCK_SLIME_BREAK, SoundCategory.BLOCKS, 0.5F, 2.6F + (rand.nextFloat() - rand.nextFloat()) * 0.8F);
						for (int k = 0; k < 8; ++k) {
							((WorldServer) world).spawnParticle(EnumParticleTypes.EXPLOSION_NORMAL, (double) pos.getX() + Math.random(), (double) pos.getY() + Math.random(), (double) pos.getZ() + Math.random() + Math.random(), (int) 1, 0.5, 0.5, 0.5, 0.1, new int[0]);
						}
					}
				}
			}
		}
	}

}