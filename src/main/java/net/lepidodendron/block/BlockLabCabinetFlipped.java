
package net.lepidodendron.block;

import net.lepidodendron.ElementsLepidodendronMod;
import net.lepidodendron.LepidodendronSorter;
import net.minecraft.block.Block;
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
public class BlockLabCabinetFlipped extends ElementsLepidodendronMod.ModElement {
	@GameRegistry.ObjectHolder("lepidodendron:lab_cabinet_flipped")
	public static final Block block = null;

	public BlockLabCabinetFlipped(ElementsLepidodendronMod instance) {
		super(instance, LepidodendronSorter.lab_cabinet);
	}

	@Override
	public void initElements() {
		elements.blocks.add(() -> new BlockCustom().setRegistryName("lab_cabinet_flipped"));
		elements.items.add(() -> new ItemBlock(block).setRegistryName(block.getRegistryName()));
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(block), 0,
				new ModelResourceLocation("lepidodendron:lab_cabinet_flipped", "inventory"));
	}

	public static class BlockCustom extends BlockLabCabinet.BlockCustom {

		public BlockCustom() {
			super();
			setTranslationKey("pf_lab_cabinet_flipped");
		}

		@Override
		public int getPositionValue(IBlockState state, IBlockAccess worldIn, BlockPos pos) {
			if (worldIn.getBlockState(pos.up()).getBlock() == BlockLabCabinetFlipped.block
					&& worldIn.getBlockState(pos.down()).getBlock() == BlockLabCabinetFlipped.block) {
				return 2; //middle
			}
			else if (worldIn.getBlockState(pos.down()).getBlock() == BlockLabCabinetFlipped.block) {
				return 1; //top
			}
			else if (worldIn.getBlockState(pos.up()).getBlock() == BlockLabCabinetFlipped.block) {
				return 3; //bottom
			}
			return 0; //standalone
		}

	}
}