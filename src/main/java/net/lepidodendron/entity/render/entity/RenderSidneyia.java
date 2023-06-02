package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraSidneyia;
import net.lepidodendron.entity.model.entity.ModelSidneyia;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderSidneyia extends RenderLiving<EntityPrehistoricFloraSidneyia> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/sidneyia.png");

    public static float getScaler() {return 0.225F;}

    public RenderSidneyia(RenderManager mgr) {
        super(mgr, new ModelSidneyia(), 0.00f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraSidneyia entity) {
        return RenderSidneyia.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraSidneyia entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }
    protected void preRenderCallback(EntityPrehistoricFloraSidneyia entity, float f) {
        float scale = this.getScaler();
        if (scale < 0.1f) {
            scale = 0.1f;
        }
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = 0;
    }
}