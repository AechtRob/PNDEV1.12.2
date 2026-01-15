
package net.lepidodendron.block;

import net.lepidodendron.ElementsLepidodendronMod;
import net.lepidodendron.LepidodendronConfig;
import net.lepidodendron.LepidodendronSorter;
import net.lepidodendron.block.base.IAdvancementGranter;
import net.lepidodendron.block.base.IPottable;
import net.lepidodendron.block.base.SeedSporeBushBase;
import net.lepidodendron.creativetab.TabLepidodendronPlants;
import net.lepidodendron.util.CustomTrigger;
import net.lepidodendron.util.ModTriggers;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.properties.PropertyBool;
import net.minecraft.block.state.BlockStateContainer;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.NonNullList;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.common.EnumPlantType;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.oredict.OreDictionary;

import javax.annotation.Nullable;
import java.util.List;

@ElementsLepidodendronMod.ModElement.Tag
public class BlockOrchidMirror extends ElementsLepidodendronMod.ModElement {
	@GameRegistry.ObjectHolder("lepidodendron:orchid_mirror")
	public static final Block block = null;
	public BlockOrchidMirror(ElementsLepidodendronMod instance) {
		super(instance, LepidodendronSorter.orchid_mirror);
	}

	@Override
	public void initElements() {
		elements.blocks.add(() -> new BlockCustomFlower());
		elements.items.add(() -> new ItemBlock(block).setRegistryName(block.getRegistryName()));
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(block), 0,
				new ModelResourceLocation("lepidodendron:orchid_mirror", "inventory"));
	}

	@Override
	public void init(FMLInitializationEvent event) {
		super.init(event);
		OreDictionary.registerOre("plantdnaPNlepidodendron:orchid_mirror", BlockOrchidMirror.block);
		OreDictionary.registerOre("plantPrehistoric", BlockOrchidMirror.block);
		OreDictionary.registerOre("plant", BlockOrchidMirror.block);
	}


	public static class BlockCustomFlower extends SeedSporeBushBase implements IAdvancementGranter, IPottable {

		public static final PropertyBool SEEDS = PropertyBool.create("seeds");

		public BlockCustomFlower() {
			super(Material.PLANTS);
			setSoundType(SoundType.PLANT);
			setCreativeTab(TabLepidodendronPlants.tab);
			setHardness(0F);
			setResistance(0F);
			setLightLevel(0F);
			setTranslationKey("pf_orchid_mirror");
			setRegistryName("orchid_mirror");
			this.setDefaultState(this.blockState.getBaseState().withProperty(SEEDS, false));
		}

		@Nullable
		@Override
		public CustomTrigger getModTrigger() {
			return ModTriggers.CLICK_ORCHID_MIRROR;
		}

		@Override
		public void harvestBlock(World worldIn, EntityPlayer player, BlockPos pos, IBlockState state, @Nullable TileEntity te, ItemStack stack) {
			if (stack.getItem() == Items.SHEARS && LepidodendronConfig.doPropagation
					&&
					(worldIn.getBlockState(pos.down()).getMaterial() == Material.GROUND
							|| worldIn.getBlockState(pos.down()).getMaterial() == Material.SAND
							|| worldIn.getBlockState(pos.down()).getMaterial() == Material.ROCK
							|| worldIn.getBlockState(pos.down()).getMaterial() == Material.CLAY
							|| worldIn.getBlockState(pos.down()).getMaterial() == Material.GRASS
					)
					&& !state.getValue(SEEDS)
			) {
				EntityItem entityToSpawn = new EntityItem(worldIn, pos.getX(), pos.getY(), pos.getZ(), new ItemStack(this, (int) (1)));
				entityToSpawn.setPickupDelay(10);
				worldIn.spawnEntity(entityToSpawn);
			}
			else {
				super.harvestBlock(worldIn, player, pos, state, te, stack);
			}
		}

		@Override
		@Nullable
		public AxisAlignedBB getCollisionBoundingBox(IBlockState blockState, IBlockAccess worldIn, BlockPos pos) {
			return NULL_AABB;
		}

		@Override
		public boolean isPassable(IBlockAccess worldIn, BlockPos pos) {
			return true;
		}

		@Override
		public int getFlammability(IBlockAccess world, BlockPos pos, EnumFacing face) {
			return 100;
		}

		@Override
		public int getFireSpreadSpeed(IBlockAccess world, BlockPos pos, EnumFacing face) {
			return 60;
		}

		@Override
		public void getDrops(NonNullList<ItemStack> drops, IBlockAccess world, BlockPos pos, IBlockState state, int fortune) {
			if (!LepidodendronConfig.doPropagation) {
				drops.add(new ItemStack(this));
				if (Math.random()>0.66) {
					drops.add(new ItemStack(this));
				}
			}
		}

		@Override
		public ItemStack getPickBlock(IBlockState state, RayTraceResult target, World world, BlockPos pos, EntityPlayer player) {
			return new ItemStack(Item.getItemFromBlock(this), 1, this.damageDropped(state));
		}

		@Override
		public EnumPlantType getPlantType(IBlockAccess world, BlockPos pos) {
			return EnumPlantType.Plains;
		}
		
	    @SideOnly(Side.CLIENT)
		@Override
	    public void addInformation(ItemStack stack, World player, List<String> tooltip, ITooltipFlag advanced) {
	        if (LepidodendronConfig.showTooltips) {
				tooltip.add("Type: Flowering plant");
	        	tooltip.add("Periods: Pleistocene - present");
	        	tooltip.add("Propagation: Flowers and collection envelope");}
	        super.addInformation(stack, player, tooltip, advanced);
	    }

		@Override
	    public EnumOffsetType getOffsetType()
	    {
	        return EnumOffsetType.XZ;
	    }

		protected BlockStateContainer createBlockState()
		{
			return new BlockStateContainer(this, new IProperty[] {SEEDS});
		}

		public IBlockState getStateFromMeta(int meta) {
			return this.getDefaultState().withProperty(SEEDS, (meta & 1) != 0);
		}

		public int getMetaFromState(IBlockState state) {
			int i = 0;
			if (!(Boolean) state.getValue(SEEDS))
				i |= 1;
			return i;
		}

		@Override
		public boolean onBlockActivated(World world, BlockPos pos, IBlockState state, EntityPlayer player, EnumHand hand, EnumFacing facing, float hitX, float hitY, float hitZ)
		{
			if ((!player.capabilities.allowEdit) || state.getValue(SEEDS) || (player.getHeldItemMainhand().getItem() != new ItemStack(BlockOrchidMirror.block, (int) (1)).getItem()) || !LepidodendronConfig.doPropagation)
			{
				return true;
			}
			else {
				ItemStack itemstack = player.getHeldItem(hand);
				if (!player.isCreative()) {itemstack.shrink(1);}
				if (!((hand != player.getActiveHand()) && (hand == EnumHand.MAIN_HAND))) {
					world.setBlockState(pos, BlockOrchidMirror.block.getDefaultState().withProperty(SEEDS, true));
					return true;
				}
				return true;
			}
		}

		@Override
		public IBlockState getPotState() {
			return this.getDefaultState();
		}

		@Override
		public Block planted() {
			return BlockOrchidMirror.block;
		}

		@Override
		public int offsetY() {
			return 1;
		}

		@Override
		public Item blockItem() {
			return null;
		}

		@Override
		public boolean canGive(@Nullable IBlockState state) {
			return state.getValue(SEEDS);
		}
	}
	
}

