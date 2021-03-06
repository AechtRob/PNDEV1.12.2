package net.lepidodendron.entity.render;

import net.lepidodendron.LepidodendronConfig;
import net.lepidodendron.block.*;
import net.lepidodendron.entity.*;
import net.lepidodendron.entity.render.entity.*;
import net.lepidodendron.entity.render.tile.*;
import net.lepidodendron.tileentity.TileEntityFacivermis;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraftforge.fml.client.registry.ClientRegistry;
import net.minecraftforge.fml.client.registry.IRenderFactory;
import net.minecraftforge.fml.client.registry.RenderingRegistry;

public class RenderHandler {

    public static void RegisterEntityRenders() {
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraWalliserops.class, new IRenderFactory<EntityPrehistoricFloraWalliserops>() {
            @Override
            public Render<? super EntityPrehistoricFloraWalliserops> createRenderFor(RenderManager manager) {
                return new RenderWalliserops(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraPneumodesmus.class, new IRenderFactory<EntityPrehistoricFloraPneumodesmus>() {
            @Override
            public Render<? super EntityPrehistoricFloraPneumodesmus> createRenderFor(RenderManager manager) {
                return new RenderPneumodesmus(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraCheirurus.class, new IRenderFactory<EntityPrehistoricFloraCheirurus>() {
            @Override
            public Render<? super EntityPrehistoricFloraCheirurus> createRenderFor(RenderManager manager) {
                return new RenderCheirurus(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraIsotelus.class, new IRenderFactory<EntityPrehistoricFloraIsotelus>() {
            @Override
            public Render<? super EntityPrehistoricFloraIsotelus> createRenderFor(RenderManager manager) {
                return new RenderIsotelus(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraAsaphus.class, new IRenderFactory<EntityPrehistoricFloraAsaphus>() {
            @Override
            public Render<? super EntityPrehistoricFloraAsaphus> createRenderFor(RenderManager manager) {
                return new RenderAsaphus(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraPromissum.class, new IRenderFactory<EntityPrehistoricFloraPromissum>() {
            @Override
            public Render<? super EntityPrehistoricFloraPromissum> createRenderFor(RenderManager manager) {
                return new RenderPromissum(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraAcanthodes.class, new IRenderFactory<EntityPrehistoricFloraAcanthodes>() {
            @Override
            public Render<? super EntityPrehistoricFloraAcanthodes> createRenderFor(RenderManager manager) {
                return new RenderAcanthodes(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraJellyfish1.class, new IRenderFactory<EntityPrehistoricFloraJellyfish1>() {
            @Override
            public Render<? super EntityPrehistoricFloraJellyfish1> createRenderFor(RenderManager manager) {
                return new RenderJellyfish1(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraJellyfish2.class, new IRenderFactory<EntityPrehistoricFloraJellyfish2>() {
            @Override
            public Render<? super EntityPrehistoricFloraJellyfish2> createRenderFor(RenderManager manager) {
                return new RenderJellyfish2(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraJellyfish3.class, new IRenderFactory<EntityPrehistoricFloraJellyfish3>() {
            @Override
            public Render<? super EntityPrehistoricFloraJellyfish3> createRenderFor(RenderManager manager) {
                return new RenderJellyfish3(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraJellyfish4.class, new IRenderFactory<EntityPrehistoricFloraJellyfish4>() {
            @Override
            public Render<? super EntityPrehistoricFloraJellyfish4> createRenderFor(RenderManager manager) {
                return new RenderJellyfish4(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraJellyfish5.class, new IRenderFactory<EntityPrehistoricFloraJellyfish5>() {
            @Override
            public Render<? super EntityPrehistoricFloraJellyfish5> createRenderFor(RenderManager manager) {
                return new RenderJellyfish5(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraJellyfish6.class, new IRenderFactory<EntityPrehistoricFloraJellyfish6>() {
            @Override
            public Render<? super EntityPrehistoricFloraJellyfish6> createRenderFor(RenderManager manager) {
                return new RenderJellyfish6(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraJellyfish7.class, new IRenderFactory<EntityPrehistoricFloraJellyfish7>() {
            @Override
            public Render<? super EntityPrehistoricFloraJellyfish7> createRenderFor(RenderManager manager) {
                return new RenderJellyfish7(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraBothriolepis.class, new IRenderFactory<EntityPrehistoricFloraBothriolepis>() {
            @Override
            public Render<? super EntityPrehistoricFloraBothriolepis> createRenderFor(RenderManager manager) {
                return new RenderBothriolepis(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraEurypterus.class, new IRenderFactory<EntityPrehistoricFloraEurypterus>() {
            @Override
            public Render<? super EntityPrehistoricFloraEurypterus> createRenderFor(RenderManager manager) {
                return new RenderEurypterus(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraPteraspis.class, new IRenderFactory<EntityPrehistoricFloraPteraspis>() {
            @Override
            public Render<? super EntityPrehistoricFloraPteraspis> createRenderFor(RenderManager manager) {
                return new RenderPteraspis(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraCyrtoceras.class, new IRenderFactory<EntityPrehistoricFloraCyrtoceras>() {
            @Override
            public Render<? super EntityPrehistoricFloraCyrtoceras> createRenderFor(RenderManager manager) {
                return new RenderCyrtoceras(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraArandaspis.class, new IRenderFactory<EntityPrehistoricFloraArandaspis>() {
            @Override
            public Render<? super EntityPrehistoricFloraArandaspis> createRenderFor(RenderManager manager) {
                return new RenderArandaspis(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraAnthracomedusa.class, new IRenderFactory<EntityPrehistoricFloraAnthracomedusa>() {
            @Override
            public Render<? super EntityPrehistoricFloraAnthracomedusa> createRenderFor(RenderManager manager) {
                return new RenderAnthracomedusa(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraLimnoscelis.class, new IRenderFactory<EntityPrehistoricFloraLimnoscelis>() {
            @Override
            public Render<? super EntityPrehistoricFloraLimnoscelis> createRenderFor(RenderManager manager) {
                return new RenderLimnoscelis(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraSacabambaspis.class, new IRenderFactory<EntityPrehistoricFloraSacabambaspis>() {
            @Override
            public Render<? super EntityPrehistoricFloraSacabambaspis> createRenderFor(RenderManager manager) {
                return new RenderSacabambaspis(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraHibernaspis.class, new IRenderFactory<EntityPrehistoricFloraHibernaspis>() {
            @Override
            public Render<? super EntityPrehistoricFloraHibernaspis> createRenderFor(RenderManager manager) {
                return new RenderHibernaspis(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraEoarthropleura.class, new IRenderFactory<EntityPrehistoricFloraEoarthropleura>() {
            @Override
            public Render<? super EntityPrehistoricFloraEoarthropleura> createRenderFor(RenderManager manager) {
                return new RenderEoarthropleura(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraAmmonite_Manticoceras.class, new IRenderFactory<EntityPrehistoricFloraAmmonite_Manticoceras>() {
            @Override
            public Render<? super EntityPrehistoricFloraAmmonite_Manticoceras> createRenderFor(RenderManager manager) {
                return new RenderAmmonite_Manticoceras(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraAmmonite_Goniatites.class, new IRenderFactory<EntityPrehistoricFloraAmmonite_Goniatites>() {
            @Override
            public Render<? super EntityPrehistoricFloraAmmonite_Goniatites> createRenderFor(RenderManager manager) {
                return new RenderAmmonite_Goniatites(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraAmmonite_Cylolobus.class, new IRenderFactory<EntityPrehistoricFloraAmmonite_Cylolobus>() {
            @Override
            public Render<? super EntityPrehistoricFloraAmmonite_Cylolobus> createRenderFor(RenderManager manager) {
                return new RenderAmmonite_Cylolobus(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraAmmonite_Parapuzosia.class, new IRenderFactory<EntityPrehistoricFloraAmmonite_Parapuzosia>() {
            @Override
            public Render<? super EntityPrehistoricFloraAmmonite_Parapuzosia> createRenderFor(RenderManager manager) {
                return new RenderAmmonite_Parapuzosia(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraAmmonite_Dactylioceras.class, new IRenderFactory<EntityPrehistoricFloraAmmonite_Dactylioceras>() {
            @Override
            public Render<? super EntityPrehistoricFloraAmmonite_Dactylioceras> createRenderFor(RenderManager manager) {
                return new RenderAmmonite_Dactylioceras(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraAmmonite_Titanites.class, new IRenderFactory<EntityPrehistoricFloraAmmonite_Titanites>() {
            @Override
            public Render<? super EntityPrehistoricFloraAmmonite_Titanites> createRenderFor(RenderManager manager) {
                return new RenderAmmonite_Titanites(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraAmmonite_Asteroceras.class, new IRenderFactory<EntityPrehistoricFloraAmmonite_Asteroceras>() {
            @Override
            public Render<? super EntityPrehistoricFloraAmmonite_Asteroceras> createRenderFor(RenderManager manager) {
                return new RenderAmmonite_Asteroceras(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraAmmonite_Pachydesmoceras.class, new IRenderFactory<EntityPrehistoricFloraAmmonite_Pachydesmoceras>() {
            @Override
            public Render<? super EntityPrehistoricFloraAmmonite_Pachydesmoceras> createRenderFor(RenderManager manager) {
                return new RenderAmmonite_Pachydesmoceras(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraAmmonite_Pachydiscus.class, new IRenderFactory<EntityPrehistoricFloraAmmonite_Pachydiscus>() {
            @Override
            public Render<? super EntityPrehistoricFloraAmmonite_Pachydiscus> createRenderFor(RenderManager manager) {
                return new RenderAmmonite_Pachydiscus(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraAmmonite_Coroniceras.class, new IRenderFactory<EntityPrehistoricFloraAmmonite_Coroniceras>() {
            @Override
            public Render<? super EntityPrehistoricFloraAmmonite_Coroniceras> createRenderFor(RenderManager manager) {
                return new RenderAmmonite_Coroniceras(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraAmmonite_Ceratites.class, new IRenderFactory<EntityPrehistoricFloraAmmonite_Ceratites>() {
            @Override
            public Render<? super EntityPrehistoricFloraAmmonite_Ceratites> createRenderFor(RenderManager manager) {
                return new RenderAmmonite_Ceratites(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraHibbertopterus.class, new IRenderFactory<EntityPrehistoricFloraHibbertopterus>() {
            @Override
            public Render<? super EntityPrehistoricFloraHibbertopterus> createRenderFor(RenderManager manager) {
                return new RenderHibbertopterus(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraTerataspis.class, new IRenderFactory<EntityPrehistoricFloraTerataspis>() {
            @Override
            public Render<? super EntityPrehistoricFloraTerataspis> createRenderFor(RenderManager manager) {
                return new RenderTerataspis(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraFurcacauda.class, new IRenderFactory<EntityPrehistoricFloraFurcacauda>() {
            @Override
            public Render<? super EntityPrehistoricFloraFurcacauda> createRenderFor(RenderManager manager) {
                return new RenderFurcacauda(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraSquatinactis.class, new IRenderFactory<EntityPrehistoricFloraSquatinactis>() {
            @Override
            public Render<? super EntityPrehistoricFloraSquatinactis> createRenderFor(RenderManager manager) {
                return new RenderSquatinactis(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraPalaeodictyopteraNymph.class, new IRenderFactory<EntityPrehistoricFloraPalaeodictyopteraNymph>() {
            @Override
            public Render<? super EntityPrehistoricFloraPalaeodictyopteraNymph> createRenderFor(RenderManager manager) {
                return new RenderPalaeodictyopteraNymph(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraQilinyu.class, new IRenderFactory<EntityPrehistoricFloraQilinyu>() {
            @Override
            public Render<? super EntityPrehistoricFloraQilinyu> createRenderFor(RenderManager manager) {
                return new RenderQilinyu(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraPoraspis.class, new IRenderFactory<EntityPrehistoricFloraPoraspis>() {
            @Override
            public Render<? super EntityPrehistoricFloraPoraspis> createRenderFor(RenderManager manager) {
                return new RenderPoraspis(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraAphetoceras.class, new IRenderFactory<EntityPrehistoricFloraAphetoceras>() {
            @Override
            public Render<? super EntityPrehistoricFloraAphetoceras> createRenderFor(RenderManager manager) {
                return new RenderAphetoceras(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraEndoceras.class, new IRenderFactory<EntityPrehistoricFloraEndoceras>() {
            @Override
            public Render<? super EntityPrehistoricFloraEndoceras> createRenderFor(RenderManager manager) {
                return new RenderEndoceras(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraCameroceras.class, new IRenderFactory<EntityPrehistoricFloraCameroceras>() {
            @Override
            public Render<? super EntityPrehistoricFloraCameroceras> createRenderFor(RenderManager manager) {
                return new RenderCameroceras(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraOrthoceras.class, new IRenderFactory<EntityPrehistoricFloraOrthoceras>() {
            @Override
            public Render<? super EntityPrehistoricFloraOrthoceras> createRenderFor(RenderManager manager) {
                return new RenderOrthoceras(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraPalaeodictyoptera_Delitzschala.class, new IRenderFactory<EntityPrehistoricFloraPalaeodictyoptera_Delitzschala>() {
            @Override
            public Render<? super EntityPrehistoricFloraPalaeodictyoptera_Delitzschala> createRenderFor(RenderManager manager) {
                return new RenderPalaeodictyoptera_Delitzschala(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraPalaeodictyoptera_Dunbaria.class, new IRenderFactory<EntityPrehistoricFloraPalaeodictyoptera_Dunbaria>() {
            @Override
            public Render<? super EntityPrehistoricFloraPalaeodictyoptera_Dunbaria> createRenderFor(RenderManager manager) {
                return new RenderPalaeodictyoptera_Dunbaria(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraPalaeodictyoptera_Homaloneura.class, new IRenderFactory<EntityPrehistoricFloraPalaeodictyoptera_Homaloneura>() {
            @Override
            public Render<? super EntityPrehistoricFloraPalaeodictyoptera_Homaloneura> createRenderFor(RenderManager manager) {
                return new RenderPalaeodictyoptera_Homaloneura(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraPalaeodictyoptera_Homoioptera.class, new IRenderFactory<EntityPrehistoricFloraPalaeodictyoptera_Homoioptera>() {
            @Override
            public Render<? super EntityPrehistoricFloraPalaeodictyoptera_Homoioptera> createRenderFor(RenderManager manager) {
                return new RenderPalaeodictyoptera_Homoioptera(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraPalaeodictyoptera_Lithomantis.class, new IRenderFactory<EntityPrehistoricFloraPalaeodictyoptera_Lithomantis>() {
            @Override
            public Render<? super EntityPrehistoricFloraPalaeodictyoptera_Lithomantis> createRenderFor(RenderManager manager) {
                return new RenderPalaeodictyoptera_Lithomantis(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraPalaeodictyoptera_Lycocercus.class, new IRenderFactory<EntityPrehistoricFloraPalaeodictyoptera_Lycocercus>() {
            @Override
            public Render<? super EntityPrehistoricFloraPalaeodictyoptera_Lycocercus> createRenderFor(RenderManager manager) {
                return new RenderPalaeodictyoptera_Lycocercus(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraPalaeodictyoptera_Sinodunbaria.class, new IRenderFactory<EntityPrehistoricFloraPalaeodictyoptera_Sinodunbaria>() {
            @Override
            public Render<? super EntityPrehistoricFloraPalaeodictyoptera_Sinodunbaria> createRenderFor(RenderManager manager) {
                return new RenderPalaeodictyoptera_Sinodunbaria(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraPalaeodictyoptera_Stenodictya.class, new IRenderFactory<EntityPrehistoricFloraPalaeodictyoptera_Stenodictya>() {
            @Override
            public Render<? super EntityPrehistoricFloraPalaeodictyoptera_Stenodictya> createRenderFor(RenderManager manager) {
                return new RenderPalaeodictyoptera_Stenodictya(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraJellyfish_Precambrian.class, new IRenderFactory<EntityPrehistoricFloraJellyfish_Precambrian>() {
            @Override
            public Render<? super EntityPrehistoricFloraJellyfish_Precambrian> createRenderFor(RenderManager manager) {
                return new RenderJellyfish_Precambrian(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraSchinderhannes.class, new IRenderFactory<EntityPrehistoricFloraSchinderhannes>() {
            @Override
            public Render<? super EntityPrehistoricFloraSchinderhannes> createRenderFor(RenderManager manager) {
                return new RenderSchinderhannes(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraTitanichthys.class, new IRenderFactory<EntityPrehistoricFloraTitanichthys>() {
            @Override
            public Render<? super EntityPrehistoricFloraTitanichthys> createRenderFor(RenderManager manager) {
                return new RenderTitanichthys(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraIchthyostega.class, new IRenderFactory<EntityPrehistoricFloraIchthyostega>() {
            @Override
            public Render<? super EntityPrehistoricFloraIchthyostega> createRenderFor(RenderManager manager) {
                return new RenderIchthyostega(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraAmphibamus.class, new IRenderFactory<EntityPrehistoricFloraAmphibamus>() {
            @Override
            public Render<? super EntityPrehistoricFloraAmphibamus> createRenderFor(RenderManager manager) {
                return new RenderAmphibamus(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraMixopterus.class, new IRenderFactory<EntityPrehistoricFloraMixopterus>() {
            @Override
            public Render<? super EntityPrehistoricFloraMixopterus> createRenderFor(RenderManager manager) {
                return new RenderMixopterus(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraJaekelopterus.class, new IRenderFactory<EntityPrehistoricFloraJaekelopterus>() {
            @Override
            public Render<? super EntityPrehistoricFloraJaekelopterus> createRenderFor(RenderManager manager) {
                return new RenderJaekelopterus(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraPterygotus.class, new IRenderFactory<EntityPrehistoricFloraPterygotus>() {
            @Override
            public Render<? super EntityPrehistoricFloraPterygotus> createRenderFor(RenderManager manager) {
                return new RenderPterygotus(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraMegarachne.class, new IRenderFactory<EntityPrehistoricFloraMegarachne>() {
            @Override
            public Render<? super EntityPrehistoricFloraMegarachne> createRenderFor(RenderManager manager) {
                return new RenderMegarachne(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraLunataspis.class, new IRenderFactory<EntityPrehistoricFloraLunataspis>() {
            @Override
            public Render<? super EntityPrehistoricFloraLunataspis> createRenderFor(RenderManager manager) {
                return new RenderLunataspis(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraSelenopeltis.class, new IRenderFactory<EntityPrehistoricFloraSelenopeltis>() {
            @Override
            public Render<? super EntityPrehistoricFloraSelenopeltis> createRenderFor(RenderManager manager) {
                return new RenderSelenopeltis(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraHemicyclaspis.class, new IRenderFactory<EntityPrehistoricFloraHemicyclaspis>() {
            @Override
            public Render<? super EntityPrehistoricFloraHemicyclaspis> createRenderFor(RenderManager manager) {
                return new RenderHemicyclaspis(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraAteleaspis.class, new IRenderFactory<EntityPrehistoricFloraAteleaspis>() {
            @Override
            public Render<? super EntityPrehistoricFloraAteleaspis> createRenderFor(RenderManager manager) {
                return new RenderAteleaspis(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraCephalaspis.class, new IRenderFactory<EntityPrehistoricFloraCephalaspis>() {
            @Override
            public Render<? super EntityPrehistoricFloraCephalaspis> createRenderFor(RenderManager manager) {
                return new RenderCephalaspis(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraPsarolepis.class, new IRenderFactory<EntityPrehistoricFloraPsarolepis>() {
            @Override
            public Render<? super EntityPrehistoricFloraPsarolepis> createRenderFor(RenderManager manager) {
                return new RenderPsarolepis(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraAegirocassis.class, new IRenderFactory<EntityPrehistoricFloraAegirocassis>() {
            @Override
            public Render<? super EntityPrehistoricFloraAegirocassis> createRenderFor(RenderManager manager) {
                return new RenderAegirocassis(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraThelodus.class, new IRenderFactory<EntityPrehistoricFloraThelodus>() {
            @Override
            public Render<? super EntityPrehistoricFloraThelodus> createRenderFor(RenderManager manager) {
                return new RenderThelodus(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraTullimonstrum.class, new IRenderFactory<EntityPrehistoricFloraTullimonstrum>() {
            @Override
            public Render<? super EntityPrehistoricFloraTullimonstrum> createRenderFor(RenderManager manager) {
                return new RenderTullimonstrum(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraAttercopus.class, new IRenderFactory<EntityPrehistoricFloraAttercopus>() {
            @Override
            public Render<? super EntityPrehistoricFloraAttercopus> createRenderFor(RenderManager manager) {
                return new RenderAttercopus(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraTrigonotarbid_Palaeotarbus.class, new IRenderFactory<EntityPrehistoricFloraTrigonotarbid_Palaeotarbus>() {
            @Override
            public Render<? super EntityPrehistoricFloraTrigonotarbid_Palaeotarbus> createRenderFor(RenderManager manager) {
                return new RenderTrigonotarbid_Palaeotarbus(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraTrigonotarbid_Palaeocharinus.class, new IRenderFactory<EntityPrehistoricFloraTrigonotarbid_Palaeocharinus>() {
            @Override
            public Render<? super EntityPrehistoricFloraTrigonotarbid_Palaeocharinus> createRenderFor(RenderManager manager) {
                return new RenderTrigonotarbid_Palaeocharinus(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraTrigonotarbid_Eophrynus.class, new IRenderFactory<EntityPrehistoricFloraTrigonotarbid_Eophrynus>() {
            @Override
            public Render<? super EntityPrehistoricFloraTrigonotarbid_Eophrynus> createRenderFor(RenderManager manager) {
                return new RenderTrigonotarbid_Eophrynus(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraTrigonotarbid_Kreischeria.class, new IRenderFactory<EntityPrehistoricFloraTrigonotarbid_Kreischeria>() {
            @Override
            public Render<? super EntityPrehistoricFloraTrigonotarbid_Kreischeria> createRenderFor(RenderManager manager) {
                return new RenderTrigonotarbid_Kreischeria(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraTrigonotarbid_Cryptomartus.class, new IRenderFactory<EntityPrehistoricFloraTrigonotarbid_Cryptomartus>() {
            @Override
            public Render<? super EntityPrehistoricFloraTrigonotarbid_Cryptomartus> createRenderFor(RenderManager manager) {
                return new RenderTrigonotarbid_Cryptomartus(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraTrigonotarbid_Permotarbus.class, new IRenderFactory<EntityPrehistoricFloraTrigonotarbid_Permotarbus>() {
            @Override
            public Render<? super EntityPrehistoricFloraTrigonotarbid_Permotarbus> createRenderFor(RenderManager manager) {
                return new RenderTrigonotarbid_Permotarbus(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraDickinsonia.class, new IRenderFactory<EntityPrehistoricFloraDickinsonia>() {
            @Override
            public Render<? super EntityPrehistoricFloraDickinsonia> createRenderFor(RenderManager manager) {
                return new RenderDickinsonia(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraKimberella.class, new IRenderFactory<EntityPrehistoricFloraKimberella>() {
            @Override
            public Render<? super EntityPrehistoricFloraKimberella> createRenderFor(RenderManager manager) {
                return new RenderKimberella(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraEoandromeda.class, new IRenderFactory<EntityPrehistoricFloraEoandromeda>() {
            @Override
            public Render<? super EntityPrehistoricFloraEoandromeda> createRenderFor(RenderManager manager) {
                return new RenderEoandromeda(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraParvancorina.class, new IRenderFactory<EntityPrehistoricFloraParvancorina>() {
            @Override
            public Render<? super EntityPrehistoricFloraParvancorina> createRenderFor(RenderManager manager) {
                return new RenderParvancorina(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraSpriggina.class, new IRenderFactory<EntityPrehistoricFloraSpriggina>() {
            @Override
            public Render<? super EntityPrehistoricFloraSpriggina> createRenderFor(RenderManager manager) {
                return new RenderSpriggina(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraYilingia.class, new IRenderFactory<EntityPrehistoricFloraYilingia>() {
            @Override
            public Render<? super EntityPrehistoricFloraYilingia> createRenderFor(RenderManager manager) {
                return new RenderYilingia(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraYorgia.class, new IRenderFactory<EntityPrehistoricFloraYorgia>() {
            @Override
            public Render<? super EntityPrehistoricFloraYorgia> createRenderFor(RenderManager manager) {
                return new RenderYorgia(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraTrigonotarbid_Palaeotarbus.class, new IRenderFactory<EntityPrehistoricFloraTrigonotarbid_Palaeotarbus>() {
            @Override
            public Render<? super EntityPrehistoricFloraTrigonotarbid_Palaeotarbus> createRenderFor(RenderManager manager) {
                return new RenderTrigonotarbid_Palaeotarbus(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraTrigonotarbid_Palaeocharinus.class, new IRenderFactory<EntityPrehistoricFloraTrigonotarbid_Palaeocharinus>() {
            @Override
            public Render<? super EntityPrehistoricFloraTrigonotarbid_Palaeocharinus> createRenderFor(RenderManager manager) {
                return new RenderTrigonotarbid_Palaeocharinus(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraTrigonotarbid_Eophrynus.class, new IRenderFactory<EntityPrehistoricFloraTrigonotarbid_Eophrynus>() {
            @Override
            public Render<? super EntityPrehistoricFloraTrigonotarbid_Eophrynus> createRenderFor(RenderManager manager) {
                return new RenderTrigonotarbid_Eophrynus(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraTrigonotarbid_Kreischeria.class, new IRenderFactory<EntityPrehistoricFloraTrigonotarbid_Kreischeria>() {
            @Override
            public Render<? super EntityPrehistoricFloraTrigonotarbid_Kreischeria> createRenderFor(RenderManager manager) {
                return new RenderTrigonotarbid_Kreischeria(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraTrigonotarbid_Cryptomartus.class, new IRenderFactory<EntityPrehistoricFloraTrigonotarbid_Cryptomartus>() {
            @Override
            public Render<? super EntityPrehistoricFloraTrigonotarbid_Cryptomartus> createRenderFor(RenderManager manager) {
                return new RenderTrigonotarbid_Cryptomartus(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraTrigonotarbid_Permotarbus.class, new IRenderFactory<EntityPrehistoricFloraTrigonotarbid_Permotarbus>() {
            @Override
            public Render<? super EntityPrehistoricFloraTrigonotarbid_Permotarbus> createRenderFor(RenderManager manager) {
                return new RenderTrigonotarbid_Permotarbus(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraMonograptus.class, new IRenderFactory<EntityPrehistoricFloraMonograptus>() {
            @Override
            public Render<? super EntityPrehistoricFloraMonograptus> createRenderFor(RenderManager manager) {
                return new RenderMonograptus(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraDidymograptus.class, new IRenderFactory<EntityPrehistoricFloraDidymograptus>() {
            @Override
            public Render<? super EntityPrehistoricFloraDidymograptus> createRenderFor(RenderManager manager) {
                return new RenderDidymograptus(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraTetragraptus.class, new IRenderFactory<EntityPrehistoricFloraTetragraptus>() {
            @Override
            public Render<? super EntityPrehistoricFloraTetragraptus> createRenderFor(RenderManager manager) {
                return new RenderTetragraptus(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraPoleumita.class, new IRenderFactory<EntityPrehistoricFloraPoleumita>() {
            @Override
            public Render<? super EntityPrehistoricFloraPoleumita> createRenderFor(RenderManager manager) {
                return new RenderPoleumita(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraMaclurina.class, new IRenderFactory<EntityPrehistoricFloraMaclurina>() {
            @Override
            public Render<? super EntityPrehistoricFloraMaclurina> createRenderFor(RenderManager manager) {
                return new RenderMaclurina(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraCyclonema.class, new IRenderFactory<EntityPrehistoricFloraCyclonema>() {
            @Override
            public Render<? super EntityPrehistoricFloraCyclonema> createRenderFor(RenderManager manager) {
                return new RenderCyclonema(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraXenacanthus.class, new IRenderFactory<EntityPrehistoricFloraXenacanthus>() {
            @Override
            public Render<? super EntityPrehistoricFloraXenacanthus> createRenderFor(RenderManager manager) {
                return new RenderXenacanthus(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraBelantsea.class, new IRenderFactory<EntityPrehistoricFloraBelantsea>() {
            @Override
            public Render<? super EntityPrehistoricFloraBelantsea> createRenderFor(RenderManager manager) {
                return new RenderBelantsea(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraCampbellodus.class, new IRenderFactory<EntityPrehistoricFloraCampbellodus>() {
            @Override
            public Render<? super EntityPrehistoricFloraCampbellodus> createRenderFor(RenderManager manager) {
                return new RenderCampbellodus(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraPlatysomus.class, new IRenderFactory<EntityPrehistoricFloraPlatysomus>() {
            @Override
            public Render<? super EntityPrehistoricFloraPlatysomus> createRenderFor(RenderManager manager) {
                return new RenderPlatysomus(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraCoccosteus.class, new IRenderFactory<EntityPrehistoricFloraCoccosteus>() {
            @Override
            public Render<? super EntityPrehistoricFloraCoccosteus> createRenderFor(RenderManager manager) {
                return new RenderCoccosteus(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraAkmonistion.class, new IRenderFactory<EntityPrehistoricFloraAkmonistion>() {
            @Override
            public Render<? super EntityPrehistoricFloraAkmonistion> createRenderFor(RenderManager manager) {
                return new RenderAkmonistion(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraDracopristis.class, new IRenderFactory<EntityPrehistoricFloraDracopristis>() {
            @Override
            public Render<? super EntityPrehistoricFloraDracopristis> createRenderFor(RenderManager manager) {
                return new RenderDracopristis(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraCladoselache.class, new IRenderFactory<EntityPrehistoricFloraCladoselache>() {
            @Override
            public Render<? super EntityPrehistoricFloraCladoselache> createRenderFor(RenderManager manager) {
                return new RenderCladoselache(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraGemuendina.class, new IRenderFactory<EntityPrehistoricFloraGemuendina>() {
            @Override
            public Render<? super EntityPrehistoricFloraGemuendina> createRenderFor(RenderManager manager) {
                return new RenderGemuendina(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraHyneria.class, new IRenderFactory<EntityPrehistoricFloraHyneria>() {
            @Override
            public Render<? super EntityPrehistoricFloraHyneria> createRenderFor(RenderManager manager) {
                return new RenderHyneria(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraOnychodus.class, new IRenderFactory<EntityPrehistoricFloraOnychodus>() {
            @Override
            public Render<? super EntityPrehistoricFloraOnychodus> createRenderFor(RenderManager manager) {
                return new RenderOnychodus(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraRhizodus.class, new IRenderFactory<EntityPrehistoricFloraRhizodus>() {
            @Override
            public Render<? super EntityPrehistoricFloraRhizodus> createRenderFor(RenderManager manager) {
                return new RenderRhizodus(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraFurcaster.class, new IRenderFactory<EntityPrehistoricFloraFurcaster>() {
            @Override
            public Render<? super EntityPrehistoricFloraFurcaster> createRenderFor(RenderManager manager) {
                return new RenderFurcaster(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraKalbarria.class, new IRenderFactory<EntityPrehistoricFloraKalbarria>() {
            @Override
            public Render<? super EntityPrehistoricFloraKalbarria> createRenderFor(RenderManager manager) {
                return new RenderKalbarria(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraPalaeoisopus.class, new IRenderFactory<EntityPrehistoricFloraPalaeoisopus>() {
            @Override
            public Render<? super EntityPrehistoricFloraPalaeoisopus> createRenderFor(RenderManager manager) {
                return new RenderPalaeoisopus(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraAiniktozoon.class, new IRenderFactory<EntityPrehistoricFloraAiniktozoon>() {
            @Override
            public Render<? super EntityPrehistoricFloraAiniktozoon> createRenderFor(RenderManager manager) {
                return new RenderAiniktozoon(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraAcutiramus.class, new IRenderFactory<EntityPrehistoricFloraAcutiramus>() {
            @Override
            public Render<? super EntityPrehistoricFloraAcutiramus> createRenderFor(RenderManager manager) {
                return new RenderAcutiramus(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraTemperoceras.class, new IRenderFactory<EntityPrehistoricFloraTemperoceras>() {
            @Override
            public Render<? super EntityPrehistoricFloraTemperoceras> createRenderFor(RenderManager manager) {
                return new RenderTemperoceras(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraCarcinosoma.class, new IRenderFactory<EntityPrehistoricFloraCarcinosoma>() {
            @Override
            public Render<? super EntityPrehistoricFloraCarcinosoma> createRenderFor(RenderManager manager) {
                return new RenderCarcinosoma(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraKokomopterus.class, new IRenderFactory<EntityPrehistoricFloraKokomopterus>() {
            @Override
            public Render<? super EntityPrehistoricFloraKokomopterus> createRenderFor(RenderManager manager) {
                return new RenderKokomopterus(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraPagea.class, new IRenderFactory<EntityPrehistoricFloraPagea>() {
            @Override
            public Render<? super EntityPrehistoricFloraPagea> createRenderFor(RenderManager manager) {
                return new RenderPagea(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraEglonaspis.class, new IRenderFactory<EntityPrehistoricFloraEglonaspis>() {
            @Override
            public Render<? super EntityPrehistoricFloraEglonaspis> createRenderFor(RenderManager manager) {
                return new RenderEglonaspis(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraAcadoaradoxides.class, new IRenderFactory<EntityPrehistoricFloraAcadoaradoxides>() {
            @Override
            public Render<? super EntityPrehistoricFloraAcadoaradoxides> createRenderFor(RenderManager manager) {
                return new RenderAcadoaradoxides(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraAlacaris.class, new IRenderFactory<EntityPrehistoricFloraAlacaris>() {
            @Override
            public Render<? super EntityPrehistoricFloraAlacaris> createRenderFor(RenderManager manager) {
                return new RenderAlacaris(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraSiberion.class, new IRenderFactory<EntityPrehistoricFloraSiberion>() {
            @Override
            public Render<? super EntityPrehistoricFloraSiberion> createRenderFor(RenderManager manager) {
                return new RenderSiberion(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraBanffia.class, new IRenderFactory<EntityPrehistoricFloraBanffia>() {
            @Override
            public Render<? super EntityPrehistoricFloraBanffia> createRenderFor(RenderManager manager) {
                return new RenderBanffia(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraYawunik.class, new IRenderFactory<EntityPrehistoricFloraYawunik>() {
            @Override
            public Render<? super EntityPrehistoricFloraYawunik> createRenderFor(RenderManager manager) {
                return new RenderYawunik(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraPomatrum.class, new IRenderFactory<EntityPrehistoricFloraPomatrum>() {
            @Override
            public Render<? super EntityPrehistoricFloraPomatrum> createRenderFor(RenderManager manager) {
                return new RenderPomatrum(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraOpabinia.class, new IRenderFactory<EntityPrehistoricFloraOpabinia>() {
            @Override
            public Render<? super EntityPrehistoricFloraOpabinia> createRenderFor(RenderManager manager) {
                return new RenderOpabinia(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraLyrarapax.class, new IRenderFactory<EntityPrehistoricFloraLyrarapax>() {
            @Override
            public Render<? super EntityPrehistoricFloraLyrarapax> createRenderFor(RenderManager manager) {
                return new RenderLyrarapax(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraTokummia.class, new IRenderFactory<EntityPrehistoricFloraTokummia>() {
            @Override
            public Render<? super EntityPrehistoricFloraTokummia> createRenderFor(RenderManager manager) {
                return new RenderTokummia(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraOdaraia.class, new IRenderFactory<EntityPrehistoricFloraOdaraia>() {
            @Override
            public Render<? super EntityPrehistoricFloraOdaraia> createRenderFor(RenderManager manager) {
                return new RenderOdaraia(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraAmplectobelua.class, new IRenderFactory<EntityPrehistoricFloraAmplectobelua>() {
            @Override
            public Render<? super EntityPrehistoricFloraAmplectobelua> createRenderFor(RenderManager manager) {
                return new RenderAmplectobelua(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraPaucipodia.class, new IRenderFactory<EntityPrehistoricFloraPaucipodia>() {
            @Override
            public Render<? super EntityPrehistoricFloraPaucipodia> createRenderFor(RenderManager manager) {
                return new RenderPaucipodia(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraAnomalocaris.class, new IRenderFactory<EntityPrehistoricFloraAnomalocaris>() {
            @Override
            public Render<? super EntityPrehistoricFloraAnomalocaris> createRenderFor(RenderManager manager) {
                return new RenderAnomalocaris(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraMegalocephalus.class, new IRenderFactory<EntityPrehistoricFloraMegalocephalus>() {
            @Override
            public Render<? super EntityPrehistoricFloraMegalocephalus> createRenderFor(RenderManager manager) {
                return new RenderMegalocephalus(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraLaminacaris.class, new IRenderFactory<EntityPrehistoricFloraLaminacaris>() {
            @Override
            public Render<? super EntityPrehistoricFloraLaminacaris> createRenderFor(RenderManager manager) {
                return new RenderLaminacaris(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraCambroraster.class, new IRenderFactory<EntityPrehistoricFloraCambroraster>() {
            @Override
            public Render<? super EntityPrehistoricFloraCambroraster> createRenderFor(RenderManager manager) {
                return new RenderCambroraster(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraCanadaspis.class, new IRenderFactory<EntityPrehistoricFloraCanadaspis>() {
            @Override
            public Render<? super EntityPrehistoricFloraCanadaspis> createRenderFor(RenderManager manager) {
                return new RenderCanadaspis(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraEllipsocephalus.class, new IRenderFactory<EntityPrehistoricFloraEllipsocephalus>() {
            @Override
            public Render<? super EntityPrehistoricFloraEllipsocephalus> createRenderFor(RenderManager manager) {
                return new RenderEllipsocephalus(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraElrathia.class, new IRenderFactory<EntityPrehistoricFloraElrathia>() {
            @Override
            public Render<? super EntityPrehistoricFloraElrathia> createRenderFor(RenderManager manager) {
                return new RenderElrathia(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraEoredlichia.class, new IRenderFactory<EntityPrehistoricFloraEoredlichia>() {
            @Override
            public Render<? super EntityPrehistoricFloraEoredlichia> createRenderFor(RenderManager manager) {
                return new RenderEoredlichia(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraJianshanopodia.class, new IRenderFactory<EntityPrehistoricFloraJianshanopodia>() {
            @Override
            public Render<? super EntityPrehistoricFloraJianshanopodia> createRenderFor(RenderManager manager) {
                return new RenderJianshanopodia(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraKodymirus.class, new IRenderFactory<EntityPrehistoricFloraKodymirus>() {
            @Override
            public Render<? super EntityPrehistoricFloraKodymirus> createRenderFor(RenderManager manager) {
                return new RenderKodymirus(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraKerygmachela.class, new IRenderFactory<EntityPrehistoricFloraKerygmachela>() {
            @Override
            public Render<? super EntityPrehistoricFloraKerygmachela> createRenderFor(RenderManager manager) {
                return new RenderKerygmachela(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraMarrella.class, new IRenderFactory<EntityPrehistoricFloraMarrella>() {
            @Override
            public Render<? super EntityPrehistoricFloraMarrella> createRenderFor(RenderManager manager) {
                return new RenderMarrella(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraNectocaris.class, new IRenderFactory<EntityPrehistoricFloraNectocaris>() {
            @Override
            public Render<? super EntityPrehistoricFloraNectocaris> createRenderFor(RenderManager manager) {
                return new RenderNectocaris(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraJellyfish_Palaeo1.class, new IRenderFactory<EntityPrehistoricFloraJellyfish_Palaeo1>() {
            @Override
            public Render<? super EntityPrehistoricFloraJellyfish_Palaeo1> createRenderFor(RenderManager manager) {
                return new RenderPalaeojelly1(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraJellyfish_Palaeo2.class, new IRenderFactory<EntityPrehistoricFloraJellyfish_Palaeo2>() {
            @Override
            public Render<? super EntityPrehistoricFloraJellyfish_Palaeo2> createRenderFor(RenderManager manager) {
                return new RenderPalaeojelly2(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraJellyfish_Palaeo3.class, new IRenderFactory<EntityPrehistoricFloraJellyfish_Palaeo3>() {
            @Override
            public Render<? super EntityPrehistoricFloraJellyfish_Palaeo3> createRenderFor(RenderManager manager) {
                return new RenderPalaeojelly3(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraJellyfish_Palaeo4.class, new IRenderFactory<EntityPrehistoricFloraJellyfish_Palaeo4>() {
            @Override
            public Render<? super EntityPrehistoricFloraJellyfish_Palaeo4> createRenderFor(RenderManager manager) {
                return new RenderPalaeojelly4(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraParadoxides.class, new IRenderFactory<EntityPrehistoricFloraParadoxides>() {
            @Override
            public Render<? super EntityPrehistoricFloraParadoxides> createRenderFor(RenderManager manager) {
                return new RenderParadoxides(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraYohoia.class, new IRenderFactory<EntityPrehistoricFloraYohoia>() {
            @Override
            public Render<? super EntityPrehistoricFloraYohoia> createRenderFor(RenderManager manager) {
                return new RenderYohoia(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraGemmactena.class, new IRenderFactory<EntityPrehistoricFloraGemmactena>() {
            @Override
            public Render<? super EntityPrehistoricFloraGemmactena> createRenderFor(RenderManager manager) {
                return new RenderGemmactena(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraBatofasciculus.class, new IRenderFactory<EntityPrehistoricFloraBatofasciculus>() {
            @Override
            public Render<? super EntityPrehistoricFloraBatofasciculus> createRenderFor(RenderManager manager) {
                return new RenderBatofasciculus(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraVestinautilus.class, new IRenderFactory<EntityPrehistoricFloraVestinautilus>() {
            @Override
            public Render<? super EntityPrehistoricFloraVestinautilus> createRenderFor(RenderManager manager) {
                return new RenderVestinautilus(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraParexus.class, new IRenderFactory<EntityPrehistoricFloraParexus>() {
            @Override
            public Render<? super EntityPrehistoricFloraParexus> createRenderFor(RenderManager manager) {
                return new RenderParexus(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraSynophalos.class, new IRenderFactory<EntityPrehistoricFloraSynophalos>() {
            @Override
            public Render<? super EntityPrehistoricFloraSynophalos> createRenderFor(RenderManager manager) {
                return new RenderSynophalos(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraPikaia.class, new IRenderFactory<EntityPrehistoricFloraPikaia>() {
            @Override
            public Render<? super EntityPrehistoricFloraPikaia> createRenderFor(RenderManager manager) {
                return new RenderPikaia(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraPalaeodictyopteraNymphPerm.class, new IRenderFactory<EntityPrehistoricFloraPalaeodictyopteraNymphPerm>() {
            @Override
            public Render<? super EntityPrehistoricFloraPalaeodictyopteraNymphPerm> createRenderFor(RenderManager manager) {
                return new RenderPalaeodictyopteraNymphPerm(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraHylonomus.class, new IRenderFactory<EntityPrehistoricFloraHylonomus>() {
            @Override
            public Render<? super EntityPrehistoricFloraHylonomus> createRenderFor(RenderManager manager) {
                return new RenderHylonomus(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraSpathicephalus.class, new IRenderFactory<EntityPrehistoricFloraSpathicephalus>() {
            @Override
            public Render<? super EntityPrehistoricFloraSpathicephalus> createRenderFor(RenderManager manager) {
                return new RenderSpathicephalus(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraYunnanozoon.class, new IRenderFactory<EntityPrehistoricFloraYunnanozoon>() {
            @Override
            public Render<? super EntityPrehistoricFloraYunnanozoon> createRenderFor(RenderManager manager) {
                return new RenderYunnanozoon(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraHallucigenia.class, new IRenderFactory<EntityPrehistoricFloraHallucigenia>() {
            @Override
            public Render<? super EntityPrehistoricFloraHallucigenia> createRenderFor(RenderManager manager) {
                return new RenderHallucigenia(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraMicrodictyon.class, new IRenderFactory<EntityPrehistoricFloraMicrodictyon>() {
            @Override
            public Render<? super EntityPrehistoricFloraMicrodictyon> createRenderFor(RenderManager manager) {
                return new RenderMicrodictyon(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraDeiroceras.class, new IRenderFactory<EntityPrehistoricFloraDeiroceras>() {
            @Override
            public Render<? super EntityPrehistoricFloraDeiroceras> createRenderFor(RenderManager manager) {
                return new RenderDeiroceras(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraGonioceras.class, new IRenderFactory<EntityPrehistoricFloraGonioceras>() {
            @Override
            public Render<? super EntityPrehistoricFloraGonioceras> createRenderFor(RenderManager manager) {
                return new RenderGonioceras(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraDiania.class, new IRenderFactory<EntityPrehistoricFloraDiania>() {
            @Override
            public Render<? super EntityPrehistoricFloraDiania> createRenderFor(RenderManager manager) {
                return new RenderDiania(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraMetaspriggina.class, new IRenderFactory<EntityPrehistoricFloraMetaspriggina>() {
            @Override
            public Render<? super EntityPrehistoricFloraMetaspriggina> createRenderFor(RenderManager manager) {
                return new RenderMetaspriggina(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraTegopelte.class, new IRenderFactory<EntityPrehistoricFloraTegopelte>() {
            @Override
            public Render<? super EntityPrehistoricFloraTegopelte> createRenderFor(RenderManager manager) {
                return new RenderTegopelte(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraWiwaxia.class, new IRenderFactory<EntityPrehistoricFloraWiwaxia>() {
            @Override
            public Render<? super EntityPrehistoricFloraWiwaxia> createRenderFor(RenderManager manager) {
                return new RenderWiwaxia(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraOdontogriphus.class, new IRenderFactory<EntityPrehistoricFloraOdontogriphus>() {
            @Override
            public Render<? super EntityPrehistoricFloraOdontogriphus> createRenderFor(RenderManager manager) {
                return new RenderOdontogriphus(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraXenusion.class, new IRenderFactory<EntityPrehistoricFloraXenusion>() {
            @Override
            public Render<? super EntityPrehistoricFloraXenusion> createRenderFor(RenderManager manager) {
                return new RenderXenusion(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraMimetaster.class, new IRenderFactory<EntityPrehistoricFloraMimetaster>() {
            @Override
            public Render<? super EntityPrehistoricFloraMimetaster> createRenderFor(RenderManager manager) {
                return new RenderMimetaster(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraOmnidens.class, new IRenderFactory<EntityPrehistoricFloraOmnidens>() {
            @Override
            public Render<? super EntityPrehistoricFloraOmnidens> createRenderFor(RenderManager manager) {
                return new RenderOmnidens(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraBasiloceras.class, new IRenderFactory<EntityPrehistoricFloraBasiloceras>() {
            @Override
            public Render<? super EntityPrehistoricFloraBasiloceras> createRenderFor(RenderManager manager) {
                return new RenderBasiloceras(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraWebsteroprion.class, new IRenderFactory<EntityPrehistoricFloraWebsteroprion>() {
            @Override
            public Render<? super EntityPrehistoricFloraWebsteroprion> createRenderFor(RenderManager manager) {
                return new RenderWebsteroprion(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraWebsteroprionHole.class, new IRenderFactory<EntityPrehistoricFloraWebsteroprionHole>() {
            @Override
            public Render<? super EntityPrehistoricFloraWebsteroprionHole> createRenderFor(RenderManager manager) {
                return new RenderWebsteroprionHole(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraCheloniellon.class, new IRenderFactory<EntityPrehistoricFloraCheloniellon>() {
            @Override
            public Render<? super EntityPrehistoricFloraCheloniellon> createRenderFor(RenderManager manager) {
                return new RenderCheloniellon(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraScorpion_Gigantoscorpio.class, new IRenderFactory<EntityPrehistoricFloraScorpion_Gigantoscorpio>() {
            @Override
            public Render<? super EntityPrehistoricFloraScorpion_Gigantoscorpio> createRenderFor(RenderManager manager) {
                return new RenderScorpion_Gigantoscorpio(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraScorpion_Opsieobuthus.class, new IRenderFactory<EntityPrehistoricFloraScorpion_Opsieobuthus>() {
            @Override
            public Render<? super EntityPrehistoricFloraScorpion_Opsieobuthus> createRenderFor(RenderManager manager) {
                return new RenderScorpion_Opsieobuthus(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraScorpion_Pulmonoscorpius.class, new IRenderFactory<EntityPrehistoricFloraScorpion_Pulmonoscorpius>() {
            @Override
            public Render<? super EntityPrehistoricFloraScorpion_Pulmonoscorpius> createRenderFor(RenderManager manager) {
                return new RenderScorpion_Pulmonoscorpius(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraScorpion_Gondwanascorpio.class, new IRenderFactory<EntityPrehistoricFloraScorpion_Gondwanascorpio>() {
            @Override
            public Render<? super EntityPrehistoricFloraScorpion_Gondwanascorpio> createRenderFor(RenderManager manager) {
                return new RenderScorpion_Gondwanascorpio(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraOttoia.class, new IRenderFactory<EntityPrehistoricFloraOttoia>() {
            @Override
            public Render<? super EntityPrehistoricFloraOttoia> createRenderFor(RenderManager manager) {
                return new RenderOttoia(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraHeterosteus.class, new IRenderFactory<EntityPrehistoricFloraHeterosteus>() {
            @Override
            public Render<? super EntityPrehistoricFloraHeterosteus> createRenderFor(RenderManager manager) {
                return new RenderHeterosteus(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraMoschops.class, new IRenderFactory<EntityPrehistoricFloraMoschops>() {
            @Override
            public Render<? super EntityPrehistoricFloraMoschops> createRenderFor(RenderManager manager) {
                return new RenderMoschops(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraEryops.class, new IRenderFactory<EntityPrehistoricFloraEryops>() {
            @Override
            public Render<? super EntityPrehistoricFloraEryops> createRenderFor(RenderManager manager) {
                return new RenderEryops(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraCotylorhynchus.class, new IRenderFactory<EntityPrehistoricFloraCotylorhynchus>() {
            @Override
            public Render<? super EntityPrehistoricFloraCotylorhynchus> createRenderFor(RenderManager manager) {
                return new RenderCotylorhynchus(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraOphiacodon.class, new IRenderFactory<EntityPrehistoricFloraOphiacodon>() {
            @Override
            public Render<? super EntityPrehistoricFloraOphiacodon> createRenderFor(RenderManager manager) {
                return new RenderOphiacodon(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraAcrolepis.class, new IRenderFactory<EntityPrehistoricFloraAcrolepis>() {
            @Override
            public Render<? super EntityPrehistoricFloraAcrolepis> createRenderFor(RenderManager manager) {
                return new RenderAcrolepis(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraCoelacanthus.class, new IRenderFactory<EntityPrehistoricFloraCoelacanthus>() {
            @Override
            public Render<? super EntityPrehistoricFloraCoelacanthus> createRenderFor(RenderManager manager) {
                return new RenderCoelacanthus(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraHelicoprion.class, new IRenderFactory<EntityPrehistoricFloraHelicoprion>() {
            @Override
            public Render<? super EntityPrehistoricFloraHelicoprion> createRenderFor(RenderManager manager) {
                return new RenderHelicoprion(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraPederpes.class, new IRenderFactory<EntityPrehistoricFloraPederpes>() {
            @Override
            public Render<? super EntityPrehistoricFloraPederpes> createRenderFor(RenderManager manager) {
                return new RenderPederpes(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraDimetrodon.class, new IRenderFactory<EntityPrehistoricFloraDimetrodon>() {
            @Override
            public Render<? super EntityPrehistoricFloraDimetrodon> createRenderFor(RenderManager manager) {
                return new RenderDimetrodon(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraGorgonops.class, new IRenderFactory<EntityPrehistoricFloraGorgonops>() {
            @Override
            public Render<? super EntityPrehistoricFloraGorgonops> createRenderFor(RenderManager manager) {
                return new RenderGorgonops(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraInostrancevia.class, new IRenderFactory<EntityPrehistoricFloraInostrancevia>() {
            @Override
            public Render<? super EntityPrehistoricFloraInostrancevia> createRenderFor(RenderManager manager) {
                return new RenderInostrancevia(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraDunkleosteus.class, new IRenderFactory<EntityPrehistoricFloraDunkleosteus>() {
            @Override
            public Render<? super EntityPrehistoricFloraDunkleosteus> createRenderFor(RenderManager manager) {
                return new RenderDunkleosteus(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraAcanthostega.class, new IRenderFactory<EntityPrehistoricFloraAcanthostega>() {
            @Override
            public Render<? super EntityPrehistoricFloraAcanthostega> createRenderFor(RenderManager manager) {
                return new RenderAcanthostega(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraSphenacodon.class, new IRenderFactory<EntityPrehistoricFloraSphenacodon>() {
            @Override
            public Render<? super EntityPrehistoricFloraSphenacodon> createRenderFor(RenderManager manager) {
                return new RenderSphenacodon(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraPlatyhystrix.class, new IRenderFactory<EntityPrehistoricFloraPlatyhystrix>() {
            @Override
            public Render<? super EntityPrehistoricFloraPlatyhystrix> createRenderFor(RenderManager manager) {
                return new RenderPlatyhystrix(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraScutosaurus.class, new IRenderFactory<EntityPrehistoricFloraScutosaurus>() {
            @Override
            public Render<? super EntityPrehistoricFloraScutosaurus> createRenderFor(RenderManager manager) {
                return new RenderScutosaurus(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraVivaxosaurus.class, new IRenderFactory<EntityPrehistoricFloraVivaxosaurus>() {
            @Override
            public Render<? super EntityPrehistoricFloraVivaxosaurus> createRenderFor(RenderManager manager) {
                return new RenderVivaxosaurus(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraEstemmenosuchus.class, new IRenderFactory<EntityPrehistoricFloraEstemmenosuchus>() {
            @Override
            public Render<? super EntityPrehistoricFloraEstemmenosuchus> createRenderFor(RenderManager manager) {
                return new RenderEstemmenosuchus(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraTraquairius.class, new IRenderFactory<EntityPrehistoricFloraTraquairius>() {
            @Override
            public Render<? super EntityPrehistoricFloraTraquairius> createRenderFor(RenderManager manager) {
                return new RenderTraquairius(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraDiictodon.class, new IRenderFactory<EntityPrehistoricFloraDiictodon>() {
            @Override
            public Render<? super EntityPrehistoricFloraDiictodon> createRenderFor(RenderManager manager) {
                return new RenderDiictodon(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraEosimops.class, new IRenderFactory<EntityPrehistoricFloraEosimops>() {
            @Override
            public Render<? super EntityPrehistoricFloraEosimops> createRenderFor(RenderManager manager) {
                return new RenderEosimops(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraProsictodon.class, new IRenderFactory<EntityPrehistoricFloraProsictodon>() {
            @Override
            public Render<? super EntityPrehistoricFloraProsictodon> createRenderFor(RenderManager manager) {
                return new RenderProsictodon(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraRobertia.class, new IRenderFactory<EntityPrehistoricFloraRobertia>() {
            @Override
            public Render<? super EntityPrehistoricFloraRobertia> createRenderFor(RenderManager manager) {
                return new RenderRobertia(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraArchoblattinaInsect.class, new IRenderFactory<EntityPrehistoricFloraArchoblattinaInsect>() {
            @Override
            public Render<? super EntityPrehistoricFloraArchoblattinaInsect> createRenderFor(RenderManager manager) {
                return new RenderArchoblattina(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraBushizheia.class, new IRenderFactory<EntityPrehistoricFloraBushizheia>() {
            @Override
            public Render<? super EntityPrehistoricFloraBushizheia> createRenderFor(RenderManager manager) {
                return new RenderBushizheia(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraPhantaspis.class, new IRenderFactory<EntityPrehistoricFloraPhantaspis>() {
            @Override
            public Render<? super EntityPrehistoricFloraPhantaspis> createRenderFor(RenderManager manager) {
                return new RenderPhantaspis(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraSidneyia.class, new IRenderFactory<EntityPrehistoricFloraSidneyia>() {
            @Override
            public Render<? super EntityPrehistoricFloraSidneyia> createRenderFor(RenderManager manager) {
                return new RenderSidneyia(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraPharyngolepis.class, new IRenderFactory<EntityPrehistoricFloraPharyngolepis>() {
            @Override
            public Render<? super EntityPrehistoricFloraPharyngolepis> createRenderFor(RenderManager manager) {
                return new RenderPharyngolepis(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraPlatycaraspis.class, new IRenderFactory<EntityPrehistoricFloraPlatycaraspis>() {
            @Override
            public Render<? super EntityPrehistoricFloraPlatycaraspis> createRenderFor(RenderManager manager) {
                return new RenderPlatycaraspis(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraCrotalocephalus.class, new IRenderFactory<EntityPrehistoricFloraCrotalocephalus>() {
            @Override
            public Render<? super EntityPrehistoricFloraCrotalocephalus> createRenderFor(RenderManager manager) {
                return new RenderCrotalocephalus(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraDalmanites.class, new IRenderFactory<EntityPrehistoricFloraDalmanites>() {
            @Override
            public Render<? super EntityPrehistoricFloraDalmanites> createRenderFor(RenderManager manager) {
                return new RenderDalmanites(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraDrepanaspis.class, new IRenderFactory<EntityPrehistoricFloraDrepanaspis>() {
            @Override
            public Render<? super EntityPrehistoricFloraDrepanaspis> createRenderFor(RenderManager manager) {
                return new RenderDrepanaspis(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraEusthenopteron.class, new IRenderFactory<EntityPrehistoricFloraEusthenopteron>() {
            @Override
            public Render<? super EntityPrehistoricFloraEusthenopteron> createRenderFor(RenderManager manager) {
                return new RenderEusthenopteron(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraLunaspis.class, new IRenderFactory<EntityPrehistoricFloraLunaspis>() {
            @Override
            public Render<? super EntityPrehistoricFloraLunaspis> createRenderFor(RenderManager manager) {
                return new RenderLunaspis(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraLungmenshanaspis.class, new IRenderFactory<EntityPrehistoricFloraLungmenshanaspis>() {
            @Override
            public Render<? super EntityPrehistoricFloraLungmenshanaspis> createRenderFor(RenderManager manager) {
                return new RenderLungmenshanaspis(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraPanderichthys.class, new IRenderFactory<EntityPrehistoricFloraPanderichthys>() {
            @Override
            public Render<? super EntityPrehistoricFloraPanderichthys> createRenderFor(RenderManager manager) {
                return new RenderPanderichthys(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraPlatylomaspis.class, new IRenderFactory<EntityPrehistoricFloraPlatylomaspis>() {
            @Override
            public Render<? super EntityPrehistoricFloraPlatylomaspis> createRenderFor(RenderManager manager) {
                return new RenderPlatylomaspis(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraArchoblattinaNymph.class, new IRenderFactory<EntityPrehistoricFloraArchoblattinaNymph>() {
            @Override
            public Render<? super EntityPrehistoricFloraArchoblattinaNymph> createRenderFor(RenderManager manager) {
                return new RenderArchoblattinaNymph(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraRoachoidAridInsect.class, new IRenderFactory<EntityPrehistoricFloraRoachoidAridInsect>() {
            @Override
            public Render<? super EntityPrehistoricFloraRoachoidAridInsect> createRenderFor(RenderManager manager) {
                return new RenderRoachoidArid(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraGerarusInsect.class, new IRenderFactory<EntityPrehistoricFloraGerarusInsect>() {
            @Override
            public Render<? super EntityPrehistoricFloraGerarusInsect> createRenderFor(RenderManager manager) {
                return new RenderGerarus(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraRoachoidForestInsect.class, new IRenderFactory<EntityPrehistoricFloraRoachoidForestInsect>() {
            @Override
            public Render<? super EntityPrehistoricFloraRoachoidForestInsect> createRenderFor(RenderManager manager) {
                return new RenderRoachoidForest(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraRoachoidSwampInsect.class, new IRenderFactory<EntityPrehistoricFloraRoachoidSwampInsect>() {
            @Override
            public Render<? super EntityPrehistoricFloraRoachoidSwampInsect> createRenderFor(RenderManager manager) {
                return new RenderRoachoidSwamp(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraMeganeuropsis.class, new IRenderFactory<EntityPrehistoricFloraMeganeuropsis>() {
            @Override
            public Render<? super EntityPrehistoricFloraMeganeuropsis> createRenderFor(RenderManager manager) {
                return new RenderMeganeuropsis(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraMeganeuropsisNymph.class, new IRenderFactory<EntityPrehistoricFloraMeganeuropsisNymph>() {
            @Override
            public Render<? super EntityPrehistoricFloraMeganeuropsisNymph> createRenderFor(RenderManager manager) {
                return new RenderMeganeuropsisNymph(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraBandringa.class, new IRenderFactory<EntityPrehistoricFloraBandringa>() {
            @Override
            public Render<? super EntityPrehistoricFloraBandringa> createRenderFor(RenderManager manager) {
                return new RenderBandringa(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraGyracanthides.class, new IRenderFactory<EntityPrehistoricFloraGyracanthides>() {
            @Override
            public Render<? super EntityPrehistoricFloraGyracanthides> createRenderFor(RenderManager manager) {
                return new RenderGyracanthides(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraJanassa.class, new IRenderFactory<EntityPrehistoricFloraJanassa>() {
            @Override
            public Render<? super EntityPrehistoricFloraJanassa> createRenderFor(RenderManager manager) {
                return new RenderJanassa(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraPhanerotinus.class, new IRenderFactory<EntityPrehistoricFloraPhanerotinus>() {
            @Override
            public Render<? super EntityPrehistoricFloraPhanerotinus> createRenderFor(RenderManager manager) {
                return new RenderPhanerotinus(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraProterogyrinus.class, new IRenderFactory<EntityPrehistoricFloraProterogyrinus>() {
            @Override
            public Render<? super EntityPrehistoricFloraProterogyrinus> createRenderFor(RenderManager manager) {
                return new RenderProterogyrinus(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraListracanthus.class, new IRenderFactory<EntityPrehistoricFloraListracanthus>() {
            @Override
            public Render<? super EntityPrehistoricFloraListracanthus> createRenderFor(RenderManager manager) {
                return new RenderListracanthus(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraPrionosuchus.class, new IRenderFactory<EntityPrehistoricFloraPrionosuchus>() {
            @Override
            public Render<? super EntityPrehistoricFloraPrionosuchus> createRenderFor(RenderManager manager) {
                return new RenderPrionosuchus(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraMooreoceras.class, new IRenderFactory<EntityPrehistoricFloraMooreoceras>() {
            @Override
            public Render<? super EntityPrehistoricFloraMooreoceras> createRenderFor(RenderManager manager) {
                return new RenderMooreoceras(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraRayonnoceras.class, new IRenderFactory<EntityPrehistoricFloraRayonnoceras>() {
            @Override
            public Render<? super EntityPrehistoricFloraRayonnoceras> createRenderFor(RenderManager manager) {
                return new RenderRayonnoceras(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraRemigiomontanus.class, new IRenderFactory<EntityPrehistoricFloraRemigiomontanus>() {
            @Override
            public Render<? super EntityPrehistoricFloraRemigiomontanus> createRenderFor(RenderManager manager) {
                return new RenderRemigiomontanus(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraEdestus.class, new IRenderFactory<EntityPrehistoricFloraEdestus>() {
            @Override
            public Render<? super EntityPrehistoricFloraEdestus> createRenderFor(RenderManager manager) {
                return new RenderEdestus(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraPholiderpeton.class, new IRenderFactory<EntityPrehistoricFloraPholiderpeton>() {
            @Override
            public Render<? super EntityPrehistoricFloraPholiderpeton> createRenderFor(RenderManager manager) {
                return new RenderPholiderpeton(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraMesosaurus.class, new IRenderFactory<EntityPrehistoricFloraMesosaurus>() {
            @Override
            public Render<? super EntityPrehistoricFloraMesosaurus> createRenderFor(RenderManager manager) {
                return new RenderMesosaurus(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraIniopteryx.class, new IRenderFactory<EntityPrehistoricFloraIniopteryx>() {
            @Override
            public Render<? super EntityPrehistoricFloraIniopteryx> createRenderFor(RenderManager manager) {
                return new RenderIniopteryx(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraMenaspis.class, new IRenderFactory<EntityPrehistoricFloraMenaspis>() {
            @Override
            public Render<? super EntityPrehistoricFloraMenaspis> createRenderFor(RenderManager manager) {
                return new RenderMenaspis(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraGnathorhiza.class, new IRenderFactory<EntityPrehistoricFloraGnathorhiza>() {
            @Override
            public Render<? super EntityPrehistoricFloraGnathorhiza> createRenderFor(RenderManager manager) {
                return new RenderGnathorhiza(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraClaudiosaurus.class, new IRenderFactory<EntityPrehistoricFloraClaudiosaurus>() {
            @Override
            public Render<? super EntityPrehistoricFloraClaudiosaurus> createRenderFor(RenderManager manager) {
                return new RenderClaudiosaurus(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraAcanthostomatops.class, new IRenderFactory<EntityPrehistoricFloraAcanthostomatops>() {
            @Override
            public Render<? super EntityPrehistoricFloraAcanthostomatops> createRenderFor(RenderManager manager) {
                return new RenderAcanthostomatops(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraDiadectes.class, new IRenderFactory<EntityPrehistoricFloraDiadectes>() {
            @Override
            public Render<? super EntityPrehistoricFloraDiadectes> createRenderFor(RenderManager manager) {
                return new RenderDiadectes(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraLabidosaurus.class, new IRenderFactory<EntityPrehistoricFloraLabidosaurus>() {
            @Override
            public Render<? super EntityPrehistoricFloraLabidosaurus> createRenderFor(RenderManager manager) {
                return new RenderLabidosaurus(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraDvinia.class, new IRenderFactory<EntityPrehistoricFloraDvinia>() {
            @Override
            public Render<? super EntityPrehistoricFloraDvinia> createRenderFor(RenderManager manager) {
                return new RenderDvinia(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraProcynosuchus.class, new IRenderFactory<EntityPrehistoricFloraProcynosuchus>() {
            @Override
            public Render<? super EntityPrehistoricFloraProcynosuchus> createRenderFor(RenderManager manager) {
                return new RenderProcynosuchus(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraKaibabvenator.class, new IRenderFactory<EntityPrehistoricFloraKaibabvenator>() {
            @Override
            public Render<? super EntityPrehistoricFloraKaibabvenator> createRenderFor(RenderManager manager) {
                return new RenderKaibabvenator(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraSaivodus.class, new IRenderFactory<EntityPrehistoricFloraSaivodus>() {
            @Override
            public Render<? super EntityPrehistoricFloraSaivodus> createRenderFor(RenderManager manager) {
                return new RenderSaivodus(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraTapinocephalus.class, new IRenderFactory<EntityPrehistoricFloraTapinocephalus>() {
            @Override
            public Render<? super EntityPrehistoricFloraTapinocephalus> createRenderFor(RenderManager manager) {
                return new RenderTapinocephalus(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraAnteosaurus.class, new IRenderFactory<EntityPrehistoricFloraAnteosaurus>() {
            @Override
            public Render<? super EntityPrehistoricFloraAnteosaurus> createRenderFor(RenderManager manager) {
                return new RenderAnteosaurus(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraAlbertonia.class, new IRenderFactory<EntityPrehistoricFloraAlbertonia>() {
            @Override
            public Render<? super EntityPrehistoricFloraAlbertonia> createRenderFor(RenderManager manager) {
                return new RenderAlbertonia(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraCoelophysis.class, new IRenderFactory<EntityPrehistoricFloraCoelophysis>() {
            @Override
            public Render<? super EntityPrehistoricFloraCoelophysis> createRenderFor(RenderManager manager) {
                return new RenderCoelophysis(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraEbenaqua.class, new IRenderFactory<EntityPrehistoricFloraEbenaqua>() {
            @Override
            public Render<? super EntityPrehistoricFloraEbenaqua> createRenderFor(RenderManager manager) {
                return new RenderEbenaqua(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraCooperoceras.class, new IRenderFactory<EntityPrehistoricFloraCooperoceras>() {
            @Override
            public Render<? super EntityPrehistoricFloraCooperoceras> createRenderFor(RenderManager manager) {
                return new RenderCooperoceras(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraDorypterus.class, new IRenderFactory<EntityPrehistoricFloraDorypterus>() {
            @Override
            public Render<? super EntityPrehistoricFloraDorypterus> createRenderFor(RenderManager manager) {
                return new RenderDorypterus(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraLystrosaurus.class, new IRenderFactory<EntityPrehistoricFloraLystrosaurus>() {
            @Override
            public Render<? super EntityPrehistoricFloraLystrosaurus> createRenderFor(RenderManager manager) {
                return new RenderLystrosaurus(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraLisowicia.class, new IRenderFactory<EntityPrehistoricFloraLisowicia>() {
            @Override
            public Render<? super EntityPrehistoricFloraLisowicia> createRenderFor(RenderManager manager) {
                return new RenderLisowicia(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraAntineosteus.class, new IRenderFactory<EntityPrehistoricFloraAntineosteus>() {
            @Override
            public Render<? super EntityPrehistoricFloraAntineosteus> createRenderFor(RenderManager manager) {
                return new RenderAntineosteus(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraSuminia.class, new IRenderFactory<EntityPrehistoricFloraSuminia>() {
            @Override
            public Render<? super EntityPrehistoricFloraSuminia> createRenderFor(RenderManager manager) {
                return new RenderSuminia(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraPhlegethontia.class, new IRenderFactory<EntityPrehistoricFloraPhlegethontia>() {
            @Override
            public Render<? super EntityPrehistoricFloraPhlegethontia> createRenderFor(RenderManager manager) {
                return new RenderPhlegethontia(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraSemionotus.class, new IRenderFactory<EntityPrehistoricFloraSemionotus>() {
            @Override
            public Render<? super EntityPrehistoricFloraSemionotus> createRenderFor(RenderManager manager) {
                return new RenderSemionotus(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraHaikouichthys.class, new IRenderFactory<EntityPrehistoricFloraHaikouichthys>() {
            @Override
            public Render<? super EntityPrehistoricFloraHaikouichthys> createRenderFor(RenderManager manager) {
                return new RenderHaikouichthys(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraGroenlandaspis.class, new IRenderFactory<EntityPrehistoricFloraGroenlandaspis>() {
            @Override
            public Render<? super EntityPrehistoricFloraGroenlandaspis> createRenderFor(RenderManager manager) {
                return new RenderGroenlandaspis(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraRebellatrix.class, new IRenderFactory<EntityPrehistoricFloraRebellatrix>() {
            @Override
            public Render<? super EntityPrehistoricFloraRebellatrix> createRenderFor(RenderManager manager) {
                return new RenderRebellatrix(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraLiliensternus.class, new IRenderFactory<EntityPrehistoricFloraLiliensternus>() {
            @Override
            public Render<? super EntityPrehistoricFloraLiliensternus> createRenderFor(RenderManager manager) {
                return new RenderLiliensternus(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraEoraptor.class, new IRenderFactory<EntityPrehistoricFloraEoraptor>() {
            @Override
            public Render<? super EntityPrehistoricFloraEoraptor> createRenderFor(RenderManager manager) {
                return new RenderEoraptor(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraCoelurosauravus.class, new IRenderFactory<EntityPrehistoricFloraCoelurosauravus>() {
            @Override
            public Render<? super EntityPrehistoricFloraCoelurosauravus> createRenderFor(RenderManager manager) {
                return new RenderCoelurosauravus(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraGlaurung.class, new IRenderFactory<EntityPrehistoricFloraGlaurung>() {
            @Override
            public Render<? super EntityPrehistoricFloraGlaurung> createRenderFor(RenderManager manager) {
                return new RenderGlaurung(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraRautiania.class, new IRenderFactory<EntityPrehistoricFloraRautiania>() {
            @Override
            public Render<? super EntityPrehistoricFloraRautiania> createRenderFor(RenderManager manager) {
                return new RenderRautiania(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraWeigeltisaurus.class, new IRenderFactory<EntityPrehistoricFloraWeigeltisaurus>() {
            @Override
            public Render<? super EntityPrehistoricFloraWeigeltisaurus> createRenderFor(RenderManager manager) {
                return new RenderWeigeltisaurus(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraHerrerasaurus.class, new IRenderFactory<EntityPrehistoricFloraHerrerasaurus>() {
            @Override
            public Render<? super EntityPrehistoricFloraHerrerasaurus> createRenderFor(RenderManager manager) {
                return new RenderHerrerasaurus(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraShringasaurus.class, new IRenderFactory<EntityPrehistoricFloraShringasaurus>() {
            @Override
            public Render<? super EntityPrehistoricFloraShringasaurus> createRenderFor(RenderManager manager) {
                return new RenderShringasaurus(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraAntarcticarcinus.class, new IRenderFactory<EntityPrehistoricFloraAntarcticarcinus>() {
            @Override
            public Render<? super EntityPrehistoricFloraAntarcticarcinus> createRenderFor(RenderManager manager) {
                return new RenderAntarcticarcinus(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraCtenospondylus.class, new IRenderFactory<EntityPrehistoricFloraCtenospondylus>() {
            @Override
            public Render<? super EntityPrehistoricFloraCtenospondylus> createRenderFor(RenderManager manager) {
                return new RenderCtenospondylus(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraSauroctonus.class, new IRenderFactory<EntityPrehistoricFloraSauroctonus>() {
            @Override
            public Render<? super EntityPrehistoricFloraSauroctonus> createRenderFor(RenderManager manager) {
                return new RenderSauroctonus(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraArchosaurus.class, new IRenderFactory<EntityPrehistoricFloraArchosaurus>() {
            @Override
            public Render<? super EntityPrehistoricFloraArchosaurus> createRenderFor(RenderManager manager) {
                return new RenderArchosaurus(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraBranchiosaur.class, new IRenderFactory<EntityPrehistoricFloraBranchiosaur>() {
            @Override
            public Render<? super EntityPrehistoricFloraBranchiosaur> createRenderFor(RenderManager manager) {
                return new RenderBranchiosaur(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraDaedalichthys.class, new IRenderFactory<EntityPrehistoricFloraDaedalichthys>() {
            @Override
            public Render<? super EntityPrehistoricFloraDaedalichthys> createRenderFor(RenderManager manager) {
                return new RenderDaedalichthys(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraPlateosaurus.class, new IRenderFactory<EntityPrehistoricFloraPlateosaurus>() {
            @Override
            public Render<? super EntityPrehistoricFloraPlateosaurus> createRenderFor(RenderManager manager) {
                return new RenderPlateosaurus(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraCanadia.class, new IRenderFactory<EntityPrehistoricFloraCanadia>() {
            @Override
            public Render<? super EntityPrehistoricFloraCanadia> createRenderFor(RenderManager manager) {
                return new RenderCanadia(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraBirkenia.class, new IRenderFactory<EntityPrehistoricFloraBirkenia>() {
            @Override
            public Render<? super EntityPrehistoricFloraBirkenia> createRenderFor(RenderManager manager) {
                return new RenderBirkenia(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraBrochoadmones.class, new IRenderFactory<EntityPrehistoricFloraBrochoadmones>() {
            @Override
            public Render<? super EntityPrehistoricFloraBrochoadmones> createRenderFor(RenderManager manager) {
                return new RenderBrochoadmones(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraDoryaspis.class, new IRenderFactory<EntityPrehistoricFloraDoryaspis>() {
            @Override
            public Render<? super EntityPrehistoricFloraDoryaspis> createRenderFor(RenderManager manager) {
                return new RenderDoryaspis(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraCarolowilhelmina.class, new IRenderFactory<EntityPrehistoricFloraCarolowilhelmina>() {
            @Override
            public Render<? super EntityPrehistoricFloraCarolowilhelmina> createRenderFor(RenderManager manager) {
                return new RenderCarolowilhelmina(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraUrosthenes.class, new IRenderFactory<EntityPrehistoricFloraUrosthenes>() {
            @Override
            public Render<? super EntityPrehistoricFloraUrosthenes> createRenderFor(RenderManager manager) {
                return new RenderUrosthenes(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraFeroxichthys.class, new IRenderFactory<EntityPrehistoricFloraFeroxichthys>() {
            @Override
            public Render<? super EntityPrehistoricFloraFeroxichthys> createRenderFor(RenderManager manager) {
                return new RenderFeroxichthys(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraShonisaurus.class, new IRenderFactory<EntityPrehistoricFloraShonisaurus>() {
            @Override
            public Render<? super EntityPrehistoricFloraShonisaurus> createRenderFor(RenderManager manager) {
                return new RenderShonisaurus(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraCrassigyrinus.class, new IRenderFactory<EntityPrehistoricFloraCrassigyrinus>() {
            @Override
            public Render<? super EntityPrehistoricFloraCrassigyrinus> createRenderFor(RenderManager manager) {
                return new RenderCrassigyrinus(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraMastodonsaurus.class, new IRenderFactory<EntityPrehistoricFloraMastodonsaurus>() {
            @Override
            public Render<? super EntityPrehistoricFloraMastodonsaurus> createRenderFor(RenderManager manager) {
                return new RenderMastodonsaurus(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraMegalograptus.class, new IRenderFactory<EntityPrehistoricFloraMegalograptus>() {
            @Override
            public Render<? super EntityPrehistoricFloraMegalograptus> createRenderFor(RenderManager manager) {
                return new RenderMegalograptus(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraSaurichthysFreshwater.class, new IRenderFactory<EntityPrehistoricFloraSaurichthysFreshwater>() {
            @Override
            public Render<? super EntityPrehistoricFloraSaurichthysFreshwater> createRenderFor(RenderManager manager) {
                return new RenderSaurichthysFreshwater(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraSaurichthysMarine.class, new IRenderFactory<EntityPrehistoricFloraSaurichthysMarine>() {
            @Override
            public Render<? super EntityPrehistoricFloraSaurichthysMarine> createRenderFor(RenderManager manager) {
                return new RenderSaurichthysMarine(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraEosaurichthys.class, new IRenderFactory<EntityPrehistoricFloraEosaurichthys>() {
            @Override
            public Render<? super EntityPrehistoricFloraEosaurichthys> createRenderFor(RenderManager manager) {
                return new RenderEosaurichthys(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraHelmetia.class, new IRenderFactory<EntityPrehistoricFloraHelmetia>() {
            @Override
            public Render<? super EntityPrehistoricFloraHelmetia> createRenderFor(RenderManager manager) {
                return new RenderHelmetia(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraProfallotaspis.class, new IRenderFactory<EntityPrehistoricFloraProfallotaspis>() {
            @Override
            public Render<? super EntityPrehistoricFloraProfallotaspis> createRenderFor(RenderManager manager) {
                return new RenderProfallotaspis(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraRetifacies.class, new IRenderFactory<EntityPrehistoricFloraRetifacies>() {
            @Override
            public Render<? super EntityPrehistoricFloraRetifacies> createRenderFor(RenderManager manager) {
                return new RenderRetifacies(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraOrthrozanclus.class, new IRenderFactory<EntityPrehistoricFloraOrthrozanclus>() {
            @Override
            public Render<? super EntityPrehistoricFloraOrthrozanclus> createRenderFor(RenderManager manager) {
                return new RenderOrthrozanclus(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraHungioides.class, new IRenderFactory<EntityPrehistoricFloraHungioides>() {
            @Override
            public Render<? super EntityPrehistoricFloraHungioides> createRenderFor(RenderManager manager) {
                return new RenderHungioides(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraCothurnocystis.class, new IRenderFactory<EntityPrehistoricFloraCothurnocystis>() {
            @Override
            public Render<? super EntityPrehistoricFloraCothurnocystis> createRenderFor(RenderManager manager) {
                return new RenderCothurnocystis(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraEnoploura.class, new IRenderFactory<EntityPrehistoricFloraEnoploura>() {
            @Override
            public Render<? super EntityPrehistoricFloraEnoploura> createRenderFor(RenderManager manager) {
                return new RenderEnoploura(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraAdelophthalmus.class, new IRenderFactory<EntityPrehistoricFloraAdelophthalmus>() {
            @Override
            public Render<? super EntityPrehistoricFloraAdelophthalmus> createRenderFor(RenderManager manager) {
                return new RenderAdelophthalmus(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraGabreyaspis.class, new IRenderFactory<EntityPrehistoricFloraGabreyaspis>() {
            @Override
            public Render<? super EntityPrehistoricFloraGabreyaspis> createRenderFor(RenderManager manager) {
                return new RenderGabreyaspis(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraGantarostrataspis.class, new IRenderFactory<EntityPrehistoricFloraGantarostrataspis>() {
            @Override
            public Render<? super EntityPrehistoricFloraGantarostrataspis> createRenderFor(RenderManager manager) {
                return new RenderGantarostrataspis(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraClydagnathus.class, new IRenderFactory<EntityPrehistoricFloraClydagnathus>() {
            @Override
            public Render<? super EntityPrehistoricFloraClydagnathus> createRenderFor(RenderManager manager) {
                return new RenderClydagnathus(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraLaccognathus.class, new IRenderFactory<EntityPrehistoricFloraLaccognathus>() {
            @Override
            public Render<? super EntityPrehistoricFloraLaccognathus> createRenderFor(RenderManager manager) {
                return new RenderLaccognathus(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraOsteolepis.class, new IRenderFactory<EntityPrehistoricFloraOsteolepis>() {
            @Override
            public Render<? super EntityPrehistoricFloraOsteolepis> createRenderFor(RenderManager manager) {
                return new RenderOsteolepis(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraPelurgaspis.class, new IRenderFactory<EntityPrehistoricFloraPelurgaspis>() {
            @Override
            public Render<? super EntityPrehistoricFloraPelurgaspis> createRenderFor(RenderManager manager) {
                return new RenderPelurgaspis(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraScaumenacia.class, new IRenderFactory<EntityPrehistoricFloraScaumenacia>() {
            @Override
            public Render<? super EntityPrehistoricFloraScaumenacia> createRenderFor(RenderManager manager) {
                return new RenderScaumenacia(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraTartuosteus.class, new IRenderFactory<EntityPrehistoricFloraTartuosteus>() {
            @Override
            public Render<? super EntityPrehistoricFloraTartuosteus> createRenderFor(RenderManager manager) {
                return new RenderTartuosteus(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraStensioella.class, new IRenderFactory<EntityPrehistoricFloraStensioella>() {
            @Override
            public Render<? super EntityPrehistoricFloraStensioella> createRenderFor(RenderManager manager) {
                return new RenderStensioella(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraTurrisaspis.class, new IRenderFactory<EntityPrehistoricFloraTurrisaspis>() {
            @Override
            public Render<? super EntityPrehistoricFloraTurrisaspis> createRenderFor(RenderManager manager) {
                return new RenderTurrisaspis(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraEricixerxes.class, new IRenderFactory<EntityPrehistoricFloraEricixerxes>() {
            @Override
            public Render<? super EntityPrehistoricFloraEricixerxes> createRenderFor(RenderManager manager) {
                return new RenderEricixerxes(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraHelianthaster.class, new IRenderFactory<EntityPrehistoricFloraHelianthaster>() {
            @Override
            public Render<? super EntityPrehistoricFloraHelianthaster> createRenderFor(RenderManager manager) {
                return new RenderHelianthaster(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraHarvestman.class, new IRenderFactory<EntityPrehistoricFloraHarvestman>() {
            @Override
            public Render<? super EntityPrehistoricFloraHarvestman> createRenderFor(RenderManager manager) {
                return new RenderHarvestman(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraTrimerus.class, new IRenderFactory<EntityPrehistoricFloraTrimerus>() {
            @Override
            public Render<? super EntityPrehistoricFloraTrimerus> createRenderFor(RenderManager manager) {
                return new RenderTrimerus(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraMcnamaraspis.class, new IRenderFactory<EntityPrehistoricFloraMcnamaraspis>() {
            @Override
            public Render<? super EntityPrehistoricFloraMcnamaraspis> createRenderFor(RenderManager manager) {
                return new RenderMcnamaraspis(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraBlourugia.class, new IRenderFactory<EntityPrehistoricFloraBlourugia>() {
            @Override
            public Render<? super EntityPrehistoricFloraBlourugia> createRenderFor(RenderManager manager) {
                return new RenderBlourugia(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraVetulicola.class, new IRenderFactory<EntityPrehistoricFloraVetulicola>() {
            @Override
            public Render<? super EntityPrehistoricFloraVetulicola> createRenderFor(RenderManager manager) {
                return new RenderVetulicola(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraVarialepis.class, new IRenderFactory<EntityPrehistoricFloraVarialepis>() {
            @Override
            public Render<? super EntityPrehistoricFloraVarialepis> createRenderFor(RenderManager manager) {
                return new RenderVarialepis(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraAllenypterus.class, new IRenderFactory<EntityPrehistoricFloraAllenypterus>() {
            @Override
            public Render<? super EntityPrehistoricFloraAllenypterus> createRenderFor(RenderManager manager) {
                return new RenderAllenypterus(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraBalanerpeton.class, new IRenderFactory<EntityPrehistoricFloraBalanerpeton>() {
            @Override
            public Render<? super EntityPrehistoricFloraBalanerpeton> createRenderFor(RenderManager manager) {
                return new RenderBalanerpeton(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraBobasatrania.class, new IRenderFactory<EntityPrehistoricFloraBobasatrania>() {
            @Override
            public Render<? super EntityPrehistoricFloraBobasatrania> createRenderFor(RenderManager manager) {
                return new RenderBobasatrania(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraBarbclabornia.class, new IRenderFactory<EntityPrehistoricFloraBarbclabornia>() {
            @Override
            public Render<? super EntityPrehistoricFloraBarbclabornia> createRenderFor(RenderManager manager) {
                return new RenderBarbclabornia(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraLebachacanthus.class, new IRenderFactory<EntityPrehistoricFloraLebachacanthus>() {
            @Override
            public Render<? super EntityPrehistoricFloraLebachacanthus> createRenderFor(RenderManager manager) {
                return new RenderLebachacanthus(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraParanaichthys.class, new IRenderFactory<EntityPrehistoricFloraParanaichthys>() {
            @Override
            public Render<? super EntityPrehistoricFloraParanaichthys> createRenderFor(RenderManager manager) {
                return new RenderParanaichthys(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraDiplocaulus.class, new IRenderFactory<EntityPrehistoricFloraDiplocaulus>() {
            @Override
            public Render<? super EntityPrehistoricFloraDiplocaulus> createRenderFor(RenderManager manager) {
                return new RenderDiplocaulus(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraDiploceraspis.class, new IRenderFactory<EntityPrehistoricFloraDiploceraspis>() {
            @Override
            public Render<? super EntityPrehistoricFloraDiploceraspis> createRenderFor(RenderManager manager) {
                return new RenderDiploceraspis(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraAscendonanus.class, new IRenderFactory<EntityPrehistoricFloraAscendonanus>() {
            @Override
            public Render<? super EntityPrehistoricFloraAscendonanus> createRenderFor(RenderManager manager) {
                return new RenderAscendonanus(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraAulacephalodon.class, new IRenderFactory<EntityPrehistoricFloraAulacephalodon>() {
            @Override
            public Render<? super EntityPrehistoricFloraAulacephalodon> createRenderFor(RenderManager manager) {
                return new RenderAulacephalodon(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraBunostegos.class, new IRenderFactory<EntityPrehistoricFloraBunostegos>() {
            @Override
            public Render<? super EntityPrehistoricFloraBunostegos> createRenderFor(RenderManager manager) {
                return new RenderBunostegos(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraCacops.class, new IRenderFactory<EntityPrehistoricFloraCacops>() {
            @Override
            public Render<? super EntityPrehistoricFloraCacops> createRenderFor(RenderManager manager) {
                return new RenderCacops(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraCaptorhinus.class, new IRenderFactory<EntityPrehistoricFloraCaptorhinus>() {
            @Override
            public Render<? super EntityPrehistoricFloraCaptorhinus> createRenderFor(RenderManager manager) {
                return new RenderCaptorhinus(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraDasyceps.class, new IRenderFactory<EntityPrehistoricFloraDasyceps>() {
            @Override
            public Render<? super EntityPrehistoricFloraDasyceps> createRenderFor(RenderManager manager) {
                return new RenderDasyceps(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraDatheosaurus.class, new IRenderFactory<EntityPrehistoricFloraDatheosaurus>() {
            @Override
            public Render<? super EntityPrehistoricFloraDatheosaurus> createRenderFor(RenderManager manager) {
                return new RenderDatheosaurus(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraDvinosaurus.class, new IRenderFactory<EntityPrehistoricFloraDvinosaurus>() {
            @Override
            public Render<? super EntityPrehistoricFloraDvinosaurus> createRenderFor(RenderManager manager) {
                return new RenderDvinosaurus(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraElginia.class, new IRenderFactory<EntityPrehistoricFloraElginia>() {
            @Override
            public Render<? super EntityPrehistoricFloraElginia> createRenderFor(RenderManager manager) {
                return new RenderElginia(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraEuchambersia.class, new IRenderFactory<EntityPrehistoricFloraEuchambersia>() {
            @Override
            public Render<? super EntityPrehistoricFloraEuchambersia> createRenderFor(RenderManager manager) {
                return new RenderEuchambersia(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraEunotosaurus.class, new IRenderFactory<EntityPrehistoricFloraEunotosaurus>() {
            @Override
            public Render<? super EntityPrehistoricFloraEunotosaurus> createRenderFor(RenderManager manager) {
                return new RenderEunotosaurus(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraJonkeria.class, new IRenderFactory<EntityPrehistoricFloraJonkeria>() {
            @Override
            public Render<? super EntityPrehistoricFloraJonkeria> createRenderFor(RenderManager manager) {
                return new RenderJonkeria(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraMelosaurus.class, new IRenderFactory<EntityPrehistoricFloraMelosaurus>() {
            @Override
            public Render<? super EntityPrehistoricFloraMelosaurus> createRenderFor(RenderManager manager) {
                return new RenderMelosaurus(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraPantylus.class, new IRenderFactory<EntityPrehistoricFloraPantylus>() {
            @Override
            public Render<? super EntityPrehistoricFloraPantylus> createRenderFor(RenderManager manager) {
                return new RenderPantylus(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraPristerognathus.class, new IRenderFactory<EntityPrehistoricFloraPristerognathus>() {
            @Override
            public Render<? super EntityPrehistoricFloraPristerognathus> createRenderFor(RenderManager manager) {
                return new RenderPristerognathus(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraProburnetia.class, new IRenderFactory<EntityPrehistoricFloraProburnetia>() {
            @Override
            public Render<? super EntityPrehistoricFloraProburnetia> createRenderFor(RenderManager manager) {
                return new RenderProburnetia(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraProtorosaurus.class, new IRenderFactory<EntityPrehistoricFloraProtorosaurus>() {
            @Override
            public Render<? super EntityPrehistoricFloraProtorosaurus> createRenderFor(RenderManager manager) {
                return new RenderProtorosaurus(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraPurlovia.class, new IRenderFactory<EntityPrehistoricFloraPurlovia>() {
            @Override
            public Render<? super EntityPrehistoricFloraPurlovia> createRenderFor(RenderManager manager) {
                return new RenderPurlovia(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraSeymouria.class, new IRenderFactory<EntityPrehistoricFloraSeymouria>() {
            @Override
            public Render<? super EntityPrehistoricFloraSeymouria> createRenderFor(RenderManager manager) {
                return new RenderSeymouria(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraTetraceratops.class, new IRenderFactory<EntityPrehistoricFloraTetraceratops>() {
            @Override
            public Render<? super EntityPrehistoricFloraTetraceratops> createRenderFor(RenderManager manager) {
                return new RenderTetraceratops(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraThrinaxodon.class, new IRenderFactory<EntityPrehistoricFloraThrinaxodon>() {
            @Override
            public Render<? super EntityPrehistoricFloraThrinaxodon> createRenderFor(RenderManager manager) {
                return new RenderThrinaxodon(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraTiarajudens.class, new IRenderFactory<EntityPrehistoricFloraTiarajudens>() {
            @Override
            public Render<? super EntityPrehistoricFloraTiarajudens> createRenderFor(RenderManager manager) {
                return new RenderTiarajudens(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraUranocentrodon.class, new IRenderFactory<EntityPrehistoricFloraUranocentrodon>() {
            @Override
            public Render<? super EntityPrehistoricFloraUranocentrodon> createRenderFor(RenderManager manager) {
                return new RenderUranocentrodon(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraProtozygoptera.class, new IRenderFactory<EntityPrehistoricFloraProtozygoptera>() {
            @Override
            public Render<? super EntityPrehistoricFloraProtozygoptera> createRenderFor(RenderManager manager) {
                return new RenderProtozygoptera(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraPalaeontinid.class, new IRenderFactory<EntityPrehistoricFloraPalaeontinid>() {
            @Override
            public Render<? super EntityPrehistoricFloraPalaeontinid> createRenderFor(RenderManager manager) {
                return new RenderPalaeontinid(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraCasineria.class, new IRenderFactory<EntityPrehistoricFloraCasineria>() {
            @Override
            public Render<? super EntityPrehistoricFloraCasineria> createRenderFor(RenderManager manager) {
                return new RenderCasineria(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraGephyrostegus.class, new IRenderFactory<EntityPrehistoricFloraGephyrostegus>() {
            @Override
            public Render<? super EntityPrehistoricFloraGephyrostegus> createRenderFor(RenderManager manager) {
                return new RenderGephyrostegus(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraSpinoaequalis.class, new IRenderFactory<EntityPrehistoricFloraSpinoaequalis>() {
            @Override
            public Render<? super EntityPrehistoricFloraSpinoaequalis> createRenderFor(RenderManager manager) {
                return new RenderSpinoaequalis(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraWhatcheeria.class, new IRenderFactory<EntityPrehistoricFloraWhatcheeria>() {
            @Override
            public Render<? super EntityPrehistoricFloraWhatcheeria> createRenderFor(RenderManager manager) {
                return new RenderWhatcheeria(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraHelenodora.class, new IRenderFactory<EntityPrehistoricFloraHelenodora>() {
            @Override
            public Render<? super EntityPrehistoricFloraHelenodora> createRenderFor(RenderManager manager) {
                return new RenderHelenodora(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraMeganeura.class, new IRenderFactory<EntityPrehistoricFloraMeganeura>() {
            @Override
            public Render<? super EntityPrehistoricFloraMeganeura> createRenderFor(RenderManager manager) {
                return new RenderMeganeura(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraCynognathus.class, new IRenderFactory<EntityPrehistoricFloraCynognathus>() {
            @Override
            public Render<? super EntityPrehistoricFloraCynognathus> createRenderFor(RenderManager manager) {
                return new RenderCynognathus(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraPlacerias.class, new IRenderFactory<EntityPrehistoricFloraPlacerias>() {
            @Override
            public Render<? super EntityPrehistoricFloraPlacerias> createRenderFor(RenderManager manager) {
                return new RenderPlacerias(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraMeganeuraNymph.class, new IRenderFactory<EntityPrehistoricFloraMeganeuraNymph>() {
            @Override
            public Render<? super EntityPrehistoricFloraMeganeuraNymph> createRenderFor(RenderManager manager) {
                return new RenderMeganeuraNymph(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraMeteor.class, new IRenderFactory<EntityPrehistoricFloraMeteor>() {
            @Override
            public Render<? super EntityPrehistoricFloraMeteor> createRenderFor(RenderManager manager) {
                return new RenderMeteor(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraLochmanolenellus.class, new IRenderFactory<EntityPrehistoricFloraLochmanolenellus>() {
        @Override
        public Render<? super EntityPrehistoricFloraLochmanolenellus> createRenderFor(RenderManager manager) {
            return new RenderLochmanolenellus(manager);
        }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraAstraspis.class, new IRenderFactory<EntityPrehistoricFloraAstraspis>() {
        @Override
        public Render<? super EntityPrehistoricFloraAstraspis> createRenderFor(RenderManager manager) {
        return new RenderAstraspis(manager);
        }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraPanderodus.class, new IRenderFactory<EntityPrehistoricFloraPanderodus>() {
        @Override
        public Render<? super EntityPrehistoricFloraPanderodus> createRenderFor(RenderManager manager) {
        return new RenderPanderodus(manager);
        }
            });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraCalvapilosa.class, new IRenderFactory<EntityPrehistoricFloraCalvapilosa>() {
        @Override
        public Render<? super EntityPrehistoricFloraCalvapilosa> createRenderFor(RenderManager manager) {
        return new RenderCalvapilosa(manager);
        }
            });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraBoothiaspis.class, new IRenderFactory<EntityPrehistoricFloraBoothiaspis>() {
        @Override
        public Render<? super EntityPrehistoricFloraBoothiaspis> createRenderFor(RenderManager manager) {
        return new RenderBoothiaspis(manager);
        }
            });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraHolonema.class, new IRenderFactory<EntityPrehistoricFloraHolonema>() {
        @Override
        public Render<? super EntityPrehistoricFloraHolonema> createRenderFor(RenderManager manager) {
        return new RenderHolonema(manager);
        }
            });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraDrotops.class, new IRenderFactory<EntityPrehistoricFloraDrotops>() {
        @Override
        public Render<? super EntityPrehistoricFloraDrotops> createRenderFor(RenderManager manager) {
        return new RenderDrotops(manager);
        }
            });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraHeliopeltis.class, new IRenderFactory<EntityPrehistoricFloraHeliopeltis>() {
        @Override
        public Render<? super EntityPrehistoricFloraHeliopeltis> createRenderFor(RenderManager manager) {
        return new RenderHeliopeltis(manager);
        }
            });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraLanceaspis.class, new IRenderFactory<EntityPrehistoricFloraLanceaspis>() {
        @Override
        public Render<? super EntityPrehistoricFloraLanceaspis> createRenderFor(RenderManager manager) {
        return new RenderLanceaspis(manager);
        }
            });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraMontecaris.class, new IRenderFactory<EntityPrehistoricFloraMontecaris>() {
        @Override
        public Render<? super EntityPrehistoricFloraMontecaris> createRenderFor(RenderManager manager) {
        return new RenderMontecaris(manager);
        }
            });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraRhenocystis.class, new IRenderFactory<EntityPrehistoricFloraRhenocystis>() {
        @Override
        public Render<? super EntityPrehistoricFloraRhenocystis> createRenderFor(RenderManager manager) {
        return new RenderRhenocystis(manager);
        }
            });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraWillwerathia.class, new IRenderFactory<EntityPrehistoricFloraWillwerathia>() {
        @Override
        public Render<? super EntityPrehistoricFloraWillwerathia> createRenderFor(RenderManager manager) {
        return new RenderWillwerathia(manager);
        }
            });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraParmastega.class, new IRenderFactory<EntityPrehistoricFloraParmastega>() {
        @Override
        public Render<? super EntityPrehistoricFloraParmastega> createRenderFor(RenderManager manager) {
        return new RenderParmastega(manager);
        }
            });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraTiktaalik.class, new IRenderFactory<EntityPrehistoricFloraTiktaalik>() {
        @Override
        public Render<? super EntityPrehistoricFloraTiktaalik> createRenderFor(RenderManager manager) {
        return new RenderTiktaalik(manager);
        }
            });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraReticulolepis.class, new IRenderFactory<EntityPrehistoricFloraReticulolepis>() {
        @Override
        public Render<? super EntityPrehistoricFloraReticulolepis> createRenderFor(RenderManager manager) {
        return new RenderReticulolepis(manager);
        }
            });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraDeltoptychius.class, new IRenderFactory<EntityPrehistoricFloraDeltoptychius>() {
        @Override
        public Render<? super EntityPrehistoricFloraDeltoptychius> createRenderFor(RenderManager manager) {
        return new RenderDeltoptychius(manager);
        }
            });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraFadeniaCarboniferous.class, new IRenderFactory<EntityPrehistoricFloraFadeniaCarboniferous>() {
        @Override
        public Render<? super EntityPrehistoricFloraFadeniaCarboniferous> createRenderFor(RenderManager manager) {
        return new RenderFadeniaCarboniferous(manager);
        }
            });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraFadeniaPermotriassic.class, new IRenderFactory<EntityPrehistoricFloraFadeniaPermotriassic>() {
            @Override
            public Render<? super EntityPrehistoricFloraFadeniaPermotriassic> createRenderFor(RenderManager manager) {
                return new RenderFadeniaPermotriassic(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraFalcatus.class, new IRenderFactory<EntityPrehistoricFloraFalcatus>() {
        @Override
        public Render<? super EntityPrehistoricFloraFalcatus> createRenderFor(RenderManager manager) {
        return new RenderFalcatus(manager);
        }
            });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraOrodus.class, new IRenderFactory<EntityPrehistoricFloraOrodus>() {
        @Override
        public Render<? super EntityPrehistoricFloraOrodus> createRenderFor(RenderManager manager) {
        return new RenderOrodus(manager);
        }
            });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraParatarrasius.class, new IRenderFactory<EntityPrehistoricFloraParatarrasius>() {
        @Override
        public Render<? super EntityPrehistoricFloraParatarrasius> createRenderFor(RenderManager manager) {
        return new RenderParatarrasius(manager);
        }
            });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraSyllipsimopodi.class, new IRenderFactory<EntityPrehistoricFloraSyllipsimopodi>() {
        @Override
        public Render<? super EntityPrehistoricFloraSyllipsimopodi> createRenderFor(RenderManager manager) {
        return new RenderSyllipsimopodi(manager);
        }
            });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraThrinacodus.class, new IRenderFactory<EntityPrehistoricFloraThrinacodus>() {
        @Override
        public Render<? super EntityPrehistoricFloraThrinacodus> createRenderFor(RenderManager manager) {
        return new RenderThrinacodus(manager);
        }
            });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraTyrannophontes.class, new IRenderFactory<EntityPrehistoricFloraTyrannophontes>() {
        @Override
        public Render<? super EntityPrehistoricFloraTyrannophontes> createRenderFor(RenderManager manager) {
        return new RenderTyrannophontes(manager);
        }
            });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraUrocordylus.class, new IRenderFactory<EntityPrehistoricFloraUrocordylus>() {
        @Override
        public Render<? super EntityPrehistoricFloraUrocordylus> createRenderFor(RenderManager manager) {
        return new RenderUrocordylus(manager);
        }
            });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraEdaphosaurus.class, new IRenderFactory<EntityPrehistoricFloraEdaphosaurus>() {
        @Override
        public Render<? super EntityPrehistoricFloraEdaphosaurus> createRenderFor(RenderManager manager) {
        return new RenderEdaphosaurus(manager);
        }
            });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraArthropleura.class, new IRenderFactory<EntityPrehistoricFloraArthropleura>() {
        @Override
        public Render<? super EntityPrehistoricFloraArthropleura> createRenderFor(RenderManager manager) {
        return new RenderArthropleura(manager);
        }
            });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraCobelodus.class, new IRenderFactory<EntityPrehistoricFloraCobelodus>() {
        @Override
        public Render<? super EntityPrehistoricFloraCobelodus> createRenderFor(RenderManager manager) {
        return new RenderCobelodus(manager);
        }
            });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraMegactenopetalus.class, new IRenderFactory<EntityPrehistoricFloraMegactenopetalus>() {
        @Override
        public Render<? super EntityPrehistoricFloraMegactenopetalus> createRenderFor(RenderManager manager) {
        return new RenderMegactenopetalus(manager);
        }
            });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraRubidgea.class, new IRenderFactory<EntityPrehistoricFloraRubidgea>() {
        @Override
        public Render<? super EntityPrehistoricFloraRubidgea> createRenderFor(RenderManager manager) {
        return new RenderRubidgea(manager);
        }
            });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraEndothiodon.class, new IRenderFactory<EntityPrehistoricFloraEndothiodon>() {
        @Override
        public Render<? super EntityPrehistoricFloraEndothiodon> createRenderFor(RenderManager manager) {
        return new RenderEndothiodon(manager);
        }
            });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraAustrolimulus.class, new IRenderFactory<EntityPrehistoricFloraAustrolimulus>() {
        @Override
        public Render<? super EntityPrehistoricFloraAustrolimulus> createRenderFor(RenderManager manager) {
        return new RenderAustrolimulus(manager);
        }
            });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraBeishanichthys.class, new IRenderFactory<EntityPrehistoricFloraBeishanichthys>() {
        @Override
        public Render<? super EntityPrehistoricFloraBeishanichthys> createRenderFor(RenderManager manager) {
        return new RenderBeishanichthys(manager);
        }
            });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraBirgeria.class, new IRenderFactory<EntityPrehistoricFloraBirgeria>() {
        @Override
        public Render<? super EntityPrehistoricFloraBirgeria> createRenderFor(RenderManager manager) {
        return new RenderBirgeria(manager);
        }
            });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraBrembodus.class, new IRenderFactory<EntityPrehistoricFloraBrembodus>() {
        @Override
        public Render<? super EntityPrehistoricFloraBrembodus> createRenderFor(RenderManager manager) {
        return new RenderBrembodus(manager);
        }
            });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraCaturus.class, new IRenderFactory<EntityPrehistoricFloraCaturus>() {
        @Override
        public Render<? super EntityPrehistoricFloraCaturus> createRenderFor(RenderManager manager) {
        return new RenderCaturus(manager);
        }
            });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraChinlea.class, new IRenderFactory<EntityPrehistoricFloraChinlea>() {
        @Override
        public Render<? super EntityPrehistoricFloraChinlea> createRenderFor(RenderManager manager) {
        return new RenderChinlea(manager);
        }
            });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraDapedium.class, new IRenderFactory<EntityPrehistoricFloraDapedium>() {
        @Override
        public Render<? super EntityPrehistoricFloraDapedium> createRenderFor(RenderManager manager) {
        return new RenderDapedium(manager);
        }
            });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraForeyia.class, new IRenderFactory<EntityPrehistoricFloraForeyia>() {
        @Override
        public Render<? super EntityPrehistoricFloraForeyia> createRenderFor(RenderManager manager) {
        return new RenderForeyia(manager);
        }
            });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraHybodus.class, new IRenderFactory<EntityPrehistoricFloraHybodus>() {
        @Override
        public Render<? super EntityPrehistoricFloraHybodus> createRenderFor(RenderManager manager) {
        return new RenderHybodus(manager);
        }
            });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraLuoxiongichthys.class, new IRenderFactory<EntityPrehistoricFloraLuoxiongichthys>() {
        @Override
        public Render<? super EntityPrehistoricFloraLuoxiongichthys> createRenderFor(RenderManager manager) {
        return new RenderLuoxiongichthys(manager);
        }
            });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraPotanichthys.class, new IRenderFactory<EntityPrehistoricFloraPotanichthys>() {
        @Override
        public Render<? super EntityPrehistoricFloraPotanichthys> createRenderFor(RenderManager manager) {
        return new RenderPotanichthys(manager);
        }
            });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraAeger.class, new IRenderFactory<EntityPrehistoricFloraAeger>() {
        @Override
        public Render<? super EntityPrehistoricFloraAeger> createRenderFor(RenderManager manager) {
        return new RenderAeger(manager);
        }
            });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraAulacoceras.class, new IRenderFactory<EntityPrehistoricFloraAulacoceras>() {
        @Override
        public Render<? super EntityPrehistoricFloraAulacoceras> createRenderFor(RenderManager manager) {
        return new RenderAulacoceras(manager);
        }
            });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraBesanosaurus.class, new IRenderFactory<EntityPrehistoricFloraBesanosaurus>() {
        @Override
        public Render<? super EntityPrehistoricFloraBesanosaurus> createRenderFor(RenderManager manager) {
        return new RenderBesanosaurus(manager);
        }
            });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraCartorhynchus.class, new IRenderFactory<EntityPrehistoricFloraCartorhynchus>() {
        @Override
        public Render<? super EntityPrehistoricFloraCartorhynchus> createRenderFor(RenderManager manager) {
        return new RenderCartorhynchus(manager);
        }
            });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraCyamodus.class, new IRenderFactory<EntityPrehistoricFloraCyamodus>() {
        @Override
        public Render<? super EntityPrehistoricFloraCyamodus> createRenderFor(RenderManager manager) {
        return new RenderCyamodus(manager);
        }
            });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraCymbospondylus.class, new IRenderFactory<EntityPrehistoricFloraCymbospondylus>() {
        @Override
        public Render<? super EntityPrehistoricFloraCymbospondylus> createRenderFor(RenderManager manager) {
        return new RenderCymbospondylus(manager);
        }
            });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraEorhynchochelys.class, new IRenderFactory<EntityPrehistoricFloraEorhynchochelys>() {
        @Override
        public Render<? super EntityPrehistoricFloraEorhynchochelys> createRenderFor(RenderManager manager) {
        return new RenderEorhynchochelys(manager);
        }
            });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraEretmorhipis.class, new IRenderFactory<EntityPrehistoricFloraEretmorhipis>() {
        @Override
        public Render<? super EntityPrehistoricFloraEretmorhipis> createRenderFor(RenderManager manager) {
        return new RenderEretmorhipis(manager);
        }
            });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraHenodus.class, new IRenderFactory<EntityPrehistoricFloraHenodus>() {
        @Override
        public Render<? super EntityPrehistoricFloraHenodus> createRenderFor(RenderManager manager) {
        return new RenderHenodus(manager);
        }
            });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraLimulid.class, new IRenderFactory<EntityPrehistoricFloraLimulid>() {
        @Override
        public Render<? super EntityPrehistoricFloraLimulid> createRenderFor(RenderManager manager) {
        return new RenderLimulid(manager);
        }
            });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraKeichousaurus.class, new IRenderFactory<EntityPrehistoricFloraKeichousaurus>() {
        @Override
        public Render<? super EntityPrehistoricFloraKeichousaurus> createRenderFor(RenderManager manager) {
        return new RenderKeichousaurus(manager);
        }
            });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraNothosaurus.class, new IRenderFactory<EntityPrehistoricFloraNothosaurus>() {
        @Override
        public Render<? super EntityPrehistoricFloraNothosaurus> createRenderFor(RenderManager manager) {
        return new RenderNothosaurus(manager);
        }
            });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraOpolanka.class, new IRenderFactory<EntityPrehistoricFloraOpolanka>() {
        @Override
        public Render<? super EntityPrehistoricFloraOpolanka> createRenderFor(RenderManager manager) {
        return new RenderOpolanka(manager);
        }
            });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraPanzhousaurus.class, new IRenderFactory<EntityPrehistoricFloraPanzhousaurus>() {
        @Override
        public Render<? super EntityPrehistoricFloraPanzhousaurus> createRenderFor(RenderManager manager) {
        return new RenderPanzhousaurus(manager);
        }
            });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraPlacodus.class, new IRenderFactory<EntityPrehistoricFloraPlacodus>() {
        @Override
        public Render<? super EntityPrehistoricFloraPlacodus> createRenderFor(RenderManager manager) {
        return new RenderPlacodus(manager);
        }
            });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraSclerocormus.class, new IRenderFactory<EntityPrehistoricFloraSclerocormus>() {
        @Override
        public Render<? super EntityPrehistoricFloraSclerocormus> createRenderFor(RenderManager manager) {
        return new RenderSclerocormus(manager);
        }
            });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraTriadobatrachus.class, new IRenderFactory<EntityPrehistoricFloraTriadobatrachus>() {
        @Override
        public Render<? super EntityPrehistoricFloraTriadobatrachus> createRenderFor(RenderManager manager) {
        return new RenderTriadobatrachus(manager);
        }
            });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraYunguisaurus.class, new IRenderFactory<EntityPrehistoricFloraYunguisaurus>() {
        @Override
        public Render<? super EntityPrehistoricFloraYunguisaurus> createRenderFor(RenderManager manager) {
        return new RenderYunguisaurus(manager);
        }
            });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraArizonasaurus.class, new IRenderFactory<EntityPrehistoricFloraArizonasaurus>() {
        @Override
        public Render<? super EntityPrehistoricFloraArizonasaurus> createRenderFor(RenderManager manager) {
        return new RenderArizonasaurus(manager);
        }
            });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraAtopodentatus.class, new IRenderFactory<EntityPrehistoricFloraAtopodentatus>() {
        @Override
        public Render<? super EntityPrehistoricFloraAtopodentatus> createRenderFor(RenderManager manager) {
        return new RenderAtopodentatus(manager);
        }
            });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraBatrachotomus.class, new IRenderFactory<EntityPrehistoricFloraBatrachotomus>() {
        @Override
        public Render<? super EntityPrehistoricFloraBatrachotomus> createRenderFor(RenderManager manager) {
        return new RenderBatrachotomus(manager);
        }
            });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraClevosaurus.class, new IRenderFactory<EntityPrehistoricFloraClevosaurus>() {
        @Override
        public Render<? super EntityPrehistoricFloraClevosaurus> createRenderFor(RenderManager manager) {
        return new RenderClevosaurus(manager);
        }
            });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraDesmatosuchus.class, new IRenderFactory<EntityPrehistoricFloraDesmatosuchus>() {
        @Override
        public Render<? super EntityPrehistoricFloraDesmatosuchus> createRenderFor(RenderManager manager) {
        return new RenderDesmatosuchus(manager);
        }
            });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraDoswellia.class, new IRenderFactory<EntityPrehistoricFloraDoswellia>() {
        @Override
        public Render<? super EntityPrehistoricFloraDoswellia> createRenderFor(RenderManager manager) {
        return new RenderDoswellia(manager);
        }
            });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraDrepanosaurus.class, new IRenderFactory<EntityPrehistoricFloraDrepanosaurus>() {
        @Override
        public Render<? super EntityPrehistoricFloraDrepanosaurus> createRenderFor(RenderManager manager) {
        return new RenderDrepanosaurus(manager);
        }
            });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraEffigia.class, new IRenderFactory<EntityPrehistoricFloraEffigia>() {
        @Override
        public Render<? super EntityPrehistoricFloraEffigia> createRenderFor(RenderManager manager) {
        return new RenderEffigia(manager);
        }
            });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraErythrosuchus.class, new IRenderFactory<EntityPrehistoricFloraErythrosuchus>() {
        @Override
        public Render<? super EntityPrehistoricFloraErythrosuchus> createRenderFor(RenderManager manager) {
        return new RenderErythrosuchus(manager);
        }
            });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraEuparkeria.class, new IRenderFactory<EntityPrehistoricFloraEuparkeria>() {
        @Override
        public Render<? super EntityPrehistoricFloraEuparkeria> createRenderFor(RenderManager manager) {
        return new RenderEuparkeria(manager);
        }
            });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraEusaurosphargis.class, new IRenderFactory<EntityPrehistoricFloraEusaurosphargis>() {
        @Override
        public Render<? super EntityPrehistoricFloraEusaurosphargis> createRenderFor(RenderManager manager) {
        return new RenderEusaurosphargis(manager);
        }
            });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraGerrothorax.class, new IRenderFactory<EntityPrehistoricFloraGerrothorax>() {
        @Override
        public Render<? super EntityPrehistoricFloraGerrothorax> createRenderFor(RenderManager manager) {
        return new RenderGerrothorax(manager);
        }
            });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraHyperodapedon.class, new IRenderFactory<EntityPrehistoricFloraHyperodapedon>() {
        @Override
        public Render<? super EntityPrehistoricFloraHyperodapedon> createRenderFor(RenderManager manager) {
        return new RenderHyperodapedon(manager);
        }
            });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraHypsognathus.class, new IRenderFactory<EntityPrehistoricFloraHypsognathus>() {
        @Override
        public Render<? super EntityPrehistoricFloraHypsognathus> createRenderFor(RenderManager manager) {
        return new RenderHypsognathus(manager);
        }
            });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraHypuronector.class, new IRenderFactory<EntityPrehistoricFloraHypuronector>() {
        @Override
        public Render<? super EntityPrehistoricFloraHypuronector> createRenderFor(RenderManager manager) {
        return new RenderHypuronector(manager);
        }
            });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraLagosuchus.class, new IRenderFactory<EntityPrehistoricFloraLagosuchus>() {
        @Override
        public Render<? super EntityPrehistoricFloraLagosuchus> createRenderFor(RenderManager manager) {
        return new RenderLagosuchus(manager);
        }
            });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraLessemsaurus.class, new IRenderFactory<EntityPrehistoricFloraLessemsaurus>() {
        @Override
        public Render<? super EntityPrehistoricFloraLessemsaurus> createRenderFor(RenderManager manager) {
        return new RenderLessemsaurus(manager);
        }
            });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraLongisquama.class, new IRenderFactory<EntityPrehistoricFloraLongisquama>() {
        @Override
        public Render<? super EntityPrehistoricFloraLongisquama> createRenderFor(RenderManager manager) {
        return new RenderLongisquama(manager);
        }
            });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraLotosaurus.class, new IRenderFactory<EntityPrehistoricFloraLotosaurus>() {
        @Override
        public Render<? super EntityPrehistoricFloraLotosaurus> createRenderFor(RenderManager manager) {
        return new RenderLotosaurus(manager);
        }
            });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraMegazostrodon.class, new IRenderFactory<EntityPrehistoricFloraMegazostrodon>() {
        @Override
        public Render<? super EntityPrehistoricFloraMegazostrodon> createRenderFor(RenderManager manager) {
        return new RenderMegazostrodon(manager);
        }
            });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraMetoposaurus.class, new IRenderFactory<EntityPrehistoricFloraMetoposaurus>() {
        @Override
        public Render<? super EntityPrehistoricFloraMetoposaurus> createRenderFor(RenderManager manager) {
        return new RenderMetoposaurus(manager);
        }
            });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraMorganucodon.class, new IRenderFactory<EntityPrehistoricFloraMorganucodon>() {
        @Override
        public Render<? super EntityPrehistoricFloraMorganucodon> createRenderFor(RenderManager manager) {
        return new RenderMorganucodon(manager);
        }
            });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraMussaurus.class, new IRenderFactory<EntityPrehistoricFloraMussaurus>() {
        @Override
        public Render<? super EntityPrehistoricFloraMussaurus> createRenderFor(RenderManager manager) {
        return new RenderMussaurus(manager);
        }
            });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraOrnithosuchus.class, new IRenderFactory<EntityPrehistoricFloraOrnithosuchus>() {
        @Override
        public Render<? super EntityPrehistoricFloraOrnithosuchus> createRenderFor(RenderManager manager) {
        return new RenderOrnithosuchus(manager);
        }
            });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraTeleocrater.class, new IRenderFactory<EntityPrehistoricFloraTeleocrater>() {
        @Override
        public Render<? super EntityPrehistoricFloraTeleocrater> createRenderFor(RenderManager manager) {
        return new RenderTeleocrater(manager);
        }
            });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraPoposaurus.class, new IRenderFactory<EntityPrehistoricFloraPoposaurus>() {
        @Override
        public Render<? super EntityPrehistoricFloraPoposaurus> createRenderFor(RenderManager manager) {
        return new RenderPoposaurus(manager);
        }
            });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraPostosuchus.class, new IRenderFactory<EntityPrehistoricFloraPostosuchus>() {
        @Override
        public Render<? super EntityPrehistoricFloraPostosuchus> createRenderFor(RenderManager manager) {
        return new RenderPostosuchus(manager);
        }
            });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraProganochelys.class, new IRenderFactory<EntityPrehistoricFloraProganochelys>() {
        @Override
        public Render<? super EntityPrehistoricFloraProganochelys> createRenderFor(RenderManager manager) {
        return new RenderProganochelys(manager);
        }
            });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraPseudotherium.class, new IRenderFactory<EntityPrehistoricFloraPseudotherium>() {
        @Override
        public Render<? super EntityPrehistoricFloraPseudotherium> createRenderFor(RenderManager manager) {
        return new RenderPseudotherium(manager);
        }
            });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraSaurosuchus.class, new IRenderFactory<EntityPrehistoricFloraSaurosuchus>() {
        @Override
        public Render<? super EntityPrehistoricFloraSaurosuchus> createRenderFor(RenderManager manager) {
        return new RenderSaurosuchus(manager);
        }
            });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraRutiodon.class, new IRenderFactory<EntityPrehistoricFloraRutiodon>() {
        @Override
        public Render<? super EntityPrehistoricFloraRutiodon> createRenderFor(RenderManager manager) {
        return new RenderRutiodon(manager);
        }
            });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraScleromochlus.class, new IRenderFactory<EntityPrehistoricFloraScleromochlus>() {
        @Override
        public Render<? super EntityPrehistoricFloraScleromochlus> createRenderFor(RenderManager manager) {
        return new RenderScleromochlus(manager);
        }
            });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraSharovipteryx.class, new IRenderFactory<EntityPrehistoricFloraSharovipteryx>() {
        @Override
        public Render<? super EntityPrehistoricFloraSharovipteryx> createRenderFor(RenderManager manager) {
        return new RenderSharovipteryx(manager);
        }
            });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraSilesaurus.class, new IRenderFactory<EntityPrehistoricFloraSilesaurus>() {
        @Override
        public Render<? super EntityPrehistoricFloraSilesaurus> createRenderFor(RenderManager manager) {
        return new RenderSilesaurus(manager);
        }
            });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraSillosuchus.class, new IRenderFactory<EntityPrehistoricFloraSillosuchus>() {
        @Override
        public Render<? super EntityPrehistoricFloraSillosuchus> createRenderFor(RenderManager manager) {
        return new RenderSillosuchus(manager);
        }
            });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraSmilosuchus.class, new IRenderFactory<EntityPrehistoricFloraSmilosuchus>() {
        @Override
        public Render<? super EntityPrehistoricFloraSmilosuchus> createRenderFor(RenderManager manager) {
        return new RenderSmilosuchus(manager);
        }
            });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraSmok.class, new IRenderFactory<EntityPrehistoricFloraSmok>() {
        @Override
        public Render<? super EntityPrehistoricFloraSmok> createRenderFor(RenderManager manager) {
        return new RenderSmok(manager);
        }
            });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraSphenotitan.class, new IRenderFactory<EntityPrehistoricFloraSphenotitan>() {
        @Override
        public Render<? super EntityPrehistoricFloraSphenotitan> createRenderFor(RenderManager manager) {
        return new RenderSphenotitan(manager);
        }
            });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraStagonolepis.class, new IRenderFactory<EntityPrehistoricFloraStagonolepis>() {
        @Override
        public Render<? super EntityPrehistoricFloraStagonolepis> createRenderFor(RenderManager manager) {
        return new RenderStagonolepis(manager);
        }
            });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraStanocephalosaurus.class, new IRenderFactory<EntityPrehistoricFloraStanocephalosaurus>() {
        @Override
        public Render<? super EntityPrehistoricFloraStanocephalosaurus> createRenderFor(RenderManager manager) {
        return new RenderStanocephalosaurus(manager);
        }
            });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraTanystropheus.class, new IRenderFactory<EntityPrehistoricFloraTanystropheus>() {
        @Override
        public Render<? super EntityPrehistoricFloraTanystropheus> createRenderFor(RenderManager manager) {
        return new RenderTanystropheus(manager);
        }
            });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraTeraterpeton.class, new IRenderFactory<EntityPrehistoricFloraTeraterpeton>() {
        @Override
        public Render<? super EntityPrehistoricFloraTeraterpeton> createRenderFor(RenderManager manager) {
        return new RenderTeraterpeton(manager);
        }
            });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraTeyujagua.class, new IRenderFactory<EntityPrehistoricFloraTeyujagua>() {
        @Override
        public Render<? super EntityPrehistoricFloraTeyujagua> createRenderFor(RenderManager manager) {
        return new RenderTeyujagua(manager);
        }
            });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraThecodontosaurus.class, new IRenderFactory<EntityPrehistoricFloraThecodontosaurus>() {
        @Override
        public Render<? super EntityPrehistoricFloraThecodontosaurus> createRenderFor(RenderManager manager) {
        return new RenderThecodontosaurus(manager);
        }
            });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraVancleavea.class, new IRenderFactory<EntityPrehistoricFloraVancleavea>() {
        @Override
        public Render<? super EntityPrehistoricFloraVancleavea> createRenderFor(RenderManager manager) {
        return new RenderVancleavea(manager);
        }
            });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraXinpusaurus.class, new IRenderFactory<EntityPrehistoricFloraXinpusaurus>() {
        @Override
        public Render<? super EntityPrehistoricFloraXinpusaurus> createRenderFor(RenderManager manager) {
        return new RenderXinpusaurus(manager);
        }
            });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraAustriadactylus.class, new IRenderFactory<EntityPrehistoricFloraAustriadactylus>() {
        @Override
        public Render<? super EntityPrehistoricFloraAustriadactylus> createRenderFor(RenderManager manager) {
        return new RenderAustriadactylus(manager);
        }
            });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraCaelestiventus.class, new IRenderFactory<EntityPrehistoricFloraCaelestiventus>() {
        @Override
        public Render<? super EntityPrehistoricFloraCaelestiventus> createRenderFor(RenderManager manager) {
        return new RenderCaelestiventus(manager);
        }
            });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraCaviramus.class, new IRenderFactory<EntityPrehistoricFloraCaviramus>() {
        @Override
        public Render<? super EntityPrehistoricFloraCaviramus> createRenderFor(RenderManager manager) {
        return new RenderCaviramus(manager);
        }
            });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraEudimorphodon.class, new IRenderFactory<EntityPrehistoricFloraEudimorphodon>() {
        @Override
        public Render<? super EntityPrehistoricFloraEudimorphodon> createRenderFor(RenderManager manager) {
        return new RenderEudimorphodon(manager);
        }
            });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraItalophlebia.class, new IRenderFactory<EntityPrehistoricFloraItalophlebia>() {
        @Override
        public Render<? super EntityPrehistoricFloraItalophlebia> createRenderFor(RenderManager manager) {
        return new RenderItalophlebia(manager);
        }
            });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraNagini.class, new IRenderFactory<EntityPrehistoricFloraNagini>() {
        @Override
        public Render<? super EntityPrehistoricFloraNagini> createRenderFor(RenderManager manager) {
        return new RenderNagini(manager);
        }
            });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraBrachydectes.class, new IRenderFactory<EntityPrehistoricFloraBrachydectes>() {
        @Override
        public Render<? super EntityPrehistoricFloraBrachydectes> createRenderFor(RenderManager manager) {
        return new RenderBrachydectes(manager);
        }
            });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraLysorophus.class, new IRenderFactory<EntityPrehistoricFloraLysorophus>() {
        @Override
        public Render<? super EntityPrehistoricFloraLysorophus> createRenderFor(RenderManager manager) {
        return new RenderLysorophus(manager);
        }
            });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraParhybodus.class, new IRenderFactory<EntityPrehistoricFloraParhybodus>() {
        @Override
        public Render<? super EntityPrehistoricFloraParhybodus> createRenderFor(RenderManager manager) {
                return new RenderParhybodus(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraProtozygopteraNymph.class, new IRenderFactory<EntityPrehistoricFloraProtozygopteraNymph>() {
        @Override
        public Render<? super EntityPrehistoricFloraProtozygopteraNymph> createRenderFor(RenderManager manager) {
                return new RenderProtozygopteraNymph(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraTitanopteraGigatitan.class, new IRenderFactory<EntityPrehistoricFloraTitanopteraGigatitan>() {
        @Override
        public Render<? super EntityPrehistoricFloraTitanopteraGigatitan> createRenderFor(RenderManager manager) {
                return new RenderTitanopteraGigatitan(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraTitanopteraMesotitan.class, new IRenderFactory<EntityPrehistoricFloraTitanopteraMesotitan>() {
        @Override
        public Render<? super EntityPrehistoricFloraTitanopteraMesotitan> createRenderFor(RenderManager manager) {
                return new RenderTitanopteraMesotitan(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraTitanopteraClatrotitan.class, new IRenderFactory<EntityPrehistoricFloraTitanopteraClatrotitan>() {
        @Override
        public Render<? super EntityPrehistoricFloraTitanopteraClatrotitan> createRenderFor(RenderManager manager) {
                return new RenderTitanopteraClatrotitan(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraTitanopteraNymph.class, new IRenderFactory<EntityPrehistoricFloraTitanopteraNymph>() {
        @Override
        public Render<? super EntityPrehistoricFloraTitanopteraNymph> createRenderFor(RenderManager manager) {
                return new RenderTitanopteraNymph(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraLonchidion.class, new IRenderFactory<EntityPrehistoricFloraLonchidion>() {
            @Override
            public Render<? super EntityPrehistoricFloraLonchidion> createRenderFor(RenderManager manager) {
                return new RenderLonchidion(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraSpiniplatyceras.class, new IRenderFactory<EntityPrehistoricFloraSpiniplatyceras>() {
            @Override
            public Render<? super EntityPrehistoricFloraSpiniplatyceras> createRenderFor(RenderManager manager) {
                return new RenderSpiniplatyceras(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraLandSnail.class, new IRenderFactory<EntityPrehistoricFloraLandSnail>() {
            @Override
            public Render<? super EntityPrehistoricFloraLandSnail> createRenderFor(RenderManager manager) {
                return new RenderLandSnail(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraNipponomaria.class, new IRenderFactory<EntityPrehistoricFloraNipponomaria>() {
            @Override
            public Render<? super EntityPrehistoricFloraNipponomaria> createRenderFor(RenderManager manager) {
                return new RenderNipponomaria(manager);
            }
        });

        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraPalaeoniscum.class, new IRenderFactory<EntityPrehistoricFloraPalaeoniscum>() {
            @Override
            public Render<? super EntityPrehistoricFloraPalaeoniscum> createRenderFor(RenderManager manager) {
                return new RenderPalaeoniscum(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraParapeytoia.class, new IRenderFactory<EntityPrehistoricFloraParapeytoia>() {
            @Override
            public Render<? super EntityPrehistoricFloraParapeytoia> createRenderFor(RenderManager manager) {
                return new RenderParapeytoia(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraPhragmoceras.class, new IRenderFactory<EntityPrehistoricFloraPhragmoceras>() {
            @Override
            public Render<? super EntityPrehistoricFloraPhragmoceras> createRenderFor(RenderManager manager) {
                return new RenderPhragmoceras(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraLituites.class, new IRenderFactory<EntityPrehistoricFloraLituites>() {
            @Override
            public Render<? super EntityPrehistoricFloraLituites> createRenderFor(RenderManager manager) {
                return new RenderLituites(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraPiatnitzkysaurus.class, new IRenderFactory<EntityPrehistoricFloraPiatnitzkysaurus>() {
            @Override
            public Render<? super EntityPrehistoricFloraPiatnitzkysaurus> createRenderFor(RenderManager manager) {
                return new RenderPiatnitzkysaurus(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraCidaroida.class, new IRenderFactory<EntityPrehistoricFloraCidaroida>() {
        @Override
        public Render<? super EntityPrehistoricFloraCidaroida> createRenderFor(RenderManager manager) {
                return new RenderCidaroida(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraArchaeocidaris.class, new IRenderFactory<EntityPrehistoricFloraArchaeocidaris>() {
        @Override
        public Render<? super EntityPrehistoricFloraArchaeocidaris> createRenderFor(RenderManager manager) {
                return new RenderArchaeocidaris(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraCeratodus.class, new IRenderFactory<EntityPrehistoricFloraCeratodus>() {
            @Override
            public Render<? super EntityPrehistoricFloraCeratodus> createRenderFor(RenderManager manager) {
                return new RenderCeratodus(manager);
            }
        });


            //Tile Entities Ediacaran (etc):
        if (LepidodendronConfig.renderAnimations) {
            //Ediacaran:
            ClientRegistry.bindTileEntitySpecialRenderer(BlockCharnia.TileEntityCustom.class, new RenderCharnia());
            ClientRegistry.bindTileEntitySpecialRenderer(BlockCharniodiscus.TileEntityCustom.class, new RenderCharniodiscus());
            ClientRegistry.bindTileEntitySpecialRenderer(BlockArborea.TileEntityCustom.class, new RenderArborea());
            ClientRegistry.bindTileEntitySpecialRenderer(BlockBomakellia.TileEntityCustom.class, new RenderBomakellia());
            ClientRegistry.bindTileEntitySpecialRenderer(BlockPambikalbae.TileEntityCustom.class, new RenderPambikalbae());
            ClientRegistry.bindTileEntitySpecialRenderer(BlockPrimocandelabrum1.TileEntityCustom.class, new RenderPrimocandelabrum1());
            ClientRegistry.bindTileEntitySpecialRenderer(BlockPrimocandelabrum2.TileEntityCustom.class, new RenderPrimocandelabrum2());
            ClientRegistry.bindTileEntitySpecialRenderer(BlockParviscopa.TileEntityCustom.class, new RenderParviscopa());
            ClientRegistry.bindTileEntitySpecialRenderer(BlockFunisia.TileEntityCustom.class, new RenderFunisia());
            ClientRegistry.bindTileEntitySpecialRenderer(BlockHapsidophyllas.TileEntityCustom.class, new RenderHapsidophyllas());
            //Cambrian:
            ClientRegistry.bindTileEntitySpecialRenderer(BlockStromatoveris.TileEntityCustom.class, new RenderStromatoveris());
            ClientRegistry.bindTileEntitySpecialRenderer(BlockThaumaptilon.TileEntityCustom.class, new RenderThaumaptilon());
        }

        //These do not have block models available:
        //Ediacaran:
        ClientRegistry.bindTileEntitySpecialRenderer(BlockPteridinium.TileEntityCustom.class, new RenderPteridinium());
        ClientRegistry.bindTileEntitySpecialRenderer(BlockCoronacollina.TileEntityCustom.class, new RenderCoronacollina());
        //Cambrian:
        ClientRegistry.bindTileEntitySpecialRenderer(BlockHerpetogaster.TileEntityCustom.class, new RenderHerpetogaster());
        ClientRegistry.bindTileEntitySpecialRenderer(TileEntityFacivermis.class, new RenderFacivermis());
        ClientRegistry.bindTileEntitySpecialRenderer(BlockOesia.TileEntityCustom.class, new RenderOesia());

        //Tile Entities Nautiloid shells etc:
        ClientRegistry.bindTileEntitySpecialRenderer(BlockFurcaster.TileEntityCustom.class, new RenderFurcasterItem());
        ClientRegistry.bindTileEntitySpecialRenderer(BlockHelianthaster.TileEntityCustom.class, new RenderHelianthasterItem());
        ClientRegistry.bindTileEntitySpecialRenderer(BlockArchaeocidaris.TileEntityCustom.class, new RenderArchaeocidarisItem());
        ClientRegistry.bindTileEntitySpecialRenderer(BlockCidaroida.TileEntityCustom.class, new RenderCidaroidaItem());
        ClientRegistry.bindTileEntitySpecialRenderer(BlockNautiloidShellAmmonite_Asteroceras.TileEntityCustom.class, new RenderNautiloidShellAmmonite_Asteroceras());
        ClientRegistry.bindTileEntitySpecialRenderer(BlockNautiloidShellAmmonite_Ceratites.TileEntityCustom.class, new RenderNautiloidShellAmmonite_Ceratites());
        ClientRegistry.bindTileEntitySpecialRenderer(BlockNautiloidShellAmmonite_Manticoceras.TileEntityCustom.class, new RenderNautiloidShellAmmonite_Manticoceras());
        ClientRegistry.bindTileEntitySpecialRenderer(BlockNautiloidShellAmmonite_Goniatites.TileEntityCustom.class, new RenderNautiloidShellAmmonite_Goniatites());
        ClientRegistry.bindTileEntitySpecialRenderer(BlockNautiloidShellAmmonite_Cylolobus.TileEntityCustom.class, new RenderNautiloidShellAmmonite_Cylolobus());
        ClientRegistry.bindTileEntitySpecialRenderer(BlockNautiloidShellAmmonite_Parapuzosia.TileEntityCustom.class, new RenderNautiloidShellAmmonite_Parapuzosia());
        ClientRegistry.bindTileEntitySpecialRenderer(BlockNautiloidShellAmmonite_Dactylioceras.TileEntityCustom.class, new RenderNautiloidShellAmmonite_Dactylioceras());
        ClientRegistry.bindTileEntitySpecialRenderer(BlockNautiloidShellAmmonite_Titanites.TileEntityCustom.class, new RenderNautiloidShellAmmonite_Titanites());
        ClientRegistry.bindTileEntitySpecialRenderer(BlockNautiloidShellAmmonite_Pachydesmoceras.TileEntityCustom.class, new RenderNautiloidShellAmmonite_Pachydesmoceras());
        ClientRegistry.bindTileEntitySpecialRenderer(BlockNautiloidShellAmmonite_Pachydiscus.TileEntityCustom.class, new RenderNautiloidShellAmmonite_Pachydiscus());
        ClientRegistry.bindTileEntitySpecialRenderer(BlockNautiloidShellAmmonite_Coroniceras.TileEntityCustom.class, new RenderNautiloidShellAmmonite_Coroniceras());
        ClientRegistry.bindTileEntitySpecialRenderer(BlockNautiloidShellAphetoceras.TileEntityCustom.class, new RenderNautiloidShellAphetoceras());
        ClientRegistry.bindTileEntitySpecialRenderer(BlockNautiloidShellBasiloceras.TileEntityCustom.class, new RenderNautiloidShellBasiloceras());
        ClientRegistry.bindTileEntitySpecialRenderer(BlockNautiloidShellCameroceras.TileEntityCustom.class, new RenderNautiloidShellCameroceras());
        ClientRegistry.bindTileEntitySpecialRenderer(BlockNautiloidShellCooperoceras.TileEntityCustom.class, new RenderNautiloidShellCooperoceras());
        ClientRegistry.bindTileEntitySpecialRenderer(BlockNautiloidShellCyrtoceras.TileEntityCustom.class, new RenderNautiloidShellCyrtoceras());
        ClientRegistry.bindTileEntitySpecialRenderer(BlockNautiloidShellDeiroceras.TileEntityCustom.class, new RenderNautiloidShellDeiroceras());
        ClientRegistry.bindTileEntitySpecialRenderer(BlockNautiloidShellEndoceras.TileEntityCustom.class, new RenderNautiloidShellEndoceras());
        ClientRegistry.bindTileEntitySpecialRenderer(BlockNautiloidShellGonioceras.TileEntityCustom.class, new RenderNautiloidShellGonioceras());
        ClientRegistry.bindTileEntitySpecialRenderer(BlockNautiloidShellLituites.TileEntityCustom.class, new RenderNautiloidShellLituites());
        ClientRegistry.bindTileEntitySpecialRenderer(BlockNautiloidShellMooreoceras.TileEntityCustom.class, new RenderNautiloidShellMooreoceras());
        ClientRegistry.bindTileEntitySpecialRenderer(BlockNautiloidShellOrthoceras.TileEntityCustom.class, new RenderNautiloidShellOrthoceras());
        ClientRegistry.bindTileEntitySpecialRenderer(BlockNautiloidShellPhragmoceras.TileEntityCustom.class, new RenderNautiloidShellPhragmoceras());
        ClientRegistry.bindTileEntitySpecialRenderer(BlockNautiloidShellRayonnoceras.TileEntityCustom.class, new RenderNautiloidShellRayonnoceras());
        ClientRegistry.bindTileEntitySpecialRenderer(BlockNautiloidShellTemperoceras.TileEntityCustom.class, new RenderNautiloidShellTemperoceras());
        ClientRegistry.bindTileEntitySpecialRenderer(BlockNautiloidShellVestinautilus.TileEntityCustom.class, new RenderNautiloidShellVestinautilus());

        //Flowers:
        ClientRegistry.bindTileEntitySpecialRenderer(BlockMagnoliaFlower.TileEntityCustom.class, new RenderFlowerMagnolia());
        ClientRegistry.bindTileEntitySpecialRenderer(BlockLiriodendronFlower.TileEntityCustom.class, new RenderFlowerLiriodendron());

        //Rotten log and eggs:
        ClientRegistry.bindTileEntitySpecialRenderer(BlockRottenLog.TileEntityCustom.class, new RenderRottenLog());
        ClientRegistry.bindTileEntitySpecialRenderer(BlockInsectEggsAttercopus.TileEntityCustom.class, new RenderEggsAttercopus());
        ClientRegistry.bindTileEntitySpecialRenderer(BlockInsectEggsEoarthropleura.TileEntityCustom.class, new RenderEggsEoarthropleura());
        ClientRegistry.bindTileEntitySpecialRenderer(BlockInsectEggsPneumodesmus.TileEntityCustom.class, new RenderEggsPneumodesmus());
        ClientRegistry.bindTileEntitySpecialRenderer(BlockInsectEggsTrigonotarbidOS.TileEntityCustom.class, new RenderEggsTrigonotarbidOS());
        ClientRegistry.bindTileEntitySpecialRenderer(BlockInsectEggsTrigonotarbidDev.TileEntityCustom.class, new RenderEggsTrigonotarbidDev());
        ClientRegistry.bindTileEntitySpecialRenderer(BlockInsectEggsTrigonotarbidCarb.TileEntityCustom.class, new RenderEggsTrigonotarbidCarb());
        ClientRegistry.bindTileEntitySpecialRenderer(BlockInsectEggsTrigonotarbidPerm.TileEntityCustom.class, new RenderEggsTrigonotarbidPerm());
        ClientRegistry.bindTileEntitySpecialRenderer(BlockInsectEggsGerarus.TileEntityCustom.class, new RenderEggsGerarus());
        ClientRegistry.bindTileEntitySpecialRenderer(BlockInsectEggsArchoblattina.TileEntityCustom.class, new RenderEggsArchoblattina());
        ClientRegistry.bindTileEntitySpecialRenderer(BlockInsectEggsRoachoidArid.TileEntityCustom.class, new RenderEggsRoachoidArid());
        ClientRegistry.bindTileEntitySpecialRenderer(BlockInsectEggsRoachoidForest.TileEntityCustom.class, new RenderEggsRoachoidForest());
        ClientRegistry.bindTileEntitySpecialRenderer(BlockInsectEggsRoachoidSwamp.TileEntityCustom.class, new RenderEggsRoachoidSwamp());
        ClientRegistry.bindTileEntitySpecialRenderer(BlockInsectEggsHarvestman.TileEntityCustom.class, new RenderEggsHarvestman());
        ClientRegistry.bindTileEntitySpecialRenderer(BlockDollyphyton.TileEntityCustom.class, new RenderDollyphyton());
        ClientRegistry.bindTileEntitySpecialRenderer(BlockEdwardsiphyton.TileEntityCustom.class, new RenderEdwardsiphyton());
        ClientRegistry.bindTileEntitySpecialRenderer(BlockAncientMoss.TileEntityCustom.class, new RenderAncientMoss());
        ClientRegistry.bindTileEntitySpecialRenderer(BlockSelaginella.TileEntityCustom.class, new RenderSelaginella());

        //Nests and land eggs:
        ClientRegistry.bindTileEntitySpecialRenderer(BlockNest.TileEntityCustom.class, new RenderNest());
        ClientRegistry.bindTileEntitySpecialRenderer(BlockEggs.TileEntityCustom.class, new RenderEggsLand());

        //Rope barrier:
        ClientRegistry.bindTileEntitySpecialRenderer(BlockRopeBarrier.TileEntityRopeBarrier.class, new RenderRopeBarrier());

        //Display cases:
        ClientRegistry.bindTileEntitySpecialRenderer(BlockDisplayCase.TileEntityDisplayCase.class, new RenderDisplayCase());
        ClientRegistry.bindTileEntitySpecialRenderer(BlockDisplayCaseMagnifying.TileEntityDisplayCase.class, new RenderDisplayCaseMagnifying());
        ClientRegistry.bindTileEntitySpecialRenderer(BlockDisplayWallMount.TileEntityDisplayWallMount.class, new RenderDisplayWallMount());
        ClientRegistry.bindTileEntitySpecialRenderer(BlockDisplayPlinth.TileEntityDisplayPlinth.class, new RenderDisplayPlinth());

    }
}
