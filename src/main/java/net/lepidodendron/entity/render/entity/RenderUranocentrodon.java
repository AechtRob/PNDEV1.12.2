package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraUranocentrodon;
import net.lepidodendron.entity.model.entity.ModelUranocentrodon;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderUranocentrodon extends RenderLiving<EntityPrehistoricFloraUranocentrodon> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/uranocentrodon.png");
    public static float getScaler() {
        return 0.50F;
    }

    public RenderUranocentrodon(RenderManager mgr) {
        super(mgr, new ModelUranocentrodon(), 0.65F);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraUranocentrodon entity) {
        return RenderUranocentrodon.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraUranocentrodon entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

    @Override
    protected void preRenderCallback(EntityPrehistoricFloraUranocentrodon entity, float f) {
        float scale = entity.getAgeScale() * this.getScaler();
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = entity.width * scale * 0.35F;
    }

}