package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraAeger;
import net.lepidodendron.entity.model.entity.ModelAeger;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderAeger extends RenderLiving<EntityPrehistoricFloraAeger> {
    private static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/aeger.png");

    public RenderAeger(RenderManager mgr) {
        super(mgr, new ModelAeger(), 0.0f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraAeger entity) {
        return RenderAeger.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraAeger entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

}










































































