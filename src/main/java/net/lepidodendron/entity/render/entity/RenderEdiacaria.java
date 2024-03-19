package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraCyclomedusa;
import net.lepidodendron.entity.EntityPrehistoricFloraEdiacaria;
import net.lepidodendron.entity.model.entity.ModelCombJelly;
import net.lepidodendron.entity.model.entity.ModelPrecambrianJelly;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderEdiacaria extends RenderLiving<EntityPrehistoricFloraEdiacaria> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/ediacaria.png");

    public static float getScaler() {return 0.6F;}

    public RenderEdiacaria(RenderManager mgr) {
        super(mgr, new ModelPrecambrianJelly(), 0.0f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraEdiacaria entity) {
        return RenderEdiacaria.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraEdiacaria entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

    @Override
    protected void preRenderCallback(EntityPrehistoricFloraEdiacaria entity, float f) {
        float scale = getScaler();
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = entity.width * scale * 0.50F;
    }

}