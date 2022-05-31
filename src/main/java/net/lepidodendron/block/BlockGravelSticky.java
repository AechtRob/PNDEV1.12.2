
package net.lepidodendron.block;

import net.lepidodendron.ElementsLepidodendronMod;
import net.lepidodendron.LepidodendronSorter;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraft.util.NonNullList;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;


@ElementsLepidodendronMod.ModElement.Tag
public class BlockGravelSticky extends ElementsLepidodendronMod.ModElement {
	@GameRegistry.ObjectHolder("lepidodendron:gravel_sticky")
	public static final Block block = null;
	public BlockGravelSticky(ElementsLepidodendronMod instance) {
		super(instance, LepidodendronSorter.sand_sticky);
	}

	@Override
	public void initElements() {
		elements.blocks.add(() -> new BlockCustom().setRegistryName("gravel_sticky"));
		elements.items.add(() -> new ItemBlock(block).setRegistryName(block.getRegistryName()));
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(block), 0,
				new ModelResourceLocation("lepidodendron:gravel_sticky", "inventory"));
	}
	
	public static class BlockCustom extends Block {
		public BlockCustom() {
			super(Material.SAND);
			setTranslationKey("pf_gravel_sticky");
			setSoundType(SoundType.GROUND);
			setCreativeTab(null);
			setLightLevel(0F);
			setLightOpacity(255);
			setHardness(0.6F);
			setResistance(0.6F);
			setHarvestLevel("shovel", 0);
		}

		@Override
		public MapColor getMapColor(IBlockState state, IBlockAccess blockAccess, BlockPos pos) {
			return MapColor.STONE;
		}

		@Override
		public void getDrops(NonNullList<ItemStack> drops, IBlockAccess world, BlockPos pos, IBlockState state, int fortune) {
			drops.add(new ItemStack(Blocks.GRAVEL, (int) (1), 0));
		}

		@Override
		protected boolean canSilkHarvest()
	    {
	        return true;
	    }

		@Override
		public ItemStack getSilkTouchDrop(IBlockState state)  {
			return new ItemStack(Blocks.GRAVEL, (int) (1), 0);
		}

		public void onEntityWalk(World worldIn, BlockPos pos, Entity entityIn) {
			if (Math.abs(entityIn.motionY) < 0.1D && entityIn.posY <= (double)entityIn.getPosition().getY()+0.1) {
				if (entityIn instanceof EntityPlayer &&  !entityIn.isSneaking()) {
					if (!((EntityPlayer) entityIn).capabilities.isCreativeMode) {
						entityIn.setInWeb();
					}
				} else if (entityIn instanceof EntityLivingBase) {
					entityIn.setInWeb();
				}
			}
		}

	}
}
