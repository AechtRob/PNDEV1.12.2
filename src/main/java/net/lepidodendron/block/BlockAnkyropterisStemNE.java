
package net.lepidodendron.block;

import net.lepidodendron.ElementsLepidodendronMod;
import net.lepidodendron.LepidodendronSorter;
import net.lepidodendron.creativetab.TabLepidodendronPlants;
import net.minecraft.block.Block;
import net.minecraft.block.BlockDirectional;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.properties.PropertyDirection;
import net.minecraft.block.state.BlockFaceShape;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraft.util.*;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import java.util.List;

@ElementsLepidodendronMod.ModElement.Tag
public class BlockAnkyropterisStemNE extends ElementsLepidodendronMod.ModElement {
	@GameRegistry.ObjectHolder("lepidodendron:ankyropteris_stem_ne")
	public static final Block block = null;
	public BlockAnkyropterisStemNE(ElementsLepidodendronMod instance) {
		super(instance, LepidodendronSorter.ankyropteris_stem_ne);
	}

	@Override
	public void initElements() {
		elements.blocks.add(() -> new BlockCustom().setRegistryName("ankyropteris_stem_ne"));
		elements.items.add(() -> new ItemBlock(block).setRegistryName(block.getRegistryName()));
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(block), 0,
				new ModelResourceLocation("lepidodendron:ankyropteris_stem_ne", "inventory"));
	}
	public static class BlockCustom extends Block {
	
		public static final PropertyDirection FACING = BlockDirectional.FACING;

		public BlockCustom() {
			super(Material.WOOD);
			setTranslationKey("pf_ankyropteris_stem_ne");
			setSoundType(SoundType.WOOD);
			setHardness(1F);
			setResistance(10F);
			setLightLevel(0F);
			setLightOpacity(0);
			setCreativeTab(TabLepidodendronPlants.tab);
			this.setDefaultState(this.blockState.getBaseState().withProperty(FACING, EnumFacing.NORTH));
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

		@Override public boolean isWood(net.minecraft.world.IBlockAccess world, BlockPos pos){ 
				return true;
			}

		@Override
		public BlockFaceShape getBlockFaceShape(IBlockAccess world, IBlockState state, BlockPos pos, EnumFacing face) {
			return BlockFaceShape.UNDEFINED;
		}

		@Override
		protected net.minecraft.block.state.BlockStateContainer createBlockState() {
			return new net.minecraft.block.state.BlockStateContainer(this, new IProperty[]{FACING});
		}

		@Override
		public IBlockState withRotation(IBlockState state, Rotation rot) {
			return state.withProperty(FACING, rot.rotate((EnumFacing) state.getValue(FACING)));
		}

		@Override
		public IBlockState withMirror(IBlockState state, Mirror mirrorIn) {
			return state.withRotation(mirrorIn.toRotation((EnumFacing) state.getValue(FACING)));
		}

		@Override
		public IBlockState getStateFromMeta(int meta) {
			return this.getDefaultState().withProperty(FACING, EnumFacing.byIndex(meta));
		}

		@Override
		public int getMetaFromState(IBlockState state) {
			return ((EnumFacing) state.getValue(FACING)).getIndex();
		}

		@Override
		public IBlockState getStateForPlacement(World worldIn, BlockPos pos, EnumFacing facing, float hitX, float hitY, float hitZ, int meta, EntityLivingBase placer)
	    {
	        if (canPlaceAt(worldIn, pos, facing))
	        {
	            return this.getDefaultState().withProperty(FACING, facing);
	        }
	        else
	        {
	            for (EnumFacing enumfacing : EnumFacing.Plane.HORIZONTAL)
	            {
	                if (canPlaceAt(worldIn, pos, enumfacing))
	                {
	                    return this.getDefaultState().withProperty(FACING, enumfacing);
	                }
	            }
	
	            return this.getDefaultState();
	        }
	    }
	    
	    @Override
		public boolean canPlaceBlockAt(World worldIn, BlockPos pos)
	    {
	        for (EnumFacing enumfacing : FACING.getAllowedValues())
	        {
	            if (canPlaceAt(worldIn, pos, enumfacing))
	            {
	                return true;
	            }
	        }
	        return false;
	    }

    	public static boolean canPlaceAt(World worldIn, BlockPos pos, EnumFacing facing)
	    {
	        BlockPos blockpos = pos.offset(facing.getOpposite());
	        IBlockState iblockstate = worldIn.getBlockState(blockpos);
	        Block block = iblockstate.getBlock();
	        BlockFaceShape blockfaceshape = iblockstate.getBlockFaceShape(worldIn, blockpos, facing);
	
	        if (facing.equals(EnumFacing.UP) || facing.equals(EnumFacing.DOWN))
	        {
	            return false;
	        }
	        else if (facing != EnumFacing.UP && facing != EnumFacing.DOWN)
	        {
	            return !isExceptBlockForAttachWithPiston(block) && blockfaceshape == BlockFaceShape.SOLID;
	        }
	        else
	        {
	            return false;
	        }
	    }

		//Right click with an empty hand to rotate the block:
		public boolean onBlockActivated(World world, BlockPos pos, IBlockState state, EntityPlayer player, EnumHand hand, EnumFacing facing, float hitX, float hitY, float hitZ)
	    {
        if ((!player.capabilities.allowEdit) || (!player.getHeldItemMainhand().isEmpty()))
	        {
	            return super.onBlockActivated(world, pos, state, player, hand, facing, hitX, hitY, hitZ);
	        }
	        else {
	        	if (!((hand != player.getActiveHand()) && (hand == EnumHand.MAIN_HAND))) {
					world.setBlockState(pos, BlockAnkyropterisStemSE.block.getDefaultState().withProperty(FACING, world.getBlockState(pos).getValue(FACING)), 3);
					
					world.playSound((EntityPlayer) null, pos.getX(), pos.getY(), pos.getZ(),
						(net.minecraft.util.SoundEvent) net.minecraft.util.SoundEvent.REGISTRY.getObject(new ResourceLocation("block.wood.place")),
						SoundCategory.NEUTRAL, (float) 1, (float) 1);

				}
	        	return true;
	        }
	    }

		@Override
		public AxisAlignedBB getBoundingBox(IBlockState state, IBlockAccess source, BlockPos pos) {
			switch ((EnumFacing) state.getValue(BlockDirectional.FACING)) {
				case SOUTH :
				default :
					return new AxisAlignedBB(0.0D, 0.0D, 0.0D, 1.0D, 1.0D, 0.1D);
					
				case NORTH :
					return new AxisAlignedBB(0.0D, 0.0D, 0.9D, 1.0D, 1.0D, 1.0D);
					
				case WEST :
					return new AxisAlignedBB(0.9D, 0.0D, 0.0D, 1.0D, 1.0D, 1.0D);
					
				case EAST :
					return new AxisAlignedBB(0.0D, 0.0D, 0.0D, 0.1D, 1.0D, 1.0D);
					
				case UP :
					return new AxisAlignedBB(0.0D, 0D, 0.0D, 1.0D, 0.1D, 1.0D);
					
				case DOWN :
					return new AxisAlignedBB(0.0D, 1D, 0.0D, 1.0D, 0.9D, 1.0D);
			}
		}   

	    @SideOnly(Side.CLIENT)
		@Override
	    public void addInformation(ItemStack stack, World player, List<String> tooltip, ITooltipFlag advanced) {
	        tooltip.add("Right-click with an empty hand to rotate");
	        super.addInformation(stack, player, tooltip, advanced);
	    }

	    @Override public boolean isLadder(IBlockState state, IBlockAccess world, BlockPos pos, EntityLivingBase entity) { return true; }
	}
}
