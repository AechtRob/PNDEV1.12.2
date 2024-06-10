package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraParameteoraspis;
import net.lepidodendron.entity.model.entity.ModelParameteoraspis;
import net.lepidodendron.entity.render.RenderLivingBaseWithBook;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderParameteoraspis extends RenderLivingBaseWithBook<EntityPrehistoricFloraParameteoraspis> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/parameteoraspis.png");

    public static float getScaler() {
        return 0.95F * 0.4F;
    }
    public RenderParameteoraspis(RenderManager mgr) {
        super(mgr, new ModelParameteoraspis(), 0.0f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraParameteoraspis entity) {
        return RenderParameteoraspis.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraParameteoraspis entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }
    @Override
    protected void preRenderCallback(EntityPrehistoricFloraParameteoraspis entity, float f) {
        float scale = this.getScaler()*entity.getAgeScale();
        if (scale < 0.1f) {
            scale = 0.1f;
        }
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = 0;
    }

}