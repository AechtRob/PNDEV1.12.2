package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraHaqelpycnodus;
import net.lepidodendron.entity.model.entity.ModelHaqelpycnodus;
import net.lepidodendron.entity.render.RenderLivingBaseWithBook;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderHaqelpycnodus extends RenderLivingBaseWithBook<EntityPrehistoricFloraHaqelpycnodus> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/haqelpycnodus.png");

    public RenderHaqelpycnodus(RenderManager mgr) {
        super(mgr, new ModelHaqelpycnodus(), 0.0f);
    }

    public static float getScaler() {return 0.44F; }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraHaqelpycnodus entity) {
        return RenderHaqelpycnodus.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraHaqelpycnodus entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

    @Override
    protected void preRenderCallback(EntityPrehistoricFloraHaqelpycnodus entity, float f) {
        float scale = this.getScaler();
        if (scale < 0.1f) {scale = 0.1f;}
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = entity.width * scale * 0.0F;
    }

}





