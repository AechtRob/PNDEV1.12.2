package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraMelanedaphodon;
import net.lepidodendron.entity.model.entity.ModelMelanedaphodon;
import net.lepidodendron.entity.render.RenderLivingBaseWithBook;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderMelanedaphodon extends RenderLivingBaseWithBook<EntityPrehistoricFloraMelanedaphodon> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/melanedaphodon.png");

    public static float getScaler() {return 0.365f;}
    public RenderMelanedaphodon(RenderManager mgr) {
        super(mgr, new ModelMelanedaphodon(), 0.3f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraMelanedaphodon entity) {
        return RenderMelanedaphodon.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraMelanedaphodon entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

    @Override
    protected void preRenderCallback(EntityPrehistoricFloraMelanedaphodon entity, float f) {
        float scale = entity.getAgeScale()*getScaler();
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = 0;
    }

}