package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraFukuititan;
import net.lepidodendron.entity.model.entity.ModelFukuititan;
import net.lepidodendron.entity.render.RenderLivingBaseWithBook;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderFukuititan extends RenderLivingBaseWithBook<EntityPrehistoricFloraFukuititan> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/fukuititan.png");

    public RenderFukuititan(RenderManager mgr) {
        super(mgr, new ModelFukuititan(), 0.2f);
    }

    public static float getScaler() {
        return 1.0F;
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraFukuititan entity) {
        return RenderFukuititan.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraFukuititan entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

    @Override
    protected void preRenderCallback(EntityPrehistoricFloraFukuititan entity, float f) {
        float scale = entity.getAgeScale() * this.getScaler();
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = entity.width * scale * 0.40F;
    }

}