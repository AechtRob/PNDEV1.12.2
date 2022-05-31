package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraNectocaris;
import net.lepidodendron.entity.model.entity.ModelNectocaris;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderNectocaris extends RenderLiving<EntityPrehistoricFloraNectocaris> {
    private static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/nectocaris.png");

    public RenderNectocaris(RenderManager mgr) {
        super(mgr, new ModelNectocaris(), 0.0f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraNectocaris entity) {
        return RenderNectocaris.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraNectocaris entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

}