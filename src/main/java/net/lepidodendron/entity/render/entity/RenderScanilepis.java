package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraScanilepis;
import net.lepidodendron.entity.model.entity.ModelScanilepis;
import net.lepidodendron.entity.render.RenderLivingBaseWithBook;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderScanilepis extends RenderLivingBaseWithBook<EntityPrehistoricFloraScanilepis> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/scanilepis.png");

    public static float getScaler() {return 0.6808F;}
    public RenderScanilepis(RenderManager mgr) {
        super(mgr, new ModelScanilepis(), 0.0f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraScanilepis entity) {
        return RenderScanilepis.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraScanilepis entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }
    @Override
    protected void preRenderCallback(EntityPrehistoricFloraScanilepis entity, float f) {
        float scale = getScaler()*entity.getAgeScale();
        if (scale < 0.1f) {scale = 0.1f;}
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = entity.width * scale * 0F;
    }
}
