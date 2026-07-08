package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraEromangateuthis;
import net.lepidodendron.entity.model.entity.ModelEromangateuthis;
import net.lepidodendron.entity.render.RenderLivingBaseWithBook;
import net.lepidodendron.entity.render.tile.RenderDisplays;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderEromangateuthis extends RenderLivingBaseWithBook<EntityPrehistoricFloraEromangateuthis> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/eromangateuthis.png");

    public RenderEromangateuthis(RenderManager mgr) {
        super(mgr, new ModelEromangateuthis(), RenderDisplays.modelEromangateuthis, 0.3f);
    }

    public static float getScaler() {
        return 0.624F;
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraEromangateuthis entity) {
        return RenderEromangateuthis.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraEromangateuthis entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

    @Override
    protected void preRenderCallback(EntityPrehistoricFloraEromangateuthis entity, float f) {
        float scale = entity.getAgeScale() * this.getScaler();
        GlStateManager.scale(scale, scale, scale);
        GlStateManager.rotate(entity.getRotationAngle(), 0, 1, 0);
        this.shadowSize = entity.width * scale * 0.6F;
    }

}