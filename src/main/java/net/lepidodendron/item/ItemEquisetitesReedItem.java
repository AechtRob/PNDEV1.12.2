
package net.lepidodendron.item;

import net.lepidodendron.ElementsLepidodendronMod;
import net.lepidodendron.LepidodendronConfig;
import net.lepidodendron.LepidodendronSorter;
import net.lepidodendron.block.BlockEquisetitesReed;
import net.lepidodendron.block.BlockEquisetitesReedStem;
import net.lepidodendron.block.BlockEquisetitesReedTop;
import net.lepidodendron.creativetab.TabLepidodendronPlants;
import net.minecraft.block.BlockLiquid;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.SoundEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import java.util.List;

@ElementsLepidodendronMod.ModElement.Tag
public class ItemEquisetitesReedItem extends ElementsLepidodendronMod.ModElement {
	@GameRegistry.ObjectHolder("lepidodendron:equisetites_reed_item")
	public static final Item block = null;
	public ItemEquisetitesReedItem(ElementsLepidodendronMod instance) {
		super(instance, LepidodendronSorter.equisetites_reed_item);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemCustom());
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(block, 0, new ModelResourceLocation("lepidodendron:equisetites_reed_item", "inventory"));
	}
	public static class ItemCustom extends Item {
		public ItemCustom() {
			setTranslationKey("pf_equisetites_reed_item");
			setRegistryName("equisetites_reed_item");
			setCreativeTab(TabLepidodendronPlants.tab);
		}

		@Override
		public EnumActionResult onItemUse(EntityPlayer player, World worldIn, BlockPos pos, EnumHand hand, EnumFacing facing, float hitX, float hitY, float hitZ)
			{
			if (BlockEquisetitesReed.block.canPlaceBlockAt(worldIn, pos.up()) && worldIn.isAirBlock(pos.up()))
                {
	                worldIn.setBlockState(pos.up(), BlockEquisetitesReed.block.getDefaultState(), 3);
	                if (worldIn.isAirBlock(pos.up(2))) {
	                	worldIn.setBlockState(pos.up(2), BlockEquisetitesReedTop.block.getDefaultState(), 3);
                	}
                    if (!player.capabilities.isCreativeMode)
                    {
                        player.inventory.clearMatchingItems(new ItemStack(this, (int) (1)).getItem(), -1, (int) 1, null);
                    }
                    worldIn.playSound(player, pos, SoundEvents.BLOCK_GRASS_PLACE, SoundCategory.BLOCKS, 1.0F, 1.0F);
                    return EnumActionResult.SUCCESS;
                }
               	else {
	               	if (BlockEquisetitesReedStem.block.canPlaceBlockAt(worldIn, pos.up()))
	                {
	                   // worldIn.setBlockState(pos.up(), BlockEquisetitesReedStem.block.getDefaultState(), 3);
	                    
						int colWater = 1;
						while (colWater < 6 && isWaterBlock(worldIn, pos.up(colWater))) {
				    		//Check the water column:
				    		if (!(worldIn.isAirBlock(pos.up(colWater + 1))
				    		 	|| worldIn.getBlockState(pos.up(colWater + 1)).getBlock() == BlockEquisetitesReed.block))
				    		{
				    			worldIn.setBlockState(pos.up(colWater), BlockEquisetitesReedStem.block.getDefaultState(), 3);
				    		}
				    		colWater = colWater + 1;
				    	}
						//System.err.println("colWater:" + colWater);
				    	if (BlockEquisetitesReed.block.canPlaceBlockAt(worldIn, pos.up(colWater)) && worldIn.isAirBlock(pos.up(colWater)))
		                {
			                worldIn.setBlockState(pos.up(colWater), BlockEquisetitesReed.block.getDefaultState(), 3);
			                if (worldIn.isAirBlock(pos.up(colWater + 1))) {
			                	worldIn.setBlockState(pos.up(colWater + 1), BlockEquisetitesReedTop.block.getDefaultState(), 3);
		                	}
		                }
			    
	                    if (!player.capabilities.isCreativeMode)
	                    {
	                       	player.inventory.clearMatchingItems(new ItemStack(this, (int) (1)).getItem(), -1, (int) 1, null);
	                    }
	                    worldIn.playSound(player, pos.up(), SoundEvents.BLOCK_GRASS_PLACE, SoundCategory.BLOCKS, 1.0F, 1.0F);
	                    return EnumActionResult.SUCCESS;
	                }
	                else {
	                	if (isWaterBlock(worldIn, pos.up()) && worldIn.isAirBlock(pos.up(2))
						&& (((worldIn.getBlockState(pos).getMaterial() == Material.SAND)
							|| (worldIn.getBlockState(pos).getMaterial() == Material.GROUND)
							|| (worldIn.getBlockState(pos).getMaterial() == Material.GRASS)
							|| (worldIn.getBlockState(pos).getMaterial() == Material.CLAY))
							|| (worldIn.getBlockState(pos).getBlock() == BlockEquisetitesReedStem.block))
	                	)
		                {
			                worldIn.setBlockState(pos.up(2), BlockEquisetitesReed.block.getDefaultState(), 3);
							if (worldIn.isAirBlock(pos.up(3))) {
			                	worldIn.setBlockState(pos.up(3), BlockEquisetitesReedTop.block.getDefaultState(), 3);
		                	}
			                
		                    if (!player.capabilities.isCreativeMode)
		                    {
		                        player.inventory.clearMatchingItems(new ItemStack(this, (int) (1)).getItem(), -1, (int) 1, null);
		                    }
		                    worldIn.playSound(player, pos, SoundEvents.BLOCK_GRASS_PLACE, SoundCategory.BLOCKS, 1.0F, 1.0F);
		                    return EnumActionResult.SUCCESS;
		                }
	                }
               	}
				return EnumActionResult.PASS;
		}


	    @SideOnly(Side.CLIENT)
		@Override
	    public void addInformation(ItemStack stack, World player, List<String> tooltip, ITooltipFlag advanced) {
	        if (LepidodendronConfig.showTooltips) {
				tooltip.add("Type: Horsetail shrub");
				tooltip.add("Periods: Triassic - Jurassic - Cretaceous");
				tooltip.add("Note: can be planted under water or on land, on dirt, grass, clay or sand");
				tooltip.add("Propagation: spores");}
	        super.addInformation(stack, player, tooltip, advanced);
	    }
	}

	public static boolean isWaterBlock(World world, BlockPos pos) {
			if (world.getBlockState(pos).getMaterial() == Material.WATER) {
				IBlockState iblockstate = world.getBlockState(pos);
				if (((Integer)iblockstate.getValue(BlockLiquid.LEVEL)).intValue() == 0) {
					return true;
				}
			}
	    	return false;
	    }
		
}
