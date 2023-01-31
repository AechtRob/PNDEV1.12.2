
package net.lepidodendron.block;

import net.lepidodendron.ElementsLepidodendronMod;
import net.lepidodendron.LepidodendronSorter;
import net.lepidodendron.creativetab.TabLepidodendronMisc;
import net.lepidodendron.item.ItemSulphur;
import net.minecraft.block.Block;
import net.minecraft.block.BlockObsidian;
import net.minecraft.block.SoundType;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.entity.Entity;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraft.util.BlockRenderLayer;
import net.minecraft.util.NonNullList;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import java.util.Random;

@ElementsLepidodendronMod.ModElement.Tag
public class BlockObsidianSulphurOre extends ElementsLepidodendronMod.ModElement {
	@GameRegistry.ObjectHolder("lepidodendron:sulphur_ore_obsidian")
	public static final Block block = null;
	public BlockObsidianSulphurOre(ElementsLepidodendronMod instance) {
		super(instance, LepidodendronSorter.sulphur_ore);
	}

	@Override
	public void initElements() {
		elements.blocks.add(() -> new BlockCustom().setRegistryName("sulphur_ore_obsidian"));
		elements.items.add(() -> new ItemBlock(block).setRegistryName(block.getRegistryName()));
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(block), 0,
				new ModelResourceLocation("lepidodendron:sulphur_ore_obsidian", "inventory"));
	}


	public static class BlockCustom extends BlockObsidian {
		public BlockCustom() {
			super();
			setSoundType(SoundType.STONE);
			setTranslationKey("pf_sulphur_ore_obsidian");
			setHarvestLevel("pickaxe", 3);
			setHardness(50.0F);
			setResistance(2000.0F);
			setLightLevel(0F);
			setLightOpacity(255);
			setCreativeTab(TabLepidodendronMisc.tab);
		}

		@Override
		public boolean canEntityDestroy(IBlockState state, IBlockAccess world, BlockPos pos, Entity entity) {
			if (entity instanceof net.minecraft.entity.boss.EntityDragon) {
				return false;
			}
			return true;
		}

		@Override
		public int getExpDrop(IBlockState state, IBlockAccess world, BlockPos pos, int fortune) {
			Random rand = world instanceof World ? ((World) world).rand : new Random();
			if (this.getItemDropped(state, rand, fortune) != Item.getItemFromBlock(this)) {
				int i = MathHelper.getInt(rand, 1, 4);
				return i;
			}
			return 0;
		}

		public Item getSecondItemDropped(IBlockState state, Random rand, int fortune) {
			return new ItemStack(ItemSulphur.block, 1).getItem();
		}

		@Override
		public void getDrops(NonNullList<ItemStack> drops, IBlockAccess world, BlockPos pos, IBlockState state, int fortune) {
			Random rand = world instanceof World ? ((World)world).rand : RANDOM;
			boolean dropped = false;
			int count = quantityDropped(state, fortune, rand);
			for (int i = 0; i < count; i++)
			{
				Item item = this.getItemDropped(state, rand, fortune);
				if (item != Items.AIR && !dropped)
				{
					drops.add(new ItemStack(item, 1, this.damageDropped(state)));
					dropped = true;
				}
				item = this.getSecondItemDropped(state, rand, fortune);
				if (item != Items.AIR)
				{
					drops.add(new ItemStack(item, 1, this.damageDropped(state)));
				}
			}
		}

		@Override
		protected boolean canSilkHarvest() {
			return true;
		}

		@Override
		public int quantityDropped(Random random)
		{
			return 1;
		}

		@Override
		public int quantityDroppedWithBonus(int fortune, Random random)
		{
			if (fortune > 0 && Item.getItemFromBlock(this) != this.getItemDropped((IBlockState)this.getBlockState().getValidStates().iterator().next(), random, fortune))
			{
				int i = random.nextInt(fortune + 2) - 1;

				if (i < 0)
				{
					i = 0;
				}

				return this.quantityDropped(random) * (i + 1);
			}
			else
			{
				return this.quantityDropped(random);
			}
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

	}
}
