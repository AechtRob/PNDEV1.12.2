
package net.lepidodendron.block;

import net.lepidodendron.ElementsLepidodendronMod;
import net.lepidodendron.LepidodendronSorter;
import net.lepidodendron.creativetab.TabLepidodendronPlants;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.BlockFaceShape;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.util.BlockRenderLayer;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@ElementsLepidodendronMod.ModElement.Tag
public class BlockOmphalophloiosBase extends ElementsLepidodendronMod.ModElement {
	@GameRegistry.ObjectHolder("lepidodendron:omphalophloios_base")
	public static final Block block = null;
	public BlockOmphalophloiosBase(ElementsLepidodendronMod instance) {
		super(instance, LepidodendronSorter.omphalophloios_base);
	}

	@Override
	public void initElements() {
		elements.blocks.add(() -> new BlockCustom().setRegistryName("omphalophloios_base"));
		elements.items.add(() -> new ItemBlock(block).setRegistryName(block.getRegistryName()));
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(block), 0, new ModelResourceLocation("lepidodendron:pleuromeia_stem", "inventory"));

	}

	public static class BlockCustom extends Block {

    	public BlockCustom() {
			super(Material.WOOD);
			setTranslationKey("pf_omphalophloios_base");
			setSoundType(SoundType.WOOD);
			setHardness(1F);
			setResistance(10F);
			setLightLevel(0F);
			setLightOpacity(0);
			setCreativeTab(TabLepidodendronPlants.tab);
		}

	   @SideOnly(Side.CLIENT)
		@Override
    public BlockRenderLayer getRenderLayer()
    {
        return BlockRenderLayer.CUTOUT;
    }
		
		@Override
		public boolean canRenderInLayer(IBlockState state, BlockRenderLayer layer) {
			return layer == BlockRenderLayer.CUTOUT_MIPPED;
		}

		@Override
		public boolean isOpaqueCube(IBlockState state) {
			return false;
		}

		public boolean isFullCube(IBlockState state)
	    {
	        return false;
	    }

		@Override
		public boolean canSustainLeaves(IBlockState state, IBlockAccess world, BlockPos pos) {
			return true;
		}

		@Override
		public boolean canPlaceTorchOnTop(IBlockState state, IBlockAccess world, BlockPos pos)
	    {
	        return true;
	    }

		@Override public boolean isWood(net.minecraft.world.IBlockAccess world, BlockPos pos){ 
				return true;
			}

		@Override
		public void breakBlock(World worldIn, BlockPos pos, IBlockState state)
	    {
	        int i = 4;
	        int j = 5;
	
	        if (worldIn.isAreaLoaded(pos.add(-5, -5, -5), pos.add(5, 5, 5)))
	        {
	            for (BlockPos blockpos : BlockPos.getAllInBox(pos.add(-4, -4, -4), pos.add(4, 4, 4)))
	            {
	                IBlockState iblockstate = worldIn.getBlockState(blockpos);
	
	                if (iblockstate.getBlock().isLeaves(iblockstate, worldIn, blockpos))
	                {
	                    iblockstate.getBlock().beginLeavesDecay(iblockstate, worldIn, blockpos);
	                }
	            }
	        }
	    }
	    
 		@Override
		public void neighborChanged(IBlockState state, World world, BlockPos pos, Block neighborBlock, BlockPos fromPos) {
			super.neighborChanged(state, world, pos, neighborBlock, fromPos);
			
			if (world.isAirBlock(pos.down()) && fromPos.getY() == pos.getY()-1) {
				world.destroyBlock(pos, true);
			}
				
		}
		
		@Override
		public BlockFaceShape getBlockFaceShape(IBlockAccess world, IBlockState state, BlockPos pos, EnumFacing face) {
			if (face == EnumFacing.UP) {
				return BlockFaceShape.MIDDLE_POLE_THICK;
			}
			return BlockFaceShape.UNDEFINED;
		}
		
	}	

}
