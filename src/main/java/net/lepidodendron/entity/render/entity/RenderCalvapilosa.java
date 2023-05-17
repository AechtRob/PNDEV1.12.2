package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraCalvapilosa;
import net.lepidodendron.entity.model.entity.ModelCalvapilosa;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderCalvapilosa extends RenderLiving<EntityPrehistoricFloraCalvapilosa> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/calvapilosa.png");

    public RenderCalvapilosa(RenderManager mgr) {
        super(mgr, new ModelCalvapilosa(), 0.0f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraCalvapilosa entity) {
        return RenderCalvapilosa.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraCalvapilosa entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

}




