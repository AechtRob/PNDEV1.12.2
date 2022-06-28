package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraProtozygoptera;
import net.lepidodendron.entity.model.entity.ModelProtozygoptera;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.layers.LayerRenderer;
import net.minecraft.util.ResourceLocation;

public class LayerProtozygopteraWing implements LayerRenderer<EntityPrehistoricFloraProtozygoptera>
{
    private final RenderProtozygoptera ProtozygopteraRenderer;
    private final ModelBase ProtozygopteraModel = new ModelProtozygoptera();
    private static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/protozygoptera_wing.png");

    public LayerProtozygopteraWing(RenderProtozygoptera ProtozygopteraRendererIn)
    {
        this.ProtozygopteraRenderer = ProtozygopteraRendererIn;
    }

    @Override
    public void doRenderLayer(EntityPrehistoricFloraProtozygoptera entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch, float scale)
    {
        if (!entitylivingbaseIn.isInvisible())
        {
            this.ProtozygopteraRenderer.bindTexture(TEXTURE);
            GlStateManager.pushMatrix();
            GlStateManager.color(1.0F, 1.0F, 1.0F, 0.9F);
            GlStateManager.enableNormalize();
            GlStateManager.enableBlend();
            GlStateManager.blendFunc(GlStateManager.SourceFactor.SRC_ALPHA, GlStateManager.DestFactor.ONE_MINUS_SRC_ALPHA);
            this.ProtozygopteraModel.setModelAttributes(this.ProtozygopteraRenderer.getMainModel());
            this.ProtozygopteraModel.setRotationAngles(limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch, scale, entitylivingbaseIn);
            this.ProtozygopteraModel.render(entitylivingbaseIn, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch, scale);
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
