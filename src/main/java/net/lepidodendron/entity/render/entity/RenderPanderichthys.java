package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraPanderichthys;
import net.lepidodendron.entity.model.entity.ModelPanderichthys;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderPanderichthys extends RenderLiving<EntityPrehistoricFloraPanderichthys> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/panderichthys.png");
    public static final ModelBase MODEL_BASE = new ModelPanderichthys();

    public RenderPanderichthys(RenderManager mgr) {
        super(mgr, MODEL_BASE, 0.12f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraPanderichthys entity) {
        return RenderPanderichthys.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraPanderichthys entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

}