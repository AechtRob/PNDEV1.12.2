package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraHaplophrentis;
import net.lepidodendron.entity.model.entity.ModelHaplophrentis;
import net.lepidodendron.entity.render.RenderLivingBaseWithBook;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderHaplophrentis extends RenderLivingBaseWithBook<EntityPrehistoricFloraHaplophrentis> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/haplophrentis.png");

    public static float getScaler() {
        return 0.45F;
    }
    public RenderHaplophrentis(RenderManager mgr) {
        super(mgr, new ModelHaplophrentis(), 0.0f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraHaplophrentis entity) {
        return RenderHaplophrentis.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraHaplophrentis entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }
    @Override
    protected void preRenderCallback(EntityPrehistoricFloraHaplophrentis entity, float f) {
        float scale = this.getScaler();
        if (scale < 0.1f) {
            scale = 0.1f;
        }
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = 0;
    }

}