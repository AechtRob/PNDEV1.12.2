
package net.lepidodendron.block;

import net.lepidodendron.ElementsLepidodendronMod;
import net.lepidodendron.LepidodendronSorter;
import net.lepidodendron.item.ItemGlassJarItem;
import net.minecraft.block.Block;
import net.minecraft.block.BlockLiquid;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.BlockFaceShape;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.MultiPartEntityPart;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.nbt.NBTTagDouble;
import net.minecraft.nbt.NBTTagList;
import net.minecraft.util.*;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
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
public class BlockGlassJar extends ElementsLepidodendronMod.ModElement {
	@GameRegistry.ObjectHolder("lepidodendron:glass_jar")
	public static final Block block = null;
	public BlockGlassJar(ElementsLepidodendronMod instance) {
		super(instance, LepidodendronSorter.glass_jar);
	}

	@Override
	public void initElements() {
		elements.blocks.add(() -> new BlockCustom().setRegistryName("glass_jar"));
		//elements.items.add(() -> new ItemBlock(block).setRegistryName(block.getRegistryName()));
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		//ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(block), 0,
		//		new ModelResourceLocation("lepidodendron:glass_jar", "inventory"));
	}

	public static class BlockCustom extends Block {

		public BlockCustom() {
			super(Material.GLASS);
			setTranslationKey("pf_glass_jar");
			setSoundType(SoundType.GLASS);
			setTickRandomly(true);
			setHardness(0.3F);
			setResistance(0.3F);
			setLightLevel(0F);
			setLightOpacity(0);
			setCreativeTab(null);
		}

		public static final DamageSource FREEZE = new DamageSource("freeze");

		@Override
		public void randomTick(World worldIn, BlockPos pos, IBlockState state, Random random) {
			//If the block is on ice and has something in it, do the drops:
			if ((worldIn.getBlockState(pos.north()).getMaterial() == Material.ICE
					|| worldIn.getBlockState(pos.north()).getMaterial() == Material.PACKED_ICE)
				&& (worldIn.getBlockState(pos.south()).getMaterial() == Material.ICE
					|| worldIn.getBlockState(pos.south()).getMaterial() == Material.PACKED_ICE)
				&& (worldIn.getBlockState(pos.east()).getMaterial() == Material.ICE
					|| worldIn.getBlockState(pos.east()).getMaterial() == Material.PACKED_ICE)
				&& (worldIn.getBlockState(pos.west()).getMaterial() == Material.ICE
					|| worldIn.getBlockState(pos.west()).getMaterial() == Material.PACKED_ICE)
			) {
				List<Entity> entity = worldIn.getEntitiesWithinAABB(Entity.class, new AxisAlignedBB(pos));
				if (!entity.isEmpty()) {
					if (entity.size() == 1) { //One entity - we can process this:
						for (Entity currentEntity : entity) {
							if (currentEntity instanceof EntityLivingBase) {
								EntityLivingBase e = (EntityLivingBase) currentEntity;
								e.attackEntityFrom(FREEZE, e.getMaxHealth() + 1);
							}
						}
					}
				}
			}
			super.randomTick(worldIn, pos, state, random);
		}

		@SideOnly(Side.CLIENT)
		@Override
		public EnumBlockRenderType getRenderType(IBlockState state) {
			return EnumBlockRenderType.MODEL;
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
			return MapColor.SILVER;
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
							ItemStack stackMobJar = new ItemStack(ItemGlassJarItem.block, (int) (1));
							stackMobJar.setCount(1);
							//Pick up this entity with the Jar:
							ItemHandlerHelper.giveItemToPlayer(playerIn, createJarWithEntity(currentEntity));
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
		public Item getItemDropped(IBlockState state, java.util.Random rand, int fortune) {
			return (new ItemStack(ItemGlassJarItem.block, 1).getItem());
		}

		@Override
		protected ItemStack getSilkTouchDrop(IBlockState state) {
			return new ItemStack(ItemGlassJarItem.block, 1);
		}

		@Override
		public boolean causesSuffocation(IBlockState state) {
			return false;
		}

		protected static final AxisAlignedBB AABBN1 = new AxisAlignedBB(0.0D, 0.0D, 0.0D, 1.0D, 1.0D, 0.1875D);

		protected static final AxisAlignedBB AABBS1 = new AxisAlignedBB(0.0D, 0.0D, 0.8125D, 1.0D, 1.0D, 1.0D);

		protected static final AxisAlignedBB AABBE1 = new AxisAlignedBB(0.8125D, 0.0D, 0.0D, 1.0D, 1.0D, 1.0D);

		protected static final AxisAlignedBB AABBW1 = new AxisAlignedBB(0.0D, 0.0D, 0.0D, 0.1875D, 1.0D, 1.0D);

		protected static final AxisAlignedBB AABBU = new AxisAlignedBB(0.0D, 0.9370D, 0.0D, 1.0D, 1.0D, 1.0D);
		protected static final AxisAlignedBB AABBD = new AxisAlignedBB(0.0D, 0.0D, 0.0D, 1.0D, 0.0625D, 1.0D);

		@Override
		public void addCollisionBoxToList(IBlockState state, World worldIn, BlockPos pos, AxisAlignedBB entityBox, List<AxisAlignedBB> collidingBoxes, @Nullable Entity entityIn, boolean isActualState) {
			addCollisionBoxToList(pos, entityBox, collidingBoxes, AABBN1);
			addCollisionBoxToList(pos, entityBox, collidingBoxes, AABBS1);
			addCollisionBoxToList(pos, entityBox, collidingBoxes, AABBE1);
			addCollisionBoxToList(pos, entityBox, collidingBoxes, AABBW1);
			addCollisionBoxToList(pos, entityBox, collidingBoxes, AABBU);
			addCollisionBoxToList(pos, entityBox, collidingBoxes, AABBD);
		}

		public static ItemStack createJarWithEntity(Entity entity) {

			Entity checkEntity = entity;

			if (checkEntity instanceof MultiPartEntityPart) {
				MultiPartEntityPart multiPartEntity = (MultiPartEntityPart)entity;
				if (multiPartEntity.parent instanceof Entity) {
					checkEntity = (Entity) multiPartEntity.parent;
				}
			}

			ItemStack JarStack = new ItemStack(ItemGlassJarItem.block, 1);
			JarStack = getItemStackFromEntity(checkEntity, JarStack);
			checkEntity.setDead();

			return JarStack;
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
