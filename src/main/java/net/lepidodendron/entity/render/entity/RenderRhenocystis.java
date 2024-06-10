package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraRhenocystis;
import net.lepidodendron.entity.model.entity.ModelRhenocystis;
import net.lepidodendron.entity.render.RenderLivingBaseWithBook;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderRhenocystis extends RenderLivingBaseWithBook<EntityPrehistoricFloraRhenocystis> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/rhenocystis.png");

    public static float getScaler() {
        return 0.7F * 0.3F;
    }
    public RenderRhenocystis(RenderManager mgr) {
        super(mgr, new ModelRhenocystis(), 0.0f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraRhenocystis entity) {
        return RenderRhenocystis.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraRhenocystis entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }
    @Override
    protected void preRenderCallback(EntityPrehistoricFloraRhenocystis entity, float f) {
        float scale = this.getScaler();
        if (scale < 0.1f) {
            scale = 0.1f;
        }
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = 0;
    }

}