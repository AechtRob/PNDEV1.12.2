package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraVidalamia;
import net.lepidodendron.entity.model.entity.ModelVidalamia;
import net.lepidodendron.entity.render.RenderLivingBaseWithBook;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderVidalamia extends RenderLivingBaseWithBook<EntityPrehistoricFloraVidalamia> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/vidalamia.png");

    public RenderVidalamia(RenderManager mgr) {
        super(mgr, new ModelVidalamia(), 0.0f);
    }

    public static float getScaler() {return 0.33F; }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraVidalamia entity) {
        return RenderVidalamia.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraVidalamia entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

    protected void preRenderCallback(EntityPrehistoricFloraVidalamia entity, float f) {
        float scale = this.getScaler();
        if (scale < 0.1f) {
            scale = 0.1f;
        }
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = 0;
    }

}