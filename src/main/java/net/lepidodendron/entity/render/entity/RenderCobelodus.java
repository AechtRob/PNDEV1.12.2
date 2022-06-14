package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraCobelodus;
import net.lepidodendron.entity.model.entity.ModelCobelodus;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderCobelodus extends RenderLiving<EntityPrehistoricFloraCobelodus> {
    private static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/cobelodus.png");

    public RenderCobelodus(RenderManager mgr) {
        super(mgr, new ModelCobelodus(), 0.0f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraCobelodus entity) {
        return RenderCobelodus.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraCobelodus entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

}

























































































