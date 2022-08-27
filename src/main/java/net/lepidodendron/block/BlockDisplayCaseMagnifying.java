
package net.lepidodendron.block;

import net.lepidodendron.ElementsLepidodendronMod;
import net.lepidodendron.LepidodendronSorter;
import net.lepidodendron.creativetab.TabLepidodendronMisc;
import net.minecraft.block.Block;
import net.minecraft.block.BlockDirectional;
import net.minecraft.block.ITileEntityProvider;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.properties.PropertyDirection;
import net.minecraft.block.state.BlockFaceShape;
import net.minecraft.block.state.BlockStateContainer;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.init.Items;
import net.minecraft.init.SoundEvents;
import net.minecraft.inventory.Container;
import net.minecraft.inventory.ItemStackHelper;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.network.NetworkManager;
import net.minecraft.network.play.server.SPacketUpdateTileEntity;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.tileentity.TileEntityLockableLoot;
import net.minecraft.util.*;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraft.world.WorldServer;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.common.capabilities.Capability;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.items.CapabilityItemHandler;
import net.minecraftforge.items.ItemStackHandler;

import javax.annotation.Nonnull;
import java.util.Random;

@ElementsLepidodendronMod.ModElement.Tag
public class BlockDisplayCaseMagnifying extends ElementsLepidodendronMod.ModElement {
	@GameRegistry.ObjectHolder("lepidodendron:display_case_magnifying")
	public static final Block block = null;

	public BlockDisplayCaseMagnifying(ElementsLepidodendronMod instance) {
		super(instance, LepidodendronSorter.display_case_magnifying);
	}

	@Override
	public void initElements() {
		elements.blocks.add(() -> new BlockDisplayCaseMagnifying.BlockCustom().setRegistryName("display_case_magnifying"));
		elements.items.add(() -> new ItemBlock(block).setRegistryName(block.getRegistryName()).setMaxStackSize(1));
	}

	@Override
	public void init(FMLInitializationEvent event) {
		GameRegistry.registerTileEntity(BlockDisplayCaseMagnifying.TileEntityDisplayCase.class, "lepidodendron:tileentitydisplay_case_magnifying");
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(block), 0,
				new ModelResourceLocation("lepidodendron:display_case_magnifying", "inventory"));
	}

	public static class BlockCustom extends Block implements ITileEntityProvider {

		public static final PropertyDirection FACING = BlockDirectional.FACING;

		public BlockCustom() {
			super(Material.GLASS, MapColor.WOOD);
			setTranslationKey("pf_display_case_magnifying");
			setSoundType(SoundType.GLASS);
			setHardness(0F);
			setResistance(0F);
			setLightOpacity(0);
			setCreativeTab(TabLepidodendronMisc.tab);
		}

		@Override
		public AxisAlignedBB getBoundingBox(IBlockState state, IBlockAccess source, BlockPos pos) {
			if (state.getValue(FACING) == EnumFacing.UP) {
				return new AxisAlignedBB(0, 0, 0, 1, 0.1875, 1);
			}
			if (state.getValue(FACING) == EnumFacing.DOWN) {
				return new AxisAlignedBB(0, 0.8125, 0, 1, 1, 1);
			}
			if (state.getValue(FACING) == EnumFacing.NORTH) {
				return new AxisAlignedBB(0, 0, 0.8125, 1, 1, 1);
			}
			if (state.getValue(FACING) == EnumFacing.SOUTH) {
				return new AxisAlignedBB(0, 0, 0, 1, 1, 0.1875);
			}
			if (state.getValue(FACING) == EnumFacing.EAST) {
				return new AxisAlignedBB(0, 0, 0, 0.1875, 1, 1);
			}
			else { //WEST
				return new AxisAlignedBB(0.8125, 0, 0, 1, 1, 1);
			}
		}

		@Override
		public Item getItemDropped(IBlockState state, Random rand, int fortune) {
			return null;
		}

		@Override
		public int getFlammability(IBlockAccess world, BlockPos pos, EnumFacing face) {
			return 0;
		}

		public int getRotation(World world, BlockPos pos) {
			int currentRotation = (int) new Object() {
				public double getValue(BlockPos pos, String tag) {
					TileEntity tileEntity = world.getTileEntity(pos);
					if (tileEntity != null)
						return tileEntity.getTileData().getInteger(tag);
					return 0;
				}
			}.getValue(pos, "rotation");
			return currentRotation;
		}

		@Override
		public boolean onBlockActivated(World worldIn, BlockPos pos, IBlockState state, EntityPlayer playerIn, EnumHand hand, EnumFacing facing, float hitX, float hitY, float hitZ) {

			if (!playerIn.capabilities.allowEdit) {
				return super.onBlockActivated(worldIn, pos, state, playerIn, hand, facing, hitX, hitY, hitZ);
			} else if (hand == EnumHand.MAIN_HAND) {
				TileEntity te = worldIn.getTileEntity(pos);
				if (te != null) {
					if (te instanceof BlockDisplayCaseMagnifying.TileEntityDisplayCase) {
						BlockDisplayCaseMagnifying.TileEntityDisplayCase tee = (BlockDisplayCaseMagnifying.TileEntityDisplayCase) te;
						ItemStack stack = playerIn.getHeldItem(EnumHand.MAIN_HAND);
						if (tee.hasItem()) {
							int newRotation = getRotation(worldIn, pos) + 15;
							if (newRotation >= 360) {
								newRotation = 0;
							}
							if (!worldIn.isRemote) {
								IBlockState _bs = worldIn.getBlockState(pos);
								tee.getTileData().setInteger("rotation", newRotation);
								worldIn.notifyBlockUpdate(pos, _bs, _bs, 3);
								SoundEvent soundevent = SoundEvents.ENTITY_ITEMFRAME_ROTATE_ITEM;
								((WorldServer) playerIn.getEntityWorld()).playSound(null, pos, soundevent, SoundCategory.BLOCKS, 1.0F, 1.0F);
							}
							return true;
						}
						if (!stack.isEmpty()) {
							if (stack.getItem() == Items.SPAWN_EGG) {
								return super.onBlockActivated(worldIn, pos, state, playerIn, hand, facing, hitX, hitY, hitZ);
							}
							//tee.setInventorySlotContents(0, stack);
							tee.getItems().set(0, new ItemStack(stack.getItem(), 1));
							if (!worldIn.isRemote) {
								SoundEvent soundevent = SoundEvents.ENTITY_ITEMFRAME_ADD_ITEM;
								((WorldServer) playerIn.getEntityWorld()).playSound(null, pos, soundevent, SoundCategory.BLOCKS, 1.0F, 1.0F);
							}
							if (!playerIn.capabilities.isCreativeMode) {
								stack.shrink(1);
							}
						}
					}
				}
				return true;
			}
			return super.onBlockActivated(worldIn, pos, state, playerIn, hand, facing, hitX, hitY, hitZ);
		}

		@Override
		public IBlockState getStateForPlacement(World worldIn, BlockPos pos, EnumFacing facing, float hitX, float hitY, float hitZ, int meta, EntityLivingBase placer) {
			//System.err.println("Placed by: " + placer);
			return this.getDefaultState().withProperty(FACING, facing);
		}

		@Override
		public IBlockState getStateFromMeta(int meta) {
			EnumFacing enumfacing = EnumFacing.byIndex(meta);
			return this.getDefaultState().withProperty(FACING, enumfacing);
		}

		@Override
		public int getMetaFromState(IBlockState state) {
			return ((EnumFacing) state.getValue(FACING)).getIndex();
		}

		@Override
		public IBlockState withRotation(IBlockState state, Rotation rot) {
			return state.withProperty(FACING, rot.rotate(state.getValue(FACING)));
		}

		@SuppressWarnings("deprecation")
		@Override
		public IBlockState withMirror(IBlockState state, Mirror mirrorIn) {
			return state.withRotation(mirrorIn.toRotation(state.getValue(FACING)));
		}

		@Override
		protected BlockStateContainer createBlockState() {
			return new BlockStateContainer(this, new IProperty[]{FACING});
		}

		@SideOnly(Side.CLIENT)
		@Override
		public BlockRenderLayer getRenderLayer() {
			return BlockRenderLayer.CUTOUT;
		}

		@Override
		public boolean canRenderInLayer(IBlockState state, BlockRenderLayer layer) {
			return layer == BlockRenderLayer.CUTOUT_MIPPED;
		}

		@Override
		public boolean doesSideBlockRendering(IBlockState state, IBlockAccess world, BlockPos pos, EnumFacing face) {
			if (face == EnumFacing.DOWN && state.getValue(FACING) == EnumFacing.UP) {
				return true;
			}
			if (face == EnumFacing.UP && state.getValue(FACING) == EnumFacing.DOWN) {
				return true;
			}
			if (face == EnumFacing.EAST && state.getValue(FACING) == EnumFacing.WEST) {
				return true;
			}
			if (face == EnumFacing.WEST && state.getValue(FACING) == EnumFacing.EAST) {
				return true;
			}
			if (face == EnumFacing.NORTH && state.getValue(FACING) == EnumFacing.SOUTH) {
				return true;
			}
			if (face == EnumFacing.SOUTH && state.getValue(FACING) == EnumFacing.NORTH) {
				return true;
			}
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
		public BlockFaceShape getBlockFaceShape(IBlockAccess worldIn, IBlockState state, BlockPos pos, EnumFacing face) {
			return BlockFaceShape.UNDEFINED;
		}

		@Override
		public void breakBlock(World world, BlockPos pos, IBlockState state) {
			TileEntity te = world.getTileEntity(pos);
			if (te != null && !world.isRemote) {
				if (te instanceof BlockDisplayCaseMagnifying.TileEntityDisplayCase) {
					BlockDisplayCaseMagnifying.TileEntityDisplayCase tee = (BlockDisplayCaseMagnifying.TileEntityDisplayCase) te;
					if (tee.hasItem()) {
						ItemStack stack = tee.getStackInSlot(0);
						Block.spawnAsEntity(world, pos, stack);
					}
				}
			}
			world.removeTileEntity(pos);
			super.breakBlock(world, pos, state);
		}

		@Override
		protected boolean canSilkHarvest() {
			return true;
		}

		@Override
		public TileEntity createNewTileEntity(World worldIn, int meta) {
			return new BlockDisplayCaseMagnifying.TileEntityDisplayCase();
		}

		@Override
		public boolean eventReceived(IBlockState state, World worldIn, BlockPos pos, int eventID, int eventParam) {
			super.eventReceived(state, worldIn, pos, eventID, eventParam);
			TileEntity tileentity = worldIn.getTileEntity(pos);
			return tileentity == null ? false : tileentity.receiveClientEvent(eventID, eventParam);
		}

		@Override
		public void onBlockAdded(World world, BlockPos pos, IBlockState state) {
			super.onBlockAdded(world, pos, state);
			if (!world.isRemote) {
				TileEntity te = world.getTileEntity(pos);
				if (te != null) {
					if (te instanceof BlockDisplayCaseMagnifying.TileEntityDisplayCase) {
						IBlockState _bs = world.getBlockState(pos);
						te.getTileData().setInteger("rotation", 0);
						world.notifyBlockUpdate(pos, _bs, _bs, 3);
					}
				}
			}
		}
	}

	public static class TileEntityDisplayCase extends TileEntityLockableLoot {

		private NonNullList<ItemStack> stacks = NonNullList.<ItemStack>withSize(1, ItemStack.EMPTY);

		@Override
		public SPacketUpdateTileEntity getUpdatePacket() {
			NBTTagCompound tag = new NBTTagCompound();
			this.writeToNBT(tag);
			return new SPacketUpdateTileEntity(pos, 1, tag);
		}

		@Override
		public void onDataPacket(NetworkManager netManager, SPacketUpdateTileEntity packet) {
			readFromNBT(packet.getNbtCompound());
		}

		public void setDisplay(ItemStack stack) {
			this.getItems().set(0,new ItemStack(stack.getItem(), 1));
		}

		@Override
		public NBTTagCompound getUpdateTag() {
			return this.writeToNBT(new NBTTagCompound());
		}

		@Override
		public void handleUpdateTag(NBTTagCompound tag) {
			this.readFromNBT(tag);
		}

		@Override
		public void readFromNBT(NBTTagCompound compound) {
			super.readFromNBT(compound);
			this.stacks = NonNullList.<ItemStack>withSize(this.getSizeInventory(), ItemStack.EMPTY);
			if (!this.checkLootAndRead(compound))
				ItemStackHelper.loadAllItems(compound, this.stacks);
		}

		@Override
		public NBTTagCompound writeToNBT(NBTTagCompound compound) {
			super.writeToNBT(compound);
			if (!this.checkLootAndWrite(compound))
				ItemStackHelper.saveAllItems(compound, this.stacks);
			return compound;
		}

		public boolean hasItem() {
			if (this.getStackInSlot(0).isEmpty()) {
				return false;
			}
			return true;
		}

		@Override
		protected NonNullList<ItemStack> getItems() {
			return this.stacks;
		}

		@Override
		public int getSizeInventory() {
			return 1;
		}

		@Override
		public boolean isEmpty() {
			for (ItemStack itemstack : this.stacks)
				if (!itemstack.isEmpty())
					return false;
			return true;
		}

		@Override
		public boolean isItemValidForSlot(int index, ItemStack stack) {
			return true;
		}

		@Override
		public ItemStack getStackInSlot(int slot) {
			return stacks.get(slot);
		}

		@Override
		public int getInventoryStackLimit() {
			return 1;
		}

		@Override
		public Container createContainer(InventoryPlayer playerInventory, EntityPlayer playerIn) {
			return null;
		}

		@Override
		public String getGuiID() {
			return null;
		}

		@Override
		public String getName() {
			return null;
		}

		@Override
		public AxisAlignedBB getRenderBoundingBox() {
			return INFINITE_EXTENT_AABB;
		}

		@Override
		public <T> T getCapability(Capability<T> capability, EnumFacing facing) {
			if (capability == CapabilityItemHandler.ITEM_HANDLER_CAPABILITY) {
				return (T) new BlockDisplayCaseMagnifying.TileEntityDisplayCase.CustomItemStackHandler();
			}
			return super.getCapability(capability, facing);
		}

		private class CustomItemStackHandler extends ItemStackHandler {

			@Override
			public boolean isItemValid(int slot, @Nonnull ItemStack stack) {
				return false;
			}

			@Nonnull
			@Override
			public ItemStack extractItem(int slot, int amount, boolean simulate) {
				return ItemStack.EMPTY;
			}
		}

	}
}