
package net.lepidodendron.entity;

import net.ilexiconn.llibrary.server.animation.Animation;
import net.ilexiconn.llibrary.server.animation.AnimationHandler;
import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.ai.*;
import net.lepidodendron.entity.base.EntityPrehistoricFloraAgeableBase;
import net.lepidodendron.entity.base.EntityPrehistoricFloraLandBase;
import net.minecraft.block.BlockDirectional;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.PropertyDirection;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.EnumCreatureAttribute;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.EntityAILookIdle;
import net.minecraft.entity.ai.EntityAIWatchClosest;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
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

public class EntityPrehistoricFloraProganochelys extends EntityPrehistoricFloraLandBase {

	public BlockPos currentTarget;
	@SideOnly(Side.CLIENT)
	//public ChainBuffer tailBuffer;
	public Animation HIDE_ANIMATION;
	private int inPFLove;

	public EntityPrehistoricFloraProganochelys(World world) {
		super(world);
		setSize(maxWidth, maxHeight);
		experienceValue = 0;
		this.isImmuneToFire = false;
		setNoAI(!true);
		enablePersistence();
		minWidth = 0.2F;
		maxWidth = 0.8F;
		maxHeight = 0.45F;
		maxHealthAgeable = 25.0D;
		HIDE_ANIMATION = Animation.create(this.hideAnimationLength());
	}

	@Override
	public int getEatLength() {
		return 40;
	}

	@Override
	public Animation[] getAnimations() {
		return new Animation[]{DRINK_ANIMATION, ATTACK_ANIMATION, ROAR_ANIMATION, LAY_ANIMATION, EAT_ANIMATION, MAKE_NEST_ANIMATION, HIDE_ANIMATION};
	}

	@Override
	public boolean attackEntityFrom(DamageSource ds, float i) {
		boolean result;
		if (ds.getTrueSource() instanceof EntityLivingBase && this.getAnimation() == HIDE_ANIMATION) {
			result = super.attackEntityFrom(ds, i/10F);
		}
		else {
			result = super.attackEntityFrom(ds, i);
		}
		if (result && ds.getTrueSource() instanceof EntityLivingBase) {
			this.setAnimation(HIDE_ANIMATION);
		}
		return result;
	}

	public int hideAnimationLength() {
		return 155;
	}

	@Override
	public int getEggType() {
		return 0; //small
	}

	public static String getPeriod() {return "Triassic";}

	//public static String getHabitat() {return "Terrestrial Diadectomorph";}

//	@Override
//	public boolean hasNest() {
//		return true;
//	}

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
	public boolean placesNest() {
		return true;
	}

	@Override
	public boolean isNestMound() {
		return true;
	}

	protected float getAISpeedLand() {
		float speedBase = 0.285F;
		if (this.getTicks() < 0) {
			return 0.0F; //Is laying eggs
		}
		if (this.getAnimation() == DRINK_ANIMATION || this.getAnimation() == MAKE_NEST_ANIMATION
			|| this.getAnimation() == HIDE_ANIMATION) {
			return 0.0F;
		}
		if (this.getIsFast()) {
			speedBase = speedBase * 1.9F;
		}
		return speedBase;
	}

	@Override
	public int getTalkInterval() {
		return 100;
	}

	@Override
	public int getAdultAge() {
		return 48000;
	}

	public AxisAlignedBB getAttackBoundingBox() {
		float size = this.getRenderSizeModifier() * 0.25F;
		return this.getEntityBoundingBox().grow(1.0F + size, 1.0F + size, 1.0F + size);
	}

	@Override
	public float getEyeHeight()
	{
		return Math.max(super.getEyeHeight(),  this.height * 1.05F);
	}

	protected void initEntityAI() {
		tasks.addTask(0, new EntityMateAIAgeableBase(this, 1.0D));
		tasks.addTask(1, new EntityTemptAI(this, 1, false, false, 0));
		tasks.addTask(2, new LandEntitySwimmingAI(this, 0.75, false));
		//tasks.addTask(3, new AttackAI(this, 1.6D, false, this.getAttackLength()));
		//tasks.addTask(4, new PanicAI(this, 1.0));
		tasks.addTask(3, new LandWanderNestInBlockAI(this));
		tasks.addTask(4, new LandWanderAvoidWaterAI(this, 1.0D, 60));
		tasks.addTask(5, new EntityAIWatchClosest(this, EntityPlayer.class, 6.0F));
		tasks.addTask(6, new EntityAIWatchClosest(this, EntityPrehistoricFloraAgeableBase.class, 8.0F));
		tasks.addTask(7, new EntityAILookIdle(this));
		this.targetTasks.addTask(0, new EatPlantItemsAI(this, 1D));
		}

//	@Override
//	public boolean panics() {
//		return true;
//	}

	@Override
	public boolean isBreedingItem(ItemStack stack)
	{
		return (
				(OreDictionary.containsMatch(false, OreDictionary.getOres("plant"), stack))
						//|| (OreDictionary.containsMatch(false, OreDictionary.getOres("listAllmeatraw"), stack))
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
		this.getAttributeMap().registerAttribute(SharedMonsterAttributes.ATTACK_DAMAGE);
		this.getEntityAttribute(SharedMonsterAttributes.ATTACK_DAMAGE).setBaseValue(1.0D);
		this.getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).setBaseValue(0.25D);
	}

	@Override
	public SoundEvent getAmbientSound() {
	    return (SoundEvent) SoundEvent.REGISTRY
	            .getObject(new ResourceLocation(""));
	}

	@Override
	public SoundEvent getHurtSound(DamageSource ds) {
	    return (SoundEvent) SoundEvent.REGISTRY
	            .getObject(new ResourceLocation("entity.generic.hurt"));
	}

	@Override
	public SoundEvent getDeathSound() {
	    return (SoundEvent) SoundEvent.REGISTRY
	            .getObject(new ResourceLocation("entity.generic.death"));
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

	public static final PropertyDirection FACING = BlockDirectional.FACING;

	public boolean testLay(World world, BlockPos pos) {
		return (
				nestBlockMatch(world, pos)
		);
	}

	@Override
	public boolean nestBlockMatch(World world, BlockPos pos) {
		boolean match = false;
		if (!match) {
			match = ((world.getBlockState(pos.down()).getMaterial() == Material.SAND
					&& world.getBlockState(pos.down()).getBlock() != Blocks.GRAVEL)
					&& world.isAirBlock(pos));
		}
		return match;
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
			return LepidodendronMod.PROGANOCHELYS_LOOT_YOUNG;
		}
		return LepidodendronMod.PROGANOCHELYS_LOOT;
	}

}