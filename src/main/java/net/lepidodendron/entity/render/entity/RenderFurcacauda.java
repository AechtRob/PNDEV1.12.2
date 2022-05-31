package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraFurcacauda;
import net.lepidodendron.entity.model.entity.ModelFurcacauda;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderFurcacauda extends RenderLiving<EntityPrehistoricFloraFurcacauda> {
    private static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/furcacauda.png");

    public RenderFurcacauda(RenderManager mgr) {
        super(mgr, new ModelFurcacauda(), 0.0f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraFurcacauda entity) {
        return RenderFurcacauda.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraFurcacauda entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

}