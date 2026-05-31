package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraManidens;
import net.lepidodendron.entity.model.entity.ModelManidens;
import net.lepidodendron.entity.render.RenderLivingBaseWithBook;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderManidens extends RenderLivingBaseWithBook<EntityPrehistoricFloraManidens> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/manidens.png");

    public RenderManidens(RenderManager mgr) {
        super(mgr, new ModelManidens(), 0.3f);
    }

    public static float getScaler() {
        return 0.19F;
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraManidens entity) {
        return RenderManidens.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraManidens entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

    @Override
    protected void preRenderCallback(EntityPrehistoricFloraManidens entity, float f) {
        float scale = entity.getAgeScale() * this.getScaler();
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = entity.width * scale * 0.35F;
    }

}