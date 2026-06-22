package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraDesmatochelys;
import net.lepidodendron.entity.model.entity.ModelDesmatochelys;
import net.lepidodendron.entity.render.RenderLivingBaseWithBook;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderDesmatochelys extends RenderLivingBaseWithBook<EntityPrehistoricFloraDesmatochelys> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/desmatochelys.png");

    public RenderDesmatochelys(RenderManager mgr) {
        super(mgr, new ModelDesmatochelys(), 0.0f);
    }

    public static float getScaler() {return 0.8f; }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraDesmatochelys entity) {
        return RenderDesmatochelys.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraDesmatochelys entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

    @Override
    protected void preRenderCallback(EntityPrehistoricFloraDesmatochelys entity, float f) {
        float scale = entity.getAgeScale() * this.getScaler();
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = entity.width * scale * 0.3F;
    }

}

