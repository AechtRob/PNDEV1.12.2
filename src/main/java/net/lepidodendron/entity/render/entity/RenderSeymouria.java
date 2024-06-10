package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraSeymouria;
import net.lepidodendron.entity.model.entity.ModelSeymouria;
import net.lepidodendron.entity.render.RenderLivingBaseWithBook;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderSeymouria extends RenderLivingBaseWithBook<EntityPrehistoricFloraSeymouria> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/seymouria.png");

    public RenderSeymouria(RenderManager mgr) {
        super(mgr, new ModelSeymouria(), 0.0f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraSeymouria entity) {
        return RenderSeymouria.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraSeymouria entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

}