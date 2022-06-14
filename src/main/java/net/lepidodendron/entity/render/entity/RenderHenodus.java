package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraHenodus;
import net.lepidodendron.entity.model.entity.ModelHenodus;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderHenodus extends RenderLiving<EntityPrehistoricFloraHenodus> {
    private static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/henodus.png");

    public RenderHenodus(RenderManager mgr) {
        super(mgr, new ModelHenodus(), 0.0f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraHenodus entity) {
        return RenderHenodus.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraHenodus entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

}


































































