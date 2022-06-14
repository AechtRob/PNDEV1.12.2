package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraPoposaurus;
import net.lepidodendron.entity.model.entity.ModelPoposaurus;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderPoposaurus extends RenderLiving<EntityPrehistoricFloraPoposaurus> {
    private static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/poposaurus.png");

    public RenderPoposaurus(RenderManager mgr) {
        super(mgr, new ModelPoposaurus(), 0.0f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraPoposaurus entity) {
        return RenderPoposaurus.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraPoposaurus entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

}
































