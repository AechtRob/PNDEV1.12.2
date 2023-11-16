package net.lepidodendron;

import net.minecraft.block.BlockStone;
import net.minecraft.init.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.gen.feature.WorldGenMinable;
import net.minecraft.world.gen.feature.WorldGenerator;
import net.minecraftforge.event.terraingen.OreGenEvent.GenerateMinable;
import net.minecraftforge.event.terraingen.OreGenEvent.GenerateMinable.EventType;
import net.minecraftforge.fml.common.eventhandler.Event;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

import java.util.Random;


public class LepidodendronOreHandler {
	
	@SubscribeEvent(receiveCanceled=true)
	public void onEvent(GenerateMinable event){
		//System.err.println("Coal gen");
		if (event.getType().equals(EventType.COAL )){
			if (LepidodendronConfig.dimDevonian == (int) event.getWorld().provider.getDimension() 
			|| LepidodendronConfig.dimOrdovician == (int) event.getWorld().provider.getDimension()
			|| LepidodendronConfig.dimSilurian == (int) event.getWorld().provider.getDimension()
			|| LepidodendronConfig.dimCambrian == (int) event.getWorld().provider.getDimension()
			|| LepidodendronConfig.dimPrecambrian == (int) event.getWorld().provider.getDimension()
			)
            	event.setResult(Event.Result.DENY);
		}
		if (event.getType().equals(EventType.IRON)) {
			if (LepidodendronConfig.dimPrecambrian == (int) event.getWorld().provider.getDimension()
			) {
				if (event.getWorld().getBiome( event.getPos().add(8,0,8)).getRegistryName().toString().equalsIgnoreCase("lepidodendron:paleoproterozoic_beach")
					|| event.getWorld().getBiome( event.getPos().add(8,0,8)).getRegistryName().toString().equalsIgnoreCase("lepidodendron:paleoproterozoic_regolith")
					|| event.getWorld().getBiome( event.getPos().add(8,0,8)).getRegistryName().toString().equalsIgnoreCase("lepidodendron:paleoproterozoic_shallows")) {
					genStandardOre1(event.getPos(), event.getWorld(), event.getRand(), 50,
						new WorldGenMinable(Blocks.IRON_ORE.getDefaultState(), 9),
						100, 140);
				}
				event.setResult(Event.Result.DENY);
			}
		}
		if (event.getType().equals(EventType.DIRT )){ //dirt is blocked to avoid grass etc accidentally appearring
			if (LepidodendronConfig.dimCretaceousEarly == (int) event.getWorld().provider.getDimension()
				|| LepidodendronConfig.dimJurassic == (int) event.getWorld().provider.getDimension()
				|| LepidodendronConfig.dimTriassic == (int) event.getWorld().provider.getDimension()
				|| LepidodendronConfig.dimPermian == (int) event.getWorld().provider.getDimension()
				|| LepidodendronConfig.dimCarboniferous == (int) event.getWorld().provider.getDimension()
				|| LepidodendronConfig.dimDevonian == (int) event.getWorld().provider.getDimension()
				|| LepidodendronConfig.dimSilurian == (int) event.getWorld().provider.getDimension()
				|| LepidodendronConfig.dimOrdovician == (int) event.getWorld().provider.getDimension()
				|| LepidodendronConfig.dimCambrian == (int) event.getWorld().provider.getDimension()
				|| LepidodendronConfig.dimPrecambrian == (int) event.getWorld().provider.getDimension()
			)
				event.setResult(Event.Result.DENY);
		}
		if (event.getType().equals(EventType.ANDESITE )) {
			if (LepidodendronConfig.dimPrecambrian == (int) event.getWorld().provider.getDimension()
			) {
				genStandardOre1(event.getPos(), event.getWorld(), event.getRand(), 10,
					new WorldGenMinable(Blocks.STONE.getDefaultState().withProperty(BlockStone.VARIANT, BlockStone.EnumType.ANDESITE), 33),
						105, 170);
				event.setResult(Event.Result.DENY);
			}
		}
		if (event.getType().equals(EventType.GRANITE )){
			if (LepidodendronConfig.dimPrecambrian == (int) event.getWorld().provider.getDimension()
			) {
				genStandardOre1(event.getPos(), event.getWorld(), event.getRand(), 10,
						new WorldGenMinable(Blocks.STONE.getDefaultState().withProperty(BlockStone.VARIANT, BlockStone.EnumType.GRANITE), 33),
						105, 170);
				event.setResult(Event.Result.DENY);
			}
		}
		if (event.getType().equals(EventType.DIORITE )){
			if (LepidodendronConfig.dimPrecambrian == (int) event.getWorld().provider.getDimension()
			) {
				genStandardOre1(event.getPos(), event.getWorld(), event.getRand(), 10,
						new WorldGenMinable(Blocks.STONE.getDefaultState().withProperty(BlockStone.VARIANT, BlockStone.EnumType.DIORITE), 33),
						105, 170);
				event.setResult(Event.Result.DENY);
			}
		}
		if (event.getType().equals(EventType.SILVERFISH )){
			if (LepidodendronConfig.dimDevonian == (int) event.getWorld().provider.getDimension()
				|| LepidodendronConfig.dimOrdovician == (int) event.getWorld().provider.getDimension()
				|| LepidodendronConfig.dimSilurian == (int) event.getWorld().provider.getDimension()
				|| LepidodendronConfig.dimCambrian == (int) event.getWorld().provider.getDimension()
				|| LepidodendronConfig.dimPrecambrian == (int) event.getWorld().provider.getDimension()
				|| LepidodendronConfig.dimCarboniferous == (int) event.getWorld().provider.getDimension()
				|| LepidodendronConfig.dimPermian == (int) event.getWorld().provider.getDimension()
				|| LepidodendronConfig.dimTriassic == (int) event.getWorld().provider.getDimension()
				|| LepidodendronConfig.dimJurassic == (int) event.getWorld().provider.getDimension()
				|| LepidodendronConfig.dimCretaceousEarly == (int) event.getWorld().provider.getDimension()
			)
				event.setResult(Event.Result.DENY);
		}
	}

	protected void genStandardOre1(BlockPos chunkPos, World worldIn, Random random, int blockCount, WorldGenerator generator, int minHeight, int maxHeight)
	{
		if (maxHeight < minHeight)
		{
			int i = minHeight;
			minHeight = maxHeight;
			maxHeight = i;
		}
		else if (maxHeight == minHeight)
		{
			if (minHeight < 255)
			{
				++maxHeight;
			}
			else
			{
				--minHeight;
			}
		}

		for (int j = 0; j < blockCount; ++j)
		{
			BlockPos blockpos = chunkPos.add(random.nextInt(16), random.nextInt(maxHeight - minHeight) + minHeight, random.nextInt(16));
			generator.generate(worldIn, random, blockpos);
		}
	}

}