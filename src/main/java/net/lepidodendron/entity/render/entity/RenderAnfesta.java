package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraAnfesta;
import net.lepidodendron.entity.model.entity.ModelAnfesta;
import net.lepidodendron.entity.render.RenderLivingBaseWithBook;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderAnfesta extends RenderLivingBaseWithBook<EntityPrehistoricFloraAnfesta> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/anfesta.png");

    public RenderAnfesta(RenderManager mgr) {
        super(mgr, new ModelAnfesta(), 0.0f);
    }

    public static float getScaler() {
        return 0.22F;
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraAnfesta entity) {
        return RenderAnfesta.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraAnfesta entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

    @Override
    protected void preRenderCallback(EntityPrehistoricFloraAnfesta entity, float f) {
        float scale = this.getScaler();
        GlStateManager.scale(scale, scale, scale);
    }
}