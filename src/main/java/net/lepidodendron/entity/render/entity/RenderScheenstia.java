package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraScheenstia;
import net.lepidodendron.entity.model.entity.ModelScheenstia;
import net.lepidodendron.entity.render.RenderLivingBaseWithBook;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderScheenstia extends RenderLivingBaseWithBook<EntityPrehistoricFloraScheenstia> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/scheenstia.png");

    public static float getScaler() {
        return 0.7F * 0.395F;
    }
    public RenderScheenstia(RenderManager mgr) {
        super(mgr, new ModelScheenstia(), 0.0f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraScheenstia entity) {
        return RenderScheenstia.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraScheenstia entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }
    @Override
    protected void preRenderCallback(EntityPrehistoricFloraScheenstia entity, float f) {
        float scale = this.getScaler();
        if (scale < 0.1f) {
            scale = 0.1f;
        }
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = 0;
    }

}