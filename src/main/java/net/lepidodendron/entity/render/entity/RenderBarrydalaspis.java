package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraBarrydalaspis;
import net.lepidodendron.entity.model.entity.ModelBarrydalaspis;
import net.lepidodendron.entity.render.RenderLivingBaseWithBook;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderBarrydalaspis extends RenderLivingBaseWithBook<EntityPrehistoricFloraBarrydalaspis> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/barrydalaspis.png");

    public static float getScaler() {
        return 0.22F;
    }
    public RenderBarrydalaspis(RenderManager mgr) {
        super(mgr, new ModelBarrydalaspis(), 0.0f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraBarrydalaspis entity) {
        return RenderBarrydalaspis.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraBarrydalaspis entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }
    @Override
    protected void preRenderCallback(EntityPrehistoricFloraBarrydalaspis entity, float f) {
        float scale = this.getScaler();
        if (scale < 0.1f) {
            scale = 0.1f;
        }
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = 0;
    }

}