package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraTitanoptera;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.layers.LayerRenderer;
import net.minecraft.util.ResourceLocation;

public class LayerTitanopteraWing implements LayerRenderer<EntityPrehistoricFloraTitanoptera>
{
    private final RenderTitanoptera TitanopteraRenderer;

    public static final ResourceLocation TEXTURE_CLATROTITAN = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/titanoptera_clatrotitan_wing.png");
    public static final ResourceLocation TEXTURE_GIGATITAN = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/titanoptera_gigatitan_wing.png");
    public static final ResourceLocation TEXTURE_MESOTITAN = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/titanoptera_mesotitan_wing.png");

    public LayerTitanopteraWing(RenderTitanoptera TitanopteraRendererIn)
    {
        this.TitanopteraRenderer = TitanopteraRendererIn;
    }

    @Override
    public void doRenderLayer(EntityPrehistoricFloraTitanoptera entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch, float scale)
    {
        if (!entitylivingbaseIn.isInvisible())
        {
            switch (entitylivingbaseIn.getPNType()) {
                case CLATROTITAN: default:
                    this.TitanopteraRenderer.bindTexture(TEXTURE_CLATROTITAN);
                    break;

                case GIGATITAN:
                    this.TitanopteraRenderer.bindTexture(TEXTURE_GIGATITAN);
                    break;

                case MESOTITAN:
                    this.TitanopteraRenderer.bindTexture(TEXTURE_MESOTITAN);
                    break;


            }

            GlStateManager.pushMatrix();
            GlStateManager.color(1.0F, 1.0F, 1.0F, 0.9F);
            GlStateManager.enableNormalize();
            GlStateManager.enableBlend();
            GlStateManager.blendFunc(GlStateManager.SourceFactor.SRC_ALPHA, GlStateManager.DestFactor.ONE_MINUS_SRC_ALPHA);
            this.TitanopteraRenderer.getMainModel().setModelAttributes(this.TitanopteraRenderer.getMainModel());
            this.TitanopteraRenderer.getMainModel().setRotationAngles(limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch, scale, entitylivingbaseIn);
            this.TitanopteraRenderer.getMainModel().render(entitylivingbaseIn, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch, scale);
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
