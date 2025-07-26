package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraBrodiechelys;
import net.lepidodendron.entity.model.entity.ModelBrodiechelys;
import net.lepidodendron.entity.render.RenderLivingBaseWithBook;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderBrodiechelys extends RenderLivingBaseWithBook<EntityPrehistoricFloraBrodiechelys> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/brodiechelys.png");

    public RenderBrodiechelys(RenderManager mgr) {
        super(mgr, new ModelBrodiechelys(), 0.0f);
    }

    public static float getScaler() {return 0.25f; }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraBrodiechelys entity) {
        return RenderBrodiechelys.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraBrodiechelys entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

    @Override
    protected void preRenderCallback(EntityPrehistoricFloraBrodiechelys entity, float f) {
        float scale = entity.getAgeScale() * this.getScaler();
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = entity.width * scale * 0.3F;
    }

}

