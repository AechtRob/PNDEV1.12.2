
package net.lepidodendron.block;

import net.lepidodendron.ElementsLepidodendronMod;
import net.lepidodendron.LepidodendronSorter;
import net.lepidodendron.creativetab.TabLepidodendronMisc;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.BlockFaceShape;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.util.DamageSource;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumParticleTypes;
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
public class BlockToxicMud extends ElementsLepidodendronMod.ModElement {
	@GameRegistry.ObjectHolder("lepidodendron:toxic_mud")
	public static final Block block = null;
	public BlockToxicMud(ElementsLepidodendronMod instance) {
		super(instance, LepidodendronSorter.toxic_mud);
	}

	@Override
	public void initElements() {
		elements.blocks.add(() -> new BlockCustom().setRegistryName("toxic_mud"));
		elements.items.add(() -> new ItemBlock(block).setRegistryName(block.getRegistryName()));
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(block), 0,
				new ModelResourceLocation("lepidodendron:toxic_mud", "inventory"));
	}
	public static class BlockCustom extends Block {
		public BlockCustom() {
			super(Material.CLAY, MapColor.CLAY);
			setTranslationKey("pf_toxic_mud");
			setSoundType(SoundType.SLIME);
			setHarvestLevel("shovel", 1);
			setHardness(0.5F);
			setResistance(0.5F);
			setLightLevel(0F);
			setLightOpacity(255);
			setCreativeTab(TabLepidodendronMisc.tab);
			setDefaultSlipperiness(0.98f);
		}

		//@Override
		public void onEntityWalk(World worldIn, BlockPos pos, Entity entityIn)
		{
			//System.err.println(((EntityLivingBase) entityIn).getItemStackFromSlot(EntityEquipmentSlot.FEET));

			if (entityIn instanceof EntityPlayer)
			{
				if ((((EntityLivingBase) entityIn).getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() == Items.AIR)
					&& (!((EntityPlayer) entityIn).capabilities.isCreativeMode)) {
					entityIn.attackEntityFrom(DamageSource.HOT_FLOOR, (float) 0.5F);
				}
			}
			else if (entityIn instanceof EntityLivingBase)
			{
				if (((EntityLivingBase) entityIn).getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() == Items.AIR)
					entityIn.attackEntityFrom(DamageSource.HOT_FLOOR, (float) 0.5F);
			}
		}

		@SideOnly(Side.CLIENT)
		@Override
		public void randomDisplayTick(IBlockState state, World world, BlockPos pos, Random random) {
			super.randomDisplayTick(state, world, pos, random);
			EntityPlayer entity = Minecraft.getMinecraft().player;
			if (world.getBlockState(pos.up()).getMaterial() == Material.AIR && random.nextInt(16) == 0) {
				for (int l = 0; l < 4; ++l) {
					world.spawnParticle(EnumParticleTypes.CLOUD, (double) pos.getX() + Math.random(), (double) pos.getY() + 0.95, (double) pos.getZ() + Math.random(), 0, 0.3D, 0);
				}
			}
		}

		@Override
		public BlockFaceShape getBlockFaceShape(IBlockAccess worldIn, IBlockState state, BlockPos pos, EnumFacing face) {
			return BlockFaceShape.UNDEFINED; //stops things generating on it
		}
	}
}
