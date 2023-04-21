
package net.lepidodendron.block;

import net.lepidodendron.ElementsLepidodendronMod;
import net.lepidodendron.LepidodendronConfig;
import net.lepidodendron.LepidodendronSorter;
import net.lepidodendron.creativetab.TabLepidodendronPlants;
import net.lepidodendron.procedure.ProcedureTreeLog;
import net.lepidodendron.procedure.ProcedureWorldGenBisonia;
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
public class BlockBisoniaSapling extends ElementsLepidodendronMod.ModElement {
	@GameRegistry.ObjectHolder("lepidodendron:bisonia_sapling")
	public static final Block block = null;
	public BlockBisoniaSapling(ElementsLepidodendronMod instance) {
		super(instance, LepidodendronSorter.bisonia_sapling);
	}

	@Override
	public void initElements() {
		elements.blocks.add(() -> new BlockCustom().setRegistryName("bisonia_sapling"));
		elements.items.add(() -> new ItemBlock(block).setRegistryName(block.getRegistryName()));
	}
	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(block), 0,
				new ModelResourceLocation("lepidodendron:bisonia_sapling", "inventory"));
	}

	@Override
	public void init(FMLInitializationEvent event) {
		super.init(event);
		OreDictionary.registerOre("plantdnaPNlepidodendron:bisonia_sapling", BlockBisoniaSapling.block);
		OreDictionary.registerOre("treeSapling", BlockBisoniaSapling.block);
		OreDictionary.registerOre("plantPrehistoric", BlockBisoniaSapling.block);
		OreDictionary.registerOre("plant", BlockBisoniaSapling.block);
	}


	public static final PropertyInteger STAGE = PropertyInteger.create("stage", 0, 1);
    protected static final AxisAlignedBB SAPLING_AABB = new AxisAlignedBB(0.09999999403953552D, 0.0D, 0.09999999403953552D, 0.8999999761581421D, 0.800000011920929D, 0.8999999761581421D);

	public static class BlockCustom extends BlockBush implements IGrowable {
		public BlockCustom() {
			super(Material.PLANTS);
			setSoundType(SoundType.PLANT);
			setCreativeTab(TabLepidodendronPlants.tab);
			setHardness(0.2F);
        	setResistance(1F);
			setTranslationKey("pf_bisonia_sapling");
			setDefaultState(this.blockState.getBaseState().withProperty(STAGE, Integer.valueOf(0)));
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
				growBisonia(world, pos, rand);
	        }
	    }

		public static void growBisonia(World world, BlockPos pos, Random rand) {
			int TreeHeight = 16 + rand.nextInt(8);
			int TrunkHeight = 6 + rand.nextInt(3);
			if (TrunkHeight >= TreeHeight) {
				TrunkHeight = (int)Math.round((double)TreeHeight * 0.5);
			}
			int ii = 0;
			//Trunk up the middle and the crown at the top:
			for (ii = 0; ii < TrunkHeight; ii++) {
				ProcedureTreeLog.executeProcedure(pos.getX(), pos.getY() + ii, pos.getZ(), world, BlockBisoniaLog.block, EnumFacing.NORTH);
			}
			ProcedureWorldGenBisonia.executeProcedure(world, pos.up(ii), TreeHeight - TrunkHeight);
			//Also side branch things:
			boolean north = false;
			boolean east = false;
			boolean south = false;
			boolean west = false;
			for (ii = 0; ii < 4; ii++) {
				//Pick a random direction:
				int dir = rand.nextInt(4);
				if (dir == 0 && north) {
					dir = 1;
				}
				else if (dir == 1 && east) {
					dir = 2;
				}
				else if (dir == 2 && south) {
					dir = 3;
				}
				else if (dir == 3 && west) {
					dir = 0;
				}
				switch (dir) {
					case 0: default:
						int branchHeight = TrunkHeight - rand.nextInt(4);
						//North
						if (rand.nextInt(3) == 0) {
							break;
						}
						int ll = rand.nextInt(4) + 2; //branch length
						int yy = pos.getY() + branchHeight;
						int xx = pos.getX();
						int zz = pos.getZ();
						for (int length = 0; length <= ll; length++) {
							if (rand.nextInt(3) == 0) {
								yy ++;
							}
							if (rand.nextInt(4) == 0 && length >= 1) {
								xx = xx + rand.nextInt(3) - 1;
							}
							zz --;
							ProcedureTreeLog.executeProcedure(xx, yy, zz, world, BlockBisoniaLog.block, EnumFacing.EAST);
						}
						ProcedureWorldGenBisonia.executeProcedure(world, new BlockPos(xx, yy + 1, zz), rand.nextInt(4) + 3);
						north = true;
						break;

					case 1:
						//East
						branchHeight = TrunkHeight - rand.nextInt(4);
						if (rand.nextInt(3) == 0) {
							break;
						}
						ll = rand.nextInt(4) + 2; //branch length
						yy = pos.getY() + branchHeight;
						xx = pos.getX();
						zz = pos.getZ();
						for (int length = 0; length <= ll; length++) {
							if (rand.nextInt(3) == 0) {
								yy ++;
							}
							if (rand.nextInt(4) == 0 && length >= 1) {
								zz = zz + rand.nextInt(3) - 1;
							}
							xx ++;
							ProcedureTreeLog.executeProcedure(xx, yy, zz, world, BlockBisoniaLog.block, EnumFacing.UP);
						}
						ProcedureWorldGenBisonia.executeProcedure(world, new BlockPos(xx, yy + 1, zz), rand.nextInt(4) + 3);
						east = true;
						break;

					case 2:
						//South
						branchHeight = TrunkHeight - rand.nextInt(4);
						if (rand.nextInt(3) == 0) {
							break;
						}
						ll = rand.nextInt(4) + 2; //branch length
						yy = pos.getY() + branchHeight;
						xx = pos.getX();
						zz = pos.getZ();
						for (int length = 0; length <= ll; length++) {
							if (rand.nextInt(2) == 0) {
								yy ++;
							}
							if (rand.nextInt(4) == 0 && length >= 1) {
								xx = xx + rand.nextInt(3) - 1;
							}
							zz ++;
							ProcedureTreeLog.executeProcedure(xx, yy, zz, world, BlockBisoniaLog.block, EnumFacing.EAST);
						}
						ProcedureWorldGenBisonia.executeProcedure(world, new BlockPos(xx, yy + 1, zz), rand.nextInt(4) + 3);
						south = true;
						break;

					case 3:
						//West
						branchHeight = TrunkHeight - rand.nextInt(4);
						if (rand.nextInt(3) == 0) {
							break;
						}
						ll = rand.nextInt(4) + 2; //branch length
						yy = pos.getY() + branchHeight;
						xx = pos.getX();
						zz = pos.getZ();
						for (int length = 0; length <= ll; length++) {
							if (rand.nextInt(2) == 0) {
								yy ++;
							}
							if (rand.nextInt(4) == 0 && length >= 1) {
								zz = zz + rand.nextInt(3) - 1;
							}
							xx --;
							ProcedureTreeLog.executeProcedure(xx, yy, zz, world, BlockBisoniaLog.block, EnumFacing.UP);
						}
						ProcedureWorldGenBisonia.executeProcedure(world, new BlockPos(xx, yy + 1, zz), rand.nextInt(4) + 3);
						west = true;
						break;
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
				tooltip.add("Periods: Cretaceous - Paleogene - Neogene - Pleistocene");
			}
	        super.addInformation(stack, player, tooltip, advanced);
	    }
	}
}
