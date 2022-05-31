package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraEnoploura;
import net.lepidodendron.entity.model.entity.ModelEnoploura;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderEnoploura extends RenderLiving<EntityPrehistoricFloraEnoploura> {
    private static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/enoploura.png");

    public RenderEnoploura(RenderManager mgr) {
        super(mgr, new ModelEnoploura(), 0.0f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraEnoploura entity) {
        return RenderEnoploura.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraEnoploura entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

}