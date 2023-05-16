package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraVarialepis;
import net.lepidodendron.entity.model.entity.ModelVarialepis;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderVarialepis extends RenderLiving<EntityPrehistoricFloraVarialepis> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/varialepis.png");
    public static final ModelBase MODEL_BASE = new ModelVarialepis();

    public RenderVarialepis(RenderManager mgr) {
        super(mgr, MODEL_BASE, 0.0f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraVarialepis entity) {
        return RenderVarialepis.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraVarialepis entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

}