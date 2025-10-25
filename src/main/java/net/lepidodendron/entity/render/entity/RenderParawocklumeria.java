package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraParawocklumeria;
import net.lepidodendron.entity.model.entity.ModelParawocklumeria;
import net.lepidodendron.entity.render.RenderLivingBaseWithBook;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderParawocklumeria extends RenderLivingBaseWithBook<EntityPrehistoricFloraParawocklumeria> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/parawocklumeria.png");

    public static float getScaler() {
        return 0.25F;
    }
    public RenderParawocklumeria(RenderManager mgr) {
        super(mgr, new ModelParawocklumeria(), 0.0f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraParawocklumeria entity) {
        return RenderParawocklumeria.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraParawocklumeria entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }
    @Override
    protected void preRenderCallback(EntityPrehistoricFloraParawocklumeria entity, float f) {
        float scale = this.getScaler() * entity.getAgeScale();
        if (scale < 0.1f) {
            scale = 0.1f;
        }
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = 0;
    }

}