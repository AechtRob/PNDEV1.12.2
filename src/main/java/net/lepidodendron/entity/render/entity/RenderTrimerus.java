package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraTrimerus;
import net.lepidodendron.entity.model.entity.ModelTrimerus;
import net.lepidodendron.entity.render.RenderLivingBaseWithBook;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderTrimerus extends RenderLivingBaseWithBook<EntityPrehistoricFloraTrimerus> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/trimerus.png");
    public static float getScaler() {
        return 0.7F * 0.2F;
    }
    public RenderTrimerus(RenderManager mgr) {
        super(mgr, new ModelTrimerus(), 0.0f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraTrimerus entity) {
        return RenderTrimerus.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraTrimerus entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

}