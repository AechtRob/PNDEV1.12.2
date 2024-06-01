package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraSillosuchus;
import net.lepidodendron.entity.model.entity.ModelSillosuchus;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderSillosuchus extends RenderLiving<EntityPrehistoricFloraSillosuchus> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/sillosuchus.png");

    public static float getScaler() {return 1.0F;}

    public RenderSillosuchus(RenderManager mgr) {
        super(mgr, new ModelSillosuchus(), 0.5f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraSillosuchus entity) {
        return RenderSillosuchus.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraSillosuchus entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

    @Override
    protected void preRenderCallback(EntityPrehistoricFloraSillosuchus entity, float f) {
        float scale = entity.getAgeScale()*getScaler();
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = entity.width * scale * 0.86F;
    }

}