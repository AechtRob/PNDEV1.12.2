package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.EntityPrehistoricFloraCidaroida;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.lepidodendron.entity.model.llibraryextensions.AdvancedModelRendererExtended;
import net.minecraft.client.model.ModelBox;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;

public class ModelCidaroida extends ModelBasePalaeopedia {
    private final AdvancedModelRendererExtended body;
    private final AdvancedModelRendererExtended spike;
    private final AdvancedModelRendererExtended spike2;
    private final AdvancedModelRendererExtended spike3;
    private final AdvancedModelRendererExtended spike4;
    private final AdvancedModelRendererExtended spike5;
    private final AdvancedModelRendererExtended spike6;
    private final AdvancedModelRendererExtended spike7;
    private final AdvancedModelRendererExtended spike8;
    private final AdvancedModelRendererExtended spike9;
    private final AdvancedModelRendererExtended spike10;
    private final AdvancedModelRendererExtended spike11;
    private final AdvancedModelRendererExtended spike12;
    private final AdvancedModelRendererExtended spike13;
    private final AdvancedModelRendererExtended spike14;
    private final AdvancedModelRendererExtended spike15;

    private ModelAnimator animator;

    public ModelCidaroida() {
        this.textureWidth = 32;
        this.textureHeight = 32;

        this.body = new AdvancedModelRendererExtended(this);
        this.body.setRotationPoint(0.0F, 24.0F, 0.0F);
        this.body.cubeList.add(new ModelBox(body, 0, 0, -3.0F, -4.0F, -3.0F, 6, 4, 6, 0.0F, false));

        this.spike = new AdvancedModelRendererExtended(this);
        this.spike.setRotationPoint(-2.5F, -3.75F, -0.75F);
        this.body.addChild(spike);
        this.setRotateAngle(spike, 0.3054F, 0.0F, -1.0472F);
        this.spike.cubeList.add(new ModelBox(spike, 8, 14, -0.5F, -6.0F, -0.5F, 1, 7, 1, 0.0F, false));
        this.spike.cubeList.add(new ModelBox(spike, 8, 10, -1.0F, -2.5F, -1.0F, 2, 2, 2, 0.0F, false));
        this.spike.cubeList.add(new ModelBox(spike, 0, 10, -1.0F, -6.5F, -1.0F, 2, 4, 2, 0.0F, false));

        this.spike2 = new AdvancedModelRendererExtended(this);
        this.spike2.setRotationPoint(-1.5F, -3.75F, 2.5F);
        this.body.addChild(spike2);
        this.setRotateAngle(spike2, -0.6109F, 0.48F, -1.0908F);
        this.spike2.cubeList.add(new ModelBox(spike2, 8, 14, -0.5F, -6.0F, -0.5F, 1, 7, 1, 0.0F, false));
        this.spike2.cubeList.add(new ModelBox(spike2, 8, 10, -1.0F, -2.5F, -1.0F, 2, 2, 2, 0.0F, false));
        this.spike2.cubeList.add(new ModelBox(spike2, 0, 10, -1.0F, -6.5F, -1.0F, 2, 4, 2, 0.0F, false));

        this.spike3 = new AdvancedModelRendererExtended(this);
        this.spike3.setRotationPoint(1.5F, -3.75F, 2.5F);
        this.body.addChild(spike3);
        this.setRotateAngle(spike3, -2.0508F, 0.5672F, -1.5708F);
        this.spike3.cubeList.add(new ModelBox(spike3, 8, 14, -0.5F, -6.0F, -0.5F, 1, 7, 1, 0.0F, false));
        this.spike3.cubeList.add(new ModelBox(spike3, 8, 10, -1.0F, -2.5F, -1.0F, 2, 2, 2, 0.0F, false));
        this.spike3.cubeList.add(new ModelBox(spike3, 0, 10, -1.0F, -6.5F, -1.0F, 2, 4, 2, 0.0F, false));

        this.spike4 = new AdvancedModelRendererExtended(this);
        this.spike4.setRotationPoint(2.5F, -3.75F, -0.5F);
        this.body.addChild(spike4);
        this.setRotateAngle(spike4, 2.8362F, 0.0F, -2.0944F);
        this.spike4.cubeList.add(new ModelBox(spike4, 8, 14, -0.5F, -6.0F, -0.5F, 1, 7, 1, 0.0F, false));
        this.spike4.cubeList.add(new ModelBox(spike4, 8, 10, -1.0F, -2.5F, -1.0F, 2, 2, 2, 0.0F, false));
        this.spike4.cubeList.add(new ModelBox(spike4, 0, 10, -1.0F, -6.5F, -1.0F, 2, 4, 2, 0.0F, false));

        this.spike5 = new AdvancedModelRendererExtended(this);
        this.spike5.setRotationPoint(-0.5F, -3.75F, -2.5F);
        this.body.addChild(spike5);
        this.setRotateAngle(spike5, 1.5272F, -0.5672F, -1.6581F);
        this.spike5.cubeList.add(new ModelBox(spike5, 8, 14, -0.5F, -6.0F, -0.5F, 1, 7, 1, 0.0F, false));
        this.spike5.cubeList.add(new ModelBox(spike5, 8, 10, -1.0F, -2.5F, -1.0F, 2, 2, 2, 0.0F, false));
        this.spike5.cubeList.add(new ModelBox(spike5, 0, 10, -1.0F, -6.5F, -1.0F, 2, 4, 2, 0.0F, false));

        this.spike6 = new AdvancedModelRendererExtended(this);
        this.spike6.setRotationPoint(-2.75F, -1.75F, -2.75F);
        this.body.addChild(spike6);
        this.setRotateAngle(spike6, 0.7854F, -0.3054F, -1.2654F);
        this.spike6.cubeList.add(new ModelBox(spike6, 8, 14, -0.5F, -6.0F, -0.5F, 1, 7, 1, 0.0F, false));
        this.spike6.cubeList.add(new ModelBox(spike6, 8, 10, -1.0F, -2.5F, -1.0F, 2, 2, 2, 0.0F, false));
        this.spike6.cubeList.add(new ModelBox(spike6, 0, 10, -1.0F, -6.5F, -1.0F, 2, 4, 2, 0.0F, false));

        this.spike7 = new AdvancedModelRendererExtended(this);
        this.spike7.setRotationPoint(2.25F, -1.75F, -2.75F);
        this.body.addChild(spike7);
        this.setRotateAngle(spike7, 1.1781F, -0.6109F, 0.0F);
        this.spike7.cubeList.add(new ModelBox(spike7, 8, 14, -0.5F, -6.0F, -0.5F, 1, 7, 1, 0.0F, false));
        this.spike7.cubeList.add(new ModelBox(spike7, 8, 10, -1.0F, -2.5F, -1.0F, 2, 2, 2, 0.0F, false));
        this.spike7.cubeList.add(new ModelBox(spike7, 0, 10, -1.0F, -6.5F, -1.0F, 2, 4, 2, 0.0F, false));

        this.spike8 = new AdvancedModelRendererExtended(this);
        this.spike8.setRotationPoint(3.0F, -1.75F, 1.25F);
        this.body.addChild(spike8);
        this.setRotateAngle(spike8, 1.0908F, -2.0508F, 0.0873F);
        this.spike8.cubeList.add(new ModelBox(spike8, 8, 14, -0.5F, -6.0F, -0.5F, 1, 7, 1, 0.0F, false));
        this.spike8.cubeList.add(new ModelBox(spike8, 8, 10, -1.0F, -2.5F, -1.0F, 2, 2, 2, 0.0F, false));
        this.spike8.cubeList.add(new ModelBox(spike8, 0, 10, -1.0F, -6.5F, -1.0F, 2, 4, 2, 0.0F, false));

        this.spike9 = new AdvancedModelRendererExtended(this);
        this.spike9.setRotationPoint(0.0F, -1.75F, 3.25F);
        this.body.addChild(spike9);
        this.setRotateAngle(spike9, 1.0908F, 3.0543F, 0.0F);
        this.spike9.cubeList.add(new ModelBox(spike9, 8, 14, -0.5F, -6.0F, -0.5F, 1, 7, 1, 0.0F, false));
        this.spike9.cubeList.add(new ModelBox(spike9, 8, 10, -1.0F, -2.5F, -1.0F, 2, 2, 2, 0.0F, false));
        this.spike9.cubeList.add(new ModelBox(spike9, 0, 10, -1.0F, -6.5F, -1.0F, 2, 4, 2, 0.0F, false));

        this.spike10 = new AdvancedModelRendererExtended(this);
        this.spike10.setRotationPoint(-3.0F, -1.75F, 1.25F);
        this.body.addChild(spike10);
        this.setRotateAngle(spike10, 1.0908F, 1.9635F, 0.0F);
        this.spike10.cubeList.add(new ModelBox(spike10, 8, 14, -0.5F, -6.0F, -0.5F, 1, 7, 1, 0.0F, false));
        this.spike10.cubeList.add(new ModelBox(spike10, 8, 10, -1.0F, -2.5F, -1.0F, 2, 2, 2, 0.0F, false));
        this.spike10.cubeList.add(new ModelBox(spike10, 0, 10, -1.0F, -6.5F, -1.0F, 2, 4, 2, 0.0F, false));

        this.spike11 = new AdvancedModelRendererExtended(this);
        this.spike11.setRotationPoint(-2.3F, -1.25F, 3.0F);
        this.body.addChild(spike11);
        this.setRotateAngle(spike11, 1.4399F, 2.3998F, 0.0F);
        this.spike11.cubeList.add(new ModelBox(spike11, 8, 14, -0.5F, -6.0F, -0.5F, 1, 7, 1, 0.0F, false));
        this.spike11.cubeList.add(new ModelBox(spike11, 8, 10, -1.0F, -2.5F, -1.0F, 2, 2, 2, 0.0F, false));
        this.spike11.cubeList.add(new ModelBox(spike11, 0, 10, -1.0F, -6.5F, -1.0F, 2, 4, 2, 0.0F, false));

        this.spike12 = new AdvancedModelRendererExtended(this);
        this.spike12.setRotationPoint(1.9F, -1.25F, 3.0F);
        this.body.addChild(spike12);
        this.setRotateAngle(spike12, 1.3526F, -2.4871F, 0.0F);
        this.spike12.cubeList.add(new ModelBox(spike12, 8, 14, -0.5F, -6.0F, -0.5F, 1, 7, 1, 0.0F, false));
        this.spike12.cubeList.add(new ModelBox(spike12, 8, 10, -1.0F, -2.5F, -1.0F, 2, 2, 2, 0.0F, false));
        this.spike12.cubeList.add(new ModelBox(spike12, 0, 10, -1.0F, -6.5F, -1.0F, 2, 4, 2, 0.0F, false));

        this.spike13 = new AdvancedModelRendererExtended(this);
        this.spike13.setRotationPoint(2.9F, -1.25F, -0.25F);
        this.body.addChild(spike13);
        this.setRotateAngle(spike13, 1.2654F, -1.6144F, 0.0F);
        this.spike13.cubeList.add(new ModelBox(spike13, 8, 14, -0.5F, -6.0F, -0.5F, 1, 7, 1, 0.0F, false));
        this.spike13.cubeList.add(new ModelBox(spike13, 8, 10, -1.0F, -2.5F, -1.0F, 2, 2, 2, 0.0F, false));
        this.spike13.cubeList.add(new ModelBox(spike13, 0, 10, -1.0F, -6.5F, -1.0F, 2, 4, 2, 0.0F, false));

        this.spike14 = new AdvancedModelRendererExtended(this);
        this.spike14.setRotationPoint(0.15F, -1.25F, -3.0F);
        this.body.addChild(spike14);
        this.setRotateAngle(spike14, 1.2654F, -0.1745F, 0.0F);
        this.spike14.cubeList.add(new ModelBox(spike14, 8, 14, -0.5F, -6.0F, -0.5F, 1, 7, 1, 0.0F, false));
        this.spike14.cubeList.add(new ModelBox(spike14, 8, 10, -1.0F, -2.5F, -1.0F, 2, 2, 2, 0.0F, false));
        this.spike14.cubeList.add(new ModelBox(spike14, 0, 10, -1.0F, -6.5F, -1.0F, 2, 4, 2, 0.0F, false));

        this.spike15 = new AdvancedModelRendererExtended(this);
        this.spike15.setRotationPoint(-2.6F, -1.25F, -0.8F);
        this.body.addChild(spike15);
        this.setRotateAngle(spike15, 1.3526F, 1.2217F, 0.0F);
        this.spike15.cubeList.add(new ModelBox(spike15, 8, 14, -0.5F, -6.0F, -0.5F, 1, 7, 1, 0.0F, false));
        this.spike15.cubeList.add(new ModelBox(spike15, 8, 10, -1.0F, -2.5F, -1.0F, 2, 2, 2, 0.0F, false));
        this.spike15.cubeList.add(new ModelBox(spike15, 0, 10, -1.0F, -6.5F, -1.0F, 2, 4, 2, 0.0F, false));

        updateDefaultPose();
        animator = ModelAnimator.create();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        //animate((IAnimatedEntity) entity, f, f1, f2, f3, f4, f5);
        this.body.render(f5 * 1.0F);
    }
    
    public void renderStatic(float f) {
        //GlStateManager.pushMatrix();
        //GlStateManager.enableBlend();
        //GlStateManager.blendFunc(GlStateManager.SourceFactor.SRC_ALPHA, GlStateManager.DestFactor.ONE_MINUS_SRC_ALPHA);
        //GlStateManager.disableCull();
        this.body.offsetY = -9F;
        this.body.render(0.325F);
        //GlStateManager.enableCull();
        //GlStateManager.disableBlend();
        //GlStateManager.popMatrix();
    }

    public void setRotateAngle(AdvancedModelRenderer AdvancedModelRenderer, float x, float y, float z) {
        AdvancedModelRenderer.rotateAngleX = x;
        AdvancedModelRenderer.rotateAngleY = y;
        AdvancedModelRenderer.rotateAngleZ = z;
    }

    @Override
    public void setRotationAngles(float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch, float scaleFactor, Entity entityIn) {
        //super.setRotationAngles(limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch, scaleFactor, entityIn);
        this.body.offsetY = 0.00F;
    }

    @Override
    public void setLivingAnimations(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        this.resetToDefaultPose();

        EntityPrehistoricFloraCidaroida entity = (EntityPrehistoricFloraCidaroida) entitylivingbaseIn;
        if (entity.getIsMoving()) {
            animWalking(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
        }

        animate((IAnimatedEntity) entity);

    }


    public void animWalking(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraCidaroida entity = (EntityPrehistoricFloraCidaroida) entitylivingbaseIn;

        int animCycle = 40;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;

        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0D + (((tickAnim - 0D) / 10D) * 5D);
            yy = 0D + (((tickAnim - 0D) / 10D) * 5D);
            zz = 0D + (((tickAnim - 0D) / 10D) * 0D);
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 5D + (((tickAnim - 10D) / 10D) * -5D);
            yy = 5D + (((tickAnim - 10D) / 10D) * 2.5D);
            zz = 0D + (((tickAnim - 10D) / 10D) * 0D);
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 0D + (((tickAnim - 20D) / 10D) * -3D);
            yy = 7.5D + (((tickAnim - 20D) / 10D) * -2.5D);
            zz = 0D + (((tickAnim - 20D) / 10D) * 0D);
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = -3D + (((tickAnim - 30D) / 10D) * 3D);
            yy = 5D + (((tickAnim - 30D) / 10D) * -5D);
            zz = 0D + (((tickAnim - 30D) / 10D) * 0D);
        }

        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(xx), body.rotateAngleY + (float) Math.toRadians(yy), body.rotateAngleZ + (float) Math.toRadians(zz));
        
    }


    public void animate(IAnimatedEntity entity) {
        EntityPrehistoricFloraCidaroida e = (EntityPrehistoricFloraCidaroida) entity;
        animator.update(entity);

    }
}
