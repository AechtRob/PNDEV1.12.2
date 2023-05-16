package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraProtorosaurus;
import net.lepidodendron.entity.model.entity.ModelProtorosaurus;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderProtorosaurus extends RenderLiving<EntityPrehistoricFloraProtorosaurus> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/protorosaurus.png");
    public static final ModelBase MODEL_BASE = new ModelProtorosaurus();

    public RenderProtorosaurus(RenderManager mgr) {
        super(mgr, MODEL_BASE, 0.0f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraProtorosaurus entity) {
        return RenderProtorosaurus.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraProtorosaurus entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

}