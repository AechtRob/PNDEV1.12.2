
package net.lepidodendron.item;

import net.lepidodendron.ElementsLepidodendronMod;
import net.lepidodendron.LepidodendronConfig;
import net.lepidodendron.LepidodendronSorter;
import net.lepidodendron.block.BlockPhyllotheca;
import net.lepidodendron.block.BlockPhyllothecaStem;
import net.lepidodendron.block.BlockPhyllothecaTop;
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
public class ItemPhyllothecaItem extends ElementsLepidodendronMod.ModElement {
	@GameRegistry.ObjectHolder("lepidodendron:phyllotheca_item")
	public static final Item block = null;
	public ItemPhyllothecaItem(ElementsLepidodendronMod instance) {
		super(instance, LepidodendronSorter.phyllotheca_item);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemCustom());
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(block, 0, new ModelResourceLocation("lepidodendron:phyllotheca_item", "inventory"));
	}

	@Override
	public void init(FMLInitializationEvent event) {
		super.init(event);
		OreDictionary.registerOre("plantdnaPNlepidodendron:phyllotheca_item", ItemPhyllothecaItem.block);
		OreDictionary.registerOre("plantPrehistoric", ItemPhyllothecaItem.block);
		OreDictionary.registerOre("plant", ItemPhyllothecaItem.block);
		OreDictionary.registerOre("stemHorsetail", ItemPhyllothecaItem.block);
	}

	public static class ItemCustom extends Item {
		public ItemCustom() {
			setTranslationKey("pf_phyllotheca_item");
			setRegistryName("phyllotheca_item");
			setCreativeTab(TabLepidodendronPlants.tab);
		}

		@Override
		public EnumActionResult onItemUse(EntityPlayer player, World worldIn, BlockPos pos, EnumHand hand, EnumFacing facing, float hitX, float hitY, float hitZ)
			{
			if (BlockPhyllotheca.block.canPlaceBlockAt(worldIn, pos.up()) && worldIn.isAirBlock(pos.up()))
                {
	                worldIn.setBlockState(pos.up(), BlockPhyllotheca.block.getDefaultState(), 3);
	                if (worldIn.isAirBlock(pos.up(2))) {
	                	worldIn.setBlockState(pos.up(2), BlockPhyllothecaTop.block.getDefaultState(), 3);
                	}
                    if (!player.capabilities.isCreativeMode)
                    {
                        player.inventory.clearMatchingItems(new ItemStack(this, (int) (1)).getItem(), -1, (int) 1, null);
                    }
                    worldIn.playSound(player, pos, SoundEvents.BLOCK_GRASS_PLACE, SoundCategory.BLOCKS, 1.0F, 1.0F);
                    return EnumActionResult.SUCCESS;
                }
               	else {
	               	if (BlockPhyllothecaStem.block.canPlaceBlockAt(worldIn, pos.up()))
	                {
	                   // worldIn.setBlockState(pos.up(), BlockPhyllothecaStem.block.getDefaultState(), 3);
	                    
						int colWater = 1;
						while (colWater < 4 && isWaterBlock(worldIn, pos.up(colWater))) {
				    		//Check the water column:
				    		if (!(worldIn.isAirBlock(pos.up(colWater + 1))
				    		 	|| worldIn.getBlockState(pos.up(colWater + 1)).getBlock() == BlockPhyllotheca.block))
				    		{
				    			worldIn.setBlockState(pos.up(colWater), BlockPhyllothecaStem.block.getDefaultState(), 3);
				    		}
				    		colWater = colWater + 1;
				    	}
						//System.err.println("colWater:" + colWater);
				    	if (BlockPhyllotheca.block.canPlaceBlockAt(worldIn, pos.up(colWater)) && worldIn.isAirBlock(pos.up(colWater)))
		                {
			                worldIn.setBlockState(pos.up(colWater), BlockPhyllotheca.block.getDefaultState(), 3);
			                if (worldIn.isAirBlock(pos.up(colWater + 1))) {
			                	worldIn.setBlockState(pos.up(colWater + 1), BlockPhyllothecaTop.block.getDefaultState(), 3);
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
							|| (worldIn.getBlockState(pos).getBlock() == BlockPhyllothecaStem.block))
	                	)
		                {
			                worldIn.setBlockState(pos.up(2), BlockPhyllotheca.block.getDefaultState(), 3);
							if (worldIn.isAirBlock(pos.up(3))) {
			                	worldIn.setBlockState(pos.up(3), BlockPhyllothecaTop.block.getDefaultState(), 3);
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
				tooltip.add("Periods: Permian - Triassic");
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
