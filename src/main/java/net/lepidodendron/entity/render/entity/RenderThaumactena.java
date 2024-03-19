package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraCyclomedusa;
import net.lepidodendron.entity.EntityPrehistoricFloraThaumactena;
import net.lepidodendron.entity.model.entity.ModelCombJelly;
import net.lepidodendron.entity.model.entity.ModelThaumactena;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderThaumactena extends RenderLiving<EntityPrehistoricFloraThaumactena> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/thaumactena.png");

    public static float getScaler() {return 0.5F;}

    public RenderThaumactena(RenderManager mgr) {
        super(mgr, new ModelThaumactena(), 0.0f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraThaumactena entity) {
        return RenderThaumactena.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraThaumactena entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

    @Override
    protected void preRenderCallback(EntityPrehistoricFloraThaumactena entity, float f) {
        float scale = getScaler();
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = entity.width * scale * 0.50F;
    }

}