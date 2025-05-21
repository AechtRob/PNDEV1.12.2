package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraIguanodon;
import net.lepidodendron.entity.model.entity.ModelIguanodon;
import net.lepidodendron.entity.render.RenderLivingBaseWithBook;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderIguanodon extends RenderLivingBaseWithBook<EntityPrehistoricFloraIguanodon> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/iguanodon.png");

    public RenderIguanodon(RenderManager mgr) {
        super(mgr, new ModelIguanodon(), 0.3f);
    }

    public static float getScaler() {
        return 1F;
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraIguanodon entity) {
        return RenderIguanodon.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraIguanodon entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

    @Override
    protected void preRenderCallback(EntityPrehistoricFloraIguanodon entity, float f) {
        float scale = entity.getAgeScale() * this.getScaler();
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = entity.width * scale * 0.80F;
    }

}