package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraGerrothorax;
import net.lepidodendron.entity.model.entity.ModelGerrothorax;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderGerrothorax extends RenderLiving<EntityPrehistoricFloraGerrothorax> {
    private static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/gerrothorax.png");

    public RenderGerrothorax(RenderManager mgr) {
        super(mgr, new ModelGerrothorax(), 0.0f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraGerrothorax entity) {
        return RenderGerrothorax.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraGerrothorax entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

}




