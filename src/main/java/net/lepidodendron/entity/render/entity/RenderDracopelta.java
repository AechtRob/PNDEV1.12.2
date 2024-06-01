package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraDracopelta;
import net.lepidodendron.entity.model.entity.ModelDracopelta;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderDracopelta extends RenderLiving<EntityPrehistoricFloraDracopelta> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/dracopelta.png");

    public RenderDracopelta(RenderManager mgr) {
        super(mgr, new ModelDracopelta(), 0.3f);
    }

    public static float getScaler() {
        return 0.69F;
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraDracopelta entity) {
        return RenderDracopelta.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraDracopelta entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

    @Override
    protected void preRenderCallback(EntityPrehistoricFloraDracopelta entity, float f) {
        float scale = entity.getAgeScale() * this.getScaler();
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = entity.width * scale * 0.6F;
    }

}