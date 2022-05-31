
package net.lepidodendron.entity;

import com.google.common.base.Predicate;
import net.ilexiconn.llibrary.client.model.tools.ChainBuffer;
import net.ilexiconn.llibrary.server.animation.Animation;
import net.ilexiconn.llibrary.server.animation.AnimationHandler;
import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.ai.*;
import net.lepidodendron.entity.base.EntityPrehistoricFloraAgeableBase;
import net.lepidodendron.entity.base.EntityPrehistoricFloraCrawlingFlyingInsectBase;
import net.minecraft.block.BlockDirectional;
import net.minecraft.block.properties.PropertyDirection;
import net.minecraft.entity.*;
import net.minecraft.entity.ai.EntityAILookIdle;
import net.minecraft.entity.ai.EntityAIWatchClosest;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.DamageSource;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.oredict.OreDictionary;

import javax.annotation.Nullable;
import java.util.List;

public class EntityPrehistoricFloraDvinia extends EntityPrehistoricFloraDiictodon {

	public BlockPos currentTarget;
	@SideOnly(Side.CLIENT)
	public ChainBuffer chainBuffer;
	public Animation LOOK_ANIMATION;

	public EntityPrehistoricFloraDvinia(World world) {
		super(world);
		//setSize(0.6F, 0.35F);
		experienceValue = 0;
		this.isImmuneToFire = false;
		setNoAI(!true);
		enablePersistence();
		minWidth = 0.12F;
		maxWidth = 0.3F;
		maxHeight = 0.4F;
		maxHealthAgeable = 10.0D;
		LOOK_ANIMATION = Animation.create(this.getLookLength());
	}

	public int getLookLength() {
		return 180;
	}

	@Override
	public Animation[] getAnimations() {
		return new Animation[]{LOOK_ANIMATION, ATTACK_ANIMATION, ROAR_ANIMATION, LAY_ANIMATION, EAT_ANIMATION};
	}

	@Override
	public boolean attackEntityFrom(DamageSource source, float amount) {
		this.setAnimation(NO_ANIMATION);
		return super.attackEntityFrom(source, amount);
	}

	@Override
	public Animation getGrappleAnimation() {
		return this.LOOK_ANIMATION;
	}

	@Override
	public boolean findGrappleTarget() {
		//System.err.println("finding grapple target");
		if (this.willGrapple) {
			return false;
		}
		List<EntityLiving> Entity = world.getEntitiesWithinAABB(EntityLiving.class, new AxisAlignedBB(this.getPosition().add(-8, -4, -8), this.getPosition().add(8, 4, 8)));
		for (EntityLiving currentEntity : Entity) {
			if (currentEntity instanceof EntityPrehistoricFloraDvinia) {
				EntityPrehistoricFloraDvinia currentDvinia = (EntityPrehistoricFloraDvinia) currentEntity;
				if (currentDvinia.isPFAdult() && this.isPFAdult() && currentDvinia != this && !currentDvinia.willGrapple) {
					this.setGrappleTarget(currentDvinia);
					currentDvinia.willGrapple = true;
					this.willGrapple = true;
					currentDvinia.setGrappleTarget(this);
					return true;
				}
			}
			this.setGrappleTarget(currentEntity);
			this.willGrapple = true;
			return true;
		}
		return false;
	}

	@Override
	public boolean grappleEntityAsMob(Entity entity) {
		if (this.getAnimation() == NO_ANIMATION) {
			this.setAnimation(this.getGrappleAnimation());
			//System.err.println("set attack");
		}
		return false;
	}

	public static String getPeriod() {return "Permian";}

	public static String getHabitat() {return "Terrestrial Cynodont";}

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

	@Override
	public String tagEgg() {
		return "eggs_dvinia";
	}
	
	protected float getAISpeedLand() {
		float speedBase = 0.377F;
		if (this.getTicks() < 0) {
			return 0.0F; //Is laying eggs
		}
		if (this.getIsFast()) {
			speedBase = speedBase * 1.25F;
		}
		if (this.getAnimation() == LOOK_ANIMATION) {
			return 0.0F; //Is looking
		}
		return speedBase;
	}

	@Override
	public int getTalkInterval() {
		return 80;
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
	public boolean homesToNest() {
		return false;
	}

	@Override
	public float getEyeHeight()
	{
		return Math.max(super.getEyeHeight(), this.height * 1.05F);
	}

	protected void initEntityAI() {
		tasks.addTask(0, new EntityMateAIAgeableBase(this, 1.0D));
		tasks.addTask(1, new EntityTemptAI(this, 1, false, true, 0));
		tasks.addTask(2, new LandEntitySwimmingAI(this, 0.75, true));
		tasks.addTask(3, new AttackAI(this, 1.6D, false, this.getAttackLength()));
		tasks.addTask(4, new PanicFindNestAI(this, 1.6D));
		tasks.addTask(5, new LandWanderNestAI(this));
		tasks.addTask(6, new GrappleAI(this, 1.0D, false, this.getLookLength(), this.getGrappleAnimation(), 0.225));
		tasks.addTask(7, new LandWanderAvoidWaterAI(this, 1.0D, 40));
		tasks.addTask(8, new EntityAIWatchClosest(this, EntityPlayer.class, 6.0F));
		tasks.addTask(9, new EntityAIWatchClosest(this, EntityPrehistoricFloraAgeableBase.class, 8.0F));
		tasks.addTask(10, new EntityAILookIdle(this));
		this.targetTasks.addTask(0, new EatMeatItemsAI(this));
		this.targetTasks.addTask(0, new EatPlantItemsAI(this, 1D));
		this.targetTasks.addTask(1, new HuntAI(this, EntityPrehistoricFloraCrawlingFlyingInsectBase.class, true, (Predicate<Entity>) entity -> entity instanceof EntityLivingBase));
		this.targetTasks.addTask(2, new HuntSmallerThanMeAIAgeable(this, EntityLivingBase.class, true, (Predicate<Entity>) entity -> entity instanceof EntityLivingBase, 0));
	}

	@Override
	public boolean isBreedingItem(ItemStack stack)
	{
		return (
				(OreDictionary.containsMatch(false, OreDictionary.getOres("plant"), stack))
					|| (OreDictionary.containsMatch(false, OreDictionary.getOres("listAllmeatraw"), stack))
		);
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
	            .getObject(new ResourceLocation("lepidodendron:dvinia_idle"));
	}

	@Override
	public SoundEvent getHurtSound(DamageSource ds) {
	    return (SoundEvent) SoundEvent.REGISTRY
	            .getObject(new ResourceLocation("lepidodendron:dvinia_hurt"));
	}

	@Override
	public SoundEvent getDeathSound() {
	    return (SoundEvent) SoundEvent.REGISTRY
	            .getObject(new ResourceLocation("lepidodendron:dvinia_death"));
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
	protected int getExperiencePoints(EntityPlayer player) {
		return 2 + this.world.rand.nextInt(3);
	}

	@Override
	public void onLivingUpdate() {
		super.onLivingUpdate();
		this.renderYawOffset = this.rotationYaw;

		if (this.getAnimation() == ATTACK_ANIMATION && this.getAnimationTick() == 11 && this.getAttackTarget() != null) {
			launchAttack();
			if (this.getOneHit()) {
				this.setAttackTarget(null);
				this.setRevengeTarget(null);
			}
		}

		AnimationHandler.INSTANCE.updateAnimations(this);

	}

	@Override
	public void launchGrapple() {
		if (this.getGrappleTarget() != null) {
			if (this.getGrappleTarget() instanceof EntityPrehistoricFloraAgeableBase) {
				EntityPrehistoricFloraAgeableBase grappleTarget = (EntityPrehistoricFloraAgeableBase) this.getGrappleTarget();
				grappleTarget.setGrappleTarget(null);
				grappleTarget.willGrapple = false;
			}
			this.setGrappleTarget(null);
			this.willGrapple = false;
		}
	}

	@Override
	public AxisAlignedBB getGrappleBoundingBox() {
		float size = this.getRenderSizeModifier() * 0.25F;
		return this.getEntityBoundingBox().grow(6.0F + size, 6.0F + size, 6.0F + size);
	}

	public static final PropertyDirection FACING = BlockDirectional.FACING;

	@Override
	public SoundEvent getAlarmSound() {
		//System.err.println("looking for alarm sound");
		return (SoundEvent) SoundEvent.REGISTRY
				.getObject(new ResourceLocation("lepidodendron:dvinia_alarm"));
	}

	@Override
	public boolean attackEntityAsMob(Entity entity) {
		if (this.getAnimation() == NO_ANIMATION) {
			this.setAnimation(ATTACK_ANIMATION);
			//System.err.println("set attack");
		}
		return false;
	}

	@Nullable
	protected ResourceLocation getLootTable() {
		if (!this.isPFAdult()) {
			return LepidodendronMod.DVINIA_LOOT_YOUNG;
		}
		return LepidodendronMod.DVINIA_LOOT;
	}

}