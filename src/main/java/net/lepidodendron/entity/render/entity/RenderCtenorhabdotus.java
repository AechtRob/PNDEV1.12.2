package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraCtenorhabdotus;
import net.lepidodendron.entity.model.entity.ModelCtenorhabdotus;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderCtenorhabdotus extends RenderLiving<EntityPrehistoricFloraCtenorhabdotus> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/ctenorhabdotus.png");

    public static float getScaler() {return 0.33F;}

    public RenderCtenorhabdotus(RenderManager mgr) {
        super(mgr, new ModelCtenorhabdotus(), 0.0f);
        this.addLayer(new LayerCtenorhabdotusEmissive(this));
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraCtenorhabdotus entity) {
        return RenderCtenorhabdotus.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraCtenorhabdotus entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

    @Override
    protected void preRenderCallback(EntityPrehistoricFloraCtenorhabdotus entity, float f) {
        float scale = getScaler();
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = entity.width * scale * 0.50F;
    }

}