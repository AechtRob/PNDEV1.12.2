package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraPurlovia;
import net.lepidodendron.entity.model.entity.ModelPurlovia;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderPurlovia extends RenderLiving<EntityPrehistoricFloraPurlovia> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/purlovia.png");

    public static float getScaler() {return 0.44f;}
    public RenderPurlovia(RenderManager mgr) {
        super(mgr, new ModelPurlovia(), 0.225F);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraPurlovia entity) {
        return RenderPurlovia.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraPurlovia entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

    @Override
    protected void preRenderCallback(EntityPrehistoricFloraPurlovia entity, float f) {
        float scale = entity.getAgeScale()*getScaler();
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = entity.width * scale * 0.225F;
    }

}