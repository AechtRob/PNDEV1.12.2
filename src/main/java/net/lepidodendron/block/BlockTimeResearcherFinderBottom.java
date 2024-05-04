
package net.lepidodendron.block;

import net.lepidodendron.ElementsLepidodendronMod;
import net.lepidodendron.LepidodendronConfig;
import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.LepidodendronSorter;
import net.lepidodendron.creativetab.TabLepidodendronBuilding;
import net.lepidodendron.gui.GUITimeResearcherFinder;
import net.lepidodendron.item.*;
import net.lepidodendron.util.AcidBathOutputMobs;
import net.lepidodendron.util.AcidBathOutputPlants;
import net.lepidodendron.util.AcidBathOutputStatics;
import net.lepidodendron.util.BlockSounds;
import net.minecraft.block.Block;
import net.minecraft.block.BlockDirectional;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.properties.PropertyDirection;
import net.minecraft.block.state.BlockFaceShape;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
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
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.common.capabilities.Capability;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import javax.annotation.Nullable;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

@ElementsLepidodendronMod.ModElement.Tag
public class BlockTimeResearcherFinderBottom extends ElementsLepidodendronMod.ModElement {
	@GameRegistry.ObjectHolder("lepidodendron:time_researcher_finder_bottom")
	public static final Block block = null;

	public BlockTimeResearcherFinderBottom(ElementsLepidodendronMod instance) {
		super(instance, LepidodendronSorter.time_researcher);
	}

	@Override
	public void initElements() {
		elements.blocks.add(() -> new BlockCustom().setRegistryName("time_researcher_finder_bottom"));
		//elements.items.add(() -> new ItemBlock(block).setRegistryName(block.getRegistryName()));
	}

	@Override
	public void init(FMLInitializationEvent event) {
		GameRegistry.registerTileEntity(TileEntityTimeResearcherFinderBottom.class, "lepidodendron:tileentitytime_researcher_finder_bottom");
	}

//	@SideOnly(Side.CLIENT)
//	@Override
//	public void registerModels(ModelRegistryEvent event) {
//		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(block), 0,
//				new ModelResourceLocation("lepidodendron:time_researcher_finder_bottom", "inventory"));
//	}

	public static class BlockCustom extends Block {
		public static final PropertyDirection FACING = BlockDirectional.FACING;

		public BlockCustom() {
			super(Material.IRON);
			setTranslationKey("pf_time_researcher_finder_bottom");
			setSoundType(SoundType.METAL);
			setHardness(1F);
			setResistance(1F);
			setLightLevel(0F);
			setLightOpacity(0);
			setCreativeTab(TabLepidodendronBuilding.tab);
			this.setDefaultState(this.blockState.getBaseState().withProperty(FACING, EnumFacing.NORTH));
		}

		@Override
		public boolean hasTileEntity(IBlockState state) {
			return true;
		}

		@Nullable
		@Override
		public TileEntity createTileEntity(World world, IBlockState state) {
			return new BlockTimeResearcherFinderBottom.TileEntityTimeResearcherFinderBottom();
		}

		public BlockTimeResearcherFinderBottom.TileEntityTimeResearcherFinderBottom createNewTileEntity(World worldIn, int meta) {
			return new BlockTimeResearcherFinderBottom.TileEntityTimeResearcherFinderBottom();
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
				if (tileentity instanceof BlockTimeResearcherFinderBottom.TileEntityTimeResearcherFinderBottom) {
					InventoryHelper.dropInventoryItems(world, pos, (BlockTimeResearcherFinderBottom.TileEntityTimeResearcherFinderBottom) tileentity);
				}
				world.removeTileEntity(pos);
			}
			super.breakBlock(world, pos, state);
		}

		@Override
		public MapColor getMapColor(IBlockState state, IBlockAccess worldIn, BlockPos pos) {
			return MapColor.GRAY;
		}


		@Override
		public boolean onBlockActivated(World world, BlockPos pos, IBlockState state, EntityPlayer entity, EnumHand hand, EnumFacing direction, float hitX, float hitY, float hitZ) {
			super.onBlockActivated(world, pos, state, entity, hand, direction, hitX, hitY, hitZ);
			if (entity instanceof EntityPlayer) {
				((EntityPlayer) entity).openGui(LepidodendronMod.instance, GUITimeResearcherFinder.GUIID, world, pos.getX(), pos.getY(), pos.getZ());
			}
			return true;
		}

		@Override
		public Item getItemDropped(IBlockState state, Random rand, int fortune) {
			return (new ItemStack(this, 1).getItem());
		}

		@Override
		public EnumBlockRenderType getRenderType(IBlockState state) {
			return EnumBlockRenderType.MODEL;
		}

		@SideOnly(Side.CLIENT)
		@Override
		public BlockRenderLayer getRenderLayer() {
			return BlockRenderLayer.CUTOUT;
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
		public IBlockState getStateForPlacement(World worldIn, BlockPos pos, EnumFacing facing, float hitX, float hitY, float hitZ, int meta, EntityLivingBase placer) {
			return this.getDefaultState().withProperty(FACING, placer.getHorizontalFacing().getOpposite());
		}

		@Override
		public boolean isOpaqueCube(IBlockState state) {
			return false;
		}

		@Override
		public boolean isFullCube(IBlockState state) {
			return false;
		}

		@Override
		public int getMetaFromState(IBlockState state) {
			return ((EnumFacing) state.getValue(FACING)).getIndex();
		}

		@Override
		public boolean doesSideBlockRendering(IBlockState state, IBlockAccess world, BlockPos pos, EnumFacing face) {
			return false;
		}

		@Override
		protected net.minecraft.block.state.BlockStateContainer createBlockState() {
			return new net.minecraft.block.state.BlockStateContainer(this, new IProperty[]{FACING});
		}

		@Override
		public void neighborChanged(IBlockState state, World worldIn, BlockPos pos, Block blockIn, BlockPos fromPos) {
			
			if (worldIn.getBlockState(pos.offset(state.getValue(FACING).rotateY())).getBlock() != BlockTimeResearcherDispenser.block) {
				worldIn.destroyBlock(pos, false);
				return;
			}
			if (worldIn.getBlockState(pos.up()).getBlock() != BlockTimeResearcherFinderTop.block) {
				worldIn.destroyBlock(pos, false);
				return;
			}

			super.neighborChanged(state, worldIn, pos, blockIn, fromPos);
		}

		@Override
		public boolean canRenderInLayer(IBlockState state, BlockRenderLayer layer) {
			return layer == BlockRenderLayer.CUTOUT_MIPPED;
		}
		
		@Override
		public BlockFaceShape getBlockFaceShape(IBlockAccess worldIn, IBlockState state, BlockPos pos, EnumFacing face) {
			if (face == EnumFacing.DOWN) {
				return BlockFaceShape.SOLID;
			}
			return BlockFaceShape.UNDEFINED;
		}

	}

	public static class TileEntityTimeResearcherFinderBottom extends TileEntityLockableLoot implements ITickable, ISidedInventory {
		private NonNullList<ItemStack> forgeContents = NonNullList.<ItemStack>withSize(6, ItemStack.EMPTY);

		protected String selectedLife;
		protected int trayheight;
		protected boolean isProcessing;
		public int processTick;
		private int minEnergyNeeded = 100;
		private int trayLiftTickTime = 120; //6 seconds to move the tray
		private int processTickTime = 480; //24 seconds to process the tray fully

		public String getSelectedLife() {
			if (this.selectedLife == null) {
				this.selectedLife = "";
			}
			return this.selectedLife;
		}

		public void setSelectedLife(String string) {
			this.selectedLife = string;
		}

		@Nullable
		public BlockPos getResearcherPos() {
			EnumFacing facing = world.getBlockState(this.getPos()).getValue(BlockDNARecombinerForge.BlockCustom.FACING);
			if (facing != EnumFacing.DOWN && facing != EnumFacing.UP) {
				return pos.up().offset(facing.rotateY());
			}
			return null;
		}
		
		public boolean isEmpty()
		{
			for (ItemStack itemstack : this.forgeContents)
			{
				if (!itemstack.isEmpty())
				{
					return false;
				}
			}

			return true;
		}

		public boolean canStartProcess() {

			if (LepidodendronConfig.machinesRF) {
				BlockPos researcherPos = getResearcherPos();
				if (researcherPos != null) {
					TileEntity tileEntity = world.getTileEntity(researcherPos);
					if (tileEntity != null) {
						if (tileEntity instanceof BlockTimeResearcher.TileEntityTimeResearcher) {
							BlockTimeResearcher.TileEntityTimeResearcher timeResearcher = (BlockTimeResearcher.TileEntityTimeResearcher) tileEntity;
							if (!timeResearcher.hasEnergy(minEnergyNeeded)) {
								return false;
							}
						}
					}
				}
				else {
					return false;
				}
			}

			if ((!this.isProcessing)
					&& this.isItemValidForSlot(0, this.getStackInSlot(0))
					&& (this.getStackInSlot(1).isEmpty())
			) {
				return true;
			}
			return false;
		}

		@Override
		public void update() {

			if (this.getWorld().isRemote) {
				return;
			}

			boolean updated = false;

			if (this.canStartProcess()) {
				this.isProcessing = true;
				this.processTick = 0;
				ItemStack stack = this.getStackInSlot(0).copy();
				stack.setCount(1);
				this.setInventorySlotContents(1, stack);
				this.getStackInSlot(0).shrink(1);

				updated = true;
				//System.err.println("Process started");
			}

			TileEntity tileEntity = world.getTileEntity(getResearcherPos());

			if (this.isProcessing) { //We will allow the machine to run a full cycle even if the power runs out :)
				this.processTick ++;
				if (tileEntity != null) {
					if (tileEntity instanceof BlockTimeResearcher.TileEntityTimeResearcher) {
						BlockTimeResearcher.TileEntityTimeResearcher timeResearcher = (BlockTimeResearcher.TileEntityTimeResearcher) tileEntity;
						timeResearcher.drainEnergy(100);
					}
				}
				updated = true;
			}

			boolean hasEnergy = true;
			if (tileEntity != null) {
				if (tileEntity instanceof BlockTimeResearcher.TileEntityTimeResearcher) {
					BlockTimeResearcher.TileEntityTimeResearcher timeResearcher = (BlockTimeResearcher.TileEntityTimeResearcher) tileEntity;
					hasEnergy = timeResearcher.hasEnergy(minEnergyNeeded);
				}
			}

			if (this.isProcessing && this.processTick < this.processTickTime && hasEnergy) {
				this.processTick++;
				//this.drainEnergy(10);
				if (this.processTick <= this.trayLiftTickTime) {
					this.trayheight++;
				} else if (this.processTick >= (this.processTickTime - this.trayLiftTickTime)) {
					this.trayheight--;
				} else {
					if (this.getWorld().rand.nextInt(10) == 0) {
						world.playSound(null, pos, BlockSounds.TIME_RESEARCHER_LASER, SoundCategory.BLOCKS, 0.25F, 1.0F + ((this.getWorld().rand.nextFloat() - this.getWorld().rand.nextFloat()) * 0.5F));
					}
					//this.getWorld().notifyBlockUpdate(this.getPos(), this.getWorld().getBlockState(this.getPos()), this.getWorld().getBlockState(this.getPos()), 3);
				}
				if (tileEntity != null) {
					if (tileEntity instanceof BlockTimeResearcher.TileEntityTimeResearcher) {
						BlockTimeResearcher.TileEntityTimeResearcher timeResearcher = (BlockTimeResearcher.TileEntityTimeResearcher) tileEntity;
						timeResearcher.drainEnergy(10);
					}
				}
				updated = true;
			}

			if (this.isProcessing && this.processTick == (this.processTickTime - this.trayLiftTickTime)) {
				//Give the processed block now:
				if (!getStackInSlot(1).isEmpty()) {
					ItemStack result = ItemStack.EMPTY;
					if (this.getStackInSlot(1).getItem() == Item.getItemFromBlock(BlockFossilPrecambrian.block)) {
						result = new ItemStack(ItemFossilPrecambrian.block, 1);
						if (tileEntity != null) {
							if (tileEntity instanceof BlockTimeResearcher.TileEntityTimeResearcher) {
								BlockTimeResearcher.TileEntityTimeResearcher timeResearcher = (BlockTimeResearcher.TileEntityTimeResearcher) tileEntity;
								if (Math.pow(timeResearcher.getResearchPercent(1), 2) >= Math.pow(world.rand.nextFloat() * 4, 2)) {
									boolean found = false;
									String[] resLoc = AcidBathOutputMobs.getPrecambrianCleanedFossilsMobs();
									List<String> strings = Arrays.asList(resLoc);
									if (strings.contains(this.getSelectedLife())) {
										result = new ItemStack(ItemFossilClean.block, 1);
										NBTTagCompound plantNBT = new NBTTagCompound();
										plantNBT.setString("id", this.getSelectedLife());
										NBTTagCompound stackNBT = new NBTTagCompound();
										stackNBT.setTag("PFMob", plantNBT);
										result.setTagCompound(stackNBT);
										found = true;
									}
									if (!found) {
										resLoc = AcidBathOutputPlants.getPrecambrianCleanedFossilsPlants();
										strings = Arrays.asList(resLoc);
										if (strings.contains(this.getSelectedLife())) {
											result = new ItemStack(ItemFossilClean.block, 1);
											NBTTagCompound plantNBT = new NBTTagCompound();
											plantNBT.setString("id", this.getSelectedLife());
											NBTTagCompound stackNBT = new NBTTagCompound();
											stackNBT.setTag("PFPlant", plantNBT);
											result.setTagCompound(stackNBT);
											found = true;
										}
									}
									if (!found) {
										resLoc = AcidBathOutputStatics.getPrecambrianCleanedFossilsStatics();
										strings = Arrays.asList(resLoc);
										if (strings.contains(this.getSelectedLife())) {
											result = new ItemStack(ItemFossilClean.block, 1);
											NBTTagCompound plantNBT = new NBTTagCompound();
											plantNBT.setString("id", this.getSelectedLife());
											NBTTagCompound stackNBT = new NBTTagCompound();
											stackNBT.setTag("PFStatic", plantNBT);
											result.setTagCompound(stackNBT);
										}
									}
								}
							}
						}
					}
					else if (this.getStackInSlot(1).getItem() == Item.getItemFromBlock(BlockFossilCambrian.block)) {
						result = new ItemStack(ItemFossilCambrian.block, 1);
						if (tileEntity != null) {
							if (tileEntity instanceof BlockTimeResearcher.TileEntityTimeResearcher) {
								BlockTimeResearcher.TileEntityTimeResearcher timeResearcher = (BlockTimeResearcher.TileEntityTimeResearcher) tileEntity;
								if (Math.pow(timeResearcher.getResearchPercent(2), 2) >= Math.pow(world.rand.nextFloat() * 4, 2)) {
									boolean found = false;
									String[] resLoc = AcidBathOutputMobs.getCambrianCleanedFossilsMobs();
									List<String> strings = Arrays.asList(resLoc);
									if (strings.contains(this.getSelectedLife())) {
										result = new ItemStack(ItemFossilClean.block, 1);
										NBTTagCompound plantNBT = new NBTTagCompound();
										plantNBT.setString("id", this.getSelectedLife());
										NBTTagCompound stackNBT = new NBTTagCompound();
										stackNBT.setTag("PFMob", plantNBT);
										result.setTagCompound(stackNBT);
										found = true;
									}
									if (!found) {
										resLoc = AcidBathOutputPlants.getCambrianCleanedFossilsPlants();
										strings = Arrays.asList(resLoc);
										if (strings.contains(this.getSelectedLife())) {
											result = new ItemStack(ItemFossilClean.block, 1);
											NBTTagCompound plantNBT = new NBTTagCompound();
											plantNBT.setString("id", this.getSelectedLife());
											NBTTagCompound stackNBT = new NBTTagCompound();
											stackNBT.setTag("PFPlant", plantNBT);
											result.setTagCompound(stackNBT);
											found = true;
										}
									}
									if (!found) {
										resLoc = AcidBathOutputStatics.getCambrianCleanedFossilsStatics();
										strings = Arrays.asList(resLoc);
										if (strings.contains(this.getSelectedLife())) {
											result = new ItemStack(ItemFossilClean.block, 1);
											NBTTagCompound plantNBT = new NBTTagCompound();
											plantNBT.setString("id", this.getSelectedLife());
											NBTTagCompound stackNBT = new NBTTagCompound();
											stackNBT.setTag("PFStatic", plantNBT);
											result.setTagCompound(stackNBT);
										}
									}
								}
							}
						}
					}
					else if (this.getStackInSlot(1).getItem() == Item.getItemFromBlock(BlockFossilOrdovician.block)) {
						result = new ItemStack(ItemFossilOrdovician.block, 1);
						if (tileEntity != null) {
							if (tileEntity instanceof BlockTimeResearcher.TileEntityTimeResearcher) {
								BlockTimeResearcher.TileEntityTimeResearcher timeResearcher = (BlockTimeResearcher.TileEntityTimeResearcher) tileEntity;
								if (Math.pow(timeResearcher.getResearchPercent(3), 2) >= Math.pow(world.rand.nextFloat() * 4, 2)) {
									boolean found = false;
									String[] resLoc = AcidBathOutputMobs.getOrdovicianCleanedFossilsMobs();
									List<String> strings = Arrays.asList(resLoc);
									if (strings.contains(this.getSelectedLife())) {
										result = new ItemStack(ItemFossilClean.block, 1);
										NBTTagCompound plantNBT = new NBTTagCompound();
										plantNBT.setString("id", this.getSelectedLife());
										NBTTagCompound stackNBT = new NBTTagCompound();
										stackNBT.setTag("PFMob", plantNBT);
										result.setTagCompound(stackNBT);
										found = true;
									}
									if (!found) {
										resLoc = AcidBathOutputPlants.getOrdovicianCleanedFossilsPlants();
										strings = Arrays.asList(resLoc);
										if (strings.contains(this.getSelectedLife())) {
											result = new ItemStack(ItemFossilClean.block, 1);
											NBTTagCompound plantNBT = new NBTTagCompound();
											plantNBT.setString("id", this.getSelectedLife());
											NBTTagCompound stackNBT = new NBTTagCompound();
											stackNBT.setTag("PFPlant", plantNBT);
											result.setTagCompound(stackNBT);
											found = true;
										}
									}
									if (!found) {
										resLoc = AcidBathOutputStatics.getOrdovicianCleanedFossilsStatics();
										strings = Arrays.asList(resLoc);
										if (strings.contains(this.getSelectedLife())) {
											result = new ItemStack(ItemFossilClean.block, 1);
											NBTTagCompound plantNBT = new NBTTagCompound();
											plantNBT.setString("id", this.getSelectedLife());
											NBTTagCompound stackNBT = new NBTTagCompound();
											stackNBT.setTag("PFStatic", plantNBT);
											result.setTagCompound(stackNBT);
										}
									}
								}
							}
						}
					}
					else if (this.getStackInSlot(1).getItem() == Item.getItemFromBlock(BlockFossilSilurian.block)) {
						result = new ItemStack(ItemFossilSilurian.block, 1);
						if (tileEntity != null) {
							if (tileEntity instanceof BlockTimeResearcher.TileEntityTimeResearcher) {
								BlockTimeResearcher.TileEntityTimeResearcher timeResearcher = (BlockTimeResearcher.TileEntityTimeResearcher) tileEntity;
								if (Math.pow(timeResearcher.getResearchPercent(4), 2) >= Math.pow(world.rand.nextFloat() * 4, 2)) {
									boolean found = false;
									String[] resLoc = AcidBathOutputMobs.getSilurianCleanedFossilsMobs();
									List<String> strings = Arrays.asList(resLoc);
									if (strings.contains(this.getSelectedLife())) {
										result = new ItemStack(ItemFossilClean.block, 1);
										NBTTagCompound plantNBT = new NBTTagCompound();
										plantNBT.setString("id", this.getSelectedLife());
										NBTTagCompound stackNBT = new NBTTagCompound();
										stackNBT.setTag("PFMob", plantNBT);
										result.setTagCompound(stackNBT);
										found = true;
									}
									if (!found) {
										resLoc = AcidBathOutputPlants.getSilurianCleanedFossilsPlants();
										strings = Arrays.asList(resLoc);
										if (strings.contains(this.getSelectedLife())) {
											result = new ItemStack(ItemFossilClean.block, 1);
											NBTTagCompound plantNBT = new NBTTagCompound();
											plantNBT.setString("id", this.getSelectedLife());
											NBTTagCompound stackNBT = new NBTTagCompound();
											stackNBT.setTag("PFPlant", plantNBT);
											result.setTagCompound(stackNBT);
											found = true;
										}
									}
									if (!found) {
										resLoc = AcidBathOutputStatics.getSilurianCleanedFossilsStatics();
										strings = Arrays.asList(resLoc);
										if (strings.contains(this.getSelectedLife())) {
											result = new ItemStack(ItemFossilClean.block, 1);
											NBTTagCompound plantNBT = new NBTTagCompound();
											plantNBT.setString("id", this.getSelectedLife());
											NBTTagCompound stackNBT = new NBTTagCompound();
											stackNBT.setTag("PFStatic", plantNBT);
											result.setTagCompound(stackNBT);
										}
									}
								}
							}
						}
					}
					else if (this.getStackInSlot(1).getItem() == Item.getItemFromBlock(BlockFossilDevonian.block)) {
						result = new ItemStack(ItemFossilDevonian.block, 1);
						if (tileEntity != null) {
							if (tileEntity instanceof BlockTimeResearcher.TileEntityTimeResearcher) {
								BlockTimeResearcher.TileEntityTimeResearcher timeResearcher = (BlockTimeResearcher.TileEntityTimeResearcher) tileEntity;
								if (Math.pow(timeResearcher.getResearchPercent(5), 2) >= Math.pow(world.rand.nextFloat() * 4, 2)) {
									boolean found = false;
									String[] resLoc = AcidBathOutputMobs.getDevonianCleanedFossilsMobs();
									List<String> strings = Arrays.asList(resLoc);
									if (strings.contains(this.getSelectedLife())) {
										result = new ItemStack(ItemFossilClean.block, 1);
										NBTTagCompound plantNBT = new NBTTagCompound();
										plantNBT.setString("id", this.getSelectedLife());
										NBTTagCompound stackNBT = new NBTTagCompound();
										stackNBT.setTag("PFMob", plantNBT);
										result.setTagCompound(stackNBT);
										found = true;
									}
									if (!found) {
										resLoc = AcidBathOutputPlants.getDevonianCleanedFossilsPlants();
										strings = Arrays.asList(resLoc);
										if (strings.contains(this.getSelectedLife())) {
											result = new ItemStack(ItemFossilClean.block, 1);
											NBTTagCompound plantNBT = new NBTTagCompound();
											plantNBT.setString("id", this.getSelectedLife());
											NBTTagCompound stackNBT = new NBTTagCompound();
											stackNBT.setTag("PFPlant", plantNBT);
											result.setTagCompound(stackNBT);
											found = true;
										}
									}
									if (!found) {
										resLoc = AcidBathOutputStatics.getDevonianCleanedFossilsStatics();
										strings = Arrays.asList(resLoc);
										if (strings.contains(this.getSelectedLife())) {
											result = new ItemStack(ItemFossilClean.block, 1);
											NBTTagCompound plantNBT = new NBTTagCompound();
											plantNBT.setString("id", this.getSelectedLife());
											NBTTagCompound stackNBT = new NBTTagCompound();
											stackNBT.setTag("PFStatic", plantNBT);
											result.setTagCompound(stackNBT);
										}
									}
								}
							}
						}
					}
					else if (this.getStackInSlot(1).getItem() == Item.getItemFromBlock(BlockFossilCarboniferous.block)) {
						result = new ItemStack(ItemFossilCarboniferous.block, 1);
						if (tileEntity != null) {
							if (tileEntity instanceof BlockTimeResearcher.TileEntityTimeResearcher) {
								BlockTimeResearcher.TileEntityTimeResearcher timeResearcher = (BlockTimeResearcher.TileEntityTimeResearcher) tileEntity;
								if (Math.pow(timeResearcher.getResearchPercent(6), 2) >= Math.pow(world.rand.nextFloat() * 4, 2)) {
									boolean found = false;
									String[] resLoc = AcidBathOutputMobs.getCarboniferousCleanedFossilsMobs();
									List<String> strings = Arrays.asList(resLoc);
									if (strings.contains(this.getSelectedLife())) {
										result = new ItemStack(ItemFossilClean.block, 1);
										NBTTagCompound plantNBT = new NBTTagCompound();
										plantNBT.setString("id", this.getSelectedLife());
										NBTTagCompound stackNBT = new NBTTagCompound();
										stackNBT.setTag("PFMob", plantNBT);
										result.setTagCompound(stackNBT);
										found = true;
									}
									if (!found) {
										resLoc = AcidBathOutputPlants.getCarboniferousCleanedFossilsPlants();
										strings = Arrays.asList(resLoc);
										if (strings.contains(this.getSelectedLife())) {
											result = new ItemStack(ItemFossilClean.block, 1);
											NBTTagCompound plantNBT = new NBTTagCompound();
											plantNBT.setString("id", this.getSelectedLife());
											NBTTagCompound stackNBT = new NBTTagCompound();
											stackNBT.setTag("PFPlant", plantNBT);
											result.setTagCompound(stackNBT);
											found = true;
										}
									}
									if (!found) {
										resLoc = AcidBathOutputStatics.getCarboniferousCleanedFossilsStatics();
										strings = Arrays.asList(resLoc);
										if (strings.contains(this.getSelectedLife())) {
											result = new ItemStack(ItemFossilClean.block, 1);
											NBTTagCompound plantNBT = new NBTTagCompound();
											plantNBT.setString("id", this.getSelectedLife());
											NBTTagCompound stackNBT = new NBTTagCompound();
											stackNBT.setTag("PFStatic", plantNBT);
											result.setTagCompound(stackNBT);
										}
									}
								}
							}
						}
					}
					else if (this.getStackInSlot(1).getItem() == Item.getItemFromBlock(BlockFossilPermian.block)) {
						result = new ItemStack(ItemFossilPermian.block, 1);
						if (tileEntity != null) {
							if (tileEntity instanceof BlockTimeResearcher.TileEntityTimeResearcher) {
								BlockTimeResearcher.TileEntityTimeResearcher timeResearcher = (BlockTimeResearcher.TileEntityTimeResearcher) tileEntity;
								if (Math.pow(timeResearcher.getResearchPercent(7), 2) >= Math.pow(world.rand.nextFloat() * 4, 2)) {
									boolean found = false;
									String[] resLoc = AcidBathOutputMobs.getPermianCleanedFossilsMobs();
									List<String> strings = Arrays.asList(resLoc);
									if (strings.contains(this.getSelectedLife())) {
										result = new ItemStack(ItemFossilClean.block, 1);
										NBTTagCompound plantNBT = new NBTTagCompound();
										plantNBT.setString("id", this.getSelectedLife());
										NBTTagCompound stackNBT = new NBTTagCompound();
										stackNBT.setTag("PFMob", plantNBT);
										result.setTagCompound(stackNBT);
										found = true;
									}
									if (!found) {
										resLoc = AcidBathOutputPlants.getPermianCleanedFossilsPlants();
										strings = Arrays.asList(resLoc);
										if (strings.contains(this.getSelectedLife())) {
											result = new ItemStack(ItemFossilClean.block, 1);
											NBTTagCompound plantNBT = new NBTTagCompound();
											plantNBT.setString("id", this.getSelectedLife());
											NBTTagCompound stackNBT = new NBTTagCompound();
											stackNBT.setTag("PFPlant", plantNBT);
											result.setTagCompound(stackNBT);
											found = true;
										}
									}
									if (!found) {
										resLoc = AcidBathOutputStatics.getPermianCleanedFossilsStatics();
										strings = Arrays.asList(resLoc);
										if (strings.contains(this.getSelectedLife())) {
											result = new ItemStack(ItemFossilClean.block, 1);
											NBTTagCompound plantNBT = new NBTTagCompound();
											plantNBT.setString("id", this.getSelectedLife());
											NBTTagCompound stackNBT = new NBTTagCompound();
											stackNBT.setTag("PFStatic", plantNBT);
											result.setTagCompound(stackNBT);
										}
									}
								}
							}
						}
					}
					else if (this.getStackInSlot(1).getItem() == Item.getItemFromBlock(BlockFossilTriassic.block)) {
						result = new ItemStack(ItemFossilTriassic.block, 1);
						if (tileEntity != null) {
							if (tileEntity instanceof BlockTimeResearcher.TileEntityTimeResearcher) {
								BlockTimeResearcher.TileEntityTimeResearcher timeResearcher = (BlockTimeResearcher.TileEntityTimeResearcher) tileEntity;
								if (Math.pow(timeResearcher.getResearchPercent(8), 2) >= Math.pow(world.rand.nextFloat() * 4, 2)) {
									boolean found = false;
									String[] resLoc = AcidBathOutputMobs.getTriassicCleanedFossilsMobs();
									List<String> strings = Arrays.asList(resLoc);
									if (strings.contains(this.getSelectedLife())) {
										result = new ItemStack(ItemFossilClean.block, 1);
										NBTTagCompound plantNBT = new NBTTagCompound();
										plantNBT.setString("id", this.getSelectedLife());
										NBTTagCompound stackNBT = new NBTTagCompound();
										stackNBT.setTag("PFMob", plantNBT);
										result.setTagCompound(stackNBT);
										found = true;
									}
									if (!found) {
										resLoc = AcidBathOutputPlants.getTriassicCleanedFossilsPlants();
										strings = Arrays.asList(resLoc);
										if (strings.contains(this.getSelectedLife())) {
											result = new ItemStack(ItemFossilClean.block, 1);
											NBTTagCompound plantNBT = new NBTTagCompound();
											plantNBT.setString("id", this.getSelectedLife());
											NBTTagCompound stackNBT = new NBTTagCompound();
											stackNBT.setTag("PFPlant", plantNBT);
											result.setTagCompound(stackNBT);
											found = true;
										}
									}
									if (!found) {
										resLoc = AcidBathOutputStatics.getTriassicCleanedFossilsStatics();
										strings = Arrays.asList(resLoc);
										if (strings.contains(this.getSelectedLife())) {
											result = new ItemStack(ItemFossilClean.block, 1);
											NBTTagCompound plantNBT = new NBTTagCompound();
											plantNBT.setString("id", this.getSelectedLife());
											NBTTagCompound stackNBT = new NBTTagCompound();
											stackNBT.setTag("PFStatic", plantNBT);
											result.setTagCompound(stackNBT);
										}
									}
								}
							}
						}
					}
					else if (this.getStackInSlot(1).getItem() == Item.getItemFromBlock(BlockFossilJurassic.block)) {
						result = new ItemStack(ItemFossilJurassic.block, 1);
						if (tileEntity != null) {
							if (tileEntity instanceof BlockTimeResearcher.TileEntityTimeResearcher) {
								BlockTimeResearcher.TileEntityTimeResearcher timeResearcher = (BlockTimeResearcher.TileEntityTimeResearcher) tileEntity;
								if (Math.pow(timeResearcher.getResearchPercent(9), 2) >= Math.pow(world.rand.nextFloat() * 4, 2)) {
									boolean found = false;
									String[] resLoc = AcidBathOutputMobs.getJurassicCleanedFossilsMobs();
									List<String> strings = Arrays.asList(resLoc);
									if (strings.contains(this.getSelectedLife())) {
										result = new ItemStack(ItemFossilClean.block, 1);
										NBTTagCompound plantNBT = new NBTTagCompound();
										plantNBT.setString("id", this.getSelectedLife());
										NBTTagCompound stackNBT = new NBTTagCompound();
										stackNBT.setTag("PFMob", plantNBT);
										result.setTagCompound(stackNBT);
										found = true;
									}
									if (!found) {
										resLoc = AcidBathOutputPlants.getJurassicCleanedFossilsPlants();
										strings = Arrays.asList(resLoc);
										if (strings.contains(this.getSelectedLife())) {
											result = new ItemStack(ItemFossilClean.block, 1);
											NBTTagCompound plantNBT = new NBTTagCompound();
											plantNBT.setString("id", this.getSelectedLife());
											NBTTagCompound stackNBT = new NBTTagCompound();
											stackNBT.setTag("PFPlant", plantNBT);
											result.setTagCompound(stackNBT);
											found = true;
										}
									}
									if (!found) {
										resLoc = AcidBathOutputStatics.getJurassicCleanedFossilsStatics();
										strings = Arrays.asList(resLoc);
										if (strings.contains(this.getSelectedLife())) {
											result = new ItemStack(ItemFossilClean.block, 1);
											NBTTagCompound plantNBT = new NBTTagCompound();
											plantNBT.setString("id", this.getSelectedLife());
											NBTTagCompound stackNBT = new NBTTagCompound();
											stackNBT.setTag("PFStatic", plantNBT);
											result.setTagCompound(stackNBT);
										}
									}
								}
							}
						}
					}
					else if (this.getStackInSlot(1).getItem() == Item.getItemFromBlock(BlockFossilCretaceous.block)) {
						result = new ItemStack(ItemFossilCretaceous.block, 1);
						if (tileEntity != null) {
							if (tileEntity instanceof BlockTimeResearcher.TileEntityTimeResearcher) {
								BlockTimeResearcher.TileEntityTimeResearcher timeResearcher = (BlockTimeResearcher.TileEntityTimeResearcher) tileEntity;
								if (Math.pow((timeResearcher.getResearchPercent(10) + timeResearcher.getResearchPercent(11)) / 2D, 2)
										>= Math.pow(world.rand.nextFloat() * 4, 2)) {
									boolean found = false;
									String[] resLoc = AcidBathOutputMobs.getCretaceousCleanedFossilsMobs();
									List<String> strings = Arrays.asList(resLoc);
									if (strings.contains(this.getSelectedLife())) {
										result = new ItemStack(ItemFossilClean.block, 1);
										NBTTagCompound plantNBT = new NBTTagCompound();
										plantNBT.setString("id", this.getSelectedLife());
										NBTTagCompound stackNBT = new NBTTagCompound();
										stackNBT.setTag("PFMob", plantNBT);
										result.setTagCompound(stackNBT);
										found = true;
									}
									if (!found) {
										resLoc = AcidBathOutputPlants.getCretaceousCleanedFossilsPlants();
										strings = Arrays.asList(resLoc);
										if (strings.contains(this.getSelectedLife())) {
											result = new ItemStack(ItemFossilClean.block, 1);
											NBTTagCompound plantNBT = new NBTTagCompound();
											plantNBT.setString("id", this.getSelectedLife());
											NBTTagCompound stackNBT = new NBTTagCompound();
											stackNBT.setTag("PFPlant", plantNBT);
											result.setTagCompound(stackNBT);
											found = true;
										}
									}
									if (!found) {
										resLoc = AcidBathOutputStatics.getCretaceousCleanedFossilsStatics();
										strings = Arrays.asList(resLoc);
										if (strings.contains(this.getSelectedLife())) {
											result = new ItemStack(ItemFossilClean.block, 1);
											NBTTagCompound plantNBT = new NBTTagCompound();
											plantNBT.setString("id", this.getSelectedLife());
											NBTTagCompound stackNBT = new NBTTagCompound();
											stackNBT.setTag("PFStatic", plantNBT);
											result.setTagCompound(stackNBT);
										}
									}
								}
							}
						}
					}
					else if (this.getStackInSlot(1).getItem() == Item.getItemFromBlock(BlockFossilPaleogene.block)) {
						result = new ItemStack(ItemFossilPaleogene.block, 1);
						if (tileEntity != null) {
							if (tileEntity instanceof BlockTimeResearcher.TileEntityTimeResearcher) {
								BlockTimeResearcher.TileEntityTimeResearcher timeResearcher = (BlockTimeResearcher.TileEntityTimeResearcher) tileEntity;
								if (Math.pow(timeResearcher.getResearchPercent(12), 2) >= Math.pow(world.rand.nextFloat() * 4, 2)) {
									boolean found = false;
									String[] resLoc = AcidBathOutputMobs.getPaleogeneCleanedFossilsMobs();
									List<String> strings = Arrays.asList(resLoc);
									if (strings.contains(this.getSelectedLife())) {
										result = new ItemStack(ItemFossilClean.block, 1);
										NBTTagCompound plantNBT = new NBTTagCompound();
										plantNBT.setString("id", this.getSelectedLife());
										NBTTagCompound stackNBT = new NBTTagCompound();
										stackNBT.setTag("PFMob", plantNBT);
										result.setTagCompound(stackNBT);
										found = true;
									}
									if (!found) {
										resLoc = AcidBathOutputPlants.getPaleogeneCleanedFossilsPlants();
										strings = Arrays.asList(resLoc);
										if (strings.contains(this.getSelectedLife())) {
											result = new ItemStack(ItemFossilClean.block, 1);
											NBTTagCompound plantNBT = new NBTTagCompound();
											plantNBT.setString("id", this.getSelectedLife());
											NBTTagCompound stackNBT = new NBTTagCompound();
											stackNBT.setTag("PFPlant", plantNBT);
											result.setTagCompound(stackNBT);
											found = true;
										}
									}
									if (!found) {
										resLoc = AcidBathOutputStatics.getPaleogeneCleanedFossilsStatics();
										strings = Arrays.asList(resLoc);
										if (strings.contains(this.getSelectedLife())) {
											result = new ItemStack(ItemFossilClean.block, 1);
											NBTTagCompound plantNBT = new NBTTagCompound();
											plantNBT.setString("id", this.getSelectedLife());
											NBTTagCompound stackNBT = new NBTTagCompound();
											stackNBT.setTag("PFStatic", plantNBT);
											result.setTagCompound(stackNBT);
										}
									}
								}
							}
						}
					}
					else if (this.getStackInSlot(1).getItem() == Item.getItemFromBlock(BlockFossilNeogene.block)) {
						result = new ItemStack(ItemFossilNeogene.block, 1);
						if (tileEntity != null) {
							if (tileEntity instanceof BlockTimeResearcher.TileEntityTimeResearcher) {
								BlockTimeResearcher.TileEntityTimeResearcher timeResearcher = (BlockTimeResearcher.TileEntityTimeResearcher) tileEntity;
								if (Math.pow(timeResearcher.getResearchPercent(13), 2) >= Math.pow(world.rand.nextFloat() * 4, 2)) {
									boolean found = false;
									String[] resLoc = AcidBathOutputMobs.getNeogeneCleanedFossilsMobs();
									List<String> strings = Arrays.asList(resLoc);
									if (strings.contains(this.getSelectedLife())) {
										result = new ItemStack(ItemFossilClean.block, 1);
										NBTTagCompound plantNBT = new NBTTagCompound();
										plantNBT.setString("id", this.getSelectedLife());
										NBTTagCompound stackNBT = new NBTTagCompound();
										stackNBT.setTag("PFMob", plantNBT);
										result.setTagCompound(stackNBT);
										found = true;
									}
									if (!found) {
										resLoc = AcidBathOutputPlants.getNeogeneCleanedFossilsPlants();
										strings = Arrays.asList(resLoc);
										if (strings.contains(this.getSelectedLife())) {
											result = new ItemStack(ItemFossilClean.block, 1);
											NBTTagCompound plantNBT = new NBTTagCompound();
											plantNBT.setString("id", this.getSelectedLife());
											NBTTagCompound stackNBT = new NBTTagCompound();
											stackNBT.setTag("PFPlant", plantNBT);
											result.setTagCompound(stackNBT);
											found = true;
										}
									}
									if (!found) {
										resLoc = AcidBathOutputStatics.getNeogeneCleanedFossilsStatics();
										strings = Arrays.asList(resLoc);
										if (strings.contains(this.getSelectedLife())) {
											result = new ItemStack(ItemFossilClean.block, 1);
											NBTTagCompound plantNBT = new NBTTagCompound();
											plantNBT.setString("id", this.getSelectedLife());
											NBTTagCompound stackNBT = new NBTTagCompound();
											stackNBT.setTag("PFStatic", plantNBT);
											result.setTagCompound(stackNBT);
										}
									}
								}
							}
						}
					}
					else if (this.getStackInSlot(1).getItem() == Item.getItemFromBlock(BlockFossilPleistocene.block)) {
						result = new ItemStack(ItemFossilPleistocene.block, 1);
						if (tileEntity != null) {
							if (tileEntity instanceof BlockTimeResearcher.TileEntityTimeResearcher) {
								BlockTimeResearcher.TileEntityTimeResearcher timeResearcher = (BlockTimeResearcher.TileEntityTimeResearcher) tileEntity;
								if (Math.pow(timeResearcher.getResearchPercent(14), 2) >= Math.pow(world.rand.nextFloat() * 4, 2)) {
									boolean found = false;
									String[] resLoc = AcidBathOutputMobs.getPleistoceneCleanedFossilsMobs();
									List<String> strings = Arrays.asList(resLoc);
									if (strings.contains(this.getSelectedLife())) {
										result = new ItemStack(ItemFossilClean.block, 1);
										NBTTagCompound plantNBT = new NBTTagCompound();
										plantNBT.setString("id", this.getSelectedLife());
										NBTTagCompound stackNBT = new NBTTagCompound();
										stackNBT.setTag("PFMob", plantNBT);
										result.setTagCompound(stackNBT);
										found = true;
									}
									if (!found) {
										resLoc = AcidBathOutputPlants.getPleistoceneCleanedFossilsPlants();
										strings = Arrays.asList(resLoc);
										if (strings.contains(this.getSelectedLife())) {
											result = new ItemStack(ItemFossilClean.block, 1);
											NBTTagCompound plantNBT = new NBTTagCompound();
											plantNBT.setString("id", this.getSelectedLife());
											NBTTagCompound stackNBT = new NBTTagCompound();
											stackNBT.setTag("PFPlant", plantNBT);
											result.setTagCompound(stackNBT);
											found = true;
										}
									}
									if (!found) {
										resLoc = AcidBathOutputStatics.getPleistoceneCleanedFossilsStatics();
										strings = Arrays.asList(resLoc);
										if (strings.contains(this.getSelectedLife())) {
											result = new ItemStack(ItemFossilClean.block, 1);
											NBTTagCompound plantNBT = new NBTTagCompound();
											plantNBT.setString("id", this.getSelectedLife());
											NBTTagCompound stackNBT = new NBTTagCompound();
											stackNBT.setTag("PFStatic", plantNBT);
											result.setTagCompound(stackNBT);
										}
									}
								}
							}
						}
					}

					setInventorySlotContents(1, result);

				}
				updated = true;
			}

			if (this.isProcessing && this.processTick >= this.processTickTime) {
				//Move the results over to the outputs:
				if (!getStackInSlot(1).isEmpty()) {
					boolean matched = false;
					ItemStack stackOut = getStackInSlot(1);
					if (getStackInSlot(2).getItem() == stackOut.getItem()) {
						ItemStack stack1 = stackOut.copy();
						stack1.setCount(1);
						ItemStack stack2 = getStackInSlot(2).copy();
						stack2.setCount(1);
						if (stack1.hasTagCompound() && stack2.hasTagCompound()) {
							if (stack1.getTagCompound().equals(stack2.getTagCompound())) {
								if (getStackInSlot(2).getCount() < getStackInSlot(2).getMaxStackSize()) {
									stack2.setCount(getStackInSlot(2).getCount() + 1);
									this.setInventorySlotContents(2, stack2);
									this.setInventorySlotContents(1, ItemStack.EMPTY);
									matched = true;
								}
							}
						}
						if ((!stack1.hasTagCompound()) && (!stack2.hasTagCompound())) {
							if (getStackInSlot(2).getCount() < getStackInSlot(2).getMaxStackSize()) {
								stack2.setCount(getStackInSlot(2).getCount() + 1);
								this.setInventorySlotContents(2, stack2);
								this.setInventorySlotContents(1, ItemStack.EMPTY);
								matched = true;
							}
						}
					}
					if (getStackInSlot(3).getItem() == stackOut.getItem() && !matched) {
						ItemStack stack1 = stackOut.copy();
						stack1.setCount(1);
						ItemStack stack2 = getStackInSlot(3).copy();
						stack2.setCount(1);
						if (stack1.hasTagCompound() && stack2.hasTagCompound()) {
							if (stack1.getTagCompound().equals(stack2.getTagCompound())) {
								if (getStackInSlot(3).getCount() < getStackInSlot(3).getMaxStackSize()) {
									stack2.setCount(getStackInSlot(3).getCount() + 1);
									this.setInventorySlotContents(3, stack2);
									this.setInventorySlotContents(1, ItemStack.EMPTY);
									matched = true;
								}
							}
						}
						if ((!stack1.hasTagCompound()) && (!stack2.hasTagCompound())) {
							if (getStackInSlot(3).getCount() < getStackInSlot(2).getMaxStackSize()) {
								stack2.setCount(getStackInSlot(3).getCount() + 1);
								this.setInventorySlotContents(3, stack2);
								this.setInventorySlotContents(1, ItemStack.EMPTY);
								matched = true;
							}
						}
					}
					if (getStackInSlot(4).getItem() == stackOut.getItem() && !matched) {
						ItemStack stack1 = stackOut.copy();
						stack1.setCount(1);
						ItemStack stack2 = getStackInSlot(4).copy();
						stack2.setCount(1);
						if (stack1.hasTagCompound() && stack2.hasTagCompound()) {
							if (stack1.getTagCompound().equals(stack2.getTagCompound())) {
								if (getStackInSlot(4).getCount() < getStackInSlot(4).getMaxStackSize()) {
									stack2.setCount(getStackInSlot(4).getCount() + 1);
									this.setInventorySlotContents(2, stack2);
									this.setInventorySlotContents(1, ItemStack.EMPTY);
									matched = true;
								}
							}
						}
						if ((!stack1.hasTagCompound()) && (!stack2.hasTagCompound())) {
							if (getStackInSlot(4).getCount() < getStackInSlot(4).getMaxStackSize()) {
								stack2.setCount(getStackInSlot(4).getCount() + 1);
								this.setInventorySlotContents(4, stack2);
								this.setInventorySlotContents(1, ItemStack.EMPTY);
								matched = true;
							}
						}
					}
					if (getStackInSlot(5).getItem() == stackOut.getItem() && !matched) {
						ItemStack stack1 = stackOut.copy();
						stack1.setCount(1);
						ItemStack stack2 = getStackInSlot(5).copy();
						stack2.setCount(1);
						if (stack1.hasTagCompound() && stack2.hasTagCompound()) {
							if (stack1.getTagCompound().equals(stack2.getTagCompound())) {
								if (getStackInSlot(5).getCount() < getStackInSlot(5).getMaxStackSize()) {
									stack2.setCount(getStackInSlot(5).getCount() + 1);
									this.setInventorySlotContents(5, stack2);
									this.setInventorySlotContents(1, ItemStack.EMPTY);
									matched = true;
								}
							}
						}
						if ((!stack1.hasTagCompound()) && (!stack2.hasTagCompound())) {
							if (getStackInSlot(5).getCount() < getStackInSlot(5).getMaxStackSize()) {
								stack2.setCount(getStackInSlot(5).getCount() + 1);
								this.setInventorySlotContents(5, stack2);
								this.setInventorySlotContents(1, ItemStack.EMPTY);
								matched = true;
							}
						}
					}
					if (getStackInSlot(2).isEmpty() && !matched) {
						this.setInventorySlotContents(2, this.getStackInSlot(1));
						this.setInventorySlotContents(1, ItemStack.EMPTY);
						matched = true;
					}
					if (getStackInSlot(3).isEmpty() && !matched) {
						this.setInventorySlotContents(3, this.getStackInSlot(1));
						this.setInventorySlotContents(1, ItemStack.EMPTY);
						matched = true;
					}
					if (getStackInSlot(4).isEmpty() && !matched) {
						this.setInventorySlotContents(4, this.getStackInSlot(1));
						this.setInventorySlotContents(1, ItemStack.EMPTY);
						matched = true;
					}
					if (getStackInSlot(5).isEmpty() && !matched) {
						this.setInventorySlotContents(5, this.getStackInSlot(1));
						this.setInventorySlotContents(1, ItemStack.EMPTY);
						matched = true;
					}

				}
				this.processTick = 0;
				this.isProcessing = false;
				this.trayheight = 0;
				updated = true;
			}

			if (updated) {
				this.notifyBlockUpdate();
			}
			markDirty();

		}

		@Override
		public int getInventoryStackLimit() {
			return 64;
		}

		@Override
		public int getSizeInventory() {
			return 6;
		}

		@Override
		public String getName() {
			return "container.time_researcher_finder_bottom";
		}

		@Override
		public String getGuiID()
		{
			return "lepidodendron:gui_time_researcher_finder_bottom";
		}

		@Override
		public Container createContainer(InventoryPlayer playerInventory, EntityPlayer playerIn) {
			return new GUITimeResearcherFinder.GUILepidodendronTimeResearcherFinder(this.getWorld(), this.getPos().getX(), this.getPos().getY(), this.getPos().getZ(), playerIn);
		}

		@Override
		public void readFromNBT(NBTTagCompound compound) {
			super.readFromNBT(compound);
			if (compound.hasKey("processTick")) {
				this.processTick = compound.getInteger("processTick");
			}
			if (compound.hasKey("isProcessing")) {
				this.isProcessing = compound.getBoolean("isProcessing");
			}
			if (compound.hasKey("selectedLife")) {
				this.selectedLife = compound.getString("selectedLife");
			}
			this.forgeContents = NonNullList.<ItemStack>withSize(this.getSizeInventory(), ItemStack.EMPTY);
			if (!this.checkLootAndRead(compound)) {
				ItemStackHelper.loadAllItems(compound, this.forgeContents);
			}
		}

		@Override
		public NBTTagCompound writeToNBT(NBTTagCompound compound) {
			super.writeToNBT(compound);
			compound.setBoolean("isProcessing", this.isProcessing);
			compound.setInteger("processTick", this.processTick);
			compound.setString("selectedLife", this.selectedLife);
			if (!this.checkLootAndWrite(compound)) {
				ItemStackHelper.saveAllItems(compound, this.forgeContents);
			}
			return compound;
		}

		private void notifyBlockUpdate() {
			//this.getWorld().notifyNeighborsOfStateChange(this.getPos(), this.getBlockType(), true);
			this.getWorld().notifyBlockUpdate(this.getPos(), this.getWorld().getBlockState(this.getPos()), this.getWorld().getBlockState(this.getPos()), 3);
			//this.getWorld().markBlockRangeForRenderUpdate(this.getPos(), this.getPos());
		}

		@Override
		public void markDirty() {
			super.markDirty();
			//notifyBlockUpdate();
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
		public void invalidate()
		{
			super.invalidate();
			this.updateContainingBlockInfo();
		}

		@Override
		protected NonNullList<ItemStack> getItems()
		{
			return this.forgeContents;
		}

		@Override
		public int[] getSlotsForFace(EnumFacing side) {
			return new int[]{0,1,2,3,4,5};
		}

		@Override
		public boolean canInsertItem(int index, ItemStack itemStackIn, EnumFacing direction) {
			if (index == 0) {
				return isItemValidForSlot(index, itemStackIn);
			}
			else return false;
		}

		@Override
		public boolean canExtractItem(int index, ItemStack stack, EnumFacing direction) {
			if (index == 0 || index == 1) {
				return false;
			}
			return true;
		}

		@Override
		public boolean isItemValidForSlot(int index, ItemStack stack) {
			if (index == 0) {
				Block item = Block.getBlockFromItem(stack.getItem());
				if (item == BlockFossilPrecambrian.block
						|| item == BlockFossilCambrian.block
						|| item == BlockFossilOrdovician.block
						|| item == BlockFossilSilurian.block
						|| item == BlockFossilDevonian.block
						|| item == BlockFossilCarboniferous.block
						|| item == BlockFossilPermian.block
						|| item == BlockFossilTriassic.block
						|| item == BlockFossilJurassic.block
						|| item == BlockFossilCretaceous.block
						|| item == BlockFossilPaleogene.block
						|| item == BlockFossilNeogene.block
						|| item == BlockFossilPleistocene.block) {
					return true;
				}
				return false;
			}
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