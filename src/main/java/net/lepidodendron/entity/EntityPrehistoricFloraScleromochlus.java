
package net.lepidodendron.entity;

import net.ilexiconn.llibrary.client.model.tools.ChainBuffer;
import net.ilexiconn.llibrary.server.animation.Animation;
import net.ilexiconn.llibrary.server.animation.AnimationHandler;
import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.block.BlockGlassJar;
import net.lepidodendron.entity.ai.*;
import net.lepidodendron.entity.base.EntityPrehistoricFloraAgeableBase;
import net.lepidodendron.entity.base.EntityPrehistoricFloraLandBase;
import net.minecraft.block.BlockDirectional;
import net.minecraft.block.properties.PropertyDirection;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EnumCreatureAttribute;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.player.EntityPlayer;
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
import net.minecraft.world.WorldServer;
import net.minecraft.world.storage.loot.LootContext;
import net.minecraft.world.storage.loot.LootTable;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.oredict.OreDictionary;

import javax.annotation.Nullable;

public class EntityPrehistoricFloraScleromochlus extends EntityPrehistoricFloraLandBase {

	public BlockPos currentTarget;
	@SideOnly(Side.CLIENT)
	public ChainBuffer chainBuffer;
	public int ambientSoundTime;
	public Animation HOP_ANIMATION;

	public EntityPrehistoricFloraScleromochlus(World world) {
		super(world);
		//setSize(0.6F, 0.35F);
		experienceValue = 0;
		this.isImmuneToFire = false;
		setNoAI(!true);
		enablePersistence();
		minWidth = 0.1F;
		maxWidth = 0.3F;
		maxHeight = 0.3F;
		maxHealthAgeable = 6.0D;
		HOP_ANIMATION = Animation.create(15);
	}

	@Override
	public Animation[] getAnimations() {
		return new Animation[]{HOP_ANIMATION, DRINK_ANIMATION, ATTACK_ANIMATION, ROAR_ANIMATION, LAY_ANIMATION, EAT_ANIMATION};
	}

	@Override
	public boolean canJar() {
		return true;
	}

	@Override
	public int getDrinkLength() {
		return 0;
	}

	@Override
	public int getEatLength() {
		return 20;
	}

	public static String getPeriod() {return "late Triassic";}

	public static String getHabitat() {return "Terrestrial Reptile";}

	@Override
	public boolean hasNest() {
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

	protected float getAISpeedLand() {
		float speedBase = 0.585F;
		if (this.getTicks() < 0) {
			return 0.0F; //Is laying eggs
		}
		if (this.getAnimation() == DRINK_ANIMATION) {
			return 0.0F; //Is drinking
		}
		if (!this.isHopping()) {
			return 0.0F; //Is on the ground between hops
		}
		if (this.getIsFast()) {
			speedBase = speedBase * 1.75F;
		}
		return speedBase;
	}

	public boolean isHopping() {
		return getHopPhaseHopping() > 0;
	}

	public int getHopPhaseHopping() {
		//One jump per second, the first half of the second (10 ticks) is in the air:
		if ((double)this.getTicks() / 30D == Math.round((double)this.getTicks() / 30D)) {
			return 1;
		}
		if ((double)(this.getTicks() - 1D) / 30D == Math.round(((double)this.getTicks() - 1D) / 30D)) {
			return 2;
		}
		if ((double)(this.getTicks() - 2D) / 30D == Math.round(((double)this.getTicks() - 2D) / 30D)) {
			return 3;
		}
		if ((double)(this.getTicks() - 3D) / 30D == Math.round(((double)this.getTicks() - 3D) / 30D)) {
			return 4;
		}
		if ((double)(this.getTicks() - 4D) / 30D == Math.round(((double)this.getTicks() - 4D) / 30D)) {
			return 5;
		}
		if ((double)(this.getTicks() - 5D) / 30D == Math.round(((double)this.getTicks() - 5D) / 30D)) {
			return 6;
		}
		if ((double)(this.getTicks() - 6D) / 30D == Math.round(((double)this.getTicks() - 6D) / 30D)) {
			return 7;
		}
		if ((double)(this.getTicks() - 7D) / 30D == Math.round(((double)this.getTicks() - 7D) / 30D)) {
			return 8;
		}
		if ((double)(this.getTicks() - 8D) / 30D == Math.round(((double)this.getTicks() - 8D) / 30D)) {
			return 9;
		}
		if ((double)(this.getTicks() - 9D) / 30D == Math.round(((double)this.getTicks() - 9D) / 30D)) {
			return 10;
		}
		if ((double)(this.getTicks() - 10D) / 30D == Math.round(((double)this.getTicks() - 10D) / 30D)) {
			return 11;
		}
		if ((double)(this.getTicks() - 11D) / 30D == Math.round(((double)this.getTicks() - 11D) / 30D)) {
			return 12;
		}
		if ((double)(this.getTicks() - 12D) / 30D == Math.round(((double)this.getTicks() - 12D) / 30D)) {
			return 13;
		}
		if ((double)(this.getTicks() - 13D) / 30D == Math.round(((double)this.getTicks() - 13D) / 30D)) {
			return 14;
		}
		if ((double)(this.getTicks() - 14D) / 30D == Math.round(((double)this.getTicks() - 14D) / 30D)) {
			return 15;
		}
		return 0;
	}

	@Override
	public int getTalkInterval() {
		return 180;
	}

	@Override
	public int getAdultAge() {
		return 1;
	}

	public AxisAlignedBB getAttackBoundingBox() {
		float size = this.getRenderSizeModifier() * 0.25F;
		return this.getEntityBoundingBox().grow(1.0F + size, 1.0F + size, 1.0F + size);
	}

	@Override
	public float getEyeHeight()
	{
		return Math.max(super.getEyeHeight(), this.height * 0.95F);
	}

	protected void initEntityAI() {
		tasks.addTask(0, new EntityMateAIAgeableBase(this, 1.0D));
		tasks.addTask(1, new EntityTemptAI(this, 1, false, true, (float) this.getEntityAttribute(SharedMonsterAttributes.ATTACK_DAMAGE).getAttributeValue() * 0.33F));
		tasks.addTask(2, new LandEntitySwimmingAI(this, 0.75, false));
		tasks.addTask(3, new PanicAI(this, 1.0));
		tasks.addTask(4, new LandWanderNestAI(this));
		tasks.addTask(5, new LandWanderAvoidWaterAI(this, 1.0D, 40));
		tasks.addTask(6, new EntityWatchClosestAI(this, EntityPlayer.class, 6.0F));
		tasks.addTask(7, new EntityWatchClosestAI(this, EntityPrehistoricFloraAgeableBase.class, 8.0F));
		tasks.addTask(8, new EntityLookIdleAI(this));
		this.targetTasks.addTask(0, new EatMeatItemsAI(this));
	}

	@Override
	public boolean panics() {
		return true;
	}

	@Override
	public boolean isBreedingItem(ItemStack stack)
	{
		return (
			(OreDictionary.containsMatch(false, OreDictionary.getOres("listAllmeatraw"), stack))
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
		this.getEntityAttribute(SharedMonsterAttributes.ATTACK_DAMAGE).setBaseValue(3.0D);
		this.getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).setBaseValue(0.25D);
	}

	@Override
	public SoundEvent getAmbientSound() {
	    return (SoundEvent) SoundEvent.REGISTRY
	            .getObject(new ResourceLocation("lepidodendron:scleromochlus_idle"));
	}

	@Override
	public SoundEvent getHurtSound(DamageSource ds) {
	    return (SoundEvent) SoundEvent.REGISTRY
	            .getObject(new ResourceLocation("lepidodendron:scleromochlus_hurt"));
	}

	@Override
	public SoundEvent getDeathSound() {
	    return (SoundEvent) SoundEvent.REGISTRY
	            .getObject(new ResourceLocation("lepidodendron:scleromochlus_death"));
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
		if (this.getAnimation() != DRINK_ANIMATION) {
			this.renderYawOffset = this.rotationYaw;
		}
		if (this.getAnimation() == DRINK_ANIMATION) {
			EnumFacing facing = this.getAdjustedHorizontalFacing();
			this.faceBlock(this.getPosition().offset(facing), 1F, 1F);
		}
		if (this.getAnimation() == ATTACK_ANIMATION && this.getAnimationTick() == 10 && this.getAttackTarget() != null) {
			launchAttack();
			if (this.getOneHit()) {
				this.setAttackTarget(null);
				this.setRevengeTarget(null);
			}
		}

		if (this.getHopPhaseHopping() == 1 && this.getIsMoving()) {
			//System.err.println("Setting hopping");
			this.setAnimation(HOP_ANIMATION);
		}

		AnimationHandler.INSTANCE.updateAnimations(this);
		//System.err.println("Anim: " + (this.getAnimation() == HOP_ANIMATION));

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
			return LepidodendronMod.SCLEROMOCHLUS_LOOT_YOUNG;
		}
		return LepidodendronMod.SCLEROMOCHLUS_LOOT;
	}

	@Override
	protected void dropLoot(boolean wasRecentlyHit, int lootingModifier, DamageSource source)
	{
		if (source == BlockGlassJar.BlockCustom.FREEZE) {
			//System.err.println("Jar loot!");
			ResourceLocation resourcelocation = LepidodendronMod.SCLEROMOCHLUS_LOOT_JAR;
			LootTable loottable = this.world.getLootTableManager().getLootTableFromLocation(resourcelocation);
			LootContext.Builder lootcontext$builder = (new LootContext.Builder((WorldServer)this.world)).withLootedEntity(this).withDamageSource(source);
			for (ItemStack itemstack : loottable.generateLootForPools(this.rand, lootcontext$builder.build()))
			{
				this.entityDropItem(itemstack, 0.0F);
			}
		}
		else {
			super.dropLoot(wasRecentlyHit, lootingModifier, source);
		}

	}

}