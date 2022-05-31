package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronConfig;
import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraTokummia;
import net.lepidodendron.entity.model.entity.ModelTokummia;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderTokummia extends RenderLiving<EntityPrehistoricFloraTokummia> {
    private static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/tokummia.png");
    private static final ResourceLocation TEXTURE_NERF = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/tokummia_nerf.png");
    public RenderTokummia(RenderManager mgr) {
        super(mgr, new ModelTokummia(), 0.0f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraTokummia entity) {
        if (LepidodendronConfig.doLowRes) {
            return RenderTokummia.TEXTURE_NERF;
        }
        return RenderTokummia.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraTokummia entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

}