
package net.lepidodendron.block;

import net.lepidodendron.ElementsLepidodendronMod;
import net.lepidodendron.LepidodendronFogSubscribers;
import net.lepidodendron.LepidodendronSorter;
import net.lepidodendron.entity.base.EntityPrehistoricFloraAgeableBase;
import net.lepidodendron.util.patchouli.SpawnLocations;
import net.lepidodendron.world.gen.MobSpawnSurfaceGenerator;
import net.minecraft.block.Block;
import net.minecraft.block.BlockLilyPad;
import net.minecraft.block.BlockLiquid;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.BlockFaceShape;
import net.minecraft.block.state.IBlockState;
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
import net.minecraftforge.common.EnumPlantType;
import net.minecraftforge.fluids.BlockFluidBase;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.registry.EntityEntry;
import net.minecraftforge.fml.common.registry.ForgeRegistries;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import javax.annotation.Nullable;
import java.util.List;
import java.util.Random;


@ElementsLepidodendronMod.ModElement.Tag
public class BlockEggsWaterSurface extends ElementsLepidodendronMod.ModElement {
	@GameRegistry.ObjectHolder("lepidodendron:eggs_water_surface")
	public static final Block block = null;
	public BlockEggsWaterSurface(ElementsLepidodendronMod instance) {
		super(instance, LepidodendronSorter.eggs);
	}

	@Override
	public void initElements() {
		elements.blocks.add(() -> new BlockCustom().setRegistryName("eggs_water_surface"));
		//elements.items.add(() -> new ItemBlock(block).setRegistryName(block.getRegistryName()));
	}

	@Override
	public void init(FMLInitializationEvent event) {
		GameRegistry.registerTileEntity(BlockEggsWaterSurface.TileEntityCustom.class, "lepidodendron:tileentityeggs_water_surface");
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		//ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(block), 0,
		//		new ModelResourceLocation("lepidodendron:nest", "inventory"));
	}

	@Override
	public void generateWorld(Random random, int chunkX, int chunkZ, World world, int dimID, IChunkGenerator cg, IChunkProvider cp) {

		for (int i = 0; i < (int) 4; i++) {
			int l6 = chunkX + random.nextInt(16) + 8;
			int i11 = random.nextInt(128);
			int l14 = chunkZ + random.nextInt(16) + 8;
			Biome biome = world.getBiome(new BlockPos(l6, i11, l14));
			for (String mob : waterLayingMobs) {
				String spawnMob = mob;
				if (spawnMob.indexOf("_nymph") >= 1) {
					spawnMob = spawnMob.replace("_nymph", "");
				}
				if (mob.contains("lepidodendron:prehistoric_flora_dragonfly")) {
					spawnMob = "lepidodendron:prehistoric_flora_dragonfly";
				}
				if (SpawnLocations.spawnsHere(spawnMob, biome.getRegistryName().toString())) {
					String pnVariant = null;
					int v = mob.indexOf("@");
					if (v > 0) {
						pnVariant = mob.substring(v + 1);
						mob = mob.substring(0, v);
					}
					(new MobSpawnSurfaceGenerator(mob)).generate(world, random, new BlockPos(l6, i11, l14), pnVariant);
				}
			}
		}

	}

	public static final String[] waterLayingMobs = new String[]{
			"lepidodendron:prehistoric_flora_diadectes",
			"lepidodendron:prehistoric_flora_westlothiana",
			"lepidodendron:prehistoric_flora_eucritta"
	};

	public static class BlockCustom extends BlockLilyPad {
		public BlockCustom() {
			super();
			setSoundType(SoundType.SLIME);
			setTranslationKey("pf_eggs_water_surface");
			setHardness(0.0F);
			setResistance(0.0F);
			setLightLevel(0F);
			setLightOpacity(0);
			setTickRandomly(true);
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
		public boolean isFullCube(IBlockState state) {
			return false;
		}

		@Override
		public AxisAlignedBB getBoundingBox(IBlockState state, IBlockAccess source, BlockPos pos) {
			return new AxisAlignedBB(0D, 0D, 0D, 1D, 0.2D, 1D);
		}

		@Override
		public void addCollisionBoxToList(IBlockState state, World worldIn, BlockPos pos, AxisAlignedBB entityBox, List<AxisAlignedBB> collidingBoxes, @Nullable Entity entityIn, boolean isActualState)
		{}

		@Override
		public boolean isOpaqueCube(IBlockState state) {
			return false;
		}

		@Override
		public boolean isReplaceable(IBlockAccess blockAccess, BlockPos pos) {
			return true;
		}

		@Override
		public void neighborChanged(IBlockState state, World world, BlockPos pos, Block neighborBlock, BlockPos fromPos) {
			//super.neighborChanged(state, world, pos, neighborBlock, fromPos);
			{
				if (!this.canBlockStay(world, pos, state))
				{
					world.scheduleUpdate(pos, this, 1);
				}
			}
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
		public boolean canBlockStay(World worldIn, BlockPos pos, IBlockState state)
		{
			if (pos.getY() >= 0 && pos.getY() < 256)
			{
				return canSurviveAt(worldIn, pos);
			}
			else
			{
				return false;
			}
		}

		//@Override
		public boolean canSurviveAt(World worldIn, BlockPos pos) {
			if (worldIn.getBlockState(pos.down()).getMaterial() != Material.WATER && worldIn.getBlockState(pos.down()).getMaterial() != Material.ICE)
			{
				return false;
			}

			return true;

		}

		@Override
		public EnumPlantType getPlantType(IBlockAccess world, BlockPos pos)
		{
			return EnumPlantType.Water;
		}

		@Override
		protected boolean canSustainBush(IBlockState state)
		{
			return state.getBlock() == Blocks.WATER || state.getMaterial() == Material.ICE;
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
			if (!worldIn.isAirBlock(pos)) {
				return false;
			}
			if (	//Either is a water block or an ice block:
					(isWaterBlock(worldIn, pos.down())
					&& (worldIn.getBlockState(pos.down()).getBlock() instanceof BlockFluidBase
					|| worldIn.getBlockState(pos.down()).getBlock() instanceof BlockLiquid))
				|| (worldIn.getBlockState(pos.down()).getMaterial() == Material.ICE)
					&& worldIn.getBlockState(pos.down()).getBlockFaceShape(worldIn, pos.down(), EnumFacing.UP) == BlockFaceShape.SOLID) {
				return super.canPlaceBlockAt(worldIn, pos);
			}
			return false;
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
			return new BlockEggsWaterSurface.TileEntityCustom();
		}

		public BlockEggsWaterSurface.TileEntityCustom createNewTileEntity(World worldIn, int meta) {
			return new BlockEggsWaterSurface.TileEntityCustom();
		}

		@Override
		public boolean eventReceived(IBlockState state, World worldIn, BlockPos pos, int eventID, int eventParam) {
			super.eventReceived(state, worldIn, pos, eventID, eventParam);
			TileEntity tileentity = worldIn.getTileEntity(pos);
			return tileentity == null ? false : tileentity.receiveClientEvent(eventID, eventParam);
		}

		@Override
		public void updateTick(World worldIn, BlockPos pos, IBlockState state, Random rand)
		{
			super.updateTick(worldIn, pos, state, rand);

			if (!worldIn.isRemote)
			{
				if (!worldIn.isAreaLoaded(pos, 3)) return;

				if (!this.canBlockStay(worldIn, pos, state))
				{
					worldIn.destroyBlock(pos, false);
					return;
				}
			}

			int incubation = 0;
			TileEntity te = worldIn.getTileEntity(pos);
			if (te != null) {
				if (te instanceof BlockEggsWaterSurface.TileEntityCustom) {
					BlockEggsWaterSurface.TileEntityCustom Egg = (BlockEggsWaterSurface.TileEntityCustom) te;
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
			if (this.hatchable && this.incubation <= BlockEggsWaterSurface.BlockCustom.getIncubation(world, pos)) {
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

		@Override
		public AxisAlignedBB getRenderBoundingBox() {
			return new AxisAlignedBB(pos.add(-2, -2, -2), pos.add(2, 2, 2));
		}

		@SideOnly(Side.CLIENT)
		@Override
		public double getMaxRenderDistanceSquared() {
			return 2304;
		}
	}
}
