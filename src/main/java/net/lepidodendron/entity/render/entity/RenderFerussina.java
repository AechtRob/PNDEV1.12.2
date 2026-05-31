package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraFerussina;
import net.lepidodendron.entity.model.entity.ModelFerussina;
import net.lepidodendron.entity.render.RenderLivingBaseWithBook;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderFerussina extends RenderLivingBaseWithBook<EntityPrehistoricFloraFerussina> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/ferussina.png");

    public static float getScaler() {
        return 0.395F;
    }
    public RenderFerussina(RenderManager mgr) {
        super(mgr, new ModelFerussina(), 0.0f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraFerussina entity) {
        return RenderFerussina.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraFerussina entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }
    @Override
    protected void preRenderCallback(EntityPrehistoricFloraFerussina entity, float f) {
        float scale = this.getScaler();
        if (scale < 0.1f) {
            scale = 0.1f;
        }
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = 0;
    }

}