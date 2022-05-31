package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraMaclurina;
import net.lepidodendron.entity.model.entity.ModelMaclurina;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderMaclurina extends RenderLiving<EntityPrehistoricFloraMaclurina> {
    private static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/maclurina.png");

    public RenderMaclurina(RenderManager mgr) {
        super(mgr, new ModelMaclurina(), 0.0f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraMaclurina entity) {
        return RenderMaclurina.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraMaclurina entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

}