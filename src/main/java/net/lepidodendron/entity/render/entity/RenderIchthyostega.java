package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraIchthyostega;
import net.lepidodendron.entity.model.entity.ModelIchthyostega;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderIchthyostega extends RenderLiving<EntityPrehistoricFloraIchthyostega> {
    private static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/ichthyostega.png");

    public RenderIchthyostega(RenderManager mgr) {
        super(mgr, new ModelIchthyostega(), 0.4f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraIchthyostega entity) {
        return RenderIchthyostega.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraIchthyostega entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

    @Override
    protected void preRenderCallback(EntityPrehistoricFloraIchthyostega entity, float f) {
        float scale = entity.getAgeScale();
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = entity.width * scale * 0.45F;
    }

}