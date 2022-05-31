package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraLyrarapax;
import net.lepidodendron.entity.model.entity.ModelLyrarapax;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderLyrarapax extends RenderLiving<EntityPrehistoricFloraLyrarapax> {
    private static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/lyrarapax.png");

    public RenderLyrarapax(RenderManager mgr) {
        super(mgr, new ModelLyrarapax(), 0.0f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraLyrarapax entity) {
        return RenderLyrarapax.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraLyrarapax entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

}