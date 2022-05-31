package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraPlatysomus;
import net.lepidodendron.entity.model.entity.ModelPlatysomus;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderPlatysomus extends RenderLiving<EntityPrehistoricFloraPlatysomus> {
    private static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/platysomus.png");

    public RenderPlatysomus(RenderManager mgr) {
        super(mgr, new ModelPlatysomus(), 0.0f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraPlatysomus entity) {
        return RenderPlatysomus.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraPlatysomus entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

}