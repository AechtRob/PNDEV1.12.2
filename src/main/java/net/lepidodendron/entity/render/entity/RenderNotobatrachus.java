package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraNotobatrachus;
import net.lepidodendron.entity.model.entity.ModelNotobatrachus;
import net.lepidodendron.entity.render.RenderLivingBaseWithBook;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderNotobatrachus extends RenderLivingBaseWithBook<EntityPrehistoricFloraNotobatrachus> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/notobatrachus.png");

    public static float getScaler() {return 0.24f;}

    public RenderNotobatrachus(RenderManager mgr) {
        super(mgr, new ModelNotobatrachus(), 0.5f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraNotobatrachus entity) {
        return RenderNotobatrachus.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraNotobatrachus entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

    @Override
    protected void preRenderCallback(EntityPrehistoricFloraNotobatrachus entity, float f) {
        float scale = entity.getAgeScale()*getScaler();
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = entity.width * scale * 0.6F;
    }

}