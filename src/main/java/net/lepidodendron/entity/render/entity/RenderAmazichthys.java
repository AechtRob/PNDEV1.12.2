package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraAmazichthys;
import net.lepidodendron.entity.model.entity.ModelAmazichthys;
import net.lepidodendron.entity.render.RenderLivingBaseWithBook;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderAmazichthys extends RenderLivingBaseWithBook<EntityPrehistoricFloraAmazichthys> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/amazichthys.png");

    public static float getScaler() {
        return 0.45F;
    }
    public RenderAmazichthys(RenderManager mgr) {
        super(mgr, new ModelAmazichthys(), 0.0f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraAmazichthys entity) {
        return RenderAmazichthys.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraAmazichthys entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }
    @Override
    protected void preRenderCallback(EntityPrehistoricFloraAmazichthys entity, float f) {
        float scale = this.getScaler()*entity.getAgeScale();
        if (scale < 0.1f) {
            scale = 0.1f;
        }
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = 0;
    }

}