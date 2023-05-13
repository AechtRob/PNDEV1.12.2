package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraMegasecoptera;
import net.lepidodendron.entity.model.entity.ModelSylvohymen;
import net.minecraft.client.Minecraft;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderMegasecoptera extends RenderLiving<EntityPrehistoricFloraMegasecoptera> {
    private static final ResourceLocation TEXTURE_SYLVOHYMEN = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/megasecoptera_sylvohymen.png");
    private static final ModelBase MODEL_SYLVOHYMEN = new ModelSylvohymen();

    public RenderMegasecoptera(RenderManager mgr) {
        super(mgr, new ModelSylvohymen(), 0.0f);
    }

    @Override
    protected void renderModel(EntityPrehistoricFloraMegasecoptera entitylivingbaseIn, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch, float scaleFactor)
    {
        boolean flag = this.isVisible(entitylivingbaseIn);
        boolean flag1 = !flag && !entitylivingbaseIn.isInvisibleToPlayer(Minecraft.getMinecraft().player);

        if (flag || flag1)
        {
            if (!this.bindEntityTexture(entitylivingbaseIn))
            {
                return;
            }

            if (flag1)
            {
                GlStateManager.enableBlendProfile(GlStateManager.Profile.TRANSPARENT_MODEL);
            }

            this.getEntityModel(entitylivingbaseIn).render(entitylivingbaseIn, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch, scaleFactor);

            if (flag1)
            {
                GlStateManager.disableBlendProfile(GlStateManager.Profile.TRANSPARENT_MODEL);
            }
        }
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraMegasecoptera entity) {
        switch (entity.getPNType()) {
            case SYLVOHYMEN: default:
                return TEXTURE_SYLVOHYMEN;
        }
    }

    public ModelBase getEntityModel(EntityPrehistoricFloraMegasecoptera entity) {
        switch (entity.getPNType()) {
            case SYLVOHYMEN: default:
                return MODEL_SYLVOHYMEN;

        }
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraMegasecoptera entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
        switch (entityLiving.getAttachmentFacing()) {
            case DOWN:
            default:
                break;
            case EAST:
                GlStateManager.translate(0.15F, 0.1F, 0.0F);
                GlStateManager.rotate(90.0F, 1.0F, 0.0F, 0.0F);
                GlStateManager.rotate(90.0F, 0.0F, 0.0F, 1.0F);
                break;
            case WEST:
                GlStateManager.translate(-0.15F, 0.1F, 0.0F);
                GlStateManager.rotate(90.0F, 1.0F, 0.0F, 0.0F);
                GlStateManager.rotate(-90.0F, 0.0F, 0.0F, 1.0F);
                break;
            case NORTH:
                GlStateManager.translate(0.0F, 0.1F, -0.15F);
                GlStateManager.rotate(90.0F, 1.0F, 0.0F, 0.0F);
                break;
            case SOUTH:
                GlStateManager.translate(0.0F, 0.1F, 0.15F);
                GlStateManager.rotate(90.0F, 1.0F, 0.0F, 0.0F);
                GlStateManager.rotate(180.0F, 0.0F, 0.0F, 1.0F);
                break;
            case UP:
                GlStateManager.translate(0.0F, 0.5F, 0.0F);
                GlStateManager.rotate(180.0F, 1.0F, 0.0F, 0.0F);
        }
    }

    @Override
    protected void preRenderCallback(EntityPrehistoricFloraMegasecoptera entity, float f) {
        float scaler = 1F;
        switch (entity.getPNType()) {
            case SYLVOHYMEN: default:
                scaler = 0.34F;
                break;

        }
        float scale = 1.0F * scaler;
//        if (entity.world.getBlockState(entity.getPosition()).getBlock() == BlockGlassJar.block) {
//            scale = Math.min() 0.8F * scaler;
//        }
        GlStateManager.scale(scale, scale, scale);
    }

}