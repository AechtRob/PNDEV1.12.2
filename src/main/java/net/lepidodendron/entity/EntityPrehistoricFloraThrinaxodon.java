
package net.lepidodendron.entity;

import com.google.common.base.Optional;
import com.google.common.base.Predicate;
import net.ilexiconn.llibrary.client.model.tools.ChainBuffer;
import net.ilexiconn.llibrary.server.animation.Animation;
import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.block.base.IAdvancementGranter;
import net.lepidodendron.entity.ai.*;
import net.lepidodendron.entity.base.EntityPrehistoricFloraAgeableBase;
import net.lepidodendron.entity.render.entity.RenderThrinaxodon;
import net.lepidodendron.entity.render.tile.RenderDisplays;
import net.lepidodendron.entity.util.ITrappableLand;
import net.lepidodendron.util.CustomTrigger;
import net.lepidodendron.util.ModTriggers;
import net.minecraft.client.model.ModelBase;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.EnumCreatureAttribute;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.player.EntityPlayer;
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

public class EntityPrehistoricFloraThrinaxodon extends EntityPrehistoricFloraDiictodon implements IAdvancementGranter, ITrappableLand {

	public BlockPos currentTarget;
	@SideOnly(Side.CLIENT)
	public ChainBuffer chainBuffer;
	private boolean screaming;
	private int alarmCooldown;
	public int ambientSoundTime;
	public Animation NOISE_ANIMATION;

	protected static final DataParameter<Optional<BlockPos>> NEST_BLOCK_POS = EntityDataManager.createKey(EntityPrehistoricFloraThrinaxodon.class, DataSerializers.OPTIONAL_BLOCK_POS);

	public EntityPrehistoricFloraThrinaxodon(World world) {
		super(world);
		setSize(0.33F, 0.3F);
		minWidth = 0.18F;
		maxWidth = 0.33F;
		maxHeight = 0.3F;
		maxHealthAgeable = 8.0D;
		NOISE_ANIMATION = Animation.create(20);
	}

	@Nullable
	@Override
	public CustomTrigger getModTrigger() {
		return ModTriggers.CLICK_THRINAXODON;
	}

	@Override
	public int getEatLength() {
		return 10;
	}

	@Override
	public Animation[] getAnimations() {
		return new Animation[]{ATTACK_ANIMATION, DRINK_ANIMATION, ROAR_ANIMATION, LAY_ANIMATION, EAT_ANIMATION, NOISE_ANIMATION};
	}

	public static String getPeriod() {return "early Triassic";}

	//public static String getHabitat() {return "Terrestrial Cynodont";}

	@Override
	public int getRoarLength() {
		return 40;
	}
	
	@Override
	public boolean hasAlarm() {
		return false;
	}

	@Override
	public int getTalkInterval() {
		return 400;
	}

	public int getAmbientTalkInterval() {
		return 160;
	}

	public float getAISpeedLand() {
		float speedBase = 0.378F;
		if (this.getTicks() < 0) {
			return 0.0F; //Is laying eggs
		}
		if (this.getAnimation() == DRINK_ANIMATION || this.getAnimation() == MAKE_NEST_ANIMATION || this.getAnimation() == GRAZE_ANIMATION) {
			return 0.0F;
		}
		if (this.getIsFast()) {
			speedBase = speedBase * 1.25F;
		}
		return speedBase;
	}

	@Override
	public void onEntityUpdate() {
		super.onEntityUpdate();
		if (this.isEntityAlive() && this.rand.nextInt(1000) < this.ambientSoundTime++ && !this.world.isRemote)
		{
			this.ambientSoundTime = -this.getAmbientTalkInterval();
			SoundEvent soundevent = this.getAmbientAmbientSound();
			if (soundevent != null)
			{
				if (this.getAnimation() == NO_ANIMATION) {
					this.setAnimation(NOISE_ANIMATION);
					//System.err.println("Playing noise sound on remote: " + (world.isRemote));
					this.playSound(soundevent, this.getSoundVolume(), this.getSoundPitch());
				}
			}
		}
	}

	@Override
	public float getEyeHeight()
	{
		return Math.max(super.getEyeHeight(), this.height * 1.05F);
	}

	protected void initEntityAI() {
		tasks.addTask(0, new EntityMateAIAgeableBase(this, 1.0D));
		tasks.addTask(1, new EntityTemptAI(this, 1, true, true, (float) this.getEntityAttribute(SharedMonsterAttributes.ATTACK_DAMAGE).getAttributeValue() * 0.33F));
		tasks.addTask(2, new LandEntitySwimmingAI(this, 0.75, true));
		tasks.addTask(3, new NightFindNestAI(this));
		tasks.addTask(4, new AttackAI(this, 1.6D, false, this.getAttackLength()));
		tasks.addTask(5, new LandWanderNestAI(this));
		tasks.addTask(6, new LandWanderFollowParent(this, 1.05D));
		tasks.addTask(7, new LandWanderHerd(this, 1.00D, Math.max(8F, this.width) * this.getNavigator().getPathSearchRange() * 0.75F));
		tasks.addTask(8, new LandWanderAvoidWaterAI(this, 1.0D, 20));
		tasks.addTask(9, new EntityWatchClosestAI(this, EntityPlayer.class, 6.0F));
		tasks.addTask(10, new EntityWatchClosestAI(this, EntityPrehistoricFloraAgeableBase.class, 8.0F));
		tasks.addTask(11, new EntityLookIdleAI(this));
		this.targetTasks.addTask(0, new EatItemsEntityPrehistoricFloraAgeableBaseAI(this, 1));
		this.targetTasks.addTask(1, new HuntForDietEntityPrehistoricFloraAgeableBaseAI(this, EntityLivingBase.class, true, (Predicate<Entity>) entity -> entity instanceof EntityLivingBase, 0.1F, 1.2F, false)); //this.targetTasks.addTask(1, new HuntSmallerThanMeAIAgeable(this, EntityPrehistoricFloraAgeableFishBase.class, true, (Predicate<Entity>) entity -> entity instanceof EntityLivingBase, 0));
		//this.targetTasks.addTask(1, new HuntSmallerThanMeAIAgeable(this, EntityLivingBase.class, true, (Predicate<Entity>) entity -> entity instanceof EntityLivingBase, 0.0));
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
		//this.getAttributeMap().registerAttribute(SharedMonsterAttributes.ATTACK_DAMAGE);
		this.getEntityAttribute(SharedMonsterAttributes.ATTACK_DAMAGE).setBaseValue(4.0D);
		this.getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).setBaseValue(0.25D);
	}

	@Override
	public SoundEvent getAmbientSound() {
	    return (SoundEvent) SoundEvent.REGISTRY
	            .getObject(new ResourceLocation("lepidodendron:thrinaxodon_roar"));
	}

	public SoundEvent getAmbientAmbientSound() {
		return (SoundEvent) SoundEvent.REGISTRY
				.getObject(new ResourceLocation("lepidodendron:thrinaxodon_idle"));
	}

	@Override
	public SoundEvent getHurtSound(DamageSource ds) {
	    return (SoundEvent) SoundEvent.REGISTRY
	            .getObject(new ResourceLocation("lepidodendron:thrinaxodon_hurt"));
	}

	@Override
	public SoundEvent getDeathSound() {
	    return (SoundEvent) SoundEvent.REGISTRY
	            .getObject(new ResourceLocation("lepidodendron:thrinaxodon_death"));
	}

	@Nullable
	protected ResourceLocation getLootTable() {
		if (!this.isPFAdult()) {
			return LepidodendronMod.THRINAXODON_LOOT_YOUNG;
		}
		return LepidodendronMod.THRINAXODON_LOOT;
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
	public static double lowerfrontlineoffsetperpendiular(@Nullable String variant) {return -1.2;}
	public static double lowerbacklineoffset(@Nullable String variant) {return 0.0;}
	public static double lowerbacklineoffsetperpendiular(@Nullable String variant) {return -0.0;}
	@SideOnly(Side.CLIENT)
	public static ResourceLocation textureDisplay(@Nullable String variant) {return RenderThrinaxodon.TEXTURE;}
	@SideOnly(Side.CLIENT)
	public static ModelBase modelDisplay(@Nullable String variant) {return RenderDisplays.modelThrinaxodon;}
	public static float getScaler(@Nullable String variant) {return RenderThrinaxodon.getScaler();}
	public static float widthSupport(@Nullable String variant) {return 0.02F;}
}