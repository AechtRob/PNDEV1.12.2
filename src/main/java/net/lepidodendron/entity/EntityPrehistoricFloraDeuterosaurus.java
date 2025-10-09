
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
import net.lepidodendron.util.ModTriggers;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.EnumCreatureAttribute;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.DamageSource;
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

import javax.annotation.Nullable;
import java.util.List;

public class EntityPrehistoricFloraDeuterosaurus extends EntityPrehistoricFloraLandBase implements ITrappableLand, IAdvancementGranter {

	public BlockPos currentTarget;
	@SideOnly(Side.CLIENT)
	public ChainBuffer tailBuffer;
	public Animation GRAPPLE_ANIMATION;

	public EntityPrehistoricFloraDeuterosaurus(World world) {
		super(world);
		setSize(0.9F, 0.9F);
		minWidth = 0.18F;
		maxWidth = 0.9F;
		maxHeight = 0.9F;
		maxHealthAgeable = 33.0D;
		GRAPPLE_ANIMATION = Animation.create(this.getGrappleLength());
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
		return 1; //medium
	}

	public int getGrappleLength() {
		return 100;
	}

	@Override
	public Animation[] getAnimations() {
		return new Animation[]{GRAPPLE_ANIMATION, ATTACK_ANIMATION, ROAR_ANIMATION, LAY_ANIMATION, EAT_ANIMATION};
	}

	@Override
	public int getRoarLength() {
		return 100;
	}

	public static String getPeriod() {return "Permian";}

	//public static String getHabitat() {return "Terrestrial Synapsid";}

	@Override
	public boolean hasNest() {
		return true;
	}

	@Override
	public int getAttackLength() {
		return 40;
	}

	@Override
	public int getEatLength() {
		return 40;
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
		float speedBase = 0.25F;
		if (this.getTicks() < 0) {
			return 0.0F; //Is laying eggs
		}
		if (this.getAnimation() == GRAPPLE_ANIMATION) {
			return 0.0F; //Is talking
		}
		if (this.getAnimation() == DRINK_ANIMATION || this.getAnimation() == MAKE_NEST_ANIMATION) {
			return 0.0F;
		}
		if (this.getIsFast()) {
			speedBase = speedBase * 2.5F;
		}
		return speedBase;
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
	public AxisAlignedBB getGrappleBoundingBox() {
		float size = this.getRenderSizeModifier() * 0.65F;
		return this.getEntityBoundingBox().grow(2.0F + size, 2.0F + size, 2.0F + size);
	}

	@Override
	public float getEyeHeight()
	{
		return Math.max(super.getEyeHeight(), this.height * 1.05F);
	}

	protected void initEntityAI() {
		tasks.addTask(0, new EntityMateAIAgeableBase(this, 1.0D));
		tasks.addTask(1, new EntityTemptAI(this, 1, false, true, (float) this.getEntityAttribute(SharedMonsterAttributes.ATTACK_DAMAGE).getAttributeValue() * 0.5F));
		tasks.addTask(2, new LandEntitySwimmingAI(this, 0.75, false));
		tasks.addTask(3, new AttackAI(this, 1, false, this.getAttackLength()));
        tasks.addTask(4, new AvoidEntityPN<>(this, EntityLivingBase.class, 6.0F, true));
		tasks.addTask(5, new LandWanderNestAI(this));
		tasks.addTask(6, new GrappleAI(this, 1.0D, false, this.getAttackLength(), this.getGrappleAnimation(), 0.85));
		tasks.addTask(7, new LandWanderFollowParent(this, 1.05D));
		tasks.addTask(8, new LandWanderAvoidWaterAI(this, 1.0D, 45));
		tasks.addTask(9, new EntityWatchClosestAI(this, EntityPlayer.class, 6.0F));
		tasks.addTask(10, new EntityWatchClosestAI(this, EntityPrehistoricFloraAgeableBase.class, 8.0F));
		tasks.addTask(11, new EntityLookIdleAI(this));
		this.targetTasks.addTask(0, new EatItemsEntityPrehistoricFloraAgeableBaseAI(this,1));
		this.targetTasks.addTask(1, new EntityHurtByTargetSmallerThanMeAI(this, false));
		this.targetTasks.addTask(2, new HuntPlayerAlwaysAI(this, EntityPlayer.class, true, (Predicate<Entity>) entity -> entity instanceof EntityLivingBase));
		this.targetTasks.addTask(3, new HuntForDietEntityPrehistoricFloraAgeableBaseAI(this, EntityLivingBase.class, true, (Predicate<Entity>) entity -> entity instanceof EntityLivingBase, 0.1F, 1.2F, false));//		this.targetTasks.addTask(1, new HuntSmallerThanMeAIAgeable(this, EntityPrehistoricFloraAgeableFishBase.class, true, (Predicate<Entity>) entity -> entity instanceof EntityLivingBase, 0));
//		this.targetTasks.addTask(3, new HuntSmallerThanMeAIAgeable(this, EntityPrehistoricFloraAgeableBase.class, true, (Predicate<Entity>) entity -> entity instanceof EntityLivingBase, 0.2D));
//		this.targetTasks.addTask(4, new HuntAI(this, EntityPlayer.class, true, (Predicate<Entity>) entity -> entity instanceof EntityLivingBase));
//		this.targetTasks.addTask(5, new HuntSmallerThanMeAIAgeable(this, EntityLivingBase.class, true, (Predicate<Entity>) entity -> entity instanceof EntityLivingBase, 0.2D));
	}

	@Override
	public String[] getFoodOreDicts() {
		return DietString.MEAT;
	}


	@Override
	public boolean findGrappleTarget() {
		//System.err.println("finding grapple target");
		if (this.willGrapple) {
			return false;
		}
		List<EntityPrehistoricFloraDeuterosaurus> Anteosaurus = world.getEntitiesWithinAABB(EntityPrehistoricFloraDeuterosaurus.class, new AxisAlignedBB(this.getPosition().add(-8, -4, -8), this.getPosition().add(8, 4, 8)));
		for (EntityPrehistoricFloraDeuterosaurus currentAnteosaurus : Anteosaurus) {
			if (currentAnteosaurus.isPFAdult() && this.isPFAdult() && currentAnteosaurus != this && !currentAnteosaurus.willGrapple) {
				this.setGrappleTarget(currentAnteosaurus);
				currentAnteosaurus.willGrapple=true;
				this.willGrapple = true;
				currentAnteosaurus.setGrappleTarget(this);
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
	            .getObject(new ResourceLocation("lepidodendron:deuterosaurus_idle"));
	}

	@Override
	public SoundEvent getHurtSound(DamageSource ds) {
	    return (SoundEvent) SoundEvent.REGISTRY
	            .getObject(new ResourceLocation("lepidodendron:deuterosaurus_hurt"));
	}

	@Override
	public SoundEvent getDeathSound() {
	    return (SoundEvent) SoundEvent.REGISTRY
	            .getObject(new ResourceLocation("lepidodendron:deuterosaurus_death"));
	}

	@Override
	protected float getSoundVolume() {
		return 1.0F;
	}

	public Animation getGrappleAnimation() {
		return this.GRAPPLE_ANIMATION;
	}

	@Override
	public boolean getCanSpawnHere() {
		return this.posY < (double) this.world.getSeaLevel() && this.isInWater();
	}

	@Override
	public int headbutTick() {
		return this.GRAPPLE_ANIMATION.getDuration() - 1;
	}

	@Override
	public void onLivingUpdate() {
		super.onLivingUpdate();
		//this.renderYawOffset = this.rotationYaw;

		if (this.getAnimation() == ATTACK_ANIMATION && this.getAnimationTick() == 11 && this.getAttackTarget() != null) {
			launchAttack();
		}

		if (this.willGrapple && this.getAnimation() == this.getGrappleAnimation() && this.getGrappleTarget() != null) {
			this.faceEntity(this.getGrappleTarget(), 10, 10);
			if (!this.world.isRemote && this.getAnimationTick() == 1) {
				this.playSound((SoundEvent) SoundEvent.REGISTRY
						.getObject(this.ThreatSound()), this.getSoundVolume(), 1);
			}
		}

		AnimationHandler.INSTANCE.updateAnimations(this);

	}

	public ResourceLocation ThreatSound() {
		return new ResourceLocation("lepidodendron:deuterosaurus_threat");
	}

	@Override
	public void launchGrapple() {
		if (this.getGrappleTarget() != null) {
			//Just a social thing no damage
		}
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
			return LepidodendronMod.DEUTEROSAURUS_LOOT_YOUNG;
		}
		return LepidodendronMod.DEUTEROSAURUS_LOOT;
	}
//	public static double offsetWall(@Nullable String variant) {
//		return 0.01;
//	}
//	public static double upperfrontverticallinedepth(@Nullable String variant) {
//		return 1.4;
//	}
//	public static double upperbackverticallinedepth(@Nullable String variant) {
//		return 0.8;
//	}
//	public static double upperfrontlineoffset(@Nullable String variant) {
//		return 0.4;
//	}
//	public static double upperfrontlineoffsetperpendiular(@Nullable String variant) {
//		return -0F;
//	}
//	public static double upperbacklineoffset(@Nullable String variant) {
//		return 0.4;
//	}
//	public static double upperbacklineoffsetperpendiular(@Nullable String variant) {
//		return -0.15F;
//	}
//	public static double lowerfrontverticallinedepth(@Nullable String variant) {
//		return 0.9;
//	}
//	public static double lowerbackverticallinedepth(@Nullable String variant) {
//		return 0.9;
//	}
//	public static double lowerfrontlineoffset(@Nullable String variant) {
//		return 0.0;
//	}
//	public static double lowerfrontlineoffsetperpendiular(@Nullable String variant) {
//		return 0.45F;
//	}
//	public static double lowerbacklineoffset(@Nullable String variant) {
//		return 0.0;
//	}
//	public static double lowerbacklineoffsetperpendiular(@Nullable String variant) {
//		return -0.49F;
//	}
//	@SideOnly(Side.CLIENT)
//	public static ResourceLocation textureDisplay(@Nullable String variant) {
//		return RenderAnteosaurus.TEXTURE;
//	}
//	@SideOnly(Side.CLIENT)
//	public static ModelBase modelDisplay(@Nullable String variant) {
//		return RenderDisplays.modelAnteosaurus;
//	}
//	public static float getScaler(@Nullable String variant) {
//		return RenderAnteosaurus.getScaler();
//	}

	@Nullable
	@Override
	public CustomTrigger getModTrigger() {
		return ModTriggers.CLICK_DEUTEROSAURUS;
	}
}