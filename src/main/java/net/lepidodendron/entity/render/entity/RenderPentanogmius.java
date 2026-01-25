package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraPentanogmius;
import net.lepidodendron.entity.model.entity.ModelPentanogmius;
import net.lepidodendron.entity.render.RenderLivingBaseWithBook;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderPentanogmius extends RenderLivingBaseWithBook<EntityPrehistoricFloraPentanogmius> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/pentanogmius.png");

    public RenderPentanogmius(RenderManager mgr) {
        super(mgr, new ModelPentanogmius(), 0.0f);
    }

    public static float getScaler() {return 0.6F; }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraPentanogmius entity) {
        return RenderPentanogmius.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraPentanogmius entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

    protected void preRenderCallback(EntityPrehistoricFloraPentanogmius entity, float f) {
        float scale = this.getScaler();
        if (scale < 0.1f) {
            scale = 0.1f;
        }
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = 0;
    }

}