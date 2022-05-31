package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronConfig;
import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraPikaia;
import net.lepidodendron.entity.model.entity.ModelPikaia;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderPikaia extends RenderLiving<EntityPrehistoricFloraPikaia> {
    private static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/pikaia.png");
    private static final ResourceLocation TEXTURE_NERF = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/pikaia_nerf.png");
    public RenderPikaia(RenderManager mgr) {
        super(mgr, new ModelPikaia(), 0.0f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraPikaia entity) {
        if (LepidodendronConfig.doLowRes) {
            return RenderPikaia.TEXTURE_NERF;
        }
        return RenderPikaia.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraPikaia entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

}