
package net.lepidodendron.entity;

import net.ilexiconn.llibrary.client.model.tools.ChainBuffer;
import net.ilexiconn.llibrary.server.animation.Animation;
import net.lepidodendron.block.BlockAncientMoss;
import net.lepidodendron.block.BlockDollyphyton;
import net.lepidodendron.block.BlockEdwardsiphyton;
import net.lepidodendron.block.BlockSelaginella;
import net.lepidodendron.entity.ai.EntityMateAIAgeableBase;
import net.lepidodendron.entity.ai.LandEntitySwimmingAI;
import net.lepidodendron.entity.base.EntityPrehistoricFloraLandSlitheringBase;
import net.lepidodendron.entity.render.entity.RenderGyrosteus;
import net.lepidodendron.entity.render.entity.RenderHelenodora;
import net.lepidodendron.entity.render.tile.RenderDisplays;
import net.lepidodendron.item.entities.ItemLandSnail;
import net.minecraft.block.Block;
import net.minecraft.block.BlockDirectional;
import net.minecraft.block.properties.PropertyDirection;
import net.minecraft.client.model.ModelBase;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.EntityAILookIdle;
import net.minecraft.entity.ai.EntityAIWanderAvoidWater;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraft.util.DamageSource;
import net.minecraft.util.EnumParticleTypes;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.WorldServer;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.oredict.OreDictionary;

import javax.annotation.Nullable;

public class EntityPrehistoricFloraHelenodora extends EntityPrehistoricFloraLandSlitheringBase {

	public BlockPos currentTarget;
	@SideOnly(Side.CLIENT)
	public ChainBuffer chainBuffer;
	private int animationTick;
	private Animation animation = NO_ANIMATION;

	public EntityPrehistoricFloraHelenodora(World world) {
		super(world);
		setSize(0.2F, 0.2F);
		minWidth = 0.1F;
		maxWidth = 0.2F;
		maxHeight = 0.2F;
		maxHealthAgeable = 2D;
	}

	@Override
	public boolean canJar() {
		return true;
	}


	public static String getPeriod() {
		return "Carboniferous";
	}

	//public static String getHabitat() {return "Terrestrial";}

	@Override
	public boolean dropsEggs() {
		return true;
	}

	@Override
	public boolean laysEggs() {
		return false;
	}

	@Override
	public int getAdultAge() {
		return 0;
	} //Only adults!

	@Override
	public int getAnimationTick() {
		return getAnimationTick();
	}

	@Override
	public float getAISpeedLand() {
		return 0.1f;
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

	protected void initEntityAI() {
		tasks.addTask(0, new EntityMateAIAgeableBase(this, 1));
		tasks.addTask(1, new LandEntitySwimmingAI(this, 0.75, true));
		tasks.addTask(2, new EntityAIWanderAvoidWater(this, 1.0D));
		tasks.addTask(3, new EntityAILookIdle(this));
	}

	@Override
	public boolean isBreedingItem(ItemStack stack) {
		return (OreDictionary.containsMatch(false, OreDictionary.getOres("itemMoss"), stack));
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
		this.getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).setBaseValue(0.3D);
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
	public void onLivingUpdate() {
		super.onLivingUpdate();
		//this.renderYawOffset = this.rotationYaw;

		//Eat moss!
		BlockPos pos = this.getPosition();
		if ((this.getHealth() < this.getMaxHealth()) && this.getHealth() > 0
				&& ((this.world.getBlockState(pos).getBlock() == BlockDollyphyton.block)
				|| (this.world.getBlockState(pos).getBlock() == BlockEdwardsiphyton.block)
				|| (this.world.getBlockState(pos).getBlock() == BlockAncientMoss.block)
				|| (this.world.getBlockState(pos).getBlock() == BlockSelaginella.block))
		) {
			this.world.destroyBlock(pos, false);
			this.setHealth(this.getHealth() + 0.5F);
		}

	}

	public static final PropertyDirection FACING = BlockDirectional.FACING;


	@Nullable
	protected ResourceLocation getLootTable() {
		return null;
	}

	public static double offsetWall(@Nullable String variant) {
		return -1.36;
	}

	public static double upperfrontverticallinedepth(@Nullable String variant) {
		return 2.0;
	}

	public static double upperbackverticallinedepth(@Nullable String variant) {
		return 2.0;
	}

	public static double upperfrontlineoffset(@Nullable String variant) {
		return 0.0;
	}

	public static double upperfrontlineoffsetperpendiular(@Nullable String variant) {
		return 0.0F;
	}

	public static double upperbacklineoffset(@Nullable String variant) {
		return 0.2;
	}

	public static double upperbacklineoffsetperpendiular(@Nullable String variant) {
		return 1.4F;
	}

	public static double lowerfrontverticallinedepth(@Nullable String variant) {
		return 2.5;
	}

	public static double lowerbackverticallinedepth(@Nullable String variant) {
		return 2.2;
	}

	public static double lowerfrontlineoffset(@Nullable String variant) {
		return 0.0;
	}

	public static double lowerfrontlineoffsetperpendiular(@Nullable String variant) {
		return 2.0F;
	}

	public static double lowerbacklineoffset(@Nullable String variant) {
		return 0.0;
	}

	public static double lowerbacklineoffsetperpendiular(@Nullable String variant) {
		return -0.5F;
	}

	@SideOnly(Side.CLIENT)
	public static ResourceLocation textureDisplay(@Nullable String variant) {
		return RenderHelenodora.TEXTURE;
	}

	@SideOnly(Side.CLIENT)
	public static ModelBase modelDisplay(@Nullable String variant) {
		return RenderDisplays.modelHelenodora;
	}

	public static float getScaler(@Nullable String variant) {
		return RenderHelenodora.getScaler();
	}


	@Override
	public boolean attackEntityFrom(DamageSource source, float amount) {
		return super.attackEntityFrom(source, amount);
	}

}