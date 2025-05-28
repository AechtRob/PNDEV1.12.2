
package net.lepidodendron.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.ai.DietString;
import net.lepidodendron.entity.ai.EatItemsEntityPrehistoricFloraAgeableBaseAI;
import net.lepidodendron.entity.ai.EurypteridWander;
import net.lepidodendron.entity.ai.EurypteridWanderBottomDweller;
import net.lepidodendron.entity.base.EntityPrehistoricFloraEurypteridBase;
import net.lepidodendron.entity.util.ITrappableWater;
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

import javax.annotation.Nullable;

public class EntityPrehistoricFloraAquaticBugNymph extends EntityPrehistoricFloraEurypteridBase implements ITrappableWater {

	private static final float[] MAYFLY_SIZE = new float[]{0.2F, 0.2F};
	private static final float[] STONEFLY_SIZE = new float[]{0.2F, 0.2F};
	private static final float[] DAMSELFLY_SIZE = new float[]{0.2F, 0.2F};
	private static final float[] VELISOPTERA_SIZE = new float[]{0.2F, 0.2F};
	private static final float[] ARGENTINALA_SIZE = new float[]{0.2F, 0.2F};


	private static final DataParameter<Integer> INSECT_TYPE = EntityDataManager.<Integer>createKey(EntityPrehistoricFloraAquaticBugNymph.class, DataSerializers.VARINT);

	public EntityPrehistoricFloraAquaticBugNymph(World world) {
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
		return new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/eggs_palaeodictyoptera.png");
	}

	//*****************************************************
	//Insect variant managers:

	@Override
	public boolean hasPNVariants() {
		return true;
	}

	public enum Type
	{
		MAYFLY(1, "mayfly"),
		STONEFLY(2, "stonefly"),
		DAMSELFLY(3, "damselfly"),
		VELISOPTERA(4, "velisoptera"),
		ARGENTINALA(5, "argentinala")
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
	
		public static EntityPrehistoricFloraAquaticBugNymph.Type byId(int id)
		{
			if (id < 0 || id >= values().length)
			{
				id = 0;
			}
	
			return values()[id];
		}
	
		public static EntityPrehistoricFloraAquaticBugNymph.Type getTypeFromString(String nameIn)
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
		switch (this.getPNType()) {
			case MAYFLY: default:
				return 3f;

			case STONEFLY:
				return 3f;

			case DAMSELFLY:
				return 3f;

			case VELISOPTERA:
				return 3f;

			case ARGENTINALA:
				return 3f;

		}
	}

	public float[] getHitBoxSize() {
		switch (this.getPNType()) {
			case MAYFLY: default:
				return MAYFLY_SIZE;

			case STONEFLY:
				return STONEFLY_SIZE;

			case DAMSELFLY:
				return DAMSELFLY_SIZE;

			case VELISOPTERA:
				return VELISOPTERA_SIZE;

			case ARGENTINALA:
				return ARGENTINALA_SIZE;
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
			return I18n.translateToLocal("entity.prehistoric_flora_aquaticnymph_" + this.getPNType().getName() + ".name");
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
			this.setPNType(EntityPrehistoricFloraAquaticBugNymph.Type.getTypeFromString(compound.getString("PNType")));
		}
	}

	public void setPNType(EntityPrehistoricFloraAquaticBugNymph.Type type)
	{
		this.dataManager.set(INSECT_TYPE, Integer.valueOf(type.ordinal()));
	}

	public EntityPrehistoricFloraAquaticBugNymph.Type getPNType()
	{
		return EntityPrehistoricFloraAquaticBugNymph.Type.byId(((Integer)this.dataManager.get(INSECT_TYPE)).intValue());
	}

	@Override
	public String getPNTypeName()
	{
		return this.getPNType().getName();
	}

	//*****************************************************

	@Override
	public boolean isSmall() {
		return true;
	}


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
		this.setPNType(EntityPrehistoricFloraAquaticBugNymph.Type.byId(rand.nextInt(EntityPrehistoricFloraAquaticBugNymph.Type.values().length) + 1));
		return livingdata;
	}


	@Override
	public int getAdultAge() {
		return 32000;
	}

	protected void initEntityAI() {
		tasks.addTask(0, new EurypteridWanderBottomDweller(this, NO_ANIMATION));
		this.targetTasks.addTask(0, new EatItemsEntityPrehistoricFloraAgeableBaseAI(this, 1));
	}

	@Override
	public String[] getFoodOreDicts() {
		return DietString.FISHFOOD;
	}

	@Override
	protected float getAISpeedEurypterid() {
		return 0.1F;
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
	protected int getExperiencePoints(EntityPlayer player) {
		return 1 + this.world.rand.nextInt(1);
	}

	public Class <? extends Entity > getEntityIn() {
		switch (this.getPNType()) {
			case STONEFLY: default:
				return EntityPrehistoricFloraStonefly.class;
			case MAYFLY:
				return EntityPrehistoricFloraMayfly.class;
			case DAMSELFLY:
				return EntityPrehistoricFloraDamselfly.class;
//			case ARGENTINALA:
//				return EntityPrehistoricFloraArgentinala.class;
//			case VELISOPTERA:
//				return EntityPrehistoricFloraVelisoptera.class;
		}

	}

	public void onEntityUpdate()
	{
		super.onEntityUpdate();
		Entity entity = null;
		if (this.getAgeScale() >= 0.99)
		{
			if (!(world.isRemote)) {
				BlockPos pos = this.getPosition();

				entity = ItemMonsterPlacer.spawnCreature(this.getEntityWorld(), EntityList.getKey(this.getEntityIn()), (double) pos.getX() + 0.5D, (double) pos.getY() + 0.5D, (double) pos.getZ() + 0.5D);

				if (entity != null) {
//					if (entity instanceof EntityPrehistoricFloraPalaeodictyoptera) {
//						((EntityPrehistoricFloraPalaeodictyoptera) entity).setPNType(EntityPrehistoricFloraPalaeodictyoptera.Type.getTypeFromString(this.getPNType().getName()));
//					}
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