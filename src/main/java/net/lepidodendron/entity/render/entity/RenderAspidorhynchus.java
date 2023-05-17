package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraAspidorhynchus;
import net.lepidodendron.entity.model.entity.ModelAspidorhynchus;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderAspidorhynchus extends RenderLiving<EntityPrehistoricFloraAspidorhynchus> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/aspidorhynchus.png");

    public static float getScaler() {
        return 0.7F * 0.595F;
    }
    public RenderAspidorhynchus(RenderManager mgr) {
        super(mgr, new ModelAspidorhynchus(), 0.0f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraAspidorhynchus entity) {
        return RenderAspidorhynchus.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraAspidorhynchus entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

    @Override
    protected void preRenderCallback(EntityPrehistoricFloraAspidorhynchus entity, float f) {
        float scale = this.getScaler();
        if (scale < 0.1f) {
            scale = 0.1f;
        }
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = 0;
    }
}