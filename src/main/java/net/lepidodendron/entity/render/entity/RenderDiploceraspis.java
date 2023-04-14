package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraDiploceraspis;
import net.lepidodendron.entity.model.entity.ModelDiploceraspis;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderDiploceraspis extends RenderLiving<EntityPrehistoricFloraDiploceraspis> {
    private static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/diploceraspis.png");
    public static float getScaler() {return 0.6F;}
    public RenderDiploceraspis(RenderManager mgr) {
        super(mgr, new ModelDiploceraspis(), 0.0f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraDiploceraspis entity) {
        return RenderDiploceraspis.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraDiploceraspis entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

    @Override
    protected void preRenderCallback(EntityPrehistoricFloraDiploceraspis entity, float f) {
        float scale = entity.getAgeScale();
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = entity.width * scale * 0.15F;
    }

}