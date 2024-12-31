package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraPsittacosaurus;
import net.lepidodendron.entity.model.entity.ModelPsittacosaurus;
import net.lepidodendron.entity.render.RenderLivingBaseWithBook;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderPsittacosaurus extends RenderLivingBaseWithBook<EntityPrehistoricFloraPsittacosaurus> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/psittacosaurus.png");

    public RenderPsittacosaurus(RenderManager mgr) {
        super(mgr, new ModelPsittacosaurus(), 0.3f);
    }

    public static float getScaler() {
        return 0.8F;
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraPsittacosaurus entity) {
        return RenderPsittacosaurus.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraPsittacosaurus entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

    @Override
    protected void preRenderCallback(EntityPrehistoricFloraPsittacosaurus entity, float f) {
        float scale = entity.getAgeScale() * this.getScaler();
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = entity.width * scale * 0.35F;
    }

}