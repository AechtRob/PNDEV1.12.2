
package net.lepidodendron.entity;

import net.ilexiconn.llibrary.client.model.tools.ChainBuffer;
import net.ilexiconn.llibrary.server.animation.Animation;
import net.ilexiconn.llibrary.server.animation.AnimationHandler;
import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.ai.DietString;
import net.lepidodendron.entity.ai.EatItemsEntityPrehistoricFloraFishBaseAI;
import net.lepidodendron.entity.ai.EntityMateAIFishBase;
import net.lepidodendron.entity.ai.OpabiniaWander;
import net.lepidodendron.entity.base.EntityPrehistoricFloraFishBase;
import net.lepidodendron.entity.render.entity.RenderOpabinia;
import net.lepidodendron.entity.render.tile.RenderDisplays;
import net.lepidodendron.entity.util.ITrappableWater;
import net.minecraft.block.material.Material;
import net.minecraft.client.model.ModelBase;
import net.minecraft.entity.EnumCreatureAttribute;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.init.SoundEvents;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.network.datasync.DataParameter;
import net.minecraft.network.datasync.DataSerializers;
import net.minecraft.network.datasync.EntityDataManager;
import net.minecraft.util.DamageSource;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import org.apache.commons.lang3.ArrayUtils;

import javax.annotation.Nullable;

public class EntityPrehistoricFloraOpabinia extends EntityPrehistoricFloraFishBase implements ITrappableWater {

	private static final DataParameter<Integer> FEEDTICKS = EntityDataManager.createKey(EntityPrehistoricFloraOpabinia.class, DataSerializers.VARINT);
	public BlockPos currentTarget;
	@SideOnly(Side.CLIENT)
	public ChainBuffer chainBuffer;
	private int animationTick;
	public Animation FEED_ANIMATION;
	public Animation currentAnimation;

	public EntityPrehistoricFloraOpabinia(World world) {
		super(world);
		setSize(0.3F, 0.3F);
		FEED_ANIMATION = Animation.create(80);
	}

	@Override
	public boolean isSmall() {
		return true;
	}

	public static String getPeriod() {return "Cambrian";}

	//public static String getHabitat() {return "Aquatic";}

	@Override
	public void playLivingSound() {
	}

	@Override
	public boolean dropsEggs() {
		return true;
	}

	@Override
	protected float getAISpeedFish() {
		if (this.getAnimation() == FEED_ANIMATION) {return 0.00f;}
		return 0.056f;
	}

	@Override
	protected void entityInit() {
		super.entityInit();
		this.dataManager.register(FEEDTICKS, 0);
	}

	public int getFeedTicks() {
		if (this.dataManager.get(FEEDTICKS) == null) {
			this.setFeedTicks(0);
			return 0;
		}
		return this.dataManager.get(FEEDTICKS);
	}

	public void setFeedTicks(int feedticks) {
		this.dataManager.set(FEEDTICKS, feedticks);
	}

	public void writeEntityToNBT(NBTTagCompound compound)
	{
		super.writeEntityToNBT(compound);
		compound.setInteger("FeedTicks", this.getFeedTicks());
	}

	//@Override
	public void readEntityFromNBT(NBTTagCompound compound) {
		super.readEntityFromNBT(compound);
		this.setFeedTicks(compound.getInteger("FeedTicks"));
	}

	@Override
	protected boolean isSlowAtBottom() {
		return false;
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
	public Animation[] getAnimations() {
		return new Animation[]{FEED_ANIMATION};
	}

	protected void initEntityAI() {
		tasks.addTask(0, new EntityMateAIFishBase(this, 1));
		tasks.addTask(1, new OpabiniaWander(this, NO_ANIMATION));
		this.targetTasks.addTask(0, new EatItemsEntityPrehistoricFloraFishBaseAI(this));
	}

	@Override
	public String[] getFoodOreDicts() {
		return ArrayUtils.addAll(DietString.FISHFOOD);
	}


	@Override
	public boolean attackEntityFrom(DamageSource source, float amount) {
		this.setFeedTicks(0);
		this.setAnimation(NO_ANIMATION);
		return super.attackEntityFrom(source, amount);
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
		return EnumCreatureAttribute.ARTHROPOD;
	}

	@Override
	protected boolean canDespawn() {
		return false;
	}

	@Override
	protected void applyEntityAttributes() {
		super.applyEntityAttributes();
		this.getEntityAttribute(SharedMonsterAttributes.MAX_HEALTH).setBaseValue(2.0D);
		this.getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).setBaseValue(0.25D);
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

	public boolean isInFeedingPosition() {

		//System.err.println("posY: " + this.posY);
		//System.err.println("posY rounded-down: " + (double)(int)(this.posY));

		return
		super.isInWater()
		&& ((double)(this.posY - (double)(int)(this.posY)) < 0.5D)
		&& (this.world.getBlockState(new BlockPos(this.posX, this.posY-1, this.posZ)).getMaterial() != Material.WATER);
	}

	@Override
	public void onLivingUpdate() {
		super.onLivingUpdate();
		//this.renderYawOffset = this.rotationYaw;

		if (this.getAnimation() != NO_ANIMATION) {
			//animationTick++;
			//System.err.println("Anim duration: " + currentAnimation.getDuration());
			//System.err.println("Anim tick: " + animationTick);
			if (world.isRemote && animationTick >= currentAnimation.getDuration()) {
				this.setAnimation(NO_ANIMATION);
			}
		}

		//if (!this.world.isRemote) {
			if ((!(getFeedTicks() > 0)) || getFeedTicks() > 1800) {
				setFeedTicks(0);
			}
			setFeedTicks(getFeedTicks() + rand.nextInt(3));

			if (!(this.isInWater())) {
				//setFeeding(false);
				this.setAnimation(NO_ANIMATION);
			}
			else {
				if ((isHungry()) && isInFeedingPosition()) {
					if (this.getAnimation() == NO_ANIMATION) {
						//setFeeding(true);
						this.setFeedTicks((int)Math.round(Math.random() * 1300D));
						this.setAnimation(FEED_ANIMATION);
						//System.err.println("Set Anim");
					}
				}
			}

		AnimationHandler.INSTANCE.updateAnimations(this);

	}

	public boolean isHungry() {
		return (this.getFeedTicks() > 1300);
	}

	@Nullable
	protected ResourceLocation getLootTable() {
		return LepidodendronMod.OPABINIA_LOOT;
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
			if (this.getAnimation() == FEED_ANIMATION && !world.isRemote) {
				//this.setAnimation(ATTACK_ANIMATION);
				this.setAnimation(FEED_ANIMATION);
				SoundEvent soundevent = SoundEvents.ENTITY_GENERIC_EAT;
				this.getEntityWorld().playSound(null, this.getPosition(), soundevent, SoundCategory.BLOCKS, 1.0F, 1.0F);
			}
		}
	}
	public static double offsetWall(@Nullable String variant) {
		return -1.36;
	}
	public static double upperfrontverticallinedepth(@Nullable String variant) {
		return 2.0;
	}
	public static double upperbackverticallinedepth(@Nullable String variant) {
		return 2.0;
	}
	public static double upperfrontlineoffset(@Nullable String variant) {
		return 0.0;
	}
	public static double upperfrontlineoffsetperpendiular(@Nullable String variant) {
		return 0.0F;
	}
	public static double upperbacklineoffset(@Nullable String variant) {
		return 0.2;
	}
	public static double upperbacklineoffsetperpendiular(@Nullable String variant) {
		return 1.4F;
	}
	public static double lowerfrontverticallinedepth(@Nullable String variant) {
		return 0.93;
	}
	public static double lowerbackverticallinedepth(@Nullable String variant) {
		return 0.0;
	}
	public static double lowerfrontlineoffset(@Nullable String variant) {
		return 0.0;
	}
	public static double lowerfrontlineoffsetperpendiular(@Nullable String variant) {
		return 0.0F;
	}
	public static double lowerbacklineoffset(@Nullable String variant) {
		return 0.0;
	}
	public static double lowerbacklineoffsetperpendiular(@Nullable String variant) {
		return -0.5F;
	}
	@SideOnly(Side.CLIENT)
	public static ResourceLocation textureDisplay(@Nullable String variant) {
		return RenderOpabinia.TEXTURE;
	}
	@SideOnly(Side.CLIENT)
	public static ModelBase modelDisplay(@Nullable String variant) {
		return RenderDisplays.modelOpabinia;
	}
	public static float getScaler(@Nullable String variant) {
		return RenderOpabinia.getScaler();
	}
}

