package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraElephantoceras;
import net.lepidodendron.entity.model.entity.ModelElephantoceras;
import net.lepidodendron.entity.render.RenderLivingBaseWithBook;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderElephantoceras extends RenderLivingBaseWithBook<EntityPrehistoricFloraElephantoceras> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/elephantoceras.png");

    public static float getScaler() {
        return 0.7F * 0.5F;
    }
    public RenderElephantoceras(RenderManager mgr) {
        super(mgr, new ModelElephantoceras(), 0.0f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraElephantoceras entity) {
        return RenderElephantoceras.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraElephantoceras entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }
    @Override
    protected void preRenderCallback(EntityPrehistoricFloraElephantoceras entity, float f) {
        float scale = this.getScaler();
        if (scale < 0.1f) {
            scale = 0.1f;
        }
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = 0;
    }

}