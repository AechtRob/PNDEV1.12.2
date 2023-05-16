package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraSkeemella;
import net.lepidodendron.entity.EntityPrehistoricFloraVetulicola;
import net.lepidodendron.entity.model.entity.ModelSkeemella;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderSkeemella extends RenderLiving<EntityPrehistoricFloraSkeemella> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/skeemella.png");
    public static final ModelBase MODEL_BASE = new ModelSkeemella();

    public static float getScaler() {return 0.15F;}

    public RenderSkeemella(RenderManager mgr) {
        super(mgr, MODEL_BASE, 0.0f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraSkeemella entity) {
        return RenderSkeemella.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraSkeemella entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
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