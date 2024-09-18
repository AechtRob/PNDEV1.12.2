package net.lepidodendron.world.structure;

import net.lepidodendron.block.BlockFossilOrdovician;
import net.lepidodendron.block.BlockFossilPrecambrian;
import net.minecraft.block.state.IBlockState;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.gen.structure.template.ITemplateProcessor;
import net.minecraft.world.gen.structure.template.PlacementSettings;
import net.minecraft.world.gen.structure.template.Template;

import javax.annotation.Nullable;
import java.util.Random;

public class StructureDigSiteProcess implements ITemplateProcessor {

    public final float chance;
    public final Random random;
    private IBlockState fossil;

    public StructureDigSiteProcess(BlockPos pos, PlacementSettings settings, IBlockState state) {
        this.chance = settings.getIntegrity();
        this.random = settings.getRandom(pos);
        this.fossil = state;
    }

    @Nullable
    public Template.BlockInfo processBlock(World worldIn, BlockPos pos, Template.BlockInfo blockInfoIn) {
        return new Template.BlockInfo(pos, getBiomeSpecificBlockState(blockInfoIn.blockState, this.fossil), null);
    }

    protected IBlockState getBiomeSpecificBlockState(IBlockState blockstateIn, IBlockState fossil) {
        if (blockstateIn.getBlock() == BlockFossilPrecambrian.block
            || blockstateIn.getBlock() == BlockFossilOrdovician.block) { //Seems to be a random Ordovician fossil in here somewhere!
            return fossil;
        }
        return blockstateIn;
    }



}