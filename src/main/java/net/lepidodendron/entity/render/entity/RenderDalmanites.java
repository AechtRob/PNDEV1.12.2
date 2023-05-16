package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraDalmanites;
import net.lepidodendron.entity.model.entity.ModelDalmanites;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderDalmanites extends RenderLiving<EntityPrehistoricFloraDalmanites> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/dalmanites.png");
    public static final ModelBase MODEL_BASE = new ModelDalmanites();

    public RenderDalmanites(RenderManager mgr) {
        super(mgr, MODEL_BASE, 0.0f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraDalmanites entity) {
        return RenderDalmanites.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraDalmanites entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

}