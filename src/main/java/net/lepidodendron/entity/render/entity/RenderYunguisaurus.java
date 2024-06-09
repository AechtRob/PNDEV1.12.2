package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraYunguisaurus;
import net.lepidodendron.entity.model.entity.ModelYunguisaurus;
import net.lepidodendron.entity.render.RenderLivingBaseWithBook;
import net.lepidodendron.entity.render.tile.RenderDisplays;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderYunguisaurus extends RenderLivingBaseWithBook<EntityPrehistoricFloraYunguisaurus> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/yunguisaurus.png");
    public static float getScaler() {return 0.8F; }

    public RenderYunguisaurus(RenderManager mgr) {
        super(mgr, new ModelYunguisaurus(), RenderDisplays.modelYunguisaurus, 1.5f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraYunguisaurus entity) {
        return RenderYunguisaurus.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraYunguisaurus entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

    @Override
    protected void preRenderCallback(EntityPrehistoricFloraYunguisaurus entity, float f) {
        float scale = entity.getAgeScale() * this.getScaler();
        if (scale < 0.1f) {scale = 0.1f;}
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = entity.width * scale * 0.35F;
    }

}