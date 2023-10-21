
package net.lepidodendron.block;

import net.lepidodendron.ElementsLepidodendronMod;
import net.lepidodendron.LepidodendronConfig;
import net.lepidodendron.LepidodendronSorter;
import net.lepidodendron.block.base.IAdvancementGranter;
import net.lepidodendron.creativetab.TabLepidodendronPlants;
import net.lepidodendron.item.ItemHydrangeaFlowerBlue;
import net.lepidodendron.item.ItemHydrangeaFlowerPink;
import net.lepidodendron.item.ItemHydrangeaFlowerWhite;
import net.lepidodendron.item.ItemHydrangeaSeeds;
import net.lepidodendron.util.CustomTrigger;
import net.lepidodendron.util.ModTriggers;
import net.minecraft.block.Block;
import net.minecraft.block.BlockBush;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.properties.PropertyInteger;
import net.minecraft.block.state.BlockStateContainer;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemShears;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.NonNullList;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.common.EnumPlantType;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.items.ItemHandlerHelper;
import net.minecraftforge.oredict.OreDictionary;

import javax.annotation.Nullable;
import java.util.List;
import java.util.Random;

@ElementsLepidodendronMod.ModElement.Tag
public class BlockHydrangea extends ElementsLepidodendronMod.ModElement {
	@GameRegistry.ObjectHolder("lepidodendron:hydrangea")
	public static final Block block = null;
	public BlockHydrangea(ElementsLepidodendronMod instance) {
		super(instance, LepidodendronSorter.hydrangea);
	}

	@Override
	public void initElements() {
		elements.blocks.add(() -> new BlockCustomFlower());
		elements.items.add(() -> new ItemBlock(block).setRegistryName(block.getRegistryName()));
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(block), 0,
				new ModelResourceLocation("lepidodendron:hydrangea", "inventory"));
	}

	@Override
	public void init(FMLInitializationEvent event) {
		super.init(event);
		OreDictionary.registerOre("plantdnaPNlepidodendron:hydrangea", BlockHydrangea.block);
		OreDictionary.registerOre("plantPrehistoric", BlockHydrangea.block);
		OreDictionary.registerOre("plant", BlockHydrangea.block);
	}


	public static class BlockCustomFlower extends BlockBush implements IAdvancementGranter {
		public static final PropertyInteger COLOUR = PropertyInteger.create("colour", 0, 2);

		public BlockCustomFlower() {
			super(Material.PLANTS);
			setSoundType(SoundType.PLANT);
			setCreativeTab(TabLepidodendronPlants.tab);
			setHardness(0F);
			setResistance(0F);
			setLightLevel(0F);
			setTranslationKey("pf_hydrangea");
			setRegistryName("hydrangea");
			this.setDefaultState(this.blockState.getBaseState().withProperty(COLOUR, 0));
		}

		@Nullable
		@Override
		public CustomTrigger getModTrigger() {
			return ModTriggers.CLICK_HYDRANGEA;
		}

		protected BlockStateContainer createBlockState()
		{
			return new BlockStateContainer(this, new IProperty[] {COLOUR});
		}

		public IBlockState getStateFromMeta(int meta) {
			return this.getDefaultState().withProperty(COLOUR, meta);
		}

		public int getMetaFromState(IBlockState state) {
			return state.getValue(COLOUR);
		}

		@Override
		public void onBlockAdded(World worldIn, BlockPos pos, IBlockState state) {
			worldIn.setBlockState(pos, this.getDefaultState().withProperty(COLOUR, getColourState(worldIn, pos)));
			super.onBlockAdded(worldIn, pos, state);
		}

		@Override
		public IBlockState getStateForPlacement(World worldIn, BlockPos pos, EnumFacing facing, float hitX, float hitY, float hitZ, int meta, EntityLivingBase placer) {
			return this.getDefaultState().withProperty(COLOUR, getColourState(worldIn, pos));
		}

		@Override
		public void updateTick(World world, BlockPos pos, IBlockState state, Random random) {
			super.updateTick(world, pos, state, random);
			//Update the colour forcefully:
			world.setBlockState(pos, this.getDefaultState().withProperty(COLOUR, getColourState(world, pos)));
		}

		public static int getColourState(World world, BlockPos pos) {
			if (world.getBlockState(pos.down()).getMaterial() == Material.CLAY) {
				return 1; //pink
			}
			else if (world.getBlockState(pos.down(2)).getMaterial() == Material.CLAY) {
				return 1; //pink
			}
			if (world.getBlockState(pos.down()).getBlock() == BlockPeat.block) {
				return 2; //blue
			}
			else if (world.getBlockState(pos.down(2)).getBlock() == BlockPeat.block) {
				return 2; //blue
			}
			else {
				return 0; //white
			}
		}

		@Override
		public void harvestBlock(World worldIn, EntityPlayer player, BlockPos pos, IBlockState state, @Nullable TileEntity te, ItemStack stack) {
			if (stack.getItem() == Items.SHEARS && LepidodendronConfig.doPropagation
					&&
					(worldIn.getBlockState(pos.down()).getMaterial() == Material.GROUND
							|| worldIn.getBlockState(pos.down()).getMaterial() == Material.SAND
							|| worldIn.getBlockState(pos.down()).getMaterial() == Material.ROCK
							|| worldIn.getBlockState(pos.down()).getMaterial() == Material.CLAY
							|| worldIn.getBlockState(pos.down()).getMaterial() == Material.GRASS
					)
			) {
				EntityItem entityToSpawn = new EntityItem(worldIn, pos.getX(), pos.getY(), pos.getZ(), new ItemStack(this, (int) (1)));
				entityToSpawn.setPickupDelay(10);
				worldIn.spawnEntity(entityToSpawn);
			} else {
				super.harvestBlock(worldIn, player, pos, state, te, stack);
			}
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
		public int getFlammability(IBlockAccess world, BlockPos pos, EnumFacing face) {
			return 100;
		}

		@Override
		public int getFireSpreadSpeed(IBlockAccess world, BlockPos pos, EnumFacing face) {
			return 60;
		}

		@Override
		public void getDrops(NonNullList<ItemStack> drops, IBlockAccess world, BlockPos pos, IBlockState state, int fortune) {
			if (!LepidodendronConfig.doPropagation) {
				drops.add(new ItemStack(this));
				if (Math.random() > 0.66) {
					drops.add(new ItemStack(this));
				}
			}
		}

		@Override
		public ItemStack getPickBlock(IBlockState state, RayTraceResult target, World world, BlockPos pos, EntityPlayer player) {
			return new ItemStack(Item.getItemFromBlock(this), 1, this.damageDropped(state));
		}

		@Override
		public EnumPlantType getPlantType(IBlockAccess world, BlockPos pos) {
			return EnumPlantType.Plains;
		}

		//@Override
		//public BlockFlower.EnumFlowerColor getBlockType() {
		//	return BlockFlower.EnumFlowerColor.YELLOW;
		//}

		//@SideOnly(Side.CLIENT)
		//@Override
		//public void getSubBlocks(CreativeTabs tab, net.minecraft.util.NonNullList<ItemStack> list) {
		//	for (BlockFlower.EnumFlowerType blockflower$enumflowertype : BlockFlower.EnumFlowerType.getTypes(this.getBlockType())) {
		//		list.add(new ItemStack(this, 1, blockflower$enumflowertype.getMeta()));
		//	}
		//}

		@SideOnly(Side.CLIENT)
		@Override
		public void addInformation(ItemStack stack, World player, List<String> tooltip, ITooltipFlag advanced) {
			if (LepidodendronConfig.showTooltips) {
				tooltip.add("Type: Flowering plant");
				tooltip.add("Periods: Paleogene - Neogene - Pleistocene [- present]");
				tooltip.add("Propagation: flowers");
			}
			super.addInformation(stack, player, tooltip, advanced);
		}

		@Override
		public EnumOffsetType getOffsetType() {
			return EnumOffsetType.XZ;
		}


		@Override
		public boolean onBlockActivated(World worldIn, BlockPos pos, IBlockState state, EntityPlayer playerIn, EnumHand hand, EnumFacing facing, float hitX, float hitY, float hitZ) {
			//right-click block:
			if (!(worldIn.isRemote)) {
				ItemStack stack = playerIn.getHeldItem(hand);
				if ((playerIn.capabilities.allowEdit) && stack.getItem() instanceof ItemShears
						&& hand == EnumHand.MAIN_HAND) {
					//playerIn.swingArm(hand);
					if (Math.random() > 0.95) {
						worldIn.destroyBlock(pos, false);
					}
					IBlockState stateColour = worldIn.getBlockState(pos);
					if (stateColour.getValue(COLOUR) == 0) {
						Block.spawnAsEntity(worldIn, pos, new ItemStack(ItemHydrangeaFlowerWhite.block, 1));
					} else if (stateColour.getValue(COLOUR) == 1) {
						Block.spawnAsEntity(worldIn, pos, new ItemStack(ItemHydrangeaFlowerPink.block, 1));
					} else if (stateColour.getValue(COLOUR) == 2) {
						Block.spawnAsEntity(worldIn, pos, new ItemStack(ItemHydrangeaFlowerBlue.block, 1));
					}
					stack.damageItem(1, playerIn);
					return true;
				}

				if ((!playerIn.capabilities.allowEdit)
						|| (playerIn.getHeldItemMainhand().getItem() != new ItemStack(ItemHydrangeaFlowerPink.block, (int) (1)).getItem()
						&& playerIn.getHeldItemMainhand().getItem() != new ItemStack(ItemHydrangeaFlowerWhite.block, (int) (1)).getItem()
						&& playerIn.getHeldItemMainhand().getItem() != new ItemStack(ItemHydrangeaFlowerBlue.block, (int) (1)).getItem()
				)
						|| !LepidodendronConfig.doPropagation) {
					return true;
				} else {
					ItemStack itemstack = playerIn.getHeldItem(hand);
					if (!playerIn.isCreative()) {
						itemstack.shrink(1);
					}
					if (!((hand != playerIn.getActiveHand()) && (hand == EnumHand.MAIN_HAND))) {
						if (Math.random() > 0.5) {
							ItemStack stackSeed = new ItemStack(ItemHydrangeaSeeds.block, (int) (1));
							stackSeed.setCount(1);
							ItemHandlerHelper.giveItemToPlayer(playerIn, stackSeed);
							if (Math.random() > 0.75) {
								worldIn.destroyBlock(pos, false);
							}
							return true;
						} else {
							if (Math.random() > 0.75) {
								worldIn.destroyBlock(pos, false);
								return true;
							}
						}
					}
					return true;
				}
			}
			else {
				return super.onBlockActivated(worldIn, pos, state, playerIn, hand, facing, hitX, hitY, hitZ);
			}
		}
	}
}

