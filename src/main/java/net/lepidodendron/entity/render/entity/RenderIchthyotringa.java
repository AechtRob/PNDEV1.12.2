package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraIchthyotringa;
import net.lepidodendron.entity.model.entity.ModelIchthyotringa;
import net.lepidodendron.entity.render.RenderLivingBaseWithBook;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderIchthyotringa extends RenderLivingBaseWithBook<EntityPrehistoricFloraIchthyotringa> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/ichthyotringa.png");

    public static float getScaler() {
        return 0.7F * 0.2F;
    }
    public RenderIchthyotringa(RenderManager mgr) {
        super(mgr, new ModelIchthyotringa(), 0.0f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraIchthyotringa entity) {
        return RenderIchthyotringa.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraIchthyotringa entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }
    @Override
    protected void preRenderCallback(EntityPrehistoricFloraIchthyotringa entity, float f) {
        float scale = this.getScaler();
        if (scale < 0.1f) {
            scale = 0.1f;
        }
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = 0;
    }

}