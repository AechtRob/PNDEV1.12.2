package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraBobasatrania;
import net.lepidodendron.entity.EntityPrehistoricFloraVetulicola;
import net.lepidodendron.entity.model.entity.ModelVetulicola;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderVetulicola extends RenderLiving<EntityPrehistoricFloraVetulicola> {
    private static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/vetulicola.png");
    public static float getScaler() {return 0.25F;}

    public RenderVetulicola(RenderManager mgr) {
        super(mgr, new ModelVetulicola(), 0.0f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraVetulicola entity) {
        return RenderVetulicola.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraVetulicola entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }
    protected void preRenderCallback(EntityPrehistoricFloraVetulicola entity, float f) {
        float scale = this.getScaler();
        if (scale < 0.1f) {
            scale = 0.1f;
        }
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = 0;
    }
}