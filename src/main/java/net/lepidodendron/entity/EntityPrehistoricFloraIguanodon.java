
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
import net.lepidodendron.entity.base.EntityPrehistoricFloraLandBase;
import net.lepidodendron.entity.util.IBluffer;
import net.lepidodendron.entity.util.ITrappableLand;
import net.lepidodendron.util.CustomTrigger;
import net.lepidodendron.util.Functions;
import net.lepidodendron.util.ModTriggers;
import net.minecraft.block.BlockDirectional;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.PropertyDirection;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EnumCreatureAttribute;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
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

public class EntityPrehistoricFloraIguanodon extends EntityPrehistoricFloraLandBase implements IAdvancementGranter, IBluffer, ITrappableLand {

	public BlockPos currentTarget;
	@SideOnly(Side.CLIENT)
	public ChainBuffer tailBuffer;
	private int standCooldown;

	public EntityPrehistoricFloraIguanodon(World world) {
		super(world);
		setSize(1.5F, 2.5F);
		minWidth = 0.20F;
		maxWidth = 1.5F;
		maxHeight = 2.5F;
		maxHealthAgeable = 120.0D;
		if (FMLCommonHandler.instance().getSide().isClient()) {
			tailBuffer = new ChainBuffer();
		}
	}

	@Override
	public boolean drinksWater() {
		return false;
	}

	@Override
	public int getGrazeCooldown() {
		return 2400;
	}

	@Override
	public int getDrinkCooldown() {
		return 600;
	}


	private boolean isBlockGrazable(IBlockState state) {
		return (state.getMaterial() == Material.LEAVES || state.getMaterial() == Material.PLANTS);
	}

	private boolean isGrazable(World world, BlockPos pos, EnumFacing facing) {
		return true;
	}

	@Override
	public boolean isGrazing()
	{
		if (!this.isPFAdult()) {
			return false;
		}

		BlockPos entityPos = Functions.getEntityBlockPos(this);

		boolean test2 = false;
		boolean test = (this.getPFGrazing() <= 0
				&& !world.isRemote
				&& !this.getIsFast()
				//&& !this.getIsMoving()
				&& this.GRAZE_ANIMATION.getDuration() > 0
				&& this.getAnimation() == NO_ANIMATION
				&& !this.isReallyInWater()
				&&
				(
						(isBlockGrazable(this.world.getBlockState(entityPos.north()))
								&& isGrazable(this.world, entityPos, EnumFacing.NORTH))

								|| (isBlockGrazable(this.world.getBlockState(entityPos.south()))
								&& isGrazable(this.world, entityPos, EnumFacing.SOUTH))

								|| (isBlockGrazable(this.world.getBlockState(entityPos.east()))
								&& isGrazable(this.world, entityPos, EnumFacing.EAST))

								|| (isBlockGrazable(this.world.getBlockState(entityPos.west()))
								&& isGrazable(this.world, entityPos, EnumFacing.WEST))
				)
		);
		if (test) {
			//Which one is Grazable?
			EnumFacing facing = null;
			if (!test2 && isBlockGrazable(this.world.getBlockState(entityPos.north()))) {
				facing = EnumFacing.NORTH;
				if (Functions.getEntityCentre(this).z - Functions.getEntityBlockPos(this).getZ() >= 0.7D
						&& Functions.getEntityCentre(this).z - Functions.getEntityBlockPos(this).getZ() <= 0.9D) {
					test2 = true;
				}
			}
			else if (!test2 && isBlockGrazable(this.world.getBlockState(entityPos.south()))) {
				facing = EnumFacing.SOUTH;
				if (Functions.getEntityCentre(this).z - Functions.getEntityBlockPos(this).getZ() >= 0.7D
						&& Functions.getEntityCentre(this).z - Functions.getEntityBlockPos(this).getZ() <= 0.9D) {
					test2 = true;
				}
			}
			else if (!test2 && isBlockGrazable(this.world.getBlockState(entityPos.east()))) {
				facing = EnumFacing.EAST;
				if (Functions.getEntityCentre(this).x - Functions.getEntityBlockPos(this).getX() >= 0.7D
						&& Functions.getEntityCentre(this).x - Functions.getEntityBlockPos(this).getX() <= 0.9D) {
					test2 = true;
				}
			}
			else if (!test2 && isBlockGrazable(this.world.getBlockState(entityPos.west()))) {
				facing = EnumFacing.WEST;
				if (Functions.getEntityCentre(this).x - Functions.getEntityBlockPos(this).getX() >= 0.7D
						&& Functions.getEntityCentre(this).x - Functions.getEntityBlockPos(this).getX() <= 0.9D) {
					test2 = true;
				}
			}
			if (facing != null && test && test2) {
				this.setGrazingFrom(entityPos.offset(facing));
				this.faceBlock(this.getGrazingFrom(), 10F, 10F);
			}
		}
		return test && test2;

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
		return new Animation[]{ATTACK_ANIMATION, GRAZE_ANIMATION, ROAR_ANIMATION, LAY_ANIMATION, EAT_ANIMATION};
	}

	public static String getPeriod() {return "Early Cretaceous";}

	@Override
	public int getDrinkLength() {
		return 312;
	}

	@Override
	public int getGrazeLength() {
		return 312;
	}

	@Override
	public int getEatLength() {
		return 25;
	}

	@Override
	public boolean hasNest() {
		return true;
	}

	@Override
	public int getAttackLength() {
		return 15;
	}

	@Override
	public int getRoarLength() {
		return 45;
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
		float speedBase = 0.35F;
		if (this.getTicks() < 0) {
			return 0.0F; //Is laying eggs
		}
		if (this.getAnimation() == DRINK_ANIMATION || this.getAnimation() == GRAZE_ANIMATION || this.getAnimation() == MAKE_NEST_ANIMATION) {
			return 0.0F;
		}
		if (this.getIsFast()) {
			speedBase = speedBase * 1.9F;
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
		tasks.addTask(5, new PanicAI(this, 1.0));
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


	@Override
	public SoundEvent getAmbientSound() {
		return (SoundEvent) SoundEvent.REGISTRY
				.getObject(new ResourceLocation("lepidodendron:iguanodon_idle"));
	}

	@Override
	public SoundEvent getHurtSound(DamageSource ds) {
	    return (SoundEvent) SoundEvent.REGISTRY
	            .getObject(new ResourceLocation("lepidodendron:iguanodon_hurt"));
	}

	@Override
	public SoundEvent getDeathSound() {
	    return (SoundEvent) SoundEvent.REGISTRY
	            .getObject(new ResourceLocation("lepidodendron:iguanodon_death"));
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
		super.onEntityUpdate();
		//Sometimes stand up and look around:

	}

	@Override
	public void onLivingUpdate() {

		super.onLivingUpdate();
		//this.renderYawOffset = this.rotationYaw;

		if (this.getAnimation() == ATTACK_ANIMATION && this.getAttackTarget() != null) {
			if (this.getAnimationTick() == 10) {
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
			List<EntityPrehistoricFloraIguanodon> Camptosaurus = this.world.getEntitiesWithinAABB(EntityPrehistoricFloraIguanodon.class, new AxisAlignedBB(this.getPosition().add(-12, -6, -12), this.getPosition().add(12, 6, 12)));
			for (EntityPrehistoricFloraIguanodon currentCamptosaurus : Camptosaurus) {
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
			return LepidodendronMod.IGUANODON_LOOT_YOUNG;
		}
		return LepidodendronMod.IGUANODON_LOOT;
	}

	@Nullable
	@Override
	public CustomTrigger getModTrigger() {
		return ModTriggers.CLICK_IGUANODON;
	}


	//Rendering taxidermy:
	//--------------------

}