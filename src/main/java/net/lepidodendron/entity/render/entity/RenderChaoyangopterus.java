package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraChaoyangopterus;
import net.lepidodendron.entity.model.entity.ModelChaoyangopterus;
import net.lepidodendron.entity.render.RenderLivingBaseWithBook;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderChaoyangopterus extends RenderLivingBaseWithBook<EntityPrehistoricFloraChaoyangopterus> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/chaoyangopterus.png");

    public static float getScaler() {return 0.78f*0.5f;}
    public RenderChaoyangopterus(RenderManager mgr) {
        super(mgr, new ModelChaoyangopterus(), 0.3f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraChaoyangopterus entity) {
        return RenderChaoyangopterus.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraChaoyangopterus entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

    @Override
    protected void preRenderCallback(EntityPrehistoricFloraChaoyangopterus entity, float f) {
        float scale = entity.getAgeScale()*getScaler();
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = 0;
    }

}