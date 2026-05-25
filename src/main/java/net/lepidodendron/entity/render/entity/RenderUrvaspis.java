package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraUrvaspis;
import net.lepidodendron.entity.model.entity.ModelUrvaspis;
import net.lepidodendron.entity.render.RenderLivingBaseWithBook;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderUrvaspis extends RenderLivingBaseWithBook<EntityPrehistoricFloraUrvaspis> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/urvaspis.png");

    public static float getScaler() {
        return 0.35F;
    }
    public RenderUrvaspis(RenderManager mgr) {
        super(mgr, new ModelUrvaspis(), 0.0f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraUrvaspis entity) {
        return RenderUrvaspis.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraUrvaspis entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }
    @Override
    protected void preRenderCallback(EntityPrehistoricFloraUrvaspis entity, float f) {
        float scale = this.getScaler()*entity.getAgeScale();
        if (scale < 0.1f) {
            scale = 0.1f;
        }
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = 0;
    }

}