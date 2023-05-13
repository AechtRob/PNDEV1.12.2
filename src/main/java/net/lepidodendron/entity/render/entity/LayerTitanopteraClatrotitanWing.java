//package net.lepidodendron.entity.render.entity;
//
//import net.lepidodendron.LepidodendronMod;
//import net.lepidodendron.entity.EntityPrehistoricFloraTitanopteraClatrotitan;
//import net.lepidodendron.entity.model.entity.ModelTitanoptera;
//import net.minecraft.client.model.ModelBase;
//import net.minecraft.client.renderer.GlStateManager;
//import net.minecraft.client.renderer.entity.layers.LayerRenderer;
//import net.minecraft.util.ResourceLocation;
//
//public class LayerTitanopteraClatrotitanWing implements LayerRenderer<EntityPrehistoricFloraTitanopteraClatrotitan>
//{
//    private final RenderTitanopteraClatrotitan TitanopteraClatrotitanRenderer;
//    private final ModelBase TitanopteraClatrotitanModel = new ModelTitanoptera();
//    private static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/titanoptera_clatrotitan_wing.png");
//
//    public LayerTitanopteraClatrotitanWing(RenderTitanopteraClatrotitan TitanopteraClatrotitanRendererIn)
//    {
//        this.TitanopteraClatrotitanRenderer = TitanopteraClatrotitanRendererIn;
//    }
//
//    @Override
//    public void doRenderLayer(EntityPrehistoricFloraTitanopteraClatrotitan entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch, float scale)
//    {
//        if (!entitylivingbaseIn.isInvisible())
//        {
//            this.TitanopteraClatrotitanRenderer.bindTexture(TEXTURE);
//            GlStateManager.pushMatrix();
//            GlStateManager.color(1.0F, 1.0F, 1.0F, 0.9F);
//            GlStateManager.enableNormalize();
//            GlStateManager.enableBlend();
//            GlStateManager.blendFunc(GlStateManager.SourceFactor.SRC_ALPHA, GlStateManager.DestFactor.ONE_MINUS_SRC_ALPHA);
//            this.TitanopteraClatrotitanModel.setModelAttributes(this.TitanopteraClatrotitanRenderer.getMainModel());
//            this.TitanopteraClatrotitanModel.setRotationAngles(limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch, scale, entitylivingbaseIn);
//            this.TitanopteraClatrotitanModel.render(entitylivingbaseIn, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch, scale);
//            GlStateManager.disableBlend();
//            GlStateManager.disableNormalize();
//            GlStateManager.popMatrix();
//        }
//    }
//
//    @Override
//    public boolean shouldCombineTextures()
//    {
//        return true;
//    }
//}
