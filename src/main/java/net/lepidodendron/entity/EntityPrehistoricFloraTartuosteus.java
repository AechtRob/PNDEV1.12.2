
package net.lepidodendron.entity;

import net.ilexiconn.llibrary.client.model.tools.ChainBuffer;
import net.ilexiconn.llibrary.server.animation.Animation;
import net.ilexiconn.llibrary.server.animation.AnimationHandler;
import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.ai.EatFishFoodAIFish;
import net.lepidodendron.entity.ai.EntityMateAIFishBase;
import net.lepidodendron.entity.ai.TartuosteusWander;
import net.lepidodendron.entity.base.EntityPrehistoricFloraFishBase;
import net.minecraft.block.material.Material;
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

import javax.annotation.Nullable;

public class EntityPrehistoricFloraTartuosteus extends EntityPrehistoricFloraFishBase {

	private static final DataParameter<Integer> FEEDTICKS = EntityDataManager.createKey(EntityPrehistoricFloraTartuosteus.class, DataSerializers.VARINT);
	private static final DataParameter<Integer> TAILTICKS = EntityDataManager.createKey(EntityPrehistoricFloraTartuosteus.class, DataSerializers.VARINT);
	private static final DataParameter<Integer> OFFSETTICKS = EntityDataManager.createKey(EntityPrehistoricFloraTartuosteus.class, DataSerializers.VARINT);
	public BlockPos currentTarget;
	@SideOnly(Side.CLIENT)
	public ChainBuffer chainBuffer;
	private int animationTick;
	public Animation FEED_ANIMATION;
	public Animation currentAnimation;
	//private int feedTicks;
	private boolean isFeeding;

	public EntityPrehistoricFloraTartuosteus(World world) {
		super(world);
		setSize(0.75F, 0.5F);
		experienceValue = 0;
		this.isImmuneToFire = false;
		setNoAI(!true);
		enablePersistence();
		FEED_ANIMATION = Animation.create(getFeedLength());
	}

	@Override
	public boolean isSmall() {
		return true;
	}

	public static String getPeriod() {return "Devonian";}

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
		float offsetThrust = 0;

		if (this.getOffsetTicks() > 65) {
			offsetThrust = (float) (0.2D * Math.sin(((((double)this.getOffsetTicks() - 65D) / 40D) * (Math.PI/360) * 360D)));
		}

		return 0.098f + offsetThrust;
	}

	@Override
	protected void entityInit() {
		super.entityInit();
		this.dataManager.register(FEEDTICKS, 0);
		this.dataManager.register(TAILTICKS, 0);
		this.dataManager.register(OFFSETTICKS, 0);
	}

	public int getTailTicks() {
		if (this.dataManager.get(TAILTICKS) == null) {
			this.setTailTicks(0);
			return 0;
		}
		return this.dataManager.get(TAILTICKS);
	}

	public void setTailTicks(int tailticks) {
		this.dataManager.set(TAILTICKS, tailticks);
	}

	public int getOffsetTicks() {
		if (this.dataManager.get(OFFSETTICKS) == null) {
			this.setOffsetTicks(0);
			return 0;
		}
		return this.dataManager.get(OFFSETTICKS);
	}

	public void setOffsetTicks(int offsetticks) {
		this.dataManager.set(OFFSETTICKS, offsetticks);
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
		compound.setInteger("TailTicks", this.getTailTicks());
		compound.setInteger("OffsetTicks", this.getOffsetTicks());
	}

	//@Override
	public void readEntityFromNBT(NBTTagCompound compound) {
		super.readEntityFromNBT(compound);
		this.setFeedTicks(compound.getInteger("FeedTicks"));
		this.setTailTicks(compound.getInteger("TailTicks"));
		this.setOffsetTicks(compound.getInteger("OffsetTicks"));
	}

	@Override
	protected boolean isBase() {
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
		tasks.addTask(1, new TartuosteusWander(this, NO_ANIMATION));
		this.targetTasks.addTask(0, new EatFishFoodAIFish(this));
	}

	@Override
	public boolean attackEntityFrom(DamageSource source, float amount) {
		this.setFeedTicks(0);
		this.isFeeding = false;
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
		return EnumCreatureAttribute.UNDEFINED;
	}

	@Override
	protected boolean canDespawn() {
		return false;
	}

	@Override
	protected void applyEntityAttributes() {
		super.applyEntityAttributes();
		this.getEntityAttribute(SharedMonsterAttributes.MAX_HEALTH).setBaseValue(6.0D);
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
					&& (this.world.getBlockState(this.getPosition().down()).getMaterial() != Material.WATER);
	}

	@Override
	public void onLivingUpdate() {
		super.onLivingUpdate();
		this.renderYawOffset = this.rotationYaw;

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

		if (!this.world.isRemote) {
			this.setOffsetTicks(this.getOffsetTicks() + 1);
			if (this.getOffsetTicks() > 105) {
				this.setOffsetTicks(0);
			}
			if (!this.getMoveHelper().isUpdating()) {
				this.setOffsetTicks(0);
			}
			this.setTailTicks(this.getTailTicks() + 1);
			if (this.getTailTicks() > 90 || this.getOffsetTicks() > 90) {
				this.setTailTicks(0);
			}
			if (!this.getMoveHelper().isUpdating()) {
				this.setTailTicks(0);
			}
		}

		AnimationHandler.INSTANCE.updateAnimations(this);
	}

	public boolean isHungry() {
		return (this.getFeedTicks() > 2000);
	}

	public boolean getIsFeeding() {
		return this.isFeeding;
	}

	public void setFeeding(boolean bool) {
		this.isFeeding = bool;
	}

	@Nullable
	protected ResourceLocation getLootTable() {
		return LepidodendronMod.TARTUOSTEUS_LOOT;
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
			if ( !world.isRemote) {
				//this.setAnimation(ATTACK_ANIMATION);
				//this.setAnimation(FEED_ANIMATION);
				SoundEvent soundevent = SoundEvents.ENTITY_GENERIC_EAT;
				this.getEntityWorld().playSound(null, this.getPosition(), soundevent, SoundCategory.BLOCKS, 1.0F, 1.0F);
			}
		}
	}
}

