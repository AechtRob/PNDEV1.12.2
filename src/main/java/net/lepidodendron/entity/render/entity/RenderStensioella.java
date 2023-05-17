package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraStensioella;
import net.lepidodendron.entity.model.entity.ModelStensioella;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderStensioella extends RenderLiving<EntityPrehistoricFloraStensioella> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/stensioella.png");

    public RenderStensioella(RenderManager mgr) {
        super(mgr, new ModelStensioella(), 0.0f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraStensioella entity) {
        return RenderStensioella.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraStensioella entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

    @Override
    protected void preRenderCallback(EntityPrehistoricFloraStensioella entity, float f) {
        float scale = entity.getAgeScale();
        if (scale < 0.1f) {scale = 0.1f;}
        GlStateManager.scale(scale, scale, scale);
        //this.shadowSize = entity.width * scale * 0.3f;
    }

}