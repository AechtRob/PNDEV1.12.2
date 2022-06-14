package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraFadenia;
import net.lepidodendron.entity.model.entity.ModelFadenia;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderFadenia extends RenderLiving<EntityPrehistoricFloraFadenia> {
    private static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/fadenia.png");

    public RenderFadenia(RenderManager mgr) {
        super(mgr, new ModelFadenia(), 0.0f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraFadenia entity) {
        return RenderFadenia.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraFadenia entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

}



































































































