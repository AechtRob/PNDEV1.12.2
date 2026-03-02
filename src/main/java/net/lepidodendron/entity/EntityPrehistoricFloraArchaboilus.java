
package net.lepidodendron.entity;

import net.ilexiconn.llibrary.server.animation.Animation;
import net.ilexiconn.llibrary.server.animation.AnimationHandler;
import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.block.BlockGlassJar;
import net.lepidodendron.block.base.IAdvancementGranter;
import net.lepidodendron.entity.ai.*;
import net.lepidodendron.entity.base.EntityPrehistoricFloraLeapingInsectBase;
import net.lepidodendron.entity.render.entity.RenderArchaboilus;
import net.lepidodendron.entity.render.entity.RenderPycnophlebia;
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
import net.minecraft.entity.passive.EntityAnimal;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.network.datasync.DataParameter;
import net.minecraft.network.datasync.DataSerializers;
import net.minecraft.network.datasync.EntityDataManager;
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

public class EntityPrehistoricFloraArchaboilus extends EntityPrehistoricFloraLeapingInsectBase implements IAdvancementGranter, ITrappableLand {

	public BlockPos currentTarget;
	public Animation STAND_ANIMATION;
	private int standCooldown;
	public Animation JUMP_ANIMATION;

	private static final DataParameter<Integer> ARCHABOILUS_TYPE = EntityDataManager.<Integer>createKey(EntityPrehistoricFloraArchaboilus.class, DataSerializers.VARINT);

	public EntityPrehistoricFloraArchaboilus(World world) {
		super(world);
		setSize(0.2F, 0.2F);
		minWidth = 0.1F;
		maxWidth = 0.2F;
		maxHeight = 0.2F;
		maxHealthAgeable = 2.0D;
		JUMP_ANIMATION = Animation.create(this.getJumpLength());
	}

	@Override
	protected void entityInit() {
		super.entityInit();
		this.dataManager.register(ARCHABOILUS_TYPE, 0);
	}

	public int getJumpLength() {
		return 20;
	}

	@Override
	public int jumpCooldown() {
		return 1500;
	}

	@Override
	public int getLaunchCooldown() {
		return 0;
	}

	@Override
	public boolean canFly() {
		return false;
	}

	@Override
	public boolean canClimb() {
		return false;
	}

	public void writeEntityToNBT(NBTTagCompound compound) {
		super.writeEntityToNBT(compound);
		compound.setString("PNType", this.getPNType().getName());
	}

	public void readEntityFromNBT(NBTTagCompound compound) {
		if (this.world != null) {
			super.readEntityFromNBT(compound);
		}
		if (compound.hasKey("PNType", 8))
		{
			this.setPNType(EntityPrehistoricFloraArchaboilus.Type.getTypeFromString(compound.getString("PNType")));
		}
	}

	@Override
	public void onLivingUpdate() {
		super.onLivingUpdate();
		//this.renderYawOffset = this.rotationYaw;

		if (this.getAnimation() == ATTACK_ANIMATION && this.getAnimationTick() == 10 && this.getAttackTarget() != null) {
			launchAttack();
		}
		if (this.getIsJumping() && this.getAnimation() != JUMP_ANIMATION && this.onGround && !this.isReallyInWater()) {
			this.setAnimation(JUMP_ANIMATION);
		}

		AnimationHandler.INSTANCE.updateAnimations(this);

	}

	@Override
	public int getEggType(@Nullable String PNType) {
		return 20; //insect egg
	}

	@Override
	public Animation[] getAnimations() {
		return new Animation[]{ATTACK_ANIMATION, EAT_ANIMATION, JUMP_ANIMATION, ROAR_ANIMATION};
	}

	@Override
	public int getRoarLength() {
		return 14;
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

	public static String getPeriod() {return "Jurassic";}

	@Override
	public int getAdultAge() {
		return 0;
	}

	@Override
	public float getAISpeedLand() {
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
	}

	@Override
	public boolean dropsEggs() {
		return false;
	}

	@Override
	public ResourceLocation getEggTexture(@Nullable String variantIn) {
		return new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/eggs_archaboilus.png");
	}

	@Override
	public boolean laysEggs() {
		return true;
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
		return ArrayUtils.addAll(DietString.PLANTS);
	}

	@Override
	public byte breedPNVariantsMatch() {
		return 0;
	}

	@Override
	public boolean canMateWith(EntityAnimal otherAnimal)
	{
		if (otherAnimal == this)
		{
			return false;
		}
		else if (otherAnimal.getClass() != this.getClass())
		{
			return false;
		}
		else {
			switch (this.breedPNVariantsMatch()) {
				case 0: default:
					break;

				case -1:
					if (((EntityPrehistoricFloraArchaboilus)otherAnimal).getPNType() == this.getPNType()) {
						return false;
					}
					break;

				case 1:
					if (((EntityPrehistoricFloraArchaboilus)otherAnimal).getPNType() != this.getPNType()) {
						return false;
					}
					break;

			}
		}

		return this.isInLove() && otherAnimal.isInLove();
	}

	@Override
	public boolean hasPNVariants() {
		return true;
	}

	@Override
	public String getPNTypeName()
	{
		return this.getPNType().getName();
	}

	public enum Type
	{
		MALE(1, "male"),
		FEMALE(2, "female")
		;

		private final String name;
		private final int metadata;

		Type(int metadataIn, String nameIn)
		{
			this.name = nameIn;
			this.metadata = metadataIn;
		}

		public String getName()
		{
			return this.name;
		}

		public int getMetadata()
		{
			return this.metadata;
		}

		public String toString()
		{
			return this.name;
		}

		public static EntityPrehistoricFloraArchaboilus.Type byId(int id)
		{
			if (id < 0 || id >= values().length)
			{
				id = 0;
			}

			return values()[id];
		}

		public static EntityPrehistoricFloraArchaboilus.Type getTypeFromString(String nameIn)
		{
			for (int i = 0; i < values().length; ++i)
			{
				if (values()[i].getName().equals(nameIn))
				{
					return values()[i];
				}
			}

			return values()[0];
		}

	}

	@Override
	public IEntityLivingData onInitialSpawn(DifficultyInstance difficulty, @Nullable IEntityLivingData livingdata) {
		livingdata = super.onInitialSpawn(difficulty, livingdata);
		this.setPNType(EntityPrehistoricFloraArchaboilus.Type.byId(rand.nextInt(EntityPrehistoricFloraArchaboilus.Type.values().length) + 1));
		return livingdata;
	}

	public void setPNType(EntityPrehistoricFloraArchaboilus.Type type)
	{
		this.dataManager.set(ARCHABOILUS_TYPE, Integer.valueOf(type.ordinal()));
	}

	public EntityPrehistoricFloraArchaboilus.Type getPNType()
	{
		return EntityPrehistoricFloraArchaboilus.Type.byId(((Integer)this.dataManager.get(ARCHABOILUS_TYPE)).intValue());
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
		return (SoundEvent) SoundEvent.REGISTRY.getObject(new ResourceLocation("lepidodendron:orthoptera_idle"));
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
			ResourceLocation resourcelocation = LepidodendronMod.ARCHABOILUS_LOOT_JAR;
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
		return ModTriggers.CLICK_ARCHABOILUS;
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
	@SideOnly(Side.CLIENT)
	public static ResourceLocation textureDisplay(@Nullable String variant) {
		if (variant.equalsIgnoreCase("female")) {
			return RenderArchaboilus.TEXTURE_F;
		}
		return RenderArchaboilus.TEXTURE;
	}
	@SideOnly(Side.CLIENT)
	public static ModelBase modelDisplay(@Nullable String variant) {
		return RenderDisplays.modelArchaboilus;
	}
	public static float getScaler(@Nullable String variant) {
		if (variant.equalsIgnoreCase("female")) {
			return RenderArchaboilus.getScaler() * 0.6F;
		}
		return RenderArchaboilus.getScaler();
	}
	public static float getScalerMagnified(@Nullable String variant) {
		float result = RenderArchaboilus.getScaler() * 3.2F;
		if (variant.equalsIgnoreCase("female")) {
			return result * 0.6F;
		}
		return result;
	}

}