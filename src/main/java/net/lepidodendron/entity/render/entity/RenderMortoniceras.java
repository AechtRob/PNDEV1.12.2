package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraMortoniceras;
import net.lepidodendron.entity.model.entity.ModelMortoniceras;
import net.lepidodendron.entity.render.RenderLivingBaseWithBook;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderMortoniceras extends RenderLivingBaseWithBook<EntityPrehistoricFloraMortoniceras> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/mortoniceras.png");

    public static float getScaler() {
        return 0.325F;
    }
    public RenderMortoniceras(RenderManager mgr) {
        super(mgr, new ModelMortoniceras(), 0.0f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraMortoniceras entity) {
        return RenderMortoniceras.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraMortoniceras entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }
    @Override
    protected void preRenderCallback(EntityPrehistoricFloraMortoniceras entity, float f) {
        float scale = this.getScaler() * entity.getAgeScale();
        if (scale < 0.1f) {
            scale = 0.1f;
        }
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = 0;
    }

}