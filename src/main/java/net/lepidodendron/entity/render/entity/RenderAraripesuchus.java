package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraAraripesuchus;
import net.lepidodendron.entity.model.entity.ModelAraripesuchus;
import net.lepidodendron.entity.render.RenderLivingBaseWithBook;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderAraripesuchus extends RenderLivingBaseWithBook<EntityPrehistoricFloraAraripesuchus> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/araripesuchus.png");

    public RenderAraripesuchus(RenderManager mgr) {
        super(mgr, new ModelAraripesuchus(), 0.3f);
    }

    public static float getScaler() {
        return 0.39F;
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraAraripesuchus entity) {
        return RenderAraripesuchus.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraAraripesuchus entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

    @Override
    protected void preRenderCallback(EntityPrehistoricFloraAraripesuchus entity, float f) {
        float scale = entity.getAgeScale() * this.getScaler();
        if (scale < 0.1f) {scale = 0.1f;}
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = entity.width * scale * 0.35F;
    }

}