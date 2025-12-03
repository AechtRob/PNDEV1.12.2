
package net.lepidodendron.entity;

import net.ilexiconn.llibrary.client.model.tools.ChainBuffer;
import net.ilexiconn.llibrary.server.animation.Animation;
import net.ilexiconn.llibrary.server.animation.AnimationHandler;
import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.block.base.IAdvancementGranter;
import net.lepidodendron.entity.ai.*;
import net.lepidodendron.entity.base.EntityPrehistoricFloraAgeableFishBase;
import net.lepidodendron.entity.util.ITrappableWater;
import net.lepidodendron.util.CustomTrigger;
import net.lepidodendron.util.ModTriggers;
import net.minecraft.block.material.Material;
import net.minecraft.entity.EnumCreatureAttribute;
import net.minecraft.entity.IEntityLivingData;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.DamageSource;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.DifficultyInstance;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.FMLCommonHandler;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import org.apache.commons.lang3.ArrayUtils;

import javax.annotation.Nullable;

public class EntityPrehistoricFloraExocoetoides extends EntityPrehistoricFloraAgeableFishBase implements ITrappableWater, IAdvancementGranter {

	public BlockPos currentTarget;
	@SideOnly(Side.CLIENT)
	public ChainBuffer tailBuffer;
	public Animation STAND_ANIMATION;
	private int standCooldown;
	private int flightProgress;

	public EntityPrehistoricFloraExocoetoides(World world) {
		super(world);
		setSize(.2F, .2F);
		minWidth = 0.1F;
		maxWidth = 0.2F;
		maxHeight = 0.2F;
		maxHealthAgeable = 2.0D;
		if (FMLCommonHandler.instance().getSide().isClient()) {
			tailBuffer = new ChainBuffer();
		}
	}

	@Override
	public void onUpdate() {
		super.onUpdate();
		if (world.isRemote && !this.isAIDisabled()) {
			tailBuffer.calculateChainSwingBuffer(60, 10, 5F, this);
		}
	}

	@Override
	public IEntityLivingData onInitialSpawn(DifficultyInstance difficulty, @Nullable IEntityLivingData livingdata) {
		livingdata = super.onInitialSpawn(difficulty, livingdata);
		this.standCooldown = rand.nextInt(1500);
		return livingdata;
	}

	@Override
	public Animation[] getAnimations() {
		return new Animation[]{ATTACK_ANIMATION, ROAR_ANIMATION, LAY_ANIMATION, STAND_ANIMATION};
	}

	public void writeEntityToNBT(NBTTagCompound compound)
	{
		super.writeEntityToNBT(compound);
		compound.setInteger("standCooldown", this.standCooldown);
		compound.setInteger("flightProgress", this.flightProgress);
	}

	public void readEntityFromNBT(NBTTagCompound compound) {
		super.readEntityFromNBT(compound);
		this.standCooldown = compound.getInteger("standCooldown");
		this.flightProgress = compound.getInteger("flightProgress");
	}

	//this checks if the mob is at surface, that is, 1 blocks above it is still water
	//change the value inside up to denote now many blocks above to check
	public boolean atSurface() {
		//isReally in Water
		boolean check1 = this.isReallyInWater();
		boolean check2 = (this.world.isAirBlock(this.getPosition().up()));
		boolean check3 = this.posY - this.getPosition().getY() >= 0.0;

		return check1 && check2 && check3;
	}

	//allows jump if all directions are still water and the animal is currently in water
	public boolean safeJump(){
		boolean check1 = this.isReallyInWater();
		//check 4 directions
		boolean check2 = this.world.getBlockState(this.getPosition().north()).getMaterial() == Material.WATER;
		boolean check3 = this.world.getBlockState(this.getPosition().south()).getMaterial() == Material.WATER;
		boolean check4 = this.world.getBlockState(this.getPosition().west()).getMaterial() == Material.WATER;
		boolean check5 = this.world.getBlockState(this.getPosition().east()).getMaterial() == Material.WATER;

		//Check if the fish is moving and confirm that the direction is safe

//		float angle = (float)Math.atan(this.motionZ/this.motionX);
//		float x = 5.0F * (float)Math.cos(angle);
//		float z = 5.0F * (float)Math.sin(angle);
//		Vec3d vec3d1 = this.getPositionVector().add(x, 0, z);
//
//		RayTraceResult raytraceresult = this.world.rayTraceBlocks(this.getPositionVector(), vec3d1, false, true, false);
//		if (raytraceresult != null && raytraceresult.typeOfHit == RayTraceResult.Type.BLOCK) {
//			return false;
//		}

		if (Math.sqrt(Math.pow(this.motionX, 2) + Math.pow(this.motionZ, 2)) < 0.3) {
			this.motionX = this.motionX * 1.1;
			this.motionZ = this.motionZ * 1.1;
		}

		return check1 && (check2 && check3 && check4 && check5);
	}

	protected void flyFish()
	{
		if (this.isInsideOfMaterial(Material.WATER)) {
			this.addVelocity(0, 1.1D, 0);
		}
		else {
			if (this.motionY < 0) {
				this.addVelocity(0, 0.085D, 0);
			}
			if (this.motionY > 0.025) {
				this.motionY = 0;
			}
			if (Math.sqrt(Math.pow(this.motionX, 2) + Math.pow(this.motionZ, 2)) < 0.3) {
				this.motionX = this.motionX * 1.1;
				this.motionZ = this.motionZ * 1.1;
			}
		}
	}

	@Override
	public boolean isSmall() {
		return true;
	}

	public static String getPeriod() {return "Late Cretaceous";}

	//public static String getHabitat() {return "Aquatic";}

	@Override
	public boolean canShoal() {
		return (!(this.getAlarmCooldown() > 0));
	}

	@Override
	public int getShoalSize() {
		return 10;
	}

	@Override
	public int getShoalDist() {
		return 3;
	}

	@Override
	public boolean dropsEggs() {
		return true;
	}
	
	@Override
	public boolean laysEggs() {
		return false;
	}

	@Override
	public boolean divesToLay() {
		return false;
	}

	@Override
	protected float getAISpeedFish() {
		return 0.25f;
	}

	@Override
	protected boolean isSlowAtBottom() {
		return false;
	}

	@Override
	public int getAdultAge() {
		return 20000;
	}

	protected void initEntityAI() {
		tasks.addTask(0, new EntityMateAIAgeableBase(this, 1));
		tasks.addTask(1, new ShoalFishAgeableAI(this, 1, true));
		tasks.addTask(1, new EntityTemptAI(this, 1, false, true, 0));
		tasks.addTask(1, new AgeableFishWander(this, NO_ANIMATION, 0.1, 10, true));
		this.targetTasks.addTask(0, new EatItemsEntityPrehistoricFloraAgeableBaseAI(this, 1));
	}

	@Override
	public String[] getFoodOreDicts() {
		return ArrayUtils.addAll(DietString.FISHFOOD);
	}


	@Override
	public boolean isAIDisabled() {
		return false;
	}

	@Override
	public String getTexture() {
		return this.getTexture();
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
		this.getEntityAttribute(SharedMonsterAttributes.MAX_HEALTH).setBaseValue(4.0D);
		this.getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).setBaseValue(0.25D);
		//this.getEntityAttribute(SharedMonsterAttributes.FOLLOW_RANGE).setBaseValue(48.0D);

	}

	@Override
	public SoundEvent getAmbientSound() {
		return (SoundEvent) SoundEvent.REGISTRY.getObject(new ResourceLocation(""));
	}

	@Override
	public SoundEvent getHurtSound(DamageSource ds) {
		return (SoundEvent) SoundEvent.REGISTRY.getObject(new ResourceLocation("entity.generic.hurt"));
	}

	@Override
	public SoundEvent getDeathSound() {
		return (SoundEvent) SoundEvent.REGISTRY.getObject(new ResourceLocation("entity.generic.death"));
	}

	@Override
	protected float getSoundVolume() {
		return 1.0F;
	}

	@Override
	public void onLivingUpdate() {
		super.onLivingUpdate();
		//this.renderYawOffset = this.rotationYaw;

		if (this.getAnimation() == ATTACK_ANIMATION && this.getAnimationTick() == 11 && this.getAttackTarget() != null) {
			launchAttack();
		}

		if((!this.world.isRemote) && this.atSurface() && this.safeJump() && this.standCooldown == 0
			&& this.motionX + this.motionZ > 0.04D && this.getEatTarget() == null && this.getAttackTarget() == null) {
			this.standCooldown = 200;
			this.flightProgress = 150;
		}

		if (this.flightProgress > 0) {
			this.flightProgress -= 1;
		}
		if (this.flightProgress < 0) {
			this.flightProgress = 0;
		}

		if (flightProgress > 0) {
			this.flyFish();
		}

		if (this.standCooldown > 0) {
			this.standCooldown -= rand.nextInt(3) + 1;
		}
		if (this.standCooldown < 0) {
			this.standCooldown = 0;
		}

		//System.err.println("this.getMateable() " + this.getMateable() + " inPFLove " + this.inPFLove);

		AnimationHandler.INSTANCE.updateAnimations(this);

	}

	@Override
	public int getAttackLength() {
		return 20;
	}

	@Override
	public void onEntityUpdate() {
		super.onEntityUpdate();
			//random idle animations
//			if ((!this.world.isRemote) && this.getEatTarget() == null && this.getAttackTarget() == null && this.getRevengeTarget() == null
//					&& (this.getAnimation() == NO_ANIMATION || this.getAnimation() == null ) && standCooldown == 0) {
//				//int next = rand.nextInt(10);
//				//if (next < 5) {
//				this.setAnimation(STAND_ANIMATION);
//				//} else {
//				//this.setAnimation(ATTACK_ANIMATION);
//				//}
//				this.standCooldown = 200;
//			}
//			if ((!this.world.isRemote) && this.getAnimation() == STAND_ANIMATION && this.getAnimationTick() == STAND_ANIMATION.getDuration() - 1) {
//				this.standCooldown = 2000;
//				this.setAnimation(NO_ANIMATION);
//			}


	}

	@Nullable
	protected ResourceLocation getLootTable() {
		return LepidodendronMod.EXOCOETOIDES_LOOT;
	}

	//Rendering taxidermy:
	//--------------------



	@Nullable
	@Override
	public CustomTrigger getModTrigger() {
		return ModTriggers.CLICK_EXOCOETOIDES;
	}
}

