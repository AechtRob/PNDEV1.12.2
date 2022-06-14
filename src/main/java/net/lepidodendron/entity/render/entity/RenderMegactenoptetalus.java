package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraMegactenoptetalus;
import net.lepidodendron.entity.model.entity.ModelMegactenoptetalus;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderMegactenoptetalus extends RenderLiving<EntityPrehistoricFloraMegactenoptetalus> {
    private static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/megactenoptetalus.png");

    public RenderMegactenoptetalus(RenderManager mgr) {
        super(mgr, new ModelMegactenoptetalus(), 0.0f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraMegactenoptetalus entity) {
        return RenderMegactenoptetalus.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraMegactenoptetalus entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

}
























































































