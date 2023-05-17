package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraClydagnathus;
import net.lepidodendron.entity.model.entity.ModelClydagnathus;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderClydagnathus extends RenderLiving<EntityPrehistoricFloraClydagnathus> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/clydagnathus.png");

    public RenderClydagnathus(RenderManager mgr) {
        super(mgr, new ModelClydagnathus(), 0.0f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraClydagnathus entity) {
        return RenderClydagnathus.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraClydagnathus entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

}