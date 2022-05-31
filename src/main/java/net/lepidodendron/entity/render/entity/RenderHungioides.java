package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraHungioides;
import net.lepidodendron.entity.model.entity.ModelHungioides;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderHungioides extends RenderLiving<EntityPrehistoricFloraHungioides> {
    private static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/hungioides.png");

    public RenderHungioides(RenderManager mgr) {
        super(mgr, new ModelHungioides(), 0.2f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraHungioides entity) {
        return RenderHungioides.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraHungioides entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

}