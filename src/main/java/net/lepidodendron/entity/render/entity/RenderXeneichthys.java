package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraXeneichthys;
import net.lepidodendron.entity.model.entity.ModelXeneichthys;
import net.lepidodendron.entity.render.RenderLivingBaseWithBook;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderXeneichthys extends RenderLivingBaseWithBook<EntityPrehistoricFloraXeneichthys> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/xeneichthys.png");

    public static float getScaler() {
        return 0.7F * 0.3F;
    }
    public RenderXeneichthys(RenderManager mgr) {
        super(mgr, new ModelXeneichthys(), 0.0f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraXeneichthys entity) {
        return RenderXeneichthys.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraXeneichthys entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }
    @Override
    protected void preRenderCallback(EntityPrehistoricFloraXeneichthys entity, float f) {
        float scale = this.getScaler();
        if (scale < 0.1f) {
            scale = 0.1f;
        }
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = 0;
    }

}