package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraTyrannophontes;
import net.lepidodendron.entity.model.entity.ModelTyrannophontes;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderTyrannophontes extends RenderLiving<EntityPrehistoricFloraTyrannophontes> {
    private static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/tyrannophontes.png");

    public RenderTyrannophontes(RenderManager mgr) {
        super(mgr, new ModelTyrannophontes(), 0.0f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraTyrannophontes entity) {
        return RenderTyrannophontes.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraTyrannophontes entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

}





























































































