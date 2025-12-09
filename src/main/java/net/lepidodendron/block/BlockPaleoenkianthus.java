
package net.lepidodendron.block;

import net.lepidodendron.ElementsLepidodendronMod;
import net.lepidodendron.LepidodendronConfig;
import net.lepidodendron.LepidodendronSorter;
import net.lepidodendron.block.base.IAdvancementGranter;
import net.lepidodendron.creativetab.TabLepidodendronPlants;
import net.lepidodendron.item.ItemPaleoenkianthusFlower;
import net.lepidodendron.item.ItemPaleoenkianthusSeeds;
import net.lepidodendron.util.CustomTrigger;
import net.lepidodendron.util.ModTriggers;
import net.minecraft.block.Block;
import net.minecraft.block.BlockBush;
import net.minecraft.block.BlockLeaves;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.properties.PropertyBool;
import net.minecraft.block.state.BlockFaceShape;
import net.minecraft.block.state.BlockStateContainer;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.client.renderer.block.statemap.StateMap;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemShears;
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
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
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
public class BlockPaleoenkianthus extends ElementsLepidodendronMod.ModElement {
	@GameRegistry.ObjectHolder("lepidodendron:paleoenkianthus")
	public static final Block block = null;
	public BlockPaleoenkianthus(ElementsLepidodendronMod instance) {
		super(instance, LepidodendronSorter.paleoenkianthus);
	}

	@Override
	public void initElements() {
		elements.blocks.add(() -> new BlockCustom().setRegistryName("paleoenkianthus"));
		elements.items.add(() -> new ItemBlock(block).setRegistryName(block.getRegistryName()));
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(block), 0,
				new ModelResourceLocation("lepidodendron:paleoenkianthus", "inventory"));
		ModelLoader.setCustomStateMapper(block, (new StateMap.Builder()).ignore(BlockLeaves.DECAYABLE, BlockLeaves.CHECK_DECAY).build());
	}

	@Override
	public void init(FMLInitializationEvent event) {
		super.init(event);
		OreDictionary.registerOre("plantdnaPNlepidodendron:paleoenkianthus", BlockPaleoenkianthus.block);
		OreDictionary.registerOre("plantPrehistoric", BlockPaleoenkianthus.block);
		OreDictionary.registerOre("plant", BlockPaleoenkianthus.block);
	}

	public static class BlockCustom extends BlockBush implements IAdvancementGranter {

		public static final PropertyBool FLOWERS = PropertyBool.create("flowers");

		public BlockCustom() {
			super();
			setTranslationKey("pf_paleoenkianthus");
			setSoundType(SoundType.PLANT);
			setHardness(0.3F);
			setResistance(0.3F);
			setLightLevel(0F);
			setLightOpacity(0);
			setCreativeTab(TabLepidodendronPlants.tab);
			this.setDefaultState(this.blockState.getBaseState().withProperty(FLOWERS, false));
		}

		@Nullable
		@Override
		public CustomTrigger getModTrigger() {
			return ModTriggers.CLICK_PALEOENKIANTHUS;
		}

		@Override
		public boolean onBlockActivated(World worldIn, BlockPos pos, IBlockState state, EntityPlayer playerIn, EnumHand hand, EnumFacing facing, float hitX, float hitY, float hitZ) {
			//right-click block:
			if ((!(worldIn.isRemote)) && worldIn.getBlockState(pos).getValue(FLOWERS)) {
				ItemStack stack = playerIn.getHeldItem(hand);
				if ((playerIn.capabilities.allowEdit) && stack.getItem() instanceof ItemShears
						&& hand == EnumHand.MAIN_HAND)
				{
					//playerIn.swingArm(hand);
					if (!(worldIn.isRemote) && Math.random() > 0.95) {
						worldIn.destroyBlock(pos, false);
					}
					Block.spawnAsEntity(worldIn, pos, new ItemStack(ItemPaleoenkianthusFlower.block, 1));
					stack.damageItem(1, playerIn);
					return true;
				}

				if ((!playerIn.capabilities.allowEdit) || (playerIn.getHeldItemMainhand().getItem() != ItemPaleoenkianthusFlower.block) || (!LepidodendronConfig.doPropagation) || (!worldIn.getBlockState(pos).getValue(FLOWERS)))
				{
					return true;
				}
				else {
					ItemStack itemstack = playerIn.getHeldItem(hand);
					if (!playerIn.isCreative()) {itemstack.shrink(1);}
					if (!((hand != playerIn.getActiveHand()) && (hand == EnumHand.MAIN_HAND))) {
						if (Math.random() > 0.5) {
							ItemStack stackSeed = new ItemStack(ItemPaleoenkianthusSeeds.block, (int) (1));
							stackSeed.setCount(1);
							ItemHandlerHelper.giveItemToPlayer(playerIn, stackSeed);
							if (Math.random() > 0.75) {
								worldIn.destroyBlock(pos, false);
							}
							return true;
						}
						else {
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

		@Override
		public void neighborChanged(IBlockState state, World world, BlockPos pos, Block neighborBlock, BlockPos fromPos) {
			
			super.neighborChanged(state, world, pos, neighborBlock, fromPos);

			if ((world.getBlockState(pos.down()).getMaterial() != Material.GROUND)
				&& (world.getBlockState(pos.down()).getMaterial() != Material.GRASS)
					&& (world.getBlockState(pos.down()).getBlock() != BlockGravelSticky.block)
				&& (world.getBlockState(pos.down()).getBlock() != Blocks.GRAVEL.getDefaultState().getBlock()))
			{
				world.destroyBlock(pos, false);
				if (Math.random() > 0.66) {
					if (!LepidodendronConfig.doPropagation) {
						//Spawn another sapling:
						if (!world.isRemote) {
							EntityItem entityToSpawn = new EntityItem(world, pos.getX(), pos.getY(), pos.getZ(), new ItemStack(BlockPaleoenkianthus.block, (int) (1)));
							entityToSpawn.setPickupDelay(10);
							world.spawnEntity(entityToSpawn);
						}
					}
				}
			}
			
		}

		protected BlockStateContainer createBlockState()
		{
			return new BlockStateContainer(this, new IProperty[] {FLOWERS});
		}

		public IBlockState getStateFromMeta(int meta) {
			return this.getDefaultState().withProperty(FLOWERS, (meta & 1) != 0);
		}

		public int getMetaFromState(IBlockState state) {
			int i = 0;
			if (!(Boolean) state.getValue(FLOWERS))
				i |= 1;
			return i;
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
			}
			else {
				super.harvestBlock(worldIn, player, pos, state, te, stack);
			}
		}

		@Override
		public int getFlammability(IBlockAccess world, BlockPos pos, EnumFacing face) {
			return 100;
		}

		@Override
		public int getFireSpreadSpeed(IBlockAccess world, BlockPos pos, EnumFacing face) {
			return 60;
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
			return new AxisAlignedBB(0D, 0D, 0D, 1D, 0.7D, 1D);
		}

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
			return new ItemStack(Item.getItemFromBlock(this), 1, this.damageDropped(state));
		}

		@Override
		public void getDrops(NonNullList<ItemStack> drops, IBlockAccess world, BlockPos pos, IBlockState state, int fortune) {
			if (LepidodendronConfig.doPropagation) {
				drops.add(new ItemStack(Blocks.AIR, (int) (1)));
			}
			else {
				drops.add(new ItemStack(this, (int) (1)));
			}
		}

		@Override
		protected boolean canSilkHarvest()
		{
			return false;
		}

		@Override
		public boolean canPlaceBlockAt(World world, BlockPos pos) {
			if (!world.isAirBlock(pos) && super.canPlaceBlockAt(world, pos)
					&& world.isAirBlock(pos.up())
					&& world.isAirBlock(pos.up(2))) {
				return false;
			}
			else return canSurviveAt(world, pos);
		}

		@Override
		public void updateTick(World world, BlockPos pos, IBlockState state, Random random) {
			//super.updateTick(world, pos, state, random);

			if (!world.isRemote)
			{
				if (!world.isAreaLoaded(pos, 3)) return;

				if (!canSurviveAt(world, pos))
				{
					world.destroyBlock(pos, false);
				}
				//Flower-fruit cycle:
				else {
					if ((Math.random() > 0.7)) {
						if ((Math.random() > 0.7)) {
							if (world.getBlockState(pos).getValue(FLOWERS)) {
								world.setBlockState(pos, BlockPaleoenkianthus.block.getDefaultState().withProperty(FLOWERS, false), 3);
							}
							else {
								world.setBlockState(pos, BlockPaleoenkianthus.block.getDefaultState().withProperty(FLOWERS, true), 3);
							}
							world.notifyBlockUpdate(pos, world.getBlockState(pos), world.getBlockState(pos), 3);
						}
					}
				}
			}
		}

		@Override
		public BlockFaceShape getBlockFaceShape(IBlockAccess world, IBlockState state, BlockPos pos, EnumFacing face) {
			return BlockFaceShape.UNDEFINED;
		}

		//@Override
		public boolean canSurviveAt(World worldIn, BlockPos pos) {

			if ((worldIn.getBlockState(pos.down()).getMaterial() != Material.GROUND)
				&& (worldIn.getBlockState(pos.down()).getMaterial() != Material.GRASS)
					&& (worldIn.getBlockState(pos.down()).getBlock() != BlockGravelSticky.block)
				&& (worldIn.getBlockState(pos.down()).getBlock() != Blocks.GRAVEL.getDefaultState().getBlock()))
			{
				return false;
			}

			if (!(worldIn.getBlockState(pos.down()).getBlock().isFullCube(worldIn.getBlockState(pos.down()))))
			{
				return false;
			}
			return true;
		}

		@Override
		public EnumOffsetType getOffsetType() {
			return EnumOffsetType.XZ;
		}

	    @SideOnly(Side.CLIENT)
		@Override
	    public void addInformation(ItemStack stack, World player, List<String> tooltip, ITooltipFlag advanced) {
	        if (LepidodendronConfig.showTooltips) {
				tooltip.add("Type: Flowering plant");
	        	tooltip.add("Periods: Late Cretaceous");
	        	tooltip.add("Propagation: Flowers");}
	        super.addInformation(stack, player, tooltip, advanced);
	    }

	}
}