package net.lepidodendron;

import net.minecraft.util.ResourceLocation;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.registry.EntityEntry;
import net.minecraftforge.fml.common.registry.ForgeRegistries;

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
                || missing.key.toString().equalsIgnoreCase("lepidodendron:prehistoric_flora_palaeodictyoptera_nymph_perm")
                || missing.key.toString().equalsIgnoreCase("lepidodendron:prehistoric_flora_titanoptera_clatrotitan")
                || missing.key.toString().equalsIgnoreCase("lepidodendron:prehistoric_flora_titanoptera_gigatitan")
                || missing.key.toString().equalsIgnoreCase("lepidodendron:prehistoric_flora_titanoptera_mesotitan")
                || missing.key.toString().equalsIgnoreCase("lepidodendron:prehistoric_flora_promissum")
                || missing.key.toString().equalsIgnoreCase("lepidodendron:prehistoric_flora_clydagnathus")
                || missing.key.toString().equalsIgnoreCase("lepidodendron:prehistoric_flora_pneumodesmus")
                || missing.key.toString().equalsIgnoreCase("lepidodendron:prehistoric_flora_eoarthropleura")
            ) {
                missing.ignore(); //We will use a data fixer instead for these
            }
            if (missing.key.toString().equalsIgnoreCase("lepidodendron:prehistoric_flora_ascoceras_baby")
            ) {
                missing.remap((EntityEntry)ForgeRegistries.ENTITIES.getValue(new ResourceLocation("lepidodendron:prehistoric_flora_ascoceras")));
            }
        }

    }

}
