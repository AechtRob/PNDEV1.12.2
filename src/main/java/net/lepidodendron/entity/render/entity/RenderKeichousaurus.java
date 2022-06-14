package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraKeichousaurus;
import net.lepidodendron.entity.model.entity.ModelKeichousaurus;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderKeichousaurus extends RenderLiving<EntityPrehistoricFloraKeichousaurus> {
    private static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/keichousaurus.png");

    public RenderKeichousaurus(RenderManager mgr) {
        super(mgr, new ModelKeichousaurus(), 0.0f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraKeichousaurus entity) {
        return RenderKeichousaurus.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraKeichousaurus entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

}
































































