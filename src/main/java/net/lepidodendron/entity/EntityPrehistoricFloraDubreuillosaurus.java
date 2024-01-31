
package net.lepidodendron.entity;

import com.google.common.base.Predicate;
import net.ilexiconn.llibrary.client.model.tools.ChainBuffer;
import net.ilexiconn.llibrary.server.animation.AnimationHandler;
import net.lepidodendron.LepidodendronConfig;
import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.block.BlockNest;
import net.lepidodendron.block.base.IAdvancementGranter;
import net.lepidodendron.entity.ai.*;
import net.lepidodendron.entity.base.EntityPrehistoricFloraAgeableFishBase;
import net.lepidodendron.entity.base.EntityPrehistoricFloraFishBase;
import net.lepidodendron.entity.base.EntityPrehistoricFloraLandWadingBase;
import net.lepidodendron.entity.render.entity.RenderDubreuillosaurus;
import net.lepidodendron.entity.render.tile.RenderDisplays;
import net.lepidodendron.util.CustomTrigger;
import net.lepidodendron.util.Functions;
import net.lepidodendron.util.ModTriggers;
import net.minecraft.block.BlockDirectional;
import net.minecraft.block.material.EnumPushReaction;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.PropertyDirection;
import net.minecraft.client.model.ModelBase;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.EnumCreatureAttribute;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.*;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;
import net.minecraft.world.WorldServer;
import net.minecraftforge.fml.common.FMLCommonHandler;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import org.apache.commons.lang3.ArrayUtils;

import javax.annotation.Nullable;

public class EntityPrehistoricFloraDubreuillosaurus extends EntityPrehistoricFloraLandWadingBase implements IAdvancementGranter {

	public BlockPos currentTarget;
	@SideOnly(Side.CLIENT)
	public ChainBuffer tailBuffer;

	public EntityPrehistoricFloraDubreuillosaurus(World world) {
		super(world);
		setSize(0.95F, 1.85F);
		minWidth = 0.20F;
		maxWidth = 0.95F;
		maxHeight = 1.85F;
		maxHealthAgeable = 63.0D;
		if (FMLCommonHandler.instance().getSide().isClient()) {
			tailBuffer = new ChainBuffer();
		}
	}

	@Override
	public EnumPushReaction getPushReaction() {
		if (this.getAnimation() == DRINK_ANIMATION) {
			return EnumPushReaction.IGNORE;
		}
		return super.getPushReaction();
	}

	@Override
	public void onEntityUpdate() {
		super.onEntityUpdate();
		if (this.getAnimation() == DRINK_ANIMATION) {
			if (this.getAnimationTick() == 445) {
				if (this.world instanceof WorldServer) {
					Vec3d eventpos = new Vec3d(this.getDrinkingFrom().getX() + 0.5, this.getDrinkingFrom().getY(), this.getDrinkingFrom().getZ() + 0.5);
					for (int j = 0; (float) j < 200F; ++j) {
						float f5 = (this.rand.nextFloat() * 2.0F - 1.0F) * 0.5F;
						float f6 = (this.rand.nextFloat() * 2.0F - 1.0F) * 0.5F;
						((WorldServer) this.world).spawnParticle(EnumParticleTypes.WATER_SPLASH, eventpos.x + f5, eventpos.y, eventpos.z + f6, (int) 1, 0, 0, 0, 0.2, new int[0]);
					}
				}
				this.playSound(this.getSplashSound(), 1.0F, 1.0F + (this.rand.nextFloat() - this.rand.nextFloat()) * 0.4F);
			}
		}
	}

	@Override
	public int getDrinkLength() {
		return 551;
	}

	@Override
	public int getDrinkCooldown() {
		return 3200;
	}

	private boolean isDrinkable(World world, BlockPos pos, EnumFacing facing) {
		if (world.getBlockState(pos.offset(facing)).getBlock().causesSuffocation(world.getBlockState(pos.offset(facing)))) {
			return false;
		}
		if (world.getBlockState(pos.offset(facing).up()).getBlock().causesSuffocation(world.getBlockState(pos.offset(facing).up()))) {
			return false;
		}
		if (world.getBlockState(pos.offset(facing).up(2)).getBlock().causesSuffocation(world.getBlockState(pos.offset(facing).up(2)))) {
			return false;
		}

		if (world.getBlockState(pos.offset(facing).offset(facing)).getBlock().causesSuffocation(world.getBlockState(pos.offset(facing).offset(facing)))) {
			return false;
		}
		if (world.getBlockState(pos.offset(facing).offset(facing).up()).getBlock().causesSuffocation(world.getBlockState(pos.offset(facing).offset(facing).up()))) {
			return false;
		}
		if (world.getBlockState(pos.offset(facing).offset(facing).up(2)).getBlock().causesSuffocation(world.getBlockState(pos.offset(facing).offset(facing).up(2)))) {
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

		BlockPos entityPos = Functions.getEntityBlockPos(this).up();

		boolean test = (this.getPFDrinking() <= 0
				&& !world.isRemote
				&& !this.getIsFast()
				//&& !this.getIsMoving()
				&& this.DRINK_ANIMATION.getDuration() > 0
				&& this.getAnimation() == NO_ANIMATION
				&& this.onGround
				&& this.isReallyInWater()
				&& this.isBlockWadable(this.world, entityPos.down(), this)
				&&
				(
						(this.world.getBlockState(entityPos.north(2).down()).getMaterial() == Material.WATER
								&& isDrinkable(this.world, entityPos, EnumFacing.NORTH))

								|| (this.world.getBlockState(entityPos.south(2).down()).getMaterial() == Material.WATER
								&& isDrinkable(this.world, entityPos, EnumFacing.SOUTH))

								|| (this.world.getBlockState(entityPos.east(2).down()).getMaterial() == Material.WATER
								&& isDrinkable(this.world, entityPos, EnumFacing.EAST))

								|| (this.world.getBlockState(entityPos.west(2).down()).getMaterial() == Material.WATER
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
				this.setDrinkingFrom(entityPos.offset(facing, 2));
				this.faceBlock(this.getDrinkingFrom(), 10F, 10F);
			}
		}
		return test;
	}


	@Override
	public int wadeDepth() {
		return 1;
	}

	@Override
	public int getWalkCycleLength() {
		return 50;
	}

	@Override
	public int getFootstepOffset() {
		return 25;
	}

	@Override
	public int getRunCycleLength() {
		return 20;
	}

	@Override
	public int getRunFootstepOffset() {
		return 0;
	}

	@Override
	public void onUpdate() {
		super.onUpdate();
		if (world.isRemote && !this.isAIDisabled()) {
			tailBuffer.calculateChainSwingBuffer(120, 10, 5F, this);
		}
	}

//	@Override
//	public int getEatTick() {return 12;}

	@Override
	public int getEggType(@Nullable String variantIn) {
		return 2; //large
	}

	public static String getPeriod() {return "Jurassic";}

	@Override
	public int getEatLength() {
		return 40;
	}

	@Override
	public int getRoarLength() { return 40; } //Warn/threat


	@Override
	public boolean hasNest() {
		return true;
	}

	@Override
	public int getAttackLength() {
		return 30;
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
		float speedBase = 0.425F;
		if (this.getTicks() < 0) {
			return 0.0F; //Is laying eggs
		}
		if (this.getAnimation() == DRINK_ANIMATION || this.getAnimation() == MAKE_NEST_ANIMATION) {
			return 0.0F;
		}
		if (this.getIsFast()) {
			speedBase = speedBase * 1.67F;

		}
		return speedBase;
	}

	@Override
	public int getTalkInterval() {
		return 360;
	}

	@Override
	public int getAdultAge() {
		return 128000;
	}

	public AxisAlignedBB getAttackBoundingBox() {
		float size = this.getRenderSizeModifier() * 1.50F * this.getAgeScale();
		return this.getEntityBoundingBox().grow(0.5F + size, 0.2F, 0.5F + size);
	}

	@Override
	@SideOnly(Side.CLIENT)
	public AxisAlignedBB getRenderBoundingBox() {
		if (LepidodendronConfig.renderBigMobsProperly && (this.maxWidth * this.getAgeScale()) > 1F) {
			return this.getEntityBoundingBox().grow(3.0, 1.00, 3.0);
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

	protected void initEntityAI() {
		tasks.addTask(0, new EntityMateAIAgeableBase(this, 1.0D));
		tasks.addTask(1, new EntityTemptAI(this, 1, false, true, (float) this.getEntityAttribute(SharedMonsterAttributes.ATTACK_DAMAGE).getAttributeValue() * 0.33F));
		//tasks.addTask(2, new LandEntitySwimmingAI(this, 0.75, false));
		//tasks.addTask(2, new AgeableWarnEntity(this, EntityPlayer.class, 4));
		tasks.addTask(2, new AttackAI(this, 1.0D, false, this.getAttackLength()));
		tasks.addTask(3, new LandWanderNestAI(this));
		tasks.addTask(4, new LandWanderFollowParent(this, 1.05D));
		tasks.addTask(5, new LandWanderWader(this, NO_ANIMATION, 0.8D, 30));
		tasks.addTask(6, new EntityWatchClosestAI(this, EntityPrehistoricFloraFishBase.class, 6.0F));
		tasks.addTask(7, new EntityWatchClosestAI(this, EntityPrehistoricFloraAgeableFishBase.class, 8.0F));
		tasks.addTask(8, new EntityWatchClosestAI(this, EntityPlayer.class, 8.0F));
		tasks.addTask(9, new EntityWatchClosestAI(this, EntityLivingBase.class, 8.0F));
		tasks.addTask(10, new EntityLookIdleAI(this));
		this.targetTasks.addTask(0, new EatItemsEntityPrehistoricFloraAgeableBaseAI(this, 1));
		this.targetTasks.addTask(1, new EntityHurtByTargetSmallerThanMeAI(this, false));
		this.targetTasks.addTask(2, new HuntPlayerAlwaysAI(this, EntityPlayer.class, true, (Predicate<Entity>) entity -> entity instanceof EntityLivingBase));
		this.targetTasks.addTask(3, new HuntForDietEntityPrehistoricFloraAgeableBaseAI(this, EntityLivingBase.class, false, (Predicate<Entity>) entity -> entity instanceof EntityLivingBase, 0.1F, 1.2F, false));
//		this.targetTasks.addTask(3, new HuntAI(this, EntityPlayer.class, true, (Predicate<Entity>) entity -> entity instanceof EntityLivingBase));
//		this.targetTasks.addTask(4, new HuntSmallerThanMeAIAgeable(this, EntityLivingBase.class, true, (Predicate<Entity>) entity -> entity instanceof EntityLivingBase, 0.2));
	}

	@Override
	public String[] getFoodOreDicts() {
		return ArrayUtils.addAll(DietString.FISH);
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
		this.getEntityAttribute(SharedMonsterAttributes.ATTACK_DAMAGE).setBaseValue(12.0D);
		this.getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).setBaseValue(0.25D);
		this.getEntityAttribute(SharedMonsterAttributes.KNOCKBACK_RESISTANCE).setBaseValue(0.8D);
	}

	@Override
	public SoundEvent getAmbientSound() {
		return (SoundEvent) SoundEvent.REGISTRY
				.getObject(new ResourceLocation("lepidodendron:dubreuillosaurus_idle"));
	}

	@Override
	public SoundEvent getHurtSound(DamageSource ds) {
	    return (SoundEvent) SoundEvent.REGISTRY
	            .getObject(new ResourceLocation("lepidodendron:dubreuillosaurus_hurt"));
	}

	@Override
	public SoundEvent getDeathSound() {
	    return (SoundEvent) SoundEvent.REGISTRY
	            .getObject(new ResourceLocation("lepidodendron:dubreuillosaurus_death"));
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
		//this.renderYawOffset = this.rotationYaw;

		if (this.getAnimation() == ATTACK_ANIMATION && this.getAttackTarget() != null) {
			if (this.getAnimationTick() == 18) {
				double d1 = this.posX - this.getAttackTarget().posX;
				double d0;
				for (d0 = this.posZ -  this.getAttackTarget().posZ; d1 * d1 + d0 * d0 < 1.0E-4D; d0 = (Math.random() - Math.random()) * 0.01D)
				{
					d1 = (Math.random() - Math.random()) * 0.01D;
				}
				this.getAttackTarget().knockBack(this, 0.15F, d1, d0);
				this.getAttackTarget().addVelocity(0, 0.115, 0);
				launchAttack();
			}
		}

		AnimationHandler.INSTANCE.updateAnimations(this);

		//System.err.println("Eating: " + this.getEatTarget() + " isFast " + this.getIsFast());

	}

	public static final PropertyDirection FACING = BlockDirectional.FACING;

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
			return LepidodendronMod.DUBREUILLOSAURUS_LOOT_YOUNG;
		}
		return LepidodendronMod.DUBREUILLOSAURUS_LOOT;
	}

	//Rendering taxidermy:
	//--------------------


	@Nullable
	@Override
	public CustomTrigger getModTrigger() {
		return ModTriggers.CLICK_DUBREUILLOSAURUS;
	}
	//Rendering taxidermy:
	//--------------------
	public static double offsetWall(@Nullable String variant) {
		return -0.45;
	}
	public static double upperfrontverticallinedepth(@Nullable String variant) {
		return 0.0;
	}
	public static double upperbackverticallinedepth(@Nullable String variant) {
		return 0.0;
	}
	public static double upperfrontlineoffset(@Nullable String variant) {
		return 0.0;
	}
	public static double upperfrontlineoffsetperpendiular(@Nullable String variant) {
		return 0.0;
	}
	public static double upperbacklineoffset(@Nullable String variant) {
		return 0.0;
	}
	public static double upperbacklineoffsetperpendiular(@Nullable String variant) {
		return 0.0;
	}
	public static double lowerfrontverticallinedepth(@Nullable String variant) {
		return 0.0;
	}
	public static double lowerbackverticallinedepth(@Nullable String variant) {
		return 0.0;
	}
	public static double lowerfrontlineoffset(@Nullable String variant) {
		return 0.4;
	}
	public static double lowerfrontlineoffsetperpendiular(@Nullable String variant) {
		return -0.3;
	}
	public static double lowerbacklineoffset(@Nullable String variant) {
		return 0;
	}
	public static double lowerbacklineoffsetperpendiular(@Nullable String variant) {
		return 0.1;
	}
	@SideOnly(Side.CLIENT)
	public static ResourceLocation textureDisplay(@Nullable String variant) {
		return RenderDubreuillosaurus.TEXTURE;
	}
	@SideOnly(Side.CLIENT)
	public static ModelBase modelDisplay(@Nullable String variant) {
		return RenderDisplays.modelDubreuillosaurus;
	}
	public static float getScaler(@Nullable String variant) {
		return RenderDubreuillosaurus.getScaler();
	}

}
