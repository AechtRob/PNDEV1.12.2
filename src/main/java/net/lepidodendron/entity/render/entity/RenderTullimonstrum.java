package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraTullimonstrum;
import net.lepidodendron.entity.model.entity.ModelTullimonstrum;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderTullimonstrum extends RenderLiving<EntityPrehistoricFloraTullimonstrum> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/tullimonstrum.png");

    public static float getScaler() {
        return 0.4f;
    }

    public RenderTullimonstrum(RenderManager mgr) {
        super(mgr, new ModelTullimonstrum(), 0.0f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraTullimonstrum entity) {
        return RenderTullimonstrum.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraTullimonstrum entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

    @Override
    protected void preRenderCallback(EntityPrehistoricFloraTullimonstrum entity, float f) {
        float scale = this.getScaler();
        if (scale < 0.1f) {
            scale = 0.1f;
        }
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = 0;
    }

}