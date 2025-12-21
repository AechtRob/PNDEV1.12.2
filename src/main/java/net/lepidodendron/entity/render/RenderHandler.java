package net.lepidodendron.entity.render;

import net.lepidodendron.LepidodendronConfig;
import net.lepidodendron.block.*;
import net.lepidodendron.entity.*;
import net.lepidodendron.entity.boats.EntityPNBoat;
import net.lepidodendron.entity.boats.EntityRaft;
import net.lepidodendron.entity.boats.PrehistoricFloraSubmarine;
import net.lepidodendron.entity.render.entity.*;
import net.lepidodendron.entity.render.tile.*;
import net.lepidodendron.item.ItemGuanoBall;
import net.lepidodendron.tileentity.TileEntityFacivermis;
import net.lepidodendron.tileentity.TileEntityGangtoucunia;
import net.lepidodendron.tileentity.TileEntityPortalBlock;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.client.renderer.entity.RenderSnowball;
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
//        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraPromissum.class, new IRenderFactory<EntityPrehistoricFloraPromissum>() {
//            @Override
//            public Render<? super EntityPrehistoricFloraPromissum> createRenderFor(RenderManager manager) {
//                return new RenderPromissum(manager);
//            }
//        });
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
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraPalaeodictyoptera.class, new IRenderFactory<EntityPrehistoricFloraPalaeodictyoptera>() {
            @Override
            public Render<? super EntityPrehistoricFloraPalaeodictyoptera> createRenderFor(RenderManager manager) {
                return new RenderPalaeodictyoptera(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraMyriapod.class, new IRenderFactory<EntityPrehistoricFloraMyriapod>() {
            @Override
            public Render<? super EntityPrehistoricFloraMyriapod> createRenderFor(RenderManager manager) {
                return new RenderMyriapod(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraTitanoptera.class, new IRenderFactory<EntityPrehistoricFloraTitanoptera>() {
            @Override
            public Render<? super EntityPrehistoricFloraTitanoptera> createRenderFor(RenderManager manager) {
                return new RenderTitanoptera(manager);
            }
        });

//        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraPalaeodictyoptera_Dunbaria.class, new IRenderFactory<EntityPrehistoricFloraPalaeodictyoptera_Dunbaria>() {
//            @Override
//            public Render<? super EntityPrehistoricFloraPalaeodictyoptera_Dunbaria> createRenderFor(RenderManager manager) {
//                return new RenderPalaeodictyoptera_Dunbaria(manager);
//            }
//        });
//        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraPalaeodictyoptera_Homaloneura.class, new IRenderFactory<EntityPrehistoricFloraPalaeodictyoptera_Homaloneura>() {
//            @Override
//            public Render<? super EntityPrehistoricFloraPalaeodictyoptera_Homaloneura> createRenderFor(RenderManager manager) {
//                return new RenderPalaeodictyoptera_Homaloneura(manager);
//            }
//        });
//        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraPalaeodictyoptera_Homoioptera.class, new IRenderFactory<EntityPrehistoricFloraPalaeodictyoptera_Homoioptera>() {
//            @Override
//            public Render<? super EntityPrehistoricFloraPalaeodictyoptera_Homoioptera> createRenderFor(RenderManager manager) {
//                return new RenderPalaeodictyoptera_Homoioptera(manager);
//            }
//        });
//        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraPalaeodictyoptera_Lithomantis.class, new IRenderFactory<EntityPrehistoricFloraPalaeodictyoptera_Lithomantis>() {
//            @Override
//            public Render<? super EntityPrehistoricFloraPalaeodictyoptera_Lithomantis> createRenderFor(RenderManager manager) {
//                return new RenderPalaeodictyoptera_Lithomantis(manager);
//            }
//        });
//        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraPalaeodictyoptera_Lycocercus.class, new IRenderFactory<EntityPrehistoricFloraPalaeodictyoptera_Lycocercus>() {
//            @Override
//            public Render<? super EntityPrehistoricFloraPalaeodictyoptera_Lycocercus> createRenderFor(RenderManager manager) {
//                return new RenderPalaeodictyoptera_Lycocercus(manager);
//            }
//        });
//        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraPalaeodictyoptera_Sinodunbaria.class, new IRenderFactory<EntityPrehistoricFloraPalaeodictyoptera_Sinodunbaria>() {
//            @Override
//            public Render<? super EntityPrehistoricFloraPalaeodictyoptera_Sinodunbaria> createRenderFor(RenderManager manager) {
//                return new RenderPalaeodictyoptera_Sinodunbaria(manager);
//            }
//        });
//        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraPalaeodictyoptera_Stenodictya.class, new IRenderFactory<EntityPrehistoricFloraPalaeodictyoptera_Stenodictya>() {
//            @Override
//            public Render<? super EntityPrehistoricFloraPalaeodictyoptera_Stenodictya> createRenderFor(RenderManager manager) {
//                return new RenderPalaeodictyoptera_Stenodictya(manager);
//            }
//        });
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
//        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraPalaeodictyopteraNymphPerm.class, new IRenderFactory<EntityPrehistoricFloraPalaeodictyopteraNymphPerm>() {
//            @Override
//            public Render<? super EntityPrehistoricFloraPalaeodictyopteraNymphPerm> createRenderFor(RenderManager manager) {
//                return new RenderPalaeodictyopteraNymphPerm(manager);
//            }
//        });
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
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraCriocephalosaurus.class, new IRenderFactory<EntityPrehistoricFloraCriocephalosaurus>() {
            @Override
            public Render<? super EntityPrehistoricFloraCriocephalosaurus> createRenderFor(RenderManager manager) {
                return new RenderCriocephalosaurus(manager);
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
//        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraClydagnathus.class, new IRenderFactory<EntityPrehistoricFloraClydagnathus>() {
//            @Override
//            public Render<? super EntityPrehistoricFloraClydagnathus> createRenderFor(RenderManager manager) {
//                return new RenderClydagnathus(manager);
//            }
//        });
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
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraPygopterus.class, new IRenderFactory<EntityPrehistoricFloraPygopterus>() {
        @Override
        public Render<? super EntityPrehistoricFloraPygopterus> createRenderFor(RenderManager manager) {
        return new RenderPygopterus(manager);
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
//        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraTitanopteraGigatitan.class, new IRenderFactory<EntityPrehistoricFloraTitanopteraGigatitan>() {
//        @Override
//        public Render<? super EntityPrehistoricFloraTitanopteraGigatitan> createRenderFor(RenderManager manager) {
//                return new RenderTitanopteraGigatitan(manager);
//            }
//        });
//        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraTitanopteraMesotitan.class, new IRenderFactory<EntityPrehistoricFloraTitanopteraMesotitan>() {
//        @Override
//        public Render<? super EntityPrehistoricFloraTitanopteraMesotitan> createRenderFor(RenderManager manager) {
//                return new RenderTitanopteraMesotitan(manager);
//            }
//        });
//        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraTitanopteraClatrotitan.class, new IRenderFactory<EntityPrehistoricFloraTitanopteraClatrotitan>() {
//        @Override
//        public Render<? super EntityPrehistoricFloraTitanopteraClatrotitan> createRenderFor(RenderManager manager) {
//                return new RenderTitanopteraClatrotitan(manager);
//            }
//        });
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
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraItalophlebiaNymph.class, new IRenderFactory<EntityPrehistoricFloraItalophlebiaNymph>() {
            @Override
            public Render<? super EntityPrehistoricFloraItalophlebiaNymph> createRenderFor(RenderManager manager) {
                return new RenderItalophlebiaNymph(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraSkeemella.class, new IRenderFactory<EntityPrehistoricFloraSkeemella>() {
            @Override
            public Render<? super EntityPrehistoricFloraSkeemella> createRenderFor(RenderManager manager) {
                return new RenderSkeemella(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraBarameda.class, new IRenderFactory<EntityPrehistoricFloraBarameda>() {
            @Override
            public Render<? super EntityPrehistoricFloraBarameda> createRenderFor(RenderManager manager) {
                return new RenderBarameda(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraOrnithoprion.class, new IRenderFactory<EntityPrehistoricFloraOrnithoprion>() {
            @Override
            public Render<? super EntityPrehistoricFloraOrnithoprion> createRenderFor(RenderManager manager) {
                return new RenderOrnithoprion(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraUralichas.class, new IRenderFactory<EntityPrehistoricFloraUralichas>() {
            @Override
            public Render<? super EntityPrehistoricFloraUralichas> createRenderFor(RenderManager manager) {
                return new RenderUralichas(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraOgyginus.class, new IRenderFactory<EntityPrehistoricFloraOgyginus>() {
            @Override
            public Render<? super EntityPrehistoricFloraOgyginus> createRenderFor(RenderManager manager) {
                return new RenderOgyginus(manager);
            }
        });

        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraArctinurus.class, new IRenderFactory<EntityPrehistoricFloraArctinurus>() {
            @Override
            public Render<? super EntityPrehistoricFloraArctinurus> createRenderFor(RenderManager manager) {
                return new RenderArctinurus(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraLonchodomas.class, new IRenderFactory<EntityPrehistoricFloraLonchodomas>() {
            @Override
            public Render<? super EntityPrehistoricFloraLonchodomas> createRenderFor(RenderManager manager) {
                return new RenderLonchodomas(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraAmpyx.class, new IRenderFactory<EntityPrehistoricFloraAmpyx>() {
            @Override
            public Render<? super EntityPrehistoricFloraAmpyx> createRenderFor(RenderManager manager) {
                return new RenderAmpyx(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraHarpes.class, new IRenderFactory<EntityPrehistoricFloraHarpes>() {
            @Override
            public Render<? super EntityPrehistoricFloraHarpes> createRenderFor(RenderManager manager) {
                return new RenderHarpes(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraBohemoharpes.class, new IRenderFactory<EntityPrehistoricFloraBohemoharpes>() {
            @Override
            public Render<? super EntityPrehistoricFloraBohemoharpes> createRenderFor(RenderManager manager) {
                return new RenderBohemoharpes(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraTorpedaspis.class, new IRenderFactory<EntityPrehistoricFloraTorpedaspis>() {
            @Override
            public Render<? super EntityPrehistoricFloraTorpedaspis> createRenderFor(RenderManager manager) {
                return new RenderTorpedaspis(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraCassinoceras.class, new IRenderFactory<EntityPrehistoricFloraCassinoceras>() {
            @Override
            public Render<? super EntityPrehistoricFloraCassinoceras> createRenderFor(RenderManager manager) {
                return new RenderCassinoceras(manager);
            }
        });
//        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraAscoceras_Baby.class, new IRenderFactory<EntityPrehistoricFloraAscoceras_Baby>() {
//            @Override
//            public Render<? super EntityPrehistoricFloraAscoceras_Baby> createRenderFor(RenderManager manager) {
//                return new RenderAscoceras_Baby(manager);
//            }
//        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraAscoceras.class, new IRenderFactory<EntityPrehistoricFloraAscoceras>() {
            @Override
            public Render<? super EntityPrehistoricFloraAscoceras> createRenderFor(RenderManager manager) {
                return new RenderAscoceras(manager);
            }
        });

        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraWingertshellicus.class, new IRenderFactory<EntityPrehistoricFloraWingertshellicus>() {
            @Override
            public Render<? super EntityPrehistoricFloraWingertshellicus> createRenderFor(RenderManager manager) {
                return new RenderWingertshellicus(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraWeinbergina.class, new IRenderFactory<EntityPrehistoricFloraWeinbergina>() {
            @Override
            public Render<? super EntityPrehistoricFloraWeinbergina> createRenderFor(RenderManager manager) {
                return new RenderWeinbergina(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraFadeniaPermotriassic.class, new IRenderFactory<EntityPrehistoricFloraFadeniaPermotriassic>() {
            @Override
            public Render<? super EntityPrehistoricFloraFadeniaPermotriassic> createRenderFor(RenderManager manager) {
                return new RenderFadeniaPermotriassic(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraFadeniaCarboniferous.class, new IRenderFactory<EntityPrehistoricFloraFadeniaCarboniferous>() {
            @Override
            public Render<? super EntityPrehistoricFloraFadeniaCarboniferous> createRenderFor(RenderManager manager) {
                return new RenderFadeniaCarboniferous(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraPlectodiscus.class, new IRenderFactory<EntityPrehistoricFloraPlectodiscus>() {
            @Override
            public Render<? super EntityPrehistoricFloraPlectodiscus> createRenderFor(RenderManager manager) {
                return new RenderPlectodiscus(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraFlagellopantopus.class, new IRenderFactory<EntityPrehistoricFloraFlagellopantopus>() {
            @Override
            public Render<? super EntityPrehistoricFloraFlagellopantopus> createRenderFor(RenderManager manager) {
                return new RenderFlagellopantopus(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraNahecaris.class, new IRenderFactory<EntityPrehistoricFloraNahecaris>() {
            @Override
            public Render<? super EntityPrehistoricFloraNahecaris> createRenderFor(RenderManager manager) {
                return new RenderNahecaris(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraChotecops.class, new IRenderFactory<EntityPrehistoricFloraChotecops>() {
            @Override
            public Render<? super EntityPrehistoricFloraChotecops> createRenderFor(RenderManager manager) {
                return new RenderChotecops(manager);
            }
        });

        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraArduafrons.class, new IRenderFactory<EntityPrehistoricFloraArduafrons>() {
            @Override
            public Render<? super EntityPrehistoricFloraArduafrons> createRenderFor(RenderManager manager) {
                return new RenderArduafrons(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraMacromesodon.class, new IRenderFactory<EntityPrehistoricFloraMacromesodon>() {
            @Override
            public Render<? super EntityPrehistoricFloraMacromesodon> createRenderFor(RenderManager manager) {
                return new RenderMacromesodon(manager);
            }
        });

        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraOphthalmosaurus.class, new IRenderFactory<EntityPrehistoricFloraOphthalmosaurus>() {
            @Override
            public Render<? super EntityPrehistoricFloraOphthalmosaurus> createRenderFor(RenderManager manager) {
                return new RenderOphthalmosaurus(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraAphnelepis.class, new IRenderFactory<EntityPrehistoricFloraAphnelepis>() {
            @Override
            public Render<? super EntityPrehistoricFloraAphnelepis> createRenderFor(RenderManager manager) {
                return new RenderAphnelepis(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraAetheolepis.class, new IRenderFactory<EntityPrehistoricFloraAetheolepis>() {
            @Override
            public Render<? super EntityPrehistoricFloraAetheolepis> createRenderFor(RenderManager manager) {
                return new RenderAetheolepis(manager);
            }
        });
   
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraEryon.class, new IRenderFactory<EntityPrehistoricFloraEryon>() {
            @Override
            public Render<? super EntityPrehistoricFloraEryon> createRenderFor(RenderManager manager) {
                return new RenderEryon(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraNotidanoides.class, new IRenderFactory<EntityPrehistoricFloraNotidanoides>() {
            @Override
            public Render<? super EntityPrehistoricFloraNotidanoides> createRenderFor(RenderManager manager) {
                return new RenderNotidanoides(manager);
            }
        });

        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraAspidorhynchus.class, new IRenderFactory<EntityPrehistoricFloraAspidorhynchus>() {
            @Override
            public Render<? super EntityPrehistoricFloraAspidorhynchus> createRenderFor(RenderManager manager) {
                return new RenderAspidorhynchus(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraSaltriovenator.class, new IRenderFactory<EntityPrehistoricFloraSaltriovenator>() {
            @Override
            public Render<? super EntityPrehistoricFloraSaltriovenator> createRenderFor(RenderManager manager) {
                return new RenderSaltriovenator(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraMegalosaurus.class, new IRenderFactory<EntityPrehistoricFloraMegalosaurus>() {
            @Override
            public Render<? super EntityPrehistoricFloraMegalosaurus> createRenderFor(RenderManager manager) {
                return new RenderMegalosaurus(manager);
            }
        });

        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraBalhuticaris.class, new IRenderFactory<EntityPrehistoricFloraBalhuticaris>() {
            @Override
            public Render<? super EntityPrehistoricFloraBalhuticaris> createRenderFor(RenderManager manager) {
                return new RenderBalhuticaris(manager);
            }
        });



        

        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraNeeyambaspis.class, new IRenderFactory<EntityPrehistoricFloraNeeyambaspis>() {
            @Override
            public Render<? super EntityPrehistoricFloraNeeyambaspis> createRenderFor(RenderManager manager) {
                return new RenderNeeyambaspis(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraPituriaspis.class, new IRenderFactory<EntityPrehistoricFloraPituriaspis>() {
            @Override
            public Render<? super EntityPrehistoricFloraPituriaspis> createRenderFor(RenderManager manager) {
                return new RenderPituriaspis(manager);
            }
        });


        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraDunyu.class, new IRenderFactory<EntityPrehistoricFloraDunyu>() {
            @Override
            public Render<? super EntityPrehistoricFloraDunyu> createRenderFor(RenderManager manager) {
                return new RenderDunyu(manager);
            }
        });

        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraLasanius.class, new IRenderFactory<EntityPrehistoricFloraLasanius>() {
            @Override
            public Render<? super EntityPrehistoricFloraLasanius> createRenderFor(RenderManager manager) {
                return new RenderLasanius(manager);
            }
        });
        
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraBundenbachiellus.class, new IRenderFactory<EntityPrehistoricFloraBundenbachiellus>() {
            @Override
            public Render<? super EntityPrehistoricFloraBundenbachiellus> createRenderFor(RenderManager manager) {
                return new RenderBundenbachiellus(manager);
            }
        });

        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraIvoites.class, new IRenderFactory<EntityPrehistoricFloraIvoites>() {
            @Override
            public Render<? super EntityPrehistoricFloraIvoites> createRenderFor(RenderManager manager) {
                return new RenderIvoites(manager);
            }
        });

        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraSphooceras.class, new IRenderFactory<EntityPrehistoricFloraSphooceras>() {
            @Override
            public Render<? super EntityPrehistoricFloraSphooceras> createRenderFor(RenderManager manager) {
                return new RenderSphooceras(manager);
            }
        });


        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraEugaleaspis.class, new IRenderFactory<EntityPrehistoricFloraEugaleaspis>() {
            @Override
            public Render<? super EntityPrehistoricFloraEugaleaspis> createRenderFor(RenderManager manager) {
                return new RenderEugaleaspis(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraEastmanosteus.class, new IRenderFactory<EntityPrehistoricFloraEastmanosteus>() {
            @Override
            public Render<? super EntityPrehistoricFloraEastmanosteus> createRenderFor(RenderManager manager) {
                return new RenderEastmanosteus(manager);
            }
        });

        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraVachonisia.class, new IRenderFactory<EntityPrehistoricFloraVachonisia>() {
            @Override
            public Render<? super EntityPrehistoricFloraVachonisia> createRenderFor(RenderManager manager) {
                return new RenderVachonisia(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraTomlinsonus.class, new IRenderFactory<EntityPrehistoricFloraTomlinsonus>() {
            @Override
            public Render<? super EntityPrehistoricFloraTomlinsonus> createRenderFor(RenderManager manager) {
                return new RenderTomlinsonus(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraFurca.class, new IRenderFactory<EntityPrehistoricFloraFurca>() {
            @Override
            public Render<? super EntityPrehistoricFloraFurca> createRenderFor(RenderManager manager) {
                return new RenderFurca(manager);
            }
        });


        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraMiguashaia.class, new IRenderFactory<EntityPrehistoricFloraMiguashaia>() {
            @Override
            public Render<? super EntityPrehistoricFloraMiguashaia> createRenderFor(RenderManager manager) {
                return new RenderMiguashaia(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraSilurolepis.class, new IRenderFactory<EntityPrehistoricFloraSilurolepis>() {
            @Override
            public Render<? super EntityPrehistoricFloraSilurolepis> createRenderFor(RenderManager manager) {
                return new RenderSilurolepis(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraCometicercus.class, new IRenderFactory<EntityPrehistoricFloraCometicercus>() {
            @Override
            public Render<? super EntityPrehistoricFloraCometicercus> createRenderFor(RenderManager manager) {
                return new RenderCometicercus(manager);
            }
        });

        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraPentecopterus.class, new IRenderFactory<EntityPrehistoricFloraPentecopterus>() {
            @Override
            public Render<? super EntityPrehistoricFloraPentecopterus> createRenderFor(RenderManager manager) {
                return new RenderPentecopterus(manager);
            }
        });

        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraOxyosteus.class, new IRenderFactory<EntityPrehistoricFloraOxyosteus>() {
            @Override
            public Render<? super EntityPrehistoricFloraOxyosteus> createRenderFor(RenderManager manager) {
                return new RenderOxyosteus(manager);
            }
        });

        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraTegeolepis.class, new IRenderFactory<EntityPrehistoricFloraTegeolepis>() {
            @Override
            public Render<? super EntityPrehistoricFloraTegeolepis> createRenderFor(RenderManager manager) {
                return new RenderTegeolepis(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraGooloogongia.class, new IRenderFactory<EntityPrehistoricFloraGooloogongia>() {
            @Override
            public Render<? super EntityPrehistoricFloraGooloogongia> createRenderFor(RenderManager manager) {
                return new RenderGooloogongia(manager);
            }
        });

        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraWarneticaris.class, new IRenderFactory<EntityPrehistoricFloraWarneticaris>() {
            @Override
            public Render<? super EntityPrehistoricFloraWarneticaris> createRenderFor(RenderManager manager) {
                return new RenderWarneticaris(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraSchugurocaris.class, new IRenderFactory<EntityPrehistoricFloraSchugurocaris>() {
            @Override
            public Render<? super EntityPrehistoricFloraSchugurocaris> createRenderFor(RenderManager manager) {
                return new RenderSchugurocaris(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraCeratiocaris.class, new IRenderFactory<EntityPrehistoricFloraCeratiocaris>() {
            @Override
            public Render<? super EntityPrehistoricFloraCeratiocaris> createRenderFor(RenderManager manager) {
                return new RenderCeratiocaris(manager);
            }
        });

        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraDiplacanthus.class, new IRenderFactory<EntityPrehistoricFloraDiplacanthus>() {
            @Override
            public Render<? super EntityPrehistoricFloraDiplacanthus> createRenderFor(RenderManager manager) {
                return new RenderDiplacanthus(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraClimatius.class, new IRenderFactory<EntityPrehistoricFloraClimatius>() {
            @Override
            public Render<? super EntityPrehistoricFloraClimatius> createRenderFor(RenderManager manager) {
                return new RenderClimatius(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraNerepisacanthus.class, new IRenderFactory<EntityPrehistoricFloraNerepisacanthus>() {
            @Override
            public Render<? super EntityPrehistoricFloraNerepisacanthus> createRenderFor(RenderManager manager) {
                return new RenderNerepisacanthus(manager);
            }
        });


        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraGriphognathus.class, new IRenderFactory<EntityPrehistoricFloraGriphognathus>() {
            @Override
            public Render<? super EntityPrehistoricFloraGriphognathus> createRenderFor(RenderManager manager) {
                return new RenderGriphognathus(manager);
            }
        });

        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraConcavicaris.class, new IRenderFactory<EntityPrehistoricFloraConcavicaris>() {
            @Override
            public Render<? super EntityPrehistoricFloraConcavicaris> createRenderFor(RenderManager manager) {
                return new RenderConcavicaris(manager);
            }
        });

        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraGogonasus.class, new IRenderFactory<EntityPrehistoricFloraGogonasus>() {
            @Override
            public Render<? super EntityPrehistoricFloraGogonasus> createRenderFor(RenderManager manager) {
                return new RenderGogonasus(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraFallacosteus.class, new IRenderFactory<EntityPrehistoricFloraFallacosteus>() {
            @Override
            public Render<? super EntityPrehistoricFloraFallacosteus> createRenderFor(RenderManager manager) {
                return new RenderFallacosteus(manager);
            }
        });

        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraRolfosteus.class, new IRenderFactory<EntityPrehistoricFloraRolfosteus>() {
            @Override
            public Render<? super EntityPrehistoricFloraRolfosteus> createRenderFor(RenderManager manager) {
                return new RenderRolfosteus(manager);
            }
        });


        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraCamuropiscis.class, new IRenderFactory<EntityPrehistoricFloraCamuropiscis>() {
            @Override
            public Render<? super EntityPrehistoricFloraCamuropiscis> createRenderFor(RenderManager manager) {
                return new RenderCamuropiscis(manager);
            }
        });

        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraCtenurella.class, new IRenderFactory<EntityPrehistoricFloraCtenurella>() {
            @Override
            public Render<? super EntityPrehistoricFloraCtenurella> createRenderFor(RenderManager manager) {
                return new RenderCtenurella(manager);
            }
        });

        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraRhamphodopsis.class, new IRenderFactory<EntityPrehistoricFloraRhamphodopsis>() {
            @Override
            public Render<? super EntityPrehistoricFloraRhamphodopsis> createRenderFor(RenderManager manager) {
                return new RenderRhamphodopsis(manager);
            }
        });

        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraGoodradigbeeon.class, new IRenderFactory<EntityPrehistoricFloraGoodradigbeeon>() {
            @Override
            public Render<? super EntityPrehistoricFloraGoodradigbeeon> createRenderFor(RenderManager manager) {
                return new RenderGoodradigbeeon(manager);
            }
        });

        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraDraconichthys.class, new IRenderFactory<EntityPrehistoricFloraDraconichthys>() {
            @Override
            public Render<? super EntityPrehistoricFloraDraconichthys> createRenderFor(RenderManager manager) {
                return new RenderDraconichthys(manager);
            }
        });

        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraMaterpiscis.class, new IRenderFactory<EntityPrehistoricFloraMaterpiscis>() {
            @Override
            public Render<? super EntityPrehistoricFloraMaterpiscis> createRenderFor(RenderManager manager) {
                return new RenderMaterpiscis(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraMicrobrachius.class, new IRenderFactory<EntityPrehistoricFloraMicrobrachius>() {
            @Override
            public Render<? super EntityPrehistoricFloraMicrobrachius> createRenderFor(RenderManager manager) {
                return new RenderMicrobrachius(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraBrindabellaspis.class, new IRenderFactory<EntityPrehistoricFloraBrindabellaspis>() {
            @Override
            public Render<? super EntityPrehistoricFloraBrindabellaspis> createRenderFor(RenderManager manager) {
                return new RenderBrindabellaspis(manager);
            }
        });

        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraWuttagoonaspis.class, new IRenderFactory<EntityPrehistoricFloraWuttagoonaspis>() {
            @Override
            public Render<? super EntityPrehistoricFloraWuttagoonaspis> createRenderFor(RenderManager manager) {
                return new RenderWuttagoonaspis(manager);
            }
        });

        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraKujdanowiaspis.class, new IRenderFactory<EntityPrehistoricFloraKujdanowiaspis>() {
            @Override
            public Render<? super EntityPrehistoricFloraKujdanowiaspis> createRenderFor(RenderManager manager) {
                return new RenderKujdanowiaspis(manager);
            }
        });

        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraPhyllolepis.class, new IRenderFactory<EntityPrehistoricFloraPhyllolepis>() {
            @Override
            public Render<? super EntityPrehistoricFloraPhyllolepis> createRenderFor(RenderManager manager) {
                return new RenderPhyllolepis(manager);
            }
        });

        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraCowralepis.class, new IRenderFactory<EntityPrehistoricFloraCowralepis>() {
            @Override
            public Render<? super EntityPrehistoricFloraCowralepis> createRenderFor(RenderManager manager) {
                return new RenderCowralepis(manager);
            }
        });


        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraGymnotrachelus.class, new IRenderFactory<EntityPrehistoricFloraGymnotrachelus>() {
            @Override
            public Render<? super EntityPrehistoricFloraGymnotrachelus> createRenderFor(RenderManager manager) {
                return new RenderGymnotrachelus(manager);
            }
        });

        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraBungartius.class, new IRenderFactory<EntityPrehistoricFloraBungartius>() {
            @Override
            public Render<? super EntityPrehistoricFloraBungartius> createRenderFor(RenderManager manager) {
                return new RenderBungartius(manager);
            }
        });


        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraRhadinacanthus.class, new IRenderFactory<EntityPrehistoricFloraRhadinacanthus>() {
            @Override
            public Render<? super EntityPrehistoricFloraRhadinacanthus> createRenderFor(RenderManager manager) {
                return new RenderRhadinacanthus(manager);
            }
        });

        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraThrissops.class, new IRenderFactory<EntityPrehistoricFloraThrissops>() {
            @Override
            public Render<? super EntityPrehistoricFloraThrissops> createRenderFor(RenderManager manager) {
                return new RenderThrissops(manager);
            }
        });


        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraMuensterella.class, new IRenderFactory<EntityPrehistoricFloraMuensterella>() {
            @Override
            public Render<? super EntityPrehistoricFloraMuensterella> createRenderFor(RenderManager manager) {
                return new RenderMuensterella(manager);
            }
        });
        
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraBelonostomusJurassic.class, new IRenderFactory<EntityPrehistoricFloraBelonostomusJurassic>() {
            @Override
            public Render<? super EntityPrehistoricFloraBelonostomusJurassic> createRenderFor(RenderManager manager) {
                return new RenderBelonostomusJurassic(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraBelonostomusCretaceous.class, new IRenderFactory<EntityPrehistoricFloraBelonostomusCretaceous>() {
            @Override
            public Render<? super EntityPrehistoricFloraBelonostomusCretaceous> createRenderFor(RenderManager manager) {
                return new RenderBelonostomusCretaceous(manager);
            }
        });

         
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraAsteracanthus.class, new IRenderFactory<EntityPrehistoricFloraAsteracanthus>() {
            @Override
            public Render<? super EntityPrehistoricFloraAsteracanthus> createRenderFor(RenderManager manager) {
                return new RenderAsteracanthus(manager);
            }
        });

        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraTurboscinetes.class, new IRenderFactory<EntityPrehistoricFloraTurboscinetes>() {
            @Override
            public Render<? super EntityPrehistoricFloraTurboscinetes> createRenderFor(RenderManager manager) {
                return new RenderTurboscinetes(manager);
            }
        });

        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraLeptolepis.class, new IRenderFactory<EntityPrehistoricFloraLeptolepis>() {
            @Override
            public Render<? super EntityPrehistoricFloraLeptolepis> createRenderFor(RenderManager manager) {
                return new RenderLeptolepis(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraRedfieldius.class, new IRenderFactory<EntityPrehistoricFloraRedfieldius>() {
            @Override
            public Render<? super EntityPrehistoricFloraRedfieldius> createRenderFor(RenderManager manager) {
                return new RenderRedfieldius(manager);
            }
        });

        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraLepidotes.class, new IRenderFactory<EntityPrehistoricFloraLepidotes>() {
            @Override
            public Render<? super EntityPrehistoricFloraLepidotes> createRenderFor(RenderManager manager) {
                return new RenderLepidotes(manager);
            }
        });


        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraDollocaris.class, new IRenderFactory<EntityPrehistoricFloraDollocaris>() {
            @Override
            public Render<? super EntityPrehistoricFloraDollocaris> createRenderFor(RenderManager manager) {
                return new RenderDollocaris(manager);
            }
        });

        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraPiranhamesodon.class, new IRenderFactory<EntityPrehistoricFloraPiranhamesodon>() {
            @Override
            public Render<? super EntityPrehistoricFloraPiranhamesodon> createRenderFor(RenderManager manager) {
                return new RenderPiranhamesodon(manager);
            }
        });


        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraYinlong.class, new IRenderFactory<EntityPrehistoricFloraYinlong>() {
            @Override
            public Render<? super EntityPrehistoricFloraYinlong> createRenderFor(RenderManager manager) {
                return new RenderYinlong(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraXuanhuaceratops.class, new IRenderFactory<EntityPrehistoricFloraXuanhuaceratops>() {
            @Override
            public Render<? super EntityPrehistoricFloraXuanhuaceratops> createRenderFor(RenderManager manager) {
                return new RenderXuanhuaceratops(manager);
            }
        });

        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraKentrosaurus.class, new IRenderFactory<EntityPrehistoricFloraKentrosaurus>() {
            @Override
            public Render<? super EntityPrehistoricFloraKentrosaurus> createRenderFor(RenderManager manager) {
                return new RenderKentrosaurus(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraStethacanthus.class, new IRenderFactory<EntityPrehistoricFloraStethacanthus>() {
            @Override
            public Render<? super EntityPrehistoricFloraStethacanthus> createRenderFor(RenderManager manager) {
                return new RenderStethacanthus(manager);
            }
        });

        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraDryosaurus.class, new IRenderFactory<EntityPrehistoricFloraDryosaurus>() {
            @Override
            public Render<? super EntityPrehistoricFloraDryosaurus> createRenderFor(RenderManager manager) {
                return new RenderDryosaurus(manager);
            }
        });

        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraDysalotosaurus.class, new IRenderFactory<EntityPrehistoricFloraDysalotosaurus>() {
            @Override
            public Render<? super EntityPrehistoricFloraDysalotosaurus> createRenderFor(RenderManager manager) {
                return new RenderDysalotosaurus(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraHualianceratops.class, new IRenderFactory<EntityPrehistoricFloraHualianceratops>() {
            @Override
            public Render<? super EntityPrehistoricFloraHualianceratops> createRenderFor(RenderManager manager) {
                return new RenderHualianceratops(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraChaoyangsaurus.class, new IRenderFactory<EntityPrehistoricFloraChaoyangsaurus>() {
            @Override
            public Render<? super EntityPrehistoricFloraChaoyangsaurus> createRenderFor(RenderManager manager) {
                return new RenderChaoyangsaurus(manager);
            }
        });

        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraPanguraptor.class, new IRenderFactory<EntityPrehistoricFloraPanguraptor>() {
            @Override
            public Render<? super EntityPrehistoricFloraPanguraptor> createRenderFor(RenderManager manager) {
                return new RenderPanguraptor(manager);
            }
        });

        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraMixosaurus.class, new IRenderFactory<EntityPrehistoricFloraMixosaurus>() {
            @Override
            public Render<? super EntityPrehistoricFloraMixosaurus> createRenderFor(RenderManager manager) {
                return new RenderMixosaurus(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraMegamastax.class, new IRenderFactory<EntityPrehistoricFloraMegamastax>() {
            @Override
            public Render<? super EntityPrehistoricFloraMegamastax> createRenderFor(RenderManager manager) {
                return new RenderMegamastax(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraMyriacantherpestes.class, new IRenderFactory<EntityPrehistoricFloraMyriacantherpestes>() {
            @Override
            public Render<? super EntityPrehistoricFloraMyriacantherpestes> createRenderFor(RenderManager manager) {
                return new RenderMyriacantherpestes(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraSclerodus.class, new IRenderFactory<EntityPrehistoricFloraSclerodus>() {
            @Override
            public Render<? super EntityPrehistoricFloraSclerodus> createRenderFor(RenderManager manager) {
                return new RenderSclerodus(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraGuiyu.class, new IRenderFactory<EntityPrehistoricFloraGuiyu>() {
            @Override
            public Render<? super EntityPrehistoricFloraGuiyu> createRenderFor(RenderManager manager) {
                return new RenderGuiyu(manager);
            }
        });

        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraAthenaegis.class, new IRenderFactory<EntityPrehistoricFloraAthenaegis>() {
            @Override
            public Render<? super EntityPrehistoricFloraAthenaegis> createRenderFor(RenderManager manager) {
                return new RenderAthenaegis(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraPolybranchiaspis.class, new IRenderFactory<EntityPrehistoricFloraPolybranchiaspis>() {
            @Override
            public Render<? super EntityPrehistoricFloraPolybranchiaspis> createRenderFor(RenderManager manager) {
                return new RenderPolybranchiaspis(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraParameteoraspis.class, new IRenderFactory<EntityPrehistoricFloraParameteoraspis>() {
            @Override
            public Render<? super EntityPrehistoricFloraParameteoraspis> createRenderFor(RenderManager manager) {
                return new RenderParameteoraspis(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraTauraspis.class, new IRenderFactory<EntityPrehistoricFloraTauraspis>() {
            @Override
            public Render<? super EntityPrehistoricFloraTauraspis> createRenderFor(RenderManager manager) {
                return new RenderTauraspis(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraGyrosteus.class, new IRenderFactory<EntityPrehistoricFloraGyrosteus>() {
            @Override
            public Render<? super EntityPrehistoricFloraGyrosteus> createRenderFor(RenderManager manager) {
                return new RenderGyrosteus(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraPhialaspis.class, new IRenderFactory<EntityPrehistoricFloraPhialaspis>() {
            @Override
            public Render<? super EntityPrehistoricFloraPhialaspis> createRenderFor(RenderManager manager) {
                return new RenderPhialaspis(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraPhlebolepis.class, new IRenderFactory<EntityPrehistoricFloraPhlebolepis>() {
            @Override
            public Render<? super EntityPrehistoricFloraPhlebolepis> createRenderFor(RenderManager manager) {
                return new RenderPhlebolepis(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraSqualoraja.class, new IRenderFactory<EntityPrehistoricFloraSqualoraja>() {
            @Override
            public Render<? super EntityPrehistoricFloraSqualoraja> createRenderFor(RenderManager manager) {
                return new RenderSqualoraja(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraGyrodus.class, new IRenderFactory<EntityPrehistoricFloraGyrodus>() {
            @Override
            public Render<? super EntityPrehistoricFloraGyrodus> createRenderFor(RenderManager manager) {
                return new RenderGyrodus(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraJamoytius.class, new IRenderFactory<EntityPrehistoricFloraJamoytius>() {
            @Override
            public Render<? super EntityPrehistoricFloraJamoytius> createRenderFor(RenderManager manager) {
                return new RenderJamoytius(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraPezopallichthys.class, new IRenderFactory<EntityPrehistoricFloraPezopallichthys>() {
            @Override
            public Render<? super EntityPrehistoricFloraPezopallichthys> createRenderFor(RenderManager manager) {
                return new RenderPezopallichthys(manager);
            }
        });

        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraTamisiocaris.class, new IRenderFactory<EntityPrehistoricFloraTamisiocaris>() {
            @Override
            public Render<? super EntityPrehistoricFloraTamisiocaris> createRenderFor(RenderManager manager) {
                return new RenderTamisiocaris(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraSanctacaris.class, new IRenderFactory<EntityPrehistoricFloraSanctacaris>() {
            @Override
            public Render<? super EntityPrehistoricFloraSanctacaris> createRenderFor(RenderManager manager) {
                return new RenderSanctacaris(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraGreererpeton.class, new IRenderFactory<EntityPrehistoricFloraGreererpeton>() {
            @Override
            public Render<? super EntityPrehistoricFloraGreererpeton> createRenderFor(RenderManager manager) {
                return new RenderGreererpeton(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraCordaticaris.class, new IRenderFactory<EntityPrehistoricFloraCordaticaris>() {
            @Override
            public Render<? super EntityPrehistoricFloraCordaticaris> createRenderFor(RenderManager manager) {
                return new RenderCordaticaris(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraZenaspis.class, new IRenderFactory<EntityPrehistoricFloraZenaspis>() {
            @Override
            public Render<? super EntityPrehistoricFloraZenaspis> createRenderFor(RenderManager manager) {
                return new RenderZenaspis(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraAngustidontus.class, new IRenderFactory<EntityPrehistoricFloraAngustidontus>() {
            @Override
            public Render<? super EntityPrehistoricFloraAngustidontus> createRenderFor(RenderManager manager) {
                return new RenderAngustidontus(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraParamblypterus.class, new IRenderFactory<EntityPrehistoricFloraParamblypterus>() {
            @Override
            public Render<? super EntityPrehistoricFloraParamblypterus> createRenderFor(RenderManager manager) {
                return new RenderParamblypterus(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraHurdia.class, new IRenderFactory<EntityPrehistoricFloraHurdia>() {
            @Override
            public Render<? super EntityPrehistoricFloraHurdia> createRenderFor(RenderManager manager) {
                return new RenderHurdia(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraCaryosyntrips.class, new IRenderFactory<EntityPrehistoricFloraCaryosyntrips>() {
            @Override
            public Render<? super EntityPrehistoricFloraCaryosyntrips> createRenderFor(RenderManager manager) {
                return new RenderCaryosyntrips(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraLepidaster.class, new IRenderFactory<EntityPrehistoricFloraLepidaster>() {
            @Override
            public Render<? super EntityPrehistoricFloraLepidaster> createRenderFor(RenderManager manager) {
                return new RenderLepidaster(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraVillebrunaster.class, new IRenderFactory<EntityPrehistoricFloraVillebrunaster>() {
            @Override
            public Render<? super EntityPrehistoricFloraVillebrunaster> createRenderFor(RenderManager manager) {
                return new RenderVillebrunaster(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraDecacuminaster.class, new IRenderFactory<EntityPrehistoricFloraDecacuminaster>() {
            @Override
            public Render<? super EntityPrehistoricFloraDecacuminaster> createRenderFor(RenderManager manager) {
                return new RenderDecacuminaster(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraDicranurus.class, new IRenderFactory<EntityPrehistoricFloraDicranurus>() {
            @Override
            public Render<? super EntityPrehistoricFloraDicranurus> createRenderFor(RenderManager manager) {
                return new RenderDicranurus(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraThanahita.class, new IRenderFactory<EntityPrehistoricFloraThanahita>() {
            @Override
            public Render<? super EntityPrehistoricFloraThanahita> createRenderFor(RenderManager manager) {
                return new RenderThanahita(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraPsychopyge.class, new IRenderFactory<EntityPrehistoricFloraPsychopyge>() {
            @Override
            public Render<? super EntityPrehistoricFloraPsychopyge> createRenderFor(RenderManager manager) {
                return new RenderPsychopyge(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraSaccocoma.class, new IRenderFactory<EntityPrehistoricFloraSaccocoma>() {
            @Override
            public Render<? super EntityPrehistoricFloraSaccocoma> createRenderFor(RenderManager manager) {
                return new RenderSaccocoma(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraVampyronassa.class, new IRenderFactory<EntityPrehistoricFloraVampyronassa>() {
            @Override
            public Render<? super EntityPrehistoricFloraVampyronassa> createRenderFor(RenderManager manager) {
                return new RenderVampyronassa(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraProteroctopus.class, new IRenderFactory<EntityPrehistoricFloraProteroctopus>() {
            @Override
            public Render<? super EntityPrehistoricFloraProteroctopus> createRenderFor(RenderManager manager) {
                return new RenderProteroctopus(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraKosmoceras.class, new IRenderFactory<EntityPrehistoricFloraKosmoceras>() {
            @Override
            public Render<? super EntityPrehistoricFloraKosmoceras> createRenderFor(RenderManager manager) {
                return new RenderKosmoceras(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraElephantoceras.class, new IRenderFactory<EntityPrehistoricFloraElephantoceras>() {
            @Override
            public Render<? super EntityPrehistoricFloraElephantoceras> createRenderFor(RenderManager manager) {
                return new RenderElephantoceras(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraAnaethalion.class, new IRenderFactory<EntityPrehistoricFloraAnaethalion>() {
            @Override
            public Render<? super EntityPrehistoricFloraAnaethalion> createRenderFor(RenderManager manager) {
                return new RenderAnaethalion(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraElasmodectes.class, new IRenderFactory<EntityPrehistoricFloraElasmodectes>() {
            @Override
            public Render<? super EntityPrehistoricFloraElasmodectes> createRenderFor(RenderManager manager) {
                return new RenderElasmodectes(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraQuasimodichthys.class, new IRenderFactory<EntityPrehistoricFloraQuasimodichthys>() {
            @Override
            public Render<? super EntityPrehistoricFloraQuasimodichthys> createRenderFor(RenderManager manager) {
                return new RenderQuasimodichthys(manager);
            }
        });
        
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraRainerichthys.class, new IRenderFactory<EntityPrehistoricFloraRainerichthys>() {
            @Override
            public Render<? super EntityPrehistoricFloraRainerichthys> createRenderFor(RenderManager manager) {
                return new RenderRainerichthys(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraPromexyele.class, new IRenderFactory<EntityPrehistoricFloraPromexyele>() {
            @Override
            public Render<? super EntityPrehistoricFloraPromexyele> createRenderFor(RenderManager manager) {
                return new RenderPromexyele(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraPapilionichthys.class, new IRenderFactory<EntityPrehistoricFloraPapilionichthys>() {
            @Override
            public Render<? super EntityPrehistoricFloraPapilionichthys> createRenderFor(RenderManager manager) {
                return new RenderPapilionichthys(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraHovasaurus.class, new IRenderFactory<EntityPrehistoricFloraHovasaurus>() {
            @Override
            public Render<? super EntityPrehistoricFloraHovasaurus> createRenderFor(RenderManager manager) {
                return new RenderHovasaurus(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraSibyrhynchus.class, new IRenderFactory<EntityPrehistoricFloraSibyrhynchus>() {
            @Override
            public Render<? super EntityPrehistoricFloraSibyrhynchus> createRenderFor(RenderManager manager) {
                return new RenderSibyrhynchus(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraRutgersella.class, new IRenderFactory<EntityPrehistoricFloraRutgersella>() {
            @Override
            public Render<? super EntityPrehistoricFloraRutgersella> createRenderFor(RenderManager manager) {
                return new RenderRutgersella(manager);
            }
        });

        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraStahleckeria.class, new IRenderFactory<EntityPrehistoricFloraStahleckeria>() {
            @Override
            public Render<? super EntityPrehistoricFloraStahleckeria> createRenderFor(RenderManager manager) {
                return new RenderStahleckeria(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraMarmolatella.class, new IRenderFactory<EntityPrehistoricFloraMarmolatella>() {
            @Override
            public Render<? super EntityPrehistoricFloraMarmolatella> createRenderFor(RenderManager manager) {
                return new RenderMarmolatella(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraViviparus.class, new IRenderFactory<EntityPrehistoricFloraViviparus>() {
            @Override
            public Render<? super EntityPrehistoricFloraViviparus> createRenderFor(RenderManager manager) {
                return new RenderViviparus(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraDuslia.class, new IRenderFactory<EntityPrehistoricFloraDuslia>() {
            @Override
            public Render<? super EntityPrehistoricFloraDuslia> createRenderFor(RenderManager manager) {
                return new RenderDuslia(manager);
            }
        });

        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraCowielepis.class, new IRenderFactory<EntityPrehistoricFloraCowielepis>() {
            @Override
            public Render<? super EntityPrehistoricFloraCowielepis> createRenderFor(RenderManager manager) {
                return new RenderCowielepis(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraDakosaurus.class, new IRenderFactory<EntityPrehistoricFloraDakosaurus>() {
            @Override
            public Render<? super EntityPrehistoricFloraDakosaurus> createRenderFor(RenderManager manager) {
                return new RenderDakosaurus(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraProterosuchus.class, new IRenderFactory<EntityPrehistoricFloraProterosuchus>() {
            @Override
            public Render<? super EntityPrehistoricFloraProterosuchus> createRenderFor(RenderManager manager) {
                return new RenderProterosuchus(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraMurex.class, new IRenderFactory<EntityPrehistoricFloraMurex>() {
            @Override
            public Render<? super EntityPrehistoricFloraMurex> createRenderFor(RenderManager manager) {
                return new RenderMurex(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraNerinea.class, new IRenderFactory<EntityPrehistoricFloraNerinea>() {
            @Override
            public Render<? super EntityPrehistoricFloraNerinea> createRenderFor(RenderManager manager) {
                return new RenderNerinea(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraHarpagodes.class, new IRenderFactory<EntityPrehistoricFloraHarpagodes>() {
            @Override
            public Render<? super EntityPrehistoricFloraHarpagodes> createRenderFor(RenderManager manager) {
                return new RenderHarpagodes(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraLeviathania.class, new IRenderFactory<EntityPrehistoricFloraLeviathania>() {
            @Override
            public Render<? super EntityPrehistoricFloraLeviathania> createRenderFor(RenderManager manager) {
                return new RenderLeviathania(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraMetopacanthus.class, new IRenderFactory<EntityPrehistoricFloraMetopacanthus>() {
            @Override
            public Render<? super EntityPrehistoricFloraMetopacanthus> createRenderFor(RenderManager manager) {
                return new RenderMetopacanthus(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraCancrinos.class, new IRenderFactory<EntityPrehistoricFloraCancrinos>() {
            @Override
            public Render<? super EntityPrehistoricFloraCancrinos> createRenderFor(RenderManager manager) {
                return new RenderCancrinos(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraStrombus.class, new IRenderFactory<EntityPrehistoricFloraStrombus>() {
            @Override
            public Render<? super EntityPrehistoricFloraStrombus> createRenderFor(RenderManager manager) {
                return new RenderStrombus(manager);
            }
        });

        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraBishanopliosaurus.class, new IRenderFactory<EntityPrehistoricFloraBishanopliosaurus>() {
            @Override
            public Render<? super EntityPrehistoricFloraBishanopliosaurus> createRenderFor(RenderManager manager) {
                return new RenderBishanopliosaurus(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraCiurcopterus.class, new IRenderFactory<EntityPrehistoricFloraCiurcopterus>() {
            @Override
            public Render<? super EntityPrehistoricFloraCiurcopterus> createRenderFor(RenderManager manager) {
                return new RenderCiurcopterus(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraSlimonia.class, new IRenderFactory<EntityPrehistoricFloraSlimonia>() {
            @Override
            public Render<? super EntityPrehistoricFloraSlimonia> createRenderFor(RenderManager manager) {
                return new RenderSlimonia(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraPlectronoceras.class, new IRenderFactory<EntityPrehistoricFloraPlectronoceras>() {
            @Override
            public Render<? super EntityPrehistoricFloraPlectronoceras> createRenderFor(RenderManager manager) {
                return new RenderPlectronoceras(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraPlatypeltoides.class, new IRenderFactory<EntityPrehistoricFloraPlatypeltoides>() {
            @Override
            public Render<? super EntityPrehistoricFloraPlatypeltoides> createRenderFor(RenderManager manager) {
                return new RenderPlatypeltoides(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraMegistaspis.class, new IRenderFactory<EntityPrehistoricFloraMegistaspis>() {
            @Override
            public Render<? super EntityPrehistoricFloraMegistaspis> createRenderFor(RenderManager manager) {
                return new RenderMegistaspis(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraHelenodora.class, new IRenderFactory<EntityPrehistoricFloraHelenodora>() {
            @Override
            public Render<? super EntityPrehistoricFloraHelenodora> createRenderFor(RenderManager manager) {
                return new RenderHelenodora(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraTribrachiodemas.class, new IRenderFactory<EntityPrehistoricFloraTribrachiodemas>() {
            @Override
            public Render<? super EntityPrehistoricFloraTribrachiodemas> createRenderFor(RenderManager manager) {
                return new RenderTribrachiodemas(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraPricyclopyge.class, new IRenderFactory<EntityPrehistoricFloraPricyclopyge>() {
            @Override
            public Render<? super EntityPrehistoricFloraPricyclopyge> createRenderFor(RenderManager manager) {
                return new RenderPricyclopyge(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraSymphysops.class, new IRenderFactory<EntityPrehistoricFloraSymphysops>() {
            @Override
            public Render<? super EntityPrehistoricFloraSymphysops> createRenderFor(RenderManager manager) {
                return new RenderSymphysops(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraCarolinites.class, new IRenderFactory<EntityPrehistoricFloraCarolinites>() {
            @Override
            public Render<? super EntityPrehistoricFloraCarolinites> createRenderFor(RenderManager manager) {
                return new RenderCarolinites(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraEuspira.class, new IRenderFactory<EntityPrehistoricFloraEuspira>() {
            @Override
            public Render<? super EntityPrehistoricFloraEuspira> createRenderFor(RenderManager manager) {
                return new RenderEuspira(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraAngelina.class, new IRenderFactory<EntityPrehistoricFloraAngelina>() {
            @Override
            public Render<? super EntityPrehistoricFloraAngelina> createRenderFor(RenderManager manager) {
                return new RenderAngelina(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraHarpacanthus.class, new IRenderFactory<EntityPrehistoricFloraHarpacanthus>() {
            @Override
            public Render<? super EntityPrehistoricFloraHarpacanthus> createRenderFor(RenderManager manager) {
                return new RenderHarpacanthus(manager);
            }
        });

        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraTyphloesus.class, new IRenderFactory<EntityPrehistoricFloraTyphloesus>() {
            @Override
            public Render<? super EntityPrehistoricFloraTyphloesus> createRenderFor(RenderManager manager) {
                return new RenderTyphloesus(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraRhomaleosaurus.class, new IRenderFactory<EntityPrehistoricFloraRhomaleosaurus>() {
            @Override
            public Render<? super EntityPrehistoricFloraRhomaleosaurus> createRenderFor(RenderManager manager) {
                return new RenderRhomaleosaurus(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraGephyrostegus.class, new IRenderFactory<EntityPrehistoricFloraGephyrostegus>() {
            @Override
            public Render<? super EntityPrehistoricFloraGephyrostegus> createRenderFor(RenderManager manager) {
                return new RenderGephyrostegus(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraUtatsusaurus.class, new IRenderFactory<EntityPrehistoricFloraUtatsusaurus>() {
            @Override
            public Render<? super EntityPrehistoricFloraUtatsusaurus> createRenderFor(RenderManager manager) {
                return new RenderUtatsusaurus(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraCongophiopsis.class, new IRenderFactory<EntityPrehistoricFloraCongophiopsis>() {
            @Override
            public Render<? super EntityPrehistoricFloraCongophiopsis> createRenderFor(RenderManager manager) {
                return new RenderCongophiopsis(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraOphiopsis.class, new IRenderFactory<EntityPrehistoricFloraOphiopsis>() {
            @Override
            public Render<? super EntityPrehistoricFloraOphiopsis> createRenderFor(RenderManager manager) {
                return new RenderOphiopsis(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraCiurcopterus.class, new IRenderFactory<EntityPrehistoricFloraCiurcopterus>() {
            @Override
            public Render<? super EntityPrehistoricFloraCiurcopterus> createRenderFor(RenderManager manager) {
                return new RenderCiurcopterus(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraRhenocystis.class, new IRenderFactory<EntityPrehistoricFloraRhenocystis>() {
            @Override
            public Render<? super EntityPrehistoricFloraRhenocystis> createRenderFor(RenderManager manager) {
                return new RenderRhenocystis(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraHupehsuchus.class, new IRenderFactory<EntityPrehistoricFloraHupehsuchus>() {
            @Override
            public Render<? super EntityPrehistoricFloraHupehsuchus> createRenderFor(RenderManager manager) {
                return new RenderHupehsuchus(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraHadronector.class, new IRenderFactory<EntityPrehistoricFloraHadronector>() {
            @Override
            public Render<? super EntityPrehistoricFloraHadronector> createRenderFor(RenderManager manager) {
                return new RenderHadronector(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraPassaloteuthis.class, new IRenderFactory<EntityPrehistoricFloraPassaloteuthis>() {
            @Override
            public Render<? super EntityPrehistoricFloraPassaloteuthis> createRenderFor(RenderManager manager) {
                return new RenderPassaloteuthis(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraMegateuthis.class, new IRenderFactory<EntityPrehistoricFloraMegateuthis>() {
            @Override
            public Render<? super EntityPrehistoricFloraMegateuthis> createRenderFor(RenderManager manager) {
                return new RenderMegateuthis(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraAdamanteryon.class, new IRenderFactory<EntityPrehistoricFloraAdamanteryon>() {
            @Override
            public Render<? super EntityPrehistoricFloraAdamanteryon> createRenderFor(RenderManager manager) {
                return new RenderAdamanteryon(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraScheenstia.class, new IRenderFactory<EntityPrehistoricFloraScheenstia>() {
            @Override
            public Render<? super EntityPrehistoricFloraScheenstia> createRenderFor(RenderManager manager) {
                return new RenderScheenstia(manager);
            }
        });

        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraDragonfly.class, new IRenderFactory<EntityPrehistoricFloraDragonfly>() {
            @Override
            public Render<? super EntityPrehistoricFloraDragonfly> createRenderFor(RenderManager manager) {
                return new RenderDragonfly(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraDragonflyNymph.class, new IRenderFactory<EntityPrehistoricFloraDragonflyNymph>() {
            @Override
            public Render<? super EntityPrehistoricFloraDragonflyNymph> createRenderFor(RenderManager manager) {
                return new RenderDragonflyNymph(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraDendrocystites.class, new IRenderFactory<EntityPrehistoricFloraDendrocystites>() {
            @Override
            public Render<? super EntityPrehistoricFloraDendrocystites> createRenderFor(RenderManager manager) {
                return new RenderDendrocystites(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraSyringocrinus.class, new IRenderFactory<EntityPrehistoricFloraSyringocrinus>() {
            @Override
            public Render<? super EntityPrehistoricFloraSyringocrinus> createRenderFor(RenderManager manager) {
                return new RenderSyringocrinus(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraIowacystis.class, new IRenderFactory<EntityPrehistoricFloraIowacystis>() {
            @Override
            public Render<? super EntityPrehistoricFloraIowacystis> createRenderFor(RenderManager manager) {
                return new RenderIowacystis(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraChunerpeton.class, new IRenderFactory<EntityPrehistoricFloraChunerpeton>() {
            @Override
            public Render<? super EntityPrehistoricFloraChunerpeton> createRenderFor(RenderManager manager) {
                return new RenderChunerpeton(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraDocodon.class, new IRenderFactory<EntityPrehistoricFloraDocodon>() {
            @Override
            public Render<? super EntityPrehistoricFloraDocodon> createRenderFor(RenderManager manager) {
                return new RenderDocodon(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraTemnodontosaurus.class, new IRenderFactory<EntityPrehistoricFloraTemnodontosaurus>() {
            @Override
            public Render<? super EntityPrehistoricFloraTemnodontosaurus> createRenderFor(RenderManager manager) {
                return new RenderTemnodontosaurus(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraHomoeosaurus.class, new IRenderFactory<EntityPrehistoricFloraHomoeosaurus>() {
            @Override
            public Render<? super EntityPrehistoricFloraHomoeosaurus> createRenderFor(RenderManager manager) {
                return new RenderHomoeosaurus(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraPropterus.class, new IRenderFactory<EntityPrehistoricFloraPropterus>() {
            @Override
            public Render<? super EntityPrehistoricFloraPropterus> createRenderFor(RenderManager manager) {
                return new RenderPropterus(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraPseudorhina.class, new IRenderFactory<EntityPrehistoricFloraPseudorhina>() {
            @Override
            public Render<? super EntityPrehistoricFloraPseudorhina> createRenderFor(RenderManager manager) {
                return new RenderPseudorhina(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraPhorcynis.class, new IRenderFactory<EntityPrehistoricFloraPhorcynis>() {
            @Override
            public Render<? super EntityPrehistoricFloraPhorcynis> createRenderFor(RenderManager manager) {
                return new RenderPhorcynis(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraLibys.class, new IRenderFactory<EntityPrehistoricFloraLibys>() {
            @Override
            public Render<? super EntityPrehistoricFloraLibys> createRenderFor(RenderManager manager) {
                return new RenderLibys(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraOreochima.class, new IRenderFactory<EntityPrehistoricFloraOreochima>() {
            @Override
            public Render<? super EntityPrehistoricFloraOreochima> createRenderFor(RenderManager manager) {
                return new RenderOreochima(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraOstenocaris.class, new IRenderFactory<EntityPrehistoricFloraOstenocaris>() {
            @Override
            public Render<? super EntityPrehistoricFloraOstenocaris> createRenderFor(RenderManager manager) {
                return new RenderOstenocaris(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraKalligrammatid.class, new IRenderFactory<EntityPrehistoricFloraKalligrammatid>() {
            @Override
            public Render<? super EntityPrehistoricFloraKalligrammatid> createRenderFor(RenderManager manager) {
                return new RenderKalligrammatid(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraLacewing.class, new IRenderFactory<EntityPrehistoricFloraLacewing>() {
            @Override
            public Render<? super EntityPrehistoricFloraLacewing> createRenderFor(RenderManager manager) {
                return new RenderLacewing(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraKaykay.class, new IRenderFactory<EntityPrehistoricFloraKaykay>() {
            @Override
            public Render<? super EntityPrehistoricFloraKaykay> createRenderFor(RenderManager manager) {
                return new RenderKaykay(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraClarkeiteuthis.class, new IRenderFactory<EntityPrehistoricFloraClarkeiteuthis>() {
            @Override
            public Render<? super EntityPrehistoricFloraClarkeiteuthis> createRenderFor(RenderManager manager) {
                return new RenderClarkeiteuthis(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraGeosaurus.class, new IRenderFactory<EntityPrehistoricFloraGeosaurus>() {
            @Override
            public Render<? super EntityPrehistoricFloraGeosaurus> createRenderFor(RenderManager manager) {
                return new RenderGeosaurus(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraCeratosaurus.class, new IRenderFactory<EntityPrehistoricFloraCeratosaurus>() {
            @Override
            public Render<? super EntityPrehistoricFloraCeratosaurus> createRenderFor(RenderManager manager) {
                return new RenderCeratosaurus(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraKulindadromeus.class, new IRenderFactory<EntityPrehistoricFloraKulindadromeus>() {
            @Override
            public Render<? super EntityPrehistoricFloraKulindadromeus> createRenderFor(RenderManager manager) {
                return new RenderKulindadromeus(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraEchinochimaera.class, new IRenderFactory<EntityPrehistoricFloraEchinochimaera>() {
            @Override
            public Render<? super EntityPrehistoricFloraEchinochimaera> createRenderFor(RenderManager manager) {
                return new RenderEchinochimaera(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraSpiroceras.class, new IRenderFactory<EntityPrehistoricFloraSpiroceras>() {
            @Override
            public Render<? super EntityPrehistoricFloraSpiroceras> createRenderFor(RenderManager manager) {
                return new RenderSpiroceras(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraCenoceras.class, new IRenderFactory<EntityPrehistoricFloraCenoceras>() {
            @Override
            public Render<? super EntityPrehistoricFloraCenoceras> createRenderFor(RenderManager manager) {
                return new RenderCenoceras(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraMorrolepis.class, new IRenderFactory<EntityPrehistoricFloraMorrolepis>() {
            @Override
            public Render<? super EntityPrehistoricFloraMorrolepis> createRenderFor(RenderManager manager) {
                return new RenderMorrolepis(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraCoccoderma.class, new IRenderFactory<EntityPrehistoricFloraCoccoderma>() {
            @Override
            public Render<? super EntityPrehistoricFloraCoccoderma> createRenderFor(RenderManager manager) {
                return new RenderCoccoderma(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraMegasecoptera.class, new IRenderFactory<EntityPrehistoricFloraMegasecoptera>() {
            @Override
            public Render<? super EntityPrehistoricFloraMegasecoptera> createRenderFor(RenderManager manager) {
                return new RenderMegasecoptera(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraMeganeurites.class, new IRenderFactory<EntityPrehistoricFloraMeganeurites>() {
            @Override
            public Render<? super EntityPrehistoricFloraMeganeurites> createRenderFor(RenderManager manager) {
                return new RenderMeganeurites(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraMeganeuritesNymph.class, new IRenderFactory<EntityPrehistoricFloraMeganeuritesNymph>() {
            @Override
            public Render<? super EntityPrehistoricFloraMeganeuritesNymph> createRenderFor(RenderManager manager) {
                return new RenderMeganeuritesNymph(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraTrachymetopon.class, new IRenderFactory<EntityPrehistoricFloraTrachymetopon>() {
            @Override
            public Render<? super EntityPrehistoricFloraTrachymetopon> createRenderFor(RenderManager manager) {
                return new RenderTrachymetopon(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraDaohugoucossus.class, new IRenderFactory<EntityPrehistoricFloraDaohugoucossus>() {
            @Override
            public Render<? super EntityPrehistoricFloraDaohugoucossus> createRenderFor(RenderManager manager) {
                return new RenderDaohugoucossus(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraPanacanthocaris.class, new IRenderFactory<EntityPrehistoricFloraPanacanthocaris>() {
            @Override
            public Render<? super EntityPrehistoricFloraPanacanthocaris> createRenderFor(RenderManager manager) {
                return new RenderPanacanthocaris(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraThalassiodracon.class, new IRenderFactory<EntityPrehistoricFloraThalassiodracon>() {
            @Override
            public Render<? super EntityPrehistoricFloraThalassiodracon> createRenderFor(RenderManager manager) {
                return new RenderThalassiodracon(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraMicrocleidus.class, new IRenderFactory<EntityPrehistoricFloraMicrocleidus>() {
            @Override
            public Render<? super EntityPrehistoricFloraMicrocleidus> createRenderFor(RenderManager manager) {
                return new RenderMicrocleidus(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraOphthalmothule.class, new IRenderFactory<EntityPrehistoricFloraOphthalmothule>() {
            @Override
            public Render<? super EntityPrehistoricFloraOphthalmothule> createRenderFor(RenderManager manager) {
                return new RenderOphthalmothule(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraBobosaurus.class, new IRenderFactory<EntityPrehistoricFloraBobosaurus>() {
            @Override
            public Render<? super EntityPrehistoricFloraBobosaurus> createRenderFor(RenderManager manager) {
                return new RenderBobosaurus(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraEocarcinus.class, new IRenderFactory<EntityPrehistoricFloraEocarcinus>() {
            @Override
            public Render<? super EntityPrehistoricFloraEocarcinus> createRenderFor(RenderManager manager) {
                return new RenderEocarcinus(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraEurhinosaurus.class, new IRenderFactory<EntityPrehistoricFloraEurhinosaurus>() {
            @Override
            public Render<? super EntityPrehistoricFloraEurhinosaurus> createRenderFor(RenderManager manager) {
                return new RenderEurhinosaurus(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraOrthocormus.class, new IRenderFactory<EntityPrehistoricFloraOrthocormus>() {
            @Override
            public Render<? super EntityPrehistoricFloraOrthocormus> createRenderFor(RenderManager manager) {
                return new RenderOrthocormus(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraUarbryichthys.class, new IRenderFactory<EntityPrehistoricFloraUarbryichthys>() {
            @Override
            public Render<? super EntityPrehistoricFloraUarbryichthys> createRenderFor(RenderManager manager) {
                return new RenderUarbryichthys(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraParnaibaia.class, new IRenderFactory<EntityPrehistoricFloraParnaibaia>() {
            @Override
            public Render<? super EntityPrehistoricFloraParnaibaia> createRenderFor(RenderManager manager) {
                return new RenderParnaibaia(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraPalaeocarcharias.class, new IRenderFactory<EntityPrehistoricFloraPalaeocarcharias>() {
            @Override
            public Render<? super EntityPrehistoricFloraPalaeocarcharias> createRenderFor(RenderManager manager) {
                return new RenderPalaeocarcharias(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraProtospinax.class, new IRenderFactory<EntityPrehistoricFloraProtospinax>() {
            @Override
            public Render<? super EntityPrehistoricFloraProtospinax> createRenderFor(RenderManager manager) {
                return new RenderProtospinax(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraIsanichthys.class, new IRenderFactory<EntityPrehistoricFloraIsanichthys>() {
            @Override
            public Render<? super EntityPrehistoricFloraIsanichthys> createRenderFor(RenderManager manager) {
                return new RenderIsanichthys(manager);
            }
        });

        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraSteurbautichthys.class, new IRenderFactory<EntityPrehistoricFloraSteurbautichthys>() {
            @Override
            public Render<? super EntityPrehistoricFloraSteurbautichthys> createRenderFor(RenderManager manager) {
                return new RenderSteurbautichthys(manager);
            }
        });

        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraMecochirus.class, new IRenderFactory<EntityPrehistoricFloraMecochirus>() {
            @Override
            public Render<? super EntityPrehistoricFloraMecochirus> createRenderFor(RenderManager manager) {
                return new RenderMecochirus(manager);
            }
        });

        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraSiderops.class, new IRenderFactory<EntityPrehistoricFloraSiderops>() {
            @Override
            public Render<? super EntityPrehistoricFloraSiderops> createRenderFor(RenderManager manager) {
                return new RenderSiderops(manager);
            }
        });
        
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraMesturus.class, new IRenderFactory<EntityPrehistoricFloraMesturus>() {
            @Override
            public Render<? super EntityPrehistoricFloraMesturus> createRenderFor(RenderManager manager) {
                return new RenderMesturus(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraCongopycnodus.class, new IRenderFactory<EntityPrehistoricFloraCongopycnodus>() {
            @Override
            public Render<? super EntityPrehistoricFloraCongopycnodus> createRenderFor(RenderManager manager) {
                return new RenderCongopycnodus(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraBavariscyllium.class, new IRenderFactory<EntityPrehistoricFloraBavariscyllium>() {
            @Override
            public Render<? super EntityPrehistoricFloraBavariscyllium> createRenderFor(RenderManager manager) {
                return new RenderBavariscyllium(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraSpathobatis.class, new IRenderFactory<EntityPrehistoricFloraSpathobatis>() {
            @Override
            public Render<? super EntityPrehistoricFloraSpathobatis> createRenderFor(RenderManager manager) {
                return new RenderSpathobatis(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraParacestracion.class, new IRenderFactory<EntityPrehistoricFloraParacestracion>() {
            @Override
            public Render<? super EntityPrehistoricFloraParacestracion> createRenderFor(RenderManager manager) {
                return new RenderParacestracion(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraIschyodus.class, new IRenderFactory<EntityPrehistoricFloraIschyodus>() {
            @Override
            public Render<? super EntityPrehistoricFloraIschyodus> createRenderFor(RenderManager manager) {
                return new RenderIschyodus(manager);
            }
        });

        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraPhillipsia.class, new IRenderFactory<EntityPrehistoricFloraPhillipsia>() {
            @Override
            public Render<? super EntityPrehistoricFloraPhillipsia> createRenderFor(RenderManager manager) {
                return new RenderPhillipsia(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraRhinopteraspis.class, new IRenderFactory<EntityPrehistoricFloraRhinopteraspis>() {
            @Override
            public Render<? super EntityPrehistoricFloraRhinopteraspis> createRenderFor(RenderManager manager) {
                return new RenderRhinopteraspis(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraKleptothule.class, new IRenderFactory<EntityPrehistoricFloraKleptothule>() {
            @Override
            public Render<? super EntityPrehistoricFloraKleptothule> createRenderFor(RenderManager manager) {
                return new RenderKleptothule(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraHaplophrentis.class, new IRenderFactory<EntityPrehistoricFloraHaplophrentis>() {
            @Override
            public Render<? super EntityPrehistoricFloraHaplophrentis> createRenderFor(RenderManager manager) {
                return new RenderHaplophrentis(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraParadapedium.class, new IRenderFactory<EntityPrehistoricFloraParadapedium>() {
            @Override
            public Render<? super EntityPrehistoricFloraParadapedium> createRenderFor(RenderManager manager) {
                return new RenderParadapedium(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraLigulella.class, new IRenderFactory<EntityPrehistoricFloraLigulella>() {
            @Override
            public Render<? super EntityPrehistoricFloraLigulella> createRenderFor(RenderManager manager) {
                return new RenderLigulella(manager);
            }
        });

        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraCeltedens.class, new IRenderFactory<EntityPrehistoricFloraCeltedens>() {
            @Override
            public Render<? super EntityPrehistoricFloraCeltedens> createRenderFor(RenderManager manager) {
                return new RenderCeltedens(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraMarmorerpeton.class, new IRenderFactory<EntityPrehistoricFloraMarmorerpeton>() {
            @Override
            public Render<? super EntityPrehistoricFloraMarmorerpeton> createRenderFor(RenderManager manager) {
                return new RenderMarmorerpeton(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraVadasaurus.class, new IRenderFactory<EntityPrehistoricFloraVadasaurus>() {
            @Override
            public Render<? super EntityPrehistoricFloraVadasaurus> createRenderFor(RenderManager manager) {
                return new RenderVadasaurus(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraTritylodon.class, new IRenderFactory<EntityPrehistoricFloraTritylodon>() {
            @Override
            public Render<? super EntityPrehistoricFloraTritylodon> createRenderFor(RenderManager manager) {
                return new RenderTritylodon(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraHaldanodon.class, new IRenderFactory<EntityPrehistoricFloraHaldanodon>() {
            @Override
            public Render<? super EntityPrehistoricFloraHaldanodon> createRenderFor(RenderManager manager) {
                return new RenderHaldanodon(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraKayentatherium.class, new IRenderFactory<EntityPrehistoricFloraKayentatherium>() {
            @Override
            public Render<? super EntityPrehistoricFloraKayentatherium> createRenderFor(RenderManager manager) {
                return new RenderKayentatherium(manager);
            }
        });

        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraShaihuludia.class, new IRenderFactory<EntityPrehistoricFloraShaihuludia>() {
            @Override
            public Render<? super EntityPrehistoricFloraShaihuludia> createRenderFor(RenderManager manager) {
                return new RenderShaihuludia(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraUrsactis.class, new IRenderFactory<EntityPrehistoricFloraUrsactis>() {
            @Override
            public Render<? super EntityPrehistoricFloraUrsactis> createRenderFor(RenderManager manager) {
                return new RenderUrsactis(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraKootenayscolex.class, new IRenderFactory<EntityPrehistoricFloraKootenayscolex>() {
            @Override
            public Render<? super EntityPrehistoricFloraKootenayscolex> createRenderFor(RenderManager manager) {
                return new RenderKootenayscolex(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraPhytophilaspis.class, new IRenderFactory<EntityPrehistoricFloraPhytophilaspis>() {
            @Override
            public Render<? super EntityPrehistoricFloraPhytophilaspis> createRenderFor(RenderManager manager) {
                return new RenderPhytophilaspis(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraArchocyrtus.class, new IRenderFactory<EntityPrehistoricFloraArchocyrtus>() {
            @Override
            public Render<? super EntityPrehistoricFloraArchocyrtus> createRenderFor(RenderManager manager) {
                return new RenderArchocyrtus(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraSaurostomus.class, new IRenderFactory<EntityPrehistoricFloraSaurostomus>() {
            @Override
            public Render<? super EntityPrehistoricFloraSaurostomus> createRenderFor(RenderManager manager) {
                return new RenderSaurostomus(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraSongaichthys.class, new IRenderFactory<EntityPrehistoricFloraSongaichthys>() {
            @Override
            public Render<? super EntityPrehistoricFloraSongaichthys> createRenderFor(RenderManager manager) {
                return new RenderSongaichthys(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraMacrosemius.class, new IRenderFactory<EntityPrehistoricFloraMacrosemius>() {
            @Override
            public Render<? super EntityPrehistoricFloraMacrosemius> createRenderFor(RenderManager manager) {
                return new RenderMacrosemius(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraConodont.class, new IRenderFactory<EntityPrehistoricFloraConodont>() {
            @Override
            public Render<? super EntityPrehistoricFloraConodont> createRenderFor(RenderManager manager) {
                return new RenderConodont(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraCastorocauda.class, new IRenderFactory<EntityPrehistoricFloraCastorocauda>() {
            @Override
            public Render<? super EntityPrehistoricFloraCastorocauda> createRenderFor(RenderManager manager) {
                return new RenderCastorocauda(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraGasosaurus.class, new IRenderFactory<EntityPrehistoricFloraGasosaurus>() {
            @Override
            public Render<? super EntityPrehistoricFloraGasosaurus> createRenderFor(RenderManager manager) {
                return new RenderGasosaurus(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraTanyrhinichthys.class, new IRenderFactory<EntityPrehistoricFloraTanyrhinichthys>() {
            @Override
            public Render<? super EntityPrehistoricFloraTanyrhinichthys> createRenderFor(RenderManager manager) {
                return new RenderTanyrhinichthys(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraSokkaejaecystis.class, new IRenderFactory<EntityPrehistoricFloraSokkaejaecystis>() {
            @Override
            public Render<? super EntityPrehistoricFloraSokkaejaecystis> createRenderFor(RenderManager manager) {
                return new RenderSokkaejaecystis(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraNotostracan.class, new IRenderFactory<EntityPrehistoricFloraNotostracan>() {
            @Override
            public Render<? super EntityPrehistoricFloraNotostracan> createRenderFor(RenderManager manager) {
                return new RenderNotostracan(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraLaidleria.class, new IRenderFactory<EntityPrehistoricFloraLaidleria>() {
            @Override
            public Render<? super EntityPrehistoricFloraLaidleria> createRenderFor(RenderManager manager) {
                return new RenderLaidleria(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraAmmonite_Perisphinctes.class, new IRenderFactory<EntityPrehistoricFloraAmmonite_Perisphinctes>() {
            @Override
            public Render<? super EntityPrehistoricFloraAmmonite_Perisphinctes> createRenderFor(RenderManager manager) {
                return new RenderAmmonite_Perisphinctes(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraEuropasaurus.class, new IRenderFactory<EntityPrehistoricFloraEuropasaurus>() {
            @Override
            public Render<? super EntityPrehistoricFloraEuropasaurus> createRenderFor(RenderManager manager) {
                return new RenderEuropasaurus(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraArchaboilus.class, new IRenderFactory<EntityPrehistoricFloraArchaboilus>() {
            @Override
            public Render<? super EntityPrehistoricFloraArchaboilus> createRenderFor(RenderManager manager) {
                return new RenderArchaboilus(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraPycnophlebia.class, new IRenderFactory<EntityPrehistoricFloraPycnophlebia>() {
            @Override
            public Render<? super EntityPrehistoricFloraPycnophlebia> createRenderFor(RenderManager manager) {
                return new RenderPycnophlebia(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraStanocephalosaurus.class, new IRenderFactory<EntityPrehistoricFloraStanocephalosaurus>() {
            @Override
            public Render<? super EntityPrehistoricFloraStanocephalosaurus> createRenderFor(RenderManager manager) {
                return new RenderStanocephalosaurus(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraJeholotriton.class, new IRenderFactory<EntityPrehistoricFloraJeholotriton>() {
            @Override
            public Render<? super EntityPrehistoricFloraJeholotriton> createRenderFor(RenderManager manager) {
                return new RenderJeholotriton(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraOnychopterella.class, new IRenderFactory<EntityPrehistoricFloraOnychopterella>() {
            @Override
            public Render<? super EntityPrehistoricFloraOnychopterella> createRenderFor(RenderManager manager) {
                return new RenderOnychopterella(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraHoplitaspis.class, new IRenderFactory<EntityPrehistoricFloraHoplitaspis>() {
            @Override
            public Render<? super EntityPrehistoricFloraHoplitaspis> createRenderFor(RenderManager manager) {
                return new RenderHoplitaspis(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraChasmataspis.class, new IRenderFactory<EntityPrehistoricFloraChasmataspis>() {
            @Override
            public Render<? super EntityPrehistoricFloraChasmataspis> createRenderFor(RenderManager manager) {
                return new RenderChasmataspis(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraYuxisaurus.class, new IRenderFactory<EntityPrehistoricFloraYuxisaurus>() {
            @Override
            public Render<? super EntityPrehistoricFloraYuxisaurus> createRenderFor(RenderManager manager) {
                return new RenderYuxisaurus(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraOlenellus.class, new IRenderFactory<EntityPrehistoricFloraOlenellus>() {
            @Override
            public Render<? super EntityPrehistoricFloraOlenellus> createRenderFor(RenderManager manager) {
                return new RenderOlenellus(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraStegosaurus.class, new IRenderFactory<EntityPrehistoricFloraStegosaurus>() {
            @Override
            public Render<? super EntityPrehistoricFloraStegosaurus> createRenderFor(RenderManager manager) {
                return new RenderStegosaurus(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraTanycolagreus.class, new IRenderFactory<EntityPrehistoricFloraTanycolagreus>() {
            @Override
            public Render<? super EntityPrehistoricFloraTanycolagreus> createRenderFor(RenderManager manager) {
                return new RenderTanycolagreus(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraCryolophosaurus.class, new IRenderFactory<EntityPrehistoricFloraCryolophosaurus>() {
            @Override
            public Render<? super EntityPrehistoricFloraCryolophosaurus> createRenderFor(RenderManager manager) {
                return new RenderCryolophosaurus(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraTuojiangosaurus.class, new IRenderFactory<EntityPrehistoricFloraTuojiangosaurus>() {
            @Override
            public Render<? super EntityPrehistoricFloraTuojiangosaurus> createRenderFor(RenderManager manager) {
                return new RenderTuojiangosaurus(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraCervifurca.class, new IRenderFactory<EntityPrehistoricFloraCervifurca>() {
            @Override
            public Render<? super EntityPrehistoricFloraCervifurca> createRenderFor(RenderManager manager) {
                return new RenderCervifurca(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraHuayangosaurus.class, new IRenderFactory<EntityPrehistoricFloraHuayangosaurus>() {
            @Override
            public Render<? super EntityPrehistoricFloraHuayangosaurus> createRenderFor(RenderManager manager) {
                return new RenderHuayangosaurus(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraGigantspinosaurus.class, new IRenderFactory<EntityPrehistoricFloraGigantspinosaurus>() {
            @Override
            public Render<? super EntityPrehistoricFloraGigantspinosaurus> createRenderFor(RenderManager manager) {
                return new RenderGigantspinosaurus(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraYangchuanosaurus.class, new IRenderFactory<EntityPrehistoricFloraYangchuanosaurus>() {
            @Override
            public Render<? super EntityPrehistoricFloraYangchuanosaurus> createRenderFor(RenderManager manager) {
                return new RenderYangchuanosaurus(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraGlacialisaurus.class, new IRenderFactory<EntityPrehistoricFloraGlacialisaurus>() {
            @Override
            public Render<? super EntityPrehistoricFloraGlacialisaurus> createRenderFor(RenderManager manager) {
                return new RenderGlacialisaurus(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraTorvosaurus.class, new IRenderFactory<EntityPrehistoricFloraTorvosaurus>() {
            @Override
            public Render<? super EntityPrehistoricFloraTorvosaurus> createRenderFor(RenderManager manager) {
                return new RenderTorvosaurus(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraDilophosaurus.class, new IRenderFactory<EntityPrehistoricFloraDilophosaurus>() {
            @Override
            public Render<? super EntityPrehistoricFloraDilophosaurus> createRenderFor(RenderManager manager) {
                return new RenderDilophosaurus(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraMymoorapelta.class, new IRenderFactory<EntityPrehistoricFloraMymoorapelta>() {
            @Override
            public Render<? super EntityPrehistoricFloraMymoorapelta> createRenderFor(RenderManager manager) {
                return new RenderMymoorapelta(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraSinraptor.class, new IRenderFactory<EntityPrehistoricFloraSinraptor>() {
            @Override
            public Render<? super EntityPrehistoricFloraSinraptor> createRenderFor(RenderManager manager) {
                return new RenderSinraptor(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraAllosaurus.class, new IRenderFactory<EntityPrehistoricFloraAllosaurus>() {
            @Override
            public Render<? super EntityPrehistoricFloraAllosaurus> createRenderFor(RenderManager manager) {
                return new RenderAllosaurus(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraApatosaurus.class, new IRenderFactory<EntityPrehistoricFloraApatosaurus>() {
            @Override
            public Render<? super EntityPrehistoricFloraApatosaurus> createRenderFor(RenderManager manager) {
                return new RenderApatosaurus(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraAnurognathid.class, new IRenderFactory<EntityPrehistoricFloraAnurognathid>() {
            @Override
            public Render<? super EntityPrehistoricFloraAnurognathid> createRenderFor(RenderManager manager) {
                return new RenderAnurognathid(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraLimusaurus.class, new IRenderFactory<EntityPrehistoricFloraLimusaurus>() {
            @Override
            public Render<? super EntityPrehistoricFloraLimusaurus> createRenderFor(RenderManager manager) {
                return new RenderLimusaurus(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraProceratosaurus.class, new IRenderFactory<EntityPrehistoricFloraProceratosaurus>() {
            @Override
            public Render<? super EntityPrehistoricFloraProceratosaurus> createRenderFor(RenderManager manager) {
                return new RenderProceratosaurus(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraElaphrosaurus.class, new IRenderFactory<EntityPrehistoricFloraElaphrosaurus>() {
            @Override
            public Render<? super EntityPrehistoricFloraElaphrosaurus> createRenderFor(RenderManager manager) {
                return new RenderElaphrosaurus(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraGargoyleosaurus.class, new IRenderFactory<EntityPrehistoricFloraGargoyleosaurus>() {
            @Override
            public Render<? super EntityPrehistoricFloraGargoyleosaurus> createRenderFor(RenderManager manager) {
                return new RenderGargoyleosaurus(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraPterodactylus.class, new IRenderFactory<EntityPrehistoricFloraPterodactylus>() {
            @Override
            public Render<? super EntityPrehistoricFloraPterodactylus> createRenderFor(RenderManager manager) {
                return new RenderPterodactylus(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraRhamphorhynchus.class, new IRenderFactory<EntityPrehistoricFloraRhamphorhynchus>() {
            @Override
            public Render<? super EntityPrehistoricFloraRhamphorhynchus> createRenderFor(RenderManager manager) {
                return new RenderRhamphorhynchus(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraGuanlong.class, new IRenderFactory<EntityPrehistoricFloraGuanlong>() {
            @Override
            public Render<? super EntityPrehistoricFloraGuanlong> createRenderFor(RenderManager manager) {
                return new RenderGuanlong(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraCamarasaurus.class, new IRenderFactory<EntityPrehistoricFloraCamarasaurus>() {
            @Override
            public Render<? super EntityPrehistoricFloraCamarasaurus> createRenderFor(RenderManager manager) {
                return new RenderCamarasaurus(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraChilesaurus.class, new IRenderFactory<EntityPrehistoricFloraChilesaurus>() {
            @Override
            public Render<? super EntityPrehistoricFloraChilesaurus> createRenderFor(RenderManager manager) {
                return new RenderChilesaurus(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraMiragaia.class, new IRenderFactory<EntityPrehistoricFloraMiragaia>() {
            @Override
            public Render<? super EntityPrehistoricFloraMiragaia> createRenderFor(RenderManager manager) {
                return new RenderMiragaia(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraAdeopapposaurus.class, new IRenderFactory<EntityPrehistoricFloraAdeopapposaurus>() {
            @Override
            public Render<? super EntityPrehistoricFloraAdeopapposaurus> createRenderFor(RenderManager manager) {
                return new RenderAdeopapposaurus(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraAnchisaurus.class, new IRenderFactory<EntityPrehistoricFloraAnchisaurus>() {
            @Override
            public Render<? super EntityPrehistoricFloraAnchisaurus> createRenderFor(RenderManager manager) {
                return new RenderAnchisaurus(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraDubreuillosaurus.class, new IRenderFactory<EntityPrehistoricFloraDubreuillosaurus>() {
            @Override
            public Render<? super EntityPrehistoricFloraDubreuillosaurus> createRenderFor(RenderManager manager) {
                return new RenderDubreuillosaurus(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraCompsognathus.class, new IRenderFactory<EntityPrehistoricFloraCompsognathus>() {
            @Override
            public Render<? super EntityPrehistoricFloraCompsognathus> createRenderFor(RenderManager manager) {
                return new RenderCompsognathus(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraCamptosaurus.class, new IRenderFactory<EntityPrehistoricFloraCamptosaurus>() {
            @Override
            public Render<? super EntityPrehistoricFloraCamptosaurus> createRenderFor(RenderManager manager) {
                return new RenderCamptosaurus(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraCumnoria.class, new IRenderFactory<EntityPrehistoricFloraCumnoria>() {
            @Override
            public Render<? super EntityPrehistoricFloraCumnoria> createRenderFor(RenderManager manager) {
                return new RenderCumnoria(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraUteodon.class, new IRenderFactory<EntityPrehistoricFloraUteodon>() {
            @Override
            public Render<? super EntityPrehistoricFloraUteodon> createRenderFor(RenderManager manager) {
                return new RenderUteodon(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraShunosaurus.class, new IRenderFactory<EntityPrehistoricFloraShunosaurus>() {
            @Override
            public Render<? super EntityPrehistoricFloraShunosaurus> createRenderFor(RenderManager manager) {
                return new RenderShunosaurus(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraWukongopterus.class, new IRenderFactory<EntityPrehistoricFloraWukongopterus>() {
            @Override
            public Render<? super EntityPrehistoricFloraWukongopterus> createRenderFor(RenderManager manager) {
                return new RenderWukongopterus(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraDorygnathus.class, new IRenderFactory<EntityPrehistoricFloraDorygnathus>() {
            @Override
            public Render<? super EntityPrehistoricFloraDorygnathus> createRenderFor(RenderManager manager) {
                return new RenderDorygnathus(manager);
            }
        });

        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraDicraeosaurus.class, new IRenderFactory<EntityPrehistoricFloraDicraeosaurus>() {
            @Override
            public Render<? super EntityPrehistoricFloraDicraeosaurus> createRenderFor(RenderManager manager) {
                return new RenderDicraeosaurus(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraHeterodontosaurus.class, new IRenderFactory<EntityPrehistoricFloraHeterodontosaurus>() {
            @Override
            public Render<? super EntityPrehistoricFloraHeterodontosaurus> createRenderFor(RenderManager manager) {
                return new RenderHeterodontosaurus(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraTianyulong.class, new IRenderFactory<EntityPrehistoricFloraTianyulong>() {
            @Override
            public Render<? super EntityPrehistoricFloraTianyulong> createRenderFor(RenderManager manager) {
                return new RenderTianyulong(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraOrnitholestes.class, new IRenderFactory<EntityPrehistoricFloraOrnitholestes>() {
            @Override
            public Render<? super EntityPrehistoricFloraOrnitholestes> createRenderFor(RenderManager manager) {
                return new RenderOrnitholestes(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraDiplodocus.class, new IRenderFactory<EntityPrehistoricFloraDiplodocus>() {
            @Override
            public Render<? super EntityPrehistoricFloraDiplodocus> createRenderFor(RenderManager manager) {
                return new RenderDiplodocus(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraMamenchisaurus.class, new IRenderFactory<EntityPrehistoricFloraMamenchisaurus>() {
            @Override
            public Render<? super EntityPrehistoricFloraMamenchisaurus> createRenderFor(RenderManager manager) {
                return new RenderMamenchisaurus(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraBrachiosaurus.class, new IRenderFactory<EntityPrehistoricFloraBrachiosaurus>() {
            @Override
            public Render<? super EntityPrehistoricFloraBrachiosaurus> createRenderFor(RenderManager manager) {
                return new RenderBrachiosaurus(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraYiQi.class, new IRenderFactory<EntityPrehistoricFloraYiQi>() {
            @Override
            public Render<? super EntityPrehistoricFloraYiQi> createRenderFor(RenderManager manager) {
                return new RenderYiQi(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraArchaeopteryx.class, new IRenderFactory<EntityPrehistoricFloraArchaeopteryx>() {
            @Override
            public Render<? super EntityPrehistoricFloraArchaeopteryx> createRenderFor(RenderManager manager) {
                return new RenderArchaeopteryx(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraDimorphodon.class, new IRenderFactory<EntityPrehistoricFloraDimorphodon>() {
            @Override
            public Render<? super EntityPrehistoricFloraDimorphodon> createRenderFor(RenderManager manager) {
                return new RenderDimorphodon(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraAnchiornis.class, new IRenderFactory<EntityPrehistoricFloraAnchiornis>() {
            @Override
            public Render<? super EntityPrehistoricFloraAnchiornis> createRenderFor(RenderManager manager) {
                return new RenderAnchiornis(manager);
            }
        });

        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraBurgessomedusa.class, new IRenderFactory<EntityPrehistoricFloraBurgessomedusa>() {
            @Override
            public Render<? super EntityPrehistoricFloraBurgessomedusa> createRenderFor(RenderManager manager) {
                return new RenderBurgessomedusa(manager);
            }
        });

        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraCordubia.class, new IRenderFactory<EntityPrehistoricFloraCordubia>() {
            @Override
            public Render<? super EntityPrehistoricFloraCordubia> createRenderFor(RenderManager manager) {
                return new RenderCordubia(manager);
            }
        });

        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraMedusina.class, new IRenderFactory<EntityPrehistoricFloraMedusina>() {
            @Override
            public Render<? super EntityPrehistoricFloraMedusina> createRenderFor(RenderManager manager) {
                return new RenderMedusina(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraThaumactena.class, new IRenderFactory<EntityPrehistoricFloraThaumactena>() {
            @Override
            public Render<? super EntityPrehistoricFloraThaumactena> createRenderFor(RenderManager manager) {
                return new RenderThaumactena(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraEdiacaria.class, new IRenderFactory<EntityPrehistoricFloraEdiacaria>() {
            @Override
            public Render<? super EntityPrehistoricFloraEdiacaria> createRenderFor(RenderManager manager) {
                return new RenderEdiacaria(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraEoporpita.class, new IRenderFactory<EntityPrehistoricFloraEoporpita>() {
            @Override
            public Render<? super EntityPrehistoricFloraEoporpita> createRenderFor(RenderManager manager) {
                return new RenderEoporpita(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraIchnusa.class, new IRenderFactory<EntityPrehistoricFloraIchnusa>() {
            @Override
            public Render<? super EntityPrehistoricFloraIchnusa> createRenderFor(RenderManager manager) {
                return new RenderIchnusa(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraCyclomedusa.class, new IRenderFactory<EntityPrehistoricFloraCyclomedusa>() {
            @Override
            public Render<? super EntityPrehistoricFloraCyclomedusa> createRenderFor(RenderManager manager) {
                return new RenderCyclomedusa(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraNimbia.class, new IRenderFactory<EntityPrehistoricFloraNimbia>() {
            @Override
            public Render<? super EntityPrehistoricFloraNimbia> createRenderFor(RenderManager manager) {
                return new RenderNimbia(manager);
            }
        });

        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraPseudodiscophyllum.class, new IRenderFactory<EntityPrehistoricFloraPseudodiscophyllum>() {
            @Override
            public Render<? super EntityPrehistoricFloraPseudodiscophyllum> createRenderFor(RenderManager manager) {
                return new RenderPseudodiscophyllum(manager);
            }
        });

        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraBertratis.class, new IRenderFactory<EntityPrehistoricFloraBertratis>() {
            @Override
            public Render<? super EntityPrehistoricFloraBertratis> createRenderFor(RenderManager manager) {
                return new RenderBertratis(manager);
            }
        });

        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraRotaciurca.class, new IRenderFactory<EntityPrehistoricFloraRotaciurca>() {
            @Override
            public Render<? super EntityPrehistoricFloraRotaciurca> createRenderFor(RenderManager manager) {
                return new RenderRotaciurca(manager);
            }
        });

        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraDaihuoides.class, new IRenderFactory<EntityPrehistoricFloraDaihuoides>() {
            @Override
            public Render<? super EntityPrehistoricFloraDaihuoides> createRenderFor(RenderManager manager) {
                return new RenderDaihuoides(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraOctomedusa.class, new IRenderFactory<EntityPrehistoricFloraOctomedusa>() {
            @Override
            public Render<? super EntityPrehistoricFloraOctomedusa> createRenderFor(RenderManager manager) {
                return new RenderOctomedusa(manager);
            }
        });

        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraProthysanostoma.class, new IRenderFactory<EntityPrehistoricFloraProthysanostoma>() {
            @Override
            public Render<? super EntityPrehistoricFloraProthysanostoma> createRenderFor(RenderManager manager) {
                return new RenderProthysanostoma(manager);
            }
        });

        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraHeliobranchia.class, new IRenderFactory<EntityPrehistoricFloraHeliobranchia>() {
            @Override
            public Render<? super EntityPrehistoricFloraHeliobranchia> createRenderFor(RenderManager manager) {
                return new RenderHeliobranchia(manager);
            }
        });

        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraTarracodiscus.class, new IRenderFactory<EntityPrehistoricFloraTarracodiscus>() {
            @Override
            public Render<? super EntityPrehistoricFloraTarracodiscus> createRenderFor(RenderManager manager) {
                return new RenderTarracodiscus(manager);
            }
        });

        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraEulithota.class, new IRenderFactory<EntityPrehistoricFloraEulithota>() {
            @Override
            public Render<? super EntityPrehistoricFloraEulithota> createRenderFor(RenderManager manager) {
                return new RenderEulithota(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraSemaeostomites.class, new IRenderFactory<EntityPrehistoricFloraSemaeostomites>() {
            @Override
            public Render<? super EntityPrehistoricFloraSemaeostomites> createRenderFor(RenderManager manager) {
                return new RenderSemaeostomites(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraRhizostomites.class, new IRenderFactory<EntityPrehistoricFloraRhizostomites>() {
            @Override
            public Render<? super EntityPrehistoricFloraRhizostomites> createRenderFor(RenderManager manager) {
                return new RenderRhizostomites(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraHydrocraspedota.class, new IRenderFactory<EntityPrehistoricFloraHydrocraspedota>() {
            @Override
            public Render<? super EntityPrehistoricFloraHydrocraspedota> createRenderFor(RenderManager manager) {
                return new RenderHydrocraspedota(manager);
            }
        });

        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraDiscophyllum.class, new IRenderFactory<EntityPrehistoricFloraDiscophyllum>() {
            @Override
            public Render<? super EntityPrehistoricFloraDiscophyllum> createRenderFor(RenderManager manager) {
                return new RenderDiscophyllum(manager);
            }
        });

        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraParopsonema.class, new IRenderFactory<EntityPrehistoricFloraParopsonema>() {
            @Override
            public Render<? super EntityPrehistoricFloraParopsonema> createRenderFor(RenderManager manager) {
                return new RenderParopsonema(manager);
            }
        });

        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraEldonia.class, new IRenderFactory<EntityPrehistoricFloraEldonia>() {
            @Override
            public Render<? super EntityPrehistoricFloraEldonia> createRenderFor(RenderManager manager) {
                return new RenderEldonia(manager);
            }
        });

        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraPlesiosaurus.class, new IRenderFactory<EntityPrehistoricFloraPlesiosaurus>() {
            @Override
            public Render<? super EntityPrehistoricFloraPlesiosaurus> createRenderFor(RenderManager manager) {
                return new RenderPlesiosaurus(manager);
            }
        });

        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraBanksiops.class, new IRenderFactory<EntityPrehistoricFloraBanksiops>() {
            @Override
            public Render<? super EntityPrehistoricFloraBanksiops> createRenderFor(RenderManager manager) {
                return new RenderBanksiops(manager);
            }
        });

        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraPampaphoneus.class, new IRenderFactory<EntityPrehistoricFloraPampaphoneus>() {
            @Override
            public Render<? super EntityPrehistoricFloraPampaphoneus> createRenderFor(RenderManager manager) {
                return new RenderPampaphoneus(manager);
            }
        });

        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraPalaeoctenophora.class, new IRenderFactory<EntityPrehistoricFloraPalaeoctenophora>() {
            @Override
            public Render<? super EntityPrehistoricFloraPalaeoctenophora> createRenderFor(RenderManager manager) {
                return new RenderPalaeoctenophora(manager);
            }
        });

        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraArchaeocydippida.class, new IRenderFactory<EntityPrehistoricFloraArchaeocydippida>() {
            @Override
            public Render<? super EntityPrehistoricFloraArchaeocydippida> createRenderFor(RenderManager manager) {
                return new RenderArchaeocydippida(manager);
            }
        });

        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraCtenorhabdotus.class, new IRenderFactory<EntityPrehistoricFloraCtenorhabdotus>() {
            @Override
            public Render<? super EntityPrehistoricFloraCtenorhabdotus> createRenderFor(RenderManager manager) {
                return new RenderCtenorhabdotus(manager);
            }
        });

        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraIchthyosaurus.class, new IRenderFactory<EntityPrehistoricFloraIchthyosaurus>() {
            @Override
            public Render<? super EntityPrehistoricFloraIchthyosaurus> createRenderFor(RenderManager manager) {
                return new RenderIchthyosaurus(manager);
            }
        });

        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraHughmilleria.class, new IRenderFactory<EntityPrehistoricFloraHughmilleria>() {
            @Override
            public Render<? super EntityPrehistoricFloraHughmilleria> createRenderFor(RenderManager manager) {
                return new RenderHughmilleria(manager);
            }
        });

        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraOrcanopterus.class, new IRenderFactory<EntityPrehistoricFloraOrcanopterus>() {
            @Override
            public Render<? super EntityPrehistoricFloraOrcanopterus> createRenderFor(RenderManager manager) {
                return new RenderOrcanopterus(manager);
            }
        });

        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraStoermeropterus.class, new IRenderFactory<EntityPrehistoricFloraStoermeropterus>() {
            @Override
            public Render<? super EntityPrehistoricFloraStoermeropterus> createRenderFor(RenderManager manager) {
                return new RenderStoermeropterus(manager);
            }
        });

        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraEramoscorpius.class, new IRenderFactory<EntityPrehistoricFloraEramoscorpius>() {
            @Override
            public Render<? super EntityPrehistoricFloraEramoscorpius> createRenderFor(RenderManager manager) {
                return new RenderEramoscorpius(manager);
            }
        });

        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraPraearcturus.class, new IRenderFactory<EntityPrehistoricFloraPraearcturus>() {
            @Override
            public Render<? super EntityPrehistoricFloraPraearcturus> createRenderFor(RenderManager manager) {
                return new RenderPraearcturus(manager);
            }
        });

        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraStrobilopterus.class, new IRenderFactory<EntityPrehistoricFloraStrobilopterus>() {
            @Override
            public Render<? super EntityPrehistoricFloraStrobilopterus> createRenderFor(RenderManager manager) {
                return new RenderStrobilopterus(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraWaptia.class, new IRenderFactory<EntityPrehistoricFloraWaptia>() {
            @Override
            public Render<? super EntityPrehistoricFloraWaptia> createRenderFor(RenderManager manager) {
                return new RenderWaptia(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraIsoxys.class, new IRenderFactory<EntityPrehistoricFloraIsoxys>() {
            @Override
            public Render<? super EntityPrehistoricFloraIsoxys> createRenderFor(RenderManager manager) {
                return new RenderIsoxys(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraMobulavermis.class, new IRenderFactory<EntityPrehistoricFloraMobulavermis>() {
            @Override
            public Render<? super EntityPrehistoricFloraMobulavermis> createRenderFor(RenderManager manager) {
                return new RenderMobulavermis(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraBurgessia.class, new IRenderFactory<EntityPrehistoricFloraBurgessia>() {
            @Override
            public Render<? super EntityPrehistoricFloraBurgessia> createRenderFor(RenderManager manager) {
                return new RenderBurgessia(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraSaperion.class, new IRenderFactory<EntityPrehistoricFloraSaperion>() {
            @Override
            public Render<? super EntityPrehistoricFloraSaperion> createRenderFor(RenderManager manager) {
                return new RenderSaperion(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraThulaspis.class, new IRenderFactory<EntityPrehistoricFloraThulaspis>() {
            @Override
            public Render<? super EntityPrehistoricFloraThulaspis> createRenderFor(RenderManager manager) {
                return new RenderThulaspis(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraTimorebestia.class, new IRenderFactory<EntityPrehistoricFloraTimorebestia>() {
            @Override
            public Render<? super EntityPrehistoricFloraTimorebestia> createRenderFor(RenderManager manager) {
                return new RenderTimorebestia(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraCapinatator.class, new IRenderFactory<EntityPrehistoricFloraCapinatator>() {
            @Override
            public Render<? super EntityPrehistoricFloraCapinatator> createRenderFor(RenderManager manager) {
                return new RenderCapinatator(manager);
            }
        });

        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraTitanokorys.class, new IRenderFactory<EntityPrehistoricFloraTitanokorys>() {
            @Override
            public Render<? super EntityPrehistoricFloraTitanokorys> createRenderFor(RenderManager manager) {
                return new RenderTitanokorys(manager);
            }
        });

        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraNesonektris.class, new IRenderFactory<EntityPrehistoricFloraNesonektris>() {
            @Override
            public Render<? super EntityPrehistoricFloraNesonektris> createRenderFor(RenderManager manager) {
                return new RenderNesonektris(manager);
            }
        });

        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraTanaocrossus.class, new IRenderFactory<EntityPrehistoricFloraTanaocrossus>() {
            @Override
            public Render<? super EntityPrehistoricFloraTanaocrossus> createRenderFor(RenderManager manager) {
                return new RenderTanaocrossus(manager);
            }
        });

        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraUrokodia.class, new IRenderFactory<EntityPrehistoricFloraUrokodia>() {
            @Override
            public Render<? super EntityPrehistoricFloraUrokodia> createRenderFor(RenderManager manager) {
                return new RenderUrokodia(manager);
            }
        });

        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraHadranax.class, new IRenderFactory<EntityPrehistoricFloraHadranax>() {
            @Override
            public Render<? super EntityPrehistoricFloraHadranax> createRenderFor(RenderManager manager) {
                return new RenderHadranax(manager);
            }
        });

        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraEryma.class, new IRenderFactory<EntityPrehistoricFloraEryma>() {
            @Override
            public Render<? super EntityPrehistoricFloraEryma> createRenderFor(RenderManager manager) {
                return new RenderEryma(manager);
            }
        });

        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraParioscorpio.class, new IRenderFactory<EntityPrehistoricFloraParioscorpio>() {
            @Override
            public Render<? super EntityPrehistoricFloraParioscorpio> createRenderFor(RenderManager manager) {
                return new RenderParioscorpio(manager);
            }
        });

        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraLiaosteus.class, new IRenderFactory<EntityPrehistoricFloraLiaosteus>() {
            @Override
            public Render<? super EntityPrehistoricFloraLiaosteus> createRenderFor(RenderManager manager) {
                return new RenderLiaosteus(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraEochondrosteus.class, new IRenderFactory<EntityPrehistoricFloraEochondrosteus>() {
            @Override
            public Render<? super EntityPrehistoricFloraEochondrosteus> createRenderFor(RenderManager manager) {
                return new RenderEochondrosteus(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraKichkassia.class, new IRenderFactory<EntityPrehistoricFloraKichkassia>() {
            @Override
            public Render<? super EntityPrehistoricFloraKichkassia> createRenderFor(RenderManager manager) {
                return new RenderKichkassia(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraBethesdaichthys.class, new IRenderFactory<EntityPrehistoricFloraBethesdaichthys>() {
            @Override
            public Render<? super EntityPrehistoricFloraBethesdaichthys> createRenderFor(RenderManager manager) {
                return new RenderBethesdaichthys(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraSurcaudalus.class, new IRenderFactory<EntityPrehistoricFloraSurcaudalus>() {
            @Override
            public Render<? super EntityPrehistoricFloraSurcaudalus> createRenderFor(RenderManager manager) {
                return new RenderSurcaudalus(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraConchopoma.class, new IRenderFactory<EntityPrehistoricFloraConchopoma>() {
            @Override
            public Render<? super EntityPrehistoricFloraConchopoma> createRenderFor(RenderManager manager) {
                return new RenderConchopoma(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraBrazilichthys.class, new IRenderFactory<EntityPrehistoricFloraBrazilichthys>() {
            @Override
            public Render<? super EntityPrehistoricFloraBrazilichthys> createRenderFor(RenderManager manager) {
                return new RenderBrazilichthys(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraNamurotypus.class, new IRenderFactory<EntityPrehistoricFloraNamurotypus>() {
            @Override
            public Render<? super EntityPrehistoricFloraNamurotypus> createRenderFor(RenderManager manager) {
                return new RenderNamurotypus(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraErasipteroides.class, new IRenderFactory<EntityPrehistoricFloraErasipteroides>() {
            @Override
            public Render<? super EntityPrehistoricFloraErasipteroides> createRenderFor(RenderManager manager) {
                return new RenderErasipteroides(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraErasipteroidesNymph.class, new IRenderFactory<EntityPrehistoricFloraErasipteroidesNymph>() {
            @Override
            public Render<? super EntityPrehistoricFloraErasipteroidesNymph> createRenderFor(RenderManager manager) {
                return new RenderErasipteroidesNymph(manager);
            }
        });

        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraMonolophosaurus.class, new IRenderFactory<EntityPrehistoricFloraMonolophosaurus>() {
            @Override
            public Render<? super EntityPrehistoricFloraMonolophosaurus> createRenderFor(RenderManager manager) {
                return new RenderMonolophosaurus(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraCaihong.class, new IRenderFactory<EntityPrehistoricFloraCaihong>() {
            @Override
            public Render<? super EntityPrehistoricFloraCaihong> createRenderFor(RenderManager manager) {
                return new RenderCaihong(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraLeptoteuthis.class, new IRenderFactory<EntityPrehistoricFloraLeptoteuthis>() {
            @Override
            public Render<? super EntityPrehistoricFloraLeptoteuthis> createRenderFor(RenderManager manager) {
                return new RenderLeptoteuthis(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraLufengosaurus.class, new IRenderFactory<EntityPrehistoricFloraLufengosaurus>() {
            @Override
            public Render<? super EntityPrehistoricFloraLufengosaurus> createRenderFor(RenderManager manager) {
                return new RenderLufengosaurus(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraMegalichthys.class, new IRenderFactory<EntityPrehistoricFloraMegalichthys>() {
            @Override
            public Render<? super EntityPrehistoricFloraMegalichthys> createRenderFor(RenderManager manager) {
                return new RenderMegalichthys(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraMamulichthys.class, new IRenderFactory<EntityPrehistoricFloraMamulichthys>() {
            @Override
            public Render<? super EntityPrehistoricFloraMamulichthys> createRenderFor(RenderManager manager) {
                return new RenderMamulichthys(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraSenekichthys.class, new IRenderFactory<EntityPrehistoricFloraSenekichthys>() {
            @Override
            public Render<? super EntityPrehistoricFloraSenekichthys> createRenderFor(RenderManager manager) {
                return new RenderSenekichthys(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraHeteropetalus.class, new IRenderFactory<EntityPrehistoricFloraHeteropetalus>() {
            @Override
            public Render<? super EntityPrehistoricFloraHeteropetalus> createRenderFor(RenderManager manager) {
                return new RenderHeteropetalus(manager);
            }
        });

        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraPhyllograptus.class, new IRenderFactory<EntityPrehistoricFloraPhyllograptus>() {
            @Override
            public Render<? super EntityPrehistoricFloraPhyllograptus> createRenderFor(RenderManager manager) {
                return new RenderPhyllograptus(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraClimacograptus.class, new IRenderFactory<EntityPrehistoricFloraClimacograptus>() {
            @Override
            public Render<? super EntityPrehistoricFloraClimacograptus> createRenderFor(RenderManager manager) {
                return new RenderClimacograptus(manager);
            }
        });

        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraHydropessum.class, new IRenderFactory<EntityPrehistoricFloraHydropessum>() {
            @Override
            public Render<? super EntityPrehistoricFloraHydropessum> createRenderFor(RenderManager manager) {
                return new RenderHydropessum(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraSargodon.class, new IRenderFactory<EntityPrehistoricFloraSargodon>() {
            @Override
            public Render<? super EntityPrehistoricFloraSargodon> createRenderFor(RenderManager manager) {
                return new RenderSargodon(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraBowengriphus.class, new IRenderFactory<EntityPrehistoricFloraBowengriphus>() {
            @Override
            public Render<? super EntityPrehistoricFloraBowengriphus> createRenderFor(RenderManager manager) {
                return new RenderBowengriphus(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraGosfordia.class, new IRenderFactory<EntityPrehistoricFloraGosfordia>() {
            @Override
            public Render<? super EntityPrehistoricFloraGosfordia> createRenderFor(RenderManager manager) {
                return new RenderGosfordia(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraPolysentor.class, new IRenderFactory<EntityPrehistoricFloraPolysentor>() {
            @Override
            public Render<? super EntityPrehistoricFloraPolysentor> createRenderFor(RenderManager manager) {
                return new RenderPolysentor(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraPhylloceras.class, new IRenderFactory<EntityPrehistoricFloraPhylloceras>() {
            @Override
            public Render<? super EntityPrehistoricFloraPhylloceras> createRenderFor(RenderManager manager) {
                return new RenderPhylloceras(manager);
            }
        });

        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraPhacops.class, new IRenderFactory<EntityPrehistoricFloraPhacops>() {
            @Override
            public Render<? super EntityPrehistoricFloraPhacops> createRenderFor(RenderManager manager) {
                return new RenderPhacops(manager);
            }
        });

        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraPseudoangustidontus.class, new IRenderFactory<EntityPrehistoricFloraPseudoangustidontus>() {
            @Override
            public Render<? super EntityPrehistoricFloraPseudoangustidontus> createRenderFor(RenderManager manager) {
                return new RenderPseudoangustidontus(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraSarcoprion.class, new IRenderFactory<EntityPrehistoricFloraSarcoprion>() {
            @Override
            public Render<? super EntityPrehistoricFloraSarcoprion> createRenderFor(RenderManager manager) {
                return new RenderSarcoprion(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraThalattosuchus.class, new IRenderFactory<EntityPrehistoricFloraThalattosuchus>() {
            @Override
            public Render<? super EntityPrehistoricFloraThalattosuchus> createRenderFor(RenderManager manager) {
                return new RenderThalattosuchus(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraWodnika.class, new IRenderFactory<EntityPrehistoricFloraWodnika>() {
            @Override
            public Render<? super EntityPrehistoricFloraWodnika> createRenderFor(RenderManager manager) {
                return new RenderWodnika(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraDebeerius.class, new IRenderFactory<EntityPrehistoricFloraDebeerius>() {
            @Override
            public Render<? super EntityPrehistoricFloraDebeerius> createRenderFor(RenderManager manager) {
                return new RenderDebeerius(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraHarpagofututor.class, new IRenderFactory<EntityPrehistoricFloraHarpagofututor>() {
            @Override
            public Render<? super EntityPrehistoricFloraHarpagofututor> createRenderFor(RenderManager manager) {
                return new RenderHarpagofututor(manager);
            }
        });

        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraHeterostrophus.class, new IRenderFactory<EntityPrehistoricFloraHeterostrophus>() {
            @Override
            public Render<? super EntityPrehistoricFloraHeterostrophus> createRenderFor(RenderManager manager) {
                return new RenderHeterostrophus(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraDipteronotus.class, new IRenderFactory<EntityPrehistoricFloraDipteronotus>() {
            @Override
            public Render<? super EntityPrehistoricFloraDipteronotus> createRenderFor(RenderManager manager) {
                return new RenderDipteronotus(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraChippewaella.class, new IRenderFactory<EntityPrehistoricFloraChippewaella>() {
            @Override
            public Render<? super EntityPrehistoricFloraChippewaella> createRenderFor(RenderManager manager) {
                return new RenderChippewaella(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraAkasakiella.class, new IRenderFactory<EntityPrehistoricFloraAkasakiella>() {
            @Override
            public Render<? super EntityPrehistoricFloraAkasakiella> createRenderFor(RenderManager manager) {
                return new RenderAkasakiella(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraWaagenella.class, new IRenderFactory<EntityPrehistoricFloraWaagenella>() {
            @Override
            public Render<? super EntityPrehistoricFloraWaagenella> createRenderFor(RenderManager manager) {
                return new RenderWaagenella(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraFoordella.class, new IRenderFactory<EntityPrehistoricFloraFoordella>() {
            @Override
            public Render<? super EntityPrehistoricFloraFoordella> createRenderFor(RenderManager manager) {
                return new RenderFoordella(manager);
            }
        });

        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraDracopelta.class, new IRenderFactory<EntityPrehistoricFloraDracopelta>() {
            @Override
            public Render<? super EntityPrehistoricFloraDracopelta> createRenderFor(RenderManager manager) {
                return new RenderDracopelta(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraDeuterosaurus.class, new IRenderFactory<EntityPrehistoricFloraDeuterosaurus>() {
            @Override
            public Render<? super EntityPrehistoricFloraDeuterosaurus> createRenderFor(RenderManager manager) {
                return new RenderDeuterosaurus(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraLeedsichthys.class, new IRenderFactory<EntityPrehistoricFloraLeedsichthys>() {
            @Override
            public Render<? super EntityPrehistoricFloraLeedsichthys> createRenderFor(RenderManager manager) {
                return new RenderLeedsichthys(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraPliosaurus.class, new IRenderFactory<EntityPrehistoricFloraPliosaurus>() {
            @Override
            public Render<? super EntityPrehistoricFloraPliosaurus> createRenderFor(RenderManager manager) {
                return new RenderPliosaurus(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraAttenborites.class, new IRenderFactory<EntityPrehistoricFloraAttenborites>() {
            @Override
            public Render<? super EntityPrehistoricFloraAttenborites> createRenderFor(RenderManager manager) {
                return new RenderAttenborites(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraLusotitan.class, new IRenderFactory<EntityPrehistoricFloraLusotitan>() {
            @Override
            public Render<? super EntityPrehistoricFloraLusotitan> createRenderFor(RenderManager manager) {
                return new RenderLusotitan(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraEustreptospondylus.class, new IRenderFactory<EntityPrehistoricFloraEustreptospondylus>() {
            @Override
            public Render<? super EntityPrehistoricFloraEustreptospondylus> createRenderFor(RenderManager manager) {
                return new RenderEustreptospondylus(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraOrestiacanthus.class, new IRenderFactory<EntityPrehistoricFloraOrestiacanthus>() {
            @Override
            public Render<? super EntityPrehistoricFloraOrestiacanthus> createRenderFor(RenderManager manager) {
                return new RenderOrestiacanthus(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraRomerodus.class, new IRenderFactory<EntityPrehistoricFloraRomerodus>() {
            @Override
            public Render<? super EntityPrehistoricFloraRomerodus> createRenderFor(RenderManager manager) {
                return new RenderRomerodus(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraGregorius.class, new IRenderFactory<EntityPrehistoricFloraGregorius>() {
            @Override
            public Render<? super EntityPrehistoricFloraGregorius> createRenderFor(RenderManager manager) {
                return new RenderGregorius(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraChondrenchelys.class, new IRenderFactory<EntityPrehistoricFloraChondrenchelys>() {
            @Override
            public Render<? super EntityPrehistoricFloraChondrenchelys> createRenderFor(RenderManager manager) {
                return new RenderChondrenchelys(manager);
            }
        });

        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraObruchevodus.class, new IRenderFactory<EntityPrehistoricFloraObruchevodus>() {
            @Override
            public Render<? super EntityPrehistoricFloraObruchevodus> createRenderFor(RenderManager manager) {
                return new RenderObruchevodus(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraGoodrichthys.class, new IRenderFactory<EntityPrehistoricFloraGoodrichthys>() {
            @Override
            public Render<? super EntityPrehistoricFloraGoodrichthys> createRenderFor(RenderManager manager) {
                return new RenderGoodrichthys(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraGansuselache.class, new IRenderFactory<EntityPrehistoricFloraGansuselache>() {
            @Override
            public Render<? super EntityPrehistoricFloraGansuselache> createRenderFor(RenderManager manager) {
                return new RenderGansuselache(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraSrianta.class, new IRenderFactory<EntityPrehistoricFloraSrianta>() {
            @Override
            public Render<? super EntityPrehistoricFloraSrianta> createRenderFor(RenderManager manager) {
                return new RenderSrianta(manager);
            }
        });

        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraIdmonarachne.class, new IRenderFactory<EntityPrehistoricFloraIdmonarachne>() {
            @Override
            public Render<? super EntityPrehistoricFloraIdmonarachne> createRenderFor(RenderManager manager) {
                return new RenderIdmonarachne(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraTrigonotarbid_Gondwanarachne.class, new IRenderFactory<EntityPrehistoricFloraTrigonotarbid_Gondwanarachne>() {
            @Override
            public Render<? super EntityPrehistoricFloraTrigonotarbid_Gondwanarachne> createRenderFor(RenderManager manager) {
                return new RenderTrigonotarbid_Gondwanarachne(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraArchaeothyris.class, new IRenderFactory<EntityPrehistoricFloraArchaeothyris>() {
            @Override
            public Render<? super EntityPrehistoricFloraArchaeothyris> createRenderFor(RenderManager manager) {
                return new RenderArchaeothyris(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraMooreodontus.class, new IRenderFactory<EntityPrehistoricFloraMooreodontus>() {
            @Override
            public Render<? super EntityPrehistoricFloraMooreodontus> createRenderFor(RenderManager manager) {
                return new RenderMooreodontus(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraHagenoselache.class, new IRenderFactory<EntityPrehistoricFloraHagenoselache>() {
            @Override
            public Render<? super EntityPrehistoricFloraHagenoselache> createRenderFor(RenderManager manager) {
                return new RenderHagenoselache(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraDiplodoselache.class, new IRenderFactory<EntityPrehistoricFloraDiplodoselache>() {
            @Override
            public Render<? super EntityPrehistoricFloraDiplodoselache> createRenderFor(RenderManager manager) {
                return new RenderDiplodoselache(manager);
            }
        });

        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraWestrichus.class, new IRenderFactory<EntityPrehistoricFloraWestrichus>() {
            @Override
            public Render<? super EntityPrehistoricFloraWestrichus> createRenderFor(RenderManager manager) {
                return new RenderWestrichus(manager);
            }
        });


        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraCaridosuctor.class, new IRenderFactory<EntityPrehistoricFloraCaridosuctor>() {
            @Override
            public Render<? super EntityPrehistoricFloraCaridosuctor> createRenderFor(RenderManager manager) {
                return new RenderCaridosuctor(manager);
            }
        });

        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraSchoenesmahl.class, new IRenderFactory<EntityPrehistoricFloraSchoenesmahl>() {
            @Override
            public Render<? super EntityPrehistoricFloraSchoenesmahl> createRenderFor(RenderManager manager) {
                return new RenderSchoenesmahl(manager);
            }
        });

        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraCricosaurus.class, new IRenderFactory<EntityPrehistoricFloraCricosaurus>() {
            @Override
            public Render<? super EntityPrehistoricFloraCricosaurus> createRenderFor(RenderManager manager) {
                return new RenderCricosaurus(manager);
            }
        });

        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraPhanerorhynchus.class, new IRenderFactory<EntityPrehistoricFloraPhanerorhynchus>() {
            @Override
            public Render<? super EntityPrehistoricFloraPhanerorhynchus> createRenderFor(RenderManager manager) {
                return new RenderPhanerorhynchus(manager);
            }
        });

        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraRhabdoderma.class, new IRenderFactory<EntityPrehistoricFloraRhabdoderma>() {
            @Override
            public Render<? super EntityPrehistoricFloraRhabdoderma> createRenderFor(RenderManager manager) {
                return new RenderRhabdoderma(manager);
            }
        });

        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraGermanodactylus.class, new IRenderFactory<EntityPrehistoricFloraGermanodactylus>() {
            @Override
            public Render<? super EntityPrehistoricFloraGermanodactylus> createRenderFor(RenderManager manager) {
                return new RenderGermanodactylus(manager);
            }
        });

        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraLusovenator.class, new IRenderFactory<EntityPrehistoricFloraLusovenator>() {
            @Override
            public Render<? super EntityPrehistoricFloraLusovenator> createRenderFor(RenderManager manager) {
                return new RenderLusovenator(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraStenokranio.class, new IRenderFactory<EntityPrehistoricFloraStenokranio>() {
            @Override
            public Render<? super EntityPrehistoricFloraStenokranio> createRenderFor(RenderManager manager) {
                return new RenderStenokranio(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraHarpactognathus.class, new IRenderFactory<EntityPrehistoricFloraHarpactognathus>() {
            @Override
            public Render<? super EntityPrehistoricFloraHarpactognathus> createRenderFor(RenderManager manager) {
                return new RenderHarpactognathus(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraDearc.class, new IRenderFactory<EntityPrehistoricFloraDearc>() {
            @Override
            public Render<? super EntityPrehistoricFloraDearc> createRenderFor(RenderManager manager) {
                return new RenderDearc(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraPriscomyzon.class, new IRenderFactory<EntityPrehistoricFloraPriscomyzon>() {
            @Override
            public Render<? super EntityPrehistoricFloraPriscomyzon> createRenderFor(RenderManager manager) {
                return new RenderPriscomyzon(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraPambdelurion.class, new IRenderFactory<EntityPrehistoricFloraPambdelurion>() {
            @Override
            public Render<? super EntityPrehistoricFloraPambdelurion> createRenderFor(RenderManager manager) {
                return new RenderPambdelurion(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraWardichthys.class, new IRenderFactory<EntityPrehistoricFloraWardichthys>() {
            @Override
            public Render<? super EntityPrehistoricFloraWardichthys> createRenderFor(RenderManager manager) {
                return new RenderWardichthys(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraEocursor.class, new IRenderFactory<EntityPrehistoricFloraEocursor>() {
            @Override
            public Render<? super EntityPrehistoricFloraEocursor> createRenderFor(RenderManager manager) {
                return new RenderEocursor(manager);
            }
        });

        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraArcheria.class, new IRenderFactory<EntityPrehistoricFloraArcheria>() {
            @Override
            public Render<? super EntityPrehistoricFloraArcheria> createRenderFor(RenderManager manager) {
                return new RenderArcheria(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraMieridduryn.class, new IRenderFactory<EntityPrehistoricFloraMieridduryn>() {
            @Override
            public Render<? super EntityPrehistoricFloraMieridduryn> createRenderFor(RenderManager manager) {
                return new RenderMieridduryn(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraVenustulus.class, new IRenderFactory<EntityPrehistoricFloraVenustulus>() {
            @Override
            public Render<? super EntityPrehistoricFloraVenustulus> createRenderFor(RenderManager manager) {
                return new RenderVenustulus(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraAlienum.class, new IRenderFactory<EntityPrehistoricFloraAlienum>() {
            @Override
            public Render<? super EntityPrehistoricFloraAlienum> createRenderFor(RenderManager manager) {
                return new RenderAlienum(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraNigerpeton.class, new IRenderFactory<EntityPrehistoricFloraNigerpeton>() {
            @Override
            public Render<? super EntityPrehistoricFloraNigerpeton> createRenderFor(RenderManager manager) {
                return new RenderNigerpeton(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraTyrannotitan.class, new IRenderFactory<EntityPrehistoricFloraTyrannotitan>() {
            @Override
            public Render<? super EntityPrehistoricFloraTyrannotitan> createRenderFor(RenderManager manager) {
                return new RenderTyrannotitan(manager);
            }
        });

        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraPachyamia.class, new IRenderFactory<EntityPrehistoricFloraPachyamia>() {
            @Override
            public Render<? super EntityPrehistoricFloraPachyamia> createRenderFor(RenderManager manager) {
                return new RenderPachyamia(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraSinamia.class, new IRenderFactory<EntityPrehistoricFloraSinamia>() {
            @Override
            public Render<? super EntityPrehistoricFloraSinamia> createRenderFor(RenderManager manager) {
                return new RenderSinamia(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraKhoratamia.class, new IRenderFactory<EntityPrehistoricFloraKhoratamia>() {
            @Override
            public Render<? super EntityPrehistoricFloraKhoratamia> createRenderFor(RenderManager manager) {
                return new RenderKhoratamia(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraCratoamia.class, new IRenderFactory<EntityPrehistoricFloraCratoamia>() {
            @Override
            public Render<? super EntityPrehistoricFloraCratoamia> createRenderFor(RenderManager manager) {
                return new RenderCratoamia(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraTomognathus.class, new IRenderFactory<EntityPrehistoricFloraTomognathus>() {
            @Override
            public Render<? super EntityPrehistoricFloraTomognathus> createRenderFor(RenderManager manager) {
                return new RenderTomognathus(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraSolnhofenamia.class, new IRenderFactory<EntityPrehistoricFloraSolnhofenamia>() {
            @Override
            public Render<? super EntityPrehistoricFloraSolnhofenamia> createRenderFor(RenderManager manager) {
                return new RenderSolnhofenamia(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraIkechaoamia.class, new IRenderFactory<EntityPrehistoricFloraIkechaoamia>() {
            @Override
            public Render<? super EntityPrehistoricFloraIkechaoamia> createRenderFor(RenderManager manager) {
                return new RenderIkechaoamia(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraHispanamia.class, new IRenderFactory<EntityPrehistoricFloraHispanamia>() {
            @Override
            public Render<? super EntityPrehistoricFloraHispanamia> createRenderFor(RenderManager manager) {
                return new RenderHispanamia(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraVidalamia.class, new IRenderFactory<EntityPrehistoricFloraVidalamia>() {
            @Override
            public Render<? super EntityPrehistoricFloraVidalamia> createRenderFor(RenderManager manager) {
                return new RenderVidalamia(manager);
            }
        });

        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraCalamopleurus.class, new IRenderFactory<EntityPrehistoricFloraCalamopleurus>() {
            @Override
            public Render<? super EntityPrehistoricFloraCalamopleurus> createRenderFor(RenderManager manager) {
                return new RenderCalamopleurus(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraAnthracosaurus.class, new IRenderFactory<EntityPrehistoricFloraAnthracosaurus>() {
            @Override
            public Render<? super EntityPrehistoricFloraAnthracosaurus> createRenderFor(RenderManager manager) {
                return new RenderAnthracosaurus(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraSclerocephalus.class, new IRenderFactory<EntityPrehistoricFloraSclerocephalus>() {
            @Override
            public Render<? super EntityPrehistoricFloraSclerocephalus> createRenderFor(RenderManager manager) {
                return new RenderSclerocephalus(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraAcherontiscus.class, new IRenderFactory<EntityPrehistoricFloraAcherontiscus>() {
            @Override
            public Render<? super EntityPrehistoricFloraAcherontiscus> createRenderFor(RenderManager manager) {
                return new RenderAcherontiscus(manager);
            }
        });

        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraNingxiaplatysomus.class, new IRenderFactory<EntityPrehistoricFloraNingxiaplatysomus>() {
            @Override
            public Render<? super EntityPrehistoricFloraNingxiaplatysomus> createRenderFor(RenderManager manager) {
                return new RenderNingxiaplatysomus(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraTesnusocaris.class, new IRenderFactory<EntityPrehistoricFloraTesnusocaris>() {
            @Override
            public Render<? super EntityPrehistoricFloraTesnusocaris> createRenderFor(RenderManager manager) {
                return new RenderTesnusocaris(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraHaplolepis.class, new IRenderFactory<EntityPrehistoricFloraHaplolepis>() {
            @Override
            public Render<? super EntityPrehistoricFloraHaplolepis> createRenderFor(RenderManager manager) {
                return new RenderHaplolepis(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraOnychoselache.class, new IRenderFactory<EntityPrehistoricFloraOnychoselache>() {
            @Override
            public Render<? super EntityPrehistoricFloraOnychoselache> createRenderFor(RenderManager manager) {
                return new RenderOnychoselache(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraAustralichthys.class, new IRenderFactory<EntityPrehistoricFloraAustralichthys>() {
            @Override
            public Render<? super EntityPrehistoricFloraAustralichthys> createRenderFor(RenderManager manager) {
                return new RenderAustralichthys(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraRolfeia.class, new IRenderFactory<EntityPrehistoricFloraRolfeia>() {
            @Override
            public Render<? super EntityPrehistoricFloraRolfeia> createRenderFor(RenderManager manager) {
                return new RenderRolfeia(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraAnderella.class, new IRenderFactory<EntityPrehistoricFloraAnderella>() {
            @Override
            public Render<? super EntityPrehistoricFloraAnderella> createRenderFor(RenderManager manager) {
                return new RenderAnderella(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraAetheretmon.class, new IRenderFactory<EntityPrehistoricFloraAetheretmon>() {
            @Override
            public Render<? super EntityPrehistoricFloraAetheretmon> createRenderFor(RenderManager manager) {
                return new RenderAetheretmon(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraAmphicentrum.class, new IRenderFactory<EntityPrehistoricFloraAmphicentrum>() {
            @Override
            public Render<? super EntityPrehistoricFloraAmphicentrum> createRenderFor(RenderManager manager) {
                return new RenderAmphicentrum(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraNematoptychius.class, new IRenderFactory<EntityPrehistoricFloraNematoptychius>() {
            @Override
            public Render<? super EntityPrehistoricFloraNematoptychius> createRenderFor(RenderManager manager) {
                return new RenderNematoptychius(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraCarbotubulus.class, new IRenderFactory<EntityPrehistoricFloraCarbotubulus>() {
            @Override
            public Render<? super EntityPrehistoricFloraCarbotubulus> createRenderFor(RenderManager manager) {
                return new RenderCarbotubulus(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraUrasterella.class, new IRenderFactory<EntityPrehistoricFloraUrasterella>() {
            @Override
            public Render<? super EntityPrehistoricFloraUrasterella> createRenderFor(RenderManager manager) {
                return new RenderUrasterella(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraScrebinodus.class, new IRenderFactory<EntityPrehistoricFloraScrebinodus>() {
            @Override
            public Render<? super EntityPrehistoricFloraScrebinodus> createRenderFor(RenderManager manager) {
                return new RenderScrebinodus(manager);
            }
        });

        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraNaraoia_bertiensis.class, new IRenderFactory<EntityPrehistoricFloraNaraoia_bertiensis>() {
            @Override
            public Render<? super EntityPrehistoricFloraNaraoia_bertiensis> createRenderFor(RenderManager manager) {
                return new RenderNaraoia_bertiensis(manager);
            }
        });

        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraNaraoia_spinosa.class, new IRenderFactory<EntityPrehistoricFloraNaraoia_spinosa>() {
            @Override
            public Render<? super EntityPrehistoricFloraNaraoia_spinosa> createRenderFor(RenderManager manager) {
                return new RenderNaraoia_spinosa(manager);
            }
        });

        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraPseudonaraoia.class, new IRenderFactory<EntityPrehistoricFloraPseudonaraoia>() {
            @Override
            public Render<? super EntityPrehistoricFloraPseudonaraoia> createRenderFor(RenderManager manager) {
                return new RenderPseudonaraoia(manager);
            }
        });

        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraCamanchia.class, new IRenderFactory<EntityPrehistoricFloraCamanchia>() {
            @Override
            public Render<? super EntityPrehistoricFloraCamanchia> createRenderFor(RenderManager manager) {
                return new RenderCamanchia(manager);
            }
        });

        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraGeragnostus.class, new IRenderFactory<EntityPrehistoricFloraGeragnostus>() {
            @Override
            public Render<? super EntityPrehistoricFloraGeragnostus> createRenderFor(RenderManager manager) {
                return new RenderGeragnostus(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraTetrameroceras.class, new IRenderFactory<EntityPrehistoricFloraTetrameroceras>() {
            @Override
            public Render<? super EntityPrehistoricFloraTetrameroceras> createRenderFor(RenderManager manager) {
                return new RenderTetrameroceras(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraQianosuchus.class, new IRenderFactory<EntityPrehistoricFloraQianosuchus>() {
            @Override
            public Render<? super EntityPrehistoricFloraQianosuchus> createRenderFor(RenderManager manager) {
                return new RenderQianosuchus(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraLitargosuchus.class, new IRenderFactory<EntityPrehistoricFloraLitargosuchus>() {
            @Override
            public Render<? super EntityPrehistoricFloraLitargosuchus> createRenderFor(RenderManager manager) {
                return new RenderLitargosuchus(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraKnoetschkesuchus.class, new IRenderFactory<EntityPrehistoricFloraKnoetschkesuchus>() {
            @Override
            public Render<? super EntityPrehistoricFloraKnoetschkesuchus> createRenderFor(RenderManager manager) {
                return new RenderKnoetschkesuchus(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraTropidosuchus.class, new IRenderFactory<EntityPrehistoricFloraTropidosuchus>() {
            @Override
            public Render<? super EntityPrehistoricFloraTropidosuchus> createRenderFor(RenderManager manager) {
                return new RenderTropidosuchus(manager);
            }
        });

        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraTrilophosaurus.class, new IRenderFactory<EntityPrehistoricFloraTrilophosaurus>() {
            @Override
            public Render<? super EntityPrehistoricFloraTrilophosaurus> createRenderFor(RenderManager manager) {
                return new RenderTrilophosaurus(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraDracoraptor.class, new IRenderFactory<EntityPrehistoricFloraDracoraptor>() {
            @Override
            public Render<? super EntityPrehistoricFloraDracoraptor> createRenderFor(RenderManager manager) {
                return new RenderDracoraptor(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraPrestosuchus.class, new IRenderFactory<EntityPrehistoricFloraPrestosuchus>() {
            @Override
            public Render<? super EntityPrehistoricFloraPrestosuchus> createRenderFor(RenderManager manager) {
                return new RenderPrestosuchus(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraKannemeyeria.class, new IRenderFactory<EntityPrehistoricFloraKannemeyeria>() {
            @Override
            public Render<? super EntityPrehistoricFloraKannemeyeria> createRenderFor(RenderManager manager) {
                return new RenderKannemeyeria(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraLesothosaurus.class, new IRenderFactory<EntityPrehistoricFloraLesothosaurus>() {
            @Override
            public Render<? super EntityPrehistoricFloraLesothosaurus> createRenderFor(RenderManager manager) {
                return new RenderLesothosaurus(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraPholidogaster.class, new IRenderFactory<EntityPrehistoricFloraPholidogaster>() {
            @Override
            public Render<? super EntityPrehistoricFloraPholidogaster> createRenderFor(RenderManager manager) {
                return new RenderPholidogaster(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraEoherpeton.class, new IRenderFactory<EntityPrehistoricFloraEoherpeton>() {
            @Override
            public Render<? super EntityPrehistoricFloraEoherpeton> createRenderFor(RenderManager manager) {
                return new RenderEoherpeton(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraEucritta.class, new IRenderFactory<EntityPrehistoricFloraEucritta>() {
            @Override
            public Render<? super EntityPrehistoricFloraEucritta> createRenderFor(RenderManager manager) {
                return new RenderEucritta(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraTristychius.class, new IRenderFactory<EntityPrehistoricFloraTristychius>() {
            @Override
            public Render<? super EntityPrehistoricFloraTristychius> createRenderFor(RenderManager manager) {
                return new RenderTristychius(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraEurynotus.class, new IRenderFactory<EntityPrehistoricFloraEurynotus>() {
            @Override
            public Render<? super EntityPrehistoricFloraEurynotus> createRenderFor(RenderManager manager) {
                return new RenderEurynotus(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraCaerorhachis.class, new IRenderFactory<EntityPrehistoricFloraCaerorhachis>() {
            @Override
            public Render<? super EntityPrehistoricFloraCaerorhachis> createRenderFor(RenderManager manager) {
                return new RenderCaerorhachis(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraWestlothiana.class, new IRenderFactory<EntityPrehistoricFloraWestlothiana>() {
            @Override
            public Render<? super EntityPrehistoricFloraWestlothiana> createRenderFor(RenderManager manager) {
                return new RenderWestlothiana(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraPygocephalomorpha.class, new IRenderFactory<EntityPrehistoricFloraPygocephalomorpha>() {
            @Override
            public Render<? super EntityPrehistoricFloraPygocephalomorpha> createRenderFor(RenderManager manager) {
                return new RenderPygocephalomorpha(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraEocaecilia.class, new IRenderFactory<EntityPrehistoricFloraEocaecilia>() {
            @Override
            public Render<? super EntityPrehistoricFloraEocaecilia> createRenderFor(RenderManager manager) {
                return new RenderEocaecilia(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraTerrestrisuchus.class, new IRenderFactory<EntityPrehistoricFloraTerrestrisuchus>() {
            @Override
            public Render<? super EntityPrehistoricFloraTerrestrisuchus> createRenderFor(RenderManager manager) {
                return new RenderTerrestrisuchus(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraCoeruleodraco.class, new IRenderFactory<EntityPrehistoricFloraCoeruleodraco>() {
            @Override
            public Render<? super EntityPrehistoricFloraCoeruleodraco> createRenderFor(RenderManager manager) {
                return new RenderCoeruleodraco(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraSpinophorosaurus.class, new IRenderFactory<EntityPrehistoricFloraSpinophorosaurus>() {
            @Override
            public Render<? super EntityPrehistoricFloraSpinophorosaurus> createRenderFor(RenderManager manager) {
                return new RenderSpinophorosaurus(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraTriopus.class, new IRenderFactory<EntityPrehistoricFloraTriopus>() {
            @Override
            public Render<? super EntityPrehistoricFloraTriopus> createRenderFor(RenderManager manager) {
                return new RenderTriopus(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraTremaglaspis.class, new IRenderFactory<EntityPrehistoricFloraTremaglaspis>() {
            @Override
            public Render<? super EntityPrehistoricFloraTremaglaspis> createRenderFor(RenderManager manager) {
                return new RenderTremaglaspis(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraTariccoia.class, new IRenderFactory<EntityPrehistoricFloraTariccoia>() {
            @Override
            public Render<? super EntityPrehistoricFloraTariccoia> createRenderFor(RenderManager manager) {
                return new RenderTariccoia(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraSoomaspis.class, new IRenderFactory<EntityPrehistoricFloraSoomaspis>() {
            @Override
            public Render<? super EntityPrehistoricFloraSoomaspis> createRenderFor(RenderManager manager) {
                return new RenderSoomaspis(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraSericipterus.class, new IRenderFactory<EntityPrehistoricFloraSericipterus>() {
            @Override
            public Render<? super EntityPrehistoricFloraSericipterus> createRenderFor(RenderManager manager) {
                return new RenderSericipterus(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraSordes.class, new IRenderFactory<EntityPrehistoricFloraSordes>() {
            @Override
            public Render<? super EntityPrehistoricFloraSordes> createRenderFor(RenderManager manager) {
                return new RenderSordes(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraSegisaurus.class, new IRenderFactory<EntityPrehistoricFloraSegisaurus>() {
            @Override
            public Render<? super EntityPrehistoricFloraSegisaurus> createRenderFor(RenderManager manager) {
                return new RenderSegisaurus(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraDrepanosaurus.class, new IRenderFactory<EntityPrehistoricFloraDrepanosaurus>() {
            @Override
            public Render<? super EntityPrehistoricFloraDrepanosaurus> createRenderFor(RenderManager manager) {
                return new RenderDrepanosaurus(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraThylacares.class, new IRenderFactory<EntityPrehistoricFloraThylacares>() {
            @Override
            public Render<? super EntityPrehistoricFloraThylacares> createRenderFor(RenderManager manager) {
                return new RenderThylacares(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraAcheronauta.class, new IRenderFactory<EntityPrehistoricFloraAcheronauta>() {
            @Override
            public Render<? super EntityPrehistoricFloraAcheronauta> createRenderFor(RenderManager manager) {
                return new RenderAcheronauta(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraTuzoia.class, new IRenderFactory<EntityPrehistoricFloraTuzoia>() {
            @Override
            public Render<? super EntityPrehistoricFloraTuzoia> createRenderFor(RenderManager manager) {
                return new RenderTuzoia(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraGoldringia.class, new IRenderFactory<EntityPrehistoricFloraGoldringia>() {
            @Override
            public Render<? super EntityPrehistoricFloraGoldringia> createRenderFor(RenderManager manager) {
                return new RenderGoldringia(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraAnthracoceras.class, new IRenderFactory<EntityPrehistoricFloraAnthracoceras>() {
            @Override
            public Render<? super EntityPrehistoricFloraAnthracoceras> createRenderFor(RenderManager manager) {
                return new RenderAnthracoceras(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraArcestes.class, new IRenderFactory<EntityPrehistoricFloraArcestes>() {
            @Override
            public Render<? super EntityPrehistoricFloraArcestes> createRenderFor(RenderManager manager) {
                return new RenderArcestes(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraSilvanerpeton.class, new IRenderFactory<EntityPrehistoricFloraSilvanerpeton>() {
            @Override
            public Render<? super EntityPrehistoricFloraSilvanerpeton> createRenderFor(RenderManager manager) {
                return new RenderSilvanerpeton(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraEldeceeon.class, new IRenderFactory<EntityPrehistoricFloraEldeceeon>() {
            @Override
            public Render<? super EntityPrehistoricFloraEldeceeon> createRenderFor(RenderManager manager) {
                return new RenderEldeceeon(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraLethiscus.class, new IRenderFactory<EntityPrehistoricFloraLethiscus>() {
            @Override
            public Render<? super EntityPrehistoricFloraLethiscus> createRenderFor(RenderManager manager) {
                return new RenderLethiscus(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraRhadinosteus.class, new IRenderFactory<EntityPrehistoricFloraRhadinosteus>() {
            @Override
            public Render<? super EntityPrehistoricFloraRhadinosteus> createRenderFor(RenderManager manager) {
                return new RenderRhadinosteus(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraApateon.class, new IRenderFactory<EntityPrehistoricFloraApateon>() {
            @Override
            public Render<? super EntityPrehistoricFloraApateon> createRenderFor(RenderManager manager) {
                return new RenderApateon(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraMicrobrachis.class, new IRenderFactory<EntityPrehistoricFloraMicrobrachis>() {
            @Override
            public Render<? super EntityPrehistoricFloraMicrobrachis> createRenderFor(RenderManager manager) {
                return new RenderMicrobrachis(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraRhynchonkos.class, new IRenderFactory<EntityPrehistoricFloraRhynchonkos>() {
            @Override
            public Render<? super EntityPrehistoricFloraRhynchonkos> createRenderFor(RenderManager manager) {
                return new RenderRhynchonkos(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraLepidasterella.class, new IRenderFactory<EntityPrehistoricFloraLepidasterella>() {
            @Override
            public Render<? super EntityPrehistoricFloraLepidasterella> createRenderFor(RenderManager manager) {
                return new RenderLepidasterella(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraHexanchus.class, new IRenderFactory<EntityPrehistoricFloraHexanchus>() {
            @Override
            public Render<? super EntityPrehistoricFloraHexanchus> createRenderFor(RenderManager manager) {
                return new RenderHexanchus(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraNicrosaurus.class, new IRenderFactory<EntityPrehistoricFloraNicrosaurus>() {
            @Override
            public Render<? super EntityPrehistoricFloraNicrosaurus> createRenderFor(RenderManager manager) {
                return new RenderNicrosaurus(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraGiraffatitan.class, new IRenderFactory<EntityPrehistoricFloraGiraffatitan>() {
            @Override
            public Render<? super EntityPrehistoricFloraGiraffatitan> createRenderFor(RenderManager manager) {
                return new RenderGiraffatitan(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraDiademodon.class, new IRenderFactory<EntityPrehistoricFloraDiademodon>() {
            @Override
            public Render<? super EntityPrehistoricFloraDiademodon> createRenderFor(RenderManager manager) {
                return new RenderDiademodon(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraPlatysuchus.class, new IRenderFactory<EntityPrehistoricFloraPlatysuchus>() {
            @Override
            public Render<? super EntityPrehistoricFloraPlatysuchus> createRenderFor(RenderManager manager) {
                return new RenderPlatysuchus(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraIllinichthys.class, new IRenderFactory<EntityPrehistoricFloraIllinichthys>() {
            @Override
            public Render<? super EntityPrehistoricFloraIllinichthys> createRenderFor(RenderManager manager) {
                return new RenderIllinichthys(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraCommentrya.class, new IRenderFactory<EntityPrehistoricFloraCommentrya>() {
            @Override
            public Render<? super EntityPrehistoricFloraCommentrya> createRenderFor(RenderManager manager) {
                return new RenderCommentrya(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraDaidal.class, new IRenderFactory<EntityPrehistoricFloraDaidal>() {
            @Override
            public Render<? super EntityPrehistoricFloraDaidal> createRenderFor(RenderManager manager) {
                return new RenderDaidal(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraKalops.class, new IRenderFactory<EntityPrehistoricFloraKalops>() {
            @Override
            public Render<? super EntityPrehistoricFloraKalops> createRenderFor(RenderManager manager) {
                return new RenderKalops(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraMachimosaurus.class, new IRenderFactory<EntityPrehistoricFloraMachimosaurus>() {
            @Override
            public Render<? super EntityPrehistoricFloraMachimosaurus> createRenderFor(RenderManager manager) {
                return new RenderMachimosaurus(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraLiaoceratops.class, new IRenderFactory<EntityPrehistoricFloraLiaoceratops>() {
            @Override
            public Render<? super EntityPrehistoricFloraLiaoceratops> createRenderFor(RenderManager manager) {
                return new RenderLiaoceratops(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraAlbalophosaurus.class, new IRenderFactory<EntityPrehistoricFloraAlbalophosaurus>() {
            @Override
            public Render<? super EntityPrehistoricFloraAlbalophosaurus> createRenderFor(RenderManager manager) {
                return new RenderAlbalophosaurus(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraAquilops.class, new IRenderFactory<EntityPrehistoricFloraAquilops>() {
            @Override
            public Render<? super EntityPrehistoricFloraAquilops> createRenderFor(RenderManager manager) {
                return new RenderAquilops(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraAcrocanthosaurus.class, new IRenderFactory<EntityPrehistoricFloraAcrocanthosaurus>() {
            @Override
            public Render<? super EntityPrehistoricFloraAcrocanthosaurus> createRenderFor(RenderManager manager) {
                return new RenderAcrocanthosaurus(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraDugaldia.class, new IRenderFactory<EntityPrehistoricFloraDugaldia>() {
            @Override
            public Render<? super EntityPrehistoricFloraDugaldia> createRenderFor(RenderManager manager) {
                return new RenderDugaldia(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraNeoceratodus.class, new IRenderFactory<EntityPrehistoricFloraNeoceratodus>() {
            @Override
            public Render<? super EntityPrehistoricFloraNeoceratodus> createRenderFor(RenderManager manager) {
                return new RenderNeoceratodus(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraMawsonia.class, new IRenderFactory<EntityPrehistoricFloraMawsonia>() {
            @Override
            public Render<? super EntityPrehistoricFloraMawsonia> createRenderFor(RenderManager manager) {
                return new RenderMawsonia(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraPsilichthys.class, new IRenderFactory<EntityPrehistoricFloraPsilichthys>() {
            @Override
            public Render<? super EntityPrehistoricFloraPsilichthys> createRenderFor(RenderManager manager) {
                return new RenderPsilichthys(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraEnchodus.class, new IRenderFactory<EntityPrehistoricFloraEnchodus>() {
            @Override
            public Render<? super EntityPrehistoricFloraEnchodus> createRenderFor(RenderManager manager) {
                return new RenderEnchodus(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraCladocyclus.class, new IRenderFactory<EntityPrehistoricFloraCladocyclus>() {
            @Override
            public Render<? super EntityPrehistoricFloraCladocyclus> createRenderFor(RenderManager manager) {
                return new RenderCladocyclus(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraSqualicorax.class, new IRenderFactory<EntityPrehistoricFloraSqualicorax>() {
            @Override
            public Render<? super EntityPrehistoricFloraSqualicorax> createRenderFor(RenderManager manager) {
                return new RenderSqualicorax(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraCretoxyrhina.class, new IRenderFactory<EntityPrehistoricFloraCretoxyrhina>() {
            @Override
            public Render<? super EntityPrehistoricFloraCretoxyrhina> createRenderFor(RenderManager manager) {
                return new RenderCretoxyrhina(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraTribodus.class, new IRenderFactory<EntityPrehistoricFloraTribodus>() {
            @Override
            public Render<? super EntityPrehistoricFloraTribodus> createRenderFor(RenderManager manager) {
                return new RenderTribodus(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraPtychodus.class, new IRenderFactory<EntityPrehistoricFloraPtychodus>() {
            @Override
            public Render<? super EntityPrehistoricFloraPtychodus> createRenderFor(RenderManager manager) {
                return new RenderPtychodus(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraOnchopristis.class, new IRenderFactory<EntityPrehistoricFloraOnchopristis>() {
            @Override
            public Render<? super EntityPrehistoricFloraOnchopristis> createRenderFor(RenderManager manager) {
                return new RenderOnchopristis(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraKoolasuchus.class, new IRenderFactory<EntityPrehistoricFloraKoolasuchus>() {
            @Override
            public Render<? super EntityPrehistoricFloraKoolasuchus> createRenderFor(RenderManager manager) {
                return new RenderKoolasuchus(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraXeneichthys.class, new IRenderFactory<EntityPrehistoricFloraXeneichthys>() {
            @Override
            public Render<? super EntityPrehistoricFloraXeneichthys> createRenderFor(RenderManager manager) {
                return new RenderXeneichthys(manager);
            }
        });

        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraRhacolepis.class, new IRenderFactory<EntityPrehistoricFloraRhacolepis>() {
            @Override
            public Render<? super EntityPrehistoricFloraRhacolepis> createRenderFor(RenderManager manager) {
                return new RenderRhacolepis(manager);
            }
        });

        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraDastilbe.class, new IRenderFactory<EntityPrehistoricFloraDastilbe>() {
            @Override
            public Render<? super EntityPrehistoricFloraDastilbe> createRenderFor(RenderManager manager) {
                return new RenderDastilbe(manager);
            }
        });

        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraKoonwarria.class, new IRenderFactory<EntityPrehistoricFloraKoonwarria>() {
            @Override
            public Render<? super EntityPrehistoricFloraKoonwarria> createRenderFor(RenderManager manager) {
                return new RenderKoonwarria(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraUighuroniscus.class, new IRenderFactory<EntityPrehistoricFloraUighuroniscus>() {
            @Override
            public Render<? super EntityPrehistoricFloraUighuroniscus> createRenderFor(RenderManager manager) {
                return new RenderUighuroniscus(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraYanosteus.class, new IRenderFactory<EntityPrehistoricFloraYanosteus>() {
            @Override
            public Render<? super EntityPrehistoricFloraYanosteus> createRenderFor(RenderManager manager) {
                return new RenderYanosteus(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraWenzichthys.class, new IRenderFactory<EntityPrehistoricFloraWenzichthys>() {
            @Override
            public Render<? super EntityPrehistoricFloraWenzichthys> createRenderFor(RenderManager manager) {
                return new RenderWenzichthys(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraLuskhan.class, new IRenderFactory<EntityPrehistoricFloraLuskhan>() {
            @Override
            public Render<? super EntityPrehistoricFloraLuskhan> createRenderFor(RenderManager manager) {
                return new RenderLuskhan(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraTessarolax.class, new IRenderFactory<EntityPrehistoricFloraTessarolax>() {
            @Override
            public Render<? super EntityPrehistoricFloraTessarolax> createRenderFor(RenderManager manager) {
                return new RenderTessarolax(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraIemanja.class, new IRenderFactory<EntityPrehistoricFloraIemanja>() {
            @Override
            public Render<? super EntityPrehistoricFloraIemanja> createRenderFor(RenderManager manager) {
                return new RenderIemanja(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraIchthyemidion.class, new IRenderFactory<EntityPrehistoricFloraIchthyemidion>() {
            @Override
            public Render<? super EntityPrehistoricFloraIchthyemidion> createRenderFor(RenderManager manager) {
                return new RenderIchthyemidion(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraIchthyotringa.class, new IRenderFactory<EntityPrehistoricFloraIchthyotringa>() {
            @Override
            public Render<? super EntityPrehistoricFloraIchthyotringa> createRenderFor(RenderManager manager) {
                return new RenderIchthyotringa(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraParaclupea.class, new IRenderFactory<EntityPrehistoricFloraParaclupea>() {
            @Override
            public Render<? super EntityPrehistoricFloraParaclupea> createRenderFor(RenderManager manager) {
                return new RenderParaclupea(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraProtopsephurus.class, new IRenderFactory<EntityPrehistoricFloraProtopsephurus>() {
            @Override
            public Render<? super EntityPrehistoricFloraProtopsephurus> createRenderFor(RenderManager manager) {
                return new RenderProtopsephurus(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraVinctifer.class, new IRenderFactory<EntityPrehistoricFloraVinctifer>() {
            @Override
            public Render<? super EntityPrehistoricFloraVinctifer> createRenderFor(RenderManager manager) {
                return new RenderVinctifer(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraHemiaster.class, new IRenderFactory<EntityPrehistoricFloraHemiaster>() {
            @Override
            public Render<? super EntityPrehistoricFloraHemiaster> createRenderFor(RenderManager manager) {
                return new RenderHemiaster(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraLeptocleidus.class, new IRenderFactory<EntityPrehistoricFloraLeptocleidus>() {
            @Override
            public Render<? super EntityPrehistoricFloraLeptocleidus> createRenderFor(RenderManager manager) {
                return new RenderLeptocleidus(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraAnkylosphenodon.class, new IRenderFactory<EntityPrehistoricFloraAnkylosphenodon>() {
            @Override
            public Render<? super EntityPrehistoricFloraAnkylosphenodon> createRenderFor(RenderManager manager) {
                return new RenderAnkylosphenodon(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraEdentosuchus.class, new IRenderFactory<EntityPrehistoricFloraEdentosuchus>() {
            @Override
            public Render<? super EntityPrehistoricFloraEdentosuchus> createRenderFor(RenderManager manager) {
                return new RenderEdentosuchus(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraAraripesuchus.class, new IRenderFactory<EntityPrehistoricFloraAraripesuchus>() {
            @Override
            public Render<? super EntityPrehistoricFloraAraripesuchus> createRenderFor(RenderManager manager) {
                return new RenderAraripesuchus(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraHypsilophodon.class, new IRenderFactory<EntityPrehistoricFloraHypsilophodon>() {
            @Override
            public Render<? super EntityPrehistoricFloraHypsilophodon> createRenderFor(RenderManager manager) {
                return new RenderHypsilophodon(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraBerthasaura.class, new IRenderFactory<EntityPrehistoricFloraBerthasaura>() {
            @Override
            public Render<? super EntityPrehistoricFloraBerthasaura> createRenderFor(RenderManager manager) {
                return new RenderBerthasaura(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraHamulina.class, new IRenderFactory<EntityPrehistoricFloraHamulina>() {
            @Override
            public Render<? super EntityPrehistoricFloraHamulina> createRenderFor(RenderManager manager) {
                return new RenderHamulina(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraHypophylloceras.class, new IRenderFactory<EntityPrehistoricFloraHypophylloceras>() {
            @Override
            public Render<? super EntityPrehistoricFloraHypophylloceras> createRenderFor(RenderManager manager) {
                return new RenderHypophylloceras(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraDimitobelus.class, new IRenderFactory<EntityPrehistoricFloraDimitobelus>() {
            @Override
            public Render<? super EntityPrehistoricFloraDimitobelus> createRenderFor(RenderManager manager) {
                return new RenderDimitobelus(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraPsittacosaurus_sinensis.class, new IRenderFactory<EntityPrehistoricFloraPsittacosaurus_sinensis>() {
            @Override
            public Render<? super EntityPrehistoricFloraPsittacosaurus_sinensis> createRenderFor(RenderManager manager) {
                return new RenderPsittacosaurus_sinensis(manager);
            }
        });

        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraPsittacosaurus_sibiricus.class, new IRenderFactory<EntityPrehistoricFloraPsittacosaurus_sibiricus>() {
            @Override
            public Render<? super EntityPrehistoricFloraPsittacosaurus_sibiricus> createRenderFor(RenderManager manager) {
                return new RenderPsittacosaurus_sibiricus(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraPsittacosaurus.class, new IRenderFactory<EntityPrehistoricFloraPsittacosaurus>() {
            @Override
            public Render<? super EntityPrehistoricFloraPsittacosaurus> createRenderFor(RenderManager manager) {
                return new RenderPsittacosaurus(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraBannykus.class, new IRenderFactory<EntityPrehistoricFloraBannykus>() {
            @Override
            public Render<? super EntityPrehistoricFloraBannykus> createRenderFor(RenderManager manager) {
                return new RenderBannykus(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraMaiaspondylus.class, new IRenderFactory<EntityPrehistoricFloraMaiaspondylus>() {
            @Override
            public Render<? super EntityPrehistoricFloraMaiaspondylus> createRenderFor(RenderManager manager) {
                return new RenderMaiaspondylus(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraHyphalosaurus.class, new IRenderFactory<EntityPrehistoricFloraHyphalosaurus>() {
            @Override
            public Render<? super EntityPrehistoricFloraHyphalosaurus> createRenderFor(RenderManager manager) {
                return new RenderHyphalosaurus(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraTietasaura.class, new IRenderFactory<EntityPrehistoricFloraTietasaura>() {
            @Override
            public Render<? super EntityPrehistoricFloraTietasaura> createRenderFor(RenderManager manager) {
                return new RenderTietasaura(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraAnchura.class, new IRenderFactory<EntityPrehistoricFloraAnchura>() {
            @Override
            public Render<? super EntityPrehistoricFloraAnchura> createRenderFor(RenderManager manager) {
                return new RenderAnchura(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraNotopala.class, new IRenderFactory<EntityPrehistoricFloraNotopala>() {
            @Override
            public Render<? super EntityPrehistoricFloraNotopala> createRenderFor(RenderManager manager) {
                return new RenderNotopala(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraBrannerion.class, new IRenderFactory<EntityPrehistoricFloraBrannerion>() {
            @Override
            public Render<? super EntityPrehistoricFloraBrannerion> createRenderFor(RenderManager manager) {
                return new RenderBrannerion(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraPliodetes.class, new IRenderFactory<EntityPrehistoricFloraPliodetes>() {
            @Override
            public Render<? super EntityPrehistoricFloraPliodetes> createRenderFor(RenderManager manager) {
                return new RenderPliodetes(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraToxolophosaurus.class, new IRenderFactory<EntityPrehistoricFloraToxolophosaurus>() {
            @Override
            public Render<? super EntityPrehistoricFloraToxolophosaurus> createRenderFor(RenderManager manager) {
                return new RenderToxolophosaurus(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraTetrapodophis.class, new IRenderFactory<EntityPrehistoricFloraTetrapodophis>() {
            @Override
            public Render<? super EntityPrehistoricFloraTetrapodophis> createRenderFor(RenderManager manager) {
                return new RenderTetrapodophis(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraPalaeocambarus.class, new IRenderFactory<EntityPrehistoricFloraPalaeocambarus>() {
            @Override
            public Render<? super EntityPrehistoricFloraPalaeocambarus> createRenderFor(RenderManager manager) {
                return new RenderPalaeocambarus(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraShantungosuchus.class, new IRenderFactory<EntityPrehistoricFloraShantungosuchus>() {
            @Override
            public Render<? super EntityPrehistoricFloraShantungosuchus> createRenderFor(RenderManager manager) {
                return new RenderShantungosuchus(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraMesomyzon.class, new IRenderFactory<EntityPrehistoricFloraMesomyzon>() {
            @Override
            public Render<? super EntityPrehistoricFloraMesomyzon> createRenderFor(RenderManager manager) {
                return new RenderMesomyzon(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraIyuku.class, new IRenderFactory<EntityPrehistoricFloraIyuku>() {
            @Override
            public Render<? super EntityPrehistoricFloraIyuku> createRenderFor(RenderManager manager) {
                return new RenderIyuku(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraMuttaburrasaurus.class, new IRenderFactory<EntityPrehistoricFloraMuttaburrasaurus>() {
            @Override
            public Render<? super EntityPrehistoricFloraMuttaburrasaurus> createRenderFor(RenderManager manager) {
                return new RenderMuttaburrasaurus(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraAlbanerpeton.class, new IRenderFactory<EntityPrehistoricFloraAlbanerpeton>() {
            @Override
            public Render<? super EntityPrehistoricFloraAlbanerpeton> createRenderFor(RenderManager manager) {
                return new RenderAlbanerpeton(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraAusktribosphenos.class, new IRenderFactory<EntityPrehistoricFloraAusktribosphenos>() {
            @Override
            public Render<? super EntityPrehistoricFloraAusktribosphenos> createRenderFor(RenderManager manager) {
                return new RenderAusktribosphenos(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraFalcarius.class, new IRenderFactory<EntityPrehistoricFloraFalcarius>() {
            @Override
            public Render<? super EntityPrehistoricFloraFalcarius> createRenderFor(RenderManager manager) {
                return new RenderFalcarius(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraJinyunpelta.class, new IRenderFactory<EntityPrehistoricFloraJinyunpelta>() {
            @Override
            public Render<? super EntityPrehistoricFloraJinyunpelta> createRenderFor(RenderManager manager) {
                return new RenderJinyunpelta(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraThaiodus.class, new IRenderFactory<EntityPrehistoricFloraThaiodus>() {
            @Override
            public Render<? super EntityPrehistoricFloraThaiodus> createRenderFor(RenderManager manager) {
                return new RenderThaiodus(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraEgertonodus.class, new IRenderFactory<EntityPrehistoricFloraEgertonodus>() {
            @Override
            public Render<? super EntityPrehistoricFloraEgertonodus> createRenderFor(RenderManager manager) {
                return new RenderEgertonodus(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraArchaeoniscus.class, new IRenderFactory<EntityPrehistoricFloraArchaeoniscus>() {
            @Override
            public Render<? super EntityPrehistoricFloraArchaeoniscus> createRenderFor(RenderManager manager) {
                return new RenderArchaeoniscus(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraMoutoniceras.class, new IRenderFactory<EntityPrehistoricFloraMoutoniceras>() {
            @Override
            public Render<? super EntityPrehistoricFloraMoutoniceras> createRenderFor(RenderManager manager) {
                return new RenderMoutoniceras(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraAustraliceras.class, new IRenderFactory<EntityPrehistoricFloraAustraliceras>() {
            @Override
            public Render<? super EntityPrehistoricFloraAustraliceras> createRenderFor(RenderManager manager) {
                return new RenderAustraliceras(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraTropaeum.class, new IRenderFactory<EntityPrehistoricFloraTropaeum>() {
            @Override
            public Render<? super EntityPrehistoricFloraTropaeum> createRenderFor(RenderManager manager) {
                return new RenderTropaeum(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraAnatosuchus.class, new IRenderFactory<EntityPrehistoricFloraAnatosuchus>() {
            @Override
            public Render<? super EntityPrehistoricFloraAnatosuchus> createRenderFor(RenderManager manager) {
                return new RenderAnatosuchus(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraCaririsuchus.class, new IRenderFactory<EntityPrehistoricFloraCaririsuchus>() {
            @Override
            public Render<? super EntityPrehistoricFloraCaririsuchus> createRenderFor(RenderManager manager) {
                return new RenderCaririsuchus(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraIkechosaurus.class, new IRenderFactory<EntityPrehistoricFloraIkechosaurus>() {
            @Override
            public Render<? super EntityPrehistoricFloraIkechosaurus> createRenderFor(RenderManager manager) {
                return new RenderIkechosaurus(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraRepenomamus.class, new IRenderFactory<EntityPrehistoricFloraRepenomamus>() {
            @Override
            public Render<? super EntityPrehistoricFloraRepenomamus> createRenderFor(RenderManager manager) {
                return new RenderRepenomamus(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraGobiconodon.class, new IRenderFactory<EntityPrehistoricFloraGobiconodon>() {
            @Override
            public Render<? super EntityPrehistoricFloraGobiconodon> createRenderFor(RenderManager manager) {
                return new RenderGobiconodon(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraGueragama.class, new IRenderFactory<EntityPrehistoricFloraGueragama>() {
            @Override
            public Render<? super EntityPrehistoricFloraGueragama> createRenderFor(RenderManager manager) {
                return new RenderGueragama(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraEocarcharia.class, new IRenderFactory<EntityPrehistoricFloraEocarcharia>() {
            @Override
            public Render<? super EntityPrehistoricFloraEocarcharia> createRenderFor(RenderManager manager) {
                return new RenderEocarcharia(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraNigersaurus.class, new IRenderFactory<EntityPrehistoricFloraNigersaurus>() {
            @Override
            public Render<? super EntityPrehistoricFloraNigersaurus> createRenderFor(RenderManager manager) {
                return new RenderNigersaurus(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraDeinonychus.class, new IRenderFactory<EntityPrehistoricFloraDeinonychus>() {
            @Override
            public Render<? super EntityPrehistoricFloraDeinonychus> createRenderFor(RenderManager manager) {
                return new RenderDeinonychus(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraPietraroiasuchus.class, new IRenderFactory<EntityPrehistoricFloraPietraroiasuchus>() {
            @Override
            public Render<? super EntityPrehistoricFloraPietraroiasuchus> createRenderFor(RenderManager manager) {
                return new RenderPietraroiasuchus(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraTapejara.class, new IRenderFactory<EntityPrehistoricFloraTapejara>() {
            @Override
            public Render<? super EntityPrehistoricFloraTapejara> createRenderFor(RenderManager manager) {
                return new RenderTapejara(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraAnhanguera.class, new IRenderFactory<EntityPrehistoricFloraAnhanguera>() {
            @Override
            public Render<? super EntityPrehistoricFloraAnhanguera> createRenderFor(RenderManager manager) {
                return new RenderAnhanguera(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraMythunga.class, new IRenderFactory<EntityPrehistoricFloraMythunga>() {
            @Override
            public Render<? super EntityPrehistoricFloraMythunga> createRenderFor(RenderManager manager) {
                return new RenderMythunga(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraHaliskia.class, new IRenderFactory<EntityPrehistoricFloraHaliskia>() {
            @Override
            public Render<? super EntityPrehistoricFloraHaliskia> createRenderFor(RenderManager manager) {
                return new RenderHaliskia(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraLanxangichthys.class, new IRenderFactory<EntityPrehistoricFloraLanxangichthys>() {
            @Override
            public Render<? super EntityPrehistoricFloraLanxangichthys> createRenderFor(RenderManager manager) {
                return new RenderLanxangichthys(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraHoyasotes.class, new IRenderFactory<EntityPrehistoricFloraHoyasotes>() {
            @Override
            public Render<? super EntityPrehistoricFloraHoyasotes> createRenderFor(RenderManager manager) {
                return new RenderHoyasotes(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraLepidohyas.class, new IRenderFactory<EntityPrehistoricFloraLepidohyas>() {
            @Override
            public Render<? super EntityPrehistoricFloraLepidohyas> createRenderFor(RenderManager manager) {
                return new RenderLepidohyas(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraEzkutuberezi.class, new IRenderFactory<EntityPrehistoricFloraEzkutuberezi>() {
            @Override
            public Render<? super EntityPrehistoricFloraEzkutuberezi> createRenderFor(RenderManager manager) {
                return new RenderEzkutuberezi(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraStenamara.class, new IRenderFactory<EntityPrehistoricFloraStenamara>() {
            @Override
            public Render<? super EntityPrehistoricFloraStenamara> createRenderFor(RenderManager manager) {
                return new RenderStenamara(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraArratiaelops.class, new IRenderFactory<EntityPrehistoricFloraArratiaelops>() {
            @Override
            public Render<? super EntityPrehistoricFloraArratiaelops> createRenderFor(RenderManager manager) {
                return new RenderArratiaelops(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraCooyoo.class, new IRenderFactory<EntityPrehistoricFloraCooyoo>() {
            @Override
            public Render<? super EntityPrehistoricFloraCooyoo> createRenderFor(RenderManager manager) {
                return new RenderCooyoo(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraDiscoserra.class, new IRenderFactory<EntityPrehistoricFloraDiscoserra>() {
            @Override
            public Render<? super EntityPrehistoricFloraDiscoserra> createRenderFor(RenderManager manager) {
                return new RenderDiscoserra(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraTribrachidium.class, new IRenderFactory<EntityPrehistoricFloraTribrachidium>() {
            @Override
            public Render<? super EntityPrehistoricFloraTribrachidium> createRenderFor(RenderManager manager) {
                return new RenderTribrachidium(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraLobodiscus.class, new IRenderFactory<EntityPrehistoricFloraLobodiscus>() {
            @Override
            public Render<? super EntityPrehistoricFloraLobodiscus> createRenderFor(RenderManager manager) {
                return new RenderLobodiscus(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraHallidaya.class, new IRenderFactory<EntityPrehistoricFloraHallidaya>() {
            @Override
            public Render<? super EntityPrehistoricFloraHallidaya> createRenderFor(RenderManager manager) {
                return new RenderHallidaya(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraRugoconites.class, new IRenderFactory<EntityPrehistoricFloraRugoconites>() {
            @Override
            public Render<? super EntityPrehistoricFloraRugoconites> createRenderFor(RenderManager manager) {
                return new RenderRugoconites(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraAnfesta.class, new IRenderFactory<EntityPrehistoricFloraAnfesta>() {
            @Override
            public Render<? super EntityPrehistoricFloraAnfesta> createRenderFor(RenderManager manager) {
                return new RenderAnfesta(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraTemnoxa.class, new IRenderFactory<EntityPrehistoricFloraTemnoxa>() {
            @Override
            public Render<? super EntityPrehistoricFloraTemnoxa> createRenderFor(RenderManager manager) {
                return new RenderTemnoxa(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraAndiva.class, new IRenderFactory<EntityPrehistoricFloraAndiva>() {
            @Override
            public Render<? super EntityPrehistoricFloraAndiva> createRenderFor(RenderManager manager) {
                return new RenderAndiva(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraCyanorus.class, new IRenderFactory<EntityPrehistoricFloraCyanorus>() {
            @Override
            public Render<? super EntityPrehistoricFloraCyanorus> createRenderFor(RenderManager manager) {
                return new RenderCyanorus(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraCephalonega.class, new IRenderFactory<EntityPrehistoricFloraCephalonega>() {
            @Override
            public Render<? super EntityPrehistoricFloraCephalonega> createRenderFor(RenderManager manager) {
                return new RenderCephalonega(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraOvatoscutum.class, new IRenderFactory<EntityPrehistoricFloraOvatoscutum>() {
            @Override
            public Render<? super EntityPrehistoricFloraOvatoscutum> createRenderFor(RenderManager manager) {
                return new RenderOvatoscutum(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraIkaria.class, new IRenderFactory<EntityPrehistoricFloraIkaria>() {
            @Override
            public Render<? super EntityPrehistoricFloraIkaria> createRenderFor(RenderManager manager) {
                return new RenderIkaria(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraUncus.class, new IRenderFactory<EntityPrehistoricFloraUncus>() {
            @Override
            public Render<? super EntityPrehistoricFloraUncus> createRenderFor(RenderManager manager) {
                return new RenderUncus(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraQuaestio.class, new IRenderFactory<EntityPrehistoricFloraQuaestio>() {
            @Override
            public Render<? super EntityPrehistoricFloraQuaestio> createRenderFor(RenderManager manager) {
                return new RenderQuaestio(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraKeretsa.class, new IRenderFactory<EntityPrehistoricFloraKeretsa>() {
            @Override
            public Render<? super EntityPrehistoricFloraKeretsa> createRenderFor(RenderManager manager) {
                return new RenderKeretsa(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraKarakhtia.class, new IRenderFactory<EntityPrehistoricFloraKarakhtia>() {
            @Override
            public Render<? super EntityPrehistoricFloraKarakhtia> createRenderFor(RenderManager manager) {
                return new RenderKarakhtia(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraPodolimirus.class, new IRenderFactory<EntityPrehistoricFloraPodolimirus>() {
            @Override
            public Render<? super EntityPrehistoricFloraPodolimirus> createRenderFor(RenderManager manager) {
                return new RenderPodolimirus(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraWindermeria.class, new IRenderFactory<EntityPrehistoricFloraWindermeria>() {
            @Override
            public Render<? super EntityPrehistoricFloraWindermeria> createRenderFor(RenderManager manager) {
                return new RenderWindermeria(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraProtechiurus.class, new IRenderFactory<EntityPrehistoricFloraProtechiurus>() {
            @Override
            public Render<? super EntityPrehistoricFloraProtechiurus> createRenderFor(RenderManager manager) {
                return new RenderProtechiurus(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraPlexus.class, new IRenderFactory<EntityPrehistoricFloraPlexus>() {
            @Override
            public Render<? super EntityPrehistoricFloraPlexus> createRenderFor(RenderManager manager) {
                return new RenderPlexus(manager);
            }
        });

        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraLiopleurodon.class, new IRenderFactory<EntityPrehistoricFloraLiopleurodon>() {
            @Override
            public Render<? super EntityPrehistoricFloraLiopleurodon> createRenderFor(RenderManager manager) {
                return new RenderLiopleurodon(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraNotobatrachus.class, new IRenderFactory<EntityPrehistoricFloraNotobatrachus>() {
            @Override
            public Render<? super EntityPrehistoricFloraNotobatrachus> createRenderFor(RenderManager manager) {
                return new RenderNotobatrachus(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraCretalamna.class, new IRenderFactory<EntityPrehistoricFloraCretalamna>() {
            @Override
            public Render<? super EntityPrehistoricFloraCretalamna> createRenderFor(RenderManager manager) {
                return new RenderCretalamna(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraGalleonosaurus.class, new IRenderFactory<EntityPrehistoricFloraGalleonosaurus>() {
            @Override
            public Render<? super EntityPrehistoricFloraGalleonosaurus> createRenderFor(RenderManager manager) {
                return new RenderGalleonosaurus(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraCratopipa.class, new IRenderFactory<EntityPrehistoricFloraCratopipa>() {
            @Override
            public Render<? super EntityPrehistoricFloraCratopipa> createRenderFor(RenderManager manager) {
                return new RenderCratopipa(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraProsalirus.class, new IRenderFactory<EntityPrehistoricFloraProsalirus>() {
            @Override
            public Render<? super EntityPrehistoricFloraProsalirus> createRenderFor(RenderManager manager) {
                return new RenderProsalirus(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraCallawayia.class, new IRenderFactory<EntityPrehistoricFloraCallawayia>() {
            @Override
            public Render<? super EntityPrehistoricFloraCallawayia> createRenderFor(RenderManager manager) {
                return new RenderCallawayia(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraValdosaurus.class, new IRenderFactory<EntityPrehistoricFloraValdosaurus>() {
            @Override
            public Render<? super EntityPrehistoricFloraValdosaurus> createRenderFor(RenderManager manager) {
                return new RenderValdosaurus(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraEuropejara.class, new IRenderFactory<EntityPrehistoricFloraEuropejara>() {
            @Override
            public Render<? super EntityPrehistoricFloraEuropejara> createRenderFor(RenderManager manager) {
                return new RenderEuropejara(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraTurbomesodon.class, new IRenderFactory<EntityPrehistoricFloraTurbomesodon>() {
            @Override
            public Render<? super EntityPrehistoricFloraTurbomesodon> createRenderFor(RenderManager manager) {
                return new RenderTurbomesodon(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraSume.class, new IRenderFactory<EntityPrehistoricFloraSume>() {
            @Override
            public Render<? super EntityPrehistoricFloraSume> createRenderFor(RenderManager manager) {
                return new RenderSume(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraProscinetes.class, new IRenderFactory<EntityPrehistoricFloraProscinetes>() {
            @Override
            public Render<? super EntityPrehistoricFloraProscinetes> createRenderFor(RenderManager manager) {
                return new RenderProscinetes(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraOstenoselache.class, new IRenderFactory<EntityPrehistoricFloraOstenoselache>() {
            @Override
            public Render<? super EntityPrehistoricFloraOstenoselache> createRenderFor(RenderManager manager) {
                return new RenderOstenoselache(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraPseudomonocentris.class, new IRenderFactory<EntityPrehistoricFloraPseudomonocentris>() {
            @Override
            public Render<? super EntityPrehistoricFloraPseudomonocentris> createRenderFor(RenderManager manager) {
                return new RenderPseudomonocentris(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraAnglaspis.class, new IRenderFactory<EntityPrehistoricFloraAnglaspis>() {
            @Override
            public Render<? super EntityPrehistoricFloraAnglaspis> createRenderFor(RenderManager manager) {
                return new RenderAnglaspis(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraMosineia.class, new IRenderFactory<EntityPrehistoricFloraMosineia>() {
            @Override
            public Render<? super EntityPrehistoricFloraMosineia> createRenderFor(RenderManager manager) {
                return new RenderMosineia(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraApankura.class, new IRenderFactory<EntityPrehistoricFloraApankura>() {
            @Override
            public Render<? super EntityPrehistoricFloraApankura> createRenderFor(RenderManager manager) {
                return new RenderApankura(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraMalawisaurus.class, new IRenderFactory<EntityPrehistoricFloraMalawisaurus>() {
            @Override
            public Render<? super EntityPrehistoricFloraMalawisaurus> createRenderFor(RenderManager manager) {
                return new RenderMalawisaurus(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraOmeisaurus.class, new IRenderFactory<EntityPrehistoricFloraOmeisaurus>() {
            @Override
            public Render<? super EntityPrehistoricFloraOmeisaurus> createRenderFor(RenderManager manager) {
                return new RenderOmeisaurus(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraRevueltosaurus.class, new IRenderFactory<EntityPrehistoricFloraRevueltosaurus>() {
            @Override
            public Render<? super EntityPrehistoricFloraRevueltosaurus> createRenderFor(RenderManager manager) {
                return new RenderRevueltosaurus(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraBrachytrachelopan.class, new IRenderFactory<EntityPrehistoricFloraBrachytrachelopan>() {
            @Override
            public Render<? super EntityPrehistoricFloraBrachytrachelopan> createRenderFor(RenderManager manager) {
                return new RenderBrachytrachelopan(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraPatagotitan.class, new IRenderFactory<EntityPrehistoricFloraPatagotitan>() {
            @Override
            public Render<? super EntityPrehistoricFloraPatagotitan> createRenderFor(RenderManager manager) {
                return new RenderPatagotitan(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraTeoichthys.class, new IRenderFactory<EntityPrehistoricFloraTeoichthys>() {
            @Override
            public Render<? super EntityPrehistoricFloraTeoichthys> createRenderFor(RenderManager manager) {
                return new RenderTeoichthys(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraLycoptera.class, new IRenderFactory<EntityPrehistoricFloraLycoptera>() {
            @Override
            public Render<? super EntityPrehistoricFloraLycoptera> createRenderFor(RenderManager manager) {
                return new RenderLycoptera(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraTlalocbatos.class, new IRenderFactory<EntityPrehistoricFloraTlalocbatos>() {
            @Override
            public Render<? super EntityPrehistoricFloraTlalocbatos> createRenderFor(RenderManager manager) {
                return new RenderTlalocbatos(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraRhinobatos.class, new IRenderFactory<EntityPrehistoricFloraRhinobatos>() {
            @Override
            public Render<? super EntityPrehistoricFloraRhinobatos> createRenderFor(RenderManager manager) {
                return new RenderRhinobatos(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraLoricatosaurus.class, new IRenderFactory<EntityPrehistoricFloraLoricatosaurus>() {
            @Override
            public Render<? super EntityPrehistoricFloraLoricatosaurus> createRenderFor(RenderManager manager) {
                return new RenderLoricatosaurus(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraKunbarrasaurus.class, new IRenderFactory<EntityPrehistoricFloraKunbarrasaurus>() {
            @Override
            public Render<? super EntityPrehistoricFloraKunbarrasaurus> createRenderFor(RenderManager manager) {
                return new RenderKunbarrasaurus(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraNannopterygius.class, new IRenderFactory<EntityPrehistoricFloraNannopterygius>() {
            @Override
            public Render<? super EntityPrehistoricFloraNannopterygius> createRenderFor(RenderManager manager) {
                return new RenderNannopterygius(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraPolzia.class, new IRenderFactory<EntityPrehistoricFloraPolzia>() {
            @Override
            public Render<? super EntityPrehistoricFloraPolzia> createRenderFor(RenderManager manager) {
                return new RenderPolzia(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraPleurosaurus.class, new IRenderFactory<EntityPrehistoricFloraPleurosaurus>() {
            @Override
            public Render<? super EntityPrehistoricFloraPleurosaurus> createRenderFor(RenderManager manager) {
                return new RenderPleurosaurus(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraUktenadactylus.class, new IRenderFactory<EntityPrehistoricFloraUktenadactylus>() {
            @Override
            public Render<? super EntityPrehistoricFloraUktenadactylus> createRenderFor(RenderManager manager) {
                return new RenderUktenadactylus(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraPalaeoechinastacus.class, new IRenderFactory<EntityPrehistoricFloraPalaeoechinastacus>() {
            @Override
            public Render<? super EntityPrehistoricFloraPalaeoechinastacus> createRenderFor(RenderManager manager) {
                return new RenderPalaeoechinastacus(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraCarnufex.class, new IRenderFactory<EntityPrehistoricFloraCarnufex>() {
            @Override
            public Render<? super EntityPrehistoricFloraCarnufex> createRenderFor(RenderManager manager) {
                return new RenderCarnufex(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraHamiltonichthys.class, new IRenderFactory<EntityPrehistoricFloraHamiltonichthys>() {
            @Override
            public Render<? super EntityPrehistoricFloraHamiltonichthys> createRenderFor(RenderManager manager) {
                return new RenderHamiltonichthys(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraCaiuajara.class, new IRenderFactory<EntityPrehistoricFloraCaiuajara>() {
            @Override
            public Render<? super EntityPrehistoricFloraCaiuajara> createRenderFor(RenderManager manager) {
                return new RenderCaiuajara(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraArchisymplectes.class, new IRenderFactory<EntityPrehistoricFloraArchisymplectes>() {
            @Override
            public Render<? super EntityPrehistoricFloraArchisymplectes> createRenderFor(RenderManager manager) {
                return new RenderArchisymplectes(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraXiushanosteus.class, new IRenderFactory<EntityPrehistoricFloraXiushanosteus>() {
            @Override
            public Render<? super EntityPrehistoricFloraXiushanosteus> createRenderFor(RenderManager manager) {
                return new RenderXiushanosteus(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraTujiaaspis.class, new IRenderFactory<EntityPrehistoricFloraTujiaaspis>() {
            @Override
            public Render<? super EntityPrehistoricFloraTujiaaspis> createRenderFor(RenderManager manager) {
                return new RenderTujiaaspis(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraPlumulites.class, new IRenderFactory<EntityPrehistoricFloraPlumulites>() {
            @Override
            public Render<? super EntityPrehistoricFloraPlumulites> createRenderFor(RenderManager manager) {
                return new RenderPlumulites(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraParawocklumeria.class, new IRenderFactory<EntityPrehistoricFloraParawocklumeria>() {
            @Override
            public Render<? super EntityPrehistoricFloraParawocklumeria> createRenderFor(RenderManager manager) {
                return new RenderParawocklumeria(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraSoliclymenia.class, new IRenderFactory<EntityPrehistoricFloraSoliclymenia>() {
            @Override
            public Render<? super EntityPrehistoricFloraSoliclymenia> createRenderFor(RenderManager manager) {
                return new RenderSoliclymenia(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraDissimilites.class, new IRenderFactory<EntityPrehistoricFloraDissimilites>() {
            @Override
            public Render<? super EntityPrehistoricFloraDissimilites> createRenderFor(RenderManager manager) {
                return new RenderDissimilites(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraMortoniceras.class, new IRenderFactory<EntityPrehistoricFloraMortoniceras>() {
            @Override
            public Render<? super EntityPrehistoricFloraMortoniceras> createRenderFor(RenderManager manager) {
                return new RenderMortoniceras(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraPinacoceras.class, new IRenderFactory<EntityPrehistoricFloraPinacoceras>() {
            @Override
            public Render<? super EntityPrehistoricFloraPinacoceras> createRenderFor(RenderManager manager) {
                return new RenderPinacoceras(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraTropites.class, new IRenderFactory<EntityPrehistoricFloraTropites>() {
            @Override
            public Render<? super EntityPrehistoricFloraTropites> createRenderFor(RenderManager manager) {
                return new RenderTropites(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraPterodaustro.class, new IRenderFactory<EntityPrehistoricFloraPterodaustro>() {
            @Override
            public Render<? super EntityPrehistoricFloraPterodaustro> createRenderFor(RenderManager manager) {
                return new RenderPterodaustro(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraGegepterus.class, new IRenderFactory<EntityPrehistoricFloraGegepterus>() {
            @Override
            public Render<? super EntityPrehistoricFloraGegepterus> createRenderFor(RenderManager manager) {
                return new RenderGegepterus(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraKronosaurus.class, new IRenderFactory<EntityPrehistoricFloraKronosaurus>() {
            @Override
            public Render<? super EntityPrehistoricFloraKronosaurus> createRenderFor(RenderManager manager) {
                return new RenderKronosaurus(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraLytoceras.class, new IRenderFactory<EntityPrehistoricFloraLytoceras>() {
            @Override
            public Render<? super EntityPrehistoricFloraLytoceras> createRenderFor(RenderManager manager) {
                return new RenderLytoceras(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraScaphites.class, new IRenderFactory<EntityPrehistoricFloraScaphites>() {
            @Override
            public Render<? super EntityPrehistoricFloraScaphites> createRenderFor(RenderManager manager) {
                return new RenderScaphites(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraMariella.class, new IRenderFactory<EntityPrehistoricFloraMariella>() {
            @Override
            public Render<? super EntityPrehistoricFloraMariella> createRenderFor(RenderManager manager) {
                return new RenderMariella(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraPtychoceras.class, new IRenderFactory<EntityPrehistoricFloraPtychoceras>() {
            @Override
            public Render<? super EntityPrehistoricFloraPtychoceras> createRenderFor(RenderManager manager) {
                return new RenderPtychoceras(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraPravitoceras.class, new IRenderFactory<EntityPrehistoricFloraPravitoceras>() {
            @Override
            public Render<? super EntityPrehistoricFloraPravitoceras> createRenderFor(RenderManager manager) {
                return new RenderPravitoceras(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraBaculites.class, new IRenderFactory<EntityPrehistoricFloraBaculites>() {
            @Override
            public Render<? super EntityPrehistoricFloraBaculites> createRenderFor(RenderManager manager) {
                return new RenderBaculites(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraHyphantoceras.class, new IRenderFactory<EntityPrehistoricFloraHyphantoceras>() {
            @Override
            public Render<? super EntityPrehistoricFloraHyphantoceras> createRenderFor(RenderManager manager) {
                return new RenderHyphantoceras(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraDiplomoceras.class, new IRenderFactory<EntityPrehistoricFloraDiplomoceras>() {
            @Override
            public Render<? super EntityPrehistoricFloraDiplomoceras> createRenderFor(RenderManager manager) {
                return new RenderDiplomoceras(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraPermarachne.class, new IRenderFactory<EntityPrehistoricFloraPermarachne>() {
            @Override
            public Render<? super EntityPrehistoricFloraPermarachne> createRenderFor(RenderManager manager) {
                return new RenderPermarachne(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraMagnipterygius.class, new IRenderFactory<EntityPrehistoricFloraMagnipterygius>() {
            @Override
            public Render<? super EntityPrehistoricFloraMagnipterygius> createRenderFor(RenderManager manager) {
                return new RenderMagnipterygius(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraPentameroceras.class, new IRenderFactory<EntityPrehistoricFloraPentameroceras>() {
            @Override
            public Render<? super EntityPrehistoricFloraPentameroceras> createRenderFor(RenderManager manager) {
                return new RenderPentameroceras(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraTrimeroceras.class, new IRenderFactory<EntityPrehistoricFloraTrimeroceras>() {
            @Override
            public Render<? super EntityPrehistoricFloraTrimeroceras> createRenderFor(RenderManager manager) {
                return new RenderTrimeroceras(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraInversoceras.class, new IRenderFactory<EntityPrehistoricFloraInversoceras>() {
            @Override
            public Render<? super EntityPrehistoricFloraInversoceras> createRenderFor(RenderManager manager) {
                return new RenderInversoceras(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraJeppssonoceras.class, new IRenderFactory<EntityPrehistoricFloraJeppssonoceras>() {
            @Override
            public Render<? super EntityPrehistoricFloraJeppssonoceras> createRenderFor(RenderManager manager) {
                return new RenderJeppssonoceras(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraEoscorpius.class, new IRenderFactory<EntityPrehistoricFloraEoscorpius>() {
            @Override
            public Render<? super EntityPrehistoricFloraEoscorpius> createRenderFor(RenderManager manager) {
                return new RenderEoscorpius(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraProtoischnurus.class, new IRenderFactory<EntityPrehistoricFloraProtoischnurus>() {
            @Override
            public Render<? super EntityPrehistoricFloraProtoischnurus> createRenderFor(RenderManager manager) {
                return new RenderProtoischnurus(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraTadpole.class, new IRenderFactory<EntityPrehistoricFloraTadpole>() {
            @Override
            public Render<? super EntityPrehistoricFloraTadpole> createRenderFor(RenderManager manager) {
                return new RenderTadpole(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraLesueurilla.class, new IRenderFactory<EntityPrehistoricFloraLesueurilla>() {
            @Override
            public Render<? super EntityPrehistoricFloraLesueurilla> createRenderFor(RenderManager manager) {
                return new RenderLesueurilla(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraLytospira.class, new IRenderFactory<EntityPrehistoricFloraLytospira>() {
            @Override
            public Render<? super EntityPrehistoricFloraLytospira> createRenderFor(RenderManager manager) {
                return new RenderLytospira(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraKirkospira.class, new IRenderFactory<EntityPrehistoricFloraKirkospira>() {
            @Override
            public Render<? super EntityPrehistoricFloraKirkospira> createRenderFor(RenderManager manager) {
                return new RenderKirkospira(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraBathrotomaria.class, new IRenderFactory<EntityPrehistoricFloraBathrotomaria>() {
            @Override
            public Render<? super EntityPrehistoricFloraBathrotomaria> createRenderFor(RenderManager manager) {
                return new RenderBathrotomaria(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraBoiotremus.class, new IRenderFactory<EntityPrehistoricFloraBoiotremus>() {
            @Override
            public Render<? super EntityPrehistoricFloraBoiotremus> createRenderFor(RenderManager manager) {
                return new RenderBoiotremus(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraCoelostylina.class, new IRenderFactory<EntityPrehistoricFloraCoelostylina>() {
            @Override
            public Render<? super EntityPrehistoricFloraCoelostylina> createRenderFor(RenderManager manager) {
                return new RenderCoelostylina(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraTenontosaurus.class, new IRenderFactory<EntityPrehistoricFloraTenontosaurus>() {
            @Override
            public Render<? super EntityPrehistoricFloraTenontosaurus> createRenderFor(RenderManager manager) {
                return new RenderTenontosaurus(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraAustropotamobius.class, new IRenderFactory<EntityPrehistoricFloraAustropotamobius>() {
            @Override
            public Render<? super EntityPrehistoricFloraAustropotamobius> createRenderFor(RenderManager manager) {
                return new RenderAustropotamobius(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraLiaoningogriphus.class, new IRenderFactory<EntityPrehistoricFloraLiaoningogriphus>() {
            @Override
            public Render<? super EntityPrehistoricFloraLiaoningogriphus> createRenderFor(RenderManager manager) {
                return new RenderLiaoningogriphus(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraAraripelepidotes.class, new IRenderFactory<EntityPrehistoricFloraAraripelepidotes>() {
            @Override
            public Render<? super EntityPrehistoricFloraAraripelepidotes> createRenderFor(RenderManager manager) {
                return new RenderAraripelepidotes(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraSauroposeidon.class, new IRenderFactory<EntityPrehistoricFloraSauroposeidon>() {
            @Override
            public Render<? super EntityPrehistoricFloraSauroposeidon> createRenderFor(RenderManager manager) {
                return new RenderSauroposeidon(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraScelidosaurus.class, new IRenderFactory<EntityPrehistoricFloraScelidosaurus>() {
            @Override
            public Render<? super EntityPrehistoricFloraScelidosaurus> createRenderFor(RenderManager manager) {
                return new RenderScelidosaurus(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraCryptoclidus.class, new IRenderFactory<EntityPrehistoricFloraCryptoclidus>() {
            @Override
            public Render<? super EntityPrehistoricFloraCryptoclidus> createRenderFor(RenderManager manager) {
                return new RenderCryptoclidus(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraMei.class, new IRenderFactory<EntityPrehistoricFloraMei>() {
            @Override
            public Render<? super EntityPrehistoricFloraMei> createRenderFor(RenderManager manager) {
                return new RenderMei(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraSantanmantis.class, new IRenderFactory<EntityPrehistoricFloraSantanmantis>() {
            @Override
            public Render<? super EntityPrehistoricFloraSantanmantis> createRenderFor(RenderManager manager) {
                return new RenderSantanmantis(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraValdotriton.class, new IRenderFactory<EntityPrehistoricFloraValdotriton>() {
            @Override
            public Render<? super EntityPrehistoricFloraValdotriton> createRenderFor(RenderManager manager) {
                return new RenderValdotriton(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraKeurbos.class, new IRenderFactory<EntityPrehistoricFloraKeurbos>() {
            @Override
            public Render<? super EntityPrehistoricFloraKeurbos> createRenderFor(RenderManager manager) {
                return new RenderKeurbos(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraRutiodon.class, new IRenderFactory<EntityPrehistoricFloraRutiodon>() {
            @Override
            public Render<? super EntityPrehistoricFloraRutiodon> createRenderFor(RenderManager manager) {
                return new RenderRutiodon(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraRechnisaurus.class, new IRenderFactory<EntityPrehistoricFloraRechnisaurus>() {
            @Override
            public Render<? super EntityPrehistoricFloraRechnisaurus> createRenderFor(RenderManager manager) {
                return new RenderRechnisaurus(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraTawa.class, new IRenderFactory<EntityPrehistoricFloraTawa>() {
            @Override
            public Render<? super EntityPrehistoricFloraTawa> createRenderFor(RenderManager manager) {
                return new RenderTawa(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraBorealopelta.class, new IRenderFactory<EntityPrehistoricFloraBorealopelta>() {
            @Override
            public Render<? super EntityPrehistoricFloraBorealopelta> createRenderFor(RenderManager manager) {
                return new RenderBorealopelta(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraMecistotrachelos.class, new IRenderFactory<EntityPrehistoricFloraMecistotrachelos>() {
            @Override
            public Render<? super EntityPrehistoricFloraMecistotrachelos> createRenderFor(RenderManager manager) {
                return new RenderMecistotrachelos(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraVulcanodon.class, new IRenderFactory<EntityPrehistoricFloraVulcanodon>() {
            @Override
            public Render<? super EntityPrehistoricFloraVulcanodon> createRenderFor(RenderManager manager) {
                return new RenderVulcanodon(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraHoyasemys.class, new IRenderFactory<EntityPrehistoricFloraHoyasemys>() {
            @Override
            public Render<? super EntityPrehistoricFloraHoyasemys> createRenderFor(RenderManager manager) {
                return new RenderHoyasemys(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraGoniopholis.class, new IRenderFactory<EntityPrehistoricFloraGoniopholis>() {
            @Override
            public Render<? super EntityPrehistoricFloraGoniopholis> createRenderFor(RenderManager manager) {
                return new RenderGoniopholis(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraLeaellynasaura.class, new IRenderFactory<EntityPrehistoricFloraLeaellynasaura>() {
            @Override
            public Render<? super EntityPrehistoricFloraLeaellynasaura> createRenderFor(RenderManager manager) {
                return new RenderLeaellynasaura(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraParenchodus.class, new IRenderFactory<EntityPrehistoricFloraParenchodus>() {
            @Override
            public Render<? super EntityPrehistoricFloraParenchodus> createRenderFor(RenderManager manager) {
                return new RenderParenchodus(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraEichstaettisaurus.class, new IRenderFactory<EntityPrehistoricFloraEichstaettisaurus>() {
            @Override
            public Render<? super EntityPrehistoricFloraEichstaettisaurus> createRenderFor(RenderManager manager) {
                return new RenderEichstaettisaurus(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraAnoualerpeton.class, new IRenderFactory<EntityPrehistoricFloraAnoualerpeton>() {
            @Override
            public Render<? super EntityPrehistoricFloraAnoualerpeton> createRenderFor(RenderManager manager) {
                return new RenderAnoualerpeton(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraSiamamia.class, new IRenderFactory<EntityPrehistoricFloraSiamamia>() {
            @Override
            public Render<? super EntityPrehistoricFloraSiamamia> createRenderFor(RenderManager manager) {
                return new RenderSiamamia(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraHarranahynchus.class, new IRenderFactory<EntityPrehistoricFloraHarranahynchus>() {
            @Override
            public Render<? super EntityPrehistoricFloraHarranahynchus> createRenderFor(RenderManager manager) {
                return new RenderHarranahynchus(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraPaulchoffatia.class, new IRenderFactory<EntityPrehistoricFloraPaulchoffatia>() {
            @Override
            public Render<? super EntityPrehistoricFloraPaulchoffatia> createRenderFor(RenderManager manager) {
                return new RenderPaulchoffatia(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraYuanyanglong.class, new IRenderFactory<EntityPrehistoricFloraYuanyanglong>() {
            @Override
            public Render<? super EntityPrehistoricFloraYuanyanglong> createRenderFor(RenderManager manager) {
                return new RenderYuanyanglong(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraIncisivosaurus.class, new IRenderFactory<EntityPrehistoricFloraIncisivosaurus>() {
            @Override
            public Render<? super EntityPrehistoricFloraIncisivosaurus> createRenderFor(RenderManager manager) {
                return new RenderIncisivosaurus(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraCaudipteryx.class, new IRenderFactory<EntityPrehistoricFloraCaudipteryx>() {
            @Override
            public Render<? super EntityPrehistoricFloraCaudipteryx> createRenderFor(RenderManager manager) {
                return new RenderCaudipteryx(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraMicrovenator.class, new IRenderFactory<EntityPrehistoricFloraMicrovenator>() {
            @Override
            public Render<? super EntityPrehistoricFloraMicrovenator> createRenderFor(RenderManager manager) {
                return new RenderMicrovenator(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraIguanodon.class, new IRenderFactory<EntityPrehistoricFloraIguanodon>() {
            @Override
            public Render<? super EntityPrehistoricFloraIguanodon> createRenderFor(RenderManager manager) {
                return new RenderIguanodon(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraStolokrosuchus.class, new IRenderFactory<EntityPrehistoricFloraStolokrosuchus>() {
            @Override
            public Render<? super EntityPrehistoricFloraStolokrosuchus> createRenderFor(RenderManager manager) {
                return new RenderStolokrosuchus(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraBarosaurus.class, new IRenderFactory<EntityPrehistoricFloraBarosaurus>() {
            @Override
            public Render<? super EntityPrehistoricFloraBarosaurus> createRenderFor(RenderManager manager) {
                return new RenderBarosaurus(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraGastonia.class, new IRenderFactory<EntityPrehistoricFloraGastonia>() {
            @Override
            public Render<? super EntityPrehistoricFloraGastonia> createRenderFor(RenderManager manager) {
                return new RenderGastonia(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraChanopsis.class, new IRenderFactory<EntityPrehistoricFloraChanopsis>() {
            @Override
            public Render<? super EntityPrehistoricFloraChanopsis> createRenderFor(RenderManager manager) {
                return new RenderChanopsis(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraOrdosemys.class, new IRenderFactory<EntityPrehistoricFloraOrdosemys>() {
            @Override
            public Render<? super EntityPrehistoricFloraOrdosemys> createRenderFor(RenderManager manager) {
                return new RenderOrdosemys(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraCandidodon.class, new IRenderFactory<EntityPrehistoricFloraCandidodon>() {
            @Override
            public Render<? super EntityPrehistoricFloraCandidodon> createRenderFor(RenderManager manager) {
                return new RenderCandidodon(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraPrenocephale.class, new IRenderFactory<EntityPrehistoricFloraPrenocephale>() {
            @Override
            public Render<? super EntityPrehistoricFloraPrenocephale> createRenderFor(RenderManager manager) {
                return new RenderPrenocephale(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraChaoyangopterus.class, new IRenderFactory<EntityPrehistoricFloraChaoyangopterus>() {
            @Override
            public Render<? super EntityPrehistoricFloraChaoyangopterus> createRenderFor(RenderManager manager) {
                return new RenderChaoyangopterus(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraSarcosuchus.class, new IRenderFactory<EntityPrehistoricFloraSarcosuchus>() {
            @Override
            public Render<? super EntityPrehistoricFloraSarcosuchus> createRenderFor(RenderManager manager) {
                return new RenderSarcosuchus(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraNotelops.class, new IRenderFactory<EntityPrehistoricFloraNotelops>() {
            @Override
            public Render<? super EntityPrehistoricFloraNotelops> createRenderFor(RenderManager manager) {
                return new RenderNotelops(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraFortiholcorpa.class, new IRenderFactory<EntityPrehistoricFloraFortiholcorpa>() {
            @Override
            public Render<? super EntityPrehistoricFloraFortiholcorpa> createRenderFor(RenderManager manager) {
                return new RenderFortiholcorpa(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraScorpionfly.class, new IRenderFactory<EntityPrehistoricFloraScorpionfly>() {
            @Override
            public Render<? super EntityPrehistoricFloraScorpionfly> createRenderFor(RenderManager manager) {
                return new RenderScorpionfly(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraStonefly.class, new IRenderFactory<EntityPrehistoricFloraStonefly>() {
            @Override
            public Render<? super EntityPrehistoricFloraStonefly> createRenderFor(RenderManager manager) {
                return new RenderStonefly(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraDamselfly.class, new IRenderFactory<EntityPrehistoricFloraDamselfly>() {
            @Override
            public Render<? super EntityPrehistoricFloraDamselfly> createRenderFor(RenderManager manager) {
                return new RenderDamselfly(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraMayfly.class, new IRenderFactory<EntityPrehistoricFloraMayfly>() {
            @Override
            public Render<? super EntityPrehistoricFloraMayfly> createRenderFor(RenderManager manager) {
                return new RenderMayfly(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraJuracimbrophlebia.class, new IRenderFactory<EntityPrehistoricFloraJuracimbrophlebia>() {
            @Override
            public Render<? super EntityPrehistoricFloraJuracimbrophlebia> createRenderFor(RenderManager manager) {
                return new RenderJuracimbrophlebia(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraHangingfly.class, new IRenderFactory<EntityPrehistoricFloraHangingfly>() {
            @Override
            public Render<? super EntityPrehistoricFloraHangingfly> createRenderFor(RenderManager manager) {
                return new RenderHangingfly(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraAquaticBugNymph.class, new IRenderFactory<EntityPrehistoricFloraAquaticBugNymph>() {
            @Override
            public Render<? super EntityPrehistoricFloraAquaticBugNymph> createRenderFor(RenderManager manager) {
                return new RenderAquaticBugNymph(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraArgentinala.class, new IRenderFactory<EntityPrehistoricFloraArgentinala>() {
            @Override
            public Render<? super EntityPrehistoricFloraArgentinala> createRenderFor(RenderManager manager) {
                return new RenderArgentinala(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraVelisoptera.class, new IRenderFactory<EntityPrehistoricFloraVelisoptera>() {
            @Override
            public Render<? super EntityPrehistoricFloraVelisoptera> createRenderFor(RenderManager manager) {
                return new RenderVelisoptera(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraArchaeoceratops.class, new IRenderFactory<EntityPrehistoricFloraArchaeoceratops>() {
            @Override
            public Render<? super EntityPrehistoricFloraArchaeoceratops> createRenderFor(RenderManager manager) {
                return new RenderArchaeoceratops(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraPelecanimimus.class, new IRenderFactory<EntityPrehistoricFloraPelecanimimus>() {
            @Override
            public Render<? super EntityPrehistoricFloraPelecanimimus> createRenderFor(RenderManager manager) {
                return new RenderPelecanimimus(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraMalawisuchus.class, new IRenderFactory<EntityPrehistoricFloraMalawisuchus>() {
            @Override
            public Render<? super EntityPrehistoricFloraMalawisuchus> createRenderFor(RenderManager manager) {
                return new RenderMalawisuchus(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraHeckelichthys.class, new IRenderFactory<EntityPrehistoricFloraHeckelichthys>() {
            @Override
            public Render<? super EntityPrehistoricFloraHeckelichthys> createRenderFor(RenderManager manager) {
                return new RenderHeckelichthys(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraEuroka.class, new IRenderFactory<EntityPrehistoricFloraEuroka>() {
            @Override
            public Render<? super EntityPrehistoricFloraEuroka> createRenderFor(RenderManager manager) {
                return new RenderEuroka(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraYezoceras.class, new IRenderFactory<EntityPrehistoricFloraYezoceras>() {
            @Override
            public Render<? super EntityPrehistoricFloraYezoceras> createRenderFor(RenderManager manager) {
                return new RenderYezoceras(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraNipponites.class, new IRenderFactory<EntityPrehistoricFloraNipponites>() {
            @Override
            public Render<? super EntityPrehistoricFloraNipponites> createRenderFor(RenderManager manager) {
                return new RenderNipponites(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraSpectrovenator.class, new IRenderFactory<EntityPrehistoricFloraSpectrovenator>() {
            @Override
            public Render<? super EntityPrehistoricFloraSpectrovenator> createRenderFor(RenderManager manager) {
                return new RenderSpectrovenator(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraAmakusaichthys.class, new IRenderFactory<EntityPrehistoricFloraAmakusaichthys>() {
            @Override
            public Render<? super EntityPrehistoricFloraAmakusaichthys> createRenderFor(RenderManager manager) {
                return new RenderAmakusaichthys(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraSasayamagnomus.class, new IRenderFactory<EntityPrehistoricFloraSasayamagnomus>() {
            @Override
            public Render<? super EntityPrehistoricFloraSasayamagnomus> createRenderFor(RenderManager manager) {
                return new RenderSasayamagnomus(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraShokawa.class, new IRenderFactory<EntityPrehistoricFloraShokawa>() {
            @Override
            public Render<? super EntityPrehistoricFloraShokawa> createRenderFor(RenderManager manager) {
                return new RenderShokawa(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraShirerpeton.class, new IRenderFactory<EntityPrehistoricFloraShirerpeton>() {
            @Override
            public Render<? super EntityPrehistoricFloraShirerpeton> createRenderFor(RenderManager manager) {
                return new RenderShirerpeton(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraKujiberotha.class, new IRenderFactory<EntityPrehistoricFloraKujiberotha>() {
            @Override
            public Render<? super EntityPrehistoricFloraKujiberotha> createRenderFor(RenderManager manager) {
                return new RenderKujiberotha(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraCretosaja.class, new IRenderFactory<EntityPrehistoricFloraCretosaja>() {
            @Override
            public Render<? super EntityPrehistoricFloraCretosaja> createRenderFor(RenderManager manager) {
                return new RenderCretosaja(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraMonjurosuchus.class, new IRenderFactory<EntityPrehistoricFloraMonjurosuchus>() {
            @Override
            public Render<? super EntityPrehistoricFloraMonjurosuchus> createRenderFor(RenderManager manager) {
                return new RenderMonjurosuchus(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraHakusanobaatar.class, new IRenderFactory<EntityPrehistoricFloraHakusanobaatar>() {
            @Override
            public Render<? super EntityPrehistoricFloraHakusanobaatar> createRenderFor(RenderManager manager) {
                return new RenderHakusanobaatar(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraJinjuichthys.class, new IRenderFactory<EntityPrehistoricFloraJinjuichthys>() {
            @Override
            public Render<? super EntityPrehistoricFloraJinjuichthys> createRenderFor(RenderManager manager) {
                return new RenderJinjuichthys(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraSasayamamylos.class, new IRenderFactory<EntityPrehistoricFloraSasayamamylos>() {
            @Override
            public Render<? super EntityPrehistoricFloraSasayamamylos> createRenderFor(RenderManager manager) {
                return new RenderSasayamamylos(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraKokuraichthys.class, new IRenderFactory<EntityPrehistoricFloraKokuraichthys>() {
            @Override
            public Render<? super EntityPrehistoricFloraKokuraichthys> createRenderFor(RenderManager manager) {
                return new RenderKokuraichthys(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraChuhsiungichthys.class, new IRenderFactory<EntityPrehistoricFloraChuhsiungichthys>() {
            @Override
            public Render<? super EntityPrehistoricFloraChuhsiungichthys> createRenderFor(RenderManager manager) {
                return new RenderChuhsiungichthys(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraFukuititan.class, new IRenderFactory<EntityPrehistoricFloraFukuititan>() {
            @Override
            public Render<? super EntityPrehistoricFloraFukuititan> createRenderFor(RenderManager manager) {
                return new RenderFukuititan(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraTambatitanis.class, new IRenderFactory<EntityPrehistoricFloraTambatitanis>() {
            @Override
            public Render<? super EntityPrehistoricFloraTambatitanis> createRenderFor(RenderManager manager) {
                return new RenderTambatitanis(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraHyogobatrachus.class, new IRenderFactory<EntityPrehistoricFloraHyogobatrachus>() {
            @Override
            public Render<? super EntityPrehistoricFloraHyogobatrachus> createRenderFor(RenderManager manager) {
                return new RenderHyogobatrachus(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraParaleptolepis.class, new IRenderFactory<EntityPrehistoricFloraParaleptolepis>() {
            @Override
            public Render<? super EntityPrehistoricFloraParaleptolepis> createRenderFor(RenderManager manager) {
                return new RenderParaleptolepis(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraNipponamia.class, new IRenderFactory<EntityPrehistoricFloraNipponamia>() {
            @Override
            public Render<? super EntityPrehistoricFloraNipponamia> createRenderFor(RenderManager manager) {
                return new RenderNipponamia(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraWakinoichthys.class, new IRenderFactory<EntityPrehistoricFloraWakinoichthys>() {
            @Override
            public Render<? super EntityPrehistoricFloraWakinoichthys> createRenderFor(RenderManager manager) {
                return new RenderWakinoichthys(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraKaganaias.class, new IRenderFactory<EntityPrehistoricFloraKaganaias>() {
            @Override
            public Render<? super EntityPrehistoricFloraKaganaias> createRenderFor(RenderManager manager) {
                return new RenderKaganaias(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraKuwajimalla.class, new IRenderFactory<EntityPrehistoricFloraKuwajimalla>() {
            @Override
            public Render<? super EntityPrehistoricFloraKuwajimalla> createRenderFor(RenderManager manager) {
                return new RenderKuwajimalla(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraHypnovenator.class, new IRenderFactory<EntityPrehistoricFloraHypnovenator>() {
            @Override
            public Render<? super EntityPrehistoricFloraHypnovenator> createRenderFor(RenderManager manager) {
                return new RenderHypnovenator(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraTyrannomimus.class, new IRenderFactory<EntityPrehistoricFloraTyrannomimus>() {
            @Override
            public Render<? super EntityPrehistoricFloraTyrannomimus> createRenderFor(RenderManager manager) {
                return new RenderTyrannomimus(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraFukuiraptor.class, new IRenderFactory<EntityPrehistoricFloraFukuiraptor>() {
            @Override
            public Render<? super EntityPrehistoricFloraFukuiraptor> createRenderFor(RenderManager manager) {
                return new RenderFukuiraptor(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraFukuivenator.class, new IRenderFactory<EntityPrehistoricFloraFukuivenator>() {
            @Override
            public Render<? super EntityPrehistoricFloraFukuivenator> createRenderFor(RenderManager manager) {
                return new RenderFukuivenator(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraFutabasaurus.class, new IRenderFactory<EntityPrehistoricFloraFutabasaurus>() {
            @Override
            public Render<? super EntityPrehistoricFloraFutabasaurus> createRenderFor(RenderManager manager) {
                return new RenderFutabasaurus(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraPhosphorosaurus.class, new IRenderFactory<EntityPrehistoricFloraPhosphorosaurus>() {
            @Override
            public Render<? super EntityPrehistoricFloraPhosphorosaurus> createRenderFor(RenderManager manager) {
                return new RenderPhosphorosaurus(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraMegapterygius.class, new IRenderFactory<EntityPrehistoricFloraMegapterygius>() {
            @Override
            public Render<? super EntityPrehistoricFloraMegapterygius> createRenderFor(RenderManager manager) {
                return new RenderMegapterygius(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraKamuysaurus.class, new IRenderFactory<EntityPrehistoricFloraKamuysaurus>() {
            @Override
            public Render<? super EntityPrehistoricFloraKamuysaurus> createRenderFor(RenderManager manager) {
                return new RenderKamuysaurus(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraFukuisaurus.class, new IRenderFactory<EntityPrehistoricFloraFukuisaurus>() {
            @Override
            public Render<? super EntityPrehistoricFloraFukuisaurus> createRenderFor(RenderManager manager) {
                return new RenderFukuisaurus(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraUtahraptor.class, new IRenderFactory<EntityPrehistoricFloraUtahraptor>() {
            @Override
            public Render<? super EntityPrehistoricFloraUtahraptor> createRenderFor(RenderManager manager) {
                return new RenderUtahraptor(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraKoleken.class, new IRenderFactory<EntityPrehistoricFloraKoleken>() {
            @Override
            public Render<? super EntityPrehistoricFloraKoleken> createRenderFor(RenderManager manager) {
                return new RenderKoleken(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraFukuipteryx.class, new IRenderFactory<EntityPrehistoricFloraFukuipteryx>() {
            @Override
            public Render<? super EntityPrehistoricFloraFukuipteryx> createRenderFor(RenderManager manager) {
                return new RenderFukuipteryx(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraSapeornis.class, new IRenderFactory<EntityPrehistoricFloraSapeornis>() {
            @Override
            public Render<? super EntityPrehistoricFloraSapeornis> createRenderFor(RenderManager manager) {
                return new RenderSapeornis(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraNoripterus.class, new IRenderFactory<EntityPrehistoricFloraNoripterus>() {
            @Override
            public Render<? super EntityPrehistoricFloraNoripterus> createRenderFor(RenderManager manager) {
                return new RenderNoripterus(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraConfuciusornis.class, new IRenderFactory<EntityPrehistoricFloraConfuciusornis>() {
            @Override
            public Render<? super EntityPrehistoricFloraConfuciusornis> createRenderFor(RenderManager manager) {
                return new RenderConfuciusornis(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraJoinvillichthys.class, new IRenderFactory<EntityPrehistoricFloraJoinvillichthys>() {
            @Override
            public Render<? super EntityPrehistoricFloraJoinvillichthys> createRenderFor(RenderManager manager) {
                return new RenderJoinvillichthys(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraRhinopycnodus.class, new IRenderFactory<EntityPrehistoricFloraRhinopycnodus>() {
            @Override
            public Render<? super EntityPrehistoricFloraRhinopycnodus> createRenderFor(RenderManager manager) {
                return new RenderRhinopycnodus(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraSigmapycnodus.class, new IRenderFactory<EntityPrehistoricFloraSigmapycnodus>() {
            @Override
            public Render<? super EntityPrehistoricFloraSigmapycnodus> createRenderFor(RenderManager manager) {
                return new RenderSigmapycnodus(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraPlectocretacicus.class, new IRenderFactory<EntityPrehistoricFloraPlectocretacicus>() {
            @Override
            public Render<? super EntityPrehistoricFloraPlectocretacicus> createRenderFor(RenderManager manager) {
                return new RenderPlectocretacicus(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraRhamphoichthys.class, new IRenderFactory<EntityPrehistoricFloraRhamphoichthys>() {
            @Override
            public Render<? super EntityPrehistoricFloraRhamphoichthys> createRenderFor(RenderManager manager) {
                return new RenderRhamphoichthys(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraPankowskichthys.class, new IRenderFactory<EntityPrehistoricFloraPankowskichthys>() {
            @Override
            public Render<? super EntityPrehistoricFloraPankowskichthys> createRenderFor(RenderManager manager) {
                return new RenderPankowskichthys(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraHensodon.class, new IRenderFactory<EntityPrehistoricFloraHensodon>() {
            @Override
            public Render<? super EntityPrehistoricFloraHensodon> createRenderFor(RenderManager manager) {
                return new RenderHensodon(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraTricerichthys.class, new IRenderFactory<EntityPrehistoricFloraTricerichthys>() {
            @Override
            public Render<? super EntityPrehistoricFloraTricerichthys> createRenderFor(RenderManager manager) {
                return new RenderTricerichthys(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraRostropycnodus.class, new IRenderFactory<EntityPrehistoricFloraRostropycnodus>() {
            @Override
            public Render<? super EntityPrehistoricFloraRostropycnodus> createRenderFor(RenderManager manager) {
                return new RenderRostropycnodus(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraHayolperichthys.class, new IRenderFactory<EntityPrehistoricFloraHayolperichthys>() {
            @Override
            public Render<? super EntityPrehistoricFloraHayolperichthys> createRenderFor(RenderManager manager) {
                return new RenderHayolperichthys(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraStenoprotome.class, new IRenderFactory<EntityPrehistoricFloraStenoprotome>() {
            @Override
            public Render<? super EntityPrehistoricFloraStenoprotome> createRenderFor(RenderManager manager) {
                return new RenderStenoprotome(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraMaraldichthys.class, new IRenderFactory<EntityPrehistoricFloraMaraldichthys>() {
            @Override
            public Render<? super EntityPrehistoricFloraMaraldichthys> createRenderFor(RenderManager manager) {
                return new RenderMaraldichthys(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraMacropenaeus.class, new IRenderFactory<EntityPrehistoricFloraMacropenaeus>() {
            @Override
            public Render<? super EntityPrehistoricFloraMacropenaeus> createRenderFor(RenderManager manager) {
                return new RenderMacropenaeus(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraAcrognathus.class, new IRenderFactory<EntityPrehistoricFloraAcrognathus>() {
            @Override
            public Render<? super EntityPrehistoricFloraAcrognathus> createRenderFor(RenderManager manager) {
                return new RenderAcrognathus(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraLissoberyx.class, new IRenderFactory<EntityPrehistoricFloraLissoberyx>() {
            @Override
            public Render<? super EntityPrehistoricFloraLissoberyx> createRenderFor(RenderManager manager) {
                return new RenderLissoberyx(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraParacoccodus.class, new IRenderFactory<EntityPrehistoricFloraParacoccodus>() {
            @Override
            public Render<? super EntityPrehistoricFloraParacoccodus> createRenderFor(RenderManager manager) {
                return new RenderParacoccodus(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraCretapantodon.class, new IRenderFactory<EntityPrehistoricFloraCretapantodon>() {
            @Override
            public Render<? super EntityPrehistoricFloraCretapantodon> createRenderFor(RenderManager manager) {
                return new RenderCretapantodon(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraHakelia.class, new IRenderFactory<EntityPrehistoricFloraHakelia>() {
            @Override
            public Render<? super EntityPrehistoricFloraHakelia> createRenderFor(RenderManager manager) {
                return new RenderHakelia(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraMesiteia.class, new IRenderFactory<EntityPrehistoricFloraMesiteia>() {
            @Override
            public Render<? super EntityPrehistoricFloraMesiteia> createRenderFor(RenderManager manager) {
                return new RenderMesiteia(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraEubiodectes.class, new IRenderFactory<EntityPrehistoricFloraEubiodectes>() {
            @Override
            public Render<? super EntityPrehistoricFloraEubiodectes> createRenderFor(RenderManager manager) {
                return new RenderEubiodectes(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraCyclobatis.class, new IRenderFactory<EntityPrehistoricFloraCyclobatis>() {
            @Override
            public Render<? super EntityPrehistoricFloraCyclobatis> createRenderFor(RenderManager manager) {
                return new RenderCyclobatis(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraIchthyoceros.class, new IRenderFactory<EntityPrehistoricFloraIchthyoceros>() {
            @Override
            public Render<? super EntityPrehistoricFloraIchthyoceros> createRenderFor(RenderManager manager) {
                return new RenderIchthyoceros(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraExocoetoides.class, new IRenderFactory<EntityPrehistoricFloraExocoetoides>() {
            @Override
            public Render<? super EntityPrehistoricFloraExocoetoides> createRenderFor(RenderManager manager) {
                return new RenderExocoetoides(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraGladiopycnodus.class, new IRenderFactory<EntityPrehistoricFloraGladiopycnodus>() {
            @Override
            public Render<? super EntityPrehistoricFloraGladiopycnodus> createRenderFor(RenderManager manager) {
                return new RenderGladiopycnodus(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraDucrotayichthys.class, new IRenderFactory<EntityPrehistoricFloraDucrotayichthys>() {
            @Override
            public Render<? super EntityPrehistoricFloraDucrotayichthys> createRenderFor(RenderManager manager) {
                return new RenderDucrotayichthys(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraPrionolepis.class, new IRenderFactory<EntityPrehistoricFloraPrionolepis>() {
            @Override
            public Render<? super EntityPrehistoricFloraPrionolepis> createRenderFor(RenderManager manager) {
                return new RenderPrionolepis(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraRhynchodercetis.class, new IRenderFactory<EntityPrehistoricFloraRhynchodercetis>() {
            @Override
            public Render<? super EntityPrehistoricFloraRhynchodercetis> createRenderFor(RenderManager manager) {
                return new RenderRhynchodercetis(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraAnguillavus.class, new IRenderFactory<EntityPrehistoricFloraAnguillavus>() {
            @Override
            public Render<? super EntityPrehistoricFloraAnguillavus> createRenderFor(RenderManager manager) {
                return new RenderAnguillavus(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraHayenchelys.class, new IRenderFactory<EntityPrehistoricFloraHayenchelys>() {
            @Override
            public Render<? super EntityPrehistoricFloraHayenchelys> createRenderFor(RenderManager manager) {
                return new RenderHayenchelys(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraArmigatus.class, new IRenderFactory<EntityPrehistoricFloraArmigatus>() {
            @Override
            public Render<? super EntityPrehistoricFloraArmigatus> createRenderFor(RenderManager manager) {
                return new RenderArmigatus(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraHaqelpycnodus.class, new IRenderFactory<EntityPrehistoricFloraHaqelpycnodus>() {
            @Override
            public Render<? super EntityPrehistoricFloraHaqelpycnodus> createRenderFor(RenderManager manager) {
                return new RenderHaqelpycnodus(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraHaimirichia.class, new IRenderFactory<EntityPrehistoricFloraHaimirichia>() {
            @Override
            public Render<? super EntityPrehistoricFloraHaimirichia> createRenderFor(RenderManager manager) {
                return new RenderHaimirichia(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraGebrayelichthys.class, new IRenderFactory<EntityPrehistoricFloraGebrayelichthys>() {
            @Override
            public Render<? super EntityPrehistoricFloraGebrayelichthys> createRenderFor(RenderManager manager) {
                return new RenderGebrayelichthys(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraCorusichthys.class, new IRenderFactory<EntityPrehistoricFloraCorusichthys>() {
            @Override
            public Render<? super EntityPrehistoricFloraCorusichthys> createRenderFor(RenderManager manager) {
                return new RenderCorusichthys(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraFlagellipinna.class, new IRenderFactory<EntityPrehistoricFloraFlagellipinna>() {
            @Override
            public Render<? super EntityPrehistoricFloraFlagellipinna> createRenderFor(RenderManager manager) {
                return new RenderFlagellipinna(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraEusebichthys.class, new IRenderFactory<EntityPrehistoricFloraEusebichthys>() {
            @Override
            public Render<? super EntityPrehistoricFloraEusebichthys> createRenderFor(RenderManager manager) {
                return new RenderEusebichthys(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraHeterothrissa.class, new IRenderFactory<EntityPrehistoricFloraHeterothrissa>() {
            @Override
            public Render<? super EntityPrehistoricFloraHeterothrissa> createRenderFor(RenderManager manager) {
                return new RenderHeterothrissa(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraEupodophis.class, new IRenderFactory<EntityPrehistoricFloraEupodophis>() {
            @Override
            public Render<? super EntityPrehistoricFloraEupodophis> createRenderFor(RenderManager manager) {
                return new RenderEupodophis(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraAnomalochelys.class, new IRenderFactory<EntityPrehistoricFloraAnomalochelys>() {
            @Override
            public Render<? super EntityPrehistoricFloraAnomalochelys> createRenderFor(RenderManager manager) {
                return new RenderAnomalochelys(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraAdocus.class, new IRenderFactory<EntityPrehistoricFloraAdocus>() {
            @Override
            public Render<? super EntityPrehistoricFloraAdocus> createRenderFor(RenderManager manager) {
                return new RenderAdocus(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraBrodiechelys.class, new IRenderFactory<EntityPrehistoricFloraBrodiechelys>() {
            @Override
            public Render<? super EntityPrehistoricFloraBrodiechelys> createRenderFor(RenderManager manager) {
                return new RenderBrodiechelys(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraNaomichelys.class, new IRenderFactory<EntityPrehistoricFloraNaomichelys>() {
            @Override
            public Render<? super EntityPrehistoricFloraNaomichelys> createRenderFor(RenderManager manager) {
                return new RenderNaomichelys(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraMesodermochelys.class, new IRenderFactory<EntityPrehistoricFloraMesodermochelys>() {
            @Override
            public Render<? super EntityPrehistoricFloraMesodermochelys> createRenderFor(RenderManager manager) {
                return new RenderMesodermochelys(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraSinemys.class, new IRenderFactory<EntityPrehistoricFloraSinemys>() {
            @Override
            public Render<? super EntityPrehistoricFloraSinemys> createRenderFor(RenderManager manager) {
                return new RenderSinemys(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraAnjiaspis.class, new IRenderFactory<EntityPrehistoricFloraAnjiaspis>() {
            @Override
            public Render<? super EntityPrehistoricFloraAnjiaspis> createRenderFor(RenderManager manager) {
                return new RenderAnjiaspis(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraForeyclupea.class, new IRenderFactory<EntityPrehistoricFloraForeyclupea>() {
            @Override
            public Render<? super EntityPrehistoricFloraForeyclupea> createRenderFor(RenderManager manager) {
                return new RenderForeyclupea(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraChalawan.class, new IRenderFactory<EntityPrehistoricFloraChalawan>() {
            @Override
            public Render<? super EntityPrehistoricFloraChalawan> createRenderFor(RenderManager manager) {
                return new RenderChalawan(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraPseudarthron.class, new IRenderFactory<EntityPrehistoricFloraPseudarthron>() {
            @Override
            public Render<? super EntityPrehistoricFloraPseudarthron> createRenderFor(RenderManager manager) {
                return new RenderPseudarthron(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraDentilepisosteus.class, new IRenderFactory<EntityPrehistoricFloraDentilepisosteus>() {
            @Override
            public Render<? super EntityPrehistoricFloraDentilepisosteus> createRenderFor(RenderManager manager) {
                return new RenderDentilepisosteus(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraEoconfuciusornis.class, new IRenderFactory<EntityPrehistoricFloraEoconfuciusornis>() {
            @Override
            public Render<? super EntityPrehistoricFloraEoconfuciusornis> createRenderFor(RenderManager manager) {
                return new RenderEoconfuciusornis(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraProcompsognathus.class, new IRenderFactory<EntityPrehistoricFloraProcompsognathus>() {
            @Override
            public Render<? super EntityPrehistoricFloraProcompsognathus> createRenderFor(RenderManager manager) {
                return new RenderProcompsognathus(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraTurfania.class, new IRenderFactory<EntityPrehistoricFloraTurfania>() {
            @Override
            public Render<? super EntityPrehistoricFloraTurfania> createRenderFor(RenderManager manager) {
                return new RenderTurfania(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraTrypanognathus.class, new IRenderFactory<EntityPrehistoricFloraTrypanognathus>() {
            @Override
            public Render<? super EntityPrehistoricFloraTrypanognathus> createRenderFor(RenderManager manager) {
                return new RenderTrypanognathus(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraErettopterus.class, new IRenderFactory<EntityPrehistoricFloraErettopterus>() {
            @Override
            public Render<? super EntityPrehistoricFloraErettopterus> createRenderFor(RenderManager manager) {
                return new RenderErettopterus(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraKururubatrachus.class, new IRenderFactory<EntityPrehistoricFloraKururubatrachus>() {
            @Override
            public Render<? super EntityPrehistoricFloraKururubatrachus> createRenderFor(RenderManager manager) {
                return new RenderKururubatrachus(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraAmericaspis.class, new IRenderFactory<EntityPrehistoricFloraAmericaspis>() {
            @Override
            public Render<? super EntityPrehistoricFloraAmericaspis> createRenderFor(RenderManager manager) {
                return new RenderAmericaspis(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraVictalimulus.class, new IRenderFactory<EntityPrehistoricFloraVictalimulus>() {
            @Override
            public Render<? super EntityPrehistoricFloraVictalimulus> createRenderFor(RenderManager manager) {
                return new RenderVictalimulus(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraMosura.class, new IRenderFactory<EntityPrehistoricFloraMosura>() {
            @Override
            public Render<? super EntityPrehistoricFloraMosura> createRenderFor(RenderManager manager) {
                return new RenderMosura(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraAraripemys.class, new IRenderFactory<EntityPrehistoricFloraAraripemys>() {
            @Override
            public Render<? super EntityPrehistoricFloraAraripemys> createRenderFor(RenderManager manager) {
                return new RenderAraripemys(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraPtyktoptychion.class, new IRenderFactory<EntityPrehistoricFloraPtyktoptychion>() {
            @Override
            public Render<? super EntityPrehistoricFloraPtyktoptychion> createRenderFor(RenderManager manager) {
                return new RenderPtyktoptychion(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraGenibatrachus.class, new IRenderFactory<EntityPrehistoricFloraGenibatrachus>() {
            @Override
            public Render<? super EntityPrehistoricFloraGenibatrachus> createRenderFor(RenderManager manager) {
                return new RenderGenibatrachus(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraAngelacanthus.class, new IRenderFactory<EntityPrehistoricFloraAngelacanthus>() {
            @Override
            public Render<? super EntityPrehistoricFloraAngelacanthus> createRenderFor(RenderManager manager) {
                return new RenderAngelacanthus(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraHomalonotus.class, new IRenderFactory<EntityPrehistoricFloraHomalonotus>() {
            @Override
            public Render<? super EntityPrehistoricFloraHomalonotus> createRenderFor(RenderManager manager) {
                return new RenderHomalonotus(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraAraxoceras.class, new IRenderFactory<EntityPrehistoricFloraAraxoceras>() {
            @Override
            public Render<? super EntityPrehistoricFloraAraxoceras> createRenderFor(RenderManager manager) {
                return new RenderAraxoceras(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraXiyuichthys.class, new IRenderFactory<EntityPrehistoricFloraXiyuichthys>() {
            @Override
            public Render<? super EntityPrehistoricFloraXiyuichthys> createRenderFor(RenderManager manager) {
                return new RenderXiyuichthys(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraHelodus.class, new IRenderFactory<EntityPrehistoricFloraHelodus>() {
            @Override
            public Render<? super EntityPrehistoricFloraHelodus> createRenderFor(RenderManager manager) {
                return new RenderHelodus(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraTriodus.class, new IRenderFactory<EntityPrehistoricFloraTriodus>() {
            @Override
            public Render<? super EntityPrehistoricFloraTriodus> createRenderFor(RenderManager manager) {
                return new RenderTriodus(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraHuanghelepis.class, new IRenderFactory<EntityPrehistoricFloraHuanghelepis>() {
            @Override
            public Render<? super EntityPrehistoricFloraHuanghelepis> createRenderFor(RenderManager manager) {
                return new RenderHuanhelepis(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraLeptostyrax.class, new IRenderFactory<EntityPrehistoricFloraLeptostyrax>() {
            @Override
            public Render<? super EntityPrehistoricFloraLeptostyrax> createRenderFor(RenderManager manager) {
                return new RenderLeptostyrax(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraGerobatrachus.class, new IRenderFactory<EntityPrehistoricFloraGerobatrachus>() {
            @Override
            public Render<? super EntityPrehistoricFloraGerobatrachus> createRenderFor(RenderManager manager) {
                return new RenderGerobatrachus(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraOrthacanthus.class, new IRenderFactory<EntityPrehistoricFloraOrthacanthus>() {
            @Override
            public Render<? super EntityPrehistoricFloraOrthacanthus> createRenderFor(RenderManager manager) {
                return new RenderOrthacanthus(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraBoreopricea.class, new IRenderFactory<EntityPrehistoricFloraBoreopricea>() {
            @Override
            public Render<? super EntityPrehistoricFloraBoreopricea> createRenderFor(RenderManager manager) {
                return new RenderBoreopricea(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraMegachirella.class, new IRenderFactory<EntityPrehistoricFloraMegachirella>() {
            @Override
            public Render<? super EntityPrehistoricFloraMegachirella> createRenderFor(RenderManager manager) {
                return new RenderMegachirella(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraMaghriboselache.class, new IRenderFactory<EntityPrehistoricFloraMaghriboselache>() {
            @Override
            public Render<? super EntityPrehistoricFloraMaghriboselache> createRenderFor(RenderManager manager) {
                return new RenderMaghriboselache(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraScapanorhynchus.class, new IRenderFactory<EntityPrehistoricFloraScapanorhynchus>() {
            @Override
            public Render<? super EntityPrehistoricFloraScapanorhynchus> createRenderFor(RenderManager manager) {
                return new RenderScapanorhynchus(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraAetosauroides.class, new IRenderFactory<EntityPrehistoricFloraAetosauroides>() {
            @Override
            public Render<? super EntityPrehistoricFloraAetosauroides> createRenderFor(RenderManager manager) {
                return new RenderAetosauroides(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraTaquetochelys.class, new IRenderFactory<EntityPrehistoricFloraTaquetochelys>() {
            @Override
            public Render<? super EntityPrehistoricFloraTaquetochelys> createRenderFor(RenderManager manager) {
                return new RenderTaquetochelys(manager);
            }
        });

        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraIrritator.class, new IRenderFactory<EntityPrehistoricFloraIrritator>() {
            @Override
            public Render<? super EntityPrehistoricFloraIrritator> createRenderFor(RenderManager manager) {
                return new RenderIrritator(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraSpinosaurus.class, new IRenderFactory<EntityPrehistoricFloraSpinosaurus>() {
            @Override
            public Render<? super EntityPrehistoricFloraSpinosaurus> createRenderFor(RenderManager manager) {
                return new RenderSpinosaurus(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraSuchomimus.class, new IRenderFactory<EntityPrehistoricFloraSuchomimus>() {
            @Override
            public Render<? super EntityPrehistoricFloraSuchomimus> createRenderFor(RenderManager manager) {
                return new RenderSuchomimus(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraBaryonyx.class, new IRenderFactory<EntityPrehistoricFloraBaryonyx>() {
            @Override
            public Render<? super EntityPrehistoricFloraBaryonyx> createRenderFor(RenderManager manager) {
                return new RenderBaryonyx(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraEctenaspis.class, new IRenderFactory<EntityPrehistoricFloraEctenaspis>() {
            @Override
            public Render<? super EntityPrehistoricFloraEctenaspis> createRenderFor(RenderManager manager) {
                return new RenderEctenaspis(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraEotyrannus.class, new IRenderFactory<EntityPrehistoricFloraEotyrannus>() {
            @Override
            public Render<? super EntityPrehistoricFloraEotyrannus> createRenderFor(RenderManager manager) {
                return new RenderEotyrannus(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraYutyrannus.class, new IRenderFactory<EntityPrehistoricFloraYutyrannus>() {
            @Override
            public Render<? super EntityPrehistoricFloraYutyrannus> createRenderFor(RenderManager manager) {
                return new RenderYutyrannus(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraMicroraptor.class, new IRenderFactory<EntityPrehistoricFloraMicroraptor>() {
            @Override
            public Render<? super EntityPrehistoricFloraMicroraptor> createRenderFor(RenderManager manager) {
                return new RenderMicroraptor(manager);
            }
        });

        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraIchthyovenator.class, new IRenderFactory<EntityPrehistoricFloraIchthyovenator>() {
            @Override
            public Render<? super EntityPrehistoricFloraIchthyovenator> createRenderFor(RenderManager manager) {
                return new RenderIchthyovenator(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraIberospinus.class, new IRenderFactory<EntityPrehistoricFloraIberospinus>() {
            @Override
            public Render<? super EntityPrehistoricFloraIberospinus> createRenderFor(RenderManager manager) {
                return new RenderIberospinus(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraVallibonavenatrix.class, new IRenderFactory<EntityPrehistoricFloraVallibonavenatrix>() {
            @Override
            public Render<? super EntityPrehistoricFloraVallibonavenatrix> createRenderFor(RenderManager manager) {
                return new RenderVallibonavenatrix(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraChangxingaspis.class, new IRenderFactory<EntityPrehistoricFloraChangxingaspis>() {
            @Override
            public Render<? super EntityPrehistoricFloraChangxingaspis> createRenderFor(RenderManager manager) {
                return new RenderChangxingaspis(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraLoganellia.class, new IRenderFactory<EntityPrehistoricFloraLoganellia>() {
            @Override
            public Render<? super EntityPrehistoricFloraLoganellia> createRenderFor(RenderManager manager) {
                return new RenderLoganellia(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraBianchengichthys.class, new IRenderFactory<EntityPrehistoricFloraBianchengichthys>() {
            @Override
            public Render<? super EntityPrehistoricFloraBianchengichthys> createRenderFor(RenderManager manager) {
                return new RenderBianchengichthys(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraArchipelepis.class, new IRenderFactory<EntityPrehistoricFloraArchipelepis>() {
            @Override
            public Render<? super EntityPrehistoricFloraArchipelepis> createRenderFor(RenderManager manager) {
                return new RenderArchipelepis(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraPetrolacosaurus.class, new IRenderFactory<EntityPrehistoricFloraPetrolacosaurus>() {
            @Override
            public Render<? super EntityPrehistoricFloraPetrolacosaurus> createRenderFor(RenderManager manager) {
                return new RenderPetrolacosaurus(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraAegirosaurus.class, new IRenderFactory<EntityPrehistoricFloraAegirosaurus>() {
            @Override
            public Render<? super EntityPrehistoricFloraAegirosaurus> createRenderFor(RenderManager manager) {
                return new RenderAegirosaurus(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraNorellius.class, new IRenderFactory<EntityPrehistoricFloraNorellius>() {
            @Override
            public Render<? super EntityPrehistoricFloraNorellius> createRenderFor(RenderManager manager) {
                return new RenderNorellius(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraBothriolepis.class, new IRenderFactory<EntityPrehistoricFloraBothriolepis>() {
            @Override
            public Render<? super EntityPrehistoricFloraBothriolepis> createRenderFor(RenderManager manager) {
                return new RenderBothriolepis(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraHolonema.class, new IRenderFactory<EntityPrehistoricFloraHolonema>() {
            @Override
            public Render<? super EntityPrehistoricFloraHolonema> createRenderFor(RenderManager manager) {
                return new RenderHolonema(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraEntelognathus.class, new IRenderFactory<EntityPrehistoricFloraEntelognathus>() {
            @Override
            public Render<? super EntityPrehistoricFloraEntelognathus> createRenderFor(RenderManager manager) {
                return new RenderEntelognathus(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraConcentrilepis.class, new IRenderFactory<EntityPrehistoricFloraConcentrilepis>() {
            @Override
            public Render<? super EntityPrehistoricFloraConcentrilepis> createRenderFor(RenderManager manager) {
                return new RenderConcentrilepis(manager);
            }
        });    
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraOlorotitan.class, new IRenderFactory<EntityPrehistoricFloraOlorotitan>() {
            @Override
            public Render<? super EntityPrehistoricFloraOlorotitan> createRenderFor(RenderManager manager) {
                return new RenderOlorotitan(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraConcavenator.class, new IRenderFactory<EntityPrehistoricFloraConcavenator>() {
            @Override
            public Render<? super EntityPrehistoricFloraConcavenator> createRenderFor(RenderManager manager) {
                return new RenderConcavenator(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraOuranosaurus.class, new IRenderFactory<EntityPrehistoricFloraOuranosaurus>() {
            @Override
            public Render<? super EntityPrehistoricFloraOuranosaurus> createRenderFor(RenderManager manager) {
                return new RenderOuranosaurus(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraCtenosauriscus.class, new IRenderFactory<EntityPrehistoricFloraCtenosauriscus>() {
            @Override
            public Render<? super EntityPrehistoricFloraCtenosauriscus> createRenderFor(RenderManager manager) {
                return new RenderCtenosauriscus(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraXilousuchus.class, new IRenderFactory<EntityPrehistoricFloraXilousuchus>() {
            @Override
            public Render<? super EntityPrehistoricFloraXilousuchus> createRenderFor(RenderManager manager) {
                return new RenderXilousuchus(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraAellopobatis.class, new IRenderFactory<EntityPrehistoricFloraAellopobatis>() {
            @Override
            public Render<? super EntityPrehistoricFloraAellopobatis> createRenderFor(RenderManager manager) {
                return new RenderAellopobatis(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraIansan.class, new IRenderFactory<EntityPrehistoricFloraIansan>() {
            @Override
            public Render<? super EntityPrehistoricFloraIansan> createRenderFor(RenderManager manager) {
                return new RenderIansan(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraMirasaura.class, new IRenderFactory<EntityPrehistoricFloraMirasaura>() {
            @Override
            public Render<? super EntityPrehistoricFloraMirasaura> createRenderFor(RenderManager manager) {
                return new RenderMirasaura(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraBajadasaurus.class, new IRenderFactory<EntityPrehistoricFloraBajadasaurus>() {
            @Override
            public Render<? super EntityPrehistoricFloraBajadasaurus> createRenderFor(RenderManager manager) {
                return new RenderBajadasaurus(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraAmargasaurus.class, new IRenderFactory<EntityPrehistoricFloraAmargasaurus>() {
            @Override
            public Render<? super EntityPrehistoricFloraAmargasaurus> createRenderFor(RenderManager manager) {
                return new RenderAmargasaurus(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraProterochampsa.class, new IRenderFactory<EntityPrehistoricFloraProterochampsa>() {
            @Override
            public Render<? super EntityPrehistoricFloraProterochampsa> createRenderFor(RenderManager manager) {
                return new RenderProterochampsa(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraStemmatodus.class, new IRenderFactory<EntityPrehistoricFloraStemmatodus>() {
            @Override
            public Render<? super EntityPrehistoricFloraStemmatodus> createRenderFor(RenderManager manager) {
                return new RenderStemmatodus(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraHanduichthys.class, new IRenderFactory<EntityPrehistoricFloraHanduichthys>() {
            @Override
            public Render<? super EntityPrehistoricFloraHanduichthys> createRenderFor(RenderManager manager) {
                return new RenderHanduichthys(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraRichmondichthys.class, new IRenderFactory<EntityPrehistoricFloraRichmondichthys>() {
            @Override
            public Render<? super EntityPrehistoricFloraRichmondichthys> createRenderFor(RenderManager manager) {
                return new RenderRichmondichthys(manager);
            }
        });











        //Specials:
        RenderingRegistry.registerEntityRenderingHandler(EntityPNBoat.class, new IRenderFactory<EntityPNBoat>() {
            @Override
            public Render<? super EntityPNBoat> createRenderFor(RenderManager manager) {
                return new RenderPNBoat(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(PrehistoricFloraSubmarine.class, new IRenderFactory<PrehistoricFloraSubmarine>() {
            @Override
            public Render<? super PrehistoricFloraSubmarine> createRenderFor(RenderManager manager) {
                return new RenderSubmarine(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityRaft.class, new IRenderFactory<EntityRaft>() {
            @Override
            public Render<? super EntityRaft> createRenderFor(RenderManager manager) {
                return new RenderRaft(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraBuoy.class, new IRenderFactory<EntityPrehistoricFloraBuoy>() {
            @Override
            public Render<? super EntityPrehistoricFloraBuoy> createRenderFor(RenderManager manager) {
                return new RenderBuoy(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraGuanoBall.class, new IRenderFactory<EntityPrehistoricFloraGuanoBall>() {
            @Override
            public Render<? super EntityPrehistoricFloraGuanoBall> createRenderFor(RenderManager manager) {
                return new RenderSnowball(manager, ItemGuanoBall.block, Minecraft.getMinecraft().getRenderItem());
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraMeteor.class, new IRenderFactory<EntityPrehistoricFloraMeteor>() {
            @Override
            public Render<? super EntityPrehistoricFloraMeteor> createRenderFor(RenderManager manager) {
                return new RenderMeteor(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityVolcanoFireball.class, new IRenderFactory<EntityVolcanoFireball>() {
            @Override
            public Render<? super EntityVolcanoFireball> createRenderFor(RenderManager manager) {
                return new RenderVolcanoFireball(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntityPrehistoricFloraGuanoGolem.class, new IRenderFactory<EntityPrehistoricFloraGuanoGolem>() {
            @Override
            public Render<? super EntityPrehistoricFloraGuanoGolem> createRenderFor(RenderManager manager) {
                return new RenderGuanoGolem(manager);
            }
        });

        //Tile Entities:
        //-------------
        if (LepidodendronConfig.renderAnimations) {
            //Neoproterozoic (Ediacaran):
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
            ClientRegistry.bindTileEntitySpecialRenderer(BlockFrondophyllas.TileEntityCustom.class, new RenderFrondophyllas());
            ClientRegistry.bindTileEntitySpecialRenderer(BlockGigarimaneta.TileEntityCustom.class, new RenderGigarimaneta());
            ClientRegistry.bindTileEntitySpecialRenderer(BlockHylaecullulus.TileEntityCustom.class, new RenderHylaecullulus());
            ClientRegistry.bindTileEntitySpecialRenderer(BlockParacharnia.TileEntityCustom.class, new RenderParacharnia());
            //Cambrian:
            ClientRegistry.bindTileEntitySpecialRenderer(BlockStromatoveris.TileEntityCustom.class, new RenderStromatoveris());
            ClientRegistry.bindTileEntitySpecialRenderer(BlockThaumaptilon.TileEntityCustom.class, new RenderThaumaptilon());
            ClientRegistry.bindTileEntitySpecialRenderer(BlockShankouclava.TileEntityCustom.class, new RenderShankouclava());
            ClientRegistry.bindTileEntitySpecialRenderer(BlockMegasiphon.TileEntityCustom.class, new RenderMegasiphon());
        }

        //These do not have block models available:
        //Neoproterozoic (Ediacaran):
        ClientRegistry.bindTileEntitySpecialRenderer(BlockPteridinium.TileEntityCustom.class, new RenderPteridinium());
        ClientRegistry.bindTileEntitySpecialRenderer(BlockCoronacollina.TileEntityCustom.class, new RenderCoronacollina());
        //Cambrian:
        ClientRegistry.bindTileEntitySpecialRenderer(BlockHerpetogaster.TileEntityCustom.class, new RenderHerpetogaster());
        ClientRegistry.bindTileEntitySpecialRenderer(TileEntityFacivermis.class, new RenderFacivermis());
        //ClientRegistry.bindTileEntitySpecialRenderer(BlockOesia.TileEntityCustom.class, new RenderOesia());
        ClientRegistry.bindTileEntitySpecialRenderer(TileEntityGangtoucunia.class, new RenderGangtoucunia());
        ClientRegistry.bindTileEntitySpecialRenderer(BlockBrachiospongia.TileEntityCustom.class, new RenderBrachiospongia());
        //General:
        ClientRegistry.bindTileEntitySpecialRenderer(BlockSeaPenPink.TileEntityCustom.class, new RenderSeaPenPink());
        ClientRegistry.bindTileEntitySpecialRenderer(BlockSeaPenYellow.TileEntityCustom.class, new RenderSeaPenYellow());


        //Tile Entities Nautiloid shells etc:
        ClientRegistry.bindTileEntitySpecialRenderer(BlockFurcaster.TileEntityCustom.class, new RenderFurcasterItem());
        ClientRegistry.bindTileEntitySpecialRenderer(BlockVillebrunaster.TileEntityCustom.class, new RenderVillebrunasterItem());
        ClientRegistry.bindTileEntitySpecialRenderer(BlockUrasterella.TileEntityCustom.class, new RenderUrasterellaItem());
        ClientRegistry.bindTileEntitySpecialRenderer(BlockDecacuminaster.TileEntityCustom.class, new RenderDecacuminasterItem());
        ClientRegistry.bindTileEntitySpecialRenderer(BlockLepidaster.TileEntityCustom.class, new RenderLepidasterItem() );
        ClientRegistry.bindTileEntitySpecialRenderer(BlockHelianthaster.TileEntityCustom.class, new RenderHelianthasterItem());
        ClientRegistry.bindTileEntitySpecialRenderer(BlockLepidasterella.TileEntityCustom.class, new RenderLepidasterellaItem());
        ClientRegistry.bindTileEntitySpecialRenderer(BlockArchaeocidaris.TileEntityCustom.class, new RenderArchaeocidarisItem());
        ClientRegistry.bindTileEntitySpecialRenderer(BlockCidaroida.TileEntityCustom.class, new RenderCidaroidaItem());
        ClientRegistry.bindTileEntitySpecialRenderer(BlockHemiaster.TileEntityCustom.class, new RenderHemiasterItem());
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
        ClientRegistry.bindTileEntitySpecialRenderer(BlockNautiloidShellAmmonite_Perisphinctes.TileEntityCustom.class, new RenderNautiloidShellAmmonite_Perisphinctes());
        ClientRegistry.bindTileEntitySpecialRenderer(BlockNautiloidShellAphetoceras.TileEntityCustom.class, new RenderNautiloidShellAphetoceras());
        ClientRegistry.bindTileEntitySpecialRenderer(BlockNautiloidShellTetrameroceras.TileEntityCustom.class, new RenderNautiloidShellTetrameroceras());
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
        ClientRegistry.bindTileEntitySpecialRenderer(BlockNautiloidShellAscoceras.TileEntityCustom.class, new RenderNautiloidShellAscoceras());
        ClientRegistry.bindTileEntitySpecialRenderer(BlockNautiloidShellCassinoceras.TileEntityCustom.class, new RenderNautiloidShellCassinoceras());
        ClientRegistry.bindTileEntitySpecialRenderer(BlockNautiloidShellIvoites.TileEntityCustom.class, new RenderNautiloidShellIvoites());
        ClientRegistry.bindTileEntitySpecialRenderer(BlockNautiloidShellSphooceras.TileEntityCustom.class, new RenderNautiloidShellSphooceras());
        ClientRegistry.bindTileEntitySpecialRenderer(BlockNautiloidShellElephantoceras.TileEntityCustom.class, new RenderNautiloidShellElephantoceras());
        ClientRegistry.bindTileEntitySpecialRenderer(BlockNautiloidShellKosmoceras.TileEntityCustom.class, new RenderNautiloidShellKosmoceras());
        ClientRegistry.bindTileEntitySpecialRenderer(BlockNautiloidShellSpiroceras.TileEntityCustom.class, new RenderNautiloidShellSpiroceras());
        ClientRegistry.bindTileEntitySpecialRenderer(BlockNautiloidShellCenoceras.TileEntityCustom.class, new RenderNautiloidShellCenoceras());
        ClientRegistry.bindTileEntitySpecialRenderer(BlockNautiloidShellPhylloceras.TileEntityCustom.class, new RenderNautiloidShellPhylloceras());
        ClientRegistry.bindTileEntitySpecialRenderer(BlockNautiloidShellArcestes.TileEntityCustom.class, new RenderNautiloidShellArcestes());
        ClientRegistry.bindTileEntitySpecialRenderer(BlockNautiloidShellGoldringia.TileEntityCustom.class, new RenderNautiloidShellGoldringia());
        ClientRegistry.bindTileEntitySpecialRenderer(BlockNautiloidShellAnthracoceras.TileEntityCustom.class, new RenderNautiloidShellAnthracoceras());
        ClientRegistry.bindTileEntitySpecialRenderer(BlockNautiloidShellHamulina.TileEntityCustom.class, new RenderNautiloidShellHamulina());
        ClientRegistry.bindTileEntitySpecialRenderer(BlockNautiloidShellHypophylloceras.TileEntityCustom.class, new RenderNautiloidShellHypophylloceras());
        ClientRegistry.bindTileEntitySpecialRenderer(BlockNautiloidShellMoutoniceras.TileEntityCustom.class, new RenderNautiloidShellMoutoniceras());
        ClientRegistry.bindTileEntitySpecialRenderer(BlockNautiloidShellTropaeum.TileEntityCustom.class, new RenderNautiloidShellTropaeum());
        ClientRegistry.bindTileEntitySpecialRenderer(BlockNautiloidShellAustraliceras.TileEntityCustom.class, new RenderNautiloidShellAustraliceras());
        ClientRegistry.bindTileEntitySpecialRenderer(BlockNautiloidShellSoliclymenia.TileEntityCustom.class, new RenderNautiloidShellSoliclymenia());
        ClientRegistry.bindTileEntitySpecialRenderer(BlockNautiloidShellParawocklumeria.TileEntityCustom.class, new RenderNautiloidShellParawocklumeria());
        ClientRegistry.bindTileEntitySpecialRenderer(BlockNautiloidShellTropites.TileEntityCustom.class, new RenderNautiloidShellTropites());
        ClientRegistry.bindTileEntitySpecialRenderer(BlockNautiloidShellPinacoceras.TileEntityCustom.class, new RenderNautiloidShellPinacoceras());
        ClientRegistry.bindTileEntitySpecialRenderer(BlockNautiloidShellDissimilites.TileEntityCustom.class, new RenderNautiloidShellDissimilites());
        ClientRegistry.bindTileEntitySpecialRenderer(BlockNautiloidShellMortoniceras.TileEntityCustom.class, new RenderNautiloidShellMortoniceras());
        ClientRegistry.bindTileEntitySpecialRenderer(BlockNautiloidShellLytoceras.TileEntityCustom.class, new RenderNautiloidShellLytoceras());
        ClientRegistry.bindTileEntitySpecialRenderer(BlockNautiloidShellMariella.TileEntityCustom.class, new RenderNautiloidShellMariella());
        ClientRegistry.bindTileEntitySpecialRenderer(BlockNautiloidShellPravitoceras.TileEntityCustom.class, new RenderNautiloidShellPravitoceras());
        ClientRegistry.bindTileEntitySpecialRenderer(BlockNautiloidShellPtychoceras.TileEntityCustom.class, new RenderNautiloidShellPtychoceras());
        ClientRegistry.bindTileEntitySpecialRenderer(BlockNautiloidShellScaphites.TileEntityCustom.class, new RenderNautiloidShellScaphites());
        ClientRegistry.bindTileEntitySpecialRenderer(BlockNautiloidShellBaculites.TileEntityCustom.class, new RenderNautiloidShellBaculites());
        ClientRegistry.bindTileEntitySpecialRenderer(BlockNautiloidShellHyphantoceras.TileEntityCustom.class, new RenderNautiloidShellHyphantoceras());
        ClientRegistry.bindTileEntitySpecialRenderer(BlockNautiloidShellDiplomoceras.TileEntityCustom.class, new RenderNautiloidShellDiplomoceras());
        ClientRegistry.bindTileEntitySpecialRenderer(BlockNautiloidShellTrimeroceras.TileEntityCustom.class, new RenderNautiloidShellTrimeroceras());
        ClientRegistry.bindTileEntitySpecialRenderer(BlockNautiloidShellInversoceras.TileEntityCustom.class, new RenderNautiloidShellInversoceras());
        ClientRegistry.bindTileEntitySpecialRenderer(BlockNautiloidShellPentameroceras.TileEntityCustom.class, new RenderNautiloidShellPentameroceras());
        ClientRegistry.bindTileEntitySpecialRenderer(BlockNautiloidShellJeppssonoceras.TileEntityCustom.class, new RenderNautiloidShellJeppssonoceras());
        ClientRegistry.bindTileEntitySpecialRenderer(BlockNautiloidShellNipponites.TileEntityCustom.class, new RenderNautiloidShellNipponites());
        ClientRegistry.bindTileEntitySpecialRenderer(BlockNautiloidShellYezoceras.TileEntityCustom.class, new RenderNautiloidShellYezoceras());
        ClientRegistry.bindTileEntitySpecialRenderer(BlockNautiloidShellAraxoceras.TileEntityCustom.class, new RenderNautiloidShellAraxoceras());








        //Flowers:
        ClientRegistry.bindTileEntitySpecialRenderer(BlockMagnoliaFlower.TileEntityCustom.class, new RenderFlowerMagnolia());
        ClientRegistry.bindTileEntitySpecialRenderer(BlockLiriodendronFlower.TileEntityCustom.class, new RenderFlowerLiriodendron());
        ClientRegistry.bindTileEntitySpecialRenderer(BlockArchaeanthusFlower.TileEntityCustom.class, new RenderFlowerArchaeanthus());
        //ClientRegistry.bindTileEntitySpecialRenderer(BlockEmbothriumFlower.TileEntityCustom.class, new RenderFlowerEmbothrium());
        ClientRegistry.bindTileEntitySpecialRenderer(BlockAmborellaFlower.TileEntityCustom.class, new RenderFlowerAmborella());
        ClientRegistry.bindTileEntitySpecialRenderer(BlockCalycanthusFlower.TileEntityCustom.class, new RenderFlowerCalycanthus());
        ClientRegistry.bindTileEntitySpecialRenderer(BlockMicrovictoriaBud.TileEntityCustom.class, new RenderFlowerMicrovictoriaBud());
        ClientRegistry.bindTileEntitySpecialRenderer(BlockMicrovictoriaFlower.TileEntityCustom.class, new RenderFlowerMicrovictoria());
        ClientRegistry.bindTileEntitySpecialRenderer(BlockMicrovictoriaFlowerPlaceable.TileEntityCustom.class, new RenderFlowerMicrovictoriaPlaceable());
        ClientRegistry.bindTileEntitySpecialRenderer(BlockAristolochiaFlower.TileEntityCustom.class, new RenderFlowerAristolochia());
        ClientRegistry.bindTileEntitySpecialRenderer(BlockIliciumFlower.TileEntityCustom.class, new RenderFlowerIlicium());

        //Eggs etc:
        ClientRegistry.bindTileEntitySpecialRenderer(BlockRottenLog.TileEntityCustom.class, new RenderRottenLog());
        ClientRegistry.bindTileEntitySpecialRenderer(BlockDollyphyton.TileEntityCustom.class, new RenderDollyphyton());
        ClientRegistry.bindTileEntitySpecialRenderer(BlockEdwardsiphyton.TileEntityCustom.class, new RenderEdwardsiphyton());
        ClientRegistry.bindTileEntitySpecialRenderer(BlockAncientMoss.TileEntityCustom.class, new RenderAncientMoss());
        ClientRegistry.bindTileEntitySpecialRenderer(BlockSelaginella.TileEntityCustom.class, new RenderSelaginella());
        ClientRegistry.bindTileEntitySpecialRenderer(BlockSlimyAlgaeLand.TileEntityCustom.class, new RenderSlimyAlgaeLand());
        ClientRegistry.bindTileEntitySpecialRenderer(BlockNest.TileEntityNest.class, new RenderNest());
        ClientRegistry.bindTileEntitySpecialRenderer(BlockEggs.TileEntityCustom.class, new RenderEggsLand());
        ClientRegistry.bindTileEntitySpecialRenderer(BlockEggsWater.TileEntityCustom.class, new RenderEggsWater());
        ClientRegistry.bindTileEntitySpecialRenderer(BlockEggsWaterSurface.TileEntityCustom.class, new RenderEggsWaterSurface());

        //Display cases:
        ClientRegistry.bindTileEntitySpecialRenderer(BlockDisplayCase.TileEntityDisplayCase.class, new RenderDisplayCase());
        ClientRegistry.bindTileEntitySpecialRenderer(BlockDisplayCaseMagnifying.TileEntityDisplayCase.class, new RenderDisplayCaseMagnifying());
        ClientRegistry.bindTileEntitySpecialRenderer(BlockDisplayWallMount.TileEntityDisplayWallMount.class, new RenderDisplayWallMount());

        //Acid Bath:
        ClientRegistry.bindTileEntitySpecialRenderer(BlockAcidBathUp.TileEntityAcidBathUp.class, new RenderAcidBathUp());

        //DNARecombiner:
        ClientRegistry.bindTileEntitySpecialRenderer(BlockDNARecombinerRail.TileEntityDNARecombinerRail.class, new RenderDNARecombinerRail());
        ClientRegistry.bindTileEntitySpecialRenderer(BlockDNARecombinerCentrifuge.TileEntityDNARecombinerCentrifuge.class, new RenderDNACentrifuge());
        ClientRegistry.bindTileEntitySpecialRenderer(BlockDNARecombinerForge.TileEntityDNARecombinerForge.class, new RenderDNAForge());

        //Oligopool machine:
        ClientRegistry.bindTileEntitySpecialRenderer(BlockOligopoolMachine.TileEntityOligopoolMachine.class, new RenderOligopoolMachine());

        //Microscope:
        ClientRegistry.bindTileEntitySpecialRenderer(BlockMicroscope.TileEntityMicroscope.class, new RenderMicroscope());

        //Taxidermy:
        ClientRegistry.bindTileEntitySpecialRenderer(BlockTaxidermyTable.TileEntityTaxidermyTable.class, new RenderTaxidermyTable());

        //Research:
        ClientRegistry.bindTileEntitySpecialRenderer(BlockTimeResearcherHopper.TileEntityTimeResearcherHopper.class, new RenderTimeResearcherHopper());
        ClientRegistry.bindTileEntitySpecialRenderer(BlockTimeResearcherFinderBottom.TileEntityTimeResearcherFinderBottom.class, new RenderTimeResearcherFinderBottom());
        ClientRegistry.bindTileEntitySpecialRenderer(BlockTimeResearcherDispenser.TileEntityTimeResearcherDispenser.class, new RenderPortalDispenser());

        //Traps:
        ClientRegistry.bindTileEntitySpecialRenderer(BlockTrapAir.TileEntityTrapAir.class, new RenderTrapAir());
        ClientRegistry.bindTileEntitySpecialRenderer(BlockTrapGround.TileEntityTrapGround.class, new RenderTrapGround());
        ClientRegistry.bindTileEntitySpecialRenderer(BlockTrapWater.TileEntityTrapWater.class, new RenderTrapWater());

        //Misc:
        ClientRegistry.bindTileEntitySpecialRenderer(BlockRibCage.TileEntityCustom.class, new RenderRibCage());
        ClientRegistry.bindTileEntitySpecialRenderer(BlockBatHead.TileEntityCustom.class, new RenderBatHead());
        ClientRegistry.bindTileEntitySpecialRenderer(BlockSauroSkeleton.TileEntityCustom.class, new RenderSauroSkeleton());
        ClientRegistry.bindTileEntitySpecialRenderer(BlockAngiopteris.TileEntityAngiopteris.class, new RenderAngiopteris());
        if (LepidodendronConfig.modFlowerpot) {
            ClientRegistry.bindTileEntitySpecialRenderer(BlockFlowerpotPN.TileEntityFlowerPotPN.class, new RenderFlowerPotPN());
        }
        ClientRegistry.bindTileEntitySpecialRenderer(BlockRhyniaWater.TileEntityRhyniaWater.class, new RenderRhyniaWater());
        ClientRegistry.bindTileEntitySpecialRenderer(BlockRhyniaWaterSpore.TileEntityRhyniaWaterSpore.class, new RenderRhyniaWaterSpore());

        //Portal Blocks:
        ClientRegistry.bindTileEntitySpecialRenderer(TileEntityPortalBlock.class, new RenderPortalBlock());


    }
}