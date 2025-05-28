package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraJuracimbrophlebia;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.layers.LayerRenderer;
import net.minecraft.util.ResourceLocation;

public class LayerJuracimbrophlebiaWing implements LayerRenderer<EntityPrehistoricFloraJuracimbrophlebia>
{
    private final RenderJuracimbrophlebia JuracimbrophlebiaRenderer;
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/juracimbrophlebia_wing.png");

    public LayerJuracimbrophlebiaWing(RenderJuracimbrophlebia JuracimbrophlebiaRendererIn)
    {
        this.JuracimbrophlebiaRenderer = JuracimbrophlebiaRendererIn;
    }

    @Override
    public void doRenderLayer(EntityPrehistoricFloraJuracimbrophlebia entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch, float scale)
    {
        if (!entitylivingbaseIn.isInvisible())
        {
            this.JuracimbrophlebiaRenderer.bindTexture(TEXTURE);
            GlStateManager.pushMatrix();
            GlStateManager.color(1.0F, 1.0F, 1.0F, 0.9F);
            GlStateManager.enableNormalize();
            GlStateManager.enableBlend();
            GlStateManager.blendFunc(GlStateManager.SourceFactor.SRC_ALPHA, GlStateManager.DestFactor.ONE_MINUS_SRC_ALPHA);
            this.JuracimbrophlebiaRenderer.getMainModel().setModelAttributes(this.JuracimbrophlebiaRenderer.getMainModel());
            this.JuracimbrophlebiaRenderer.getMainModel().setRotationAngles(limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch, scale, entitylivingbaseIn);
            this.JuracimbrophlebiaRenderer.getMainModel().render(entitylivingbaseIn, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch, scale);
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
