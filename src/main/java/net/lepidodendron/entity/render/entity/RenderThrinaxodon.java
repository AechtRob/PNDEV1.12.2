package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraThrinaxodon;
import net.lepidodendron.entity.model.entity.ModelThrinaxodon;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderThrinaxodon extends RenderLiving<EntityPrehistoricFloraThrinaxodon> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/thrinaxodon.png");

    public static float getScaler() {return 0.2f;}
    public RenderThrinaxodon(RenderManager mgr) {
        super(mgr, new ModelThrinaxodon(), 0.5f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraThrinaxodon entity) {
        return RenderThrinaxodon.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraThrinaxodon entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

    @Override
    protected void preRenderCallback(EntityPrehistoricFloraThrinaxodon entity, float f) {
        float scale = entity.getAgeScale();
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = entity.width * scale * 0.15F;
    }

}