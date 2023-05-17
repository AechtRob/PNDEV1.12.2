package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraCaptorhinus;
import net.lepidodendron.entity.model.entity.ModelCaptorhinus;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderCaptorhinus extends RenderLiving<EntityPrehistoricFloraCaptorhinus> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/captorhinus.png");
    private static final ResourceLocation TEXTURE_NOTAIL = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/captorhinus_notail.png");

    public RenderCaptorhinus(RenderManager mgr) {
        super(mgr, new ModelCaptorhinus(), 0.0f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraCaptorhinus entity) {
        if (entity.hasTail()) {
            return RenderCaptorhinus.TEXTURE;
        }
        return RenderCaptorhinus.TEXTURE_NOTAIL;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraCaptorhinus entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

    @Override
    protected void preRenderCallback(EntityPrehistoricFloraCaptorhinus entity, float f) {
        float scale = entity.getAgeScale() * 1.125F;
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = entity.width * scale * 0.1F;
    }

}