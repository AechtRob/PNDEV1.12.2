package net.lepidodendron;

import net.minecraft.world.biome.Biome;
import net.minecraftforge.event.terraingen.DecorateBiomeEvent.Decorate;
import net.minecraftforge.fml.common.eventhandler.Event;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class LepidodendronDecorationHandler {

@SubscribeEvent(receiveCanceled=true)
    public void onEvent(Decorate event){
    	
        if ((event.getType() == Decorate.EventType.TREE) && !LepidodendronConfig.genTransformBiomesTrees)
       	{
        	Biome biome = event.getWorld().getBiome(event.getPos());
        	if (matchBiome(biome, LepidodendronConfig.genTransformBiomes))
            	event.setResult(Event.Result.DENY);
            biome = event.getWorld().getBiome(event.getPos().north(16));
        	if (matchBiome(biome, LepidodendronConfig.genTransformBiomes))
            	event.setResult(Event.Result.DENY);
            biome = event.getWorld().getBiome(event.getPos().south(16));
        	if (matchBiome(biome, LepidodendronConfig.genTransformBiomes))
            	event.setResult(Event.Result.DENY);
            biome = event.getWorld().getBiome(event.getPos().east(16));
        	if (matchBiome(biome, LepidodendronConfig.genTransformBiomes))
            	event.setResult(Event.Result.DENY);
            biome = event.getWorld().getBiome(event.getPos().west(16));
        	if (matchBiome(biome, LepidodendronConfig.genTransformBiomes))
            	event.setResult(Event.Result.DENY);
        } 

        if ((event.getType() == Decorate.EventType.CACTUS) && !LepidodendronConfig.genTransformBiomesCactus)
        	{
        	Biome biome = event.getWorld().getBiome(event.getPos());
        	if (matchBiome(biome, LepidodendronConfig.genTransformBiomes))
            	event.setResult(Event.Result.DENY);
            biome = event.getWorld().getBiome(event.getPos().north(16));
        	if (matchBiome(biome, LepidodendronConfig.genTransformBiomes))
            	event.setResult(Event.Result.DENY);
            biome = event.getWorld().getBiome(event.getPos().south(16));
        	if (matchBiome(biome, LepidodendronConfig.genTransformBiomes))
            	event.setResult(Event.Result.DENY);
            biome = event.getWorld().getBiome(event.getPos().east(16));
        	if (matchBiome(biome, LepidodendronConfig.genTransformBiomes))
            	event.setResult(Event.Result.DENY);
            biome = event.getWorld().getBiome(event.getPos().west(16));
        	if (matchBiome(biome, LepidodendronConfig.genTransformBiomes))
            	event.setResult(Event.Result.DENY);
			if (LepidodendronConfig.dimPrecambrian == event.getWorld().provider.getDimension() )
				event.setResult(Event.Result.DENY);
        	if (LepidodendronConfig.dimCambrian == event.getWorld().provider.getDimension() )
        		event.setResult(Event.Result.DENY);
			if (LepidodendronConfig.dimDevonian == event.getWorld().provider.getDimension() )
				event.setResult(Event.Result.DENY);
			if (LepidodendronConfig.dimOrdovician == event.getWorld().provider.getDimension() )
				event.setResult(Event.Result.DENY);
			if (LepidodendronConfig.dimSilurian == event.getWorld().provider.getDimension() )
				event.setResult(Event.Result.DENY);
			if (LepidodendronConfig.dimCarboniferous == event.getWorld().provider.getDimension() )
				event.setResult(Event.Result.DENY);
			if (LepidodendronConfig.dimPermian == event.getWorld().provider.getDimension() )
				event.setResult(Event.Result.DENY);
			if (LepidodendronConfig.dimTriassic == event.getWorld().provider.getDimension() )
				event.setResult(Event.Result.DENY);
			if (LepidodendronConfig.dimJurassic == event.getWorld().provider.getDimension() )
				event.setResult(Event.Result.DENY);
			if (LepidodendronConfig.dimCretaceous == event.getWorld().provider.getDimension() )
				event.setResult(Event.Result.DENY);
        }

        if (((event.getType() == Decorate.EventType.BIG_SHROOM)) && !LepidodendronConfig.genTransformBiomesMushrooms)
        {
        	Biome biome = event.getWorld().getBiome(event.getPos());
        	if (matchBiome(biome, LepidodendronConfig.genTransformBiomes))
            	event.setResult(Event.Result.DENY);
            biome = event.getWorld().getBiome(event.getPos().north(16));
        	if (matchBiome(biome, LepidodendronConfig.genTransformBiomes))
            	event.setResult(Event.Result.DENY);
            biome = event.getWorld().getBiome(event.getPos().south(16));
        	if (matchBiome(biome, LepidodendronConfig.genTransformBiomes))
            	event.setResult(Event.Result.DENY);
            biome = event.getWorld().getBiome(event.getPos().east(16));
        	if (matchBiome(biome, LepidodendronConfig.genTransformBiomes))
            	event.setResult(Event.Result.DENY);
            biome = event.getWorld().getBiome(event.getPos().west(16));
        	if (matchBiome(biome, LepidodendronConfig.genTransformBiomes))
            	event.setResult(Event.Result.DENY);
			if (LepidodendronConfig.dimPrecambrian == event.getWorld().provider.getDimension() )
				event.setResult(Event.Result.DENY);
			if (LepidodendronConfig.dimCambrian == event.getWorld().provider.getDimension() )
				event.setResult(Event.Result.DENY);
			if (LepidodendronConfig.dimDevonian == event.getWorld().provider.getDimension() )
				event.setResult(Event.Result.DENY);
			if (LepidodendronConfig.dimOrdovician == event.getWorld().provider.getDimension() )
				event.setResult(Event.Result.DENY);
			if (LepidodendronConfig.dimSilurian == event.getWorld().provider.getDimension() )
				event.setResult(Event.Result.DENY);
			if (LepidodendronConfig.dimCarboniferous == event.getWorld().provider.getDimension() )
				event.setResult(Event.Result.DENY);
			if (LepidodendronConfig.dimPermian == event.getWorld().provider.getDimension() )
				event.setResult(Event.Result.DENY);
			if (LepidodendronConfig.dimTriassic == event.getWorld().provider.getDimension() )
				event.setResult(Event.Result.DENY);
			if (LepidodendronConfig.dimJurassic == event.getWorld().provider.getDimension() )
				event.setResult(Event.Result.DENY);
			if (LepidodendronConfig.dimCretaceous == event.getWorld().provider.getDimension() )
				event.setResult(Event.Result.DENY);

        }

	if (((event.getType() == Decorate.EventType.SHROOM)) && !LepidodendronConfig.genTransformBiomesMushrooms)
	{
		Biome biome = event.getWorld().getBiome(event.getPos());
		if (matchBiome(biome, LepidodendronConfig.genTransformBiomes))
			event.setResult(Event.Result.DENY);
		biome = event.getWorld().getBiome(event.getPos().north(16));
		if (matchBiome(biome, LepidodendronConfig.genTransformBiomes))
			event.setResult(Event.Result.DENY);
		biome = event.getWorld().getBiome(event.getPos().south(16));
		if (matchBiome(biome, LepidodendronConfig.genTransformBiomes))
			event.setResult(Event.Result.DENY);
		biome = event.getWorld().getBiome(event.getPos().east(16));
		if (matchBiome(biome, LepidodendronConfig.genTransformBiomes))
			event.setResult(Event.Result.DENY);
		biome = event.getWorld().getBiome(event.getPos().west(16));
		if (matchBiome(biome, LepidodendronConfig.genTransformBiomes))
			event.setResult(Event.Result.DENY);
		if (LepidodendronConfig.dimPrecambrian == event.getWorld().provider.getDimension() )
			event.setResult(Event.Result.DENY);
		if (LepidodendronConfig.dimCambrian == event.getWorld().provider.getDimension() )
			event.setResult(Event.Result.DENY);
		if (LepidodendronConfig.dimOrdovician == event.getWorld().provider.getDimension() )
			event.setResult(Event.Result.DENY);
		if (LepidodendronConfig.dimSilurian == event.getWorld().provider.getDimension() )
			event.setResult(Event.Result.DENY);
		if (LepidodendronConfig.dimPermian == event.getWorld().provider.getDimension() )
			event.setResult(Event.Result.DENY);
		if (LepidodendronConfig.dimTriassic == event.getWorld().provider.getDimension() )
			event.setResult(Event.Result.DENY);
		if (LepidodendronConfig.dimJurassic == event.getWorld().provider.getDimension() )
			event.setResult(Event.Result.DENY);
	}

        if (((event.getType() == Decorate.EventType.FLOWERS) || (event.getType() == Decorate.EventType.LILYPAD)) && !LepidodendronConfig.genTransformBiomesFlowers)
        {
        	Biome biome = event.getWorld().getBiome(event.getPos());
        	if (matchBiome(biome, LepidodendronConfig.genTransformBiomes))
            	event.setResult(Event.Result.DENY);
            biome = event.getWorld().getBiome(event.getPos().north(16));
        	if (matchBiome(biome, LepidodendronConfig.genTransformBiomes))
            	event.setResult(Event.Result.DENY);
            biome = event.getWorld().getBiome(event.getPos().south(16));
        	if (matchBiome(biome, LepidodendronConfig.genTransformBiomes))
            	event.setResult(Event.Result.DENY);
            biome = event.getWorld().getBiome(event.getPos().east(16));
        	if (matchBiome(biome, LepidodendronConfig.genTransformBiomes))
            	event.setResult(Event.Result.DENY);
            biome = event.getWorld().getBiome(event.getPos().west(16));
        	if (matchBiome(biome, LepidodendronConfig.genTransformBiomes))
            	event.setResult(Event.Result.DENY);
			if (LepidodendronConfig.dimPrecambrian == event.getWorld().provider.getDimension() )
				event.setResult(Event.Result.DENY);
			if (LepidodendronConfig.dimCambrian == event.getWorld().provider.getDimension() )
				event.setResult(Event.Result.DENY);
			if (LepidodendronConfig.dimDevonian == event.getWorld().provider.getDimension() )
				event.setResult(Event.Result.DENY);
			if (LepidodendronConfig.dimOrdovician == event.getWorld().provider.getDimension() )
				event.setResult(Event.Result.DENY);
			if (LepidodendronConfig.dimSilurian == event.getWorld().provider.getDimension() )
				event.setResult(Event.Result.DENY);
			if (LepidodendronConfig.dimCarboniferous == event.getWorld().provider.getDimension() )
				event.setResult(Event.Result.DENY);
			if (LepidodendronConfig.dimPermian == event.getWorld().provider.getDimension() )
				event.setResult(Event.Result.DENY);
			if (LepidodendronConfig.dimTriassic == event.getWorld().provider.getDimension() )
				event.setResult(Event.Result.DENY);
			if (LepidodendronConfig.dimJurassic == event.getWorld().provider.getDimension() )
				event.setResult(Event.Result.DENY);
			if (LepidodendronConfig.dimCretaceous == event.getWorld().provider.getDimension() )
				event.setResult(Event.Result.DENY);

        }

        if ((event.getType() == Decorate.EventType.PUMPKIN) && !LepidodendronConfig.genTransformBiomesPumpkins)
        {
        	Biome biome = event.getWorld().getBiome(event.getPos());
        	if (matchBiome(biome, LepidodendronConfig.genTransformBiomes))
            	event.setResult(Event.Result.DENY);
            biome = event.getWorld().getBiome(event.getPos().north(16));
        	if (matchBiome(biome, LepidodendronConfig.genTransformBiomes))
            	event.setResult(Event.Result.DENY);
            biome = event.getWorld().getBiome(event.getPos().south(16));
        	if (matchBiome(biome, LepidodendronConfig.genTransformBiomes))
            	event.setResult(Event.Result.DENY);
            biome = event.getWorld().getBiome(event.getPos().east(16));
        	if (matchBiome(biome, LepidodendronConfig.genTransformBiomes))
            	event.setResult(Event.Result.DENY);
            biome = event.getWorld().getBiome(event.getPos().west(16));
        	if (matchBiome(biome, LepidodendronConfig.genTransformBiomes))
            	event.setResult(Event.Result.DENY);
			if (LepidodendronConfig.dimPrecambrian == event.getWorld().provider.getDimension() )
				event.setResult(Event.Result.DENY);
        	if (LepidodendronConfig.dimCambrian == event.getWorld().provider.getDimension() )
				event.setResult(Event.Result.DENY);
            if (LepidodendronConfig.dimDevonian == event.getWorld().provider.getDimension() )
            	event.setResult(Event.Result.DENY);
            if (LepidodendronConfig.dimOrdovician == event.getWorld().provider.getDimension() )
            	event.setResult(Event.Result.DENY);
			if (LepidodendronConfig.dimSilurian == event.getWorld().provider.getDimension() )
				event.setResult(Event.Result.DENY);
            if (LepidodendronConfig.dimCarboniferous == event.getWorld().provider.getDimension() )
            	event.setResult(Event.Result.DENY);
			if (LepidodendronConfig.dimPermian == event.getWorld().provider.getDimension() )
				event.setResult(Event.Result.DENY);
			if (LepidodendronConfig.dimTriassic == event.getWorld().provider.getDimension() )
				event.setResult(Event.Result.DENY);
			if (LepidodendronConfig.dimJurassic == event.getWorld().provider.getDimension() )
				event.setResult(Event.Result.DENY);
			if (LepidodendronConfig.dimCretaceous == event.getWorld().provider.getDimension() )
				event.setResult(Event.Result.DENY);

        }

        if ((event.getType() == Decorate.EventType.REED) && !LepidodendronConfig.genTransformBiomesReeds)
       	{
        	Biome biome = event.getWorld().getBiome(event.getPos());
        	if (matchBiome(biome, LepidodendronConfig.genTransformBiomes))
            	event.setResult(Event.Result.DENY);
            biome = event.getWorld().getBiome(event.getPos().north(16));
        	if (matchBiome(biome, LepidodendronConfig.genTransformBiomes))
            	event.setResult(Event.Result.DENY);
            biome = event.getWorld().getBiome(event.getPos().south(16));
        	if (matchBiome(biome, LepidodendronConfig.genTransformBiomes))
            	event.setResult(Event.Result.DENY);
            biome = event.getWorld().getBiome(event.getPos().east(16));
        	if (matchBiome(biome, LepidodendronConfig.genTransformBiomes))
            	event.setResult(Event.Result.DENY);
            biome = event.getWorld().getBiome(event.getPos().west(16));
        	if (matchBiome(biome, LepidodendronConfig.genTransformBiomes))
            	event.setResult(Event.Result.DENY);
			if (LepidodendronConfig.dimPrecambrian == event.getWorld().provider.getDimension() )
				event.setResult(Event.Result.DENY);
			if (LepidodendronConfig.dimCambrian == event.getWorld().provider.getDimension() )
				event.setResult(Event.Result.DENY);
            if (LepidodendronConfig.dimDevonian == event.getWorld().provider.getDimension() )
            	event.setResult(Event.Result.DENY);
            if (LepidodendronConfig.dimOrdovician == event.getWorld().provider.getDimension() )
            	event.setResult(Event.Result.DENY);
			if (LepidodendronConfig.dimSilurian == event.getWorld().provider.getDimension() )
				event.setResult(Event.Result.DENY);
            if (LepidodendronConfig.dimCarboniferous == event.getWorld().provider.getDimension() )
            	event.setResult(Event.Result.DENY);
			if (LepidodendronConfig.dimPermian == event.getWorld().provider.getDimension() )
				event.setResult(Event.Result.DENY);
			if (LepidodendronConfig.dimTriassic == event.getWorld().provider.getDimension() )
				event.setResult(Event.Result.DENY);
			if (LepidodendronConfig.dimJurassic == event.getWorld().provider.getDimension() )
				event.setResult(Event.Result.DENY);
			if (LepidodendronConfig.dimCretaceous == event.getWorld().provider.getDimension() )
				event.setResult(Event.Result.DENY);

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
	            	//Just restrict to minecraft vanilla for the moment:
	                if (checkBiome.equalsIgnoreCase("minecraft")) return true;
	            }
        	}
        	if (checkBiome.equalsIgnoreCase(biome.getRegistryName().toString())) {
                return true;
            }
        }

        return false;
    }
    
}
