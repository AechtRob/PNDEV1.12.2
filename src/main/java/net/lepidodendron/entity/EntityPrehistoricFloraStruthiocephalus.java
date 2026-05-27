
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
import net.lepidodendron.util.Functions;
import net.lepidodendron.util.ModTriggers;
import net.minecraft.block.BlockDirectional;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.PropertyDirection;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EnumCreatureAttribute;
import net.minecraft.entity.IEntityLivingData;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.attributes.IAttributeInstance;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.nbt.NBTTagCompound;
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
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import org.apache.commons.lang3.ArrayUtils;

import javax.annotation.Nullable;
import java.util.List;

public class EntityPrehistoricFloraStruthiocephalus extends EntityPrehistoricFloraLandBase implements ITrappableLand, IAdvancementGranter {

	public BlockPos currentTarget;
	@SideOnly(Side.CLIENT)
	public ChainBuffer chainBuffer;
	public int ambientSoundTime;
	public Animation GRAPPLE_ANIMATION;
	public Animation YAWN_ANIMATION;
	private int standCooldown;

	public EntityPrehistoricFloraStruthiocephalus(World world) {
		super(world);
		setSize(1.00F, 1.00F);
		minWidth = 0.3F;
		maxWidth = 1.00F;
		maxHeight = 1.00F;
		maxHealthAgeable = 20.0D;
		GRAPPLE_ANIMATION = Animation.create(getGrappleLength());
		YAWN_ANIMATION = Animation.create(49);
	}

	@Override
	public int getRoarLength() {
		return 40;
	}

	@Override
	public int getEatLength() {
		return 20;
	}

	@Override
	public int getEggType(@Nullable String variantIn) {
		return 1; //medium
	}

	@Override
	public Animation[] getAnimations() {
		return new Animation[]{ATTACK_ANIMATION, ROAR_ANIMATION, LAY_ANIMATION, EAT_ANIMATION, GRAPPLE_ANIMATION, YAWN_ANIMATION, DRINK_ANIMATION};
	}

	public static String getPeriod() {return "Permian";}

	//public static String getHabitat() {return "Terrestrial Dicynodont";}

	@Override
	public boolean hasNest() {
		return true;
	}

	@Override
	public int getAttackLength() {
		return 20;
	}
	@Override
	public int getGrazeLength() {
		return 323;
	}

	@Override
	public int getGrazeCooldown() {
		return 2400;
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
		float speedBase = 0.28F;
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
			speedBase = speedBase * 1.85F;
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
		List<EntityPrehistoricFloraStruthiocephalus> Struthiocephalus = world.getEntitiesWithinAABB(EntityPrehistoricFloraStruthiocephalus.class, new AxisAlignedBB(this.getPosition().add(-6, -4, -6), this.getPosition().add(6, 4, 6)));
		for (EntityPrehistoricFloraStruthiocephalus currentStruthiocephalus : Struthiocephalus) {
			if ((!currentStruthiocephalus.getIsCuriousWalking()) && currentStruthiocephalus.isPFAdult() && this.isPFAdult() && currentStruthiocephalus != this && (!currentStruthiocephalus.willGrapple) && this.canEntityBeSeen(currentStruthiocephalus)) {
				this.setGrappleTarget(currentStruthiocephalus);
				currentStruthiocephalus.willGrapple = true;
				this.willGrapple = true;
				currentStruthiocephalus.setGrappleTarget(this);
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
		return 160;
	}

	@Override
	public Animation getGrappleAnimation() {
		return this.GRAPPLE_ANIMATION;
	}

	@Override
	public int getTalkInterval() {
		return 400;
	}

	public int getAmbientTalkInterval() {
		return 160;
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
		tasks.addTask(5, new LandWanderNestAI(this));
		tasks.addTask(6, new LandWanderFollowParent(this, 1.05D));
		tasks.addTask(7, new GrappleAI(this, 1.0D, false, this.getGrappleLength(), this.getGrappleAnimation(), 0.15));
		tasks.addTask(8, new LandWanderHerd(this, 1.00D, Math.max(1F, this.width) * this.getNavigator().getPathSearchRange() * 0.75F));
		tasks.addTask(9, new LandWanderAvoidWaterAI(this, 1.0D, 40));
		tasks.addTask(10, new EntityWatchClosestAI(this, EntityPlayer.class, 6.0F));
		tasks.addTask(11, new EntityWatchClosestAI(this, EntityPrehistoricFloraAgeableBase.class, 8.0F));
		tasks.addTask(12, new EntityLookIdleAI(this));
		this.targetTasks.addTask(0, new EatItemsEntityPrehistoricFloraAgeableBaseAI(this, 1));
		//this.targetTasks.addTask(1, new HuntAI(this, EntityPrehistoricFloraLandClimbingBase.class, true, (Predicate<Entity>) entity -> entity instanceof EntityLivingBase));
		//this.targetTasks.addTask(2, new HuntAI(this, EntityPrehistoricInsectFlyingBase.class, true, (Predicate<Entity>) entity -> entity instanceof EntityLivingBase));
	}

	@Override
	public String[] getFoodOreDicts() {
		return ArrayUtils.addAll(DietString.PLANTS, DietString.ROOTS);
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
				.getObject(new ResourceLocation("lepidodendron:struthiocephalus_roar"));
	}

	@Override
	public SoundEvent getHurtSound(DamageSource ds) {
	    return (SoundEvent) SoundEvent.REGISTRY
	            .getObject(new ResourceLocation("lepidodendron:struthiocephalus_hurt"));
	}

	@Override
	public SoundEvent getDeathSound() {
	    return (SoundEvent) SoundEvent.REGISTRY
	            .getObject(new ResourceLocation("lepidodendron:struthiocephalus_death"));
	}

	public SoundEvent getAmbientAmbientSound() {
		return (SoundEvent) SoundEvent.REGISTRY
				.getObject(new ResourceLocation("lepidodendron:struthiocephalus_idle"));
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
	public boolean drinksWater() {
		return false; //grazes, does not drink
	}

	@Override
	public int getDrinkLength() {
		return 200;
	}

	@Override
	public int getDrinkCooldown() {
		return 2000;
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
				&& (this.world.getBlockState(this.getPosition().offset(facing)).getMaterial() == Material.PLANTS
				|| this.world.getBlockState(this.getPosition().offset(facing)).getMaterial() == Material.LEAVES)
				//|| this.world.getBlockState(this.getPosition().offset(facing).down()).getMaterial() == Material.SAND)
		);
		if (test) {
			//Which one is water?
			facing = null;
			if (this.world.getBlockState(this.getPosition().north()).getMaterial() == Material.PLANTS
					|| this.world.getBlockState(this.getPosition().north()).getMaterial() == Material.LEAVES) {
				facing = EnumFacing.NORTH;
			}
			else if (this.world.getBlockState(this.getPosition().south()).getMaterial() == Material.PLANTS
					|| this.world.getBlockState(this.getPosition().south()).getMaterial() == Material.LEAVES) {
				facing = EnumFacing.SOUTH;
			}
			else if (this.world.getBlockState(this.getPosition().east()).getMaterial() == Material.PLANTS
					|| this.world.getBlockState(this.getPosition().east()).getMaterial() == Material.LEAVES) {
				facing = EnumFacing.EAST;
			}
			else if (this.world.getBlockState(this.getPosition().west()).getMaterial() == Material.PLANTS
					|| this.world.getBlockState(this.getPosition().west()).getMaterial() == Material.LEAVES) {
				facing = EnumFacing.WEST;
			}
			if (facing != null) {
				this.setDrinkingFrom(this.getPosition().offset(facing));
				this.faceBlock(this.getDrinkingFrom(), 10F, 10F);
			}
		}
		return test;

	}

	@Override
	public void onLivingUpdate() {
		super.onLivingUpdate();
		//this.renderYawOffset = this.rotationYaw;

		if (this.getAnimation() == ATTACK_ANIMATION && this.getAnimationTick() == 11 && this.getAttackTarget() != null) {
			launchAttack();
		}

		if (this.standCooldown > 0) {
			this.standCooldown -= rand.nextInt(3) + 1;
		}
		if (this.standCooldown < 0) {
			this.standCooldown = 0;
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

		AnimationHandler.INSTANCE.updateAnimations(this);

	}

	@Override
	public int headbutTick() {
		//Just here to prevent the animation timing out:
		return this.GRAPPLE_ANIMATION.getDuration() - 1;
	}

	private boolean isBlockGrazable(IBlockState state) {
		return (state.getMaterial() == Material.GROUND || state.getMaterial() == Material.SAND);
	}

	private boolean isGrazable(World world, BlockPos pos, EnumFacing facing) {
		if (world.getBlockState(pos.offset(facing)).getBlock().causesSuffocation(world.getBlockState(pos.offset(facing)))) {
			return false;
		}
		return true;
	}

	@Override
	public boolean isGrazing()
	{
		if (!this.isPFAdult()) {
			return false;
		}

		BlockPos entityPos = Functions.getEntityBlockPos(this);

		boolean test2 = false;
		boolean test = (this.getPFGrazing() <= 0
				&& !world.isRemote
				&& !this.getIsFast()
				//&& !this.getIsMoving()
				&& this.GRAZE_ANIMATION.getDuration() > 0
				&& this.getAnimation() == NO_ANIMATION
				&& !this.isReallyInWater()
				&&
				(
						(isBlockGrazable(this.world.getBlockState(entityPos.north().down()))
								&& isGrazable(this.world, entityPos, EnumFacing.NORTH))

								|| (isBlockGrazable(this.world.getBlockState(entityPos.south().down()))
								&& isGrazable(this.world, entityPos, EnumFacing.SOUTH))

								|| (isBlockGrazable(this.world.getBlockState(entityPos.east().down()))
								&& isGrazable(this.world, entityPos, EnumFacing.EAST))

								|| (isBlockGrazable(this.world.getBlockState(entityPos.west().down()))
								&& isGrazable(this.world, entityPos, EnumFacing.WEST))
				)
		);
		if (test) {
			//Which one is Grazable?
			EnumFacing facing = null;
			if (!test2 && isBlockGrazable(this.world.getBlockState(entityPos.north().down()))) {
				facing = EnumFacing.NORTH;
				if (Functions.getEntityCentre(this).z - Functions.getEntityBlockPos(this).getZ() <= 0.5D) {
					test2 = true;
				}
			}
			else if (!test2 && isBlockGrazable(this.world.getBlockState(entityPos.south().down()))) {
				facing = EnumFacing.SOUTH;
				if (Functions.getEntityCentre(this).z - Functions.getEntityBlockPos(this).getZ() >= 0.5D) {
					test2 = true;
				}
			}
			else if (!test2 && isBlockGrazable(this.world.getBlockState(entityPos.east().down()))) {
				facing = EnumFacing.EAST;
				if (Functions.getEntityCentre(this).z - Functions.getEntityBlockPos(this).getX() >= 0.5D) {
					test2 = true;
				}
			}
			else if (!test2 && isBlockGrazable(this.world.getBlockState(entityPos.west().down()))) {
				facing = EnumFacing.WEST;
				if (Functions.getEntityCentre(this).z - Functions.getEntityBlockPos(this).getX() <= 0.5D) {
					test2 = true;
				}
			}
			if (facing != null && test && test2) {
				this.setDrinkingFrom(entityPos.offset(facing).down());
				this.faceBlock(this.getDrinkingFrom(), 10F, 10F);
			}
		}
		return test && test2;
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
	public IEntityLivingData onInitialSpawn(DifficultyInstance difficulty, @Nullable IEntityLivingData livingdata) {
		livingdata = super.onInitialSpawn(difficulty, livingdata);
		this.standCooldown = rand.nextInt(2000);
		return livingdata;
	}

	public void writeEntityToNBT(NBTTagCompound compound)
	{
		super.writeEntityToNBT(compound);
		compound.setInteger("standCooldown", this.standCooldown);
	}

	public void readEntityFromNBT(NBTTagCompound compound) {
		super.readEntityFromNBT(compound);
		this.standCooldown = compound.getInteger("standCooldown");
	}

	@Override
	public void onEntityUpdate() {
		if ((this.getAnimation() == GRAPPLE_ANIMATION) && this.getGrappleTarget() != null) {
			this.faceEntity(this.getGrappleTarget(), 10F, 10F);
		}
		super.onEntityUpdate();
		if (this.isEntityAlive() && this.rand.nextInt(1000) < this.ambientSoundTime++ && !this.world.isRemote)
		{
			this.ambientSoundTime = -this.getAmbientTalkInterval();
			SoundEvent soundevent = this.getAmbientAmbientSound();
			if (soundevent != null)
			{
				if (this.getAnimation() == NO_ANIMATION) {
					this.setAnimation(ROAR_ANIMATION);
					//System.err.println("Playing noise sound on remote: " + (world.isRemote));
					this.playSound(soundevent, this.getSoundVolume(), this.getSoundPitch());
				}
			}
		}

		if ((!this.world.isRemote) && this.getEatTarget() == null && this.getAttackTarget() == null && this.getRevengeTarget() == null && this.getAlarmTarget() == null
				&& !this.getIsMoving() && this.getAnimation() == NO_ANIMATION && standCooldown == 0) {
			this.setAnimation(YAWN_ANIMATION);

			this.standCooldown = 2000;
		}

		if ((!this.world.isRemote) && this.getAnimation() == YAWN_ANIMATION
				&& (this.getAnimationTick() == YAWN_ANIMATION.getDuration() - 1) || this.isReallyInWater()) {
			this.standCooldown = 2000;
			this.setAnimation(NO_ANIMATION);
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

	@Nullable
	protected ResourceLocation getLootTable() {
		if (!this.isPFAdult()) {
			return LepidodendronMod.STRUTHIOCEPHALUS_LOOT_YOUNG;
		}
		return LepidodendronMod.STRUTHIOCEPHALUS_LOOT;
	}

	//Rendering taxidermy:
	//--------------------


	@Nullable
	@Override
	public CustomTrigger getModTrigger() {
		return ModTriggers.CLICK_STRUTHIOCEPHALUS;
	}
}