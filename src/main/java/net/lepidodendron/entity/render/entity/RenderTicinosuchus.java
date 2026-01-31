package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraTicinosuchus;
import net.lepidodendron.entity.model.entity.ModelTicinosuchus;
import net.lepidodendron.entity.render.RenderLivingBaseWithBook;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderTicinosuchus extends RenderLivingBaseWithBook<EntityPrehistoricFloraTicinosuchus> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/ticinosuchus.png");

    public static float getScaler() {return 0.82f;}
    public RenderTicinosuchus(RenderManager mgr) {
        super(mgr, new ModelTicinosuchus(), 0.3f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraTicinosuchus entity) {
        return RenderTicinosuchus.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraTicinosuchus entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

    @Override
    protected void preRenderCallback(EntityPrehistoricFloraTicinosuchus entity, float f) {
        float scale = entity.getAgeScale()*getScaler();
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = entity.width * scale * 0.15F;
    }

}