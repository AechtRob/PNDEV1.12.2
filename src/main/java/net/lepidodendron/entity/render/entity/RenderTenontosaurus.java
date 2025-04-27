package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraTenontosaurus;
import net.lepidodendron.entity.model.entity.ModelTenontosaurus;
import net.lepidodendron.entity.render.RenderLivingBaseWithBook;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderTenontosaurus extends RenderLivingBaseWithBook<EntityPrehistoricFloraTenontosaurus> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/tenontosaurus.png");

    public static float getScaler() {
        return 1f;
    }

    public RenderTenontosaurus(RenderManager mgr) {
        super(mgr, new ModelTenontosaurus(),0.9f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraTenontosaurus entity) {
        return RenderTenontosaurus.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraTenontosaurus entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

    @Override
    protected void preRenderCallback(EntityPrehistoricFloraTenontosaurus entity, float f) {
        float scale = entity.getAgeScale()*getScaler();
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = entity.width * scale * 0.50F;
    }

}