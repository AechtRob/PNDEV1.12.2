package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraEuroka;
import net.lepidodendron.entity.model.entity.ModelEuroka;
import net.lepidodendron.entity.render.RenderLivingBaseWithBook;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderEuroka extends RenderLivingBaseWithBook<EntityPrehistoricFloraEuroka> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/euroka.png");

    public static float getScaler() {
        return 0.58F;
    }
    public RenderEuroka(RenderManager mgr) {
        super(mgr, new ModelEuroka(), 0.0f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraEuroka entity) {
        return RenderEuroka.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraEuroka entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }
    @Override
    protected void preRenderCallback(EntityPrehistoricFloraEuroka entity, float f) {
        float scale = this.getScaler() * entity.getAgeScale();
        if (scale < 0.1f) {
            scale = 0.1f;
        }
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = 0;
    }

}