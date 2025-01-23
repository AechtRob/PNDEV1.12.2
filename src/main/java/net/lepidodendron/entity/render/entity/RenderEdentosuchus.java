package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraEdentosuchus;
import net.lepidodendron.entity.model.entity.ModelEdentosuchus;
import net.lepidodendron.entity.render.RenderLivingBaseWithBook;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderEdentosuchus extends RenderLivingBaseWithBook<EntityPrehistoricFloraEdentosuchus> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/edentosuchus.png");

    public RenderEdentosuchus(RenderManager mgr) {
        super(mgr, new ModelEdentosuchus(),  0.3f);
    }

    public static float getScaler() {
        return 0.25F;
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraEdentosuchus entity) {
        return RenderEdentosuchus.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraEdentosuchus entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

    @Override
    protected void preRenderCallback(EntityPrehistoricFloraEdentosuchus entity, float f) {
        float scale = entity.getAgeScale() * this.getScaler();
        if (scale < 0.1f) {scale = 0.1f;}
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = entity.width * scale * 0.35F;
    }

}