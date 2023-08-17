
package net.lepidodendron.block;

import net.lepidodendron.ElementsLepidodendronMod;
import net.lepidodendron.LepidodendronConfig;
import net.lepidodendron.LepidodendronSorter;
import net.lepidodendron.block.base.BlockLeavesPF;
import net.lepidodendron.creativetab.TabLepidodendronPlants;
import net.lepidodendron.util.CustomTrigger;
import net.lepidodendron.util.ModTriggers;
import net.minecraft.block.Block;
import net.minecraft.block.BlockLeaves;
import net.minecraft.block.BlockPlanks;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.client.renderer.block.statemap.StateMap;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraft.util.BlockRenderLayer;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.NonNullList;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.oredict.OreDictionary;

import javax.annotation.Nullable;

@ElementsLepidodendronMod.ModElement.Tag
public class BlockAridPineLeaves extends ElementsLepidodendronMod.ModElement {
	@GameRegistry.ObjectHolder("lepidodendron:arid_pine_leaves")
	public static final Block block = null;
	public BlockAridPineLeaves(ElementsLepidodendronMod instance) {
		super(instance, LepidodendronSorter.arid_pine_leaves);
	}

	@Override
	public void initElements() {
		elements.blocks.add(() -> new BlockCustom().setRegistryName("arid_pine_leaves"));
		elements.items.add(() -> new ItemBlock(block).setRegistryName(block.getRegistryName()));
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(block), 0,
				new ModelResourceLocation("lepidodendron:arid_pine_leaves", "inventory"));
		ModelLoader.setCustomStateMapper(block, (new StateMap.Builder()).ignore(BlockLeaves.DECAYABLE, BlockLeaves.CHECK_DECAY).build());
	}

	@Override
	public void init(FMLInitializationEvent event) {
		super.init(event);
		OreDictionary.registerOre("plantdnaPNlepidodendron:arid_pine_sapling", BlockAridPineLeaves.block);
		OreDictionary.registerOre("plantPrehistoric", BlockAridPineLeaves.block);
		OreDictionary.registerOre("plant", BlockAridPineLeaves.block);
		OreDictionary.registerOre("treeLeaves", BlockAridPineLeaves.block);
	}

	public static class BlockCustom extends BlockLeavesPF {
		public BlockCustom() {
			super();
			setTranslationKey("pf_arid_pine_leaves");
			setSoundType(SoundType.PLANT);
			setHardness(0.2F);
			setResistance(0.2F);
			setLightLevel(0F);
			setLightOpacity(1);
			setCreativeTab(TabLepidodendronPlants.tab);
			this.setDefaultState(this.blockState.getBaseState().withProperty(CHECK_DECAY, true).withProperty(DECAYABLE, true));
		}

		@Nullable
		@Override
		public CustomTrigger getModTrigger() {
			return ModTriggers.CLICK_ARID_PINE;
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
				return Item.getItemFromBlock(BlockAridPineSapling.block);
			}
		}
		
		@Override
		public void breakBlock(World worldIn, BlockPos pos, IBlockState state)  {
			super.breakBlock(worldIn, pos, state);
			if (worldIn.getBlockState(pos).getBlock() == BlockAridPineLog.block
				|| worldIn.getBlockState(pos).getBlock() == BlockAridPineLeaves.block) {
				return;
			}
			if ((Math.random() >= 0.8) && (LepidodendronConfig.doPropagation)) {
				IBlockState _bs = BlockAridPineFruit.block.getDefaultState();
				worldIn.setBlockState(pos, _bs, 3);
			}
		}

		@Override
		public void onBlockHarvested(World worldIn, BlockPos pos, IBlockState state, EntityPlayer player) {
			super.onBlockHarvested(worldIn, pos, state, player);
			if ((Math.random() >= 0.8) && (LepidodendronConfig.doPropagation)) {
				IBlockState _bs = BlockAridPineFruit.block.getDefaultState();
				worldIn.setBlockState(pos, _bs, 3);
				}
		}
	}
}
