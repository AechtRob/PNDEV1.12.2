
package net.lepidodendron.block;

import it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap;
import net.lepidodendron.ElementsLepidodendronMod;
import net.lepidodendron.LepidodendronConfig;
import net.lepidodendron.LepidodendronSorter;
import net.lepidodendron.block.base.IAdvancementGranter;
import net.lepidodendron.creativetab.TabLepidodendronStatic;
import net.lepidodendron.procedure.ProcedureWorldGenThamnobeatricea;
import net.lepidodendron.util.CustomTrigger;
import net.lepidodendron.util.ModTriggers;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.properties.PropertyInteger;
import net.minecraft.block.state.BlockFaceShape;
import net.minecraft.block.state.BlockStateContainer;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.client.renderer.block.statemap.StateMap;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.NonNullList;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.common.EnumPlantType;
import net.minecraftforge.common.IPlantable;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.oredict.OreDictionary;

import javax.annotation.Nullable;
import java.util.List;
import java.util.Random;

@ElementsLepidodendronMod.ModElement.Tag
public class BlockThamnobeatriceaSapling extends ElementsLepidodendronMod.ModElement {
	@GameRegistry.ObjectHolder("lepidodendron:thamnobeatricea_sapling")
	public static final Block block = null;
	public BlockThamnobeatriceaSapling(ElementsLepidodendronMod instance) {
		super(instance, LepidodendronSorter.thamnobeatricea_sapling);
	}

	@Override
	public void initElements() {
		elements.blocks.add(() -> new BlockCustom().setRegistryName("thamnobeatricea_sapling"));
		elements.items.add(() -> new ItemBlock(block).setRegistryName(block.getRegistryName()));
	}
	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(block), 0,
				new ModelResourceLocation("lepidodendron:thamnobeatricea_sapling", "inventory"));
		ModelLoader.setCustomStateMapper(block, (new StateMap.Builder()).ignore(BlockThamnobeatriceaSapling.LEVEL).build());

	}

	@Override
	public void init(FMLInitializationEvent event) {
		super.init(event);
		OreDictionary.registerOre("staticdnaPNlepidodendron:thamnobeatricea_sapling", BlockThamnobeatriceaSapling.block);
		OreDictionary.registerOre("itemSponge", BlockThamnobeatriceaSapling.block);
		OreDictionary.registerOre("pndietSponge", BlockThamnobeatriceaSapling.block);
	}


	public static final PropertyInteger STAGE = PropertyInteger.create("stage", 0, 1);
	protected static final AxisAlignedBB SAPLING_AABB = new AxisAlignedBB(0.09999999403953552D, 0.0D, 0.09999999403953552D, 0.8999999761581421D, 0.800000011920929D, 0.8999999761581421D);
	public static final PropertyInteger LEVEL = PropertyInteger.create("level", 0, 15);
	protected static final AxisAlignedBB BUSH_AABB = new AxisAlignedBB(0.30000001192092896D, 0.0D, 0.30000001192092896D, 0.699999988079071D, 0.6000000238418579D, 0.699999988079071D);

	public static class BlockCustom extends Block implements IPlantable, IAdvancementGranter {
		public BlockCustom() {
			super(Material.WATER);
			setSoundType(SoundType.PLANT);
			setCreativeTab(TabLepidodendronStatic.tab);
			setHardness(0F);
			setResistance(0F);
			setLightOpacity(3);
			setTranslationKey("pf_thamnobeatricea_sapling");
			this.setTickRandomly(true);
			setDefaultState(this.blockState.getBaseState().withProperty(LEVEL, 0).withProperty(STAGE, Integer.valueOf(0)));
		}

		@Nullable
		@Override
		public CustomTrigger getModTrigger() {
			return ModTriggers.CLICK_THAMNOBEATRICEA;
		}

		@Override
		public AxisAlignedBB getBoundingBox(IBlockState state, IBlockAccess source, BlockPos pos)
		{
			return SAPLING_AABB;
		}

		@Override
		public boolean doesSideBlockRendering(IBlockState state, IBlockAccess world, BlockPos pos, EnumFacing face) {
			return false;
		}

		@Override
		public void neighborChanged(IBlockState state, World worldIn, BlockPos pos, Block blockIn, BlockPos fromPos) {
			super.neighborChanged(state, worldIn, pos, blockIn, fromPos);
			updateTick(worldIn, pos, state, new Random());
		}

		@Override
		public void updateTick(World worldIn, BlockPos pos, IBlockState state, Random rand)
		{
			if (!worldIn.isRemote)
			{
				super.updateTick(worldIn, pos, state, rand);

				if (!canPlaceBlockAt(worldIn, pos)) {
					worldIn.destroyBlock(pos, true);
					return;
				}

				//if (!worldIn.isAreaLoaded(pos, 1)) return; // Forge: prevent loading unloaded chunks when checking neighbor's light
				if (rand.nextInt(7) == 0)
				{
					this.grow(worldIn, rand, pos, state);
				}
			}
		}

		protected BlockStateContainer createBlockState()
		{
			return new BlockStateContainer(this, new IProperty[] {LEVEL, STAGE});
		}

		@Override
		public boolean canPlaceBlockAt(World worldIn, BlockPos pos)
		{
			if ((isWaterBlock(worldIn, pos)) && (isWaterBlock(worldIn, pos.up()))
					&& worldIn.getBlockState(pos.down()).getBlockFaceShape(worldIn, pos.down(), EnumFacing.UP) == BlockFaceShape.SOLID) {
				return true;
			}
			return false;
		}

		@Override
		public boolean canPlaceBlockOnSide(World worldIn, BlockPos pos, EnumFacing side)
		{
			return (canPlaceBlockAt(worldIn, pos));
		}

		public boolean isWaterBlock(World world, BlockPos pos) {
			if (world.getBlockState(pos).getMaterial() == Material.WATER) {
				return true;
			}
			return false;
		}

		public void grow(World world, Random rand, BlockPos pos, IBlockState state)
		{
			if (((Integer)state.getValue(STAGE)).intValue() == 0)
			{
				world.setBlockState(pos, state.cycleProperty(STAGE), 4);
			}
			else
			{
				int x = pos.getX();
				int y = pos.getY();
				int z = pos.getZ();
				{
					Object2ObjectOpenHashMap <String, Object> $_dependencies = new Object2ObjectOpenHashMap<>();
					$_dependencies.put("x", x);
					$_dependencies.put("y", y);
					$_dependencies.put("z", z);
					$_dependencies.put("world", world);
					ProcedureWorldGenThamnobeatricea.executeProcedure($_dependencies);
				}
			}
		}

		@Override
		public void getDrops(NonNullList<ItemStack> drops, IBlockAccess world, BlockPos pos, IBlockState state, int fortune) {
			drops.add(new ItemStack(this));
		}

		@Override
		public ItemStack getPickBlock(IBlockState state, RayTraceResult target, World world, BlockPos pos, EntityPlayer player) {
			return new ItemStack(Item.getItemFromBlock(this), 1, this.damageDropped(state));
		}

		public boolean canGrow(World worldIn, BlockPos pos, IBlockState state, boolean isClient)
		{
			return true;
		}

		public boolean canUseBonemeal(World worldIn, Random rand, BlockPos pos, IBlockState state)
		{
			return false;
		}

		public IBlockState getStateFromMeta(int meta)
		{
			return this.getDefaultState().withProperty(STAGE, Integer.valueOf(meta));
		}

		public int getMetaFromState(IBlockState state)
		{
			int i = 0;
			i = i | ((Integer)state.getValue(STAGE)).intValue();
			return i;
		}

		@SideOnly(Side.CLIENT)
		@Override
		public void addInformation(ItemStack stack, World player, List<String> tooltip, ITooltipFlag advanced) {
			if (LepidodendronConfig.showTooltips) {
				tooltip.add("Type: Marine Sponge");
				tooltip.add("Periods: Ordovician");
				tooltip.add("Propagation: n/a");
			}
			super.addInformation(stack, player, tooltip, advanced);
		}

		@Nullable
		public AxisAlignedBB getCollisionBoundingBox(IBlockState blockState, IBlockAccess worldIn, BlockPos pos)
		{
			return NULL_AABB;
		}

		public boolean isOpaqueCube(IBlockState state)
		{
			return false;
		}

		public boolean isFullCube(IBlockState state)
		{
			return false;
		}

		@Override
		public EnumPlantType getPlantType(IBlockAccess world, BlockPos pos) {
			return null;
		}

		@Override
		public IBlockState getPlant(IBlockAccess world, BlockPos pos) {
			return null;
		}
	}
}
