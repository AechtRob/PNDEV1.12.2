package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraWiwaxia;
import net.lepidodendron.entity.model.entity.ModelWiwaxia;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderWiwaxia extends RenderLiving<EntityPrehistoricFloraWiwaxia> {
    private static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/wiwaxia.png");

    public RenderWiwaxia(RenderManager mgr) {
        super(mgr, new ModelWiwaxia(), 0.0f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraWiwaxia entity) {
        return RenderWiwaxia.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraWiwaxia entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

}