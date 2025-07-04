package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraPrionolepis;
import net.lepidodendron.entity.model.entity.ModelPrionolepis;
import net.lepidodendron.entity.render.RenderLivingBaseWithBook;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderPrionolepis extends RenderLivingBaseWithBook<EntityPrehistoricFloraPrionolepis> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/prionolepis.png");

    public RenderPrionolepis(RenderManager mgr) {
        super(mgr, new ModelPrionolepis(), 0.0f);
    }

    public static float getScaler() {return 0.32F; }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraPrionolepis entity) {
        return RenderPrionolepis.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraPrionolepis entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

    @Override
    protected void preRenderCallback(EntityPrehistoricFloraPrionolepis entity, float f) {
        float scale = this.getScaler();
        if (scale < 0.1f) {scale = 0.1f;}
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = entity.width * scale * 0.0F;
    }

}





