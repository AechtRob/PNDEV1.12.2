package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraEllimmichthys;
import net.lepidodendron.entity.model.entity.ModelEllimmichthys;
import net.lepidodendron.entity.render.RenderLivingBaseWithBook;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderEllimmichthys extends RenderLivingBaseWithBook<EntityPrehistoricFloraEllimmichthys> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/ellimmichthys.png");

    public RenderEllimmichthys(RenderManager mgr) {
        super(mgr, new ModelEllimmichthys(), 0.0f);
    }

    public static float getScaler() {return 0.19F; }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraEllimmichthys entity) {
        return RenderEllimmichthys.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraEllimmichthys entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

    @Override
    protected void preRenderCallback(EntityPrehistoricFloraEllimmichthys entity, float f) {
        float scale = this.getScaler();
        if (scale < 0.1f) {scale = 0.1f;}
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = entity.width * scale * 0.0F;
    }

}