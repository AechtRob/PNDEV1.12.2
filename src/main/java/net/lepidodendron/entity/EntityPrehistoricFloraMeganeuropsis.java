
package net.lepidodendron.entity;

import com.google.common.base.Predicate;
import net.ilexiconn.llibrary.client.model.tools.ChainBuffer;
import net.ilexiconn.llibrary.server.animation.Animation;
import net.ilexiconn.llibrary.server.animation.AnimationHandler;
import net.lepidodendron.LepidodendronConfig;
import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.block.BlockGlassJar;
import net.lepidodendron.block.BlockInsectEggsMeganeuropsis;
import net.lepidodendron.entity.ai.EatMeatItemsAIFlyingInsect;
import net.lepidodendron.entity.ai.EntityHurtByTargetSmallerThanMeAI;
import net.lepidodendron.entity.ai.EntityMateAIInsectFlyingBase;
import net.lepidodendron.entity.ai.HuntSmallerThanMeAIInsect;
import net.lepidodendron.entity.base.*;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.IEntityLivingData;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.EntityAIBase;
import net.minecraft.entity.ai.EntityAILookIdle;
import net.minecraft.entity.ai.attributes.IAttributeInstance;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.MobEffects;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.network.datasync.DataParameter;
import net.minecraft.network.datasync.DataSerializers;
import net.minecraft.network.datasync.EntityDataManager;
import net.minecraft.pathfinding.Path;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.DamageSource;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.DifficultyInstance;
import net.minecraft.world.EnumDifficulty;
import net.minecraft.world.World;
import net.minecraft.world.WorldServer;
import net.minecraft.world.storage.loot.LootContext;
import net.minecraft.world.storage.loot.LootTable;
import net.minecraftforge.fml.common.registry.EntityRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.oredict.OreDictionary;

import javax.annotation.Nullable;

public class EntityPrehistoricFloraMeganeuropsis extends EntityPrehistoricFloraInsectFlyingBase {

	public BlockPos currentTarget;
	@SideOnly(Side.CLIENT)
	public ChainBuffer chainBuffer;
	private int animationTick;
	public double maxHealthAgeable;
	private Animation animation = NO_ANIMATION;
	public Animation ATTACK_ANIMATION;
	private static final DataParameter<Boolean> HUNTING = EntityDataManager.createKey(EntityPrehistoricFloraMeganeuropsis.class, DataSerializers.BOOLEAN);


	public EntityPrehistoricFloraMeganeuropsis(World world) {
		super(world);
		setSize(0.55F, 0.42F);
		ATTACK_ANIMATION = Animation.create(this.getAttackLength());
	}

	@Override
	public boolean canJar() {
		return true;
	}

	@Override
	protected void entityInit() {
		super.entityInit();
		this.dataManager.register(HUNTING, false);
	}

	@Override
	public IEntityLivingData onInitialSpawn(DifficultyInstance difficulty, @Nullable IEntityLivingData livingdata) {
		livingdata = super.onInitialSpawn(difficulty, livingdata);
		this.setWillHunt(false);
		return livingdata;
	}

	public void writeEntityToNBT(NBTTagCompound compound) {
		super.writeEntityToNBT(compound);
		compound.setBoolean("willHunt", this.getWillHunt());
	}

	public void readEntityFromNBT(NBTTagCompound compound) {
		super.readEntityFromNBT(compound);
		this.setWillHunt(compound.getBoolean("willHunt"));
	}

	public boolean getWillHunt() {
		return this.dataManager.get(HUNTING);
	}

	public void setWillHunt(boolean willHunt) {
		this.dataManager.set(HUNTING, willHunt);
	}

	public static String getPeriod() {
		return "early Permian";
	}

	//public static String getHabitat() {
	//	return "Terrestrial";
	//}

	@Override
	public int getAttackLength() {
		return 20;
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
	public Animation[] getAnimations() {
		return new Animation[]{ATTACK_ANIMATION};
	}

	@Override
	public IBlockState getEggBlockState() {
		return BlockInsectEggsMeganeuropsis.block.getDefaultState();
	}

	@Override
	public void onLivingUpdate() {
		super.onLivingUpdate();
		this.renderYawOffset = this.rotationYaw;

		if (!world.isRemote) {
			if (this.getAttackTarget() != null) {
				if (this.getAttackTarget().isDead) {
					this.setAttackTarget(null);
				}
			}
			if (this.getEatTarget() != null) {
				if (this.getEatTarget().isDead) {
					this.setEatTarget(null);
				}
			}
		}

		if (this.getAttachmentPos() == null && this.getAnimation() == ATTACK_ANIMATION && this.getAnimationTick() == 5 && this.getAttackTarget() != null) {
			launchAttack();
		}

		AnimationHandler.INSTANCE.updateAnimations(this);

	}

	public void onEntityUpdate() {
		super.onEntityUpdate();

		if (this.getAttackTarget() != null) {
			if (this.getAttackTarget() instanceof EntityPlayer) {
				EntityPlayer player = (EntityPlayer) this.getAttackTarget();
				if (this.world.getDifficulty() == EnumDifficulty.PEACEFUL || player.isCreative()) {
					this.setAttackTarget(null);
				}
			}
		}

		double HealthMax = this.getEntityAttribute(SharedMonsterAttributes.MAX_HEALTH).getBaseValue();
		float Health = this.getHealth();
		float HealthRatio = (float) (Health / (float) HealthMax);
		double aHealth = (double) LepidodendronConfig.attackHealth;
		if (aHealth > 100) {aHealth = 100;}
		if (aHealth < 0) {aHealth = 0;}
		aHealth = aHealth/100D;
		EntityLivingBase attackTarget = this.getAttackTarget();
		if (attackTarget != null ) {
			if (attackTarget instanceof EntityPlayer && LepidodendronConfig.attackPlayerAlways) {
				this.setWillHunt(true);
			}
			else {
				this.setWillHunt(HealthRatio <= (float) aHealth);
			}
		}
		else {
			this.setWillHunt(HealthRatio <= (float) aHealth);
		}
	}

	public void launchAttack() {
		IAttributeInstance iattributeinstance = this.getEntityAttribute(SharedMonsterAttributes.ATTACK_DAMAGE);
		if (getAttackTarget() != null) {
			boolean b = this.getAttackTarget().attackEntityFrom(DamageSource.causeMobDamage(this), (float) iattributeinstance.getAttributeValue());
		}
	}

	public AxisAlignedBB getAttackBoundingBox() {
		float size = this.getRenderSizeModifier() * 0.25F;
		return this.getEntityBoundingBox().grow(1.0F + size, 1.0F + size, 1.0F + size);
	}

	protected void initEntityAI() {
		this.tasks.addTask(0, new EntityMateAIInsectFlyingBase(this, 1.0D));
		this.tasks.addTask(1, new AIAttackInsect(false, this.getAttackLength()));
		this.tasks.addTask(2, new AIWanderInsect());
		this.tasks.addTask(3, new EntityAILookIdle(this));
		this.targetTasks.addTask(0, new EatMeatItemsAIFlyingInsect(this));
		this.targetTasks.addTask(1, new EntityHurtByTargetSmallerThanMeAI(this, false));
		this.targetTasks.addTask(2, new HuntSmallerThanMeAIInsect(this, EntityPrehistoricFloraLandBase.class, true, (Predicate<Entity>) entity -> entity instanceof EntityLivingBase));
		this.targetTasks.addTask(2, new HuntSmallerThanMeAIInsect(this, EntityPrehistoricFloraCrawlingFlyingInsectBase.class, true, (Predicate<Entity>) entity -> entity instanceof EntityLivingBase));
		this.targetTasks.addTask(3, new HuntSmallerThanMeAIInsect(this, EntityPrehistoricFloraLandClimbingBase.class, true, (Predicate<Entity>) entity -> entity instanceof EntityLivingBase));
		this.targetTasks.addTask(4, new HuntSmallerThanMeAIInsect(this, EntityPrehistoricFloraAmphibianBase.class, true, (Predicate<Entity>) entity -> entity instanceof EntityLivingBase));
		this.targetTasks.addTask(5, new HuntSmallerThanMeAIInsect(this, EntityLivingBase.class, true, (Predicate<Entity>) entity -> entity instanceof EntityLivingBase));
	}

	@Override
	public boolean isBreedingItem(ItemStack stack)
	{
		return (
			(OreDictionary.containsMatch(false, OreDictionary.getOres("listAllmeatraw"), stack))
		);
	}

	@Override
	public int getAnimationTick() {
		return animationTick;
	}

	@Override
	public void setAnimationTick(int tick) {
		animationTick = tick;
	}

	@Override
	public Animation getAnimation() {
		return this.animation;
	}

	@Override
	public void setAnimation(Animation animation) {
		if (animation == NO_ANIMATION) {
			onAnimationFinish(this.animation);
			setAnimationTick(0);
		}
		this.animation = animation;
	}

	protected void onAnimationFinish(Animation animation) {
	}

	@Override
	protected float getAISpeedInsect() {
		if (this.getTicks() < 0) {
			return 0.0F; //Is laying eggs
		}
		return 3f;
	}

	@Override
	public boolean isAIDisabled() {
		return false;
	}

	@Override
	protected void applyEntityAttributes() {
		super.applyEntityAttributes();
		this.getAttributeMap().registerAttribute(SharedMonsterAttributes.ATTACK_DAMAGE);
		this.getEntityAttribute(SharedMonsterAttributes.ATTACK_DAMAGE).setBaseValue(3D);
		this.getEntityAttribute(SharedMonsterAttributes.MAX_HEALTH).setBaseValue(5.0D);
		this.getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).setBaseValue(0.25D);
	}

	@Override
	public String getTexture() {
		return this.getTexture();
	}

	@Override
	public ResourceLocation FlightSound() {
		return new ResourceLocation("lepidodendron:meganeuropsis_flight");
	}

	@Override
	public SoundEvent getAmbientSound() {
		return (SoundEvent) SoundEvent.REGISTRY.getObject(new ResourceLocation(""));
	}

	@Override
	public SoundEvent getHurtSound(DamageSource ds) {
		return (SoundEvent) SoundEvent.REGISTRY.getObject(new ResourceLocation("lepidodendron:meganeuropsis_hurt"));
	}

	@Override
	public SoundEvent getDeathSound() {
		return (SoundEvent) SoundEvent.REGISTRY.getObject(new ResourceLocation("lepidodendron:meganeuropsis_death"));
	}

	@Override
	protected float getSoundVolume() {
		return 1.0F;
	}

	@Nullable
	protected ResourceLocation getLootTable() {
		return LepidodendronMod.MEGANEUROPSIS_LOOT;
	}

	class AIWanderInsect extends EntityAIBase {
		BlockPos target;
		boolean isGoingToAttach = false;

		public AIWanderInsect() {
			this.setMutexBits(1);
		}

		public boolean shouldExecute() {
			if (EntityPrehistoricFloraMeganeuropsis.this.sitCooldown == 0) {
				for (int i = 0; i < 15; i++) {
					BlockPos randomPos = new BlockPos(EntityPrehistoricFloraMeganeuropsis.this).add(rand.nextInt(17) - 8, rand.nextInt(11) - 5, rand.nextInt(17) - 8);
					if ((!world.isAirBlock(randomPos)) && (world.getBlockState(randomPos).getMaterial() != Material.WATER) && (world.getBlockState(randomPos).getMaterial() != Material.LAVA)) {
						RayTraceResult rayTrace = world.rayTraceBlocks(EntityPrehistoricFloraMeganeuropsis.this.getPositionVector().add(0, 0.25, 0), new Vec3d(randomPos).add(0.5, 0.5, 0.5), true);
						if (rayTrace != null && rayTrace.hitVec != null) {
							if ((!world.isSideSolid(rayTrace.getBlockPos(), rayTrace.sideHit)) && (world.getBlockState(rayTrace.getBlockPos()).getMaterial() != Material.WATER)) {
								target = rayTrace.getBlockPos();
								isGoingToAttach = true;
							}
						}
					}
				}
			}

			target = EntityPrehistoricFloraMeganeuropsis.getPositionRelativetoGround(EntityPrehistoricFloraMeganeuropsis.this, EntityPrehistoricFloraMeganeuropsis.this.world, EntityPrehistoricFloraMeganeuropsis.this.posX + EntityPrehistoricFloraMeganeuropsis.this.rand.nextInt(17) - 8, EntityPrehistoricFloraMeganeuropsis.this.posZ + EntityPrehistoricFloraMeganeuropsis.this.rand.nextInt(17) - 8, EntityPrehistoricFloraMeganeuropsis.this.rand);
			Material material = world.getBlockState(new BlockPos(target)).getMaterial();
			Material material1 = world.getBlockState(new BlockPos(target).up()).getMaterial();
			return (material1 != Material.LAVA) && (material1 != Material.WATER) && (material != Material.LAVA) && (material != Material.WATER) && !EntityPrehistoricFloraMeganeuropsis.this.isSitting() && EntityPrehistoricFloraMeganeuropsis.this.isDirectPathBetweenPoints(new Vec3d(target).add(0.5D, 0.5D, 0.5D)) && EntityPrehistoricFloraMeganeuropsis.this.rand.nextInt(4) == 0 && EntityPrehistoricFloraMeganeuropsis.this.getAttachmentPos() == null;
		}

		public boolean shouldContinueExecuting() {
			return false;
		}

		public void updateTask() {
			if (!EntityPrehistoricFloraMeganeuropsis.this.isDirectPathBetweenPoints(new Vec3d(target))) {
				target = EntityPrehistoricFloraMeganeuropsis.getPositionRelativetoGround(EntityPrehistoricFloraMeganeuropsis.this, EntityPrehistoricFloraMeganeuropsis.this.world, EntityPrehistoricFloraMeganeuropsis.this.posX + EntityPrehistoricFloraMeganeuropsis.this.rand.nextInt(15) - 7, EntityPrehistoricFloraMeganeuropsis.this.posZ + EntityPrehistoricFloraMeganeuropsis.this.rand.nextInt(15) - 7, EntityPrehistoricFloraMeganeuropsis.this.rand);
			}
			if (EntityPrehistoricFloraMeganeuropsis.this.world.isAirBlock(target) || isGoingToAttach) {
				if (!EntityPrehistoricFloraMeganeuropsis.this.isFlying()) {
					EntityPrehistoricFloraMeganeuropsis.this.setNavigator();
				}
				EntityPrehistoricFloraMeganeuropsis.this.moveHelper.setMoveTo((double) target.getX() + 0.5D, (double) target.getY() + 0.5D, (double) target.getZ() + 0.5D, 0.25D);
				if (EntityPrehistoricFloraMeganeuropsis.this.getAttackTarget() == null) {
					EntityPrehistoricFloraMeganeuropsis.this.getLookHelper().setLookPosition((double) target.getX() + 0.5D, (double) target.getY() + 0.5D, (double) target.getZ() + 0.5D, 180.0F, 20.0F);

				}
			}
		}
	}

	class AIAttackInsect extends EntityAIBase {
		private final boolean memory;
		private Path currentPath;

		public AIAttackInsect(boolean memory, int attackLength) {
			this.memory = memory;
			this.setMutexBits(7);
		}

		@Override
		public boolean shouldExecute() {
			EntityLivingBase target = EntityPrehistoricFloraMeganeuropsis.this.getAttackTarget();
			if (target == null || !target.isEntityAlive()) {
				return false;
			} else if (EntityPrehistoricFloraMeganeuropsis.this.world.getDifficulty() == EnumDifficulty.PEACEFUL && target instanceof EntityPlayer) {
				return false;
			}
			this.currentPath = EntityPrehistoricFloraMeganeuropsis.this.getNavigator().getPathToEntityLiving(target);
			return this.currentPath != null;
		}

		@Override
		public boolean shouldContinueExecuting() {
			EntityLivingBase entity = EntityPrehistoricFloraMeganeuropsis.this.getAttackTarget();
			return entity != null && (entity.isEntityAlive() && (!this.memory ? !EntityPrehistoricFloraMeganeuropsis.this.getNavigator().noPath() : EntityPrehistoricFloraMeganeuropsis.this.isWithinHomeDistanceFromPosition(entity.getPosition())));
		}

		@Override
		public void startExecuting() {
			if (EntityPrehistoricFloraMeganeuropsis.this.getControllingPassenger() == null) {
				EntityPrehistoricFloraMeganeuropsis.this.getNavigator().setPath(this.currentPath, 1);
			}
		}

		@Override
		public void resetTask() {
			EntityPrehistoricFloraMeganeuropsis.this.getNavigator().clearPath();
		}

		@Override
		public void updateTask() {
			EntityLivingBase target = EntityPrehistoricFloraMeganeuropsis.this.getAttackTarget();
			if (target == null) {
				return;
			}
			if (EntityPrehistoricFloraMeganeuropsis.this.getControllingPassenger() == null) {
				EntityPrehistoricFloraMeganeuropsis.this.getNavigator().tryMoveToEntityLiving(target, 1);
			}
			if (EntityPrehistoricFloraMeganeuropsis.this.getAttackBoundingBox().intersects(target.getEntityBoundingBox())) {
				EntityPrehistoricFloraMeganeuropsis.this.attackEntityAsMob(target);
				//Apply a slight slowdown to the target:
				if (target instanceof EntityLivingBase) {
					((EntityLivingBase) target).addPotionEffect(new PotionEffect(MobEffects.SLOWNESS, 20, 1, false, false));
				}
				if (EntityPrehistoricFloraMeganeuropsis.this.ATTACK_ANIMATION != null) {
					if (EntityPrehistoricFloraMeganeuropsis.this.getAnimation() != EntityPrehistoricFloraMeganeuropsis.this.ATTACK_ANIMATION) {
						EntityPrehistoricFloraMeganeuropsis.this.setAnimation(EntityPrehistoricFloraMeganeuropsis.this.ATTACK_ANIMATION);
					}
				}
			}
		}
	}

	@Override
	protected void dropLoot(boolean wasRecentlyHit, int lootingModifier, DamageSource source)
	{
		if (source == BlockGlassJar.BlockCustom.FREEZE) {
			//System.err.println("Jar loot!");
			ResourceLocation resourcelocation = LepidodendronMod.MEGANEUROPSIS_LOOT_JAR;
			LootTable loottable = this.world.getLootTableManager().getLootTableFromLocation(resourcelocation);
			LootContext.Builder lootcontext$builder = (new LootContext.Builder((WorldServer)this.world)).withLootedEntity(this).withDamageSource(source);
			for (ItemStack itemstack : loottable.generateLootForPools(this.rand, lootcontext$builder.build()))
			{
				NBTTagCompound variantNBT = new NBTTagCompound();
				variantNBT.setString("PNType", "");
				String stringEgg = EntityRegistry.getEntry(this.getClass()).getRegistryName().toString();
				variantNBT.setString("PNDisplaycase", stringEgg);
				itemstack.setTagCompound(variantNBT);
				this.entityDropItem(itemstack, 0.0F);
			}
		}
		else {
			super.dropLoot(wasRecentlyHit, lootingModifier, source);
		}

	}
}