package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraKeretsa;
import net.lepidodendron.entity.model.entity.ModelKeretsa;
import net.lepidodendron.entity.render.RenderLivingBaseWithBook;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderKeretsa extends RenderLivingBaseWithBook<EntityPrehistoricFloraKeretsa> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/keretsa.png");
    public static float getScaler() {
        return 0.35F;
    }

    public RenderKeretsa(RenderManager mgr) {
        super(mgr, new ModelKeretsa(), 0.0f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraKeretsa entity) {
        return RenderKeretsa.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraKeretsa entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

    protected void preRenderCallback(EntityPrehistoricFloraKeretsa entity, float f) {
        float scale = this.getScaler();
        if (scale < 0.1f) {
            scale = 0.1f;
        }
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = 0;
    }
}