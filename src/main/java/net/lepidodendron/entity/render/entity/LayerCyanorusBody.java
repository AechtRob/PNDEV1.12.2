package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraCyanorus;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.layers.LayerRenderer;
import net.minecraft.util.ResourceLocation;

public class LayerCyanorusBody implements LayerRenderer<EntityPrehistoricFloraCyanorus>
{
    private final RenderCyanorus CyanorusRenderer;
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/cyanorus_body.png");

    public LayerCyanorusBody(RenderCyanorus CyanorusRendererIn)
    {
        this.CyanorusRenderer = CyanorusRendererIn;
    }

    @Override
    public void doRenderLayer(EntityPrehistoricFloraCyanorus entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch, float scale)
    {
        if (!entitylivingbaseIn.isInvisible())
        {
            this.CyanorusRenderer.bindTexture(TEXTURE);
            GlStateManager.pushMatrix();
            GlStateManager.color(1.0F, 1.0F, 1.0F, 0.55F);
            GlStateManager.enableNormalize();
            GlStateManager.enableBlend();
            GlStateManager.blendFunc(GlStateManager.SourceFactor.SRC_ALPHA, GlStateManager.DestFactor.ONE_MINUS_SRC_ALPHA);
            this.CyanorusRenderer.getMainModel().setModelAttributes(this.CyanorusRenderer.getMainModel());
            this.CyanorusRenderer.getMainModel().setRotationAngles(limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch, scale, entitylivingbaseIn);
            this.CyanorusRenderer.getMainModel().render(entitylivingbaseIn, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch, scale);
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
