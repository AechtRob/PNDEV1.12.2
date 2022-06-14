package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraEffigia;
import net.lepidodendron.entity.model.entity.ModelEffigia;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderEffigia extends RenderLiving<EntityPrehistoricFloraEffigia> {
    private static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/effigia.png");

    public RenderEffigia(RenderManager mgr) {
        super(mgr, new ModelEffigia(), 0.0f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraEffigia entity) {
        return RenderEffigia.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraEffigia entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

}

















































