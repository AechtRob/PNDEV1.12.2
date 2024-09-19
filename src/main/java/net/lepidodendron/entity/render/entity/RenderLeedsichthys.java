package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraLeedsichthys;
import net.lepidodendron.entity.model.entity.ModelLeedsichthys;
import net.lepidodendron.entity.render.RenderLivingBaseWithBook;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderLeedsichthys extends RenderLivingBaseWithBook<EntityPrehistoricFloraLeedsichthys> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/leedsichthys.png");

    public RenderLeedsichthys(RenderManager mgr) {
        super(mgr, new ModelLeedsichthys(), 0.3f);
    }

    public static float getScaler() {
        return 0.91F;
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraLeedsichthys entity) {
        return RenderLeedsichthys.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraLeedsichthys entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

    @Override
    protected void preRenderCallback(EntityPrehistoricFloraLeedsichthys entity, float f) {
        float scale = entity.getAgeScale() * this.getScaler();
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = entity.width * scale * 0.6F;
    }

}