package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraHeintzichthys;
import net.lepidodendron.entity.model.entity.ModelHeintzichthys;
import net.lepidodendron.entity.render.RenderLivingBaseWithBook;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderHeintzichthys extends RenderLivingBaseWithBook<EntityPrehistoricFloraHeintzichthys> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/heintzichthys.png");

    public static float getScaler() {
        return 0.5818F;
    }
    public RenderHeintzichthys(RenderManager mgr) {
        super(mgr, new ModelHeintzichthys(), 0.0f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraHeintzichthys entity) {
        return RenderHeintzichthys.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraHeintzichthys entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }
    @Override
    protected void preRenderCallback(EntityPrehistoricFloraHeintzichthys entity, float f) {
        float scale = this.getScaler()*entity.getAgeScale();
        if (scale < 0.1f) {
            scale = 0.1f;
        }
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = 0;
    }

}