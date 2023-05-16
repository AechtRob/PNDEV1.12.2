package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraPalaeodictyoptera;
import net.lepidodendron.entity.model.entity.ModelPalaeodictyopteraLarge;
import net.lepidodendron.entity.model.entity.ModelPalaeodictyopteraMedium;
import net.lepidodendron.entity.model.entity.ModelPalaeodictyopteraSmall;
import net.minecraft.client.Minecraft;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.OpenGlHelper;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.MathHelper;

public class RenderPalaeodictyoptera extends RenderLiving<EntityPrehistoricFloraPalaeodictyoptera> {
    public static final ResourceLocation TEXTURE_DELITZSCHALA = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/palaeodictyoptera_delitzschala.png");
    public static final ResourceLocation TEXTURE_DUNBARIA = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/palaeodictyoptera_dunbaria.png");
    public static final ResourceLocation TEXTURE_HOMOIOPTERA = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/palaeodictyoptera_homoioptera.png");
    public static final ResourceLocation TEXTURE_HOMALONEURA = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/palaeodictyoptera_homaloneura.png");
    public static final ResourceLocation TEXTURE_LITHOMANTIS = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/palaeodictyoptera_lithomantis.png");
    public static final ResourceLocation TEXTURE_LYCOCERCUS = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/palaeodictyoptera_lycocercus.png");
    public static final ResourceLocation TEXTURE_SINODUNBARIA = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/palaeodictyoptera_sinodunbaria.png");
    public static final ResourceLocation TEXTURE_STENODICTYA = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/palaeodictyoptera_stenodictya.png");
    public static final ResourceLocation TEXTURE_MAZOTHAIROS = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/palaeodictyoptera_mazothairos.png");

    public static final ModelBase MODEL_DELITZSCHALA = new ModelPalaeodictyopteraSmall();
    public static final ModelBase MODEL_DUNBARIA = new ModelPalaeodictyopteraMedium();
    public static final ModelBase MODEL_HOMOIOPTERA = new ModelPalaeodictyopteraLarge();
    public static final ModelBase MODEL_HOMALONEURA = new ModelPalaeodictyopteraMedium();
    public static final ModelBase MODEL_LITHOMANTIS = new ModelPalaeodictyopteraMedium();
    public static final ModelBase MODEL_LYCOCERCUS = new ModelPalaeodictyopteraMedium();
    public static final ModelBase MODEL_SINODUNBARIA = new ModelPalaeodictyopteraSmall();
    public static final ModelBase MODEL_STENODICTYA = new ModelPalaeodictyopteraMedium();
    public static final ModelBase MODEL_MAZOTHAIROS = new ModelPalaeodictyopteraLarge();

    public RenderPalaeodictyoptera(RenderManager mgr) {
        super(mgr, new ModelPalaeodictyopteraSmall(), 0.0f);
        this.addLayer(new LayerPalaeodictyopteraWing(this));
    }

    @Override
    public void doRender(EntityPrehistoricFloraPalaeodictyoptera entity, double x, double y, double z, float entityYaw, float partialTicks) {

        GlStateManager.pushMatrix();
        GlStateManager.disableCull();
        this.getEntityModel(entity).swingProgress = this.getSwingProgress(entity, partialTicks);
        boolean shouldSit = entity.isRiding() && (entity.getRidingEntity() != null && entity.getRidingEntity().shouldRiderSit());
        this.getEntityModel(entity).isRiding = shouldSit;
        this.getEntityModel(entity).isChild = entity.isChild();

        try
        {
            float f = this.interpolateRotation(entity.prevRenderYawOffset, entity.renderYawOffset, partialTicks);
            float f1 = this.interpolateRotation(entity.prevRotationYawHead, entity.rotationYawHead, partialTicks);
            float f2 = f1 - f;

            if (shouldSit && entity.getRidingEntity() instanceof EntityLivingBase)
            {
                EntityLivingBase entitylivingbase = (EntityLivingBase)entity.getRidingEntity();
                f = this.interpolateRotation(entitylivingbase.prevRenderYawOffset, entitylivingbase.renderYawOffset, partialTicks);
                f2 = f1 - f;
                float f3 = MathHelper.wrapDegrees(f2);

                if (f3 < -85.0F)
                {
                    f3 = -85.0F;
                }

                if (f3 >= 85.0F)
                {
                    f3 = 85.0F;
                }

                f = f1 - f3;

                if (f3 * f3 > 2500.0F)
                {
                    f += f3 * 0.2F;
                }

                f2 = f1 - f;
            }

            float f7 = entity.prevRotationPitch + (entity.rotationPitch - entity.prevRotationPitch) * partialTicks;
            this.renderLivingAt(entity, x, y, z);
            float f8 = this.handleRotationFloat(entity, partialTicks);
            this.applyRotations(entity, f8, f, partialTicks);
            float f4 = this.prepareScale(entity, partialTicks);
            float f5 = 0.0F;
            float f6 = 0.0F;

            if (!entity.isRiding())
            {
                f5 = entity.prevLimbSwingAmount + (entity.limbSwingAmount - entity.prevLimbSwingAmount) * partialTicks;
                f6 = entity.limbSwing - entity.limbSwingAmount * (1.0F - partialTicks);

                if (entity.isChild())
                {
                    f6 *= 3.0F;
                }

                if (f5 > 1.0F)
                {
                    f5 = 1.0F;
                }
                f2 = f1 - f; // Forge: Fix MC-1207
            }

            GlStateManager.enableAlpha();
            this.getEntityModel(entity).setLivingAnimations(entity, f6, f5, partialTicks);
            this.getEntityModel(entity).setRotationAngles(f6, f5, f8, f2, f7, f4, entity);

            if (this.renderOutlines)
            {
                boolean flag1 = this.setScoreTeamColor(entity);
                GlStateManager.enableColorMaterial();
                GlStateManager.enableOutlineMode(this.getTeamColor(entity));

                if (!this.renderMarker)
                {
                    this.renderModel(entity, f6, f5, f8, f2, f7, f4);
                }

                this.renderLayers(entity, f6, f5, partialTicks, f8, f2, f7, f4);

                GlStateManager.disableOutlineMode();
                GlStateManager.disableColorMaterial();

                if (flag1)
                {
                    this.unsetScoreTeamColor();
                }
            }
            else
            {
                boolean flag = this.setDoRenderBrightness(entity, partialTicks);
                this.renderModel(entity, f6, f5, f8, f2, f7, f4);

                if (flag)
                {
                    this.unsetBrightness();
                }

                GlStateManager.depthMask(true);

                this.renderLayers(entity, f6, f5, partialTicks, f8, f2, f7, f4);
            }

            GlStateManager.disableRescaleNormal();
        }
        catch (Exception exception)
        {
            System.err.println("Couldn't render Palaeodictyoptera");
        }

        GlStateManager.setActiveTexture(OpenGlHelper.lightmapTexUnit);
        GlStateManager.enableTexture2D();
        GlStateManager.setActiveTexture(OpenGlHelper.defaultTexUnit);
        GlStateManager.enableCull();
        GlStateManager.popMatrix();
        if (!this.renderOutlines)
        {
            this.renderName(entity, x, y, z);
        }

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
        switch (entity.getPNType()) {
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
        switch (entity.getPNType()) {
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

    public static float getScaler(EntityPrehistoricFloraPalaeodictyoptera.Type variant) {
        switch (variant) {
            case DELITZSCHALA:
            default:
                return 0.115F;

            case DUNBARIA:
                return 0.127F;

            case HOMALONEURA:
                return 0.135F;

            case HOMOIOPTERA:
                return 0.192F;

            case LITHOMANTIS:
                return 0.143F;

            case LYCOCERCUS:
                return 0.141F;

            case SINODUNBARIA:
                return 0.120F;

            case STENODICTYA:
                return 0.149F;

            case MAZOTHAIROS:
                return 0.225F;
        }
    }


    @Override
    protected void preRenderCallback(EntityPrehistoricFloraPalaeodictyoptera entity, float f) {
        float scale = 1.0F * getScaler(entity.getPNType());
        GlStateManager.scale(scale, scale, scale);
    }

}