package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraEbenaqua;
import net.lepidodendron.entity.model.entity.ModelEbenaqua;
import net.lepidodendron.entity.render.RenderLivingBaseWithBook;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderEbenaqua extends RenderLivingBaseWithBook<EntityPrehistoricFloraEbenaqua> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/ebenaqua.png");

    public static float getScaler() {return 0.065F; }

    public RenderEbenaqua(RenderManager mgr) {
        super(mgr, new ModelEbenaqua(), 0.0f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraEbenaqua entity) {
        return RenderEbenaqua.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraEbenaqua entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

    @Override
    protected void preRenderCallback(EntityPrehistoricFloraEbenaqua entity, float f) {
        float scale = this.getScaler();
        if (scale < 0.1f) {scale = 0.1f;}
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = entity.width * scale * 0.0F;
    }

}