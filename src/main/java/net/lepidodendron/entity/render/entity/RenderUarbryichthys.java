package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraUarbryichthys;
import net.lepidodendron.entity.model.entity.ModelUarbryichthys;
import net.lepidodendron.entity.render.RenderLivingBaseWithBook;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderUarbryichthys extends RenderLivingBaseWithBook<EntityPrehistoricFloraUarbryichthys> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/uarbryichthys.png");

    public static float getScaler() {
        return 0.7F * 0.3F;
    }
    public RenderUarbryichthys(RenderManager mgr) {
        super(mgr, new ModelUarbryichthys(), 0.0f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraUarbryichthys entity) {
        return RenderUarbryichthys.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraUarbryichthys entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }
    @Override
    protected void preRenderCallback(EntityPrehistoricFloraUarbryichthys entity, float f) {
        float scale = this.getScaler();
        if (scale < 0.1f) {
            scale = 0.1f;
        }
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = 0;
    }

}