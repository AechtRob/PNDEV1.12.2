
package net.lepidodendron.block;

import net.lepidodendron.ElementsLepidodendronMod;
import net.lepidodendron.LepidodendronConfig;
import net.lepidodendron.LepidodendronSorter;
import net.lepidodendron.block.base.BlockLeavesPF;
import net.lepidodendron.procedure.ProcedureTreeLeaf;
import net.lepidodendron.util.CustomTrigger;
import net.lepidodendron.util.ModTriggers;
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
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.oredict.OreDictionary;

import javax.annotation.Nullable;

@ElementsLepidodendronMod.ModElement.Tag
public class BlockColumnarisLeaves extends ElementsLepidodendronMod.ModElement {
	@GameRegistry.ObjectHolder("lepidodendron:columnaris_leaves")
	public static final Block block = null;
	public BlockColumnarisLeaves(ElementsLepidodendronMod instance) {
		super(instance, LepidodendronSorter.columnaris_leaves);
	}

	@Override
	public void initElements() {
		elements.blocks.add(() -> new BlockCustom().setRegistryName("columnaris_leaves"));
		elements.items.add(() -> new ItemBlock(block).setRegistryName(block.getRegistryName()));
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(block), 0,
				new ModelResourceLocation("lepidodendron:columnaris_leaves", "inventory"));
		ModelLoader.setCustomStateMapper(block, (new StateMap.Builder()).ignore(BlockLeaves.DECAYABLE, BlockLeaves.CHECK_DECAY).build());
	}

	@Override
	public void init(FMLInitializationEvent event) {
		super.init(event);
		OreDictionary.registerOre("plantdnaPNlepidodendron:columnaris_sapling", BlockColumnarisLeaves.block);
		OreDictionary.registerOre("plantPrehistoric", BlockColumnarisLeaves.block);
		OreDictionary.registerOre("plant", BlockColumnarisLeaves.block);
		OreDictionary.registerOre("treeLeaves", BlockColumnarisLeaves.block);
	}

	public static class BlockCustom extends BlockLeavesPF {
		public BlockCustom() {
			setTranslationKey("pf_columnaris_leaves");
		}

		@Nullable
		@Override
		public CustomTrigger getModTrigger() {
			return ModTriggers.CLICK_COLUMNARIS;
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
				return Item.getItemFromBlock(BlockColumnarisSapling.block);
			}
		}
		
		@Override
		public void breakBlock(World worldIn, BlockPos pos, IBlockState state)  {
			super.breakBlock(worldIn, pos, state);
			
			if (state.getBlock() != BlockColumnarisLeaves1.block) {

				int k = pos.getX();
		        int l = pos.getY();
		        int i1 = pos.getZ();
		
		        if (worldIn.isAreaLoaded(new BlockPos(k - 3, l - 3, i1 - 3), new BlockPos(k + 3, l + 3, i1 + 3)))
		        {
		            for (int j1 = -2; j1 <= 2; ++j1)
		            {
		                for (int k1 = -2; k1 <= 2; ++k1)
		                {
		                    for (int l1 = -2; l1 <= 2; ++l1)
		                    {
		                        BlockPos blockpos = pos.add(j1, k1, l1);
		                        IBlockState iblockstate = worldIn.getBlockState(blockpos);
		
		                        if (iblockstate.getBlock() == BlockColumnarisLeaves1.block)
		                        {
		                        	ProcedureTreeLeaf.executeProcedure((int) blockpos.getX(), (int) blockpos.getY(), (int) blockpos.getZ(), worldIn, BlockColumnarisLeaves.block);
		                            //iblockstate.getBlock().beginLeavesDecay(iblockstate, worldIn, blockpos);
		                        }
		                    }
		                }
		            }
		        }
				if ((Math.random() >= 0.75) && (LepidodendronConfig.doPropagation)) {
					IBlockState _bs = BlockColumnarisFruitBlock.block.getDefaultState();
					worldIn.setBlockState(pos, _bs, 3);
					}
			}
		}

		@Override
		public void onBlockHarvested(World worldIn, BlockPos pos, IBlockState state, EntityPlayer player) {
			super.onBlockHarvested(worldIn, pos, state, player);
			int k = pos.getX();
	        int l = pos.getY();
	        int i1 = pos.getZ();
	
	        if (worldIn.isAreaLoaded(new BlockPos(k - 3, l - 3, i1 - 3), new BlockPos(k + 3, l + 3, i1 + 3)))
	        {
	            for (int j1 = -2; j1 <= 2; ++j1)
	            {
	                for (int k1 = -2; k1 <= 2; ++k1)
	                {
	                    for (int l1 = -2; l1 <= 2; ++l1)
	                    {
	                        BlockPos blockpos = pos.add(j1, k1, l1);
	                        IBlockState iblockstate = worldIn.getBlockState(blockpos);
	
	                        if (iblockstate.getBlock() == BlockColumnarisLeaves1.block)
	                        {
	                        	ProcedureTreeLeaf.executeProcedure((int) blockpos.getX(), (int) blockpos.getY(), (int) blockpos.getZ(), worldIn, BlockColumnarisLeaves.block);
	                            //iblockstate.getBlock().beginLeavesDecay(iblockstate, worldIn, blockpos);
	                        }
	                    }
	                }
	            }
	        }
			if ((Math.random() >= 0.75) && (LepidodendronConfig.doPropagation)) {
				IBlockState _bs = BlockColumnarisFruitBlock.block.getDefaultState();
				worldIn.setBlockState(pos, _bs, 3);
				}
		}
	}
}
