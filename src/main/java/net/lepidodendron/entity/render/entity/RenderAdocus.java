package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraAdocus;
import net.lepidodendron.entity.model.entity.ModelAdocus;
import net.lepidodendron.entity.render.RenderLivingBaseWithBook;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderAdocus extends RenderLivingBaseWithBook<EntityPrehistoricFloraAdocus> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/adocus.png");

    public RenderAdocus(RenderManager mgr) {
        super(mgr, new ModelAdocus(), 0.0f);
    }

    public static float getScaler() {return 0.25f; }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraAdocus entity) {
        return RenderAdocus.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraAdocus entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

    @Override
    protected void preRenderCallback(EntityPrehistoricFloraAdocus entity, float f) {
        float scale = entity.getAgeScale() * this.getScaler();
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = entity.width * scale * 0.3F;
    }

}

