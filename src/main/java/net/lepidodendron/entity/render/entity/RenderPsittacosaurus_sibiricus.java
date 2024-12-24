package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraPsittacosaurus_sibiricus;
import net.lepidodendron.entity.model.entity.ModelPsittacosaurus_sibiricus;
import net.lepidodendron.entity.render.RenderLivingBaseWithBook;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderPsittacosaurus_sibiricus extends RenderLivingBaseWithBook<EntityPrehistoricFloraPsittacosaurus_sibiricus> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/psittacosaurus_sibiricus.png");

    public RenderPsittacosaurus_sibiricus(RenderManager mgr) {
        super(mgr, new ModelPsittacosaurus_sibiricus(), 0.3f);
    }

    public static float getScaler() {
        return 0.8F;
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraPsittacosaurus_sibiricus entity) {
        return RenderPsittacosaurus_sibiricus.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraPsittacosaurus_sibiricus entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

    @Override
    protected void preRenderCallback(EntityPrehistoricFloraPsittacosaurus_sibiricus entity, float f) {
        float scale = entity.getAgeScale() * this.getScaler();
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = entity.width * scale * 0.35F;
    }

}