package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraSemionotus;
import net.lepidodendron.entity.model.entity.ModelSemionotus;
import net.lepidodendron.entity.render.RenderLivingBaseWithBook;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderSemionotus extends RenderLivingBaseWithBook<EntityPrehistoricFloraSemionotus> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/semionotus.png");
    public static float getScaler() {
        return 0.5F * 0.385F;
    }
    public RenderSemionotus(RenderManager mgr) {
        super(mgr, new ModelSemionotus(), 0.0f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraSemionotus entity) {
        return RenderSemionotus.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraSemionotus entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

}