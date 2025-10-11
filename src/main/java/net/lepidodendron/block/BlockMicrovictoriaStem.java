
package net.lepidodendron.block;

import net.lepidodendron.ElementsLepidodendronMod;
import net.lepidodendron.LepidodendronSorter;
import net.lepidodendron.block.base.IAdvancementGranter;
import net.lepidodendron.util.CustomTrigger;
import net.lepidodendron.util.ModTriggers;
import net.minecraft.block.Block;
import net.minecraft.block.BlockLiquid;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.properties.PropertyInteger;
import net.minecraft.block.state.BlockFaceShape;
import net.minecraft.block.state.BlockStateContainer;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.renderer.block.statemap.StateMap;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraft.util.BlockRenderLayer;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.NonNullList;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fluids.BlockFluidBase;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import javax.annotation.Nullable;
import java.util.Random;

@ElementsLepidodendronMod.ModElement.Tag
public class BlockMicrovictoriaStem extends ElementsLepidodendronMod.ModElement {
	@GameRegistry.ObjectHolder("lepidodendron:microvictoria_stem")
	public static final Block block = null;
	public BlockMicrovictoriaStem(ElementsLepidodendronMod instance) {
		super(instance, LepidodendronSorter.microvictoria_stem);
	}

	@Override
	public void initElements() {
		elements.blocks.add(() -> new BlockCustom().setRegistryName("microvictoria_stem"));
		//elements.items.add(() -> new ItemBlock(block).setRegistryName(block.getRegistryName()));
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		//ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(block), 0,
		//		new ModelResourceLocation("lepidodendron:microvictoria_stem", "inventory"));
			ModelLoader.setCustomStateMapper(block, (new StateMap.Builder()).ignore(BlockMicrovictoriaStem.LEVEL).build());
	}

	public static final PropertyInteger LEVEL = PropertyInteger.create("level", 0, 15);
	
	public static class BlockCustom extends Block implements IAdvancementGranter {
		public BlockCustom() {
			super(Material.WATER);
			setTranslationKey("pf_microvictoria_stem");
			setSoundType(SoundType.PLANT);
			setHardness(0.0F);
			setResistance(0F);
			setLightLevel(0F);
			setLightOpacity(3);
			setCreativeTab(null);
			this.setTickRandomly(true);
			this.setDefaultState(this.blockState.getBaseState().withProperty(LEVEL, 0));
		}

		@Nullable
		@Override
		public CustomTrigger getModTrigger() {
			return ModTriggers.CLICK_MICROVICTORIA;
		}

		@Override
		public IBlockState getActualState(IBlockState state, IBlockAccess worldIn, BlockPos pos)
	    {
	        return state.withProperty(LEVEL, 0);
	    }

		@Override
	    public IBlockState getStateFromMeta(int meta)
	    {
	        return this.getDefaultState();
	    }

	    @Override
	    public int getMetaFromState(IBlockState state)
	    {
	        return 0;
	    }

	    @Override
		public void getDrops(NonNullList<ItemStack> drops, IBlockAccess world, BlockPos pos, IBlockState state, int fortune) {
			drops.add(new ItemStack(Blocks.AIR, (int) (1)));
		}

		@Override
		protected boolean canSilkHarvest()
	    {
	        return false;
	    }

		@Override
		public boolean isOpaqueCube(IBlockState state) {
			return false;
		}

		protected BlockStateContainer createBlockState()
	    {
	        return new BlockStateContainer(this, new IProperty[] {LEVEL});
	    }
	    
		@Override
	    public boolean isFullCube(IBlockState state)
	    {
	        return false;
	    }

	    @SideOnly(Side.CLIENT)
	    @Override
	    public BlockRenderLayer getRenderLayer()
	    {
	        return BlockRenderLayer.CUTOUT_MIPPED;
	    }

	    @Override
	    public BlockFaceShape getBlockFaceShape(IBlockAccess world, IBlockState state, BlockPos pos, EnumFacing facing)
	    {
	        return BlockFaceShape.UNDEFINED;
	    }

		@Override
	    public AxisAlignedBB getCollisionBoundingBox(IBlockState state, IBlockAccess world, BlockPos pos)
	    {
	        return NULL_AABB;
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
		public ItemStack getPickBlock(IBlockState state, RayTraceResult target, World world, BlockPos pos, EntityPlayer player) {
			return new ItemStack(BlockMicrovictoria.block, (int) (1));
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
		        
			}
		}

		public boolean canBlockStay(World world, BlockPos pos, IBlockState state) {
			if (!isWaterBlock(world, pos.up())) {
				return false;
			}
			if (world.getBlockState(pos.down()).getBlock() == BlockMicrovictoriaStem.block) {
				return true;
			}
	    	if (isWaterBlock(world, pos.down())
	    		&& ((world.getBlockState(pos.down().east()).getBlock() == BlockMicrovictoria.block) 
	    		|| (world.getBlockState(pos.down().west()).getBlock() == BlockMicrovictoria.block)
	    		|| (world.getBlockState(pos.down().north()).getBlock() == BlockMicrovictoria.block)
	    		|| (world.getBlockState(pos.down().south()).getBlock() == BlockMicrovictoria.block)
	    		|| (world.getBlockState(pos.down()).getBlock() == BlockMicrovictoria.block)))
	    	{
	    		return true;
	    	}
	    	return false;
		}

		public boolean isWaterBlock(World world, BlockPos pos) {
			IBlockState state  = world.getBlockState(pos);
			if (state.getMaterial() == Material.WATER
					&& (state.getBlock() instanceof BlockLiquid || state.getBlock() instanceof BlockFluidBase
					|| state.getBlock() == this)) {
				return true;
			}
			return false;
		}

	    @Override
	    public void breakBlock(World worldIn, BlockPos pos, IBlockState state) {
			//Force ticks of any stems arouud it:
			
			worldIn.scheduleUpdate(pos.up(2), BlockMicrovictoriaLeaves.block, 1);
			worldIn.scheduleUpdate(pos.up(2), BlockMicrovictoriaFlower.block, 1);
			worldIn.scheduleUpdate(pos.up(2), BlockMicrovictoriaBud.block, 1);
	    	
	    	super.breakBlock(worldIn, pos, state);
	    }

	}
}
