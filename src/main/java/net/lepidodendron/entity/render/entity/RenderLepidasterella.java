package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraLepidasterella;
import net.lepidodendron.entity.model.entity.ModelLepidasterella;
import net.lepidodendron.entity.render.RenderLivingBaseWithBook;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderLepidasterella extends RenderLivingBaseWithBook<EntityPrehistoricFloraLepidasterella> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/lepidasterella.png");

    public static float getScaler() {
        return 0.7F * 0.2F;
    }
    public RenderLepidasterella(RenderManager mgr) {
        super(mgr, new ModelLepidasterella(), 0.0f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraLepidasterella entity) {
        return RenderLepidasterella.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraLepidasterella entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }
    @Override
    protected void preRenderCallback(EntityPrehistoricFloraLepidasterella entity, float f) {
        float scale = this.getScaler();
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = 0;
    }

}