package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraMetaspriggina;
import net.lepidodendron.entity.model.entity.ModelMetaspriggina;
import net.lepidodendron.entity.render.RenderLivingBaseWithBook;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderMetaspriggina extends RenderLivingBaseWithBook<EntityPrehistoricFloraMetaspriggina> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/metaspriggina.png");

    public RenderMetaspriggina(RenderManager mgr) {
        super(mgr, new ModelMetaspriggina(), 0.0f);
    }

    public static float getScaler() {
        return 0.25F;
    }
    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraMetaspriggina entity) {
        return RenderMetaspriggina.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraMetaspriggina entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

    @Override
    protected void preRenderCallback(EntityPrehistoricFloraMetaspriggina entity, float f) {
        float scale = this.getScaler();
        if (scale < 0.1f) {
            scale = 0.1f;
        }
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = 0;
    }

}