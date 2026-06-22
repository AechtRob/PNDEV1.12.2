package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraAncyloceras;
import net.lepidodendron.entity.model.entity.ModelAncyloceras;
import net.lepidodendron.entity.render.RenderLivingBaseWithBook;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderAncyloceras extends RenderLivingBaseWithBook<EntityPrehistoricFloraAncyloceras> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/ancyloceras.png");

    public static float getScaler() {
        return 0.25F;
    }
    public RenderAncyloceras(RenderManager mgr) {
        super(mgr, new ModelAncyloceras(), 0.0f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraAncyloceras entity) {
        return RenderAncyloceras.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraAncyloceras entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }
    @Override
    protected void preRenderCallback(EntityPrehistoricFloraAncyloceras entity, float f) {
        float scale = this.getScaler() * entity.getAgeScale();
        if (scale < 0.1f) {
            scale = 0.1f;
        }
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = 0;
    }

}