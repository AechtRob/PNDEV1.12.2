package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraTeyujagua;
import net.lepidodendron.entity.model.entity.ModelTeyujagua;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderTeyujagua extends RenderLiving<EntityPrehistoricFloraTeyujagua> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/teyujagua.png");
    public static final ModelBase MODEL_BASE = new ModelTeyujagua();

    public RenderTeyujagua(RenderManager mgr) {
        super(mgr, MODEL_BASE, 0.0f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraTeyujagua entity) {
        return RenderTeyujagua.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraTeyujagua entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

}



