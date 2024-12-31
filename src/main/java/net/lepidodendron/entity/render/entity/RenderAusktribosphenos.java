package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraAusktribosphenos;
import net.lepidodendron.entity.model.entity.ModelAusktribosphenos;
import net.lepidodendron.entity.render.RenderLivingBaseWithBook;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderAusktribosphenos extends RenderLivingBaseWithBook<EntityPrehistoricFloraAusktribosphenos> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/ausktribosphenos.png");

    public static float getScaler() {
        return 0.18f;
    }

    public RenderAusktribosphenos(RenderManager mgr) {
        super(mgr, new ModelAusktribosphenos(),0.2f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraAusktribosphenos entity) {
        return RenderAusktribosphenos.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraAusktribosphenos entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

    @Override
    protected void preRenderCallback(EntityPrehistoricFloraAusktribosphenos entity, float f) {
        float scale = entity.getAgeScale()*getScaler();
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = entity.width * scale * 0.90F;
    }

}