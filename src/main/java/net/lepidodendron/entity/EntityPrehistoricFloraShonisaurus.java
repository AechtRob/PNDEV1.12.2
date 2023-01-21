
package net.lepidodendron.entity;

import com.google.common.base.Predicate;
import net.ilexiconn.llibrary.client.model.tools.ChainBuffer;
import net.ilexiconn.llibrary.server.animation.AnimationHandler;
import net.lepidodendron.LepidodendronConfig;
import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.ai.*;
import net.lepidodendron.entity.base.EntityPrehistoricFloraAgeableBase;
import net.lepidodendron.entity.base.EntityPrehistoricFloraAgeableFishBase;
import net.lepidodendron.entity.base.EntityPrehistoricFloraAmphibianBase;
import net.lepidodendron.entity.base.EntityPrehistoricFloraFishBase;
import net.lepidodendron.entity.render.entity.RenderMussaurus;
import net.lepidodendron.entity.render.entity.RenderShonisaurus;
import net.lepidodendron.entity.render.tile.RenderDisplays;
import net.minecraft.client.model.ModelBase;
import net.minecraft.entity.*;
import net.minecraft.entity.passive.EntitySquid;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
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
import net.minecraftforge.oredict.OreDictionary;

import javax.annotation.Nullable;

public class EntityPrehistoricFloraShonisaurus extends EntityPrehistoricFloraAgeableFishBase {

	public BlockPos currentTarget;
	@SideOnly(Side.CLIENT)
	public ChainBuffer chainBuffer;

	public EntityPrehistoricFloraShonisaurus(World world) {
		super(world);
		setSize(0.9F, 0.9F);
		experienceValue = 0;
		this.isImmuneToFire = false;
		setNoAI(!true);
		enablePersistence();
		//minSize = 0.1F;
		//maxSize = 1.0F;
		minWidth = 0.15F;
		maxWidth = 3.59F;
		maxHeight = 3.99F;
		maxHealthAgeable = 100.0D;
	}

	@SideOnly(Side.CLIENT)
	public AxisAlignedBB getRenderBoundingBox()
	{
		if (LepidodendronConfig.renderBigMobsProperly) {
			return this.getEntityBoundingBox().grow(2.5, 0.25, 2.5);
		}
		return this.getEntityBoundingBox();
	}

	@Override
	public boolean isSmall() {
		return this.getAgeScale() < 0.075;
	}

	public static String getPeriod() {return "Triassic";}

	//public static String getHabitat() {return "Aquatic Ichthyosaur";}

	@Override
	public int airTime() {
		return 10000;
	}

	@Override
	public EntityPrehistoricFloraAgeableBase createPFChild(EntityPrehistoricFloraAgeableBase entity) {
		return new EntityPrehistoricFloraShonisaurus(this.world);
	}

	@Override
	public boolean dropsEggs() {
		return false;
	}

	@Override
	public boolean laysEggs() {
		return false;
	}

	@Override
	public boolean divesToLay() {
		return false;
	}

	@Override
	public int getAdultAge() {
		return 156000;
	}

	@Override
	protected float getAISpeedFish() {
		float AIspeed = 0.3549f;
		if (this.getIsFast()) {
			AIspeed = AIspeed * 2.0F;
		}
		return AIspeed;
	}

	@Override
	public void playLivingSound() {
		if (!this.isReallyInWater()) {
			return;
		}
		if (this.getAnimation() != null) {
			SoundEvent soundevent = null;
			if (this.world.isAirBlock(this.getPosition().up())) {
				soundevent = this.getBlowholeSound();
			}
			else {
				soundevent = this.getAmbientSound();
			}
			if (this.getAnimation() == NO_ANIMATION && !world.isRemote) {
				this.setAnimation(ROAR_ANIMATION);
				if (soundevent != null)
				{
					this.playSound(soundevent, this.getSoundVolume(), this.getSoundPitch());
				}
			}
		}
	}

	@Override
	protected boolean isBase() {
		return false;
	}

	protected void initEntityAI() {
		tasks.addTask(0, new EntityMateAI(this, 1.0D));
		tasks.addTask(1, new EntityTemptAI(this, 1, false, true, (float) this.getEntityAttribute(SharedMonsterAttributes.ATTACK_DAMAGE).getAttributeValue()));
		tasks.addTask(2, new AttackAI(this, 1.0D, false, this.getAttackLength()));
		tasks.addTask(3, new AgeableFishWander(this, NO_ANIMATION, 0.1, -5, true));
		this.targetTasks.addTask(0, new EatFishItemsAI(this));
		this.targetTasks.addTask(0, new EatMeatItemsAI(this));
		this.targetTasks.addTask(1, new EntityHurtByTargetSmallerThanMeAI(this, false));
		this.targetTasks.addTask(1, new HuntPlayerAlwaysAI(this, EntityPlayer.class, true, (Predicate<Entity>) entity -> entity instanceof EntityLivingBase));
		this.targetTasks.addTask(3, new HuntAI(this, EntityPlayer.class, true, (Predicate<Entity>) entity -> entity instanceof EntityLivingBase));
		this.targetTasks.addTask(4, new HuntAI(this, EntityPrehistoricFloraFishBase.class, true, (Predicate<Entity>) entity -> entity instanceof EntityLivingBase));
		this.targetTasks.addTask(4, new HuntSmallerThanMeAIAgeable(this, EntityPrehistoricFloraAgeableFishBase.class, true, (Predicate<Entity>) entity -> entity instanceof EntityLivingBase, 0.2));
		this.targetTasks.addTask(4, new HuntSmallerThanMeAIAgeable(this, EntityPrehistoricFloraAmphibianBase.class, true, (Predicate<Entity>) entity -> entity instanceof EntityLivingBase, 0.2));
		this.targetTasks.addTask(4, new HuntSmallerThanMeAIAgeable(this, EntityPrehistoricFloraAgeableBase.class, true, (Predicate<Entity>) entity -> entity instanceof EntityLivingBase, 0.2));
		this.targetTasks.addTask(4, new HuntSmallerThanMeAIAgeable(this, EntityLiving.class, true, (Predicate<Entity>) entity -> entity instanceof EntityLivingBase, 0.2));
		this.targetTasks.addTask(5, new HuntAI(this, EntitySquid.class, true, (Predicate<Entity>) entity -> entity instanceof EntityLivingBase));
		this.targetTasks.addTask(6, new HuntSmallerThanMeAIAgeable(this, EntityLivingBase.class, true, (Predicate<Entity>) entity -> entity instanceof EntityLivingBase, 0.2));
	}

	@Override
	public boolean isBreedingItem(ItemStack stack)
	{
		return (
			(OreDictionary.containsMatch(false, OreDictionary.getOres("listAllfishraw"), stack))
			|| (OreDictionary.containsMatch(false, OreDictionary.getOres("listAllmeatraw"), stack))
		);
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
	public boolean breaksBoat() {
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
	protected void applyEntityAttributes() {
		super.applyEntityAttributes();
		this.getAttributeMap().registerAttribute(SharedMonsterAttributes.ATTACK_DAMAGE);
		this.getEntityAttribute(SharedMonsterAttributes.ATTACK_DAMAGE).setBaseValue(12D);
		this.getEntityAttribute(SharedMonsterAttributes.FOLLOW_RANGE).setBaseValue(48.0D);
	}

	@Override
	public SoundEvent getAmbientSound() {
		return (SoundEvent) SoundEvent.REGISTRY
				.getObject(new ResourceLocation("lepidodendron:shonisaurus_idle"));
	}

	public SoundEvent getBlowholeSound() {
		return (SoundEvent) SoundEvent.REGISTRY
				.getObject(new ResourceLocation("lepidodendron:shonisaurus_blowhole"));
	}

	@Override
	public SoundEvent getHurtSound(DamageSource ds) {
		if (this.isReallyInWater()) {
			return (SoundEvent) SoundEvent.REGISTRY
					.getObject(new ResourceLocation("lepidodendron:shonisaurus_hurt"));
		}
		else {
			return this.getBlowholeSound();
		}
	}

	@Override
	public SoundEvent getDeathSound() {
		return (SoundEvent) SoundEvent.REGISTRY
				.getObject(new ResourceLocation("lepidodendron:shonisaurus_death"));
	}

	@Override
	protected float getSoundVolume() {
		return 1.0F + (this.getAgeScale() * 3F);
	}

	@Override
	public void onLivingUpdate() {
		super.onLivingUpdate();
		//this.renderYawOffset = this.rotationYaw;

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

	public boolean isDirectPathBetweenPoints(Vec3d vec1, Vec3d vec2) {
		RayTraceResult movingobjectposition = this.world.rayTraceBlocks(vec1, new Vec3d(vec2.x, vec2.y, vec2.z), false, true, false);
		return movingobjectposition == null || movingobjectposition.typeOfHit != RayTraceResult.Type.BLOCK;
	}

	@Nullable
	protected ResourceLocation getLootTable() {
		 		if (!this.isPFAdult()) {
			return LepidodendronMod.SHONISAURUS_LOOT_YOUNG;
		}
		return LepidodendronMod.SHONISAURUS_LOOT;
	}

	//Rendering taxidermy:
	//--------------------
	public static double offsetWall() {
		return -1.3;
	}
	public static double upperfrontverticallinedepth() {
		return 2;
	}
	public static double upperbackverticallinedepth() {
		return 1.5;
	}
	public static double upperfrontlineoffset() {
		return 2.3;
	}
	public static double upperfrontlineoffsetperpendiular() {
		return 1.1F;
	}
	public static double upperbacklineoffset() {
		return 2;
	}
	public static double upperbacklineoffsetperpendiular() {
		return -0.04F;
	}
	public static double lowerfrontverticallinedepth() {
		return 1.2;
	}
	public static double lowerbackverticallinedepth() {
		return 3.8;
	}
	public static double lowerfrontlineoffset() {
		return 2;
	}
	public static double lowerfrontlineoffsetperpendiular() {
		return 0.8F;
	}
	public static double lowerbacklineoffset() {
		return 3;
	}
	public static double lowerbacklineoffsetperpendiular() {
		return -0F;
	}
	@SideOnly(Side.CLIENT)
	public static ResourceLocation textureDisplay() {
		return RenderDisplays.TEXTURE_SHONISAURUS;
	}
	@SideOnly(Side.CLIENT)
	public static ModelBase modelDisplay() {
		return RenderDisplays.modelShonisaurus;
	}
	public static float getScaler() {
		return RenderShonisaurus.getScaler();
	}
}

