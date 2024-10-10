
package net.lepidodendron.block;

import net.lepidodendron.ElementsLepidodendronMod;
import net.lepidodendron.LepidodendronSorter;
import net.lepidodendron.item.ItemZirconGlassDoorWoodItem;
import net.minecraft.block.Block;
import net.minecraft.block.BlockDoor;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.BlockFaceShape;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.renderer.block.statemap.StateMap;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.BlockRenderLayer;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.util.text.translation.I18n;
import net.minecraft.world.World;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import java.util.Random;

@ElementsLepidodendronMod.ModElement.Tag
public class BlockZirconGlassDoorWood extends ElementsLepidodendronMod.ModElement {
	@GameRegistry.ObjectHolder("lepidodendron:zircon_glass_door_wood")
	public static final Block block = null;
	public BlockZirconGlassDoorWood(ElementsLepidodendronMod instance) {
		super(instance, LepidodendronSorter.zircon_glass_door_wood);
	}

	@Override
	public void initElements() {
		elements.blocks.add(() -> new BlockCustom().setRegistryName("zircon_glass_door_wood"));
		//elements.items.add(() -> new ItemBlock(block).setRegistryName(block.getRegistryName()));
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		//ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(block), 0,
		//		new ModelResourceLocation("lepidodendron:lepidodendron_door", "inventory"));
		ModelLoader.setCustomStateMapper(block, (new StateMap.Builder()).ignore(BlockCustom.POWERED).build());
	}
	
	public static class BlockCustom extends BlockDoor {
		public BlockCustom() {
			super(Material.GLASS);
			setTranslationKey("pf_zircon_glass_door_wood");
			setSoundType(SoundType.GLASS);
			setHardness(0.3F);
			setLightLevel(0F);
			setLightOpacity(0);
			setCreativeTab(null);
		}

		@Override
		public boolean isOpaqueCube(IBlockState state) {
			return false;
		}

		@SideOnly(Side.CLIENT)
		@Override
		public BlockRenderLayer getRenderLayer()
		{
			return BlockRenderLayer.CUTOUT;
		}

		@Override
		public boolean canRenderInLayer(IBlockState state, BlockRenderLayer layer) {
			return layer == BlockRenderLayer.TRANSLUCENT;
		}

		@Override
		public ItemStack getItem(World worldIn, BlockPos pos, IBlockState state)
		{
			return new ItemStack(ItemZirconGlassDoorWoodItem.block, (int) (1));
		}

		@Override
		public ItemStack getPickBlock(IBlockState state, RayTraceResult target, World world, BlockPos pos, EntityPlayer player)
		{
			return new ItemStack(ItemZirconGlassDoorWoodItem.block, (int) (1));
		}

		@Override
		public String getTranslationKey()
		{
			return "tile.zircon_glass_door_wood.name";
		}

		@Override
		public String getLocalizedName()
		{
			return I18n.translateToLocal("item.zircon_glass_door_wood_item.name");
		}

		@Override
		public Item getItemDropped(IBlockState state, Random rand, int fortune)
		{
			return state.getValue(HALF) == EnumDoorHalf.UPPER ? Items.AIR : (new ItemStack(ItemZirconGlassDoorWoodItem.block, (int) (1))).getItem();
		}

		@Override
		public void neighborChanged(IBlockState state, World worldIn, BlockPos pos, Block blockIn, BlockPos fromPos)
		{
			if (state.getValue(HALF) == EnumDoorHalf.UPPER)
			{
				BlockPos blockpos = pos.down();
				IBlockState iblockstate = worldIn.getBlockState(blockpos);

				if (iblockstate.getBlock() != this)
				{
					worldIn.setBlockToAir(pos);
				}
				else if (blockIn != this)
				{
					iblockstate.neighborChanged(worldIn, blockpos, blockIn, fromPos);
				}
			}
			else
			{
				boolean flag1 = false;
				BlockPos blockpos1 = pos.up();
				IBlockState iblockstate1 = worldIn.getBlockState(blockpos1);

				if (iblockstate1.getBlock() != this)
				{
					worldIn.setBlockToAir(pos);
					flag1 = true;
				}

				if (!isSideSolidForDoor(worldIn, pos.down(), EnumFacing.UP))
				{
					worldIn.setBlockToAir(pos);
					flag1 = true;

					if (iblockstate1.getBlock() == this)
					{
						worldIn.setBlockToAir(blockpos1);
					}
				}

				if (flag1)
				{
					if (!worldIn.isRemote)
					{
						this.dropBlockAsItem(worldIn, pos, state, 0);
					}
				}
				else
				{
					boolean flag = worldIn.isBlockPowered(pos) || worldIn.isBlockPowered(blockpos1);

					if (blockIn != this && (flag || blockIn.getDefaultState().canProvidePower()) && flag != ((Boolean)iblockstate1.getValue(POWERED)).booleanValue())
					{
						worldIn.setBlockState(blockpos1, iblockstate1.withProperty(POWERED, Boolean.valueOf(flag)), 2);

						if (flag != ((Boolean)state.getValue(OPEN)).booleanValue())
						{
							worldIn.setBlockState(pos, state.withProperty(OPEN, Boolean.valueOf(flag)), 2);
							worldIn.markBlockRangeForRenderUpdate(pos, pos);
							worldIn.playEvent((EntityPlayer)null, flag ? 1006 : 1012, pos, 0);
						}
					}
				}
			}
		}

		@Override
		public boolean canPlaceBlockAt(World worldIn, BlockPos pos)
		{
			if (pos.getY() >= worldIn.getHeight() - 1)
			{
				return false;
			}
			else
			{
				IBlockState state = worldIn.getBlockState(pos.down());
				return (state.isTopSolid() || state.getBlockFaceShape(worldIn, pos.down(), EnumFacing.UP) == BlockFaceShape.SOLID) && worldIn.getBlockState(pos).getBlock().isReplaceable(worldIn, pos) && worldIn.getBlockState(pos.up()).getBlock().isReplaceable(worldIn, pos.up());
			}
		}

		public static boolean isSideSolidForDoor(World world, BlockPos pos, EnumFacing facing) {

			return world.getBlockState(pos).isSideSolid(world,  pos, facing)
					|| (world.getBlockState(pos).getMaterial() == Material.GLASS && world.getBlockState(pos).getBlockFaceShape(world, pos, facing) == BlockFaceShape.SOLID);
		}

	}
}
