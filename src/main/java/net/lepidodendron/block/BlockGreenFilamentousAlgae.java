
package net.lepidodendron.block;

import net.lepidodendron.*;
import net.lepidodendron.item.ItemGreenFilamentousAlgaeItem;
import net.lepidodendron.util.*;
import net.lepidodendron.world.biome.carboniferous.BiomeCarboniferous;
import net.lepidodendron.world.biome.jurassic.BiomeJurassic;
import net.lepidodendron.world.biome.permian.BiomePermian;
import net.lepidodendron.world.biome.triassic.BiomeTriassic;
import net.lepidodendron.world.gen.FilamentousAlgaeGenerator;
import net.minecraft.block.Block;
import net.minecraft.block.BlockLilyPad;
import net.minecraft.block.IGrowable;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.BlockFaceShape;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.Entity;
import net.minecraft.entity.item.EntityBoat;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraft.util.BlockRenderLayer;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.NonNullList;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.IChunkGenerator;
import net.minecraftforge.common.BiomeDictionary;
import net.minecraftforge.common.EnumPlantType;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import javax.annotation.Nullable;
import java.util.List;
import java.util.Random;

@ElementsLepidodendronMod.ModElement.Tag
public class BlockGreenFilamentousAlgae extends ElementsLepidodendronMod.ModElement {
	@GameRegistry.ObjectHolder("lepidodendron:green_filamentous_algae")
	public static final Block block = null;
	public BlockGreenFilamentousAlgae(ElementsLepidodendronMod instance) {
		super(instance, LepidodendronSorter.green_filamentous_algae);
	}

	@Override
	public void initElements() {
		elements.blocks.add(() -> new BlockCustom());
		//elements.items.add(() -> new ItemBlock(block).setRegistryName(block.getRegistryName()));
	}

	@Override
	public void generateWorld(Random random, int chunkX, int chunkZ, World world, int dimID, IChunkGenerator cg, IChunkProvider cp) {

		boolean biomeCriteria = false;
		Biome biome = world.getBiome(new BlockPos(chunkX + 16, world.getSeaLevel(), chunkZ + 16));
		if (!matchBiome(biome, LepidodendronConfigPlants.genFilamentousAlgaeBlacklistBiomes)) {
			if (BiomeDictionary.hasType(biome, BiomeDictionary.Type.SWAMP))
				biomeCriteria = true;
			if (BiomeDictionary.hasType(biome, BiomeDictionary.Type.MUSHROOM))
				biomeCriteria = false;
			if (BiomeDictionary.hasType(biome, BiomeDictionary.Type.DEAD))
				biomeCriteria = false;
		}
		if (matchBiome(biome, LepidodendronConfigPlants.genFilamentousAlgaeOverrideBiomes))
			biomeCriteria = true;
		if ((dimID == LepidodendronConfig.dimCarboniferous)
			|| (dimID == LepidodendronConfig.dimDevonian)
			)
		{
			biomeCriteria = true;
		}
		if (biome instanceof BiomePermian)
		{
			BiomePermian biomePermian = (BiomePermian) biome;
			if (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:permian_lowlands_forest")
				|| biomePermian.getBiomeType() == EnumBiomeTypePermian.Wetlands
				|| biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:permian_lowlands_floodplain")) {
				biomeCriteria = true;
			}
			else {
				biomeCriteria = false;
			}
		}
		if (biome instanceof BiomeCarboniferous)
		{
			BiomeCarboniferous biomeCarb = (BiomeCarboniferous) biome;
			if (biomeCarb.getBiomeType() == EnumBiomeTypeCarboniferous.Ice) {
				biomeCriteria = false;
			}
		}
		if (biome instanceof BiomeTriassic)
		{
			BiomeTriassic biomeTriassic = (BiomeTriassic) biome;
			if (biomeTriassic.getBiomeType() == EnumBiomeTypeTriassic.Warm
				|| biomeTriassic.getBiomeType() == EnumBiomeTypeTriassic.Swamp) {
				biomeCriteria = true;
			}
			else {
				biomeCriteria = false;
			}
		}
		if (biome instanceof BiomeJurassic)
		{
			BiomeJurassic biomeJurassic = (BiomeJurassic) biome;
			if (biomeJurassic.getBiomeType() == EnumBiomeTypeJurassic.Floodplain
				|| biomeJurassic.getBiomeType() == EnumBiomeTypeJurassic.Forest
				|| biomeJurassic.getBiomeType() == EnumBiomeTypeJurassic.Mire
				|| biomeJurassic.getBiomeType() == EnumBiomeTypeJurassic.River) {
				biomeCriteria = true;
			}
			else {
				biomeCriteria = false;
			}
		}
		if (!biomeCriteria)
			return;

		int GenChance = 30;
		double GenMultiplier = LepidodendronConfigPlants.weightFilamentousAlgae;
		if (GenMultiplier < 0) {GenMultiplier = 0;}
		GenChance = Math.min(100, (int) Math.round((double) GenChance * GenMultiplier));
		//Is this a transformed biome?
		if (LepidodendronDecorationHandler.matchBiome(biome, LepidodendronConfigPlants.genTransformBiomes)) {
			//if (biome.getRegistryName().toString().substring(0, biome.getRegistryName().toString().indexOf(":")).equalsIgnoreCase("minecraft"))
			GenChance = Math.min(GenChance * 10, 100);
		}
		if (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:permian_lowlands_floodplain")) {
			GenChance = 156;
		}
		if (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:jurassic_floodplain_forested")) {
			GenChance = 92;
		}
		if (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:carboniferous_marsh")
				|| biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:devonian_brackish")) {
			GenChance = 156;
		}
		if (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:devonian_swamp")) {
			GenChance = 192;
		}
		if (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:jurassic_mire")
			|| biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:jurassic_mire_helper")
				|| biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:jurassic_mire_lakes")) {
			GenChance = 192;
		}

		for (int i = 0; i < (int) GenChance; i++) {
			int l6 = chunkX + random.nextInt(16) + 8;
			int i11 = random.nextInt(128);
			int l14 = chunkZ + random.nextInt(16) + 8;
			(new FilamentousAlgaeGenerator((Block) block)).generate(world, random, new BlockPos(l6, i11, l14));
		}
	}

	public static boolean matchBiome(Biome biome, String[] biomesList) {

		//String regName = biome.getRegistryName().toString();

		String[] var2 = biomesList;
		int var3 = biomesList.length;

		for(int var4 = 0; var4 < var3; ++var4) {
			String checkBiome = var2[var4];
			if (!checkBiome.contains(":")) {
				//System.err.println("modid test: " + biome.getRegistryName().toString().substring(0, biome.getRegistryName().toString().indexOf(":") - 1));
				if (checkBiome.equalsIgnoreCase(
						biome.getRegistryName().toString().substring(0, biome.getRegistryName().toString().indexOf(":"))
				)) {
					return true;
				}
			}
			if (checkBiome.equalsIgnoreCase(biome.getRegistryName().toString())) {
				return true;
			}
		}

		return false;
	}


	public static class BlockCustom extends BlockLilyPad implements IGrowable, net.minecraftforge.common.IShearable  {
		public BlockCustom() {
			//super(Material.PLANTS);
			setSoundType(SoundType.PLANT);
			setHardness(0F);
			setResistance(0F);
			setLightLevel(0F);
			setLightOpacity(0);
			setCreativeTab(null);
			if (LepidodendronConfigPlants.spreadFilamentousAlgae) {
				setTickRandomly(true);
			}
			else {
				setTickRandomly(false);
			}
			setTranslationKey("pf_green_filamentous_algae");
			setRegistryName("green_filamentous_algae");
		}

		@Override
		public void onEntityCollision(World worldIn, BlockPos pos, IBlockState state, Entity entityIn) {
			//super.onEntityCollision(worldIn, pos, state, entityIn);

			if (entityIn instanceof EntityBoat)
			{
				worldIn.setBlockState(pos, Blocks.AIR.getDefaultState(), 3);
				EntityItem entityToSpawn = new EntityItem(worldIn, pos.getX(), pos.getY(), pos.getZ(), new ItemStack(ItemGreenFilamentousAlgaeItem.block, (int) (1)));
				entityToSpawn.setPickupDelay(10);
				worldIn.spawnEntity(entityToSpawn);
				worldIn.playSound(null, pos, SoundType.PLANT.getBreakSound(), SoundCategory.BLOCKS, 1.0F, 1.0F);
			}
			else {
				super.onEntityCollision(worldIn, pos, state, entityIn);
			}
		}

		@Override public boolean isShearable(ItemStack item, IBlockAccess world, BlockPos pos){ return true; }
		
		@Override
		public NonNullList<ItemStack> onSheared(ItemStack item, IBlockAccess world, BlockPos pos, int fortune) {
			return NonNullList.withSize(1, new ItemStack(ItemGreenFilamentousAlgaeItem.block, (int) (1)));
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
			return new AxisAlignedBB(0D, 0D, 0D, 1D, 0.2D, 1D);
		}

		@Override
		public void addCollisionBoxToList(IBlockState state, World worldIn, BlockPos pos, AxisAlignedBB entityBox, List<AxisAlignedBB> collidingBoxes, @Nullable Entity entityIn, boolean isActualState)
	    {}

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
			return new ItemStack(ItemGreenFilamentousAlgaeItem.block, (int) (1));
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
	            
				if (!this.canBlockStay(world, pos, state))
		        {
		            world.destroyBlock(pos, false);
		        }
		        else {
		        	Random rand = new Random(); 
		        	int xx = rand.nextInt(3) - 1;
		        	int zz = rand.nextInt(3) - 1;
					//Try to spread:
					BlockPos targetBlock = pos.add(xx, 0, zz);
					double spread = (double) LepidodendronConfig.spreadPlants;
					if (spread < 1) {
						spread = 1;
					}
					if (spread > 100) {
						spread = 100;
					}
					if (Math.random() > 0.3) {spread = 1;} //lower the chance
					//System.err.println("TEST: " + spread + " = " + (1-(spread/100)));
					if (Math.random() > (1-(spread/100)) && (targetBlock != pos) && (world.isAirBlock(targetBlock)) && (canSurviveAt(world, targetBlock))) {
						world.setBlockState(targetBlock, BlockGreenFilamentousAlgae.block.getDefaultState(), 3);
					}
					//Perhaps the original plant also dies back now, but only if there another plant within 2 blocks (else the colony dies!):
					boolean YouAreNotAloneNooneIsAlone = false;
					int xct = -2;
					int zct;
					while ((xct <= 2) && (!YouAreNotAloneNooneIsAlone)) {
						zct = -2;
						while ((zct <= 2) && (!YouAreNotAloneNooneIsAlone)) {
							if ((Math.pow((int) Math.abs(xct),2) + Math.pow((int) Math.abs(zct),2) <= Math.pow((int) 2,2)) && ((world.getBlockState(new BlockPos(pos.getX() + xct, pos.getY(), pos.getZ() + zct))).getBlock() == this)) {
								if (!(xct == 0 && zct == 0)) {YouAreNotAloneNooneIsAlone = true;}
							}
							zct = zct + 1;
						}
						xct = xct + 1;
					}
					if (YouAreNotAloneNooneIsAlone && Math.random() > 0.8) {
						if (Math.random() > 0.7) {
							//world.destroyBlock(pos, false);
							world.setBlockState(pos, Blocks.AIR.getDefaultState(), 3);
							world.playSound(null, pos, BlockSounds.WET_CRUNCH_PLANTS, SoundCategory.BLOCKS, 1.0F, 1.0F);
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
	    	if (!LepidodendronConfigPlants.spreadFilamentousAlgae) {return true;}
	        return false;
	    }

		@Override
	    public boolean canGrow(World worldIn, BlockPos pos, IBlockState state, boolean isClient)
	    {
	        if (!LepidodendronConfigPlants.spreadFilamentousAlgae) {return true;}
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

		//@Override
		public boolean canSurviveAt(World worldIn, BlockPos pos) {
			if (worldIn.getBlockState(pos.down()).getMaterial() != Material.WATER && worldIn.getBlockState(pos.down()).getMaterial() != Material.ICE) 
	    	{
	    		return false;
	    	}

	    	//double getLight = worldIn.getLight(pos);
	    	//if (!worldIn.canSeeSky(pos) && (worldIn.isDaytime()) && (getLight < 7))
	    	//{
	    	//	return false;
	    	//}

			if (worldIn.getBlockState(pos.down(3)).getMaterial() == Material.WATER)
			{
				return false;
			}

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

	}
}
