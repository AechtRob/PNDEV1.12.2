package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraSaperion;
import net.lepidodendron.entity.model.entity.ModelSaperion;
import net.lepidodendron.entity.render.RenderLivingBaseWithBook;
import net.lepidodendron.entity.render.tile.RenderDisplays;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderSaperion extends RenderLivingBaseWithBook<EntityPrehistoricFloraSaperion> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/saperion.png");
    public static float getScaler() {
        return 0.24F;
    }

    public RenderSaperion(RenderManager mgr) {
        super(mgr, new ModelSaperion(), RenderDisplays.modelSaperionBook, 0.0f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraSaperion entity) {
        return RenderSaperion.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraSaperion entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }
    @Override
    protected void preRenderCallback(EntityPrehistoricFloraSaperion entity, float f) {
        float scale = this.getScaler();
        if (scale < 0.1f) {
            scale = 0.1f;
        }
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = 0;
    }

}
