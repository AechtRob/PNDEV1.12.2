package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraPomatrum;
import net.lepidodendron.entity.model.entity.ModelPomatrum;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderPomatrum extends RenderLiving<EntityPrehistoricFloraPomatrum> {
    private static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/pomatrum.png");

    public RenderPomatrum(RenderManager mgr) {
        super(mgr, new ModelPomatrum(), 0.0f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraPomatrum entity) {
        return RenderPomatrum.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraPomatrum entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

}