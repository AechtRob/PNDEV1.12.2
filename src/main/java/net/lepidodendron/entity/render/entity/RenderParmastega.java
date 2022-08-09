package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraParmastega;
import net.lepidodendron.entity.model.entity.ModelParmastega;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderParmastega extends RenderLiving<EntityPrehistoricFloraParmastega> {
    private static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/parmastega.png");

    public RenderParmastega(RenderManager mgr) {
        super(mgr, new ModelParmastega(), 0.0f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraParmastega entity) {
        return RenderParmastega.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraParmastega entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

}


