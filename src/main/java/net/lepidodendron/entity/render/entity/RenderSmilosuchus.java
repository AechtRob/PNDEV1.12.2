package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraSmilosuchus;
import net.lepidodendron.entity.model.entity.ModelSmilosuchus;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderSmilosuchus extends RenderLiving<EntityPrehistoricFloraSmilosuchus> {
    private static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/smilosuchus.png");

    public RenderSmilosuchus(RenderManager mgr) {
        super(mgr, new ModelSmilosuchus(), 0.0f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraSmilosuchus entity) {
        return RenderSmilosuchus.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraSmilosuchus entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

}






















