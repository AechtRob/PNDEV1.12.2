package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraEdaphosaurus;
import net.lepidodendron.entity.model.entity.ModelEdaphosaurus;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderEdaphosaurus extends RenderLiving<EntityPrehistoricFloraEdaphosaurus> {
    private static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/edaphosaurus.png");

    public RenderEdaphosaurus(RenderManager mgr) {
        super(mgr, new ModelEdaphosaurus(), 0.0f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraEdaphosaurus entity) {
        return RenderEdaphosaurus.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraEdaphosaurus entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

}



























































































