package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraPelecanimimus;
import net.lepidodendron.entity.model.entity.ModelPelecanimimus;
import net.lepidodendron.entity.render.RenderLivingBaseWithBook;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderPelecanimimus extends RenderLivingBaseWithBook<EntityPrehistoricFloraPelecanimimus> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/pelecanimimus.png");

    public static float getScaler() {return 0.5f;}
    public RenderPelecanimimus(RenderManager mgr) {
        super(mgr, new ModelPelecanimimus(), 0.3f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraPelecanimimus entity) {
        return RenderPelecanimimus.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraPelecanimimus entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

    @Override
    protected void preRenderCallback(EntityPrehistoricFloraPelecanimimus entity, float f) {
        float scale = entity.getAgeScale()*getScaler();
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = 0;
    }

}