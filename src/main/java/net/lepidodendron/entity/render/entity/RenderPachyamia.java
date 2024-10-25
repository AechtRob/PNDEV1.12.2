package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraPachyamia;
import net.lepidodendron.entity.model.entity.ModelPachyamia;
import net.lepidodendron.entity.render.RenderLivingBaseWithBook;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderPachyamia extends RenderLivingBaseWithBook<EntityPrehistoricFloraPachyamia> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/pachyamia.png");

    public RenderPachyamia(RenderManager mgr) {
        super(mgr, new ModelPachyamia(), 0.0f);
    }

    public static float getScaler() {return 0.4F; }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraPachyamia entity) {
        return RenderPachyamia.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraPachyamia entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

    protected void preRenderCallback(EntityPrehistoricFloraPachyamia entity, float f) {
        float scale = this.getScaler();
        if (scale < 0.1f) {
            scale = 0.1f;
        }
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = 0;
    }

}