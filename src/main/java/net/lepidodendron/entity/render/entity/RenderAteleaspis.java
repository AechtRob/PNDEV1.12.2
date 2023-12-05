package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraAteleaspis;
import net.lepidodendron.entity.model.entity.ModelAteleaspis;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderAteleaspis extends RenderLiving<EntityPrehistoricFloraAteleaspis> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/ateleaspis.png");

    public RenderAteleaspis(RenderManager mgr) {
        super(mgr, new ModelAteleaspis(), 0.0f);
    }

    public static float getScaler() {return 0.29F; }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraAteleaspis entity) {
        return RenderAteleaspis.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraAteleaspis entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

    protected void preRenderCallback(EntityPrehistoricFloraAteleaspis entity, float f) {
        float scale = this.getScaler();
        if (scale < 0.1f) {
            scale = 0.1f;
        }
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = 0;
    }

}