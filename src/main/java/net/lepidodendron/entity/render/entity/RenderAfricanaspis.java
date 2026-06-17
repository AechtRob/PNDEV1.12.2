package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraAfricanaspis;
import net.lepidodendron.entity.model.entity.ModelAfricanaspis;
import net.lepidodendron.entity.render.RenderLivingBaseWithBook;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderAfricanaspis extends RenderLivingBaseWithBook<EntityPrehistoricFloraAfricanaspis> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/africanaspis.png");

    public static float getScaler() {
        return 0.15F;
    }
    public RenderAfricanaspis(RenderManager mgr) {
        super(mgr, new ModelAfricanaspis(), 0.0f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraAfricanaspis entity) {
        return RenderAfricanaspis.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraAfricanaspis entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }
    @Override
    protected void preRenderCallback(EntityPrehistoricFloraAfricanaspis entity, float f) {
        float scale = this.getScaler();
        if (scale < 0.1f) {
            scale = 0.1f;
        }
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = 0;
    }

}