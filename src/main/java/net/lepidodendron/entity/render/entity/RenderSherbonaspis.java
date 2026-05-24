package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraSherbonaspis;
import net.lepidodendron.entity.model.entity.ModelSherbonaspis;
import net.lepidodendron.entity.render.RenderLivingBaseWithBook;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderSherbonaspis extends RenderLivingBaseWithBook<EntityPrehistoricFloraSherbonaspis> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/sherbonaspis.png");

    public static float getScaler() {
        return 0.24F;
    }
    public RenderSherbonaspis(RenderManager mgr) {
        super(mgr, new ModelSherbonaspis(), 0.0f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraSherbonaspis entity) {
        return RenderSherbonaspis.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraSherbonaspis entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }
    @Override
    protected void preRenderCallback(EntityPrehistoricFloraSherbonaspis entity, float f) {
        float scale = this.getScaler()*entity.getAgeScale();
        if (scale < 0.1f) {
            scale = 0.1f;
        }
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = 0;
    }

}