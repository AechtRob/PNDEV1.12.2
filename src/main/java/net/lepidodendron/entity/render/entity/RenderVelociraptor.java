package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraVelociraptor;
import net.lepidodendron.entity.model.entity.ModelVelociraptor;
import net.lepidodendron.entity.render.RenderLivingBaseWithBook;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderVelociraptor extends RenderLivingBaseWithBook<EntityPrehistoricFloraVelociraptor> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/velociraptor.png");

    public static float getScaler() {
        return 0.495F;
    }
    public RenderVelociraptor(RenderManager mgr) {
        super(mgr, new ModelVelociraptor(), 0.0f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraVelociraptor entity) {
        return RenderVelociraptor.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraVelociraptor entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }
    @Override
    protected void preRenderCallback(EntityPrehistoricFloraVelociraptor entity, float f) {
        float scale = this.getScaler()*entity.getAgeScale();
        if (scale < 0.1f) {
            scale = 0.1f;
        }
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = 0;
    }

}