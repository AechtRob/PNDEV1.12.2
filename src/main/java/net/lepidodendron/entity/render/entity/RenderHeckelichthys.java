package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraHeckelichthys;
import net.lepidodendron.entity.model.entity.ModelHeckelichthys;
import net.lepidodendron.entity.render.RenderLivingBaseWithBook;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderHeckelichthys extends RenderLivingBaseWithBook<EntityPrehistoricFloraHeckelichthys> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/heckelichthys.png");

    public static float getScaler() {
        return 0.3F;
    }
    public RenderHeckelichthys(RenderManager mgr) {
        super(mgr, new ModelHeckelichthys(), 0.0f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraHeckelichthys entity) {
        return RenderHeckelichthys.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraHeckelichthys entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }
    @Override
    protected void preRenderCallback(EntityPrehistoricFloraHeckelichthys entity, float f) {
        float scale = this.getScaler();
        if (scale < 0.1f) {
            scale = 0.1f;
        }
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = 0;
    }

}