
package net.lepidodendron.entity;

import net.ilexiconn.llibrary.client.model.tools.ChainBuffer;
import net.ilexiconn.llibrary.server.animation.Animation;
import net.ilexiconn.llibrary.server.animation.AnimationHandler;
import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.block.base.IAdvancementGranter;
import net.lepidodendron.entity.ai.*;
import net.lepidodendron.entity.base.EntityPrehistoricFloraTrilobiteBottomBase;
import net.lepidodendron.entity.render.entity.RenderAmphicentrum;
import net.lepidodendron.entity.render.entity.RenderCarbotubulus;
import net.lepidodendron.entity.render.tile.RenderDisplays;
import net.lepidodendron.entity.util.EnumCreatureAttributePN;
import net.lepidodendron.entity.util.ITrappableWater;
import net.lepidodendron.util.CustomTrigger;
import net.lepidodendron.util.ModTriggers;
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

public class EntityPrehistoricFloraCarbotubulus extends EntityPrehistoricFloraTrilobiteBottomBase implements ITrappableWater, IAdvancementGranter {

	public BlockPos currentTarget;
	@SideOnly(Side.CLIENT)
	public ChainBuffer chainBuffer;
	private int animationTick;
	private Animation animation = NO_ANIMATION;
	public Animation LOOK_ANIMATION;
	private Animation currentAnimation;

	private static final DataParameter<Integer> LOOKTICK = EntityDataManager.createKey(EntityPrehistoricFloraCarbotubulus.class, DataSerializers.VARINT);

	public EntityPrehistoricFloraCarbotubulus(World world) {
		super(world);
		setSize(0.15F, 0.15F);
		LOOK_ANIMATION = Animation.create(170);
	}

	@Override
	public EnumCreatureAttributePN getPNCreatureAttribute() {
		return EnumCreatureAttributePN.INVERTEBRATE;
	}

	@Override
	public boolean isSmall() {
		return true;
	}

	public static String getPeriod() {return "Carboniferous";}

	//public static String getHabitat() {return "Aquatic";}

	@Override
	public void playLivingSound() {
	}

	@Override
	public boolean dropsEggs() {
		return true;
	}

	public int getLookTick() {
		if (this.dataManager.get(LOOKTICK) == null) {
			setLookTick(0);
		}
		return (this.dataManager.get(LOOKTICK));
	}

	public void setLookTick(int lookTick) {
		this.dataManager.set(LOOKTICK, lookTick);
	}

	@Override
	protected void entityInit() {
		super.entityInit();
		this.dataManager.register(LOOKTICK, 0);
	}

	public void writeEntityToNBT(NBTTagCompound compound)
	{
		super.writeEntityToNBT(compound);
		compound.setInteger("lookTicks", this.getLookTick());
	}

	public void readEntityFromNBT(NBTTagCompound compound) {
		super.readEntityFromNBT(compound);
		this.setLookTick(compound.getInteger("lookTicks"));
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
		return new Animation[]{LOOK_ANIMATION};
	}

	@Override
	protected float getAISpeedTrilobite() {
		if (this.getAnimation() == LOOK_ANIMATION) {
			return 0;
		}
		return 0.05f;
		//return 0;
	}

	protected void initEntityAI() {
		tasks.addTask(0, new EntityMateAITrilobiteBottomBase(this, 1));
		tasks.addTask(1, new TrilobiteWanderBottom(this, NO_ANIMATION));
		tasks.addTask(2, new EntityLookIdleAI(this));
		this.targetTasks.addTask(0, new EatItemsEntityPrehistoricFloraTrilobiteBottomBaseAI(this));
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
		this.getEntityAttribute(SharedMonsterAttributes.MAX_HEALTH).setBaseValue(1.0D);
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

		//if (this.getAnimation() != NO_ANIMATION) {
			//animationTick++;
			//System.err.println("Anim duration: " + currentAnimation.getDuration());
			//System.err.println("Anim tick: " + animationTick);
		//	if (world.isRemote && animationTick >= currentAnimation.getDuration()) {
		//		this.setAnimation(NO_ANIMATION);
		//	}
		//}

		if (this.getLookTick() == 700 && this.currentAnimation == NO_ANIMATION) {
			this.setAnimation(LOOK_ANIMATION);
			this.setLookTick((int) Math.round(Math.random() * 700D));
		}

		if ((!(this.getLookTick() >= 0)) || this.getLookTick() > 1005) {
			setLookTick(0);
		}
		setLookTick(getLookTick() + rand.nextInt(3));

		AnimationHandler.INSTANCE.updateAnimations(this);
	}


	@Nullable
	protected ResourceLocation getLootTable() {
		return LepidodendronMod.CARBOTUBULUS_LOOT;
	}

	//Rendering taxidermy:
	//--------------------
	public static double offsetWall(@Nullable String variant) {return -0.45;}
	public static double upperfrontverticallinedepth(@Nullable String variant) {return 0.0;}
	public static double upperbackverticallinedepth(@Nullable String variant) {return 0.0;}
	public static double upperfrontlineoffset(@Nullable String variant) {return 0.0;}
	public static double upperfrontlineoffsetperpendiular(@Nullable String variant) {return 0.0;}
	public static double upperbacklineoffset(@Nullable String variant) {return 0.0;}
	public static double upperbacklineoffsetperpendiular(@Nullable String variant) {return 0.0;}
	public static double lowerfrontverticallinedepth(@Nullable String variant) {return 0.0;}
	public static double lowerbackverticallinedepth(@Nullable String variant) {return 0.0;}
	public static double lowerfrontlineoffset(@Nullable String variant) {return 0.0;}
	public static double lowerfrontlineoffsetperpendiular(@Nullable String variant) {return -0.0;}
	public static double lowerbacklineoffset(@Nullable String variant) {return 0.0;}
	public static double lowerbacklineoffsetperpendiular(@Nullable String variant) {return 0.0;}
	@SideOnly(Side.CLIENT)
	public static ResourceLocation textureDisplay(@Nullable String variant) {return RenderCarbotubulus.TEXTURE;}
	@SideOnly(Side.CLIENT)
	public static ModelBase modelDisplay(@Nullable String variant) {return RenderDisplays.modelCarbotubulus;}
	public static float getScaler(@Nullable String variant) {return RenderCarbotubulus.getScaler();}
	public static float widthSupport(@Nullable String variant) {return 0.03F;}

	@Nullable
	@Override
	public CustomTrigger getModTrigger() {
		return ModTriggers.CLICK_CARBOTUBULUS;
	}
}