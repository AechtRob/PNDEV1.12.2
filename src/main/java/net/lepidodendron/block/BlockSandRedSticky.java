
package net.lepidodendron.block;

import net.lepidodendron.ElementsLepidodendronMod;
import net.lepidodendron.LepidodendronSorter;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.NonNullList;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.common.EnumPlantType;
import net.minecraftforge.common.IPlantable;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;


@ElementsLepidodendronMod.ModElement.Tag
public class BlockSandRedSticky extends ElementsLepidodendronMod.ModElement {
	@GameRegistry.ObjectHolder("lepidodendron:sand_red_sticky")
	public static final Block block = null;
	public BlockSandRedSticky(ElementsLepidodendronMod instance) {
		super(instance, LepidodendronSorter.sand_red_sticky);
	}

	@Override
	public void initElements() {
		elements.blocks.add(() -> new BlockCustom().setRegistryName("sand_red_sticky"));
		elements.items.add(() -> new ItemBlock(block).setRegistryName(block.getRegistryName()));
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(block), 0,
				new ModelResourceLocation("lepidodendron:sand_red_sticky", "inventory"));
	}
	
	public static class BlockCustom extends Block implements ISustainsPlantType {
		public BlockCustom() {
			super(Material.SAND);
			setTranslationKey("pf_sand_red_sticky");
			setSoundType(SoundType.SAND);
			setCreativeTab(null);
			setLightLevel(0F);
			setLightOpacity(255);
			setHardness(0.5F);
			setResistance(0.5F);
			setHarvestLevel("shovel", 0);
		}

		@Override
		public boolean canSustainPlant(IBlockState state, IBlockAccess world, BlockPos pos, EnumFacing direction, IPlantable plantable) {

			net.minecraftforge.common.EnumPlantType plantType = plantable.getPlantType(world, pos.offset(direction));
			if (canSustainPlantType(world, pos, plantType)) {
				return true;
			}
			return super.canSustainPlant(state, world, pos, direction, plantable);
		}

		public boolean canSustainPlantType(IBlockAccess world, BlockPos pos, EnumPlantType plantType)
		{
			// support desert, plains and cave plants
			if (plantType == EnumPlantType.Desert)
			{
				return true;
			}
			// support beach plants if there's water alongside
			if (plantType == EnumPlantType.Beach)
			{
				return (
						world.getBlockState(pos.east()).getMaterial() == Material.WATER ||
								world.getBlockState(pos.west()).getMaterial() == Material.WATER ||
								world.getBlockState(pos.north()).getMaterial() == Material.WATER ||
								world.getBlockState(pos.south()).getMaterial() == Material.WATER
				);
			}
			return false;
		}

		@Override
		public MapColor getMapColor(IBlockState state, IBlockAccess blockAccess, BlockPos pos) {
			return MapColor.ADOBE;
		}

		@Override
		public void getDrops(NonNullList<ItemStack> drops, IBlockAccess world, BlockPos pos, IBlockState state, int fortune) {
			drops.add(new ItemStack(Blocks.SAND, (int) (1), 1));
		}

		@Override
		protected boolean canSilkHarvest()
	    {
	        return true;
	    }

		@Override
		public ItemStack getSilkTouchDrop(IBlockState state)  {
			return new ItemStack(Blocks.SAND, (int) (1), 1);
		}

		public void onEntityWalk(World worldIn, BlockPos pos, Entity entityIn) {
			if (Math.abs(entityIn.motionY) < 0.1D && entityIn.posY <= (double)entityIn.getPosition().getY()+0.1) {
				if (entityIn instanceof EntityPlayer &&  !entityIn.isSneaking()) {
					if (!((EntityPlayer) entityIn).capabilities.isCreativeMode) {
						entityIn.setInWeb();
					}
				} else if (entityIn instanceof EntityLivingBase) {
					entityIn.setInWeb();
				}
			}
		}

	}
}
