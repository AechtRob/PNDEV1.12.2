package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraProterosuchus;
import net.lepidodendron.entity.model.entity.ModelProterosuchus;
import net.lepidodendron.entity.render.RenderLivingBaseWithBook;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderProterosuchus extends RenderLivingBaseWithBook<EntityPrehistoricFloraProterosuchus> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/proterosuchus.png");

    public RenderProterosuchus(RenderManager mgr) {
        super(mgr, new ModelProterosuchus(), 0.5f);
    }
    public static float getScaler() {return 0.65f; }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraProterosuchus entity) {
        float scale = entity.getAgeScale();
        return RenderProterosuchus.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraProterosuchus entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

    @Override
    protected void preRenderCallback(EntityPrehistoricFloraProterosuchus entity, float f) {
        float scale = entity.getAgeScale() * this.getScaler();
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = entity.width * scale * 0.50F;
    }

}