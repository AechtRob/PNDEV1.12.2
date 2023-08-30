
package net.lepidodendron.entity;

import com.google.common.base.Predicate;
import net.ilexiconn.llibrary.client.model.tools.ChainBuffer;
import net.ilexiconn.llibrary.server.animation.AnimationHandler;
import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.block.*;
import net.lepidodendron.entity.ai.*;
import net.lepidodendron.entity.base.EntityPrehistoricFloraAgeableBase;
import net.lepidodendron.entity.base.EntityPrehistoricFloraFishBase;
import net.lepidodendron.entity.base.EntityPrehistoricFloraSwimmingAmphibianBase;
import net.lepidodendron.entity.render.entity.RenderHaldanodon;
import net.lepidodendron.entity.render.tile.RenderDisplays;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.model.ModelBase;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.EnumCreatureAttribute;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.init.SoundEvents;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.DamageSource;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import org.apache.commons.lang3.ArrayUtils;

import javax.annotation.Nullable;

public class EntityPrehistoricFloraHaldanodon extends EntityPrehistoricFloraSwimmingAmphibianBase {

	public BlockPos currentTarget;
	@SideOnly(Side.CLIENT)
	public ChainBuffer chainBuffer;

	public EntityPrehistoricFloraHaldanodon(World world) {
		super(world);
		setSize(0.4F, 0.35F);
		minWidth = 0.1F;
		maxWidth = 0.4F;
		maxHeight = 0.35F;
		maxHealthAgeable = 5.0D;
	}

	@Override
	public boolean isSmall() {
		return false;
	}

	@Override
	public String getBucketMessage() {
		return "will not go into buckets";
	}

	public static String getPeriod() {
		return "Jurassic";
	}

	//public static String getHabitat() {
	//	return "Amphibious Cynodont";
	//}

	@Override
	public boolean hasNest() {
		return true;
	}

	@Override
	public boolean breathesAir() {
		return true;
	}
	
	@Override
	public boolean dropsEggs() {
		return false;
	}

	@Override
	public boolean laysEggs() {
		return true;
	}

	public boolean hasLargeBurrow() {
		return false;
	}

	protected float getAISpeedSwimmingAmphibian() {
		float calcSpeed = 0.15F;
		if (this.isReallyInWater()) {
			calcSpeed = 0.315f;
		}
		if (this.getTicks() < 0) {
			return 0.0F; //Is laying eggs
		}
		//System.err.println("Speed " + (Math.min(1F, (this.getAgeScale() * 2F)) * calcSpeed));
		return Math.min(1F, (this.getAgeScale() * 2F)) * calcSpeed;
	}

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
	public int getAdultAge() {
		return 36000;
	}

	@Override
	public int WaterDist() {
		return 0;
	}

	@Override
	public boolean isNearWater(Entity e, BlockPos pos) {
		return true;
	}

	public AxisAlignedBB getAttackBoundingBox() {
		float size = this.getRenderSizeModifier() * 0.25F;
		return this.getEntityBoundingBox().grow(1.0F + size, 1.0F + size, 1.0F + size);
	}

	protected void initEntityAI() {
		tasks.addTask(0, new EntityMateAIAgeableBase(this, 1.0D));
		tasks.addTask(1, new EntityTemptAI(this, 1, false, true, 0));
		tasks.addTask(2, new AttackAI(this, 1.0D, false, this.getAttackLength()));
		tasks.addTask(3, new LandWanderNestAI(this));
		tasks.addTask(4, new LandWanderHerd(this, 1.00D, this.getNavigator().getPathSearchRange()*0.666F));
		tasks.addTask(5, new AmphibianWanderNotBound(this, NO_ANIMATION, 0.1, 90, 4));
		tasks.addTask(6, new EntityWatchClosestAI(this, EntityPlayer.class, 6.0F));
		tasks.addTask(7, new EntityWatchClosestAI(this, EntityPrehistoricFloraFishBase.class, 8.0F));
		tasks.addTask(8, new EntityWatchClosestAI(this, EntityPrehistoricFloraAgeableBase.class, 8.0F));
		tasks.addTask(9, new EntityLookIdleAI(this));
		this.targetTasks.addTask(0, new EatItemsEntityPrehistoricFloraAgeableBaseAI(this, 1));
		this.targetTasks.addTask(1, new EntityHurtByTargetSmallerThanMeAI(this, false));
		this.targetTasks.addTask(2, new HuntForDietEntityPrehistoricFloraAgeableBaseAI(this, EntityLivingBase.class, true, (Predicate<Entity>) entity -> entity instanceof EntityLivingBase, this.getEntityBoundingBox().getAverageEdgeLength() * 0.1F, this.getEntityBoundingBox().getAverageEdgeLength() * 1.2F, false));
//		this.targetTasks.addTask(2, new HuntAI(this, EntityPrehistoricFloraFishBase.class, true, (Predicate<Entity>) entity -> entity instanceof EntityLivingBase));
//		this.targetTasks.addTask(2, new HuntSmallerThanMeAIAgeable(this, EntityPrehistoricFloraAgeableFishBase.class, true, (Predicate<Entity>) entity -> entity instanceof EntityLivingBase, 0));
//		this.targetTasks.addTask(3, new HuntAI(this, EntitySquid.class, true, (Predicate<Entity>) entity -> entity instanceof EntityLivingBase));
	}

	@Override
	public String[] getFoodOreDicts() {
		return ArrayUtils.addAll(DietString.FISH, DietString.BUG);
	}

	

	@Override
	public boolean isAIDisabled() {
		return false;
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
		this.getEntityAttribute(SharedMonsterAttributes.ATTACK_DAMAGE).setBaseValue(2.0D);
		this.getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).setBaseValue(0.25D);
	}

	@Override
	protected boolean canTriggerWalking() {
		return true;
	}

	@Override
	public SoundEvent getAmbientSound() {
		return (SoundEvent) SoundEvent.REGISTRY
				.getObject(new ResourceLocation("lepidodendron:haldanodon_idle"));
	}

	@Override
	public SoundEvent getHurtSound(DamageSource ds) {
		return (SoundEvent) SoundEvent.REGISTRY
				.getObject(new ResourceLocation("lepidodendron:haldanodon_hurt"));
	}

	//@Override
	//public SoundEvent getHurtSound(DamageSource ds) {
	//	return (SoundEvent) SoundEvent.REGISTRY.getObject(new ResourceLocation("entity.generic.hurt"));
	//}

	@Override
	public SoundEvent getDeathSound() {
		return (SoundEvent) SoundEvent.REGISTRY
				.getObject(new ResourceLocation("lepidodendron:haldanodon_death"));
	}

	//@Override
	//public SoundEvent getDeathSound() {
	//	return (SoundEvent) SoundEvent.REGISTRY.getObject(new ResourceLocation("entity.generic.death"));
	//}

	@Override
	protected float getSoundVolume() {
		return 1.0F;
	}

	@Override
	public boolean canBreatheUnderwater() {
		return true;
	}

	@Override
	public boolean getCanSpawnHere() {
		return this.posY < (double) this.world.getSeaLevel() && this.isInWater();
	}

	public boolean isNotColliding() {
		return this.world.checkNoEntityCollision(this.getEntityBoundingBox(), this);
	}


	@Override
	public boolean isOnLadder() {
		return false;
	}

	public boolean homesToNest() {
		return true;
	}

	@Override
	public void onLivingUpdate() {

		if (this.getAnimation() == this.MAKE_NEST_ANIMATION) {
			if (this.getAnimationTick() >= this.MAKE_NEST_ANIMATION.getDuration() - 5) {
				if (!world.isRemote && this.getPosition().getY() > 8) {
					BlockPos pos = this.buildBurrow(this.world, this.getPosition(), this.hasLargeBurrow());
					this.world.setBlockState(pos, BlockNest.block.getDefaultState());
					TileEntity te = world.getTileEntity(pos);
					if (te != null) {
						te.getTileData().setString("creature", getEntityId(this));
					}
					this.setNestLocation(pos);
					SoundEvent soundevent = SoundEvents.BLOCK_GRASS_PLACE;
					this.getEntityWorld().playSound(null, this.getPosition(), soundevent, SoundCategory.BLOCKS, 1.0F, 1.0F);
				}
			}
		}

		super.onLivingUpdate();
		//this.renderYawOffset = this.rotationYaw;

		if (this.getAnimation() == ATTACK_ANIMATION && this.getAnimationTick() == 5 && this.getAttackTarget() != null) {
			launchAttack();
		}

		AnimationHandler.INSTANCE.updateAnimations(this);

	}

	@Override
	public void onEntityUpdate() {
		super.onEntityUpdate();
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
		return LepidodendronMod.HALDANODON_LOOT;
	}

	//Rendering taxidermy:
	//--------------------
	public static double offsetWall(@Nullable String variant) {
		return 0.01;
	}
	public static double upperfrontverticallinedepth(@Nullable String variant) {
		return 1.4;
	}
	public static double upperbackverticallinedepth(@Nullable String variant) {
		return 0.8;
	}
	public static double upperfrontlineoffset(@Nullable String variant) {
		return 0.4;
	}
	public static double upperfrontlineoffsetperpendiular(@Nullable String variant) {
		return -0F;
	}
	public static double upperbacklineoffset(@Nullable String variant) {
		return 0.4;
	}
	public static double upperbacklineoffsetperpendiular(@Nullable String variant) {
		return -0.15F;
	}
	public static double lowerfrontverticallinedepth(@Nullable String variant) {
		return 0.18;
	}
	public static double lowerbackverticallinedepth(@Nullable String variant) {
		return 0.15;
	}
	public static double lowerfrontlineoffset(@Nullable String variant) {
		return 0.0;
	}
	public static double lowerfrontlineoffsetperpendiular(@Nullable String variant) {
		return 0.1F;
	}
	public static double lowerbacklineoffset(@Nullable String variant) {
		return -0.0;
	}
	public static double lowerbacklineoffsetperpendiular(@Nullable String variant) {
		return -0.05F;
	}
	@SideOnly(Side.CLIENT)
	public static ResourceLocation textureDisplay(@Nullable String variant) {
		return RenderHaldanodon.TEXTURE;
	}
	@SideOnly(Side.CLIENT)
	public static ModelBase modelDisplay(@Nullable String variant) {
		return RenderDisplays.modelHaldanodon;
	}
	public static float getScaler(@Nullable String variant) {
		return RenderHaldanodon.getScaler();
	}


	public static BlockPos buildBurrow(World world, BlockPos pos, boolean large) {

		BlockPos posNest = pos;
		int i = world.rand.nextInt(4);
		BlockPos pos1 = pos.down();
		int xOffset = 1;
		int zOffset = 1;
		boolean eastwest = false;
		if (i == 0) { //North
			//default
		}
		else if (i == 1) { //South
			xOffset = -1;
			zOffset = -1;
		}
		else if (i == 2) { //East
			eastwest = true;
		}
		else if (i == 3) { //West
			eastwest = true;
			xOffset = -1;
			zOffset = -1;
		}
		int y;

		if (large) {
			if (!eastwest) {
				y = 0;
				setBurrowBlock(pos1.getY(), world, pos1);
				setBurrowBlock(pos1.getY(), world, pos1.add(1 * xOffset, y, 0));

				y = -1;
				setBurrowBlock(pos1.getY(), world, pos1.add(1 * xOffset, y, 0));
				setBurrowBlock(pos1.getY(), world, pos1.add(2 * xOffset, y, 0));
				setBurrowBlock(pos1.getY(), world, pos1.add(3 * xOffset, y, 0));
				setBurrowBlock(pos1.getY(), world, pos1.add(1 * xOffset, y, -1 * zOffset));
				setBurrowBlock(pos1.getY(), world, pos1.add(2 * xOffset, y, -1 * zOffset));
				setBurrowBlock(pos1.getY(), world, pos1.add(3 * xOffset, y, -1 * zOffset));


				y = -2;
				setBurrowBlock(pos1.getY(), world, pos1.add(2 * xOffset, y, 0));
				setBurrowBlock(pos1.getY(), world, pos1.add(3 * xOffset, y, 0));
				setBurrowBlock(pos1.getY(), world, pos1.add(2 * xOffset, y, -1 * zOffset));
				setBurrowBlock(pos1.getY(), world, pos1.add(3 * xOffset, y, -1 * zOffset));
				setBurrowBlock(pos1.getY(), world, pos1.add(2 * xOffset, y, -2 * zOffset));
				setBurrowBlock(pos1.getY(), world, pos1.add(3 * xOffset, y, -2 * zOffset));

				setBurrowBlock(pos1.getY(), world, pos1.add(0 * xOffset, y, -2));
				setBurrowBlock(pos1.getY(), world, pos1.add(1 * xOffset, y, -2));
				setBurrowBlock(pos1.getY(), world, pos1.add(2 * xOffset, y, -2));
				setBurrowBlock(pos1.getY(), world, pos1.add(3 * xOffset, y, -2));
				setBurrowBlock(pos1.getY(), world, pos1.add(0 * xOffset, y, -3 * zOffset));
				setBurrowBlock(pos1.getY(), world, pos1.add(1 * xOffset, y, -3 * zOffset));
				setBurrowBlock(pos1.getY(), world, pos1.add(2 * xOffset, y, -3 * zOffset));
				setBurrowBlock(pos1.getY(), world, pos1.add(3 * xOffset, y, -3 * zOffset));


				y = -3;
				setBurrowBlock(pos1.getY(), world, pos1.add(2 * xOffset, y, -1 * zOffset));
				setBurrowBlock(pos1.getY(), world, pos1.add(3 * xOffset, y, -1 * zOffset));
				setBurrowBlock(pos1.getY(), world, pos1.add(2 * xOffset, y, -2 * zOffset));
				setBurrowBlock(pos1.getY(), world, pos1.add(3 * xOffset, y, -2 * zOffset));
				setBurrowBlock(pos1.getY(), world, pos1.add(2 * xOffset, y, -3 * zOffset));
				setBurrowBlock(pos1.getY(), world, pos1.add(3 * xOffset, y, -3 * zOffset));

				setBurrowBlock(pos1.getY(), world, pos1.add(1 * xOffset, y, -2 * zOffset));
				setBurrowBlock(pos1.getY(), world, pos1.add(1 * xOffset, y, -3 * zOffset));

				setBurrowBlock(pos1.getY(), world, pos1.add(0 * xOffset, y, 0 * zOffset));
				setBurrowBlock(pos1.getY(), world, pos1.add(0 * xOffset, y, -1 * zOffset));
				setBurrowBlock(pos1.getY(), world, pos1.add(0 * xOffset, y, -2 * zOffset));
				setBurrowBlock(pos1.getY(), world, pos1.add(0 * xOffset, y, -3 * zOffset));

				setBurrowBlock(pos1.getY(), world, pos1.add(-1 * xOffset, y, 0 * zOffset));
				setBurrowBlock(pos1.getY(), world, pos1.add(-1 * xOffset, y, -1 * zOffset));
				setBurrowBlock(pos1.getY(), world, pos1.add(-1 * xOffset, y, -2 * zOffset));
				setBurrowBlock(pos1.getY(), world, pos1.add(-1 * xOffset, y, -3 * zOffset));

				setBurrowBlock(pos1.getY(), world, pos1.add(-2 * xOffset, y, 0 * zOffset));
				setBurrowBlock(pos1.getY(), world, pos1.add(-2 * xOffset, y, -1 * zOffset));
				setBurrowBlock(pos1.getY(), world, pos1.add(-2 * xOffset, y, -2 * zOffset));


				y = -4;
				setBurrowBlock(pos1.getY(), world, pos1.add(1 * xOffset, y, -2 * zOffset));
				setBurrowBlock(pos1.getY(), world, pos1.add(1 * xOffset, y, -3 * zOffset));

				setBurrowBlock(pos1.getY(), world, pos1.add(0 * xOffset, y, 0 * zOffset));
				setBurrowBlock(pos1.getY(), world, pos1.add(0 * xOffset, y, -1 * zOffset));
				setBurrowBlock(pos1.getY(), world, pos1.add(0 * xOffset, y, -2 * zOffset));
				setBurrowBlock(pos1.getY(), world, pos1.add(0 * xOffset, y, -3 * zOffset));

				setBurrowBlock(pos1.getY(), world, pos1.add(-1 * xOffset, y, 0 * zOffset));
				setBurrowBlock(pos1.getY(), world, pos1.add(-1 * xOffset, y, -1 * zOffset));
				setBurrowBlock(pos1.getY(), world, pos1.add(-1 * xOffset, y, -2 * zOffset));
				setBurrowBlock(pos1.getY(), world, pos1.add(-1 * xOffset, y, -3 * zOffset));

				setBurrowBlock(pos1.getY(), world, pos1.add(-2 * xOffset, y, 0 * zOffset));
				setBurrowBlock(pos1.getY(), world, pos1.add(-2 * xOffset, y, -1 * zOffset));
				setBurrowBlock(pos1.getY(), world, pos1.add(-2 * xOffset, y, -2 * zOffset));


				//Nest:
				posNest = pos1.add(-1 * xOffset, y, -1 * zOffset);
			} else { //reflected:
				y = 0;
				setBurrowBlock(pos1.getY(), world, pos1);
				setBurrowBlock(pos1.getY(), world, pos1.add(0, y, 1 * xOffset));

				y = -1;
				setBurrowBlock(pos1.getY(), world, pos1.add(0, y, 1 * xOffset));
				setBurrowBlock(pos1.getY(), world, pos1.add(0, y, 2 * xOffset));
				setBurrowBlock(pos1.getY(), world, pos1.add(0, y, 3 * xOffset));
				setBurrowBlock(pos1.getY(), world, pos1.add(-1 * xOffset, y, 1 * zOffset));
				setBurrowBlock(pos1.getY(), world, pos1.add(-1 * xOffset, y, 2 * zOffset));
				setBurrowBlock(pos1.getY(), world, pos1.add(-1 * xOffset, y, 3 * zOffset));


				y = -2;
				setBurrowBlock(pos1.getY(), world, pos1.add(0, y, 2 * xOffset));
				setBurrowBlock(pos1.getY(), world, pos1.add(0, y, 3 * xOffset));
				setBurrowBlock(pos1.getY(), world, pos1.add(-1 * xOffset, y, 2 * zOffset));
				setBurrowBlock(pos1.getY(), world, pos1.add(-1 * xOffset, y, 3 * zOffset));
				setBurrowBlock(pos1.getY(), world, pos1.add(-2 * xOffset, y, 2 * zOffset));
				setBurrowBlock(pos1.getY(), world, pos1.add(-2 * xOffset, y, 3 * zOffset));

				setBurrowBlock(pos1.getY(), world, pos1.add(-2, y, 0));
				setBurrowBlock(pos1.getY(), world, pos1.add(-2, y, 1 * xOffset));
				setBurrowBlock(pos1.getY(), world, pos1.add(-2, y, 2 * xOffset));
				setBurrowBlock(pos1.getY(), world, pos1.add(-2, y, 3 * xOffset));
				setBurrowBlock(pos1.getY(), world, pos1.add(-3 * zOffset, y, 0));
				setBurrowBlock(pos1.getY(), world, pos1.add(-3 * xOffset, y, 1 * zOffset));
				setBurrowBlock(pos1.getY(), world, pos1.add(-3 * xOffset, y, 2 * zOffset));
				setBurrowBlock(pos1.getY(), world, pos1.add(-3 * xOffset, y, 3 * zOffset));


				y = -3;
				setBurrowBlock(pos1.getY(), world, pos1.add(-1 * xOffset, y, 2 * zOffset));
				setBurrowBlock(pos1.getY(), world, pos1.add(-1 * xOffset, y, 3 * zOffset));
				setBurrowBlock(pos1.getY(), world, pos1.add(-2 * xOffset, y, 2 * zOffset));
				setBurrowBlock(pos1.getY(), world, pos1.add(-2 * xOffset, y, 3 * zOffset));
				setBurrowBlock(pos1.getY(), world, pos1.add(-3 * xOffset, y, 2 * zOffset));
				setBurrowBlock(pos1.getY(), world, pos1.add(-3 * xOffset, y, 3 * zOffset));

				setBurrowBlock(pos1.getY(), world, pos1.add(-2 * xOffset, y, 1 * zOffset));
				setBurrowBlock(pos1.getY(), world, pos1.add(-3 * xOffset, y, 1 * zOffset));

				setBurrowBlock(pos1.getY(), world, pos1.add(0 * xOffset, y, 0 * zOffset));
				setBurrowBlock(pos1.getY(), world, pos1.add(-1 * xOffset, y, 0));
				setBurrowBlock(pos1.getY(), world, pos1.add(-2 * xOffset, y, 0));
				setBurrowBlock(pos1.getY(), world, pos1.add(-3 * xOffset, y, 0));

				setBurrowBlock(pos1.getY(), world, pos1.add(0, y, -1 * zOffset));
				setBurrowBlock(pos1.getY(), world, pos1.add(-1 * xOffset, y, -1 * zOffset));
				setBurrowBlock(pos1.getY(), world, pos1.add(-2 * xOffset, y, -1 * zOffset));
				setBurrowBlock(pos1.getY(), world, pos1.add(-3 * xOffset, y, -1 * zOffset));

				setBurrowBlock(pos1.getY(), world, pos1.add(0, y, -2 * zOffset));
				setBurrowBlock(pos1.getY(), world, pos1.add(-1 * xOffset, y, -2 * zOffset));
				setBurrowBlock(pos1.getY(), world, pos1.add(-2 * xOffset, y, -2 * zOffset));


				y = -4;
				setBurrowBlock(pos1.getY(), world, pos1.add(-2 * xOffset, y, 1 * zOffset));
				setBurrowBlock(pos1.getY(), world, pos1.add(-3 * xOffset, y, 1 * zOffset));

				setBurrowBlock(pos1.getY(), world, pos1.add(0, y, 0));
				setBurrowBlock(pos1.getY(), world, pos1.add(-1 * xOffset, y, 0));
				setBurrowBlock(pos1.getY(), world, pos1.add(-2 * xOffset, y, 0));
				setBurrowBlock(pos1.getY(), world, pos1.add(-3 * xOffset, y, 0));

				setBurrowBlock(pos1.getY(), world, pos1.add(0, y, -1 * zOffset));
				setBurrowBlock(pos1.getY(), world, pos1.add(-1 * xOffset, y, -1 * zOffset));
				setBurrowBlock(pos1.getY(), world, pos1.add(-2 * xOffset, y, -1 * zOffset));
				setBurrowBlock(pos1.getY(), world, pos1.add(-3 * xOffset, y, -1 * zOffset));

				setBurrowBlock(pos1.getY(), world, pos1.add(-0 * xOffset, y, -2 * zOffset));
				setBurrowBlock(pos1.getY(), world, pos1.add(-1 * xOffset, y, -2 * zOffset));
				setBurrowBlock(pos1.getY(), world, pos1.add(-2 * xOffset, y, -2 * zOffset));

				//Nest:
				posNest = pos1.add(-1 * xOffset, y, -1 * zOffset);
			}
		}
		else { //small burrow
			if (!eastwest) {
				y = 0;
				setBurrowBlock(pos1.getY(), world, pos1);
				setBurrowBlock(pos1.getY(), world, pos1.add(-1 * xOffset, y, 0));

				y = -1;
				setBurrowBlock(pos1.getY(), world, pos1.add(-1 * xOffset, y, 0));
				setBurrowBlock(pos1.getY(), world, pos1.add(-2 * xOffset, y, 0));
				setBurrowBlock(pos1.getY(), world, pos1.add(-3 * xOffset, y, 0));
				setBurrowBlock(pos1.getY(), world, pos1.add(-3 * xOffset, y, 1 * zOffset));
				setBurrowBlock(pos1.getY(), world, pos1.add(-3 * xOffset, y, 2 * zOffset));

				y = -2;
				setBurrowBlock(pos1.getY(), world, pos1.add(-1 * xOffset, y, 1 * zOffset));
				setBurrowBlock(pos1.getY(), world, pos1.add(-2 * xOffset, y, 1 * zOffset));
				setBurrowBlock(pos1.getY(), world, pos1.add(-1 * xOffset, y, 2 * zOffset));
				setBurrowBlock(pos1.getY(), world, pos1.add(-2 * xOffset, y, 2 * zOffset));
				setBurrowBlock(pos1.getY(), world, pos1.add(-3 * xOffset, y, 2 * zOffset));


				y = -3;
				setBurrowBlock(pos1.getY(), world, pos1.add(-2 * xOffset, y, 2 * zOffset));
				setBurrowBlock(pos1.getY(), world, pos1.add(-1 * xOffset, y, 2 * zOffset));
				setBurrowBlock(pos1.getY(), world, pos1.add(0, y, 2 * zOffset));
				setBurrowBlock(pos1.getY(), world, pos1.add(-2 * xOffset, y, 1 * zOffset));
				setBurrowBlock(pos1.getY(), world, pos1.add(-1 * xOffset, y, 1 * zOffset));
				setBurrowBlock(pos1.getY(), world, pos1.add(0, y, 1 * zOffset));
				setBurrowBlock(pos1.getY(), world, pos1.add(-2 * xOffset, y, 0));
				setBurrowBlock(pos1.getY(), world, pos1.add(-1 * xOffset, y, 0));
				setBurrowBlock(pos1.getY(), world, pos1.add(0, y, 0));


				//Nest:
				posNest = pos1.add(-1 * xOffset, y, 1 * zOffset);

			}
			else {
				//Reflected:
				y = 0;
				setBurrowBlock(pos1.getY(), world, pos1);
				setBurrowBlock(pos1.getY(), world, pos1.add(0, y, -1 * xOffset));

				y = -1;
				setBurrowBlock(pos1.getY(), world, pos1.add(0, y, -1 * xOffset));
				setBurrowBlock(pos1.getY(), world, pos1.add(0, y, -2 * xOffset));
				setBurrowBlock(pos1.getY(), world, pos1.add(0, y, -3 * xOffset));
				setBurrowBlock(pos1.getY(), world, pos1.add(1 * xOffset, y, -3 * zOffset));
				setBurrowBlock(pos1.getY(), world, pos1.add(2 * xOffset, y, -3 * zOffset));

				y = -2;
				setBurrowBlock(pos1.getY(), world, pos1.add(1 * xOffset, y, -1 * zOffset));
				setBurrowBlock(pos1.getY(), world, pos1.add(1 * xOffset, y, -2 * zOffset));
				setBurrowBlock(pos1.getY(), world, pos1.add(2 * xOffset, y, -1 * zOffset));
				setBurrowBlock(pos1.getY(), world, pos1.add(2 * xOffset, y, -2 * zOffset));
				setBurrowBlock(pos1.getY(), world, pos1.add(2 * xOffset, y, -3 * zOffset));


				y = -3;
				setBurrowBlock(pos1.getY(), world, pos1.add(2 * xOffset, y, -2 * zOffset));
				setBurrowBlock(pos1.getY(), world, pos1.add(2 * xOffset, y, -1 * zOffset));
				setBurrowBlock(pos1.getY(), world, pos1.add(2 * zOffset, y, 0));
				setBurrowBlock(pos1.getY(), world, pos1.add(1 * xOffset, y, -2 * zOffset));
				setBurrowBlock(pos1.getY(), world, pos1.add(1 * xOffset, y, -1 * zOffset));
				setBurrowBlock(pos1.getY(), world, pos1.add(1 * zOffset, y, 0));
				setBurrowBlock(pos1.getY(), world, pos1.add(0, y, -2 * xOffset));
				setBurrowBlock(pos1.getY(), world, pos1.add(0, y, -1 * xOffset));
				setBurrowBlock(pos1.getY(), world, pos1.add(0, y, 0));


				//Nest:
				posNest = pos1.add(1 * xOffset, y, -1 * zOffset);

			}
		}

		int x;
		y = posNest.getY();
		int z;
		while (y < pos.getY()) { //up to the surface:
			x = -5;
			while (x <= 5) {
				z = -5;
				while (z <= 5) {
					BlockPos pos2 = new BlockPos(posNest.getX() + x, y, posNest.getZ() + z);
					if (world.getBlockState(pos2).getBlock() == Blocks.STRUCTURE_VOID) {
						world.setBlockToAir(pos2);
					}
					z ++;
				}
				x ++;
			}
			y ++;
		}

		return posNest;
	}

	public static void setBurrowBlock(int blockTop, World world, BlockPos pos) {
		if (pos.getY() <= 1) {
			return;
		}
		world.setBlockState(pos, Blocks.STRUCTURE_VOID.getDefaultState());
		world.setBlockState(pos.north(), newBurrowState(world, pos.north()));
		world.setBlockState(pos.south(), newBurrowState(world, pos.south()));
		world.setBlockState(pos.east(), newBurrowState(world, pos.east()));
		world.setBlockState(pos.west(), newBurrowState(world, pos.west()));
		if (pos.getY() > 1) {
			world.setBlockState(pos.down(), newBurrowState(world, pos.down()));
		}
		if (pos.getY() < blockTop) {
			world.setBlockState(pos.up(), newBurrowState(world, pos.up()));
		}
	}

	public static IBlockState newBurrowState(World world, BlockPos pos) {
		IBlockState oldBurrowState = world.getBlockState(pos);
		if (oldBurrowState.getBlock() == Blocks.STRUCTURE_VOID) {
			return Blocks.STRUCTURE_VOID.getDefaultState();
		}
		if (oldBurrowState == Blocks.SAND.getStateFromMeta(0) || oldBurrowState == BlockSandWavy.block) {
			return BlockSandSticky.block.getDefaultState();
		}
		else if (oldBurrowState == Blocks.SAND.getStateFromMeta(1) || oldBurrowState == BlockSandRedWavy.block) {
			return BlockSandRedSticky.block.getDefaultState();
		}
		else if (oldBurrowState == Blocks.GRAVEL || oldBurrowState == BlockGravelWavy.block) {
			return BlockGravelSticky.block.getDefaultState();
		}
		else if (oldBurrowState == BlockSandPangaean.block.getDefaultState() || oldBurrowState == BlockSandPangaeanWavy.block) {
			return BlockSandPangaeanSticky.block.getDefaultState();
		}
		else if (oldBurrowState == BlockSandBlack.block.getDefaultState() || oldBurrowState == BlockSandBlackWavy.block) {
			return BlockSandBlackSticky.block.getDefaultState();
		}
		else if (oldBurrowState == BlockSandWhite.block.getDefaultState() || oldBurrowState == BlockSandWhiteWavy.block) {
			return BlockSandWhiteSticky.block.getDefaultState();
		}
		else if (oldBurrowState == BlockSandPaleoproterozoic.block.getDefaultState() || oldBurrowState == BlockSandPaleoproterozoicWavy.block) {
			return BlockSandPaleoproterozoicSticky.block.getDefaultState();
		}
		else if (world.isAirBlock(pos) ||
				(oldBurrowState.getMaterial() != Material.ROCK
						&& oldBurrowState.getMaterial() != Material.GROUND
						&& oldBurrowState.getMaterial() != Material.CLAY)
		) {
			if (world.getBiome(pos).topBlock == Blocks.SAND.getStateFromMeta(0) || world.getBiome(pos).topBlock == BlockSandWavy.block) {
				return BlockSandSticky.block.getDefaultState();
			}
			else if (world.getBiome(pos).topBlock == Blocks.SAND.getStateFromMeta(1) || world.getBiome(pos).topBlock == BlockSandRedWavy.block) {
				return BlockSandRedSticky.block.getDefaultState();
			}
			else if (world.getBiome(pos).topBlock == Blocks.GRAVEL || world.getBiome(pos).topBlock == BlockGravelWavy.block) {
				return BlockGravelSticky.block.getDefaultState();
			}
			else if (world.getBiome(pos).topBlock == BlockSandPangaean.block.getDefaultState() || world.getBiome(pos).topBlock == BlockSandPangaeanWavy.block) {
				return BlockSandPangaeanSticky.block.getDefaultState();
			}
			else if (world.getBiome(pos).topBlock == BlockSandBlack.block.getDefaultState() || world.getBiome(pos).topBlock == BlockSandBlackWavy.block) {
				return BlockSandBlackSticky.block.getDefaultState();
			}
			else if (world.getBiome(pos).topBlock == BlockSandWhite.block.getDefaultState() || world.getBiome(pos).topBlock == BlockSandWhiteWavy.block) {
				return BlockSandWhiteSticky.block.getDefaultState();
			}
			else if (world.getBiome(pos).topBlock == BlockSandPaleoproterozoic.block.getDefaultState() || world.getBiome(pos).topBlock == BlockSandPaleoproterozoicWavy.block) {
				return BlockSandPaleoproterozoicSticky.block.getDefaultState();
			}
			return world.getBiome(pos).topBlock;
		}
		return oldBurrowState;
	}
}