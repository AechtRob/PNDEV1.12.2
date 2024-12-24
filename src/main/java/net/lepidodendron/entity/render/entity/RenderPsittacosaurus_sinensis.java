package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraPsittacosaurus_sinensis;
import net.lepidodendron.entity.model.entity.ModelPsittacosaurus_sinensis;
import net.lepidodendron.entity.render.RenderLivingBaseWithBook;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderPsittacosaurus_sinensis extends RenderLivingBaseWithBook<EntityPrehistoricFloraPsittacosaurus_sinensis> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/psittacosaurus_sinensis.png");

    public RenderPsittacosaurus_sinensis(RenderManager mgr) {
        super(mgr, new ModelPsittacosaurus_sinensis(), 0.3f);
    }

    public static float getScaler() {
        return 0.34F;
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraPsittacosaurus_sinensis entity) {
        return RenderPsittacosaurus_sinensis.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraPsittacosaurus_sinensis entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

    @Override
    protected void preRenderCallback(EntityPrehistoricFloraPsittacosaurus_sinensis entity, float f) {
        float scale = entity.getAgeScale() * this.getScaler();
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = entity.width * scale * 0.35F;
    }

}