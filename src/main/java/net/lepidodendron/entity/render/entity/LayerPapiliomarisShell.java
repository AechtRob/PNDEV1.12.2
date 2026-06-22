package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraPapiliomaris;
import net.lepidodendron.entity.model.entity.ModelPapiliomaris;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.layers.LayerRenderer;
import net.minecraft.util.ResourceLocation;

public class LayerPapiliomarisShell implements LayerRenderer<EntityPrehistoricFloraPapiliomaris>
{
    private final RenderPapiliomaris papiliomarisRenderer;
    private final ModelBase papiliomarisModel = new ModelPapiliomaris();
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/papiliomaris_carapace.png");

    public LayerPapiliomarisShell(RenderPapiliomaris papiliomarisRendererIn)
    {
        this.papiliomarisRenderer = papiliomarisRendererIn;
    }

    @Override
    public void doRenderLayer(EntityPrehistoricFloraPapiliomaris entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch, float scale)
    {
        if (!entitylivingbaseIn.isInvisible())
        {
            this.papiliomarisRenderer.bindTexture(TEXTURE);
            GlStateManager.pushMatrix();
            GlStateManager.color(1.0F, 1.0F, 1.0F, 0.9F);
            GlStateManager.enableNormalize();
            GlStateManager.enableBlend();
            GlStateManager.blendFunc(GlStateManager.SourceFactor.SRC_ALPHA, GlStateManager.DestFactor.ONE_MINUS_SRC_ALPHA);
            this.papiliomarisRenderer.getMainModel().setModelAttributes(this.papiliomarisRenderer.getMainModel());
            this.papiliomarisRenderer.getMainModel().setRotationAngles(limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch, scale, entitylivingbaseIn);
            this.papiliomarisRenderer.getMainModel().render(entitylivingbaseIn, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch, scale);
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
