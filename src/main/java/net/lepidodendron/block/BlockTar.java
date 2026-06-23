
package net.lepidodendron.block;

import net.lepidodendron.ElementsLepidodendronMod;
import net.lepidodendron.LepidodendronSorter;
import net.lepidodendron.util.MaterialTar;
import net.minecraft.block.Block;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.renderer.ItemMeshDefinition;
import net.minecraft.client.renderer.block.model.ModelBakery;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.client.renderer.block.statemap.StateMapperBase;
import net.minecraft.entity.Entity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fluids.BlockFluidClassic;
import net.minecraftforge.fluids.Fluid;
import net.minecraftforge.fluids.FluidRegistry;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@ElementsLepidodendronMod.ModElement.Tag
public class BlockTar extends ElementsLepidodendronMod.ModElement {
	@GameRegistry.ObjectHolder("lepidodendron:tar")
	public static final Block block = null;
	@GameRegistry.ObjectHolder("lepidodendron:tar")
	public static final Item item = null;
	private Fluid fluid;
	public BlockTar(ElementsLepidodendronMod instance) {
		super(instance, LepidodendronSorter.resin);
		fluid = new Fluid("pn_tar", new ResourceLocation("lepidodendron:blocks/tarstill"), new ResourceLocation("lepidodendron:blocks/tarflow"))
				.setLuminosity(0).setDensity(1000).setViscosity(10000).setGaseous(false);
	}

	@Override
	public void initElements() {
		elements.blocks.add(() -> new BlockFluidClassic(fluid, MaterialTar.TAR) {
			@Override
			public void onEntityCollision(World world, BlockPos pos, IBlockState state, Entity entity) {
				super.onEntityCollision(world, pos, state, entity);
				if ((double) entity.posY < ((double) pos.getY() + 0.59)) {
					entity.setInWeb();
				}
			}
		}.setTranslationKey("pf_tar").setRegistryName("tar"));
		elements.items.add(() -> new ItemBlock(block).setRegistryName("tar"));
	}

	@Override
	public void preInit(FMLPreInitializationEvent event) {
		FluidRegistry.registerFluid(fluid);
		FluidRegistry.addBucketForFluid(fluid);
	}

	@Override
	@SideOnly(Side.CLIENT)
	public void registerModels(ModelRegistryEvent event) {
		ModelBakery.registerItemVariants(item);
		ModelLoader.setCustomMeshDefinition(item, new ItemMeshDefinition() {
			@Override
			public ModelResourceLocation getModelLocation(ItemStack stack) {
				return new ModelResourceLocation("lepidodendron:tar", "tar");
			}
		});
		ModelLoader.setCustomStateMapper(block, new StateMapperBase() {
			@Override
			protected ModelResourceLocation getModelResourceLocation(IBlockState state) {
				return new ModelResourceLocation("lepidodendron:tar", "tar");
			}
		});
	}
}
