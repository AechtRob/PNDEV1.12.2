package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraSurcaudalus;
import net.lepidodendron.entity.model.entity.ModelSurcaudalus;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderSurcaudalus extends RenderLiving<EntityPrehistoricFloraSurcaudalus> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/surcaudalus.png");

    public RenderSurcaudalus(RenderManager mgr) {
        super(mgr, new ModelSurcaudalus(), 0.0f);
    }

    public static float getScaler() {return 0.25F; }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraSurcaudalus entity) {
        return RenderSurcaudalus.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraSurcaudalus entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

    @Override
    protected void preRenderCallback(EntityPrehistoricFloraSurcaudalus entity, float f) {
        float scale = this.getScaler();
        GlStateManager.scale(scale, scale, scale);
    }
}