package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraHypsilophodon;
import net.lepidodendron.entity.model.entity.ModelHypsilophodon;
import net.lepidodendron.entity.render.RenderLivingBaseWithBook;
import net.lepidodendron.entity.render.tile.RenderDisplays;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderHypsilophodon extends RenderLivingBaseWithBook<EntityPrehistoricFloraHypsilophodon> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/hypsilophodon.png");

    public RenderHypsilophodon(RenderManager mgr) {
        super(mgr, new ModelHypsilophodon(),0.3f);
    }

    public static float getScaler() {
        return 0.6101F;
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraHypsilophodon entity) {
        return RenderHypsilophodon.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraHypsilophodon entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

    @Override
    protected void preRenderCallback(EntityPrehistoricFloraHypsilophodon entity, float f) {
        float scale = entity.getAgeScale() * this.getScaler();
        if (scale < 0.1f) {scale = 0.1f;}
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = entity.width * scale * 0.35F;
    }

}