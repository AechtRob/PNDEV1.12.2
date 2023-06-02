package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraMegamastax;
import net.lepidodendron.entity.model.entity.ModelMegamastax;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderMegamastax extends RenderLiving<EntityPrehistoricFloraMegamastax> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/megamastax.png");

    public static float getScaler() {
        return 0.7F * 0.695F;
    }
    public RenderMegamastax(RenderManager mgr) {
        super(mgr, new ModelMegamastax(), 0.0f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraMegamastax entity) {
        return RenderMegamastax.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraMegamastax entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }
    @Override
    protected void preRenderCallback(EntityPrehistoricFloraMegamastax entity, float f) {
        float scale = this.getScaler();
        if (scale < 0.1f) {
            scale = 0.1f;
        }
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = 0;
    }

}