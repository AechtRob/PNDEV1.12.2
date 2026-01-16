
package net.lepidodendron.block;

import net.lepidodendron.ElementsLepidodendronMod;
import net.lepidodendron.LepidodendronSorter;
import net.lepidodendron.item.ItemBeaupreaDoorItem;
import net.minecraft.block.Block;
import net.minecraft.block.BlockDoor;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.renderer.block.statemap.StateMap;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.util.text.translation.I18n;
import net.minecraft.world.World;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import java.util.Random;

@ElementsLepidodendronMod.ModElement.Tag
public class BlockBeaupreaDoor extends ElementsLepidodendronMod.ModElement {
	@GameRegistry.ObjectHolder("lepidodendron:beauprea_door")
	public static final Block block = null;
	public BlockBeaupreaDoor(ElementsLepidodendronMod instance) {
		super(instance, LepidodendronSorter.beauprea_door);
	}

	@Override
	public void initElements() {
		elements.blocks.add(() -> new BlockCustom().setRegistryName("beauprea_door"));
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
			super(Material.WOOD);
			setTranslationKey("pf_beauprea_door");
			setSoundType(SoundType.WOOD);
			setHarvestLevel("axe", 1);
			setHardness(3F);
			setResistance(3F);
			setLightLevel(0F);
			setLightOpacity(0);
			setCreativeTab(null);
		}

		@Override
		public boolean isOpaqueCube(IBlockState state) {
			return false;
		}

		@Override
		public ItemStack getItem(World worldIn, BlockPos pos, IBlockState state)
	    {
	        return new ItemStack(ItemBeaupreaDoorItem.block, (int) (1));
	    }

		@Override
	    public ItemStack getPickBlock(IBlockState state, RayTraceResult target, World world, BlockPos pos, EntityPlayer player)
	    {
	        return new ItemStack(ItemBeaupreaDoorItem.block, (int) (1));
	    }

		@Override
	    public String getTranslationKey()
	    {
	        return "tile.beauprea_door.name";
	    }

		@Override
	    public String getLocalizedName()
   	 	{
        	return I18n.translateToLocal("item.beauprea_door_item.name");
    	}
    	
		@Override
		public Item getItemDropped(IBlockState state, Random rand, int fortune)
	    {
	        return state.getValue(HALF) == EnumDoorHalf.UPPER ? Items.AIR : (new ItemStack(ItemBeaupreaDoorItem.block, (int) (1))).getItem();
	    }

	}
}
