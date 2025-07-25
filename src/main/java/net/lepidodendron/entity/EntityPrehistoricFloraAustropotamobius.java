
package net.lepidodendron.entity;

import com.google.common.base.Predicate;
import net.ilexiconn.llibrary.client.model.tools.ChainBuffer;
import net.ilexiconn.llibrary.server.animation.Animation;
import net.ilexiconn.llibrary.server.animation.AnimationHandler;
import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.block.base.IAdvancementGranter;
import net.lepidodendron.entity.ai.*;
import net.lepidodendron.entity.base.EntityPrehistoricFloraSwimmingBottomWalkingWaterBase;
import net.lepidodendron.entity.util.ITrappableWater;
import net.lepidodendron.util.CustomTrigger;
import net.lepidodendron.util.ModTriggers;
import net.minecraft.entity.*;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.network.datasync.DataParameter;
import net.minecraft.network.datasync.DataSerializers;
import net.minecraft.network.datasync.EntityDataManager;
import net.minecraft.util.DamageSource;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.util.math.Vec3d;
import net.minecraft.util.text.translation.I18n;
import net.minecraft.world.DifficultyInstance;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.FMLCommonHandler;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import org.apache.commons.lang3.ArrayUtils;

import javax.annotation.Nullable;

public class EntityPrehistoricFloraAustropotamobius extends EntityPrehistoricFloraSwimmingBottomWalkingWaterBase implements IAdvancementGranter, ITrappableWater {

	public Animation SWIM_ANIMATION;
	public Animation UNSWIM_ANIMATION;
	public BlockPos currentTarget;
	@SideOnly(Side.CLIENT)
	public ChainBuffer tailBuffer;
	@SideOnly(Side.CLIENT)
	public ChainBuffer chainBuffer;

	private static final DataParameter<Boolean> SWIMMINGPN = EntityDataManager.createKey(EntityPrehistoricFloraAustropotamobius.class, DataSerializers.BOOLEAN);
	//Needs to be here because it is not loaded in time to be accessed by the client if it's on the parent class!

	public EntityPrehistoricFloraAustropotamobius(World world) {
		super(world);
		setSize(0.2F, 0.2F);
		minWidth = 0.2F;
		maxWidth = 0.2F;
		maxHeight = 0.2F;
		maxHealthAgeable = 2.0D;
		SWIM_ANIMATION = Animation.create(this.swimTransitionLength());
		UNSWIM_ANIMATION = Animation.create(this.unswimTransitionLength());
		if (FMLCommonHandler.instance().getSide().isClient()) {
			tailBuffer = new ChainBuffer();
		}
	}

public static String getHabitat() {
        return I18n.translateToLocal("helper.pf_aquatic.name");
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
			} else {

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
	public EnumCreatureAttribute getCreatureAttribute() {
		return EnumCreatureAttribute.ARTHROPOD;
	}

	@Override
	public void onLivingUpdate() {
		super.onLivingUpdate();

		if (this.getAnimation() == ATTACK_ANIMATION && this.getAnimationTick() == 10 && this.getAttackTarget() != null) {
			launchAttack();
			if (this.getOneHit()) {
				this.setAttackTarget(null);
				this.setRevengeTarget(null);
			}
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
		return 0;
	}

	@Override
	public int walkLength() {
		return 1300;
	}

	@Override
	public boolean isSmall() {
		return true;
	}

	public static String getPeriod() {
		return "Early Cretaceous - Late Cretaceous - Paleogene - Neogene - Pleistocene - present";
	}

	//public static String getHabitat() {return "Aquatic";}

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
		return 0.1f;
	}

	@Override
	protected void applyEntityAttributes() {
		super.applyEntityAttributes();
		this.getAttributeMap().registerAttribute(SharedMonsterAttributes.ATTACK_DAMAGE);
		this.getEntityAttribute(SharedMonsterAttributes.ATTACK_DAMAGE).setBaseValue(1.5D);
		this.getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).setBaseValue(0.25D);
	}

	protected void initEntityAI() {
		tasks.addTask(0, new EntityMateAIAgeableBase(this, 1));
		tasks.addTask(1, new AttackAI(this, 1.0D, false, this.getAttackLength()));
		tasks.addTask(2, new SwimmingBottomWalkingSwimBottomDweller(this, NO_ANIMATION));
		tasks.addTask(3, new SwimmingBottomWalkingWalk(this, NO_ANIMATION));
		tasks.addTask(4, new EntityLookIdleAI(this));
		this.targetTasks.addTask(0, new EatItemsEntityPrehistoricFloraAgeableBaseAI(this, 1));
		//this.targetTasks.addTask(3, new HuntSmallerThanMeAIAgeable(this, EntityPrehistoricFloraAgeableFishBase.class, true, (Predicate<Entity>) entity -> entity instanceof EntityLivingBase, 0));
		this.targetTasks.addTask(1, new HuntForDietEntityPrehistoricFloraAgeableBaseAI(this, EntityLivingBase.class, true, (Predicate<Entity>) entity -> entity instanceof EntityLivingBase, 0.1F, 1.2F, false));
//		this.targetTasks.addTask(3, new HuntAI(this, EntitySquid.class, true, (Predicate<Entity>) entity -> entity instanceof EntityLivingBase));
//		this.targetTasks.addTask(3, new HuntAI(this, EntityPrehistoricFloraTrilobiteBottomBase.class, true, (Predicate<Entity>) entity -> entity instanceof EntityLivingBase));
//		this.targetTasks.addTask(3, new HuntAI(this, EntityPrehistoricFloraTrilobiteSwimBase.class, true, (Predicate<Entity>) entity -> entity instanceof EntityLivingBase));
	}



	@Override
	public String[] getFoodOreDicts() {
		return ArrayUtils.addAll(DietString.FISH, DietString.MEAT);
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


	@Nullable
	protected ResourceLocation getLootTable() {
		return LepidodendronMod.AUSTROPOTAMOBIUS_LOOT;
	}
	//Rendering taxidermy:
	//--------------------

    @Nullable
    @Override
    public CustomTrigger getModTrigger() {
        return ModTriggers.CLICK_AUSTROPOTAMOBIUS;
    }
}