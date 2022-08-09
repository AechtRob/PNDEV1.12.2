package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraUrocordylus;
import net.lepidodendron.entity.model.entity.ModelUrocordylus;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderUrocordylus extends RenderLiving<EntityPrehistoricFloraUrocordylus> {
    private static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/urocordylus.png");

    public RenderUrocordylus(RenderManager mgr) {
        super(mgr, new ModelUrocordylus(), 0.0f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraUrocordylus entity) {
        return RenderUrocordylus.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraUrocordylus entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

}



