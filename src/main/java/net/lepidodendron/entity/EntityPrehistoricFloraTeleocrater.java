
package net.lepidodendron.entity;

import com.google.common.base.Predicate;
import net.ilexiconn.llibrary.client.model.tools.ChainBuffer;
import net.ilexiconn.llibrary.server.animation.Animation;
import net.ilexiconn.llibrary.server.animation.AnimationHandler;
import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.block.base.IAdvancementGranter;
import net.lepidodendron.entity.ai.*;
import net.lepidodendron.entity.base.EntityPrehistoricFloraAgeableBase;
import net.lepidodendron.entity.base.EntityPrehistoricFloraLandBase;
import net.lepidodendron.entity.render.entity.RenderTeleocrater;
import net.lepidodendron.entity.render.tile.RenderDisplays;
import net.lepidodendron.entity.util.ITrappableLand;
import net.lepidodendron.util.CustomTrigger;
import net.lepidodendron.util.ModTriggers;
import net.minecraft.block.BlockDirectional;
import net.minecraft.block.properties.PropertyDirection;
import net.minecraft.client.model.ModelBase;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.EnumCreatureAttribute;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.DamageSource;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import org.apache.commons.lang3.ArrayUtils;

import javax.annotation.Nullable;

public class EntityPrehistoricFloraTeleocrater extends EntityPrehistoricFloraLandBase implements IAdvancementGranter, ITrappableLand {

	public BlockPos currentTarget;
	@SideOnly(Side.CLIENT)
	public ChainBuffer chainBuffer;
	public int ambientSoundTime;
	public Animation NOISE_ANIMATION;

	public EntityPrehistoricFloraTeleocrater(World world) {
		super(world);
		setSize(0.55F, 0.6F);
		minWidth = 0.12F;
		maxWidth = 0.55F;
		maxHeight = 0.6F;
		maxHealthAgeable = 16.0D;
		NOISE_ANIMATION = Animation.create(25);
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
	public Animation[] getAnimations() {
		return new Animation[]{ATTACK_ANIMATION, DRINK_ANIMATION, ROAR_ANIMATION, LAY_ANIMATION, EAT_ANIMATION, NOISE_ANIMATION};
	}

	@Override
	public int getDrinkLength() {
		return 60;
	}

	@Override
	public int getEatLength() {
		return 20;
	}

	@Override
	public int getRoarLength() {
		return 30;
	}

	public static String getPeriod() {return "Triassic";}

	//public static String getHabitat() {return "Terrestrial archosaur";}

	@Override
	public boolean hasNest() {
		return true;
	}

	@Override
	public int getAttackLength() {
		return 20;
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
		float speedBase = 0.289F;
		if (this.getTicks() < 0) {
			return 0.0F; //Is laying eggs
		}
		if (this.getAnimation() == DRINK_ANIMATION || this.getAnimation() == GRAZE_ANIMATION) {
			return 0.0F; //Is drinking
		}
		if (this.getIsFast()) {
			speedBase = speedBase * 1.55F;
		}
		return speedBase;
	}

	@Override
	public int getTalkInterval() {
		return 500;
	}

	public int getAmbientTalkInterval() {
		return 160;
	}

	@Override
	public void onEntityUpdate() {
		super.onEntityUpdate();
		if (this.isEntityAlive() && this.rand.nextInt(1000) < this.ambientSoundTime++ && !this.world.isRemote)
		{
			this.ambientSoundTime = -this.getAmbientTalkInterval();
			//if (rand.nextInt(6) != 0) {
				SoundEvent soundevent = this.getAmbientAmbientSound();
				if (soundevent != null) {
					if (this.getAnimation() == NO_ANIMATION) {
						this.setAnimation(NOISE_ANIMATION);
						//System.err.println("Playing noise sound on remote: " + (world.isRemote));
						this.playSound(soundevent, this.getSoundVolume(), this.getSoundPitch());
					}
				}
			//}
		}
	}

	@Override
	public int getAdultAge() {
		return 56000;
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
		//tasks.addTask(4, new PanicAI(this, 1.6D));
		tasks.addTask(5, new LandWanderNestInBlockAI(this));
		tasks.addTask(6, new LandWanderAvoidWaterAI(this, 1.0D, 40));
		tasks.addTask(7, new EntityWatchClosestAI(this, EntityPlayer.class, 6.0F));
		tasks.addTask(8, new EntityWatchClosestAI(this, EntityPrehistoricFloraAgeableBase.class, 8.0F));
		tasks.addTask(9, new EntityLookIdleAI(this));
		this.targetTasks.addTask(0, new EatItemsEntityPrehistoricFloraAgeableBaseAI(this, 1));
		this.targetTasks.addTask(1, new HuntForDietEntityPrehistoricFloraAgeableBaseAI(this, EntityLivingBase.class, true, (Predicate<Entity>) entity -> entity instanceof EntityLivingBase, 0.1F, 1.2F, false));
		//this.targetTasks.addTask(1, new HuntSmallerThanMeAIAgeable(this, EntityLivingBase.class, true, (Predicate<Entity>) entity -> entity instanceof EntityLivingBase, 0.2));

	}

	@Override
	public String[] getFoodOreDicts() {
		return ArrayUtils.addAll(DietString.MEAT, DietString.BUG);
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
		this.getEntityAttribute(SharedMonsterAttributes.ATTACK_DAMAGE).setBaseValue(6.0D);
		this.getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).setBaseValue(0.25D);
	}

	@Override
	public SoundEvent getAmbientSound() {
	    return (SoundEvent) SoundEvent.REGISTRY
	            .getObject(new ResourceLocation("lepidodendron:teleocrater_roar"));
	}

	public SoundEvent getAmbientAmbientSound() {
		return (SoundEvent) SoundEvent.REGISTRY
				.getObject(new ResourceLocation("lepidodendron:teleocrater_idle"));
	}

	@Override
	public SoundEvent getHurtSound(DamageSource ds) {
	    return (SoundEvent) SoundEvent.REGISTRY
	            .getObject(new ResourceLocation("lepidodendron:teleocrater_hurt"));
	}

	@Override
	public SoundEvent getDeathSound() {
	    return (SoundEvent) SoundEvent.REGISTRY
	            .getObject(new ResourceLocation("lepidodendron:teleocrater_death"));
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

	public boolean isDirectPathBetweenPoints(Vec3d vec1, Vec3d vec2) {
		RayTraceResult movingobjectposition = this.world.rayTraceBlocks(vec1, new Vec3d(vec2.x, vec2.y, vec2.z), false, true, false);
		return movingobjectposition == null || movingobjectposition.typeOfHit != RayTraceResult.Type.BLOCK;
	}

	@Nullable
	protected ResourceLocation getLootTable() {
		if (!this.isPFAdult()) {
			return LepidodendronMod.TELEOCRATER_LOOT_YOUNG;
		}
		return LepidodendronMod.TELEOCRATER_LOOT;
	}
	//Rendering taxidermy:
	//--------------------
	public static double offsetCase(@Nullable String variant) { return 0.46; }

	public static double offsetWall(@Nullable String variant) {
		return 0.01;
	}
	public static double upperfrontverticallinedepth(@Nullable String variant) {
		return 1.4;
	}
	public static double upperbackverticallinedepth(@Nullable String variant) {return 0.8;}
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
		return 0;
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
		return RenderTeleocrater.TEXTURE;
	}
	@SideOnly(Side.CLIENT)
	public static ModelBase modelDisplay(@Nullable String variant) {
		return RenderDisplays.modelTeleocrater;
	}
	public static float getScaler(@Nullable String variant) {
		return RenderTeleocrater.getScaler();
	}

	@Nullable
	@Override
	public CustomTrigger getModTrigger() {
		return ModTriggers.CLICK_TELEOCRATER;

	}
}

