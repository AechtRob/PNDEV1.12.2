package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraArchoblattinaNymph;
import net.lepidodendron.entity.model.entity.ModelArchoblattinaNymph;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderArchoblattinaNymph extends RenderLiving<EntityPrehistoricFloraArchoblattinaNymph> {
    private static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/archoblattina_nymph.png");

    public RenderArchoblattinaNymph(RenderManager mgr) {
        super(mgr, new ModelArchoblattinaNymph(), 0.0f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraArchoblattinaNymph entity) {
        return RenderArchoblattinaNymph.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraArchoblattinaNymph entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

}