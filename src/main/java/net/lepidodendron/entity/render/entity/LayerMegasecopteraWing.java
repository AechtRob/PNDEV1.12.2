package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraMegasecoptera;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.layers.LayerRenderer;
import net.minecraft.util.ResourceLocation;

public class LayerMegasecopteraWing implements LayerRenderer<EntityPrehistoricFloraMegasecoptera>
{
    private final RenderMegasecoptera MegasecopteraRenderer;

    public static final ResourceLocation TEXTURE_SYLVOHYMEN = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/megasecoptera_sylvohymen_wing.png");

    public LayerMegasecopteraWing(RenderMegasecoptera MegasecopteraRendererIn)
    {
        this.MegasecopteraRenderer = MegasecopteraRendererIn;
    }

    @Override
    public void doRenderLayer(EntityPrehistoricFloraMegasecoptera entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch, float scale)
    {
        if (!entitylivingbaseIn.isInvisible())
        {
            switch (entitylivingbaseIn.getPNType()) {
                case SYLVOHYMEN: default:
                    this.MegasecopteraRenderer.bindTexture(TEXTURE_SYLVOHYMEN);
                    break;
            }

            GlStateManager.pushMatrix();
            GlStateManager.color(1.0F, 1.0F, 1.0F, 0.9F);
            GlStateManager.enableNormalize();
            GlStateManager.enableBlend();
            GlStateManager.blendFunc(GlStateManager.SourceFactor.SRC_ALPHA, GlStateManager.DestFactor.ONE_MINUS_SRC_ALPHA);
            this.MegasecopteraRenderer.getModelFromArray(entitylivingbaseIn).setModelAttributes(this.MegasecopteraRenderer.getModelFromArray(entitylivingbaseIn));
            this.MegasecopteraRenderer.getModelFromArray(entitylivingbaseIn).setRotationAngles(limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch, scale, entitylivingbaseIn);
            this.MegasecopteraRenderer.getModelFromArray(entitylivingbaseIn).render(entitylivingbaseIn, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch, scale);
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
