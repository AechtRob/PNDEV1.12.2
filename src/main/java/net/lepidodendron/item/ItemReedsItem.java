
package net.lepidodendron.item;

import net.lepidodendron.ElementsLepidodendronMod;
import net.lepidodendron.LepidodendronConfig;
import net.lepidodendron.LepidodendronSorter;
import net.lepidodendron.block.BlockReedsLand;
import net.lepidodendron.block.BlockReedsWater;
import net.lepidodendron.block.base.IPottable;
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
public class ItemReedsItem extends ElementsLepidodendronMod.ModElement {
	@GameRegistry.ObjectHolder("lepidodendron:reeds_item")
	public static final Item block = null;
	public ItemReedsItem(ElementsLepidodendronMod instance) {
		super(instance, LepidodendronSorter.reeds);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemCustom());
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(block, 0, new ModelResourceLocation("lepidodendron:reeds_item", "inventory"));
	}

	@Override
	public void init(FMLInitializationEvent event) {
		super.init(event);
		OreDictionary.registerOre("plantdnaPNlepidodendron:reeds_item", ItemReedsItem.block);
		OreDictionary.registerOre("plantPrehistoric", ItemReedsItem.block);
		OreDictionary.registerOre("plant", ItemReedsItem.block);
	}

	public static class ItemCustom extends Item implements IPottable {
		public ItemCustom() {
			setTranslationKey("pf_reeds_item");
			setRegistryName("reeds_item");
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
					if (BlockReedsLand.BlockCustom.canSurviveAt(worldIn, blockpos1) && (iblockstate1.getMaterial().isReplaceable())) {
						worldIn.setBlockState(blockpos1, BlockReedsLand.block.getDefaultState(), 3);
						if (!playerIn.capabilities.isCreativeMode)
		                    {
		                        itemstack.shrink(1);
		                    }
	                    playerIn.addStat(StatList.getObjectUseStats(this));
	                    worldIn.playSound(playerIn, blockpos, SoundEvents.BLOCK_WATERLILY_PLACE, SoundCategory.BLOCKS, 1.0F, 1.0F);
	                    return new ActionResult<ItemStack>(EnumActionResult.SUCCESS, itemstack);
					}
					else {
		                if (canSurviveAt(worldIn, blockpos1) && (iblockstate.getMaterial() == Material.WATER && ((Integer)iblockstate.getValue(BlockLiquid.LEVEL)).intValue() == 0 && worldIn.isAirBlock(blockpos1)))
		                {
		                    // special case for handling block placement with water lilies
		                    net.minecraftforge.common.util.BlockSnapshot blocksnapshot = net.minecraftforge.common.util.BlockSnapshot.getBlockSnapshot(worldIn, blockpos1);
		                    worldIn.setBlockState(blockpos1, BlockReedsWater.block.getDefaultState());
		                    if (net.minecraftforge.event.ForgeEventFactory.onPlayerBlockPlace(playerIn, blocksnapshot, net.minecraft.util.EnumFacing.UP, handIn).isCanceled())
		                    {
		                        blocksnapshot.restore(true, false);
		                        return new ActionResult<ItemStack>(EnumActionResult.FAIL, itemstack);
		                    }
		
		                    worldIn.setBlockState(blockpos1, BlockReedsWater.block.getDefaultState(), 11);
		
		                    if (playerIn instanceof EntityPlayerMP)
		                    {
		                        CriteriaTriggers.PLACED_BLOCK.trigger((EntityPlayerMP)playerIn, blockpos1, itemstack);
		                    }
		
		                    if (!playerIn.capabilities.isCreativeMode)
		                    {
		                        itemstack.shrink(1);
		                    }
		
		                    playerIn.addStat(StatList.getObjectUseStats(this));
		                    worldIn.playSound(playerIn, blockpos, SoundEvents.BLOCK_WATERLILY_PLACE, SoundCategory.BLOCKS, 1.0F, 1.0F);
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
				tooltip.add("Type: Flowering water/land plant");
				tooltip.add("Periods: Late Cretaceous - Paleogene - Neogene - Pleistocene [ - present]");
				tooltip.add("Note: Placed either next to water or at water surface of one-block deep water, over grass, dirt, clay or sand; spreads if there is light.");
				tooltip.add("Propagation: Flowers");}
	        super.addInformation(stack, player, tooltip, advanced);
	    }

		@Override
		public IBlockState getPotState() {
			return BlockReedsLand.block.getDefaultState();
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

    	if (!worldIn.canSeeSky(pos) && (worldIn.getBlockState(pos).getLightValue() < 7))
    	{
    		return false;
    	}

    	return true;
    	 
    }
}
