package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraSquatina;
import net.lepidodendron.entity.model.entity.ModelSquatina;
import net.lepidodendron.entity.render.RenderLivingBaseWithBook;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderSquatina extends RenderLivingBaseWithBook<EntityPrehistoricFloraSquatina> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/squatina.png");

    public static float getScaler() {
        return 0.8F;
    }
    public RenderSquatina(RenderManager mgr) {
        super(mgr, new ModelSquatina(), 0.0f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraSquatina entity) {
        return RenderSquatina.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraSquatina entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }
    @Override
    protected void preRenderCallback(EntityPrehistoricFloraSquatina entity, float f) {
        float scale = this.getScaler()*entity.getAgeScale();

        if (scale < 0.1f) {
            scale = 0.1f;
        }
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = 0;
    }

}