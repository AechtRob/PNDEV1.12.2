
package net.lepidodendron.entity;

import net.ilexiconn.llibrary.client.model.tools.ChainBuffer;
import net.ilexiconn.llibrary.server.animation.AnimationHandler;
import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.block.BlockSandPangaean;
import net.lepidodendron.block.BlockSandPangaeanSticky;
import net.lepidodendron.block.BlockSandRedSticky;
import net.lepidodendron.block.BlockSandSticky;
import net.lepidodendron.entity.ai.*;
import net.lepidodendron.entity.base.EntityPrehistoricFloraAgeableBase;
import net.lepidodendron.entity.base.EntityPrehistoricFloraLandBase;
import net.minecraft.block.BlockDirectional;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.PropertyDirection;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.EnumCreatureAttribute;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.EntityAILookIdle;
import net.minecraft.entity.ai.EntityAIWatchClosest;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
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
import java.util.List;

public class EntityPrehistoricFloraDiictodon extends EntityPrehistoricFloraLandBase {

	public BlockPos currentTarget;
	@SideOnly(Side.CLIENT)
	public ChainBuffer chainBuffer;
	private boolean screaming;
	private int alarmCooldown;

	public EntityPrehistoricFloraDiictodon(World world) {
		super(world);
		//setSize(0.6F, 0.35F);
		experienceValue = 0;
		this.isImmuneToFire = false;
		setNoAI(!true);
		enablePersistence();
		minWidth = 0.10F;
		maxWidth = 0.30F;
		maxHeight = 0.25F;
		maxHealthAgeable = 8.0D;
	}

	public static String getPeriod() {return "Permian";}

	public static String getHabitat() {return "Terrestrial Dicynodont";}

	@Override
	public boolean hasNest() {
		return true;
	}

	public boolean hasAlarm() {
		return true;
	}

	@Override
	public boolean attackEntityFrom(DamageSource ds, float i) {
		Entity e = ds.getTrueSource();
		if (e instanceof EntityLivingBase && this.hasAlarm()) {
			EntityLivingBase ee = (EntityLivingBase) e;
			List<EntityPrehistoricFloraDiictodon> Diictodon = this.world.getEntitiesWithinAABB(EntityPrehistoricFloraDiictodon.class, new AxisAlignedBB(this.getPosition().add(-8, -4, -8), this.getPosition().add(8, 4, 8)));
			for (EntityPrehistoricFloraDiictodon currentDiictodon : Diictodon) {
				currentDiictodon.setRevengeTarget(ee);
				currentDiictodon.alarmCooldown = rand.nextInt(20);
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

	protected float getAISpeedLand() {
		float speedBase = 0.348F;
		if (this.getTicks() < 0) {
			return 0.0F; //Is laying eggs
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
		tasks.addTask(7, new LandWanderAvoidWaterAI(this, 1.0D, 20));
		tasks.addTask(8, new EntityAIWatchClosest(this, EntityPlayer.class, 6.0F));
		tasks.addTask(9, new EntityAIWatchClosest(this, EntityPrehistoricFloraAgeableBase.class, 8.0F));
		tasks.addTask(10, new EntityAILookIdle(this));
		this.targetTasks.addTask(0, new EatPlantItemsAI(this, 1.5));
		}

	@Override
	public boolean panics() {
		return true;
	}

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
		this.getEntityAttribute(SharedMonsterAttributes.ATTACK_DAMAGE).setBaseValue(4.0D);
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
			this.alarmCooldown = 20;
		}
	}

	@Override
	public void onEntityUpdate() {
		if (this.alarmCooldown > 0) {
			this.alarmCooldown -= 1;
		}
		if (this.getScreaming() && alarmCooldown <= 0) {
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
			return LepidodendronMod.DIICTODON_LOOT_YOUNG;
		}
		return LepidodendronMod.DIICTODON_LOOT;
	}

	public static BlockPos buildBurrow(World world, BlockPos pos) {
		IBlockState bs = world.getBlockState(pos);
		int i = world.rand.nextInt(4);
		pos = pos.down();
		if (i == 0) { //North
			world.setBlockState(pos.down(), newBurrowState(world, pos));
			world.setBlockState(pos.north(), newBurrowState(world, pos));
			world.setBlockState(pos.south(), newBurrowState(world, pos));
			world.setBlockState(pos.east(), newBurrowState(world, pos));
			world.setBlockState(pos.west(), newBurrowState(world, pos));
			world.setBlockToAir(pos);

			pos = pos.north();
			world.setBlockState(pos.down(), newBurrowState(world, pos));
			world.setBlockState(pos.north(), newBurrowState(world, pos));
			world.setBlockState(pos.east(), newBurrowState(world, pos));
			world.setBlockState(pos.west(), newBurrowState(world, pos));
			world.setBlockToAir(pos);

			pos = pos.down();
			world.setBlockState(pos.down(), newBurrowState(world, pos));
			world.setBlockState(pos.north(), newBurrowState(world, pos));
			world.setBlockState(pos.south(), newBurrowState(world, pos));
			world.setBlockState(pos.east(), newBurrowState(world, pos));
			world.setBlockState(pos.west(), newBurrowState(world, pos));
			world.setBlockToAir(pos);

			pos = pos.north();
			world.setBlockState(pos.down(), newBurrowState(world, pos));
			world.setBlockState(pos.north(), newBurrowState(world, pos));
			world.setBlockState(pos.east(), newBurrowState(world, pos));
			world.setBlockState(pos.west(), newBurrowState(world, pos));
			world.setBlockState(pos.up(), newBurrowState(world, pos.up()));
			world.setBlockToAir(pos);

			if (world.rand.nextInt(2) == 0) {
				pos = pos.east();
				world.setBlockState(pos.down(), newBurrowState(world, pos));
				world.setBlockState(pos.north(), newBurrowState(world, pos));
				world.setBlockState(pos.south(), newBurrowState(world, pos));
				world.setBlockState(pos.east(), newBurrowState(world, pos));
				world.setBlockState(pos.up(), newBurrowState(world, pos.up()));
				world.setBlockToAir(pos);

				pos = pos.east();
				world.setBlockState(pos.down(), newBurrowState(world, pos));
				world.setBlockState(pos.north(), newBurrowState(world, pos));
				world.setBlockState(pos.south(), newBurrowState(world, pos));
				world.setBlockState(pos.east(), newBurrowState(world, pos));
				world.setBlockState(pos.up(), newBurrowState(world, pos.up()));
				world.setBlockToAir(pos);
			} else {
				pos = pos.west();
				world.setBlockState(pos.down(), newBurrowState(world, pos));
				world.setBlockState(pos.north(), newBurrowState(world, pos));
				world.setBlockState(pos.south(), newBurrowState(world, pos));
				world.setBlockState(pos.west(), newBurrowState(world, pos));
				world.setBlockState(pos.up(), newBurrowState(world, pos.up()));
				world.setBlockToAir(pos);

				pos = pos.west();
				world.setBlockState(pos.down(), newBurrowState(world, pos));
				world.setBlockState(pos.north(), newBurrowState(world, pos));
				world.setBlockState(pos.south(), newBurrowState(world, pos));
				world.setBlockState(pos.west(), newBurrowState(world, pos));
				world.setBlockState(pos.up(), newBurrowState(world, pos.up()));
				world.setBlockToAir(pos);
			}
		}
		else if (i == 1) { //South
			world.setBlockState(pos.down(), newBurrowState(world, pos));
			world.setBlockState(pos.north(), newBurrowState(world, pos));
			world.setBlockState(pos.south(), newBurrowState(world, pos));
			world.setBlockState(pos.east(), newBurrowState(world, pos));
			world.setBlockState(pos.west(), newBurrowState(world, pos));
			world.setBlockToAir(pos);

			pos = pos.south();
			world.setBlockState(pos.down(), newBurrowState(world, pos));
			world.setBlockState(pos.south(), newBurrowState(world, pos));
			world.setBlockState(pos.east(), newBurrowState(world, pos));
			world.setBlockState(pos.west(), newBurrowState(world, pos));
			world.setBlockToAir(pos);

			pos = pos.down();
			world.setBlockState(pos.down(), newBurrowState(world, pos));
			world.setBlockState(pos.north(), newBurrowState(world, pos));
			world.setBlockState(pos.south(), newBurrowState(world, pos));
			world.setBlockState(pos.east(), newBurrowState(world, pos));
			world.setBlockState(pos.west(), newBurrowState(world, pos));
			world.setBlockToAir(pos);

			pos = pos.south();
			world.setBlockState(pos.down(), newBurrowState(world, pos));
			world.setBlockState(pos.south(), newBurrowState(world, pos));
			world.setBlockState(pos.east(), newBurrowState(world, pos));
			world.setBlockState(pos.west(), newBurrowState(world, pos));
			world.setBlockState(pos.up(), newBurrowState(world, pos.up()));
			world.setBlockToAir(pos);

			if (world.rand.nextInt(2) == 0) {
				pos = pos.east();
				world.setBlockState(pos.down(), newBurrowState(world, pos));
				world.setBlockState(pos.north(), newBurrowState(world, pos));
				world.setBlockState(pos.south(), newBurrowState(world, pos));
				world.setBlockState(pos.east(), newBurrowState(world, pos));
				world.setBlockState(pos.up(), newBurrowState(world, pos.up()));
				world.setBlockToAir(pos);

				pos = pos.east();
				world.setBlockState(pos.down(), newBurrowState(world, pos));
				world.setBlockState(pos.north(), newBurrowState(world, pos));
				world.setBlockState(pos.south(), newBurrowState(world, pos));
				world.setBlockState(pos.east(), newBurrowState(world, pos));
				world.setBlockState(pos.up(), newBurrowState(world, pos.up()));
				world.setBlockToAir(pos);
			} else {
				pos = pos.west();
				world.setBlockState(pos.down(), newBurrowState(world, pos));
				world.setBlockState(pos.north(), newBurrowState(world, pos));
				world.setBlockState(pos.south(), newBurrowState(world, pos));
				world.setBlockState(pos.west(), newBurrowState(world, pos));
				world.setBlockState(pos.up(), newBurrowState(world, pos.up()));
				world.setBlockToAir(pos);

				pos = pos.west();
				world.setBlockState(pos.down(), newBurrowState(world, pos));
				world.setBlockState(pos.north(), newBurrowState(world, pos));
				world.setBlockState(pos.south(), newBurrowState(world, pos));
				world.setBlockState(pos.west(), newBurrowState(world, pos));
				world.setBlockState(pos.up(), newBurrowState(world, pos.up()));
				world.setBlockToAir(pos);
			}
		}
		else if (i == 2) { //East
			world.setBlockState(pos.down(), newBurrowState(world, pos));
			world.setBlockState(pos.north(), newBurrowState(world, pos));
			world.setBlockState(pos.south(), newBurrowState(world, pos));
			world.setBlockState(pos.east(), newBurrowState(world, pos));
			world.setBlockState(pos.west(), newBurrowState(world, pos));
			world.setBlockToAir(pos);

			pos = pos.east();
			world.setBlockState(pos.down(), newBurrowState(world, pos));
			world.setBlockState(pos.south(), newBurrowState(world, pos));
			world.setBlockState(pos.north(), newBurrowState(world, pos));
			world.setBlockState(pos.east(), newBurrowState(world, pos));
			world.setBlockToAir(pos);

			pos = pos.down();
			world.setBlockState(pos.down(), newBurrowState(world, pos));
			world.setBlockState(pos.north(), newBurrowState(world, pos));
			world.setBlockState(pos.south(), newBurrowState(world, pos));
			world.setBlockState(pos.east(), newBurrowState(world, pos));
			world.setBlockState(pos.west(), newBurrowState(world, pos));
			world.setBlockToAir(pos);

			pos = pos.east();
			world.setBlockState(pos.down(), newBurrowState(world, pos));
			world.setBlockState(pos.south(), newBurrowState(world, pos));
			world.setBlockState(pos.north(), newBurrowState(world, pos));
			world.setBlockState(pos.east(), newBurrowState(world, pos));
			world.setBlockState(pos.up(), newBurrowState(world, pos.up()));
			world.setBlockToAir(pos);

			if (world.rand.nextInt(2) == 0) {
				pos = pos.north();
				world.setBlockState(pos.down(), newBurrowState(world, pos));
				world.setBlockState(pos.north(), newBurrowState(world, pos));
				world.setBlockState(pos.west(), newBurrowState(world, pos));
				world.setBlockState(pos.east(), newBurrowState(world, pos));
				world.setBlockState(pos.up(), newBurrowState(world, pos.up()));
				world.setBlockToAir(pos);

				pos = pos.north();
				world.setBlockState(pos.down(), newBurrowState(world, pos));
				world.setBlockState(pos.north(), newBurrowState(world, pos));
				world.setBlockState(pos.west(), newBurrowState(world, pos));
				world.setBlockState(pos.east(), newBurrowState(world, pos));
				world.setBlockState(pos.up(), newBurrowState(world, pos.up()));
				world.setBlockToAir(pos);
			}
			else {
				pos = pos.south();
				world.setBlockState(pos.down(), newBurrowState(world, pos));
				world.setBlockState(pos.south(), newBurrowState(world, pos));
				world.setBlockState(pos.east(), newBurrowState(world, pos));
				world.setBlockState(pos.west(), newBurrowState(world, pos));
				world.setBlockState(pos.up(), newBurrowState(world, pos.up()));
				world.setBlockToAir(pos);

				pos = pos.south();
				world.setBlockState(pos.down(), newBurrowState(world, pos));
				world.setBlockState(pos.south(), newBurrowState(world, pos));
				world.setBlockState(pos.east(), newBurrowState(world, pos));
				world.setBlockState(pos.west(), newBurrowState(world, pos));
				world.setBlockState(pos.up(), newBurrowState(world, pos.up()));
				world.setBlockToAir(pos);
			}
		}
		else if (i == 3) { //West
			world.setBlockState(pos.down(), newBurrowState(world, pos));
			world.setBlockState(pos.north(), newBurrowState(world, pos));
			world.setBlockState(pos.south(), newBurrowState(world, pos));
			world.setBlockState(pos.east(), newBurrowState(world, pos));
			world.setBlockState(pos.west(), newBurrowState(world, pos));
			world.setBlockToAir(pos);

			pos = pos.west();
			world.setBlockState(pos.down(), newBurrowState(world, pos));
			world.setBlockState(pos.south(), newBurrowState(world, pos));
			world.setBlockState(pos.north(), newBurrowState(world, pos));
			world.setBlockState(pos.west(), newBurrowState(world, pos));
			world.setBlockToAir(pos);

			pos = pos.down();
			world.setBlockState(pos.down(), newBurrowState(world, pos));
			world.setBlockState(pos.north(), newBurrowState(world, pos));
			world.setBlockState(pos.south(), newBurrowState(world, pos));
			world.setBlockState(pos.east(), newBurrowState(world, pos));
			world.setBlockState(pos.west(), newBurrowState(world, pos));
			world.setBlockToAir(pos);

			pos = pos.west();
			world.setBlockState(pos.down(), newBurrowState(world, pos));
			world.setBlockState(pos.south(), newBurrowState(world, pos));
			world.setBlockState(pos.north(), newBurrowState(world, pos));
			world.setBlockState(pos.west(), newBurrowState(world, pos));
			world.setBlockState(pos.up(), newBurrowState(world, pos.up()));
			world.setBlockToAir(pos);

			if (world.rand.nextInt(2) == 0) {
				pos = pos.north();
				world.setBlockState(pos.down(), newBurrowState(world, pos));
				world.setBlockState(pos.north(), newBurrowState(world, pos));
				world.setBlockState(pos.west(), newBurrowState(world, pos));
				world.setBlockState(pos.east(), newBurrowState(world, pos));
				world.setBlockState(pos.up(), newBurrowState(world, pos.up()));
				world.setBlockToAir(pos);

				pos = pos.north();
				world.setBlockState(pos.down(), newBurrowState(world, pos));
				world.setBlockState(pos.north(), newBurrowState(world, pos));
				world.setBlockState(pos.west(), newBurrowState(world, pos));
				world.setBlockState(pos.east(), newBurrowState(world, pos));
				world.setBlockState(pos.up(), newBurrowState(world, pos.up()));
				world.setBlockToAir(pos);
			}
			else {
				pos = pos.south();
				world.setBlockState(pos.down(), newBurrowState(world, pos));
				world.setBlockState(pos.south(), newBurrowState(world, pos));
				world.setBlockState(pos.east(), newBurrowState(world, pos));
				world.setBlockState(pos.west(), newBurrowState(world, pos));
				world.setBlockState(pos.up(), newBurrowState(world, pos.up()));
				world.setBlockToAir(pos);

				pos = pos.south();
				world.setBlockState(pos.down(), newBurrowState(world, pos));
				world.setBlockState(pos.south(), newBurrowState(world, pos));
				world.setBlockState(pos.east(), newBurrowState(world, pos));
				world.setBlockState(pos.west(), newBurrowState(world, pos));
				world.setBlockState(pos.up(), newBurrowState(world, pos.up()));
				world.setBlockToAir(pos);
			}
		}

		return pos;
	}

	public static IBlockState newBurrowState(World world, BlockPos pos) {
		IBlockState oldBurrowState = world.getBlockState(pos);
		if (oldBurrowState == Blocks.SAND.getStateFromMeta(0)) {
			return BlockSandSticky.block.getDefaultState();
		}
		if (oldBurrowState == Blocks.SAND.getStateFromMeta(1)) {
			return BlockSandRedSticky.block.getDefaultState();
		}
		if (oldBurrowState == Blocks.GRAVEL) {
			return BlockSandRedSticky.block.getDefaultState();
		}
		if (oldBurrowState == BlockSandPangaean.block.getDefaultState()) {
			return BlockSandPangaeanSticky.block.getDefaultState();
		}
		if (world.isAirBlock(pos) ||
			(oldBurrowState.getMaterial() != Material.ROCK
				&& oldBurrowState.getMaterial() != Material.GROUND
				&& oldBurrowState.getMaterial() != Material.CLAY)
			) {
			return world.getBiome(pos).topBlock;
		}
		return oldBurrowState;
	}

}