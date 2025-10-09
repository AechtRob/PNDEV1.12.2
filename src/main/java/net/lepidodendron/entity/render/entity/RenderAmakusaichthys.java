package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraAmakusaichthys;
import net.lepidodendron.entity.model.entity.ModelAmakusaichthys;
import net.lepidodendron.entity.render.RenderLivingBaseWithBook;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderAmakusaichthys extends RenderLivingBaseWithBook<EntityPrehistoricFloraAmakusaichthys> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/amakusaichthys.png");

    public static float getScaler() {
        return 0.34F;
    }
    public RenderAmakusaichthys(RenderManager mgr) {
        super(mgr, new ModelAmakusaichthys(), 0.0f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraAmakusaichthys entity) {
        return RenderAmakusaichthys.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraAmakusaichthys entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }
    @Override
    protected void preRenderCallback(EntityPrehistoricFloraAmakusaichthys entity, float f) {
        float scale = this.getScaler();
        if (scale < 0.1f) {
            scale = 0.1f;
        }
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = 0;
    }

}