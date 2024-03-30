package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraTarracodiscus;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.layers.LayerRenderer;
import net.minecraft.util.ResourceLocation;

public class LayerTarracodiscusCap implements LayerRenderer<EntityPrehistoricFloraTarracodiscus>
{
    private final RenderTarracodiscus TarracodiscusRenderer;
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/tarracodiscus_t.png");

    public LayerTarracodiscusCap(RenderTarracodiscus TarracodiscusRendererIn)
    {
        this.TarracodiscusRenderer = TarracodiscusRendererIn;
    }

    @Override
    public void doRenderLayer(EntityPrehistoricFloraTarracodiscus entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch, float scale)
    {
        if (!entitylivingbaseIn.isInvisible())
        {
            this.TarracodiscusRenderer.bindTexture(TEXTURE);
            GlStateManager.pushMatrix();
            GlStateManager.color(1.0F, 1.0F, 1.0F, 0.9F);
            GlStateManager.enableNormalize();
            GlStateManager.enableBlend();
            GlStateManager.blendFunc(GlStateManager.SourceFactor.SRC_ALPHA, GlStateManager.DestFactor.ONE_MINUS_SRC_ALPHA);
            this.TarracodiscusRenderer.getMainModel().setModelAttributes(this.TarracodiscusRenderer.getMainModel());
            this.TarracodiscusRenderer.getMainModel().setRotationAngles(limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch, scale, entitylivingbaseIn);
            this.TarracodiscusRenderer.getMainModel().render(entitylivingbaseIn, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch, scale);
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
