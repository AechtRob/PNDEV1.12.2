package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraNaraoia_bertiensis;
import net.lepidodendron.entity.model.entity.ModelNaraoia_bertiensis;
import net.lepidodendron.entity.render.RenderLivingBaseWithBook;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderNaraoia_bertiensis extends RenderLivingBaseWithBook<EntityPrehistoricFloraNaraoia_bertiensis> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/naraoia_bertiensis.png");

    public static float getScaler() {
        return 0.7F * 0.395F;
    }
    public RenderNaraoia_bertiensis(RenderManager mgr) {
        super(mgr, new ModelNaraoia_bertiensis(), 0.0f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraNaraoia_bertiensis entity) {
        return RenderNaraoia_bertiensis.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraNaraoia_bertiensis entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }
    @Override
    protected void preRenderCallback(EntityPrehistoricFloraNaraoia_bertiensis entity, float f) {
        float scale = this.getScaler();
        if (scale < 0.1f) {
            scale = 0.1f;
        }
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = 0.01F;
    }

}