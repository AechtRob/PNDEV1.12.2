package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraJonkeria;
import net.lepidodendron.entity.model.entity.ModelJonkeria;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderJonkeria extends RenderLiving<EntityPrehistoricFloraJonkeria> {
    private static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/jonkeria.png");

    public RenderJonkeria(RenderManager mgr) {
        super(mgr, new ModelJonkeria(), 0.45f);
    }

    public static float getScaler() {return 0.9f;}

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraJonkeria entity) {
        return RenderJonkeria.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraJonkeria entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

    @Override
    protected void preRenderCallback(EntityPrehistoricFloraJonkeria entity, float f) {
        float scale = entity.getAgeScale() * getScaler();
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = entity.width * scale * 0.45F;
    }

}