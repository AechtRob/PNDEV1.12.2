package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraShachemys;
import net.lepidodendron.entity.model.entity.ModelShachemys;
import net.lepidodendron.entity.render.RenderLivingBaseWithBook;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderShachemys extends RenderLivingBaseWithBook<EntityPrehistoricFloraShachemys> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/shachemys.png");

    public RenderShachemys(RenderManager mgr) {
        super(mgr, new ModelShachemys(), 0.0f);
    }

    public static float getScaler() {return 0.25f; }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraShachemys entity) {
        return RenderShachemys.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraShachemys entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

    @Override
    protected void preRenderCallback(EntityPrehistoricFloraShachemys entity, float f) {
        float scale = entity.getAgeScale() * this.getScaler();
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = entity.width * scale * 0.3F;
    }

}

