
package net.lepidodendron.block;

import net.lepidodendron.ElementsLepidodendronMod;
import net.lepidodendron.LepidodendronConfig;
import net.lepidodendron.LepidodendronSorter;
import net.lepidodendron.util.CustomTrigger;
import net.lepidodendron.util.ModTriggers;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.PropertyInteger;
import net.minecraft.block.state.BlockFaceShape;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.client.renderer.block.statemap.StateMap;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.oredict.OreDictionary;

import javax.annotation.Nullable;
import java.util.List;
import java.util.Random;

@ElementsLepidodendronMod.ModElement.Tag
public class BlockBivalveShikamaia extends ElementsLepidodendronMod.ModElement {
	@GameRegistry.ObjectHolder("lepidodendron:bivalve_shikamaia")
	public static final Block block = null;
	public BlockBivalveShikamaia(ElementsLepidodendronMod instance) {
		super(instance, LepidodendronSorter.bivalve_shikamaia);
	}

	@Override
	public void initElements() {
		elements.blocks.add(() -> new BlockCustom().setRegistryName("bivalve_shikamaia"));
		elements.items.add(() -> new ItemBlock(block).setRegistryName(block.getRegistryName()));
	}

	public static final PropertyInteger LEVEL = PropertyInteger.create("level", 0, 15);

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(block), 0,
				new ModelResourceLocation("lepidodendron:bivalve_shikamaia", "inventory"));
		ModelLoader.setCustomStateMapper(block, (new StateMap.Builder()).ignore(BlockBivalveShikamaia.LEVEL).build());
	}

	@Override
	public void init(FMLInitializationEvent event) {
		super.init(event);
		OreDictionary.registerOre("staticdnaPNlepidodendron:bivalve_shikamaia", BlockBivalveShikamaia.block);
		OreDictionary.registerOre("itemShellfish", BlockBivalveShikamaia.block);
		OreDictionary.registerOre("pnfurnaceSeafood", BlockBivalveShikamaia.block);
		OreDictionary.registerOre("pndietShellfish", BlockBivalveShikamaia.block);
	}

	public static class BlockCustom extends BlockBivalve  {

		public BlockCustom() {
			super();
			setTranslationKey("pf_bivalve_shikamaia");
		}

		@Override
		@Nullable
		public AxisAlignedBB getCollisionBoundingBox(IBlockState blockState, IBlockAccess worldIn, BlockPos pos) {
			return NULL_AABB;
		}

		@Nullable
		@Override
		public CustomTrigger getModTrigger() {
			return ModTriggers.CLICK_BIVALVE_SHIKAMAIA;
		}

		@Override
		public AxisAlignedBB getBoundingBox(IBlockState state, IBlockAccess source, BlockPos pos) {
			return new AxisAlignedBB(0.0D, 0D, 0D, 1.0D, 1.0D, 1.0D);
		}

		@SideOnly(Side.CLIENT)
		@Override
		public void addInformation(ItemStack stack, World player, List<String> tooltip, ITooltipFlag advanced) {
			if (LepidodendronConfig.showTooltips) {
				tooltip.add("Type: Marine bivalve");
				tooltip.add("Periods: Permian");}
			super.addInformation(stack, player, tooltip, advanced);
		}

		@Override
		public void neighborChanged(IBlockState state, World world, BlockPos pos, Block neighborBlock, BlockPos fromPos) {
			super.neighborChanged(state, world, pos, neighborBlock, fromPos);
			world.scheduleUpdate(pos, this, 1);
		}

		@Override
		public void updateTick(World worldIn, BlockPos pos, IBlockState state, Random rand) {
			if (!canPlaceBlockAt(worldIn, pos)) {
				worldIn.setBlockToAir(pos);
			}
		}

		@Override
		public boolean isFullCube(IBlockState state)
		{
			return false;
		}

		public boolean canPlaceBlockAt(World worldIn, BlockPos pos) {
			if ((isWaterBlock(worldIn, pos)) && (isWaterBlock(worldIn, pos.up()))
					&& (worldIn.getBlockState(pos.down()).getBlockFaceShape(worldIn, pos.down(), EnumFacing.UP) == BlockFaceShape.SOLID)) {
				return super.canPlaceBlockAt(worldIn, pos);
			}

			return false;

		}


		public boolean isWaterBlock(World world, BlockPos pos) {
			if (world.getBlockState(pos).getMaterial() == Material.WATER) {
				//IBlockState iblockstate = world.getBlockState(pos);
				//if (((Integer)iblockstate.getValue(BlockLiquid.LEVEL)).intValue() == 0) {
				return true;
				//}
			}
			return false;
		}

		@Override
		public IBlockState getStateForPlacement(World worldIn, BlockPos pos, EnumFacing facing, float hitX, float hitY, float hitZ, int meta,
												EntityLivingBase placer) {
			if (isWaterBlock(worldIn, pos.north(1)) && isWaterBlock(worldIn, pos.south(1)) && isWaterBlock(worldIn, pos.west(1)) && isWaterBlock(worldIn, pos.east(1))
			) {
				return this.getDefaultState().withProperty(FACING, placer.getHorizontalFacing().getOpposite());
			}
			return this.getDefaultState().withProperty(FACING, placer.getHorizontalFacing().getOpposite());
		}
	}
}
