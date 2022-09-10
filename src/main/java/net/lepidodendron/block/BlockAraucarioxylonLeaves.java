
package net.lepidodendron.block;

import net.lepidodendron.ElementsLepidodendronMod;
import net.lepidodendron.LepidodendronConfig;
import net.lepidodendron.LepidodendronSorter;
import net.lepidodendron.block.base.BlockLeavesPF;
import net.minecraft.block.Block;
import net.minecraft.block.BlockLeaves;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.client.renderer.block.statemap.StateMap;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@ElementsLepidodendronMod.ModElement.Tag
public class BlockAraucarioxylonLeaves extends ElementsLepidodendronMod.ModElement {
	@GameRegistry.ObjectHolder("lepidodendron:araucarioxylon_leaves")
	public static final Block block = null;
	public BlockAraucarioxylonLeaves(ElementsLepidodendronMod instance) {
		super(instance, LepidodendronSorter.araucarioxylon_leaves);
	}

	@Override
	public void initElements() {
		elements.blocks.add(() -> new BlockCustom().setRegistryName("araucarioxylon_leaves"));
		elements.items.add(() -> new ItemBlock(block).setRegistryName(block.getRegistryName()));
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(block), 0,
				new ModelResourceLocation("lepidodendron:araucarioxylon_leaves", "inventory"));
		ModelLoader.setCustomStateMapper(block, (new StateMap.Builder()).ignore(BlockLeaves.DECAYABLE, BlockLeaves.CHECK_DECAY).build());
	}
	public static class BlockCustom extends BlockLeavesPF {
		public BlockCustom() {
			setTranslationKey("pf_araucarioxylon_leaves");
		}

		@Override
		protected int getSaplingDropChance(IBlockState state) {
			return 20;
		}

		@Override
		public Item getItemDropped(IBlockState state, java.util.Random rand, int fortune) {
			if (LepidodendronConfig.doPropagation) {
				// Drop air and use the fruit method instead:
				return new ItemStack(Blocks.AIR, (int) (1)).getItem();
			}
			else {
				return Item.getItemFromBlock(BlockAraucarioxylonSapling.block);
			}
		}

		@Override
		public void breakBlock(World worldIn, BlockPos pos, IBlockState state)  {
			super.breakBlock(worldIn, pos, state);
			if ((Math.random() >= 0.95) && (LepidodendronConfig.doPropagation)) {
				IBlockState _bs = BlockAraucarioxylonFruitBlock.block.getDefaultState();
				worldIn.setBlockState(pos, _bs, 3);
			}
		}

		@Override
		public void onBlockHarvested(World worldIn, BlockPos pos, IBlockState state, EntityPlayer player) {
			super.onBlockHarvested(worldIn, pos, state, player);
			if ((Math.random() >= 0.9) && (LepidodendronConfig.doPropagation)) {
				IBlockState _bs = BlockAraucarioxylonFruitBlock.block.getDefaultState();
				worldIn.setBlockState(pos, _bs, 3);
			}
		}

	}
}
