
package net.lepidodendron.block;

import net.lepidodendron.ElementsLepidodendronMod;
import net.lepidodendron.LepidodendronSorter;
import net.lepidodendron.creativetab.TabLepidodendronBuilding;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.util.BlockRenderLayer;
import net.minecraft.util.EnumBlockRenderType;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@ElementsLepidodendronMod.ModElement.Tag
public class BlockDNARecombinerRail extends ElementsLepidodendronMod.ModElement {
	@GameRegistry.ObjectHolder("lepidodendron:dna_recombiner_rail")
	public static final Block block = null;
	public BlockDNARecombinerRail(ElementsLepidodendronMod instance) {
		super(instance, LepidodendronSorter.dna_recombiner_rail);
	}

	@Override
	public void initElements() {
		elements.blocks.add(() -> new BlockCustom().setRegistryName("dna_recombiner_rail"));
		elements.items.add(() -> new ItemBlock(block).setRegistryName(block.getRegistryName()));
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(block), 0,
				new ModelResourceLocation("lepidodendron:dna_recombiner_rail", "inventory"));
	}
	public static class BlockCustom extends Block {
		public BlockCustom() {
			super(Material.ROCK, MapColor.ADOBE);
			setTranslationKey("pf_dna_recombiner_rail");
			setSoundType(SoundType.GROUND);
			setHarvestLevel("pickaxe", 0);
			setHardness(0.5F);
			setResistance(2F);
			setLightLevel(0);
			setLightOpacity(0);
			setCreativeTab(TabLepidodendronBuilding.tab);
		}

		@Override
		public EnumBlockRenderType getRenderType(IBlockState state) {
			return EnumBlockRenderType.MODEL;
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
		public boolean isFullCube(IBlockState state)
		{
			return false;
		}

		@Override
		public boolean doesSideBlockRendering(IBlockState state, IBlockAccess world, BlockPos pos, EnumFacing face) {
			return false;
		}
	}
}
