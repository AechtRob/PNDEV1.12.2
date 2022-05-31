package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraMegarachne;
import net.lepidodendron.entity.model.entity.ModelMegarachne;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderMegarachne extends RenderLiving<EntityPrehistoricFloraMegarachne> {
    private static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/megarachne.png");
    private static final ResourceLocation TEXTURE_BABY = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/megarachne_baby.png");


    public RenderMegarachne(RenderManager mgr) {
        super(mgr, new ModelMegarachne(), 0.0f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraMegarachne entity) {
        float scale = entity.getAgeScale();
        if (scale < 0.5F) {
            return RenderMegarachne.TEXTURE_BABY;
        }
        return RenderMegarachne.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraMegarachne entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

    @Override
    protected void preRenderCallback(EntityPrehistoricFloraMegarachne entity, float f) {
        float scale = entity.getAgeScale();
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = entity.width * scale * 0.45F;
    }

}