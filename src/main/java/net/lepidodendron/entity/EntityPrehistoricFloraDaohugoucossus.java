//
//package net.lepidodendron.entity;
//
//import net.ilexiconn.llibrary.client.model.tools.ChainBuffer;
//import net.ilexiconn.llibrary.server.animation.Animation;
//import net.lepidodendron.LepidodendronMod;
//import net.lepidodendron.block.BlockGlassJar;
//import net.lepidodendron.entity.ai.DietString;
//import net.lepidodendron.entity.base.EntityPrehistoricFloraInsectFlyingBase;
//import net.lepidodendron.entity.render.entity.RenderDaohugoucossus;
//import net.lepidodendron.entity.render.tile.RenderDisplays;
//import net.lepidodendron.entity.util.ITrappableAir;
//import net.lepidodendron.util.EggLayingConditions;
//import net.minecraft.block.BlockDirectional;
//import net.minecraft.block.properties.PropertyDirection;
//import net.minecraft.client.model.ModelBase;
//import net.minecraft.entity.SharedMonsterAttributes;
//import net.minecraft.item.ItemStack;
//import net.minecraft.util.DamageSource;
//import net.minecraft.util.ResourceLocation;
//import net.minecraft.util.SoundEvent;
//import net.minecraft.util.math.BlockPos;
//import net.minecraft.world.World;
//import net.minecraft.world.WorldServer;
//import net.minecraft.world.storage.loot.LootContext;
//import net.minecraft.world.storage.loot.LootTable;
//import net.minecraftforge.fml.relauncher.Side;
//import net.minecraftforge.fml.relauncher.SideOnly;
//import org.apache.commons.lang3.ArrayUtils;
//
//import javax.annotation.Nullable;
//
//public class EntityPrehistoricFloraDaohugoucossus extends EntityPrehistoricFloraInsectFlyingBase implements ITrappableAir {
//
//	public BlockPos currentTarget;
//	@SideOnly(Side.CLIENT)
//	public ChainBuffer chainBuffer;
//	private int animationTick;
//	private Animation animation = NO_ANIMATION;
//
//	public EntityPrehistoricFloraDaohugoucossus(World world) {
//		super(world);
//		setSize(0.3F, 0.2F);
//	}
//
//	@Override
//	public int getEggType(@Nullable String variantIn) {
//		return 20; //insect
//	}
//
//	@Override
//	public String[] getFoodOreDicts() {
//		return ArrayUtils.addAll(DietString.PLANTS);
//	}
//
//	@Override
//	public boolean canJar() {
//		return true;
//	}
//
//	@Override
//	public int sitTickCtMax() {
//		return 2400;
//	}
//
//	@Override
//	public int sitCooldownSetter() {
//		return 500 + rand.nextInt(1000);
//	}
//
//	@Override
//	public ResourceLocation FlightSound() {
//		return new ResourceLocation("lepidodendron:bug_flight");
//	}
//
//	public static String getPeriod() {return "Jurassic";}
//
//	//public static String getHabitat() {return "Terrestrial";}
//
//	@Override
//	public boolean dropsEggs() {
//		return false;
//	}
//
//	@Override
//	public boolean laysEggs() {
//		return true;
//	}
//
//	@Override
//	public int getAnimationTick() {
//		return animationTick;
//	}
//
//	@Override
//	public void setAnimationTick(int tick)
//	{
//		animationTick = tick;
//	}
//
//	@Override
//	public Animation getAnimation()
//	{
//		return this.animation;
//	}
//
//	@Override
//	public void setAnimation(Animation animation)
//	{
//		if (animation == NO_ANIMATION){
//			onAnimationFinish(this.animation);
//			setAnimationTick(0);
//		}
//		this.animation = animation;
//	}
//
//	@Override
//	public Animation[] getAnimations()
//	{
//		return null;
//	}
//
//	protected void onAnimationFinish(Animation animation)
//	{}
//
//	@Override
//	protected float getAISpeedInsect() {
//		if (this.getTicks() < 0) {
//			return 0.0F; //Is laying eggs
//		}
//		return 2.76f;
//	}
//
//	@Override
//	public boolean isAIDisabled() {
//		return false;
//	}
//
//	@Override
//	public boolean laysInBlock() {
//		return true;
//	}
//
//	@Override
//	protected void applyEntityAttributes() {
//		super.applyEntityAttributes();
//		this.getEntityAttribute(SharedMonsterAttributes.MAX_HEALTH).setBaseValue(2.0D);
//		this.getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).setBaseValue(0.25D);
//	}
//
//	@Override
//	public String getTexture() {
//		return this.getTexture();
//	}
//
//	@Override
//	public SoundEvent getAmbientSound() {
//		return (SoundEvent) SoundEvent.REGISTRY.getObject(new ResourceLocation(""));
//	}
//
//	@Override
//	public SoundEvent getHurtSound(DamageSource ds) {
//		return (SoundEvent) SoundEvent.REGISTRY.getObject(new ResourceLocation("entity.generic.hurt"));
//	}
//
//	@Override
//	public SoundEvent getDeathSound() {
//		return (SoundEvent) SoundEvent.REGISTRY.getObject(new ResourceLocation("entity.generic.death"));
//	}
//
//	@Override
//	protected float getSoundVolume() {
//		return 1.0F;
//	}
//
//	@Nullable
//	protected ResourceLocation getLootTable() { return LepidodendronMod.BUG_LOOT;}
//
//	@Override
//	protected void dropLoot(boolean wasRecentlyHit, int lootingModifier, DamageSource source)
//	{
//		if (source == BlockGlassJar.BlockCustom.FREEZE) {
//			//System.err.println("Jar loot!");
//			ResourceLocation resourcelocation = LepidodendronMod.DAOHUGOUCOSSUS_LOOT;
//			LootTable loottable = this.world.getLootTableManager().getLootTableFromLocation(resourcelocation);
//			LootContext.Builder lootcontext$builder = (new LootContext.Builder((WorldServer)this.world)).withLootedEntity(this).withDamageSource(source);
//			for (ItemStack itemstack : loottable.generateLootForPools(this.rand, lootcontext$builder.build()))
//			{
//				this.entityDropItem(itemstack, 0.0F);
//			}
//		}
//		else {
//			super.dropLoot(wasRecentlyHit, lootingModifier, source);
//		}
//
//	}
//
//	public static final PropertyDirection FACING = BlockDirectional.FACING;
//
//	@Override
//	public boolean testLay(World world, BlockPos pos) {
//		return EggLayingConditions.testLayMossAndWoodInsectFlying(this, world, pos);
//	}
//
//	//Rendering taxidermy:
//	//--------------------
//	public static double offsetCase(@Nullable String variant) {
//		return 0.295F;
//	}
//	public static double offsetCaseMagnified(@Nullable String variant) { return 1.16; }
//	public static double offsetWall(@Nullable String variant) {
//		return 0.0;
//	}
//	public static double upperfrontverticallinedepth(@Nullable String variant) {
//		return 0.0;
//	}
//	public static double upperbackverticallinedepth(@Nullable String variant) {
//		return 0.0;
//	}
//	public static double upperfrontlineoffset(@Nullable String variant) {
//		return 0.0;
//	}
//	public static double upperfrontlineoffsetperpendiular(@Nullable String variant) {
//		return 0.0;
//	}
//	public static double upperbacklineoffset(@Nullable String variant) {
//		return 0.0;
//	}
//	public static double upperbacklineoffsetperpendiular(@Nullable String variant) {
//		return 0.0;
//	}
//	public static double lowerfrontverticallinedepth(@Nullable String variant) {
//		return 0.0;
//	}
//	public static double lowerbackverticallinedepth(@Nullable String variant) {
//		return 0.25;
//	}
//	public static double lowerfrontlineoffset(@Nullable String variant) {
//		return 0.0;
//	}
//	public static double lowerfrontlineoffsetperpendiular(@Nullable String variant) {
//		return 0.0;
//	}
//	public static double lowerbacklineoffset(@Nullable String variant) {
//		return 0.0;
//	}
//	public static double lowerbacklineoffsetperpendiular(@Nullable String variant) {
//		return -0.0;
//	}
//	@SideOnly(Side.CLIENT)
//	public static ResourceLocation textureDisplay(@Nullable String variant) {return RenderDaohugoucossus.TEXTURE;}
//	@SideOnly(Side.CLIENT)
//	public static ModelBase modelDisplay(@Nullable String variant) {return RenderDisplays.modelDaohugoucossus;}
//	public static float getScaler(@Nullable String variant) {
//		return RenderDaohugoucossus.getScaler();
//	}
//	public static float widthSupport(@Nullable String variant) {return 0.012F;}
//	public static float getScalerMagnified(@Nullable String variant) {
//		return RenderDaohugoucossus.getScaler() * 4.0F;
//	}
//
//}