package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraElrathia;
import net.lepidodendron.entity.model.entity.ModelElrathia;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderElrathia extends RenderLiving<EntityPrehistoricFloraElrathia> {
    private static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/elrathia.png");

    public RenderElrathia(RenderManager mgr) {
        super(mgr, new ModelElrathia(), 0.0f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraElrathia entity) {
        return RenderElrathia.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraElrathia entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

}