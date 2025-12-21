
package net.lepidodendron.entity;

import net.ilexiconn.llibrary.client.model.tools.ChainBuffer;
import net.ilexiconn.llibrary.server.animation.Animation;
import net.ilexiconn.llibrary.server.animation.AnimationHandler;
import net.lepidodendron.LepidodendronConfig;
import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.block.base.IAdvancementGranter;
import net.lepidodendron.entity.ai.*;
import net.lepidodendron.entity.base.EntityPrehistoricFloraAgeableBase;
import net.lepidodendron.entity.base.EntityPrehistoricFloraLandWadingBase;
import net.lepidodendron.entity.render.entity.RenderSpinophorosaurus;
import net.lepidodendron.entity.render.tile.RenderDisplays;
import net.lepidodendron.entity.util.ITrappableLand;
import net.lepidodendron.util.CustomTrigger;
import net.lepidodendron.util.Functions;
import net.lepidodendron.util.ModTriggers;
import net.minecraft.block.BlockDirectional;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.PropertyDirection;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.model.ModelBase;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EnumCreatureAttribute;
import net.minecraft.entity.IEntityLivingData;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.EntityAIHurtByTarget;
import net.minecraft.entity.ai.attributes.IAttributeInstance;
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
import net.minecraft.world.DifficultyInstance;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.FMLCommonHandler;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import org.apache.commons.lang3.ArrayUtils;

import javax.annotation.Nullable;

public class EntityPrehistoricFloraSpinophorosaurus extends EntityPrehistoricFloraLandWadingBase implements IAdvancementGranter, ITrappableLand {

	public BlockPos currentTarget;

	@SideOnly(Side.CLIENT)
	public ChainBuffer tailBuffer;
	public Animation TAIL_ANIMATION;
	private int standCooldown;
	public int ambientSoundTime;
	public Animation NOISE_ANIMATION;

	public EntityPrehistoricFloraSpinophorosaurus(World world) {
		super(world);
		setSize(2.95F, 4.5F);
		extraStepHeight = 1F;
		minWidth = 0.1F;
		maxWidth = 2.95F;
		maxHeight = 4.5F;
		maxHealthAgeable = 100.0D;
		TAIL_ANIMATION = Animation.create(210);
		if (FMLCommonHandler.instance().getSide().isClient()) {
			tailBuffer = new ChainBuffer();
		}
		NOISE_ANIMATION = Animation.create(50);
		setgetMaxTurnDistancePerTick(7.5F);
	}

	@Override
	public float getSwimHeight() {
		return this.height * 0.20F;
	}

	@Override
	public float getgetMaxTurnDistancePerTick() {
		if ((!this.getIsFast()) && (!this.getLaying()) && (!this.isInLove())) {
			return 1.0F + (19F - (19F * this.getAgeScale()));
		}
		return super.getgetMaxTurnDistancePerTick();
	}

	@Override
	protected float getJumpUpwardsMotion() {
		if (this.isInWater()) {
			return super.getJumpUpwardsMotion() * 1.5F;
		}
		if (this.isReallyInWater()) {
			return super.getJumpUpwardsMotion() * 1.25F;
		}
		if (this.isPFAdult()) {
			return 0.6F;
		}
		return super.getJumpUpwardsMotion();
	}

	@Override
	public int getWalkCycleLength() {
		return 35;
	}

	@Override
	public int getFootstepOffset() {
		return 10;
	}

	@Override
	public int tetrapodWalkFootstepOffset() {
		return 15;
	}

	@Override
	public int getRunCycleLength() {
		return 21;
	}

	@Override
	public int getRunFootstepOffset() {
		return 0;
	}

	@Override
	public int tetrapodRunFootstepOffset() {
		return 5;
	}

	@Override
	public int getGrazeLength() {
		return 290;
	}

	@Override
	protected void entityInit() {
		super.entityInit();
		this.setScaleForAge(false);
	}

	@Override
	public Animation[] getAnimations() {
		return new Animation[]{GRAZE_ANIMATION, HURT_ANIMATION, ATTACK_ANIMATION, NOISE_ANIMATION, DRINK_ANIMATION, ROAR_ANIMATION, MAKE_NEST_ANIMATION, LAY_ANIMATION, EAT_ANIMATION};
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
		return 1; //medium
	}

	public static String getPeriod() {return "Jurassic";}

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
		return 86;
	}

	@Override
	public int getEatLength() {
		return 80;
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
		float speedBase = 0.5F;
		if (this.getTicks() < 0) {
			return 0.0F; //Is laying eggs
		}
		if (this.getAnimation() == DRINK_ANIMATION || this.getAnimation() == MAKE_NEST_ANIMATION
			|| this.getAnimation() == ATTACK_ANIMATION || this.getAnimation() == EAT_ANIMATION
			|| this.getAnimation() == GRAZE_ANIMATION
				|| this.getAnimation() == TAIL_ANIMATION
		) {
			return 0.0F;
		}
		if (this.getIsFast()) {
			speedBase = speedBase * 1.66F;
		}
		return speedBase;
	}

	@Override
	public int getAdultAge() {
		return 128000;
	}

	public AxisAlignedBB getAttackBoundingBox() {
		float size = this.getRenderSizeModifier() * getAgeScale() * 1F;
		return this.getEntityBoundingBox().grow(1.0F + size, 1.0F + size, 1.0F + size);
	}

	public AxisAlignedBB getAttackBoundingBoxForDamage() {
		float size = this.getRenderSizeModifier() * getAgeScale() * 2F;
		return this.getEntityBoundingBox().grow(1.0F + size, 1.0F + size, 1.0F + size);
	}

	@Override
	public float getEyeHeight()
	{
		return Math.max(super.getEyeHeight(), this.height * 0.975F);
	}

	protected void initEntityAI() {
		tasks.addTask(0, new EntityMateAIAgeableBase(this, 1.0D));
		tasks.addTask(1, new EntityTemptAI(this, 1, false, true, 0));
		tasks.addTask(2, new LandEntitySwimmingAI(this, 0.75, false));
		tasks.addTask(3, new AttackAI(this, 1.0D, false, this.getAttackLength()));
		tasks.addTask(4, new AvoidEntityForSpaceReasonsPN(this));
		tasks.addTask(5, new LandWanderNestAI(this));
		tasks.addTask(6, new LandWanderFollowParent(this, 1.05D));
		tasks.addTask(7, new LandWanderHerd(this, 1.00D, Math.max(6, this.width) * this.getNavigator().getPathSearchRange() * 0.75F));
		tasks.addTask(8, new LandWanderAvoidDeepWaterAI(this, 0.7D, 120));
		tasks.addTask(9, new EntityWatchClosestAI(this, EntityPlayer.class, 6.0F));
		tasks.addTask(10, new EntityWatchClosestAI(this, EntityPrehistoricFloraAgeableBase.class, 8.0F, false, false));
		tasks.addTask(11, new EntityLookIdleAI(this, true));
		this.targetTasks.addTask(0, new EatItemsEntityPrehistoricFloraAgeableBaseAI(this, 1));
		this.targetTasks.addTask(1, new EntityAIHurtByTarget(this, false));
		//this.targetTasks.addTask(1, new HuntAI(this, EntityPrehistoricFloraLandClimbingBase.class, true, (Predicate<Entity>) entity -> entity instanceof EntityLivingBase));
		//this.targetTasks.addTask(2, new HuntAI(this, EntityPrehistoricInsectFlyingBase.class, true, (Predicate<Entity>) entity -> entity instanceof EntityLivingBase));
	}

	@Override
	public String[] getFoodOreDicts() {
		return ArrayUtils.addAll(DietString.PLANTS);
	}
	
	@Override
	public EnumCreatureAttribute getCreatureAttribute() {
		return EnumCreatureAttribute.UNDEFINED;
	}

	//TODO override to allow targeting water for drinking, currently targets grass
	@Override
	public boolean drinksWater() {
		return true;
	}

	@Override
	public int getDrinkLength() {
		return 258;
	}

	@Override
	public int getDrinkCooldown() {
		return 800;
	}

	private boolean isDrinkable(World world, BlockPos pos, EnumFacing facing) {
		int x = 4;
		int y = 4;
		for (int xx = 0; xx < x; xx++) {
			for (int yy = 0; yy < y; yy++) {
				if (world.getBlockState(pos.offset(facing, xx).up(yy)).getBlock().causesSuffocation(world.getBlockState(pos.offset(facing, xx).up(yy)))) {
					return false;
				}
			}
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
			&& this.onGround
			&& !this.isReallyInWater()
			&&
			(
				(this.world.getBlockState(entityPos.north(8).down()).getMaterial() == Material.WATER
				&& isDrinkable(this.world, entityPos, EnumFacing.NORTH))

				|| (this.world.getBlockState(entityPos.south(8).down()).getMaterial() == Material.WATER
				&& isDrinkable(this.world, entityPos, EnumFacing.SOUTH))

				|| (this.world.getBlockState(entityPos.east(8).down()).getMaterial() == Material.WATER
				&& isDrinkable(this.world, entityPos, EnumFacing.EAST))

				|| (this.world.getBlockState(entityPos.west(8).down()).getMaterial() == Material.WATER
				&& isDrinkable(this.world, entityPos, EnumFacing.WEST))
			)
		);
		if (test) {
			//Which one is water?
			EnumFacing facing = null;
			if (this.world.getBlockState(entityPos.north(8).down()).getMaterial() == Material.WATER) {
				facing = EnumFacing.NORTH;
			}
			else if (this.world.getBlockState(entityPos.south(8).down()).getMaterial() == Material.WATER) {
				facing = EnumFacing.SOUTH;
			}
			else if (this.world.getBlockState(entityPos.east(8).down()).getMaterial() == Material.WATER) {
				facing = EnumFacing.EAST;
			}
			else if (this.world.getBlockState(entityPos.west(8).down()).getMaterial() == Material.WATER) {
				facing = EnumFacing.WEST;
			}
			if (facing != null) {
				this.setDrinkingFrom(entityPos.offset(facing, 8));
				this.faceBlock(this.getDrinkingFrom(), 10F, 10F);
			}
		}
		return test;
	}

	private boolean isBlockGrazable(IBlockState state) {
		return (state.getMaterial() == Material.LEAVES || state.getMaterial() == Material.PLANTS);
	}

	private boolean isGrazable(World world, BlockPos pos, EnumFacing facing) {
		int x = 5;
		int y = 12;
		for (int xx = 0; xx < x; xx++) {
			for (int yy = 0; yy < y; yy++) {
				if (world.getBlockState(pos.offset(facing, xx).up(yy)).getBlock().causesSuffocation(world.getBlockState(pos.offset(facing, xx).up(yy)))) {
					return false;
				}
			}
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
					(isBlockGrazable(this.world.getBlockState(entityPos.north(5).up(12)))
						&& isGrazable(this.world, entityPos, EnumFacing.NORTH))

						|| (isBlockGrazable(this.world.getBlockState(entityPos.south(5).up(12)))
						&& isGrazable(this.world, entityPos, EnumFacing.SOUTH))

						|| (isBlockGrazable(this.world.getBlockState(entityPos.east(5).up(12)))
						&& isGrazable(this.world, entityPos, EnumFacing.EAST))

						|| (isBlockGrazable(this.world.getBlockState(entityPos.west(5).up(12)))
						&& isGrazable(this.world, entityPos, EnumFacing.WEST))
				)
		);
		if (test) {
			//Which one is grazable?
			EnumFacing facing = null;
			if (!test2 && isBlockGrazable(this.world.getBlockState(entityPos.north(5).up(12)))) {
				facing = EnumFacing.NORTH;
				if (Functions.getEntityCentre(this).z - Functions.getEntityBlockPos(this).getZ() <= 0.5D) {
					test2 = true;
				}
			}
			else if (!test2 && isBlockGrazable(this.world.getBlockState(entityPos.south(5).up(12)))) {
				facing = EnumFacing.SOUTH;
				if (Functions.getEntityCentre(this).z - Functions.getEntityBlockPos(this).getZ() >= 0.5D) {
					test2 = true;
				}
			}
			else if (!test2 && isBlockGrazable(this.world.getBlockState(entityPos.east(5).up(12)))) {
				facing = EnumFacing.EAST;
				if (Functions.getEntityCentre(this).z - Functions.getEntityBlockPos(this).getX() >= 0.5D) {
					test2 = true;
				}
			}
			else if (!test2 && isBlockGrazable(this.world.getBlockState(entityPos.west(5).up(12)))) {
				facing = EnumFacing.WEST;
				if (Functions.getEntityCentre(this).z - Functions.getEntityBlockPos(this).getX() <= 0.5D) {
					test2 = true;
				}
			}
			if (facing != null && test && test2) {
				this.setGrazingFrom(entityPos.up(12).offset(facing, 5));
				this.faceBlock(this.getGrazingFrom(), 10F, 10F);
			}
		}
		return test && test2;
	}

	@Override
	protected boolean canDespawn() {
		return false;
	}

	@Override
	protected void applyEntityAttributes() {
		super.applyEntityAttributes();
		this.getAttributeMap().registerAttribute(SharedMonsterAttributes.ATTACK_DAMAGE);
		this.getEntityAttribute(SharedMonsterAttributes.ATTACK_DAMAGE).setBaseValue(16.0D);
		this.getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).setBaseValue(0.25D);
		this.getEntityAttribute(SharedMonsterAttributes.KNOCKBACK_RESISTANCE).setBaseValue(0.8D);
	}

	@Override
	public int getTalkInterval() {
		return 1000;
	}

	public int getAmbientTalkInterval() {
		return 300;
	}

	@Override
	public SoundEvent getAmbientSound() {
	    return (SoundEvent) SoundEvent.REGISTRY
	            .getObject(new ResourceLocation("lepidodendron:spinophorosaurus_idle"));
	}

	public SoundEvent getAmbientAmbientSound() {
		return (SoundEvent) SoundEvent.REGISTRY
				.getObject(new ResourceLocation("lepidodendron:spinophorosaurus_idle"));
	}

	@Override
	public SoundEvent getHurtSound(DamageSource ds) {
	    return (SoundEvent) SoundEvent.REGISTRY
	            .getObject(new ResourceLocation("lepidodendron:spinophorosaurus_hurt"));
	}

	@Override
	public SoundEvent getDeathSound() {
	    return (SoundEvent) SoundEvent.REGISTRY
	            .getObject(new ResourceLocation("lepidodendron:spinophorosaurus_death"));
	}

	@Override
	protected float getSoundVolume() {
		return 1.0F + (2.0F * this.getAgeScale());
	}

	@Override
	public boolean getCanSpawnHere() {
		return this.posY < (double) this.world.getSeaLevel() && this.isInWater();
	}

	@Override
	public void onLivingUpdate() {
		super.onLivingUpdate();

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

		if (this.getAnimation() == ATTACK_ANIMATION && this.getAnimationTick() == 16 && this.getAttackTarget() != null) {
			launchAttack();
		}

		if (this.standCooldown > 0) {
			this.standCooldown -= rand.nextInt(3) + 1;
		}
		if (this.standCooldown < 0) {
			this.standCooldown = 0;
		}
		AnimationHandler.INSTANCE.updateAnimations(this);

	}

	@Override
	public void launchAttack() {
		if (this.getAttackTarget() != null) {
			if (this.getAttackBoundingBoxForDamage().intersects(this.getAttackTarget().getEntityBoundingBox())) {
				IAttributeInstance iattributeinstance = this.getEntityAttribute(SharedMonsterAttributes.ATTACK_DAMAGE);
				EnumFacing facing = this.getAdjustedHorizontalFacing();
				if (facing == EnumFacing.NORTH) {
					this.getAttackTarget().addVelocity(0.25, 0.15, 0);
				}
				else if (facing == EnumFacing.SOUTH) {
					this.getAttackTarget().addVelocity(-0.25, 0.15, 0);
				}
				else if (facing == EnumFacing.EAST) {
					this.getAttackTarget().addVelocity(0, 0.15, 0.25);
				}
				else if (facing == EnumFacing.WEST) {
					this.getAttackTarget().addVelocity(0, 0.15, -0.25);
				}
				boolean b = this.getAttackTarget().attackEntityFrom(DamageSource.causeMobDamage(this), (float) iattributeinstance.getAttributeValue());
				if (this.getOneHit()) {
					this.setAttackTarget(null);
					this.setRevengeTarget(null);
					this.setWarnTarget(null);
				}
				this.setOneHit(false);
			}
		}
	}

	@Override
	@SideOnly(Side.CLIENT)
	public AxisAlignedBB getRenderBoundingBox() {
		if (LepidodendronConfig.renderBigMobsProperly && (this.maxWidth * this.getAgeScale()) > 1F) {
			return this.getEntityBoundingBox().grow(15.0, 15.00, 15.0);
		}
		return this.getEntityBoundingBox();
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
		super.onEntityUpdate();
		//Sometimes stand up and look around:
		if ((!this.world.isRemote) && this.getEatTarget() == null && this.getAttackTarget() == null && this.getRevengeTarget() == null
				&& !this.getIsMoving() && this.getAnimation() == NO_ANIMATION && standCooldown == 0) {
			this.setAnimation(TAIL_ANIMATION);
			this.standCooldown = 3000;
		}
		//forces animation to return to base pose by grabbing the last tick and setting it to that.
		if ((!this.world.isRemote) && this.getAnimation() == TAIL_ANIMATION
				&& (this.getAnimationTick() == TAIL_ANIMATION.getDuration() - 1) || this.isReallyInWater()) {
			this.standCooldown = 3000;
			this.setAnimation(NO_ANIMATION);
		}

		if (this.isEntityAlive() && this.rand.nextInt(1000) < this.ambientSoundTime++ && !this.world.isRemote)
		{
			this.ambientSoundTime = -this.getAmbientTalkInterval();
			SoundEvent soundevent = this.getAmbientAmbientSound();
			if (soundevent != null)
			{
				if (this.getAnimation() == NO_ANIMATION) {
					this.setAnimation(NOISE_ANIMATION);
					//System.err.println("Playing noise sound on remote: " + (world.isRemote));
					this.playSound(soundevent, this.getSoundVolume(), this.getSoundPitch());
				}
			}
		}

	}

	public boolean isDirectPathBetweenPoints(Vec3d vec1, Vec3d vec2) {
		RayTraceResult movingobjectposition = this.world.rayTraceBlocks(vec1, new Vec3d(vec2.x, vec2.y, vec2.z), false, true, false);
		return movingobjectposition == null || movingobjectposition.typeOfHit != RayTraceResult.Type.BLOCK;
	}

	@Nullable
	@Override
	public CustomTrigger getModTrigger() {
		return ModTriggers.CLICK_SPINOPHOROSAURUS;
	}

	@Nullable
	protected ResourceLocation getLootTable() {
		if (!this.isPFAdult()) {
			return LepidodendronMod.SPINOPHOROSAURUS_LOOT_YOUNG;
		}
		return LepidodendronMod.SPINOPHOROSAURUS_LOOT;
	}

	//Rendering taxidermy:
	//--------------------
	public static double offsetWall(@Nullable String variant) {return -0.45;}
	public static double upperfrontverticallinedepth(@Nullable String variant) {return 0.0;}
	public static double upperbackverticallinedepth(@Nullable String variant) {return 0.0;}
	public static double upperfrontlineoffset(@Nullable String variant) {return 0.0;}
	public static double upperfrontlineoffsetperpendiular(@Nullable String variant) {return 0.0;}
	public static double upperbacklineoffset(@Nullable String variant) {return 0.0;}
	public static double upperbacklineoffsetperpendiular(@Nullable String variant) {return 0.0;}
	public static double lowerfrontverticallinedepth(@Nullable String variant) {return 1.5;}
	public static double lowerbackverticallinedepth(@Nullable String variant) {return 5.3;}
	public static double lowerfrontlineoffset(@Nullable String variant) {return -0.45;}
	public static double lowerfrontlineoffsetperpendiular(@Nullable String variant) {return 4.8;}
	public static double lowerbacklineoffset(@Nullable String variant) {return 0.0;}
	public static double lowerbacklineoffsetperpendiular(@Nullable String variant) {return -2.8;}
	@SideOnly(Side.CLIENT)
	public static ResourceLocation textureDisplay(@Nullable String variant) {return RenderSpinophorosaurus.TEXTURE;}
	@SideOnly(Side.CLIENT)
	public static ModelBase modelDisplay(@Nullable String variant) {return RenderDisplays.modelSpinophorosaurus;}
	public static float getScaler(@Nullable String variant) {return RenderSpinophorosaurus.getScaler();}
	public static float widthSupport(@Nullable String variant) {return 0.1F;}

}