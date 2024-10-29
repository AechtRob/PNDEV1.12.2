
package net.lepidodendron.entity;

import net.ilexiconn.llibrary.client.model.tools.ChainBuffer;
import net.lepidodendron.LepidodendronConfig;
import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.block.BlockEggsWater;
import net.lepidodendron.block.base.IAdvancementGranter;
import net.lepidodendron.entity.ai.*;
import net.lepidodendron.entity.base.EntityPrehistoricFloraWalkingAmphibianBase;
import net.lepidodendron.entity.util.ITrappableWater;
import net.lepidodendron.util.CustomTrigger;
import net.lepidodendron.util.ModTriggers;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.EnumCreatureAttribute;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.init.SoundEvents;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.DamageSource;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import org.apache.commons.lang3.ArrayUtils;

import javax.annotation.Nullable;

public class EntityPrehistoricFloraHibbertopterus extends EntityPrehistoricFloraWalkingAmphibianBase implements ITrappableWater, IAdvancementGranter {

	public BlockPos currentTarget;
	@SideOnly(Side.CLIENT)
	public ChainBuffer chainBuffer;

	public EntityPrehistoricFloraHibbertopterus(World world) {
		super(world);
		setSize(1F, 0.99F);
		minWidth = 0.1F;
		maxWidth = 1.0F;
		maxHeight = 0.99F;
		maxHealthAgeable = 15.0D;
	}

	@Override
	public int getEggType(@Nullable String variantIn) {
		return 46; //eurypterid type
	}

	@Override
	public boolean isSmall() {
		return this.getAgeScale() < 0.4;
	}

	public static String getPeriod() {return "Devonian - Carboniferous";}

	//public static String getHabitat() {return "Amphibious";}

	@Override
	public void playLivingSound() {
	}

	@Override
	public boolean dropsEggs() {
		return false;
	}
	
	@Override
	public boolean laysEggs() {
		return false;
	}

	@Override
	public int getAdultAge() {
		return 48000;
	}

	@Override
	public int WaterDist() {
		int i = (int) LepidodendronConfig.waterHibbertopterus;
		if (i > 16) {i = 16;}
		if (i < 1) {i = 1;}
		return i;
	}

	@Override
	protected float getAISpeedWalkingAmphibian() {
		//System.err.println("Speed Hibbert: " + (float) Math.min(1F, (this.getAgeScale() * 2F)) * 0.15F);

		if (this.getTicks() < 0) {
			return 0.0F; //Is laying eggs
		}
		return (float) Math.min(1F, (this.getAgeScale() * 2F)) * 0.15F;
	}

	@Override
	protected void initEntityAI() {
		tasks.addTask(0, new EntityMateAIAgeableBase(this, 1.0D));
		tasks.addTask(1, new EntityTemptAI(this, 1, false, true, (float) 0.5F));
		tasks.addTask(2, new WalkingAmphibianWander(this, NO_ANIMATION, 0.9, 0));
		tasks.addTask(3, new EntityLookIdleAI(this));
		this.targetTasks.addTask(0, new EatItemsEntityPrehistoricFloraAgeableBaseAI(this, 1));
	}

	@Override
	public String[] getFoodOreDicts() {
		return ArrayUtils.addAll(DietString.FISHFOOD, DietString.ALGAE);
	}

	@Override
	public boolean isAIDisabled() {
		return false;
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
		//this.getEntityAttribute(SharedMonsterAttributes.MAX_HEALTH).setBaseValue(15.0D);
		this.getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).setBaseValue(0.3D);
	}

	@Override
	public net.minecraft.util.SoundEvent getAmbientSound() {
		return (net.minecraft.util.SoundEvent) net.minecraft.util.SoundEvent.REGISTRY.getObject(new ResourceLocation(""));
	}

	@Override
	public net.minecraft.util.SoundEvent getHurtSound(DamageSource ds) {
		return (net.minecraft.util.SoundEvent) net.minecraft.util.SoundEvent.REGISTRY.getObject(new ResourceLocation("entity.generic.hurt"));
	}

	@Override
	public net.minecraft.util.SoundEvent getDeathSound() {
		return (net.minecraft.util.SoundEvent) net.minecraft.util.SoundEvent.REGISTRY.getObject(new ResourceLocation("entity.generic.death"));
	}

	@Override
	protected float getSoundVolume() {
		return 1.0F;
	}

	@Override
	public void onLivingUpdate() {
		super.onLivingUpdate();
		//this.renderYawOffset = this.rotationYaw;
	}

	@Override
	public void onEntityUpdate() {
		super.onEntityUpdate();

		//Lay eggs perhaps:
		if (!world.isRemote && this.isInWater() && this.isPFAdult() && this.getCanBreed() && this.getLaying() && this.getTicks() > 0
				&& (BlockEggsWater.block.canPlaceBlockAt(world, this.getPosition())
				|| BlockEggsWater.block.canPlaceBlockAt(world, this.getPosition().down()))
		){
			//if (Math.random() > 0.5) {
			this.setTicks(-50); //Flag this as stationary for egg-laying
			//}
		}

		if (!world.isRemote && this.isInWater() && this.isPFAdult() && this.getTicks() > -47 && this.getTicks() < 0) {
			//Is stationary for egg-laying:
			//System.err.println("Test2");
			IBlockState eggs = BlockEggsWater.block.getDefaultState();
			if (BlockEggsWater.block.canPlaceBlockAt(world, this.getPosition())) {
				if (!(world.isRemote)) {
					world.setBlockState(this.getPosition(), eggs);
					world.setTileEntity(this.getPosition(), new BlockEggsWater.TileEntityCustom());
					TileEntity te = world.getTileEntity(this.getPosition());
					te.getTileData().setString("creature", getEntityId(this));
				}
				this.setLaying(false);
				this.playSound(SoundEvents.ENTITY_CHICKEN_EGG, 1.0F, (this.rand.nextFloat() - this.rand.nextFloat()) * 0.2F + 1.0F);
			}
			if (BlockEggsWater.block.canPlaceBlockAt(world, this.getPosition().down())) {
				if (!(world.isRemote)) {
					world.setBlockState(this.getPosition().down(), eggs);
					world.setTileEntity(this.getPosition().down(), new BlockEggsWater.TileEntityCustom());
					TileEntity te = world.getTileEntity(this.getPosition().down());
					te.getTileData().setString("creature", getEntityId(this));
				}
				this.setLaying(false);
				this.playSound(SoundEvents.ENTITY_CHICKEN_EGG, 1.0F, (this.rand.nextFloat() - this.rand.nextFloat()) * 0.2F + 1.0F);
			}
			this.setTicks(0);
		}
	}

	@Nullable
	protected ResourceLocation getLootTable() {
		 		if (!this.isPFAdult()) {
			return LepidodendronMod.HIBBERTOPTERUS_LOOT_YOUNG;
		}
		return LepidodendronMod.HIBBERTOPTERUS_LOOT;
	}

	@Nullable
	@Override
	public CustomTrigger getModTrigger() {
		return ModTriggers.CLICK_HIBBERTOPTERUS;
	}
}

