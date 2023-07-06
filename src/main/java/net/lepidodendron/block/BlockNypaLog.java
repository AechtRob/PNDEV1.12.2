
package net.lepidodendron.block;

import net.lepidodendron.ElementsLepidodendronMod;
import net.lepidodendron.LepidodendronSorter;
import net.lepidodendron.creativetab.TabLepidodendronPlants;
import net.minecraft.block.Block;
import net.minecraft.block.BlockDirectional;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.properties.PropertyBool;
import net.minecraft.block.properties.PropertyDirection;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.util.BlockRenderLayer;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.Rotation;
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

@ElementsLepidodendronMod.ModElement.Tag
public class BlockNypaLog extends ElementsLepidodendronMod.ModElement {
	@GameRegistry.ObjectHolder("lepidodendron:nypa_log")
	public static final Block block = null;
	public BlockNypaLog(ElementsLepidodendronMod instance) {
		super(instance, LepidodendronSorter.nypa_log);
	}

	@Override
	public void initElements() {
		elements.blocks.add(() -> new BlockCustom().setRegistryName("nypa_log"));
		elements.items.add(() -> new ItemBlock(block).setRegistryName(block.getRegistryName()));
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(block), 0,
				new ModelResourceLocation("lepidodendron:nypa_log", "inventory"));
	}

	@Override
	public void init(FMLInitializationEvent event) {
		super.init(event);
		//OreDictionary.registerOre("plantdnaPNlepidodendron:nypa_sapling", BlockNypaLog.block);
		OreDictionary.registerOre("logWood", BlockNypaLog.block);
	}

	public static final PropertyBool ROOTSN = PropertyBool.create("roots_north");
	public static final PropertyBool ROOTSS = PropertyBool.create("roots_south");
	public static final PropertyBool ROOTSE = PropertyBool.create("roots_east");
	public static final PropertyBool ROOTSW = PropertyBool.create("roots_west");

	public static class BlockCustom extends Block {
		public static final PropertyDirection FACING = BlockDirectional.FACING;
		public BlockCustom() {
			super(Material.WOOD);
			setTranslationKey("pf_nypa_log");
			setSoundType(SoundType.WOOD);
			setHarvestLevel("axe", 1);
			setHardness(2F);
			setResistance(2F);
			setLightLevel(0F);
			setLightOpacity(255);
			setCreativeTab(TabLepidodendronPlants.tab);
			this.setDefaultState(this.blockState.getBaseState().withProperty(ROOTSN, false).withProperty(ROOTSS, false).withProperty(ROOTSE, false).withProperty(ROOTSW, false).withProperty(FACING, EnumFacing.SOUTH));
		}

		@Override
		public IBlockState getActualState(IBlockState state, IBlockAccess worldIn, BlockPos pos)
		{
			boolean boolVarN = false;
			IBlockState stateCheck = worldIn.getBlockState(pos.down().north());
			if ((stateCheck.getMaterial() == Material.SAND
					|| stateCheck.getMaterial() == Material.GROUND
					|| stateCheck.getMaterial() == Material.CLAY
					|| stateCheck.getMaterial() == Material.GRASS
					|| stateCheck.getMaterial() == Material.ROCK)
				&& worldIn.getBlockState(pos.north()).getMaterial() == Material.WATER) {
				boolVarN = true;
			}
			boolean boolVarS = false;
			stateCheck = worldIn.getBlockState(pos.down().south());
			if ((stateCheck.getMaterial() == Material.SAND
					|| stateCheck.getMaterial() == Material.GROUND
					|| stateCheck.getMaterial() == Material.CLAY
					|| stateCheck.getMaterial() == Material.GRASS
					|| stateCheck.getMaterial() == Material.ROCK)
					&& worldIn.getBlockState(pos.south()).getMaterial() == Material.WATER) {
				boolVarS = true;
			}
			boolean boolVarE = false;
			stateCheck = worldIn.getBlockState(pos.down().east());
			if ((stateCheck.getMaterial() == Material.SAND
					|| stateCheck.getMaterial() == Material.GROUND
					|| stateCheck.getMaterial() == Material.CLAY
					|| stateCheck.getMaterial() == Material.GRASS
					|| stateCheck.getMaterial() == Material.ROCK)
					&& worldIn.getBlockState(pos.east()).getMaterial() == Material.WATER) {
				boolVarE = true;
			}
			boolean boolVarW = false;
			stateCheck = worldIn.getBlockState(pos.down().west());
			if ((stateCheck.getMaterial() == Material.SAND
					|| stateCheck.getMaterial() == Material.GROUND
					|| stateCheck.getMaterial() == Material.CLAY
					|| stateCheck.getMaterial() == Material.GRASS
					|| stateCheck.getMaterial() == Material.ROCK)
					&& worldIn.getBlockState(pos.west()).getMaterial() == Material.WATER) {
				boolVarW = true;
			}
			return state.withProperty(ROOTSN, boolVarN).withProperty(ROOTSS, boolVarS).withProperty(ROOTSE, boolVarE).withProperty(ROOTSW, boolVarW);
		}

		@Override
		protected net.minecraft.block.state.BlockStateContainer createBlockState() {
			return new net.minecraft.block.state.BlockStateContainer(this, new IProperty[]{ROOTSN,ROOTSS,ROOTSE,ROOTSW,FACING});
		}

		@Override
		public IBlockState withRotation(IBlockState state, Rotation rot) {
			if (rot == Rotation.CLOCKWISE_90 || rot == Rotation.COUNTERCLOCKWISE_90) {
				if ((EnumFacing) state.getValue(FACING) == EnumFacing.WEST || (EnumFacing) state.getValue(FACING) == EnumFacing.EAST) {
					return state.withProperty(FACING, EnumFacing.UP);
				} else if ((EnumFacing) state.getValue(FACING) == EnumFacing.UP || (EnumFacing) state.getValue(FACING) == EnumFacing.DOWN) {
					return state.withProperty(FACING, EnumFacing.WEST);
				}
			}
			return state;
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
			if (facing == EnumFacing.WEST || facing == EnumFacing.EAST)
				facing = EnumFacing.UP;
			else if (facing == EnumFacing.NORTH || facing == EnumFacing.SOUTH)
				facing = EnumFacing.EAST;
			else
				facing = EnumFacing.SOUTH;
			return this.getDefaultState().withProperty(FACING, facing);
		}

		@Override
		public int getFlammability(IBlockAccess world, BlockPos pos, EnumFacing face) {
			return 5;
		}

		@Override
		public int getFireSpreadSpeed(IBlockAccess world, BlockPos pos, EnumFacing face) {
			return 5;
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
		public MapColor getMapColor(IBlockState state, IBlockAccess blockAccess, BlockPos pos) {
			return MapColor.WOOD;
		}

		@Override
		public boolean canSustainLeaves(IBlockState state, IBlockAccess world, BlockPos pos) {
			return true;
		}

		@Override public boolean isWood(IBlockAccess world, BlockPos pos){ return true; }


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


	}
}
