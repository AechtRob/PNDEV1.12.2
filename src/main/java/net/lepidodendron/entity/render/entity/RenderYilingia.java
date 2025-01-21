package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraYilingia;
import net.lepidodendron.entity.EntityPrehistoricFloraYorgia;
import net.lepidodendron.entity.model.entity.ModelYilingia;
import net.lepidodendron.entity.render.RenderLivingBaseWithBook;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderYilingia extends RenderLivingBaseWithBook<EntityPrehistoricFloraYilingia> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/yilingia.png");

    public RenderYilingia(RenderManager mgr) {
        super(mgr, new ModelYilingia(), 0.0f);
    }

    public static float getScaler() {
        return 0.135F;
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraYilingia entity) {
        return RenderYilingia.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraYilingia entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

    @Override
    protected void preRenderCallback(EntityPrehistoricFloraYilingia entity, float f) {
        float scale = this.getScaler();
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = entity.width * scale * 0.0F;
    }

}