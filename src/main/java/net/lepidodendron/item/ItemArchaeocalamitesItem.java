
package net.lepidodendron.item;

import net.lepidodendron.ElementsLepidodendronMod;
import net.lepidodendron.LepidodendronConfig;
import net.lepidodendron.LepidodendronSorter;
import net.lepidodendron.block.BlockArchaeocalamites;
import net.lepidodendron.block.BlockArchaeocalamites2;
import net.lepidodendron.block.BlockArchaeocalamites3;
import net.lepidodendron.block.BlockArchaeocalamitesStem;
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
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.oredict.OreDictionary;

import java.util.List;

@ElementsLepidodendronMod.ModElement.Tag
public class ItemArchaeocalamitesItem extends ElementsLepidodendronMod.ModElement {
	@GameRegistry.ObjectHolder("lepidodendron:archaeocalamites_item")
	public static final Item block = null;
	public ItemArchaeocalamitesItem(ElementsLepidodendronMod instance) {
		super(instance, LepidodendronSorter.archaeocalamites_item);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemCustom());
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(block, 0, new ModelResourceLocation("lepidodendron:archaeocalamites_item", "inventory"));
	}

	@Override
	public void init(FMLInitializationEvent event) {
		super.init(event);
		OreDictionary.registerOre("plantdnaPNlepidodendron:archaeocalamites_item", ItemArchaeocalamitesItem.block);
		OreDictionary.registerOre("plantPrehistoric", ItemArchaeocalamitesItem.block);
		OreDictionary.registerOre("plant", ItemArchaeocalamitesItem.block);
		OreDictionary.registerOre("stemHorsetail", ItemArchaeocalamitesItem.block);
	}

	public static class ItemCustom extends Item {
		public ItemCustom() {
			setTranslationKey("pf_archaeocalamites_item");
			setRegistryName("archaeocalamites_item");
			setCreativeTab(TabLepidodendronPlants.tab);
		}

		@Override
		public EnumActionResult onItemUse(EntityPlayer player, World worldIn, BlockPos pos, EnumHand hand, EnumFacing facing, float hitX, float hitY, float hitZ)
			{
			if (BlockArchaeocalamites.block.canPlaceBlockAt(worldIn, pos.up()) && worldIn.isAirBlock(pos.up()))
                {
	                worldIn.setBlockState(pos.up(), BlockArchaeocalamites.block.getDefaultState(), 3);
	                if (worldIn.isAirBlock(pos.up(2))) {
	                	worldIn.setBlockState(pos.up(2), BlockArchaeocalamites2.block.getDefaultState(), 3);
			        	if (worldIn.isAirBlock(pos.up(3))) {
			        		worldIn.setBlockState(pos.up(3), BlockArchaeocalamites3.block.getDefaultState(), 3);
			        	}
                	}
                    if (!player.capabilities.isCreativeMode)
                    {
                        player.inventory.clearMatchingItems(new ItemStack(this, (int) (1)).getItem(), -1, (int) 1, null);
                    }
                    worldIn.playSound(player, pos, SoundEvents.BLOCK_GRASS_PLACE, SoundCategory.BLOCKS, 1.0F, 1.0F);
                    return EnumActionResult.SUCCESS;
                }
               	else {
	               	if (BlockArchaeocalamitesStem.block.canPlaceBlockAt(worldIn, pos.up()))
	                {
	                   // worldIn.setBlockState(pos.up(), BlockArchaeocalamitesStem.block.getDefaultState(), 3);
	                    
						int colWater = 1;
						while (colWater < 6 && isWaterBlock(worldIn, pos.up(colWater))) {
				    		//Check the water column:
				    		if (!(worldIn.isAirBlock(pos.up(colWater + 1))
				    		 	|| worldIn.getBlockState(pos.up(colWater + 1)).getBlock() == BlockArchaeocalamites.block))
				    		{
				    			worldIn.setBlockState(pos.up(colWater), BlockArchaeocalamitesStem.block.getDefaultState(), 3);
				    		}
				    		colWater = colWater + 1;
				    	}
						//System.err.println("colWater:" + colWater);
				    	if (BlockArchaeocalamites.block.canPlaceBlockAt(worldIn, pos.up(colWater)) && worldIn.isAirBlock(pos.up(colWater)))
		                {
			                worldIn.setBlockState(pos.up(colWater), BlockArchaeocalamites.block.getDefaultState(), 3);
			                if (worldIn.isAirBlock(pos.up(colWater + 1))) {
			                	worldIn.setBlockState(pos.up(colWater + 1), BlockArchaeocalamites2.block.getDefaultState(), 3);
					        	if (worldIn.isAirBlock(pos.up(colWater + 2))) {
					        		worldIn.setBlockState(pos.up(colWater + 2), BlockArchaeocalamites3.block.getDefaultState(), 3);
					        	}
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
							|| (worldIn.getBlockState(pos).getBlock() == BlockArchaeocalamitesStem.block))
	                	)
		                {
			                worldIn.setBlockState(pos.up(2), BlockArchaeocalamites.block.getDefaultState(), 3);
							if (worldIn.isAirBlock(pos.up(3))) {
			                	worldIn.setBlockState(pos.up(3), BlockArchaeocalamites2.block.getDefaultState(), 3);
					        	if (worldIn.isAirBlock(pos.up(4))) {
					        		worldIn.setBlockState(pos.up(4), BlockArchaeocalamites3.block.getDefaultState(), 3);
					        	}
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
				tooltip.add("Periods: Carboniferous");
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
