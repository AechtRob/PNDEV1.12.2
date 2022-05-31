package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraQilinyu;
import net.lepidodendron.entity.model.entity.ModelQilinyu;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderQilinyu extends RenderLiving<EntityPrehistoricFloraQilinyu> {
    private static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/qilinyu.png");

    public RenderQilinyu(RenderManager mgr) {
        super(mgr, new ModelQilinyu(), 0.0f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraQilinyu entity) {
        return RenderQilinyu.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraQilinyu entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

}