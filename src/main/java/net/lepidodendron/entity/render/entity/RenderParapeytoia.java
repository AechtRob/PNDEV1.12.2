package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraParapeytoia;
import net.lepidodendron.entity.model.entity.ModelParapeytoia;
import net.lepidodendron.entity.render.RenderLivingBaseWithBook;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderParapeytoia extends RenderLivingBaseWithBook<EntityPrehistoricFloraParapeytoia> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/parapeytoia.png");

    public RenderParapeytoia(RenderManager mgr) {
        super(mgr, new ModelParapeytoia(), 0.0f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraParapeytoia entity) {
        return RenderParapeytoia.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraParapeytoia entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

}