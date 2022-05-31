package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraHaikouichthys;
import net.lepidodendron.entity.model.entity.ModelHaikouichthys;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.layers.LayerRenderer;
import net.minecraft.util.ResourceLocation;

public class LayerHaikouichthysFins implements LayerRenderer<EntityPrehistoricFloraHaikouichthys>
{
    private final RenderHaikouichthys haikouichthysRenderer;
    private final ModelBase haikouichthysModel = new ModelHaikouichthys();
    private static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/haikouichthys_transparent.png");

    public LayerHaikouichthysFins(RenderHaikouichthys haikouichthysRendererIn)
    {
        this.haikouichthysRenderer = haikouichthysRendererIn;
    }

    @Override
    public void doRenderLayer(EntityPrehistoricFloraHaikouichthys entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch, float scale)
    {
        if (!entitylivingbaseIn.isInvisible())
        {
            this.haikouichthysRenderer.bindTexture(TEXTURE);
            GlStateManager.pushMatrix();
            GlStateManager.color(1.0F, 1.0F, 1.0F, 0.85F);
            GlStateManager.enableNormalize();
            GlStateManager.enableBlend();
            GlStateManager.blendFunc(GlStateManager.SourceFactor.SRC_ALPHA, GlStateManager.DestFactor.ONE_MINUS_SRC_ALPHA);
            this.haikouichthysModel.setModelAttributes(this.haikouichthysRenderer.getMainModel());
            this.haikouichthysModel.setRotationAngles(limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch, scale, entitylivingbaseIn);
            this.haikouichthysModel.render(entitylivingbaseIn, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch, scale);
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
