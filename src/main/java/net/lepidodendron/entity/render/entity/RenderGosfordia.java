package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraGosfordia;
import net.lepidodendron.entity.model.entity.ModelGosfordia;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderGosfordia extends RenderLiving<EntityPrehistoricFloraGosfordia> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/gosfordia.png");

    public RenderGosfordia(RenderManager mgr) {
        super(mgr, new ModelGosfordia(), 0.0f);
    }

    public static float getScaler() {return 0.4F; }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraGosfordia entity) {
        return RenderGosfordia.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraGosfordia entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

    @Override
    protected void preRenderCallback(EntityPrehistoricFloraGosfordia entity, float f) {
        float scale = this.getScaler();
        if (scale < 0.1f) {scale = 0.1f;}
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = entity.width * scale * 0.0F;
    }

}