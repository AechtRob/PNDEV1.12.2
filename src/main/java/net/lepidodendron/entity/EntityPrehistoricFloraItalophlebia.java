
package net.lepidodendron.entity;

import net.ilexiconn.llibrary.client.model.tools.ChainBuffer;
import net.ilexiconn.llibrary.server.animation.Animation;
import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.block.BlockGlassJar;
import net.lepidodendron.entity.ai.DietString;
import net.lepidodendron.entity.base.EntityPrehistoricFloraInsectFlyingBase;
import net.lepidodendron.entity.util.ITrappableAir;
import net.lepidodendron.util.EggLayingConditions;
import net.minecraft.entity.Entity;
import net.minecraft.entity.IEntityLivingData;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.DamageSource;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.math.BlockPos;
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

public class EntityPrehistoricFloraItalophlebia extends EntityPrehistoricFloraInsectFlyingBase implements ITrappableAir {

	public BlockPos currentTarget;
	@SideOnly(Side.CLIENT)
	public ChainBuffer chainBuffer;
	private int animationTick;
	private Animation animation = NO_ANIMATION;
	private int hoverCooldown;
	private int hoverTick;

	public EntityPrehistoricFloraItalophlebia(World world) {
		super(world);
		setSize(0.3F, 0.2F);
	}

	@Override
	public String getEntityId(Entity entity) {
		String mobid = "";
		net.minecraftforge.fml.common.registry.EntityEntry entry =
				net.minecraftforge.fml.common.registry.EntityRegistry.getEntry(entity.getClass());
		if (entry != null) {
			mobid = entry.getRegistryName().toString() + "_nymph";
		}
		if (this.hasPNVariants() && this.getPNTypeName() != null) {
			mobid = mobid + "@" + this.getPNTypeName();
		}
		return mobid;
	}

	@Override
	public int getEggType(@Nullable String variantIn) {
		return 21; //cross model
	}

	public void onEntityUpdate() {
		if (!world.isRemote) {
			if (this.hoverTick > 0) {
				this.hoverTick--;
			}
			if (this.hoverCooldown > 0 && (!(hoverTick > 0))) {
				this.hoverCooldown--;
			}
			if (this.hoverCooldown == 0 && this.hoverTick == 0) {
				this.hoverTick = this.rand.nextInt(300);
				this.hoverCooldown = 300 + this.rand.nextInt(300);
			}

			//System.err.println("this.hoverTick " + this.hoverTick);
			//System.err.println("this.hoverCooldown " + this.hoverCooldown);
		}

		super.onEntityUpdate();

		if (!world.isRemote) {
			if (this.hoverTick > 0) {
				this.motionX = 0;
				this.motionY = 0;
				this.motionZ = 0;
			}
		}

		EggLayingConditions.layWaterBottomEggsNoPause(this);
	}

	@Override
	public IEntityLivingData onInitialSpawn(DifficultyInstance difficulty, @Nullable IEntityLivingData livingdata) {
		livingdata = super.onInitialSpawn(difficulty, livingdata);
		this.hoverCooldown = 300 + this.rand.nextInt(300);
		this.hoverTick = 0;
		return livingdata;
	}

	@Override
	public boolean canJar() {
		return true;
	}

	@Override
	public ResourceLocation FlightSound() {
		return new ResourceLocation("lepidodendron:dragonfly_flight");
	}

	public static String getPeriod() {return "late Triassic";}

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
		return animationTick;
	}

	@Override
	public void setAnimationTick(int tick)
	{
		animationTick = tick;
	}

	@Override
	public Animation getAnimation()
	{
		return this.animation;
	}

	@Override
	public void setAnimation(Animation animation)
	{
		if (animation == NO_ANIMATION){
			onAnimationFinish(this.animation);
			setAnimationTick(0);
		}
		this.animation = animation;
	}

	@Override
	public Animation[] getAnimations()
	{
		return null;
	}

	protected void onAnimationFinish(Animation animation)
	{}

	@Override
	protected float getAISpeedInsect() {
		if (this.getTicks() < 0) {
			return 0.0F; //Is laying eggs
		}
		if (!world.isRemote) {
			if (this.hoverTick > 0) {
				return 0.0F; //Is static for hovering
			}
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
		this.getEntityAttribute(SharedMonsterAttributes.MAX_HEALTH).setBaseValue(2.0D);
		this.getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).setBaseValue(0.25D);
	}

	@Override
	public String getTexture() {
		return this.getTexture();
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
		return 1.0F;
	}

	@Nullable
	protected ResourceLocation getLootTable() { return LepidodendronMod.BUG_LOOT;}

	@Override
	protected void dropLoot(boolean wasRecentlyHit, int lootingModifier, DamageSource source)
	{
		if (source == BlockGlassJar.BlockCustom.FREEZE) {
			//System.err.println("Jar loot!");
			ResourceLocation resourcelocation = LepidodendronMod.ITALOPHLEBIA_LOOT;
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

	@Override
	public String[] getFoodOreDicts() {
		return ArrayUtils.addAll(DietString.BUG);
	}

}