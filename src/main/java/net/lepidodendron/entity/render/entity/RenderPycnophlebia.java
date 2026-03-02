package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraPycnophlebia;
import net.lepidodendron.entity.model.entity.ModelPycnophlebia;
import net.lepidodendron.entity.render.RenderLivingBaseWithBook;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderPycnophlebia extends RenderLivingBaseWithBook<EntityPrehistoricFloraPycnophlebia> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/pycnophlebia_male.png");
    public static final ResourceLocation TEXTURE_F = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/pycnophlebia.png");


    public static float getScaler() {
        return 0.7F * 0.14F;
    }
    public RenderPycnophlebia(RenderManager mgr) {
        super(mgr, new ModelPycnophlebia(), 0.0f);
        this.addLayer(new LayerPycnophlebiaWing(this));
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraPycnophlebia entity) {
        if (entity.getPNType() == EntityPrehistoricFloraPycnophlebia.Type.FEMALE) {
            return RenderPycnophlebia.TEXTURE_F;
        }
        return RenderPycnophlebia.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraPycnophlebia entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }
    @Override
    protected void preRenderCallback(EntityPrehistoricFloraPycnophlebia entity, float f) {
        float scale = this.getScaler();
        if (scale < 0.1f) {
            scale = 0.1f;
        }
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = 0;
    }

}