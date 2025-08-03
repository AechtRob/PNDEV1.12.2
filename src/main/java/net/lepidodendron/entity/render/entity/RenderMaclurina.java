package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraMaclurina;
import net.lepidodendron.entity.model.entity.ModelMaclurina;
import net.lepidodendron.entity.render.RenderLivingBaseWithBook;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderMaclurina extends RenderLivingBaseWithBook<EntityPrehistoricFloraMaclurina> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/maclurina.png");

    public static float getScaler() {
        return 0.4F;
    }
    public RenderMaclurina(RenderManager mgr) {
        super(mgr, new ModelMaclurina(), 0.0f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraMaclurina entity) {
        return RenderMaclurina.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraMaclurina entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }
    @Override
    protected void preRenderCallback(EntityPrehistoricFloraMaclurina entity, float f) {
        float scale = this.getScaler();
        if (scale < 0.1f) {
            scale = 0.1f;
        }
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = 0;
    }

}