package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraPoraspis;
import net.lepidodendron.entity.model.entity.ModelPoraspis;
import net.lepidodendron.entity.render.RenderLivingBaseWithBook;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderPoraspis extends RenderLivingBaseWithBook<EntityPrehistoricFloraPoraspis> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/poraspis.png");
    public static float getScaler() {
        return 0.7F * 0.39F;
    }
    public RenderPoraspis(RenderManager mgr) {
        super(mgr, new ModelPoraspis(), 0.0f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraPoraspis entity) {
        return RenderPoraspis.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraPoraspis entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

}