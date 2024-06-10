package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraTetraceratops;
import net.lepidodendron.entity.model.entity.ModelTetraceratops;
import net.lepidodendron.entity.render.RenderLivingBaseWithBook;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderTetraceratops extends RenderLivingBaseWithBook<EntityPrehistoricFloraTetraceratops> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/tetraceratops.png");

    public static float getScaler() {return 0.30F;}

    public RenderTetraceratops(RenderManager mgr) {
        super(mgr, new ModelTetraceratops(), 0.325f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraTetraceratops entity) {
        return RenderTetraceratops.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraTetraceratops entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

    @Override
    protected void preRenderCallback(EntityPrehistoricFloraTetraceratops entity, float f) {
        float scale = entity.getAgeScale()*getScaler();
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = entity.width * scale * 0.325F;
    }

}