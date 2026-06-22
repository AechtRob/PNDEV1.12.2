package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraBumastus;
import net.lepidodendron.entity.model.entity.ModelBumastus;
import net.lepidodendron.entity.render.RenderLivingBaseWithBook;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderBumastus extends RenderLivingBaseWithBook<EntityPrehistoricFloraBumastus> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/bumastus.png");
    public static float getScaler() {
        return 0.15F;
    }

    public RenderBumastus(RenderManager mgr) {
        super(mgr, new ModelBumastus(), 0.0f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraBumastus entity) {
        return RenderBumastus.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraBumastus entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

}