
package net.lepidodendron.block;

import net.lepidodendron.ElementsLepidodendronMod;
import net.lepidodendron.LepidodendronConfig;
import net.lepidodendron.LepidodendronSorter;
import net.lepidodendron.item.ItemPalaeodictyopteraEggsItem;
import net.lepidodendron.util.EnumBiomeTypeCarboniferous;
import net.lepidodendron.util.EnumBiomeTypePermian;
import net.lepidodendron.world.biome.carboniferous.BiomeCarboniferous;
import net.lepidodendron.world.biome.permian.BiomePermian;
import net.lepidodendron.world.gen.MobSpawnGenerator;
import net.minecraft.block.Block;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.renderer.block.statemap.StateMap;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.network.NetworkManager;
import net.minecraft.network.play.server.SPacketUpdateTileEntity;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.world.World;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.IChunkGenerator;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import javax.annotation.Nullable;
import java.util.Random;


@ElementsLepidodendronMod.ModElement.Tag
public class BlockInsectEggsPalaeodictyoptera extends ElementsLepidodendronMod.ModElement {
	@GameRegistry.ObjectHolder("lepidodendron:insect_eggs_palaeodictyoptera_worldgen")
	public static final Block block = null;
	public BlockInsectEggsPalaeodictyoptera(ElementsLepidodendronMod instance) {
		super(instance, LepidodendronSorter.insect_eggs_palaeodictyoptera_worldgen);
	}

	@Override
	public void initElements() {
		elements.blocks.add(() -> new BlockCustom().setRegistryName("insect_eggs_palaeodictyoptera_worldgen"));
		//elements.items.add(() -> new ItemBlock(block).setRegistryName(block.getRegistryName()));
	}

	@Override
	public void init(FMLInitializationEvent event) {
		GameRegistry.registerTileEntity(BlockInsectEggsPalaeodictyoptera.TileEntityCustom.class, "lepidodendron:tileentityinsect_eggs_palaeodictyoptera_worldgen");
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		//ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(block), 0,
		//new ModelResourceLocation("lepidodendron:insect_eggs_eoarthropleura_worldgen", "inventory"));
		ModelLoader.setCustomStateMapper(block, (new StateMap.Builder()).ignore(BlockInsectEggsPalaeodictyoptera.BlockCustom.LEVEL).build());
	}

	@Override
	public void generateWorld(Random random, int chunkX, int chunkZ, World world, int dimID, IChunkGenerator cg, IChunkProvider cp) {

		if (dimID != LepidodendronConfig.dimCarboniferous) {
			return;
		}
		int minWaterDepth = 2;
		int waterDepthCheckMax = 4;
		int startHeight = world.getSeaLevel() - waterDepthCheckMax;
		for (int i = 0; i < (int) 3; i++) {
			int l6 = chunkX + random.nextInt(16) + 8;
			int i11 = random.nextInt(128 - startHeight) + startHeight;
			int l14 = chunkZ + random.nextInt(16) + 8;
			Biome biome = world.getBiome(new BlockPos(l6, i11, l14));
			if (biome instanceof BiomeCarboniferous) {
				BiomeCarboniferous biomeC = (BiomeCarboniferous) biome;
				if (biomeC.getBiomeType() == EnumBiomeTypeCarboniferous.Swamp
						|| biomeC.getBiomeType() == EnumBiomeTypeCarboniferous.Marsh) {
					int ii = random.nextInt(8);
					String variant = null;
					switch (ii) {
						case 0: default:
							variant = "delitzschala";
							break;

						case 1:
							variant = "homaloneura";
							break;

						case 2:
							variant = "homoioptera";
							break;

						case 3:
							variant = "lithomantis";
							break;

						case 4:
							variant = "lycocercus";
							break;

						case 5:
							variant = "sinodunbaria";
							break;

						case 6:
							variant = "stenodictya";
							break;

						case 7:
							variant = "mazothairos";
							break;
					}
					(new MobSpawnGenerator((Block) block)).generate(world, random, new BlockPos(l6, i11, l14), minWaterDepth, waterDepthCheckMax, variant);
				}
			}

			if (biome instanceof BiomePermian) {
				BiomePermian biomeP = (BiomePermian) biome;
				if (biomeP.getBiomeType() == EnumBiomeTypePermian.Wetlands
						|| biomeP.getBiomeType() == EnumBiomeTypePermian.Lowlands) {
					(new MobSpawnGenerator((Block) block)).generate(world, random, new BlockPos(l6, i11, l14), minWaterDepth, waterDepthCheckMax, "dunbaria");
				}
			}

		}
	}

	public static class BlockCustom extends BlockMobSpawn {
		public BlockCustom() {
			setTranslationKey("pf_insect_eggs_palaeodictyoptera_worldgen");
			//this.setTickRandomly(true);
			setCreativeTab(null);
		}

		@Override
		public void breakBlock(World world, BlockPos pos, IBlockState state) {
			world.removeTileEntity(pos);
			super.breakBlock(world, pos, state);
		}

		@Override
		public boolean hasTileEntity(IBlockState state) {
			return true;
		}

		@Nullable
		@Override
		public TileEntity createTileEntity(World world, IBlockState state) {
			return new BlockInsectEggsPalaeodictyoptera.TileEntityCustom();
		}

		public BlockInsectEggsPalaeodictyoptera.TileEntityCustom createNewTileEntity(World worldIn, int meta) {
			return new BlockInsectEggsPalaeodictyoptera.TileEntityCustom();
		}

		@Override
		public boolean eventReceived(IBlockState state, World worldIn, BlockPos pos, int eventID, int eventParam) {
			super.eventReceived(state, worldIn, pos, eventID, eventParam);
			TileEntity tileentity = worldIn.getTileEntity(pos);
			return tileentity == null ? false : tileentity.receiveClientEvent(eventID, eventParam);
		}

		@Override
		public ItemStack getPickBlock(IBlockState state, RayTraceResult target, World world, BlockPos pos, EntityPlayer player) {
			ItemStack stack = new ItemStack(ItemPalaeodictyopteraEggsItem.block, (int) (1));
			NBTTagCompound variantNBT = new NBTTagCompound();
			TileEntity tileentity = world.getTileEntity(pos);
			if (tileentity != null) {
				if (tileentity.getTileData() != null) {
					if (tileentity.getTileData().hasKey("PNType")) {
						variantNBT.setString("PNType", tileentity.getTileData().getString("PNType"));
						stack.setTagCompound(variantNBT);
						return stack;
					}
				}
			}
			return new ItemStack(Items.AIR, (int) (1));
		}



		@Override
		public void updateTick(World worldIn, BlockPos pos, IBlockState state, Random rand)
		{
			super.updateTick(worldIn, pos, state, rand);
			//Small chance of decaying:
			if (!(worldIn.isRemote) && rand.nextInt(45) == 0) {
				worldIn.destroyBlock(pos, false);
			}
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