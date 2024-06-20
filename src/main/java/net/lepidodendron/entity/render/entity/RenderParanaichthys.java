package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraParanaichthys;
import net.lepidodendron.entity.model.entity.ModelParanaichthys;
import net.lepidodendron.entity.render.RenderLivingBaseWithBook;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderParanaichthys extends RenderLivingBaseWithBook<EntityPrehistoricFloraParanaichthys> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/paranaichthys.png");
    public static float getScaler() {
        return 0.23F;
    }

    public RenderParanaichthys(RenderManager mgr) {
        super(mgr, new ModelParanaichthys(), 0.0f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraParanaichthys entity) {
        return RenderParanaichthys.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraParanaichthys entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

}