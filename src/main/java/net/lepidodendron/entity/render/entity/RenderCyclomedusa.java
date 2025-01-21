package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraCyclomedusa;
import net.lepidodendron.entity.model.entity.ModelCyclomedusa;
import net.lepidodendron.entity.render.RenderLivingBaseWithBook;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderCyclomedusa extends RenderLivingBaseWithBook<EntityPrehistoricFloraCyclomedusa> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/cyclomedusa.png");

    public static float getScaler() {return 0.725F;}

    public RenderCyclomedusa(RenderManager mgr) {
        super(mgr, new ModelCyclomedusa(), 0.0f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraCyclomedusa entity) {
        return RenderCyclomedusa.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraCyclomedusa entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        //super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
        GlStateManager.rotate(180.0F - entityLiving.getTickOffset(), 0.0F, 1.0F, 0.0F);
    }

    @Override
    protected void preRenderCallback(EntityPrehistoricFloraCyclomedusa entity, float f) {
        float scale = getScaler();
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = 0F;
    }

}