package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraRubidgea;
import net.lepidodendron.entity.model.entity.ModelRubidgea;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderRubidgea extends RenderLiving<EntityPrehistoricFloraRubidgea> {
    private static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/rubidgea.png");

    public RenderRubidgea(RenderManager mgr) {
        super(mgr, new ModelRubidgea(), 0.0f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraRubidgea entity) {
        return RenderRubidgea.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraRubidgea entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

}



