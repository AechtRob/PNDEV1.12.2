package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraMacropenaeus;
import net.lepidodendron.entity.model.entity.ModelMacropenaeus;
import net.lepidodendron.entity.render.RenderLivingBaseWithBook;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderMacropenaeus extends RenderLivingBaseWithBook<EntityPrehistoricFloraMacropenaeus> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/macropenaeus.png");

    public RenderMacropenaeus(RenderManager mgr) {
        super(mgr, new ModelMacropenaeus(), 0.0f);
    }

    public static float getScaler() {return 0.28F; }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraMacropenaeus entity) {
        return RenderMacropenaeus.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraMacropenaeus entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

    @Override
    protected void preRenderCallback(EntityPrehistoricFloraMacropenaeus entity, float f) {
        float scale = this.getScaler();
        if (scale < 0.1f) {scale = 0.1f;}
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = entity.width * scale * 0.0F;
    }

}





