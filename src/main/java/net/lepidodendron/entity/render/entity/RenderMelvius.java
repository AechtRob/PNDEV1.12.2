package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraMelvius;
import net.lepidodendron.entity.model.entity.ModelMelvius;
import net.lepidodendron.entity.render.RenderLivingBaseWithBook;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderMelvius extends RenderLivingBaseWithBook<EntityPrehistoricFloraMelvius> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/melvius.png");

    public RenderMelvius(RenderManager mgr) {
        super(mgr, new ModelMelvius(), 0.0f);
    }

    public static float getScaler() {return 0.64F; }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraMelvius entity) {
        return RenderMelvius.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraMelvius entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

    protected void preRenderCallback(EntityPrehistoricFloraMelvius entity, float f) {
        float scale = this.getScaler();
        if (scale < 0.1f) {
            scale = 0.1f;
        }
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = 0;
    }

}