package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraYunnanozoon;
import net.lepidodendron.entity.model.entity.ModelYunnanozoon;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderYunnanozoon extends RenderLiving<EntityPrehistoricFloraYunnanozoon> {
    private static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/yunnanozoon.png");
     public RenderYunnanozoon(RenderManager mgr) {
        super(mgr, new ModelYunnanozoon(), 0.0f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraYunnanozoon entity) {
        return RenderYunnanozoon.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraYunnanozoon entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

}