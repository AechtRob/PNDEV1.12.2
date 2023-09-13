package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraMuensterella;
import net.lepidodendron.entity.model.entity.ModelMuensterella;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderMuensterella extends RenderLiving<EntityPrehistoricFloraMuensterella> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/muensterella.png");

    public static float getScaler() {
        return 0.2F;
    }
    public RenderMuensterella(RenderManager mgr) {
        super(mgr, new ModelMuensterella(), 0.0f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraMuensterella entity) {
        return RenderMuensterella.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraMuensterella entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }
    @Override
    protected void preRenderCallback(EntityPrehistoricFloraMuensterella entity, float f) {
        float scale = this.getScaler() * entity.getAgeScale();;
        if (scale < 0.1f) {
            scale = 0.1f;
        }
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = 0;
    }

}