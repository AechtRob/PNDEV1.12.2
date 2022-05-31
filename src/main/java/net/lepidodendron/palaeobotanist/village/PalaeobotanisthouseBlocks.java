package net.lepidodendron.palaeobotanist.village;

import net.minecraft.block.*;
import net.minecraft.block.state.IBlockState;
import net.minecraft.init.Blocks;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.structure.template.ITemplateProcessor;
import net.minecraft.world.gen.structure.template.PlacementSettings;
import net.minecraft.world.gen.structure.template.Template;
import net.minecraftforge.common.BiomeDictionary;

import javax.annotation.Nullable;
import java.util.Random;

public class PalaeobotanisthouseBlocks implements ITemplateProcessor {

    public final float chance;
    public final Random random;
    private Biome biome;
    private EnumFacing facing;
    private ResourceLocation loot_table;

    public PalaeobotanisthouseBlocks(BlockPos pos, PlacementSettings settings, ResourceLocation loot, Biome biome, EnumFacing facing) {
        this.chance = settings.getIntegrity();
        this.random = settings.getRandom(pos);
        this.biome = biome;
        this.facing = facing;
        this.loot_table = loot;
    }

    @Nullable
    public Template.BlockInfo processBlock(World worldIn, BlockPos pos, Template.BlockInfo blockInfoIn) {
        if (blockInfoIn.blockState.getBlock() instanceof BlockChest) {
            Random rand = new Random(worldIn.getSeed() + pos.toLong());
            NBTTagCompound tag = blockInfoIn.tileentityData == null ? new NBTTagCompound() : blockInfoIn.tileentityData;
            tag.setString("LootTable", "lepidodendron:palaeobotanist_chest");
            tag.setLong("LootTableSeed", rand.nextLong());
            Template.BlockInfo newInfo = new Template.BlockInfo(pos, blockInfoIn.blockState, tag);
            return newInfo;
        } else {
            if (blockInfoIn.blockState.getBlock() instanceof BlockFlowerPot) {
                NBTTagCompound tag = blockInfoIn.tileentityData == null ? new NBTTagCompound() : blockInfoIn.tileentityData;
                tag.setString("Item", "minecraft:tallgrass");
                tag.setInteger("Data", 2);
                Template.BlockInfo newInfo = new Template.BlockInfo(pos, blockInfoIn.blockState, tag);
                return newInfo;
            }
            else {
                return new Template.BlockInfo(pos, getBiomeSpecificBlockState(blockInfoIn.blockState, biome), null);
            }
        }
    }

    protected IBlockState getBiomeSpecificBlockState(IBlockState blockstateIn, Biome biome) {
        net.minecraftforge.event.terraingen.BiomeEvent.GetVillageBlockID event = new net.minecraftforge.event.terraingen.BiomeEvent.GetVillageBlockID(biome, blockstateIn);
        net.minecraftforge.common.MinecraftForge.TERRAIN_GEN_BUS.post(event);
        int structureType = 0;
        if (BiomeDictionary.hasType(biome, BiomeDictionary.Type.SANDY) && BiomeDictionary.hasType(biome, BiomeDictionary.Type.DRY)) {
            structureType = 1;
        } else if (BiomeDictionary.hasType(biome, BiomeDictionary.Type.SAVANNA)) {
            structureType = 2;
        } else if (BiomeDictionary.hasType(biome, BiomeDictionary.Type.CONIFEROUS)) {
            structureType = 3;
        }

        if (event.getResult() == net.minecraftforge.fml.common.eventhandler.Event.Result.DENY)
            return event.getReplacement();
        if (blockstateIn.getBlock() instanceof BlockDoor && blockstateIn.getValue(BlockDoor.HALF) == BlockDoor.EnumDoorHalf.LOWER) {
            EnumFacing facing = blockstateIn.getValue(BlockDoor.FACING);
            return biomeDoor(structureType).withProperty(BlockDoor.FACING, facing);
        }
        if (blockstateIn.getBlock() instanceof BlockDoor && blockstateIn.getValue(BlockDoor.HALF) == BlockDoor.EnumDoorHalf.UPPER) {
            EnumFacing facing = blockstateIn.getValue(BlockDoor.FACING);
            return biomeDoor(structureType).withProperty(BlockDoor.FACING, facing).withProperty(BlockDoor.HALF, BlockDoor.EnumDoorHalf.UPPER);
        }
        if (structureType == 1) {
            if (blockstateIn.getBlock() == Blocks.LOG || blockstateIn.getBlock() == Blocks.LOG2) {
                return Blocks.SANDSTONE.getDefaultState();
            }
            if (blockstateIn.getBlock() == Blocks.COBBLESTONE) {
                return Blocks.SANDSTONE.getStateFromMeta(BlockSandStone.EnumType.DEFAULT.getMetadata());
            }
            if (blockstateIn.getBlock() == Blocks.PLANKS) {
                return Blocks.SANDSTONE.getStateFromMeta(BlockSandStone.EnumType.SMOOTH.getMetadata());
            }
            if (blockstateIn.getBlock() == Blocks.OAK_STAIRS) {
                return Blocks.SANDSTONE_STAIRS.getDefaultState().withProperty(BlockStairs.FACING, blockstateIn.getValue(BlockStairs.FACING));
            }
            if (blockstateIn.getBlock() == Blocks.STONE_STAIRS) {
                return Blocks.SANDSTONE_STAIRS.getDefaultState().withProperty(BlockStairs.FACING, blockstateIn.getValue(BlockStairs.FACING));
            }

        } else if (structureType == 3) {
            if (blockstateIn.getBlock() == Blocks.LOG || blockstateIn.getBlock() == Blocks.LOG2) {
                return Blocks.LOG.getDefaultState().withProperty(BlockOldLog.VARIANT, BlockPlanks.EnumType.SPRUCE).withProperty(BlockLog.LOG_AXIS, blockstateIn.getValue(BlockLog.LOG_AXIS));
            }

            if (blockstateIn.getBlock() == Blocks.PLANKS) {
                return Blocks.PLANKS.getDefaultState().withProperty(BlockPlanks.VARIANT, BlockPlanks.EnumType.SPRUCE);
            }

            if (blockstateIn.getBlock() == Blocks.OAK_STAIRS) {
                return Blocks.SPRUCE_STAIRS.getDefaultState().withProperty(BlockStairs.FACING, blockstateIn.getValue(BlockStairs.FACING));
            }

            if (blockstateIn.getBlock() == Blocks.OAK_FENCE_GATE) {
                return Blocks.SPRUCE_FENCE_GATE.getDefaultState().withProperty(BlockStairs.FACING, blockstateIn.getValue(BlockStairs.FACING));
            }

            if (blockstateIn.getBlock() == Blocks.OAK_FENCE) {
                return Blocks.SPRUCE_FENCE.getDefaultState();
            }
        } else if (structureType == 2) {
            if (blockstateIn.getBlock() == Blocks.LOG || blockstateIn.getBlock() == Blocks.LOG2) {
                return Blocks.LOG2.getDefaultState().withProperty(BlockNewLog.VARIANT, BlockPlanks.EnumType.ACACIA).withProperty(BlockLog.LOG_AXIS, blockstateIn.getValue(BlockLog.LOG_AXIS));
            }

            if (blockstateIn.getBlock() == Blocks.PLANKS) {
                return Blocks.PLANKS.getDefaultState().withProperty(BlockPlanks.VARIANT, BlockPlanks.EnumType.ACACIA);
            }

            if (blockstateIn.getBlock() == Blocks.OAK_STAIRS) {
                return Blocks.ACACIA_STAIRS.getDefaultState().withProperty(BlockStairs.FACING, blockstateIn.getValue(BlockStairs.FACING));
            }

            if (blockstateIn.getBlock() == Blocks.OAK_FENCE_GATE) {
                return Blocks.ACACIA_FENCE_GATE.getDefaultState().withProperty(BlockStairs.FACING, blockstateIn.getValue(BlockStairs.FACING));
            }

            if (blockstateIn.getBlock() == Blocks.OAK_FENCE) {
                return Blocks.ACACIA_FENCE.getDefaultState();
            }
        }

        return blockstateIn;
    }

    protected IBlockState biomeDoor(int structureType) {
        switch (structureType) {
            case 2:
                return Blocks.ACACIA_DOOR.getDefaultState();
            case 3:
                return Blocks.SPRUCE_DOOR.getDefaultState();
            default:
                return Blocks.OAK_DOOR.getDefaultState();
        }
    }

}