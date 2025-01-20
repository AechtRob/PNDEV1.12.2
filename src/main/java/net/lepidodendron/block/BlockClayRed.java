
package net.lepidodendron.block;

import net.lepidodendron.ElementsLepidodendronMod;
import net.lepidodendron.LepidodendronSorter;
import net.lepidodendron.creativetab.TabLepidodendronMisc;
import net.lepidodendron.item.ItemClayBallRed;
import net.minecraft.block.Block;
import net.minecraft.block.BlockClay;
import net.minecraft.block.SoundType;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.oredict.OreDictionary;

import java.util.Random;

@ElementsLepidodendronMod.ModElement.Tag
public class BlockClayRed extends ElementsLepidodendronMod.ModElement {
	@GameRegistry.ObjectHolder("lepidodendron:clay_red")
	public static final Block block = null;
	public BlockClayRed(ElementsLepidodendronMod instance) {
		super(instance, LepidodendronSorter.clay_red);
	}

	@Override
	public void initElements() {
		elements.blocks.add(() -> new BlockCustom().setRegistryName("clay_red"));
		elements.items.add(() -> new ItemBlock(block).setRegistryName(block.getRegistryName()));
	}

	@Override
	public void init(FMLInitializationEvent event) {
		super.init(event);
		OreDictionary.registerOre("blockClay", BlockClayRed.block);
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(block), 0,
				new ModelResourceLocation("lepidodendron:clay_red", "inventory"));
	}
	public static class BlockCustom extends BlockClay {
		public BlockCustom() {
			super();
			setHardness(0.6F);
			setSoundType(SoundType.GROUND);
			setTranslationKey("pf_clay_red");
			setHarvestLevel("shovel", 0);
			setCreativeTab(TabLepidodendronMisc.tab);
		}

		@Override
		public Item getItemDropped(IBlockState state, Random rand, int fortune)
		{
			return ItemClayBallRed.block;
		}

	}
}
