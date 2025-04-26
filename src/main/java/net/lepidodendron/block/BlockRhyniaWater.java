
package net.lepidodendron.block;

import net.lepidodendron.ElementsLepidodendronMod;
import net.lepidodendron.LepidodendronConfig;
import net.lepidodendron.LepidodendronConfigPlants;
import net.lepidodendron.LepidodendronSorter;
import net.lepidodendron.block.base.IAdvancementGranter;
import net.lepidodendron.item.ItemRhyniaItem;
import net.lepidodendron.util.BlockSounds;
import net.lepidodendron.util.CustomTrigger;
import net.lepidodendron.util.ModTriggers;
import net.minecraft.block.*;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.BlockFaceShape;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.Entity;
import net.minecraft.entity.item.EntityBoat;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
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
import net.minecraftforge.common.EnumPlantType;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import javax.annotation.Nullable;
import java.util.List;
import java.util.Random;

@ElementsLepidodendronMod.ModElement.Tag
public class BlockRhyniaWater extends ElementsLepidodendronMod.ModElement {
	@GameRegistry.ObjectHolder("lepidodendron:rhynia_water")
	public static final Block block = null;
	public BlockRhyniaWater(ElementsLepidodendronMod instance) {
		super(instance, LepidodendronSorter.rhynia_water);
	}

	@Override
	public void initElements() {
		elements.blocks.add(() -> new BlockCustom());
		//elements.items.add(() -> new ItemBlock(block).setRegistryName(block.getRegistryName()));
	}

	//@SideOnly(Side.CLIENT)
	//@Override
	//public void registerModels(ModelRegistryEvent event) {
	//	ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(block), 0,
	//			new ModelResourceLocation("lepidodendron:archaefructus", "inventory"));
	//}

	@Override
	public void init(FMLInitializationEvent event) {
		GameRegistry.registerTileEntity(BlockRhyniaWater.TileEntityRhyniaWater.class, "lepidodendron:tileentityrhynia_water");
	}

	public static class BlockCustom extends BlockLilyPad implements ITileEntityProvider, IGrowable, net.minecraftforge.common.IShearable, IAdvancementGranter {
		public BlockCustom() {
			//super(Material.PLANTS);
			setSoundType(SoundType.PLANT);
			setHardness(0F);
			setResistance(0F);
			setLightLevel(0F);
			setLightOpacity(0);
			setCreativeTab(null);
			if (LepidodendronConfigPlants.spreadRhynia && LepidodendronConfig.spreadPlantsAtAll) {
				setTickRandomly(true);
			}
			else {
				setTickRandomly(false);
			}
			setTranslationKey("pf_rhynia_water");
			setRegistryName("rhynia_water");
		}

		@Nullable
		@Override
		public CustomTrigger getModTrigger() {
			return ModTriggers.CLICK_RHYNIA;
		}

		@Override
		public void onEntityCollision(World worldIn, BlockPos pos, IBlockState state, Entity entityIn) {
			//super.onEntityCollision(worldIn, pos, state, entityIn);

			if (entityIn instanceof EntityBoat)
			{
				worldIn.setBlockState(pos, Blocks.AIR.getDefaultState(), 3);
				if (!LepidodendronConfig.doPropagation) {
					EntityItem entityToSpawn = new EntityItem(worldIn, pos.getX(), pos.getY(), pos.getZ(), new ItemStack(ItemRhyniaItem.block, (int) (1)));
					entityToSpawn.setPickupDelay(10);
					worldIn.spawnEntity(entityToSpawn);
				}
				worldIn.playSound(null, pos, SoundType.PLANT.getBreakSound(), SoundCategory.BLOCKS, 1.0F, 1.0F);
			}
			else {
				super.onEntityCollision(worldIn, pos, state, entityIn);
			}
		}

		@Override
		public void harvestBlock(World worldIn, EntityPlayer player, BlockPos pos, IBlockState state, @Nullable TileEntity te, ItemStack stack) {
			if (stack.getItem() == Items.SHEARS && LepidodendronConfig.doPropagation
					&&
					(worldIn.getBlockState(pos.down()).getMaterial() == Material.WATER
					)
			) {
				EntityItem entityToSpawn = new EntityItem(worldIn, pos.getX(), pos.getY(), pos.getZ(), new ItemStack(ItemRhyniaItem.block, (int) (1)));
				entityToSpawn.setPickupDelay(10);
				worldIn.spawnEntity(entityToSpawn);
			}
			else {
				super.harvestBlock(worldIn, player, pos, state, te, stack);
			}
		}
		
		@Override public boolean isShearable(ItemStack item, IBlockAccess world, BlockPos pos){ return true; }
		
		@Override
		public NonNullList<ItemStack> onSheared(ItemStack item, IBlockAccess world, BlockPos pos, int fortune) {
			return NonNullList.withSize(1, new ItemStack(ItemRhyniaItem.block, (int) (1)));
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
		public boolean isPassable(IBlockAccess worldIn, BlockPos pos) {
			return true;
		}

		@Override
		public boolean isFullCube(IBlockState state) {
			return false;
		}

		@Override
		public AxisAlignedBB getBoundingBox(IBlockState state, IBlockAccess source, BlockPos pos) {
			return new AxisAlignedBB(0D, -0.5D, 0D, 1D, 0.5D, 1D);
		}

		protected static final AxisAlignedBB HALFBLOCK = new AxisAlignedBB(0.0D, -1.0D, 0.0D, 1.0D, -0.5D, 1.0D);

		@Override
		public void addCollisionBoxToList(IBlockState state, World worldIn, BlockPos pos, AxisAlignedBB entityBox, List<AxisAlignedBB> collidingBoxes, @Nullable Entity entityIn, boolean isActualState) {
			addCollisionBoxToList(pos, entityBox, collidingBoxes, HALFBLOCK);
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
			return new ItemStack(ItemRhyniaItem.block, (int) (1));
		}

		@Override
		public void getDrops(NonNullList<ItemStack> drops, IBlockAccess world, BlockPos pos, IBlockState state, int fortune) {
			if (LepidodendronConfig.doPropagation) {
				drops.add(new ItemStack(Blocks.AIR, (int) (1)));
			}
			else {
				drops.add(new ItemStack(ItemRhyniaItem.block, (int) (1)));
			}
		}

		@Override
		protected boolean canSilkHarvest()
	    {
	        return false;
	    }

		@Override
		public void neighborChanged(IBlockState state, World world, BlockPos pos, Block neighborBlock, BlockPos fromPos) {
			//super.neighborChanged(state, world, pos, neighborBlock, fromPos);
			{
		        if (!this.canBlockStay(world, pos, state))
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
	            
				if (!this.canSurviveAt(world, pos))
		        {
		            world.destroyBlock(pos, false);
		        }
		        else {
		        	Random rand = new Random(); 
		        	int xx = (rand.nextInt(3) - 1) * 2;
		        	int zz = (rand.nextInt(3) - 1) * 2;
					//Try to spread:
					BlockPos targetBlock = pos.add(xx, 0, zz);
					double spread = (double) LepidodendronConfig.spreadPlants;
					if (spread < 1) {
						spread = 1;
					}
					if (spread > 100) {
						spread = 100;
					}
					if (Math.random() > 0.5) {spread = 1;} //lower the chance
					if (canSurviveAt(world, targetBlock)) {
						if (Math.random() > (1-(spread/100)) && (targetBlock != pos) && (world.isAirBlock(targetBlock))) {
							world.setBlockState(targetBlock, BlockRhyniaWater.block.getDefaultState(), 3);
						}
					}
					else if (BlockRhyniaLand.BlockCustom.canSurviveAt(world, targetBlock)) {
						if (Math.random() > (1-(spread/100)) && (targetBlock != pos) && (world.isAirBlock(targetBlock))) {
							world.setBlockState(targetBlock, BlockRhyniaLand.block.getDefaultState(), 3);
						}
					}
					
					//Perhaps the original plant also dies back now, but only if there another plant within 2 blocks (else the colony dies!):
					boolean YouAreNotAloneNooneIsAlone = false;
					int xct = -3;
					int zct;
					while ((xct <= 3) && (!YouAreNotAloneNooneIsAlone)) {
						zct = -3;
						while ((zct <= 3) && (!YouAreNotAloneNooneIsAlone)) {
							if ((Math.pow((int) Math.abs(xct),2) + Math.pow((int) Math.abs(zct),2) <= Math.pow((int) 3,2)) && ((world.getBlockState(new BlockPos(pos.getX() + xct, pos.getY(), pos.getZ() + zct))).getBlock() == this)) {
								if (!(xct == 0 && zct == 0)) {YouAreNotAloneNooneIsAlone = true;}
							}
							zct = zct + 1;
						}
						xct = xct + 1;
					}
					//System.err.println("YouAreNotAloneNooneIsAlone: " + YouAreNotAloneNooneIsAlone);
					if (YouAreNotAloneNooneIsAlone && Math.random() > 0.9) {
						if (Math.random() > 0.7) {
							//world.destroyBlock(pos, false);
							world.setBlockState(pos, Blocks.AIR.getDefaultState(), 3);
							world.playSound(null, pos, BlockSounds.WET_CRUNCH_PLANTS, SoundCategory.BLOCKS, 1.0F, 1.0F);
						}
					}
					else {
						if ((Math.random() > 0.7)) {
							if ((Math.random() > 0.7)) {
								world.setBlockState(pos, BlockRhyniaWaterSpore.block.getDefaultState(), 3);
							}
						}
					}
				}
			}
		}

		@Override
		public BlockFaceShape getBlockFaceShape(IBlockAccess world, IBlockState state, BlockPos pos, EnumFacing face) {
			return BlockFaceShape.UNDEFINED;
		}
		
		@Override
		public void grow(World worldIn, Random rand, BlockPos pos, IBlockState state)
	    {
	    	this.updateTick(worldIn, pos, state, rand);
		}
		
		@Override
		public boolean canUseBonemeal(World worldIn, Random rand, BlockPos pos, IBlockState state)
	    {
	    	if (!LepidodendronConfigPlants.spreadRhynia) {return true;}
	        return false;
	    }

		@Override
	    public boolean canGrow(World worldIn, BlockPos pos, IBlockState state, boolean isClient)
	    {
	        if (!LepidodendronConfigPlants.spreadRhynia) {return true;}
	        return false;
	    }
	    
		@Override
		public boolean canBlockStay(World worldIn, BlockPos pos, IBlockState state)
	    {
	        if (pos.getY() >= 0 && pos.getY() < 256)
	        {
	            IBlockState iblockstate = worldIn.getBlockState(pos.down());
	            Material material = iblockstate.getMaterial();
	            return canSurviveAt(worldIn, pos) && (material == Material.WATER
						//&& ((Integer)iblockstate.getValue(BlockLiquid.LEVEL)).intValue() == 0
						|| material == Material.ICE);
	        }
	        else
	        {
	            return false;
	        }
	    }

		@Override
		public boolean canPlaceBlockAt(World world, BlockPos pos) {
			if (!world.isAirBlock(pos)) {
				return false;
			}
			else return canSurviveAt(world, pos);
		}

		//@Override
		public static boolean canSurviveAt(World worldIn, BlockPos pos) {
			if (worldIn.getBlockState(pos.down()).getMaterial() != Material.WATER && worldIn.getBlockState(pos.down()).getMaterial() != Material.ICE) 
	    	{
	    		return false;
	    	}
	    	if ((worldIn.getBlockState(pos.down(2)).getMaterial() != Material.GROUND) 
	    		&& (worldIn.getBlockState(pos.down(2)).getMaterial() != Material.CLAY)
	    		&& (worldIn.getBlockState(pos.down(2)).getMaterial() != Material.GRASS)
	    		&& (worldIn.getBlockState(pos.down(2)).getMaterial() != Material.SAND))
	    	{
	    		return false;
	    	}

//	    	double getLight = worldIn.getLight(pos);
//	    	if (!worldIn.canSeeSky(pos) && (worldIn.isDaytime()) && (getLight < 7))
//	    	{
//	    		return false;
//	    	}

	    	return true;
	    	 
	    }
		
		@Override
	    public EnumPlantType getPlantType(IBlockAccess world, BlockPos pos)
	    {
	        return EnumPlantType.Water;
	    }

	    @Override
	    protected boolean canSustainBush(IBlockState state)
	    {
	        return state.getBlock() == Blocks.WATER || state.getMaterial() == Material.ICE;
	    }

		@Override
	    public EnumOffsetType getOffsetType()
	    {
	        return EnumOffsetType.XZ;
	    }

		@Override
		public TileEntity createNewTileEntity(World worldIn, int meta) {
			return new BlockRhyniaWater.TileEntityRhyniaWater();
		}

		@Override
		public boolean eventReceived(IBlockState state, World worldIn, BlockPos pos, int eventID, int eventParam) {
			super.eventReceived(state, worldIn, pos, eventID, eventParam);
			TileEntity tileentity = worldIn.getTileEntity(pos);
			return tileentity == null ? false : tileentity.receiveClientEvent(eventID, eventParam);
		}

		@Override
		public void breakBlock(World world, BlockPos pos, IBlockState state) {
			TileEntity tileentity = world.getTileEntity(pos);
			//if (tileentity instanceof TileEntityNest)
			//InventoryHelper.dropInventoryItems(world, pos, (TileEntityNest) tileentity);
			world.removeTileEntity(pos);
			super.breakBlock(world, pos, state);
		}
	}

	public static class TileEntityRhyniaWater extends TileEntity {

		@Override
		public AxisAlignedBB getRenderBoundingBox() {
			return new AxisAlignedBB(pos, pos.add(1, -2, 1));
		}

	}
}
