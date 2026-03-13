package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.EntityPrehistoricFloraMegalithomerus;
import net.lepidodendron.entity.base.EntityPrehistoricFloraLandClimbingGlidingBase;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;

public class ModelMegalithomerus extends ModelBasePalaeopedia {
    private final AdvancedModelRenderer base;
    private final AdvancedModelRenderer abdomen;
    private final AdvancedModelRenderer rightHindwing;
    private final AdvancedModelRenderer leftHindwing;
    private final AdvancedModelRenderer rightLeg2;
    private final AdvancedModelRenderer leftLeg2;
    private final AdvancedModelRenderer rightLeg3;
    private final AdvancedModelRenderer leftLeg3;
    private final AdvancedModelRenderer leftForewing;
    private final AdvancedModelRenderer rightForewing;
    private final AdvancedModelRenderer thorax;
    private final AdvancedModelRenderer rightLeg1;
    private final AdvancedModelRenderer leftLeg1;
    private final AdvancedModelRenderer thorax2;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer head;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer rightAntenna;
    private final AdvancedModelRenderer leftAntenna;

    private ModelAnimator animator;

    public ModelMegalithomerus() {
        this.textureWidth = 40;
        this.textureHeight = 64;

        this.base = new AdvancedModelRenderer(this);
        this.base.setRotationPoint(0.0F, 23.4F, -3.0F);


        this.abdomen = new AdvancedModelRenderer(this);
        this.abdomen.setRotationPoint(0.5F, -0.7F, 0.7F);
        this.base.addChild(abdomen);
        this.setRotateAngle(abdomen, -0.0175F, 0.0F, 0.0F);
        this.abdomen.cubeList.add(new ModelBox(abdomen, 0, 9, -2.0F, -0.5F, 0.25F, 3, 1, 6, 0.01F, false));
        this.abdomen.cubeList.add(new ModelBox(abdomen, 8, 27, -1.0F, -0.5F, -0.25F, 1, 1, 1, 0.0F, false));
        this.abdomen.cubeList.add(new ModelBox(abdomen, 8, 24, -1.5F, -0.5F, 5.5F, 2, 1, 2, 0.0F, false));
        this.abdomen.cubeList.add(new ModelBox(abdomen, 26, 21, -1.0F, -0.5F, 7.3F, 1, 1, 1, -0.01F, false));

        this.rightHindwing = new AdvancedModelRenderer(this);
        this.rightHindwing.setRotationPoint(-2.0F, -0.5F, 0.5F);
        this.abdomen.addChild(rightHindwing);
        this.setRotateAngle(rightHindwing, 0.0F, 1.5708F, 0.0F);
        this.rightHindwing.cubeList.add(new ModelBox(rightHindwing, 16, 16, -7.0F, -0.01F, 0.0F, 7, 0, 3, 0.0F, false));

        this.leftHindwing = new AdvancedModelRenderer(this);
        this.leftHindwing.setRotationPoint(1.0F, -0.5F, 0.5F);
        this.abdomen.addChild(leftHindwing);
        this.setRotateAngle(leftHindwing, 0.0F, -1.5708F, 0.0F);
        this.leftHindwing.cubeList.add(new ModelBox(leftHindwing, 16, 16, 0.0F, -0.02F, 0.0F, 7, 0, 3, 0.0F, true));

        this.rightLeg2 = new AdvancedModelRenderer(this);
        this.rightLeg2.setRotationPoint(-1.0F, 0.45F, 1.25F);
        this.abdomen.addChild(rightLeg2);
        this.setRotateAngle(rightLeg2, -0.0436F, -0.0436F, -0.1745F);
        this.rightLeg2.cubeList.add(new ModelBox(rightLeg2, 18, 4, -4.0F, 0.0F, -0.5F, 4, 0, 4, 0.0F, false));

        this.leftLeg2 = new AdvancedModelRenderer(this);
        this.leftLeg2.setRotationPoint(0.0F, 0.45F, 1.25F);
        this.abdomen.addChild(leftLeg2);
        this.setRotateAngle(leftLeg2, -0.0436F, 0.0436F, 0.1745F);
        this.leftLeg2.cubeList.add(new ModelBox(leftLeg2, 18, 4, 0.0F, 0.0F, -0.5F, 4, 0, 4, 0.0F, true));

        this.rightLeg3 = new AdvancedModelRenderer(this);
        this.rightLeg3.setRotationPoint(-1.0F, 0.45F, 4.0F);
        this.abdomen.addChild(rightLeg3);
        this.setRotateAngle(rightLeg3, -0.0436F, 0.0873F, -0.1745F);
        this.rightLeg3.cubeList.add(new ModelBox(rightLeg3, 18, 8, -4.0F, 0.0F, -0.5F, 4, 0, 4, 0.0F, false));

        this.leftLeg3 = new AdvancedModelRenderer(this);
        this.leftLeg3.setRotationPoint(0.0F, 0.45F, 4.0F);
        this.abdomen.addChild(leftLeg3);
        this.setRotateAngle(leftLeg3, -0.0436F, -0.0873F, 0.1745F);
        this.leftLeg3.cubeList.add(new ModelBox(leftLeg3, 18, 8, 0.0F, 0.0F, -0.5F, 4, 0, 4, 0.0F, true));

        this.leftForewing = new AdvancedModelRenderer(this);
        this.leftForewing.setRotationPoint(0.0F, -1.2F, 0.85F);
        this.base.addChild(leftForewing);
        this.setRotateAngle(leftForewing, -0.0436F, 0.0044F, 0.0305F);
        this.leftForewing.cubeList.add(new ModelBox(leftForewing, 0, 45, 1.0F, -0.45F, 0.0F, 1, 1, 7, 0.01F, true));
        this.leftForewing.cubeList.add(new ModelBox(leftForewing, 0, 29, 0.0F, -0.45F, 0.0F, 1, 1, 8, 0.0F, true));

        this.rightForewing = new AdvancedModelRenderer(this);
        this.rightForewing.setRotationPoint(0.0F, -1.2F, 0.85F);
        this.base.addChild(rightForewing);
        this.setRotateAngle(rightForewing, -0.0436F, -0.0044F, -0.0305F);
        this.rightForewing.cubeList.add(new ModelBox(rightForewing, 0, 16, -2.0F, -0.45F, 0.0F, 1, 1, 7, 0.01F, false));
        this.rightForewing.cubeList.add(new ModelBox(rightForewing, 0, 0, -1.0F, -0.45F, 0.0F, 1, 1, 8, 0.0F, false));

        this.thorax = new AdvancedModelRenderer(this);
        this.thorax.setRotationPoint(0.0F, 0.0F, 0.75F);
        this.base.addChild(thorax);
        this.thorax.cubeList.add(new ModelBox(thorax, 16, 19, -1.0F, -1.0F, -3.05F, 2, 1, 3, 0.0F, false));

        this.rightLeg1 = new AdvancedModelRenderer(this);
        this.rightLeg1.setRotationPoint(-0.5F, 0.0F, -0.8F);
        this.thorax.addChild(rightLeg1);
        this.setRotateAngle(rightLeg1, 0.0873F, 0.0873F, -0.0873F);
        this.rightLeg1.cubeList.add(new ModelBox(rightLeg1, 18, 0, -4.0F, 0.0F, -3.5F, 4, 0, 4, 0.0F, false));

        this.leftLeg1 = new AdvancedModelRenderer(this);
        this.leftLeg1.setRotationPoint(0.5F, 0.0F, -0.8F);
        this.thorax.addChild(leftLeg1);
        this.setRotateAngle(leftLeg1, 0.0873F, -0.0873F, 0.0873F);
        this.leftLeg1.cubeList.add(new ModelBox(leftLeg1, 18, 0, 0.0F, 0.0F, -3.5F, 4, 0, 4, 0.0F, true));

        this.thorax2 = new AdvancedModelRenderer(this);
        this.thorax2.setRotationPoint(0.0F, -1.0F, -3.0F);
        this.thorax.addChild(thorax2);
        this.setRotateAngle(thorax2, 0.1745F, 0.0F, 0.0F);
        this.thorax2.cubeList.add(new ModelBox(thorax2, 18, 12, -1.0F, -0.2F, 0.0F, 2, 1, 3, 0.01F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(1.975F, 0.8F, 2.9F);
        this.thorax2.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.0F, 0.0873F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 0, 24, -1.0F, -1.0F, -3.0F, 1, 1, 3, 0.0F, true));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(-1.975F, 0.8F, 2.9F);
        this.thorax2.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.0F, -0.0873F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 0, 24, 0.0F, -1.0F, -3.0F, 1, 1, 3, 0.0F, false));

        this.head = new AdvancedModelRenderer(this);
        this.head.setRotationPoint(0.0F, -0.6F, -3.0F);
        this.thorax.addChild(head);
        this.setRotateAngle(head, 0.2618F, 0.0F, 0.0F);
        this.head.cubeList.add(new ModelBox(head, 16, 25, -1.0F, -0.5F, -1.1F, 2, 1, 1, 0.0F, false));
        this.head.cubeList.add(new ModelBox(head, 26, 19, -0.5F, -0.5F, -1.1F, 1, 1, 1, 0.01F, false));
        this.head.cubeList.add(new ModelBox(head, 22, 25, -1.0F, -0.5F, -0.6F, 2, 1, 1, 0.02F, false));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(0.5F, 0.1F, -1.1F);
        this.head.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.2618F, 0.5236F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 12, 27, 0.0F, -0.5F, -0.65F, 0, 1, 1, 0.0F, true));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(-0.5F, 0.1F, -1.1F);
        this.head.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.2618F, -0.5236F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 12, 27, 0.0F, -0.5F, -0.65F, 0, 1, 1, 0.0F, false));

        this.rightAntenna = new AdvancedModelRenderer(this);
        this.rightAntenna.setRotationPoint(-0.5F, -0.5F, -0.85F);
        this.head.addChild(rightAntenna);
        this.setRotateAngle(rightAntenna, 0.0F, -0.0873F, 0.2182F);
        this.rightAntenna.cubeList.add(new ModelBox(rightAntenna, 16, 23, -4.0F, 0.0F, -2.0F, 4, 0, 2, 0.0F, false));

        this.leftAntenna = new AdvancedModelRenderer(this);
        this.leftAntenna.setRotationPoint(0.5F, -0.5F, -0.85F);
        this.head.addChild(leftAntenna);
        this.setRotateAngle(leftAntenna, 0.0F, 0.0873F, -0.2182F);
        this.leftAntenna.cubeList.add(new ModelBox(leftAntenna, 16, 23, 0.0F, 0.0F, -2.0F, 4, 0, 2, 0.0F, true));
        updateDefaultPose();
        animator = ModelAnimator.create();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        animate((IAnimatedEntity) entity, f, f1, f2, f3, f4, f5);
        this.base.render(f5);
    }

    public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }

    public void renderStaticWall(float f) {
        this.setRotateAngle(base, 1.0F, 0.0F, 0.0F);
        this.base.offsetY = -0.25F;
        this.base.render(0.01F);
        resetToDefaultPose();
    }

    public void renderStaticFloor(float f) {
        this.base.render(0.01F);
        resetToDefaultPose();
    }

    public void renderStaticDisplayCase(float f) {
        //this.body.offsetZ = -0.080F;
        this.base.render(0.01f);
        resetToDefaultPose();
    }

    @Override
    public void renderStaticBook(float f) {
        //Rotations, positions and sizing:
        this.base.offsetY = -2.30F;
        this.base.offsetX = -0.05F;
        this.base.rotateAngleY = (float)Math.toRadians(210);
        this.base.rotateAngleX = (float)Math.toRadians(40);
        this.base.rotateAngleZ = (float)Math.toRadians(-8);
        this.base.scaleChildren = true;
        float scaler = 3.9F;
        this.base.setScale(scaler, scaler, scaler);
        //Start of pose:

        //End of pose, now render the model:
        this.base.render(f);
        //Reset rotations, positions and sizing:
        this.base.setScale(1.0F, 1.0F, 1.0F);
        this.base.scaleChildren = false;
        resetToDefaultPose();
    }

    @Override
    public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
        super.setRotationAngles(f, f1, f2, f3, f4, f5, e);

        EntityPrehistoricFloraMegalithomerus ee = (EntityPrehistoricFloraMegalithomerus) e;
        AdvancedModelRenderer[] Neck = {this.head};

        if (ee.getAnimation() != ee.LAY_ANIMATION && (!ee.getIsFlying()) && (!ee.getIsClimbing()) && (!ee.getIsFast())) {
            //Just bob the tail and neck a little bit
            this.chainSwing(Neck, 0.1F, 0.04F, 0.5, f2, 0.4F);
            this.chainWave(Neck, 0.2F, -0.02F, 0.5F, f2, 0.4F);
        }
    }

    @Override
    public void setLivingAnimations(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        super.setLivingAnimations(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
        this.resetToDefaultPose();
        EntityPrehistoricFloraMegalithomerus ee = (EntityPrehistoricFloraMegalithomerus) entitylivingbaseIn;

        if (ee.getIsFlying()) {//if flying
            animFlying(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
        } else {//not flying
            if(ee.getIsMoving()) {
                animWalking(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
            }

        }
        if (ee.getAnimation() == ee.STAND_ANIMATION) { //The idle scratch
            animIdle(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }

    }

    public void animIdle(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraMegalithomerus entity = (EntityPrehistoricFloraMegalithomerus) entitylivingbaseIn;
        int animCycle = 90;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (82.03659-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (6.06809-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (37.07723-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 8) {
            xx = 82.03659 + (((tickAnim - 3) / 5) * (180-(82.03659)));
            yy = 6.06809 + (((tickAnim - 3) / 5) * (0-(6.06809)));
            zz = 37.07723 + (((tickAnim - 3) / 5) * (0-(37.07723)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = 180 + (((tickAnim - 8) / 5) * (180-(180)));
            yy = 0 + (((tickAnim - 8) / 5) * (12.5-(0)));
            zz = 0 + (((tickAnim - 8) / 5) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 23) {
            xx = 180 + (((tickAnim - 13) / 10) * (180-(180)));
            yy = 12.5 + (((tickAnim - 13) / 10) * (-12.5-(12.5)));
            zz = 0 + (((tickAnim - 13) / 10) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 32) {
            xx = 180 + (((tickAnim - 23) / 9) * (180-(180)));
            yy = -12.5 + (((tickAnim - 23) / 9) * (12.5-(-12.5)));
            zz = 0 + (((tickAnim - 23) / 9) * (0-(0)));
        }
        else if (tickAnim >= 32 && tickAnim < 42) {
            xx = 180 + (((tickAnim - 32) / 10) * (180-(180)));
            yy = 12.5 + (((tickAnim - 32) / 10) * (-12.5-(12.5)));
            zz = 0 + (((tickAnim - 32) / 10) * (0-(0)));
        }
        else if (tickAnim >= 42 && tickAnim < 50) {
            xx = 180 + (((tickAnim - 42) / 8) * (180-(180)));
            yy = -12.5 + (((tickAnim - 42) / 8) * (12.5-(-12.5)));
            zz = 0 + (((tickAnim - 42) / 8) * (0-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 61) {
            xx = 180 + (((tickAnim - 50) / 11) * (180-(180)));
            yy = 12.5 + (((tickAnim - 50) / 11) * (0-(12.5)));
            zz = 0 + (((tickAnim - 50) / 11) * (0-(0)));
        }
        else if (tickAnim >= 61 && tickAnim < 71) {
            xx = 180 + (((tickAnim - 61) / 10) * (180-(180)));
            yy = 0 + (((tickAnim - 61) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 61) / 10) * (0-(0)));
        }
        else if (tickAnim >= 71 && tickAnim < 81) {
            xx = 180 + (((tickAnim - 71) / 10) * (0-(180)));
            yy = 0 + (((tickAnim - 71) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 71) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(base, base.rotateAngleX + (float) Math.toRadians(xx), base.rotateAngleY + (float) Math.toRadians(yy), base.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (5.46-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 3) / 5) * (0-(0)));
            yy = 5.46 + (((tickAnim - 3) / 5) * (1-(5.46)));
            zz = 0 + (((tickAnim - 3) / 5) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 61) {
            xx = 0 + (((tickAnim - 8) / 53) * (0-(0)));
            yy = 1 + (((tickAnim - 8) / 53) * (1-(1)));
            zz = 0 + (((tickAnim - 8) / 53) * (0-(0)));
        }
        else if (tickAnim >= 61 && tickAnim < 71) {
            xx = 0 + (((tickAnim - 61) / 10) * (0-(0)));
            yy = 1 + (((tickAnim - 61) / 10) * (1-(1)));
            zz = 0 + (((tickAnim - 61) / 10) * (0-(0)));
        }
        else if (tickAnim >= 71 && tickAnim < 76) {
            xx = 0 + (((tickAnim - 71) / 5) * (0-(0)));
            yy = 1 + (((tickAnim - 71) / 5) * (20-(1)));
            zz = 0 + (((tickAnim - 71) / 5) * (0-(0)));
        }
        else if (tickAnim >= 76 && tickAnim < 81) {
            xx = 0 + (((tickAnim - 76) / 5) * (0-(0)));
            yy = 20 + (((tickAnim - 76) / 5) * (0-(20)));
            zz = 0 + (((tickAnim - 76) / 5) * (0-(0)));
        }
        else if (tickAnim >= 81 && tickAnim < 91) {
            xx = 0 + (((tickAnim - 81) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 81) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 81) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.base.rotationPointX = this.base.rotationPointX + (float)(xx);
        this.base.rotationPointY = this.base.rotationPointY - (float)(yy);
        this.base.rotationPointZ = this.base.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 8) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 8) / 5) * (12.5-(0)));
            zz = 0 + (((tickAnim - 8) / 5) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 13) / 10) * (0-(0)));
            yy = 12.5 + (((tickAnim - 13) / 10) * (-12.5-(12.5)));
            zz = 0 + (((tickAnim - 13) / 10) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 32) {
            xx = 0 + (((tickAnim - 23) / 9) * (0-(0)));
            yy = -12.5 + (((tickAnim - 23) / 9) * (12.5-(-12.5)));
            zz = 0 + (((tickAnim - 23) / 9) * (0-(0)));
        }
        else if (tickAnim >= 32 && tickAnim < 42) {
            xx = 0 + (((tickAnim - 32) / 10) * (0-(0)));
            yy = 12.5 + (((tickAnim - 32) / 10) * (-12.5-(12.5)));
            zz = 0 + (((tickAnim - 32) / 10) * (0-(0)));
        }
        else if (tickAnim >= 42 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 42) / 8) * (0-(0)));
            yy = -12.5 + (((tickAnim - 42) / 8) * (12.5-(-12.5)));
            zz = 0 + (((tickAnim - 42) / 8) * (0-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 61) {
            xx = 0 + (((tickAnim - 50) / 11) * (0-(0)));
            yy = 12.5 + (((tickAnim - 50) / 11) * (0-(12.5)));
            zz = 0 + (((tickAnim - 50) / 11) * (0-(0)));
        }
        else if (tickAnim >= 61 && tickAnim < 71) {
            xx = 0 + (((tickAnim - 61) / 10) * (17.5-(0)));
            yy = 0 + (((tickAnim - 61) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 61) / 10) * (0-(0)));
        }
        else if (tickAnim >= 71 && tickAnim < 72) {
            xx = 17.5 + (((tickAnim - 71) / 1) * (-32.5-(17.5)));
            yy = 0 + (((tickAnim - 71) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 71) / 1) * (0-(0)));
        }
        else if (tickAnim >= 72 && tickAnim < 73) {
            xx = -32.5 + (((tickAnim - 72) / 1) * (-32.5-(-32.5)));
            yy = 0 + (((tickAnim - 72) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 72) / 1) * (0-(0)));
        }
        else if (tickAnim >= 73 && tickAnim < 76) {
            xx = -32.5 + (((tickAnim - 73) / 3) * (-32.5-(-32.5)));
            yy = 0 + (((tickAnim - 73) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 73) / 3) * (0-(0)));
        }
        else if (tickAnim >= 76 && tickAnim < 81) {
            xx = -32.5 + (((tickAnim - 76) / 5) * (0-(-32.5)));
            yy = 0 + (((tickAnim - 76) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 76) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(thorax, thorax.rotateAngleX + (float) Math.toRadians(xx), thorax.rotateAngleY + (float) Math.toRadians(yy), thorax.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (-45-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 8) / 5) * (0-(0)));
            yy = -45 + (((tickAnim - 8) / 5) * (-45-(-45)));
            zz = 0 + (((tickAnim - 8) / 5) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 13) / 10) * (5.41253-(0)));
            yy = -45 + (((tickAnim - 13) / 10) * (-16.94081-(-45)));
            zz = 0 + (((tickAnim - 13) / 10) * (-22.93326-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 32) {
            xx = 5.41253 + (((tickAnim - 23) / 9) * (0-(5.41253)));
            yy = -16.94081 + (((tickAnim - 23) / 9) * (-45-(-16.94081)));
            zz = -22.93326 + (((tickAnim - 23) / 9) * (0-(-22.93326)));
        }
        else if (tickAnim >= 32 && tickAnim < 42) {
            xx = 0 + (((tickAnim - 32) / 10) * (5.41253-(0)));
            yy = -45 + (((tickAnim - 32) / 10) * (-16.94081-(-45)));
            zz = 0 + (((tickAnim - 32) / 10) * (-22.93326-(0)));
        }
        else if (tickAnim >= 42 && tickAnim < 50) {
            xx = 5.41253 + (((tickAnim - 42) / 8) * (0-(5.41253)));
            yy = -16.94081 + (((tickAnim - 42) / 8) * (-45-(-16.94081)));
            zz = -22.93326 + (((tickAnim - 42) / 8) * (0-(-22.93326)));
        }
        else if (tickAnim >= 50 && tickAnim < 61) {
            xx = 0 + (((tickAnim - 50) / 11) * (5.41253-(0)));
            yy = -45 + (((tickAnim - 50) / 11) * (-16.94081-(-45)));
            zz = 0 + (((tickAnim - 50) / 11) * (-22.93326-(0)));
        }
        else if (tickAnim >= 61 && tickAnim < 76) {
            xx = 5.41253 + (((tickAnim - 61) / 15) * (0-(5.41253)));
            yy = -16.94081 + (((tickAnim - 61) / 15) * (-45-(-16.94081)));
            zz = -22.93326 + (((tickAnim - 61) / 15) * (0-(-22.93326)));
        }
        else if (tickAnim >= 76 && tickAnim < 81) {
            xx = 0 + (((tickAnim - 76) / 5) * (0-(0)));
            yy = -45 + (((tickAnim - 76) / 5) * (0-(-45)));
            zz = 0 + (((tickAnim - 76) / 5) * (0-(0)));
        }
        else if (tickAnim >= 81 && tickAnim < 91) {
            xx = 0 + (((tickAnim - 81) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 81) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 81) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg1, rightLeg1.rotateAngleX + (float) Math.toRadians(xx), rightLeg1.rotateAngleY + (float) Math.toRadians(yy), rightLeg1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (40-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 8) / 5) * (-3.65721-(0)));
            yy = 40 + (((tickAnim - 8) / 5) * (10.77886-(40)));
            zz = 0 + (((tickAnim - 8) / 5) * (-22.72728-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 23) {
            xx = -3.65721 + (((tickAnim - 13) / 10) * (0-(-3.65721)));
            yy = 10.77886 + (((tickAnim - 13) / 10) * (40-(10.77886)));
            zz = -22.72728 + (((tickAnim - 13) / 10) * (0-(-22.72728)));
        }
        else if (tickAnim >= 23 && tickAnim < 32) {
            xx = 0 + (((tickAnim - 23) / 9) * (-3.65721-(0)));
            yy = 40 + (((tickAnim - 23) / 9) * (10.77886-(40)));
            zz = 0 + (((tickAnim - 23) / 9) * (-22.72728-(0)));
        }
        else if (tickAnim >= 32 && tickAnim < 42) {
            xx = -3.65721 + (((tickAnim - 32) / 10) * (0-(-3.65721)));
            yy = 10.77886 + (((tickAnim - 32) / 10) * (40-(10.77886)));
            zz = -22.72728 + (((tickAnim - 32) / 10) * (0-(-22.72728)));
        }
        else if (tickAnim >= 42 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 42) / 8) * (-3.65721-(0)));
            yy = 40 + (((tickAnim - 42) / 8) * (10.77886-(40)));
            zz = 0 + (((tickAnim - 42) / 8) * (-22.72728-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 61) {
            xx = -3.65721 + (((tickAnim - 50) / 11) * (0-(-3.65721)));
            yy = 10.77886 + (((tickAnim - 50) / 11) * (40-(10.77886)));
            zz = -22.72728 + (((tickAnim - 50) / 11) * (0-(-22.72728)));
        }
        else if (tickAnim >= 61 && tickAnim < 76) {
            xx = 0 + (((tickAnim - 61) / 15) * (0-(0)));
            yy = 40 + (((tickAnim - 61) / 15) * (40-(40)));
            zz = 0 + (((tickAnim - 61) / 15) * (0-(0)));
        }
        else if (tickAnim >= 76 && tickAnim < 81) {
            xx = 0 + (((tickAnim - 76) / 5) * (0-(0)));
            yy = 40 + (((tickAnim - 76) / 5) * (0-(40)));
            zz = 0 + (((tickAnim - 76) / 5) * (0-(0)));
        }
        else if (tickAnim >= 81 && tickAnim < 91) {
            xx = 0 + (((tickAnim - 81) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 81) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 81) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg2, rightLeg2.rotateAngleX + (float) Math.toRadians(xx), rightLeg2.rotateAngleY + (float) Math.toRadians(yy), rightLeg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (40-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 8) / 5) * (0-(0)));
            yy = 40 + (((tickAnim - 8) / 5) * (40-(40)));
            zz = 0 + (((tickAnim - 8) / 5) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 13) / 10) * (-14.56049-(0)));
            yy = 40 + (((tickAnim - 13) / 10) * (11.24185-(40)));
            zz = 0 + (((tickAnim - 13) / 10) * (-15.62389-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 32) {
            xx = -14.56049 + (((tickAnim - 23) / 9) * (0-(-14.56049)));
            yy = 11.24185 + (((tickAnim - 23) / 9) * (40-(11.24185)));
            zz = -15.62389 + (((tickAnim - 23) / 9) * (0-(-15.62389)));
        }
        else if (tickAnim >= 32 && tickAnim < 42) {
            xx = 0 + (((tickAnim - 32) / 10) * (-14.56049-(0)));
            yy = 40 + (((tickAnim - 32) / 10) * (11.24185-(40)));
            zz = 0 + (((tickAnim - 32) / 10) * (-15.62389-(0)));
        }
        else if (tickAnim >= 42 && tickAnim < 50) {
            xx = -14.56049 + (((tickAnim - 42) / 8) * (0-(-14.56049)));
            yy = 11.24185 + (((tickAnim - 42) / 8) * (40-(11.24185)));
            zz = -15.62389 + (((tickAnim - 42) / 8) * (0-(-15.62389)));
        }
        else if (tickAnim >= 50 && tickAnim < 61) {
            xx = 0 + (((tickAnim - 50) / 11) * (-14.56049-(0)));
            yy = 40 + (((tickAnim - 50) / 11) * (11.24185-(40)));
            zz = 0 + (((tickAnim - 50) / 11) * (-15.62389-(0)));
        }
        else if (tickAnim >= 61 && tickAnim < 76) {
            xx = -14.56049 + (((tickAnim - 61) / 15) * (0-(-14.56049)));
            yy = 11.24185 + (((tickAnim - 61) / 15) * (40-(11.24185)));
            zz = -15.62389 + (((tickAnim - 61) / 15) * (0-(-15.62389)));
        }
        else if (tickAnim >= 76 && tickAnim < 81) {
            xx = 0 + (((tickAnim - 76) / 5) * (0-(0)));
            yy = 40 + (((tickAnim - 76) / 5) * (0-(40)));
            zz = 0 + (((tickAnim - 76) / 5) * (0-(0)));
        }
        else if (tickAnim >= 81 && tickAnim < 91) {
            xx = 0 + (((tickAnim - 81) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 81) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 81) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg3, rightLeg3.rotateAngleX + (float) Math.toRadians(xx), rightLeg3.rotateAngleY + (float) Math.toRadians(yy), rightLeg3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (45-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 8) / 5) * (5.41253-(0)));
            yy = 45 + (((tickAnim - 8) / 5) * (16.94081-(45)));
            zz = 0 + (((tickAnim - 8) / 5) * (22.93326-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 23) {
            xx = 5.41253 + (((tickAnim - 13) / 10) * (0-(5.41253)));
            yy = 16.94081 + (((tickAnim - 13) / 10) * (45-(16.94081)));
            zz = 22.93326 + (((tickAnim - 13) / 10) * (0-(22.93326)));
        }
        else if (tickAnim >= 23 && tickAnim < 32) {
            xx = 0 + (((tickAnim - 23) / 9) * (5.41253-(0)));
            yy = 45 + (((tickAnim - 23) / 9) * (16.94081-(45)));
            zz = 0 + (((tickAnim - 23) / 9) * (22.93326-(0)));
        }
        else if (tickAnim >= 32 && tickAnim < 42) {
            xx = 5.41253 + (((tickAnim - 32) / 10) * (0-(5.41253)));
            yy = 16.94081 + (((tickAnim - 32) / 10) * (45-(16.94081)));
            zz = 22.93326 + (((tickAnim - 32) / 10) * (0-(22.93326)));
        }
        else if (tickAnim >= 42 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 42) / 8) * (5.41253-(0)));
            yy = 45 + (((tickAnim - 42) / 8) * (16.94081-(45)));
            zz = 0 + (((tickAnim - 42) / 8) * (22.93326-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 61) {
            xx = 5.41253 + (((tickAnim - 50) / 11) * (0-(5.41253)));
            yy = 16.94081 + (((tickAnim - 50) / 11) * (45-(16.94081)));
            zz = 22.93326 + (((tickAnim - 50) / 11) * (0-(22.93326)));
        }
        else if (tickAnim >= 61 && tickAnim < 76) {
            xx = 0 + (((tickAnim - 61) / 15) * (0-(0)));
            yy = 45 + (((tickAnim - 61) / 15) * (45-(45)));
            zz = 0 + (((tickAnim - 61) / 15) * (0-(0)));
        }
        else if (tickAnim >= 76 && tickAnim < 81) {
            xx = 0 + (((tickAnim - 76) / 5) * (0-(0)));
            yy = 45 + (((tickAnim - 76) / 5) * (0-(45)));
            zz = 0 + (((tickAnim - 76) / 5) * (0-(0)));
        }
        else if (tickAnim >= 81 && tickAnim < 91) {
            xx = 0 + (((tickAnim - 81) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 81) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 81) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg1, leftLeg1.rotateAngleX + (float) Math.toRadians(xx), leftLeg1.rotateAngleY + (float) Math.toRadians(yy), leftLeg1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (-40-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 8) / 5) * (0-(0)));
            yy = -40 + (((tickAnim - 8) / 5) * (-40-(-40)));
            zz = 0 + (((tickAnim - 8) / 5) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 13) / 10) * (-3.65721-(0)));
            yy = -40 + (((tickAnim - 13) / 10) * (-10.77886-(-40)));
            zz = 0 + (((tickAnim - 13) / 10) * (22.72728-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 32) {
            xx = -3.65721 + (((tickAnim - 23) / 9) * (0-(-3.65721)));
            yy = -10.77886 + (((tickAnim - 23) / 9) * (-40-(-10.77886)));
            zz = 22.72728 + (((tickAnim - 23) / 9) * (0-(22.72728)));
        }
        else if (tickAnim >= 32 && tickAnim < 42) {
            xx = 0 + (((tickAnim - 32) / 10) * (-3.65721-(0)));
            yy = -40 + (((tickAnim - 32) / 10) * (-10.77886-(-40)));
            zz = 0 + (((tickAnim - 32) / 10) * (22.72728-(0)));
        }
        else if (tickAnim >= 42 && tickAnim < 50) {
            xx = -3.65721 + (((tickAnim - 42) / 8) * (0-(-3.65721)));
            yy = -10.77886 + (((tickAnim - 42) / 8) * (-40-(-10.77886)));
            zz = 22.72728 + (((tickAnim - 42) / 8) * (0-(22.72728)));
        }
        else if (tickAnim >= 50 && tickAnim < 61) {
            xx = 0 + (((tickAnim - 50) / 11) * (-3.65721-(0)));
            yy = -40 + (((tickAnim - 50) / 11) * (-10.77886-(-40)));
            zz = 0 + (((tickAnim - 50) / 11) * (22.72728-(0)));
        }
        else if (tickAnim >= 61 && tickAnim < 76) {
            xx = -3.65721 + (((tickAnim - 61) / 15) * (0-(-3.65721)));
            yy = -10.77886 + (((tickAnim - 61) / 15) * (-40-(-10.77886)));
            zz = 22.72728 + (((tickAnim - 61) / 15) * (0-(22.72728)));
        }
        else if (tickAnim >= 76 && tickAnim < 81) {
            xx = 0 + (((tickAnim - 76) / 5) * (0-(0)));
            yy = -40 + (((tickAnim - 76) / 5) * (0-(-40)));
            zz = 0 + (((tickAnim - 76) / 5) * (0-(0)));
        }
        else if (tickAnim >= 81 && tickAnim < 91) {
            xx = 0 + (((tickAnim - 81) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 81) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 81) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg2, leftLeg2.rotateAngleX + (float) Math.toRadians(xx), leftLeg2.rotateAngleY + (float) Math.toRadians(yy), leftLeg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (-40-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 8) / 5) * (-14.56049-(0)));
            yy = -40 + (((tickAnim - 8) / 5) * (-11.24185-(-40)));
            zz = 0 + (((tickAnim - 8) / 5) * (15.62389-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 23) {
            xx = -14.56049 + (((tickAnim - 13) / 10) * (0-(-14.56049)));
            yy = -11.24185 + (((tickAnim - 13) / 10) * (-40-(-11.24185)));
            zz = 15.62389 + (((tickAnim - 13) / 10) * (0-(15.62389)));
        }
        else if (tickAnim >= 23 && tickAnim < 32) {
            xx = 0 + (((tickAnim - 23) / 9) * (-14.56049-(0)));
            yy = -40 + (((tickAnim - 23) / 9) * (-11.24185-(-40)));
            zz = 0 + (((tickAnim - 23) / 9) * (15.62389-(0)));
        }
        else if (tickAnim >= 32 && tickAnim < 42) {
            xx = -14.56049 + (((tickAnim - 32) / 10) * (0-(-14.56049)));
            yy = -11.24185 + (((tickAnim - 32) / 10) * (-40-(-11.24185)));
            zz = 15.62389 + (((tickAnim - 32) / 10) * (0-(15.62389)));
        }
        else if (tickAnim >= 42 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 42) / 8) * (-14.56049-(0)));
            yy = -40 + (((tickAnim - 42) / 8) * (-11.24185-(-40)));
            zz = 0 + (((tickAnim - 42) / 8) * (15.62389-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 61) {
            xx = -14.56049 + (((tickAnim - 50) / 11) * (0-(-14.56049)));
            yy = -11.24185 + (((tickAnim - 50) / 11) * (-40-(-11.24185)));
            zz = 15.62389 + (((tickAnim - 50) / 11) * (0-(15.62389)));
        }
        else if (tickAnim >= 61 && tickAnim < 75) {
            xx = 0 + (((tickAnim - 61) / 14) * (0-(0)));
            yy = -40 + (((tickAnim - 61) / 14) * (-40-(-40)));
            zz = 0 + (((tickAnim - 61) / 14) * (0-(0)));
        }
        else if (tickAnim >= 75 && tickAnim < 80) {
            xx = 0 + (((tickAnim - 75) / 5) * (0-(0)));
            yy = -40 + (((tickAnim - 75) / 5) * (0-(-40)));
            zz = 0 + (((tickAnim - 75) / 5) * (0-(0)));
        }
        else if (tickAnim >= 80 && tickAnim < 90) {
            xx = 0 + (((tickAnim - 80) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 80) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 80) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg3, leftLeg3.rotateAngleX + (float) Math.toRadians(xx), leftLeg3.rotateAngleY + (float) Math.toRadians(yy), leftLeg3.rotateAngleZ + (float) Math.toRadians(zz));

    }
    public void animFlying(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraMegalithomerus entity = (EntityPrehistoricFloraMegalithomerus) entitylivingbaseIn;
        int animCycle = 38;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;

        if (tickAnim >= 0 && tickAnim < 1) {
            xx = 2.47864 + (((tickAnim - 0) / 1) * (55.88178-(2.47864)));
            yy = -89.67379 + (((tickAnim - 0) / 1) * (-82.99194-(-89.67379)));
            zz = 82.50706 + (((tickAnim - 0) / 1) * (-5.6216-(82.50706)));
        }
        else if (tickAnim >= 1 && tickAnim < 2) {
            xx = 55.88178 + (((tickAnim - 1) / 1) * (-2.30991-(55.88178)));
            yy = -82.99194 + (((tickAnim - 1) / 1) * (-89.04355-(-82.99194)));
            zz = -5.6216 + (((tickAnim - 1) / 1) * (-67.51928-(-5.6216)));
        }
        else if (tickAnim >= 2 && tickAnim < 2) {
            xx = -2.30991 + (((tickAnim - 2) / 0) * (-48.17726-(-2.30991)));
            yy = -89.04355 + (((tickAnim - 2) / 0) * (-76.177-(-89.04355)));
            zz = -67.51928 + (((tickAnim - 2) / 0) * (22.54041-(-67.51928)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = -48.17726 + (((tickAnim - 2) / 1) * (2.47864-(-48.17726)));
            yy = -76.177 + (((tickAnim - 2) / 1) * (-89.67379-(-76.177)));
            zz = 22.54041 + (((tickAnim - 2) / 1) * (82.50706-(22.54041)));
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = 2.47864 + (((tickAnim - 3) / 1) * (55.88178-(2.47864)));
            yy = -89.67379 + (((tickAnim - 3) / 1) * (-82.99194-(-89.67379)));
            zz = 82.50706 + (((tickAnim - 3) / 1) * (-5.6216-(82.50706)));
        }
        else if (tickAnim >= 4 && tickAnim < 5) {
            xx = 55.88178 + (((tickAnim - 4) / 1) * (-2.30991-(55.88178)));
            yy = -82.99194 + (((tickAnim - 4) / 1) * (-89.04355-(-82.99194)));
            zz = -5.6216 + (((tickAnim - 4) / 1) * (-67.51928-(-5.6216)));
        }
        else if (tickAnim >= 5 && tickAnim < 6) {
            xx = -2.30991 + (((tickAnim - 5) / 1) * (-48.17726-(-2.30991)));
            yy = -89.04355 + (((tickAnim - 5) / 1) * (-76.177-(-89.04355)));
            zz = -67.51928 + (((tickAnim - 5) / 1) * (22.54041-(-67.51928)));
        }
        else if (tickAnim >= 6 && tickAnim < 6) {
            xx = -48.17726 + (((tickAnim - 6) / 0) * (2.47864-(-48.17726)));
            yy = -76.177 + (((tickAnim - 6) / 0) * (-89.67379-(-76.177)));
            zz = 22.54041 + (((tickAnim - 6) / 0) * (82.50706-(22.54041)));
        }
        else if (tickAnim >= 6 && tickAnim < 7) {
            xx = 2.47864 + (((tickAnim - 6) / 1) * (55.88178-(2.47864)));
            yy = -89.67379 + (((tickAnim - 6) / 1) * (-82.99194-(-89.67379)));
            zz = 82.50706 + (((tickAnim - 6) / 1) * (-5.6216-(82.50706)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = 55.88178 + (((tickAnim - 7) / 1) * (-2.30991-(55.88178)));
            yy = -82.99194 + (((tickAnim - 7) / 1) * (-89.04355-(-82.99194)));
            zz = -5.6216 + (((tickAnim - 7) / 1) * (-67.51928-(-5.6216)));
        }
        else if (tickAnim >= 8 && tickAnim < 9) {
            xx = -2.30991 + (((tickAnim - 8) / 1) * (-48.17726-(-2.30991)));
            yy = -89.04355 + (((tickAnim - 8) / 1) * (-76.177-(-89.04355)));
            zz = -67.51928 + (((tickAnim - 8) / 1) * (22.54041-(-67.51928)));
        }
        else if (tickAnim >= 9 && tickAnim < 10) {
            xx = -48.17726 + (((tickAnim - 9) / 1) * (2.47864-(-48.17726)));
            yy = -76.177 + (((tickAnim - 9) / 1) * (-89.67379-(-76.177)));
            zz = 22.54041 + (((tickAnim - 9) / 1) * (82.50706-(22.54041)));
        }
        else if (tickAnim >= 10 && tickAnim < 10) {
            xx = 2.47864 + (((tickAnim - 10) / 0) * (55.88178-(2.47864)));
            yy = -89.67379 + (((tickAnim - 10) / 0) * (-82.99194-(-89.67379)));
            zz = 82.50706 + (((tickAnim - 10) / 0) * (-5.6216-(82.50706)));
        }
        else if (tickAnim >= 10 && tickAnim < 11) {
            xx = 55.88178 + (((tickAnim - 10) / 1) * (-2.30991-(55.88178)));
            yy = -82.99194 + (((tickAnim - 10) / 1) * (-89.04355-(-82.99194)));
            zz = -5.6216 + (((tickAnim - 10) / 1) * (-67.51928-(-5.6216)));
        }
        else if (tickAnim >= 11 && tickAnim < 12) {
            xx = -2.30991 + (((tickAnim - 11) / 1) * (-48.17726-(-2.30991)));
            yy = -89.04355 + (((tickAnim - 11) / 1) * (-76.177-(-89.04355)));
            zz = -67.51928 + (((tickAnim - 11) / 1) * (22.54041-(-67.51928)));
        }
        else if (tickAnim >= 12 && tickAnim < 13) {
            xx = -48.17726 + (((tickAnim - 12) / 1) * (2.47864-(-48.17726)));
            yy = -76.177 + (((tickAnim - 12) / 1) * (-89.67379-(-76.177)));
            zz = 22.54041 + (((tickAnim - 12) / 1) * (82.50706-(22.54041)));
        }
        else if (tickAnim >= 13 && tickAnim < 14) {
            xx = 2.47864 + (((tickAnim - 13) / 1) * (55.88178-(2.47864)));
            yy = -89.67379 + (((tickAnim - 13) / 1) * (-82.99194-(-89.67379)));
            zz = 82.50706 + (((tickAnim - 13) / 1) * (-5.6216-(82.50706)));
        }
        else if (tickAnim >= 14 && tickAnim < 14) {
            xx = 55.88178 + (((tickAnim - 14) / 0) * (-2.30991-(55.88178)));
            yy = -82.99194 + (((tickAnim - 14) / 0) * (-89.04355-(-82.99194)));
            zz = -5.6216 + (((tickAnim - 14) / 0) * (-67.51928-(-5.6216)));
        }
        else if (tickAnim >= 14 && tickAnim < 15) {
            xx = -2.30991 + (((tickAnim - 14) / 1) * (-48.17726-(-2.30991)));
            yy = -89.04355 + (((tickAnim - 14) / 1) * (-76.177-(-89.04355)));
            zz = -67.51928 + (((tickAnim - 14) / 1) * (22.54041-(-67.51928)));
        }
        else if (tickAnim >= 15 && tickAnim < 16) {
            xx = -48.17726 + (((tickAnim - 15) / 1) * (2.47864-(-48.17726)));
            yy = -76.177 + (((tickAnim - 15) / 1) * (-89.67379-(-76.177)));
            zz = 22.54041 + (((tickAnim - 15) / 1) * (82.50706-(22.54041)));
        }
        else if (tickAnim >= 16 && tickAnim < 17) {
            xx = 2.47864 + (((tickAnim - 16) / 1) * (55.88178-(2.47864)));
            yy = -89.67379 + (((tickAnim - 16) / 1) * (-82.99194-(-89.67379)));
            zz = 82.50706 + (((tickAnim - 16) / 1) * (-5.6216-(82.50706)));
        }
        else if (tickAnim >= 17 && tickAnim < 18) {
            xx = 55.88178 + (((tickAnim - 17) / 1) * (-2.30991-(55.88178)));
            yy = -82.99194 + (((tickAnim - 17) / 1) * (-89.04355-(-82.99194)));
            zz = -5.6216 + (((tickAnim - 17) / 1) * (-67.51928-(-5.6216)));
        }
        else if (tickAnim >= 18 && tickAnim < 18) {
            xx = -2.30991 + (((tickAnim - 18) / 0) * (-48.17726-(-2.30991)));
            yy = -89.04355 + (((tickAnim - 18) / 0) * (-76.177-(-89.04355)));
            zz = -67.51928 + (((tickAnim - 18) / 0) * (22.54041-(-67.51928)));
        }
        else if (tickAnim >= 18 && tickAnim < 19) {
            xx = -48.17726 + (((tickAnim - 18) / 1) * (2.47864-(-48.17726)));
            yy = -76.177 + (((tickAnim - 18) / 1) * (-89.67379-(-76.177)));
            zz = 22.54041 + (((tickAnim - 18) / 1) * (82.50706-(22.54041)));
        }
        else if (tickAnim >= 19 && tickAnim < 20) {
            xx = 2.47864 + (((tickAnim - 19) / 1) * (55.88178-(2.47864)));
            yy = -89.67379 + (((tickAnim - 19) / 1) * (-82.99194-(-89.67379)));
            zz = 82.50706 + (((tickAnim - 19) / 1) * (-5.6216-(82.50706)));
        }
        else if (tickAnim >= 20 && tickAnim < 21) {
            xx = 55.88178 + (((tickAnim - 20) / 1) * (-2.30991-(55.88178)));
            yy = -82.99194 + (((tickAnim - 20) / 1) * (-89.04355-(-82.99194)));
            zz = -5.6216 + (((tickAnim - 20) / 1) * (-67.51928-(-5.6216)));
        }
        else if (tickAnim >= 21 && tickAnim < 22) {
            xx = -2.30991 + (((tickAnim - 21) / 1) * (-48.17726-(-2.30991)));
            yy = -89.04355 + (((tickAnim - 21) / 1) * (-76.177-(-89.04355)));
            zz = -67.51928 + (((tickAnim - 21) / 1) * (22.54041-(-67.51928)));
        }
        else if (tickAnim >= 22 && tickAnim < 22) {
            xx = -48.17726 + (((tickAnim - 22) / 0) * (2.47864-(-48.17726)));
            yy = -76.177 + (((tickAnim - 22) / 0) * (-89.67379-(-76.177)));
            zz = 22.54041 + (((tickAnim - 22) / 0) * (82.50706-(22.54041)));
        }
        else if (tickAnim >= 22 && tickAnim < 23) {
            xx = 2.47864 + (((tickAnim - 22) / 1) * (55.88178-(2.47864)));
            yy = -89.67379 + (((tickAnim - 22) / 1) * (-82.99194-(-89.67379)));
            zz = 82.50706 + (((tickAnim - 22) / 1) * (-5.6216-(82.50706)));
        }
        else if (tickAnim >= 23 && tickAnim < 24) {
            xx = 55.88178 + (((tickAnim - 23) / 1) * (-2.30991-(55.88178)));
            yy = -82.99194 + (((tickAnim - 23) / 1) * (-89.04355-(-82.99194)));
            zz = -5.6216 + (((tickAnim - 23) / 1) * (-67.51928-(-5.6216)));
        }
        else if (tickAnim >= 24 && tickAnim < 25) {
            xx = -2.30991 + (((tickAnim - 24) / 1) * (-48.17726-(-2.30991)));
            yy = -89.04355 + (((tickAnim - 24) / 1) * (-76.177-(-89.04355)));
            zz = -67.51928 + (((tickAnim - 24) / 1) * (22.54041-(-67.51928)));
        }
        else if (tickAnim >= 25 && tickAnim < 26) {
            xx = -48.17726 + (((tickAnim - 25) / 1) * (2.47864-(-48.17726)));
            yy = -76.177 + (((tickAnim - 25) / 1) * (-89.67379-(-76.177)));
            zz = 22.54041 + (((tickAnim - 25) / 1) * (82.50706-(22.54041)));
        }
        else if (tickAnim >= 26 && tickAnim < 26) {
            xx = 2.47864 + (((tickAnim - 26) / 0) * (55.88178-(2.47864)));
            yy = -89.67379 + (((tickAnim - 26) / 0) * (-82.99194-(-89.67379)));
            zz = 82.50706 + (((tickAnim - 26) / 0) * (-5.6216-(82.50706)));
        }
        else if (tickAnim >= 26 && tickAnim < 27) {
            xx = 55.88178 + (((tickAnim - 26) / 1) * (-2.30991-(55.88178)));
            yy = -82.99194 + (((tickAnim - 26) / 1) * (-89.04355-(-82.99194)));
            zz = -5.6216 + (((tickAnim - 26) / 1) * (-67.51928-(-5.6216)));
        }
        else if (tickAnim >= 27 && tickAnim < 28) {
            xx = -2.30991 + (((tickAnim - 27) / 1) * (-48.17726-(-2.30991)));
            yy = -89.04355 + (((tickAnim - 27) / 1) * (-76.177-(-89.04355)));
            zz = -67.51928 + (((tickAnim - 27) / 1) * (22.54041-(-67.51928)));
        }
        else if (tickAnim >= 28 && tickAnim < 29) {
            xx = -48.17726 + (((tickAnim - 28) / 1) * (2.47864-(-48.17726)));
            yy = -76.177 + (((tickAnim - 28) / 1) * (-89.67379-(-76.177)));
            zz = 22.54041 + (((tickAnim - 28) / 1) * (82.50706-(22.54041)));
        }
        else if (tickAnim >= 29 && tickAnim < 30) {
            xx = 2.47864 + (((tickAnim - 29) / 1) * (55.88178-(2.47864)));
            yy = -89.67379 + (((tickAnim - 29) / 1) * (-82.99194-(-89.67379)));
            zz = 82.50706 + (((tickAnim - 29) / 1) * (-5.6216-(82.50706)));
        }
        else if (tickAnim >= 30 && tickAnim < 30) {
            xx = 55.88178 + (((tickAnim - 30) / 0) * (-2.30991-(55.88178)));
            yy = -82.99194 + (((tickAnim - 30) / 0) * (-89.04355-(-82.99194)));
            zz = -5.6216 + (((tickAnim - 30) / 0) * (-67.51928-(-5.6216)));
        }
        else if (tickAnim >= 30 && tickAnim < 31) {
            xx = -2.30991 + (((tickAnim - 30) / 1) * (-48.17726-(-2.30991)));
            yy = -89.04355 + (((tickAnim - 30) / 1) * (-76.177-(-89.04355)));
            zz = -67.51928 + (((tickAnim - 30) / 1) * (22.54041-(-67.51928)));
        }
        else if (tickAnim >= 31 && tickAnim < 32) {
            xx = -48.17726 + (((tickAnim - 31) / 1) * (2.47864-(-48.17726)));
            yy = -76.177 + (((tickAnim - 31) / 1) * (-89.67379-(-76.177)));
            zz = 22.54041 + (((tickAnim - 31) / 1) * (82.50706-(22.54041)));
        }
        else if (tickAnim >= 32 && tickAnim < 33) {
            xx = 2.47864 + (((tickAnim - 32) / 1) * (55.88178-(2.47864)));
            yy = -89.67379 + (((tickAnim - 32) / 1) * (-82.99194-(-89.67379)));
            zz = 82.50706 + (((tickAnim - 32) / 1) * (-5.6216-(82.50706)));
        }
        else if (tickAnim >= 33 && tickAnim < 34) {
            xx = 55.88178 + (((tickAnim - 33) / 1) * (-2.30991-(55.88178)));
            yy = -82.99194 + (((tickAnim - 33) / 1) * (-89.04355-(-82.99194)));
            zz = -5.6216 + (((tickAnim - 33) / 1) * (-67.51928-(-5.6216)));
        }
        else if (tickAnim >= 34 && tickAnim < 34) {
            xx = -2.30991 + (((tickAnim - 34) / 0) * (-48.17726-(-2.30991)));
            yy = -89.04355 + (((tickAnim - 34) / 0) * (-76.177-(-89.04355)));
            zz = -67.51928 + (((tickAnim - 34) / 0) * (22.54041-(-67.51928)));
        }
        else if (tickAnim >= 34 && tickAnim < 35) {
            xx = -48.17726 + (((tickAnim - 34) / 1) * (2.47864-(-48.17726)));
            yy = -76.177 + (((tickAnim - 34) / 1) * (-89.67379-(-76.177)));
            zz = 22.54041 + (((tickAnim - 34) / 1) * (82.50706-(22.54041)));
        }
        else if (tickAnim >= 35 && tickAnim < 36) {
            xx = 2.47864 + (((tickAnim - 35) / 1) * (55.88178-(2.47864)));
            yy = -89.67379 + (((tickAnim - 35) / 1) * (-82.99194-(-89.67379)));
            zz = 82.50706 + (((tickAnim - 35) / 1) * (-5.6216-(82.50706)));
        }
        else if (tickAnim >= 36 && tickAnim < 37) {
            xx = 55.88178 + (((tickAnim - 36) / 1) * (-2.30991-(55.88178)));
            yy = -82.99194 + (((tickAnim - 36) / 1) * (-89.04355-(-82.99194)));
            zz = -5.6216 + (((tickAnim - 36) / 1) * (-67.51928-(-5.6216)));
        }
        else if (tickAnim >= 37 && tickAnim < 38) {
            xx = -2.30991 + (((tickAnim - 37) / 1) * (-48.17726-(-2.30991)));
            yy = -89.04355 + (((tickAnim - 37) / 1) * (-76.177-(-89.04355)));
            zz = -67.51928 + (((tickAnim - 37) / 1) * (22.54041-(-67.51928)));
        }
        else if (tickAnim >= 38 && tickAnim < 38) {
            xx = -48.17726 + (((tickAnim - 38) / 0) * (2.47864-(-48.17726)));
            yy = -76.177 + (((tickAnim - 38) / 0) * (-89.67379-(-76.177)));
            zz = 22.54041 + (((tickAnim - 38) / 0) * (82.50706-(22.54041)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightHindwing, rightHindwing.rotateAngleX + (float) Math.toRadians(xx), rightHindwing.rotateAngleY + (float) Math.toRadians(yy), rightHindwing.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 1) {
            xx = 2.47864 + (((tickAnim - 0) / 1) * (55.88178-(2.47864)));
            yy = 89.67379 + (((tickAnim - 0) / 1) * (82.99194-(89.67379)));
            zz = -82.50706 + (((tickAnim - 0) / 1) * (5.6216-(-82.50706)));
        }
        else if (tickAnim >= 1 && tickAnim < 2) {
            xx = 55.88178 + (((tickAnim - 1) / 1) * (-2.30991-(55.88178)));
            yy = 82.99194 + (((tickAnim - 1) / 1) * (89.04355-(82.99194)));
            zz = 5.6216 + (((tickAnim - 1) / 1) * (67.51928-(5.6216)));
        }
        else if (tickAnim >= 2 && tickAnim < 2) {
            xx = -2.30991 + (((tickAnim - 2) / 0) * (-48.17726-(-2.30991)));
            yy = 89.04355 + (((tickAnim - 2) / 0) * (76.177-(89.04355)));
            zz = 67.51928 + (((tickAnim - 2) / 0) * (-22.54041-(67.51928)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = -48.17726 + (((tickAnim - 2) / 1) * (2.47864-(-48.17726)));
            yy = 76.177 + (((tickAnim - 2) / 1) * (89.67379-(76.177)));
            zz = -22.54041 + (((tickAnim - 2) / 1) * (-82.50706-(-22.54041)));
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = 2.47864 + (((tickAnim - 3) / 1) * (55.88178-(2.47864)));
            yy = 89.67379 + (((tickAnim - 3) / 1) * (82.99194-(89.67379)));
            zz = -82.50706 + (((tickAnim - 3) / 1) * (5.6216-(-82.50706)));
        }
        else if (tickAnim >= 4 && tickAnim < 5) {
            xx = 55.88178 + (((tickAnim - 4) / 1) * (-2.30991-(55.88178)));
            yy = 82.99194 + (((tickAnim - 4) / 1) * (89.04355-(82.99194)));
            zz = 5.6216 + (((tickAnim - 4) / 1) * (67.51928-(5.6216)));
        }
        else if (tickAnim >= 5 && tickAnim < 6) {
            xx = -2.30991 + (((tickAnim - 5) / 1) * (-48.17726-(-2.30991)));
            yy = 89.04355 + (((tickAnim - 5) / 1) * (76.177-(89.04355)));
            zz = 67.51928 + (((tickAnim - 5) / 1) * (-22.54041-(67.51928)));
        }
        else if (tickAnim >= 6 && tickAnim < 6) {
            xx = -48.17726 + (((tickAnim - 6) / 0) * (2.47864-(-48.17726)));
            yy = 76.177 + (((tickAnim - 6) / 0) * (89.67379-(76.177)));
            zz = -22.54041 + (((tickAnim - 6) / 0) * (-82.50706-(-22.54041)));
        }
        else if (tickAnim >= 6 && tickAnim < 7) {
            xx = 2.47864 + (((tickAnim - 6) / 1) * (55.88178-(2.47864)));
            yy = 89.67379 + (((tickAnim - 6) / 1) * (82.99194-(89.67379)));
            zz = -82.50706 + (((tickAnim - 6) / 1) * (5.6216-(-82.50706)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = 55.88178 + (((tickAnim - 7) / 1) * (-2.30991-(55.88178)));
            yy = 82.99194 + (((tickAnim - 7) / 1) * (89.04355-(82.99194)));
            zz = 5.6216 + (((tickAnim - 7) / 1) * (67.51928-(5.6216)));
        }
        else if (tickAnim >= 8 && tickAnim < 9) {
            xx = -2.30991 + (((tickAnim - 8) / 1) * (-48.17726-(-2.30991)));
            yy = 89.04355 + (((tickAnim - 8) / 1) * (76.177-(89.04355)));
            zz = 67.51928 + (((tickAnim - 8) / 1) * (-22.54041-(67.51928)));
        }
        else if (tickAnim >= 9 && tickAnim < 10) {
            xx = -48.17726 + (((tickAnim - 9) / 1) * (2.47864-(-48.17726)));
            yy = 76.177 + (((tickAnim - 9) / 1) * (89.67379-(76.177)));
            zz = -22.54041 + (((tickAnim - 9) / 1) * (-82.50706-(-22.54041)));
        }
        else if (tickAnim >= 10 && tickAnim < 10) {
            xx = 2.47864 + (((tickAnim - 10) / 0) * (55.88178-(2.47864)));
            yy = 89.67379 + (((tickAnim - 10) / 0) * (82.99194-(89.67379)));
            zz = -82.50706 + (((tickAnim - 10) / 0) * (5.6216-(-82.50706)));
        }
        else if (tickAnim >= 10 && tickAnim < 11) {
            xx = 55.88178 + (((tickAnim - 10) / 1) * (-2.30991-(55.88178)));
            yy = 82.99194 + (((tickAnim - 10) / 1) * (89.04355-(82.99194)));
            zz = 5.6216 + (((tickAnim - 10) / 1) * (67.51928-(5.6216)));
        }
        else if (tickAnim >= 11 && tickAnim < 12) {
            xx = -2.30991 + (((tickAnim - 11) / 1) * (-48.17726-(-2.30991)));
            yy = 89.04355 + (((tickAnim - 11) / 1) * (76.177-(89.04355)));
            zz = 67.51928 + (((tickAnim - 11) / 1) * (-22.54041-(67.51928)));
        }
        else if (tickAnim >= 12 && tickAnim < 13) {
            xx = -48.17726 + (((tickAnim - 12) / 1) * (2.47864-(-48.17726)));
            yy = 76.177 + (((tickAnim - 12) / 1) * (89.67379-(76.177)));
            zz = -22.54041 + (((tickAnim - 12) / 1) * (-82.50706-(-22.54041)));
        }
        else if (tickAnim >= 13 && tickAnim < 14) {
            xx = 2.47864 + (((tickAnim - 13) / 1) * (55.88178-(2.47864)));
            yy = 89.67379 + (((tickAnim - 13) / 1) * (82.99194-(89.67379)));
            zz = -82.50706 + (((tickAnim - 13) / 1) * (5.6216-(-82.50706)));
        }
        else if (tickAnim >= 14 && tickAnim < 14) {
            xx = 55.88178 + (((tickAnim - 14) / 0) * (-2.30991-(55.88178)));
            yy = 82.99194 + (((tickAnim - 14) / 0) * (89.04355-(82.99194)));
            zz = 5.6216 + (((tickAnim - 14) / 0) * (67.51928-(5.6216)));
        }
        else if (tickAnim >= 14 && tickAnim < 15) {
            xx = -2.30991 + (((tickAnim - 14) / 1) * (-48.17726-(-2.30991)));
            yy = 89.04355 + (((tickAnim - 14) / 1) * (76.177-(89.04355)));
            zz = 67.51928 + (((tickAnim - 14) / 1) * (-22.54041-(67.51928)));
        }
        else if (tickAnim >= 15 && tickAnim < 16) {
            xx = -48.17726 + (((tickAnim - 15) / 1) * (2.47864-(-48.17726)));
            yy = 76.177 + (((tickAnim - 15) / 1) * (89.67379-(76.177)));
            zz = -22.54041 + (((tickAnim - 15) / 1) * (-82.50706-(-22.54041)));
        }
        else if (tickAnim >= 16 && tickAnim < 17) {
            xx = 2.47864 + (((tickAnim - 16) / 1) * (55.88178-(2.47864)));
            yy = 89.67379 + (((tickAnim - 16) / 1) * (82.99194-(89.67379)));
            zz = -82.50706 + (((tickAnim - 16) / 1) * (5.6216-(-82.50706)));
        }
        else if (tickAnim >= 17 && tickAnim < 18) {
            xx = 55.88178 + (((tickAnim - 17) / 1) * (-2.30991-(55.88178)));
            yy = 82.99194 + (((tickAnim - 17) / 1) * (89.04355-(82.99194)));
            zz = 5.6216 + (((tickAnim - 17) / 1) * (67.51928-(5.6216)));
        }
        else if (tickAnim >= 18 && tickAnim < 18) {
            xx = -2.30991 + (((tickAnim - 18) / 0) * (-48.17726-(-2.30991)));
            yy = 89.04355 + (((tickAnim - 18) / 0) * (76.177-(89.04355)));
            zz = 67.51928 + (((tickAnim - 18) / 0) * (-22.54041-(67.51928)));
        }
        else if (tickAnim >= 18 && tickAnim < 19) {
            xx = -48.17726 + (((tickAnim - 18) / 1) * (2.47864-(-48.17726)));
            yy = 76.177 + (((tickAnim - 18) / 1) * (89.67379-(76.177)));
            zz = -22.54041 + (((tickAnim - 18) / 1) * (-82.50706-(-22.54041)));
        }
        else if (tickAnim >= 19 && tickAnim < 20) {
            xx = 2.47864 + (((tickAnim - 19) / 1) * (55.88178-(2.47864)));
            yy = 89.67379 + (((tickAnim - 19) / 1) * (82.99194-(89.67379)));
            zz = -82.50706 + (((tickAnim - 19) / 1) * (5.6216-(-82.50706)));
        }
        else if (tickAnim >= 20 && tickAnim < 21) {
            xx = 55.88178 + (((tickAnim - 20) / 1) * (-2.30991-(55.88178)));
            yy = 82.99194 + (((tickAnim - 20) / 1) * (89.04355-(82.99194)));
            zz = 5.6216 + (((tickAnim - 20) / 1) * (67.51928-(5.6216)));
        }
        else if (tickAnim >= 21 && tickAnim < 22) {
            xx = -2.30991 + (((tickAnim - 21) / 1) * (-48.17726-(-2.30991)));
            yy = 89.04355 + (((tickAnim - 21) / 1) * (76.177-(89.04355)));
            zz = 67.51928 + (((tickAnim - 21) / 1) * (-22.54041-(67.51928)));
        }
        else if (tickAnim >= 22 && tickAnim < 22) {
            xx = -48.17726 + (((tickAnim - 22) / 0) * (2.47864-(-48.17726)));
            yy = 76.177 + (((tickAnim - 22) / 0) * (89.67379-(76.177)));
            zz = -22.54041 + (((tickAnim - 22) / 0) * (-82.50706-(-22.54041)));
        }
        else if (tickAnim >= 22 && tickAnim < 23) {
            xx = 2.47864 + (((tickAnim - 22) / 1) * (55.88178-(2.47864)));
            yy = 89.67379 + (((tickAnim - 22) / 1) * (82.99194-(89.67379)));
            zz = -82.50706 + (((tickAnim - 22) / 1) * (5.6216-(-82.50706)));
        }
        else if (tickAnim >= 23 && tickAnim < 24) {
            xx = 55.88178 + (((tickAnim - 23) / 1) * (-2.30991-(55.88178)));
            yy = 82.99194 + (((tickAnim - 23) / 1) * (89.04355-(82.99194)));
            zz = 5.6216 + (((tickAnim - 23) / 1) * (67.51928-(5.6216)));
        }
        else if (tickAnim >= 24 && tickAnim < 25) {
            xx = -2.30991 + (((tickAnim - 24) / 1) * (-48.17726-(-2.30991)));
            yy = 89.04355 + (((tickAnim - 24) / 1) * (76.177-(89.04355)));
            zz = 67.51928 + (((tickAnim - 24) / 1) * (-22.54041-(67.51928)));
        }
        else if (tickAnim >= 25 && tickAnim < 26) {
            xx = -48.17726 + (((tickAnim - 25) / 1) * (2.47864-(-48.17726)));
            yy = 76.177 + (((tickAnim - 25) / 1) * (89.67379-(76.177)));
            zz = -22.54041 + (((tickAnim - 25) / 1) * (-82.50706-(-22.54041)));
        }
        else if (tickAnim >= 26 && tickAnim < 26) {
            xx = 2.47864 + (((tickAnim - 26) / 0) * (55.88178-(2.47864)));
            yy = 89.67379 + (((tickAnim - 26) / 0) * (82.99194-(89.67379)));
            zz = -82.50706 + (((tickAnim - 26) / 0) * (5.6216-(-82.50706)));
        }
        else if (tickAnim >= 26 && tickAnim < 27) {
            xx = 55.88178 + (((tickAnim - 26) / 1) * (-2.30991-(55.88178)));
            yy = 82.99194 + (((tickAnim - 26) / 1) * (89.04355-(82.99194)));
            zz = 5.6216 + (((tickAnim - 26) / 1) * (67.51928-(5.6216)));
        }
        else if (tickAnim >= 27 && tickAnim < 28) {
            xx = -2.30991 + (((tickAnim - 27) / 1) * (-48.17726-(-2.30991)));
            yy = 89.04355 + (((tickAnim - 27) / 1) * (76.177-(89.04355)));
            zz = 67.51928 + (((tickAnim - 27) / 1) * (-22.54041-(67.51928)));
        }
        else if (tickAnim >= 28 && tickAnim < 29) {
            xx = -48.17726 + (((tickAnim - 28) / 1) * (2.47864-(-48.17726)));
            yy = 76.177 + (((tickAnim - 28) / 1) * (89.67379-(76.177)));
            zz = -22.54041 + (((tickAnim - 28) / 1) * (-82.50706-(-22.54041)));
        }
        else if (tickAnim >= 29 && tickAnim < 30) {
            xx = 2.47864 + (((tickAnim - 29) / 1) * (55.88178-(2.47864)));
            yy = 89.67379 + (((tickAnim - 29) / 1) * (82.99194-(89.67379)));
            zz = -82.50706 + (((tickAnim - 29) / 1) * (5.6216-(-82.50706)));
        }
        else if (tickAnim >= 30 && tickAnim < 30) {
            xx = 55.88178 + (((tickAnim - 30) / 0) * (-2.30991-(55.88178)));
            yy = 82.99194 + (((tickAnim - 30) / 0) * (89.04355-(82.99194)));
            zz = 5.6216 + (((tickAnim - 30) / 0) * (67.51928-(5.6216)));
        }
        else if (tickAnim >= 30 && tickAnim < 31) {
            xx = -2.30991 + (((tickAnim - 30) / 1) * (-48.17726-(-2.30991)));
            yy = 89.04355 + (((tickAnim - 30) / 1) * (76.177-(89.04355)));
            zz = 67.51928 + (((tickAnim - 30) / 1) * (-22.54041-(67.51928)));
        }
        else if (tickAnim >= 31 && tickAnim < 32) {
            xx = -48.17726 + (((tickAnim - 31) / 1) * (2.47864-(-48.17726)));
            yy = 76.177 + (((tickAnim - 31) / 1) * (89.67379-(76.177)));
            zz = -22.54041 + (((tickAnim - 31) / 1) * (-82.50706-(-22.54041)));
        }
        else if (tickAnim >= 32 && tickAnim < 33) {
            xx = 2.47864 + (((tickAnim - 32) / 1) * (55.88178-(2.47864)));
            yy = 89.67379 + (((tickAnim - 32) / 1) * (82.99194-(89.67379)));
            zz = -82.50706 + (((tickAnim - 32) / 1) * (5.6216-(-82.50706)));
        }
        else if (tickAnim >= 33 && tickAnim < 34) {
            xx = 55.88178 + (((tickAnim - 33) / 1) * (-2.30991-(55.88178)));
            yy = 82.99194 + (((tickAnim - 33) / 1) * (89.04355-(82.99194)));
            zz = 5.6216 + (((tickAnim - 33) / 1) * (67.51928-(5.6216)));
        }
        else if (tickAnim >= 34 && tickAnim < 34) {
            xx = -2.30991 + (((tickAnim - 34) / 0) * (-48.17726-(-2.30991)));
            yy = 89.04355 + (((tickAnim - 34) / 0) * (76.177-(89.04355)));
            zz = 67.51928 + (((tickAnim - 34) / 0) * (-22.54041-(67.51928)));
        }
        else if (tickAnim >= 34 && tickAnim < 35) {
            xx = -48.17726 + (((tickAnim - 34) / 1) * (2.47864-(-48.17726)));
            yy = 76.177 + (((tickAnim - 34) / 1) * (89.67379-(76.177)));
            zz = -22.54041 + (((tickAnim - 34) / 1) * (-82.50706-(-22.54041)));
        }
        else if (tickAnim >= 35 && tickAnim < 36) {
            xx = 2.47864 + (((tickAnim - 35) / 1) * (55.88178-(2.47864)));
            yy = 89.67379 + (((tickAnim - 35) / 1) * (82.99194-(89.67379)));
            zz = -82.50706 + (((tickAnim - 35) / 1) * (5.6216-(-82.50706)));
        }
        else if (tickAnim >= 36 && tickAnim < 37) {
            xx = 55.88178 + (((tickAnim - 36) / 1) * (-2.30991-(55.88178)));
            yy = 82.99194 + (((tickAnim - 36) / 1) * (89.04355-(82.99194)));
            zz = 5.6216 + (((tickAnim - 36) / 1) * (67.51928-(5.6216)));
        }
        else if (tickAnim >= 37 && tickAnim < 38) {
            xx = -2.30991 + (((tickAnim - 37) / 1) * (-48.17726-(-2.30991)));
            yy = 89.04355 + (((tickAnim - 37) / 1) * (76.177-(89.04355)));
            zz = 67.51928 + (((tickAnim - 37) / 1) * (-22.54041-(67.51928)));
        }
        else if (tickAnim >= 38 && tickAnim < 38) {
            xx = -48.17726 + (((tickAnim - 38) / 0) * (2.47864-(-48.17726)));
            yy = 76.177 + (((tickAnim - 38) / 0) * (89.67379-(76.177)));
            zz = -22.54041 + (((tickAnim - 38) / 0) * (-82.50706-(-22.54041)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftHindwing, leftHindwing.rotateAngleX + (float) Math.toRadians(xx), leftHindwing.rotateAngleY + (float) Math.toRadians(yy), leftHindwing.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 60.91718 + (((tickAnim - 0) / 2) * (38.41718-(60.91718)));
            yy = 83.6782 + (((tickAnim - 0) / 2) * (83.6782-(83.6782)));
            zz = 34.15874 + (((tickAnim - 0) / 2) * (34.15874-(34.15874)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = 38.41718 + (((tickAnim - 2) / 1) * (60.91718-(38.41718)));
            yy = 83.6782 + (((tickAnim - 2) / 1) * (83.6782-(83.6782)));
            zz = 34.15874 + (((tickAnim - 2) / 1) * (34.15874-(34.15874)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 60.91718 + (((tickAnim - 3) / 2) * (38.41718-(60.91718)));
            yy = 83.6782 + (((tickAnim - 3) / 2) * (83.6782-(83.6782)));
            zz = 34.15874 + (((tickAnim - 3) / 2) * (34.15874-(34.15874)));
        }
        else if (tickAnim >= 5 && tickAnim < 6) {
            xx = 38.41718 + (((tickAnim - 5) / 1) * (60.91718-(38.41718)));
            yy = 83.6782 + (((tickAnim - 5) / 1) * (83.6782-(83.6782)));
            zz = 34.15874 + (((tickAnim - 5) / 1) * (34.15874-(34.15874)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = 60.91718 + (((tickAnim - 6) / 2) * (38.41718-(60.91718)));
            yy = 83.6782 + (((tickAnim - 6) / 2) * (83.6782-(83.6782)));
            zz = 34.15874 + (((tickAnim - 6) / 2) * (34.15874-(34.15874)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 38.41718 + (((tickAnim - 8) / 2) * (60.91718-(38.41718)));
            yy = 83.6782 + (((tickAnim - 8) / 2) * (83.6782-(83.6782)));
            zz = 34.15874 + (((tickAnim - 8) / 2) * (34.15874-(34.15874)));
        }
        else if (tickAnim >= 10 && tickAnim < 11) {
            xx = 60.91718 + (((tickAnim - 10) / 1) * (38.41718-(60.91718)));
            yy = 83.6782 + (((tickAnim - 10) / 1) * (83.6782-(83.6782)));
            zz = 34.15874 + (((tickAnim - 10) / 1) * (34.15874-(34.15874)));
        }
        else if (tickAnim >= 11 && tickAnim < 13) {
            xx = 38.41718 + (((tickAnim - 11) / 2) * (60.91718-(38.41718)));
            yy = 83.6782 + (((tickAnim - 11) / 2) * (83.6782-(83.6782)));
            zz = 34.15874 + (((tickAnim - 11) / 2) * (34.15874-(34.15874)));
        }
        else if (tickAnim >= 13 && tickAnim < 14) {
            xx = 60.91718 + (((tickAnim - 13) / 1) * (38.41718-(60.91718)));
            yy = 83.6782 + (((tickAnim - 13) / 1) * (83.6782-(83.6782)));
            zz = 34.15874 + (((tickAnim - 13) / 1) * (34.15874-(34.15874)));
        }
        else if (tickAnim >= 14 && tickAnim < 16) {
            xx = 38.41718 + (((tickAnim - 14) / 2) * (60.91718-(38.41718)));
            yy = 83.6782 + (((tickAnim - 14) / 2) * (83.6782-(83.6782)));
            zz = 34.15874 + (((tickAnim - 14) / 2) * (34.15874-(34.15874)));
        }
        else if (tickAnim >= 16 && tickAnim < 18) {
            xx = 60.91718 + (((tickAnim - 16) / 2) * (38.41718-(60.91718)));
            yy = 83.6782 + (((tickAnim - 16) / 2) * (83.6782-(83.6782)));
            zz = 34.15874 + (((tickAnim - 16) / 2) * (34.15874-(34.15874)));
        }
        else if (tickAnim >= 18 && tickAnim < 19) {
            xx = 38.41718 + (((tickAnim - 18) / 1) * (60.91718-(38.41718)));
            yy = 83.6782 + (((tickAnim - 18) / 1) * (83.6782-(83.6782)));
            zz = 34.15874 + (((tickAnim - 18) / 1) * (34.15874-(34.15874)));
        }
        else if (tickAnim >= 19 && tickAnim < 21) {
            xx = 60.91718 + (((tickAnim - 19) / 2) * (38.41718-(60.91718)));
            yy = 83.6782 + (((tickAnim - 19) / 2) * (83.6782-(83.6782)));
            zz = 34.15874 + (((tickAnim - 19) / 2) * (34.15874-(34.15874)));
        }
        else if (tickAnim >= 21 && tickAnim < 22) {
            xx = 38.41718 + (((tickAnim - 21) / 1) * (60.91718-(38.41718)));
            yy = 83.6782 + (((tickAnim - 21) / 1) * (83.6782-(83.6782)));
            zz = 34.15874 + (((tickAnim - 21) / 1) * (34.15874-(34.15874)));
        }
        else if (tickAnim >= 22 && tickAnim < 24) {
            xx = 60.91718 + (((tickAnim - 22) / 2) * (38.41718-(60.91718)));
            yy = 83.6782 + (((tickAnim - 22) / 2) * (83.6782-(83.6782)));
            zz = 34.15874 + (((tickAnim - 22) / 2) * (34.15874-(34.15874)));
        }
        else if (tickAnim >= 24 && tickAnim < 26) {
            xx = 38.41718 + (((tickAnim - 24) / 2) * (60.91718-(38.41718)));
            yy = 83.6782 + (((tickAnim - 24) / 2) * (83.6782-(83.6782)));
            zz = 34.15874 + (((tickAnim - 24) / 2) * (34.15874-(34.15874)));
        }
        else if (tickAnim >= 26 && tickAnim < 27) {
            xx = 60.91718 + (((tickAnim - 26) / 1) * (38.41718-(60.91718)));
            yy = 83.6782 + (((tickAnim - 26) / 1) * (83.6782-(83.6782)));
            zz = 34.15874 + (((tickAnim - 26) / 1) * (34.15874-(34.15874)));
        }
        else if (tickAnim >= 27 && tickAnim < 29) {
            xx = 38.41718 + (((tickAnim - 27) / 2) * (60.91718-(38.41718)));
            yy = 83.6782 + (((tickAnim - 27) / 2) * (83.6782-(83.6782)));
            zz = 34.15874 + (((tickAnim - 27) / 2) * (34.15874-(34.15874)));
        }
        else if (tickAnim >= 29 && tickAnim < 30) {
            xx = 60.91718 + (((tickAnim - 29) / 1) * (38.41718-(60.91718)));
            yy = 83.6782 + (((tickAnim - 29) / 1) * (83.6782-(83.6782)));
            zz = 34.15874 + (((tickAnim - 29) / 1) * (34.15874-(34.15874)));
        }
        else if (tickAnim >= 30 && tickAnim < 32) {
            xx = 38.41718 + (((tickAnim - 30) / 2) * (60.91718-(38.41718)));
            yy = 83.6782 + (((tickAnim - 30) / 2) * (83.6782-(83.6782)));
            zz = 34.15874 + (((tickAnim - 30) / 2) * (34.15874-(34.15874)));
        }
        else if (tickAnim >= 32 && tickAnim < 34) {
            xx = 60.91718 + (((tickAnim - 32) / 2) * (38.41718-(60.91718)));
            yy = 83.6782 + (((tickAnim - 32) / 2) * (83.6782-(83.6782)));
            zz = 34.15874 + (((tickAnim - 32) / 2) * (34.15874-(34.15874)));
        }
        else if (tickAnim >= 34 && tickAnim < 35) {
            xx = 38.41718 + (((tickAnim - 34) / 1) * (60.91718-(38.41718)));
            yy = 83.6782 + (((tickAnim - 34) / 1) * (83.6782-(83.6782)));
            zz = 34.15874 + (((tickAnim - 34) / 1) * (34.15874-(34.15874)));
        }
        else if (tickAnim >= 35 && tickAnim < 37) {
            xx = 60.91718 + (((tickAnim - 35) / 2) * (38.41718-(60.91718)));
            yy = 83.6782 + (((tickAnim - 35) / 2) * (83.6782-(83.6782)));
            zz = 34.15874 + (((tickAnim - 35) / 2) * (34.15874-(34.15874)));
        }
        else if (tickAnim >= 37 && tickAnim < 38) {
            xx = 38.41718 + (((tickAnim - 37) / 1) * (60.91718-(38.41718)));
            yy = 83.6782 + (((tickAnim - 37) / 1) * (83.6782-(83.6782)));
            zz = 34.15874 + (((tickAnim - 37) / 1) * (34.15874-(34.15874)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftForewing, leftForewing.rotateAngleX + (float) Math.toRadians(xx), leftForewing.rotateAngleY + (float) Math.toRadians(yy), leftForewing.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 60.91718 + (((tickAnim - 0) / 2) * (38.41718-(60.91718)));
            yy = -83.6782 + (((tickAnim - 0) / 2) * (-83.6782-(-83.6782)));
            zz = -34.15874 + (((tickAnim - 0) / 2) * (-34.15874-(-34.15874)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = 38.41718 + (((tickAnim - 2) / 1) * (60.91718-(38.41718)));
            yy = -83.6782 + (((tickAnim - 2) / 1) * (-83.6782-(-83.6782)));
            zz = -34.15874 + (((tickAnim - 2) / 1) * (-34.15874-(-34.15874)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 60.91718 + (((tickAnim - 3) / 2) * (38.41718-(60.91718)));
            yy = -83.6782 + (((tickAnim - 3) / 2) * (-83.6782-(-83.6782)));
            zz = -34.15874 + (((tickAnim - 3) / 2) * (-34.15874-(-34.15874)));
        }
        else if (tickAnim >= 5 && tickAnim < 6) {
            xx = 38.41718 + (((tickAnim - 5) / 1) * (60.91718-(38.41718)));
            yy = -83.6782 + (((tickAnim - 5) / 1) * (-83.6782-(-83.6782)));
            zz = -34.15874 + (((tickAnim - 5) / 1) * (-34.15874-(-34.15874)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = 60.91718 + (((tickAnim - 6) / 2) * (38.41718-(60.91718)));
            yy = -83.6782 + (((tickAnim - 6) / 2) * (-83.6782-(-83.6782)));
            zz = -34.15874 + (((tickAnim - 6) / 2) * (-34.15874-(-34.15874)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 38.41718 + (((tickAnim - 8) / 2) * (60.91718-(38.41718)));
            yy = -83.6782 + (((tickAnim - 8) / 2) * (-83.6782-(-83.6782)));
            zz = -34.15874 + (((tickAnim - 8) / 2) * (-34.15874-(-34.15874)));
        }
        else if (tickAnim >= 10 && tickAnim < 11) {
            xx = 60.91718 + (((tickAnim - 10) / 1) * (38.41718-(60.91718)));
            yy = -83.6782 + (((tickAnim - 10) / 1) * (-83.6782-(-83.6782)));
            zz = -34.15874 + (((tickAnim - 10) / 1) * (-34.15874-(-34.15874)));
        }
        else if (tickAnim >= 11 && tickAnim < 13) {
            xx = 38.41718 + (((tickAnim - 11) / 2) * (60.91718-(38.41718)));
            yy = -83.6782 + (((tickAnim - 11) / 2) * (-83.6782-(-83.6782)));
            zz = -34.15874 + (((tickAnim - 11) / 2) * (-34.15874-(-34.15874)));
        }
        else if (tickAnim >= 13 && tickAnim < 14) {
            xx = 60.91718 + (((tickAnim - 13) / 1) * (38.41718-(60.91718)));
            yy = -83.6782 + (((tickAnim - 13) / 1) * (-83.6782-(-83.6782)));
            zz = -34.15874 + (((tickAnim - 13) / 1) * (-34.15874-(-34.15874)));
        }
        else if (tickAnim >= 14 && tickAnim < 16) {
            xx = 38.41718 + (((tickAnim - 14) / 2) * (60.91718-(38.41718)));
            yy = -83.6782 + (((tickAnim - 14) / 2) * (-83.6782-(-83.6782)));
            zz = -34.15874 + (((tickAnim - 14) / 2) * (-34.15874-(-34.15874)));
        }
        else if (tickAnim >= 16 && tickAnim < 18) {
            xx = 60.91718 + (((tickAnim - 16) / 2) * (38.41718-(60.91718)));
            yy = -83.6782 + (((tickAnim - 16) / 2) * (-83.6782-(-83.6782)));
            zz = -34.15874 + (((tickAnim - 16) / 2) * (-34.15874-(-34.15874)));
        }
        else if (tickAnim >= 18 && tickAnim < 19) {
            xx = 38.41718 + (((tickAnim - 18) / 1) * (60.91718-(38.41718)));
            yy = -83.6782 + (((tickAnim - 18) / 1) * (-83.6782-(-83.6782)));
            zz = -34.15874 + (((tickAnim - 18) / 1) * (-34.15874-(-34.15874)));
        }
        else if (tickAnim >= 19 && tickAnim < 21) {
            xx = 60.91718 + (((tickAnim - 19) / 2) * (38.41718-(60.91718)));
            yy = -83.6782 + (((tickAnim - 19) / 2) * (-83.6782-(-83.6782)));
            zz = -34.15874 + (((tickAnim - 19) / 2) * (-34.15874-(-34.15874)));
        }
        else if (tickAnim >= 21 && tickAnim < 22) {
            xx = 38.41718 + (((tickAnim - 21) / 1) * (60.91718-(38.41718)));
            yy = -83.6782 + (((tickAnim - 21) / 1) * (-83.6782-(-83.6782)));
            zz = -34.15874 + (((tickAnim - 21) / 1) * (-34.15874-(-34.15874)));
        }
        else if (tickAnim >= 22 && tickAnim < 24) {
            xx = 60.91718 + (((tickAnim - 22) / 2) * (38.41718-(60.91718)));
            yy = -83.6782 + (((tickAnim - 22) / 2) * (-83.6782-(-83.6782)));
            zz = -34.15874 + (((tickAnim - 22) / 2) * (-34.15874-(-34.15874)));
        }
        else if (tickAnim >= 24 && tickAnim < 26) {
            xx = 38.41718 + (((tickAnim - 24) / 2) * (60.91718-(38.41718)));
            yy = -83.6782 + (((tickAnim - 24) / 2) * (-83.6782-(-83.6782)));
            zz = -34.15874 + (((tickAnim - 24) / 2) * (-34.15874-(-34.15874)));
        }
        else if (tickAnim >= 26 && tickAnim < 27) {
            xx = 60.91718 + (((tickAnim - 26) / 1) * (38.41718-(60.91718)));
            yy = -83.6782 + (((tickAnim - 26) / 1) * (-83.6782-(-83.6782)));
            zz = -34.15874 + (((tickAnim - 26) / 1) * (-34.15874-(-34.15874)));
        }
        else if (tickAnim >= 27 && tickAnim < 29) {
            xx = 38.41718 + (((tickAnim - 27) / 2) * (60.91718-(38.41718)));
            yy = -83.6782 + (((tickAnim - 27) / 2) * (-83.6782-(-83.6782)));
            zz = -34.15874 + (((tickAnim - 27) / 2) * (-34.15874-(-34.15874)));
        }
        else if (tickAnim >= 29 && tickAnim < 30) {
            xx = 60.91718 + (((tickAnim - 29) / 1) * (38.41718-(60.91718)));
            yy = -83.6782 + (((tickAnim - 29) / 1) * (-83.6782-(-83.6782)));
            zz = -34.15874 + (((tickAnim - 29) / 1) * (-34.15874-(-34.15874)));
        }
        else if (tickAnim >= 30 && tickAnim < 32) {
            xx = 38.41718 + (((tickAnim - 30) / 2) * (60.91718-(38.41718)));
            yy = -83.6782 + (((tickAnim - 30) / 2) * (-83.6782-(-83.6782)));
            zz = -34.15874 + (((tickAnim - 30) / 2) * (-34.15874-(-34.15874)));
        }
        else if (tickAnim >= 32 && tickAnim < 34) {
            xx = 60.91718 + (((tickAnim - 32) / 2) * (38.41718-(60.91718)));
            yy = -83.6782 + (((tickAnim - 32) / 2) * (-83.6782-(-83.6782)));
            zz = -34.15874 + (((tickAnim - 32) / 2) * (-34.15874-(-34.15874)));
        }
        else if (tickAnim >= 34 && tickAnim < 35) {
            xx = 38.41718 + (((tickAnim - 34) / 1) * (60.91718-(38.41718)));
            yy = -83.6782 + (((tickAnim - 34) / 1) * (-83.6782-(-83.6782)));
            zz = -34.15874 + (((tickAnim - 34) / 1) * (-34.15874-(-34.15874)));
        }
        else if (tickAnim >= 35 && tickAnim < 37) {
            xx = 60.91718 + (((tickAnim - 35) / 2) * (38.41718-(60.91718)));
            yy = -83.6782 + (((tickAnim - 35) / 2) * (-83.6782-(-83.6782)));
            zz = -34.15874 + (((tickAnim - 35) / 2) * (-34.15874-(-34.15874)));
        }
        else if (tickAnim >= 37 && tickAnim < 38) {
            xx = 38.41718 + (((tickAnim - 37) / 1) * (60.91718-(38.41718)));
            yy = -83.6782 + (((tickAnim - 37) / 1) * (-83.6782-(-83.6782)));
            zz = -34.15874 + (((tickAnim - 37) / 1) * (-34.15874-(-34.15874)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightForewing, rightForewing.rotateAngleX + (float) Math.toRadians(xx), rightForewing.rotateAngleY + (float) Math.toRadians(yy), rightForewing.rotateAngleZ + (float) Math.toRadians(zz));



        this.setRotateAngle(base, base.rotateAngleX + (float) Math.toRadians(-62.5), base.rotateAngleY + (float) Math.toRadians(0), base.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*187))*20));
        this.base.rotationPointX = this.base.rotationPointX + (float)(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*187-60))*3);
        this.base.rotationPointY = this.base.rotationPointY - (float)(8+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*374+40))*1);
        this.base.rotationPointZ = this.base.rotationPointZ + (float)(0);


        this.setRotateAngle(rightLeg2, rightLeg2.rotateAngleX + (float) Math.toRadians(4.76794), rightLeg2.rotateAngleY + (float) Math.toRadians(22.51163), rightLeg2.rotateAngleZ + (float) Math.toRadians(-37.9658542838-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*187-90))*20));


        this.setRotateAngle(leftLeg2, leftLeg2.rotateAngleX + (float) Math.toRadians(4.76794), leftLeg2.rotateAngleY + (float) Math.toRadians(-22.51163), leftLeg2.rotateAngleZ + (float) Math.toRadians(37.9658542838+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*187-70))*20));


        this.setRotateAngle(rightLeg3, rightLeg3.rotateAngleX + (float) Math.toRadians(-1.9659), rightLeg3.rotateAngleY + (float) Math.toRadians(24.6794175654+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*187-90))*10), rightLeg3.rotateAngleZ + (float) Math.toRadians(-6.24106));


        this.setRotateAngle(leftLeg3, leftLeg3.rotateAngleX + (float) Math.toRadians(-1.9659), leftLeg3.rotateAngleY + (float) Math.toRadians(-24.6794175654-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*187-90))*10), leftLeg3.rotateAngleZ + (float) Math.toRadians(6.24106));


        this.setRotateAngle(rightLeg1, rightLeg1.rotateAngleX + (float) Math.toRadians(10.4168), rightLeg1.rotateAngleY + (float) Math.toRadians(-15.37927), rightLeg1.rotateAngleZ + (float) Math.toRadians(8.1189+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*187-40))*10));


        this.setRotateAngle(leftLeg1, leftLeg1.rotateAngleX + (float) Math.toRadians(10.4168), leftLeg1.rotateAngleY + (float) Math.toRadians(15.37927), leftLeg1.rotateAngleZ + (float) Math.toRadians(-8.1189-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*187-70))*10));


        this.setRotateAngle(rightAntenna, rightAntenna.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*187-60))*3), rightAntenna.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*187-60))*20), rightAntenna.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(leftAntenna, leftAntenna.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*187))*3), leftAntenna.rotateAngleY + (float) Math.toRadians(-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*187))*20), leftAntenna.rotateAngleZ + (float) Math.toRadians(0));

    }
    public void animWalking(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraMegalithomerus entity = (EntityPrehistoricFloraMegalithomerus) entitylivingbaseIn;
        int animCycle = 14;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        this.setRotateAngle(base, base.rotateAngleX + (float) (Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*(167*3))+90))*4), base.rotateAngleY + (float) Math.toRadians(0), base.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*(167*3))))*4);



        if (tickAnim >= 0 && tickAnim < 7) {
            xx = -19.5159 + (((tickAnim - 0) / 7) * (-1.1619-(-19.5159)));
            yy = -26.01037 + (((tickAnim - 0) / 7) * (10.89395-(-26.01037)));
            zz = 13.76361 + (((tickAnim - 0) / 7) * (8.73559-(13.76361)));
        }
        else if (tickAnim >= 7 && tickAnim < 10) {
            xx = -1.1619 + (((tickAnim - 7) / 3) * (-3.38031-(-1.1619)));
            yy = 10.89395 + (((tickAnim - 7) / 3) * (-8.431-(10.89395)));
            zz = 8.73559 + (((tickAnim - 7) / 3) * (21.66241-(8.73559)));
        }
        else if (tickAnim >= 10 && tickAnim < 14) {
            xx = -3.38031 + (((tickAnim - 10) / 4) * (-19.5159-(-3.38031)));
            yy = -8.431 + (((tickAnim - 10) / 4) * (-26.01037-(-8.431)));
            zz = 21.66241 + (((tickAnim - 10) / 4) * (13.76361-(21.66241)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg2, rightLeg2.rotateAngleX + (float) Math.toRadians(xx), rightLeg2.rotateAngleY + (float) Math.toRadians(yy), rightLeg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = -5.05636 + (((tickAnim - 0) / 3) * (-14.44399-(-5.05636)));
            yy = -9.91424 + (((tickAnim - 0) / 3) * (-0.22369-(-9.91424)));
            zz = 1.30971 + (((tickAnim - 0) / 3) * (-25.66791-(1.30971)));
        }
        else if (tickAnim >= 3 && tickAnim < 7) {
            xx = -14.44399 + (((tickAnim - 3) / 4) * (-23.01827-(-14.44399)));
            yy = -0.22369 + (((tickAnim - 3) / 4) * (22.98269-(-0.22369)));
            zz = -25.66791 + (((tickAnim - 3) / 4) * (-21.46725-(-25.66791)));
        }
        else if (tickAnim >= 7 && tickAnim < 14) {
            xx = -23.01827 + (((tickAnim - 7) / 7) * (-5.05636-(-23.01827)));
            yy = 22.98269 + (((tickAnim - 7) / 7) * (-9.91424-(22.98269)));
            zz = -21.46725 + (((tickAnim - 7) / 7) * (1.30971-(-21.46725)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg2, leftLeg2.rotateAngleX + (float) Math.toRadians(xx), leftLeg2.rotateAngleY + (float) Math.toRadians(yy), leftLeg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = -18.88 + (((tickAnim - 0) / 4) * (-8.02196-(-18.88)));
            yy = 4.14 + (((tickAnim - 0) / 4) * (-13.95887-(4.14)));
            zz = 10.16 + (((tickAnim - 0) / 4) * (23.06581-(10.16)));
        }
        else if (tickAnim >= 4 && tickAnim < 6) {
            xx = -8.02196 + (((tickAnim - 4) / 2) * (-5.89563-(-8.02196)));
            yy = -13.95887 + (((tickAnim - 4) / 2) * (-29.8093-(-13.95887)));
            zz = 23.06581 + (((tickAnim - 4) / 2) * (11.10711-(23.06581)));
        }
        else if (tickAnim >= 6 && tickAnim < 9) {
            xx = -5.89563 + (((tickAnim - 6) / 3) * (-1.29094-(-5.89563)));
            yy = -29.8093 + (((tickAnim - 6) / 3) * (-19.62451-(-29.8093)));
            zz = 11.10711 + (((tickAnim - 6) / 3) * (10.82298-(11.10711)));
        }
        else if (tickAnim >= 9 && tickAnim < 10) {
            xx = -1.29094 + (((tickAnim - 9) / 1) * (-2.38781-(-1.29094)));
            yy = -19.62451 + (((tickAnim - 9) / 1) * (-12.83465-(-19.62451)));
            zz = 10.82298 + (((tickAnim - 9) / 1) * (10.63356-(10.82298)));
        }
        else if (tickAnim >= 10 && tickAnim < 14) {
            xx = -2.38781 + (((tickAnim - 10) / 4) * (-18.88-(-2.38781)));
            yy = -12.83465 + (((tickAnim - 10) / 4) * (4.14-(-12.83465)));
            zz = 10.63356 + (((tickAnim - 10) / 4) * (10.16-(10.63356)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg3, rightLeg3.rotateAngleX + (float) Math.toRadians(xx), rightLeg3.rotateAngleY + (float) Math.toRadians(yy), rightLeg3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = -11.07411 + (((tickAnim - 0) / 4) * (-3.45509-(-11.07411)));
            yy = 30.00444 + (((tickAnim - 0) / 4) * (1.22225-(30.00444)));
            zz = -5.59821 + (((tickAnim - 0) / 4) * (-11.89156-(-5.59821)));
        }
        else if (tickAnim >= 4 && tickAnim < 6) {
            xx = -3.45509 + (((tickAnim - 4) / 2) * (2.51612-(-3.45509)));
            yy = 1.22225 + (((tickAnim - 4) / 2) * (-3.38738-(1.22225)));
            zz = -11.89156 + (((tickAnim - 4) / 2) * (-10.7177-(-11.89156)));
        }
        else if (tickAnim >= 6 && tickAnim < 7) {
            xx = 2.51612 + (((tickAnim - 6) / 1) * (5.4088-(2.51612)));
            yy = -3.38738 + (((tickAnim - 6) / 1) * (-8.24518-(-3.38738)));
            zz = -10.7177 + (((tickAnim - 6) / 1) * (-6.98104-(-10.7177)));
        }
        else if (tickAnim >= 7 && tickAnim < 10) {
            xx = 5.4088 + (((tickAnim - 7) / 3) * (0.03966-(5.4088)));
            yy = -8.24518 + (((tickAnim - 7) / 3) * (4.06338-(-8.24518)));
            zz = -6.98104 + (((tickAnim - 7) / 3) * (-16.51116-(-6.98104)));
        }
        else if (tickAnim >= 10 && tickAnim < 14) {
            xx = 0.03966 + (((tickAnim - 10) / 4) * (-11.07411-(0.03966)));
            yy = 4.06338 + (((tickAnim - 10) / 4) * (30.00444-(4.06338)));
            zz = -16.51116 + (((tickAnim - 10) / 4) * (-5.59821-(-16.51116)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg3, leftLeg3.rotateAngleX + (float) Math.toRadians(xx), leftLeg3.rotateAngleY + (float) Math.toRadians(yy), leftLeg3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = -4.19952 + (((tickAnim - 0) / 4) * (-6.67262-(-4.19952)));
            yy = 22.04784 + (((tickAnim - 0) / 4) * (-2.316-(22.04784)));
            zz = 0.65067 + (((tickAnim - 0) / 4) * (13.33547-(0.65067)));
        }
        else if (tickAnim >= 4 && tickAnim < 7) {
            xx = -6.67262 + (((tickAnim - 4) / 3) * (0.44101-(-6.67262)));
            yy = -2.316 + (((tickAnim - 4) / 3) * (-20.84652-(-2.316)));
            zz = 13.33547 + (((tickAnim - 4) / 3) * (7.73097-(13.33547)));
        }
        else if (tickAnim >= 7 && tickAnim < 12) {
            xx = 0.44101 + (((tickAnim - 7) / 5) * (-5.15268-(0.44101)));
            yy = -20.84652 + (((tickAnim - 7) / 5) * (7.74972-(-20.84652)));
            zz = 7.73097 + (((tickAnim - 7) / 5) * (3.01077-(7.73097)));
        }
        else if (tickAnim >= 12 && tickAnim < 14) {
            xx = -5.15268 + (((tickAnim - 12) / 2) * (-4.19952-(-5.15268)));
            yy = 7.74972 + (((tickAnim - 12) / 2) * (22.04784-(7.74972)));
            zz = 3.01077 + (((tickAnim - 12) / 2) * (0.65067-(3.01077)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg1, rightLeg1.rotateAngleX + (float) Math.toRadians(xx), rightLeg1.rotateAngleY + (float) Math.toRadians(yy), rightLeg1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0.44101 + (((tickAnim - 0) / 7) * (-5.47638-(0.44101)));
            yy = 20.84652 + (((tickAnim - 0) / 7) * (-22.05491-(20.84652)));
            zz = -7.73097 + (((tickAnim - 0) / 7) * (2.15648-(-7.73097)));
        }
        else if (tickAnim >= 7 && tickAnim < 11) {
            xx = -5.47638 + (((tickAnim - 7) / 4) * (-6.67262-(-5.47638)));
            yy = -22.05491 + (((tickAnim - 7) / 4) * (2.316-(-22.05491)));
            zz = 2.15648 + (((tickAnim - 7) / 4) * (-13.33547-(2.15648)));
        }
        else if (tickAnim >= 11 && tickAnim < 14) {
            xx = -6.67262 + (((tickAnim - 11) / 3) * (0.44101-(-6.67262)));
            yy = 2.316 + (((tickAnim - 11) / 3) * (20.84652-(2.316)));
            zz = -13.33547 + (((tickAnim - 11) / 3) * (-7.73097-(-13.33547)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg1, leftLeg1.rotateAngleX + (float) Math.toRadians(xx), leftLeg1.rotateAngleY + (float) Math.toRadians(yy), leftLeg1.rotateAngleZ + (float) Math.toRadians(zz));



        this.setRotateAngle(rightAntenna, rightAntenna.rotateAngleX + (float) Math.toRadians(0), rightAntenna.rotateAngleY + (float) (Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*(167*3))-70))*15), rightAntenna.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(leftAntenna, leftAntenna.rotateAngleX + (float) Math.toRadians(0), leftAntenna.rotateAngleY + (float) (Math.toRadians(-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*(167*3))))*15), leftAntenna.rotateAngleZ + (float) Math.toRadians(0));

    }
    public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        EntityPrehistoricFloraLandClimbingGlidingBase e = (EntityPrehistoricFloraLandClimbingGlidingBase) entity;
        animator.update(entity);
        //N/A
    }

}
