package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraSchoenesmahl;
import net.lepidodendron.entity.model.entity.ModelSchoenesmahl;
import net.lepidodendron.entity.render.RenderLivingBaseWithBook;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderSchoenesmahl extends RenderLivingBaseWithBook<EntityPrehistoricFloraSchoenesmahl> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/schoenesmahl.png");

    public static float getScaler() {
        return 0.7F * 0.2F;
    }
    public RenderSchoenesmahl(RenderManager mgr) {
        super(mgr, new ModelSchoenesmahl(), 0.0f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraSchoenesmahl entity) {
        return RenderSchoenesmahl.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraSchoenesmahl entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }
    @Override
    protected void preRenderCallback(EntityPrehistoricFloraSchoenesmahl entity, float f) {
        float scale = this.getScaler();
        if (scale < 0.1f) {
            scale = 0.1f;
        }
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = 0;
    }

}