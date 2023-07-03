package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraDragonfly;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.layers.LayerRenderer;
import net.minecraft.util.ResourceLocation;

public class LayerDragonflyWing implements LayerRenderer<EntityPrehistoricFloraDragonfly>
{
    private final RenderDragonfly DragonflyRenderer;

    public static final ResourceLocation TEXTURE_DRAGONFLY1 = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/dragonfly1_wing.png");
    public static final ResourceLocation TEXTURE_DRAGONFLY2 = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/dragonfly2_wing.png");
    public static final ResourceLocation TEXTURE_DRAGONFLY3 = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/dragonfly3_wing.png");
    public static final ResourceLocation TEXTURE_DRAGONFLY4 = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/dragonfly4_wing.png");
    public static final ResourceLocation TEXTURE_DRAGONFLY5 = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/dragonfly5_wing.png");
    public static final ResourceLocation TEXTURE_DRAGONFLY6 = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/dragonfly6_wing.png");
    public static final ResourceLocation TEXTURE_DRAGONFLY7 = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/dragonfly7_wing.png");
    public static final ResourceLocation TEXTURE_DRAGONFLY8 = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/dragonfly8_wing.png");
    public static final ResourceLocation TEXTURE_DRAGONFLY9 = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/dragonfly9_wing.png");
    public static final ResourceLocation TEXTURE_DRAGONFLY10 = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/dragonfly10_wing.png");

    public LayerDragonflyWing(RenderDragonfly DragonflyRendererIn)
    {
        this.DragonflyRenderer = DragonflyRendererIn;
    }

    @Override
    public void doRenderLayer(EntityPrehistoricFloraDragonfly entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch, float scale)
    {
        if (!entitylivingbaseIn.isInvisible())
        {
            switch (entitylivingbaseIn.getPNType()) {
                case DRAGONFLY1: default:
                    this.DragonflyRenderer.bindTexture(TEXTURE_DRAGONFLY1);
                    break;

                case DRAGONFLY2:
                    this.DragonflyRenderer.bindTexture(TEXTURE_DRAGONFLY2);
                    break;

                case DRAGONFLY3:
                    this.DragonflyRenderer.bindTexture(TEXTURE_DRAGONFLY3);
                    break;

                case DRAGONFLY4:
                    this.DragonflyRenderer.bindTexture(TEXTURE_DRAGONFLY4);
                    break;

                case DRAGONFLY5:
                    this.DragonflyRenderer.bindTexture(TEXTURE_DRAGONFLY5);
                    break;

                case DRAGONFLY6:
                    this.DragonflyRenderer.bindTexture(TEXTURE_DRAGONFLY6);
                    break;

                case DRAGONFLY7:
                    this.DragonflyRenderer.bindTexture(TEXTURE_DRAGONFLY7);
                    break;

                case DRAGONFLY8:
                    this.DragonflyRenderer.bindTexture(TEXTURE_DRAGONFLY8);
                    break;

                case DRAGONFLY9:
                    this.DragonflyRenderer.bindTexture(TEXTURE_DRAGONFLY9);
                    break;

                case DRAGONFLY10:
                    this.DragonflyRenderer.bindTexture(TEXTURE_DRAGONFLY10);
                    break;
            }

            GlStateManager.pushMatrix();
            GlStateManager.color(1.0F, 1.0F, 1.0F, 0.40F);
            GlStateManager.enableNormalize();
            GlStateManager.enableBlend();
            GlStateManager.blendFunc(GlStateManager.SourceFactor.SRC_ALPHA, GlStateManager.DestFactor.ONE_MINUS_SRC_ALPHA);
            this.DragonflyRenderer.getModelFromArray(entitylivingbaseIn).setModelAttributes(this.DragonflyRenderer.getModelFromArray(entitylivingbaseIn));
            this.DragonflyRenderer.getModelFromArray(entitylivingbaseIn).setRotationAngles(limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch, scale, entitylivingbaseIn);
            this.DragonflyRenderer.getModelFromArray(entitylivingbaseIn).render(entitylivingbaseIn, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch, scale);
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
