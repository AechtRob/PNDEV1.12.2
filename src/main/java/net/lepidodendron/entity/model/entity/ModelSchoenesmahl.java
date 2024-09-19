package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.EntityPrehistoricFloraSchoenesmahl;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;

public class ModelSchoenesmahl extends ModelBasePalaeopedia {
    private final AdvancedModelRenderer base;
    private final AdvancedModelRenderer hips;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer tail1;
    private final AdvancedModelRenderer tail2;
    private final AdvancedModelRenderer tail3;
    private final AdvancedModelRenderer tail4;
    private final AdvancedModelRenderer tail5;
    private final AdvancedModelRenderer lefLeg1;
    private final AdvancedModelRenderer leftLeg2;
    private final AdvancedModelRenderer leftFoot;
    private final AdvancedModelRenderer lefLeg2;
    private final AdvancedModelRenderer rightLeg2;
    private final AdvancedModelRenderer rightFoot;
    private final AdvancedModelRenderer body;
    private final AdvancedModelRenderer chest;
    private final AdvancedModelRenderer leftArm1;
    private final AdvancedModelRenderer leftArm2;
    private final AdvancedModelRenderer leftHand;
    private final AdvancedModelRenderer rightArm1;
    private final AdvancedModelRenderer rightArm2;
    private final AdvancedModelRenderer rightHand;
    private final AdvancedModelRenderer neck1;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer head;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer cube_r6;
    private final AdvancedModelRenderer cube_r7;
    private final AdvancedModelRenderer jaw;
    private final AdvancedModelRenderer cube_r8;
    private final AdvancedModelRenderer cube_r9;

    private ModelAnimator animator;

    public ModelSchoenesmahl() {
        this.textureWidth = 64;
        this.textureHeight = 64;

        this.base = new AdvancedModelRenderer(this);
        this.base.setRotationPoint(0.0F, 24.0F, 8.5F);


        this.hips = new AdvancedModelRenderer(this);
        this.hips.setRotationPoint(0.0F, -0.5F, -1.0F);
        this.base.addChild(hips);
        this.setRotateAngle(hips, -0.0873F, 0.0F, 0.0F);
        this.hips.cubeList.add(new ModelBox(hips, 0, 3, -1.5F, -2.5F, 0.0F, 3, 2, 3, 0.0F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(0.0F, 0.0F, -3.0F);
        this.hips.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.1309F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 12, 26, -1.5F, -0.4F, 3.0F, 3, 1, 3, -0.01F, false));

        this.tail1 = new AdvancedModelRenderer(this);
        this.tail1.setRotationPoint(0.0F, -1.4F, 3.0F);
        this.hips.addChild(tail1);
        this.tail1.cubeList.add(new ModelBox(tail1, 0, 25, -1.0F, -1.0F, -1.0F, 2, 2, 8, 0.0F, false));

        this.tail2 = new AdvancedModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, 0.5F, 7.0F);
        this.tail1.addChild(tail2);
        this.setRotateAngle(tail2, 0.0524F, 0.0F, 0.0F);
        this.tail2.cubeList.add(new ModelBox(tail2, 12, 15, -0.25F, -0.75F, -0.5F, 1, 1, 10, -0.01F, false));
        this.tail2.cubeList.add(new ModelBox(tail2, 12, 15, -0.75F, -0.75F, -0.5F, 1, 1, 10, 0.0F, false));
        this.tail2.cubeList.add(new ModelBox(tail2, 12, 15, -0.75F, -1.25F, -0.5F, 1, 1, 10, -0.01F, false));
        this.tail2.cubeList.add(new ModelBox(tail2, 12, 15, -0.25F, -1.25F, -0.5F, 1, 1, 10, 0.0F, false));

        this.tail3 = new AdvancedModelRenderer(this);
        this.tail3.setRotationPoint(0.0F, 0.0F, 9.5F);
        this.tail2.addChild(tail3);
        this.setRotateAngle(tail3, 0.0305F, 0.0F, 0.0F);
        this.tail3.cubeList.add(new ModelBox(tail3, 15, 0, -0.5F, -1.0F, 0.0F, 1, 1, 10, 0.01F, false));

        this.tail4 = new AdvancedModelRenderer(this);
        this.tail4.setRotationPoint(0.0F, 0.0F, 10.0F);
        this.tail3.addChild(tail4);
        this.tail4.cubeList.add(new ModelBox(tail4, 0, 14, -0.5F, -1.0F, 0.0F, 1, 1, 10, 0.0F, false));

        this.tail5 = new AdvancedModelRenderer(this);
        this.tail5.setRotationPoint(0.0F, 0.0F, 10.0F);
        this.tail4.addChild(tail5);
        this.tail5.cubeList.add(new ModelBox(tail5, 0, 0, -0.5F, -1.0F, 0.0F, 1, 1, 13, 0.01F, false));

        this.lefLeg1 = new AdvancedModelRenderer(this);
        this.lefLeg1.setRotationPoint(1.5F, -0.75F, 1.75F);
        this.hips.addChild(lefLeg1);
        this.setRotateAngle(lefLeg1, 0.0F, 0.6981F, 0.1745F);
        this.lefLeg1.cubeList.add(new ModelBox(lefLeg1, 24, 22, -0.75F, -1.0F, -1.0F, 5, 1, 2, 0.01F, true));

        this.leftLeg2 = new AdvancedModelRenderer(this);
        this.leftLeg2.setRotationPoint(4.0F, 0.0F, 0.35F);
        this.lefLeg1.addChild(leftLeg2);
        this.setRotateAngle(leftLeg2, -0.1222F, -2.1817F, 0.0F);
        this.leftLeg2.cubeList.add(new ModelBox(leftLeg2, 24, 19, -0.25F, -1.0F, -0.75F, 5, 1, 2, 0.0F, true));

        this.leftFoot = new AdvancedModelRenderer(this);
        this.leftFoot.setRotationPoint(4.5F, 0.0F, 0.25F);
        this.leftLeg2.addChild(leftFoot);
        this.setRotateAngle(leftFoot, -0.0436F, 0.6545F, -0.0873F);
        this.leftFoot.cubeList.add(new ModelBox(leftFoot, 19, 14, -0.75F, 0.0F, -4.0F, 9, 0, 5, 0.0F, true));

        this.lefLeg2 = new AdvancedModelRenderer(this);
        this.lefLeg2.setRotationPoint(-1.5F, -0.75F, 1.75F);
        this.hips.addChild(lefLeg2);
        this.setRotateAngle(lefLeg2, 0.0F, -0.6981F, -0.1745F);
        this.lefLeg2.cubeList.add(new ModelBox(lefLeg2, 24, 22, -4.25F, -1.0F, -1.0F, 5, 1, 2, 0.01F, false));

        this.rightLeg2 = new AdvancedModelRenderer(this);
        this.rightLeg2.setRotationPoint(-4.0F, 0.0F, 0.35F);
        this.lefLeg2.addChild(rightLeg2);
        this.setRotateAngle(rightLeg2, -0.1222F, 2.1817F, 0.0F);
        this.rightLeg2.cubeList.add(new ModelBox(rightLeg2, 24, 19, -4.75F, -1.0F, -0.75F, 5, 1, 2, 0.0F, false));

        this.rightFoot = new AdvancedModelRenderer(this);
        this.rightFoot.setRotationPoint(-4.5F, 0.0F, 0.25F);
        this.rightLeg2.addChild(rightFoot);
        this.setRotateAngle(rightFoot, -0.0436F, -0.6545F, 0.0873F);
        this.rightFoot.cubeList.add(new ModelBox(rightFoot, 19, 14, -8.25F, 0.0F, -4.0F, 9, 0, 5, 0.0F, false));

        this.body = new AdvancedModelRenderer(this);
        this.body.setRotationPoint(0.0F, -1.1F, 0.5F);
        this.hips.addChild(body);
        this.setRotateAngle(body, 0.0873F, 0.0F, 0.0F);
        this.body.cubeList.add(new ModelBox(body, 20, 26, -2.0F, -1.5F, -6.0F, 4, 3, 6, 0.0F, false));

        this.chest = new AdvancedModelRenderer(this);
        this.chest.setRotationPoint(0.0F, 0.0F, -5.5F);
        this.body.addChild(chest);
        this.chest.cubeList.add(new ModelBox(chest, 27, 0, -2.0F, -1.5F, -6.0F, 4, 3, 6, 0.01F, false));

        this.leftArm1 = new AdvancedModelRenderer(this);
        this.leftArm1.setRotationPoint(2.0F, 0.5F, -5.2F);
        this.chest.addChild(leftArm1);
        this.setRotateAngle(leftArm1, -0.1745F, -0.6109F, 0.3054F);
        this.leftArm1.cubeList.add(new ModelBox(leftArm1, 0, 21, -0.5F, -0.5F, -0.5F, 3, 1, 1, 0.01F, true));
        this.leftArm1.cubeList.add(new ModelBox(leftArm1, 15, 11, -0.5F, -0.5F, 0.0F, 3, 1, 1, 0.0F, true));

        this.leftArm2 = new AdvancedModelRenderer(this);
        this.leftArm2.setRotationPoint(2.5F, 0.0F, 0.25F);
        this.leftArm1.addChild(leftArm2);
        this.setRotateAngle(leftArm2, 0.3054F, 1.6581F, 0.0F);
        this.leftArm2.cubeList.add(new ModelBox(leftArm2, 15, 7, -0.25F, -0.5F, -0.5F, 3, 1, 1, -0.01F, true));

        this.leftHand = new AdvancedModelRenderer(this);
        this.leftHand.setRotationPoint(2.75F, 0.25F, 0.0F);
        this.leftArm2.addChild(leftHand);
        this.setRotateAngle(leftHand, 0.0F, 0.0F, 0.0436F);
        this.leftHand.cubeList.add(new ModelBox(leftHand, 0, 0, -0.75F, 0.0F, -1.5F, 4, 0, 3, 0.0F, true));

        this.rightArm1 = new AdvancedModelRenderer(this);
        this.rightArm1.setRotationPoint(-2.0F, 0.5F, -5.2F);
        this.chest.addChild(rightArm1);
        this.setRotateAngle(rightArm1, -0.1745F, 0.6109F, -0.3054F);
        this.rightArm1.cubeList.add(new ModelBox(rightArm1, 0, 21, -2.5F, -0.5F, -0.5F, 3, 1, 1, 0.01F, false));
        this.rightArm1.cubeList.add(new ModelBox(rightArm1, 15, 11, -2.5F, -0.5F, 0.0F, 3, 1, 1, 0.0F, false));

        this.rightArm2 = new AdvancedModelRenderer(this);
        this.rightArm2.setRotationPoint(-2.5F, 0.0F, 0.25F);
        this.rightArm1.addChild(rightArm2);
        this.setRotateAngle(rightArm2, 0.3054F, -1.6581F, 0.0F);
        this.rightArm2.cubeList.add(new ModelBox(rightArm2, 15, 7, -2.75F, -0.5F, -0.5F, 3, 1, 1, -0.01F, false));

        this.rightHand = new AdvancedModelRenderer(this);
        this.rightHand.setRotationPoint(-2.75F, 0.25F, 0.0F);
        this.rightArm2.addChild(rightHand);
        this.setRotateAngle(rightHand, 0.0F, 0.0F, -0.0436F);
        this.rightHand.cubeList.add(new ModelBox(rightHand, 0, 0, -3.25F, 0.0F, -1.5F, 4, 0, 3, 0.0F, false));

        this.neck1 = new AdvancedModelRenderer(this);
        this.neck1.setRotationPoint(0.0F, -0.1F, -6.0F);
        this.chest.addChild(neck1);
        this.setRotateAngle(neck1, -0.1745F, 0.0F, 0.0F);
        this.neck1.cubeList.add(new ModelBox(neck1, 0, 8, -1.5F, -1.25F, -1.75F, 3, 2, 3, 0.01F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(0.0F, 0.75F, -1.75F);
        this.neck1.addChild(cube_r2);
        this.setRotateAngle(cube_r2, -0.1745F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 34, 9, -1.5F, -0.75F, -0.35F, 3, 1, 3, -0.01F, false));

        this.head = new AdvancedModelRenderer(this);
        this.head.setRotationPoint(0.0F, 0.25F, -1.75F);
        this.neck1.addChild(head);
        this.setRotateAngle(head, 0.1309F, 0.0F, 0.0F);
        this.head.cubeList.add(new ModelBox(head, 34, 25, -0.5F, -1.05F, -4.75F, 1, 1, 3, 0.01F, false));
        this.head.cubeList.add(new ModelBox(head, 15, 0, -1.5F, -1.0F, -1.75F, 3, 1, 2, 0.02F, false));
        this.head.cubeList.add(new ModelBox(head, 12, 14, -1.5F, -1.675F, -1.75F, 3, 1, 2, 0.0F, false));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(0.5F, 0.0F, -4.75F);
        this.head.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.0F, 0.3229F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 9, 8, -1.0F, -1.0048F, 2.1818F, 1, 1, 1, -0.01F, true));
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 0, 29, -1.0F, -1.0048F, -0.0182F, 1, 1, 3, 0.0F, true));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(0.5F, 0.0F, -4.75F);
        this.head.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.2007F, 0.3142F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 12, 17, -1.0F, -1.0048F, 0.3818F, 1, 1, 3, 0.0F, true));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(-0.5F, 0.0F, -4.75F);
        this.head.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.0F, -0.3229F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 9, 8, 0.0F, -1.0048F, 2.1818F, 1, 1, 1, -0.01F, false));
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 0, 29, 0.0F, -1.0048F, -0.0182F, 1, 1, 3, 0.0F, false));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(-0.5F, 0.0F, -4.75F);
        this.head.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.2007F, -0.3142F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 12, 17, 0.0F, -1.0048F, 0.3818F, 1, 1, 3, 0.0F, false));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(0.0F, -1.0F, -4.75F);
        this.head.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.2007F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 0, 25, -0.5F, -0.05F, 0.125F, 1, 1, 3, 0.0F, false));

        this.jaw = new AdvancedModelRenderer(this);
        this.jaw.setRotationPoint(0.0F, -0.025F, 0.25F);
        this.head.addChild(jaw);
        this.setRotateAngle(jaw, -0.0436F, 0.0F, 0.0F);
        this.jaw.cubeList.add(new ModelBox(jaw, 0, 14, -1.5F, -0.35F, -2.0F, 3, 1, 2, 0.0F, false));
        this.jaw.cubeList.add(new ModelBox(jaw, 0, 17, -0.5F, -0.375F, -5.0F, 1, 1, 3, 0.0F, false));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(0.5F, 0.65F, -5.0F);
        this.jaw.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.0F, 0.3054F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 15, 3, -1.0F, -1.0048F, -0.0182F, 1, 1, 3, -0.01F, true));
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 9, 3, -1.0F, -1.0048F, 2.1818F, 1, 1, 1, -0.02F, true));

        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(-0.5F, 0.65F, -5.0F);
        this.jaw.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.0F, -0.3054F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 9, 3, 0.0F, -1.0048F, 2.1818F, 1, 1, 1, -0.01F, false));
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 15, 3, 0.0F, -1.0048F, -0.0182F, 1, 1, 3, 0.0F, false));

        updateDefaultPose();
        animator = ModelAnimator.create();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        animate((IAnimatedEntity) entity, f, f1, f2, f3, f4, f5);
        this.base.offsetZ = this.base.offsetZ + 0.7F;
        this.base.render(f5);
    }

    public void renderStaticFloor(float f) {
        this.resetToDefaultPose();
    }
    @Override
    public void renderStaticBook(float f) {
        //Rotations, positions and sizing:
        this.base.offsetY = -1.4F;
        this.base.offsetX = -0.3F;
        this.base.rotateAngleY = (float)Math.toRadians(200);
        this.base.rotateAngleX = (float)Math.toRadians(8);
        this.base.rotateAngleZ = (float)Math.toRadians(-8);
        this.base.scaleChildren = true;
        float scaler = 3.2F;
        this.base.setScale(scaler, scaler, scaler);
        //Start of pose:
        this.setRotateAngle(base, -0.3F, 2.0F, 0.1F);
        //End of pose, now render the model:
        this.base.render(f);
        //Reset rotations, positions and sizing:
        this.base.setScale(1.0F, 1.0F, 1.0F);
        this.base.scaleChildren = false;
        resetToDefaultPose();

    }

    public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }

    @Override
    public void setLivingAnimations(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        super.setLivingAnimations(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
        this.resetToDefaultPose();
        EntityPrehistoricFloraSchoenesmahl ee = (EntityPrehistoricFloraSchoenesmahl) entitylivingbaseIn;

        if (ee.getIsFast()) {
            animRun(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
        }
        else {
            animWalk(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
        }

        if (ee.getAnimation() == ee.GRAPPLE_ANIMATION) {
            animDance(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }


    }

    public void animDance(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraSchoenesmahl entity = (EntityPrehistoricFloraSchoenesmahl) entitylivingbaseIn;
        int animCycle = 187;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0.75 + (((tickAnim - 0) / 20) * (0.75-(0.75)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 47) {
            xx = 0.75 + (((tickAnim - 20) / 27) * (0.75-(0.75)));
            yy = 0 + (((tickAnim - 20) / 27) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 27) * (0-(0)));
        }
        else if (tickAnim >= 47 && tickAnim < 50) {
            xx = 0.75 + (((tickAnim - 47) / 3) * (0.5-(0.75)));
            yy = 0 + (((tickAnim - 47) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 47) / 3) * (0-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 53) {
            xx = 0.5 + (((tickAnim - 50) / 3) * (0.75-(0.5)));
            yy = 0 + (((tickAnim - 50) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 50) / 3) * (0-(0)));
        }
        else if (tickAnim >= 53 && tickAnim < 60) {
            xx = 0.75 + (((tickAnim - 53) / 7) * (-0.25-(0.75)));
            yy = 0 + (((tickAnim - 53) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 53) / 7) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 66) {
            xx = -0.25 + (((tickAnim - 60) / 6) * (0.75-(-0.25)));
            yy = 0 + (((tickAnim - 60) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 6) * (0-(0)));
        }
        else if (tickAnim >= 66 && tickAnim < 74) {
            xx = 0.75 + (((tickAnim - 66) / 8) * (-0.25-(0.75)));
            yy = 0 + (((tickAnim - 66) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 66) / 8) * (0-(0)));
        }
        else if (tickAnim >= 74 && tickAnim < 91) {
            xx = -0.25 + (((tickAnim - 74) / 17) * (-0.25-(-0.25)));
            yy = 0 + (((tickAnim - 74) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 74) / 17) * (0-(0)));
        }
        else if (tickAnim >= 91 && tickAnim < 105) {
            xx = -0.25 + (((tickAnim - 91) / 14) * (-0.25-(-0.25)));
            yy = 0 + (((tickAnim - 91) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 91) / 14) * (0-(0)));
        }
        else if (tickAnim >= 105 && tickAnim < 130) {
            xx = -0.25 + (((tickAnim - 105) / 25) * (-0.25-(-0.25)));
            yy = 0 + (((tickAnim - 105) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 105) / 25) * (0-(0)));
        }
        else if (tickAnim >= 130 && tickAnim < 153) {
            xx = -0.25 + (((tickAnim - 130) / 23) * (-0.25-(-0.25)));
            yy = 0 + (((tickAnim - 130) / 23) * (0-(0)));
            zz = 0 + (((tickAnim - 130) / 23) * (0-(0)));
        }
        else if (tickAnim >= 153 && tickAnim < 170) {
            xx = -0.25 + (((tickAnim - 153) / 17) * (-0.25-(-0.25)));
            yy = 0 + (((tickAnim - 153) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 153) / 17) * (0-(0)));
        }
        else if (tickAnim >= 170 && tickAnim < 188) {
            xx = -0.25 + (((tickAnim - 170) / 18) * (0.75-(-0.25)));
            yy = 0 + (((tickAnim - 170) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 170) / 18) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(hips, hips.rotateAngleX + (float) Math.toRadians(xx), hips.rotateAngleY + (float) Math.toRadians(yy), hips.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 47 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 47) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 47) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 47) / 3) * (-0.025-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 53) {
            xx = 0 + (((tickAnim - 50) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 50) / 3) * (0-(0)));
            zz = -0.025 + (((tickAnim - 50) / 3) * (0-(-0.025)));
        }
        else if (tickAnim >= 53 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 53) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 53) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 53) / 7) * (-0.05-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 66) {
            xx = 0 + (((tickAnim - 60) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 60) / 6) * (0-(0)));
            zz = -0.05 + (((tickAnim - 60) / 6) * (0-(-0.05)));
        }
        else if (tickAnim >= 66 && tickAnim < 74) {
            xx = 0 + (((tickAnim - 66) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 66) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 66) / 8) * (-0.05-(0)));
        }
        else if (tickAnim >= 74 && tickAnim < 91) {
            xx = 0 + (((tickAnim - 74) / 17) * (0-(0)));
            yy = 0 + (((tickAnim - 74) / 17) * (0-(0)));
            zz = -0.05 + (((tickAnim - 74) / 17) * (-0.05-(-0.05)));
        }
        else if (tickAnim >= 91 && tickAnim < 105) {
            xx = 0 + (((tickAnim - 91) / 14) * (0-(0)));
            yy = 0 + (((tickAnim - 91) / 14) * (0-(0)));
            zz = -0.05 + (((tickAnim - 91) / 14) * (-0.05-(-0.05)));
        }
        else if (tickAnim >= 105 && tickAnim < 130) {
            xx = 0 + (((tickAnim - 105) / 25) * (0-(0)));
            yy = 0 + (((tickAnim - 105) / 25) * (0-(0)));
            zz = -0.05 + (((tickAnim - 105) / 25) * (-0.05-(-0.05)));
        }
        else if (tickAnim >= 130 && tickAnim < 153) {
            xx = 0 + (((tickAnim - 130) / 23) * (0-(0)));
            yy = 0 + (((tickAnim - 130) / 23) * (0-(0)));
            zz = -0.05 + (((tickAnim - 130) / 23) * (-0.05-(-0.05)));
        }
        else if (tickAnim >= 153 && tickAnim < 170) {
            xx = 0 + (((tickAnim - 153) / 17) * (0-(0)));
            yy = 0 + (((tickAnim - 153) / 17) * (0-(0)));
            zz = -0.05 + (((tickAnim - 153) / 17) * (-0.05-(-0.05)));
        }
        else if (tickAnim >= 170 && tickAnim < 188) {
            xx = 0 + (((tickAnim - 170) / 18) * (0-(0)));
            yy = 0 + (((tickAnim - 170) / 18) * (0-(0)));
            zz = -0.05 + (((tickAnim - 170) / 18) * (0-(-0.05)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.hips.rotationPointX = this.hips.rotationPointX + (float)(xx);
        this.hips.rotationPointY = this.hips.rotationPointY - (float)(yy);
        this.hips.rotationPointZ = this.hips.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = -3.75 + (((tickAnim - 0) / 20) * (-3.75-(-3.75)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 47) {
            xx = -3.75 + (((tickAnim - 20) / 27) * (-3.75289-(-3.75)));
            yy = 0 + (((tickAnim - 20) / 27) * (2.24518-(0)));
            zz = 0 + (((tickAnim - 20) / 27) * (-0.14723-(0)));
        }
        else if (tickAnim >= 47 && tickAnim < 60) {
            xx = -3.75289 + (((tickAnim - 47) / 13) * (-2.25289-(-3.75289)));
            yy = 2.24518 + (((tickAnim - 47) / 13) * (2.24518-(2.24518)));
            zz = -0.14723 + (((tickAnim - 47) / 13) * (-0.14723-(-0.14723)));
        }
        else if (tickAnim >= 60 && tickAnim < 153) {
            xx = -2.25289 + (((tickAnim - 60) / 93) * (-2.25289-(-2.25289)));
            yy = 2.24518 + (((tickAnim - 60) / 93) * (2.24518-(2.24518)));
            zz = -0.14723 + (((tickAnim - 60) / 93) * (-0.14723-(-0.14723)));
        }
        else if (tickAnim >= 153 && tickAnim < 170) {
            xx = -2.25289 + (((tickAnim - 153) / 17) * (-2.25289-(-2.25289)));
            yy = 2.24518 + (((tickAnim - 153) / 17) * (2.24518-(2.24518)));
            zz = -0.14723 + (((tickAnim - 153) / 17) * (-0.14723-(-0.14723)));
        }
        else if (tickAnim >= 170 && tickAnim < 188) {
            xx = -2.25289 + (((tickAnim - 170) / 18) * (-3.75-(-2.25289)));
            yy = 2.24518 + (((tickAnim - 170) / 18) * (0-(2.24518)));
            zz = -0.14723 + (((tickAnim - 170) / 18) * (0-(-0.14723)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail1, tail1.rotateAngleX + (float) Math.toRadians(xx), tail1.rotateAngleY + (float) Math.toRadians(yy), tail1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 3.00278 + (((tickAnim - 0) / 20) * (3.00278-(3.00278)));
            yy = 1.74041 + (((tickAnim - 0) / 20) * (1.74041-(1.74041)));
            zz = 0.18298 + (((tickAnim - 0) / 20) * (0.18298-(0.18298)));
        }
        else if (tickAnim >= 20 && tickAnim < 47) {
            xx = 3.00278 + (((tickAnim - 20) / 27) * (3.04157-(3.00278)));
            yy = 1.74041 + (((tickAnim - 20) / 27) * (6.71285-(1.74041)));
            zz = 0.18298 + (((tickAnim - 20) / 27) * (0.70881-(0.18298)));
        }
        else if (tickAnim >= 47 && tickAnim < 153) {
            xx = 3.04157 + (((tickAnim - 47) / 106) * (3.04157-(3.04157)));
            yy = 6.71285 + (((tickAnim - 47) / 106) * (6.71285-(6.71285)));
            zz = 0.70881 + (((tickAnim - 47) / 106) * (0.70881-(0.70881)));
        }
        else if (tickAnim >= 153 && tickAnim < 170) {
            xx = 3.04157 + (((tickAnim - 153) / 17) * (3.04157-(3.04157)));
            yy = 6.71285 + (((tickAnim - 153) / 17) * (6.71285-(6.71285)));
            zz = 0.70881 + (((tickAnim - 153) / 17) * (0.70881-(0.70881)));
        }
        else if (tickAnim >= 170 && tickAnim < 188) {
            xx = 3.04157 + (((tickAnim - 170) / 18) * (3.00278-(3.04157)));
            yy = 6.71285 + (((tickAnim - 170) / 18) * (1.74041-(6.71285)));
            zz = 0.70881 + (((tickAnim - 170) / 18) * (0.18298-(0.70881)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(xx), tail2.rotateAngleY + (float) Math.toRadians(yy), tail2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = -0.49942 + (((tickAnim - 0) / 20) * (-0.49942-(-0.49942)));
            yy = 1.74958 + (((tickAnim - 0) / 20) * (1.74958-(1.74958)));
            zz = 0.03819 + (((tickAnim - 0) / 20) * (0.03819-(0.03819)));
        }
        else if (tickAnim >= 20 && tickAnim < 47) {
            xx = -0.49942 + (((tickAnim - 20) / 27) * (-0.49957-(-0.49942)));
            yy = 1.74958 + (((tickAnim - 20) / 27) * (-1.49964-(1.74958)));
            zz = 0.03819 + (((tickAnim - 20) / 27) * (-0.03273-(0.03819)));
        }
        else if (tickAnim >= 47 && tickAnim < 153) {
            xx = -0.49957 + (((tickAnim - 47) / 106) * (-0.49957-(-0.49957)));
            yy = -1.49964 + (((tickAnim - 47) / 106) * (-1.49964-(-1.49964)));
            zz = -0.03273 + (((tickAnim - 47) / 106) * (-0.03273-(-0.03273)));
        }
        else if (tickAnim >= 153 && tickAnim < 170) {
            xx = -0.49957 + (((tickAnim - 153) / 17) * (-0.49957-(-0.49957)));
            yy = -1.49964 + (((tickAnim - 153) / 17) * (-1.49964-(-1.49964)));
            zz = -0.03273 + (((tickAnim - 153) / 17) * (-0.03273-(-0.03273)));
        }
        else if (tickAnim >= 170 && tickAnim < 188) {
            xx = -0.49957 + (((tickAnim - 170) / 18) * (-0.49942-(-0.49957)));
            yy = -1.49964 + (((tickAnim - 170) / 18) * (1.74958-(-1.49964)));
            zz = -0.03273 + (((tickAnim - 170) / 18) * (0.03819-(-0.03273)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(xx), tail3.rotateAngleY + (float) Math.toRadians(yy), tail3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            yy = 3.5 + (((tickAnim - 0) / 20) * (3.5-(3.5)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 47) {
            xx = 0 + (((tickAnim - 20) / 27) * (0-(0)));
            yy = 3.5 + (((tickAnim - 20) / 27) * (-7-(3.5)));
            zz = 0 + (((tickAnim - 20) / 27) * (0-(0)));
        }
        else if (tickAnim >= 47 && tickAnim < 153) {
            xx = 0 + (((tickAnim - 47) / 106) * (0-(0)));
            yy = -7 + (((tickAnim - 47) / 106) * (-7-(-7)));
            zz = 0 + (((tickAnim - 47) / 106) * (0-(0)));
        }
        else if (tickAnim >= 153 && tickAnim < 170) {
            xx = 0 + (((tickAnim - 153) / 17) * (0-(0)));
            yy = -7 + (((tickAnim - 153) / 17) * (-7-(-7)));
            zz = 0 + (((tickAnim - 153) / 17) * (0-(0)));
        }
        else if (tickAnim >= 170 && tickAnim < 188) {
            xx = 0 + (((tickAnim - 170) / 18) * (0-(0)));
            yy = -7 + (((tickAnim - 170) / 18) * (3.5-(-7)));
            zz = 0 + (((tickAnim - 170) / 18) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(xx), tail4.rotateAngleY + (float) Math.toRadians(yy), tail4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            yy = 3.5 + (((tickAnim - 0) / 20) * (3.5-(3.5)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 47) {
            xx = 0 + (((tickAnim - 20) / 27) * (0-(0)));
            yy = 3.5 + (((tickAnim - 20) / 27) * (-10.5-(3.5)));
            zz = 0 + (((tickAnim - 20) / 27) * (0-(0)));
        }
        else if (tickAnim >= 47 && tickAnim < 153) {
            xx = 0 + (((tickAnim - 47) / 106) * (0-(0)));
            yy = -10.5 + (((tickAnim - 47) / 106) * (-10.5-(-10.5)));
            zz = 0 + (((tickAnim - 47) / 106) * (0-(0)));
        }
        else if (tickAnim >= 153 && tickAnim < 170) {
            xx = 0 + (((tickAnim - 153) / 17) * (0-(0)));
            yy = -10.5 + (((tickAnim - 153) / 17) * (-10.5-(-10.5)));
            zz = 0 + (((tickAnim - 153) / 17) * (0-(0)));
        }
        else if (tickAnim >= 170 && tickAnim < 188) {
            xx = 0 + (((tickAnim - 170) / 18) * (0-(0)));
            yy = -10.5 + (((tickAnim - 170) / 18) * (3.5-(-10.5)));
            zz = 0 + (((tickAnim - 170) / 18) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail5, tail5.rotateAngleX + (float) Math.toRadians(xx), tail5.rotateAngleY + (float) Math.toRadians(yy), tail5.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 47) {
            xx = 0 + (((tickAnim - 20) / 27) * (0-(0)));
            yy = 0 + (((tickAnim - 20) / 27) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 27) * (0-(0)));
        }
        else if (tickAnim >= 47 && tickAnim < 188) {
            xx = 0 + (((tickAnim - 47) / 141) * (0-(0)));
            yy = 0 + (((tickAnim - 47) / 141) * (0-(0)));
            zz = 0 + (((tickAnim - 47) / 141) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(lefLeg1, lefLeg1.rotateAngleX + (float) Math.toRadians(xx), lefLeg1.rotateAngleY + (float) Math.toRadians(yy), lefLeg1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = -6 + (((tickAnim - 0) / 20) * (-6-(-6)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 47) {
            xx = -6 + (((tickAnim - 20) / 27) * (-6-(-6)));
            yy = 0 + (((tickAnim - 20) / 27) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 27) * (0-(0)));
        }
        else if (tickAnim >= 47 && tickAnim < 50) {
            xx = -6 + (((tickAnim - 47) / 3) * (-9+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*3-(-6)));
            yy = 0 + (((tickAnim - 47) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 47) / 3) * (0-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 53) {
            xx = -9+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*3 + (((tickAnim - 50) / 3) * (-6.825+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*3-(-9+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*3)));
            yy = 0 + (((tickAnim - 50) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 50) / 3) * (0-(0)));
        }
        else if (tickAnim >= 53 && tickAnim < 60) {
            xx = -6.825+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*3 + (((tickAnim - 53) / 7) * (-12.75-(-6.825+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*3)));
            yy = 0 + (((tickAnim - 53) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 53) / 7) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 65) {
            xx = -12.75 + (((tickAnim - 60) / 5) * (-7.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*15-(-12.75)));
            yy = 0 + (((tickAnim - 60) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 5) * (0-(0)));
        }
        else if (tickAnim >= 65 && tickAnim < 66) {
            xx = -7.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*15 + (((tickAnim - 65) / 1) * (-0.25-(-7.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*15)));
            yy = 0 + (((tickAnim - 65) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 65) / 1) * (0-(0)));
        }
        else if (tickAnim >= 66 && tickAnim < 67) {
            xx = -0.25 + (((tickAnim - 66) / 1) * (9.1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-15-(-0.25)));
            yy = 0 + (((tickAnim - 66) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 66) / 1) * (0-(0)));
        }
        else if (tickAnim >= 67 && tickAnim < 72) {
            xx = 9.1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-15 + (((tickAnim - 67) / 5) * (-12.75-(9.1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-15)));
            yy = 0 + (((tickAnim - 67) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 67) / 5) * (0-(0)));
        }
        else if (tickAnim >= 72 && tickAnim < 73) {
            xx = -12.75 + (((tickAnim - 72) / 1) * (-13-(-12.75)));
            yy = 0 + (((tickAnim - 72) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 72) / 1) * (0-(0)));
        }
        else if (tickAnim >= 73 && tickAnim < 73) {
            xx = -13 + (((tickAnim - 73) / 0) * (-12.75-(-13)));
            yy = 0 + (((tickAnim - 73) / 0) * (0-(0)));
            zz = 0 + (((tickAnim - 73) / 0) * (0-(0)));
        }
        else if (tickAnim >= 73 && tickAnim < 74) {
            xx = -12.75 + (((tickAnim - 73) / 1) * (-12.75-(-12.75)));
            yy = 0 + (((tickAnim - 73) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 73) / 1) * (0-(0)));
        }
        else if (tickAnim >= 74 && tickAnim < 79) {
            xx = -12.75 + (((tickAnim - 74) / 5) * (-14+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*15-(-12.75)));
            yy = 0 + (((tickAnim - 74) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 74) / 5) * (0-(0)));
        }
        else if (tickAnim >= 79 && tickAnim < 80) {
            xx = -14+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*15 + (((tickAnim - 79) / 1) * (0.5-(-14+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*15)));
            yy = 0 + (((tickAnim - 79) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 79) / 1) * (0-(0)));
        }
        else if (tickAnim >= 80 && tickAnim < 81) {
            xx = 0.5 + (((tickAnim - 80) / 1) * (11.75+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-15-(0.5)));
            yy = 0 + (((tickAnim - 80) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 80) / 1) * (0-(0)));
        }
        else if (tickAnim >= 81 && tickAnim < 86) {
            xx = 11.75+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-15 + (((tickAnim - 81) / 5) * (-12.75-(11.75+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-15)));
            yy = 0 + (((tickAnim - 81) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 81) / 5) * (0-(0)));
        }
        else if (tickAnim >= 86 && tickAnim < 87) {
            xx = -12.75 + (((tickAnim - 86) / 1) * (-13-(-12.75)));
            yy = 0 + (((tickAnim - 86) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 86) / 1) * (0-(0)));
        }
        else if (tickAnim >= 87 && tickAnim < 88) {
            xx = -13 + (((tickAnim - 87) / 1) * (-12.75-(-13)));
            yy = 0 + (((tickAnim - 87) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 87) / 1) * (0-(0)));
        }
        else if (tickAnim >= 88 && tickAnim < 91) {
            xx = -12.75 + (((tickAnim - 88) / 3) * (-12.75-(-12.75)));
            yy = 0 + (((tickAnim - 88) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 88) / 3) * (0-(0)));
        }
        else if (tickAnim >= 91 && tickAnim < 96) {
            xx = -12.75 + (((tickAnim - 91) / 5) * (9+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*15-(-12.75)));
            yy = 0 + (((tickAnim - 91) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 91) / 5) * (0-(0)));
        }
        else if (tickAnim >= 96 && tickAnim < 97) {
            xx = 9+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*15 + (((tickAnim - 96) / 1) * (0.5-(9+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*15)));
            yy = 0 + (((tickAnim - 96) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 96) / 1) * (0-(0)));
        }
        else if (tickAnim >= 97 && tickAnim < 98) {
            xx = 0.5 + (((tickAnim - 97) / 1) * (-10.65+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-15-(0.5)));
            yy = 0 + (((tickAnim - 97) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 97) / 1) * (0-(0)));
        }
        else if (tickAnim >= 98 && tickAnim < 103) {
            xx = -10.65+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-15 + (((tickAnim - 98) / 5) * (-12.75-(-10.65+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-15)));
            yy = 0 + (((tickAnim - 98) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 98) / 5) * (0-(0)));
        }
        else if (tickAnim >= 103 && tickAnim < 103) {
            xx = -12.75 + (((tickAnim - 103) / 0) * (-13-(-12.75)));
            yy = 0 + (((tickAnim - 103) / 0) * (0-(0)));
            zz = 0 + (((tickAnim - 103) / 0) * (0-(0)));
        }
        else if (tickAnim >= 103 && tickAnim < 104) {
            xx = -13 + (((tickAnim - 103) / 1) * (-12.75-(-13)));
            yy = 0 + (((tickAnim - 103) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 103) / 1) * (0-(0)));
        }
        else if (tickAnim >= 104 && tickAnim < 105) {
            xx = -12.75 + (((tickAnim - 104) / 1) * (-12.75-(-12.75)));
            yy = 0 + (((tickAnim - 104) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 104) / 1) * (0-(0)));
        }
        else if (tickAnim >= 105 && tickAnim < 110) {
            xx = -12.75 + (((tickAnim - 105) / 5) * (13.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*15-(-12.75)));
            yy = 0 + (((tickAnim - 105) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 105) / 5) * (0-(0)));
        }
        else if (tickAnim >= 110 && tickAnim < 111) {
            xx = 13.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*15 + (((tickAnim - 110) / 1) * (0.5-(13.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*15)));
            yy = 0 + (((tickAnim - 110) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 110) / 1) * (0-(0)));
        }
        else if (tickAnim >= 111 && tickAnim < 112) {
            xx = 0.5 + (((tickAnim - 111) / 1) * (19.25-Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-24.5-(0.5)));
            yy = 0 + (((tickAnim - 111) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 111) / 1) * (0-(0)));
        }
        else if (tickAnim >= 112 && tickAnim < 117) {
            xx = 19.25-Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-24.5 + (((tickAnim - 112) / 5) * (-12.75-(19.25-Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-24.5)));
            yy = 0 + (((tickAnim - 112) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 112) / 5) * (0-(0)));
        }
        else if (tickAnim >= 117 && tickAnim < 118) {
            xx = -12.75 + (((tickAnim - 117) / 1) * (-13-(-12.75)));
            yy = 0 + (((tickAnim - 117) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 117) / 1) * (0-(0)));
        }
        else if (tickAnim >= 118 && tickAnim < 118) {
            xx = -13 + (((tickAnim - 118) / 0) * (-9.05+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*15-(-13)));
            yy = 0 + (((tickAnim - 118) / 0) * (0-(0)));
            zz = 0 + (((tickAnim - 118) / 0) * (0-(0)));
        }
        else if (tickAnim >= 118 && tickAnim < 130) {
            xx = -9.05+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*15 + (((tickAnim - 118) / 12) * (-0.5-(-9.05+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*15)));
            yy = 0 + (((tickAnim - 118) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 118) / 12) * (0-(0)));
        }
        else if (tickAnim >= 130 && tickAnim < 153) {
            xx = -0.5 + (((tickAnim - 130) / 23) * (-0.5-(-0.5)));
            yy = 0 + (((tickAnim - 130) / 23) * (0-(0)));
            zz = 0 + (((tickAnim - 130) / 23) * (0-(0)));
        }
        else if (tickAnim >= 153 && tickAnim < 170) {
            xx = -0.5 + (((tickAnim - 153) / 17) * (-0.5-(-0.5)));
            yy = 0 + (((tickAnim - 153) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 153) / 17) * (0-(0)));
        }
        else if (tickAnim >= 170 && tickAnim < 188) {
            xx = -0.5 + (((tickAnim - 170) / 18) * (-6-(-0.5)));
            yy = 0 + (((tickAnim - 170) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 170) / 18) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(xx), body.rotateAngleY + (float) Math.toRadians(yy), body.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = -1.75 + (((tickAnim - 0) / 20) * (-1.75-(-1.75)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 47) {
            xx = -1.75 + (((tickAnim - 20) / 27) * (-1.75-(-1.75)));
            yy = 0 + (((tickAnim - 20) / 27) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 27) * (0-(0)));
        }
        else if (tickAnim >= 47 && tickAnim < 50) {
            xx = -1.75 + (((tickAnim - 47) / 3) * (2.925+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*3-(-1.75)));
            yy = 0 + (((tickAnim - 47) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 47) / 3) * (0-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 53) {
            xx = 2.925+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*3 + (((tickAnim - 50) / 3) * (2.9+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*3-(2.925+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*3)));
            yy = 0 + (((tickAnim - 50) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 50) / 3) * (0-(0)));
        }
        else if (tickAnim >= 53 && tickAnim < 60) {
            xx = 2.9+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*3 + (((tickAnim - 53) / 7) * (-1.5-(2.9+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*3)));
            yy = 0 + (((tickAnim - 53) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 53) / 7) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 65) {
            xx = -1.5 + (((tickAnim - 60) / 5) * (0-(-1.5)));
            yy = 0 + (((tickAnim - 60) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 5) * (0-(0)));
        }
        else if (tickAnim >= 65 && tickAnim < 66) {
            xx = 0 + (((tickAnim - 65) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 65) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 65) / 1) * (0-(0)));
        }
        else if (tickAnim >= 66 && tickAnim < 67) {
            xx = 0 + (((tickAnim - 66) / 1) * (10.1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-15-(0)));
            yy = 0 + (((tickAnim - 66) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 66) / 1) * (0-(0)));
        }
        else if (tickAnim >= 67 && tickAnim < 72) {
            xx = 10.1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-15 + (((tickAnim - 67) / 5) * (-1.5-(10.1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-15)));
            yy = 0 + (((tickAnim - 67) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 67) / 5) * (0-(0)));
        }
        else if (tickAnim >= 72 && tickAnim < 73) {
            xx = -1.5 + (((tickAnim - 72) / 1) * (-2.75-(-1.5)));
            yy = 0 + (((tickAnim - 72) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 72) / 1) * (0-(0)));
        }
        else if (tickAnim >= 73 && tickAnim < 73) {
            xx = -2.75 + (((tickAnim - 73) / 0) * (-1.5-(-2.75)));
            yy = 0 + (((tickAnim - 73) / 0) * (0-(0)));
            zz = 0 + (((tickAnim - 73) / 0) * (0-(0)));
        }
        else if (tickAnim >= 73 && tickAnim < 74) {
            xx = -1.5 + (((tickAnim - 73) / 1) * (-1.5-(-1.5)));
            yy = 0 + (((tickAnim - 73) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 73) / 1) * (0-(0)));
        }
        else if (tickAnim >= 74 && tickAnim < 79) {
            xx = -1.5 + (((tickAnim - 74) / 5) * (0-(-1.5)));
            yy = 0 + (((tickAnim - 74) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 74) / 5) * (0-(0)));
        }
        else if (tickAnim >= 79 && tickAnim < 80) {
            xx = 0 + (((tickAnim - 79) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 79) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 79) / 1) * (0-(0)));
        }
        else if (tickAnim >= 80 && tickAnim < 81) {
            xx = 0 + (((tickAnim - 80) / 1) * (-12.3+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*15-(0)));
            yy = 0 + (((tickAnim - 80) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 80) / 1) * (0-(0)));
        }
        else if (tickAnim >= 81 && tickAnim < 86) {
            xx = -12.3+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*15 + (((tickAnim - 81) / 5) * (-1.5-(-12.3+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*15)));
            yy = 0 + (((tickAnim - 81) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 81) / 5) * (0-(0)));
        }
        else if (tickAnim >= 86 && tickAnim < 87) {
            xx = -1.5 + (((tickAnim - 86) / 1) * (-2.75-(-1.5)));
            yy = 0 + (((tickAnim - 86) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 86) / 1) * (0-(0)));
        }
        else if (tickAnim >= 87 && tickAnim < 88) {
            xx = -2.75 + (((tickAnim - 87) / 1) * (-1.5-(-2.75)));
            yy = 0 + (((tickAnim - 87) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 87) / 1) * (0-(0)));
        }
        else if (tickAnim >= 88 && tickAnim < 91) {
            xx = -1.5 + (((tickAnim - 88) / 3) * (-1.5-(-1.5)));
            yy = 0 + (((tickAnim - 88) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 88) / 3) * (0-(0)));
        }
        else if (tickAnim >= 91 && tickAnim < 96) {
            xx = -1.5 + (((tickAnim - 91) / 5) * (0-(-1.5)));
            yy = 0 + (((tickAnim - 91) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 91) / 5) * (0-(0)));
        }
        else if (tickAnim >= 96 && tickAnim < 97) {
            xx = 0 + (((tickAnim - 96) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 96) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 96) / 1) * (0-(0)));
        }
        else if (tickAnim >= 97 && tickAnim < 98) {
            xx = 0 + (((tickAnim - 97) / 1) * (-9.9+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-15-(0)));
            yy = 0 + (((tickAnim - 97) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 97) / 1) * (0-(0)));
        }
        else if (tickAnim >= 98 && tickAnim < 103) {
            xx = -9.9+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-15 + (((tickAnim - 98) / 5) * (-1.5-(-9.9+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-15)));
            yy = 0 + (((tickAnim - 98) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 98) / 5) * (0-(0)));
        }
        else if (tickAnim >= 103 && tickAnim < 103) {
            xx = -1.5 + (((tickAnim - 103) / 0) * (-2.75-(-1.5)));
            yy = 0 + (((tickAnim - 103) / 0) * (0-(0)));
            zz = 0 + (((tickAnim - 103) / 0) * (0-(0)));
        }
        else if (tickAnim >= 103 && tickAnim < 104) {
            xx = -2.75 + (((tickAnim - 103) / 1) * (-1.5-(-2.75)));
            yy = 0 + (((tickAnim - 103) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 103) / 1) * (0-(0)));
        }
        else if (tickAnim >= 104 && tickAnim < 105) {
            xx = -1.5 + (((tickAnim - 104) / 1) * (-1.5-(-1.5)));
            yy = 0 + (((tickAnim - 104) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 104) / 1) * (0-(0)));
        }
        else if (tickAnim >= 105 && tickAnim < 110) {
            xx = -1.5 + (((tickAnim - 105) / 5) * (0-(-1.5)));
            yy = 0 + (((tickAnim - 105) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 105) / 5) * (0-(0)));
        }
        else if (tickAnim >= 110 && tickAnim < 111) {
            xx = 0 + (((tickAnim - 110) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 110) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 110) / 1) * (0-(0)));
        }
        else if (tickAnim >= 111 && tickAnim < 112) {
            xx = 0 + (((tickAnim - 111) / 1) * (10.7+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*15-(0)));
            yy = 0 + (((tickAnim - 111) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 111) / 1) * (0-(0)));
        }
        else if (tickAnim >= 112 && tickAnim < 117) {
            xx = 10.7+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*15 + (((tickAnim - 112) / 5) * (-1.5-(10.7+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*15)));
            yy = 0 + (((tickAnim - 112) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 112) / 5) * (0-(0)));
        }
        else if (tickAnim >= 117 && tickAnim < 118) {
            xx = -1.5 + (((tickAnim - 117) / 1) * (-2.75-(-1.5)));
            yy = 0 + (((tickAnim - 117) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 117) / 1) * (0-(0)));
        }
        else if (tickAnim >= 118 && tickAnim < 118) {
            xx = -2.75 + (((tickAnim - 118) / 0) * (-1.5-(-2.75)));
            yy = 0 + (((tickAnim - 118) / 0) * (0-(0)));
            zz = 0 + (((tickAnim - 118) / 0) * (0-(0)));
        }
        else if (tickAnim >= 118 && tickAnim < 130) {
            xx = -1.5 + (((tickAnim - 118) / 12) * (4.25-(-1.5)));
            yy = 0 + (((tickAnim - 118) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 118) / 12) * (0-(0)));
        }
        else if (tickAnim >= 130 && tickAnim < 153) {
            xx = 4.25 + (((tickAnim - 130) / 23) * (4.25-(4.25)));
            yy = 0 + (((tickAnim - 130) / 23) * (0-(0)));
            zz = 0 + (((tickAnim - 130) / 23) * (0-(0)));
        }
        else if (tickAnim >= 153 && tickAnim < 170) {
            xx = 4.25 + (((tickAnim - 153) / 17) * (4.25-(4.25)));
            yy = 0 + (((tickAnim - 153) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 153) / 17) * (0-(0)));
        }
        else if (tickAnim >= 170 && tickAnim < 188) {
            xx = 4.25 + (((tickAnim - 170) / 18) * (-1.75-(4.25)));
            yy = 0 + (((tickAnim - 170) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 170) / 18) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(xx), chest.rotateAngleY + (float) Math.toRadians(yy), chest.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 14.12164 + (((tickAnim - 0) / 20) * (14.12164-(14.12164)));
            yy = 1.55079 + (((tickAnim - 0) / 20) * (1.55079-(1.55079)));
            zz = 13.4344 + (((tickAnim - 0) / 20) * (13.4344-(13.4344)));
        }
        else if (tickAnim >= 20 && tickAnim < 47) {
            xx = 14.12164 + (((tickAnim - 20) / 27) * (14.12164-(14.12164)));
            yy = 1.55079 + (((tickAnim - 20) / 27) * (1.55079-(1.55079)));
            zz = 13.4344 + (((tickAnim - 20) / 27) * (13.4344-(13.4344)));
        }
        else if (tickAnim >= 47 && tickAnim < 50) {
            xx = 14.12164 + (((tickAnim - 47) / 3) * (6.58852-(14.12164)));
            yy = 1.55079 + (((tickAnim - 47) / 3) * (0.1878-(1.55079)));
            zz = 13.4344 + (((tickAnim - 47) / 3) * (34.24287-(13.4344)));
        }
        else if (tickAnim >= 50 && tickAnim < 53) {
            xx = 6.58852 + (((tickAnim - 50) / 3) * (4.14888-(6.58852)));
            yy = 0.1878 + (((tickAnim - 50) / 3) * (-0.03297-(0.1878)));
            zz = 34.24287 + (((tickAnim - 50) / 3) * (28.459-(34.24287)));
        }
        else if (tickAnim >= 53 && tickAnim < 60) {
            xx = 4.14888 + (((tickAnim - 53) / 7) * (-2.43887-(4.14888)));
            yy = -0.03297 + (((tickAnim - 53) / 7) * (2.06348-(-0.03297)));
            zz = 28.459 + (((tickAnim - 53) / 7) * (50.3634-(28.459)));
        }
        else if (tickAnim >= 60 && tickAnim < 65) {
            xx = -2.43887 + (((tickAnim - 60) / 5) * (0-(-2.43887)));
            yy = 2.06348 + (((tickAnim - 60) / 5) * (0-(2.06348)));
            zz = 50.3634 + (((tickAnim - 60) / 5) * (0-(50.3634)));
        }
        else if (tickAnim >= 65 && tickAnim < 66) {
            xx = 0 + (((tickAnim - 65) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 65) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 65) / 1) * (0-(0)));
        }
        else if (tickAnim >= 66 && tickAnim < 67) {
            xx = 0 + (((tickAnim - 66) / 1) * (10.1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-15-(0)));
            yy = 0 + (((tickAnim - 66) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 66) / 1) * (0-(0)));
        }
        else if (tickAnim >= 67 && tickAnim < 72) {
            xx = 10.1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-15 + (((tickAnim - 67) / 5) * (-2.43887-(10.1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-15)));
            yy = 0 + (((tickAnim - 67) / 5) * (2.06348-(0)));
            zz = 0 + (((tickAnim - 67) / 5) * (50.3634-(0)));
        }
        else if (tickAnim >= 72 && tickAnim < 73) {
            xx = -2.43887 + (((tickAnim - 72) / 1) * (-3.09708-(-2.43887)));
            yy = 2.06348 + (((tickAnim - 72) / 1) * (-2.08159-(2.06348)));
            zz = 50.3634 + (((tickAnim - 72) / 1) * (51.50991-(50.3634)));
        }
        else if (tickAnim >= 73 && tickAnim < 73) {
            xx = -3.09708 + (((tickAnim - 73) / 0) * (-2.43887-(-3.09708)));
            yy = -2.08159 + (((tickAnim - 73) / 0) * (2.06348-(-2.08159)));
            zz = 51.50991 + (((tickAnim - 73) / 0) * (50.3634-(51.50991)));
        }
        else if (tickAnim >= 73 && tickAnim < 74) {
            xx = -2.43887 + (((tickAnim - 73) / 1) * (-2.43887-(-2.43887)));
            yy = 2.06348 + (((tickAnim - 73) / 1) * (2.06348-(2.06348)));
            zz = 50.3634 + (((tickAnim - 73) / 1) * (50.3634-(50.3634)));
        }
        else if (tickAnim >= 74 && tickAnim < 79) {
            xx = -2.43887 + (((tickAnim - 74) / 5) * (0-(-2.43887)));
            yy = 2.06348 + (((tickAnim - 74) / 5) * (0-(2.06348)));
            zz = 50.3634 + (((tickAnim - 74) / 5) * (0-(50.3634)));
        }
        else if (tickAnim >= 79 && tickAnim < 80) {
            xx = 0 + (((tickAnim - 79) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 79) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 79) / 1) * (0-(0)));
        }
        else if (tickAnim >= 80 && tickAnim < 81) {
            xx = 0 + (((tickAnim - 80) / 1) * (10.1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-15-(0)));
            yy = 0 + (((tickAnim - 80) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 80) / 1) * (0-(0)));
        }
        else if (tickAnim >= 81 && tickAnim < 86) {
            xx = 10.1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-15 + (((tickAnim - 81) / 5) * (-2.43887-(10.1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-15)));
            yy = 0 + (((tickAnim - 81) / 5) * (2.06348-(0)));
            zz = 0 + (((tickAnim - 81) / 5) * (50.3634-(0)));
        }
        else if (tickAnim >= 86 && tickAnim < 87) {
            xx = -2.43887 + (((tickAnim - 86) / 1) * (-3.09708-(-2.43887)));
            yy = 2.06348 + (((tickAnim - 86) / 1) * (-2.08159-(2.06348)));
            zz = 50.3634 + (((tickAnim - 86) / 1) * (51.50991-(50.3634)));
        }
        else if (tickAnim >= 87 && tickAnim < 88) {
            xx = -3.09708 + (((tickAnim - 87) / 1) * (-2.43887-(-3.09708)));
            yy = -2.08159 + (((tickAnim - 87) / 1) * (2.06348-(-2.08159)));
            zz = 51.50991 + (((tickAnim - 87) / 1) * (50.3634-(51.50991)));
        }
        else if (tickAnim >= 88 && tickAnim < 91) {
            xx = -2.43887 + (((tickAnim - 88) / 3) * (-2.43887-(-2.43887)));
            yy = 2.06348 + (((tickAnim - 88) / 3) * (2.06348-(2.06348)));
            zz = 50.3634 + (((tickAnim - 88) / 3) * (50.3634-(50.3634)));
        }
        else if (tickAnim >= 91 && tickAnim < 93) {
            xx = -2.43887 + (((tickAnim - 91) / 2) * (-11.75877-(-2.43887)));
            yy = 2.06348 + (((tickAnim - 91) / 2) * (1.80698-(2.06348)));
            zz = 50.3634 + (((tickAnim - 91) / 2) * (27.12346-(50.3634)));
        }
        else if (tickAnim >= 93 && tickAnim < 96) {
            xx = -11.75877 + (((tickAnim - 93) / 3) * (0-(-11.75877)));
            yy = 1.80698 + (((tickAnim - 93) / 3) * (0-(1.80698)));
            zz = 27.12346 + (((tickAnim - 93) / 3) * (0-(27.12346)));
        }
        else if (tickAnim >= 96 && tickAnim < 97) {
            xx = 0 + (((tickAnim - 96) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 96) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 96) / 1) * (0-(0)));
        }
        else if (tickAnim >= 97 && tickAnim < 98) {
            xx = 0 + (((tickAnim - 97) / 1) * (-10.9+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-15-(0)));
            yy = 0 + (((tickAnim - 97) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 97) / 1) * (0-(0)));
        }
        else if (tickAnim >= 98 && tickAnim < 100) {
            xx = -10.9+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-15 + (((tickAnim - 98) / 2) * (-9.42425-(-10.9+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-15)));
            yy = 0 + (((tickAnim - 98) / 2) * (1.03174-(0)));
            zz = 0 + (((tickAnim - 98) / 2) * (25.1817-(0)));
        }
        else if (tickAnim >= 100 && tickAnim < 103) {
            xx = -9.42425 + (((tickAnim - 100) / 3) * (-2.43887-(-9.42425)));
            yy = 1.03174 + (((tickAnim - 100) / 3) * (2.06348-(1.03174)));
            zz = 25.1817 + (((tickAnim - 100) / 3) * (50.3634-(25.1817)));
        }
        else if (tickAnim >= 103 && tickAnim < 103) {
            xx = -2.43887 + (((tickAnim - 103) / 0) * (-3.09708-(-2.43887)));
            yy = 2.06348 + (((tickAnim - 103) / 0) * (-2.08159-(2.06348)));
            zz = 50.3634 + (((tickAnim - 103) / 0) * (51.50991-(50.3634)));
        }
        else if (tickAnim >= 103 && tickAnim < 104) {
            xx = -3.09708 + (((tickAnim - 103) / 1) * (-2.43887-(-3.09708)));
            yy = -2.08159 + (((tickAnim - 103) / 1) * (2.06348-(-2.08159)));
            zz = 51.50991 + (((tickAnim - 103) / 1) * (50.3634-(51.50991)));
        }
        else if (tickAnim >= 104 && tickAnim < 105) {
            xx = -2.43887 + (((tickAnim - 104) / 1) * (-2.43887-(-2.43887)));
            yy = 2.06348 + (((tickAnim - 104) / 1) * (2.06348-(2.06348)));
            zz = 50.3634 + (((tickAnim - 104) / 1) * (50.3634-(50.3634)));
        }
        else if (tickAnim >= 105 && tickAnim < 110) {
            xx = -2.43887 + (((tickAnim - 105) / 5) * (0-(-2.43887)));
            yy = 2.06348 + (((tickAnim - 105) / 5) * (0-(2.06348)));
            zz = 50.3634 + (((tickAnim - 105) / 5) * (0-(50.3634)));
        }
        else if (tickAnim >= 110 && tickAnim < 111) {
            xx = 0 + (((tickAnim - 110) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 110) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 110) / 1) * (0-(0)));
        }
        else if (tickAnim >= 111 && tickAnim < 112) {
            xx = 0 + (((tickAnim - 111) / 1) * (-10.15+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-15-(0)));
            yy = 0 + (((tickAnim - 111) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 111) / 1) * (0-(0)));
        }
        else if (tickAnim >= 112 && tickAnim < 114) {
            xx = -10.15+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-15 + (((tickAnim - 112) / 2) * (-13.49261-(-10.15+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-15)));
            yy = 0 + (((tickAnim - 112) / 2) * (1.03174-(0)));
            zz = 0 + (((tickAnim - 112) / 2) * (25.1817-(0)));
        }
        else if (tickAnim >= 114 && tickAnim < 117) {
            xx = -13.49261 + (((tickAnim - 114) / 3) * (-2.43887-(-13.49261)));
            yy = 1.03174 + (((tickAnim - 114) / 3) * (2.06348-(1.03174)));
            zz = 25.1817 + (((tickAnim - 114) / 3) * (50.3634-(25.1817)));
        }
        else if (tickAnim >= 117 && tickAnim < 118) {
            xx = -2.43887 + (((tickAnim - 117) / 1) * (-3.09708-(-2.43887)));
            yy = 2.06348 + (((tickAnim - 117) / 1) * (-2.08159-(2.06348)));
            zz = 50.3634 + (((tickAnim - 117) / 1) * (51.50991-(50.3634)));
        }
        else if (tickAnim >= 118 && tickAnim < 118) {
            xx = -3.09708 + (((tickAnim - 118) / 0) * (-2.43887-(-3.09708)));
            yy = -2.08159 + (((tickAnim - 118) / 0) * (2.06348-(-2.08159)));
            zz = 51.50991 + (((tickAnim - 118) / 0) * (50.3634-(51.50991)));
        }
        else if (tickAnim >= 118 && tickAnim < 121) {
            xx = -2.43887 + (((tickAnim - 118) / 3) * (-3.98432-(-2.43887)));
            yy = 2.06348 + (((tickAnim - 118) / 3) * (1.89432-(2.06348)));
            zz = 50.3634 + (((tickAnim - 118) / 3) * (25.17487-(50.3634)));
        }
        else if (tickAnim >= 121 && tickAnim < 126) {
            xx = -3.98432 + (((tickAnim - 121) / 5) * (2.07137-(-3.98432)));
            yy = 1.89432 + (((tickAnim - 121) / 5) * (-1.22857-(1.89432)));
            zz = 25.17487 + (((tickAnim - 121) / 5) * (-5.62393-(25.17487)));
        }
        else if (tickAnim >= 126 && tickAnim < 130) {
            xx = 2.07137 + (((tickAnim - 126) / 4) * (0-(2.07137)));
            yy = -1.22857 + (((tickAnim - 126) / 4) * (0-(-1.22857)));
            zz = -5.62393 + (((tickAnim - 126) / 4) * (-3.75-(-5.62393)));
        }
        else if (tickAnim >= 130 && tickAnim < 153) {
            xx = 0 + (((tickAnim - 130) / 23) * (0-(0)));
            yy = 0 + (((tickAnim - 130) / 23) * (0-(0)));
            zz = -3.75 + (((tickAnim - 130) / 23) * (-3.75-(-3.75)));
        }
        else if (tickAnim >= 153 && tickAnim < 170) {
            xx = 0 + (((tickAnim - 153) / 17) * (0-(0)));
            yy = 0 + (((tickAnim - 153) / 17) * (0-(0)));
            zz = -3.75 + (((tickAnim - 153) / 17) * (-3.75-(-3.75)));
        }
        else if (tickAnim >= 170 && tickAnim < 188) {
            xx = 0 + (((tickAnim - 170) / 18) * (14.12164-(0)));
            yy = 0 + (((tickAnim - 170) / 18) * (1.55079-(0)));
            zz = -3.75 + (((tickAnim - 170) / 18) * (13.4344-(-3.75)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm1, leftArm1.rotateAngleX + (float) Math.toRadians(xx), leftArm1.rotateAngleY + (float) Math.toRadians(yy), leftArm1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 13.02297 + (((tickAnim - 0) / 20) * (13.02297-(13.02297)));
            yy = -2.01666 + (((tickAnim - 0) / 20) * (-2.01666-(-2.01666)));
            zz = -12.8453 + (((tickAnim - 0) / 20) * (-12.8453-(-12.8453)));
        }
        else if (tickAnim >= 20 && tickAnim < 47) {
            xx = 13.02297 + (((tickAnim - 20) / 27) * (13.02297-(13.02297)));
            yy = -2.01666 + (((tickAnim - 20) / 27) * (-2.01666-(-2.01666)));
            zz = -12.8453 + (((tickAnim - 20) / 27) * (-12.8453-(-12.8453)));
        }
        else if (tickAnim >= 47 && tickAnim < 50) {
            xx = 13.02297 + (((tickAnim - 47) / 3) * (29.33706-(13.02297)));
            yy = -2.01666 + (((tickAnim - 47) / 3) * (-0.52548-(-2.01666)));
            zz = -12.8453 + (((tickAnim - 47) / 3) * (-15.73381-(-12.8453)));
        }
        else if (tickAnim >= 50 && tickAnim < 53) {
            xx = 29.33706 + (((tickAnim - 50) / 3) * (29.33706-(29.33706)));
            yy = -0.52548 + (((tickAnim - 50) / 3) * (-0.52548-(-0.52548)));
            zz = -15.73381 + (((tickAnim - 50) / 3) * (-15.73381-(-15.73381)));
        }
        else if (tickAnim >= 53 && tickAnim < 60) {
            xx = 29.33706 + (((tickAnim - 53) / 7) * (41.7218-(29.33706)));
            yy = -0.52548 + (((tickAnim - 53) / 7) * (3.47414-(-0.52548)));
            zz = -15.73381 + (((tickAnim - 53) / 7) * (-20.20867-(-15.73381)));
        }
        else if (tickAnim >= 60 && tickAnim < 65) {
            xx = 41.7218 + (((tickAnim - 60) / 5) * (0-(41.7218)));
            yy = 3.47414 + (((tickAnim - 60) / 5) * (0-(3.47414)));
            zz = -20.20867 + (((tickAnim - 60) / 5) * (0-(-20.20867)));
        }
        else if (tickAnim >= 65 && tickAnim < 66) {
            xx = 0 + (((tickAnim - 65) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 65) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 65) / 1) * (0-(0)));
        }
        else if (tickAnim >= 66 && tickAnim < 67) {
            xx = 0 + (((tickAnim - 66) / 1) * (10.1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-15-(0)));
            yy = 0 + (((tickAnim - 66) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 66) / 1) * (0-(0)));
        }
        else if (tickAnim >= 67 && tickAnim < 71) {
            xx = 10.1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-15 + (((tickAnim - 67) / 4) * (41.7218-(10.1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-15)));
            yy = 0 + (((tickAnim - 67) / 4) * (3.47414-(0)));
            zz = 0 + (((tickAnim - 67) / 4) * (-20.20867-(0)));
        }
        else if (tickAnim >= 71 && tickAnim < 74) {
            xx = 41.7218 + (((tickAnim - 71) / 3) * (41.7218-(41.7218)));
            yy = 3.47414 + (((tickAnim - 71) / 3) * (3.47414-(3.47414)));
            zz = -20.20867 + (((tickAnim - 71) / 3) * (-20.20867-(-20.20867)));
        }
        else if (tickAnim >= 74 && tickAnim < 79) {
            xx = 41.7218 + (((tickAnim - 74) / 5) * (0-(41.7218)));
            yy = 3.47414 + (((tickAnim - 74) / 5) * (0-(3.47414)));
            zz = -20.20867 + (((tickAnim - 74) / 5) * (0-(-20.20867)));
        }
        else if (tickAnim >= 79 && tickAnim < 80) {
            xx = 0 + (((tickAnim - 79) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 79) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 79) / 1) * (0-(0)));
        }
        else if (tickAnim >= 80 && tickAnim < 81) {
            xx = 0 + (((tickAnim - 80) / 1) * (10.1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-15-(0)));
            yy = 0 + (((tickAnim - 80) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 80) / 1) * (0-(0)));
        }
        else if (tickAnim >= 81 && tickAnim < 85) {
            xx = 10.1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-15 + (((tickAnim - 81) / 4) * (41.7218-(10.1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-15)));
            yy = 0 + (((tickAnim - 81) / 4) * (3.47414-(0)));
            zz = 0 + (((tickAnim - 81) / 4) * (-20.20867-(0)));
        }
        else if (tickAnim >= 85 && tickAnim < 91) {
            xx = 41.7218 + (((tickAnim - 85) / 6) * (41.7218-(41.7218)));
            yy = 3.47414 + (((tickAnim - 85) / 6) * (3.47414-(3.47414)));
            zz = -20.20867 + (((tickAnim - 85) / 6) * (-20.20867-(-20.20867)));
        }
        else if (tickAnim >= 91 && tickAnim < 96) {
            xx = 41.7218 + (((tickAnim - 91) / 5) * (0-(41.7218)));
            yy = 3.47414 + (((tickAnim - 91) / 5) * (0-(3.47414)));
            zz = -20.20867 + (((tickAnim - 91) / 5) * (0-(-20.20867)));
        }
        else if (tickAnim >= 96 && tickAnim < 97) {
            xx = 0 + (((tickAnim - 96) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 96) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 96) / 1) * (0-(0)));
        }
        else if (tickAnim >= 97 && tickAnim < 98) {
            xx = 0 + (((tickAnim - 97) / 1) * (-10.65+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-15-(0)));
            yy = 0 + (((tickAnim - 97) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 97) / 1) * (0-(0)));
        }
        else if (tickAnim >= 98 && tickAnim < 102) {
            xx = -10.65+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-15 + (((tickAnim - 98) / 4) * (41.7218-(-10.65+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-15)));
            yy = 0 + (((tickAnim - 98) / 4) * (3.47414-(0)));
            zz = 0 + (((tickAnim - 98) / 4) * (-20.20867-(0)));
        }
        else if (tickAnim >= 102 && tickAnim < 105) {
            xx = 41.7218 + (((tickAnim - 102) / 3) * (41.7218-(41.7218)));
            yy = 3.47414 + (((tickAnim - 102) / 3) * (3.47414-(3.47414)));
            zz = -20.20867 + (((tickAnim - 102) / 3) * (-20.20867-(-20.20867)));
        }
        else if (tickAnim >= 105 && tickAnim < 110) {
            xx = 41.7218 + (((tickAnim - 105) / 5) * (0-(41.7218)));
            yy = 3.47414 + (((tickAnim - 105) / 5) * (0-(3.47414)));
            zz = -20.20867 + (((tickAnim - 105) / 5) * (0-(-20.20867)));
        }
        else if (tickAnim >= 110 && tickAnim < 111) {
            xx = 0 + (((tickAnim - 110) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 110) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 110) / 1) * (0-(0)));
        }
        else if (tickAnim >= 111 && tickAnim < 112) {
            xx = 0 + (((tickAnim - 111) / 1) * (-11+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-15-(0)));
            yy = 0 + (((tickAnim - 111) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 111) / 1) * (0-(0)));
        }
        else if (tickAnim >= 112 && tickAnim < 116) {
            xx = -11+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-15 + (((tickAnim - 112) / 4) * (41.7218-(-11+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-15)));
            yy = 0 + (((tickAnim - 112) / 4) * (3.47414-(0)));
            zz = 0 + (((tickAnim - 112) / 4) * (-20.20867-(0)));
        }
        else if (tickAnim >= 116 && tickAnim < 126) {
            xx = 41.7218 + (((tickAnim - 116) / 10) * (-5.7722-(41.7218)));
            yy = 3.47414 + (((tickAnim - 116) / 10) * (4.80665-(3.47414)));
            zz = -20.20867 + (((tickAnim - 116) / 10) * (-2.0068-(-20.20867)));
        }
        else if (tickAnim >= 126 && tickAnim < 130) {
            xx = -5.7722 + (((tickAnim - 126) / 4) * (-7.75769-(-5.7722)));
            yy = 4.80665 + (((tickAnim - 126) / 4) * (4.54833-(4.80665)));
            zz = -2.0068 + (((tickAnim - 126) / 4) * (-2.19599-(-2.0068)));
        }
        else if (tickAnim >= 130 && tickAnim < 153) {
            xx = -7.75769 + (((tickAnim - 130) / 23) * (-7.75769-(-7.75769)));
            yy = 4.54833 + (((tickAnim - 130) / 23) * (4.54833-(4.54833)));
            zz = -2.19599 + (((tickAnim - 130) / 23) * (-2.19599-(-2.19599)));
        }
        else if (tickAnim >= 153 && tickAnim < 170) {
            xx = -7.75769 + (((tickAnim - 153) / 17) * (-7.75769-(-7.75769)));
            yy = 4.54833 + (((tickAnim - 153) / 17) * (4.54833-(4.54833)));
            zz = -2.19599 + (((tickAnim - 153) / 17) * (-2.19599-(-2.19599)));
        }
        else if (tickAnim >= 170 && tickAnim < 188) {
            xx = -7.75769 + (((tickAnim - 170) / 18) * (13.02297-(-7.75769)));
            yy = 4.54833 + (((tickAnim - 170) / 18) * (-2.01666-(4.54833)));
            zz = -2.19599 + (((tickAnim - 170) / 18) * (-12.8453-(-2.19599)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftHand, leftHand.rotateAngleX + (float) Math.toRadians(xx), leftHand.rotateAngleY + (float) Math.toRadians(yy), leftHand.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 14.12164 + (((tickAnim - 0) / 20) * (14.12164-(14.12164)));
            yy = 1.55079 + (((tickAnim - 0) / 20) * (1.55079-(1.55079)));
            zz = -13.43443 + (((tickAnim - 0) / 20) * (-13.43443-(-13.43443)));
        }
        else if (tickAnim >= 20 && tickAnim < 47) {
            xx = 14.12164 + (((tickAnim - 20) / 27) * (14.12164-(14.12164)));
            yy = 1.55079 + (((tickAnim - 20) / 27) * (1.55079-(1.55079)));
            zz = -13.43443 + (((tickAnim - 20) / 27) * (-13.43443-(-13.43443)));
        }
        else if (tickAnim >= 47 && tickAnim < 50) {
            xx = 14.12164 + (((tickAnim - 47) / 3) * (-3.63926-(14.12164)));
            yy = 1.55079 + (((tickAnim - 47) / 3) * (-0.53812-(1.55079)));
            zz = -13.43443 + (((tickAnim - 47) / 3) * (-43.54436-(-13.43443)));
        }
        else if (tickAnim >= 50 && tickAnim < 53) {
            xx = -3.63926 + (((tickAnim - 50) / 3) * (1.06596-(-3.63926)));
            yy = -0.53812 + (((tickAnim - 50) / 3) * (-2.06901-(-0.53812)));
            zz = -43.54436 + (((tickAnim - 50) / 3) * (-27.25697-(-43.54436)));
        }
        else if (tickAnim >= 53 && tickAnim < 60) {
            xx = 1.06596 + (((tickAnim - 53) / 7) * (-3.63926-(1.06596)));
            yy = -2.06901 + (((tickAnim - 53) / 7) * (-0.53812-(-2.06901)));
            zz = -27.25697 + (((tickAnim - 53) / 7) * (-43.54436-(-27.25697)));
        }
        else if (tickAnim >= 60 && tickAnim < 65) {
            xx = -3.63926 + (((tickAnim - 60) / 5) * (0-(-3.63926)));
            yy = -0.53812 + (((tickAnim - 60) / 5) * (0-(-0.53812)));
            zz = -43.54436 + (((tickAnim - 60) / 5) * (0-(-43.54436)));
        }
        else if (tickAnim >= 65 && tickAnim < 66) {
            xx = 0 + (((tickAnim - 65) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 65) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 65) / 1) * (0-(0)));
        }
        else if (tickAnim >= 66 && tickAnim < 67) {
            xx = 0 + (((tickAnim - 66) / 1) * (10.1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-15-(0)));
            yy = 0 + (((tickAnim - 66) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 66) / 1) * (0-(0)));
        }
        else if (tickAnim >= 67 && tickAnim < 72) {
            xx = 10.1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-15 + (((tickAnim - 67) / 5) * (-3.63926-(10.1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-15)));
            yy = 0 + (((tickAnim - 67) / 5) * (-0.53812-(0)));
            zz = 0 + (((tickAnim - 67) / 5) * (-43.54436-(0)));
        }
        else if (tickAnim >= 72 && tickAnim < 73) {
            xx = -3.63926 + (((tickAnim - 72) / 1) * (-4.16143-(-3.63926)));
            yy = -0.53812 + (((tickAnim - 72) / 1) * (2.37409-(-0.53812)));
            zz = -43.54436 + (((tickAnim - 72) / 1) * (-44.43418-(-43.54436)));
        }
        else if (tickAnim >= 73 && tickAnim < 73) {
            xx = -4.16143 + (((tickAnim - 73) / 0) * (-3.63926-(-4.16143)));
            yy = 2.37409 + (((tickAnim - 73) / 0) * (-0.53812-(2.37409)));
            zz = -44.43418 + (((tickAnim - 73) / 0) * (-43.54436-(-44.43418)));
        }
        else if (tickAnim >= 73 && tickAnim < 74) {
            xx = -3.63926 + (((tickAnim - 73) / 1) * (-3.63926-(-3.63926)));
            yy = -0.53812 + (((tickAnim - 73) / 1) * (-0.53812-(-0.53812)));
            zz = -43.54436 + (((tickAnim - 73) / 1) * (-43.54436-(-43.54436)));
        }
        else if (tickAnim >= 74 && tickAnim < 79) {
            xx = -3.63926 + (((tickAnim - 74) / 5) * (0-(-3.63926)));
            yy = -0.53812 + (((tickAnim - 74) / 5) * (0-(-0.53812)));
            zz = -43.54436 + (((tickAnim - 74) / 5) * (0-(-43.54436)));
        }
        else if (tickAnim >= 79 && tickAnim < 80) {
            xx = 0 + (((tickAnim - 79) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 79) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 79) / 1) * (0-(0)));
        }
        else if (tickAnim >= 80 && tickAnim < 81) {
            xx = 0 + (((tickAnim - 80) / 1) * (10.1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-15-(0)));
            yy = 0 + (((tickAnim - 80) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 80) / 1) * (0-(0)));
        }
        else if (tickAnim >= 81 && tickAnim < 86) {
            xx = 10.1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-15 + (((tickAnim - 81) / 5) * (-3.63926-(10.1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-15)));
            yy = 0 + (((tickAnim - 81) / 5) * (-0.53812-(0)));
            zz = 0 + (((tickAnim - 81) / 5) * (-43.54436-(0)));
        }
        else if (tickAnim >= 86 && tickAnim < 87) {
            xx = -3.63926 + (((tickAnim - 86) / 1) * (-4.16143-(-3.63926)));
            yy = -0.53812 + (((tickAnim - 86) / 1) * (2.37409-(-0.53812)));
            zz = -43.54436 + (((tickAnim - 86) / 1) * (-44.43418-(-43.54436)));
        }
        else if (tickAnim >= 87 && tickAnim < 88) {
            xx = -4.16143 + (((tickAnim - 87) / 1) * (-3.63926-(-4.16143)));
            yy = 2.37409 + (((tickAnim - 87) / 1) * (-0.53812-(2.37409)));
            zz = -44.43418 + (((tickAnim - 87) / 1) * (-43.54436-(-44.43418)));
        }
        else if (tickAnim >= 88 && tickAnim < 91) {
            xx = -3.63926 + (((tickAnim - 88) / 3) * (-3.63926-(-3.63926)));
            yy = -0.53812 + (((tickAnim - 88) / 3) * (-0.53812-(-0.53812)));
            zz = -43.54436 + (((tickAnim - 88) / 3) * (-43.54436-(-43.54436)));
        }
        else if (tickAnim >= 91 && tickAnim < 93) {
            xx = -3.63926 + (((tickAnim - 91) / 2) * (-6.06963-(-3.63926)));
            yy = -0.53812 + (((tickAnim - 91) / 2) * (-0.26906-(-0.53812)));
            zz = -43.54436 + (((tickAnim - 91) / 2) * (-21.77218-(-43.54436)));
        }
        else if (tickAnim >= 93 && tickAnim < 96) {
            xx = -6.06963 + (((tickAnim - 93) / 3) * (0-(-6.06963)));
            yy = -0.26906 + (((tickAnim - 93) / 3) * (0-(-0.26906)));
            zz = -21.77218 + (((tickAnim - 93) / 3) * (0-(-21.77218)));
        }
        else if (tickAnim >= 96 && tickAnim < 97) {
            xx = 0 + (((tickAnim - 96) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 96) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 96) / 1) * (0-(0)));
        }
        else if (tickAnim >= 97 && tickAnim < 98) {
            xx = 0 + (((tickAnim - 97) / 1) * (-10.65+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-15-(0)));
            yy = 0 + (((tickAnim - 97) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 97) / 1) * (0-(0)));
        }
        else if (tickAnim >= 98 && tickAnim < 100) {
            xx = -10.65+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-15 + (((tickAnim - 98) / 2) * (-8.39944-(-10.65+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-15)));
            yy = 0 + (((tickAnim - 98) / 2) * (-0.26906-(0)));
            zz = 0 + (((tickAnim - 98) / 2) * (-21.77218-(0)));
        }
        else if (tickAnim >= 100 && tickAnim < 103) {
            xx = -8.39944 + (((tickAnim - 100) / 3) * (-3.63926-(-8.39944)));
            yy = -0.26906 + (((tickAnim - 100) / 3) * (-0.53812-(-0.26906)));
            zz = -21.77218 + (((tickAnim - 100) / 3) * (-43.54436-(-21.77218)));
        }
        else if (tickAnim >= 103 && tickAnim < 103) {
            xx = -3.63926 + (((tickAnim - 103) / 0) * (-4.16143-(-3.63926)));
            yy = -0.53812 + (((tickAnim - 103) / 0) * (2.37409-(-0.53812)));
            zz = -43.54436 + (((tickAnim - 103) / 0) * (-44.43418-(-43.54436)));
        }
        else if (tickAnim >= 103 && tickAnim < 104) {
            xx = -4.16143 + (((tickAnim - 103) / 1) * (-3.63926-(-4.16143)));
            yy = 2.37409 + (((tickAnim - 103) / 1) * (-0.53812-(2.37409)));
            zz = -44.43418 + (((tickAnim - 103) / 1) * (-43.54436-(-44.43418)));
        }
        else if (tickAnim >= 104 && tickAnim < 105) {
            xx = -3.63926 + (((tickAnim - 104) / 1) * (-3.63926-(-3.63926)));
            yy = -0.53812 + (((tickAnim - 104) / 1) * (-0.53812-(-0.53812)));
            zz = -43.54436 + (((tickAnim - 104) / 1) * (-43.54436-(-43.54436)));
        }
        else if (tickAnim >= 105 && tickAnim < 110) {
            xx = -3.63926 + (((tickAnim - 105) / 5) * (0-(-3.63926)));
            yy = -0.53812 + (((tickAnim - 105) / 5) * (0-(-0.53812)));
            zz = -43.54436 + (((tickAnim - 105) / 5) * (0-(-43.54436)));
        }
        else if (tickAnim >= 110 && tickAnim < 111) {
            xx = 0 + (((tickAnim - 110) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 110) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 110) / 1) * (0-(0)));
        }
        else if (tickAnim >= 111 && tickAnim < 112) {
            xx = 0 + (((tickAnim - 111) / 1) * (-11.4+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-15-(0)));
            yy = 0 + (((tickAnim - 111) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 111) / 1) * (0-(0)));
        }
        else if (tickAnim >= 112 && tickAnim < 114) {
            xx = -11.4+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-15 + (((tickAnim - 112) / 2) * (-12.96781-(-11.4+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-15)));
            yy = 0 + (((tickAnim - 112) / 2) * (-0.26906-(0)));
            zz = 0 + (((tickAnim - 112) / 2) * (-21.77218-(0)));
        }
        else if (tickAnim >= 114 && tickAnim < 117) {
            xx = -12.96781 + (((tickAnim - 114) / 3) * (-3.63926-(-12.96781)));
            yy = -0.26906 + (((tickAnim - 114) / 3) * (-0.53812-(-0.26906)));
            zz = -21.77218 + (((tickAnim - 114) / 3) * (-43.54436-(-21.77218)));
        }
        else if (tickAnim >= 117 && tickAnim < 118) {
            xx = -3.63926 + (((tickAnim - 117) / 1) * (-4.16143-(-3.63926)));
            yy = -0.53812 + (((tickAnim - 117) / 1) * (2.37409-(-0.53812)));
            zz = -43.54436 + (((tickAnim - 117) / 1) * (-44.43418-(-43.54436)));
        }
        else if (tickAnim >= 118 && tickAnim < 118) {
            xx = -4.16143 + (((tickAnim - 118) / 0) * (-3.63926-(-4.16143)));
            yy = 2.37409 + (((tickAnim - 118) / 0) * (-0.53812-(2.37409)));
            zz = -44.43418 + (((tickAnim - 118) / 0) * (-43.54436-(-44.43418)));
        }
        else if (tickAnim >= 118 && tickAnim < 121) {
            xx = -3.63926 + (((tickAnim - 118) / 3) * (8.42733-(-3.63926)));
            yy = -0.53812 + (((tickAnim - 118) / 3) * (0.491-(-0.53812)));
            zz = -43.54436 + (((tickAnim - 118) / 3) * (-10.88982-(-43.54436)));
        }
        else if (tickAnim >= 121 && tickAnim < 124) {
            xx = 8.42733 + (((tickAnim - 121) / 3) * (16.06821-(8.42733)));
            yy = 0.491 + (((tickAnim - 121) / 3) * (0.98785-(0.491)));
            zz = -10.88982 + (((tickAnim - 121) / 3) * (11.84873-(-10.88982)));
        }
        else if (tickAnim >= 124 && tickAnim < 127) {
            xx = 16.06821 + (((tickAnim - 124) / 3) * (10.9315-(16.06821)));
            yy = 0.98785 + (((tickAnim - 124) / 3) * (0.46755-(0.98785)));
            zz = 11.84873 + (((tickAnim - 124) / 3) * (14.61362-(11.84873)));
        }
        else if (tickAnim >= 127 && tickAnim < 130) {
            xx = 10.9315 + (((tickAnim - 127) / 3) * (0-(10.9315)));
            yy = 0.46755 + (((tickAnim - 127) / 3) * (0-(0.46755)));
            zz = 14.61362 + (((tickAnim - 127) / 3) * (3.25-(14.61362)));
        }
        else if (tickAnim >= 130 && tickAnim < 153) {
            xx = 0 + (((tickAnim - 130) / 23) * (0-(0)));
            yy = 0 + (((tickAnim - 130) / 23) * (0-(0)));
            zz = 3.25 + (((tickAnim - 130) / 23) * (3.25-(3.25)));
        }
        else if (tickAnim >= 153 && tickAnim < 170) {
            xx = 0 + (((tickAnim - 153) / 17) * (0-(0)));
            yy = 0 + (((tickAnim - 153) / 17) * (0-(0)));
            zz = 3.25 + (((tickAnim - 153) / 17) * (3.25-(3.25)));
        }
        else if (tickAnim >= 170 && tickAnim < 188) {
            xx = 0 + (((tickAnim - 170) / 18) * (14.12164-(0)));
            yy = 0 + (((tickAnim - 170) / 18) * (1.55079-(0)));
            zz = 3.25 + (((tickAnim - 170) / 18) * (-13.43443-(3.25)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm1, rightArm1.rotateAngleX + (float) Math.toRadians(xx), rightArm1.rotateAngleY + (float) Math.toRadians(yy), rightArm1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 13.02297 + (((tickAnim - 0) / 20) * (13.02297-(13.02297)));
            yy = -2.01666 + (((tickAnim - 0) / 20) * (-2.01666-(-2.01666)));
            zz = 12.84529 + (((tickAnim - 0) / 20) * (12.84529-(12.84529)));
        }
        else if (tickAnim >= 20 && tickAnim < 47) {
            xx = 13.02297 + (((tickAnim - 20) / 27) * (13.02297-(13.02297)));
            yy = -2.01666 + (((tickAnim - 20) / 27) * (-2.01666-(-2.01666)));
            zz = 12.84529 + (((tickAnim - 20) / 27) * (12.84529-(12.84529)));
        }
        else if (tickAnim >= 47 && tickAnim < 50) {
            xx = 13.02297 + (((tickAnim - 47) / 3) * (38.42852-(13.02297)));
            yy = -2.01666 + (((tickAnim - 47) / 3) * (-2.58301-(-2.01666)));
            zz = 12.84529 + (((tickAnim - 47) / 3) * (13.61178-(12.84529)));
        }
        else if (tickAnim >= 50 && tickAnim < 53) {
            xx = 38.42852 + (((tickAnim - 50) / 3) * (38.42852-(38.42852)));
            yy = -2.58301 + (((tickAnim - 50) / 3) * (-2.58301-(-2.58301)));
            zz = 13.61178 + (((tickAnim - 50) / 3) * (13.61178-(13.61178)));
        }
        else if (tickAnim >= 53 && tickAnim < 60) {
            xx = 38.42852 + (((tickAnim - 53) / 7) * (39.34513-(38.42852)));
            yy = -2.58301 + (((tickAnim - 53) / 7) * (-8.42313-(-2.58301)));
            zz = 13.61178 + (((tickAnim - 53) / 7) * (10.55643-(13.61178)));
        }
        else if (tickAnim >= 60 && tickAnim < 65) {
            xx = 39.34513 + (((tickAnim - 60) / 5) * (0-(39.34513)));
            yy = -8.42313 + (((tickAnim - 60) / 5) * (0-(-8.42313)));
            zz = 10.55643 + (((tickAnim - 60) / 5) * (0-(10.55643)));
        }
        else if (tickAnim >= 65 && tickAnim < 66) {
            xx = 0 + (((tickAnim - 65) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 65) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 65) / 1) * (0-(0)));
        }
        else if (tickAnim >= 66 && tickAnim < 67) {
            xx = 0 + (((tickAnim - 66) / 1) * (10.1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-15-(0)));
            yy = 0 + (((tickAnim - 66) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 66) / 1) * (0-(0)));
        }
        else if (tickAnim >= 67 && tickAnim < 71) {
            xx = 10.1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-15 + (((tickAnim - 67) / 4) * (39.34513-(10.1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-15)));
            yy = 0 + (((tickAnim - 67) / 4) * (-8.42313-(0)));
            zz = 0 + (((tickAnim - 67) / 4) * (10.55643-(0)));
        }
        else if (tickAnim >= 71 && tickAnim < 74) {
            xx = 39.34513 + (((tickAnim - 71) / 3) * (39.34513-(39.34513)));
            yy = -8.42313 + (((tickAnim - 71) / 3) * (-8.42313-(-8.42313)));
            zz = 10.55643 + (((tickAnim - 71) / 3) * (10.55643-(10.55643)));
        }
        else if (tickAnim >= 74 && tickAnim < 79) {
            xx = 39.34513 + (((tickAnim - 74) / 5) * (0-(39.34513)));
            yy = -8.42313 + (((tickAnim - 74) / 5) * (0-(-8.42313)));
            zz = 10.55643 + (((tickAnim - 74) / 5) * (0-(10.55643)));
        }
        else if (tickAnim >= 79 && tickAnim < 80) {
            xx = 0 + (((tickAnim - 79) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 79) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 79) / 1) * (0-(0)));
        }
        else if (tickAnim >= 80 && tickAnim < 81) {
            xx = 0 + (((tickAnim - 80) / 1) * (10.1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-15-(0)));
            yy = 0 + (((tickAnim - 80) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 80) / 1) * (0-(0)));
        }
        else if (tickAnim >= 81 && tickAnim < 85) {
            xx = 10.1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-15 + (((tickAnim - 81) / 4) * (39.34513-(10.1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-15)));
            yy = 0 + (((tickAnim - 81) / 4) * (-8.42313-(0)));
            zz = 0 + (((tickAnim - 81) / 4) * (10.55643-(0)));
        }
        else if (tickAnim >= 85 && tickAnim < 91) {
            xx = 39.34513 + (((tickAnim - 85) / 6) * (39.34513-(39.34513)));
            yy = -8.42313 + (((tickAnim - 85) / 6) * (-8.42313-(-8.42313)));
            zz = 10.55643 + (((tickAnim - 85) / 6) * (10.55643-(10.55643)));
        }
        else if (tickAnim >= 91 && tickAnim < 96) {
            xx = 39.34513 + (((tickAnim - 91) / 5) * (0-(39.34513)));
            yy = -8.42313 + (((tickAnim - 91) / 5) * (0-(-8.42313)));
            zz = 10.55643 + (((tickAnim - 91) / 5) * (0-(10.55643)));
        }
        else if (tickAnim >= 96 && tickAnim < 97) {
            xx = 0 + (((tickAnim - 96) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 96) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 96) / 1) * (0-(0)));
        }
        else if (tickAnim >= 97 && tickAnim < 98) {
            xx = 0 + (((tickAnim - 97) / 1) * (-10.65+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-15-(0)));
            yy = 0 + (((tickAnim - 97) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 97) / 1) * (0-(0)));
        }
        else if (tickAnim >= 98 && tickAnim < 102) {
            xx = -10.65+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-15 + (((tickAnim - 98) / 4) * (39.34513-(-10.65+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-15)));
            yy = 0 + (((tickAnim - 98) / 4) * (-8.42313-(0)));
            zz = 0 + (((tickAnim - 98) / 4) * (10.55643-(0)));
        }
        else if (tickAnim >= 102 && tickAnim < 105) {
            xx = 39.34513 + (((tickAnim - 102) / 3) * (39.34513-(39.34513)));
            yy = -8.42313 + (((tickAnim - 102) / 3) * (-8.42313-(-8.42313)));
            zz = 10.55643 + (((tickAnim - 102) / 3) * (10.55643-(10.55643)));
        }
        else if (tickAnim >= 105 && tickAnim < 110) {
            xx = 39.34513 + (((tickAnim - 105) / 5) * (0-(39.34513)));
            yy = -8.42313 + (((tickAnim - 105) / 5) * (0-(-8.42313)));
            zz = 10.55643 + (((tickAnim - 105) / 5) * (0-(10.55643)));
        }
        else if (tickAnim >= 110 && tickAnim < 111) {
            xx = 0 + (((tickAnim - 110) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 110) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 110) / 1) * (0-(0)));
        }
        else if (tickAnim >= 111 && tickAnim < 112) {
            xx = 0 + (((tickAnim - 111) / 1) * (-11.15+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-15-(0)));
            yy = 0 + (((tickAnim - 111) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 111) / 1) * (0-(0)));
        }
        else if (tickAnim >= 112 && tickAnim < 116) {
            xx = -11.15+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-15 + (((tickAnim - 112) / 4) * (39.34513-(-11.15+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-15)));
            yy = 0 + (((tickAnim - 112) / 4) * (-8.42313-(0)));
            zz = 0 + (((tickAnim - 112) / 4) * (10.55643-(0)));
        }
        else if (tickAnim >= 116 && tickAnim < 124) {
            xx = 39.34513 + (((tickAnim - 116) / 8) * (-11.88635-(39.34513)));
            yy = -8.42313 + (((tickAnim - 116) / 8) * (-8.83359-(-8.42313)));
            zz = 10.55643 + (((tickAnim - 116) / 8) * (7.15928-(10.55643)));
        }
        else if (tickAnim >= 124 && tickAnim < 130) {
            xx = -11.88635 + (((tickAnim - 124) / 6) * (-6.52339-(-11.88635)));
            yy = -8.83359 + (((tickAnim - 124) / 6) * (-9.1209-(-8.83359)));
            zz = 7.15928 + (((tickAnim - 124) / 6) * (4.78128-(7.15928)));
        }
        else if (tickAnim >= 130 && tickAnim < 153) {
            xx = -6.52339 + (((tickAnim - 130) / 23) * (-6.52339-(-6.52339)));
            yy = -9.1209 + (((tickAnim - 130) / 23) * (-9.1209-(-9.1209)));
            zz = 4.78128 + (((tickAnim - 130) / 23) * (4.78128-(4.78128)));
        }
        else if (tickAnim >= 153 && tickAnim < 170) {
            xx = -6.52339 + (((tickAnim - 153) / 17) * (-6.52339-(-6.52339)));
            yy = -9.1209 + (((tickAnim - 153) / 17) * (-9.1209-(-9.1209)));
            zz = 4.78128 + (((tickAnim - 153) / 17) * (4.78128-(4.78128)));
        }
        else if (tickAnim >= 170 && tickAnim < 188) {
            xx = -6.52339 + (((tickAnim - 170) / 18) * (13.02297-(-6.52339)));
            yy = -9.1209 + (((tickAnim - 170) / 18) * (-2.01666-(-9.1209)));
            zz = 4.78128 + (((tickAnim - 170) / 18) * (12.84529-(4.78128)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightHand, rightHand.rotateAngleX + (float) Math.toRadians(xx), rightHand.rotateAngleY + (float) Math.toRadians(yy), rightHand.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = -7.75 + (((tickAnim - 0) / 20) * (-8.5-(-7.75)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 24) {
            xx = -8.5 + (((tickAnim - 20) / 4) * (-8.69126-(-8.5)));
            yy = 0 + (((tickAnim - 20) / 4) * (-25.3828+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120+150))*-20-(0)));
            zz = 0 + (((tickAnim - 20) / 4) * (2.71502-(0)));
        }
        else if (tickAnim >= 24 && tickAnim < 25) {
            xx = -8.69126 + (((tickAnim - 24) / 1) * (-8.69126-(-8.69126)));
            yy = -25.3828+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120+150))*-20 + (((tickAnim - 24) / 1) * (-8.05775-(-25.3828+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120+150))*-20)));
            zz = 2.71502 + (((tickAnim - 24) / 1) * (2.71502-(2.71502)));
        }
        else if (tickAnim >= 25 && tickAnim < 47) {
            xx = -8.69126 + (((tickAnim - 25) / 22) * (-8.69126-(-8.69126)));
            yy = -8.05775 + (((tickAnim - 25) / 22) * (-8.05775-(-8.05775)));
            zz = 2.71502 + (((tickAnim - 25) / 22) * (2.71502-(2.71502)));
        }
        else if (tickAnim >= 47 && tickAnim < 50) {
            xx = -8.69126 + (((tickAnim - 47) / 3) * (-22.94126-(-8.69126)));
            yy = -8.05775 + (((tickAnim - 47) / 3) * (-8.05775-(-8.05775)));
            zz = 2.71502 + (((tickAnim - 47) / 3) * (2.71502-(2.71502)));
        }
        else if (tickAnim >= 50 && tickAnim < 53) {
            xx = -22.94126 + (((tickAnim - 50) / 3) * (-17.8172-(-22.94126)));
            yy = -8.05775 + (((tickAnim - 50) / 3) * (-8.05775-(-8.05775)));
            zz = 2.71502 + (((tickAnim - 50) / 3) * (2.71502-(2.71502)));
        }
        else if (tickAnim >= 53 && tickAnim < 60) {
            xx = -17.8172 + (((tickAnim - 53) / 7) * (-19.94126-(-17.8172)));
            yy = -8.05775 + (((tickAnim - 53) / 7) * (-8.05775-(-8.05775)));
            zz = 2.71502 + (((tickAnim - 53) / 7) * (2.71502-(2.71502)));
        }
        else if (tickAnim >= 60 && tickAnim < 65) {
            xx = -19.94126 + (((tickAnim - 60) / 5) * (21.85167-(-19.94126)));
            yy = -8.05775 + (((tickAnim - 60) / 5) * (-7.52988-(-8.05775)));
            zz = 2.71502 + (((tickAnim - 60) / 5) * (-1.287-(2.71502)));
        }
        else if (tickAnim >= 65 && tickAnim < 66) {
            xx = 21.85167 + (((tickAnim - 65) / 1) * (21.85167-(21.85167)));
            yy = -7.52988 + (((tickAnim - 65) / 1) * (-7.52988-(-7.52988)));
            zz = -1.287 + (((tickAnim - 65) / 1) * (-1.287-(-1.287)));
        }
        else if (tickAnim >= 66 && tickAnim < 67) {
            xx = 21.85167 + (((tickAnim - 66) / 1) * (15.325+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-15-(21.85167)));
            yy = -7.52988 + (((tickAnim - 66) / 1) * (-7.52988-(-7.52988)));
            zz = -1.287 + (((tickAnim - 66) / 1) * (-1.287-(-1.287)));
        }
        else if (tickAnim >= 67 && tickAnim < 72) {
            xx = 15.325+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-15 + (((tickAnim - 67) / 5) * (-19.94126-(15.325+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-15)));
            yy = -7.52988 + (((tickAnim - 67) / 5) * (-8.05775-(-7.52988)));
            zz = -1.287 + (((tickAnim - 67) / 5) * (2.71502-(-1.287)));
        }
        else if (tickAnim >= 72 && tickAnim < 74) {
            xx = -19.94126 + (((tickAnim - 72) / 2) * (-19.94126-(-19.94126)));
            yy = -8.05775 + (((tickAnim - 72) / 2) * (-8.05775-(-8.05775)));
            zz = 2.71502 + (((tickAnim - 72) / 2) * (2.71502-(2.71502)));
        }
        else if (tickAnim >= 74 && tickAnim < 79) {
            xx = -19.94126 + (((tickAnim - 74) / 5) * (21.85167-(-19.94126)));
            yy = -8.05775 + (((tickAnim - 74) / 5) * (-7.52988-(-8.05775)));
            zz = 2.71502 + (((tickAnim - 74) / 5) * (-1.287-(2.71502)));
        }
        else if (tickAnim >= 79 && tickAnim < 80) {
            xx = 21.85167 + (((tickAnim - 79) / 1) * (21.85167-(21.85167)));
            yy = -7.52988 + (((tickAnim - 79) / 1) * (-7.52988-(-7.52988)));
            zz = -1.287 + (((tickAnim - 79) / 1) * (-1.287-(-1.287)));
        }
        else if (tickAnim >= 80 && tickAnim < 81) {
            xx = 21.85167 + (((tickAnim - 80) / 1) * (19.4+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-15-(21.85167)));
            yy = -7.52988 + (((tickAnim - 80) / 1) * (-7.52988-(-7.52988)));
            zz = -1.287 + (((tickAnim - 80) / 1) * (-1.287-(-1.287)));
        }
        else if (tickAnim >= 81 && tickAnim < 86) {
            xx = 19.4+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-15 + (((tickAnim - 81) / 5) * (-19.94126-(19.4+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-15)));
            yy = -7.52988 + (((tickAnim - 81) / 5) * (-8.05775-(-7.52988)));
            zz = -1.287 + (((tickAnim - 81) / 5) * (2.71502-(-1.287)));
        }
        else if (tickAnim >= 86 && tickAnim < 91) {
            xx = -19.94126 + (((tickAnim - 86) / 5) * (-19.94126-(-19.94126)));
            yy = -8.05775 + (((tickAnim - 86) / 5) * (-8.05775-(-8.05775)));
            zz = 2.71502 + (((tickAnim - 86) / 5) * (2.71502-(2.71502)));
        }
        else if (tickAnim >= 91 && tickAnim < 96) {
            xx = -19.94126 + (((tickAnim - 91) / 5) * (21.85167-(-19.94126)));
            yy = -8.05775 + (((tickAnim - 91) / 5) * (-7.52988-(-8.05775)));
            zz = 2.71502 + (((tickAnim - 91) / 5) * (-1.287-(2.71502)));
        }
        else if (tickAnim >= 96 && tickAnim < 97) {
            xx = 21.85167 + (((tickAnim - 96) / 1) * (21.85167-(21.85167)));
            yy = -7.52988 + (((tickAnim - 96) / 1) * (-7.52988-(-7.52988)));
            zz = -1.287 + (((tickAnim - 96) / 1) * (-1.287-(-1.287)));
        }
        else if (tickAnim >= 97 && tickAnim < 98) {
            xx = 21.85167 + (((tickAnim - 97) / 1) * (10.325+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-15-(21.85167)));
            yy = -7.52988 + (((tickAnim - 97) / 1) * (-7.52988-(-7.52988)));
            zz = -1.287 + (((tickAnim - 97) / 1) * (-1.287-(-1.287)));
        }
        else if (tickAnim >= 98 && tickAnim < 103) {
            xx = 10.325+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-15 + (((tickAnim - 98) / 5) * (-19.94126-(10.325+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-15)));
            yy = -7.52988 + (((tickAnim - 98) / 5) * (-8.05775-(-7.52988)));
            zz = -1.287 + (((tickAnim - 98) / 5) * (2.71502-(-1.287)));
        }
        else if (tickAnim >= 103 && tickAnim < 105) {
            xx = -19.94126 + (((tickAnim - 103) / 2) * (-19.94126-(-19.94126)));
            yy = -8.05775 + (((tickAnim - 103) / 2) * (-8.05775-(-8.05775)));
            zz = 2.71502 + (((tickAnim - 103) / 2) * (2.71502-(2.71502)));
        }
        else if (tickAnim >= 105 && tickAnim < 110) {
            xx = -19.94126 + (((tickAnim - 105) / 5) * (21.85167-(-19.94126)));
            yy = -8.05775 + (((tickAnim - 105) / 5) * (-7.52988-(-8.05775)));
            zz = 2.71502 + (((tickAnim - 105) / 5) * (-1.287-(2.71502)));
        }
        else if (tickAnim >= 110 && tickAnim < 111) {
            xx = 21.85167 + (((tickAnim - 110) / 1) * (21.85167-(21.85167)));
            yy = -7.52988 + (((tickAnim - 110) / 1) * (-7.52988-(-7.52988)));
            zz = -1.287 + (((tickAnim - 110) / 1) * (-1.287-(-1.287)));
        }
        else if (tickAnim >= 111 && tickAnim < 112) {
            xx = 21.85167 + (((tickAnim - 111) / 1) * (10.15+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-15-(21.85167)));
            yy = -7.52988 + (((tickAnim - 111) / 1) * (-7.52988-(-7.52988)));
            zz = -1.287 + (((tickAnim - 111) / 1) * (-1.287-(-1.287)));
        }
        else if (tickAnim >= 112 && tickAnim < 117) {
            xx = 10.15+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-15 + (((tickAnim - 112) / 5) * (-12.5663+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*20-(10.15+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-15)));
            yy = -7.52988 + (((tickAnim - 112) / 5) * (-8.05775-(-7.52988)));
            zz = -1.287 + (((tickAnim - 112) / 5) * (2.71502-(-1.287)));
        }
        else if (tickAnim >= 117 && tickAnim < 130) {
            xx = -12.5663+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*20 + (((tickAnim - 117) / 13) * (16.00713-(-12.5663+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*20)));
            yy = -8.05775 + (((tickAnim - 117) / 13) * (-9.54099-(-8.05775)));
            zz = 2.71502 + (((tickAnim - 117) / 13) * (-0.43111-(2.71502)));
        }
        else if (tickAnim >= 130 && tickAnim < 146) {
            xx = 16.00713 + (((tickAnim - 130) / 16) * (16.00713-(16.00713)));
            yy = -9.54099 + (((tickAnim - 130) / 16) * (-9.54099-(-9.54099)));
            zz = -0.43111 + (((tickAnim - 130) / 16) * (-0.43111-(-0.43111)));
        }
        else if (tickAnim >= 146 && tickAnim < 153) {
            xx = 16.00713 + (((tickAnim - 146) / 7) * (0-(16.00713)));
            yy = -9.54099 + (((tickAnim - 146) / 7) * (11-(-9.54099)));
            zz = -0.43111 + (((tickAnim - 146) / 7) * (0-(-0.43111)));
        }
        else if (tickAnim >= 153 && tickAnim < 170) {
            xx = 0 + (((tickAnim - 153) / 17) * (0-(0)));
            yy = 11 + (((tickAnim - 153) / 17) * (11-(11)));
            zz = 0 + (((tickAnim - 153) / 17) * (0-(0)));
        }
        else if (tickAnim >= 170 && tickAnim < 188) {
            xx = 0 + (((tickAnim - 170) / 18) * (-7.75-(0)));
            yy = 11 + (((tickAnim - 170) / 18) * (0-(11)));
            zz = 0 + (((tickAnim - 170) / 18) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck1, neck1.rotateAngleX + (float) Math.toRadians(xx), neck1.rotateAngleY + (float) Math.toRadians(yy), neck1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 9 + (((tickAnim - 0) / 20) * (9.75-(9)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 24) {
            xx = 9.75 + (((tickAnim - 20) / 4) * (9.72519-(9.75)));
            yy = 0 + (((tickAnim - 20) / 4) * (-1.18583-(0)));
            zz = 0 + (((tickAnim - 20) / 4) * (-0.8703+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-5-(0)));
        }
        else if (tickAnim >= 24 && tickAnim < 25) {
            xx = 9.72519 + (((tickAnim - 24) / 1) * (9.72519-(9.72519)));
            yy = -1.18583 + (((tickAnim - 24) / 1) * (-1.18583-(-1.18583)));
            zz = -0.8703+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-5 + (((tickAnim - 24) / 1) * (-3.77033-(-0.8703+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-5)));
        }
        else if (tickAnim >= 25 && tickAnim < 47) {
            xx = 9.72519 + (((tickAnim - 25) / 22) * (9.72519-(9.72519)));
            yy = -1.18583 + (((tickAnim - 25) / 22) * (-1.18583-(-1.18583)));
            zz = -3.77033 + (((tickAnim - 25) / 22) * (-3.77033-(-3.77033)));
        }
        else if (tickAnim >= 47 && tickAnim < 50) {
            xx = 9.72519 + (((tickAnim - 47) / 3) * (20.72519-(9.72519)));
            yy = -1.18583 + (((tickAnim - 47) / 3) * (-1.18583-(-1.18583)));
            zz = -3.77033 + (((tickAnim - 47) / 3) * (-3.77033-(-3.77033)));
        }
        else if (tickAnim >= 50 && tickAnim < 53) {
            xx = 20.72519 + (((tickAnim - 50) / 3) * (10.68884-(20.72519)));
            yy = -1.18583 + (((tickAnim - 50) / 3) * (-1.18583-(-1.18583)));
            zz = -3.77033 + (((tickAnim - 50) / 3) * (-3.77033-(-3.77033)));
        }
        else if (tickAnim >= 53 && tickAnim < 60) {
            xx = 10.68884 + (((tickAnim - 53) / 7) * (10.22519-(10.68884)));
            yy = -1.18583 + (((tickAnim - 53) / 7) * (-1.18583-(-1.18583)));
            zz = -3.77033 + (((tickAnim - 53) / 7) * (-3.77033-(-3.77033)));
        }
        else if (tickAnim >= 60 && tickAnim < 65) {
            xx = 10.22519 + (((tickAnim - 60) / 5) * (-11.41923-(10.22519)));
            yy = -1.18583 + (((tickAnim - 60) / 5) * (-1.26284-(-1.18583)));
            zz = -3.77033 + (((tickAnim - 60) / 5) * (2.98077-(-3.77033)));
        }
        else if (tickAnim >= 65 && tickAnim < 66) {
            xx = -11.41923 + (((tickAnim - 65) / 1) * (-11.41923-(-11.41923)));
            yy = -1.26284 + (((tickAnim - 65) / 1) * (-1.26284-(-1.26284)));
            zz = 2.98077 + (((tickAnim - 65) / 1) * (2.98077-(2.98077)));
        }
        else if (tickAnim >= 66 && tickAnim < 67) {
            xx = -11.41923 + (((tickAnim - 66) / 1) * (10.1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-15-(-11.41923)));
            yy = -1.26284 + (((tickAnim - 66) / 1) * (-1.26284-(-1.26284)));
            zz = 2.98077 + (((tickAnim - 66) / 1) * (2.98077-(2.98077)));
        }
        else if (tickAnim >= 67 && tickAnim < 72) {
            xx = 10.1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-15 + (((tickAnim - 67) / 5) * (10.22519-(10.1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-15)));
            yy = -1.26284 + (((tickAnim - 67) / 5) * (-1.18583-(-1.26284)));
            zz = 2.98077 + (((tickAnim - 67) / 5) * (-3.77033-(2.98077)));
        }
        else if (tickAnim >= 72 && tickAnim < 74) {
            xx = 10.22519 + (((tickAnim - 72) / 2) * (10.22519-(10.22519)));
            yy = -1.18583 + (((tickAnim - 72) / 2) * (-1.18583-(-1.18583)));
            zz = -3.77033 + (((tickAnim - 72) / 2) * (-3.77033-(-3.77033)));
        }
        else if (tickAnim >= 74 && tickAnim < 79) {
            xx = 10.22519 + (((tickAnim - 74) / 5) * (-11.41923-(10.22519)));
            yy = -1.18583 + (((tickAnim - 74) / 5) * (-1.26284-(-1.18583)));
            zz = -3.77033 + (((tickAnim - 74) / 5) * (2.98077-(-3.77033)));
        }
        else if (tickAnim >= 79 && tickAnim < 80) {
            xx = -11.41923 + (((tickAnim - 79) / 1) * (-11.41923-(-11.41923)));
            yy = -1.26284 + (((tickAnim - 79) / 1) * (-1.26284-(-1.26284)));
            zz = 2.98077 + (((tickAnim - 79) / 1) * (2.98077-(2.98077)));
        }
        else if (tickAnim >= 80 && tickAnim < 81) {
            xx = -11.41923 + (((tickAnim - 80) / 1) * (10.1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-15-(-11.41923)));
            yy = -1.26284 + (((tickAnim - 80) / 1) * (-1.26284-(-1.26284)));
            zz = 2.98077 + (((tickAnim - 80) / 1) * (2.98077-(2.98077)));
        }
        else if (tickAnim >= 81 && tickAnim < 86) {
            xx = 10.1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-15 + (((tickAnim - 81) / 5) * (10.22519-(10.1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-15)));
            yy = -1.26284 + (((tickAnim - 81) / 5) * (-1.18583-(-1.26284)));
            zz = 2.98077 + (((tickAnim - 81) / 5) * (-3.77033-(2.98077)));
        }
        else if (tickAnim >= 86 && tickAnim < 91) {
            xx = 10.22519 + (((tickAnim - 86) / 5) * (10.22519-(10.22519)));
            yy = -1.18583 + (((tickAnim - 86) / 5) * (-1.18583-(-1.18583)));
            zz = -3.77033 + (((tickAnim - 86) / 5) * (-3.77033-(-3.77033)));
        }
        else if (tickAnim >= 91 && tickAnim < 96) {
            xx = 10.22519 + (((tickAnim - 91) / 5) * (-11.41923-(10.22519)));
            yy = -1.18583 + (((tickAnim - 91) / 5) * (-1.26284-(-1.18583)));
            zz = -3.77033 + (((tickAnim - 91) / 5) * (2.98077-(-3.77033)));
        }
        else if (tickAnim >= 96 && tickAnim < 97) {
            xx = -11.41923 + (((tickAnim - 96) / 1) * (-11.41923-(-11.41923)));
            yy = -1.26284 + (((tickAnim - 96) / 1) * (-1.26284-(-1.26284)));
            zz = 2.98077 + (((tickAnim - 96) / 1) * (2.98077-(2.98077)));
        }
        else if (tickAnim >= 97 && tickAnim < 98) {
            xx = -11.41923 + (((tickAnim - 97) / 1) * (-21.65+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-15-(-11.41923)));
            yy = -1.26284 + (((tickAnim - 97) / 1) * (-1.26284-(-1.26284)));
            zz = 2.98077 + (((tickAnim - 97) / 1) * (2.98077-(2.98077)));
        }
        else if (tickAnim >= 98 && tickAnim < 103) {
            xx = -21.65+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-15 + (((tickAnim - 98) / 5) * (10.22519-(-21.65+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-15)));
            yy = -1.26284 + (((tickAnim - 98) / 5) * (-1.18583-(-1.26284)));
            zz = 2.98077 + (((tickAnim - 98) / 5) * (-3.77033-(2.98077)));
        }
        else if (tickAnim >= 103 && tickAnim < 105) {
            xx = 10.22519 + (((tickAnim - 103) / 2) * (10.22519-(10.22519)));
            yy = -1.18583 + (((tickAnim - 103) / 2) * (-1.18583-(-1.18583)));
            zz = -3.77033 + (((tickAnim - 103) / 2) * (-3.77033-(-3.77033)));
        }
        else if (tickAnim >= 105 && tickAnim < 110) {
            xx = 10.22519 + (((tickAnim - 105) / 5) * (-11.41923-(10.22519)));
            yy = -1.18583 + (((tickAnim - 105) / 5) * (-1.26284-(-1.18583)));
            zz = -3.77033 + (((tickAnim - 105) / 5) * (2.98077-(-3.77033)));
        }
        else if (tickAnim >= 110 && tickAnim < 111) {
            xx = -11.41923 + (((tickAnim - 110) / 1) * (-11.41923-(-11.41923)));
            yy = -1.26284 + (((tickAnim - 110) / 1) * (-1.26284-(-1.26284)));
            zz = 2.98077 + (((tickAnim - 110) / 1) * (2.98077-(2.98077)));
        }
        else if (tickAnim >= 111 && tickAnim < 112) {
            xx = -11.41923 + (((tickAnim - 111) / 1) * (-22.9+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-15-(-11.41923)));
            yy = -1.26284 + (((tickAnim - 111) / 1) * (-1.26284-(-1.26284)));
            zz = 2.98077 + (((tickAnim - 111) / 1) * (2.98077-(2.98077)));
        }
        else if (tickAnim >= 112 && tickAnim < 117) {
            xx = -22.9+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-15 + (((tickAnim - 112) / 5) * (10.22519-(-22.9+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-15)));
            yy = -1.26284 + (((tickAnim - 112) / 5) * (-1.18583-(-1.26284)));
            zz = 2.98077 + (((tickAnim - 112) / 5) * (-3.77033-(2.98077)));
        }
        else if (tickAnim >= 117 && tickAnim < 130) {
            xx = 10.22519 + (((tickAnim - 117) / 13) * (-12.12583-(10.22519)));
            yy = -1.18583 + (((tickAnim - 117) / 13) * (-1.01848-(-1.18583)));
            zz = -3.77033 + (((tickAnim - 117) / 13) * (1.47797-(-3.77033)));
        }
        else if (tickAnim >= 130 && tickAnim < 153) {
            xx = -12.12583 + (((tickAnim - 130) / 23) * (-12.12583-(-12.12583)));
            yy = -1.01848 + (((tickAnim - 130) / 23) * (-1.01848-(-1.01848)));
            zz = 1.47797 + (((tickAnim - 130) / 23) * (1.47797-(1.47797)));
        }
        else if (tickAnim >= 153 && tickAnim < 170) {
            xx = -12.12583 + (((tickAnim - 153) / 17) * (-12.12583-(-12.12583)));
            yy = -1.01848 + (((tickAnim - 153) / 17) * (-1.01848-(-1.01848)));
            zz = 1.47797 + (((tickAnim - 153) / 17) * (1.47797-(1.47797)));
        }
        else if (tickAnim >= 170 && tickAnim < 188) {
            xx = -12.12583 + (((tickAnim - 170) / 18) * (9-(-12.12583)));
            yy = -1.01848 + (((tickAnim - 170) / 18) * (0-(-1.01848)));
            zz = 1.47797 + (((tickAnim - 170) / 18) * (0-(1.47797)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0.225 + (((tickAnim - 0) / 20) * (0.225-(0.225)));
        }
        else if (tickAnim >= 20 && tickAnim < 188) {
            xx = 0 + (((tickAnim - 20) / 168) * (0-(0)));
            yy = 0 + (((tickAnim - 20) / 168) * (0-(0)));
            zz = 0.225 + (((tickAnim - 20) / 168) * (0.225-(0.225)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.head.rotationPointX = this.head.rotationPointX + (float)(xx);
        this.head.rotationPointY = this.head.rotationPointY - (float)(yy);
        this.head.rotationPointZ = this.head.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 47) {
            xx = 0 + (((tickAnim - 0) / 47) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 47) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 47) * (0-(0)));
        }
        else if (tickAnim >= 47 && tickAnim < 188) {
            xx = 0 + (((tickAnim - 47) / 141) * (0-(0)));
            yy = 0 + (((tickAnim - 47) / 141) * (0-(0)));
            zz = 0 + (((tickAnim - 47) / 141) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg2, leftLeg2.rotateAngleX + (float) Math.toRadians(xx), leftLeg2.rotateAngleY + (float) Math.toRadians(yy), leftLeg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 47) {
            xx = 0 + (((tickAnim - 0) / 47) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 47) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 47) * (0-(0)));
        }
        else if (tickAnim >= 47 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 47) / 13) * (0-(0)));
            yy = 0 + (((tickAnim - 47) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 47) / 13) * (-1-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 72) {
            xx = 0 + (((tickAnim - 60) / 12) * (0-(0)));
            yy = 0 + (((tickAnim - 60) / 12) * (0-(0)));
            zz = -1 + (((tickAnim - 60) / 12) * (-1-(-1)));
        }
        else if (tickAnim >= 72 && tickAnim < 74) {
            xx = 0 + (((tickAnim - 72) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 72) / 2) * (0-(0)));
            zz = -1 + (((tickAnim - 72) / 2) * (-1-(-1)));
        }
        else if (tickAnim >= 74 && tickAnim < 86) {
            xx = 0 + (((tickAnim - 74) / 12) * (0-(0)));
            yy = 0 + (((tickAnim - 74) / 12) * (0-(0)));
            zz = -1 + (((tickAnim - 74) / 12) * (-1-(-1)));
        }
        else if (tickAnim >= 86 && tickAnim < 91) {
            xx = 0 + (((tickAnim - 86) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 86) / 5) * (0-(0)));
            zz = -1 + (((tickAnim - 86) / 5) * (-1-(-1)));
        }
        else if (tickAnim >= 91 && tickAnim < 103) {
            xx = 0 + (((tickAnim - 91) / 12) * (0-(0)));
            yy = 0 + (((tickAnim - 91) / 12) * (0-(0)));
            zz = -1 + (((tickAnim - 91) / 12) * (-1-(-1)));
        }
        else if (tickAnim >= 103 && tickAnim < 105) {
            xx = 0 + (((tickAnim - 103) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 103) / 2) * (0-(0)));
            zz = -1 + (((tickAnim - 103) / 2) * (-1-(-1)));
        }
        else if (tickAnim >= 105 && tickAnim < 117) {
            xx = 0 + (((tickAnim - 105) / 12) * (0-(0)));
            yy = 0 + (((tickAnim - 105) / 12) * (0-(0)));
            zz = -1 + (((tickAnim - 105) / 12) * (-1-(-1)));
        }
        else if (tickAnim >= 117 && tickAnim < 188) {
            xx = 0 + (((tickAnim - 117) / 71) * (0-(0)));
            yy = 0 + (((tickAnim - 117) / 71) * (0-(0)));
            zz = -1 + (((tickAnim - 117) / 71) * (0-(-1)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftFoot, leftFoot.rotateAngleX + (float) Math.toRadians(xx), leftFoot.rotateAngleY + (float) Math.toRadians(yy), leftFoot.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 47) {
            xx = 0 + (((tickAnim - 0) / 47) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 47) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 47) * (0-(0)));
        }
        else if (tickAnim >= 47 && tickAnim < 188) {
            xx = 0 + (((tickAnim - 47) / 141) * (0-(0)));
            yy = 0 + (((tickAnim - 47) / 141) * (0-(0)));
            zz = 0 + (((tickAnim - 47) / 141) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(lefLeg2, lefLeg2.rotateAngleX + (float) Math.toRadians(xx), lefLeg2.rotateAngleY + (float) Math.toRadians(yy), lefLeg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 47) {
            xx = 0 + (((tickAnim - 0) / 47) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 47) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 47) * (0-(0)));
        }
        else if (tickAnim >= 47 && tickAnim < 188) {
            xx = 0 + (((tickAnim - 47) / 141) * (0-(0)));
            yy = 0 + (((tickAnim - 47) / 141) * (0-(0)));
            zz = 0 + (((tickAnim - 47) / 141) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg2, rightLeg2.rotateAngleX + (float) Math.toRadians(xx), rightLeg2.rotateAngleY + (float) Math.toRadians(yy), rightLeg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 47) {
            xx = 0 + (((tickAnim - 0) / 47) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 47) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 47) * (0-(0)));
        }
        else if (tickAnim >= 47 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 47) / 13) * (0-(0)));
            yy = 0 + (((tickAnim - 47) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 47) / 13) * (0.75-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 72) {
            xx = 0 + (((tickAnim - 60) / 12) * (0-(0)));
            yy = 0 + (((tickAnim - 60) / 12) * (0-(0)));
            zz = 0.75 + (((tickAnim - 60) / 12) * (0.75-(0.75)));
        }
        else if (tickAnim >= 72 && tickAnim < 74) {
            xx = 0 + (((tickAnim - 72) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 72) / 2) * (0-(0)));
            zz = 0.75 + (((tickAnim - 72) / 2) * (0.75-(0.75)));
        }
        else if (tickAnim >= 74 && tickAnim < 86) {
            xx = 0 + (((tickAnim - 74) / 12) * (0-(0)));
            yy = 0 + (((tickAnim - 74) / 12) * (0-(0)));
            zz = 0.75 + (((tickAnim - 74) / 12) * (0.75-(0.75)));
        }
        else if (tickAnim >= 86 && tickAnim < 91) {
            xx = 0 + (((tickAnim - 86) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 86) / 5) * (0-(0)));
            zz = 0.75 + (((tickAnim - 86) / 5) * (0.75-(0.75)));
        }
        else if (tickAnim >= 91 && tickAnim < 103) {
            xx = 0 + (((tickAnim - 91) / 12) * (0-(0)));
            yy = 0 + (((tickAnim - 91) / 12) * (0-(0)));
            zz = 0.75 + (((tickAnim - 91) / 12) * (0.75-(0.75)));
        }
        else if (tickAnim >= 103 && tickAnim < 105) {
            xx = 0 + (((tickAnim - 103) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 103) / 2) * (0-(0)));
            zz = 0.75 + (((tickAnim - 103) / 2) * (0.75-(0.75)));
        }
        else if (tickAnim >= 105 && tickAnim < 117) {
            xx = 0 + (((tickAnim - 105) / 12) * (0-(0)));
            yy = 0 + (((tickAnim - 105) / 12) * (0-(0)));
            zz = 0.75 + (((tickAnim - 105) / 12) * (0.75-(0.75)));
        }
        else if (tickAnim >= 117 && tickAnim < 188) {
            xx = 0 + (((tickAnim - 117) / 71) * (0-(0)));
            yy = 0 + (((tickAnim - 117) / 71) * (0-(0)));
            zz = 0.75 + (((tickAnim - 117) / 71) * (0-(0.75)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightFoot, rightFoot.rotateAngleX + (float) Math.toRadians(xx), rightFoot.rotateAngleY + (float) Math.toRadians(yy), rightFoot.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 47) {
            xx = 0 + (((tickAnim - 0) / 47) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 47) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 47) * (0-(0)));
        }
        else if (tickAnim >= 47 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 47) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 47) / 3) * (-4.25-(0)));
            zz = 0 + (((tickAnim - 47) / 3) * (0-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 53) {
            xx = 0 + (((tickAnim - 50) / 3) * (0-(0)));
            yy = -4.25 + (((tickAnim - 50) / 3) * (-2.25-(-4.25)));
            zz = 0 + (((tickAnim - 50) / 3) * (0-(0)));
        }
        else if (tickAnim >= 53 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 53) / 7) * (0-(0)));
            yy = -2.25 + (((tickAnim - 53) / 7) * (-11.75-(-2.25)));
            zz = 0 + (((tickAnim - 53) / 7) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 65) {
            xx = 0 + (((tickAnim - 60) / 5) * (0-(0)));
            yy = -11.75 + (((tickAnim - 60) / 5) * (0-(-11.75)));
            zz = 0 + (((tickAnim - 60) / 5) * (0-(0)));
        }
        else if (tickAnim >= 65 && tickAnim < 66) {
            xx = 0 + (((tickAnim - 65) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 65) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 65) / 1) * (0-(0)));
        }
        else if (tickAnim >= 66 && tickAnim < 67) {
            xx = 0 + (((tickAnim - 66) / 1) * (10.1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-15-(0)));
            yy = 0 + (((tickAnim - 66) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 66) / 1) * (0-(0)));
        }
        else if (tickAnim >= 67 && tickAnim < 72) {
            xx = 10.1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-15 + (((tickAnim - 67) / 5) * (0-(10.1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-15)));
            yy = 0 + (((tickAnim - 67) / 5) * (-11.75-(0)));
            zz = 0 + (((tickAnim - 67) / 5) * (0-(0)));
        }
        else if (tickAnim >= 72 && tickAnim < 74) {
            xx = 0 + (((tickAnim - 72) / 2) * (0-(0)));
            yy = -11.75 + (((tickAnim - 72) / 2) * (-11.75-(-11.75)));
            zz = 0 + (((tickAnim - 72) / 2) * (0-(0)));
        }
        else if (tickAnim >= 74 && tickAnim < 79) {
            xx = 0 + (((tickAnim - 74) / 5) * (0-(0)));
            yy = -11.75 + (((tickAnim - 74) / 5) * (0-(-11.75)));
            zz = 0 + (((tickAnim - 74) / 5) * (0-(0)));
        }
        else if (tickAnim >= 79 && tickAnim < 80) {
            xx = 0 + (((tickAnim - 79) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 79) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 79) / 1) * (0-(0)));
        }
        else if (tickAnim >= 80 && tickAnim < 81) {
            xx = 0 + (((tickAnim - 80) / 1) * (10.1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-15-(0)));
            yy = 0 + (((tickAnim - 80) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 80) / 1) * (0-(0)));
        }
        else if (tickAnim >= 81 && tickAnim < 86) {
            xx = 10.1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-15 + (((tickAnim - 81) / 5) * (0-(10.1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-15)));
            yy = 0 + (((tickAnim - 81) / 5) * (-11.75-(0)));
            zz = 0 + (((tickAnim - 81) / 5) * (0-(0)));
        }
        else if (tickAnim >= 86 && tickAnim < 91) {
            xx = 0 + (((tickAnim - 86) / 5) * (0-(0)));
            yy = -11.75 + (((tickAnim - 86) / 5) * (-11.75-(-11.75)));
            zz = 0 + (((tickAnim - 86) / 5) * (0-(0)));
        }
        else if (tickAnim >= 91 && tickAnim < 96) {
            xx = 0 + (((tickAnim - 91) / 5) * (0-(0)));
            yy = -11.75 + (((tickAnim - 91) / 5) * (0-(-11.75)));
            zz = 0 + (((tickAnim - 91) / 5) * (0-(0)));
        }
        else if (tickAnim >= 96 && tickAnim < 97) {
            xx = 0 + (((tickAnim - 96) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 96) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 96) / 1) * (0-(0)));
        }
        else if (tickAnim >= 97 && tickAnim < 98) {
            xx = 0 + (((tickAnim - 97) / 1) * (-10.4+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-15-(0)));
            yy = 0 + (((tickAnim - 97) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 97) / 1) * (0-(0)));
        }
        else if (tickAnim >= 98 && tickAnim < 103) {
            xx = -10.4+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-15 + (((tickAnim - 98) / 5) * (0-(-10.4+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-15)));
            yy = 0 + (((tickAnim - 98) / 5) * (-11.75-(0)));
            zz = 0 + (((tickAnim - 98) / 5) * (0-(0)));
        }
        else if (tickAnim >= 103 && tickAnim < 105) {
            xx = 0 + (((tickAnim - 103) / 2) * (0-(0)));
            yy = -11.75 + (((tickAnim - 103) / 2) * (-11.75-(-11.75)));
            zz = 0 + (((tickAnim - 103) / 2) * (0-(0)));
        }
        else if (tickAnim >= 105 && tickAnim < 110) {
            xx = 0 + (((tickAnim - 105) / 5) * (0-(0)));
            yy = -11.75 + (((tickAnim - 105) / 5) * (0-(-11.75)));
            zz = 0 + (((tickAnim - 105) / 5) * (0-(0)));
        }
        else if (tickAnim >= 110 && tickAnim < 111) {
            xx = 0 + (((tickAnim - 110) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 110) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 110) / 1) * (0-(0)));
        }
        else if (tickAnim >= 111 && tickAnim < 112) {
            xx = 0 + (((tickAnim - 111) / 1) * (-12.9+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-15-(0)));
            yy = 0 + (((tickAnim - 111) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 111) / 1) * (0-(0)));
        }
        else if (tickAnim >= 112 && tickAnim < 117) {
            xx = -12.9+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-15 + (((tickAnim - 112) / 5) * (0-(-12.9+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-15)));
            yy = 0 + (((tickAnim - 112) / 5) * (-11.75-(0)));
            zz = 0 + (((tickAnim - 112) / 5) * (0-(0)));
        }
        else if (tickAnim >= 117 && tickAnim < 130) {
            xx = 0 + (((tickAnim - 117) / 13) * (0-(0)));
            yy = -11.75 + (((tickAnim - 117) / 13) * (0-(-11.75)));
            zz = 0 + (((tickAnim - 117) / 13) * (0-(0)));
        }
        else if (tickAnim >= 130 && tickAnim < 153) {
            xx = 0 + (((tickAnim - 130) / 23) * (0-(0)));
            yy = 0 + (((tickAnim - 130) / 23) * (0-(0)));
            zz = 0 + (((tickAnim - 130) / 23) * (0-(0)));
        }
        else if (tickAnim >= 153 && tickAnim < 170) {
            xx = 0 + (((tickAnim - 153) / 17) * (0-(0)));
            yy = 0 + (((tickAnim - 153) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 153) / 17) * (0-(0)));
        }
        else if (tickAnim >= 170 && tickAnim < 188) {
            xx = 0 + (((tickAnim - 170) / 18) * (0-(0)));
            yy = 0 + (((tickAnim - 170) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 170) / 18) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm2, leftArm2.rotateAngleX + (float) Math.toRadians(xx), leftArm2.rotateAngleY + (float) Math.toRadians(yy), leftArm2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 47) {
            xx = 0 + (((tickAnim - 0) / 47) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 47) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 47) * (0-(0)));
        }
        else if (tickAnim >= 47 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 47) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 47) / 3) * (4.75-(0)));
            zz = 0 + (((tickAnim - 47) / 3) * (0-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 53) {
            xx = 0 + (((tickAnim - 50) / 3) * (0-(0)));
            yy = 4.75 + (((tickAnim - 50) / 3) * (1.5-(4.75)));
            zz = 0 + (((tickAnim - 50) / 3) * (0-(0)));
        }
        else if (tickAnim >= 53 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 53) / 7) * (0-(0)));
            yy = 1.5 + (((tickAnim - 53) / 7) * (14.75-(1.5)));
            zz = 0 + (((tickAnim - 53) / 7) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 65) {
            xx = 0 + (((tickAnim - 60) / 5) * (0-(0)));
            yy = 14.75 + (((tickAnim - 60) / 5) * (0-(14.75)));
            zz = 0 + (((tickAnim - 60) / 5) * (0-(0)));
        }
        else if (tickAnim >= 65 && tickAnim < 66) {
            xx = 0 + (((tickAnim - 65) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 65) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 65) / 1) * (0-(0)));
        }
        else if (tickAnim >= 66 && tickAnim < 67) {
            xx = 0 + (((tickAnim - 66) / 1) * (10.1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-15-(0)));
            yy = 0 + (((tickAnim - 66) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 66) / 1) * (0-(0)));
        }
        else if (tickAnim >= 67 && tickAnim < 72) {
            xx = 10.1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-15 + (((tickAnim - 67) / 5) * (0-(10.1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-15)));
            yy = 0 + (((tickAnim - 67) / 5) * (14.75-(0)));
            zz = 0 + (((tickAnim - 67) / 5) * (0-(0)));
        }
        else if (tickAnim >= 72 && tickAnim < 74) {
            xx = 0 + (((tickAnim - 72) / 2) * (0-(0)));
            yy = 14.75 + (((tickAnim - 72) / 2) * (14.75-(14.75)));
            zz = 0 + (((tickAnim - 72) / 2) * (0-(0)));
        }
        else if (tickAnim >= 74 && tickAnim < 79) {
            xx = 0 + (((tickAnim - 74) / 5) * (0-(0)));
            yy = 14.75 + (((tickAnim - 74) / 5) * (0-(14.75)));
            zz = 0 + (((tickAnim - 74) / 5) * (0-(0)));
        }
        else if (tickAnim >= 79 && tickAnim < 80) {
            xx = 0 + (((tickAnim - 79) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 79) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 79) / 1) * (0-(0)));
        }
        else if (tickAnim >= 80 && tickAnim < 81) {
            xx = 0 + (((tickAnim - 80) / 1) * (10.1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-15-(0)));
            yy = 0 + (((tickAnim - 80) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 80) / 1) * (0-(0)));
        }
        else if (tickAnim >= 81 && tickAnim < 86) {
            xx = 10.1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-15 + (((tickAnim - 81) / 5) * (0-(10.1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-15)));
            yy = 0 + (((tickAnim - 81) / 5) * (14.75-(0)));
            zz = 0 + (((tickAnim - 81) / 5) * (0-(0)));
        }
        else if (tickAnim >= 86 && tickAnim < 91) {
            xx = 0 + (((tickAnim - 86) / 5) * (0-(0)));
            yy = 14.75 + (((tickAnim - 86) / 5) * (14.75-(14.75)));
            zz = 0 + (((tickAnim - 86) / 5) * (0-(0)));
        }
        else if (tickAnim >= 91 && tickAnim < 96) {
            xx = 0 + (((tickAnim - 91) / 5) * (0-(0)));
            yy = 14.75 + (((tickAnim - 91) / 5) * (0-(14.75)));
            zz = 0 + (((tickAnim - 91) / 5) * (0-(0)));
        }
        else if (tickAnim >= 96 && tickAnim < 97) {
            xx = 0 + (((tickAnim - 96) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 96) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 96) / 1) * (0-(0)));
        }
        else if (tickAnim >= 97 && tickAnim < 98) {
            xx = 0 + (((tickAnim - 97) / 1) * (-10.65+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-15-(0)));
            yy = 0 + (((tickAnim - 97) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 97) / 1) * (0-(0)));
        }
        else if (tickAnim >= 98 && tickAnim < 103) {
            xx = -10.65+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-15 + (((tickAnim - 98) / 5) * (0-(-10.65+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-15)));
            yy = 0 + (((tickAnim - 98) / 5) * (14.75-(0)));
            zz = 0 + (((tickAnim - 98) / 5) * (0-(0)));
        }
        else if (tickAnim >= 103 && tickAnim < 105) {
            xx = 0 + (((tickAnim - 103) / 2) * (0-(0)));
            yy = 14.75 + (((tickAnim - 103) / 2) * (14.75-(14.75)));
            zz = 0 + (((tickAnim - 103) / 2) * (0-(0)));
        }
        else if (tickAnim >= 105 && tickAnim < 110) {
            xx = 0 + (((tickAnim - 105) / 5) * (0-(0)));
            yy = 14.75 + (((tickAnim - 105) / 5) * (0-(14.75)));
            zz = 0 + (((tickAnim - 105) / 5) * (0-(0)));
        }
        else if (tickAnim >= 110 && tickAnim < 111) {
            xx = 0 + (((tickAnim - 110) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 110) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 110) / 1) * (0-(0)));
        }
        else if (tickAnim >= 111 && tickAnim < 112) {
            xx = 0 + (((tickAnim - 111) / 1) * (-11.15+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-15-(0)));
            yy = 0 + (((tickAnim - 111) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 111) / 1) * (0-(0)));
        }
        else if (tickAnim >= 112 && tickAnim < 117) {
            xx = -11.15+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-15 + (((tickAnim - 112) / 5) * (0-(-11.15+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-15)));
            yy = 0 + (((tickAnim - 112) / 5) * (14.75-(0)));
            zz = 0 + (((tickAnim - 112) / 5) * (0-(0)));
        }
        else if (tickAnim >= 117 && tickAnim < 130) {
            xx = 0 + (((tickAnim - 117) / 13) * (0.5-(0)));
            yy = 14.75 + (((tickAnim - 117) / 13) * (0-(14.75)));
            zz = 0 + (((tickAnim - 117) / 13) * (0-(0)));
        }
        else if (tickAnim >= 130 && tickAnim < 153) {
            xx = 0.5 + (((tickAnim - 130) / 23) * (0.5-(0.5)));
            yy = 0 + (((tickAnim - 130) / 23) * (0-(0)));
            zz = 0 + (((tickAnim - 130) / 23) * (0-(0)));
        }
        else if (tickAnim >= 153 && tickAnim < 170) {
            xx = 0.5 + (((tickAnim - 153) / 17) * (0.5-(0.5)));
            yy = 0 + (((tickAnim - 153) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 153) / 17) * (0-(0)));
        }
        else if (tickAnim >= 170 && tickAnim < 188) {
            xx = 0.5 + (((tickAnim - 170) / 18) * (0-(0.5)));
            yy = 0 + (((tickAnim - 170) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 170) / 18) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm2, rightArm2.rotateAngleX + (float) Math.toRadians(xx), rightArm2.rotateAngleY + (float) Math.toRadians(yy), rightArm2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 12 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 12) / 7) * (-16.875+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150-50))*25-(0)));
            yy = 0 + (((tickAnim - 12) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 7) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 27) {
            xx = -16.875+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150-50))*25 + (((tickAnim - 19) / 8) * (0-(-16.875+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150-50))*25)));
            yy = 0 + (((tickAnim - 19) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 19) / 8) * (0-(0)));
        }
        else if (tickAnim >= 27 && tickAnim < 124) {
            xx = 0 + (((tickAnim - 27) / 97) * (0-(0)));
            yy = 0 + (((tickAnim - 27) / 97) * (0-(0)));
            zz = 0 + (((tickAnim - 27) / 97) * (0-(0)));
        }
        else if (tickAnim >= 124 && tickAnim < 132) {
            xx = 0 + (((tickAnim - 124) / 8) * (10.5-(0)));
            yy = 0 + (((tickAnim - 124) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 124) / 8) * (0-(0)));
        }
        else if (tickAnim >= 132 && tickAnim < 139) {
            xx = 10.5 + (((tickAnim - 132) / 7) * (0-(10.5)));
            yy = 0 + (((tickAnim - 132) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 132) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(xx), jaw.rotateAngleY + (float) Math.toRadians(yy), jaw.rotateAngleZ + (float) Math.toRadians(zz));

    }

    public void animWalk(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraSchoenesmahl entity = (EntityPrehistoricFloraSchoenesmahl) entitylivingbaseIn;
        int animCycle = 20;
        if (entity.animSpeedAdder() <= 0) {
            partialTickTime = 0; //If it's static don't increment partial ticks either
        }
        double tickAnim = (entity.ticksExistedAnimated + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExistedAnimated + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        this.setRotateAngle(hips, hips.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*345/0.5))*0.9), hips.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*345-150))*10), hips.rotateAngleZ + (float) Math.toRadians(0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*345+60))*5));
        this.hips.rotationPointX = this.hips.rotationPointX + (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*345))*0.7);
        this.hips.rotationPointY = this.hips.rotationPointY - (float)(0.05+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*345/0.5-80))*0.05);
        this.hips.rotationPointZ = this.hips.rotationPointZ + (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*345/0.5-60))*0.15);


        this.setRotateAngle(tail1, tail1.rotateAngleX + (float) Math.toRadians(4.25), tail1.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*345-40))*-8), tail1.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(0), tail2.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*345-20))*-8), tail2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(0), tail3.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*345+30))*10), tail3.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(0), tail4.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*345+50))*12), tail4.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tail5, tail5.rotateAngleX + (float) Math.toRadians(0), tail5.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*345+80))*14), tail5.rotateAngleZ + (float) Math.toRadians(0));



        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (-5.2951-(0)));
            yy = -53 + (((tickAnim - 0) / 5) * (-26.0749-(-53)));
            zz = 0 + (((tickAnim - 0) / 5) * (-22.21125-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = -5.2951 + (((tickAnim - 5) / 5) * (6.50757-(-5.2951)));
            yy = -26.0749 + (((tickAnim - 5) / 5) * (11.65749-(-26.0749)));
            zz = -22.21125 + (((tickAnim - 5) / 5) * (3.4992-(-22.21125)));
        }
        else if (tickAnim >= 10 && tickAnim < 21) {
            xx = 6.50757 + (((tickAnim - 10) / 11) * (0-(6.50757)));
            yy = 11.65749 + (((tickAnim - 10) / 11) * (-53-(11.65749)));
            zz = 3.4992 + (((tickAnim - 10) / 11) * (0-(3.4992)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(lefLeg1, lefLeg1.rotateAngleX + (float) Math.toRadians(xx), lefLeg1.rotateAngleY + (float) Math.toRadians(yy), lefLeg1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 194.06615 + (((tickAnim - 0) / 5) * (18.22959-(194.06615)));
            yy = 38.02533 + (((tickAnim - 0) / 5) * (76.22344-(38.02533)));
            zz = -198.33749 + (((tickAnim - 0) / 5) * (-14.83082-(-198.33749)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 18.22959 + (((tickAnim - 5) / 5) * (8.79996-(18.22959)));
            yy = 76.22344 + (((tickAnim - 5) / 5) * (46.7658-(76.22344)));
            zz = -14.83082 + (((tickAnim - 5) / 5) * (-3.27762-(-14.83082)));
        }
        else if (tickAnim >= 10 && tickAnim < 21) {
            xx = 8.79996 + (((tickAnim - 10) / 11) * (194.06615-(8.79996)));
            yy = 46.7658 + (((tickAnim - 10) / 11) * (38.02533-(46.7658)));
            zz = -3.27762 + (((tickAnim - 10) / 11) * (-198.33749-(-3.27762)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg2, leftLeg2.rotateAngleX + (float) Math.toRadians(xx), leftLeg2.rotateAngleY + (float) Math.toRadians(yy), leftLeg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 150.81023 + (((tickAnim - 0) / 2) * (124.21465-(150.81023)));
            yy = 39.84981 + (((tickAnim - 0) / 2) * (34.41489-(39.84981)));
            zz = 150.22203 + (((tickAnim - 0) / 2) * (106.80993-(150.22203)));
        }
        else if (tickAnim >= 2 && tickAnim < 5) {
            xx = 124.21465 + (((tickAnim - 2) / 3) * (52.42805-(124.21465)));
            yy = 34.41489 + (((tickAnim - 2) / 3) * (11.01569-(34.41489)));
            zz = 106.80993 + (((tickAnim - 2) / 3) * (0.1907-(106.80993)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 52.42805 + (((tickAnim - 5) / 3) * (-38.74278-(52.42805)));
            yy = 11.01569 + (((tickAnim - 5) / 3) * (42.44718-(11.01569)));
            zz = 0.1907 + (((tickAnim - 5) / 3) * (-65.52113-(0.1907)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = -38.74278 + (((tickAnim - 8) / 2) * (-171.5-(-38.74278)));
            yy = 42.44718 + (((tickAnim - 8) / 2) * (27.5-(42.44718)));
            zz = -65.52113 + (((tickAnim - 8) / 2) * (-180-(-65.52113)));
        }
        else if (tickAnim >= 10 && tickAnim < 14) {
            xx = -171.5 + (((tickAnim - 10) / 4) * (-29.39464-(-171.5)));
            yy = 27.5 + (((tickAnim - 10) / 4) * (38.68426-(27.5)));
            zz = -180 + (((tickAnim - 10) / 4) * (-27.31504-(-180)));
        }
        else if (tickAnim >= 14 && tickAnim < 16) {
            xx = -29.39464 + (((tickAnim - 14) / 2) * (-21.74297-(-29.39464)));
            yy = 38.68426 + (((tickAnim - 14) / 2) * (41.75646-(38.68426)));
            zz = -27.31504 + (((tickAnim - 14) / 2) * (-18.26513-(-27.31504)));
        }
        else if (tickAnim >= 16 && tickAnim < 18) {
            xx = -21.74297 + (((tickAnim - 16) / 2) * (0.87849-(-21.74297)));
            yy = 41.75646 + (((tickAnim - 16) / 2) * (45.57051-(41.75646)));
            zz = -18.26513 + (((tickAnim - 16) / 2) * (0.92599-(-18.26513)));
        }
        else if (tickAnim >= 18 && tickAnim < 19) {
            xx = 0.87849 + (((tickAnim - 18) / 1) * (52.94366-(0.87849)));
            yy = 45.57051 + (((tickAnim - 18) / 1) * (48.11104-(45.57051)));
            zz = 0.92599 + (((tickAnim - 18) / 1) * (52.52653-(0.92599)));
        }
        else if (tickAnim >= 19 && tickAnim < 20) {
            xx = 52.94366 + (((tickAnim - 19) / 1) * (113.69729-(52.94366)));
            yy = 48.11104 + (((tickAnim - 19) / 1) * (47.31485-(48.11104)));
            zz = 52.52653 + (((tickAnim - 19) / 1) * (113.33804-(52.52653)));
        }
        else if (tickAnim >= 20 && tickAnim < 21) {
            xx = 113.69729 + (((tickAnim - 20) / 1) * (159.02694-(113.69729)));
            yy = 47.31485 + (((tickAnim - 20) / 1) * (40.77829-(47.31485)));
            zz = 113.33804 + (((tickAnim - 20) / 1) * (158.6272-(113.33804)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftFoot, leftFoot.rotateAngleX + (float) Math.toRadians(xx), leftFoot.rotateAngleY + (float) Math.toRadians(yy), leftFoot.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 2) * (0.875-(0)));
            zz = 0 + (((tickAnim - 0) / 2) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 2) / 3) * (0-(0)));
            yy = 0.875 + (((tickAnim - 2) / 3) * (0.75-(0.875)));
            zz = 0 + (((tickAnim - 2) / 3) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            yy = 0.75 + (((tickAnim - 5) / 5) * (0.85-(0.75)));
            zz = 0 + (((tickAnim - 5) / 5) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 10) / 4) * (0-(0)));
            yy = 0.85 + (((tickAnim - 10) / 4) * (0.07-(0.85)));
            zz = 0 + (((tickAnim - 10) / 4) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 14) / 5) * (0-(0)));
            yy = 0.07 + (((tickAnim - 14) / 5) * (0.12-(0.07)));
            zz = 0 + (((tickAnim - 14) / 5) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 21) {
            xx = 0 + (((tickAnim - 19) / 2) * (0-(0)));
            yy = 0.12 + (((tickAnim - 19) / 2) * (0-(0.12)));
            zz = 0 + (((tickAnim - 19) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftFoot.rotationPointX = this.leftFoot.rotationPointX + (float)(xx);
        this.leftFoot.rotationPointY = this.leftFoot.rotationPointY - (float)(yy);
        this.leftFoot.rotationPointZ = this.leftFoot.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 9) {
            xx = -4.39448 + (((tickAnim - 0) / 9) * (2.83406-(-4.39448)));
            yy = 2.9468 + (((tickAnim - 0) / 9) * (72.13863-(2.9468)));
            zz = 11.11277 + (((tickAnim - 0) / 9) * (5.31652-(11.11277)));
        }
        else if (tickAnim >= 9 && tickAnim < 13) {
            xx = 2.83406 + (((tickAnim - 9) / 4) * (-4.70508-(2.83406)));
            yy = 72.13863 + (((tickAnim - 9) / 4) * (19.97289-(72.13863)));
            zz = 5.31652 + (((tickAnim - 9) / 4) * (33.15963-(5.31652)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
            xx = -4.70508 + (((tickAnim - 13) / 5) * (0-(-4.70508)));
            yy = 19.97289 + (((tickAnim - 13) / 5) * (-20.75-(19.97289)));
            zz = 33.15963 + (((tickAnim - 13) / 5) * (0-(33.15963)));
        }
        else if (tickAnim >= 18 && tickAnim < 21) {
            xx = 0 + (((tickAnim - 18) / 3) * (-4.39448-(0)));
            yy = -20.75 + (((tickAnim - 18) / 3) * (2.9468-(-20.75)));
            zz = 0 + (((tickAnim - 18) / 3) * (11.11277-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(lefLeg2, lefLeg2.rotateAngleX + (float) Math.toRadians(xx), lefLeg2.rotateAngleY + (float) Math.toRadians(yy), lefLeg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 8.79996 + (((tickAnim - 0) / 4) * (-9.84409-(8.79996)));
            yy = -46.76579 + (((tickAnim - 0) / 4) * (-50.14594-(-46.76579)));
            zz = -3.27762 + (((tickAnim - 0) / 4) * (-14.33129-(-3.27762)));
        }
        else if (tickAnim >= 4 && tickAnim < 7) {
            xx = -9.84409 + (((tickAnim - 4) / 3) * (-17.82228-(-9.84409)));
            yy = -50.14594 + (((tickAnim - 4) / 3) * (-48.57521-(-50.14594)));
            zz = -14.33129 + (((tickAnim - 4) / 3) * (-20.59354-(-14.33129)));
        }
        else if (tickAnim >= 7 && tickAnim < 9) {
            xx = -17.82228 + (((tickAnim - 7) / 2) * (-19.39108-(-17.82228)));
            yy = -48.57521 + (((tickAnim - 7) / 2) * (-47.52806-(-48.57521)));
            zz = -20.59354 + (((tickAnim - 7) / 2) * (-24.76838-(-20.59354)));
        }
        else if (tickAnim >= 9 && tickAnim < 13) {
            xx = -19.39108 + (((tickAnim - 9) / 4) * (-1.56193-(-19.39108)));
            yy = -47.52806 + (((tickAnim - 9) / 4) * (-90.76194-(-47.52806)));
            zz = -24.76838 + (((tickAnim - 9) / 4) * (-18.88281-(-24.76838)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
            xx = -1.56193 + (((tickAnim - 13) / 5) * (12-(-1.56193)));
            yy = -90.76194 + (((tickAnim - 13) / 5) * (-47.5-(-90.76194)));
            zz = -18.88281 + (((tickAnim - 13) / 5) * (0-(-18.88281)));
        }
        else if (tickAnim >= 18 && tickAnim < 21) {
            xx = 12 + (((tickAnim - 18) / 3) * (8.79996-(12)));
            yy = -47.5 + (((tickAnim - 18) / 3) * (-46.76579-(-47.5)));
            zz = 0 + (((tickAnim - 18) / 3) * (-3.27762-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg2, rightLeg2.rotateAngleX + (float) Math.toRadians(xx), rightLeg2.rotateAngleY + (float) Math.toRadians(yy), rightLeg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = -68.01859 + (((tickAnim - 0) / 2) * (-6.96433-(-68.01859)));
            yy = -47.82336 + (((tickAnim - 0) / 2) * (-45.83214-(-47.82336)));
            zz = 75.32283 + (((tickAnim - 0) / 2) * (14.362-(75.32283)));
        }
        else if (tickAnim >= 2 && tickAnim < 9) {
            xx = -6.96433 + (((tickAnim - 2) / 7) * (0-(-6.96433)));
            yy = -45.83214 + (((tickAnim - 2) / 7) * (-65.5-(-45.83214)));
            zz = 14.362 + (((tickAnim - 2) / 7) * (0-(14.362)));
        }
        else if (tickAnim >= 9 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 9) / 4) * (44.25-(0)));
            yy = -65.5 + (((tickAnim - 9) / 4) * (0-(-65.5)));
            zz = 0 + (((tickAnim - 9) / 4) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 16) {
            xx = 44.25 + (((tickAnim - 13) / 3) * (-37.99662-(44.25)));
            yy = 0 + (((tickAnim - 13) / 3) * (-23.3523-(0)));
            zz = 0 + (((tickAnim - 13) / 3) * (63.63915-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 18) {
            xx = -37.99662 + (((tickAnim - 16) / 2) * (-57.98405-(-37.99662)));
            yy = -23.3523 + (((tickAnim - 16) / 2) * (-48.91647-(-23.3523)));
            zz = 63.63915 + (((tickAnim - 16) / 2) * (67.403-(63.63915)));
        }
        else if (tickAnim >= 18 && tickAnim < 21) {
            xx = -57.98405 + (((tickAnim - 18) / 3) * (-68.01859-(-57.98405)));
            yy = -48.91647 + (((tickAnim - 18) / 3) * (-47.82336-(-48.91647)));
            zz = 67.403 + (((tickAnim - 18) / 3) * (75.32283-(67.403)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightFoot, rightFoot.rotateAngleX + (float) Math.toRadians(xx), rightFoot.rotateAngleY + (float) Math.toRadians(yy), rightFoot.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 2) * (0.325-(0)));
            zz = 0 + (((tickAnim - 0) / 2) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 2) / 1) * (0-(0)));
            yy = 0.325 + (((tickAnim - 2) / 1) * (0.43-(0.325)));
            zz = 0 + (((tickAnim - 2) / 1) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 3) / 0) * (0-(0)));
            yy = 0.43 + (((tickAnim - 3) / 0) * (0.43-(0.43)));
            zz = 0 + (((tickAnim - 3) / 0) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 3) / 1) * (0-(0)));
            yy = 0.43 + (((tickAnim - 3) / 1) * (0.33-(0.43)));
            zz = 0 + (((tickAnim - 3) / 1) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 4) / 5) * (0-(0)));
            yy = 0.33 + (((tickAnim - 4) / 5) * (0-(0.33)));
            zz = 0 + (((tickAnim - 4) / 5) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 9) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 9) / 4) * (0.475-(0)));
            zz = 0 + (((tickAnim - 9) / 4) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 13) / 5) * (0-(0)));
            yy = 0.475 + (((tickAnim - 13) / 5) * (0-(0.475)));
            zz = 0 + (((tickAnim - 13) / 5) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 18) / 0) * (0-(0)));
            yy = 0 + (((tickAnim - 18) / 0) * (0.15-(0)));
            zz = 0 + (((tickAnim - 18) / 0) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 21) {
            xx = 0 + (((tickAnim - 18) / 3) * (0-(0)));
            yy = 0.15 + (((tickAnim - 18) / 3) * (0-(0.15)));
            zz = 0 + (((tickAnim - 18) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightFoot.rotationPointX = this.rightFoot.rotationPointX + (float)(xx);
        this.rightFoot.rotationPointY = this.rightFoot.rotationPointY - (float)(yy);
        this.rightFoot.rotationPointZ = this.rightFoot.rotationPointZ + (float)(zz);



        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*345/0.5))*-1), body.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*345-10))*9), body.rotateAngleZ + (float) Math.toRadians(0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*345+60))*-5));


        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*345/0.5))*-1), chest.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*345+20))*7), chest.rotateAngleZ + (float) Math.toRadians(0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*345+60))*-5));



        if (tickAnim >= 0 && tickAnim < 10) {
            xx = -1.57449 + (((tickAnim - 0) / 10) * (88.57348-(-1.57449)));
            yy = 50.71974 + (((tickAnim - 0) / 10) * (-34.4577-(50.71974)));
            zz = -5.6273 + (((tickAnim - 0) / 10) * (-84.0442-(-5.6273)));
        }
        else if (tickAnim >= 10 && tickAnim < 16) {
            xx = 88.57348 + (((tickAnim - 10) / 6) * (64.08382-(88.57348)));
            yy = -34.4577 + (((tickAnim - 10) / 6) * (15.21882-(-34.4577)));
            zz = -84.0442 + (((tickAnim - 10) / 6) * (-55.51638-(-84.0442)));
        }
        else if (tickAnim >= 16 && tickAnim < 21) {
            xx = 64.08382 + (((tickAnim - 16) / 5) * (-1.57449-(64.08382)));
            yy = 15.21882 + (((tickAnim - 16) / 5) * (50.71974-(15.21882)));
            zz = -55.51638 + (((tickAnim - 16) / 5) * (-5.6273-(-55.51638)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm1, leftArm1.rotateAngleX + (float) Math.toRadians(xx), leftArm1.rotateAngleY + (float) Math.toRadians(yy), leftArm1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 19.67395 + (((tickAnim - 0) / 5) * (71.77988-(19.67395)));
            yy = -26.92345 + (((tickAnim - 0) / 5) * (-33.70583-(-26.92345)));
            zz = 17.51073 + (((tickAnim - 0) / 5) * (63.50938-(17.51073)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 71.77988 + (((tickAnim - 5) / 3) * (103.94368-(71.77988)));
            yy = -33.70583 + (((tickAnim - 5) / 3) * (-49.59496-(-33.70583)));
            zz = 63.50938 + (((tickAnim - 5) / 3) * (91.48143-(63.50938)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 103.94368 + (((tickAnim - 8) / 2) * (87.24034-(103.94368)));
            yy = -49.59496 + (((tickAnim - 8) / 2) * (-44.14855-(-49.59496)));
            zz = 91.48143 + (((tickAnim - 8) / 2) * (67.47381-(91.48143)));
        }
        else if (tickAnim >= 10 && tickAnim < 16) {
            xx = 87.24034 + (((tickAnim - 10) / 6) * (25.95078-(87.24034)));
            yy = -44.14855 + (((tickAnim - 10) / 6) * (-47.31402-(-44.14855)));
            zz = 67.47381 + (((tickAnim - 10) / 6) * (10.16986-(67.47381)));
        }
        else if (tickAnim >= 16 && tickAnim < 21) {
            xx = 25.95078 + (((tickAnim - 16) / 5) * (19.67395-(25.95078)));
            yy = -47.31402 + (((tickAnim - 16) / 5) * (-26.92345-(-47.31402)));
            zz = 10.16986 + (((tickAnim - 16) / 5) * (17.51073-(10.16986)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm2, leftArm2.rotateAngleX + (float) Math.toRadians(xx), leftArm2.rotateAngleY + (float) Math.toRadians(yy), leftArm2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (-29.79071-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (1.53761-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (-32.76274-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 3) {
            xx = -29.79071 + (((tickAnim - 3) / 0) * (-35.44083-(-29.79071)));
            yy = 1.53761 + (((tickAnim - 3) / 0) * (1.11808-(1.53761)));
            zz = -32.76274 + (((tickAnim - 3) / 0) * (-43.57824-(-32.76274)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = -35.44083 + (((tickAnim - 3) / 2) * (-46.64167-(-35.44083)));
            yy = 1.11808 + (((tickAnim - 3) / 2) * (2.88744-(1.11808)));
            zz = -43.57824 + (((tickAnim - 3) / 2) * (-61.54097-(-43.57824)));
        }
        else if (tickAnim >= 5 && tickAnim < 6) {
            xx = -46.64167 + (((tickAnim - 5) / 1) * (-43.58582-(-46.64167)));
            yy = 2.88744 + (((tickAnim - 5) / 1) * (5.0154-(2.88744)));
            zz = -61.54097 + (((tickAnim - 5) / 1) * (-73.47152-(-61.54097)));
        }
        else if (tickAnim >= 6 && tickAnim < 7) {
            xx = -43.58582 + (((tickAnim - 6) / 1) * (-41.75884-(-43.58582)));
            yy = 5.0154 + (((tickAnim - 6) / 1) * (7.78622-(5.0154)));
            zz = -73.47152 + (((tickAnim - 6) / 1) * (-84.80542-(-73.47152)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = -41.75884 + (((tickAnim - 7) / 1) * (-37.21497-(-41.75884)));
            yy = 7.78622 + (((tickAnim - 7) / 1) * (11.85474-(7.78622)));
            zz = -84.80542 + (((tickAnim - 7) / 1) * (-94.6021-(-84.80542)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = -37.21497 + (((tickAnim - 8) / 2) * (-55.17271-(-37.21497)));
            yy = 11.85474 + (((tickAnim - 8) / 2) * (28.27578-(11.85474)));
            zz = -94.6021 + (((tickAnim - 8) / 2) * (-102.22582-(-94.6021)));
        }
        else if (tickAnim >= 10 && tickAnim < 16) {
            xx = -55.17271 + (((tickAnim - 10) / 6) * (-1.55939-(-55.17271)));
            yy = 28.27578 + (((tickAnim - 10) / 6) * (12.27937-(28.27578)));
            zz = -102.22582 + (((tickAnim - 10) / 6) * (4.78476-(-102.22582)));
        }
        else if (tickAnim >= 16 && tickAnim < 19) {
            xx = -1.55939 + (((tickAnim - 16) / 3) * (-30.72889-(-1.55939)));
            yy = 12.27937 + (((tickAnim - 16) / 3) * (-4.40587-(12.27937)));
            zz = 4.78476 + (((tickAnim - 16) / 3) * (-45.97332-(4.78476)));
        }
        else if (tickAnim >= 19 && tickAnim < 21) {
            xx = -30.72889 + (((tickAnim - 19) / 2) * (0-(-30.72889)));
            yy = -4.40587 + (((tickAnim - 19) / 2) * (0-(-4.40587)));
            zz = -45.97332 + (((tickAnim - 19) / 2) * (0-(-45.97332)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftHand, leftHand.rotateAngleX + (float) Math.toRadians(xx), leftHand.rotateAngleY + (float) Math.toRadians(yy), leftHand.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 1) {
            xx = 0 + (((tickAnim - 0) / 1) * (0.02-(0)));
            yy = 0 + (((tickAnim - 0) / 1) * (0.18-(0)));
            zz = 0 + (((tickAnim - 0) / 1) * (0.02-(0)));
        }
        else if (tickAnim >= 1 && tickAnim < 2) {
            xx = 0.02 + (((tickAnim - 1) / 1) * (0.04-(0.02)));
            yy = 0.18 + (((tickAnim - 1) / 1) * (0.285-(0.18)));
            zz = 0.02 + (((tickAnim - 1) / 1) * (0.04-(0.02)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = 0.04 + (((tickAnim - 2) / 1) * (0.05-(0.04)));
            yy = 0.285 + (((tickAnim - 2) / 1) * (0.23-(0.285)));
            zz = 0.04 + (((tickAnim - 2) / 1) * (0.065-(0.04)));
        }
        else if (tickAnim >= 3 && tickAnim < 3) {
            xx = 0.05 + (((tickAnim - 3) / 0) * (0.07-(0.05)));
            yy = 0.23 + (((tickAnim - 3) / 0) * (0.245-(0.23)));
            zz = 0.065 + (((tickAnim - 3) / 0) * (0-(0.065)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 0.07 + (((tickAnim - 3) / 2) * (0.1-(0.07)));
            yy = 0.245 + (((tickAnim - 3) / 2) * (0.05-(0.245)));
            zz = 0 + (((tickAnim - 3) / 2) * (-0.125-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 6) {
            xx = 0.1 + (((tickAnim - 5) / 1) * (0.055-(0.1)));
            yy = 0.05 + (((tickAnim - 5) / 1) * (0.06-(0.05)));
            zz = -0.125 + (((tickAnim - 5) / 1) * (-0.09-(-0.125)));
        }
        else if (tickAnim >= 6 && tickAnim < 10) {
            xx = 0.055 + (((tickAnim - 6) / 4) * (0-(0.055)));
            yy = 0.06 + (((tickAnim - 6) / 4) * (0.1-(0.06)));
            zz = -0.09 + (((tickAnim - 6) / 4) * (0-(-0.09)));
        }
        else if (tickAnim >= 10 && tickAnim < 21) {
            xx = 0 + (((tickAnim - 10) / 11) * (0-(0)));
            yy = 0.1 + (((tickAnim - 10) / 11) * (0-(0.1)));
            zz = 0 + (((tickAnim - 10) / 11) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftHand.rotationPointX = this.leftHand.rotationPointX + (float)(xx);
        this.leftHand.rotationPointY = this.leftHand.rotationPointY - (float)(yy);
        this.leftHand.rotationPointZ = this.leftHand.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 88.57348 + (((tickAnim - 0) / 5) * (63.11874-(88.57348)));
            yy = 34.45771 + (((tickAnim - 0) / 5) * (-14.56233-(34.45771)));
            zz = 84.04422 + (((tickAnim - 0) / 5) * (58.23352-(84.04422)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 63.11874 + (((tickAnim - 5) / 5) * (-0.28979-(63.11874)));
            yy = -14.56233 + (((tickAnim - 5) / 5) * (-35.55669-(-14.56233)));
            zz = 58.23352 + (((tickAnim - 5) / 5) * (10.83137-(58.23352)));
        }
        else if (tickAnim >= 10 && tickAnim < 21) {
            xx = -0.28979 + (((tickAnim - 10) / 11) * (88.57348-(-0.28979)));
            yy = -35.55669 + (((tickAnim - 10) / 11) * (34.45771-(-35.55669)));
            zz = 10.83137 + (((tickAnim - 10) / 11) * (84.04422-(10.83137)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm1, rightArm1.rotateAngleX + (float) Math.toRadians(xx), rightArm1.rotateAngleY + (float) Math.toRadians(yy), rightArm1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 68.06697 + (((tickAnim - 0) / 5) * (12.68923-(68.06697)));
            yy = 36.10684 + (((tickAnim - 0) / 5) * (49.6217-(36.10684)));
            zz = -82.06026 + (((tickAnim - 0) / 5) * (-14.99061-(-82.06026)));
        }
        else if (tickAnim >= 5 && tickAnim < 7) {
            xx = 12.68923 + (((tickAnim - 5) / 2) * (6.30811-(12.68923)));
            yy = 49.6217 + (((tickAnim - 5) / 2) * (49.8712-(49.6217)));
            zz = -14.99061 + (((tickAnim - 5) / 2) * (-6.23124-(-14.99061)));
        }
        else if (tickAnim >= 7 && tickAnim < 10) {
            xx = 6.30811 + (((tickAnim - 7) / 3) * (51.88053-(6.30811)));
            yy = 49.8712 + (((tickAnim - 7) / 3) * (16.17336-(49.8712)));
            zz = -6.23124 + (((tickAnim - 7) / 3) * (-58.00149-(-6.23124)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = 51.88053 + (((tickAnim - 10) / 5) * (51.48756-(51.88053)));
            yy = 16.17336 + (((tickAnim - 10) / 5) * (26.37714-(16.17336)));
            zz = -58.00149 + (((tickAnim - 10) / 5) * (-59.684-(-58.00149)));
        }
        else if (tickAnim >= 15 && tickAnim < 21) {
            xx = 51.48756 + (((tickAnim - 15) / 6) * (68.06697-(51.48756)));
            yy = 26.37714 + (((tickAnim - 15) / 6) * (36.10684-(26.37714)));
            zz = -59.684 + (((tickAnim - 15) / 6) * (-82.06026-(-59.684)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm2, rightArm2.rotateAngleX + (float) Math.toRadians(xx), rightArm2.rotateAngleY + (float) Math.toRadians(yy), rightArm2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = -36.84854 + (((tickAnim - 0) / 5) * (5.67898-(-36.84854)));
            yy = -49.342 + (((tickAnim - 0) / 5) * (-17.85839-(-49.342)));
            zz = 76.11898 + (((tickAnim - 0) / 5) * (0.95973-(76.11898)));
        }
        else if (tickAnim >= 5 && tickAnim < 9) {
            xx = 5.67898 + (((tickAnim - 5) / 4) * (-15.90479-(5.67898)));
            yy = -17.85839 + (((tickAnim - 5) / 4) * (-7.96044-(-17.85839)));
            zz = 0.95973 + (((tickAnim - 5) / 4) * (40.48962-(0.95973)));
        }
        else if (tickAnim >= 9 && tickAnim < 10) {
            xx = -15.90479 + (((tickAnim - 9) / 1) * (4.74635-(-15.90479)));
            yy = -7.96044 + (((tickAnim - 9) / 1) * (-0.18627-(-7.96044)));
            zz = 40.48962 + (((tickAnim - 9) / 1) * (2.24228-(40.48962)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = 4.74635 + (((tickAnim - 10) / 5) * (-31.68816-(4.74635)));
            yy = -0.18627 + (((tickAnim - 10) / 5) * (-37.13293-(-0.18627)));
            zz = 2.24228 + (((tickAnim - 10) / 5) * (58.38075-(2.24228)));
        }
        else if (tickAnim >= 15 && tickAnim < 21) {
            xx = -31.68816 + (((tickAnim - 15) / 6) * (-36.84854-(-31.68816)));
            yy = -37.13293 + (((tickAnim - 15) / 6) * (-49.342-(-37.13293)));
            zz = 58.38075 + (((tickAnim - 15) / 6) * (76.11898-(58.38075)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightHand, rightHand.rotateAngleX + (float) Math.toRadians(xx), rightHand.rotateAngleY + (float) Math.toRadians(yy), rightHand.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = 0.1 + (((tickAnim - 0) / 10) * (0.075-(0.1)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 10) / 1) * (0-(0)));
            yy = 0.075 + (((tickAnim - 10) / 1) * (0.2-(0.075)));
            zz = 0 + (((tickAnim - 10) / 1) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 11) / 1) * (0-(0)));
            yy = 0.2 + (((tickAnim - 11) / 1) * (0.275-(0.2)));
            zz = 0 + (((tickAnim - 11) / 1) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 12) / 1) * (0-(0)));
            yy = 0.275 + (((tickAnim - 12) / 1) * (0.305-(0.275)));
            zz = 0 + (((tickAnim - 12) / 1) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 13) / 2) * (0-(0)));
            yy = 0.305 + (((tickAnim - 13) / 2) * (0.05-(0.305)));
            zz = 0 + (((tickAnim - 13) / 2) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 21) {
            xx = 0 + (((tickAnim - 15) / 6) * (0-(0)));
            yy = 0.05 + (((tickAnim - 15) / 6) * (0.1-(0.05)));
            zz = 0 + (((tickAnim - 15) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightHand.rotationPointX = this.rightHand.rotationPointX + (float)(xx);
        this.rightHand.rotationPointY = this.rightHand.rotationPointY - (float)(yy);
        this.rightHand.rotationPointZ = this.rightHand.rotationPointZ + (float)(zz);



        this.setRotateAngle(neck1, neck1.rotateAngleX + (float) Math.toRadians(0), neck1.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*345+30))*15), neck1.rotateAngleZ + (float) Math.toRadians(0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*345+60))*3));


        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(0), head.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*345))*-14), head.rotateAngleZ + (float) Math.toRadians(0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*345+60))*2));

    }

    public void animRun(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraSchoenesmahl entity = (EntityPrehistoricFloraSchoenesmahl) entitylivingbaseIn;
        int animCycle = 10;
        if (entity.animSpeedAdder() <= 0) {
            partialTickTime = 0; //If it's static don't increment partial ticks either
        }
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        this.setRotateAngle(hips, hips.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*345/0.48))*0.5), hips.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*345/0.48-150))*18), hips.rotateAngleZ + (float) Math.toRadians(0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*345/0.48+60))*5));
        this.hips.rotationPointX = this.hips.rotationPointX + (float)(xx);
        this.hips.rotationPointY = this.hips.rotationPointY - (float)(yy);
        this.hips.rotationPointZ = this.hips.rotationPointZ + (float)(zz);



        this.setRotateAngle(tail1, tail1.rotateAngleX + (float) Math.toRadians(6.5), tail1.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*345/0.48-40))*-10), tail1.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(1.25), tail2.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*345/0.48-20))*-10), tail2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(3.75), tail3.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*345/0.48+30))*13), tail3.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(0), tail4.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*345/0.48+50))*16), tail4.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tail5, tail5.rotateAngleX + (float) Math.toRadians(0), tail5.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*345/0.48+80))*19), tail5.rotateAngleZ + (float) Math.toRadians(0));



        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (-5.2951-(0)));
            yy = -53 + (((tickAnim - 0) / 3) * (-26.0749-(-53)));
            zz = 0 + (((tickAnim - 0) / 3) * (-22.21125-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = -5.2951 + (((tickAnim - 3) / 2) * (1.10728-(-5.2951)));
            yy = -26.0749 + (((tickAnim - 3) / 2) * (2.73834-(-26.0749)));
            zz = -22.21125 + (((tickAnim - 3) / 2) * (2.01618-(-22.21125)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 1.10728 + (((tickAnim - 5) / 5) * (0-(1.10728)));
            yy = 2.73834 + (((tickAnim - 5) / 5) * (-53-(2.73834)));
            zz = 2.01618 + (((tickAnim - 5) / 5) * (0-(2.01618)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(lefLeg1, lefLeg1.rotateAngleX + (float) Math.toRadians(xx), lefLeg1.rotateAngleY + (float) Math.toRadians(yy), lefLeg1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 194.06615 + (((tickAnim - 0) / 3) * (18.22959-(194.06615)));
            yy = 38.02533 + (((tickAnim - 0) / 3) * (76.22344-(38.02533)));
            zz = -198.33749 + (((tickAnim - 0) / 3) * (-14.83082-(-198.33749)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 18.22959 + (((tickAnim - 3) / 2) * (8.79996-(18.22959)));
            yy = 76.22344 + (((tickAnim - 3) / 2) * (46.7658-(76.22344)));
            zz = -14.83082 + (((tickAnim - 3) / 2) * (-3.27762-(-14.83082)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 8.79996 + (((tickAnim - 5) / 5) * (194.06615-(8.79996)));
            yy = 46.7658 + (((tickAnim - 5) / 5) * (38.02533-(46.7658)));
            zz = -3.27762 + (((tickAnim - 5) / 5) * (-198.33749-(-3.27762)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg2, leftLeg2.rotateAngleX + (float) Math.toRadians(xx), leftLeg2.rotateAngleY + (float) Math.toRadians(yy), leftLeg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 1) {
            xx = 150.81023 + (((tickAnim - 0) / 1) * (124.21465-(150.81023)));
            yy = 39.84981 + (((tickAnim - 0) / 1) * (34.41489-(39.84981)));
            zz = 150.22203 + (((tickAnim - 0) / 1) * (106.80993-(150.22203)));
        }
        else if (tickAnim >= 1 && tickAnim < 3) {
            xx = 124.21465 + (((tickAnim - 1) / 2) * (52.42805-(124.21465)));
            yy = 34.41489 + (((tickAnim - 1) / 2) * (11.01569-(34.41489)));
            zz = 106.80993 + (((tickAnim - 1) / 2) * (0.1907-(106.80993)));
        }
        else if (tickAnim >= 3 && tickAnim < 3) {
            xx = 52.42805 + (((tickAnim - 3) / 0) * (-38.74278-(52.42805)));
            yy = 11.01569 + (((tickAnim - 3) / 0) * (42.44718-(11.01569)));
            zz = 0.1907 + (((tickAnim - 3) / 0) * (-65.52113-(0.1907)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = -38.74278 + (((tickAnim - 3) / 2) * (-171.5-(-38.74278)));
            yy = 42.44718 + (((tickAnim - 3) / 2) * (27.5-(42.44718)));
            zz = -65.52113 + (((tickAnim - 3) / 2) * (-180-(-65.52113)));
        }
        else if (tickAnim >= 5 && tickAnim < 7) {
            xx = -171.5 + (((tickAnim - 5) / 2) * (-29.39464-(-171.5)));
            yy = 27.5 + (((tickAnim - 5) / 2) * (38.68426-(27.5)));
            zz = -180 + (((tickAnim - 5) / 2) * (-27.31504-(-180)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = -29.39464 + (((tickAnim - 7) / 1) * (-21.74297-(-29.39464)));
            yy = 38.68426 + (((tickAnim - 7) / 1) * (41.75646-(38.68426)));
            zz = -27.31504 + (((tickAnim - 7) / 1) * (-18.26513-(-27.31504)));
        }
        else if (tickAnim >= 8 && tickAnim < 8) {
            xx = -21.74297 + (((tickAnim - 8) / 0) * (0.87849-(-21.74297)));
            yy = 41.75646 + (((tickAnim - 8) / 0) * (45.57051-(41.75646)));
            zz = -18.26513 + (((tickAnim - 8) / 0) * (0.92599-(-18.26513)));
        }
        else if (tickAnim >= 8 && tickAnim < 9) {
            xx = 0.87849 + (((tickAnim - 8) / 1) * (52.94366-(0.87849)));
            yy = 45.57051 + (((tickAnim - 8) / 1) * (48.11104-(45.57051)));
            zz = 0.92599 + (((tickAnim - 8) / 1) * (52.52653-(0.92599)));
        }
        else if (tickAnim >= 9 && tickAnim < 10) {
            xx = 52.94366 + (((tickAnim - 9) / 1) * (159.02694-(52.94366)));
            yy = 48.11104 + (((tickAnim - 9) / 1) * (40.77829-(48.11104)));
            zz = 52.52653 + (((tickAnim - 9) / 1) * (158.6272-(52.52653)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftFoot, leftFoot.rotateAngleX + (float) Math.toRadians(xx), leftFoot.rotateAngleY + (float) Math.toRadians(yy), leftFoot.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 1) {
            xx = 0 + (((tickAnim - 0) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 1) * (0.875-(0)));
            zz = 0 + (((tickAnim - 0) / 1) * (0-(0)));
        }
        else if (tickAnim >= 1 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 1) / 2) * (0-(0)));
            yy = 0.875 + (((tickAnim - 1) / 2) * (0.75-(0.875)));
            zz = 0 + (((tickAnim - 1) / 2) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            yy = 0.75 + (((tickAnim - 3) / 2) * (0.85-(0.75)));
            zz = 0 + (((tickAnim - 3) / 2) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 5) / 2) * (0-(0)));
            yy = 0.85 + (((tickAnim - 5) / 2) * (0.07-(0.85)));
            zz = 0 + (((tickAnim - 5) / 2) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 7) / 2) * (0-(0)));
            yy = 0.07 + (((tickAnim - 7) / 2) * (0.12-(0.07)));
            zz = 0 + (((tickAnim - 7) / 2) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 9) / 1) * (0-(0)));
            yy = 0.12 + (((tickAnim - 9) / 1) * (0-(0.12)));
            zz = 0 + (((tickAnim - 9) / 1) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftFoot.rotationPointX = this.leftFoot.rotationPointX + (float)(xx);
        this.leftFoot.rotationPointY = this.leftFoot.rotationPointY - (float)(yy);
        this.leftFoot.rotationPointZ = this.leftFoot.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (2.83406-(0)));
            yy = -20.75 + (((tickAnim - 0) / 5) * (72.13863-(-20.75)));
            zz = 0 + (((tickAnim - 0) / 5) * (5.31652-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 2.83406 + (((tickAnim - 5) / 3) * (-4.70508-(2.83406)));
            yy = 72.13863 + (((tickAnim - 5) / 3) * (19.97289-(72.13863)));
            zz = 5.31652 + (((tickAnim - 5) / 3) * (33.15963-(5.31652)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = -4.70508 + (((tickAnim - 8) / 2) * (0-(-4.70508)));
            yy = 19.97289 + (((tickAnim - 8) / 2) * (-20.75-(19.97289)));
            zz = 33.15963 + (((tickAnim - 8) / 2) * (0-(33.15963)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(lefLeg2, lefLeg2.rotateAngleX + (float) Math.toRadians(xx), lefLeg2.rotateAngleY + (float) Math.toRadians(yy), lefLeg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 80.7647 + (((tickAnim - 0) / 2) * (-9.84409-(80.7647)));
            yy = -40.18897 + (((tickAnim - 0) / 2) * (-50.14594-(-40.18897)));
            zz = 71.98401 + (((tickAnim - 0) / 2) * (-14.33129-(71.98401)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = -9.84409 + (((tickAnim - 2) / 1) * (-17.82228-(-9.84409)));
            yy = -50.14594 + (((tickAnim - 2) / 1) * (-48.57521-(-50.14594)));
            zz = -14.33129 + (((tickAnim - 2) / 1) * (-20.59354-(-14.33129)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = -17.82228 + (((tickAnim - 3) / 2) * (-19.39108-(-17.82228)));
            yy = -48.57521 + (((tickAnim - 3) / 2) * (-47.52806-(-48.57521)));
            zz = -20.59354 + (((tickAnim - 3) / 2) * (-24.76838-(-20.59354)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = -19.39108 + (((tickAnim - 5) / 3) * (-1.56193-(-19.39108)));
            yy = -47.52806 + (((tickAnim - 5) / 3) * (-90.76194-(-47.52806)));
            zz = -24.76838 + (((tickAnim - 5) / 3) * (-18.88281-(-24.76838)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = -1.56193 + (((tickAnim - 8) / 2) * (80.7647-(-1.56193)));
            yy = -90.76194 + (((tickAnim - 8) / 2) * (-40.18897-(-90.76194)));
            zz = -18.88281 + (((tickAnim - 8) / 2) * (71.98401-(-18.88281)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg2, rightLeg2.rotateAngleX + (float) Math.toRadians(xx), rightLeg2.rotateAngleY + (float) Math.toRadians(yy), rightLeg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = -166.3096 + (((tickAnim - 0) / 2) * (-58.96896-(-166.3096)));
            yy = -36.22373 + (((tickAnim - 0) / 2) * (-46.76856-(-36.22373)));
            zz = 176.21448 + (((tickAnim - 0) / 2) * (72.25648-(176.21448)));
        }
        else if (tickAnim >= 2 && tickAnim < 5) {
            xx = -58.96896 + (((tickAnim - 2) / 3) * (0-(-58.96896)));
            yy = -46.76856 + (((tickAnim - 2) / 3) * (-65.5-(-46.76856)));
            zz = 72.25648 + (((tickAnim - 2) / 3) * (0-(72.25648)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 5) / 3) * (58.5-(0)));
            yy = -65.5 + (((tickAnim - 5) / 3) * (0-(-65.5)));
            zz = 0 + (((tickAnim - 5) / 3) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 58.5 + (((tickAnim - 8) / 2) * (-166.3096-(58.5)));
            yy = 0 + (((tickAnim - 8) / 2) * (-36.22373-(0)));
            zz = 0 + (((tickAnim - 8) / 2) * (176.21448-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightFoot, rightFoot.rotateAngleX + (float) Math.toRadians(xx), rightFoot.rotateAngleY + (float) Math.toRadians(yy), rightFoot.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 2) * (0.505-(0)));
            zz = 0 + (((tickAnim - 0) / 2) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 2) / 3) * (0-(0)));
            yy = 0.505 + (((tickAnim - 2) / 3) * (0-(0.505)));
            zz = 0 + (((tickAnim - 2) / 3) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 5) / 3) * (0.475-(0)));
            zz = 0 + (((tickAnim - 5) / 3) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            yy = 0.475 + (((tickAnim - 8) / 2) * (0-(0.475)));
            zz = 0 + (((tickAnim - 8) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightFoot.rotationPointX = this.rightFoot.rotationPointX + (float)(xx);
        this.rightFoot.rotationPointY = this.rightFoot.rotationPointY - (float)(yy);
        this.rightFoot.rotationPointZ = this.rightFoot.rotationPointZ + (float)(zz);



        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*345/0.48))*-1), body.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*345/0.48-10))*17), body.rotateAngleZ + (float) Math.toRadians(0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*345/0.48+60))*-7));


        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*345/0.48))*-0.5), chest.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*345/0.48+40))*20), chest.rotateAngleZ + (float) Math.toRadians(0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*345/0.48+60))*-7));



        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 11.21435 + (((tickAnim - 0) / 2) * (43.23294-(11.21435)));
            yy = 68.85929 + (((tickAnim - 0) / 2) * (32.23125-(68.85929)));
            zz = 3.75423 + (((tickAnim - 0) / 2) * (-30.05033-(3.75423)));
        }
        else if (tickAnim >= 2 && tickAnim < 5) {
            xx = 43.23294 + (((tickAnim - 2) / 3) * (106.64518-(43.23294)));
            yy = 32.23125 + (((tickAnim - 2) / 3) * (-47.17476-(32.23125)));
            zz = -30.05033 + (((tickAnim - 2) / 3) * (-88.21801-(-30.05033)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 106.64518 + (((tickAnim - 5) / 3) * (65.5018-(106.64518)));
            yy = -47.17476 + (((tickAnim - 5) / 3) * (12.62333-(-47.17476)));
            zz = -88.21801 + (((tickAnim - 5) / 3) * (-59.45665-(-88.21801)));
        }
        else if (tickAnim >= 8 && tickAnim < 9) {
            xx = 65.5018 + (((tickAnim - 8) / 1) * (17.11246-(65.5018)));
            yy = 12.62333 + (((tickAnim - 8) / 1) * (58.34107-(12.62333)));
            zz = -59.45665 + (((tickAnim - 8) / 1) * (-53.18101-(-59.45665)));
        }
        else if (tickAnim >= 9 && tickAnim < 10) {
            xx = 17.11246 + (((tickAnim - 9) / 1) * (11.21435-(17.11246)));
            yy = 58.34107 + (((tickAnim - 9) / 1) * (68.85929-(58.34107)));
            zz = -53.18101 + (((tickAnim - 9) / 1) * (3.75423-(-53.18101)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm1, leftArm1.rotateAngleX + (float) Math.toRadians(xx), leftArm1.rotateAngleY + (float) Math.toRadians(yy), leftArm1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 27.42395 + (((tickAnim - 0) / 3) * (96.23003-(27.42395)));
            yy = -26.92345 + (((tickAnim - 0) / 3) * (-34.497-(-26.92345)));
            zz = 17.51073 + (((tickAnim - 0) / 3) * (78.88065-(17.51073)));
        }
        else if (tickAnim >= 3 && tickAnim < 3) {
            xx = 96.23003 + (((tickAnim - 3) / 0) * (103.94368-(96.23003)));
            yy = -34.497 + (((tickAnim - 3) / 0) * (-49.59496-(-34.497)));
            zz = 78.88065 + (((tickAnim - 3) / 0) * (91.48143-(78.88065)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 103.94368 + (((tickAnim - 3) / 2) * (87.24034-(103.94368)));
            yy = -49.59496 + (((tickAnim - 3) / 2) * (-44.14855-(-49.59496)));
            zz = 91.48143 + (((tickAnim - 3) / 2) * (67.47381-(91.48143)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 87.24034 + (((tickAnim - 5) / 3) * (25.95078-(87.24034)));
            yy = -44.14855 + (((tickAnim - 5) / 3) * (-47.31402-(-44.14855)));
            zz = 67.47381 + (((tickAnim - 5) / 3) * (10.16986-(67.47381)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 25.95078 + (((tickAnim - 8) / 2) * (27.42395-(25.95078)));
            yy = -47.31402 + (((tickAnim - 8) / 2) * (-26.92345-(-47.31402)));
            zz = 10.16986 + (((tickAnim - 8) / 2) * (17.51073-(10.16986)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm2, leftArm2.rotateAngleX + (float) Math.toRadians(xx), leftArm2.rotateAngleY + (float) Math.toRadians(yy), leftArm2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 1) {
            xx = 0 + (((tickAnim - 0) / 1) * (-23.04071-(0)));
            yy = 0 + (((tickAnim - 0) / 1) * (1.53761-(0)));
            zz = 0 + (((tickAnim - 0) / 1) * (-32.76274-(0)));
        }
        else if (tickAnim >= 1 && tickAnim < 2) {
            xx = -23.04071 + (((tickAnim - 1) / 1) * (-34.6645-(-23.04071)));
            yy = 1.53761 + (((tickAnim - 1) / 1) * (-7.96613-(1.53761)));
            zz = -32.76274 + (((tickAnim - 1) / 1) * (-56.48125-(-32.76274)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = -34.6645 + (((tickAnim - 2) / 1) * (-41.0154-(-34.6645)));
            yy = -7.96613 + (((tickAnim - 2) / 1) * (-9.76584-(-7.96613)));
            zz = -56.48125 + (((tickAnim - 2) / 1) * (-75.41964-(-56.48125)));
        }
        else if (tickAnim >= 3 && tickAnim < 3) {
            xx = -41.0154 + (((tickAnim - 3) / 0) * (-37.21497-(-41.0154)));
            yy = -9.76584 + (((tickAnim - 3) / 0) * (11.85474-(-9.76584)));
            zz = -75.41964 + (((tickAnim - 3) / 0) * (-94.6021-(-75.41964)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = -37.21497 + (((tickAnim - 3) / 2) * (-42.2504-(-37.21497)));
            yy = 11.85474 + (((tickAnim - 3) / 2) * (31.66291-(11.85474)));
            zz = -94.6021 + (((tickAnim - 3) / 2) * (-98.3804-(-94.6021)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = -42.2504 + (((tickAnim - 5) / 3) * (-1.55939-(-42.2504)));
            yy = 31.66291 + (((tickAnim - 5) / 3) * (12.27937-(31.66291)));
            zz = -98.3804 + (((tickAnim - 5) / 3) * (4.78476-(-98.3804)));
        }
        else if (tickAnim >= 8 && tickAnim < 9) {
            xx = -1.55939 + (((tickAnim - 8) / 1) * (-30.72889-(-1.55939)));
            yy = 12.27937 + (((tickAnim - 8) / 1) * (-4.40587-(12.27937)));
            zz = 4.78476 + (((tickAnim - 8) / 1) * (-45.97332-(4.78476)));
        }
        else if (tickAnim >= 9 && tickAnim < 10) {
            xx = -30.72889 + (((tickAnim - 9) / 1) * (0-(-30.72889)));
            yy = -4.40587 + (((tickAnim - 9) / 1) * (0-(-4.40587)));
            zz = -45.97332 + (((tickAnim - 9) / 1) * (0-(-45.97332)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftHand, leftHand.rotateAngleX + (float) Math.toRadians(xx), leftHand.rotateAngleY + (float) Math.toRadians(yy), leftHand.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 1) {
            xx = 0 + (((tickAnim - 0) / 1) * (0.05-(0)));
            yy = 0 + (((tickAnim - 0) / 1) * (0.33-(0)));
            zz = 0 + (((tickAnim - 0) / 1) * (0.065-(0)));
        }
        else if (tickAnim >= 1 && tickAnim < 2) {
            xx = 0.05 + (((tickAnim - 1) / 1) * (0.07-(0.05)));
            yy = 0.33 + (((tickAnim - 1) / 1) * (0.245-(0.33)));
            zz = 0.065 + (((tickAnim - 1) / 1) * (0-(0.065)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = 0.07 + (((tickAnim - 2) / 1) * (0.1-(0.07)));
            yy = 0.245 + (((tickAnim - 2) / 1) * (0.05-(0.245)));
            zz = 0 + (((tickAnim - 2) / 1) * (-0.125-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 0.1 + (((tickAnim - 3) / 2) * (-0.025-(0.1)));
            yy = 0.05 + (((tickAnim - 3) / 2) * (0.1-(0.05)));
            zz = -0.125 + (((tickAnim - 3) / 2) * (0.075-(-0.125)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = -0.025 + (((tickAnim - 5) / 5) * (0-(-0.025)));
            yy = 0.1 + (((tickAnim - 5) / 5) * (0-(0.1)));
            zz = 0.075 + (((tickAnim - 5) / 5) * (0-(0.075)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftHand.rotationPointX = this.leftHand.rotationPointX + (float)(xx);
        this.leftHand.rotationPointY = this.leftHand.rotationPointY - (float)(yy);
        this.leftHand.rotationPointZ = this.leftHand.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 77.97285 + (((tickAnim - 0) / 3) * (63.11874-(77.97285)));
            yy = 44.31813 + (((tickAnim - 0) / 3) * (-14.56233-(44.31813)));
            zz = 73.08042 + (((tickAnim - 0) / 3) * (58.23352-(73.08042)));
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = 63.11874 + (((tickAnim - 3) / 1) * (32.11012-(63.11874)));
            yy = -14.56233 + (((tickAnim - 3) / 1) * (-54.59602-(-14.56233)));
            zz = 58.23352 + (((tickAnim - 3) / 1) * (49.91094-(58.23352)));
        }
        else if (tickAnim >= 4 && tickAnim < 5) {
            xx = 32.11012 + (((tickAnim - 4) / 1) * (25.36604-(32.11012)));
            yy = -54.59602 + (((tickAnim - 4) / 1) * (-58.51642-(-54.59602)));
            zz = 49.91094 + (((tickAnim - 4) / 1) * (10.7315-(49.91094)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 25.36604 + (((tickAnim - 5) / 5) * (77.97285-(25.36604)));
            yy = -58.51642 + (((tickAnim - 5) / 5) * (44.31813-(-58.51642)));
            zz = 10.7315 + (((tickAnim - 5) / 5) * (73.08042-(10.7315)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm1, rightArm1.rotateAngleX + (float) Math.toRadians(xx), rightArm1.rotateAngleY + (float) Math.toRadians(yy), rightArm1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 68.06697 + (((tickAnim - 0) / 3) * (12.68923-(68.06697)));
            yy = 36.10684 + (((tickAnim - 0) / 3) * (49.6217-(36.10684)));
            zz = -82.06026 + (((tickAnim - 0) / 3) * (-14.99061-(-82.06026)));
        }
        else if (tickAnim >= 3 && tickAnim < 3) {
            xx = 12.68923 + (((tickAnim - 3) / 0) * (6.30811-(12.68923)));
            yy = 49.6217 + (((tickAnim - 3) / 0) * (49.8712-(49.6217)));
            zz = -14.99061 + (((tickAnim - 3) / 0) * (-6.23124-(-14.99061)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 6.30811 + (((tickAnim - 3) / 2) * (51.88053-(6.30811)));
            yy = 49.8712 + (((tickAnim - 3) / 2) * (16.17336-(49.8712)));
            zz = -6.23124 + (((tickAnim - 3) / 2) * (-58.00149-(-6.23124)));
        }
        else if (tickAnim >= 5 && tickAnim < 7) {
            xx = 51.88053 + (((tickAnim - 5) / 2) * (51.48756-(51.88053)));
            yy = 16.17336 + (((tickAnim - 5) / 2) * (26.37714-(16.17336)));
            zz = -58.00149 + (((tickAnim - 5) / 2) * (-59.684-(-58.00149)));
        }
        else if (tickAnim >= 7 && tickAnim < 10) {
            xx = 51.48756 + (((tickAnim - 7) / 3) * (68.06697-(51.48756)));
            yy = 26.37714 + (((tickAnim - 7) / 3) * (36.10684-(26.37714)));
            zz = -59.684 + (((tickAnim - 7) / 3) * (-82.06026-(-59.684)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm2, rightArm2.rotateAngleX + (float) Math.toRadians(xx), rightArm2.rotateAngleY + (float) Math.toRadians(yy), rightArm2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = -22.95916 + (((tickAnim - 0) / 3) * (5.67898-(-22.95916)));
            yy = -55.5119 + (((tickAnim - 0) / 3) * (-17.85839-(-55.5119)));
            zz = 58.66996 + (((tickAnim - 0) / 3) * (0.95973-(58.66996)));
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = 5.67898 + (((tickAnim - 3) / 1) * (-15.90479-(5.67898)));
            yy = -17.85839 + (((tickAnim - 3) / 1) * (-7.96044-(-17.85839)));
            zz = 0.95973 + (((tickAnim - 3) / 1) * (40.48962-(0.95973)));
        }
        else if (tickAnim >= 4 && tickAnim < 5) {
            xx = -15.90479 + (((tickAnim - 4) / 1) * (2.43581-(-15.90479)));
            yy = -7.96044 + (((tickAnim - 4) / 1) * (-1.70055-(-7.96044)));
            zz = 40.48962 + (((tickAnim - 4) / 1) * (20.93413-(40.48962)));
        }
        else if (tickAnim >= 5 && tickAnim < 7) {
            xx = 2.43581 + (((tickAnim - 5) / 2) * (-27.62029-(2.43581)));
            yy = -1.70055 + (((tickAnim - 5) / 2) * (-34.83704-(-1.70055)));
            zz = 20.93413 + (((tickAnim - 5) / 2) * (64.21746-(20.93413)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = -27.62029 + (((tickAnim - 7) / 1) * (-28.557-(-27.62029)));
            yy = -34.83704 + (((tickAnim - 7) / 1) * (-43.4753-(-34.83704)));
            zz = 64.21746 + (((tickAnim - 7) / 1) * (66.11792-(64.21746)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = -28.557 + (((tickAnim - 8) / 2) * (-22.95916-(-28.557)));
            yy = -43.4753 + (((tickAnim - 8) / 2) * (-55.5119-(-43.4753)));
            zz = 66.11792 + (((tickAnim - 8) / 2) * (58.66996-(66.11792)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightHand, rightHand.rotateAngleX + (float) Math.toRadians(xx), rightHand.rotateAngleY + (float) Math.toRadians(yy), rightHand.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            yy = 0.1 + (((tickAnim - 0) / 4) * (0.38-(0.1)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 4) / 1) * (0-(0)));
            yy = 0.38 + (((tickAnim - 4) / 1) * (0.175-(0.38)));
            zz = 0 + (((tickAnim - 4) / 1) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 5) / 1) * (0-(0)));
            yy = 0.175 + (((tickAnim - 5) / 1) * (0.305-(0.175)));
            zz = 0 + (((tickAnim - 5) / 1) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 6) / 1) * (0-(0)));
            yy = 0.305 + (((tickAnim - 6) / 1) * (0.2-(0.305)));
            zz = 0 + (((tickAnim - 6) / 1) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 7) / 1) * (0-(0)));
            yy = 0.2 + (((tickAnim - 7) / 1) * (0.525-(0.2)));
            zz = 0 + (((tickAnim - 7) / 1) * (0.15-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            yy = 0.525 + (((tickAnim - 8) / 2) * (0.1-(0.525)));
            zz = 0.15 + (((tickAnim - 8) / 2) * (0-(0.15)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightHand.rotationPointX = this.rightHand.rotationPointX + (float)(xx);
        this.rightHand.rotationPointY = this.rightHand.rotationPointY - (float)(yy);
        this.rightHand.rotationPointZ = this.rightHand.rotationPointZ + (float)(zz);



        this.setRotateAngle(neck1, neck1.rotateAngleX + (float) Math.toRadians(0), neck1.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*345/0.48+30))*20), neck1.rotateAngleZ + (float) Math.toRadians(0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*345/0.48+60))*3));


        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(0), head.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*345/0.48))*-20), head.rotateAngleZ + (float) Math.toRadians(0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*345/0.48+60))*2));


    }

    @Override
    public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
        super.setRotationAngles(f, f1, f2, f3, f4, f5, e);
        //this.resetToDefaultPose();
        this.base.offsetZ = -0.95F;

        EntityPrehistoricFloraSchoenesmahl entitySchoenesmahl = (EntityPrehistoricFloraSchoenesmahl) e;

        this.faceTarget(f3, f4, 8, neck1);
        this.faceTarget(f3, f4, 8, head);


    }


    public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        EntityPrehistoricFloraSchoenesmahl e = (EntityPrehistoricFloraSchoenesmahl) entity;
        animator.update(entity);
        //this.resetToDefaultPose();
        setRotationAngles(f, f1, f2, f3, f4, f5, (Entity) entity);

        animator.setAnimation(e.ATTACK_ANIMATION);
        animator.startKeyframe(5);
        animator.rotate(this.neck1, (float) Math.toRadians(30), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.head, (float) Math.toRadians(-15), (float) Math.toRadians(0), (float) Math.toRadians(0));
        //animator.rotate(this.upperjaw, (float) Math.toRadians(-25), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.jaw, (float) Math.toRadians(10), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(2);
        animator.resetKeyframe(2);

        animator.setAnimation(e.ROAR_ANIMATION);
        animator.startKeyframe(10);
        animator.move(this.neck1, 0,0,-0.5F);
        animator.rotate(this.head, (float) Math.toRadians(-17), (float) Math.toRadians(0), (float) Math.toRadians(0));
        //animator.rotate(this.upperjaw, (float) Math.toRadians(-25), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.jaw, (float) Math.toRadians(10), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(10);
        animator.resetKeyframe(10);
    }
}
