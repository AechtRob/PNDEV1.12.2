
package net.lepidodendron.block;

import net.lepidodendron.ElementsLepidodendronMod;
import net.lepidodendron.LepidodendronSorter;
import net.lepidodendron.block.base.BlockPNTaxidermyItem;
import net.lepidodendron.creativetab.TabLepidodendronMobile;
import net.minecraft.block.Block;
import net.minecraft.block.BlockDirectional;
import net.minecraft.block.SoundType;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.properties.PropertyDirection;
import net.minecraft.block.state.BlockFaceShape;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.SoundEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.network.NetworkManager;
import net.minecraft.network.play.server.SPacketUpdateTileEntity;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.*;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraft.world.WorldServer;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.IChunkGenerator;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.oredict.OreDictionary;

import javax.annotation.Nullable;
import java.util.Random;

@ElementsLepidodendronMod.ModElement.Tag
public class BlockNautiloidShellYezoceras extends ElementsLepidodendronMod.ModElement {
	@GameRegistry.ObjectHolder("lepidodendron:shell_yezoceras")
	public static final Block block = null;
	public BlockNautiloidShellYezoceras(ElementsLepidodendronMod instance) {
		super(instance, LepidodendronSorter.shell_yezoceras);
	}

	@Override
	public void initElements() {
		elements.blocks.add(() -> new BlockCustom().setRegistryName("shell_yezoceras"));
		elements.items.add(() -> new ItemBlock(block).setRegistryName(block.getRegistryName()).setMaxStackSize(64));
	}

	@Override
	public void init(FMLInitializationEvent event) {
		GameRegistry.registerTileEntity(BlockNautiloidShellYezoceras.TileEntityCustom.class, "lepidodendron:tileentityshell_yezoceras");
		OreDictionary.registerOre("mobdnaPNlepidodendron:prehistoric_flora_yezoceras", BlockNautiloidShellYezoceras.block);
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(block), 0,
				new ModelResourceLocation("lepidodendron:shell_yezoceras", "inventory"));
	}

	@Override
	public void generateWorld(Random random, int chunkX, int chunkZ, World world, int dimID, IChunkGenerator cg, IChunkProvider cp) {

		if (random.nextInt(36) != 0) {
			return; //shells
		}

//		for (int i = 0; i < 10; i++) {
//			int l6 = chunkX + random.nextInt(16) + 8;
//			int l14 = chunkZ + random.nextInt(16) + 8;
//			Biome biome = world.getBiome(new BlockPos(l6, 0, l14));
//			if (!(
//					biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:devonian_forest")
//							|| biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:devonian_beach")
//							|| biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:devonian_reef_transition")
//							|| biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:devonian_reef")
//			)
//			) {
//				break;
//			}
//			BlockPos pos = ChunkGenSpawner.getTopSolidBlock(new BlockPos(l6, 0, l14), world).up();
//			if (world.isAirBlock(pos) && pos.getY() < Functions.getAdjustedSeaLevel(world, pos) + 3
//					&& world.isSideSolid(pos.down(), EnumFacing.UP)
//					&& world.getBlockState(pos.down()).getMaterial() != Material.ICE
//					&& world.getBlockState(pos.down()).getMaterial() != Material.PACKED_ICE) {
//				world.setBlockState(pos, block.getDefaultState());
//				TileEntity tileEntity = world.getTileEntity(pos);
//				if (tileEntity != null) {
//					TileEntityCustom te = (TileEntityCustom) tileEntity;
//					//get a random rotation in increments of 15 degrees:
//					int rotation = random.nextInt(24) * 15;
//					te.getTileData().setInteger("rotation", rotation);
//					return;
//				}
//			}
//		}
	}

	public static class BlockCustom extends BlockPNTaxidermyItem {

		public static final PropertyDirection FACING = BlockDirectional.FACING;

		public BlockCustom() {
			//super(Material.ROCK);
			setTranslationKey("pf_shell_yezoceras");
			setSoundType(SoundType.STONE);
			setHardness(1.25F);
			setResistance(1.00F);
			setLightLevel(0F);
			setLightOpacity(0);
			setCreativeTab(TabLepidodendronMobile.tab);
			this.setDefaultState(this.blockState.getBaseState().withProperty(FACING, EnumFacing.UP));
		}

		public int getRotation(World world, BlockPos pos) {
			int currentRotation = 0;
			TileEntity tileEntity = world.getTileEntity(pos);
			if (tileEntity != null) {
				if (tileEntity.getTileData().hasKey("rotation")) {
					currentRotation = tileEntity.getTileData().getInteger("rotation");
				}
			}
			return currentRotation;
		}

		@Override
		public AxisAlignedBB getBoundingBox(IBlockState state, IBlockAccess source, BlockPos pos) {
			return new AxisAlignedBB(0.4D, 0.0D, 0.4D, 0.6D, 0.3D, 0.6D);
		}

		@Override
		public boolean hasTileEntity(IBlockState state) {
			return true;
		}

		@Nullable
		@Override
		public TileEntity createTileEntity(World world, IBlockState state) {
			return new BlockNautiloidShellYezoceras.TileEntityCustom();
		}

		public BlockNautiloidShellYezoceras.TileEntityCustom createNewTileEntity(World worldIn, int meta) {
			return new BlockNautiloidShellYezoceras.TileEntityCustom();
		}

		@Override
		public boolean eventReceived(IBlockState state, World worldIn, BlockPos pos, int eventID, int eventParam) {
			super.eventReceived(state, worldIn, pos, eventID, eventParam);
			TileEntity tileentity = worldIn.getTileEntity(pos);
			return tileentity == null ? false : tileentity.receiveClientEvent(eventID, eventParam);
		}

		@Override
		public EnumBlockRenderType getRenderType(IBlockState state) {
			return EnumBlockRenderType.ENTITYBLOCK_ANIMATED;
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
		public BlockFaceShape getBlockFaceShape(IBlockAccess worldIn, IBlockState state, BlockPos pos, EnumFacing face) {
			return BlockFaceShape.UNDEFINED;
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
		public IBlockState getStateForPlacement(World worldIn, BlockPos pos, EnumFacing facing, float hitX, float hitY, float hitZ, int meta,
												EntityLivingBase placer) {
			return this.getDefaultState().withProperty(FACING, EnumFacing.getDirectionFromEntityLiving(pos, placer));
		}

		@Override
		public void onBlockAdded(World world, BlockPos pos, IBlockState state) {
			super.onBlockAdded(world, pos, state);
			if (!world.isRemote) {
				TileEntity _tileEntity = world.getTileEntity(pos);
				IBlockState _bs = world.getBlockState(pos);
				if (_tileEntity != null)
					_tileEntity.getTileData().setInteger("rotation", 0);
				world.notifyBlockUpdate(pos, _bs, _bs, 3);}
		}

		@Override
		public boolean onBlockActivated(World worldIn, BlockPos pos, IBlockState state, EntityPlayer playerIn, EnumHand hand, EnumFacing facing, float hitX, float hitY, float hitZ) {
			super.onBlockActivated(worldIn, pos, state, playerIn, hand, facing, hitX, hitY, hitZ);

			int newRotation = getRotation(worldIn, pos) + 15;
			if (newRotation >= 360) {newRotation = 0;}

			if (!worldIn.isRemote) {
				TileEntity _tileEntity = worldIn.getTileEntity(pos);
				IBlockState _bs = worldIn.getBlockState(pos);
				if (_tileEntity != null)
					_tileEntity.getTileData().setInteger("rotation", newRotation);
				worldIn.notifyBlockUpdate(pos, _bs, _bs, 3);
				SoundEvent soundevent = SoundEvents.BLOCK_STONE_HIT;
				((WorldServer) playerIn.getEntityWorld()).playSound(null, pos, soundevent, SoundCategory.BLOCKS, 1.0F, 1.0F);
			}

			return true;
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
