package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraMastodonsaurus;
import net.lepidodendron.entity.model.entity.ModelMastodonsaurus;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderMastodonsaurus extends RenderLiving<EntityPrehistoricFloraMastodonsaurus> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/mastodonsaurus.png");
    private static final ResourceLocation TEXTURE_YOUNG = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/mastodonsaurus_young.png");

    public static float getScaler() {return 1.375F;}

    public RenderMastodonsaurus(RenderManager mgr) {
        super(mgr, new ModelMastodonsaurus(), 0.5f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraMastodonsaurus entity) {
        float scale = entity.getAgeScale();
        if (entity.isSmall()) {
            return RenderMastodonsaurus.TEXTURE_YOUNG;
        }
        return RenderMastodonsaurus.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraMastodonsaurus entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

    @Override
    protected void preRenderCallback(EntityPrehistoricFloraMastodonsaurus entity, float f) {
        float scale = entity.getAgeScale()*getScaler();
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = entity.width * scale * 0.67F;
    }

}