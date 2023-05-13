package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraTitanoptera;
import net.lepidodendron.entity.model.entity.ModelTitanoptera;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.layers.LayerRenderer;
import net.minecraft.util.ResourceLocation;

public class LayerTitanopteraWing implements LayerRenderer<EntityPrehistoricFloraTitanoptera>
{
    private final RenderTitanoptera TitanopteraRenderer;

    private static final ResourceLocation TEXTURE_CLATROTITAN = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/titanoptera_clatrotitan_wing.png");
    private static final ResourceLocation TEXTURE_GIGATITAN = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/titanoptera_gigatitan_wing.png");
    private static final ResourceLocation TEXTURE_MESOTITAN = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/titanoptera_mesotitan_wing.png");

    private static final ModelBase MODEL_TITANOPTERA = new ModelTitanoptera();

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
            this.getEntityModel(entitylivingbaseIn).setModelAttributes(this.TitanopteraRenderer.getMainModel());
            this.getEntityModel(entitylivingbaseIn).setRotationAngles(limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch, scale, entitylivingbaseIn);
            this.getEntityModel(entitylivingbaseIn).render(entitylivingbaseIn, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch, scale);
            GlStateManager.disableBlend();
            GlStateManager.disableNormalize();
            GlStateManager.popMatrix();
        }
    }

    public ModelBase getEntityModel(EntityPrehistoricFloraTitanoptera entity) {
        return MODEL_TITANOPTERA;
    }

    @Override
    public boolean shouldCombineTextures()
    {
        return true;
    }
}
