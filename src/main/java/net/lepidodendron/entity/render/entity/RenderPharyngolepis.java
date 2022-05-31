package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraPharyngolepis;
import net.lepidodendron.entity.model.entity.ModelPharyngolepis;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderPharyngolepis extends RenderLiving<EntityPrehistoricFloraPharyngolepis> {
    private static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/pharyngolepis.png");

    public RenderPharyngolepis(RenderManager mgr) {
        super(mgr, new ModelPharyngolepis(), 0.0f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraPharyngolepis entity) {
        return RenderPharyngolepis.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraPharyngolepis entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

}