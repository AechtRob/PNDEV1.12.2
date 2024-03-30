package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraHughmilleria;
import net.lepidodendron.entity.model.entity.ModelHughmilleria;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderHughmilleria extends RenderLiving<EntityPrehistoricFloraHughmilleria> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/hughmilleria.png");

    public static float getScaler() {
        return 0.2F;
    }
    public RenderHughmilleria(RenderManager mgr) {
        super(mgr, new ModelHughmilleria(), 0.5f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraHughmilleria entity) {
        float scale = entity.getAgeScale();
        //System.err.println("AgeScale: " + scale);
        return RenderHughmilleria.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraHughmilleria entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

    @Override
    protected void preRenderCallback(EntityPrehistoricFloraHughmilleria entity, float f) {
        float scale = entity.getAgeScale()*this.getScaler();
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = entity.width * scale * 0.45F;
    }

}