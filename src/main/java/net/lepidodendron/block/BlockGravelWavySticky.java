
package net.lepidodendron.block;

import net.lepidodendron.ElementsLepidodendronMod;
import net.lepidodendron.LepidodendronSorter;
import net.lepidodendron.creativetab.TabLepidodendronMisc;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraft.util.NonNullList;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import java.util.Random;

@ElementsLepidodendronMod.ModElement.Tag
public class BlockGravelWavySticky extends ElementsLepidodendronMod.ModElement {
	@GameRegistry.ObjectHolder("lepidodendron:gravel_wavy_sticky")
	public static final Block block = null;
	public BlockGravelWavySticky(ElementsLepidodendronMod instance) {
		super(instance, LepidodendronSorter.gravel_wavy_sticky);
	}

	@Override
	public void initElements() {
		elements.blocks.add(() -> new BlockCustom().setRegistryName("gravel_wavy_sticky"));
		elements.items.add(() -> new ItemBlock(block).setRegistryName(block.getRegistryName()));
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(block), 0,
				new ModelResourceLocation("lepidodendron:gravel_wavy_sticky", "inventory"));
	}
	
	public static class BlockCustom extends Block {
		public BlockCustom() {
			super(Material.SAND);
			this.setSoundType(SoundType.GROUND);
			setHardness(0.6F);
			setResistance(0.6F);
			setTranslationKey("pf_gravel_wavy_sticky");
			setHarvestLevel("shovel", 0);
			setCreativeTab(TabLepidodendronMisc.tab);
		}

		@Override
		public void getDrops(NonNullList<ItemStack> drops, IBlockAccess world, BlockPos pos, IBlockState state, int fortune) {
			drops.add(new ItemStack(Blocks.GRAVEL, (int) (1), 0));
		}

		@Override
		public MapColor getMapColor(IBlockState state, IBlockAccess worldIn, BlockPos pos)
		{
			return MapColor.STONE;
		}

		@Override
		public Item getItemDropped(IBlockState state, Random rand, int fortune)
		{
			if (fortune > 3)
			{
				fortune = 3;
			}

			return rand.nextInt(10 - fortune * 3) == 0 ? Items.FLINT : Item.getItemFromBlock(Blocks.GRAVEL);
		}

		@Override
		protected boolean canSilkHarvest()
		{
			return true;
		}

		@Override
		public ItemStack getSilkTouchDrop(IBlockState state)  {
			return new ItemStack(BlockGravelWavy.block, (int) (1), 0);
		}
		
	}
}
