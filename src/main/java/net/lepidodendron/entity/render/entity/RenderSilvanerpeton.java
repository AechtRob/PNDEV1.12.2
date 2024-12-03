package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraSilvanerpeton;
import net.lepidodendron.entity.model.entity.ModelSilvanerpeton;
import net.lepidodendron.entity.render.RenderLivingBaseWithBook;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderSilvanerpeton extends RenderLivingBaseWithBook<EntityPrehistoricFloraSilvanerpeton> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/silvanerpeton.png");

    public static float getScaler() {return 0.26f;}

    public RenderSilvanerpeton(RenderManager mgr) {
        super(mgr, new ModelSilvanerpeton(), 0.5f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraSilvanerpeton entity) {
        return RenderSilvanerpeton.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraSilvanerpeton entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

    @Override
    protected void preRenderCallback(EntityPrehistoricFloraSilvanerpeton entity, float f) {
        float scale = entity.getAgeScale()*getScaler();
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = entity.width * scale * 0.0F;
    }

}