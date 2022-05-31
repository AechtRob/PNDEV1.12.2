
package net.lepidodendron.block;

import net.lepidodendron.ElementsLepidodendronMod;
import net.lepidodendron.LepidodendronSorter;
import net.lepidodendron.creativetab.TabLepidodendronMisc;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.util.EnumFacing;
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
public class BlockLeafLitter extends ElementsLepidodendronMod.ModElement {
	@GameRegistry.ObjectHolder("lepidodendron:leaf_litter")
	public static final Block block = null;
	public BlockLeafLitter(ElementsLepidodendronMod instance) {
		super(instance, LepidodendronSorter.leaf_litter);
	}

	@Override
	public void initElements() {
		elements.blocks.add(() -> new BlockCustom().setRegistryName("leaf_litter"));
		elements.items.add(() -> new ItemBlock(block).setRegistryName(block.getRegistryName()));
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(block), 0,
				new ModelResourceLocation("lepidodendron:leaf_litter", "inventory"));
	}
	public static class BlockCustom extends Block implements ISustainsPlantType {
		public BlockCustom() {
			super(Material.GROUND);
			setTranslationKey("pf_leaf_litter_dirt");
			setSoundType(SoundType.PLANT);
			setHarvestLevel("shovel", 0);
			setHardness(0.2F);
			setResistance(0.5F);
			setLightLevel(0F);
			setLightOpacity(255);
			setCreativeTab(TabLepidodendronMisc.tab);
		}

		@Override
		public boolean canSustainPlant(IBlockState state, IBlockAccess world, BlockPos pos, EnumFacing direction, IPlantable plantable) {

			if (plantable == Blocks.MELON_STEM || plantable == Blocks.PUMPKIN_STEM)
			{
				return true;
			}

			net.minecraftforge.common.EnumPlantType plantType = plantable.getPlantType(world, pos.offset(direction));
			if (canSustainPlantType(world, pos, plantType)) {
				return true;
			}
			return super.canSustainPlant(state, world, pos, direction, plantable);
		}

		public boolean canSustainPlantType(IBlockAccess world, BlockPos pos, EnumPlantType plantType)
		{

			// Note: EnumPlantType will be changed at runtime by other mods using a Forge functionality.
			//       switch() does NOT work with enums in that case, but will crash when encountering
			//       a value not known beforehand.

			// support plains and cave plants
			if (plantType == EnumPlantType.Plains || plantType == EnumPlantType.Cave)
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
			// don't support nether plants, water plants, or crops (require farmland), or anything else by default
			return false;
		}

		public void onFallenUpon(World worldIn, BlockPos pos, Entity entityIn, float fallDistance)
		{
			entityIn.fall(fallDistance, 0.2F);
		}

		public void onLanded(World worldIn, Entity entityIn)
		{
			if (entityIn.isSneaking())
			{
				super.onLanded(worldIn, entityIn);
			}
			else if (entityIn.motionY < 0.0D)
			{
				entityIn.motionY = (-entityIn.motionY * 0.4D);

				if (!(entityIn instanceof EntityLivingBase))
				{
					entityIn.motionY *= 0.4D;
				}
			}
		}
	}
}
