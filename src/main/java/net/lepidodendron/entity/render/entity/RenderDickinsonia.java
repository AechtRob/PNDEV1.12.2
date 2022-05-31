package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraDickinsonia;
import net.lepidodendron.entity.model.entity.ModelDickinsonia;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderDickinsonia extends RenderLiving<EntityPrehistoricFloraDickinsonia> {
    private static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/dickinsonia.png");

    public RenderDickinsonia(RenderManager mgr) {
        super(mgr, new ModelDickinsonia(), 0.0f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraDickinsonia entity) {
        return RenderDickinsonia.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraDickinsonia entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

}