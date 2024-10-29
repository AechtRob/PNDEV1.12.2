package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraNingxiaplatysomus;
import net.lepidodendron.entity.model.entity.ModelNingxiaplatysomus;
import net.lepidodendron.entity.render.RenderLivingBaseWithBook;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderNingxiaplatysomus extends RenderLivingBaseWithBook<EntityPrehistoricFloraNingxiaplatysomus> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/ningxiaplatysomus.png");

    public static float getScaler() {
        return 0.7F * 0.3F;
    }
    public RenderNingxiaplatysomus(RenderManager mgr) {
        super(mgr, new ModelNingxiaplatysomus(), 0.0f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraNingxiaplatysomus entity) {
        return RenderNingxiaplatysomus.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraNingxiaplatysomus entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }
    @Override
    protected void preRenderCallback(EntityPrehistoricFloraNingxiaplatysomus entity, float f) {
        float scale = this.getScaler();
        if (scale < 0.1f) {
            scale = 0.1f;
        }
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = 0;
    }

}