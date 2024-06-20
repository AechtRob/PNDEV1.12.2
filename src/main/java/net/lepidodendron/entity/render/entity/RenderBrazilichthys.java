package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraBrazilichthys;
import net.lepidodendron.entity.model.entity.ModelBrazilichthys;
import net.lepidodendron.entity.render.RenderLivingBaseWithBook;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderBrazilichthys extends RenderLivingBaseWithBook<EntityPrehistoricFloraBrazilichthys> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/brazilichthys.png");

    public RenderBrazilichthys(RenderManager mgr) {
        super(mgr, new ModelBrazilichthys(), 0.0f);
    }

    public static float getScaler() {return 0.25F; }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraBrazilichthys entity) {
        return RenderBrazilichthys.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraBrazilichthys entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

    @Override
    protected void preRenderCallback(EntityPrehistoricFloraBrazilichthys entity, float f) {
        float scale = this.getScaler();
        GlStateManager.scale(scale, scale, scale);
    }
}