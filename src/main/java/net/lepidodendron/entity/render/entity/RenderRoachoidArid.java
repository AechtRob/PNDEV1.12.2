package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraRoachoidAridInsect;
import net.lepidodendron.entity.model.entity.ModelRoachoid;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderRoachoidArid extends RenderLiving<EntityPrehistoricFloraRoachoidAridInsect> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/roachoid_arid.png");
    public static final ModelBase MODEL_BASE = new ModelRoachoid();

    public RenderRoachoidArid(RenderManager mgr) {
        super(mgr, MODEL_BASE, 0.0f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraRoachoidAridInsect entity) {
        return RenderRoachoidArid.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraRoachoidAridInsect entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

}