package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraPlatysuchus;
import net.lepidodendron.entity.model.entity.ModelPlatysuchus;
import net.lepidodendron.entity.render.RenderLivingBaseWithBook;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderPlatysuchus extends RenderLivingBaseWithBook<EntityPrehistoricFloraPlatysuchus> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/platysuchus.png");

    public static float getScaler() {return 0.7f;}
    public RenderPlatysuchus(RenderManager mgr) {
        super(mgr, new ModelPlatysuchus(), 0.3f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraPlatysuchus entity) {
        return RenderPlatysuchus.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraPlatysuchus entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

    @Override
    protected void preRenderCallback(EntityPrehistoricFloraPlatysuchus entity, float f) {
        float scale = entity.getAgeScale()*getScaler();
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = 0;
    }

}