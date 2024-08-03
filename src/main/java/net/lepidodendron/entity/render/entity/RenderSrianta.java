package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraSrianta;
import net.lepidodendron.entity.model.entity.ModelSrianta;
import net.lepidodendron.entity.render.RenderLivingBaseWithBook;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderSrianta extends RenderLivingBaseWithBook<EntityPrehistoricFloraSrianta> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/srianta.png");

    public RenderSrianta(RenderManager mgr) {
        super(mgr, new ModelSrianta(), 0.05f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraSrianta entity) {
        return RenderSrianta.TEXTURE;
    }
    public static float getScaler() {return 0.27F;}

    @Override
    protected void applyRotations(EntityPrehistoricFloraSrianta entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

    protected void preRenderCallback(EntityPrehistoricFloraSrianta entity, float f) {
        float scale = this.getScaler();
        if (scale < 0.1f) {
            scale = 0.1f;
        }
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = 0;
    }
}