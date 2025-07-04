package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraPankowskichthys;
import net.lepidodendron.entity.model.entity.ModelPankowskichthys;
import net.lepidodendron.entity.render.RenderLivingBaseWithBook;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderPankowskichthys extends RenderLivingBaseWithBook<EntityPrehistoricFloraPankowskichthys> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/pankowskichthys.png");

    public RenderPankowskichthys(RenderManager mgr) {
        super(mgr, new ModelPankowskichthys(), 0.0f);
    }

    public static float getScaler() {return 0.18F; }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraPankowskichthys entity) {
        return RenderPankowskichthys.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraPankowskichthys entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

    @Override
    protected void preRenderCallback(EntityPrehistoricFloraPankowskichthys entity, float f) {
        float scale = this.getScaler();
        if (scale < 0.1f) {scale = 0.1f;}
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = entity.width * scale * 0.0F;
    }

}





