
package net.lepidodendron.entity;

import com.google.common.base.Predicate;
import net.ilexiconn.llibrary.client.model.tools.ChainBuffer;
import net.ilexiconn.llibrary.server.animation.Animation;
import net.ilexiconn.llibrary.server.animation.AnimationHandler;
import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.block.base.IAdvancementGranter;
import net.lepidodendron.entity.ai.*;
import net.lepidodendron.entity.base.EntityPrehistoricFloraAgeableBase;
import net.lepidodendron.entity.base.EntityPrehistoricFloraLandBase;
import net.lepidodendron.entity.util.ICurious;
import net.lepidodendron.entity.util.INervous;
import net.lepidodendron.entity.util.IScreamer;
import net.lepidodendron.util.CustomTrigger;
import net.lepidodendron.util.ModTriggers;
import net.minecraft.block.BlockDirectional;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.PropertyDirection;
import net.minecraft.entity.*;
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
import net.minecraft.world.World;
import net.minecraftforge.fml.common.FMLCommonHandler;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import org.apache.commons.lang3.ArrayUtils;

import javax.annotation.Nullable;
import java.util.List;

public class EntityPrehistoricFloraCompsognathus extends EntityPrehistoricFloraLandBase implements IAdvancementGranter, IScreamer, ICurious, INervous {

	public BlockPos currentTarget;
	@SideOnly(Side.CLIENT)
	public ChainBuffer chainBuffer;
	private int inPFLove;
	public ChainBuffer tailBuffer;
	private boolean screaming;
	private int alarmCooldown;
	private int curious;
	private float curiosity = 0.65F; //Between 0 and 1 with 1 being most curious and 0 not at all
	private int nervousnessTimer;
	private EntityLivingBase nervousnessTarget;
	public Animation GRAPPLE_ANIMATION;
	public Animation IDLE1;
	public Animation IDLE2;
	public Animation IDLE3;
	public Animation IDLE4;
	public Animation IDLE_CURIOUS1;
	public Animation IDLE_CURIOUS2;
	private int standCooldown;

	public EntityPrehistoricFloraCompsognathus(World world) {
		super(world);
		setSize(0.375F, 0.5F);
		minWidth = 0.12F;
		maxWidth = 0.375F;
		maxHeight = 0.5F;
		maxHealthAgeable = 10.0D;
		if (FMLCommonHandler.instance().getSide().isClient()) {
			tailBuffer = new ChainBuffer();
		}
		GRAPPLE_ANIMATION = Animation.create(this.getGrappleLength());
		IDLE1 = Animation.create(50);
		IDLE2 = Animation.create(60);
		IDLE3 = Animation.create(50);
		IDLE4 = Animation.create(100);
		IDLE_CURIOUS1 = Animation.create(15);
		IDLE_CURIOUS2 = Animation.create(60);
	}

	public int getGrappleLength() {
		return 60;
	}

	@Override
	public int getEatLength() {
		return 40;
	}

	@Override
	public Animation[] getAnimations() {
		return new Animation[]{GRAPPLE_ANIMATION, GRAZE_ANIMATION, ATTACK_ANIMATION, ROAR_ANIMATION, LAY_ANIMATION, EAT_ANIMATION, MAKE_NEST_ANIMATION, IDLE_CURIOUS1, IDLE_CURIOUS2, IDLE1, IDLE2, IDLE3, IDLE4};
	}

	@Override
	public boolean isAnimationDirectionLocked(Animation animation) {
		return animation == IDLE1 || animation == IDLE2 || animation == IDLE3 || animation == IDLE4 || animation == GRAPPLE_ANIMATION
				|| super.isAnimationDirectionLocked(animation);
	}

	@Nullable
	public EntityLivingBase getNervousnessTarget()
	{
		return this.nervousnessTarget;
	}

	public void setNervousnessTarget(@Nullable EntityLivingBase livingBase)
	{
		this.nervousnessTarget = livingBase;
		this.nervousnessTimer = this.ticksExisted;
	}

	public void writeEntityToNBT(NBTTagCompound compound) {
		super.writeEntityToNBT(compound);
		compound.setInteger("curious", this.curious);
		compound.setInteger("NervousByTimestamp", this.nervousnessTimer);
	}

	public void readEntityFromNBT(NBTTagCompound compound) {
		super.readEntityFromNBT(compound);
		this.curious = compound.getInteger("curious");
		this.nervousnessTimer = compound.getInteger("NervousByTimestamp");
	}

	@Override
	public void onUpdate() {
		super.onUpdate();
		if (world.isRemote && !this.isAIDisabled()) {
			tailBuffer.calculateChainSwingBuffer(60, 10, 5F, this);
		}
	}

	@Override
	public boolean attackEntityFrom(DamageSource ds, float i) {
		Entity e = ds.getTrueSource();
		if (e instanceof EntityLivingBase) {
			EntityLivingBase ee = (EntityLivingBase) e;
			List<EntityPrehistoricFloraCompsognathus> Compsognathus = this.world.getEntitiesWithinAABB(EntityPrehistoricFloraCompsognathus.class, new AxisAlignedBB(this.getPosition().add(-8, -4, -8), this.getPosition().add(8, 4, 8)));
			for (EntityPrehistoricFloraCompsognathus currentCompsognathus : Compsognathus) {
				currentCompsognathus.setRevengeTarget(ee);
				currentCompsognathus.alarmCooldown = rand.nextInt(20);
			}
		}
		return super.attackEntityFrom(ds, i);
	}

	@Override
	public int getEggType(@Nullable String variantIn) {
		return 0; //small
	}

	public void setScreaming(boolean screaming) {
		this.screaming = screaming;
	}

	public boolean getScreaming() {
		return this.screaming;
	}

	@Nullable
	@Override
	public EntityAgeable createChild(EntityAgeable ageable) {
		return null;
	}

	public static String getPeriod() {return "Jurassic";}

	//public static String getHabitat() {return "Terrestrial Therapsid";}

	@Override
	public boolean hasNest() {
		return true;
	}

	@Override
	public int getAttackLength() {
		return 20;
	}

	@Override
	public int getRoarLength() {
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
		float speedBase = 0.35F;
		if (this.getIsCuriousWalking()) {
			speedBase = 0.70F;
		}
		if (this.getTicks() < 0) {
			return 0.0F; //Is laying eggs
		}
		if ((this.getAnimation() == GRAPPLE_ANIMATION) && (this.willGrapple) && this.getGrappleTarget() != null) {
			return 0.0F; //Is talking to a colleague!
		}
		if (this.getAnimation() == DRINK_ANIMATION || this.getAnimation() == MAKE_NEST_ANIMATION) {
			return 0.0F;
		}
		if (this.getIsFast()) {
			speedBase =  0.335F * 2.65F;
		}
		return speedBase;
	}

	@Override
	public int grappleChance() {
		return 2000;
	}

	@Override
	public int getTalkInterval() {
		return 80;
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
	public AxisAlignedBB getGrappleBoundingBox() {
		float size = this.getRenderSizeModifier() * 0.25F;
		return this.getEntityBoundingBox().grow(2.0F + size, 1.0F + size, 2.0F + size);
	}

	public boolean findGrappleTarget() {
		//System.err.println("finding grapple target");
		if (this.willGrapple || this.getIsCuriousWalking()) {
			return false;
		}
		List<EntityPrehistoricFloraCompsognathus> Compsognathus = world.getEntitiesWithinAABB(EntityPrehistoricFloraCompsognathus.class, new AxisAlignedBB(this.getPosition().add(-8, -4, -8), this.getPosition().add(8, 4, 8)));
		for (EntityPrehistoricFloraCompsognathus currentCompsognathus : Compsognathus) {
			if ((!currentCompsognathus.getIsCuriousWalking()) && currentCompsognathus.isPFAdult() && this.isPFAdult() && currentCompsognathus != this && (!currentCompsognathus.willGrapple) && this.canEntityBeSeen(currentCompsognathus)) {
				this.setGrappleTarget(currentCompsognathus);
				currentCompsognathus.willGrapple = true;
				this.willGrapple = true;
				currentCompsognathus.setGrappleTarget(this);
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
	public Animation getGrappleAnimation() {
		return this.GRAPPLE_ANIMATION;
	}

	@Override
	public float getEyeHeight()
	{
		return this.height * 0.70F;
	}

	@Override
	public float getSwimHeight() {
		return getEyeHeight();
	}

	protected void initEntityAI() {
		tasks.addTask(0, new EntityMateAIAgeableBase(this, 1.0D));
		tasks.addTask(1, new LandEntitySwimmingAI(this, 0.75, false));
		tasks.addTask(2, new AttackAI(this, 1.0D, false, this.getAttackLength()));
		tasks.addTask(3, new PanicScreamAI(this, 1.0));
		tasks.addTask(4, new PanicWhenLookedAI(this, 1.0F));
		tasks.addTask(5, new GrappleAI(this, 1.0D, false, this.getGrappleLength(), this.getGrappleAnimation(), 0.25));
		tasks.addTask(6, new LandWanderNestAI(this));
		tasks.addTask(7, new LandWanderFollowHuman(this, 1.0D, 5));
		tasks.addTask(8, new LandWanderFollowParent(this, 1.05D));
		tasks.addTask(9, new LandWanderHerd(this, 1.00D, this.getNavigator().getPathSearchRange()*0.666F, 5));
		tasks.addTask(10, new LandWanderAvoidWaterAndHumanAI(this, 1.0D));
		tasks.addTask(11, new LandWanderAvoidWaterAI(this, 1.0D));
		tasks.addTask(12, new EntityWatchClosestAI(this, EntityPlayer.class, 6.0F, 1.0F));
		tasks.addTask(13, new EntityLookIdleAI(this));
		this.targetTasks.addTask(0, new EatItemsEntityPrehistoricFloraAgeableBaseAI(this, 1));
		this.targetTasks.addTask(1, new HuntForDietEntityPrehistoricFloraAgeableBaseAI(this, EntityLivingBase.class, true, (Predicate<Entity>) entity -> entity instanceof EntityLivingBase, 0.1F, 1.2F, false));
		this.targetTasks.addTask(2, new EntityHurtByTargetSmallerThanMeAI(this, false));
	}

	@Override
	public String[] getFoodOreDicts() {
		return ArrayUtils.addAll(DietString.EGGS, DietString.BUG);
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
	public boolean drinksWater() {
		return false; //grazes, does not drink
	}

	@Override
	public int getDrinkLength() {
		return 70;  //grazes, does not drink
	}

	@Override
	public int getDrinkCooldown() {
		return 400;
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
				&& (this.world.getBlockState(this.getPosition().offset(facing).down()).getMaterial() == Material.GROUND
				|| this.world.getBlockState(this.getPosition().offset(facing).down()).getMaterial() == Material.GRASS
				|| this.world.getBlockState(this.getPosition().offset(facing).down()).getMaterial() == Material.PLANTS
				|| this.world.getBlockState(this.getPosition().offset(facing).down()).getMaterial() == Material.LEAVES
				|| this.world.getBlockState(this.getPosition().offset(facing).down()).getMaterial() == Material.SAND)
		);
		if (test) {
			//Which one is water?
			facing = null;
			if (this.world.getBlockState(this.getPosition().north().down()).getMaterial() == Material.GROUND
					|| this.world.getBlockState(this.getPosition().north().down()).getMaterial() == Material.GRASS
					|| this.world.getBlockState(this.getPosition().north().down()).getMaterial() == Material.PLANTS
					|| this.world.getBlockState(this.getPosition().north().down()).getMaterial() == Material.LEAVES
					|| this.world.getBlockState(this.getPosition().north().down()).getMaterial() == Material.SAND) {
				facing = EnumFacing.NORTH;
			}
			else if (this.world.getBlockState(this.getPosition().south().down()).getMaterial() == Material.GROUND
					|| this.world.getBlockState(this.getPosition().south().down()).getMaterial() == Material.GRASS
					|| this.world.getBlockState(this.getPosition().south().down()).getMaterial() == Material.PLANTS
					|| this.world.getBlockState(this.getPosition().south().down()).getMaterial() == Material.LEAVES
					|| this.world.getBlockState(this.getPosition().south().down()).getMaterial() == Material.SAND) {
				facing = EnumFacing.SOUTH;
			}
			else if (this.world.getBlockState(this.getPosition().east().down()).getMaterial() == Material.GROUND
					|| this.world.getBlockState(this.getPosition().east().down()).getMaterial() == Material.GRASS
					|| this.world.getBlockState(this.getPosition().east().down()).getMaterial() == Material.PLANTS
					|| this.world.getBlockState(this.getPosition().east().down()).getMaterial() == Material.LEAVES
					|| this.world.getBlockState(this.getPosition().east().down()).getMaterial() == Material.SAND) {
				facing = EnumFacing.EAST;
			}
			else if (this.world.getBlockState(this.getPosition().west().down()).getMaterial() == Material.GROUND
					|| this.world.getBlockState(this.getPosition().west().down()).getMaterial() == Material.GRASS
					|| this.world.getBlockState(this.getPosition().west().down()).getMaterial() == Material.PLANTS
					|| this.world.getBlockState(this.getPosition().west().down()).getMaterial() == Material.LEAVES
					|| this.world.getBlockState(this.getPosition().west().down()).getMaterial() == Material.SAND) {
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
	protected boolean canDespawn() {
		return false;
	}

	@Override
	protected void applyEntityAttributes() {
		super.applyEntityAttributes();
		this.getAttributeMap().registerAttribute(SharedMonsterAttributes.ATTACK_DAMAGE);
		this.getEntityAttribute(SharedMonsterAttributes.ATTACK_DAMAGE).setBaseValue(2.0D);
		this.getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).setBaseValue(0.25D);
	}

	@Override
	public SoundEvent getAmbientSound() {
	    return (SoundEvent) SoundEvent.REGISTRY
	            .getObject(new ResourceLocation("lepidodendron:compsognathus_idle"));
	}

	@Override
	public SoundEvent getHurtSound(DamageSource ds) {
	    return (SoundEvent) SoundEvent.REGISTRY
	            .getObject(new ResourceLocation("lepidodendron:compsognathus_hurt"));
	}

	@Override
	public SoundEvent getDeathSound() {
	    return (SoundEvent) SoundEvent.REGISTRY
	            .getObject(new ResourceLocation("lepidodendron:compsognathus_death"));
	}

	public SoundEvent getAlarmSound() {
		return (SoundEvent) SoundEvent.REGISTRY
				.getObject(new ResourceLocation("lepidodendron:compsognathus_alarm"));
	}

	public SoundEvent getChatterSound() {
		return (SoundEvent) SoundEvent.REGISTRY
				.getObject(new ResourceLocation("lepidodendron:compsognathus_chatter"));
	}

	public void playAlarmSound()
	{
		SoundEvent soundevent = this.getAlarmSound();
		//System.err.println("looking for alarm sound");
		if (soundevent != null)
		{
			//System.err.println("playing alarm sound");
			this.playSound(soundevent, this.getSoundVolume(), this.getSoundPitch());
			this.alarmCooldown = 20;
		}
	}

	@Override
	protected float getSoundVolume() {
		return 0.50F;
	}

	@Override
	public boolean getCanSpawnHere() {
		return this.posY < (double) this.world.getSeaLevel() && this.isInWater();
	}
	

	@Override
	public void onLivingUpdate() {
		super.onLivingUpdate();
		if (this.getAnimation() != DRINK_ANIMATION) {
			//this.renderYawOffset = this.rotationYaw;
		}
		if (this.getAnimation() == DRINK_ANIMATION) {
			EnumFacing facing = this.getAdjustedHorizontalFacing();
			this.faceBlock(this.getDrinkingFrom(), 10F, 10F);
		}

		if (this.getAnimation() == ATTACK_ANIMATION && this.getAnimationTick() == 11 && this.getAttackTarget() != null) {
			launchAttack();
		}

		if (this.standCooldown > 0) {
			this.standCooldown -= rand.nextInt(3) + 1;
		}
		if (this.standCooldown < 0) {
			this.standCooldown = 0;
		}

		if (!this.world.isRemote) {
			if (this.getAnimation() == GRAPPLE_ANIMATION) {
				if (this.getAnimationTick() == 1) {
					this.playSound(this.getChatterSound(), this.getSoundVolume(), 1);
				}
			}
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

	@Override
	public void onEntityUpdate() {
		if (this.alarmCooldown > 0) {
			this.alarmCooldown -= 1;
		}
		if (this.getScreaming() && alarmCooldown <= 0) {
			this.playAlarmSound();
		}

		if ((this.getAnimation() == GRAPPLE_ANIMATION) && this.getGrappleTarget() != null) {
			this.faceEntity(this.getGrappleTarget(), 10F, 10F);
		}

		if (!this.world.isRemote) {
			this.curious -= 1;
			if (this.curious < minCurious()) {
				this.curious = maxCurious();
			}
		}

		if (this.nervousnessTarget != null)
		{
			if (!this.nervousnessTarget.isEntityAlive())
			{
				this.setNervousnessTarget((EntityLivingBase)null);
			}
			else if (this.ticksExisted - this.nervousnessTimer > 100)
			{
				this.setNervousnessTarget((EntityLivingBase)null);
			}
		}

		super.onEntityUpdate();

		//Alert animation
		if ((!this.world.isRemote) && this.getEatTarget() == null && this.getAttackTarget() == null && this.getRevengeTarget() == null
				&& !this.getIsMoving() && this.getAnimation() == NO_ANIMATION && standCooldown == 0) {
			int next = rand.nextInt(4);
			switch (next) {
				case 0:
				default:
					this.setAnimation(IDLE1);
					break;

				case 1:
					this.setAnimation(IDLE2);
					break;

				case 2:
					this.setAnimation(IDLE3);
					break;

				case 3:
					this.setAnimation(IDLE4);
					break;
			}
			this.standCooldown = 2000;
		}
		//forces animation to return to base pose by grabbing the last tick and setting it to that.
		if ((!this.world.isRemote) && this.getAnimation() == IDLE1 && this.getAnimationTick() == IDLE1.getDuration() - 1) {
			this.standCooldown = 3000;
			this.setAnimation(NO_ANIMATION);
		}
		if ((!this.world.isRemote) && this.getAnimation() == IDLE2 && this.getAnimationTick() == IDLE2.getDuration() - 1) {
			this.standCooldown = 3000;
			this.setAnimation(NO_ANIMATION);
		}
		if ((!this.world.isRemote) && this.getAnimation() == IDLE3 && this.getAnimationTick() == IDLE3.getDuration() - 1) {
			this.standCooldown = 3000;
			this.setAnimation(NO_ANIMATION);
		}
		if ((!this.world.isRemote) && this.getAnimation() == IDLE4 && this.getAnimationTick() == IDLE4.getDuration() - 1) {
			this.standCooldown = 3000;
			this.setAnimation(NO_ANIMATION);
		}
	}

	public boolean isDirectPathBetweenPoints(Vec3d vec1, Vec3d vec2) {
		RayTraceResult movingobjectposition = this.world.rayTraceBlocks(vec1, new Vec3d(vec2.x, vec2.y, vec2.z), false, true, false);
		return movingobjectposition == null || movingobjectposition.typeOfHit != RayTraceResult.Type.BLOCK;
	}

	@Nullable
	protected ResourceLocation getLootTable() {
		if (!this.isPFAdult()) {
			return LepidodendronMod.COMPSOGNATHUS_LOOT_YOUNG;
		}
		return LepidodendronMod.COMPSOGNATHUS_LOOT;
	}

	@Override
	public boolean isCurious() {
		return this.curious > 0 && !this.world.isRemote;
	}

	@Override
	public Animation getCuriousAnimation() {
		if (rand.nextInt(2) == 0) {
			return IDLE_CURIOUS1;
		}
		return IDLE_CURIOUS2;
	}

	public int minCurious() {
		return -Math.round((1.0F - this.curiosity) * 3000F);
	}

	public int maxCurious() {
		return Math.round(this.curiosity * 3000F);
	}

	@Nullable
	@Override
	public CustomTrigger getModTrigger() {
		return ModTriggers.CLICK_COMPSOGNATHUS;
	}

	//Rendering taxidermy:
	//--------------------


}