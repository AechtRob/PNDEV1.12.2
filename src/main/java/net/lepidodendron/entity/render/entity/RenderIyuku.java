package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraIyuku;
import net.lepidodendron.entity.model.entity.ModelIyuku;
import net.lepidodendron.entity.render.RenderLivingBaseWithBook;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderIyuku extends RenderLivingBaseWithBook<EntityPrehistoricFloraIyuku> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/iyuku.png");

    public static float getScaler() {
        return 0.71F;
    }

    public RenderIyuku(RenderManager mgr) {
        super(mgr, new ModelIyuku(), 0.0f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraIyuku entity) {
        return RenderIyuku.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraIyuku entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

    @Override
    protected void preRenderCallback(EntityPrehistoricFloraIyuku entity, float f) {
        float scale = entity.getAgeScale() * this.getScaler();
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = entity.width * scale * 0.35F;
    }

}




