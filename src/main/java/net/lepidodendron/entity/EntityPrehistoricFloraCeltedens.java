
package net.lepidodendron.entity;

import com.google.common.base.Predicate;
import net.ilexiconn.llibrary.client.model.tools.ChainBuffer;
import net.ilexiconn.llibrary.server.animation.AnimationHandler;
import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.ai.*;
import net.lepidodendron.entity.base.EntityPrehistoricFloraAgeableBase;
import net.lepidodendron.entity.base.EntityPrehistoricFloraLandBase;
import net.lepidodendron.entity.render.entity.RenderCeltedens;
import net.lepidodendron.entity.render.tile.RenderDisplays;
import net.lepidodendron.entity.util.ITrappableLand;
import net.lepidodendron.util.EggLayingConditions;
import net.minecraft.block.BlockDirectional;
import net.minecraft.block.properties.PropertyDirection;
import net.minecraft.client.model.ModelBase;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.EnumCreatureAttribute;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.EntityAIWanderAvoidWater;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.DamageSource;
import net.minecraft.util.ResourceLocation;
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

public class EntityPrehistoricFloraCeltedens extends EntityPrehistoricFloraLandBase implements ITrappableLand {

	public BlockPos currentTarget;
	@SideOnly(Side.CLIENT)
	public ChainBuffer chainBuffer;

	public EntityPrehistoricFloraCeltedens(World world) {
		super(world);
		setSize(0.225F, 0.15F);
		minWidth = 0.1F;
		maxWidth = 0.225F;
		maxHeight = 0.15F;
		maxHealthAgeable = 4.0D;
	}

	@Override
	public int getEggType(@Nullable String variantIn) {
		return 10; //rotten wood
	}

	@Override
	public int animSpeedAdder() {
		if ((this.getIsMoving() || (!this.onGround) || this.isJumping)
				&& this.getTicks() >= 0
		) {
			return 1;
		}
		return 0;
	}

	@Override
	public boolean noMossEggs() {
		return true;
	}

	@Override
	public boolean canJar() {
		return false;
	}

	public static String getPeriod() {return "Jurassic - Early Cretaceous - Late Cretaceous";}

	//public static String getHabitat() {return "Terrestrial";}

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
		if (this.getTicks() < 0) {
			return 0.0F; //Is laying eggs
		}
		if (this.getIsFast()) {
			return 0.70F;
		}
		return 0.215F;
	}

	@Override
	public int getTalkInterval() {
		return 270;
	}

	@Override
	public int getAdultAge() {
		return 48000;
	}

	public AxisAlignedBB getAttackBoundingBox() {
		float size = this.getRenderSizeModifier() * 0.25F;
		return this.getEntityBoundingBox().grow(1.0F + size, 1.0F + size, 1.0F + size);
	}

	protected void initEntityAI() {
		tasks.addTask(0, new EntityMateAIAgeableBase(this, 1.0D));
		tasks.addTask(1, new EntityTemptAI(this, 1, true, true, 1));
		tasks.addTask(2, new LandEntitySwimmingAI(this, 0.75, true));
		tasks.addTask(3, new AttackAI(this, 1.0D, false, this.getAttackLength()));
		tasks.addTask(4, new LandWanderNestInBlockAI(this));
		tasks.addTask(5, new EntityAIWanderAvoidWater(this, 1.0D));
		tasks.addTask(6, new EntityWatchClosestAI(this, EntityPlayer.class, 6.0F, true));
		tasks.addTask(7, new EntityWatchClosestAI(this, EntityPrehistoricFloraAgeableBase.class, 8.0F, true));
		tasks.addTask(8, new EntityLookIdleAI(this, true));
		this.targetTasks.addTask(0, new EatItemsEntityPrehistoricFloraAgeableBaseAI(this, 1));
		this.targetTasks.addTask(1, new HuntForDietEntityPrehistoricFloraAgeableBaseAI(this, EntityLivingBase.class, true, (Predicate<Entity>) entity -> entity instanceof EntityLivingBase, 0.1F, 1.2F, false));//		this.targetTasks.addTask(1, new HuntSmallerThanMeAIAgeable(this, EntityPrehistoricFloraAgeableFishBase.class, true, (Predicate<Entity>) entity -> entity instanceof EntityLivingBase, 0));
//		this.targetTasks.addTask(1, new HuntAI(this, EntityPrehistoricFloraLandClimbingBase.class, true, (Predicate<Entity>) entity -> entity instanceof EntityLivingBase));
//		this.targetTasks.addTask(2, new HuntAI(this, EntityPrehistoricFloraInsectFlyingBase.class, true, (Predicate<Entity>) entity -> entity instanceof EntityLivingBase));
	}

	@Override
	public String[] getFoodOreDicts() {
		return ArrayUtils.addAll(DietString.BUG);
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
		this.getEntityAttribute(SharedMonsterAttributes.ATTACK_DAMAGE).setBaseValue(1.0D);
		this.getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).setBaseValue(0.25D);
	}

	@Override
	public SoundEvent getAmbientSound() {
	    return (SoundEvent) SoundEvent.REGISTRY
	            .getObject(new ResourceLocation("lepidodendron:celtedens_idle"));
	}

	@Override
	public SoundEvent getHurtSound(DamageSource ds) {
	    return (SoundEvent) SoundEvent.REGISTRY
	            .getObject(new ResourceLocation("lepidodendron:celtedens_hurt"));
	}

	@Override
	public SoundEvent getDeathSound() {
	    return (SoundEvent) SoundEvent.REGISTRY
	            .getObject(new ResourceLocation("lepidodendron:celtedens_death"));
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

		if (this.getAnimation() == ATTACK_ANIMATION && this.getAnimationTick() == 5 && this.getAttackTarget() != null) {
			launchAttack();
		}

		AnimationHandler.INSTANCE.updateAnimations(this);

	}

	public static final PropertyDirection FACING = BlockDirectional.FACING;

	public boolean testLay(World world, BlockPos pos) {
		return EggLayingConditions.testLayMossAndWood(this, world, pos);
	}

	@Override
	public boolean nestBlockMatch(World world, BlockPos pos) {
		return (testLay(world, pos.down()) || testLay(world, pos)) ;
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
		return LepidodendronMod.CELTEDENS_LOOT;
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
	public static double lowerfrontverticallinedepth(@Nullable String variant) {return 0.0;}
	public static double lowerbackverticallinedepth(@Nullable String variant) {return 0.0;}
	public static double lowerfrontlineoffset(@Nullable String variant) {return 0.0;}
	public static double lowerfrontlineoffsetperpendiular(@Nullable String variant) {return 0.0;}
	public static double lowerbacklineoffset(@Nullable String variant) {return 0.0;}
	public static double lowerbacklineoffsetperpendiular(@Nullable String variant) {return 0.0;}
	@SideOnly(Side.CLIENT)
	public static ResourceLocation textureDisplay(@Nullable String variant) {return RenderCeltedens.TEXTURE;}
	@SideOnly(Side.CLIENT)
	public static ModelBase modelDisplay(@Nullable String variant) {return RenderDisplays.modelCeltedens;}
	public static float getScaler(@Nullable String variant) {return RenderCeltedens.getScaler();}
	public static float widthSupport(@Nullable String variant) {return 0.04F;}
}