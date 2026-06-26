package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.EntityPrehistoricFloraEosinopteryx;
import net.lepidodendron.entity.EntityPrehistoricFloraFukuivenator;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;

public class ModelEosinopteryx extends ModelBasePalaeopedia {
    private final AdvancedModelRenderer hips;
    private final AdvancedModelRenderer Basin_r1;
    private final AdvancedModelRenderer Basin_r2;
    private final AdvancedModelRenderer Basin_r3;
    private final AdvancedModelRenderer leftLeg;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer leftLeg2;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer leftLeg3;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer footL;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer rightLeg;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer rightLeg2;
    private final AdvancedModelRenderer cube_r6;
    private final AdvancedModelRenderer rightLeg3;
    private final AdvancedModelRenderer cube_r7;
    private final AdvancedModelRenderer footL2;
    private final AdvancedModelRenderer cube_r8;
    private final AdvancedModelRenderer Tail1;
    private final AdvancedModelRenderer Tail2;
    private final AdvancedModelRenderer cube_r9;
    private final AdvancedModelRenderer body;
    private final AdvancedModelRenderer cube_r10;
    private final AdvancedModelRenderer chest;
    private final AdvancedModelRenderer cube_r11;
    private final AdvancedModelRenderer cube_r12;
    private final AdvancedModelRenderer leftArm;
    private final AdvancedModelRenderer leftArm2;
    private final AdvancedModelRenderer cube_r13;
    private final AdvancedModelRenderer cube_r14;
    private final AdvancedModelRenderer leftArm3;
    private final AdvancedModelRenderer cube_r15;
    private final AdvancedModelRenderer cube_r16;
    private final AdvancedModelRenderer cube_r17;
    private final AdvancedModelRenderer rightArm;
    private final AdvancedModelRenderer rightArm2;
    private final AdvancedModelRenderer cube_r18;
    private final AdvancedModelRenderer cube_r19;
    private final AdvancedModelRenderer rightArm3;
    private final AdvancedModelRenderer cube_r20;
    private final AdvancedModelRenderer cube_r21;
    private final AdvancedModelRenderer cube_r22;
    private final AdvancedModelRenderer neck;
    private final AdvancedModelRenderer cube_r23;
    private final AdvancedModelRenderer cube_r24;
    private final AdvancedModelRenderer neck2;
    private final AdvancedModelRenderer cube_r25;
    private final AdvancedModelRenderer cube_r26;
    private final AdvancedModelRenderer neck3;
    private final AdvancedModelRenderer cube_r27;
    private final AdvancedModelRenderer cube_r28;
    private final AdvancedModelRenderer head;
    private final AdvancedModelRenderer cube_r29;
    private final AdvancedModelRenderer cube_r30;
    private final AdvancedModelRenderer cube_r31;
    private final AdvancedModelRenderer cube_r32;
    private final AdvancedModelRenderer cube_r33;
    private final AdvancedModelRenderer Jaw;

    private ModelAnimator animator;

    public ModelEosinopteryx() {
        this.textureWidth = 128;
        this.textureHeight = 128;

        this.hips = new AdvancedModelRenderer(this);
        this.hips.setRotationPoint(0.0F, 11.1F, 7.0F);


        this.Basin_r1 = new AdvancedModelRenderer(this);
        this.Basin_r1.setRotationPoint(0.5F, -2.0F, -1.0F);
        this.hips.addChild(Basin_r1);
        this.setRotateAngle(Basin_r1, -0.4189F, 0.0F, 0.0F);
        this.Basin_r1.cubeList.add(new ModelBox(Basin_r1, 15, 46, -0.5F, -2.3087F, -0.5317F, 0, 2, 6, 0.0F, false));

        this.Basin_r2 = new AdvancedModelRenderer(this);
        this.Basin_r2.setRotationPoint(0.5F, -2.0F, -1.0F);
        this.hips.addChild(Basin_r2);
        this.setRotateAngle(Basin_r2, -0.192F, 0.0F, 0.0F);
        this.Basin_r2.cubeList.add(new ModelBox(Basin_r2, 41, 13, -2.5F, 5.3913F, -0.1317F, 4, 1, 5, 0.0F, false));
        this.Basin_r2.cubeList.add(new ModelBox(Basin_r2, 0, 16, -3.0F, -0.6087F, -1.1317F, 5, 6, 6, 0.0F, false));

        this.Basin_r3 = new AdvancedModelRenderer(this);
        this.Basin_r3.setRotationPoint(0.5F, -3.7F, -1.0F);
        this.hips.addChild(Basin_r3);
        this.setRotateAngle(Basin_r3, -0.2967F, 0.0F, 0.0F);
        this.Basin_r3.cubeList.add(new ModelBox(Basin_r3, 0, 29, -1.5F, 0.06F, -0.8073F, 2, 1, 6, 0.0F, false));

        this.leftLeg = new AdvancedModelRenderer(this);
        this.leftLeg.setRotationPoint(2.5F, 1.0F, 1.0F);
        this.hips.addChild(leftLeg);
        this.setRotateAngle(leftLeg, -0.0436F, 0.0F, 0.0F);


        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(0.0F, -0.9F, -0.6F);
        this.leftLeg.addChild(cube_r1);
        this.setRotateAngle(cube_r1, -0.7854F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 32, 48, -1.0F, -0.4F, -1.7F, 2, 6, 4, 0.0F, true));

        this.leftLeg2 = new AdvancedModelRenderer(this);
        this.leftLeg2.setRotationPoint(0.2F, 1.8F, -5.2F);
        this.leftLeg.addChild(leftLeg2);
        this.setRotateAngle(leftLeg2, 0.1745F, 0.0F, 0.0F);


        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.leftLeg2.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.4712F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 7, 59, 0.0F, 1.8F, 1.7F, 0, 6, 2, -0.001F, true));
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 0, 54, -0.5F, -0.2F, -0.3F, 1, 9, 2, -0.001F, true));

        this.leftLeg3 = new AdvancedModelRenderer(this);
        this.leftLeg3.setRotationPoint(0.0F, 6.9F, 5.1F);
        this.leftLeg2.addChild(leftLeg3);
        this.setRotateAngle(leftLeg3, -0.1745F, 0.0F, 0.0F);


        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.leftLeg3.addChild(cube_r3);
        this.setRotateAngle(cube_r3, -0.6283F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 0, 0, -0.5F, -0.1F, -1.6F, 1, 5, 2, -0.002F, true));

        this.footL = new AdvancedModelRenderer(this);
        this.footL.setRotationPoint(0.0F, 3.6F, -3.0F);
        this.leftLeg3.addChild(footL);


        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.footL.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.0524F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 46, 37, -1.0F, -0.3F, -4.0F, 2, 1, 5, 0.0F, true));

        this.rightLeg = new AdvancedModelRenderer(this);
        this.rightLeg.setRotationPoint(-2.5F, 1.0F, 1.0F);
        this.hips.addChild(rightLeg);
        this.setRotateAngle(rightLeg, -0.0436F, 0.0F, 0.0F);


        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(0.0F, -0.9F, -0.6F);
        this.rightLeg.addChild(cube_r5);
        this.setRotateAngle(cube_r5, -0.7854F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 32, 48, -1.0F, -0.4F, -1.7F, 2, 6, 4, 0.0F, false));

        this.rightLeg2 = new AdvancedModelRenderer(this);
        this.rightLeg2.setRotationPoint(-0.2F, 1.8F, -5.2F);
        this.rightLeg.addChild(rightLeg2);
        this.setRotateAngle(rightLeg2, 0.1745F, 0.0F, 0.0F);


        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.rightLeg2.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.4712F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 7, 59, 0.0F, 1.8F, 1.7F, 0, 6, 2, -0.001F, false));
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 0, 54, -0.5F, -0.2F, -0.3F, 1, 9, 2, -0.001F, false));

        this.rightLeg3 = new AdvancedModelRenderer(this);
        this.rightLeg3.setRotationPoint(0.0F, 6.9F, 5.1F);
        this.rightLeg2.addChild(rightLeg3);
        this.setRotateAngle(rightLeg3, -0.1745F, 0.0F, 0.0F);


        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.rightLeg3.addChild(cube_r7);
        this.setRotateAngle(cube_r7, -0.6283F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 0, 0, -0.5F, -0.1F, -1.6F, 1, 5, 2, -0.002F, false));

        this.footL2 = new AdvancedModelRenderer(this);
        this.footL2.setRotationPoint(0.0F, 3.6F, -3.0F);
        this.rightLeg3.addChild(footL2);


        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.footL2.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.0524F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 46, 37, -1.0F, -0.3F, -4.0F, 2, 1, 5, 0.0F, false));

        this.Tail1 = new AdvancedModelRenderer(this);
        this.Tail1.setRotationPoint(0.0F, -1.6F, 3.5F);
        this.hips.addChild(Tail1);
        this.setRotateAngle(Tail1, -0.2094F, 0.0F, 0.0F);
        this.Tail1.cubeList.add(new ModelBox(Tail1, 36, 0, -1.5F, -0.1F, -0.4F, 3, 3, 6, 0.0F, false));
        this.Tail1.cubeList.add(new ModelBox(Tail1, 19, 0, -1.0F, 2.9F, -0.4F, 2, 1, 6, 0.0F, false));

        this.Tail2 = new AdvancedModelRenderer(this);
        this.Tail2.setRotationPoint(0.0F, 0.0F, 5.6F);
        this.Tail1.addChild(Tail2);


        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(0.5F, 0.0F, 0.0F);
        this.Tail2.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.0873F, 0.0F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 14, 20, -1.0F, 0.0F, -0.6F, 1, 3, 9, -0.001F, false));
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 10, 35, -1.5F, 0.0F, -0.6F, 2, 2, 7, 0.0F, false));

        this.body = new AdvancedModelRenderer(this);
        this.body.setRotationPoint(0.0F, -0.7F, -1.5F);
        this.hips.addChild(body);
        this.setRotateAngle(body, -0.1745F, 0.0F, 0.0F);
        this.body.cubeList.add(new ModelBox(body, 26, 18, -1.5F, -3.1421F, -7.879F, 3, 1, 8, 0.001F, false));
        this.body.cubeList.add(new ModelBox(body, 0, 0, -2.5F, -2.1421F, -7.879F, 5, 7, 8, 0.001F, false));
        this.body.cubeList.add(new ModelBox(body, 19, 8, -2.0F, 4.8579F, -7.879F, 4, 1, 8, 0.0F, false));

        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(0.0F, -2.0421F, -7.879F);
        this.body.addChild(cube_r10);
        this.setRotateAngle(cube_r10, -0.0332F, 0.0072F, 0.0077F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 26, 28, 0.0F, -2.1F, 0.0F, 0, 2, 9, 0.0F, false));

        this.chest = new AdvancedModelRenderer(this);
        this.chest.setRotationPoint(0.0F, -2.0421F, -7.879F);
        this.body.addChild(chest);
        this.chest.cubeList.add(new ModelBox(chest, -1, 44, -2.5F, 0.0F, -2.0F, 5, 6, 3, 0.0F, false));
        this.chest.cubeList.add(new ModelBox(chest, 22, 33, -2.0F, 6.0F, -1.8F, 4, 1, 2, 0.0F, false));

        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(0.5F, 0.0F, 0.0F);
        this.chest.addChild(cube_r11);
        this.setRotateAngle(cube_r11, 0.3491F, 0.0F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 26, 18, -0.4F, -1.3F, -1.6F, 0, 2, 3, 0.0F, false));

        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(0.5F, 0.0F, -1.9F);
        this.chest.addChild(cube_r12);
        this.setRotateAngle(cube_r12, 0.384F, 0.0F, 0.0F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 30, 40, -2.0F, -0.2F, 0.2F, 3, 1, 2, 0.0F, false));

        this.leftArm = new AdvancedModelRenderer(this);
        this.leftArm.setRotationPoint(2.4F, 4.8F, -1.6F);
        this.chest.addChild(leftArm);
        this.setRotateAngle(leftArm, -0.9113F, 0.2485F, -0.3073F);
        this.leftArm.cubeList.add(new ModelBox(leftArm, 50, 5, -0.6386F, -1.7291F, -0.0262F, 1, 2, 5, 0.0F, true));
        this.leftArm.cubeList.add(new ModelBox(leftArm, 38, 37, 0.1614F, -4.7291F, -0.0262F, 0, 3, 7, 0.0F, true));

        this.leftArm2 = new AdvancedModelRenderer(this);
        this.leftArm2.setRotationPoint(-0.6386F, -0.7291F, 4.4738F);
        this.leftArm.addChild(leftArm2);
        this.setRotateAngle(leftArm2, 0.5237F, 0.0129F, 0.0118F);


        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(0.0F, -0.4F, -0.2F);
        this.leftArm2.addChild(cube_r13);
        this.setRotateAngle(cube_r13, -1.4835F, -0.0348F, -0.003F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 23, 40, 0.9F, -5.6F, -1.0F, 0, 5, 6, -0.001F, true));

        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(0.0F, -0.4F, -0.2F);
        this.leftArm2.addChild(cube_r14);
        this.setRotateAngle(cube_r14, -1.4835F, 0.0F, 0.0F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 48, 44, 0.0F, -0.6F, 0.0F, 1, 2, 5, -0.001F, true));

        this.leftArm3 = new AdvancedModelRenderer(this);
        this.leftArm3.setRotationPoint(0.6F, 4.5F, -0.9F);
        this.leftArm2.addChild(leftArm3);


        this.cube_r15 = new AdvancedModelRenderer(this);
        this.cube_r15.setRotationPoint(0.0F, 0.2F, 0.9F);
        this.leftArm3.addChild(cube_r15);
        this.setRotateAngle(cube_r15, 0.4209F, -0.0956F, 0.1667F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 56, 20, -0.6F, -0.6F, -1.0F, 1, 3, 2, 0.0F, true));

        this.cube_r16 = new AdvancedModelRenderer(this);
        this.cube_r16.setRotationPoint(-0.6F, -0.2F, 1.5F);
        this.leftArm3.addChild(cube_r16);
        this.setRotateAngle(cube_r16, -1.5952F, -0.0389F, 0.1356F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 25, 52, 1.0F, -4.9127F, -2.6518F, 0, 5, 3, -0.001F, true));

        this.cube_r17 = new AdvancedModelRenderer(this);
        this.cube_r17.setRotationPoint(-0.6F, -0.2F, 1.5F);
        this.leftArm3.addChild(cube_r17);
        this.setRotateAngle(cube_r17, -2.2407F, -0.0441F, 0.137F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 55, 56, 1.0F, -4.3127F, -2.6518F, 0, 5, 3, -0.001F, true));

        this.rightArm = new AdvancedModelRenderer(this);
        this.rightArm.setRotationPoint(-2.4F, 4.8F, -1.6F);
        this.chest.addChild(rightArm);
        this.setRotateAngle(rightArm, -0.9113F, -0.2485F, 0.3073F);
        this.rightArm.cubeList.add(new ModelBox(rightArm, 50, 5, -0.3614F, -1.7291F, -0.0262F, 1, 2, 5, 0.0F, false));
        this.rightArm.cubeList.add(new ModelBox(rightArm, 38, 37, -0.1614F, -4.7291F, -0.0262F, 0, 3, 7, 0.0F, false));

        this.rightArm2 = new AdvancedModelRenderer(this);
        this.rightArm2.setRotationPoint(0.6386F, -0.7291F, 4.4738F);
        this.rightArm.addChild(rightArm2);
        this.setRotateAngle(rightArm2, 0.5237F, -0.0129F, -0.0118F);


        this.cube_r18 = new AdvancedModelRenderer(this);
        this.cube_r18.setRotationPoint(0.0F, -0.4F, -0.2F);
        this.rightArm2.addChild(cube_r18);
        this.setRotateAngle(cube_r18, -1.4835F, 0.0348F, 0.003F);
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 23, 40, -0.9F, -5.6F, -1.0F, 0, 5, 6, -0.001F, false));

        this.cube_r19 = new AdvancedModelRenderer(this);
        this.cube_r19.setRotationPoint(0.0F, -0.4F, -0.2F);
        this.rightArm2.addChild(cube_r19);
        this.setRotateAngle(cube_r19, -1.4835F, 0.0F, 0.0F);
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 48, 44, -1.0F, -0.6F, 0.0F, 1, 2, 5, -0.001F, false));

        this.rightArm3 = new AdvancedModelRenderer(this);
        this.rightArm3.setRotationPoint(-0.6F, 4.5F, -0.9F);
        this.rightArm2.addChild(rightArm3);


        this.cube_r20 = new AdvancedModelRenderer(this);
        this.cube_r20.setRotationPoint(0.0F, 0.2F, 0.9F);
        this.rightArm3.addChild(cube_r20);
        this.setRotateAngle(cube_r20, 0.4209F, 0.0956F, -0.1667F);
        this.cube_r20.cubeList.add(new ModelBox(cube_r20, 56, 20, -0.4F, -0.6F, -1.0F, 1, 3, 2, 0.0F, false));

        this.cube_r21 = new AdvancedModelRenderer(this);
        this.cube_r21.setRotationPoint(0.6F, -0.2F, 1.5F);
        this.rightArm3.addChild(cube_r21);
        this.setRotateAngle(cube_r21, -1.5952F, 0.0389F, -0.1356F);
        this.cube_r21.cubeList.add(new ModelBox(cube_r21, 25, 52, -1.0F, -4.9127F, -2.6518F, 0, 5, 3, -0.001F, false));

        this.cube_r22 = new AdvancedModelRenderer(this);
        this.cube_r22.setRotationPoint(0.6F, -0.2F, 1.5F);
        this.rightArm3.addChild(cube_r22);
        this.setRotateAngle(cube_r22, -2.2407F, 0.0441F, -0.137F);
        this.cube_r22.cubeList.add(new ModelBox(cube_r22, 55, 56, -1.0F, -4.3127F, -2.6518F, 0, 5, 3, -0.001F, false));

        this.neck = new AdvancedModelRenderer(this);
        this.neck.setRotationPoint(0.0F, 0.7F, -1.5F);
        this.chest.addChild(neck);
        this.setRotateAngle(neck, 0.0436F, 0.0F, 0.0F);


        this.cube_r23 = new AdvancedModelRenderer(this);
        this.cube_r23.setRotationPoint(0.5F, -0.7409F, 0.4629F);
        this.neck.addChild(cube_r23);
        this.setRotateAngle(cube_r23, -0.7156F, 0.0F, 0.0F);
        this.cube_r23.cubeList.add(new ModelBox(cube_r23, 14, 55, -0.5F, 4.0F, -1.9F, 0, 2, 4, 0.001F, false));
        this.cube_r23.cubeList.add(new ModelBox(cube_r23, 36, 28, -2.5F, 0.0F, -1.9F, 4, 4, 4, 0.001F, false));

        this.cube_r24 = new AdvancedModelRenderer(this);
        this.cube_r24.setRotationPoint(0.5F, 3.7591F, -0.7371F);
        this.neck.addChild(cube_r24);
        this.setRotateAngle(cube_r24, -0.4189F, 0.0F, 0.0F);
        this.cube_r24.cubeList.add(new ModelBox(cube_r24, 41, 20, -2.5F, -2.1305F, -0.0396F, 4, 2, 3, 0.0F, false));

        this.neck2 = new AdvancedModelRenderer(this);
        this.neck2.setRotationPoint(0.0F, -1.4409F, -1.4371F);
        this.neck.addChild(neck2);
        this.setRotateAngle(neck2, 0.0087F, 0.0F, 0.0F);


        this.cube_r25 = new AdvancedModelRenderer(this);
        this.cube_r25.setRotationPoint(0.5F, -0.2928F, 0.2104F);
        this.neck2.addChild(cube_r25);
        this.setRotateAngle(cube_r25, -0.9425F, 0.0F, 0.0F);
        this.cube_r25.cubeList.add(new ModelBox(cube_r25, 0, 16, -0.5F, 2.8216F, -1.1807F, 0, 2, 2, 0.0F, false));
        this.cube_r25.cubeList.add(new ModelBox(cube_r25, 45, 52, -2.0F, -0.1784F, -2.1807F, 3, 3, 3, 0.0F, false));

        this.cube_r26 = new AdvancedModelRenderer(this);
        this.cube_r26.setRotationPoint(0.5F, 2.0072F, -1.4897F);
        this.neck2.addChild(cube_r26);
        this.setRotateAngle(cube_r26, -0.6283F, 0.0F, 0.0F);
        this.cube_r26.cubeList.add(new ModelBox(cube_r26, 55, 13, -2.0F, -1.9057F, -0.0422F, 3, 2, 1, -0.011F, false));

        this.neck3 = new AdvancedModelRenderer(this);
        this.neck3.setRotationPoint(0.0F, -1.5928F, -1.5896F);
        this.neck2.addChild(neck3);
        this.setRotateAngle(neck3, 0.1745F, 0.0F, 0.0F);


        this.cube_r27 = new AdvancedModelRenderer(this);
        this.cube_r27.setRotationPoint(0.5F, -1.9F, -1.4F);
        this.neck3.addChild(cube_r27);
        this.setRotateAngle(cube_r27, -0.5411F, 0.0F, 0.0F);
        this.cube_r27.cubeList.add(new ModelBox(cube_r27, 36, 10, -1.5F, 0.1449F, 0.3898F, 2, 3, 2, -0.002F, false));

        this.cube_r28 = new AdvancedModelRenderer(this);
        this.cube_r28.setRotationPoint(0.5F, 1.4F, -1.7F);
        this.neck3.addChild(cube_r28);
        this.setRotateAngle(cube_r28, -0.4014F, 0.0F, 0.0F);
        this.cube_r28.cubeList.add(new ModelBox(cube_r28, 30, 0, -2.0F, -2.61F, -0.5234F, 3, 3, 2, -0.002F, false));

        this.head = new AdvancedModelRenderer(this);
        this.head.setRotationPoint(0.0F, -0.9F, -1.1F);
        this.neck3.addChild(head);
        this.setRotateAngle(head, 0.0611F, 0.0F, 0.0F);
        this.head.cubeList.add(new ModelBox(head, 49, 26, -1.5F, -0.4F, -3.0F, 3, 2, 3, 0.001F, false));
        this.head.cubeList.add(new ModelBox(head, 0, 42, -1.5F, -0.1F, -2.3F, 3, 1, 1, 0.02F, false));
        this.head.cubeList.add(new ModelBox(head, 55, 52, -1.0F, 0.6F, -4.0F, 2, 1, 1, 0.001F, false));
        this.head.cubeList.add(new ModelBox(head, 45, 10, -0.5F, 0.6F, -4.6F, 1, 1, 1, 0.002F, false));
        this.head.cubeList.add(new ModelBox(head, 22, 39, -0.5F, 0.6F, -5.1F, 1, 1, 1, 0.001F, false));

        this.cube_r29 = new AdvancedModelRenderer(this);
        this.cube_r29.setRotationPoint(0.5F, 0.6F, -5.1F);
        this.head.addChild(cube_r29);
        this.setRotateAngle(cube_r29, 0.2356F, 0.0F, 0.0F);
        this.cube_r29.cubeList.add(new ModelBox(cube_r29, 19, 3, -1.0F, 0.0066F, 0.0662F, 1, 1, 1, -0.001F, false));

        this.cube_r30 = new AdvancedModelRenderer(this);
        this.cube_r30.setRotationPoint(0.5F, -0.4F, -3.0F);
        this.head.addChild(cube_r30);
        this.setRotateAngle(cube_r30, 0.48F, 0.0F, 0.0F);
        this.cube_r30.cubeList.add(new ModelBox(cube_r30, 0, 29, -1.0F, 0.1841F, -1.5022F, 1, 1, 1, -0.002F, false));

        this.cube_r31 = new AdvancedModelRenderer(this);
        this.cube_r31.setRotationPoint(0.5F, -0.4F, -3.0F);
        this.head.addChild(cube_r31);
        this.setRotateAngle(cube_r31, 0.5847F, 0.0F, 0.0F);
        this.cube_r31.cubeList.add(new ModelBox(cube_r31, 0, 32, -1.0F, 0.0841F, -0.9022F, 1, 1, 1, -0.001F, false));

        this.cube_r32 = new AdvancedModelRenderer(this);
        this.cube_r32.setRotationPoint(0.5F, -0.4F, -3.0F);
        this.head.addChild(cube_r32);
        this.setRotateAngle(cube_r32, 0.3316F, 0.0F, 0.0F);
        this.cube_r32.cubeList.add(new ModelBox(cube_r32, 56, 37, -1.5F, 0.1F, -0.9F, 2, 1, 1, 0.0F, false));

        this.cube_r33 = new AdvancedModelRenderer(this);
        this.cube_r33.setRotationPoint(0.5F, -0.4F, -3.0F);
        this.head.addChild(cube_r33);
        this.setRotateAngle(cube_r33, 0.1047F, 0.0F, 0.0F);
        this.cube_r33.cubeList.add(new ModelBox(cube_r33, 7, 54, -1.5F, 0.0F, 0.0F, 2, 1, 3, 0.0001F, false));

        this.Jaw = new AdvancedModelRenderer(this);
        this.Jaw.setRotationPoint(0.0F, 1.6F, 0.0F);
        this.head.addChild(Jaw);
        this.setRotateAngle(Jaw, -0.1745F, 0.0F, 0.0F);
        this.Jaw.cubeList.add(new ModelBox(Jaw, 49, 0, -1.5F, 0.0F, -3.0F, 3, 1, 3, 0.0002F, false));
        this.Jaw.cubeList.add(new ModelBox(Jaw, 41, 48, -1.0F, 0.0F, -4.0F, 2, 1, 1, 0.0F, false));
        this.Jaw.cubeList.add(new ModelBox(Jaw, 19, 0, -0.5F, 0.0F, -5.1F, 1, 1, 1, 0.0F, false));
        this.Jaw.cubeList.add(new ModelBox(Jaw, 19, 0, -0.5F, 0.0F, -4.6F, 1, 1, 1, -0.001F, false));
        this.Jaw.cubeList.add(new ModelBox(Jaw, 53, 32, -1.5F, -1.0F, -2.0F, 3, 2, 2, -0.003F, false));
        updateDefaultPose();
        animator = ModelAnimator.create();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        animate((IAnimatedEntity) entity, f, f1, f2, f3, f4, f5);
        this.hips.render(f5);
    }

    public void renderStaticWall(float f) {
        this.body.offsetY = -0.01F;
        this.body.offsetZ = -0.03F;
        this.body.render(0.01F);
        resetToDefaultPose();
    }
    public void renderStaticFloor(float f) {
        this.hips.offsetY = 0.295F;
        this.hips.render(0.01F);
        resetToDefaultPose();
    }

    public void setRotateAngle(AdvancedModelRenderer AdvancedModelRenderer, float x, float y, float z) {
        AdvancedModelRenderer.rotateAngleX = x;
        AdvancedModelRenderer.rotateAngleY = y;
        AdvancedModelRenderer.rotateAngleZ = z;
    }

    @Override
    public void renderStaticBook(float f) {
        //Rotations, positions and sizing:
        this.hips.offsetY = 0.1F;
        this.hips.offsetX = 0.2F;
        this.hips.offsetZ = 2.0F;
        this.hips.rotateAngleY = (float)Math.toRadians(240);
        this.hips.rotateAngleX = (float)Math.toRadians(-0);
        this.hips.rotateAngleZ = (float)Math.toRadians(3);
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

    @Override
    public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
        super.setRotationAngles(f, f1, f2, f3, f4, f5, e);
        //this.resetToDefaultPose();

        EntityPrehistoricFloraEosinopteryx EntityMegalosaurus = (EntityPrehistoricFloraEosinopteryx) e;
//        this.hip.offsetZ = -0.5F;

        AdvancedModelRenderer[] Tail = {this.Tail1, this.Tail2};
        AdvancedModelRenderer[] Neck = {this.neck, this.neck2, this.neck3, this.head};
        AdvancedModelRenderer[] ArmL = {this.leftArm, this.leftArm2, this.leftArm3};
        AdvancedModelRenderer[] ArmR = {this.rightArm, this.rightArm2, this.rightArm3};

        EntityMegalosaurus.tailBuffer.applyChainSwingBuffer(Tail);

        if (EntityMegalosaurus.getAnimation() == EntityMegalosaurus.LAY_ANIMATION) {
            this.chainSwing(Neck, 0.5F, 0.10F, 0.5, f2, 0.8F);
            this.chainWave(Neck, 0.5F * 2, -0.02F, 0.5F, f2, 0.8F);
        }
        else {
            if (!EntityMegalosaurus.isReallyInWater()) {

                if (f3 == 0.0F || !EntityMegalosaurus.getIsMoving()) {
                    this.chainSwing(Neck, 0.05F, 0.10F, 0.5, f2, 0.8F);
                    this.chainWave(Neck, 0.05F * 2, -0.02F, 0.5F, f2, 0.8F);

                    this.chainWave(Tail, (0.15F * 0.35F), 0.125F * 0.15F, 0.2F, f2, 1F);
                    this.chainSwing(Tail, (0.15F * 0.35F) * 4F, 0.05F * 0.35F, 0.12F, f2, 1F);

                    this.chainWaveExtended(ArmL, 0.175F, 0.03F, 0.1F, 3F, f2, 1F);
                    this.chainWaveExtended(ArmR, 0.175F, -0.03F, -0.1F, 0f, f2, 1F);
                    this.chainFlapExtended(ArmL, 0.175F, -0.03F, 0.1F, 3F, f2, 1F);
                    this.chainFlapExtended(ArmR, 0.175F, -0.03F, -0.1F, 0f, f2, 1F);
                    this.walk(this.Jaw, 0.1F, -0.05F, false, 3F, 0.05F, f2, 1F);

                    this.walk(this.leftArm, 0.175F, 0.10F, true, 3F, 0.05F, f2, 1F);
                    this.walk(this.rightArm, 0.175F, -0.10F, true, 0F, 0.05F, f2, 1F);
                    this.flap(this.leftArm, 0.175F, -0.10F, true, 3F, 0.05F, f2, 1F);
                    this.flap(this.rightArm, 0.175F, -0.10F, true, 0F, 0.05F, f2, 1F);

                    return;
                }

                if (EntityMegalosaurus.getIsFast()) { //Running


                } else { //Walking

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
    }
    



    @Override
    public void setLivingAnimations(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        super.setLivingAnimations(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
        this.resetToDefaultPose();
        EntityPrehistoricFloraEosinopteryx ee = (EntityPrehistoricFloraEosinopteryx) entitylivingbaseIn;

        if (!ee.isReallyInWater()) {
            if (ee.getIsMoving()) {
                if (ee.getIsFast()) { //Running
                    animRunning(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);

                } else { //Walking
                    animWalking(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
                }
            }
        }
        else {
            //Swimming pose:
            if (!ee.getIsMoving()) { //static in water
                //
            }
            //moving in water
            //
        }
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
        else if (ee.getAnimation() == ee.ROAR_ANIMATION) { //The display/roar
            animNoise(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.GRAPPLE_ANIMATION) {
            animDisplay(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }

        
    }

    public void animAttack(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraEosinopteryx entity = (EntityPrehistoricFloraEosinopteryx) entitylivingbaseIn;
        int animCycle = 15;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (10.75-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 10.75 + (((tickAnim - 5) / 5) * (0-(10.75)));
            yy = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(xx), chest.rotateAngleY + (float) Math.toRadians(yy), chest.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (-23.25-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = -23.25 + (((tickAnim - 5) / 5) * (39-(-23.25)));
            yy = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 5) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = 39 + (((tickAnim - 10) / 5) * (0-(39)));
            yy = 0 + (((tickAnim - 10) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(xx), neck.rotateAngleY + (float) Math.toRadians(yy), neck.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 5) / 5) * (-0.25-(0)));
            zz = 0 + (((tickAnim - 5) / 5) * (-2.15-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 10) / 5) * (0-(0)));
            yy = -0.25 + (((tickAnim - 10) / 5) * (0-(-0.25)));
            zz = -2.15 + (((tickAnim - 10) / 5) * (0-(-2.15)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.neck.rotationPointX = this.neck.rotationPointX + (float)(xx);
        this.neck.rotationPointY = this.neck.rotationPointY - (float)(yy);
        this.neck.rotationPointZ = this.neck.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (-21.75-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = -21.75 + (((tickAnim - 5) / 5) * (0-(-21.75)));
            yy = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 5) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 10) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(xx), neck2.rotateAngleY + (float) Math.toRadians(yy), neck2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 5) / 5) * (0.5-(0)));
            zz = 0 + (((tickAnim - 5) / 5) * (-0.25-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 10) / 5) * (0-(0)));
            yy = 0.5 + (((tickAnim - 10) / 5) * (0-(0.5)));
            zz = -0.25 + (((tickAnim - 10) / 5) * (0-(-0.25)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.neck2.rotationPointX = this.neck2.rotationPointX + (float)(xx);
        this.neck2.rotationPointY = this.neck2.rotationPointY - (float)(yy);
        this.neck2.rotationPointZ = this.neck2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (31.5-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 31.5 + (((tickAnim - 5) / 5) * (-26.5-(31.5)));
            yy = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 5) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = -26.5 + (((tickAnim - 10) / 5) * (0-(-26.5)));
            yy = 0 + (((tickAnim - 10) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(xx), neck3.rotateAngleY + (float) Math.toRadians(yy), neck3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (-0.15-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0.325-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            yy = -0.15 + (((tickAnim - 5) / 5) * (0-(-0.15)));
            zz = 0.325 + (((tickAnim - 5) / 5) * (0-(0.325)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 10) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.neck3.rotationPointX = this.neck3.rotationPointX + (float)(xx);
        this.neck3.rotationPointY = this.neck3.rotationPointY - (float)(yy);
        this.neck3.rotationPointZ = this.neck3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (-16.25-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = -16.25 + (((tickAnim - 10) / 5) * (0-(-16.25)));
            yy = 0 + (((tickAnim - 10) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (11.5-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 11.5 + (((tickAnim - 5) / 3) * (34.75-(11.5)));
            yy = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 3) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 34.75 + (((tickAnim - 8) / 2) * (0-(34.75)));
            yy = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Jaw, Jaw.rotateAngleX + (float) Math.toRadians(xx), Jaw.rotateAngleY + (float) Math.toRadians(yy), Jaw.rotateAngleZ + (float) Math.toRadians(zz));
        
    }
    public void animEat(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraEosinopteryx entity = (EntityPrehistoricFloraEosinopteryx) entitylivingbaseIn;
        int animCycle = 20;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (22.25-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 22.25 + (((tickAnim - 10) / 10) * (0-(22.25)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(xx), body.rotateAngleY + (float) Math.toRadians(yy), body.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (13.75-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 13.75 + (((tickAnim - 10) / 10) * (0-(13.75)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(xx), chest.rotateAngleY + (float) Math.toRadians(yy), chest.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (-14.25-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = -14.25 + (((tickAnim - 10) / 10) * (0-(-14.25)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm, leftArm.rotateAngleX + (float) Math.toRadians(xx), leftArm.rotateAngleY + (float) Math.toRadians(yy), leftArm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (-22.25-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = -22.25 + (((tickAnim - 10) / 10) * (0-(-22.25)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm2, leftArm2.rotateAngleX + (float) Math.toRadians(xx), leftArm2.rotateAngleY + (float) Math.toRadians(yy), leftArm2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (13.75-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 13.75 + (((tickAnim - 10) / 10) * (0-(13.75)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm3, leftArm3.rotateAngleX + (float) Math.toRadians(xx), leftArm3.rotateAngleY + (float) Math.toRadians(yy), leftArm3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (42.25-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 42.25 + (((tickAnim - 10) / 10) * (0-(42.25)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(xx), neck.rotateAngleY + (float) Math.toRadians(yy), neck.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (-0.45-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            yy = -0.45 + (((tickAnim - 10) / 10) * (0-(-0.45)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.neck.rotationPointX = this.neck.rotationPointX + (float)(xx);
        this.neck.rotationPointY = this.neck.rotationPointY - (float)(yy);
        this.neck.rotationPointZ = this.neck.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (21-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 21 + (((tickAnim - 10) / 10) * (0-(21)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(xx), neck2.rotateAngleY + (float) Math.toRadians(yy), neck2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (15.88-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 15.88 + (((tickAnim - 5) / 5) * (-17.25-(15.88)));
            yy = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 5) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = -17.25 + (((tickAnim - 10) / 10) * (0-(-17.25)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0.175-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 5) / 5) * (-0.075-(0)));
            zz = 0.175 + (((tickAnim - 5) / 5) * (-0.125-(0.175)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            yy = -0.075 + (((tickAnim - 10) / 10) * (0-(-0.075)));
            zz = -0.125 + (((tickAnim - 10) / 10) * (0-(-0.125)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.head.rotationPointX = this.head.rotationPointX + (float)(xx);
        this.head.rotationPointY = this.head.rotationPointY - (float)(yy);
        this.head.rotationPointZ = this.head.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 7) / 1) * (34.75-(0)));
            yy = 0 + (((tickAnim - 7) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 1) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 34.75 + (((tickAnim - 8) / 2) * (0-(34.75)));
            yy = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Jaw, Jaw.rotateAngleX + (float) Math.toRadians(xx), Jaw.rotateAngleY + (float) Math.toRadians(yy), Jaw.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (-14.25-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = -14.25 + (((tickAnim - 10) / 10) * (0-(-14.25)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm, rightArm.rotateAngleX + (float) Math.toRadians(xx), rightArm.rotateAngleY + (float) Math.toRadians(yy), rightArm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (-22.25-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = -22.25 + (((tickAnim - 10) / 10) * (0-(-22.25)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm2, rightArm2.rotateAngleX + (float) Math.toRadians(xx), rightArm2.rotateAngleY + (float) Math.toRadians(yy), rightArm2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (13.75-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 13.75 + (((tickAnim - 10) / 10) * (0-(13.75)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm3, rightArm3.rotateAngleX + (float) Math.toRadians(xx), rightArm3.rotateAngleY + (float) Math.toRadians(yy), rightArm3.rotateAngleZ + (float) Math.toRadians(zz));
        
    }
    public void animNest(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraEosinopteryx entity = (EntityPrehistoricFloraEosinopteryx) entitylivingbaseIn;
        int animCycle = 50;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (52.75-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = 52.75 + (((tickAnim - 10) / 5) * (-20.87-(52.75)));
            yy = 0 + (((tickAnim - 10) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 5) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = -20.87 + (((tickAnim - 15) / 5) * (0-(-20.87)));
            yy = 0 + (((tickAnim - 15) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 5) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 20) / 10) * (52.75-(0)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 35) {
            xx = 52.75 + (((tickAnim - 30) / 5) * (-20.87-(52.75)));
            yy = 0 + (((tickAnim - 30) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 5) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 40) {
            xx = -20.87 + (((tickAnim - 35) / 5) * (-13.75-(-20.87)));
            yy = 0 + (((tickAnim - 35) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 5) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = -13.75 + (((tickAnim - 40) / 10) * (0-(-13.75)));
            yy = 0 + (((tickAnim - 40) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg, leftLeg.rotateAngleX + (float) Math.toRadians(xx), leftLeg.rotateAngleY + (float) Math.toRadians(yy), leftLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 20) / 20) * (-22.5-(0)));
            yy = 0 + (((tickAnim - 20) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 20) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = -22.5 + (((tickAnim - 40) / 10) * (0-(-22.5)));
            yy = 0 + (((tickAnim - 40) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg2, leftLeg2.rotateAngleX + (float) Math.toRadians(xx), leftLeg2.rotateAngleY + (float) Math.toRadians(yy), leftLeg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (23.25-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = 23.25 + (((tickAnim - 10) / 5) * (-17.62-(23.25)));
            yy = 0 + (((tickAnim - 10) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 5) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = -17.62 + (((tickAnim - 15) / 5) * (0-(-17.62)));
            yy = 0 + (((tickAnim - 15) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 5) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 20) / 10) * (23.25-(0)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 35) {
            xx = 23.25 + (((tickAnim - 30) / 5) * (-17.62-(23.25)));
            yy = 0 + (((tickAnim - 30) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 5) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 40) {
            xx = -17.62 + (((tickAnim - 35) / 5) * (32.75-(-17.62)));
            yy = 0 + (((tickAnim - 35) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 5) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = 32.75 + (((tickAnim - 40) / 10) * (0-(32.75)));
            yy = 0 + (((tickAnim - 40) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg3, leftLeg3.rotateAngleX + (float) Math.toRadians(xx), leftLeg3.rotateAngleY + (float) Math.toRadians(yy), leftLeg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 20) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 20) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftLeg3.rotationPointX = this.leftLeg3.rotationPointX + (float)(xx);
        this.leftLeg3.rotationPointY = this.leftLeg3.rotationPointY - (float)(yy);
        this.leftLeg3.rotationPointZ = this.leftLeg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (-39.12-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = -39.12 + (((tickAnim - 5) / 5) * (34.25-(-39.12)));
            yy = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 5) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = 34.25 + (((tickAnim - 10) / 5) * (74.38-(34.25)));
            yy = 0 + (((tickAnim - 10) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 5) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = 74.38 + (((tickAnim - 15) / 5) * (0-(74.38)));
            yy = 0 + (((tickAnim - 15) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 5) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 20) / 5) * (-32.37-(0)));
            yy = 0 + (((tickAnim - 20) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 5) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 30) {
            xx = -32.37 + (((tickAnim - 25) / 5) * (34.25-(-32.37)));
            yy = 0 + (((tickAnim - 25) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 5) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 35) {
            xx = 34.25 + (((tickAnim - 30) / 5) * (74.38-(34.25)));
            yy = 0 + (((tickAnim - 30) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 5) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 40) {
            xx = 74.38 + (((tickAnim - 35) / 5) * (3.25-(74.38)));
            yy = 0 + (((tickAnim - 35) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 5) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = 3.25 + (((tickAnim - 40) / 10) * (0-(3.25)));
            yy = 0 + (((tickAnim - 40) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(footL, footL.rotateAngleX + (float) Math.toRadians(xx), footL.rotateAngleY + (float) Math.toRadians(yy), footL.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 5) / 5) * (0.6-(0)));
            zz = 0 + (((tickAnim - 5) / 5) * (-0.025-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            yy = 0.6 + (((tickAnim - 10) / 3) * (2.45-(0.6)));
            zz = -0.025 + (((tickAnim - 10) / 3) * (1.08-(-0.025)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 13) / 2) * (0-(0)));
            yy = 2.45 + (((tickAnim - 13) / 2) * (1.4-(2.45)));
            zz = 1.08 + (((tickAnim - 13) / 2) * (0.49-(1.08)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 15) / 5) * (0-(0)));
            yy = 1.4 + (((tickAnim - 15) / 5) * (0-(1.4)));
            zz = 0.49 + (((tickAnim - 15) / 5) * (0-(0.49)));
        }
        else if (tickAnim >= 20 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 20) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 20) / 5) * (0.8-(0)));
            zz = 0 + (((tickAnim - 20) / 5) * (0.175-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 25) / 5) * (0-(0)));
            yy = 0.8 + (((tickAnim - 25) / 5) * (0.6-(0.8)));
            zz = 0.175 + (((tickAnim - 25) / 5) * (-0.025-(0.175)));
        }
        else if (tickAnim >= 30 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 30) / 3) * (0-(0)));
            yy = 0.6 + (((tickAnim - 30) / 3) * (2.45-(0.6)));
            zz = -0.025 + (((tickAnim - 30) / 3) * (1.08-(-0.025)));
        }
        else if (tickAnim >= 33 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 33) / 2) * (0-(0)));
            yy = 2.45 + (((tickAnim - 33) / 2) * (1.4-(2.45)));
            zz = 1.08 + (((tickAnim - 33) / 2) * (0.49-(1.08)));
        }
        else if (tickAnim >= 35 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 35) / 5) * (0-(0)));
            yy = 1.4 + (((tickAnim - 35) / 5) * (0.8-(1.4)));
            zz = 0.49 + (((tickAnim - 35) / 5) * (0-(0.49)));
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 40) / 10) * (0-(0)));
            yy = 0.8 + (((tickAnim - 40) / 10) * (0-(0.8)));
            zz = 0 + (((tickAnim - 40) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.footL.rotationPointX = this.footL.rotationPointX + (float)(xx);
        this.footL.rotationPointY = this.footL.rotationPointY - (float)(yy);
        this.footL.rotationPointZ = this.footL.rotationPointZ + (float)(zz);

    }
    public void animLay(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraEosinopteryx entity = (EntityPrehistoricFloraEosinopteryx) entitylivingbaseIn;
        int animCycle = 50;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (-21.75-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = -21.75 + (((tickAnim - 20) / 10) * (-21.75-(-21.75)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = -21.75 + (((tickAnim - 30) / 10) * (8.63-(-21.75)));
            yy = 0 + (((tickAnim - 30) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 10) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = 8.63 + (((tickAnim - 40) / 10) * (0-(8.63)));
            yy = 0 + (((tickAnim - 40) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(hips, hips.rotateAngleX + (float) Math.toRadians(xx), hips.rotateAngleY + (float) Math.toRadians(yy), hips.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (-6.825-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (2.25-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            yy = -6.825 + (((tickAnim - 20) / 10) * (-6.825-(-6.825)));
            zz = 2.25 + (((tickAnim - 20) / 10) * (2.25-(2.25)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            yy = -6.825 + (((tickAnim - 30) / 20) * (0-(-6.825)));
            zz = 2.25 + (((tickAnim - 30) / 20) * (0-(2.25)));
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
            xx = 0 + (((tickAnim - 0) / 20) * (-19.25-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = -19.25 + (((tickAnim - 20) / 10) * (-19.25-(-19.25)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = -19.25 + (((tickAnim - 30) / 10) * (-24.87-(-19.25)));
            yy = 0 + (((tickAnim - 30) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 10) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = -24.87 + (((tickAnim - 40) / 10) * (0-(-24.87)));
            yy = 0 + (((tickAnim - 40) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg, leftLeg.rotateAngleX + (float) Math.toRadians(xx), leftLeg.rotateAngleY + (float) Math.toRadians(yy), leftLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (25.25-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 25.25 + (((tickAnim - 20) / 10) * (25.25-(25.25)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = 25.25 + (((tickAnim - 30) / 10) * (0-(25.25)));
            yy = 0 + (((tickAnim - 30) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 10) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 40) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 40) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg2, leftLeg2.rotateAngleX + (float) Math.toRadians(xx), leftLeg2.rotateAngleY + (float) Math.toRadians(yy), leftLeg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (-1.2-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (-0.375-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            yy = -1.2 + (((tickAnim - 20) / 10) * (-1.2-(-1.2)));
            zz = -0.375 + (((tickAnim - 20) / 10) * (-0.375-(-0.375)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 30) / 10) * (0-(0)));
            yy = -1.2 + (((tickAnim - 30) / 10) * (0-(-1.2)));
            zz = -0.375 + (((tickAnim - 30) / 10) * (0-(-0.375)));
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 40) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 40) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftLeg2.rotationPointX = this.leftLeg2.rotationPointX + (float)(xx);
        this.leftLeg2.rotationPointY = this.leftLeg2.rotationPointY - (float)(yy);
        this.leftLeg2.rotationPointZ = this.leftLeg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (-34.5-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = -34.5 + (((tickAnim - 20) / 10) * (-34.5-(-34.5)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = -34.5 + (((tickAnim - 30) / 10) * (-32.75-(-34.5)));
            yy = 0 + (((tickAnim - 30) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 10) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = -32.75 + (((tickAnim - 40) / 10) * (0-(-32.75)));
            yy = 0 + (((tickAnim - 40) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg3, leftLeg3.rotateAngleX + (float) Math.toRadians(xx), leftLeg3.rotateAngleY + (float) Math.toRadians(yy), leftLeg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (1.35-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (-1.325-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            yy = 1.35 + (((tickAnim - 20) / 10) * (1.35-(1.35)));
            zz = -1.325 + (((tickAnim - 20) / 10) * (-1.325-(-1.325)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 30) / 10) * (0-(0)));
            yy = 1.35 + (((tickAnim - 30) / 10) * (-0.525-(1.35)));
            zz = -1.325 + (((tickAnim - 30) / 10) * (-0.575-(-1.325)));
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 40) / 10) * (0-(0)));
            yy = -0.525 + (((tickAnim - 40) / 10) * (0-(-0.525)));
            zz = -0.575 + (((tickAnim - 40) / 10) * (0-(-0.575)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftLeg3.rotationPointX = this.leftLeg3.rotationPointX + (float)(xx);
        this.leftLeg3.rotationPointY = this.leftLeg3.rotationPointY - (float)(yy);
        this.leftLeg3.rotationPointZ = this.leftLeg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (49.75-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 49.75 + (((tickAnim - 20) / 10) * (49.75-(49.75)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = 49.75 + (((tickAnim - 30) / 10) * (49.38-(49.75)));
            yy = 0 + (((tickAnim - 30) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 10) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = 49.38 + (((tickAnim - 40) / 10) * (0-(49.38)));
            yy = 0 + (((tickAnim - 40) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(footL, footL.rotateAngleX + (float) Math.toRadians(xx), footL.rotateAngleY + (float) Math.toRadians(yy), footL.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (-19.25-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = -19.25 + (((tickAnim - 20) / 10) * (-19.25-(-19.25)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = -19.25 + (((tickAnim - 30) / 10) * (-24.87-(-19.25)));
            yy = 0 + (((tickAnim - 30) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 10) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = -24.87 + (((tickAnim - 40) / 10) * (0-(-24.87)));
            yy = 0 + (((tickAnim - 40) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg, rightLeg.rotateAngleX + (float) Math.toRadians(xx), rightLeg.rotateAngleY + (float) Math.toRadians(yy), rightLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (25.25-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 25.25 + (((tickAnim - 20) / 10) * (25.25-(25.25)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = 25.25 + (((tickAnim - 30) / 10) * (0-(25.25)));
            yy = 0 + (((tickAnim - 30) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 10) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 40) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 40) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg2, rightLeg2.rotateAngleX + (float) Math.toRadians(xx), rightLeg2.rotateAngleY + (float) Math.toRadians(yy), rightLeg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (-1.2-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (-0.375-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            yy = -1.2 + (((tickAnim - 20) / 10) * (-1.2-(-1.2)));
            zz = -0.375 + (((tickAnim - 20) / 10) * (-0.375-(-0.375)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 30) / 10) * (0-(0)));
            yy = -1.2 + (((tickAnim - 30) / 10) * (0-(-1.2)));
            zz = -0.375 + (((tickAnim - 30) / 10) * (0-(-0.375)));
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 40) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 40) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightLeg2.rotationPointX = this.rightLeg2.rotationPointX + (float)(xx);
        this.rightLeg2.rotationPointY = this.rightLeg2.rotationPointY - (float)(yy);
        this.rightLeg2.rotationPointZ = this.rightLeg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (-34.5-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = -34.5 + (((tickAnim - 20) / 10) * (-34.5-(-34.5)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = -34.5 + (((tickAnim - 30) / 10) * (-32.75-(-34.5)));
            yy = 0 + (((tickAnim - 30) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 10) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = -32.75 + (((tickAnim - 40) / 10) * (0-(-32.75)));
            yy = 0 + (((tickAnim - 40) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg3, rightLeg3.rotateAngleX + (float) Math.toRadians(xx), rightLeg3.rotateAngleY + (float) Math.toRadians(yy), rightLeg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (1.35-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (-1.325-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            yy = 1.35 + (((tickAnim - 20) / 10) * (1.35-(1.35)));
            zz = -1.325 + (((tickAnim - 20) / 10) * (-1.325-(-1.325)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 30) / 10) * (0-(0)));
            yy = 1.35 + (((tickAnim - 30) / 10) * (-0.525-(1.35)));
            zz = -1.325 + (((tickAnim - 30) / 10) * (-0.575-(-1.325)));
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 40) / 10) * (0-(0)));
            yy = -0.525 + (((tickAnim - 40) / 10) * (0-(-0.525)));
            zz = -0.575 + (((tickAnim - 40) / 10) * (0-(-0.575)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightLeg3.rotationPointX = this.rightLeg3.rotationPointX + (float)(xx);
        this.rightLeg3.rotationPointY = this.rightLeg3.rotationPointY - (float)(yy);
        this.rightLeg3.rotationPointZ = this.rightLeg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (49.75-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 49.75 + (((tickAnim - 20) / 10) * (49.75-(49.75)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = 49.75 + (((tickAnim - 30) / 10) * (49.38-(49.75)));
            yy = 0 + (((tickAnim - 30) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 10) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = 49.38 + (((tickAnim - 40) / 10) * (0-(49.38)));
            yy = 0 + (((tickAnim - 40) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(footL2, footL2.rotateAngleX + (float) Math.toRadians(xx), footL2.rotateAngleY + (float) Math.toRadians(yy), footL2.rotateAngleZ + (float) Math.toRadians(zz));


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
        this.footL2.rotationPointX = this.footL2.rotationPointX + (float)(xx);
        this.footL2.rotationPointY = this.footL2.rotationPointY - (float)(yy);
        this.footL2.rotationPointZ = this.footL2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (-10-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = -10 + (((tickAnim - 20) / 10) * (-10-(-10)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = -10 + (((tickAnim - 30) / 20) * (0-(-10)));
            yy = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Tail1, Tail1.rotateAngleX + (float) Math.toRadians(xx), Tail1.rotateAngleY + (float) Math.toRadians(yy), Tail1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (36.5-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 36.5 + (((tickAnim - 20) / 10) * (36.5-(36.5)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 36.5 + (((tickAnim - 30) / 20) * (0-(36.5)));
            yy = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Tail2, Tail2.rotateAngleX + (float) Math.toRadians(xx), Tail2.rotateAngleY + (float) Math.toRadians(yy), Tail2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (-0.85-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (-0.9-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            yy = -0.85 + (((tickAnim - 20) / 10) * (-0.85-(-0.85)));
            zz = -0.9 + (((tickAnim - 20) / 10) * (-0.9-(-0.9)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            yy = -0.85 + (((tickAnim - 30) / 20) * (0-(-0.85)));
            zz = -0.9 + (((tickAnim - 30) / 20) * (0-(-0.9)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.Tail2.rotationPointX = this.Tail2.rotationPointX + (float)(xx);
        this.Tail2.rotationPointY = this.Tail2.rotationPointY - (float)(yy);
        this.Tail2.rotationPointZ = this.Tail2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (7.5-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 7.5 + (((tickAnim - 20) / 10) * (7.5-(7.5)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 7.5 + (((tickAnim - 30) / 20) * (0-(7.5)));
            yy = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
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




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (29-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 29 + (((tickAnim - 20) / 10) * (29-(29)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = 29 + (((tickAnim - 30) / 10) * (40-(29)));
            yy = 0 + (((tickAnim - 30) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 10) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = 40 + (((tickAnim - 40) / 10) * (0-(40)));
            yy = 0 + (((tickAnim - 40) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm, leftArm.rotateAngleX + (float) Math.toRadians(xx), leftArm.rotateAngleY + (float) Math.toRadians(yy), leftArm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (-62.75-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = -62.75 + (((tickAnim - 20) / 10) * (-62.75-(-62.75)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = -62.75 + (((tickAnim - 30) / 20) * (0-(-62.75)));
            yy = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm2, leftArm2.rotateAngleX + (float) Math.toRadians(xx), leftArm2.rotateAngleY + (float) Math.toRadians(yy), leftArm2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (29-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 29 + (((tickAnim - 20) / 10) * (29-(29)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = 29 + (((tickAnim - 30) / 10) * (40-(29)));
            yy = 0 + (((tickAnim - 30) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 10) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = 40 + (((tickAnim - 40) / 10) * (0-(40)));
            yy = 0 + (((tickAnim - 40) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm, rightArm.rotateAngleX + (float) Math.toRadians(xx), rightArm.rotateAngleY + (float) Math.toRadians(yy), rightArm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (-62.75-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = -62.75 + (((tickAnim - 20) / 10) * (-62.75-(-62.75)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = -62.75 + (((tickAnim - 30) / 20) * (0-(-62.75)));
            yy = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm2, rightArm2.rotateAngleX + (float) Math.toRadians(xx), rightArm2.rotateAngleY + (float) Math.toRadians(yy), rightArm2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (24.5-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 24.5 + (((tickAnim - 20) / 10) * (24.5-(24.5)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = 24.5 + (((tickAnim - 30) / 10) * (24.5-(24.5)));
            yy = 0 + (((tickAnim - 30) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 10) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = 24.5 + (((tickAnim - 40) / 10) * (0-(24.5)));
            yy = 0 + (((tickAnim - 40) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(xx), neck.rotateAngleY + (float) Math.toRadians(yy), neck.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 30) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 30) / 10) * (-19.75-(0)));
            yy = 0 + (((tickAnim - 30) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 10) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = -19.75 + (((tickAnim - 40) / 10) * (0-(-19.75)));
            yy = 0 + (((tickAnim - 40) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(xx), neck2.rotateAngleY + (float) Math.toRadians(yy), neck2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 30) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 30) / 10) * (-19-(0)));
            yy = 0 + (((tickAnim - 30) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 10) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = -19 + (((tickAnim - 40) / 10) * (0-(-19)));
            yy = 0 + (((tickAnim - 40) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(xx), neck3.rotateAngleY + (float) Math.toRadians(yy), neck3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 30) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 30) / 10) * (-8-(0)));
            yy = 0 + (((tickAnim - 30) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 10) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 45) {
            xx = -8 + (((tickAnim - 40) / 5) * (-18.75-(-8)));
            yy = 0 + (((tickAnim - 40) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 5) * (0-(0)));
        }
        else if (tickAnim >= 45 && tickAnim < 50) {
            xx = -18.75 + (((tickAnim - 45) / 5) * (0-(-18.75)));
            yy = 0 + (((tickAnim - 45) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 45) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));

    }
    public void animDisplay(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraFukuivenator entity = (EntityPrehistoricFloraFukuivenator) entitylivingbaseIn;
        int animCycle = 185;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (14.5-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 14.5 + (((tickAnim - 10) / 3) * (16.1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-55-(14.5)));
            yy = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 3) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
            xx = 16.1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-55 + (((tickAnim - 13) / 5) * (9.25-(16.1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-55)));
            yy = 0 + (((tickAnim - 13) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 5) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = 9.25 + (((tickAnim - 18) / 2) * (36.7-(9.25)));
            yy = 0 + (((tickAnim - 18) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 2) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 22) {
            xx = 36.7 + (((tickAnim - 20) / 2) * (36.7-(36.7)));
            yy = 0 + (((tickAnim - 20) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 2) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 23) {
            xx = 36.7 + (((tickAnim - 22) / 1) * (14.5-(36.7)));
            yy = 0 + (((tickAnim - 22) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 22) / 1) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 30) {
            xx = 14.5 + (((tickAnim - 23) / 7) * (9.75-(14.5)));
            yy = 0 + (((tickAnim - 23) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 7) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 31) {
            xx = 9.75 + (((tickAnim - 30) / 1) * (9.75-(9.75)));
            yy = 0 + (((tickAnim - 30) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 1) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220/0.5))*0.2-(0)));
        }
        else if (tickAnim >= 31 && tickAnim < 59) {
            xx = 9.75 + (((tickAnim - 31) / 28) * (6.47718-(9.75)));
            yy = 0 + (((tickAnim - 31) / 28) * (33.1-(0)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220/0.5))*0.2 + (((tickAnim - 31) / 28) * (-1.8+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220/0.5))*0.2-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220/0.5))*0.2)));
        }
        else if (tickAnim >= 59 && tickAnim < 60) {
            xx = 6.47718 + (((tickAnim - 59) / 1) * (6.87027-(6.47718)));
            yy = 33.1 + (((tickAnim - 59) / 1) * (34.61655-(33.1)));
            zz = -1.8+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220/0.5))*0.2 + (((tickAnim - 59) / 1) * (-2.11933-(-1.8+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220/0.5))*0.2)));
        }
        else if (tickAnim >= 60 && tickAnim < 100) {
            xx = 6.87027 + (((tickAnim - 60) / 40) * (6.47718-(6.87027)));
            yy = 34.61655 + (((tickAnim - 60) / 40) * (0.6-(34.61655)));
            zz = -2.11933 + (((tickAnim - 60) / 40) * (-1.8+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220/0.5))*0.2-(-2.11933)));
        }
        else if (tickAnim >= 100 && tickAnim < 101) {
            xx = 6.47718 + (((tickAnim - 100) / 1) * (6-(6.47718)));
            yy = 0.6 + (((tickAnim - 100) / 1) * (0-(0.6)));
            zz = -1.8+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220/0.5))*0.2 + (((tickAnim - 100) / 1) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220/0.5))*0.2-(-1.8+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220/0.5))*0.2)));
        }
        else if (tickAnim >= 101 && tickAnim < 139) {
            xx = 6 + (((tickAnim - 101) / 38) * (6.87027-(6)));
            yy = 0 + (((tickAnim - 101) / 38) * (-34.61655-(0)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220/0.5))*0.2 + (((tickAnim - 101) / 38) * (2.1193316829+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220/0.5))*0.2-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220/0.5))*0.2)));
        }
        else if (tickAnim >= 139 && tickAnim < 178) {
            xx = 6.87027 + (((tickAnim - 139) / 39) * (6.87027-(6.87027)));
            yy = -34.61655 + (((tickAnim - 139) / 39) * (0-(-34.61655)));
            zz = 2.1193316829+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220/0.5))*0.2 + (((tickAnim - 139) / 39) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220/0.5))*0.2-(2.1193316829+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220/0.5))*0.2)));
        }
        else if (tickAnim >= 178 && tickAnim < 186) {
            xx = 6.87027 + (((tickAnim - 178) / 8) * (0-(6.87027)));
            yy = 0 + (((tickAnim - 178) / 8) * (0-(0)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220/0.5))*0.2 + (((tickAnim - 178) / 8) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220/0.5))*0.2)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(hips, hips.rotateAngleX + (float) Math.toRadians(xx), hips.rotateAngleY + (float) Math.toRadians(yy), hips.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (-5.275-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 16) {
            xx = 0 + (((tickAnim - 10) / 6) * (0-(0)));
            yy = -5.275 + (((tickAnim - 10) / 6) * (16.955-(-5.275)));
            zz = 0 + (((tickAnim - 10) / 6) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 16) / 7) * (0-(0)));
            yy = 16.955 + (((tickAnim - 16) / 7) * (-5.275-(16.955)));
            zz = 0 + (((tickAnim - 16) / 7) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 23) / 7) * (0-(0)));
            yy = -5.275 + (((tickAnim - 23) / 7) * (0-(-5.275)));
            zz = 0 + (((tickAnim - 23) / 7) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 30) / 30) * (-6.975+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-65))*30-(0)));
            yy = 0 + (((tickAnim - 30) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 30) * (-10.4-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 139) {
            xx = -6.975+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-65))*30 + (((tickAnim - 60) / 79) * (15.675+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-80))*30-(-6.975+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-65))*30)));
            yy = 0 + (((tickAnim - 60) / 79) * (0-(0)));
            zz = -10.4 + (((tickAnim - 60) / 79) * (-10.4-(-10.4)));
        }
        else if (tickAnim >= 139 && tickAnim < 186) {
            xx = 15.675+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-80))*30 + (((tickAnim - 139) / 47) * (0-(15.675+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-80))*30)));
            yy = 0 + (((tickAnim - 139) / 47) * (0-(0)));
            zz = -10.4 + (((tickAnim - 139) / 47) * (0-(-10.4)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.hips.rotationPointX = this.hips.rotationPointX + (float)(xx);
        this.hips.rotationPointY = this.hips.rotationPointY - (float)(yy);
        this.hips.rotationPointZ = this.hips.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (-36.75-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = -36.75 + (((tickAnim - 10) / 3) * (41.25-(-36.75)));
            yy = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 3) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
            xx = 41.25 + (((tickAnim - 13) / 5) * (-25.25-(41.25)));
            yy = 0 + (((tickAnim - 13) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 5) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = -25.25 + (((tickAnim - 18) / 2) * (-42.75-(-25.25)));
            yy = 0 + (((tickAnim - 18) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 2) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 22) {
            xx = -42.75 + (((tickAnim - 20) / 2) * (-10.85-(-42.75)));
            yy = 0 + (((tickAnim - 20) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 2) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 23) {
            xx = -10.85 + (((tickAnim - 22) / 1) * (-36.75-(-10.85)));
            yy = 0 + (((tickAnim - 22) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 22) / 1) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 25) {
            xx = -36.75 + (((tickAnim - 23) / 2) * (27.66-(-36.75)));
            yy = 0 + (((tickAnim - 23) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 2) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 30) {
            xx = 27.66 + (((tickAnim - 25) / 5) * (22.75-(27.66)));
            yy = 0 + (((tickAnim - 25) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 5) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 32) {
            xx = 22.75 + (((tickAnim - 30) / 2) * (-21.72-(22.75)));
            yy = 0 + (((tickAnim - 30) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 2) * (0-(0)));
        }
        else if (tickAnim >= 32 && tickAnim < 33) {
            xx = -21.72 + (((tickAnim - 32) / 1) * (-1.15-(-21.72)));
            yy = 0 + (((tickAnim - 32) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 32) / 1) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 34) {
            xx = -1.15 + (((tickAnim - 33) / 1) * (-12.825+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1550))*15-(-1.15)));
            yy = 0 + (((tickAnim - 33) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 1) * (0-(0)));
        }
        else if (tickAnim >= 34 && tickAnim < 59) {
            xx = -12.825+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1550))*15 + (((tickAnim - 34) / 25) * (-12.825+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1550))*15-(-12.825+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1550))*15)));
            yy = 0 + (((tickAnim - 34) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 34) / 25) * (0-(0)));
        }
        else if (tickAnim >= 59 && tickAnim < 139) {
            xx = -12.825+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1550))*15 + (((tickAnim - 59) / 80) * (-12.825+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1550))*15-(-12.825+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1550))*15)));
            yy = 0 + (((tickAnim - 59) / 80) * (0-(0)));
            zz = 0 + (((tickAnim - 59) / 80) * (0-(0)));
        }
        else if (tickAnim >= 139 && tickAnim < 178) {
            xx = -12.825+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1550))*15 + (((tickAnim - 139) / 39) * (-12.825+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1550))*15-(-12.825+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1550))*15)));
            yy = 0 + (((tickAnim - 139) / 39) * (0-(0)));
            zz = 0 + (((tickAnim - 139) / 39) * (0-(0)));
        }
        else if (tickAnim >= 178 && tickAnim < 186) {
            xx = -12.825+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1550))*15 + (((tickAnim - 178) / 8) * (0-(-12.825+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1550))*15)));
            yy = 0 + (((tickAnim - 178) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 178) / 8) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg, leftLeg.rotateAngleX + (float) Math.toRadians(xx), leftLeg.rotateAngleY + (float) Math.toRadians(yy), leftLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (27.25-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 27.25 + (((tickAnim - 10) / 3) * (-42.25-(27.25)));
            yy = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 3) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
            xx = -42.25 + (((tickAnim - 13) / 5) * (48-(-42.25)));
            yy = 0 + (((tickAnim - 13) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 5) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = 48 + (((tickAnim - 18) / 2) * (-3.62-(48)));
            yy = 0 + (((tickAnim - 18) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 2) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 22) {
            xx = -3.62 + (((tickAnim - 20) / 2) * (-49.77-(-3.62)));
            yy = 0 + (((tickAnim - 20) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 2) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 23) {
            xx = -49.77 + (((tickAnim - 22) / 1) * (27.25-(-49.77)));
            yy = 0 + (((tickAnim - 22) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 22) / 1) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 25) {
            xx = 27.25 + (((tickAnim - 23) / 2) * (12.57-(27.25)));
            yy = 0 + (((tickAnim - 23) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 2) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 30) {
            xx = 12.57 + (((tickAnim - 25) / 5) * (-3.5-(12.57)));
            yy = 0 + (((tickAnim - 25) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 5) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 32) {
            xx = -3.5 + (((tickAnim - 30) / 2) * (15.24-(-3.5)));
            yy = 0 + (((tickAnim - 30) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 2) * (0-(0)));
        }
        else if (tickAnim >= 32 && tickAnim < 33) {
            xx = 15.24 + (((tickAnim - 32) / 1) * (-23.04-(15.24)));
            yy = 0 + (((tickAnim - 32) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 32) / 1) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 34) {
            xx = -23.04 + (((tickAnim - 33) / 1) * (-12.825+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1550))*-15-(-23.04)));
            yy = 0 + (((tickAnim - 33) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 1) * (0-(0)));
        }
        else if (tickAnim >= 34 && tickAnim < 59) {
            xx = -12.825+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1550))*-15 + (((tickAnim - 34) / 25) * (-12.825+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1550))*-15-(-12.825+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1550))*-15)));
            yy = 0 + (((tickAnim - 34) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 34) / 25) * (0-(0)));
        }
        else if (tickAnim >= 59 && tickAnim < 139) {
            xx = -12.825+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1550))*-15 + (((tickAnim - 59) / 80) * (-12.825+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1550))*-15-(-12.825+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1550))*-15)));
            yy = 0 + (((tickAnim - 59) / 80) * (0-(0)));
            zz = 0 + (((tickAnim - 59) / 80) * (0-(0)));
        }
        else if (tickAnim >= 139 && tickAnim < 178) {
            xx = -12.825+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1550))*-15 + (((tickAnim - 139) / 39) * (-12.825+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1550))*-15-(-12.825+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1550))*-15)));
            yy = 0 + (((tickAnim - 139) / 39) * (0-(0)));
            zz = 0 + (((tickAnim - 139) / 39) * (0-(0)));
        }
        else if (tickAnim >= 178 && tickAnim < 186) {
            xx = -12.825+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1550))*-15 + (((tickAnim - 178) / 8) * (0-(-12.825+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1550))*-15)));
            yy = 0 + (((tickAnim - 178) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 178) / 8) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg2, leftLeg2.rotateAngleX + (float) Math.toRadians(xx), leftLeg2.rotateAngleY + (float) Math.toRadians(yy), leftLeg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (-0.75-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (-0.275-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            yy = -0.75 + (((tickAnim - 10) / 3) * (0-(-0.75)));
            zz = -0.275 + (((tickAnim - 10) / 3) * (0-(-0.275)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 13) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 13) / 5) * (-2.175-(0)));
            zz = 0 + (((tickAnim - 13) / 5) * (-0.1-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 18) / 2) * (0-(0)));
            yy = -2.175 + (((tickAnim - 18) / 2) * (0-(-2.175)));
            zz = -0.1 + (((tickAnim - 18) / 2) * (0-(-0.1)));
        }
        else if (tickAnim >= 20 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 20) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 20) / 3) * (-0.75-(0)));
            zz = 0 + (((tickAnim - 20) / 3) * (-0.275-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 23) / 7) * (0-(0)));
            yy = -0.75 + (((tickAnim - 23) / 7) * (0-(-0.75)));
            zz = -0.275 + (((tickAnim - 23) / 7) * (0-(-0.275)));
        }
        else if (tickAnim >= 30 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 30) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 30) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 3) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 186) {
            xx = 0 + (((tickAnim - 33) / 153) * (0-(0)));
            yy = 0 + (((tickAnim - 33) / 153) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 153) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftLeg2.rotationPointX = this.leftLeg2.rotationPointX + (float)(xx);
        this.leftLeg2.rotationPointY = this.leftLeg2.rotationPointY - (float)(yy);
        this.leftLeg2.rotationPointZ = this.leftLeg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (-37-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 11) {
            xx = -37 + (((tickAnim - 10) / 1) * (-18.6-(-37)));
            yy = 0 + (((tickAnim - 10) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 1) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 13) {
            xx = -18.6 + (((tickAnim - 11) / 2) * (26.5-(-18.6)));
            yy = 0 + (((tickAnim - 11) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 2) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 13) {
            xx = 26.5 + (((tickAnim - 13) / 0) * (32.5-(26.5)));
            yy = 0 + (((tickAnim - 13) / 0) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 0) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
            xx = 32.5 + (((tickAnim - 13) / 5) * (-23.75-(32.5)));
            yy = 0 + (((tickAnim - 13) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 5) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = -23.75 + (((tickAnim - 18) / 2) * (-23.75-(-23.75)));
            yy = 0 + (((tickAnim - 18) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 2) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 21) {
            xx = -23.75 + (((tickAnim - 20) / 1) * (28.99-(-23.75)));
            yy = 0 + (((tickAnim - 20) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 1) * (0-(0)));
        }
        else if (tickAnim >= 21 && tickAnim < 22) {
            xx = 28.99 + (((tickAnim - 21) / 1) * (-15.77-(28.99)));
            yy = 0 + (((tickAnim - 21) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 21) / 1) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 23) {
            xx = -15.77 + (((tickAnim - 22) / 1) * (-37-(-15.77)));
            yy = 0 + (((tickAnim - 22) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 22) / 1) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 25) {
            xx = -37 + (((tickAnim - 23) / 2) * (-91.74643-(-37)));
            yy = 0 + (((tickAnim - 23) / 2) * (0.79631-(0)));
            zz = 0 + (((tickAnim - 23) / 2) * (-0.703-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 27) {
            xx = -91.74643 + (((tickAnim - 25) / 2) * (-17.04341-(-91.74643)));
            yy = 0.79631 + (((tickAnim - 25) / 2) * (1.0809-(0.79631)));
            zz = -0.703 + (((tickAnim - 25) / 2) * (-0.95424-(-0.703)));
        }
        else if (tickAnim >= 27 && tickAnim < 30) {
            xx = -17.04341 + (((tickAnim - 27) / 3) * (5.06188-(-17.04341)));
            yy = 1.0809 + (((tickAnim - 27) / 3) * (1.57892-(1.0809)));
            zz = -0.95424 + (((tickAnim - 27) / 3) * (-1.39391-(-0.95424)));
        }
        else if (tickAnim >= 30 && tickAnim < 32) {
            xx = 5.06188 + (((tickAnim - 30) / 2) * (-20.09956-(5.06188)));
            yy = 1.57892 + (((tickAnim - 30) / 2) * (1.53506-(1.57892)));
            zz = -1.39391 + (((tickAnim - 30) / 2) * (-1.35519-(-1.39391)));
        }
        else if (tickAnim >= 32 && tickAnim < 33) {
            xx = -20.09956 + (((tickAnim - 32) / 1) * (-13.42245-(-20.09956)));
            yy = 1.53506 + (((tickAnim - 32) / 1) * (1.44734-(1.53506)));
            zz = -1.35519 + (((tickAnim - 32) / 1) * (-1.27775-(-1.35519)));
        }
        else if (tickAnim >= 33 && tickAnim < 34) {
            xx = -13.42245 + (((tickAnim - 33) / 1) * (-24.325+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1550))*15-(-13.42245)));
            yy = 1.44734 + (((tickAnim - 33) / 1) * (0-(1.44734)));
            zz = -1.27775 + (((tickAnim - 33) / 1) * (0-(-1.27775)));
        }
        else if (tickAnim >= 34 && tickAnim < 59) {
            xx = -24.325+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1550))*15 + (((tickAnim - 34) / 25) * (-12.825+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1550))*15-(-24.325+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1550))*15)));
            yy = 0 + (((tickAnim - 34) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 34) / 25) * (0-(0)));
        }
        else if (tickAnim >= 59 && tickAnim < 139) {
            xx = -12.825+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1550))*15 + (((tickAnim - 59) / 80) * (-12.825+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1550))*15-(-12.825+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1550))*15)));
            yy = 0 + (((tickAnim - 59) / 80) * (0-(0)));
            zz = 0 + (((tickAnim - 59) / 80) * (0-(0)));
        }
        else if (tickAnim >= 139 && tickAnim < 178) {
            xx = -12.825+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1550))*15 + (((tickAnim - 139) / 39) * (-12.825+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1550))*15-(-12.825+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1550))*15)));
            yy = 0 + (((tickAnim - 139) / 39) * (0-(0)));
            zz = 0 + (((tickAnim - 139) / 39) * (0-(0)));
        }
        else if (tickAnim >= 178 && tickAnim < 186) {
            xx = -12.825+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1550))*15 + (((tickAnim - 178) / 8) * (0-(-12.825+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1550))*15)));
            yy = 0 + (((tickAnim - 178) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 178) / 8) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg3, leftLeg3.rotateAngleX + (float) Math.toRadians(xx), leftLeg3.rotateAngleY + (float) Math.toRadians(yy), leftLeg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 10) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 8) * (-0.225-(0)));
            zz = 0 + (((tickAnim - 10) / 8) * (0.05-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 18) / 2) * (0-(0)));
            yy = -0.225 + (((tickAnim - 18) / 2) * (-0.225-(-0.225)));
            zz = 0.05 + (((tickAnim - 18) / 2) * (0.05-(0.05)));
        }
        else if (tickAnim >= 20 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 20) / 3) * (0-(0)));
            yy = -0.225 + (((tickAnim - 20) / 3) * (0-(-0.225)));
            zz = 0.05 + (((tickAnim - 20) / 3) * (0-(0.05)));
        }
        else if (tickAnim >= 23 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 23) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 23) / 2) * (-0.975-(0)));
            zz = 0 + (((tickAnim - 23) / 2) * (-1.15-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 27) {
            xx = 0 + (((tickAnim - 25) / 2) * (0-(0)));
            yy = -0.975 + (((tickAnim - 25) / 2) * (0-(-0.975)));
            zz = -1.15 + (((tickAnim - 25) / 2) * (0-(-1.15)));
        }
        else if (tickAnim >= 27 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 27) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 27) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 27) / 3) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 186) {
            xx = 0 + (((tickAnim - 30) / 156) * (0-(0)));
            yy = 0 + (((tickAnim - 30) / 156) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 156) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftLeg3.rotationPointX = this.leftLeg3.rotationPointX + (float)(xx);
        this.leftLeg3.rotationPointY = this.leftLeg3.rotationPointY - (float)(yy);
        this.leftLeg3.rotationPointZ = this.leftLeg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (31.5-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 11) {
            xx = 31.5 + (((tickAnim - 10) / 1) * (16.54-(31.5)));
            yy = 0 + (((tickAnim - 10) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 1) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 13) {
            xx = 16.54 + (((tickAnim - 11) / 2) * (7.44-(16.54)));
            yy = 0 + (((tickAnim - 11) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 2) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 13) {
            xx = 7.44 + (((tickAnim - 13) / 0) * (35.27-(7.44)));
            yy = 0 + (((tickAnim - 13) / 0) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 0) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = 35.27 + (((tickAnim - 13) / 2) * (82.01-(35.27)));
            yy = 0 + (((tickAnim - 13) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 2) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 18) {
            xx = 82.01 + (((tickAnim - 15) / 3) * (71.75-(82.01)));
            yy = 0 + (((tickAnim - 15) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 3) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = 71.75 + (((tickAnim - 18) / 2) * (71.75-(71.75)));
            yy = 0 + (((tickAnim - 18) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 2) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 21) {
            xx = 71.75 + (((tickAnim - 20) / 1) * (-12.21-(71.75)));
            yy = 0 + (((tickAnim - 20) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 1) * (0-(0)));
        }
        else if (tickAnim >= 21 && tickAnim < 22) {
            xx = -12.21 + (((tickAnim - 21) / 1) * (39.33-(-12.21)));
            yy = 0 + (((tickAnim - 21) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 21) / 1) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 23) {
            xx = 39.33 + (((tickAnim - 22) / 1) * (31.5-(39.33)));
            yy = 0 + (((tickAnim - 22) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 22) / 1) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 25) {
            xx = 31.5 + (((tickAnim - 23) / 2) * (62.31-(31.5)));
            yy = 0 + (((tickAnim - 23) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 2) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 27) {
            xx = 62.31 + (((tickAnim - 25) / 2) * (-26.75-(62.31)));
            yy = 0 + (((tickAnim - 25) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 2) * (0-(0)));
        }
        else if (tickAnim >= 27 && tickAnim < 30) {
            xx = -26.75 + (((tickAnim - 27) / 3) * (-34.5-(-26.75)));
            yy = 0 + (((tickAnim - 27) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 27) / 3) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 32) {
            xx = -34.5 + (((tickAnim - 30) / 2) * (45.58-(-34.5)));
            yy = 0 + (((tickAnim - 30) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 2) * (0-(0)));
        }
        else if (tickAnim >= 32 && tickAnim < 33) {
            xx = 45.58 + (((tickAnim - 32) / 1) * (27.23-(45.58)));
            yy = 0 + (((tickAnim - 32) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 32) / 1) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 34) {
            xx = 27.23 + (((tickAnim - 33) / 1) * (40.45+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1550))*-15-(27.23)));
            yy = 0 + (((tickAnim - 33) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 1) * (0-(0)));
        }
        else if (tickAnim >= 34 && tickAnim < 59) {
            xx = 40.45+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1550))*-15 + (((tickAnim - 34) / 25) * (34.95+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1550))*-15-(40.45+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1550))*-15)));
            yy = 0 + (((tickAnim - 34) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 34) / 25) * (0-(0)));
        }
        else if (tickAnim >= 59 && tickAnim < 139) {
            xx = 34.95+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1550))*-15 + (((tickAnim - 59) / 80) * (30.95+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1550))*-15-(34.95+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1550))*-15)));
            yy = 0 + (((tickAnim - 59) / 80) * (0-(0)));
            zz = 0 + (((tickAnim - 59) / 80) * (0-(0)));
        }
        else if (tickAnim >= 139 && tickAnim < 178) {
            xx = 30.95+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1550))*-15 + (((tickAnim - 139) / 39) * (30.95+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1550))*-15-(30.95+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1550))*-15)));
            yy = 0 + (((tickAnim - 139) / 39) * (0-(0)));
            zz = 0 + (((tickAnim - 139) / 39) * (0-(0)));
        }
        else if (tickAnim >= 178 && tickAnim < 186) {
            xx = 30.95+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1550))*-15 + (((tickAnim - 178) / 8) * (0-(30.95+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1550))*-15)));
            yy = 0 + (((tickAnim - 178) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 178) / 8) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(footL, footL.rotateAngleX + (float) Math.toRadians(xx), footL.rotateAngleY + (float) Math.toRadians(yy), footL.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0.875-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0.25-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 10) / 1) * (0-(0)));
            yy = 0.875 + (((tickAnim - 10) / 1) * (0.35-(0.875)));
            zz = 0.25 + (((tickAnim - 10) / 1) * (0-(0.25)));
        }
        else if (tickAnim >= 11 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 11) / 2) * (0-(0)));
            yy = 0.35 + (((tickAnim - 11) / 2) * (0-(0.35)));
            zz = 0 + (((tickAnim - 11) / 2) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 13) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 13) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 5) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 21) {
            xx = 0 + (((tickAnim - 18) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 18) / 3) * (0.3-(0)));
            zz = 0 + (((tickAnim - 18) / 3) * (0-(0)));
        }
        else if (tickAnim >= 21 && tickAnim < 22) {
            xx = 0 + (((tickAnim - 21) / 1) * (0-(0)));
            yy = 0.3 + (((tickAnim - 21) / 1) * (1.565-(0.3)));
            zz = 0 + (((tickAnim - 21) / 1) * (0.08-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 22) / 1) * (0-(0)));
            yy = 1.565 + (((tickAnim - 22) / 1) * (1.92-(1.565)));
            zz = 0.08 + (((tickAnim - 22) / 1) * (0.16-(0.08)));
        }
        else if (tickAnim >= 23 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 23) / 0) * (0-(0)));
            yy = 1.92 + (((tickAnim - 23) / 0) * (0.875-(1.92)));
            zz = 0.16 + (((tickAnim - 23) / 0) * (0.25-(0.16)));
        }
        else if (tickAnim >= 23 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 23) / 2) * (0-(0)));
            yy = 0.875 + (((tickAnim - 23) / 2) * (0.66-(0.875)));
            zz = 0.25 + (((tickAnim - 23) / 2) * (0.39-(0.25)));
        }
        else if (tickAnim >= 25 && tickAnim < 27) {
            xx = 0 + (((tickAnim - 25) / 2) * (0-(0)));
            yy = 0.66 + (((tickAnim - 25) / 2) * (0.775-(0.66)));
            zz = 0.39 + (((tickAnim - 25) / 2) * (0.3-(0.39)));
        }
        else if (tickAnim >= 27 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 27) / 3) * (0-(0)));
            yy = 0.775 + (((tickAnim - 27) / 3) * (-0.1-(0.775)));
            zz = 0.3 + (((tickAnim - 27) / 3) * (-0.125-(0.3)));
        }
        else if (tickAnim >= 30 && tickAnim < 32) {
            xx = 0 + (((tickAnim - 30) / 2) * (0-(0)));
            yy = -0.1 + (((tickAnim - 30) / 2) * (0.85-(-0.1)));
            zz = -0.125 + (((tickAnim - 30) / 2) * (0.075-(-0.125)));
        }
        else if (tickAnim >= 32 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 32) / 1) * (0-(0)));
            yy = 0.85 + (((tickAnim - 32) / 1) * (-0.1-(0.85)));
            zz = 0.075 + (((tickAnim - 32) / 1) * (0.09-(0.075)));
        }
        else if (tickAnim >= 33 && tickAnim < 34) {
            xx = 0 + (((tickAnim - 33) / 1) * (0-(0)));
            yy = -0.1 + (((tickAnim - 33) / 1) * (0.825-(-0.1)));
            zz = 0.09 + (((tickAnim - 33) / 1) * (0.09-(0.09)));
        }
        else if (tickAnim >= 34 && tickAnim < 59) {
            xx = 0 + (((tickAnim - 34) / 25) * (0-(0)));
            yy = 0.825 + (((tickAnim - 34) / 25) * (0.825-(0.825)));
            zz = 0.09 + (((tickAnim - 34) / 25) * (0.09-(0.09)));
        }
        else if (tickAnim >= 59 && tickAnim < 139) {
            xx = 0 + (((tickAnim - 59) / 80) * (0-(0)));
            yy = 0.825 + (((tickAnim - 59) / 80) * (0.825-(0.825)));
            zz = 0.09 + (((tickAnim - 59) / 80) * (0.09-(0.09)));
        }
        else if (tickAnim >= 139 && tickAnim < 178) {
            xx = 0 + (((tickAnim - 139) / 39) * (0-(0)));
            yy = 0.825 + (((tickAnim - 139) / 39) * (0.825-(0.825)));
            zz = 0.09 + (((tickAnim - 139) / 39) * (0.09-(0.09)));
        }
        else if (tickAnim >= 178 && tickAnim < 186) {
            xx = 0 + (((tickAnim - 178) / 8) * (0-(0)));
            yy = 0.825 + (((tickAnim - 178) / 8) * (0-(0.825)));
            zz = 0.09 + (((tickAnim - 178) / 8) * (0-(0.09)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.footL.rotationPointX = this.footL.rotationPointX + (float)(xx);
        this.footL.rotationPointY = this.footL.rotationPointY - (float)(yy);
        this.footL.rotationPointZ = this.footL.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (-36.75-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = -36.75 + (((tickAnim - 10) / 3) * (41.25-(-36.75)));
            yy = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 3) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
            xx = 41.25 + (((tickAnim - 13) / 5) * (-25.25-(41.25)));
            yy = 0 + (((tickAnim - 13) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 5) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = -25.25 + (((tickAnim - 18) / 2) * (-42.75-(-25.25)));
            yy = 0 + (((tickAnim - 18) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 2) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 22) {
            xx = -42.75 + (((tickAnim - 20) / 2) * (-10.85-(-42.75)));
            yy = 0 + (((tickAnim - 20) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 2) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 23) {
            xx = -10.85 + (((tickAnim - 22) / 1) * (-36.75-(-10.85)));
            yy = 0 + (((tickAnim - 22) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 22) / 1) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 30) {
            xx = -36.75 + (((tickAnim - 23) / 7) * (-9-(-36.75)));
            yy = 0 + (((tickAnim - 23) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 7) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 33) {
            xx = -9 + (((tickAnim - 30) / 3) * (0-(-9)));
            yy = 0 + (((tickAnim - 30) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 3) * (18.25-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 38) {
            xx = 0 + (((tickAnim - 33) / 5) * (-12.825+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1550))*-15-(0)));
            yy = 0 + (((tickAnim - 33) / 5) * (0-(0)));
            zz = 18.25 + (((tickAnim - 33) / 5) * (0-(18.25)));
        }
        else if (tickAnim >= 38 && tickAnim < 59) {
            xx = -12.825+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1550))*-15 + (((tickAnim - 38) / 21) * (-12.825+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1550))*-15-(-12.825+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1550))*-15)));
            yy = 0 + (((tickAnim - 38) / 21) * (0-(0)));
            zz = 0 + (((tickAnim - 38) / 21) * (0-(0)));
        }
        else if (tickAnim >= 59 && tickAnim < 139) {
            xx = -12.825+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1550))*-15 + (((tickAnim - 59) / 80) * (-12.825+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1550))*-15-(-12.825+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1550))*-15)));
            yy = 0 + (((tickAnim - 59) / 80) * (0-(0)));
            zz = 0 + (((tickAnim - 59) / 80) * (0-(0)));
        }
        else if (tickAnim >= 139 && tickAnim < 178) {
            xx = -12.825+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1550))*-15 + (((tickAnim - 139) / 39) * (-12.825+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1550))*-15-(-12.825+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1550))*-15)));
            yy = 0 + (((tickAnim - 139) / 39) * (0-(0)));
            zz = 0 + (((tickAnim - 139) / 39) * (0-(0)));
        }
        else if (tickAnim >= 178 && tickAnim < 186) {
            xx = -12.825+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1550))*-15 + (((tickAnim - 178) / 8) * (0-(-12.825+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1550))*-15)));
            yy = 0 + (((tickAnim - 178) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 178) / 8) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg, rightLeg.rotateAngleX + (float) Math.toRadians(xx), rightLeg.rotateAngleY + (float) Math.toRadians(yy), rightLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (27.25-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 27.25 + (((tickAnim - 10) / 3) * (-42.25-(27.25)));
            yy = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 3) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
            xx = -42.25 + (((tickAnim - 13) / 5) * (48-(-42.25)));
            yy = 0 + (((tickAnim - 13) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 5) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = 48 + (((tickAnim - 18) / 2) * (-3.62-(48)));
            yy = 0 + (((tickAnim - 18) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 2) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 22) {
            xx = -3.62 + (((tickAnim - 20) / 2) * (-49.77-(-3.62)));
            yy = 0 + (((tickAnim - 20) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 2) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 23) {
            xx = -49.77 + (((tickAnim - 22) / 1) * (27.25-(-49.77)));
            yy = 0 + (((tickAnim - 22) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 22) / 1) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 30) {
            xx = 27.25 + (((tickAnim - 23) / 7) * (-7.5-(27.25)));
            yy = 0 + (((tickAnim - 23) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 7) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 33) {
            xx = -7.5 + (((tickAnim - 30) / 3) * (-21.25-(-7.5)));
            yy = 0 + (((tickAnim - 30) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 3) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 38) {
            xx = -21.25 + (((tickAnim - 33) / 5) * (-12.825+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1550))*15-(-21.25)));
            yy = 0 + (((tickAnim - 33) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 5) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 59) {
            xx = -12.825+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1550))*15 + (((tickAnim - 38) / 21) * (-12.825+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1550))*15-(-12.825+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1550))*15)));
            yy = 0 + (((tickAnim - 38) / 21) * (0-(0)));
            zz = 0 + (((tickAnim - 38) / 21) * (0-(0)));
        }
        else if (tickAnim >= 59 && tickAnim < 139) {
            xx = -12.825+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1550))*15 + (((tickAnim - 59) / 80) * (-12.825+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1550))*15-(-12.825+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1550))*15)));
            yy = 0 + (((tickAnim - 59) / 80) * (0-(0)));
            zz = 0 + (((tickAnim - 59) / 80) * (0-(0)));
        }
        else if (tickAnim >= 139 && tickAnim < 178) {
            xx = -12.825+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1550))*15 + (((tickAnim - 139) / 39) * (-12.825+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1550))*15-(-12.825+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1550))*15)));
            yy = 0 + (((tickAnim - 139) / 39) * (0-(0)));
            zz = 0 + (((tickAnim - 139) / 39) * (0-(0)));
        }
        else if (tickAnim >= 178 && tickAnim < 186) {
            xx = -12.825+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1550))*15 + (((tickAnim - 178) / 8) * (0-(-12.825+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1550))*15)));
            yy = 0 + (((tickAnim - 178) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 178) / 8) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg2, rightLeg2.rotateAngleX + (float) Math.toRadians(xx), rightLeg2.rotateAngleY + (float) Math.toRadians(yy), rightLeg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (-0.75-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (-0.275-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            yy = -0.75 + (((tickAnim - 10) / 3) * (0-(-0.75)));
            zz = -0.275 + (((tickAnim - 10) / 3) * (0-(-0.275)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 13) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 13) / 5) * (-2.175-(0)));
            zz = 0 + (((tickAnim - 13) / 5) * (-0.1-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 18) / 2) * (0-(0)));
            yy = -2.175 + (((tickAnim - 18) / 2) * (0-(-2.175)));
            zz = -0.1 + (((tickAnim - 18) / 2) * (0-(-0.1)));
        }
        else if (tickAnim >= 20 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 20) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 20) / 3) * (-0.75-(0)));
            zz = 0 + (((tickAnim - 20) / 3) * (-0.275-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 23) / 7) * (0-(0)));
            yy = -0.75 + (((tickAnim - 23) / 7) * (0-(-0.75)));
            zz = -0.275 + (((tickAnim - 23) / 7) * (0-(-0.275)));
        }
        else if (tickAnim >= 30 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 30) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 30) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 3) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 186) {
            xx = 0 + (((tickAnim - 33) / 153) * (0-(0)));
            yy = 0 + (((tickAnim - 33) / 153) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 153) * (0-(0)));
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
            xx = 0 + (((tickAnim - 0) / 10) * (-37-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 11) {
            xx = -37 + (((tickAnim - 10) / 1) * (-18.6-(-37)));
            yy = 0 + (((tickAnim - 10) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 1) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 13) {
            xx = -18.6 + (((tickAnim - 11) / 2) * (26.5-(-18.6)));
            yy = 0 + (((tickAnim - 11) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 2) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 13) {
            xx = 26.5 + (((tickAnim - 13) / 0) * (32.5-(26.5)));
            yy = 0 + (((tickAnim - 13) / 0) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 0) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
            xx = 32.5 + (((tickAnim - 13) / 5) * (-23.75-(32.5)));
            yy = 0 + (((tickAnim - 13) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 5) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = -23.75 + (((tickAnim - 18) / 2) * (-23.75-(-23.75)));
            yy = 0 + (((tickAnim - 18) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 2) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 21) {
            xx = -23.75 + (((tickAnim - 20) / 1) * (28.99-(-23.75)));
            yy = 0 + (((tickAnim - 20) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 1) * (0-(0)));
        }
        else if (tickAnim >= 21 && tickAnim < 22) {
            xx = 28.99 + (((tickAnim - 21) / 1) * (-15.77-(28.99)));
            yy = 0 + (((tickAnim - 21) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 21) / 1) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 23) {
            xx = -15.77 + (((tickAnim - 22) / 1) * (-37-(-15.77)));
            yy = 0 + (((tickAnim - 22) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 22) / 1) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 30) {
            xx = -37 + (((tickAnim - 23) / 7) * (5.25-(-37)));
            yy = 0 + (((tickAnim - 23) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 7) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 33) {
            xx = 5.25 + (((tickAnim - 30) / 3) * (20.5-(5.25)));
            yy = 0 + (((tickAnim - 30) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 3) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 38) {
            xx = 20.5 + (((tickAnim - 33) / 5) * (-24.325+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1550))*-15-(20.5)));
            yy = 0 + (((tickAnim - 33) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 5) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 59) {
            xx = -24.325+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1550))*-15 + (((tickAnim - 38) / 21) * (-24.325+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1550))*-15-(-24.325+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1550))*-15)));
            yy = 0 + (((tickAnim - 38) / 21) * (0-(0)));
            zz = 0 + (((tickAnim - 38) / 21) * (0-(0)));
        }
        else if (tickAnim >= 59 && tickAnim < 139) {
            xx = -24.325+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1550))*-15 + (((tickAnim - 59) / 80) * (-24.325+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1550))*-15-(-24.325+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1550))*-15)));
            yy = 0 + (((tickAnim - 59) / 80) * (0-(0)));
            zz = 0 + (((tickAnim - 59) / 80) * (0-(0)));
        }
        else if (tickAnim >= 139 && tickAnim < 178) {
            xx = -24.325+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1550))*-15 + (((tickAnim - 139) / 39) * (-24.325+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1550))*-15-(-24.325+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1550))*-15)));
            yy = 0 + (((tickAnim - 139) / 39) * (0-(0)));
            zz = 0 + (((tickAnim - 139) / 39) * (0-(0)));
        }
        else if (tickAnim >= 178 && tickAnim < 186) {
            xx = -24.325+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1550))*-15 + (((tickAnim - 178) / 8) * (0-(-24.325+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1550))*-15)));
            yy = 0 + (((tickAnim - 178) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 178) / 8) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg3, rightLeg3.rotateAngleX + (float) Math.toRadians(xx), rightLeg3.rotateAngleY + (float) Math.toRadians(yy), rightLeg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 10) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 8) * (-0.225-(0)));
            zz = 0 + (((tickAnim - 10) / 8) * (0.05-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 18) / 2) * (0-(0)));
            yy = -0.225 + (((tickAnim - 18) / 2) * (-0.225-(-0.225)));
            zz = 0.05 + (((tickAnim - 18) / 2) * (0.05-(0.05)));
        }
        else if (tickAnim >= 20 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 20) / 3) * (0-(0)));
            yy = -0.225 + (((tickAnim - 20) / 3) * (0-(-0.225)));
            zz = 0.05 + (((tickAnim - 20) / 3) * (0-(0.05)));
        }
        else if (tickAnim >= 23 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 23) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 23) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 7) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 186) {
            xx = 0 + (((tickAnim - 30) / 156) * (0-(0)));
            yy = 0 + (((tickAnim - 30) / 156) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 156) * (0-(0)));
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
            xx = 0 + (((tickAnim - 0) / 10) * (31.5-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 11) {
            xx = 31.5 + (((tickAnim - 10) / 1) * (16.54-(31.5)));
            yy = 0 + (((tickAnim - 10) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 1) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 13) {
            xx = 16.54 + (((tickAnim - 11) / 2) * (7.44-(16.54)));
            yy = 0 + (((tickAnim - 11) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 2) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 13) {
            xx = 7.44 + (((tickAnim - 13) / 0) * (35.27-(7.44)));
            yy = 0 + (((tickAnim - 13) / 0) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 0) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = 35.27 + (((tickAnim - 13) / 2) * (82.01-(35.27)));
            yy = 0 + (((tickAnim - 13) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 2) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 18) {
            xx = 82.01 + (((tickAnim - 15) / 3) * (71.75-(82.01)));
            yy = 0 + (((tickAnim - 15) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 3) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = 71.75 + (((tickAnim - 18) / 2) * (71.75-(71.75)));
            yy = 0 + (((tickAnim - 18) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 2) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 21) {
            xx = 71.75 + (((tickAnim - 20) / 1) * (-12.21-(71.75)));
            yy = 0 + (((tickAnim - 20) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 1) * (0-(0)));
        }
        else if (tickAnim >= 21 && tickAnim < 22) {
            xx = -12.21 + (((tickAnim - 21) / 1) * (39.33-(-12.21)));
            yy = 0 + (((tickAnim - 21) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 21) / 1) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 23) {
            xx = 39.33 + (((tickAnim - 22) / 1) * (31.5-(39.33)));
            yy = 0 + (((tickAnim - 22) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 22) / 1) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 30) {
            xx = 31.5 + (((tickAnim - 23) / 7) * (-0.5-(31.5)));
            yy = 0 + (((tickAnim - 23) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 7) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 33) {
            xx = -0.5 + (((tickAnim - 30) / 3) * (-10.84363-(-0.5)));
            yy = 0 + (((tickAnim - 30) / 3) * (1.94374-(0)));
            zz = 0 + (((tickAnim - 30) / 3) * (-18.90397-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 38) {
            xx = -10.84363 + (((tickAnim - 33) / 5) * (40.95+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1550))*15-(-10.84363)));
            yy = 1.94374 + (((tickAnim - 33) / 5) * (0-(1.94374)));
            zz = -18.90397 + (((tickAnim - 33) / 5) * (0-(-18.90397)));
        }
        else if (tickAnim >= 38 && tickAnim < 59) {
            xx = 40.95+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1550))*15 + (((tickAnim - 38) / 21) * (40.95+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1550))*15-(40.95+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1550))*15)));
            yy = 0 + (((tickAnim - 38) / 21) * (0-(0)));
            zz = 0 + (((tickAnim - 38) / 21) * (0-(0)));
        }
        else if (tickAnim >= 59 && tickAnim < 139) {
            xx = 40.95+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1550))*15 + (((tickAnim - 59) / 80) * (40.95+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1550))*15-(40.95+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1550))*15)));
            yy = 0 + (((tickAnim - 59) / 80) * (0-(0)));
            zz = 0 + (((tickAnim - 59) / 80) * (0-(0)));
        }
        else if (tickAnim >= 139 && tickAnim < 178) {
            xx = 40.95+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1550))*15 + (((tickAnim - 139) / 39) * (40.95+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1550))*15-(40.95+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1550))*15)));
            yy = 0 + (((tickAnim - 139) / 39) * (0-(0)));
            zz = 0 + (((tickAnim - 139) / 39) * (0-(0)));
        }
        else if (tickAnim >= 178 && tickAnim < 186) {
            xx = 40.95+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1550))*15 + (((tickAnim - 178) / 8) * (0-(40.95+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1550))*15)));
            yy = 0 + (((tickAnim - 178) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 178) / 8) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(footL2, footL2.rotateAngleX + (float) Math.toRadians(xx), footL2.rotateAngleY + (float) Math.toRadians(yy), footL2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0.875-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0.25-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 10) / 1) * (0-(0)));
            yy = 0.875 + (((tickAnim - 10) / 1) * (0.35-(0.875)));
            zz = 0.25 + (((tickAnim - 10) / 1) * (0-(0.25)));
        }
        else if (tickAnim >= 11 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 11) / 2) * (0-(0)));
            yy = 0.35 + (((tickAnim - 11) / 2) * (0-(0.35)));
            zz = 0 + (((tickAnim - 11) / 2) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 13) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 13) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 5) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 21) {
            xx = 0 + (((tickAnim - 18) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 18) / 3) * (0.3-(0)));
            zz = 0 + (((tickAnim - 18) / 3) * (0-(0)));
        }
        else if (tickAnim >= 21 && tickAnim < 22) {
            xx = 0 + (((tickAnim - 21) / 1) * (0-(0)));
            yy = 0.3 + (((tickAnim - 21) / 1) * (1.565-(0.3)));
            zz = 0 + (((tickAnim - 21) / 1) * (0.08-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 22) / 1) * (0-(0)));
            yy = 1.565 + (((tickAnim - 22) / 1) * (1.92-(1.565)));
            zz = 0.08 + (((tickAnim - 22) / 1) * (0.16-(0.08)));
        }
        else if (tickAnim >= 23 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 23) / 0) * (0-(0)));
            yy = 1.92 + (((tickAnim - 23) / 0) * (0.875-(1.92)));
            zz = 0.16 + (((tickAnim - 23) / 0) * (0.25-(0.16)));
        }
        else if (tickAnim >= 23 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 23) / 7) * (0-(0)));
            yy = 0.875 + (((tickAnim - 23) / 7) * (0.225-(0.875)));
            zz = 0.25 + (((tickAnim - 23) / 7) * (0-(0.25)));
        }
        else if (tickAnim >= 30 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 30) / 3) * (0-(0)));
            yy = 0.225 + (((tickAnim - 30) / 3) * (1.35-(0.225)));
            zz = 0 + (((tickAnim - 30) / 3) * (0.09-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 38) {
            xx = 0 + (((tickAnim - 33) / 5) * (0-(0)));
            yy = 1.35 + (((tickAnim - 33) / 5) * (0-(1.35)));
            zz = 0.09 + (((tickAnim - 33) / 5) * (0-(0.09)));
        }
        else if (tickAnim >= 38 && tickAnim < 59) {
            xx = 0 + (((tickAnim - 38) / 21) * (0-(0)));
            yy = 0 + (((tickAnim - 38) / 21) * (0-(0)));
            zz = 0 + (((tickAnim - 38) / 21) * (0-(0)));
        }
        else if (tickAnim >= 59 && tickAnim < 139) {
            xx = 0 + (((tickAnim - 59) / 80) * (0-(0)));
            yy = 0 + (((tickAnim - 59) / 80) * (0-(0)));
            zz = 0 + (((tickAnim - 59) / 80) * (0-(0)));
        }
        else if (tickAnim >= 139 && tickAnim < 178) {
            xx = 0 + (((tickAnim - 139) / 39) * (0-(0)));
            yy = 0 + (((tickAnim - 139) / 39) * (0-(0)));
            zz = 0 + (((tickAnim - 139) / 39) * (0-(0)));
        }
        else if (tickAnim >= 178 && tickAnim < 186) {
            xx = 0 + (((tickAnim - 178) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 178) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 178) / 8) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.footL2.rotationPointX = this.footL2.rotationPointX + (float)(xx);
        this.footL2.rotationPointY = this.footL2.rotationPointY - (float)(yy);
        this.footL2.rotationPointZ = this.footL2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (13.75-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 13.75 + (((tickAnim - 10) / 3) * (3.67-(13.75)));
            yy = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 3) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 14) {
            xx = 3.67 + (((tickAnim - 13) / 1) * (-25.92-(3.67)));
            yy = 0 + (((tickAnim - 13) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 1) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 18) {
            xx = -25.92 + (((tickAnim - 14) / 4) * (-3.25-(-25.92)));
            yy = 0 + (((tickAnim - 14) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 4) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = -3.25 + (((tickAnim - 18) / 2) * (15.43-(-3.25)));
            yy = 0 + (((tickAnim - 18) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 2) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 23) {
            xx = 15.43 + (((tickAnim - 20) / 3) * (13.75-(15.43)));
            yy = 0 + (((tickAnim - 20) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 3) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 25) {
            xx = 13.75 + (((tickAnim - 23) / 2) * (-7.93-(13.75)));
            yy = 0 + (((tickAnim - 23) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 2) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 30) {
            xx = -7.93 + (((tickAnim - 25) / 5) * (25.75-(-7.93)));
            yy = 0 + (((tickAnim - 25) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 5) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 31) {
            xx = 25.75 + (((tickAnim - 30) / 1) * (25.75-(25.75)));
            yy = 0 + (((tickAnim - 30) / 1) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220/0.5))*3-(0)));
            zz = 0 + (((tickAnim - 30) / 1) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220/0.5))*3-(0)));
        }
        else if (tickAnim >= 31 && tickAnim < 59) {
            xx = 25.75 + (((tickAnim - 31) / 28) * (25.75-(25.75)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220/0.5))*3 + (((tickAnim - 31) / 28) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220/0.5))*3-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220/0.5))*3)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220/0.5))*3 + (((tickAnim - 31) / 28) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220/0.5))*3-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220/0.5))*3)));
        }
        else if (tickAnim >= 59 && tickAnim < 139) {
            xx = 25.75 + (((tickAnim - 59) / 80) * (25.75-(25.75)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220/0.5))*3 + (((tickAnim - 59) / 80) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220/0.5))*3-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220/0.5))*3)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220/0.5))*3 + (((tickAnim - 59) / 80) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220/0.5))*3-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220/0.5))*3)));
        }
        else if (tickAnim >= 139 && tickAnim < 178) {
            xx = 25.75 + (((tickAnim - 139) / 39) * (25.75-(25.75)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220/0.5))*3 + (((tickAnim - 139) / 39) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220/0.5))*3-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220/0.5))*3)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220/0.5))*3 + (((tickAnim - 139) / 39) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220/0.5))*3-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220/0.5))*3)));
        }
        else if (tickAnim >= 178 && tickAnim < 186) {
            xx = 25.75 + (((tickAnim - 178) / 8) * (0-(25.75)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220/0.5))*3 + (((tickAnim - 178) / 8) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220/0.5))*3)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220/0.5))*3 + (((tickAnim - 178) / 8) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220/0.5))*3)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Tail1, Tail1.rotateAngleX + (float) Math.toRadians(xx), Tail1.rotateAngleY + (float) Math.toRadians(yy), Tail1.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 10) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 8) * (-0.1-(0)));
            zz = 0 + (((tickAnim - 10) / 8) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 18) / 5) * (0-(0)));
            yy = -0.1 + (((tickAnim - 18) / 5) * (0-(-0.1)));
            zz = 0 + (((tickAnim - 18) / 5) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 23) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 23) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 7) * (-0.6-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 31) {
            xx = 0 + (((tickAnim - 30) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 30) / 1) * (0-(0)));
            zz = -0.6 + (((tickAnim - 30) / 1) * (-0.6-(-0.6)));
        }
        else if (tickAnim >= 31 && tickAnim < 59) {
            xx = 0 + (((tickAnim - 31) / 28) * (0-(0)));
            yy = 0 + (((tickAnim - 31) / 28) * (0-(0)));
            zz = -0.6 + (((tickAnim - 31) / 28) * (-0.6-(-0.6)));
        }
        else if (tickAnim >= 59 && tickAnim < 139) {
            xx = 0 + (((tickAnim - 59) / 80) * (0-(0)));
            yy = 0 + (((tickAnim - 59) / 80) * (0-(0)));
            zz = -0.6 + (((tickAnim - 59) / 80) * (-0.6-(-0.6)));
        }
        else if (tickAnim >= 139 && tickAnim < 178) {
            xx = 0 + (((tickAnim - 139) / 39) * (0-(0)));
            yy = 0 + (((tickAnim - 139) / 39) * (0-(0)));
            zz = -0.6 + (((tickAnim - 139) / 39) * (-0.6-(-0.6)));
        }
        else if (tickAnim >= 178 && tickAnim < 186) {
            xx = 0 + (((tickAnim - 178) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 178) / 8) * (0-(0)));
            zz = -0.6 + (((tickAnim - 178) / 8) * (0-(-0.6)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.Tail1.rotationPointX = this.Tail1.rotationPointX + (float)(xx);
        this.Tail1.rotationPointY = this.Tail1.rotationPointY - (float)(yy);
        this.Tail1.rotationPointZ = this.Tail1.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (10.25-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 11) {
            xx = 10.25 + (((tickAnim - 10) / 1) * (10.25-(10.25)));
            yy = 0 + (((tickAnim - 10) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 1) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 13) {
            xx = 10.25 + (((tickAnim - 11) / 2) * (14.44-(10.25)));
            yy = 0 + (((tickAnim - 11) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 2) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 14) {
            xx = 14.44 + (((tickAnim - 13) / 1) * (-11.14-(14.44)));
            yy = 0 + (((tickAnim - 13) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 1) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 18) {
            xx = -11.14 + (((tickAnim - 14) / 4) * (-26-(-11.14)));
            yy = 0 + (((tickAnim - 14) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 4) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = -26 + (((tickAnim - 18) / 2) * (14.42-(-26)));
            yy = 0 + (((tickAnim - 18) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 2) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 23) {
            xx = 14.42 + (((tickAnim - 20) / 3) * (10.25-(14.42)));
            yy = 0 + (((tickAnim - 20) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 3) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 25) {
            xx = 10.25 + (((tickAnim - 23) / 2) * (-23.3-(10.25)));
            yy = 0 + (((tickAnim - 23) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 2) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 30) {
            xx = -23.3 + (((tickAnim - 25) / 5) * (17-(-23.3)));
            yy = 0 + (((tickAnim - 25) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 5) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 31) {
            xx = 17 + (((tickAnim - 30) / 1) * (17-(17)));
            yy = 0 + (((tickAnim - 30) / 1) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220/0.5-100))*3-(0)));
            zz = 0 + (((tickAnim - 30) / 1) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220/0.5-100))*3-(0)));
        }
        else if (tickAnim >= 31 && tickAnim < 59) {
            xx = 17 + (((tickAnim - 31) / 28) * (17-(17)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220/0.5-100))*3 + (((tickAnim - 31) / 28) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220/0.5-100))*3-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220/0.5-100))*3)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220/0.5-100))*3 + (((tickAnim - 31) / 28) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220/0.5-100))*3-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220/0.5-100))*3)));
        }
        else if (tickAnim >= 59 && tickAnim < 139) {
            xx = 17 + (((tickAnim - 59) / 80) * (17-(17)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220/0.5-100))*3 + (((tickAnim - 59) / 80) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220/0.5-100))*3-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220/0.5-100))*3)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220/0.5-100))*3 + (((tickAnim - 59) / 80) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220/0.5-100))*3-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220/0.5-100))*3)));
        }
        else if (tickAnim >= 139 && tickAnim < 178) {
            xx = 17 + (((tickAnim - 139) / 39) * (17-(17)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220/0.5-100))*3 + (((tickAnim - 139) / 39) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220/0.5-100))*3-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220/0.5-100))*3)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220/0.5-100))*3 + (((tickAnim - 139) / 39) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220/0.5-100))*3-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220/0.5-100))*3)));
        }
        else if (tickAnim >= 178 && tickAnim < 186) {
            xx = 17 + (((tickAnim - 178) / 8) * (0-(17)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220/0.5-100))*3 + (((tickAnim - 178) / 8) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220/0.5-100))*3)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220/0.5-100))*3 + (((tickAnim - 178) / 8) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220/0.5-100))*3)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Tail2, Tail2.rotateAngleX + (float) Math.toRadians(xx), Tail2.rotateAngleY + (float) Math.toRadians(yy), Tail2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 10) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 1) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 11) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 11) / 2) * (-0.03-(0)));
            zz = 0 + (((tickAnim - 11) / 2) * (-0.15-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 13) / 5) * (0-(0)));
            yy = -0.03 + (((tickAnim - 13) / 5) * (-0.15-(-0.03)));
            zz = -0.15 + (((tickAnim - 13) / 5) * (0-(-0.15)));
        }
        else if (tickAnim >= 18 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 18) / 5) * (0-(0)));
            yy = -0.15 + (((tickAnim - 18) / 5) * (0-(-0.15)));
            zz = 0 + (((tickAnim - 18) / 5) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 23) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 23) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 7) * (-0.275-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 31) {
            xx = 0 + (((tickAnim - 30) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 30) / 1) * (0-(0)));
            zz = -0.275 + (((tickAnim - 30) / 1) * (-0.275-(-0.275)));
        }
        else if (tickAnim >= 31 && tickAnim < 59) {
            xx = 0 + (((tickAnim - 31) / 28) * (0-(0)));
            yy = 0 + (((tickAnim - 31) / 28) * (0-(0)));
            zz = -0.275 + (((tickAnim - 31) / 28) * (-0.275-(-0.275)));
        }
        else if (tickAnim >= 59 && tickAnim < 139) {
            xx = 0 + (((tickAnim - 59) / 80) * (0-(0)));
            yy = 0 + (((tickAnim - 59) / 80) * (0-(0)));
            zz = -0.275 + (((tickAnim - 59) / 80) * (-0.275-(-0.275)));
        }
        else if (tickAnim >= 139 && tickAnim < 178) {
            xx = 0 + (((tickAnim - 139) / 39) * (0-(0)));
            yy = 0 + (((tickAnim - 139) / 39) * (0-(0)));
            zz = -0.275 + (((tickAnim - 139) / 39) * (-0.275-(-0.275)));
        }
        else if (tickAnim >= 178 && tickAnim < 186) {
            xx = 0 + (((tickAnim - 178) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 178) / 8) * (0-(0)));
            zz = -0.275 + (((tickAnim - 178) / 8) * (0-(-0.275)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.Tail2.rotationPointX = this.Tail2.rotationPointX + (float)(xx);
        this.Tail2.rotationPointY = this.Tail2.rotationPointY - (float)(yy);
        this.Tail2.rotationPointZ = this.Tail2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (-2-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = -2 + (((tickAnim - 10) / 5) * (-66.43+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*100-(-2)));
            yy = 0 + (((tickAnim - 10) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 5) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 18) {
            xx = -66.43+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*100 + (((tickAnim - 15) / 3) * (9.25-(-66.43+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*100)));
            yy = 0 + (((tickAnim - 15) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 3) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 23) {
            xx = 9.25 + (((tickAnim - 18) / 5) * (-2-(9.25)));
            yy = 0 + (((tickAnim - 18) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 5) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 30) {
            xx = -2 + (((tickAnim - 23) / 7) * (7-(-2)));
            yy = 0 + (((tickAnim - 23) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 7) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 31) {
            xx = 7 + (((tickAnim - 30) / 1) * (7-(7)));
            yy = 0 + (((tickAnim - 30) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 1) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220/0.5-50))*0.5-(0)));
        }
        else if (tickAnim >= 31 && tickAnim < 59) {
            xx = 7 + (((tickAnim - 31) / 28) * (7-(7)));
            yy = 0 + (((tickAnim - 31) / 28) * (0-(0)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220/0.5-50))*0.5 + (((tickAnim - 31) / 28) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220/0.5-50))*0.5-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220/0.5-50))*0.5)));
        }
        else if (tickAnim >= 59 && tickAnim < 139) {
            xx = 7 + (((tickAnim - 59) / 80) * (7-(7)));
            yy = 0 + (((tickAnim - 59) / 80) * (0-(0)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220/0.5-50))*0.5 + (((tickAnim - 59) / 80) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220/0.5-50))*0.5-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220/0.5-50))*0.5)));
        }
        else if (tickAnim >= 139 && tickAnim < 186) {
            xx = 7 + (((tickAnim - 139) / 47) * (0-(7)));
            yy = 0 + (((tickAnim - 139) / 47) * (0-(0)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220/0.5-50))*0.5 + (((tickAnim - 139) / 47) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220/0.5-50))*0.5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(xx), body.rotateAngleY + (float) Math.toRadians(yy), body.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (-0.125-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 10) / 13) * (0-(0)));
            yy = -0.125 + (((tickAnim - 10) / 13) * (-0.125-(-0.125)));
            zz = 0 + (((tickAnim - 10) / 13) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 186) {
            xx = 0 + (((tickAnim - 23) / 163) * (0-(0)));
            yy = -0.125 + (((tickAnim - 23) / 163) * (0-(-0.125)));
            zz = 0 + (((tickAnim - 23) / 163) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.body.rotationPointX = this.body.rotationPointX + (float)(xx);
        this.body.rotationPointY = this.body.rotationPointY - (float)(yy);
        this.body.rotationPointZ = this.body.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (6.25-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 12) {
            xx = 6.25 + (((tickAnim - 10) / 2) * (0-(6.25)));
            yy = 0 + (((tickAnim - 10) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 2) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 12) / 1) * (-9.75-(0)));
            yy = 0 + (((tickAnim - 12) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 1) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
            xx = -9.75 + (((tickAnim - 13) / 5) * (0-(-9.75)));
            yy = 0 + (((tickAnim - 13) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 5) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 22) {
            xx = 0 + (((tickAnim - 18) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 18) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 4) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 22) / 1) * (6.25-(0)));
            yy = 0 + (((tickAnim - 22) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 22) / 1) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 30) {
            xx = 6.25 + (((tickAnim - 23) / 7) * (0-(6.25)));
            yy = 0 + (((tickAnim - 23) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 7) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 31) {
            xx = 0 + (((tickAnim - 30) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 30) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 1) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220/0.5-100))*1-(0)));
        }
        else if (tickAnim >= 31 && tickAnim < 186) {
            xx = 0 + (((tickAnim - 31) / 155) * (0-(0)));
            yy = 0 + (((tickAnim - 31) / 155) * (0-(0)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220/0.5-100))*1 + (((tickAnim - 31) / 155) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220/0.5-100))*1)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(xx), chest.rotateAngleY + (float) Math.toRadians(yy), chest.rotateAngleZ + (float) Math.toRadians(zz));

        this.chest.rotationPointX = this.chest.rotationPointX + (float)(0);
        this.chest.rotationPointY = this.chest.rotationPointY - (float)(0);
        this.chest.rotationPointZ = this.chest.rotationPointZ + (float)(0);



        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (-41.48053-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (7.53554-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (-83.28795-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = -41.48053 + (((tickAnim - 10) / 3) * (-0.36971-(-41.48053)));
            yy = 7.53554 + (((tickAnim - 10) / 3) * (-5.00077-(7.53554)));
            zz = -83.28795 + (((tickAnim - 10) / 3) * (-29.89922-(-83.28795)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
            xx = -0.36971 + (((tickAnim - 13) / 5) * (53.59826-(-0.36971)));
            yy = -5.00077 + (((tickAnim - 13) / 5) * (2.95129-(-5.00077)));
            zz = -29.89922 + (((tickAnim - 13) / 5) * (16.96505-(-29.89922)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = 53.59826 + (((tickAnim - 18) / 2) * (45.97606-(53.59826)));
            yy = 2.95129 + (((tickAnim - 18) / 2) * (14.46943-(2.95129)));
            zz = 16.96505 + (((tickAnim - 18) / 2) * (8.7103-(16.96505)));
        }
        else if (tickAnim >= 20 && tickAnim < 23) {
            xx = 45.97606 + (((tickAnim - 20) / 3) * (-41.48053-(45.97606)));
            yy = 14.46943 + (((tickAnim - 20) / 3) * (7.53554-(14.46943)));
            zz = 8.7103 + (((tickAnim - 20) / 3) * (-83.28795-(8.7103)));
        }
        else if (tickAnim >= 23 && tickAnim < 30) {
            xx = -41.48053 + (((tickAnim - 23) / 7) * (-35.28745-(-41.48053)));
            yy = 7.53554 + (((tickAnim - 23) / 7) * (18.71255-(7.53554)));
            zz = -83.28795 + (((tickAnim - 23) / 7) * (-66.87492-(-83.28795)));
        }
        else if (tickAnim >= 30 && tickAnim < 31) {
            xx = -35.28745 + (((tickAnim - 30) / 1) * (-35.28745-(-35.28745)));
            yy = 18.71255 + (((tickAnim - 30) / 1) * (18.7125545487+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220/0.75))*1-(18.71255)));
            zz = -66.87492 + (((tickAnim - 30) / 1) * (-66.874917931+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000/0.75))*1-(-66.87492)));
        }
        else if (tickAnim >= 31 && tickAnim < 59) {
            xx = -35.28745 + (((tickAnim - 31) / 28) * (-35.28745-(-35.28745)));
            yy = 18.7125545487+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220/0.75))*1 + (((tickAnim - 31) / 28) * (18.7125545487+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220/0.75))*1-(18.7125545487+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220/0.75))*1)));
            zz = -66.874917931+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000/0.75))*1 + (((tickAnim - 31) / 28) * (-66.874917931+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000/0.75))*1-(-66.874917931+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000/0.75))*1)));
        }
        else if (tickAnim >= 59 && tickAnim < 139) {
            xx = -35.28745 + (((tickAnim - 59) / 80) * (-35.28745-(-35.28745)));
            yy = 18.7125545487+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220/0.75))*1 + (((tickAnim - 59) / 80) * (18.7125545487+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220/0.75))*1-(18.7125545487+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220/0.75))*1)));
            zz = -66.874917931+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000/0.75))*1 + (((tickAnim - 59) / 80) * (-66.874917931+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000/0.75))*1-(-66.874917931+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000/0.75))*1)));
        }
        else if (tickAnim >= 139 && tickAnim < 178) {
            xx = -35.28745 + (((tickAnim - 139) / 39) * (-35.28745-(-35.28745)));
            yy = 18.7125545487+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220/0.75))*1 + (((tickAnim - 139) / 39) * (18.7125545487+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220/0.75))*1-(18.7125545487+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220/0.75))*1)));
            zz = -66.874917931+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000/0.75))*1 + (((tickAnim - 139) / 39) * (-66.874917931+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000/0.75))*1-(-66.874917931+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000/0.75))*1)));
        }
        else if (tickAnim >= 178 && tickAnim < 186) {
            xx = -35.28745 + (((tickAnim - 178) / 8) * (0-(-35.28745)));
            yy = 18.7125545487+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220/0.75))*1 + (((tickAnim - 178) / 8) * (0-(18.7125545487+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220/0.75))*1)));
            zz = -66.874917931+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000/0.75))*1 + (((tickAnim - 178) / 8) * (0-(-66.874917931+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000/0.75))*1)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm, leftArm.rotateAngleX + (float) Math.toRadians(xx), leftArm.rotateAngleY + (float) Math.toRadians(yy), leftArm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 10) / 3) * (7.3864-(0)));
            yy = 0 + (((tickAnim - 10) / 3) * (7.74604-(0)));
            zz = 0 + (((tickAnim - 10) / 3) * (14.45744-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
            xx = 7.3864 + (((tickAnim - 13) / 5) * (0-(7.3864)));
            yy = 7.74604 + (((tickAnim - 13) / 5) * (0-(7.74604)));
            zz = 14.45744 + (((tickAnim - 13) / 5) * (0-(14.45744)));
        }
        else if (tickAnim >= 18 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 18) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 18) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 5) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 23) / 7) * (0.09767-(0)));
            yy = 0 + (((tickAnim - 23) / 7) * (-5.19456-(0)));
            zz = 0 + (((tickAnim - 23) / 7) * (10.49462-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 186) {
            xx = 0.09767 + (((tickAnim - 30) / 156) * (0-(0.09767)));
            yy = -5.19456 + (((tickAnim - 30) / 156) * (0-(-5.19456)));
            zz = 10.49462 + (((tickAnim - 30) / 156) * (0-(10.49462)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm2, leftArm2.rotateAngleX + (float) Math.toRadians(xx), leftArm2.rotateAngleY + (float) Math.toRadians(yy), leftArm2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 10) / 3) * (-23.25-(0)));
            yy = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 3) * (-28-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 14) {
            xx = -23.25 + (((tickAnim - 13) / 1) * (-23.25-(-23.25)));
            yy = 0 + (((tickAnim - 13) / 1) * (0-(0)));
            zz = -28 + (((tickAnim - 13) / 1) * (-28-(-28)));
        }
        else if (tickAnim >= 14 && tickAnim < 18) {
            xx = -23.25 + (((tickAnim - 14) / 4) * (0-(-23.25)));
            yy = 0 + (((tickAnim - 14) / 4) * (0-(0)));
            zz = -28 + (((tickAnim - 14) / 4) * (0-(-28)));
        }
        else if (tickAnim >= 18 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 18) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 18) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 5) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 186) {
            xx = 0 + (((tickAnim - 23) / 163) * (0-(0)));
            yy = 0 + (((tickAnim - 23) / 163) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 163) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm3, leftArm3.rotateAngleX + (float) Math.toRadians(xx), leftArm3.rotateAngleY + (float) Math.toRadians(yy), leftArm3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (-41.48053-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (-7.53554-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (83.28795-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = -41.48053 + (((tickAnim - 10) / 3) * (-0.36971-(-41.48053)));
            yy = -7.53554 + (((tickAnim - 10) / 3) * (5.00077-(-7.53554)));
            zz = 83.28795 + (((tickAnim - 10) / 3) * (19.72422-(83.28795)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
            xx = -0.36971 + (((tickAnim - 13) / 5) * (53.59826-(-0.36971)));
            yy = 5.00077 + (((tickAnim - 13) / 5) * (-2.95129-(5.00077)));
            zz = 19.72422 + (((tickAnim - 13) / 5) * (-16.96505-(19.72422)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = 53.59826 + (((tickAnim - 18) / 2) * (45.97606-(53.59826)));
            yy = -2.95129 + (((tickAnim - 18) / 2) * (-14.46943-(-2.95129)));
            zz = -16.96505 + (((tickAnim - 18) / 2) * (-8.7103-(-16.96505)));
        }
        else if (tickAnim >= 20 && tickAnim < 23) {
            xx = 45.97606 + (((tickAnim - 20) / 3) * (-41.48053-(45.97606)));
            yy = -14.46943 + (((tickAnim - 20) / 3) * (-7.53554-(-14.46943)));
            zz = -8.7103 + (((tickAnim - 20) / 3) * (83.28795-(-8.7103)));
        }
        else if (tickAnim >= 23 && tickAnim < 30) {
            xx = -41.48053 + (((tickAnim - 23) / 7) * (-35.28745-(-41.48053)));
            yy = -7.53554 + (((tickAnim - 23) / 7) * (-18.71255-(-7.53554)));
            zz = 83.28795 + (((tickAnim - 23) / 7) * (66.87492-(83.28795)));
        }
        else if (tickAnim >= 30 && tickAnim < 31) {
            xx = -35.28745 + (((tickAnim - 30) / 1) * (-35.28745-(-35.28745)));
            yy = -18.71255 + (((tickAnim - 30) / 1) * (-18.71255-(-18.71255)));
            zz = 66.87492 + (((tickAnim - 30) / 1) * (66.87492-(66.87492)));
        }
        else if (tickAnim >= 31 && tickAnim < 59) {
            xx = -35.28745 + (((tickAnim - 31) / 28) * (-35.28745-(-35.28745)));
            yy = -18.71255 + (((tickAnim - 31) / 28) * (-18.71255-(-18.71255)));
            zz = 66.87492 + (((tickAnim - 31) / 28) * (66.87492-(66.87492)));
        }
        else if (tickAnim >= 59 && tickAnim < 60) {
            xx = -35.28745 + (((tickAnim - 59) / 1) * (-35.28745-(-35.28745)));
            yy = -18.71255 + (((tickAnim - 59) / 1) * (-18.71255-(-18.71255)));
            zz = 66.87492 + (((tickAnim - 59) / 1) * (66.87492-(66.87492)));
        }
        else if (tickAnim >= 60 && tickAnim < 140) {
            xx = -35.28745 + (((tickAnim - 60) / 80) * (-35.28745-(-35.28745)));
            yy = -18.71255 + (((tickAnim - 60) / 80) * (-18.71255-(-18.71255)));
            zz = 66.87492 + (((tickAnim - 60) / 80) * (66.87492-(66.87492)));
        }
        else if (tickAnim >= 140 && tickAnim < 178) {
            xx = -35.28745 + (((tickAnim - 140) / 38) * (-35.28745-(-35.28745)));
            yy = -18.71255 + (((tickAnim - 140) / 38) * (-18.71255-(-18.71255)));
            zz = 66.87492 + (((tickAnim - 140) / 38) * (66.87492-(66.87492)));
        }
        else if (tickAnim >= 178 && tickAnim < 186) {
            xx = -35.28745 + (((tickAnim - 178) / 8) * (0-(-35.28745)));
            yy = -18.71255 + (((tickAnim - 178) / 8) * (0-(-18.71255)));
            zz = 66.87492 + (((tickAnim - 178) / 8) * (0-(66.87492)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm, rightArm.rotateAngleX + (float) Math.toRadians(xx), rightArm.rotateAngleY + (float) Math.toRadians(yy), rightArm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 10) / 3) * (7.3864-(0)));
            yy = 0 + (((tickAnim - 10) / 3) * (-7.74604-(0)));
            zz = 0 + (((tickAnim - 10) / 3) * (-14.45744-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
            xx = 7.3864 + (((tickAnim - 13) / 5) * (0-(7.3864)));
            yy = -7.74604 + (((tickAnim - 13) / 5) * (0-(-7.74604)));
            zz = -14.45744 + (((tickAnim - 13) / 5) * (0-(-14.45744)));
        }
        else if (tickAnim >= 18 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 18) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 18) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 5) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 23) / 7) * (0.09767-(0)));
            yy = 0 + (((tickAnim - 23) / 7) * (5.19456-(0)));
            zz = 0 + (((tickAnim - 23) / 7) * (-10.49462-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 186) {
            xx = 0.09767 + (((tickAnim - 30) / 156) * (0-(0.09767)));
            yy = 5.19456 + (((tickAnim - 30) / 156) * (0-(5.19456)));
            zz = -10.49462 + (((tickAnim - 30) / 156) * (0-(-10.49462)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm2, rightArm2.rotateAngleX + (float) Math.toRadians(xx), rightArm2.rotateAngleY + (float) Math.toRadians(yy), rightArm2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 10) / 3) * (-23.25-(0)));
            yy = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 3) * (28-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 14) {
            xx = -23.25 + (((tickAnim - 13) / 1) * (-23.25-(-23.25)));
            yy = 0 + (((tickAnim - 13) / 1) * (0-(0)));
            zz = 28 + (((tickAnim - 13) / 1) * (28-(28)));
        }
        else if (tickAnim >= 14 && tickAnim < 18) {
            xx = -23.25 + (((tickAnim - 14) / 4) * (0-(-23.25)));
            yy = 0 + (((tickAnim - 14) / 4) * (0-(0)));
            zz = 28 + (((tickAnim - 14) / 4) * (0-(28)));
        }
        else if (tickAnim >= 18 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 18) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 18) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 5) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 186) {
            xx = 0 + (((tickAnim - 23) / 163) * (0-(0)));
            yy = 0 + (((tickAnim - 23) / 163) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 163) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm3, rightArm3.rotateAngleX + (float) Math.toRadians(xx), rightArm3.rotateAngleY + (float) Math.toRadians(yy), rightArm3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (37-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 12) {
            xx = 37 + (((tickAnim - 10) / 2) * (21-(37)));
            yy = 0 + (((tickAnim - 10) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 2) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 14) {
            xx = 21 + (((tickAnim - 12) / 2) * (50.18-(21)));
            yy = 0 + (((tickAnim - 12) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 2) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 18) {
            xx = 50.18 + (((tickAnim - 14) / 4) * (30.75-(50.18)));
            yy = 0 + (((tickAnim - 14) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 4) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = 30.75 + (((tickAnim - 18) / 2) * (17.92-(30.75)));
            yy = 0 + (((tickAnim - 18) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 2) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 22) {
            xx = 17.92 + (((tickAnim - 20) / 2) * (0-(17.92)));
            yy = 0 + (((tickAnim - 20) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 2) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 22) / 1) * (37-(0)));
            yy = 0 + (((tickAnim - 22) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 22) / 1) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 30) {
            xx = 37 + (((tickAnim - 23) / 7) * (37.5-(37)));
            yy = 0 + (((tickAnim - 23) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 7) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 139) {
            xx = 37.5 + (((tickAnim - 30) / 109) * (42.96-(37.5)));
            yy = 0 + (((tickAnim - 30) / 109) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 109) * (0-(0)));
        }
        else if (tickAnim >= 139 && tickAnim < 178) {
            xx = 42.96 + (((tickAnim - 139) / 39) * (42.96-(42.96)));
            yy = 0 + (((tickAnim - 139) / 39) * (0-(0)));
            zz = 0 + (((tickAnim - 139) / 39) * (0-(0)));
        }
        else if (tickAnim >= 178 && tickAnim < 186) {
            xx = 42.96 + (((tickAnim - 178) / 8) * (0-(42.96)));
            yy = 0 + (((tickAnim - 178) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 178) / 8) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(xx), neck.rotateAngleY + (float) Math.toRadians(yy), neck.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (-0.625-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (-1.325-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 10) / 8) * (0-(0)));
            yy = -0.625 + (((tickAnim - 10) / 8) * (-0.35-(-0.625)));
            zz = -1.325 + (((tickAnim - 10) / 8) * (0-(-1.325)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 18) / 2) * (0-(0)));
            yy = -0.35 + (((tickAnim - 18) / 2) * (0-(-0.35)));
            zz = 0 + (((tickAnim - 18) / 2) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 20) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 20) / 3) * (-0.625-(0)));
            zz = 0 + (((tickAnim - 20) / 3) * (-1.325-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 23) / 7) * (0-(0)));
            yy = -0.625 + (((tickAnim - 23) / 7) * (-0.225-(-0.625)));
            zz = -1.325 + (((tickAnim - 23) / 7) * (0-(-1.325)));
        }
        else if (tickAnim >= 30 && tickAnim < 139) {
            xx = 0 + (((tickAnim - 30) / 109) * (0-(0)));
            yy = -0.225 + (((tickAnim - 30) / 109) * (-0.635-(-0.225)));
            zz = 0 + (((tickAnim - 30) / 109) * (0-(0)));
        }
        else if (tickAnim >= 139 && tickAnim < 178) {
            xx = 0 + (((tickAnim - 139) / 39) * (0-(0)));
            yy = -0.635 + (((tickAnim - 139) / 39) * (-0.635-(-0.635)));
            zz = 0 + (((tickAnim - 139) / 39) * (0-(0)));
        }
        else if (tickAnim >= 178 && tickAnim < 186) {
            xx = 0 + (((tickAnim - 178) / 8) * (0-(0)));
            yy = -0.635 + (((tickAnim - 178) / 8) * (0-(-0.635)));
            zz = 0 + (((tickAnim - 178) / 8) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.neck.rotationPointX = this.neck.rotationPointX + (float)(xx);
        this.neck.rotationPointY = this.neck.rotationPointY - (float)(yy);
        this.neck.rotationPointZ = this.neck.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (23.68189-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (1.1286-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (-1.4816-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 23.68189 + (((tickAnim - 5) / 5) * (-1.13622-(23.68189)));
            yy = 1.1286 + (((tickAnim - 5) / 5) * (2.25719-(1.1286)));
            zz = -1.4816 + (((tickAnim - 5) / 5) * (-2.96321-(-1.4816)));
        }
        else if (tickAnim >= 10 && tickAnim < 12) {
            xx = -1.13622 + (((tickAnim - 10) / 2) * (-17.10217-(-1.13622)));
            yy = 2.25719 + (((tickAnim - 10) / 2) * (1.69289-(2.25719)));
            zz = -2.96321 + (((tickAnim - 10) / 2) * (-2.22241-(-2.96321)));
        }
        else if (tickAnim >= 12 && tickAnim < 14) {
            xx = -17.10217 + (((tickAnim - 12) / 2) * (-19.48695-(-17.10217)));
            yy = 1.69289 + (((tickAnim - 12) / 2) * (0.96737-(1.69289)));
            zz = -2.22241 + (((tickAnim - 12) / 2) * (-1.26995-(-2.22241)));
        }
        else if (tickAnim >= 14 && tickAnim < 18) {
            xx = -19.48695 + (((tickAnim - 14) / 4) * (-21.5-(-19.48695)));
            yy = 0.96737 + (((tickAnim - 14) / 4) * (0-(0.96737)));
            zz = -1.26995 + (((tickAnim - 14) / 4) * (0-(-1.26995)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = -21.5 + (((tickAnim - 18) / 2) * (-18.9969-(-21.5)));
            yy = 0 + (((tickAnim - 18) / 2) * (1.05336-(0)));
            zz = 0 + (((tickAnim - 18) / 2) * (-1.38283-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 22) {
            xx = -18.9969 + (((tickAnim - 20) / 2) * (14-(-18.9969)));
            yy = 1.05336 + (((tickAnim - 20) / 2) * (0-(1.05336)));
            zz = -1.38283 + (((tickAnim - 20) / 2) * (0-(-1.38283)));
        }
        else if (tickAnim >= 22 && tickAnim < 23) {
            xx = 14 + (((tickAnim - 22) / 1) * (17.86378-(14)));
            yy = 0 + (((tickAnim - 22) / 1) * (2.25719-(0)));
            zz = 0 + (((tickAnim - 22) / 1) * (-2.96321-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 30) {
            xx = 17.86378 + (((tickAnim - 23) / 7) * (30-(17.86378)));
            yy = 2.25719 + (((tickAnim - 23) / 7) * (0-(2.25719)));
            zz = -2.96321 + (((tickAnim - 23) / 7) * (0-(-2.96321)));
        }
        else if (tickAnim >= 30 && tickAnim < 186) {
            xx = 30 + (((tickAnim - 30) / 156) * (0-(30)));
            yy = 0 + (((tickAnim - 30) / 156) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 156) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(xx), neck2.rotateAngleY + (float) Math.toRadians(yy), neck2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 22) {
            xx = 0 + (((tickAnim - 18) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 18) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 4) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 22) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 22) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 22) / 8) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 186) {
            xx = 0 + (((tickAnim - 30) / 156) * (0-(0)));
            yy = 0 + (((tickAnim - 30) / 156) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 156) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.neck2.rotationPointX = this.neck2.rotationPointX + (float)(xx);
        this.neck2.rotationPointY = this.neck2.rotationPointY - (float)(yy);
        this.neck2.rotationPointZ = this.neck2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (-18.75-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = -18.75 + (((tickAnim - 8) / 2) * (-26.75-(-18.75)));
            yy = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 2) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 12) {
            xx = -26.75 + (((tickAnim - 10) / 2) * (-36.53-(-26.75)));
            yy = 0 + (((tickAnim - 10) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 2) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 15) {
            xx = -36.53 + (((tickAnim - 12) / 3) * (13.61-(-36.53)));
            yy = 0 + (((tickAnim - 12) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 3) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 18) {
            xx = 13.61 + (((tickAnim - 15) / 3) * (-14-(13.61)));
            yy = 0 + (((tickAnim - 15) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 3) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 22) {
            xx = -14 + (((tickAnim - 18) / 4) * (0-(-14)));
            yy = 0 + (((tickAnim - 18) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 4) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 22) / 1) * (-43-(0)));
            yy = 0 + (((tickAnim - 22) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 22) / 1) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 30) {
            xx = -43 + (((tickAnim - 23) / 7) * (0-(-43)));
            yy = 0 + (((tickAnim - 23) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 7) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 186) {
            xx = 0 + (((tickAnim - 30) / 156) * (0-(0)));
            yy = 0 + (((tickAnim - 30) / 156) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 156) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(xx), neck3.rotateAngleY + (float) Math.toRadians(yy), neck3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0.01-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0.09-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            yy = 0.01 + (((tickAnim - 8) / 2) * (0.15-(0.01)));
            zz = 0.09 + (((tickAnim - 8) / 2) * (0.125-(0.09)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 10) / 5) * (0-(0)));
            yy = 0.15 + (((tickAnim - 10) / 5) * (-0.215-(0.15)));
            zz = 0.125 + (((tickAnim - 10) / 5) * (0.34-(0.125)));
        }
        else if (tickAnim >= 15 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 15) / 3) * (0-(0)));
            yy = -0.215 + (((tickAnim - 15) / 3) * (0.075-(-0.215)));
            zz = 0.34 + (((tickAnim - 15) / 3) * (-0.025-(0.34)));
        }
        else if (tickAnim >= 18 && tickAnim < 22) {
            xx = 0 + (((tickAnim - 18) / 4) * (0-(0)));
            yy = 0.075 + (((tickAnim - 18) / 4) * (0-(0.075)));
            zz = -0.025 + (((tickAnim - 18) / 4) * (0-(-0.025)));
        }
        else if (tickAnim >= 22 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 22) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 22) / 1) * (0.15-(0)));
            zz = 0 + (((tickAnim - 22) / 1) * (0.125-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 23) / 7) * (0-(0)));
            yy = 0.15 + (((tickAnim - 23) / 7) * (0-(0.15)));
            zz = 0.125 + (((tickAnim - 23) / 7) * (0-(0.125)));
        }
        else if (tickAnim >= 30 && tickAnim < 186) {
            xx = 0 + (((tickAnim - 30) / 156) * (0-(0)));
            yy = 0 + (((tickAnim - 30) / 156) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 156) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.neck3.rotationPointX = this.neck3.rotationPointX + (float)(xx);
        this.neck3.rotationPointY = this.neck3.rotationPointY - (float)(yy);
        this.neck3.rotationPointZ = this.neck3.rotationPointZ + (float)(zz);

    }
    public void animNoise(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraEosinopteryx entity = (EntityPrehistoricFloraEosinopteryx) entitylivingbaseIn;
        int animCycle = 40;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;


        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*352))*-5), chest.rotateAngleY + (float) Math.toRadians(0), chest.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(leftArm, leftArm.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*352-250))*5), leftArm.rotateAngleY + (float) Math.toRadians(0), leftArm.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(leftArm2, leftArm2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*352-350))*-5), leftArm2.rotateAngleY + (float) Math.toRadians(0), leftArm2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(leftArm3, leftArm3.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*352-450))*-10), leftArm3.rotateAngleY + (float) Math.toRadians(0), leftArm3.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*352-100))*-5), neck.rotateAngleY + (float) Math.toRadians(0), neck.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*352-200))*10), neck2.rotateAngleY + (float) Math.toRadians(0), neck2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*352-10))*10), neck3.rotateAngleY + (float) Math.toRadians(0), neck3.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*352-10))*10), head.rotateAngleY + (float) Math.toRadians(0), head.rotateAngleZ + (float) Math.toRadians(0));



        if (tickAnim >= 0 && tickAnim < 17) {
            xx = 0 + (((tickAnim - 0) / 17) * (31.75-(0)));
            yy = 0 + (((tickAnim - 0) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 17) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 25) {
            xx = 31.75 + (((tickAnim - 17) / 8) * (0-(31.75)));
            yy = 0 + (((tickAnim - 17) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 17) / 8) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 37) {
            xx = 0 + (((tickAnim - 25) / 12) * (31.75-(0)));
            yy = 0 + (((tickAnim - 25) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 12) * (0-(0)));
        }
        else if (tickAnim >= 37 && tickAnim < 41) {
            xx = 31.75 + (((tickAnim - 37) / 4) * (0-(31.75)));
            yy = 0 + (((tickAnim - 37) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 37) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Jaw, Jaw.rotateAngleX + (float) Math.toRadians(xx), Jaw.rotateAngleY + (float) Math.toRadians(yy), Jaw.rotateAngleZ + (float) Math.toRadians(zz));



        this.setRotateAngle(rightArm, rightArm.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*352-250))*5), rightArm.rotateAngleY + (float) Math.toRadians(0), rightArm.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(rightArm2, rightArm2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*352-350))*-5), rightArm2.rotateAngleY + (float) Math.toRadians(0), rightArm2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(rightArm3, rightArm3.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*352-450))*-10), rightArm3.rotateAngleY + (float) Math.toRadians(0), rightArm3.rotateAngleZ + (float) Math.toRadians(0));
        
    }
    public void animRunning(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraEosinopteryx entity = (EntityPrehistoricFloraEosinopteryx) entitylivingbaseIn;
        int animCycle = 10;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        this.setRotateAngle(hips, hips.rotateAngleX + (float) Math.toRadians(9+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/0.5+50))*7), hips.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720+50))*4), hips.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720+50))*4));
        this.hips.rotationPointX = this.hips.rotationPointX + (float)(0);
        this.hips.rotationPointY = this.hips.rotationPointY - (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/0.5+50))*1.5);
        this.hips.rotationPointZ = this.hips.rotationPointZ + (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/0.5-50))*0.3);



        if (tickAnim >= 0 && tickAnim < 5) {
            xx = -26.75 + (((tickAnim - 0) / 5) * (58-(-26.75)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 58 + (((tickAnim - 5) / 3) * (-18.25-(58)));
            yy = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 3) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = -18.25 + (((tickAnim - 8) / 2) * (-26.75-(-18.25)));
            yy = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg, leftLeg.rotateAngleX + (float) Math.toRadians(xx), leftLeg.rotateAngleY + (float) Math.toRadians(yy), leftLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = -17 + (((tickAnim - 0) / 5) * (-9.25-(-17)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 7) {
            xx = -9.25 + (((tickAnim - 5) / 2) * (20.92-(-9.25)));
            yy = 0 + (((tickAnim - 5) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 2) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 10) {
            xx = 20.92 + (((tickAnim - 7) / 3) * (-17-(20.92)));
            yy = 0 + (((tickAnim - 7) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg2, leftLeg2.rotateAngleX + (float) Math.toRadians(xx), leftLeg2.rotateAngleY + (float) Math.toRadians(yy), leftLeg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = -0.275 + (((tickAnim - 0) / 5) * (0-(-0.275)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 5) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 5) / 2) * (-1.025-(0)));
            zz = 0 + (((tickAnim - 5) / 2) * (-0.5-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 7) / 3) * (0-(0)));
            yy = -1.025 + (((tickAnim - 7) / 3) * (0-(-1.025)));
            zz = -0.5 + (((tickAnim - 7) / 3) * (0-(-0.5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftLeg2.rotationPointX = this.leftLeg2.rotationPointX + (float)(xx);
        this.leftLeg2.rotationPointY = this.leftLeg2.rotationPointY - (float)(yy);
        this.leftLeg2.rotationPointZ = this.leftLeg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 30.25 + (((tickAnim - 0) / 2) * (-7.08-(30.25)));
            yy = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 2) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 5) {
            xx = -7.08 + (((tickAnim - 2) / 3) * (0-(-7.08)));
            yy = 0 + (((tickAnim - 2) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 2) / 3) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 5) / 3) * (-17.12-(0)));
            yy = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 3) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 8) {
            xx = -17.12 + (((tickAnim - 8) / 0) * (-17.12-(-17.12)));
            yy = 0 + (((tickAnim - 8) / 0) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 0) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = -17.12 + (((tickAnim - 8) / 2) * (30.25-(-17.12)));
            yy = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg3, leftLeg3.rotateAngleX + (float) Math.toRadians(xx), leftLeg3.rotateAngleY + (float) Math.toRadians(yy), leftLeg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = -0.15 + (((tickAnim - 0) / 5) * (0-(-0.15)));
            zz = 0.025 + (((tickAnim - 0) / 5) * (0-(0.025)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftLeg3.rotationPointX = this.leftLeg3.rotationPointX + (float)(xx);
        this.leftLeg3.rotationPointY = this.leftLeg3.rotationPointY - (float)(yy);
        this.leftLeg3.rotationPointZ = this.leftLeg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = -1.25 + (((tickAnim - 0) / 2) * (10.60382-(-1.25)));
            yy = 0 + (((tickAnim - 0) / 2) * (-2.56508-(0)));
            zz = 0 + (((tickAnim - 0) / 2) * (-5.3126-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = 10.60382 + (((tickAnim - 2) / 1) * (-18.16323-(10.60382)));
            yy = -2.56508 + (((tickAnim - 2) / 1) * (0.96402-(-2.56508)));
            zz = -5.3126 + (((tickAnim - 2) / 1) * (2.0671-(-5.3126)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = -18.16323 + (((tickAnim - 3) / 2) * (22.25-(-18.16323)));
            yy = 0.96402 + (((tickAnim - 3) / 2) * (0-(0.96402)));
            zz = 2.0671 + (((tickAnim - 3) / 2) * (0-(2.0671)));
        }
        else if (tickAnim >= 5 && tickAnim < 6) {
            xx = 22.25 + (((tickAnim - 5) / 1) * (63.818-(22.25)));
            yy = 0 + (((tickAnim - 5) / 1) * (2.15548-(0)));
            zz = 0 + (((tickAnim - 5) / 1) * (-2.90965-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = 63.818 + (((tickAnim - 6) / 2) * (56.25-(63.818)));
            yy = 2.15548 + (((tickAnim - 6) / 2) * (0-(2.15548)));
            zz = -2.90965 + (((tickAnim - 6) / 2) * (0-(-2.90965)));
        }
        else if (tickAnim >= 8 && tickAnim < 8) {
            xx = 56.25 + (((tickAnim - 8) / 0) * (56.25-(56.25)));
            yy = 0 + (((tickAnim - 8) / 0) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 0) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 56.25 + (((tickAnim - 8) / 2) * (4.25-(56.25)));
            yy = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(footL, footL.rotateAngleX + (float) Math.toRadians(xx), footL.rotateAngleY + (float) Math.toRadians(yy), footL.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 1) {
            xx = 0 + (((tickAnim - 0) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 1) * (0.125-(0)));
            zz = 0 + (((tickAnim - 0) / 1) * (0-(0)));
        }
        else if (tickAnim >= 1 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 1) / 1) * (0-(0)));
            yy = 0.125 + (((tickAnim - 1) / 1) * (0.72-(0.125)));
            zz = 0 + (((tickAnim - 1) / 1) * (-0.08-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 2) / 1) * (0-(0)));
            yy = 0.72 + (((tickAnim - 2) / 1) * (2.145-(0.72)));
            zz = -0.08 + (((tickAnim - 2) / 1) * (-0.12-(-0.08)));
        }
        else if (tickAnim >= 3 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 3) / 0) * (0-(0)));
            yy = 2.145 + (((tickAnim - 3) / 0) * (2.145-(2.145)));
            zz = -0.12 + (((tickAnim - 3) / 0) * (0.905-(-0.12)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            yy = 2.145 + (((tickAnim - 3) / 2) * (0.675-(2.145)));
            zz = 0.905 + (((tickAnim - 3) / 2) * (-0.25-(0.905)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            yy = 0.675 + (((tickAnim - 5) / 3) * (2.01-(0.675)));
            zz = -0.25 + (((tickAnim - 5) / 3) * (0.855-(-0.25)));
        }
        else if (tickAnim >= 8 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 8) / 0) * (0-(0)));
            yy = 2.01 + (((tickAnim - 8) / 0) * (2.01-(2.01)));
            zz = 0.855 + (((tickAnim - 8) / 0) * (0.855-(0.855)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            yy = 2.01 + (((tickAnim - 8) / 2) * (0.15-(2.01)));
            zz = 0.855 + (((tickAnim - 8) / 2) * (0-(0.855)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.footL.rotationPointX = this.footL.rotationPointX + (float)(xx);
        this.footL.rotationPointY = this.footL.rotationPointY - (float)(yy);
        this.footL.rotationPointZ = this.footL.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 58 + (((tickAnim - 0) / 3) * (-18.25-(58)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = -18.25 + (((tickAnim - 3) / 2) * (-26.75-(-18.25)));
            yy = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 2) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = -26.75 + (((tickAnim - 5) / 5) * (58-(-26.75)));
            yy = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg, rightLeg.rotateAngleX + (float) Math.toRadians(xx), rightLeg.rotateAngleY + (float) Math.toRadians(yy), rightLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = -9.25 + (((tickAnim - 0) / 2) * (20.92-(-9.25)));
            yy = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 2) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 5) {
            xx = 20.92 + (((tickAnim - 2) / 3) * (-17-(20.92)));
            yy = 0 + (((tickAnim - 2) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 2) / 3) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = -17 + (((tickAnim - 5) / 5) * (-9.25-(-17)));
            yy = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg2, rightLeg2.rotateAngleX + (float) Math.toRadians(xx), rightLeg2.rotateAngleY + (float) Math.toRadians(yy), rightLeg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 2) * (-1.025-(0)));
            zz = 0 + (((tickAnim - 0) / 2) * (-0.5-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 2) / 3) * (0-(0)));
            yy = -1.025 + (((tickAnim - 2) / 3) * (0-(-1.025)));
            zz = -0.5 + (((tickAnim - 2) / 3) * (0-(-0.5)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 5) * (0-(0)));
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
            xx = 0 + (((tickAnim - 0) / 3) * (-17.12-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 3) {
            xx = -17.12 + (((tickAnim - 3) / 0) * (-17.12-(-17.12)));
            yy = 0 + (((tickAnim - 3) / 0) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 0) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = -17.12 + (((tickAnim - 3) / 2) * (30.25-(-17.12)));
            yy = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 2) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 7) {
            xx = 30.25 + (((tickAnim - 5) / 2) * (-7.08-(30.25)));
            yy = 0 + (((tickAnim - 5) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 2) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 10) {
            xx = -7.08 + (((tickAnim - 7) / 3) * (0-(-7.08)));
            yy = 0 + (((tickAnim - 7) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg3, rightLeg3.rotateAngleX + (float) Math.toRadians(xx), rightLeg3.rotateAngleY + (float) Math.toRadians(yy), rightLeg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightLeg3.rotationPointX = this.rightLeg3.rotationPointX + (float)(xx);
        this.rightLeg3.rotationPointY = this.rightLeg3.rotationPointY - (float)(yy);
        this.rightLeg3.rotationPointZ = this.rightLeg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 1) {
            xx = 22.25 + (((tickAnim - 0) / 1) * (63.818-(22.25)));
            yy = 0 + (((tickAnim - 0) / 1) * (2.15548-(0)));
            zz = 0 + (((tickAnim - 0) / 1) * (-2.90965-(0)));
        }
        else if (tickAnim >= 1 && tickAnim < 3) {
            xx = 63.818 + (((tickAnim - 1) / 2) * (56.25-(63.818)));
            yy = 2.15548 + (((tickAnim - 1) / 2) * (0-(2.15548)));
            zz = -2.90965 + (((tickAnim - 1) / 2) * (0-(-2.90965)));
        }
        else if (tickAnim >= 3 && tickAnim < 3) {
            xx = 56.25 + (((tickAnim - 3) / 0) * (56.25-(56.25)));
            yy = 0 + (((tickAnim - 3) / 0) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 0) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 56.25 + (((tickAnim - 3) / 2) * (-1.25-(56.25)));
            yy = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 2) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 7) {
            xx = -1.25 + (((tickAnim - 5) / 2) * (10.60382-(-1.25)));
            yy = 0 + (((tickAnim - 5) / 2) * (-2.56508-(0)));
            zz = 0 + (((tickAnim - 5) / 2) * (-5.3126-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = 10.60382 + (((tickAnim - 7) / 1) * (-18.16323-(10.60382)));
            yy = -2.56508 + (((tickAnim - 7) / 1) * (0.96402-(-2.56508)));
            zz = -5.3126 + (((tickAnim - 7) / 1) * (2.0671-(-5.3126)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = -18.16323 + (((tickAnim - 8) / 2) * (22.25-(-18.16323)));
            yy = 0.96402 + (((tickAnim - 8) / 2) * (0-(0.96402)));
            zz = 2.0671 + (((tickAnim - 8) / 2) * (0-(2.0671)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(footL2, footL2.rotateAngleX + (float) Math.toRadians(xx), footL2.rotateAngleY + (float) Math.toRadians(yy), footL2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0.675 + (((tickAnim - 0) / 3) * (2.01-(0.675)));
            zz = -0.25 + (((tickAnim - 0) / 3) * (0.855-(-0.25)));
        }
        else if (tickAnim >= 3 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 3) / 0) * (0-(0)));
            yy = 2.01 + (((tickAnim - 3) / 0) * (2.01-(2.01)));
            zz = 0.855 + (((tickAnim - 3) / 0) * (0.855-(0.855)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            yy = 2.01 + (((tickAnim - 3) / 2) * (0-(2.01)));
            zz = 0.855 + (((tickAnim - 3) / 2) * (0-(0.855)));
        }
        else if (tickAnim >= 5 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 5) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 5) / 1) * (0.125-(0)));
            zz = 0 + (((tickAnim - 5) / 1) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 6) / 1) * (0-(0)));
            yy = 0.125 + (((tickAnim - 6) / 1) * (0.72-(0.125)));
            zz = 0 + (((tickAnim - 6) / 1) * (-0.08-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 7) / 1) * (0-(0)));
            yy = 0.72 + (((tickAnim - 7) / 1) * (2.145-(0.72)));
            zz = -0.08 + (((tickAnim - 7) / 1) * (-0.12-(-0.08)));
        }
        else if (tickAnim >= 8 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 8) / 0) * (0-(0)));
            yy = 2.145 + (((tickAnim - 8) / 0) * (2.145-(2.145)));
            zz = -0.12 + (((tickAnim - 8) / 0) * (0.905-(-0.12)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            yy = 2.145 + (((tickAnim - 8) / 2) * (0.675-(2.145)));
            zz = 0.905 + (((tickAnim - 8) / 2) * (-0.25-(0.905)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.footL2.rotationPointX = this.footL2.rotationPointX + (float)(xx);
        this.footL2.rotationPointY = this.footL2.rotationPointY - (float)(yy);
        this.footL2.rotationPointZ = this.footL2.rotationPointZ + (float)(zz);



        this.setRotateAngle(Tail1, Tail1.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/0.5-50))*7), Tail1.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720+50))*8), Tail1.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720+50))*4));


        this.setRotateAngle(Tail2, Tail2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/0.5-150))*15), Tail2.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720-50))*12), Tail2.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720+50))*4));


        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(6+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/0.5-150))*5), body.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720+50))*-4), body.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720+100))*-6));


        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(4), chest.rotateAngleY + (float) Math.toRadians(0), chest.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(leftArm, leftArm.rotateAngleX + (float) Math.toRadians(31.7704984545+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/0.5-150))*5), leftArm.rotateAngleY + (float) Math.toRadians(15.54919), leftArm.rotateAngleZ + (float) Math.toRadians(8.15019));


        this.setRotateAngle(leftArm2, leftArm2.rotateAngleX + (float) Math.toRadians(-48.25+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/0.5-350))*10), leftArm2.rotateAngleY + (float) Math.toRadians(0), leftArm2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(rightArm, rightArm.rotateAngleX + (float) Math.toRadians(31.7704984545+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/0.5-150))*5), rightArm.rotateAngleY + (float) Math.toRadians(-15.54919), rightArm.rotateAngleZ + (float) Math.toRadians(-8.15019));


        this.setRotateAngle(rightArm2, rightArm2.rotateAngleX + (float) Math.toRadians(-48.25+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/0.5-350))*10), rightArm2.rotateAngleY + (float) Math.toRadians(0), rightArm2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(6+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/0.5-250))*8), neck.rotateAngleY + (float) Math.toRadians(0), neck.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720))*-6));


        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(-20+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/0.5-250))*-8), neck2.rotateAngleY + (float) Math.toRadians(0), neck2.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720-100))*-6));


        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/0.5-350))*11), neck3.rotateAngleY + (float) Math.toRadians(0), neck3.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/0.5-500))*15), head.rotateAngleY + (float) Math.toRadians(0), head.rotateAngleZ + (float) Math.toRadians(0));
        
    }
    public void animWalking(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraEosinopteryx entity = (EntityPrehistoricFloraEosinopteryx) entitylivingbaseIn;
        int animCycle = 20;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;

        if (tickAnim >= 0 && tickAnim < 10) {
            xx = -11.5 + (((tickAnim - 0) / 10) * (1.05+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-50))*-100-(-11.5)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 18) {
            xx = 1.05+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-50))*-100 + (((tickAnim - 10) / 8) * (-21.94-(1.05+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-50))*-100)));
            yy = 0 + (((tickAnim - 10) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 8) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = -21.94 + (((tickAnim - 18) / 2) * (-11.5-(-21.94)));
            yy = 0 + (((tickAnim - 18) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg, leftLeg.rotateAngleX + (float) Math.toRadians(xx), leftLeg.rotateAngleY + (float) Math.toRadians(yy), leftLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = -22.5 + (((tickAnim - 0) / 10) * (3-(-22.5)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 17) {
            xx = 3 + (((tickAnim - 10) / 7) * (81.4+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-120-(3)));
            yy = 0 + (((tickAnim - 10) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 7) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 20) {
            xx = 81.4+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-120 + (((tickAnim - 17) / 3) * (-22.5-(81.4+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-120)));
            yy = 0 + (((tickAnim - 17) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 17) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg2, leftLeg2.rotateAngleX + (float) Math.toRadians(xx), leftLeg2.rotateAngleY + (float) Math.toRadians(yy), leftLeg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 10) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 2) * (-0.225-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 12) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 12) / 8) * (0-(0)));
            zz = -0.225 + (((tickAnim - 12) / 8) * (0-(-0.225)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftLeg2.rotationPointX = this.leftLeg2.rotationPointX + (float)(xx);
        this.leftLeg2.rotationPointY = this.leftLeg2.rotationPointY - (float)(yy);
        this.leftLeg2.rotationPointZ = this.leftLeg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 21.75 + (((tickAnim - 0) / 10) * (14.25-(21.75)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 12) {
            xx = 14.25 + (((tickAnim - 10) / 2) * (26.73-(14.25)));
            yy = 0 + (((tickAnim - 10) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 2) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 16) {
            xx = 26.73 + (((tickAnim - 12) / 4) * (-18.58-(26.73)));
            yy = 0 + (((tickAnim - 12) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 4) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 20) {
            xx = -18.58 + (((tickAnim - 16) / 4) * (21.75-(-18.58)));
            yy = 0 + (((tickAnim - 16) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 16) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg3, leftLeg3.rotateAngleX + (float) Math.toRadians(xx), leftLeg3.rotateAngleY + (float) Math.toRadians(yy), leftLeg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 3) * (0.375-(0)));
            zz = 0 + (((tickAnim - 10) / 3) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 16) {
            xx = 0 + (((tickAnim - 13) / 3) * (0-(0)));
            yy = 0.375 + (((tickAnim - 13) / 3) * (0-(0.375)));
            zz = 0 + (((tickAnim - 13) / 3) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 16) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 16) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 16) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftLeg3.rotationPointX = this.leftLeg3.rotationPointX + (float)(xx);
        this.leftLeg3.rotationPointY = this.leftLeg3.rotationPointY - (float)(yy);
        this.leftLeg3.rotationPointZ = this.leftLeg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 8.23885 + (((tickAnim - 0) / 2) * (-8.50743-(8.23885)));
            yy = 0.43029 + (((tickAnim - 0) / 2) * (0.28686-(0.43029)));
            zz = -2.96901 + (((tickAnim - 0) / 2) * (-1.97934-(-2.96901)));
        }
        else if (tickAnim >= 2 && tickAnim < 5) {
            xx = -8.50743 + (((tickAnim - 2) / 3) * (-30-(-8.50743)));
            yy = 0.28686 + (((tickAnim - 2) / 3) * (0-(0.28686)));
            zz = -1.97934 + (((tickAnim - 2) / 3) * (0-(-1.97934)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = -30 + (((tickAnim - 5) / 5) * (18.75-(-30)));
            yy = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 5) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 12) {
            xx = 18.75 + (((tickAnim - 10) / 2) * (52.96-(18.75)));
            yy = 0 + (((tickAnim - 10) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 2) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 16) {
            xx = 52.96 + (((tickAnim - 12) / 4) * (52.33-(52.96)));
            yy = 0 + (((tickAnim - 12) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 4) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 20) {
            xx = 52.33 + (((tickAnim - 16) / 4) * (11.75-(52.33)));
            yy = 0 + (((tickAnim - 16) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 16) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(footL, footL.rotateAngleX + (float) Math.toRadians(xx), footL.rotateAngleY + (float) Math.toRadians(yy), footL.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            yy = 0.775 + (((tickAnim - 0) / 2) * (1.145-(0.775)));
            zz = 0 + (((tickAnim - 0) / 2) * (0.385-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 2) / 1) * (0-(0)));
            yy = 1.145 + (((tickAnim - 2) / 1) * (1.145-(1.145)));
            zz = 0.385 + (((tickAnim - 2) / 1) * (0.385-(0.385)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            yy = 1.145 + (((tickAnim - 3) / 2) * (1.515-(1.145)));
            zz = 0.385 + (((tickAnim - 3) / 2) * (0.465-(0.385)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            yy = 1.515 + (((tickAnim - 5) / 5) * (1.23-(1.515)));
            zz = 0.465 + (((tickAnim - 5) / 5) * (0.375-(0.465)));
        }
        else if (tickAnim >= 10 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 10) / 2) * (0-(0)));
            yy = 1.23 + (((tickAnim - 10) / 2) * (2.4-(1.23)));
            zz = 0.375 + (((tickAnim - 10) / 2) * (1.21-(0.375)));
        }
        else if (tickAnim >= 12 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 12) / 1) * (0-(0)));
            yy = 2.4 + (((tickAnim - 12) / 1) * (2.58-(2.4)));
            zz = 1.21 + (((tickAnim - 12) / 1) * (1.295-(1.21)));
        }
        else if (tickAnim >= 13 && tickAnim < 16) {
            xx = 0 + (((tickAnim - 13) / 3) * (0-(0)));
            yy = 2.58 + (((tickAnim - 13) / 3) * (1.75-(2.58)));
            zz = 1.295 + (((tickAnim - 13) / 3) * (0.785-(1.295)));
        }
        else if (tickAnim >= 16 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 16) / 4) * (0-(0)));
            yy = 1.75 + (((tickAnim - 16) / 4) * (0.45-(1.75)));
            zz = 0.785 + (((tickAnim - 16) / 4) * (0-(0.785)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.footL.rotationPointX = this.footL.rotationPointX + (float)(xx);
        this.footL.rotationPointY = this.footL.rotationPointY - (float)(yy);
        this.footL.rotationPointZ = this.footL.rotationPointZ + (float)(zz);



        this.setRotateAngle(hips, hips.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5+50))*4), hips.rotateAngleY + (float) Math.toRadians(0), hips.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360+90))*3));
        this.hips.rotationPointX = this.hips.rotationPointX + (float)(0);
        this.hips.rotationPointY = this.hips.rotationPointY - (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5))*1);
        this.hips.rotationPointZ = this.hips.rotationPointZ + (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5-100))*0.3);


        this.setRotateAngle(Tail1, Tail1.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5+150))*-4), Tail1.rotateAngleY + (float) Math.toRadians(0), Tail1.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360+90))*3));


        this.setRotateAngle(Tail2, Tail2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5+250))*4), Tail2.rotateAngleY + (float) Math.toRadians(0), Tail2.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360+150))*-5));


        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5))*-4), body.rotateAngleY + (float) Math.toRadians(0), body.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-50))*3));


        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5-20))*4), chest.rotateAngleY + (float) Math.toRadians(0), chest.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(leftArm, leftArm.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5-20))*-4), leftArm.rotateAngleY + (float) Math.toRadians(0), leftArm.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(leftArm2, leftArm2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5-120))*2), leftArm2.rotateAngleY + (float) Math.toRadians(0), leftArm2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(leftArm3, leftArm3.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5-120))*4), leftArm3.rotateAngleY + (float) Math.toRadians(0), leftArm3.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5-100))*2), neck.rotateAngleY + (float) Math.toRadians(0), neck.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-100))*-2));


        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5-150))*3), neck2.rotateAngleY + (float) Math.toRadians(0), neck2.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-300))*-2));


        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5-90))*-4), neck3.rotateAngleY + (float) Math.toRadians(0), neck3.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5-50))*5), head.rotateAngleY + (float) Math.toRadians(0), head.rotateAngleZ + (float) Math.toRadians(0));



        if (tickAnim >= 0 && tickAnim < 8) {
            xx = -31.95+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-50))*-100 + (((tickAnim - 0) / 8) * (-21.94-(-31.95+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-50))*-100)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = -21.94 + (((tickAnim - 8) / 2) * (-11.5-(-21.94)));
            yy = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 2) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = -11.5 + (((tickAnim - 10) / 10) * (44.55+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-50))*-100-(-11.5)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg, rightLeg.rotateAngleX + (float) Math.toRadians(xx), rightLeg.rotateAngleY + (float) Math.toRadians(yy), rightLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 3 + (((tickAnim - 0) / 7) * (28.075+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-120-(3)));
            yy = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 10) {
            xx = 28.075+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-120 + (((tickAnim - 7) / 3) * (-22.5-(28.075+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-120)));
            yy = 0 + (((tickAnim - 7) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 3) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = -22.5 + (((tickAnim - 10) / 10) * (3-(-22.5)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg2, rightLeg2.rotateAngleX + (float) Math.toRadians(xx), rightLeg2.rotateAngleY + (float) Math.toRadians(yy), rightLeg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 2) * (-0.225-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 2) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 2) / 8) * (0-(0)));
            zz = -0.225 + (((tickAnim - 2) / 8) * (0-(-0.225)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightLeg2.rotationPointX = this.rightLeg2.rotationPointX + (float)(xx);
        this.rightLeg2.rotationPointY = this.rightLeg2.rotationPointY - (float)(yy);
        this.rightLeg2.rotationPointZ = this.rightLeg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 14.25 + (((tickAnim - 0) / 2) * (26.73-(14.25)));
            yy = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 2) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 6) {
            xx = 26.73 + (((tickAnim - 2) / 4) * (-18.58-(26.73)));
            yy = 0 + (((tickAnim - 2) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 2) / 4) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 10) {
            xx = -18.58 + (((tickAnim - 6) / 4) * (21.75-(-18.58)));
            yy = 0 + (((tickAnim - 6) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 4) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 21.75 + (((tickAnim - 10) / 10) * (14.25-(21.75)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg3, rightLeg3.rotateAngleX + (float) Math.toRadians(xx), rightLeg3.rotateAngleY + (float) Math.toRadians(yy), rightLeg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0.375-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 3) / 3) * (0-(0)));
            yy = 0.375 + (((tickAnim - 3) / 3) * (0-(0.375)));
            zz = 0 + (((tickAnim - 3) / 3) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 6) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 6) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightLeg3.rotationPointX = this.rightLeg3.rotationPointX + (float)(xx);
        this.rightLeg3.rotationPointY = this.rightLeg3.rotationPointY - (float)(yy);
        this.rightLeg3.rotationPointZ = this.rightLeg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 18.75 + (((tickAnim - 0) / 2) * (52.96-(18.75)));
            yy = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 2) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 6) {
            xx = 52.96 + (((tickAnim - 2) / 4) * (52.33-(52.96)));
            yy = 0 + (((tickAnim - 2) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 2) / 4) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 10) {
            xx = 52.33 + (((tickAnim - 6) / 4) * (8.23885-(52.33)));
            yy = 0 + (((tickAnim - 6) / 4) * (0.43029-(0)));
            zz = 0 + (((tickAnim - 6) / 4) * (-2.96901-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 12) {
            xx = 8.23885 + (((tickAnim - 10) / 2) * (-8.50743-(8.23885)));
            yy = 0.43029 + (((tickAnim - 10) / 2) * (0.28686-(0.43029)));
            zz = -2.96901 + (((tickAnim - 10) / 2) * (-1.97934-(-2.96901)));
        }
        else if (tickAnim >= 12 && tickAnim < 15) {
            xx = -8.50743 + (((tickAnim - 12) / 3) * (-30-(-8.50743)));
            yy = 0.28686 + (((tickAnim - 12) / 3) * (0-(0.28686)));
            zz = -1.97934 + (((tickAnim - 12) / 3) * (0-(-1.97934)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = -30 + (((tickAnim - 15) / 5) * (18.75-(-30)));
            yy = 0 + (((tickAnim - 15) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(footL2, footL2.rotateAngleX + (float) Math.toRadians(xx), footL2.rotateAngleY + (float) Math.toRadians(yy), footL2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            yy = 1.23 + (((tickAnim - 0) / 2) * (2.4-(1.23)));
            zz = 0.375 + (((tickAnim - 0) / 2) * (1.21-(0.375)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 2) / 1) * (0-(0)));
            yy = 2.4 + (((tickAnim - 2) / 1) * (2.58-(2.4)));
            zz = 1.21 + (((tickAnim - 2) / 1) * (1.295-(1.21)));
        }
        else if (tickAnim >= 3 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 3) / 3) * (0-(0)));
            yy = 2.58 + (((tickAnim - 3) / 3) * (1.75-(2.58)));
            zz = 1.295 + (((tickAnim - 3) / 3) * (0.785-(1.295)));
        }
        else if (tickAnim >= 6 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 6) / 4) * (0-(0)));
            yy = 1.75 + (((tickAnim - 6) / 4) * (0.775-(1.75)));
            zz = 0.785 + (((tickAnim - 6) / 4) * (0-(0.785)));
        }
        else if (tickAnim >= 10 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 10) / 2) * (0-(0)));
            yy = 0.775 + (((tickAnim - 10) / 2) * (1.145-(0.775)));
            zz = 0 + (((tickAnim - 10) / 2) * (0.385-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 12) / 1) * (0-(0)));
            yy = 1.145 + (((tickAnim - 12) / 1) * (1.145-(1.145)));
            zz = 0.385 + (((tickAnim - 12) / 1) * (0.385-(0.385)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 13) / 2) * (0-(0)));
            yy = 1.145 + (((tickAnim - 13) / 2) * (1.515-(1.145)));
            zz = 0.385 + (((tickAnim - 13) / 2) * (0.465-(0.385)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 15) / 5) * (0-(0)));
            yy = 1.515 + (((tickAnim - 15) / 5) * (1.23-(1.515)));
            zz = 0.465 + (((tickAnim - 15) / 5) * (0.375-(0.465)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.footL2.rotationPointX = this.footL2.rotationPointX + (float)(xx);
        this.footL2.rotationPointY = this.footL2.rotationPointY - (float)(yy);
        this.footL2.rotationPointZ = this.footL2.rotationPointZ + (float)(zz);



        this.setRotateAngle(rightArm, rightArm.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5-20))*-4), rightArm.rotateAngleY + (float) Math.toRadians(0), rightArm.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(rightArm2, rightArm2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5-120))*-2), rightArm2.rotateAngleY + (float) Math.toRadians(0), rightArm2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(rightArm3, rightArm3.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5-120))*4), rightArm3.rotateAngleY + (float) Math.toRadians(0), rightArm3.rotateAngleZ + (float) Math.toRadians(0));
        
    }

    public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        EntityPrehistoricFloraEosinopteryx e = (EntityPrehistoricFloraEosinopteryx) entity;
        animator.update(entity);

    }
}
