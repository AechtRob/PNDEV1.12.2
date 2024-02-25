
package net.lepidodendron.entity;

import net.ilexiconn.llibrary.client.model.tools.ChainBuffer;
import net.ilexiconn.llibrary.server.animation.Animation;
import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.block.base.IAdvancementGranter;
import net.lepidodendron.entity.ai.DietString;
import net.lepidodendron.entity.ai.EatItemsEntityPrehistoricFloraFishBaseAI;
import net.lepidodendron.entity.ai.EntityMateAIFishBase;
import net.lepidodendron.entity.ai.FishWander;
import net.lepidodendron.entity.base.EntityPrehistoricFloraFishBase;
import net.lepidodendron.entity.render.entity.RenderConodont;
import net.lepidodendron.entity.render.tile.RenderDisplays;
import net.lepidodendron.entity.util.ITrappableWater;
import net.lepidodendron.item.entities.ItemUnknownEgg;
import net.lepidodendron.item.entities.spawneggs.*;
import net.lepidodendron.util.CustomTrigger;
import net.lepidodendron.util.ModTriggers;
import net.minecraft.client.model.ModelBase;
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
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.util.text.translation.I18n;
import net.minecraft.world.DifficultyInstance;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import org.apache.commons.lang3.ArrayUtils;

import javax.annotation.Nullable;

public class EntityPrehistoricFloraConodont extends EntityPrehistoricFloraFishBase implements IAdvancementGranter, ITrappableWater {

	public BlockPos currentTarget;
	@SideOnly(Side.CLIENT)
	public ChainBuffer chainBuffer;
	private int animationTick;
	private Animation animation = NO_ANIMATION;

	private static final float[] IOWAGNATHUS_SIZE = new float[]{0.8F, 0.2F};
	private static final float[] PROCONODONTUS_SIZE = new float[]{0.2F, 0.2F};
	private static final float[] CLARKINA_SIZE = new float[]{0.3F, 0.2F};
	private static final float[] OZARKODINIA_SIZE = new float[]{0.4F, 0.2F};
	private static final float[] MISIKELLA_SIZE = new float[]{0.4F, 0.2F};
	private static final float[] HINDEODUS_SIZE = new float[]{0.4F, 0.2F};
	private static final float[] PROMISSUM_SIZE = new float[]{0.4F, 0.2F};
	private static final float[] CLYDAGNATHUS_SIZE = new float[]{0.4F, 0.2F};


	private static final DataParameter<Integer> CONODONT_TYPE = EntityDataManager.<Integer>createKey(EntityPrehistoricFloraConodont.class, DataSerializers.VARINT);

	public EntityPrehistoricFloraConodont(World world) {
		super(world);
		setSize(getHitBoxSize()[0], getHitBoxSize()[1]);
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
	public byte breedPNVariantsMatch() {
		return 1;
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
			switch (this.breedPNVariantsMatch()) {
				case 0: default:
					break;

				case -1:
					if (((EntityPrehistoricFloraConodont)otherAnimal).getPNType() == this.getPNType()) {
						return false;
					}
					break;

				case 1:
					if (((EntityPrehistoricFloraConodont)otherAnimal).getPNType() != this.getPNType()) {
						return false;
					}
					break;

			}
		}

		return this.isInLove() && otherAnimal.isInLove();
	}

	public ResourceLocation getStandardLoot() {
		switch (this.getPNType()) {
			case IOWAGNATHUS: default:
				return LepidodendronMod.IOWAGNATHUS_LOOT;

			case PROCONODONTUS:
				return LepidodendronMod.PROCONODONTUS_LOOT;

			case CLARKINA:
				return LepidodendronMod.CLARKINA_LOOT;

			case OZARKODINA:
				return LepidodendronMod.OZARKODINA_LOOT;

			case MISIKELLA:
				return LepidodendronMod.MISIKELLA_LOOT;

			case HINDEODUS:
				return LepidodendronMod.HINDEODUS_LOOT;

			case PROMISSUM:
				return LepidodendronMod.PROMISSUM_LOOT;

			case CLYDAGNATHUS:
				return LepidodendronMod.CLYDAGNATHUS_LOOT;

		}
	}

	@Override
	public boolean hasPNVariants() {
		return true;
	}

	@Nullable
	@Override
	public CustomTrigger getModTrigger() {
		switch (this.getPNType()) {
			case IOWAGNATHUS: default:
				return ModTriggers.CLICK_IOWAGNATHUS;

			case PROCONODONTUS:
				return ModTriggers.CLICK_PROCONODONTUS;

			case CLARKINA:
				return ModTriggers.CLICK_CLARKINA;

			case OZARKODINA:
				return ModTriggers.CLICK_OZARKODINA;

			case MISIKELLA:
				return ModTriggers.CLICK_MISIKELLA;

			case HINDEODUS:
				return ModTriggers.CLICK_HINDEODUS;

			case PROMISSUM:
				return ModTriggers.CLICK_PROMISSUM;

			case CLYDAGNATHUS:
				return ModTriggers.CLICK_CLYDAGNATHUS;

		}
	}

	public enum Type
	{
		IOWAGNATHUS(1, "iowagnathus"),
		PROCONODONTUS(2, "proconodontus"),
		CLARKINA(3, "clarkina"),
		OZARKODINA(4, "ozarkodina"),
		MISIKELLA(5, "misikella"),
		HINDEODUS(6, "hindeodus"),
		PROMISSUM(7, "promissum"),
		CLYDAGNATHUS(8, "clydagnathus"),
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

		public static EntityPrehistoricFloraConodont.Type byId(int id)
		{
			if (id < 0 || id >= values().length)
			{
				id = 0;
			}

			return values()[id];
		}

		public static EntityPrehistoricFloraConodont.Type getTypeFromString(String nameIn)
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

	public float[] getHitBoxSize() {
		switch (this.getPNType()) {
			case IOWAGNATHUS: default:
				return IOWAGNATHUS_SIZE;

			case PROCONODONTUS:
				return PROCONODONTUS_SIZE;

			case CLARKINA:
				return CLARKINA_SIZE;

			case OZARKODINA:
				return OZARKODINIA_SIZE;

			case MISIKELLA:
				return MISIKELLA_SIZE;

			case HINDEODUS:
				return HINDEODUS_SIZE;

			case PROMISSUM:
				return PROMISSUM_SIZE;

			case CLYDAGNATHUS:
				return CLYDAGNATHUS_SIZE;
		}
	}
	@Override
	public boolean isSmall() {
		return true;
	}

	public static String getPeriod() {return "Ordovician";}

	//public static String getHabitat() {return "Aquatic";}

	@Override
	public boolean dropsEggs() {
		return true;
	}

	@Override
	protected float getAISpeedFish() {
		switch (this.getPNType()) {
			case IOWAGNATHUS: default:
				return 0.2f;

			case PROCONODONTUS:
				return 0.2f;

			case CLARKINA:
				return 0.2f;

			case OZARKODINA:
				return 0.2f;

			case MISIKELLA:
				return 0.2f;

			case HINDEODUS:
				return 0.2f;

			case PROMISSUM:
				return 0.2f;

			case CLYDAGNATHUS:
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
	public EnumCreatureAttribute getCreatureAttribute() {
		return EnumCreatureAttribute.UNDEFINED;
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
	protected void entityInit() {
		super.entityInit();
		this.dataManager.register(CONODONT_TYPE, 0);
	}

	@Override
	public IEntityLivingData onInitialSpawn(DifficultyInstance difficulty, @Nullable IEntityLivingData livingdata) {
		livingdata = super.onInitialSpawn(difficulty, livingdata);
		this.setPNType(EntityPrehistoricFloraConodont.Type.byId(rand.nextInt(EntityPrehistoricFloraConodont.Type.values().length) + 1));
		this.setSizer(this.getHitBoxSize()[0], this.getHitBoxSize()[1]);
		return livingdata;
	}

	@Override
	public void onLivingUpdate() {
		super.onLivingUpdate();
		this.setSizer(this.getHitBoxSize()[0], this.getHitBoxSize()[1]);
	}

	protected void setSizer(float width, float height)
	{
		if (width != this.width || height != this.height)
		{
			float f = this.width;
			this.width = width;
			this.height = height;
			if (this.width != f) {
				double d0 = (double) width / 2.0D;
				this.setEntityBoundingBox(new AxisAlignedBB(this.posX - d0, this.posY, this.posZ - d0, this.posX + d0, this.posY + (double) this.height, this.posZ + d0));
			}
		}
	}

	public void setPNType(Type type)
	{
		this.dataManager.set(CONODONT_TYPE, Integer.valueOf(type.ordinal()));
	}

	public Type getPNType()
	{
		return Type.byId(((Integer)this.dataManager.get(CONODONT_TYPE)).intValue());
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
		if (target.entityHit instanceof EntityPrehistoricFloraConodont) {
			EntityPrehistoricFloraConodont cono = (EntityPrehistoricFloraConodont) target.entityHit;
			switch (cono.getPNType()) {
				case IOWAGNATHUS: default:
					return new ItemStack(ItemSpawnEggConodontIowagnathus.block, 1);

				case PROCONODONTUS:
					return new ItemStack(ItemSpawnEggConodontProconodontus.block, 1);

				case CLARKINA:
					return new ItemStack(ItemSpawnEggConodontClarkina.block, 1);

				case OZARKODINA:
					return new ItemStack(ItemSpawnEggConodontOzarkodina.block, 1);

				case MISIKELLA:
					return new ItemStack(ItemSpawnEggConodontMisikella.block, 1);

				case HINDEODUS:
					return new ItemStack(ItemSpawnEggConodontHindeodus.block, 1);

				case PROMISSUM:
					return new ItemStack(ItemSpawnEggConodontPromissum.block, 1);

				case CLYDAGNATHUS:
					return new ItemStack(ItemSpawnEggConodontClydagnathus.block, 1);
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
			return I18n.translateToLocal("entity.prehistoric_flora_conodont_" + this.getPNType().getName() + ".name");
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
			this.setPNType(EntityPrehistoricFloraConodont.Type.getTypeFromString(compound.getString("PNType")));
		}
	}

	//Rendering taxidermy:
	//--------------------
	public static double offsetCase(@Nullable String variant) {
		switch (EntityPrehistoricFloraConodont.Type.getTypeFromString(variant)) {
			case PROMISSUM: default:
				return 0.30;

			case CLYDAGNATHUS:
				return 0.27;

			case PROCONODONTUS:
				return 0.34;

			case OZARKODINA:
				return 0.30;

			case IOWAGNATHUS:
				return 0.30;

			case HINDEODUS:
				return 0.31;

			case CLARKINA:
				return 0.38;

			case MISIKELLA:
				return 0.41;
		}
	}

	public static double offsetWall(@Nullable String variant) {
		switch (EntityPrehistoricFloraConodont.Type.getTypeFromString(variant)) {
			case PROMISSUM: default:
				return 0.30;

			case CLYDAGNATHUS:
				return 0.27;

			case PROCONODONTUS:
				return 0.34;

			case OZARKODINA:
				return 0.30;

			case IOWAGNATHUS:
				return 0.30;

			case HINDEODUS:
				return 0.31;

			case CLARKINA:
				return 0.38;

			case MISIKELLA:
				return 0.41;
		}
	}

	public static double upperfrontverticallinedepth(@Nullable String variant) {
		return 1.4;
	}
	public static double upperbackverticallinedepth(@Nullable String variant) {
		return 0.8;
	}
	public static double upperfrontlineoffset(@Nullable String variant) {
		return 0.4;
	}
	public static double upperfrontlineoffsetperpendiular(@Nullable String variant) {
		return -0F;
	}
	public static double upperbacklineoffset(@Nullable String variant) {
		return 0.4;
	}
	public static double upperbacklineoffsetperpendiular(@Nullable String variant) {
		return -0.15F;
	}
	public static double lowerfrontverticallinedepth(@Nullable String variant) {
		return 0;
	}
	public static double lowerbackverticallinedepth(@Nullable String variant) {
		return 0.95;
	}
	public static double lowerfrontlineoffset(@Nullable String variant) {
		return 0;
	}
	public static double lowerfrontlineoffsetperpendiular(@Nullable String variant) {
		return -0.6F;
	}
	public static double lowerbacklineoffset(@Nullable String variant) {
		return -0.06;
	}
	public static double lowerbacklineoffsetperpendiular(@Nullable String variant) {
		return 0F;
	}

	@SideOnly(Side.CLIENT)
	public static ResourceLocation textureDisplay(@Nullable String variant) {
		switch (EntityPrehistoricFloraConodont.Type.getTypeFromString(variant)) {
			case PROMISSUM:
			default:
				return RenderConodont.TEXTURE_PROMISSUM;

			case CLYDAGNATHUS:
				return RenderConodont.TEXTURE_CLYDAGNATHUS;

			case PROCONODONTUS:
				return RenderConodont.TEXTURE_PROCONODONTUS;

			case OZARKODINA:
				return RenderConodont.TEXTURE_OZARKODINA;

			case IOWAGNATHUS:
				return RenderConodont.TEXTURE_IOWAGNATHUS;

			case HINDEODUS:
				return RenderConodont.TEXTURE_HINDEODUS;

			case CLARKINA:
				return RenderConodont.TEXTURE_CLARKINA;

			case MISIKELLA:
				return RenderConodont.TEXTURE_MISIKELLA;

		}
	}
	@SideOnly(Side.CLIENT)
	public static ModelBase modelDisplay(@Nullable String variant) {
		switch (EntityPrehistoricFloraConodont.Type.getTypeFromString(variant)) {
			case PROCONODONTUS: default:
				return RenderDisplays.modelProconodontus;

			case CLYDAGNATHUS:

			case CLARKINA:

			case MISIKELLA:

			case OZARKODINA:

			case HINDEODUS:
				return RenderDisplays.modelClydagnathus;

			case PROMISSUM:

			case IOWAGNATHUS:
				return RenderDisplays.modelPromissum;
		}
	}

	public static float getScaler(@Nullable String variant) {
		return RenderConodont.getScaler(EntityPrehistoricFloraConodont.Type.getTypeFromString(variant));
	}
}