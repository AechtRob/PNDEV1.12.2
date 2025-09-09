package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraIncisivosaurus;
import net.lepidodendron.entity.model.entity.ModelIncisivosaurus;
import net.lepidodendron.entity.render.RenderLivingBaseWithBook;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderIncisivosaurus extends RenderLivingBaseWithBook<EntityPrehistoricFloraIncisivosaurus> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/incisivosaurus.png");

    public RenderIncisivosaurus(RenderManager mgr) {
        super(mgr, new ModelIncisivosaurus(), 0.3f);
    }

    public static float getScaler() {
        return 0.225F;
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraIncisivosaurus entity) {
        return RenderIncisivosaurus.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraIncisivosaurus entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

    @Override
    protected void preRenderCallback(EntityPrehistoricFloraIncisivosaurus entity, float f) {
        float scale = entity.getAgeScale() * this.getScaler();
        if (scale < 0.1f) {scale = 0.1f;}
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = entity.width * scale * 0.35F;
    }

}