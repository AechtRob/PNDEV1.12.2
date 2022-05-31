package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraYorgia;
import net.lepidodendron.entity.model.entity.ModelYorgia;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderYorgia extends RenderLiving<EntityPrehistoricFloraYorgia> {
    private static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/yorgia.png");

    public RenderYorgia(RenderManager mgr) {
        super(mgr, new ModelYorgia(), 0.0f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraYorgia entity) {
        return RenderYorgia.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraYorgia entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

}