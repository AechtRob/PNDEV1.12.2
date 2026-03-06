
package net.lepidodendron.entity;

import net.ilexiconn.llibrary.server.animation.Animation;
import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.block.BlockGlassJar;
import net.lepidodendron.block.base.IAdvancementGranter;
import net.lepidodendron.entity.ai.DietString;
import net.lepidodendron.entity.base.EntityPrehistoricFloraInsectFlyingBase;
import net.lepidodendron.entity.render.entity.RenderPalaeontinid;
import net.lepidodendron.entity.render.tile.RenderDisplays;
import net.lepidodendron.entity.util.ITrappableAir;
import net.lepidodendron.item.entities.ItemUnknownEggLand;
import net.lepidodendron.item.entities.spawneggs.*;
import net.lepidodendron.util.CustomTrigger;
import net.lepidodendron.util.ModTriggers;
import net.minecraft.client.model.ModelBase;
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
import net.minecraft.util.SoundEvent;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.util.text.translation.I18n;
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

public class EntityPrehistoricFloraPalaeontinid extends EntityPrehistoricFloraInsectFlyingBase implements ITrappableAir, IAdvancementGranter {

	private int animationTick;
	private Animation animation = NO_ANIMATION;

	private static final float[] AUSTROPROSBOLOIDES_SIZE = new float[]{0.2F, 0.2F};
	private static final float[] FLETCHERIANA_SIZE = new float[]{0.2F, 0.2F};
	private static final float[] PAPILIONTINA_SIZE = new float[]{0.2F, 0.2F};
	private static final float[] EOCICADA_SIZE = new float[]{0.2F, 0.2F};
	private static final float[] TALBRAGAROCOSSUS_SIZE = new float[]{0.2F, 0.2F};
	private static final float[] MIRACOSSUS_SIZE = new float[]{0.2F, 0.2F};
	private static final float[] ILERDOCOSSUS_SIZE = new float[]{0.2F, 0.2F};
	private static final float[] BAEOCOSSUS_SIZE = new float[]{0.2F, 0.2F};
	private static final float[] COLOSSOCOSSUS_SIZE = new float[]{0.2F, 0.2F};
	private static final float[] PACHYPSYCHE_SIZE = new float[]{0.2F, 0.2F};
	private static final float[] DAOHUGOUCOSSUS_SIZE = new float[]{0.2F, 0.2F};

	private static final DataParameter<Integer> INSECT_TYPE = EntityDataManager.<Integer>createKey(EntityPrehistoricFloraPalaeontinid.class, DataSerializers.VARINT);

	public EntityPrehistoricFloraPalaeontinid(World world) {
		super(world);

	//*****************************************************
	//Insect variant managers:

		setSize(getHitBoxSize()[0], getHitBoxSize()[1]);
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
					if (((EntityPrehistoricFloraPalaeontinid)otherAnimal).getPNType() == this.getPNType()) {
						return false;
					}
					break;

				case 1:
					if (((EntityPrehistoricFloraPalaeontinid)otherAnimal).getPNType() != this.getPNType()) {
						return false;
					}
					break;

			}
		}

		return this.isInLove() && otherAnimal.isInLove();
	}

	@Override
	public ItemStack getPickedResult(RayTraceResult target)
	{
		if (target.entityHit instanceof EntityPrehistoricFloraPalaeontinid) {
			EntityPrehistoricFloraPalaeontinid Palaeontinid = (EntityPrehistoricFloraPalaeontinid) target.entityHit;
			switch (Palaeontinid.getPNType()) {
				case AUSTROPROSBOLOIDES: default:
					return new ItemStack(ItemSpawnEggPalaeontinidAustroprosboloides.block, 1);

				case FLETCHERIANA:
					return new ItemStack(ItemSpawnEggPalaeontinidFletcheriana.block, 1);

				case PAPILIONTINA:
					return new ItemStack(ItemSpawnEggPalaeontinidPapiliontina.block, 1);

				case EOCICADA:
					return new ItemStack(ItemSpawnEggPalaeontinidEocicada.block, 1);

				case TALBRAGAROCOSSUS:
					return new ItemStack(ItemSpawnEggPalaeontinidTalbragarocossus.block, 1);

				case MIRACOSSUS:
					return new ItemStack(ItemSpawnEggPalaeontinidMiracossus.block, 1);

				case ILERDOCOSSUS:
					return new ItemStack(ItemSpawnEggPalaeontinidIlerdocossus.block, 1);

				case BAEOCOSSUS:
					return new ItemStack(ItemSpawnEggPalaeontinidBaeocossus.block, 1);

				case COLOSSOCOSSUS:
					return new ItemStack(ItemSpawnEggPalaeontinidColossocossus.block, 1);

				case PACHYPSYCHE:
					return new ItemStack(ItemSpawnEggPalaeontinidPachypsyche.block, 1);

				case DAOHUGOUCOSSUS:
					return new ItemStack(ItemSpawnEggPalaeontinidDaohugoucossus.block, 1);

			}
		}
		return ItemStack.EMPTY;
	}

	@Nullable
	@Override
	public CustomTrigger getModTrigger() {
		switch (this.getPNType()) {
			case AUSTROPROSBOLOIDES: default:
				return ModTriggers.CLICK_AUSTROPROSBOLOIDES;
			case FLETCHERIANA:
				return ModTriggers.CLICK_FLETCHERIANA;
			case PAPILIONTINA:
				return ModTriggers.CLICK_PAPILIONTINA;
			case EOCICADA:
				return ModTriggers.CLICK_EOCICADA;
			case TALBRAGAROCOSSUS:
				return ModTriggers.CLICK_TALBRAGAROCOSSUS;
			case MIRACOSSUS:
				return ModTriggers.CLICK_MIRACOSSUS;
			case ILERDOCOSSUS:
				return ModTriggers.CLICK_ILERDOCOSSUS;
			case BAEOCOSSUS:
				return ModTriggers.CLICK_BAEOCOSSUS;
			case COLOSSOCOSSUS:
				return ModTriggers.CLICK_COLOSSOCOSSUS;
			case PACHYPSYCHE:
				return ModTriggers.CLICK_PACHYPSYCHE;
			case DAOHUGOUCOSSUS:
				return ModTriggers.CLICK_DAOHUGOUCOSSUS;

		}
	}

	@Override
	public boolean hasPNVariants() {
		return true;
	}

	@Override
	public String getPNTypeName()
	{
		return this.getPNType().getName();
	}

	public enum Type
	{
		AUSTROPROSBOLOIDES(1, "austroprosboloides"),
		FLETCHERIANA(2, "fletcheriana"),
		PAPILIONTINA(3, "papiliontina"),
		EOCICADA(4, "eocicada"),
		TALBRAGAROCOSSUS(5, "talbragarocossus"),
		MIRACOSSUS(6, "miracossus"),
		ILERDOCOSSUS(7, "ilerdocossus"),
		BAEOCOSSUS(8, "baeocossus"),
		COLOSSOCOSSUS(9, "colossocossus"),
		PACHYPSYCHE(10, "pachypsyche"),
		DAOHUGOUCOSSUS(11, "daohugoucossus")
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

		public static Type byId(int id)
		{
			if (id < 0 || id >= values().length)
			{
				id = 0;
			}

			return values()[id];
		}

		public static Type getTypeFromString(String nameIn)
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

	public ResourceLocation getFreezeLoot() {
		switch (this.getPNType()) {
			case AUSTROPROSBOLOIDES: default:
				return LepidodendronMod.PALAEONTINID_AUSTROPROSBOLOIDES_LOOT;

			case FLETCHERIANA:
				return LepidodendronMod.PALAEONTINID_FLETCHERIANA_LOOT;

			case PAPILIONTINA:
				return LepidodendronMod.PALAEONTINID_PAPILIONTINA_LOOT;

			case EOCICADA:
				return LepidodendronMod.PALAEONTINID_EOCICADA_LOOT;

			case TALBRAGAROCOSSUS:
				return LepidodendronMod.PALAEONTINID_TALBRAGAROCOSSUS_LOOT;

			case MIRACOSSUS:
				return LepidodendronMod.PALAEONTINID_MIRACOSSUS_LOOT;

			case ILERDOCOSSUS:
				return LepidodendronMod.PALAEONTINID_ILERDOCOSSUS_LOOT;

			case BAEOCOSSUS:
				return LepidodendronMod.PALAEONTINID_BAEOCOSSUS_LOOT;

			case COLOSSOCOSSUS:
				return LepidodendronMod.PALAEONTINID_COLOSSOCOSSUS_LOOT;

			case PACHYPSYCHE:
				return LepidodendronMod.PALAEONTINID_PACHYPSYCHE_LOOT;

			case DAOHUGOUCOSSUS:
				return LepidodendronMod.DAOHUGOUCOSSUS_LOOT;
				
		}
	}

	public ResourceLocation getStandardLoot() {
		return LepidodendronMod.BUG_LOOT;
	}

	public float getFlySpeed() {
		switch (this.getPNType()) {
			case AUSTROPROSBOLOIDES: default:
				return 3f;

			case FLETCHERIANA:
				return 3f;

			case PAPILIONTINA:
				return 3f;

			case EOCICADA:
				return 3f;

			case TALBRAGAROCOSSUS:
				return 3f;

			case MIRACOSSUS:
				return 3f;

			case ILERDOCOSSUS:
				return 3f;

			case BAEOCOSSUS:
				return 3f;

			case COLOSSOCOSSUS:
				return 3f;

			case PACHYPSYCHE:
				return 3f;

			case DAOHUGOUCOSSUS:
				return 3f;

		}
	}

	public float[] getHitBoxSize() {
		switch (this.getPNType()) {
			case AUSTROPROSBOLOIDES: default:
				return AUSTROPROSBOLOIDES_SIZE;

			case FLETCHERIANA:
				return FLETCHERIANA_SIZE;

			case PAPILIONTINA:
				return PAPILIONTINA_SIZE;

			case EOCICADA:
				return EOCICADA_SIZE;

			case TALBRAGAROCOSSUS:
				return TALBRAGAROCOSSUS_SIZE;

			case MIRACOSSUS:
				return MIRACOSSUS_SIZE;

			case ILERDOCOSSUS:
				return ILERDOCOSSUS_SIZE;

			case BAEOCOSSUS:
				return BAEOCOSSUS_SIZE;

			case COLOSSOCOSSUS:
				return COLOSSOCOSSUS_SIZE;

			case PACHYPSYCHE:
				return PACHYPSYCHE_SIZE;

			case DAOHUGOUCOSSUS:
				return DAOHUGOUCOSSUS_SIZE;
		}
	}

	@Nullable
	protected ResourceLocation getLootTable() {
		return getStandardLoot();
	}

	//Rendering taxidermy:
	//--------------------
	public static double offsetCaseMagnified(@Nullable String variant) { return -0.21; }
	public static double offsetCase(@Nullable String variant) {
		switch (EntityPrehistoricFloraPalaeontinid.Type.getTypeFromString(variant)) {
			case AUSTROPROSBOLOIDES: default:
				return 0.0;

			case FLETCHERIANA:
				return 0.0;

			case PAPILIONTINA:
				return 0.0;

			case EOCICADA:
				return 0.0;

			case TALBRAGAROCOSSUS:
				return 0.0;

			case MIRACOSSUS:
				return 0.0;

			case ILERDOCOSSUS:
				return 0.0;

			case BAEOCOSSUS:
				return 0.0;

			case COLOSSOCOSSUS:
				return 0.0;

			case PACHYPSYCHE:
				return 0.0;

			case DAOHUGOUCOSSUS:
				return 0.0;
		}
	}

	public static double offsetWall(@Nullable String variant) {
		switch (EntityPrehistoricFloraPalaeontinid.Type.getTypeFromString(variant)) {
			case AUSTROPROSBOLOIDES: default:
				return 0.0;

			case FLETCHERIANA:
				return 0.0;

			case PAPILIONTINA:
				return 0.0;

			case EOCICADA:
				return 0.0;

			case TALBRAGAROCOSSUS:
				return 0.0;

			case MIRACOSSUS:
				return 0.0;

			case ILERDOCOSSUS:
				return 0.0;

			case BAEOCOSSUS:
				return 0.0;

			case COLOSSOCOSSUS:
				return 0.0;

			case PACHYPSYCHE:
				return 0.0;

			case DAOHUGOUCOSSUS:
				return 0.0;
		}
	}

	public static double upperfrontverticallinedepth(@Nullable String variant) {
		return 0.0;
	}
	public static double upperbackverticallinedepth(@Nullable String variant) {
		return 0.75;
	}
	public static double upperfrontlineoffset(@Nullable String variant) {
		return 0.0;
	}
	public static double upperfrontlineoffsetperpendiular(@Nullable String variant) {
		return -0F;
	}
	public static double upperbacklineoffset(@Nullable String variant) {
		return 0.0;
	}
	public static double upperbacklineoffsetperpendiular(@Nullable String variant) {
		return 0.0F;
	}
	public static double lowerfrontverticallinedepth(@Nullable String variant) {
		return 0;
	}
	public static double lowerbackverticallinedepth(@Nullable String variant) {
		return 0.6;
	}
	public static double lowerfrontlineoffset(@Nullable String variant) {
		return 0;
	}
	public static double lowerfrontlineoffsetperpendiular(@Nullable String variant) {
		return 0.0F;
	}
	public static double lowerbacklineoffset(@Nullable String variant) {
		return -0.0;
	}
	public static double lowerbacklineoffsetperpendiular(@Nullable String variant) {
		return 0F;
	}

	@SideOnly(Side.CLIENT)
	public static ResourceLocation textureDisplay(@Nullable String variant) {
		switch (EntityPrehistoricFloraPalaeontinid.Type.getTypeFromString(variant)) {
			case AUSTROPROSBOLOIDES:
			default:
				return RenderPalaeontinid.TEXTURE_AUSTROPROSBOLOIDES;

			case FLETCHERIANA:
				return RenderPalaeontinid.TEXTURE_FLETCHERIANA;

			case PAPILIONTINA:
				return RenderPalaeontinid.TEXTURE_PAPILIONTINA;

			case EOCICADA:
				return RenderPalaeontinid.TEXTURE_EOCICADA;

			case TALBRAGAROCOSSUS:
				return RenderPalaeontinid.TEXTURE_TALBRAGAROCOSSUS;

			case MIRACOSSUS:
				return RenderPalaeontinid.TEXTURE_MIRACOSSUS;

			case ILERDOCOSSUS:
				return RenderPalaeontinid.TEXTURE_COLOSSOCOSSUS;

			case BAEOCOSSUS:
				return RenderPalaeontinid.TEXTURE_ILERDOCOSSUS;

			case COLOSSOCOSSUS:
				return RenderPalaeontinid.TEXTURE_BAEOCOSSUS;

			case PACHYPSYCHE:
				return RenderPalaeontinid.TEXTURE_PACHYPSYCHE;

			case DAOHUGOUCOSSUS:
				return RenderPalaeontinid.TEXTURE_DAOHUGOUCOSSUS;
		}
	}
	@SideOnly(Side.CLIENT)
	public static ModelBase modelDisplay(@Nullable String variant) {
		switch (EntityPrehistoricFloraPalaeontinid.Type.getTypeFromString(variant)) {
			case AUSTROPROSBOLOIDES:
			default:
				return RenderDisplays.modelPalaeontinid;

			case FLETCHERIANA:
				return RenderDisplays.modelPalaeontinid;

			case PAPILIONTINA:
				return RenderDisplays.modelPalaeontinid;

			case EOCICADA:
				return RenderDisplays.modelPalaeontinid;

			case TALBRAGAROCOSSUS:
				return RenderDisplays.modelPalaeontinid;

			case MIRACOSSUS:
				return RenderDisplays.modelPalaeontinid;

			case ILERDOCOSSUS:
				return RenderDisplays.modelKrika;

			case BAEOCOSSUS:
				return RenderDisplays.modelNuddsia;

			case COLOSSOCOSSUS:
				return RenderDisplays.modelKarenina;

			case PACHYPSYCHE:
				return RenderDisplays.modelKarenina;

			case DAOHUGOUCOSSUS:
				return RenderDisplays.modelKarenina;
		}
	}

	public static float getScaler(@Nullable String variant) {
		return RenderPalaeontinid.getScaler(EntityPrehistoricFloraPalaeontinid.Type.getTypeFromString(variant));
	}

	public static float getScalerMagnified(@Nullable String variant) {
		return RenderPalaeontinid.getScaler(EntityPrehistoricFloraPalaeontinid.Type.getTypeFromString(variant)) * 3.0F;
	}

	

	@Override
	protected void dropLoot(boolean wasRecentlyHit, int lootingModifier, DamageSource source)
	{
		if (source == BlockGlassJar.BlockCustom.FREEZE) {
			ResourceLocation resourcelocation = getFreezeLoot();
			LootTable loottable = this.world.getLootTableManager().getLootTableFromLocation(resourcelocation);
			LootContext.Builder lootcontext$builder = (new LootContext.Builder((WorldServer)this.world)).withLootedEntity(this).withDamageSource(source);
			for (ItemStack itemstack : loottable.generateLootForPools(this.rand, lootcontext$builder.build()))
			{
				NBTTagCompound variantNBT = new NBTTagCompound();
				variantNBT.setString("PNType", this.getPNType().getName());
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
	protected void entityInit() {
		super.entityInit();
		this.dataManager.register(INSECT_TYPE, 0);
	}

	@Override
	public IEntityLivingData onInitialSpawn(DifficultyInstance difficulty, @Nullable IEntityLivingData livingdata) {
		livingdata = super.onInitialSpawn(difficulty, livingdata);
		this.setPNType(Type.byId(rand.nextInt(Type.values().length) + 1));
		return livingdata;
	}

	@Override
	public String getName() {
		if (this.hasCustomName())
		{
			return this.getCustomNameTag();
		}
		else
		{
			return I18n.translateToLocal("entity.prehistoric_flora_palaeontinid_" + this.getPNType().getName() + ".name");
		}
	}

	public void writeEntityToNBT(NBTTagCompound compound) {
		super.writeEntityToNBT(compound);
		compound.setString("PNType", this.getPNType().getName());
	}

	public void readEntityFromNBT(NBTTagCompound compound) {
		if (this.world != null) {
			super.readEntityFromNBT(compound);
		}
		if (compound.hasKey("PNType", 8))
		{
			this.setPNType(Type.getTypeFromString(compound.getString("PNType")));
		}
	}

	public void setPNType(Type type)
	{
		this.dataManager.set(INSECT_TYPE, Integer.valueOf(type.ordinal()));
	}

	public Type getPNType()
	{
		return Type.byId(((Integer)this.dataManager.get(INSECT_TYPE)).intValue());
	}

	//*****************************************************

	@Override
	public boolean canJar() {
		return true;
	}

	public static String getPeriod() {return "Permian - Triassic - Jurassic - Early Cretaceous";}

	//public static String getHabitat() {return "Terrestrial";}

	@Override
	public boolean dropsEggs() {
		return true;
	}

	@Override
	public ItemStack getDroppedEggItemStack() {
		ItemStack stack = new ItemStack(ItemUnknownEggLand.block, (int) (1));
		NBTTagCompound variantNBT = new NBTTagCompound();
		variantNBT.setString("PNType", this.getPNType().getName());
		variantNBT.setString("creature", "lepidodendron:prehistoric_fora_palaeontinid");
		stack.setTagCompound(variantNBT);
		return stack;
	}

	@Override
	public boolean laysEggs() {
		return false;
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
		if (this.flyProgress == 0 || this.getAttachmentPos() != null) {
			return 0.0f;
		}
		return getFlySpeed();
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

	@Override
	public ResourceLocation FlightSound() {
		return new ResourceLocation("lepidodendron:bug_flight");
	}

	@Override
	public String[] getFoodOreDicts() {
		return ArrayUtils.addAll(DietString.PLANTS);
	}

}