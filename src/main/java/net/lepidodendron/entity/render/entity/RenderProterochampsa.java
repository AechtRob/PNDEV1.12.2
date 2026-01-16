package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraProterochampsa;
import net.lepidodendron.entity.model.entity.ModelProterochampsa;
import net.lepidodendron.entity.render.RenderLivingBaseWithBook;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderProterochampsa extends RenderLivingBaseWithBook<EntityPrehistoricFloraProterochampsa> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/proterochampsa.png");

    public static float getScaler() {return 0.46f;}
    public RenderProterochampsa(RenderManager mgr) {
        super(mgr, new ModelProterochampsa(), 0.3f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraProterochampsa entity) {
        return RenderProterochampsa.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraProterochampsa entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

    @Override
    protected void preRenderCallback(EntityPrehistoricFloraProterochampsa entity, float f) {
        float scale = entity.getAgeScale()*getScaler();
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = 0;
    }

}