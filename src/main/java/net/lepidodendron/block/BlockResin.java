
package net.lepidodendron.block;

import net.lepidodendron.ElementsLepidodendronMod;
import net.lepidodendron.LepidodendronSorter;
import net.lepidodendron.util.MaterialResin;
import net.minecraft.block.Block;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.renderer.ItemMeshDefinition;
import net.minecraft.client.renderer.block.model.ModelBakery;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.client.renderer.block.statemap.StateMapperBase;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.init.MobEffects;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraft.util.DamageSource;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
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
public class BlockResin extends ElementsLepidodendronMod.ModElement {
	@GameRegistry.ObjectHolder("lepidodendron:resin")
	public static final Block block = null;
	@GameRegistry.ObjectHolder("lepidodendron:resin")
	public static final Item item = null;
	private Fluid fluid;
	public BlockResin(ElementsLepidodendronMod instance) {
		super(instance, LepidodendronSorter.resin);
		fluid = new Fluid("pn_resin", new ResourceLocation("lepidodendron:blocks/resinstill"), new ResourceLocation("lepidodendron:blocks/resinflow"))
				.setLuminosity(0).setDensity(1000).setViscosity(10000).setGaseous(false);
	}

	@Override
	public void initElements() {
		elements.blocks.add(() -> new BlockFluidClassic(fluid, MaterialResin.RESIN) {

			@Override
			public boolean isFlammable(IBlockAccess world, BlockPos pos, EnumFacing face) {
				return true;
			}

			@Override
			public int getFlammability(IBlockAccess world, BlockPos pos, EnumFacing face) {
				return 300; // higher = burns more easily
			}

			@Override
			public int getFireSpreadSpeed(IBlockAccess world, BlockPos pos, EnumFacing face) {
				return 100; // higher = fire spreads faster
			}

			@Override
			public void onEntityCollision(World world, BlockPos pos, IBlockState state, Entity entity) {
				super.onEntityCollision(world, pos, state, entity);
				if ((double) entity.posY < ((double) pos.getY() + 0.59)) {
					entity.setInWeb();
				}
				if (world.isRemote) return;
				if (!(entity instanceof EntityLivingBase)) return;

				EntityLivingBase living = (EntityLivingBase) entity;

				BlockPos eyePos = new BlockPos(
						living.posX,
						living.posY + living.getEyeHeight(),
						living.posZ
				);

				if (world.getBlockState(eyePos).getBlock() != this) {
					return; // head is not submerged
				}

				if (living.isPotionActive(MobEffects.WATER_BREATHING)) return;
				living.setAir(living.getAir() - 500);

				if (living.getAir() <= -20) {
					living.setAir(0);
					living.attackEntityFrom(DamageSource.DROWN, 2.0F);
				}
			}
		}.setTranslationKey("pf_resin").setRegistryName("resin"));
		elements.items.add(() -> new ItemBlock(block).setRegistryName("resin"));
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
				return new ModelResourceLocation("lepidodendron:resin", "resin");
			}
		});
		ModelLoader.setCustomStateMapper(block, new StateMapperBase() {
			@Override
			protected ModelResourceLocation getModelResourceLocation(IBlockState state) {
				return new ModelResourceLocation("lepidodendron:resin", "resin");
			}
		});
	}
}
