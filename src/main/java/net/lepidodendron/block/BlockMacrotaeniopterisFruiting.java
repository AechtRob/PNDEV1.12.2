
package net.lepidodendron.block;

import net.lepidodendron.ElementsLepidodendronMod;
import net.lepidodendron.LepidodendronConfig;
import net.lepidodendron.LepidodendronSorter;
import net.lepidodendron.block.base.IAdvancementGranter;
import net.lepidodendron.item.ItemMacrotaeniopterisCone;
import net.lepidodendron.item.ItemMacrotaeniopterisItem;
import net.lepidodendron.util.CustomTrigger;
import net.lepidodendron.util.ModTriggers;
import net.minecraft.block.Block;
import net.minecraft.block.BlockLilyPad;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.BlockFaceShape;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.Entity;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.BlockRenderLayer;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.NonNullList;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.items.ItemHandlerHelper;

import javax.annotation.Nullable;
import java.util.List;
import java.util.Random;

@ElementsLepidodendronMod.ModElement.Tag
public class BlockMacrotaeniopterisFruiting extends ElementsLepidodendronMod.ModElement {
	@GameRegistry.ObjectHolder("lepidodendron:macrotaeniopteris_fruiting")
	public static final Block block = null;
	public BlockMacrotaeniopterisFruiting(ElementsLepidodendronMod instance) {
		super(instance, LepidodendronSorter.macrotaeniopteris_fruiting);
	}

	@Override
	public void initElements() {
		elements.blocks.add(() -> new BlockCustom());
		//elements.items.add(() -> new ItemBlock(block).setRegistryName(block.getRegistryName()));
	}

	public static class BlockCustom extends BlockLilyPad implements IAdvancementGranter {
		public BlockCustom() {
			//super(Material.PLANTS);
			setSoundType(SoundType.PLANT);
			setHardness(0F);
			setResistance(0F);
			setLightLevel(0F);
			setLightOpacity(0);
			setCreativeTab(null);
			setTickRandomly(true);
			setTranslationKey("pf_macrotaeniopteris_fruiting");
			setRegistryName("macrotaeniopteris_fruiting");
		}

		@Nullable
		@Override
		public CustomTrigger getModTrigger() {
			return ModTriggers.CLICK_MACROTAENIOPTERIS;
		}

		@Override
		public void harvestBlock(World worldIn, EntityPlayer player, BlockPos pos, IBlockState state, @Nullable TileEntity te, ItemStack stack) {
			if (stack.getItem() == Items.SHEARS && LepidodendronConfig.doPropagation
					&&
					(worldIn.getBlockState(pos.down()).getMaterial() == Material.WATER
					)
			) {
				EntityItem entityToSpawn = new EntityItem(worldIn, pos.getX(), pos.getY(), pos.getZ(), new ItemStack(ItemMacrotaeniopterisItem.block, (int) (1)));
				entityToSpawn.setPickupDelay(10);
				worldIn.spawnEntity(entityToSpawn);
			}
			else {
				super.harvestBlock(worldIn, player, pos, state, te, stack);
			}
		}

		@SideOnly(Side.CLIENT)
		@Override
    	public BlockRenderLayer getRenderLayer()
		{
			return BlockRenderLayer.CUTOUT;
		}

		@Override
		@Nullable
		public AxisAlignedBB getCollisionBoundingBox(IBlockState blockState, IBlockAccess worldIn, BlockPos pos) {
			return NULL_AABB;
		}

		@Override
		public boolean isPassable(IBlockAccess worldIn, BlockPos pos) {
			return true;
		}

		@Override
		public boolean isFullCube(IBlockState state) {
			return false;
		}

		@Override
		public AxisAlignedBB getBoundingBox(IBlockState state, IBlockAccess source, BlockPos pos) {
			return new AxisAlignedBB(0D, -0.5D, 0D, 1D, 0.5D, 1D);
		}

		@Override
		public void addCollisionBoxToList(IBlockState state, World worldIn, BlockPos pos, AxisAlignedBB entityBox, List<AxisAlignedBB> collidingBoxes, @Nullable Entity entityIn, boolean isActualState)
	    {}

		@Override
		public boolean isOpaqueCube(IBlockState state) {
			return false;
		}

		@Override
		public boolean isReplaceable(IBlockAccess blockAccess, BlockPos pos) {
			return true;
		}

		@Override
		public ItemStack getPickBlock(IBlockState state, RayTraceResult target, World world, BlockPos pos, EntityPlayer player) {
			return new ItemStack(ItemMacrotaeniopterisItem.block, (int) (1));
		}

		@Override
		public void getDrops(NonNullList<ItemStack> drops, IBlockAccess world, BlockPos pos, IBlockState state, int fortune) {
			if (LepidodendronConfig.doPropagation) {
				drops.add(new ItemStack(Blocks.AIR, (int) (1)));
			}
			else {
				drops.add(new ItemStack(ItemMacrotaeniopterisItem.block, (int) (1)));
			}
		}

		@Override
		protected boolean canSilkHarvest()
	    {
	        return false;
	    }

		@Override
		public void neighborChanged(IBlockState state, World world, BlockPos pos, Block neighborBlock, BlockPos fromPos) {
			//super.neighborChanged(state, world, pos, neighborBlock, fromPos);
			{
		        if (!this.canBlockStay(world, pos, state))
		        {
		            world.scheduleUpdate(pos, this, 1);
		        }
		    }
		}

		@Override
		public void updateTick(World world, BlockPos pos, IBlockState state, Random random) {
			//super.updateTick(world, pos, state, random);
	    	
	        if (!world.isRemote)
	        {
	            if (!world.isAreaLoaded(pos, 3)) return;
	            
				if (!this.canBlockStay(world, pos, state))
		        {
		            world.destroyBlock(pos, false);
		        }
		        else {
					if (Math.random()>0.8 && Math.random()>0.8) {
						world.setBlockState(pos, BlockMacrotaeniopteris.block.getDefaultState(), 3);
					}
				}
			}
		}

		@Override
		public BlockFaceShape getBlockFaceShape(IBlockAccess world, IBlockState state, BlockPos pos, EnumFacing face) {
			return BlockFaceShape.UNDEFINED;
		}
	    
		@Override
		public boolean canBlockStay(World worldIn, BlockPos pos, IBlockState state)
	    {
	        if (pos.getY() >= 0 && pos.getY() < 256)
	        {
	            IBlockState iblockstate = worldIn.getBlockState(pos.down());
	            Material material = iblockstate.getMaterial();
	            return canSurviveAt(worldIn, pos) && (material == Material.WATER
						//&& ((Integer)iblockstate.getValue(BlockLiquid.LEVEL)).intValue() == 0
						|| material == Material.ICE);
	        }
	        else
	        {
	            return false;
	        }
	    }	

		//@Override
		public boolean canSurviveAt(World worldIn, BlockPos pos) {
			if (worldIn.getBlockState(pos.down()).getMaterial() != Material.WATER && worldIn.getBlockState(pos.down()).getMaterial() != Material.ICE) 
	    	{
	    		return false;
	    	}
	    	if ((worldIn.getBlockState(pos.down(2)).getMaterial() != Material.GROUND) 
	    		&& (worldIn.getBlockState(pos.down(2)).getMaterial() != Material.CLAY)
	    		&& (worldIn.getBlockState(pos.down(2)).getMaterial() != Material.SAND))
	    	{
	    		return false;
	    	}

//	    	double getLight = worldIn.getLight(pos);
//	    	if (!worldIn.canSeeSky(pos) && (worldIn.isDaytime()) && (getLight < 7))
//	    	{
//	    		return false;
//	    	}

	    	return true;
	    	 
	    }
		
		@Override
	    public net.minecraftforge.common.EnumPlantType getPlantType(IBlockAccess world, BlockPos pos)
	    {
	        return net.minecraftforge.common.EnumPlantType.Water;
	    }

	    @Override
	    protected boolean canSustainBush(IBlockState state)
	    {
	        return state.getBlock() == Blocks.WATER || state.getMaterial() == Material.ICE;
	    }

		@Override
	    public EnumOffsetType getOffsetType()
	    {
	        return EnumOffsetType.XZ;
	    }

		@Override
		public boolean onBlockActivated(World world, BlockPos pos, IBlockState state, EntityPlayer player, EnumHand hand, EnumFacing facing, float hitX, float hitY, float hitZ)
		{
			if ((!player.capabilities.allowEdit) || (!player.getHeldItemMainhand().isEmpty()) || !LepidodendronConfig.doPropagation)
			{
				return super.onBlockActivated(world, pos, state, player, hand, facing, hitX, hitY, hitZ);
			}
			else {
				if (!((hand != player.getActiveHand()) && (hand == EnumHand.MAIN_HAND))) {
					ItemStack stackSeed = new ItemStack(ItemMacrotaeniopterisCone.block, (int) (1));
					stackSeed.setCount(1);
					ItemHandlerHelper.giveItemToPlayer(player, stackSeed);
					if (Math.random() > 0.95) {
						world.destroyBlock(pos, false);
					}
					else {
						world.setBlockState(pos, BlockMacrotaeniopteris.block.getDefaultState());
					}
					return true;
				}
				return true;
			}
		}

	}
}
