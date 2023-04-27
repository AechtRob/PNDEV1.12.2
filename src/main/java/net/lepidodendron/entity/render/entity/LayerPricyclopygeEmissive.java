package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraPricyclopyge;
import net.lepidodendron.entity.model.entity.ModelPricyclopyge;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.layers.LayerRenderer;
import net.minecraft.util.ResourceLocation;

public class LayerPricyclopygeEmissive implements LayerRenderer<EntityPrehistoricFloraPricyclopyge>
{
    private final RenderPricyclopyge PricyclopygeRenderer;
    private final ModelBase PricyclopygeModel = new ModelPricyclopyge();
    private static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/pricyclopyge_glow.png");

    public LayerPricyclopygeEmissive(RenderPricyclopyge PricyclopygeRendererIn)
    {
        this.PricyclopygeRenderer = PricyclopygeRendererIn;
    }

    @Override
    public void doRenderLayer(EntityPrehistoricFloraPricyclopyge entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch, float scale)
    {
        if (!entitylivingbaseIn.isInvisible())
        {
            this.PricyclopygeRenderer.bindTexture(TEXTURE);
            GlStateManager.pushMatrix();
            GlStateManager.color(1.0F, 1.0F, 1.0F, 0.9F);
            GlStateManager.enableNormalize();
            GlStateManager.enableBlend();
            GlStateManager.blendFunc(GlStateManager.SourceFactor.SRC_ALPHA, GlStateManager.DestFactor.ONE_MINUS_SRC_ALPHA);
            this.PricyclopygeModel.setModelAttributes(this.PricyclopygeRenderer.getMainModel());
            this.PricyclopygeModel.setRotationAngles(limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch, scale, entitylivingbaseIn);
            this.PricyclopygeModel.render(entitylivingbaseIn, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch, scale);
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
