package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraGymnotrachelus;
import net.lepidodendron.entity.model.entity.ModelGymnotrachelus;
import net.lepidodendron.entity.render.RenderLivingBaseWithBook;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderGymnotrachelus extends RenderLivingBaseWithBook<EntityPrehistoricFloraGymnotrachelus> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/gymnotrachelus.png");

    public static float getScaler() {
        return 0.35F;
    }
    public RenderGymnotrachelus(RenderManager mgr) {
        super(mgr, new ModelGymnotrachelus(), 0.0f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraGymnotrachelus entity) {
        return RenderGymnotrachelus.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraGymnotrachelus entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }
    @Override
    protected void preRenderCallback(EntityPrehistoricFloraGymnotrachelus entity, float f) {
        float scale = this.getScaler()*entity.getAgeScale();
        if (scale < 0.1f) {
            scale = 0.1f;
        }
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = 0;
    }

}