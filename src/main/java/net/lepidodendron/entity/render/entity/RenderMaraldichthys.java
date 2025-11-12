package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraMaraldichthys;
import net.lepidodendron.entity.model.entity.ModelMaraldichthys;
import net.lepidodendron.entity.render.RenderLivingBaseWithBook;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderMaraldichthys extends RenderLivingBaseWithBook<EntityPrehistoricFloraMaraldichthys> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/maraldichthys.png");

    public RenderMaraldichthys(RenderManager mgr) {
        super(mgr, new ModelMaraldichthys(), 0.0f);
    }

    public static float getScaler() {return 0.18F; }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraMaraldichthys entity) {
        return RenderMaraldichthys.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraMaraldichthys entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

    @Override
    protected void preRenderCallback(EntityPrehistoricFloraMaraldichthys entity, float f) {
        float scale = this.getScaler();
        if (scale < 0.1f) {scale = 0.1f;}
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = entity.width * scale * 0.0F;
    }

}





