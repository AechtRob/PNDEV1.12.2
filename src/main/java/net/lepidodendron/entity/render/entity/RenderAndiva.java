package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraAndiva;
import net.lepidodendron.entity.model.entity.ModelAndiva;
import net.lepidodendron.entity.render.RenderLivingBaseWithBook;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderAndiva extends RenderLivingBaseWithBook<EntityPrehistoricFloraAndiva> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/andiva.png");
    public static float getScaler() {
        return 0.35F;
    }

    public RenderAndiva(RenderManager mgr) {
        super(mgr, new ModelAndiva(), 0.0f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraAndiva entity) {
        return RenderAndiva.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraAndiva entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

    protected void preRenderCallback(EntityPrehistoricFloraAndiva entity, float f) {
        float scale = this.getScaler();
        if (scale < 0.1f) {
            scale = 0.1f;
        }
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = 0;
    }
}