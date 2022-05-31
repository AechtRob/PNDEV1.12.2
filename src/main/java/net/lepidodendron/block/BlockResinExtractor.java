
package net.lepidodendron.block;

import net.lepidodendron.ElementsLepidodendronMod;
import net.lepidodendron.LepidodendronSorter;
import net.lepidodendron.creativetab.TabLepidodendronMisc;
import net.lepidodendron.item.ItemBottleOfResin;
import net.minecraft.block.Block;
import net.minecraft.block.BlockDirectional;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.properties.PropertyDirection;
import net.minecraft.block.state.BlockFaceShape;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.init.SoundEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.network.NetworkManager;
import net.minecraft.network.play.server.SPacketUpdateTileEntity;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.*;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fluids.FluidRegistry;
import net.minecraftforge.fluids.FluidStack;
import net.minecraftforge.fluids.FluidUtil;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.items.ItemHandlerHelper;
import net.minecraftforge.oredict.OreDictionary;

import javax.annotation.Nullable;
import java.util.Random;

@ElementsLepidodendronMod.ModElement.Tag
public class BlockResinExtractor extends ElementsLepidodendronMod.ModElement {
	@GameRegistry.ObjectHolder("lepidodendron:resin_extractor")
	public static final Block block = null;

	public BlockResinExtractor(ElementsLepidodendronMod instance) {
		super(instance, LepidodendronSorter.resin_extractor);
	}

	@Override
	public void initElements() {
		elements.blocks.add(() -> new BlockCustom().setRegistryName("resin_extractor"));
		elements.items.add(() -> new ItemBlock(block).setRegistryName(block.getRegistryName()));
	}

	@Override
	public void init(FMLInitializationEvent event) {
		GameRegistry.registerTileEntity(TileEntityCustom.class, "lepidodendron:tileentityresin_extractor");
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(block), 0,
				new ModelResourceLocation("lepidodendron:resin_extractor", "inventory"));
	}

	public static class BlockCustom extends Block {
		public static final PropertyDirection FACING = BlockDirectional.FACING;

		public BlockCustom() {
			super(Material.ROCK);
			setTranslationKey("pf_resin_extractor");
			setSoundType(SoundType.WOOD);
			setHardness(5F);
			setResistance(5F);
			setLightLevel(0F);
			setLightOpacity(0);
			setCreativeTab(TabLepidodendronMisc.tab);
			setTickRandomly(true);
			this.setDefaultState(this.blockState.getBaseState().withProperty(FACING, EnumFacing.DOWN));
		}

		@Override
		public boolean hasComparatorInputOverride(IBlockState state) {
			return true;
		}

		@Override
		public int getComparatorInputOverride(IBlockState blockState, World worldIn, BlockPos pos) {
			double i;
			int mb = 0;
			try {
				mb = (int) (new Object() {
					public int getValue(BlockPos pos, String tag) {
						TileEntity tileEntity = worldIn.getTileEntity(pos);
						if (tileEntity != null)
							return tileEntity.getTileData().getInteger(tag);
						return -1;
					}
				}.getValue(pos, "mb"));
			} catch (Exception e) {
			}
			if (mb < 0) {
				mb = 0;
			}
			//System.err.println("mb: " + mb);
			i = Math.floor(((double)mb/2000D) * 15D);
			//System.err.println("rf: " + i);
			return (int) i;
		}

		@Override
		public boolean hasTileEntity(IBlockState state) {
			return true;
		}

		@Nullable
		@Override
		public TileEntity createTileEntity(World world, IBlockState state) {
			return new TileEntityCustom();
		}

		public TileEntityCustom createNewTileEntity(World worldIn, int meta) {
			return new TileEntityCustom();
		}

		@Override
		public boolean eventReceived(IBlockState state, World worldIn, BlockPos pos, int eventID, int eventParam) {
			super.eventReceived(state, worldIn, pos, eventID, eventParam);
			TileEntity tileentity = worldIn.getTileEntity(pos);
			return tileentity == null ? false : tileentity.receiveClientEvent(eventID, eventParam);
		}

		@Override
		public EnumBlockRenderType getRenderType(IBlockState state) {
			return EnumBlockRenderType.MODEL;
		}

		@SideOnly(Side.CLIENT)
		@Override
		public BlockRenderLayer getRenderLayer()
		{
			return BlockRenderLayer.CUTOUT;
		}

		@Override
		public void updateTick(World world, BlockPos pos, IBlockState state, Random random) {
			super.updateTick(world, pos, state, random);

			if (isBlockActive(world, pos, state.getValue(FACING))) {

				int mb = 0;

				try {
					mb = (int) (new Object() {
						public int getValue(BlockPos pos, String tag) {
							TileEntity tileEntity = world.getTileEntity(pos);
							if (tileEntity != null)
								return tileEntity.getTileData().getInteger(tag);
							return -1;
						}
					}.getValue(pos, "mb"));
				} catch (Exception e) {
				}

				//New fill level:
				if (mb < 0) {
					mb = 0;
				}
				mb = Math.min(mb + 55, 2000);
				if (mb >= 2000) {
					IBlockState _bs = world.getBlockState(pos);
					world.setBlockState(pos, BlockResinExtractorFull.block.getDefaultState().withProperty(FACING, _bs.getValue(FACING)));
				}
				else if (!world.isRemote) {
					TileEntity _tileEntity = world.getTileEntity(pos);
					IBlockState _bs = world.getBlockState(pos);
					if (_tileEntity != null)
						_tileEntity.getTileData().setInteger("mb", mb);
					world.notifyBlockUpdate(pos, _bs, _bs, 3);
				}

			}
			world.updateComparatorOutputLevel(pos,this);

		}

		@Override
		public boolean onBlockActivated(World world, BlockPos pos, IBlockState state, EntityPlayer entity, EnumHand hand, EnumFacing direction,
			float hitX, float hitY, float hitZ) {
			int mb = 0;
			boolean Bucketable = false;
			boolean Bottleable = false;
			try {
				mb = (int) (new Object() {
					public int getValue(BlockPos pos, String tag) {
						TileEntity tileEntity = world.getTileEntity(pos);
						if (tileEntity != null)
							return tileEntity.getTileData().getInteger(tag);
						return -1;
					}
				}.getValue(pos, "mb"));
			} catch (Exception e) {
			}
			if (mb >= 1000) {Bucketable = true;}
			if (mb >= 333) {Bottleable = true;}
			if (entity.getHeldItemMainhand().getItem() == new ItemStack(Items.GLASS_BOTTLE, (int) (1)).getItem() && Bottleable) {
				SoundEvent soundevent = SoundEvents.ITEM_BOTTLE_FILL;
				entity.getEntityWorld().playSound(entity, entity.getPosition(), soundevent, SoundCategory.BLOCKS, 1.0F, 1.0F);
				entity.inventory.clearMatchingItems(new ItemStack(Items.GLASS_BOTTLE, (int) (1)).getItem(), -1, (int) 1, null);
				ItemStack _setstack = new ItemStack(ItemBottleOfResin.block, (int) (1));
				_setstack.setCount(1);
				ItemHandlerHelper.giveItemToPlayer(entity, _setstack);
				//New fill level:
				mb = mb - 333;
				if (mb < 0) {
					mb = 0;
				}
				if (!world.isRemote) {
					TileEntity _tileEntity = world.getTileEntity(pos);
					IBlockState _bs = world.getBlockState(pos);
					if (_tileEntity != null)
						_tileEntity.getTileData().setInteger("mb", mb);
					world.notifyBlockUpdate(pos, _bs, _bs, 3);
				}
				world.updateComparatorOutputLevel(pos,this);
				return true;
			}
			else if (entity.getHeldItemMainhand().getItem() == new ItemStack(Items.BUCKET, (int) (1)).getItem() && Bucketable) {
				SoundEvent soundevent = SoundEvents.ITEM_BUCKET_FILL;
				entity.getEntityWorld().playSound(entity, entity.getPosition(), soundevent, SoundCategory.BLOCKS, 1.0F, 1.0F);
				entity.inventory.clearMatchingItems(new ItemStack(Items.BUCKET, (int) (1)).getItem(), -1, (int) 1, null);
				ItemStack _setstack = FluidUtil.getFilledBucket(new FluidStack(FluidRegistry.getFluid("resin"), 1000));
				_setstack.setCount(1);
				ItemHandlerHelper.giveItemToPlayer(entity, _setstack);
				//New fill level:
				mb = mb - 1000;
				if (mb < 0) {
					mb = 0;
				}
				if (!world.isRemote) {
					TileEntity _tileEntity = world.getTileEntity(pos);
					IBlockState _bs = world.getBlockState(pos);
					if (_tileEntity != null)
						_tileEntity.getTileData().setInteger("mb", mb);
					world.notifyBlockUpdate(pos, _bs, _bs, 3);
				}
				world.updateComparatorOutputLevel(pos,this);
				return true;
			}
			return super.onBlockActivated(world, pos, state, entity, hand, direction, hitX, hitY, hitZ);
		}

		@Override
		protected net.minecraft.block.state.BlockStateContainer createBlockState() {
			return new net.minecraft.block.state.BlockStateContainer(this, new IProperty[]{FACING,});
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
		public void breakBlock(World world, BlockPos pos, IBlockState state) {
			TileEntity tileentity = world.getTileEntity(pos);
			//if (tileentity instanceof TileEntityCustom)
			//InventoryHelper.dropInventoryItems(world, pos, (TileEntityCustom) tileentity);
			world.removeTileEntity(pos);
			super.breakBlock(world, pos, state);
		}

		@Override
		public BlockFaceShape getBlockFaceShape(IBlockAccess world, IBlockState state, BlockPos pos, EnumFacing face) {
			return BlockFaceShape.UNDEFINED;
		}

		@Override
		public boolean isOpaqueCube(IBlockState state) {
			return false;
		}

		@Override
		public boolean isFullCube(IBlockState state)
		{
			return false;
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

		public boolean isBlockActive(World world, BlockPos pos, EnumFacing facing) {
			//On a valid log which is "planted" and of sufficient height:
			BlockPos position = pos;
			if (facing == EnumFacing.NORTH) {
				position = pos.south();
			}
			if (facing == EnumFacing.SOUTH) {
				position = pos.north();
			}
			if (facing == EnumFacing.EAST) {
				position = pos.west();
			}
			if (facing == EnumFacing.WEST) {
				position = pos.east();
			}

			IBlockState blockstate = world.getBlockState(position);
			Block block = blockstate.getBlock();
			//Is the block "growing"?
			if (
				(world.getBlockState(position.down()).getMaterial() != Material.GROUND)
				&& (world.getBlockState(position.down()).getMaterial() != Material.GRASS)
				&& (world.getBlockState(position.down()).getMaterial() != Material.SAND)
				&& (world.getBlockState(position.down()).getMaterial() != Material.ROCK)
			) {
				return false;
			}
			//Is the block sufficiently high to look tree-ish?
			int i = 1;
			while (i <= 4) {
				if (world.getBlockState(position.up(i)).getBlock() != block) {
					return false;
				}
				i += 1;
			}
			//Is this a resinable block?
			try {
				if (
					block.getPickBlock(blockstate, null, world, position, null) != null
				) {
					if (OreDictionary.containsMatch(false, OreDictionary.getOres("logResin"),
							block.getPickBlock(blockstate, null, world, position, null))) {
						return true;
					}
				}
			} catch (Exception e) {
			}
			return false;
		}
	}

	public static class TileEntityCustom extends TileEntity {

		@Override
		public boolean shouldRefresh(World world, BlockPos pos, IBlockState oldState, IBlockState newSate)
		{
			return (oldState.getBlock() != newSate.getBlock());
		}

		@Override
		public SPacketUpdateTileEntity getUpdatePacket() {
			return new SPacketUpdateTileEntity(this.pos, 0, this.getUpdateTag());
		}

		@Override
		public NBTTagCompound getUpdateTag() {
			return this.writeToNBT(new NBTTagCompound());
		}

		@Override
		public void onDataPacket(NetworkManager net, SPacketUpdateTileEntity pkt) {
			this.readFromNBT(pkt.getNbtCompound());
		}

		@Override
		public void handleUpdateTag(NBTTagCompound tag) {
			this.readFromNBT(tag);
		}

	}

}
