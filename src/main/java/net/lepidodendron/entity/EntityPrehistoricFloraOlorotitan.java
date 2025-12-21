
package net.lepidodendron.entity;

import net.ilexiconn.llibrary.client.model.tools.ChainBuffer;
import net.ilexiconn.llibrary.server.animation.Animation;
import net.ilexiconn.llibrary.server.animation.AnimationHandler;
import net.lepidodendron.LepidodendronConfig;
import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.block.BlockNest;
import net.lepidodendron.block.base.IAdvancementGranter;
import net.lepidodendron.entity.ai.*;
import net.lepidodendron.entity.base.EntityPrehistoricFloraAgeableBase;
import net.lepidodendron.entity.base.EntityPrehistoricFloraLandBase;
import net.lepidodendron.entity.util.IBluffer;
import net.lepidodendron.entity.util.ITrappableLand;
import net.lepidodendron.util.CustomTrigger;
import net.lepidodendron.util.Functions;
import net.lepidodendron.util.ModTriggers;
import net.minecraft.block.BlockDirectional;
import net.minecraft.block.material.EnumPushReaction;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.PropertyDirection;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EnumCreatureAttribute;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
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

public class EntityPrehistoricFloraOlorotitan extends EntityPrehistoricFloraLandBase implements IAdvancementGranter, IBluffer, ITrappableLand {

	public BlockPos currentTarget;
	@SideOnly(Side.CLIENT)
	public ChainBuffer tailBuffer;
	private int standCooldown;
	public Animation STAND_ANIMATION;
	public Animation GRAPPLE_ANIMATION;


	public EntityPrehistoricFloraOlorotitan(World world) {
		super(world);
		setSize(1.5F, 3.0F);
		minWidth = 0.20F;
		maxWidth = 1.5F;
		maxHeight = 3.0F;
		maxHealthAgeable = 120.0D;
		STAND_ANIMATION = Animation.create(190);
		if (FMLCommonHandler.instance().getSide().isClient()) {
			tailBuffer = new ChainBuffer();
		}
		GRAPPLE_ANIMATION = Animation.create(this.getGrappleLength());
	}

	@Override
	public EnumPushReaction getPushReaction() {
		if (this.getAnimation() == DRINK_ANIMATION) {
			return EnumPushReaction.IGNORE;
		}
		return super.getPushReaction();
	}


	@Override
	public void onUpdate() {
		super.onUpdate();
		if (world.isRemote && !this.isAIDisabled()) {
			tailBuffer.calculateChainSwingBuffer(120, 10, 5F, this);
		}
	}

	@Override
	public int getEggType(@Nullable String PNType) {
		return 2; //large
	}

	@Override
	public Animation[] getAnimations() {
		return new Animation[]{ATTACK_ANIMATION, GRAZE_ANIMATION, ROAR_ANIMATION, LAY_ANIMATION, EAT_ANIMATION, STAND_ANIMATION, GRAPPLE_ANIMATION};
	}

	public static String getPeriod() {return "Early Cretaceous";}

	@Override
	public int getEatLength() {
		return 20;
	}

	@Override
	public boolean hasNest() {
		return true;
	}

	@Override
	public int getAttackLength() {
		return 15;
	}

	@Override
	public int getRoarLength() {
		return 70;
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
		float speedBase = 0.38F;
		if (this.getTicks() < 0) {
			return 0.0F; //Is laying eggs
		}
		if (this.getAnimation() == DRINK_ANIMATION || this.getAnimation() == GRAZE_ANIMATION || this.getAnimation() == MAKE_NEST_ANIMATION || this.getAnimation() == STAND_ANIMATION) {
			return 0.0F;
		}
		if ((this.getAnimation() == GRAPPLE_ANIMATION) && (this.willGrapple) && this.getGrappleTarget() != null) {
			return 0.0F; //Is talking to a colleague!
		}
		if (this.getIsFast()) {
			speedBase = speedBase * 1.9F;
		}
		return speedBase;
	}

	@Override
	public int grappleChance() {
		return 4000;
	}

	@Override
	public AxisAlignedBB getGrappleBoundingBox() {
		float size = this.getRenderSizeModifier() * 0.25F;
		return this.getEntityBoundingBox().grow(1.0F + size, 1.0F + size, 1.0F + size);
	}

	public boolean findGrappleTarget() {
		//System.err.println("finding grapple target");
		if (this.willGrapple || this.getIsCuriousWalking()) {
			return false;
		}
		List<EntityPrehistoricFloraOlorotitan> Olorotitan = world.getEntitiesWithinAABB(EntityPrehistoricFloraOlorotitan.class, new AxisAlignedBB(this.getPosition().add(-12, -4, -12), this.getPosition().add(12, 4, 12)));
		for (EntityPrehistoricFloraOlorotitan currentOlorotitan : Olorotitan) {
			if ((!currentOlorotitan.getIsCuriousWalking()) && currentOlorotitan.isPFAdult() && this.isPFAdult() && currentOlorotitan != this && (!currentOlorotitan.willGrapple) && this.canEntityBeSeen(currentOlorotitan)) {
				this.setGrappleTarget(currentOlorotitan);
				currentOlorotitan.willGrapple = true;
				this.willGrapple = true;
				currentOlorotitan.setGrappleTarget(this);
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
		return 140;
	}

	@Override
	public Animation getGrappleAnimation() {
		return this.GRAPPLE_ANIMATION;
	}

	@Override
	public boolean drinksWater() {
		return false;
	}

	@Override
	public int getDrinkLength() {
		return 340;
	}

	@Override
	public int getDrinkCooldown() {
		return 1000;
	}

	private boolean isDrinkable(World world, BlockPos pos, EnumFacing facing) {
		int x = 2;
		int y = 1;
		for (int xx = 0; xx < x; xx++) {
			for (int yy = 0; yy < y; yy++) {
				if (world.getBlockState(pos.offset(facing, xx).up(yy)).getBlock().causesSuffocation(world.getBlockState(pos.offset(facing, xx).up(yy)))) {
					return false;
				}
			}
		}
		return true;
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
	public boolean isDrinking()
	{
		if (!this.isPFAdult()) {
			return false;
		}

		BlockPos entityPos = Functions.getEntityBlockPos(this);

		boolean test = (this.getPFDrinking() <= 0
				&& !world.isRemote
				&& !this.getIsFast()
				//&& !this.getIsMoving()
				&& this.DRINK_ANIMATION.getDuration() > 0
				&& this.getAnimation() == NO_ANIMATION
				&& this.onGround
				&& !this.isReallyInWater()
				&&
				(
						(this.world.getBlockState(entityPos.north().down()).getMaterial() == Material.GRASS
								&& isDrinkable(this.world, entityPos, EnumFacing.NORTH))

								|| (this.world.getBlockState(entityPos.south().down()).getMaterial() == Material.GRASS
								&& isDrinkable(this.world, entityPos, EnumFacing.SOUTH))

								|| (this.world.getBlockState(entityPos.east().down()).getMaterial() == Material.GRASS
								&& isDrinkable(this.world, entityPos, EnumFacing.EAST))

								|| (this.world.getBlockState(entityPos.west().down()).getMaterial() == Material.GRASS
								&& isDrinkable(this.world, entityPos, EnumFacing.WEST))
				)
		);
		if (test) {
			//Which one is water?
			EnumFacing facing = null;
			if (this.world.getBlockState(entityPos.north().down()).getMaterial() == Material.GRASS) {
				facing = EnumFacing.NORTH;
			}
			else if (this.world.getBlockState(entityPos.south().down()).getMaterial() == Material.GRASS) {
				facing = EnumFacing.SOUTH;
			}
			else if (this.world.getBlockState(entityPos.east().down()).getMaterial() == Material.GRASS) {
				facing = EnumFacing.EAST;
			}
			else if (this.world.getBlockState(entityPos.west().down()).getMaterial() == Material.GRASS) {
				facing = EnumFacing.WEST;
			}
			if (facing != null) {
				this.setDrinkingFrom(entityPos.offset(facing, 2));
				this.faceBlock(this.getDrinkingFrom(), 10F, 10F);
			}
		}
		return test;
	}

	@Override
	public int getTalkInterval() {
		return 360;
	}

	//This is how many ticks it takes for a young mob to become an adult
	@Override
	public int getAdultAge() {
		return 92000;
	}

	public AxisAlignedBB getAttackBoundingBox() {
		float size = this.getRenderSizeModifier() * 1.50F * this.getAgeScale();
		return this.getEntityBoundingBox().grow(0.5F + size, 0.2F, 0.5F + size);
	}

	@Override
	@SideOnly(Side.CLIENT)
	public AxisAlignedBB getRenderBoundingBox() {
		if (LepidodendronConfig.renderBigMobsProperly && (this.maxWidth * this.getAgeScale()) > 1F) {
			return this.getEntityBoundingBox().grow(2.0, 1.00, 2.0);
		}
		return this.getEntityBoundingBox();
	}

	@Override
	public float getEyeHeight()
	{
		return Math.max(super.getEyeHeight(), this.height * 0.9F);
	}

	@Override
	public float getSwimHeight()
	{
		return this.height * 1.1F;
	}

	//define the entity's AI here
	protected void initEntityAI() {
		tasks.addTask(0, new EntityMateAIAgeableBase(this, 1.0D));
		tasks.addTask(1, new EntityTemptAI(this, 1, false, true, (float) this.getEntityAttribute(SharedMonsterAttributes.ATTACK_DAMAGE).getAttributeValue() * 0.33F));
		tasks.addTask(2, new LandEntitySwimmingAI(this, 0.75, false));
		//tasks.addTask(3, new AgeableWarnEntity(this, EntityPlayer.class, 4));
		tasks.addTask(4, new AttackAI(this, 1.0D, false, this.getAttackLength()));
		tasks.addTask(5, new PanicAI(this, 1.0));
		tasks.addTask(6, new GrappleAI(this, 1.0D, false, this.getGrappleLength(), this.getGrappleAnimation(), 0.15));
		tasks.addTask(7, new LandWanderNestAI(this));
		tasks.addTask(8, new LandWanderFollowParent(this, 1.05D));
		tasks.addTask(9, new LandWanderAvoidWaterAI(this, 1.0D, 45));
		tasks.addTask(10, new EntityWatchClosestAI(this, EntityPlayer.class, 6.0F));
		tasks.addTask(11, new EntityWatchClosestAI(this, EntityPrehistoricFloraAgeableBase.class, 8.0F));
		tasks.addTask(12, new EntityLookIdleAI(this));
		this.targetTasks.addTask(0, new EatItemsEntityPrehistoricFloraAgeableBaseAI(this, 1));
		//this.targetTasks.addTask(1, new EntityHurtByTargetSmallerThanMeAI(this, false));
	}

	@Override
	public boolean panics() {
		return true;
	}

	@Override
	public String[] getFoodOreDicts() {
		return ArrayUtils.addAll(DietString.PLANTS);
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
		this.getEntityAttribute(SharedMonsterAttributes.ATTACK_DAMAGE).setBaseValue(6.0D);
		this.getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).setBaseValue(0.25D);
	}


	@Override
	public SoundEvent getAmbientSound() {
		return (SoundEvent) SoundEvent.REGISTRY
				.getObject(new ResourceLocation("lepidodendron:olorotitan_idle"));
	}

	@Override
	public SoundEvent getHurtSound(DamageSource ds) {
	    return (SoundEvent) SoundEvent.REGISTRY
	            .getObject(new ResourceLocation("lepidodendron:olorotitan_hurt"));
	}

	@Override
	public SoundEvent getDeathSound() {
	    return (SoundEvent) SoundEvent.REGISTRY
	            .getObject(new ResourceLocation("lepidodendron:olorotitan_death"));
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
	public void onEntityUpdate() {
		super.onEntityUpdate();
		if ((!this.world.isRemote) && this.getEatTarget() == null && this.getAttackTarget() == null && this.getRevengeTarget() == null
				&& !this.getIsMoving() && this.getAnimation() == NO_ANIMATION && standCooldown == 0) {
			if (this.getAnimation() == NO_ANIMATION) {
				this.setAnimation(STAND_ANIMATION);
			}
			this.standCooldown = 2000;
		}
		if ((!this.world.isRemote) && this.getAnimation() == STAND_ANIMATION && this.getAnimationTick() == STAND_ANIMATION.getDuration() - 1) {
			this.standCooldown = 2000;
			this.setAnimation(NO_ANIMATION);
		}

	}

	@Override
	public void onLivingUpdate() {

		super.onLivingUpdate();
		if (this.standCooldown > 0) {
			this.standCooldown -= rand.nextInt(3) + 1;
		}
		if (this.standCooldown < 0) {
			this.standCooldown = 0;
		}

		if (this.getAnimation() == ATTACK_ANIMATION && this.getAttackTarget() != null) {
			if (this.getAnimationTick() == 10) {
				launchAttack();
			}
		}

		if (this.getAnimation() == GRAZE_ANIMATION && !world.isRemote) {
			if (LepidodendronConfig.doGrazeGrief && world.getGameRules().getBoolean("mobGriefing") && this.getWillHunt() && (!world.isRemote) && this.getAnimationTick() >= this.getAnimation().getDuration() * 0.75F) {
				ItemStack item = world.getBlockState(this.getGrazingFrom()).getBlock().getPickBlock(world.getBlockState(this.getGrazingFrom()), null, world, this.getGrazingFrom(), null);
				world.destroyBlock(this.getGrazingFrom(), true);
				float itemHealth = 0.5F; //Default minimal nutrition
				if (item.getItem() instanceof ItemFood) {
					itemHealth = ((ItemFood) item.getItem()).getHealAmount(item);
				}
				this.setHealth(Math.min(this.getHealth() + itemHealth, (float) this.getEntityAttribute(SharedMonsterAttributes.MAX_HEALTH).getBaseValue()));
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
		else if (this.getAnimation() == GRAPPLE_ANIMATION) {
			if (this.getGrappleTarget() != null) {
				this.faceEntity(this.getGrappleTarget(), 10, 10);
			}
		}

		//Propagate alert from the roar signal:
		if ((!this.world.isRemote) && this.getAnimation() == ROAR_ANIMATION && this.getWarnTarget() != null
			&& this.getAnimationTick() > this.ROAR_ANIMATION.getDuration() * 0.75) {
			List<EntityPrehistoricFloraOlorotitan> Camptosaurus = this.world.getEntitiesWithinAABB(EntityPrehistoricFloraOlorotitan.class, new AxisAlignedBB(this.getPosition().add(-12, -6, -12), this.getPosition().add(12, 6, 12)));
			for (EntityPrehistoricFloraOlorotitan currentCamptosaurus : Camptosaurus) {
				currentCamptosaurus.setRevengeTarget(this.getWarnTarget());
			}
		}

		if (this.standCooldown > 0) {
			this.standCooldown -= rand.nextInt(3) + 1;
		}
		if (this.standCooldown < 0) {
			this.standCooldown = 0;
		}
		AnimationHandler.INSTANCE.updateAnimations(this);

		//System.err.println("Eating: " + this.getEatTarget() + " isFast " + this.getIsFast());



	}

	public static final PropertyDirection FACING = BlockDirectional.FACING;

	@Override
	public int headbutTick() {
		//Just here to prevent the animation timing out:
		return this.GRAPPLE_ANIMATION.getDuration() - 1;
	}

	public boolean testLay(World world, BlockPos pos) {
		//System.err.println("Testing laying conditions");
		BlockPos posNest = pos;
		if (isLayableNest(world, posNest)) {
			TileEntity te = world.getTileEntity(pos);
			return (((BlockNest.TileEntityNest)te).getStackInSlot(0).isEmpty());
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
			return LepidodendronMod.OLOROTITAN_LOOT_YOUNG;
		}
		return LepidodendronMod.OLOROTITAN_LOOT;
	}

	@Nullable
	@Override
	public CustomTrigger getModTrigger() {
		return ModTriggers.CLICK_OLOROTITAN;
	}


	//Rendering taxidermy:
	//--------------------

}