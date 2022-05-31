
package net.lepidodendron.entity;

import com.google.common.base.Predicate;
import net.ilexiconn.llibrary.client.model.tools.ChainBuffer;
import net.ilexiconn.llibrary.server.animation.AnimationHandler;
import net.lepidodendron.LepidodendronConfig;
import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.block.BlockAmphibianSpawnAcanthostega;
import net.lepidodendron.entity.ai.*;
import net.lepidodendron.entity.base.EntityPrehistoricFloraAgeableBase;
import net.lepidodendron.entity.base.EntityPrehistoricFloraAgeableFishBase;
import net.lepidodendron.entity.base.EntityPrehistoricFloraFishBase;
import net.lepidodendron.entity.base.EntityPrehistoricFloraSwimmingAmphibianBase;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.EnumCreatureAttribute;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.EntityAILookIdle;
import net.minecraft.entity.ai.EntityAIWatchClosest;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.SoundEvents;
import net.minecraft.item.ItemStack;
import net.minecraft.util.DamageSource;
import net.minecraft.util.EnumFacing;
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

public class EntityPrehistoricFloraAcanthostega extends EntityPrehistoricFloraSwimmingAmphibianBase {

	public BlockPos currentTarget;
	@SideOnly(Side.CLIENT)
	public ChainBuffer chainBuffer;
	//public static final SoundEvent LIMNOSCELIS_ROAR = create("limnoscelis_roar");

	public EntityPrehistoricFloraAcanthostega(World world) {
		super(world);
		setSize(0.6F, 0.35F);
		experienceValue = 0;
		this.isImmuneToFire = false;
		setNoAI(!true);
		enablePersistence();
		//minSize = 0.3F;
		//maxSize = 1.0F;
		minWidth = 0.1F;
		maxWidth = 0.3F;
		maxHeight = 0.25F;
		maxHealthAgeable = 10.0D;
	}

	public static String getPeriod() {return "Devonian";}

	public static String getHabitat() {return "Amphibious";}

	@Override
	public boolean dropsEggs() {
		return false;
	}
	
	@Override
	public boolean laysEggs() {
		return false;
	}

	protected float getAISpeedSwimmingAmphibian() {
		float calcSpeed = 0.10F;
		if (this.isReallyInWater()) {
			calcSpeed= 0.28f;
		}
		if (this.getTicks() < 0) {
			return 0.0F; //Is laying eggs
		}
		if (this.getIsFast() && this.isReallyInWater()) {
			calcSpeed = calcSpeed * 1.52F;
		}
		return Math.min(1F, (this.getAgeScale() * 2F)) * calcSpeed;
	}

	@Override
	public int getAdultAge() {
		return 64000;
	}

	@Override
	public int WaterDist() {
		int i = (int) LepidodendronConfig.waterAcanthostega;
		if (i > 16) {i = 16;}
		if (i < 1) {i = 1;}
		return i;
	}


	public AxisAlignedBB getAttackBoundingBox() {
		float size = this.getRenderSizeModifier() * 0.25F;
		return this.getEntityBoundingBox().grow(0.0F + size, 0.0F + size, 0.0F + size);
	}

	protected void initEntityAI() {
		tasks.addTask(0, new EntityMateAIAgeableBase(this, 1.0D));
		tasks.addTask(1, new AttackAI(this, 1.0D, false, this.getAttackLength()));
		tasks.addTask(2, new AmphibianWander(this, NO_ANIMATION, 0.95, 60));
		tasks.addTask(3, new EntityAIWatchClosest(this, EntityPlayer.class, 6.0F));
		tasks.addTask(3, new EntityAIWatchClosest(this, EntityPrehistoricFloraFishBase.class, 8.0F));
		tasks.addTask(3, new EntityAIWatchClosest(this, EntityPrehistoricFloraAgeableBase.class, 8.0F));
		tasks.addTask(4, new EntityAILookIdle(this));
		this.targetTasks.addTask(0, new EatFishItemsAI(this));
		this.targetTasks.addTask(1, new EntityHurtByTargetSmallerThanMeAI(this, false));
		this.targetTasks.addTask(3, new HuntAI(this, EntityPrehistoricFloraFishBase.class, true, (Predicate<Entity>) entity -> entity instanceof EntityLivingBase));
		this.targetTasks.addTask(3, new HuntSmallerThanMeAIAgeable(this, EntityPrehistoricFloraAgeableFishBase.class, true, (Predicate<Entity>) entity -> entity instanceof EntityLivingBase, 0));
	}

	@Override
	public boolean isBreedingItem(ItemStack stack)
	{
		return (OreDictionary.containsMatch(false, OreDictionary.getOres("listAllfishraw"), stack));
	}

	@Override
	public boolean isAIDisabled() {
		return false;
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
		this.getEntityAttribute(SharedMonsterAttributes.ATTACK_DAMAGE).setBaseValue(2.0D);
		this.getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).setBaseValue(0.25D);
	}

	@Override
	protected boolean canTriggerWalking() {
		return true;
	}

	@Override
	public SoundEvent getAmbientSound() {
	    return (SoundEvent) SoundEvent.REGISTRY
	            .getObject(new ResourceLocation("lepidodendron:acanthostega_idle"));
	}

	@Override
	public SoundEvent getHurtSound(DamageSource ds) {
	    return (SoundEvent) SoundEvent.REGISTRY
	            .getObject(new ResourceLocation("lepidodendron:acanthostega_hurt"));
	}

	//@Override
	//public SoundEvent getHurtSound(DamageSource ds) {
	//	return (SoundEvent) SoundEvent.REGISTRY.getObject(new ResourceLocation("entity.generic.hurt"));
	//}

	@Override
	public SoundEvent getDeathSound() {
	    return (SoundEvent) SoundEvent.REGISTRY
	            .getObject(new ResourceLocation("lepidodendron:acanthostega_death"));
	}

	//@Override
	//public SoundEvent getDeathSound() {
	//	return (SoundEvent) SoundEvent.REGISTRY.getObject(new ResourceLocation("entity.generic.death"));
	//}

	@Override
	protected float getSoundVolume() {
		return 1.0F;
	}

	@Override
	public boolean canBreatheUnderwater() {
		return true;
	}

	@Override
	public boolean getCanSpawnHere() {
		return this.posY < (double) this.world.getSeaLevel() && this.isInWater();
	}

	public boolean isNotColliding() {
		return this.world.checkNoEntityCollision(this.getEntityBoundingBox(), this);
	}

	@Override
	protected int getExperiencePoints(EntityPlayer player) {
		return 2 + this.world.rand.nextInt(3);
	}

	@Override
	public boolean isOnLadder() {
		return false;
	}

	@Override
	public void onLivingUpdate() {
		super.onLivingUpdate();
		this.renderYawOffset = this.rotationYaw;

		if (this.getAnimation() == ATTACK_ANIMATION && this.getAnimationTick() == 5 && this.getAttackTarget() != null) {
			launchAttack();
		}

		AnimationHandler.INSTANCE.updateAnimations(this);

	}

	@Override
	public void onEntityUpdate() {
		super.onEntityUpdate();

		//Lay eggs perhaps:
		if (!world.isRemote && spaceCheckEggs() && this.isInWater() && this.isPFAdult() && this.getCanBreed() && LepidodendronConfig.doMultiplyMobs && this.getTicks() > 0
				&& (BlockAmphibianSpawnAcanthostega.block.canPlaceBlockOnSide(world, this.getPosition(), EnumFacing.UP)
				|| BlockAmphibianSpawnAcanthostega.block.canPlaceBlockOnSide(world, this.getPosition().down(), EnumFacing.UP))
				&& (BlockAmphibianSpawnAcanthostega.block.canPlaceBlockAt(world, this.getPosition())
				|| BlockAmphibianSpawnAcanthostega.block.canPlaceBlockAt(world, this.getPosition().down()))
		){
			if (Math.random() > 0.5) {
				this.setTicks(-50); //Flag this as stationary for egg-laying
			}
		}
		if (!world.isRemote && spaceCheckEggs() && this.isInWater() && this.isPFAdult() && this.getTicks() > -30 && this.getTicks() < 0 && LepidodendronConfig.doMultiplyMobs) {
			//Is stationary for egg-laying:
			IBlockState eggs = BlockAmphibianSpawnAcanthostega.block.getDefaultState();
			if (BlockAmphibianSpawnAcanthostega.block.canPlaceBlockOnSide(world, this.getPosition(), EnumFacing.UP) && BlockAmphibianSpawnAcanthostega.block.canPlaceBlockAt(world, this.getPosition())) {
				world.setBlockState(this.getPosition(), eggs);
				this.playSound(SoundEvents.ENTITY_CHICKEN_EGG, 1.0F, (this.rand.nextFloat() - this.rand.nextFloat()) * 0.2F + 1.0F);
			}
			if (BlockAmphibianSpawnAcanthostega.block.canPlaceBlockOnSide(world, this.getPosition().down(), EnumFacing.UP) && BlockAmphibianSpawnAcanthostega.block.canPlaceBlockAt(world, this.getPosition().down())) {
				world.setBlockState(this.getPosition().down(), eggs);
				this.playSound(SoundEvents.ENTITY_CHICKEN_EGG, 1.0F, (this.rand.nextFloat() - this.rand.nextFloat()) * 0.2F + 1.0F);
			}
			this.setTicks(0);
		}
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
			return LepidodendronMod.ACANTHOSTEGA_LOOT_YOUNG;
		}
		return LepidodendronMod.ACANTHOSTEGA_LOOT;
	}

}