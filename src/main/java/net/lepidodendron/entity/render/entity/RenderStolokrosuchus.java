package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraStolokrosuchus;
import net.lepidodendron.entity.model.entity.ModelStolokrosuchus;
import net.lepidodendron.entity.render.RenderLivingBaseWithBook;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderStolokrosuchus extends RenderLivingBaseWithBook<EntityPrehistoricFloraStolokrosuchus> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/stolokrosuchus.png");

    public RenderStolokrosuchus(RenderManager mgr) {
        super(mgr, new ModelStolokrosuchus(), 0.3f);
    }

    public static float getScaler() {
        return 0.58F;
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraStolokrosuchus entity) {
        return RenderStolokrosuchus.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraStolokrosuchus entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

    @Override
    protected void preRenderCallback(EntityPrehistoricFloraStolokrosuchus entity, float f) {
        float scale = entity.getAgeScale() * this.getScaler();
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = entity.width * scale * 0.80F;
    }

}