package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraEuparkeria;
import net.lepidodendron.entity.model.entity.ModelEuparkeria;
import net.lepidodendron.entity.render.RenderLivingBaseWithBook;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderEuparkeria extends RenderLivingBaseWithBook<EntityPrehistoricFloraEuparkeria> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/euparkeria.png");
    public static float getScaler() {
        return 0.235F;
    }

    public RenderEuparkeria(RenderManager mgr) {
        super(mgr, new ModelEuparkeria(), 0.0f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraEuparkeria entity) {
        return RenderEuparkeria.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraEuparkeria entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

    @Override
    protected void preRenderCallback(EntityPrehistoricFloraEuparkeria entity, float f) {
        float scale = entity.getAgeScale() * 1.125F;
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = entity.width * scale * 0.1F;
    }

}