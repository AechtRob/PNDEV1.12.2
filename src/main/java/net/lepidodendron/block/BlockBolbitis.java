
package net.lepidodendron.block;

import net.lepidodendron.ElementsLepidodendronMod;
import net.lepidodendron.LepidodendronConfig;
import net.lepidodendron.LepidodendronSorter;
import net.lepidodendron.block.base.IAdvancementGranter;
import net.lepidodendron.block.base.SeedSporeBlockBase;
import net.lepidodendron.creativetab.TabLepidodendronPlants;
import net.lepidodendron.util.CustomTrigger;
import net.lepidodendron.util.ModTriggers;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.properties.PropertyInteger;
import net.minecraft.block.state.BlockFaceShape;
import net.minecraft.block.state.BlockStateContainer;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.client.renderer.block.statemap.StateMap;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.BlockRenderLayer;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.NonNullList;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.oredict.OreDictionary;

import javax.annotation.Nullable;
import java.util.List;
import java.util.Random;

@ElementsLepidodendronMod.ModElement.Tag
public class BlockBolbitis extends ElementsLepidodendronMod.ModElement {
	@GameRegistry.ObjectHolder("lepidodendron:bolbitis")
	public static final Block block = null;
	public BlockBolbitis(ElementsLepidodendronMod instance) {
		super(instance, LepidodendronSorter.bolbitis);
	}

	@Override
	public void initElements() {
		elements.blocks.add(() -> new BlockCustom().setRegistryName("bolbitis"));
		elements.items.add(() -> new ItemBlock(block).setRegistryName(block.getRegistryName()));
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(block), 0,
				new ModelResourceLocation("lepidodendron:bolbitis", "inventory"));
			ModelLoader.setCustomStateMapper(block, (new StateMap.Builder()).ignore(BlockBolbitis.LEVEL).build());
	}

	@Override
	public void init(FMLInitializationEvent event) {
		super.init(event);
		OreDictionary.registerOre("plantdnaPNlepidodendron:bolbitis", BlockBolbitis.block);
		OreDictionary.registerOre("plantPrehistoric", BlockBolbitis.block);
		OreDictionary.registerOre("plant", BlockBolbitis.block);
	}


	public static final PropertyInteger LEVEL = PropertyInteger.create("level", 0, 15);
	
	public static class BlockCustom extends SeedSporeBlockBase implements IAdvancementGranter {
	    
		public BlockCustom() {
			super(Material.WATER);
			setTranslationKey("pf_bolbitis");
			setSoundType(SoundType.PLANT);
			setHardness(0.5F);
			setResistance(0F);
			setLightLevel(0F);
			setLightOpacity(3);
			setCreativeTab(TabLepidodendronPlants.tab);
			this.setDefaultState( this.blockState.getBaseState().withProperty(LEVEL, 0));
		}

		@Nullable
		@Override
		public CustomTrigger getModTrigger() {
			return ModTriggers.CLICK_BOLBITIS;
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
		public boolean isPassable(IBlockAccess worldIn, BlockPos pos) {
			return true;
		}

		@Override
		public IBlockState getActualState(IBlockState state, IBlockAccess worldIn, BlockPos pos)
	    {
	        return state.withProperty(LEVEL, 0);
	    }

	    @Override
		public void getDrops(NonNullList<ItemStack> drops, IBlockAccess world, BlockPos pos, IBlockState state, int fortune) {
			if (LepidodendronConfig.doPropagation) {
				drops.add(new ItemStack(Blocks.AIR, (int) (1)));
			}
			else {
				drops.add(new ItemStack(BlockBolbitis.block, (int) (1)));
			}
		}

		@Nullable
		public AxisAlignedBB getCollisionBoundingBox(IBlockState blockState, IBlockAccess worldIn, BlockPos pos)
		{
			return NULL_AABB;
		}

		@Override
	    public IBlockState getStateFromMeta(int meta)
	    {
	        return this.getDefaultState();
	    }

	    @Override
	    public int getMetaFromState(IBlockState state)
	    {
	        return 0;
	    }

	    @Override
		public boolean isOpaqueCube(IBlockState state) {
			return false;
		}

		protected BlockStateContainer createBlockState()
	    {
	        return new BlockStateContainer(this, new IProperty[] {LEVEL});
	    }
	    
		@Override
	    public boolean isFullCube(IBlockState state)
	    {
	        return false;
	    }

	    @SideOnly(Side.CLIENT)
	    @Override
	    public BlockRenderLayer getRenderLayer()
	    {
	        return BlockRenderLayer.CUTOUT_MIPPED;
	    }

	    @Override
	    public BlockFaceShape getBlockFaceShape(IBlockAccess world, IBlockState state, BlockPos pos, EnumFacing facing)
	    {
	        return BlockFaceShape.UNDEFINED;
	    }

		@Override
		public AxisAlignedBB getBoundingBox(IBlockState state, IBlockAccess source, BlockPos pos) {
			return new AxisAlignedBB(0.05D, 0D, 0.05D, 0.95D, 1D, 0.95D);
		}

	    public boolean isWaterBlock(World world, BlockPos pos) {
			if (world.getBlockState(pos).getMaterial() == Material.WATER) {
				//IBlockState iblockstate = world.getBlockState(pos);
				//if (((Integer)iblockstate.getValue(BlockLiquid.LEVEL)).intValue() == 0) {
					return true;
				//}
			}
	    	return false;
	    }

	    @Override
	    public void breakBlock(World worldIn, BlockPos pos, IBlockState state) {
			//Chance of a second drop:
			if (Math.random() >= 0.7 && !LepidodendronConfig.doPropagation) {
				if (!worldIn.isRemote) {
					EntityItem entityToSpawn = new EntityItem(worldIn, pos.getX(), pos.getY(), pos.getZ(), new ItemStack(this, (int) (1)));
					entityToSpawn.setPickupDelay(10);
					worldIn.spawnEntity(entityToSpawn);
				}
			}
	    	super.breakBlock(worldIn, pos, state);
	    }

	    public boolean canPlaceBlockAt(World worldIn, BlockPos pos)
	    {
	    	//System.err.println("Can place");

			if (isWaterBlock(worldIn, pos.up(2)) && isWaterBlock(worldIn, pos.up()) && isWaterBlock(worldIn, pos)
					&& ((worldIn.isAirBlock(pos.up(3))) || (worldIn.getBlockState(pos.up(3)).getMaterial() == Material.PLANTS))
					&& (((worldIn.getBlockState(pos.down()).getMaterial() == Material.SAND)
					|| (worldIn.getBlockState(pos.down()).getMaterial() == Material.GROUND)
					|| (worldIn.getBlockState(pos.down()).getMaterial() == Material.CLAY))
			)
			) {
				return true;
			}
	        if (isWaterBlock(worldIn, pos.up()) && isWaterBlock(worldIn, pos)
				&& ((worldIn.isAirBlock(pos.up(2))) || (worldIn.getBlockState(pos.up(2)).getMaterial() == Material.PLANTS))
	        	&& (((worldIn.getBlockState(pos.down()).getMaterial() == Material.SAND)
					|| (worldIn.getBlockState(pos.down()).getMaterial() == Material.GROUND)
					|| (worldIn.getBlockState(pos.down()).getMaterial() == Material.CLAY))
					)
				) {
	        		return true;
	        	}
	        return false;
	    }

	    @Override
		public void updateTick(World world, BlockPos pos, IBlockState state, Random random) {
			//super.updateTick(world, pos, state, random);
			if (!this.canPlaceBlockAt(world, pos)) {
				world.destroyBlock(pos, true);
			}
		}

	    @Override
		public void neighborChanged(IBlockState state, World world, BlockPos pos, Block neighborBlock, BlockPos fromPos) {
			//super.neighborChanged(state, world, pos, neighborBlock, fromPos);
			world.scheduleUpdate(pos, this, 1);
		}

		@SideOnly(Side.CLIENT)
		@Override
	    public void addInformation(ItemStack stack, World player, List<String> tooltip, ITooltipFlag advanced) {
	        if (LepidodendronConfig.showTooltips) {
				tooltip.add("Type: Water Fern");
				tooltip.add("Periods: early Cretaceous - Paleogene - Neogene - Pleistocene [- present]");
				tooltip.add("Note: planted 2-3 blocks under water");
				tooltip.add("Propagation: spores");}
	        super.addInformation(stack, player, tooltip, advanced);
	    }

		@Override
		public Block planted() {
			return BlockBolbitis.block;
		}

		@Override
		public int offsetY() {
			return 1;
		}
	}
}
