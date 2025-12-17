
package net.lepidodendron.entity;

import net.ilexiconn.llibrary.client.model.tools.ChainBuffer;
import net.ilexiconn.llibrary.server.animation.Animation;
import net.ilexiconn.llibrary.server.animation.AnimationHandler;
import net.lepidodendron.LepidodendronConfig;
import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.block.BlockNest;
import net.lepidodendron.block.base.IAdvancementGranter;
import net.lepidodendron.entity.ai.*;
import net.lepidodendron.entity.base.EntityPrehistoricFloraAgeableBase;
import net.lepidodendron.entity.base.EntityPrehistoricFloraBiQuadLandBase;
import net.lepidodendron.entity.base.EntityPrehistoricFloraLandCarnivoreBase;
import net.lepidodendron.entity.util.IBluffer;
import net.lepidodendron.entity.util.IScreamer;
import net.lepidodendron.entity.util.ITrappableLand;
import net.lepidodendron.util.CustomTrigger;
import net.lepidodendron.util.ModTriggers;
import net.minecraft.block.BlockDirectional;
import net.minecraft.block.properties.PropertyDirection;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.EnumCreatureAttribute;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.DamageSource;
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

public class EntityPrehistoricFloraOuranosaurus extends EntityPrehistoricFloraBiQuadLandBase implements IScreamer, IAdvancementGranter, IBluffer, ITrappableLand {

	public BlockPos currentTarget;
	@SideOnly(Side.CLIENT)
	public ChainBuffer tailBuffer;
	private int standCooldown;
	private boolean screaming;
	private int alarmCooldown;
	public static Animation NOISE_ANIMATION;

	public EntityPrehistoricFloraOuranosaurus(World world) {
		super(world);
		setSize(1.5F, 2.5F);
		minWidth = 0.20F;
		maxWidth = 1.5F;
		maxHeight = 2.5F;
		maxHealthAgeable = 100.0D;
		if (FMLCommonHandler.instance().getSide().isClient()) {
			tailBuffer = new ChainBuffer();
		}
		NOISE_ANIMATION = Animation.create(this.getNoiseLength());
	}

	public int getNoiseLength() {
		return 55;
	}

	@Override
	public boolean attackEntityFrom(DamageSource ds, float i) {
		Entity e = ds.getTrueSource();
		if (e instanceof EntityLivingBase) {
			EntityLivingBase ee = (EntityLivingBase) e;
			this.setAlarmTarget(ee);
			this.setBipedal();
			List<EntityPrehistoricFloraOuranosaurus> Kamuysaurus = this.world.getEntitiesWithinAABB(EntityPrehistoricFloraOuranosaurus.class, new AxisAlignedBB(this.getPosition().add(-8, -4, -8), this.getPosition().add(8, 4, 8)));
			for (EntityPrehistoricFloraOuranosaurus currentKamuysaurus : Kamuysaurus) {
				currentKamuysaurus.setAnimation(NO_ANIMATION);
				currentKamuysaurus.setRevengeTarget(ee);
				currentKamuysaurus.setAlarmTarget(ee);
				currentKamuysaurus.setBipedal();
				currentKamuysaurus.alarmCooldown = rand.nextInt(20);
			}
		}
		return super.attackEntityFrom(ds, i);
	}

	@Override
	public void playLivingSound() {
		if (this.getAnimation() == NO_ANIMATION && (!this.getIsSneaking())) {
			int num = this.rand.nextInt(10);
			if (!this.world.isRemote) {
				if(num < 5) {
					this.setAnimation(NOISE_ANIMATION);
				}
				else {
					this.setAnimation(ROAR_ANIMATION);
				}
				super.playLivingSound();
			}
		}
	}

	@Override
	public int getToQuadTransitionLength() {
		return 20;
	}

	@Override
	public int getToBiTransitionLength() {
		return 20;
	}

	@Override
	public int getQuadTime() {
		return 2000;
	}

	@Override
	public int getBiTime() {
		return 2500;
	}

	//Grazes
	@Override
	public boolean drinksWater() {
		return false;
	}

	@Override
	public int getDrinkCooldown() {
		return 2400;
	}

	@Override
	public boolean isDrinking()
	{
		if (this.getAnimation() == this.TOBI_ANIMATION || this.getAnimation() == this.TOQUAD_ANIMATION || !this.isQuad()) {
			return false;
		}
		return super.isDrinking();

	}

	public void setScreaming(boolean screaming) {
		this.screaming = screaming;
	}

	public boolean getScreaming() {
		return this.screaming;
	}

	@Override
	public void onUpdate() {
		super.onUpdate();
		if (world.isRemote && !this.isAIDisabled()) {
			tailBuffer.calculateChainSwingBuffer(120, 10, 5F, this);
		}
	}

	@Override
	public int getEggType(@Nullable String PNType) {
		return 2; //large
	}

	@Override
	public Animation[] getAnimations() {
		return new Animation[]{ATTACK_ANIMATION, DRINK_ANIMATION, ROAR_ANIMATION, LAY_ANIMATION, EAT_ANIMATION, TOBI_ANIMATION, TOQUAD_ANIMATION, NOISE_ANIMATION};
	}

	@Override
	public int getRoarLength() {
		return 20;
	}

	public static String getPeriod() {return "Late Cretaceous";}

	@Override
	public int getDrinkLength() {
		return 280;
	}

	@Override
	public int getGrazeLength() {
		return 353;
	}

	@Override
	public int getEatLength() {
		return 20;
	}

	@Override
	public boolean hasNest() {
		return true;
	}

	@Override
	public int getAttackLength() {
		return 12;
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
		float speedBase = 0.45F;
		if (this.getTicks() < 0) {
			return 0.0F; //Is laying eggs
		}
		if (this.getAnimation() == DRINK_ANIMATION || this.getAnimation() == MAKE_NEST_ANIMATION) {
			return 0.0F;
		}

		if(!this.isQuad()) {
			speedBase = 0.4F;
		}
		if (this.getIsFast()) {
			speedBase = speedBase * 1.5F;
		}
		return speedBase;
	}

	@Override
	public int getTalkInterval() {
		return 360;
	}

	//This is how many ticks it takes for a young mob to become an adult
	@Override
	public int getAdultAge() {
		return 92000;
	}

	public AxisAlignedBB getAttackBoundingBox() {
		float size = this.getRenderSizeModifier() * 1.50F * this.getAgeScale();
		return this.getEntityBoundingBox().grow(0.5F + size, 0.2F, 0.5F + size);
	}

	@Override
	@SideOnly(Side.CLIENT)
	public AxisAlignedBB getRenderBoundingBox() {
		if (LepidodendronConfig.renderBigMobsProperly && (this.maxWidth * this.getAgeScale()) > 1F) {
			return this.getEntityBoundingBox().grow(2.0, 1.00, 2.0);
		}
		return this.getEntityBoundingBox();
	}

	@Override
	public float getEyeHeight()
	{
		return Math.max(super.getEyeHeight(), this.height * 0.9F);
	}

	@Override
	public float getSwimHeight()
	{
		return this.height * 1.1F;
	}

	//define the entity's AI here
	protected void initEntityAI() {
		tasks.addTask(0, new EntityMateAIAgeableBase(this, 1.0D));
		tasks.addTask(1, new EntityTemptAI(this, 1, false, true, (float) this.getEntityAttribute(SharedMonsterAttributes.ATTACK_DAMAGE).getAttributeValue() * 0.33F));
		tasks.addTask(2, new LandEntitySwimmingAI(this, 0.75, false));
		//tasks.addTask(3, new AgeableWarnEntity(this, EntityPlayer.class, 4));
		tasks.addTask(4, new AttackAI(this, 1.0D, false, this.getAttackLength()));
		tasks.addTask(5, new PanicScreamAI(this, 1.0));
		tasks.addTask(6, new LandWanderNestAI(this));
		tasks.addTask(7, new LandWanderFollowParent(this, 1.05D));
		tasks.addTask(8, new LandWanderAvoidWaterAI(this, 1.0D, 45));
		tasks.addTask(9, new EntityWatchClosestAI(this, EntityPlayer.class, 6.0F));
		tasks.addTask(10, new EntityWatchClosestAI(this, EntityPrehistoricFloraAgeableBase.class, 8.0F));
		tasks.addTask(11, new EntityLookIdleAI(this));
		this.targetTasks.addTask(0, new EatItemsEntityPrehistoricFloraAgeableBaseAI(this, 1));
		//this.targetTasks.addTask(1, new EntityHurtByTargetSmallerThanMeAI(this, false));
	}

	@Override
	public boolean panics() {
		return true;
	}

	@Override
	public String[] getFoodOreDicts() {
		return ArrayUtils.addAll(DietString.PLANTS);
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

//	@Override
//	public SoundEvent getRoarSound() {
//	    return (SoundEvent) SoundEvent.REGISTRY
//	            .getObject(new ResourceLocation("lepidodendron:muttaburrasaurus_idle"));
//	}

	@Override
	public SoundEvent getAmbientSound() {
		return (SoundEvent) SoundEvent.REGISTRY
				.getObject(new ResourceLocation("lepidodendron:ouranosaurus_idle"));
	}

	@Override
	public SoundEvent getHurtSound(DamageSource ds) {
	    return (SoundEvent) SoundEvent.REGISTRY
	            .getObject(new ResourceLocation("lepidodendron:ouranosaurus_hurt"));
	}

	@Override
	public SoundEvent getDeathSound() {
	    return (SoundEvent) SoundEvent.REGISTRY
	            .getObject(new ResourceLocation("lepidodendron:ouranosaurus_death"));
	}

	public SoundEvent getAlarmSound() {
		return (SoundEvent) SoundEvent.REGISTRY
				.getObject(new ResourceLocation("lepidodendron:ouranosaurus_alarm"));
	}

	public void playAlarmSound()
	{
		SoundEvent soundevent = this.getAlarmSound();
		//System.err.println("looking for alarm sound");
		if (soundevent != null)
		{
			//System.err.println("playing alarm sound");
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
	public void onEntityUpdate() {
		if (this.alarmCooldown > 0) {
			this.alarmCooldown -= 1;
		}
		if (this.getScreaming() && alarmCooldown <= 0) {
			this.playAlarmSound();
		}
		super.onEntityUpdate();
	}

	@Override
	public void onLivingUpdate() {

		super.onLivingUpdate();
		//this.renderYawOffset = this.rotationYaw;

		if (this.getAnimation() == ATTACK_ANIMATION && this.getAttackTarget() != null) {
			if (this.getAnimationTick() == 9) {
				launchAttack();
			}
		}

		if (this.getAnimation() == GRAZE_ANIMATION && !world.isRemote) {
			if (LepidodendronConfig.doGrazeGrief && world.getGameRules().getBoolean("mobGriefing") && this.getWillHunt() && (!world.isRemote) && this.getAnimationTick() >= this.getAnimation().getDuration() * 0.75F) {
				ItemStack item = world.getBlockState(this.getGrazingFrom()).getBlock().getPickBlock(world.getBlockState(this.getGrazingFrom()), null, world, this.getGrazingFrom(), null);
				world.destroyBlock(this.getGrazingFrom(), true);
				float itemHealth = 0.5F; //Default minimal nutrition
				if (item.getItem() instanceof ItemFood) {
					itemHealth = ((ItemFood) item.getItem()).getHealAmount(item);
				}
				this.setHealth(Math.min(this.getHealth() + itemHealth, (float) this.getEntityAttribute(SharedMonsterAttributes.MAX_HEALTH).getBaseValue()));
			}
		}

		//Propagate alert from the roar signal:
		if ((!this.world.isRemote) && this.getAnimation() == ROAR_ANIMATION && this.getWarnTarget() != null
			&& this.getAnimationTick() > this.ROAR_ANIMATION.getDuration() * 0.75) {
			List<EntityPrehistoricFloraOuranosaurus> Camptosaurus = this.world.getEntitiesWithinAABB(EntityPrehistoricFloraOuranosaurus.class, new AxisAlignedBB(this.getPosition().add(-12, -6, -12), this.getPosition().add(12, 6, 12)));
			for (EntityPrehistoricFloraOuranosaurus currentCamptosaurus : Camptosaurus) {
				currentCamptosaurus.setRevengeTarget(this.getWarnTarget());
			}
		}

		if (this.standCooldown > 0) {
			this.standCooldown -= rand.nextInt(3) + 1;
		}
		if (this.standCooldown < 0) {
			this.standCooldown = 0;
		}
		AnimationHandler.INSTANCE.updateAnimations(this);

		//System.err.println("Eating: " + this.getEatTarget() + " isFast " + this.getIsFast());



	}

	public static final PropertyDirection FACING = BlockDirectional.FACING;

	public boolean testLay(World world, BlockPos pos) {
		//System.err.println("Testing laying conditions");
		BlockPos posNest = pos;
		if (isLayableNest(world, posNest)) {
			TileEntity te = world.getTileEntity(pos);
			return (((BlockNest.TileEntityNest)te).getStackInSlot(0).isEmpty());
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

	public boolean isDirectPathBetweenPoints(Vec3d vec1, Vec3d vec2) {
		RayTraceResult movingobjectposition = this.world.rayTraceBlocks(vec1, new Vec3d(vec2.x, vec2.y, vec2.z), false, true, false);
		return movingobjectposition == null || movingobjectposition.typeOfHit != RayTraceResult.Type.BLOCK;
	}

	@Nullable
	protected ResourceLocation getLootTable() {
		if (!this.isPFAdult()) {
			return LepidodendronMod.OURANOSAURUS_LOOT_YOUNG;
		}
		return LepidodendronMod.OURANOSAURUS_LOOT;
	}

	@Nullable
	@Override
	public CustomTrigger getModTrigger() {
		return ModTriggers.CLICK_OURANOSAURUS;
	}


	//Rendering taxidermy:
	//--------------------

}