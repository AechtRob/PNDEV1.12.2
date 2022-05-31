package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraAcanthodes;
import net.lepidodendron.entity.model.entity.ModelAcanthodes;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderAcanthodes extends RenderLiving<EntityPrehistoricFloraAcanthodes> {
    private static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/acanthodes.png");

    public RenderAcanthodes(RenderManager mgr) {
        super(mgr, new ModelAcanthodes(), 0.0f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraAcanthodes entity) {
        return RenderAcanthodes.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraAcanthodes entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

}