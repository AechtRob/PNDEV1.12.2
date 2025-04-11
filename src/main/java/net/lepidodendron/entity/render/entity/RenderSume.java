package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraSume;
import net.lepidodendron.entity.model.entity.ModelSume;
import net.lepidodendron.entity.render.RenderLivingBaseWithBook;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderSume extends RenderLivingBaseWithBook<EntityPrehistoricFloraSume> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/sume.png");

    public RenderSume(RenderManager mgr) {
        super(mgr, new ModelSume(), 0.0f);
    }

    public static float getScaler() {return 0.22F; }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraSume entity) {
        return RenderSume.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraSume entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

    @Override
    protected void preRenderCallback(EntityPrehistoricFloraSume entity, float f) {
        float scale = this.getScaler();
        if (scale < 0.1f) {scale = 0.1f;}
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = entity.width * scale * 0.0F;
    }

}





