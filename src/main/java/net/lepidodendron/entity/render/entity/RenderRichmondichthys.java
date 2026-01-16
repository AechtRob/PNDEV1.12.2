package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraRichmondichthys;
import net.lepidodendron.entity.model.entity.ModelRichmondichthys;
import net.lepidodendron.entity.render.RenderLivingBaseWithBook;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderRichmondichthys extends RenderLivingBaseWithBook<EntityPrehistoricFloraRichmondichthys> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/richmondichthys.png");

    public static float getScaler() {
        return 0.5F;
    }
    public RenderRichmondichthys(RenderManager mgr) {
        super(mgr, new ModelRichmondichthys(), 0.0f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraRichmondichthys entity) {
        return RenderRichmondichthys.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraRichmondichthys entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }
    @Override
    protected void preRenderCallback(EntityPrehistoricFloraRichmondichthys entity, float f) {
        float scale = this.getScaler() * entity.getAgeScale();
        if (scale < 0.1f) {
            scale = 0.1f;
        }
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = 0;
    }

}