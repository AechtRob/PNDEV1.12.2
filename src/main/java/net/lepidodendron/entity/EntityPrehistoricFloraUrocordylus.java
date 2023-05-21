
package net.lepidodendron.entity;

import com.google.common.base.Predicate;
import net.ilexiconn.llibrary.client.model.tools.ChainBuffer;
import net.ilexiconn.llibrary.server.animation.AnimationHandler;
import net.lepidodendron.LepidodendronConfig;
import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.block.BlockAmphibianSpawnUrocordylus;
import net.lepidodendron.entity.ai.*;
import net.lepidodendron.entity.base.EntityPrehistoricFloraAgeableBase;
import net.lepidodendron.entity.base.EntityPrehistoricFloraFishBase;
import net.lepidodendron.entity.base.EntityPrehistoricFloraSwimmingAmphibianBase;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.EnumCreatureAttribute;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.EntityAILookIdle;
import net.minecraft.entity.ai.EntityAIWatchClosest;
import net.minecraft.entity.passive.EntitySquid;
import net.minecraft.entity.passive.EntityVillager;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.SoundEvents;
import net.minecraft.item.ItemStack;
import net.minecraft.util.DamageSource;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.FMLCommonHandler;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.oredict.OreDictionary;

import javax.annotation.Nullable;

public class EntityPrehistoricFloraUrocordylus extends EntityPrehistoricFloraSwimmingAmphibianBase {

	public BlockPos currentTarget;
	@SideOnly(Side.CLIENT)
	public ChainBuffer tailBuffer;
	//public static final SoundEvent Crassigyrinus_ROAR = create("Crassigyrinus_roar");

	public EntityPrehistoricFloraUrocordylus(World world) {
		super(world);
		setSize(0.2F, 0.1F);
		minWidth = 0.1F;
		maxWidth = 0.2F;
		maxHeight = 0.1F;
		maxHealthAgeable = 8.0D;
		if (FMLCommonHandler.instance().getSide().isClient()) {
			tailBuffer = new ChainBuffer();
		}
	}

	@Override
	public void onUpdate() {
		super.onUpdate();
		if (world.isRemote && !this.isAIDisabled()) {
			tailBuffer.calculateChainSwingBuffer(120, 5, 5F, this);
		}
	}

	@Override
	public boolean canJumpOutOfWater() {
		return false;
	}

	@Override
	public boolean isSmall() {
		return true;
	}

	public static String getPeriod() {return "Carboniferous";}

	public static String getHabitat() {return "Aquatic";}

	@Override
	public int getTalkInterval() {
		return 125;
	}

	@Override
	public boolean dropsEggs() {
		return false;
	}
	
	@Override
	public boolean laysEggs() {
		return false;
	}

	protected float getAISpeedSwimmingAmphibian() {
		float calcSpeed = 0.116F;
		if (this.isReallyInWater()) {
			calcSpeed= 0.2f;
		}
		//calcSpeed = 0;
		if (this.getTicks() < 0) {
			//System.err.println("Laying");
			return 0.0F; //Is laying eggs
		}
        if (this.getIsFast() && this.isReallyInWater()) {
            calcSpeed = calcSpeed * 1.52F;
        }
		return Math.min(1F, (this.getAgeScale() * 2F)) * calcSpeed;
	}

	@Override
	public int getAdultAge() {
		return 72000;
	}

	@Override
	public int WaterDist() {
		int i = (int) LepidodendronConfig.waterCrassigyrinus;
		if (i > 16) {i = 16;}
		if (i < 1) {i = 1;}
		return i;
	}

	public AxisAlignedBB getAttackBoundingBox() {
		float size = this.getRenderSizeModifier() * 0.25F;
		return this.getEntityBoundingBox().grow(1.0F + size, 1.0F + size, 1.0F + size);
	}

	protected void initEntityAI() {
		tasks.addTask(0, new EntityMateAIAgeableBase(this, 1.0D));
		tasks.addTask(1, new EntityTemptAI(this, 1, false, true, (float) this.getEntityAttribute(SharedMonsterAttributes.ATTACK_DAMAGE).getAttributeValue() * 0.33F));
		tasks.addTask(2, new AttackAI(this, 1.0D, false, this.getAttackLength()));
		tasks.addTask(3, new AmphibianWander(this, NO_ANIMATION, 1, 20));
		tasks.addTask(4, new EntityAIWatchClosest(this, EntityPlayer.class, 6.0F));
		tasks.addTask(4, new EntityAIWatchClosest(this, EntityPrehistoricFloraFishBase.class, 8.0F));
		tasks.addTask(4, new EntityAIWatchClosest(this, EntityPrehistoricFloraAgeableBase.class, 8.0F));
		tasks.addTask(5, new EntityAILookIdle(this));
		this.targetTasks.addTask(0, new EatFishItemsAI(this));
		this.targetTasks.addTask(0, new EatMeatItemsAI(this));
		this.targetTasks.addTask(1, new EntityHurtByTargetSmallerThanMeAI(this, false));
		this.targetTasks.addTask(2, new HuntPlayerAlwaysAI(this, EntityPlayer.class, true, (Predicate<Entity>) entity -> entity instanceof EntityLivingBase));
		this.targetTasks.addTask(3, new HuntAI(this, EntityPlayer.class, true, (Predicate<Entity>) entity -> entity instanceof EntityLivingBase));
		this.targetTasks.addTask(3, new HuntAI(this, EntityVillager.class, true, (Predicate<Entity>) entity -> entity instanceof EntityLivingBase));
		this.targetTasks.addTask(3, new HuntAI(this, EntityPrehistoricFloraFishBase.class, true, (Predicate<Entity>) entity -> entity instanceof EntityLivingBase));
		this.targetTasks.addTask(3, new HuntAI(this, EntitySquid. class, true, (Predicate<Entity>) entity -> entity instanceof EntityLivingBase));
		this.targetTasks.addTask(3, new HuntAI(this, EntityPrehistoricFloraAmphibamus.class, true, (Predicate<Entity>) entity -> entity instanceof EntityLivingBase));
		this.targetTasks.addTask(4, new HuntSmallerThanMeAIAgeable(this, EntityLivingBase.class, true, (Predicate<Entity>) entity -> entity instanceof EntityLivingBase, 0.15));
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
		this.getEntityAttribute(SharedMonsterAttributes.ATTACK_DAMAGE).setBaseValue(1.0D);
		this.getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).setBaseValue(0.25D);
	}

	@Override
	protected boolean canTriggerWalking() {
		return false;
	}

	@Override
	public net.minecraft.util.SoundEvent getAmbientSound() {
	    return (net.minecraft.util.SoundEvent) net.minecraft.util.SoundEvent.REGISTRY
	            .getObject(new ResourceLocation("lepidodendron:urocordylus_idle"));
	}

	@Override
	public net.minecraft.util.SoundEvent getHurtSound(DamageSource ds) {
	    return (net.minecraft.util.SoundEvent) net.minecraft.util.SoundEvent.REGISTRY
	            .getObject(new ResourceLocation("lepidodendron:urocordylus_hurt"));
	}

	@Override
	public net.minecraft.util.SoundEvent getDeathSound() {
	    return (net.minecraft.util.SoundEvent) net.minecraft.util.SoundEvent.REGISTRY
	            .getObject(new ResourceLocation("lepidodendron:urocordylus_death"));
	}

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
	public void onEntityUpdate() {
		super.onEntityUpdate();

		//Lay eggs perhaps:
		if (!world.isRemote && spaceCheckEggs() && this.isInWater() && this.isPFAdult() && this.getCanBreed() && (LepidodendronConfig.doMultiplyMobs || this.getLaying()) && this.getTicks() > 0
				&& (BlockAmphibianSpawnUrocordylus.block.canPlaceBlockOnSide(world, this.getPosition(), EnumFacing.UP)
				|| BlockAmphibianSpawnUrocordylus.block.canPlaceBlockOnSide(world, this.getPosition().down(), EnumFacing.UP))
				&& (BlockAmphibianSpawnUrocordylus.block.canPlaceBlockAt(world, this.getPosition())
				|| BlockAmphibianSpawnUrocordylus.block.canPlaceBlockAt(world, this.getPosition().down()))
		){
			//if (Math.random() > 0.5) {
				this.setTicks(-50); //Flag this as stationary for egg-laying
			//}
		}

		if (!world.isRemote && spaceCheckEggs() && this.isInWater() && this.isPFAdult() && this.getTicks() > -30 && this.getTicks() < 0) {
			//Is stationary for egg-laying:
			//System.err.println("Test2");
			IBlockState eggs = BlockAmphibianSpawnUrocordylus.block.getDefaultState();
			if (BlockAmphibianSpawnUrocordylus.block.canPlaceBlockOnSide(world, this.getPosition(), EnumFacing.UP) && BlockAmphibianSpawnUrocordylus.block.canPlaceBlockAt(world, this.getPosition())) {
				world.setBlockState(this.getPosition(), eggs);
				this.setLaying(false);
				this.playSound(SoundEvents.ENTITY_CHICKEN_EGG, 1.0F, (this.rand.nextFloat() - this.rand.nextFloat()) * 0.2F + 1.0F);
			}
			if (BlockAmphibianSpawnUrocordylus.block.canPlaceBlockOnSide(world, this.getPosition().down(), EnumFacing.UP) && BlockAmphibianSpawnUrocordylus.block.canPlaceBlockAt(world, this.getPosition().down())) {
				world.setBlockState(this.getPosition().down(), eggs);
				this.setLaying(false);
				this.playSound(SoundEvents.ENTITY_CHICKEN_EGG, 1.0F, (this.rand.nextFloat() - this.rand.nextFloat()) * 0.2F + 1.0F);
			}
			this.setTicks(0);
		}
	}

	@Nullable
	protected ResourceLocation getLootTable() {
		return LepidodendronMod.UROCORDYLUS_LOOT;
	}

}