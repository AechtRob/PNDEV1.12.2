package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraSpinoaequalis;
import net.lepidodendron.entity.model.entity.ModelSpinoaequalis;
import net.lepidodendron.entity.render.RenderLivingBaseWithBook;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderSpinoaequalis extends RenderLivingBaseWithBook<EntityPrehistoricFloraSpinoaequalis> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/spinoaequalis.png");

    public RenderSpinoaequalis(RenderManager mgr) {
        super(mgr, new ModelSpinoaequalis(), 0.0f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraSpinoaequalis entity) {
        return RenderSpinoaequalis.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraSpinoaequalis entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

}