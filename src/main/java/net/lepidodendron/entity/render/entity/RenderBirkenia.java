package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraBirkenia;
import net.lepidodendron.entity.model.entity.ModelBirkenia;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderBirkenia extends RenderLiving<EntityPrehistoricFloraBirkenia> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/birkenia.png");
    public static final ModelBase MODEL_BASE = new ModelBirkenia();

    public RenderBirkenia(RenderManager mgr) {
        super(mgr, MODEL_BASE, 0.0f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraBirkenia entity) {
        return RenderBirkenia.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraBirkenia entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

}