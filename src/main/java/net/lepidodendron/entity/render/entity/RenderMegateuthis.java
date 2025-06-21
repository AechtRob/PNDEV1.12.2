package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraMegateuthis;
import net.lepidodendron.entity.model.entity.ModelMegateuthis;
import net.lepidodendron.entity.render.RenderLivingBaseWithBook;
import net.lepidodendron.entity.render.tile.RenderDisplays;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderMegateuthis extends RenderLivingBaseWithBook<EntityPrehistoricFloraMegateuthis> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/megateuthis.png");

    public RenderMegateuthis(RenderManager mgr) {
        super(mgr, new ModelMegateuthis(), RenderDisplays.modelMegateuthis, 0.3f);
    }

    public static float getScaler() {
        return 0.832F;
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraMegateuthis entity) {
        return RenderMegateuthis.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraMegateuthis entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

    @Override
    protected void preRenderCallback(EntityPrehistoricFloraMegateuthis entity, float f) {
        float scale = entity.getAgeScale() * this.getScaler();
        GlStateManager.scale(scale, scale, scale);
        GlStateManager.rotate(entity.getRotationAngle(), 0, 1, 0);
        this.shadowSize = entity.width * scale * 0.6F;
    }

}