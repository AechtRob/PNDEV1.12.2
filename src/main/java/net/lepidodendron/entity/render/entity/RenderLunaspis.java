package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraLunaspis;
import net.lepidodendron.entity.model.entity.ModelLunaspis;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderLunaspis extends RenderLiving<EntityPrehistoricFloraLunaspis> {
    private static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/lunaspis.png");

    public RenderLunaspis(RenderManager mgr) {
        super(mgr, new ModelLunaspis(), 0.3f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraLunaspis entity) {
        return RenderLunaspis.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraLunaspis entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

}