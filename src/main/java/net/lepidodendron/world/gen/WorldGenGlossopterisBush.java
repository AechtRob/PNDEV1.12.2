package net.lepidodendron.world.gen;

import net.lepidodendron.block.BlockGlossopterisSapling;
import net.minecraft.block.Block;
import net.minecraft.block.state.IBlockState;
import net.minecraft.util.Mirror;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.Rotation;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.ChunkPos;
import net.minecraft.world.World;
import net.minecraft.world.WorldServer;
import net.minecraft.world.gen.feature.WorldGenerator;
import net.minecraft.world.gen.structure.template.PlacementSettings;
import net.minecraft.world.gen.structure.template.Template;

import java.util.Random;

public class WorldGenGlossopterisBush extends WorldGenerator
{

    public boolean generate(World worldIn, Random rand, BlockPos position)
    {
        boolean flag = false;

        for (int i = 0; i < 12; ++i)
        {
            BlockPos blockpos = position.add(rand.nextInt(8) - rand.nextInt(8), rand.nextInt(4) - rand.nextInt(4), rand.nextInt(8) - rand.nextInt(8));

            if (blockpos.getY() >= worldIn.getSeaLevel()-4 && worldIn.isAirBlock(blockpos) && (!worldIn.provider.isNether() || blockpos.getY() < 254) && BlockGlossopterisSapling.block.canPlaceBlockAt(worldIn, blockpos))
            {
                int ii = rand.nextInt(3);
                Template template = null;
                if (ii == 0) {
                    template = ((WorldServer) worldIn).getStructureTemplateManager().getTemplate(worldIn.getMinecraftServer(),
                            new ResourceLocation("lepidodendron", "glossbush1"));
                }
                if (ii == 1) {
                    template = ((WorldServer) worldIn).getStructureTemplateManager().getTemplate(worldIn.getMinecraftServer(),
                            new ResourceLocation("lepidodendron", "glossbush2"));
                }
                if (ii == 2) {
                    template = ((WorldServer) worldIn).getStructureTemplateManager().getTemplate(worldIn.getMinecraftServer(),
                            new ResourceLocation("lepidodendron", "glossbush3"));
                }

                if (template != null) {
                    Rotation rotation = Rotation.values()[rand.nextInt(3)];
                    Mirror mirror = Mirror.values()[rand.nextInt(2)];
                    IBlockState iblockstate = worldIn.getBlockState(blockpos);
                    worldIn.notifyBlockUpdate(blockpos, iblockstate, iblockstate, 3);
                    template.addBlocksToWorldChunk(worldIn, blockpos, new PlacementSettings().setRotation(rotation).setMirror(mirror)
                            .setChunk((ChunkPos) null).setReplacedBlock((Block) null).setIgnoreStructureBlock(false).setIgnoreEntities(false));
                    flag = true;
                }
            }
        }

        return flag;
    }
}
