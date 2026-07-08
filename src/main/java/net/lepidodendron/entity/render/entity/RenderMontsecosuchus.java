package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraMontsecosuchus;
import net.lepidodendron.entity.model.entity.ModelMontsecosuchus;
import net.lepidodendron.entity.render.RenderLivingBaseWithBook;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderMontsecosuchus extends RenderLivingBaseWithBook<EntityPrehistoricFloraMontsecosuchus> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/montsecosuchus.png");

    public static float getScaler() {
        return 0.3F;
    }
    public RenderMontsecosuchus(RenderManager mgr) {
        super(mgr, new ModelMontsecosuchus(), 0.0f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraMontsecosuchus entity) {
        return RenderMontsecosuchus.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraMontsecosuchus entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }
    @Override
    protected void preRenderCallback(EntityPrehistoricFloraMontsecosuchus entity, float f) {
        float scale = this.getScaler()*entity.getAgeScale();
        if (scale < 0.1f) {
            scale = 0.1f;
        }
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = 0;
    }

}