
package net.lepidodendron.block;

import net.lepidodendron.ElementsLepidodendronMod;
import net.lepidodendron.LepidodendronSorter;
import net.lepidodendron.item.ItemCageSmallItem;
import net.minecraft.block.Block;
import net.minecraft.block.BlockDirectional;
import net.minecraft.block.BlockLiquid;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.PropertyDirection;
import net.minecraft.block.state.BlockFaceShape;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.Entity;
import net.minecraft.entity.MultiPartEntityPart;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.nbt.NBTTagDouble;
import net.minecraft.nbt.NBTTagList;
import net.minecraft.util.BlockRenderLayer;
import net.minecraft.util.EnumBlockRenderType;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.fluids.BlockFluidBase;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.items.ItemHandlerHelper;

import javax.annotation.Nullable;
import java.util.List;
import java.util.Random;

@ElementsLepidodendronMod.ModElement.Tag
public class BlockCageSmall extends ElementsLepidodendronMod.ModElement {
	@GameRegistry.ObjectHolder("lepidodendron:cage_small")
	public static final Block block = null;
	public BlockCageSmall(ElementsLepidodendronMod instance) {
		super(instance, LepidodendronSorter.cage_small);
	}

	@Override
	public void initElements() {
		elements.blocks.add(() -> new BlockCustom().setRegistryName("cage_small"));
		//elements.items.add(() -> new ItemBlock(block).setRegistryName(block.getRegistryName()));
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		//ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(block), 0,
		//		new ModelResourceLocation("lepidodendron:cage_small", "inventory"));
	}

	public static class BlockCustom extends Block {
		public static final PropertyDirection FACING = BlockDirectional.FACING;
		public BlockCustom() {
			super(Material.IRON);
			setTranslationKey("pf_cage_small");
			setSoundType(SoundType.METAL);
			setHarvestLevel("pickaxe", 0);
			setHardness(5F);
			setResistance(4F);
			setLightLevel(0F);
			setLightOpacity(0);
			setCreativeTab(null);
		}

		@Override
		public ItemStack getPickBlock(IBlockState state, RayTraceResult target, World world, BlockPos pos, EntityPlayer player) {
			return new ItemStack(ItemCageSmallItem.block, 1);
		}

		@SideOnly(Side.CLIENT)
		@Override
		public EnumBlockRenderType getRenderType(IBlockState state) {
			return EnumBlockRenderType.MODEL;
		}

		@Override
		public int getFlammability(IBlockAccess world, BlockPos pos, EnumFacing face) {
			return 3;
		}

		@Override
		public int getFireSpreadSpeed(IBlockAccess world, BlockPos pos, EnumFacing face) {
			return 3;
		}

		@Override
		public MapColor getMapColor(IBlockState state, IBlockAccess blockAccess, BlockPos pos) {
			return MapColor.IRON;
		}

		@Override
		public boolean isSideSolid(IBlockState state, IBlockAccess world, BlockPos pos, EnumFacing side)
		{
			if (side == EnumFacing.DOWN) {
				return true;
			}

			return false;
		}

		@Override
		public BlockFaceShape getBlockFaceShape(IBlockAccess world, IBlockState state, BlockPos pos, EnumFacing side)
		{
			if (side == EnumFacing.DOWN) {
				return BlockFaceShape.SOLID;
			}

			return BlockFaceShape.UNDEFINED;
		}

		@Override
		public boolean canPlaceTorchOnTop(IBlockState state, IBlockAccess world, BlockPos pos) {
			return true;
		}

		@Override
		public boolean canPlaceBlockAt(World worldIn, BlockPos pos) {
			IBlockState state = worldIn.getBlockState(pos);
			Material material = state.getMaterial();
			Block block = state.getBlock();
			if (material == Material.WATER || material == Material.LAVA || block instanceof BlockFluidBase || block instanceof BlockLiquid) {
				return false;
			}
			else {
				return super.canPlaceBlockAt(worldIn, pos);
			}
		}

		@Override
		public boolean onBlockActivated(World worldIn, BlockPos pos, IBlockState state, EntityPlayer playerIn, EnumHand hand, EnumFacing facing, float hitX, float hitY, float hitZ) {

			if ((playerIn.capabilities.allowEdit) && (playerIn.getHeldItemMainhand().isEmpty())) {
				List<Entity> entity = worldIn.getEntitiesWithinAABB(Entity.class, new AxisAlignedBB(pos));
				if (!entity.isEmpty()) {
					if (entity.size() == 1) { //One entitiy - we can capture this:
						for (Entity currentEntity : entity) {
							ItemStack stackMobCage = new ItemStack(ItemCageSmallItem.block, (int) (1));
							stackMobCage.setCount(1);
							//Pick up this entity with the Cage:
							ItemHandlerHelper.giveItemToPlayer(playerIn, createCageWithEntity(currentEntity));
							worldIn.setBlockToAir(pos);
							return true;
						}
					}
				}
			}

			return super.onBlockActivated(worldIn, pos, state, playerIn, hand, facing, hitX, hitY, hitZ);
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

		@Override
		public Item getItemDropped(IBlockState state, Random rand, int fortune) {
			return new ItemStack(ItemCageSmallItem.block, (int) (1)).getItem();
		}

		@Override
		public boolean causesSuffocation(IBlockState state) {
			return false;
		}

		protected static final AxisAlignedBB AABBN1 = new AxisAlignedBB(0.0D, 0.0D, 0.00D, 0.1D, 1.5D, 0.00D);
		protected static final AxisAlignedBB AABBN2 = new AxisAlignedBB(0.45D, 0.0D, 0.00D, 0.55D, 1.5D, 0.00D);
		protected static final AxisAlignedBB AABBN3 = new AxisAlignedBB(0.9D, 0.0D, 0.00D, 1.0D, 1.5D, 0.00D);

		protected static final AxisAlignedBB AABBS1 = new AxisAlignedBB(0.0D, 0.0D, 1.00D, 0.1D, 1.5D, 1.0D);
		protected static final AxisAlignedBB AABBS2 = new AxisAlignedBB(0.45D, 0.0D, 1.00D, 0.55D, 1.5D, 1.0D);
		protected static final AxisAlignedBB AABBS3 = new AxisAlignedBB(0.9D, 0.0D, 1.00D, 1.0D, 1.5D, 1.0D);

		protected static final AxisAlignedBB AABBE1 = new AxisAlignedBB(1.00D, 0.0D, 0.0D, 1.0D, 1.5D, 0.1D);
		protected static final AxisAlignedBB AABBE2 = new AxisAlignedBB(1.00D, 0.0D, 0.45D, 1.0D, 1.5D, 0.55D);
		protected static final AxisAlignedBB AABBE3 = new AxisAlignedBB(1.00D, 0.0D, 0.9D, 1.0D, 1.5D, 1.0D);

		protected static final AxisAlignedBB AABBW1 = new AxisAlignedBB(0.00D, 0.0D, 0.0D, 0.00D, 1.5D, 0.1D);
		protected static final AxisAlignedBB AABBW2 = new AxisAlignedBB(0.00D, 0.0D, 0.45D, 0.00D, 1.5D, 0.55D);
		protected static final AxisAlignedBB AABBW3 = new AxisAlignedBB(0.00D, 0.0D, 0.9D, 0.00D, 1.5D, 1.0D);

		protected static final AxisAlignedBB AABBU = new AxisAlignedBB(0.0D, 1.00D, 0.0D, 1.0D, 1.5D, 1.0D);
		protected static final AxisAlignedBB AABBD = new AxisAlignedBB(0.0D, 0.0D, 0.0D, 1.0D, 0.05D, 1.0D);

		@Override
		public void addCollisionBoxToList(IBlockState state, World worldIn, BlockPos pos, AxisAlignedBB entityBox, List<AxisAlignedBB> collidingBoxes, @Nullable Entity entityIn, boolean isActualState) {
			addCollisionBoxToList(pos, entityBox, collidingBoxes, AABBN1);
			addCollisionBoxToList(pos, entityBox, collidingBoxes, AABBN2);
			addCollisionBoxToList(pos, entityBox, collidingBoxes, AABBN3);
			addCollisionBoxToList(pos, entityBox, collidingBoxes, AABBS1);
			addCollisionBoxToList(pos, entityBox, collidingBoxes, AABBS2);
			addCollisionBoxToList(pos, entityBox, collidingBoxes, AABBS3);
			addCollisionBoxToList(pos, entityBox, collidingBoxes, AABBE1);
			addCollisionBoxToList(pos, entityBox, collidingBoxes, AABBE2);
			addCollisionBoxToList(pos, entityBox, collidingBoxes, AABBE3);
			addCollisionBoxToList(pos, entityBox, collidingBoxes, AABBW1);
			addCollisionBoxToList(pos, entityBox, collidingBoxes, AABBW2);
			addCollisionBoxToList(pos, entityBox, collidingBoxes, AABBW3);
			addCollisionBoxToList(pos, entityBox, collidingBoxes, AABBU);
			addCollisionBoxToList(pos, entityBox, collidingBoxes, AABBD);
		}

		public ItemStack createCageWithEntity(Entity entity) {

			Entity checkEntity = entity;

			if (checkEntity instanceof MultiPartEntityPart) {
				MultiPartEntityPart multiPartEntity = (MultiPartEntityPart)entity;
				if (multiPartEntity.parent instanceof Entity) {
					checkEntity = (Entity) multiPartEntity.parent;
				}
			}

			ItemStack cageStack = new ItemStack(ItemCageSmallItem.block, 1);
			cageStack = getItemStackFromEntity(checkEntity, cageStack);
			checkEntity.setDead();

			return cageStack;
		}

		public static ItemStack getItemStackFromEntity(Entity entity, ItemStack spawnItem) {

			ItemStack stack = spawnItem;

			NBTTagCompound entityNBT = new NBTTagCompound();
			entity.writeToNBT(entityNBT);

			entityNBT.setShort("HurtTime", (short) 0);
			entityNBT.setTag("Motion", newDoubleNBTList(0.0D, 0.0D, 0.0D));
			entityNBT.setFloat("FallDistance", 0.0F);
			entityNBT.setString("id", getEntityId(entity));
			NBTTagCompound stackNBT = new NBTTagCompound();
			stackNBT.setTag("Mob", entityNBT);

			stack.setTagCompound(stackNBT);

			stack.getTagCompound().setString("mob_name", entity.getName());

			return stack;
		}

		private static NBTTagList newDoubleNBTList(double... numbers) {
			NBTTagList nbttaglist = new NBTTagList();
			for (double number : numbers) {
				nbttaglist.appendTag(new NBTTagDouble(number));
			}
			return nbttaglist;
		}

		public static String getEntityId(Entity entity) {
			String mobid = "";
			net.minecraftforge.fml.common.registry.EntityEntry entry =
					net.minecraftforge.fml.common.registry.EntityRegistry.getEntry(entity.getClass());
			if (entry != null) {
				mobid = entry.getRegistryName().toString();
			}
			return mobid;
		}

	}
}
