
package net.lepidodendron.block;

import net.lepidodendron.ElementsLepidodendronMod;
import net.lepidodendron.LepidodendronSorter;
import net.lepidodendron.creativetab.TabLepidodendronMisc;
import net.minecraft.block.Block;
import net.minecraft.block.BlockDirectional;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.properties.PropertyBool;
import net.minecraft.block.properties.PropertyDirection;
import net.minecraft.block.state.BlockFaceShape;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
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

import javax.annotation.Nullable;
import java.util.List;
import java.util.Random;

@ElementsLepidodendronMod.ModElement.Tag
public class BlockPsaroniusThatch extends ElementsLepidodendronMod.ModElement {
	@GameRegistry.ObjectHolder("lepidodendron:psaronius_thatch")
	public static final Block block = null;
	public BlockPsaroniusThatch(ElementsLepidodendronMod instance) {
		super(instance, LepidodendronSorter.psaronius_thatch);
	}

	@Override
	public void initElements() {
		elements.blocks.add(() -> new BlockCustom().setRegistryName("psaronius_thatch"));
		elements.items.add(() -> new ItemBlock(block).setRegistryName(block.getRegistryName()));
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(block), 0,
				new ModelResourceLocation("lepidodendron:psaronius_thatch", "inventory"));
	}
	public static class BlockCustom extends Block {
		public static final PropertyDirection FACING = BlockDirectional.FACING;
		public static final PropertyBool INNER = PropertyBool.create("inner");
		public static final PropertyBool OUTER = PropertyBool.create("outer");
		public static final PropertyBool SW = PropertyBool.create("sw");
		public static final PropertyBool SE = PropertyBool.create("se");
		public static final PropertyBool NW = PropertyBool.create("nw");
		public static final PropertyBool NE = PropertyBool.create("ne");

		public BlockCustom() {
			super(Material.LEAVES);
			setTranslationKey("pf_psaronius_thatch");
			setSoundType(SoundType.PLANT);
			setHardness(0.5F);
			setResistance(0.5F);
			setLightLevel(0F);
			setLightOpacity(1);
			setCreativeTab(TabLepidodendronMisc.tab);
			this.setDefaultState(this.blockState.getBaseState().withProperty(FACING, EnumFacing.UP).withProperty(INNER, false).withProperty(OUTER, false).withProperty(SW, false).withProperty(SE, false).withProperty(NW, false).withProperty(NE, false));

		}

		@Override
		public IBlockState getActualState(IBlockState state, IBlockAccess worldIn, BlockPos pos){

			if (worldIn.getBlockState(pos).getBlock() != this) {
				return state;
			}
			
			boolean propinner = false;
			boolean propouter = false;
			boolean propsw = false;
			boolean propse = false;
			boolean propnw = false;
			boolean propne = false;
			boolean propfound = false;

	        Block blockn = worldIn.getBlockState(pos.north()).getBlock();
	        Block blocke = worldIn.getBlockState(pos.east()).getBlock();
	        Block blocks = worldIn.getBlockState(pos.south()).getBlock();
	        Block blockw = worldIn.getBlockState(pos.west()).getBlock();

			IBlockState blockStaten = worldIn.getBlockState(pos.north());
			IBlockState blockStatee = worldIn.getBlockState(pos.east());
			IBlockState blockStates = worldIn.getBlockState(pos.south());
			IBlockState blockStatew = worldIn.getBlockState(pos.west());

			if (blocks == this && !propfound) {
				//test orientations:
				if ((blockStates.getValue(FACING) == EnumFacing.WEST)
						&& (state.getValue(FACING) == EnumFacing.NORTH))
 				{
					propouter = true;
					propnw = true;
					propfound = true;
				}
			}
			if (blocke == this && !propfound) {
				//test orientations:
				if ((blockStatee.getValue(FACING) == EnumFacing.NORTH)
 						&& (state.getValue(FACING) == EnumFacing.WEST))
 				{
					propouter = true;
					propnw = true;
					propfound = true;
				}
			}

			if (blocks == this && !propfound) {
				//test orientations:
				if ((blockStates.getValue(FACING) == EnumFacing.EAST)
						&& (state.getValue(FACING) == EnumFacing.NORTH))
				{
					propouter = true;
					propne = true;
					propfound = true;
				}
			}
			if (blockw == this && !propfound) {
				//test orientations:
				if ((blockStatew.getValue(FACING) == EnumFacing.NORTH)
 						&& (state.getValue(FACING) == EnumFacing.EAST))
				{
					propouter = true;
					propne = true;
					propfound = true;
				}
			}

			if ( blockn == this && !propfound) {
				//test orientations:
				if ((blockStaten.getValue(FACING) == EnumFacing.WEST)
						&& (state.getValue(FACING) == EnumFacing.SOUTH))
 				{
					propouter = true;
					propsw = true;
					propfound = true;
				}
			}
			if (blocke == this && !propfound) {
				//test orientations:
				if ((blockStatee.getValue(FACING) == EnumFacing.SOUTH)
 						&& (state.getValue(FACING) == EnumFacing.WEST))
 				{
					propouter = true;
					propsw = true;
					propfound = true;
				}
			}

			if (blockn == this && !propfound) {
				//test orientations:
				if ((blockStaten.getValue(FACING) == EnumFacing.EAST)
						&& (state.getValue(FACING) == EnumFacing.SOUTH))
 				{
					propouter = true;
					propse = true;
					propfound = true;
				}
			}
			if (blockw == this && !propfound) {
				//test orientations:
				if ((blockStatew.getValue(FACING) == EnumFacing.SOUTH)
 						&& (state.getValue(FACING) == EnumFacing.EAST))
 				{
					propouter = true;
					propse = true;
					propfound = true;
				}
			}
			

			//Inner corners:
			if (blockn == this && !propfound) {
				//test orientations:
				if ((blockStaten.getValue(FACING) == EnumFacing.WEST)
 						&& (state.getValue(FACING) == EnumFacing.NORTH))
 				{
					propinner = true;
					propnw = true;
					propfound = true;
				}
			}
			if (blockw == this && !propfound) {
				//test orientations:
				if ((blockStatew.getValue(FACING) == EnumFacing.NORTH)
 						&& (state.getValue(FACING) == EnumFacing.WEST))
 				{
					propinner = true;
					propnw = true;
					propfound = true;
				}
			}

			if (blockn == this && !propfound) {
				//test orientations:
				if ((blockStaten.getValue(FACING) == EnumFacing.EAST)
 						&& (state.getValue(FACING) == EnumFacing.NORTH))
 				{
					propinner = true;
					propne = true;
					propfound = true;
				}
			}
			if (blocke == this && !propfound) {
				//test orientations:
				if ((blockStatee.getValue(FACING) == EnumFacing.NORTH)
 						&& (state.getValue(FACING) == EnumFacing.EAST))
 				{
					propinner = true;
					propne = true;
					propfound = true;
				}
			}

			if (blocks == this && !propfound) {
				//test orientations:
				if ((blockStates.getValue(FACING) == EnumFacing.WEST)
 						&& (state.getValue(FACING) == EnumFacing.SOUTH))
 				{
					propinner = true;
					propsw = true;
					propfound = true;
				}
			}
			if (blockw == this && !propfound) {
				//test orientations:
				if ((blockStatew.getValue(FACING) == EnumFacing.SOUTH)
 						&& (state.getValue(FACING) == EnumFacing.WEST))
 				{
					propinner = true;
					propsw = true;
					propfound = true;
				}
			}

			if (blocks == this && !propfound) {
				//test orientations:
				if ((blockStates.getValue(FACING) == EnumFacing.EAST)
 						&& (state.getValue(FACING) == EnumFacing.SOUTH))
 				{
					propinner = true;
					propse = true;
					propfound = true;
				}
			}
			if (blocke == this && !propfound) {
				//test orientations:
				if ((blockStatee.getValue(FACING) == EnumFacing.SOUTH)
 						&& (state.getValue(FACING) == EnumFacing.EAST))
 				{
					propinner = true;
					propse = true;
					propfound = true;
				}
			}


			return state.withProperty(INNER, propinner).withProperty(OUTER, propouter).withProperty(SW, propsw).withProperty(SE, propse).withProperty(NW, propnw).withProperty(NE, propne);
		}

		@Override
		protected net.minecraft.block.state.BlockStateContainer createBlockState() {
			return new net.minecraft.block.state.BlockStateContainer(this, new IProperty[]{FACING, INNER, OUTER, SW, SE, NW, NE});
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
		public IBlockState getStateForPlacement(World worldIn, BlockPos pos, EnumFacing facing, float hitX, float hitY, float hitZ, int meta,
				EntityLivingBase placer) {
			return this.getDefaultState().withProperty(FACING, EnumFacing.getDirectionFromEntityLiving(pos, placer));
		}

		@Override
		public int getFlammability(IBlockAccess world, BlockPos pos, EnumFacing face) {
			return 60;
		}

		@Override
		public int getFireSpreadSpeed(IBlockAccess world, BlockPos pos, EnumFacing face) {
			return 30;
		}

		@Override
		public boolean doesSideBlockRendering(IBlockState state, IBlockAccess world, BlockPos pos, EnumFacing face) {
			return false;
		}

		@Override
		public boolean isOpaqueCube(IBlockState state) {
			return false;
		}

		@Override
		public boolean isFullBlock(IBlockState state) {
			return false;
		}
		
		@Override
		public boolean isFullCube(IBlockState state) {
			return false;
		}

		@Override
	    public BlockFaceShape getBlockFaceShape(IBlockAccess worldIn, IBlockState state, BlockPos pos, EnumFacing face)
	    {
	        if ((state.getValue(BlockDirectional.FACING) == EnumFacing.DOWN)
	        	&& (face ==  EnumFacing.UP)) {
	        		return BlockFaceShape.SOLID;
	        	}
	        if ((state.getValue(BlockDirectional.FACING) == EnumFacing.UP)
	        	&& (face ==  EnumFacing.DOWN)) {
	        		return BlockFaceShape.SOLID;
	        	}
	        return BlockFaceShape.UNDEFINED;
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

		protected static final AxisAlignedBB AABBDOWN = new AxisAlignedBB(0D, 0.9D, 0.0, 1D, 1.0D, 1D);
		protected static final AxisAlignedBB AABBUP = new AxisAlignedBB(0D, 0D, 0.0D, 1D, 0.1D, 1D);

 		protected static final AxisAlignedBB AABB0SOUTH = new AxisAlignedBB(0.0D, 0.0D, 0.0D, 1.0D, 0.1D, 0.1D);
 		protected static final AxisAlignedBB AABB1SOUTH = new AxisAlignedBB(0.0D, 0.1D, 0.1D, 1.0D, 0.2D, 0.2D);
 		protected static final AxisAlignedBB AABB2SOUTH = new AxisAlignedBB(0.0D, 0.2D, 0.2D, 1.0D, 0.3D, 0.3D);
 		protected static final AxisAlignedBB AABB3SOUTH = new AxisAlignedBB(0.0D, 0.3D, 0.3D, 1.0D, 0.4D, 0.4D);
 		protected static final AxisAlignedBB AABB4SOUTH = new AxisAlignedBB(0.0D, 0.4D, 0.4D, 1.0D, 0.5D, 0.5D);
 		protected static final AxisAlignedBB AABB5SOUTH = new AxisAlignedBB(0.0D, 0.5D, 0.5D, 1.0D, 0.6D, 0.6D);
 		protected static final AxisAlignedBB AABB6SOUTH = new AxisAlignedBB(0.0D, 0.6D, 0.6D, 1.0D, 0.7D, 0.7D);
 		protected static final AxisAlignedBB AABB7SOUTH = new AxisAlignedBB(0.0D, 0.7D, 0.7D, 1.0D, 0.8D, 0.8D);
 		protected static final AxisAlignedBB AABB8SOUTH = new AxisAlignedBB(0.0D, 0.8D, 0.8D, 1.0D, 0.9D, 0.9D);
 		protected static final AxisAlignedBB AABB9SOUTH = new AxisAlignedBB(0.0D, 0.9D, 0.9D, 1.0D, 1.0D, 1.0D);

		protected static final AxisAlignedBB AABB0NORTH = new AxisAlignedBB(0.0D, 0.0D, 1.0D, 1.0D, 0.1D, 0.9D);
 		protected static final AxisAlignedBB AABB1NORTH = new AxisAlignedBB(0.0D, 0.1D, 0.9D, 1.0D, 0.2D, 0.8D);
 		protected static final AxisAlignedBB AABB2NORTH = new AxisAlignedBB(0.0D, 0.2D, 0.8D, 1.0D, 0.3D, 0.7D);
 		protected static final AxisAlignedBB AABB3NORTH = new AxisAlignedBB(0.0D, 0.3D, 0.7D, 1.0D, 0.4D, 0.6D);
 		protected static final AxisAlignedBB AABB4NORTH = new AxisAlignedBB(0.0D, 0.4D, 0.6D, 1.0D, 0.5D, 0.5D);
 		protected static final AxisAlignedBB AABB5NORTH = new AxisAlignedBB(0.0D, 0.5D, 0.5D, 1.0D, 0.6D, 0.4D);
 		protected static final AxisAlignedBB AABB6NORTH = new AxisAlignedBB(0.0D, 0.6D, 0.4D, 1.0D, 0.7D, 0.3D);
 		protected static final AxisAlignedBB AABB7NORTH = new AxisAlignedBB(0.0D, 0.7D, 0.3D, 1.0D, 0.8D, 0.2D);
 		protected static final AxisAlignedBB AABB8NORTH = new AxisAlignedBB(0.0D, 0.8D, 0.2D, 1.0D, 0.9D, 0.1D);
 		protected static final AxisAlignedBB AABB9NORTH = new AxisAlignedBB(0.0D, 0.9D, 0.1D, 1.0D, 1.0D, 0D);

		protected static final AxisAlignedBB AABB0EAST = new AxisAlignedBB(0.0D, 0.0D, 0.0D, 0.1D, 0.1D, 1.0D);
 		protected static final AxisAlignedBB AABB1EAST = new AxisAlignedBB(0.1D, 0.1D, 0.0D, 0.2D, 0.2D, 1.0D);
 		protected static final AxisAlignedBB AABB2EAST = new AxisAlignedBB(0.2D, 0.2D, 0.0D, 0.3D, 0.3D, 1.0D);
 		protected static final AxisAlignedBB AABB3EAST = new AxisAlignedBB(0.3D, 0.3D, 0.0D, 0.4D, 0.4D, 1.0D);
 		protected static final AxisAlignedBB AABB4EAST = new AxisAlignedBB(0.4D, 0.4D, 0.0D, 0.5D, 0.5D, 1.0D);
 		protected static final AxisAlignedBB AABB5EAST = new AxisAlignedBB(0.5D, 0.5D, 0.0D, 0.6D, 0.6D, 1.0D);
 		protected static final AxisAlignedBB AABB6EAST = new AxisAlignedBB(0.6D, 0.6D, 0.0D, 0.7D, 0.7D, 1.0D);
 		protected static final AxisAlignedBB AABB7EAST = new AxisAlignedBB(0.7D, 0.7D, 0.0D, 0.8D, 0.8D, 1.0D);
 		protected static final AxisAlignedBB AABB8EAST = new AxisAlignedBB(0.8D, 0.8D, 0.0D, 0.9D, 0.9D, 1.0D);
 		protected static final AxisAlignedBB AABB9EAST = new AxisAlignedBB(0.9D, 0.9D, 0.0D, 1.0D, 1.0D, 1.0D);

 		protected static final AxisAlignedBB AABB0WEST = new AxisAlignedBB(1.0D, 0.0D, 0.0D, 0.9D, 0.1D, 1.0D);
 		protected static final AxisAlignedBB AABB1WEST = new AxisAlignedBB(0.9D, 0.1D, 0.0D, 0.8D, 0.2D, 1.0D);
 		protected static final AxisAlignedBB AABB2WEST = new AxisAlignedBB(0.8D, 0.2D, 0.0D, 0.7D, 0.3D, 1.0D);
 		protected static final AxisAlignedBB AABB3WEST = new AxisAlignedBB(0.7D, 0.3D, 0.0D, 0.6D, 0.4D, 1.0D);
 		protected static final AxisAlignedBB AABB4WEST = new AxisAlignedBB(0.6D, 0.4D, 0.0D, 0.5D, 0.5D, 1.0D);
 		protected static final AxisAlignedBB AABB5WEST = new AxisAlignedBB(0.5D, 0.5D, 0.0D, 0.4D, 0.6D, 1.0D);
 		protected static final AxisAlignedBB AABB6WEST = new AxisAlignedBB(0.4D, 0.6D, 0.0D, 0.3D, 0.7D, 1.0D);
 		protected static final AxisAlignedBB AABB7WEST = new AxisAlignedBB(0.3D, 0.7D, 0.0D, 0.2D, 0.8D, 1.0D);
 		protected static final AxisAlignedBB AABB8WEST = new AxisAlignedBB(0.2D, 0.8D, 0.0D, 0.1D, 0.9D, 1.0D);
 		protected static final AxisAlignedBB AABB9WEST = new AxisAlignedBB(0.1D, 0.9D, 0.0D, 0.0D, 1.0D, 1.0D);

		protected static final AxisAlignedBB AABBCORNER = new AxisAlignedBB(0.0D, 0.0D, 0.0D, 1.0D, 1.0D, 1.0D);

		
		@Override
		public void addCollisionBoxToList(IBlockState state, World worldIn, BlockPos pos, AxisAlignedBB entityBox, List<AxisAlignedBB> collidingBoxes, @Nullable Entity entityIn, boolean isActualState)
	    {
	    	if (!isActualState)
	        {
	            state = this.getActualState(state, worldIn, pos);
	        }
	        if ((state.getValue(INNER)) || (state.getValue(OUTER)))
			{
				addCollisionBoxToList(pos, entityBox, collidingBoxes, AABBCORNER);
			}
	        else {
		    	if (state.getValue(BlockDirectional.FACING) == EnumFacing.NORTH) {
						addCollisionBoxToList(pos, entityBox, collidingBoxes, AABB0SOUTH);
				        addCollisionBoxToList(pos, entityBox, collidingBoxes, AABB1SOUTH);
				        addCollisionBoxToList(pos, entityBox, collidingBoxes, AABB2SOUTH);
				        addCollisionBoxToList(pos, entityBox, collidingBoxes, AABB3SOUTH);
				        addCollisionBoxToList(pos, entityBox, collidingBoxes, AABB4SOUTH);
				        addCollisionBoxToList(pos, entityBox, collidingBoxes, AABB5SOUTH);
				        addCollisionBoxToList(pos, entityBox, collidingBoxes, AABB6SOUTH);
				        addCollisionBoxToList(pos, entityBox, collidingBoxes, AABB7SOUTH);
				        addCollisionBoxToList(pos, entityBox, collidingBoxes, AABB8SOUTH);
				        addCollisionBoxToList(pos, entityBox, collidingBoxes, AABB9SOUTH);
		    	}
				if (state.getValue(BlockDirectional.FACING) == EnumFacing.SOUTH) {
						addCollisionBoxToList(pos, entityBox, collidingBoxes, AABB0NORTH);
				        addCollisionBoxToList(pos, entityBox, collidingBoxes, AABB1NORTH);
				        addCollisionBoxToList(pos, entityBox, collidingBoxes, AABB2NORTH);
				        addCollisionBoxToList(pos, entityBox, collidingBoxes, AABB3NORTH);
				        addCollisionBoxToList(pos, entityBox, collidingBoxes, AABB4NORTH);
				        addCollisionBoxToList(pos, entityBox, collidingBoxes, AABB5NORTH);
				        addCollisionBoxToList(pos, entityBox, collidingBoxes, AABB6NORTH);
				        addCollisionBoxToList(pos, entityBox, collidingBoxes, AABB7NORTH);
				        addCollisionBoxToList(pos, entityBox, collidingBoxes, AABB8NORTH);
				        addCollisionBoxToList(pos, entityBox, collidingBoxes, AABB9NORTH);
				}
				if (state.getValue(BlockDirectional.FACING) == EnumFacing.EAST) {
						addCollisionBoxToList(pos, entityBox, collidingBoxes, AABB0WEST);
				        addCollisionBoxToList(pos, entityBox, collidingBoxes, AABB1WEST);
				        addCollisionBoxToList(pos, entityBox, collidingBoxes, AABB2WEST);
				        addCollisionBoxToList(pos, entityBox, collidingBoxes, AABB3WEST);
				        addCollisionBoxToList(pos, entityBox, collidingBoxes, AABB4WEST);
				        addCollisionBoxToList(pos, entityBox, collidingBoxes, AABB5WEST);
				        addCollisionBoxToList(pos, entityBox, collidingBoxes, AABB6WEST);
				        addCollisionBoxToList(pos, entityBox, collidingBoxes, AABB7WEST);
				        addCollisionBoxToList(pos, entityBox, collidingBoxes, AABB8WEST);
				        addCollisionBoxToList(pos, entityBox, collidingBoxes, AABB9WEST);
				}
				if (state.getValue(BlockDirectional.FACING) == EnumFacing.WEST) {
						addCollisionBoxToList(pos, entityBox, collidingBoxes, AABB0EAST);
				        addCollisionBoxToList(pos, entityBox, collidingBoxes, AABB1EAST);
				        addCollisionBoxToList(pos, entityBox, collidingBoxes, AABB2EAST);
				        addCollisionBoxToList(pos, entityBox, collidingBoxes, AABB3EAST);
				        addCollisionBoxToList(pos, entityBox, collidingBoxes, AABB4EAST);
				        addCollisionBoxToList(pos, entityBox, collidingBoxes, AABB5EAST);
				        addCollisionBoxToList(pos, entityBox, collidingBoxes, AABB6EAST);
				        addCollisionBoxToList(pos, entityBox, collidingBoxes, AABB7EAST);
				        addCollisionBoxToList(pos, entityBox, collidingBoxes, AABB8EAST);
				        addCollisionBoxToList(pos, entityBox, collidingBoxes, AABB9EAST);
				}
				if (state.getValue(BlockDirectional.FACING) == EnumFacing.UP) {
						addCollisionBoxToList(pos, entityBox, collidingBoxes, AABBUP);
				}
				if (state.getValue(BlockDirectional.FACING) == EnumFacing.DOWN) {
						addCollisionBoxToList(pos, entityBox, collidingBoxes, AABBDOWN);
				}
	        }
	    }

	    //@Override
		public AxisAlignedBB getBoundingBox(IBlockState state, IBlockAccess source, BlockPos pos) {
			if (((getActualState(state, source, pos).getValue(OUTER)) == true) ||
				((getActualState(state, source, pos).getValue(INNER)) == true)) {
				if ((getActualState(state, source, pos).getValue(NW)) == true) {
					return new AxisAlignedBB(0.5D, 0.8D, 0.5D, 1D, 1D, 1D);
				}
				if ((getActualState(state, source, pos).getValue(SW)) == true) {
					return new AxisAlignedBB(0.5D, 0.8D, 0D, 1D, 1D, 0.5D);
				}
				if ((getActualState(state, source, pos).getValue(NE)) == true) {
					return new AxisAlignedBB(0D, 0.8D, 0.5D, 0.5D, 1D, 1D);
				}
				if ((getActualState(state, source, pos).getValue(SE)) == true) {
					return new AxisAlignedBB(0D, 0.8D, 0D, 0.5D, 1D, 0.5D);
				}
			}
			else {
				switch ((EnumFacing) state.getValue(BlockDirectional.FACING)) {
					case SOUTH :
					default :
						return new AxisAlignedBB(0.0D, 0.8D, 0.0D, 1D, 1D, 0.2D);
					case NORTH :
						return new AxisAlignedBB(0.0D, 0.8D, 0.8D, 1D, 1D, 1D);
					case WEST :
						return new AxisAlignedBB(0.8D, 0.8D, 0.0D, 1D, 1D, 1D);
					case EAST :
						return new AxisAlignedBB(0.0D, 0.8D, 0.0D, 0.2D, 1D, 1D);
					case UP :
						return AABBUP;
					case DOWN :
						return AABBDOWN;
				}
			}
			//else:
			return new AxisAlignedBB(0D, 0D, 0D, 1D, 1D, 1D);
		}

		@SideOnly(Side.CLIENT)
	    public void randomDisplayTick(IBlockState stateIn, World worldIn, BlockPos pos, Random rand)
	    {
	    	if (stateIn.getBlock() == this) {
		        if (stateIn.getValue(BlockDirectional.FACING) == EnumFacing.UP) {
		        	if (worldIn.isRainingAt(pos.up()) && !worldIn.getBlockState(pos.down()).isTopSolid() && rand.nextInt(15) == 1)
				        {
				            double d0 = (double)((float)pos.getX() + rand.nextFloat());
				            double d1 = (double)pos.getY() - 0.05D;
				            double d2 = (double)((float)pos.getZ() + rand.nextFloat());
				            worldIn.spawnParticle(EnumParticleTypes.DRIP_WATER, d0, d1, d2, 0.0D, 0.0D, 0.0D);
				        }
		        	}
	    	}
	    }
		
	}
}
