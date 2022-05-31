package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronConfig;
import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraOpabinia;
import net.lepidodendron.entity.model.entity.ModelOpabinia;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderOpabinia extends RenderLiving<EntityPrehistoricFloraOpabinia> {
    private static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/opabinia.png");
    private static final ResourceLocation TEXTURE_NERF = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/opabinia_nerf.png");
    public RenderOpabinia(RenderManager mgr) {
        super(mgr, new ModelOpabinia(), 0.0f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraOpabinia entity) {
        if (LepidodendronConfig.doLowRes) {
            return RenderOpabinia.TEXTURE_NERF;
        }
        return RenderOpabinia.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraOpabinia entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

    @Override
    protected void preRenderCallback(EntityPrehistoricFloraOpabinia entity, float f) {
        GlStateManager.scale(0.75, 0.75, 0.75);
    }

}