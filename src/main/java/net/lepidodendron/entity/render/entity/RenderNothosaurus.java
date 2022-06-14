package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraNothosaurus;
import net.lepidodendron.entity.model.entity.ModelNothosaurus;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderNothosaurus extends RenderLiving<EntityPrehistoricFloraNothosaurus> {
    private static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/nothosaurus.png");

    public RenderNothosaurus(RenderManager mgr) {
        super(mgr, new ModelNothosaurus(), 0.0f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraNothosaurus entity) {
        return RenderNothosaurus.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraNothosaurus entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

}































































