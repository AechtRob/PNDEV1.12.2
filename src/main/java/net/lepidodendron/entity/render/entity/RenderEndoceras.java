package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraEndoceras;
import net.lepidodendron.entity.model.entity.ModelEndoceras;
import net.lepidodendron.entity.render.RenderLivingBaseWithBook;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderEndoceras extends RenderLivingBaseWithBook<EntityPrehistoricFloraEndoceras> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/endoceras.png");
    public static float getScaler() {
        return 0.96F;
    }

    public RenderEndoceras(RenderManager mgr) {
        super(mgr, new ModelEndoceras(), 0.6f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraEndoceras entity) {
        return RenderEndoceras.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraEndoceras entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

    @Override
    protected void preRenderCallback(EntityPrehistoricFloraEndoceras entity, float f) {
        float scale = entity.getAgeScale() * entity.getAgeScale();
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = entity.width * scale * 0F;
    }

}