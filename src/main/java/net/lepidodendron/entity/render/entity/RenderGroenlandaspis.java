package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraGroenlandaspis;
import net.lepidodendron.entity.model.entity.ModelGroenlandaspis;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderGroenlandaspis extends RenderLiving<EntityPrehistoricFloraGroenlandaspis> {
    private static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/groenlandaspis.png");

    public RenderGroenlandaspis(RenderManager mgr) {
        super(mgr, new ModelGroenlandaspis(), 0.4f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraGroenlandaspis entity) {
        return RenderGroenlandaspis.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraGroenlandaspis entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

}