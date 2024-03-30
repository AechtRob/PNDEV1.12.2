package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraArchaeocydippida;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.layers.LayerRenderer;
import net.minecraft.util.ResourceLocation;

public class LayerArchaeocydippidaBody implements LayerRenderer<EntityPrehistoricFloraArchaeocydippida>
{
    private final RenderArchaeocydippida ArchaeocydippidaRenderer;
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/archaeocydippida_t.png");

    public LayerArchaeocydippidaBody(RenderArchaeocydippida ArchaeocydippidaRendererIn)
    {
        this.ArchaeocydippidaRenderer = ArchaeocydippidaRendererIn;
    }

    @Override
    public void doRenderLayer(EntityPrehistoricFloraArchaeocydippida entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch, float scale)
    {
        if (!entitylivingbaseIn.isInvisible())
        {
            this.ArchaeocydippidaRenderer.bindTexture(TEXTURE);
            GlStateManager.pushMatrix();
            GlStateManager.color(1.0F, 1.0F, 1.0F, 0.9F);
            GlStateManager.enableNormalize();
            GlStateManager.enableBlend();
            GlStateManager.blendFunc(GlStateManager.SourceFactor.SRC_ALPHA, GlStateManager.DestFactor.ONE_MINUS_SRC_ALPHA);
            this.ArchaeocydippidaRenderer.getMainModel().setModelAttributes(this.ArchaeocydippidaRenderer.getMainModel());
            this.ArchaeocydippidaRenderer.getMainModel().setRotationAngles(limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch, scale, entitylivingbaseIn);
            this.ArchaeocydippidaRenderer.getMainModel().render(entitylivingbaseIn, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch, scale);
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
