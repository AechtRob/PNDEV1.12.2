
package net.lepidodendron.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.ai.DietString;
import net.lepidodendron.entity.ai.EatItemsEntityPrehistoricFloraAgeableBaseAI;
import net.lepidodendron.entity.ai.EurypteridWander;
import net.lepidodendron.entity.base.EntityPrehistoricFloraEurypteridBase;
import net.lepidodendron.entity.util.ITrappableWater;
import net.lepidodendron.item.entities.spawneggs.ItemSpawnEggDragonfly;
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
import org.apache.commons.lang3.ArrayUtils;

import javax.annotation.Nullable;

public class EntityPrehistoricFloraDragonflyNymph extends EntityPrehistoricFloraEurypteridBase implements ITrappableWater {

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

	@Override
	public int getEggType(@Nullable String variantIn) {
		return 21; //cross model
	}

	@Override
	public ResourceLocation getEggTexture(@Nullable String variantIn) {
		return new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/eggs_dragonfly.png");
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
			return new ItemStack(ItemSpawnEggDragonfly.block, 1);
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
		return null;
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
		if (this.world != null) {
			super.readEntityFromNBT(compound);
		}
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

	public static String getPeriod() {return "Jurassic - Early Cretaceous - Late Cretaceous - Paleogene  - Neogene - Pleistocene [ - present]";}

	//public static String getHabitat() {return "Terrestrial";}

	@Override
	public boolean dropsEggs() {
		return false;
	}
	
	@Override
	public boolean laysEggs() {
		return false;
	}

	@Override
	public boolean getLaying() {
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