package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraJuramantophasma;
import net.lepidodendron.entity.model.entity.ModelJuramantophasma;
import net.lepidodendron.entity.render.RenderLivingBaseWithBook;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderJuramantophasma extends RenderLivingBaseWithBook<EntityPrehistoricFloraJuramantophasma> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/juramantophasma.png");

    public static float getScaler() { return 0.28f * (0.66f); }

    public RenderJuramantophasma(RenderManager mgr) {
        super(mgr, new ModelJuramantophasma(), 0.0f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraJuramantophasma entity) {
        float scale = entity.getAgeScale();
        return RenderJuramantophasma.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraJuramantophasma entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

    @Override
    protected void preRenderCallback(EntityPrehistoricFloraJuramantophasma entity, float f) {
        float scale = entity.getAgeScale() * this.getScaler();
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = entity.width * scale * 0.0F;
    }

}

