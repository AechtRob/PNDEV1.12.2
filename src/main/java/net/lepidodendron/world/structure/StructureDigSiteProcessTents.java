package net.lepidodendron.world.structure;

import net.lepidodendron.LepidodendronConfig;
import net.lepidodendron.block.*;
import net.minecraft.block.BlockChest;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.init.Blocks;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.structure.template.ITemplateProcessor;
import net.minecraft.world.gen.structure.template.PlacementSettings;
import net.minecraft.world.gen.structure.template.Template;

import javax.annotation.Nullable;
import java.util.Random;

public class StructureDigSiteProcessTents implements ITemplateProcessor {

    public final float chance;
    public final Random random;
    public final IBlockState fossilState;
    public final int colourTent;
    public final int colourBed;
    public final int colourCarpet;

    public StructureDigSiteProcessTents(BlockPos pos, PlacementSettings settings, IBlockState fossilStateIn, int colourTentIn, int colourBedIn, int colourCarpetIn) {
        this.chance = settings.getIntegrity();
        this.random = settings.getRandom(pos);
        this.fossilState = fossilStateIn;
        this.colourTent = colourTentIn;
        this.colourBed = colourBedIn;
        this.colourCarpet = colourCarpetIn;
    }

    @Nullable
    @Override
    public Template.BlockInfo processBlock(World worldIn, BlockPos pos, Template.BlockInfo blockInfoIn) {
        if (blockInfoIn.blockState.getBlock() instanceof BlockChest) {
            Random rand = new Random(worldIn.getSeed() + pos.toLong());
            NBTTagCompound tag = blockInfoIn.tileentityData == null ? new NBTTagCompound() : blockInfoIn.tileentityData;
            if (this.fossilState.getBlock() == BlockFossilPrecambrian.block) {
                tag.setString("LootTable", "lepidodendron:digsite_chest_precambrian");
            }
            else if (this.fossilState.getBlock() == BlockFossilCambrian.block) {
                tag.setString("LootTable", "lepidodendron:digsite_chest_cambrian");
            }
            else if (this.fossilState.getBlock() == BlockFossilOrdovician.block) {
                tag.setString("LootTable", "lepidodendron:digsite_chest_ordovician");
            }
            else if (this.fossilState.getBlock() == BlockFossilSilurian.block) {
                tag.setString("LootTable", "lepidodendron:digsite_chest_silurian");
            }
            else if (this.fossilState.getBlock() == BlockFossilDevonian.block) {
                tag.setString("LootTable", "lepidodendron:digsite_chest_devonian");
            }
            else if (this.fossilState.getBlock() == BlockFossilCarboniferous.block) {
                tag.setString("LootTable", "lepidodendron:digsite_chest_carboniferous");
            }
            else if (this.fossilState.getBlock() == BlockFossilPermian.block) {
                tag.setString("LootTable", "lepidodendron:digsite_chest_permian");
            }
            else if (this.fossilState.getBlock() == BlockFossilTriassic.block) {
                tag.setString("LootTable", "lepidodendron:digsite_chest_triassic");
            }
            else if (this.fossilState.getBlock() == BlockFossilJurassic.block) {
                tag.setString("LootTable", "lepidodendron:digsite_chest_jurassic");
            }
            else if (this.fossilState.getBlock() == BlockFossilCretaceous.block) {
                tag.setString("LootTable", "lepidodendron:digsite_chest_cretaceous");
            }
            else if (this.fossilState.getBlock() == BlockFossilPaleogene.block) {
                tag.setString("LootTable", "lepidodendron:digsite_chest_paleogene");
            }
            else if (this.fossilState.getBlock() == BlockFossilNeogene.block) {
                tag.setString("LootTable", "lepidodendron:digsite_chest_neogene");
            }
            else if (this.fossilState.getBlock() == BlockFossilPleistocene.block) {
                tag.setString("LootTable", "lepidodendron:digsite_chest_pleistocene");
            }
            tag.setLong("LootTableSeed", rand.nextLong());
            Template.BlockInfo newInfo = new Template.BlockInfo(pos, blockInfoIn.blockState, tag);
            return newInfo;
        } else if (blockInfoIn.blockState.getBlock() == Blocks.BED) {
            NBTTagCompound tag = blockInfoIn.tileentityData == null ? new NBTTagCompound() : blockInfoIn.tileentityData;
            int colour = LepidodendronConfig.digsiteBedColour;
            if (colour < -1 || colour > 15) {
                colour = 7;
            }
            if (colour == -1) {
                colour = this.colourBed;
            }
            tag.setInteger("color", colour);
            Template.BlockInfo newInfo = new Template.BlockInfo(pos, blockInfoIn.blockState, tag);
            return newInfo;
        }
        return new Template.BlockInfo(pos, getBiomeSpecificBlockState(blockInfoIn.blockState, worldIn, pos), null);
    }


    protected IBlockState getBiomeSpecificBlockState(IBlockState blockstateIn, World world, BlockPos pos) {

        if (blockstateIn.getBlock() == Blocks.FLOWER_POT) {
            int i = random.nextInt(9);
            switch (i) {
                case 0: default:
                    return BlockAnemone1Dead.block.getDefaultState();

                case 1:
                    return BlockAnemone2Dead.block.getDefaultState();

                case 2:
                    return BlockAnemone3Dead.block.getDefaultState();

                case 3:
                    return BlockAnemone4Dead.block.getDefaultState();

                case 4:
                    return BlockAnemone5Dead.block.getDefaultState();

                case 5:
                    return BlockAnemone6Dead.block.getDefaultState();

                case 6:
                    return BlockAnemone7Dead.block.getDefaultState();

                case 7:
                    return BlockAnemone8Dead.block.getDefaultState();

                case 8:
                    return BlockAnemone9Dead.block.getDefaultState();
            }

        }

//        if (blockstateIn.getBlock() == Blocks.TORCH && Functions.decoLoaded()) {
//            EnumFacing facing = blockstateIn.getValue(BlockTorch.FACING);
//            if (facing != EnumFacing.UP && facing != EnumFacing.DOWN) {
//                return BlockLamp.block.getDefaultState().withProperty(BlockLamp.BlockCustom.FACING, facing);
//            }
//        }

        int colour = LepidodendronConfig.digsiteTentColour;
        if (colour < -2 || colour > 15) {
            colour = 12;
        }
        if (colour == -1) {
            colour = this.colourTent;
        }
        if (colour == -2) {
            colour = world.rand.nextInt(15);
        }
        if (blockstateIn.getBlock() == Blocks.WOOL) {
            return Blocks.WOOL.getStateFromMeta(colour);
        }

        colour = LepidodendronConfig.digsiteCarpetColour;
        if (colour < -2 || colour > 15) {
            colour = 8;
        }
        if (colour == -1) {
            colour = this.colourCarpet;
        }
        if (colour == -2) {
            colour = world.rand.nextInt(15);
        }
        if (blockstateIn.getBlock() == Blocks.CARPET) {
            return Blocks.CARPET.getStateFromMeta(colour);
        }

        Biome biome = world.getBiome(pos);
        if (blockstateIn.getBlock() == Blocks.DIRT) {
            if (biome.topBlock.getMaterial() == Material.GRASS
                    || biome.topBlock.getBlock() == Blocks.DIRT) {
                return Blocks.DIRT.getStateFromMeta(1);
            }
            if (biome.topBlock == Blocks.SAND.getStateFromMeta(0)) {
                return Blocks.SANDSTONE.getStateFromMeta(0);
            }
            if (biome.topBlock == Blocks.SAND.getStateFromMeta(1)) {
                return Blocks.RED_SANDSTONE.getStateFromMeta(0);
            }
            if (biome.topBlock == BlockSandBlack.block) {
                return BlockSandstoneBlack.block.getDefaultState();
            }
            if (biome.topBlock == BlockSandGrey.block) {
                return BlockSandstoneGrey.block.getDefaultState();
            }
            if (biome.topBlock == BlockSandPangaean.block) {
                return BlockSandstonePangaean.block.getDefaultState();
            }
            if (biome.topBlock == BlockSandWhite.block) {
                return BlockSandstoneWhite.block.getDefaultState();
            }
            if (biome.topBlock == BlockSandPaleoproterozoic.block) {
                return BlockSandstonePaleoproterozoic.block.getDefaultState();
            }
            return biome.fillerBlock;
        }

        if (blockstateIn.getBlock() == Blocks.STONE) {
            if (biome.topBlock == Blocks.SAND.getStateFromMeta(0)) {
                return Blocks.SANDSTONE.getStateFromMeta(0);
            }
            if (biome.topBlock == Blocks.SAND.getStateFromMeta(1)) {
                return Blocks.RED_SANDSTONE.getStateFromMeta(0);
            }
            if (biome.topBlock == BlockSandBlack.block) {
                return BlockSandstoneBlack.block.getDefaultState();
            }
            if (biome.topBlock == BlockSandGrey.block) {
                return BlockSandstoneGrey.block.getDefaultState();
            }
            if (biome.topBlock == BlockSandPangaean.block) {
                return BlockSandstonePangaean.block.getDefaultState();
            }
            if (biome.topBlock == BlockSandWhite.block) {
                return BlockSandstoneWhite.block.getDefaultState();
            }
            if (biome.topBlock == BlockSandPaleoproterozoic.block) {
                return BlockSandstonePaleoproterozoic.block.getDefaultState();
            }
            return biome.topBlock;
        }

        return blockstateIn;
    }
    
}