package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraEllipsocephalus;
import net.lepidodendron.entity.model.entity.ModelEllipsocephalus;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderEllipsocephalus extends RenderLiving<EntityPrehistoricFloraEllipsocephalus> {
    private static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/ellipsocephalus.png");

    public RenderEllipsocephalus(RenderManager mgr) {
        super(mgr, new ModelEllipsocephalus(), 0.0f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraEllipsocephalus entity) {
        return RenderEllipsocephalus.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraEllipsocephalus entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

}