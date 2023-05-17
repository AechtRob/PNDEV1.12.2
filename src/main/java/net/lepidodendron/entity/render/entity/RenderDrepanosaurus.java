package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraDrepanosaurus;
import net.lepidodendron.entity.model.entity.ModelDrepanosaurus;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderDrepanosaurus extends RenderLiving<EntityPrehistoricFloraDrepanosaurus> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/drepanosaurus.png");

    public RenderDrepanosaurus(RenderManager mgr) {
        super(mgr, new ModelDrepanosaurus(), 0.0f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraDrepanosaurus entity) {
        return RenderDrepanosaurus.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraDrepanosaurus entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

}


