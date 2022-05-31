package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraCotylorhynchus;
import net.lepidodendron.entity.model.entity.ModelCotylorhynchus;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderCotylorhynchus extends RenderLiving<EntityPrehistoricFloraCotylorhynchus> {
    private static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/cotylorhynchus.png");

    public RenderCotylorhynchus(RenderManager mgr) {
        super(mgr, new ModelCotylorhynchus(), 0.5f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraCotylorhynchus entity) {
        return RenderCotylorhynchus.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraCotylorhynchus entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

    @Override
    protected void preRenderCallback(EntityPrehistoricFloraCotylorhynchus entity, float f) {
        float scale = entity.getAgeScale();
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = entity.width * scale * 1.0F;
    }

}