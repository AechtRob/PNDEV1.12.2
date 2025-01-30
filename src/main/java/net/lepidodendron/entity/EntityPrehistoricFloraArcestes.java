
package net.lepidodendron.entity;

import net.ilexiconn.llibrary.client.model.tools.ChainBuffer;
import net.ilexiconn.llibrary.server.animation.Animation;
import net.ilexiconn.llibrary.server.animation.AnimationHandler;
import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.block.base.IAdvancementGranter;
import net.lepidodendron.entity.ai.*;
import net.lepidodendron.entity.base.EntityPrehistoricFloraSwimmingBottomWalkingWaterBase;
import net.lepidodendron.entity.render.entity.RenderAcheronauta;
import net.lepidodendron.entity.render.entity.RenderArcestes;
import net.lepidodendron.entity.render.tile.RenderDisplays;
import net.lepidodendron.entity.util.EnumCreatureAttributePN;
import net.lepidodendron.entity.util.ITrappableWater;
import net.lepidodendron.item.entities.ItemNautiloidEggsProteroctopus;
import net.lepidodendron.util.CustomTrigger;
import net.lepidodendron.util.ModTriggers;
import net.minecraft.client.model.ModelBase;
import net.minecraft.entity.IEntityLivingData;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.network.datasync.DataParameter;
import net.minecraft.network.datasync.DataSerializers;
import net.minecraft.network.datasync.EntityDataManager;
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

public class EntityPrehistoricFloraArcestes extends EntityPrehistoricFloraSwimmingBottomWalkingWaterBase implements ITrappableWater, IAdvancementGranter {

	public Animation SWIM_ANIMATION;
	public Animation UNSWIM_ANIMATION;
	public BlockPos currentTarget;
	@SideOnly(Side.CLIENT)
	public ChainBuffer tailBuffer;
	@SideOnly(Side.CLIENT)
	public ChainBuffer chainBuffer;

	private static final DataParameter<Boolean> SWIMMINGPN = EntityDataManager.createKey(EntityPrehistoricFloraArcestes.class, DataSerializers.BOOLEAN);
	//Needs to be here because it is not loaded in time to be accessed by the client if it's on the parent class!

	public EntityPrehistoricFloraArcestes(World world) {
		super(world);
		setSize(0.3F, 0.2F);
		minWidth = 0.1F;
		maxWidth = 0.3F;
		maxHeight = 0.2F;
		maxHealthAgeable = 4.0D;
		SWIM_ANIMATION = Animation.create(this.swimTransitionLength());
		UNSWIM_ANIMATION = Animation.create(this.unswimTransitionLength());
		if (FMLCommonHandler.instance().getSide().isClient()) {
			tailBuffer = new ChainBuffer();
		}
	}

	//an array of all the animations
	@Override
	public Animation[] getAnimations() {
		return new Animation[]{ATTACK_ANIMATION, ROAR_ANIMATION, LAY_ANIMATION, EAT_ANIMATION, SWIM_ANIMATION, UNSWIM_ANIMATION};
	}

	//a stricter check on if the animal is swimming, (It is not doing its transition animation)
	public boolean isReallySwimming() {
		return (this.getIsSwimming()) && (this.getAnimation() != this.SWIM_ANIMATION);
	}

	@Override
	public boolean attackEntityFrom(DamageSource source, float amount) {
		if (!this.world.isRemote && !this.isReallySwimming()) {
			this.setIsSwimming(true);
			this.setAnimation(SWIM_ANIMATION);
			this.setSwimTick(this.swimLength() + this.SWIM_ANIMATION.getDuration());
		}

		return super.attackEntityFrom(source, amount);
	}

	public void onEntityUpdate() {

		int i = this.getAir();
		super.onEntityUpdate();

		if (this.isEntityAlive() && !isInWater()) {
			--i;
			this.setAir(i);

			if (this.getAir() == -20) {
				this.setAir(0);
				this.attackEntityFrom(DamageSource.DROWN, 2.0F);
			}
		} else {
			this.setAir(300);
		}

		if (!world.isRemote) {

			if (!this.isReallyInWater()) {
				this.setIsSwimming(false);
				this.setWalkTick(1);
			}
			else {

				if (this.getSwimTick() > 0) {
					this.setSwimTick(this.getSwimTick() - this.rand.nextInt(3));
					if (this.getSwimTick() < 0) {
						this.setSwimTick(0);
					}
				}
				if (this.getWalkTick() > 0) {
					this.setWalkTick(this.getWalkTick() - this.rand.nextInt(3));
					if (this.getWalkTick() < 0) {
						this.setWalkTick(0);
					}
				}

				if ((!(this.getSwimTick() > 0)) && this.getIsSwimming()) {
					this.setIsSwimming(false);
					this.setAnimation(UNSWIM_ANIMATION);
					this.setWalkTick(this.walkLength() + this.UNSWIM_ANIMATION.getDuration());
				}

				if ((!(this.getWalkTick() > 0)) && !this.getIsSwimming()) {
					this.setIsSwimming(true);
					this.setAnimation(SWIM_ANIMATION);
					this.setSwimTick(this.swimLength() + this.SWIM_ANIMATION.getDuration());
				}
			}

			//System.err.println("IsSwimming: " + this.isReallySwimming() + " walkTick " + this.getWalkTick() + " swimTick " + this.getSwimTick());

		}

	}

	@Override
	protected void entityInit() {
		super.entityInit();
		this.dataManager.register(SWIMMINGPN, false);
		this.setScaleForAge(false);
	}

	@Override
	public IEntityLivingData onInitialSpawn(DifficultyInstance difficulty, @Nullable IEntityLivingData livingdata) {
		livingdata = super.onInitialSpawn(difficulty, livingdata);
		this.setIsSwimming(false);
		return livingdata;
	}

	public void writeEntityToNBT(NBTTagCompound compound) {
		super.writeEntityToNBT(compound);
		compound.setBoolean("pfswimming", this.getIsSwimming());
	}

	public void readEntityFromNBT(NBTTagCompound compound) {
		super.readEntityFromNBT(compound);
		this.setIsSwimming(compound.getBoolean("pfswimming"));
	}

	//checks if the animal is actually swimming
	@Override
	public boolean getIsSwimming() {
		return (Boolean)this.dataManager.get(SWIMMINGPN);
	}

	//sets the animal isSwimming variable to true if the data manager detects that the animal is swimming
	@Override
	public void setIsSwimming(boolean isSwimming) {
		this.dataManager.set(SWIMMINGPN, isSwimming);
	}


	@Override
	public EnumCreatureAttributePN getPNCreatureAttribute() {
		return EnumCreatureAttributePN.INVERTEBRATE;
	}

	@Override
	public void onLivingUpdate() {
		super.onLivingUpdate();

		if (this.getAnimation() == ATTACK_ANIMATION && this.getAnimationTick() == 10 && this.getAttackTarget() != null) {
			launchAttack();
		}

		AnimationHandler.INSTANCE.updateAnimations(this);

	}

	@Override
	public void onUpdate() {
		super.onUpdate();
		if (world.isRemote && !this.isAIDisabled()) {
			tailBuffer.calculateChainSwingBuffer(120, 10, 5F, this);
		}
	}

	@Override
	public int swimTransitionLength() {
		return 20;
	}

	@Override
	public int unswimTransitionLength() {
		return 20;
	}

	@Override
	public int swimLength() {
		return 1200;
	}

	@Override
	public int walkLength() {
		return 1200;
	}

	@Override
	public boolean isSmall() {
		return true;
	}

	public static String getPeriod() {return "Triassic";}

	public static String getHabitat() {return "Aquatic";}

	@Override
	public boolean dropsEggs() {
		return true;
	}
	
	@Override
	public boolean laysEggs() {
		return false;
	}

	@Override
	public int getAdultAge() {
		return 48000;
	}

	@Override
	protected double getAISpeedSwim() {
		if (!this.isReallySwimming()) {
			return 0.07f;
		} else {
			return 0.12f;
		}
	}

	protected void initEntityAI() {
		tasks.addTask(0, new EntityMateAIAgeableBase(this, 1));
		tasks.addTask(1, new SwimmingBottomWalkingSwimBottomDweller(this, NO_ANIMATION));
		tasks.addTask(2, new SwimmingBottomWalkingWalk(this, NO_ANIMATION));
		tasks.addTask(3, new EntityLookIdleAI(this));
		this.targetTasks.addTask(0, new EatItemsEntityPrehistoricFloraAgeableBaseAI(this, 1));
	}

	@Override
	public String[] getFoodOreDicts() {
		return ArrayUtils.addAll(DietString.FISHFOOD);
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
	public ItemStack getPropagule() {
		return new ItemStack(ItemNautiloidEggsProteroctopus.block, (int) (1));
	}

	@Nullable
	protected ResourceLocation getLootTable() {
		if (!this.isPFAdult()) {
			return LepidodendronMod.ARCESTES_LOOT_YOUNG;
		}
		return LepidodendronMod.ARCESTES_LOOT;
	}

	@Nullable
	@Override
	public CustomTrigger getModTrigger() {
		return ModTriggers.CLICK_ARCESTES;
	}

	//Rendering taxidermy:
	//--------------------
	public static double offsetWall(@Nullable String variant) {
		return -1.36;
	}
	public static double upperfrontverticallinedepth(@Nullable String variant) {
		return 0.0;
	}
	public static double upperbackverticallinedepth(@Nullable String variant) {
		return 0.37;
	}
	public static double upperfrontlineoffset(@Nullable String variant) {
		return 0.0;
	}
	public static double upperfrontlineoffsetperpendiular(@Nullable String variant) {
		return 0.0F;
	}
	public static double upperbacklineoffset(@Nullable String variant) {
		return 0.0;
	}
	public static double upperbacklineoffsetperpendiular(@Nullable String variant) {
		return 0.0F;
	}
	public static double lowerfrontverticallinedepth(@Nullable String variant) {
		return 0.0;
	}
	public static double lowerbackverticallinedepth(@Nullable String variant) {
		return 0.1;
	}
	public static double lowerfrontlineoffset(@Nullable String variant) {
		return 0.0;
	}
	public static double lowerfrontlineoffsetperpendiular(@Nullable String variant) {
		return -0.0F;
	}
	public static double lowerbacklineoffset(@Nullable String variant) {
		return -0.0;
	}
	public static double lowerbacklineoffsetperpendiular(@Nullable String variant) {
		return 0.07F;
	}
	@SideOnly(Side.CLIENT)
	public static ResourceLocation textureDisplay(@Nullable String variant) {
		return RenderArcestes.TEXTURE;
	}
	@SideOnly(Side.CLIENT)
	public static ModelBase modelDisplay(@Nullable String variant) {
		return RenderDisplays.modelArcestes;
	}
	public static float getScaler(@Nullable String variant) {
		return RenderArcestes.getScaler();
	}
	public static float widthSupport(@Nullable String variant) {return 0.02F;}


}
