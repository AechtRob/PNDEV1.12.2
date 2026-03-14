
package net.lepidodendron.block;

import net.lepidodendron.ElementsLepidodendronMod;
import net.lepidodendron.LepidodendronConfig;
import net.lepidodendron.LepidodendronSorter;
import net.lepidodendron.block.base.IAdvancementGranter;
import net.lepidodendron.block.base.IPottable;
import net.lepidodendron.creativetab.TabLepidodendronPlants;
import net.lepidodendron.procedure.ProcedureWorldGenCercidiphyllum;
import net.lepidodendron.util.CustomTrigger;
import net.lepidodendron.util.ModTriggers;
import net.minecraft.block.Block;
import net.minecraft.block.BlockBush;
import net.minecraft.block.IGrowable;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.properties.PropertyInteger;
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
import net.minecraft.util.NonNullList;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.RayTraceResult;
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
public class BlockCercidiphyllumSaplingAutumn extends ElementsLepidodendronMod.ModElement {
	@GameRegistry.ObjectHolder("lepidodendron:cercidiphyllum_sapling_autumn")
	public static final Block block = null;
	public BlockCercidiphyllumSaplingAutumn(ElementsLepidodendronMod instance) {
		super(instance, LepidodendronSorter.cercidiphyllum_sapling);
	}

	@Override
	public void initElements() {
		elements.blocks.add(() -> new BlockCustom().setRegistryName("cercidiphyllum_sapling_autumn"));
		elements.items.add(() -> new ItemBlock(block).setRegistryName(block.getRegistryName()));
	}
	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(block), 0,
				new ModelResourceLocation("lepidodendron:cercidiphyllum_sapling_autumn", "inventory"));
	}

	@Override
	public void init(FMLInitializationEvent event) {
		super.init(event);
		OreDictionary.registerOre("plantdnaPNlepidodendron:cercidiphyllum_sapling", BlockCercidiphyllumSaplingAutumn.block);
		OreDictionary.registerOre("treeSapling", BlockCercidiphyllumSaplingAutumn.block);
		OreDictionary.registerOre("plantPrehistoric", BlockCercidiphyllumSaplingAutumn.block);
		OreDictionary.registerOre("plant", BlockCercidiphyllumSaplingAutumn.block);
	}


	public static final PropertyInteger STAGE = PropertyInteger.create("stage", 0, 1);
    protected static final AxisAlignedBB SAPLING_AABB = new AxisAlignedBB(0.09999999403953552D, 0.0D, 0.09999999403953552D, 0.8999999761581421D, 0.800000011920929D, 0.8999999761581421D);

	public static class BlockCustom extends BlockBush implements IGrowable, IAdvancementGranter, IPottable {
		public BlockCustom() {
			super(Material.PLANTS);
			setSoundType(SoundType.PLANT);
			setCreativeTab(TabLepidodendronPlants.tab);
			setHardness(0.2F);
        	setResistance(1F);
			setTranslationKey("pf_cercidiphyllum_sapling_autumn");
			setDefaultState(this.blockState.getBaseState().withProperty(STAGE, Integer.valueOf(0)));
		}

		@Override
		public IBlockState getPotState() {
			return this.getDefaultState();
		}

		@Nullable
		@Override
		public CustomTrigger getModTrigger() {
			return ModTriggers.CLICK_CERCIDIPHYLLUM;
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

		public AxisAlignedBB getBoundingBox(IBlockState state, IBlockAccess source, BlockPos pos)
	    {
	        return SAPLING_AABB;
	    }

		@Override
		public void updateTick(World worldIn, BlockPos pos, IBlockState state, Random rand)
	    {
	        if (!worldIn.isRemote)
	        {
	            super.updateTick(worldIn, pos, state, rand);
	
	            if (!worldIn.isAreaLoaded(pos, 1)) return; // Forge: prevent loading unloaded chunks when checking neighbor's light
	            if (worldIn.getLightFromNeighbors(pos.up()) >= 9 && rand.nextInt(7) == 0)
	            {
	                this.grow(worldIn, rand, pos, state);
	            }
	        }
	    }

		public void grow(World world, Random rand, BlockPos pos, IBlockState state)
	    {
	        if (((Integer)state.getValue(STAGE)).intValue() == 0)
	        {
	            world.setBlockState(pos, state.cycleProperty(STAGE), 4);
	        }
	        else
	        {
				int BareTrunk = 5 + rand.nextInt(5);

				for (int log = 0; log<BareTrunk; log++) {
					world.setBlockState(pos.up(log), BlockTrochodendroidesLog.block.getDefaultState().withProperty(BlockTrochodendroidesLog.BlockCustom.FACING, EnumFacing.NORTH), 3);
				}

				int TreeHeight = 12 + rand.nextInt(12);
				if (TreeHeight > 18 && Math.random() > 0.5) {
					TreeHeight = 8 + rand.nextInt(9);
				}
				ProcedureWorldGenCercidiphyllum.executeProcedure(world, pos.up(BareTrunk), TreeHeight, true);

				//Surrounding stems:
				for (int d = 0; d <= 3; d++) {
					BlockPos posStem = pos;
					if (rand.nextInt(4) == 0) {
						posStem = posStem.up();
					}
					world.setBlockState(posStem.offset(EnumFacing.byHorizontalIndex(d)), BlockTrochodendroidesLog.block.getDefaultState().withProperty(BlockTrochodendroidesLog.BlockCustom.FACING, d==0 || d== 2 ? EnumFacing.EAST : EnumFacing.UP), 3);
					world.setBlockState(posStem.offset(EnumFacing.byHorizontalIndex(d), 2), BlockTrochodendroidesLog.block.getDefaultState().withProperty(BlockTrochodendroidesLog.BlockCustom.FACING, EnumFacing.NORTH), 3);
					world.setBlockState(posStem.up().offset(EnumFacing.byHorizontalIndex(d), 2), BlockTrochodendroidesLog.block.getDefaultState().withProperty(BlockTrochodendroidesLog.BlockCustom.FACING, EnumFacing.NORTH), 3);
					world.setBlockState(posStem.up().offset(EnumFacing.byHorizontalIndex(d), 3), BlockTrochodendroidesLog.block.getDefaultState().withProperty(BlockTrochodendroidesLog.BlockCustom.FACING, EnumFacing.NORTH), 3);
					world.setBlockState(posStem.up(2).offset(EnumFacing.byHorizontalIndex(d), 3), BlockTrochodendroidesLog.block.getDefaultState().withProperty(BlockTrochodendroidesLog.BlockCustom.FACING, EnumFacing.NORTH), 3);
					BlockPos newPos = posStem.up(3).offset(EnumFacing.byHorizontalIndex(d), 3);
					int BareTrunkSide = rand.nextInt(3);
					for (int log = 0; log<BareTrunkSide; log++) {
						world.setBlockState(newPos.up(log), BlockTrochodendroidesLog.block.getDefaultState().withProperty(BlockTrochodendroidesLog.BlockCustom.FACING, EnumFacing.NORTH), 3);
					}
					TreeHeight = 8 + rand.nextInt(8);
					if (TreeHeight > 12 && Math.random() > 0.5) {
						TreeHeight = 4 + rand.nextInt(9);
					}
					ProcedureWorldGenCercidiphyllum.executeProcedure(world, newPos.up(BareTrunkSide), TreeHeight - BareTrunkSide, true);
				}

	        }
	    }
	    
		@Override
		public void getDrops(NonNullList<ItemStack> drops, IBlockAccess world, BlockPos pos, IBlockState state, int fortune) {
			drops.add(new ItemStack(this));
		}

		@Override
		public ItemStack getPickBlock(IBlockState state, RayTraceResult target, World world, BlockPos pos, EntityPlayer player) {
			return new ItemStack(Item.getItemFromBlock(this), 1, this.damageDropped(state));
		}

		@Override
		public boolean canPlaceBlockAt(World world, BlockPos pos) {
			Block block2 = world.getBlockState(pos.down()).getBlock();
			return (block2.canSustainPlant(world.getBlockState(pos.down()), world, pos.down(), EnumFacing.UP, this) || block2 == null);
		}

		public boolean canGrow(World worldIn, BlockPos pos, IBlockState state, boolean isClient)
		{
		    return true;
		}
			
		public boolean canUseBonemeal(World worldIn, Random rand, BlockPos pos, IBlockState state)
		{
		    return (double)worldIn.rand.nextFloat() < 0.45D;
		}

		public IBlockState getStateFromMeta(int meta)
	    {
	        return this.getDefaultState().withProperty(STAGE, Integer.valueOf(meta));
	    }
		
		public int getMetaFromState(IBlockState state)
	    {
	        int i = 0;
	        i = i | ((Integer)state.getValue(STAGE)).intValue();
	        return i;
	    }
	
		protected BlockStateContainer createBlockState()
	    {
	        return new BlockStateContainer(this, new IProperty[] {STAGE});
	    }    

	    @SideOnly(Side.CLIENT)
		@Override
	    public void addInformation(ItemStack stack, World player, List<String> tooltip, ITooltipFlag advanced) {
	        if (LepidodendronConfig.showTooltips) {
				tooltip.add("Type: Flowering tree");
				tooltip.add("Periods: [Late Cretaceous - ] Paleogene - Neogene - Pleistocene [ - present]");
				tooltip.add("Propagation: Seeds drop from leaves");}
	        super.addInformation(stack, player, tooltip, advanced);
	    }
	}
}
