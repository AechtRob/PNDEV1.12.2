
package net.lepidodendron.item;

import net.lepidodendron.ElementsLepidodendronMod;
import net.lepidodendron.LepidodendronSorter;
import net.lepidodendron.block.BlockBatHead;
import net.lepidodendron.creativetab.TabLepidodendronMobile;
import net.minecraft.advancements.CriteriaTriggers;
import net.minecraft.block.Block;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.world.World;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.oredict.OreDictionary;

@ElementsLepidodendronMod.ModElement.Tag
public class ItemBatHeadItem extends ElementsLepidodendronMod.ModElement {
	@GameRegistry.ObjectHolder("lepidodendron:bat_head_item")
	public static final Item block = null;
	public ItemBatHeadItem(ElementsLepidodendronMod instance) {
		super(instance, LepidodendronSorter.bat_head);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemCustom());
	}

	@Override
	public void init(FMLInitializationEvent event) {
		super.init(event);
		OreDictionary.registerOre("mobdnaPNminecraft:bat", ItemBatHeadItem.block);
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(block, 0, new ModelResourceLocation("lepidodendron:bat_head_item", "inventory"));
	}
	public static class ItemCustom extends Item {
		public ItemCustom() {
			setMaxDamage(0);
			maxStackSize = 64;
			setTranslationKey("pf_bat_head_item");
			setRegistryName("bat_head_item");
			setCreativeTab(TabLepidodendronMobile.tab);
		}

		@Override
		public EnumActionResult onItemUse(EntityPlayer player, World worldIn, BlockPos pos, EnumHand hand, EnumFacing facing, float hitX, float hitY, float hitZ)
		{
			if (facing == EnumFacing.DOWN)
			{
				return EnumActionResult.FAIL;
			}
			else
			{
				if (worldIn.getBlockState(pos).getBlock().isReplaceable(worldIn, pos))
				{
					facing = EnumFacing.UP;
					pos = pos.down();
				}
				IBlockState iblockstate = worldIn.getBlockState(pos);
				Block block = iblockstate.getBlock();
				boolean flag = block.isReplaceable(worldIn, pos);

				if (!flag)
				{
					if (!worldIn.getBlockState(pos).getMaterial().isSolid() && !worldIn.isSideSolid(pos, facing, true))
					{
						return EnumActionResult.FAIL;
					}

					pos = pos.offset(facing);
				}

				ItemStack itemstack = player.getHeldItem(hand);

				if (player.canPlayerEdit(pos, facing, itemstack) && BlockBatHead.block.canPlaceBlockAt(worldIn, pos))
				{
					if (worldIn.isRemote)
					{
						itemstack.shrink(1);
						return EnumActionResult.SUCCESS;
					}
					else
					{
						worldIn.setBlockState(pos, BlockBatHead.block.getDefaultState().withProperty(BlockBatHead.FACING, facing), 11);
						int i = 0;

						if (facing == EnumFacing.UP)
						{
							i = MathHelper.floor((double)(player.rotationYaw * 16.0F / 360.0F) + 0.5D);
						}

						if (player instanceof EntityPlayerMP)
						{
							CriteriaTriggers.PLACED_BLOCK.trigger((EntityPlayerMP)player, pos, itemstack);
						}

						TileEntity tileentity = worldIn.getTileEntity(pos);

						if (tileentity instanceof BlockBatHead.TileEntityCustom) {
							BlockBatHead.TileEntityCustom bathead = (BlockBatHead.TileEntityCustom) tileentity;
							bathead.getTileData().setInteger("rotation", i);
							worldIn.markBlockRangeForRenderUpdate(pos, pos);
							worldIn.notifyBlockUpdate(pos, BlockBatHead.block.getDefaultState(), BlockBatHead.block.getDefaultState(), 3);
							worldIn.scheduleBlockUpdate(pos, BlockBatHead.block,0,0);
							bathead.markDirty();
						}

						itemstack.shrink(1);
						return EnumActionResult.SUCCESS;
					}
				}
				else
				{
					return EnumActionResult.FAIL;
				}
			}
		}
	}
}
