package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraMegalichthys;
import net.lepidodendron.entity.model.entity.ModelMegalichthys;
import net.lepidodendron.entity.render.RenderLivingBaseWithBook;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderMegalichthys extends RenderLivingBaseWithBook<EntityPrehistoricFloraMegalichthys> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/megalichthys.png");

    public RenderMegalichthys(RenderManager mgr) {
        super(mgr, new ModelMegalichthys(), 0.0f);
    }

    public static float getScaler() {return 0.5F; }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraMegalichthys entity) {
        return RenderMegalichthys.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraMegalichthys entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

    @Override
    protected void preRenderCallback(EntityPrehistoricFloraMegalichthys entity, float f) {
        float scale = this.getScaler();
        GlStateManager.scale(scale, scale, scale);
    }
}