package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraMimetaster;
import net.lepidodendron.entity.model.entity.ModelMimetaster;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderMimetaster extends RenderLiving<EntityPrehistoricFloraMimetaster> {
    private static final ResourceLocation TEXTURE_0 = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/mimetaster.png");
    private static final ResourceLocation TEXTURE_1 = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/mimetaster_sponge_1_blue.png");
    private static final ResourceLocation TEXTURE_2 = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/mimetaster_sponge_2_yellow.png");
    private static final ResourceLocation TEXTURE_3 = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/mimetaster_sponge_3_brown.png");
    private static final ResourceLocation TEXTURE_4 = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/mimetaster_sponge_4_red.png");
    private static final ResourceLocation TEXTURE_5 = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/mimetaster_sponge_5_orange.png");
    private static final ResourceLocation TEXTURE_6 = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/mimetaster_sponge_6_pink.png");
    private static final ResourceLocation TEXTURE_7 = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/mimetaster_sponge_7_white.png");
    private static final ResourceLocation TEXTURE_8 = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/mimetaster_sponge_8_darkpink.png");
    private static final ResourceLocation TEXTURE_9 = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/mimetaster_sponge_9_darkorange.png");

    public RenderMimetaster(RenderManager mgr) {
        super(mgr, new ModelMimetaster(), 0.0f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraMimetaster entity) {
        int sponge = entity.getSponge();

        if (sponge == 1) {
            return RenderMimetaster.TEXTURE_1;
        }
        if (sponge == 2) {
            return RenderMimetaster.TEXTURE_2;
        }
        if (sponge == 3) {
            return RenderMimetaster.TEXTURE_3;
        }
        if (sponge == 4) {
            return RenderMimetaster.TEXTURE_4;
        }
        if (sponge == 5) {
            return RenderMimetaster.TEXTURE_5;
        }
        if (sponge == 6) {
            return RenderMimetaster.TEXTURE_6;
        }
        if (sponge == 7) {
            return RenderMimetaster.TEXTURE_7;
        }
        if (sponge == 8) {
            return RenderMimetaster.TEXTURE_8;
        }
        if (sponge == 9) {
            return RenderMimetaster.TEXTURE_9;
        }

        return RenderMimetaster.TEXTURE_0;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraMimetaster entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

}