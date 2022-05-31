package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraJellyfish7;
import net.lepidodendron.entity.model.entity.ModelJellyfish;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderJellyfish7 extends RenderLiving<EntityPrehistoricFloraJellyfish7> {
    private static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/jellyfish_7.png");

    public RenderJellyfish7(RenderManager mgr) {
        super(mgr, new ModelJellyfish(), 0.0f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraJellyfish7 entity) {
        return RenderJellyfish7.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraJellyfish7 entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

}