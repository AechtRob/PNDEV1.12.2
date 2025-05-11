
package net.lepidodendron.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.ai.AgeableFishWander;
import net.lepidodendron.entity.ai.DietString;
import net.lepidodendron.entity.ai.EatItemsEntityPrehistoricFloraAgeableBaseAI;
import net.lepidodendron.entity.ai.EurypteridWander;
import net.lepidodendron.entity.base.EntityPrehistoricFloraAgeableFishBase;
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

public class EntityPrehistoricFloraTadpole extends EntityPrehistoricFloraAgeableFishBase implements ITrappableWater {

	private static final float[] CRATOPIPA_SIZE = new float[]{0.2F, 0.2F};
	private static final float[] PROSALIRUS_SIZE = new float[]{0.2F, 0.2F};
	private static final float[] NOTOBATRACHUS_SIZE = new float[]{0.2F, 0.2F};
	private static final float[] RHADINOSTEUS_SIZE = new float[]{0.2F, 0.2F};
//	private static final float[] LITHOMANTIS_SIZE = new float[]{0.2F, 0.2F};
//	private static final float[] LYCOCERCUS_SIZE = new float[]{0.2F, 0.2F};
//	private static final float[] SINODUNBARIA_SIZE = new float[]{0.2F, 0.2F};
//	private static final float[] STENODICTYA_SIZE = new float[]{0.2F, 0.2F};
//	private static final float[] MAZOTHAIROS_SIZE = new float[]{0.2F, 0.2F};
//	private static final float[] PSYCHROPTILUS_SIZE = new float[]{0.2F, 0.2F};

	private static final DataParameter<Integer> TADPOLE_TYPE = EntityDataManager.<Integer>createKey(EntityPrehistoricFloraTadpole.class, DataSerializers.VARINT);

	public EntityPrehistoricFloraTadpole(World world) {
		super(world);
		setSize(getHitBoxSize()[0], getHitBoxSize()[1]);
		minWidth = 0.05F;
		maxWidth = getHitBoxSize()[0];
		maxHeight = getHitBoxSize()[1];
		maxHealthAgeable = 2.0D;
	}

	@Override
	public int getEggType(@Nullable String variantIn) {
		return 47; //cross model
	}

	@Override
	public ResourceLocation getEggTexture(@Nullable String variantIn) {
		return new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/eggs_tadpole.png");
	}

	//*****************************************************
	//Insect variant managers:

	@Override
	public boolean hasPNVariants() {
		return true;
	}

	public enum Type
	{
		CRATOPIPA(1, "cratopipa"),
		NOTOBATRACHUS(2, "notobatrachus"),
		PROSALIRUS(3, "prosalirus"),
		RHADINOSTEUS(4, "rhadinosteus"),

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
	
		public static EntityPrehistoricFloraTadpole.Type byId(int id)
		{
			if (id < 0 || id >= values().length)
			{
				id = 0;
			}
	
			return values()[id];
		}
	
		public static EntityPrehistoricFloraTadpole.Type getTypeFromString(String nameIn)
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

	public float[] getHitBoxSize() {
		switch (this.getPNType()) {
			case CRATOPIPA: default:
				return CRATOPIPA_SIZE;
			case NOTOBATRACHUS:
				return NOTOBATRACHUS_SIZE;
			case PROSALIRUS:
				return PROSALIRUS_SIZE;
			case RHADINOSTEUS:
				return RHADINOSTEUS_SIZE;
		}
	}

	@Nullable
	protected ResourceLocation getLootTable() {
		return null;
	}

	@Override
	protected void entityInit() {
		super.entityInit();
		this.dataManager.register(TADPOLE_TYPE, 0);
	}

	@Override
	public String getName() {
		if (this.hasCustomName())
		{
			return this.getCustomNameTag();
		}
		else
		{
			return I18n.translateToLocal("entity.prehistoric_flora_tadpole_" + this.getPNType().getName() + ".name");
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
			this.setPNType(EntityPrehistoricFloraTadpole.Type.getTypeFromString(compound.getString("PNType")));
		}
	}

	public void setPNType(EntityPrehistoricFloraTadpole.Type type)
	{
		this.dataManager.set(TADPOLE_TYPE, Integer.valueOf(type.ordinal()));
	}

	public EntityPrehistoricFloraTadpole.Type getPNType()
	{
		return EntityPrehistoricFloraTadpole.Type.byId(((Integer)this.dataManager.get(TADPOLE_TYPE)).intValue());
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

	public static String getPeriod() {return "Carboniferous - Permian";}

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
		this.setPNType(EntityPrehistoricFloraTadpole.Type.byId(rand.nextInt(EntityPrehistoricFloraTadpole.Type.values().length) + 1));
		return livingdata;
	}

	@Override
	public int getAdultAge() {
		return 6000;
	}

	protected void initEntityAI() {
		tasks.addTask(1, new AgeableFishWander(this, NO_ANIMATION, 0.1, 1, true));
		this.targetTasks.addTask(0, new EatItemsEntityPrehistoricFloraAgeableBaseAI(this, 1));
	}

	@Override
	public String[] getFoodOreDicts() {
		return DietString.FISHFOOD;
	}



	@Override
	public String getTexture() {
		return this.getTexture();
	}

	@Override
	public EnumCreatureAttribute getCreatureAttribute() {
		return EnumCreatureAttribute.UNDEFINED;
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
	protected float getAISpeedFish() {
		return 0.2F;
	}

	@Override
	protected boolean isSlowAtBottom() {
		return false;
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

	@Override
	public boolean isOnLadder() {
		return false;
	}

	public Class <? extends Entity > getEntityIn() {
		switch (this.getPNType()) {
			case CRATOPIPA: default:
				return EntityPrehistoricFloraCratopipa.class;
			case NOTOBATRACHUS:
				return EntityPrehistoricFloraNotobatrachus.class;
			case PROSALIRUS:
				return EntityPrehistoricFloraProsalirus.class;
			case RHADINOSTEUS:
				return EntityPrehistoricFloraRhadinosteus.class;
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