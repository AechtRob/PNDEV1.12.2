package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraTitanopteraGigatitan;
import net.lepidodendron.entity.model.entity.ModelTitanoptera;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.layers.LayerRenderer;
import net.minecraft.util.ResourceLocation;

public class LayerTitanopteraGigatitanWing implements LayerRenderer<EntityPrehistoricFloraTitanopteraGigatitan>
{
    private final RenderTitanopteraGigatitan TitanopteraGigatitanRenderer;
    private final ModelBase TitanopteraGigatitanModel = new ModelTitanoptera();
    private static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/titanoptera_gigatitan_wing.png");

    public LayerTitanopteraGigatitanWing(RenderTitanopteraGigatitan TitanopteraGigatitanRendererIn)
    {
        this.TitanopteraGigatitanRenderer = TitanopteraGigatitanRendererIn;
    }

    @Override
    public void doRenderLayer(EntityPrehistoricFloraTitanopteraGigatitan entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch, float scale)
    {
        if (!entitylivingbaseIn.isInvisible())
        {
            this.TitanopteraGigatitanRenderer.bindTexture(TEXTURE);
            GlStateManager.pushMatrix();
            GlStateManager.color(1.0F, 1.0F, 1.0F, 0.9F);
            GlStateManager.enableNormalize();
            GlStateManager.enableBlend();
            GlStateManager.blendFunc(GlStateManager.SourceFactor.SRC_ALPHA, GlStateManager.DestFactor.ONE_MINUS_SRC_ALPHA);
            this.TitanopteraGigatitanModel.setModelAttributes(this.TitanopteraGigatitanRenderer.getMainModel());
            this.TitanopteraGigatitanModel.setRotationAngles(limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch, scale, entitylivingbaseIn);
            this.TitanopteraGigatitanModel.render(entitylivingbaseIn, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch, scale);
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
