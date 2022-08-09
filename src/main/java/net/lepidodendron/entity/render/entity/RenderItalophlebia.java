package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraItalophlebia;
import net.lepidodendron.entity.model.entity.ModelItalophlebia;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderItalophlebia extends RenderLiving<EntityPrehistoricFloraItalophlebia> {
    private static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/italophlebia.png");

    public RenderItalophlebia(RenderManager mgr) {
        super(mgr, new ModelItalophlebia(), 0.0f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraItalophlebia entity) {
        return RenderItalophlebia.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraItalophlebia entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

}

