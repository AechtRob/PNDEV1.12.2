package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraHuayangosaurus;
import net.lepidodendron.entity.model.entity.ModelHuayangosaurus;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderHuayangosaurus extends RenderLiving<EntityPrehistoricFloraHuayangosaurus> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/huayangosaurus.png");

    //private static final ResourceLocation TEXTURE_BABY = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/huayangosaurus_baby.png");

    public RenderHuayangosaurus(RenderManager mgr) {
        super(mgr, new ModelHuayangosaurus(), 0.3f);
    }

    public static float getScaler() {
        return 0.8F;
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraHuayangosaurus entity) {
        float scale = entity.getAgeScale();
//        if (scale < 0.6F) {
//            return RenderHuayangosaurus.TEXTURE_BABY;
//        }
        return RenderHuayangosaurus.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraHuayangosaurus entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

    @Override
    protected void preRenderCallback(EntityPrehistoricFloraHuayangosaurus entity, float f) {
        float scale = entity.getAgeScale() * this.getScaler();
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = entity.width * scale * 0.6F;
    }

}