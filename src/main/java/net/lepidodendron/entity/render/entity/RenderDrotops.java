package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraDrotops;
import net.lepidodendron.entity.model.entity.ModelDrotops;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderDrotops extends RenderLiving<EntityPrehistoricFloraDrotops> {
    private static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/drotops.png");

    public RenderDrotops(RenderManager mgr) {
        super(mgr, new ModelDrotops(), 0.0f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraDrotops entity) {
        return RenderDrotops.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraDrotops entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

}













































































































