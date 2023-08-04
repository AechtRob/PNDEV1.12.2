
package net.lepidodendron.entity;

import net.ilexiconn.llibrary.client.model.tools.ChainBuffer;
import net.ilexiconn.llibrary.server.animation.Animation;
import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.ai.DietString;
import net.lepidodendron.entity.ai.EatItemsEntityPrehistoricFloraFishBaseAI;
import net.lepidodendron.entity.ai.EntityMateAIFishBase;
import net.lepidodendron.entity.ai.FishWander;
import net.lepidodendron.entity.base.EntityPrehistoricFloraFishBase;
import net.lepidodendron.entity.util.EnumCreatureAttributePN;
import net.lepidodendron.item.entities.ItemUnknownEgg;
import net.lepidodendron.item.entities.spawneggs.ItemSpawnEggNotostracanStrudops;
import net.lepidodendron.item.entities.spawneggs.ItemSpawnEggNotostracanTriops;
import net.minecraft.entity.EnumCreatureAttribute;
import net.minecraft.entity.IEntityLivingData;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.passive.EntityAnimal;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.network.datasync.DataParameter;
import net.minecraft.network.datasync.DataSerializers;
import net.minecraft.network.datasync.EntityDataManager;
import net.minecraft.util.DamageSource;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.util.text.translation.I18n;
import net.minecraft.world.DifficultyInstance;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import org.apache.commons.lang3.ArrayUtils;

import javax.annotation.Nullable;

public class EntityPrehistoricFloraNotostracan extends EntityPrehistoricFloraFishBase {

	public BlockPos currentTarget;
	@SideOnly(Side.CLIENT)
	public ChainBuffer chainBuffer;
	private int animationTick;
	private Animation animation = NO_ANIMATION;

	private static final float[] STRUDOPS_SIZE = new float[]{0.3F, 0.2F};
	private static final float[] TRIOPS1_SIZE = new float[]{0.3F, 0.2F};
	private static final float[] TRIOPS2_SIZE = new float[]{0.3F, 0.2F};
	private static final float[] TRIOPS3_SIZE = new float[]{0.3F, 0.2F};

	private static final DataParameter<Integer> NOTOSTRACA_TYPE = EntityDataManager.<Integer>createKey(EntityPrehistoricFloraNotostracan.class, DataSerializers.VARINT);

	public EntityPrehistoricFloraNotostracan(World world) {
		super(world);
		setSize(getHitBoxSize()[0], getHitBoxSize()[1]);
	}

	@Override
	public EnumCreatureAttribute getCreatureAttribute() {
		return EnumCreatureAttribute.ARTHROPOD;
	}

	public ItemStack getPropagule() {
		ItemStack stack = new ItemStack(ItemUnknownEgg.block, (int) (1));
		if (!stack.hasTagCompound()) {
			NBTTagCompound compound = new NBTTagCompound();
			stack.setTagCompound(compound);
		}
		stack.getTagCompound().setString("PNType", this.getPNType().getName());
		return stack;
	}

	@Override
	public boolean canMateWith(EntityAnimal otherAnimal)
	{
		if (otherAnimal == this)
		{
			return false;
		}
		else if (otherAnimal.getClass() != this.getClass())
		{
			return false;
		}
		else {
			Type typeThis = this.getPNType();
			Type typeThat = ((EntityPrehistoricFloraNotostracan) otherAnimal).getPNType();
			if (typeThis == Type.STRUDOPS) {
				if (((EntityPrehistoricFloraNotostracan) otherAnimal).getPNType() != this.getPNType()) {
					return false;
				}
			}
			else {
				//Triops:
				if (typeThat == Type.STRUDOPS) {
					return false;
				}
			}
		}
		return this.isInLove() && otherAnimal.isInLove();
	}

	public ResourceLocation getStandardLoot() {
		switch (this.getPNType()) {
			case STRUDOPS: default:
				return LepidodendronMod.STRUDOPS_LOOT;

			case TRIOPS1:
				return LepidodendronMod.TRIOPS1_LOOT;

			case TRIOPS2:
				return LepidodendronMod.TRIOPS2_LOOT;

			case TRIOPS3:
				return LepidodendronMod.TRIOPS3_LOOT;

		}
	}

	public boolean hasPNVariants() {
		return true;
	}

	public enum Type
	{
		STRUDOPS(1, "strudops"),
		TRIOPS1(2, "triops1"),
		TRIOPS2(3, "triops2"),
		TRIOPS3(4, "triops3"),
		;

		private final String name;
		private final int metadata;

		Type(int metadataIn, String nameIn)
		{
			this.name = nameIn;
			this.metadata = metadataIn;
		}

		public String getName()
		{
			return this.name;
		}

		public int getMetadata()
		{
			return this.metadata;
		}

		public String toString()
		{
			return this.name;
		}

		public static EntityPrehistoricFloraNotostracan.Type byId(int id)
		{
			if (id < 0 || id >= values().length)
			{
				id = 0;
			}

			return values()[id];
		}

		public static EntityPrehistoricFloraNotostracan.Type getTypeFromString(String nameIn)
		{
			for (int i = 0; i < values().length; ++i)
			{
				if (values()[i].getName().equals(nameIn))
				{
					return values()[i];
				}
			}

			return values()[0];
		}

	}

	@Override
	public EnumCreatureAttributePN getPNCreatureAttribute() {
		return EnumCreatureAttributePN.INVERTEBRATE;
	}

	public float[] getHitBoxSize() {
		switch (this.getPNType()) {
			case STRUDOPS: default:
				return STRUDOPS_SIZE;

			case TRIOPS1:
				return TRIOPS1_SIZE;

			case TRIOPS2:
				return TRIOPS2_SIZE;

			case TRIOPS3:
				return TRIOPS3_SIZE;
		}
	}
	@Override
	public boolean isSmall() {
		return true;
	}

	public static String getPeriod() {return "Devonian - Carboniferous - Permian - Triassic - Jurassic - Cretaceous - Paleogene - Neogene - Pleistocene - [Present]";}

	//public static String getHabitat() {return "Aquatic";}

	@Override
	public boolean dropsEggs() {
		return true;
	}

	@Override
	protected float getAISpeedFish() {
		switch (this.getPNType()) {
			case STRUDOPS: default:
				return 0.2f;

			case TRIOPS1:
				return 0.2f;

			case TRIOPS2:
				return 0.2f;

			case TRIOPS3:
				return 0.2f;
		}
	}

	@Override
	protected boolean isSlowAtBottom() {
		return false;
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

	protected void initEntityAI() {
		tasks.addTask(0, new EntityMateAIFishBase(this, 1));
		tasks.addTask(1, new FishWander(this, NO_ANIMATION));
		this.targetTasks.addTask(0, new EatItemsEntityPrehistoricFloraFishBaseAI(this));
	}

	@Override
	public String[] getFoodOreDicts() {
		return ArrayUtils.addAll(DietString.FISHFOOD);
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
		this.getEntityAttribute(SharedMonsterAttributes.MAX_HEALTH).setBaseValue(4.0D);
		this.getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).setBaseValue(0.25D);
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
	protected void entityInit() {
		super.entityInit();
		this.dataManager.register(NOTOSTRACA_TYPE, 0);
	}

	@Override
	public IEntityLivingData onInitialSpawn(DifficultyInstance difficulty, @Nullable IEntityLivingData livingdata) {
		livingdata = super.onInitialSpawn(difficulty, livingdata);
		this.setPNType(EntityPrehistoricFloraNotostracan.Type.byId(rand.nextInt(EntityPrehistoricFloraNotostracan.Type.values().length) + 1));
		return livingdata;
	}
	public void setPNType(Type type)
	{
		this.dataManager.set(NOTOSTRACA_TYPE, Integer.valueOf(type.ordinal()));
	}

	public Type getPNType()
	{
		return Type.byId(((Integer)this.dataManager.get(NOTOSTRACA_TYPE)).intValue());
	}
	public void onEntityUpdate() {
		super.onEntityUpdate();
	}

	@Nullable
	protected ResourceLocation getLootTable() {
		return getStandardLoot();
	}

	@Override
	public ItemStack getPickedResult(RayTraceResult target)
	{
		if (target.entityHit instanceof EntityPrehistoricFloraNotostracan) {
			EntityPrehistoricFloraNotostracan cono = (EntityPrehistoricFloraNotostracan) target.entityHit;
			switch (cono.getPNType()) {
				case STRUDOPS: default:
					return new ItemStack(ItemSpawnEggNotostracanStrudops.block, 1);

				case TRIOPS1:
					return new ItemStack(ItemSpawnEggNotostracanTriops.block, 1);

				case TRIOPS2:
					return new ItemStack(ItemSpawnEggNotostracanTriops.block, 1);

				case TRIOPS3:
					return new ItemStack(ItemSpawnEggNotostracanTriops.block, 1);
			}
		}
		return ItemStack.EMPTY;
	}

	@Override
	public String getName() {
		if (this.hasCustomName())
		{
			return this.getCustomNameTag();
		}
		else
		{
			return I18n.translateToLocal("entity.prehistoric_flora_notostracan_" + this.getPNType().getName() + ".name");
		}
	}

	public void writeEntityToNBT(NBTTagCompound compound) {
		super.writeEntityToNBT(compound);
		compound.setString("PNType", this.getPNType().getName());
	}

	public void readEntityFromNBT(NBTTagCompound compound) {
		super.readEntityFromNBT(compound);
		if (compound.hasKey("PNType", 8))
		{
			this.setPNType(EntityPrehistoricFloraNotostracan.Type.getTypeFromString(compound.getString("PNType")));
		}
	}

}