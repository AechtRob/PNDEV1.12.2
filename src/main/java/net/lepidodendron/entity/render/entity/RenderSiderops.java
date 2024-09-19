package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraSiderops;
import net.lepidodendron.entity.model.entity.ModelSiderops;
import net.lepidodendron.entity.render.RenderLivingBaseWithBook;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderSiderops extends RenderLivingBaseWithBook<EntityPrehistoricFloraSiderops> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/siderops.png");

    public RenderSiderops(RenderManager mgr) {
        super(mgr, new ModelSiderops(), 0.4f);
    }
    public static float getScaler() {
        return 0.75f;
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraSiderops entity) {
        return RenderSiderops.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraSiderops entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

    @Override
    protected void preRenderCallback(EntityPrehistoricFloraSiderops entity, float f) {
        float scale = entity.getAgeScale() * this.getScaler();
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = entity.width * scale * 0.275F;
    }

}