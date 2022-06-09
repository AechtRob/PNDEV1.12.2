
package net.lepidodendron.block;

import net.lepidodendron.ElementsLepidodendronMod;
import net.lepidodendron.LepidodendronSorter;
import net.lepidodendron.creativetab.TabLepidodendronMisc;
import net.minecraft.block.Block;
import net.minecraft.block.BlockStairs;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.init.SoundEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.util.DamageSource;
import net.minecraft.util.EnumParticleTypes;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraft.world.WorldServer;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import java.util.Random;

@ElementsLepidodendronMod.ModElement.Tag
public class BlockLavaCobbleMoltenStairs extends ElementsLepidodendronMod.ModElement {
	@GameRegistry.ObjectHolder("lepidodendron:lava_cobble_molten_stairs")
	public static final Block block = null;
	public BlockLavaCobbleMoltenStairs(ElementsLepidodendronMod instance) {
		super(instance, LepidodendronSorter.lava_cobble_molten_stairs);
	}

	@Override
	public void initElements() {
		elements.blocks.add(() -> new BlockCustom().setRegistryName("lava_cobble_molten_stairs"));
		elements.items.add(() -> new ItemBlock(block).setRegistryName(block.getRegistryName()));
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(block), 0,
				new ModelResourceLocation("lepidodendron:lava_cobble_molten_stairs", "inventory"));
	}
	public static class BlockCustom extends BlockStairs {
		public BlockCustom() {
			super(new Block(Material.ROCK, MapColor.BLACK).getDefaultState());
			setTranslationKey("pf_lava_cobble_molten_stairs");
			this.setSoundType(SoundType.STONE);
			setHardness(1.25F);
			setResistance(4.2F);
			this.setLightLevel(0.1F);
			setHarvestLevel("pickaxe", 0);
			setCreativeTab(TabLepidodendronMisc.tab);
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
		public void onEntityWalk(World worldIn, BlockPos pos, Entity entityIn) {
			if (!entityIn.isImmuneToFire() && entityIn instanceof EntityLivingBase && !EnchantmentHelper.hasFrostWalkerEnchantment((EntityLivingBase) entityIn)) {
				entityIn.attackEntityFrom(DamageSource.HOT_FLOOR, 1.0F);
			}

			super.onEntityWalk(worldIn, pos, entityIn);
		}

		@Override
		public void updateTick(World worldIn, BlockPos pos, IBlockState state, Random rand) {
			BlockPos blockpos = pos.up();
			IBlockState iblockstate = worldIn.getBlockState(blockpos);

			if (iblockstate.getBlock() == Blocks.WATER || iblockstate.getBlock() == Blocks.FLOWING_WATER) {
				worldIn.setBlockToAir(blockpos);
				worldIn.playSound((EntityPlayer) null, pos, SoundEvents.BLOCK_FIRE_EXTINGUISH, SoundCategory.BLOCKS, 0.5F, 2.6F + (worldIn.rand.nextFloat() - worldIn.rand.nextFloat()) * 0.8F);

				if (worldIn instanceof WorldServer) {
					((WorldServer) worldIn).spawnParticle(EnumParticleTypes.SMOKE_LARGE, (double) blockpos.getX() + 0.5D, (double) blockpos.getY() + 0.25D, (double) blockpos.getZ() + 0.5D, 8, 0.5D, 0.25D, 0.5D, 0.0D);
				}
			}
		}

		@Override
		public boolean canEntitySpawn(IBlockState state, Entity entityIn) {

			if (entityIn.isImmuneToFire()) {
				return super.canEntitySpawn(state, entityIn);
			}
			return false;
		}

		@SideOnly(Side.CLIENT)
		public int getPackedLightmapCoords(IBlockState state, IBlockAccess source, BlockPos pos) {
			return 15728880;
		}

		public MapColor getMapColor(IBlockState state, IBlockAccess worldIn, BlockPos pos) {
			return MapColor.NETHERRACK;
		}

	}
}
