package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraGorgonops;
import net.lepidodendron.entity.model.entity.ModelGorgonops;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderGorgonops extends RenderLiving<EntityPrehistoricFloraGorgonops> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/gorgonops.png");

    public RenderGorgonops(RenderManager mgr) {
        super(mgr, new ModelGorgonops(), 0.8f);
    }

    public static float getScaler() {return 0.47f; }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraGorgonops entity) {
        return RenderGorgonops.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraGorgonops entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

    @Override
    protected void preRenderCallback(EntityPrehistoricFloraGorgonops entity, float f) {
        float scale = entity.getAgeScale() * this.getScaler();
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = entity.width * scale * 0.90F;
    }

}