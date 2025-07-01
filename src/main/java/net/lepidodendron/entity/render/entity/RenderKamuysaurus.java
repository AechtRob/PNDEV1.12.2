package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraKamuysaurus;
import net.lepidodendron.entity.model.entity.ModelKamuysaurus;
import net.lepidodendron.entity.render.RenderLivingBaseWithBook;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderKamuysaurus extends RenderLivingBaseWithBook<EntityPrehistoricFloraKamuysaurus> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/kamuysaurus.png");

    public static float getScaler() {
        return 1f;
    }

    public RenderKamuysaurus(RenderManager mgr) {
        super(mgr, new ModelKamuysaurus(),0.9f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraKamuysaurus entity) {
        return RenderKamuysaurus.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraKamuysaurus entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

    @Override
    protected void preRenderCallback(EntityPrehistoricFloraKamuysaurus entity, float f) {
        float scale = entity.getAgeScale()*getScaler();
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = entity.width * scale * 0.50F;
    }

}