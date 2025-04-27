package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraProsalirus;
import net.lepidodendron.entity.model.entity.ModelProsalirus;
import net.lepidodendron.entity.render.RenderLivingBaseWithBook;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderProsalirus extends RenderLivingBaseWithBook<EntityPrehistoricFloraProsalirus> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/prosalirus.png");

    public static float getScaler() {return 0.18f;}

    public RenderProsalirus(RenderManager mgr) {
        super(mgr, new ModelProsalirus(), 0.5f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraProsalirus entity) {
        return RenderProsalirus.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraProsalirus entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

    @Override
    protected void preRenderCallback(EntityPrehistoricFloraProsalirus entity, float f) {
        float scale = entity.getAgeScale()*getScaler();
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = entity.width * scale * 0.4F;
    }

}