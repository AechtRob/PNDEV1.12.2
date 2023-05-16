package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraKimberella;
import net.lepidodendron.entity.model.entity.ModelKimberella;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderKimberella extends RenderLiving<EntityPrehistoricFloraKimberella> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/Kimberella.png");
    public static final ModelBase MODEL_BASE = new ModelKimberella();

    public RenderKimberella(RenderManager mgr) {
        super(mgr, MODEL_BASE, 0.0f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraKimberella entity) {
        return RenderKimberella.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraKimberella entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

}