
package net.lepidodendron.block;

import net.lepidodendron.ElementsLepidodendronMod;
import net.lepidodendron.LepidodendronConfig;
import net.lepidodendron.LepidodendronSorter;
import net.lepidodendron.item.ItemPrototaxitesChunk;
import net.lepidodendron.procedure.ProcedureTreeLog;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.properties.PropertyBool;
import net.minecraft.block.properties.PropertyInteger;
import net.minecraft.block.state.BlockFaceShape;
import net.minecraft.block.state.BlockStateContainer;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.renderer.block.statemap.StateMap;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.BlockRenderLayer;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.NonNullList;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.world.Explosion;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import java.util.Random;

@ElementsLepidodendronMod.ModElement.Tag
public class BlockPrototaxitesStem extends ElementsLepidodendronMod.ModElement {
	@GameRegistry.ObjectHolder("lepidodendron:prototaxites_stem")
	public static final Block block = null;
	public BlockPrototaxitesStem(ElementsLepidodendronMod instance) {
		super(instance, LepidodendronSorter.prototaxites_stem);
	}

	@Override
	public void initElements() {
		elements.blocks.add(() -> new BlockCustom().setRegistryName("prototaxites_stem"));
		//elements.items.add(() -> new ItemBlock(block).setRegistryName(block.getRegistryName()));
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		//ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(block), 0, new ModelResourceLocation("lepidodendron:encblue_log", "inventory"));
		ModelLoader.setCustomStateMapper(block, (new StateMap.Builder()).ignore(BlockCustom.SPORES).build());

	}
	public static class BlockCustom extends Block {

	public static final PropertyInteger SECTION = PropertyInteger.create("section", 0, 4);
	public static final PropertyBool SPORES = PropertyBool.create("spores");
	public static final PropertyBool GROUND = PropertyBool.create("ground");

    	public BlockCustom() {
			super(Material.PLANTS);
			setTranslationKey("pf_prototaxites_stem");
			setSoundType(SoundType.PLANT);
			setHardness(1F);
			setResistance(10F);
			setLightLevel(0F);
			setLightOpacity(0);
			setCreativeTab(null);
			setTickRandomly(true);
        	this.setDefaultState(this.blockState.getBaseState().withProperty(SECTION, 0).withProperty(SPORES, false).withProperty(GROUND, false));
		}

		@Override
		public IBlockState getActualState(IBlockState state, IBlockAccess worldIn, BlockPos pos)
	    {
	    	boolean ground = false;
			if (worldIn.getBlockState(pos.up()).getBlock() != this) {
				if (worldIn.getBlockState(pos.down()).getBlock() != this) {ground = true;}
				return state.withProperty(SECTION, 4).withProperty(GROUND, ground);
			}

			if ((worldIn.getBlockState(pos.up(2)).getBlock() != this)
				&& (worldIn.getBlockState(pos.up()).getBlock() == this))
			{
				if (worldIn.getBlockState(pos.down()).getBlock() != this) {ground = true;}
				return state.withProperty(SECTION, 3).withProperty(GROUND, ground);
			}

			if ((worldIn.getBlockState(pos.up(3)).getBlock() != this)
				&& (worldIn.getBlockState(pos.up(2)).getBlock() == this)
				&& (worldIn.getBlockState(pos.up()).getBlock() == this))
			{
				if (worldIn.getBlockState(pos.down()).getBlock() != this) {ground = true;}
				return state.withProperty(SECTION, 2).withProperty(GROUND, ground);
			}

			if (worldIn.getBlockState(pos.down()).getBlock() != this) {
				if (worldIn.getBlockState(pos.down()).getBlock() != this) {ground = true;}
				return state.withProperty(SECTION, 0).withProperty(GROUND, ground);
			}
			
				if (worldIn.getBlockState(pos.down()).getBlock() != this) {ground = true;}
	        	return state.withProperty(SECTION, 1).withProperty(GROUND, ground);
	    }

	    @Override
		public ItemStack getPickBlock(IBlockState state, RayTraceResult target, World world, BlockPos pos, EntityPlayer player) {
			return new ItemStack(BlockPrototaxites.block, (int) (1));
		}
		
		@Override
		protected boolean canSilkHarvest()
	    {
	        return false;
	    }

        @Override
		public void getDrops(NonNullList<ItemStack> drops, IBlockAccess world, BlockPos pos, IBlockState state, int fortune) {
			int stackSize = (int) getActualState(state, world, pos).getValue(SECTION);
			drops.add(new ItemStack(ItemPrototaxitesChunk.block, stackSize));
		}
		
	    public IBlockState getStateFromMeta(int meta) {
			return this.getDefaultState().withProperty(SPORES, (meta & 1) != 0);
		}
		
	    public int getMetaFromState(IBlockState state) {
			int i = 0;
			if (!(Boolean) state.getValue(SPORES))
				i |= 1;
			return i;
		}

		@Override
		public AxisAlignedBB getBoundingBox(IBlockState state, IBlockAccess source, BlockPos pos) {
			return new AxisAlignedBB(0.3D, 0D, 0.3D, 0.7D, 1D, 0.7D);
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
	
	    protected BlockStateContainer createBlockState()
	    {
	        return new BlockStateContainer(this, new IProperty[] {GROUND,SECTION,SPORES});
	    }

		@Override
		public void neighborChanged(IBlockState state, World world, BlockPos pos, Block neighborBlock, BlockPos fromPos) {
			super.neighborChanged(state, world, pos, neighborBlock, fromPos);
			if (world.isAirBlock(pos.down())) {
				world.destroyBlock(pos, false);
			}
	    	world.notifyBlockUpdate(pos, state, state, 3);
	    	int check;
	    	//Propagate state checks up and down:
	    	check = 1;
	    	while (world.getBlockState(pos.up(check)).getBlock() == this) {
	    		world.notifyBlockUpdate(pos.up(check), state, state, 3);
	    		check = check + 1;
	    	}
	    	check = 1;
	    	while (world.getBlockState(pos.down(check)).getBlock() == this) {
	    		world.notifyBlockUpdate(pos.down(check), state, state, 3);
	    		check = check + 1;
	    	}
		}

		@Override
		public boolean removedByPlayer(IBlockState state, World world, BlockPos pos, EntityPlayer entity, boolean willHarvest) {
			boolean retval = super.removedByPlayer(state, world, pos, entity, willHarvest);
			int check;
	    	//Propagate state checks up and down:
	    	check = 1;
	    	while (world.getBlockState(pos.up(check)).getBlock() == this) {
	    		world.destroyBlock(pos.up(check), true);
	    		check = check + 1;
	    	}
	    	check = 1;
	    	while (world.getBlockState(pos.down(check)).getBlock() == this) {
	    		world.destroyBlock(pos.down(check), true);
	    		check = check + 1;
	    	}
	    	//Replant the mycelium?
	    	if (canSurviveAt(world, pos.down(check - 1))) {
	    		world.setBlockState(pos.down(check - 1), BlockPrototaxites.block.getDefaultState(), 3);
	    	}
			
			return retval;
		}

		@Override
		public void onBlockExploded(World world, BlockPos pos, Explosion e) {
			super.onBlockExploded(world, pos, e);
			int check;
	    	//Propagate state checks up and down:
	    	check = 1;
	    	while (world.getBlockState(pos.up(check)).getBlock() == this) {
	    		world.destroyBlock(pos.up(check), false);
	    		check = check + 1;
	    	}
	    	check = 1;
	    	while (world.getBlockState(pos.down(check)).getBlock() == this) {
	    		world.destroyBlock(pos.down(check), false);
	    		check = check + 1;
	    	}
	    	//Replant the mycelium?
	    	if (canSurviveAt(world, pos.down(check - 1))) {
	    		world.setBlockState(pos.down(check - 1), BlockPrototaxites.block.getDefaultState(), 3);
	    	}
		}

		@Override
		public void updateTick(World world, BlockPos pos, IBlockState state, Random random) {
			super.updateTick(world, pos, state, random);
			//System.err.println("State: " + getActualState(state, world, pos).getValue(SECTION));
			
			if ((getActualState(state, world, pos).getValue(SECTION) == 4) && (!state.getValue(SPORES))) {
				int ColHeight = 0;
				while (world.getBlockState(pos.down(ColHeight)).getBlock() == this) {
					ColHeight = ColHeight + 1;
				}
				if ((ColHeight > 5) && (Math.random() > 0.6)) {
					//Sporing mode:
					ColHeight = 0;
					boolean spored = false;
					while (world.getBlockState(pos.down(ColHeight)).getBlock() == this) {
						world.setBlockState(pos.down(ColHeight), this.getDefaultState().withProperty(SPORES, true), 3);
						//Decorate with spores:
						if ((getActualState(state, world, pos.down(ColHeight)).getValue(SECTION) == 2)
						|| (getActualState(state, world, pos.down(ColHeight)).getValue(SECTION) == 3)) {
							//North
							if ((Math.random() > 0.15) && (world.isAirBlock(pos.down(ColHeight).north()))) {
								ProcedureTreeLog.executeProcedure((int) pos.down(ColHeight).north().getX(), (int) pos.down(ColHeight).north().getY(), (int) pos.down(ColHeight).north().getZ(), world, BlockPrototaxitesStrobilus.block, EnumFacing.NORTH);
								if (!world.isRemote) {
									BlockPos _bp = pos.down(ColHeight).north();
									TileEntity _tileEntity = world.getTileEntity(_bp);
									IBlockState _bs = world.getBlockState(_bp);
									if (_tileEntity != null)
										_tileEntity.getTileData().setBoolean("decayable", (true));
									world.notifyBlockUpdate(_bp, _bs, _bs, 3);
								}
								spored = true;
							}
							//South
							if ((Math.random() > 0.15) && (world.isAirBlock(pos.down(ColHeight).south()))) {
								ProcedureTreeLog.executeProcedure((int) pos.down(ColHeight).south().getX(), (int) pos.down(ColHeight).south().getY(), (int) pos.down(ColHeight).south().getZ(), world, BlockPrototaxitesStrobilus.block, EnumFacing.SOUTH);
								if (!world.isRemote) {
									BlockPos _bp = pos.down(ColHeight).south();
									TileEntity _tileEntity = world.getTileEntity(_bp);
									IBlockState _bs = world.getBlockState(_bp);
									if (_tileEntity != null)
										_tileEntity.getTileData().setBoolean("decayable", (true));
									world.notifyBlockUpdate(_bp, _bs, _bs, 3);
								}
								spored = true;
							}
							//East
							if ((Math.random() > 0.15) && (world.isAirBlock(pos.down(ColHeight).east()))) {
								ProcedureTreeLog.executeProcedure((int) pos.down(ColHeight).east().getX(), (int) pos.down(ColHeight).east().getY(), (int) pos.down(ColHeight).east().getZ(), world, BlockPrototaxitesStrobilus.block, EnumFacing.EAST);
								if (!world.isRemote) {
									BlockPos _bp = pos.down(ColHeight).east();
									TileEntity _tileEntity = world.getTileEntity(_bp);
									IBlockState _bs = world.getBlockState(_bp);
									if (_tileEntity != null)
										_tileEntity.getTileData().setBoolean("decayable", (true));
									world.notifyBlockUpdate(_bp, _bs, _bs, 3);
								}
							}
							//West
							if ((Math.random() > 0.15) && (world.isAirBlock(pos.down(ColHeight).west()))) {
								ProcedureTreeLog.executeProcedure((int) pos.down(ColHeight).west().getX(), (int) pos.down(ColHeight).west().getY(), (int) pos.down(ColHeight).west().getZ(), world, BlockPrototaxitesStrobilus.block, EnumFacing.WEST);
								if (!world.isRemote) {
									BlockPos _bp = pos.down(ColHeight).west();
									TileEntity _tileEntity = world.getTileEntity(_bp);
									IBlockState _bs = world.getBlockState(_bp);
									if (_tileEntity != null)
										_tileEntity.getTileData().setBoolean("decayable", (true));
									world.notifyBlockUpdate(_bp, _bs, _bs, 3);
								}
								spored = true;
							}
						}
						ColHeight = ColHeight + 1;
					}
					ColHeight = 0;
					while (!spored && world.getBlockState(pos.down(ColHeight)).getBlock() == this) {
						world.setBlockState(pos.down(ColHeight), this.getDefaultState().withProperty(SPORES, false), 3);
						ColHeight = ColHeight + 1;
					}
				}
				else {
					if ((ColHeight < 8) && (world.isAirBlock(pos.up()))) {
						world.setBlockState(pos.up(), this.getDefaultState(), 3);
					}
				}
			}
			
			//If there are spores, apply a chance of collapse to any blockstate:
			if ((getActualState(state, world, pos).getValue(SECTION) == 4) && (state.getValue(SPORES)) && (Math.random() > 0.8)) {
				world.destroyBlock(pos, false);
				int check;
		    	//Propagate state checks up and down:
		    	check = 1;
		    	while (world.getBlockState(pos.up(check)).getBlock() == this) {
		    		world.destroyBlock(pos.up(check), false);
		    		check = check + 1;
		    	}
		    	check = 1;
		    	while (world.getBlockState(pos.down(check)).getBlock() == this) {
		    		world.destroyBlock(pos.down(check), false);
		    		check = check + 1;
		    	}
		    	//Replant the mycelium?
		    	if (canSurviveAt(world, pos.down(check - 1))) {
		    		world.setBlockState(pos.down(check - 1), BlockPrototaxites.block.getDefaultState(), 3);
		    	}
			}
		}

	    @Override
		public BlockFaceShape getBlockFaceShape(IBlockAccess world, IBlockState state, BlockPos pos, EnumFacing face) {
			return BlockFaceShape.UNDEFINED;
		}
		
    }

    public static boolean canSurviveAt(World worldIn, BlockPos pos) {
			
		int distH = (int) LepidodendronConfig.waterPrototaxitesHorizontal;
		if (distH < 1) distH = 1;
		if (distH > 20) distH = 20;
		int distV = (int) LepidodendronConfig.waterPrototaxitesVertical;
		if (distV < 1) distV = 1;
		if (distV > 6) distV = 6;
		boolean waterCriteria = false;
		int xct = -distH;
		int yct;
		int zct;
		while ((xct <= distH) && (!waterCriteria)) {
			yct = -distV;
			while ((yct <= 1) && (!waterCriteria)) {
				zct = -distH;
				while ((zct <= distH) && (!waterCriteria)) {
					if ((Math.pow((int) Math.abs(xct),2) + Math.pow((int) Math.abs(zct),2) <= Math.pow((int) distH,2)) && ((worldIn.getBlockState(new BlockPos(pos.getX() + xct, pos.getY() + yct, pos.getZ() + zct))).getMaterial() == Material.WATER)) {
						waterCriteria = true;
					}
					zct = zct + 1;
				}
				yct = yct + 1;
			}
			xct = xct + 1;
		}

    	if (!waterCriteria) return false;
    	
    	if ((worldIn.getBlockState(pos.down()).getMaterial() != Material.SAND) &&
			(worldIn.getBlockState(pos.down()).getBlock() != Blocks.MYCELIUM) &&
			(worldIn.getBlockState(pos.down()).getMaterial() != Material.ROCK) &&
			(worldIn.getBlockState(pos.down()).getMaterial() != Material.GROUND))
    	{
    		return false;
    	}

    	return true;
    	 
    }

}
