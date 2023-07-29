package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraEchinochimaera;
import net.lepidodendron.entity.model.entity.ModelEchinochimaera;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderEchinochimaera extends RenderLiving<EntityPrehistoricFloraEchinochimaera> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/echinochimaera_male.png");
    public static final ResourceLocation TEXTURE_F = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/echinochimaera_female.png");

    public static float getScaler() {
        return 0.24F;
    }
    public RenderEchinochimaera(RenderManager mgr) {
        super(mgr, new ModelEchinochimaera(), 0.0f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraEchinochimaera entity) {
        switch (entity.getPNType()) {
            case MALE:
            default:
                return TEXTURE;

            case FEMALE:
                return TEXTURE_F;
        }
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraEchinochimaera entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }
    @Override
    protected void preRenderCallback(EntityPrehistoricFloraEchinochimaera entity, float f) {
        float scale = this.getScaler() * entity.getAgeScale();
        if (entity.getPNType() == EntityPrehistoricFloraEchinochimaera.Type.FEMALE) {
            scale = this.getScaler() * 0.6F;
        }
        if (scale < 0.1f) {
            scale = 0.1f;
        }
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = 0;
    }

}