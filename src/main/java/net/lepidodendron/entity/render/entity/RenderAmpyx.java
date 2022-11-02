package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraAmpyx;
import net.lepidodendron.entity.model.entity.ModelAmpyx;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderAmpyx extends RenderLiving<EntityPrehistoricFloraAmpyx> {
    private static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/ampyx.png");

    public RenderAmpyx(RenderManager mgr) {
        super(mgr, new ModelAmpyx(), 0.0f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraAmpyx entity) {
        return RenderAmpyx.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraAmpyx entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }
    @Override
    protected void preRenderCallback(EntityPrehistoricFloraAmpyx entity, float f) {
        float scale = 0.7F * 1.65F;
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = 0;
    }

}


