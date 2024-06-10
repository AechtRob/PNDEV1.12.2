package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraStoermeropterus;
import net.lepidodendron.entity.model.entity.ModelStoermeropterus;
import net.lepidodendron.entity.render.RenderLivingBaseWithBook;
import net.lepidodendron.entity.render.tile.RenderDisplays;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderStoermeropterus extends RenderLivingBaseWithBook<EntityPrehistoricFloraStoermeropterus> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/stoermeropterus.png");

    public static float getScaler() {
        return 0.22F;
    }
    public RenderStoermeropterus(RenderManager mgr) {
        super(mgr, new ModelStoermeropterus(), RenderDisplays.modelStoermeropterusBook, 0.5f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraStoermeropterus entity) {
        float scale = entity.getAgeScale();
        //System.err.println("AgeScale: " + scale);
        return RenderStoermeropterus.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraStoermeropterus entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

    @Override
    protected void preRenderCallback(EntityPrehistoricFloraStoermeropterus entity, float f) {
        float scale = entity.getAgeScale()*this.getScaler();
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = entity.width * scale * 0.45F;
    }

}