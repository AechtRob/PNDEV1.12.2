package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraLanxangichthys;
import net.lepidodendron.entity.model.entity.ModelLanxangichthys;
import net.lepidodendron.entity.render.RenderLivingBaseWithBook;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderLanxangichthys extends RenderLivingBaseWithBook<EntityPrehistoricFloraLanxangichthys> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/lanxangichthys.png");

    public static float getScaler() {
        return 0.27F;
    }
    public RenderLanxangichthys(RenderManager mgr) {
        super(mgr, new ModelLanxangichthys(), 0.0f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraLanxangichthys entity) {
        return RenderLanxangichthys.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraLanxangichthys entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }
    @Override
    protected void preRenderCallback(EntityPrehistoricFloraLanxangichthys entity, float f) {
        float scale = this.getScaler();
        if (scale < 0.1f) {
            scale = 0.1f;
        }
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = 0;
    }

}