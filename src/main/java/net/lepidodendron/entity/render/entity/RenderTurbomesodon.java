package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraTurbomesodon;
import net.lepidodendron.entity.model.entity.ModelTurbomesodon;
import net.lepidodendron.entity.render.RenderLivingBaseWithBook;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderTurbomesodon extends RenderLivingBaseWithBook<EntityPrehistoricFloraTurbomesodon> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/turbomesodon.png");

    public RenderTurbomesodon(RenderManager mgr) {
        super(mgr, new ModelTurbomesodon(), 0.0f);
    }

    public static float getScaler() {return 0.13F; }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraTurbomesodon entity) {
        return RenderTurbomesodon.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraTurbomesodon entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

    @Override
    protected void preRenderCallback(EntityPrehistoricFloraTurbomesodon entity, float f) {
        float scale = this.getScaler();
        if (scale < 0.1f) {scale = 0.1f;}
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = entity.width * scale * 0.0F;
    }

}





