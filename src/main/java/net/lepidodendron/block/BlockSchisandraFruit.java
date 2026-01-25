
package net.lepidodendron.block;

import net.lepidodendron.ElementsLepidodendronMod;
import net.lepidodendron.LepidodendronConfig;
import net.lepidodendron.LepidodendronSorter;
import net.lepidodendron.block.base.IAdvancementGranter;
import net.lepidodendron.item.ItemSchisandraFruit;
import net.lepidodendron.util.CustomTrigger;
import net.lepidodendron.util.ModTriggers;
import net.minecraft.block.Block;
import net.minecraft.block.BlockVine;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.properties.PropertyBool;
import net.minecraft.block.state.BlockFaceShape;
import net.minecraft.block.state.BlockStateContainer;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.stats.StatList;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.items.ItemHandlerHelper;

import javax.annotation.Nullable;
import java.util.Random;

@ElementsLepidodendronMod.ModElement.Tag
public class BlockSchisandraFruit extends ElementsLepidodendronMod.ModElement {
	@GameRegistry.ObjectHolder("lepidodendron:schisandra_fruit")
	public static final Block block = null;
	public BlockSchisandraFruit(ElementsLepidodendronMod instance) {
		super(instance, LepidodendronSorter.schisandra_fruit);
	}

	@Override
	public void initElements() {
		elements.blocks.add(() -> new BlockCustom().setRegistryName("schisandra_fruit"));
	}

	public static final PropertyBool UP = PropertyBool.create("up");
    public static final PropertyBool NORTH = PropertyBool.create("north");
    public static final PropertyBool EAST = PropertyBool.create("east");
    public static final PropertyBool SOUTH = PropertyBool.create("south");
    public static final PropertyBool WEST = PropertyBool.create("west");

	public static class BlockCustom extends BlockVine implements IAdvancementGranter {
		public BlockCustom() {
			//super(Material.VINE);
			setSoundType(SoundType.PLANT);
			setTranslationKey("pf_schisandra_fruit");
			setDefaultState(this.blockState.getBaseState().withProperty(UP, Boolean.valueOf(false)).withProperty(NORTH, Boolean.valueOf(false)).withProperty(EAST, Boolean.valueOf(false)).withProperty(SOUTH, Boolean.valueOf(false)).withProperty(WEST, Boolean.valueOf(false)));
        	setTickRandomly(true);
		}

		@Nullable
		@Override
		public CustomTrigger getModTrigger() {
			return ModTriggers.CLICK_SCHISANDRA;
		}


		@Override
		public int getFlammability(IBlockAccess world, BlockPos pos, EnumFacing face) {
			return 100;
		}

		@Override
		public int getFireSpreadSpeed(IBlockAccess world, BlockPos pos, EnumFacing face) {
			return 15;
		}

		protected BlockStateContainer createBlockState()
	    {
	        return new BlockStateContainer(this, new IProperty[] {UP, NORTH, EAST, SOUTH, WEST});
	    }

	    @Override
	   	public boolean isShearable(ItemStack item, IBlockAccess world, BlockPos pos)
	    { 
	    	return false;
	    	//if (LepidodendronConfig.doPropagation) {
	    	//	return false;
	    	//}
	    	//else {return true; }
	    }

		@Override
		public void harvestBlock(World worldIn, EntityPlayer player, BlockPos pos, IBlockState state, @Nullable TileEntity te, ItemStack stack)
		{
			if (!worldIn.isRemote) {
				if (!LepidodendronConfig.doPropagation && stack.getItem() == Items.SHEARS) {
					player.addStat(StatList.getBlockStats(this));
					spawnAsEntity(worldIn, pos, new ItemStack(BlockSchisandra.block, 1, 0));
				} else {
					player.addStat(StatList.getBlockStats(this));
					spawnAsEntity(worldIn, pos, new ItemStack(ItemSchisandraFruit.block, 1, 0));
				}
			}
			super.harvestBlock(worldIn, player, pos, state, te, stack);
		}

	    @Override
		protected boolean canSilkHarvest()
	    { 
	    	if (LepidodendronConfig.doPropagation) {
	    		return false;
	    	}
	    	else {return true; }
	    }

	    @Override
	    public boolean canAttachTo(World p_193395_1_, BlockPos p_193395_2_, EnumFacing p_193395_3_)
	    {
	        Block block = p_193395_1_.getBlockState(p_193395_2_.up()).getBlock();
	        return this.isAcceptableNeighbor(p_193395_1_, p_193395_2_.offset(p_193395_3_.getOpposite()), p_193395_3_) && (block == Blocks.AIR || block == this || block == BlockSchisandra.block || this.isAcceptableNeighbor(p_193395_1_, p_193395_2_.up(), EnumFacing.UP));
	    }

	    private boolean isAcceptableNeighbor(World p_193396_1_, BlockPos p_193396_2_, EnumFacing p_193396_3_)
	    {
	        IBlockState iblockstate = p_193396_1_.getBlockState(p_193396_2_);
	        return iblockstate.getBlockFaceShape(p_193396_1_, p_193396_2_, p_193396_3_) == BlockFaceShape.SOLID && !isExceptBlockForAttaching(iblockstate.getBlock());
	    }

	    @Override
	    //Lifted from the vanilla vine class wholesale and amended where needed:
	    public void updateTick(World worldIn, BlockPos pos, IBlockState state, Random rand)
	    {
	        if (!worldIn.isRemote)
	        {
	            if (worldIn.rand.nextInt(4) == 0 && worldIn.isAreaLoaded(pos, 4)) // Forge: check area to prevent loading unloaded chunks
	            {
	                int i = 4;
	                int j = 5;
	                boolean flag = false;
	                label181:
	
	                for (int k = -4; k <= 4; ++k)
	                {
	                    for (int l = -4; l <= 4; ++l)
	                    {
	                        for (int i1 = -1; i1 <= 1; ++i1)
	                        {
								if (
										(worldIn.getBlockState(pos.add(k, i1, l)).getBlock() == this)
										|| (worldIn.getBlockState(pos.add(k, i1, l)).getBlock() == BlockSchisandra.block)
									)
	                            {
	                                --j;
	
	                                if (j <= 0)
	                                {
	                                    flag = true;
	                                    break label181;
	                                }
	                            }
	                        }
	                    }
	                }
	
	                EnumFacing enumfacing1 = EnumFacing.random(rand);
	                BlockPos blockpos2 = pos.up();
	
	                if (enumfacing1 == EnumFacing.UP && pos.getY() < 255 && worldIn.isAirBlock(blockpos2))
	                {
	                    IBlockState iblockstate2 = state;
	
	                    for (EnumFacing enumfacing2 : EnumFacing.Plane.HORIZONTAL)
	                    {
	                        if (rand.nextBoolean() && this.canAttachTo(worldIn, blockpos2, enumfacing2.getOpposite()))
	                        {
	                            iblockstate2 = iblockstate2.withProperty(getPropertyFor(enumfacing2), Boolean.valueOf(true));
	                        }
	                        else
	                        {
	                            iblockstate2 = iblockstate2.withProperty(getPropertyFor(enumfacing2), Boolean.valueOf(false));
	                        }
	                    }

						IBlockState state1 = BlockSchisandra.block.getDefaultState()
								.withProperty(UP, state.getValue(UP))
								.withProperty(NORTH, state.getValue(NORTH))
								.withProperty(EAST, state.getValue(EAST))
								.withProperty(SOUTH, state.getValue(SOUTH))
								.withProperty(WEST, state.getValue(WEST));
						if (rand.nextInt(3) == 0) {
							state1 = state;
						}

	                    if (((Boolean)iblockstate2.getValue(NORTH)).booleanValue() || ((Boolean)iblockstate2.getValue(EAST)).booleanValue() || ((Boolean)iblockstate2.getValue(SOUTH)).booleanValue() || ((Boolean)iblockstate2.getValue(WEST)).booleanValue())
	                    {
	                        worldIn.setBlockState(blockpos2, state1, 2);
	                    }
	                }
	                else if (enumfacing1.getAxis().isHorizontal() && !((Boolean)state.getValue(getPropertyFor(enumfacing1))).booleanValue())
	                {
	                    if (!flag)
	                    {
	                        BlockPos blockpos4 = pos.offset(enumfacing1);
	                        IBlockState iblockstate3 = worldIn.getBlockState(blockpos4);
	                        Block block1 = iblockstate3.getBlock();
	
	                        if (block1.isAir(iblockstate3, worldIn, blockpos4))
	                        {
	                            EnumFacing enumfacing3 = enumfacing1.rotateY();
	                            EnumFacing enumfacing4 = enumfacing1.rotateYCCW();
	                            boolean flag1 = ((Boolean)state.getValue(getPropertyFor(enumfacing3))).booleanValue();
	                            boolean flag2 = ((Boolean)state.getValue(getPropertyFor(enumfacing4))).booleanValue();
	                            BlockPos blockpos = blockpos4.offset(enumfacing3);
	                            BlockPos blockpos1 = blockpos4.offset(enumfacing4);
	
	                            if (flag1 && this.canAttachTo(worldIn, blockpos.offset(enumfacing3), enumfacing3))
	                            {
	                                //worldIn.setBlockState(blockpos4, this.getDefaultState().withProperty(getPropertyFor(enumfacing3), Boolean.valueOf(true)), 2);
	                            }
	                            else if (flag2 && this.canAttachTo(worldIn, blockpos1.offset(enumfacing4), enumfacing4))
	                            {
	                                //worldIn.setBlockState(blockpos4, this.getDefaultState().withProperty(getPropertyFor(enumfacing4), Boolean.valueOf(true)), 2);
	                            }
	                            else if (flag1 && worldIn.isAirBlock(blockpos) && this.canAttachTo(worldIn, blockpos, enumfacing1))
	                            {
	                                //worldIn.setBlockState(blockpos, this.getDefaultState().withProperty(getPropertyFor(enumfacing1.getOpposite()), Boolean.valueOf(true)), 2);
	                            }
	                            else if (flag2 && worldIn.isAirBlock(blockpos1) && this.canAttachTo(worldIn, blockpos1, enumfacing1))
	                            {
	                                //worldIn.setBlockState(blockpos1, this.getDefaultState().withProperty(getPropertyFor(enumfacing1.getOpposite()), Boolean.valueOf(true)), 2);
	                            }
	                        }
	                        else if (iblockstate3.getBlockFaceShape(worldIn, blockpos4, enumfacing1) == BlockFaceShape.SOLID)
	                        {
								IBlockState state2 = BlockSchisandra.block.getDefaultState()
										.withProperty(UP, state.getValue(UP))
										.withProperty(NORTH, state.getValue(NORTH))
										.withProperty(EAST, state.getValue(EAST))
										.withProperty(SOUTH, state.getValue(SOUTH))
										.withProperty(WEST, state.getValue(WEST));
								if (rand.nextInt(3) == 0) {
									state2 = state;
								}
	                            worldIn.setBlockState(pos, state2.withProperty(getPropertyFor(enumfacing1), Boolean.valueOf(true)), 2);
	                        }
	                    }
	                }
	                else
	                {
	                    if (pos.getY() > 1)
	                    {
	                        BlockPos blockpos3 = pos.down();
	                        IBlockState iblockstate = worldIn.getBlockState(blockpos3);
	                        Block block = iblockstate.getBlock();

	                        if ((worldIn.getBlockState(blockpos3)).getMaterial() == Material.AIR)
	                        {
								IBlockState iblockstate1 = state;
	
	                            for (EnumFacing enumfacing : EnumFacing.Plane.HORIZONTAL)
	                            {
	                                if (rand.nextBoolean())
	                                {
	                                    iblockstate1 = iblockstate1.withProperty(getPropertyFor(enumfacing), Boolean.valueOf(false));
	                                }
	                            }

								IBlockState state3 = BlockSchisandra.block.getDefaultState()
										.withProperty(UP, iblockstate1.getValue(UP))
										.withProperty(NORTH, iblockstate1.getValue(NORTH))
										.withProperty(EAST, iblockstate1.getValue(EAST))
										.withProperty(SOUTH, iblockstate1.getValue(SOUTH))
										.withProperty(WEST, iblockstate1.getValue(WEST));
								if (rand.nextInt(3) == 0) {
									state3 = iblockstate1;
								}

	                            if (((Boolean)iblockstate1.getValue(NORTH)).booleanValue() || ((Boolean)iblockstate1.getValue(EAST)).booleanValue() || ((Boolean)iblockstate1.getValue(SOUTH)).booleanValue() || ((Boolean)iblockstate1.getValue(WEST)).booleanValue())
	                            {
	                                worldIn.setBlockState(blockpos3, state3, 2);
	                            }
	                        }
	                        else if (block == this || block == BlockSchisandra.block)
	                        {
	                            IBlockState iblockstate4 = iblockstate;
	
	                            for (EnumFacing enumfacing5 : EnumFacing.Plane.HORIZONTAL)
	                            {
	                                PropertyBool propertybool = getPropertyFor(enumfacing5);
	
	                                if (rand.nextBoolean() && ((Boolean)state.getValue(propertybool)).booleanValue())
	                                {
	                                    iblockstate4 = iblockstate4.withProperty(propertybool, Boolean.valueOf(true));
	                                }
	                            }

								IBlockState state4 = block.getDefaultState()
										.withProperty(UP, iblockstate4.getValue(UP))
										.withProperty(NORTH, iblockstate4.getValue(NORTH))
										.withProperty(EAST, iblockstate4.getValue(EAST))
										.withProperty(SOUTH, iblockstate4.getValue(SOUTH))
										.withProperty(WEST, iblockstate4.getValue(WEST));
	
	                            if (((Boolean)iblockstate4.getValue(NORTH)).booleanValue() || ((Boolean)iblockstate4.getValue(EAST)).booleanValue() || ((Boolean)iblockstate4.getValue(SOUTH)).booleanValue() || ((Boolean)iblockstate4.getValue(WEST)).booleanValue())
	                            {
	                                worldIn.setBlockState(blockpos3, state4, 2);
	                            }
	                        }
	                    }
	                }
	            }
	        }
	    }

		@Override
		public boolean onBlockActivated(World worldIn, BlockPos pos, IBlockState state, EntityPlayer playerIn, EnumHand hand, EnumFacing facing, float hitX, float hitY, float hitZ) {
			if ((!playerIn.capabilities.allowEdit) || (!playerIn.getHeldItemMainhand().isEmpty()) || !LepidodendronConfig.doPropagation)
			{
				return super.onBlockActivated(worldIn, pos, state, playerIn, hand, facing, hitX, hitY, hitZ);
			}
			else {
				if (!((hand != playerIn.getActiveHand()) && (hand == EnumHand.MAIN_HAND))) {
					ItemStack stackSeed = new ItemStack(ItemSchisandraFruit.block, (int) (1));
					stackSeed.setCount(1);
					ItemHandlerHelper.giveItemToPlayer(playerIn, stackSeed);
					worldIn.setBlockState(pos, BlockSchisandra.block.getDefaultState()
							.withProperty(UP, state.getValue(UP))
							.withProperty(NORTH, state.getValue(NORTH))
							.withProperty(SOUTH, state.getValue(SOUTH))
							.withProperty(EAST, state.getValue(EAST))
							.withProperty(WEST, state.getValue(WEST)), 3);
					return true;
				}
				return true;
			}

		}

		public void neighborChanged(IBlockState state, World worldIn, BlockPos pos, Block blockIn, BlockPos fromPos)
		{
			if (!worldIn.isRemote && !this.recheckGrownSides(worldIn, pos, state))
			{
				this.dropBlockAsItem(worldIn, pos, state, 0);
				worldIn.setBlockToAir(pos);
			}
		}

		private boolean recheckGrownSides(World worldIn, BlockPos pos, IBlockState state)
		{
			IBlockState iblockstate = state;

			for (EnumFacing enumfacing : EnumFacing.Plane.HORIZONTAL)
			{
				PropertyBool propertybool = getPropertyFor(enumfacing);

				if (((Boolean)state.getValue(propertybool)).booleanValue() && !this.canAttachTo(worldIn, pos, enumfacing.getOpposite()))
				{
					IBlockState iblockstate1 = worldIn.getBlockState(pos.up());

					if ((iblockstate1.getBlock() != this && iblockstate1.getBlock() != BlockSchisandra.block)
							|| !((Boolean)iblockstate1.getValue(propertybool)).booleanValue())
					{
						state = state.withProperty(propertybool, Boolean.valueOf(false));
					}
				}
			}

			if (getNumGrownFaces(state) == 0)
			{
				return false;
			}
			else
			{
				if (iblockstate != state)
				{
					worldIn.setBlockState(pos, state, 2);
				}

				return true;
			}
		}
	}
}
