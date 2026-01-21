
package net.lepidodendron.block;

import net.lepidodendron.ElementsLepidodendronMod;
import net.lepidodendron.LepidodendronConfig;
import net.lepidodendron.LepidodendronSorter;
import net.lepidodendron.block.base.BlockLeavesPF;
import net.lepidodendron.creativetab.TabLepidodendronPlants;
import net.lepidodendron.item.ItemTorreyaBerries;
import net.lepidodendron.util.CustomTrigger;
import net.lepidodendron.util.ModTriggers;
import net.minecraft.block.Block;
import net.minecraft.block.BlockLeaves;
import net.minecraft.block.SoundType;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.properties.PropertyBool;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.client.renderer.block.statemap.StateMap;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
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
import java.util.Random;


@ElementsLepidodendronMod.ModElement.Tag
public class BlockTorreyaLeavesBerries extends ElementsLepidodendronMod.ModElement {
	@GameRegistry.ObjectHolder("lepidodendron:torreya_leaves_berries")
	public static final Block block = null;
	public BlockTorreyaLeavesBerries(ElementsLepidodendronMod instance) {
		super(instance, LepidodendronSorter.torreya_leaves);
	}

	@Override
	public void initElements() {
		elements.blocks.add(() -> new BlockCustom().setRegistryName("torreya_leaves_berries"));
		elements.items.add(() -> new ItemBlock(block).setRegistryName(block.getRegistryName()));
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(block), 0,
				new ModelResourceLocation("lepidodendron:torreya_leaves_berries", "inventory"));
		ModelLoader.setCustomStateMapper(block, (new StateMap.Builder()).ignore(BlockLeaves.DECAYABLE, BlockLeaves.CHECK_DECAY).build());
	}

	@Override
	public void init(FMLInitializationEvent event) {
		super.init(event);
		OreDictionary.registerOre("plantdnaPNlepidodendron:torreya_sapling", BlockTorreyaLeavesBerries.block);
		OreDictionary.registerOre("plantPrehistoric", BlockTorreyaLeavesBerries.block);
		OreDictionary.registerOre("plant", BlockTorreyaLeavesBerries.block);
		OreDictionary.registerOre("treeLeaves", BlockTorreyaLeavesBerries.block);
	}

	public static final PropertyBool FRUITS = PropertyBool.create("fruits");

	public static class BlockCustom extends BlockLeavesPF {
		public BlockCustom() {
			super();
			setTranslationKey("pf_torreya_leaves_berries");
			setSoundType(SoundType.PLANT);
			setHardness(0.2F);
			setResistance(0.2F);
			setLightLevel(0F);
			setLightOpacity(1);
			setCreativeTab(TabLepidodendronPlants.tab);
			this.setDefaultState(this.blockState.getBaseState().withProperty(CHECK_DECAY, true).withProperty(DECAYABLE, true).withProperty(FRUITS, true));
		}

		@Nullable
		@Override
		public CustomTrigger getModTrigger() {
			return ModTriggers.CLICK_TORREYA;
		}

		@Override
		protected int getSaplingDropChance(IBlockState state) {
			if (LepidodendronConfig.doPropagation) {
				return 2;
			}
			else {
				return 20;
			}
		}

		@Override
		public void updateTick(World worldIn, BlockPos pos, IBlockState state, Random rand) {
			if (worldIn.rand.nextInt(4) == 0) {
				if (!(state.getValue(FRUITS))) {
					worldIn.setBlockState(pos, this.getDefaultState().withProperty(DECAYABLE, state.getValue(DECAYABLE)).withProperty(CHECK_DECAY, state.getValue(CHECK_DECAY)).withProperty(FRUITS, true));
				}
			}
			super.updateTick(worldIn, pos, state, rand);
		}

		@Override
		public Item getItemDropped(IBlockState state, Random rand, int fortune) {
			if (LepidodendronConfig.doPropagation) {
				// Use the seeds method instead:
				if (state.getValue(FRUITS)) {
					return new ItemStack(ItemTorreyaBerries.block, (int) (1)).getItem();
				}
				return new ItemStack(Items.AIR, (int) (1)).getItem();
			}
			else {
				return Item.getItemFromBlock(BlockTorreyaSapling.block);
			}
		}

		@Override
		public IBlockState getStateForPlacement(World worldIn, BlockPos pos, EnumFacing facing, float hitX, float hitY, float hitZ, int meta, EntityLivingBase placer) {
			return this.getDefaultState().withProperty(CHECK_DECAY, false).withProperty(DECAYABLE, false).withProperty(FRUITS, false);
		}

		@Override
		protected net.minecraft.block.state.BlockStateContainer createBlockState() {
			return new net.minecraft.block.state.BlockStateContainer(this, new IProperty[]{CHECK_DECAY, DECAYABLE, FRUITS});
		}

		public IBlockState getStateFromMeta(int meta) {
			if (meta == 1) {
				return this.getDefaultState().withProperty(DECAYABLE, true).withProperty(CHECK_DECAY, true).withProperty(FRUITS, true);
			}
			if (meta == 2) {
				return this.getDefaultState().withProperty(DECAYABLE, true).withProperty(CHECK_DECAY, true).withProperty(FRUITS, false);
			}
			if (meta == 3) {
				return this.getDefaultState().withProperty(DECAYABLE, true).withProperty(CHECK_DECAY, false).withProperty(FRUITS, false);
			}
			if (meta == 4) {
				return this.getDefaultState().withProperty(DECAYABLE, true).withProperty(CHECK_DECAY, false).withProperty(FRUITS, true);
			}
			if (meta == 5) {
				return this.getDefaultState().withProperty(DECAYABLE, false).withProperty(CHECK_DECAY, false).withProperty(FRUITS, false);
			}
			if (meta == 6) {
				return this.getDefaultState().withProperty(DECAYABLE, false).withProperty(CHECK_DECAY, false).withProperty(FRUITS, true);
			}
			if (meta == 7) {
				return this.getDefaultState().withProperty(DECAYABLE, false).withProperty(CHECK_DECAY, true).withProperty(FRUITS, true);
			}
			if (meta == 8) {
				return this.getDefaultState().withProperty(DECAYABLE, false).withProperty(CHECK_DECAY, true).withProperty(FRUITS, false);
			}
			return this.getDefaultState().withProperty(DECAYABLE, true).withProperty(CHECK_DECAY, true).withProperty(FRUITS, true);
		}

		public int getMetaFromState(IBlockState state) {
			int i = 5;
			if ((Boolean) state.getValue(DECAYABLE) && (Boolean) state.getValue(CHECK_DECAY) && (Boolean) state.getValue(FRUITS))
				i = 1;
			if ((Boolean) state.getValue(DECAYABLE) && (Boolean) state.getValue(CHECK_DECAY) && (Boolean) !state.getValue(FRUITS))
				i = 2;
			if ((Boolean) state.getValue(DECAYABLE) && (Boolean) !state.getValue(CHECK_DECAY) && (Boolean) !state.getValue(FRUITS))
				i = 3;
			if ((Boolean) state.getValue(DECAYABLE) && (Boolean) !state.getValue(CHECK_DECAY) && (Boolean) state.getValue(FRUITS))
				i = 4;
			if ((Boolean) !state.getValue(DECAYABLE) && (Boolean) !state.getValue(CHECK_DECAY) && (Boolean) !state.getValue(FRUITS))
				i = 5;
			if ((Boolean) !state.getValue(DECAYABLE) && (Boolean) !state.getValue(CHECK_DECAY) && (Boolean) state.getValue(FRUITS))
				i = 6;
			if ((Boolean) !state.getValue(DECAYABLE) && (Boolean) state.getValue(CHECK_DECAY) && (Boolean) state.getValue(FRUITS))
				i = 7;
			if ((Boolean) !state.getValue(DECAYABLE) && (Boolean) state.getValue(CHECK_DECAY) && (Boolean) !state.getValue(FRUITS))
				i = 8;
			return i;
		}

		public boolean onBlockActivated(World world, BlockPos pos, IBlockState state, EntityPlayer player, EnumHand hand, EnumFacing facing, float hitX, float hitY, float hitZ) {
			if ((!player.capabilities.allowEdit) || (!player.getHeldItemMainhand().isEmpty()) || !LepidodendronConfig.doPropagation) {
				return super.onBlockActivated(world, pos, state, player, hand, facing, hitX, hitY, hitZ);
			}
			else if (state.getValue(FRUITS)) {
				if (!((hand != player.getActiveHand()) && (hand == EnumHand.MAIN_HAND))) {
					ItemStack stackSeed = new ItemStack(ItemTorreyaBerries.block, (int) (1));
					stackSeed.setCount(1);
					ItemHandlerHelper.giveItemToPlayer(player, stackSeed);
					world.setBlockState(pos, BlockTorreyaLeavesBerries.block.getDefaultState().withProperty(DECAYABLE, state.getValue(DECAYABLE)).withProperty(CHECK_DECAY, state.getValue(CHECK_DECAY)).withProperty(FRUITS, false), 3);
					return true;
				}
				return true;
			}
			return super.onBlockActivated(world, pos, state, player, hand, facing, hitX, hitY, hitZ);
		}

	}
}
