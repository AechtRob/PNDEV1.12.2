
package net.lepidodendron.entity;

import net.ilexiconn.llibrary.client.model.tools.ChainBuffer;
import net.ilexiconn.llibrary.server.animation.AnimationHandler;
import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.block.base.IAdvancementGranter;
import net.lepidodendron.entity.ai.*;
import net.lepidodendron.entity.base.EntityPrehistoricFloraAgeableBase;
import net.lepidodendron.entity.base.EntityPrehistoricFloraLandClimbingBase;
import net.lepidodendron.entity.render.entity.RenderPetrolacosaurus;
import net.lepidodendron.entity.render.tile.RenderDisplays;
import net.lepidodendron.entity.util.ITrappableLand;
import net.lepidodendron.entity.util.PathNavigateGroundNoWater;
import net.lepidodendron.entity.util.PathNavigateSwimmerTopLayer;
import net.lepidodendron.util.CustomTrigger;
import net.lepidodendron.util.ModTriggers;
import net.minecraft.block.BlockDirectional;
import net.minecraft.block.properties.PropertyDirection;
import net.minecraft.client.model.ModelBase;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.EnumCreatureAttribute;
import net.minecraft.entity.SharedMonsterAttributes;
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

public class EntityPrehistoricFloraPetrolacosaurus extends EntityPrehistoricFloraLandClimbingBase implements ITrappableLand, IAdvancementGranter {

	public BlockPos currentTarget;
	@SideOnly(Side.CLIENT)
	public ChainBuffer chainBuffer;

	public EntityPrehistoricFloraPetrolacosaurus(World world) {
		super(world);
		setSize(0.30F, 0.25F);
		minWidth = 0.10F;
		maxWidth = 0.30F;
		maxHeight = 0.25F;
		maxHealthAgeable = 3.0D;
	}

	@Override
	public int getEggType(@Nullable String variantIn) {
		return 0; //SMALL EGGS
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
	public float getClimbSpeed() {
		return 0.5F;
	}

	@Override
	public int getEatLength() {
		return 15;
	}

	@Override
	public int getClimbCooldown() {
		return 20 + rand.nextInt(40);
	}

	@Override
	public void selectNavigator () {
		if (this.isSwimmingInWater() && this.canSwim()) {
			if ((!(this.moveHelper instanceof SwimmingMoveHelper))
					|| (!(this.navigator instanceof PathNavigateSwimmerTopLayer))) {
				this.moveHelper = new SwimmingMoveHelper();
				this.navigator = new PathNavigateSwimmerTopLayer(this, world);
				//System.err.println(this.getClass() + " Navigator changed to " + this.navigator);
			}
		}

		else if ((!this.isSwimmingInWater()) || (!this.canSwim())) {
			if ((!(this.moveHelper instanceof WanderMoveHelper))
					|| (!(this.navigator instanceof PathNavigateGroundNoWater))) {
				this.moveHelper = new WanderMoveHelper();
				this.navigator = new PathNavigateGroundNoWater(this, world);
				//System.err.println(this.getClass() + "Navigator changed to " + this.navigator);
			}
		}
	}

	public static String getPeriod() {return "Carboniferous";}

	//public static String getHabitat() {return "Arboreal Therapsid";}

	@Override
	public boolean canSpawnOnLeaves() {
		return true;
	}

	@Override
	public int getAttackLength() {
		return 20;
	}

	@Override
	public String getTexture() {
		return this.getTexture();
	}

	public float getAISpeedLand() {
		float speedBase = 0.21F;
		if (this.getTicks() < 0) {
			return 0.0F; //Is laying eggs
		}
		if (this.getIsFast()) {
			speedBase = speedBase * 1.25F;
		}
		if (this.getIsClimbing()) {
			speedBase = speedBase * 0.30F;
		}
		return speedBase;
	}

	@Override
	public int getTalkInterval() {
		return 80;
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
	public float getEyeHeight()
	{
		return Math.max(super.getEyeHeight(), this.height * 0.95F);
	}

	protected void initEntityAI() {
		tasks.addTask(0, new EntityMateAIAgeableBase(this, 1.0D));
		tasks.addTask(1, new EntityTemptAI(this, 1, true, true, 0));
		tasks.addTask(2, new LandEntitySwimmingAI(this, 0.75, true));
		tasks.addTask(3, new AttackAI(this, 1.6D, false, this.getAttackLength()));
		tasks.addTask(4, new PanicAI(this, 1.0));
        tasks.addTask(5, new AvoidEntityPN<>(this, EntityLivingBase.class, 6.0F, true));
		tasks.addTask(6, new LandWanderAvoidWaterClimbingAI(this, 1.0D, 5));
		tasks.addTask(7, new LandWanderNestAI(this));
		tasks.addTask(8, new EntityWatchClosestAI(this, EntityPlayer.class, 6.0F));
		tasks.addTask(9, new EntityWatchClosestAI(this, EntityPrehistoricFloraAgeableBase.class, 8.0F));
		tasks.addTask(10, new EntityLookIdleAI(this));
		this.targetTasks.addTask(0, new EatItemsEntityPrehistoricFloraAgeableBaseAI(this, 1.5));
	}

	@Override
	public String[] getFoodOreDicts() {
		return ArrayUtils.addAll(ArrayUtils.addAll(ArrayUtils.addAll(DietString.PLANTS, DietString.SEED), DietString.BUG), DietString.FRUIT);
	}

	@Override
	public boolean panics() {
		return true;
	}

	@Override
	public void applyEntityCollision(Entity entityIn) {
		//Do not push other Hypuronectors (they will fall out of the trees if so!)
		if (!(entityIn instanceof EntityPrehistoricFloraPetrolacosaurus)) {
			super.applyEntityCollision(entityIn);
		}
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
		this.getEntityAttribute(SharedMonsterAttributes.ATTACK_DAMAGE).setBaseValue(4.0D);
		this.getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).setBaseValue(0.25D);
	}

	@Override
	public SoundEvent getAmbientSound() {
	    return (SoundEvent) SoundEvent.REGISTRY
	            .getObject(new ResourceLocation(""));
	}

	@Override
	public SoundEvent getHurtSound(DamageSource ds) {
	    return (SoundEvent) SoundEvent.REGISTRY
	            .getObject(new ResourceLocation("lepidodendron:petrolacosaurus_hurt"));
	}

	@Override
	public SoundEvent getDeathSound() {
	    return (SoundEvent) SoundEvent.REGISTRY
	            .getObject(new ResourceLocation("lepidodendron:petrolacosaurus_death"));
	}

	@Override
	protected float getSoundVolume() {
		return 0.8F;
	}

	@Override
	public boolean getCanSpawnHere() {
		return this.posY < (double) this.world.getSeaLevel() && this.isInWater();
	}
	

	@Override
	public void onLivingUpdate() {
		super.onLivingUpdate();
		//this.renderYawOffset = this.rotationYaw;

		if (this.getAnimation() == ATTACK_ANIMATION && this.getAnimationTick() == 11 && this.getAttackTarget() != null) {
			launchAttack();
		}

		AnimationHandler.INSTANCE.updateAnimations(this);

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
		return LepidodendronMod.PETROLACOSAURUS_LOOT;
	}

	@Nullable
	@Override
	public CustomTrigger getModTrigger() {
		return ModTriggers.CLICK_PETROLACOSAURUS;
	}
	//Rendering taxidermy:
	//--------------------
    public static double offsetWall(@Nullable String variant) {
        return -0.225;
    }
    public static double upperfrontverticallinedepth(@Nullable String variant) {
        return 0;
    }
    public static double upperbackverticallinedepth(@Nullable String variant) {
        return 0.0;
    }
    public static double upperfrontlineoffset(@Nullable String variant) {
        return 0.0;
    }
    public static double upperfrontlineoffsetperpendiular(@Nullable String variant) {        return 0.04;    }
    public static double upperbacklineoffset(@Nullable String variant) {        return 0.0;}
    public static double upperbacklineoffsetperpendiular(@Nullable String variant) {
        return 0.0;
    }
    public static double lowerfrontverticallinedepth(@Nullable String variant) {
        return 0;
    }
    public static double lowerbackverticallinedepth(@Nullable String variant) {
        return 0;
    }
    public static double lowerfrontlineoffset(@Nullable String variant) {return 0.2;}
    public static double lowerfrontlineoffsetperpendiular(@Nullable String variant) {
        return -0.2;
    }
    public static double lowerbacklineoffset(@Nullable String variant) {
        return 0.045;
    }
    public static double lowerbacklineoffsetperpendiular(@Nullable String variant) {
        return 0.7;
    }
    @SideOnly(Side.CLIENT)
    public static ResourceLocation textureDisplay(@Nullable String variant) { return RenderPetrolacosaurus.TEXTURE;
    }
    @SideOnly(Side.CLIENT)
    public static ModelBase modelDisplay(@Nullable String variant) {
        return RenderDisplays.modelPetrolacosaurus;
    }
    public static float getScaler(@Nullable String variant) {
        return RenderPetrolacosaurus.getScaler();
    }


}