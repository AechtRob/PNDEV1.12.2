package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraSinemys;
import net.lepidodendron.entity.model.entity.ModelSinemys;
import net.lepidodendron.entity.render.RenderLivingBaseWithBook;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderSinemys extends RenderLivingBaseWithBook<EntityPrehistoricFloraSinemys> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/sinemys.png");

    public RenderSinemys(RenderManager mgr) {
        super(mgr, new ModelSinemys(), 0.0f);
    }

    public static float getScaler() {return 0.21f; }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraSinemys entity) {
        return RenderSinemys.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraSinemys entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

    @Override
    protected void preRenderCallback(EntityPrehistoricFloraSinemys entity, float f) {
        float scale = entity.getAgeScale() * this.getScaler();
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = entity.width * scale * 0.3F;
    }

}

