
package net.lepidodendron.block;

import net.lepidodendron.ElementsLepidodendronMod;
import net.lepidodendron.LepidodendronSorter;
import net.lepidodendron.creativetab.TabLepidodendronMisc;
import net.minecraft.block.Block;
import net.minecraft.block.BlockDeadBush;
import net.minecraft.block.SoundType;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraft.stats.StatList;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import javax.annotation.Nullable;

@ElementsLepidodendronMod.ModElement.Tag
public class BlockDeadPlant extends ElementsLepidodendronMod.ModElement {
	@GameRegistry.ObjectHolder("lepidodendron:dead_plant")
	public static final Block block = null;

	public BlockDeadPlant(ElementsLepidodendronMod instance) {
		super(instance, LepidodendronSorter.dead_plant);
	}

	@Override
	public void initElements() {
		elements.blocks.add(() -> new BlockCustom().setRegistryName("dead_plant"));
		elements.items.add(() -> new ItemBlock(block).setRegistryName(block.getRegistryName()));
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(block), 0,
				new ModelResourceLocation("lepidodendron:dead_plant", "inventory"));
	}

	public static class BlockCustom extends BlockDeadBush {
		public BlockCustom() {
			setSoundType(SoundType.PLANT);
			setTranslationKey("pf_dead_plant");
			setCreativeTab(TabLepidodendronMisc.tab);
		}

		public void harvestBlock(World worldIn, EntityPlayer player, BlockPos pos, IBlockState state, @Nullable TileEntity te, ItemStack stack) {
			if (!worldIn.isRemote && stack.getItem() == Items.SHEARS) {
				player.addStat(StatList.getBlockStats(this));
				spawnAsEntity(worldIn, pos, new ItemStack(this, 1, 0));
			} else {
				super.harvestBlock(worldIn, player, pos, state, te, stack);
			}
		}

		@Override
		public boolean isShearable(ItemStack item, net.minecraft.world.IBlockAccess world, BlockPos pos) {
			return true;
		}

		@Override
		public java.util.List<ItemStack> onSheared(ItemStack item, net.minecraft.world.IBlockAccess world, BlockPos pos, int fortune) {
			return java.util.Arrays.asList(new ItemStack(this));
		}

		@Override
		public net.minecraftforge.common.EnumPlantType getPlantType(net.minecraft.world.IBlockAccess world, BlockPos pos)
		{
			return net.minecraftforge.common.EnumPlantType.Desert;
		}

	}
}
