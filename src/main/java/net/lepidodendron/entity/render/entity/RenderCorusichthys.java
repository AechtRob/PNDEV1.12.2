package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraCorusichthys;
import net.lepidodendron.entity.model.entity.ModelCorusichthys;
import net.lepidodendron.entity.render.RenderLivingBaseWithBook;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderCorusichthys extends RenderLivingBaseWithBook<EntityPrehistoricFloraCorusichthys> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/corusichthys.png");

    public RenderCorusichthys(RenderManager mgr) {
        super(mgr, new ModelCorusichthys(), 0.0f);
    }

    public static float getScaler() {return 0.15F; }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraCorusichthys entity) {
        return RenderCorusichthys.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraCorusichthys entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

    @Override
    protected void preRenderCallback(EntityPrehistoricFloraCorusichthys entity, float f) {
        float scale = this.getScaler();
        if (scale < 0.1f) {scale = 0.1f;}
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = entity.width * scale * 0.0F;
    }

}





