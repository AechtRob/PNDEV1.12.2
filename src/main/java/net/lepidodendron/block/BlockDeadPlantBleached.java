
package net.lepidodendron.block;

import net.lepidodendron.ElementsLepidodendronMod;
import net.lepidodendron.LepidodendronSorter;
import net.lepidodendron.creativetab.TabLepidodendronMisc;
import net.minecraft.block.Block;
import net.minecraft.block.BlockDeadBush;
import net.minecraft.block.SoundType;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.BlockPos;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@ElementsLepidodendronMod.ModElement.Tag
public class BlockDeadPlantBleached extends ElementsLepidodendronMod.ModElement {
	@GameRegistry.ObjectHolder("lepidodendron:dead_plant_bleached")
	public static final Block block = null;
	public BlockDeadPlantBleached(ElementsLepidodendronMod instance) {
		super(instance, LepidodendronSorter.dead_plant_bleached);
	}

	@Override
	public void initElements() {
		elements.blocks.add(() -> new BlockCustom().setRegistryName("dead_plant_bleached"));
		elements.items.add(() -> new ItemBlock(block).setRegistryName(block.getRegistryName()));
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(block), 0,
			new ModelResourceLocation("lepidodendron:dead_plant_bleached", "inventory"));
	}
	public static class BlockCustom extends BlockDeadBush {
		public BlockCustom() {
			setSoundType(SoundType.PLANT);
			setTranslationKey("pf_dead_plant_bleached");
			setCreativeTab(TabLepidodendronMisc.tab);
		}

		@Override
		public boolean isShearable(ItemStack item, net.minecraft.world.IBlockAccess world, BlockPos pos) {
			return true;
		}

		@Override
		public java.util.List<ItemStack> onSheared(ItemStack item, net.minecraft.world.IBlockAccess world, BlockPos pos, int fortune) {
			return java.util.Arrays.asList(new ItemStack(this));
		}

		@Override
		public net.minecraftforge.common.EnumPlantType getPlantType(net.minecraft.world.IBlockAccess world, BlockPos pos)
		{
			return net.minecraftforge.common.EnumPlantType.Desert;
		}

	}
}
