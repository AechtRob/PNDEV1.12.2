package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraPliodetes;
import net.lepidodendron.entity.model.entity.ModelPliodetes;
import net.lepidodendron.entity.render.RenderLivingBaseWithBook;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderPliodetes extends RenderLivingBaseWithBook<EntityPrehistoricFloraPliodetes> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/pliodetes.png");

    public static float getScaler() {
        return 0.25F;
    }
    public RenderPliodetes(RenderManager mgr) {
        super(mgr, new ModelPliodetes(), 0.0f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraPliodetes entity) {
        return RenderPliodetes.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraPliodetes entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }
    @Override
    protected void preRenderCallback(EntityPrehistoricFloraPliodetes entity, float f) {
        float scale = this.getScaler();
        if (scale < 0.1f) {
            scale = 0.1f;
        }
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = 0;
    }

}