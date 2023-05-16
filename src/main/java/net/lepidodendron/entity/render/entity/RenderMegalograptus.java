package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraMegalograptus;
import net.lepidodendron.entity.model.entity.ModelMegalograptus;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderMegalograptus extends RenderLiving<EntityPrehistoricFloraMegalograptus> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/megalograptus.png");
    private static final ResourceLocation TEXTURE_BABY = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/megalograptus_baby.png");
    public static final ModelBase MODEL_BASE = new ModelMegalograptus();

    public static float getScaler() {return 0.3F; }

    public RenderMegalograptus(RenderManager mgr) {
        super(mgr, MODEL_BASE, 0.0f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraMegalograptus entity) {
        float scale = entity.getAgeScale() * this.getScaler();
        if (entity.isSmall()) {
            return RenderMegalograptus.TEXTURE_BABY;
        }
        return RenderMegalograptus.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraMegalograptus entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

    @Override
    protected void preRenderCallback(EntityPrehistoricFloraMegalograptus entity, float f) {
        float scale = entity.getAgeScale() * this.getScaler();
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = entity.width * scale * 0.45F;
    }

}