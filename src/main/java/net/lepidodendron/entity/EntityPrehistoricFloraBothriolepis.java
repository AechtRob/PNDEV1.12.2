
package net.lepidodendron.entity;

import com.google.common.base.Predicate;
import net.ilexiconn.llibrary.client.model.tools.ChainBuffer;
import net.ilexiconn.llibrary.server.animation.AnimationHandler;
import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.block.base.IAdvancementGranter;
import net.lepidodendron.entity.ai.*;
import net.lepidodendron.entity.base.EntityPrehistoricFloraSwimmingBottomWalkingWaterBase;
import net.lepidodendron.entity.render.entity.RenderAegirosaurus;
import net.lepidodendron.entity.render.entity.RenderBothriolepis;
import net.lepidodendron.entity.render.tile.RenderDisplays;
import net.lepidodendron.entity.util.ITrappableWater;
import net.lepidodendron.util.CustomTrigger;
import net.lepidodendron.util.ModTriggers;
import net.minecraft.client.model.ModelBase;
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

import javax.annotation.Nullable;

public class EntityPrehistoricFloraBothriolepis extends EntityPrehistoricFloraSwimmingBottomWalkingWaterBase implements IAdvancementGranter, ITrappableWater {

	public BlockPos currentTarget;
	@SideOnly(Side.CLIENT)
	public ChainBuffer chainBuffer;
	public ChainBuffer tailBuffer;

	private static final DataParameter<Boolean> SWIMMINGPN = EntityDataManager.createKey(EntityPrehistoricFloraSwimmingBottomWalkingWaterBase.class, DataSerializers.BOOLEAN);
	//Needs to be here because it is not loaded in time to be accessed by the client if it's on the parent class!

	public EntityPrehistoricFloraBothriolepis(World world) {
		super(world);
		setSize(0.6F, 0.2F);
		minWidth = 0.1F;
		maxWidth = 0.6F;
		maxHeight = 0.2F;
		maxHealthAgeable = 8.0D;
		if (FMLCommonHandler.instance().getSide().isClient()) {
			tailBuffer = new ChainBuffer();
		}
	}

	public static String getHabitat() {
		return I18n.translateToLocal("helper.pf_aquatic.name");
	}

	@Override
	public void onUpdate() {
		super.onUpdate();
		if (world.isRemote && !this.isAIDisabled()) {
			tailBuffer.calculateChainSwingBuffer(60, 10, 5F, this);
		}
	}

	public boolean isReallySwimming() {
		return (this.getIsSwimming());
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
					this.setWalkTick(this.walkLength());
				}

				if ((!(this.getWalkTick() > 0)) && !this.getIsSwimming()) {
					this.setIsSwimming(true);
					this.setSwimTick(this.swimLength());
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

	@Override
	public boolean attackEntityFrom(DamageSource source, float amount) {
		if (!this.world.isRemote && !this.isReallySwimming()) {
			this.setIsSwimming(true);
			this.setSwimTick(this.swimLength());
		}
		if (source != DamageSource.DROWN) {
			return super.attackEntityFrom(source, (amount * 0.5F));
		}
		return super.attackEntityFrom(source, amount);
	}

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
	public boolean canShoal() {
		return false;
	}

	@Override
	public boolean isSmall() {
		return true;
	}

	public static String getPeriod() {return "Devonian";}

	@Override
	public void playLivingSound() {
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
	public int getAdultAge() {
		return 0;
	} //Only adults!

	@Override
	protected double getAISpeedSwim() {
		if (!this.isReallySwimming()) {
			if (this.getIsFast()) {
				return 0.1F;
			}
			return 0.2f;
		} else {
			if (this.getIsFast()) {
				return 0.3F;
			}
			return 0.2f;
		}
	}

	@Override
	public int swimTransitionLength() {
		return 0;
	}

	@Override
	public int unswimTransitionLength() {
		return 0;
	}

	@Override
	public int getAttackLength() {
		return 15;
	}


	protected void initEntityAI() {
		tasks.addTask(0, new EntityMateAIAgeableBase(this, 1.0D));
		tasks.addTask(1, new AttackAI(this, 1.0D, false, this.getAttackLength()));
		tasks.addTask(2, new SwimmingBottomWalkingSwimBottomDweller(this, NO_ANIMATION));
		tasks.addTask(3, new SwimmingBottomWalkingWalk(this, NO_ANIMATION));
		this.targetTasks.addTask(0, new EatItemsEntityPrehistoricFloraAgeableBaseAI(this, 1));
		this.targetTasks.addTask(1, new HuntForDietEntityPrehistoricFloraAgeableBaseAI(this, EntityLivingBase.class, true, (Predicate<Entity>) entity -> entity instanceof EntityLivingBase, 0.1F, 1.2F, false));//		this.targetTasks.addTask(1, new HuntSmallerThanMeAIAgeable(this, EntityPrehistoricFloraAgeableFishBase.class, true, (Predicate<Entity>) entity -> entity instanceof EntityLivingBase, 0));
//		this.targetTasks.addTask(1, new HuntAI(this, EntityPrehistoricFloraFishBase.class, true, (Predicate<Entity>) entity -> entity instanceof EntityLivingBase));
//		this.targetTasks.addTask(1, new HuntAI(this, EntitySquid. class, true, (Predicate<Entity>) entity -> entity instanceof EntityLivingBase));
	}

	@Override
	public String[] getFoodOreDicts() {
		return DietString.FISH;
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
		this.getEntityAttribute(SharedMonsterAttributes.ATTACK_DAMAGE).setBaseValue(4D);
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

	@Override
	public void onLivingUpdate() {
		super.onLivingUpdate();
		//this.renderYawOffset = this.rotationYaw;

		//System.err.println(this.getAnimationTick());
		if (this.getAnimation() == ATTACK_ANIMATION && this.getAnimationTick() == 5 && this.getAttackTarget() != null) {
			launchAttack();
		}

		AnimationHandler.INSTANCE.updateAnimations(this);
	}

	@Override
	public boolean attackEntityAsMob(Entity entity) {
		if (this.getAnimation() == NO_ANIMATION) {
			this.setAnimation(ATTACK_ANIMATION);
			//System.err.println("set attack");
		}
		return false;
	}

	@Override
	public int swimLength() {
		return 900;
	}

	@Override
	public int walkLength() {
		return 1600;
	}

	@Override
	public float getAgeScale() {
		return 1;
	}

	public boolean isDirectPathBetweenPoints(Vec3d vec1, Vec3d vec2) {
		RayTraceResult movingobjectposition = this.world.rayTraceBlocks(vec1, new Vec3d(vec2.x, vec2.y, vec2.z), false, true, false);
		return movingobjectposition == null || movingobjectposition.typeOfHit != RayTraceResult.Type.BLOCK;
	}

	@Nullable
	protected ResourceLocation getLootTable() {
		return LepidodendronMod.BOTHRIOLEPIS_LOOT;
	}

    //Rendering taxidermy:
    //--------------------
    public static double offsetWall(@Nullable String variant) {
        return -0.225;
    }
    public static double upperfrontverticallinedepth(@Nullable String variant) {
        return 0;
    }
    public static double upperbackverticallinedepth(@Nullable String variant) {
        return 0.0;
    }
    public static double upperfrontlineoffset(@Nullable String variant) {
        return 0.0;
    }
    public static double upperfrontlineoffsetperpendiular(@Nullable String variant) {        return 0.04;    }
    public static double upperbacklineoffset(@Nullable String variant) {        return 0.0;}
    public static double upperbacklineoffsetperpendiular(@Nullable String variant) {
        return 0.0;
    }
    public static double lowerfrontverticallinedepth(@Nullable String variant) {
        return 0.4;
    }
    public static double lowerbackverticallinedepth(@Nullable String variant) {
        return 0;
    }
    public static double lowerfrontlineoffset(@Nullable String variant) {return -0.;}
    public static double lowerfrontlineoffsetperpendiular(@Nullable String variant) {
        return -0.0;
    }
    public static double lowerbacklineoffset(@Nullable String variant) {
        return -0.;
    }
    public static double lowerbacklineoffsetperpendiular(@Nullable String variant) {
        return 0.;
    }
    @SideOnly(Side.CLIENT)
    public static ResourceLocation textureDisplay(@Nullable String variant) { return RenderBothriolepis.TEXTURE;
    }
    @SideOnly(Side.CLIENT)
    public static ModelBase modelDisplay(@Nullable String variant) {
        return RenderDisplays.modelBothriolepis;
    }
    public static float getScaler(@Nullable String variant) {
        return RenderBothriolepis.getScaler();
    }

	@Nullable
	@Override
	public CustomTrigger getModTrigger() {
		return ModTriggers.CLICK_BOTHRIOLEPIS;
	}


}

