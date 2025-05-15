package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraSiamamia;
import net.lepidodendron.entity.model.entity.ModelSiamamia;
import net.lepidodendron.entity.render.RenderLivingBaseWithBook;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderSiamamia extends RenderLivingBaseWithBook<EntityPrehistoricFloraSiamamia> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/siamamia.png");

    public static float getScaler() {
        return 0.37F;
    }
    public RenderSiamamia(RenderManager mgr) {
        super(mgr, new ModelSiamamia(), 0.0f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraSiamamia entity) {
        return RenderSiamamia.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraSiamamia entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }
    @Override
    protected void preRenderCallback(EntityPrehistoricFloraSiamamia entity, float f) {
        float scale = this.getScaler();
        if (scale < 0.1f) {
            scale = 0.1f;
        }
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = 0;
    }

}