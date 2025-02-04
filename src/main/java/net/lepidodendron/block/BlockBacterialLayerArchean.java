
package net.lepidodendron.block;

import net.lepidodendron.ElementsLepidodendronMod;
import net.lepidodendron.LepidodendronSorter;
import net.lepidodendron.block.base.IAdvancementGranter;
import net.lepidodendron.creativetab.TabLepidodendronMisc;
import net.lepidodendron.item.armor.ArmorInit;
import net.lepidodendron.util.CustomTrigger;
import net.lepidodendron.util.ModTriggers;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.oredict.OreDictionary;

import javax.annotation.Nullable;

@ElementsLepidodendronMod.ModElement.Tag
public class BlockBacterialLayerArchean extends ElementsLepidodendronMod.ModElement {
	@GameRegistry.ObjectHolder("lepidodendron:bacterial_layer_archean")
	public static final Block block = null;
	public BlockBacterialLayerArchean(ElementsLepidodendronMod instance) {
		super(instance, LepidodendronSorter.bacterial_layer);
	}

	@Override
	public void init(FMLInitializationEvent event) {
		super.init(event);
		OreDictionary.registerOre("pndietMicrobial", BlockBacterialLayerArchean.block);
	}

	@Override
	public void initElements() {
		elements.blocks.add(() -> new BlockCustom().setRegistryName("bacterial_layer_archean"));
		elements.items.add(() -> new ItemBlock(block).setRegistryName(block.getRegistryName()));
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(block), 0,
				new ModelResourceLocation("lepidodendron:bacterial_layer_archean", "inventory"));
	}
	public static class BlockCustom extends Block implements IAdvancementGranter {
		public BlockCustom() {
			super(Material.GROUND, MapColor.SAND);
			setTranslationKey("pf_bacterial_layer_archean");
			setSoundType(SoundType.SLIME);
			setHarvestLevel("shovel", 0);
			setHardness(0.1F);
			setResistance(0.1F);
			setLightLevel(0F);
			setLightOpacity(255);
			setCreativeTab(TabLepidodendronMisc.tab);
			setDefaultSlipperiness(0.98f);
		}

		@Override
		public float getSlipperiness(IBlockState state, IBlockAccess world, BlockPos pos, @Nullable Entity entity) {
			if (entity != null) {
				if (entity instanceof EntityPlayer) {
					EntityPlayer player = (EntityPlayer) entity;
					if (player.getItemStackFromSlot(EntityEquipmentSlot.FEET) != ItemStack.EMPTY) {
						if (player.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() == ArmorInit.RUBBER_BOOTS) {
							return 0.6F;
						}
					}
				}
			}
			return super.getSlipperiness(state, world, pos, entity);
		}

		@Nullable
		@Override
		public CustomTrigger getModTrigger() {
			return ModTriggers.CLICK_MICROBIAL_MAT_ARCHEAN;
		}

	}
}
