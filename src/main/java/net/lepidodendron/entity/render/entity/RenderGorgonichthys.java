package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraGorgonichthys;
import net.lepidodendron.entity.model.entity.ModelGorgonichthys;
import net.lepidodendron.entity.render.RenderLivingBaseWithBook;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderGorgonichthys extends RenderLivingBaseWithBook<EntityPrehistoricFloraGorgonichthys> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/gorgonichthys.png");

    public static float getScaler() {
        return 1F;
    }
    public RenderGorgonichthys(RenderManager mgr) {
        super(mgr, new ModelGorgonichthys(), 0.0f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraGorgonichthys entity) {
        return RenderGorgonichthys.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraGorgonichthys entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }
    @Override
    protected void preRenderCallback(EntityPrehistoricFloraGorgonichthys entity, float f) {
        float scale = this.getScaler()*entity.getAgeScale();
        if (scale < 0.1f) {
            scale = 0.1f;
        }
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = 0;
    }

}