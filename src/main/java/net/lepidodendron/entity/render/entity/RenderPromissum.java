package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraPromissum;
import net.lepidodendron.entity.model.entity.ModelPromissum;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderPromissum extends RenderLiving<EntityPrehistoricFloraPromissum> {
    private static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/promissum.png");

    public RenderPromissum(RenderManager mgr) {
        super(mgr, new ModelPromissum(), 0.0f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraPromissum entity) {
        return RenderPromissum.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraPromissum entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

}