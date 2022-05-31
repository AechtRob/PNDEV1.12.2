package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraUrosthenes;
import net.lepidodendron.entity.model.entity.ModelUrosthenes;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderUrosthenes extends RenderLiving<EntityPrehistoricFloraUrosthenes> {
    private static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/urosthenes.png");

    public RenderUrosthenes(RenderManager mgr) {
        super(mgr, new ModelUrosthenes(), 0.0f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraUrosthenes entity) {
        return RenderUrosthenes.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraUrosthenes entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

}