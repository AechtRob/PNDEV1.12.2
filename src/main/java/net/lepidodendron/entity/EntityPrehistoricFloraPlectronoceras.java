
package net.lepidodendron.entity;

import net.ilexiconn.llibrary.client.model.tools.ChainBuffer;
import net.ilexiconn.llibrary.server.animation.Animation;
import net.ilexiconn.llibrary.server.animation.AnimationHandler;
import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.ai.EatFishFoodAITrilobiteBottomBase;
import net.lepidodendron.entity.ai.EntityMateAITrilobiteBottomBase;
import net.lepidodendron.entity.ai.ShoalTrilobiteBottomAI;
import net.lepidodendron.entity.ai.TrilobiteWanderBottom;
import net.lepidodendron.entity.base.EntityPrehistoricFloraTrilobiteBottomBase;
import net.minecraft.entity.*;
import net.minecraft.entity.ai.EntityAILookIdle;
import net.minecraft.util.DamageSource;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.DifficultyInstance;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import javax.annotation.Nullable;
import java.util.List;

public class EntityPrehistoricFloraPlectronoceras extends EntityPrehistoricFloraTrilobiteBottomBase {

	public BlockPos currentTarget;
	@SideOnly(Side.CLIENT)
	public ChainBuffer chainBuffer;
	public Animation JUMP_ANIMATION;
	private Animation currentAnimation;
	private int animationTick;
	private Animation animation = NO_ANIMATION;
	public int jumpCooldown;

	public EntityPrehistoricFloraPlectronoceras(World world) {
		super(world);
		setSize(0.2F, 0.2F);
		JUMP_ANIMATION = Animation.create(this.getJumpLength());

	}

	public int getJumpLength() {
		return 29;
	}

	@Override
	public boolean canShoal() {
		return false;
	}

	@Override
	public int getShoalSize() {
		return 0;
	}

	@Override
	public int getShoalDist() {
		return 3;
	}

	@Override
	public boolean isSmall() {
		return true;
	}

	@Override
	public Animation[] getAnimations() {
		return new Animation[]{JUMP_ANIMATION};
	}

	public static String getPeriod() {return "Cambrian";}

	//public static String getHabitat() {return "Aquatic";}

	@Override
	public boolean dropsEggs() {
		return true;
	}

	@Override
	public int getAnimationTick() {
		return animationTick;
	}

	@Override
	public void setAnimationTick(int tick) {
		animationTick = tick;
	}

	@Override
	public Animation getAnimation() {
		return currentAnimation == null ? NO_ANIMATION : currentAnimation;
	}

	@Override
	public void setAnimation(Animation animation) {
		if (this.getAnimation() != animation) {
			this.currentAnimation = animation;
			setAnimationTick(0);
		}
	}

	@Override
	protected float getAISpeedTrilobite() {
		return 0.225f;
	}

	@Override
	public IEntityLivingData onInitialSpawn(DifficultyInstance difficulty, @Nullable IEntityLivingData livingdata) {
		livingdata = super.onInitialSpawn(difficulty, livingdata);
		this.jumpCooldown = 200+(rand.nextInt(400));
		return livingdata;
	}


	@Override
	public boolean attackEntityFrom(DamageSource ds, float i) {
		Entity e = ds.getTrueSource();
		if (e instanceof EntityLivingBase && this.getAnimation() != JUMP_ANIMATION) {
			this.jump();
			this.jumpCooldown = 200+rand.nextInt(400);
			this.setAnimation(JUMP_ANIMATION);
		}
		return super.attackEntityFrom(ds, i);
	}

	protected void initEntityAI() {
		tasks.addTask(0, new EntityMateAITrilobiteBottomBase(this, 1));
		tasks.addTask(2, new TrilobiteWanderBottom(this, NO_ANIMATION));
		tasks.addTask(3, new EntityAILookIdle(this));
		this.targetTasks.addTask(0, new EatFishFoodAITrilobiteBottomBase(this));
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
		this.getEntityAttribute(SharedMonsterAttributes.MAX_HEALTH).setBaseValue(3.0D);
		this.getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).setBaseValue(0.3D);
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
		if(this.jumpCooldown > 0) {
			this.jumpCooldown--;
		}
		if(this.getAnimation()==JUMP_ANIMATION && (this.getAnimationTick()==JUMP_ANIMATION.getDuration()-1)){
			this.getNavigator().clearPath();
		}
		if(this.getIsMoving() && (!this.isJumping) && this.onGround){
			this.jump();
			this.jumpCooldown = 200+rand.nextInt(400);
			this.setAnimation(JUMP_ANIMATION);
		}
		if(this.motionY < 0 && this.isInWater()){
			this.motionY = this.motionY*0.35f;
		}
		AnimationHandler.INSTANCE.updateAnimations(this);
	}

	public void onEntityUpdate() {
		super.onEntityUpdate();
	}

	@Nullable
	protected ResourceLocation getLootTable() {
		return LepidodendronMod.PLECTRONOCERAS_LOOT;
	}

}