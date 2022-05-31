package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronConfig;
import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraHallucigenia;
import net.lepidodendron.entity.model.entity.ModelHallucigenia;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderHallucigenia extends RenderLiving<EntityPrehistoricFloraHallucigenia> {
    private static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/hallucigenia.png");
    private static final ResourceLocation TEXTURE_NERF = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/hallucigenia_nerf.png");
    public RenderHallucigenia(RenderManager mgr) {
        super(mgr, new ModelHallucigenia(), 0.0f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraHallucigenia entity) {
        if (LepidodendronConfig.doLowRes) {
            return RenderHallucigenia.TEXTURE_NERF;
        }
        return RenderHallucigenia.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraHallucigenia entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

}