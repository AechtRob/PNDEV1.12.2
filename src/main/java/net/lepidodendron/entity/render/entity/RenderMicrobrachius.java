package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraMicrobrachius;
import net.lepidodendron.entity.model.entity.ModelMicrobrachius;
import net.lepidodendron.entity.render.RenderLivingBaseWithBook;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderMicrobrachius extends RenderLivingBaseWithBook<EntityPrehistoricFloraMicrobrachius> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/microbrachius_male.png");
    public static final ResourceLocation TEXTURE_F = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/microbrachius_female.png");

    public static float getScaler() {
        return 0.7F * 0.295F;
    }
    public RenderMicrobrachius(RenderManager mgr) {
        super(mgr, new ModelMicrobrachius(), 0.0f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraMicrobrachius entity) {
        if (entity.getPNType() == EntityPrehistoricFloraMicrobrachius.Type.FEMALE) {
            return RenderMicrobrachius.TEXTURE_F;
        }
        return RenderMicrobrachius.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraMicrobrachius entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }
    @Override
    protected void preRenderCallback(EntityPrehistoricFloraMicrobrachius entity, float f) {
        float scale = this.getScaler();
        if (scale < 0.1f) {
            scale = 0.1f;
        }
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = 0;
    }

}