package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraHaplolepis;
import net.lepidodendron.entity.model.entity.ModelHaplolepis;
import net.lepidodendron.entity.render.RenderLivingBaseWithBook;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderHaplolepis extends RenderLivingBaseWithBook<EntityPrehistoricFloraHaplolepis> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/haplolepis.png");

    public static float getScaler() {
        return 0.7F * 0.3F;
    }
    public RenderHaplolepis(RenderManager mgr) {
        super(mgr, new ModelHaplolepis(), 0.0f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraHaplolepis entity) {
        return RenderHaplolepis.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraHaplolepis entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }
    @Override
    protected void preRenderCallback(EntityPrehistoricFloraHaplolepis entity, float f) {
        float scale = this.getScaler();
        if (scale < 0.1f) {
            scale = 0.1f;
        }
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = 0;
    }

}