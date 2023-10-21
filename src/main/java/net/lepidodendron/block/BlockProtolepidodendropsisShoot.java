
package net.lepidodendron.block;

import net.lepidodendron.ElementsLepidodendronMod;
import net.lepidodendron.LepidodendronConfig;
import net.lepidodendron.LepidodendronSorter;
import net.lepidodendron.block.base.IAdvancementGranter;
import net.lepidodendron.block.base.SeedSporeBlockBase;
import net.lepidodendron.util.CustomTrigger;
import net.lepidodendron.util.ModTriggers;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.properties.PropertyInteger;
import net.minecraft.block.state.BlockFaceShape;
import net.minecraft.block.state.BlockStateContainer;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.renderer.block.statemap.StateMap;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
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

import javax.annotation.Nullable;
import java.util.Random;

@ElementsLepidodendronMod.ModElement.Tag
public class BlockProtolepidodendropsisShoot extends ElementsLepidodendronMod.ModElement {
	@GameRegistry.ObjectHolder("lepidodendron:protolepidodendropsis_shoot")
	public static final Block block = null;
	public BlockProtolepidodendropsisShoot(ElementsLepidodendronMod instance) {
		super(instance, LepidodendronSorter.protolepidodendropsis_shoot);
	}

	@Override
	public void initElements() {
		elements.blocks.add(() -> new BlockCustom().setRegistryName("protolepidodendropsis_shoot"));
		//elements.items.add(() -> new ItemBlock(block).setRegistryName(block.getRegistryName()));
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		//ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(block), 0, new ModelResourceLocation("lepidodendron:encblue_log", "inventory"));
		ModelLoader.setCustomStateMapper(block, (new StateMap.Builder()).build());
	}

	public static class BlockCustom extends SeedSporeBlockBase implements IAdvancementGranter {

	public static final PropertyInteger STAGE = PropertyInteger.create("stage", 0, 1);

    	public BlockCustom() {
			super(Material.PLANTS);
			setTranslationKey("pf_protolepidodendropsis_shoot");
			setSoundType(SoundType.PLANT);
			setHardness(1F);
			setResistance(1);
			setLightLevel(0F);
			setLightOpacity(0);
			setCreativeTab(null);
			setTickRandomly(true);
        	this.setDefaultState(this.blockState.getBaseState().withProperty(STAGE, 0));
		}

		@Nullable
		@Override
		public CustomTrigger getModTrigger() {
			return ModTriggers.CLICK_PROTOLEPIDODENDROPSIS;
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
		public IBlockState getStateFromMeta(int meta)
		{
			return this.getDefaultState().withProperty(STAGE, Integer.valueOf(meta));
		}

		@Override
		public int getMetaFromState(IBlockState state)
		{
			return ((Integer)state.getValue(STAGE)).intValue();
		}

	    @Override
		public ItemStack getPickBlock(IBlockState state, RayTraceResult target, World world, BlockPos pos, EntityPlayer player) {
			//return null;
    		return new ItemStack(BlockProtolepidodendropsisSapling.block, (int) (1));
		}
		
		@Override
		protected boolean canSilkHarvest()
	    {
	        return false;
	    }

        @Override
		public void getDrops(NonNullList<ItemStack> drops, IBlockAccess world, BlockPos pos, IBlockState state, int fortune) {
			if (!LepidodendronConfig.doPropagation) {
				drops.add(new ItemStack(BlockProtolepidodendropsisSapling.block, 2));
			}
		}

		@Override
		public AxisAlignedBB getBoundingBox(IBlockState state, IBlockAccess source, BlockPos pos) {
			return new AxisAlignedBB(0.0D, 0D, 0.0D, 1D, 1D, 1D);
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
	        return new BlockStateContainer(this, new IProperty[] {STAGE});
	    }

		@Override
		public void neighborChanged(IBlockState state, World world, BlockPos pos, Block neighborBlock, BlockPos fromPos) {
			super.neighborChanged(state, world, pos, neighborBlock, fromPos);
			if (world.isAirBlock(pos.down())) {
				world.destroyBlock(pos, false);
			}
		}

		@Override
		public boolean removedByPlayer(IBlockState state, World world, BlockPos pos, EntityPlayer entity, boolean willHarvest) {
			boolean retval = super.removedByPlayer(state, world, pos, entity, willHarvest);
			int check;
	    	//Propagate state checks up and down:
	    	check = 1;
	    	while (world.getBlockState(pos.down(check)).getBlock() == BlockProtolepidodendropsis.block) {
	    		world.destroyBlock(pos.down(check), true);
	    		check = check + 1;
	    	}

			return retval;
		}

		@Override
		public void onBlockExploded(World world, BlockPos pos, Explosion e) {
			super.onBlockExploded(world, pos, e);
			//Propagate state checks up and down:
			int check = 1;
			while (world.getBlockState(pos.down(check)).getBlock() == BlockProtolepidodendropsis.block) {
				world.destroyBlock(pos.down(check), true);
				check = check + 1;
			}
		}

		@Override
		public void updateTick(World world, BlockPos pos, IBlockState state, Random random) {
			super.updateTick(world, pos, state, random);
			//Grow
			if (state.getValue(STAGE) == 0) {
				world.setBlockState(pos, this.getDefaultState().withProperty(STAGE, 1), 3);
			}
		}

	    @Override
		public BlockFaceShape getBlockFaceShape(IBlockAccess world, IBlockState state, BlockPos pos, EnumFacing face) {
			return BlockFaceShape.UNDEFINED;
		}

		@Override
		public Block planted() {
			return BlockProtolepidodendropsisSapling.block;
		}

		@Override
		public int offsetY() {
			return 1;
		}
	}

}
