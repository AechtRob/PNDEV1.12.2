
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
import net.lepidodendron.util.Functions;
import net.lepidodendron.util.ModTriggers;
import net.minecraft.block.BlockDirectional;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.PropertyDirection;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
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

public class EntityPrehistoricFloraSpicomellus extends EntityPrehistoricFloraLandCarnivoreBase implements IAdvancementGranter, ITrappableLand {

	public BlockPos currentTarget;
	@SideOnly(Side.CLIENT)
	public ChainBuffer chainBuffer;
	public ChainBuffer tailBuffer;
	private int standCooldown;
	public Animation IDLE_1;
	public Animation IDLE_2;

	//data to support sideways walking:
	private boolean isRotated;
	private float rotationAngle;
	private float rotationTicks = 18; //to make the rotation fully

	public final EntityDamageSource SPIKY = new EntityDamageSource("spiky", this);
	public final EntityDamageSource THAGOMIZED = new EntityDamageSource("thagomized", this);



	public EntityPrehistoricFloraSpicomellus(World world) {
		super(world);
		setSize(1.45F, 1.5F);
		minWidth = 0.2F;
		maxWidth = 1.45F;
		maxHeight = 1.5F;
		maxHealthAgeable = 75;
		if (FMLCommonHandler.instance().getSide().isClient()) {
			tailBuffer = new ChainBuffer();
		}
		HIDE_ANIMATION = Animation.create(hideAnimationLength());
		IDLE_1 = Animation.create(14);
		IDLE_2 = Animation.create(50);

	}

	@Override
	public boolean isAnimationDirectionLocked(Animation animation) {
		return animation == ROAR_ANIMATION
				|| animation == HIDE_ANIMATION
				|| animation == DRINK_ANIMATION
				|| this.getIsSneaking();
	}

	@Override
	public int getNoiseLength() {
		return 35;
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
		return new Animation[]{HURT_ANIMATION, ATTACK_ANIMATION, ROAR_ANIMATION, HIDE_ANIMATION, LAY_ANIMATION, EAT_ANIMATION, MAKE_NEST_ANIMATION, DRINK_ANIMATION, IDLE_1, IDLE_2};
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
			int next = rand.nextInt(7);
			switch (next) {
				case 0:
				default: //blink
					this.setAnimation(IDLE_1);
					break;

				case 1:
					this.setAnimation(IDLE_2);
					break;
			}
			this.standCooldown = 2000;
		}

		//forces animation to return to base pose by grabbing the last tick and setting it to that.
		if ((!this.world.isRemote) && this.getAnimation() == IDLE_1
				&& (this.getAnimationTick() == IDLE_1.getDuration() - 1) || this.isReallyInWater()) {
			this.standCooldown = 3000;
			this.setAnimation(NO_ANIMATION);
		}
		//forces animation to return to base pose by grabbing the last tick and setting it to that.
		if ((!this.world.isRemote) && this.getAnimation() == IDLE_2
				&& (this.getAnimationTick() == IDLE_2.getDuration() - 1) || this.isReallyInWater()) {
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
		return 40;
	}

	@Override
	public int getEatLength() {
		return 22;
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
		float speedBase = 0.25F;
		if (this.getTicks() < 0) {
			return 0.0F; //Is laying eggs
		}
		if (this.getAnimation() == DRINK_ANIMATION || this.getAnimation() == MAKE_NEST_ANIMATION
			|| this.getAnimation() == ATTACK_ANIMATION || this.getAnimation() == HIDE_ANIMATION) {
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
		tasks.addTask(4, new LandWanderNestAI(this));
		tasks.addTask(5, new LandWanderFollowParent(this, 1.05D));
		tasks.addTask(6, new AgeableWarnEntity(this, EntityPlayer.class, 3));
		tasks.addTask(7, new LandWanderHerd(this, 1.00D, Math.max(1F, this.width) * this.getNavigator().getPathSearchRange() * 0.75F));
		tasks.addTask(8, new LandWanderAvoidWaterAI(this, 1.0D, 40));
		tasks.addTask(9, new EntityWatchClosestAI(this, EntityPlayer.class, 6.0F));
		tasks.addTask(10, new EntityWatchClosestAI(this, EntityPrehistoricFloraAgeableBase.class, 8.0F));
		tasks.addTask(11, new EntityLookIdleAI(this));
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
		return 125;
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
	protected boolean canDespawn() {
		return false;
	}

	@Override
	protected void applyEntityAttributes() {
		super.applyEntityAttributes();
		this.getAttributeMap().registerAttribute(SharedMonsterAttributes.ATTACK_DAMAGE);
		this.getEntityAttribute(SharedMonsterAttributes.ATTACK_DAMAGE).setBaseValue(36.0D);
		this.getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).setBaseValue(0.25D);
		this.getEntityAttribute(SharedMonsterAttributes.KNOCKBACK_RESISTANCE).setBaseValue(0.9D);
	}

	@Override
	public SoundEvent getAmbientSound() {
	    return (SoundEvent) SoundEvent.REGISTRY
	            .getObject(new ResourceLocation("lepidodendron:spicomellus_idle"));
	}

	@Override
	public SoundEvent getHurtSound(DamageSource ds) {
	    return (SoundEvent) SoundEvent.REGISTRY
	            .getObject(new ResourceLocation("lepidodendron:spicomellus_hurt"));
	}

	@Override
	public SoundEvent getDeathSound() {
	    return (SoundEvent) SoundEvent.REGISTRY
	            .getObject(new ResourceLocation("lepidodendron:spicomellus_death"));
	}

	@Nullable
	@Override
	public SoundEvent getRoarSound() {
		return (SoundEvent) SoundEvent.REGISTRY
				.getObject(new ResourceLocation("lepidodendron:spicomellus_idle"));
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

	@Override
	public boolean attackEntityFrom(DamageSource ds, float i) {
		Entity entityIn = ds.getImmediateSource();
		boolean result;
		if (ds.getTrueSource() instanceof EntityLivingBase && this.getAnimation() == HIDE_ANIMATION) {
			result = super.attackEntityFrom(ds, i/10F);
		}
		else if(this.getHealth() < this.maxHealthAgeable*0.2F) {
			result = super.attackEntityFrom(ds, i/3F);
		}
		else {
			result = super.attackEntityFrom(ds, i);
		}
		if (result && ds.getTrueSource() instanceof EntityLivingBase && this.getAnimation() != HIDE_ANIMATION && this.getHealth() < this.maxHealthAgeable*0.2F) {
			this.setAnimation(HIDE_ANIMATION);
			EntityPrehistoricFloraSpicomellus.this.getNavigator().clearPath();
		}

		if (entityIn instanceof EntityPlayer) {
			EntityPlayer player = (EntityPlayer) entityIn;
			if (player.getHeldItem(getActiveHand()).isEmpty()) {
				entityIn.attackEntityFrom(SPIKY, (float) 2);
			}
		}
		if (ds.getTrueSource() instanceof EntityLivingBase && !(entityIn instanceof EntityPlayer)) {
			entityIn.attackEntityFrom(SPIKY, (float) 2);
		}

		return result;
	}

	public int hideAnimationLength() {
		return 160;
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
		return LepidodendronMod.SPICOMELLUS_LOOT;
	}

	@Nullable
	@Override
	public CustomTrigger getModTrigger() {
		 return ModTriggers.CLICK_SPICOMELLUS;
	}

	//Rendering taxidermy:
	//--------------------



}