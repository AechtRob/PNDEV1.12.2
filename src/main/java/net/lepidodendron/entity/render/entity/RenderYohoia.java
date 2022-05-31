package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraYohoia;
import net.lepidodendron.entity.model.entity.ModelYohoia;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderYohoia extends RenderLiving<EntityPrehistoricFloraYohoia> {
    private static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/yohoia.png");

    public RenderYohoia(RenderManager mgr) {
        super(mgr, new ModelYohoia(), 0.0f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraYohoia entity) {
        return RenderYohoia.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraYohoia entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

}