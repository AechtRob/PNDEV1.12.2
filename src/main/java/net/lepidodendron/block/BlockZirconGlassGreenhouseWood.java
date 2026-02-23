
package net.lepidodendron.block;

import net.lepidodendron.ElementsLepidodendronMod;
import net.lepidodendron.LepidodendronConfig;
import net.lepidodendron.LepidodendronSorter;
import net.lepidodendron.creativetab.TabLepidodendronBuilding;
import net.minecraft.block.Block;
import net.minecraft.block.BlockGlass;
import net.minecraft.block.BlockLiquid;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.properties.PropertyBool;
import net.minecraft.block.state.BlockStateContainer;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.util.BlockRenderLayer;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fluids.BlockFluidBase;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@ElementsLepidodendronMod.ModElement.Tag
public class BlockZirconGlassGreenhouseWood extends ElementsLepidodendronMod.ModElement {
	@GameRegistry.ObjectHolder("lepidodendron:zircon_glass_greenhouse_wood")
	public static final Block block = null;
	public BlockZirconGlassGreenhouseWood(ElementsLepidodendronMod instance) {
		super(instance, LepidodendronSorter.zircon_glass);
	}

	@Override
	public void initElements() {
		elements.blocks.add(() -> new BlockCustom().setRegistryName("zircon_glass_greenhouse_wood"));
		elements.items.add(() -> new ItemBlock(block).setRegistryName(block.getRegistryName()));
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(block), 0,
				new ModelResourceLocation("lepidodendron:zircon_glass_greenhouse_wood", "inventory"));
	}

	public static final PropertyBool NORTH = PropertyBool.create("north");
	public static final PropertyBool EAST = PropertyBool.create("east");
	public static final PropertyBool SOUTH = PropertyBool.create("south");
	public static final PropertyBool WEST = PropertyBool.create("west");
	public static final PropertyBool UP = PropertyBool.create("up");
	public static final PropertyBool DOWN = PropertyBool.create("down");

	public static final PropertyBool WATERNORTH = PropertyBool.create("waternorth");
	public static final PropertyBool WATEREAST = PropertyBool.create("watereast");
	public static final PropertyBool WATERSOUTH = PropertyBool.create("watersouth");
	public static final PropertyBool WATERWEST = PropertyBool.create("waterwest");
	public static final PropertyBool WATERUP = PropertyBool.create("waterup");
	public static final PropertyBool WATERDOWN = PropertyBool.create("waterdown");

	public static class BlockCustom extends BlockGlass {
		public BlockCustom() {
			super(Material.GLASS, false);
			setSoundType(SoundType.GLASS);
			setHardness(1.5F);
			setTranslationKey("pf_zircon_glass_greenhouse_wood");
			setCreativeTab(TabLepidodendronBuilding.tab);
		}

		@Override
		public IBlockState getActualState(IBlockState state, IBlockAccess worldIn, BlockPos pos)
		{
			Block block = worldIn.getBlockState(pos.down()).getBlock();
			Block block1 = worldIn.getBlockState(pos.up()).getBlock();
			Block block2 = worldIn.getBlockState(pos.north()).getBlock();
			Block block3 = worldIn.getBlockState(pos.east()).getBlock();
			Block block4 = worldIn.getBlockState(pos.south()).getBlock();
			Block block5 = worldIn.getBlockState(pos.west()).getBlock();

			boolean waterdown = (worldIn.getBlockState(pos.down()).getMaterial() == Material.WATER && !(block instanceof BlockLiquid) && !(block instanceof BlockFluidBase));
			boolean waterup = (worldIn.getBlockState(pos.up()).getMaterial() == Material.WATER && !(block1 instanceof BlockLiquid) && !(block1 instanceof BlockFluidBase));
			boolean waternorth = (worldIn.getBlockState(pos.north()).getMaterial() == Material.WATER && !(block2 instanceof BlockLiquid) && !(block2 instanceof BlockFluidBase));
			boolean watereast = (worldIn.getBlockState(pos.east()).getMaterial() == Material.WATER && !(block3 instanceof BlockLiquid) && !(block3 instanceof BlockFluidBase));
			boolean watersouth = (worldIn.getBlockState(pos.south()).getMaterial() == Material.WATER && !(block4 instanceof BlockLiquid) && !(block4 instanceof BlockFluidBase));
			boolean waterwest = (worldIn.getBlockState(pos.west()).getMaterial() == Material.WATER && !(block5 instanceof BlockLiquid) && !(block5 instanceof BlockFluidBase));

			return state.withProperty(DOWN, Boolean.valueOf(block == this)).withProperty(UP, Boolean.valueOf(block1 == this)).withProperty(NORTH, Boolean.valueOf(block2 == this)).withProperty(EAST, Boolean.valueOf(block3 == this)).withProperty(SOUTH, Boolean.valueOf(block4 == this)).withProperty(WEST, Boolean.valueOf(block5 == this))
				.withProperty(WATERDOWN, waterdown && LepidodendronConfig.fixZirconGlass).withProperty(WATERUP, waterup && LepidodendronConfig.fixZirconGlass).withProperty(WATERNORTH, waternorth && LepidodendronConfig.fixZirconGlass).withProperty(WATEREAST, watereast && LepidodendronConfig.fixZirconGlass).withProperty(WATERSOUTH, watersouth && LepidodendronConfig.fixZirconGlass).withProperty(WATERWEST, waterwest && LepidodendronConfig.fixZirconGlass);
		}

		@Override
		public boolean canRenderInLayer(IBlockState state, BlockRenderLayer layer) {
			return layer == BlockRenderLayer.TRANSLUCENT;
		}

		@Override
		public int getMetaFromState(IBlockState state)
		{
			return 0;
		}

		protected BlockStateContainer createBlockState()
		{
			return new BlockStateContainer(this, new IProperty[] {
					NORTH, EAST, SOUTH, WEST, UP, DOWN,
					WATERNORTH, WATEREAST, WATERSOUTH, WATERWEST, WATERUP, WATERDOWN

			});
		}

		@Override
		@SideOnly(Side.CLIENT)
		public boolean shouldSideBeRendered(IBlockState blockState, IBlockAccess blockAccess, BlockPos pos, EnumFacing side)
		{
			IBlockState iblockstate = blockAccess.getBlockState(pos.offset(side));
			Block block = iblockstate.getBlock();


			if (blockState != iblockstate)
			{
				return true;
			}

			if (block == this)
			{
				return false;
			}

			return block == this ? false : super.shouldSideBeRendered(blockState, blockAccess, pos, side);
		}

		@Override
		public boolean doesSideBlockRendering(IBlockState state, IBlockAccess world, BlockPos pos, EnumFacing face) {
			return world.getBlockState(pos.offset(face)).getBlock() == this;
		}
	}
}
