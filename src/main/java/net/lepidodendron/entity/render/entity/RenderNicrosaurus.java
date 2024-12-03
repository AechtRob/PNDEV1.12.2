package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraNicrosaurus;
import net.lepidodendron.entity.model.entity.ModelNicrosaurus;
import net.lepidodendron.entity.render.RenderLivingBaseWithBook;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderNicrosaurus extends RenderLivingBaseWithBook<EntityPrehistoricFloraNicrosaurus> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/nicrosaurus.png");

    public RenderNicrosaurus(RenderManager mgr) {
        super(mgr, new ModelNicrosaurus(), 0.5f);
    }
    public static float getScaler() {return 1f; }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraNicrosaurus entity) {
        float scale = entity.getAgeScale();
        return RenderNicrosaurus.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraNicrosaurus entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

    @Override
    protected void preRenderCallback(EntityPrehistoricFloraNicrosaurus entity, float f) {
        float scale = entity.getAgeScale() * this.getScaler();
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = entity.width * scale * 0.50F;
    }

}