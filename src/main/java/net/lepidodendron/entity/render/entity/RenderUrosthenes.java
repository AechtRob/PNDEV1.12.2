package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraUrosthenes;
import net.lepidodendron.entity.model.entity.ModelUrosthenes;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderUrosthenes extends RenderLiving<EntityPrehistoricFloraUrosthenes> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/urosthenes.png");
    public static final ModelBase MODEL_BASE = new ModelUrosthenes();

    public RenderUrosthenes(RenderManager mgr) {
        super(mgr, MODEL_BASE, 0.0f);
    }
    public static float getScaler() {
        return 0.2F;
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraUrosthenes entity) {
        return RenderUrosthenes.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraUrosthenes entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

    @Override
    protected void preRenderCallback(EntityPrehistoricFloraUrosthenes entity, float f) {
        float scale = this.getScaler();
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = entity.width * scale * 0.40F;
    }
}