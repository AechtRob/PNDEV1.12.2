package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraMegateuthis;
import net.lepidodendron.entity.model.entity.ModelMegateuthis;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderMegateuthis extends RenderLiving<EntityPrehistoricFloraMegateuthis> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/megateuthis.png");

    public static float getScaler() {
        return 0.75F;
    }
    public RenderMegateuthis(RenderManager mgr) {
        super(mgr, new ModelMegateuthis(), 0.0f);
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
        float scale = this.getScaler()*entity.getAgeScale();
        if (scale < 0.1f) {
            scale = 0.1f;
        }
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = 0;
    }

}