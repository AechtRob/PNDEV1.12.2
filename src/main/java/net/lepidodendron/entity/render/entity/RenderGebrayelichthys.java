package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraGebrayelichthys;
import net.lepidodendron.entity.model.entity.ModelGebrayelichthys;
import net.lepidodendron.entity.render.RenderLivingBaseWithBook;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderGebrayelichthys extends RenderLivingBaseWithBook<EntityPrehistoricFloraGebrayelichthys> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/gebrayelichthys.png");

    public RenderGebrayelichthys(RenderManager mgr) {
        super(mgr, new ModelGebrayelichthys(), 0.0f);
    }

    public static float getScaler() {return 0.20F; }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraGebrayelichthys entity) {
        return RenderGebrayelichthys.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraGebrayelichthys entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

    @Override
    protected void preRenderCallback(EntityPrehistoricFloraGebrayelichthys entity, float f) {
        float scale = this.getScaler();
        if (scale < 0.1f) {scale = 0.1f;}
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = entity.width * scale * 0.0F;
    }

}





