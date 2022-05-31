package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraOttoia;
import net.lepidodendron.entity.model.entity.ModelOttoia;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderOttoia extends RenderLiving<EntityPrehistoricFloraOttoia> {
    private static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/ottoia.png");

    public RenderOttoia(RenderManager mgr) {
        super(mgr, new ModelOttoia(), 0.0f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraOttoia entity) {
        return RenderOttoia.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraOttoia entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
        float getTick = (float)entityLiving.getTicks();
        if (entityLiving.getBuriedTick() > 0 || entityLiving.getBuried() || entityLiving.getSwimCount() <= 0) {
            float rotateCycle = 120F; //ticks to perfom one rotation
            float ticksRotateFactor = (float) (getTick-((Math.floor((double)(getTick/rotateCycle)))*rotateCycle))/rotateCycle;
            float rotation = (ticksRotateFactor * 360F);
            GlStateManager.rotate(rotation, 0.0F, 1.0F, 0.0F);
            if (entityLiving.getBuried() && (entityLiving.getBuriedTick() <= 0)) {
                float bobCycle = 100F; //ticks to perfom one bob
                float ticksBobFactor = (float) (getTick - ((Math.floor((double) (getTick / bobCycle))) * bobCycle)) / bobCycle;
                float bob = 0.6f * (float) Math.pow((Math.sin(ticksBobFactor * Math.toRadians(180))),2);
                GlStateManager.translate(0.0F, bob, 0.0F);
            }
        }
        else {
            float compressCycle = 45; //ticks to perfom one compression
            float ticksCompressFactor = (float) (getTick - ((Math.floor((double) (getTick / compressCycle))) * compressCycle)) / compressCycle;
            float compress = 0.8F + (0.3F * (float) (Math.sin(ticksCompressFactor * Math.toRadians(180))));
            GlStateManager.scale(0.8F, 0.8F, compress);
        }
    }

}