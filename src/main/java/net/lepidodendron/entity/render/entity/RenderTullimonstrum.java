package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraTullimonstrum;
import net.lepidodendron.entity.model.entity.ModelTullimonstrum;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderTullimonstrum extends RenderLiving<EntityPrehistoricFloraTullimonstrum> {
    private static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/tullimonstrum.png");

    public RenderTullimonstrum(RenderManager mgr) {
        super(mgr, new ModelTullimonstrum(), 0.0f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraTullimonstrum entity) {
        return RenderTullimonstrum.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraTullimonstrum entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

}