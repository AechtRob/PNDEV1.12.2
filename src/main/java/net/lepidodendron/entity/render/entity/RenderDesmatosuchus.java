package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraDesmatosuchus;
import net.lepidodendron.entity.model.entity.ModelDesmatosuchus;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderDesmatosuchus extends RenderLiving<EntityPrehistoricFloraDesmatosuchus> {
    private static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/desmatosuchus.png");

    public RenderDesmatosuchus(RenderManager mgr) {
        super(mgr, new ModelDesmatosuchus(), 0.0f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraDesmatosuchus entity) {
        return RenderDesmatosuchus.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraDesmatosuchus entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

}




















































