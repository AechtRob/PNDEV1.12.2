package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraLaganosuchus;
import net.lepidodendron.entity.model.entity.ModelLaganosuchus;
import net.lepidodendron.entity.render.RenderLivingBaseWithBook;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderLaganosuchus extends RenderLivingBaseWithBook<EntityPrehistoricFloraLaganosuchus> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/laganosuchus.png");

    public static float getScaler() {
        return 1F;
    }
    public RenderLaganosuchus(RenderManager mgr) {
        super(mgr, new ModelLaganosuchus(), 0.0f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraLaganosuchus entity) {
        return RenderLaganosuchus.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraLaganosuchus entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }
    @Override
    protected void preRenderCallback(EntityPrehistoricFloraLaganosuchus entity, float f) {
        float scale = this.getScaler()*entity.getAgeScale();
        if (scale < 0.1f) {
            scale = 0.1f;
        }
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = 0;
    }

}