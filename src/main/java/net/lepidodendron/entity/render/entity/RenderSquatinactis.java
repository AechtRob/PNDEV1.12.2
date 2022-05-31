package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraSquatinactis;
import net.lepidodendron.entity.model.entity.ModelSquatinactis;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderSquatinactis extends RenderLiving<EntityPrehistoricFloraSquatinactis> {
    private static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/squatinactis.png");

    public RenderSquatinactis(RenderManager mgr) {
        super(mgr, new ModelSquatinactis(), 0.0f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraSquatinactis entity) {
        return RenderSquatinactis.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraSquatinactis entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

}