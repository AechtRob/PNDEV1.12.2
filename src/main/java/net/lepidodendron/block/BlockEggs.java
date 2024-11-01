
package net.lepidodendron.block;

import net.lepidodendron.ElementsLepidodendronMod;
import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.LepidodendronSorter;
import net.lepidodendron.entity.base.EntityPrehistoricFloraAgeableBase;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.BlockFaceShape;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityList;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.player.EntityPlayer;
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
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.registry.EntityEntry;
import net.minecraftforge.fml.common.registry.ForgeRegistries;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import javax.annotation.Nullable;
import java.util.Random;


@ElementsLepidodendronMod.ModElement.Tag
public class BlockEggs extends ElementsLepidodendronMod.ModElement {
	@GameRegistry.ObjectHolder("lepidodendron:eggs")
	public static final Block block = null;
	public BlockEggs(ElementsLepidodendronMod instance) {
		super(instance, LepidodendronSorter.eggs);
	}

	@Override
	public void initElements() {
		elements.blocks.add(() -> new BlockCustom().setRegistryName("eggs"));
		//elements.items.add(() -> new ItemBlock(block).setRegistryName(block.getRegistryName()));
	}

	@Override
	public void init(FMLInitializationEvent event) {
		GameRegistry.registerTileEntity(BlockEggs.TileEntityCustom.class, "lepidodendron:tileentityeggs");
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		//ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(block), 0,
		//		new ModelResourceLocation("lepidodendron:nest", "inventory"));
	}

	public static class BlockCustom extends Block {
		public BlockCustom() {
			super(Material.CIRCUITS);
			setSoundType(SoundType.SLIME);
			setTranslationKey("pf_eggs");
			setHardness(1.0F);
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

		@Nullable
		public static ItemStack getEggItemStack(World world, BlockPos pos) {
			//Get the matching nest item for the nbt applied:
			String creatureType = new Object() {
				public String getValue(BlockPos pos1, String tag) {
					TileEntity tileEntity = world.getTileEntity(pos1);
					if (tileEntity != null)
						return tileEntity.getTileData().getString(tag);
					return "";
				}
			}.getValue(pos, "creature");

			if (!creatureType.equals("")) {
				//Get the item itself:
				return new ItemStack(getEggItem(creatureType), 1);
			}
			return null;
		}

		@Nullable
		public static Item getEggItem(String eggs) {
			eggs = LepidodendronMod.MODID + ":eggs_" + eggs.substring(32);
			Item item = ForgeRegistries.ITEMS.getValue(new ResourceLocation(eggs));
			//System.err.println("Eggitem: " + item);
			return item;
		}

		@Override
		public ItemStack getPickBlock(IBlockState state, RayTraceResult target, World world, BlockPos pos, EntityPlayer player) {
			ItemStack stack = getEggItemStack(world, pos);
			if (stack != null) {
				return stack;
			}
			return super.getPickBlock(state, target, world, pos, player);
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

		@Override
		public AxisAlignedBB getBoundingBox(IBlockState state, IBlockAccess source, BlockPos pos) {
			return new AxisAlignedBB(0.25D, 0D, 0.25D, 0.75D, 0.45D, 0.75D);
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

		@Override
		public boolean isFullCube(IBlockState state)
		{
			return false;
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

		@Override
		public boolean canPlaceBlockAt(World worldIn, BlockPos pos)
		{
			if ((worldIn.getBlockState(pos).getMaterial() != Material.WATER) && (worldIn.getBlockState(pos).getMaterial() != Material.LAVA)
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
			return new BlockEggs.TileEntityCustom();
		}

		public BlockEggs.TileEntityCustom createNewTileEntity(World worldIn, int meta) {
			return new BlockEggs.TileEntityCustom();
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

			if (!(worldIn.isRemote)) {
				if (!canPlaceBlockAt(worldIn, pos)) {
					EntityItem entityToSpawn = null;
					ItemStack stack = getEggItemStack(worldIn, pos);
					if (stack != null) {
						entityToSpawn = new EntityItem(worldIn, pos.getX(), pos.getY(), pos.getZ(), new ItemStack(stack.getItem(), (int) (1)));
						if (entityToSpawn != null) {
							entityToSpawn.setPickupDelay(10);
							worldIn.spawnEntity(entityToSpawn);
						}
					}
					worldIn.setBlockToAir(pos);
					return;
				}

				int incubation = 0;
				TileEntity te = worldIn.getTileEntity(pos);
				if (te != null) {
					if (te instanceof BlockEggs.TileEntityCustom) {
						BlockEggs.TileEntityCustom Egg = (BlockEggs.TileEntityCustom) te;
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

					EntityPrehistoricFloraAgeableBase.summon(worldIn, EntityList.getKey(getEggOwner(worldIn, pos)).toString(), nbtStr, (double) pos.getX() + 0.5D, (double) pos.getY() + 0.5D, (double) pos.getZ() + 0.5D);
					worldIn.playSound(null, pos, SoundEvents.BLOCK_SLIME_BREAK, SoundCategory.BLOCKS, 1.0F, 1.0F);

					if (te != null) {
						te.getTileData().setString("creature", "");
					}

					worldIn.setBlockToAir(pos);
				}
			}
		}

		@Nullable
		public static Class getEggOwner(World world, BlockPos pos) {
			//Get the matching entity for the nbt applied:

			String creatureType = "";
			TileEntity tileEntity = world.getTileEntity(pos);
			if (tileEntity != null) {
				if (tileEntity.getTileData().hasKey("creature")) {
					creatureType = tileEntity.getTileData().getString("creature");
				}
			}

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
			String creatureType = "";
			TileEntity tileEntity = world.getTileEntity(pos);
			if (tileEntity != null) {
				if (tileEntity.getTileData().hasKey("creature")) {
					creatureType = tileEntity.getTileData().getString("creature");
				}
			}

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
		private String creature;
		private String variant;

		@Override
		public void update() {
			if (this.incubation <= BlockEggs.BlockCustom.getIncubation(world, pos)) {
				++this.incubation; //increment the hidden tag up to 361 and stop there
			}
		}

		public int getIncubation() {
			return this.incubation;
		}

		public void setIncubation(int incubation) {
			this.incubation = incubation;
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
			if (compound.hasKey("PNType")) {
				this.variant = compound.getString("PNType");
			}
		}

		@Override
		public NBTTagCompound writeToNBT(NBTTagCompound compound) {
			super.writeToNBT(compound);
			compound.setInteger("incubation", this.incubation);
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
