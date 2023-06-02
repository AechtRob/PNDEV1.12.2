package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraGerrothorax;
import net.lepidodendron.entity.model.entity.ModelGerrothorax;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderGerrothorax extends RenderLiving<EntityPrehistoricFloraGerrothorax> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/gerrothorax.png");
    private static final ResourceLocation TEXTURE_BABY = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/gerrothorax_baby.png");

    public static float getScaler() {
        return 1.375F *0.39F;
    }

    public RenderGerrothorax(RenderManager mgr) {
        super(mgr, new ModelGerrothorax(), 0.0f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraGerrothorax entity) {
        if (entity.isSmall()) {
            return RenderGerrothorax.TEXTURE_BABY;
        }
        return RenderGerrothorax.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraGerrothorax entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

    protected void preRenderCallback(EntityPrehistoricFloraGerrothorax entity, float f) {
        float scale = entity.getAgeScale()*getScaler();
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = entity.width * scale * 0.67F;
    }

}





