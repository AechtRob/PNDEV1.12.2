package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraTitanopteraMesotitan;
import net.lepidodendron.entity.model.entity.ModelTitanoptera;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.layers.LayerRenderer;
import net.minecraft.util.ResourceLocation;

public class LayerTitanopteraMesotitanWing implements LayerRenderer<EntityPrehistoricFloraTitanopteraMesotitan>
{
    private final RenderTitanopteraMesotitan TitanopteraMesotitanRenderer;
    private final ModelBase TitanopteraMesotitanModel = new ModelTitanoptera();
    private static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/titanoptera_mesotitan_wing.png");

    public LayerTitanopteraMesotitanWing(RenderTitanopteraMesotitan TitanopteraMesotitanRendererIn)
    {
        this.TitanopteraMesotitanRenderer = TitanopteraMesotitanRendererIn;
    }

    @Override
    public void doRenderLayer(EntityPrehistoricFloraTitanopteraMesotitan entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch, float scale)
    {
        if (!entitylivingbaseIn.isInvisible())
        {
            this.TitanopteraMesotitanRenderer.bindTexture(TEXTURE);
            GlStateManager.pushMatrix();
            GlStateManager.color(1.0F, 1.0F, 1.0F, 0.9F);
            GlStateManager.enableNormalize();
            GlStateManager.enableBlend();
            GlStateManager.blendFunc(GlStateManager.SourceFactor.SRC_ALPHA, GlStateManager.DestFactor.ONE_MINUS_SRC_ALPHA);
            this.TitanopteraMesotitanModel.setModelAttributes(this.TitanopteraMesotitanRenderer.getMainModel());
            this.TitanopteraMesotitanModel.setRotationAngles(limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch, scale, entitylivingbaseIn);
            this.TitanopteraMesotitanModel.render(entitylivingbaseIn, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch, scale);
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
