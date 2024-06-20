package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraHeterodontosaurus;
import net.lepidodendron.entity.model.entity.ModelHeterodontosaurus;
import net.lepidodendron.entity.render.RenderLivingBaseWithBook;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderHeterodontosaurus extends RenderLivingBaseWithBook<EntityPrehistoricFloraHeterodontosaurus> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/heterodontosaurus.png");

    public RenderHeterodontosaurus(RenderManager mgr) {
        super(mgr, new ModelHeterodontosaurus(), 0.3f);
    }

    public static float getScaler() {
        return 0.39F;
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraHeterodontosaurus entity) {
        return RenderHeterodontosaurus.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraHeterodontosaurus entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

    @Override
    protected void preRenderCallback(EntityPrehistoricFloraHeterodontosaurus entity, float f) {
        float scale = entity.getAgeScale() * this.getScaler();
        if (scale < 0.1f) {scale = 0.1f;}
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = entity.width * scale * 0.35F;
    }

}