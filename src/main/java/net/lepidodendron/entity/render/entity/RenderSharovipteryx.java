package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraSharovipteryx;
import net.lepidodendron.entity.model.entity.ModelSharovipteryx;
import net.lepidodendron.entity.render.RenderLivingBaseWithBook;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderSharovipteryx extends RenderLivingBaseWithBook<EntityPrehistoricFloraSharovipteryx> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/sharovipteryx.png");

    public RenderSharovipteryx(RenderManager mgr) {
        super(mgr, new ModelSharovipteryx(), 0.0f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraSharovipteryx entity) {
        return RenderSharovipteryx.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraSharovipteryx entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

}

