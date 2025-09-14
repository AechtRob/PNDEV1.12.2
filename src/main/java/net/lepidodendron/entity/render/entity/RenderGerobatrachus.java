package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraGerobatrachus;
import net.lepidodendron.entity.model.entity.ModelGerobatrachus;
import net.lepidodendron.entity.render.RenderLivingBaseWithBook;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderGerobatrachus extends RenderLivingBaseWithBook<EntityPrehistoricFloraGerobatrachus> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/gerobatrachus.png");

    public RenderGerobatrachus(RenderManager mgr) {
        super(mgr, new ModelGerobatrachus(), 0.25F);
    }

    public static float getScaler() {
        return 0.22f;
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraGerobatrachus entity) {
        return RenderGerobatrachus.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraGerobatrachus entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

    @Override
    protected void preRenderCallback(EntityPrehistoricFloraGerobatrachus entity, float f) {
        float scale = entity.getAgeScale() * this.getScaler();
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = entity.width * scale * 0.2F;
    }

}