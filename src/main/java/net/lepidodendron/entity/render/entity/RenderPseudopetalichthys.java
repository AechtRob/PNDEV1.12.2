package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraPseudopetalichthys;
import net.lepidodendron.entity.model.entity.ModelPseudopetalichthys;
import net.lepidodendron.entity.render.RenderLivingBaseWithBook;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderPseudopetalichthys extends RenderLivingBaseWithBook<EntityPrehistoricFloraPseudopetalichthys> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/pseudopetalichthys.png");

    public static float getScaler() {
        return 0.28F;
    }
    public RenderPseudopetalichthys(RenderManager mgr) {
        super(mgr, new ModelPseudopetalichthys(), 0.0f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraPseudopetalichthys entity) {
        return RenderPseudopetalichthys.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraPseudopetalichthys entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }
    @Override
    protected void preRenderCallback(EntityPrehistoricFloraPseudopetalichthys entity, float f) {
        float scale = this.getScaler();
        if (scale < 0.1f) {
            scale = 0.1f;
        }
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = 0;
    }

}