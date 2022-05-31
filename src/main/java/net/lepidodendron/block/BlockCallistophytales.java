
package net.lepidodendron.block;

import net.lepidodendron.ElementsLepidodendronMod;
import net.lepidodendron.LepidodendronConfig;
import net.lepidodendron.LepidodendronSorter;
import net.lepidodendron.creativetab.TabLepidodendronPlants;
import net.lepidodendron.item.ItemCallistophytalesSeeds;
import net.minecraft.block.Block;
import net.minecraft.block.BlockVine;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.properties.PropertyBool;
import net.minecraft.block.state.BlockFaceShape;
import net.minecraft.block.state.BlockStateContainer;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraft.stats.StatList;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.items.ItemHandlerHelper;

import javax.annotation.Nullable;
import java.util.List;
import java.util.Random;

@ElementsLepidodendronMod.ModElement.Tag
public class BlockCallistophytales extends ElementsLepidodendronMod.ModElement {
	@GameRegistry.ObjectHolder("lepidodendron:callistophytales")
	public static final Block block = null;
	public BlockCallistophytales(ElementsLepidodendronMod instance) {
		super(instance, LepidodendronSorter.callistophytales);
	}

	@Override
	public void initElements() {
		elements.blocks.add(() -> new BlockCustom().setRegistryName("callistophytales"));
		elements.items.add(() -> new ItemBlock(block).setRegistryName(block.getRegistryName()));
	}

	public static final PropertyBool UP = PropertyBool.create("up");
    public static final PropertyBool NORTH = PropertyBool.create("north");
    public static final PropertyBool EAST = PropertyBool.create("east");
    public static final PropertyBool SOUTH = PropertyBool.create("south");
    public static final PropertyBool WEST = PropertyBool.create("west");
    
	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(block), 0,
				new ModelResourceLocation("lepidodendron:callistophytales", "inventory"));
	}
	public static class BlockCustom extends BlockVine {
		public BlockCustom() {
			//super(Material.VINE);
			setSoundType(SoundType.PLANT);
			setTranslationKey("pf_callistophytales");
			setDefaultState(this.blockState.getBaseState().withProperty(UP, Boolean.valueOf(false)).withProperty(NORTH, Boolean.valueOf(false)).withProperty(EAST, Boolean.valueOf(false)).withProperty(SOUTH, Boolean.valueOf(false)).withProperty(WEST, Boolean.valueOf(false)));
        	setTickRandomly(true);
			setCreativeTab(TabLepidodendronPlants.tab);
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
	        if (!LepidodendronConfig.doPropagation && !worldIn.isRemote && stack.getItem() == Items.SHEARS)
	        {
	            player.addStat(StatList.getBlockStats(this));
	            spawnAsEntity(worldIn, pos, new ItemStack(this, 1, 0));
	        }
	        else {
	        	if (!LepidodendronConfig.doPropagation) {
	           		super.harvestBlock(worldIn, player, pos, state, te, stack);
	        	}
	        }
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
	        return this.isAcceptableNeighbor(p_193395_1_, p_193395_2_.offset(p_193395_3_.getOpposite()), p_193395_3_) && (block == Blocks.AIR || block == this || this.isAcceptableNeighbor(p_193395_1_, p_193395_2_.up(), EnumFacing.UP));
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
	                            if (worldIn.getBlockState(pos.add(k, i1, l)).getBlock() == this)
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
	
	                    if (((Boolean)iblockstate2.getValue(NORTH)).booleanValue() || ((Boolean)iblockstate2.getValue(EAST)).booleanValue() || ((Boolean)iblockstate2.getValue(SOUTH)).booleanValue() || ((Boolean)iblockstate2.getValue(WEST)).booleanValue())
	                    {
	                        worldIn.setBlockState(blockpos2, iblockstate2, 2);
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
	                            worldIn.setBlockState(pos, state.withProperty(getPropertyFor(enumfacing1), Boolean.valueOf(true)), 2);
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
	
	                            if (((Boolean)iblockstate1.getValue(NORTH)).booleanValue() || ((Boolean)iblockstate1.getValue(EAST)).booleanValue() || ((Boolean)iblockstate1.getValue(SOUTH)).booleanValue() || ((Boolean)iblockstate1.getValue(WEST)).booleanValue())
	                            {
	                                worldIn.setBlockState(blockpos3, iblockstate1, 2);
	                            }
	                        }
	                        else if (block == this)
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
	
	                            if (((Boolean)iblockstate4.getValue(NORTH)).booleanValue() || ((Boolean)iblockstate4.getValue(EAST)).booleanValue() || ((Boolean)iblockstate4.getValue(SOUTH)).booleanValue() || ((Boolean)iblockstate4.getValue(WEST)).booleanValue())
	                            {
	                                worldIn.setBlockState(blockpos3, iblockstate4, 2);
	                            }
	                        }
	                    }
	                }
	            }
	        }
	    }

	    @SideOnly(Side.CLIENT)
		@Override
	    public void addInformation(ItemStack stack, World player, List<String> tooltip, ITooltipFlag advanced) {
	        if (LepidodendronConfig.showTooltips) {
				tooltip.add("Type: Seed-Plant vine");
	        tooltip.add("Periods: Carboniferous");
	        tooltip.add("Note: Coal swamps. Climbing.");
	        tooltip.add("Propagation: seeds");}
	        super.addInformation(stack, player, tooltip, advanced);
	    }

	    public boolean onBlockActivated(World world, BlockPos pos, IBlockState state, EntityPlayer player, EnumHand hand, EnumFacing facing, float hitX, float hitY, float hitZ)
	    {
        if ((!player.capabilities.allowEdit) || (!player.getHeldItemMainhand().isEmpty()) || !LepidodendronConfig.doPropagation)
	        {
	            return super.onBlockActivated(world, pos, state, player, hand, facing, hitX, hitY, hitZ);
	        }
	        else {
	        	if (!((hand != player.getActiveHand()) && (hand == EnumHand.MAIN_HAND))) {
					if (Math.random() > 0.5) {
						ItemStack stackSeed = new ItemStack(ItemCallistophytalesSeeds.block, (int) (1));
						stackSeed.setCount(1);
						ItemHandlerHelper.giveItemToPlayer(player, stackSeed);
						if (Math.random() > 0.75) {
							world.destroyBlock(pos, false);
						}
						return true;
					}
					else {
						if (Math.random() > 0.75) {
							world.destroyBlock(pos, false);
		    				return true;
						}
					}		
				}
	        	return true;
	        }
	    }

	}
}
