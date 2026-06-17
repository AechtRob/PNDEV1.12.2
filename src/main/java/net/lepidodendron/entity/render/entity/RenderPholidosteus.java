package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraPholidosteus;
import net.lepidodendron.entity.model.entity.ModelPholidosteus;
import net.lepidodendron.entity.render.RenderLivingBaseWithBook;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderPholidosteus extends RenderLivingBaseWithBook<EntityPrehistoricFloraPholidosteus> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/pholidosteus.png");

    public static float getScaler() {
        return 0.27F;
    }
    public RenderPholidosteus(RenderManager mgr) {
        super(mgr, new ModelPholidosteus(), 0.0f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraPholidosteus entity) {
        return RenderPholidosteus.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraPholidosteus entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }
    @Override
    protected void preRenderCallback(EntityPrehistoricFloraPholidosteus entity, float f) {
        float scale = this.getScaler()*entity.getAgeScale();
        if (scale < 0.1f) {
            scale = 0.1f;
        }
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = 0;
    }

}