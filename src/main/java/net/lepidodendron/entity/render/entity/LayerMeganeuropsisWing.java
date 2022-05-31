package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraMeganeuropsis;
import net.lepidodendron.entity.model.entity.ModelMeganeuropsis;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.layers.LayerRenderer;
import net.minecraft.util.ResourceLocation;

public class LayerMeganeuropsisWing implements LayerRenderer<EntityPrehistoricFloraMeganeuropsis>
{
    private final RenderMeganeuropsis meganeuropsisRenderer;
    private final ModelBase meganeuropsisModel = new ModelMeganeuropsis();
    private static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/meganeuropsis_wing.png");

    public LayerMeganeuropsisWing(RenderMeganeuropsis meganeuropsisRendererIn)
    {
        this.meganeuropsisRenderer = meganeuropsisRendererIn;
    }

    @Override
    public void doRenderLayer(EntityPrehistoricFloraMeganeuropsis entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch, float scale)
    {
        if (!entitylivingbaseIn.isInvisible())
        {
            this.meganeuropsisRenderer.bindTexture(TEXTURE);
            GlStateManager.pushMatrix();
            GlStateManager.color(1.0F, 1.0F, 1.0F, 0.9F);
            GlStateManager.enableNormalize();
            GlStateManager.enableBlend();
            GlStateManager.blendFunc(GlStateManager.SourceFactor.SRC_ALPHA, GlStateManager.DestFactor.ONE_MINUS_SRC_ALPHA);
            this.meganeuropsisModel.setModelAttributes(this.meganeuropsisRenderer.getMainModel());
            this.meganeuropsisModel.setRotationAngles(limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch, scale, entitylivingbaseIn);
            this.meganeuropsisModel.render(entitylivingbaseIn, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch, scale);
            GlStateManager.disableBlend();
            GlStateManager.disableNormalize();
            GlStateManager.popMatrix();
        }
    }

    @Override
    public boolean shouldCombineTextures()
    {
        return true;
    }
}
