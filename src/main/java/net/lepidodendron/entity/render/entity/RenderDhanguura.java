package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraDhanguura;
import net.lepidodendron.entity.model.entity.ModelDhanguura;
import net.lepidodendron.entity.render.RenderLivingBaseWithBook;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderDhanguura extends RenderLivingBaseWithBook<EntityPrehistoricFloraDhanguura> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/dhanguura.png");

    public static float getScaler() {
        return 0.9F;
    }
    public RenderDhanguura(RenderManager mgr) {
        super(mgr, new ModelDhanguura(), 0.0f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraDhanguura entity) {
        return RenderDhanguura.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraDhanguura entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }
    @Override
    protected void preRenderCallback(EntityPrehistoricFloraDhanguura entity, float f) {
        float scale = this.getScaler()*entity.getAgeScale();
        if (scale < 0.1f) {
            scale = 0.1f;
        }
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = 0;
    }

}