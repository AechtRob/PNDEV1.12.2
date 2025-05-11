
package net.lepidodendron.item;

import net.lepidodendron.ElementsLepidodendronMod;
import net.lepidodendron.LepidodendronConfig;
import net.lepidodendron.LepidodendronSorter;
import net.lepidodendron.block.BlockIraniaLand;
import net.lepidodendron.block.BlockIraniaWater;
import net.lepidodendron.creativetab.TabLepidodendronPlants;
import net.minecraft.advancements.CriteriaTriggers;
import net.minecraft.block.BlockLiquid;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.init.SoundEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.stats.StatList;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumHand;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.RayTraceResult;
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
public class ItemIraniaItem extends ElementsLepidodendronMod.ModElement {
	@GameRegistry.ObjectHolder("lepidodendron:irania_item")
	public static final Item block = null;
	public ItemIraniaItem(ElementsLepidodendronMod instance) {
		super(instance, LepidodendronSorter.irania);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemCustom());
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(block, 0, new ModelResourceLocation("lepidodendron:irania_item", "inventory"));
	}

	@Override
	public void init(FMLInitializationEvent event) {
		super.init(event);
		OreDictionary.registerOre("plantdnaPNlepidodendron:irania_item", ItemIraniaItem.block);
		OreDictionary.registerOre("plantPrehistoric", ItemIraniaItem.block);
		OreDictionary.registerOre("plant", ItemIraniaItem.block);
	}

	public static class ItemCustom extends Item {
		public ItemCustom() {
			setTranslationKey("pf_irania_item");
			setRegistryName("irania_item");
			setCreativeTab(TabLepidodendronPlants.tab);
		}

		public ActionResult<ItemStack> onItemRightClick(World worldIn, EntityPlayer playerIn, EnumHand handIn)
	    {
	        ItemStack itemstack = playerIn.getHeldItem(handIn);
	        RayTraceResult raytraceresult = this.rayTrace(worldIn, playerIn, true);
	
	        if (raytraceresult == null)
	        {
	            return new ActionResult<ItemStack>(EnumActionResult.PASS, itemstack);
	        }
	        else
	        {
	            if (raytraceresult.typeOfHit == RayTraceResult.Type.BLOCK)
	            {
	                BlockPos blockpos = raytraceresult.getBlockPos();
	
	                if (!worldIn.isBlockModifiable(playerIn, blockpos) || !playerIn.canPlayerEdit(blockpos.offset(raytraceresult.sideHit), raytraceresult.sideHit, itemstack))
	                {
	                    return new ActionResult<ItemStack>(EnumActionResult.FAIL, itemstack);
	                }
	
	                BlockPos blockpos1 = blockpos.up();
	                IBlockState iblockstate = worldIn.getBlockState(blockpos);
	                IBlockState iblockstate1 = worldIn.getBlockState(blockpos1);
					if (BlockIraniaLand.block.canPlaceBlockAt(worldIn, blockpos1) && (iblockstate1.getMaterial().isReplaceable())) {
						worldIn.setBlockState(blockpos1, BlockIraniaLand.block.getDefaultState(), 3);
						BlockIraniaLand.block.onBlockAdded(worldIn, blockpos1, BlockIraniaLand.block.getDefaultState());
						if (!playerIn.capabilities.isCreativeMode)
		                    {
		                        itemstack.shrink(1);
		                    }
	                    playerIn.addStat(StatList.getObjectUseStats(this));
	                    worldIn.playSound(playerIn, blockpos, SoundEvents.BLOCK_GRASS_PLACE, SoundCategory.BLOCKS, 1.0F, 1.0F);
	                    return new ActionResult<ItemStack>(EnumActionResult.SUCCESS, itemstack);
					}
					else {
		                if (canSurviveAt(worldIn, blockpos1) && (iblockstate.getMaterial() == Material.WATER && ((Integer)iblockstate.getValue(BlockLiquid.LEVEL)).intValue() == 0 && worldIn.isAirBlock(blockpos1))
							&& (
									worldIn.isAirBlock(blockpos1)
									&& worldIn.isAirBlock(blockpos1.up())
									&& worldIn.isAirBlock(blockpos1.up(2))
								)
						) {
		                    // special case for handling block placement with water lilies
		                    net.minecraftforge.common.util.BlockSnapshot blocksnapshot = net.minecraftforge.common.util.BlockSnapshot.getBlockSnapshot(worldIn, blockpos1);
		                    worldIn.setBlockState(blockpos1, BlockIraniaWater.block.getDefaultState());
							BlockIraniaWater.block.onBlockAdded(worldIn, blockpos1, BlockIraniaWater.block.getDefaultState());
		                    if (net.minecraftforge.event.ForgeEventFactory.onPlayerBlockPlace(playerIn, blocksnapshot, net.minecraft.util.EnumFacing.UP, handIn).isCanceled())
		                    {
		                        blocksnapshot.restore(true, false);
		                        return new ActionResult<ItemStack>(EnumActionResult.FAIL, itemstack);
		                    }
		
		                    worldIn.setBlockState(blockpos1, BlockIraniaWater.block.getDefaultState(), 11);
							BlockIraniaWater.block.onBlockAdded(worldIn, blockpos1, BlockIraniaWater.block.getDefaultState());
		
		                    if (playerIn instanceof EntityPlayerMP)
		                    {
		                        CriteriaTriggers.PLACED_BLOCK.trigger((EntityPlayerMP)playerIn, blockpos1, itemstack);
		                    }
		
		                    if (!playerIn.capabilities.isCreativeMode)
		                    {
		                        itemstack.shrink(1);
		                    }
		
		                    playerIn.addStat(StatList.getObjectUseStats(this));
		                    worldIn.playSound(playerIn, blockpos, SoundEvents.BLOCK_GRASS_PLACE, SoundCategory.BLOCKS, 1.0F, 1.0F);
		                    return new ActionResult<ItemStack>(EnumActionResult.SUCCESS, itemstack);
		                }
		            }
	        	}
	
	            return new ActionResult<ItemStack>(EnumActionResult.FAIL, itemstack);
	        }
	    }

	    @SideOnly(Side.CLIENT)
		@Override
	    public void addInformation(ItemStack stack, World player, List<String> tooltip, ITooltipFlag advanced) {
	        if (LepidodendronConfig.showTooltips) {
				tooltip.add("Type: Uncertain Gymnosperm");
				tooltip.add("Periods: Triassic");
				tooltip.add("Note: Placed either on land or at water surface of one-block deep water, over grass, dirt, clay or sand.");
				tooltip.add("Propagation: Seeds");}
	        super.addInformation(stack, player, tooltip, advanced);
	    }
	}

	public static boolean canSurviveAt(World worldIn, BlockPos pos) {
		if (worldIn.getBlockState(pos.down()).getMaterial() != Material.WATER && worldIn.getBlockState(pos.down()).getMaterial() != Material.ICE) 
    	{
    		return false;
    	}
    	if ((worldIn.getBlockState(pos.down(2)).getMaterial() != Material.GROUND) 
    		&& (worldIn.getBlockState(pos.down(2)).getMaterial() != Material.CLAY)
    		&& (worldIn.getBlockState(pos.down(2)).getMaterial() != Material.GRASS)
    		&& (worldIn.getBlockState(pos.down(2)).getMaterial() != Material.SAND))
    	{
    		return false;
    	}

    	return true;
    	 
    }
}
