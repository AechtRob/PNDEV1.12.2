
package net.lepidodendron.entity;

import net.ilexiconn.llibrary.client.model.tools.ChainBuffer;
import net.ilexiconn.llibrary.server.animation.Animation;
import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.block.BlockGlassJar;
import net.lepidodendron.entity.ai.*;
import net.lepidodendron.entity.base.EntityPrehistoricFloraLandClimbingBase;
import net.lepidodendron.entity.render.entity.RenderHarvestman;
import net.lepidodendron.entity.render.tile.RenderDisplays;
import net.lepidodendron.entity.util.ITrappableAir;
import net.lepidodendron.util.EggLayingConditions;
import net.minecraft.block.BlockDirectional;
import net.minecraft.block.properties.PropertyDirection;
import net.minecraft.client.model.ModelBase;
import net.minecraft.entity.EnumCreatureAttribute;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.DamageSource;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.WorldServer;
import net.minecraft.world.storage.loot.LootContext;
import net.minecraft.world.storage.loot.LootTable;
import net.minecraftforge.fml.common.registry.EntityRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import org.apache.commons.lang3.ArrayUtils;

import javax.annotation.Nullable;

public class EntityPrehistoricFloraHarvestman extends EntityPrehistoricFloraLandClimbingBase implements ITrappableAir {

	public BlockPos currentTarget;
	@SideOnly(Side.CLIENT)
	public ChainBuffer chainBuffer;
	private int animationTick;
	private Animation animation = NO_ANIMATION;

	public EntityPrehistoricFloraHarvestman(World world) {
		super(world);
		setSize(0.3F, 0.3F);
		minWidth = 0.3F;
		maxWidth = 0.3F;
		maxHeight = 0.3F;
		maxHealthAgeable = 4.0D;
	}

	@Override
	public int getEggType(@Nullable String variantIn) {
		return 20; //insect
	}

	@Override
	public boolean canJar() {
		return true;
	}

	@Override
	public float getAISpeedLand() {
		return 0.5F;
	}

	@Override
	public float getSwimHeight() {
		return 0.8F;
	}

	public static String getPeriod() {return "Devonian - Carboniferous - Permian - Triassic - Jurassic - Early Cretaceous - Late Cretaceous - Paleogene - Neogene - Pleistocene [ - present]";}

	//public static String getHabitat() {return "Terrestrial";}

	@Override
	public boolean dropsEggs() {
		return false;
	}

	@Override
	public boolean laysEggs() {
		return true;
	}

	@Override
	public int getAnimationTick() {
		return getAnimationTick();
	}

	@Override
	public void setAnimationTick(int tick) {
		animationTick = tick;
	}

	@Override
	public Animation getAnimation() {
		return null;
	}

	@Override
	public void setAnimation(Animation animation) {
		this.animation = animation;
	}

	@Override
	public Animation[] getAnimations() {
		return null;
	}

	@Override
	public int getAdultAge() {
		return 0;
	}

	protected void initEntityAI() {
		tasks.addTask(0, new EntityMateAIAgeableBase(this, 1));
		tasks.addTask(1, new LandEntitySwimmingAI(this, 0.15, true));
		tasks.addTask(2, new LandWanderAvoidWaterClimbingAI(this, 0.8D, 20));
		tasks.addTask(3, new EntityLookIdleAI(this));
		this.targetTasks.addTask(0, new EatItemsEntityPrehistoricFloraAgeableBaseAI(this, 1));
	}

	@Override
	public String[] getFoodOreDicts() {
		return ArrayUtils.addAll(DietString.BUG);
	}

	@Override
	public boolean isAIDisabled() {
		return false;
	}

	@Override
	public String getTexture() {
		return this.getTexture();
	}

	@Override
	protected boolean canDespawn() {
		return false;
	}

	@Override
	protected void applyEntityAttributes() {
		super.applyEntityAttributes();
		this.getEntityAttribute(SharedMonsterAttributes.MAX_HEALTH).setBaseValue(2.0D);
		this.getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).setBaseValue(0.22D);
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

	@Nullable
	protected ResourceLocation getLootTable() {
		return LepidodendronMod.BUG_LOOT;
	}

	public static final PropertyDirection FACING = BlockDirectional.FACING;

	public boolean testLay(World world, BlockPos pos) {
		return EggLayingConditions.testLayMossAndWood(this, world, pos);
	}

	@Override
	protected void dropLoot(boolean wasRecentlyHit, int lootingModifier, DamageSource source)
	{
		if (source == BlockGlassJar.BlockCustom.FREEZE) {
			//System.err.println("Jar loot!");
			ResourceLocation resourcelocation = LepidodendronMod.HARVESTMAN_LOOT;
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

	//Rendering taxidermy:
	//--------------------
	public static double offsetCase(@Nullable String variant) {
		return 0.20F;
	}
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
	public static ResourceLocation textureDisplay(@Nullable String variant) {return RenderHarvestman.TEXTURE;}
	@SideOnly(Side.CLIENT)
	public static ModelBase modelDisplay(@Nullable String variant) {return RenderDisplays.modelHarvestman;}
	public static float getScaler(@Nullable String variant) {
		return RenderHarvestman.getScaler();
	}
	public static float widthSupport(@Nullable String variant) {return 0.012F;}

}