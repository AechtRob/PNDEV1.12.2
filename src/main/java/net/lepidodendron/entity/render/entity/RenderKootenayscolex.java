package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraKootenayscolex;
import net.lepidodendron.entity.model.entity.ModelKootenayscolex;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderKootenayscolex extends RenderLiving<EntityPrehistoricFloraKootenayscolex> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/kootenayscolex.png");

    public static float getScaler() {
        return 0.4F*0.75f;
    }

    public RenderKootenayscolex(RenderManager mgr) {
        super(mgr, new ModelKootenayscolex(), 0.0f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraKootenayscolex entity) {
        return RenderKootenayscolex.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraKootenayscolex entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

    @Override
    protected void preRenderCallback(EntityPrehistoricFloraKootenayscolex entity, float f) {
        float scale = this.getScaler()*getScaler();
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = entity.width * scale * 0.38F;
    }

}