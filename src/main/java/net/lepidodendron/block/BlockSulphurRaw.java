
package net.lepidodendron.block;

import net.lepidodendron.ElementsLepidodendronMod;
import net.lepidodendron.LepidodendronSorter;
import net.lepidodendron.creativetab.TabLepidodendronMisc;
import net.lepidodendron.item.ItemSulphur;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import java.util.Random;

@ElementsLepidodendronMod.ModElement.Tag
public class BlockSulphurRaw extends ElementsLepidodendronMod.ModElement {
	@GameRegistry.ObjectHolder("lepidodendron:sulphur_block_raw")
	public static final Block block = null;
	public BlockSulphurRaw(ElementsLepidodendronMod instance) {
		super(instance, LepidodendronSorter.sulphur_block);
	}

	@Override
	public void initElements() {
		elements.blocks.add(() -> new BlockCustom().setRegistryName("sulphur_block_raw"));
		elements.items.add(() -> new ItemBlock(block).setRegistryName(block.getRegistryName()));
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(block), 0,
				new ModelResourceLocation("lepidodendron:sulphur_block_raw", "inventory"));
	}
	public static class BlockCustom extends Block {
		public BlockCustom() {
			super(Material.ROCK, MapColor.YELLOW_STAINED_HARDENED_CLAY);
			setTranslationKey("pf_sulphur_block_raw");
			setSoundType(SoundType.STONE);
			setHardness(0.5F);
			setResistance(2F);
			setLightLevel(0F);
			setLightOpacity(255);
			setCreativeTab(TabLepidodendronMisc.tab);
		}

		@Override
		protected boolean canSilkHarvest() {
			return true;
		}

		@Override
		protected ItemStack getSilkTouchDrop(IBlockState state) {
			return new ItemStack(this, 1);
		}

		@Override
		public Item getItemDropped(IBlockState state, Random rand, int fortune)
		{
			return ItemSulphur.block;
		}

		@Override
		public int quantityDropped(Random random)
		{
			return 1;
		}

		@Override
		public int quantityDroppedWithBonus(int fortune, Random random)
		{
			if (fortune > 0 && Item.getItemFromBlock(this) != this.getItemDropped((IBlockState)this.getBlockState().getValidStates().iterator().next(), random, fortune))
			{
				int i = random.nextInt(fortune + 2) - 1;

				if (i < 0)
				{
					i = 0;
				}

				return this.quantityDropped(random) * (i + 1);
			}
			else
			{
				return this.quantityDropped(random);
			}
		}

		@Override
		public int getFireSpreadSpeed(IBlockAccess world, BlockPos pos, EnumFacing face) {
			return 5;
		}

		@Override
		public MapColor getMapColor(IBlockState state, IBlockAccess blockAccess, BlockPos pos) {
			return MapColor.YELLOW_STAINED_HARDENED_CLAY;
		}
	}
}
