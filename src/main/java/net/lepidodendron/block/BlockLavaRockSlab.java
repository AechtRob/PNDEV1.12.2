
package net.lepidodendron.block;

import net.lepidodendron.ElementsLepidodendronMod;
import net.lepidodendron.LepidodendronSorter;
import net.lepidodendron.creativetab.TabLepidodendronMisc;
import net.minecraft.block.Block;
import net.minecraft.block.BlockSlab;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.properties.PropertyEnum;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.ItemSlab;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.IStringSerializable;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import java.util.Random;

@ElementsLepidodendronMod.ModElement.Tag
public class BlockLavaRockSlab extends ElementsLepidodendronMod.ModElement {
	@GameRegistry.ObjectHolder("lepidodendron:lava_rock_slab")
	public static final Block block = null;
	@GameRegistry.ObjectHolder("lepidodendron:lava_rock_slab_double")
	public static final Block block_slab_double = null;
	public BlockLavaRockSlab(ElementsLepidodendronMod instance) {
		super(instance, LepidodendronSorter.lava_rock_slab);
	}

	@Override
	public void initElements() {
		elements.blocks.add(() -> new BlockCustom().setRegistryName("lava_rock_slab"));
		elements.blocks.add(() -> new BlockCustom.Double().setRegistryName("lava_rock_slab_double"));
		elements.items.add(() -> new ItemSlab(block, (BlockSlab) block, (BlockSlab) block_slab_double).setRegistryName(block.getRegistryName()));
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(block), 0,
				new ModelResourceLocation("lepidodendron:lava_rock_slab", "inventory"));
	}
	public static class BlockCustom extends BlockSlab {
		public BlockCustom() {
			super(Material.ROCK, MapColor.BLACK);
			setTranslationKey("pf_lava_rock_slab");
			setSoundType(SoundType.STONE);
			setHarvestLevel("pickaxe", 1);
			setHardness(1.25F);
			setResistance(4.2F);
			setLightLevel(0F);
			setLightOpacity(255);
			setCreativeTab(TabLepidodendronMisc.tab);
			IBlockState state = this.blockState.getBaseState().withProperty(VARIANT, Variant.DEFAULT);
			if (!this.isDouble())
				state = state.withProperty(BlockSlab.HALF, EnumBlockHalf.BOTTOM);
			if (!this.isDouble())
				setLightOpacity(0);
			this.setDefaultState(state);
			this.useNeighborBrightness = !this.isDouble();
		}

		@Override
		public String getTranslationKey(int meta) {
			return this.getTranslationKey();
		}

		public static final PropertyEnum<Variant> VARIANT = PropertyEnum.<Variant>create("variant",
				Variant.class);
		@Override
		public Item getItemDropped(IBlockState state, Random rand, int fortune) {
			return Item.getItemFromBlock(block);
		}

		@Override
		public ItemStack getItem(World worldIn, BlockPos pos, IBlockState state) {
			return new ItemStack(block);
		}

		@Override
		protected net.minecraft.block.state.BlockStateContainer createBlockState() {
			return this.isDouble()
					? new net.minecraft.block.state.BlockStateContainer(this, new IProperty[]{VARIANT})
					: new net.minecraft.block.state.BlockStateContainer(this, new IProperty[]{HALF, VARIANT});
		}

		@Override
		public IBlockState getStateFromMeta(int meta) {
			if (this.isDouble()) {
				return this.getDefaultState();
			} else {
				return this.getDefaultState().withProperty(HALF, EnumBlockHalf.values()[meta % 2]);
			}
		}

		@Override
		public int getMetaFromState(IBlockState state) {
			if (this.isDouble()) {
				return 0;
			} else {
				return state.getValue(HALF).ordinal();
			}
		}

		@Override
		public IProperty<?> getVariantProperty() {
			return VARIANT;
		}

		@Override
		public Comparable<?> getTypeForItem(ItemStack stack) {
			return Variant.DEFAULT;
		}

		@Override
		public boolean isDouble() {
			return false;
		}

		@Override
		public boolean doesSideBlockRendering(IBlockState state, IBlockAccess world, BlockPos pos, EnumFacing face) {
			if (isDouble())
				return true;
			return super.doesSideBlockRendering(state, world, pos, face);
		}
		public enum Variant implements IStringSerializable {
			DEFAULT;
			public String getName() {
				return "default";
			}
		}

		public static class Double extends BlockCustom {
			@Override
			public boolean isDouble() {
				return true;
			}
		}
		//@Override
		//public int tickRate(World world) {
		//	return 0;
		//}

		@Override
		public boolean isOpaqueCube(IBlockState state) {
			return false;
		}

		@Override
		public MapColor getMapColor(IBlockState state, IBlockAccess blockAccess, BlockPos pos) {
			return MapColor.STONE;
		}
	}
}
