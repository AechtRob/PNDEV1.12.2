package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraCretapantodon;
import net.lepidodendron.entity.model.entity.ModelCretapantodon;
import net.lepidodendron.entity.render.RenderLivingBaseWithBook;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderCretapantodon extends RenderLivingBaseWithBook<EntityPrehistoricFloraCretapantodon> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/cretapantodon.png");

    public RenderCretapantodon(RenderManager mgr) {
        super(mgr, new ModelCretapantodon(), 0.0f);
    }

    public static float getScaler() {return 0.23F; }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraCretapantodon entity) {
        return RenderCretapantodon.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraCretapantodon entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

    @Override
    protected void preRenderCallback(EntityPrehistoricFloraCretapantodon entity, float f) {
        float scale = this.getScaler();
        if (scale < 0.1f) {scale = 0.1f;}
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = entity.width * scale * 0.0F;
    }

}





