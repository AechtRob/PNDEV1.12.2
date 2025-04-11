package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraProscinetes;
import net.lepidodendron.entity.model.entity.ModelProscinetes;
import net.lepidodendron.entity.render.RenderLivingBaseWithBook;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderProscinetes extends RenderLivingBaseWithBook<EntityPrehistoricFloraProscinetes> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/proscinetes.png");

    public RenderProscinetes(RenderManager mgr) {
        super(mgr, new ModelProscinetes(), 0.0f);
    }

    public static float getScaler() {return 0.13F; }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraProscinetes entity) {
        return RenderProscinetes.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraProscinetes entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

    @Override
    protected void preRenderCallback(EntityPrehistoricFloraProscinetes entity, float f) {
        float scale = this.getScaler();
        if (scale < 0.1f) {scale = 0.1f;}
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = entity.width * scale * 0.0F;
    }

}





