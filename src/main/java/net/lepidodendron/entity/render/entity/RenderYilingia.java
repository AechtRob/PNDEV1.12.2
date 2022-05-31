package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraYilingia;
import net.lepidodendron.entity.model.entity.ModelYilingia;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderYilingia extends RenderLiving<EntityPrehistoricFloraYilingia> {
    private static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/yilingia.png");

    public RenderYilingia(RenderManager mgr) {
        super(mgr, new ModelYilingia(), 0.0f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraYilingia entity) {
        return RenderYilingia.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraYilingia entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

}