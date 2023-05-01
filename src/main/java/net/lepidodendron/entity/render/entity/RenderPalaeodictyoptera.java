package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraPalaeodictyoptera;
import net.lepidodendron.entity.model.entity.ModelPalaeodictyoptera;
import net.lepidodendron.entity.model.entity.ModelPalaeodictyopteraLarge;
import net.lepidodendron.entity.model.entity.ModelPalaeodictyopteraMedium;
import net.lepidodendron.entity.model.entity.ModelPalaeodictyopteraSmall;
import net.minecraft.client.Minecraft;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderPalaeodictyoptera extends RenderLiving<EntityPrehistoricFloraPalaeodictyoptera> {
    private static final ResourceLocation TEXTURE_DELITZSCHALA = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/palaeodictyoptera_delitzschala.png");
    private static final ResourceLocation TEXTURE_DUNBARIA = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/palaeodictyoptera_dunbaria.png");
    private static final ResourceLocation TEXTURE_HOMOIOPTERA = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/palaeodictyoptera_homoioptera.png");
    private static final ResourceLocation TEXTURE_HOMALONEURA = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/palaeodictyoptera_homaloneura.png");
    private static final ResourceLocation TEXTURE_LITHOMANTIS = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/palaeodictyoptera_lithomantis.png");
    private static final ResourceLocation TEXTURE_LYCOCERCUS = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/palaeodictyoptera_lycocercus.png");
    private static final ResourceLocation TEXTURE_SINODUNBARIA = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/palaeodictyoptera_sinodunbaria.png");
    private static final ResourceLocation TEXTURE_STENODICTYA = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/palaeodictyoptera_stenodictya.png");
    private static final ResourceLocation TEXTURE_MAZOTHAIROS = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/palaeodictyoptera_mazothairos.png");

    private static final ModelBase MODEL_DELITZSCHALA = new ModelPalaeodictyopteraSmall();
    private static final ModelBase MODEL_DUNBARIA = new ModelPalaeodictyopteraMedium();
    private static final ModelBase MODEL_HOMOIOPTERA = new ModelPalaeodictyopteraLarge();
    private static final ModelBase MODEL_HOMALONEURA = new ModelPalaeodictyopteraMedium();
    private static final ModelBase MODEL_LITHOMANTIS = new ModelPalaeodictyopteraMedium();
    private static final ModelBase MODEL_LYCOCERCUS = new ModelPalaeodictyopteraMedium();
    private static final ModelBase MODEL_SINODUNBARIA = new ModelPalaeodictyopteraSmall();
    private static final ModelBase MODEL_STENODICTYA = new ModelPalaeodictyopteraMedium();
    private static final ModelBase MODEL_MAZOTHAIROS = new ModelPalaeodictyopteraLarge();

    public RenderPalaeodictyoptera(RenderManager mgr) {
        super(mgr, new ModelPalaeodictyoptera(), 0.0f);
        this.addLayer(new LayerPalaeodictyopteraWing(this));
    }

    @Override
    protected void renderModel(EntityPrehistoricFloraPalaeodictyoptera entitylivingbaseIn, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch, float scaleFactor)
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
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraPalaeodictyoptera entity) {
        switch (entity.getPNInsectType()) {
            case DELITZSCHALA: default:
                return TEXTURE_DELITZSCHALA;

            case DUNBARIA:
                return TEXTURE_DUNBARIA;

            case HOMALONEURA:
                return TEXTURE_HOMALONEURA;

            case HOMOIOPTERA:
                return TEXTURE_HOMOIOPTERA;

            case LITHOMANTIS:
                return TEXTURE_LITHOMANTIS;

            case LYCOCERCUS:
                return TEXTURE_LYCOCERCUS;

            case SINODUNBARIA:
                return TEXTURE_SINODUNBARIA;

            case STENODICTYA:
                return TEXTURE_STENODICTYA;

            case MAZOTHAIROS:
                return TEXTURE_MAZOTHAIROS;
        }
    }

    public ModelBase getEntityModel(EntityPrehistoricFloraPalaeodictyoptera entity) {
        switch (entity.getPNInsectType()) {
            case DELITZSCHALA: default:
                return MODEL_DELITZSCHALA;

            case DUNBARIA:
                return MODEL_DUNBARIA;

            case HOMALONEURA:
                return MODEL_HOMALONEURA;

            case HOMOIOPTERA:
                return MODEL_HOMOIOPTERA;

            case LITHOMANTIS:
                return MODEL_LITHOMANTIS;

            case LYCOCERCUS:
                return MODEL_LYCOCERCUS;

            case SINODUNBARIA:
                return MODEL_SINODUNBARIA;

            case STENODICTYA:
                return MODEL_STENODICTYA;

            case MAZOTHAIROS:
                return MODEL_MAZOTHAIROS;
        }
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraPalaeodictyoptera entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
        switch (entityLiving.getAttachmentFacing()) {
            case DOWN:
            default:
                break;
            case EAST:
                GlStateManager.translate(0.25F, 0.05F, 0.0F);
                GlStateManager.rotate(90.0F, 1.0F, 0.0F, 0.0F);
                GlStateManager.rotate(90.0F, 0.0F, 0.0F, 1.0F);
                break;
            case WEST:
                GlStateManager.translate(-0.25F, 0.05F, 0.0F);
                GlStateManager.rotate(90.0F, 1.0F, 0.0F, 0.0F);
                GlStateManager.rotate(-90.0F, 0.0F, 0.0F, 1.0F);
                break;
            case NORTH:
                GlStateManager.translate(0.0F, 0.05F, -0.25F);
                GlStateManager.rotate(90.0F, 1.0F, 0.0F, 0.0F);
                break;
            case SOUTH:
                GlStateManager.translate(0.0F, 0.05F, 0.25F);
                GlStateManager.rotate(90.0F, 1.0F, 0.0F, 0.0F);
                GlStateManager.rotate(180.0F, 0.0F, 0.0F, 1.0F);
                break;
            case UP:
                GlStateManager.translate(0.0F, 0.5F, 0.0F);
                GlStateManager.rotate(180.0F, 1.0F, 0.0F, 0.0F);
        }
    }

    @Override
    protected void preRenderCallback(EntityPrehistoricFloraPalaeodictyoptera entity, float f) {
        float scaler = 1F;
        switch (entity.getPNInsectType()) {
            case DELITZSCHALA: default:
                scaler = 1F;
                break;

            case DUNBARIA:
                scaler = 1F;
                break;

            case HOMALONEURA:
                scaler = 1F;
                break;

            case HOMOIOPTERA:
                scaler = 1F;
                break;

            case LITHOMANTIS:
                scaler = 1F;
                break;

            case LYCOCERCUS:
                scaler = 1F;
                break;

            case SINODUNBARIA:
                scaler = 1F;
                break;

            case STENODICTYA:
                scaler = 1F;
                break;

            case MAZOTHAIROS:
                scaler = 0.5F;
                break;

        }
        float scale = 1.0F * scaler;
//        if (entity.world.getBlockState(entity.getPosition()).getBlock() == BlockGlassJar.block) {
//            scale = Math.min() 0.8F * scaler;
//        }
        GlStateManager.scale(scale, scale, scale);
    }

}