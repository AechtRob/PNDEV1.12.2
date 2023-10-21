
package net.lepidodendron.block;

import net.lepidodendron.ElementsLepidodendronMod;
import net.lepidodendron.LepidodendronConfig;
import net.lepidodendron.LepidodendronSorter;
import net.lepidodendron.block.base.IAdvancementGranter;
import net.lepidodendron.item.ItemDrimysFlower;
import net.lepidodendron.item.ItemDrimysSeeds;
import net.lepidodendron.util.CustomTrigger;
import net.lepidodendron.util.ModTriggers;
import net.minecraft.block.Block;
import net.minecraft.block.BlockBush;
import net.minecraft.block.BlockLeaves;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.properties.PropertyBool;
import net.minecraft.block.state.BlockFaceShape;
import net.minecraft.block.state.BlockStateContainer;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.renderer.block.statemap.StateMap;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemShears;
import net.minecraft.item.ItemStack;
import net.minecraft.util.BlockRenderLayer;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.items.ItemHandlerHelper;

import javax.annotation.Nullable;

@ElementsLepidodendronMod.ModElement.Tag
public class BlockDrimys2 extends ElementsLepidodendronMod.ModElement {
	@GameRegistry.ObjectHolder("lepidodendron:drimys2")
	public static final Block block = null;
	public BlockDrimys2(ElementsLepidodendronMod instance) {
		super(instance, LepidodendronSorter.drimys);
	}

	@Override
	public void initElements() {
		elements.blocks.add(() -> new BlockCustom().setRegistryName("drimys2"));
		//elements.items.add(() -> new ItemBlock(block).setRegistryName(block.getRegistryName()));
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		//ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(block), 0,
		//		new ModelResourceLocation("lepidodendron:drimys2", "inventory"));
		ModelLoader.setCustomStateMapper(block, (new StateMap.Builder()).ignore(BlockLeaves.DECAYABLE, BlockLeaves.CHECK_DECAY).build());
	}
	public static class BlockCustom extends BlockBush implements IAdvancementGranter {

		public static final PropertyBool FLOWERS = PropertyBool.create("flowers");

		public BlockCustom() {
			//super();
			setTranslationKey("pf_drimys2");
			setSoundType(SoundType.PLANT);
			setHardness(0.2F);
			setResistance(0.2F);
			setLightLevel(0F);
			setLightOpacity(0);
			setCreativeTab(null);
			this.setDefaultState(this.blockState.getBaseState().withProperty(FLOWERS, false));
		}

		@Nullable
		@Override
		public CustomTrigger getModTrigger() {
			return ModTriggers.CLICK_DRIMYS;
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
					Block.spawnAsEntity(worldIn, pos, new ItemStack(ItemDrimysFlower.block, 1));
					stack.damageItem(1, playerIn);
					return true;
				}

				if ((!playerIn.capabilities.allowEdit) || (playerIn.getHeldItemMainhand().getItem() != ItemDrimysFlower.block) || (!LepidodendronConfig.doPropagation) || (!worldIn.getBlockState(pos).getValue(FLOWERS)))
				{
					return true;
				}
				else {
					ItemStack itemstack = playerIn.getHeldItem(hand);
					if (!playerIn.isCreative()) {itemstack.shrink(1);}
					if (!((hand != playerIn.getActiveHand()) && (hand == EnumHand.MAIN_HAND))) {
						if (Math.random() > 0.5) {
							ItemStack stackSeed = new ItemStack(ItemDrimysSeeds.block, (int) (1));
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
		@Nullable
		public AxisAlignedBB getCollisionBoundingBox(IBlockState blockState, IBlockAccess worldIn, BlockPos pos) {
			return NULL_AABB;
		}

		@Override
		public boolean isPassable(IBlockAccess worldIn, BlockPos pos) {
			return true;
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

		@Override
		public int getFlammability(IBlockAccess world, BlockPos pos, EnumFacing face) {
			return 60;
		}

		@Override
		public int getFireSpreadSpeed(IBlockAccess world, BlockPos pos, EnumFacing face) {
			return 30;
		}

		@Override
		public ItemStack getPickBlock(IBlockState state, RayTraceResult target, World world, BlockPos pos, EntityPlayer player) {
			return new ItemStack(BlockDrimys.block, (int) (1));
		}

		@Override
		public MapColor getMapColor(IBlockState state, IBlockAccess blockAccess, BlockPos pos) {
			return MapColor.FOLIAGE;
		}


		@Override
		public Item getItemDropped(IBlockState state, java.util.Random rand, int fortune) {
			if (LepidodendronConfig.doPropagation) {
				return new ItemStack(Items.AIR, (int) (1)).getItem();
			}
			else {
				return Item.getItemFromBlock(BlockDrimys.block);
			}
		}

		@Override
		protected boolean canSilkHarvest()
		{
			return false;
		}

		@Override
		public boolean canBlockStay(World worldIn, BlockPos pos, IBlockState state)
		{
			return worldIn.getBlockState(pos.down()).getBlock() == BlockDrimys.block;
		}

	    @Override
		public void neighborChanged(IBlockState state, World world, BlockPos pos, Block neighborBlock, BlockPos fromPos) {
			
			super.neighborChanged(state, world, pos, neighborBlock, fromPos);
			
			Block block = world.getBlockState(pos.down()).getBlock();
			Block blockU = world.getBlockState(pos.up()).getBlock();
			if ((block != BlockDrimys.block)
					|| (blockU != BlockDrimys3.block)) {
				world.setBlockToAir(pos);
				if (Math.random() > 0.66) {
					if (!LepidodendronConfig.doPropagation) {
						//Spawn another sapling:
						if (!world.isRemote) {
							EntityItem entityToSpawn = new EntityItem(world, pos.getX(), pos.getY(), pos.getZ(), new ItemStack(BlockDrimys.block, (int) (1)));
							entityToSpawn.setPickupDelay(10);
							world.spawnEntity(entityToSpawn);
						}
					}
				}
			}
		}

		@Override
	    public BlockFaceShape getBlockFaceShape(IBlockAccess worldIn, IBlockState state, BlockPos pos, EnumFacing face)
	    {
	        return BlockFaceShape.UNDEFINED;
	    }

		@Override
		public EnumOffsetType getOffsetType() {
			return EnumOffsetType.XZ;
		}

	}
}
