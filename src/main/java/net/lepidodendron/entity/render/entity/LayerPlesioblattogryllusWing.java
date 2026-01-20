package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraPlesioblattogryllus;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.layers.LayerRenderer;
import net.minecraft.util.ResourceLocation;

public class LayerPlesioblattogryllusWing implements LayerRenderer<EntityPrehistoricFloraPlesioblattogryllus>
{
    private final RenderPlesioblattogryllus PlesioblattogryllusRenderer;
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/plesioblattogryllus_transparent.png");

    public LayerPlesioblattogryllusWing(RenderPlesioblattogryllus PlesioblattogryllusRendererIn)
    {
        this.PlesioblattogryllusRenderer = PlesioblattogryllusRendererIn;
    }

    @Override
    public void doRenderLayer(EntityPrehistoricFloraPlesioblattogryllus entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch, float scale)
    {
        if (!entitylivingbaseIn.isInvisible())
        {
            this.PlesioblattogryllusRenderer.bindTexture(TEXTURE);
            GlStateManager.pushMatrix();
            GlStateManager.color(1.0F, 1.0F, 1.0F, 0.75F);
            GlStateManager.enableNormalize();
            GlStateManager.enableBlend();
            GlStateManager.blendFunc(GlStateManager.SourceFactor.SRC_ALPHA, GlStateManager.DestFactor.ONE_MINUS_SRC_ALPHA);
            this.PlesioblattogryllusRenderer.getMainModel().setModelAttributes(this.PlesioblattogryllusRenderer.getMainModel());
            this.PlesioblattogryllusRenderer.getMainModel().setRotationAngles(limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch, scale, entitylivingbaseIn);
            this.PlesioblattogryllusRenderer.getMainModel().render(entitylivingbaseIn, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch, scale);
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
