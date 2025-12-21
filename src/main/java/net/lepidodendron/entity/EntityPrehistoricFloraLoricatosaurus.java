
package net.lepidodendron.entity;

import net.ilexiconn.llibrary.client.model.tools.ChainBuffer;
import net.ilexiconn.llibrary.server.animation.Animation;
import net.ilexiconn.llibrary.server.animation.AnimationHandler;
import net.lepidodendron.LepidodendronConfig;
import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.block.base.IAdvancementGranter;
import net.lepidodendron.entity.ai.*;
import net.lepidodendron.entity.base.EntityPrehistoricFloraAgeableBase;
import net.lepidodendron.entity.base.EntityPrehistoricFloraLandCarnivoreBase;
import net.lepidodendron.entity.util.ITrappableLand;
import net.lepidodendron.util.CustomTrigger;
import net.lepidodendron.util.ModTriggers;
import net.minecraft.block.BlockDirectional;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.PropertyDirection;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EnumCreatureAttribute;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.EntityAIHurtByTarget;
import net.minecraft.entity.ai.attributes.IAttributeInstance;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.*;
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

public class EntityPrehistoricFloraLoricatosaurus extends EntityPrehistoricFloraLandCarnivoreBase implements IAdvancementGranter, ITrappableLand {

	public BlockPos currentTarget;
	@SideOnly(Side.CLIENT)
	public ChainBuffer chainBuffer;
	public ChainBuffer tailBuffer;
	public Animation IDLE_1;
	public Animation IDLE_2;
	public Animation IDLE_3;
	private int standCooldown;

	//data to support sideways walking:
	private boolean isRotated;
	private float rotationAngle;
	private float rotationTicks = 18; //to make the rotation fully

	public final EntityDamageSource THAGOMIZED = new EntityDamageSource("thagomized", this);

	public EntityPrehistoricFloraLoricatosaurus(World world) {
		super(world);
		setSize(1.45F, 2.25F);
		minWidth = 0.2F;
		maxWidth = 1.45F;
		maxHeight = 2.25F;
		maxHealthAgeable = 75;
		if (FMLCommonHandler.instance().getSide().isClient()) {
			tailBuffer = new ChainBuffer();
		}
		IDLE_1 = Animation.create(130);
		IDLE_2 = Animation.create(200);
		IDLE_3 = Animation.create(130);
	}

	@Override
	public boolean isAnimationDirectionLocked(Animation animation) {
		return animation == ROAR_ANIMATION
				|| animation == IDLE_1
				|| animation == IDLE_2
				|| animation == IDLE_3
				|| animation == DRINK_ANIMATION
				|| animation == GRAZE_ANIMATION
				|| this.getIsSneaking();
	}

	@Override
	public int getNoiseLength() {
		return 32;
	}

	@Override
	public float getSneakRange() {
		return 8;
	}

	@Override
	public float getUnSneakRange() {
		return -1;
	}

	@Override
	public Animation[] getAnimations() {
		return new Animation[]{DRINK_ANIMATION, HURT_ANIMATION, GRAZE_ANIMATION, ATTACK_ANIMATION, ROAR_ANIMATION, NOISE_ANIMATION, LAY_ANIMATION, EAT_ANIMATION, MAKE_NEST_ANIMATION, IDLE_1, IDLE_2, IDLE_3};
	}

	@Override
	public void onUpdate() {
		super.onUpdate();
		if (world.isRemote && !this.isAIDisabled()) {
			tailBuffer.calculateChainSwingBuffer(120, 10, 5F, this);
		}
	}

	public float getRotationAngle() {
		return this.rotationAngle;
	}

	@Override
	public boolean sneakOnRevenge() {
		return true;
	}

	@Override
	public void onEntityUpdate() {
		super.onEntityUpdate();

//		if (this.getIsSneaking()) {
//			if (this.getRevengeTarget() != null) {
//				if (this.getRevengeTarget() instanceof EntityPlayer) {
//					if (((EntityPlayer) this.getRevengeTarget()).isCreative()) {
//						this.setIsSneaking(false);
//					}
//				}
//			}
//			if (this.getAttackTarget() != null) {
//				if (this.getAttackTarget() instanceof EntityPlayer) {
//					if (((EntityPlayer) this.getAttackTarget()).isCreative()) {
//						this.setIsSneaking(false);
//					}
//				}
//			}
//		}


		//Managing the rotations, client-side only:
		if (this.world.isRemote) {
			if (this.getIsSneaking() && this.rotationAngle < 90) {
				this.rotationAngle = this.rotationAngle + (90F / rotationTicks);
			}
			if (this.rotationAngle > 90) {
				this.rotationAngle = 90;
			}
			if (!this.getIsSneaking() && this.rotationAngle > 0) {
				this.rotationAngle = this.rotationAngle - (90F / rotationTicks);
			}
			if (this.rotationAngle < 0) {
				this.rotationAngle = 0;
			}
		}

		//Alert animation
		if ((!this.world.isRemote) && (!this.world.isRemote) && this.getEatTarget() == null && this.getAttackTarget() == null && this.getRevengeTarget() == null
				&& (!this.getIsSneaking()) && (!this.getIsMoving()) && this.getAnimation() == NO_ANIMATION && standCooldown == 0) {
			int next = rand.nextInt(3);
			switch (next) {
				case 0:
				default:
					this.setAnimation(IDLE_1);
					break;

				case 1:
					this.setAnimation(IDLE_2);
					break;

				case 2:
					this.setAnimation(IDLE_3);
					break;
			}
			this.standCooldown = 2000;
		}
		//forces animation to return to base pose by grabbing the last tick and setting it to that.
		if ((!this.world.isRemote) && this.getAnimation() == IDLE_1 && this.getAnimationTick() == IDLE_1.getDuration() - 1) {
			this.standCooldown = 3000;
			this.setAnimation(NO_ANIMATION);
		}
		//forces animation to return to base pose by grabbing the last tick and setting it to that.
		if ((!this.world.isRemote) && this.getAnimation() == IDLE_2 && this.getAnimationTick() == IDLE_2.getDuration() - 1) {
			this.standCooldown = 3000;
			this.setAnimation(NO_ANIMATION);
		}
		//forces animation to return to base pose by grabbing the last tick and setting it to that.
		if ((!this.world.isRemote) && this.getAnimation() == IDLE_3 && this.getAnimationTick() == IDLE_3.getDuration() - 1) {
			this.standCooldown = 3000;
			this.setAnimation(NO_ANIMATION);
		}
	}

	@Override
	public int getEggType(@Nullable String variantIn) {
		return 2; //large
	}

	public static String getPeriod() {return "Jurassic";}


	@Override
	public boolean hasNest() {
		return true;
	}

	@Override
	public int getAttackLength() {
		return 25;
	}

	@Override
	public int getRoarLength() {
		return 44;
	}

	@Override
	public int getEatLength() {
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

	@Override
	public int warnCooldownTime() {
		return 20; //Straight into sneak/sideways mode more or less
	}

	public float getAISpeedLand() {
		float speedBase = 0.330F;
		if (this.getTicks() < 0) {
			return 0.0F; //Is laying eggs
		}
		if (this.getAnimation() == DRINK_ANIMATION || this.getAnimation() == MAKE_NEST_ANIMATION
			|| this.getAnimation() == ATTACK_ANIMATION || this.getAnimation() == GRAZE_ANIMATION
				|| this.getAnimation() == IDLE_1 || this.getAnimation() == IDLE_2
				|| this.getAnimation() == IDLE_3) {
			return 0.0F;
		}
		if (this.getIsSneaking()) {
			speedBase = speedBase * 0.5F;
		}
		if (this.getIsFast()) {
			speedBase = speedBase * 1.8F;
		}
		return speedBase;
	}

	@Override
	public int getTalkInterval() {
		return 80;
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
		tasks.addTask(2, new LandEntitySwimmingAI(this, this.getAISpeedLand(), false));
		tasks.addTask(3, new AttackAI(this, 1.0D, false, this.getAttackLength()));
		tasks.addTask(4, new AvoidEntityForSpaceReasonsPN(this));
		tasks.addTask(5, new LandWanderNestAI(this));
		tasks.addTask(6, new LandWanderFollowParent(this, 1.05D));
		tasks.addTask(7, new AgeableWarnEntity(this, EntityPlayer.class, 3));
		tasks.addTask(8, new LandWanderHerd(this, 1.00D, Math.max(1F, this.width) * this.getNavigator().getPathSearchRange() * 0.75F));
		tasks.addTask(9, new LandWanderAvoidWaterAI(this, 1.0D, 40));
		tasks.addTask(10, new EntityWatchClosestAI(this, EntityPlayer.class, 6.0F));
		tasks.addTask(11, new EntityWatchClosestAI(this, EntityPrehistoricFloraAgeableBase.class, 8.0F, false, false));
		tasks.addTask(12, new EntityLookIdleAI(this));
		this.targetTasks.addTask(0, new EatItemsEntityPrehistoricFloraAgeableBaseAI(this, 1));
		this.targetTasks.addTask(1, new EntityAIHurtByTarget(this, false));
		//this.targetTasks.addTask(1, new HuntAI(this, EntityPrehistoricFloraLandClimbingBase.class, true, (Predicate<Entity>) entity -> entity instanceof EntityLivingBase));
		//this.targetTasks.addTask(2, new HuntAI(this, EntityPrehistoricInsectFlyingBase.class, true, (Predicate<Entity>) entity -> entity instanceof EntityLivingBase));
	}



	@Override
	public String[] getFoodOreDicts() {
		return ArrayUtils.addAll(ArrayUtils.addAll(DietString.PLANTS, DietString.FRUIT), DietString.SEED);
	}

	@Override
	public EnumCreatureAttribute getCreatureAttribute() {
		return EnumCreatureAttribute.UNDEFINED;
	}


	@Override
	public boolean drinksWater() {
		return false;
	}

	@Override
	public int getDrinkLength() {
		return 220;
	}

	@Override
	public int getDrinkCooldown() {
		return 1000;
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
			if (this.world.getBlockState(this.getPosition().north(2).down()).getMaterial() == Material.GRASS
					|| this.world.getBlockState(this.getPosition().north(2).down()).getMaterial() == Material.PLANTS
					|| this.world.getBlockState(this.getPosition().north(2).down()).getMaterial() == Material.LEAVES) {
				facing = EnumFacing.NORTH;
			}
			else if (this.world.getBlockState(this.getPosition().south(2).down()).getMaterial() == Material.GRASS
					|| this.world.getBlockState(this.getPosition().south(2).down()).getMaterial() == Material.PLANTS
					|| this.world.getBlockState(this.getPosition().south(2).down()).getMaterial() == Material.LEAVES) {
				facing = EnumFacing.SOUTH;
			}
			else if (this.world.getBlockState(this.getPosition().east().down(2)).getMaterial() == Material.GRASS
					|| this.world.getBlockState(this.getPosition().east().down(2)).getMaterial() == Material.PLANTS
					|| this.world.getBlockState(this.getPosition().east().down(2)).getMaterial() == Material.LEAVES) {
				facing = EnumFacing.EAST;
			}
			else if (this.world.getBlockState(this.getPosition().west().down(2)).getMaterial() == Material.GRASS
					|| this.world.getBlockState(this.getPosition().west().down(2)).getMaterial() == Material.PLANTS
					|| this.world.getBlockState(this.getPosition().west().down(2)).getMaterial() == Material.LEAVES) {
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
		this.getEntityAttribute(SharedMonsterAttributes.ATTACK_DAMAGE).setBaseValue(24.0D);
		this.getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).setBaseValue(0.25D);
		this.getEntityAttribute(SharedMonsterAttributes.KNOCKBACK_RESISTANCE).setBaseValue(0.9D);
	}

	@Override
	public SoundEvent getAmbientSound() {
	    return (SoundEvent) SoundEvent.REGISTRY
	            .getObject(new ResourceLocation("lepidodendron:loricatosaurus_idle"));
	}

	@Override
	public SoundEvent getHurtSound(DamageSource ds) {
	    return (SoundEvent) SoundEvent.REGISTRY
	            .getObject(new ResourceLocation("lepidodendron:loricatosaurus_hurt"));
	}

	@Override
	public SoundEvent getDeathSound() {
	    return (SoundEvent) SoundEvent.REGISTRY
	            .getObject(new ResourceLocation("lepidodendron:loricatosaurus_death"));
	}

	@Nullable
	@Override
	public SoundEvent getRoarSound() {
		return (SoundEvent) SoundEvent.REGISTRY
				.getObject(new ResourceLocation("lepidodendron:loricatosaurus_idle"));
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

		if (this.getAnimation() == GRAZE_ANIMATION && !world.isRemote) {
			if (LepidodendronConfig.doGrazeGrief && world.getGameRules().getBoolean("mobGriefing") && this.getWillHunt() && (!world.isRemote) && this.getAnimationTick() >= this.getAnimation().getDuration() * 0.75F) {
				//if (LepidodendronConfig.doGrazeGrief && world.getGameRules().getBoolean("mobGriefing") && (!world.isRemote) && this.getAnimationTick() >= this.getAnimation().getDuration() * 0.75F) {
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
				this.getAttackTarget().addVelocity(0, 0.1, 0);
				boolean b = this.getAttackTarget().attackEntityFrom(THAGOMIZED, (float) iattributeinstance.getAttributeValue());
				if (this.getOneHit()) {
					this.setAttackTarget(null);
					this.setRevengeTarget(null);
					this.setWarnTarget(null);
				}
				this.setOneHit(false);
			}
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
			return LepidodendronMod.LORICATOSAURUS_LOOT_YOUNG;
		}
		return LepidodendronMod.LORICATOSAURUS_LOOT;
	}

	@Nullable
	@Override
	public CustomTrigger getModTrigger() {
		 return ModTriggers.CLICK_LORICATOSAURUS;
	}

	//Rendering taxidermy:
	//--------------------


}