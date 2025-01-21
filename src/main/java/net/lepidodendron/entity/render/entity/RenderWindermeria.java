package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraWindermeria;
import net.lepidodendron.entity.model.entity.ModelWindermeria;
import net.lepidodendron.entity.render.RenderLivingBaseWithBook;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderWindermeria extends RenderLivingBaseWithBook<EntityPrehistoricFloraWindermeria> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/windermeria.png");
    public static float getScaler() {
        return 0.265F;
    }

    public RenderWindermeria(RenderManager mgr) {
        super(mgr, new ModelWindermeria(), 0.0f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraWindermeria entity) {
        return RenderWindermeria.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraWindermeria entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

    protected void preRenderCallback(EntityPrehistoricFloraWindermeria entity, float f) {
        float scale = this.getScaler();
        if (scale < 0.1f) {
            scale = 0.1f;
        }
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = 0;
    }
}