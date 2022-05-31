package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraEosaurichthys;
import net.lepidodendron.entity.model.entity.ModelSaurichthys;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderEosaurichthys extends RenderLiving<EntityPrehistoricFloraEosaurichthys> {
    private static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/eosaurichthys.png");

    public RenderEosaurichthys(RenderManager mgr) {
        super(mgr, new ModelSaurichthys(), 0.0f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraEosaurichthys entity) {
        return RenderEosaurichthys.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraEosaurichthys entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

}