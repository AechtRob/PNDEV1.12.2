package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraHaimirichia;
import net.lepidodendron.entity.model.entity.ModelHaimirichia;
import net.lepidodendron.entity.render.RenderLivingBaseWithBook;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderHaimirichia extends RenderLivingBaseWithBook<EntityPrehistoricFloraHaimirichia> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/haimirichia.png");

    public static float getScaler() {
        return 0.7F ;
    }
    public RenderHaimirichia(RenderManager mgr) {
        super(mgr, new ModelHaimirichia(), 0.0f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraHaimirichia entity) {
        return RenderHaimirichia.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraHaimirichia entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }
    @Override
    protected void preRenderCallback(EntityPrehistoricFloraHaimirichia entity, float f) {
        float scale = this.getScaler()*entity.getAgeScale();

        if (scale < 0.1f) {
            scale = 0.1f;
        }
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = 0;
    }

}