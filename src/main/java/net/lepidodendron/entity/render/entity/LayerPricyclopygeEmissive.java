package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraPricyclopyge;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.OpenGlHelper;
import net.minecraft.client.renderer.entity.layers.LayerRenderer;
import net.minecraft.util.ResourceLocation;

public class LayerPricyclopygeEmissive implements LayerRenderer<EntityPrehistoricFloraPricyclopyge>
{
    private final RenderPricyclopyge PricyclopygeRenderer;
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
            GlStateManager.enableBlend();
            GlStateManager.disableAlpha();
            GlStateManager.blendFunc(GlStateManager.SourceFactor.ONE, GlStateManager.DestFactor.ONE);
            if (entitylivingbaseIn.isInvisible())
            {
                GlStateManager.depthMask(false);
            }
            else
            {
                GlStateManager.depthMask(true);
            }

            int i = 61680;
            int j = i % 65536;
            int k = i / 65536;
            OpenGlHelper.setLightmapTextureCoords(OpenGlHelper.lightmapTexUnit, (float)j, (float)k);
            GlStateManager.color(1.0F, 1.0F, 1.0F, 1.0F);
            Minecraft.getMinecraft().entityRenderer.setupFogColor(true);
            this.PricyclopygeRenderer.getMainModel().setModelAttributes(this.PricyclopygeRenderer.getMainModel());
            this.PricyclopygeRenderer.getMainModel().setRotationAngles(limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch, scale, entitylivingbaseIn);
            this.PricyclopygeRenderer.getMainModel().render(entitylivingbaseIn, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch, scale);
            Minecraft.getMinecraft().entityRenderer.setupFogColor(false);
            i = entitylivingbaseIn.getBrightnessForRender();
            j = i % 65536;
            k = i / 65536;
            OpenGlHelper.setLightmapTextureCoords(OpenGlHelper.lightmapTexUnit, (float)j, (float)k);
            this.PricyclopygeRenderer.setLightmap(entitylivingbaseIn);
            GlStateManager.disableBlend();
            GlStateManager.enableAlpha();
            GlStateManager.popMatrix();
        }
    }

    @Override
    public boolean shouldCombineTextures()
    {
        return false;
    }
}
