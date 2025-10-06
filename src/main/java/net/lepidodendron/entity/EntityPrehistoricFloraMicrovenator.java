
package net.lepidodendron.entity;

import net.ilexiconn.llibrary.client.model.tools.ChainBuffer;
import net.ilexiconn.llibrary.server.animation.Animation;
import net.ilexiconn.llibrary.server.animation.AnimationHandler;
import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.block.base.IAdvancementGranter;
import net.lepidodendron.entity.ai.*;
import net.lepidodendron.entity.base.EntityPrehistoricFloraAgeableBase;
import net.lepidodendron.entity.base.EntityPrehistoricFloraLandBase;
import net.lepidodendron.entity.util.ITrappableLand;
import net.lepidodendron.util.CustomTrigger;
import net.lepidodendron.util.ModTriggers;
import net.minecraft.block.BlockDirectional;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.PropertyDirection;
import net.minecraft.entity.*;
import net.minecraft.entity.ai.attributes.IAttributeInstance;
import net.minecraft.entity.passive.EntityAnimal;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.network.datasync.DataParameter;
import net.minecraft.network.datasync.DataSerializers;
import net.minecraft.network.datasync.EntityDataManager;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.DamageSource;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.DifficultyInstance;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.FMLCommonHandler;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import org.apache.commons.lang3.ArrayUtils;

import javax.annotation.Nullable;
import java.util.List;

public class EntityPrehistoricFloraMicrovenator extends EntityPrehistoricFloraLandBase implements ITrappableLand, IAdvancementGranter {

	public BlockPos currentTarget;
	@SideOnly(Side.CLIENT)
	public ChainBuffer tailBuffer;
	//private int inPFLove;
	public Animation GRAPPLE_ANIMATION;

	private static final DataParameter<Integer> MICROVENATOR_TYPE = EntityDataManager.<Integer>createKey(EntityPrehistoricFloraMicrovenator.class, DataSerializers.VARINT);

	public EntityPrehistoricFloraMicrovenator(World world) {
		super(world);
		setSize(0.82F, 1.05F);
		minWidth = 0.18F;
		maxWidth = 0.82F;
		maxHeight = 1.05F;
		maxHealthAgeable = 18.0D;
		GRAPPLE_ANIMATION = Animation.create(getGrappleLength());
		if (FMLCommonHandler.instance().getSide().isClient()) {
			tailBuffer = new ChainBuffer();
		}
	}

	@Override
	protected void entityInit() {
		super.entityInit();
		this.dataManager.register(MICROVENATOR_TYPE, 0);
	}

	@Override
	public byte breedPNVariantsMatch() {
		return -1;
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
					if (((EntityPrehistoricFloraMicrovenator)otherAnimal).getPNType() == this.getPNType()) {
						return false;
					}
					break;

				case 1:
					if (((EntityPrehistoricFloraMicrovenator)otherAnimal).getPNType() != this.getPNType()) {
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

	@Override
	public String getPNTypeName()
	{
		return this.getPNType().getName();
	}

	@Nullable
	@Override
	public CustomTrigger getModTrigger() {
		return ModTriggers.CLICK_MICROVENATOR;
	}

	public enum Type
	{
		MALE(1, "male"),
		FEMALE(2, "female")
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

		public static EntityPrehistoricFloraMicrovenator.Type byId(int id)
		{
			if (id < 0 || id >= values().length)
			{
				id = 0;
			}

			return values()[id];
		}

		public static EntityPrehistoricFloraMicrovenator.Type getTypeFromString(String nameIn)
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

	@Override
	public IEntityLivingData onInitialSpawn(DifficultyInstance difficulty, @Nullable IEntityLivingData livingdata) {
		livingdata = super.onInitialSpawn(difficulty, livingdata);
		this.setPNType(EntityPrehistoricFloraMicrovenator.Type.byId(rand.nextInt(EntityPrehistoricFloraMicrovenator.Type.values().length) + 1));
		return livingdata;
	}

	public void setPNType(EntityPrehistoricFloraMicrovenator.Type type)
	{
		this.dataManager.set(MICROVENATOR_TYPE, Integer.valueOf(type.ordinal()));
	}

	public EntityPrehistoricFloraMicrovenator.Type getPNType()
	{
		return EntityPrehistoricFloraMicrovenator.Type.byId(((Integer)this.dataManager.get(MICROVENATOR_TYPE)).intValue());
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
			this.setPNType(EntityPrehistoricFloraMicrovenator.Type.getTypeFromString(compound.getString("PNType")));
		}
	}

	@Nullable
	protected ResourceLocation getLootTable() {
		switch (this.getPNType()) {
			case MALE:
			default:
				return LepidodendronMod.MICROVENATOR_LOOT;

			case FEMALE:
				return LepidodendronMod.MICROVENATOR_LOOT_F;
		}
	}

	@Override
	public void onUpdate() {
		super.onUpdate();
		if (world.isRemote && !this.isAIDisabled()) {
			tailBuffer.calculateChainSwingBuffer(120, 10, 5F, this);
		}
	}

	@Override
	public int getEggType(@Nullable String variantIn) {
		return 1; //medium
	}

	@Override
	public Animation[] getAnimations() {
		return new Animation[]{ATTACK_ANIMATION, DRINK_ANIMATION, ROAR_ANIMATION, LAY_ANIMATION, EAT_ANIMATION, GRAPPLE_ANIMATION};
	}

	@Override
	public int getRoarLength() {
		return 35;
	}

	@Override
	public boolean drinksWater() {
		return false; //grazes, does not drink
	}

	@Override
	public int getDrinkLength() {
		return 180;  //grazes, does not drink
	}

	@Override
	public int getDrinkCooldown() {
		return 1400;
	}

	public boolean isDrinking()
	{
		//Is GRAZING!
		EnumFacing facing = this.getAdjustedHorizontalFacing();
		boolean test = (this.getPFDrinking() <= 0
				&& !world.isRemote
				&& !this.getIsFast()
				&& !this.getIsMoving()
				&& this.DRINK_ANIMATION.getDuration() > 0
				&& this.getAnimation() == NO_ANIMATION
				&& !this.isReallyInWater()
				&& (this.world.getBlockState(this.getPosition().offset(facing).down()).getMaterial() == Material.GRASS
				|| this.world.getBlockState(this.getPosition().offset(facing).down()).getMaterial() == Material.PLANTS
				|| this.world.getBlockState(this.getPosition().offset(facing).down()).getMaterial() == Material.LEAVES)
		);
		if (test) {
			//Which one is water?
			facing = null;
			if (this.world.getBlockState(this.getPosition().north().down()).getMaterial() == Material.GRASS
					|| this.world.getBlockState(this.getPosition().north().down()).getMaterial() == Material.PLANTS
					|| this.world.getBlockState(this.getPosition().north().down()).getMaterial() == Material.LEAVES) {
				facing = EnumFacing.NORTH;
			}
			else if (this.world.getBlockState(this.getPosition().south().down()).getMaterial() == Material.GRASS
					|| this.world.getBlockState(this.getPosition().south().down()).getMaterial() == Material.PLANTS
					|| this.world.getBlockState(this.getPosition().south().down()).getMaterial() == Material.LEAVES) {
				facing = EnumFacing.SOUTH;
			}
			else if (this.world.getBlockState(this.getPosition().east().down()).getMaterial() == Material.GRASS
					|| this.world.getBlockState(this.getPosition().east().down()).getMaterial() == Material.PLANTS
					|| this.world.getBlockState(this.getPosition().east().down()).getMaterial() == Material.LEAVES) {
				facing = EnumFacing.EAST;
			}
			else if (this.world.getBlockState(this.getPosition().west().down()).getMaterial() == Material.GRASS
					|| this.world.getBlockState(this.getPosition().west().down()).getMaterial() == Material.PLANTS
					|| this.world.getBlockState(this.getPosition().west().down()).getMaterial() == Material.LEAVES) {
				facing = EnumFacing.WEST;
			}
			if (facing != null) {
				this.setDrinkingFrom(this.getPosition().offset(facing));
				this.faceBlock(this.getDrinkingFrom(), 10F, 10F);
			}
		}
		return test;

	}

	public static String getPeriod() {return "Early Cretaceous";}

	//public static String getHabitat() {return "Terrestrial Reptile";}

	@Override
	public boolean hasNest() {
		return true;
	}

	@Override
	public int getAttackLength() {
		return 20;
	}

	@Override
	public String getTexture() {
		return this.getTexture();
	}

	@Override
	public boolean dropsEggs() {
		return false;
	}

	@Override
	public boolean laysEggs() {
		return true;
	}

	public float getAISpeedLand() {
		float speedBase = 0.26F;
		if (this.getTicks() < 0) {
			return 0.0F; //Is laying eggs
		}
		if (this.getAnimation() == DRINK_ANIMATION || this.getAnimation() == MAKE_NEST_ANIMATION || this.getAnimation() == GRAZE_ANIMATION) {
			return 0.0F;
		}
		if ((this.getAnimation() == GRAPPLE_ANIMATION) && (this.willGrapple) && this.getGrappleTarget() != null) {
			return 0.0F; //Is talking to a colleague!
		}
		if (this.getIsFast()) {
			speedBase = speedBase * 2.4F;
		}
		return speedBase;
	}

	@Override
	public int grappleChance() {
		return 4000;
	}

	@Override
	public AxisAlignedBB getGrappleBoundingBox() {
		float size = this.getRenderSizeModifier() * 0.5F;
		return this.getEntityBoundingBox().grow(3.0F + size, 3.0F + size, 3.0F + size);
	}

	public boolean findGrappleTarget() {
		//System.err.println("finding grapple target");
		if (this.willGrapple || this.getIsCuriousWalking()) {
			return false;
		}
		List<EntityPrehistoricFloraMicrovenator> Microvenator = world.getEntitiesWithinAABB(EntityPrehistoricFloraMicrovenator.class, new AxisAlignedBB(this.getPosition().add(-6, -4, -6), this.getPosition().add(6, 4, 6)));
		for (EntityPrehistoricFloraMicrovenator currentMicrovenator : Microvenator) {
			if ((!currentMicrovenator.getIsCuriousWalking()) && currentMicrovenator.isPFAdult() && this.isPFAdult() && currentMicrovenator != this && (!currentMicrovenator.willGrapple) && this.canEntityBeSeen(currentMicrovenator)) {
				this.setGrappleTarget(currentMicrovenator);
				currentMicrovenator.willGrapple = true;
				this.willGrapple = true;
				currentMicrovenator.setGrappleTarget(this);
				return true;
			}
		}
		return false;
	}

	@Override
	public boolean grappleEntityAsMob(Entity entity) {
		if (this.getAnimation() == NO_ANIMATION) {
			this.setAnimation(this.getGrappleAnimation());
			//System.err.println("set attack");
		}
		return false;
	}
	@Override
	public boolean isAnimationDirectionLocked(Animation animation) {
		return animation == GRAPPLE_ANIMATION
				|| super.isAnimationDirectionLocked(animation);
	}

	public int getGrappleLength() {
		return 120;
	}

	@Override
	public Animation getGrappleAnimation() {
		return this.GRAPPLE_ANIMATION;
	}

	public int getAmbientTalkInterval() {
		return 160;
	}

	@Override
	public int getTalkInterval() {
		return 1000;
	}

	@Override
	public int getAdultAge() {
		return 64000;
	}

	public AxisAlignedBB getAttackBoundingBox() {
		float size = this.getRenderSizeModifier() * 0.25F;
		return this.getEntityBoundingBox().grow(1.0F + size, 1.0F + size, 1.0F + size);
	}

	@Override
	public float getEyeHeight()
	{
		return Math.max(super.getEyeHeight(), this.height * 1.05F);
	}

	protected void initEntityAI() {
		tasks.addTask(0, new EntityMateAIAgeableBase(this, 1.0D));
		tasks.addTask(1, new EntityTemptAI(this, 1, false, true, 0));
		tasks.addTask(2, new LandEntitySwimmingAI(this, 0.75, false));
		tasks.addTask(3, new AttackAI(this, 1.0D, false, this.getAttackLength()));
		tasks.addTask(4, new PanicAI(this, 1.0));
        tasks.addTask(5, new AvoidEntityPN<>(this, EntityLivingBase.class, 6.0F, true));
		tasks.addTask(6, new LandWanderNestAI(this));
		tasks.addTask(7, new LandWanderFollowParent(this, 1.05D));
		tasks.addTask(8, new GrappleAI(this, 1.0D, false, this.getGrappleLength(), this.getGrappleAnimation(), 0.15));
		tasks.addTask(9, new LandWanderHerd(this, 1.00D, Math.max(1F, this.width) * this.getNavigator().getPathSearchRange() * 0.75F));
		tasks.addTask(10, new LandWanderAvoidWaterAI(this, 1.0D));
		tasks.addTask(11, new EntityWatchClosestAI(this, EntityPlayer.class, 6.0F));
		tasks.addTask(12, new EntityWatchClosestAI(this, EntityPrehistoricFloraAgeableBase.class, 8.0F));
		tasks.addTask(13, new EntityLookIdleAI(this));
		this.targetTasks.addTask(0, new EatItemsEntityPrehistoricFloraAgeableBaseAI(this, 1));
		this.targetTasks.addTask(1, new EntityHurtByTargetSmallerThanMeAI(this, false));
	}

	@Override
	public String[] getFoodOreDicts() {
		return ArrayUtils.addAll(DietString.BUG, DietString.PLANTS);
	}

	@Override
	public boolean panics() {
		return true;
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
		this.getAttributeMap().registerAttribute(SharedMonsterAttributes.ATTACK_DAMAGE);
		this.getEntityAttribute(SharedMonsterAttributes.ATTACK_DAMAGE).setBaseValue(4.0D);
		this.getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).setBaseValue(0.25D);
	}

	@Override
	public SoundEvent getAmbientSound() {
	    return (SoundEvent) SoundEvent.REGISTRY
	            .getObject(new ResourceLocation("lepidodendron:microvenator_idle"));
	}

	@Override
	public SoundEvent getHurtSound(DamageSource ds) {
	    return (SoundEvent) SoundEvent.REGISTRY
	            .getObject(new ResourceLocation("lepidodendron:microvenator_hurt"));
	}

	@Override
	public SoundEvent getDeathSound() {
	    return (SoundEvent) SoundEvent.REGISTRY
	            .getObject(new ResourceLocation("lepidodendron:microvenator_death"));
	}

	@Override
	protected float getSoundVolume() {
		return 1.0F;
	}

	@Override
	public boolean getCanSpawnHere() {
		return this.posY < (double) this.world.getSeaLevel() && this.isInWater();
	}
	

	@Override
	public void onLivingUpdate() {
		super.onLivingUpdate();

		if (this.getAnimation() == ATTACK_ANIMATION && this.getAnimationTick() == 11 && this.getAttackTarget() != null) {
			launchAttack();
		}

		if ((this.getAnimation() == GRAPPLE_ANIMATION) && this.getAnimationTick() == this.headbutTick() && this.getGrappleTarget() != null) {
			this.faceEntity(this.getGrappleTarget(), 10, 10);
			launchGrapple();
			if (this.getGrappleTarget() instanceof EntityPrehistoricFloraAgeableBase) {
				EntityPrehistoricFloraAgeableBase grappleTarget = (EntityPrehistoricFloraAgeableBase) this.getGrappleTarget();
				grappleTarget.setGrappleTarget(null);
				grappleTarget.willGrapple = false;
			}
			this.setGrappleTarget(null);
			this.willGrapple = false;
		}
		else if ((this.getAnimation() == GRAPPLE_ANIMATION) && this.getGrappleTarget() != null) {
			this.faceEntity(this.getGrappleTarget(), 10, 10);
		}


		//System.err.println("this.getMateable() " + this.getMateable() + " inPFLove " + this.inPFLove);

		AnimationHandler.INSTANCE.updateAnimations(this);

	}

	@Override
	public int headbutTick() {
		//Just here to prevent the animation timing out:
		return this.GRAPPLE_ANIMATION.getDuration() - 1;
	}

	@Override
	public void launchAttack() {
		if (this.getAttackTarget() != null) {
			IAttributeInstance iattributeinstance = this.getEntityAttribute(SharedMonsterAttributes.ATTACK_DAMAGE);
			this.getAttackTarget().addVelocity(0, 0.1, 0);
			boolean b = this.getAttackTarget().attackEntityFrom(DamageSource.causeMobDamage(this), (float) iattributeinstance.getAttributeValue());
			if (this.getOneHit()) {
				this.setAttackTarget(null);
				this.setRevengeTarget(null);
				this.setWarnTarget(null);
			}
			this.setOneHit(false);
		}
	}

	@Override
	public void onEntityUpdate() {
		super.onEntityUpdate();

		if ((this.getAnimation() == GRAPPLE_ANIMATION) && this.getGrappleTarget() != null) {
			this.faceEntity(this.getGrappleTarget(), 10F, 10F);
		}


	}

	public static final PropertyDirection FACING = BlockDirectional.FACING;

	public boolean testLay(World world, BlockPos pos) {
		//System.err.println("Testing laying conditions");
		BlockPos posNest = pos;
		if (isLayableNest(world, posNest)) {
			String eggRenderType = new Object() {
				public String getValue(BlockPos posNest, String tag) {
					TileEntity tileEntity = world.getTileEntity(posNest);
					if (tileEntity != null)
						return tileEntity.getTileData().getString(tag);
					return "";
				}
			}.getValue(new BlockPos(posNest), "egg");

			//System.err.println("eggRenderType " + eggRenderType);

			if (eggRenderType.equals("")) {
				return true;
			}
		}
		return false;
	}

	@Override
	public boolean attackEntityAsMob(Entity entity) {
		if (this.getAnimation() == NO_ANIMATION) {
			this.setAnimation(ATTACK_ANIMATION);
			//System.err.println("set attack");
		}
		return false;
	}

	public boolean isDirectPathBetweenPoints(Vec3d vec1, Vec3d vec2) {
		RayTraceResult movingobjectposition = this.world.rayTraceBlocks(vec1, new Vec3d(vec2.x, vec2.y, vec2.z), false, true, false);
		return movingobjectposition == null || movingobjectposition.typeOfHit != RayTraceResult.Type.BLOCK;
	}

	//Rendering taxidermy:
	//--------------------


}