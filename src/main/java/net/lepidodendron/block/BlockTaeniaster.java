
package net.lepidodendron.block;

import net.lepidodendron.ElementsLepidodendronMod;
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
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.oredict.OreDictionary;

import javax.annotation.Nullable;
import java.util.Random;

@ElementsLepidodendronMod.ModElement.Tag
public class BlockTaeniaster extends ElementsLepidodendronMod.ModElement {
	@GameRegistry.ObjectHolder("lepidodendron:taeniaster_item")
	public static final Block block = null;
	public BlockTaeniaster(ElementsLepidodendronMod instance) {
		super(instance, LepidodendronSorter.taeniaster_item);
	}

	@Override
	public void initElements() {
		elements.blocks.add(() -> new BlockCustom().setRegistryName("taeniaster_item"));
		elements.items.add(() -> new ItemBlock(block).setRegistryName(block.getRegistryName()).setMaxStackSize(64));
	}

	@Override
	public void init(FMLInitializationEvent event) {
		GameRegistry.registerTileEntity(BlockTaeniaster.TileEntityCustom.class, "lepidodendron:tileentitytaeniaster_item");
		OreDictionary.registerOre("mobdnaPNlepidodendron:prehistoric_flora_taeniaster", BlockTaeniaster.block);
		OreDictionary.registerOre("pndietCrinoid", BlockTaeniaster.block);
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(block), 0,
				new ModelResourceLocation("lepidodendron:entities/taeniaster_item", "inventory"));
		//ModelLoader.setCustomStateMapper(block, (new StateMap.Builder()).ignore(BlockNautiloidShellAmmonite_Asteroceras.LEVEL).build());
	}

	@Override
	public void generateWorld(Random random, int chunkX, int chunkZ, World world, int dimID, IChunkGenerator cg, IChunkProvider cp) {

		if (random.nextInt(36) != 0) {
			return; //shells
		}

		for (int i = 0; i < 10; i++) {
			int l6 = chunkX + random.nextInt(16) + 8;
			int l14 = chunkZ + random.nextInt(16) + 8;
			Biome biome = world.getBiome(new BlockPos(l6, 0, l14));
			if (!(
					biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:ordovician_beach")
							|| biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:ordovician_beach_frozen")
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
			setTranslationKey("pf_taeniaster_item");
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
			return new BlockTaeniaster.TileEntityCustom();
		}

		public BlockTaeniaster.TileEntityCustom createNewTileEntity(World worldIn, int meta) {
			return new BlockTaeniaster.TileEntityCustom();
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
