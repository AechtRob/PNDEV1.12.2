package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraKhoratamia;
import net.lepidodendron.entity.model.entity.ModelKhoratamia;
import net.lepidodendron.entity.render.RenderLivingBaseWithBook;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderKhoratamia extends RenderLivingBaseWithBook<EntityPrehistoricFloraKhoratamia> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/khoratamia.png");

    public RenderKhoratamia(RenderManager mgr) {
        super(mgr, new ModelKhoratamia(), 0.0f);
    }

    public static float getScaler() {return 0.36F; }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraKhoratamia entity) {
        return RenderKhoratamia.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraKhoratamia entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

    protected void preRenderCallback(EntityPrehistoricFloraKhoratamia entity, float f) {
        float scale = this.getScaler();
        if (scale < 0.1f) {
            scale = 0.1f;
        }
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = 0;
    }

}