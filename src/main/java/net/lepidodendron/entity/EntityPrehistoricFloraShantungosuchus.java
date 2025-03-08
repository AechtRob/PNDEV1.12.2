
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
import net.minecraft.block.BlockDirectional;
import net.minecraft.block.properties.PropertyDirection;
import net.minecraft.entity.*;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.DamageSource;
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

public class EntityPrehistoricFloraShantungosuchus extends EntityPrehistoricFloraLandBase implements ITrappableLand, IAdvancementGranter {

	public BlockPos currentTarget;
	@SideOnly(Side.CLIENT)
	public ChainBuffer tailBuffer;
	private int standCooldown;

	public EntityPrehistoricFloraShantungosuchus(World world) {
		super(world);
		setSize(0.3F, 0.2F);
		minWidth = 0.18F;
		maxWidth = 0.3F;
		maxHeight = 0.2F;
		maxHealthAgeable = 7.0D;
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
	public int getEatLength() {
		return 20;
	}

	@Override
	public int getEggType(@Nullable String variantIn) {
		return 0; //small
	}

	public static String getPeriod() {return "Early Cretaceous";}

	//public static String getHabitat() {return "Terrestrial Archosauriform";}

	@Override
	public boolean hasNest() {
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

	public float getAISpeedLand() {
		float speedBase = 0.22F;
		if (this.getTicks() < 0) {
			return 0.0F; //Is laying eggs
		}
		if (this.getIsFast()) {
			speedBase = speedBase * 2.5F;
		}
		if (this.getAnimation() == DRINK_ANIMATION || this.getAnimation() == MAKE_NEST_ANIMATION) {
			return 0.0F;
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
	public Animation[] getAnimations() {
		return new Animation[]{ATTACK_ANIMATION, ROAR_ANIMATION, LAY_ANIMATION, MAKE_NEST_ANIMATION, EAT_ANIMATION};
	}

	protected void initEntityAI() {
		tasks.addTask(0, new EntityMateAIAgeableBase(this, 1.0D));
		tasks.addTask(1, new EntityTemptAI(this, 1, false, true, (float) this.getEntityAttribute(SharedMonsterAttributes.ATTACK_DAMAGE).getAttributeValue() * 0.33F));
		tasks.addTask(2, new LandEntitySwimmingAI(this, 0.75, true));
		tasks.addTask(3, new AttackAI(this, 1.00D, false, this.getAttackLength()));
		tasks.addTask(4, new LandWanderNestAI(this));
		tasks.addTask(5, new LandWanderAvoidWaterAI(this, 1.0D, 45));
		tasks.addTask(6, new EntityWatchClosestAI(this, EntityPlayer.class, 6.0F));
		tasks.addTask(7, new EntityWatchClosestAI(this, EntityPrehistoricFloraAgeableBase.class, 8.0F));
		tasks.addTask(8, new EntityLookIdleAI(this));
		this.targetTasks.addTask(0, new EatItemsEntityPrehistoricFloraAgeableBaseAI(this, 1));
		this.targetTasks.addTask(1, new EntityHurtByTargetSmallerThanMeAI(this, false));
		this.targetTasks.addTask(2, new HuntPlayerAlwaysAI(this, EntityPlayer.class, true, (Predicate<Entity>) entity -> entity instanceof EntityLivingBase));
		this.targetTasks.addTask(3, new HuntForDietEntityPrehistoricFloraAgeableBaseAI(this, EntityLivingBase.class, true, (Predicate<Entity>) entity -> entity instanceof EntityLivingBase, 0.1F, 1.2F, false));//		this.targetTasks.addTask(1, new HuntSmallerThanMeAIAgeable(this, EntityPrehistoricFloraAgeableFishBase.class, true, (Predicate<Entity>) entity -> entity instanceof EntityLivingBase, 0));
//		this.targetTasks.addTask(3, new HuntSmallerThanMeAIAgeable(this, EntityPrehistoricFloraAgeableBase.class, true, (Predicate<Entity>) entity -> entity instanceof EntityLivingBase, 0.2));
//		this.targetTasks.addTask(4, new HuntAI(this, EntityPlayer.class, true, (Predicate<Entity>) entity -> entity instanceof EntityLivingBase));
//		this.targetTasks.addTask(5, new HuntSmallerThanMeAIAgeable(this, EntityLivingBase.class, true, (Predicate<Entity>) entity -> entity instanceof EntityLivingBase, 0.2));
	}

	@Override
	public String[] getFoodOreDicts() {
		return ArrayUtils.addAll(DietString.MEAT);
	}

	@Override
	public int getRoarLength() {
		return 21;
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
		this.getEntityAttribute(SharedMonsterAttributes.ATTACK_DAMAGE).setBaseValue(3.5D);
		this.getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).setBaseValue(0.25D);
	}

	@Override
	public SoundEvent getAmbientSound() {
	    return (SoundEvent) SoundEvent.REGISTRY
	            .getObject(new ResourceLocation("lepidodendron:archosaurus_idle"));
	}

	@Override
	public SoundEvent getHurtSound(DamageSource ds) {
	    return (SoundEvent) SoundEvent.REGISTRY
	            .getObject(new ResourceLocation("lepidodendron:archosaurus_hurt"));
	}

	@Override
	public SoundEvent getDeathSound() {
	    return (SoundEvent) SoundEvent.REGISTRY
	            .getObject(new ResourceLocation("lepidodendron:archosaurus_death"));
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
		AnimationHandler.INSTANCE.updateAnimations(this);

		//System.err.println("Eating: " + this.getEatTarget() + " isFast " + this.getIsFast());

	}

	@Override
	public void onEntityUpdate() {
		super.onEntityUpdate();
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
		return LepidodendronMod.SHANTUNGOSUCHUS_LOOT;
	}

	@Nullable
	@Override
	public CustomTrigger getModTrigger() {
		return ModTriggers.CLICK_SHANTUNGOSUCHUS;
	}
	//Rendering taxidermy:
	//--------------------



}