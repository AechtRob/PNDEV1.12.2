package net.lepidodendron.world.gen;

import net.lepidodendron.block.BlockNest;
import net.lepidodendron.entity.EntityPrehistoricFloraDorygnathus;
import net.lepidodendron.entity.base.EntityPrehistoricFloraAgeableBase;
import net.lepidodendron.util.Functions;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityList;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.gen.feature.WorldGenerator;

import java.util.Random;

public class WorldGenRockPiles extends WorldGenerator
{
    //private final Block block;
    private final int startRadius;

    public WorldGenRockPiles()
    {
        super(false);
        //this.block = blockIn;
        this.startRadius = (int) Math.round(Math.random() * 2);
    }

    public boolean generate(World worldIn, Random rand, BlockPos position) {
        return generate(worldIn, rand, position, false);
    }

    public boolean generate(World worldIn, Random rand, BlockPos position, boolean mossy)
    {
        while (true)
        {
            label50:
            {
                if (position.getY() > 3)
                {
                    if (worldIn.isAirBlock(position.down()))
                    {
                        break label50;
                    }

                    Material material = worldIn.getBlockState(position.down()).getMaterial();

                    if (material != Material.GRASS && material != Material.ROCK
                    	&& material != Material.GROUND && material != Material.SAND)
                    {
                        break label50;
                    }
                }

                if (position.getY() <= 3)
                {
                    return false;
                }

                if (position.getY() <= 109
                    && (worldIn.getBiome(position).getRegistryName().toString().equalsIgnoreCase("lepidodendron:triassic_desert_plateau")
                    || worldIn.getBiome(position).getRegistryName().toString().equalsIgnoreCase("lepidodendron:triassic_desert_plateau_broken")
                    || worldIn.getBiome(position).getRegistryName().toString().equalsIgnoreCase("lepidodendron:triassic_desert_plateau_canyons")
                    )
                )
                {
                    return false;
                }

                int i1 = this.startRadius;

                for (int i = 0; i1 >= 0 && i < 3; ++i)
                {
                    int j = i1 + rand.nextInt(2);
                    int k = i1 + rand.nextInt(2);
                    int l = i1 + rand.nextInt(2);
                    float f = (float)(j + k + l) * 0.333F + 0.5F;

                    for (BlockPos blockpos : BlockPos.getAllInBox(position.add(-j, -k, -l), position.add(j, k, l)))
                    {
                        if (worldIn.isBlockLoaded(blockpos)) {
                            if (blockpos.distanceSq(position) <= (double) (f * f)) {
                                Block blockIn = Blocks.STONE;
                                if (Math.random() > 0.65) {
                                    blockIn = Blocks.COBBLESTONE;
                                    if (mossy && Math.random() > 0.5) {
                                        blockIn = Blocks.MOSSY_COBBLESTONE;
                                    }
                                }
                                if (Math.random() > 0.85) {
                                    blockIn = Blocks.GRAVEL;
                                }
                                if (Math.random() > 0.85) {
                                    blockIn = Blocks.SAND;
                                }
                                Functions.setBlockStateAndCheckForDoublePlant(worldIn, blockpos, blockIn.getDefaultState(), 16);
                                for (Entity e : worldIn.getEntitiesWithinAABB(Entity.class, new AxisAlignedBB(blockpos))) {
                                    e.setDead(); //Dont entomb entities!
                                }
                                spawnLife(worldIn, blockpos.getX(), blockpos.getY(), blockpos.getZ(), rand);
                            }
                        }
                    }

                    BlockPos startpos2 = position;
                    for (int tries = 0; tries <= 100; tries ++) {
                        startpos2 = position.add(-(i1 + 1) + rand.nextInt(2 + i1 * 2), 0 - rand.nextInt(2), -(i1 + 1) + rand.nextInt(2 + i1 * 2));
                        if (worldIn.isBlockLoaded(startpos2)) {
                            break;
                        }
                        startpos2 = position.add(0, 0 - rand.nextInt(2), 0);
                    }
                    position = startpos2;

                }

                return true;
            }
            position = position.down();
        }
    }

    public void spawnLife(World world, int x, int y, int z, Random random) {
        if (random.nextInt(24) == 0) {
            if (world.getBiome(new BlockPos(x, (y + 1), z)).getRegistryName().toString().equalsIgnoreCase("lepidodendron:jurassic_ocean_coral")) {
                //Dorygnathus:
                if (world.isAirBlock(new BlockPos(x, (y + 1), z))
                        && BlockNest.block.canPlaceBlockAt(world, new BlockPos(x, (y + 1), z))) {
                    world.setBlockState(new BlockPos(x, (y + 1), z), BlockNest.block.getDefaultState());
                    if (world.rand.nextInt(3) != 0) {
                        //Place some eggs too:
                        TileEntity te = world.getTileEntity(new BlockPos(x, (y + 1), z));
                        te.getTileData().setString("creature", "lepidodendron:prehistoric_flora_dorygnathus");
                        te.getTileData().setBoolean("isMound", false);
                        ItemStack stack = BlockNest.BlockCustom.getEggItemStack("lepidodendron:prehistoric_flora_dorygnathus");
                        stack.setCount(1);
                        ((BlockNest.TileEntityNest) te).setInventorySlotContents((int) (0), stack);
                    }
                    if (!(world.isRemote)) {
                        EntityPrehistoricFloraAgeableBase.summon(world, EntityList.getKey(EntityPrehistoricFloraDorygnathus.class).toString(), "{AgeTicks:" + (new EntityPrehistoricFloraDorygnathus(world)).getAdultAge() + "}", x + 0.5, y + 1.01, z + 0.5);
                    }
                }
            }
        }
    }
}
