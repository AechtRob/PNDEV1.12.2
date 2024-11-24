package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraTremaglaspis;
import net.lepidodendron.entity.model.entity.ModelTremaglaspis;
import net.lepidodendron.entity.render.RenderLivingBaseWithBook;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderTremaglaspis extends RenderLivingBaseWithBook<EntityPrehistoricFloraTremaglaspis> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/tremaglaspis.png");

    public static float getScaler() {return 0.15F;}

    public RenderTremaglaspis(RenderManager mgr) {
        super(mgr, new ModelTremaglaspis(), 0.0f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraTremaglaspis entity) {
        return RenderTremaglaspis.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraTremaglaspis entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }
    @Override
    protected void preRenderCallback(EntityPrehistoricFloraTremaglaspis entity, float f) {
        float scale = getScaler();
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = entity.width * scale * 0.00F;
    }


}


