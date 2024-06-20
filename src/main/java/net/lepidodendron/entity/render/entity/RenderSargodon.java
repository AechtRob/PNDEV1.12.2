package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraSargodon;
import net.lepidodendron.entity.model.entity.ModelSargodon;
import net.lepidodendron.entity.render.RenderLivingBaseWithBook;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderSargodon extends RenderLivingBaseWithBook<EntityPrehistoricFloraSargodon> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/sargodon.png");

    public RenderSargodon(RenderManager mgr) {
        super(mgr, new ModelSargodon(), 0.0f);
    }

    public static float getScaler() {return 0.7F; }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraSargodon entity) {
        return RenderSargodon.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraSargodon entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

    @Override
    protected void preRenderCallback(EntityPrehistoricFloraSargodon entity, float f) {
        float scale = this.getScaler();
        if (scale < 0.1f) {scale = 0.1f;}
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = entity.width * scale * 0.0F;
    }

}