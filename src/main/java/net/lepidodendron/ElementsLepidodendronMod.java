package net.lepidodendron;

import it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import net.lepidodendron.gui.*;
import net.minecraft.block.Block;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.IChunkGenerator;
import net.minecraft.world.storage.WorldSavedData;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.IFuelHandler;
import net.minecraftforge.fml.common.IWorldGenerator;
import net.minecraftforge.fml.common.discovery.ASMDataTable;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.event.FMLServerStartingEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.network.IGuiHandler;
import net.minecraftforge.fml.common.network.simpleimpl.IMessage;
import net.minecraftforge.fml.common.network.simpleimpl.IMessageHandler;
import net.minecraftforge.fml.common.registry.EntityEntry;
import net.minecraftforge.fml.relauncher.Side;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.function.Supplier;

public class ElementsLepidodendronMod implements IFuelHandler, IWorldGenerator {
	public final List<ModElement> elements = new ObjectArrayList <> ();
	public final List<Supplier<Block>> blocks = new ObjectArrayList <>();
	public final List<Supplier<Item>> items = new ObjectArrayList <>();
	public final List<Supplier<Biome>> biomes = new ObjectArrayList <>();
	public final List<Supplier<EntityEntry>> entities = new ObjectArrayList <>();
	public final List<Supplier<Potion>> potions = new ObjectArrayList <>();
	public static Object2ObjectOpenHashMap<ResourceLocation, net.minecraft.util.SoundEvent> sounds = new Object2ObjectOpenHashMap<>();
	public ElementsLepidodendronMod() {
		sounds.put(new ResourceLocation("lepidodendron", "wet_crunch_plants"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "wet_crunch_plants")));
		sounds.put(new ResourceLocation("lepidodendron", "dry_crunch_plants"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "dry_crunch_plants")));
		sounds.put(new ResourceLocation("lepidodendron", "open_drawer"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "open_drawer")));
		sounds.put(new ResourceLocation("lepidodendron", "close_drawer"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "close_drawer")));
		sounds.put(new ResourceLocation("lepidodendron", "open_cabinet"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "open_cabinet")));
		sounds.put(new ResourceLocation("lepidodendron", "close_cabinet"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "close_cabinet")));
		sounds.put(new ResourceLocation("lepidodendron", "respawner"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "respawner")));
		sounds.put(new ResourceLocation("lepidodendron", "submarine_bubble_jet"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "submarine_bubble_jet")));
		sounds.put(new ResourceLocation("lepidodendron", "submarine_claw"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "submarine_claw")));
		sounds.put(new ResourceLocation("lepidodendron", "expert_advancement"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "expert_advancement")));
		sounds.put(new ResourceLocation("lepidodendron", "portal_block_initialise"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "portal_block_initialise")));
		sounds.put(new ResourceLocation("lepidodendron", "portal_block_close"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "portal_block_close")));
		sounds.put(new ResourceLocation("lepidodendron", "portal_block_ambient"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "portal_block_ambient")));
		sounds.put(new ResourceLocation("lepidodendron", "portal_block_water_drain"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "portal_block_water_drain")));
		sounds.put(new ResourceLocation("lepidodendron", "portal_block_precambrian"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "portal_block_precambrian")));
		sounds.put(new ResourceLocation("lepidodendron", "portal_block_ordovician"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "portal_block_ordovician")));
		sounds.put(new ResourceLocation("lepidodendron", "portal_block_silurian"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "portal_block_silurian")));
		sounds.put(new ResourceLocation("lepidodendron", "portal_block_devonian"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "portal_block_devonian")));
		sounds.put(new ResourceLocation("lepidodendron", "portal_block_carboniferous"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "portal_block_carboniferous")));
		sounds.put(new ResourceLocation("lepidodendron", "portal_block_permian"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "portal_block_permian")));
		sounds.put(new ResourceLocation("lepidodendron", "portal_block_triassic"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "portal_block_triassic")));
		sounds.put(new ResourceLocation("lepidodendron", "portal_block_jurassic"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "portal_block_jurassic")));
		sounds.put(new ResourceLocation("lepidodendron", "time_researcher_crusher"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "time_researcher_crusher")));
		sounds.put(new ResourceLocation("lepidodendron", "time_researcher_laser"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "time_researcher_laser")));
		sounds.put(new ResourceLocation("lepidodendron", "eoarthropleura_idle"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "eoarthropleura_idle")));
		sounds.put(new ResourceLocation("lepidodendron", "eoarthropleura_hurt"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "eoarthropleura_hurt")));
		sounds.put(new ResourceLocation("lepidodendron", "eoarthropleura_death"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "eoarthropleura_death")));
		sounds.put(new ResourceLocation("lepidodendron", "pneudodesmus_idle"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "pneudodesmus_idle")));
		sounds.put(new ResourceLocation("lepidodendron", "pneudodesmus_hurt"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "pneudodesmus_hurt")));
		sounds.put(new ResourceLocation("lepidodendron", "pneudodesmus_death"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "pneudodesmus_death")));
		sounds.put(new ResourceLocation("lepidodendron", "palaeodictyoptera_idle"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "palaeodictyoptera_idle")));
		sounds.put(new ResourceLocation("lepidodendron", "palaeodictyoptera_flight"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "palaeodictyoptera_flight")));
		sounds.put(new ResourceLocation("lepidodendron", "limnoscelis_idle"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "limnoscelis_idle")));
		sounds.put(new ResourceLocation("lepidodendron", "limnoscelis_hurt"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "limnoscelis_hurt")));
		sounds.put(new ResourceLocation("lepidodendron", "limnoscelis_death"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "limnoscelis_death")));
		sounds.put(new ResourceLocation("lepidodendron", "amphibamus_idle"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "amphibamus_idle")));
		sounds.put(new ResourceLocation("lepidodendron", "amphibamus_hurt"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "amphibamus_hurt")));
		sounds.put(new ResourceLocation("lepidodendron", "amphibamus_death"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "amphibamus_death")));
		sounds.put(new ResourceLocation("lepidodendron", "ichthyostega_idle"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "ichthyostega_idle")));
		sounds.put(new ResourceLocation("lepidodendron", "ichthyostega_hurt"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "ichthyostega_hurt")));
		sounds.put(new ResourceLocation("lepidodendron", "ichthyostega_death"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "ichthyostega_death")));
		sounds.put(new ResourceLocation("lepidodendron", "trigonotarbid_idle"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "trigonotarbid_idle")));
		sounds.put(new ResourceLocation("lepidodendron", "trigonotarbid_hurt"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "trigonotarbid_hurt")));
		sounds.put(new ResourceLocation("lepidodendron", "trigonotarbid_death"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "trigonotarbid_death")));
		sounds.put(new ResourceLocation("lepidodendron", "megalocephalus_idle"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "megalocephalus_idle")));
		sounds.put(new ResourceLocation("lepidodendron", "megalocephalus_hurt"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "megalocephalus_hurt")));
		sounds.put(new ResourceLocation("lepidodendron", "megalocephalus_death"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "megalocephalus_death")));
		sounds.put(new ResourceLocation("lepidodendron", "hylonomus_idle"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "hylonomus_idle")));
		sounds.put(new ResourceLocation("lepidodendron", "hylonomus_hurt"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "hylonomus_hurt")));
		sounds.put(new ResourceLocation("lepidodendron", "hylonomus_death"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "hylonomus_death")));
		sounds.put(new ResourceLocation("lepidodendron", "moschops_idle"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "moschops_idle")));
		sounds.put(new ResourceLocation("lepidodendron", "moschops_hurt"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "moschops_hurt")));
		sounds.put(new ResourceLocation("lepidodendron", "moschops_death"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "moschops_death")));
		sounds.put(new ResourceLocation("lepidodendron", "eryops_idle"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "eryops_idle")));
		sounds.put(new ResourceLocation("lepidodendron", "eryops_hurt"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "eryops_hurt")));
		sounds.put(new ResourceLocation("lepidodendron", "eryops_death"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "eryops_death")));
		sounds.put(new ResourceLocation("lepidodendron", "cotylorhynchus_idle"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "cotylorhynchus_idle")));
		sounds.put(new ResourceLocation("lepidodendron", "cotylorhynchus_hurt"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "cotylorhynchus_hurt")));
		sounds.put(new ResourceLocation("lepidodendron", "cotylorhynchus_death"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "cotylorhynchus_death")));
		sounds.put(new ResourceLocation("lepidodendron", "ophiacodon_idle"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "ophiacodon_idle")));
		sounds.put(new ResourceLocation("lepidodendron", "ophiacodon_hurt"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "ophiacodon_hurt")));
		sounds.put(new ResourceLocation("lepidodendron", "ophiacodon_death"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "ophiacodon_death")));
		sounds.put(new ResourceLocation("lepidodendron", "dimetrodon_idle"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "dimetrodon_idle")));
		sounds.put(new ResourceLocation("lepidodendron", "dimetrodon_hurt"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "dimetrodon_hurt")));
		sounds.put(new ResourceLocation("lepidodendron", "dimetrodon_death"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "dimetrodon_death")));
		sounds.put(new ResourceLocation("lepidodendron", "inostrancevia_idle"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "inostrancevia_idle")));
		sounds.put(new ResourceLocation("lepidodendron", "inostrancevia_hurt"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "inostrancevia_hurt")));
		sounds.put(new ResourceLocation("lepidodendron", "inostrancevia_death"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "inostrancevia_death")));
		sounds.put(new ResourceLocation("lepidodendron", "inostrancevia_roar"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "inostrancevia_roar")));
		sounds.put(new ResourceLocation("lepidodendron", "gorgonops_idle"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "gorgonops_idle")));
		sounds.put(new ResourceLocation("lepidodendron", "gorgonops_hurt"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "gorgonops_hurt")));
		sounds.put(new ResourceLocation("lepidodendron", "gorgonops_death"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "gorgonops_death")));
		sounds.put(new ResourceLocation("lepidodendron", "sphenacodon_idle"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "sphenacodon_idle")));
		sounds.put(new ResourceLocation("lepidodendron", "sphenacodon_hurt"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "sphenacodon_hurt")));
		sounds.put(new ResourceLocation("lepidodendron", "sphenacodon_death"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "sphenacodon_death")));
		sounds.put(new ResourceLocation("lepidodendron", "pederpes_idle"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "pederpes_idle")));
		sounds.put(new ResourceLocation("lepidodendron", "pederpes_hurt"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "pederpes_hurt")));
		sounds.put(new ResourceLocation("lepidodendron", "pederpes_death"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "pederpes_death")));
		sounds.put(new ResourceLocation("lepidodendron", "scutosaurus_idle"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "scutosaurus_idle")));
		sounds.put(new ResourceLocation("lepidodendron", "scutosaurus_hurt"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "scutosaurus_hurt")));
		sounds.put(new ResourceLocation("lepidodendron", "scutosaurus_death"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "scutosaurus_death")));
		sounds.put(new ResourceLocation("lepidodendron", "vivaxosaurus_idle"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "vivaxosaurus_idle")));
		sounds.put(new ResourceLocation("lepidodendron", "vivaxosaurus_hurt"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "vivaxosaurus_hurt")));
		sounds.put(new ResourceLocation("lepidodendron", "vivaxosaurus_death"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "vivaxosaurus_death")));
		sounds.put(new ResourceLocation("lepidodendron", "estemmenosuchus_idle"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "estemmenosuchus_idle")));
		sounds.put(new ResourceLocation("lepidodendron", "estemmenosuchus_hurt"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "estemmenosuchus_hurt")));
		sounds.put(new ResourceLocation("lepidodendron", "estemmenosuchus_death"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "estemmenosuchus_death")));
		sounds.put(new ResourceLocation("lepidodendron", "estemmenosuchus_roar"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "estemmenosuchus_roar")));
		sounds.put(new ResourceLocation("lepidodendron", "diictodon_idle"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "diictodon_idle")));
		sounds.put(new ResourceLocation("lepidodendron", "diictodon_hurt"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "diictodon_hurt")));
		sounds.put(new ResourceLocation("lepidodendron", "diictodon_death"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "diictodon_death")));
		sounds.put(new ResourceLocation("lepidodendron", "diictodon_alarm"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "diictodon_alarm")));
		sounds.put(new ResourceLocation("lepidodendron", "meganeuropsis_flight"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "meganeuropsis_flight")));
		sounds.put(new ResourceLocation("lepidodendron", "meganeuropsis_hurt"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "meganeuropsis_hurt")));
		sounds.put(new ResourceLocation("lepidodendron", "meganeuropsis_death"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "meganeuropsis_death")));
		sounds.put(new ResourceLocation("lepidodendron", "mesosaurus_idle"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "mesosaurus_idle")));
		sounds.put(new ResourceLocation("lepidodendron", "mesosaurus_hurt"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "mesosaurus_hurt")));
		sounds.put(new ResourceLocation("lepidodendron", "mesosaurus_death"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "mesosaurus_death")));
		sounds.put(new ResourceLocation("lepidodendron", "claudiosaurus_idle"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "claudiosaurus_idle")));
		sounds.put(new ResourceLocation("lepidodendron", "claudiosaurus_hurt"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "claudiosaurus_hurt")));
		sounds.put(new ResourceLocation("lepidodendron", "claudiosaurus_death"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "claudiosaurus_death")));
		sounds.put(new ResourceLocation("lepidodendron", "diadectes_idle"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "diadectes_idle")));
		sounds.put(new ResourceLocation("lepidodendron", "diadectes_hurt"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "diadectes_hurt")));
		sounds.put(new ResourceLocation("lepidodendron", "diadectes_death"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "diadectes_death")));
		sounds.put(new ResourceLocation("lepidodendron", "labidosaurus_idle"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "labidosaurus_idle")));
		sounds.put(new ResourceLocation("lepidodendron", "labidosaurus_hurt"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "labidosaurus_hurt")));
		sounds.put(new ResourceLocation("lepidodendron", "labidosaurus_death"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "labidosaurus_death")));
		sounds.put(new ResourceLocation("lepidodendron", "platyhystrix_idle"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "platyhystrix_idle")));
		sounds.put(new ResourceLocation("lepidodendron", "platyhystrix_hurt"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "platyhystrix_hurt")));
		sounds.put(new ResourceLocation("lepidodendron", "platyhystrix_death"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "platyhystrix_death")));
		sounds.put(new ResourceLocation("lepidodendron", "pholiderpeton_idle"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "pholiderpeton_idle")));
		sounds.put(new ResourceLocation("lepidodendron", "pholiderpeton_hurt"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "pholiderpeton_hurt")));
		sounds.put(new ResourceLocation("lepidodendron", "pholiderpeton_death"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "pholiderpeton_death")));
		sounds.put(new ResourceLocation("lepidodendron", "prionosuchus_idle"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "prionosuchus_idle")));
		sounds.put(new ResourceLocation("lepidodendron", "prionosuchus_hurt"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "prionosuchus_hurt")));
		sounds.put(new ResourceLocation("lepidodendron", "prionosuchus_death"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "prionosuchus_death")));
		sounds.put(new ResourceLocation("lepidodendron", "acanthostomatops_idle"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "acanthostomatops_idle")));
		sounds.put(new ResourceLocation("lepidodendron", "acanthostomatops_hurt"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "acanthostomatops_hurt")));
		sounds.put(new ResourceLocation("lepidodendron", "acanthostomatops_death"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "acanthostomatops_death")));
		sounds.put(new ResourceLocation("lepidodendron", "dvinia_idle"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "dvinia_idle")));
		sounds.put(new ResourceLocation("lepidodendron", "dvinia_hurt"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "dvinia_hurt")));
		sounds.put(new ResourceLocation("lepidodendron", "dvinia_death"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "dvinia_death")));
		sounds.put(new ResourceLocation("lepidodendron", "dvinia_alarm"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "dvinia_alarm")));
		sounds.put(new ResourceLocation("lepidodendron", "panderichthys_breathe"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "panderichthys_breathe")));
		sounds.put(new ResourceLocation("lepidodendron", "acanthostega_idle"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "acanthostega_idle")));
		sounds.put(new ResourceLocation("lepidodendron", "acanthostega_hurt"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "acanthostega_hurt")));
		sounds.put(new ResourceLocation("lepidodendron", "acanthostega_death"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "acanthostega_death")));
		sounds.put(new ResourceLocation("lepidodendron", "tapinocephalus_idle"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "tapinocephalus_idle")));
		sounds.put(new ResourceLocation("lepidodendron", "tapinocephalus_hurt"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "tapinocephalus_hurt")));
		sounds.put(new ResourceLocation("lepidodendron", "tapinocephalus_death"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "tapinocephalus_death")));
		sounds.put(new ResourceLocation("lepidodendron", "tapinocephalus_headbut"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "tapinocephalus_headbut")));
		sounds.put(new ResourceLocation("lepidodendron", "criocephalosaurus_idle"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "criocephalosaurus_idle")));
		sounds.put(new ResourceLocation("lepidodendron", "criocephalosaurus_hurt"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "criocephalosaurus_hurt")));
		sounds.put(new ResourceLocation("lepidodendron", "criocephalosaurus_death"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "criocephalosaurus_death")));
		sounds.put(new ResourceLocation("lepidodendron", "lacewing_flight"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "lacewing_flight")));
		sounds.put(new ResourceLocation("lepidodendron", "bug_flight"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "bug_flight")));
		sounds.put(new ResourceLocation("lepidodendron", "bug_hurt"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "bug_hurt")));
		sounds.put(new ResourceLocation("lepidodendron", "bug_death"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "bug_death")));
		sounds.put(new ResourceLocation("lepidodendron", "proterogyrinus_idle"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "proterogyrinus_idle")));
		sounds.put(new ResourceLocation("lepidodendron", "proterogyrinus_hurt"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "proterogyrinus_hurt")));
		sounds.put(new ResourceLocation("lepidodendron", "proterogyrinus_death"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "proterogyrinus_death")));
		sounds.put(new ResourceLocation("lepidodendron", "remigiomontanus_idle"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "remigiomontanus_idle")));
		sounds.put(new ResourceLocation("lepidodendron", "remigiomontanus_hurt"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "remigiomontanus_hurt")));
		sounds.put(new ResourceLocation("lepidodendron", "remigiomontanus_death"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "remigiomontanus_death")));
		sounds.put(new ResourceLocation("lepidodendron", "procynosuchus_idle"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "procynosuchus_idle")));
		sounds.put(new ResourceLocation("lepidodendron", "procynosuchus_hurt"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "procynosuchus_hurt")));
		sounds.put(new ResourceLocation("lepidodendron", "procynosuchus_death"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "procynosuchus_death")));
		sounds.put(new ResourceLocation("lepidodendron", "anteosaurus_idle"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "anteosaurus_idle")));
		sounds.put(new ResourceLocation("lepidodendron", "anteosaurus_hurt"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "anteosaurus_hurt")));
		sounds.put(new ResourceLocation("lepidodendron", "anteosaurus_death"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "anteosaurus_death")));
		sounds.put(new ResourceLocation("lepidodendron", "anteosaurus_threat"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "anteosaurus_threat")));
		sounds.put(new ResourceLocation("lepidodendron", "coelophysis_idle"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "coelophysis_idle")));
		sounds.put(new ResourceLocation("lepidodendron", "coelophysis_hurt"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "coelophysis_hurt")));
		sounds.put(new ResourceLocation("lepidodendron", "coelophysis_death"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "coelophysis_death")));
		sounds.put(new ResourceLocation("lepidodendron", "coelophysis_roar"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "coelophysis_roar")));
		sounds.put(new ResourceLocation("lepidodendron", "lystrosaurus_idle"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "lystrosaurus_idle")));
		sounds.put(new ResourceLocation("lepidodendron", "lystrosaurus_hurt"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "lystrosaurus_hurt")));
		sounds.put(new ResourceLocation("lepidodendron", "lystrosaurus_death"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "lystrosaurus_death")));
		sounds.put(new ResourceLocation("lepidodendron", "suminia_idle"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "suminia_idle")));
		sounds.put(new ResourceLocation("lepidodendron", "suminia_hurt"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "suminia_hurt")));
		sounds.put(new ResourceLocation("lepidodendron", "suminia_death"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "suminia_death")));
		sounds.put(new ResourceLocation("lepidodendron", "suminia_alarm"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "suminia_alarm")));
		sounds.put(new ResourceLocation("lepidodendron", "lisowicia_idle"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "lisowicia_idle")));
		sounds.put(new ResourceLocation("lepidodendron", "lisowicia_hurt"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "lisowicia_hurt")));
		sounds.put(new ResourceLocation("lepidodendron", "lisowicia_death"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "lisowicia_death")));
		sounds.put(new ResourceLocation("lepidodendron", "lisowicia_roar"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "lisowicia_roar")));
		sounds.put(new ResourceLocation("lepidodendron", "liliensternus_idle"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "liliensternus_idle")));
		sounds.put(new ResourceLocation("lepidodendron", "liliensternus_hurt"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "liliensternus_hurt")));
		sounds.put(new ResourceLocation("lepidodendron", "liliensternus_death"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "liliensternus_death")));
		sounds.put(new ResourceLocation("lepidodendron", "liliensternus_roar"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "liliensternus_roar")));
		sounds.put(new ResourceLocation("lepidodendron", "weigeltisaurid_idle"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "weigeltisaurid_idle")));
		sounds.put(new ResourceLocation("lepidodendron", "weigeltisaurid_hurt"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "weigeltisaurid_hurt")));
		sounds.put(new ResourceLocation("lepidodendron", "weigeltisaurid_death"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "weigeltisaurid_death")));
		sounds.put(new ResourceLocation("lepidodendron", "eoraptor_idle"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "eoraptor_idle")));
		sounds.put(new ResourceLocation("lepidodendron", "eoraptor_hurt"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "eoraptor_hurt")));
		sounds.put(new ResourceLocation("lepidodendron", "eoraptor_death"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "eoraptor_death")));
		sounds.put(new ResourceLocation("lepidodendron", "shringasaurus_idle"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "shringasaurus_idle")));
		sounds.put(new ResourceLocation("lepidodendron", "shringasaurus_hurt"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "shringasaurus_hurt")));
		sounds.put(new ResourceLocation("lepidodendron", "shringasaurus_death"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "shringasaurus_death")));
		sounds.put(new ResourceLocation("lepidodendron", "herrerasaurus_idle"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "herrerasaurus_idle")));
		sounds.put(new ResourceLocation("lepidodendron", "herrerasaurus_hurt"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "herrerasaurus_hurt")));
		sounds.put(new ResourceLocation("lepidodendron", "herrerasaurus_death"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "herrerasaurus_death")));
		sounds.put(new ResourceLocation("lepidodendron", "archosaurus_idle"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "archosaurus_idle")));
		sounds.put(new ResourceLocation("lepidodendron", "archosaurus_hurt"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "archosaurus_hurt")));
		sounds.put(new ResourceLocation("lepidodendron", "archosaurus_death"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "archosaurus_death")));
		sounds.put(new ResourceLocation("lepidodendron", "plateosaurus_idle"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "plateosaurus_idle")));
		sounds.put(new ResourceLocation("lepidodendron", "plateosaurus_hurt"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "plateosaurus_hurt")));
		sounds.put(new ResourceLocation("lepidodendron", "plateosaurus_death"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "plateosaurus_death")));
		sounds.put(new ResourceLocation("lepidodendron", "plateosaurus_roar"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "plateosaurus_roar")));
		sounds.put(new ResourceLocation("lepidodendron", "cynognathus_idle"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "cynognathus_idle")));
		sounds.put(new ResourceLocation("lepidodendron", "cynognathus_hurt"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "cynognathus_hurt")));
		sounds.put(new ResourceLocation("lepidodendron", "cynognathus_death"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "cynognathus_death")));
		sounds.put(new ResourceLocation("lepidodendron", "cynognathus_roar"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "cynognathus_roar")));
		sounds.put(new ResourceLocation("lepidodendron", "placerias_idle"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "placerias_idle")));
		sounds.put(new ResourceLocation("lepidodendron", "placerias_hurt"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "placerias_hurt")));
		sounds.put(new ResourceLocation("lepidodendron", "placerias_death"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "placerias_death")));
		sounds.put(new ResourceLocation("lepidodendron", "placerias_roar"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "placerias_roar")));
		sounds.put(new ResourceLocation("lepidodendron", "elginia_idle"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "elginia_idle")));
		sounds.put(new ResourceLocation("lepidodendron", "elginia_hurt"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "elginia_hurt")));
		sounds.put(new ResourceLocation("lepidodendron", "elginia_death"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "elginia_death")));
		sounds.put(new ResourceLocation("lepidodendron", "bunostegos_idle"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "bunostegos_idle")));
		sounds.put(new ResourceLocation("lepidodendron", "bunostegos_hurt"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "bunostegos_hurt")));
		sounds.put(new ResourceLocation("lepidodendron", "bunostegos_death"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "bunostegos_death")));
		sounds.put(new ResourceLocation("lepidodendron", "pristerognathus_idle"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "pristerognathus_idle")));
		sounds.put(new ResourceLocation("lepidodendron", "pristerognathus_hurt"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "pristerognathus_hurt")));
		sounds.put(new ResourceLocation("lepidodendron", "pristerognathus_death"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "pristerognathus_death")));
		sounds.put(new ResourceLocation("lepidodendron", "euchambersia_idle"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "euchambersia_idle")));
		sounds.put(new ResourceLocation("lepidodendron", "euchambersia_hurt"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "euchambersia_hurt")));
		sounds.put(new ResourceLocation("lepidodendron", "euchambersia_death"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "euchambersia_death")));
		sounds.put(new ResourceLocation("lepidodendron", "euchambersia_alarm"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "euchambersia_alarm")));
		sounds.put(new ResourceLocation("lepidodendron", "thrinaxodon_idle"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "thrinaxodon_idle")));
		sounds.put(new ResourceLocation("lepidodendron", "thrinaxodon_hurt"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "thrinaxodon_hurt")));
		sounds.put(new ResourceLocation("lepidodendron", "thrinaxodon_death"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "thrinaxodon_death")));
		sounds.put(new ResourceLocation("lepidodendron", "thrinaxodon_roar"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "thrinaxodon_roar")));
		sounds.put(new ResourceLocation("lepidodendron", "postosuchus_idle"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "postosuchus_idle")));
		sounds.put(new ResourceLocation("lepidodendron", "postosuchus_hurt"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "postosuchus_hurt")));
		sounds.put(new ResourceLocation("lepidodendron", "postosuchus_death"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "postosuchus_death")));
		sounds.put(new ResourceLocation("lepidodendron", "postosuchus_roar"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "postosuchus_roar")));
		sounds.put(new ResourceLocation("lepidodendron", "effigia_idle"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "effigia_idle")));
		sounds.put(new ResourceLocation("lepidodendron", "effigia_hurt"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "effigia_hurt")));
		sounds.put(new ResourceLocation("lepidodendron", "effigia_death"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "effigia_death")));
		sounds.put(new ResourceLocation("lepidodendron", "sillosuchus_idle"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "sillosuchus_idle")));
		sounds.put(new ResourceLocation("lepidodendron", "sillosuchus_hurt"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "sillosuchus_hurt")));
		sounds.put(new ResourceLocation("lepidodendron", "sillosuchus_death"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "sillosuchus_death")));
		sounds.put(new ResourceLocation("lepidodendron", "edaphosaurus_idle"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "edaphosaurus_idle")));
		sounds.put(new ResourceLocation("lepidodendron", "edaphosaurus_hurt"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "edaphosaurus_hurt")));
		sounds.put(new ResourceLocation("lepidodendron", "edaphosaurus_death"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "edaphosaurus_death")));
		sounds.put(new ResourceLocation("lepidodendron", "austriadactylus_idle"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "austriadactylus_idle")));
		sounds.put(new ResourceLocation("lepidodendron", "austriadactylus_hurt"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "austriadactylus_hurt")));
		sounds.put(new ResourceLocation("lepidodendron", "austriadactylus_death"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "austriadactylus_death")));
		sounds.put(new ResourceLocation("lepidodendron", "caelestiventus_idle"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "caelestiventus_idle")));
		sounds.put(new ResourceLocation("lepidodendron", "caelestiventus_hurt"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "caelestiventus_hurt")));
		sounds.put(new ResourceLocation("lepidodendron", "caelestiventus_death"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "caelestiventus_death")));
		sounds.put(new ResourceLocation("lepidodendron", "eudimorphodon_idle"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "eudimorphodon_idle")));
		sounds.put(new ResourceLocation("lepidodendron", "eudimorphodon_hurt"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "eudimorphodon_hurt")));
		sounds.put(new ResourceLocation("lepidodendron", "eudimorphodon_death"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "eudimorphodon_death")));
		sounds.put(new ResourceLocation("lepidodendron", "caviramus_idle"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "caviramus_idle")));
		sounds.put(new ResourceLocation("lepidodendron", "caviramus_hurt"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "caviramus_hurt")));
		sounds.put(new ResourceLocation("lepidodendron", "caviramus_death"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "caviramus_death")));
		sounds.put(new ResourceLocation("lepidodendron", "shonisaurus_idle"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "shonisaurus_idle")));
		sounds.put(new ResourceLocation("lepidodendron", "shonisaurus_hurt"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "shonisaurus_hurt")));
		sounds.put(new ResourceLocation("lepidodendron", "shonisaurus_death"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "shonisaurus_death")));
		sounds.put(new ResourceLocation("lepidodendron", "shonisaurus_blowhole"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "shonisaurus_blowhole")));
		sounds.put(new ResourceLocation("lepidodendron", "protozygoptera_idle"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "protozygoptera_idle")));
		sounds.put(new ResourceLocation("lepidodendron", "protozygoptera_flight"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "protozygoptera_flight")));
		sounds.put(new ResourceLocation("lepidodendron", "desmatosuchus_idle"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "desmatosuchus_idle")));
		sounds.put(new ResourceLocation("lepidodendron", "desmatosuchus_hurt"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "desmatosuchus_hurt")));
		sounds.put(new ResourceLocation("lepidodendron", "desmatosuchus_death"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "desmatosuchus_death")));
		sounds.put(new ResourceLocation("lepidodendron", "hypsognathus_hurt"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "hypsognathus_hurt")));
		sounds.put(new ResourceLocation("lepidodendron", "hypsognathus_death"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "hypsognathus_death")));
		sounds.put(new ResourceLocation("lepidodendron", "lessemsaurus_idle"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "lessemsaurus_idle")));
		sounds.put(new ResourceLocation("lepidodendron", "lessemsaurus_hurt"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "lessemsaurus_hurt")));
		sounds.put(new ResourceLocation("lepidodendron", "lessemsaurus_death"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "lessemsaurus_death")));
		sounds.put(new ResourceLocation("lepidodendron", "lessemsaurus_roar"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "lessemsaurus_roar")));
		sounds.put(new ResourceLocation("lepidodendron", "tiny_mammaliaform_idle"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "tiny_mammaliaform_idle")));
		sounds.put(new ResourceLocation("lepidodendron", "tiny_mammaliaform_hurt"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "tiny_mammaliaform_hurt")));
		sounds.put(new ResourceLocation("lepidodendron", "tiny_mammaliaform_death"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "tiny_mammaliaform_death")));
		sounds.put(new ResourceLocation("lepidodendron", "cartorhynchus_idle"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "cartorhynchus_idle")));
		sounds.put(new ResourceLocation("lepidodendron", "cartorhynchus_hurt"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "cartorhynchus_hurt")));
		sounds.put(new ResourceLocation("lepidodendron", "cartorhynchus_death"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "cartorhynchus_death")));
		sounds.put(new ResourceLocation("lepidodendron", "smilosuchus_idle"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "smilosuchus_idle")));
		sounds.put(new ResourceLocation("lepidodendron", "smilosuchus_hurt"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "smilosuchus_hurt")));
		sounds.put(new ResourceLocation("lepidodendron", "smilosuchus_death"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "smilosuchus_death")));
		sounds.put(new ResourceLocation("lepidodendron", "vancleavea_idle"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "vancleavea_idle")));
		sounds.put(new ResourceLocation("lepidodendron", "vancleavea_hurt"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "vancleavea_hurt")));
		sounds.put(new ResourceLocation("lepidodendron", "vancleavea_death"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "vancleavea_death")));
		sounds.put(new ResourceLocation("lepidodendron", "atopodentatus_idle"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "atopodentatus_idle")));
		sounds.put(new ResourceLocation("lepidodendron", "atopodentatus_hurt"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "atopodentatus_hurt")));
		sounds.put(new ResourceLocation("lepidodendron", "atopodentatus_death"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "atopodentatus_death")));
		sounds.put(new ResourceLocation("lepidodendron", "euparkeria_idle"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "euparkeria_idle")));
		sounds.put(new ResourceLocation("lepidodendron", "euparkeria_hurt"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "euparkeria_hurt")));
		sounds.put(new ResourceLocation("lepidodendron", "euparkeria_death"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "euparkeria_death")));
		sounds.put(new ResourceLocation("lepidodendron", "pseudotherium_idle"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "pseudotherium_idle")));
		sounds.put(new ResourceLocation("lepidodendron", "pseudotherium_hurt"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "pseudotherium_hurt")));
		sounds.put(new ResourceLocation("lepidodendron", "pseudotherium_death"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "pseudotherium_death")));
		sounds.put(new ResourceLocation("lepidodendron", "keichousaurus_hurt"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "keichousaurus_hurt")));
		sounds.put(new ResourceLocation("lepidodendron", "keichousaurus_death"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "keichousaurus_death")));
		sounds.put(new ResourceLocation("lepidodendron", "turtle_hurt"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "turtle_hurt")));
		sounds.put(new ResourceLocation("lepidodendron", "turtle_death"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "turtle_death")));
		sounds.put(new ResourceLocation("lepidodendron", "sphenotitan_hurt"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "sphenotitan_hurt")));
		sounds.put(new ResourceLocation("lepidodendron", "sphenotitan_death"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "sphenotitan_death")));
		sounds.put(new ResourceLocation("lepidodendron", "mussaurus_idle"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "mussaurus_idle")));
		sounds.put(new ResourceLocation("lepidodendron", "mussaurus_hurt"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "mussaurus_hurt")));
		sounds.put(new ResourceLocation("lepidodendron", "mussaurus_death"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "mussaurus_death")));
		sounds.put(new ResourceLocation("lepidodendron", "henodus_idle"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "henodus_idle")));
		sounds.put(new ResourceLocation("lepidodendron", "henodus_hurt"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "henodus_hurt")));
		sounds.put(new ResourceLocation("lepidodendron", "henodus_death"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "henodus_death")));
		sounds.put(new ResourceLocation("lepidodendron", "mastodonsaurus_idle"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "mastodonsaurus_idle")));
		sounds.put(new ResourceLocation("lepidodendron", "mastodonsaurus_hurt"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "mastodonsaurus_hurt")));
		sounds.put(new ResourceLocation("lepidodendron", "mastodonsaurus_death"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "mastodonsaurus_death")));
		sounds.put(new ResourceLocation("lepidodendron", "titanoptera_idle"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "titanoptera_idle")));
		sounds.put(new ResourceLocation("lepidodendron", "melosaurus_idle"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "melosaurus_idle")));
		sounds.put(new ResourceLocation("lepidodendron", "melosaurus_hurt"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "melosaurus_hurt")));
		sounds.put(new ResourceLocation("lepidodendron", "melosaurus_death"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "melosaurus_death")));
		sounds.put(new ResourceLocation("lepidodendron", "dasyceps_idle"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "dasyceps_idle")));
		sounds.put(new ResourceLocation("lepidodendron", "dasyceps_hurt"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "dasyceps_hurt")));
		sounds.put(new ResourceLocation("lepidodendron", "dasyceps_death"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "dasyceps_death")));
		sounds.put(new ResourceLocation("lepidodendron", "ascendonanus_idle"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "ascendonanus_idle")));
		sounds.put(new ResourceLocation("lepidodendron", "ascendonanus_hurt"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "ascendonanus_hurt")));
		sounds.put(new ResourceLocation("lepidodendron", "ascendonanus_death"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "ascendonanus_death")));
		sounds.put(new ResourceLocation("lepidodendron", "aulacephalodon_idle"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "aulacephalodon_idle")));
		sounds.put(new ResourceLocation("lepidodendron", "aulacephalodon_hurt"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "aulacephalodon_hurt")));
		sounds.put(new ResourceLocation("lepidodendron", "aulacephalodon_death"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "aulacephalodon_death")));
		sounds.put(new ResourceLocation("lepidodendron", "cacops_idle"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "cacops_idle")));
		sounds.put(new ResourceLocation("lepidodendron", "cacops_hurt"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "cacops_hurt")));
		sounds.put(new ResourceLocation("lepidodendron", "cacops_death"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "cacops_death")));
		sounds.put(new ResourceLocation("lepidodendron", "casineria_idle"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "casineria_idle")));
		sounds.put(new ResourceLocation("lepidodendron", "casineria_hurt"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "casineria_hurt")));
		sounds.put(new ResourceLocation("lepidodendron", "casineria_death"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "casineria_death")));
		sounds.put(new ResourceLocation("lepidodendron", "clevosaurus_hurt"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "clevosaurus_hurt")));
		sounds.put(new ResourceLocation("lepidodendron", "clevosaurus_death"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "clevosaurus_death")));
		sounds.put(new ResourceLocation("lepidodendron", "cymbospondylus_idle"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "cymbospondylus_idle")));
		sounds.put(new ResourceLocation("lepidodendron", "cymbospondylus_hurt"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "cymbospondylus_hurt")));
		sounds.put(new ResourceLocation("lepidodendron", "cymbospondylus_death"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "cymbospondylus_death")));
		sounds.put(new ResourceLocation("lepidodendron", "hyperodapedon_idle"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "hyperodapedon_idle")));
		sounds.put(new ResourceLocation("lepidodendron", "hyperodapedon_hurt"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "hyperodapedon_hurt")));
		sounds.put(new ResourceLocation("lepidodendron", "hyperodapedon_death"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "hyperodapedon_death")));
		sounds.put(new ResourceLocation("lepidodendron", "jonkeria_idle"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "jonkeria_idle")));
		sounds.put(new ResourceLocation("lepidodendron", "jonkeria_hurt"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "jonkeria_hurt")));
		sounds.put(new ResourceLocation("lepidodendron", "jonkeria_death"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "jonkeria_death")));
		sounds.put(new ResourceLocation("lepidodendron", "lotosaurus_idle"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "lotosaurus_idle")));
		sounds.put(new ResourceLocation("lepidodendron", "lotosaurus_hurt"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "lotosaurus_hurt")));
		sounds.put(new ResourceLocation("lepidodendron", "lotosaurus_death"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "lotosaurus_death")));
		sounds.put(new ResourceLocation("lepidodendron", "panzhousaurus_idle"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "panzhousaurus_idle")));
		sounds.put(new ResourceLocation("lepidodendron", "panzhousaurus_hurt"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "panzhousaurus_hurt")));
		sounds.put(new ResourceLocation("lepidodendron", "panzhousaurus_death"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "panzhousaurus_death")));
		sounds.put(new ResourceLocation("lepidodendron", "purlovia_idle"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "purlovia_idle")));
		sounds.put(new ResourceLocation("lepidodendron", "purlovia_hurt"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "purlovia_hurt")));
		sounds.put(new ResourceLocation("lepidodendron", "purlovia_death"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "purlovia_death")));
		sounds.put(new ResourceLocation("lepidodendron", "scleromochlus_hurt"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "scleromochlus_hurt")));
		sounds.put(new ResourceLocation("lepidodendron", "scleromochlus_death"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "scleromochlus_death")));
		sounds.put(new ResourceLocation("lepidodendron", "tiarajudens_idle"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "tiarajudens_idle")));
		sounds.put(new ResourceLocation("lepidodendron", "tiarajudens_hurt"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "tiarajudens_hurt")));
		sounds.put(new ResourceLocation("lepidodendron", "tiarajudens_death"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "tiarajudens_death")));
		sounds.put(new ResourceLocation("lepidodendron", "pantylus_hurt"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "pantylus_hurt")));
		sounds.put(new ResourceLocation("lepidodendron", "pantylus_death"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "pantylus_death")));
		sounds.put(new ResourceLocation("lepidodendron", "erythrosuchus_idle"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "erythrosuchus_idle")));
		sounds.put(new ResourceLocation("lepidodendron", "erythrosuchus_hurt"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "erythrosuchus_hurt")));
		sounds.put(new ResourceLocation("lepidodendron", "erythrosuchus_death"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "erythrosuchus_death")));
		sounds.put(new ResourceLocation("lepidodendron", "erythrosuchus_roar"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "erythrosuchus_roar")));
		sounds.put(new ResourceLocation("lepidodendron", "tetraceratops_idle"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "tetraceratops_idle")));
		sounds.put(new ResourceLocation("lepidodendron", "tetraceratops_hurt"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "tetraceratops_hurt")));
		sounds.put(new ResourceLocation("lepidodendron", "tetraceratops_death"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "tetraceratops_death")));
		sounds.put(new ResourceLocation("lepidodendron", "eorhynchochelys_idle"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "eorhynchochelys_idle")));
		sounds.put(new ResourceLocation("lepidodendron", "eorhynchochelys_hurt"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "eorhynchochelys_hurt")));
		sounds.put(new ResourceLocation("lepidodendron", "eorhynchochelys_death"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "eorhynchochelys_death")));
		sounds.put(new ResourceLocation("lepidodendron", "datheosaurus_idle"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "datheosaurus_idle")));
		sounds.put(new ResourceLocation("lepidodendron", "datheosaurus_hurt"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "datheosaurus_hurt")));
		sounds.put(new ResourceLocation("lepidodendron", "datheosaurus_death"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "datheosaurus_death")));
		sounds.put(new ResourceLocation("lepidodendron", "teleocrater_idle"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "teleocrater_idle")));
		sounds.put(new ResourceLocation("lepidodendron", "teleocrater_hurt"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "teleocrater_hurt")));
		sounds.put(new ResourceLocation("lepidodendron", "teleocrater_death"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "teleocrater_death")));
		sounds.put(new ResourceLocation("lepidodendron", "tanystropheus_idle"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "tanystropheus_idle")));
		sounds.put(new ResourceLocation("lepidodendron", "tanystropheus_hurt"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "tanystropheus_hurt")));
		sounds.put(new ResourceLocation("lepidodendron", "tanystropheus_death"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "tanystropheus_death")));
		sounds.put(new ResourceLocation("lepidodendron", "proburnetia_idle"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "proburnetia_idle")));
		sounds.put(new ResourceLocation("lepidodendron", "proburnetia_hurt"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "proburnetia_hurt")));
		sounds.put(new ResourceLocation("lepidodendron", "proburnetia_death"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "proburnetia_death")));
		sounds.put(new ResourceLocation("lepidodendron", "sauroctonus_idle"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "sauroctonus_idle")));
		sounds.put(new ResourceLocation("lepidodendron", "sauroctonus_hurt"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "sauroctonus_hurt")));
		sounds.put(new ResourceLocation("lepidodendron", "sauroctonus_death"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "sauroctonus_death")));
		sounds.put(new ResourceLocation("lepidodendron", "sauroctonus_roar"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "sauroctonus_roar")));
		sounds.put(new ResourceLocation("lepidodendron", "arizonasaurus_idle"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "arizonasaurus_idle")));
		sounds.put(new ResourceLocation("lepidodendron", "arizonasaurus_hurt"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "arizonasaurus_hurt")));
		sounds.put(new ResourceLocation("lepidodendron", "arizonasaurus_death"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "arizonasaurus_death")));
		sounds.put(new ResourceLocation("lepidodendron", "smok_idle"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "smok_idle")));
		sounds.put(new ResourceLocation("lepidodendron", "smok_hurt"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "smok_hurt")));
		sounds.put(new ResourceLocation("lepidodendron", "smok_death"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "smok_death")));
		sounds.put(new ResourceLocation("lepidodendron", "poposaurus_idle"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "poposaurus_idle")));
		sounds.put(new ResourceLocation("lepidodendron", "poposaurus_hurt"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "poposaurus_hurt")));
		sounds.put(new ResourceLocation("lepidodendron", "poposaurus_death"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "poposaurus_death")));
		sounds.put(new ResourceLocation("lepidodendron", "thecodontosaurus_idle"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "thecodontosaurus_idle")));
		sounds.put(new ResourceLocation("lepidodendron", "thecodontosaurus_hurt"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "thecodontosaurus_hurt")));
		sounds.put(new ResourceLocation("lepidodendron", "thecodontosaurus_death"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "thecodontosaurus_death")));
		sounds.put(new ResourceLocation("lepidodendron", "megalosaurus_idle"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "megalosaurus_idle")));
		sounds.put(new ResourceLocation("lepidodendron", "megalosaurus_hurt"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "megalosaurus_hurt")));
		sounds.put(new ResourceLocation("lepidodendron", "megalosaurus_death"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "megalosaurus_death")));
		sounds.put(new ResourceLocation("lepidodendron", "megalosaurus_roar"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "megalosaurus_roar")));
		sounds.put(new ResourceLocation("lepidodendron", "arthropleura_step"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "arthropleura_step")));
		sounds.put(new ResourceLocation("lepidodendron", "endothiodon_idle"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "endothiodon_idle")));
		sounds.put(new ResourceLocation("lepidodendron", "endothiodon_hurt"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "endothiodon_hurt")));
		sounds.put(new ResourceLocation("lepidodendron", "endothiodon_death"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "endothiodon_death")));
		sounds.put(new ResourceLocation("lepidodendron", "rubidgea_idle"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "rubidgea_idle")));
		sounds.put(new ResourceLocation("lepidodendron", "rubidgea_hurt"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "rubidgea_hurt")));
		sounds.put(new ResourceLocation("lepidodendron", "rubidgea_death"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "rubidgea_death")));
		sounds.put(new ResourceLocation("lepidodendron", "saltriovenator_idle"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "saltriovenator_idle")));
		sounds.put(new ResourceLocation("lepidodendron", "saltriovenator_hurt"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "saltriovenator_hurt")));
		sounds.put(new ResourceLocation("lepidodendron", "saltriovenator_death"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "saltriovenator_death")));
		sounds.put(new ResourceLocation("lepidodendron", "saltriovenator_roar"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "saltriovenator_roar")));
		sounds.put(new ResourceLocation("lepidodendron", "chaoyangsauridae_idle"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "chaoyangsauridae_idle")));
		sounds.put(new ResourceLocation("lepidodendron", "chaoyangsauridae_hurt"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "chaoyangsauridae_hurt")));
		sounds.put(new ResourceLocation("lepidodendron", "chaoyangsauridae_death"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "chaoyangsauridae_death")));
		sounds.put(new ResourceLocation("lepidodendron", "chaoyangsauridae_alarm"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "chaoyangsauridae_alarm")));
		sounds.put(new ResourceLocation("lepidodendron", "dryosaurid_idle"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "dryosaurid_idle")));
		sounds.put(new ResourceLocation("lepidodendron", "dryosaurid_hurt"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "dryosaurid_hurt")));
		sounds.put(new ResourceLocation("lepidodendron", "dryosaurid_death"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "dryosaurid_death")));
		sounds.put(new ResourceLocation("lepidodendron", "dryosaurid_alarm"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "dryosaurid_alarm")));
		sounds.put(new ResourceLocation("lepidodendron", "dryosaurid_chatter"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "dryosaurid_chatter")));
		sounds.put(new ResourceLocation("lepidodendron", "dryosaurid_long_chatter"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "dryosaurid_long_chatter")));
		sounds.put(new ResourceLocation("lepidodendron", "panguraptor_idle"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "panguraptor_idle")));
		sounds.put(new ResourceLocation("lepidodendron", "panguraptor_hurt"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "panguraptor_hurt")));
		sounds.put(new ResourceLocation("lepidodendron", "panguraptor_death"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "panguraptor_death")));
		sounds.put(new ResourceLocation("lepidodendron", "panguraptor_attack"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "panguraptor_attack")));
		sounds.put(new ResourceLocation("lepidodendron", "silesaurus_idle"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "silesaurus_idle")));
		sounds.put(new ResourceLocation("lepidodendron", "silesaurus_hurt"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "silesaurus_hurt")));
		sounds.put(new ResourceLocation("lepidodendron", "silesaurus_death"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "silesaurus_death")));
		sounds.put(new ResourceLocation("lepidodendron", "kentrosaurus_idle"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "kentrosaurus_idle")));
		sounds.put(new ResourceLocation("lepidodendron", "kentrosaurus_hurt"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "kentrosaurus_hurt")));
		sounds.put(new ResourceLocation("lepidodendron", "kentrosaurus_death"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "kentrosaurus_death")));
		sounds.put(new ResourceLocation("lepidodendron", "bishanopliosaurus_idle"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "bishanopliosaurus_idle")));
		sounds.put(new ResourceLocation("lepidodendron", "bishanopliosaurus_hurt"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "bishanopliosaurus_hurt")));
		sounds.put(new ResourceLocation("lepidodendron", "bishanopliosaurus_death"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "bishanopliosaurus_death")));
		sounds.put(new ResourceLocation("lepidodendron", "siderops_idle"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "siderops_idle")));
		sounds.put(new ResourceLocation("lepidodendron", "siderops_hurt"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "siderops_hurt")));
		sounds.put(new ResourceLocation("lepidodendron", "siderops_death"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "siderops_death")));
		sounds.put(new ResourceLocation("lepidodendron", "kalligrammatid_flight"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "kalligrammatid_flight")));
		sounds.put(new ResourceLocation("lepidodendron", "dragonfly_flight"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "dragonfly_flight")));
		sounds.put(new ResourceLocation("lepidodendron", "kulindadromeus_idle"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "kulindadromeus_idle")));
		sounds.put(new ResourceLocation("lepidodendron", "kulindadromeus_hurt"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "kulindadromeus_hurt")));
		sounds.put(new ResourceLocation("lepidodendron", "kulindadromeus_death"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "kulindadromeus_death")));
		sounds.put(new ResourceLocation("lepidodendron", "kulindadromeus_alarm"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "kulindadromeus_alarm")));
		sounds.put(new ResourceLocation("lepidodendron", "kulindadromeus_chatter"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "kulindadromeus_chatter")));
		sounds.put(new ResourceLocation("lepidodendron", "submarine"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "submarine")));
		sounds.put(new ResourceLocation("lepidodendron", "submarine_underwater"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "submarine_underwater")));
		sounds.put(new ResourceLocation("lepidodendron", "buoy_bell"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "buoy_bell")));
		sounds.put(new ResourceLocation("lepidodendron", "europasaurus_idle"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "europasaurus_idle")));
		sounds.put(new ResourceLocation("lepidodendron", "europasaurus_hurt"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "europasaurus_hurt")));
		sounds.put(new ResourceLocation("lepidodendron", "europasaurus_death"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "europasaurus_death")));
		sounds.put(new ResourceLocation("lepidodendron", "kayentatherium_idle"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "kayentatherium_idle")));
		sounds.put(new ResourceLocation("lepidodendron", "kayentatherium_hurt"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "kayentatherium_hurt")));
		sounds.put(new ResourceLocation("lepidodendron", "kayentatherium_death"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "kayentatherium_death")));
		sounds.put(new ResourceLocation("lepidodendron", "tanycolagreus_idle"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "tanycolagreus_idle")));
		sounds.put(new ResourceLocation("lepidodendron", "tanycolagreus_hurt"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "tanycolagreus_hurt")));
		sounds.put(new ResourceLocation("lepidodendron", "tanycolagreus_death"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "tanycolagreus_death")));
		sounds.put(new ResourceLocation("lepidodendron", "tanycolagreus_roar"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "tanycolagreus_roar")));
		sounds.put(new ResourceLocation("lepidodendron", "stahleckeria_idle"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "stahleckeria_idle")));
		sounds.put(new ResourceLocation("lepidodendron", "stahleckeria_hurt"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "stahleckeria_hurt")));
		sounds.put(new ResourceLocation("lepidodendron", "stahleckeria_death"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "stahleckeria_death")));
		sounds.put(new ResourceLocation("lepidodendron", "stahleckeria_roar"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "stahleckeria_roar")));
		sounds.put(new ResourceLocation("lepidodendron", "eunotosaurus_idle"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "eunotosaurus_idle")));
		sounds.put(new ResourceLocation("lepidodendron", "eunotosaurus_hurt"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "eunotosaurus_hurt")));
		sounds.put(new ResourceLocation("lepidodendron", "eunotosaurus_death"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "eunotosaurus_death")));
		sounds.put(new ResourceLocation("lepidodendron", "ophthalmothule_idle"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "ophthalmothule_idle")));
		sounds.put(new ResourceLocation("lepidodendron", "ophthalmothule_hurt"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "ophthalmothule_hurt")));
		sounds.put(new ResourceLocation("lepidodendron", "ophthalmothule_death"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "ophthalmothule_death")));
		sounds.put(new ResourceLocation("lepidodendron", "archaboilus_chirp"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "archaboilus_chirp")));
		sounds.put(new ResourceLocation("lepidodendron", "gasosaurus_idle"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "gasosaurus_idle")));
		sounds.put(new ResourceLocation("lepidodendron", "gasosaurus_hurt"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "gasosaurus_hurt")));
		sounds.put(new ResourceLocation("lepidodendron", "gasosaurus_death"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "gasosaurus_death")));
		sounds.put(new ResourceLocation("lepidodendron", "gasosaurus_roar"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "gasosaurus_roar")));
		sounds.put(new ResourceLocation("lepidodendron", "piatnitzkysaurus_idle"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "piatnitzkysaurus_idle")));
		sounds.put(new ResourceLocation("lepidodendron", "piatnitzkysaurus_hurt"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "piatnitzkysaurus_hurt")));
		sounds.put(new ResourceLocation("lepidodendron", "piatnitzkysaurus_death"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "piatnitzkysaurus_death")));
		sounds.put(new ResourceLocation("lepidodendron", "piatnitzkysaurus_roar"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "piatnitzkysaurus_roar")));
		sounds.put(new ResourceLocation("lepidodendron", "stegosaurus_idle"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "stegosaurus_idle")));
		sounds.put(new ResourceLocation("lepidodendron", "stegosaurus_hurt"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "stegosaurus_hurt")));
		sounds.put(new ResourceLocation("lepidodendron", "stegosaurus_death"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "stegosaurus_death")));
		sounds.put(new ResourceLocation("lepidodendron", "stegosaurus_roar"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "stegosaurus_roar")));
		sounds.put(new ResourceLocation("lepidodendron", "gigantspinosaurus_idle"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "gigantspinosaurus_idle")));
		sounds.put(new ResourceLocation("lepidodendron", "huayangosaurus_idle"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "huayangosaurus_idle")));
		sounds.put(new ResourceLocation("lepidodendron", "tuojiangosaurus_idle"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "tuojiangosaurus_idle")));
		sounds.put(new ResourceLocation("lepidodendron", "yuxisaurus_idle"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "yuxisaurus_idle")));
		sounds.put(new ResourceLocation("lepidodendron", "yuxisaurus_hurt"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "yuxisaurus_hurt")));
		sounds.put(new ResourceLocation("lepidodendron", "yuxisaurus_death"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "yuxisaurus_death")));
		sounds.put(new ResourceLocation("lepidodendron", "cryolophosaurus_idle"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "cryolophosaurus_idle")));
		sounds.put(new ResourceLocation("lepidodendron", "cryolophosaurus_hurt"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "cryolophosaurus_hurt")));
		sounds.put(new ResourceLocation("lepidodendron", "cryolophosaurus_roar"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "cryolophosaurus_roar")));
		sounds.put(new ResourceLocation("lepidodendron", "tritylodon_idle"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "tritylodon_idle")));
		sounds.put(new ResourceLocation("lepidodendron", "tritylodon_hurt"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "tritylodon_hurt")));
		sounds.put(new ResourceLocation("lepidodendron", "tritylodon_death"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "tritylodon_death")));
		sounds.put(new ResourceLocation("lepidodendron", "castorocauda_idle"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "castorocauda_idle")));
		sounds.put(new ResourceLocation("lepidodendron", "castorocauda_hurt"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "castorocauda_hurt")));
		sounds.put(new ResourceLocation("lepidodendron", "castorocauda_death"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "castorocauda_death")));
		sounds.put(new ResourceLocation("lepidodendron", "rhomaleosaurus_idle"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "rhomaleosaurus_idle")));
		sounds.put(new ResourceLocation("lepidodendron", "rhomaleosaurus_hurt"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "rhomaleosaurus_hurt")));
		sounds.put(new ResourceLocation("lepidodendron", "rhomaleosaurus_death"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "rhomaleosaurus_death")));
		sounds.put(new ResourceLocation("lepidodendron", "yangchuanosaurus_idle"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "yangchuanosaurus_idle")));
		sounds.put(new ResourceLocation("lepidodendron", "yangchuanosaurus_hurt"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "yangchuanosaurus_hurt")));
		sounds.put(new ResourceLocation("lepidodendron", "yangchuanosaurus_death"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "yangchuanosaurus_death")));
		sounds.put(new ResourceLocation("lepidodendron", "yangchuanosaurus_roar"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "yangchuanosaurus_roar")));
		sounds.put(new ResourceLocation("lepidodendron", "anurognathid_idle"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "anurognathid_idle")));
		sounds.put(new ResourceLocation("lepidodendron", "anurognathid_hurt"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "anurognathid_hurt")));
		sounds.put(new ResourceLocation("lepidodendron", "anurognathid_death"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "anurognathid_death")));
		sounds.put(new ResourceLocation("lepidodendron", "anurognathid_alarm"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "anurognathid_alarm")));
		sounds.put(new ResourceLocation("lepidodendron", "apatosaurus_idle"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "apatosaurus_idle")));
		sounds.put(new ResourceLocation("lepidodendron", "apatosaurus_hurt"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "apatosaurus_hurt")));
		sounds.put(new ResourceLocation("lepidodendron", "apatosaurus_death"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "apatosaurus_death")));
		sounds.put(new ResourceLocation("lepidodendron", "apatosaurus_roar"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "apatosaurus_roar")));
		sounds.put(new ResourceLocation("lepidodendron", "pterodactylus_idle"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "pterodactylus_idle")));
		sounds.put(new ResourceLocation("lepidodendron", "pterodactylus_hurt"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "pterodactylus_hurt")));
		sounds.put(new ResourceLocation("lepidodendron", "pterodactylus_death"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "pterodactylus_death")));
		sounds.put(new ResourceLocation("lepidodendron", "pterodactylus_alarm"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "pterodactylus_alarm")));
		sounds.put(new ResourceLocation("lepidodendron", "rhamphorhynchus_idle"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "rhamphorhynchus_idle")));
		sounds.put(new ResourceLocation("lepidodendron", "rhamphorhynchus_hurt"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "rhamphorhynchus_hurt")));
		sounds.put(new ResourceLocation("lepidodendron", "rhamphorhynchus_death"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "rhamphorhynchus_death")));
		sounds.put(new ResourceLocation("lepidodendron", "rhamphorhynchus_alarm"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "rhamphorhynchus_alarm")));
		sounds.put(new ResourceLocation("lepidodendron", "elaphrosaurus_idle"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "elaphrosaurus_idle")));
		sounds.put(new ResourceLocation("lepidodendron", "elaphrosaurus_hurt"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "elaphrosaurus_hurt")));
		sounds.put(new ResourceLocation("lepidodendron", "elaphrosaurus_death"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "elaphrosaurus_death")));
		sounds.put(new ResourceLocation("lepidodendron", "elaphrosaurus_alarm"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "elaphrosaurus_alarm")));
		sounds.put(new ResourceLocation("lepidodendron", "limusaurus_idle"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "limusaurus_idle")));
		sounds.put(new ResourceLocation("lepidodendron", "limusaurus_hurt"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "limusaurus_hurt")));
		sounds.put(new ResourceLocation("lepidodendron", "limusaurus_death"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "limusaurus_death")));
		sounds.put(new ResourceLocation("lepidodendron", "limusaurus_alarm"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "limusaurus_alarm")));
		sounds.put(new ResourceLocation("lepidodendron", "limusaurus_chatter"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "limusaurus_chatter")));
		sounds.put(new ResourceLocation("lepidodendron", "camarasaurus_idle"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "camarasaurus_idle")));
		sounds.put(new ResourceLocation("lepidodendron", "camarasaurus_hurt"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "camarasaurus_hurt")));
		sounds.put(new ResourceLocation("lepidodendron", "camarasaurus_death"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "camarasaurus_death")));
		sounds.put(new ResourceLocation("lepidodendron", "camarasaurus_roar"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "camarasaurus_roar")));
		sounds.put(new ResourceLocation("lepidodendron", "dilophosaurus_idle"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "dilophosaurus_idle")));
		sounds.put(new ResourceLocation("lepidodendron", "dilophosaurus_hurt"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "dilophosaurus_hurt")));
		sounds.put(new ResourceLocation("lepidodendron", "dilophosaurus_death"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "dilophosaurus_death")));
		sounds.put(new ResourceLocation("lepidodendron", "dilophosaurus_roar"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "dilophosaurus_roar")));
		sounds.put(new ResourceLocation("lepidodendron", "compsognathus_idle"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "compsognathus_idle")));
		sounds.put(new ResourceLocation("lepidodendron", "compsognathus_hurt"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "compsognathus_hurt")));
		sounds.put(new ResourceLocation("lepidodendron", "compsognathus_death"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "compsognathus_death")));
		sounds.put(new ResourceLocation("lepidodendron", "compsognathus_alarm"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "compsognathus_alarm")));
		sounds.put(new ResourceLocation("lepidodendron", "compsognathus_chatter"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "compsognathus_chatter")));
		sounds.put(new ResourceLocation("lepidodendron", "lufengosaur_idle"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "lufengosaur_idle")));
		sounds.put(new ResourceLocation("lepidodendron", "lufengosaur_hurt"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "lufengosaur_hurt")));
		sounds.put(new ResourceLocation("lepidodendron", "lufengosaur_death"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "lufengosaur_death")));
		sounds.put(new ResourceLocation("lepidodendron", "lufengosaur_roar"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "lufengosaur_roar")));
		sounds.put(new ResourceLocation("lepidodendron", "mymoorapelta_idle"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "mymoorapelta_idle")));
		sounds.put(new ResourceLocation("lepidodendron", "mymoorapelta_hurt"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "mymoorapelta_hurt")));
		sounds.put(new ResourceLocation("lepidodendron", "mymoorapelta_death"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "mymoorapelta_death")));
		sounds.put(new ResourceLocation("lepidodendron", "gargoyleosaurus_idle"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "gargoyleosaurus_idle")));
		sounds.put(new ResourceLocation("lepidodendron", "gargoyleosaurus_hurt"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "gargoyleosaurus_hurt")));
		sounds.put(new ResourceLocation("lepidodendron", "gargoyleosaurus_death"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "gargoyleosaurus_death")));
		sounds.put(new ResourceLocation("lepidodendron", "adeopapposaurus_idle"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "adeopapposaurus_idle")));
		sounds.put(new ResourceLocation("lepidodendron", "adeopapposaurus_hurt"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "adeopapposaurus_hurt")));
		sounds.put(new ResourceLocation("lepidodendron", "adeopapposaurus_death"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "adeopapposaurus_death")));
		sounds.put(new ResourceLocation("lepidodendron", "adeopapposaurus_roar"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "adeopapposaurus_roar")));
		sounds.put(new ResourceLocation("lepidodendron", "camptosaurid_idle"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "camptosaurid_idle")));
		sounds.put(new ResourceLocation("lepidodendron", "camptosaurid_hurt"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "camptosaurid_hurt")));
		sounds.put(new ResourceLocation("lepidodendron", "camptosaurid_death"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "camptosaurid_death")));
		sounds.put(new ResourceLocation("lepidodendron", "camptosaurid_roar"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "camptosaurid_roar")));
		sounds.put(new ResourceLocation("lepidodendron", "chilesaurus_idle"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "chilesaurus_idle")));
		sounds.put(new ResourceLocation("lepidodendron", "chilesaurus_hurt"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "chilesaurus_hurt")));
		sounds.put(new ResourceLocation("lepidodendron", "chilesaurus_death"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "chilesaurus_death")));
		sounds.put(new ResourceLocation("lepidodendron", "chilesaurus_roar"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "chilesaurus_roar")));
		sounds.put(new ResourceLocation("lepidodendron", "wukongopterus_idle"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "wukongopterus_idle")));
		sounds.put(new ResourceLocation("lepidodendron", "wukongopterus_hurt"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "wukongopterus_hurt")));
		sounds.put(new ResourceLocation("lepidodendron", "wukongopterus_death"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "wukongopterus_death")));
		sounds.put(new ResourceLocation("lepidodendron", "wukongopterus_alarm"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "wukongopterus_alarm")));
		sounds.put(new ResourceLocation("lepidodendron", "dorygnathus_idle"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "dorygnathus_idle")));
		sounds.put(new ResourceLocation("lepidodendron", "dorygnathus_hurt"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "dorygnathus_hurt")));
		sounds.put(new ResourceLocation("lepidodendron", "dorygnathus_death"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "dorygnathus_death")));
		sounds.put(new ResourceLocation("lepidodendron", "dorygnathus_alarm"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "dorygnathus_alarm")));
		sounds.put(new ResourceLocation("lepidodendron", "dubreuillosaurus_idle"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "dubreuillosaurus_idle")));
		sounds.put(new ResourceLocation("lepidodendron", "dubreuillosaurus_hurt"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "dubreuillosaurus_hurt")));
		sounds.put(new ResourceLocation("lepidodendron", "dubreuillosaurus_death"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "dubreuillosaurus_death")));
		sounds.put(new ResourceLocation("lepidodendron", "shunosaurus_idle"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "shunosaurus_idle")));
		sounds.put(new ResourceLocation("lepidodendron", "shunosaurus_hurt"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "shunosaurus_hurt")));
		sounds.put(new ResourceLocation("lepidodendron", "shunosaurus_death"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "shunosaurus_death")));
		sounds.put(new ResourceLocation("lepidodendron", "shunosaurus_roar"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "shunosaurus_roar")));
		sounds.put(new ResourceLocation("lepidodendron", "tianyulong_idle"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "tianyulong_idle")));
		sounds.put(new ResourceLocation("lepidodendron", "tianyulong_hurt"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "tianyulong_hurt")));
		sounds.put(new ResourceLocation("lepidodendron", "tianyulong_death"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "tianyulong_death")));
		sounds.put(new ResourceLocation("lepidodendron", "tianyulong_alarm"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "tianyulong_alarm")));
		sounds.put(new ResourceLocation("lepidodendron", "anchisaurus_idle"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "anchisaurus_idle")));
		sounds.put(new ResourceLocation("lepidodendron", "anchisaurus_hurt"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "anchisaurus_hurt")));
		sounds.put(new ResourceLocation("lepidodendron", "anchisaurus_death"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "anchisaurus_death")));
		sounds.put(new ResourceLocation("lepidodendron", "miragaia_idle"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "miragaia_idle")));
		sounds.put(new ResourceLocation("lepidodendron", "miragaia_hurt"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "miragaia_hurt")));
		sounds.put(new ResourceLocation("lepidodendron", "miragaia_death"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "miragaia_death")));
		sounds.put(new ResourceLocation("lepidodendron", "miragaia_roar"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "miragaia_roar")));
		sounds.put(new ResourceLocation("lepidodendron", "torvosaurus_idle"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "torvosaurus_idle")));
		sounds.put(new ResourceLocation("lepidodendron", "torvosaurus_hurt"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "torvosaurus_hurt")));
		sounds.put(new ResourceLocation("lepidodendron", "torvosaurus_death"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "torvosaurus_death")));
		sounds.put(new ResourceLocation("lepidodendron", "torvosaurus_roar"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "torvosaurus_roar")));
		sounds.put(new ResourceLocation("lepidodendron", "ornitholestes_idle"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "ornitholestes_idle")));
		sounds.put(new ResourceLocation("lepidodendron", "ornitholestes_hurt"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "ornitholestes_hurt")));
		sounds.put(new ResourceLocation("lepidodendron", "ornitholestes_death"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "ornitholestes_death")));
		sounds.put(new ResourceLocation("lepidodendron", "ornitholestes_roar"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "ornitholestes_roar")));
		sounds.put(new ResourceLocation("lepidodendron", "diplodocus_idle"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "diplodocus_idle")));
		sounds.put(new ResourceLocation("lepidodendron", "diplodocus_hurt"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "diplodocus_hurt")));
		sounds.put(new ResourceLocation("lepidodendron", "diplodocus_death"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "diplodocus_death")));
		sounds.put(new ResourceLocation("lepidodendron", "diplodocus_roar"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "diplodocus_roar")));
		sounds.put(new ResourceLocation("lepidodendron", "heterodontosaurus_idle"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "heterodontosaurus_idle")));
		sounds.put(new ResourceLocation("lepidodendron", "heterodontosaurus_hurt"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "heterodontosaurus_hurt")));
		sounds.put(new ResourceLocation("lepidodendron", "heterodontosaurus_death"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "heterodontosaurus_death")));
		sounds.put(new ResourceLocation("lepidodendron", "heterodontosaurus_alarm"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "heterodontosaurus_alarm")));
		sounds.put(new ResourceLocation("lepidodendron", "dicraeosaurus_idle"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "dicraeosaurus_idle")));
		sounds.put(new ResourceLocation("lepidodendron", "dicraeosaurus_hurt"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "dicraeosaurus_hurt")));
		sounds.put(new ResourceLocation("lepidodendron", "dicraeosaurus_death"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "dicraeosaurus_death")));
		sounds.put(new ResourceLocation("lepidodendron", "dicraeosaurus_roar"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "dicraeosaurus_roar")));
		sounds.put(new ResourceLocation("lepidodendron", "mamenchisaurus_idle"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "mamenchisaurus_idle")));
		sounds.put(new ResourceLocation("lepidodendron", "mamenchisaurus_hurt"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "mamenchisaurus_hurt")));
		sounds.put(new ResourceLocation("lepidodendron", "mamenchisaurus_death"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "mamenchisaurus_death")));
		sounds.put(new ResourceLocation("lepidodendron", "mamenchisaurus_roar"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "mamenchisaurus_roar")));
		sounds.put(new ResourceLocation("lepidodendron", "yiqi_idle"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "yiqi_idle")));
		sounds.put(new ResourceLocation("lepidodendron", "yiqi_hurt"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "yiqi_hurt")));
		sounds.put(new ResourceLocation("lepidodendron", "yiqi_death"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "yiqi_death")));
		sounds.put(new ResourceLocation("lepidodendron", "archaeopteryx_idle"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "archaeopteryx_idle")));
		sounds.put(new ResourceLocation("lepidodendron", "archaeopteryx_hurt"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "archaeopteryx_hurt")));
		sounds.put(new ResourceLocation("lepidodendron", "archaeopteryx_death"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "archaeopteryx_death")));
		sounds.put(new ResourceLocation("lepidodendron", "dimorphodon_idle"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "dimorphodon_idle")));
		sounds.put(new ResourceLocation("lepidodendron", "dimorphodon_hurt"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "dimorphodon_hurt")));
		sounds.put(new ResourceLocation("lepidodendron", "dimorphodon_death"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "dimorphodon_death")));
		sounds.put(new ResourceLocation("lepidodendron", "dimorphodon_alarm"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "dimorphodon_alarm")));
		sounds.put(new ResourceLocation("lepidodendron", "anchiornis_idle"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "anchiornis_idle")));
		sounds.put(new ResourceLocation("lepidodendron", "anchiornis_hurt"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "anchiornis_hurt")));
		sounds.put(new ResourceLocation("lepidodendron", "anchiornis_death"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "anchiornis_death")));
		sounds.put(new ResourceLocation("lepidodendron", "anchiornis_alarm"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "anchiornis_alarm")));
		sounds.put(new ResourceLocation("lepidodendron", "anchiornis_threat"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "anchiornis_threat")));
		sounds.put(new ResourceLocation("lepidodendron", "guano_golem_shoot"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "guano_golem_shoot")));
		sounds.put(new ResourceLocation("lepidodendron", "guano_golem_idle"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "guano_golem_idle")));
		sounds.put(new ResourceLocation("lepidodendron", "guano_golem_death"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "guano_golem_death")));
		sounds.put(new ResourceLocation("lepidodendron", "guano_golem_walk"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "guano_golem_walk")));
		sounds.put(new ResourceLocation("lepidodendron", "brachiosaurus_idle"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "brachiosaurus_idle")));
		sounds.put(new ResourceLocation("lepidodendron", "brachiosaurus_hurt"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "brachiosaurus_hurt")));
		sounds.put(new ResourceLocation("lepidodendron", "brachiosaurus_death"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "brachiosaurus_death")));
		sounds.put(new ResourceLocation("lepidodendron", "sinraptor_idle"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "sinraptor_idle")));
		sounds.put(new ResourceLocation("lepidodendron", "sinraptor_hurt"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "sinraptor_hurt")));
		sounds.put(new ResourceLocation("lepidodendron", "sinraptor_death"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "sinraptor_death")));
		sounds.put(new ResourceLocation("lepidodendron", "sinraptor_roar"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "sinraptor_roar")));
		sounds.put(new ResourceLocation("lepidodendron", "allosaurus_idle"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "allosaurus_idle")));
		sounds.put(new ResourceLocation("lepidodendron", "allosaurus_roar"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "allosaurus_roar")));
		sounds.put(new ResourceLocation("lepidodendron", "ceratosaurus_idle"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "ceratosaurus_idle")));
		sounds.put(new ResourceLocation("lepidodendron", "guanlong_idle"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "guanlong_idle")));
		sounds.put(new ResourceLocation("lepidodendron", "guanlong_hurt"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "guanlong_hurt")));
		sounds.put(new ResourceLocation("lepidodendron", "guanlong_death"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "guanlong_death")));
		sounds.put(new ResourceLocation("lepidodendron", "proceratosaurus_idle"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "proceratosaurus_idle")));
		sounds.put(new ResourceLocation("lepidodendron", "proceratosaurus_hurt"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "proceratosaurus_hurt")));
		sounds.put(new ResourceLocation("lepidodendron", "proceratosaurus_death"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "proceratosaurus_death")));
		sounds.put(new ResourceLocation("lepidodendron", "longisquama_idle"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "longisquama_idle")));
		sounds.put(new ResourceLocation("lepidodendron", "longisquama_hurt"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "longisquama_hurt")));
		sounds.put(new ResourceLocation("lepidodendron", "longisquama_death"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "longisquama_death")));
		sounds.put(new ResourceLocation("lepidodendron", "pliosaurus_idle"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "pliosaurus_idle")));
		sounds.put(new ResourceLocation("lepidodendron", "pliosaurus_hurt"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "pliosaurus_hurt")));
		sounds.put(new ResourceLocation("lepidodendron", "pliosaurus_death"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "pliosaurus_death")));
		sounds.put(new ResourceLocation("lepidodendron", "geosaurus_idle"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "geosaurus_idle")));
		sounds.put(new ResourceLocation("lepidodendron", "geosaurus_hurt"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "geosaurus_hurt")));
		sounds.put(new ResourceLocation("lepidodendron", "geosaurus_death"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "geosaurus_death")));
		sounds.put(new ResourceLocation("lepidodendron", "thalattosuchus_idle"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "thalattosuchus_idle")));
		sounds.put(new ResourceLocation("lepidodendron", "thalattosuchus_hurt"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "thalattosuchus_hurt")));
		sounds.put(new ResourceLocation("lepidodendron", "thalattosuchus_death"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "thalattosuchus_death")));
		sounds.put(new ResourceLocation("lepidodendron", "dakosaurus_idle"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "dakosaurus_idle")));
		sounds.put(new ResourceLocation("lepidodendron", "dakosaurus_hurt"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "dakosaurus_hurt")));
		sounds.put(new ResourceLocation("lepidodendron", "dakosaurus_death"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "dakosaurus_death")));
		sounds.put(new ResourceLocation("lepidodendron", "monolophosaurus_idle"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "monolophosaurus_idle")));
		sounds.put(new ResourceLocation("lepidodendron", "monolophosaurus_roar"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "monolophosaurus_roar")));
		sounds.put(new ResourceLocation("lepidodendron", "caihong_idle"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "caihong_idle")));
		sounds.put(new ResourceLocation("lepidodendron", "caihong_hurt"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "caihong_hurt")));
		sounds.put(new ResourceLocation("lepidodendron", "caihong_death"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "caihong_death")));
		sounds.put(new ResourceLocation("lepidodendron", "caihong_alarm"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "caihong_alarm")));
		sounds.put(new ResourceLocation("lepidodendron", "caihong_threat"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "caihong_threat")));
		sounds.put(new ResourceLocation("lepidodendron", "pampaphoneus_idle"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "pampaphoneus_idle")));
		sounds.put(new ResourceLocation("lepidodendron", "pampaphoneus_hurt"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "pampaphoneus_hurt")));
		sounds.put(new ResourceLocation("lepidodendron", "pampaphoneus_death"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "pampaphoneus_death")));
		sounds.put(new ResourceLocation("lepidodendron", "banksiops_idle"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "banksiops_idle")));
		sounds.put(new ResourceLocation("lepidodendron", "banksiops_hurt"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "banksiops_hurt")));
		sounds.put(new ResourceLocation("lepidodendron", "banksiops_death"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "banksiops_hurt")));
		sounds.put(new ResourceLocation("lepidodendron", "deuterosaurus_idle"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "deuterosaurus_idle")));
		sounds.put(new ResourceLocation("lepidodendron", "deuterosaurus_hurt"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "deuterosaurus_hurt")));
		sounds.put(new ResourceLocation("lepidodendron", "deuterosaurus_death"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "deuterosaurus_death")));
		sounds.put(new ResourceLocation("lepidodendron", "deuterosaurus_threat"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "deuterosaurus_threat")));
		sounds.put(new ResourceLocation("lepidodendron", "lagosuchus_idle"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "lagosuchus_idle")));
		sounds.put(new ResourceLocation("lepidodendron", "lagosuchus_hurt"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "lagosuchus_hurt")));
		sounds.put(new ResourceLocation("lepidodendron", "lagosuchus_death"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "lagosuchus_death")));
		sounds.put(new ResourceLocation("lepidodendron", "stenokranio_idle"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "stenokranio_idle")));
		sounds.put(new ResourceLocation("lepidodendron", "stenokranio_hurt"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "stenokranio_hurt")));
		sounds.put(new ResourceLocation("lepidodendron", "stenokranio_death"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "stenokranio_death")));
		sounds.put(new ResourceLocation("lepidodendron", "dearc_idle"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "dearc_idle")));
		sounds.put(new ResourceLocation("lepidodendron", "dearc_hurt"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "dearc_hurt")));
		sounds.put(new ResourceLocation("lepidodendron", "dearc_death"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "dearc_death")));
		sounds.put(new ResourceLocation("lepidodendron", "dearc_alarm"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "dearc_alarm")));
		sounds.put(new ResourceLocation("lepidodendron", "germanodactylus_idle"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "germanodactylus_idle")));
		sounds.put(new ResourceLocation("lepidodendron", "germanodactylus_hurt"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "germanodactylus_hurt")));
		sounds.put(new ResourceLocation("lepidodendron", "germanodactylus_death"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "germanodactylus_death")));
		sounds.put(new ResourceLocation("lepidodendron", "germanodactylus_alarm"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "germanodactylus_alarm")));
		sounds.put(new ResourceLocation("lepidodendron", "harpactognathus_idle"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "harpactognathus_idle")));
		sounds.put(new ResourceLocation("lepidodendron", "harpactognathus_hurt"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "harpactognathus_hurt")));
		sounds.put(new ResourceLocation("lepidodendron", "harpactognathus_death"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "harpactognathus_death")));
		sounds.put(new ResourceLocation("lepidodendron", "harpactognathus_alarm"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "harpactognathus_alarm")));
		sounds.put(new ResourceLocation("lepidodendron", "schoenesmahl_hurt"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "schoenesmahl_hurt")));
		sounds.put(new ResourceLocation("lepidodendron", "schoenesmahl_death"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "schoenesmahl_death")));
		sounds.put(new ResourceLocation("lepidodendron", "eustreptospondylus_idle"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "eustreptospondylus_idle")));
		sounds.put(new ResourceLocation("lepidodendron", "eustreptospondylus_hurt"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "eustreptospondylus_hurt")));
		sounds.put(new ResourceLocation("lepidodendron", "eustreptospondylus_death"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "eustreptospondylus_death")));
		sounds.put(new ResourceLocation("lepidodendron", "eustreptospondylus_roar"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "eustreptospondylus_roar")));
		sounds.put(new ResourceLocation("lepidodendron", "lusotitan_idle"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "lusotitan_idle")));
		sounds.put(new ResourceLocation("lepidodendron", "lusotitan_hurt"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "lusotitan_hurt")));
		sounds.put(new ResourceLocation("lepidodendron", "lusotitan_death"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "lusotitan_death")));
		sounds.put(new ResourceLocation("lepidodendron", "lusotitan_roar"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "lusotitan_roar")));
		sounds.put(new ResourceLocation("lepidodendron", "cricosaurus_idle"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "cricosaurus_idle")));
		sounds.put(new ResourceLocation("lepidodendron", "cricosaurus_hurt"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "cricosaurus_hurt")));
		sounds.put(new ResourceLocation("lepidodendron", "cricosaurus_death"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "cricosaurus_hurt")));
		sounds.put(new ResourceLocation("lepidodendron", "lusovenator_roar"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "lusovenator_roar")));
		sounds.put(new ResourceLocation("lepidodendron", "lusovenator_idle"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "lusovenator_idle")));
		sounds.put(new ResourceLocation("lepidodendron", "archaeothyris_idle"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "archaeothyris_idle")));
		sounds.put(new ResourceLocation("lepidodendron", "archaeothyris_hurt"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "archaeothyris_hurt")));
		sounds.put(new ResourceLocation("lepidodendron", "archaeothyris_death"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "archaeothyris_hurt")));
		sounds.put(new ResourceLocation("lepidodendron", "archaeothyris_call"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "archaeothyris_call")));

		sounds.put(new ResourceLocation("lepidodendron", "bannykus_idle"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "bannykus_idle")));
		sounds.put(new ResourceLocation("lepidodendron", "bannykus_hurt"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "bannykus_hurt")));
		sounds.put(new ResourceLocation("lepidodendron", "bannykus_death"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "bannykus_death")));
		sounds.put(new ResourceLocation("lepidodendron", "berthasaura_idle"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "berthasaura_idle")));
		sounds.put(new ResourceLocation("lepidodendron", "berthasaura_hurt"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "berthasaura_hurt")));
		sounds.put(new ResourceLocation("lepidodendron", "berthasaura_death"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "berthasaura_death")));
		sounds.put(new ResourceLocation("lepidodendron", "berthasaura_alarm"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "berthasaura_alarm")));
		sounds.put(new ResourceLocation("lepidodendron", "eocursor_idle"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "eocursor_idle")));
		sounds.put(new ResourceLocation("lepidodendron", "eocursor_hurt"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "eocursor_hurt")));
		sounds.put(new ResourceLocation("lepidodendron", "eocursor_death"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "eocursor_death")));
		sounds.put(new ResourceLocation("lepidodendron", "eocursor_alarm"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "eocursor_alarm")));
		sounds.put(new ResourceLocation("lepidodendron", "sordes_idle"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "sordes_idle")));
		sounds.put(new ResourceLocation("lepidodendron", "sordes_hurt"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "sordes_hurt")));
		sounds.put(new ResourceLocation("lepidodendron", "sordes_death"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "sordes_death")));
		sounds.put(new ResourceLocation("lepidodendron", "sordes_alarm"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "sordes_alarm")));
		sounds.put(new ResourceLocation("lepidodendron", "sericipterus_idle"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "sericipterus_idle")));
		sounds.put(new ResourceLocation("lepidodendron", "sericipterus_hurt"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "sericipterus_hurt")));
		sounds.put(new ResourceLocation("lepidodendron", "sericipterus_death"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "sericipterus_death")));
		sounds.put(new ResourceLocation("lepidodendron", "sericipterus_alarm"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "sericipterus_alarm")));
		sounds.put(new ResourceLocation("lepidodendron", "kannemeyeria_idle"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "kannemeyeria_idle")));
		sounds.put(new ResourceLocation("lepidodendron", "kannemeyeria_hurt"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "kannemeyeria_hurt")));
		sounds.put(new ResourceLocation("lepidodendron", "kannemeyeria_death"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "kannemeyeria_death")));
		sounds.put(new ResourceLocation("lepidodendron", "tropidosuchus_idle"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "tropidosuchus_idle")));
		sounds.put(new ResourceLocation("lepidodendron", "tropidosuchus_hurt"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "tropidosuchus_hurt")));
		sounds.put(new ResourceLocation("lepidodendron", "tropidosuchus_death"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "tropidosuchus_death")));
		sounds.put(new ResourceLocation("lepidodendron", "tinycroc_idle"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "tinycroc_idle")));
		sounds.put(new ResourceLocation("lepidodendron", "tinycroc_hurt"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "tinycroc_hurt")));
		sounds.put(new ResourceLocation("lepidodendron", "tinycroc_death"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "tinycroc_death")));
		sounds.put(new ResourceLocation("lepidodendron", "psittacosaurus_idle"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "psittacosaurus_idle")));
		sounds.put(new ResourceLocation("lepidodendron", "psittacosaurus_hurt"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "psittacosaurus_hurt")));
		sounds.put(new ResourceLocation("lepidodendron", "psittacosaurus_death"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "psittacosaurus_death")));
		sounds.put(new ResourceLocation("lepidodendron", "psittacosaurus_alarm"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "psittacosaurus_alarm")));
		sounds.put(new ResourceLocation("lepidodendron", "smallcroc_idle"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "smallcroc_idle")));
		sounds.put(new ResourceLocation("lepidodendron", "smallcroc_hurt"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "smallcroc_hurt")));
		sounds.put(new ResourceLocation("lepidodendron", "smallcroc_death"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "smallcroc_death")));
		sounds.put(new ResourceLocation("lepidodendron", "smallcroc_idle"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "smallcroc_idle")));
		sounds.put(new ResourceLocation("lepidodendron", "smallcroc_hurt"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "smallcroc_hurt")));
		sounds.put(new ResourceLocation("lepidodendron", "smallcroc_death"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "smallcroc_death")));
		sounds.put(new ResourceLocation("lepidodendron", "anthracosaurus_idle"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "anthracosaurus_idle")));
		sounds.put(new ResourceLocation("lepidodendron", "anthracosaurus_hurt"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "anthracosaurus_hurt")));
		sounds.put(new ResourceLocation("lepidodendron", "anthracosaurus_death"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "anthracosaurus_death")));
		sounds.put(new ResourceLocation("lepidodendron", "archeria_idle"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "archeria_idle")));
		sounds.put(new ResourceLocation("lepidodendron", "archeria_hurt"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "archeria_hurt")));
		sounds.put(new ResourceLocation("lepidodendron", "archeria_death"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "archeria_death")));
		sounds.put(new ResourceLocation("lepidodendron", "muttaburrasaurus_idle"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "muttaburrasaurus_idle")));
		sounds.put(new ResourceLocation("lepidodendron", "muttaburrasaurus_hurt"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "muttaburrasaurus_hurt")));
		sounds.put(new ResourceLocation("lepidodendron", "muttaburrasaurus_death"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "muttaburrasaurus_death")));
		sounds.put(new ResourceLocation("lepidodendron", "falcarius_idle"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "falcarius_idle")));
		sounds.put(new ResourceLocation("lepidodendron", "falcarius_hurt"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "falcarius_hurt")));
		sounds.put(new ResourceLocation("lepidodendron", "falcarius_death"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "falcarius_death")));
		sounds.put(new ResourceLocation("lepidodendron", "falcarius_roar"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "falcarius_roar")));
		sounds.put(new ResourceLocation("lepidodendron", "nigersaurus_idle"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "nigersaurus_idle")));
		sounds.put(new ResourceLocation("lepidodendron", "nigersaurus_hurt"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "nigersaurus_hurt")));
		sounds.put(new ResourceLocation("lepidodendron", "nigersaurus_death"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "nigersaurus_death")));
		sounds.put(new ResourceLocation("lepidodendron", "deinonychus_idle"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "deinonychus_idle")));
		sounds.put(new ResourceLocation("lepidodendron", "deinonychus_hurt"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "deinonychus_hurt")));
		sounds.put(new ResourceLocation("lepidodendron", "deinonychus_death"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "deinonychus_death")));
		sounds.put(new ResourceLocation("lepidodendron", "deinonychus_roar"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "deinonychus_roar")));
		sounds.put(new ResourceLocation("lepidodendron", "eldeceeon_idle"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "eldeceeon_idle")));
		sounds.put(new ResourceLocation("lepidodendron", "eldeceeon_hurt"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "eldeceeon_hurt")));
		sounds.put(new ResourceLocation("lepidodendron", "eldeceeon_death"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "eldeceeon_death")));
		sounds.put(new ResourceLocation("lepidodendron", "jinyunpelta_idle"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "jinyunpelta_idle")));
		sounds.put(new ResourceLocation("lepidodendron", "jinyunpelta_hurt"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "jinyunpelta_hurt")));
		sounds.put(new ResourceLocation("lepidodendron", "jinyunpelta_death"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "jinyunpelta_death")));
		sounds.put(new ResourceLocation("lepidodendron", "pholidogaster_idle"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "pholidogaster_idle")));
		sounds.put(new ResourceLocation("lepidodendron", "pholidogaster_hurt"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "pholidogaster_hurt")));
		sounds.put(new ResourceLocation("lepidodendron", "pholidogaster_death"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "pholidogaster_death")));
		sounds.put(new ResourceLocation("lepidodendron", "haliskia_idle"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "haliskia_idle")));
		sounds.put(new ResourceLocation("lepidodendron", "haliskia_hurt"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "haliskia_hurt")));
		sounds.put(new ResourceLocation("lepidodendron", "haliskia_death"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "haliskia_death")));
		sounds.put(new ResourceLocation("lepidodendron", "haliskia_alarm"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "haliskia_alarm")));
		sounds.put(new ResourceLocation("lepidodendron", "teraterpeton_idle"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "teraterpeton_idle")));
		sounds.put(new ResourceLocation("lepidodendron", "teraterpeton_hurt"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "teraterpeton_hurt")));
		sounds.put(new ResourceLocation("lepidodendron", "teraterpeton_death"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "teraterpeton_death")));
		sounds.put(new ResourceLocation("lepidodendron", "dracoraptor_idle"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "dracoraptor_idle")));
		sounds.put(new ResourceLocation("lepidodendron", "dracoraptor_hurt"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "dracoraptor_hurt")));
		sounds.put(new ResourceLocation("lepidodendron", "dracoraptor_death"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "dracoraptor_death")));
		sounds.put(new ResourceLocation("lepidodendron", "rhadinosteus_idle"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "rhadinosteus_idle")));
		sounds.put(new ResourceLocation("lepidodendron", "rhadinosteus_hurt"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "rhadinosteus_hurt")));
		sounds.put(new ResourceLocation("lepidodendron", "rhadinosteus_death"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "rhadinosteus_death")));
		sounds.put(new ResourceLocation("lepidodendron", "spinophorosaurus_idle"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "spinophorosaurus_idle")));
		sounds.put(new ResourceLocation("lepidodendron", "spinophorosaurus_hurt"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "spinophorosaurus_hurt")));
		sounds.put(new ResourceLocation("lepidodendron", "spinophorosaurus_death"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "spinophorosaurus_death")));
		sounds.put(new ResourceLocation("lepidodendron", "albalophosaurus_idle"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "albalophosaurus_idle")));
		sounds.put(new ResourceLocation("lepidodendron", "albalophosaurus_hurt"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "albalophosaurus_hurt")));
		sounds.put(new ResourceLocation("lepidodendron", "albalophosaurus_death"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "albalophosaurus_death")));
		sounds.put(new ResourceLocation("lepidodendron", "albalophosaurus_alarm"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "albalophosaurus_alarm")));
		sounds.put(new ResourceLocation("lepidodendron", "ankylosphenodon_idle"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "ankylosphenodon_idle")));
		sounds.put(new ResourceLocation("lepidodendron", "ankylosphenodon_hurt"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "ankylosphenodon_hurt")));
		sounds.put(new ResourceLocation("lepidodendron", "ankylosphenodon_death"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "ankylosphenodon_death")));
		sounds.put(new ResourceLocation("lepidodendron", "caerorhachis_hurt"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "caerorhachis_hurt")));
		sounds.put(new ResourceLocation("lepidodendron", "caerorhachis_death"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "caerorhachis_death")));
		sounds.put(new ResourceLocation("lepidodendron", "phlegethontia_idle"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "phlegethontia_idle")));
		sounds.put(new ResourceLocation("lepidodendron", "phlegethontia_hurt"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "phlegethontia_hurt")));
		sounds.put(new ResourceLocation("lepidodendron", "phlegethontia_death"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "phlegethontia_death")));
		sounds.put(new ResourceLocation("lepidodendron", "hypuronector_idle"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "hypuronector_idle")));
		sounds.put(new ResourceLocation("lepidodendron", "hypuronector_hurt"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "hypuronector_hurt")));
		sounds.put(new ResourceLocation("lepidodendron", "hypuronector_death"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "hypuronector_death")));
		sounds.put(new ResourceLocation("lepidodendron", "drepanosaurus_idle"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "drepanosaurus_idle")));
		sounds.put(new ResourceLocation("lepidodendron", "drepanosaurus_hurt"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "drepanosaurus_hurt")));
		sounds.put(new ResourceLocation("lepidodendron", "drepanosaurus_death"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "drepanosaurus_death")));
		sounds.put(new ResourceLocation("lepidodendron", "drepanosaurus_alarm"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "drepanosaurus_alarm")));
		sounds.put(new ResourceLocation("lepidodendron", "aquilops_idle"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "aquilops_idle")));
		sounds.put(new ResourceLocation("lepidodendron", "aquilops_hurt"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "aquilops_hurt")));
		sounds.put(new ResourceLocation("lepidodendron", "aquilops_death"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "aquilops_death")));
		sounds.put(new ResourceLocation("lepidodendron", "aquilops_alarm"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "aquilops_alarm")));
		sounds.put(new ResourceLocation("lepidodendron", "liaoceratops_idle"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "liaoceratops_idle")));
		sounds.put(new ResourceLocation("lepidodendron", "liaoceratops_hurt"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "liaoceratops_hurt")));
		sounds.put(new ResourceLocation("lepidodendron", "liaoceratops_death"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "liaoceratops_death")));
		sounds.put(new ResourceLocation("lepidodendron", "liaoceratops_alarm"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "liaoceratops_alarm")));
		sounds.put(new ResourceLocation("lepidodendron", "tietasaura_idle"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "tietasaura_idle")));
		sounds.put(new ResourceLocation("lepidodendron", "tietasaura_hurt"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "tietasaura_hurt")));
		sounds.put(new ResourceLocation("lepidodendron", "tietasaura_death"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "tietasaura_death")));
		sounds.put(new ResourceLocation("lepidodendron", "tietasaura_alarm"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "tietasaura_alarm")));
		sounds.put(new ResourceLocation("lepidodendron", "tyrannotitan_idle"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "tyrannotitan_idle")));
		sounds.put(new ResourceLocation("lepidodendron", "tyrannotitan_idle2"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "tyrannotitan_idle2")));
		sounds.put(new ResourceLocation("lepidodendron", "tyrannotitan_hurt"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "tyrannotitan_hurt")));
		sounds.put(new ResourceLocation("lepidodendron", "tyrannotitan_death"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "tyrannotitan_death")));
		sounds.put(new ResourceLocation("lepidodendron", "tyrannotitan_roar"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "tyrannotitan_roar")));
		sounds.put(new ResourceLocation("lepidodendron", "lesothosaurus_idle"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "lesothosaurus_idle")));
		sounds.put(new ResourceLocation("lepidodendron", "lesothosaurus_hurt"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "lesothosaurus_hurt")));
		sounds.put(new ResourceLocation("lepidodendron", "lesothosaurus_death"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "lesothosaurus_death")));
		sounds.put(new ResourceLocation("lepidodendron", "lesothosaurus_alarm"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "lesothosaurus_alarm")));
		sounds.put(new ResourceLocation("lepidodendron", "teyujagua_idle"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "teyujagua_idle")));
		sounds.put(new ResourceLocation("lepidodendron", "teyujagua_hurt"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "teyujagua_hurt")));
		sounds.put(new ResourceLocation("lepidodendron", "teyujagua_death"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "teyujagua_death")));
		sounds.put(new ResourceLocation("lepidodendron", "diademodon_idle"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "diademodon_idle")));
		sounds.put(new ResourceLocation("lepidodendron", "diademodon_hurt"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "diademodon_hurt")));
		sounds.put(new ResourceLocation("lepidodendron", "diademodon_death"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "diademodon_death")));
		sounds.put(new ResourceLocation("lepidodendron", "anhanguera_idle"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "anhanguera_idle")));
		sounds.put(new ResourceLocation("lepidodendron", "anhanguera_hurt"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "anhanguera_hurt")));
		sounds.put(new ResourceLocation("lepidodendron", "anhanguera_death"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "anhanguera_death")));
		sounds.put(new ResourceLocation("lepidodendron", "anhanguera_alarm"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "anhanguera_alarm")));
		sounds.put(new ResourceLocation("lepidodendron", "mythunga_idle"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "mythunga_idle")));
		sounds.put(new ResourceLocation("lepidodendron", "mythunga_hurt"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "mythunga_hurt")));
		sounds.put(new ResourceLocation("lepidodendron", "mythunga_death"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "mythunga_death")));
		sounds.put(new ResourceLocation("lepidodendron", "mythunga_alarm"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "mythunga_alarm")));
		sounds.put(new ResourceLocation("lepidodendron", "gobiconodon_idle"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "gobiconodon_idle")));
		sounds.put(new ResourceLocation("lepidodendron", "gobiconodon_hurt"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "gobiconodon_hurt")));
		sounds.put(new ResourceLocation("lepidodendron", "gobiconodon_death"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "gobiconodon_death")));
		sounds.put(new ResourceLocation("lepidodendron", "acrocanthosaurus_idle"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "acrocanthosaurus_idle")));
		sounds.put(new ResourceLocation("lepidodendron", "acrocanthosaurus_hurt"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "acrocanthosaurus_hurt")));
		sounds.put(new ResourceLocation("lepidodendron", "acrocanthosaurus_death"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "acrocanthosaurus_death")));
		sounds.put(new ResourceLocation("lepidodendron", "acrocanthosaurus_roar"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "acrocanthosaurus_roar")));
		sounds.put(new ResourceLocation("lepidodendron", "segisaurus_idle"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "segisaurus_idle")));
		sounds.put(new ResourceLocation("lepidodendron", "segisaurus_hurt"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "segisaurus_hurt")));
		sounds.put(new ResourceLocation("lepidodendron", "segisaurus_death"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "segisaurus_death")));
		sounds.put(new ResourceLocation("lepidodendron", "repenomamus_idle"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "repenomamus_idle")));
		sounds.put(new ResourceLocation("lepidodendron", "repenomamus_hurt"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "repenomamus_hurt")));
		sounds.put(new ResourceLocation("lepidodendron", "repenomamus_death"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "repenomamus_death")));
		sounds.put(new ResourceLocation("lepidodendron", "triadobatrachus_idle"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "triadobatrachus_idle")));
		sounds.put(new ResourceLocation("lepidodendron", "triadobatrachus_hurt"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "triadobatrachus_hurt")));
		sounds.put(new ResourceLocation("lepidodendron", "triadobatrachus_death"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "triadobatrachus_death")));
		sounds.put(new ResourceLocation("lepidodendron", "prestosuchus_idle"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "prestosuchus_idle")));
		sounds.put(new ResourceLocation("lepidodendron", "prestosuchus_hurt"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "prestosuchus_hurt")));
		sounds.put(new ResourceLocation("lepidodendron", "prestosuchus_death"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "prestosuchus_death")));
		sounds.put(new ResourceLocation("lepidodendron", "tapejara_idle"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "tapejara_idle")));
		sounds.put(new ResourceLocation("lepidodendron", "tapejara_hurt"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "tapejara_hurt")));
		sounds.put(new ResourceLocation("lepidodendron", "tapejara_death"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "tapejara_death")));
		sounds.put(new ResourceLocation("lepidodendron", "tapejara_alarm"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "tapejara_alarm")));
		sounds.put(new ResourceLocation("lepidodendron", "tapejara_display"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "tapejara_display")));
		sounds.put(new ResourceLocation("lepidodendron", "hypsilophodon_idle"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "hypsilophodon_idle")));
		sounds.put(new ResourceLocation("lepidodendron", "hypsilophodon_hurt"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "hypsilophodon_hurt")));
		sounds.put(new ResourceLocation("lepidodendron", "hypsilophodon_death"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "hypsilophodon_death")));
		sounds.put(new ResourceLocation("lepidodendron", "hypsilophodon_alarm"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "hypsilophodon_alarm")));
		sounds.put(new ResourceLocation("lepidodendron", "hypsilophodon_chatter"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "hypsilophodon_chatter")));
		sounds.put(new ResourceLocation("lepidodendron", "hypsilophodon_long_chatter"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "hypsilophodon_long_chatter")));
		sounds.put(new ResourceLocation("lepidodendron", "eocarcharia_idle"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "eocarcharia_idle")));
		sounds.put(new ResourceLocation("lepidodendron", "eocarcharia_hurt"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "eocarcharia_hurt")));
		sounds.put(new ResourceLocation("lepidodendron", "eocarcharia_death"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "eocarcharia_death")));
		sounds.put(new ResourceLocation("lepidodendron", "eocarcharia_roar"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("lepidodendron", "eocarcharia_roar")));
	}


	public void preInit(FMLPreInitializationEvent event) {
		try {
			for (ASMDataTable.ASMData asmData : event.getAsmData().getAll(ModElement.Tag.class.getName())) {
				Class<?> clazz = Class.forName(asmData.getClassName());
				if (clazz.getSuperclass() == ElementsLepidodendronMod.ModElement.class)
					elements.add((ElementsLepidodendronMod.ModElement) clazz.getConstructor(this.getClass()).newInstance(this));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		Collections.sort(elements);
		elements.forEach(ElementsLepidodendronMod.ModElement::initElements);
		{
			this.addNetworkMessage(LepidodendronModVariables.WorldSavedDataSyncMessageHandler.class,
					LepidodendronModVariables.WorldSavedDataSyncMessage.class, Side.SERVER, Side.CLIENT);
		}

	}

	public void registerSounds(RegistryEvent.Register<net.minecraft.util.SoundEvent> event) {
		for (Map.Entry<ResourceLocation, net.minecraft.util.SoundEvent> sound : sounds.entrySet())
			event.getRegistry().register(sound.getValue().setRegistryName(sound.getKey()));


	}

	@Override
	public void generate(Random random, int chunkX, int chunkZ, World world, IChunkGenerator cg, IChunkProvider cp) {
		elements.forEach(element -> element.generateWorld(random, chunkX * 16, chunkZ * 16, world, world.provider.getDimension(), cg, cp));
	}

	@Override
	public int getBurnTime(ItemStack fuel) {
		for (ModElement element : elements) {
			int ret = element.addFuel(fuel);
			if (ret != 0)
				return ret;
		}
		return 0;
	}

	@SubscribeEvent
	public void onPlayerLoggedIn(net.minecraftforge.fml.common.gameevent.PlayerEvent.PlayerLoggedInEvent event) {
		if (!event.player.world.isRemote) {
			WorldSavedData mapdata = LepidodendronModVariables.MapVariables.get(event.player.world);
			WorldSavedData worlddata = LepidodendronModVariables.WorldVariables.get(event.player.world);
			if (mapdata != null)
				LepidodendronMod.PACKET_HANDLER.sendTo(new LepidodendronModVariables.WorldSavedDataSyncMessage(0, mapdata),
						(EntityPlayerMP) event.player);
			if (worlddata != null)
				LepidodendronMod.PACKET_HANDLER.sendTo(new LepidodendronModVariables.WorldSavedDataSyncMessage(1, worlddata),
						(EntityPlayerMP) event.player);
		}
	}

	@SubscribeEvent
	public void onPlayerChangedDimension(net.minecraftforge.fml.common.gameevent.PlayerEvent.PlayerChangedDimensionEvent event) {
		if (!event.player.world.isRemote) {
			WorldSavedData worlddata = LepidodendronModVariables.WorldVariables.get(event.player.world);
			if (worlddata != null)
				LepidodendronMod.PACKET_HANDLER.sendTo(new LepidodendronModVariables.WorldSavedDataSyncMessage(1, worlddata),
						(EntityPlayerMP) event.player);
		}
	}
	private int messageID = 0;
	public <T extends IMessage, V extends IMessage> void addNetworkMessage(Class<? extends IMessageHandler<T, V>> handler, Class<T> messageClass,
			Side... sides) {
		for (Side side : sides)
			LepidodendronMod.PACKET_HANDLER.registerMessage(handler, messageClass, messageID, side);
		messageID++;
	}

	public static class GuiHandler implements IGuiHandler {
		@Override
		public Object getServerGuiElement(int id, EntityPlayer player, World world, int x, int y, int z) {
			if (id == GUIAcidBath.GUIID) {
				return new GUIAcidBath.GUILepidodendronAcidBath(world, x, y, z, player);
			}
			if (id == GUIDNACentrifuge.GUIID) {
				return new GUIDNACentrifuge.GUILepidodendronDNACentrifuge(world, x, y, z, player);
			}
			if (id == GUIDNAForge.GUIID) {
				return new GUIDNAForge.GUILepidodendronDNAForge(world, x, y, z, player);
			}
			if (id == GUICoalTarProcessor.GUIID) {
				return new GUICoalTarProcessor.GUILepidodendronCoalTarProcessor(world, x, y, z, player);
			}
			if (id == GUIOligopoolMachine.GUIID) {
				return new GUIOligopoolMachine.GUILepidodendronOligopoolMachine(world, x, y, z, player);
			}
			if (id == GUILabBench.GUIID) {
				return new GUILabBench.GUILepidodendronLabBench(world, x, y, z, player);
			}
			if (id == GUIMicroscope.GUIID) {
				return new GUIMicroscope.GUILepidodendronMicroscope(world, x, y, z, player);
			}
			if (id == GUISorterFossil.GUIID) {
				return new GUISorterFossil.GUILepidodendronSorterFossil(world, x, y, z, player);
			}
			if (id == GUITaxidermyTable.GUIID) {
				return new GUITaxidermyTable.GUILepidodendronTaxidermyTable(world, x, y, z, player);
			}
			if (id == GUITrapAir.GUIID) {
				return new GUITrapAir.GUILepidodendronTrapAir(world, x, y, z, player);
			}
			if (id == GUITrapGround.GUIID) {
				return new GUITrapGround.GUILepidodendronTrapGround(world, x, y, z, player);
			}
			if (id == GUITrapWater.GUIID) {
				return new GUITrapWater.GUILepidodendronTrapWater(world, x, y, z, player);
			}
			if (id == GUIBatterySubmarine.GUIID) {
				return new GUIBatterySubmarine.GUILepidodendronBatterySubmarine(world, x, y, z, player);
			}
			if (id == GUITimeResearcher.GUIID) {
				return new GUITimeResearcher.GUILepidodendronTimeResearcher(world, x, y, z, player);
			}
			if (id == GUITimeResearcherFinder.GUIID) {
				return new GUITimeResearcherFinder.GUILepidodendronTimeResearcherFinder(world, x, y, z, player);
			}
			if (id == GUIArchiveSorterTop.GUIID) {
				return new GUIArchiveSorterTop.GUILepidodendronArchiveSorterTop(world, x, y, z, player);
			}
			if (id == GUIArchiveSorterBottom.GUIID) {
				return new GUIArchiveSorterBottom.GUILepidodendronArchiveSorterBottom(world, x, y, z, player);
			}
			if (id == GUILabCabinet.GUIID) {
				return new GUILabCabinet.GUILepidodendronLabCabinet(world, x, y, z, player);
			}
			if (id == GUIPortalBlock.GUIID) {
				return new GUIPortalBlock.GUILepidodendronPortalBlock(world, x, y, z, player);
			}
			if (id == GUISubmarine.GUIID) {
				return new GUISubmarine.GUILepidodendronSubmarine(world, x, y, z, player);
			}
			return null;
		}

		@Override
		public Object getClientGuiElement(int id, EntityPlayer player, World world, int x, int y, int z) {
			if (id == GUIAcidBath.GUIID) {
				return new GUIAcidBath.GuiWindow(world, x, y, z, player);
			}
			if (id == GUIDNACentrifuge.GUIID) {
				return new GUIDNACentrifuge.GuiWindow(world, x, y, z, player);
			}
			if (id == GUIDNAForge.GUIID) {
				return new GUIDNAForge.GuiWindow(world, x, y, z, player);
			}
			if (id == GUICoalTarProcessor.GUIID) {
				return new GUICoalTarProcessor.GuiWindow(world, x, y, z, player);
			}
			if (id == GUIOligopoolMachine.GUIID) {
				return new GUIOligopoolMachine.GuiWindow(world, x, y, z, player);
			}
			if (id == GUILabBench.GUIID) {
				return new GUILabBench.GuiWindow(world, x, y, z, player);
			}
			if (id == GUIMicroscope.GUIID) {
				return new GUIMicroscope.GuiWindow(world, x, y, z, player);
			}
			if (id == GUISorterFossil.GUIID) {
				return new GUISorterFossil.GuiWindow(world, x, y, z, player);
			}
			if (id == GUITaxidermyTable.GUIID) {
				return new GUITaxidermyTable.GuiWindow(world, x, y, z, player);
			}
			if (id == GUITrapAir.GUIID) {
				return new GUITrapAir.GuiWindow(world, x, y, z, player);
			}
			if (id == GUITrapGround.GUIID) {
				return new GUITrapGround.GuiWindow(world, x, y, z, player);
			}
			if (id == GUITrapWater.GUIID) {
				return new GUITrapWater.GuiWindow(world, x, y, z, player);
			}
			if (id == GUIBatterySubmarine.GUIID) {
				return new GUIBatterySubmarine.GuiWindow(world, x, y, z, player);
			}
			if (id == GUITimeResearcher.GUIID) {
				return new GUITimeResearcher.GuiWindow(world, x, y, z, player);
			}
			if (id == GUITimeResearcherFinder.GUIID) {
				return new GUITimeResearcherFinder.GuiWindow(world, x, y, z, player);
			}
			if (id == GUIArchiveSorterTop.GUIID) {
				return new GUIArchiveSorterTop.GuiWindow(world, x, y, z, player);
			}
			if (id == GUIArchiveSorterBottom.GUIID) {
				return new GUIArchiveSorterBottom.GuiWindow(world, x, y, z, player);
			}
			if (id == GUILabCabinet.GUIID) {
				return new GUILabCabinet.GuiWindow(world, x, y, z, player);
			}
			if (id == GUIPortalBlock.GUIID) {
				return new GUIPortalBlock.GuiWindow(world, x, y, z, player);
			}
			if (id == GUISubmarine.GUIID) {
				return new GUISubmarine.GuiWindow(world, x, y, z, player);
			}
			return null;
		}

	}

	public List<ModElement> getElements() {
		return elements;
	}

	public List<Supplier<Block>> getBlocks() {
		return blocks;
	}

	public List<Supplier<Item>> getItems() {
		return items;
	}

	public List<Supplier<Biome>> getBiomes() {
		return biomes;
	}

	public List<Supplier<EntityEntry>> getEntities() {
		return entities;
	}

	public List<Supplier<Potion>> getPotions() {
		return potions;
	}

	public static class ModElement implements Comparable<ModElement> {
		@Retention(RetentionPolicy.RUNTIME)
		public @interface Tag {
		}
		protected final ElementsLepidodendronMod elements;
		protected final int sortid;
		public ModElement(ElementsLepidodendronMod elements, int sortid) {
			this.elements = elements;
			this.sortid = sortid;
		}

		public void initElements() {
		}

		public void init(FMLInitializationEvent event) {
		}

		public void preInit(FMLPreInitializationEvent event) {
		}

		public void generateWorld(Random random, int posX, int posZ, World world, int dimID, IChunkGenerator cg, IChunkProvider cp) {
		}

		public void serverLoad(FMLServerStartingEvent event) {
		}

		public void registerModels(ModelRegistryEvent event) {
		}

		public int addFuel(ItemStack fuel) {
			return 0;
		}

		@Override
		public int compareTo(ModElement other) {
			return this.sortid - other.sortid;
		}
	}

}
