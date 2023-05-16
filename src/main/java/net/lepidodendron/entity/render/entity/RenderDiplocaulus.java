package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraDiplocaulus;
import net.lepidodendron.entity.model.entity.ModelDiplocaulus;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderDiplocaulus extends RenderLiving<EntityPrehistoricFloraDiplocaulus> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/diplocaulus.png");
    public static final ModelBase MODEL_BASE = new ModelDiplocaulus();

    public static float getScaler() {
        return 0.385F;
    }
    public RenderDiplocaulus(RenderManager mgr) {
        super(mgr, MODEL_BASE, 0.1f);
    }


    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraDiplocaulus entity) {
        return RenderDiplocaulus.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraDiplocaulus entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

    @Override
    protected void preRenderCallback(EntityPrehistoricFloraDiplocaulus entity, float f) {
        float scale = entity.getAgeScale()*this.getScaler();
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = entity.width * scale * 0.35F;
    }

}