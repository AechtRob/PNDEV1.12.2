package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraNigerpeton;
import net.lepidodendron.entity.model.entity.ModelNigerpeton;
import net.lepidodendron.entity.render.RenderLivingBaseWithBook;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderNigerpeton extends RenderLivingBaseWithBook<EntityPrehistoricFloraNigerpeton> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/nigerpeton.png");

    public static float getScaler() {return 0.8333f;}
    public RenderNigerpeton(RenderManager mgr) {
        super(mgr, new ModelNigerpeton(), 0.3f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraNigerpeton entity) {
        return RenderNigerpeton.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraNigerpeton entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

    @Override
    protected void preRenderCallback(EntityPrehistoricFloraNigerpeton entity, float f) {
        float scale = entity.getAgeScale()*getScaler();
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = entity.width * scale * 0.15F;
    }

}