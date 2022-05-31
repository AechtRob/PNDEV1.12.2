package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraTraquairius;
import net.lepidodendron.entity.model.entity.ModelTraquairius;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderTraquairius extends RenderLiving<EntityPrehistoricFloraTraquairius> {
    private static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/traquairius.png");

    public RenderTraquairius(RenderManager mgr) {
        super(mgr, new ModelTraquairius(), 0.0f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraTraquairius entity) {
        return RenderTraquairius.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraTraquairius entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

}