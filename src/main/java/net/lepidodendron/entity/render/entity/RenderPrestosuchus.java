package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraPrestosuchus;
import net.lepidodendron.entity.model.entity.ModelPrestosuchus;
import net.lepidodendron.entity.render.RenderLivingBaseWithBook;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderPrestosuchus extends RenderLivingBaseWithBook<EntityPrehistoricFloraPrestosuchus> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/prestosuchus.png");

    public RenderPrestosuchus(RenderManager mgr) {
        super(mgr, new ModelPrestosuchus(), 0.5f);
    }
    public static float getScaler() {return 0.65f; }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraPrestosuchus entity) {
        float scale = entity.getAgeScale();
        return RenderPrestosuchus.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraPrestosuchus entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

    @Override
    protected void preRenderCallback(EntityPrehistoricFloraPrestosuchus entity, float f) {
        float scale = entity.getAgeScale() * this.getScaler();
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = entity.width * scale * 0.50F;
    }

}