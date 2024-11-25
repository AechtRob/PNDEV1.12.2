package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraSegisaurus;
import net.lepidodendron.entity.model.entity.ModelSegisaurus;
import net.lepidodendron.entity.render.RenderLivingBaseWithBook;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderSegisaurus extends RenderLivingBaseWithBook<EntityPrehistoricFloraSegisaurus> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/segisaurus.png");

    public RenderSegisaurus(RenderManager mgr) {
        super(mgr, new ModelSegisaurus(), 0.5f);
    }

    public static float getScaler() {return 0.495f; }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraSegisaurus entity) {
        return RenderSegisaurus.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraSegisaurus entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

    @Override
    protected void preRenderCallback(EntityPrehistoricFloraSegisaurus entity, float f) {
        float scale = entity.getAgeScale() * this.getScaler();
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = entity.width * scale * 0.38F;
    }

}