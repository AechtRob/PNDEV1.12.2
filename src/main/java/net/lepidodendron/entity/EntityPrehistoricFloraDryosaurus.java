
package net.lepidodendron.entity;

import net.ilexiconn.llibrary.client.model.tools.ChainBuffer;
import net.ilexiconn.llibrary.server.animation.Animation;
import net.ilexiconn.llibrary.server.animation.AnimationHandler;
import net.lepidodendron.LepidodendronConfig;
import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.ai.*;
import net.lepidodendron.entity.base.EntityPrehistoricFloraAgeableBase;
import net.lepidodendron.entity.base.EntityPrehistoricFloraLandBase;
import net.lepidodendron.entity.render.entity.RenderDryosaurus;
import net.lepidodendron.entity.render.tile.RenderDisplays;
import net.lepidodendron.util.Functions;
import net.minecraft.block.BlockDirectional;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.PropertyDirection;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.model.ModelBase;
import net.minecraft.entity.*;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
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

public class EntityPrehistoricFloraDryosaurus extends EntityPrehistoricFloraLandBase {

	public BlockPos currentTarget;
	@SideOnly(Side.CLIENT)
	public ChainBuffer chainBuffer;
	private int inPFLove;
	public ChainBuffer tailBuffer;
	private boolean screaming;
	private int alarmCooldown;
	public Animation CHATTER_ANIMATION;
	public Animation LONG_CHATTER_ANIMATION;
	public Animation ALARM_ANIMATION;

	public EntityPrehistoricFloraDryosaurus(World world) {
		super(world);
		setSize(0.7F, 0.8F);
		minWidth = 0.12F;
		maxWidth = 0.7F;
		maxHeight = 0.8F;
		maxHealthAgeable = 35.0D;
		if (FMLCommonHandler.instance().getSide().isClient()) {
			tailBuffer = new ChainBuffer();
		}
		CHATTER_ANIMATION = Animation.create(this.getChatterLength());
		LONG_CHATTER_ANIMATION = Animation.create(this.getChatterLength());
		ALARM_ANIMATION = Animation.create(this.getPanicLength());
	}

	public int getChatterLength() {
		return 23;
	}

	public int getPanicLength() {
		return 20;
	}

	@Override
	public Animation[] getAnimations() {
		return new Animation[]{DRINK_ANIMATION, ATTACK_ANIMATION, ROAR_ANIMATION, LAY_ANIMATION, EAT_ANIMATION, MAKE_NEST_ANIMATION, CHATTER_ANIMATION, LONG_CHATTER_ANIMATION, ALARM_ANIMATION};
	}

	@Override
	public boolean attackEntityFrom(DamageSource ds, float i) {
		Entity e = ds.getTrueSource();
		if (e instanceof EntityLivingBase && (!(this instanceof EntityPrehistoricFloraDysalotosaurus))) {
			EntityLivingBase ee = (EntityLivingBase) e;
			List<EntityPrehistoricFloraDryosaurus> Dryosaurus = this.world.getEntitiesWithinAABB(EntityPrehistoricFloraDryosaurus.class, new AxisAlignedBB(this.getPosition().add(-8, -4, -8), this.getPosition().add(8, 4, 8)));
			for (EntityPrehistoricFloraDryosaurus currentDryosaurus : Dryosaurus) {
				if (!(currentDryosaurus instanceof EntityPrehistoricFloraDysalotosaurus)) {
					currentDryosaurus.setRevengeTarget(ee);
					currentDryosaurus.alarmCooldown = rand.nextInt(20);
				}
			}
		}
		return super.attackEntityFrom(ds, i);
	}

	@Override
	public void onUpdate() {
		super.onUpdate();
		if (world.isRemote && !this.isAIDisabled()) {
			tailBuffer.calculateChainSwingBuffer(60, 10, 5F, this);
		}
	}

	@Override
	public int getEggType() {
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
		return 15;
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
		float speedBase = 0.335F;
		if (this.getTicks() < 0) {
			return 0.0F; //Is laying eggs
		}
		if ((this.getAnimation() == CHATTER_ANIMATION || this.getAnimation() == LONG_CHATTER_ANIMATION) && (this.willGrapple) && this.getGrappleTarget() != null) {
			return 0.0F; //Is talking to a colleague!
		}
		if (this.getAnimation() == DRINK_ANIMATION || this.getAnimation() == MAKE_NEST_ANIMATION || this.getAnimation() == GRAZE_ANIMATION) {
			return 0.0F;
		}
		if (this.getIsFast()) {
			speedBase = speedBase * 2.65F;
		}
		return speedBase;
	}

	@Override
	public int grappleChance() {
		return 500;
	}

	@Override
	public int getTalkInterval() {
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
	public AxisAlignedBB getGrappleBoundingBox() {
		float size = this.getRenderSizeModifier() * 0.25F;
		return this.getEntityBoundingBox().grow(1.5F + size, 2.0F + size, 1.5F + size);
	}

	//TODO find a way to delay the other partner's animation and sound running, maybe with a variable with a randomized integer?
	@Override
	public boolean findGrappleTarget() {
		//System.err.println("finding grapple target");
		if (this.willGrapple) {
			return false;
		}
		List<EntityPrehistoricFloraDryosaurus> Dryosaurus = world.getEntitiesWithinAABB(EntityPrehistoricFloraDryosaurus.class, new AxisAlignedBB(this.getPosition().add(-8, -4, -8), this.getPosition().add(8, 4, 8)));
		for (EntityPrehistoricFloraDryosaurus currentDryosaurus : Dryosaurus) {
			if (!(currentDryosaurus instanceof EntityPrehistoricFloraDysalotosaurus)) {
				if (currentDryosaurus.isPFAdult() && this.isPFAdult() && currentDryosaurus != this && !currentDryosaurus.willGrapple) {
					this.setGrappleTarget(currentDryosaurus);
					currentDryosaurus.willGrapple = true;
					this.willGrapple = true;
					currentDryosaurus.setGrappleTarget(this);
					return true;
				}
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
		if(rand.nextInt(4) == 0){
			return this.LONG_CHATTER_ANIMATION;
		}
		return this.CHATTER_ANIMATION;
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
		tasks.addTask(4, new PanicScreamAI(this, 1.0));
		tasks.addTask(5, new GrappleAI(this, 1.0D, false, this.getChatterLength(), this.getGrappleAnimation(), 0.25));
		tasks.addTask(6, new LandWanderNestAI(this));
		tasks.addTask(7, new LandWanderFollowParent(this, 1.05D));
		tasks.addTask(8, new LandWanderHerd(this, 1.00D, this.getNavigator().getPathSearchRange()*0.666F));
		tasks.addTask(9, new LandWanderAvoidWaterAI(this, 1.0D, 60));
		tasks.addTask(10, new EntityWatchClosestAI(this, EntityPlayer.class, 6.0F));
		tasks.addTask(11, new EntityWatchClosestAI(this, EntityPrehistoricFloraAgeableBase.class, 8.0F));
		tasks.addTask(12, new EntityLookIdleAI(this));
		this.targetTasks.addTask(0, new EatItemsEntityPrehistoricFloraAgeableBaseAI(this, 1));
		this.targetTasks.addTask(1, new EntityHurtByTargetSmallerThanMeAI(this, false));
	}

	@Override
	public String[] getFoodOreDicts() {
		return ArrayUtils.addAll(DietString.PLANTS, DietString.FRUIT);
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
		return 90;  //grazes, does not drink
	}

	@Override
	public int getDrinkCooldown() {
		return 400;
	}

	private boolean isBlockGrazable(IBlockState state) {
		return (state.getMaterial() == Material.LEAVES || state.getMaterial() == Material.PLANTS);
	}

	private boolean isGrazable(World world, BlockPos pos, EnumFacing facing) {
//		if (world.getBlockState(pos.offset(facing).up(2)).getBlock().causesSuffocation(world.getBlockState(pos.offset(facing).up(2)))) {
//			return false;
//		}
//		if (world.getBlockState(pos.offset(facing).up(3)).getBlock().causesSuffocation(world.getBlockState(pos.offset(facing).up(3)))) {
//			return false;
//		}
//		if (world.getBlockState(pos.offset(facing).up(2)).getBlock().causesSuffocation(world.getBlockState(pos.offset(facing).offset(facing).up(2)))) {
//			return false;
//		}
//		if (world.getBlockState(pos.offset(facing).up(3)).getBlock().causesSuffocation(world.getBlockState(pos.offset(facing).offset(facing).up(3)))) {
//			return false;
//		}
		return true;
	}
	
	@Override
	public boolean isDrinking()
	{
		//Is GRAZING!
		if (!this.isPFAdult()) {
			return false;
		}

		BlockPos entityPos = Functions.getEntityBlockPos(this);

		boolean test2 = false;
		boolean test = (this.getPFDrinking() <= 0
				&& !world.isRemote
				&& !this.getIsFast()
				//&& !this.getIsMoving()
				&& this.DRINK_ANIMATION.getDuration() > 0
				&& this.getAnimation() == NO_ANIMATION
				&& !this.isReallyInWater()
				&&
				(
					(isBlockGrazable(this.world.getBlockState(entityPos.north()))
					&& isGrazable(this.world, entityPos, EnumFacing.NORTH))

					|| (isBlockGrazable(this.world.getBlockState(entityPos.south()))
					&& isGrazable(this.world, entityPos, EnumFacing.SOUTH))

					|| (isBlockGrazable(this.world.getBlockState(entityPos.east()))
					&& isGrazable(this.world, entityPos, EnumFacing.EAST))

					|| (isBlockGrazable(this.world.getBlockState(entityPos.west()))
					&& isGrazable(this.world, entityPos, EnumFacing.WEST))
				)
		);
		if (test) {
			//Which one is Grazable?
			EnumFacing facing = null;
			if (!test2 && isBlockGrazable(this.world.getBlockState(entityPos.north()))) {
				facing = EnumFacing.NORTH;
				if (Functions.getEntityCentre(this).z - Functions.getEntityBlockPos(this).getZ() <= 0.9D) {
					test2 = true;
				}
			}
			else if (!test2 && isBlockGrazable(this.world.getBlockState(entityPos.south()))) {
				facing = EnumFacing.SOUTH;
				if (Functions.getEntityCentre(this).z - Functions.getEntityBlockPos(this).getZ() >= 0.9D) {
					test2 = true;
				}
			}
			else if (!test2 && isBlockGrazable(this.world.getBlockState(entityPos.east()))) {
				facing = EnumFacing.EAST;
				if (Functions.getEntityCentre(this).z - Functions.getEntityBlockPos(this).getX() >= 0.9D) {
					test2 = true;
				}
			}
			else if (!test2 && isBlockGrazable(this.world.getBlockState(entityPos.west()))) {
				facing = EnumFacing.WEST;
				if (Functions.getEntityCentre(this).z - Functions.getEntityBlockPos(this).getX() <= 0.9D) {
					test2 = true;
				}
			}
			if (facing != null && test && test2) {
				this.setDrinkingFrom(entityPos.offset(facing));
				this.faceBlock(this.getDrinkingFrom(), 10F, 10F);
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
		this.getEntityAttribute(SharedMonsterAttributes.ATTACK_DAMAGE).setBaseValue(2.0D);
		this.getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).setBaseValue(0.25D);
	}

	@Override
	public SoundEvent getAmbientSound() {
		return (SoundEvent) SoundEvent.REGISTRY
				.getObject(new ResourceLocation("lepidodendron:dryosaurid_idle"));
	}

	@Override
	public SoundEvent getHurtSound(DamageSource ds) {
		return (SoundEvent) SoundEvent.REGISTRY
				.getObject(new ResourceLocation("lepidodendron:dryosaurid_hurt"));
	}

	@Override
	public SoundEvent getDeathSound() {
		return (SoundEvent) SoundEvent.REGISTRY
				.getObject(new ResourceLocation("lepidodendron:dryosaurid_death"));
	}


	public SoundEvent getAlarmSound() {
		return (SoundEvent) SoundEvent.REGISTRY
				.getObject(new ResourceLocation("lepidodendron:dryosaurid_alarm"));
	}


	public SoundEvent getChatterSound() {
		return (SoundEvent) SoundEvent.REGISTRY
				.getObject(new ResourceLocation("lepidodendron:dryosaurid_chatter"));
	}
	public SoundEvent getLongChatterSound() {
		return (SoundEvent) SoundEvent.REGISTRY
				.getObject(new ResourceLocation("lepidodendron:dryosaurid_long_chatter"));
	}

	public void playAlarmSound()
	{
		SoundEvent soundevent = this.getAlarmSound();
		//System.err.println("looking for alarm sound");
		if (soundevent != null && this.getAnimation() == NO_ANIMATION)
		{
			//System.err.println("playing alarm sound");
			this.setAnimation(ALARM_ANIMATION);
			this.playSound(soundevent, this.getSoundVolume(), this.getSoundPitch());
			this.alarmCooldown = 20;
		}
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

		if (this.getAnimation() == DRINK_ANIMATION) {
			if (LepidodendronConfig.doGrazeGrief && (!world.isRemote) && this.getAnimationTick() >= this.getAnimation().getDuration() * 0.75F) {
				ItemStack item = world.getBlockState(this.getDrinkingFrom()).getBlock().getPickBlock(world.getBlockState(this.getDrinkingFrom()), null, world, this.getDrinkingFrom(), null);
				world.destroyBlock(this.getDrinkingFrom(), true);
				float itemHealth = 0.5F; //Default minimal nutrition
				if (item.getItem() instanceof ItemFood) {
					itemHealth = ((ItemFood) item.getItem()).getHealAmount(item);
				}
				this.setHealth(Math.min(this.getHealth() + itemHealth, (float) this.getEntityAttribute(SharedMonsterAttributes.MAX_HEALTH).getBaseValue()));
			}
		}

		if (this.getAnimation() == ATTACK_ANIMATION && this.getAnimationTick() == 11 && this.getAttackTarget() != null) {
			launchAttack();
		}

		//System.err.println("this.getMateable() " + this.getMateable() + " inPFLove " + this.inPFLove);

		AnimationHandler.INSTANCE.updateAnimations(this);

	}

	@Override
	public void launchGrapple() {
		if (this.getGrappleTarget() != null) {
			if (!this.world.isRemote) {
				if(this.getAnimation() == CHATTER_ANIMATION) {
					this.playSound(this.getChatterSound(), this.getSoundVolume(), 1);
				} else {
					this.playSound(this.getLongChatterSound(), this.getSoundVolume(), 1);
				}
			}

			if (this.getGrappleTarget() instanceof EntityPrehistoricFloraAgeableBase) {
				EntityPrehistoricFloraAgeableBase grappleTarget = (EntityPrehistoricFloraAgeableBase) this.getGrappleTarget();
				grappleTarget.setGrappleTarget(null);
				grappleTarget.willGrapple = false;
			}
			this.setGrappleTarget(null);
			this.willGrapple = false;

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
	
	@Override
	public void onEntityUpdate() {
		if (this.alarmCooldown > 0) {
			this.alarmCooldown -= 1;
		}
		if (this.getScreaming() && alarmCooldown <= 0) {
			this.playAlarmSound();
		}
		super.onEntityUpdate();
	}
	
	public boolean isDirectPathBetweenPoints(Vec3d vec1, Vec3d vec2) {
		RayTraceResult movingobjectposition = this.world.rayTraceBlocks(vec1, new Vec3d(vec2.x, vec2.y, vec2.z), false, true, false);
		return movingobjectposition == null || movingobjectposition.typeOfHit != RayTraceResult.Type.BLOCK;
	}

	@Nullable
	protected ResourceLocation getLootTable() {
		if (!this.isPFAdult()) {
			return LepidodendronMod.DRYOSAURUS_LOOT_YOUNG;
		}
		return LepidodendronMod.DRYOSAURUS_LOOT;
	}

	//Rendering taxidermy:
	//--------------------
	public static double offsetWall(@Nullable String variant) {
		return -0.24;
	}
	public static double upperfrontverticallinedepth(@Nullable String variant) {
		return 0.8;
	}
	public static double upperbackverticallinedepth(@Nullable String variant) {
		return 0.8;
	}
	public static double upperfrontlineoffset(@Nullable String variant) {
		return 0.2;
	}
	public static double upperfrontlineoffsetperpendiular(@Nullable String variant) {
		return -0.04F;
	}
	public static double upperbacklineoffset(@Nullable String variant) {
		return 0.2;
	}
	public static double upperbacklineoffsetperpendiular(@Nullable String variant) {
		return -0.04F;
	}
	//2 lines rendered
	public static double lowerfrontverticallinedepth(@Nullable String variant) {
		return 0;
	}
	public static double lowerbackverticallinedepth(@Nullable String variant) {
		return 0.6;
	}
	public static double lowerfrontlineoffset(@Nullable String variant) {
		return 1;
	}
	public static double lowerfrontlineoffsetperpendiular(@Nullable String variant) {
		return 0;
	}
	public static double lowerbacklineoffset(@Nullable String variant) {
		return 0;
	}
	public static double lowerbacklineoffsetperpendiular(@Nullable String variant) {return 0F;}
	@SideOnly(Side.CLIENT)
	public static ResourceLocation textureDisplay(@Nullable String variant) {
		return RenderDryosaurus.TEXTURE;
	}
	@SideOnly(Side.CLIENT)
	public static ModelBase modelDisplay(@Nullable String variant) {
		return RenderDisplays.modelDryosaurus;
	}
	public static float getScaler(@Nullable String variant) {
		return RenderDryosaurus.getScaler();
	}

}