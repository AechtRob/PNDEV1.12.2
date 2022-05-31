package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraPneumodesmus;
import net.lepidodendron.entity.model.entity.ModelPneumodesmus;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderPneumodesmus extends RenderLiving<EntityPrehistoricFloraPneumodesmus> {
    private static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/pneumodesmus.png");

    public RenderPneumodesmus(RenderManager mgr) {
        super(mgr, new ModelPneumodesmus(), 0.0f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraPneumodesmus entity) {
        return RenderPneumodesmus.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraPneumodesmus entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

}