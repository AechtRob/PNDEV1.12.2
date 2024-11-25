package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraAcheronauta;
import net.lepidodendron.entity.model.entity.ModelAcheronauta;
import net.lepidodendron.entity.render.RenderLivingBaseWithBook;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderAcheronauta extends RenderLivingBaseWithBook<EntityPrehistoricFloraAcheronauta> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/Acheronauta.png");

    public static float getScaler() {
        return 0.2F;
    }
    public RenderAcheronauta(RenderManager mgr) {
        super(mgr, new ModelAcheronauta(), 0.0f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraAcheronauta entity) {
        return RenderAcheronauta.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraAcheronauta entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }
    @Override
    protected void preRenderCallback(EntityPrehistoricFloraAcheronauta entity, float f) {
        float scale = this.getScaler();
        if (scale < 0.1f) {
            scale = 0.1f;
        }
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = 0;
    }

}