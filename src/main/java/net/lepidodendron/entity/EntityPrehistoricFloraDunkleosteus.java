
package net.lepidodendron.entity;

import com.google.common.base.Predicate;
import net.ilexiconn.llibrary.client.model.tools.ChainBuffer;
import net.ilexiconn.llibrary.server.animation.Animation;
import net.ilexiconn.llibrary.server.animation.AnimationHandler;
import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.ai.*;
import net.lepidodendron.entity.base.EntityPrehistoricFloraAgeableBase;
import net.lepidodendron.entity.base.EntityPrehistoricFloraAgeableFishBase;
import net.lepidodendron.entity.render.entity.RenderDunkleosteus;
import net.lepidodendron.entity.render.tile.RenderDisplays;
import net.minecraft.client.model.ModelBase;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.EnumCreatureAttribute;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.SoundEvents;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.util.DamageSource;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.FMLCommonHandler;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import org.apache.commons.lang3.ArrayUtils;

import javax.annotation.Nullable;

public class EntityPrehistoricFloraDunkleosteus extends EntityPrehistoricFloraAgeableFishBase {

	public BlockPos currentTarget;
	@SideOnly(Side.CLIENT)
	public ChainBuffer tailBuffer;
	private int animationTick;
	private Animation animation = NO_ANIMATION;

	public EntityPrehistoricFloraDunkleosteus(World world) {
		super(world);
		setSize(1.5F, 2.0F);
		minWidth = 0.2F;
		maxWidth = 1.5F;
		maxHeight = 2F;
		maxHealthAgeable = 46.0D;
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
	public boolean isSmall() {
		return this.getAgeScale() < 0.2;
	}

	public static String getPeriod() {return "Devonian";}

	//public static String getHabitat() {return "Aquatic";}

	@Override
	public EntityPrehistoricFloraAgeableBase createPFChild(EntityPrehistoricFloraAgeableBase entity) {
		return new EntityPrehistoricFloraDunkleosteus(this.world);
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
	public boolean divesToLay() {
		return false;
	}

	@Override
	public int getAdultAge() {
		return 128000;
	}

	@Override
	public int getTalkInterval() {
		return 225;
	}

	@Override
	public int getRoarLength() {
		return 15;
	}

	@Override
	protected float getAISpeedFish() {
		float AIspeed = 0.275f;
		if (this.getIsFast()) {
			AIspeed = AIspeed * 2.1F;
		}
		return AIspeed;
	}

	@Override
	protected boolean isSlowAtBottom() {
		return false;
	}

	@Override
	public boolean attackEntityFrom(DamageSource source, float amount) {
		if (source != DamageSource.DROWN) {
			return super.attackEntityFrom(source, (amount * 0.5F));
		}
		return super.attackEntityFrom(source, amount);
	}

	protected void initEntityAI() {
		tasks.addTask(0, new EntityMateAI(this, 1));
		tasks.addTask(1, new EntityTemptAI(this, 1, false, true, (float) this.getEntityAttribute(SharedMonsterAttributes.ATTACK_DAMAGE).getAttributeValue()));
		tasks.addTask(2, new AttackAI(this, 1.0D, false, this.getAttackLength()));
		tasks.addTask(3, new AgeableFishWander(this, NO_ANIMATION, 0.1, -2, true));
		this.targetTasks.addTask(0, new EatItemsEntityPrehistoricFloraAgeableBaseAI(this, 1));
		//this.targetTasks.addTask(0, new EatItemsEntityPrehistoricFloraAgeableBaseAI(this, 1));
		this.targetTasks.addTask(1, new EntityHurtByTargetSmallerThanMeAI(this, false));
		this.targetTasks.addTask(2, new HuntPlayerAlwaysAI(this, EntityPlayer.class, true, (Predicate<Entity>) entity -> entity instanceof EntityLivingBase));
		this.targetTasks.addTask(3, new HuntForDietEntityPrehistoricFloraAgeableBaseAI(this, EntityLivingBase.class, true, (Predicate<Entity>) entity -> entity instanceof EntityLivingBase, 0.1F, 1.2F, false));
//		this.targetTasks.addTask(3, new HuntAI(this, EntityPlayer.class, true, (Predicate<Entity>) entity -> entity instanceof EntityLivingBase));
//		this.targetTasks.addTask(4, new HuntAI(this, EntityPrehistoricFloraFishBase.class, true, (Predicate<Entity>) entity -> entity instanceof EntityLivingBase));
//		this.targetTasks.addTask(4, new HuntSmallerThanMeAIAgeable(this, EntityPrehistoricFloraAgeableFishBase.class, true, (Predicate<Entity>) entity -> entity instanceof EntityLivingBase, 0.2));
//		this.targetTasks.addTask(4, new HuntSmallerThanMeAIAgeable(this, EntityPrehistoricFloraAmphibianBase.class, true, (Predicate<Entity>) entity -> entity instanceof EntityLivingBase, 0.2));
//		this.targetTasks.addTask(4, new HuntSmallerThanMeAIAgeable(this, EntityPrehistoricFloraAgeableBase.class, true, (Predicate<Entity>) entity -> entity instanceof EntityLivingBase, 0.2));
//		this.targetTasks.addTask(4, new HuntSmallerThanMeAIAgeable(this, EntityLiving.class, true, (Predicate<Entity>) entity -> entity instanceof EntityLivingBase, 0.2));
//		this.targetTasks.addTask(5, new HuntAI(this, EntitySquid.class, true, (Predicate<Entity>) entity -> entity instanceof EntityLivingBase));
//		this.targetTasks.addTask(6, new HuntSmallerThanMeAIAgeable(this, EntityLivingBase.class, true, (Predicate<Entity>) entity -> entity instanceof EntityLivingBase, 0.2));
	}

	@Override
	public String[] getFoodOreDicts() {
		return ArrayUtils.addAll(DietString.FISH, DietString.MEAT);
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
		this.getAttributeMap().registerAttribute(SharedMonsterAttributes.ATTACK_DAMAGE);
		this.getEntityAttribute(SharedMonsterAttributes.ATTACK_DAMAGE).setBaseValue(12D);
		this.getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).setBaseValue(0.25D);
		this.getEntityAttribute(SharedMonsterAttributes.FOLLOW_RANGE).setBaseValue(48.0D);
		this.getEntityAttribute(SharedMonsterAttributes.KNOCKBACK_RESISTANCE).setBaseValue(1.0D);
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
		////this.renderYawOffset = this.rotationYaw;

		if (this.getAnimation() == ATTACK_ANIMATION && this.getAnimationTick() == 15 && this.getAttackTarget() != null) {
			launchAttack();
		}

		AnimationHandler.INSTANCE.updateAnimations(this);

	}

	@Override
	public boolean breaksBoat() {
		return true;
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

	public void onEntityUpdate() {
		super.onEntityUpdate();
	}

	@Nullable
	protected ResourceLocation getLootTable() {
		 		if (!this.isPFAdult()) {
			return LepidodendronMod.DUNKLEOSTEUS_LOOT_YOUNG;
		}
		return LepidodendronMod.DUNKLEOSTEUS_LOOT;
	}

	@Override
	public void eatItem(ItemStack stack) {
		if (stack != null && stack.getItem() != null) {
			float itemHealth = 0.5F; //Default minimal nutrition
			if (stack.getItem() instanceof ItemFood) {
				itemHealth = ((ItemFood) stack.getItem()).getHealAmount(stack);
			}
			this.setHealth(Math.min(this.getHealth() + itemHealth, (float) this.getEntityAttribute(SharedMonsterAttributes.MAX_HEALTH).getBaseValue()));
			stack.shrink(1);
			if (this.getAnimation() == NO_ANIMATION && !world.isRemote) {
				//this.setAnimation(ATTACK_ANIMATION);
				this.setAnimation(ROAR_ANIMATION);
				SoundEvent soundevent = SoundEvents.ENTITY_GENERIC_EAT;
				this.getEntityWorld().playSound(null, this.getPosition(), soundevent, SoundCategory.BLOCKS, 1.0F, 1.0F);
			}
		}

	}

	//Rendering taxidermy:
	//--------------------
	public static double offsetWall(@Nullable String variant) {
		return -0.8;
	}
	public static double upperfrontverticallinedepth(@Nullable String variant) {
		return 2;
	}
	public static double upperbackverticallinedepth(@Nullable String variant) {
		return 1.5;
	}
	public static double upperfrontlineoffset(@Nullable String variant) {
		return 1;
	}
	public static double upperfrontlineoffsetperpendiular(@Nullable String variant) {
		return -0.04F;
	}
	public static double upperbacklineoffset(@Nullable String variant) {
		return 2.5;
	}
	public static double upperbacklineoffsetperpendiular(@Nullable String variant) {
		return -0.8F;
	}
	public static double lowerfrontverticallinedepth(@Nullable String variant) {
		return 2;
	}
	public static double lowerbackverticallinedepth(@Nullable String variant) {
		return 2;
	}
	public static double lowerfrontlineoffset(@Nullable String variant) {
		return 1;
	}
	public static double lowerfrontlineoffsetperpendiular(@Nullable String variant) {
		return -0F;
	}
	public static double lowerbacklineoffset(@Nullable String variant) {
		return 2.5;
	}
	public static double lowerbacklineoffsetperpendiular(@Nullable String variant) {
		return -0.5F;
	}
	@SideOnly(Side.CLIENT)
	public static ResourceLocation textureDisplay(@Nullable String variant) {
		return RenderDunkleosteus.TEXTURE;
	}
	@SideOnly(Side.CLIENT)
	public static ModelBase modelDisplay(@Nullable String variant) {
		return RenderDisplays.modelDunkleosteus;
	}
	public static float getScaler(@Nullable String variant) {
		return RenderDunkleosteus.getScaler();
	}
}

