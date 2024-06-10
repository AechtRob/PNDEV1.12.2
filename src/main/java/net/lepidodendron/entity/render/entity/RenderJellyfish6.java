package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraJellyfish6;
import net.lepidodendron.entity.model.entity.ModelJellyfish;
import net.lepidodendron.entity.render.RenderLivingBaseWithBook;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderJellyfish6 extends RenderLivingBaseWithBook<EntityPrehistoricFloraJellyfish6> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/jellyfish_6.png");

    public RenderJellyfish6(RenderManager mgr) {
        super(mgr, new ModelJellyfish(), 0.0f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraJellyfish6 entity) {
        return RenderJellyfish6.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraJellyfish6 entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

    @Override
    protected void preRenderCallback(EntityPrehistoricFloraJellyfish6 entity, float f) {
        float scale = 2F;
        GlStateManager.scale(scale, scale, scale);
    }

}