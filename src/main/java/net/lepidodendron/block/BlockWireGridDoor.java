
package net.lepidodendron.block;

import net.lepidodendron.ElementsLepidodendronMod;
import net.lepidodendron.LepidodendronSorter;
import net.lepidodendron.item.ItemWireGridDoorItem;
import net.minecraft.block.Block;
import net.minecraft.block.BlockDoor;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.renderer.block.statemap.StateMap;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.util.text.translation.I18n;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import java.util.Random;

@ElementsLepidodendronMod.ModElement.Tag
public class BlockWireGridDoor extends ElementsLepidodendronMod.ModElement {
	@GameRegistry.ObjectHolder("lepidodendron:wire_grid_door")
	public static final Block block = null;
	public BlockWireGridDoor(ElementsLepidodendronMod instance) {
		super(instance, LepidodendronSorter.wire_grid_door);
	}

	@Override
	public void initElements() {
		elements.blocks.add(() -> new BlockCustom().setRegistryName("wire_grid_door"));
		//elements.items.add(() -> new ItemBlock(block).setRegistryName(block.getRegistryName()));
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		//ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(block), 0,
		//		new ModelResourceLocation("lepidodendron:lepidodendron_door", "inventory"));
		ModelLoader.setCustomStateMapper(block, (new StateMap.Builder()).ignore(BlockCustom.POWERED).build());
	}
	
	public static class BlockCustom extends BlockDoor {
		public BlockCustom() {
			super(Material.IRON);
			setTranslationKey("pf_wire_grid_door");
			setSoundType(SoundType.METAL);
			setHarvestLevel("axe", 1);
			setHardness(5.0F);
			setResistance(10.0F);
			setLightLevel(0F);
			setLightOpacity(0);
			setCreativeTab(null);
		}

		@Override
		public MapColor getMapColor(IBlockState state, IBlockAccess worldIn, BlockPos pos) {
			return MapColor.SILVER;
		}

		@Override
		public boolean onBlockActivated(World worldIn, BlockPos pos, IBlockState state, EntityPlayer playerIn, EnumHand hand, EnumFacing facing, float hitX, float hitY, float hitZ)
		{
			BlockPos blockpos = state.getValue(HALF) == EnumDoorHalf.LOWER ? pos : pos.down();
			IBlockState iblockstate = pos.equals(blockpos) ? state : worldIn.getBlockState(blockpos);

			if (iblockstate.getBlock() != this)
			{
				return false;
			}
			else
			{
				state = iblockstate.cycleProperty(OPEN);
				worldIn.setBlockState(blockpos, state, 10);
				worldIn.markBlockRangeForRenderUpdate(blockpos, pos);
				worldIn.playEvent(playerIn, ((Boolean)state.getValue(OPEN)).booleanValue() ? this.getOpenSound() : this.getCloseSound(), pos, 0);
				return true;
			}
		}

		private int getCloseSound()
		{
			return this.material == Material.IRON ? 1011 : 1012;
		}

		private int getOpenSound()
		{
			return this.material == Material.IRON ? 1005 : 1006;
		}

		@Override
		public boolean isOpaqueCube(IBlockState state) {
			return false;
		}

		@Override
		public ItemStack getItem(World worldIn, BlockPos pos, IBlockState state)
	    {
	        return new ItemStack(ItemWireGridDoorItem.block, (int) (1));
	    }

		@Override
	    public ItemStack getPickBlock(IBlockState state, RayTraceResult target, World world, BlockPos pos, EntityPlayer player)
	    {
	        return new ItemStack(ItemWireGridDoorItem.block, (int) (1));
	    }

		@Override
	    public String getTranslationKey()
	    {
	        return "tile.wire_grid_door.name";
	    }

		@Override
	    public String getLocalizedName()
   	 	{
        	return I18n.translateToLocal("item.wire_grid_door_item.name");
    	}
    	
		@Override
		public Item getItemDropped(IBlockState state, Random rand, int fortune)
	    {
	        return state.getValue(HALF) == EnumDoorHalf.UPPER ? Items.AIR : (new ItemStack(ItemWireGridDoorItem.block, (int) (1))).getItem();
	    }

	}
}
