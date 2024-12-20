package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraKoolasuchus;
import net.lepidodendron.entity.model.entity.ModelKoolasuchus;
import net.lepidodendron.entity.render.RenderLivingBaseWithBook;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderKoolasuchus extends RenderLivingBaseWithBook<EntityPrehistoricFloraKoolasuchus> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/koolasuchus.png");

    public RenderKoolasuchus(RenderManager mgr) {
        super(mgr, new ModelKoolasuchus(), 0.4f);
    }
    public static float getScaler() {
        return 1f;
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraKoolasuchus entity) {
        return RenderKoolasuchus.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraKoolasuchus entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

    @Override
    protected void preRenderCallback(EntityPrehistoricFloraKoolasuchus entity, float f) {
        float scale = entity.getAgeScale() * this.getScaler();
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = entity.width * scale * 0.275F;
    }

}