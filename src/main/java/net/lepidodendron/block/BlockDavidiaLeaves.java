
package net.lepidodendron.block;

import net.lepidodendron.ElementsLepidodendronMod;
import net.lepidodendron.LepidodendronConfig;
import net.lepidodendron.LepidodendronSorter;
import net.lepidodendron.block.base.BlockLeavesPF;
import net.lepidodendron.item.ItemDavidiaFlower;
import net.lepidodendron.item.ItemDavidiaSeeds;
import net.lepidodendron.util.CustomTrigger;
import net.lepidodendron.util.ModTriggers;
import net.minecraft.block.Block;
import net.minecraft.block.BlockLeaves;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.client.renderer.block.statemap.StateMap;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.items.ItemHandlerHelper;
import net.minecraftforge.oredict.OreDictionary;

import javax.annotation.Nullable;

@ElementsLepidodendronMod.ModElement.Tag
public class BlockDavidiaLeaves extends ElementsLepidodendronMod.ModElement {
	@GameRegistry.ObjectHolder("lepidodendron:davidia_leaves")
	public static final Block block = null;
	public BlockDavidiaLeaves(ElementsLepidodendronMod instance) {
		super(instance, LepidodendronSorter.davidia_leaves);
	}

	@Override
	public void initElements() {
		elements.blocks.add(() -> new BlockCustom().setRegistryName("davidia_leaves"));
		elements.items.add(() -> new ItemBlock(block).setRegistryName(block.getRegistryName()));
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(block), 0,
				new ModelResourceLocation("lepidodendron:davidia_leaves", "inventory"));
		ModelLoader.setCustomStateMapper(block, (new StateMap.Builder()).ignore(BlockLeaves.DECAYABLE, BlockLeaves.CHECK_DECAY).build());
	}

	@Override
	public void init(FMLInitializationEvent event) {
		super.init(event);
		OreDictionary.registerOre("plantdnaPNlepidodendron:davidia_sapling", BlockDavidiaLeaves.block);
		OreDictionary.registerOre("plantPrehistoric", BlockDavidiaLeaves.block);
		OreDictionary.registerOre("plant", BlockDavidiaLeaves.block);
		OreDictionary.registerOre("treeLeaves", BlockDavidiaLeaves.block);
	}

	public static class BlockCustom extends BlockLeavesPF {
		public BlockCustom() {
			setTranslationKey("pf_davidia_leaves");
		}

		@Nullable
		@Override
		public CustomTrigger getModTrigger() {
			return ModTriggers.CLICK_DAVIDIA;
		}

		@Override
		protected int getSaplingDropChance(IBlockState state) {
			if (LepidodendronConfig.doPropagation) {
				return 5;
			}
			else {
				return 20;
			}
		}

		@Override
		public Item getItemDropped(IBlockState state, java.util.Random rand, int fortune) {
			if (LepidodendronConfig.doPropagation) {
				return new ItemStack(ItemDavidiaFlower.block, (int) (1)).getItem();
			}
			else {
				return Item.getItemFromBlock(BlockDavidiaSapling.block);
			}
		}

		@Override
		public boolean onBlockActivated(World worldIn, BlockPos pos, IBlockState state, EntityPlayer playerIn, EnumHand hand, EnumFacing facing, float hitX, float hitY, float hitZ) {
			//right-click block:
			if (!(worldIn.isRemote)) {
				ItemStack stack = playerIn.getHeldItem(hand);

				if ((!playerIn.capabilities.allowEdit) || (playerIn.getHeldItemMainhand().getItem() != ItemDavidiaFlower.block) || !LepidodendronConfig.doPropagation)
				{
					return super.onBlockActivated(worldIn, pos, state, playerIn, hand, facing, hitX, hitY, hitZ);
				}
				else {
					ItemStack itemstack = playerIn.getHeldItem(hand);
					if (!playerIn.isCreative()) {itemstack.shrink(1);}
					if (!((hand != playerIn.getActiveHand()) && (hand == EnumHand.MAIN_HAND))) {
						if (Math.random() > 0.5) {
							ItemStack stackSeed = new ItemStack(ItemDavidiaSeeds.block, (int) (1));
							stackSeed.setCount(1);
							ItemHandlerHelper.giveItemToPlayer(playerIn, stackSeed);
							if (Math.random() > 0.75) {
								worldIn.destroyBlock(pos, false);
							}
							return true;
						}
						else {
							if (Math.random() > 0.75) {
								worldIn.destroyBlock(pos, false);
								return true;
							}
						}
					}
					return true;
				}
			}
			else {
				return super.onBlockActivated(worldIn, pos, state, playerIn, hand, facing, hitX, hitY, hitZ);
			}
		}

	}
}
