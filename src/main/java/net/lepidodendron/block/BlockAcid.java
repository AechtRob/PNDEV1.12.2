
package net.lepidodendron.block;

import net.lepidodendron.ElementsLepidodendronMod;
import net.lepidodendron.LepidodendronConfig;
import net.lepidodendron.LepidodendronSorter;
import net.minecraft.block.Block;
import net.minecraft.block.BlockLiquid;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.renderer.ItemMeshDefinition;
import net.minecraft.client.renderer.block.model.ModelBakery;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.client.renderer.block.statemap.StateMapperBase;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraft.util.DamageSource;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fluids.BlockFluidBase;
import net.minecraftforge.fluids.BlockFluidClassic;
import net.minecraftforge.fluids.Fluid;
import net.minecraftforge.fluids.FluidRegistry;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import javax.annotation.Nonnull;
import java.util.Random;

@ElementsLepidodendronMod.ModElement.Tag
public class BlockAcid extends ElementsLepidodendronMod.ModElement {
	@GameRegistry.ObjectHolder("lepidodendron:sulfuric_acid")
	public static final Block block = null;
	@GameRegistry.ObjectHolder("lepidodendron:sulfuric_acid")
	public static final Item item = null;
	private Fluid fluid;
	public BlockAcid(ElementsLepidodendronMod instance) {
		super(instance, LepidodendronSorter.sulfuric_acid);
		fluid = new Fluid("sulfuric_acid", new ResourceLocation("lepidodendron:blocks/sulfuric_acidstill"), new ResourceLocation("lepidodendron:blocks/sulfuric_acidflow"))
				.setLuminosity(0).setDensity(1000).setViscosity(1000).setGaseous(false).setColor(-2958436);
	}

	public static final DamageSource ACID = new DamageSource("acid");

	@Override
	public void initElements() {
		elements.blocks.add(() -> new BlockFluidClassic(fluid, Material.WATER) {
			@Override
			public void onEntityCollision(World world, BlockPos pos, IBlockState state, Entity entity) {
				super.onEntityCollision(world, pos, state, entity);
				if (entity instanceof EntityLivingBase) {
					EntityLivingBase e = (EntityLivingBase) entity;
					e.attackEntityFrom(ACID, 2F);
				}
			}

			@Override
			public void updateTick(@Nonnull World world, @Nonnull BlockPos pos, @Nonnull IBlockState state, @Nonnull Random rand) {
				super.updateTick(world, pos, state, rand);
				if (LepidodendronConfig.sulphuricAcidGrief) {
					if (world.getBlockState(pos.north()).getBlock() == Blocks.GRASS
							|| world.getBlockState(pos.north()).getBlock() == BlockPrehistoricGroundBasic.block
							|| world.getBlockState(pos.north()).getBlock() == BlockPrehistoricGroundLush.block
							|| world.getBlockState(pos.north()).getBlock() == BlockPrehistoricGroundFern.block
							|| world.getBlockState(pos.north()).getBlock() == BlockPrehistoricGroundMossy.block) {
						world.setBlockState(pos.north(), Blocks.DIRT.getStateFromMeta(0));
					}
					if (world.getBlockState(pos.south()).getBlock() == Blocks.GRASS
							|| world.getBlockState(pos.south()).getBlock() == BlockPrehistoricGroundBasic.block
							|| world.getBlockState(pos.south()).getBlock() == BlockPrehistoricGroundLush.block
							|| world.getBlockState(pos.south()).getBlock() == BlockPrehistoricGroundFern.block
							|| world.getBlockState(pos.south()).getBlock() == BlockPrehistoricGroundMossy.block) {
						world.setBlockState(pos.south(), Blocks.DIRT.getStateFromMeta(0));
					}
					if (world.getBlockState(pos.east()).getBlock() == Blocks.GRASS
							|| world.getBlockState(pos.east()).getBlock() == BlockPrehistoricGroundBasic.block
							|| world.getBlockState(pos.east()).getBlock() == BlockPrehistoricGroundLush.block
							|| world.getBlockState(pos.east()).getBlock() == BlockPrehistoricGroundFern.block
							|| world.getBlockState(pos.east()).getBlock() == BlockPrehistoricGroundMossy.block) {
						world.setBlockState(pos.east(), Blocks.DIRT.getStateFromMeta(0));
					}
					if (world.getBlockState(pos.west()).getBlock() == Blocks.GRASS
							|| world.getBlockState(pos.west()).getBlock() == BlockPrehistoricGroundBasic.block
							|| world.getBlockState(pos.west()).getBlock() == BlockPrehistoricGroundLush.block
							|| world.getBlockState(pos.west()).getBlock() == BlockPrehistoricGroundFern.block
							|| world.getBlockState(pos.west()).getBlock() == BlockPrehistoricGroundMossy.block) {
						world.setBlockState(pos.west(), Blocks.DIRT.getStateFromMeta(0));
					}
					if (world.getBlockState(pos.down()).getBlock() == Blocks.GRASS
							|| world.getBlockState(pos.down()).getBlock() == BlockPrehistoricGroundBasic.block
							|| world.getBlockState(pos.down()).getBlock() == BlockPrehistoricGroundLush.block
							|| world.getBlockState(pos.down()).getBlock() == BlockPrehistoricGroundFern.block
							|| world.getBlockState(pos.down()).getBlock() == BlockPrehistoricGroundMossy.block) {
						world.setBlockState(pos.down(), Blocks.DIRT.getStateFromMeta(0));
					}

					if (world.getBlockState(pos.north()).getBlock() == BlockPrehistoricGroundSand.block) {
						world.setBlockState(pos.north(), Blocks.SAND.getStateFromMeta(0));
					}
					if (world.getBlockState(pos.south()).getBlock() == BlockPrehistoricGroundSand.block) {
						world.setBlockState(pos.south(), Blocks.SAND.getStateFromMeta(0));
					}
					if (world.getBlockState(pos.east()).getBlock() == BlockPrehistoricGroundSand.block) {
						world.setBlockState(pos.east(), Blocks.SAND.getStateFromMeta(0));
					}
					if (world.getBlockState(pos.west()).getBlock() == BlockPrehistoricGroundSand.block) {
						world.setBlockState(pos.west(), Blocks.SAND.getStateFromMeta(0));
					}
					if (world.getBlockState(pos.down()).getBlock() == BlockPrehistoricGroundSand.block) {
						world.setBlockState(pos.down(), Blocks.SAND.getStateFromMeta(0));
					}

					if (world.getBlockState(pos.north()).getBlock() == BlockPrehistoricGroundSandRed.block) {
						world.setBlockState(pos.north(), Blocks.SAND.getStateFromMeta(1));
					}
					if (world.getBlockState(pos.south()).getBlock() == BlockPrehistoricGroundSandRed.block) {
						world.setBlockState(pos.south(), Blocks.SAND.getStateFromMeta(1));
					}
					if (world.getBlockState(pos.east()).getBlock() == BlockPrehistoricGroundSandRed.block) {
						world.setBlockState(pos.east(), Blocks.SAND.getStateFromMeta(1));
					}
					if (world.getBlockState(pos.west()).getBlock() == BlockPrehistoricGroundSandRed.block) {
						world.setBlockState(pos.west(), Blocks.SAND.getStateFromMeta(1));
					}
					if (world.getBlockState(pos.down()).getBlock() == BlockPrehistoricGroundSandRed.block) {
						world.setBlockState(pos.down(), Blocks.SAND.getStateFromMeta(1));
					}

					if (world.getBlockState(pos.north()).getBlock() == BlockPrehistoricGroundSandBlack.block) {
						world.setBlockState(pos.north(), BlockSandBlack.block.getDefaultState());
					}
					if (world.getBlockState(pos.south()).getBlock() == BlockPrehistoricGroundSandBlack.block) {
						world.setBlockState(pos.south(), BlockSandBlack.block.getDefaultState());
					}
					if (world.getBlockState(pos.east()).getBlock() == BlockPrehistoricGroundSandBlack.block) {
						world.setBlockState(pos.east(), BlockSandBlack.block.getDefaultState());
					}
					if (world.getBlockState(pos.west()).getBlock() == BlockPrehistoricGroundSandBlack.block) {
						world.setBlockState(pos.west(), BlockSandBlack.block.getDefaultState());
					}
					if (world.getBlockState(pos.down()).getBlock() == BlockPrehistoricGroundSandBlack.block) {
						world.setBlockState(pos.down(), BlockSandBlack.block.getDefaultState());
					}

					if (world.getBlockState(pos.north()).getBlock() == BlockPrehistoricGroundSandWhite.block) {
						world.setBlockState(pos.north(), BlockSandWhite.block.getDefaultState());
					}
					if (world.getBlockState(pos.south()).getBlock() == BlockPrehistoricGroundSandWhite.block) {
						world.setBlockState(pos.south(), BlockSandWhite.block.getDefaultState());
					}
					if (world.getBlockState(pos.east()).getBlock() == BlockPrehistoricGroundSandWhite.block) {
						world.setBlockState(pos.east(), BlockSandWhite.block.getDefaultState());
					}
					if (world.getBlockState(pos.west()).getBlock() == BlockPrehistoricGroundSandWhite.block) {
						world.setBlockState(pos.west(), BlockSandWhite.block.getDefaultState());
					}
					if (world.getBlockState(pos.down()).getBlock() == BlockPrehistoricGroundSandWhite.block) {
						world.setBlockState(pos.down(), BlockSandWhite.block.getDefaultState());
					}

					if (world.getBlockState(pos.north()).getBlock() == BlockPrehistoricGroundSandPangaean.block) {
						world.setBlockState(pos.north(), BlockSandPangaean.block.getDefaultState());
					}
					if (world.getBlockState(pos.south()).getBlock() == BlockPrehistoricGroundSandPangaean.block) {
						world.setBlockState(pos.south(), BlockSandPangaean.block.getDefaultState());
					}
					if (world.getBlockState(pos.east()).getBlock() == BlockPrehistoricGroundSandPangaean.block) {
						world.setBlockState(pos.east(), BlockSandPangaean.block.getDefaultState());
					}
					if (world.getBlockState(pos.west()).getBlock() == BlockPrehistoricGroundSandPangaean.block) {
						world.setBlockState(pos.west(), BlockSandPangaean.block.getDefaultState());
					}
					if (world.getBlockState(pos.down()).getBlock() == BlockPrehistoricGroundSandPangaean.block) {
						world.setBlockState(pos.down(), BlockSandPangaean.block.getDefaultState());
					}

					//Plants
					if (world.getBlockState(pos.north()).getMaterial() == Material.PLANTS
							//|| world.getBlockState(pos.north()).getMaterial() == Material.WOOD
							|| world.getBlockState(pos.north()).getMaterial() == Material.LEAVES
							|| world.getBlockState(pos.north()).getMaterial() == Material.GOURD
							|| world.getBlockState(pos.north()).getMaterial() == Material.CACTUS
							|| world.getBlockState(pos.north()).getMaterial() == Material.CAKE
							|| world.getBlockState(pos.north()).getMaterial() == Material.CARPET
							|| world.getBlockState(pos.north()).getMaterial() == Material.CLOTH
							|| world.getBlockState(pos.north()).getMaterial() == Material.VINE) {
						world.destroyBlock(pos.north(), true);
					}
					if (world.getBlockState(pos.south()).getMaterial() == Material.PLANTS
							//|| world.getBlockState(pos.south()).getMaterial() == Material.WOOD
							|| world.getBlockState(pos.south()).getMaterial() == Material.LEAVES
							|| world.getBlockState(pos.south()).getMaterial() == Material.GOURD
							|| world.getBlockState(pos.south()).getMaterial() == Material.CACTUS
							|| world.getBlockState(pos.south()).getMaterial() == Material.CAKE
							|| world.getBlockState(pos.south()).getMaterial() == Material.CARPET
							|| world.getBlockState(pos.south()).getMaterial() == Material.CLOTH
							|| world.getBlockState(pos.south()).getMaterial() == Material.VINE) {
						world.destroyBlock(pos.south(), true);
					}
					if (world.getBlockState(pos.east()).getMaterial() == Material.PLANTS
							//|| world.getBlockState(pos.east()).getMaterial() == Material.WOOD
							|| world.getBlockState(pos.east()).getMaterial() == Material.LEAVES
							|| world.getBlockState(pos.east()).getMaterial() == Material.GOURD
							|| world.getBlockState(pos.east()).getMaterial() == Material.CACTUS
							|| world.getBlockState(pos.east()).getMaterial() == Material.CAKE
							|| world.getBlockState(pos.east()).getMaterial() == Material.CARPET
							|| world.getBlockState(pos.east()).getMaterial() == Material.CLOTH
							|| world.getBlockState(pos.east()).getMaterial() == Material.VINE) {
						world.destroyBlock(pos.east(), true);
					}
					if (world.getBlockState(pos.west()).getMaterial() == Material.PLANTS
							//|| world.getBlockState(pos.west()).getMaterial() == Material.WOOD
							|| world.getBlockState(pos.west()).getMaterial() == Material.LEAVES
							|| world.getBlockState(pos.west()).getMaterial() == Material.GOURD
							|| world.getBlockState(pos.west()).getMaterial() == Material.CACTUS
							|| world.getBlockState(pos.west()).getMaterial() == Material.CAKE
							|| world.getBlockState(pos.west()).getMaterial() == Material.CARPET
							|| world.getBlockState(pos.west()).getMaterial() == Material.CLOTH
							|| world.getBlockState(pos.west()).getMaterial() == Material.VINE) {
						world.destroyBlock(pos.west(), true);
					}
					if (world.getBlockState(pos.down()).getMaterial() == Material.PLANTS
							//|| world.getBlockState(pos.down()).getMaterial() == Material.WOOD
							|| world.getBlockState(pos.down()).getMaterial() == Material.LEAVES
							|| world.getBlockState(pos.down()).getMaterial() == Material.GOURD
							|| world.getBlockState(pos.down()).getMaterial() == Material.CACTUS
							|| world.getBlockState(pos.down()).getMaterial() == Material.CAKE
							|| world.getBlockState(pos.down()).getMaterial() == Material.CARPET
							|| world.getBlockState(pos.down()).getMaterial() == Material.CLOTH
							|| world.getBlockState(pos.down()).getMaterial() == Material.VINE) {
						world.destroyBlock(pos.down(), true);
					}
					if (world.getBlockState(pos.up()).getMaterial() == Material.PLANTS) {
						world.destroyBlock(pos.up(), true);
					}

					//"Waterblocks":
					if (world.getBlockState(pos.north()).getMaterial() == Material.WATER
							&& (!(world.getBlockState(pos.north()).getBlock() instanceof BlockFluidBase))
							&& (!(world.getBlockState(pos.north()).getBlock() instanceof BlockLiquid))) {
						world.destroyBlock(pos.north(), true);
					}
					if (world.getBlockState(pos.south()).getMaterial() == Material.WATER
							&& (!(world.getBlockState(pos.south()).getBlock() instanceof BlockFluidBase))
							&& (!(world.getBlockState(pos.south()).getBlock() instanceof BlockLiquid))) {
						world.destroyBlock(pos.south(), true);
					}
					if (world.getBlockState(pos.east()).getMaterial() == Material.WATER
							&& (!(world.getBlockState(pos.east()).getBlock() instanceof BlockFluidBase))
							&& (!(world.getBlockState(pos.east()).getBlock() instanceof BlockLiquid))) {
						world.destroyBlock(pos.east(), true);
					}
					if (world.getBlockState(pos.west()).getMaterial() == Material.WATER
							&& (!(world.getBlockState(pos.west()).getBlock() instanceof BlockFluidBase))
							&& (!(world.getBlockState(pos.west()).getBlock() instanceof BlockLiquid))) {
						world.destroyBlock(pos.west(), true);
					}
					if (world.getBlockState(pos.down()).getMaterial() == Material.WATER
							&& (!(world.getBlockState(pos.down()).getBlock() instanceof BlockFluidBase))
							&& (!(world.getBlockState(pos.down()).getBlock() instanceof BlockLiquid))) {
						world.destroyBlock(pos.down(), true);
					}

				}
			}
		}.setTranslationKey("pf_sulfuric_acid").setRegistryName("sulfuric_acid"));
		elements.items.add(() -> new ItemBlock(block).setRegistryName("sulfuric_acid"));
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
				return new ModelResourceLocation("lepidodendron:sulfuric_acid", "sulfuric_acid");
			}
		});
		ModelLoader.setCustomStateMapper(block, new StateMapperBase() {
			@Override
			protected ModelResourceLocation getModelResourceLocation(IBlockState state) {
				return new ModelResourceLocation("lepidodendron:sulfuric_acid", "sulfuric_acid");
			}
		});
	}
}
