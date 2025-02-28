
package net.lepidodendron.block;

import net.lepidodendron.ElementsLepidodendronMod;
import net.lepidodendron.LepidodendronConfig;
import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.LepidodendronSorter;
import net.lepidodendron.creativetab.TabLepidodendronBuilding;
import net.lepidodendron.gui.GUITimeResearcher;
import net.lepidodendron.item.*;
import net.minecraft.block.Block;
import net.minecraft.block.BlockDirectional;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.properties.PropertyBool;
import net.minecraft.block.properties.PropertyDirection;
import net.minecraft.block.state.BlockFaceShape;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.item.EntityItem;
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
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.common.capabilities.Capability;
import net.minecraftforge.energy.CapabilityEnergy;
import net.minecraftforge.energy.IEnergyStorage;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import javax.annotation.Nullable;
import java.util.Random;

@ElementsLepidodendronMod.ModElement.Tag
public class BlockTimeResearcher extends ElementsLepidodendronMod.ModElement {
	@GameRegistry.ObjectHolder("lepidodendron:time_researcher")
	public static final Block block = null;

	public BlockTimeResearcher(ElementsLepidodendronMod instance) {
		super(instance, LepidodendronSorter.time_researcher);
	}

	@Override
	public void initElements() {
		elements.blocks.add(() -> new BlockCustom().setRegistryName("time_researcher"));
//		elements.items.add(() -> new ItemBlock(block).setRegistryName(block.getRegistryName()));
	}

	@Override
	public void init(FMLInitializationEvent event) {
		GameRegistry.registerTileEntity(TileEntityTimeResearcher.class, "lepidodendron:tileentitytime_researcher");
	}

//	@SideOnly(Side.CLIENT)
//	@Override
//	public void registerModels(ModelRegistryEvent event) {
//		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(block), 0,
//				new ModelResourceLocation("lepidodendron:time_researcher", "inventory"));
//	}

	public static class BlockCustom extends Block {
		public static final PropertyDirection FACING = BlockDirectional.FACING;
		public static final PropertyBool RF = PropertyBool.create("rf");

		public BlockCustom() {
			super(Material.IRON);
			setTranslationKey("pf_time_researcher");
			setSoundType(SoundType.METAL);
			setHardness(10F);
			setResistance(1200F);
			setLightLevel(0F);
			setLightOpacity(0);
			setCreativeTab(TabLepidodendronBuilding.tab);
			this.setDefaultState(this.blockState.getBaseState().withProperty(FACING, EnumFacing.NORTH));
		}

		@Override
		public ItemStack getPickBlock(IBlockState state, RayTraceResult target, World world, BlockPos pos, EntityPlayer player) {
			return dropStack(world, pos);
		}

		public static ItemStack dropStack(World world, BlockPos pos) {
			ItemStack stack = new ItemStack(ItemTimeResearcher.block, 1);
			TileEntity te = world.getTileEntity(pos);
			if (te != null) {
				if (te instanceof BlockTimeResearcher.TileEntityTimeResearcher) {
					BlockTimeResearcher.TileEntityTimeResearcher entity = (BlockTimeResearcher.TileEntityTimeResearcher) te;
					NBTTagCompound stackNBT = new NBTTagCompound();
					stackNBT.setInteger("dimPrecambrian", entity.dimPrecambrian);
					stackNBT.setInteger("dimCambrian", entity.dimCambrian);
					stackNBT.setInteger("dimOrdovician", entity.dimOrdovician);
					stackNBT.setInteger("dimSilurian", entity.dimSilurian);
					stackNBT.setInteger("dimDevonian", entity.dimDevonian);
					stackNBT.setInteger("dimCarboniferous", entity.dimCarboniferous);
					stackNBT.setInteger("dimPermian", entity.dimPermian);
					stackNBT.setInteger("dimTriassic", entity.dimTriassic);
					stackNBT.setInteger("dimJurassic", entity.dimJurassic);
					stackNBT.setInteger("dimCretaceousEarly", entity.dimCretaceousEarly);
					stackNBT.setInteger("dimCretaceousLate", entity.dimCretaceousLate);
					stackNBT.setInteger("dimPaleogene", entity.dimPaleogene);
					stackNBT.setInteger("dimNeogene", entity.dimNeogene);
					stackNBT.setInteger("dimPleistocene", entity.dimPleistocene);
					stack.setTagCompound(stackNBT);
				}
			}

			return stack;
		}

		@Override
		public boolean hasTileEntity(IBlockState state) {
			return true;
		}

		@Nullable
		@Override
		public TileEntity createTileEntity(World world, IBlockState state) {
			return new BlockTimeResearcher.TileEntityTimeResearcher();
		}

		public BlockTimeResearcher.TileEntityTimeResearcher createNewTileEntity(World worldIn, int meta) {
			return new BlockTimeResearcher.TileEntityTimeResearcher();
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
				if (tileentity instanceof BlockTimeResearcher.TileEntityTimeResearcher) {
					EntityItem entityToSpawn = new EntityItem(world, pos.getX(), pos.getY(), pos.getZ(), this.dropStack(world, pos));
					entityToSpawn.setPickupDelay(10);
					world.spawnEntity(entityToSpawn);
					InventoryHelper.dropInventoryItems(world, pos, (BlockTimeResearcher.TileEntityTimeResearcher) tileentity);
				}
				world.removeTileEntity(pos);
			}
			super.breakBlock(world, pos, state);
		}

		@Override
		public boolean onBlockActivated(World world, BlockPos pos, IBlockState state, EntityPlayer entity, EnumHand hand, EnumFacing direction, float hitX, float hitY, float hitZ) {
			super.onBlockActivated(world, pos, state, entity, hand, direction, hitX, hitY, hitZ);
			if (entity instanceof EntityPlayer) {
				((EntityPlayer) entity).openGui(LepidodendronMod.instance, GUITimeResearcher.GUIID, world, pos.getX(), pos.getY(), pos.getZ());
			}
			return true;
		}

		@Override
		public MapColor getMapColor(IBlockState state, IBlockAccess worldIn, BlockPos pos) {
			return MapColor.GRAY;
		}

		@Override
		public IBlockState getActualState(IBlockState state, IBlockAccess worldIn, BlockPos pos) {
			return state.withProperty(RF, LepidodendronConfig.machinesRF);
		}

		@Override
		public Item getItemDropped(IBlockState state, Random rand, int fortune) {
			return (new ItemStack(Items.AIR, 1).getItem());
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
		protected net.minecraft.block.state.BlockStateContainer createBlockState() {
			return new net.minecraft.block.state.BlockStateContainer(this, new IProperty[]{FACING, RF});
		}

		@Override
		public void neighborChanged(IBlockState state, World worldIn, BlockPos pos, Block blockIn, BlockPos fromPos) {

			if (worldIn.getBlockState(pos.up()).getBlock() != BlockTimeResearcherHopper.block) {
				worldIn.destroyBlock(pos, false);
				return;
			}
			if (worldIn.getBlockState(pos.down()).getBlock() != BlockTimeResearcherDispenser.block) {
				worldIn.destroyBlock(pos, false);
				return;
			}
			if (worldIn.getBlockState(pos.offset(state.getValue(FACING).rotateY().rotateY().rotateY())).getBlock() != BlockTimeResearcherFinderTop.block) {
				worldIn.destroyBlock(pos, false);
				return;
			}

			super.neighborChanged(state, worldIn, pos, blockIn, fromPos);
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
		public BlockFaceShape getBlockFaceShape(IBlockAccess world, IBlockState state, BlockPos pos, EnumFacing face) {
			if (face == EnumFacing.UP || face == EnumFacing.DOWN) {
				return BlockFaceShape.SOLID;
			}
			return BlockFaceShape.UNDEFINED;
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
	}

	public static class TileEntityTimeResearcher extends TileEntityLockableLoot implements ITickable, ISidedInventory, IEnergyStorage {
		private NonNullList<ItemStack> forgeContents = NonNullList.<ItemStack>withSize(1, ItemStack.EMPTY);

		protected boolean isProcessing;
		public int processTick;
		private int processTickTime = 20;

		public int maxResearch = Math.max(0, LepidodendronConfig.researchMax) * 5;
		public float portalResearch = Math.min(Math.max(0, (float)LepidodendronConfig.researchPortal / 100F), 1F);

		public int dimPrecambrian;
		public int dimCambrian;
		public int dimOrdovician;
		public int dimSilurian;
		public int dimDevonian;
		public int dimCarboniferous;
		public int dimPermian;
		public int dimTriassic;
		public int dimJurassic;
		public int dimCretaceousEarly;
		public int dimCretaceousLate;
		public int dimPaleogene;
		public int dimNeogene;
		public int dimPleistocene;

		public float getResearchPercent(int dimIn) {
			if (maxResearch <= 0) {
				return 1F;
			}
			switch (dimIn) {
				case 0: default:
					return 1F;

				case 1:
					return ((float)dimPrecambrian) / ((float)maxResearch);

				case 2:
					return ((float)dimCambrian) / ((float)maxResearch);

				case 3:
					return ((float)dimOrdovician) / ((float)maxResearch);

				case 4:
					return ((float)dimSilurian) / ((float)maxResearch);

				case 5:
					return ((float)dimDevonian) / ((float)maxResearch);

				case 6:
					return ((float)dimCarboniferous) / ((float)maxResearch);

				case 7:
					return ((float)dimPermian) / ((float)maxResearch);

				case 8:
					return ((float)dimTriassic) / ((float)maxResearch);

				case 9:
					return ((float)dimJurassic) / ((float)maxResearch);

				case 10:
					return ((float)dimCretaceousEarly) / ((float)maxResearch);

				case 11:
					return ((float)dimCretaceousLate) / ((float)maxResearch);

				case 12:
					return ((float)dimPaleogene) / ((float)maxResearch);

				case 13:
					return ((float)dimNeogene) / ((float)maxResearch);

				case 14:
					return ((float)dimPleistocene) / ((float)maxResearch);

			}
		}

		public boolean canStartProcess() {

			if (this.isProcessing) {
				return false;
			}
			if (isItemValidForSlot(0, this.getStackInSlot(0))
			) {
				return true;
			}
			return false;
		}

		public double progressFraction() {
			if (this.isProcessing) {
				return (double)this.processTick / (double)this.processTickTime;
			}
			return 0;
		}

		public boolean isProcessing() {
			return this.isProcessing;
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

		@Override
		public void update() {

			if (this.getWorld().isRemote) {
				return;
			}

			if (LepidodendronConfig.machinesRF) {
				TileEntity tileEntity = world.getTileEntity(this.pos);
				if (tileEntity instanceof BlockTimeResearcher.TileEntityTimeResearcher) {
					BlockTimeResearcher.TileEntityTimeResearcher te = (BlockTimeResearcher.TileEntityTimeResearcher) tileEntity;
					if (te.getEnergyStored() < te.getMaxEnergyStored()) {
						//Is there a power-supplying block in the right place?
						EnumFacing facing = this.getWorld().getBlockState(this.getPos()).getValue(BlockTimeResearcher.BlockCustom.FACING);
						BlockPos powerBlockPos = this.pos.offset(facing.getOpposite());
						TileEntity teStorage = this.getWorld().getTileEntity(powerBlockPos);
						if (teStorage != null) {
							IEnergyStorage powerBlockStorage = teStorage.getCapability(CapabilityEnergy.ENERGY, facing);
							if (powerBlockStorage != null) {
								if (powerBlockStorage.canExtract()) {
									int energyTransferOut = powerBlockStorage.extractEnergy(this.maxReceive, true);
									int energyTransferIn = this.receiveEnergy(energyTransferOut, true);
									powerBlockStorage.extractEnergy(energyTransferIn, false);
									this.receiveEnergy(energyTransferIn, false);
									this.getWorld().notifyBlockUpdate(this.getPos(), this.getWorld().getBlockState(this.getPos()), this.getWorld().getBlockState(this.getPos()), 3);
								}
							}
						}
					}
				}
			}

			this.receiveEnergy(10, false);

			if (!(isItemValidForSlot(0, this.getStackInSlot(0))
			)) {
				this.processTick = 0;
				this.isProcessing = false;
				return;
			}

			if (this.canStartProcess()) {
				this.processTick = 0;
				this.isProcessing = true;
			}

			if (this.isProcessing) {
				this.processTick ++;
			}

			if (this.isProcessing && this.processTick > this.processTickTime) {
				//System.err.println("Ending process");
				this.processTick = 0;
				this.isProcessing = false;
				if (isItemValidForSlot(0, this.getStackInSlot(0))
				) {
					ItemStack stackProcessing = this.getStackInSlot(0);
					//Assign knowledge:
					if (stackProcessing.getItem() == Item.getItemFromBlock(BlockFossilPrecambrian.block)
						&& this.dimPrecambrian < this.maxResearch) {
						for (int p = 0; p < 13; p++) {
							this.dimPrecambrian++;
						}
					}
					else if (stackProcessing.getItem() == Item.getItemFromBlock(BlockFossilCambrian.block)
							&& this.dimCambrian < this.maxResearch) {
						for (int p = 0; p < 12; p++) {
							this.dimCambrian++;
						}
					}
					else if (stackProcessing.getItem() == Item.getItemFromBlock(BlockFossilOrdovician.block)
							&& this.dimOrdovician < this.maxResearch) {
						for (int p = 0; p < 11; p++) {
							this.dimOrdovician++;
						}
					}
					else if (stackProcessing.getItem() == Item.getItemFromBlock(BlockFossilSilurian.block)
							&& this.dimSilurian < this.maxResearch) {
						for (int p = 0; p < 10; p++) {
							this.dimSilurian++;
						}
					}
					else if (stackProcessing.getItem() == Item.getItemFromBlock(BlockFossilDevonian.block)
							&& this.dimDevonian < this.maxResearch) {
						for (int p = 0; p < 9; p++) {
							this.dimDevonian++;
						}
					}
					else if (stackProcessing.getItem() == Item.getItemFromBlock(BlockFossilCarboniferous.block)
							&& this.dimCarboniferous < this.maxResearch) {
						for (int p = 0; p < 8; p++) {
							this.dimCarboniferous++;
						}
					}
					else if (stackProcessing.getItem() == Item.getItemFromBlock(BlockFossilPermian.block)
							&& this.dimPermian < this.maxResearch) {
						for (int p = 0; p < 7; p++) {
							this.dimPermian++;
						}
					}
					else if (stackProcessing.getItem() == Item.getItemFromBlock(BlockFossilTriassic.block)
							&& this.dimTriassic < this.maxResearch) {
						for (int p = 0; p < 6; p++) {
							this.dimTriassic++;
						}
					}
					else if (stackProcessing.getItem() == Item.getItemFromBlock(BlockFossilJurassic.block)
							&& this.dimJurassic < this.maxResearch) {
						for (int p = 0; p < 5; p++) {
							this.dimJurassic++;
						}
					}
					else if (stackProcessing.getItem() == Item.getItemFromBlock(BlockFossilCretaceous.block)) {
						for (int cret = 0; cret < 2; cret++) {
							if (world.rand.nextBoolean()) {
								if (this.dimCretaceousEarly < this.maxResearch) {
									for (int p = 0; p < 4; p++) {
										this.dimCretaceousEarly++;
									}
								} else if (this.dimCretaceousLate < this.maxResearch) {
									for (int p = 0; p < 4; p++) {
										this.dimCretaceousLate++;
									}
								}
							} else {
								if (this.dimCretaceousLate < this.maxResearch) {
									for (int p = 0; p < 4; p++) {
										this.dimCretaceousLate++;
									}
								} else if (this.dimCretaceousEarly < this.maxResearch) {
									for (int p = 0; p < 4; p++) {
										this.dimCretaceousEarly++;
									}
								}
							}
						}
					}
					else if (stackProcessing.getItem() == Item.getItemFromBlock(BlockFossilPaleogene.block)
							&& this.dimPaleogene < this.maxResearch) {
						for (int p = 0; p < 3; p++) {
							this.dimPaleogene++;
						}
					}
					else if (stackProcessing.getItem() == Item.getItemFromBlock(BlockFossilNeogene.block)
							&& this.dimNeogene < this.maxResearch) {
						for (int p = 0; p < 2; p++) {
							this.dimNeogene++;
						}
					}
					else if (stackProcessing.getItem() == Item.getItemFromBlock(BlockFossilPleistocene.block)
							&& this.dimPleistocene < this.maxResearch) {
						for (int p = 0; p < 1; p++) {
							this.dimPleistocene++;
						}
					}
					else if (stackProcessing.getItem() == ItemFossilPrecambrian.block
							&& this.dimPrecambrian < this.maxResearch) {
						for (int p = 0; p < 26; p++) {
							this.dimPrecambrian++;
						}
					}
					else if (stackProcessing.getItem() == ItemFossilCambrian.block
							&& this.dimCambrian < this.maxResearch) {
						for (int p = 0; p < 24; p++) {
							this.dimCambrian++;
						}
					}
					else if (stackProcessing.getItem() == ItemFossilOrdovician.block
							&& this.dimOrdovician < this.maxResearch) {
						for (int p = 0; p < 22; p++) {
							this.dimOrdovician++;
						}
					}
					else if (stackProcessing.getItem() == ItemFossilSilurian.block
							&& this.dimSilurian < this.maxResearch) {
						for (int p = 0; p < 20; p++) {
							this.dimSilurian++;
						}
					}
					else if (stackProcessing.getItem() == ItemFossilDevonian.block
							&& this.dimDevonian < this.maxResearch) {
						for (int p = 0; p < 18; p++) {
							this.dimDevonian++;
						}
					}
					else if (stackProcessing.getItem() == ItemFossilCarboniferous.block
							&& this.dimCarboniferous < this.maxResearch) {
						for (int p = 0; p < 16; p++) {
							this.dimCarboniferous++;
						}
					}
					else if (stackProcessing.getItem() == ItemFossilPermian.block
							&& this.dimPermian < this.maxResearch) {
						for (int p = 0; p < 14; p++) {
							this.dimPermian++;
						}
					}
					else if (stackProcessing.getItem() == ItemFossilTriassic.block
							&& this.dimTriassic < this.maxResearch) {
						for (int p = 0; p < 12; p++) {
							this.dimTriassic++;
						}
					}
					else if (stackProcessing.getItem() == ItemFossilJurassic.block
							&& this.dimJurassic < this.maxResearch) {
						for (int p = 0; p < 10; p++) {
							this.dimJurassic++;
						}
					}
					else if (stackProcessing.getItem() == ItemFossilCretaceous.block) {
						for (int cret = 0; cret < 2; cret++) {
							if (world.rand.nextBoolean()) {
								if (this.dimCretaceousEarly < this.maxResearch) {
									for (int p = 0; p < 8; p++) {
										this.dimCretaceousEarly++;
									}
								} else if (this.dimCretaceousLate < this.maxResearch) {
									for (int p = 0; p < 8; p++) {
										this.dimCretaceousLate++;
									}
								}
							} else {
								if (this.dimCretaceousLate < this.maxResearch) {
									for (int p = 0; p < 8; p++) {
										this.dimCretaceousLate++;
									}
								} else if (this.dimCretaceousEarly < this.maxResearch) {
									for (int p = 0; p < 8; p++) {
										this.dimCretaceousEarly++;
									}
								}
							}
						}
					}
					else if (stackProcessing.getItem() == ItemFossilPaleogene.block
							&& this.dimPaleogene < this.maxResearch) {
						for (int p = 0; p < 6; p++) {
							this.dimPaleogene++;
						}
					}
					else if (stackProcessing.getItem() == ItemFossilNeogene.block
							&& this.dimNeogene < this.maxResearch) {
						for (int p = 0; p < 4; p++) {
							this.dimNeogene++;
						}
					}
					else if (stackProcessing.getItem() == ItemFossilPleistocene.block
							&& this.dimPleistocene < this.maxResearch) {
						for (int p = 0; p < 2; p++) {
							this.dimPleistocene++;
						}
					}

					boolean itemPrecambrian = false;
					boolean itemCambrian = false;
					boolean itemOrdovician = false;
					boolean itemSilurian = false;
					boolean itemDevonian = false;
					boolean itemCarboniferous = false;
					boolean itemPermian = false;
					boolean itemTriassic = false;
					boolean itemJurassic = false;
					boolean itemCretaceous = false;
					boolean itemPaleogene = false;
					boolean itemNeogene = false;
					boolean itemPleistocene = false;
					if (stackProcessing.getItem() == ItemFossilClean.block
							|| stackProcessing.getItem() == ItemPhialDNA.block
							|| stackProcessing.getItem() == ItemPlaceableLiving.block) {
						int cleanBonus = 0;
						if (stackProcessing.getItem() == ItemFossilClean.block) {
							cleanBonus = 30;
						}
						else if (stackProcessing.getItem() == ItemPhialDNA.block) {
							cleanBonus = 40;
						}
						else {
							cleanBonus = 50;
						}
						if (stackProcessing.hasTagCompound()) {
							if (stackProcessing.getTagCompound().hasKey("period")) {
								itemPrecambrian = stackProcessing.getTagCompound().getInteger("period") == 1;
								itemCambrian = stackProcessing.getTagCompound().getInteger("period") == 2;
								itemOrdovician = stackProcessing.getTagCompound().getInteger("period") == 3;
								itemSilurian = stackProcessing.getTagCompound().getInteger("period") == 4;
								itemDevonian = stackProcessing.getTagCompound().getInteger("period") == 5;
								itemCarboniferous = stackProcessing.getTagCompound().getInteger("period") == 6;
								itemPermian = stackProcessing.getTagCompound().getInteger("period") == 7;
								itemTriassic = stackProcessing.getTagCompound().getInteger("period") == 8;
								itemJurassic = stackProcessing.getTagCompound().getInteger("period") == 9;
								itemCretaceous = stackProcessing.getTagCompound().getInteger("period") == 10;
								itemPaleogene = stackProcessing.getTagCompound().getInteger("period") == 11;
								itemNeogene = stackProcessing.getTagCompound().getInteger("period") == 12;
								itemPleistocene = stackProcessing.getTagCompound().getInteger("period") == 13;
							}
						}
						if (itemPrecambrian
								&& this.dimPrecambrian < this.maxResearch) {
							for (int ii = 0; ii < cleanBonus; ii++) {
								this.dimPrecambrian++;
							}
						}
						else if (itemCambrian
								&& this.dimCambrian < this.maxResearch) {
							for (int ii = 0; ii < cleanBonus; ii++) {
								this.dimCambrian++;
							}
						}
						else if (itemOrdovician
								&& this.dimOrdovician < this.maxResearch) {
							for (int ii = 0; ii < cleanBonus; ii++) {
								this.dimOrdovician++;
							}
						}
						else if (itemSilurian
								&& this.dimSilurian < this.maxResearch) {
							for (int ii = 0; ii < cleanBonus; ii++) {
								this.dimSilurian++;
							}
						}
						else if (itemDevonian
								&& this.dimDevonian < this.maxResearch) {
							for (int ii = 0; ii < cleanBonus; ii++) {
								this.dimDevonian++;
							}
						}
						else if (itemCarboniferous
								&& this.dimCarboniferous < this.maxResearch) {
							for (int ii = 0; ii < cleanBonus; ii++) {
								this.dimCarboniferous++;
							}
						}
						else if (itemPermian
								&& this.dimPermian < this.maxResearch) {
							for (int ii = 0; ii < cleanBonus; ii++) {
								this.dimPermian++;
							}
						}
						else if (itemTriassic
								&& this.dimTriassic < this.maxResearch) {
							for (int ii = 0; ii < cleanBonus; ii++) {
								this.dimTriassic++;
							}
						}
						else if (itemJurassic
								&& this.dimJurassic < this.maxResearch) {
							for (int ii = 0; ii < cleanBonus; ii++) {
								this.dimJurassic++;
							}
						}
						else if (itemCretaceous) {
							for (int cret = 0; cret < 2; cret++) {
								if (world.rand.nextBoolean()) {
									if (this.dimCretaceousEarly < this.maxResearch) {
										for (int p = 0; p < cleanBonus; p++) {
											this.dimCretaceousEarly++;
										}
									} else if (this.dimCretaceousLate < this.maxResearch) {
										for (int p = 0; p < cleanBonus; p++) {
											this.dimCretaceousLate++;
										}
									}
								} else {
									if (this.dimCretaceousLate < this.maxResearch) {
										for (int p = 0; p < cleanBonus; p++) {
											this.dimCretaceousLate++;
										}
									} else if (this.dimCretaceousEarly < this.maxResearch) {
										for (int p = 0; p < cleanBonus; p++) {
											this.dimCretaceousEarly++;
										}
									}
								}
							}
						}
						else if (itemPaleogene
								&& this.dimPaleogene < this.maxResearch) {
							for (int ii = 0; ii < cleanBonus; ii++) {
								this.dimPaleogene++;
							}
						}
						else if (itemNeogene
								&& this.dimNeogene < this.maxResearch) {
							for (int ii = 0; ii < cleanBonus; ii++) {
								this.dimNeogene++;
							}
						}
						else if (itemPleistocene
								&& this.dimPleistocene < this.maxResearch) {
							for (int ii = 0; ii < cleanBonus; ii++) {
								this.dimPleistocene++;
							}
						}
					}

					stackProcessing.shrink(1);
					this.notifyBlockUpdate();
				}
			}
			markDirty();
		}

		public boolean getProcessing() {
			return this.isProcessing;
		}

		@Override
		public int getInventoryStackLimit() {
			return 64;
		}

		@Override
		public int getSizeInventory() {
			return 1;
		}

		@Override
		public String getName() {
			return "container.time_researcher";
		}

		@Override
		public String getGuiID()
		{
			return "lepidodendron:gui_time_researcher";
		}

		@Override
		public Container createContainer(InventoryPlayer playerInventory, EntityPlayer playerIn) {
			return new GUITimeResearcher.GUILepidodendronTimeResearcher(this.getWorld(), this.getPos().getX(), this.getPos().getY(), this.getPos().getZ(), playerIn);
		}

		@Override
		public void readFromNBT(NBTTagCompound compound) {
			super.readFromNBT(compound);
			if (compound.hasKey("energystored")) {
				this.energy = compound.getInteger("energystored");
			}
			if (compound.hasKey("processTick")) {
				this.processTick = compound.getInteger("processTick");
			}
			if (compound.hasKey("isProcessing")) {
				this.isProcessing = compound.getBoolean("isProcessing");
			}
			if (compound.hasKey("dimPrecambrian")) {
				this.dimPrecambrian = compound.getInteger("dimPrecambrian");
			}
			if (compound.hasKey("dimCambrian")) {
				this.dimCambrian = compound.getInteger("dimCambrian");
			}
			if (compound.hasKey("dimOrdovician")) {
				this.dimOrdovician = compound.getInteger("dimOrdovician");
			}
			if (compound.hasKey("dimSilurian")) {
				this.dimSilurian = compound.getInteger("dimSilurian");
			}
			if (compound.hasKey("dimDevonian")) {
				this.dimDevonian = compound.getInteger("dimDevonian");
			}
			if (compound.hasKey("dimCarboniferous")) {
				this.dimCarboniferous = compound.getInteger("dimCarboniferous");
			}
			if (compound.hasKey("dimPermian")) {
				this.dimPermian = compound.getInteger("dimPermian");
			}
			if (compound.hasKey("dimTriassic")) {
				this.dimTriassic = compound.getInteger("dimTriassic");
			}
			if (compound.hasKey("dimJurassic")) {
				this.dimJurassic = compound.getInteger("dimJurassic");
			}
			if (compound.hasKey("dimCretaceousEarly")) {
				this.dimCretaceousEarly = compound.getInteger("dimCretaceousEarly");
			}
			if (compound.hasKey("dimCretaceousLate")) {
				this.dimCretaceousLate = compound.getInteger("dimCretaceousLate");
			}
			if (compound.hasKey("dimPaleogene")) {
				this.dimPaleogene = compound.getInteger("dimPaleogene");
			}
			if (compound.hasKey("dimNeogene")) {
				this.dimNeogene = compound.getInteger("dimNeogene");
			}
			if (compound.hasKey("dimPleistocene")) {
				this.dimPleistocene = compound.getInteger("dimPleistocene");
			}
			this.forgeContents = NonNullList.<ItemStack>withSize(this.getSizeInventory(), ItemStack.EMPTY);
			if (!this.checkLootAndRead(compound)) {
				ItemStackHelper.loadAllItems(compound, this.forgeContents);
			}
		}

		@Override
		public NBTTagCompound writeToNBT(NBTTagCompound compound) {
			super.writeToNBT(compound);
			compound.setInteger("energystored", this.energy);
			compound.setBoolean("isProcessing", this.isProcessing);
			compound.setInteger("processTick", this.processTick);
			compound.setInteger("dimPrecambrian", this.dimPrecambrian);
			compound.setInteger("dimCambrian", this.dimCambrian);
			compound.setInteger("dimOrdovician", this.dimOrdovician);
			compound.setInteger("dimSilurian", this.dimSilurian);
			compound.setInteger("dimDevonian", this.dimDevonian);
			compound.setInteger("dimCarboniferous", this.dimCarboniferous);
			compound.setInteger("dimPermian", this.dimPermian);
			compound.setInteger("dimTriassic", this.dimTriassic);
			compound.setInteger("dimJurassic", this.dimJurassic);
			compound.setInteger("dimCretaceousEarly", this.dimCretaceousEarly);
			compound.setInteger("dimCretaceousLate", this.dimCretaceousLate);
			compound.setInteger("dimPaleogene", this.dimPaleogene);
			compound.setInteger("dimNeogene", this.dimNeogene);
			compound.setInteger("dimPleistocene", this.dimPleistocene);
			if (!this.checkLootAndWrite(compound)) {
				ItemStackHelper.saveAllItems(compound, this.forgeContents);
			}
			return compound;
		}

		public void notifyBlockUpdate() {
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
			return new int[]{0,1};
		}

		@Override
		public boolean canInsertItem(int index, ItemStack itemStackIn, EnumFacing direction) {
			return false;
		}

		@Override
		public boolean canExtractItem(int index, ItemStack stack, EnumFacing direction) {
			return false;
		}

		@Override
		public boolean isItemValidForSlot(int index, ItemStack stack) {
			if (index == 0) {
				Item item = stack.getItem();
				Block itemBlock = Block.getBlockFromItem(item);
				if (itemBlock == BlockFossilPrecambrian.block
						|| itemBlock == BlockFossilCambrian.block
						|| itemBlock == BlockFossilOrdovician.block
						|| itemBlock == BlockFossilSilurian.block
						|| itemBlock == BlockFossilDevonian.block
						|| itemBlock == BlockFossilCarboniferous.block
						|| itemBlock == BlockFossilPermian.block
						|| itemBlock == BlockFossilTriassic.block
						|| itemBlock == BlockFossilJurassic.block
						|| itemBlock == BlockFossilCretaceous.block
						|| itemBlock == BlockFossilPaleogene.block
						|| itemBlock == BlockFossilNeogene.block
						|| itemBlock == BlockFossilPleistocene.block
						|| item == ItemFossilPrecambrian.block
						|| item == ItemFossilCambrian.block
						|| item == ItemFossilOrdovician.block
						|| item == ItemFossilSilurian.block
						|| item == ItemFossilDevonian.block
						|| item == ItemFossilCarboniferous.block
						|| item == ItemFossilPermian.block
						|| item == ItemFossilTriassic.block
						|| item == ItemFossilJurassic.block
						|| item == ItemFossilCretaceous.block
						|| item == ItemFossilPaleogene.block
						|| item == ItemFossilNeogene.block
						|| item == ItemFossilPleistocene.block
				) {
					return true;
				}
				if (item == ItemFossilClean.block
						|| item == ItemPhialDNA.block
						|| item == ItemPlaceableLiving.block) {
					if (stack.hasTagCompound()) {
						if (stack.getTagCompound().hasKey("period")) {
							return true;
						}
					}
				}
			}
			if (index == 1)
				return false;

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
			EnumFacing blockFacing = this.getWorld().getBlockState(this.getPos()).getValue(BlockTimeResearcher.BlockCustom.FACING).getOpposite();
			return (capability == CapabilityEnergy.ENERGY && facing == blockFacing) ? (T) this : null;
		}

		public void drainEnergy(int energy) {
			TileEntity tileEntity = world.getTileEntity(this.getPos());
			if (tileEntity != null) {
				if (tileEntity instanceof BlockTimeResearcher.TileEntityTimeResearcher) {
					BlockTimeResearcher.TileEntityTimeResearcher te = (BlockTimeResearcher.TileEntityTimeResearcher) tileEntity;
					te.extractEnergy(energy,false);
				}
			}
		}

		public boolean hasEnergy(int minEnergy) {
			if (!LepidodendronConfig.machinesRF) {
				return true;
			}
			TileEntity tileEntity = world.getTileEntity(this.getPos());
			if (tileEntity != null) {
				if (tileEntity instanceof BlockTimeResearcher.TileEntityTimeResearcher) {
					BlockTimeResearcher.TileEntityTimeResearcher te = (BlockTimeResearcher.TileEntityTimeResearcher) tileEntity;
					return te.getEnergyStored() > minEnergy;
				}
			}
			return false;
		}

		//Energy addin:
		//-------------
		protected int energy;
		protected int capacity = 50000;
		protected int maxReceive = 2000;
		protected int maxExtract = 500;

		@Override
		public boolean hasCapability(Capability<?> capability, @Nullable EnumFacing facing) {
			IBlockState blockstate = this.getWorld().getBlockState(this.getPos());
			if (blockstate != null) {
				if (blockstate.getBlock() == BlockTimeResearcher.block) {
					EnumFacing blockFacing = this.getWorld().getBlockState(this.getPos()).getValue(BlockTimeResearcher.BlockCustom.FACING).getOpposite();
					if (capability == CapabilityEnergy.ENERGY && facing == blockFacing) {
						return true;
					}
				}
			}
			return super.hasCapability(capability, facing);
		}

		@Override
		public int receiveEnergy(int maxReceive, boolean simulate)
		{
			if (!canReceive())
				return 0;

			int energyReceived = Math.min(capacity - energy, Math.min(this.maxReceive, maxReceive));
			if (!simulate) {
				energy += energyReceived;
				if (energyReceived > 0) {
					this.getWorld().notifyBlockUpdate(this.getPos(), this.getWorld().getBlockState(this.getPos()), this.getWorld().getBlockState(this.getPos()), 3);
				}
			}
			return energyReceived;
		}

		@Override
		public int extractEnergy(int maxExtract, boolean simulate)
		{
			if (!canExtract())
				return 0;

			int energyExtracted = Math.min(energy, Math.min(this.maxExtract, maxExtract));
			if (!simulate) {
				energy -= energyExtracted;
				if (energyExtracted > 0) {
					this.getWorld().notifyBlockUpdate(this.getPos(), this.getWorld().getBlockState(this.getPos()), this.getWorld().getBlockState(this.getPos()), 3);
				}
			}
			return energyExtracted;
		}

		@Override
		public int getEnergyStored()
		{
			return energy;
		}

		@Override
		public int getMaxEnergyStored()
		{
			return capacity;
		}

		@Override
		public boolean canExtract()
		{
			return this.maxExtract > 0;
		}

		@Override
		public boolean canReceive()
		{
			return this.maxReceive > 0;
		}

		public double getEnergyFraction() {
			if (this.capacity > 0) {
				return ((double) this.energy) / ((double) this.capacity);
			}
			return 0;
		}

	}
}