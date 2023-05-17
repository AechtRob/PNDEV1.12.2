package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraRhamphodopsis;
import net.lepidodendron.entity.model.entity.ModelRhamphodopsis;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderRhamphodopsis extends RenderLiving<EntityPrehistoricFloraRhamphodopsis> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/rhamphodopsis.png");

    public static float getScaler() {
        return 0.7F * 0.28F;
    }
    public RenderRhamphodopsis(RenderManager mgr) {
        super(mgr, new ModelRhamphodopsis(), 0.0f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraRhamphodopsis entity) {
        return RenderRhamphodopsis.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraRhamphodopsis entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }
    @Override
    protected void preRenderCallback(EntityPrehistoricFloraRhamphodopsis entity, float f) {
        float scale = this.getScaler()*entity.getAgeScale();
        if (entity.getIsFemale()) {
            scale = this.getScaler() *0.75F;
        }
        if (scale < 0.1f) {
            scale = 0.1f;
        }
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = 0;
    }

}