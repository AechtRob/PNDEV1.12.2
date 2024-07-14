
package net.lepidodendron.block;

import net.lepidodendron.ElementsLepidodendronMod;
import net.lepidodendron.LepidodendronConfig;
import net.lepidodendron.LepidodendronSorter;
import net.lepidodendron.creativetab.TabLepidodendronMobile;
import net.lepidodendron.util.Functions;
import net.lepidodendron.world.biome.ChunkGenSpawner;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.BlockFaceShape;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
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
import net.minecraft.world.biome.Biome;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.IChunkGenerator;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.common.BiomeDictionary;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import javax.annotation.Nullable;
import java.util.Random;

@ElementsLepidodendronMod.ModElement.Tag
public class BlockCidaroida extends ElementsLepidodendronMod.ModElement {
	@GameRegistry.ObjectHolder("lepidodendron:cidaroida_item")
	public static final Block block = null;
	public BlockCidaroida(ElementsLepidodendronMod instance) {
		super(instance, LepidodendronSorter.cidaroida_item);
	}

	@Override
	public void initElements() {
		elements.blocks.add(() -> new BlockCustom().setRegistryName("cidaroida_item"));
		elements.items.add(() -> new ItemBlock(block).setRegistryName(block.getRegistryName()).setMaxStackSize(64));
	}

	@Override
	public void init(FMLInitializationEvent event) {
		GameRegistry.registerTileEntity(BlockCidaroida.TileEntityCustom.class, "lepidodendron:tileentitycidaroida_item");
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(block), 0,
				new ModelResourceLocation("lepidodendron:entities/cidaroida_item", "inventory"));
		//ModelLoader.setCustomStateMapper(block, (new StateMap.Builder()).ignore(BlockNautiloidShellAmmonite_Asteroceras.LEVEL).build());
	}

	@Override
	public void generateWorld(Random random, int chunkX, int chunkZ, World world, int dimID, IChunkGenerator cg, IChunkProvider cp) {

		if (random.nextInt(36) != 0) {
			return; //shells
		}

		if (dimID != LepidodendronConfig.dimTriassic
				&& dimID != LepidodendronConfig.dimJurassic
				&& dimID != LepidodendronConfig.dimCretaceousEarly
				&& dimID != LepidodendronConfig.dimCretaceousLate
				&& dimID != LepidodendronConfig.dimPaleogene
				&& dimID != LepidodendronConfig.dimNeogene
				&& dimID != LepidodendronConfig.dimPleistocene
				&& dimID != 0) {
			return;
		}

		for (int i = 0; i < 10; i++) {
			int l6 = chunkX + random.nextInt(16) + 8;
			int l14 = chunkZ + random.nextInt(16) + 8;
			Biome biome = world.getBiome(new BlockPos(l6, 0, l14));
			boolean isBeach = BiomeDictionary.hasType(biome, BiomeDictionary.Type.BEACH);
			if (!(isBeach
							|| biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:jurassic_beach")
					|| biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:jurassic_ocean_shore")
							|| biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:jurassic_beach_black")
							|| biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:jurassic_island_sandy")
							|| biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:jurassic_beach_forested_island")
							|| biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:jurassic_island_sandy_white")
							|| biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:jurassic_island_sandy_white_edge")
							|| biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:jurassic_mudflats_estuary_helper")
			)
			) {
				break;
			}
			BlockPos pos = ChunkGenSpawner.getTopSolidBlock(new BlockPos(l6, 0, l14), world).up();
			if (world.isAirBlock(pos) && pos.getY() < Functions.getAdjustedSeaLevel(world, pos) + 3
					&& world.isSideSolid(pos.down(), EnumFacing.UP)
					&& world.getBlockState(pos.down()).getMaterial() != Material.ICE
					&& world.getBlockState(pos.down()).getMaterial() != Material.PACKED_ICE) {
				world.setBlockState(pos, block.getDefaultState());
				TileEntity tileEntity = world.getTileEntity(pos);
				if (tileEntity != null) {
					TileEntityCustom te = (TileEntityCustom) tileEntity;
					//get a random rotation in increments of 15 degrees:
					int rotation = random.nextInt(24) * 15;
					te.getTileData().setInteger("rotation", rotation);
					return;
				}
			}
		}
	}

	public static class BlockCustom extends Block {

		public BlockCustom() {
			super(Material.ROCK);
			setTranslationKey("pf_cidaroida_item");
			setSoundType(SoundType.STONE);
			setHardness(1.25F);
			setResistance(1.00F);
			setLightLevel(0F);
			setLightOpacity(0);
			setCreativeTab(TabLepidodendronMobile.tab);
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
			return new AxisAlignedBB(0D, 0D, 0D, 0.9D, 0.2D, 0.9D);
		}

		@Override
		public boolean hasTileEntity(IBlockState state) {
			return true;
		}

		@Nullable
		@Override
		public TileEntity createTileEntity(World world, IBlockState state) {
			return new BlockCidaroida.TileEntityCustom();
		}

		public BlockCidaroida.TileEntityCustom createNewTileEntity(World worldIn, int meta) {
			return new BlockCidaroida.TileEntityCustom();
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
		public void onBlockAdded(World world, BlockPos pos, IBlockState state) {
			super.onBlockAdded(world, pos, state);
			Random rand = new Random();
			if (!world.isRemote) {
				TileEntity _tileEntity = world.getTileEntity(pos);
				IBlockState _bs = world.getBlockState(pos);
				if (_tileEntity != null)
					_tileEntity.getTileData().setInteger("rotation", 0);
					_tileEntity.getTileData().setInteger("variant", rand.nextInt(4));
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
