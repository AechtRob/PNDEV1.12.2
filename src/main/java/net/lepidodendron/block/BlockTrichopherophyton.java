
package net.lepidodendron.block;

import net.lepidodendron.ElementsLepidodendronMod;
import net.lepidodendron.LepidodendronConfig;
import net.lepidodendron.LepidodendronConfigPlants;
import net.lepidodendron.LepidodendronSorter;
import net.lepidodendron.block.base.IAdvancementGranter;
import net.lepidodendron.block.base.IPottable;
import net.lepidodendron.creativetab.TabLepidodendronPlants;
import net.lepidodendron.util.BlockSounds;
import net.lepidodendron.util.CustomTrigger;
import net.lepidodendron.util.ModTriggers;
import net.minecraft.block.Block;
import net.minecraft.block.BlockBush;
import net.minecraft.block.IGrowable;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.BlockFaceShape;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
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
import net.minecraft.util.SoundCategory;
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
public class BlockTrichopherophyton extends ElementsLepidodendronMod.ModElement {
	@GameRegistry.ObjectHolder("lepidodendron:trichopherophyton")
	public static final Block block = null;
	public BlockTrichopherophyton(ElementsLepidodendronMod instance) {
		super(instance, LepidodendronSorter.trichopherophyton);
	}

	@Override
	public void initElements() {
		elements.blocks.add(() -> new BlockCustom());
		elements.items.add(() -> new ItemBlock(block).setRegistryName(block.getRegistryName()));
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(block), 0,
				new ModelResourceLocation("lepidodendron:trichopherophyton", "inventory"));
	}

	@Override
	public void init(FMLInitializationEvent event) {
		super.init(event);
		OreDictionary.registerOre("plantdnaPNlepidodendron:trichopherophyton", BlockTrichopherophyton.block);
		OreDictionary.registerOre("plantPrehistoric", BlockTrichopherophyton.block);
		OreDictionary.registerOre("plant", BlockTrichopherophyton.block);
	}

	public static class BlockCustom extends BlockBush implements IGrowable, IAdvancementGranter, IPottable {
		public BlockCustom() {
			super(Material.PLANTS);
			setSoundType(SoundType.PLANT);
			setHardness(0F);
			setResistance(0F);
			setLightLevel(0F);
			setLightOpacity(0);
			setCreativeTab(TabLepidodendronPlants.tab);
			if (LepidodendronConfigPlants.spreadCooksonia && LepidodendronConfig.spreadPlantsAtAll) {
				setTickRandomly(true);
			}
			else {
				setTickRandomly(false);
			}
			setTranslationKey("pf_trichopherophyton");
			setRegistryName("trichopherophyton");
		}

		@Override
		public IBlockState getPotState() {
			return BlockTrichopherophytonSpore.block.getDefaultState();
		}

		@Nullable
		@Override
		public CustomTrigger getModTrigger() {
			return ModTriggers.CLICK_TRICHOPHEROPHYTON;
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
		public int getFlammability(IBlockAccess world, BlockPos pos, EnumFacing face) {
			return 100;
		}

		@Override
		public int getFireSpreadSpeed(IBlockAccess world, BlockPos pos, EnumFacing face) {
			return 60;
		}

		@SideOnly(Side.CLIENT)
		@Override
    	public BlockRenderLayer getRenderLayer()
    {
        return BlockRenderLayer.CUTOUT;
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
		public boolean isFullCube(IBlockState state) {
			return false;
		}

		@Override
		public AxisAlignedBB getBoundingBox(IBlockState state, IBlockAccess source, BlockPos pos) {
			return new AxisAlignedBB(0D, 0D, 0D, 1D, 0.7D, 1D);
		}

		@Override
		public boolean isOpaqueCube(IBlockState state) {
			return false;
		}

		@Override
		public boolean isReplaceable(IBlockAccess blockAccess, BlockPos pos) {
			return true;
		}

		@Override
		public ItemStack getPickBlock(IBlockState state, RayTraceResult target, World world, BlockPos pos, EntityPlayer player) {
			return new ItemStack(Item.getItemFromBlock(this), 1, this.damageDropped(state));
		}

		@Override
		public void getDrops(NonNullList<ItemStack> drops, IBlockAccess world, BlockPos pos, IBlockState state, int fortune) {
			if (LepidodendronConfig.doPropagation) {
				drops.add(new ItemStack(Blocks.AIR, (int) (1)));
			}
			else {
				drops.add(new ItemStack(this, (int) (1)));
			}
		}

		@Override
		protected boolean canSilkHarvest()
	    {
	        return false;
	    }

		@Override
		public boolean canPlaceBlockAt(World world, BlockPos pos) {
			if (!world.isAirBlock(pos)) {
				return false;
			}
			else return canSurviveAt(world, pos);
		}

		@Override
		public void neighborChanged(IBlockState state, World world, BlockPos pos, Block neighborBlock, BlockPos fromPos) {
			//super.neighborChanged(state, world, pos, neighborBlock, fromPos);
			{
		        if (!canSurviveAt(world, pos))
		        {
		            world.scheduleUpdate(pos, this, 1);
		        }
		    }
		}

		@Override
		public void updateTick(World world, BlockPos pos, IBlockState state, Random random) {
			//super.updateTick(world, pos, state, random);
	    	
	        if (!world.isRemote)
	        {
	            if (!world.isAreaLoaded(pos, 3)) return;
	            
				if (!canSurviveAt(world, pos))
		        {
		            world.destroyBlock(pos, false);
		        }
		        else {
		        	Random rand = new Random(); 
		        	int xx = rand.nextInt(3) - 1;
		        	int yy = rand.nextInt(3) - 1;
		        	int zz = rand.nextInt(3) - 1;
					//Try to spread:
					BlockPos targetBlock = pos.add(xx, yy, zz);
					double spread = (double) LepidodendronConfig.spreadPlants;
					if (spread < 1) {
						spread = 1;
					}
					if (spread > 100) {
						spread = 100;
					}
					if (Math.random() > (1-(spread/100)) && (targetBlock != pos) && (world.isAirBlock(targetBlock)) && (canSurviveAt(world, targetBlock))) {
						world.setBlockState(targetBlock, BlockTrichopherophyton.block.getDefaultState(), 3);	
					}
					//Perhaps the original plant also dies back now, but only if there another plant within 2 blocks (else TODO:he colony dies!):
					boolean YouAreNotAloneNooneIsAlone = false;
					int xct = -2;
					int yct;
					int zct;
					while ((xct <= 2) && (!YouAreNotAloneNooneIsAlone)) {
						yct = -1;
						while ((yct <= 2) && (!YouAreNotAloneNooneIsAlone)) {
							zct = -2;
							while ((zct <= 2) && (!YouAreNotAloneNooneIsAlone)) {
								if ((Math.pow((int) Math.abs(xct),2) + Math.pow((int) Math.abs(zct),2) <= Math.pow((int) 2,2)) && ((world.getBlockState(new BlockPos(pos.getX() + xct, pos.getY() + yct, pos.getZ() + zct))).getBlock() == this)) {
									if (!(xct == 0 && zct == 0 && yct == 0)) {YouAreNotAloneNooneIsAlone = true;}
								}
								zct = zct + 1;
							}
							yct = yct + 1;
						}
						xct = xct + 1;
					}
					if (YouAreNotAloneNooneIsAlone && Math.random() > 0.9) {
						if (Math.random() > 0.7) {
							//world.destroyBlock(pos, false);
							world.setBlockState(pos, Blocks.AIR.getDefaultState(), 3);
							world.playSound(null, pos, BlockSounds.DRY_CRUNCH_PLANTS, SoundCategory.BLOCKS, 1.0F, 1.0F);
						}
					}
					//Chance of spores:
		        	else {
		        		if ((Math.random() > 0.7)) {
							if ((Math.random() > 0.7)) {
								world.setBlockState(pos, BlockTrichopherophytonSpore.block.getDefaultState(), 3);
							}
			        	}
		        	}
				}
			}
		}

		@Override
		public void grow(World worldIn, Random rand, BlockPos pos, IBlockState state)
	    {
	    	updateTick(worldIn, pos, state, rand);
		}
		
		@Override
		public boolean canUseBonemeal(World worldIn, Random rand, BlockPos pos, IBlockState state)
	    {
	    	if (!LepidodendronConfigPlants.spreadCooksonia) {return true;}
	        return false;
	    }

		@Override
	    public boolean canGrow(World worldIn, BlockPos pos, IBlockState state, boolean isClient)
	    {
	        if (!LepidodendronConfigPlants.spreadCooksonia) {return true;}
	        return false;
	    }

		@Override
		public BlockFaceShape getBlockFaceShape(IBlockAccess world, IBlockState state, BlockPos pos, EnumFacing face) {
			return BlockFaceShape.UNDEFINED;
		}

		//@Override
		public boolean canSurviveAt(World worldIn, BlockPos pos) {

	    	if ((worldIn.getBlockState(pos.down()).getMaterial() != Material.GROUND) 
	    		&& (worldIn.getBlockState(pos.down()).getMaterial() != Material.GRASS)
	    		&& (worldIn.getBlockState(pos.down()).getBlock() != Blocks.GRAVEL.getDefaultState().getBlock()))
	    	{
	    		return false;
	    	}

			if (!(worldIn.getBlockState(pos.down()).getBlock().isFullCube(worldIn.getBlockState(pos.down()))))
			{
				return false;
			}

//	    	double getLight = worldIn.getLight(pos);
//	    	if (!worldIn.canSeeSky(pos) && (worldIn.isDaytime()) && (getLight < 7))
//	    	{
//	    		return false;
//	    	}
	    	
			int distH = (int) LepidodendronConfigPlants.waterCooksoniaHorizontal;
			if (distH < 1) distH = 1;
			if (distH > 16) distH = 16;
			int distV = (int) LepidodendronConfigPlants.waterCooksoniaVertical;
			if (distV < 1) distV = 1;
			if (distV > 6) distV = 6;
			boolean waterCriteria = false;
			int xct = -distH;
			int yct;
			int zct;
			while ((xct <= distH) && (!waterCriteria)) {
				yct = -distV;
				while ((yct <= 1) && (!waterCriteria)) {
					zct = -distH;
					while ((zct <= distH) && (!waterCriteria)) {
						if ((Math.pow((int) Math.abs(xct),2) + Math.pow((int) Math.abs(zct),2) <= Math.pow((int) distH,2)) && ((worldIn.getBlockState(new BlockPos(pos.getX() + xct, pos.getY() + yct, pos.getZ() + zct))).getMaterial() == Material.WATER)) {
							waterCriteria = true;
						}
						zct = zct + 1;
					}
					yct = yct + 1;
				}
				xct = xct + 1;
			}

	    	if (!waterCriteria) return false;

	    	return true;
	    	 
	    }

		@Override
		public EnumOffsetType getOffsetType() {
			return EnumOffsetType.XZ;
		}

		@SideOnly(Side.CLIENT)
		@Override
	    public void addInformation(ItemStack stack, World player, List<String> tooltip, ITooltipFlag advanced) {
	        if (LepidodendronConfig.showTooltips) {
				tooltip.add("Type: Proto-plant");
				tooltip.add("Periods: Early Devonian");
				tooltip.add("Note: Requires water proximity and spreads to surrounding gravel, grass and dirt");
				tooltip.add("Propagation: Spores");}
	        super.addInformation(stack, player, tooltip, advanced);
	    }

	}
}
