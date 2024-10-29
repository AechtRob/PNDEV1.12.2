package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraSinamia;
import net.lepidodendron.entity.model.entity.ModelSinamia;
import net.lepidodendron.entity.render.RenderLivingBaseWithBook;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderSinamia extends RenderLivingBaseWithBook<EntityPrehistoricFloraSinamia> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/sinamia.png");

    public RenderSinamia(RenderManager mgr) {
        super(mgr, new ModelSinamia(), 0.0f);
    }

    public static float getScaler() {return 0.38F; }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraSinamia entity) {
        return RenderSinamia.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraSinamia entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

    protected void preRenderCallback(EntityPrehistoricFloraSinamia entity, float f) {
        float scale = this.getScaler();
        if (scale < 0.1f) {
            scale = 0.1f;
        }
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = 0;
    }

}