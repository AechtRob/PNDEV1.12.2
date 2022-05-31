
package net.lepidodendron.block;

import net.lepidodendron.ElementsLepidodendronMod;
import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.LepidodendronSorter;
import net.lepidodendron.entity.base.EntityPrehistoricFloraAgeableBase;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.properties.PropertyInteger;
import net.minecraft.block.state.BlockFaceShape;
import net.minecraft.block.state.BlockStateContainer;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.renderer.block.statemap.StateMap;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.inventory.Container;
import net.minecraft.inventory.ItemStackHelper;
import net.minecraft.item.Item;
import net.minecraft.item.ItemEgg;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.network.NetworkManager;
import net.minecraft.network.play.server.SPacketUpdateTileEntity;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.tileentity.TileEntityLockableLoot;
import net.minecraft.util.*;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.common.IShearable;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.registry.EntityEntry;
import net.minecraftforge.fml.common.registry.ForgeRegistries;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.items.ItemHandlerHelper;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Random;

@ElementsLepidodendronMod.ModElement.Tag
public class BlockNest extends ElementsLepidodendronMod.ModElement {
	@GameRegistry.ObjectHolder("lepidodendron:nest")
	public static final Block block = null;
	public BlockNest(ElementsLepidodendronMod instance) {
		super(instance, LepidodendronSorter.nest);
	}

	@Override
	public void initElements() {
		elements.blocks.add(() -> new BlockCustom().setRegistryName("nest"));
		//elements.items.add(() -> new ItemBlock(block).setRegistryName(block.getRegistryName()));
	}

	public static final PropertyInteger TYPE = PropertyInteger.create("type", 0, 25);

	@Override
	public void init(FMLInitializationEvent event) {
		GameRegistry.registerTileEntity(BlockNest.TileEntityCustom.class, "lepidodendron:tileentitynest");
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		//ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(block), 0,
		//		new ModelResourceLocation("lepidodendron:lepidodendron_door", "inventory"));
		ModelLoader.setCustomStateMapper(block, (new StateMap.Builder()).ignore(BlockNest.TYPE).build());
	}

	public static class BlockCustom extends Block implements IShearable {

		public BlockCustom() {
			super(Material.PLANTS);
			setTranslationKey("pf_nest");
			setSoundType(SoundType.PLANT);
			setLightLevel(0F);
			setLightOpacity(0);
			setCreativeTab(null);
		}

		@Override
		public SoundType getSoundType(IBlockState state, World world, BlockPos pos, @Nullable Entity entity)
		{
			if (this.isMound(world, pos)) {
				return SoundType.SAND;
			}
			return SoundType.PLANT;
		}

		public static boolean isMound(World world, BlockPos pos) {
			String nestType = new Object() {
				public String getValue(BlockPos pos1, String tag) {
					TileEntity tileEntity = world.getTileEntity(pos1);
					if (tileEntity != null)
						return tileEntity.getTileData().getString(tag);
					return "";
				}
			}.getValue(pos, "creature");

			if (nestType.equalsIgnoreCase("lepidodendron:prehistoric_flora_claudiosaurus")
				|| nestType.equalsIgnoreCase("lepidodendron:prehistoric_flora_glaurung")
				|| nestType.equalsIgnoreCase("lepidodendron:prehistoric_flora_rautiania")
				|| nestType.equalsIgnoreCase("lepidodendron:prehistoric_flora_coelurosauravus")
			) {
				return true;
			}
			return false;
		}

		@Override
		protected BlockStateContainer createBlockState() {
			return new BlockStateContainer(this, new IProperty[]{TYPE});
		}

		@Override
		public IBlockState getStateFromMeta(int meta)
		{
			return this.getDefaultState();
		}

		@Override
		public int getMetaFromState(IBlockState state)
		{
			return 0;
		}

		@Override
		public IBlockState getActualState(IBlockState state, IBlockAccess worldIn, BlockPos pos)
		{
			IBlockState stateDown = worldIn.getBlockState(pos.down());
			int type = 0; //generic
			if (stateDown.getMaterial() == Material.GROUND) {type = 1;} //dirt
			if (stateDown.getMaterial() == Material.SAND) {type = 2;} //gravel
			if (stateDown == Blocks.SAND.getStateFromMeta(0)
					|| stateDown.getBlock() == BlockSandSticky.block
					|| stateDown.getBlock() == BlockSandWavy.block
					|| stateDown.getBlock() == BlockSandWavySticky.block
			) {type = 3;} //white sand
			if (stateDown == Blocks.SAND.getStateFromMeta(1)
					|| stateDown.getBlock() == BlockSandRedSticky.block
					|| stateDown.getBlock() == BlockSandRedWavy.block
					|| stateDown.getBlock() == BlockSandRedWavySticky.block
			) {type = 4;} //red sand
			if (stateDown.getBlock() == BlockSandPangaean.block
					|| stateDown.getBlock() == BlockSandPangaeanSticky.block
					|| stateDown.getBlock() == BlockSandPangaeanWavy.block
					|| stateDown.getBlock() == BlockSandPangaeanWavySticky.block
			) {type = 5;} //pangaean sand
			if (stateDown.getMaterial() == Material.CLAY) {type = 6;} //clay
			if (stateDown.getBlock() == BlockRedClay.block) {type = 7;} //red clay
			if (stateDown.getBlock() == BlockSiltyDirt.block
					|| stateDown.getBlock() == BlockCoarseSiltyDirt.block
			) {type = 8;} //silty dirt
			if (stateDown.getBlock() == BlockSandBlack.block
					|| stateDown.getBlock() == BlockSandBlackSticky.block
					|| stateDown.getBlock() == BlockSandBlackWavy.block
					|| stateDown.getBlock() == BlockSandBlackWavySticky.block
			) {type = 9;} //black sand
			if (stateDown.getBlock() == BlockSandyDirt.block
					|| stateDown.getBlock() == BlockCoarseSandyDirt.block
			) {type = 10;} //sandy dirt
			if (stateDown.getBlock() == BlockPrehistoricGroundLush.block
			) {type = 11;} //lush
			if (stateDown.getBlock() == BlockSandyDirtBlack.block
					|| stateDown.getBlock() == BlockCoarseSandyDirtBlack.block
			) {type = 12;} //black sandy dirt
			if (stateDown.getBlock() == BlockSandyDirtPangaean.block
					|| stateDown.getBlock() == BlockCoarseSandyDirtPangaean.block
			) {type = 13;} //pangaean sandy dirt
			if (stateDown.getBlock() == BlockSandyDirtRed.block
					|| stateDown.getBlock() == BlockCoarseSandyDirtRed.block
			) {type = 14;} //red sandy dirt
			if (stateDown.getBlock() == BlockPrehistoricGroundSand.block
			) {type = 15;} //white sandy prehistoric ground
			if (stateDown.getBlock() == BlockPrehistoricGroundSandRed.block
			) {type = 16;} //red sandy prehistoric ground
			if (stateDown.getBlock() == BlockPrehistoricGroundSandPangaean.block
			) {type = 17;} //pangaean sandy prehistoric ground
			if (stateDown.getBlock() == BlockPrehistoricGroundSandBlack.block
			) {type = 18;} //black sandy prehistoric ground
			if (stateDown.getBlock() == BlockPrehistoricGroundFern.block
			) {type = 19;} //ferny prehistoric ground
			if (stateDown.getBlock() == BlockPrehistoricGroundMossy.block
			) {type = 20;} //Mossy prehistoric ground
			if (stateDown.getBlock() == BlockLeafLitter.block
			) {type = 21;} //Leaflitter
			if (stateDown.getBlock() == Blocks.DIRT.getStateFromMeta(3).getBlock()
			) {type = 22;} //Podzol
			if (stateDown.getBlock() == BlockCarboniferousMud.block
			) {type = 23;} //Mud
			if (stateDown.getBlock() == BlockPrehistoricGroundBasic.block
			) {type = 24;} //regular prehistoric ground
			if (stateDown.getBlock() == BlockScorchedEarth.block
			) {type = 25;} //scorched dirt

			return state.withProperty(TYPE, type);
		}

		@Override
		public boolean isPassable(IBlockAccess worldIn, BlockPos pos) {
			return true;
		}

		@Override
		public void addCollisionBoxToList(IBlockState state, World worldIn, BlockPos pos, AxisAlignedBB entityBox, List<AxisAlignedBB> collidingBoxes, @Nullable Entity entityIn, boolean isActualState) {
			if (this.isMound(worldIn, pos)) {
				addCollisionBoxToList(pos, entityBox, collidingBoxes, new AxisAlignedBB(0.0625, 0, 0.0625, 0.9375, 0.0625, 0.9375));
				addCollisionBoxToList(pos, entityBox, collidingBoxes, new AxisAlignedBB(0.1875, 0, 0.1875, 0.8125, 0.125, 0.8125));
			}
		}

		@Override
		@Nullable
		public AxisAlignedBB getBoundingBox(IBlockState state, IBlockAccess source, BlockPos pos) {
			if (source instanceof World) {
				if (this.isMound((World) source, pos)) {
					return new AxisAlignedBB(0.0, 0, 0.0, 1.0, 0.125, 1.0);
				}
			}
			return new AxisAlignedBB(0.125, 0, 0.125, 0.875, 0.5, 0.875);
		}

		@Override
		public ItemStack getPickBlock(IBlockState state, RayTraceResult target, World world, BlockPos pos, EntityPlayer player) {
			ItemStack stack = getNestItemStack(world, pos);
			if (stack != null) {
				return stack;
			}
			return super.getPickBlock(state, target, world, pos, player);
		}

		@Override
		public void neighborChanged(IBlockState state, World worldIn, BlockPos pos, Block blockIn, BlockPos fromPos) {
			if (worldIn.isAirBlock(pos.down())) {
				worldIn.destroyBlock(pos, false);
				//((World) world).setBlockToAir(pos);
			}

			super.neighborChanged(state, worldIn, pos, blockIn, fromPos);
		}

		@Override
		public boolean canPlaceBlockAt(World worldIn, BlockPos pos) {
			if (worldIn.isAirBlock(pos.down())) {
				return false;
			}
			return super.canPlaceBlockAt(worldIn, pos);
		}

		@Nullable
		public static ItemStack getEggItemStack(@Nullable String stringEgg) {
			if (!stringEgg.equals("")) {
				//Get the item itself:
				return new ItemStack(getEggItem(stringEgg), 1);
			}
			return null;
		}

		@Nullable
		public static ItemStack getNestItemStack(World world, BlockPos pos) {
			//Get the matching nest item for the nbt applied:
			String nestType = new Object() {
				public String getValue(BlockPos pos1, String tag) {
					TileEntity tileEntity = world.getTileEntity(pos1);
					if (tileEntity != null)
						return tileEntity.getTileData().getString(tag);
					return "";
				}
			}.getValue(pos, "creature");

			if (!nestType.equals("")) {
				//Get the item itself:
				return new ItemStack(getNestItem(nestType), 1);
			}
			return null;
		}

		@Nullable
		public static Item getNestItem(String nest) {
			nest = LepidodendronMod.MODID + ":nest_" + nest.substring(32);
			Item item = ForgeRegistries.ITEMS.getValue(new ResourceLocation(nest));
			return item;
		}

		@Nullable
		public static Item getEggItem(String egg) {
			Item item = ForgeRegistries.ITEMS.getValue(new ResourceLocation(egg));
			//System.err.println("Eggitem: " + item);
			return item;
		}

		@Nullable
		public static Class getNestOwner(World world, BlockPos pos) {
			//Get the matching entity for the nbt applied:
			String nestType = new Object() {
				public String getValue(BlockPos pos1, String tag) {
					TileEntity tileEntity = world.getTileEntity(pos1);
					if (tileEntity != null)
						return tileEntity.getTileData().getString(tag);
					return "";
				}
			}.getValue(pos, "creature");

			if (!nestType.equals("")) {
				//Get the mob:
				Class<? extends Entity> clazz = findEntity(nestType);
				if (clazz != null) {
					return findEntity(nestType);
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

		public static <T extends EntityPrehistoricFloraAgeableBase> void AggroMob(World world, BlockPos pos, @Nullable Class <? extends T > classEntity, @Nullable EntityPlayer player, boolean onlySight) {

			if (classEntity != null) {
				if (player != null) { //Aggro on the player
					if (!player.capabilities.isCreativeMode) {
						List<EntityPrehistoricFloraAgeableBase> Entities = world.getEntitiesWithinAABB(classEntity, new AxisAlignedBB(pos.add(-16, -8, -16), pos.add(16, 8, 16)));
						for (EntityPrehistoricFloraAgeableBase currentEntity : Entities) {
							if (currentEntity.isPFAdult() && !player.isInvisible()) {
								currentEntity.setAttackTarget(player);
								currentEntity.setOneHit(true);
							}
						}
					}
				} else { //Aggro on the nearest living Entity
					EntityLivingBase entityLivingBase = null;
					List<EntityLivingBase> Entity = world.getEntitiesWithinAABB(EntityLivingBase.class, new AxisAlignedBB(pos.add(-6, -4, -6), pos.add(6, 4, 6)));
					for (EntityLivingBase currentEntity : Entity) {
						if (!(currentEntity.getClass().equals(classEntity))) {
							entityLivingBase = currentEntity;
							break;
						}
					}
					if (entityLivingBase != null) {
						List<EntityPrehistoricFloraAgeableBase> Entities = world.getEntitiesWithinAABB(classEntity, new AxisAlignedBB(pos.add(-16, -8, -16), pos.add(16, 8, 16)));
						for (EntityPrehistoricFloraAgeableBase currentEntity : Entities) {
							if (currentEntity.isPFAdult()
								&& entityLivingBase.canEntityBeSeen(currentEntity)
							) {
								currentEntity.setAttackTarget(entityLivingBase);
								currentEntity.setOneHit(true);
							}
						}
					}
				}
			}
		}

		@Override
		protected boolean canSilkHarvest() {
			return false;
		}

		@Override
		public boolean isShearable(@Nonnull ItemStack item, IBlockAccess world, BlockPos pos) {
			if (world instanceof World) {
				if (this.isMound((World) world, pos)) {
					return false;
				}
			}
			return true;
		}

		@Override
		public NonNullList<ItemStack> onSheared(ItemStack item, IBlockAccess world, BlockPos pos, int fortune) {
			ItemStack nestStack = getNestItemStack((World) world, pos);
			if (nestStack != null) {
				return NonNullList.withSize(1, new ItemStack(nestStack.getItem(), (int) (1)));
			}
			return NonNullList.withSize(1, new ItemStack(this, (int) (1)));
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
		public int getFlammability(IBlockAccess world, BlockPos pos, EnumFacing face) {
			return 10;
		}

		@Override
		public int getFireSpreadSpeed(IBlockAccess world, BlockPos pos, EnumFacing face) {
			return 10;
		}

		@Override
		public MapColor getMapColor(IBlockState state, IBlockAccess blockAccess, BlockPos pos) {
			return MapColor.FOLIAGE;
		}

		@Override
		public void breakBlock(World world, BlockPos pos, IBlockState state) {
			if (!world.isRemote ) {
				SpawnEggs(world, pos);
			}
			world.removeTileEntity(pos);

			super.breakBlock(world, pos, state);
		}

		@Override
		public void onBlockClicked(World worldIn, BlockPos pos, EntityPlayer playerIn) {
			if (!worldIn.isRemote) {
				ItemStack stack = playerIn.getHeldItemMainhand();
				if (stack.getItem() == Items.SHEARS && !this.isMound(worldIn, pos)) {
					//This will harvest:
					AggroMob(worldIn, pos, getNestOwner(worldIn, pos), playerIn, false);
				}
			}
			super.onBlockClicked(worldIn, pos, playerIn);
		}

		public boolean onBlockActivated(World world, BlockPos pos, IBlockState state, EntityPlayer player, EnumHand hand, EnumFacing facing, float hitX, float hitY, float hitZ)
		{
			if (this.isMound(world, pos)) {
				return super.onBlockActivated(world, pos, state, player, hand, facing, hitX, hitY, hitZ);
			}
			String eggRenderType = "";
			eggRenderType = new Object() {
				public String getValue(BlockPos pos, String tag) {
					TileEntity tileEntity = world.getTileEntity(pos);
					if (tileEntity != null)
						return tileEntity.getTileData().getString(tag);
					return "";
				}
			}.getValue(new BlockPos(pos), "egg");

			if ((!player.capabilities.allowEdit) || (!player.getHeldItemMainhand().isEmpty()) || eggRenderType.equals(""))
			{
				return super.onBlockActivated(world, pos, state, player, hand, facing, hitX, hitY, hitZ);
			}
			else {
				if (!((hand != player.getActiveHand()) && (hand == EnumHand.MAIN_HAND))) {
					ItemStack stackEggs = getEggItemStack(eggRenderType);
					if (stackEggs != null) {
						stackEggs.setCount(1);
						ItemHandlerHelper.giveItemToPlayer(player, stackEggs);
						TileEntity te = world.getTileEntity(pos);
						if (te != null) {
							te.getTileData().setString("egg", "");
							if (te instanceof TileEntityCustom) {
								TileEntityCustom tee = (TileEntityCustom) te;
								tee.setInventorySlotContents(0, ItemStack.EMPTY);
							}
						}
						IBlockState bstate = world.getBlockState(pos);
						world.notifyBlockUpdate(pos, bstate, bstate, 3);
						if (!player.capabilities.isCreativeMode) {
							AggroMob(world, pos, getNestOwner(world, pos), player, false);
						}
						return true;
					}
				}
				return true;
			}
		}

		public boolean removedByPlayer(IBlockState state, World world, BlockPos pos, EntityPlayer player, boolean willHarvest) {
			//Aggro nearby adults:
			if (!player.capabilities.isCreativeMode) {
				AggroMob(world, pos, getNestOwner(world, pos), player, false);
			}
			return super.removedByPlayer(state, world, pos, player, willHarvest);
		}

		public void SpawnEggs(World world, BlockPos pos) {
			String eggRenderType = new Object() {
				public String getValue(BlockPos pos, String tag) {
					TileEntity tileEntity = world.getTileEntity(pos);
					if (tileEntity != null)
						return tileEntity.getTileData().getString(tag);
					return "";
				}
			}.getValue(new BlockPos(pos), "egg");

			EntityItem entityToSpawn = null;
			if (!eggRenderType.equals("")) {
				ItemStack itemEgg = getEggItemStack(eggRenderType);
				//System.err.println("Block " + blockSpawn);
				if (itemEgg != null) {
					entityToSpawn = new EntityItem(world, pos.getX(), pos.getY(), pos.getZ(), new ItemStack(itemEgg.getItem(), (int) (1)));
				}
			}
			if (!world.isRemote && entityToSpawn != null) {
				entityToSpawn.setPickupDelay(10);
				world.spawnEntity(entityToSpawn);
				//System.err.println("Spawned " + entityToSpawn);
			}
		}

		@Override
		public boolean hasTileEntity(IBlockState state) {
			return true;
		}

		@Nullable
		@Override
		public TileEntity createTileEntity(World world, IBlockState state) {
			return new BlockNest.TileEntityCustom();
		}

		public BlockNest.TileEntityCustom createNewTileEntity(World worldIn, int meta) {
			return new BlockNest.TileEntityCustom();
		}

		@Override
		public boolean eventReceived(IBlockState state, World worldIn, BlockPos pos, int eventID, int eventParam) {
			super.eventReceived(state, worldIn, pos, eventID, eventParam);
			TileEntity tileentity = worldIn.getTileEntity(pos);
			return tileentity == null ? false : tileentity.receiveClientEvent(eventID, eventParam);
		}

		@Override
		public BlockFaceShape getBlockFaceShape(IBlockAccess world, IBlockState state, BlockPos pos, EnumFacing side) {
			return BlockFaceShape.UNDEFINED;
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
		public boolean isFullBlock(IBlockState state) {
			return false;
		}

		@Override
		public boolean isFullCube(IBlockState state) {
			return false;
		}

		@Override
		public boolean doesSideBlockRendering(IBlockState state, IBlockAccess world, BlockPos pos, EnumFacing face) {
			return false;
		}
	}

	public static class TileEntityCustom extends TileEntityLockableLoot implements ITickable {

		private NonNullList<ItemStack> stacks = NonNullList.<ItemStack>withSize(1, ItemStack.EMPTY);
		private String egg;
		private String creature;

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
		public void readFromNBT(NBTTagCompound compound)
		{
			super.readFromNBT(compound);
			if (compound.hasKey("egg")) {
				this.egg = compound.getString("egg");
			}
			if (compound.hasKey("creature")) {
				this.creature = compound.getString("creature");
			}
			this.stacks = NonNullList.<ItemStack>withSize(this.getSizeInventory(), ItemStack.EMPTY);
			if (!this.checkLootAndRead(compound))
				ItemStackHelper.loadAllItems(compound, this.stacks);
		}

		@Override
		public NBTTagCompound writeToNBT(NBTTagCompound compound)
		{
			super.writeToNBT(compound);
			if (this.hasEgg())
			{
				compound.setString("egg", this.egg);
			}
			if (this.hasCreature())
			{
				compound.setString("creature", this.creature);
			}
			if (!this.checkLootAndWrite(compound))
				ItemStackHelper.saveAllItems(compound, this.stacks);
			return compound;
		}

		public boolean hasEgg()
		{
			return this.egg != null;
		}

		public boolean hasCreature()
		{
			return this.creature != null && !this.creature.equals("");
		}

		@Override
		protected NonNullList<ItemStack> getItems() {
			return this.stacks;
		}

		@Override
		public int getSizeInventory() {
			return 1;
		}

		@Override
		public boolean isEmpty() {
			for (ItemStack itemstack : this.stacks)
				if (!itemstack.isEmpty())
					return false;
			return true;
		}

		@Override
		public boolean isItemValidForSlot(int index, ItemStack stack) {
			if (stack.getItem() instanceof ItemEgg) {
				return true;
			}
			return false;
		}

		@Override
		public ItemStack getStackInSlot(int slot) {
			return stacks.get(slot);
		}

		@Override
		public int getInventoryStackLimit() {
			return 1;
		}

		@Override
		public Container createContainer(InventoryPlayer playerInventory, EntityPlayer playerIn) {
			return null;
		}

		@Override
		public String getGuiID() {
			return null;
		}

		@Override
		public String getName() {
			return null;
		}

		@Override
		public void update() {
			//Check that this egg nbt tag matches the inventory contents:
			//If they do not match then either a player has removed an egg or some event has removed from the inventory
			//In either case, reset both to null and aggro the relevant mobs:
			if (!world.isRemote) {
				boolean flag = false;

				String egg = this.getTileData().getString("egg");

				//System.err.println("update tile: getStackInSlot(0) = " + getStackInSlot(0));
				//System.err.println("update tile: egg = " + egg);

				if (
					(egg.equals(""))
					&&
					(getStackInSlot(0) != ItemStack.EMPTY && getStackInSlot(0).getItem() != Items.AIR)
				) {
					flag = true;
				}
				//if
				//(egg != null) {
				if (!egg.equals("")
						&&
						(getStackInSlot(0) == ItemStack.EMPTY || getStackInSlot(0).getItem() == Items.AIR)
				) {
					flag = true;
					//System.err.println("Setting flag to true");
				}
				//}

				World world = this.getWorld();
				BlockPos pos = this.getPos();
				if (flag && BlockNest.BlockCustom.isMound(world, pos)) {
					world.setBlockToAir(pos);
				}
				else if (flag) {
					setInventorySlotContents(0, ItemStack.EMPTY);
					this.egg = "";
					this.getTileData().setString("egg", "");
					BlockNest.BlockCustom.AggroMob(world, pos, BlockNest.BlockCustom.getNestOwner(world, pos), null, true);
				}
			}
		}
	}
}