package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraYanornis;
import net.lepidodendron.entity.model.entity.ModelYanornis;
import net.lepidodendron.entity.render.RenderLivingBaseWithBook;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderYanornis extends RenderLivingBaseWithBook<EntityPrehistoricFloraYanornis> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/yanornis.png");

    public static float getScaler() {
        return 0.35F;
    }

    public RenderYanornis(RenderManager mgr) {
        super(mgr, new ModelYanornis(), 0.15f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraYanornis entity) {
        return RenderYanornis.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraYanornis entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
        float getOffset = 0.0F;
    }

    @Override
    protected void preRenderCallback(EntityPrehistoricFloraYanornis entity, float f) {
        float scale = entity.getAgeScale()*this.getScaler();
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = entity.width * scale * 0.5F;
    }

}





