
package net.lepidodendron.entity;

import net.ilexiconn.llibrary.client.model.tools.ChainBuffer;
import net.ilexiconn.llibrary.server.animation.Animation;
import net.ilexiconn.llibrary.server.animation.AnimationHandler;
import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.block.base.IAdvancementGranter;
import net.lepidodendron.entity.ai.*;
import net.lepidodendron.entity.base.EntityPrehistoricFloraAgeableBase;
import net.lepidodendron.entity.base.EntityPrehistoricFloraLandBase;
import net.lepidodendron.entity.render.entity.RenderBeipiaosaurus;
import net.lepidodendron.entity.render.tile.RenderDisplays;
import net.lepidodendron.entity.util.IScreamer;
import net.lepidodendron.entity.util.ITrappableLand;
import net.lepidodendron.util.CustomTrigger;
import net.lepidodendron.util.Functions;
import net.lepidodendron.util.ModTriggers;
import net.minecraft.block.BlockDirectional;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.PropertyDirection;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.model.ModelBase;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.EnumCreatureAttribute;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.DamageSource;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.FMLCommonHandler;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import org.apache.commons.lang3.ArrayUtils;

import javax.annotation.Nullable;
import java.util.List;

public class EntityPrehistoricFloraBeipiaosaurus extends EntityPrehistoricFloraLandBase implements IAdvancementGranter, IScreamer, ITrappableLand {

	public BlockPos currentTarget;
	@SideOnly(Side.CLIENT)
	public ChainBuffer tailBuffer;
	public int ambientSoundTime;
	private boolean screaming;
	private int alarmCooldown;
	public Animation STAND_ANIMATION;
	private int standCooldown;
    public Animation ALERT_ANIMATION;


	public EntityPrehistoricFloraBeipiaosaurus(World world) {
		super(world);
		setSize(0.85F, 1.85F);
		minWidth = 0.2F;
		maxWidth = 0.85F;
		maxHeight = 1.1F;
		maxHealthAgeable = 55.0D;
		STAND_ANIMATION = Animation.create(60);
        ALERT_ANIMATION = Animation.create(60);
		if (FMLCommonHandler.instance().getSide().isClient()) {
			tailBuffer = new ChainBuffer();
		}
	}

	@Override
	public void onUpdate() {
		super.onUpdate();
		if (world.isRemote && !this.isAIDisabled()) {
			tailBuffer.calculateChainSwingBuffer(120, 10, 5F, this);
		}

//		if (world.isRemote) {
//			System.err.println(Math.sin((float)this.getTicks() / 100F));
//		}

	}

	@Override
	public int getEggType(@Nullable String PNType) {
		return 1; //medium
	}

	@Override
	public int getDrinkLength() {
		return 280;
	}

	@Override
	public int getEatLength() {
		return 20;
	}

	public static String getPeriod() {return "Early Cretaceous";}

	public static String getHabitat() {return "Terrestrial";}

	@Override
	public boolean hasNest() {
		return true;
	}

	@Override
	public boolean hasAlarm() {
		return true;
	}

	@Override
	public int getAttackLength() {
		return 18;
	}

	@Override
	public String getTexture() {
		return this.getTexture();
	}

	@Override
	public boolean dropsEggs() {
		return false;
	}

	@Override
	public boolean laysEggs() {
		return true;
	}

	public float getAISpeedLand() {
		float speedBase = 0.58F;
		if (this.getTicks() < 0) {
			return 0.0F; //Is laying eggs
		}
		if (this.getAnimation() == DRINK_ANIMATION || this.getAnimation() == MAKE_NEST_ANIMATION || this.getAnimation() == GRAZE_ANIMATION || this.getAnimation() == ALERT_ANIMATION || this.getAnimation() == STAND_ANIMATION) {
			return 0.0F;
		}
		if (this.getIsFast()) {
			speedBase = speedBase * 3.55F;
		}
		return speedBase * 0.67F;
	}
    @Override
    public Animation[] getAnimations() {
        return new Animation[]{ATTACK_ANIMATION, ROAR_ANIMATION, MAKE_NEST_ANIMATION, LAY_ANIMATION, EAT_ANIMATION, STAND_ANIMATION, ALERT_ANIMATION};
    }
	@Override
	public int getRoarLength() {
		return 60;
	}
	@Override
	public int getTalkInterval() {
		return 180;
	}

	@Override
	public int getAdultAge() {
		return 64000;
	}

	public AxisAlignedBB getAttackBoundingBox() {
		float size = this.getRenderSizeModifier() * 0.25F;
		return this.getEntityBoundingBox().grow(1.0F + size, 1.0F + size, 1.0F + size);
	}

	@Override
	public float getEyeHeight()
	{
		return Math.max(super.getEyeHeight(), this.height * 0.95F);
	}

	protected void initEntityAI() {
		tasks.addTask(0, new EntityMateAIAgeableBase(this, 1.0D));
		tasks.addTask(1, new EntityTemptAI(this, 1, false, true, (float) this.getEntityAttribute(SharedMonsterAttributes.ATTACK_DAMAGE).getAttributeValue() * 0.33F));
		tasks.addTask(2, new LandEntitySwimmingAI(this, 0.75, false));
		tasks.addTask(3, new AttackAI(this, 1.0D, false, this.getAttackLength()));
		tasks.addTask(4, new PanicScreamAI(this, 1.0));
		tasks.addTask(5, new LandWanderNestAI(this));
		tasks.addTask(6, new LandWanderFollowParent(this, 1.05D));
		tasks.addTask(7, new LandWanderAvoidWaterAI(this, 1.0D, 40));
		tasks.addTask(8, new EntityWatchClosestAI(this, EntityPlayer.class, 6.0F));
		tasks.addTask(9, new EntityWatchClosestAI(this, EntityPrehistoricFloraAgeableBase.class, 8.0F));
		tasks.addTask(10, new EntityLookIdleAI(this));
		this.targetTasks.addTask(0, new EatItemsEntityPrehistoricFloraAgeableBaseAI(this, 1));
		this.targetTasks.addTask(1, new EntityHurtByTargetSmallerThanMeAI(this, false));
		//this.targetTasks.addTask(2, new HuntForDietEntityPrehistoricFloraAgeableBaseAI(this, EntityLivingBase.class, true, (Predicate<Entity>) entity -> entity instanceof EntityLivingBase, 0.1F, 1.2F, false));
	}

	@Override
	public String[] getFoodOreDicts() {
		return ArrayUtils.addAll(DietString.PLANTS);
	}

	@Override
	public boolean panics() {
		return true;
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
	public void onEntityUpdate() {
		super.onEntityUpdate();

		if (this.alarmCooldown > 0) {
			this.alarmCooldown -= 1;
		}
		if (this.getScreaming() && alarmCooldown <= 0) {
			this.playAlarmSound();
		}

		//Sometimes stand up and look around:
        if ((!this.world.isRemote) && this.getEatTarget() == null && this.getAttackTarget() == null && this.getRevengeTarget() == null && this.getAlarmTarget() == null
                && !this.getIsMoving() && this.getAnimation() == NO_ANIMATION && standCooldown == 0) {
            int num = this.rand.nextInt(10);

            if (num < 5) {
                this.setAnimation(STAND_ANIMATION);
            } else {
                this.setAnimation(ALERT_ANIMATION);
            }
        }
		//forces animation to return to base pose by grabbing the last tick and setting it to that.
		if ((!this.world.isRemote) && this.getAnimation() == STAND_ANIMATION
				&& (this.getAnimationTick() == STAND_ANIMATION.getDuration() - 1) || this.isReallyInWater()) {
			this.standCooldown = 2000;
			this.setAnimation(NO_ANIMATION);
		}
        if ((!this.world.isRemote) && this.getAnimation() == ALERT_ANIMATION
                && (this.getAnimationTick() == ALERT_ANIMATION.getDuration() - 1) || this.isReallyInWater()) {
            this.standCooldown = 3000;
            this.setAnimation(NO_ANIMATION);
        }

	}

	@Override
	protected void applyEntityAttributes() {
		super.applyEntityAttributes();
		this.getAttributeMap().registerAttribute(SharedMonsterAttributes.ATTACK_DAMAGE);
		this.getEntityAttribute(SharedMonsterAttributes.ATTACK_DAMAGE).setBaseValue(9.0D);
		this.getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).setBaseValue(0.25D);
	}
    private boolean isDrinkable(World world, BlockPos pos, EnumFacing facing) {
        int x = 3;
        int y = 3;
        for (int xx = 0; xx < x; xx++) {
            for (int yy = 0; yy < y; yy++) {
                if (world.getBlockState(pos.offset(facing, xx).up(yy)).getBlock().causesSuffocation(world.getBlockState(pos.offset(facing, xx).up(yy)))) {
                    return false;
                }
            }
        }
        return true;
    }
    @Override
    public boolean isDrinking()
    {
        if (!this.isPFAdult()) {
            return false;
        }

        BlockPos entityPos = Functions.getEntityBlockPos(this);

        boolean test2 = false;
        boolean test = (this.getPFDrinking() <= 0
                && !world.isRemote
                && !this.getIsFast()
                //&& !this.getIsMoving()
                && this.DRINK_ANIMATION.getDuration() > 0
                && this.getAnimation() == NO_ANIMATION
                && !this.isReallyInWater()
                &&
                (
                        (this.world.getBlockState(entityPos.north().up(2)).getMaterial() == Material.PLANTS
                                && isDrinkable(this.world, entityPos, EnumFacing.NORTH))

                                || (this.world.getBlockState(entityPos.south().up(2)).getMaterial() == Material.PLANTS
                                && isDrinkable(this.world, entityPos, EnumFacing.SOUTH))

                                || (this.world.getBlockState(entityPos.east().up(2)).getMaterial() == Material.PLANTS
                                && isDrinkable(this.world, entityPos, EnumFacing.EAST))

                                || (this.world.getBlockState(entityPos.west().up(2)).getMaterial() == Material.PLANTS
                                && isDrinkable(this.world, entityPos, EnumFacing.WEST))
                )
        );
        if (test) {
            //Which one is water?
            EnumFacing facing = null;
            if (this.world.getBlockState(entityPos.north().up(2)).getMaterial() == Material.PLANTS) {
                facing = EnumFacing.NORTH;
                if (Functions.getEntityCentre(this).z - Functions.getEntityBlockPos(this).getZ() <= 0.5D) {
                    test2 = true;
                }
            }
            else if (this.world.getBlockState(entityPos.south().up(2)).getMaterial() == Material.PLANTS) {
                facing = EnumFacing.SOUTH;
                if (Functions.getEntityCentre(this).z - Functions.getEntityBlockPos(this).getZ() >= 0.5D) {
                    test2 = true;
                }
            }
            else if (this.world.getBlockState(entityPos.east().up(2)).getMaterial() == Material.PLANTS) {
                facing = EnumFacing.EAST;
                if (Functions.getEntityCentre(this).x - Functions.getEntityBlockPos(this).getX() >= 0.5D) {
                    test2 = true;
                }
            }
            else if (this.world.getBlockState(entityPos.west().up(2)).getMaterial() == Material.PLANTS) {
                facing = EnumFacing.WEST;
                if (Functions.getEntityCentre(this).x - Functions.getEntityBlockPos(this).getX() <= 0.5D) {
                    test2 = true;
                }
            }
            if (facing != null && test && test2) {
                this.setDrinkingFrom(entityPos.offset(facing));
                this.faceBlock(this.getDrinkingFrom(), 10F, 10F);
            }
        }
        return test && test2;
    }

	@Override
	public SoundEvent getAmbientSound() {
	    return (SoundEvent) SoundEvent.REGISTRY
	            .getObject(new ResourceLocation("lepidodendron:beipiaosaurus_idle"));
	}

	@Override
	public SoundEvent getHurtSound(DamageSource ds) {
	    return (SoundEvent) SoundEvent.REGISTRY
	            .getObject(new ResourceLocation("lepidodendron:beipiaosaurus_hurt"));
	}

	@Override
	public SoundEvent getDeathSound() {
	    return (SoundEvent) SoundEvent.REGISTRY
	            .getObject(new ResourceLocation("lepidodendron:beipiaosaurus_death"));
	}


	public SoundEvent getAlarmSound() {
		return (SoundEvent) SoundEvent.REGISTRY
				.getObject(new ResourceLocation("lepidodendron:beipiaosaurus_alarm"));
	}

	public void playAlarmSound()
	{
		SoundEvent soundevent = this.getAlarmSound();
		//System.err.println("looking for alarm sound");
		if (soundevent != null && this.getAnimation() == NO_ANIMATION)
		{
			//System.err.println("playing alarm sound");
			this.setAnimation(ROAR_ANIMATION);
			this.playSound(soundevent, this.getSoundVolume(), this.getSoundPitch());
			this.alarmCooldown = 20;
		}
	}

	@Override
	protected float getSoundVolume() {
		return 1.0F;
	}

	@Override
	public boolean getCanSpawnHere() {
		return this.posY < (double) this.world.getSeaLevel() && this.isInWater();
	}

	@Override
	public void onLivingUpdate() {
		super.onLivingUpdate();

		if (this.getAnimation() == ATTACK_ANIMATION && this.getAnimationTick() == 10 && this.getAttackTarget() != null) {
			launchAttack();
		}

		if (this.standCooldown > 0) {
			this.standCooldown -= rand.nextInt(3) + 1;
		}
		if (this.standCooldown < 0) {
			this.standCooldown = 0;
		}
		AnimationHandler.INSTANCE.updateAnimations(this);

	}


	public static final PropertyDirection FACING = BlockDirectional.FACING;

	public boolean testLay(World world, BlockPos pos) {
		//System.err.println("Testing laying conditions");
		BlockPos posNest = pos;
		if (isLayableNest(world, posNest)) {
			String eggRenderType = new Object() {
				public String getValue(BlockPos posNest, String tag) {
					TileEntity tileEntity = world.getTileEntity(posNest);
					if (tileEntity != null)
						return tileEntity.getTileData().getString(tag);
					return "";
				}
			}.getValue(new BlockPos(posNest), "egg");

			//System.err.println("eggRenderType " + eggRenderType);

			if (eggRenderType.equals("")) {
				return true;
			}
		}
		return false;
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
	public boolean attackEntityFrom(DamageSource ds, float i) {
		Entity e = ds.getTrueSource();
		if (e instanceof EntityLivingBase && this.hasAlarm()) {
			EntityLivingBase ee = (EntityLivingBase) e;
			this.setAlarmTarget(ee);
			List<EntityPrehistoricFloraBeipiaosaurus> BEIPIAOSAURUS = this.world.getEntitiesWithinAABB(EntityPrehistoricFloraBeipiaosaurus.class, new AxisAlignedBB(this.getPosition().add(-8, -4, -8), this.getPosition().add(8, 4, 8)));
			for (EntityPrehistoricFloraBeipiaosaurus currentBEIPIAOSAURUS : BEIPIAOSAURUS) {
				currentBEIPIAOSAURUS.setAnimation(NO_ANIMATION);
				currentBEIPIAOSAURUS.setRevengeTarget(ee);
				currentBEIPIAOSAURUS.setAlarmTarget(ee);
				currentBEIPIAOSAURUS.alarmCooldown = rand.nextInt(20);
			}
		}
		return super.attackEntityFrom(ds, i);
	}

	public void setScreaming(boolean screaming) {
		this.screaming = screaming;
	}

	public boolean getScreaming() {
		return this.screaming;
	}

	public boolean isDirectPathBetweenPoints(Vec3d vec1, Vec3d vec2) {
		RayTraceResult movingobjectposition = this.world.rayTraceBlocks(vec1, new Vec3d(vec2.x, vec2.y, vec2.z), false, true, false);
		return movingobjectposition == null || movingobjectposition.typeOfHit != RayTraceResult.Type.BLOCK;
	}

	@Nullable
	@Override
	public CustomTrigger getModTrigger() {
		return ModTriggers.CLICK_BEIPIAOSAURUS;
	}

	@Nullable
	protected ResourceLocation getLootTable() {
		if (!this.isPFAdult()) {
			return LepidodendronMod.BEIPIAOSAURUS_LOOT_YOUNG;
		}
		return LepidodendronMod.BEIPIAOSAURUS_LOOT;
	}

	//Rendering taxidermy:
	//--------------------
	public static double offsetWall(@Nullable String variant) {
		return -0.45;
	}
	public static double upperfrontverticallinedepth(@Nullable String variant) {
		return 0.0;
	}
	public static double upperbackverticallinedepth(@Nullable String variant) {
		return 0.0;
	}
	public static double upperfrontlineoffset(@Nullable String variant) {
		return 0.0;
	}
	public static double upperfrontlineoffsetperpendiular(@Nullable String variant) {
		return 0.0;
	}
	public static double upperbacklineoffset(@Nullable String variant) {
		return 0.0;
	}
	public static double upperbacklineoffsetperpendiular(@Nullable String variant) {
		return 0.0;
	}
	public static double lowerfrontverticallinedepth(@Nullable String variant) {
		return 1.5;
	}
	public static double lowerbackverticallinedepth(@Nullable String variant) {
		return 0.0;
	}
	public static double lowerfrontlineoffset(@Nullable String variant) {
		return -0.03;
	}
	public static double lowerfrontlineoffsetperpendiular(@Nullable String variant) {
		return -0.8;
	}
	public static double lowerbacklineoffset(@Nullable String variant) {
		return 0.0;
	}
	public static double lowerbacklineoffsetperpendiular(@Nullable String variant) {
		return 0.5;
	}
	@SideOnly(Side.CLIENT)
	public static ResourceLocation textureDisplay(@Nullable String variant) {
		return RenderBeipiaosaurus.TEXTURE;
	}
	@SideOnly(Side.CLIENT)
	public static ModelBase modelDisplay(@Nullable String variant) {
		return RenderDisplays.modelBeipiaosaurus;
	}
	public static float getScaler(@Nullable String variant) {
		return RenderBeipiaosaurus.getScaler();
	}

}