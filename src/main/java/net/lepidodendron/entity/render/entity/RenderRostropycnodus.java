package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraRostropycnodus;
import net.lepidodendron.entity.model.entity.ModelRostropycnodus;
import net.lepidodendron.entity.render.RenderLivingBaseWithBook;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderRostropycnodus extends RenderLivingBaseWithBook<EntityPrehistoricFloraRostropycnodus> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/rostropycnodus.png");

    public RenderRostropycnodus(RenderManager mgr) {
        super(mgr, new ModelRostropycnodus(), 0.0f);
    }

    public static float getScaler() {return 0.18F; }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraRostropycnodus entity) {
        return RenderRostropycnodus.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraRostropycnodus entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

    @Override
    protected void preRenderCallback(EntityPrehistoricFloraRostropycnodus entity, float f) {
        float scale = this.getScaler();
        if (scale < 0.1f) {scale = 0.1f;}
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = entity.width * scale * 0.0F;
    }

}





