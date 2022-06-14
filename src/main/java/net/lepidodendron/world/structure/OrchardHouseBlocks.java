package net.lepidodendron.world.structure;

import net.minecraft.block.BlockChest;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.structure.template.ITemplateProcessor;
import net.minecraft.world.gen.structure.template.PlacementSettings;
import net.minecraft.world.gen.structure.template.Template;

import javax.annotation.Nullable;
import java.util.Random;

public class OrchardHouseBlocks implements ITemplateProcessor {

    public final float chance;
    public final Random random;
    private Biome biome;
    private EnumFacing facing;
    private ResourceLocation loot_table;

    public OrchardHouseBlocks(BlockPos pos, PlacementSettings settings, ResourceLocation loot, Biome biome, EnumFacing facing) {
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
            tag.setString("LootTable", "lepidodendron:orchard_chest");
            tag.setLong("LootTableSeed", rand.nextLong());
            Template.BlockInfo newInfo = new Template.BlockInfo(pos, blockInfoIn.blockState, tag);
            return newInfo;
        }
        else {
            return new Template.BlockInfo(pos, blockInfoIn.blockState, null);
        }
    }

}