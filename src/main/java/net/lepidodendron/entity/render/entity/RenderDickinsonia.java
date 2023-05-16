package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraDickinsonia;
import net.lepidodendron.entity.model.entity.ModelDickinsonia;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderDickinsonia extends RenderLiving<EntityPrehistoricFloraDickinsonia> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/dickinsonia.png");
    public static final ModelBase MODEL_BASE = new ModelDickinsonia();

    public RenderDickinsonia(RenderManager mgr) {
        super(mgr, MODEL_BASE, 0.0f);
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