package net.lepidodendron;

import net.minecraftforge.event.terraingen.OreGenEvent.GenerateMinable;
import net.minecraftforge.event.terraingen.OreGenEvent.GenerateMinable.EventType;
import net.minecraftforge.fml.common.eventhandler.Event;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;


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
		if (event.getType().equals(EventType.IRON)){
			if (LepidodendronConfig.dimPrecambrian == (int) event.getWorld().provider.getDimension()
			)
				event.setResult(Event.Result.DENY);
		}
		if (event.getType().equals(EventType.DIRT )){ //dirt is blocked to avoid grass etc accidentally appearring
			if (LepidodendronConfig.dimCretaceous == (int) event.getWorld().provider.getDimension()
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
		if (event.getType().equals(EventType.ANDESITE )){
			if (LepidodendronConfig.dimPrecambrian == (int) event.getWorld().provider.getDimension()
			)
				event.setResult(Event.Result.DENY);
		}
		if (event.getType().equals(EventType.GRANITE )){
			if (LepidodendronConfig.dimPrecambrian == (int) event.getWorld().provider.getDimension()
			)
				event.setResult(Event.Result.DENY);
		}
		if (event.getType().equals(EventType.DIORITE )){
			if (LepidodendronConfig.dimPrecambrian == (int) event.getWorld().provider.getDimension()
			)
				event.setResult(Event.Result.DENY);
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
				|| LepidodendronConfig.dimCretaceous == (int) event.getWorld().provider.getDimension()
			)
				event.setResult(Event.Result.DENY);
		}
	}

}