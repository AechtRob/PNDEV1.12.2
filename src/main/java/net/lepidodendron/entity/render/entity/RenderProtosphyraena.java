package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraProtosphyraena;
import net.lepidodendron.entity.model.entity.ModelProtosphyraena;
import net.lepidodendron.entity.render.RenderLivingBaseWithBook;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderProtosphyraena extends RenderLivingBaseWithBook<EntityPrehistoricFloraProtosphyraena> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/protosphyraena.png");

    public static float getScaler() {return 0.84F;}
    public RenderProtosphyraena(RenderManager mgr) {
        super(mgr, new ModelProtosphyraena(), 0.0f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraProtosphyraena entity) {
        return RenderProtosphyraena.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraProtosphyraena entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

    @Override
    protected void preRenderCallback(EntityPrehistoricFloraProtosphyraena entity, float f) {
        float scale = entity.getAgeScale()*getScaler();
        if (scale < 0.1f) {scale = 0.1f;}
        GlStateManager.scale(scale, scale, scale);
        //this.shadowSize = entity.width * scale * 0.3f;
    }

}