package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraTerrestrisuchus;
import net.lepidodendron.entity.model.entity.ModelTerrestrisuchus;
import net.lepidodendron.entity.render.RenderLivingBaseWithBook;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderTerrestrisuchus extends RenderLivingBaseWithBook<EntityPrehistoricFloraTerrestrisuchus> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/terrestrisuchus.png");

    public static float getScaler() {return 0.22f;}
    public RenderTerrestrisuchus(RenderManager mgr) {
        super(mgr, new ModelTerrestrisuchus(), 0.3f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraTerrestrisuchus entity) {
        return RenderTerrestrisuchus.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraTerrestrisuchus entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

    @Override
    protected void preRenderCallback(EntityPrehistoricFloraTerrestrisuchus entity, float f) {
        float scale = entity.getAgeScale()*getScaler();
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = 0;
    }

}