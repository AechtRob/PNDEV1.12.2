
package net.lepidodendron.entity;

import net.ilexiconn.llibrary.client.model.tools.ChainBuffer;
import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.ai.*;
import net.lepidodendron.entity.base.EntityPrehistoricFloraAgeableBase;
import net.lepidodendron.entity.render.entity.RenderHyperodapedon;
import net.lepidodendron.entity.render.tile.RenderDisplays;
import net.lepidodendron.entity.util.ITrappableLand;
import net.lepidodendron.item.ItemRoots;
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
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.SoundEvents;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.*;
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

public class EntityPrehistoricFloraHyperodapedon extends EntityPrehistoricFloraDiictodon implements ITrappableLand {

	public BlockPos currentTarget;
	@SideOnly(Side.CLIENT)
	public ChainBuffer tailBuffer;

	public EntityPrehistoricFloraHyperodapedon(World world) {
		super(world);
		setSize(0.64F, 0.45F);
		minWidth = 0.18F;
		maxWidth = 0.64F;
		maxHeight = 0.45F;
		maxHealthAgeable = 18.0D;
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
	}

	@Override
	public int getEggType(@Nullable String variantIn) {
		return 1; //medium
	}

	public static String getPeriod() {return "Triassic";}

	@Override
	public boolean hasNest() {
		return true;
	}

	@Override
	public boolean hasAlarm() {
		return false;
	}

	@Override
	public boolean hasLargeBurrow() {
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
		float speedBase = 0.235F;
		if (this.getTicks() < 0) {
			return 0.0F; //Is laying eggs
		}
		if (this.getAnimation() == DRINK_ANIMATION || this.getAnimation() == MAKE_NEST_ANIMATION || this.getAnimation() == GRAZE_ANIMATION) {
			return 0.0F;
		}
		if (this.getIsFast()) {
			speedBase = speedBase * 1.86F;
		}
		return speedBase;
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
		return Math.max(super.getEyeHeight(), this.height * 0.9F);
	}

	protected void initEntityAI() {
		tasks.addTask(0, new EntityMateAIAgeableBase(this, 1.0D));
		tasks.addTask(1, new EntityTemptAI(this, 1, false, true, 0));
		tasks.addTask(2, new LandEntitySwimmingAI(this, 0.75, false));
		tasks.addTask(3, new NightFindNestAI(this));
		tasks.addTask(4, new AttackAI(this, 1.0D, false, this.getAttackLength()));
		tasks.addTask(5, new PanicAI(this, 1.0));
		tasks.addTask(6, new AvoidEntityPN<>(this, EntityLivingBase.class, 6.0F, true));
		tasks.addTask(7, new LandWanderNestAI(this));
		tasks.addTask(8, new LandWanderFollowParent(this, 1.05D));
		tasks.addTask(9, new LandWanderHerd(this, 1.00D, Math.max(1F, this.width) * this.getNavigator().getPathSearchRange() * 0.75F));
		tasks.addTask(10, new LandWanderAvoidWaterAI(this, 1.0D));
		tasks.addTask(11, new EntityWatchClosestAI(this, EntityPlayer.class, 6.0F));
		tasks.addTask(12, new EntityWatchClosestAI(this, EntityPrehistoricFloraAgeableBase.class, 8.0F));
		tasks.addTask(13, new EntityLookIdleAI(this));
		this.targetTasks.addTask(0, new EatItemsEntityPrehistoricFloraAgeableBaseAI(this, 1));
		this.targetTasks.addTask(1, new EntityHurtByTargetSmallerThanMeAI(this, false));
	}

	@Override
	public String[] getFoodOreDicts() {
		return ArrayUtils.addAll(DietString.ROOTS, DietString.PLANTS);
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
	public boolean drinksWater() {
		return false; //grazes, does not drink
	}

	@Override
	public int getDrinkLength() {
		return 86;  //grazes, does not drink
	}

	@Override
	public int getDrinkCooldown() {
		return 400;
	}
	@Override
	public int getEatLength() {
		return 10;
	}

	private boolean isBlockGrazable(IBlockState state) {
		return (state.getMaterial() == Material.GROUND || state.getMaterial() == Material.SAND);
	}

	private boolean isGrazable(World world, BlockPos pos, EnumFacing facing) {
		if (world.getBlockState(pos.offset(facing)).getBlock().causesSuffocation(world.getBlockState(pos.offset(facing)))) {
			return false;
		}
		return true;
	}

	@Override
	public boolean isDrinking()
	{
		//Is GRAZING!
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
						(isBlockGrazable(this.world.getBlockState(entityPos.north().down()))
								&& isGrazable(this.world, entityPos, EnumFacing.NORTH))

								|| (isBlockGrazable(this.world.getBlockState(entityPos.south().down()))
								&& isGrazable(this.world, entityPos, EnumFacing.SOUTH))

								|| (isBlockGrazable(this.world.getBlockState(entityPos.east().down()))
								&& isGrazable(this.world, entityPos, EnumFacing.EAST))

								|| (isBlockGrazable(this.world.getBlockState(entityPos.west().down()))
								&& isGrazable(this.world, entityPos, EnumFacing.WEST))
				)
		);
		if (test) {
			//Which one is Grazable?
			EnumFacing facing = null;
			if (!test2 && isBlockGrazable(this.world.getBlockState(entityPos.north().down()))) {
				facing = EnumFacing.NORTH;
				if (Functions.getEntityCentre(this).z - Functions.getEntityBlockPos(this).getZ() <= 0.5D) {
					test2 = true;
				}
			}
			else if (!test2 && isBlockGrazable(this.world.getBlockState(entityPos.south().down()))) {
				facing = EnumFacing.SOUTH;
				if (Functions.getEntityCentre(this).z - Functions.getEntityBlockPos(this).getZ() >= 0.5D) {
					test2 = true;
				}
			}
			else if (!test2 && isBlockGrazable(this.world.getBlockState(entityPos.east().down()))) {
				facing = EnumFacing.EAST;
				if (Functions.getEntityCentre(this).z - Functions.getEntityBlockPos(this).getX() >= 0.5D) {
					test2 = true;
				}
			}
			else if (!test2 && isBlockGrazable(this.world.getBlockState(entityPos.west().down()))) {
				facing = EnumFacing.WEST;
				if (Functions.getEntityCentre(this).z - Functions.getEntityBlockPos(this).getX() <= 0.5D) {
					test2 = true;
				}
			}
			if (facing != null && test && test2) {
				this.setDrinkingFrom(entityPos.offset(facing).down());
				this.faceBlock(this.getDrinkingFrom(), 10F, 10F);
			}
		}
		return test && test2;

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
	            .getObject(new ResourceLocation("lepidodendron:hyperodapedon_idle"));
	}

	@Override
	public SoundEvent getHurtSound(DamageSource ds) {
	    return (SoundEvent) SoundEvent.REGISTRY
	            .getObject(new ResourceLocation("lepidodendron:hyperodapedon_hurt"));
	}

	@Override
	public SoundEvent getDeathSound() {
	    return (SoundEvent) SoundEvent.REGISTRY
	            .getObject(new ResourceLocation("lepidodendron:hyperodapedon_death"));
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

		if (this.getAnimation() == DRINK_ANIMATION) {
			//roots are generated with this block of code
			if ((!world.isRemote) && this.getAnimationTick() == Math.round(this.getAnimation().getDuration() * 0.75F)) {
				ItemStack stack = new ItemStack(ItemRoots.block, 1);
				int i = this.rand.nextInt(8);
				boolean roots = false;
				for (int ii = 4; ii < i; ii++) {
					EntityItem entityToSpawn = new EntityItem(world, this.getDrinkingFrom().getX() + 0.5, this.getDrinkingFrom().getY() + 1, this.getDrinkingFrom().getZ() + 0.5, stack);
					entityToSpawn.setPickupDelay(20);
					entityToSpawn.addVelocity((world.rand.nextInt(3) - 1) * 0.05F,(world.rand.nextInt(3) + 1) * 0.05F,(world.rand.nextInt(3) - 1) * 0.05F);
					world.spawnEntity(entityToSpawn);
					roots = true;
				}
				if (roots) {
					world.playSound(null, this.getDrinkingFrom(), SoundEvents.ENTITY_CHICKEN_EGG, SoundCategory.BLOCKS, 0.5F, 1.0F + (world.rand.nextFloat() - world.rand.nextFloat()) * 0.8F);
				}
			}
		}

		if (this.getAnimation() == ATTACK_ANIMATION && this.getAnimationTick() == 11 && this.getAttackTarget() != null) {
			launchAttack();
		}

		//AnimationHandler.INSTANCE.updateAnimations(this);

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

	public boolean isDirectPathBetweenPoints(Vec3d vec1, Vec3d vec2) {
		RayTraceResult movingobjectposition = this.world.rayTraceBlocks(vec1, new Vec3d(vec2.x, vec2.y, vec2.z), false, true, false);
		return movingobjectposition == null || movingobjectposition.typeOfHit != RayTraceResult.Type.BLOCK;
	}

	@Nullable
	protected ResourceLocation getLootTable() {
		if (!this.isPFAdult()) {
			return LepidodendronMod.HYPERODAPEDON_LOOT_YOUNG;
		}
		return LepidodendronMod.HYPERODAPEDON_LOOT;
	}

	//Rendering taxidermy:
	//--------------------
	public static double offsetWall(@Nullable String variant) {
		return -0.075;
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
		return 0.0;
	}
	public static double lowerbackverticallinedepth(@Nullable String variant) {
		return 0.0;
	}
	public static double lowerfrontlineoffset(@Nullable String variant) {
		return 0.0;
	}
	public static double lowerfrontlineoffsetperpendiular(@Nullable String variant) {
		return 0.0;
	}
	public static double lowerbacklineoffset(@Nullable String variant) {
		return 0.0;
	}
	public static double lowerbacklineoffsetperpendiular(@Nullable String variant) {
		return 0.0;
	}
	@SideOnly(Side.CLIENT)
	public static ResourceLocation textureDisplay(@Nullable String variant) {
		return RenderHyperodapedon.TEXTURE;
	}
	@SideOnly(Side.CLIENT)
	public static ModelBase modelDisplay(@Nullable String variant) {
		return RenderDisplays.modelHyperodapedon;
	}
	public static float getScaler(@Nullable String variant) {
		return RenderHyperodapedon.getScaler();
	}

	@Nullable
	@Override
	public CustomTrigger getModTrigger() {
		return ModTriggers.CLICK_HYPERODAPEDON;
	}


}