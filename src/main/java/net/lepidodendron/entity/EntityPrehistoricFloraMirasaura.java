
package net.lepidodendron.entity;

import net.ilexiconn.llibrary.client.model.tools.ChainBuffer;
import net.ilexiconn.llibrary.server.animation.Animation;
import net.ilexiconn.llibrary.server.animation.AnimationHandler;
import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.block.base.IAdvancementGranter;
import net.lepidodendron.entity.ai.*;
import net.lepidodendron.entity.base.EntityPrehistoricFloraAgeableBase;
import net.lepidodendron.entity.base.EntityPrehistoricFloraLandClimbingBase;
import net.lepidodendron.entity.util.*;
import net.lepidodendron.util.CustomTrigger;
import net.lepidodendron.util.EggLayingConditions;
import net.lepidodendron.util.ModTriggers;
import net.minecraft.block.BlockDirectional;
import net.minecraft.block.properties.PropertyDirection;
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
import java.util.List;

public class EntityPrehistoricFloraMirasaura extends EntityPrehistoricFloraLandClimbingBase implements IFreezes, IScreamer, ITrappableLand, IAdvancementGranter {

	public BlockPos currentTarget;
	@SideOnly(Side.CLIENT)
	public ChainBuffer chainBuffer;
	private boolean screaming;
	public int screamAlarmCooldown;
	public int freezeTicks;

	public EntityPrehistoricFloraMirasaura(World world) {
		super(world);
		setSize(0.30F, 0.25F);
		minWidth = 0.10F;
		maxWidth = 0.30F;
		maxHeight = 0.25F;
		maxHealthAgeable = 6.0D;
	}

	@Override
	public boolean isAnimationDirectionLocked(Animation animation) {
		return this.getFrozen() || animation == DRINK_ANIMATION || animation == GRAZE_ANIMATION;
	}

	@Override
	public boolean hasAlarm() {
		return true;
	}

	@Override
	public boolean attackEntityFrom(DamageSource ds, float i) {
		Entity e = ds.getTrueSource();
		if (e instanceof EntityLivingBase && this.hasAlarm()) {
			EntityLivingBase ee = (EntityLivingBase) e;
			this.setAnimation(NO_ANIMATION);
			this.setAlarmTarget(ee);
			this.freezeTicks = 0;
			List<EntityPrehistoricFloraMirasaura> Drepanosaurus = this.world.getEntitiesWithinAABB(EntityPrehistoricFloraMirasaura.class, new AxisAlignedBB(this.getPosition().add(-8, -4, -8), this.getPosition().add(8, 4, 8)));
			for (EntityPrehistoricFloraMirasaura currentDrepanosaurus : Drepanosaurus) {
				if (currentDrepanosaurus != this && currentDrepanosaurus.getAlarmTarget() == null) {
					currentDrepanosaurus.freezeTicks = 200;
				}
			}
		}
		return super.attackEntityFrom(ds, i);
	}

	public void setScreaming(boolean screaming) {
		this.screaming = screaming;
	}

	public boolean getScreaming() {
		return this.screaming;
	}

	@Override
	public int getEggType(@Nullable String variantIn) {
		return 10; //rotten wood
	}

	@Override
	public boolean noMossEggs() {
		return true;
	}

	@Override
	public int getRoarLength() {
		return 29;
	}

	@Override
	public float getClimbSpeed() {
		if (this.getFrozen()) {
			return 0;
		}
		return 0.5F;
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

	public static String getPeriod() {return "Triassic";}

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
	public int getEatLength() {
		return 20;
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
		if (this.getFrozen()) {
			return 0;
		}
		float speedBase = 0.18F;
		if (this.getTicks() < 0) {
			return 0.0F; //Is laying eggs
		}
		if (this.getIsFast()) {
			speedBase = speedBase * 2.15F;
		}
		if (this.getAnimation() == MAKE_NEST_ANIMATION) {
			return 0.0F;
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
	public Animation[] getAnimations() {
		return new Animation[]{ATTACK_ANIMATION, ROAR_ANIMATION, LAY_ANIMATION, EAT_ANIMATION};
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
		tasks.addTask(4, new PanicScreamAI(this, 1.0));
        tasks.addTask(5, new AvoidEntityPN<>(this, EntityLivingBase.class, 6.0F, true));
		tasks.addTask(6, new LandWanderNestInBlockAI(this));
		tasks.addTask(7, new LandWanderAvoidWaterClimbingAI(this, 1.0D, 5));
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
		//Do not push other drepanosauruss (they will fall out of the trees if so!)
		if (!(entityIn instanceof EntityPrehistoricFloraMirasaura)) {
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
	            .getObject(new ResourceLocation("lepidodendron:drepanosaurus_hurt"));
	}

	@Override
	public SoundEvent getDeathSound() {
	    return (SoundEvent) SoundEvent.REGISTRY
	            .getObject(new ResourceLocation("lepidodendron:drepanosaurus_death"));
	}

	public SoundEvent getAlarmSound() {
		return (SoundEvent) SoundEvent.REGISTRY
				.getObject(new ResourceLocation("lepidodendron:drepanosaurus_alarm"));
	}

	public void playAlarmSound()
	{
		SoundEvent soundevent = this.getAlarmSound();
		//System.err.println("looking for alarm sound");
		if (soundevent != null)
		{
			//System.err.println("playing alarm sound");
			this.playSound(soundevent, this.getSoundVolume(), this.getSoundPitch());
			this.screamAlarmCooldown = 20;
		}
	}

	@Override
	public void onEntityUpdate() {
		if (this.screamAlarmCooldown > 0) {
			this.screamAlarmCooldown -= 1;
		}
		if (this.getScreaming() && screamAlarmCooldown <= 0) {
			this.playAlarmSound();
		}
		if (this.freezeTicks > 0) {
			this.freezeTicks --;
		}
		
		super.onEntityUpdate();

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
		return LepidodendronMod.MIRASAURA_LOOT;
	}

	@Nullable
	@Override
	public CustomTrigger getModTrigger() {
		return ModTriggers.CLICK_MIRASAURA;
	}

	@Override
	public boolean getFrozen() {
		return this.freezeTicks > 0;
	}
	
	//Rendering taxidermy:
	//--------------------



}