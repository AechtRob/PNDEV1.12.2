
package net.lepidodendron.block;

import net.lepidodendron.ElementsLepidodendronMod;
import net.lepidodendron.LepidodendronSorter;
import net.lepidodendron.block.base.BlockFenceSpecialPF;
import net.lepidodendron.creativetab.TabLepidodendronBuilding;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@ElementsLepidodendronMod.ModElement.Tag
public class BlockChainLinkFence extends ElementsLepidodendronMod.ModElement {
	@GameRegistry.ObjectHolder("lepidodendron:chain_link_fence")
	public static final Block block = null;
	public BlockChainLinkFence(ElementsLepidodendronMod instance) {
		super(instance, LepidodendronSorter.chain_link_fence);
	}

	@Override
	public void initElements() {
		elements.blocks.add(() -> new BlockCustomPF().setRegistryName("chain_link_fence"));
		elements.items.add(() -> new ItemBlock(block).setRegistryName(block.getRegistryName()));
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(block), 0,
				new ModelResourceLocation("lepidodendron:chain_link_fence", "inventory"));
	}

	public static class BlockCustomPF extends BlockFenceSpecialPF {
		
		public BlockCustomPF() {
			super();
			setSoundType(SoundType.METAL);
			setTranslationKey("pf_chain_link_fence");
			setHardness(5.0F);
			setResistance(10.0F);
			setCreativeTab(TabLepidodendronBuilding.tab);
		}

		@Override
		public Material getMaterial(IBlockState state) {
			return Material.IRON;
		}

		@Override
		public MapColor getMapColor(IBlockState state, IBlockAccess blockAccess, BlockPos pos) {
			return MapColor.SILVER;
		}
		
	}
}
