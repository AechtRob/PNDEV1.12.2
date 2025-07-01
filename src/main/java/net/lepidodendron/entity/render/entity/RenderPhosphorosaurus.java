package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraPhosphorosaurus;
import net.lepidodendron.entity.model.entity.ModelPhosphorosaurus;
import net.lepidodendron.entity.render.RenderLivingBaseWithBook;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderPhosphorosaurus extends RenderLivingBaseWithBook<EntityPrehistoricFloraPhosphorosaurus> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/phosphorosaurus.png");

    public static float getScaler() {
        return 1f;
    }

    public RenderPhosphorosaurus(RenderManager mgr) {
        super(mgr, new ModelPhosphorosaurus(),0.9f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraPhosphorosaurus entity) {
        return RenderPhosphorosaurus.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraPhosphorosaurus entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

    @Override
    protected void preRenderCallback(EntityPrehistoricFloraPhosphorosaurus entity, float f) {
        float scale = entity.getAgeScale()*getScaler();
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = entity.width * scale * 0.50F;
    }

}