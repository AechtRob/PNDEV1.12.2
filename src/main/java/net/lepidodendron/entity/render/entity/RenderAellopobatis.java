package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraAellopobatis;
import net.lepidodendron.entity.model.entity.ModelAellopobatis;
import net.lepidodendron.entity.render.RenderLivingBaseWithBook;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderAellopobatis extends RenderLivingBaseWithBook<EntityPrehistoricFloraAellopobatis> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/aellopobatis.png");

    public RenderAellopobatis(RenderManager mgr) {
        super(mgr, new ModelAellopobatis(), 0.0f);
    }

    public static float getScaler() {return 0.3F; }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraAellopobatis entity) {
        return RenderAellopobatis.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraAellopobatis entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

    @Override
    protected void preRenderCallback(EntityPrehistoricFloraAellopobatis entity, float f) {
        float scale = this.getScaler();
        if (scale < 0.1f) {scale = 0.1f;}
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = entity.width * scale * 0.0F;
    }

}





