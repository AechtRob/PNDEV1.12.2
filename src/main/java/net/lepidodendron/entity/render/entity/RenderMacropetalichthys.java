package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraMacropetalichthys;
import net.lepidodendron.entity.model.entity.ModelMacropetalichthys;
import net.lepidodendron.entity.render.RenderLivingBaseWithBook;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderMacropetalichthys extends RenderLivingBaseWithBook<EntityPrehistoricFloraMacropetalichthys> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/macropetalichthys.png");

    public static float getScaler() {
        return 0.75F;
    }
    public RenderMacropetalichthys(RenderManager mgr) {
        super(mgr, new ModelMacropetalichthys(), 0.3f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraMacropetalichthys entity) {
        return RenderMacropetalichthys.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraMacropetalichthys entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

    @Override
    protected void preRenderCallback(EntityPrehistoricFloraMacropetalichthys entity, float f) {
        float scale = this.getScaler();
        if (scale < 0.1f) {
            scale = 0.1f;
        }
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = entity.width * scale * 0.3f;
    }

}