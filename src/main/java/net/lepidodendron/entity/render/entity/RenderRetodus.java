package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraRetodus;
import net.lepidodendron.entity.model.entity.ModelRetodus;
import net.lepidodendron.entity.render.RenderLivingBaseWithBook;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderRetodus extends RenderLivingBaseWithBook<EntityPrehistoricFloraRetodus> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/retodus.png");

    public static float getScaler() {return 0.8F;}
    public RenderRetodus(RenderManager mgr) {
        super(mgr, new ModelRetodus(), 0.0f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraRetodus entity) {
        return RenderRetodus.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraRetodus entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }
    @Override
    protected void preRenderCallback(EntityPrehistoricFloraRetodus entity, float f) {
        float scale = entity.getAgeScale() * getScaler();
        if (scale < 0.1f) {
            scale = 0.1f;
        }
        GlStateManager.scale(scale, scale, scale);
        //this.shadowSize = entity.width * scale * 0.45F;
    }
}