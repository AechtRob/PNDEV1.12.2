package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraAustralichthys;
import net.lepidodendron.entity.model.entity.ModelAustralichthys;
import net.lepidodendron.entity.render.RenderLivingBaseWithBook;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderAustralichthys extends RenderLivingBaseWithBook<EntityPrehistoricFloraAustralichthys> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/australichthys.png");

    public static float getScaler() {
        return 0.7F * 0.45F;
    }
    public RenderAustralichthys(RenderManager mgr) {
        super(mgr, new ModelAustralichthys(), 0.0f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraAustralichthys entity) {
        return RenderAustralichthys.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraAustralichthys entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }
    @Override
    protected void preRenderCallback(EntityPrehistoricFloraAustralichthys entity, float f) {
        float scale = this.getScaler();
        if (scale < 0.1f) {
            scale = 0.1f;
        }
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = 0;
    }

}