package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraThulaspis;
import net.lepidodendron.entity.model.entity.ModelThulaspis;
import net.lepidodendron.entity.render.RenderLivingBaseWithBook;
import net.lepidodendron.entity.render.tile.RenderDisplays;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderThulaspis extends RenderLivingBaseWithBook<EntityPrehistoricFloraThulaspis> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/thulaspis.png");
    public static float getScaler() {
        return 0.22F;
    }

    public RenderThulaspis(RenderManager mgr) {
        super(mgr, new ModelThulaspis(), RenderDisplays.modelThulaspisBook, 0.0f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraThulaspis entity) {
        return RenderThulaspis.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraThulaspis entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }
    @Override
    protected void preRenderCallback(EntityPrehistoricFloraThulaspis entity, float f) {
        float scale = this.getScaler();
        if (scale < 0.1f) {
            scale = 0.1f;
        }
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = 0;
    }

}
