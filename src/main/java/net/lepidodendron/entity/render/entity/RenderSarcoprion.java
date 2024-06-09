package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraSarcoprion;
import net.lepidodendron.entity.model.entity.ModelSarcoprion;
import net.lepidodendron.entity.render.RenderLivingBaseModel;
import net.lepidodendron.entity.render.tile.RenderDisplays;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderSarcoprion extends RenderLivingBaseModel<EntityPrehistoricFloraSarcoprion> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/sarcoprion.png");
    public static final ResourceLocation TEXTURE_F = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/sarcoprion_f.png");

    public RenderSarcoprion(RenderManager mgr) {
        super(mgr, new ModelSarcoprion(), RenderDisplays.modelSarcoprionBook, 0.0f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraSarcoprion entity) {
        if (entity.getPNType() == EntityPrehistoricFloraSarcoprion.Type.FEMALE) {
            return RenderSarcoprion.TEXTURE_F;
        }
        return RenderSarcoprion.TEXTURE;
    }

    public static float getScaler() {
        return 1F;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraSarcoprion entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

    protected void preRenderCallback(EntityPrehistoricFloraSarcoprion entity, float f) {
        float scale = entity.getAgeScale() * this.getScaler();
        if (entity.getPNType() == EntityPrehistoricFloraSarcoprion.Type.FEMALE) {
            scale = scale * 0.8F;
        }
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = entity.width * scale * 0.00F;
    }

}