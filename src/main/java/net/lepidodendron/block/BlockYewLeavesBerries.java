
package net.lepidodendron.block;

import net.lepidodendron.ElementsLepidodendronMod;
import net.lepidodendron.LepidodendronConfig;
import net.lepidodendron.LepidodendronSorter;
import net.lepidodendron.block.base.BlockLeavesPF;
import net.lepidodendron.creativetab.TabLepidodendronPlants;
import net.lepidodendron.item.ItemYewBerries;
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
public class BlockYewLeavesBerries extends ElementsLepidodendronMod.ModElement {
	@GameRegistry.ObjectHolder("lepidodendron:yew_leaves_berries")
	public static final Block block = null;
	public BlockYewLeavesBerries(ElementsLepidodendronMod instance) {
		super(instance, LepidodendronSorter.yew_leaves_berries);
	}

	@Override
	public void initElements() {
		elements.blocks.add(() -> new BlockCustom().setRegistryName("yew_leaves_berries"));
		elements.items.add(() -> new ItemBlock(block).setRegistryName(block.getRegistryName()));
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(block), 0,
				new ModelResourceLocation("lepidodendron:yew_leaves_berries", "inventory"));
		ModelLoader.setCustomStateMapper(block, (new StateMap.Builder()).ignore(BlockLeaves.DECAYABLE, BlockLeaves.CHECK_DECAY).build());
	}

	@Override
	public void init(FMLInitializationEvent event) {
		super.init(event);
		OreDictionary.registerOre("plantdnaPNlepidodendron:yew_sapling", BlockYewLeavesBerries.block);
		OreDictionary.registerOre("plantPrehistoric", BlockYewLeavesBerries.block);
		OreDictionary.registerOre("plant", BlockYewLeavesBerries.block);
		OreDictionary.registerOre("treeLeaves", BlockYewLeavesBerries.block);
	}

	public static final PropertyBool FRUITS = PropertyBool.create("fruits");

	public static class BlockCustom extends BlockLeavesPF {
		public BlockCustom() {
			super();
			setTranslationKey("pf_yew_leaves_berries");
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
			return ModTriggers.CLICK_YEW;
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
					worldIn.setBlockState(pos, this.getDefaultState().withProperty(FRUITS, true));
				}
			}
			super.updateTick(worldIn, pos, state, rand);
		}

		@Override
		public Item getItemDropped(IBlockState state, java.util.Random rand, int fortune) {
			if (LepidodendronConfig.doPropagation) {
				// Use the seeds method instead:
				if (state.getValue(FRUITS)) {
					return new ItemStack(ItemYewBerries.block, (int) (1)).getItem();
				}
				return new ItemStack(Items.AIR, (int) (1)).getItem();
			}
			else {
				return Item.getItemFromBlock(BlockYewSapling.block);
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
			return this.getDefaultState().withProperty(DECAYABLE, (meta & 1) != 0).withProperty(CHECK_DECAY, (meta & 2) != 0).withProperty(FRUITS, (meta & 3) != 0);
		}

		public int getMetaFromState(IBlockState state) {
			int i = 0;
			if (!(Boolean) state.getValue(DECAYABLE))
				i |= 1;
			if ((Boolean) state.getValue(CHECK_DECAY))
				i |= 2;
			if ((Boolean) state.getValue(FRUITS))
				i |= 3;
			return i;
		}

		public boolean onBlockActivated(World world, BlockPos pos, IBlockState state, EntityPlayer player, EnumHand hand, EnumFacing facing, float hitX, float hitY, float hitZ) {
			if ((!player.capabilities.allowEdit) || (!player.getHeldItemMainhand().isEmpty()) || !LepidodendronConfig.doPropagation) {
				return super.onBlockActivated(world, pos, state, player, hand, facing, hitX, hitY, hitZ);
			}
			else if (state.getValue(FRUITS)) {
				if (!((hand != player.getActiveHand()) && (hand == EnumHand.MAIN_HAND))) {
					ItemStack stackSeed = new ItemStack(ItemYewBerries.block, (int) (1));
					stackSeed.setCount(1);
					ItemHandlerHelper.giveItemToPlayer(player, stackSeed);
					world.setBlockState(pos, BlockYewLeavesBerries.block.getDefaultState().withProperty(FRUITS, false), 3);
					return true;
				}
				return true;
			}
			return super.onBlockActivated(world, pos, state, player, hand, facing, hitX, hitY, hitZ);
		}

	}
}
