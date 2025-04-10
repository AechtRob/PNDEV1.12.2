
package net.lepidodendron.entity;

import net.ilexiconn.llibrary.client.model.tools.ChainBuffer;
import net.ilexiconn.llibrary.server.animation.Animation;
import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.block.base.IAdvancementGranter;
import net.lepidodendron.entity.ai.DietString;
import net.lepidodendron.entity.ai.EntityLookIdleAI;
import net.lepidodendron.entity.ai.EntityMateAISlitheringWaterBase;
import net.lepidodendron.entity.ai.SlitheringWanderBottom;
import net.lepidodendron.entity.base.EntityPrehistoricFloraSlitheringWaterBase;
import net.lepidodendron.entity.util.EnumCreatureAttributePN;
import net.lepidodendron.entity.util.ITrappableWater;
import net.lepidodendron.item.entities.ItemEchinodermEggsCidaroida;
import net.lepidodendron.util.CustomTrigger;
import net.lepidodendron.util.ModTriggers;
import net.minecraft.entity.Entity;
import net.minecraft.entity.IEntityLivingData;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.network.datasync.DataParameter;
import net.minecraft.network.datasync.DataSerializers;
import net.minecraft.network.datasync.EntityDataManager;
import net.minecraft.util.*;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.DifficultyInstance;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import org.apache.commons.lang3.ArrayUtils;

import javax.annotation.Nullable;

public class EntityPrehistoricFloraCidaroida extends EntityPrehistoricFloraSlitheringWaterBase implements IAdvancementGranter, ITrappableWater {

	private static final DataParameter<Integer> VARIANT= EntityDataManager.createKey(EntityPrehistoricFloraCidaroida.class, DataSerializers.VARINT);

	public BlockPos currentTarget;
	@SideOnly(Side.CLIENT)
	public ChainBuffer chainBuffer;
	private int animationTick;
	private Animation animation = NO_ANIMATION;

	public final EntityDamageSource SPIKY = new EntityDamageSource("spiky", this);

	public EntityPrehistoricFloraCidaroida(World world) {
		super(world, 0);//Does not slither
		setSize(0.26F, 0.2F);
	}

	@Override
	public EnumCreatureAttributePN getPNCreatureAttribute() {
		return EnumCreatureAttributePN.INVERTEBRATE;
	}

	protected void entityInit() {
		super.entityInit();
		this.dataManager.register(VARIANT, (rand.nextInt(4)));
	}

	@Override
	public IEntityLivingData onInitialSpawn(DifficultyInstance difficulty, @Nullable IEntityLivingData livingdata) {
		livingdata = super.onInitialSpawn(difficulty, livingdata);
		this.setVariant(rand.nextInt(4));
		return livingdata;
	}

	public void writeEntityToNBT(NBTTagCompound compound)
	{
		super.writeEntityToNBT(compound);
		compound.setInteger("variant", this.getVariant());
	}

	public void readEntityFromNBT(NBTTagCompound compound) {
		super.readEntityFromNBT(compound);
		this.setVariant(compound.getInteger("variant"));
	}

	public int getVariant() {
		return this.dataManager.get(VARIANT);
	}

	public void setVariant(int variant) {
		this.dataManager.set(VARIANT, variant);
	}

	@Override
	public boolean isSmall() {
		return true;
	}

	public static String getPeriod() {return "Triassic - Jurassic - Early Cretaceous - Late Cretaceous - Paleogene  - Neogene - Pleistocene - Present";}

	//public static String getHabitat() {return "Aquatic";}

	@Override
	public boolean dropsEggs() {
		return false;
	}

	protected float getAISpeedSlithering() {
		return 0.0275f;
	}

	@Override
	public ItemStack getPropagule() {
		return new ItemStack(ItemEchinodermEggsCidaroida.block, 1);
	}

	protected void initEntityAI() {
		tasks.addTask(0, new EntityMateAISlitheringWaterBase(this, 1));
		tasks.addTask(1, new SlitheringWanderBottom(this, NO_ANIMATION));
		tasks.addTask(2, new EntityLookIdleAI(this));
	}

	@Override
	public String[] getFoodOreDicts() {
		return ArrayUtils.addAll(DietString.ALGAE);
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

	@Nullable
	protected ResourceLocation getLootTable() {
		return LepidodendronMod.CIDAROIDA_LOOT;
	}

	@Override
	public boolean processInteract(EntityPlayer player, EnumHand hand) {
		if (player.getHeldItem(hand).isEmpty()) {
			player.attackEntityFrom(SPIKY, (float) 2);
		}
		return super.processInteract(player, hand);
	}

	@Override
	protected void collideWithEntity(Entity entityIn) {
		super.collideWithEntity(entityIn);
		if (entityIn instanceof EntityPlayer) {
			entityIn.attackEntityFrom(SPIKY, (float) 2);
		}
	}

	@Nullable
	@Override
	public CustomTrigger getModTrigger() {
		return ModTriggers.CLICK_CIDAROIDA;
	}
}