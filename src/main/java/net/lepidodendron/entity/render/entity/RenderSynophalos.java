package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraSynophalos;
import net.lepidodendron.entity.model.entity.ModelSynophalos;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderSynophalos extends RenderLiving<EntityPrehistoricFloraSynophalos> {
    private static final ResourceLocation TEXTURE1 = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/synophalos_1.png");
    private static final ResourceLocation TEXTURE2 = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/synophalos_2.png");
    private static final ResourceLocation TEXTURE4 = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/synophalos_4.png");
    private static final ResourceLocation TEXTURE8 = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/synophalos_8.png");
    private static final ResourceLocation TEXTURE16 = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/synophalos_16.png");

    public RenderSynophalos(RenderManager mgr) {
        super(mgr, new ModelSynophalos(), 0.0f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraSynophalos entity) {
        if (entity.getChain() == 16) {
            return RenderSynophalos.TEXTURE16;
        }
        if (entity.getChain() == 8) {
            return RenderSynophalos.TEXTURE8;
        }
        if (entity.getChain() == 4) {
            return RenderSynophalos.TEXTURE4;
        }
        if (entity.getChain() == 2) {
            return RenderSynophalos.TEXTURE2;
        }
        return RenderSynophalos.TEXTURE1;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraSynophalos entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

}