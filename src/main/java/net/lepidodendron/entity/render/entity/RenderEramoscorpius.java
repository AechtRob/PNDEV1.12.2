package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraEramoscorpius;
import net.lepidodendron.entity.model.entity.ModelEramoscorpius;
import net.lepidodendron.entity.model.entity.ModelScorpion;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderEramoscorpius extends RenderLiving<EntityPrehistoricFloraEramoscorpius> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/eramoscorpius.png");
    private static final ResourceLocation TEXTURE_WITH_BABIES = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/eramoscorpius_withbaby.png");
    private static final ResourceLocation TEXTURE_BABY = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/eramoscorpius_baby.png");

    public RenderEramoscorpius(RenderManager mgr) {
        super(mgr, new ModelEramoscorpius(), 0.0f);
    }

    public static float getScaler() {
        return 0.14F;
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraEramoscorpius entity) {
        if (entity.getIsBaby()) {
            return RenderEramoscorpius.TEXTURE_BABY;
        }
        else if (entity.getBabies()) {
            return RenderEramoscorpius.TEXTURE_WITH_BABIES;
        }
        return RenderEramoscorpius.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraEramoscorpius entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);

    }

    @Override
    protected void preRenderCallback(EntityPrehistoricFloraEramoscorpius entity, float f) {
        float scale = this.getScaler();
        if (entity.getIsBaby()) {
            scale = 0.05f;
        }
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = 0;

    }

}