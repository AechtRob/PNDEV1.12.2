package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraSymphysops;
import net.lepidodendron.entity.model.entity.ModelSymphysops;
import net.lepidodendron.entity.render.RenderLivingBaseWithBook;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderSymphysops extends RenderLivingBaseWithBook<EntityPrehistoricFloraSymphysops> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/symphysops.png");

    public static float getScaler() {
        return 0.7F * 0.395F;
    }
    public RenderSymphysops(RenderManager mgr) {
        super(mgr, new ModelSymphysops(), 0.0f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraSymphysops entity) {
        return RenderSymphysops.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraSymphysops entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }
    @Override
    protected void preRenderCallback(EntityPrehistoricFloraSymphysops entity, float f) {
        float scale = this.getScaler();
        if (scale < 0.1f) {
            scale = 0.1f;
        }
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = 0;
    }

}