
package net.lepidodendron.entity;

import net.ilexiconn.llibrary.server.animation.Animation;
import net.ilexiconn.llibrary.server.animation.AnimationHandler;
import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.block.BlockGlassJar;
import net.lepidodendron.block.base.IAdvancementGranter;
import net.lepidodendron.entity.ai.*;
import net.lepidodendron.entity.base.EntityPrehistoricFloraLeapingInsectBase;
import net.lepidodendron.entity.render.entity.RenderSantanmantis;
import net.lepidodendron.entity.render.tile.RenderDisplays;
import net.lepidodendron.entity.util.ITrappableLand;
import net.lepidodendron.util.CustomTrigger;
import net.lepidodendron.util.EggLayingConditions;
import net.lepidodendron.util.ModTriggers;
import net.minecraft.block.BlockDirectional;
import net.minecraft.block.properties.PropertyDirection;
import net.minecraft.client.model.ModelBase;
import net.minecraft.entity.EnumCreatureAttribute;
import net.minecraft.entity.IEntityLivingData;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.DamageSource;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.DifficultyInstance;
import net.minecraft.world.World;
import net.minecraft.world.WorldServer;
import net.minecraft.world.storage.loot.LootContext;
import net.minecraft.world.storage.loot.LootTable;
import net.minecraftforge.fml.common.registry.EntityRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import org.apache.commons.lang3.ArrayUtils;

import javax.annotation.Nullable;

public class EntityPrehistoricFloraProtophasma extends EntityPrehistoricFloraLeapingInsectBase implements IAdvancementGranter, ITrappableLand {

	public BlockPos currentTarget;
	public Animation STAND_ANIMATION;
	private int standCooldown;


	public EntityPrehistoricFloraProtophasma(World world) {
		super(world);
		setSize(0.3F, 0.3F);
		minWidth = 0.3F;
		maxWidth = 0.3F;
		maxHeight = 0.3F;
		maxHealthAgeable = 2.0D;
		STAND_ANIMATION = Animation.create(93);
	}

	@Override
	public int jumpCooldown() {
		return 1500;
	}

	@Override
	public int getLaunchCooldown() {
		return 5000;
	}

	@Override
	public IEntityLivingData onInitialSpawn(DifficultyInstance difficulty, @Nullable IEntityLivingData livingdata) {
		livingdata = super.onInitialSpawn(difficulty, livingdata);
		this.standCooldown = rand.nextInt(2000);
		return livingdata;
	}

	public void writeEntityToNBT(NBTTagCompound compound)
	{
		super.writeEntityToNBT(compound);
		compound.setInteger("standCooldown", this.standCooldown);
	}

	public void readEntityFromNBT(NBTTagCompound compound) {
		super.readEntityFromNBT(compound);
		this.standCooldown = compound.getInteger("standCooldown");
	}

	@Override
	public void onLivingUpdate() {
		super.onLivingUpdate();
		//this.renderYawOffset = this.rotationYaw;

		if (this.getAnimation() == ATTACK_ANIMATION && this.getAnimationTick() == 10 && this.getAttackTarget() != null) {
			launchAttack();
		}

		if (this.standCooldown > 0) {
			this.standCooldown -= rand.nextInt(3) + 1;
		}
		if (this.standCooldown < 0) {
			this.standCooldown = 0;
		}

		AnimationHandler.INSTANCE.updateAnimations(this);

	}

	@Override
	public int getEggType(@Nullable String PNType) {
		return 20; //insect egg
	}

	@Override
	public Animation[] getAnimations() {
		return new Animation[]{ATTACK_ANIMATION, EAT_ANIMATION, STAND_ANIMATION};
	}

	@Override
	public int getRoarLength() {
		return 20;
	}

	@Override
	public int getAttackLength() {
		return 20;
	}

	@Override
	public int getEatLength() {
		return 40;
	}

	@Override
	public int getClimbCooldown() {
		return 20 + rand.nextInt(40);
	}

	public static String getPeriod() {return "Early Cretaceous";}

	@Override
	public int getAdultAge() {
		return 0;
	}

	@Override
	public float getAISpeedLand() {
		if (this.getAnimation() == STAND_ANIMATION) {
			return 0.0F;
		}
		if (this.getIsFast() && (!this.getIsClimbing()) && (!this.getIsFlying())) {
			return 0.15F;
		}
		if (this.getIsFlying() || this.getIsLaunching()) {
			return 0.65F;
		}
		if(this.isJumping) {
			return 0.15F;
		}
		return 0.25F;
	}

	public AxisAlignedBB getAttackBoundingBox() {
		float size = this.getRenderSizeModifier() * 0.25F;
		return this.getEntityBoundingBox().grow(0.0F + size, 0.0F + size, 0.0F + size);
	}

	@Override
	public boolean canJar() {
		return true;
	}

	@Override
	public float getClimbSpeed() {
		return 0.5F;
	}

	@Override
	public void onEntityUpdate() {

		super.onEntityUpdate();

		//random idle animations
		if ((!this.world.isRemote) && this.getEatTarget() == null && this.getAttackTarget() == null && this.getRevengeTarget() == null
				&& !this.getIsMoving() && !this.getIsFlying() && !this.getIsClimbing() && this.getAnimation() == NO_ANIMATION && standCooldown == 0) {
			this.setAnimation(STAND_ANIMATION);
			this.standCooldown = 2000;
		}
		if ((!this.world.isRemote) && this.getAnimation() == STAND_ANIMATION && this.getAnimationTick() == STAND_ANIMATION.getDuration() - 1) {
			this.standCooldown = 2000;
			this.setAnimation(NO_ANIMATION);
		}


	}

	@Override
	public boolean dropsEggs() {
		return true;
	}

	@Override
	public boolean laysEggs() {
		return false;
	}


	protected void initEntityAI() {
		tasks.addTask(0, new LandEntitySwimmingAI(this, 0.75, false));
		tasks.addTask(1, new GlideAI());
		tasks.addTask(2, new EntityMateAIAgeableBase(this, 1));
		tasks.addTask(3, new EntityTemptAI(this, 1, false, true, 0));
		tasks.addTask(4, new LandEntitySwimmingAI(this, 0.75, false));
		tasks.addTask(5, new AttackAI(this, 1.0D, false, this.getAttackLength()));
		tasks.addTask(6, new LandWanderNestAI(this));
		tasks.addTask(7, new LandWanderAvoidWaterClimbingAI(this, 0.8D, 20));
		tasks.addTask(8, new EntityLookIdleAI(this));
		this.targetTasks.addTask(0, new EatItemsEntityPrehistoricFloraAgeableBaseAI(this, 1));
	}

	@Override
	public String[] getFoodOreDicts() {
		return ArrayUtils.addAll(DietString.BUG);
	}

	@Override
	protected void applyEntityAttributes() {
		super.applyEntityAttributes();
		this.getEntityAttribute(SharedMonsterAttributes.MAX_HEALTH).setBaseValue(2.0D);
		this.getAttributeMap().registerAttribute(SharedMonsterAttributes.ATTACK_DAMAGE);
		this.getEntityAttribute(SharedMonsterAttributes.ATTACK_DAMAGE).setBaseValue(2.0D);
		this.getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).setBaseValue(0.22D);
		//this.getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).setBaseValue(0D);
	}

	@Override
	public EnumCreatureAttribute getCreatureAttribute() {
		return EnumCreatureAttribute.ARTHROPOD;
	}

	@Override
	public SoundEvent getAmbientSound() {
		return (SoundEvent) SoundEvent.REGISTRY.getObject(new ResourceLocation(""));
	}

	@Override
	public SoundEvent getHurtSound(DamageSource ds) {
		return (SoundEvent) SoundEvent.REGISTRY.getObject(new ResourceLocation("entity.generic.hurt"));
	}

	@Override
	public SoundEvent getDeathSound() {
		return (SoundEvent) SoundEvent.REGISTRY.getObject(new ResourceLocation("entity.generic.death"));
	}

	@Override
	protected float getSoundVolume() {
		return 0.5F;
	}

	@Override
	protected void dropLoot(boolean wasRecentlyHit, int lootingModifier, DamageSource source)
	{
		if (source == BlockGlassJar.BlockCustom.FREEZE) {
			//System.err.println("Jar loot!");
			ResourceLocation resourcelocation = LepidodendronMod.PROTOPHASMA_LOOT;
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
	public static final PropertyDirection FACING = BlockDirectional.FACING;

	@Nullable
	protected ResourceLocation getLootTable() {
		return LepidodendronMod.BUG_LOOT;
	}

	public boolean testLay(World world, BlockPos pos) {
		return EggLayingConditions.testLayMossAndWood(this, world, pos);
	}

	public boolean isDirectPathBetweenPoints(Vec3d vec1, Vec3d vec2) {
		RayTraceResult movingobjectposition = this.world.rayTraceBlocks(vec1, new Vec3d(vec2.x, vec2.y, vec2.z), false, true, false);
		return movingobjectposition == null || movingobjectposition.typeOfHit != RayTraceResult.Type.BLOCK;
	}

	@Nullable
	@Override
	public CustomTrigger getModTrigger() {
		return ModTriggers.CLICK_PROTOPHASMA;
	}

	//Rendering taxidermy:
	//--------------------
	public static double offsetCase(@Nullable String variant) {
		return 0.32F;
	}
	public static double offsetCaseMagnified(@Nullable String variant) { return 1.152; }
	public static double offsetWall(@Nullable String variant) {
		return 0.0;
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
		return 0.25;
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
		return -0.0;
	}
}