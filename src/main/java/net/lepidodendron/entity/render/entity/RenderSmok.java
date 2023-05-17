package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraSmok;
import net.lepidodendron.entity.model.entity.ModelSmok;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderSmok extends RenderLiving<EntityPrehistoricFloraSmok> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/smok.png");

    public RenderSmok(RenderManager mgr) {
        super(mgr, new ModelSmok(), 0.6f);
    }

    public static float getScaler() {
        return 0.8F * 0.75F;
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraSmok entity) {
        return RenderSmok.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraSmok entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

    @Override
    protected void preRenderCallback(EntityPrehistoricFloraSmok entity, float f) {
        float scale = entity.getAgeScale() * this.getScaler();
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = entity.width * scale * 0.6F;
    }

}