package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraApankura;
import net.lepidodendron.entity.model.entity.ModelApankura;
import net.lepidodendron.entity.render.RenderLivingBaseWithBook;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderApankura extends RenderLivingBaseWithBook<EntityPrehistoricFloraApankura> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/apankura.png");
    public static float getScaler() {
        return 0.22F;
    }

    public RenderApankura(RenderManager mgr) {
        super(mgr, new ModelApankura(), 0.0f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraApankura entity) {
        return RenderApankura.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraApankura entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

    @Override
    protected void preRenderCallback(EntityPrehistoricFloraApankura entity, float f) {
        float scale = this.getScaler();
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = 0;
    }

}