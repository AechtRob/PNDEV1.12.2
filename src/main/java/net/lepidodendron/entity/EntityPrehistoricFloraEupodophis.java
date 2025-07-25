
package net.lepidodendron.entity;

import com.google.common.base.Predicate;
import net.ilexiconn.llibrary.client.model.tools.ChainBuffer;
import net.ilexiconn.llibrary.server.animation.Animation;
import net.ilexiconn.llibrary.server.animation.AnimationHandler;
import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.block.base.IAdvancementGranter;
import net.lepidodendron.entity.ai.*;
import net.lepidodendron.entity.base.EntityPrehistoricFloraAgeableBase;
import net.lepidodendron.entity.base.EntityPrehistoricFloraFishBase;
import net.lepidodendron.entity.base.EntityPrehistoricFloraSwimmingAmphibianBase;
import net.lepidodendron.entity.util.ITrappableLand;
import net.lepidodendron.entity.util.ITrappableWater;
import net.lepidodendron.util.CustomTrigger;
import net.lepidodendron.util.ModTriggers;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.IEntityLivingData;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.ResourceLocation;
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

public class EntityPrehistoricFloraEupodophis extends EntityPrehistoricFloraSwimmingAmphibianBase implements IAdvancementGranter, ITrappableWater, ITrappableLand {

	public BlockPos currentTarget;
	@SideOnly(Side.CLIENT)
	public ChainBuffer tailBuffer;
	public Animation EAT_ANIMATION;
	private int standCooldown;

	public EntityPrehistoricFloraEupodophis(World world) {
		super(world);
		setSize(0.3F, 0.1F);
		minWidth = 0.1F;
		maxWidth = 0.3F;
		maxHeight = 0.1F;
		maxHealthAgeable = 5.0D;
		EAT_ANIMATION = Animation.create(13);
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
	public boolean canJumpOutOfWater() {
		return false;
	}

	@Override
	public boolean dropsEggs() {
		return false;
	}

	@Override
	public boolean laysEggs() {
		return false;
	}

	@Override
	public Animation[] getAnimations() {
		return new Animation[]{ATTACK_ANIMATION, ROAR_ANIMATION, LAY_ANIMATION, EAT_ANIMATION, MAKE_NEST_ANIMATION};
	}

	public static String getPeriod() {
		return "Late Cretaceous";
	}

	@Override
	public EntityPrehistoricFloraAgeableBase createPFChild(EntityPrehistoricFloraAgeableBase entity) {
		return new EntityPrehistoricFloraEupodophis(this.world);
	}

	protected float getAISpeedSwimmingAmphibian() {
		float calcSpeed = 0.2F;
		if (this.isReallyInWater()) {
			calcSpeed = 0.1f;
		}
		if (this.getTicks() < 0) {
			return 0.0F; //Is laying eggs
		}
		if (this.getAnimation() == MAKE_NEST_ANIMATION) {
			return 0.0F;
		}
		//System.err.println("Speed " + (Math.min(1F, (this.getAgeScale() * 2F)) * calcSpeed));
		return calcSpeed;
	}

	@Override
	public int getAdultAge() {
		return 64000;
	}

	@Override
	public int WaterDist() {
		return 0;
	}

	@Override
	public int getAttackLength() {
		return 60;
	}

	@Override
	public int getRoarLength() {
		return 40;
	}


	@Override
	public boolean isSmall() {
		return true;
	}

	protected void initEntityAI() {
		tasks.addTask(0, new EntityMateAI(this, 1.0D));
		tasks.addTask(1, new EntityTemptAI(this, 1, false, true, 1F));
		tasks.addTask(2, new AttackAI(this, 1.0D, false, this.getAttackLength()));
		tasks.addTask(3, new AmphibianWanderNotBound(this, NO_ANIMATION, 1, 20));
		tasks.addTask(4, new EntityWatchClosestAI(this, EntityPlayer.class, 6.0F));
		tasks.addTask(5, new EntityWatchClosestAI(this, EntityPrehistoricFloraFishBase.class, 8.0F));
		tasks.addTask(6, new EntityWatchClosestAI(this, EntityPrehistoricFloraAgeableBase.class, 8.0F));
		tasks.addTask(7, new EntityLookIdleAI(this));
		this.targetTasks.addTask(0, new EatItemsEntityPrehistoricFloraAgeableBaseAI(this, 1));
//		this.targetTasks.addTask(0, new EatItemsEntityPrehistoricFloraAgeableBaseAI(this, 1));
		this.targetTasks.addTask(1, new EntityHurtByTargetSmallerThanMeAI(this, false));
		this.targetTasks.addTask(2, new HuntPlayerAlwaysAI(this, EntityPlayer.class, true, (Predicate<Entity>) entity -> entity instanceof EntityLivingBase));
		this.targetTasks.addTask(3, new HuntForDietEntityPrehistoricFloraAgeableBaseAI(this, EntityLivingBase.class, true, (Predicate<Entity>) entity -> entity instanceof EntityLivingBase, 0.1F, 1.2F, false));
//		this.targetTasks.addTask(3, new HuntAI(this, EntityPrehistoricFloraFishBase.class, true, (Predicate<Entity>) entity -> entity instanceof EntityLivingBase));
//		this.targetTasks.addTask(4, new HuntSmallerThanMeAIAgeable(this, EntityPrehistoricFloraAgeableFishBase.class, true, (Predicate<Entity>) entity -> entity instanceof EntityLivingBase, 0));
	}

	@Override
	public String[] getFoodOreDicts() {
		return ArrayUtils.addAll(DietString.FISH);
	}

	@Override
	protected void applyEntityAttributes() {
		super.applyEntityAttributes();
		this.getAttributeMap().registerAttribute(SharedMonsterAttributes.ATTACK_DAMAGE);
		this.getEntityAttribute(SharedMonsterAttributes.ATTACK_DAMAGE).setBaseValue(3.0D);
		this.getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).setBaseValue(0.25D);
	}

	@Override
	protected float getSoundVolume() {
		return 1.0F;
	}

	@Override
	public boolean canBreatheUnderwater() {
		return true;
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
	public void onLivingUpdate() {
		super.onLivingUpdate();
		//this.renderYawOffset = this.rotationYaw;

		if (this.getAnimation() == ATTACK_ANIMATION && this.getAnimationTick() == 11 && this.getAttackTarget() != null) {
			launchAttack();
		}

		if (this.standCooldown > 0) {
			this.standCooldown -= rand.nextInt(3) + 1;
		}
		if (this.standCooldown < 0) {
			this.standCooldown = 0;
		}
		AnimationHandler.INSTANCE.updateAnimations(this);

		//System.err.println("Eating: " + this.getEatTarget() + " isFast " + this.getIsFast());

	}

	public boolean isNotColliding() {
		return this.world.checkNoEntityCollision(this.getEntityBoundingBox(), this);
	}

	@Override
	public boolean attackEntityAsMob(Entity entity) {
		if (this.getAnimation() == NO_ANIMATION) {
			this.setAnimation(ATTACK_ANIMATION);
			//System.err.println("set attack");
		}
		return false;
	}

	public boolean testLay(World world, BlockPos pos) {
		return (
				nestBlockMatch(world, pos)
		);
	}

	public boolean isDirectPathBetweenPoints(Vec3d vec1, Vec3d vec2) {
		RayTraceResult movingobjectposition = this.world.rayTraceBlocks(vec1, new Vec3d(vec2.x, vec2.y, vec2.z), false, true, false);
		return movingobjectposition == null || movingobjectposition.typeOfHit != RayTraceResult.Type.BLOCK;
	}
	@Nullable
	@Override
	public CustomTrigger getModTrigger() {
		return ModTriggers.CLICK_EUPODOPHIS;
	}
	@Nullable
	protected ResourceLocation getLootTable() {
		return LepidodendronMod.EUPODOPHIS_LOOT;
	}
	//Rendering taxidermy:
	//--------------------

}