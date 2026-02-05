
package net.lepidodendron.block;

import net.lepidodendron.ElementsLepidodendronMod;
import net.lepidodendron.LepidodendronFogSubscribers;
import net.lepidodendron.LepidodendronSorter;
import net.lepidodendron.entity.base.EntityPrehistoricFloraAgeableBase;
import net.lepidodendron.util.Functions;
import net.lepidodendron.util.patchouli.SpawnLocations;
import net.lepidodendron.world.gen.MobSpawnGenerator;
import net.minecraft.block.Block;
import net.minecraft.block.BlockLiquid;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.properties.PropertyInteger;
import net.minecraft.block.state.BlockFaceShape;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.renderer.block.statemap.StateMap;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityList;
import net.minecraft.init.Blocks;
import net.minecraft.init.SoundEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.network.NetworkManager;
import net.minecraft.network.play.server.SPacketUpdateTileEntity;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.*;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.IChunkGenerator;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fluids.BlockFluidBase;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.registry.EntityEntry;
import net.minecraftforge.fml.common.registry.ForgeRegistries;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import javax.annotation.Nullable;
import java.util.Random;


@ElementsLepidodendronMod.ModElement.Tag
public class BlockEggsWater extends ElementsLepidodendronMod.ModElement {
	@GameRegistry.ObjectHolder("lepidodendron:eggs_water")
	public static final Block block = null;
	public BlockEggsWater(ElementsLepidodendronMod instance) {
		super(instance, LepidodendronSorter.eggs);
	}

	@Override
	public void initElements() {
		elements.blocks.add(() -> new BlockCustom().setRegistryName("eggs_water"));
		//elements.items.add(() -> new ItemBlock(block).setRegistryName(block.getRegistryName()));
	}

	@Override
	public void init(FMLInitializationEvent event) {
		GameRegistry.registerTileEntity(BlockEggsWater.TileEntityCustom.class, "lepidodendron:tileentityeggs_water");
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		//ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(block), 0,
		//		new ModelResourceLocation("lepidodendron:nest", "inventory"));
		ModelLoader.setCustomStateMapper(block, (new StateMap.Builder()).ignore(BlockEggsWater.LEVEL).build());
	}

	@Override
	public void generateWorld(Random random, int chunkX, int chunkZ, World world, int dimID, IChunkGenerator cg, IChunkProvider cp) {

		int minWaterDepth = 1;
		int waterDepthCheckMax = 20;
		int startHeight = Functions.getAdjustedSeaLevel(world, new BlockPos(chunkX, 0, chunkZ)) - waterDepthCheckMax;
		for (int i = 0; i < (int) 1; i++) {
			int l6 = chunkX + random.nextInt(16) + 8;
			int i11 = random.nextInt(128 - startHeight) + startHeight;
			int l14 = chunkZ + random.nextInt(16) + 8;
			Biome biome = world.getBiome(new BlockPos(l6, i11, l14));
			for (String mob : waterLayingMobs) {
				String spawnMob = mob;
				if (spawnMob.equalsIgnoreCase("lepidodendron:prehistoric_flora_aquaticnymph@stonefly")) {
					spawnMob = "lepidodendron:prehistoric_flora_stonefly";
				}
				else if (spawnMob.equalsIgnoreCase("lepidodendron:prehistoric_flora_aquaticnymph@mayfly")) {
					spawnMob = "lepidodendron:prehistoric_flora_mayfly";
				}
				else if (spawnMob.equalsIgnoreCase("lepidodendron:prehistoric_flora_aquaticnymph@velisoptera")) {
					spawnMob = "lepidodendron:prehistoric_flora_velisoptera";
				}
				else if (spawnMob.equalsIgnoreCase("lepidodendron:prehistoric_flora_aquaticnymph@argentinala")) {
					spawnMob = "lepidodendron:prehistoric_flora_argentinala";
				}
				else if (spawnMob.equalsIgnoreCase("lepidodendron:prehistoric_flora_aquaticnymph@damselfly")) {
					spawnMob = "lepidodendron:prehistoric_flora_damselfly";
				}
				else if (spawnMob.equalsIgnoreCase("lepidodendron:prehistoric_flora_tadpole@cratopipa")) {
					spawnMob = "lepidodendron:prehistoric_flora_cratopipa";
				}
				else if (spawnMob.equalsIgnoreCase("lepidodendron:prehistoric_flora_tadpole@prosalirus")) {
					spawnMob = "lepidodendron:prehistoric_flora_prosalirus";
				}
				else if (spawnMob.equalsIgnoreCase("lepidodendron:prehistoric_flora_tadpole@notobatrachus")) {
					spawnMob = "lepidodendron:prehistoric_flora_notobatrachus";
				}
				else if (spawnMob.equalsIgnoreCase("lepidodendron:prehistoric_flora_tadpole@rhadinosteus")) {
					spawnMob = "lepidodendron:prehistoric_flora_rhadinosteus";
				}
				else if (spawnMob.equalsIgnoreCase("lepidodendron:prehistoric_flora_tadpole@hygobatrachus")) {
					spawnMob = "lepidodendron:prehistoric_flora_hygobatrachus";
				}
				else if (spawnMob.equalsIgnoreCase("lepidodendron:prehistoric_flora_tadpole@kururubatrachus")) {
					spawnMob = "lepidodendron:prehistoric_flora_kururubatrachus";
				}
				else if (spawnMob.equalsIgnoreCase("lepidodendron:prehistoric_flora_tadpole@genibatrachus")) {
					spawnMob = "lepidodendron:prehistoric_flora_kururubatrachus";
				}
				else if (spawnMob.indexOf("_nymph") >= 1) {
					spawnMob = spawnMob.replace("_nymph", "");
				}
				else if (mob.contains("lepidodendron:prehistoric_flora_dragonfly")) {
					spawnMob = "lepidodendron:prehistoric_flora_dragonfly";
				}
				if (SpawnLocations.spawnsHere(spawnMob, biome.getRegistryName().toString())) {
					String pnVariant = null;
					int v = mob.indexOf("@");
					if (v > 0) {
						pnVariant = mob.substring(v + 1);
						mob = mob.substring(0, v);
					}
					(new MobSpawnGenerator(mob)).generate(world, random, new BlockPos(l6, i11, l14), minWaterDepth, waterDepthCheckMax, pnVariant);
				}
			}
		}
	}

	public static final String[] waterLayingMobs = new String[]{
			"lepidodendron:prehistoric_flora_acanthostega",
			"lepidodendron:prehistoric_flora_acanthostomatops",
			"lepidodendron:prehistoric_flora_acherontiscus",
			"lepidodendron:prehistoric_flora_acutiramus",
			"lepidodendron:prehistoric_flora_adelophthalmus",
			"lepidodendron:prehistoric_flora_amphibamus",
			"lepidodendron:prehistoric_flora_anthracosaurus",
			"lepidodendron:prehistoric_flora_asteracanthus",
			"lepidodendron:prehistoric_flora_balanerpeton",
			"lepidodendron:prehistoric_flora_banksiops",
			"lepidodendron:prehistoric_flora_barameda",
			"lepidodendron:prehistoric_flora_barbclabornia",
			"lepidodendron:prehistoric_flora_branchiosaur",
			"lepidodendron:prehistoric_flora_cacops",
			"lepidodendron:prehistoric_flora_carcinosoma",
			"lepidodendron:prehistoric_flora_chunerpeton",
			"lepidodendron:prehistoric_flora_ciurcopterus",
			"lepidodendron:prehistoric_flora_cladoselache",
			"lepidodendron:prehistoric_flora_cobelodus",
			"lepidodendron:prehistoric_flora_crassigyrinus",
			"lepidodendron:prehistoric_flora_dasyceps",
			"lepidodendron:prehistoric_flora_diplocaulus",
			"lepidodendron:prehistoric_flora_diploceraspis",
			"lepidodendron:prehistoric_flora_diplodoselache",
			"lepidodendron:prehistoric_flora_dracopristis",
			"lepidodendron:prehistoric_flora_dragonfly_nymph@dragonfly1",
			"lepidodendron:prehistoric_flora_dragonfly_nymph@dragonfly2",
			"lepidodendron:prehistoric_flora_dragonfly_nymph@dragonfly3",
			"lepidodendron:prehistoric_flora_dragonfly_nymph@dragonfly4",
			"lepidodendron:prehistoric_flora_dragonfly_nymph@dragonfly5",
			"lepidodendron:prehistoric_flora_dragonfly_nymph@dragonfly6",
			"lepidodendron:prehistoric_flora_dragonfly_nymph@dragonfly7",
			"lepidodendron:prehistoric_flora_dragonfly_nymph@dragonfly8",
			"lepidodendron:prehistoric_flora_dragonfly_nymph@dragonfly9",
			"lepidodendron:prehistoric_flora_dragonfly_nymph@dragonfly10",
			"lepidodendron:prehistoric_flora_dvinosaurus",
			"lepidodendron:prehistoric_flora_edestus",
			"lepidodendron:prehistoric_flora_erasipteroides_nymph",
			"lepidodendron:prehistoric_flora_eryops",
			"lepidodendron:prehistoric_flora_eurypterus",
			"lepidodendron:prehistoric_flora_fadenia_carboniferous",
			"lepidodendron:prehistoric_flora_fadenia_permotriassic",
			"lepidodendron:prehistoric_flora_gephyrostegus",
			"lepidodendron:prehistoric_flora_gerrothorax",
			"lepidodendron:prehistoric_flora_greererpeton",
			"lepidodendron:prehistoric_flora_helicoprion",
			"lepidodendron:prehistoric_flora_hibbertopterus",
			"lepidodendron:prehistoric_flora_highmilleria",
			"lepidodendron:prehistoric_flora_hybodus",
			"lepidodendron:prehistoric_flora_hyneria",
			"lepidodendron:prehistoric_flora_ichthyostega",
			"lepidodendron:prehistoric_flora_italophlebia_nymph",
			"lepidodendron:prehistoric_flora_jaekelopterus",
			"lepidodendron:prehistoric_flora_jeholotriton",
			"lepidodendron:prehistoric_flora_kaibabvenator",
			"lepidodendron:prehistoric_flora_kokomopterus",
			"lepidodendron:prehistoric_flora_laidleria",
			"lepidodendron:prehistoric_flora_lebachacanthus",
			"lepidodendron:prehistoric_flora_limnoscelis",
			"lepidodendron:prehistoric_flora_listracanthus",
			"lepidodendron:prehistoric_flora_marmorerpeton",
			"lepidodendron:prehistoric_flora_mastodonsaurus",
			"lepidodendron:prehistoric_flora_megactenopetalus",
			"lepidodendron:prehistoric_flora_megalocephalus",
			"lepidodendron:prehistoric_flora_megalograptus",
			"lepidodendron:prehistoric_flora_meganeura_nymph",
			"lepidodendron:prehistoric_flora_meganeurites_nymph",
			"lepidodendron:prehistoric_flora_meganeuropsis_nymph",
			"lepidodendron:prehistoric_flora_megarachne",
			"lepidodendron:prehistoric_flora_megasecoptera_nymph@sylvohymen",
			"lepidodendron:prehistoric_flora_melosaurus",
			"lepidodendron:prehistoric_flora_metoposaurus",
			"lepidodendron:prehistoric_flora_mixopterus",
			"lepidodendron:prehistoric_flora_mooreodontus",
			"lepidodendron:prehistoric_flora_namurotypus_nymph",
			"lepidodendron:prehistoric_flora_nigerpeton",
			"lepidodendron:prehistoric_flora_notidanoides",
			"lepidodendron:prehistoric_flora_onychodus",
			"lepidodendron:prehistoric_flora_onychopterella",
			"lepidodendron:prehistoric_flora_orcanopterus",
			"lepidodendron:prehistoric_flora_orodus",
			"lepidodendron:prehistoric_flora_pagea",
			"lepidodendron:prehistoric_flora_palaeodictyoptera_nymph@delitzschala",
			"lepidodendron:prehistoric_flora_palaeodictyoptera_nymph@dunbaria",
			"lepidodendron:prehistoric_flora_palaeodictyoptera_nymph@homaloneura",
			"lepidodendron:prehistoric_flora_palaeodictyoptera_nymph@homoioptera",
			"lepidodendron:prehistoric_flora_palaeodictyoptera_nymph@lithomantis",
			"lepidodendron:prehistoric_flora_palaeodictyoptera_nymph@lycocercus",
			"lepidodendron:prehistoric_flora_palaeodictyoptera_nymph@maizothairos",
			"lepidodendron:prehistoric_flora_palaeodictyoptera_nymph@psychroptilus",
			"lepidodendron:prehistoric_flora_palaeodictyoptera_nymph@sinodunbaria",
			"lepidodendron:prehistoric_flora_palaeodictyoptera_nymph@stenodictya",
			"lepidodendron:prehistoric_flora_pantylus",
			"lepidodendron:prehistoric_flora_parhybodus",
			"lepidodendron:prehistoric_flora_parmastega",
			"lepidodendron:prehistoric_flora_pederpes",
			"lepidodendron:prehistoric_flora_pentecopterus",
			"lepidodendron:prehistoric_flora_phlegethontia",
			"lepidodendron:prehistoric_flora_pholiderpeton",
			"lepidodendron:prehistoric_flora_platyhystrix",
			"lepidodendron:prehistoric_flora_prionosuchus",
			"lepidodendron:prehistoric_flora_proterogyrinus",
			"lepidodendron:prehistoric_flora_protozygoptera_nymph",
			"lepidodendron:prehistoric_flora_pterygotus",
			"lepidodendron:prehistoric_flora_rhizodus",
			"lepidodendron:prehistoric_flora_saivodus",
			"lepidodendron:prehistoric_flora_sarcoprion",
			"lepidodendron:prehistoric_flora_sclerocephalus",
			"lepidodendron:prehistoric_flora_siderops",
			"lepidodendron:prehistoric_flora_slimonia",
			"lepidodendron:prehistoric_flora_spathicephalus",
			"lepidodendron:prehistoric_flora_stanocephalosaurus",
			"lepidodendron:prehistoric_flora_stenokranio",
			"lepidodendron:prehistoric_flora_stoermeropterus",
			"lepidodendron:prehistoric_flora_strobilopterus",
			"lepidodendron:prehistoric_flora_tiktaalik",
			"lepidodendron:prehistoric_flora_uranocentrodon",
			"lepidodendron:prehistoric_flora_urocordylus",
			"lepidodendron:prehistoric_flora_whatcheeria",
			"lepidodendron:prehistoric_flora_wodnika",
			"lepidodendron:prehistoric_flora_xenacanthus",
            "lepidodendron:prehistoric_flora_orthacanthus",


            "lepidodendron:prehistoric_flora_archeria",
			"lepidodendron:prehistoric_flora_nigerpeton",
			"lepidodendron:prehistoric_flora_acherontiscus",
			"lepidodendron:prehistoric_flora_anthracosaurus",
			"lepidodendron:prehistoric_flora_sclerocephalus",
			"lepidodendron:prehistoric_flora_pholidogaster",
			"lepidodendron:prehistoric_flora_eoherpeton",
			"lepidodendron:prehistoric_flora_caerorhachis",
			"lepidodendron:prehistoric_flora_lethiscus",
			"lepidodendron:prehistoric_flora_apateon",
			"lepidodendron:prehistoric_flora_ptychodus",
			"lepidodendron:prehistoric_flora_squalicorax",
			"lepidodendron:prehistoric_flora_cretoxyrhina",
			"lepidodendron:prehistoric_flora_onchopristis",
			"lepidodendron:prehistoric_flora_egertonodus",
			"lepidodendron:prehistoric_flora_thaiodus",
			"lepidodendron:prehistoric_flora_microbrachis",
			"lepidodendron:prehistoric_flora_cretalamna",
			"lepidodendron:prehistoric_flora_valdotriton",
			"lepidodendron:prehistoric_flora_aquaticnymph@stonefly",
			"lepidodendron:prehistoric_flora_aquaticnymph@mayfly",
			"lepidodendron:prehistoric_flora_aquaticnymph@velisoptera",
			"lepidodendron:prehistoric_flora_aquaticnymph@argentinala",
			"lepidodendron:prehistoric_flora_aquaticnymph@damselfly",
			"lepidodendron:prehistoric_flora_trypanognathus",
            "lepidodendron:prehistoric_flora_brachydectes",
            "lepidodendron:prehistoric_flora_leptostyrax",
            "lepidodendron:prehistoric_flora_gerobatrachus",
            "lepidodendron:prehistoric_flora_gaiasia",
			"lepidodendron:prehistoric_flora_diplocaulus_minimus",
			"lepidodendron:prehistoric_flora_saharastega",

    };

	public static final PropertyInteger LEVEL = PropertyInteger.create("level", 0, 15);

	public static class BlockCustom extends Block {
		public BlockCustom() {
			super(Material.WATER);
			setSoundType(SoundType.SLIME);
			setTranslationKey("pf_eggs_water");
			setHardness(0.0F);
			setResistance(0.0F);
			setLightLevel(0F);
			setLightOpacity(3);
			setTickRandomly(true);
			this.setDefaultState(this.blockState.getBaseState().withProperty(LEVEL, 0));
		}

		public static int getIncubation(World world, BlockPos pos) {
			return 6000;
		}

		@Override
		public boolean isPassable(IBlockAccess worldIn, BlockPos pos) {
			return true;
		}

		@Nullable
		public AxisAlignedBB getCollisionBoundingBox(IBlockState blockState, IBlockAccess worldIn, BlockPos pos) {
			return NULL_AABB;
		}

		@Override
		public Item getItemDropped(IBlockState state, Random rand, int fortune) {
			return new ItemStack(Blocks.AIR, (int) (1)).getItem();
		}

		@SideOnly(Side.CLIENT)
		@Override
		public EnumBlockRenderType getRenderType(IBlockState state) {
			return EnumBlockRenderType.ENTITYBLOCK_ANIMATED;
		}

		@SideOnly(Side.CLIENT)
		@Override
		public BlockRenderLayer getRenderLayer() {
			if (LepidodendronFogSubscribers.hasShaders()) {
				return BlockRenderLayer.CUTOUT;
			}
			return BlockRenderLayer.TRANSLUCENT;
		}

		@Override
		public boolean canRenderInLayer(IBlockState state, BlockRenderLayer layer) {
			if (LepidodendronFogSubscribers.hasShaders()) {
				return layer == BlockRenderLayer.CUTOUT_MIPPED;
			}
			return layer == BlockRenderLayer.TRANSLUCENT;
		}

		@Override
		public boolean isOpaqueCube(IBlockState state) {
			return false;
		}

		@Override
		public boolean isFullCube(IBlockState state)
		{
			return false;
		}

		@Override
		protected net.minecraft.block.state.BlockStateContainer createBlockState() {
			return new net.minecraft.block.state.BlockStateContainer(this, new IProperty[]{LEVEL});
		}

		@Override
		public IBlockState getStateFromMeta(int meta) {
			return this.getDefaultState();
		}

		@Override
		public int getMetaFromState(IBlockState state) {
			return 0;
		}


		@Override
		public int getFlammability(IBlockAccess world, BlockPos pos, EnumFacing face) {
			return 0;
		}

		@Override
		public int getFireSpreadSpeed(IBlockAccess world, BlockPos pos, EnumFacing face) {
			return 0;
		}

		@Override
		public MapColor getMapColor(IBlockState state, IBlockAccess blockAccess, BlockPos pos) {
			return MapColor.FOLIAGE;
		}

		@Override
		public BlockFaceShape getBlockFaceShape(IBlockAccess worldIn, IBlockState state, BlockPos pos, EnumFacing face)
		{
			return BlockFaceShape.UNDEFINED;
		}

		@Override
		public boolean canBeReplacedByLeaves(IBlockState state, IBlockAccess world, BlockPos pos)
		{
			return true;
		}

		public boolean isWaterBlock(World world, BlockPos pos) {
			if (world.getBlockState(pos).getMaterial() == Material.WATER) {
				return true;
			}
			return false;
		}

		@Override
		public boolean canPlaceBlockAt(World worldIn, BlockPos pos)
		{
			if ((isWaterBlock(worldIn, pos)) && (isWaterBlock(worldIn, pos.up()))
					&& (worldIn.getBlockState(pos).getBlock() instanceof BlockFluidBase
					|| worldIn.getBlockState(pos).getBlock() instanceof BlockLiquid)
					&& worldIn.getBlockState(pos.down()).getBlockFaceShape(worldIn, pos.down(), EnumFacing.UP) == BlockFaceShape.SOLID) {
				return super.canPlaceBlockAt(worldIn, pos);
			}
			return false;
		}

		@Override
		public boolean isReplaceable(IBlockAccess worldIn, BlockPos pos)
		{
			return true;
		}

		@Override
		public void breakBlock(World world, BlockPos pos, IBlockState state) {
			//Item itemdropped = getEggItemStack(world, pos).getItem();
			//System.err.println("Eggitem: " + itemdropped);
			//EntityItem entityToSpawn = null;
			//ItemStack stack = getEggItemStack(world, pos);
			//if (stack != null) {
			//	entityToSpawn = new EntityItem(world, pos.getX(), pos.getY(), pos.getZ(), new ItemStack(stack.getItem(), (int) (1)));
			//	if (!world.isRemote && entityToSpawn != null) {
			//		entityToSpawn.setPickupDelay(10);
			//		world.spawnEntity(entityToSpawn);
			//	}
			//}
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
			return new BlockEggsWater.TileEntityCustom();
		}

		public BlockEggsWater.TileEntityCustom createNewTileEntity(World worldIn, int meta) {
			return new BlockEggsWater.TileEntityCustom();
		}

		@Override
		public boolean eventReceived(IBlockState state, World worldIn, BlockPos pos, int eventID, int eventParam) {
			super.eventReceived(state, worldIn, pos, eventID, eventParam);
			TileEntity tileentity = worldIn.getTileEntity(pos);
			return tileentity == null ? false : tileentity.receiveClientEvent(eventID, eventParam);
		}

		@Override
		public void neighborChanged(IBlockState state, World world, BlockPos pos, Block neighborBlock, BlockPos fromPos) {
			Random rand = new Random();
			super.neighborChanged(state, world, pos, neighborBlock, fromPos);
			updateTick(world, pos, state, rand);
		}

		@Override
		public void updateTick(World worldIn, BlockPos pos, IBlockState state, Random rand)
		{
			super.updateTick(worldIn, pos, state, rand);

			if (!((isWaterBlock(worldIn, pos)) && (isWaterBlock(worldIn, pos.up()))
						&& worldIn.getBlockState(pos.down()).getBlockFaceShape(worldIn, pos.down(), EnumFacing.UP) == BlockFaceShape.SOLID)) {
				worldIn.destroyBlock(pos, false);
				return;
			}

			int incubation = 0;
			TileEntity te = worldIn.getTileEntity(pos);
			if (te != null) {
				if (te instanceof BlockEggsWater.TileEntityCustom) {
					BlockEggsWater.TileEntityCustom Egg = (BlockEggsWater.TileEntityCustom) te;
					incubation = Egg.getIncubation();
				}
			}

			//System.err.println("actual timer: " + incubation + " limit: " + this.getIncubation(worldIn, pos));

			if (incubation >= this.getIncubation(worldIn, pos)) {

				String nbtStr = "{AgeTicks:0}";

				String creatureType = new Object() {
					public String getValue(BlockPos pos1, String tag) {
						TileEntity tileEntity = worldIn.getTileEntity(pos1);
						if (tileEntity != null)
							return tileEntity.getTileData().getString(tag);
						return "";
					}
				}.getValue(pos, "PNType");

				String creatureTypeVariant = getEggOwnerVariant(worldIn, pos);
				if (creatureTypeVariant == null && !creatureType.equalsIgnoreCase("")) {
					creatureTypeVariant = creatureType;
				}
				if (creatureTypeVariant != null) {
					if (creatureTypeVariant.equalsIgnoreCase("gendered")) {
						creatureTypeVariant = "male";
						if (worldIn.rand.nextInt(2) == 0) {
							creatureTypeVariant = "female";
						}
					}
					nbtStr = "{PNType:\"" + creatureTypeVariant + "\",AgeTicks:0}";
				}

				if (!(worldIn.isRemote)) {
					EntityPrehistoricFloraAgeableBase.summon(worldIn, EntityList.getKey(getEggOwner(worldIn, pos)).toString(), nbtStr, (double) pos.getX() + 0.5D, (double) pos.getY() + 0.5D, (double) pos.getZ() + 0.5D);
				}
				worldIn.playSound(null, pos, SoundEvents.BLOCK_SLIME_BREAK, SoundCategory.BLOCKS, 1.0F, 1.0F);

				if (te != null) {
					te.getTileData().setString("creature", "");
				}

				worldIn.setBlockToAir(pos);
			}
		}

		@Nullable
		public static Class getEggOwner(World world, BlockPos pos) {
			//Get the matching entity for the nbt applied:
			String creatureType = new Object() {
				public String getValue(BlockPos pos1, String tag) {
					TileEntity tileEntity = world.getTileEntity(pos1);
					if (tileEntity != null)
						return tileEntity.getTileData().getString(tag);
					return "";
				}
			}.getValue(pos, "creature");

			if (!creatureType.equals("")) {
				int i = creatureType.indexOf("@");
				if (i >= 1) {
					creatureType = creatureType.substring(0, creatureType.indexOf("@"));
				}
				//Get the mob:
				Class<? extends Entity> clazz = findEntity(creatureType);
				if (clazz != null) {
					return findEntity(creatureType);
				}
			}
			return null;
		}

		@Nullable
		public static String getEggOwnerVariant(World world, BlockPos pos) {
			//Get the matching entity for the nbt applied:
			String creatureType = new Object() {
				public String getValue(BlockPos pos1, String tag) {
					TileEntity tileEntity = world.getTileEntity(pos1);
					if (tileEntity != null)
						return tileEntity.getTileData().getString(tag);
					return "";
				}
			}.getValue(pos, "creature");

			if (!creatureType.equals("")) {
				int i = creatureType.indexOf("@");
				if (i >= 1) {
					return creatureType.substring(creatureType.indexOf("@") + 1);
				}
			}
			return null;
		}

		@Nullable
		private static Class<? extends Entity> findEntity(String entity) {
			Class<? extends Entity> entityClass;
			EntityEntry ee = ForgeRegistries.ENTITIES.getValue(new ResourceLocation(entity));
			entityClass = ee == null ? null : ee.getEntityClass();
			return entityClass;
		}

	}

	public static class TileEntityCustom extends TileEntity implements ITickable {

		private int incubation;
		private boolean hatchable;
		private String creature;
		private String variant;

		@Override
		public void update() {
			if (this.hatchable && this.incubation <= BlockEggsWater.BlockCustom.getIncubation(world, pos)) {
				++this.incubation; //increment the hidden tag up to 361 and stop there
			}
		}

		public int getIncubation() {
			return this.incubation;
		}

		public void setIncubation(int incubation) {
			this.incubation = incubation;
		}

		public void setHatchable(boolean hatchable) {
			this.hatchable = hatchable;
		}

		@Override
		public SPacketUpdateTileEntity getUpdatePacket() {
			NBTTagCompound tag = new NBTTagCompound();
			this.writeToNBT(tag);
			return new SPacketUpdateTileEntity(pos, 1, tag);
		}

		@Override
		public void onDataPacket(NetworkManager netManager, SPacketUpdateTileEntity packet) {
			readFromNBT(packet.getNbtCompound());
		}

		@Override
		public NBTTagCompound getUpdateTag() {
			return this.writeToNBT(new NBTTagCompound());
		}

		@Override
		public void handleUpdateTag(NBTTagCompound tag) {
			this.readFromNBT(tag);
		}

		@Override
		public void readFromNBT(NBTTagCompound compound) {
			super.readFromNBT(compound);
			if (compound.hasKey("incubation")) {
				this.incubation = compound.getInteger("incubation");
			}
			if (compound.hasKey("creature")) {
				this.creature = compound.getString("creature");
			}
			if (compound.hasKey("hatchable")) {
				this.creature = compound.getString("hatchable");
			}
			if (compound.hasKey("PNType")) {
				this.variant = compound.getString("PNType");
			}
		}

		@Override
		public NBTTagCompound writeToNBT(NBTTagCompound compound) {
			super.writeToNBT(compound);
			compound.setInteger("incubation", this.incubation);
			compound.setBoolean("hatchable", this.hatchable);
			if (this.hasCreature())
			{
				compound.setString("creature", this.creature);
			}
			if (this.hasVariant())
			{
				compound.setString("PNType", this.variant);
			}
			return compound;
		}

		public boolean hasCreature()
		{
			return this.creature != null && !this.creature.equals("");
		}

		public boolean hasVariant()
		{
			return this.variant != null && !this.variant.equals("");
		}

	}
}
