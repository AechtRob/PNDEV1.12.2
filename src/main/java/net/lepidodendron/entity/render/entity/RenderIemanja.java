package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraIemanja;
import net.lepidodendron.entity.model.entity.ModelIemanja;
import net.lepidodendron.entity.render.RenderLivingBaseWithBook;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderIemanja extends RenderLivingBaseWithBook<EntityPrehistoricFloraIemanja> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/iemanja.png");

    public static float getScaler() {
        return 0.7F * 0.6F;
    }
    public RenderIemanja(RenderManager mgr) {
        super(mgr, new ModelIemanja(), 0.0f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraIemanja entity) {
        return RenderIemanja.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraIemanja entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }
    @Override
    protected void preRenderCallback(EntityPrehistoricFloraIemanja entity, float f) {
        float scale = this.getScaler();
        if (scale < 0.1f) {
            scale = 0.1f;
        }
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = 0;
    }

}