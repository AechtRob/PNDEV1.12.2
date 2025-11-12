package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraHayolperichthys;
import net.lepidodendron.entity.model.entity.ModelHayolperichthys;
import net.lepidodendron.entity.render.RenderLivingBaseWithBook;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderHayolperichthys extends RenderLivingBaseWithBook<EntityPrehistoricFloraHayolperichthys> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/hayolperichthys.png");

    public RenderHayolperichthys(RenderManager mgr) {
        super(mgr, new ModelHayolperichthys(), 0.0f);
    }

    public static float getScaler() {return 0.18F; }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraHayolperichthys entity) {
        return RenderHayolperichthys.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraHayolperichthys entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

    @Override
    protected void preRenderCallback(EntityPrehistoricFloraHayolperichthys entity, float f) {
        float scale = this.getScaler();
        if (scale < 0.1f) {scale = 0.1f;}
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = entity.width * scale * 0.0F;
    }

}





