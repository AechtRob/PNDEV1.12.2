
package net.lepidodendron.entity;

import net.ilexiconn.llibrary.client.model.tools.ChainBuffer;
import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.block.base.IAdvancementGranter;
import net.lepidodendron.entity.ai.*;
import net.lepidodendron.entity.base.EntityPrehistoricFloraNautiloidBase;
import net.lepidodendron.entity.util.ITrappableWater;
import net.lepidodendron.util.CustomTrigger;
import net.lepidodendron.util.ModTriggers;
import net.minecraft.block.material.Material;
import net.minecraft.util.DamageSource;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import org.apache.commons.lang3.ArrayUtils;

import javax.annotation.Nullable;

public class EntityPrehistoricFloraBaculites extends EntityPrehistoricFloraNautiloidBase implements ITrappableWater, IAdvancementGranter {

	public BlockPos currentTarget;
	@SideOnly(Side.CLIENT)
	public ChainBuffer chainBuffer;
	@SideOnly(Side.CLIENT)
	public float bodyAngle;

	public EntityPrehistoricFloraBaculites(World world) {
		super(world);
		setSize(0.6F, 0.9F);
		minWidth = 0.07F;
		maxWidth = 0.6F;
		maxHeight = 0.9F;
		maxHealthAgeable = 6.0D;
	}

	@Override
	public void onLivingUpdate() {
		super.onLivingUpdate();
		//this.renderYawOffset = this.rotationYaw;
		if (this.world.isRemote) {
			if (this.canBeVertical()) {
				this.bodyAngle ++;
			}
			else {
				this.bodyAngle --;
			}
			if (this.bodyAngle > 90) {
				this.bodyAngle = 90;
			}
			if (this.bodyAngle < 0) {
				this.bodyAngle = 0;
			}
		}
	}

	@Override
	public boolean isSmall() {
		return true;
	}

	public static String getPeriod() {return "Late Cretaceous";}

	//public static String getHabitat() {return "Aquatic";}

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
		return 64000;
	}

	@Override
	protected float getAISpeedNautiloid() {
		//return 0;
		return 0.0498f;
	}

	//this checks if the mob can currently be vertical, that is, X blocks above it is still water
	//change the value inside up to denote now many blocks above to check
	public boolean canBeVertical() {
		//isReally in Water
		boolean check1 = this.isReallyInWater();
		int waterTest = Math.round(2 * this.getAgeScale());
		boolean check2 = this.world.getBlockState(this.getPosition().up(waterTest)).getMaterial() != Material.WATER;

		return check1 && !check2;
	}

	protected void initEntityAI() {
		tasks.addTask(0, new EntityMateAIAgeableBase(this, 1));
		tasks.addTask(1, new NautiloidWanderBottomDweller(this, NO_ANIMATION));
		tasks.addTask(2, new EntityLookIdleAI(this));
		this.targetTasks.addTask(0, new EatItemsEntityPrehistoricFloraAgeableBaseAI(this, 1));
	}

	@Override
	public String[] getFoodOreDicts() {
		return ArrayUtils.addAll(DietString.FISHFOOD);
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

	public void onEntityUpdate() {
		super.onEntityUpdate();
	}

	@Override
	public SoundEvent getDeathSound() {
		return (SoundEvent) SoundEvent.REGISTRY.getObject(new ResourceLocation("entity.generic.death"));
	}

	@Nullable
	protected ResourceLocation getLootTable() {
		if (!this.isPFAdult()) {
			return LepidodendronMod.BACULITES_LOOT_YOUNG;
		}
		return LepidodendronMod.BACULITES_LOOT;
	}

	@Nullable
	@Override
	public CustomTrigger getModTrigger() {
		return ModTriggers.CLICK_BACULITES;
	}

	//Rendering taxidermy:
	//--------------------

}
