
package net.lepidodendron.entity;

import net.ilexiconn.llibrary.client.model.tools.ChainBuffer;
import net.ilexiconn.llibrary.server.animation.AnimationHandler;
import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.block.*;
import net.lepidodendron.block.base.IAdvancementGranter;
import net.lepidodendron.entity.ai.*;
import net.lepidodendron.entity.base.EntityPrehistoricFloraAgeableBase;
import net.lepidodendron.entity.base.EntityPrehistoricFloraLandBase;
import net.lepidodendron.entity.render.entity.RenderDiictodon;
import net.lepidodendron.entity.render.tile.RenderDisplays;
import net.lepidodendron.entity.util.IScreamer;
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
import net.minecraft.init.Blocks;
import net.minecraft.init.SoundEvents;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.DamageSource;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundCategory;
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
import java.util.List;

public class EntityPrehistoricFloraDiictodon extends EntityPrehistoricFloraLandBase implements IScreamer, IAdvancementGranter, ITrappableLand {

	public BlockPos currentTarget;
	@SideOnly(Side.CLIENT)
	public ChainBuffer chainBuffer;
	private boolean screaming;
	public int screamAlarmCooldown;

	public EntityPrehistoricFloraDiictodon(World world) {
		super(world);
		setSize(0.30F, 0.25F);
		minWidth = 0.10F;
		maxWidth = 0.30F;
		maxHeight = 0.25F;
		maxHealthAgeable = 8.0D;
	}

	public static String getPeriod() {return "Permian";}

	//public static String getHabitat() {return "Terrestrial Dicynodont";}

	@Override
	public boolean hasNest() {
		return true;
	}

	public boolean hasAlarm() {
		return true;
	}

	public boolean hasLargeBurrow() {
		return false;
	}

	@Override
	public int getDrinkLength() {
		return 45;
	}

	@Override
	public boolean attackEntityFrom(DamageSource ds, float i) {
		Entity e = ds.getTrueSource();
		if (e instanceof EntityLivingBase && this.hasAlarm()
				&& (!(this instanceof EntityPrehistoricFloraRobertia))
				&& (!(this instanceof EntityPrehistoricFloraEosimops))
				&& (!(this instanceof EntityPrehistoricFloraProsictodon))) {
			EntityLivingBase ee = (EntityLivingBase) e;
			this.setAlarmTarget(ee);
			List<EntityPrehistoricFloraDiictodon> Diictodon = this.world.getEntitiesWithinAABB(EntityPrehistoricFloraDiictodon.class, new AxisAlignedBB(this.getPosition().add(-8, -4, -8), this.getPosition().add(8, 4, 8)));
			for (EntityPrehistoricFloraDiictodon currentDiictodon : Diictodon) {
				if (
					(!(currentDiictodon instanceof EntityPrehistoricFloraRobertia))
					&& (!(currentDiictodon instanceof EntityPrehistoricFloraEosimops))
					&& (!(currentDiictodon instanceof EntityPrehistoricFloraProsictodon))
				) {
					currentDiictodon.setRevengeTarget(ee);
					currentDiictodon.setAlarmTarget(ee);
					currentDiictodon.screamAlarmCooldown = rand.nextInt(20);
				}
			}
		}
		return super.attackEntityFrom(ds, i);
	}

	public void setScreaming(boolean screaming) {
		this.screaming = screaming;
	}

	public boolean getScreaming() {
		return this.screaming;
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
		float speedBase = 0.22F;
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
		return true;
	}

	@Override
	public float getEyeHeight()
	{
		return Math.max(super.getEyeHeight(), this.height * 1.05F);
	}

	protected void initEntityAI() {
		tasks.addTask(0, new EntityMateAIAgeableBase(this, 1.0D));
		tasks.addTask(1, new EntityTemptAI(this, 1, true, true, 0));
		tasks.addTask(2, new LandEntitySwimmingAI(this, 0.75, true));
		tasks.addTask(3, new NightFindNestAI(this));
		tasks.addTask(4, new AttackAI(this, 1.6D, false, this.getAttackLength()));
		tasks.addTask(5, new PanicFindNestAI(this, 1.0));
		tasks.addTask(6, new LandWanderNestAI(this));
		tasks.addTask(7, new LandWanderFollowParent(this, 1.05D));
		tasks.addTask(8, new LandWanderHerd(this, 1.00D, Math.max(1F, this.width) * this.getNavigator().getPathSearchRange() * 0.75F));
		tasks.addTask(9, new LandWanderAvoidWaterAI(this, 1.0D, 20));
		tasks.addTask(10, new EntityWatchClosestAI(this, EntityPlayer.class, 6.0F));
		tasks.addTask(11, new EntityWatchClosestAI(this, EntityPrehistoricFloraAgeableBase.class, 8.0F));
		tasks.addTask(12, new EntityLookIdleAI(this));
		this.targetTasks.addTask(0, new EatItemsEntityPrehistoricFloraAgeableBaseAI(this, 1.5));
	}

	@Override
	public String[] getFoodOreDicts() {
		return ArrayUtils.addAll(ArrayUtils.addAll(DietString.ROOTS, DietString.BUG), DietString.SEED);
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
	public SoundEvent getAmbientSound() {
	    return (SoundEvent) SoundEvent.REGISTRY
	            .getObject(new ResourceLocation("lepidodendron:diictodon_idle"));
	}

	@Override
	public SoundEvent getHurtSound(DamageSource ds) {
	    return (SoundEvent) SoundEvent.REGISTRY
	            .getObject(new ResourceLocation("lepidodendron:diictodon_hurt"));
	}

	@Override
	public SoundEvent getDeathSound() {
	    return (SoundEvent) SoundEvent.REGISTRY
	            .getObject(new ResourceLocation("lepidodendron:diictodon_death"));
	}

	public SoundEvent getAlarmSound() {
		return (SoundEvent) SoundEvent.REGISTRY
				.getObject(new ResourceLocation("lepidodendron:diictodon_alarm"));
	}

	public void playAlarmSound()
	{
		SoundEvent soundevent = this.getAlarmSound();
		//System.err.println("looking for alarm sound");
		if (soundevent != null)
		{
			//System.err.println("playing alarm sound");
			this.playSound(soundevent, this.getSoundVolume(), this.getSoundPitch());
			this.screamAlarmCooldown = 20;
		}
	}

	@Override
	public void onEntityUpdate() {
		if (this.screamAlarmCooldown > 0) {
			this.screamAlarmCooldown -= 1;
		}
		if (this.getScreaming() && screamAlarmCooldown <= 0) {
			this.playAlarmSound();
		}

		super.onEntityUpdate();
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
		//this.renderYawOffset = this.rotationYaw;

		if (this.getAnimation() == DRINK_ANIMATION && this.getClass() == EntityPrehistoricFloraDiictodon.class) {
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

		AnimationHandler.INSTANCE.updateAnimations(this);

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
	@Override
	public CustomTrigger getModTrigger() {
		return ModTriggers.CLICK_DIICTODON;
	}

	@Nullable
	protected ResourceLocation getLootTable() {
		if (!this.isPFAdult()) {
			return LepidodendronMod.DIICTODON_LOOT_YOUNG;
		}
		return LepidodendronMod.DIICTODON_LOOT;
	}

	public static BlockPos buildBurrow(World world, BlockPos pos, boolean large) {

		if (world.getBlockState(pos).getMaterial() == Material.WATER) {
			return pos;
		}

		BlockPos posNest = pos;
		int i = world.rand.nextInt(4);
		BlockPos pos1 = pos.down();
		int xOffset = 1;
		int zOffset = 1;
		boolean eastwest = false;
		if (i == 0) { //North
			//default
		}
		else if (i == 1) { //South
			xOffset = -1;
			zOffset = -1;
		}
		else if (i == 2) { //East
			eastwest = true;
		}
		else if (i == 3) { //West
			eastwest = true;
			xOffset = -1;
			zOffset = -1;
		}
		int y;

		if (large) {
			if (!eastwest) {
				y = 0;
				setBurrowBlock(pos1.getY(), world, pos1);
				setBurrowBlock(pos1.getY(), world, pos1.add(1 * xOffset, y, 0));

				y = -1;
				setBurrowBlock(pos1.getY(), world, pos1.add(1 * xOffset, y, 0));
				setBurrowBlock(pos1.getY(), world, pos1.add(2 * xOffset, y, 0));
				setBurrowBlock(pos1.getY(), world, pos1.add(3 * xOffset, y, 0));
				setBurrowBlock(pos1.getY(), world, pos1.add(1 * xOffset, y, -1 * zOffset));
				setBurrowBlock(pos1.getY(), world, pos1.add(2 * xOffset, y, -1 * zOffset));
				setBurrowBlock(pos1.getY(), world, pos1.add(3 * xOffset, y, -1 * zOffset));


				y = -2;
				setBurrowBlock(pos1.getY(), world, pos1.add(2 * xOffset, y, 0));
				setBurrowBlock(pos1.getY(), world, pos1.add(3 * xOffset, y, 0));
				setBurrowBlock(pos1.getY(), world, pos1.add(2 * xOffset, y, -1 * zOffset));
				setBurrowBlock(pos1.getY(), world, pos1.add(3 * xOffset, y, -1 * zOffset));
				setBurrowBlock(pos1.getY(), world, pos1.add(2 * xOffset, y, -2 * zOffset));
				setBurrowBlock(pos1.getY(), world, pos1.add(3 * xOffset, y, -2 * zOffset));

				setBurrowBlock(pos1.getY(), world, pos1.add(0 * xOffset, y, -2));
				setBurrowBlock(pos1.getY(), world, pos1.add(1 * xOffset, y, -2));
				setBurrowBlock(pos1.getY(), world, pos1.add(2 * xOffset, y, -2));
				setBurrowBlock(pos1.getY(), world, pos1.add(3 * xOffset, y, -2));
				setBurrowBlock(pos1.getY(), world, pos1.add(0 * xOffset, y, -3 * zOffset));
				setBurrowBlock(pos1.getY(), world, pos1.add(1 * xOffset, y, -3 * zOffset));
				setBurrowBlock(pos1.getY(), world, pos1.add(2 * xOffset, y, -3 * zOffset));
				setBurrowBlock(pos1.getY(), world, pos1.add(3 * xOffset, y, -3 * zOffset));


				y = -3;
				setBurrowBlock(pos1.getY(), world, pos1.add(2 * xOffset, y, -1 * zOffset));
				setBurrowBlock(pos1.getY(), world, pos1.add(3 * xOffset, y, -1 * zOffset));
				setBurrowBlock(pos1.getY(), world, pos1.add(2 * xOffset, y, -2 * zOffset));
				setBurrowBlock(pos1.getY(), world, pos1.add(3 * xOffset, y, -2 * zOffset));
				setBurrowBlock(pos1.getY(), world, pos1.add(2 * xOffset, y, -3 * zOffset));
				setBurrowBlock(pos1.getY(), world, pos1.add(3 * xOffset, y, -3 * zOffset));

				setBurrowBlock(pos1.getY(), world, pos1.add(1 * xOffset, y, -2 * zOffset));
				setBurrowBlock(pos1.getY(), world, pos1.add(1 * xOffset, y, -3 * zOffset));

				setBurrowBlock(pos1.getY(), world, pos1.add(0 * xOffset, y, 0 * zOffset));
				setBurrowBlock(pos1.getY(), world, pos1.add(0 * xOffset, y, -1 * zOffset));
				setBurrowBlock(pos1.getY(), world, pos1.add(0 * xOffset, y, -2 * zOffset));
				setBurrowBlock(pos1.getY(), world, pos1.add(0 * xOffset, y, -3 * zOffset));

				setBurrowBlock(pos1.getY(), world, pos1.add(-1 * xOffset, y, 0 * zOffset));
				setBurrowBlock(pos1.getY(), world, pos1.add(-1 * xOffset, y, -1 * zOffset));
				setBurrowBlock(pos1.getY(), world, pos1.add(-1 * xOffset, y, -2 * zOffset));
				setBurrowBlock(pos1.getY(), world, pos1.add(-1 * xOffset, y, -3 * zOffset));

				setBurrowBlock(pos1.getY(), world, pos1.add(-2 * xOffset, y, 0 * zOffset));
				setBurrowBlock(pos1.getY(), world, pos1.add(-2 * xOffset, y, -1 * zOffset));
				setBurrowBlock(pos1.getY(), world, pos1.add(-2 * xOffset, y, -2 * zOffset));


				y = -4;
				setBurrowBlock(pos1.getY(), world, pos1.add(1 * xOffset, y, -2 * zOffset));
				setBurrowBlock(pos1.getY(), world, pos1.add(1 * xOffset, y, -3 * zOffset));

				setBurrowBlock(pos1.getY(), world, pos1.add(0 * xOffset, y, 0 * zOffset));
				setBurrowBlock(pos1.getY(), world, pos1.add(0 * xOffset, y, -1 * zOffset));
				setBurrowBlock(pos1.getY(), world, pos1.add(0 * xOffset, y, -2 * zOffset));
				setBurrowBlock(pos1.getY(), world, pos1.add(0 * xOffset, y, -3 * zOffset));

				setBurrowBlock(pos1.getY(), world, pos1.add(-1 * xOffset, y, 0 * zOffset));
				setBurrowBlock(pos1.getY(), world, pos1.add(-1 * xOffset, y, -1 * zOffset));
				setBurrowBlock(pos1.getY(), world, pos1.add(-1 * xOffset, y, -2 * zOffset));
				setBurrowBlock(pos1.getY(), world, pos1.add(-1 * xOffset, y, -3 * zOffset));

				setBurrowBlock(pos1.getY(), world, pos1.add(-2 * xOffset, y, 0 * zOffset));
				setBurrowBlock(pos1.getY(), world, pos1.add(-2 * xOffset, y, -1 * zOffset));
				setBurrowBlock(pos1.getY(), world, pos1.add(-2 * xOffset, y, -2 * zOffset));


				//Nest:
				posNest = pos1.add(-1 * xOffset, y, -1 * zOffset);
			} else { //reflected:
				y = 0;
				setBurrowBlock(pos1.getY(), world, pos1);
				setBurrowBlock(pos1.getY(), world, pos1.add(0, y, 1 * xOffset));

				y = -1;
				setBurrowBlock(pos1.getY(), world, pos1.add(0, y, 1 * xOffset));
				setBurrowBlock(pos1.getY(), world, pos1.add(0, y, 2 * xOffset));
				setBurrowBlock(pos1.getY(), world, pos1.add(0, y, 3 * xOffset));
				setBurrowBlock(pos1.getY(), world, pos1.add(-1 * xOffset, y, 1 * zOffset));
				setBurrowBlock(pos1.getY(), world, pos1.add(-1 * xOffset, y, 2 * zOffset));
				setBurrowBlock(pos1.getY(), world, pos1.add(-1 * xOffset, y, 3 * zOffset));


				y = -2;
				setBurrowBlock(pos1.getY(), world, pos1.add(0, y, 2 * xOffset));
				setBurrowBlock(pos1.getY(), world, pos1.add(0, y, 3 * xOffset));
				setBurrowBlock(pos1.getY(), world, pos1.add(-1 * xOffset, y, 2 * zOffset));
				setBurrowBlock(pos1.getY(), world, pos1.add(-1 * xOffset, y, 3 * zOffset));
				setBurrowBlock(pos1.getY(), world, pos1.add(-2 * xOffset, y, 2 * zOffset));
				setBurrowBlock(pos1.getY(), world, pos1.add(-2 * xOffset, y, 3 * zOffset));

				setBurrowBlock(pos1.getY(), world, pos1.add(-2, y, 0));
				setBurrowBlock(pos1.getY(), world, pos1.add(-2, y, 1 * xOffset));
				setBurrowBlock(pos1.getY(), world, pos1.add(-2, y, 2 * xOffset));
				setBurrowBlock(pos1.getY(), world, pos1.add(-2, y, 3 * xOffset));
				setBurrowBlock(pos1.getY(), world, pos1.add(-3 * zOffset, y, 0));
				setBurrowBlock(pos1.getY(), world, pos1.add(-3 * xOffset, y, 1 * zOffset));
				setBurrowBlock(pos1.getY(), world, pos1.add(-3 * xOffset, y, 2 * zOffset));
				setBurrowBlock(pos1.getY(), world, pos1.add(-3 * xOffset, y, 3 * zOffset));


				y = -3;
				setBurrowBlock(pos1.getY(), world, pos1.add(-1 * xOffset, y, 2 * zOffset));
				setBurrowBlock(pos1.getY(), world, pos1.add(-1 * xOffset, y, 3 * zOffset));
				setBurrowBlock(pos1.getY(), world, pos1.add(-2 * xOffset, y, 2 * zOffset));
				setBurrowBlock(pos1.getY(), world, pos1.add(-2 * xOffset, y, 3 * zOffset));
				setBurrowBlock(pos1.getY(), world, pos1.add(-3 * xOffset, y, 2 * zOffset));
				setBurrowBlock(pos1.getY(), world, pos1.add(-3 * xOffset, y, 3 * zOffset));

				setBurrowBlock(pos1.getY(), world, pos1.add(-2 * xOffset, y, 1 * zOffset));
				setBurrowBlock(pos1.getY(), world, pos1.add(-3 * xOffset, y, 1 * zOffset));

				setBurrowBlock(pos1.getY(), world, pos1.add(0 * xOffset, y, 0 * zOffset));
				setBurrowBlock(pos1.getY(), world, pos1.add(-1 * xOffset, y, 0));
				setBurrowBlock(pos1.getY(), world, pos1.add(-2 * xOffset, y, 0));
				setBurrowBlock(pos1.getY(), world, pos1.add(-3 * xOffset, y, 0));

				setBurrowBlock(pos1.getY(), world, pos1.add(0, y, -1 * zOffset));
				setBurrowBlock(pos1.getY(), world, pos1.add(-1 * xOffset, y, -1 * zOffset));
				setBurrowBlock(pos1.getY(), world, pos1.add(-2 * xOffset, y, -1 * zOffset));
				setBurrowBlock(pos1.getY(), world, pos1.add(-3 * xOffset, y, -1 * zOffset));

				setBurrowBlock(pos1.getY(), world, pos1.add(0, y, -2 * zOffset));
				setBurrowBlock(pos1.getY(), world, pos1.add(-1 * xOffset, y, -2 * zOffset));
				setBurrowBlock(pos1.getY(), world, pos1.add(-2 * xOffset, y, -2 * zOffset));


				y = -4;
				setBurrowBlock(pos1.getY(), world, pos1.add(-2 * xOffset, y, 1 * zOffset));
				setBurrowBlock(pos1.getY(), world, pos1.add(-3 * xOffset, y, 1 * zOffset));

				setBurrowBlock(pos1.getY(), world, pos1.add(0, y, 0));
				setBurrowBlock(pos1.getY(), world, pos1.add(-1 * xOffset, y, 0));
				setBurrowBlock(pos1.getY(), world, pos1.add(-2 * xOffset, y, 0));
				setBurrowBlock(pos1.getY(), world, pos1.add(-3 * xOffset, y, 0));

				setBurrowBlock(pos1.getY(), world, pos1.add(0, y, -1 * zOffset));
				setBurrowBlock(pos1.getY(), world, pos1.add(-1 * xOffset, y, -1 * zOffset));
				setBurrowBlock(pos1.getY(), world, pos1.add(-2 * xOffset, y, -1 * zOffset));
				setBurrowBlock(pos1.getY(), world, pos1.add(-3 * xOffset, y, -1 * zOffset));

				setBurrowBlock(pos1.getY(), world, pos1.add(-0 * xOffset, y, -2 * zOffset));
				setBurrowBlock(pos1.getY(), world, pos1.add(-1 * xOffset, y, -2 * zOffset));
				setBurrowBlock(pos1.getY(), world, pos1.add(-2 * xOffset, y, -2 * zOffset));

				//Nest:
				posNest = pos1.add(-1 * xOffset, y, -1 * zOffset);
			}
		}
		else { //small burrow
			if (!eastwest) {
				y = 0;
				setBurrowBlock(pos1.getY(), world, pos1);
				setBurrowBlock(pos1.getY(), world, pos1.add(-1 * xOffset, y, 0));

				y = -1;
				setBurrowBlock(pos1.getY(), world, pos1.add(-1 * xOffset, y, 0));
				setBurrowBlock(pos1.getY(), world, pos1.add(-2 * xOffset, y, 0));
				setBurrowBlock(pos1.getY(), world, pos1.add(-3 * xOffset, y, 0));
				setBurrowBlock(pos1.getY(), world, pos1.add(-3 * xOffset, y, 1 * zOffset));
				setBurrowBlock(pos1.getY(), world, pos1.add(-3 * xOffset, y, 2 * zOffset));

				y = -2;
				setBurrowBlock(pos1.getY(), world, pos1.add(-1 * xOffset, y, 1 * zOffset));
				setBurrowBlock(pos1.getY(), world, pos1.add(-2 * xOffset, y, 1 * zOffset));
				setBurrowBlock(pos1.getY(), world, pos1.add(-1 * xOffset, y, 2 * zOffset));
				setBurrowBlock(pos1.getY(), world, pos1.add(-2 * xOffset, y, 2 * zOffset));
				setBurrowBlock(pos1.getY(), world, pos1.add(-3 * xOffset, y, 2 * zOffset));


				y = -3;
				setBurrowBlock(pos1.getY(), world, pos1.add(-2 * xOffset, y, 2 * zOffset));
				setBurrowBlock(pos1.getY(), world, pos1.add(-1 * xOffset, y, 2 * zOffset));
				setBurrowBlock(pos1.getY(), world, pos1.add(0, y, 2 * zOffset));
				setBurrowBlock(pos1.getY(), world, pos1.add(-2 * xOffset, y, 1 * zOffset));
				setBurrowBlock(pos1.getY(), world, pos1.add(-1 * xOffset, y, 1 * zOffset));
				setBurrowBlock(pos1.getY(), world, pos1.add(0, y, 1 * zOffset));
				setBurrowBlock(pos1.getY(), world, pos1.add(-2 * xOffset, y, 0));
				setBurrowBlock(pos1.getY(), world, pos1.add(-1 * xOffset, y, 0));
				setBurrowBlock(pos1.getY(), world, pos1.add(0, y, 0));


				//Nest:
				posNest = pos1.add(-1 * xOffset, y, 1 * zOffset);

			}
			else {
				//Reflected:
				y = 0;
				setBurrowBlock(pos1.getY(), world, pos1);
				setBurrowBlock(pos1.getY(), world, pos1.add(0, y, -1 * xOffset));

				y = -1;
				setBurrowBlock(pos1.getY(), world, pos1.add(0, y, -1 * xOffset));
				setBurrowBlock(pos1.getY(), world, pos1.add(0, y, -2 * xOffset));
				setBurrowBlock(pos1.getY(), world, pos1.add(0, y, -3 * xOffset));
				setBurrowBlock(pos1.getY(), world, pos1.add(1 * xOffset, y, -3 * zOffset));
				setBurrowBlock(pos1.getY(), world, pos1.add(2 * xOffset, y, -3 * zOffset));

				y = -2;
				setBurrowBlock(pos1.getY(), world, pos1.add(1 * xOffset, y, -1 * zOffset));
				setBurrowBlock(pos1.getY(), world, pos1.add(1 * xOffset, y, -2 * zOffset));
				setBurrowBlock(pos1.getY(), world, pos1.add(2 * xOffset, y, -1 * zOffset));
				setBurrowBlock(pos1.getY(), world, pos1.add(2 * xOffset, y, -2 * zOffset));
				setBurrowBlock(pos1.getY(), world, pos1.add(2 * xOffset, y, -3 * zOffset));


				y = -3;
				setBurrowBlock(pos1.getY(), world, pos1.add(2 * xOffset, y, -2 * zOffset));
				setBurrowBlock(pos1.getY(), world, pos1.add(2 * xOffset, y, -1 * zOffset));
				setBurrowBlock(pos1.getY(), world, pos1.add(2 * zOffset, y, 0));
				setBurrowBlock(pos1.getY(), world, pos1.add(1 * xOffset, y, -2 * zOffset));
				setBurrowBlock(pos1.getY(), world, pos1.add(1 * xOffset, y, -1 * zOffset));
				setBurrowBlock(pos1.getY(), world, pos1.add(1 * zOffset, y, 0));
				setBurrowBlock(pos1.getY(), world, pos1.add(0, y, -2 * xOffset));
				setBurrowBlock(pos1.getY(), world, pos1.add(0, y, -1 * xOffset));
				setBurrowBlock(pos1.getY(), world, pos1.add(0, y, 0));


				//Nest:
				posNest = pos1.add(1 * xOffset, y, -1 * zOffset);

			}
		}

		int x;
		y = posNest.getY();
		int z;
		while (y < pos.getY()) { //up to the surface:
			x = -5;
			while (x <= 5) {
				z = -5;
				while (z <= 5) {
					BlockPos pos2 = new BlockPos(posNest.getX() + x, y, posNest.getZ() + z);
					if (world.getBlockState(pos2).getBlock() == Blocks.STRUCTURE_VOID) {
						world.setBlockToAir(pos2);
					}
					z ++;
				}
				x ++;
			}
			y ++;
		}

		return posNest;
	}

	public static void setBurrowBlock(int blockTop, World world, BlockPos pos) {
		if (pos.getY() <= 1) {
			return;
		}
		world.setBlockState(pos, Blocks.STRUCTURE_VOID.getDefaultState());
		world.setBlockState(pos.north(), newBurrowState(world, pos.north()));
		world.setBlockState(pos.south(), newBurrowState(world, pos.south()));
		world.setBlockState(pos.east(), newBurrowState(world, pos.east()));
		world.setBlockState(pos.west(), newBurrowState(world, pos.west()));
		if (pos.getY() > 1) {
			world.setBlockState(pos.down(), newBurrowState(world, pos.down()));
		}
		if (pos.getY() < blockTop) {
			world.setBlockState(pos.up(), newBurrowState(world, pos.up()));
		}
	}

	public static IBlockState newBurrowState(World world, BlockPos pos) {
		IBlockState oldBurrowState = world.getBlockState(pos);
		if (oldBurrowState.getBlock() == Blocks.STRUCTURE_VOID) {
			return Blocks.STRUCTURE_VOID.getDefaultState();
		}
		if (oldBurrowState == Blocks.SAND.getStateFromMeta(0) || oldBurrowState == BlockSandWavy.block.getDefaultState()) {
			return BlockSandSticky.block.getDefaultState();
		}
		else if (oldBurrowState == Blocks.SAND.getStateFromMeta(1) || oldBurrowState == BlockSandRedWavy.block.getDefaultState()) {
			return BlockSandRedSticky.block.getDefaultState();
		}
		else if (oldBurrowState == Blocks.GRAVEL.getDefaultState() || oldBurrowState == BlockGravelWavy.block.getDefaultState()) {
			return BlockGravelSticky.block.getDefaultState();
		}
		else if (oldBurrowState == BlockSandPangaean.block.getDefaultState() || oldBurrowState == BlockSandPangaeanWavy.block.getDefaultState()) {
			return BlockSandPangaeanSticky.block.getDefaultState();
		}
		else if (oldBurrowState == BlockSandBlack.block.getDefaultState() || oldBurrowState == BlockSandBlackWavy.block.getDefaultState()) {
			return BlockSandBlackSticky.block.getDefaultState();
		}
		else if (oldBurrowState == BlockSandGrey.block.getDefaultState() || oldBurrowState == BlockSandGreyWavy.block.getDefaultState()) {
			return BlockSandGreySticky.block.getDefaultState();
		}
		else if (oldBurrowState == BlockSandWhite.block.getDefaultState() || oldBurrowState == BlockSandWhiteWavy.block.getDefaultState()) {
			return BlockSandWhiteSticky.block.getDefaultState();
		}
		else if (oldBurrowState == BlockSandPaleoproterozoic.block.getDefaultState() || oldBurrowState == BlockSandPaleoproterozoicWavy.block.getDefaultState()) {
			return BlockSandPaleoproterozoicSticky.block.getDefaultState();
		}
		else if (world.isAirBlock(pos) ||
			(oldBurrowState.getMaterial() != Material.ROCK
				&& oldBurrowState.getMaterial() != Material.GROUND
				&& oldBurrowState.getMaterial() != Material.CLAY)
				) {
			if (world.getBiome(pos).topBlock == Blocks.SAND.getStateFromMeta(0) || world.getBiome(pos).topBlock == BlockSandWavy.block.getDefaultState()) {
				return BlockSandSticky.block.getDefaultState();
			}
			else if (world.getBiome(pos).topBlock == Blocks.SAND.getStateFromMeta(1) || world.getBiome(pos).topBlock == BlockSandRedWavy.block.getDefaultState()) {
				return BlockSandRedSticky.block.getDefaultState();
			}
			else if (world.getBiome(pos).topBlock == Blocks.GRAVEL.getDefaultState() || world.getBiome(pos).topBlock == BlockGravelWavy.block.getDefaultState()) {
				return BlockGravelSticky.block.getDefaultState();
			}
			else if (world.getBiome(pos).topBlock == BlockSandPangaean.block.getDefaultState() || world.getBiome(pos).topBlock == BlockSandPangaeanWavy.block.getDefaultState()) {
				return BlockSandPangaeanSticky.block.getDefaultState();
			}
			else if (world.getBiome(pos).topBlock == BlockSandBlack.block.getDefaultState() || world.getBiome(pos).topBlock == BlockSandBlackWavy.block.getDefaultState()) {
				return BlockSandBlackSticky.block.getDefaultState();
			}
			else if (world.getBiome(pos).topBlock == BlockSandWhite.block.getDefaultState() || world.getBiome(pos).topBlock == BlockSandWhiteWavy.block.getDefaultState()) {
				return BlockSandWhiteSticky.block.getDefaultState();
			}
			else if (world.getBiome(pos).topBlock == BlockSandPaleoproterozoic.block.getDefaultState() || world.getBiome(pos).topBlock == BlockSandPaleoproterozoicWavy.block.getDefaultState()) {
				return BlockSandPaleoproterozoicSticky.block.getDefaultState();
			}
			return world.getBiome(pos).topBlock;
		}
		return oldBurrowState;
	}

	private boolean isBlockGrazable(IBlockState state) {
		return (state.getMaterial() == Material.GROUND
				|| state.getMaterial() == Material.GRASS );
	}


	@Override
	public boolean isDrinking()
	{
		if (this.getClass() != EntityPrehistoricFloraDiictodon.class) {
			return false;
		}

		//Is GRAZING!
		if (!this.isPFAdult()) {
			return false;
		}

		BlockPos entityPos = Functions.getEntityBlockPos(this);

		boolean test = (this.getPFDrinking() <= 0
				&& !world.isRemote
				&& !this.getIsFast()
				//&& !this.getIsMoving()
				&& this.DRINK_ANIMATION.getDuration() > 0
				&& this.getAnimation() == NO_ANIMATION
				&& !this.isReallyInWater()
				&&
				(
						isBlockGrazable(this.world.getBlockState(entityPos.down()))
				)
		);
		if (test) {
			this.setDrinkingFrom(entityPos.down());
			this.faceBlock(this.getDrinkingFrom(), 10F, 10F);
		}
		return test;

	}

	@Override
	public boolean drinksWater() {
		return false;
	}

	//Rendering taxidermy:
	//--------------------
	public static double offsetPlinth() { return 0.16; }
	public static double offsetWall(@Nullable String variant) { return 0.05; }
	public static double upperfrontverticallinedepth(@Nullable String variant) {return 0.8;}
	public static double upperbackverticallinedepth(@Nullable String variant) {return 0.5;}
	public static double upperfrontlineoffset(@Nullable String variant) {return 0.2;}
	public static double upperfrontlineoffsetperpendiular(@Nullable String variant) {return 0.0F;}
	public static double upperbacklineoffset(@Nullable String variant) {return 0.2;}
	public static double upperbacklineoffsetperpendiular(@Nullable String variant) {return 0.0F;}
	public static double lowerfrontverticallinedepth(@Nullable String variant) {return 0.1;}
	public static double lowerbackverticallinedepth(@Nullable String variant) {return 0;}
	public static double lowerfrontlineoffset(@Nullable String variant) {return 0;}
	public static double lowerfrontlineoffsetperpendiular(@Nullable String variant) {return 0.0F;}
	public static double lowerbacklineoffset(@Nullable String variant) {return 0;}
	public static double lowerbacklineoffsetperpendiular(@Nullable String variant) {return 0.0F;}
	@SideOnly(Side.CLIENT)
	public static ResourceLocation textureDisplay(@Nullable String variant) {return RenderDiictodon.TEXTURE;}
	@SideOnly(Side.CLIENT)
	public static ModelBase modelDisplay(@Nullable String variant) {return RenderDisplays.modelDiictodon;}
	public static float getScaler(@Nullable String variant) {return RenderDiictodon.getScaler();}
}