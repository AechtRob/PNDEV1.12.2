
package net.lepidodendron.block;

import net.lepidodendron.ElementsLepidodendronMod;
import net.lepidodendron.LepidodendronSorter;
import net.lepidodendron.creativetab.TabLepidodendronMisc;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.properties.PropertyInteger;
import net.minecraft.block.state.BlockFaceShape;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.client.renderer.block.statemap.StateMap;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;

@ElementsLepidodendronMod.ModElement.Tag
public class BlockPuddleTest extends ElementsLepidodendronMod.ModElement {
	@GameRegistry.ObjectHolder("lepidodendron:puddle")
	public static final Block block = null;
	public BlockPuddleTest(ElementsLepidodendronMod instance) {
		super(instance, LepidodendronSorter.coral_bamboo);
	}

	@Override
	public void initElements() {
		elements.blocks.add(() -> new BlockCustom().setRegistryName("puddle"));
		elements.items.add(() -> new ItemBlock(block).setRegistryName(block.getRegistryName()));
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(block), 0,
				new ModelResourceLocation("lepidodendron:puddle", "inventory"));
		ModelLoader.setCustomStateMapper(block, (new StateMap.Builder()).ignore(BlockPuddleTest.BlockCustom.LEVEL).build());
	}

	@Override
	public void init(FMLInitializationEvent event) {
		super.init(event);
//		OreDictionary.registerOre("staticdnaPNlepidodendron:coral_bamboo", BlockPuddleTest.block);
//		OreDictionary.registerOre("coral", BlockPuddleTest.block);
//		OreDictionary.registerOre("pndietCoral", BlockPuddleTest.block);
	}

	public static class BlockCustom extends Block {

		public static final PropertyInteger LEVEL = PropertyInteger.create("level", 0, 15);

		public BlockCustom() {
			super(Material.WATER);
			setTranslationKey("pf_puddle");
			setSoundType(SoundType.SLIME);
			setHardness(2.2F);
			setResistance(2.2F);
			setLightLevel(0F);
			setLightOpacity(255);
			setCreativeTab(TabLepidodendronMisc.tab);
			this.setDefaultState(this.blockState.getBaseState().withProperty(LEVEL, 0));
		}

		@Override
		public boolean isPassable(@Nonnull IBlockAccess world, @Nonnull BlockPos pos)
		{
			return false;
		}

	    @Nullable
	    public AxisAlignedBB getCollisionBoundingBox(IBlockState blockState, IBlockAccess worldIn, BlockPos pos)
	    {
	        return FULL_BLOCK_AABB;
	    }

		@Override
		public boolean isOpaqueCube(IBlockState state) {
			return true;
		}
		
		@Override
		public boolean isFullCube(IBlockState state)
	    {
	        return true;
	    }

		@Override
		protected net.minecraft.block.state.BlockStateContainer createBlockState() {
			return new net.minecraft.block.state.BlockStateContainer(this, new IProperty[]{LEVEL});
		}

		@Override
		public IBlockState getStateFromMeta(int meta) {
			return this.getDefaultState();
		}

		@Override
		public int getMetaFromState(IBlockState state) {
			return 0;
		}
	
		@Override
	    public BlockFaceShape getBlockFaceShape(IBlockAccess worldIn, IBlockState state, BlockPos pos, EnumFacing face)
	    {
	        return BlockFaceShape.SOLID;
	    }

	}
}
