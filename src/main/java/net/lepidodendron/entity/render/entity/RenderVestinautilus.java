package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraVestinautilus;
import net.lepidodendron.entity.model.entity.ModelVestinautilus;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderVestinautilus extends RenderLiving<EntityPrehistoricFloraVestinautilus> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/vestinautilus.png");
    public static final ModelBase MODEL_BASE = new ModelVestinautilus();

    public RenderVestinautilus(RenderManager mgr) {
        super(mgr, MODEL_BASE, 0.1f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraVestinautilus entity) {
        return RenderVestinautilus.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraVestinautilus entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

}