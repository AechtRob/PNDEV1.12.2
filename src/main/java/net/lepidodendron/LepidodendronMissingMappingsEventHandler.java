package net.lepidodendron;

import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.registry.EntityEntry;

public class LepidodendronMissingMappingsEventHandler {

    @SubscribeEvent
    public void fixEntityMappings(RegistryEvent.MissingMappings<EntityEntry> event) {

        for (RegistryEvent.MissingMappings.Mapping<EntityEntry> missing : event.getMappings()) {
            if (missing.key.toString().equalsIgnoreCase("lepidodendron:prehistoric_flora_palaeodictyoptera_delitzschala")
                || missing.key.toString().equalsIgnoreCase("lepidodendron:prehistoric_flora_palaeodictyoptera_dunbaria")
                || missing.key.toString().equalsIgnoreCase("lepidodendron:prehistoric_flora_palaeodictyoptera_homaloneura")
                || missing.key.toString().equalsIgnoreCase("lepidodendron:prehistoric_flora_palaeodictyoptera_homoioptera")
                || missing.key.toString().equalsIgnoreCase("lepidodendron:prehistoric_flora_palaeodictyoptera_lithomantis")
                || missing.key.toString().equalsIgnoreCase("lepidodendron:prehistoric_flora_palaeodictyoptera_lycocercus")
                || missing.key.toString().equalsIgnoreCase("lepidodendron:prehistoric_flora_palaeodictyoptera_sinodunbaria")
                || missing.key.toString().equalsIgnoreCase("lepidodendron:prehistoric_flora_palaeodictyoptera_stenodictya")
            ) {
                missing.ignore(); //We will use a data fixer instead
            }
        }

    }

}
