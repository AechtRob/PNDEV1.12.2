package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraWuttagoonaspis;
import net.lepidodendron.entity.model.entity.ModelWuttagoonaspis;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderWuttagoonaspis extends RenderLiving<EntityPrehistoricFloraWuttagoonaspis> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/wuttagoonaspis.png");
    public static final ModelBase MODEL_BASE = new ModelWuttagoonaspis();

    public static float getScaler() {
        return 0.95F * 0.4F;
    }
    public RenderWuttagoonaspis(RenderManager mgr) {
        super(mgr, MODEL_BASE, 0.0f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraWuttagoonaspis entity) {
        return RenderWuttagoonaspis.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraWuttagoonaspis entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }
    @Override
    protected void preRenderCallback(EntityPrehistoricFloraWuttagoonaspis entity, float f) {
        float scale = this.getScaler()*entity.getAgeScale();
        if (scale < 0.1f) {
            scale = 0.1f;
        }
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = 0;
    }

}