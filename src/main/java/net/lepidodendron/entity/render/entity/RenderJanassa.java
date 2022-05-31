package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraJanassa;
import net.lepidodendron.entity.model.entity.ModelJanassa;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderJanassa extends RenderLiving<EntityPrehistoricFloraJanassa> {
    private static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/janassa.png");

    public RenderJanassa(RenderManager mgr) {
        super(mgr, new ModelJanassa(), 0.0f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraJanassa entity) {
        return RenderJanassa.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraJanassa entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

}