package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraAcrolepis;
import net.lepidodendron.entity.model.entity.ModelAcrolepis;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderAcrolepis extends RenderLiving<EntityPrehistoricFloraAcrolepis> {
    private static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/acrolepis.png");

    public RenderAcrolepis(RenderManager mgr) {
        super(mgr, new ModelAcrolepis(), 0.0f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraAcrolepis entity) {
        return RenderAcrolepis.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraAcrolepis entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

}