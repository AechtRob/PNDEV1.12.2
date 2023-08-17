
package net.lepidodendron.block;

import net.lepidodendron.ElementsLepidodendronMod;
import net.lepidodendron.LepidodendronSorter;
import net.lepidodendron.creativetab.TabLepidodendronBuilding;
import net.minecraft.block.Block;
import net.minecraft.block.BlockFenceGate;
import net.minecraft.block.BlockPlanks;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.util.BlockRenderLayer;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.oredict.OreDictionary;

@ElementsLepidodendronMod.ModElement.Tag
public class BlockWireMeshFenceGate extends ElementsLepidodendronMod.ModElement {
	@GameRegistry.ObjectHolder("lepidodendron:wire_mesh_fence_gate")
	public static final Block block = null;
	public BlockWireMeshFenceGate(ElementsLepidodendronMod instance) {
		super(instance, LepidodendronSorter.wire_mesh_fence);
	}

	@Override
	public void initElements() {
		elements.blocks.add(() -> new BlockCustom().setRegistryName("wire_mesh_fence_gate"));
		elements.items.add(() -> new ItemBlock(block).setRegistryName(block.getRegistryName()));
	}

	@Override
	public void init(FMLInitializationEvent event) {
		super.init(event);
		OreDictionary.registerOre("fenceGateWood", BlockWireMeshFenceGate.block);
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(block), 0,
				new ModelResourceLocation("lepidodendron:wire_mesh_fence_gate", "inventory"));
	}

	public static class BlockCustom extends BlockFenceGate {
		public BlockCustom() {
			super(BlockPlanks.EnumType.OAK);
			setSoundType(SoundType.METAL);
			setHarvestLevel("axe", 1);
			setHardness(5.0F);
			setResistance(10.0F);
			setLightLevel(0F);
			setLightOpacity(0);
			setCreativeTab(TabLepidodendronBuilding.tab);
			setTranslationKey("pf_wire_mesh_fence_gate");
		}

		@SideOnly(Side.CLIENT)
		@Override
		public BlockRenderLayer getRenderLayer()
		{
			return BlockRenderLayer.CUTOUT;
		}

		@Override
		public boolean canRenderInLayer(IBlockState state, BlockRenderLayer layer) {
			return layer == BlockRenderLayer.CUTOUT_MIPPED;
		}

		@Override
		public Material getMaterial(IBlockState state) {
			return Material.IRON;
		}

		@Override
		public MapColor getMapColor(IBlockState state, IBlockAccess worldIn, BlockPos pos) {
			return MapColor.SILVER;
		}

		public boolean onBlockActivated(World worldIn, BlockPos pos, IBlockState state, EntityPlayer playerIn, EnumHand hand, EnumFacing facing, float hitX, float hitY, float hitZ)
		{
			if (((Boolean)state.getValue(OPEN)).booleanValue())
			{
				state = state.withProperty(OPEN, Boolean.valueOf(false));
				worldIn.setBlockState(pos, state, 10);
			}
			else
			{
				EnumFacing enumfacing = EnumFacing.fromAngle((double)playerIn.rotationYaw);

				if (state.getValue(FACING) == enumfacing.getOpposite())
				{
					state = state.withProperty(FACING, enumfacing);
				}

				state = state.withProperty(OPEN, Boolean.valueOf(true));
				worldIn.setBlockState(pos, state, 10);
			}

			worldIn.playEvent(playerIn, ((Boolean)state.getValue(OPEN)).booleanValue() ? 1005 : 1011, pos, 0);
			return true;
		}

	}

}
