package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraExocoetoides;
import net.lepidodendron.entity.model.entity.ModelExocoetoides;
import net.lepidodendron.entity.render.RenderLivingBaseWithBook;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderExocoetoides extends RenderLivingBaseWithBook<EntityPrehistoricFloraExocoetoides> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/exocoetoides.png");

    public RenderExocoetoides(RenderManager mgr) {
        super(mgr, new ModelExocoetoides(), 0.0f);
    }

    public static float getScaler() {return 0.2F; }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraExocoetoides entity) {
        return RenderExocoetoides.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraExocoetoides entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

    @Override
    protected void preRenderCallback(EntityPrehistoricFloraExocoetoides entity, float f) {
        float scale = this.getScaler();
        if (scale < 0.1f) {scale = 0.1f;}
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = entity.width * scale * 0.0F;
    }

}





