package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraLuoxiongichthys;
import net.lepidodendron.entity.model.entity.ModelLuoxiongichthys;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderLuoxiongichthys extends RenderLiving<EntityPrehistoricFloraLuoxiongichthys> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/luoxiongichthys.png");

    public RenderLuoxiongichthys(RenderManager mgr) {
        super(mgr, new ModelLuoxiongichthys(), 0.0f);
    }

    public static float getScaler() {return 0.1F; }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraLuoxiongichthys entity) {
        return RenderLuoxiongichthys.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraLuoxiongichthys entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

    @Override
    protected void preRenderCallback(EntityPrehistoricFloraLuoxiongichthys entity, float f) {
        float scale = this.getScaler();
        if (scale < 0.1f) {scale = 0.1f;}
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = entity.width * scale * 0.0F;
    }

}




