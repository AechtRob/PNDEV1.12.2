
package net.lepidodendron.block;

import com.google.common.base.Predicate;
import net.lepidodendron.ElementsLepidodendronMod;
import net.lepidodendron.LepidodendronSorter;
import net.lepidodendron.entity.EntityPrehistoricFloraGuanoGolem;
import net.lepidodendron.item.ItemBatHeadItem;
import net.lepidodendron.util.ParticleGuano;
import net.minecraft.advancements.CriteriaTriggers;
import net.minecraft.block.Block;
import net.minecraft.block.BlockDirectional;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.properties.PropertyBool;
import net.minecraft.block.properties.PropertyDirection;
import net.minecraft.block.state.BlockStateContainer;
import net.minecraft.block.state.BlockWorldState;
import net.minecraft.block.state.IBlockState;
import net.minecraft.block.state.pattern.BlockPattern;
import net.minecraft.block.state.pattern.BlockStateMatcher;
import net.minecraft.block.state.pattern.FactoryBlockPattern;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.statemap.StateMap;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.network.NetworkManager;
import net.minecraft.network.play.server.SPacketUpdateTileEntity;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.*;
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

import javax.annotation.Nullable;
import java.util.Random;

@ElementsLepidodendronMod.ModElement.Tag
public class BlockBatHead extends ElementsLepidodendronMod.ModElement {
	@GameRegistry.ObjectHolder("lepidodendron:bat_head")
	public static final Block block = null;

	public BlockBatHead(ElementsLepidodendronMod instance) {
		super(instance, LepidodendronSorter.bat_head);
	}

	@Override
	public void initElements() {
		elements.blocks.add(() -> new BlockCustom().setRegistryName("bat_head"));
		//elements.items.add(() -> new ItemBlock(block).setRegistryName(block.getRegistryName()));
	}

	@Override
	public void init(FMLInitializationEvent event) {
		super.init(event);
		GameRegistry.registerTileEntity(BlockBatHead.TileEntityCustom.class, "lepidodendron:tileentitybat_head");
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomStateMapper(block, (new StateMap.Builder()).ignore(BlockBatHead.NODROP).build());
//		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(block), 0,
//				new ModelResourceLocation("lepidodendron:bat_head", "inventory"));
	}

	public static final PropertyDirection FACING = BlockDirectional.FACING;
	public static final PropertyBool NODROP = PropertyBool.create("nodrop");
	protected static final AxisAlignedBB DEFAULT_AABB = new AxisAlignedBB(0.25D, 0.0D, 0.25D, 0.75D, 0.5D, 0.75D);
	protected static final AxisAlignedBB NORTH_AABB = new AxisAlignedBB(0.25D, 0.25D, 0.5D, 0.75D, 0.75D, 1.0D);
	protected static final AxisAlignedBB SOUTH_AABB = new AxisAlignedBB(0.25D, 0.25D, 0.0D, 0.75D, 0.75D, 0.5D);
	protected static final AxisAlignedBB WEST_AABB = new AxisAlignedBB(0.5D, 0.25D, 0.25D, 1.0D, 0.75D, 0.75D);
	protected static final AxisAlignedBB EAST_AABB = new AxisAlignedBB(0.0D, 0.25D, 0.25D, 0.5D, 0.75D, 0.75D);
	private static final Predicate<BlockWorldState> IS_BATHEAD = new Predicate<BlockWorldState>() {
		public boolean apply(@Nullable BlockWorldState state) {
			return state.getBlockState() != null && state.getBlockState().getBlock() == BlockBatHead.block;
		}
	};

	public static class BlockCustom extends Block {
		public BlockCustom() {
			super(Material.CIRCUITS);
			this.setDefaultState(this.blockState.getBaseState().withProperty(FACING, EnumFacing.UP).withProperty(NODROP, Boolean.valueOf(false)));
			setTranslationKey("pf_bat_head");
			setCreativeTab(null);
		}

		private BlockPattern guanogolemBasePattern;
		private BlockPattern guanogolemPattern;

		@Override
		public MapColor getMapColor(IBlockState state, IBlockAccess worldIn, BlockPos pos) {
			return MapColor.BROWN;
		}

		@SideOnly(Side.CLIENT)
		public boolean hasCustomBreakingProgress(IBlockState state)
		{
			return true;
		}

		@Override
		public ItemStack getPickBlock(IBlockState state, RayTraceResult target, World world, BlockPos pos, EntityPlayer player) {
			return new ItemStack(ItemBatHeadItem.block, 1);
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
		public boolean isOpaqueCube(IBlockState state) {
			return false;
		}

		@Override
		public boolean isFullCube(IBlockState state) {
			return false;
		}

		@Override
		public AxisAlignedBB getBoundingBox(IBlockState state, IBlockAccess source, BlockPos pos) {
			switch ((EnumFacing) state.getValue(FACING)) {
				case UP:
				default:
					return DEFAULT_AABB;
				case NORTH:
					return NORTH_AABB;
				case SOUTH:
					return SOUTH_AABB;
				case WEST:
					return WEST_AABB;
				case EAST:
					return EAST_AABB;
			}
		}

		@Override
		public IBlockState getStateForPlacement(World worldIn, BlockPos pos, EnumFacing facing, float hitX, float hitY, float hitZ, int meta, EntityLivingBase placer) {
			return this.getDefaultState().withProperty(FACING, placer.getHorizontalFacing()).withProperty(NODROP, Boolean.valueOf(false));
		}

		@Override
		public void onBlockHarvested(World worldIn, BlockPos pos, IBlockState state, EntityPlayer player) {
			if (player.capabilities.isCreativeMode) {
				state = state.withProperty(NODROP, Boolean.valueOf(true));
				worldIn.setBlockState(pos, state, 4);
			}
			//this.dropBlockAsItem(worldIn, pos, state, 0);

			super.onBlockHarvested(worldIn, pos, state, player);
		}

		@Override
		public void getDrops(net.minecraft.util.NonNullList<ItemStack> drops, IBlockAccess worldIn, BlockPos pos, IBlockState state, int fortune)
		{
			{
				if (!((Boolean)state.getValue(NODROP)).booleanValue())
				{
					ItemStack itemstack = new ItemStack(ItemBatHeadItem.block, 1);
					drops.add(itemstack);
				}
			}
		}

		@Override
		public Item getItemDropped(IBlockState state, Random rand, int fortune)
		{
			return ItemBatHeadItem.block;
		}

		public boolean canDispenserPlace(World worldIn, BlockPos pos) {
			return this.getGuanoGolemBasePattern().match(worldIn, pos) != null;
		}

		@Override
		public void onBlockAdded(World worldIn, BlockPos pos, IBlockState state) {
			super.onBlockAdded(worldIn, pos, state);
			this.trySpawnGolem(worldIn, pos);
		}

		@Override
		public IBlockState getStateFromMeta(int meta) {
			return this.getDefaultState().withProperty(FACING, EnumFacing.byIndex(meta & 7)).withProperty(NODROP, Boolean.valueOf((meta & 8) > 0));
		}

		public void trySpawnGolem(World worldIn, BlockPos pos) {
			BlockPattern.PatternHelper blockpattern$patternhelper = this.getGuanoGolemPattern().match(worldIn, pos);

			if (blockpattern$patternhelper != null) {
				for (int i = 0; i < this.getGuanoGolemPattern().getThumbLength(); ++i) {
					BlockWorldState blockworldstate = blockpattern$patternhelper.translateOffset(0, i, 0);
					worldIn.setBlockState(blockworldstate.getPos(), Blocks.AIR.getDefaultState(), 2);
				}

				EntityPrehistoricFloraGuanoGolem entitygolem = new EntityPrehistoricFloraGuanoGolem(worldIn);
				BlockPos blockpos1 = blockpattern$patternhelper.translateOffset(0, 2, 0).getPos();
				entitygolem.setLocationAndAngles((double) blockpos1.getX() + 0.5D, (double) blockpos1.getY() + 0.05D, (double) blockpos1.getZ() + 0.5D, 0.0F, 0.0F);
				worldIn.spawnEntity(entitygolem);

				for (EntityPlayerMP entityplayermp : worldIn.getEntitiesWithinAABB(EntityPlayerMP.class, entitygolem.getEntityBoundingBox().grow(5.0D))) {
					CriteriaTriggers.SUMMONED_ENTITY.trigger(entityplayermp, entitygolem);
				}

				for (int l = 0; l < 120; ++l) {
					Minecraft.getMinecraft().effectRenderer.addEffect(ParticleGuano.GuanoFactory.createParticle(worldIn, (double) blockpos1.getX() + worldIn.rand.nextDouble(), (double) blockpos1.getY() + worldIn.rand.nextDouble() * 2.5D, (double) blockpos1.getZ() + worldIn.rand.nextDouble(), 0.0D, 0.0D, 0.0D));
					//worldIn.spawnParticle(EnumParticleTypes.SNOW_SHOVEL, (double) blockpos1.getX() + worldIn.rand.nextDouble(), (double) blockpos1.getY() + worldIn.rand.nextDouble() * 2.5D, (double) blockpos1.getZ() + worldIn.rand.nextDouble(), 0.0D, 0.0D, 0.0D);
				}

				for (int i1 = 0; i1 < this.getGuanoGolemPattern().getThumbLength(); ++i1) {
					BlockWorldState blockworldstate2 = blockpattern$patternhelper.translateOffset(0, i1, 0);
					worldIn.notifyNeighborsRespectDebug(blockworldstate2.getPos(), Blocks.AIR, false);
				}
			}
		}

		@Override
		public int getMetaFromState(IBlockState state) {
			int i = 0;
			i = i | ((EnumFacing) state.getValue(FACING)).getIndex();

			if (((Boolean) state.getValue(NODROP)).booleanValue()) {
				i |= 8;
			}

			return i;
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
		protected BlockStateContainer createBlockState() {
			return new BlockStateContainer(this, new IProperty[]{FACING, NODROP});
		}

		protected BlockPattern getGuanoGolemBasePattern() {
			if (this.guanogolemBasePattern == null) {
				this.guanogolemBasePattern = FactoryBlockPattern.start().aisle(" ", "#", "#").where('#', BlockWorldState.hasState(BlockStateMatcher.forBlock(BlockGuanoBlock.block))).build();
			}

			return this.guanogolemBasePattern;
		}

		protected BlockPattern getGuanoGolemPattern() {
			if (this.guanogolemPattern == null) {
				this.guanogolemPattern = FactoryBlockPattern.start().aisle("^", "#", "#").where('^', IS_BATHEAD).where('#', BlockWorldState.hasState(BlockStateMatcher.forBlock(BlockGuanoBlock.block))).build();
			}

			return this.guanogolemPattern;
		}

		@Override
		public boolean hasTileEntity(IBlockState state) {
			return true;
		}

		@Nullable
		@Override
		public TileEntity createTileEntity(World world, IBlockState state) {
			return new BlockBatHead.TileEntityCustom();
		}

		public BlockBatHead.TileEntityCustom createNewTileEntity(World worldIn, int meta) {
			return new BlockBatHead.TileEntityCustom();
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
				world.removeTileEntity(pos);
			}
			super.breakBlock(world, pos, state);
		}

		@Override
		public boolean doesSideBlockRendering(IBlockState state, IBlockAccess world, BlockPos pos, EnumFacing face) {
			return false;
		}

		@SideOnly(Side.CLIENT)
		@Override
		public EnumBlockRenderType getRenderType(IBlockState state) {
			return EnumBlockRenderType.ENTITYBLOCK_ANIMATED;
		}

	}

	public static class TileEntityCustom extends TileEntity {

		@Override
		public boolean shouldRefresh(World world, BlockPos pos, IBlockState oldState, IBlockState newSate)
		{
			return (oldState.getBlock() != newSate.getBlock());
		}

		@Override
		@Nullable
		public SPacketUpdateTileEntity getUpdatePacket() {
			return new SPacketUpdateTileEntity(this.pos, 3, this.getUpdateTag());
		}

		@Override
		public NBTTagCompound getUpdateTag() {
			return this.writeToNBT(new NBTTagCompound());
		}

		@Override
		public void onDataPacket(NetworkManager net, SPacketUpdateTileEntity pkt) {
			super.onDataPacket(net, pkt);
			handleUpdateTag(pkt.getNbtCompound());
		}

		@Override
		public void handleUpdateTag(NBTTagCompound tag) {
			this.readFromNBT(tag);
		}

	}
}