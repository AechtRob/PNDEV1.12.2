package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraPalaeoctenophora;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.layers.LayerRenderer;
import net.minecraft.util.ResourceLocation;

public class LayerPalaeoctenophoraBody implements LayerRenderer<EntityPrehistoricFloraPalaeoctenophora>
{
    private final RenderPalaeoctenophora PalaeoctenophoraRenderer;
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/palaeoctenophora_t.png");

    public LayerPalaeoctenophoraBody(RenderPalaeoctenophora PalaeoctenophoraRendererIn)
    {
        this.PalaeoctenophoraRenderer = PalaeoctenophoraRendererIn;
    }

    @Override
    public void doRenderLayer(EntityPrehistoricFloraPalaeoctenophora entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch, float scale)
    {
        if (!entitylivingbaseIn.isInvisible())
        {
            this.PalaeoctenophoraRenderer.bindTexture(TEXTURE);
            GlStateManager.pushMatrix();
            GlStateManager.color(1.0F, 1.0F, 1.0F, 0.9F);
            GlStateManager.enableNormalize();
            GlStateManager.enableBlend();
            GlStateManager.blendFunc(GlStateManager.SourceFactor.SRC_ALPHA, GlStateManager.DestFactor.ONE_MINUS_SRC_ALPHA);
            this.PalaeoctenophoraRenderer.getMainModel().setModelAttributes(this.PalaeoctenophoraRenderer.getMainModel());
            this.PalaeoctenophoraRenderer.getMainModel().setRotationAngles(limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch, scale, entitylivingbaseIn);
            this.PalaeoctenophoraRenderer.getMainModel().render(entitylivingbaseIn, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch, scale);
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
