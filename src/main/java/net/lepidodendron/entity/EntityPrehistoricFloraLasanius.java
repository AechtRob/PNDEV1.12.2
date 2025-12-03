
package net.lepidodendron.entity;

import net.ilexiconn.llibrary.client.model.tools.ChainBuffer;
import net.ilexiconn.llibrary.server.animation.Animation;
import net.ilexiconn.llibrary.server.animation.AnimationHandler;
import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.ai.*;
import net.lepidodendron.entity.base.EntityPrehistoricFloraFishBase;
import net.lepidodendron.entity.render.entity.RenderLasanius;
import net.lepidodendron.entity.render.tile.RenderDisplays;
import net.lepidodendron.entity.util.ITrappableWater;
import net.minecraft.block.material.Material;
import net.minecraft.client.model.ModelBase;
import net.minecraft.entity.EnumCreatureAttribute;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.network.datasync.DataParameter;
import net.minecraft.network.datasync.DataSerializers;
import net.minecraft.network.datasync.EntityDataManager;
import net.minecraft.util.DamageSource;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import org.apache.commons.lang3.ArrayUtils;

import javax.annotation.Nullable;

public class EntityPrehistoricFloraLasanius extends EntityPrehistoricFloraFishBase implements ITrappableWater {

	private static final DataParameter<Integer> FEEDTICKS = EntityDataManager.createKey(EntityPrehistoricFloraLasanius.class, DataSerializers.VARINT);
	public BlockPos currentTarget;
	@SideOnly(Side.CLIENT)
	public ChainBuffer chainBuffer;
	private int animationTick;
	public Animation FEED_ANIMATION;
	public Animation currentAnimation;
	//private int feedTicks;
	private boolean isFeeding;

	public EntityPrehistoricFloraLasanius(World world) {
		super(world);
		setSize(0.3F, 0.15F);
		FEED_ANIMATION = Animation.create(getFeedLength());
	}

	public void onEntityUpdate()
	{
		super.onEntityUpdate();
		if (this.getShoalLeader() != null) {
			if (this.getShoalLeader() instanceof EntityPrehistoricFloraLasanius) {
				this.setFeedTicks(((EntityPrehistoricFloraLasanius)this.getShoalLeader()).getFeedTicks());
			}
		}
	}

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
	public boolean isSmall() {
		return true;
	}

	public static String getPeriod() {return "Silurian";}

	//public static String getHabitat() {return "Aquatic";}

	public int getFeedLength() {
		return 100;
	}

	@Override
	public void playLivingSound() {
	}

	@Override
	public boolean dropsEggs() {
		return true;
	}

	@Override
	protected float getAISpeedFish() {
		if (this.getAnimation() == this.FEED_ANIMATION) {return 0.00f;}
		return 0.158f;
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
		tasks.addTask(1, new ShoalFishBaseAI(this, 1, true));
		tasks.addTask(2, new FishWanderBottomDweller(this, NO_ANIMATION));
		this.targetTasks.addTask(0, new EatItemsEntityPrehistoricFloraFishBaseAI(this));
	}

	@Override
	public String[] getFoodOreDicts() {
		return ArrayUtils.addAll(DietString.FISHFOOD);
	}

	@Override
	public boolean attackEntityFrom(DamageSource source, float amount) {
		this.setFeedTicks(0);
		this.isFeeding = false;
		return super.attackEntityFrom(source, (amount * 0.85F));
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
		return
				super.isInWater()
						&& (this.world.getBlockState(this.getPosition().down()).getMaterial() == Material.SAND
						|| this.world.getBlockState(this.getPosition().down()).getMaterial() == Material.CORAL
							);
	}

	@Override
	public void onLivingUpdate() {
		super.onLivingUpdate();
		//this.renderYawOffset = this.rotationYaw;

		if (this.getAnimation() != NO_ANIMATION) {
			if (world.isRemote && animationTick >= currentAnimation.getDuration()) {
				this.setAnimation(NO_ANIMATION);
			}
		}
		if (this.getAnimation() != FEED_ANIMATION) {
			setFeeding(false);
		}
		if (!this.world.isRemote) {
			if (!(this.isInWater())) {
				setFeeding(false);
				this.setAnimation(NO_ANIMATION);
			}
			else {
				if ((!getIsFeeding()) && (isHungry()) && isInFeedingPosition()) {
					if (this.getAnimation() == NO_ANIMATION) {
						setFeeding(true);
						this.setFeedTicks(0);
						this.setAnimation(FEED_ANIMATION);
						//Restore some health:
						this.setHealth(Math.min(this.getHealth() + 0.5F, (float) this.getEntityAttribute(SharedMonsterAttributes.MAX_HEALTH).getBaseValue()));
						//System.err.println("Set Anim");
					}
				}
			}
		}
		if (!this.world.isRemote) {
			if ((!(getFeedTicks() > 0)) || getFeedTicks() > 3000) {
				setFeedTicks(0);
			}
			setFeedTicks(getFeedTicks() + rand.nextInt(3));

		}

		AnimationHandler.INSTANCE.updateAnimations(this);
	}

	public boolean isHungry() {
		return (this.getFeedTicks() > 500);
	}

	public boolean getIsFeeding() {
		return this.isFeeding;
	}

	public void setFeeding(boolean bool) {
		this.isFeeding = bool;
	}

	@Nullable
	protected ResourceLocation getLootTable() {
		return LepidodendronMod.LASANIUS_LOOT;
	}

	//Rendering taxidermy:
	//--------------------
	public static double offsetWall(@Nullable String variant) {
		return -0.05;
	}
	public static double upperfrontverticallinedepth(@Nullable String variant) {
		return 1.4;
	}
	public static double upperbackverticallinedepth(@Nullable String variant) {
		return 0.8;
	}
	public static double upperfrontlineoffset(@Nullable String variant) {
		return 0.4;
	}
	public static double upperfrontlineoffsetperpendiular(@Nullable String variant) {
		return -0F;
	}
	public static double upperbacklineoffset(@Nullable String variant) {
		return 0.4;
	}
	public static double upperbacklineoffsetperpendiular(@Nullable String variant) {
		return -0.15F;
	}
	public static double lowerfrontverticallinedepth(@Nullable String variant) {
		return 0.1;
	}
	public static double lowerbackverticallinedepth(@Nullable String variant) {
		return 0;
	}
	public static double lowerfrontlineoffset(@Nullable String variant) {
		return 0;
	}
	public static double lowerfrontlineoffsetperpendiular(@Nullable String variant) {
		return -0F;
	}
	public static double lowerbacklineoffset(@Nullable String variant) {
		return 0;
	}
	public static double lowerbacklineoffsetperpendiular(@Nullable String variant) {
		return -0F;
	}
	@SideOnly(Side.CLIENT)
	public static ResourceLocation textureDisplay(@Nullable String variant) {
		return RenderLasanius.TEXTURE;
	}
	@SideOnly(Side.CLIENT)
	public static ModelBase modelDisplay(@Nullable String variant) {
		return RenderDisplays.modelLasanius;
	}
	public static float getScaler(@Nullable String variant) {
		return RenderLasanius.getScaler();
	}

}

