package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraThecodontosaurus;
import net.lepidodendron.entity.model.entity.ModelThecodontosaurus;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderThecodontosaurus extends RenderLiving<EntityPrehistoricFloraThecodontosaurus> {
    private static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/thecodontosaurus.png");

    public RenderThecodontosaurus(RenderManager mgr) {
        super(mgr, new ModelThecodontosaurus(), 0.3f);
    }

    public static float getScaler() {
        return 0.47F;
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraThecodontosaurus entity) {
        return RenderThecodontosaurus.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraThecodontosaurus entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

    @Override
    protected void preRenderCallback(EntityPrehistoricFloraThecodontosaurus entity, float f) {
        float scale = entity.getAgeScale() * this.getScaler();
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = entity.width * scale * 0.40F;
    }

}