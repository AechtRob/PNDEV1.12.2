package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraPlateosaurus;
import net.lepidodendron.entity.model.entity.ModelPlateosaurus;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderPlateosaurus extends RenderLiving<EntityPrehistoricFloraPlateosaurus> {
    private static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/plateosaurus.png");
    public static float getScaler() {return 1.15f * 0.875F;}

    public RenderPlateosaurus(RenderManager mgr) {
        super(mgr, new ModelPlateosaurus(), 0.5f);
        //EDIT NEEDED WHEN MODEL IS FIXED!
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraPlateosaurus entity) {
        return RenderPlateosaurus.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraPlateosaurus entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

    @Override
    protected void preRenderCallback(EntityPrehistoricFloraPlateosaurus entity, float f) {
        float scale = entity.getAgeScale()*getScaler();
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = entity.width * scale * 0.40F;
    }

}