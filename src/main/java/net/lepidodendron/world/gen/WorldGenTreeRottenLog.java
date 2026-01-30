package net.lepidodendron.world.gen;

import net.lepidodendron.block.BlockRottenLog;
import net.lepidodendron.util.Functions;
import net.lepidodendron.util.patchouli.SpawnLocations;
import net.minecraft.block.Block;
import net.minecraft.block.BlockDirectional;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.PropertyDirection;
import net.minecraft.block.state.IBlockState;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.feature.WorldGenerator;

import java.util.ArrayList;
import java.util.Random;

public class WorldGenTreeRottenLog extends WorldGenerator
{
    private final Block block;

    public WorldGenTreeRottenLog()
    {
        super(false);
        this.block = BlockRottenLog.block;
    }

	public static final PropertyDirection FACING = BlockDirectional.FACING;
		
    public boolean generate(World worldIn, Random rand, BlockPos position)
    {
    	boolean flag = false;
    	BlockPos blockpos = position;

		Material material = worldIn.getBlockState(blockpos.down()).getMaterial();

		if (worldIn.getBiome(blockpos).getRegistryName().toString().equalsIgnoreCase("lepidodendron:triassic_flooded_forest") && blockpos.getY() > 72) {
			return false;
		}

        if (worldIn.isAirBlock(blockpos) && (!worldIn.provider.isNether() || blockpos.getY() < 254)
        && (material == Material.GROUND || material == Material.GRASS || material == Material.SAND || material == Material.ROCK))
        {
			if (Math.random() > 0.8) { //Standing log
				Functions.setBlockStateAndCheckForDoublePlant(worldIn,blockpos, this.block.getDefaultState().withProperty(FACING, EnumFacing.NORTH), 4);
				PlaceEggs(rand, worldIn, blockpos);
				Functions.setBlockStateAndCheckForDoublePlant(worldIn,blockpos.up(), this.block.getDefaultState().withProperty(FACING, EnumFacing.NORTH), 4);
				worldIn.setBlockToAir(blockpos.up(2));
				if (Math.random() > 0.5) {
					Functions.setBlockStateAndCheckForDoublePlant(worldIn,blockpos.up(2), this.block.getDefaultState().withProperty(FACING, EnumFacing.NORTH), 4);
					worldIn.setBlockToAir(blockpos.up(3));
					if (Math.random() > 0.5) {
						Functions.setBlockStateAndCheckForDoublePlant(worldIn,blockpos.up().east(), this.block.getDefaultState().withProperty(FACING, EnumFacing.UP), 4);
						worldIn.setBlockToAir(blockpos.up(2).east());
						PlaceEggs(rand, worldIn, blockpos.up().east());
					}
					if (Math.random() > 0.6) {
						Functions.setBlockStateAndCheckForDoublePlant(worldIn,blockpos.up(3), this.block.getDefaultState().withProperty(FACING, EnumFacing.NORTH), 4);
						worldIn.setBlockToAir(blockpos.up(4));
					}
				}
			}
				else {
				int direction = rand.nextInt(2);
				if (direction == 1) {
					//North-South
					Functions.setBlockStateAndCheckForDoublePlant(worldIn,blockpos, this.block.getDefaultState().withProperty(FACING, EnumFacing.EAST), 4);
					PlaceEggs(rand, worldIn, blockpos);
					worldIn.setBlockToAir(blockpos.up());
					Functions.setBlockStateAndCheckForDoublePlant(worldIn,blockpos.north(), this.block.getDefaultState().withProperty(FACING, EnumFacing.EAST), 4);
					worldIn.setBlockToAir(blockpos.up().north());
					PlaceEggs(rand, worldIn, blockpos.north());
					if (Math.random() > 0.5 && !worldIn.isAirBlock(blockpos.down().north(2)) ) {
						Functions.setBlockStateAndCheckForDoublePlant(worldIn,blockpos.north(2), this.block.getDefaultState().withProperty(FACING, EnumFacing.EAST), 4);
						worldIn.setBlockToAir(blockpos.up().north(2));
						PlaceEggs(rand, worldIn, blockpos.north(2));
						if (Math.random() > 0.5) {
							Functions.setBlockStateAndCheckForDoublePlant(worldIn,blockpos.north().up(), this.block.getDefaultState().withProperty(FACING, EnumFacing.NORTH), 4);
							worldIn.setBlockToAir(blockpos.up(2).north());
							PlaceEggs(rand, worldIn, blockpos.north().up());
						}
						if (Math.random() > 0.6 && !worldIn.isAirBlock(blockpos.down().north(3)) ) {
							Functions.setBlockStateAndCheckForDoublePlant(worldIn,blockpos.north(3), this.block.getDefaultState().withProperty(FACING, EnumFacing.EAST), 4);
							worldIn.setBlockToAir(blockpos.up().north(3));
							PlaceEggs(rand, worldIn, blockpos.north(3));
						}
					}
				}
				else {
					//East-West
					Functions.setBlockStateAndCheckForDoublePlant(worldIn,blockpos, this.block.getDefaultState().withProperty(FACING, EnumFacing.UP), 4);
					worldIn.setBlockToAir(blockpos.up());
					PlaceEggs(rand, worldIn, blockpos);
					Functions.setBlockStateAndCheckForDoublePlant(worldIn,blockpos.east(), this.block.getDefaultState().withProperty(FACING, EnumFacing.UP), 4);
					worldIn.setBlockToAir(blockpos.up().east());
					PlaceEggs(rand, worldIn, blockpos.east());
					if (Math.random() > 0.5 && !worldIn.isAirBlock(blockpos.down().east(2))) {
						Functions.setBlockStateAndCheckForDoublePlant(worldIn,blockpos.east(2), this.block.getDefaultState().withProperty(FACING, EnumFacing.UP), 4);
						worldIn.setBlockToAir(blockpos.up().east(2));
						PlaceEggs(rand, worldIn, blockpos.east(2));
						if (Math.random() > 0.5) {
							Functions.setBlockStateAndCheckForDoublePlant(worldIn,blockpos.east().up(), this.block.getDefaultState().withProperty(FACING, EnumFacing.NORTH), 4);
							worldIn.setBlockToAir(blockpos.up(2).east());
							PlaceEggs(rand, worldIn, blockpos.east().up());
						}
						if (Math.random() > 0.6 && !worldIn.isAirBlock(blockpos.down().east(3)) ) {
							Functions.setBlockStateAndCheckForDoublePlant(worldIn,blockpos.east(3), this.block.getDefaultState().withProperty(FACING, EnumFacing.UP), 4);
							worldIn.setBlockToAir(blockpos.up().east(3));
							PlaceEggs(rand, worldIn, blockpos.east(3));
						}
					}
					
				}
			}
			
            flag = true;
        }
            
        return flag;
    }

    public void PlaceEggs(Random rand, World worldIn, BlockPos pos) {
    	if (Math.random() > 0.90) {
			Biome biome = worldIn.getBiome(pos);
    		String stringEgg = "";

			String[] mobString = new String[]{
				"lepidodendron:prehistoric_flora_casineria",
				"lepidodendron:prehistoric_flora_celtedens",
				"lepidodendron:prehistoric_flora_hylonomus",
				"lepidodendron:prehistoric_flora_hypuronector",
				"lepidodendron:prehistoric_flora_labidosaurus",
				"lepidodendron:prehistoric_flora_longisquama",
				"lepidodendron:prehistoric_flora_weigeltisaurus",
				"lepidodendron:prehistoric_flora_archaboilus",
				"lepidodendron:prehistoric_flora_archaeothyris",
				"lepidodendron:prehistoric_flora_archocyrtus",
				"lepidodendron:prehistoric_flora_arthropleura",
				"lepidodendron:prehistoric_flora_attercopus",
				"lepidodendron:prehistoric_flora_daohugoucossus",
				"lepidodendron:prehistoric_flora_gerarus",
				"lepidodendron:prehistoric_flora_harvestman",
				"lepidodendron:prehistoric_flora_myriacantherpestes",
				"lepidodendron:prehistoric_flora_myriapod@eoarthropleura",
				"lepidodendron:prehistoric_flora_myriapod@pneumodesmus",
				"lepidodendron:prehistoric_flora_palaeontinid",
				"lepidodendron:prehistoric_flora_pycnophlebia",
				"lepidodendron:prehistoric_flora_titanoptera_nymph@clatrotitan",
				"lepidodendron:prehistoric_flora_titanoptera_nymph@gigatitan",
				"lepidodendron:prehistoric_flora_titanoptera_nymph@mesotitan",
				"lepidodendron:prehistoric_flora_trigonotarbid_cryptomartus",
				"lepidodendron:prehistoric_flora_trigonotarbid_eophrynus",
				"lepidodendron:prehistoric_flora_trigonotarbid_kreischeria",
				"lepidodendron:prehistoric_flora_trigonotarbid_palaeocharinus",
				"lepidodendron:prehistoric_flora_trigonotarbid_palaeotarbus",
				"lepidodendron:prehistoric_flora_trigonotarbid_permotarbus",
				"lepidodendron:prehistoric_flora_trigonotarbid_gondwanarachne",
                "lepidodendron:prehistoric_flora_permarachne",
                "lepidodendron:prehistoric_flora_myriapod@latzelia",
                "lepidodendron:prehistoric_flora_myriapod@crussolum",
                "lepidodendron:prehistoric_flora_myriapod@devonobius",
                "lepidodendron:prehistoric_flora_myriapod@fulmenocursor",
                "lepidodendron:prehistoric_flora_myriapod@velocipede",
                "lepidodendron:prehistoric_flora_myriapod@polydesmid",
                "lepidodendron:prehistoric_flora_myriapod@juliform",
                "lepidodendron:prehistoric_flora_santanmantis",
                "lepidodendron:prehistoric_flora_mecistotrachelos",
                "lepidodendron:prehistoric_flora_scorpionfly",
                "lepidodendron:prehistoric_flora_hangingfly",
                "lepidodendron:prehistoric_flora_fortiholcorpa",
                "lepidodendron:prehistoric_flora_juracimbrophlebia",
                "lepidodendron:prehistoric_flora_cretosaja",
					"lepidodendron:prehistoric_flora_plesioblattogryllus",
			};

			ArrayList<String> mobStringValid = new ArrayList<String>();
			for (String mob : mobString) {
				String spawnMob = mob;
				if (spawnMob.equalsIgnoreCase("lepidodendron:prehistoric_flora_aquaticnymph@stonefly")) {
					spawnMob = "lepidodendron:prehistoric_flora_stonefly";
				}
				else if (spawnMob.equalsIgnoreCase("lepidodendron:prehistoric_flora_aquaticnymph@mayfly")) {
					spawnMob = "lepidodendron:prehistoric_flora_mayfly";
				}
				else if (spawnMob.equalsIgnoreCase("lepidodendron:prehistoric_flora_aquaticnymph@velisoptera")) {
					spawnMob = "lepidodendron:prehistoric_flora_velisoptera";
				}
				else if (spawnMob.equalsIgnoreCase("lepidodendron:prehistoric_flora_aquaticnymph@argentinala")) {
					spawnMob = "lepidodendron:prehistoric_flora_argentinala";
				}
				else if (spawnMob.equalsIgnoreCase("lepidodendron:prehistoric_flora_aquaticnymph@damselfly")) {
					spawnMob = "lepidodendron:prehistoric_flora_damselfly";
				}
				else if (spawnMob.equalsIgnoreCase("lepidodendron:prehistoric_flora_tadpole@cratopipa")) {
					spawnMob = "lepidodendron:prehistoric_flora_cratopipa";
				}
				else if (spawnMob.equalsIgnoreCase("lepidodendron:prehistoric_flora_tadpole@prosalirus")) {
					spawnMob = "lepidodendron:prehistoric_flora_prosalirus";
				}
				else if (spawnMob.equalsIgnoreCase("lepidodendron:prehistoric_flora_tadpole@notobatrachus")) {
					spawnMob = "lepidodendron:prehistoric_flora_notobatrachus";
				}
				else if (spawnMob.equalsIgnoreCase("lepidodendron:prehistoric_flora_tadpole@rhadinosteus")) {
					spawnMob = "lepidodendron:prehistoric_flora_rhadinosteus";
				}
				else if (spawnMob.equalsIgnoreCase("lepidodendron:prehistoric_flora_tadpole@hygobatrachus")) {
					spawnMob = "lepidodendron:prehistoric_flora_hygobatrachus";
				}
				else if (spawnMob.equalsIgnoreCase("lepidodendron:prehistoric_flora_tadpole@kururubatrachus")) {
					spawnMob = "lepidodendron:prehistoric_flora_kururubatrachus";
				}
				else if (spawnMob.equalsIgnoreCase("lepidodendron:prehistoric_flora_tadpole@genibatrachus")) {
					spawnMob = "lepidodendron:prehistoric_flora_kururubatrachus";
				}
				else if (spawnMob.indexOf("_nymph") >= 1) {
					spawnMob = spawnMob.replace("_nymph", "");
				}
				else if (mob.contains("lepidodendron:prehistoric_flora_dragonfly")) {
					spawnMob = "lepidodendron:prehistoric_flora_dragonfly";
				}
				if (SpawnLocations.spawnsHere(spawnMob, biome.getRegistryName().toString())) {
					mobStringValid.add(mob);
				}
			}

			if (mobStringValid.isEmpty()) {
				return;
			}
			else {
				stringEgg = mobStringValid.get(worldIn.rand.nextInt(mobStringValid.size()));
			}

			TileEntity te = worldIn.getTileEntity(pos);
			if (te != null && !stringEgg.equalsIgnoreCase("")) {
				te.getTileData().setString("creature", stringEgg);
			}
			IBlockState state = worldIn.getBlockState(pos);
			worldIn.notifyBlockUpdate(pos, state, state, 3);
			//System.err.println("Eggs placed: " + pos.getX() + " " + pos.getY() + " " + pos.getZ());
		}
	}
}

