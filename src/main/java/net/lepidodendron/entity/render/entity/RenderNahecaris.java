package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraNahecaris;
import net.lepidodendron.entity.model.entity.ModelNahecaris;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderNahecaris extends RenderLiving<EntityPrehistoricFloraNahecaris> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/nahecaris.png");

    public RenderNahecaris(RenderManager mgr) {
        super(mgr, new ModelNahecaris(), 0.0f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraNahecaris entity) {
        return RenderNahecaris.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraNahecaris entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

    @Override
    protected void preRenderCallback(EntityPrehistoricFloraNahecaris entity, float f) {
        float scale = 0.74F;
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = entity.width * scale * 0.15F;
    }
}





