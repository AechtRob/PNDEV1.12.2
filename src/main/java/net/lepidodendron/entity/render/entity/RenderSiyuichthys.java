package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraSiyuichthys;
import net.lepidodendron.entity.model.entity.ModelSiyuichthys;
import net.lepidodendron.entity.render.RenderLivingBaseWithBook;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderSiyuichthys extends RenderLivingBaseWithBook<EntityPrehistoricFloraSiyuichthys> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/siyuichthys.png");

    public RenderSiyuichthys(RenderManager mgr) {
        super(mgr, new ModelSiyuichthys(), 0.0f);
    }

    public static float getScaler() {return 0.23F; }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraSiyuichthys entity) {
        return RenderSiyuichthys.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraSiyuichthys entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

    @Override
    protected void preRenderCallback(EntityPrehistoricFloraSiyuichthys entity, float f) {
        float scale = this.getScaler();
        if (scale < 0.1f) {scale = 0.1f;}
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = entity.width * scale * 0.0F;
    }

}





