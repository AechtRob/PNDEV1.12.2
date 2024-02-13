
package net.lepidodendron.entity;

import net.ilexiconn.llibrary.client.model.tools.ChainBuffer;
import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.render.entity.RenderDysalotosaurus;
import net.lepidodendron.entity.render.tile.RenderDisplays;
import net.lepidodendron.entity.util.ITrappableLand;
import net.lepidodendron.util.CustomTrigger;
import net.lepidodendron.util.ModTriggers;
import net.minecraft.client.model.ModelBase;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.util.DamageSource;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.FMLCommonHandler;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import javax.annotation.Nullable;
import java.util.List;

public class EntityPrehistoricFloraDysalotosaurus extends EntityPrehistoricFloraDryosaurus implements ITrappableLand {

	public BlockPos currentTarget;
	@SideOnly(Side.CLIENT)
	public ChainBuffer chainBuffer;
	//private int inPFLove;
	public ChainBuffer tailBuffer;
	private int alarmCooldown;

	public EntityPrehistoricFloraDysalotosaurus(World world) {
		super(world);
		setSize(0.7F, 0.8F);
		minWidth = 0.12F;
		maxWidth = 0.7F;
		maxHeight = 0.8F;
		maxHealthAgeable = 18.0D;
		if (FMLCommonHandler.instance().getSide().isClient()) {
			tailBuffer = new ChainBuffer();
		}
	}

	@Nullable
	@Override
	public CustomTrigger getModTrigger() {
		return ModTriggers.CLICK_DYSALOTOSAURUS;
	}

	@Override
	public boolean attackEntityFrom(DamageSource ds, float i) {
		Entity e = ds.getTrueSource();
		if (e instanceof EntityLivingBase) {
			EntityLivingBase ee = (EntityLivingBase) e;
			List<EntityPrehistoricFloraDysalotosaurus> Dysalotosaurus = this.world.getEntitiesWithinAABB(EntityPrehistoricFloraDysalotosaurus.class, new AxisAlignedBB(this.getPosition().add(-8, -4, -8), this.getPosition().add(8, 4, 8)));
			for (EntityPrehistoricFloraDysalotosaurus currentDysalotosaurus : Dysalotosaurus) {
				currentDysalotosaurus.setRevengeTarget(ee);
				currentDysalotosaurus.alarmCooldown = rand.nextInt(20);
			}
		}
		return super.attackEntityFrom(ds, i);
	}

	@Override
	public boolean findGrappleTarget() {
		//System.err.println("finding grapple target");
		if (this.willGrapple) {
			return false;
		}
		List<EntityPrehistoricFloraDysalotosaurus> Dysalotosaurus = world.getEntitiesWithinAABB(EntityPrehistoricFloraDysalotosaurus.class, new AxisAlignedBB(this.getPosition().add(-8, -4, -8), this.getPosition().add(8, 4, 8)));
		for (EntityPrehistoricFloraDysalotosaurus currentDysalotosaurus : Dysalotosaurus) {
			if (currentDysalotosaurus.isPFAdult() && this.isPFAdult() && currentDysalotosaurus != this && (!currentDysalotosaurus.willGrapple) && this.canEntityBeSeen(currentDysalotosaurus)) {
				this.setGrappleTarget(currentDysalotosaurus);
				currentDysalotosaurus.willGrapple=true;
				this.willGrapple = true;
				currentDysalotosaurus.setGrappleTarget(this);
				return true;
			}
		}
		return false;
	}
	
	@Override
	public void onUpdate() {
		super.onUpdate();
		if (world.isRemote && !this.isAIDisabled()) {
			tailBuffer.calculateChainSwingBuffer(60, 10, 5F, this);
		}
	}

	@Override
	public int getEggType(@Nullable String variantIn) {
		return 0; //small
	}

	public static String getPeriod() {return "Jurassic";}

	@Override
	public float getAISpeedLand() {
		float speedBase = 0.335F;
		if (this.getTicks() < 0) {
			return 0.0F; //Is laying eggs
		}
		if (this.getAnimation() == DRINK_ANIMATION || this.getAnimation() == MAKE_NEST_ANIMATION || this.getAnimation() == GRAZE_ANIMATION || this.getAnimation() == LOOK_ANIMATION) {
			return 0.0F;
		}
		if (this.getIsFast()) {
			speedBase = speedBase * 2.65F;
		}
		return speedBase;
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
	protected void applyEntityAttributes() {
		super.applyEntityAttributes();
		//this.getAttributeMap().registerAttribute(SharedMonsterAttributes.ATTACK_DAMAGE);
		this.getEntityAttribute(SharedMonsterAttributes.ATTACK_DAMAGE).setBaseValue(3.0D);
		this.getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).setBaseValue(0.25D);
	}

	@Override
	public SoundEvent getAmbientSound() {
	    return (SoundEvent) SoundEvent.REGISTRY
	            .getObject(new ResourceLocation("lepidodendron:dryosaurid_idle"));
	}

	@Override
	public SoundEvent getHurtSound(DamageSource ds) {
	    return (SoundEvent) SoundEvent.REGISTRY
	            .getObject(new ResourceLocation("lepidodendron:dryosaurid_hurt"));
	}

	@Override
	public SoundEvent getDeathSound() {
	    return (SoundEvent) SoundEvent.REGISTRY
	            .getObject(new ResourceLocation("lepidodendron:dryosaurid_death"));
	}

	@Override
	public SoundEvent getAlarmSound() {
		return (SoundEvent) SoundEvent.REGISTRY
				.getObject(new ResourceLocation("lepidodendron:dryosaurid_alarm"));
	}

	@Override
	public SoundEvent getChatterSound() {
		return (SoundEvent) SoundEvent.REGISTRY
				.getObject(new ResourceLocation("lepidodendron:dryosaurid_chatter"));
	}

	@Nullable
	protected ResourceLocation getLootTable() {
		if (!this.isPFAdult()) {
			return LepidodendronMod.DYSALOTOSAURUS_LOOT_YOUNG;
		}
		return LepidodendronMod.DYSALOTOSAURUS_LOOT;
	}

	//Rendering taxidermy:
	//--------------------
	public static double offsetWall(@Nullable String variant) {
		return -0.178;
	}
	public static double upperfrontverticallinedepth(@Nullable String variant) {
		return 0.8;
	}
	public static double upperbackverticallinedepth(@Nullable String variant) {
		return 0.8;
	}
	public static double upperfrontlineoffset(@Nullable String variant) {
		return 0.2;
	}
	public static double upperfrontlineoffsetperpendiular(@Nullable String variant) {
		return -0.04F;
	}
	public static double upperbacklineoffset(@Nullable String variant) {
		return 0.2;
	}
	public static double upperbacklineoffsetperpendiular(@Nullable String variant) {
		return -0.04F;
	}

	//these 2 lines are rendered
	public static double lowerfrontverticallinedepth(@Nullable String variant) {
		return 0;
	}
	public static double lowerbackverticallinedepth(@Nullable String variant) {
		return 0.32F;
	}
	public static double lowerfrontlineoffset(@Nullable String variant) {
		return 1;
	}
	public static double lowerfrontlineoffsetperpendiular(@Nullable String variant) {
		return -0.2F;
	}
	public static double lowerbacklineoffset(@Nullable String variant) {
		return 0.05;
	}
	public static double lowerbacklineoffsetperpendiular(@Nullable String variant) {return -0.5F;}
	@SideOnly(Side.CLIENT)
	public static ResourceLocation textureDisplay(@Nullable String variant) {
		return RenderDysalotosaurus.TEXTURE;
	}
	@SideOnly(Side.CLIENT)
	public static ModelBase modelDisplay(@Nullable String variant) {
		return RenderDisplays.modelDysalotosaurus;
	}
	public static float getScaler(@Nullable String variant) {
		return RenderDysalotosaurus.getScaler();
	}

}