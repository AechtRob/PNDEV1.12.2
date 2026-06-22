package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraEusarcana;
import net.lepidodendron.entity.EntityPrehistoricFloraRhinocarcinosoma;
import net.lepidodendron.entity.model.entity.ModelEusarcana;
import net.lepidodendron.entity.model.entity.ModelRhinocarcinosoma;
import net.lepidodendron.entity.render.RenderLivingBaseWithBook;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderRhinocarcinosoma extends RenderLivingBaseWithBook<EntityPrehistoricFloraRhinocarcinosoma> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/rhinocarcinosoma.png");

    public static float getScaler() {
        return 0.23F;
    }
    public RenderRhinocarcinosoma(RenderManager mgr) {super(mgr, new ModelRhinocarcinosoma(), 0.0f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraRhinocarcinosoma entity) {
        return RenderRhinocarcinosoma.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraRhinocarcinosoma entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }
    @Override
    protected void preRenderCallback(EntityPrehistoricFloraRhinocarcinosoma entity, float f) {
        float scale = this.getScaler() * entity.getAgeScale();
        if (scale < 0.1f) {
            scale = 0.1f;
        }
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = 0;
    }

}