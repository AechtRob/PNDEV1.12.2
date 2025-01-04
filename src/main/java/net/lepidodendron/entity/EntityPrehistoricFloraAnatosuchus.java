
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
import net.lepidodendron.entity.util.ITrappableLand;
import net.lepidodendron.util.CustomTrigger;
import net.lepidodendron.util.Functions;
import net.lepidodendron.util.ModTriggers;
import net.minecraft.block.BlockDirectional;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.PropertyDirection;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.*;
import net.minecraft.entity.player.EntityPlayer;
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

public class EntityPrehistoricFloraAnatosuchus extends EntityPrehistoricFloraLandBase implements ITrappableLand, IAdvancementGranter {

	public BlockPos currentTarget;
	@SideOnly(Side.CLIENT)
	public ChainBuffer tailBuffer;

	public EntityPrehistoricFloraAnatosuchus(World world) {
		super(world);
		setSize(0.3F, 0.32F);
		minWidth = 0.18F;
		maxWidth = 0.3F;
		maxHeight = 0.32F;
		maxHealthAgeable = 10.0D;
		if (FMLCommonHandler.instance().getSide().isClient()) {
			tailBuffer = new ChainBuffer();
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
		return 1; //small
	}

	public static String getPeriod() {return "Early Cretaceous";}

	//public static String getHabitat() {return "Terrestrial Archosauriform";}

	@Override
	public boolean hasNest() {
		return true;
	}

	@Override
	public int getAttackLength() {
		return 7;
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

	@Override
	public boolean placesNest() {
		return true;
	}

	@Override
	public boolean isNestMound() {
		return true;
	}
	@Override
	public int getDrinkCooldown() {
		return 600;
	}
	@Override
	public int getDrinkLength() {
		return 592;
	}

	public float getAISpeedLand() {
		float speedBase = 0.32F;
		if (this.getTicks() < 0) {
			return 0.0F; //Is laying eggs
		}
		if (this.getIsFast()) {
			speedBase = speedBase * 1.77F;
		}
		if (this.getAnimation() == DRINK_ANIMATION || this.getAnimation() == MAKE_NEST_ANIMATION || this.getAnimation() == GRAZE_ANIMATION) {
			return 0.0F;
		}
		return speedBase;
	}

	@Override
	public int getGrazeLength() {
		return 170;
	}
	@Override
	public int getGrazeCooldown() {
		return 2400;
	}

	@Override
	public int getTalkInterval() {
		return 180;
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
	public int getEatLength() {
		return 20;
	}

	@Override
	public Animation[] getAnimations() {
		return new Animation[]{ATTACK_ANIMATION, ROAR_ANIMATION, LAY_ANIMATION, MAKE_NEST_ANIMATION, EAT_ANIMATION, DRINK_ANIMATION};
	}

	protected void initEntityAI() {
		tasks.addTask(0, new EntityMateAIAgeableBase(this, 1.0D));
		tasks.addTask(1, new EntityTemptAI(this, 1, false, true, (float) this.getEntityAttribute(SharedMonsterAttributes.ATTACK_DAMAGE).getAttributeValue() * 0.33F));
		tasks.addTask(2, new LandEntitySwimmingAI(this, 0.75, true));
		tasks.addTask(3, new AttackAI(this, 1.00D, false, this.getAttackLength()));
		tasks.addTask(4, new LandWanderNestAI(this));
		tasks.addTask(5, new LandWanderAvoidWaterAI(this, 1.0D, 45));
		tasks.addTask(6, new EntityWatchClosestAI(this, EntityPlayer.class, 6.0F));
		tasks.addTask(7, new EntityWatchClosestAI(this, EntityPrehistoricFloraAgeableBase.class, 8.0F));
		tasks.addTask(8, new EntityLookIdleAI(this));
		this.targetTasks.addTask(0, new EatItemsEntityPrehistoricFloraAgeableBaseAI(this, 1));
		this.targetTasks.addTask(1, new EntityHurtByTargetSmallerThanMeAI(this, false));
		this.targetTasks.addTask(2, new HuntPlayerAlwaysAI(this, EntityPlayer.class, true, (Predicate<Entity>) entity -> entity instanceof EntityLivingBase));
		this.targetTasks.addTask(3, new HuntForDietEntityPrehistoricFloraAgeableBaseAI(this, EntityLivingBase.class, true, (Predicate<Entity>) entity -> entity instanceof EntityLivingBase, 0.1F, 1.2F, false));//		this.targetTasks.addTask(1, new HuntSmallerThanMeAIAgeable(this, EntityPrehistoricFloraAgeableFishBase.class, true, (Predicate<Entity>) entity -> entity instanceof EntityLivingBase, 0));
//		this.targetTasks.addTask(3, new HuntSmallerThanMeAIAgeable(this, EntityPrehistoricFloraAgeableBase.class, true, (Predicate<Entity>) entity -> entity instanceof EntityLivingBase, 0.2));
//		this.targetTasks.addTask(4, new HuntAI(this, EntityPlayer.class, true, (Predicate<Entity>) entity -> entity instanceof EntityLivingBase));
//		this.targetTasks.addTask(5, new HuntSmallerThanMeAIAgeable(this, EntityLivingBase.class, true, (Predicate<Entity>) entity -> entity instanceof EntityLivingBase, 0.2));
	}

	@Override
	public String[] getFoodOreDicts() {
		return ArrayUtils.addAll(DietString.MEAT);
	}

	@Override
	public int getRoarLength() {
		return 15;
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
		this.getEntityAttribute(SharedMonsterAttributes.ATTACK_DAMAGE).setBaseValue(3.5D);
		this.getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).setBaseValue(0.25D);
	}

	@Override
	public SoundEvent getAmbientSound() {
	    return (SoundEvent) SoundEvent.REGISTRY
	            .getObject(new ResourceLocation("lepidodendron:anatosuchus_idle"));
	}

	@Override
	public SoundEvent getHurtSound(DamageSource ds) {
	    return (SoundEvent) SoundEvent.REGISTRY
	            .getObject(new ResourceLocation("lepidodendron:anatosuchus_hurt"));
	}

	@Override
	public SoundEvent getDeathSound() {
	    return (SoundEvent) SoundEvent.REGISTRY
	            .getObject(new ResourceLocation("lepidodendron:anatosuchus_death"));
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
	public IEntityLivingData onInitialSpawn(DifficultyInstance difficulty, @Nullable IEntityLivingData livingdata) {
		livingdata = super.onInitialSpawn(difficulty, livingdata);
		return livingdata;
	}
	private boolean isBlockGrazable(IBlockState state) {
		return (state.getMaterial() == Material.GROUND || state.getMaterial() == Material.WATER);
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
			if (!test2 && isBlockGrazable(this.world.getBlockState(entityPos.down()))) {
				facing = EnumFacing.NORTH;
				if (Functions.getEntityCentre(this).z - Functions.getEntityBlockPos(this).getZ() <= 0.5D) {
					test2 = true;
				}
			}
			else if (!test2 && isBlockGrazable(this.world.getBlockState(entityPos.down()))) {
				facing = EnumFacing.SOUTH;
				if (Functions.getEntityCentre(this).z - Functions.getEntityBlockPos(this).getZ() >= 0.5D) {
					test2 = true;
				}
			}
			else if (!test2 && isBlockGrazable(this.world.getBlockState(entityPos.down()))) {
				facing = EnumFacing.EAST;
				if (Functions.getEntityCentre(this).z - Functions.getEntityBlockPos(this).getX() >= 0.5D) {
					test2 = true;
				}
			}
			else if (!test2 && isBlockGrazable(this.world.getBlockState(entityPos.down()))) {
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
	private boolean isDrinkable(World world, BlockPos pos, EnumFacing facing) {
		if (world.getBlockState(pos.offset(facing)).getBlock().causesSuffocation(world.getBlockState(pos.offset(facing)))) {
			return false;
		}
		if (world.getBlockState(pos.offset(facing).offset(facing)).getBlock().causesSuffocation(world.getBlockState(pos.offset(facing).offset(facing)))) {
			return false;
		}

		return true;
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
				&& !this.isReallyInWater()
				&&
				(
						(this.world.getBlockState(entityPos.north().down()).getMaterial() == Material.WATER
								&& isDrinkable(this.world, entityPos, EnumFacing.NORTH))

								|| (this.world.getBlockState(entityPos.south().down()).getMaterial() == Material.WATER
								&& isDrinkable(this.world, entityPos, EnumFacing.SOUTH))

								|| (this.world.getBlockState(entityPos.east().down()).getMaterial() == Material.WATER
								&& isDrinkable(this.world, entityPos, EnumFacing.EAST))

								|| (this.world.getBlockState(entityPos.west().down()).getMaterial() == Material.WATER
								&& isDrinkable(this.world, entityPos, EnumFacing.WEST))
				)
		);
		if (test) {
			//Which one is water?
			EnumFacing facing = null;
			if (this.world.getBlockState(entityPos.north(2).down()).getMaterial() == Material.WATER) {
				facing = EnumFacing.NORTH;
			}
			else if (this.world.getBlockState(entityPos.south(2).down()).getMaterial() == Material.WATER) {
				facing = EnumFacing.SOUTH;
			}
			else if (this.world.getBlockState(entityPos.east(2).down()).getMaterial() == Material.WATER) {
				facing = EnumFacing.EAST;
			}
			else if (this.world.getBlockState(entityPos.west(2).down()).getMaterial() == Material.WATER) {
				facing = EnumFacing.WEST;
			}
			if (facing != null) {
				this.setDrinkingFrom(entityPos.offset(facing).offset(facing));
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

		AnimationHandler.INSTANCE.updateAnimations(this);

		//System.err.println("Eating: " + this.getEatTarget() + " isFast " + this.getIsFast());

	}

	@Override
	public void onEntityUpdate() {
		super.onEntityUpdate();
	}

	public static final PropertyDirection FACING = BlockDirectional.FACING;

	public boolean testLay(World world, BlockPos pos) {
		return (
				nestBlockMatch(world, pos)
		);
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
		return LepidodendronMod.ANATOSUCHUS_LOOT;
	}

	@Nullable
	@Override
	public CustomTrigger getModTrigger() {
		return ModTriggers.CLICK_ANATOSUCHUS;
	}
	//Rendering taxidermy:
	//--------------------



}