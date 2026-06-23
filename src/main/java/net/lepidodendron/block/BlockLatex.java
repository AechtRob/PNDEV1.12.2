
package net.lepidodendron.block;

import net.lepidodendron.ElementsLepidodendronMod;
import net.lepidodendron.LepidodendronSorter;
import net.lepidodendron.util.MaterialLatex;
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
public class BlockLatex extends ElementsLepidodendronMod.ModElement {
	@GameRegistry.ObjectHolder("lepidodendron:latex")
	public static final Block block = null;
	@GameRegistry.ObjectHolder("lepidodendron:latex")
	public static final Item item = null;
	private Fluid fluid;
	public BlockLatex(ElementsLepidodendronMod instance) {
		super(instance, LepidodendronSorter.latex);
		fluid = new Fluid("pn_latex", new ResourceLocation("lepidodendron:blocks/latexstill"), new ResourceLocation("lepidodendron:blocks/latexflow"))
				.setLuminosity(0).setDensity(1000).setViscosity(5000).setGaseous(false);
	}

	@Override
	public void initElements() {
		elements.blocks.add(() -> new BlockFluidClassic(fluid, MaterialLatex.LATEX) {
			@Override
			public void onEntityCollision(World world, BlockPos pos, IBlockState state, Entity entity) {
				super.onEntityCollision(world, pos, state, entity);
				if ((double) entity.posY < ((double) pos.getY() + 0.59)) {
					entity.setInWeb();
				}
			}
		}.setTranslationKey("pf_latex").setRegistryName("latex"));
		elements.items.add(() -> new ItemBlock(block).setRegistryName("latex"));
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
				return new ModelResourceLocation("lepidodendron:latex", "latex");
			}
		});
		ModelLoader.setCustomStateMapper(block, new StateMapperBase() {
			@Override
			protected ModelResourceLocation getModelResourceLocation(IBlockState state) {
				return new ModelResourceLocation("lepidodendron:latex", "latex");
			}
		});
	}
}
