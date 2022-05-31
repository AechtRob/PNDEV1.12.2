package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraAdelophthalmus;
import net.lepidodendron.entity.model.entity.ModelAdelophthalmus;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderAdelophthalmus extends RenderLiving<EntityPrehistoricFloraAdelophthalmus> {
    private static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/adelophthalmus.png");
    //private static final ResourceLocation TEXTURE_BABY = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/adelophthalmus_baby.png");


    public RenderAdelophthalmus(RenderManager mgr) {
        super(mgr, new ModelAdelophthalmus(), 0.0f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraAdelophthalmus entity) {
        //float scale = entity.getAgeScale();
        //if (scale < 0.5F) {
        //    return RenderAdelophthalmus.TEXTURE_BABY;
        //}
        return RenderAdelophthalmus.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraAdelophthalmus entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

    //@Override
    //protected void preRenderCallback(EntityPrehistoricFloraAdelophthalmus entity, float f) {
    //    float scale = entity.getAgeScale();
    //    GlStateManager.scale(scale, scale, scale);
    //    this.shadowSize = entity.width * scale * 0.45F;
    //}

}