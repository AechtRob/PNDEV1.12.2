package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraSclerocormus;
import net.lepidodendron.entity.model.entity.ModelSclerocormus;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderSclerocormus extends RenderLiving<EntityPrehistoricFloraSclerocormus> {
    private static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/sclerocormus.png");

    public RenderSclerocormus(RenderManager mgr) {
        super(mgr, new ModelSclerocormus(), 0.0f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraSclerocormus entity) {
        return RenderSclerocormus.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraSclerocormus entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

}



























































