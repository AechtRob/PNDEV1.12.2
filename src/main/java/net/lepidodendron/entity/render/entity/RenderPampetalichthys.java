package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraPampetalichthys;
import net.lepidodendron.entity.model.entity.ModelPampetalichthys;
import net.lepidodendron.entity.render.RenderLivingBaseWithBook;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderPampetalichthys extends RenderLivingBaseWithBook<EntityPrehistoricFloraPampetalichthys> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/pampetalichthys.png");

    public static float getScaler() {
        return 0.27F;
    }
    public RenderPampetalichthys(RenderManager mgr) {
        super(mgr, new ModelPampetalichthys(), 0.3f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraPampetalichthys entity) {
        return RenderPampetalichthys.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraPampetalichthys entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

    @Override
    protected void preRenderCallback(EntityPrehistoricFloraPampetalichthys entity, float f) {
        float scale = this.getScaler();
        if (scale < 0.1f) {
            scale = 0.1f;
        }
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = entity.width * scale * 0.3f;
    }

}