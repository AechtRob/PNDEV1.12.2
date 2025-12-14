package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraSuchomimus;
import net.lepidodendron.entity.model.entity.ModelSuchomimus;
import net.lepidodendron.entity.render.RenderLivingBaseWithBook;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderSuchomimus extends RenderLivingBaseWithBook<EntityPrehistoricFloraSuchomimus> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/suchomimus.png");

    public static float getScaler() {return 1F;}

    public RenderSuchomimus(RenderManager mgr) {
        super(mgr, new ModelSuchomimus(), 0.5f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraSuchomimus entity) {
        return RenderSuchomimus.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraSuchomimus entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

    @Override
    protected void preRenderCallback(EntityPrehistoricFloraSuchomimus entity, float f) {
        float scale = entity.getAgeScale()*getScaler();
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = entity.width * scale * 0.40F;
    }

}