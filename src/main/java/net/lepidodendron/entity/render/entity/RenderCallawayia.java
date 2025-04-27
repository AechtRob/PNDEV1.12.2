package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraCallawayia;
import net.lepidodendron.entity.model.entity.ModelCallawayia;
import net.lepidodendron.entity.render.RenderLivingBaseWithBook;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderCallawayia extends RenderLivingBaseWithBook<EntityPrehistoricFloraCallawayia> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/callawayia.png");

    public RenderCallawayia(RenderManager mgr) {
        super(mgr, new ModelCallawayia(), 0.0f);
    }

    public static float getScaler() {
        return 0.6F;
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraCallawayia entity) {
        return RenderCallawayia.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraCallawayia entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

    @Override
    protected void preRenderCallback(EntityPrehistoricFloraCallawayia entity, float f) {
        float scale = entity.getAgeScale() * this.getScaler();
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = entity.width * scale * 0.35F;

    }

}