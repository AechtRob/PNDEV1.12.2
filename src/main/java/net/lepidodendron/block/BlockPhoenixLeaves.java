
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
import net.minecraft.init.Items;
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
public class BlockPhoenixLeaves extends ElementsLepidodendronMod.ModElement {
	@GameRegistry.ObjectHolder("lepidodendron:phoenix_leaves")
	public static final Block block = null;
	public BlockPhoenixLeaves(ElementsLepidodendronMod instance) {
		super(instance, LepidodendronSorter.phoenix_leaves);
	}

	@Override
	public void initElements() {
		elements.blocks.add(() -> new BlockCustom().setRegistryName("phoenix_leaves"));
		elements.items.add(() -> new ItemBlock(block).setRegistryName(block.getRegistryName()));
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(block), 0,
				new ModelResourceLocation("lepidodendron:phoenix_leaves", "inventory"));
		ModelLoader.setCustomStateMapper(block, (new StateMap.Builder()).ignore(BlockLeaves.DECAYABLE, BlockLeaves.CHECK_DECAY).build());
	}

	@Override
	public void init(FMLInitializationEvent event) {
		super.init(event);
		OreDictionary.registerOre("plantdnaPNlepidodendron:phoenix_sapling", BlockPhoenixLeaves.block);
		OreDictionary.registerOre("plantPrehistoric", BlockPhoenixLeaves.block);
		OreDictionary.registerOre("plant", BlockPhoenixLeaves.block);
		OreDictionary.registerOre("treeLeaves", BlockPhoenixLeaves.block);
		OreDictionary.registerOre("leavesPalm", BlockPhoenixLeaves.block);
	}

	public static class BlockCustom extends BlockLeavesPF {
		public BlockCustom() {
			setTranslationKey("pf_phoenix_leaves");
		}

		@Nullable
		@Override
		public CustomTrigger getModTrigger() {
			return ModTriggers.CLICK_PHOENIX;
		}
		
		@Override
		protected int getSaplingDropChance(IBlockState state) {
			return 20;
		}

		@Override
		public Item getItemDropped(IBlockState state, java.util.Random rand, int fortune) {
			if (LepidodendronConfig.doPropagation) {
				return new ItemStack(Items.AIR, (int) (1)).getItem();
			}
			else {
				return Item.getItemFromBlock(BlockPhoenixSapling.block);
			}
		}

		@Override
		public void breakBlock(World worldIn, BlockPos pos, IBlockState state)  {
			super.breakBlock(worldIn, pos, state);
			
			if (state.getBlock() != BlockPhoenixLeaves1.block) {
				
				//Replace surrounding blocks with decayable variants:
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
		
		                        if (iblockstate.getBlock() == BlockPhoenixLeaves1.block)
		                        {
		                        	ProcedureTreeLeaf.executeProcedure((int) blockpos.getX(), (int) blockpos.getY(), (int) blockpos.getZ(), worldIn, BlockPhoenixLeaves.block);
		                            //iblockstate.getBlock().beginLeavesDecay(iblockstate, worldIn, blockpos);
		                        }
		                    }
		                }
		            }
		        }
			}
		}

		@Override
		public void onBlockHarvested(World worldIn, BlockPos pos, IBlockState state, EntityPlayer player) {
			super.onBlockHarvested(worldIn, pos, state, player);
			//Replace surrounding blocks with decayable variants:
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
	
	                        if (iblockstate.getBlock() == BlockPhoenixLeaves1.block)
	                        {
	                        	ProcedureTreeLeaf.executeProcedure((int) blockpos.getX(), (int) blockpos.getY(), (int) blockpos.getZ(), worldIn, BlockPhoenixLeaves.block);
	                            //iblockstate.getBlock().beginLeavesDecay(iblockstate, worldIn, blockpos);
	                        }
	                    }
	                }
	            }
	        }
		}

	}
}
