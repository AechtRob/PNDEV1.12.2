package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraPhyllograptus;
import net.lepidodendron.entity.model.entity.ModelPhyllograptus;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderPhyllograptus extends RenderLiving<EntityPrehistoricFloraPhyllograptus> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/phyllograptus.png");
    public static float getScaler() {
        return 0.25F;
    }

    public RenderPhyllograptus(RenderManager mgr) {
        super(mgr, new ModelPhyllograptus(), 0.0f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraPhyllograptus entity) {
        return RenderPhyllograptus.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraPhyllograptus entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

    @Override
    protected void preRenderCallback(EntityPrehistoricFloraPhyllograptus entity, float f) {
        float scale = this.getScaler();
        GlStateManager.scale(scale, scale, scale);
    }

}