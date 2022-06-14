package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraEretomorphis;
import net.lepidodendron.entity.model.entity.ModelEretomorphis;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderEretomorphis extends RenderLiving<EntityPrehistoricFloraEretomorphis> {
    private static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/eretomorphis.png");

    public RenderEretomorphis(RenderManager mgr) {
        super(mgr, new ModelEretomorphis(), 0.0f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraEretomorphis entity) {
        return RenderEretomorphis.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraEretomorphis entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

}



































































