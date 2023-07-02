
package net.lepidodendron.entity;

import net.ilexiconn.llibrary.client.model.tools.ChainBuffer;
import net.ilexiconn.llibrary.server.animation.Animation;
import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.block.*;
import net.lepidodendron.entity.ai.*;
import net.lepidodendron.entity.base.EntityPrehistoricFloraLandBase;
import net.lepidodendron.entity.model.llibraryextensions.MillipedeBuffer;
import net.lepidodendron.entity.render.entity.RenderArthropleura;
import net.lepidodendron.entity.render.tile.RenderDisplays;
import net.minecraft.block.Block;
import net.minecraft.block.BlockDirectional;
import net.minecraft.block.properties.PropertyDirection;
import net.minecraft.block.state.BlockFaceShape;
import net.minecraft.client.model.ModelBase;
import net.minecraft.entity.EnumCreatureAttribute;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.DamageSource;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.FMLCommonHandler;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.oredict.OreDictionary;

import javax.annotation.Nullable;

public class EntityPrehistoricFloraArthropleura extends EntityPrehistoricFloraLandBase {

	public BlockPos currentTarget;
	@SideOnly(Side.CLIENT)
	public ChainBuffer chainBuffer;
	private int animationTick;
	private int stepSoundTick;
	private Animation animation = NO_ANIMATION;
	@SideOnly(Side.CLIENT)
	public MillipedeBuffer arthropleuraBuffer;

	public EntityPrehistoricFloraArthropleura(World world) {
		super(world);
		setSize(0.8F, 0.25F);
		minWidth = 0.1F;
		maxWidth = 0.8F;
		maxHeight = 0.25F;
		maxHealthAgeable = 24.0D;
		if (FMLCommonHandler.instance().getSide().isClient()) {
			arthropleuraBuffer = new MillipedeBuffer();
		}
	}

	@Override
	public boolean canJar() {
		return false;
	}

	@Override
	public String getEggNBT() {
		return LepidodendronMod.MODID + ":insect_eggs_arthropleura";
	}

	public static String getPeriod() {return "Carboniferous [- Permian]";}

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
	public int getAdultAge() {
		return 64000;
	} //Only adults!

	@Override
	public int getAnimationTick() {
		return getAnimationTick();
	}

	@Override
	public float getAISpeedLand() {
		return 0.375f * (float)Math.max(0.6, this.getAgeScale());
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
		tasks.addTask(2, new LandWanderAvoidWaterAI(this, 1.0D, 5));
		tasks.addTask(3, new EntityLookIdleAI(this));
		this.targetTasks.addTask(0, new EatPlantItemsAI(this, 1D));
		this.targetTasks.addTask(1, new EntityHurtByTargetSmallerThanMeAI(this, false));
	}

	@Override
	public boolean isBreedingItem(ItemStack stack)
	{
		return (
				(OreDictionary.containsMatch(false, OreDictionary.getOres("plant"), stack))
		);
	}

	@Override
	public boolean isAIDisabled() {
		return false;
	}

	@Override
	public void onUpdate() {
		super.onUpdate();
		if (world.isRemote && !this.isAIDisabled()) {
			arthropleuraBuffer.calculateChainSwingBuffer(120, 8, 2.5F, this);
		}
	}

	@Override
	public String getTexture() {
		return this.getTexture();
	}

	@Override
	public EnumCreatureAttribute getCreatureAttribute() {
		return EnumCreatureAttribute.ARTHROPOD;
	}

	@Override
	protected boolean canDespawn() {
		return false;
	}

	@Override
	protected void applyEntityAttributes() {
		super.applyEntityAttributes();
		this.getEntityAttribute(SharedMonsterAttributes.MAX_HEALTH).setBaseValue(0.8D);
		this.getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).setBaseValue(0.3D);
	}

	@Override
	protected void playStepSound(BlockPos pos, Block blockIn)
	{

	}

	@Override
	public net.minecraft.util.SoundEvent getAmbientSound() {
		return (net.minecraft.util.SoundEvent) net.minecraft.util.SoundEvent.REGISTRY
				.getObject(new ResourceLocation("lepidodendron:arthropleura_idle"));
		//=null
	}

	@Override
	public net.minecraft.util.SoundEvent getHurtSound(DamageSource ds) {
		return (net.minecraft.util.SoundEvent) net.minecraft.util.SoundEvent.REGISTRY
				.getObject(new ResourceLocation("lepidodendron:eoarthropleura_hurt"));
	}

	@Override
	public net.minecraft.util.SoundEvent getDeathSound() {
		return (net.minecraft.util.SoundEvent) net.minecraft.util.SoundEvent.REGISTRY
				.getObject(new ResourceLocation("lepidodendron:eoarthropleura_death"));
	}

	@Override
	protected float getSoundVolume() {
		return 0.5F;
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
			this.world.destroyBlock(pos,false);
			this.setHealth(this.getHealth() + 0.5F);
		}

		this.stepSoundTick ++;

		if (this.getIsMoving() && this.stepSoundTick > 60 && this.getAgeScale() >= 0.6) {
			net.minecraft.util.SoundEvent soundEvent = (net.minecraft.util.SoundEvent) net.minecraft.util.SoundEvent.REGISTRY
					.getObject(new ResourceLocation("lepidodendron:arthropleura_step"));
			this.playSound(soundEvent, this.getSoundVolume() * this.getAgeScale(), 1.5F - (0.5F * this.getAgeScale()));
			this.stepSoundTick = 0;
		}

	}

	public static final PropertyDirection FACING = BlockDirectional.FACING;

	public boolean testLay(World world, BlockPos pos) {
		if (
			world.getBlockState(pos).getBlock() == BlockRottenLog.block
			|| world.getBlockState(pos).getBlock() == BlockAncientMoss.block
			|| world.getBlockState(pos).getBlock() == BlockDollyphyton.block
			|| world.getBlockState(pos).getBlock() == BlockEdwardsiphyton.block
			|| world.getBlockState(pos).getBlock() == BlockSelaginella.block
		) {
			String eggRenderType = "";
			TileEntity te = world.getTileEntity(pos);
			if (te != null) {
				if (te.getTileData().hasKey("egg")) {
					eggRenderType = te.getTileData().getString("egg");
				}
			}
			if (eggRenderType.equals("")) {
				//There is a space, is the orientation correct?
				if (world.getBlockState(pos).getBlock() == BlockRottenLog.block) {
					EnumFacing facing = world.getBlockState(pos).getValue(FACING);
					BlockFaceShape faceshape = world.getBlockState(pos.down()).getBlockFaceShape(world, pos.down(), EnumFacing.UP);
					if (!((facing == EnumFacing.NORTH || facing == EnumFacing.SOUTH)
						&& faceshape != BlockFaceShape.SOLID)) {
						//This is solid for laying:
						return true;
					}
				}
				else {
					//Is it upward-facing?
					EnumFacing facing = world.getBlockState(pos).getValue(FACING);
					if (facing == EnumFacing.UP) {
						//This is OK for laying mosses
						return true;
					}
				}
			}
		}
		return false;
	}

	@Nullable
	protected ResourceLocation getLootTable() {
		if (!this.isPFAdult()) {
			return LepidodendronMod.ARTHROPLEURA_LOOT_YOUNG;
		} return LepidodendronMod.ARTHROPLEURA_LOOT;
	}

	//Rendering taxidermy:
	//--------------------
	public static double offsetPlinth() { return 0.56; }
	public static double offsetWall(@Nullable String variant) { return 0.05; }
	public static double upperfrontverticallinedepth(@Nullable String variant) {
		return 0.8;
	}
	public static double upperbackverticallinedepth(@Nullable String variant) {
		return 0.5;
	}
	public static double upperfrontlineoffset(@Nullable String variant) {
		return 0.2;
	}
	public static double upperfrontlineoffsetperpendiular(@Nullable String variant) {
		return 0.0F;
	}
	public static double upperbacklineoffset(@Nullable String variant) {
		return 0.2;
	}
	public static double upperbacklineoffsetperpendiular(@Nullable String variant) {
		return 0.0F;
	}
	public static double lowerfrontverticallinedepth(@Nullable String variant) {
		return 0.1;
	}
	public static double lowerbackverticallinedepth(@Nullable String variant) {
		return 0.1;
	}
	public static double lowerfrontlineoffset(@Nullable String variant) {
		return 0.4;
	}
	public static double lowerfrontlineoffsetperpendiular(@Nullable String variant) {
		return 0.05F;
	}
	public static double lowerbacklineoffset(@Nullable String variant) {
		return 0.3;
	}
	public static double lowerbacklineoffsetperpendiular(@Nullable String variant) {
		return 0.0F;
	}
	@SideOnly(Side.CLIENT)
	public static ResourceLocation textureDisplay(@Nullable String variant) {
		return RenderArthropleura.TEXTURE;
	}
	@SideOnly(Side.CLIENT)
	public static ModelBase modelDisplay(@Nullable String variant) {
		return RenderDisplays.modelArthropleura;
	}
	public static float getScaler(@Nullable String variant) {
		return RenderArthropleura.getScaler();
	}
}