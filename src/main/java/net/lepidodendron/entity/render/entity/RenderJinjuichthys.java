package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraJinjuichthys;
import net.lepidodendron.entity.model.entity.ModelJinjuichthys;
import net.lepidodendron.entity.render.RenderLivingBaseWithBook;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderJinjuichthys extends RenderLivingBaseWithBook<EntityPrehistoricFloraJinjuichthys> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/jinjuichthys.png");

    public RenderJinjuichthys(RenderManager mgr) {
        super(mgr, new ModelJinjuichthys(), 0.0f);
    }

    public static float getScaler() {return 0.238F; }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraJinjuichthys entity) {
        return RenderJinjuichthys.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraJinjuichthys entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

    @Override
    protected void preRenderCallback(EntityPrehistoricFloraJinjuichthys entity, float f) {
        float scale = this.getScaler();
        if (scale < 0.1f) {scale = 0.1f;}
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = entity.width * scale * 0.0F;
    }

}