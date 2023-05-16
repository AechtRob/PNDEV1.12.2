package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraRoachoidSwampInsect;
import net.lepidodendron.entity.model.entity.ModelRoachoid;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderRoachoidSwamp extends RenderLiving<EntityPrehistoricFloraRoachoidSwampInsect> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/roachoid_swamp.png");
    public static final ModelBase MODEL_BASE = new ModelRoachoid();

    public RenderRoachoidSwamp(RenderManager mgr) {
        super(mgr, MODEL_BASE, 0.0f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraRoachoidSwampInsect entity) {
        return RenderRoachoidSwamp.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraRoachoidSwampInsect entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

}