package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraAiniktozoon;
import net.lepidodendron.entity.model.entity.ModelAiniktozoon;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderAiniktozoon extends RenderLiving<EntityPrehistoricFloraAiniktozoon> {
    private static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/ainiktozoon.png");
    public static final ModelBase MODEL_BASE = new ModelAiniktozoon();

    public RenderAiniktozoon(RenderManager mgr) {
        super(mgr, MODEL_BASE, 0.0f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraAiniktozoon entity) {
        return RenderAiniktozoon.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraAiniktozoon entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

}