package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraBlourugia;
import net.lepidodendron.entity.model.entity.ModelBlourugia;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderBlourugia extends RenderLiving<EntityPrehistoricFloraBlourugia> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/blourugia.png");

    public RenderBlourugia(RenderManager mgr) {
        super(mgr, new ModelBlourugia(), 0.0f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraBlourugia entity) {
        return RenderBlourugia.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraBlourugia entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

}