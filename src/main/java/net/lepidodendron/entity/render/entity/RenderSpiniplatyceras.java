package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraSpiniplatyceras;
import net.lepidodendron.entity.model.entity.ModelMaclurina;
import net.lepidodendron.entity.model.entity.ModelSpiniplatyceras;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderSpiniplatyceras extends RenderLiving<EntityPrehistoricFloraSpiniplatyceras> {
    private static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/spiniplatyceras.png");

    public RenderSpiniplatyceras(RenderManager mgr) {
        super(mgr, new ModelSpiniplatyceras(), 0.0f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraSpiniplatyceras entity) {
        return RenderSpiniplatyceras.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraSpiniplatyceras entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

}