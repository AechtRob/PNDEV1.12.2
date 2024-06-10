package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraYuxisaurus;
import net.lepidodendron.entity.model.entity.ModelYuxisaurus;
import net.lepidodendron.entity.render.RenderLivingBaseWithBook;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderYuxisaurus extends RenderLivingBaseWithBook<EntityPrehistoricFloraYuxisaurus> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/yuxisaurus.png");

    public RenderYuxisaurus(RenderManager mgr) {
        super(mgr, new ModelYuxisaurus(), 0.3f);
    }

    public static float getScaler() {
        return 0.9F;
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraYuxisaurus entity) {
        return RenderYuxisaurus.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraYuxisaurus entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

    @Override
    protected void preRenderCallback(EntityPrehistoricFloraYuxisaurus entity, float f) {
        float scale = entity.getAgeScale() * this.getScaler();
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = entity.width * scale * 0.6F;
    }

}