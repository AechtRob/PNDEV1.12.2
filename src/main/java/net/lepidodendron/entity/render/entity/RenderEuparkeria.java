package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraEuparkeria;
import net.lepidodendron.entity.model.entity.ModelEuparkeria;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderEuparkeria extends RenderLiving<EntityPrehistoricFloraEuparkeria> {
    private static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/euparkeria.png");

    public RenderEuparkeria(RenderManager mgr) {
        super(mgr, new ModelEuparkeria(), 0.0f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraEuparkeria entity) {
        return RenderEuparkeria.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraEuparkeria entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

}















































