package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraVachonisia;
import net.lepidodendron.entity.EntityPrehistoricFloraVarialepis;
import net.lepidodendron.entity.model.entity.ModelVarialepis;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderVarialepis extends RenderLiving<EntityPrehistoricFloraVarialepis> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/varialepis.png");

    public static float getScaler() {
        return 0.7F * 0.35F;
    }
    public RenderVarialepis(RenderManager mgr) {
        super(mgr, new ModelVarialepis(), 0.0f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraVarialepis entity) {
        return RenderVarialepis.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraVarialepis entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

    @Override
    protected void preRenderCallback(EntityPrehistoricFloraVarialepis entity, float f) {
        float scale = this.getScaler();
        if (scale < 0.1f) {
            scale = 0.1f;
        }
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = 0;
    }

}