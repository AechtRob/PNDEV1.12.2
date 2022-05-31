package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraProcynosuchus;
import net.lepidodendron.entity.model.entity.ModelProcynosuchus;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderProcynosuchus extends RenderLiving<EntityPrehistoricFloraProcynosuchus> {
    private static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/procynosuchus.png");

    public RenderProcynosuchus(RenderManager mgr) {
        super(mgr, new ModelProcynosuchus(), 0.5f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraProcynosuchus entity) {
        return RenderProcynosuchus.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraProcynosuchus entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

    @Override
    protected void preRenderCallback(EntityPrehistoricFloraProcynosuchus entity, float f) {
        float scale = entity.getAgeScale();
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = entity.width * scale * 0.18F;
    }

}