package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraPolysentor;
import net.lepidodendron.entity.model.entity.ModelPolysentor;
import net.lepidodendron.entity.render.RenderLivingBaseWithBook;
import net.lepidodendron.entity.render.tile.RenderDisplays;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderPolysentor extends RenderLivingBaseWithBook<EntityPrehistoricFloraPolysentor> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/polysentor.png");

    public RenderPolysentor(RenderManager mgr) {
        super(mgr, new ModelPolysentor(), RenderDisplays.modelPolysentorBook, 0.0f);
    }

    public static float getScaler() {return 0.26F; }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraPolysentor entity) {
        return RenderPolysentor.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraPolysentor entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

    @Override
    protected void preRenderCallback(EntityPrehistoricFloraPolysentor entity, float f) {
        float scale = this.getScaler();
        if (scale < 0.1f) {scale = 0.1f;}
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = entity.width * scale * 0.0F;
    }

}