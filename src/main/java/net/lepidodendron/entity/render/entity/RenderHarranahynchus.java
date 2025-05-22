package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraHarranahynchus;
import net.lepidodendron.entity.model.entity.ModelHarranahynchus;
import net.lepidodendron.entity.render.RenderLivingBaseWithBook;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderHarranahynchus extends RenderLivingBaseWithBook<EntityPrehistoricFloraHarranahynchus> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/harranahynchus.png");

    public static float getScaler() {
        return 0.8F * 0.37F;
    }
    public RenderHarranahynchus(RenderManager mgr) {
        super(mgr, new ModelHarranahynchus(), 0.0f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraHarranahynchus entity) {
        return RenderHarranahynchus.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraHarranahynchus entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }
    @Override
    protected void preRenderCallback(EntityPrehistoricFloraHarranahynchus entity, float f) {
        float scale = this.getScaler()*entity.getAgeScale();

        if (scale < 0.1f) {
            scale = 0.1f;
        }
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = 0;
    }

}