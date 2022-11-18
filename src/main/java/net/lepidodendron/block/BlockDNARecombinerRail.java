
package net.lepidodendron.block;

import net.lepidodendron.ElementsLepidodendronMod;
import net.lepidodendron.LepidodendronSorter;
import net.lepidodendron.creativetab.TabLepidodendronBuilding;
import net.lepidodendron.item.ItemDNARecombiner;
import net.lepidodendron.item.ItemPhialDNA;
import net.minecraft.block.Block;
import net.minecraft.block.BlockDirectional;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.properties.PropertyDirection;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.init.Items;
import net.minecraft.inventory.Container;
import net.minecraft.inventory.ISidedInventory;
import net.minecraft.inventory.InventoryHelper;
import net.minecraft.inventory.ItemStackHelper;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.network.NetworkManager;
import net.minecraft.network.play.server.SPacketUpdateTileEntity;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.tileentity.TileEntityLockableLoot;
import net.minecraft.util.*;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.common.capabilities.Capability;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import javax.annotation.Nullable;
import java.util.Random;

@ElementsLepidodendronMod.ModElement.Tag
public class BlockDNARecombinerRail extends ElementsLepidodendronMod.ModElement {
	@GameRegistry.ObjectHolder("lepidodendron:dna_recombiner_rail")
	public static final Block block = null;
	public BlockDNARecombinerRail(ElementsLepidodendronMod instance) {
		super(instance, LepidodendronSorter.dna_recombiner_rail);
	}

	@Override
	public void initElements() {
		elements.blocks.add(() -> new BlockCustom().setRegistryName("dna_recombiner_rail"));
		//elements.items.add(() -> new ItemBlock(block).setRegistryName(block.getRegistryName()));
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		//ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(block), 0,
		//		new ModelResourceLocation("lepidodendron:dna_recombiner_rail", "inventory"));
	}

	@Override
	public void init(FMLInitializationEvent event) {
		GameRegistry.registerTileEntity(BlockDNARecombinerRail.TileEntityDNARecombinerRail.class, "lepidodendron:tileentitydna_recombiner_rail");
	}

	public static class BlockCustom extends Block {
		public static final PropertyDirection FACING = BlockDirectional.FACING;

		public BlockCustom() {
			super(Material.IRON);
			setTranslationKey("pf_dna_recombiner_rail");
			setSoundType(SoundType.METAL);
			setHardness(5F);
			setResistance(5F);
			setLightLevel(0);
			setLightOpacity(0);
			setCreativeTab(TabLepidodendronBuilding.tab);
		}

		@Override
		public MapColor getMapColor(IBlockState state, IBlockAccess worldIn, BlockPos pos) {
			return MapColor.GRAY;
		}

		@Override
		public ItemStack getPickBlock(IBlockState state, RayTraceResult target, World world, BlockPos pos, EntityPlayer player) {
			return new ItemStack(ItemDNARecombiner.block, 1);
		}

		@Override
		public Item getItemDropped(IBlockState state, Random rand, int fortune) {
			return (new ItemStack(Items.AIR, 1).getItem());
		}

		@Override
		protected net.minecraft.block.state.BlockStateContainer createBlockState() {
			return new net.minecraft.block.state.BlockStateContainer(this, new IProperty[]{FACING});
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
		public void neighborChanged(IBlockState state, World worldIn, BlockPos pos, Block blockIn, BlockPos fromPos) {

			if (state.getValue(FACING) == EnumFacing.DOWN || state.getValue(FACING) == EnumFacing.UP) {
				super.neighborChanged(state, worldIn, pos, blockIn, fromPos);
				return;
			}

			IBlockState endState = worldIn.getBlockState(pos.offset(state.getValue(FACING).rotateY()).down());
			if (endState.getBlock() != BlockDNARecombinerCentrifuge.block) {
				worldIn.destroyBlock(pos, true);
				return;
			}
			else {
				if (endState.getValue(FACING) != state.getValue(FACING)) {
					worldIn.destroyBlock(pos, true);
					return;
				}
			}

			if (worldIn.getBlockState(pos.down()).getBlock() != BlockDNARecombinerForge.block) {
				worldIn.destroyBlock(pos, true);
				return;
			}

			super.neighborChanged(state, worldIn, pos, blockIn, fromPos);
		}

		@Override
		public boolean hasTileEntity(IBlockState state) {
			return true;
		}

		@Nullable
		@Override
		public TileEntity createTileEntity(World world, IBlockState state) {
			return new BlockDNARecombinerRail.TileEntityDNARecombinerRail();
		}

		public BlockDNARecombinerRail.TileEntityDNARecombinerRail createNewTileEntity(World worldIn, int meta) {
			return new BlockDNARecombinerRail.TileEntityDNARecombinerRail();
		}

		@Override
		public boolean eventReceived(IBlockState state, World worldIn, BlockPos pos, int eventID, int eventParam) {
			super.eventReceived(state, worldIn, pos, eventID, eventParam);
			TileEntity tileentity = worldIn.getTileEntity(pos);
			return tileentity == null ? false : tileentity.receiveClientEvent(eventID, eventParam);
		}

		@Override
		public void breakBlock(World world, BlockPos pos, IBlockState state) {
			TileEntity tileentity = world.getTileEntity(pos);
			if (tileentity != null) {
				if (tileentity instanceof BlockDNARecombinerRail.TileEntityDNARecombinerRail) {
					InventoryHelper.dropInventoryItems(world, pos, (BlockDNARecombinerRail.TileEntityDNARecombinerRail) tileentity);
				}
				world.removeTileEntity(pos);
			}
			super.breakBlock(world, pos, state);
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
		public boolean canRenderInLayer(IBlockState state, BlockRenderLayer layer) {
			return layer == BlockRenderLayer.CUTOUT_MIPPED;
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
		public boolean doesSideBlockRendering(IBlockState state, IBlockAccess world, BlockPos pos, EnumFacing face) {
			return false;
		}
	}

	public static class TileEntityDNARecombinerRail extends TileEntityLockableLoot implements ITickable, ISidedInventory {

		private NonNullList<ItemStack> stacks = NonNullList.<ItemStack>withSize(1, ItemStack.EMPTY);
		protected double clawVert;
		protected double clawHoriz;
		protected double clawAngle;
		protected double hatchVal;
		protected boolean isProcessing;
		protected int processTick;

		private int centrifugeDepth = 95;
		private int railLength = 100;

		@Override
		public AxisAlignedBB getRenderBoundingBox() {
			return new AxisAlignedBB(pos.add(-1, -1, -1), pos.add(1, 2, 1));
		}

		public boolean canStartProcess() {
			//System.err.println("canStartProcess");
			if (!isProcessing) {
				IBlockState state = this.getWorld().getBlockState(this.getPos());
				if (state.getBlock() != BlockDNARecombinerRail.block) {
					return false;
				}
				EnumFacing facing = state.getValue(BlockDNARecombinerRail.BlockCustom.FACING);
				if (facing == EnumFacing.UP || facing == EnumFacing.DOWN) {
					return false;
				}
				if (getCentrifugeSlot(facing) == -1) {
					//System.err.println("slot -1");
					return false;
				}
				//TileEntity tileEntity = this.getWorld().getTileEntity(this.getPos().down());
				//if (tileEntity != null) {
				//	if (tileEntity instanceof BlockDNARecombinerForge.TileEntityDNARecombinerForge) {
				//		BlockDNARecombinerForge.TileEntityDNARecombinerForge te = (BlockDNARecombinerForge.TileEntityDNARecombinerForge) tileEntity;
				//		if (!te.getStackInSlot(0).isEmpty()) {
				//			//System.err.println("forge phial slot full");
				//			//The phial slot in the DNA Forge is full at the moment so we can't proceed!
				//			return false;
				//		}
				//	}
				//}
				return true;
			}
			return false;
		}

		public boolean canCompleteProcess() {
			//System.err.println("canCompleteProcess");
			if (this.isProcessing) {
				IBlockState state = this.getWorld().getBlockState(this.getPos());
				if (state.getBlock() != BlockDNARecombinerRail.block) {
					return false;
				}
				EnumFacing facing = state.getValue(BlockDNARecombinerRail.BlockCustom.FACING);
				if (facing == EnumFacing.UP || facing == EnumFacing.DOWN) {
					return false;
				}
				//if (getCentrifugeSlot(facing) == -1) {
				//	//System.err.println("slot -1");
				//	return false;
				//}
				TileEntity tileEntity = this.getWorld().getTileEntity(this.getPos().down());
				if (tileEntity != null) {
					if (tileEntity instanceof BlockDNARecombinerForge.TileEntityDNARecombinerForge) {
						BlockDNARecombinerForge.TileEntityDNARecombinerForge te = (BlockDNARecombinerForge.TileEntityDNARecombinerForge) tileEntity;
						if (!te.getStackInSlot(0).isEmpty()) {
							//System.err.println("forge phial slot full");
							//The phial slot in the DNA Forge is full at the moment so we can't proceed!
							return false;
						}
					}
				}
				return true;
			}
			return false;
		}

		public int getCentrifugeSlot(EnumFacing facing) {
			TileEntity tileEntity = this.getWorld().getTileEntity(this.getPos().down().offset(facing.rotateY()));
			if (tileEntity != null) {
				if (tileEntity instanceof BlockDNARecombinerCentrifuge.TileEntityDNARecombinerCentrifuge) {
					BlockDNARecombinerCentrifuge.TileEntityDNARecombinerCentrifuge te = (BlockDNARecombinerCentrifuge.TileEntityDNARecombinerCentrifuge) tileEntity;
					//System.err.println("centrifuge isLocked " + te.isLocked());
					//System.err.println("centrifuge isProcessing " + te.isProcessing());
					if (te.isLocked() && !te.isProcessing()) {
						//The centrifuge is locked and ready:
						//Does it contain the things we want?
						if (te.getStackInSlot(0).getItem() == ItemPhialDNA.block) {
							return 0;
						}
						if (te.getStackInSlot(1).getItem() == ItemPhialDNA.block) {
							return 1;
						}
						if (te.getStackInSlot(2).getItem() == ItemPhialDNA.block) {
							return 2;
						}
						if (te.getStackInSlot(3).getItem() == ItemPhialDNA.block) {
							return 3;
						}
						//System.err.println("Nothing in centrifuge");
						te.setLocked(false); //Unlock the centrifuge as it seems there is nothing useable in it
					}
				}
			}
			return -1;
		}


		@Override
		public void update() {

			int stage2 = this.centrifugeDepth;
			int stage3 = stage2 + this.centrifugeDepth;
			int stage4 = stage3 + this.railLength;
			int stage5 = stage4 + this.centrifugeDepth + 30; //Depth of the forge holder
			int stage6 = stage5 + 30;
			int stage7 = stage6 + this.centrifugeDepth + 30; //Depth of the forge holder
			int stage8 = stage7 + this.centrifugeDepth;
			int stage9 = stage8 + this.railLength;


			if (this.getWorld().isRemote) {
				return;
			}

			//System.err.println("this.isProcessing " + this.isProcessing);
			//System.err.println("this.processTick " + this.processTick);

			if (!this.isProcessing) {
				if (this.canStartProcess()) {
					//Do stuff
					IBlockState state = this.getWorld().getBlockState(this.getPos());
					if (state.getBlock() == BlockDNARecombinerRail.block) {
						EnumFacing facing = state.getValue(BlockDNARecombinerRail.BlockCustom.FACING);
						if (!(facing == EnumFacing.UP || facing == EnumFacing.DOWN)) {
							int useSlot = getCentrifugeSlot(facing);
							TileEntity tileEntity = this.getWorld().getTileEntity(this.getPos().down().offset(facing.rotateY()));
							if (tileEntity != null) {
								if (tileEntity instanceof BlockDNARecombinerCentrifuge.TileEntityDNARecombinerCentrifuge) {
									BlockDNARecombinerCentrifuge.TileEntityDNARecombinerCentrifuge te = (BlockDNARecombinerCentrifuge.TileEntityDNARecombinerCentrifuge) tileEntity;
									if (te.isLocked() && !te.isProcessing()) {
										//Start the process off:
										this.processTick = 0;
										this.isProcessing = true;
										this.clawVert = 0;
										this.clawHoriz = 0;
									}
								}
							}
						}
					}
				}
			}
			else {
				//The rail is processing, so do the stuff:
				boolean shouldContinue = false;
				if ((this.processTick < (stage4)) || (this.processTick > (stage4))
					|| (this.processTick == (stage4) && this.canCompleteProcess())){
					shouldContinue = true;
				}

				if (shouldContinue) {
					this.processTick++;
				}

				if (this.processTick >= 0 && this.processTick < this.centrifugeDepth) {
					//The claw needs to descend first
					this.clawHoriz = 0;
					this.clawVert = this.clawVert - 0.01;
				}

				if (this.processTick > (20) && this.processTick <= (40)) {
					//Open the hatch:
					IBlockState state = this.getWorld().getBlockState(this.getPos());
					EnumFacing facing = state.getValue(BlockDNARecombinerRail.BlockCustom.FACING);
					if (!(facing == EnumFacing.UP || facing == EnumFacing.DOWN)) {
						TileEntity tileEntity = this.getWorld().getTileEntity(this.getPos().down().offset(facing.rotateY()));
						if (tileEntity != null) {
							if (tileEntity instanceof BlockDNARecombinerCentrifuge.TileEntityDNARecombinerCentrifuge) {
								BlockDNARecombinerCentrifuge.TileEntityDNARecombinerCentrifuge te = (BlockDNARecombinerCentrifuge.TileEntityDNARecombinerCentrifuge) tileEntity;
								te.setHatchVal((20D - (40D - (double) this.processTick)) / 20D);
							}
						}
					}
				}

				if (this.processTick > (this.centrifugeDepth - 30) && this.processTick < this.centrifugeDepth) {
					//Open the claw gradually on the way down near the bottom:
					this.clawHoriz = 0;
					this.clawAngle = this.processTick - (this.centrifugeDepth - 30);
				}

				if (this.processTick == this.centrifugeDepth) {
					this.clawHoriz = 0;
					//We are in extraction position for the centrifuge:
					IBlockState state = this.getWorld().getBlockState(this.getPos());
					if (state.getBlock() == BlockDNARecombinerRail.block) {
						EnumFacing facing = state.getValue(BlockDNARecombinerRail.BlockCustom.FACING);
						if (!(facing == EnumFacing.UP || facing == EnumFacing.DOWN)) {
							int useSlot = getCentrifugeSlot(facing);
							TileEntity tileEntity = this.getWorld().getTileEntity(this.getPos().down().offset(facing.rotateY()));
							if (tileEntity != null) {
								if (tileEntity instanceof BlockDNARecombinerCentrifuge.TileEntityDNARecombinerCentrifuge) {
									BlockDNARecombinerCentrifuge.TileEntityDNARecombinerCentrifuge te = (BlockDNARecombinerCentrifuge.TileEntityDNARecombinerCentrifuge) tileEntity;
									if (te.isLocked() && !te.isProcessing()) {
										ItemStack stack = te.getStackInSlot(useSlot);
										this.setInventorySlotContents(0, stack);
										te.setInventorySlotContents(useSlot, ItemStack.EMPTY);
									}
								}
							}
						}
					}
					// We have filled the claw with the phial now
				}



				double clawAngleOpen = this.clawAngle;

				if (this.processTick > (stage2) && this.processTick <= (stage2 + 5)) {
					//Close the claw quicker while stationary:
					this.clawHoriz = 0;
					this.clawAngle = ((5D - ((double)this.processTick - (double)stage2)) / 5D) * clawAngleOpen;
				}

				if (this.processTick < stage3 && this.processTick > stage2) {
					//The claw needs to ascend again
					this.clawHoriz = 0;
					this.clawVert = this.clawVert + 0.01;
				}

				if (this.processTick > (stage2 + 70) && this.processTick <= (stage2 + 90)) {
					//Close the hatch:
					IBlockState state = this.getWorld().getBlockState(this.getPos());
					EnumFacing facing = state.getValue(BlockDNARecombinerRail.BlockCustom.FACING);
					if (!(facing == EnumFacing.UP || facing == EnumFacing.DOWN)) {
						TileEntity tileEntity = this.getWorld().getTileEntity(this.getPos().down().offset(facing.rotateY()));
						if (tileEntity != null) {
							if (tileEntity instanceof BlockDNARecombinerCentrifuge.TileEntityDNARecombinerCentrifuge) {
								BlockDNARecombinerCentrifuge.TileEntityDNARecombinerCentrifuge te = (BlockDNARecombinerCentrifuge.TileEntityDNARecombinerCentrifuge) tileEntity;
								te.setHatchVal((((double)stage2 + 90D) - (double)this.processTick) / 20D);
							}
						}
					}
				}

				if (this.processTick == stage3) {
					IBlockState state = this.getWorld().getBlockState(this.getPos());
					if (state.getBlock() == BlockDNARecombinerRail.block) {
						EnumFacing facing = state.getValue(BlockDNARecombinerRail.BlockCustom.FACING);
						int n = getCentrifugeSlot(facing);
					}
				}

				if (this.processTick <= stage4 && this.processTick > stage3) {
					//Move horizontally:
					this.clawVert = 0;
					this.clawHoriz = Math.min(this.clawHoriz + 0.01, (stage4 - stage3) * 0.01);
				}

				if (this.processTick > (stage4 + 20) && this.processTick <= (stage4 + 40)) {
					//Open the hatch:
					this.hatchVal = (20D - (((double)stage4 + 40D) - (double)this.processTick)) / 20D;
				}

				if (this.processTick > (stage4 + 40)) {
					TileEntity tileEntity = this.getWorld().getTileEntity(this.getPos().down());
					if (tileEntity != null) {
						if (tileEntity instanceof BlockDNARecombinerForge.TileEntityDNARecombinerForge) {
							BlockDNARecombinerForge.TileEntityDNARecombinerForge te = (BlockDNARecombinerForge.TileEntityDNARecombinerForge) tileEntity;
							te.setHatchShut(false);
						}
					}
				}

				if (this.processTick > stage4 && this.processTick < stage5) {
					//The claw needs to descend first
					this.clawHoriz = 1;
					this.clawVert = this.clawVert - 0.01;
				}

				if (this.processTick > stage5 && this.processTick < stage6) {
					//Open the claw
					this.clawAngle = this.processTick - (stage6 - 30);
				}

				if (this.processTick == stage6) {
					//Release the phial
					IBlockState state = this.getWorld().getBlockState(this.getPos());
					if (state.getBlock() == BlockDNARecombinerRail.block) {
						TileEntity tileEntity = this.getWorld().getTileEntity(this.getPos().down());
						if (tileEntity != null) {
							if (tileEntity instanceof BlockDNARecombinerForge.TileEntityDNARecombinerForge) {
								//System.err.println("IsForge");
								BlockDNARecombinerForge.TileEntityDNARecombinerForge te = (BlockDNARecombinerForge.TileEntityDNARecombinerForge) tileEntity;
								ItemStack stack = this.getStackInSlot(0);
								this.setInventorySlotContents(0, ItemStack.EMPTY);
								te.setInventorySlotContents(0, stack);
							}
						}
					}
				}
				//We have now put the phial into the forge finally

				if (this.processTick > stage6 && this.processTick < stage7) {
					//The claw needs to ascend again
					this.clawHoriz = 1;
					this.clawVert = this.clawVert + 0.01;
				}

				if (this.processTick > (stage6 + 60) && this.processTick <= (stage6 + 80)) {
					//Close the hatch:
					this.hatchVal = (((double)stage6 + 80D) - (double)this.processTick) / 20D;
				}

				if (this.processTick > (stage6 + 80)) {
					TileEntity tileEntity = this.getWorld().getTileEntity(this.getPos().down());
					if (tileEntity != null) {
						if (tileEntity instanceof BlockDNARecombinerForge.TileEntityDNARecombinerForge) {
							BlockDNARecombinerForge.TileEntityDNARecombinerForge te = (BlockDNARecombinerForge.TileEntityDNARecombinerForge) tileEntity;
							te.setHatchShut(true);
						}
					}
				}

				clawAngleOpen = this.clawAngle;
				if (this.processTick > (stage6 + 15) && this.processTick <= (stage6 + 20)) {
					//Close the claw quicker while raising:
					this.clawAngle = ((5D - ((double)this.processTick - ((double)stage6 + 15))) / 5D) * clawAngleOpen;
				}

				if (this.processTick >= stage7 && this.processTick < stage8) {
					//Move horizontally:
					this.clawVert = 0;
					this.clawHoriz = this.clawHoriz - 0.01;
				}

				if (this.processTick >= stage8) { //Reset it all
					this.clawVert = 0;
					this.clawHoriz = 0;
					this.clawAngle = 0;
					this.hatchVal = 0;
					this.processTick = 0;
					this.isProcessing = false;
				}

			}

			markDirty();

		}

		@Override
		public int getInventoryStackLimit() {
			return 1;
		}

		public double getClawVert() {
			return this.clawVert;
		}

		public double getClawHoriz() {
			return this.clawHoriz;
		}

		public double getClawAngle() {
			return this.clawAngle;
		}

		public double getHatchVal() {
			return this.hatchVal;
		}

		public int getProcessTick() {
			return this.processTick;
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
			if (index == 1)
				return false;
			return true;
		}

		@Override
		public ItemStack getStackInSlot(int slot) {
			return stacks.get(slot);
		}

		@Override
		public String getName() {
			return "";
		}

		@Override
		public String getGuiID() {
			return null;
		}

		@Override
		public Container createContainer(InventoryPlayer playerInventory, EntityPlayer playerIn) {
			return null;
		}

		@Override
		protected NonNullList<ItemStack> getItems() {
			return this.stacks;
		}

		@Override
		public void readFromNBT(NBTTagCompound compound) {
			super.readFromNBT(compound);
			if (compound.hasKey("clawVert")) {
				this.clawVert = compound.getDouble("clawVert");
			}
			if (compound.hasKey("clawHoriz")) {
				this.clawHoriz = compound.getDouble("clawHoriz");
			}
			if (compound.hasKey("clawAngle")) {
				this.clawAngle = compound.getDouble("clawAngle");
			}
			if (compound.hasKey("hatchVal")) {
				this.hatchVal = compound.getDouble("hatchVal");
			}
			if (compound.hasKey("isProcessing")) {
				this.isProcessing = compound.getBoolean("isProcessing");
			}
			if (compound.hasKey("processTick")) {
				this.processTick = compound.getInteger("processTick");
			}
			this.stacks = NonNullList.<ItemStack>withSize(this.getSizeInventory(), ItemStack.EMPTY);
			if (!this.checkLootAndRead(compound)) {
				ItemStackHelper.loadAllItems(compound, this.stacks);
			}
		}

		@Override
		public NBTTagCompound writeToNBT(NBTTagCompound compound) {
			super.writeToNBT(compound);
			compound.setDouble("clawVert", this.clawVert);
			compound.setDouble("clawHoriz", this.clawHoriz);
			compound.setDouble("clawAngle", this.clawAngle);
			compound.setDouble("hatchVal", this.hatchVal);
			compound.setBoolean("isProcessing", this.isProcessing);
			compound.setInteger("processTick", this.processTick);
			if (!this.checkLootAndWrite(compound)) {
				ItemStackHelper.saveAllItems(compound, this.stacks);
			}
			return compound;
		}

		private void notifyBlockUpdate() {
			this.getWorld().notifyNeighborsOfStateChange(this.getPos(), this.getBlockType(), true);
			this.getWorld().notifyBlockUpdate(this.getPos(), this.getWorld().getBlockState(this.getPos()), this.getWorld().getBlockState(this.getPos()), 3);
			this.getWorld().markBlockRangeForRenderUpdate(this.getPos(), this.getPos());
		}

		@Override
		public void markDirty() {
			super.markDirty();
			notifyBlockUpdate();
		}

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
			this.getWorld().markBlockRangeForRenderUpdate(this.pos, this.pos);
		}

		@Override
		public void handleUpdateTag(NBTTagCompound tag) {
			this.readFromNBT(tag);
		}

		@Override
		public int[] getSlotsForFace(EnumFacing side) {
			return new int[0];
		}

		@Override
		public boolean canInsertItem(int index, ItemStack itemStackIn, EnumFacing direction) {
			return false;
		}

		@Override
		public boolean canExtractItem(int index, ItemStack stack, EnumFacing direction) {
			return false;
		}

		net.minecraftforge.items.IItemHandler handlerUp = new net.minecraftforge.items.wrapper.SidedInvWrapper(this, EnumFacing.UP);
		net.minecraftforge.items.IItemHandler handlerDown = new net.minecraftforge.items.wrapper.SidedInvWrapper(this, EnumFacing.DOWN);
		net.minecraftforge.items.IItemHandler handlerNorth = new net.minecraftforge.items.wrapper.SidedInvWrapper(this, EnumFacing.NORTH);
		net.minecraftforge.items.IItemHandler handlerSouth = new net.minecraftforge.items.wrapper.SidedInvWrapper(this, EnumFacing.SOUTH);
		net.minecraftforge.items.IItemHandler handlerEast = new net.minecraftforge.items.wrapper.SidedInvWrapper(this, EnumFacing.EAST);
		net.minecraftforge.items.IItemHandler handlerWest = new net.minecraftforge.items.wrapper.SidedInvWrapper(this, EnumFacing.WEST);

		@Nullable
		@Override
		public <T> T getCapability(Capability<T> capability, @Nullable EnumFacing facing) {
			if (facing != null && capability == net.minecraftforge.items.CapabilityItemHandler.ITEM_HANDLER_CAPABILITY) {
				if (facing == EnumFacing.UP) {
					return (T) handlerUp;
				}
				if (facing == EnumFacing.DOWN) {
					return (T) handlerDown;
				}
				if (facing == EnumFacing.NORTH) {
					return (T) handlerNorth;
				}
				if (facing == EnumFacing.SOUTH) {
					return (T) handlerSouth;
				}
				if (facing == EnumFacing.EAST) {
					return (T) handlerEast;
				}
				if (facing == EnumFacing.WEST) {
					return (T) handlerWest;
				}

			}
			return super.getCapability(capability, facing);
		}

	}
}