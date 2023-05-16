package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraAlbertonia;
import net.lepidodendron.entity.model.entity.ModelAlbertonia;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderAlbertonia extends RenderLiving<EntityPrehistoricFloraAlbertonia> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/albertonia.png");
    public static final ModelBase MODEL_BASE = new ModelAlbertonia();

    public RenderAlbertonia(RenderManager mgr) {
        super(mgr, MODEL_BASE, 0.0f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraAlbertonia entity) {
        return RenderAlbertonia.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraAlbertonia entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

}