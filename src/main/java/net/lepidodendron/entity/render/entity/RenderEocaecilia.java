package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraEocaecilia;
import net.lepidodendron.entity.model.entity.ModelEocaecilia;
import net.lepidodendron.entity.render.RenderLivingBaseWithBook;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderEocaecilia extends RenderLivingBaseWithBook<EntityPrehistoricFloraEocaecilia> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/eocaecilia.png");

    public static float getScaler() {return 0.1f;}

    public RenderEocaecilia(RenderManager mgr) {
        super(mgr, new ModelEocaecilia(), 0.5f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraEocaecilia entity) {
        return RenderEocaecilia.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraEocaecilia entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

    @Override
    protected void preRenderCallback(EntityPrehistoricFloraEocaecilia entity, float f) {
        float scale = entity.getAgeScale()*getScaler();
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = 0F;
    }

}