package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraHyphantoceras;
import net.lepidodendron.entity.model.entity.ModelHyphantoceras;
import net.lepidodendron.entity.render.RenderLivingBaseWithBook;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderHyphantoceras extends RenderLivingBaseWithBook<EntityPrehistoricFloraHyphantoceras> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/hyphantoceras.png");

    public static float getScaler() {
        return 0.15F;
    }
    public RenderHyphantoceras(RenderManager mgr) {
        super(mgr, new ModelHyphantoceras(), 0.0f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraHyphantoceras entity) {
        return RenderHyphantoceras.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraHyphantoceras entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }
    @Override
    protected void preRenderCallback(EntityPrehistoricFloraHyphantoceras entity, float f) {
        float scale = this.getScaler() * entity.getAgeScale();
        if (scale < 0.1f) {
            scale = 0.1f;
        }
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = 0;
    }

}