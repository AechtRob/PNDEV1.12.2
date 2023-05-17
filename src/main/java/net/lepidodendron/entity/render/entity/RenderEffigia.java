package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraEffigia;
import net.lepidodendron.entity.model.entity.ModelEffigia;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderEffigia extends RenderLiving<EntityPrehistoricFloraEffigia> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/effigia.png");

    public RenderEffigia(RenderManager mgr) {
        super(mgr, new ModelEffigia(), 0.5f);
    }

    public static float getScaler() {
        return  0.355f;
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraEffigia entity) {
        return RenderEffigia.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraEffigia entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

    @Override
    protected void preRenderCallback(EntityPrehistoricFloraEffigia entity, float f) {
        float scale = entity.getAgeScale()*this.getScaler();
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = entity.width * scale * 0.28F;
    }

}