package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.EntityPrehistoricFloraLusotitan;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;

public class ModelLusotitan extends ModelBasePalaeopedia {
    private final AdvancedModelRenderer hips;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer rightLeg;
    private final AdvancedModelRenderer rightLeg2;
    private final AdvancedModelRenderer rightLeg3;
    private final AdvancedModelRenderer rightLeg4;
    private final AdvancedModelRenderer leftLeg;
    private final AdvancedModelRenderer leftLeg2;
    private final AdvancedModelRenderer leftLeg3;
    private final AdvancedModelRenderer leftLeg4;
    private final AdvancedModelRenderer tail1;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer tail2;
    private final AdvancedModelRenderer tail3;
    private final AdvancedModelRenderer tail4;
    private final AdvancedModelRenderer tail5;
    private final AdvancedModelRenderer tail6;
    private final AdvancedModelRenderer tail7;
    private final AdvancedModelRenderer tail8;
    private final AdvancedModelRenderer body;
    private final AdvancedModelRenderer cube_r6;
    private final AdvancedModelRenderer cube_r7;
    private final AdvancedModelRenderer chest;
    private final AdvancedModelRenderer cube_r8;
    private final AdvancedModelRenderer cube_r9;
    private final AdvancedModelRenderer cube_r10;
    private final AdvancedModelRenderer leftArm;
    private final AdvancedModelRenderer leftArm2;
    private final AdvancedModelRenderer leftArm3;
    private final AdvancedModelRenderer cube_r11;
    private final AdvancedModelRenderer rightArm;
    private final AdvancedModelRenderer rightArm2;
    private final AdvancedModelRenderer rightArm3;
    private final AdvancedModelRenderer cube_r12;
    private final AdvancedModelRenderer neck1;
    private final AdvancedModelRenderer cube_r13;
    private final AdvancedModelRenderer neck2;
    private final AdvancedModelRenderer neck3;
    private final AdvancedModelRenderer neck4;
    private final AdvancedModelRenderer neck5;
    private final AdvancedModelRenderer neck6;
    private final AdvancedModelRenderer neck7;
    private final AdvancedModelRenderer neck8;
    private final AdvancedModelRenderer neck9;
    private final AdvancedModelRenderer head;
    private final AdvancedModelRenderer cube_r14;
    private final AdvancedModelRenderer HEADPARTS;
    private final AdvancedModelRenderer cube_r15;
    private final AdvancedModelRenderer cube_r16;
    private final AdvancedModelRenderer bone30;
    private final AdvancedModelRenderer cube_r17;
    private final AdvancedModelRenderer bone31;
    private final AdvancedModelRenderer cube_r18;
    private final AdvancedModelRenderer bone23;
    private final AdvancedModelRenderer bone24;
    private final AdvancedModelRenderer bone25;
    private final AdvancedModelRenderer bone26;
    private final AdvancedModelRenderer bone27;
    private final AdvancedModelRenderer cube_r19;
    private final AdvancedModelRenderer bone28;
    private final AdvancedModelRenderer bone29;
    private final AdvancedModelRenderer jaw;
    private final AdvancedModelRenderer cube_r20;
    private final AdvancedModelRenderer JAWPARTS;
    private final AdvancedModelRenderer cube_r21;
    private final AdvancedModelRenderer bone34;
    private final AdvancedModelRenderer cube_r22;
    private final AdvancedModelRenderer bone35;
    private final AdvancedModelRenderer cube_r23;
    private final AdvancedModelRenderer throat;
    private final AdvancedModelRenderer cube_r24;

    private ModelAnimator animator;

    public ModelLusotitan() {
        this.textureWidth = 320;
        this.textureHeight = 320;

        this.hips = new AdvancedModelRenderer(this);
        this.hips.setRotationPoint(0.0F, -25.5F, 21.0F);


        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(0.0F, 21.0F, -18.0F);
        this.hips.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.6545F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 156, 212, -12.0F, -17.25F, 17.75F, 24, 28, 11, 0.0F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(0.0F, 19.25F, -15.0F);
        this.hips.addChild(cube_r2);
        this.setRotateAngle(cube_r2, -0.48F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 71, 186, -11.0F, -40.5F, -9.25F, 22, 19, 20, 0.0F, false));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(0.0F, 21.0F, -18.0F);
        this.hips.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.1309F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 0, 73, -14.0F, -31.5F, -0.25F, 28, 32, 21, 0.0F, false));

        this.rightLeg = new AdvancedModelRenderer(this);
        this.rightLeg.setRotationPoint(-11.0F, 0.0F, 0.0F);
        this.hips.addChild(rightLeg);
        this.setRotateAngle(rightLeg, -0.3054F, 0.0F, 0.0F);
        this.rightLeg.cubeList.add(new ModelBox(rightLeg, 55, 226, -6.0F, -5.0F, -4.0F, 11, 32, 16, 0.0F, true));

        this.rightLeg2 = new AdvancedModelRenderer(this);
        this.rightLeg2.setRotationPoint(-1.0F, 27.0F, 4.0F);
        this.rightLeg.addChild(rightLeg2);
        this.setRotateAngle(rightLeg2, 0.5672F, 0.0F, 0.0F);
        this.rightLeg2.cubeList.add(new ModelBox(rightLeg2, 167, 252, -4.0F, -3.0F, -5.0F, 9, 22, 10, 0.0F, true));

        this.rightLeg3 = new AdvancedModelRenderer(this);
        this.rightLeg3.setRotationPoint(0.0F, 18.0F, 0.0F);
        this.rightLeg2.addChild(rightLeg3);
        this.setRotateAngle(rightLeg3, -0.2618F, 0.0F, 0.0F);
        this.rightLeg3.cubeList.add(new ModelBox(rightLeg3, 164, 142, -5.0F, -1.0F, -6.5F, 11, 6, 12, 0.0F, true));

        this.rightLeg4 = new AdvancedModelRenderer(this);
        this.rightLeg4.setRotationPoint(5.0F, 5.0F, -7.5F);
        this.rightLeg3.addChild(rightLeg4);
        this.setRotateAngle(rightLeg4, 0.0F, 0.2182F, 0.0F);
        this.rightLeg4.cubeList.add(new ModelBox(rightLeg4, 0, 127, -9.0F, -6.0F, -2.0F, 9, 6, 3, -0.01F, true));

        this.leftLeg = new AdvancedModelRenderer(this);
        this.leftLeg.setRotationPoint(11.0F, 0.0F, 0.0F);
        this.hips.addChild(leftLeg);
        this.setRotateAngle(leftLeg, -0.3054F, 0.0F, 0.0F);
        this.leftLeg.cubeList.add(new ModelBox(leftLeg, 55, 226, -5.0F, -5.0F, -4.0F, 11, 32, 16, 0.0F, false));

        this.leftLeg2 = new AdvancedModelRenderer(this);
        this.leftLeg2.setRotationPoint(1.0F, 27.0F, 4.0F);
        this.leftLeg.addChild(leftLeg2);
        this.setRotateAngle(leftLeg2, 0.5672F, 0.0F, 0.0F);
        this.leftLeg2.cubeList.add(new ModelBox(leftLeg2, 167, 252, -5.0F, -3.0F, -5.0F, 9, 22, 10, 0.0F, false));

        this.leftLeg3 = new AdvancedModelRenderer(this);
        this.leftLeg3.setRotationPoint(0.0F, 18.0F, 0.0F);
        this.leftLeg2.addChild(leftLeg3);
        this.setRotateAngle(leftLeg3, -0.2618F, 0.0F, 0.0F);
        this.leftLeg3.cubeList.add(new ModelBox(leftLeg3, 164, 142, -6.0F, -1.0F, -6.5F, 11, 6, 12, 0.0F, false));

        this.leftLeg4 = new AdvancedModelRenderer(this);
        this.leftLeg4.setRotationPoint(-5.0F, 5.0F, -7.5F);
        this.leftLeg3.addChild(leftLeg4);
        this.setRotateAngle(leftLeg4, 0.0F, -0.2182F, 0.0F);
        this.leftLeg4.cubeList.add(new ModelBox(leftLeg4, 0, 127, 0.0F, -6.0F, -2.0F, 9, 6, 3, -0.01F, false));

        this.tail1 = new AdvancedModelRenderer(this);
        this.tail1.setRotationPoint(0.0F, -4.5F, 9.0F);
        this.hips.addChild(tail1);
        this.setRotateAngle(tail1, -0.1309F, 0.0F, 0.0F);


        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(0.0F, 5.0F, 2.0F);
        this.tail1.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.4363F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 231, 142, -9.0F, -2.25F, -7.0F, 18, 13, 15, -0.1F, false));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(0.0F, -5.0F, 13.0F);
        this.tail1.addChild(cube_r5);
        this.setRotateAngle(cube_r5, -0.2618F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 224, 88, -9.0F, 0.25F, -14.0F, 18, 12, 16, 0.0F, false));

        this.tail2 = new AdvancedModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, 0.55F, 13.0F);
        this.tail1.addChild(tail2);
        this.setRotateAngle(tail2, -0.2618F, 0.0F, 0.0F);
        this.tail2.cubeList.add(new ModelBox(tail2, 234, 0, -6.0F, -4.75F, -2.0F, 12, 15, 18, 0.0F, false));

        this.tail3 = new AdvancedModelRenderer(this);
        this.tail3.setRotationPoint(0.0F, 0.5F, 16.0F);
        this.tail2.addChild(tail3);
        this.setRotateAngle(tail3, 0.1309F, 0.0F, 0.0F);
        this.tail3.cubeList.add(new ModelBox(tail3, 110, 234, -5.0F, -4.75F, -2.0F, 10, 11, 18, 0.0F, false));

        this.tail4 = new AdvancedModelRenderer(this);
        this.tail4.setRotationPoint(0.0F, -0.75F, 16.0F);
        this.tail3.addChild(tail4);
        this.setRotateAngle(tail4, 0.0873F, 0.0F, 0.0F);
        this.tail4.cubeList.add(new ModelBox(tail4, 246, 34, -4.0F, -3.75F, -3.0F, 8, 8, 19, 0.0F, false));

        this.tail5 = new AdvancedModelRenderer(this);
        this.tail5.setRotationPoint(0.0F, -0.75F, 16.0F);
        this.tail4.addChild(tail5);
        this.setRotateAngle(tail5, 0.1309F, 0.0F, 0.0F);
        this.tail5.cubeList.add(new ModelBox(tail5, 98, 0, -3.0F, -2.75F, -2.0F, 6, 6, 18, 0.0F, false));

        this.tail6 = new AdvancedModelRenderer(this);
        this.tail6.setRotationPoint(0.0F, -0.75F, 16.0F);
        this.tail5.addChild(tail6);
        this.setRotateAngle(tail6, -0.0873F, 0.0F, 0.0F);
        this.tail6.cubeList.add(new ModelBox(tail6, 138, 92, -2.0F, -1.75F, -2.0F, 4, 4, 18, 0.0F, false));

        this.tail7 = new AdvancedModelRenderer(this);
        this.tail7.setRotationPoint(0.0F, -0.5F, 16.0F);
        this.tail6.addChild(tail7);
        this.setRotateAngle(tail7, -0.0436F, 0.0F, 0.0F);
        this.tail7.cubeList.add(new ModelBox(tail7, 72, 143, -1.0F, -1.0F, -1.0F, 2, 2, 14, 0.0F, false));

        this.tail8 = new AdvancedModelRenderer(this);
        this.tail8.setRotationPoint(0.0F, 0.25F, 13.0F);
        this.tail7.addChild(tail8);
        this.setRotateAngle(tail8, -0.0436F, 0.0F, 0.0F);
        this.tail8.cubeList.add(new ModelBox(tail8, 0, 0, -0.5F, -1.0F, -1.0F, 1, 1, 15, 0.0F, false));

        this.body = new AdvancedModelRenderer(this);
        this.body.setRotationPoint(0.0F, -7.5F, -6.0F);
        this.hips.addChild(body);
        this.setRotateAngle(body, 0.0524F, 0.0F, 0.0F);


        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(0.0F, 28.5F, -12.0F);
        this.body.addChild(cube_r6);
        this.setRotateAngle(cube_r6, -0.4363F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 0, 0, -16.0F, -37.75F, -32.0F, 32, 39, 33, 0.0F, false));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(0.0F, 26.75F, -9.0F);
        this.body.addChild(cube_r7);
        this.setRotateAngle(cube_r7, -0.5498F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 131, 0, -12.0F, -40.75F, -34.75F, 24, 12, 27, 0.0F, false));

        this.chest = new AdvancedModelRenderer(this);
        this.chest.setRotationPoint(0.0F, -15.0F, -25.0F);
        this.body.addChild(chest);
        this.setRotateAngle(chest, -0.0873F, 0.0F, 0.0F);


        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.chest.addChild(cube_r8);
        this.setRotateAngle(cube_r8, -0.6545F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 167, 165, -10.5F, -13.25F, -16.65F, 21, 25, 21, 0.0F, false));

        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(0.0F, 30.0F, -16.0F);
        this.chest.addChild(cube_r9);
        this.setRotateAngle(cube_r9, -0.829F, 0.0F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 91, 143, -12.0F, -18.0F, -22.0F, 24, 18, 24, 0.0F, false));

        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(0.0F, 30.0F, -16.0F);
        this.chest.addChild(cube_r10);
        this.setRotateAngle(cube_r10, -1.6144F, 0.0F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 0, 143, -13.0F, -14.75F, -34.75F, 26, 31, 19, 0.0F, false));

        this.leftArm = new AdvancedModelRenderer(this);
        this.leftArm.setRotationPoint(17.0F, 14.0F, -17.5F);
        this.chest.addChild(leftArm);
        this.setRotateAngle(leftArm, 0.0436F, 0.0F, 0.0F);
        this.leftArm.cubeList.add(new ModelBox(leftArm, 0, 240, -11.0F, -4.0F, -4.5F, 11, 34, 12, 0.0F, false));

        this.leftArm2 = new AdvancedModelRenderer(this);
        this.leftArm2.setRotationPoint(0.0F, 29.0F, 1.0F);
        this.leftArm.addChild(leftArm2);
        this.setRotateAngle(leftArm2, -0.3054F, 0.0F, 0.0F);
        this.leftArm2.cubeList.add(new ModelBox(leftArm2, 252, 171, -9.5F, -2.0F, -4.0F, 8, 22, 10, 0.0F, false));

        this.leftArm3 = new AdvancedModelRenderer(this);
        this.leftArm3.setRotationPoint(0.0F, 18.0F, 1.0F);
        this.leftArm2.addChild(leftArm3);
        this.setRotateAngle(leftArm3, 0.2618F, 0.0F, 0.0F);
        this.leftArm3.cubeList.add(new ModelBox(leftArm3, 249, 117, -10.0F, -1.0F, -4.25F, 9, 12, 8, 0.0F, false));

        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(-10.0F, 6.0F, 0.0F);
        this.leftArm3.addChild(cube_r11);
        this.setRotateAngle(cube_r11, 0.0F, 0.0F, 0.5672F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 46, 134, 0.0F, 0.0F, -2.25F, 2, 5, 2, 0.0F, false));

        this.rightArm = new AdvancedModelRenderer(this);
        this.rightArm.setRotationPoint(-17.0F, 14.0F, -17.5F);
        this.chest.addChild(rightArm);
        this.setRotateAngle(rightArm, 0.0436F, 0.0F, 0.0F);
        this.rightArm.cubeList.add(new ModelBox(rightArm, 0, 240, 0.0F, -4.0F, -4.5F, 11, 34, 12, 0.0F, true));

        this.rightArm2 = new AdvancedModelRenderer(this);
        this.rightArm2.setRotationPoint(0.0F, 29.0F, 1.0F);
        this.rightArm.addChild(rightArm2);
        this.setRotateAngle(rightArm2, -0.3054F, 0.0F, 0.0F);
        this.rightArm2.cubeList.add(new ModelBox(rightArm2, 252, 171, 1.5F, -2.0F, -4.0F, 8, 22, 10, 0.0F, true));

        this.rightArm3 = new AdvancedModelRenderer(this);
        this.rightArm3.setRotationPoint(0.0F, 18.0F, 1.0F);
        this.rightArm2.addChild(rightArm3);
        this.setRotateAngle(rightArm3, 0.2618F, 0.0F, 0.0F);
        this.rightArm3.cubeList.add(new ModelBox(rightArm3, 249, 117, 1.0F, -1.0F, -4.25F, 9, 12, 8, 0.0F, true));

        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(10.0F, 6.0F, 0.0F);
        this.rightArm3.addChild(cube_r12);
        this.setRotateAngle(cube_r12, 0.0F, 0.0F, -0.5672F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 46, 134, -2.0F, 0.0F, -2.25F, 2, 5, 2, 0.0F, true));

        this.neck1 = new AdvancedModelRenderer(this);
        this.neck1.setRotationPoint(0.0F, -9.0F, -15.0F);
        this.chest.addChild(neck1);
        this.setRotateAngle(neck1, -0.829F, 0.0F, 0.0F);
        this.neck1.cubeList.add(new ModelBox(neck1, 101, 43, -8.5F, -15.0F, -22.0F, 17, 18, 30, 0.0F, false));

        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(0.0F, -14.0F, -1.0F);
        this.neck1.addChild(cube_r13);
        this.setRotateAngle(cube_r13, -0.1745F, 0.0F, 0.0F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 69, 97, -9.5F, 14.0F, -19.0F, 19, 15, 30, 0.0F, false));

        this.neck2 = new AdvancedModelRenderer(this);
        this.neck2.setRotationPoint(0.0F, 0.0F, -21.0F);
        this.neck1.addChild(neck2);
        this.setRotateAngle(neck2, -0.2182F, 0.0F, 0.0F);
        this.neck2.cubeList.add(new ModelBox(neck2, 168, 92, -7.5F, -14.0F, -21.0F, 15, 24, 25, 0.0F, false));

        this.neck3 = new AdvancedModelRenderer(this);
        this.neck3.setRotationPoint(0.0F, 0.0F, -19.0F);
        this.neck2.addChild(neck3);
        this.setRotateAngle(neck3, -0.1745F, 0.0F, 0.0F);
        this.neck3.cubeList.add(new ModelBox(neck3, 196, 40, -6.0F, -13.0F, -21.0F, 12, 22, 25, 0.0F, false));

        this.neck4 = new AdvancedModelRenderer(this);
        this.neck4.setRotationPoint(0.0F, -1.5F, -20.0F);
        this.neck3.addChild(neck4);
        this.setRotateAngle(neck4, -0.1309F, 0.0F, 0.0F);
        this.neck4.cubeList.add(new ModelBox(neck4, 0, 194, -5.0F, -11.0F, -21.0F, 10, 20, 25, 0.0F, false));

        this.neck5 = new AdvancedModelRenderer(this);
        this.neck5.setRotationPoint(0.0F, -1.5F, -20.0F);
        this.neck4.addChild(neck5);
        this.setRotateAngle(neck5, 0.0436F, 0.0F, 0.0F);
        this.neck5.cubeList.add(new ModelBox(neck5, 227, 212, -4.5F, -9.0F, -19.0F, 9, 17, 21, 0.0F, false));

        this.neck6 = new AdvancedModelRenderer(this);
        this.neck6.setRotationPoint(0.0F, -0.75F, -18.0F);
        this.neck5.addChild(neck6);
        this.setRotateAngle(neck6, 0.0873F, 0.0F, 0.0F);
        this.neck6.cubeList.add(new ModelBox(neck6, 210, 251, -4.0F, -8.0F, -16.0F, 8, 15, 17, 0.0F, false));

        this.neck7 = new AdvancedModelRenderer(this);
        this.neck7.setRotationPoint(0.0F, 0.25F, -14.0F);
        this.neck6.addChild(neck7);
        this.setRotateAngle(neck7, 0.0436F, 0.0F, 0.0F);
        this.neck7.cubeList.add(new ModelBox(neck7, 261, 251, -3.5F, -8.0F, -11.0F, 7, 14, 12, 0.0F, false));

        this.neck8 = new AdvancedModelRenderer(this);
        this.neck8.setRotationPoint(0.0F, -4.0F, -11.0F);
        this.neck7.addChild(neck8);
        this.setRotateAngle(neck8, 0.2618F, 0.0F, 0.0F);
        this.neck8.cubeList.add(new ModelBox(neck8, 166, 40, -3.0F, -3.5F, -9.0F, 6, 12, 11, 0.0F, false));

        this.neck9 = new AdvancedModelRenderer(this);
        this.neck9.setRotationPoint(0.0F, 1.0F, -9.0F);
        this.neck8.addChild(neck9);
        this.setRotateAngle(neck9, 0.3927F, 0.0F, 0.0F);
        this.neck9.cubeList.add(new ModelBox(neck9, 136, 186, -2.5F, -3.5F, -7.4F, 5, 8, 10, 0.0F, false));

        this.head = new AdvancedModelRenderer(this);
        this.head.setRotationPoint(0.0F, -0.9F, -7.05F);
        this.neck9.addChild(head);
        this.setRotateAngle(head, 0.7854F, 0.0F, 0.0F);


        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(0.0F, 0.75F, -2.0F);
        this.head.addChild(cube_r14);
        this.setRotateAngle(cube_r14, -0.3491F, 0.0F, 0.0F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 78, 73, -3.0F, -3.95F, -2.0F, 6, 7, 5, 0.0F, false));

        this.HEADPARTS = new AdvancedModelRenderer(this);
        this.HEADPARTS.setRotationPoint(0.0F, 3.15F, -5.1F);
        this.head.addChild(HEADPARTS);
        this.setRotateAngle(HEADPARTS, -0.0436F, 0.0F, 0.0F);
        this.HEADPARTS.cubeList.add(new ModelBox(HEADPARTS, 0, 6, -2.0F, -1.0F, -3.75F, 4, 1, 3, 0.0F, false));

        this.cube_r15 = new AdvancedModelRenderer(this);
        this.cube_r15.setRotationPoint(0.0F, 0.0F, -3.75F);
        this.HEADPARTS.addChild(cube_r15);
        this.setRotateAngle(cube_r15, -0.3054F, 0.0F, 0.0F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 99, 92, -1.5F, -1.0F, -2.0F, 3, 1, 2, 0.0F, false));

        this.cube_r16 = new AdvancedModelRenderer(this);
        this.cube_r16.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.HEADPARTS.addChild(cube_r16);
        this.setRotateAngle(cube_r16, -0.1309F, 0.0F, 0.0F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 78, 86, -2.5F, -2.2F, -4.0F, 5, 2, 5, 0.0F, false));

        this.bone30 = new AdvancedModelRenderer(this);
        this.bone30.setRotationPoint(0.0F, 0.25F, -0.05F);
        this.HEADPARTS.addChild(bone30);
        this.setRotateAngle(bone30, -0.0436F, 0.0F, 0.0F);


        this.cube_r17 = new AdvancedModelRenderer(this);
        this.cube_r17.setRotationPoint(0.0F, -0.25F, -0.75F);
        this.bone30.addChild(cube_r17);
        this.setRotateAngle(cube_r17, -0.0436F, 0.0F, 0.0F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 48, 127, -2.5F, -0.95F, -3.15F, 5, 1, 5, -0.01F, false));

        this.bone31 = new AdvancedModelRenderer(this);
        this.bone31.setRotationPoint(0.0F, -0.2F, -3.9F);
        this.bone30.addChild(bone31);
        this.setRotateAngle(bone31, -0.1745F, 0.0F, 0.0F);


        this.cube_r18 = new AdvancedModelRenderer(this);
        this.cube_r18.setRotationPoint(0.0F, -0.05F, -0.85F);
        this.bone31.addChild(cube_r18);
        this.setRotateAngle(cube_r18, 0.0436F, 0.0F, 0.0F);
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 13, 28, -2.0F, -1.05F, -1.05F, 4, 1, 2, -0.01F, false));

        this.bone23 = new AdvancedModelRenderer(this);
        this.bone23.setRotationPoint(0.0F, 0.0F, -3.0F);
        this.HEADPARTS.addChild(bone23);
        this.setRotateAngle(bone23, -0.2182F, 0.0F, 0.0F);
        this.bone23.cubeList.add(new ModelBox(bone23, 0, 28, -2.0F, -2.5F, -2.9F, 4, 2, 2, 0.0F, false));

        this.bone24 = new AdvancedModelRenderer(this);
        this.bone24.setRotationPoint(0.0F, -2.5F, -2.0F);
        this.bone23.addChild(bone24);
        this.setRotateAngle(bone24, 0.9163F, 0.0F, 0.0F);
        this.bone24.cubeList.add(new ModelBox(bone24, 18, 5, -1.0F, 0.0F, -0.25F, 2, 2, 4, -0.01F, false));

        this.bone25 = new AdvancedModelRenderer(this);
        this.bone25.setRotationPoint(0.0F, 0.0F, 2.75F);
        this.bone24.addChild(bone25);
        this.setRotateAngle(bone25, 0.4363F, 0.0F, 0.0F);
        this.bone25.cubeList.add(new ModelBox(bone25, 119, 25, -1.0F, 0.0F, 0.0F, 2, 3, 3, 0.0F, false));

        this.bone26 = new AdvancedModelRenderer(this);
        this.bone26.setRotationPoint(0.0F, 0.0F, 3.0F);
        this.bone25.addChild(bone26);
        this.setRotateAngle(bone26, -0.829F, 0.0F, 0.0F);
        this.bone26.cubeList.add(new ModelBox(bone26, 55, 134, -1.0F, 0.0F, 0.0F, 2, 4, 2, 0.02F, false));

        this.bone27 = new AdvancedModelRenderer(this);
        this.bone27.setRotationPoint(0.0F, 0.0F, 2.0F);
        this.bone26.addChild(bone27);
        this.setRotateAngle(bone27, -0.7854F, 0.0F, 0.0F);
        this.bone27.cubeList.add(new ModelBox(bone27, 98, 0, -1.0F, 0.0F, 0.0F, 2, 2, 6, 0.01F, false));

        this.cube_r19 = new AdvancedModelRenderer(this);
        this.cube_r19.setRotationPoint(0.0F, 0.0F, 2.5F);
        this.bone27.addChild(cube_r19);
        this.setRotateAngle(cube_r19, 0.0436F, 0.0F, 0.0F);
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 0, 0, -2.0F, 0.0F, 0.0F, 4, 2, 3, 0.01F, false));

        this.bone28 = new AdvancedModelRenderer(this);
        this.bone28.setRotationPoint(0.0F, -2.7F, -3.65F);
        this.HEADPARTS.addChild(bone28);
        this.setRotateAngle(bone28, 0.3491F, 0.0F, 0.0F);
        this.bone28.cubeList.add(new ModelBox(bone28, 129, 8, -2.0F, 0.0F, 0.0F, 4, 2, 5, -0.01F, false));

        this.bone29 = new AdvancedModelRenderer(this);
        this.bone29.setRotationPoint(0.0F, 0.0F, 3.0F);
        this.bone28.addChild(bone29);
        this.setRotateAngle(bone29, 0.3927F, 0.0F, 0.0F);
        this.bone29.cubeList.add(new ModelBox(bone29, 98, 9, -2.0F, 0.0F, 0.0F, 4, 3, 4, 0.0F, false));

        this.jaw = new AdvancedModelRenderer(this);
        this.jaw.setRotationPoint(0.0F, 4.75F, -1.0F);
        this.head.addChild(jaw);
        this.setRotateAngle(jaw, -0.3491F, 0.0F, 0.0F);


        this.cube_r20 = new AdvancedModelRenderer(this);
        this.cube_r20.setRotationPoint(0.0F, 0.0F, -1.0F);
        this.jaw.addChild(cube_r20);
        this.setRotateAngle(cube_r20, -0.3491F, 0.0F, 0.0F);
        this.cube_r20.cubeList.add(new ModelBox(cube_r20, 25, 127, -3.0F, -1.3F, -3.3F, 6, 3, 5, -0.01F, false));

        this.JAWPARTS = new AdvancedModelRenderer(this);
        this.JAWPARTS.setRotationPoint(0.0F, 0.25F, -4.0F);
        this.jaw.addChild(JAWPARTS);
        this.setRotateAngle(JAWPARTS, 0.1745F, 0.0F, 0.0F);
        this.JAWPARTS.cubeList.add(new ModelBox(JAWPARTS, 0, 17, -2.5F, 0.0F, -4.25F, 5, 2, 8, 0.0F, false));

        this.cube_r21 = new AdvancedModelRenderer(this);
        this.cube_r21.setRotationPoint(0.0F, -1.0F, -0.5F);
        this.JAWPARTS.addChild(cube_r21);
        this.setRotateAngle(cube_r21, 0.0873F, 0.0F, 0.0F);
        this.cube_r21.cubeList.add(new ModelBox(cube_r21, 110, 92, -1.5F, 0.25F, -5.5F, 3, 1, 2, -0.01F, false));
        this.cube_r21.cubeList.add(new ModelBox(cube_r21, 18, 0, -2.0F, 0.25F, -3.5F, 4, 1, 3, -0.01F, false));

        this.bone34 = new AdvancedModelRenderer(this);
        this.bone34.setRotationPoint(0.0F, 2.0F, -4.0F);
        this.JAWPARTS.addChild(bone34);
        this.setRotateAngle(bone34, 0.1745F, 0.0F, 0.0F);
        this.bone34.cubeList.add(new ModelBox(bone34, 19, 17, -2.0F, -2.0F, -1.8F, 4, 2, 2, 0.0F, false));

        this.cube_r22 = new AdvancedModelRenderer(this);
        this.cube_r22.setRotationPoint(0.0F, -1.55F, -1.7F);
        this.bone34.addChild(cube_r22);
        this.setRotateAngle(cube_r22, -0.0873F, 0.0F, 0.0F);
        this.cube_r22.cubeList.add(new ModelBox(cube_r22, 0, 11, -2.0F, -1.05F, -0.1F, 4, 1, 2, -0.02F, false));

        this.bone35 = new AdvancedModelRenderer(this);
        this.bone35.setRotationPoint(0.0F, 0.0F, -4.0F);
        this.JAWPARTS.addChild(bone35);
        this.setRotateAngle(bone35, 0.2182F, 0.0F, 0.0F);
        this.bone35.cubeList.add(new ModelBox(bone35, 0, 83, -2.5F, 0.0F, 0.0F, 5, 2, 5, -0.02F, false));

        this.cube_r23 = new AdvancedModelRenderer(this);
        this.cube_r23.setRotationPoint(0.0F, 0.45F, 2.3F);
        this.bone35.addChild(cube_r23);
        this.setRotateAngle(cube_r23, -0.1309F, 0.0F, 0.0F);
        this.cube_r23.cubeList.add(new ModelBox(cube_r23, 98, 25, -2.5F, -0.6F, -2.57F, 5, 1, 5, -0.03F, false));

        this.throat = new AdvancedModelRenderer(this);
        this.throat.setRotationPoint(0.0F, 2.65F, -6.25F);
        this.jaw.addChild(throat);
        this.throat.cubeList.add(new ModelBox(throat, 129, 0, -2.0F, -2.0F, 0.0F, 4, 2, 5, 0.0F, false));

        this.cube_r24 = new AdvancedModelRenderer(this);
        this.cube_r24.setRotationPoint(0.0F, 0.0F, 2.75F);
        this.throat.addChild(cube_r24);
        this.setRotateAngle(cube_r24, -0.4363F, 0.0F, 0.0F);
        this.cube_r24.cubeList.add(new ModelBox(cube_r24, 0, 73, -2.0F, -4.0F, 0.0F, 4, 4, 5, 0.01F, false));

        updateDefaultPose();
        animator = ModelAnimator.create();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        animate((IAnimatedEntity) entity, f, f1, f2, f3, f4, f5);
        this.hips.render(f5);
    }

    public void renderStaticWall(float f) {

        resetToDefaultPose();
    }

    public void renderStaticFloor(float f) {

        resetToDefaultPose();
    }

    @Override
    public void renderStaticBook(float f) {
        //Rotations, positions and sizing:
        this.hips.offsetY = 0.7F;
        this.hips.offsetX = 0.1F;
        this.hips.rotateAngleY = (float)Math.toRadians(210);
        this.hips.rotateAngleX = (float)Math.toRadians(8);
        this.hips.rotateAngleZ = (float)Math.toRadians(-4);
        this.hips.scaleChildren = true;
        float scaler = 0.575F;
        this.hips.setScale(scaler, scaler, scaler);
        //Start of pose:

        //End of pose, now render the model:
        this.hips.render(f);
        //Reset rotations, positions and sizing:
        this.hips.setScale(1.0F, 1.0F, 1.0F);
        this.hips.scaleChildren = false;
        resetToDefaultPose();
    }

    public void setRotateAngle(AdvancedModelRenderer AdvancedModelRenderer, float x, float y, float z) {
        AdvancedModelRenderer.rotateAngleX = x;
        AdvancedModelRenderer.rotateAngleY = y;
        AdvancedModelRenderer.rotateAngleZ = z;
    }

    @Override
    public void faceTarget(float yaw, float pitch, float rotationDivisor, AdvancedModelRenderer... boxes) {
        //Overidden as the model is kinda twisted for some reason
        float actualRotationDivisor = rotationDivisor * (float)boxes.length;
        float yawAmount = yaw / 57.295776F / actualRotationDivisor;
        float pitchAmount = pitch / 57.295776F / actualRotationDivisor;
        AdvancedModelRenderer[] var8 = boxes;
        int var9 = boxes.length;

        for(int var10 = 0; var10 < var9; ++var10) {
            AdvancedModelRenderer box = var8[var10];
            box.rotateAngleZ -= yawAmount; //would normally be Y
            box.rotateAngleY += pitchAmount; //would normally be X
        }

    }

    @Override
    public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
        super.setRotationAngles(f, f1, f2, f3, f4, f5, e);
       // this.Hips.offsetY = 0.04F;
        //this.resetToDefaultPose();

        EntityPrehistoricFloraLusotitan lusotitan = (EntityPrehistoricFloraLusotitan) e;

//        this.faceTarget(f3, f4, 6, neck1);
//        this.faceTarget(f3, f4, 6, neck2);
//        this.faceTarget(f3, f4, 6, neck3);
//        this.faceTarget(f3, f4, 4, neck4);
//        this.faceTarget(f3, f4, 4, neck5);
//        this.faceTarget(f3, f4, 4, head);

        boolean isBaby = lusotitan.getJuvenile();

        if (isBaby) {
            this.neck8.scaleChildren = true;
            this.neck9.scaleChildren = true;
            this.head.scaleChildren = true;
            this.neck8.setScale(1.025F, 1.025F, 1.025F);
            this.neck9.setScale(1.025F, 1.025F, 1.025F);
            this.head.setScale(1.375F, 1.375F, 1.375F);
        }
        else {
            this.neck8.scaleChildren = true;
            this.neck9.scaleChildren = true;
            this.head.scaleChildren = true;
            this.neck8.setScale(1F, 1, 1F);
            this.neck9.setScale(1F, 1, 1F);
            this.head.setScale(1F, 1, 1F);
        }

        AdvancedModelRenderer[] Tail = {this.tail1, this.tail2, this.tail3, this.tail4, this.tail5, this.tail6, this.tail7, this.tail8};
        AdvancedModelRenderer[] Neck = {this.neck1, this.neck2, this.neck3, this.neck4, this.neck5, this.neck6, this.neck7, this.neck8, this.neck9, this.head};
        //AdvancedModelRenderer[] ArmL = {this.leftarm, this.leftarm2, this.leftarm3};
        //AdvancedModelRenderer[] ArmR = {this.rightarm, this.rightarm2, this.rightarm3};

        lusotitan.tailBuffer.applyChainSwingBuffer(Tail);
        float masterSpeed = lusotitan.getTravelSpeed()/2;

        if (!lusotitan.isInWater()) {

            if (f3 == 0.0F || !lusotitan.getIsMoving()) {
                if (lusotitan.getAnimation() != lusotitan.EAT_ANIMATION
                        && lusotitan.getAnimation() != lusotitan.DRINK_ANIMATION
                        && lusotitan.getAnimation() != lusotitan.ATTACK_ANIMATION) {
                    this.chainFlap(Neck, 0.05F, 0.02F, 0.5, f2, 0.8F);
                    this.chainWave(Neck, 0.05F * 2, -0.01F, 0.5F, f2, 0.8F);
                }

                if (lusotitan.getAnimation() != lusotitan.ATTACK_ANIMATION) {
                    this.chainFlap(Tail, (0.15F * 0.1F), 0.05F, 0.2F, f2, 1F);
                    this.chainWave(Tail, (0.15F * 0.1F) * 2F, 0.05F * 0.15F, 0.12F, f2, 1F);
                    this.chainSwing(Tail, (0.15F * 0.1F) * 8F, 0.05F * 0.15F, 0F, f2, 1F);
                }

                return;
            }

            if (lusotitan.getAnimation() != lusotitan.EAT_ANIMATION
                    && lusotitan.getAnimation() != lusotitan.DRINK_ANIMATION
                    && lusotitan.getAnimation() != lusotitan.ATTACK_ANIMATION
                    && lusotitan.getAnimation() != lusotitan.ATTACK_ANIMATION) {
                this.chainFlap(Neck, 0.05F, 0.02F, 0.5, f2, 0.8F);
                this.chainWave(Neck, 0.05F * 2, -0.01F, 0.5F, f2, 0.8F);
                this.chainFlap(Tail, (0.15F * 0.1F), 0.05F, 0.2F, f2, 1F);
                this.chainWave(Tail, (0.15F * 0.1F) * 2F, 0.05F * 0.15F, 0.12F, f2, 1F);
                this.chainSwing(Tail, (0.15F * 0.1F) * 8F, 0.05F * 0.15F, 0F, f2, 1F);
            }

            if (lusotitan.getIsFast()) { //Running
//                    float speed = masterSpeed / 2F;
//                    this.chainFlap(Tail, (speed * 1.2F), 0.1F, 0.5F, f2, 1F);
//                    this.chainWave(Tail, (speed * 0.6F) , 0.05F, 0.12F, f2, 1F);

            } else { //Walking
//                    float speed = masterSpeed / 1.50F;
//                    this.chainFlap(Tail, (speed * 0.5F), 0.1F, 0.2F, f2, 1F);
//                    this.chainWave(Tail, (speed * 0.5F), 0.05F * 0.65F, 0.12F, f2, 1F);
            }
        } else {
            //Swimming pose:
            if (f3 == 0.0F) { //static in water
                return;
            }
            //moving in water
            return;
        }
    }
    


    @Override
    public void setLivingAnimations(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        super.setLivingAnimations(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
        this.resetToDefaultPose();
        EntityPrehistoricFloraLusotitan ee = (EntityPrehistoricFloraLusotitan) entitylivingbaseIn;

        //if (!ee.isInWater()) {
            if (ee.getIsMoving() && ee.getAnimation() != ee.ATTACK_ANIMATION) {
                if (ee.getIsFast()) { //Running
                    animRunning(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
                } else { //Walking
                    animWalking(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
                }
            }
        //}
//        else {
//            //Swimming pose:
//            if (!ee.getIsMoving()) { //static in water
//                //
//            }
//            else {
//                //moving in water
//                //
//            }
//        }
        if (ee.getAnimation() == ee.EAT_ANIMATION) {
            animEat(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.ATTACK_ANIMATION) {
            animAttack(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.MAKE_NEST_ANIMATION) {
            animNest(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.LAY_ANIMATION) {
            animLay(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.DRINK_ANIMATION) { //The drink anim
            animDrink(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.ROAR_ANIMATION) { //The roar anim
            animNoise(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.NOISE_ANIMATION) { //The noise anim
            animNoise(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.LOOK_ANIMATION) { //The leaves grazing anim
            animLook(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }


    }

    public void animDrink(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraLusotitan entity = (EntityPrehistoricFloraLusotitan) entitylivingbaseIn;
        int animCycle = 190;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 80) {
            xx = 0 + (((tickAnim - 0) / 80) * (6.25-(0)));
            yy = 0 + (((tickAnim - 0) / 80) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 80) * (0-(0)));
        }
        else if (tickAnim >= 80 && tickAnim < 120) {
            xx = 6.25 + (((tickAnim - 80) / 40) * (6.25-(6.25)));
            yy = 0 + (((tickAnim - 80) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 80) / 40) * (0-(0)));
        }
        else if (tickAnim >= 120 && tickAnim < 190) {
            xx = 6.25 + (((tickAnim - 120) / 70) * (0-(6.25)));
            yy = 0 + (((tickAnim - 120) / 70) * (0-(0)));
            zz = 0 + (((tickAnim - 120) / 70) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(hips, hips.rotateAngleX + (float) Math.toRadians(xx), hips.rotateAngleY + (float) Math.toRadians(yy), hips.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 80) {
            xx = 0 + (((tickAnim - 0) / 80) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 80) * (0.7-(0)));
            zz = 0 + (((tickAnim - 0) / 80) * (0-(0)));
        }
        else if (tickAnim >= 80 && tickAnim < 120) {
            xx = 0 + (((tickAnim - 80) / 40) * (0-(0)));
            yy = 0.7 + (((tickAnim - 80) / 40) * (0.7-(0.7)));
            zz = 0 + (((tickAnim - 80) / 40) * (0-(0)));
        }
        else if (tickAnim >= 120 && tickAnim < 190) {
            xx = 0 + (((tickAnim - 120) / 70) * (0-(0)));
            yy = 0.7 + (((tickAnim - 120) / 70) * (0-(0.7)));
            zz = 0 + (((tickAnim - 120) / 70) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.hips.rotationPointX = this.hips.rotationPointX + (float)(xx);
        this.hips.rotationPointY = this.hips.rotationPointY - (float)(yy);
        this.hips.rotationPointZ = this.hips.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 80) {
            xx = 0 + (((tickAnim - 0) / 80) * (-3.5-(0)));
            yy = 0 + (((tickAnim - 0) / 80) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 80) * (0-(0)));
        }
        else if (tickAnim >= 80 && tickAnim < 120) {
            xx = -3.5 + (((tickAnim - 80) / 40) * (-3.5-(-3.5)));
            yy = 0 + (((tickAnim - 80) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 80) / 40) * (0-(0)));
        }
        else if (tickAnim >= 120 && tickAnim < 190) {
            xx = -3.5 + (((tickAnim - 120) / 70) * (0-(-3.5)));
            yy = 0 + (((tickAnim - 120) / 70) * (0-(0)));
            zz = 0 + (((tickAnim - 120) / 70) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg, rightLeg.rotateAngleX + (float) Math.toRadians(xx), rightLeg.rotateAngleY + (float) Math.toRadians(yy), rightLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 80) {
            xx = 0 + (((tickAnim - 0) / 80) * (-4.75-(0)));
            yy = 0 + (((tickAnim - 0) / 80) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 80) * (0-(0)));
        }
        else if (tickAnim >= 80 && tickAnim < 120) {
            xx = -4.75 + (((tickAnim - 80) / 40) * (-4.75-(-4.75)));
            yy = 0 + (((tickAnim - 80) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 80) / 40) * (0-(0)));
        }
        else if (tickAnim >= 120 && tickAnim < 190) {
            xx = -4.75 + (((tickAnim - 120) / 70) * (0-(-4.75)));
            yy = 0 + (((tickAnim - 120) / 70) * (0-(0)));
            zz = 0 + (((tickAnim - 120) / 70) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg2, rightLeg2.rotateAngleX + (float) Math.toRadians(xx), rightLeg2.rotateAngleY + (float) Math.toRadians(yy), rightLeg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 80) {
            xx = 0 + (((tickAnim - 0) / 80) * (1.5-(0)));
            yy = 0 + (((tickAnim - 0) / 80) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 80) * (0-(0)));
        }
        else if (tickAnim >= 80 && tickAnim < 120) {
            xx = 1.5 + (((tickAnim - 80) / 40) * (4-(1.5)));
            yy = 0 + (((tickAnim - 80) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 80) / 40) * (0-(0)));
        }
        else if (tickAnim >= 120 && tickAnim < 190) {
            xx = 4 + (((tickAnim - 120) / 70) * (0-(4)));
            yy = 0 + (((tickAnim - 120) / 70) * (0-(0)));
            zz = 0 + (((tickAnim - 120) / 70) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg3, rightLeg3.rotateAngleX + (float) Math.toRadians(xx), rightLeg3.rotateAngleY + (float) Math.toRadians(yy), rightLeg3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 48) {
            xx = 0 + (((tickAnim - 0) / 48) * (-2.25-(0)));
            yy = 0 + (((tickAnim - 0) / 48) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 48) * (0-(0)));
        }
        else if (tickAnim >= 48 && tickAnim < 80) {
            xx = -2.25 + (((tickAnim - 48) / 32) * (17.5-(-2.25)));
            yy = 0 + (((tickAnim - 48) / 32) * (0-(0)));
            zz = 0 + (((tickAnim - 48) / 32) * (0-(0)));
        }
        else if (tickAnim >= 80 && tickAnim < 120) {
            xx = 17.5 + (((tickAnim - 80) / 40) * (17.5-(17.5)));
            yy = 0 + (((tickAnim - 80) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 80) / 40) * (0-(0)));
        }
        else if (tickAnim >= 120 && tickAnim < 157) {
            xx = 17.5 + (((tickAnim - 120) / 37) * (17.5-(17.5)));
            yy = 0 + (((tickAnim - 120) / 37) * (0-(0)));
            zz = 0 + (((tickAnim - 120) / 37) * (0-(0)));
        }
        else if (tickAnim >= 157 && tickAnim < 172) {
            xx = 17.5 + (((tickAnim - 157) / 15) * (-0.25-(17.5)));
            yy = 0 + (((tickAnim - 157) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 157) / 15) * (0-(0)));
        }
        else if (tickAnim >= 172 && tickAnim < 190) {
            xx = -0.25 + (((tickAnim - 172) / 18) * (0-(-0.25)));
            yy = 0 + (((tickAnim - 172) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 172) / 18) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg, leftLeg.rotateAngleX + (float) Math.toRadians(xx), leftLeg.rotateAngleY + (float) Math.toRadians(yy), leftLeg.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 48) {
            xx = 0 + (((tickAnim - 0) / 48) * (0-(0)));
            yy = -0.325 + (((tickAnim - 0) / 48) * (-0.325-(-0.325)));
            zz = 0 + (((tickAnim - 0) / 48) * (0-(0)));
        }
        else if (tickAnim >= 48 && tickAnim < 80) {
            xx = 0 + (((tickAnim - 48) / 32) * (0-(0)));
            yy = -0.325 + (((tickAnim - 48) / 32) * (-1.925-(-0.325)));
            zz = 0 + (((tickAnim - 48) / 32) * (0-(0)));
        }
        else if (tickAnim >= 80 && tickAnim < 120) {
            xx = 0 + (((tickAnim - 80) / 40) * (0-(0)));
            yy = -1.925 + (((tickAnim - 80) / 40) * (-1.925-(-1.925)));
            zz = 0 + (((tickAnim - 80) / 40) * (0-(0)));
        }
        else if (tickAnim >= 120 && tickAnim < 157) {
            xx = 0 + (((tickAnim - 120) / 37) * (0-(0)));
            yy = -1.925 + (((tickAnim - 120) / 37) * (-1.925-(-1.925)));
            zz = 0 + (((tickAnim - 120) / 37) * (0-(0)));
        }
        else if (tickAnim >= 157 && tickAnim < 172) {
            xx = 0 + (((tickAnim - 157) / 15) * (0-(0)));
            yy = -1.925 + (((tickAnim - 157) / 15) * (-0.325-(-1.925)));
            zz = 0 + (((tickAnim - 157) / 15) * (0-(0)));
        }
        else if (tickAnim >= 172 && tickAnim < 190) {
            xx = 0 + (((tickAnim - 172) / 18) * (0-(0)));
            yy = -0.325 + (((tickAnim - 172) / 18) * (-0.325-(-0.325)));
            zz = 0 + (((tickAnim - 172) / 18) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftLeg.rotationPointX = this.leftLeg.rotationPointX + (float)(xx);
        this.leftLeg.rotationPointY = this.leftLeg.rotationPointY - (float)(yy);
        this.leftLeg.rotationPointZ = this.leftLeg.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 48) {
            xx = 0 + (((tickAnim - 0) / 48) * (-4.25-(0)));
            yy = 0 + (((tickAnim - 0) / 48) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 48) * (0-(0)));
        }
        else if (tickAnim >= 48 && tickAnim < 63) {
            xx = -4.25 + (((tickAnim - 48) / 15) * (23.12-(-4.25)));
            yy = 0 + (((tickAnim - 48) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 48) / 15) * (0-(0)));
        }
        else if (tickAnim >= 63 && tickAnim < 80) {
            xx = 23.12 + (((tickAnim - 63) / 17) * (-18.75-(23.12)));
            yy = 0 + (((tickAnim - 63) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 63) / 17) * (0-(0)));
        }
        else if (tickAnim >= 80 && tickAnim < 120) {
            xx = -18.75 + (((tickAnim - 80) / 40) * (-18.75-(-18.75)));
            yy = 0 + (((tickAnim - 80) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 80) / 40) * (0-(0)));
        }
        else if (tickAnim >= 120 && tickAnim < 157) {
            xx = -18.75 + (((tickAnim - 120) / 37) * (-11.5-(-18.75)));
            yy = 0 + (((tickAnim - 120) / 37) * (0-(0)));
            zz = 0 + (((tickAnim - 120) / 37) * (0-(0)));
        }
        else if (tickAnim >= 157 && tickAnim < 165) {
            xx = -11.5 + (((tickAnim - 157) / 8) * (-21.27-(-11.5)));
            yy = 0 + (((tickAnim - 157) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 157) / 8) * (0-(0)));
        }
        else if (tickAnim >= 165 && tickAnim < 172) {
            xx = -21.27 + (((tickAnim - 165) / 7) * (-2.9-(-21.27)));
            yy = 0 + (((tickAnim - 165) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 165) / 7) * (0-(0)));
        }
        else if (tickAnim >= 172 && tickAnim < 190) {
            xx = -2.9 + (((tickAnim - 172) / 18) * (0-(-2.9)));
            yy = 0 + (((tickAnim - 172) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 172) / 18) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg2, leftLeg2.rotateAngleX + (float) Math.toRadians(xx), leftLeg2.rotateAngleY + (float) Math.toRadians(yy), leftLeg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 48) {
            xx = 0 + (((tickAnim - 0) / 48) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 48) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 48) * (0-(0)));
        }
        else if (tickAnim >= 48 && tickAnim < 63) {
            xx = 0 + (((tickAnim - 48) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 48) / 15) * (1.975-(0)));
            zz = 0 + (((tickAnim - 48) / 15) * (0-(0)));
        }
        else if (tickAnim >= 63 && tickAnim < 80) {
            xx = 0 + (((tickAnim - 63) / 17) * (0-(0)));
            yy = 1.975 + (((tickAnim - 63) / 17) * (0-(1.975)));
            zz = 0 + (((tickAnim - 63) / 17) * (0-(0)));
        }
        else if (tickAnim >= 80 && tickAnim < 120) {
            xx = 0 + (((tickAnim - 80) / 40) * (0-(0)));
            yy = 0 + (((tickAnim - 80) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 80) / 40) * (0-(0)));
        }
        else if (tickAnim >= 120 && tickAnim < 157) {
            xx = 0 + (((tickAnim - 120) / 37) * (0-(0)));
            yy = 0 + (((tickAnim - 120) / 37) * (0-(0)));
            zz = 0 + (((tickAnim - 120) / 37) * (0-(0)));
        }
        else if (tickAnim >= 157 && tickAnim < 165) {
            xx = 0 + (((tickAnim - 157) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 157) / 8) * (5.35-(0)));
            zz = 0 + (((tickAnim - 157) / 8) * (0-(0)));
        }
        else if (tickAnim >= 165 && tickAnim < 172) {
            xx = 0 + (((tickAnim - 165) / 7) * (0-(0)));
            yy = 5.35 + (((tickAnim - 165) / 7) * (0.175-(5.35)));
            zz = 0 + (((tickAnim - 165) / 7) * (0-(0)));
        }
        else if (tickAnim >= 172 && tickAnim < 190) {
            xx = 0 + (((tickAnim - 172) / 18) * (0-(0)));
            yy = 0.175 + (((tickAnim - 172) / 18) * (0-(0.175)));
            zz = 0 + (((tickAnim - 172) / 18) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftLeg2.rotationPointX = this.leftLeg2.rotationPointX + (float)(xx);
        this.leftLeg2.rotationPointY = this.leftLeg2.rotationPointY - (float)(yy);
        this.leftLeg2.rotationPointZ = this.leftLeg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 48) {
            xx = 0 + (((tickAnim - 0) / 48) * (4-(0)));
            yy = 0 + (((tickAnim - 0) / 48) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 48) * (0-(0)));
        }
        else if (tickAnim >= 48 && tickAnim < 63) {
            xx = 4 + (((tickAnim - 48) / 15) * (30.21-(4)));
            yy = 0 + (((tickAnim - 48) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 48) / 15) * (0-(0)));
        }
        else if (tickAnim >= 63 && tickAnim < 80) {
            xx = 30.21 + (((tickAnim - 63) / 17) * (-4-(30.21)));
            yy = 0 + (((tickAnim - 63) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 63) / 17) * (0-(0)));
        }
        else if (tickAnim >= 80 && tickAnim < 120) {
            xx = -4 + (((tickAnim - 80) / 40) * (-4-(-4)));
            yy = 0 + (((tickAnim - 80) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 80) / 40) * (0-(0)));
        }
        else if (tickAnim >= 120 && tickAnim < 157) {
            xx = -4 + (((tickAnim - 120) / 37) * (-8-(-4)));
            yy = 0 + (((tickAnim - 120) / 37) * (0-(0)));
            zz = 0 + (((tickAnim - 120) / 37) * (0-(0)));
        }
        else if (tickAnim >= 157 && tickAnim < 165) {
            xx = -8 + (((tickAnim - 157) / 8) * (34.85923-(-8)));
            yy = 0 + (((tickAnim - 157) / 8) * (2.21404-(0)));
            zz = 0 + (((tickAnim - 157) / 8) * (-0.34135-(0)));
        }
        else if (tickAnim >= 165 && tickAnim < 172) {
            xx = 34.85923 + (((tickAnim - 165) / 7) * (1.20777-(34.85923)));
            yy = 2.21404 + (((tickAnim - 165) / 7) * (0.66421-(2.21404)));
            zz = -0.34135 + (((tickAnim - 165) / 7) * (-0.10241-(-0.34135)));
        }
        else if (tickAnim >= 172 && tickAnim < 190) {
            xx = 1.20777 + (((tickAnim - 172) / 18) * (0-(1.20777)));
            yy = 0.66421 + (((tickAnim - 172) / 18) * (0-(0.66421)));
            zz = -0.10241 + (((tickAnim - 172) / 18) * (0-(-0.10241)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg3, leftLeg3.rotateAngleX + (float) Math.toRadians(xx), leftLeg3.rotateAngleY + (float) Math.toRadians(yy), leftLeg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 48 && tickAnim < 80) {
            xx = 0 + (((tickAnim - 48) / 32) * (0-(0)));
            yy = 0 + (((tickAnim - 48) / 32) * (0-(0)));
            zz = 0 + (((tickAnim - 48) / 32) * (0-(0)));
        }
        else if (tickAnim >= 80 && tickAnim < 120) {
            xx = 0 + (((tickAnim - 80) / 40) * (0-(0)));
            yy = 0 + (((tickAnim - 80) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 80) / 40) * (0-(0)));
        }
        else if (tickAnim >= 120 && tickAnim < 157) {
            xx = 0 + (((tickAnim - 120) / 37) * (0-(0)));
            yy = 0 + (((tickAnim - 120) / 37) * (0-(0)));
            zz = 0 + (((tickAnim - 120) / 37) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftLeg3.rotationPointX = this.leftLeg3.rotationPointX + (float)(xx);
        this.leftLeg3.rotationPointY = this.leftLeg3.rotationPointY - (float)(yy);
        this.leftLeg3.rotationPointZ = this.leftLeg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 48) {
            xx = 0 + (((tickAnim - 0) / 48) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 48) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 48) * (0-(0)));
        }
        else if (tickAnim >= 48 && tickAnim < 63) {
            xx = 0 + (((tickAnim - 48) / 15) * (15.09197-(0)));
            yy = 0 + (((tickAnim - 48) / 15) * (12.08175-(0)));
            zz = 0 + (((tickAnim - 48) / 15) * (3.23057-(0)));
        }
        else if (tickAnim >= 63 && tickAnim < 80) {
            xx = 15.09197 + (((tickAnim - 63) / 17) * (0-(15.09197)));
            yy = 12.08175 + (((tickAnim - 63) / 17) * (0-(12.08175)));
            zz = 3.23057 + (((tickAnim - 63) / 17) * (0-(3.23057)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg4, leftLeg4.rotateAngleX + (float) Math.toRadians(xx), leftLeg4.rotateAngleY + (float) Math.toRadians(yy), leftLeg4.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 48) {
            xx = 0 + (((tickAnim - 0) / 48) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 48) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 48) * (0-(0)));
        }
        else if (tickAnim >= 48 && tickAnim < 63) {
            xx = 0 + (((tickAnim - 48) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 48) / 15) * (-0.325-(0)));
            zz = 0 + (((tickAnim - 48) / 15) * (0.65-(0)));
        }
        else if (tickAnim >= 63 && tickAnim < 80) {
            xx = 0 + (((tickAnim - 63) / 17) * (0-(0)));
            yy = -0.325 + (((tickAnim - 63) / 17) * (0-(-0.325)));
            zz = 0.65 + (((tickAnim - 63) / 17) * (0-(0.65)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftLeg4.rotationPointX = this.leftLeg4.rotationPointX + (float)(xx);
        this.leftLeg4.rotationPointY = this.leftLeg4.rotationPointY - (float)(yy);
        this.leftLeg4.rotationPointZ = this.leftLeg4.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 120) {
            xx = 0 + (((tickAnim - 0) / 120) * (-1.25-(0)));
            yy = 0 + (((tickAnim - 0) / 120) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 120) * (0-(0)));
        }
        else if (tickAnim >= 120 && tickAnim < 190) {
            xx = -1.25 + (((tickAnim - 120) / 70) * (0-(-1.25)));
            yy = 0 + (((tickAnim - 120) / 70) * (0-(0)));
            zz = 0 + (((tickAnim - 120) / 70) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(xx), tail4.rotateAngleY + (float) Math.toRadians(yy), tail4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 120) {
            xx = 0 + (((tickAnim - 0) / 120) * (-1.5-(0)));
            yy = 0 + (((tickAnim - 0) / 120) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 120) * (0-(0)));
        }
        else if (tickAnim >= 120 && tickAnim < 190) {
            xx = -1.5 + (((tickAnim - 120) / 70) * (0-(-1.5)));
            yy = 0 + (((tickAnim - 120) / 70) * (0-(0)));
            zz = 0 + (((tickAnim - 120) / 70) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail5, tail5.rotateAngleX + (float) Math.toRadians(xx), tail5.rotateAngleY + (float) Math.toRadians(yy), tail5.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 120) {
            xx = 0 + (((tickAnim - 0) / 120) * (-2.46168-(0)));
            yy = 0 + (((tickAnim - 0) / 120) * (-0.27574-(0)));
            zz = 0 + (((tickAnim - 0) / 120) * (-0.33196-(0)));
        }
        else if (tickAnim >= 120 && tickAnim < 190) {
            xx = -2.46168 + (((tickAnim - 120) / 70) * (0-(-2.46168)));
            yy = -0.27574 + (((tickAnim - 120) / 70) * (0-(-0.27574)));
            zz = -0.33196 + (((tickAnim - 120) / 70) * (0-(-0.33196)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail6, tail6.rotateAngleX + (float) Math.toRadians(xx), tail6.rotateAngleY + (float) Math.toRadians(yy), tail6.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 120) {
            xx = 0 + (((tickAnim - 0) / 120) * (-5-(0)));
            yy = 0 + (((tickAnim - 0) / 120) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 120) * (0-(0)));
        }
        else if (tickAnim >= 120 && tickAnim < 190) {
            xx = -5 + (((tickAnim - 120) / 70) * (0-(-5)));
            yy = 0 + (((tickAnim - 120) / 70) * (0-(0)));
            zz = 0 + (((tickAnim - 120) / 70) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail7, tail7.rotateAngleX + (float) Math.toRadians(xx), tail7.rotateAngleY + (float) Math.toRadians(yy), tail7.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 80) {
            xx = 0 + (((tickAnim - 0) / 80) * (18.75-(0)));
            yy = 0 + (((tickAnim - 0) / 80) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 80) * (0-(0)));
        }
        else if (tickAnim >= 80 && tickAnim < 120) {
            xx = 18.75 + (((tickAnim - 80) / 40) * (18.75-(18.75)));
            yy = 0 + (((tickAnim - 80) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 80) / 40) * (0-(0)));
        }
        else if (tickAnim >= 120 && tickAnim < 140) {
            xx = 18.75 + (((tickAnim - 120) / 20) * (20.89-(18.75)));
            yy = 0 + (((tickAnim - 120) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 120) / 20) * (0-(0)));
        }
        else if (tickAnim >= 140 && tickAnim < 190) {
            xx = 20.89 + (((tickAnim - 140) / 50) * (0-(20.89)));
            yy = 0 + (((tickAnim - 140) / 50) * (0-(0)));
            zz = 0 + (((tickAnim - 140) / 50) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(xx), body.rotateAngleY + (float) Math.toRadians(yy), body.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 80) {
            xx = 0 + (((tickAnim - 0) / 80) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 80) * (1.675-(0)));
            zz = 0 + (((tickAnim - 0) / 80) * (2.25-(0)));
        }
        else if (tickAnim >= 80 && tickAnim < 120) {
            xx = 0 + (((tickAnim - 80) / 40) * (0-(0)));
            yy = 1.675 + (((tickAnim - 80) / 40) * (1.675-(1.675)));
            zz = 2.25 + (((tickAnim - 80) / 40) * (2.25-(2.25)));
        }
        else if (tickAnim >= 120 && tickAnim < 190) {
            xx = 0 + (((tickAnim - 120) / 70) * (0-(0)));
            yy = 1.675 + (((tickAnim - 120) / 70) * (0-(1.675)));
            zz = 2.25 + (((tickAnim - 120) / 70) * (0-(2.25)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.body.rotationPointX = this.body.rotationPointX + (float)(xx);
        this.body.rotationPointY = this.body.rotationPointY - (float)(yy);
        this.body.rotationPointZ = this.body.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 80) {
            xx = 0 + (((tickAnim - 0) / 80) * (10.75-(0)));
            yy = 0 + (((tickAnim - 0) / 80) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 80) * (0-(0)));
        }
        else if (tickAnim >= 80 && tickAnim < 120) {
            xx = 10.75 + (((tickAnim - 80) / 40) * (10.75-(10.75)));
            yy = 0 + (((tickAnim - 80) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 80) / 40) * (0-(0)));
        }
        else if (tickAnim >= 120 && tickAnim < 140) {
            xx = 10.75 + (((tickAnim - 120) / 20) * (0.18-(10.75)));
            yy = 0 + (((tickAnim - 120) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 120) / 20) * (0-(0)));
        }
        else if (tickAnim >= 140 && tickAnim < 190) {
            xx = 0.18 + (((tickAnim - 140) / 50) * (0-(0.18)));
            yy = 0 + (((tickAnim - 140) / 50) * (0-(0)));
            zz = 0 + (((tickAnim - 140) / 50) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(xx), chest.rotateAngleY + (float) Math.toRadians(yy), chest.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 80) {
            xx = 0 + (((tickAnim - 0) / 80) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 80) * (1.1-(0)));
            zz = 0 + (((tickAnim - 0) / 80) * (0.65-(0)));
        }
        else if (tickAnim >= 80 && tickAnim < 120) {
            xx = 0 + (((tickAnim - 80) / 40) * (0-(0)));
            yy = 1.1 + (((tickAnim - 80) / 40) * (1.1-(1.1)));
            zz = 0.65 + (((tickAnim - 80) / 40) * (0.65-(0.65)));
        }
        else if (tickAnim >= 120 && tickAnim < 190) {
            xx = 0 + (((tickAnim - 120) / 70) * (0-(0)));
            yy = 1.1 + (((tickAnim - 120) / 70) * (0-(1.1)));
            zz = 0.65 + (((tickAnim - 120) / 70) * (0-(0.65)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.chest.rotationPointX = this.chest.rotationPointX + (float)(xx);
        this.chest.rotationPointY = this.chest.rotationPointY - (float)(yy);
        this.chest.rotationPointZ = this.chest.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (-8.66527-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (-2.63145-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (-10.0697-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = -8.66527 + (((tickAnim - 10) / 10) * (-7.33054-(-8.66527)));
            yy = -2.63145 + (((tickAnim - 10) / 10) * (-5.2629-(-2.63145)));
            zz = -10.0697 + (((tickAnim - 10) / 10) * (-20.13939-(-10.0697)));
        }
        else if (tickAnim >= 20 && tickAnim < 80) {
            xx = -7.33054 + (((tickAnim - 20) / 60) * (-42.0692-(-7.33054)));
            yy = -5.2629 + (((tickAnim - 20) / 60) * (-12.29628-(-5.2629)));
            zz = -20.13939 + (((tickAnim - 20) / 60) * (-11.23604-(-20.13939)));
        }
        else if (tickAnim >= 80 && tickAnim < 120) {
            xx = -42.0692 + (((tickAnim - 80) / 40) * (-42.0692-(-42.0692)));
            yy = -12.29628 + (((tickAnim - 80) / 40) * (-12.29628-(-12.29628)));
            zz = -11.23604 + (((tickAnim - 80) / 40) * (-11.23604-(-11.23604)));
        }
        else if (tickAnim >= 120 && tickAnim < 140) {
            xx = -42.0692 + (((tickAnim - 120) / 20) * (-33.20373-(-42.0692)));
            yy = -12.29628 + (((tickAnim - 120) / 20) * (-8.97379-(-12.29628)));
            zz = -11.23604 + (((tickAnim - 120) / 20) * (-11.7357-(-11.23604)));
        }
        else if (tickAnim >= 140 && tickAnim < 148) {
            xx = -33.20373 + (((tickAnim - 140) / 8) * (-19.65143-(-33.20373)));
            yy = -8.97379 + (((tickAnim - 140) / 8) * (-5.13396-(-8.97379)));
            zz = -11.7357 + (((tickAnim - 140) / 8) * (-13.35205-(-11.7357)));
        }
        else if (tickAnim >= 148 && tickAnim < 157) {
            xx = -19.65143 + (((tickAnim - 148) / 9) * (-17.25-(-19.65143)));
            yy = -5.13396 + (((tickAnim - 148) / 9) * (0-(-5.13396)));
            zz = -13.35205 + (((tickAnim - 148) / 9) * (0-(-13.35205)));
        }
        else if (tickAnim >= 157 && tickAnim < 190) {
            xx = -17.25 + (((tickAnim - 157) / 33) * (0-(-17.25)));
            yy = 0 + (((tickAnim - 157) / 33) * (0-(0)));
            zz = 0 + (((tickAnim - 157) / 33) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm, leftArm.rotateAngleX + (float) Math.toRadians(xx), leftArm.rotateAngleY + (float) Math.toRadians(yy), leftArm.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (-0.875-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            yy = -0.875 + (((tickAnim - 10) / 10) * (-2.875-(-0.875)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 22) {
            xx = 0 + (((tickAnim - 20) / 2) * (0-(0)));
            yy = -2.875 + (((tickAnim - 20) / 2) * (-2.29-(-2.875)));
            zz = 0 + (((tickAnim - 20) / 2) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 22) / 1) * (0-(0)));
            yy = -2.29 + (((tickAnim - 22) / 1) * (-1.8-(-2.29)));
            zz = 0 + (((tickAnim - 22) / 1) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 23) / 2) * (0-(0)));
            yy = -1.8 + (((tickAnim - 23) / 2) * (-1.515-(-1.8)));
            zz = 0 + (((tickAnim - 23) / 2) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 27) {
            xx = 0 + (((tickAnim - 25) / 2) * (0-(0)));
            yy = -1.515 + (((tickAnim - 25) / 2) * (-1.525-(-1.515)));
            zz = 0 + (((tickAnim - 25) / 2) * (0-(0)));
        }
        else if (tickAnim >= 27 && tickAnim < 80) {
            xx = 0 + (((tickAnim - 27) / 53) * (0-(0)));
            yy = -1.525 + (((tickAnim - 27) / 53) * (7.1-(-1.525)));
            zz = 0 + (((tickAnim - 27) / 53) * (-1.025-(0)));
        }
        else if (tickAnim >= 80 && tickAnim < 120) {
            xx = 0 + (((tickAnim - 80) / 40) * (0-(0)));
            yy = 7.1 + (((tickAnim - 80) / 40) * (7.1-(7.1)));
            zz = -1.025 + (((tickAnim - 80) / 40) * (-1.025-(-1.025)));
        }
        else if (tickAnim >= 120 && tickAnim < 140) {
            xx = 0 + (((tickAnim - 120) / 20) * (0-(0)));
            yy = 7.1 + (((tickAnim - 120) / 20) * (6.36-(7.1)));
            zz = -1.025 + (((tickAnim - 120) / 20) * (0-(-1.025)));
        }
        else if (tickAnim >= 140 && tickAnim < 157) {
            xx = 0 + (((tickAnim - 140) / 17) * (0-(0)));
            yy = 6.36 + (((tickAnim - 140) / 17) * (11.75-(6.36)));
            zz = 0 + (((tickAnim - 140) / 17) * (0-(0)));
        }
        else if (tickAnim >= 157 && tickAnim < 190) {
            xx = 0 + (((tickAnim - 157) / 33) * (0-(0)));
            yy = 11.75 + (((tickAnim - 157) / 33) * (0-(11.75)));
            zz = 0 + (((tickAnim - 157) / 33) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftArm.rotationPointX = this.leftArm.rotationPointX + (float)(xx);
        this.leftArm.rotationPointY = this.leftArm.rotationPointY - (float)(yy);
        this.leftArm.rotationPointZ = this.leftArm.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (-19.50315-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (-5.97085-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (11.85467-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = -19.50315 + (((tickAnim - 10) / 10) * (-24.4756-(-19.50315)));
            yy = -5.97085 + (((tickAnim - 10) / 10) * (8.32854-(-5.97085)));
            zz = 11.85467 + (((tickAnim - 10) / 10) * (18.95711-(11.85467)));
        }
        else if (tickAnim >= 20 && tickAnim < 80) {
            xx = -24.4756 + (((tickAnim - 20) / 60) * (-31.24006-(-24.4756)));
            yy = 8.32854 + (((tickAnim - 20) / 60) * (0.11574-(8.32854)));
            zz = 18.95711 + (((tickAnim - 20) / 60) * (11.99584-(18.95711)));
        }
        else if (tickAnim >= 80 && tickAnim < 120) {
            xx = -31.24006 + (((tickAnim - 80) / 40) * (-31.24006-(-31.24006)));
            yy = 0.11574 + (((tickAnim - 80) / 40) * (0.11574-(0.11574)));
            zz = 11.99584 + (((tickAnim - 80) / 40) * (11.99584-(11.99584)));
        }
        else if (tickAnim >= 120 && tickAnim < 140) {
            xx = -31.24006 + (((tickAnim - 120) / 20) * (-14.23634-(-31.24006)));
            yy = 0.11574 + (((tickAnim - 120) / 20) * (-0.86875-(0.11574)));
            zz = 11.99584 + (((tickAnim - 120) / 20) * (12.94847-(11.99584)));
        }
        else if (tickAnim >= 140 && tickAnim < 148) {
            xx = -14.23634 + (((tickAnim - 140) / 8) * (-20.63161-(-14.23634)));
            yy = -0.86875 + (((tickAnim - 140) / 8) * (2.21077-(-0.86875)));
            zz = 12.94847 + (((tickAnim - 140) / 8) * (16.67196-(12.94847)));
        }
        else if (tickAnim >= 148 && tickAnim < 157) {
            xx = -20.63161 + (((tickAnim - 148) / 9) * (0-(-20.63161)));
            yy = 2.21077 + (((tickAnim - 148) / 9) * (0-(2.21077)));
            zz = 16.67196 + (((tickAnim - 148) / 9) * (0-(16.67196)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm2, leftArm2.rotateAngleX + (float) Math.toRadians(xx), leftArm2.rotateAngleY + (float) Math.toRadians(yy), leftArm2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (1-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 80) {
            xx = 0 + (((tickAnim - 10) / 70) * (0-(0)));
            yy = 1 + (((tickAnim - 10) / 70) * (2.695-(1)));
            zz = 0 + (((tickAnim - 10) / 70) * (0-(0)));
        }
        else if (tickAnim >= 80 && tickAnim < 120) {
            xx = 0 + (((tickAnim - 80) / 40) * (0-(0)));
            yy = 2.695 + (((tickAnim - 80) / 40) * (2.695-(2.695)));
            zz = 0 + (((tickAnim - 80) / 40) * (0-(0)));
        }
        else if (tickAnim >= 120 && tickAnim < 140) {
            xx = 0 + (((tickAnim - 120) / 20) * (0-(0)));
            yy = 2.695 + (((tickAnim - 120) / 20) * (4.8-(2.695)));
            zz = 0 + (((tickAnim - 120) / 20) * (0-(0)));
        }
        else if (tickAnim >= 140 && tickAnim < 157) {
            xx = 0 + (((tickAnim - 140) / 17) * (0-(0)));
            yy = 4.8 + (((tickAnim - 140) / 17) * (0-(4.8)));
            zz = 0 + (((tickAnim - 140) / 17) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftArm2.rotationPointX = this.leftArm2.rotationPointX + (float)(xx);
        this.leftArm2.rotationPointY = this.leftArm2.rotationPointY - (float)(yy);
        this.leftArm2.rotationPointZ = this.leftArm2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (49-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 49 + (((tickAnim - 10) / 10) * (25.5-(49)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 80) {
            xx = 25.5 + (((tickAnim - 20) / 60) * (42.1812-(25.5)));
            yy = 0 + (((tickAnim - 20) / 60) * (-4.06086-(0)));
            zz = 0 + (((tickAnim - 20) / 60) * (1.94055-(0)));
        }
        else if (tickAnim >= 80 && tickAnim < 120) {
            xx = 42.1812 + (((tickAnim - 80) / 40) * (42.1812-(42.1812)));
            yy = -4.06086 + (((tickAnim - 80) / 40) * (-4.06086-(-4.06086)));
            zz = 1.94055 + (((tickAnim - 80) / 40) * (1.94055-(1.94055)));
        }
        else if (tickAnim >= 120 && tickAnim < 140) {
            xx = 42.1812 + (((tickAnim - 120) / 20) * (24-(42.1812)));
            yy = -4.06086 + (((tickAnim - 120) / 20) * (0-(-4.06086)));
            zz = 1.94055 + (((tickAnim - 120) / 20) * (0-(1.94055)));
        }
        else if (tickAnim >= 140 && tickAnim < 148) {
            xx = 24 + (((tickAnim - 140) / 8) * (49.86-(24)));
            yy = 0 + (((tickAnim - 140) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 140) / 8) * (0-(0)));
        }
        else if (tickAnim >= 148 && tickAnim < 157) {
            xx = 49.86 + (((tickAnim - 148) / 9) * (0-(49.86)));
            yy = 0 + (((tickAnim - 148) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 148) / 9) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm3, leftArm3.rotateAngleX + (float) Math.toRadians(xx), leftArm3.rotateAngleY + (float) Math.toRadians(yy), leftArm3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (-8.25-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = -8.25 + (((tickAnim - 20) / 10) * (-21.62985-(-8.25)));
            yy = 0 + (((tickAnim - 20) / 10) * (11.09116-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (9.83778-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = -21.62985 + (((tickAnim - 30) / 10) * (-40.59112-(-21.62985)));
            yy = 11.09116 + (((tickAnim - 30) / 10) * (13.91564-(11.09116)));
            zz = 9.83778 + (((tickAnim - 30) / 10) * (15.54709-(9.83778)));
        }
        else if (tickAnim >= 40 && tickAnim < 80) {
            xx = -40.59112 + (((tickAnim - 40) / 40) * (-48.34112-(-40.59112)));
            yy = 13.91564 + (((tickAnim - 40) / 40) * (13.91564-(13.91564)));
            zz = 15.54709 + (((tickAnim - 40) / 40) * (15.54709-(15.54709)));
        }
        else if (tickAnim >= 80 && tickAnim < 120) {
            xx = -48.34112 + (((tickAnim - 80) / 40) * (-48.34112-(-48.34112)));
            yy = 13.91564 + (((tickAnim - 80) / 40) * (13.91564-(13.91564)));
            zz = 15.54709 + (((tickAnim - 80) / 40) * (15.54709-(15.54709)));
        }
        else if (tickAnim >= 120 && tickAnim < 130) {
            xx = -48.34112 + (((tickAnim - 120) / 10) * (-33.27088-(-48.34112)));
            yy = 13.91564 + (((tickAnim - 120) / 10) * (3.33577-(13.91564)));
            zz = 15.54709 + (((tickAnim - 120) / 10) * (12.33981-(15.54709)));
        }
        else if (tickAnim >= 130 && tickAnim < 140) {
            xx = -33.27088 + (((tickAnim - 130) / 10) * (-23.75-(-33.27088)));
            yy = 3.33577 + (((tickAnim - 130) / 10) * (0-(3.33577)));
            zz = 12.33981 + (((tickAnim - 130) / 10) * (0-(12.33981)));
        }
        else if (tickAnim >= 140 && tickAnim < 190) {
            xx = -23.75 + (((tickAnim - 140) / 50) * (0-(-23.75)));
            yy = 0 + (((tickAnim - 140) / 50) * (0-(0)));
            zz = 0 + (((tickAnim - 140) / 50) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm, rightArm.rotateAngleX + (float) Math.toRadians(xx), rightArm.rotateAngleY + (float) Math.toRadians(yy), rightArm.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (5.785-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            yy = 5.785 + (((tickAnim - 20) / 10) * (5.32-(5.785)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 30) / 10) * (0-(0)));
            yy = 5.32 + (((tickAnim - 30) / 10) * (2.475-(5.32)));
            zz = 0 + (((tickAnim - 30) / 10) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 42) {
            xx = 0 + (((tickAnim - 40) / 2) * (0-(0)));
            yy = 2.475 + (((tickAnim - 40) / 2) * (2.615-(2.475)));
            zz = 0 + (((tickAnim - 40) / 2) * (-0.24-(0)));
        }
        else if (tickAnim >= 42 && tickAnim < 43) {
            xx = 0 + (((tickAnim - 42) / 1) * (0-(0)));
            yy = 2.615 + (((tickAnim - 42) / 1) * (3.33-(2.615)));
            zz = -0.24 + (((tickAnim - 42) / 1) * (-0.48-(-0.24)));
        }
        else if (tickAnim >= 43 && tickAnim < 45) {
            xx = 0 + (((tickAnim - 43) / 2) * (0-(0)));
            yy = 3.33 + (((tickAnim - 43) / 2) * (3.555-(3.33)));
            zz = -0.48 + (((tickAnim - 43) / 2) * (-0.72-(-0.48)));
        }
        else if (tickAnim >= 45 && tickAnim < 47) {
            xx = 0 + (((tickAnim - 45) / 2) * (0-(0)));
            yy = 3.555 + (((tickAnim - 45) / 2) * (3.995-(3.555)));
            zz = -0.72 + (((tickAnim - 45) / 2) * (-0.95-(-0.72)));
        }
        else if (tickAnim >= 47 && tickAnim < 80) {
            xx = 0 + (((tickAnim - 47) / 33) * (0-(0)));
            yy = 3.995 + (((tickAnim - 47) / 33) * (11.125-(3.995)));
            zz = -0.95 + (((tickAnim - 47) / 33) * (-5.65-(-0.95)));
        }
        else if (tickAnim >= 80 && tickAnim < 120) {
            xx = 0 + (((tickAnim - 80) / 40) * (0-(0)));
            yy = 11.125 + (((tickAnim - 80) / 40) * (11.125-(11.125)));
            zz = -5.65 + (((tickAnim - 80) / 40) * (-5.65-(-5.65)));
        }
        else if (tickAnim >= 120 && tickAnim < 130) {
            xx = 0 + (((tickAnim - 120) / 10) * (0-(0)));
            yy = 11.125 + (((tickAnim - 120) / 10) * (18.25-(11.125)));
            zz = -5.65 + (((tickAnim - 120) / 10) * (0-(-5.65)));
        }
        else if (tickAnim >= 130 && tickAnim < 140) {
            xx = 0 + (((tickAnim - 130) / 10) * (0-(0)));
            yy = 18.25 + (((tickAnim - 130) / 10) * (16.775-(18.25)));
            zz = 0 + (((tickAnim - 130) / 10) * (0-(0)));
        }
        else if (tickAnim >= 140 && tickAnim < 190) {
            xx = 0 + (((tickAnim - 140) / 50) * (0-(0)));
            yy = 16.775 + (((tickAnim - 140) / 50) * (0-(16.775)));
            zz = 0 + (((tickAnim - 140) / 50) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightArm.rotationPointX = this.rightArm.rotationPointX + (float)(xx);
        this.rightArm.rotationPointY = this.rightArm.rotationPointY - (float)(yy);
        this.rightArm.rotationPointZ = this.rightArm.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 20) / 10) * (-9.89182-(0)));
            yy = 0 + (((tickAnim - 20) / 10) * (5.88873-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (-14.25674-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = -9.89182 + (((tickAnim - 30) / 10) * (-3.24284-(-9.89182)));
            yy = 5.88873 + (((tickAnim - 30) / 10) * (-5.17504-(5.88873)));
            zz = -14.25674 + (((tickAnim - 30) / 10) * (-17.70737-(-14.25674)));
        }
        else if (tickAnim >= 40 && tickAnim < 80) {
            xx = -3.24284 + (((tickAnim - 40) / 40) * (-29.71715-(-3.24284)));
            yy = -5.17504 + (((tickAnim - 40) / 40) * (-4.20264-(-5.17504)));
            zz = -17.70737 + (((tickAnim - 40) / 40) * (-17.08704-(-17.70737)));
        }
        else if (tickAnim >= 80 && tickAnim < 120) {
            xx = -29.71715 + (((tickAnim - 80) / 40) * (-29.71715-(-29.71715)));
            yy = -4.20264 + (((tickAnim - 80) / 40) * (-4.20264-(-4.20264)));
            zz = -17.08704 + (((tickAnim - 80) / 40) * (-17.08704-(-17.08704)));
        }
        else if (tickAnim >= 120 && tickAnim < 130) {
            xx = -29.71715 + (((tickAnim - 120) / 10) * (-15.69522-(-29.71715)));
            yy = -4.20264 + (((tickAnim - 120) / 10) * (-9.55078-(-4.20264)));
            zz = -17.08704 + (((tickAnim - 120) / 10) * (-11.97888-(-17.08704)));
        }
        else if (tickAnim >= 130 && tickAnim < 140) {
            xx = -15.69522 + (((tickAnim - 130) / 10) * (-6.25-(-15.69522)));
            yy = -9.55078 + (((tickAnim - 130) / 10) * (0-(-9.55078)));
            zz = -11.97888 + (((tickAnim - 130) / 10) * (0-(-11.97888)));
        }
        else if (tickAnim >= 140 && tickAnim < 190) {
            xx = -6.25 + (((tickAnim - 140) / 50) * (0-(-6.25)));
            yy = 0 + (((tickAnim - 140) / 50) * (0-(0)));
            zz = 0 + (((tickAnim - 140) / 50) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm2, rightArm2.rotateAngleX + (float) Math.toRadians(xx), rightArm2.rotateAngleY + (float) Math.toRadians(yy), rightArm2.rotateAngleZ + (float) Math.toRadians(zz));

        this.rightArm2.rotationPointX = this.rightArm2.rotationPointX + (float)(0);
        this.rightArm2.rotationPointY = this.rightArm2.rotationPointY - (float)(0);
        this.rightArm2.rotationPointZ = this.rightArm2.rotationPointZ + (float)(0);



        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 20) / 10) * (54.5-(0)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 38) {
            xx = 54.5 + (((tickAnim - 30) / 8) * (19.19311-(54.5)));
            yy = 0 + (((tickAnim - 30) / 8) * (2.5448-(0)));
            zz = 0 + (((tickAnim - 30) / 8) * (-1.92053-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 40) {
            xx = 19.19311 + (((tickAnim - 38) / 2) * (27.42414-(19.19311)));
            yy = 2.5448 + (((tickAnim - 38) / 2) * (3.39307-(2.5448)));
            zz = -1.92053 + (((tickAnim - 38) / 2) * (-2.56071-(-1.92053)));
        }
        else if (tickAnim >= 40 && tickAnim < 80) {
            xx = 27.42414 + (((tickAnim - 40) / 40) * (43.41634-(27.42414)));
            yy = 3.39307 + (((tickAnim - 40) / 40) * (4.15332-(3.39307)));
            zz = -2.56071 + (((tickAnim - 40) / 40) * (-2.30689-(-2.56071)));
        }
        else if (tickAnim >= 80 && tickAnim < 120) {
            xx = 43.41634 + (((tickAnim - 80) / 40) * (43.41634-(43.41634)));
            yy = 4.15332 + (((tickAnim - 80) / 40) * (4.15332-(4.15332)));
            zz = -2.30689 + (((tickAnim - 80) / 40) * (-2.30689-(-2.30689)));
        }
        else if (tickAnim >= 120 && tickAnim < 130) {
            xx = 43.41634 + (((tickAnim - 120) / 10) * (41.75-(43.41634)));
            yy = 4.15332 + (((tickAnim - 120) / 10) * (0-(4.15332)));
            zz = -2.30689 + (((tickAnim - 120) / 10) * (0-(-2.30689)));
        }
        else if (tickAnim >= 130 && tickAnim < 140) {
            xx = 41.75 + (((tickAnim - 130) / 10) * (7-(41.75)));
            yy = 0 + (((tickAnim - 130) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 130) / 10) * (0-(0)));
        }
        else if (tickAnim >= 140 && tickAnim < 190) {
            xx = 7 + (((tickAnim - 140) / 50) * (0-(7)));
            yy = 0 + (((tickAnim - 140) / 50) * (0-(0)));
            zz = 0 + (((tickAnim - 140) / 50) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm3, rightArm3.rotateAngleX + (float) Math.toRadians(xx), rightArm3.rotateAngleY + (float) Math.toRadians(yy), rightArm3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 0) / 50) * (15.57-(0)));
            yy = 0 + (((tickAnim - 0) / 50) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 50) * (0-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 80) {
            xx = 15.57 + (((tickAnim - 50) / 30) * (11.25-(15.57)));
            yy = 0 + (((tickAnim - 50) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 50) / 30) * (0-(0)));
        }
        else if (tickAnim >= 80 && tickAnim < 120) {
            xx = 11.25 + (((tickAnim - 80) / 40) * (13.73508-(11.25)));
            yy = 0 + (((tickAnim - 80) / 40) * (-0.39606-(0)));
            zz = 0 + (((tickAnim - 80) / 40) * (-0.01082-(0)));
        }
        else if (tickAnim >= 120 && tickAnim < 190) {
            xx = 13.73508 + (((tickAnim - 120) / 70) * (0-(13.73508)));
            yy = -0.39606 + (((tickAnim - 120) / 70) * (0-(-0.39606)));
            zz = -0.01082 + (((tickAnim - 120) / 70) * (0-(-0.01082)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck1, neck1.rotateAngleX + (float) Math.toRadians(xx), neck1.rotateAngleY + (float) Math.toRadians(yy), neck1.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 0) / 50) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 50) * (-1.885-(0)));
            zz = 0 + (((tickAnim - 0) / 50) * (1.68-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 80) {
            xx = 0 + (((tickAnim - 50) / 30) * (0-(0)));
            yy = -1.885 + (((tickAnim - 50) / 30) * (-1.975-(-1.885)));
            zz = 1.68 + (((tickAnim - 50) / 30) * (2.35-(1.68)));
        }
        else if (tickAnim >= 80 && tickAnim < 120) {
            xx = 0 + (((tickAnim - 80) / 40) * (0-(0)));
            yy = -1.975 + (((tickAnim - 80) / 40) * (-1.975-(-1.975)));
            zz = 2.35 + (((tickAnim - 80) / 40) * (2.35-(2.35)));
        }
        else if (tickAnim >= 120 && tickAnim < 190) {
            xx = 0 + (((tickAnim - 120) / 70) * (0-(0)));
            yy = -1.975 + (((tickAnim - 120) / 70) * (0-(-1.975)));
            zz = 2.35 + (((tickAnim - 120) / 70) * (0-(2.35)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.neck1.rotationPointX = this.neck1.rotationPointX + (float)(xx);
        this.neck1.rotationPointY = this.neck1.rotationPointY - (float)(yy);
        this.neck1.rotationPointZ = this.neck1.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 80) {
            xx = 0 + (((tickAnim - 0) / 80) * (20.21148-(0)));
            yy = 0 + (((tickAnim - 0) / 80) * (-0.42981-(0)));
            zz = 0 + (((tickAnim - 0) / 80) * (0.46761-(0)));
        }
        else if (tickAnim >= 80 && tickAnim < 120) {
            xx = 20.21148 + (((tickAnim - 80) / 40) * (17.46148-(20.21148)));
            yy = -0.42981 + (((tickAnim - 80) / 40) * (-0.42981-(-0.42981)));
            zz = 0.46761 + (((tickAnim - 80) / 40) * (0.46761-(0.46761)));
        }
        else if (tickAnim >= 120 && tickAnim < 190) {
            xx = 17.46148 + (((tickAnim - 120) / 70) * (0-(17.46148)));
            yy = -0.42981 + (((tickAnim - 120) / 70) * (0-(-0.42981)));
            zz = 0.46761 + (((tickAnim - 120) / 70) * (0-(0.46761)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(xx), neck2.rotateAngleY + (float) Math.toRadians(yy), neck2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 80) {
            xx = 0 + (((tickAnim - 0) / 80) * (18.25-(0)));
            yy = 0 + (((tickAnim - 0) / 80) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 80) * (0-(0)));
        }
        else if (tickAnim >= 80 && tickAnim < 120) {
            xx = 18.25 + (((tickAnim - 80) / 40) * (21.25-(18.25)));
            yy = 0 + (((tickAnim - 80) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 80) / 40) * (0-(0)));
        }
        else if (tickAnim >= 120 && tickAnim < 190) {
            xx = 21.25 + (((tickAnim - 120) / 70) * (0-(21.25)));
            yy = 0 + (((tickAnim - 120) / 70) * (0-(0)));
            zz = 0 + (((tickAnim - 120) / 70) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(xx), neck3.rotateAngleY + (float) Math.toRadians(yy), neck3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 80) {
            xx = 0 + (((tickAnim - 0) / 80) * (21.75-(0)));
            yy = 0 + (((tickAnim - 0) / 80) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 80) * (0-(0)));
        }
        else if (tickAnim >= 80 && tickAnim < 120) {
            xx = 21.75 + (((tickAnim - 80) / 40) * (17-(21.75)));
            yy = 0 + (((tickAnim - 80) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 80) / 40) * (0-(0)));
        }
        else if (tickAnim >= 120 && tickAnim < 190) {
            xx = 17 + (((tickAnim - 120) / 70) * (0-(17)));
            yy = 0 + (((tickAnim - 120) / 70) * (0-(0)));
            zz = 0 + (((tickAnim - 120) / 70) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck4, neck4.rotateAngleX + (float) Math.toRadians(xx), neck4.rotateAngleY + (float) Math.toRadians(yy), neck4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 80) {
            xx = 0 + (((tickAnim - 0) / 80) * (8.5-(0)));
            yy = 0 + (((tickAnim - 0) / 80) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 80) * (0-(0)));
        }
        else if (tickAnim >= 80 && tickAnim < 120) {
            xx = 8.5 + (((tickAnim - 80) / 40) * (9-(8.5)));
            yy = 0 + (((tickAnim - 80) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 80) / 40) * (0-(0)));
        }
        else if (tickAnim >= 120 && tickAnim < 190) {
            xx = 9 + (((tickAnim - 120) / 70) * (0-(9)));
            yy = 0 + (((tickAnim - 120) / 70) * (0-(0)));
            zz = 0 + (((tickAnim - 120) / 70) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck5, neck5.rotateAngleX + (float) Math.toRadians(xx), neck5.rotateAngleY + (float) Math.toRadians(yy), neck5.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 80) {
            xx = 0 + (((tickAnim - 0) / 80) * (1.5-(0)));
            yy = 0 + (((tickAnim - 0) / 80) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 80) * (0-(0)));
        }
        else if (tickAnim >= 80 && tickAnim < 120) {
            xx = 1.5 + (((tickAnim - 80) / 40) * (2.7-(1.5)));
            yy = 0 + (((tickAnim - 80) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 80) / 40) * (0-(0)));
        }
        else if (tickAnim >= 120 && tickAnim < 190) {
            xx = 2.7 + (((tickAnim - 120) / 70) * (0-(2.7)));
            yy = 0 + (((tickAnim - 120) / 70) * (0-(0)));
            zz = 0 + (((tickAnim - 120) / 70) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck6, neck6.rotateAngleX + (float) Math.toRadians(xx), neck6.rotateAngleY + (float) Math.toRadians(yy), neck6.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 80) {
            xx = 0 + (((tickAnim - 0) / 80) * (0.75-(0)));
            yy = 0 + (((tickAnim - 0) / 80) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 80) * (0-(0)));
        }
        else if (tickAnim >= 80 && tickAnim < 120) {
            xx = 0.75 + (((tickAnim - 80) / 40) * (2.23-(0.75)));
            yy = 0 + (((tickAnim - 80) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 80) / 40) * (0-(0)));
        }
        else if (tickAnim >= 120 && tickAnim < 190) {
            xx = 2.23 + (((tickAnim - 120) / 70) * (0-(2.23)));
            yy = 0 + (((tickAnim - 120) / 70) * (0-(0)));
            zz = 0 + (((tickAnim - 120) / 70) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck7, neck7.rotateAngleX + (float) Math.toRadians(xx), neck7.rotateAngleY + (float) Math.toRadians(yy), neck7.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 80) {
            xx = 0 + (((tickAnim - 0) / 80) * (-12.25728-(0)));
            yy = 0 + (((tickAnim - 0) / 80) * (0.49696-(0)));
            zz = 0 + (((tickAnim - 0) / 80) * (-1.67798-(0)));
        }
        else if (tickAnim >= 80 && tickAnim < 120) {
            xx = -12.25728 + (((tickAnim - 80) / 40) * (-11.5-(-12.25728)));
            yy = 0.49696 + (((tickAnim - 80) / 40) * (0-(0.49696)));
            zz = -1.67798 + (((tickAnim - 80) / 40) * (0-(-1.67798)));
        }
        else if (tickAnim >= 120 && tickAnim < 143) {
            xx = -11.5 + (((tickAnim - 120) / 23) * (-0.97-(-11.5)));
            yy = 0 + (((tickAnim - 120) / 23) * (0-(0)));
            zz = 0 + (((tickAnim - 120) / 23) * (0-(0)));
        }
        else if (tickAnim >= 143 && tickAnim < 190) {
            xx = -0.97 + (((tickAnim - 143) / 47) * (0-(-0.97)));
            yy = 0 + (((tickAnim - 143) / 47) * (0-(0)));
            zz = 0 + (((tickAnim - 143) / 47) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck8, neck8.rotateAngleX + (float) Math.toRadians(xx), neck8.rotateAngleY + (float) Math.toRadians(yy), neck8.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 80) {
            xx = 0 + (((tickAnim - 0) / 80) * (-21.4997-(0)));
            yy = 0 + (((tickAnim - 0) / 80) * (-0.02727-(0)));
            zz = 0 + (((tickAnim - 0) / 80) * (-1.2497-(0)));
        }
        else if (tickAnim >= 80 && tickAnim < 97) {
            xx = -21.4997 + (((tickAnim - 80) / 17) * (-9.93733-(-21.4997)));
            yy = -0.02727 + (((tickAnim - 80) / 17) * (-0.01591-(-0.02727)));
            zz = -1.2497 + (((tickAnim - 80) / 17) * (-0.72899-(-1.2497)));
        }
        else if (tickAnim >= 97 && tickAnim < 111) {
            xx = -9.93733 + (((tickAnim - 97) / 14) * (-12.39502-(-9.93733)));
            yy = -0.01591 + (((tickAnim - 97) / 14) * (-0.00625-(-0.01591)));
            zz = -0.72899 + (((tickAnim - 97) / 14) * (-0.28639-(-0.72899)));
        }
        else if (tickAnim >= 111 && tickAnim < 120) {
            xx = -12.39502 + (((tickAnim - 111) / 9) * (-5.75-(-12.39502)));
            yy = -0.00625 + (((tickAnim - 111) / 9) * (0-(-0.00625)));
            zz = -0.28639 + (((tickAnim - 111) / 9) * (0-(-0.28639)));
        }
        else if (tickAnim >= 120 && tickAnim < 143) {
            xx = -5.75 + (((tickAnim - 120) / 23) * (4.7-(-5.75)));
            yy = 0 + (((tickAnim - 120) / 23) * (0-(0)));
            zz = 0 + (((tickAnim - 120) / 23) * (0-(0)));
        }
        else if (tickAnim >= 143 && tickAnim < 190) {
            xx = 4.7 + (((tickAnim - 143) / 47) * (0-(4.7)));
            yy = 0 + (((tickAnim - 143) / 47) * (0-(0)));
            zz = 0 + (((tickAnim - 143) / 47) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 80) {
            xx = 0 + (((tickAnim - 0) / 80) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 80) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 80) * (2.75-(0)));
        }
        else if (tickAnim >= 80 && tickAnim < 190) {
            xx = 0 + (((tickAnim - 80) / 110) * (0-(0)));
            yy = 0 + (((tickAnim - 80) / 110) * (0-(0)));
            zz = 2.75 + (((tickAnim - 80) / 110) * (0-(2.75)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.head.rotationPointX = this.head.rotationPointX + (float)(xx);
        this.head.rotationPointY = this.head.rotationPointY - (float)(yy);
        this.head.rotationPointZ = this.head.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 65) {
            xx = 0 + (((tickAnim - 0) / 65) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 65) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 65) * (0-(0)));
        }
        else if (tickAnim >= 65 && tickAnim < 80) {
            xx = 0 + (((tickAnim - 65) / 15) * (21.25-(0)));
            yy = 0 + (((tickAnim - 65) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 65) / 15) * (0-(0)));
        }
        else if (tickAnim >= 80 && tickAnim < 97) {
            xx = 21.25 + (((tickAnim - 80) / 17) * (0.9-(21.25)));
            yy = 0 + (((tickAnim - 80) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 80) / 17) * (0-(0)));
        }
        else if (tickAnim >= 97 && tickAnim < 111) {
            xx = 0.9 + (((tickAnim - 97) / 14) * (17.35-(0.9)));
            yy = 0 + (((tickAnim - 97) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 97) / 14) * (0-(0)));
        }
        else if (tickAnim >= 111 && tickAnim < 120) {
            xx = 17.35 + (((tickAnim - 111) / 9) * (0-(17.35)));
            yy = 0 + (((tickAnim - 111) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 111) / 9) * (0-(0)));
        }
        else if (tickAnim >= 120 && tickAnim < 190) {
            xx = 0 + (((tickAnim - 120) / 70) * (0-(0)));
            yy = 0 + (((tickAnim - 120) / 70) * (0-(0)));
            zz = 0 + (((tickAnim - 120) / 70) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(xx), jaw.rotateAngleY + (float) Math.toRadians(yy), jaw.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 0) / 33) * (4-(0)));
            yy = 0 + (((tickAnim - 0) / 33) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 33) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 68) {
            xx = 4 + (((tickAnim - 33) / 35) * (7.86-(4)));
            yy = 0 + (((tickAnim - 33) / 35) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 35) * (0-(0)));
        }
        else if (tickAnim >= 68 && tickAnim < 80) {
            xx = 7.86 + (((tickAnim - 68) / 12) * (2.25-(7.86)));
            yy = 0 + (((tickAnim - 68) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 68) / 12) * (0-(0)));
        }
        else if (tickAnim >= 80 && tickAnim < 97) {
            xx = 2.25 + (((tickAnim - 80) / 17) * (5.64-(2.25)));
            yy = 0 + (((tickAnim - 80) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 80) / 17) * (0-(0)));
        }
        else if (tickAnim >= 97 && tickAnim < 190) {
            xx = 5.64 + (((tickAnim - 97) / 93) * (0-(5.64)));
            yy = 0 + (((tickAnim - 97) / 93) * (0-(0)));
            zz = 0 + (((tickAnim - 97) / 93) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(throat, throat.rotateAngleX + (float) Math.toRadians(xx), throat.rotateAngleY + (float) Math.toRadians(yy), throat.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 0) / 33) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 33) * (0.275-(0)));
            zz = 0 + (((tickAnim - 0) / 33) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 68) {
            xx = 0 + (((tickAnim - 33) / 35) * (0-(0)));
            yy = 0.275 + (((tickAnim - 33) / 35) * (1.31-(0.275)));
            zz = 0 + (((tickAnim - 33) / 35) * (0-(0)));
        }
        else if (tickAnim >= 68 && tickAnim < 80) {
            xx = 0 + (((tickAnim - 68) / 12) * (0-(0)));
            yy = 1.31 + (((tickAnim - 68) / 12) * (0.275-(1.31)));
            zz = 0 + (((tickAnim - 68) / 12) * (0-(0)));
        }
        else if (tickAnim >= 80 && tickAnim < 97) {
            xx = 0 + (((tickAnim - 80) / 17) * (0-(0)));
            yy = 0.275 + (((tickAnim - 80) / 17) * (0.98-(0.275)));
            zz = 0 + (((tickAnim - 80) / 17) * (0-(0)));
        }
        else if (tickAnim >= 97 && tickAnim < 111) {
            xx = 0 + (((tickAnim - 97) / 14) * (0-(0)));
            yy = 0.98 + (((tickAnim - 97) / 14) * (2.155-(0.98)));
            zz = 0 + (((tickAnim - 97) / 14) * (0-(0)));
        }
        else if (tickAnim >= 111 && tickAnim < 190) {
            xx = 0 + (((tickAnim - 111) / 79) * (0-(0)));
            yy = 2.155 + (((tickAnim - 111) / 79) * (0-(2.155)));
            zz = 0 + (((tickAnim - 111) / 79) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.throat.rotationPointX = this.throat.rotationPointX + (float)(xx);
        this.throat.rotationPointY = this.throat.rotationPointY - (float)(yy);
        this.throat.rotationPointZ = this.throat.rotationPointZ + (float)(zz);

        

    }

    public void animEat(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraLusotitan entity = (EntityPrehistoricFloraLusotitan) entitylivingbaseIn;
        int animCycle = 131;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 80) {
            xx = 0 + (((tickAnim - 0) / 80) * (6.25-(0)));
            yy = 0 + (((tickAnim - 0) / 80) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 80) * (0-(0)));
        }
        else if (tickAnim >= 80 && tickAnim < 85) {
            xx = 6.25 + (((tickAnim - 80) / 5) * (6.25-(6.25)));
            yy = 0 + (((tickAnim - 80) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 80) / 5) * (0-(0)));
        }
        else if (tickAnim >= 85 && tickAnim < 132) {
            xx = 6.25 + (((tickAnim - 85) / 47) * (0-(6.25)));
            yy = 0 + (((tickAnim - 85) / 47) * (0-(0)));
            zz = 0 + (((tickAnim - 85) / 47) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(hips, hips.rotateAngleX + (float) Math.toRadians(xx), hips.rotateAngleY + (float) Math.toRadians(yy), hips.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 80) {
            xx = 0 + (((tickAnim - 0) / 80) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 80) * (0.7-(0)));
            zz = 0 + (((tickAnim - 0) / 80) * (0-(0)));
        }
        else if (tickAnim >= 80 && tickAnim < 85) {
            xx = 0 + (((tickAnim - 80) / 5) * (0-(0)));
            yy = 0.7 + (((tickAnim - 80) / 5) * (0.7-(0.7)));
            zz = 0 + (((tickAnim - 80) / 5) * (0-(0)));
        }
        else if (tickAnim >= 85 && tickAnim < 132) {
            xx = 0 + (((tickAnim - 85) / 47) * (0-(0)));
            yy = 0.7 + (((tickAnim - 85) / 47) * (0-(0.7)));
            zz = 0 + (((tickAnim - 85) / 47) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.hips.rotationPointX = this.hips.rotationPointX + (float)(xx);
        this.hips.rotationPointY = this.hips.rotationPointY - (float)(yy);
        this.hips.rotationPointZ = this.hips.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 80) {
            xx = 0 + (((tickAnim - 0) / 80) * (-3.5-(0)));
            yy = 0 + (((tickAnim - 0) / 80) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 80) * (0-(0)));
        }
        else if (tickAnim >= 80 && tickAnim < 85) {
            xx = -3.5 + (((tickAnim - 80) / 5) * (-3.5-(-3.5)));
            yy = 0 + (((tickAnim - 80) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 80) / 5) * (0-(0)));
        }
        else if (tickAnim >= 85 && tickAnim < 132) {
            xx = -3.5 + (((tickAnim - 85) / 47) * (0-(-3.5)));
            yy = 0 + (((tickAnim - 85) / 47) * (0-(0)));
            zz = 0 + (((tickAnim - 85) / 47) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg, rightLeg.rotateAngleX + (float) Math.toRadians(xx), rightLeg.rotateAngleY + (float) Math.toRadians(yy), rightLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 80) {
            xx = 0 + (((tickAnim - 0) / 80) * (-4.75-(0)));
            yy = 0 + (((tickAnim - 0) / 80) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 80) * (0-(0)));
        }
        else if (tickAnim >= 80 && tickAnim < 85) {
            xx = -4.75 + (((tickAnim - 80) / 5) * (-4.75-(-4.75)));
            yy = 0 + (((tickAnim - 80) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 80) / 5) * (0-(0)));
        }
        else if (tickAnim >= 85 && tickAnim < 132) {
            xx = -4.75 + (((tickAnim - 85) / 47) * (0-(-4.75)));
            yy = 0 + (((tickAnim - 85) / 47) * (0-(0)));
            zz = 0 + (((tickAnim - 85) / 47) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg2, rightLeg2.rotateAngleX + (float) Math.toRadians(xx), rightLeg2.rotateAngleY + (float) Math.toRadians(yy), rightLeg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 80) {
            xx = 0 + (((tickAnim - 0) / 80) * (1.5-(0)));
            yy = 0 + (((tickAnim - 0) / 80) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 80) * (0-(0)));
        }
        else if (tickAnim >= 80 && tickAnim < 85) {
            xx = 1.5 + (((tickAnim - 80) / 5) * (4-(1.5)));
            yy = 0 + (((tickAnim - 80) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 80) / 5) * (0-(0)));
        }
        else if (tickAnim >= 85 && tickAnim < 132) {
            xx = 4 + (((tickAnim - 85) / 47) * (0-(4)));
            yy = 0 + (((tickAnim - 85) / 47) * (0-(0)));
            zz = 0 + (((tickAnim - 85) / 47) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg3, rightLeg3.rotateAngleX + (float) Math.toRadians(xx), rightLeg3.rotateAngleY + (float) Math.toRadians(yy), rightLeg3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 48) {
            xx = 0 + (((tickAnim - 0) / 48) * (-2.25-(0)));
            yy = 0 + (((tickAnim - 0) / 48) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 48) * (0-(0)));
        }
        else if (tickAnim >= 48 && tickAnim < 80) {
            xx = -2.25 + (((tickAnim - 48) / 32) * (17.5-(-2.25)));
            yy = 0 + (((tickAnim - 48) / 32) * (0-(0)));
            zz = 0 + (((tickAnim - 48) / 32) * (0-(0)));
        }
        else if (tickAnim >= 80 && tickAnim < 85) {
            xx = 17.5 + (((tickAnim - 80) / 5) * (17.5-(17.5)));
            yy = 0 + (((tickAnim - 80) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 80) / 5) * (0-(0)));
        }
        else if (tickAnim >= 85 && tickAnim < 117) {
            xx = 17.5 + (((tickAnim - 85) / 32) * (17.5-(17.5)));
            yy = 0 + (((tickAnim - 85) / 32) * (0-(0)));
            zz = 0 + (((tickAnim - 85) / 32) * (0-(0)));
        }
        else if (tickAnim >= 117 && tickAnim < 125) {
            xx = 17.5 + (((tickAnim - 117) / 8) * (0-(17.5)));
            yy = 0 + (((tickAnim - 117) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 117) / 8) * (0-(0)));
        }
        else if (tickAnim >= 125 && tickAnim < 132) {
            xx = 0 + (((tickAnim - 125) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 125) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 125) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg, leftLeg.rotateAngleX + (float) Math.toRadians(xx), leftLeg.rotateAngleY + (float) Math.toRadians(yy), leftLeg.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 48 && tickAnim < 80) {
            xx = 0 + (((tickAnim - 48) / 32) * (0-(0)));
            yy = 0 + (((tickAnim - 48) / 32) * (-1.8-(0)));
            zz = 0 + (((tickAnim - 48) / 32) * (0-(0)));
        }
        else if (tickAnim >= 80 && tickAnim < 82) {
            xx = 0 + (((tickAnim - 80) / 2) * (0-(0)));
            yy = -1.8 + (((tickAnim - 80) / 2) * (-2-(-1.8)));
            zz = 0 + (((tickAnim - 80) / 2) * (0-(0)));
        }
        else if (tickAnim >= 82 && tickAnim < 83) {
            xx = 0 + (((tickAnim - 82) / 1) * (0-(0)));
            yy = -2 + (((tickAnim - 82) / 1) * (-1.8-(-2)));
            zz = 0 + (((tickAnim - 82) / 1) * (0-(0)));
        }
        else if (tickAnim >= 83 && tickAnim < 117) {
            xx = 0 + (((tickAnim - 83) / 34) * (0-(0)));
            yy = -1.8 + (((tickAnim - 83) / 34) * (-1.8-(-1.8)));
            zz = 0 + (((tickAnim - 83) / 34) * (0-(0)));
        }
        else if (tickAnim >= 117 && tickAnim < 132) {
            xx = 0 + (((tickAnim - 117) / 15) * (0-(0)));
            yy = -1.8 + (((tickAnim - 117) / 15) * (0-(-1.8)));
            zz = 0 + (((tickAnim - 117) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftLeg.rotationPointX = this.leftLeg.rotationPointX + (float)(xx);
        this.leftLeg.rotationPointY = this.leftLeg.rotationPointY - (float)(yy);
        this.leftLeg.rotationPointZ = this.leftLeg.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 48) {
            xx = 0 + (((tickAnim - 0) / 48) * (-4.25-(0)));
            yy = 0 + (((tickAnim - 0) / 48) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 48) * (0-(0)));
        }
        else if (tickAnim >= 48 && tickAnim < 63) {
            xx = -4.25 + (((tickAnim - 48) / 15) * (23.12-(-4.25)));
            yy = 0 + (((tickAnim - 48) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 48) / 15) * (0-(0)));
        }
        else if (tickAnim >= 63 && tickAnim < 80) {
            xx = 23.12 + (((tickAnim - 63) / 17) * (-18.75-(23.12)));
            yy = 0 + (((tickAnim - 63) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 63) / 17) * (0-(0)));
        }
        else if (tickAnim >= 80 && tickAnim < 85) {
            xx = -18.75 + (((tickAnim - 80) / 5) * (-18.75-(-18.75)));
            yy = 0 + (((tickAnim - 80) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 80) / 5) * (0-(0)));
        }
        else if (tickAnim >= 85 && tickAnim < 117) {
            xx = -18.75 + (((tickAnim - 85) / 32) * (-11-(-18.75)));
            yy = 0 + (((tickAnim - 85) / 32) * (0-(0)));
            zz = 0 + (((tickAnim - 85) / 32) * (0-(0)));
        }
        else if (tickAnim >= 117 && tickAnim < 125) {
            xx = -11 + (((tickAnim - 117) / 8) * (-6.27-(-11)));
            yy = 0 + (((tickAnim - 117) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 117) / 8) * (0-(0)));
        }
        else if (tickAnim >= 125 && tickAnim < 132) {
            xx = -6.27 + (((tickAnim - 125) / 7) * (0-(-6.27)));
            yy = 0 + (((tickAnim - 125) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 125) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg2, leftLeg2.rotateAngleX + (float) Math.toRadians(xx), leftLeg2.rotateAngleY + (float) Math.toRadians(yy), leftLeg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 48) {
            xx = 0 + (((tickAnim - 0) / 48) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 48) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 48) * (0-(0)));
        }
        else if (tickAnim >= 48 && tickAnim < 63) {
            xx = 0 + (((tickAnim - 48) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 48) / 15) * (1.975-(0)));
            zz = 0 + (((tickAnim - 48) / 15) * (0-(0)));
        }
        else if (tickAnim >= 63 && tickAnim < 80) {
            xx = 0 + (((tickAnim - 63) / 17) * (0-(0)));
            yy = 1.975 + (((tickAnim - 63) / 17) * (0-(1.975)));
            zz = 0 + (((tickAnim - 63) / 17) * (0-(0)));
        }
        else if (tickAnim >= 80 && tickAnim < 85) {
            xx = 0 + (((tickAnim - 80) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 80) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 80) / 5) * (0-(0)));
        }
        else if (tickAnim >= 85 && tickAnim < 117) {
            xx = 0 + (((tickAnim - 85) / 32) * (0-(0)));
            yy = 0 + (((tickAnim - 85) / 32) * (0-(0)));
            zz = 0 + (((tickAnim - 85) / 32) * (0-(0)));
        }
        else if (tickAnim >= 117 && tickAnim < 125) {
            xx = 0 + (((tickAnim - 117) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 117) / 8) * (4.45-(0)));
            zz = 0 + (((tickAnim - 117) / 8) * (0-(0)));
        }
        else if (tickAnim >= 125 && tickAnim < 132) {
            xx = 0 + (((tickAnim - 125) / 7) * (0-(0)));
            yy = 4.45 + (((tickAnim - 125) / 7) * (0-(4.45)));
            zz = 0 + (((tickAnim - 125) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftLeg2.rotationPointX = this.leftLeg2.rotationPointX + (float)(xx);
        this.leftLeg2.rotationPointY = this.leftLeg2.rotationPointY - (float)(yy);
        this.leftLeg2.rotationPointZ = this.leftLeg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 48) {
            xx = 0 + (((tickAnim - 0) / 48) * (4-(0)));
            yy = 0 + (((tickAnim - 0) / 48) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 48) * (0-(0)));
        }
        else if (tickAnim >= 48 && tickAnim < 63) {
            xx = 4 + (((tickAnim - 48) / 15) * (30.21-(4)));
            yy = 0 + (((tickAnim - 48) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 48) / 15) * (0-(0)));
        }
        else if (tickAnim >= 63 && tickAnim < 80) {
            xx = 30.21 + (((tickAnim - 63) / 17) * (-4-(30.21)));
            yy = 0 + (((tickAnim - 63) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 63) / 17) * (0-(0)));
        }
        else if (tickAnim >= 80 && tickAnim < 85) {
            xx = -4 + (((tickAnim - 80) / 5) * (-4-(-4)));
            yy = 0 + (((tickAnim - 80) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 80) / 5) * (0-(0)));
        }
        else if (tickAnim >= 85 && tickAnim < 117) {
            xx = -4 + (((tickAnim - 85) / 32) * (-4-(-4)));
            yy = 0 + (((tickAnim - 85) / 32) * (0-(0)));
            zz = 0 + (((tickAnim - 85) / 32) * (0-(0)));
        }
        else if (tickAnim >= 117 && tickAnim < 125) {
            xx = -4 + (((tickAnim - 117) / 8) * (34.85923-(-4)));
            yy = 0 + (((tickAnim - 117) / 8) * (2.21404-(0)));
            zz = 0 + (((tickAnim - 117) / 8) * (-0.34135-(0)));
        }
        else if (tickAnim >= 125 && tickAnim < 129) {
            xx = 34.85923 + (((tickAnim - 125) / 4) * (-0.04223-(34.85923)));
            yy = 2.21404 + (((tickAnim - 125) / 4) * (0.66421-(2.21404)));
            zz = -0.34135 + (((tickAnim - 125) / 4) * (-0.10241-(-0.34135)));
        }
        else if (tickAnim >= 129 && tickAnim < 132) {
            xx = -0.04223 + (((tickAnim - 129) / 3) * (0-(-0.04223)));
            yy = 0.66421 + (((tickAnim - 129) / 3) * (0-(0.66421)));
            zz = -0.10241 + (((tickAnim - 129) / 3) * (0-(-0.10241)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg3, leftLeg3.rotateAngleX + (float) Math.toRadians(xx), leftLeg3.rotateAngleY + (float) Math.toRadians(yy), leftLeg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 48 && tickAnim < 80) {
            xx = 0 + (((tickAnim - 48) / 32) * (0-(0)));
            yy = 0 + (((tickAnim - 48) / 32) * (-0.35-(0)));
            zz = 0 + (((tickAnim - 48) / 32) * (0-(0)));
        }
        else if (tickAnim >= 80 && tickAnim < 85) {
            xx = 0 + (((tickAnim - 80) / 5) * (0-(0)));
            yy = -0.35 + (((tickAnim - 80) / 5) * (0-(-0.35)));
            zz = 0 + (((tickAnim - 80) / 5) * (0-(0)));
        }
        else if (tickAnim >= 85 && tickAnim < 117) {
            xx = 0 + (((tickAnim - 85) / 32) * (0-(0)));
            yy = 0 + (((tickAnim - 85) / 32) * (0-(0)));
            zz = 0 + (((tickAnim - 85) / 32) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftLeg3.rotationPointX = this.leftLeg3.rotationPointX + (float)(xx);
        this.leftLeg3.rotationPointY = this.leftLeg3.rotationPointY - (float)(yy);
        this.leftLeg3.rotationPointZ = this.leftLeg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 48) {
            xx = 0 + (((tickAnim - 0) / 48) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 48) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 48) * (0-(0)));
        }
        else if (tickAnim >= 48 && tickAnim < 63) {
            xx = 0 + (((tickAnim - 48) / 15) * (15.09197-(0)));
            yy = 0 + (((tickAnim - 48) / 15) * (12.08175-(0)));
            zz = 0 + (((tickAnim - 48) / 15) * (3.23057-(0)));
        }
        else if (tickAnim >= 63 && tickAnim < 80) {
            xx = 15.09197 + (((tickAnim - 63) / 17) * (0-(15.09197)));
            yy = 12.08175 + (((tickAnim - 63) / 17) * (0-(12.08175)));
            zz = 3.23057 + (((tickAnim - 63) / 17) * (0-(3.23057)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg4, leftLeg4.rotateAngleX + (float) Math.toRadians(xx), leftLeg4.rotateAngleY + (float) Math.toRadians(yy), leftLeg4.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 48) {
            xx = 0 + (((tickAnim - 0) / 48) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 48) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 48) * (0-(0)));
        }
        else if (tickAnim >= 48 && tickAnim < 63) {
            xx = 0 + (((tickAnim - 48) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 48) / 15) * (-0.325-(0)));
            zz = 0 + (((tickAnim - 48) / 15) * (1.625-(0)));
        }
        else if (tickAnim >= 63 && tickAnim < 80) {
            xx = 0 + (((tickAnim - 63) / 17) * (0-(0)));
            yy = -0.325 + (((tickAnim - 63) / 17) * (0-(-0.325)));
            zz = 1.625 + (((tickAnim - 63) / 17) * (0-(1.625)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftLeg4.rotationPointX = this.leftLeg4.rotationPointX + (float)(xx);
        this.leftLeg4.rotationPointY = this.leftLeg4.rotationPointY - (float)(yy);
        this.leftLeg4.rotationPointZ = this.leftLeg4.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 85) {
            xx = 0 + (((tickAnim - 0) / 85) * (-1.25-(0)));
            yy = 0 + (((tickAnim - 0) / 85) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 85) * (0-(0)));
        }
        else if (tickAnim >= 85 && tickAnim < 132) {
            xx = -1.25 + (((tickAnim - 85) / 47) * (0-(-1.25)));
            yy = 0 + (((tickAnim - 85) / 47) * (0-(0)));
            zz = 0 + (((tickAnim - 85) / 47) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(xx), tail4.rotateAngleY + (float) Math.toRadians(yy), tail4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 85) {
            xx = 0 + (((tickAnim - 0) / 85) * (-1.5-(0)));
            yy = 0 + (((tickAnim - 0) / 85) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 85) * (0-(0)));
        }
        else if (tickAnim >= 85 && tickAnim < 132) {
            xx = -1.5 + (((tickAnim - 85) / 47) * (0-(-1.5)));
            yy = 0 + (((tickAnim - 85) / 47) * (0-(0)));
            zz = 0 + (((tickAnim - 85) / 47) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail5, tail5.rotateAngleX + (float) Math.toRadians(xx), tail5.rotateAngleY + (float) Math.toRadians(yy), tail5.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 85) {
            xx = 0 + (((tickAnim - 0) / 85) * (-2.46168-(0)));
            yy = 0 + (((tickAnim - 0) / 85) * (-0.27574-(0)));
            zz = 0 + (((tickAnim - 0) / 85) * (-0.33196-(0)));
        }
        else if (tickAnim >= 85 && tickAnim < 132) {
            xx = -2.46168 + (((tickAnim - 85) / 47) * (0-(-2.46168)));
            yy = -0.27574 + (((tickAnim - 85) / 47) * (0-(-0.27574)));
            zz = -0.33196 + (((tickAnim - 85) / 47) * (0-(-0.33196)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail6, tail6.rotateAngleX + (float) Math.toRadians(xx), tail6.rotateAngleY + (float) Math.toRadians(yy), tail6.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 85) {
            xx = 0 + (((tickAnim - 0) / 85) * (-5-(0)));
            yy = 0 + (((tickAnim - 0) / 85) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 85) * (0-(0)));
        }
        else if (tickAnim >= 85 && tickAnim < 132) {
            xx = -5 + (((tickAnim - 85) / 47) * (0-(-5)));
            yy = 0 + (((tickAnim - 85) / 47) * (0-(0)));
            zz = 0 + (((tickAnim - 85) / 47) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail7, tail7.rotateAngleX + (float) Math.toRadians(xx), tail7.rotateAngleY + (float) Math.toRadians(yy), tail7.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 80) {
            xx = 0 + (((tickAnim - 0) / 80) * (18.75-(0)));
            yy = 0 + (((tickAnim - 0) / 80) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 80) * (0-(0)));
        }
        else if (tickAnim >= 80 && tickAnim < 85) {
            xx = 18.75 + (((tickAnim - 80) / 5) * (18.75-(18.75)));
            yy = 0 + (((tickAnim - 80) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 80) / 5) * (0-(0)));
        }
        else if (tickAnim >= 85 && tickAnim < 132) {
            xx = 18.75 + (((tickAnim - 85) / 47) * (0-(18.75)));
            yy = 0 + (((tickAnim - 85) / 47) * (0-(0)));
            zz = 0 + (((tickAnim - 85) / 47) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(xx), body.rotateAngleY + (float) Math.toRadians(yy), body.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 80) {
            xx = 0 + (((tickAnim - 0) / 80) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 80) * (1.675-(0)));
            zz = 0 + (((tickAnim - 0) / 80) * (2.25-(0)));
        }
        else if (tickAnim >= 80 && tickAnim < 85) {
            xx = 0 + (((tickAnim - 80) / 5) * (0-(0)));
            yy = 1.675 + (((tickAnim - 80) / 5) * (1.675-(1.675)));
            zz = 2.25 + (((tickAnim - 80) / 5) * (2.25-(2.25)));
        }
        else if (tickAnim >= 85 && tickAnim < 132) {
            xx = 0 + (((tickAnim - 85) / 47) * (0-(0)));
            yy = 1.675 + (((tickAnim - 85) / 47) * (0-(1.675)));
            zz = 2.25 + (((tickAnim - 85) / 47) * (0-(2.25)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.body.rotationPointX = this.body.rotationPointX + (float)(xx);
        this.body.rotationPointY = this.body.rotationPointY - (float)(yy);
        this.body.rotationPointZ = this.body.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 80) {
            xx = 0 + (((tickAnim - 0) / 80) * (10.75-(0)));
            yy = 0 + (((tickAnim - 0) / 80) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 80) * (0-(0)));
        }
        else if (tickAnim >= 80 && tickAnim < 85) {
            xx = 10.75 + (((tickAnim - 80) / 5) * (10.75-(10.75)));
            yy = 0 + (((tickAnim - 80) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 80) / 5) * (0-(0)));
        }
        else if (tickAnim >= 85 && tickAnim < 132) {
            xx = 10.75 + (((tickAnim - 85) / 47) * (0-(10.75)));
            yy = 0 + (((tickAnim - 85) / 47) * (0-(0)));
            zz = 0 + (((tickAnim - 85) / 47) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(xx), chest.rotateAngleY + (float) Math.toRadians(yy), chest.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 80) {
            xx = 0 + (((tickAnim - 0) / 80) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 80) * (1.1-(0)));
            zz = 0 + (((tickAnim - 0) / 80) * (0.65-(0)));
        }
        else if (tickAnim >= 80 && tickAnim < 85) {
            xx = 0 + (((tickAnim - 80) / 5) * (0-(0)));
            yy = 1.1 + (((tickAnim - 80) / 5) * (1.1-(1.1)));
            zz = 0.65 + (((tickAnim - 80) / 5) * (0.65-(0.65)));
        }
        else if (tickAnim >= 85 && tickAnim < 132) {
            xx = 0 + (((tickAnim - 85) / 47) * (0-(0)));
            yy = 1.1 + (((tickAnim - 85) / 47) * (0-(1.1)));
            zz = 0.65 + (((tickAnim - 85) / 47) * (0-(0.65)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.chest.rotationPointX = this.chest.rotationPointX + (float)(xx);
        this.chest.rotationPointY = this.chest.rotationPointY - (float)(yy);
        this.chest.rotationPointZ = this.chest.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (-8.66527-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (-2.63145-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (-10.0697-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = -8.66527 + (((tickAnim - 10) / 10) * (-7.33054-(-8.66527)));
            yy = -2.63145 + (((tickAnim - 10) / 10) * (-5.2629-(-2.63145)));
            zz = -10.0697 + (((tickAnim - 10) / 10) * (-20.13939-(-10.0697)));
        }
        else if (tickAnim >= 20 && tickAnim < 80) {
            xx = -7.33054 + (((tickAnim - 20) / 60) * (-42.0692-(-7.33054)));
            yy = -5.2629 + (((tickAnim - 20) / 60) * (-12.29628-(-5.2629)));
            zz = -20.13939 + (((tickAnim - 20) / 60) * (-11.23604-(-20.13939)));
        }
        else if (tickAnim >= 80 && tickAnim < 85) {
            xx = -42.0692 + (((tickAnim - 80) / 5) * (-42.0692-(-42.0692)));
            yy = -12.29628 + (((tickAnim - 80) / 5) * (-12.29628-(-12.29628)));
            zz = -11.23604 + (((tickAnim - 80) / 5) * (-11.23604-(-11.23604)));
        }
        else if (tickAnim >= 85 && tickAnim < 105) {
            xx = -42.0692 + (((tickAnim - 85) / 20) * (-28.70373-(-42.0692)));
            yy = -12.29628 + (((tickAnim - 85) / 20) * (-8.97379-(-12.29628)));
            zz = -11.23604 + (((tickAnim - 85) / 20) * (-11.7357-(-11.23604)));
        }
        else if (tickAnim >= 105 && tickAnim < 113) {
            xx = -28.70373 + (((tickAnim - 105) / 8) * (-13.40143-(-28.70373)));
            yy = -8.97379 + (((tickAnim - 105) / 8) * (-5.13396-(-8.97379)));
            zz = -11.7357 + (((tickAnim - 105) / 8) * (-13.35205-(-11.7357)));
        }
        else if (tickAnim >= 113 && tickAnim < 122) {
            xx = -13.40143 + (((tickAnim - 113) / 9) * (-9.5-(-13.40143)));
            yy = -5.13396 + (((tickAnim - 113) / 9) * (0-(-5.13396)));
            zz = -13.35205 + (((tickAnim - 113) / 9) * (0-(-13.35205)));
        }
        else if (tickAnim >= 122 && tickAnim < 132) {
            xx = -9.5 + (((tickAnim - 122) / 10) * (0-(-9.5)));
            yy = 0 + (((tickAnim - 122) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 122) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm, leftArm.rotateAngleX + (float) Math.toRadians(xx), leftArm.rotateAngleY + (float) Math.toRadians(yy), leftArm.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 105) {
            xx = 0 + (((tickAnim - 0) / 105) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 105) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 105) * (0-(0)));
        }
        else if (tickAnim >= 105 && tickAnim < 122) {
            xx = 0 + (((tickAnim - 105) / 17) * (0-(0)));
            yy = 0 + (((tickAnim - 105) / 17) * (4.125-(0)));
            zz = 0 + (((tickAnim - 105) / 17) * (0-(0)));
        }
        else if (tickAnim >= 122 && tickAnim < 132) {
            xx = 0 + (((tickAnim - 122) / 10) * (0-(0)));
            yy = 4.125 + (((tickAnim - 122) / 10) * (0-(4.125)));
            zz = 0 + (((tickAnim - 122) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftArm.rotationPointX = this.leftArm.rotationPointX + (float)(xx);
        this.leftArm.rotationPointY = this.leftArm.rotationPointY - (float)(yy);
        this.leftArm.rotationPointZ = this.leftArm.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (-19.50315-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (-5.97085-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (11.85467-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = -19.50315 + (((tickAnim - 10) / 10) * (-16.9756-(-19.50315)));
            yy = -5.97085 + (((tickAnim - 10) / 10) * (8.32854-(-5.97085)));
            zz = 11.85467 + (((tickAnim - 10) / 10) * (18.95711-(11.85467)));
        }
        else if (tickAnim >= 20 && tickAnim < 80) {
            xx = -16.9756 + (((tickAnim - 20) / 60) * (-45.68346-(-16.9756)));
            yy = 8.32854 + (((tickAnim - 20) / 60) * (4.7617-(8.32854)));
            zz = 18.95711 + (((tickAnim - 20) / 60) * (17.13451-(18.95711)));
        }
        else if (tickAnim >= 80 && tickAnim < 85) {
            xx = -45.68346 + (((tickAnim - 80) / 5) * (-45.68346-(-45.68346)));
            yy = 4.7617 + (((tickAnim - 80) / 5) * (4.7617-(4.7617)));
            zz = 17.13451 + (((tickAnim - 80) / 5) * (17.13451-(17.13451)));
        }
        else if (tickAnim >= 85 && tickAnim < 105) {
            xx = -45.68346 + (((tickAnim - 85) / 20) * (-21.23634-(-45.68346)));
            yy = 4.7617 + (((tickAnim - 85) / 20) * (-0.86875-(4.7617)));
            zz = 17.13451 + (((tickAnim - 85) / 20) * (12.94847-(17.13451)));
        }
        else if (tickAnim >= 105 && tickAnim < 113) {
            xx = -21.23634 + (((tickAnim - 105) / 8) * (-46.88161-(-21.23634)));
            yy = -0.86875 + (((tickAnim - 105) / 8) * (2.21077-(-0.86875)));
            zz = 12.94847 + (((tickAnim - 105) / 8) * (16.67196-(12.94847)));
        }
        else if (tickAnim >= 113 && tickAnim < 122) {
            xx = -46.88161 + (((tickAnim - 113) / 9) * (0-(-46.88161)));
            yy = 2.21077 + (((tickAnim - 113) / 9) * (0-(2.21077)));
            zz = 16.67196 + (((tickAnim - 113) / 9) * (0-(16.67196)));
        }
        else if (tickAnim >= 122 && tickAnim < 132) {
            xx = 0 + (((tickAnim - 122) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 122) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 122) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm2, leftArm2.rotateAngleX + (float) Math.toRadians(xx), leftArm2.rotateAngleY + (float) Math.toRadians(yy), leftArm2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (1-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 80) {
            xx = 0 + (((tickAnim - 10) / 70) * (0-(0)));
            yy = 1 + (((tickAnim - 10) / 70) * (2.695-(1)));
            zz = 0 + (((tickAnim - 10) / 70) * (0-(0)));
        }
        else if (tickAnim >= 80 && tickAnim < 85) {
            xx = 0 + (((tickAnim - 80) / 5) * (0-(0)));
            yy = 2.695 + (((tickAnim - 80) / 5) * (2.695-(2.695)));
            zz = 0 + (((tickAnim - 80) / 5) * (0-(0)));
        }
        else if (tickAnim >= 85 && tickAnim < 105) {
            xx = 0 + (((tickAnim - 85) / 20) * (0-(0)));
            yy = 2.695 + (((tickAnim - 85) / 20) * (4.225-(2.695)));
            zz = 0 + (((tickAnim - 85) / 20) * (0-(0)));
        }
        else if (tickAnim >= 105 && tickAnim < 122) {
            xx = 0 + (((tickAnim - 105) / 17) * (0-(0)));
            yy = 4.225 + (((tickAnim - 105) / 17) * (0-(4.225)));
            zz = 0 + (((tickAnim - 105) / 17) * (0-(0)));
        }
        else if (tickAnim >= 122 && tickAnim < 132) {
            xx = 0 + (((tickAnim - 122) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 122) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 122) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftArm2.rotationPointX = this.leftArm2.rotationPointX + (float)(xx);
        this.leftArm2.rotationPointY = this.leftArm2.rotationPointY - (float)(yy);
        this.leftArm2.rotationPointZ = this.leftArm2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (49-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 49 + (((tickAnim - 10) / 10) * (18-(49)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 80) {
            xx = 18 + (((tickAnim - 20) / 60) * (55.25-(18)));
            yy = 0 + (((tickAnim - 20) / 60) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 60) * (0-(0)));
        }
        else if (tickAnim >= 80 && tickAnim < 85) {
            xx = 55.25 + (((tickAnim - 80) / 5) * (55.25-(55.25)));
            yy = 0 + (((tickAnim - 80) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 80) / 5) * (0-(0)));
        }
        else if (tickAnim >= 85 && tickAnim < 105) {
            xx = 55.25 + (((tickAnim - 85) / 20) * (32-(55.25)));
            yy = 0 + (((tickAnim - 85) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 85) / 20) * (0-(0)));
        }
        else if (tickAnim >= 105 && tickAnim < 113) {
            xx = 32 + (((tickAnim - 105) / 8) * (61.86-(32)));
            yy = 0 + (((tickAnim - 105) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 105) / 8) * (0-(0)));
        }
        else if (tickAnim >= 113 && tickAnim < 122) {
            xx = 61.86 + (((tickAnim - 113) / 9) * (4.75-(61.86)));
            yy = 0 + (((tickAnim - 113) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 113) / 9) * (0-(0)));
        }
        else if (tickAnim >= 122 && tickAnim < 132) {
            xx = 4.75 + (((tickAnim - 122) / 10) * (0-(4.75)));
            yy = 0 + (((tickAnim - 122) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 122) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm3, leftArm3.rotateAngleX + (float) Math.toRadians(xx), leftArm3.rotateAngleY + (float) Math.toRadians(yy), leftArm3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 80) {
            xx = 0 + (((tickAnim - 0) / 80) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 80) * (0.85-(0)));
            zz = 0 + (((tickAnim - 0) / 80) * (-2.525-(0)));
        }
        else if (tickAnim >= 80 && tickAnim < 85) {
            xx = 0 + (((tickAnim - 80) / 5) * (0-(0)));
            yy = 0.85 + (((tickAnim - 80) / 5) * (0.85-(0.85)));
            zz = -2.525 + (((tickAnim - 80) / 5) * (-2.525-(-2.525)));
        }
        else if (tickAnim >= 85 && tickAnim < 105) {
            xx = 0 + (((tickAnim - 85) / 20) * (0-(0)));
            yy = 0.85 + (((tickAnim - 85) / 20) * (0.5-(0.85)));
            zz = -2.525 + (((tickAnim - 85) / 20) * (-0.75-(-2.525)));
        }
        else if (tickAnim >= 105 && tickAnim < 113) {
            xx = 0 + (((tickAnim - 105) / 8) * (0-(0)));
            yy = 0.5 + (((tickAnim - 105) / 8) * (1.25-(0.5)));
            zz = -0.75 + (((tickAnim - 105) / 8) * (-2.495-(-0.75)));
        }
        else if (tickAnim >= 113 && tickAnim < 122) {
            xx = 0 + (((tickAnim - 113) / 9) * (0-(0)));
            yy = 1.25 + (((tickAnim - 113) / 9) * (0-(1.25)));
            zz = -2.495 + (((tickAnim - 113) / 9) * (0-(-2.495)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftArm3.rotationPointX = this.leftArm3.rotationPointX + (float)(xx);
        this.leftArm3.rotationPointY = this.leftArm3.rotationPointY - (float)(yy);
        this.leftArm3.rotationPointZ = this.leftArm3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (-5-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = -5 + (((tickAnim - 20) / 10) * (-32.12985-(-5)));
            yy = 0 + (((tickAnim - 20) / 10) * (11.09116-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (9.83778-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = -32.12985 + (((tickAnim - 30) / 10) * (-40.59112-(-32.12985)));
            yy = 11.09116 + (((tickAnim - 30) / 10) * (13.91564-(11.09116)));
            zz = 9.83778 + (((tickAnim - 30) / 10) * (15.54709-(9.83778)));
        }
        else if (tickAnim >= 40 && tickAnim < 80) {
            xx = -40.59112 + (((tickAnim - 40) / 40) * (-64.09112-(-40.59112)));
            yy = 13.91564 + (((tickAnim - 40) / 40) * (13.91564-(13.91564)));
            zz = 15.54709 + (((tickAnim - 40) / 40) * (15.54709-(15.54709)));
        }
        else if (tickAnim >= 80 && tickAnim < 85) {
            xx = -64.09112 + (((tickAnim - 80) / 5) * (-64.09112-(-64.09112)));
            yy = 13.91564 + (((tickAnim - 80) / 5) * (13.91564-(13.91564)));
            zz = 15.54709 + (((tickAnim - 80) / 5) * (15.54709-(15.54709)));
        }
        else if (tickAnim >= 85 && tickAnim < 105) {
            xx = -64.09112 + (((tickAnim - 85) / 20) * (-24.59112-(-64.09112)));
            yy = 13.91564 + (((tickAnim - 85) / 20) * (13.91564-(13.91564)));
            zz = 15.54709 + (((tickAnim - 85) / 20) * (15.54709-(15.54709)));
        }
        else if (tickAnim >= 105 && tickAnim < 132) {
            xx = -24.59112 + (((tickAnim - 105) / 27) * (0-(-24.59112)));
            yy = 13.91564 + (((tickAnim - 105) / 27) * (0-(13.91564)));
            zz = 15.54709 + (((tickAnim - 105) / 27) * (0-(15.54709)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm, rightArm.rotateAngleX + (float) Math.toRadians(xx), rightArm.rotateAngleY + (float) Math.toRadians(yy), rightArm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (-25.75-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = -25.75 + (((tickAnim - 20) / 10) * (-29.14182-(-25.75)));
            yy = 0 + (((tickAnim - 20) / 10) * (5.88873-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (-14.25674-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = -29.14182 + (((tickAnim - 30) / 10) * (-3.24284-(-29.14182)));
            yy = 5.88873 + (((tickAnim - 30) / 10) * (-5.17504-(5.88873)));
            zz = -14.25674 + (((tickAnim - 30) / 10) * (-17.70737-(-14.25674)));
        }
        else if (tickAnim >= 40 && tickAnim < 80) {
            xx = -3.24284 + (((tickAnim - 40) / 40) * (-24.99284-(-3.24284)));
            yy = -5.17504 + (((tickAnim - 40) / 40) * (-5.17504-(-5.17504)));
            zz = -17.70737 + (((tickAnim - 40) / 40) * (-17.70737-(-17.70737)));
        }
        else if (tickAnim >= 80 && tickAnim < 85) {
            xx = -24.99284 + (((tickAnim - 80) / 5) * (-24.99284-(-24.99284)));
            yy = -5.17504 + (((tickAnim - 80) / 5) * (-5.17504-(-5.17504)));
            zz = -17.70737 + (((tickAnim - 80) / 5) * (-17.70737-(-17.70737)));
        }
        else if (tickAnim >= 85 && tickAnim < 95) {
            xx = -24.99284 + (((tickAnim - 85) / 10) * (-30.62142-(-24.99284)));
            yy = -5.17504 + (((tickAnim - 85) / 10) * (-2.58752-(-5.17504)));
            zz = -17.70737 + (((tickAnim - 85) / 10) * (-19.85368-(-17.70737)));
        }
        else if (tickAnim >= 95 && tickAnim < 105) {
            xx = -30.62142 + (((tickAnim - 95) / 10) * (-34-(-30.62142)));
            yy = -2.58752 + (((tickAnim - 95) / 10) * (0-(-2.58752)));
            zz = -19.85368 + (((tickAnim - 95) / 10) * (-22-(-19.85368)));
        }
        else if (tickAnim >= 105 && tickAnim < 122) {
            xx = -34 + (((tickAnim - 105) / 17) * (-16.21875-(-34)));
            yy = 0 + (((tickAnim - 105) / 17) * (0-(0)));
            zz = -22 + (((tickAnim - 105) / 17) * (-8.25-(-22)));
        }
        else if (tickAnim >= 122 && tickAnim < 132) {
            xx = -16.21875 + (((tickAnim - 122) / 10) * (0-(-16.21875)));
            yy = 0 + (((tickAnim - 122) / 10) * (0-(0)));
            zz = -8.25 + (((tickAnim - 122) / 10) * (0-(-8.25)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm2, rightArm2.rotateAngleX + (float) Math.toRadians(xx), rightArm2.rotateAngleY + (float) Math.toRadians(yy), rightArm2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (1.675-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0.225-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 20) / 20) * (0-(0)));
            yy = 1.675 + (((tickAnim - 20) / 20) * (0-(1.675)));
            zz = 0.225 + (((tickAnim - 20) / 20) * (0-(0.225)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightArm2.rotationPointX = this.rightArm2.rotationPointX + (float)(xx);
        this.rightArm2.rotationPointY = this.rightArm2.rotationPointY - (float)(yy);
        this.rightArm2.rotationPointZ = this.rightArm2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (22.5-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 22.5 + (((tickAnim - 20) / 10) * (68.5-(22.5)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 38) {
            xx = 68.5 + (((tickAnim - 30) / 8) * (27.44311-(68.5)));
            yy = 0 + (((tickAnim - 30) / 8) * (2.5448-(0)));
            zz = 0 + (((tickAnim - 30) / 8) * (-1.92053-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 40) {
            xx = 27.44311 + (((tickAnim - 38) / 2) * (27.42414-(27.44311)));
            yy = 2.5448 + (((tickAnim - 38) / 2) * (3.39307-(2.5448)));
            zz = -1.92053 + (((tickAnim - 38) / 2) * (-2.56071-(-1.92053)));
        }
        else if (tickAnim >= 40 && tickAnim < 80) {
            xx = 27.42414 + (((tickAnim - 40) / 40) * (55.33943-(27.42414)));
            yy = 3.39307 + (((tickAnim - 40) / 40) * (6.219-(3.39307)));
            zz = -2.56071 + (((tickAnim - 40) / 40) * (-3.57141-(-2.56071)));
        }
        else if (tickAnim >= 80 && tickAnim < 85) {
            xx = 55.33943 + (((tickAnim - 80) / 5) * (55.33943-(55.33943)));
            yy = 6.219 + (((tickAnim - 80) / 5) * (6.219-(6.219)));
            zz = -3.57141 + (((tickAnim - 80) / 5) * (-3.57141-(-3.57141)));
        }
        else if (tickAnim >= 85 && tickAnim < 95) {
            xx = 55.33943 + (((tickAnim - 85) / 10) * (46.91972-(55.33943)));
            yy = 6.219 + (((tickAnim - 85) / 10) * (3.1095-(6.219)));
            zz = -3.57141 + (((tickAnim - 85) / 10) * (-1.78571-(-3.57141)));
        }
        else if (tickAnim >= 95 && tickAnim < 105) {
            xx = 46.91972 + (((tickAnim - 95) / 10) * (43-(46.91972)));
            yy = 3.1095 + (((tickAnim - 95) / 10) * (0-(3.1095)));
            zz = -1.78571 + (((tickAnim - 95) / 10) * (0-(-1.78571)));
        }
        else if (tickAnim >= 105 && tickAnim < 122) {
            xx = 43 + (((tickAnim - 105) / 17) * (26.69-(43)));
            yy = 0 + (((tickAnim - 105) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 105) / 17) * (0-(0)));
        }
        else if (tickAnim >= 122 && tickAnim < 132) {
            xx = 26.69 + (((tickAnim - 122) / 10) * (0-(26.69)));
            yy = 0 + (((tickAnim - 122) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 122) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm3, rightArm3.rotateAngleX + (float) Math.toRadians(xx), rightArm3.rotateAngleY + (float) Math.toRadians(yy), rightArm3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 20) / 10) * (1.825-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (-3.275-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 38) {
            xx = 0 + (((tickAnim - 30) / 8) * (0-(0)));
            yy = 1.825 + (((tickAnim - 30) / 8) * (0-(1.825)));
            zz = -3.275 + (((tickAnim - 30) / 8) * (-0.75-(-3.275)));
        }
        else if (tickAnim >= 38 && tickAnim < 80) {
            xx = 0 + (((tickAnim - 38) / 42) * (0-(0)));
            yy = 0 + (((tickAnim - 38) / 42) * (0.525-(0)));
            zz = -0.75 + (((tickAnim - 38) / 42) * (-1.45-(-0.75)));
        }
        else if (tickAnim >= 80 && tickAnim < 85) {
            xx = 0 + (((tickAnim - 80) / 5) * (0-(0)));
            yy = 0.525 + (((tickAnim - 80) / 5) * (0.525-(0.525)));
            zz = -1.45 + (((tickAnim - 80) / 5) * (-1.45-(-1.45)));
        }
        else if (tickAnim >= 85 && tickAnim < 105) {
            xx = 0 + (((tickAnim - 85) / 20) * (0-(0)));
            yy = 0.525 + (((tickAnim - 85) / 20) * (0.425-(0.525)));
            zz = -1.45 + (((tickAnim - 85) / 20) * (-1.675-(-1.45)));
        }
        else if (tickAnim >= 105 && tickAnim < 122) {
            xx = 0 + (((tickAnim - 105) / 17) * (0-(0)));
            yy = 0.425 + (((tickAnim - 105) / 17) * (0-(0.425)));
            zz = -1.675 + (((tickAnim - 105) / 17) * (-0.88-(-1.675)));
        }
        else if (tickAnim >= 122 && tickAnim < 132) {
            xx = 0 + (((tickAnim - 122) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 122) / 10) * (0-(0)));
            zz = -0.88 + (((tickAnim - 122) / 10) * (0-(-0.88)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightArm3.rotationPointX = this.rightArm3.rotationPointX + (float)(xx);
        this.rightArm3.rotationPointY = this.rightArm3.rotationPointY - (float)(yy);
        this.rightArm3.rotationPointZ = this.rightArm3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 58) {
            xx = 0 + (((tickAnim - 0) / 58) * (15.57-(0)));
            yy = 0 + (((tickAnim - 0) / 58) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 58) * (0-(0)));
        }
        else if (tickAnim >= 58 && tickAnim < 66) {
            xx = 15.57 + (((tickAnim - 58) / 8) * (18.58-(15.57)));
            yy = 0 + (((tickAnim - 58) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 58) / 8) * (0-(0)));
        }
        else if (tickAnim >= 66 && tickAnim < 74) {
            xx = 18.58 + (((tickAnim - 66) / 8) * (19.92-(18.58)));
            yy = 0 + (((tickAnim - 66) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 66) / 8) * (0-(0)));
        }
        else if (tickAnim >= 74 && tickAnim < 80) {
            xx = 19.92 + (((tickAnim - 74) / 6) * (19.25-(19.92)));
            yy = 0 + (((tickAnim - 74) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 74) / 6) * (0-(0)));
        }
        else if (tickAnim >= 80 && tickAnim < 85) {
            xx = 19.25 + (((tickAnim - 80) / 5) * (19.25-(19.25)));
            yy = 0 + (((tickAnim - 80) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 80) / 5) * (0-(0)));
        }
        else if (tickAnim >= 85 && tickAnim < 132) {
            xx = 19.25 + (((tickAnim - 85) / 47) * (0-(19.25)));
            yy = 0 + (((tickAnim - 85) / 47) * (0-(0)));
            zz = 0 + (((tickAnim - 85) / 47) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck1, neck1.rotateAngleX + (float) Math.toRadians(xx), neck1.rotateAngleY + (float) Math.toRadians(yy), neck1.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 80) {
            xx = 0 + (((tickAnim - 0) / 80) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 80) * (-0.5-(0)));
            zz = 0 + (((tickAnim - 0) / 80) * (1.1-(0)));
        }
        else if (tickAnim >= 80 && tickAnim < 85) {
            xx = 0 + (((tickAnim - 80) / 5) * (0-(0)));
            yy = -0.5 + (((tickAnim - 80) / 5) * (-0.5-(-0.5)));
            zz = 1.1 + (((tickAnim - 80) / 5) * (1.1-(1.1)));
        }
        else if (tickAnim >= 85 && tickAnim < 132) {
            xx = 0 + (((tickAnim - 85) / 47) * (0-(0)));
            yy = -0.5 + (((tickAnim - 85) / 47) * (0-(-0.5)));
            zz = 1.1 + (((tickAnim - 85) / 47) * (0-(1.1)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.neck1.rotationPointX = this.neck1.rotationPointX + (float)(xx);
        this.neck1.rotationPointY = this.neck1.rotationPointY - (float)(yy);
        this.neck1.rotationPointZ = this.neck1.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 80) {
            xx = 0 + (((tickAnim - 0) / 80) * (11.46148-(0)));
            yy = 0 + (((tickAnim - 0) / 80) * (-0.42981-(0)));
            zz = 0 + (((tickAnim - 0) / 80) * (0.46761-(0)));
        }
        else if (tickAnim >= 80 && tickAnim < 85) {
            xx = 11.46148 + (((tickAnim - 80) / 5) * (16.21148-(11.46148)));
            yy = -0.42981 + (((tickAnim - 80) / 5) * (-0.42981-(-0.42981)));
            zz = 0.46761 + (((tickAnim - 80) / 5) * (0.46761-(0.46761)));
        }
        else if (tickAnim >= 85 && tickAnim < 132) {
            xx = 16.21148 + (((tickAnim - 85) / 47) * (0-(16.21148)));
            yy = -0.42981 + (((tickAnim - 85) / 47) * (0-(-0.42981)));
            zz = 0.46761 + (((tickAnim - 85) / 47) * (0-(0.46761)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(xx), neck2.rotateAngleY + (float) Math.toRadians(yy), neck2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 80) {
            xx = 0 + (((tickAnim - 0) / 80) * (23-(0)));
            yy = 0 + (((tickAnim - 0) / 80) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 80) * (0-(0)));
        }
        else if (tickAnim >= 80 && tickAnim < 85) {
            xx = 23 + (((tickAnim - 80) / 5) * (19-(23)));
            yy = 0 + (((tickAnim - 80) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 80) / 5) * (0-(0)));
        }
        else if (tickAnim >= 85 && tickAnim < 132) {
            xx = 19 + (((tickAnim - 85) / 47) * (0-(19)));
            yy = 0 + (((tickAnim - 85) / 47) * (0-(0)));
            zz = 0 + (((tickAnim - 85) / 47) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(xx), neck3.rotateAngleY + (float) Math.toRadians(yy), neck3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 80) {
            xx = 0 + (((tickAnim - 0) / 80) * (7-(0)));
            yy = 0 + (((tickAnim - 0) / 80) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 80) * (0-(0)));
        }
        else if (tickAnim >= 80 && tickAnim < 85) {
            xx = 7 + (((tickAnim - 80) / 5) * (9.5-(7)));
            yy = 0 + (((tickAnim - 80) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 80) / 5) * (0-(0)));
        }
        else if (tickAnim >= 85 && tickAnim < 132) {
            xx = 9.5 + (((tickAnim - 85) / 47) * (0-(9.5)));
            yy = 0 + (((tickAnim - 85) / 47) * (0-(0)));
            zz = 0 + (((tickAnim - 85) / 47) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck4, neck4.rotateAngleX + (float) Math.toRadians(xx), neck4.rotateAngleY + (float) Math.toRadians(yy), neck4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 80) {
            xx = 0 + (((tickAnim - 0) / 80) * (11-(0)));
            yy = 0 + (((tickAnim - 0) / 80) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 80) * (0-(0)));
        }
        else if (tickAnim >= 80 && tickAnim < 85) {
            xx = 11 + (((tickAnim - 80) / 5) * (11-(11)));
            yy = 0 + (((tickAnim - 80) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 80) / 5) * (0-(0)));
        }
        else if (tickAnim >= 85 && tickAnim < 132) {
            xx = 11 + (((tickAnim - 85) / 47) * (0-(11)));
            yy = 0 + (((tickAnim - 85) / 47) * (0-(0)));
            zz = 0 + (((tickAnim - 85) / 47) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck5, neck5.rotateAngleX + (float) Math.toRadians(xx), neck5.rotateAngleY + (float) Math.toRadians(yy), neck5.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 80) {
            xx = 0 + (((tickAnim - 0) / 80) * (-6.00728-(0)));
            yy = 0 + (((tickAnim - 0) / 80) * (0.49696-(0)));
            zz = 0 + (((tickAnim - 0) / 80) * (-1.67798-(0)));
        }
        else if (tickAnim >= 80 && tickAnim < 85) {
            xx = -6.00728 + (((tickAnim - 80) / 5) * (-6-(-6.00728)));
            yy = 0.49696 + (((tickAnim - 80) / 5) * (0-(0.49696)));
            zz = -1.67798 + (((tickAnim - 80) / 5) * (0-(-1.67798)));
        }
        else if (tickAnim >= 85 && tickAnim < 132) {
            xx = -6 + (((tickAnim - 85) / 47) * (0-(-6)));
            yy = 0 + (((tickAnim - 85) / 47) * (0-(0)));
            zz = 0 + (((tickAnim - 85) / 47) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck8, neck8.rotateAngleX + (float) Math.toRadians(xx), neck8.rotateAngleY + (float) Math.toRadians(yy), neck8.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 80) {
            xx = 0 + (((tickAnim - 0) / 80) * (-13.7497-(0)));
            yy = 0 + (((tickAnim - 0) / 80) * (-0.02727-(0)));
            zz = 0 + (((tickAnim - 0) / 80) * (-1.2497-(0)));
        }
        else if (tickAnim >= 80 && tickAnim < 85) {
            xx = -13.7497 + (((tickAnim - 80) / 5) * (-5.75-(-13.7497)));
            yy = -0.02727 + (((tickAnim - 80) / 5) * (0-(-0.02727)));
            zz = -1.2497 + (((tickAnim - 80) / 5) * (0-(-1.2497)));
        }
        else if (tickAnim >= 85 && tickAnim < 132) {
            xx = -5.75 + (((tickAnim - 85) / 47) * (0-(-5.75)));
            yy = 0 + (((tickAnim - 85) / 47) * (0-(0)));
            zz = 0 + (((tickAnim - 85) / 47) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 80) {
            xx = 0 + (((tickAnim - 0) / 80) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 80) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 80) * (1.675-(0)));
        }
        else if (tickAnim >= 80 && tickAnim < 132) {
            xx = 0 + (((tickAnim - 80) / 52) * (0-(0)));
            yy = 0 + (((tickAnim - 80) / 52) * (0-(0)));
            zz = 1.675 + (((tickAnim - 80) / 52) * (0-(1.675)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.head.rotationPointX = this.head.rotationPointX + (float)(xx);
        this.head.rotationPointY = this.head.rotationPointY - (float)(yy);
        this.head.rotationPointZ = this.head.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 65) {
            xx = 0 + (((tickAnim - 0) / 65) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 65) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 65) * (0-(0)));
        }
        else if (tickAnim >= 65 && tickAnim < 80) {
            xx = 0 + (((tickAnim - 65) / 15) * (21.25-(0)));
            yy = 0 + (((tickAnim - 65) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 65) / 15) * (0-(0)));
        }
        else if (tickAnim >= 80 && tickAnim < 85) {
            xx = 21.25 + (((tickAnim - 80) / 5) * (0-(21.25)));
            yy = 0 + (((tickAnim - 80) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 80) / 5) * (0-(0)));
        }
        else if (tickAnim >= 85 && tickAnim < 132) {
            xx = 0 + (((tickAnim - 85) / 47) * (0-(0)));
            yy = 0 + (((tickAnim - 85) / 47) * (0-(0)));
            zz = 0 + (((tickAnim - 85) / 47) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(xx), jaw.rotateAngleY + (float) Math.toRadians(yy), jaw.rotateAngleZ + (float) Math.toRadians(zz));



    }

    public void animNest(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraLusotitan entity = (EntityPrehistoricFloraLusotitan) entitylivingbaseIn;
        int animCycle = 50;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (13.5-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 31) {
            xx = 13.5 + (((tickAnim - 15) / 16) * (-9.61143-(13.5)));
            yy = 0 + (((tickAnim - 15) / 16) * (-2.12196-(0)));
            zz = 0 + (((tickAnim - 15) / 16) * (0.24409-(0)));
        }
        else if (tickAnim >= 31 && tickAnim < 35) {
            xx = -9.61143 + (((tickAnim - 31) / 4) * (-8.13-(-9.61143)));
            yy = -2.12196 + (((tickAnim - 31) / 4) * (0-(-2.12196)));
            zz = 0.24409 + (((tickAnim - 31) / 4) * (0-(0.24409)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = -8.13 + (((tickAnim - 35) / 15) * (0-(-8.13)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg, leftLeg.rotateAngleX + (float) Math.toRadians(xx), leftLeg.rotateAngleY + (float) Math.toRadians(yy), leftLeg.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (-0.925-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            yy = -0.925 + (((tickAnim - 15) / 20) * (-0.095-(-0.925)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 37) {
            xx = 0 + (((tickAnim - 35) / 2) * (0-(0)));
            yy = -0.095 + (((tickAnim - 35) / 2) * (-0.03-(-0.095)));
            zz = 0 + (((tickAnim - 35) / 2) * (0-(0)));
        }
        else if (tickAnim >= 37 && tickAnim < 38) {
            xx = 0 + (((tickAnim - 37) / 1) * (0-(0)));
            yy = -0.03 + (((tickAnim - 37) / 1) * (0.11-(-0.03)));
            zz = 0 + (((tickAnim - 37) / 1) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 38) / 2) * (0-(0)));
            yy = 0.11 + (((tickAnim - 38) / 2) * (-0.11-(0.11)));
            zz = 0 + (((tickAnim - 38) / 2) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 42) {
            xx = 0 + (((tickAnim - 40) / 2) * (0-(0)));
            yy = -0.11 + (((tickAnim - 40) / 2) * (0.11-(-0.11)));
            zz = 0 + (((tickAnim - 40) / 2) * (0-(0)));
        }
        else if (tickAnim >= 42 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 42) / 8) * (0-(0)));
            yy = 0.11 + (((tickAnim - 42) / 8) * (0-(0.11)));
            zz = 0 + (((tickAnim - 42) / 8) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftLeg.rotationPointX = this.leftLeg.rotationPointX + (float)(xx);
        this.leftLeg.rotationPointY = this.leftLeg.rotationPointY - (float)(yy);
        this.leftLeg.rotationPointZ = this.leftLeg.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (13.25-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = 13.25 + (((tickAnim - 15) / 20) * (-18.5-(13.25)));
            yy = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = -18.5 + (((tickAnim - 35) / 15) * (0-(-18.5)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg2, leftLeg2.rotateAngleX + (float) Math.toRadians(xx), leftLeg2.rotateAngleY + (float) Math.toRadians(yy), leftLeg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 15) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 15) / 10) * (5.725-(0)));
            zz = 0 + (((tickAnim - 15) / 10) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 25) / 10) * (0-(0)));
            yy = 5.725 + (((tickAnim - 25) / 10) * (0-(5.725)));
            zz = 0 + (((tickAnim - 25) / 10) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftLeg2.rotationPointX = this.leftLeg2.rotationPointX + (float)(xx);
        this.leftLeg2.rotationPointY = this.leftLeg2.rotationPointY - (float)(yy);
        this.leftLeg2.rotationPointZ = this.leftLeg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (10.25-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 25) {
            xx = 10.25 + (((tickAnim - 15) / 10) * (35.25-(10.25)));
            yy = 0 + (((tickAnim - 15) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 10) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 32) {
            xx = 35.25 + (((tickAnim - 25) / 7) * (16.77-(35.25)));
            yy = 0 + (((tickAnim - 25) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 7) * (0-(0)));
        }
        else if (tickAnim >= 32 && tickAnim < 35) {
            xx = 16.77 + (((tickAnim - 32) / 3) * (26-(16.77)));
            yy = 0 + (((tickAnim - 32) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 32) / 3) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 26 + (((tickAnim - 35) / 15) * (0-(26)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg3, leftLeg3.rotateAngleX + (float) Math.toRadians(xx), leftLeg3.rotateAngleY + (float) Math.toRadians(yy), leftLeg3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (-31.41032-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (14.84252-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (-8.8905-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 25) {
            xx = -31.41032 + (((tickAnim - 15) / 10) * (0-(-31.41032)));
            yy = 14.84252 + (((tickAnim - 15) / 10) * (0-(14.84252)));
            zz = -8.8905 + (((tickAnim - 15) / 10) * (0-(-8.8905)));
        }
        else if (tickAnim >= 25 && tickAnim < 32) {
            xx = 0 + (((tickAnim - 25) / 7) * (-9.71717-(0)));
            yy = 0 + (((tickAnim - 25) / 7) * (12.07945-(0)));
            zz = 0 + (((tickAnim - 25) / 7) * (-2.05234-(0)));
        }
        else if (tickAnim >= 32 && tickAnim < 35) {
            xx = -9.71717 + (((tickAnim - 32) / 3) * (0-(-9.71717)));
            yy = 12.07945 + (((tickAnim - 32) / 3) * (0-(12.07945)));
            zz = -2.05234 + (((tickAnim - 32) / 3) * (0-(-2.05234)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg4, leftLeg4.rotateAngleX + (float) Math.toRadians(xx), leftLeg4.rotateAngleY + (float) Math.toRadians(yy), leftLeg4.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (-0.1-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (-1.9-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 15) / 10) * (0-(0)));
            yy = -0.1 + (((tickAnim - 15) / 10) * (0-(-0.1)));
            zz = -1.9 + (((tickAnim - 15) / 10) * (0-(-1.9)));
        }
        else if (tickAnim >= 25 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 25) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 25) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 10) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftLeg4.rotationPointX = this.leftLeg4.rotationPointX + (float)(xx);
        this.leftLeg4.rotationPointY = this.leftLeg4.rotationPointY - (float)(yy);
        this.leftLeg4.rotationPointZ = this.leftLeg4.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 0) / 28) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1.625+50))*1-(0)));
            yy = 0 + (((tickAnim - 0) / 28) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1.625+50))*2-(0)));
            zz = 0 + (((tickAnim - 0) / 28) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1.625+50))*1-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 50) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1.625+50))*1 + (((tickAnim - 28) / 22) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1.625+50))*1)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1.625+50))*2 + (((tickAnim - 28) / 22) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1.625+50))*2)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1.625+50))*1 + (((tickAnim - 28) / 22) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1.625+50))*1)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail1, tail1.rotateAngleX + (float) Math.toRadians(xx), tail1.rotateAngleY + (float) Math.toRadians(yy), tail1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 0) / 28) * (-4.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1.625))*0.5-(0)));
            yy = 0 + (((tickAnim - 0) / 28) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1.625))*1-(0)));
            zz = 0 + (((tickAnim - 0) / 28) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1.625))*1-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 50) {
            xx = -4.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1.625))*0.5 + (((tickAnim - 28) / 22) * (0-(-4.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1.625))*0.5)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1.625))*1 + (((tickAnim - 28) / 22) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1.625))*1)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1.625))*1 + (((tickAnim - 28) / 22) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1.625))*1)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(xx), tail2.rotateAngleY + (float) Math.toRadians(yy), tail2.rotateAngleZ + (float) Math.toRadians(zz));

        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(xx), tail3.rotateAngleY + (float) Math.toRadians(yy), tail3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 0) / 28) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1.625-70))*1.5-(0)));
            yy = 0 + (((tickAnim - 0) / 28) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1.625-70))*2-(0)));
            zz = 0 + (((tickAnim - 0) / 28) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1.625-70))*1.5-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 50) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1.625-70))*1.5 + (((tickAnim - 28) / 22) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1.625-70))*1.5)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1.625-70))*2 + (((tickAnim - 28) / 22) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1.625-70))*2)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1.625-70))*1.5 + (((tickAnim - 28) / 22) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1.625-70))*1.5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(xx), tail4.rotateAngleY + (float) Math.toRadians(yy), tail4.rotateAngleZ + (float) Math.toRadians(zz));
        this.setRotateAngle(tail5, tail5.rotateAngleX + (float) Math.toRadians(xx), tail5.rotateAngleY + (float) Math.toRadians(yy), tail5.rotateAngleZ + (float) Math.toRadians(zz));

        this.setRotateAngle(tail6, tail6.rotateAngleX + (float) Math.toRadians(xx), tail6.rotateAngleY + (float) Math.toRadians(yy), tail6.rotateAngleZ + (float) Math.toRadians(zz));

        this.setRotateAngle(tail7, tail7.rotateAngleX + (float) Math.toRadians(xx), tail7.rotateAngleY + (float) Math.toRadians(yy), tail7.rotateAngleZ + (float) Math.toRadians(zz));



    }

    public void animLay(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraLusotitan entity = (EntityPrehistoricFloraLusotitan) entitylivingbaseIn;
        int animCycle = 50;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (-9-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 33) {
            xx = -9 + (((tickAnim - 18) / 15) * (-9-(-9)));
            yy = 0 + (((tickAnim - 18) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 15) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 50) {
            xx = -9 + (((tickAnim - 33) / 17) * (0-(-9)));
            yy = 0 + (((tickAnim - 33) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 17) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(hips, hips.rotateAngleX + (float) Math.toRadians(xx), hips.rotateAngleY + (float) Math.toRadians(yy), hips.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (-10-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (2.5-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 18) / 15) * (0-(0)));
            yy = -10 + (((tickAnim - 18) / 15) * (-10-(-10)));
            zz = 2.5 + (((tickAnim - 18) / 15) * (2.5-(2.5)));
        }
        else if (tickAnim >= 33 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 33) / 17) * (0-(0)));
            yy = -10 + (((tickAnim - 33) / 17) * (0-(-10)));
            zz = 2.5 + (((tickAnim - 33) / 17) * (0-(2.5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.hips.rotationPointX = this.hips.rotationPointX + (float)(xx);
        this.hips.rotationPointY = this.hips.rotationPointY - (float)(yy);
        this.hips.rotationPointZ = this.hips.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (-9.83745-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (4.49559-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (1.61069-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 33) {
            xx = -9.83745 + (((tickAnim - 18) / 15) * (-9.83745-(-9.83745)));
            yy = 4.49559 + (((tickAnim - 18) / 15) * (4.49559-(4.49559)));
            zz = 1.61069 + (((tickAnim - 18) / 15) * (1.61069-(1.61069)));
        }
        else if (tickAnim >= 33 && tickAnim < 50) {
            xx = -9.83745 + (((tickAnim - 33) / 17) * (0-(-9.83745)));
            yy = 4.49559 + (((tickAnim - 33) / 17) * (0-(4.49559)));
            zz = 1.61069 + (((tickAnim - 33) / 17) * (0-(1.61069)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg, rightLeg.rotateAngleX + (float) Math.toRadians(xx), rightLeg.rotateAngleY + (float) Math.toRadians(yy), rightLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (34.25-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 33) {
            xx = 34.25 + (((tickAnim - 18) / 15) * (34.25-(34.25)));
            yy = 0 + (((tickAnim - 18) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 15) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 50) {
            xx = 34.25 + (((tickAnim - 33) / 17) * (0-(34.25)));
            yy = 0 + (((tickAnim - 33) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 17) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg2, rightLeg2.rotateAngleX + (float) Math.toRadians(xx), rightLeg2.rotateAngleY + (float) Math.toRadians(yy), rightLeg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (3.4-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (-1.25-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 18) / 15) * (0-(0)));
            yy = 3.4 + (((tickAnim - 18) / 15) * (3.4-(3.4)));
            zz = -1.25 + (((tickAnim - 18) / 15) * (-1.25-(-1.25)));
        }
        else if (tickAnim >= 33 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 33) / 17) * (0-(0)));
            yy = 3.4 + (((tickAnim - 33) / 17) * (0-(3.4)));
            zz = -1.25 + (((tickAnim - 33) / 17) * (0-(-1.25)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightLeg2.rotationPointX = this.rightLeg2.rotationPointX + (float)(xx);
        this.rightLeg2.rotationPointY = this.rightLeg2.rotationPointY - (float)(yy);
        this.rightLeg2.rotationPointZ = this.rightLeg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (-13.5-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 33) {
            xx = -13.5 + (((tickAnim - 18) / 15) * (-13.5-(-13.5)));
            yy = 0 + (((tickAnim - 18) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 15) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 50) {
            xx = -13.5 + (((tickAnim - 33) / 17) * (0-(-13.5)));
            yy = 0 + (((tickAnim - 33) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 17) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg3, rightLeg3.rotateAngleX + (float) Math.toRadians(xx), rightLeg3.rotateAngleY + (float) Math.toRadians(yy), rightLeg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (1.375-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0.5-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 18) / 15) * (0-(0)));
            yy = 1.375 + (((tickAnim - 18) / 15) * (1.375-(1.375)));
            zz = 0.5 + (((tickAnim - 18) / 15) * (0.5-(0.5)));
        }
        else if (tickAnim >= 33 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 33) / 17) * (0-(0)));
            yy = 1.375 + (((tickAnim - 33) / 17) * (0-(1.375)));
            zz = 0.5 + (((tickAnim - 33) / 17) * (0-(0.5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightLeg3.rotationPointX = this.rightLeg3.rotationPointX + (float)(xx);
        this.rightLeg3.rotationPointY = this.rightLeg3.rotationPointY - (float)(yy);
        this.rightLeg3.rotationPointZ = this.rightLeg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 18) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 18) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 15) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 33) / 17) * (0-(0)));
            yy = 0 + (((tickAnim - 33) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 17) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg4, rightLeg4.rotateAngleX + (float) Math.toRadians(xx), rightLeg4.rotateAngleY + (float) Math.toRadians(yy), rightLeg4.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 18 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 18) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 18) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightLeg4.rotationPointX = this.rightLeg4.rotationPointX + (float)(xx);
        this.rightLeg4.rotationPointY = this.rightLeg4.rotationPointY - (float)(yy);
        this.rightLeg4.rotationPointZ = this.rightLeg4.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (-9.92693-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (-3.25553-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (-0.84354-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 33) {
            xx = -9.92693 + (((tickAnim - 18) / 15) * (-9.92693-(-9.92693)));
            yy = -3.25553 + (((tickAnim - 18) / 15) * (-3.25553-(-3.25553)));
            zz = -0.84354 + (((tickAnim - 18) / 15) * (-0.84354-(-0.84354)));
        }
        else if (tickAnim >= 33 && tickAnim < 50) {
            xx = -9.92693 + (((tickAnim - 33) / 17) * (0-(-9.92693)));
            yy = -3.25553 + (((tickAnim - 33) / 17) * (0-(-3.25553)));
            zz = -0.84354 + (((tickAnim - 33) / 17) * (0-(-0.84354)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg, leftLeg.rotateAngleX + (float) Math.toRadians(xx), leftLeg.rotateAngleY + (float) Math.toRadians(yy), leftLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (34.25-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 33) {
            xx = 34.25 + (((tickAnim - 18) / 15) * (34.25-(34.25)));
            yy = 0 + (((tickAnim - 18) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 15) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 50) {
            xx = 34.25 + (((tickAnim - 33) / 17) * (0-(34.25)));
            yy = 0 + (((tickAnim - 33) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 17) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg2, leftLeg2.rotateAngleX + (float) Math.toRadians(xx), leftLeg2.rotateAngleY + (float) Math.toRadians(yy), leftLeg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (3.4-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (-1.25-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 18) / 15) * (0-(0)));
            yy = 3.4 + (((tickAnim - 18) / 15) * (3.4-(3.4)));
            zz = -1.25 + (((tickAnim - 18) / 15) * (-1.25-(-1.25)));
        }
        else if (tickAnim >= 33 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 33) / 17) * (0-(0)));
            yy = 3.4 + (((tickAnim - 33) / 17) * (0-(3.4)));
            zz = -1.25 + (((tickAnim - 33) / 17) * (0-(-1.25)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftLeg2.rotationPointX = this.leftLeg2.rotationPointX + (float)(xx);
        this.leftLeg2.rotationPointY = this.leftLeg2.rotationPointY - (float)(yy);
        this.leftLeg2.rotationPointZ = this.leftLeg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (-13.5-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 33) {
            xx = -13.5 + (((tickAnim - 18) / 15) * (-13.5-(-13.5)));
            yy = 0 + (((tickAnim - 18) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 15) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 50) {
            xx = -13.5 + (((tickAnim - 33) / 17) * (0-(-13.5)));
            yy = 0 + (((tickAnim - 33) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 17) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg3, leftLeg3.rotateAngleX + (float) Math.toRadians(xx), leftLeg3.rotateAngleY + (float) Math.toRadians(yy), leftLeg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (1.375-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0.5-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 18) / 15) * (0-(0)));
            yy = 1.375 + (((tickAnim - 18) / 15) * (1.375-(1.375)));
            zz = 0.5 + (((tickAnim - 18) / 15) * (0.5-(0.5)));
        }
        else if (tickAnim >= 33 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 33) / 17) * (0-(0)));
            yy = 1.375 + (((tickAnim - 33) / 17) * (0-(1.375)));
            zz = 0.5 + (((tickAnim - 33) / 17) * (0-(0.5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftLeg3.rotationPointX = this.leftLeg3.rotationPointX + (float)(xx);
        this.leftLeg3.rotationPointY = this.leftLeg3.rotationPointY - (float)(yy);
        this.leftLeg3.rotationPointZ = this.leftLeg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 18) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 18) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 15) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 33) / 17) * (0-(0)));
            yy = 0 + (((tickAnim - 33) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 17) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg4, leftLeg4.rotateAngleX + (float) Math.toRadians(xx), leftLeg4.rotateAngleY + (float) Math.toRadians(yy), leftLeg4.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 18 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 18) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 18) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftLeg4.rotationPointX = this.leftLeg4.rotationPointX + (float)(xx);
        this.leftLeg4.rotationPointY = this.leftLeg4.rotationPointY - (float)(yy);
        this.leftLeg4.rotationPointZ = this.leftLeg4.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (-11-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 33) {
            xx = -11 + (((tickAnim - 18) / 15) * (-11-(-11)));
            yy = 0 + (((tickAnim - 18) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 15) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 50) {
            xx = -11 + (((tickAnim - 33) / 17) * (0-(-11)));
            yy = 0 + (((tickAnim - 33) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 17) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail1, tail1.rotateAngleX + (float) Math.toRadians(xx), tail1.rotateAngleY + (float) Math.toRadians(yy), tail1.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (-0.175-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 18) / 15) * (0-(0)));
            yy = -0.175 + (((tickAnim - 18) / 15) * (-0.175-(-0.175)));
            zz = 0 + (((tickAnim - 18) / 15) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 33) / 17) * (0-(0)));
            yy = -0.175 + (((tickAnim - 33) / 17) * (0-(-0.175)));
            zz = 0 + (((tickAnim - 33) / 17) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.tail1.rotationPointX = this.tail1.rotationPointX + (float)(xx);
        this.tail1.rotationPointY = this.tail1.rotationPointY - (float)(yy);
        this.tail1.rotationPointZ = this.tail1.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (-5.5-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 33) {
            xx = -5.5 + (((tickAnim - 18) / 15) * (-5.5-(-5.5)));
            yy = 0 + (((tickAnim - 18) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 15) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 50) {
            xx = -5.5 + (((tickAnim - 33) / 17) * (0-(-5.5)));
            yy = 0 + (((tickAnim - 33) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 17) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(xx), tail2.rotateAngleY + (float) Math.toRadians(yy), tail2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (-1.84289-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (-7.76937-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (-2.49499-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 33) {
            xx = -1.84289 + (((tickAnim - 18) / 15) * (-1.84289-(-1.84289)));
            yy = -7.76937 + (((tickAnim - 18) / 15) * (-7.76937-(-7.76937)));
            zz = -2.49499 + (((tickAnim - 18) / 15) * (-2.49499-(-2.49499)));
        }
        else if (tickAnim >= 33 && tickAnim < 50) {
            xx = -1.84289 + (((tickAnim - 33) / 17) * (0-(-1.84289)));
            yy = -7.76937 + (((tickAnim - 33) / 17) * (0-(-7.76937)));
            zz = -2.49499 + (((tickAnim - 33) / 17) * (0-(-2.49499)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(xx), tail3.rotateAngleY + (float) Math.toRadians(yy), tail3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (2.55-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (-12.45498-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (-2.74871-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 33) {
            xx = 2.55 + (((tickAnim - 18) / 15) * (2.55-(2.55)));
            yy = -12.45498 + (((tickAnim - 18) / 15) * (-12.45498-(-12.45498)));
            zz = -2.74871 + (((tickAnim - 18) / 15) * (-2.74871-(-2.74871)));
        }
        else if (tickAnim >= 33 && tickAnim < 50) {
            xx = 2.55 + (((tickAnim - 33) / 17) * (0-(2.55)));
            yy = -12.45498 + (((tickAnim - 33) / 17) * (0-(-12.45498)));
            zz = -2.74871 + (((tickAnim - 33) / 17) * (0-(-2.74871)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(xx), tail4.rotateAngleY + (float) Math.toRadians(yy), tail4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (18.04361-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (-4.35142-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (-1.14792-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 33) {
            xx = 18.04361 + (((tickAnim - 18) / 15) * (18.04361-(18.04361)));
            yy = -4.35142 + (((tickAnim - 18) / 15) * (-4.35142-(-4.35142)));
            zz = -1.14792 + (((tickAnim - 18) / 15) * (-1.14792-(-1.14792)));
        }
        else if (tickAnim >= 33 && tickAnim < 50) {
            xx = 18.04361 + (((tickAnim - 33) / 17) * (0-(18.04361)));
            yy = -4.35142 + (((tickAnim - 33) / 17) * (0-(-4.35142)));
            zz = -1.14792 + (((tickAnim - 33) / 17) * (0-(-1.14792)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail5, tail5.rotateAngleX + (float) Math.toRadians(xx), tail5.rotateAngleY + (float) Math.toRadians(yy), tail5.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (1.28571-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (-7.85714-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
            xx = 1.28571 + (((tickAnim - 13) / 5) * (2.75-(1.28571)));
            yy = 0 + (((tickAnim - 13) / 5) * (0-(0)));
            zz = -7.85714 + (((tickAnim - 13) / 5) * (-11-(-7.85714)));
        }
        else if (tickAnim >= 18 && tickAnim < 33) {
            xx = 2.75 + (((tickAnim - 18) / 15) * (2.75-(2.75)));
            yy = 0 + (((tickAnim - 18) / 15) * (0-(0)));
            zz = -11 + (((tickAnim - 18) / 15) * (-11-(-11)));
        }
        else if (tickAnim >= 33 && tickAnim < 36) {
            xx = 2.75 + (((tickAnim - 33) / 3) * (-3.56656-(2.75)));
            yy = 0 + (((tickAnim - 33) / 3) * (-1.18273-(0)));
            zz = -11 + (((tickAnim - 33) / 3) * (7.80462-(-11)));
        }
        else if (tickAnim >= 36 && tickAnim < 39) {
            xx = -3.56656 + (((tickAnim - 36) / 3) * (-4.47737-(-3.56656)));
            yy = -1.18273 + (((tickAnim - 36) / 3) * (-0.90444-(-1.18273)));
            zz = 7.80462 + (((tickAnim - 36) / 3) * (5.96824-(7.80462)));
        }
        else if (tickAnim >= 39 && tickAnim < 50) {
            xx = -4.47737 + (((tickAnim - 39) / 11) * (0-(-4.47737)));
            yy = -0.90444 + (((tickAnim - 39) / 11) * (0-(-0.90444)));
            zz = 5.96824 + (((tickAnim - 39) / 11) * (0-(5.96824)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail6, tail6.rotateAngleX + (float) Math.toRadians(xx), tail6.rotateAngleY + (float) Math.toRadians(yy), tail6.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (-3.29-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
            xx = -3.29 + (((tickAnim - 13) / 5) * (8-(-3.29)));
            yy = 0 + (((tickAnim - 13) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 5) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 33) {
            xx = 8 + (((tickAnim - 18) / 15) * (8-(8)));
            yy = 0 + (((tickAnim - 18) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 15) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 36) {
            xx = 8 + (((tickAnim - 33) / 3) * (-0.54267-(8)));
            yy = 0 + (((tickAnim - 33) / 3) * (-7.7499-(0)));
            zz = 0 + (((tickAnim - 33) / 3) * (0.03947-(0)));
        }
        else if (tickAnim >= 36 && tickAnim < 39) {
            xx = -0.54267 + (((tickAnim - 36) / 3) * (-8.74513-(-0.54267)));
            yy = -7.7499 + (((tickAnim - 36) / 3) * (-5.60464-(-7.7499)));
            zz = 0.03947 + (((tickAnim - 36) / 3) * (5.80039-(0.03947)));
        }
        else if (tickAnim >= 39 && tickAnim < 50) {
            xx = -8.74513 + (((tickAnim - 39) / 11) * (0-(-8.74513)));
            yy = -5.60464 + (((tickAnim - 39) / 11) * (0-(-5.60464)));
            zz = 5.80039 + (((tickAnim - 39) / 11) * (0-(5.80039)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail7, tail7.rotateAngleX + (float) Math.toRadians(xx), tail7.rotateAngleY + (float) Math.toRadians(yy), tail7.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 0) / 50) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 50) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 50) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(xx), body.rotateAngleY + (float) Math.toRadians(yy), body.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 0) / 50) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 50) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 50) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(xx), chest.rotateAngleY + (float) Math.toRadians(yy), chest.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (13-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = 13 + (((tickAnim - 8) / 5) * (17-(13)));
            yy = 0 + (((tickAnim - 8) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 5) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 33) {
            xx = 17 + (((tickAnim - 13) / 20) * (17-(17)));
            yy = 0 + (((tickAnim - 13) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 20) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 41) {
            xx = 17 + (((tickAnim - 33) / 8) * (5.25-(17)));
            yy = 0 + (((tickAnim - 33) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 8) * (0-(0)));
        }
        else if (tickAnim >= 41 && tickAnim < 50) {
            xx = 5.25 + (((tickAnim - 41) / 9) * (0-(5.25)));
            yy = 0 + (((tickAnim - 41) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 41) / 9) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm, leftArm.rotateAngleX + (float) Math.toRadians(xx), leftArm.rotateAngleY + (float) Math.toRadians(yy), leftArm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (-17.5-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 11) {
            xx = -17.5 + (((tickAnim - 7) / 4) * (3-(-17.5)));
            yy = 0 + (((tickAnim - 7) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 4) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 33) {
            xx = 3 + (((tickAnim - 11) / 22) * (3-(3)));
            yy = 0 + (((tickAnim - 11) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 22) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 37) {
            xx = 3 + (((tickAnim - 33) / 4) * (-20-(3)));
            yy = 0 + (((tickAnim - 33) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 4) * (0-(0)));
        }
        else if (tickAnim >= 37 && tickAnim < 41) {
            xx = -20 + (((tickAnim - 37) / 4) * (0-(-20)));
            yy = 0 + (((tickAnim - 37) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 37) / 4) * (0-(0)));
        }
        else if (tickAnim >= 41 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 41) / 9) * (0-(0)));
            yy = 0 + (((tickAnim - 41) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 41) / 9) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm2, leftArm2.rotateAngleX + (float) Math.toRadians(xx), leftArm2.rotateAngleY + (float) Math.toRadians(yy), leftArm2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 0) / 33) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 33) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 33) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 41) {
            xx = 0 + (((tickAnim - 33) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 33) / 8) * (0.775-(0)));
            zz = 0 + (((tickAnim - 33) / 8) * (0-(0)));
        }
        else if (tickAnim >= 41 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 41) / 9) * (0-(0)));
            yy = 0.775 + (((tickAnim - 41) / 9) * (0-(0.775)));
            zz = 0 + (((tickAnim - 41) / 9) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftArm2.rotationPointX = this.leftArm2.rotationPointX + (float)(xx);
        this.leftArm2.rotationPointY = this.leftArm2.rotationPointY - (float)(yy);
        this.leftArm2.rotationPointZ = this.leftArm2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (37-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 11) {
            xx = 37 + (((tickAnim - 7) / 4) * (-8-(37)));
            yy = 0 + (((tickAnim - 7) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 4) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 33) {
            xx = -8 + (((tickAnim - 11) / 22) * (-8-(-8)));
            yy = 0 + (((tickAnim - 11) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 22) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 37) {
            xx = -8 + (((tickAnim - 33) / 4) * (45.33-(-8)));
            yy = 0 + (((tickAnim - 33) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 4) * (0-(0)));
        }
        else if (tickAnim >= 37 && tickAnim < 41) {
            xx = 45.33 + (((tickAnim - 37) / 4) * (0-(45.33)));
            yy = 0 + (((tickAnim - 37) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 37) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm3, leftArm3.rotateAngleX + (float) Math.toRadians(xx), leftArm3.rotateAngleY + (float) Math.toRadians(yy), leftArm3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 8) / 5) * (13-(0)));
            yy = 0 + (((tickAnim - 8) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 5) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 41) {
            xx = 13 + (((tickAnim - 13) / 28) * (13-(13)));
            yy = 0 + (((tickAnim - 13) / 28) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 28) * (0-(0)));
        }
        else if (tickAnim >= 41 && tickAnim < 50) {
            xx = 13 + (((tickAnim - 41) / 9) * (0-(13)));
            yy = 0 + (((tickAnim - 41) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 41) / 9) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm, rightArm.rotateAngleX + (float) Math.toRadians(xx), rightArm.rotateAngleY + (float) Math.toRadians(yy), rightArm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (-5-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = -5 + (((tickAnim - 8) / 5) * (-24-(-5)));
            yy = 0 + (((tickAnim - 8) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 5) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
            xx = -24 + (((tickAnim - 13) / 5) * (3-(-24)));
            yy = 0 + (((tickAnim - 13) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 5) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 41) {
            xx = 3 + (((tickAnim - 18) / 23) * (3-(3)));
            yy = 0 + (((tickAnim - 18) / 23) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 23) * (0-(0)));
        }
        else if (tickAnim >= 41 && tickAnim < 46) {
            xx = 3 + (((tickAnim - 41) / 5) * (-20.33-(3)));
            yy = 0 + (((tickAnim - 41) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 41) / 5) * (0-(0)));
        }
        else if (tickAnim >= 46 && tickAnim < 50) {
            xx = -20.33 + (((tickAnim - 46) / 4) * (0-(-20.33)));
            yy = 0 + (((tickAnim - 46) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 46) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm2, rightArm2.rotateAngleX + (float) Math.toRadians(xx), rightArm2.rotateAngleY + (float) Math.toRadians(yy), rightArm2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (14-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = 14 + (((tickAnim - 8) / 5) * (35-(14)));
            yy = 0 + (((tickAnim - 8) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 5) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
            xx = 35 + (((tickAnim - 13) / 5) * (-8-(35)));
            yy = 0 + (((tickAnim - 13) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 5) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 41) {
            xx = -8 + (((tickAnim - 18) / 23) * (-8-(-8)));
            yy = 0 + (((tickAnim - 18) / 23) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 23) * (0-(0)));
        }
        else if (tickAnim >= 41 && tickAnim < 46) {
            xx = -8 + (((tickAnim - 41) / 5) * (41.22-(-8)));
            yy = 0 + (((tickAnim - 41) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 41) / 5) * (0-(0)));
        }
        else if (tickAnim >= 46 && tickAnim < 50) {
            xx = 41.22 + (((tickAnim - 46) / 4) * (0-(41.22)));
            yy = 0 + (((tickAnim - 46) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 46) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm3, rightArm3.rotateAngleX + (float) Math.toRadians(xx), rightArm3.rotateAngleY + (float) Math.toRadians(yy), rightArm3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (8.75-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 33) {
            xx = 8.75 + (((tickAnim - 18) / 15) * (8.75-(8.75)));
            yy = 0 + (((tickAnim - 18) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 15) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 50) {
            xx = 8.75 + (((tickAnim - 33) / 17) * (0-(8.75)));
            yy = 0 + (((tickAnim - 33) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 17) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck1, neck1.rotateAngleX + (float) Math.toRadians(xx), neck1.rotateAngleY + (float) Math.toRadians(yy), neck1.rotateAngleZ + (float) Math.toRadians(zz));



    }

    public void animNoise(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraLusotitan entity = (EntityPrehistoricFloraLusotitan) entitylivingbaseIn;
        int animCycle = 86;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (-0.12+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150))-1-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 67) {
            xx = -0.12+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150))-1 + (((tickAnim - 20) / 47) * (-2.25-(-0.12+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150))-1)));
            yy = 0 + (((tickAnim - 20) / 47) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 47) * (0-(0)));
        }
        else if (tickAnim >= 67 && tickAnim < 87) {
            xx = -2.25 + (((tickAnim - 67) / 20) * (0-(-2.25)));
            yy = 0 + (((tickAnim - 67) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 67) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck1, neck1.rotateAngleX + (float) Math.toRadians(xx), neck1.rotateAngleY + (float) Math.toRadians(yy), neck1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 21) {
            xx = 0 + (((tickAnim - 0) / 21) * (1.025+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-1-(0)));
            yy = 0 + (((tickAnim - 0) / 21) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 21) * (0-(0)));
        }
        else if (tickAnim >= 21 && tickAnim < 66) {
            xx = 1.025+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-1 + (((tickAnim - 21) / 45) * (-3.14-(1.025+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-1)));
            yy = 0 + (((tickAnim - 21) / 45) * (0-(0)));
            zz = 0 + (((tickAnim - 21) / 45) * (0-(0)));
        }
        else if (tickAnim >= 66 && tickAnim < 87) {
            xx = -3.14 + (((tickAnim - 66) / 21) * (0-(-3.14)));
            yy = 0 + (((tickAnim - 66) / 21) * (0-(0)));
            zz = 0 + (((tickAnim - 66) / 21) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(xx), neck2.rotateAngleY + (float) Math.toRadians(yy), neck2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 22) {
            xx = 0 + (((tickAnim - 0) / 22) * (1.025+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-1-(0)));
            yy = 0 + (((tickAnim - 0) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 22) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 65) {
            xx = 1.025+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-1 + (((tickAnim - 22) / 43) * (3-(1.025+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-1)));
            yy = 0 + (((tickAnim - 22) / 43) * (0-(0)));
            zz = 0 + (((tickAnim - 22) / 43) * (0-(0)));
        }
        else if (tickAnim >= 65 && tickAnim < 87) {
            xx = 3 + (((tickAnim - 65) / 22) * (0-(3)));
            yy = 0 + (((tickAnim - 65) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 65) / 22) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(xx), neck3.rotateAngleY + (float) Math.toRadians(yy), neck3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 22) {
            xx = 0 + (((tickAnim - 0) / 22) * (1-(0)));
            yy = 0 + (((tickAnim - 0) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 22) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 63) {
            xx = 1 + (((tickAnim - 22) / 41) * (-2.5-(1)));
            yy = 0 + (((tickAnim - 22) / 41) * (0-(0)));
            zz = 0 + (((tickAnim - 22) / 41) * (0-(0)));
        }
        else if (tickAnim >= 63 && tickAnim < 87) {
            xx = -2.5 + (((tickAnim - 63) / 24) * (0-(-2.5)));
            yy = 0 + (((tickAnim - 63) / 24) * (0-(0)));
            zz = 0 + (((tickAnim - 63) / 24) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck4, neck4.rotateAngleX + (float) Math.toRadians(xx), neck4.rotateAngleY + (float) Math.toRadians(yy), neck4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 22) {
            xx = 0 + (((tickAnim - 0) / 22) * (0.75-(0)));
            yy = 0 + (((tickAnim - 0) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 22) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 62) {
            xx = 0.75 + (((tickAnim - 22) / 40) * (-2.75-(0.75)));
            yy = 0 + (((tickAnim - 22) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 22) / 40) * (0-(0)));
        }
        else if (tickAnim >= 62 && tickAnim < 87) {
            xx = -2.75 + (((tickAnim - 62) / 25) * (0-(-2.75)));
            yy = 0 + (((tickAnim - 62) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 62) / 25) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck5, neck5.rotateAngleX + (float) Math.toRadians(xx), neck5.rotateAngleY + (float) Math.toRadians(yy), neck5.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 22) {
            xx = 0 + (((tickAnim - 0) / 22) * (1.5-(0)));
            yy = 0 + (((tickAnim - 0) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 22) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 60) {
            xx = 1.5 + (((tickAnim - 22) / 38) * (-5-(1.5)));
            yy = 0 + (((tickAnim - 22) / 38) * (0-(0)));
            zz = 0 + (((tickAnim - 22) / 38) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 87) {
            xx = -5 + (((tickAnim - 60) / 27) * (0-(-5)));
            yy = 0 + (((tickAnim - 60) / 27) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 27) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck6, neck6.rotateAngleX + (float) Math.toRadians(xx), neck6.rotateAngleY + (float) Math.toRadians(yy), neck6.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 22) {
            xx = 0 + (((tickAnim - 0) / 22) * (3.7495-(0)));
            yy = 0 + (((tickAnim - 0) / 22) * (0.11884-(0)));
            zz = 0 + (((tickAnim - 0) / 22) * (-0.48567-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 59) {
            xx = 3.7495 + (((tickAnim - 22) / 37) * (-1.44857-(3.7495)));
            yy = 0.11884 + (((tickAnim - 22) / 37) * (0.06967-(0.11884)));
            zz = -0.48567 + (((tickAnim - 22) / 37) * (-0.2847-(-0.48567)));
        }
        else if (tickAnim >= 59 && tickAnim < 87) {
            xx = -1.44857 + (((tickAnim - 59) / 28) * (0-(-1.44857)));
            yy = 0.06967 + (((tickAnim - 59) / 28) * (0-(0.06967)));
            zz = -0.2847 + (((tickAnim - 59) / 28) * (0-(-0.2847)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck7, neck7.rotateAngleX + (float) Math.toRadians(xx), neck7.rotateAngleY + (float) Math.toRadians(yy), neck7.rotateAngleZ + (float) Math.toRadians(zz));

        this.neck7.rotationPointX = this.neck7.rotationPointX + (float)(0);
        this.neck7.rotationPointY = this.neck7.rotationPointY - (float)(0);
        this.neck7.rotationPointZ = this.neck7.rotationPointZ + (float)(0);



        if (tickAnim >= 0 && tickAnim < 22) {
            xx = 0 + (((tickAnim - 0) / 22) * (2.22926-(0)));
            yy = 0 + (((tickAnim - 0) / 22) * (1.04638-(0)));
            zz = 0 + (((tickAnim - 0) / 22) * (-2.27061-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 57) {
            xx = 2.22926 + (((tickAnim - 22) / 35) * (-0.52074-(2.22926)));
            yy = 1.04638 + (((tickAnim - 22) / 35) * (1.04638-(1.04638)));
            zz = -2.27061 + (((tickAnim - 22) / 35) * (-2.27061-(-2.27061)));
        }
        else if (tickAnim >= 57 && tickAnim < 87) {
            xx = -0.52074 + (((tickAnim - 57) / 30) * (0-(-0.52074)));
            yy = 1.04638 + (((tickAnim - 57) / 30) * (0-(1.04638)));
            zz = -2.27061 + (((tickAnim - 57) / 30) * (0-(-2.27061)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck8, neck8.rotateAngleX + (float) Math.toRadians(xx), neck8.rotateAngleY + (float) Math.toRadians(yy), neck8.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 22) {
            xx = 0 + (((tickAnim - 0) / 22) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 22) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 57) {
            xx = 0 + (((tickAnim - 22) / 35) * (0-(0)));
            yy = 0 + (((tickAnim - 22) / 35) * (0-(0)));
            zz = 0 + (((tickAnim - 22) / 35) * (0-(0)));
        }
        else if (tickAnim >= 57 && tickAnim < 87) {
            xx = 0 + (((tickAnim - 57) / 30) * (0-(0)));
            yy = 0 + (((tickAnim - 57) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 57) / 30) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.neck8.rotationPointX = this.neck8.rotationPointX + (float)(xx);
        this.neck8.rotationPointY = this.neck8.rotationPointY - (float)(yy);
        this.neck8.rotationPointZ = this.neck8.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 22) {
            xx = 0 + (((tickAnim - 0) / 22) * (2.4651-(0)));
            yy = 0 + (((tickAnim - 0) / 22) * (1.03449-(0)));
            zz = 0 + (((tickAnim - 0) / 22) * (-3.86412-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 53) {
            xx = 2.4651 + (((tickAnim - 22) / 31) * (-3.0349-(2.4651)));
            yy = 1.03449 + (((tickAnim - 22) / 31) * (1.03449-(1.03449)));
            zz = -3.86412 + (((tickAnim - 22) / 31) * (-3.86412-(-3.86412)));
        }
        else if (tickAnim >= 53 && tickAnim < 87) {
            xx = -3.0349 + (((tickAnim - 53) / 34) * (0-(-3.0349)));
            yy = 1.03449 + (((tickAnim - 53) / 34) * (0-(1.03449)));
            zz = -3.86412 + (((tickAnim - 53) / 34) * (0-(-3.86412)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 22) {
            xx = 0 + (((tickAnim - 0) / 22) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 22) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 53) {
            xx = 0 + (((tickAnim - 22) / 31) * (0-(0)));
            yy = 0 + (((tickAnim - 22) / 31) * (0-(0)));
            zz = 0 + (((tickAnim - 22) / 31) * (0.525-(0)));
        }
        else if (tickAnim >= 53 && tickAnim < 87) {
            xx = 0 + (((tickAnim - 53) / 34) * (0-(0)));
            yy = 0 + (((tickAnim - 53) / 34) * (0-(0)));
            zz = 0.525 + (((tickAnim - 53) / 34) * (0-(0.525)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.head.rotationPointX = this.head.rotationPointX + (float)(xx);
        this.head.rotationPointY = this.head.rotationPointY - (float)(yy);
        this.head.rotationPointZ = this.head.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 22) {
            xx = 0 + (((tickAnim - 0) / 22) * (5.25-(0)));
            yy = 0 + (((tickAnim - 0) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 22) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 46) {
            xx = 5.25 + (((tickAnim - 22) / 24) * (20.25-(5.25)));
            yy = 0 + (((tickAnim - 22) / 24) * (0-(0)));
            zz = 0 + (((tickAnim - 22) / 24) * (0-(0)));
        }
        else if (tickAnim >= 46 && tickAnim < 87) {
            xx = 20.25 + (((tickAnim - 46) / 41) * (0-(20.25)));
            yy = 0 + (((tickAnim - 46) / 41) * (0-(0)));
            zz = 0 + (((tickAnim - 46) / 41) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(xx), jaw.rotateAngleY + (float) Math.toRadians(yy), jaw.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 22 && tickAnim < 46) {
            xx = 0 + (((tickAnim - 22) / 24) * (0-(0)));
            yy = 0 + (((tickAnim - 22) / 24) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.15))*0.1-(0)));
            zz = 0 + (((tickAnim - 22) / 24) * (0-(0)));
        }
        else if (tickAnim >= 46 && tickAnim < 87) {
            xx = 0 + (((tickAnim - 46) / 41) * (0-(0)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.15))*0.1 + (((tickAnim - 46) / 41) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.15))*0.1)));
            zz = 0 + (((tickAnim - 46) / 41) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.jaw.rotationPointX = this.jaw.rotationPointX + (float)(xx);
        this.jaw.rotationPointY = this.jaw.rotationPointY - (float)(yy);
        this.jaw.rotationPointZ = this.jaw.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 53) {
            xx = 0 + (((tickAnim - 0) / 53) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 53) * (0.875-(0)));
            zz = 0 + (((tickAnim - 0) / 53) * (0-(0)));
        }
        else if (tickAnim >= 53 && tickAnim < 87) {
            xx = 0 + (((tickAnim - 53) / 34) * (0-(0)));
            yy = 0.875 + (((tickAnim - 53) / 34) * (0-(0.875)));
            zz = 0 + (((tickAnim - 53) / 34) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.throat.rotationPointX = this.throat.rotationPointX + (float)(xx);
        this.throat.rotationPointY = this.throat.rotationPointY - (float)(yy);
        this.throat.rotationPointZ = this.throat.rotationPointZ + (float)(zz);



    }

    public void animAttack(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraLusotitan entity = (EntityPrehistoricFloraLusotitan) entitylivingbaseIn;
        int animCycle = 20;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
     if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (1.275+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-20))*-2-(0)));
            yy = 0.025 + (((tickAnim - 0) / 10) * (-1.925+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-20))*3-(0.025)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 1.275+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-20))*-2 + (((tickAnim - 10) / 10) * (0-(1.275+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-20))*-2)));
            yy = -1.925+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-20))*3 + (((tickAnim - 10) / 10) * (0.025-(-1.925+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-20))*3)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(hips, hips.rotateAngleX + (float) Math.toRadians(xx), hips.rotateAngleY + (float) Math.toRadians(yy), hips.rotateAngleZ + (float) Math.toRadians(zz));

        this.hips.rotationPointX = this.hips.rotationPointX + (float)(0);
        this.hips.rotationPointY = this.hips.rotationPointY - (float)(0);
        this.hips.rotationPointZ = this.hips.rotationPointZ + (float)(0);



        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg, rightLeg.rotateAngleX + (float) Math.toRadians(xx), rightLeg.rotateAngleY + (float) Math.toRadians(yy), rightLeg.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (-0.875-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            yy = -0.875 + (((tickAnim - 10) / 10) * (0-(-0.875)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightLeg.rotationPointX = this.rightLeg.rotationPointX + (float)(xx);
        this.rightLeg.rotationPointY = this.rightLeg.rotationPointY - (float)(yy);
        this.rightLeg.rotationPointZ = this.rightLeg.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg, leftLeg.rotateAngleX + (float) Math.toRadians(xx), leftLeg.rotateAngleY + (float) Math.toRadians(yy), leftLeg.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (-0.875-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            yy = -0.875 + (((tickAnim - 10) / 10) * (0-(-0.875)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftLeg.rotationPointX = this.leftLeg.rotationPointX + (float)(xx);
        this.leftLeg.rotationPointY = this.leftLeg.rotationPointY - (float)(yy);
        this.leftLeg.rotationPointZ = this.leftLeg.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (1.5-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            yy = 1.5 + (((tickAnim - 5) / 5) * (3-(1.5)));
            zz = 0 + (((tickAnim - 5) / 5) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            yy = 3 + (((tickAnim - 10) / 10) * (0-(3)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail1, tail1.rotateAngleX + (float) Math.toRadians(xx), tail1.rotateAngleY + (float) Math.toRadians(yy), tail1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (-1.5-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            yy = -1.5 + (((tickAnim - 5) / 5) * (-3.5-(-1.5)));
            zz = 0 + (((tickAnim - 5) / 5) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            yy = -3.5 + (((tickAnim - 10) / 10) * (0-(-3.5)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(xx), tail2.rotateAngleY + (float) Math.toRadians(yy), tail2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (-2-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            yy = -2 + (((tickAnim - 5) / 5) * (-4.25-(-2)));
            zz = 0 + (((tickAnim - 5) / 5) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            yy = -4.25 + (((tickAnim - 10) / 10) * (0-(-4.25)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(xx), tail3.rotateAngleY + (float) Math.toRadians(yy), tail3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (-1.25-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            yy = -1.25 + (((tickAnim - 5) / 5) * (-3-(-1.25)));
            zz = 0 + (((tickAnim - 5) / 5) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            yy = -3 + (((tickAnim - 10) / 10) * (0-(-3)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(xx), tail4.rotateAngleY + (float) Math.toRadians(yy), tail4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (2.25-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            yy = 2.25 + (((tickAnim - 5) / 5) * (0-(2.25)));
            zz = 0 + (((tickAnim - 5) / 5) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 10) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 4) * (-0.67-(0)));
            zz = 0 + (((tickAnim - 10) / 4) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 14) / 6) * (0-(0)));
            yy = -0.67 + (((tickAnim - 14) / 6) * (0-(-0.67)));
            zz = 0 + (((tickAnim - 14) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail5, tail5.rotateAngleX + (float) Math.toRadians(xx), tail5.rotateAngleY + (float) Math.toRadians(yy), tail5.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (2-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 3) / 7) * (0-(0)));
            yy = 2 + (((tickAnim - 3) / 7) * (-2.75-(2)));
            zz = 0 + (((tickAnim - 3) / 7) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 10) / 4) * (0-(0)));
            yy = -2.75 + (((tickAnim - 10) / 4) * (-3.1-(-2.75)));
            zz = 0 + (((tickAnim - 10) / 4) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 14) / 6) * (0-(0)));
            yy = -3.1 + (((tickAnim - 14) / 6) * (0-(-3.1)));
            zz = 0 + (((tickAnim - 14) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail6, tail6.rotateAngleX + (float) Math.toRadians(xx), tail6.rotateAngleY + (float) Math.toRadians(yy), tail6.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (3.25-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 3) / 7) * (0-(0)));
            yy = 3.25 + (((tickAnim - 3) / 7) * (-2.5-(3.25)));
            zz = 0 + (((tickAnim - 3) / 7) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 10) / 4) * (0-(0)));
            yy = -2.5 + (((tickAnim - 10) / 4) * (-3.75-(-2.5)));
            zz = 0 + (((tickAnim - 10) / 4) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 14) / 6) * (0-(0)));
            yy = -3.75 + (((tickAnim - 14) / 6) * (0-(-3.75)));
            zz = 0 + (((tickAnim - 14) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail7, tail7.rotateAngleX + (float) Math.toRadians(xx), tail7.rotateAngleY + (float) Math.toRadians(yy), tail7.rotateAngleZ + (float) Math.toRadians(zz));



        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(0), body.rotateAngleY + (float) Math.toRadians(0), body.rotateAngleZ + (float) Math.toRadians(0));
        this.body.rotationPointX = this.body.rotationPointX + (float)(0);
        this.body.rotationPointY = this.body.rotationPointY - (float)(0);
        this.body.rotationPointZ = this.body.rotationPointZ + (float)(0);



        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (12.94957-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0.98102-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (-16.4683+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-10))*3-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 13) {
            xx = 12.94957 + (((tickAnim - 5) / 8) * (-36.77887-(12.94957)));
            yy = 0.98102 + (((tickAnim - 5) / 8) * (-12.54388-(0.98102)));
            zz = -16.4683+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-10))*3 + (((tickAnim - 5) / 8) * (2.18366-(-16.4683+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-10))*3)));
        }
        else if (tickAnim >= 13 && tickAnim < 20) {
            xx = -36.77887 + (((tickAnim - 13) / 7) * (0-(-36.77887)));
            yy = -12.54388 + (((tickAnim - 13) / 7) * (0-(-12.54388)));
            zz = 2.18366 + (((tickAnim - 13) / 7) * (0-(2.18366)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm, leftArm.rotateAngleX + (float) Math.toRadians(xx), leftArm.rotateAngleY + (float) Math.toRadians(yy), leftArm.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (2.675-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 8) / 5) * (0-(0)));
            yy = 2.675 + (((tickAnim - 8) / 5) * (2.675-(2.675)));
            zz = 0 + (((tickAnim - 8) / 5) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 13) / 7) * (0-(0)));
            yy = 2.675 + (((tickAnim - 13) / 7) * (0-(2.675)));
            zz = 0 + (((tickAnim - 13) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftArm.rotationPointX = this.leftArm.rotationPointX + (float)(xx);
        this.leftArm.rotationPointY = this.leftArm.rotationPointY - (float)(yy);
        this.leftArm.rotationPointZ = this.leftArm.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (-6.96853-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (-19.77546-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (9.93468-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 13) {
            xx = -6.96853 + (((tickAnim - 5) / 8) * (-22.03309-(-6.96853)));
            yy = -19.77546 + (((tickAnim - 5) / 8) * (-7.65226-(-19.77546)));
            zz = 9.93468 + (((tickAnim - 5) / 8) * (23.89096-(9.93468)));
        }
        else if (tickAnim >= 13 && tickAnim < 20) {
            xx = -22.03309 + (((tickAnim - 13) / 7) * (0-(-22.03309)));
            yy = -7.65226 + (((tickAnim - 13) / 7) * (0-(-7.65226)));
            zz = 23.89096 + (((tickAnim - 13) / 7) * (0-(23.89096)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm2, leftArm2.rotateAngleX + (float) Math.toRadians(xx), leftArm2.rotateAngleY + (float) Math.toRadians(yy), leftArm2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftArm2.rotationPointX = this.leftArm2.rotationPointX + (float)(xx);
        this.leftArm2.rotationPointY = this.leftArm2.rotationPointY - (float)(yy);
        this.leftArm2.rotationPointZ = this.leftArm2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (23-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 13) {
            xx = 23 + (((tickAnim - 5) / 8) * (0-(23)));
            yy = 0 + (((tickAnim - 5) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 8) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm3, leftArm3.rotateAngleX + (float) Math.toRadians(xx), leftArm3.rotateAngleY + (float) Math.toRadians(yy), leftArm3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0.55-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 5) / 8) * (0-(0)));
            yy = 0.55 + (((tickAnim - 5) / 8) * (0-(0.55)));
            zz = 0 + (((tickAnim - 5) / 8) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftArm3.rotationPointX = this.leftArm3.rotationPointX + (float)(xx);
        this.leftArm3.rotationPointY = this.leftArm3.rotationPointY - (float)(yy);
        this.leftArm3.rotationPointZ = this.leftArm3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0.23091-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (-0.56052-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0.46018-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 0.23091 + (((tickAnim - 10) / 10) * (0-(0.23091)));
            yy = -0.56052 + (((tickAnim - 10) / 10) * (0-(-0.56052)));
            zz = 0.46018 + (((tickAnim - 10) / 10) * (0-(0.46018)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm, rightArm.rotateAngleX + (float) Math.toRadians(xx), rightArm.rotateAngleY + (float) Math.toRadians(yy), rightArm.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (-0.05-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            yy = -0.05 + (((tickAnim - 10) / 10) * (0-(-0.05)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightArm.rotationPointX = this.rightArm.rotationPointX + (float)(xx);
        this.rightArm.rotationPointY = this.rightArm.rotationPointY - (float)(yy);
        this.rightArm.rotationPointZ = this.rightArm.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (-2.5-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (1.5-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = -2.5 + (((tickAnim - 5) / 5) * (0-(-2.5)));
            yy = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            zz = 1.5 + (((tickAnim - 5) / 5) * (0-(1.5)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 10) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 5) * (-1-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 15) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 15) / 5) * (0-(0)));
            zz = -1 + (((tickAnim - 15) / 5) * (0-(-1)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm2, rightArm2.rotateAngleX + (float) Math.toRadians(xx), rightArm2.rotateAngleY + (float) Math.toRadians(yy), rightArm2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (5-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 14) {
            xx = 5 + (((tickAnim - 5) / 9) * (-0.56-(5)));
            yy = 0 + (((tickAnim - 5) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 9) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 20) {
            xx = -0.56 + (((tickAnim - 14) / 6) * (0-(-0.56)));
            yy = 0 + (((tickAnim - 14) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm3, rightArm3.rotateAngleX + (float) Math.toRadians(xx), rightArm3.rotateAngleY + (float) Math.toRadians(yy), rightArm3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 0) / 9) * (0.04782-(0)));
            yy = 0 + (((tickAnim - 0) / 9) * (-1.04575-(0)));
            zz = 0 + (((tickAnim - 0) / 9) * (-3.16853-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 20) {
            xx = 0.04782 + (((tickAnim - 9) / 11) * (0-(0.04782)));
            yy = -1.04575 + (((tickAnim - 9) / 11) * (0-(-1.04575)));
            zz = -3.16853 + (((tickAnim - 9) / 11) * (0-(-3.16853)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck1, neck1.rotateAngleX + (float) Math.toRadians(xx), neck1.rotateAngleY + (float) Math.toRadians(yy), neck1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 0) / 9) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 9) * (1.75-(0)));
            zz = 0 + (((tickAnim - 0) / 9) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 9) / 11) * (0-(0)));
            yy = 1.75 + (((tickAnim - 9) / 11) * (0-(1.75)));
            zz = 0 + (((tickAnim - 9) / 11) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(xx), neck2.rotateAngleY + (float) Math.toRadians(yy), neck2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 0) / 9) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 9) * (0.5-(0)));
            zz = 0 + (((tickAnim - 0) / 9) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 9) / 11) * (0-(0)));
            yy = 0.5 + (((tickAnim - 9) / 11) * (0-(0.5)));
            zz = 0 + (((tickAnim - 9) / 11) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(xx), neck3.rotateAngleY + (float) Math.toRadians(yy), neck3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 0) / 9) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 9) * (-1-(0)));
            zz = 0 + (((tickAnim - 0) / 9) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 9) / 11) * (0-(0)));
            yy = -1 + (((tickAnim - 9) / 11) * (0-(-1)));
            zz = 0 + (((tickAnim - 9) / 11) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck4, neck4.rotateAngleX + (float) Math.toRadians(xx), neck4.rotateAngleY + (float) Math.toRadians(yy), neck4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 0) / 9) * (5.47518-(0)));
            yy = 0 + (((tickAnim - 0) / 9) * (-0.04361-(0)));
            zz = 0 + (((tickAnim - 0) / 9) * (0.62565-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 20) {
            xx = 5.47518 + (((tickAnim - 9) / 11) * (0-(5.47518)));
            yy = -0.04361 + (((tickAnim - 9) / 11) * (0-(-0.04361)));
            zz = 0.62565 + (((tickAnim - 9) / 11) * (0-(0.62565)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck5, neck5.rotateAngleX + (float) Math.toRadians(xx), neck5.rotateAngleY + (float) Math.toRadians(yy), neck5.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 0) / 9) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 9) * (-3.25-(0)));
            zz = 0 + (((tickAnim - 0) / 9) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 9) / 11) * (0-(0)));
            yy = -3.25 + (((tickAnim - 9) / 11) * (0-(-3.25)));
            zz = 0 + (((tickAnim - 9) / 11) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck6, neck6.rotateAngleX + (float) Math.toRadians(xx), neck6.rotateAngleY + (float) Math.toRadians(yy), neck6.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 0) / 9) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 9) * (-1.75-(0)));
            zz = 0 + (((tickAnim - 0) / 9) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 9) / 11) * (0-(0)));
            yy = -1.75 + (((tickAnim - 9) / 11) * (0-(-1.75)));
            zz = 0 + (((tickAnim - 9) / 11) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck7, neck7.rotateAngleX + (float) Math.toRadians(xx), neck7.rotateAngleY + (float) Math.toRadians(yy), neck7.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (4.5-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 13) {
            xx = 4.5 + (((tickAnim - 5) / 8) * (11-(4.5)));
            yy = 0 + (((tickAnim - 5) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 8) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 20) {
            xx = 11 + (((tickAnim - 13) / 7) * (0-(11)));
            yy = 0 + (((tickAnim - 13) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(xx), jaw.rotateAngleY + (float) Math.toRadians(yy), jaw.rotateAngleZ + (float) Math.toRadians(zz));



    }

    public void animLook(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraLusotitan entity = (EntityPrehistoricFloraLusotitan) entitylivingbaseIn;
        int animCycle = 100;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
     if (tickAnim >= 0 && tickAnim < 36) {
            xx = 0 + (((tickAnim - 0) / 36) * (-0.08549-(0)));
            yy = 0 + (((tickAnim - 0) / 36) * (-2.83392-(0)));
            zz = 0 + (((tickAnim - 0) / 36) * (1.25123-(0)));
        }
        else if (tickAnim >= 36 && tickAnim < 50) {
            xx = -0.08549 + (((tickAnim - 36) / 14) * (-2.58549-(-0.08549)));
            yy = -2.83392 + (((tickAnim - 36) / 14) * (-2.83392-(-2.83392)));
            zz = 1.25123 + (((tickAnim - 36) / 14) * (1.25123-(1.25123)));
        }
        else if (tickAnim >= 50 && tickAnim < 83) {
            xx = -2.58549 + (((tickAnim - 50) / 33) * (-5.08549-(-2.58549)));
            yy = -2.83392 + (((tickAnim - 50) / 33) * (-2.83392-(-2.83392)));
            zz = 1.25123 + (((tickAnim - 50) / 33) * (1.25123-(1.25123)));
        }
        else if (tickAnim >= 83 && tickAnim < 100) {
            xx = -5.08549 + (((tickAnim - 83) / 17) * (0-(-5.08549)));
            yy = -2.83392 + (((tickAnim - 83) / 17) * (0-(-2.83392)));
            zz = 1.25123 + (((tickAnim - 83) / 17) * (0-(1.25123)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck1, neck1.rotateAngleX + (float) Math.toRadians(xx), neck1.rotateAngleY + (float) Math.toRadians(yy), neck1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 0) / 33) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 33) * (-5-(0)));
            zz = 0 + (((tickAnim - 0) / 33) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 46) {
            xx = 0 + (((tickAnim - 33) / 13) * (5-(0)));
            yy = -5 + (((tickAnim - 33) / 13) * (-5-(-5)));
            zz = 0 + (((tickAnim - 33) / 13) * (0-(0)));
        }
        else if (tickAnim >= 46 && tickAnim < 80) {
            xx = 5 + (((tickAnim - 46) / 34) * (5-(5)));
            yy = -5 + (((tickAnim - 46) / 34) * (-5-(-5)));
            zz = 0 + (((tickAnim - 46) / 34) * (0-(0)));
        }
        else if (tickAnim >= 80 && tickAnim < 100) {
            xx = 5 + (((tickAnim - 80) / 20) * (0-(5)));
            yy = -5 + (((tickAnim - 80) / 20) * (0-(-5)));
            zz = 0 + (((tickAnim - 80) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(xx), neck2.rotateAngleY + (float) Math.toRadians(yy), neck2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 0) / 33) * (0.22263-(0)));
            yy = 0 + (((tickAnim - 0) / 33) * (-5.21308-(0)));
            zz = 0 + (((tickAnim - 0) / 33) * (-2.50083-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 79) {
            xx = 0.22263 + (((tickAnim - 33) / 46) * (0.22263-(0.22263)));
            yy = -5.21308 + (((tickAnim - 33) / 46) * (-5.21308-(-5.21308)));
            zz = -2.50083 + (((tickAnim - 33) / 46) * (-2.50083-(-2.50083)));
        }
        else if (tickAnim >= 79 && tickAnim < 100) {
            xx = 0.22263 + (((tickAnim - 79) / 21) * (0-(0.22263)));
            yy = -5.21308 + (((tickAnim - 79) / 21) * (0-(-5.21308)));
            zz = -2.50083 + (((tickAnim - 79) / 21) * (0-(-2.50083)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(xx), neck3.rotateAngleY + (float) Math.toRadians(yy), neck3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 0) / 30) * (0.22086-(0)));
            yy = 0 + (((tickAnim - 0) / 30) * (-5.10425-(0)));
            zz = 0 + (((tickAnim - 0) / 30) * (-2.50757-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 78) {
            xx = 0.22086 + (((tickAnim - 30) / 48) * (0.22086-(0.22086)));
            yy = -5.10425 + (((tickAnim - 30) / 48) * (-5.10425-(-5.10425)));
            zz = -2.50757 + (((tickAnim - 30) / 48) * (-2.50757-(-2.50757)));
        }
        else if (tickAnim >= 78 && tickAnim < 100) {
            xx = 0.22086 + (((tickAnim - 78) / 22) * (0-(0.22086)));
            yy = -5.10425 + (((tickAnim - 78) / 22) * (0-(-5.10425)));
            zz = -2.50757 + (((tickAnim - 78) / 22) * (0-(-2.50757)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck4, neck4.rotateAngleX + (float) Math.toRadians(xx), neck4.rotateAngleY + (float) Math.toRadians(yy), neck4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 0) / 28) * (0.32288-(0)));
            yy = 0 + (((tickAnim - 0) / 28) * (-7.27506-(0)));
            zz = 0 + (((tickAnim - 0) / 28) * (-2.51071-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 75) {
            xx = 0.32288 + (((tickAnim - 28) / 47) * (0.32288-(0.32288)));
            yy = -7.27506 + (((tickAnim - 28) / 47) * (-7.27506-(-7.27506)));
            zz = -2.51071 + (((tickAnim - 28) / 47) * (-2.51071-(-2.51071)));
        }
        else if (tickAnim >= 75 && tickAnim < 100) {
            xx = 0.32288 + (((tickAnim - 75) / 25) * (0-(0.32288)));
            yy = -7.27506 + (((tickAnim - 75) / 25) * (0-(-7.27506)));
            zz = -2.51071 + (((tickAnim - 75) / 25) * (0-(-2.51071)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck5, neck5.rotateAngleX + (float) Math.toRadians(xx), neck5.rotateAngleY + (float) Math.toRadians(yy), neck5.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 22) {
            xx = 0 + (((tickAnim - 0) / 22) * (5.31892-(0)));
            yy = 0 + (((tickAnim - 0) / 22) * (-7.16673-(0)));
            zz = 0 + (((tickAnim - 0) / 22) * (-2.49813-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 69) {
            xx = 5.31892 + (((tickAnim - 22) / 47) * (5.31892-(5.31892)));
            yy = -7.16673 + (((tickAnim - 22) / 47) * (-7.16673-(-7.16673)));
            zz = -2.49813 + (((tickAnim - 22) / 47) * (-2.49813-(-2.49813)));
        }
        else if (tickAnim >= 69 && tickAnim < 83) {
            xx = 5.31892 + (((tickAnim - 69) / 14) * (1.04595-(5.31892)));
            yy = -7.16673 + (((tickAnim - 69) / 14) * (-4.77782-(-7.16673)));
            zz = -2.49813 + (((tickAnim - 69) / 14) * (-1.66542-(-2.49813)));
        }
        else if (tickAnim >= 83 && tickAnim < 100) {
            xx = 1.04595 + (((tickAnim - 83) / 17) * (0-(1.04595)));
            yy = -4.77782 + (((tickAnim - 83) / 17) * (0-(-4.77782)));
            zz = -1.66542 + (((tickAnim - 83) / 17) * (0-(-1.66542)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck6, neck6.rotateAngleX + (float) Math.toRadians(xx), neck6.rotateAngleY + (float) Math.toRadians(yy), neck6.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 0) / 25) * (-3.33421-(0)));
            yy = 0 + (((tickAnim - 0) / 25) * (-13.75653-(0)));
            zz = 0 + (((tickAnim - 0) / 25) * (-0.23185-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 44) {
            xx = -3.33421 + (((tickAnim - 25) / 19) * (-3.33421-(-3.33421)));
            yy = -13.75653 + (((tickAnim - 25) / 19) * (-13.75653-(-13.75653)));
            zz = -0.23185 + (((tickAnim - 25) / 19) * (-0.23185-(-0.23185)));
        }
        else if (tickAnim >= 44 && tickAnim < 100) {
            xx = -3.33421 + (((tickAnim - 44) / 56) * (0-(-3.33421)));
            yy = -13.75653 + (((tickAnim - 44) / 56) * (0-(-13.75653)));
            zz = -0.23185 + (((tickAnim - 44) / 56) * (0-(-0.23185)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck7, neck7.rotateAngleX + (float) Math.toRadians(xx), neck7.rotateAngleY + (float) Math.toRadians(yy), neck7.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 21) {
            xx = 0 + (((tickAnim - 0) / 21) * (0.38126-(0)));
            yy = 0 + (((tickAnim - 0) / 21) * (-8.64917-(0)));
            zz = 0 + (((tickAnim - 0) / 21) * (-10.03837-(0)));
        }
        else if (tickAnim >= 21 && tickAnim < 38) {
            xx = 0.38126 + (((tickAnim - 21) / 17) * (-9.61874-(0.38126)));
            yy = -8.64917 + (((tickAnim - 21) / 17) * (-8.64917-(-8.64917)));
            zz = -10.03837 + (((tickAnim - 21) / 17) * (-10.03837-(-10.03837)));
        }
        else if (tickAnim >= 38 && tickAnim < 53) {
            xx = -9.61874 + (((tickAnim - 38) / 15) * (-11.21573-(-9.61874)));
            yy = -8.64917 + (((tickAnim - 38) / 15) * (-2.77349-(-8.64917)));
            zz = -10.03837 + (((tickAnim - 38) / 15) * (-19.69547-(-10.03837)));
        }
        else if (tickAnim >= 53 && tickAnim < 86) {
            xx = -11.21573 + (((tickAnim - 53) / 33) * (-11.21573-(-11.21573)));
            yy = -2.77349 + (((tickAnim - 53) / 33) * (-2.77349-(-2.77349)));
            zz = -19.69547 + (((tickAnim - 53) / 33) * (-19.69547-(-19.69547)));
        }
        else if (tickAnim >= 86 && tickAnim < 100) {
            xx = -11.21573 + (((tickAnim - 86) / 14) * (0-(-11.21573)));
            yy = -2.77349 + (((tickAnim - 86) / 14) * (0-(-2.77349)));
            zz = -19.69547 + (((tickAnim - 86) / 14) * (0-(-19.69547)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck8, neck8.rotateAngleX + (float) Math.toRadians(xx), neck8.rotateAngleY + (float) Math.toRadians(yy), neck8.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 0) / 19) * (7.5-(0)));
            yy = 0 + (((tickAnim - 0) / 19) * (-15-(0)));
            zz = 0 + (((tickAnim - 0) / 19) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 38) {
            xx = 7.5 + (((tickAnim - 19) / 19) * (-2.5-(7.5)));
            yy = -15 + (((tickAnim - 19) / 19) * (-15-(-15)));
            zz = 0 + (((tickAnim - 19) / 19) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 63) {
            xx = -2.5 + (((tickAnim - 38) / 25) * (-2.21899-(-2.5)));
            yy = -15 + (((tickAnim - 38) / 25) * (-10.09765-(-15)));
            zz = 0 + (((tickAnim - 38) / 25) * (10.74225-(0)));
        }
        else if (tickAnim >= 63 && tickAnim < 95) {
            xx = -2.21899 + (((tickAnim - 63) / 32) * (-7.26588-(-2.21899)));
            yy = -10.09765 + (((tickAnim - 63) / 32) * (-4.32894-(-10.09765)));
            zz = 10.74225 + (((tickAnim - 63) / 32) * (-0.67487-(10.74225)));
        }
        else if (tickAnim >= 95 && tickAnim < 100) {
            xx = -7.26588 + (((tickAnim - 95) / 5) * (0-(-7.26588)));
            yy = -4.32894 + (((tickAnim - 95) / 5) * (0-(-4.32894)));
            zz = -0.67487 + (((tickAnim - 95) / 5) * (0-(-0.67487)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 0) / 19) * (4.9905-(0)));
            yy = 0 + (((tickAnim - 0) / 19) * (-0.21782-(0)));
            zz = 0 + (((tickAnim - 0) / 19) * (4.99527-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 38) {
            xx = 4.9905 + (((tickAnim - 19) / 19) * (4.9905-(4.9905)));
            yy = -0.21782 + (((tickAnim - 19) / 19) * (-0.21782-(-0.21782)));
            zz = 4.99527 + (((tickAnim - 19) / 19) * (4.99527-(4.99527)));
        }
        else if (tickAnim >= 38 && tickAnim < 90) {
            xx = 4.9905 + (((tickAnim - 38) / 52) * (4.9905-(4.9905)));
            yy = -0.21782 + (((tickAnim - 38) / 52) * (-0.21782-(-0.21782)));
            zz = 4.99527 + (((tickAnim - 38) / 52) * (4.99527-(4.99527)));
        }
        else if (tickAnim >= 90 && tickAnim < 100) {
            xx = 4.9905 + (((tickAnim - 90) / 10) * (0-(4.9905)));
            yy = -0.21782 + (((tickAnim - 90) / 10) * (0-(-0.21782)));
            zz = 4.99527 + (((tickAnim - 90) / 10) * (0-(4.99527)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(throat, throat.rotateAngleX + (float) Math.toRadians(xx), throat.rotateAngleY + (float) Math.toRadians(yy), throat.rotateAngleZ + (float) Math.toRadians(zz));



    }

    public void animWalking(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraLusotitan entity = (EntityPrehistoricFloraLusotitan) entitylivingbaseIn;
        int animCycle = 53;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        this.setRotateAngle(hips, hips.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*203/0.76-80))*0.5), hips.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*203/1.5-120))*-1), hips.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*203/1.5-120))*-1.5));



        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 17.25 + (((tickAnim - 0) / 10) * (-4.05359-(17.25)));
            yy = 0 + (((tickAnim - 0) / 10) * (1.86025-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (-0.73461-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 14) {
            xx = -4.05359 + (((tickAnim - 10) / 4) * (-10.25-(-4.05359)));
            yy = 1.86025 + (((tickAnim - 10) / 4) * (0-(1.86025)));
            zz = -0.73461 + (((tickAnim - 10) / 4) * (0-(-0.73461)));
        }
        else if (tickAnim >= 14 && tickAnim < 53) {
            xx = -10.25 + (((tickAnim - 14) / 39) * (17.25-(-10.25)));
            yy = 0 + (((tickAnim - 14) / 39) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 39) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg, rightLeg.rotateAngleX + (float) Math.toRadians(xx), rightLeg.rotateAngleY + (float) Math.toRadians(yy), rightLeg.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = -0.725 + (((tickAnim - 0) / 10) * (0-(-0.725)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 10) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 4) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 14) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 14) / 4) * (-0.2-(0)));
            zz = 0 + (((tickAnim - 14) / 4) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 18) / 1) * (0-(0)));
            yy = -0.2 + (((tickAnim - 18) / 1) * (0-(-0.2)));
            zz = 0 + (((tickAnim - 18) / 1) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 21) {
            xx = 0 + (((tickAnim - 19) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 19) / 2) * (-0.2-(0)));
            zz = 0 + (((tickAnim - 19) / 2) * (0-(0)));
        }
        else if (tickAnim >= 21 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 21) / 2) * (0-(0)));
            yy = -0.2 + (((tickAnim - 21) / 2) * (0-(-0.2)));
            zz = 0 + (((tickAnim - 21) / 2) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 53) {
            xx = 0 + (((tickAnim - 23) / 30) * (0-(0)));
            yy = 0 + (((tickAnim - 23) / 30) * (-0.725-(0)));
            zz = 0 + (((tickAnim - 23) / 30) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightLeg.rotationPointX = this.rightLeg.rotationPointX + (float)(xx);
        this.rightLeg.rotationPointY = this.rightLeg.rotationPointY - (float)(yy);
        this.rightLeg.rotationPointZ = this.rightLeg.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 2.75 + (((tickAnim - 0) / 10) * (-9.81-(2.75)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 14) {
            xx = -9.81 + (((tickAnim - 10) / 4) * (-12.5-(-9.81)));
            yy = 0 + (((tickAnim - 10) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 4) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 36) {
            xx = -12.5 + (((tickAnim - 14) / 22) * (1.64-(-12.5)));
            yy = 0 + (((tickAnim - 14) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 22) * (0-(0)));
        }
        else if (tickAnim >= 36 && tickAnim < 53) {
            xx = 1.64 + (((tickAnim - 36) / 17) * (2.75-(1.64)));
            yy = 0 + (((tickAnim - 36) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 36) / 17) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg2, rightLeg2.rotateAngleX + (float) Math.toRadians(xx), rightLeg2.rotateAngleY + (float) Math.toRadians(yy), rightLeg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = 0.475 + (((tickAnim - 0) / 10) * (4.445-(0.475)));
            zz = 0 + (((tickAnim - 0) / 10) * (-1.04-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 10) / 4) * (0-(0)));
            yy = 4.445 + (((tickAnim - 10) / 4) * (-1.025-(4.445)));
            zz = -1.04 + (((tickAnim - 10) / 4) * (0-(-1.04)));
        }
        else if (tickAnim >= 14 && tickAnim < 36) {
            xx = 0 + (((tickAnim - 14) / 22) * (0-(0)));
            yy = -1.025 + (((tickAnim - 14) / 22) * (0.43-(-1.025)));
            zz = 0 + (((tickAnim - 14) / 22) * (0-(0)));
        }
        else if (tickAnim >= 36 && tickAnim < 53) {
            xx = 0 + (((tickAnim - 36) / 17) * (0-(0)));
            yy = 0.43 + (((tickAnim - 36) / 17) * (0.475-(0.43)));
            zz = 0 + (((tickAnim - 36) / 17) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightLeg2.rotationPointX = this.rightLeg2.rotationPointX + (float)(xx);
        this.rightLeg2.rotationPointY = this.rightLeg2.rotationPointY - (float)(yy);
        this.rightLeg2.rotationPointZ = this.rightLeg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 10.25 + (((tickAnim - 0) / 10) * (22.82-(10.25)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 14) {
            xx = 22.82 + (((tickAnim - 10) / 4) * (21.75-(22.82)));
            yy = 0 + (((tickAnim - 10) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 4) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 36) {
            xx = 21.75 + (((tickAnim - 14) / 22) * (-7.06-(21.75)));
            yy = 0 + (((tickAnim - 14) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 22) * (0-(0)));
        }
        else if (tickAnim >= 36 && tickAnim < 53) {
            xx = -7.06 + (((tickAnim - 36) / 17) * (10.25-(-7.06)));
            yy = 0 + (((tickAnim - 36) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 36) / 17) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg3, rightLeg3.rotateAngleX + (float) Math.toRadians(xx), rightLeg3.rotateAngleY + (float) Math.toRadians(yy), rightLeg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 0) / 14) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 14) * (-0.08-(0)));
            zz = 0 + (((tickAnim - 0) / 14) * (0.11-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 36) {
            xx = 0 + (((tickAnim - 14) / 22) * (0-(0)));
            yy = -0.08 + (((tickAnim - 14) / 22) * (-1-(-0.08)));
            zz = 0.11 + (((tickAnim - 14) / 22) * (0.25-(0.11)));
        }
        else if (tickAnim >= 36 && tickAnim < 53) {
            xx = 0 + (((tickAnim - 36) / 17) * (0-(0)));
            yy = -1 + (((tickAnim - 36) / 17) * (0-(-1)));
            zz = 0.25 + (((tickAnim - 36) / 17) * (0-(0.25)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightLeg3.rotationPointX = this.rightLeg3.rotationPointX + (float)(xx);
        this.rightLeg3.rotationPointY = this.rightLeg3.rotationPointY - (float)(yy);
        this.rightLeg3.rotationPointZ = this.rightLeg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = -32.77116 + (((tickAnim - 0) / 10) * (8.51597-(-32.77116)));
            yy = -10.0264 + (((tickAnim - 0) / 10) * (-5.93432-(-10.0264)));
            zz = 4.32692 + (((tickAnim - 0) / 10) * (-0.88692-(4.32692)));
        }
        else if (tickAnim >= 10 && tickAnim < 18) {
            xx = 8.51597 + (((tickAnim - 10) / 8) * (0-(8.51597)));
            yy = -5.93432 + (((tickAnim - 10) / 8) * (-6.75-(-5.93432)));
            zz = -0.88692 + (((tickAnim - 10) / 8) * (0-(-0.88692)));
        }
        else if (tickAnim >= 18 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 18) / 10) * (0-(0)));
            yy = -6.75 + (((tickAnim - 18) / 10) * (-8-(-6.75)));
            zz = 0 + (((tickAnim - 18) / 10) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 36) {
            xx = 0 + (((tickAnim - 28) / 8) * (0-(0)));
            yy = -8 + (((tickAnim - 28) / 8) * (-8-(-8)));
            zz = 0 + (((tickAnim - 28) / 8) * (0-(0)));
        }
        else if (tickAnim >= 36 && tickAnim < 53) {
            xx = 0 + (((tickAnim - 36) / 17) * (-32.77116-(0)));
            yy = -8 + (((tickAnim - 36) / 17) * (-10.0264-(-8)));
            zz = 0 + (((tickAnim - 36) / 17) * (4.32692-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg4, rightLeg4.rotateAngleX + (float) Math.toRadians(xx), rightLeg4.rotateAngleY + (float) Math.toRadians(yy), rightLeg4.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = 1.3 + (((tickAnim - 0) / 10) * (-0.275-(1.3)));
            zz = -2.225 + (((tickAnim - 0) / 10) * (0.5-(-2.225)));
        }
        else if (tickAnim >= 10 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 10) / 8) * (0-(0)));
            yy = -0.275 + (((tickAnim - 10) / 8) * (0-(-0.275)));
            zz = 0.5 + (((tickAnim - 10) / 8) * (0-(0.5)));
        }
        else if (tickAnim >= 18 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 18) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 18) / 10) * (-0.11-(0)));
            zz = 0 + (((tickAnim - 18) / 10) * (-0.67-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 36) {
            xx = 0 + (((tickAnim - 28) / 8) * (0-(0)));
            yy = -0.11 + (((tickAnim - 28) / 8) * (-0.11-(-0.11)));
            zz = -0.67 + (((tickAnim - 28) / 8) * (-0.545-(-0.67)));
        }
        else if (tickAnim >= 36 && tickAnim < 53) {
            xx = 0 + (((tickAnim - 36) / 17) * (0-(0)));
            yy = -0.11 + (((tickAnim - 36) / 17) * (1.3-(-0.11)));
            zz = -0.545 + (((tickAnim - 36) / 17) * (-2.225-(-0.545)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightLeg4.rotationPointX = this.rightLeg4.rotationPointX + (float)(xx);
        this.rightLeg4.rotationPointY = this.rightLeg4.rotationPointY - (float)(yy);
        this.rightLeg4.rotationPointZ = this.rightLeg4.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 26) {
            xx = 2.25 + (((tickAnim - 0) / 26) * (17.25-(2.25)));
            yy = 0 + (((tickAnim - 0) / 26) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 26) * (0-(0)));
        }
        else if (tickAnim >= 26 && tickAnim < 35) {
            xx = 17.25 + (((tickAnim - 26) / 9) * (-1.75958-(17.25)));
            yy = 0 + (((tickAnim - 26) / 9) * (-1.64439-(0)));
            zz = 0 + (((tickAnim - 26) / 9) * (0.574-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 40) {
            xx = -1.75958 + (((tickAnim - 35) / 5) * (-8.73-(-1.75958)));
            yy = -1.64439 + (((tickAnim - 35) / 5) * (0-(-1.64439)));
            zz = 0.574 + (((tickAnim - 35) / 5) * (0-(0.574)));
        }
        else if (tickAnim >= 40 && tickAnim < 53) {
            xx = -8.73 + (((tickAnim - 40) / 13) * (2.25-(-8.73)));
            yy = 0 + (((tickAnim - 40) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 13) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg, leftLeg.rotateAngleX + (float) Math.toRadians(xx), leftLeg.rotateAngleY + (float) Math.toRadians(yy), leftLeg.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 26) {
            xx = 0 + (((tickAnim - 0) / 26) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 26) * (-0.725-(0)));
            zz = 0 + (((tickAnim - 0) / 26) * (0-(0)));
        }
        else if (tickAnim >= 26 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 26) / 14) * (0-(0)));
            yy = -0.725 + (((tickAnim - 26) / 14) * (0-(-0.725)));
            zz = 0 + (((tickAnim - 26) / 14) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 42) {
            xx = 0 + (((tickAnim - 40) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 40) / 2) * (-0.2-(0)));
            zz = 0 + (((tickAnim - 40) / 2) * (0-(0)));
        }
        else if (tickAnim >= 42 && tickAnim < 43) {
            xx = 0 + (((tickAnim - 42) / 1) * (0-(0)));
            yy = -0.2 + (((tickAnim - 42) / 1) * (0-(-0.2)));
            zz = 0 + (((tickAnim - 42) / 1) * (0-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 45) {
            xx = 0 + (((tickAnim - 43) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 43) / 2) * (-0.2-(0)));
            zz = 0 + (((tickAnim - 43) / 2) * (0-(0)));
        }
        else if (tickAnim >= 45 && tickAnim < 47) {
            xx = 0 + (((tickAnim - 45) / 2) * (0-(0)));
            yy = -0.2 + (((tickAnim - 45) / 2) * (0-(-0.2)));
            zz = 0 + (((tickAnim - 45) / 2) * (0-(0)));
        }
        else if (tickAnim >= 47 && tickAnim < 53) {
            xx = 0 + (((tickAnim - 47) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 47) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 47) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftLeg.rotationPointX = this.leftLeg.rotationPointX + (float)(xx);
        this.leftLeg.rotationPointY = this.leftLeg.rotationPointY - (float)(yy);
        this.leftLeg.rotationPointZ = this.leftLeg.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 11) {
            xx = -11 + (((tickAnim - 0) / 11) * (-3.19-(-11)));
            yy = 0 + (((tickAnim - 0) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 11) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 26) {
            xx = -3.19 + (((tickAnim - 11) / 15) * (-7-(-3.19)));
            yy = 0 + (((tickAnim - 11) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 15) * (0-(0)));
        }
        else if (tickAnim >= 26 && tickAnim < 35) {
            xx = -7 + (((tickAnim - 26) / 9) * (-16.77-(-7)));
            yy = 0 + (((tickAnim - 26) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 26) / 9) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 40) {
            xx = -16.77 + (((tickAnim - 35) / 5) * (-12.5-(-16.77)));
            yy = 0 + (((tickAnim - 35) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 5) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 53) {
            xx = -12.5 + (((tickAnim - 40) / 13) * (-11-(-12.5)));
            yy = 0 + (((tickAnim - 40) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 13) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg2, leftLeg2.rotateAngleX + (float) Math.toRadians(xx), leftLeg2.rotateAngleY + (float) Math.toRadians(yy), leftLeg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 0) / 11) * (0-(0)));
            yy = 1.425 + (((tickAnim - 0) / 11) * (0-(1.425)));
            zz = 0 + (((tickAnim - 0) / 11) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 26) {
            xx = 0 + (((tickAnim - 11) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 11) / 15) * (-0.375-(0)));
            zz = 0 + (((tickAnim - 11) / 15) * (0-(0)));
        }
        else if (tickAnim >= 26 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 26) / 9) * (0-(0)));
            yy = -0.375 + (((tickAnim - 26) / 9) * (5.975-(-0.375)));
            zz = 0 + (((tickAnim - 26) / 9) * (-1.25-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 35) / 5) * (0-(0)));
            yy = 5.975 + (((tickAnim - 35) / 5) * (0-(5.975)));
            zz = -1.25 + (((tickAnim - 35) / 5) * (0-(-1.25)));
        }
        else if (tickAnim >= 40 && tickAnim < 53) {
            xx = 0 + (((tickAnim - 40) / 13) * (0-(0)));
            yy = 0 + (((tickAnim - 40) / 13) * (1.425-(0)));
            zz = 0 + (((tickAnim - 40) / 13) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftLeg2.rotationPointX = this.leftLeg2.rotationPointX + (float)(xx);
        this.leftLeg2.rotationPointY = this.leftLeg2.rotationPointY - (float)(yy);
        this.leftLeg2.rotationPointZ = this.leftLeg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 12) {
            xx = 8.75 + (((tickAnim - 0) / 12) * (-1.84-(8.75)));
            yy = 0 + (((tickAnim - 0) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 12) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 18) {
            xx = -1.84 + (((tickAnim - 12) / 6) * (2.71-(-1.84)));
            yy = 0 + (((tickAnim - 12) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 6) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 26) {
            xx = 2.71 + (((tickAnim - 18) / 8) * (9.25-(2.71)));
            yy = 0 + (((tickAnim - 18) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 8) * (0-(0)));
        }
        else if (tickAnim >= 26 && tickAnim < 35) {
            xx = 9.25 + (((tickAnim - 26) / 9) * (29.71-(9.25)));
            yy = 0 + (((tickAnim - 26) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 26) / 9) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 40) {
            xx = 29.71 + (((tickAnim - 35) / 5) * (20.5-(29.71)));
            yy = 0 + (((tickAnim - 35) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 5) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 53) {
            xx = 20.5 + (((tickAnim - 40) / 13) * (8.75-(20.5)));
            yy = 0 + (((tickAnim - 40) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 13) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg3, leftLeg3.rotateAngleX + (float) Math.toRadians(xx), leftLeg3.rotateAngleY + (float) Math.toRadians(yy), leftLeg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 26) {
            xx = 0 + (((tickAnim - 0) / 26) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 26) * (0.775-(0)));
            zz = 0 + (((tickAnim - 0) / 26) * (0-(0)));
        }
        else if (tickAnim >= 26 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 26) / 14) * (0-(0)));
            yy = 0.775 + (((tickAnim - 26) / 14) * (0-(0.775)));
            zz = 0 + (((tickAnim - 26) / 14) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 53) {
            xx = 0 + (((tickAnim - 40) / 13) * (0-(0)));
            yy = 0 + (((tickAnim - 40) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 13) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftLeg3.rotationPointX = this.leftLeg3.rotationPointX + (float)(xx);
        this.leftLeg3.rotationPointY = this.leftLeg3.rotationPointY - (float)(yy);
        this.leftLeg3.rotationPointZ = this.leftLeg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 0) / 12) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 12) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 12) / 16) * (-26.98145-(0)));
            yy = 0 + (((tickAnim - 12) / 16) * (9.33254-(0)));
            zz = 0 + (((tickAnim - 12) / 16) * (-2.83504-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 36) {
            xx = -26.98145 + (((tickAnim - 28) / 8) * (9.73563-(-26.98145)));
            yy = 9.33254 + (((tickAnim - 28) / 8) * (12.57226-(9.33254)));
            zz = -2.83504 + (((tickAnim - 28) / 8) * (2.1388-(-2.83504)));
        }
        else if (tickAnim >= 36 && tickAnim < 40) {
            xx = 9.73563 + (((tickAnim - 36) / 4) * (0-(9.73563)));
            yy = 12.57226 + (((tickAnim - 36) / 4) * (0-(12.57226)));
            zz = 2.1388 + (((tickAnim - 36) / 4) * (0-(2.1388)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg4, leftLeg4.rotateAngleX + (float) Math.toRadians(xx), leftLeg4.rotateAngleY + (float) Math.toRadians(yy), leftLeg4.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 0) / 12) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 12) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 12) / 16) * (0-(0)));
            yy = 0 + (((tickAnim - 12) / 16) * (0.35-(0)));
            zz = 0 + (((tickAnim - 12) / 16) * (-2.175-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 36) {
            xx = 0 + (((tickAnim - 28) / 8) * (0-(0)));
            yy = 0.35 + (((tickAnim - 28) / 8) * (-0.35-(0.35)));
            zz = -2.175 + (((tickAnim - 28) / 8) * (1.1-(-2.175)));
        }
        else if (tickAnim >= 36 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 36) / 4) * (0-(0)));
            yy = -0.35 + (((tickAnim - 36) / 4) * (0-(-0.35)));
            zz = 1.1 + (((tickAnim - 36) / 4) * (0-(1.1)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftLeg4.rotationPointX = this.leftLeg4.rotationPointX + (float)(xx);
        this.leftLeg4.rotationPointY = this.leftLeg4.rotationPointY - (float)(yy);
        this.leftLeg4.rotationPointZ = this.leftLeg4.rotationPointZ + (float)(zz);



        this.setRotateAngle(tail1, tail1.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*202/0.75-168))*0.3), tail1.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*203/1.5-250))*-3), tail1.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*203/1.5+70))*-1));


        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*202/0.75))*-0.7), tail2.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*203/1.5))*-1.5), tail2.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*203/1.5))*-0.8));


        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*202/0.75-20))*-0.3), tail3.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*203/1.5-260))*-1.8), tail3.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*203/1.5+260))*-1.1));


        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*202/0.75-30))*-1), tail4.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*203/1.5-270))*-2), tail4.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*203/1.5+270))*-1.5));


        this.setRotateAngle(tail5, tail5.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*202/0.75-50))*-1.9), tail5.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*203/1.5-280))*-3), tail5.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*203/1.5+280))*-2));


        this.setRotateAngle(tail6, tail6.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*202/0.75-90))*-2), tail6.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*203/1.5-280))*-7), tail6.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*203/1.5+280))*-2.5));


        this.setRotateAngle(tail7, tail7.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*202/0.75-100))*-5), tail7.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*203/1.5-290))*-8), tail7.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*203/1.5+290))*-5));


        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(1.5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*202/0.75-50))*0.8), body.rotateAngleY + (float) Math.toRadians(0), body.rotateAngleZ + (float) Math.toRadians(0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*202/1.5-150))*-1.5));


        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*202/0.75+65))*1.3), chest.rotateAngleY + (float) Math.toRadians(0), chest.rotateAngleZ + (float) Math.toRadians(0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*202/1.5+150))*2));



        if (tickAnim >= 0 && tickAnim < 40) {
            xx = -24.5 + (((tickAnim - 0) / 40) * (14.75-(-24.5)));
            yy = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 48) {
            xx = 14.75 + (((tickAnim - 40) / 8) * (-6.76678-(14.75)));
            yy = 0 + (((tickAnim - 40) / 8) * (0.0128-(0)));
            zz = 0 + (((tickAnim - 40) / 8) * (-0.99992-(0)));
        }
        else if (tickAnim >= 48 && tickAnim < 53) {
            xx = -6.76678 + (((tickAnim - 48) / 5) * (-24.5-(-6.76678)));
            yy = 0.0128 + (((tickAnim - 48) / 5) * (0-(0.0128)));
            zz = -0.99992 + (((tickAnim - 48) / 5) * (0-(-0.99992)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm, leftArm.rotateAngleX + (float) Math.toRadians(xx), leftArm.rotateAngleY + (float) Math.toRadians(yy), leftArm.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 2) * (-0.2-(0)));
            zz = 0 + (((tickAnim - 0) / 2) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 2) / 1) * (0-(0)));
            yy = -0.2 + (((tickAnim - 2) / 1) * (0-(-0.2)));
            zz = 0 + (((tickAnim - 2) / 1) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 3) / 2) * (-0.2-(0)));
            zz = 0 + (((tickAnim - 3) / 2) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 5) / 2) * (0-(0)));
            yy = -0.2 + (((tickAnim - 5) / 2) * (0-(-0.2)));
            zz = 0 + (((tickAnim - 5) / 2) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 7) / 18) * (0-(0)));
            yy = 0 + (((tickAnim - 7) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 18) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 25) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 25) / 15) * (-1.25-(0)));
            zz = 0 + (((tickAnim - 25) / 15) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 53) {
            xx = 0 + (((tickAnim - 40) / 13) * (0-(0)));
            yy = -1.25 + (((tickAnim - 40) / 13) * (0-(-1.25)));
            zz = 0 + (((tickAnim - 40) / 13) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftArm.rotationPointX = this.leftArm.rotationPointX + (float)(xx);
        this.leftArm.rotationPointY = this.leftArm.rotationPointY - (float)(yy);
        this.leftArm.rotationPointZ = this.leftArm.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 20.5 + (((tickAnim - 0) / 40) * (7-(20.5)));
            yy = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 48) {
            xx = 7 + (((tickAnim - 40) / 8) * (-10.07469-(7)));
            yy = 0 + (((tickAnim - 40) / 8) * (0.40262-(0)));
            zz = 0 + (((tickAnim - 40) / 8) * (2.4123-(0)));
        }
        else if (tickAnim >= 48 && tickAnim < 53) {
            xx = -10.07469 + (((tickAnim - 48) / 5) * (20.5-(-10.07469)));
            yy = 0.40262 + (((tickAnim - 48) / 5) * (0-(0.40262)));
            zz = 2.4123 + (((tickAnim - 48) / 5) * (0-(2.4123)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm2, leftArm2.rotateAngleX + (float) Math.toRadians(xx), leftArm2.rotateAngleY + (float) Math.toRadians(yy), leftArm2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            yy = -0.675 + (((tickAnim - 0) / 13) * (0.08-(-0.675)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 13) / 27) * (0-(0)));
            yy = 0.08 + (((tickAnim - 13) / 27) * (0-(0.08)));
            zz = 0 + (((tickAnim - 13) / 27) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 48) {
            xx = 0 + (((tickAnim - 40) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 40) / 8) * (2.55-(0)));
            zz = 0 + (((tickAnim - 40) / 8) * (0-(0)));
        }
        else if (tickAnim >= 48 && tickAnim < 53) {
            xx = 0 + (((tickAnim - 48) / 5) * (0-(0)));
            yy = 2.55 + (((tickAnim - 48) / 5) * (-0.675-(2.55)));
            zz = 0 + (((tickAnim - 48) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftArm2.rotationPointX = this.leftArm2.rotationPointX + (float)(xx);
        this.leftArm2.rotationPointY = this.leftArm2.rotationPointY - (float)(yy);
        this.leftArm2.rotationPointZ = this.leftArm2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 27) {
            xx = 3.75 + (((tickAnim - 0) / 27) * (-13.25-(3.75)));
            yy = 0 + (((tickAnim - 0) / 27) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 27) * (0-(0)));
        }
        else if (tickAnim >= 27 && tickAnim < 40) {
            xx = -13.25 + (((tickAnim - 27) / 13) * (-4.5-(-13.25)));
            yy = 0 + (((tickAnim - 27) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 27) / 13) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 48) {
            xx = -4.5 + (((tickAnim - 40) / 8) * (31.38-(-4.5)));
            yy = 0 + (((tickAnim - 40) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 8) * (0-(0)));
        }
        else if (tickAnim >= 48 && tickAnim < 52) {
            xx = 31.38 + (((tickAnim - 48) / 4) * (-2.3-(31.38)));
            yy = 0 + (((tickAnim - 48) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 48) / 4) * (0-(0)));
        }
        else if (tickAnim >= 52 && tickAnim < 53) {
            xx = -2.3 + (((tickAnim - 52) / 1) * (3.75-(-2.3)));
            yy = 0 + (((tickAnim - 52) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 52) / 1) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm3, leftArm3.rotateAngleX + (float) Math.toRadians(xx), leftArm3.rotateAngleY + (float) Math.toRadians(yy), leftArm3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            yy = -0.225 + (((tickAnim - 0) / 13) * (1.45-(-0.225)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 27) {
            xx = 0 + (((tickAnim - 13) / 14) * (0-(0)));
            yy = 1.45 + (((tickAnim - 13) / 14) * (0.9-(1.45)));
            zz = 0 + (((tickAnim - 13) / 14) * (0-(0)));
        }
        else if (tickAnim >= 27 && tickAnim < 48) {
            xx = 0 + (((tickAnim - 27) / 21) * (0-(0)));
            yy = 0.9 + (((tickAnim - 27) / 21) * (0.27-(0.9)));
            zz = 0 + (((tickAnim - 27) / 21) * (-1.125-(0)));
        }
        else if (tickAnim >= 48 && tickAnim < 53) {
            xx = 0 + (((tickAnim - 48) / 5) * (0-(0)));
            yy = 0.27 + (((tickAnim - 48) / 5) * (-0.225-(0.27)));
            zz = -1.125 + (((tickAnim - 48) / 5) * (0-(-1.125)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftArm3.rotationPointX = this.leftArm3.rotationPointX + (float)(xx);
        this.leftArm3.rotationPointY = this.leftArm3.rotationPointY - (float)(yy);
        this.leftArm3.rotationPointZ = this.leftArm3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 3.25 + (((tickAnim - 0) / 13) * (14.5-(3.25)));
            yy = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 21) {
            xx = 14.5 + (((tickAnim - 13) / 8) * (-6.76678-(14.5)));
            yy = 0 + (((tickAnim - 13) / 8) * (-0.0128-(0)));
            zz = 0 + (((tickAnim - 13) / 8) * (0.99992-(0)));
        }
        else if (tickAnim >= 21 && tickAnim < 27) {
            xx = -6.76678 + (((tickAnim - 21) / 6) * (-24.5-(-6.76678)));
            yy = -0.0128 + (((tickAnim - 21) / 6) * (0-(-0.0128)));
            zz = 0.99992 + (((tickAnim - 21) / 6) * (0-(0.99992)));
        }
        else if (tickAnim >= 27 && tickAnim < 53) {
            xx = -24.5 + (((tickAnim - 27) / 26) * (3.25-(-24.5)));
            yy = 0 + (((tickAnim - 27) / 26) * (0-(0)));
            zz = 0 + (((tickAnim - 27) / 26) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm, rightArm.rotateAngleX + (float) Math.toRadians(xx), rightArm.rotateAngleY + (float) Math.toRadians(yy), rightArm.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            yy = -0.625 + (((tickAnim - 0) / 13) * (-1.2-(-0.625)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 27) {
            xx = 0 + (((tickAnim - 13) / 14) * (0-(0)));
            yy = -1.2 + (((tickAnim - 13) / 14) * (0-(-1.2)));
            zz = 0 + (((tickAnim - 13) / 14) * (0-(0)));
        }
        else if (tickAnim >= 27 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 27) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 27) / 1) * (-0.2-(0)));
            zz = 0 + (((tickAnim - 27) / 1) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 28) / 2) * (0-(0)));
            yy = -0.2 + (((tickAnim - 28) / 2) * (0-(-0.2)));
            zz = 0 + (((tickAnim - 28) / 2) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 32) {
            xx = 0 + (((tickAnim - 30) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 30) / 2) * (-0.2-(0)));
            zz = 0 + (((tickAnim - 30) / 2) * (0-(0)));
        }
        else if (tickAnim >= 32 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 32) / 1) * (0-(0)));
            yy = -0.2 + (((tickAnim - 32) / 1) * (0-(-0.2)));
            zz = 0 + (((tickAnim - 32) / 1) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 53) {
            xx = 0 + (((tickAnim - 33) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 33) / 20) * (-0.625-(0)));
            zz = 0 + (((tickAnim - 33) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightArm.rotationPointX = this.rightArm.rotationPointX + (float)(xx);
        this.rightArm.rotationPointY = this.rightArm.rotationPointY - (float)(yy);
        this.rightArm.rotationPointZ = this.rightArm.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 13.25 + (((tickAnim - 0) / 13) * (7-(13.25)));
            yy = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 20) {
            xx = 7 + (((tickAnim - 13) / 7) * (-11.32469-(7)));
            yy = 0 + (((tickAnim - 13) / 7) * (0.40262-(0)));
            zz = 0 + (((tickAnim - 13) / 7) * (-2.41229-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 27) {
            xx = -11.32469 + (((tickAnim - 20) / 7) * (20.5-(-11.32469)));
            yy = 0.40262 + (((tickAnim - 20) / 7) * (0-(0.40262)));
            zz = -2.41229 + (((tickAnim - 20) / 7) * (0-(-2.41229)));
        }
        else if (tickAnim >= 27 && tickAnim < 53) {
            xx = 20.5 + (((tickAnim - 27) / 26) * (13.25-(20.5)));
            yy = 0 + (((tickAnim - 27) / 26) * (0-(0)));
            zz = 0 + (((tickAnim - 27) / 26) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm2, rightArm2.rotateAngleX + (float) Math.toRadians(xx), rightArm2.rotateAngleY + (float) Math.toRadians(yy), rightArm2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 13) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 13) / 7) * (2.55-(0)));
            zz = 0 + (((tickAnim - 13) / 7) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 27) {
            xx = 0 + (((tickAnim - 20) / 7) * (0-(0)));
            yy = 2.55 + (((tickAnim - 20) / 7) * (-0.675-(2.55)));
            zz = 0 + (((tickAnim - 20) / 7) * (0-(0)));
        }
        else if (tickAnim >= 27 && tickAnim < 32) {
            xx = 0 + (((tickAnim - 27) / 5) * (0-(0)));
            yy = -0.675 + (((tickAnim - 27) / 5) * (0-(-0.675)));
            zz = 0 + (((tickAnim - 27) / 5) * (0-(0)));
        }
        else if (tickAnim >= 32 && tickAnim < 53) {
            xx = 0 + (((tickAnim - 32) / 21) * (0-(0)));
            yy = 0 + (((tickAnim - 32) / 21) * (0-(0)));
            zz = 0 + (((tickAnim - 32) / 21) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightArm2.rotationPointX = this.rightArm2.rotationPointX + (float)(xx);
        this.rightArm2.rotationPointY = this.rightArm2.rotationPointY - (float)(yy);
        this.rightArm2.rotationPointZ = this.rightArm2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = -14.25 + (((tickAnim - 0) / 13) * (-10.46-(-14.25)));
            yy = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 20) {
            xx = -10.46 + (((tickAnim - 13) / 7) * (34.88-(-10.46)));
            yy = 0 + (((tickAnim - 13) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 7) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 25) {
            xx = 34.88 + (((tickAnim - 20) / 5) * (-1.05-(34.88)));
            yy = 0 + (((tickAnim - 20) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 5) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 27) {
            xx = -1.05 + (((tickAnim - 25) / 2) * (3.75-(-1.05)));
            yy = 0 + (((tickAnim - 25) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 2) * (0-(0)));
        }
        else if (tickAnim >= 27 && tickAnim < 42) {
            xx = 3.75 + (((tickAnim - 27) / 15) * (-7.38-(3.75)));
            yy = 0 + (((tickAnim - 27) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 27) / 15) * (0-(0)));
        }
        else if (tickAnim >= 42 && tickAnim < 53) {
            xx = -7.38 + (((tickAnim - 42) / 11) * (-14.25-(-7.38)));
            yy = 0 + (((tickAnim - 42) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 42) / 11) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm3, rightArm3.rotateAngleX + (float) Math.toRadians(xx), rightArm3.rotateAngleY + (float) Math.toRadians(yy), rightArm3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            yy = 1.525 + (((tickAnim - 0) / 20) * (0.605-(1.525)));
            zz = 0 + (((tickAnim - 0) / 20) * (-1.45-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 27) {
            xx = 0 + (((tickAnim - 20) / 7) * (0-(0)));
            yy = 0.605 + (((tickAnim - 20) / 7) * (-0.27-(0.605)));
            zz = -1.45 + (((tickAnim - 20) / 7) * (0-(-1.45)));
        }
        else if (tickAnim >= 27 && tickAnim < 42) {
            xx = 0 + (((tickAnim - 27) / 15) * (0-(0)));
            yy = -0.27 + (((tickAnim - 27) / 15) * (2.285-(-0.27)));
            zz = 0 + (((tickAnim - 27) / 15) * (0-(0)));
        }
        else if (tickAnim >= 42 && tickAnim < 53) {
            xx = 0 + (((tickAnim - 42) / 11) * (0-(0)));
            yy = 2.285 + (((tickAnim - 42) / 11) * (1.525-(2.285)));
            zz = 0 + (((tickAnim - 42) / 11) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightArm3.rotationPointX = this.rightArm3.rotationPointX + (float)(xx);
        this.rightArm3.rotationPointY = this.rightArm3.rotationPointY - (float)(yy);
        this.rightArm3.rotationPointZ = this.rightArm3.rotationPointZ + (float)(zz);



        this.setRotateAngle(neck1, neck1.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*202/0.75-100))*0.15), neck1.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*202/1.5+280))*1), neck1.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*203/1.5+400))*0.4));


        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*202/0.75-100))*0.2), neck2.rotateAngleY + (float) Math.toRadians(0), neck2.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*203/1.5+380))*0.7));


        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*202/0.75-100))*0.3), neck3.rotateAngleY + (float) Math.toRadians(0), neck3.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*203/1.5-350))*0.8));


        this.setRotateAngle(neck4, neck4.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*202/0.75-100))*0.3), neck4.rotateAngleY + (float) Math.toRadians(0), neck4.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*203/1.5+300))*1));


        this.setRotateAngle(neck5, neck5.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*202/0.75-100))*0.2), neck5.rotateAngleY + (float) Math.toRadians(0), neck5.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*203/1.5+280))*0.1));


        this.setRotateAngle(neck6, neck6.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*202/0.75-100))*0.2), neck6.rotateAngleY + (float) Math.toRadians(0), neck6.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*203/1.5+280))*0.2));


        this.setRotateAngle(neck7, neck7.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*202/0.75-100))*0.2), neck7.rotateAngleY + (float) Math.toRadians(0), neck7.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*203/1.5+280))*0.1));


        this.setRotateAngle(neck8, neck8.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*202/0.75-100))*0.3), neck8.rotateAngleY + (float) Math.toRadians(0), neck8.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*203/1.5+280))*0.5));


        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*202/0.75-100))*0.7), head.rotateAngleY + (float) Math.toRadians(0), head.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*203/1.5+280))*0.5));


        this.setRotateAngle(tail8, tail8.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*202/0.75-90))*-8), tail8.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*203/1.5-290))*-8), tail8.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*203/1.5+290))*-5));


    }

    public void animRunning(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraLusotitan entity = (EntityPrehistoricFloraLusotitan) entitylivingbaseIn;
        int animCycle = 25;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        this.setRotateAngle(hips, hips.rotateAngleX + (float) Math.toRadians(xx), hips.rotateAngleY + (float) Math.toRadians(yy), hips.rotateAngleZ + (float) Math.toRadians(zz));

        this.hips.rotationPointX = this.hips.rotationPointX + (float)(0);
        this.hips.rotationPointY = this.hips.rotationPointY - (float)(-0.225+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*430/0.75-125))*0.6);
        this.hips.rotationPointZ = this.hips.rotationPointZ + (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*430/0.75-120))*0.3);



        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 17.25 + (((tickAnim - 0) / 5) * (-4.05359-(17.25)));
            yy = 0 + (((tickAnim - 0) / 5) * (1.86025-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (-0.73461-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 7) {
            xx = -4.05359 + (((tickAnim - 5) / 2) * (-10.25-(-4.05359)));
            yy = 1.86025 + (((tickAnim - 5) / 2) * (0-(1.86025)));
            zz = -0.73461 + (((tickAnim - 5) / 2) * (0-(-0.73461)));
        }
        else if (tickAnim >= 7 && tickAnim < 25) {
            xx = -10.25 + (((tickAnim - 7) / 18) * (17.25-(-10.25)));
            yy = 0 + (((tickAnim - 7) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 18) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg, rightLeg.rotateAngleX + (float) Math.toRadians(xx), rightLeg.rotateAngleY + (float) Math.toRadians(yy), rightLeg.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = -0.725 + (((tickAnim - 0) / 5) * (0-(-0.725)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 5) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 5) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 2) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 7) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 7) / 1) * (-0.5-(0)));
            zz = 0 + (((tickAnim - 7) / 1) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            yy = -0.5 + (((tickAnim - 8) / 2) * (0-(-0.5)));
            zz = 0 + (((tickAnim - 8) / 2) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 10) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 2) * (-0.5-(0)));
            zz = 0 + (((tickAnim - 10) / 2) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 12) / 1) * (0-(0)));
            yy = -0.5 + (((tickAnim - 12) / 1) * (0-(-0.5)));
            zz = 0 + (((tickAnim - 12) / 1) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 13) / 12) * (0-(0)));
            yy = 0 + (((tickAnim - 13) / 12) * (-0.725-(0)));
            zz = 0 + (((tickAnim - 13) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightLeg.rotationPointX = this.rightLeg.rotationPointX + (float)(xx);
        this.rightLeg.rotationPointY = this.rightLeg.rotationPointY - (float)(yy);
        this.rightLeg.rotationPointZ = this.rightLeg.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 7.5 + (((tickAnim - 0) / 5) * (-9.81-(7.5)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 7) {
            xx = -9.81 + (((tickAnim - 5) / 2) * (-17.25-(-9.81)));
            yy = 0 + (((tickAnim - 5) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 2) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 17) {
            xx = -17.25 + (((tickAnim - 7) / 10) * (-4.36-(-17.25)));
            yy = 0 + (((tickAnim - 7) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 10) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 25) {
            xx = -4.36 + (((tickAnim - 17) / 8) * (7.5-(-4.36)));
            yy = 0 + (((tickAnim - 17) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 17) / 8) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg2, rightLeg2.rotateAngleX + (float) Math.toRadians(xx), rightLeg2.rotateAngleY + (float) Math.toRadians(yy), rightLeg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = 0.75 + (((tickAnim - 0) / 5) * (4.445-(0.75)));
            zz = 0 + (((tickAnim - 0) / 5) * (-1.04-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 5) / 2) * (0-(0)));
            yy = 4.445 + (((tickAnim - 5) / 2) * (-1.8-(4.445)));
            zz = -1.04 + (((tickAnim - 5) / 2) * (0-(-1.04)));
        }
        else if (tickAnim >= 7 && tickAnim < 17) {
            xx = 0 + (((tickAnim - 7) / 10) * (0-(0)));
            yy = -1.8 + (((tickAnim - 7) / 10) * (-0.345-(-1.8)));
            zz = 0 + (((tickAnim - 7) / 10) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 17) / 8) * (0-(0)));
            yy = -0.345 + (((tickAnim - 17) / 8) * (0.75-(-0.345)));
            zz = 0 + (((tickAnim - 17) / 8) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightLeg2.rotationPointX = this.rightLeg2.rotationPointX + (float)(xx);
        this.rightLeg2.rotationPointY = this.rightLeg2.rotationPointY - (float)(yy);
        this.rightLeg2.rotationPointZ = this.rightLeg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 10.25 + (((tickAnim - 0) / 3) * (22.82-(10.25)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 22.82 + (((tickAnim - 3) / 2) * (1.68-(22.82)));
            yy = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 2) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 7) {
            xx = 1.68 + (((tickAnim - 5) / 2) * (27.5-(1.68)));
            yy = 0 + (((tickAnim - 5) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 2) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 17) {
            xx = 27.5 + (((tickAnim - 7) / 10) * (1.69-(27.5)));
            yy = 0 + (((tickAnim - 7) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 10) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 25) {
            xx = 1.69 + (((tickAnim - 17) / 8) * (10.25-(1.69)));
            yy = 0 + (((tickAnim - 17) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 17) / 8) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg3, rightLeg3.rotateAngleX + (float) Math.toRadians(xx), rightLeg3.rotateAngleY + (float) Math.toRadians(yy), rightLeg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            yy = -1.075 + (((tickAnim - 0) / 7) * (-0.205-(-1.075)));
            zz = 0 + (((tickAnim - 0) / 7) * (0.11-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 17) {
            xx = 0 + (((tickAnim - 7) / 10) * (0-(0)));
            yy = -0.205 + (((tickAnim - 7) / 10) * (0.325-(-0.205)));
            zz = 0.11 + (((tickAnim - 7) / 10) * (0.25-(0.11)));
        }
        else if (tickAnim >= 17 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 17) / 8) * (0-(0)));
            yy = 0.325 + (((tickAnim - 17) / 8) * (-1.075-(0.325)));
            zz = 0.25 + (((tickAnim - 17) / 8) * (0-(0.25)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightLeg3.rotationPointX = this.rightLeg3.rotationPointX + (float)(xx);
        this.rightLeg3.rotationPointY = this.rightLeg3.rotationPointY - (float)(yy);
        this.rightLeg3.rotationPointZ = this.rightLeg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = -32.77116 + (((tickAnim - 0) / 5) * (8.51597-(-32.77116)));
            yy = -10.0264 + (((tickAnim - 0) / 5) * (-5.93432-(-10.0264)));
            zz = 4.32692 + (((tickAnim - 0) / 5) * (-0.88692-(4.32692)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 8.51597 + (((tickAnim - 5) / 3) * (0-(8.51597)));
            yy = -5.93432 + (((tickAnim - 5) / 3) * (-6.75-(-5.93432)));
            zz = -0.88692 + (((tickAnim - 5) / 3) * (0-(-0.88692)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 8) / 5) * (0-(0)));
            yy = -6.75 + (((tickAnim - 8) / 5) * (-8-(-6.75)));
            zz = 0 + (((tickAnim - 8) / 5) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 17) {
            xx = 0 + (((tickAnim - 13) / 4) * (0-(0)));
            yy = -8 + (((tickAnim - 13) / 4) * (-8-(-8)));
            zz = 0 + (((tickAnim - 13) / 4) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 17) / 8) * (-32.77116-(0)));
            yy = -8 + (((tickAnim - 17) / 8) * (-10.0264-(-8)));
            zz = 0 + (((tickAnim - 17) / 8) * (4.32692-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg4, rightLeg4.rotateAngleX + (float) Math.toRadians(xx), rightLeg4.rotateAngleY + (float) Math.toRadians(yy), rightLeg4.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = 1.3 + (((tickAnim - 0) / 5) * (-0.275-(1.3)));
            zz = -2.225 + (((tickAnim - 0) / 5) * (0.5-(-2.225)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            yy = -0.275 + (((tickAnim - 5) / 3) * (0-(-0.275)));
            zz = 0.5 + (((tickAnim - 5) / 3) * (0-(0.5)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 8) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 8) / 5) * (-0.11-(0)));
            zz = 0 + (((tickAnim - 8) / 5) * (-0.67-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 17) {
            xx = 0 + (((tickAnim - 13) / 4) * (0-(0)));
            yy = -0.11 + (((tickAnim - 13) / 4) * (-0.11-(-0.11)));
            zz = -0.67 + (((tickAnim - 13) / 4) * (-0.545-(-0.67)));
        }
        else if (tickAnim >= 17 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 17) / 8) * (0-(0)));
            yy = -0.11 + (((tickAnim - 17) / 8) * (1.3-(-0.11)));
            zz = -0.545 + (((tickAnim - 17) / 8) * (-2.225-(-0.545)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightLeg4.rotationPointX = this.rightLeg4.rotationPointX + (float)(xx);
        this.rightLeg4.rotationPointY = this.rightLeg4.rotationPointY - (float)(yy);
        this.rightLeg4.rotationPointZ = this.rightLeg4.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = -2.25 + (((tickAnim - 0) / 13) * (17.25-(-2.25)));
            yy = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 17) {
            xx = 17.25 + (((tickAnim - 13) / 4) * (-1.75958-(17.25)));
            yy = 0 + (((tickAnim - 13) / 4) * (-1.64439-(0)));
            zz = 0 + (((tickAnim - 13) / 4) * (0.574-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 19) {
            xx = -1.75958 + (((tickAnim - 17) / 2) * (-11.23-(-1.75958)));
            yy = -1.64439 + (((tickAnim - 17) / 2) * (0-(-1.64439)));
            zz = 0.574 + (((tickAnim - 17) / 2) * (0-(0.574)));
        }
        else if (tickAnim >= 19 && tickAnim < 25) {
            xx = -11.23 + (((tickAnim - 19) / 6) * (-2.25-(-11.23)));
            yy = 0 + (((tickAnim - 19) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 19) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg, leftLeg.rotateAngleX + (float) Math.toRadians(xx), leftLeg.rotateAngleY + (float) Math.toRadians(yy), leftLeg.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (-1-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 13) / 6) * (0-(0)));
            yy = -1 + (((tickAnim - 13) / 6) * (0-(-1)));
            zz = 0 + (((tickAnim - 13) / 6) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 21) {
            xx = 0 + (((tickAnim - 19) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 19) / 2) * (-0.7-(0)));
            zz = 0 + (((tickAnim - 19) / 2) * (0-(0)));
        }
        else if (tickAnim >= 21 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 21) / 2) * (0-(0)));
            yy = -0.7 + (((tickAnim - 21) / 2) * (0-(-0.7)));
            zz = 0 + (((tickAnim - 21) / 2) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 24) {
            xx = 0 + (((tickAnim - 23) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 23) / 1) * (-0.7-(0)));
            zz = 0 + (((tickAnim - 23) / 1) * (0-(0)));
        }
        else if (tickAnim >= 24 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 24) / 1) * (0-(0)));
            yy = -0.7 + (((tickAnim - 24) / 1) * (0-(-0.7)));
            zz = 0 + (((tickAnim - 24) / 1) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftLeg.rotationPointX = this.leftLeg.rotationPointX + (float)(xx);
        this.leftLeg.rotationPointY = this.leftLeg.rotationPointY - (float)(yy);
        this.leftLeg.rotationPointZ = this.leftLeg.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 6) {
            xx = -13.75 + (((tickAnim - 0) / 6) * (-3.19-(-13.75)));
            yy = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 13) {
            xx = -3.19 + (((tickAnim - 6) / 7) * (1.5-(-3.19)));
            yy = 0 + (((tickAnim - 6) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 7) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 17) {
            xx = 1.5 + (((tickAnim - 13) / 4) * (-16.77-(1.5)));
            yy = 0 + (((tickAnim - 13) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 4) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 19) {
            xx = -16.77 + (((tickAnim - 17) / 2) * (-15.25-(-16.77)));
            yy = 0 + (((tickAnim - 17) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 17) / 2) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 25) {
            xx = -15.25 + (((tickAnim - 19) / 6) * (-13.75-(-15.25)));
            yy = 0 + (((tickAnim - 19) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 19) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg2, leftLeg2.rotateAngleX + (float) Math.toRadians(xx), leftLeg2.rotateAngleY + (float) Math.toRadians(yy), leftLeg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            yy = 0.85 + (((tickAnim - 0) / 6) * (0-(0.85)));
            zz = 0 + (((tickAnim - 0) / 6) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 6) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 6) / 7) * (0.675-(0)));
            zz = 0 + (((tickAnim - 6) / 7) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 17) {
            xx = 0 + (((tickAnim - 13) / 4) * (0-(0)));
            yy = 0.675 + (((tickAnim - 13) / 4) * (5.975-(0.675)));
            zz = 0 + (((tickAnim - 13) / 4) * (-1.25-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 17) / 2) * (0-(0)));
            yy = 5.975 + (((tickAnim - 17) / 2) * (-1.875-(5.975)));
            zz = -1.25 + (((tickAnim - 17) / 2) * (0-(-1.25)));
        }
        else if (tickAnim >= 19 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 19) / 6) * (0-(0)));
            yy = -1.875 + (((tickAnim - 19) / 6) * (0.85-(-1.875)));
            zz = 0 + (((tickAnim - 19) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftLeg2.rotationPointX = this.leftLeg2.rotationPointX + (float)(xx);
        this.leftLeg2.rotationPointY = this.leftLeg2.rotationPointY - (float)(yy);
        this.leftLeg2.rotationPointZ = this.leftLeg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 15 + (((tickAnim - 0) / 6) * (-1.84-(15)));
            yy = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = -1.84 + (((tickAnim - 6) / 2) * (2.71-(-1.84)));
            yy = 0 + (((tickAnim - 6) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 2) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = 2.71 + (((tickAnim - 8) / 5) * (9.25-(2.71)));
            yy = 0 + (((tickAnim - 8) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 5) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 16) {
            xx = 9.25 + (((tickAnim - 13) / 3) * (29.71-(9.25)));
            yy = 0 + (((tickAnim - 13) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 3) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 18) {
            xx = 29.71 + (((tickAnim - 16) / 2) * (10.11-(29.71)));
            yy = 0 + (((tickAnim - 16) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 16) / 2) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 19) {
            xx = 10.11 + (((tickAnim - 18) / 1) * (26.25-(10.11)));
            yy = 0 + (((tickAnim - 18) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 1) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 25) {
            xx = 26.25 + (((tickAnim - 19) / 6) * (15-(26.25)));
            yy = 0 + (((tickAnim - 19) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 19) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg3, leftLeg3.rotateAngleX + (float) Math.toRadians(xx), leftLeg3.rotateAngleY + (float) Math.toRadians(yy), leftLeg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            yy = -0.375 + (((tickAnim - 0) / 13) * (0.775-(-0.375)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 13) / 6) * (0-(0)));
            yy = 0.775 + (((tickAnim - 13) / 6) * (0-(0.775)));
            zz = 0 + (((tickAnim - 13) / 6) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 19) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 19) / 6) * (-0.375-(0)));
            zz = 0 + (((tickAnim - 19) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftLeg3.rotationPointX = this.leftLeg3.rotationPointX + (float)(xx);
        this.leftLeg3.rotationPointY = this.leftLeg3.rotationPointY - (float)(yy);
        this.leftLeg3.rotationPointZ = this.leftLeg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 6) / 7) * (-26.98145-(0)));
            yy = 0 + (((tickAnim - 6) / 7) * (9.33254-(0)));
            zz = 0 + (((tickAnim - 6) / 7) * (-2.83504-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 17) {
            xx = -26.98145 + (((tickAnim - 13) / 4) * (9.73563-(-26.98145)));
            yy = 9.33254 + (((tickAnim - 13) / 4) * (12.57226-(9.33254)));
            zz = -2.83504 + (((tickAnim - 13) / 4) * (2.1388-(-2.83504)));
        }
        else if (tickAnim >= 17 && tickAnim < 19) {
            xx = 9.73563 + (((tickAnim - 17) / 2) * (0-(9.73563)));
            yy = 12.57226 + (((tickAnim - 17) / 2) * (0-(12.57226)));
            zz = 2.1388 + (((tickAnim - 17) / 2) * (0-(2.1388)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg4, leftLeg4.rotateAngleX + (float) Math.toRadians(xx), leftLeg4.rotateAngleY + (float) Math.toRadians(yy), leftLeg4.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 6) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 6) / 7) * (0.35-(0)));
            zz = 0 + (((tickAnim - 6) / 7) * (-2.175-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 17) {
            xx = 0 + (((tickAnim - 13) / 4) * (0-(0)));
            yy = 0.35 + (((tickAnim - 13) / 4) * (-0.35-(0.35)));
            zz = -2.175 + (((tickAnim - 13) / 4) * (1.2-(-2.175)));
        }
        else if (tickAnim >= 17 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 17) / 2) * (0-(0)));
            yy = -0.35 + (((tickAnim - 17) / 2) * (0-(-0.35)));
            zz = 1.2 + (((tickAnim - 17) / 2) * (0-(1.2)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftLeg4.rotationPointX = this.leftLeg4.rotationPointX + (float)(xx);
        this.leftLeg4.rotationPointY = this.leftLeg4.rotationPointY - (float)(yy);
        this.leftLeg4.rotationPointZ = this.leftLeg4.rotationPointZ + (float)(zz);



        this.setRotateAngle(tail1, tail1.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*600/1.05-75))*-0.25), tail1.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/1.25-85))*-2), tail1.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/1.25-120))*2));


        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*600/1.05))*0.3), tail2.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/1.25))*5), tail2.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/1.25))*2));


        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*600/1.05-75))*-0.3), tail3.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/1.25-85))*8), tail3.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/1.25-120))*2.5));


        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*600/1.05-70))*2), tail4.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/1.25-90))*3), tail4.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/1.25-120))*1.5));


        this.setRotateAngle(tail5, tail5.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*600/1.05-80))*2), tail5.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/1.25-100))*5), tail5.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tail6, tail6.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*600/1.05-90))*3), tail6.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/1.25-120))*6), tail6.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/1.25-140))*-3));


        this.setRotateAngle(tail7, tail7.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*600/1.05-100))*5), tail7.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/1.25-160))*8), tail7.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/1.25-150))*-4));


        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(6.25+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*600/1.05-75))*1.5), body.rotateAngleY + (float) Math.toRadians(0), body.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/1.25-180))*-4));

        if (tickAnim >= 2 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 2) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 2) / 4) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.2-50))*0.15-(0)));
            zz = 0 + (((tickAnim - 2) / 4) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 6) / 4) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.2-50))*0.15 + (((tickAnim - 6) / 4) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.2-50))*0.15)));
            zz = 0 + (((tickAnim - 6) / 4) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 17) {
            xx = 0 + (((tickAnim - 10) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 7) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 21) {
            xx = 0 + (((tickAnim - 17) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 17) / 4) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.2-50))*0.15-(0)));
            zz = 0 + (((tickAnim - 17) / 4) * (0-(0)));
        }
        else if (tickAnim >= 21 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 21) / 4) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.2-50))*0.15 + (((tickAnim - 21) / 4) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.2-50))*0.15)));
            zz = 0 + (((tickAnim - 21) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.body.rotationPointX = this.body.rotationPointX + (float)(xx);
        this.body.rotationPointY = this.body.rotationPointY - (float)(yy);
        this.body.rotationPointZ = this.body.rotationPointZ + (float)(zz);



        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(0.5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*600/1.04+68))*1.8), chest.rotateAngleY + (float) Math.toRadians(0), chest.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/1.25+150))*2));

        if (tickAnim >= 2 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 2) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 2) / 4) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*450/0.2-20))*0.1-(0)));
            zz = 0 + (((tickAnim - 2) / 4) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 6) / 4) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*450/0.2-20))*0.1 + (((tickAnim - 6) / 4) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*450/0.2-20))*0.1)));
            zz = 0 + (((tickAnim - 6) / 4) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 17) {
            xx = 0 + (((tickAnim - 10) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 7) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 21) {
            xx = 0 + (((tickAnim - 17) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 17) / 4) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*450/0.2-20))*0.1-(0)));
            zz = 0 + (((tickAnim - 17) / 4) * (0-(0)));
        }
        else if (tickAnim >= 21 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 21) / 4) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*450/0.2-20))*0.1 + (((tickAnim - 21) / 4) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*450/0.2-20))*0.1)));
            zz = 0 + (((tickAnim - 21) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.chest.rotationPointX = this.chest.rotationPointX + (float)(xx);
        this.chest.rotationPointY = this.chest.rotationPointY - (float)(yy);
        this.chest.rotationPointZ = this.chest.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = -23.25 + (((tickAnim - 0) / 18) * (14.75-(-23.25)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 23) {
            xx = 14.75 + (((tickAnim - 18) / 5) * (-7.01678-(14.75)));
            yy = 0 + (((tickAnim - 18) / 5) * (0.0128-(0)));
            zz = 0 + (((tickAnim - 18) / 5) * (-0.99992-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 25) {
            xx = -7.01678 + (((tickAnim - 23) / 2) * (-23.25-(-7.01678)));
            yy = 0.0128 + (((tickAnim - 23) / 2) * (0-(0.0128)));
            zz = -0.99992 + (((tickAnim - 23) / 2) * (0-(-0.99992)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm, leftArm.rotateAngleX + (float) Math.toRadians(xx), leftArm.rotateAngleY + (float) Math.toRadians(yy), leftArm.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            yy = 0.9 + (((tickAnim - 0) / 2) * (0.47-(0.9)));
            zz = 0 + (((tickAnim - 0) / 2) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 2) / 1) * (0-(0)));
            yy = 0.47 + (((tickAnim - 2) / 1) * (1.475-(0.47)));
            zz = 0 + (((tickAnim - 2) / 1) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            yy = 1.475 + (((tickAnim - 3) / 2) * (0.47-(1.475)));
            zz = 0 + (((tickAnim - 3) / 2) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 5) / 2) * (0-(0)));
            yy = 0.47 + (((tickAnim - 5) / 2) * (0-(0.47)));
            zz = 0 + (((tickAnim - 5) / 2) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 7) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 7) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 6) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 13) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 13) / 6) * (0.7-(0)));
            zz = 0 + (((tickAnim - 13) / 6) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 19) / 6) * (0-(0)));
            yy = 0.7 + (((tickAnim - 19) / 6) * (0.9-(0.7)));
            zz = 0 + (((tickAnim - 19) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftArm.rotationPointX = this.leftArm.rotationPointX + (float)(xx);
        this.leftArm.rotationPointY = this.leftArm.rotationPointY - (float)(yy);
        this.leftArm.rotationPointZ = this.leftArm.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 19) {
            xx = 12.5 + (((tickAnim - 0) / 19) * (7-(12.5)));
            yy = 0 + (((tickAnim - 0) / 19) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 19) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 23) {
            xx = 7 + (((tickAnim - 19) / 4) * (-12.82469-(7)));
            yy = 0 + (((tickAnim - 19) / 4) * (0.40262-(0)));
            zz = 0 + (((tickAnim - 19) / 4) * (2.4123-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 25) {
            xx = -12.82469 + (((tickAnim - 23) / 2) * (12.5-(-12.82469)));
            yy = 0.40262 + (((tickAnim - 23) / 2) * (0-(0.40262)));
            zz = 2.4123 + (((tickAnim - 23) / 2) * (0-(2.4123)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm2, leftArm2.rotateAngleX + (float) Math.toRadians(xx), leftArm2.rotateAngleY + (float) Math.toRadians(yy), leftArm2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            yy = -0.5 + (((tickAnim - 0) / 7) * (0.08-(-0.5)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 7) / 12) * (0-(0)));
            yy = 0.08 + (((tickAnim - 7) / 12) * (0.95-(0.08)));
            zz = 0 + (((tickAnim - 7) / 12) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 19) / 4) * (0-(0)));
            yy = 0.95 + (((tickAnim - 19) / 4) * (4.35-(0.95)));
            zz = 0 + (((tickAnim - 19) / 4) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 23) / 2) * (0-(0)));
            yy = 4.35 + (((tickAnim - 23) / 2) * (-0.5-(4.35)));
            zz = 0 + (((tickAnim - 23) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftArm2.rotationPointX = this.leftArm2.rotationPointX + (float)(xx);
        this.leftArm2.rotationPointY = this.leftArm2.rotationPointY - (float)(yy);
        this.leftArm2.rotationPointZ = this.leftArm2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 9.75 + (((tickAnim - 0) / 13) * (-13.25-(9.75)));
            yy = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 19) {
            xx = -13.25 + (((tickAnim - 13) / 6) * (-4.5-(-13.25)));
            yy = 0 + (((tickAnim - 13) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 6) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 23) {
            xx = -4.5 + (((tickAnim - 19) / 4) * (30.13-(-4.5)));
            yy = 0 + (((tickAnim - 19) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 19) / 4) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 24) {
            xx = 30.13 + (((tickAnim - 23) / 1) * (-8.8-(30.13)));
            yy = 0 + (((tickAnim - 23) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 1) * (0-(0)));
        }
        else if (tickAnim >= 24 && tickAnim < 25) {
            xx = -8.8 + (((tickAnim - 24) / 1) * (9.75-(-8.8)));
            yy = 0 + (((tickAnim - 24) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 24) / 1) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm3, leftArm3.rotateAngleX + (float) Math.toRadians(xx), leftArm3.rotateAngleY + (float) Math.toRadians(yy), leftArm3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            yy = -0.225 + (((tickAnim - 0) / 7) * (2.9-(-0.225)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 7) / 3) * (0-(0)));
            yy = 2.9 + (((tickAnim - 7) / 3) * (2.28-(2.9)));
            zz = 0 + (((tickAnim - 7) / 3) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            yy = 2.28 + (((tickAnim - 10) / 3) * (2.425-(2.28)));
            zz = 0 + (((tickAnim - 10) / 3) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 13) / 6) * (0-(0)));
            yy = 2.425 + (((tickAnim - 13) / 6) * (0-(2.425)));
            zz = 0 + (((tickAnim - 13) / 6) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 19) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 19) / 4) * (0.31-(0)));
            zz = 0 + (((tickAnim - 19) / 4) * (-1.05-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 23) / 2) * (0-(0)));
            yy = 0.31 + (((tickAnim - 23) / 2) * (-0.225-(0.31)));
            zz = -1.05 + (((tickAnim - 23) / 2) * (0-(-1.05)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftArm3.rotationPointX = this.leftArm3.rotationPointX + (float)(xx);
        this.leftArm3.rotationPointY = this.leftArm3.rotationPointY - (float)(yy);
        this.leftArm3.rotationPointZ = this.leftArm3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 3.25 + (((tickAnim - 0) / 6) * (14.5-(3.25)));
            yy = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 9) {
            xx = 14.5 + (((tickAnim - 6) / 3) * (-13.26678-(14.5)));
            yy = 0 + (((tickAnim - 6) / 3) * (-0.0128-(0)));
            zz = 0 + (((tickAnim - 6) / 3) * (0.99992-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 13) {
            xx = -13.26678 + (((tickAnim - 9) / 4) * (-28-(-13.26678)));
            yy = -0.0128 + (((tickAnim - 9) / 4) * (0-(-0.0128)));
            zz = 0.99992 + (((tickAnim - 9) / 4) * (0-(0.99992)));
        }
        else if (tickAnim >= 13 && tickAnim < 25) {
            xx = -28 + (((tickAnim - 13) / 12) * (3.25-(-28)));
            yy = 0 + (((tickAnim - 13) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm, rightArm.rotateAngleX + (float) Math.toRadians(xx), rightArm.rotateAngleY + (float) Math.toRadians(yy), rightArm.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            yy = 1.075 + (((tickAnim - 0) / 6) * (-0.025-(1.075)));
            zz = 0 + (((tickAnim - 0) / 6) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 6) / 7) * (0-(0)));
            yy = -0.025 + (((tickAnim - 6) / 7) * (0.75-(-0.025)));
            zz = 0 + (((tickAnim - 6) / 7) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 13) / 1) * (0-(0)));
            yy = 0.75 + (((tickAnim - 13) / 1) * (0.3-(0.75)));
            zz = 0 + (((tickAnim - 13) / 1) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 16) {
            xx = 0 + (((tickAnim - 14) / 2) * (0-(0)));
            yy = 0.3 + (((tickAnim - 14) / 2) * (1.55-(0.3)));
            zz = 0 + (((tickAnim - 14) / 2) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 16) / 2) * (0-(0)));
            yy = 1.55 + (((tickAnim - 16) / 2) * (0.3-(1.55)));
            zz = 0 + (((tickAnim - 16) / 2) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 18) / 1) * (0-(0)));
            yy = 0.3 + (((tickAnim - 18) / 1) * (0.75-(0.3)));
            zz = 0 + (((tickAnim - 18) / 1) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 19) / 6) * (0-(0)));
            yy = 0.75 + (((tickAnim - 19) / 6) * (1.075-(0.75)));
            zz = 0 + (((tickAnim - 19) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightArm.rotationPointX = this.rightArm.rotationPointX + (float)(xx);
        this.rightArm.rotationPointY = this.rightArm.rotationPointY - (float)(yy);
        this.rightArm.rotationPointZ = this.rightArm.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 13.25 + (((tickAnim - 0) / 6) * (7-(13.25)));
            yy = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 9) {
            xx = 7 + (((tickAnim - 6) / 3) * (-0.32469-(7)));
            yy = 0 + (((tickAnim - 6) / 3) * (0.40262-(0)));
            zz = 0 + (((tickAnim - 6) / 3) * (-2.41229-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 13) {
            xx = -0.32469 + (((tickAnim - 9) / 4) * (20.5-(-0.32469)));
            yy = 0.40262 + (((tickAnim - 9) / 4) * (0-(0.40262)));
            zz = -2.41229 + (((tickAnim - 9) / 4) * (0-(-2.41229)));
        }
        else if (tickAnim >= 13 && tickAnim < 25) {
            xx = 20.5 + (((tickAnim - 13) / 12) * (13.25-(20.5)));
            yy = 0 + (((tickAnim - 13) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm2, rightArm2.rotateAngleX + (float) Math.toRadians(xx), rightArm2.rotateAngleY + (float) Math.toRadians(yy), rightArm2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 6) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 6) / 3) * (2.55-(0)));
            zz = 0 + (((tickAnim - 6) / 3) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 9) / 4) * (0-(0)));
            yy = 2.55 + (((tickAnim - 9) / 4) * (-0.675-(2.55)));
            zz = 0 + (((tickAnim - 9) / 4) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 13) / 2) * (0-(0)));
            yy = -0.675 + (((tickAnim - 13) / 2) * (0-(-0.675)));
            zz = 0 + (((tickAnim - 13) / 2) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 15) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 15) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightArm2.rotationPointX = this.rightArm2.rotationPointX + (float)(xx);
        this.rightArm2.rotationPointY = this.rightArm2.rotationPointY - (float)(yy);
        this.rightArm2.rotationPointZ = this.rightArm2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 6) {
            xx = -14.25 + (((tickAnim - 0) / 6) * (-10.46-(-14.25)));
            yy = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 9) {
            xx = -10.46 + (((tickAnim - 6) / 3) * (35.63-(-10.46)));
            yy = 0 + (((tickAnim - 6) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 3) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 11) {
            xx = 35.63 + (((tickAnim - 9) / 2) * (-1.05-(35.63)));
            yy = 0 + (((tickAnim - 9) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 2) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 13) {
            xx = -1.05 + (((tickAnim - 11) / 2) * (3.75-(-1.05)));
            yy = 0 + (((tickAnim - 11) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 2) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 20) {
            xx = 3.75 + (((tickAnim - 13) / 7) * (-7.38-(3.75)));
            yy = 0 + (((tickAnim - 13) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 7) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 25) {
            xx = -7.38 + (((tickAnim - 20) / 5) * (-14.25-(-7.38)));
            yy = 0 + (((tickAnim - 20) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm3, rightArm3.rotateAngleX + (float) Math.toRadians(xx), rightArm3.rotateAngleY + (float) Math.toRadians(yy), rightArm3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 0) / 9) * (0-(0)));
            yy = 1.525 + (((tickAnim - 0) / 9) * (0.585-(1.525)));
            zz = 0 + (((tickAnim - 0) / 9) * (-1.375-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 9) / 4) * (0-(0)));
            yy = 0.585 + (((tickAnim - 9) / 4) * (-0.27-(0.585)));
            zz = -1.375 + (((tickAnim - 9) / 4) * (0-(-1.375)));
        }
        else if (tickAnim >= 13 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 13) / 7) * (0-(0)));
            yy = -0.27 + (((tickAnim - 13) / 7) * (1.36-(-0.27)));
            zz = 0 + (((tickAnim - 13) / 7) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 20) / 5) * (0-(0)));
            yy = 1.36 + (((tickAnim - 20) / 5) * (1.525-(1.36)));
            zz = 0 + (((tickAnim - 20) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightArm3.rotationPointX = this.rightArm3.rotationPointX + (float)(xx);
        this.rightArm3.rotationPointY = this.rightArm3.rotationPointY - (float)(yy);
        this.rightArm3.rotationPointZ = this.rightArm3.rotationPointZ + (float)(zz);



        this.setRotateAngle(neck1, neck1.rotateAngleX + (float) Math.toRadians(5.25+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*600/1.05-100))*1.5), neck1.rotateAngleY + (float) Math.toRadians(0), neck1.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/1.25+130))*1.7));

        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 4) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.2-150))*0.2-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 4) / 4) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.2-150))*0.2 + (((tickAnim - 4) / 4) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.2-150))*0.2)));
            zz = 0 + (((tickAnim - 4) / 4) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 8) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 8) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 5) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 13) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 13) / 5) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.2-150))*0.2-(0)));
            zz = 0 + (((tickAnim - 13) / 5) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 22) {
            xx = 0 + (((tickAnim - 18) / 4) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.2-150))*0.2 + (((tickAnim - 18) / 4) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.2-150))*0.2)));
            zz = 0 + (((tickAnim - 18) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.neck1.rotationPointX = this.neck1.rotationPointX + (float)(xx);
        this.neck1.rotationPointY = this.neck1.rotationPointY - (float)(yy);
        this.neck1.rotationPointZ = this.neck1.rotationPointZ + (float)(zz);
        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(8.5), neck3.rotateAngleY + (float) Math.toRadians(0), neck3.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(neck4, neck4.rotateAngleX + (float) Math.toRadians(3.5), neck4.rotateAngleY + (float) Math.toRadians(0), neck4.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(neck6, neck6.rotateAngleX + (float) Math.toRadians(xx), neck6.rotateAngleY + (float) Math.toRadians(yy), neck6.rotateAngleZ + (float) Math.toRadians(zz));
        this.setRotateAngle(neck7, neck7.rotateAngleX + (float) Math.toRadians(xx), neck7.rotateAngleY + (float) Math.toRadians(yy), neck7.rotateAngleZ + (float) Math.toRadians(zz));
        this.setRotateAngle(neck8, neck8.rotateAngleX + (float) Math.toRadians(-4-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*600/1.05-100))*1), neck8.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/1.25-150))*0.1), neck8.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/1.25-160))*-1));
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*600/1.05-100))*-1), head.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/1.25-150))*0.1), head.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/1.25-160))*-1.0));
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(0.5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/1.25-90))*2), jaw.rotateAngleY + (float) Math.toRadians(0), jaw.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(tail8, tail8.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*600/1.05-90))*8), tail8.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/1.25-130))*10), tail8.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/1.25-160))*-6));
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(5.25), neck2.rotateAngleY + (float) Math.toRadians(0), neck2.rotateAngleZ + (float) Math.toRadians(0));


    }

    public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        EntityPrehistoricFloraLusotitan e = (EntityPrehistoricFloraLusotitan) entity;
        animator.update(entity);

        animator.setAnimation(e.HURT_ANIMATION); //30 ticks
        animator.startKeyframe(8);
        animator.rotate(this.head, (float) Math.toRadians(-25), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.jaw, (float) Math.toRadians(30), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(12);
        animator.resetKeyframe(10);

    }
}
