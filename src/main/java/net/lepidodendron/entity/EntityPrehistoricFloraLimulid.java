
package net.lepidodendron.entity;

import net.ilexiconn.llibrary.client.model.tools.ChainBuffer;
import net.lepidodendron.LepidodendronConfig;
import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.ai.EntityMateAIAgeableBase;
import net.lepidodendron.entity.ai.EntityTemptAI;
import net.lepidodendron.entity.ai.WalkingAmphibianWander;
import net.lepidodendron.entity.base.EntityPrehistoricFloraWalkingAmphibianBase;
import net.lepidodendron.item.ItemFishFood;
import net.minecraft.entity.EnumCreatureAttribute;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.EntityAILookIdle;
import net.minecraft.item.ItemStack;
import net.minecraft.util.DamageSource;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import javax.annotation.Nullable;

public class EntityPrehistoricFloraLimulid extends EntityPrehistoricFloraWalkingAmphibianBase {

	public BlockPos currentTarget;
	@SideOnly(Side.CLIENT)
	public ChainBuffer chainBuffer;

	public EntityPrehistoricFloraLimulid(World world) {
		super(world);
		//setSize(1F, 0.99F);
		experienceValue = 0;
		this.isImmuneToFire = false;
		setNoAI(!true);
		enablePersistence();
		//minSize = 0.2F;
		//maxSize = 1.0F;
		minWidth = 0.1F;
		maxWidth = 0.4F;
		maxHeight = 0.4F;
		maxHealthAgeable = 6.0D;
	}

	public boolean isJumpingPF() {
		return this.isJumping;
	}

	@Override
	public boolean isSmall() {
		return true;
	}

	public static String getPeriod() {return "Triassic - Jurassic - Cretaceous - Palaeogene - Neogene - Pleistocene - Present";}

	public static String getHabitat() {return "Amphibious";}

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


		return (float) Math.min(1F, (this.getAgeScale())) * 0.1F;
	}

	@Override
	protected void initEntityAI() {
		tasks.addTask(0, new EntityMateAIAgeableBase(this, 1.0D));
		tasks.addTask(1, new EntityTemptAI(this, 1, false, true, (float) 0.5F));
		tasks.addTask(2, new WalkingAmphibianWander(this, NO_ANIMATION, 0.9, 0));
		tasks.addTask(3, new EntityAILookIdle(this));
	}

	@Override
	public boolean isBreedingItem(ItemStack stack)
	{
		return stack.getItem() == ItemFishFood.block;
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
		this.renderYawOffset = this.rotationYaw;
	}

	@Override
	public void onEntityUpdate() {
		super.onEntityUpdate();

	}

	@Nullable
	protected ResourceLocation getLootTable() {

		return LepidodendronMod.LIMULID_LOOT;
	}

}

