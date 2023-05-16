package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraTriadobatrachus;
import net.lepidodendron.entity.model.entity.ModelTriadobatrachus;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderTriadobatrachus extends RenderLiving<EntityPrehistoricFloraTriadobatrachus> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/triadobatrachus.png");
    public static final ModelBase MODEL_BASE = new ModelTriadobatrachus();

    public RenderTriadobatrachus(RenderManager mgr) {
        super(mgr, MODEL_BASE, 0.0f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraTriadobatrachus entity) {
        return RenderTriadobatrachus.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraTriadobatrachus entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

}





