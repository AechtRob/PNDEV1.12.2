package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.EntityPrehistoricFloraXinjiangtitan;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;

public class ModelXinjiangtitan extends ModelBasePalaeopedia {
    private final AdvancedModelRenderer Xinjiangtitan;
    private final AdvancedModelRenderer hips;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer tail1;
    private final AdvancedModelRenderer tail2;
    private final AdvancedModelRenderer tail3;
    private final AdvancedModelRenderer tail4;
    private final AdvancedModelRenderer tail5;
    private final AdvancedModelRenderer tail6;
    private final AdvancedModelRenderer tail7;
    private final AdvancedModelRenderer body;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer chest;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer cube_r6;
    private final AdvancedModelRenderer cube_r7;
    private final AdvancedModelRenderer leftArm1;
    private final AdvancedModelRenderer leftArm2;
    private final AdvancedModelRenderer leftHand;
    private final AdvancedModelRenderer cube_r8;
    private final AdvancedModelRenderer rightArm1;
    private final AdvancedModelRenderer rightArm2;
    private final AdvancedModelRenderer rightHand;
    private final AdvancedModelRenderer cube_r9;
    private final AdvancedModelRenderer neck1;
    private final AdvancedModelRenderer neck2;
    private final AdvancedModelRenderer neck3;
    private final AdvancedModelRenderer neck4;
    private final AdvancedModelRenderer neck5;
    private final AdvancedModelRenderer neck6;
    private final AdvancedModelRenderer neck7;
    private final AdvancedModelRenderer neck8;
    private final AdvancedModelRenderer head;
    private final AdvancedModelRenderer cube_r10;
    private final AdvancedModelRenderer cube_r11;
    private final AdvancedModelRenderer cube_r12;
    private final AdvancedModelRenderer cube_r13;
    private final AdvancedModelRenderer cube_r14;
    private final AdvancedModelRenderer cube_r15;
    private final AdvancedModelRenderer cube_r16;
    private final AdvancedModelRenderer cube_r17;
    private final AdvancedModelRenderer jaw;
    private final AdvancedModelRenderer cube_r18;
    private final AdvancedModelRenderer cube_r19;
    private final AdvancedModelRenderer cube_r20;
    private final AdvancedModelRenderer cube_r21;
    private final AdvancedModelRenderer cube_r22;
    private final AdvancedModelRenderer cube_r23;
    private final AdvancedModelRenderer cube_r24;
    private final AdvancedModelRenderer cube_r25;
    private final AdvancedModelRenderer cube_r26;
    private final AdvancedModelRenderer throat;
    private final AdvancedModelRenderer cube_r27;
    private final AdvancedModelRenderer cube_r28;
    private final AdvancedModelRenderer leftLeg1;
    private final AdvancedModelRenderer leftLeg2;
    private final AdvancedModelRenderer leftFoot;
    private final AdvancedModelRenderer leftToes;
    private final AdvancedModelRenderer cube_r29;
    private final AdvancedModelRenderer rightLeg1;
    private final AdvancedModelRenderer rightLeg2;
    private final AdvancedModelRenderer rightFoot;
    private final AdvancedModelRenderer rightToes;
    private final AdvancedModelRenderer cube_r30;

    private ModelAnimator animator;

    public ModelXinjiangtitan() {
        this.textureWidth = 400;
        this.textureHeight = 400;

        this.Xinjiangtitan = new AdvancedModelRenderer(this);
        this.Xinjiangtitan.setRotationPoint(0.0F, -22.0F, 26.0F);


        this.hips = new AdvancedModelRenderer(this);
        this.hips.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Xinjiangtitan.addChild(hips);


        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(0.0F, 12.5F, 10.75F);
        this.hips.addChild(cube_r1);
        this.setRotateAngle(cube_r1, -0.3054F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 251, 209, -13.0F, -24.0F, -28.0F, 26, 18, 21, 0.0F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(-0.5F, 17.0F, 16.0F);
        this.hips.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.2182F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 198, 0, -15.0F, -29.0F, -30.0F, 31, 29, 28, 0.0F, false));

        this.tail1 = new AdvancedModelRenderer(this);
        this.tail1.setRotationPoint(0.0F, -4.25F, 9.0F);
        this.hips.addChild(tail1);
        this.setRotateAngle(tail1, -0.3054F, 0.0F, 0.0F);
        this.tail1.cubeList.add(new ModelBox(tail1, 214, 89, -10.5F, -7.75F, -5.0F, 21, 26, 25, 0.0F, false));

        this.tail2 = new AdvancedModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, -0.5F, 18.0F);
        this.tail1.addChild(tail2);
        this.setRotateAngle(tail2, -0.0436F, 0.0F, 0.0F);
        this.tail2.cubeList.add(new ModelBox(tail2, 117, 0, -8.0F, -6.75F, -2.0F, 16, 18, 21, 0.0F, false));

        this.tail3 = new AdvancedModelRenderer(this);
        this.tail3.setRotationPoint(0.0F, -1.5F, 18.0F);
        this.tail2.addChild(tail3);
        this.setRotateAngle(tail3, 0.1309F, 0.0F, 0.0F);
        this.tail3.cubeList.add(new ModelBox(tail3, 259, 141, -5.5F, -4.75F, -3.0F, 11, 11, 20, 0.0F, false));

        this.tail4 = new AdvancedModelRenderer(this);
        this.tail4.setRotationPoint(0.0F, -1.75F, 16.0F);
        this.tail3.addChild(tail4);
        this.setRotateAngle(tail4, 0.0873F, 0.0F, 0.0F);
        this.tail4.cubeList.add(new ModelBox(tail4, 239, 58, -3.5F, -2.75F, -3.0F, 7, 7, 22, 0.0F, false));

        this.tail5 = new AdvancedModelRenderer(this);
        this.tail5.setRotationPoint(0.0F, -1.0F, 18.0F);
        this.tail4.addChild(tail5);
        this.setRotateAngle(tail5, 0.0873F, 0.0F, 0.0F);
        this.tail5.cubeList.add(new ModelBox(tail5, 289, 0, -2.5F, -1.5F, -2.0F, 5, 5, 20, 0.0F, false));

        this.tail6 = new AdvancedModelRenderer(this);
        this.tail6.setRotationPoint(0.0F, 0.25F, 18.0F);
        this.tail5.addChild(tail6);
        this.setRotateAngle(tail6, 0.0436F, 0.0F, 0.0F);
        this.tail6.cubeList.add(new ModelBox(tail6, 89, 94, -1.5F, -1.5F, -1.0F, 3, 3, 20, 0.0F, false));

        this.tail7 = new AdvancedModelRenderer(this);
        this.tail7.setRotationPoint(0.0F, -0.25F, 19.0F);
        this.tail6.addChild(tail7);
        this.setRotateAngle(tail7, -0.0873F, 0.0F, 0.0F);
        this.tail7.cubeList.add(new ModelBox(tail7, 226, 279, -1.0F, -1.0F, -2.0F, 2, 2, 20, 0.0F, false));
        this.tail7.cubeList.add(new ModelBox(tail7, 26, 83, -1.5F, -1.5F, 18.0F, 3, 3, 5, 0.0F, false));

        this.body = new AdvancedModelRenderer(this);
        this.body.setRotationPoint(0.0F, -7.0F, -8.0F);
        this.hips.addChild(body);


        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(0.0F, -5.15F, -8.75F);
        this.body.addChild(cube_r3);
        this.setRotateAngle(cube_r3, -0.48F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 99, 127, -16.0F, -11.0F, -27.0F, 32, 21, 34, 0.0F, false));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(-0.5F, 30.0F, -9.5F);
        this.body.addChild(cube_r4);
        this.setRotateAngle(cube_r4, -0.1134F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 0, 0, -18.0F, -40.0F, -33.0F, 37, 40, 42, 0.0F, false));

        this.chest = new AdvancedModelRenderer(this);
        this.chest.setRotationPoint(0.0F, -13.0F, -31.0F);
        this.body.addChild(chest);


        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(0.0F, 12.0F, -18.0F);
        this.chest.addChild(cube_r5);
        this.setRotateAngle(cube_r5, -0.5672F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 78, 251, -13.0F, -33.0F, -10.0F, 26, 25, 21, 0.0F, false));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(0.0F, 22.0F, -31.0F);
        this.chest.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.0873F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 0, 223, -14.0F, -24.0F, 0.0F, 28, 24, 21, 0.0F, false));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(0.5F, 32.0F, -17.0F);
        this.chest.addChild(cube_r7);
        this.setRotateAngle(cube_r7, -0.6109F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 0, 161, -16.0F, -33.0F, -17.0F, 31, 33, 28, 0.0F, false));

        this.leftArm1 = new AdvancedModelRenderer(this);
        this.leftArm1.setRotationPoint(15.0F, 25.0F, -15.5F);
        this.chest.addChild(leftArm1);
        this.setRotateAngle(leftArm1, 0.0873F, 0.0F, 0.0F);
        this.leftArm1.cubeList.add(new ModelBox(leftArm1, 286, 76, -5.0F, -5.0F, -6.0F, 10, 25, 12, 0.0F, false));

        this.leftArm2 = new AdvancedModelRenderer(this);
        this.leftArm2.setRotationPoint(0.0F, 20.0F, 0.0F);
        this.leftArm1.addChild(leftArm2);
        this.setRotateAngle(leftArm2, -0.3054F, 0.0F, 0.0F);
        this.leftArm2.cubeList.add(new ModelBox(leftArm2, 0, 83, -4.0F, -2.0F, -4.5F, 8, 17, 9, 0.0F, false));

        this.leftHand = new AdvancedModelRenderer(this);
        this.leftHand.setRotationPoint(0.0F, 15.0F, 0.0F);
        this.leftArm2.addChild(leftHand);
        this.setRotateAngle(leftHand, 0.2182F, 0.0F, 0.0F);
        this.leftHand.cubeList.add(new ModelBox(leftHand, 0, 110, -5.0F, -2.25F, -3.5F, 10, 9, 7, 0.0F, false));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(-5.0F, 1.75F, -0.5F);
        this.leftHand.addChild(cube_r8);
        this.setRotateAngle(cube_r8, -0.4064F, 0.4073F, -0.8268F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 89, 109, -5.0F, 0.0F, 0.0F, 5, 2, 2, 0.0F, false));

        this.rightArm1 = new AdvancedModelRenderer(this);
        this.rightArm1.setRotationPoint(-15.0F, 25.0F, -15.5F);
        this.chest.addChild(rightArm1);
        this.setRotateAngle(rightArm1, 0.0873F, 0.0F, 0.0F);
        this.rightArm1.cubeList.add(new ModelBox(rightArm1, 286, 76, -5.0F, -5.0F, -6.0F, 10, 25, 12, 0.0F, true));

        this.rightArm2 = new AdvancedModelRenderer(this);
        this.rightArm2.setRotationPoint(0.0F, 20.0F, 0.0F);
        this.rightArm1.addChild(rightArm2);
        this.setRotateAngle(rightArm2, -0.3054F, 0.0F, 0.0F);
        this.rightArm2.cubeList.add(new ModelBox(rightArm2, 0, 83, -4.0F, -2.0F, -4.5F, 8, 17, 9, 0.0F, true));

        this.rightHand = new AdvancedModelRenderer(this);
        this.rightHand.setRotationPoint(0.0F, 15.0F, 0.0F);
        this.rightArm2.addChild(rightHand);
        this.setRotateAngle(rightHand, 0.2182F, 0.0F, 0.0F);
        this.rightHand.cubeList.add(new ModelBox(rightHand, 0, 110, -5.0F, -2.25F, -3.5F, 10, 9, 7, 0.0F, true));

        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(5.0F, 1.75F, -0.5F);
        this.rightHand.addChild(cube_r9);
        this.setRotateAngle(cube_r9, -0.4064F, -0.4073F, 0.8268F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 89, 109, 0.0F, 0.0F, 0.0F, 5, 2, 2, 0.0F, true));

        this.neck1 = new AdvancedModelRenderer(this);
        this.neck1.setRotationPoint(0.0F, -7.0F, -17.0F);
        this.chest.addChild(neck1);
        this.setRotateAngle(neck1, -0.7854F, 0.0F, 0.0F);
        this.neck1.cubeList.add(new ModelBox(neck1, 0, 83, -11.0F, -16.0F, -38.0F, 22, 33, 44, 0.0F, false));

        this.neck2 = new AdvancedModelRenderer(this);
        this.neck2.setRotationPoint(0.0F, -1.75F, -38.0F);
        this.neck1.addChild(neck2);
        this.setRotateAngle(neck2, -0.2618F, 0.0F, 0.0F);
        this.neck2.cubeList.add(new ModelBox(neck2, 118, 42, -9.5F, -14.0F, -35.0F, 19, 30, 41, 0.0F, false));

        this.neck3 = new AdvancedModelRenderer(this);
        this.neck3.setRotationPoint(0.0F, -2.75F, -33.0F);
        this.neck2.addChild(neck3);
        this.setRotateAngle(neck3, -0.0873F, 0.0F, 0.0F);
        this.neck3.cubeList.add(new ModelBox(neck3, 119, 183, -8.0F, -11.0F, -36.0F, 16, 28, 39, 0.0F, false));

        this.neck4 = new AdvancedModelRenderer(this);
        this.neck4.setRotationPoint(0.0F, 1.25F, -36.0F);
        this.neck3.addChild(neck4);
        this.setRotateAngle(neck4, -0.0436F, 0.0F, 0.0F);
        this.neck4.cubeList.add(new ModelBox(neck4, 196, 147, -6.5F, -12.0F, -33.0F, 13, 25, 36, 0.0F, false));

        this.neck5 = new AdvancedModelRenderer(this);
        this.neck5.setRotationPoint(0.0F, -0.75F, -33.0F);
        this.neck4.addChild(neck5);
        this.setRotateAngle(neck5, -0.0436F, 0.0F, 0.0F);
        this.neck5.cubeList.add(new ModelBox(neck5, 197, 218, -5.0F, -11.0F, -30.0F, 10, 22, 33, 0.0F, false));

        this.neck6 = new AdvancedModelRenderer(this);
        this.neck6.setRotationPoint(0.0F, -0.75F, -30.0F);
        this.neck5.addChild(neck6);
        this.setRotateAngle(neck6, 0.1309F, 0.0F, 0.0F);
        this.neck6.cubeList.add(new ModelBox(neck6, 254, 249, -4.0F, -10.0F, -28.0F, 8, 19, 30, 0.0F, false));

        this.neck7 = new AdvancedModelRenderer(this);
        this.neck7.setRotationPoint(0.0F, -2.5F, -28.0F);
        this.neck6.addChild(neck7);
        this.setRotateAngle(neck7, 0.3054F, 0.0F, 0.0F);
        this.neck7.cubeList.add(new ModelBox(neck7, 0, 269, -3.0F, -7.0F, -26.0F, 6, 15, 29, 0.0F, false));

        this.neck8 = new AdvancedModelRenderer(this);
        this.neck8.setRotationPoint(0.0F, -1.25F, -26.0F);
        this.neck7.addChild(neck8);
        this.setRotateAngle(neck8, 0.48F, 0.0F, 0.0F);
        this.neck8.cubeList.add(new ModelBox(neck8, 119, 183, -2.5F, -5.0F, -9.0F, 5, 8, 12, 0.0F, false));

        this.head = new AdvancedModelRenderer(this);
        this.head.setRotationPoint(-0.5F, -2.5F, -7.25F);
        this.neck8.addChild(head);
        this.setRotateAngle(head, 0.48F, 0.0F, 0.0F);
        this.head.cubeList.add(new ModelBox(head, 117, 0, -2.0F, -1.6839F, -9.7548F, 5, 4, 5, 0.0F, false));
        this.head.cubeList.add(new ModelBox(head, 22, 36, -2.0F, 2.2661F, -9.7548F, 5, 1, 4, -0.02F, false));

        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(0.5F, -3.4478F, -6.9823F);
        this.head.addChild(cube_r10);
        this.setRotateAngle(cube_r10, -1.4573F, 0.0F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 179, 114, -2.0F, -2.0F, 0.0F, 4, 2, 2, 0.01F, false));

        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(0.5F, -2.571F, -8.7799F);
        this.head.addChild(cube_r11);
        this.setRotateAngle(cube_r11, -1.117F, 0.0F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 0, 182, -2.0F, -2.0F, 0.0F, 4, 2, 2, 0.0F, false));

        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(0.5F, -0.3922F, -12.1349F);
        this.head.addChild(cube_r12);
        this.setRotateAngle(cube_r12, -1.0036F, 0.0F, 0.0F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 0, 0, -1.5F, -4.0F, 0.0F, 3, 4, 2, 0.0F, false));

        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(0.5F, 3.0114F, -9.5307F);
        this.head.addChild(cube_r13);
        this.setRotateAngle(cube_r13, 0.0436F, 0.0F, 0.0F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 0, 177, -2.0F, -1.0F, 0.0F, 4, 1, 3, 0.0F, false));

        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(0.5F, 3.0114F, -9.5307F);
        this.head.addChild(cube_r14);
        this.setRotateAngle(cube_r14, -0.2182F, 0.0F, 0.0F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 171, 5, -1.5F, -1.0F, -3.0F, 3, 1, 3, 0.0F, false));

        this.cube_r15 = new AdvancedModelRenderer(this);
        this.cube_r15.setRotationPoint(0.5F, 2.3161F, -9.7548F);
        this.head.addChild(cube_r15);
        this.setRotateAngle(cube_r15, -0.2618F, 0.0F, 0.0F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 164, 114, -2.0F, -2.0F, -3.0F, 4, 2, 3, 0.0F, false));

        this.cube_r16 = new AdvancedModelRenderer(this);
        this.cube_r16.setRotationPoint(1.0F, 3.2661F, -9.7548F);
        this.head.addChild(cube_r16);
        this.setRotateAngle(cube_r16, -0.3054F, 0.0F, 0.0F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 30, 4, -2.5F, -1.0F, -3.3F, 4, 1, 1, -0.03F, false));
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 12, 179, -2.5F, -1.0F, -3.0F, 4, 1, 3, -0.02F, false));

        this.cube_r17 = new AdvancedModelRenderer(this);
        this.cube_r17.setRotationPoint(0.5F, -3.5F, -5.75F);
        this.head.addChild(cube_r17);
        this.setRotateAngle(cube_r17, -0.1309F, 0.0F, 0.0F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 130, 114, -3.0F, -0.25F, 0.5F, 6, 6, 6, 0.0F, false));

        this.jaw = new AdvancedModelRenderer(this);
        this.jaw.setRotationPoint(0.5F, 2.984F, -0.5519F);
        this.head.addChild(jaw);
        this.setRotateAngle(jaw, -0.3622F, 0.0F, 0.0F);


        this.cube_r18 = new AdvancedModelRenderer(this);
        this.cube_r18.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.jaw.addChild(cube_r18);
        this.setRotateAngle(cube_r18, 0.3054F, 0.0F, 0.0F);
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 89, 118, -3.0F, -0.5F, -5.5F, 6, 2, 6, -0.02F, false));

        this.cube_r19 = new AdvancedModelRenderer(this);
        this.cube_r19.setRotationPoint(0.0F, 1.177F, -5.3958F);
        this.jaw.addChild(cube_r19);
        this.setRotateAngle(cube_r19, 1.4835F, 0.0F, 0.0F);
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 89, 93, -3.0F, 0.0F, -0.05F, 6, 5, 3, -0.03F, false));

        this.cube_r20 = new AdvancedModelRenderer(this);
        this.cube_r20.setRotationPoint(0.0F, 1.8464F, -9.0472F);
        this.jaw.addChild(cube_r20);
        this.setRotateAngle(cube_r20, 0.3316F, 0.0F, 0.0F);
        this.cube_r20.cubeList.add(new ModelBox(cube_r20, 1, 36, -2.5F, 0.1F, 0.0F, 5, 1, 4, -0.03F, false));

        this.cube_r21 = new AdvancedModelRenderer(this);
        this.cube_r21.setRotationPoint(0.0F, 3.534F, -11.6524F);
        this.jaw.addChild(cube_r21);
        this.setRotateAngle(cube_r21, 0.4189F, 0.0F, 0.0F);
        this.cube_r21.cubeList.add(new ModelBox(cube_r21, 30, 0, -2.0F, -0.35F, 2.15F, 4, 1, 1, -0.05F, false));
        this.cube_r21.cubeList.add(new ModelBox(cube_r21, 149, 114, -2.0F, -0.35F, -0.15F, 4, 1, 3, -0.04F, false));

        this.cube_r22 = new AdvancedModelRenderer(this);
        this.cube_r22.setRotationPoint(0.0F, 4.5428F, -8.0161F);
        this.jaw.addChild(cube_r22);
        this.setRotateAngle(cube_r22, 0.576F, 0.0F, 0.0F);
        this.cube_r22.cubeList.add(new ModelBox(cube_r22, 108, 118, -2.0F, -1.0F, -3.2F, 4, 1, 4, -0.03F, false));

        this.cube_r23 = new AdvancedModelRenderer(this);
        this.cube_r23.setRotationPoint(0.0F, 2.6819F, -8.7759F);
        this.jaw.addChild(cube_r23);
        this.setRotateAngle(cube_r23, 0.288F, 0.0F, 0.0F);
        this.cube_r23.cubeList.add(new ModelBox(cube_r23, 0, 7, -2.0F, 0.0F, -0.8F, 4, 2, 1, -0.01F, false));
        this.cube_r23.cubeList.add(new ModelBox(cube_r23, 155, 120, -2.0F, 0.0F, -3.15F, 4, 2, 3, 0.0F, false));

        this.cube_r24 = new AdvancedModelRenderer(this);
        this.cube_r24.setRotationPoint(0.0F, 2.5192F, -8.4105F);
        this.jaw.addChild(cube_r24);
        this.setRotateAngle(cube_r24, 0.3316F, 0.0F, 0.0F);
        this.cube_r24.cubeList.add(new ModelBox(cube_r24, 171, 0, -1.5F, -0.75F, -3.0F, 3, 1, 3, 0.0F, false));

        this.cube_r25 = new AdvancedModelRenderer(this);
        this.cube_r25.setRotationPoint(0.0F, 1.8341F, -8.7156F);
        this.jaw.addChild(cube_r25);
        this.setRotateAngle(cube_r25, 0.4189F, 0.0F, 0.0F);
        this.cube_r25.cubeList.add(new ModelBox(cube_r25, 170, 120, -2.0F, 0.0F, 0.0F, 4, 1, 3, 0.0F, false));

        this.cube_r26 = new AdvancedModelRenderer(this);
        this.cube_r26.setRotationPoint(0.0F, 1.177F, -5.3958F);
        this.jaw.addChild(cube_r26);
        this.setRotateAngle(cube_r26, 0.4189F, 0.0F, 0.0F);
        this.cube_r26.cubeList.add(new ModelBox(cube_r26, 89, 102, -2.5F, 0.0F, -3.8F, 5, 2, 4, -0.01F, false));

        this.throat = new AdvancedModelRenderer(this);
        this.throat.setRotationPoint(0.5F, 4.1226F, -7.0946F);
        this.jaw.addChild(throat);
        this.setRotateAngle(throat, 0.2618F, 0.0F, 0.0F);


        this.cube_r27 = new AdvancedModelRenderer(this);
        this.cube_r27.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.throat.addChild(cube_r27);
        this.setRotateAngle(cube_r27, -0.4887F, 0.0F, 0.0F);
        this.cube_r27.cubeList.add(new ModelBox(cube_r27, 28, 110, -2.5F, -5.0F, 0.95F, 4, 3, 3, 0.0F, false));
        this.cube_r27.cubeList.add(new ModelBox(cube_r27, 117, 10, -2.5F, -2.0F, -0.05F, 4, 2, 4, 0.0F, false));

        this.cube_r28 = new AdvancedModelRenderer(this);
        this.cube_r28.setRotationPoint(0.0F, 1.0751F, 2.8007F);
        this.throat.addChild(cube_r28);
        this.setRotateAngle(cube_r28, -0.8465F, 0.0F, 0.0F);
        this.cube_r28.cubeList.add(new ModelBox(cube_r28, 0, 161, -2.5F, -6.0F, -2.05F, 4, 6, 9, -0.01F, false));

        this.leftLeg1 = new AdvancedModelRenderer(this);
        this.leftLeg1.setRotationPoint(11.5F, 0.0F, 0.0F);
        this.Xinjiangtitan.addChild(leftLeg1);
        this.setRotateAngle(leftLeg1, -0.2618F, 0.0F, 0.0F);
        this.leftLeg1.cubeList.add(new ModelBox(leftLeg1, 173, 274, -2.0F, -8.0F, -7.0F, 11, 34, 15, 0.0F, false));

        this.leftLeg2 = new AdvancedModelRenderer(this);
        this.leftLeg2.setRotationPoint(0.0F, 26.0F, -1.0F);
        this.leftLeg1.addChild(leftLeg2);
        this.setRotateAngle(leftLeg2, 0.4363F, 0.0F, 0.0F);
        this.leftLeg2.cubeList.add(new ModelBox(leftLeg2, 0, 0, -1.0F, -3.0F, -5.0F, 9, 23, 11, 0.0F, false));

        this.leftFoot = new AdvancedModelRenderer(this);
        this.leftFoot.setRotationPoint(0.0F, 16.5F, 0.0F);
        this.leftLeg2.addChild(leftFoot);
        this.setRotateAngle(leftFoot, -0.1745F, 0.0F, 0.0F);
        this.leftFoot.cubeList.add(new ModelBox(leftFoot, 171, 0, -2.0F, 0.0F, -6.5F, 11, 5, 13, 0.0F, false));

        this.leftToes = new AdvancedModelRenderer(this);
        this.leftToes.setRotationPoint(3.5F, 0.0F, -6.5F);
        this.leftFoot.addChild(leftToes);


        this.cube_r29 = new AdvancedModelRenderer(this);
        this.cube_r29.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.leftToes.addChild(cube_r29);
        this.setRotateAngle(cube_r29, 0.0F, -0.2182F, 0.0F);
        this.cube_r29.cubeList.add(new ModelBox(cube_r29, 89, 83, -4.5F, 0.0F, -3.0F, 9, 5, 4, -0.01F, false));

        this.rightLeg1 = new AdvancedModelRenderer(this);
        this.rightLeg1.setRotationPoint(-11.5F, 0.0F, 0.0F);
        this.Xinjiangtitan.addChild(rightLeg1);
        this.setRotateAngle(rightLeg1, -0.2618F, 0.0F, 0.0F);
        this.rightLeg1.cubeList.add(new ModelBox(rightLeg1, 173, 274, -9.0F, -8.0F, -7.0F, 11, 34, 15, 0.0F, true));

        this.rightLeg2 = new AdvancedModelRenderer(this);
        this.rightLeg2.setRotationPoint(0.0F, 26.0F, -1.0F);
        this.rightLeg1.addChild(rightLeg2);
        this.setRotateAngle(rightLeg2, 0.4363F, 0.0F, 0.0F);
        this.rightLeg2.cubeList.add(new ModelBox(rightLeg2, 0, 0, -8.0F, -3.0F, -5.0F, 9, 23, 11, 0.0F, true));

        this.rightFoot = new AdvancedModelRenderer(this);
        this.rightFoot.setRotationPoint(0.0F, 16.5F, 0.0F);
        this.rightLeg2.addChild(rightFoot);
        this.setRotateAngle(rightFoot, -0.1745F, 0.0F, 0.0F);
        this.rightFoot.cubeList.add(new ModelBox(rightFoot, 171, 0, -9.0F, 0.0F, -6.5F, 11, 5, 13, 0.0F, true));

        this.rightToes = new AdvancedModelRenderer(this);
        this.rightToes.setRotationPoint(-3.5F, 0.0F, -6.5F);
        this.rightFoot.addChild(rightToes);


        this.cube_r30 = new AdvancedModelRenderer(this);
        this.cube_r30.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.rightToes.addChild(cube_r30);
        this.setRotateAngle(cube_r30, 0.0F, 0.2182F, 0.0F);
        this.cube_r30.cubeList.add(new ModelBox(cube_r30, 89, 83, -4.5F, 0.0F, -3.0F, 9, 5, 4, -0.01F, true));

        updateDefaultPose();
        animator = ModelAnimator.create();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        animate((IAnimatedEntity) entity, f, f1, f2, f3, f4, f5);
        this.Xinjiangtitan.render(f5);
    }
    public void renderStaticWall(float f) {
        this.neck1.rotateAngleX = (float) Math.toRadians(90);

        this.neck1.offsetY = -0F;
        this.neck1.offsetX = -0F;
        this.neck1.offsetZ = 0.04F;
        this.neck1.render(0.01F);
        resetToDefaultPose();
    }
    public void renderStaticFloor(float f) {

        this.Xinjiangtitan.offsetY = -0.155F;
        this.Xinjiangtitan.render(0.01F);
        resetToDefaultPose();
    }

    @Override
    public void renderStaticBook(float f) {
        //Rotations, positions and sizing:
        this.Xinjiangtitan.offsetY = -0.2F;
        this.Xinjiangtitan.offsetX = 0.2F;
        this.Xinjiangtitan.offsetZ = 2.0F;
        this.Xinjiangtitan.rotateAngleY = (float)Math.toRadians(225);
        this.Xinjiangtitan.rotateAngleX = (float)Math.toRadians(8);
        this.Xinjiangtitan.rotateAngleZ = (float)Math.toRadians(-8);
        this.Xinjiangtitan.scaleChildren = true;
        float scaler = 0.3F;
        this.Xinjiangtitan.setScale(scaler, scaler, scaler);
        //Start of pose:

        //End of pose, now render the model:
        this.Xinjiangtitan.render(f);
        //Reset rotations, positions and sizing:
        this.Xinjiangtitan.setScale(1.0F, 1.0F, 1.0F);
        this.Xinjiangtitan.scaleChildren = false;
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

        EntityPrehistoricFloraXinjiangtitan Xinjiangtitan = (EntityPrehistoricFloraXinjiangtitan) e;

//        this.faceTarget(f3, f4, 6, neck1);
//        this.faceTarget(f3, f4, 6, neck2);
//        this.faceTarget(f3, f4, 6, neck3);
//        this.faceTarget(f3, f4, 4, neck4);
//        this.faceTarget(f3, f4, 4, neck5);
//        this.faceTarget(f3, f4, 4, head);

        boolean isBaby = Xinjiangtitan.getJuvenile();

        if (isBaby) {
            this.neck5.scaleChildren = true;
            this.neck6.scaleChildren = true;
            this.head.scaleChildren = true;
            this.neck5.setScale(1.025F, 1.025F, 1.025F);
            this.neck6.setScale(1.025F, 1.025F, 1.025F);
            this.head.setScale(1.375F, 1.375F, 1.375F);
        }
        else {
            this.neck4.scaleChildren = true;
            this.neck5.scaleChildren = true;
            this.head.scaleChildren = true;
            this.neck5.setScale(1F, 1, 1F);
            this.neck6.setScale(1F, 1, 1F);
            this.head.setScale(1F, 1, 1F);
        }

        AdvancedModelRenderer[] Tail = {this.tail1, this.tail2, this.tail3, this.tail4, this.tail5, this.tail6, this.tail7};
        AdvancedModelRenderer[] Neck = {this.neck1, this.neck2, this.neck3, this.neck4, this.neck5, this.neck6, this.head};
        //AdvancedModelRenderer[] ArmL = {this.leftarm, this.leftarm2, this.leftarm3};
        //AdvancedModelRenderer[] ArmR = {this.rightarm, this.rightarm2, this.rightarm3};

        Xinjiangtitan.tailBuffer.applyChainSwingBuffer(Tail);
        float masterSpeed = Xinjiangtitan.getTravelSpeed()/2;

        if (!Xinjiangtitan.isInWater()) {

            if (f3 == 0.0F || !Xinjiangtitan.getIsMoving()) {
                if (Xinjiangtitan.getAnimation() != Xinjiangtitan.EAT_ANIMATION
                        && Xinjiangtitan.getAnimation() != Xinjiangtitan.DRINK_ANIMATION
                        && Xinjiangtitan.getAnimation() != Xinjiangtitan.ATTACK_ANIMATION) {
                    this.chainFlap(Neck, 0.05F, 0.02F, 0.5, f2, 0.8F);
                    this.chainWave(Neck, 0.05F * 2, -0.01F, 0.5F, f2, 0.8F);
                }

                if (Xinjiangtitan.getAnimation() != Xinjiangtitan.ATTACK_ANIMATION) {
                    this.chainFlap(Tail, (0.15F * 0.1F), 0.05F, 0.2F, f2, 1F);
                    this.chainWave(Tail, (0.15F * 0.1F) * 2F, 0.05F * 0.15F, 0.12F, f2, 1F);
                    this.chainSwing(Tail, (0.15F * 0.1F) * 8F, 0.05F * 0.15F, 0F, f2, 1F);
                }

                return;
            }

            if (Xinjiangtitan.getAnimation() != Xinjiangtitan.EAT_ANIMATION
                    && Xinjiangtitan.getAnimation() != Xinjiangtitan.DRINK_ANIMATION
                    && Xinjiangtitan.getAnimation() != Xinjiangtitan.ATTACK_ANIMATION
                    && Xinjiangtitan.getAnimation() != Xinjiangtitan.ATTACK_ANIMATION) {
                this.chainFlap(Neck, 0.05F, 0.02F, 0.5, f2, 0.8F);
                this.chainWave(Neck, 0.05F * 2, -0.01F, 0.5F, f2, 0.8F);
                this.chainFlap(Tail, (0.15F * 0.1F), 0.05F, 0.2F, f2, 1F);
                this.chainWave(Tail, (0.15F * 0.1F) * 2F, 0.05F * 0.15F, 0.12F, f2, 1F);
                this.chainSwing(Tail, (0.15F * 0.1F) * 8F, 0.05F * 0.15F, 0F, f2, 1F);
            }

            if (Xinjiangtitan.getIsFast()) { //Running
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
        EntityPrehistoricFloraXinjiangtitan ee = (EntityPrehistoricFloraXinjiangtitan) entitylivingbaseIn;

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
            //animAttack(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.MAKE_NEST_ANIMATION) {
            animNest(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.LAY_ANIMATION) {
            animLay(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.ROAR_ANIMATION) { //The roar anim
            animNoise(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.GRAZE_ANIMATION) { //The leaves grazing anim
            animGraze(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }


    }

    public void animGraze(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraXinjiangtitan entity = (EntityPrehistoricFloraXinjiangtitan) entitylivingbaseIn;
        int animCycle = 340;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 45) {
            xx = 0 + (((tickAnim - 20) / 25) * (-3-(0)));
            yy = 0 + (((tickAnim - 20) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 25) * (0-(0)));
        }
        else if (tickAnim >= 45 && tickAnim < 85) {
            xx = -3 + (((tickAnim - 45) / 40) * (-3-(-3)));
            yy = 0 + (((tickAnim - 45) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 45) / 40) * (0-(0)));
        }
        else if (tickAnim >= 85 && tickAnim < 117) {
            xx = -3 + (((tickAnim - 85) / 32) * (3-(-3)));
            yy = 0 + (((tickAnim - 85) / 32) * (0-(0)));
            zz = 0 + (((tickAnim - 85) / 32) * (0-(0)));
        }
        else if (tickAnim >= 117 && tickAnim < 138) {
            xx = 3 + (((tickAnim - 117) / 21) * (5-(3)));
            yy = 0 + (((tickAnim - 117) / 21) * (0-(0)));
            zz = 0 + (((tickAnim - 117) / 21) * (0-(0)));
        }
        else if (tickAnim >= 138 && tickAnim < 170) {
            xx = 5 + (((tickAnim - 138) / 32) * (0-(5)));
            yy = 0 + (((tickAnim - 138) / 32) * (0-(0)));
            zz = 0 + (((tickAnim - 138) / 32) * (0-(0)));
        }
        else if (tickAnim >= 170 && tickAnim < 180) {
            xx = 0 + (((tickAnim - 170) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 170) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 170) / 10) * (0-(0)));
        }
        else if (tickAnim >= 180 && tickAnim < 190) {
            xx = 0 + (((tickAnim - 180) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 180) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 180) / 10) * (0-(0)));
        }
        else if (tickAnim >= 190 && tickAnim < 215) {
            xx = 0 + (((tickAnim - 190) / 25) * (-3-(0)));
            yy = 0 + (((tickAnim - 190) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 190) / 25) * (0-(0)));
        }
        else if (tickAnim >= 215 && tickAnim < 255) {
            xx = -3 + (((tickAnim - 215) / 40) * (-3-(-3)));
            yy = 0 + (((tickAnim - 215) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 215) / 40) * (0-(0)));
        }
        else if (tickAnim >= 255 && tickAnim < 287) {
            xx = -3 + (((tickAnim - 255) / 32) * (3-(-3)));
            yy = 0 + (((tickAnim - 255) / 32) * (0-(0)));
            zz = 0 + (((tickAnim - 255) / 32) * (0-(0)));
        }
        else if (tickAnim >= 287 && tickAnim < 308) {
            xx = 3 + (((tickAnim - 287) / 21) * (5-(3)));
            yy = 0 + (((tickAnim - 287) / 21) * (0-(0)));
            zz = 0 + (((tickAnim - 287) / 21) * (0-(0)));
        }
        else if (tickAnim >= 308 && tickAnim < 340) {
            xx = 5 + (((tickAnim - 308) / 32) * (0-(5)));
            yy = 0 + (((tickAnim - 308) / 32) * (0-(0)));
            zz = 0 + (((tickAnim - 308) / 32) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(hips, hips.rotateAngleX + (float) Math.toRadians(xx), hips.rotateAngleY + (float) Math.toRadians(yy), hips.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (-1.1-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 170) {
            xx = 0 + (((tickAnim - 20) / 150) * (0-(0)));
            yy = 0 + (((tickAnim - 20) / 150) * (0-(0)));
            zz = -1.1 + (((tickAnim - 20) / 150) * (0-(-1.1)));
        }
        else if (tickAnim >= 170 && tickAnim < 190) {
            xx = 0 + (((tickAnim - 170) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 170) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 170) / 20) * (-1.1-(0)));
        }
        else if (tickAnim >= 190 && tickAnim < 340) {
            xx = 0 + (((tickAnim - 190) / 150) * (0-(0)));
            yy = 0 + (((tickAnim - 190) / 150) * (0-(0)));
            zz = -1.1 + (((tickAnim - 190) / 150) * (0-(-1.1)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.hips.rotationPointX = this.hips.rotationPointX + (float)(xx);
        this.hips.rotationPointY = this.hips.rotationPointY - (float)(yy);
        this.hips.rotationPointZ = this.hips.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 45) {
            xx = 0 + (((tickAnim - 0) / 45) * (-3-(0)));
            yy = 0 + (((tickAnim - 0) / 45) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 45) * (0-(0)));
        }
        else if (tickAnim >= 45 && tickAnim < 117) {
            xx = -3 + (((tickAnim - 45) / 72) * (0-(-3)));
            yy = 0 + (((tickAnim - 45) / 72) * (0-(0)));
            zz = 0 + (((tickAnim - 45) / 72) * (0-(0)));
        }
        else if (tickAnim >= 117 && tickAnim < 138) {
            xx = 0 + (((tickAnim - 117) / 21) * (3.75-(0)));
            yy = 0 + (((tickAnim - 117) / 21) * (0-(0)));
            zz = 0 + (((tickAnim - 117) / 21) * (0-(0)));
        }
        else if (tickAnim >= 138 && tickAnim < 170) {
            xx = 3.75 + (((tickAnim - 138) / 32) * (0-(3.75)));
            yy = 0 + (((tickAnim - 138) / 32) * (0-(0)));
            zz = 0 + (((tickAnim - 138) / 32) * (0-(0)));
        }
        else if (tickAnim >= 170 && tickAnim < 215) {
            xx = 0 + (((tickAnim - 170) / 45) * (-3-(0)));
            yy = 0 + (((tickAnim - 170) / 45) * (0-(0)));
            zz = 0 + (((tickAnim - 170) / 45) * (0-(0)));
        }
        else if (tickAnim >= 215 && tickAnim < 287) {
            xx = -3 + (((tickAnim - 215) / 72) * (0-(-3)));
            yy = 0 + (((tickAnim - 215) / 72) * (0-(0)));
            zz = 0 + (((tickAnim - 215) / 72) * (0-(0)));
        }
        else if (tickAnim >= 287 && tickAnim < 308) {
            xx = 0 + (((tickAnim - 287) / 21) * (3.75-(0)));
            yy = 0 + (((tickAnim - 287) / 21) * (0-(0)));
            zz = 0 + (((tickAnim - 287) / 21) * (0-(0)));
        }
        else if (tickAnim >= 308 && tickAnim < 340) {
            xx = 3.75 + (((tickAnim - 308) / 32) * (0-(3.75)));
            yy = 0 + (((tickAnim - 308) / 32) * (0-(0)));
            zz = 0 + (((tickAnim - 308) / 32) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail1, tail1.rotateAngleX + (float) Math.toRadians(xx), tail1.rotateAngleY + (float) Math.toRadians(yy), tail1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 45) {
            xx = 0 + (((tickAnim - 0) / 45) * (-4-(0)));
            yy = 0 + (((tickAnim - 0) / 45) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 45) * (0-(0)));
        }
        else if (tickAnim >= 45 && tickAnim < 117) {
            xx = -4 + (((tickAnim - 45) / 72) * (0-(-4)));
            yy = 0 + (((tickAnim - 45) / 72) * (0-(0)));
            zz = 0 + (((tickAnim - 45) / 72) * (0-(0)));
        }
        else if (tickAnim >= 117 && tickAnim < 138) {
            xx = 0 + (((tickAnim - 117) / 21) * (1.75-(0)));
            yy = 0 + (((tickAnim - 117) / 21) * (0-(0)));
            zz = 0 + (((tickAnim - 117) / 21) * (0-(0)));
        }
        else if (tickAnim >= 138 && tickAnim < 170) {
            xx = 1.75 + (((tickAnim - 138) / 32) * (0-(1.75)));
            yy = 0 + (((tickAnim - 138) / 32) * (0-(0)));
            zz = 0 + (((tickAnim - 138) / 32) * (0-(0)));
        }
        else if (tickAnim >= 170 && tickAnim < 215) {
            xx = 0 + (((tickAnim - 170) / 45) * (-4-(0)));
            yy = 0 + (((tickAnim - 170) / 45) * (0-(0)));
            zz = 0 + (((tickAnim - 170) / 45) * (0-(0)));
        }
        else if (tickAnim >= 215 && tickAnim < 287) {
            xx = -4 + (((tickAnim - 215) / 72) * (0-(-4)));
            yy = 0 + (((tickAnim - 215) / 72) * (0-(0)));
            zz = 0 + (((tickAnim - 215) / 72) * (0-(0)));
        }
        else if (tickAnim >= 287 && tickAnim < 308) {
            xx = 0 + (((tickAnim - 287) / 21) * (1.75-(0)));
            yy = 0 + (((tickAnim - 287) / 21) * (0-(0)));
            zz = 0 + (((tickAnim - 287) / 21) * (0-(0)));
        }
        else if (tickAnim >= 308 && tickAnim < 340) {
            xx = 1.75 + (((tickAnim - 308) / 32) * (0-(1.75)));
            yy = 0 + (((tickAnim - 308) / 32) * (0-(0)));
            zz = 0 + (((tickAnim - 308) / 32) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(xx), tail2.rotateAngleY + (float) Math.toRadians(yy), tail2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 45) {
            xx = 0 + (((tickAnim - 0) / 45) * (-2.5-(0)));
            yy = 0 + (((tickAnim - 0) / 45) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 45) * (0-(0)));
        }
        else if (tickAnim >= 45 && tickAnim < 117) {
            xx = -2.5 + (((tickAnim - 45) / 72) * (-3.5-(-2.5)));
            yy = 0 + (((tickAnim - 45) / 72) * (0-(0)));
            zz = 0 + (((tickAnim - 45) / 72) * (0-(0)));
        }
        else if (tickAnim >= 117 && tickAnim < 138) {
            xx = -3.5 + (((tickAnim - 117) / 21) * (-5.5-(-3.5)));
            yy = 0 + (((tickAnim - 117) / 21) * (0-(0)));
            zz = 0 + (((tickAnim - 117) / 21) * (0-(0)));
        }
        else if (tickAnim >= 138 && tickAnim < 170) {
            xx = -5.5 + (((tickAnim - 138) / 32) * (0-(-5.5)));
            yy = 0 + (((tickAnim - 138) / 32) * (0-(0)));
            zz = 0 + (((tickAnim - 138) / 32) * (0-(0)));
        }
        else if (tickAnim >= 170 && tickAnim < 215) {
            xx = 0 + (((tickAnim - 170) / 45) * (-2.5-(0)));
            yy = 0 + (((tickAnim - 170) / 45) * (0-(0)));
            zz = 0 + (((tickAnim - 170) / 45) * (0-(0)));
        }
        else if (tickAnim >= 215 && tickAnim < 287) {
            xx = -2.5 + (((tickAnim - 215) / 72) * (-3.5-(-2.5)));
            yy = 0 + (((tickAnim - 215) / 72) * (0-(0)));
            zz = 0 + (((tickAnim - 215) / 72) * (0-(0)));
        }
        else if (tickAnim >= 287 && tickAnim < 308) {
            xx = -3.5 + (((tickAnim - 287) / 21) * (-5.5-(-3.5)));
            yy = 0 + (((tickAnim - 287) / 21) * (0-(0)));
            zz = 0 + (((tickAnim - 287) / 21) * (0-(0)));
        }
        else if (tickAnim >= 308 && tickAnim < 340) {
            xx = -5.5 + (((tickAnim - 308) / 32) * (0-(-5.5)));
            yy = 0 + (((tickAnim - 308) / 32) * (0-(0)));
            zz = 0 + (((tickAnim - 308) / 32) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(xx), tail3.rotateAngleY + (float) Math.toRadians(yy), tail3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 45) {
            xx = 0 + (((tickAnim - 0) / 45) * (3.75476-(0)));
            yy = 0 + (((tickAnim - 0) / 45) * (-0.45001-(0)));
            zz = 0 + (((tickAnim - 0) / 45) * (1.28914-(0)));
        }
        else if (tickAnim >= 45 && tickAnim < 117) {
            xx = 3.75476 + (((tickAnim - 45) / 72) * (-4.5-(3.75476)));
            yy = -0.45001 + (((tickAnim - 45) / 72) * (0-(-0.45001)));
            zz = 1.28914 + (((tickAnim - 45) / 72) * (0-(1.28914)));
        }
        else if (tickAnim >= 117 && tickAnim < 138) {
            xx = -4.5 + (((tickAnim - 117) / 21) * (-7.75-(-4.5)));
            yy = 0 + (((tickAnim - 117) / 21) * (0-(0)));
            zz = 0 + (((tickAnim - 117) / 21) * (0-(0)));
        }
        else if (tickAnim >= 138 && tickAnim < 170) {
            xx = -7.75 + (((tickAnim - 138) / 32) * (0-(-7.75)));
            yy = 0 + (((tickAnim - 138) / 32) * (0-(0)));
            zz = 0 + (((tickAnim - 138) / 32) * (0-(0)));
        }
        else if (tickAnim >= 170 && tickAnim < 215) {
            xx = 0 + (((tickAnim - 170) / 45) * (3.75476-(0)));
            yy = 0 + (((tickAnim - 170) / 45) * (-0.45001-(0)));
            zz = 0 + (((tickAnim - 170) / 45) * (1.28914-(0)));
        }
        else if (tickAnim >= 215 && tickAnim < 287) {
            xx = 3.75476 + (((tickAnim - 215) / 72) * (-4.5-(3.75476)));
            yy = -0.45001 + (((tickAnim - 215) / 72) * (0-(-0.45001)));
            zz = 1.28914 + (((tickAnim - 215) / 72) * (0-(1.28914)));
        }
        else if (tickAnim >= 287 && tickAnim < 308) {
            xx = -4.5 + (((tickAnim - 287) / 21) * (-7.75-(-4.5)));
            yy = 0 + (((tickAnim - 287) / 21) * (0-(0)));
            zz = 0 + (((tickAnim - 287) / 21) * (0-(0)));
        }
        else if (tickAnim >= 308 && tickAnim < 340) {
            xx = -7.75 + (((tickAnim - 308) / 32) * (0-(-7.75)));
            yy = 0 + (((tickAnim - 308) / 32) * (0-(0)));
            zz = 0 + (((tickAnim - 308) / 32) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(xx), tail4.rotateAngleY + (float) Math.toRadians(yy), tail4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 45) {
            xx = 0 + (((tickAnim - 0) / 45) * (7-(0)));
            yy = 0 + (((tickAnim - 0) / 45) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 45) * (0-(0)));
        }
        else if (tickAnim >= 45 && tickAnim < 117) {
            xx = 7 + (((tickAnim - 45) / 72) * (-8-(7)));
            yy = 0 + (((tickAnim - 45) / 72) * (0-(0)));
            zz = 0 + (((tickAnim - 45) / 72) * (0-(0)));
        }
        else if (tickAnim >= 117 && tickAnim < 138) {
            xx = -8 + (((tickAnim - 117) / 21) * (-5.75-(-8)));
            yy = 0 + (((tickAnim - 117) / 21) * (0-(0)));
            zz = 0 + (((tickAnim - 117) / 21) * (0-(0)));
        }
        else if (tickAnim >= 138 && tickAnim < 170) {
            xx = -5.75 + (((tickAnim - 138) / 32) * (0-(-5.75)));
            yy = 0 + (((tickAnim - 138) / 32) * (0-(0)));
            zz = 0 + (((tickAnim - 138) / 32) * (0-(0)));
        }
        else if (tickAnim >= 170 && tickAnim < 215) {
            xx = 0 + (((tickAnim - 170) / 45) * (7-(0)));
            yy = 0 + (((tickAnim - 170) / 45) * (0-(0)));
            zz = 0 + (((tickAnim - 170) / 45) * (0-(0)));
        }
        else if (tickAnim >= 215 && tickAnim < 287) {
            xx = 7 + (((tickAnim - 215) / 72) * (-8-(7)));
            yy = 0 + (((tickAnim - 215) / 72) * (0-(0)));
            zz = 0 + (((tickAnim - 215) / 72) * (0-(0)));
        }
        else if (tickAnim >= 287 && tickAnim < 308) {
            xx = -8 + (((tickAnim - 287) / 21) * (-5.75-(-8)));
            yy = 0 + (((tickAnim - 287) / 21) * (0-(0)));
            zz = 0 + (((tickAnim - 287) / 21) * (0-(0)));
        }
        else if (tickAnim >= 308 && tickAnim < 340) {
            xx = -5.75 + (((tickAnim - 308) / 32) * (0-(-5.75)));
            yy = 0 + (((tickAnim - 308) / 32) * (0-(0)));
            zz = 0 + (((tickAnim - 308) / 32) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail5, tail5.rotateAngleX + (float) Math.toRadians(xx), tail5.rotateAngleY + (float) Math.toRadians(yy), tail5.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 45) {
            xx = 0 + (((tickAnim - 0) / 45) * (7-(0)));
            yy = 0 + (((tickAnim - 0) / 45) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 45) * (0-(0)));
        }
        else if (tickAnim >= 45 && tickAnim < 117) {
            xx = 7 + (((tickAnim - 45) / 72) * (-6-(7)));
            yy = 0 + (((tickAnim - 45) / 72) * (0-(0)));
            zz = 0 + (((tickAnim - 45) / 72) * (0-(0)));
        }
        else if (tickAnim >= 117 && tickAnim < 138) {
            xx = -6 + (((tickAnim - 117) / 21) * (-5.25-(-6)));
            yy = 0 + (((tickAnim - 117) / 21) * (0-(0)));
            zz = 0 + (((tickAnim - 117) / 21) * (0-(0)));
        }
        else if (tickAnim >= 138 && tickAnim < 170) {
            xx = -5.25 + (((tickAnim - 138) / 32) * (0-(-5.25)));
            yy = 0 + (((tickAnim - 138) / 32) * (0-(0)));
            zz = 0 + (((tickAnim - 138) / 32) * (0-(0)));
        }
        else if (tickAnim >= 170 && tickAnim < 215) {
            xx = 0 + (((tickAnim - 170) / 45) * (7-(0)));
            yy = 0 + (((tickAnim - 170) / 45) * (0-(0)));
            zz = 0 + (((tickAnim - 170) / 45) * (0-(0)));
        }
        else if (tickAnim >= 215 && tickAnim < 287) {
            xx = 7 + (((tickAnim - 215) / 72) * (-6-(7)));
            yy = 0 + (((tickAnim - 215) / 72) * (0-(0)));
            zz = 0 + (((tickAnim - 215) / 72) * (0-(0)));
        }
        else if (tickAnim >= 287 && tickAnim < 308) {
            xx = -6 + (((tickAnim - 287) / 21) * (-5.25-(-6)));
            yy = 0 + (((tickAnim - 287) / 21) * (0-(0)));
            zz = 0 + (((tickAnim - 287) / 21) * (0-(0)));
        }
        else if (tickAnim >= 308 && tickAnim < 340) {
            xx = -5.25 + (((tickAnim - 308) / 32) * (0-(-5.25)));
            yy = 0 + (((tickAnim - 308) / 32) * (0-(0)));
            zz = 0 + (((tickAnim - 308) / 32) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail6, tail6.rotateAngleX + (float) Math.toRadians(xx), tail6.rotateAngleY + (float) Math.toRadians(yy), tail6.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 45) {
            xx = 0 + (((tickAnim - 20) / 25) * (3.75-(0)));
            yy = 0 + (((tickAnim - 20) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 25) * (0-(0)));
        }
        else if (tickAnim >= 45 && tickAnim < 85) {
            xx = 3.75 + (((tickAnim - 45) / 40) * (3.75-(3.75)));
            yy = 0 + (((tickAnim - 45) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 45) / 40) * (0-(0)));
        }
        else if (tickAnim >= 85 && tickAnim < 117) {
            xx = 3.75 + (((tickAnim - 85) / 32) * (2.75-(3.75)));
            yy = 0 + (((tickAnim - 85) / 32) * (0-(0)));
            zz = 0 + (((tickAnim - 85) / 32) * (0-(0)));
        }
        else if (tickAnim >= 117 && tickAnim < 138) {
            xx = 2.75 + (((tickAnim - 117) / 21) * (3-(2.75)));
            yy = 0 + (((tickAnim - 117) / 21) * (0-(0)));
            zz = 0 + (((tickAnim - 117) / 21) * (0-(0)));
        }
        else if (tickAnim >= 138 && tickAnim < 170) {
            xx = 3 + (((tickAnim - 138) / 32) * (0-(3)));
            yy = 0 + (((tickAnim - 138) / 32) * (0-(0)));
            zz = 0 + (((tickAnim - 138) / 32) * (0-(0)));
        }
        else if (tickAnim >= 170 && tickAnim < 190) {
            xx = 0 + (((tickAnim - 170) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 170) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 170) / 20) * (0-(0)));
        }
        else if (tickAnim >= 190 && tickAnim < 215) {
            xx = 0 + (((tickAnim - 190) / 25) * (3.75-(0)));
            yy = 0 + (((tickAnim - 190) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 190) / 25) * (0-(0)));
        }
        else if (tickAnim >= 215 && tickAnim < 255) {
            xx = 3.75 + (((tickAnim - 215) / 40) * (3.75-(3.75)));
            yy = 0 + (((tickAnim - 215) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 215) / 40) * (0-(0)));
        }
        else if (tickAnim >= 255 && tickAnim < 287) {
            xx = 3.75 + (((tickAnim - 255) / 32) * (2.75-(3.75)));
            yy = 0 + (((tickAnim - 255) / 32) * (0-(0)));
            zz = 0 + (((tickAnim - 255) / 32) * (0-(0)));
        }
        else if (tickAnim >= 287 && tickAnim < 308) {
            xx = 2.75 + (((tickAnim - 287) / 21) * (3-(2.75)));
            yy = 0 + (((tickAnim - 287) / 21) * (0-(0)));
            zz = 0 + (((tickAnim - 287) / 21) * (0-(0)));
        }
        else if (tickAnim >= 308 && tickAnim < 340) {
            xx = 3 + (((tickAnim - 308) / 32) * (0-(3)));
            yy = 0 + (((tickAnim - 308) / 32) * (0-(0)));
            zz = 0 + (((tickAnim - 308) / 32) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(xx), body.rotateAngleY + (float) Math.toRadians(yy), body.rotateAngleZ + (float) Math.toRadians(zz));

        this.body.rotationPointX = this.body.rotationPointX + (float)(0);
        this.body.rotationPointY = this.body.rotationPointY - (float)(0);
        this.body.rotationPointZ = this.body.rotationPointZ + (float)(0);



        if (tickAnim >= 0 && tickAnim < 85) {
            xx = 0 + (((tickAnim - 0) / 85) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 85) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 85) * (0-(0)));
        }
        else if (tickAnim >= 85 && tickAnim < 117) {
            xx = 0 + (((tickAnim - 85) / 32) * (-4.25-(0)));
            yy = 0 + (((tickAnim - 85) / 32) * (0-(0)));
            zz = 0 + (((tickAnim - 85) / 32) * (0-(0)));
        }
        else if (tickAnim >= 117 && tickAnim < 138) {
            xx = -4.25 + (((tickAnim - 117) / 21) * (-4.75-(-4.25)));
            yy = 0 + (((tickAnim - 117) / 21) * (0-(0)));
            zz = 0 + (((tickAnim - 117) / 21) * (0-(0)));
        }
        else if (tickAnim >= 138 && tickAnim < 170) {
            xx = -4.75 + (((tickAnim - 138) / 32) * (0-(-4.75)));
            yy = 0 + (((tickAnim - 138) / 32) * (0-(0)));
            zz = 0 + (((tickAnim - 138) / 32) * (0-(0)));
        }
        else if (tickAnim >= 170 && tickAnim < 255) {
            xx = 0 + (((tickAnim - 170) / 85) * (0-(0)));
            yy = 0 + (((tickAnim - 170) / 85) * (0-(0)));
            zz = 0 + (((tickAnim - 170) / 85) * (0-(0)));
        }
        else if (tickAnim >= 255 && tickAnim < 287) {
            xx = 0 + (((tickAnim - 255) / 32) * (-4.25-(0)));
            yy = 0 + (((tickAnim - 255) / 32) * (0-(0)));
            zz = 0 + (((tickAnim - 255) / 32) * (0-(0)));
        }
        else if (tickAnim >= 287 && tickAnim < 308) {
            xx = -4.25 + (((tickAnim - 287) / 21) * (-4.75-(-4.25)));
            yy = 0 + (((tickAnim - 287) / 21) * (0-(0)));
            zz = 0 + (((tickAnim - 287) / 21) * (0-(0)));
        }
        else if (tickAnim >= 308 && tickAnim < 340) {
            xx = -4.75 + (((tickAnim - 308) / 32) * (0-(-4.75)));
            yy = 0 + (((tickAnim - 308) / 32) * (0-(0)));
            zz = 0 + (((tickAnim - 308) / 32) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(xx), chest.rotateAngleY + (float) Math.toRadians(yy), chest.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (-13.5-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 45) {
            xx = -13.5 + (((tickAnim - 20) / 25) * (-15.75-(-13.5)));
            yy = 0 + (((tickAnim - 20) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 25) * (0-(0)));
        }
        else if (tickAnim >= 45 && tickAnim < 138) {
            xx = -15.75 + (((tickAnim - 45) / 93) * (-15.75-(-15.75)));
            yy = 0 + (((tickAnim - 45) / 93) * (0-(0)));
            zz = 0 + (((tickAnim - 45) / 93) * (0-(0)));
        }
        else if (tickAnim >= 138 && tickAnim < 155) {
            xx = -15.75 + (((tickAnim - 138) / 17) * (5.04-(-15.75)));
            yy = 0 + (((tickAnim - 138) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 138) / 17) * (0-(0)));
        }
        else if (tickAnim >= 155 && tickAnim < 170) {
            xx = 5.04 + (((tickAnim - 155) / 15) * (0-(5.04)));
            yy = 0 + (((tickAnim - 155) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 155) / 15) * (0-(0)));
        }
        else if (tickAnim >= 170 && tickAnim < 190) {
            xx = 0 + (((tickAnim - 170) / 20) * (-13.5-(0)));
            yy = 0 + (((tickAnim - 170) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 170) / 20) * (0-(0)));
        }
        else if (tickAnim >= 190 && tickAnim < 215) {
            xx = -13.5 + (((tickAnim - 190) / 25) * (-15.75-(-13.5)));
            yy = 0 + (((tickAnim - 190) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 190) / 25) * (0-(0)));
        }
        else if (tickAnim >= 215 && tickAnim < 308) {
            xx = -15.75 + (((tickAnim - 215) / 93) * (-15.75-(-15.75)));
            yy = 0 + (((tickAnim - 215) / 93) * (0-(0)));
            zz = 0 + (((tickAnim - 215) / 93) * (0-(0)));
        }
        else if (tickAnim >= 308 && tickAnim < 326) {
            xx = -15.75 + (((tickAnim - 308) / 18) * (5.04-(-15.75)));
            yy = 0 + (((tickAnim - 308) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 308) / 18) * (0-(0)));
        }
        else if (tickAnim >= 326 && tickAnim < 340) {
            xx = 5.04 + (((tickAnim - 326) / 14) * (0-(5.04)));
            yy = 0 + (((tickAnim - 326) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 326) / 14) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm1, leftArm1.rotateAngleX + (float) Math.toRadians(xx), leftArm1.rotateAngleY + (float) Math.toRadians(yy), leftArm1.rotateAngleZ + (float) Math.toRadians(zz));

        this.leftArm1.rotationPointX = this.leftArm1.rotationPointX + (float)(0);
        this.leftArm1.rotationPointY = this.leftArm1.rotationPointY - (float)(0);
        this.leftArm1.rotationPointZ = this.leftArm1.rotationPointZ + (float)(0);



        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (-16.87-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = -16.87 + (((tickAnim - 10) / 10) * (12.75-(-16.87)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 89) {
            xx = 12.75 + (((tickAnim - 20) / 69) * (12.29-(12.75)));
            yy = 0 + (((tickAnim - 20) / 69) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 69) * (0-(0)));
        }
        else if (tickAnim >= 89 && tickAnim < 117) {
            xx = 12.29 + (((tickAnim - 89) / 28) * (-12.25-(12.29)));
            yy = 0 + (((tickAnim - 89) / 28) * (0-(0)));
            zz = 0 + (((tickAnim - 89) / 28) * (0-(0)));
        }
        else if (tickAnim >= 117 && tickAnim < 138) {
            xx = -12.25 + (((tickAnim - 117) / 21) * (-24-(-12.25)));
            yy = 0 + (((tickAnim - 117) / 21) * (0-(0)));
            zz = 0 + (((tickAnim - 117) / 21) * (0-(0)));
        }
        else if (tickAnim >= 138 && tickAnim < 155) {
            xx = -24 + (((tickAnim - 138) / 17) * (-30.22-(-24)));
            yy = 0 + (((tickAnim - 138) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 138) / 17) * (0-(0)));
        }
        else if (tickAnim >= 155 && tickAnim < 170) {
            xx = -30.22 + (((tickAnim - 155) / 15) * (0-(-30.22)));
            yy = 0 + (((tickAnim - 155) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 155) / 15) * (0-(0)));
        }
        else if (tickAnim >= 170 && tickAnim < 180) {
            xx = 0 + (((tickAnim - 170) / 10) * (-16.87-(0)));
            yy = 0 + (((tickAnim - 170) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 170) / 10) * (0-(0)));
        }
        else if (tickAnim >= 180 && tickAnim < 190) {
            xx = -16.87 + (((tickAnim - 180) / 10) * (12.75-(-16.87)));
            yy = 0 + (((tickAnim - 180) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 180) / 10) * (0-(0)));
        }
        else if (tickAnim >= 190 && tickAnim < 259) {
            xx = 12.75 + (((tickAnim - 190) / 69) * (12.29-(12.75)));
            yy = 0 + (((tickAnim - 190) / 69) * (0-(0)));
            zz = 0 + (((tickAnim - 190) / 69) * (0-(0)));
        }
        else if (tickAnim >= 259 && tickAnim < 287) {
            xx = 12.29 + (((tickAnim - 259) / 28) * (-12.25-(12.29)));
            yy = 0 + (((tickAnim - 259) / 28) * (0-(0)));
            zz = 0 + (((tickAnim - 259) / 28) * (0-(0)));
        }
        else if (tickAnim >= 287 && tickAnim < 308) {
            xx = -12.25 + (((tickAnim - 287) / 21) * (-24-(-12.25)));
            yy = 0 + (((tickAnim - 287) / 21) * (0-(0)));
            zz = 0 + (((tickAnim - 287) / 21) * (0-(0)));
        }
        else if (tickAnim >= 308 && tickAnim < 326) {
            xx = -24 + (((tickAnim - 308) / 18) * (-30.22-(-24)));
            yy = 0 + (((tickAnim - 308) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 308) / 18) * (0-(0)));
        }
        else if (tickAnim >= 326 && tickAnim < 340) {
            xx = -30.22 + (((tickAnim - 326) / 14) * (0-(-30.22)));
            yy = 0 + (((tickAnim - 326) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 326) / 14) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm2, leftArm2.rotateAngleX + (float) Math.toRadians(xx), leftArm2.rotateAngleY + (float) Math.toRadians(yy), leftArm2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 138) {
            xx = 0 + (((tickAnim - 0) / 138) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 138) * (0.45-(0)));
            zz = 0 + (((tickAnim - 0) / 138) * (0-(0)));
        }
        else if (tickAnim >= 138 && tickAnim < 155) {
            xx = 0 + (((tickAnim - 138) / 17) * (0-(0)));
            yy = 0.45 + (((tickAnim - 138) / 17) * (1.235-(0.45)));
            zz = 0 + (((tickAnim - 138) / 17) * (0.625-(0)));
        }
        else if (tickAnim >= 155 && tickAnim < 170) {
            xx = 0 + (((tickAnim - 155) / 15) * (0-(0)));
            yy = 1.235 + (((tickAnim - 155) / 15) * (0-(1.235)));
            zz = 0.625 + (((tickAnim - 155) / 15) * (0-(0.625)));
        }
        else if (tickAnim >= 170 && tickAnim < 308) {
            xx = 0 + (((tickAnim - 170) / 138) * (0-(0)));
            yy = 0 + (((tickAnim - 170) / 138) * (0.45-(0)));
            zz = 0 + (((tickAnim - 170) / 138) * (0-(0)));
        }
        else if (tickAnim >= 308 && tickAnim < 326) {
            xx = 0 + (((tickAnim - 308) / 18) * (0-(0)));
            yy = 0.45 + (((tickAnim - 308) / 18) * (1.235-(0.45)));
            zz = 0 + (((tickAnim - 308) / 18) * (0.625-(0)));
        }
        else if (tickAnim >= 326 && tickAnim < 340) {
            xx = 0 + (((tickAnim - 326) / 14) * (0-(0)));
            yy = 1.235 + (((tickAnim - 326) / 14) * (0-(1.235)));
            zz = 0.625 + (((tickAnim - 326) / 14) * (0-(0.625)));
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
            xx = 0 + (((tickAnim - 0) / 10) * (38-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 38 + (((tickAnim - 10) / 10) * (0-(38)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 89) {
            xx = 0 + (((tickAnim - 20) / 69) * (0.78-(0)));
            yy = 0 + (((tickAnim - 20) / 69) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 69) * (0-(0)));
        }
        else if (tickAnim >= 89 && tickAnim < 117) {
            xx = 0.78 + (((tickAnim - 89) / 28) * (26.25-(0.78)));
            yy = 0 + (((tickAnim - 89) / 28) * (0-(0)));
            zz = 0 + (((tickAnim - 89) / 28) * (0-(0)));
        }
        else if (tickAnim >= 117 && tickAnim < 138) {
            xx = 26.25 + (((tickAnim - 117) / 21) * (37-(26.25)));
            yy = 0 + (((tickAnim - 117) / 21) * (0-(0)));
            zz = 0 + (((tickAnim - 117) / 21) * (0-(0)));
        }
        else if (tickAnim >= 138 && tickAnim < 155) {
            xx = 37 + (((tickAnim - 138) / 17) * (45.68-(37)));
            yy = 0 + (((tickAnim - 138) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 138) / 17) * (0-(0)));
        }
        else if (tickAnim >= 155 && tickAnim < 170) {
            xx = 45.68 + (((tickAnim - 155) / 15) * (0-(45.68)));
            yy = 0 + (((tickAnim - 155) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 155) / 15) * (0-(0)));
        }
        else if (tickAnim >= 170 && tickAnim < 180) {
            xx = 0 + (((tickAnim - 170) / 10) * (38-(0)));
            yy = 0 + (((tickAnim - 170) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 170) / 10) * (0-(0)));
        }
        else if (tickAnim >= 180 && tickAnim < 190) {
            xx = 38 + (((tickAnim - 180) / 10) * (0-(38)));
            yy = 0 + (((tickAnim - 180) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 180) / 10) * (0-(0)));
        }
        else if (tickAnim >= 190 && tickAnim < 259) {
            xx = 0 + (((tickAnim - 190) / 69) * (0.78-(0)));
            yy = 0 + (((tickAnim - 190) / 69) * (0-(0)));
            zz = 0 + (((tickAnim - 190) / 69) * (0-(0)));
        }
        else if (tickAnim >= 259 && tickAnim < 287) {
            xx = 0.78 + (((tickAnim - 259) / 28) * (26.25-(0.78)));
            yy = 0 + (((tickAnim - 259) / 28) * (0-(0)));
            zz = 0 + (((tickAnim - 259) / 28) * (0-(0)));
        }
        else if (tickAnim >= 287 && tickAnim < 308) {
            xx = 26.25 + (((tickAnim - 287) / 21) * (37-(26.25)));
            yy = 0 + (((tickAnim - 287) / 21) * (0-(0)));
            zz = 0 + (((tickAnim - 287) / 21) * (0-(0)));
        }
        else if (tickAnim >= 308 && tickAnim < 326) {
            xx = 37 + (((tickAnim - 308) / 18) * (45.68-(37)));
            yy = 0 + (((tickAnim - 308) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 308) / 18) * (0-(0)));
        }
        else if (tickAnim >= 326 && tickAnim < 340) {
            xx = 45.68 + (((tickAnim - 326) / 14) * (0-(45.68)));
            yy = 0 + (((tickAnim - 326) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 326) / 14) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftHand, leftHand.rotateAngleX + (float) Math.toRadians(xx), leftHand.rotateAngleY + (float) Math.toRadians(yy), leftHand.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (1.275-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            yy = 1.275 + (((tickAnim - 10) / 10) * (0-(1.275)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 117) {
            xx = 0 + (((tickAnim - 20) / 97) * (0-(0)));
            yy = 0 + (((tickAnim - 20) / 97) * (0.575-(0)));
            zz = 0 + (((tickAnim - 20) / 97) * (0-(0)));
        }
        else if (tickAnim >= 117 && tickAnim < 138) {
            xx = 0 + (((tickAnim - 117) / 21) * (0-(0)));
            yy = 0.575 + (((tickAnim - 117) / 21) * (0-(0.575)));
            zz = 0 + (((tickAnim - 117) / 21) * (0-(0)));
        }
        else if (tickAnim >= 138 && tickAnim < 155) {
            xx = 0 + (((tickAnim - 138) / 17) * (0-(0)));
            yy = 0 + (((tickAnim - 138) / 17) * (1.81-(0)));
            zz = 0 + (((tickAnim - 138) / 17) * (-0.775-(0)));
        }
        else if (tickAnim >= 155 && tickAnim < 170) {
            xx = 0 + (((tickAnim - 155) / 15) * (0-(0)));
            yy = 1.81 + (((tickAnim - 155) / 15) * (0-(1.81)));
            zz = -0.775 + (((tickAnim - 155) / 15) * (0-(-0.775)));
        }
        else if (tickAnim >= 170 && tickAnim < 180) {
            xx = 0 + (((tickAnim - 170) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 170) / 10) * (1.275-(0)));
            zz = 0 + (((tickAnim - 170) / 10) * (0-(0)));
        }
        else if (tickAnim >= 180 && tickAnim < 190) {
            xx = 0 + (((tickAnim - 180) / 10) * (0-(0)));
            yy = 1.275 + (((tickAnim - 180) / 10) * (0-(1.275)));
            zz = 0 + (((tickAnim - 180) / 10) * (0-(0)));
        }
        else if (tickAnim >= 190 && tickAnim < 287) {
            xx = 0 + (((tickAnim - 190) / 97) * (0-(0)));
            yy = 0 + (((tickAnim - 190) / 97) * (0.575-(0)));
            zz = 0 + (((tickAnim - 190) / 97) * (0-(0)));
        }
        else if (tickAnim >= 287 && tickAnim < 326) {
            xx = 0 + (((tickAnim - 287) / 39) * (0-(0)));
            yy = 0.575 + (((tickAnim - 287) / 39) * (1.81-(0.575)));
            zz = 0 + (((tickAnim - 287) / 39) * (-0.775-(0)));
        }
        else if (tickAnim >= 326 && tickAnim < 340) {
            xx = 0 + (((tickAnim - 326) / 14) * (0-(0)));
            yy = 1.81 + (((tickAnim - 326) / 14) * (0-(1.81)));
            zz = -0.775 + (((tickAnim - 326) / 14) * (0-(-0.775)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftHand.rotationPointX = this.leftHand.rotationPointX + (float)(xx);
        this.leftHand.rotationPointY = this.leftHand.rotationPointY - (float)(yy);
        this.leftHand.rotationPointZ = this.leftHand.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (4.5-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 117) {
            xx = 4.5 + (((tickAnim - 20) / 97) * (10.25-(4.5)));
            yy = 0 + (((tickAnim - 20) / 97) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 97) * (0-(0)));
        }
        else if (tickAnim >= 117 && tickAnim < 170) {
            xx = 10.25 + (((tickAnim - 117) / 53) * (0-(10.25)));
            yy = 0 + (((tickAnim - 117) / 53) * (0-(0)));
            zz = 0 + (((tickAnim - 117) / 53) * (0-(0)));
        }
        else if (tickAnim >= 170 && tickAnim < 190) {
            xx = 0 + (((tickAnim - 170) / 20) * (4.5-(0)));
            yy = 0 + (((tickAnim - 170) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 170) / 20) * (0-(0)));
        }
        else if (tickAnim >= 190 && tickAnim < 287) {
            xx = 4.5 + (((tickAnim - 190) / 97) * (10.25-(4.5)));
            yy = 0 + (((tickAnim - 190) / 97) * (0-(0)));
            zz = 0 + (((tickAnim - 190) / 97) * (0-(0)));
        }
        else if (tickAnim >= 287 && tickAnim < 340) {
            xx = 10.25 + (((tickAnim - 287) / 53) * (0-(10.25)));
            yy = 0 + (((tickAnim - 287) / 53) * (0-(0)));
            zz = 0 + (((tickAnim - 287) / 53) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm1, rightArm1.rotateAngleX + (float) Math.toRadians(xx), rightArm1.rotateAngleY + (float) Math.toRadians(yy), rightArm1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 85) {
            xx = 0 + (((tickAnim - 0) / 85) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 85) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 85) * (0-(0)));
        }
        else if (tickAnim >= 85 && tickAnim < 117) {
            xx = 0 + (((tickAnim - 85) / 32) * (-29.25-(0)));
            yy = 0 + (((tickAnim - 85) / 32) * (0-(0)));
            zz = 0 + (((tickAnim - 85) / 32) * (0-(0)));
        }
        else if (tickAnim >= 117 && tickAnim < 138) {
            xx = -29.25 + (((tickAnim - 117) / 21) * (-37.25-(-29.25)));
            yy = 0 + (((tickAnim - 117) / 21) * (0-(0)));
            zz = 0 + (((tickAnim - 117) / 21) * (0-(0)));
        }
        else if (tickAnim >= 138 && tickAnim < 170) {
            xx = -37.25 + (((tickAnim - 138) / 32) * (0-(-37.25)));
            yy = 0 + (((tickAnim - 138) / 32) * (0-(0)));
            zz = 0 + (((tickAnim - 138) / 32) * (0-(0)));
        }
        else if (tickAnim >= 170 && tickAnim < 255) {
            xx = 0 + (((tickAnim - 170) / 85) * (0-(0)));
            yy = 0 + (((tickAnim - 170) / 85) * (0-(0)));
            zz = 0 + (((tickAnim - 170) / 85) * (0-(0)));
        }
        else if (tickAnim >= 255 && tickAnim < 287) {
            xx = 0 + (((tickAnim - 255) / 32) * (-29.25-(0)));
            yy = 0 + (((tickAnim - 255) / 32) * (0-(0)));
            zz = 0 + (((tickAnim - 255) / 32) * (0-(0)));
        }
        else if (tickAnim >= 287 && tickAnim < 308) {
            xx = -29.25 + (((tickAnim - 287) / 21) * (-37.25-(-29.25)));
            yy = 0 + (((tickAnim - 287) / 21) * (0-(0)));
            zz = 0 + (((tickAnim - 287) / 21) * (0-(0)));
        }
        else if (tickAnim >= 308 && tickAnim < 340) {
            xx = -37.25 + (((tickAnim - 308) / 32) * (0-(-37.25)));
            yy = 0 + (((tickAnim - 308) / 32) * (0-(0)));
            zz = 0 + (((tickAnim - 308) / 32) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm2, rightArm2.rotateAngleX + (float) Math.toRadians(xx), rightArm2.rotateAngleY + (float) Math.toRadians(yy), rightArm2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 85) {
            xx = 0 + (((tickAnim - 0) / 85) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 85) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 85) * (0-(0)));
        }
        else if (tickAnim >= 85 && tickAnim < 117) {
            xx = 0 + (((tickAnim - 85) / 32) * (0-(0)));
            yy = 0 + (((tickAnim - 85) / 32) * (1.325-(0)));
            zz = 0 + (((tickAnim - 85) / 32) * (0-(0)));
        }
        else if (tickAnim >= 117 && tickAnim < 138) {
            xx = 0 + (((tickAnim - 117) / 21) * (0-(0)));
            yy = 1.325 + (((tickAnim - 117) / 21) * (2.08-(1.325)));
            zz = 0 + (((tickAnim - 117) / 21) * (0-(0)));
        }
        else if (tickAnim >= 138 && tickAnim < 170) {
            xx = 0 + (((tickAnim - 138) / 32) * (0-(0)));
            yy = 2.08 + (((tickAnim - 138) / 32) * (0-(2.08)));
            zz = 0 + (((tickAnim - 138) / 32) * (0-(0)));
        }
        else if (tickAnim >= 170 && tickAnim < 255) {
            xx = 0 + (((tickAnim - 170) / 85) * (0-(0)));
            yy = 0 + (((tickAnim - 170) / 85) * (0-(0)));
            zz = 0 + (((tickAnim - 170) / 85) * (0-(0)));
        }
        else if (tickAnim >= 255 && tickAnim < 287) {
            xx = 0 + (((tickAnim - 255) / 32) * (0-(0)));
            yy = 0 + (((tickAnim - 255) / 32) * (1.325-(0)));
            zz = 0 + (((tickAnim - 255) / 32) * (0-(0)));
        }
        else if (tickAnim >= 287 && tickAnim < 308) {
            xx = 0 + (((tickAnim - 287) / 21) * (0-(0)));
            yy = 1.325 + (((tickAnim - 287) / 21) * (2.08-(1.325)));
            zz = 0 + (((tickAnim - 287) / 21) * (0-(0)));
        }
        else if (tickAnim >= 308 && tickAnim < 340) {
            xx = 0 + (((tickAnim - 308) / 32) * (0-(0)));
            yy = 2.08 + (((tickAnim - 308) / 32) * (0-(2.08)));
            zz = 0 + (((tickAnim - 308) / 32) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightArm2.rotationPointX = this.rightArm2.rotationPointX + (float)(xx);
        this.rightArm2.rotationPointY = this.rightArm2.rotationPointY - (float)(yy);
        this.rightArm2.rotationPointZ = this.rightArm2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 85) {
            xx = 0 + (((tickAnim - 0) / 85) * (-10.5-(0)));
            yy = 0 + (((tickAnim - 0) / 85) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 85) * (0-(0)));
        }
        else if (tickAnim >= 85 && tickAnim < 117) {
            xx = -10.5 + (((tickAnim - 85) / 32) * (15-(-10.5)));
            yy = 0 + (((tickAnim - 85) / 32) * (0-(0)));
            zz = 0 + (((tickAnim - 85) / 32) * (0-(0)));
        }
        else if (tickAnim >= 117 && tickAnim < 138) {
            xx = 15 + (((tickAnim - 117) / 21) * (26-(15)));
            yy = 0 + (((tickAnim - 117) / 21) * (0-(0)));
            zz = 0 + (((tickAnim - 117) / 21) * (0-(0)));
        }
        else if (tickAnim >= 138 && tickAnim < 170) {
            xx = 26 + (((tickAnim - 138) / 32) * (0-(26)));
            yy = 0 + (((tickAnim - 138) / 32) * (0-(0)));
            zz = 0 + (((tickAnim - 138) / 32) * (0-(0)));
        }
        else if (tickAnim >= 170 && tickAnim < 255) {
            xx = 0 + (((tickAnim - 170) / 85) * (-10.5-(0)));
            yy = 0 + (((tickAnim - 170) / 85) * (0-(0)));
            zz = 0 + (((tickAnim - 170) / 85) * (0-(0)));
        }
        else if (tickAnim >= 255 && tickAnim < 287) {
            xx = -10.5 + (((tickAnim - 255) / 32) * (15-(-10.5)));
            yy = 0 + (((tickAnim - 255) / 32) * (0-(0)));
            zz = 0 + (((tickAnim - 255) / 32) * (0-(0)));
        }
        else if (tickAnim >= 287 && tickAnim < 308) {
            xx = 15 + (((tickAnim - 287) / 21) * (26-(15)));
            yy = 0 + (((tickAnim - 287) / 21) * (0-(0)));
            zz = 0 + (((tickAnim - 287) / 21) * (0-(0)));
        }
        else if (tickAnim >= 308 && tickAnim < 340) {
            xx = 26 + (((tickAnim - 308) / 32) * (0-(26)));
            yy = 0 + (((tickAnim - 308) / 32) * (0-(0)));
            zz = 0 + (((tickAnim - 308) / 32) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightHand, rightHand.rotateAngleX + (float) Math.toRadians(xx), rightHand.rotateAngleY + (float) Math.toRadians(yy), rightHand.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 85 && tickAnim < 255) {
            xx = 0 + (((tickAnim - 85) / 170) * (0-(0)));
            yy = 0 + (((tickAnim - 85) / 170) * (0-(0)));
            zz = 0 + (((tickAnim - 85) / 170) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightHand.rotationPointX = this.rightHand.rotationPointX + (float)(xx);
        this.rightHand.rotationPointY = this.rightHand.rotationPointY - (float)(yy);
        this.rightHand.rotationPointZ = this.rightHand.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 45) {
            xx = 0 + (((tickAnim - 0) / 45) * (-1.275+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-30))*-1-(0)));
            yy = 0 + (((tickAnim - 0) / 45) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 45) * (0-(0)));
        }
        else if (tickAnim >= 45 && tickAnim < 85) {
            xx = -1.275+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-30))*-1 + (((tickAnim - 45) / 40) * (2-(-1.275+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-30))*-1)));
            yy = 0 + (((tickAnim - 45) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 45) / 40) * (0-(0)));
        }
        else if (tickAnim >= 85 && tickAnim < 117) {
            xx = 2 + (((tickAnim - 85) / 32) * (6-(2)));
            yy = 0 + (((tickAnim - 85) / 32) * (0-(0)));
            zz = 0 + (((tickAnim - 85) / 32) * (0-(0)));
        }
        else if (tickAnim >= 117 && tickAnim < 138) {
            xx = 6 + (((tickAnim - 117) / 21) * (6-(6)));
            yy = 0 + (((tickAnim - 117) / 21) * (0-(0)));
            zz = 0 + (((tickAnim - 117) / 21) * (0-(0)));
        }
        else if (tickAnim >= 138 && tickAnim < 215) {
            xx = 6 + (((tickAnim - 138) / 77) * (-1.275+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-30))*-1-(6)));
            yy = 0 + (((tickAnim - 138) / 77) * (0-(0)));
            zz = 0 + (((tickAnim - 138) / 77) * (0-(0)));
        }
        else if (tickAnim >= 215 && tickAnim < 255) {
            xx = -1.275+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-30))*-1 + (((tickAnim - 215) / 40) * (2-(-1.275+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-30))*-1)));
            yy = 0 + (((tickAnim - 215) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 215) / 40) * (0-(0)));
        }
        else if (tickAnim >= 255 && tickAnim < 287) {
            xx = 2 + (((tickAnim - 255) / 32) * (6-(2)));
            yy = 0 + (((tickAnim - 255) / 32) * (0-(0)));
            zz = 0 + (((tickAnim - 255) / 32) * (0-(0)));
        }
        else if (tickAnim >= 287 && tickAnim < 308) {
            xx = 6 + (((tickAnim - 287) / 21) * (6-(6)));
            yy = 0 + (((tickAnim - 287) / 21) * (0-(0)));
            zz = 0 + (((tickAnim - 287) / 21) * (0-(0)));
        }
        else if (tickAnim >= 308 && tickAnim < 340) {
            xx = 6 + (((tickAnim - 308) / 32) * (0-(6)));
            yy = 0 + (((tickAnim - 308) / 32) * (0-(0)));
            zz = 0 + (((tickAnim - 308) / 32) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck1, neck1.rotateAngleX + (float) Math.toRadians(xx), neck1.rotateAngleY + (float) Math.toRadians(yy), neck1.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 45) {
            xx = 0 + (((tickAnim - 0) / 45) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 45) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 45) * (0-(0)));
        }
        else if (tickAnim >= 45 && tickAnim < 85) {
            xx = 0 + (((tickAnim - 45) / 40) * (0-(0)));
            yy = 0 + (((tickAnim - 45) / 40) * (1.525-(0)));
            zz = 0 + (((tickAnim - 45) / 40) * (-1.675-(0)));
        }
        else if (tickAnim >= 85 && tickAnim < 117) {
            xx = 0 + (((tickAnim - 85) / 32) * (0-(0)));
            yy = 1.525 + (((tickAnim - 85) / 32) * (0-(1.525)));
            zz = -1.675 + (((tickAnim - 85) / 32) * (0-(-1.675)));
        }
        else if (tickAnim >= 117 && tickAnim < 138) {
            xx = 0 + (((tickAnim - 117) / 21) * (0-(0)));
            yy = 0 + (((tickAnim - 117) / 21) * (0-(0)));
            zz = 0 + (((tickAnim - 117) / 21) * (0-(0)));
        }
        else if (tickAnim >= 138 && tickAnim < 215) {
            xx = 0 + (((tickAnim - 138) / 77) * (0-(0)));
            yy = 0 + (((tickAnim - 138) / 77) * (0-(0)));
            zz = 0 + (((tickAnim - 138) / 77) * (0-(0)));
        }
        else if (tickAnim >= 215 && tickAnim < 255) {
            xx = 0 + (((tickAnim - 215) / 40) * (0-(0)));
            yy = 0 + (((tickAnim - 215) / 40) * (1.525-(0)));
            zz = 0 + (((tickAnim - 215) / 40) * (-1.675-(0)));
        }
        else if (tickAnim >= 255 && tickAnim < 287) {
            xx = 0 + (((tickAnim - 255) / 32) * (0-(0)));
            yy = 1.525 + (((tickAnim - 255) / 32) * (0-(1.525)));
            zz = -1.675 + (((tickAnim - 255) / 32) * (0-(-1.675)));
        }
        else if (tickAnim >= 287 && tickAnim < 308) {
            xx = 0 + (((tickAnim - 287) / 21) * (0-(0)));
            yy = 0 + (((tickAnim - 287) / 21) * (0-(0)));
            zz = 0 + (((tickAnim - 287) / 21) * (0-(0)));
        }
        else if (tickAnim >= 308 && tickAnim < 340) {
            xx = 0 + (((tickAnim - 308) / 32) * (0-(0)));
            yy = 0 + (((tickAnim - 308) / 32) * (0-(0)));
            zz = 0 + (((tickAnim - 308) / 32) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.neck1.rotationPointX = this.neck1.rotationPointX + (float)(xx);
        this.neck1.rotationPointY = this.neck1.rotationPointY - (float)(yy);
        this.neck1.rotationPointZ = this.neck1.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 45) {
            xx = 0 + (((tickAnim - 0) / 45) * (-1.25-(0)));
            yy = 0 + (((tickAnim - 0) / 45) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 45) * (0-(0)));
        }
        else if (tickAnim >= 45 && tickAnim < 85) {
            xx = -1.25 + (((tickAnim - 45) / 40) * (5.25-(-1.25)));
            yy = 0 + (((tickAnim - 45) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 45) / 40) * (0-(0)));
        }
        else if (tickAnim >= 85 && tickAnim < 117) {
            xx = 5.25 + (((tickAnim - 85) / 32) * (3.5-(5.25)));
            yy = 0 + (((tickAnim - 85) / 32) * (0-(0)));
            zz = 0 + (((tickAnim - 85) / 32) * (0-(0)));
        }
        else if (tickAnim >= 117 && tickAnim < 138) {
            xx = 3.5 + (((tickAnim - 117) / 21) * (3.5-(3.5)));
            yy = 0 + (((tickAnim - 117) / 21) * (0-(0)));
            zz = 0 + (((tickAnim - 117) / 21) * (0-(0)));
        }
        else if (tickAnim >= 138 && tickAnim < 215) {
            xx = 3.5 + (((tickAnim - 138) / 77) * (-1.25-(3.5)));
            yy = 0 + (((tickAnim - 138) / 77) * (0-(0)));
            zz = 0 + (((tickAnim - 138) / 77) * (0-(0)));
        }
        else if (tickAnim >= 215 && tickAnim < 255) {
            xx = -1.25 + (((tickAnim - 215) / 40) * (5.25-(-1.25)));
            yy = 0 + (((tickAnim - 215) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 215) / 40) * (0-(0)));
        }
        else if (tickAnim >= 255 && tickAnim < 287) {
            xx = 5.25 + (((tickAnim - 255) / 32) * (3.5-(5.25)));
            yy = 0 + (((tickAnim - 255) / 32) * (0-(0)));
            zz = 0 + (((tickAnim - 255) / 32) * (0-(0)));
        }
        else if (tickAnim >= 287 && tickAnim < 308) {
            xx = 3.5 + (((tickAnim - 287) / 21) * (3.5-(3.5)));
            yy = 0 + (((tickAnim - 287) / 21) * (0-(0)));
            zz = 0 + (((tickAnim - 287) / 21) * (0-(0)));
        }
        else if (tickAnim >= 308 && tickAnim < 340) {
            xx = 3.5 + (((tickAnim - 308) / 32) * (0-(3.5)));
            yy = 0 + (((tickAnim - 308) / 32) * (0-(0)));
            zz = 0 + (((tickAnim - 308) / 32) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(xx), neck2.rotateAngleY + (float) Math.toRadians(yy), neck2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 85) {
            xx = 0 + (((tickAnim - 0) / 85) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 85) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 85) * (-3.125-(0)));
        }
        else if (tickAnim >= 85 && tickAnim < 117) {
            xx = 0 + (((tickAnim - 85) / 32) * (0-(0)));
            yy = 0 + (((tickAnim - 85) / 32) * (0-(0)));
            zz = -3.125 + (((tickAnim - 85) / 32) * (-2.735-(-3.125)));
        }
        else if (tickAnim >= 117 && tickAnim < 138) {
            xx = 0 + (((tickAnim - 117) / 21) * (0-(0)));
            yy = 0 + (((tickAnim - 117) / 21) * (0-(0)));
            zz = -2.735 + (((tickAnim - 117) / 21) * (-2.22-(-2.735)));
        }
        else if (tickAnim >= 138 && tickAnim < 255) {
            xx = 0 + (((tickAnim - 138) / 117) * (0-(0)));
            yy = 0 + (((tickAnim - 138) / 117) * (0-(0)));
            zz = -2.22 + (((tickAnim - 138) / 117) * (-3.125-(-2.22)));
        }
        else if (tickAnim >= 255 && tickAnim < 287) {
            xx = 0 + (((tickAnim - 255) / 32) * (0-(0)));
            yy = 0 + (((tickAnim - 255) / 32) * (0-(0)));
            zz = -3.125 + (((tickAnim - 255) / 32) * (-2.735-(-3.125)));
        }
        else if (tickAnim >= 287 && tickAnim < 308) {
            xx = 0 + (((tickAnim - 287) / 21) * (0-(0)));
            yy = 0 + (((tickAnim - 287) / 21) * (0-(0)));
            zz = -2.735 + (((tickAnim - 287) / 21) * (-2.22-(-2.735)));
        }
        else if (tickAnim >= 308 && tickAnim < 340) {
            xx = 0 + (((tickAnim - 308) / 32) * (0-(0)));
            yy = 0 + (((tickAnim - 308) / 32) * (0-(0)));
            zz = -2.22 + (((tickAnim - 308) / 32) * (0-(-2.22)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.neck2.rotationPointX = this.neck2.rotationPointX + (float)(xx);
        this.neck2.rotationPointY = this.neck2.rotationPointY - (float)(yy);
        this.neck2.rotationPointZ = this.neck2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 45) {
            xx = 0 + (((tickAnim - 0) / 45) * (-1.75-(0)));
            yy = 0 + (((tickAnim - 0) / 45) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 45) * (0-(0)));
        }
        else if (tickAnim >= 45 && tickAnim < 85) {
            xx = -1.75 + (((tickAnim - 45) / 40) * (1.75-(-1.75)));
            yy = 0 + (((tickAnim - 45) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 45) / 40) * (0-(0)));
        }
        else if (tickAnim >= 85 && tickAnim < 117) {
            xx = 1.75 + (((tickAnim - 85) / 32) * (0-(1.75)));
            yy = 0 + (((tickAnim - 85) / 32) * (0-(0)));
            zz = 0 + (((tickAnim - 85) / 32) * (0-(0)));
        }
        else if (tickAnim >= 117 && tickAnim < 138) {
            xx = 0 + (((tickAnim - 117) / 21) * (0-(0)));
            yy = 0 + (((tickAnim - 117) / 21) * (0-(0)));
            zz = 0 + (((tickAnim - 117) / 21) * (0-(0)));
        }
        else if (tickAnim >= 138 && tickAnim < 215) {
            xx = 0 + (((tickAnim - 138) / 77) * (-1.75-(0)));
            yy = 0 + (((tickAnim - 138) / 77) * (0-(0)));
            zz = 0 + (((tickAnim - 138) / 77) * (0-(0)));
        }
        else if (tickAnim >= 215 && tickAnim < 255) {
            xx = -1.75 + (((tickAnim - 215) / 40) * (1.75-(-1.75)));
            yy = 0 + (((tickAnim - 215) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 215) / 40) * (0-(0)));
        }
        else if (tickAnim >= 255 && tickAnim < 287) {
            xx = 1.75 + (((tickAnim - 255) / 32) * (0-(1.75)));
            yy = 0 + (((tickAnim - 255) / 32) * (0-(0)));
            zz = 0 + (((tickAnim - 255) / 32) * (0-(0)));
        }
        else if (tickAnim >= 287 && tickAnim < 308) {
            xx = 0 + (((tickAnim - 287) / 21) * (0-(0)));
            yy = 0 + (((tickAnim - 287) / 21) * (0-(0)));
            zz = 0 + (((tickAnim - 287) / 21) * (0-(0)));
        }
        else if (tickAnim >= 308 && tickAnim < 340) {
            xx = 0 + (((tickAnim - 308) / 32) * (0-(0)));
            yy = 0 + (((tickAnim - 308) / 32) * (0-(0)));
            zz = 0 + (((tickAnim - 308) / 32) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(xx), neck3.rotateAngleY + (float) Math.toRadians(yy), neck3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 85) {
            xx = 0 + (((tickAnim - 0) / 85) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 85) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 85) * (-2.175-(0)));
        }
        else if (tickAnim >= 85 && tickAnim < 117) {
            xx = 0 + (((tickAnim - 85) / 32) * (0-(0)));
            yy = 0 + (((tickAnim - 85) / 32) * (0-(0)));
            zz = -2.175 + (((tickAnim - 85) / 32) * (-3.66-(-2.175)));
        }
        else if (tickAnim >= 117 && tickAnim < 138) {
            xx = 0 + (((tickAnim - 117) / 21) * (0-(0)));
            yy = 0 + (((tickAnim - 117) / 21) * (0-(0)));
            zz = -3.66 + (((tickAnim - 117) / 21) * (-2.355-(-3.66)));
        }
        else if (tickAnim >= 138 && tickAnim < 255) {
            xx = 0 + (((tickAnim - 138) / 117) * (0-(0)));
            yy = 0 + (((tickAnim - 138) / 117) * (0-(0)));
            zz = -2.355 + (((tickAnim - 138) / 117) * (-2.175-(-2.355)));
        }
        else if (tickAnim >= 255 && tickAnim < 287) {
            xx = 0 + (((tickAnim - 255) / 32) * (0-(0)));
            yy = 0 + (((tickAnim - 255) / 32) * (0-(0)));
            zz = -2.175 + (((tickAnim - 255) / 32) * (-3.66-(-2.175)));
        }
        else if (tickAnim >= 287 && tickAnim < 308) {
            xx = 0 + (((tickAnim - 287) / 21) * (0-(0)));
            yy = 0 + (((tickAnim - 287) / 21) * (0-(0)));
            zz = -3.66 + (((tickAnim - 287) / 21) * (-2.355-(-3.66)));
        }
        else if (tickAnim >= 308 && tickAnim < 340) {
            xx = 0 + (((tickAnim - 308) / 32) * (0-(0)));
            yy = 0 + (((tickAnim - 308) / 32) * (0-(0)));
            zz = -2.355 + (((tickAnim - 308) / 32) * (0-(-2.355)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.neck3.rotationPointX = this.neck3.rotationPointX + (float)(xx);
        this.neck3.rotationPointY = this.neck3.rotationPointY - (float)(yy);
        this.neck3.rotationPointZ = this.neck3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 45) {
            xx = 0 + (((tickAnim - 0) / 45) * (-5-(0)));
            yy = 0 + (((tickAnim - 0) / 45) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 45) * (0-(0)));
        }
        else if (tickAnim >= 45 && tickAnim < 85) {
            xx = -5 + (((tickAnim - 45) / 40) * (0-(-5)));
            yy = 0 + (((tickAnim - 45) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 45) / 40) * (0-(0)));
        }
        else if (tickAnim >= 85 && tickAnim < 117) {
            xx = 0 + (((tickAnim - 85) / 32) * (-1.75-(0)));
            yy = 0 + (((tickAnim - 85) / 32) * (0-(0)));
            zz = 0 + (((tickAnim - 85) / 32) * (0-(0)));
        }
        else if (tickAnim >= 117 && tickAnim < 138) {
            xx = -1.75 + (((tickAnim - 117) / 21) * (-1.75-(-1.75)));
            yy = 0 + (((tickAnim - 117) / 21) * (0-(0)));
            zz = 0 + (((tickAnim - 117) / 21) * (0-(0)));
        }
        else if (tickAnim >= 138 && tickAnim < 215) {
            xx = -1.75 + (((tickAnim - 138) / 77) * (-5-(-1.75)));
            yy = 0 + (((tickAnim - 138) / 77) * (0-(0)));
            zz = 0 + (((tickAnim - 138) / 77) * (0-(0)));
        }
        else if (tickAnim >= 215 && tickAnim < 255) {
            xx = -5 + (((tickAnim - 215) / 40) * (0-(-5)));
            yy = 0 + (((tickAnim - 215) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 215) / 40) * (0-(0)));
        }
        else if (tickAnim >= 255 && tickAnim < 287) {
            xx = 0 + (((tickAnim - 255) / 32) * (-1.75-(0)));
            yy = 0 + (((tickAnim - 255) / 32) * (0-(0)));
            zz = 0 + (((tickAnim - 255) / 32) * (0-(0)));
        }
        else if (tickAnim >= 287 && tickAnim < 308) {
            xx = -1.75 + (((tickAnim - 287) / 21) * (-1.75-(-1.75)));
            yy = 0 + (((tickAnim - 287) / 21) * (0-(0)));
            zz = 0 + (((tickAnim - 287) / 21) * (0-(0)));
        }
        else if (tickAnim >= 308 && tickAnim < 340) {
            xx = -1.75 + (((tickAnim - 308) / 32) * (0-(-1.75)));
            yy = 0 + (((tickAnim - 308) / 32) * (0-(0)));
            zz = 0 + (((tickAnim - 308) / 32) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck4, neck4.rotateAngleX + (float) Math.toRadians(xx), neck4.rotateAngleY + (float) Math.toRadians(yy), neck4.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 85) {
            xx = 0 + (((tickAnim - 0) / 85) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 85) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 85) * (-1.85-(0)));
        }
        else if (tickAnim >= 85 && tickAnim < 117) {
            xx = 0 + (((tickAnim - 85) / 32) * (0-(0)));
            yy = 0 + (((tickAnim - 85) / 32) * (0-(0)));
            zz = -1.85 + (((tickAnim - 85) / 32) * (-2.02-(-1.85)));
        }
        else if (tickAnim >= 117 && tickAnim < 255) {
            xx = 0 + (((tickAnim - 117) / 138) * (0-(0)));
            yy = 0 + (((tickAnim - 117) / 138) * (0-(0)));
            zz = -2.02 + (((tickAnim - 117) / 138) * (-1.85-(-2.02)));
        }
        else if (tickAnim >= 255 && tickAnim < 287) {
            xx = 0 + (((tickAnim - 255) / 32) * (0-(0)));
            yy = 0 + (((tickAnim - 255) / 32) * (0-(0)));
            zz = -1.85 + (((tickAnim - 255) / 32) * (-2.02-(-1.85)));
        }
        else if (tickAnim >= 287 && tickAnim < 340) {
            xx = 0 + (((tickAnim - 287) / 53) * (0-(0)));
            yy = 0 + (((tickAnim - 287) / 53) * (0-(0)));
            zz = -2.02 + (((tickAnim - 287) / 53) * (0-(-2.02)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.neck4.rotationPointX = this.neck4.rotationPointX + (float)(xx);
        this.neck4.rotationPointY = this.neck4.rotationPointY - (float)(yy);
        this.neck4.rotationPointZ = this.neck4.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 45) {
            xx = 0 + (((tickAnim - 0) / 45) * (-1.75-(0)));
            yy = 0 + (((tickAnim - 0) / 45) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 45) * (0-(0)));
        }
        else if (tickAnim >= 45 && tickAnim < 85) {
            xx = -1.75 + (((tickAnim - 45) / 40) * (-2.25-(-1.75)));
            yy = 0 + (((tickAnim - 45) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 45) / 40) * (0-(0)));
        }
        else if (tickAnim >= 85 && tickAnim < 117) {
            xx = -2.25 + (((tickAnim - 85) / 32) * (-2.25-(-2.25)));
            yy = 0 + (((tickAnim - 85) / 32) * (0-(0)));
            zz = 0 + (((tickAnim - 85) / 32) * (0-(0)));
        }
        else if (tickAnim >= 117 && tickAnim < 138) {
            xx = -2.25 + (((tickAnim - 117) / 21) * (-2.25-(-2.25)));
            yy = 0 + (((tickAnim - 117) / 21) * (0-(0)));
            zz = 0 + (((tickAnim - 117) / 21) * (0-(0)));
        }
        else if (tickAnim >= 138 && tickAnim < 159) {
            xx = -2.25 + (((tickAnim - 138) / 21) * (0.66+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-3-(-2.25)));
            yy = 0 + (((tickAnim - 138) / 21) * (0-(0)));
            zz = 0 + (((tickAnim - 138) / 21) * (0-(0)));
        }
        else if (tickAnim >= 159 && tickAnim < 215) {
            xx = 0.66+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-3 + (((tickAnim - 159) / 56) * (-1.75-(0.66+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-3)));
            yy = 0 + (((tickAnim - 159) / 56) * (0-(0)));
            zz = 0 + (((tickAnim - 159) / 56) * (0-(0)));
        }
        else if (tickAnim >= 215 && tickAnim < 255) {
            xx = -1.75 + (((tickAnim - 215) / 40) * (-2.25-(-1.75)));
            yy = 0 + (((tickAnim - 215) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 215) / 40) * (0-(0)));
        }
        else if (tickAnim >= 255 && tickAnim < 287) {
            xx = -2.25 + (((tickAnim - 255) / 32) * (-2.25-(-2.25)));
            yy = 0 + (((tickAnim - 255) / 32) * (0-(0)));
            zz = 0 + (((tickAnim - 255) / 32) * (0-(0)));
        }
        else if (tickAnim >= 287 && tickAnim < 308) {
            xx = -2.25 + (((tickAnim - 287) / 21) * (-2.25-(-2.25)));
            yy = 0 + (((tickAnim - 287) / 21) * (0-(0)));
            zz = 0 + (((tickAnim - 287) / 21) * (0-(0)));
        }
        else if (tickAnim >= 308 && tickAnim < 329) {
            xx = -2.25 + (((tickAnim - 308) / 21) * (0.66+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-3-(-2.25)));
            yy = 0 + (((tickAnim - 308) / 21) * (0-(0)));
            zz = 0 + (((tickAnim - 308) / 21) * (0-(0)));
        }
        else if (tickAnim >= 329 && tickAnim < 340) {
            xx = 0.66+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-3 + (((tickAnim - 329) / 11) * (0-(0.66+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-3)));
            yy = 0 + (((tickAnim - 329) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 329) / 11) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck5, neck5.rotateAngleX + (float) Math.toRadians(xx), neck5.rotateAngleY + (float) Math.toRadians(yy), neck5.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 85) {
            xx = 0 + (((tickAnim - 0) / 85) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 85) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 85) * (-1.875-(0)));
        }
        else if (tickAnim >= 85 && tickAnim < 117) {
            xx = 0 + (((tickAnim - 85) / 32) * (0-(0)));
            yy = 0 + (((tickAnim - 85) / 32) * (0-(0)));
            zz = -1.875 + (((tickAnim - 85) / 32) * (-1.875-(-1.875)));
        }
        else if (tickAnim >= 117 && tickAnim < 138) {
            xx = 0 + (((tickAnim - 117) / 21) * (0-(0)));
            yy = 0 + (((tickAnim - 117) / 21) * (0-(0)));
            zz = -1.875 + (((tickAnim - 117) / 21) * (-1.875-(-1.875)));
        }
        else if (tickAnim >= 138 && tickAnim < 255) {
            xx = 0 + (((tickAnim - 138) / 117) * (0-(0)));
            yy = 0 + (((tickAnim - 138) / 117) * (0-(0)));
            zz = -1.875 + (((tickAnim - 138) / 117) * (-1.875-(-1.875)));
        }
        else if (tickAnim >= 255 && tickAnim < 287) {
            xx = 0 + (((tickAnim - 255) / 32) * (0-(0)));
            yy = 0 + (((tickAnim - 255) / 32) * (0-(0)));
            zz = -1.875 + (((tickAnim - 255) / 32) * (-1.875-(-1.875)));
        }
        else if (tickAnim >= 287 && tickAnim < 308) {
            xx = 0 + (((tickAnim - 287) / 21) * (0-(0)));
            yy = 0 + (((tickAnim - 287) / 21) * (0-(0)));
            zz = -1.875 + (((tickAnim - 287) / 21) * (-1.875-(-1.875)));
        }
        else if (tickAnim >= 308 && tickAnim < 340) {
            xx = 0 + (((tickAnim - 308) / 32) * (0-(0)));
            yy = 0 + (((tickAnim - 308) / 32) * (0-(0)));
            zz = -1.875 + (((tickAnim - 308) / 32) * (0-(-1.875)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.neck5.rotationPointX = this.neck5.rotationPointX + (float)(xx);
        this.neck5.rotationPointY = this.neck5.rotationPointY - (float)(yy);
        this.neck5.rotationPointZ = this.neck5.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 45) {
            xx = 0 + (((tickAnim - 0) / 45) * (4.5-(0)));
            yy = 0 + (((tickAnim - 0) / 45) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 45) * (0-(0)));
        }
        else if (tickAnim >= 45 && tickAnim < 85) {
            xx = 4.5 + (((tickAnim - 45) / 40) * (-2.25-(4.5)));
            yy = 0 + (((tickAnim - 45) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 45) / 40) * (0-(0)));
        }
        else if (tickAnim >= 85 && tickAnim < 117) {
            xx = -2.25 + (((tickAnim - 85) / 32) * (-4.5-(-2.25)));
            yy = 0 + (((tickAnim - 85) / 32) * (0-(0)));
            zz = 0 + (((tickAnim - 85) / 32) * (0-(0)));
        }
        else if (tickAnim >= 117 && tickAnim < 138) {
            xx = -4.5 + (((tickAnim - 117) / 21) * (-6.5-(-4.5)));
            yy = 0 + (((tickAnim - 117) / 21) * (0-(0)));
            zz = 0 + (((tickAnim - 117) / 21) * (0-(0)));
        }
        else if (tickAnim >= 138 && tickAnim < 159) {
            xx = -6.5 + (((tickAnim - 138) / 21) * (-2.05-(-6.5)));
            yy = 0 + (((tickAnim - 138) / 21) * (0-(0)));
            zz = 0 + (((tickAnim - 138) / 21) * (0-(0)));
        }
        else if (tickAnim >= 159 && tickAnim < 215) {
            xx = -2.05 + (((tickAnim - 159) / 56) * (4.5-(-2.05)));
            yy = 0 + (((tickAnim - 159) / 56) * (0-(0)));
            zz = 0 + (((tickAnim - 159) / 56) * (0-(0)));
        }
        else if (tickAnim >= 215 && tickAnim < 255) {
            xx = 4.5 + (((tickAnim - 215) / 40) * (-2.25-(4.5)));
            yy = 0 + (((tickAnim - 215) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 215) / 40) * (0-(0)));
        }
        else if (tickAnim >= 255 && tickAnim < 287) {
            xx = -2.25 + (((tickAnim - 255) / 32) * (-4.5-(-2.25)));
            yy = 0 + (((tickAnim - 255) / 32) * (0-(0)));
            zz = 0 + (((tickAnim - 255) / 32) * (0-(0)));
        }
        else if (tickAnim >= 287 && tickAnim < 308) {
            xx = -4.5 + (((tickAnim - 287) / 21) * (-6.5-(-4.5)));
            yy = 0 + (((tickAnim - 287) / 21) * (0-(0)));
            zz = 0 + (((tickAnim - 287) / 21) * (0-(0)));
        }
        else if (tickAnim >= 308 && tickAnim < 329) {
            xx = -6.5 + (((tickAnim - 308) / 21) * (-2.05-(-6.5)));
            yy = 0 + (((tickAnim - 308) / 21) * (0-(0)));
            zz = 0 + (((tickAnim - 308) / 21) * (0-(0)));
        }
        else if (tickAnim >= 329 && tickAnim < 340) {
            xx = -2.05 + (((tickAnim - 329) / 11) * (0-(-2.05)));
            yy = 0 + (((tickAnim - 329) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 329) / 11) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck6, neck6.rotateAngleX + (float) Math.toRadians(xx), neck6.rotateAngleY + (float) Math.toRadians(yy), neck6.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 85) {
            xx = 0 + (((tickAnim - 0) / 85) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 85) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 85) * (-1.025-(0)));
        }
        else if (tickAnim >= 85 && tickAnim < 255) {
            xx = 0 + (((tickAnim - 85) / 170) * (0-(0)));
            yy = 0 + (((tickAnim - 85) / 170) * (0-(0)));
            zz = -1.025 + (((tickAnim - 85) / 170) * (-1.025-(-1.025)));
        }
        else if (tickAnim >= 255 && tickAnim < 340) {
            xx = 0 + (((tickAnim - 255) / 85) * (0-(0)));
            yy = 0 + (((tickAnim - 255) / 85) * (0-(0)));
            zz = -1.025 + (((tickAnim - 255) / 85) * (0-(-1.025)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.neck6.rotationPointX = this.neck6.rotationPointX + (float)(xx);
        this.neck6.rotationPointY = this.neck6.rotationPointY - (float)(yy);
        this.neck6.rotationPointZ = this.neck6.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 45) {
            xx = 0 + (((tickAnim - 0) / 45) * (6.75-(0)));
            yy = 0 + (((tickAnim - 0) / 45) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 45) * (0-(0)));
        }
        else if (tickAnim >= 45 && tickAnim < 85) {
            xx = 6.75 + (((tickAnim - 45) / 40) * (-3.75-(6.75)));
            yy = 0 + (((tickAnim - 45) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 45) / 40) * (0-(0)));
        }
        else if (tickAnim >= 85 && tickAnim < 139) {
            xx = -3.75 + (((tickAnim - 85) / 54) * (-13.51-(-3.75)));
            yy = 0 + (((tickAnim - 85) / 54) * (0-(0)));
            zz = 0 + (((tickAnim - 85) / 54) * (0-(0)));
        }
        else if (tickAnim >= 139 && tickAnim < 148) {
            xx = -13.51 + (((tickAnim - 139) / 9) * (-3.035+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-10-(-13.51)));
            yy = 0 + (((tickAnim - 139) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 139) / 9) * (0-(0)));
        }
        else if (tickAnim >= 148 && tickAnim < 215) {
            xx = -3.035+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-10 + (((tickAnim - 148) / 67) * (6.75-(-3.035+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-10)));
            yy = 0 + (((tickAnim - 148) / 67) * (0-(0)));
            zz = 0 + (((tickAnim - 148) / 67) * (0-(0)));
        }
        else if (tickAnim >= 215 && tickAnim < 255) {
            xx = 6.75 + (((tickAnim - 215) / 40) * (-3.75-(6.75)));
            yy = 0 + (((tickAnim - 215) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 215) / 40) * (0-(0)));
        }
        else if (tickAnim >= 255 && tickAnim < 309) {
            xx = -3.75 + (((tickAnim - 255) / 54) * (-13.51-(-3.75)));
            yy = 0 + (((tickAnim - 255) / 54) * (0-(0)));
            zz = 0 + (((tickAnim - 255) / 54) * (0-(0)));
        }
        else if (tickAnim >= 309 && tickAnim < 318) {
            xx = -13.51 + (((tickAnim - 309) / 9) * (-3.035+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-10-(-13.51)));
            yy = 0 + (((tickAnim - 309) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 309) / 9) * (0-(0)));
        }
        else if (tickAnim >= 318 && tickAnim < 340) {
            xx = -3.035+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-10 + (((tickAnim - 318) / 22) * (0-(-3.035+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-10)));
            yy = 0 + (((tickAnim - 318) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 318) / 22) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck7, neck7.rotateAngleX + (float) Math.toRadians(xx), neck7.rotateAngleY + (float) Math.toRadians(yy), neck7.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 85) {
            xx = 0 + (((tickAnim - 0) / 85) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 85) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 85) * (-0.725-(0)));
        }
        else if (tickAnim >= 85 && tickAnim < 255) {
            xx = 0 + (((tickAnim - 85) / 170) * (0-(0)));
            yy = 0 + (((tickAnim - 85) / 170) * (0-(0)));
            zz = -0.725 + (((tickAnim - 85) / 170) * (-0.725-(-0.725)));
        }
        else if (tickAnim >= 255 && tickAnim < 340) {
            xx = 0 + (((tickAnim - 255) / 85) * (0-(0)));
            yy = 0 + (((tickAnim - 255) / 85) * (0-(0)));
            zz = -0.725 + (((tickAnim - 255) / 85) * (0-(-0.725)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.neck7.rotationPointX = this.neck7.rotationPointX + (float)(xx);
        this.neck7.rotationPointY = this.neck7.rotationPointY - (float)(yy);
        this.neck7.rotationPointZ = this.neck7.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 45) {
            xx = 0 + (((tickAnim - 0) / 45) * (5.5-(0)));
            yy = 0 + (((tickAnim - 0) / 45) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 45) * (0-(0)));
        }
        else if (tickAnim >= 45 && tickAnim < 85) {
            xx = 5.5 + (((tickAnim - 45) / 40) * (-13.25-(5.5)));
            yy = 0 + (((tickAnim - 45) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 45) / 40) * (0-(0)));
        }
        else if (tickAnim >= 85 && tickAnim < 117) {
            xx = -13.25 + (((tickAnim - 85) / 32) * (-13.25-(-13.25)));
            yy = 0 + (((tickAnim - 85) / 32) * (0-(0)));
            zz = 0 + (((tickAnim - 85) / 32) * (0-(0)));
        }
        else if (tickAnim >= 117 && tickAnim < 141) {
            xx = -13.25 + (((tickAnim - 117) / 24) * (-3.61-(-13.25)));
            yy = 0 + (((tickAnim - 117) / 24) * (0-(0)));
            zz = 0 + (((tickAnim - 117) / 24) * (0-(0)));
        }
        else if (tickAnim >= 141 && tickAnim < 154) {
            xx = -3.61 + (((tickAnim - 141) / 13) * (-2.675+Math.sin((Math.PI/180)*(((double)tickAnim/20)*140))*10-(-3.61)));
            yy = 0 + (((tickAnim - 141) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 141) / 13) * (0-(0)));
        }
        else if (tickAnim >= 154 && tickAnim < 215) {
            xx = -2.675+Math.sin((Math.PI/180)*(((double)tickAnim/20)*140))*10 + (((tickAnim - 154) / 61) * (5.5-(-2.675+Math.sin((Math.PI/180)*(((double)tickAnim/20)*140))*10)));
            yy = 0 + (((tickAnim - 154) / 61) * (0-(0)));
            zz = 0 + (((tickAnim - 154) / 61) * (0-(0)));
        }
        else if (tickAnim >= 215 && tickAnim < 255) {
            xx = 5.5 + (((tickAnim - 215) / 40) * (-13.25-(5.5)));
            yy = 0 + (((tickAnim - 215) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 215) / 40) * (0-(0)));
        }
        else if (tickAnim >= 255 && tickAnim < 287) {
            xx = -13.25 + (((tickAnim - 255) / 32) * (-13.25-(-13.25)));
            yy = 0 + (((tickAnim - 255) / 32) * (0-(0)));
            zz = 0 + (((tickAnim - 255) / 32) * (0-(0)));
        }
        else if (tickAnim >= 287 && tickAnim < 311) {
            xx = -13.25 + (((tickAnim - 287) / 24) * (-3.61-(-13.25)));
            yy = 0 + (((tickAnim - 287) / 24) * (0-(0)));
            zz = 0 + (((tickAnim - 287) / 24) * (0-(0)));
        }
        else if (tickAnim >= 311 && tickAnim < 324) {
            xx = -3.61 + (((tickAnim - 311) / 13) * (-2.675+Math.sin((Math.PI/180)*(((double)tickAnim/20)*140))*10-(-3.61)));
            yy = 0 + (((tickAnim - 311) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 311) / 13) * (0-(0)));
        }
        else if (tickAnim >= 324 && tickAnim < 340) {
            xx = -2.675+Math.sin((Math.PI/180)*(((double)tickAnim/20)*140))*10 + (((tickAnim - 324) / 16) * (0-(-2.675+Math.sin((Math.PI/180)*(((double)tickAnim/20)*140))*10)));
            yy = 0 + (((tickAnim - 324) / 16) * (0-(0)));
            zz = 0 + (((tickAnim - 324) / 16) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck8, neck8.rotateAngleX + (float) Math.toRadians(xx), neck8.rotateAngleY + (float) Math.toRadians(yy), neck8.rotateAngleZ + (float) Math.toRadians(zz));

        this.neck8.rotationPointX = this.neck8.rotationPointX + (float)(0);
        this.neck8.rotationPointY = this.neck8.rotationPointY - (float)(0);
        this.neck8.rotationPointZ = this.neck8.rotationPointZ + (float)(0);



        if (tickAnim >= 0 && tickAnim < 58) {
            xx = 0 + (((tickAnim - 0) / 58) * (4.13-(0)));
            yy = 0 + (((tickAnim - 0) / 58) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 58) * (0-(0)));
        }
        else if (tickAnim >= 58 && tickAnim < 85) {
            xx = 4.13 + (((tickAnim - 58) / 27) * (-3.5-(4.13)));
            yy = 0 + (((tickAnim - 58) / 27) * (0-(0)));
            zz = 0 + (((tickAnim - 58) / 27) * (0-(0)));
        }
        else if (tickAnim >= 85 && tickAnim < 139) {
            xx = -3.5 + (((tickAnim - 85) / 54) * (-8.51-(-3.5)));
            yy = 0 + (((tickAnim - 85) / 54) * (0-(0)));
            zz = 0 + (((tickAnim - 85) / 54) * (0-(0)));
        }
        else if (tickAnim >= 139 && tickAnim < 154) {
            xx = -8.51 + (((tickAnim - 139) / 15) * (3.9-(-8.51)));
            yy = 0 + (((tickAnim - 139) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 139) / 15) * (0-(0)));
        }
        else if (tickAnim >= 154 && tickAnim < 170) {
            xx = 3.9 + (((tickAnim - 154) / 16) * (0-(3.9)));
            yy = 0 + (((tickAnim - 154) / 16) * (0-(0)));
            zz = 0 + (((tickAnim - 154) / 16) * (0-(0)));
        }
        else if (tickAnim >= 170 && tickAnim < 228) {
            xx = 0 + (((tickAnim - 170) / 58) * (4.13-(0)));
            yy = 0 + (((tickAnim - 170) / 58) * (0-(0)));
            zz = 0 + (((tickAnim - 170) / 58) * (0-(0)));
        }
        else if (tickAnim >= 228 && tickAnim < 255) {
            xx = 4.13 + (((tickAnim - 228) / 27) * (-3.5-(4.13)));
            yy = 0 + (((tickAnim - 228) / 27) * (0-(0)));
            zz = 0 + (((tickAnim - 228) / 27) * (0-(0)));
        }
        else if (tickAnim >= 255 && tickAnim < 309) {
            xx = -3.5 + (((tickAnim - 255) / 54) * (-8.51-(-3.5)));
            yy = 0 + (((tickAnim - 255) / 54) * (0-(0)));
            zz = 0 + (((tickAnim - 255) / 54) * (0-(0)));
        }
        else if (tickAnim >= 309 && tickAnim < 324) {
            xx = -8.51 + (((tickAnim - 309) / 15) * (3.9-(-8.51)));
            yy = 0 + (((tickAnim - 309) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 309) / 15) * (0-(0)));
        }
        else if (tickAnim >= 324 && tickAnim < 340) {
            xx = 3.9 + (((tickAnim - 324) / 16) * (0-(3.9)));
            yy = 0 + (((tickAnim - 324) / 16) * (0-(0)));
            zz = 0 + (((tickAnim - 324) / 16) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 170 && tickAnim < 340) {
            xx = 0 + (((tickAnim - 170) / 170) * (0-(0)));
            yy = 0 + (((tickAnim - 170) / 170) * (0-(0)));
            zz = 0 + (((tickAnim - 170) / 170) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.head.rotationPointX = this.head.rotationPointX + (float)(xx);
        this.head.rotationPointY = this.head.rotationPointY - (float)(yy);
        this.head.rotationPointZ = this.head.rotationPointZ + (float)(zz);




        if (tickAnim >= 62 && tickAnim < 78) {
            xx = 0 + (((tickAnim - 62) / 16) * (24-(0)));
            yy = 0 + (((tickAnim - 62) / 16) * (0-(0)));
            zz = 0 + (((tickAnim - 62) / 16) * (0-(0)));
        }
        else if (tickAnim >= 78 && tickAnim < 85) {
            xx = 24 + (((tickAnim - 78) / 7) * (0-(24)));
            yy = 0 + (((tickAnim - 78) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 78) / 7) * (0-(0)));
        }
        else if (tickAnim >= 85 && tickAnim < 232) {
            xx = 0 + (((tickAnim - 85) / 147) * (0-(0)));
            yy = 0 + (((tickAnim - 85) / 147) * (0-(0)));
            zz = 0 + (((tickAnim - 85) / 147) * (0-(0)));
        }
        else if (tickAnim >= 232 && tickAnim < 248) {
            xx = 0 + (((tickAnim - 232) / 16) * (24-(0)));
            yy = 0 + (((tickAnim - 232) / 16) * (0-(0)));
            zz = 0 + (((tickAnim - 232) / 16) * (0-(0)));
        }
        else if (tickAnim >= 248 && tickAnim < 255) {
            xx = 24 + (((tickAnim - 248) / 7) * (0-(24)));
            yy = 0 + (((tickAnim - 248) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 248) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(xx), jaw.rotateAngleY + (float) Math.toRadians(yy), jaw.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 45 && tickAnim < 78) {
            xx = 0 + (((tickAnim - 45) / 33) * (-0.05-(0)));
            yy = 0 + (((tickAnim - 45) / 33) * (0-(0)));
            zz = 0 + (((tickAnim - 45) / 33) * (0-(0)));
        }
        else if (tickAnim >= 78 && tickAnim < 85) {
            xx = -0.05 + (((tickAnim - 78) / 7) * (8.25-(-0.05)));
            yy = 0 + (((tickAnim - 78) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 78) / 7) * (0-(0)));
        }
        else if (tickAnim >= 85 && tickAnim < 215) {
            xx = 8.25 + (((tickAnim - 85) / 130) * (0-(8.25)));
            yy = 0 + (((tickAnim - 85) / 130) * (0-(0)));
            zz = 0 + (((tickAnim - 85) / 130) * (0-(0)));
        }
        else if (tickAnim >= 215 && tickAnim < 248) {
            xx = 0 + (((tickAnim - 215) / 33) * (-0.05-(0)));
            yy = 0 + (((tickAnim - 215) / 33) * (0-(0)));
            zz = 0 + (((tickAnim - 215) / 33) * (0-(0)));
        }
        else if (tickAnim >= 248 && tickAnim < 255) {
            xx = -0.05 + (((tickAnim - 248) / 7) * (8.25-(-0.05)));
            yy = 0 + (((tickAnim - 248) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 248) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(throat, throat.rotateAngleX + (float) Math.toRadians(xx), throat.rotateAngleY + (float) Math.toRadians(yy), throat.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 45 && tickAnim < 215) {
            xx = 0 + (((tickAnim - 45) / 170) * (0-(0)));
            yy = 0 + (((tickAnim - 45) / 170) * (0-(0)));
            zz = 0 + (((tickAnim - 45) / 170) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.throat.rotationPointX = this.throat.rotationPointX + (float)(xx);
        this.throat.rotationPointY = this.throat.rotationPointY - (float)(yy);
        this.throat.rotationPointZ = this.throat.rotationPointZ + (float)(zz);


        if (tickAnim >= 0 && tickAnim < 45) {
            xx = 1 + (((tickAnim - 0) / 45) * (1-(1)));
            yy = 1 + (((tickAnim - 0) / 45) * (1-(1)));
            zz = 1 + (((tickAnim - 0) / 45) * (1-(1)));
        }
        else if (tickAnim >= 45 && tickAnim < 85) {
            xx = 1 + (((tickAnim - 45) / 40) * (1-(1)));
            yy = 1 + (((tickAnim - 45) / 40) * (1.3-(1)));
            zz = 1 + (((tickAnim - 45) / 40) * (1.2-(1)));
        }
        else if (tickAnim >= 85 && tickAnim < 170) {
            xx = 1 + (((tickAnim - 85) / 85) * (1-(1)));
            yy = 1.3 + (((tickAnim - 85) / 85) * (1-(1.3)));
            zz = 1.2 + (((tickAnim - 85) / 85) * (1-(1.2)));
        }
        else if (tickAnim >= 170 && tickAnim < 215) {
            xx = 1 + (((tickAnim - 170) / 45) * (1-(1)));
            yy = 1 + (((tickAnim - 170) / 45) * (1-(1)));
            zz = 1 + (((tickAnim - 170) / 45) * (1-(1)));
        }
        else if (tickAnim >= 215 && tickAnim < 255) {
            xx = 1 + (((tickAnim - 215) / 40) * (1-(1)));
            yy = 1 + (((tickAnim - 215) / 40) * (1.3-(1)));
            zz = 1 + (((tickAnim - 215) / 40) * (1.2-(1)));
        }
        else {
            xx = 1;
            yy = 1;
            zz = 1;
        }
        this.throat.setScale((float)xx, (float)yy, (float)zz);




        if (tickAnim >= 0 && tickAnim < 21) {
            xx = 0 + (((tickAnim - 0) / 21) * (1.5-(0)));
            yy = 0 + (((tickAnim - 0) / 21) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 21) * (0-(0)));
        }
        else if (tickAnim >= 21 && tickAnim < 170) {
            xx = 1.5 + (((tickAnim - 21) / 149) * (1.5-(1.5)));
            yy = 0 + (((tickAnim - 21) / 149) * (0-(0)));
            zz = 0 + (((tickAnim - 21) / 149) * (0-(0)));
        }
        else if (tickAnim >= 170 && tickAnim < 190) {
            xx = 1.5 + (((tickAnim - 170) / 20) * (0.6-(1.5)));
            yy = 0 + (((tickAnim - 170) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 170) / 20) * (0-(0)));
        }
        else if (tickAnim >= 190 && tickAnim < 311) {
            xx = 0.6 + (((tickAnim - 190) / 121) * (1-(0.6)));
            yy = 0 + (((tickAnim - 190) / 121) * (0-(0)));
            zz = 0 + (((tickAnim - 190) / 121) * (0-(0)));
        }
        else if (tickAnim >= 311 && tickAnim < 340) {
            xx = 1 + (((tickAnim - 311) / 29) * (0-(1)));
            yy = 0 + (((tickAnim - 311) / 29) * (0-(0)));
            zz = 0 + (((tickAnim - 311) / 29) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg1, leftLeg1.rotateAngleX + (float) Math.toRadians(xx), leftLeg1.rotateAngleY + (float) Math.toRadians(yy), leftLeg1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (1.75-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 170) {
            xx = 1.75 + (((tickAnim - 20) / 150) * (1.75-(1.75)));
            yy = 0 + (((tickAnim - 20) / 150) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 150) * (0-(0)));
        }
        else if (tickAnim >= 170 && tickAnim < 190) {
            xx = 1.75 + (((tickAnim - 170) / 20) * (-1.25-(1.75)));
            yy = 0 + (((tickAnim - 170) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 170) / 20) * (0-(0)));
        }
        else if (tickAnim >= 190 && tickAnim < 311) {
            xx = -1.25 + (((tickAnim - 190) / 121) * (-4-(-1.25)));
            yy = 0 + (((tickAnim - 190) / 121) * (0-(0)));
            zz = 0 + (((tickAnim - 190) / 121) * (0-(0)));
        }
        else if (tickAnim >= 311 && tickAnim < 340) {
            xx = -4 + (((tickAnim - 311) / 29) * (0-(-4)));
            yy = 0 + (((tickAnim - 311) / 29) * (0-(0)));
            zz = 0 + (((tickAnim - 311) / 29) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftFoot, leftFoot.rotateAngleX + (float) Math.toRadians(xx), leftFoot.rotateAngleY + (float) Math.toRadians(yy), leftFoot.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (1.5-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 170) {
            xx = 1.5 + (((tickAnim - 20) / 150) * (0-(1.5)));
            yy = 0 + (((tickAnim - 20) / 150) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 150) * (0-(0)));
        }
        else if (tickAnim >= 170 && tickAnim < 190) {
            xx = 0 + (((tickAnim - 170) / 20) * (0.6-(0)));
            yy = 0 + (((tickAnim - 170) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 170) / 20) * (0-(0)));
        }
        else if (tickAnim >= 190 && tickAnim < 311) {
            xx = 0.6 + (((tickAnim - 190) / 121) * (1-(0.6)));
            yy = 0 + (((tickAnim - 190) / 121) * (0-(0)));
            zz = 0 + (((tickAnim - 190) / 121) * (0-(0)));
        }
        else if (tickAnim >= 311 && tickAnim < 340) {
            xx = 1 + (((tickAnim - 311) / 29) * (0-(1)));
            yy = 0 + (((tickAnim - 311) / 29) * (0-(0)));
            zz = 0 + (((tickAnim - 311) / 29) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg1, rightLeg1.rotateAngleX + (float) Math.toRadians(xx), rightLeg1.rotateAngleY + (float) Math.toRadians(yy), rightLeg1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (1.75-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 170) {
            xx = 1.75 + (((tickAnim - 20) / 150) * (1.75-(1.75)));
            yy = 0 + (((tickAnim - 20) / 150) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 150) * (0-(0)));
        }
        else if (tickAnim >= 170 && tickAnim < 190) {
            xx = 1.75 + (((tickAnim - 170) / 20) * (-1.25-(1.75)));
            yy = 0 + (((tickAnim - 170) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 170) / 20) * (0-(0)));
        }
        else if (tickAnim >= 190 && tickAnim < 340) {
            xx = -1.25 + (((tickAnim - 190) / 150) * (0-(-1.25)));
            yy = 0 + (((tickAnim - 190) / 150) * (0-(0)));
            zz = 0 + (((tickAnim - 190) / 150) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightFoot, rightFoot.rotateAngleX + (float) Math.toRadians(xx), rightFoot.rotateAngleY + (float) Math.toRadians(yy), rightFoot.rotateAngleZ + (float) Math.toRadians(zz));



        this.setRotateAngle(leftLeg2, leftLeg2.rotateAngleX + (float) Math.toRadians(0), leftLeg2.rotateAngleY + (float) Math.toRadians(0), leftLeg2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(rightLeg2, rightLeg2.rotateAngleX + (float) Math.toRadians(0), rightLeg2.rotateAngleY + (float) Math.toRadians(0), rightLeg2.rotateAngleZ + (float) Math.toRadians(0));

    }
    public void animNest(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraXinjiangtitan entity = (EntityPrehistoricFloraXinjiangtitan) entitylivingbaseIn;
        int animCycle = 50;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (27.50565-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (-1.70851-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (-0.37888-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 27) {
            xx = 27.50565 + (((tickAnim - 15) / 12) * (0-(27.50565)));
            yy = -1.70851 + (((tickAnim - 15) / 12) * (0-(-1.70851)));
            zz = -0.37888 + (((tickAnim - 15) / 12) * (0-(-0.37888)));
        }
        else if (tickAnim >= 27 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 27) / 13) * (27.50565-(0)));
            yy = 0 + (((tickAnim - 27) / 13) * (-1.70851-(0)));
            zz = 0 + (((tickAnim - 27) / 13) * (-0.37888-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = 27.50565 + (((tickAnim - 40) / 10) * (0-(27.50565)));
            yy = -1.70851 + (((tickAnim - 40) / 10) * (0-(-1.70851)));
            zz = -0.37888 + (((tickAnim - 40) / 10) * (0-(-0.37888)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg1, leftLeg1.rotateAngleX + (float) Math.toRadians(xx), leftLeg1.rotateAngleY + (float) Math.toRadians(yy), leftLeg1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (8.25-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 23) {
            xx = 8.25 + (((tickAnim - 15) / 8) * (-19.55-(8.25)));
            yy = 0 + (((tickAnim - 15) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 8) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 27) {
            xx = -19.55 + (((tickAnim - 23) / 4) * (0-(-19.55)));
            yy = 0 + (((tickAnim - 23) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 4) * (0-(0)));
        }
        else if (tickAnim >= 27 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 27) / 13) * (8.25-(0)));
            yy = 0 + (((tickAnim - 27) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 27) / 13) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 46) {
            xx = 8.25 + (((tickAnim - 40) / 6) * (-19.55-(8.25)));
            yy = 0 + (((tickAnim - 40) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 6) * (0-(0)));
        }
        else if (tickAnim >= 46 && tickAnim < 50) {
            xx = -19.55 + (((tickAnim - 46) / 4) * (0-(-19.55)));
            yy = 0 + (((tickAnim - 46) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 46) / 4) * (0-(0)));
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
        else if (tickAnim >= 15 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 15) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 15) / 8) * (5.475-(0)));
            zz = 0 + (((tickAnim - 15) / 8) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 27) {
            xx = 0 + (((tickAnim - 23) / 4) * (0-(0)));
            yy = 5.475 + (((tickAnim - 23) / 4) * (0-(5.475)));
            zz = 0 + (((tickAnim - 23) / 4) * (0-(0)));
        }
        else if (tickAnim >= 27 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 27) / 13) * (0-(0)));
            yy = 0 + (((tickAnim - 27) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 27) / 13) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 46) {
            xx = 0 + (((tickAnim - 40) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 40) / 6) * (5.475-(0)));
            zz = 0 + (((tickAnim - 40) / 6) * (0-(0)));
        }
        else if (tickAnim >= 46 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 46) / 4) * (0-(0)));
            yy = 5.475 + (((tickAnim - 46) / 4) * (0-(5.475)));
            zz = 0 + (((tickAnim - 46) / 4) * (0-(0)));
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
            xx = 0 + (((tickAnim - 0) / 15) * (27-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 23) {
            xx = 27 + (((tickAnim - 15) / 8) * (19.75-(27)));
            yy = 0 + (((tickAnim - 15) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 8) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 27) {
            xx = 19.75 + (((tickAnim - 23) / 4) * (0-(19.75)));
            yy = 0 + (((tickAnim - 23) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 4) * (0-(0)));
        }
        else if (tickAnim >= 27 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 27) / 13) * (27-(0)));
            yy = 0 + (((tickAnim - 27) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 27) / 13) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 46) {
            xx = 27 + (((tickAnim - 40) / 6) * (19.75-(27)));
            yy = 0 + (((tickAnim - 40) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 6) * (0-(0)));
        }
        else if (tickAnim >= 46 && tickAnim < 50) {
            xx = 19.75 + (((tickAnim - 46) / 4) * (0-(19.75)));
            yy = 0 + (((tickAnim - 46) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 46) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftFoot, leftFoot.rotateAngleX + (float) Math.toRadians(xx), leftFoot.rotateAngleY + (float) Math.toRadians(yy), leftFoot.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 0) / 23) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 23) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 23) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 46) {
            xx = 0 + (((tickAnim - 23) / 23) * (0-(0)));
            yy = 0 + (((tickAnim - 23) / 23) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 23) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftFoot.rotationPointX = this.leftFoot.rotationPointX + (float)(xx);
        this.leftFoot.rotationPointY = this.leftFoot.rotationPointY - (float)(yy);
        this.leftFoot.rotationPointZ = this.leftFoot.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (-61-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 23) {
            xx = -61 + (((tickAnim - 15) / 8) * (0-(-61)));
            yy = 0 + (((tickAnim - 15) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 8) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 27) {
            xx = 0 + (((tickAnim - 23) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 23) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 4) * (0-(0)));
        }
        else if (tickAnim >= 27 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 27) / 13) * (-61-(0)));
            yy = 0 + (((tickAnim - 27) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 27) / 13) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 46) {
            xx = -61 + (((tickAnim - 40) / 6) * (0-(-61)));
            yy = 0 + (((tickAnim - 40) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 6) * (0-(0)));
        }
        else if (tickAnim >= 46 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 46) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 46) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 46) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftToes, leftToes.rotateAngleX + (float) Math.toRadians(xx), leftToes.rotateAngleY + (float) Math.toRadians(yy), leftToes.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (-0.775-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (1.725-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 15) / 8) * (0-(0)));
            yy = -0.775 + (((tickAnim - 15) / 8) * (0-(-0.775)));
            zz = 1.725 + (((tickAnim - 15) / 8) * (0-(1.725)));
        }
        else if (tickAnim >= 23 && tickAnim < 27) {
            xx = 0 + (((tickAnim - 23) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 23) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 4) * (0-(0)));
        }
        else if (tickAnim >= 27 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 27) / 13) * (0-(0)));
            yy = 0 + (((tickAnim - 27) / 13) * (-0.775-(0)));
            zz = 0 + (((tickAnim - 27) / 13) * (1.725-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 46) {
            xx = 0 + (((tickAnim - 40) / 6) * (0-(0)));
            yy = -0.775 + (((tickAnim - 40) / 6) * (0-(-0.775)));
            zz = 1.725 + (((tickAnim - 40) / 6) * (0-(1.725)));
        }
        else if (tickAnim >= 46 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 46) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 46) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 46) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftToes.rotationPointX = this.leftToes.rotationPointX + (float)(xx);
        this.leftToes.rotationPointY = this.leftToes.rotationPointY - (float)(yy);
        this.leftToes.rotationPointZ = this.leftToes.rotationPointZ + (float)(zz);

    }
    public void animLay(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraXinjiangtitan entity = (EntityPrehistoricFloraXinjiangtitan) entitylivingbaseIn;
        int animCycle = 50;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (-17-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = -17 + (((tickAnim - 15) / 20) * (-17-(-17)));
            yy = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = -17 + (((tickAnim - 35) / 15) * (0-(-17)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(hips, hips.rotateAngleX + (float) Math.toRadians(xx), hips.rotateAngleY + (float) Math.toRadians(yy), hips.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (-7.35-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            yy = -7.35 + (((tickAnim - 15) / 20) * (-7.35-(-7.35)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            yy = -7.35 + (((tickAnim - 35) / 15) * (0-(-7.35)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.hips.rotationPointX = this.hips.rotationPointX + (float)(xx);
        this.hips.rotationPointY = this.hips.rotationPointY - (float)(yy);
        this.hips.rotationPointZ = this.hips.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (2.25-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = 2.25 + (((tickAnim - 15) / 20) * (2.25-(2.25)));
            yy = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 39) {
            xx = 2.25 + (((tickAnim - 35) / 4) * (-6.87-(2.25)));
            yy = 0 + (((tickAnim - 35) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 4) * (0-(0)));
        }
        else if (tickAnim >= 39 && tickAnim < 43) {
            xx = -6.87 + (((tickAnim - 39) / 4) * (-7.98-(-6.87)));
            yy = 0 + (((tickAnim - 39) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 39) / 4) * (0-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 50) {
            xx = -7.98 + (((tickAnim - 43) / 7) * (0-(-7.98)));
            yy = 0 + (((tickAnim - 43) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 43) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail5, tail5.rotateAngleX + (float) Math.toRadians(xx), tail5.rotateAngleY + (float) Math.toRadians(yy), tail5.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 0) / 11) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 11) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 11) / 4) * (10-(0)));
            yy = 0 + (((tickAnim - 11) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 4) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = 10 + (((tickAnim - 15) / 20) * (10-(10)));
            yy = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 39) {
            xx = 10 + (((tickAnim - 35) / 4) * (1.47-(10)));
            yy = 0 + (((tickAnim - 35) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 4) * (0-(0)));
        }
        else if (tickAnim >= 39 && tickAnim < 43) {
            xx = 1.47 + (((tickAnim - 39) / 4) * (-7.1-(1.47)));
            yy = 0 + (((tickAnim - 39) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 39) / 4) * (0-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 50) {
            xx = -7.1 + (((tickAnim - 43) / 7) * (0-(-7.1)));
            yy = 0 + (((tickAnim - 43) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 43) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail6, tail6.rotateAngleX + (float) Math.toRadians(xx), tail6.rotateAngleY + (float) Math.toRadians(yy), tail6.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 0) / 11) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 11) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 11) / 4) * (7.25-(0)));
            yy = 0 + (((tickAnim - 11) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 4) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = 7.25 + (((tickAnim - 15) / 20) * (7.25-(7.25)));
            yy = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 39) {
            xx = 7.25 + (((tickAnim - 35) / 4) * (13.24-(7.25)));
            yy = 0 + (((tickAnim - 35) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 4) * (0-(0)));
        }
        else if (tickAnim >= 39 && tickAnim < 43) {
            xx = 13.24 + (((tickAnim - 39) / 4) * (-3.1-(13.24)));
            yy = 0 + (((tickAnim - 39) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 39) / 4) * (0-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 50) {
            xx = -3.1 + (((tickAnim - 43) / 7) * (0-(-3.1)));
            yy = 0 + (((tickAnim - 43) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 43) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail7, tail7.rotateAngleX + (float) Math.toRadians(xx), tail7.rotateAngleY + (float) Math.toRadians(yy), tail7.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (7.75-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = 7.75 + (((tickAnim - 15) / 20) * (7.75-(7.75)));
            yy = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 7.75 + (((tickAnim - 35) / 15) * (0-(7.75)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
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
        this.body.rotationPointX = this.body.rotationPointX + (float)(xx);
        this.body.rotationPointY = this.body.rotationPointY - (float)(yy);
        this.body.rotationPointZ = this.body.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (8-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = 8 + (((tickAnim - 15) / 20) * (8-(8)));
            yy = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 8 + (((tickAnim - 35) / 15) * (0-(8)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(xx), chest.rotateAngleY + (float) Math.toRadians(yy), chest.rotateAngleZ + (float) Math.toRadians(zz));


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
        this.chest.rotationPointX = this.chest.rotationPointX + (float)(xx);
        this.chest.rotationPointY = this.chest.rotationPointY - (float)(yy);
        this.chest.rotationPointZ = this.chest.rotationPointZ + (float)(zz);




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
        this.setRotateAngle(leftArm1, leftArm1.rotateAngleX + (float) Math.toRadians(xx), leftArm1.rotateAngleY + (float) Math.toRadians(yy), leftArm1.rotateAngleZ + (float) Math.toRadians(zz));


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
        this.leftArm1.rotationPointX = this.leftArm1.rotationPointX + (float)(xx);
        this.leftArm1.rotationPointY = this.leftArm1.rotationPointY - (float)(yy);
        this.leftArm1.rotationPointZ = this.leftArm1.rotationPointZ + (float)(zz);




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
        this.setRotateAngle(leftArm2, leftArm2.rotateAngleX + (float) Math.toRadians(xx), leftArm2.rotateAngleY + (float) Math.toRadians(yy), leftArm2.rotateAngleZ + (float) Math.toRadians(zz));




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
        this.setRotateAngle(leftHand, leftHand.rotateAngleX + (float) Math.toRadians(xx), leftHand.rotateAngleY + (float) Math.toRadians(yy), leftHand.rotateAngleZ + (float) Math.toRadians(zz));




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
        this.setRotateAngle(rightArm1, rightArm1.rotateAngleX + (float) Math.toRadians(xx), rightArm1.rotateAngleY + (float) Math.toRadians(yy), rightArm1.rotateAngleZ + (float) Math.toRadians(zz));


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
        this.rightArm1.rotationPointX = this.rightArm1.rotationPointX + (float)(xx);
        this.rightArm1.rotationPointY = this.rightArm1.rotationPointY - (float)(yy);
        this.rightArm1.rotationPointZ = this.rightArm1.rotationPointZ + (float)(zz);




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
        this.setRotateAngle(rightArm2, rightArm2.rotateAngleX + (float) Math.toRadians(xx), rightArm2.rotateAngleY + (float) Math.toRadians(yy), rightArm2.rotateAngleZ + (float) Math.toRadians(zz));


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
        this.rightArm2.rotationPointX = this.rightArm2.rotationPointX + (float)(xx);
        this.rightArm2.rotationPointY = this.rightArm2.rotationPointY - (float)(yy);
        this.rightArm2.rotationPointZ = this.rightArm2.rotationPointZ + (float)(zz);




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
        this.setRotateAngle(rightHand, rightHand.rotateAngleX + (float) Math.toRadians(xx), rightHand.rotateAngleY + (float) Math.toRadians(yy), rightHand.rotateAngleZ + (float) Math.toRadians(zz));


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
        this.rightHand.rotationPointX = this.rightHand.rotationPointX + (float)(xx);
        this.rightHand.rotationPointY = this.rightHand.rotationPointY - (float)(yy);
        this.rightHand.rotationPointZ = this.rightHand.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (5.75-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = 5.75 + (((tickAnim - 15) / 20) * (5.75-(5.75)));
            yy = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 5.75 + (((tickAnim - 35) / 15) * (0-(5.75)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck1, neck1.rotateAngleX + (float) Math.toRadians(xx), neck1.rotateAngleY + (float) Math.toRadians(yy), neck1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (3.75-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = 3.75 + (((tickAnim - 15) / 20) * (3.75-(3.75)));
            yy = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 3.75 + (((tickAnim - 35) / 15) * (0-(3.75)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(xx), neck2.rotateAngleY + (float) Math.toRadians(yy), neck2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (-2.75-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = -2.75 + (((tickAnim - 15) / 20) * (-2.75-(-2.75)));
            yy = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = -2.75 + (((tickAnim - 35) / 15) * (0-(-2.75)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(xx), neck3.rotateAngleY + (float) Math.toRadians(yy), neck3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (-3.5-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = -3.5 + (((tickAnim - 15) / 20) * (-3.5-(-3.5)));
            yy = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = -3.5 + (((tickAnim - 35) / 15) * (0-(-3.5)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck4, neck4.rotateAngleX + (float) Math.toRadians(xx), neck4.rotateAngleY + (float) Math.toRadians(yy), neck4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (-4.75-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = -4.75 + (((tickAnim - 15) / 20) * (-4.75-(-4.75)));
            yy = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = -4.75 + (((tickAnim - 35) / 15) * (0-(-4.75)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck5, neck5.rotateAngleX + (float) Math.toRadians(xx), neck5.rotateAngleY + (float) Math.toRadians(yy), neck5.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (1.75-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = 1.75 + (((tickAnim - 15) / 20) * (1.75-(1.75)));
            yy = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 1.75 + (((tickAnim - 35) / 15) * (0-(1.75)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck7, neck7.rotateAngleX + (float) Math.toRadians(xx), neck7.rotateAngleY + (float) Math.toRadians(yy), neck7.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (5.75-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = 5.75 + (((tickAnim - 15) / 20) * (5.75-(5.75)));
            yy = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 5.75 + (((tickAnim - 35) / 15) * (0-(5.75)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck8, neck8.rotateAngleX + (float) Math.toRadians(xx), neck8.rotateAngleY + (float) Math.toRadians(yy), neck8.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (-13-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (-11.5-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = -13 + (((tickAnim - 15) / 20) * (-13-(-13)));
            yy = -11.5 + (((tickAnim - 15) / 20) * (-11.5-(-11.5)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = -13 + (((tickAnim - 35) / 15) * (0-(-13)));
            yy = -11.5 + (((tickAnim - 35) / 15) * (0-(-11.5)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg1, leftLeg1.rotateAngleX + (float) Math.toRadians(xx), leftLeg1.rotateAngleY + (float) Math.toRadians(yy), leftLeg1.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (-7.575-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            yy = -7.575 + (((tickAnim - 15) / 20) * (-7.575-(-7.575)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            yy = -7.575 + (((tickAnim - 35) / 15) * (0-(-7.575)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftLeg1.rotationPointX = this.leftLeg1.rotationPointX + (float)(xx);
        this.leftLeg1.rotationPointY = this.leftLeg1.rotationPointY - (float)(yy);
        this.leftLeg1.rotationPointZ = this.leftLeg1.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (31.5-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = 31.5 + (((tickAnim - 15) / 20) * (31.5-(31.5)));
            yy = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 31.5 + (((tickAnim - 35) / 15) * (0-(31.5)));
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
            yy = 0 + (((tickAnim - 0) / 15) * (2.425-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (-0.45-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            yy = 2.425 + (((tickAnim - 15) / 20) * (2.425-(2.425)));
            zz = -0.45 + (((tickAnim - 15) / 20) * (-0.45-(-0.45)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            yy = 2.425 + (((tickAnim - 35) / 15) * (0-(2.425)));
            zz = -0.45 + (((tickAnim - 35) / 15) * (0-(-0.45)));
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
            xx = 0 + (((tickAnim - 0) / 15) * (-15.5-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = -15.5 + (((tickAnim - 15) / 20) * (-15.5-(-15.5)));
            yy = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = -15.5 + (((tickAnim - 35) / 15) * (0-(-15.5)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftFoot, leftFoot.rotateAngleX + (float) Math.toRadians(xx), leftFoot.rotateAngleY + (float) Math.toRadians(yy), leftFoot.rotateAngleZ + (float) Math.toRadians(zz));




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
        this.setRotateAngle(leftToes, leftToes.rotateAngleX + (float) Math.toRadians(xx), leftToes.rotateAngleY + (float) Math.toRadians(yy), leftToes.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (-13-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (11.5-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = -13 + (((tickAnim - 15) / 20) * (-13-(-13)));
            yy = 11.5 + (((tickAnim - 15) / 20) * (11.5-(11.5)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = -13 + (((tickAnim - 35) / 15) * (0-(-13)));
            yy = 11.5 + (((tickAnim - 35) / 15) * (0-(11.5)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg1, rightLeg1.rotateAngleX + (float) Math.toRadians(xx), rightLeg1.rotateAngleY + (float) Math.toRadians(yy), rightLeg1.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (-7.575-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            yy = -7.575 + (((tickAnim - 15) / 20) * (-7.575-(-7.575)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            yy = -7.575 + (((tickAnim - 35) / 15) * (0-(-7.575)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightLeg1.rotationPointX = this.rightLeg1.rotationPointX + (float)(xx);
        this.rightLeg1.rotationPointY = this.rightLeg1.rotationPointY - (float)(yy);
        this.rightLeg1.rotationPointZ = this.rightLeg1.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (31.5-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = 31.5 + (((tickAnim - 15) / 20) * (31.5-(31.5)));
            yy = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 31.5 + (((tickAnim - 35) / 15) * (0-(31.5)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg2, rightLeg2.rotateAngleX + (float) Math.toRadians(xx), rightLeg2.rotateAngleY + (float) Math.toRadians(yy), rightLeg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (2.425-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (-0.45-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            yy = 2.425 + (((tickAnim - 15) / 20) * (2.425-(2.425)));
            zz = -0.45 + (((tickAnim - 15) / 20) * (-0.45-(-0.45)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            yy = 2.425 + (((tickAnim - 35) / 15) * (0-(2.425)));
            zz = -0.45 + (((tickAnim - 35) / 15) * (0-(-0.45)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightLeg2.rotationPointX = this.rightLeg2.rotationPointX + (float)(xx);
        this.rightLeg2.rotationPointY = this.rightLeg2.rotationPointY - (float)(yy);
        this.rightLeg2.rotationPointZ = this.rightLeg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (-15.5-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = -15.5 + (((tickAnim - 15) / 20) * (-15.5-(-15.5)));
            yy = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = -15.5 + (((tickAnim - 35) / 15) * (0-(-15.5)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightFoot, rightFoot.rotateAngleX + (float) Math.toRadians(xx), rightFoot.rotateAngleY + (float) Math.toRadians(yy), rightFoot.rotateAngleZ + (float) Math.toRadians(zz));




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
        this.setRotateAngle(rightToes, rightToes.rotateAngleX + (float) Math.toRadians(xx), rightToes.rotateAngleY + (float) Math.toRadians(yy), rightToes.rotateAngleZ + (float) Math.toRadians(zz));

    }
    public void animEat(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraXinjiangtitan entity = (EntityPrehistoricFloraXinjiangtitan) entitylivingbaseIn;
        int animCycle = 80;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (12.5-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 45) {
            xx = 12.5 + (((tickAnim - 40) / 5) * (12.5-(12.5)));
            yy = 0 + (((tickAnim - 40) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 5) * (0-(0)));
        }
        else if (tickAnim >= 45 && tickAnim < 80) {
            xx = 12.5 + (((tickAnim - 45) / 35) * (0-(12.5)));
            yy = 0 + (((tickAnim - 45) / 35) * (0-(0)));
            zz = 0 + (((tickAnim - 45) / 35) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(hips, hips.rotateAngleX + (float) Math.toRadians(xx), hips.rotateAngleY + (float) Math.toRadians(yy), hips.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 39) {
            xx = 0 + (((tickAnim - 0) / 39) * (-5-(0)));
            yy = 0 + (((tickAnim - 0) / 39) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 39) * (0-(0)));
        }
        else if (tickAnim >= 39 && tickAnim < 58) {
            xx = -5 + (((tickAnim - 39) / 19) * (1.5-(-5)));
            yy = 0 + (((tickAnim - 39) / 19) * (0-(0)));
            zz = 0 + (((tickAnim - 39) / 19) * (0-(0)));
        }
        else if (tickAnim >= 58 && tickAnim < 80) {
            xx = 1.5 + (((tickAnim - 58) / 22) * (0-(1.5)));
            yy = 0 + (((tickAnim - 58) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 58) / 22) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail1, tail1.rotateAngleX + (float) Math.toRadians(xx), tail1.rotateAngleY + (float) Math.toRadians(yy), tail1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 39) {
            xx = 0 + (((tickAnim - 0) / 39) * (-7-(0)));
            yy = 0 + (((tickAnim - 0) / 39) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 39) * (0-(0)));
        }
        else if (tickAnim >= 39 && tickAnim < 58) {
            xx = -7 + (((tickAnim - 39) / 19) * (-1.25-(-7)));
            yy = 0 + (((tickAnim - 39) / 19) * (0-(0)));
            zz = 0 + (((tickAnim - 39) / 19) * (0-(0)));
        }
        else if (tickAnim >= 58 && tickAnim < 80) {
            xx = -1.25 + (((tickAnim - 58) / 22) * (0-(-1.25)));
            yy = 0 + (((tickAnim - 58) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 58) / 22) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(xx), tail2.rotateAngleY + (float) Math.toRadians(yy), tail2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 39) {
            xx = 0 + (((tickAnim - 0) / 39) * (-7-(0)));
            yy = 0 + (((tickAnim - 0) / 39) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 39) * (0-(0)));
        }
        else if (tickAnim >= 39 && tickAnim < 58) {
            xx = -7 + (((tickAnim - 39) / 19) * (-3.75-(-7)));
            yy = 0 + (((tickAnim - 39) / 19) * (0-(0)));
            zz = 0 + (((tickAnim - 39) / 19) * (0-(0)));
        }
        else if (tickAnim >= 58 && tickAnim < 80) {
            xx = -3.75 + (((tickAnim - 58) / 22) * (0-(-3.75)));
            yy = 0 + (((tickAnim - 58) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 58) / 22) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(xx), tail3.rotateAngleY + (float) Math.toRadians(yy), tail3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 39) {
            xx = 0 + (((tickAnim - 0) / 39) * (-3.25-(0)));
            yy = 0 + (((tickAnim - 0) / 39) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 39) * (0-(0)));
        }
        else if (tickAnim >= 39 && tickAnim < 58) {
            xx = -3.25 + (((tickAnim - 39) / 19) * (-4-(-3.25)));
            yy = 0 + (((tickAnim - 39) / 19) * (0-(0)));
            zz = 0 + (((tickAnim - 39) / 19) * (0-(0)));
        }
        else if (tickAnim >= 58 && tickAnim < 80) {
            xx = -4 + (((tickAnim - 58) / 22) * (0-(-4)));
            yy = 0 + (((tickAnim - 58) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 58) / 22) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(xx), tail4.rotateAngleY + (float) Math.toRadians(yy), tail4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 39) {
            xx = 0 + (((tickAnim - 0) / 39) * (3.75-(0)));
            yy = 0 + (((tickAnim - 0) / 39) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 39) * (0-(0)));
        }
        else if (tickAnim >= 39 && tickAnim < 58) {
            xx = 3.75 + (((tickAnim - 39) / 19) * (-9-(3.75)));
            yy = 0 + (((tickAnim - 39) / 19) * (0-(0)));
            zz = 0 + (((tickAnim - 39) / 19) * (0-(0)));
        }
        else if (tickAnim >= 58 && tickAnim < 80) {
            xx = -9 + (((tickAnim - 58) / 22) * (0-(-9)));
            yy = 0 + (((tickAnim - 58) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 58) / 22) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail5, tail5.rotateAngleX + (float) Math.toRadians(xx), tail5.rotateAngleY + (float) Math.toRadians(yy), tail5.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 39) {
            xx = 0 + (((tickAnim - 0) / 39) * (7-(0)));
            yy = 0 + (((tickAnim - 0) / 39) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 39) * (0-(0)));
        }
        else if (tickAnim >= 39 && tickAnim < 58) {
            xx = 7 + (((tickAnim - 39) / 19) * (-10.25-(7)));
            yy = 0 + (((tickAnim - 39) / 19) * (0-(0)));
            zz = 0 + (((tickAnim - 39) / 19) * (0-(0)));
        }
        else if (tickAnim >= 58 && tickAnim < 80) {
            xx = -10.25 + (((tickAnim - 58) / 22) * (0-(-10.25)));
            yy = 0 + (((tickAnim - 58) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 58) / 22) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail6, tail6.rotateAngleX + (float) Math.toRadians(xx), tail6.rotateAngleY + (float) Math.toRadians(yy), tail6.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 39) {
            xx = 0 + (((tickAnim - 0) / 39) * (11.5-(0)));
            yy = 0 + (((tickAnim - 0) / 39) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 39) * (0-(0)));
        }
        else if (tickAnim >= 39 && tickAnim < 58) {
            xx = 11.5 + (((tickAnim - 39) / 19) * (-2.75-(11.5)));
            yy = 0 + (((tickAnim - 39) / 19) * (0-(0)));
            zz = 0 + (((tickAnim - 39) / 19) * (0-(0)));
        }
        else if (tickAnim >= 58 && tickAnim < 80) {
            xx = -2.75 + (((tickAnim - 58) / 22) * (0-(-2.75)));
            yy = 0 + (((tickAnim - 58) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 58) / 22) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail7, tail7.rotateAngleX + (float) Math.toRadians(xx), tail7.rotateAngleY + (float) Math.toRadians(yy), tail7.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (-8-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 45) {
            xx = -8 + (((tickAnim - 40) / 5) * (-8-(-8)));
            yy = 0 + (((tickAnim - 40) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 5) * (0-(0)));
        }
        else if (tickAnim >= 45 && tickAnim < 80) {
            xx = -8 + (((tickAnim - 45) / 35) * (0-(-8)));
            yy = 0 + (((tickAnim - 45) / 35) * (0-(0)));
            zz = 0 + (((tickAnim - 45) / 35) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(xx), body.rotateAngleY + (float) Math.toRadians(yy), body.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (11-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 45) {
            xx = 11 + (((tickAnim - 40) / 5) * (11-(11)));
            yy = 0 + (((tickAnim - 40) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 5) * (0-(0)));
        }
        else if (tickAnim >= 45 && tickAnim < 80) {
            xx = 11 + (((tickAnim - 45) / 35) * (0-(11)));
            yy = 0 + (((tickAnim - 45) / 35) * (0-(0)));
            zz = 0 + (((tickAnim - 45) / 35) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(xx), chest.rotateAngleY + (float) Math.toRadians(yy), chest.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (-31.77762-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (-13.47137-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (-24.77944-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 45) {
            xx = -31.77762 + (((tickAnim - 40) / 5) * (-31.77762-(-31.77762)));
            yy = -13.47137 + (((tickAnim - 40) / 5) * (-13.47137-(-13.47137)));
            zz = -24.77944 + (((tickAnim - 40) / 5) * (-24.77944-(-24.77944)));
        }
        else if (tickAnim >= 45 && tickAnim < 80) {
            xx = -31.77762 + (((tickAnim - 45) / 35) * (0-(-31.77762)));
            yy = -13.47137 + (((tickAnim - 45) / 35) * (0-(-13.47137)));
            zz = -24.77944 + (((tickAnim - 45) / 35) * (0-(-24.77944)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm1, leftArm1.rotateAngleX + (float) Math.toRadians(xx), leftArm1.rotateAngleY + (float) Math.toRadians(yy), leftArm1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (-8.11122-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (-3.04369-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (28.91748-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 45) {
            xx = -8.11122 + (((tickAnim - 40) / 5) * (-8.11122-(-8.11122)));
            yy = -3.04369 + (((tickAnim - 40) / 5) * (-3.04369-(-3.04369)));
            zz = 28.91748 + (((tickAnim - 40) / 5) * (28.91748-(28.91748)));
        }
        else if (tickAnim >= 45 && tickAnim < 80) {
            xx = -8.11122 + (((tickAnim - 45) / 35) * (0-(-8.11122)));
            yy = -3.04369 + (((tickAnim - 45) / 35) * (0-(-3.04369)));
            zz = 28.91748 + (((tickAnim - 45) / 35) * (0-(28.91748)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm2, leftArm2.rotateAngleX + (float) Math.toRadians(xx), leftArm2.rotateAngleY + (float) Math.toRadians(yy), leftArm2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (29-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 45) {
            xx = 29 + (((tickAnim - 40) / 5) * (29-(29)));
            yy = 0 + (((tickAnim - 40) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 5) * (0-(0)));
        }
        else if (tickAnim >= 45 && tickAnim < 80) {
            xx = 29 + (((tickAnim - 45) / 35) * (0-(29)));
            yy = 0 + (((tickAnim - 45) / 35) * (0-(0)));
            zz = 0 + (((tickAnim - 45) / 35) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftHand, leftHand.rotateAngleX + (float) Math.toRadians(xx), leftHand.rotateAngleY + (float) Math.toRadians(yy), leftHand.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (0.85-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 45) {
            xx = 0 + (((tickAnim - 40) / 5) * (0-(0)));
            yy = 0.85 + (((tickAnim - 40) / 5) * (0.85-(0.85)));
            zz = 0 + (((tickAnim - 40) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftHand.rotationPointX = this.leftHand.rotationPointX + (float)(xx);
        this.leftHand.rotationPointY = this.leftHand.rotationPointY - (float)(yy);
        this.leftHand.rotationPointZ = this.leftHand.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (-31.77762-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (13.4714-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (24.7794-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 45) {
            xx = -31.77762 + (((tickAnim - 40) / 5) * (-31.77762-(-31.77762)));
            yy = 13.4714 + (((tickAnim - 40) / 5) * (13.4714-(13.4714)));
            zz = 24.7794 + (((tickAnim - 40) / 5) * (24.7794-(24.7794)));
        }
        else if (tickAnim >= 45 && tickAnim < 80) {
            xx = -31.77762 + (((tickAnim - 45) / 35) * (0-(-31.77762)));
            yy = 13.4714 + (((tickAnim - 45) / 35) * (0-(13.4714)));
            zz = 24.7794 + (((tickAnim - 45) / 35) * (0-(24.7794)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm1, rightArm1.rotateAngleX + (float) Math.toRadians(xx), rightArm1.rotateAngleY + (float) Math.toRadians(yy), rightArm1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (-8.11122-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (-3.04369-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (-28.9175-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 45) {
            xx = -8.11122 + (((tickAnim - 40) / 5) * (-8.11122-(-8.11122)));
            yy = -3.04369 + (((tickAnim - 40) / 5) * (-3.04369-(-3.04369)));
            zz = -28.9175 + (((tickAnim - 40) / 5) * (-28.9175-(-28.9175)));
        }
        else if (tickAnim >= 45 && tickAnim < 80) {
            xx = -8.11122 + (((tickAnim - 45) / 35) * (0-(-8.11122)));
            yy = -3.04369 + (((tickAnim - 45) / 35) * (0-(-3.04369)));
            zz = -28.9175 + (((tickAnim - 45) / 35) * (0-(-28.9175)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm2, rightArm2.rotateAngleX + (float) Math.toRadians(xx), rightArm2.rotateAngleY + (float) Math.toRadians(yy), rightArm2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (29-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 45) {
            xx = 29 + (((tickAnim - 40) / 5) * (29-(29)));
            yy = 0 + (((tickAnim - 40) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 5) * (0-(0)));
        }
        else if (tickAnim >= 45 && tickAnim < 80) {
            xx = 29 + (((tickAnim - 45) / 35) * (0-(29)));
            yy = 0 + (((tickAnim - 45) / 35) * (0-(0)));
            zz = 0 + (((tickAnim - 45) / 35) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightHand, rightHand.rotateAngleX + (float) Math.toRadians(xx), rightHand.rotateAngleY + (float) Math.toRadians(yy), rightHand.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (0.85-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 45) {
            xx = 0 + (((tickAnim - 40) / 5) * (0-(0)));
            yy = 0.85 + (((tickAnim - 40) / 5) * (0.85-(0.85)));
            zz = 0 + (((tickAnim - 40) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightHand.rotationPointX = this.rightHand.rotationPointX + (float)(xx);
        this.rightHand.rotationPointY = this.rightHand.rotationPointY - (float)(yy);
        this.rightHand.rotationPointZ = this.rightHand.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (18.25-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 45) {
            xx = 18.25 + (((tickAnim - 40) / 5) * (17-(18.25)));
            yy = 0 + (((tickAnim - 40) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 5) * (0-(0)));
        }
        else if (tickAnim >= 45 && tickAnim < 80) {
            xx = 17 + (((tickAnim - 45) / 35) * (0-(17)));
            yy = 0 + (((tickAnim - 45) / 35) * (0-(0)));
            zz = 0 + (((tickAnim - 45) / 35) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck1, neck1.rotateAngleX + (float) Math.toRadians(xx), neck1.rotateAngleY + (float) Math.toRadians(yy), neck1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (18.06902-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (-0.1421-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (-0.33513-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 45) {
            xx = 18.06902 + (((tickAnim - 40) / 5) * (19.06902-(18.06902)));
            yy = -0.1421 + (((tickAnim - 40) / 5) * (-0.1421-(-0.1421)));
            zz = -0.33513 + (((tickAnim - 40) / 5) * (-0.33513-(-0.33513)));
        }
        else if (tickAnim >= 45 && tickAnim < 80) {
            xx = 19.06902 + (((tickAnim - 45) / 35) * (0-(19.06902)));
            yy = -0.1421 + (((tickAnim - 45) / 35) * (0-(-0.1421)));
            zz = -0.33513 + (((tickAnim - 45) / 35) * (0-(-0.33513)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(xx), neck2.rotateAngleY + (float) Math.toRadians(yy), neck2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (16.25-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 45) {
            xx = 16.25 + (((tickAnim - 40) / 5) * (15.75-(16.25)));
            yy = 0 + (((tickAnim - 40) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 5) * (0-(0)));
        }
        else if (tickAnim >= 45 && tickAnim < 80) {
            xx = 15.75 + (((tickAnim - 45) / 35) * (0-(15.75)));
            yy = 0 + (((tickAnim - 45) / 35) * (0-(0)));
            zz = 0 + (((tickAnim - 45) / 35) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(xx), neck3.rotateAngleY + (float) Math.toRadians(yy), neck3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (13.75-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 45) {
            xx = 13.75 + (((tickAnim - 40) / 5) * (13.75-(13.75)));
            yy = 0 + (((tickAnim - 40) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 5) * (0-(0)));
        }
        else if (tickAnim >= 45 && tickAnim < 80) {
            xx = 13.75 + (((tickAnim - 45) / 35) * (0-(13.75)));
            yy = 0 + (((tickAnim - 45) / 35) * (0-(0)));
            zz = 0 + (((tickAnim - 45) / 35) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck4, neck4.rotateAngleX + (float) Math.toRadians(xx), neck4.rotateAngleY + (float) Math.toRadians(yy), neck4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (15.25-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 45) {
            xx = 15.25 + (((tickAnim - 40) / 5) * (15.25-(15.25)));
            yy = 0 + (((tickAnim - 40) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 5) * (0-(0)));
        }
        else if (tickAnim >= 45 && tickAnim < 80) {
            xx = 15.25 + (((tickAnim - 45) / 35) * (0-(15.25)));
            yy = 0 + (((tickAnim - 45) / 35) * (0-(0)));
            zz = 0 + (((tickAnim - 45) / 35) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck5, neck5.rotateAngleX + (float) Math.toRadians(xx), neck5.rotateAngleY + (float) Math.toRadians(yy), neck5.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (4-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 45) {
            xx = 4 + (((tickAnim - 40) / 5) * (4-(4)));
            yy = 0 + (((tickAnim - 40) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 5) * (0-(0)));
        }
        else if (tickAnim >= 45 && tickAnim < 80) {
            xx = 4 + (((tickAnim - 45) / 35) * (0-(4)));
            yy = 0 + (((tickAnim - 45) / 35) * (0-(0)));
            zz = 0 + (((tickAnim - 45) / 35) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck6, neck6.rotateAngleX + (float) Math.toRadians(xx), neck6.rotateAngleY + (float) Math.toRadians(yy), neck6.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (0.44-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 45) {
            xx = 0.44 + (((tickAnim - 40) / 5) * (2.75-(0.44)));
            yy = 0 + (((tickAnim - 40) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 5) * (0-(0)));
        }
        else if (tickAnim >= 45 && tickAnim < 80) {
            xx = 2.75 + (((tickAnim - 45) / 35) * (0-(2.75)));
            yy = 0 + (((tickAnim - 45) / 35) * (0-(0)));
            zz = 0 + (((tickAnim - 45) / 35) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck7, neck7.rotateAngleX + (float) Math.toRadians(xx), neck7.rotateAngleY + (float) Math.toRadians(yy), neck7.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (-5.31-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 45) {
            xx = -5.31 + (((tickAnim - 40) / 5) * (-4-(-5.31)));
            yy = 0 + (((tickAnim - 40) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 5) * (0-(0)));
        }
        else if (tickAnim >= 45 && tickAnim < 80) {
            xx = -4 + (((tickAnim - 45) / 35) * (0-(-4)));
            yy = 0 + (((tickAnim - 45) / 35) * (0-(0)));
            zz = 0 + (((tickAnim - 45) / 35) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck8, neck8.rotateAngleX + (float) Math.toRadians(xx), neck8.rotateAngleY + (float) Math.toRadians(yy), neck8.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 45) {
            xx = 0 + (((tickAnim - 0) / 45) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 45) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 45) * (1.325-(0)));
        }
        else if (tickAnim >= 45 && tickAnim < 80) {
            xx = 0 + (((tickAnim - 45) / 35) * (0-(0)));
            yy = 0 + (((tickAnim - 45) / 35) * (0-(0)));
            zz = 1.325 + (((tickAnim - 45) / 35) * (0-(1.325)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.neck8.rotationPointX = this.neck8.rotationPointX + (float)(xx);
        this.neck8.rotationPointY = this.neck8.rotationPointY - (float)(yy);
        this.neck8.rotationPointZ = this.neck8.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (-13-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 45) {
            xx = -13 + (((tickAnim - 40) / 5) * (-13-(-13)));
            yy = 0 + (((tickAnim - 40) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 5) * (0-(0)));
        }
        else if (tickAnim >= 45 && tickAnim < 80) {
            xx = -13 + (((tickAnim - 45) / 35) * (0-(-13)));
            yy = 0 + (((tickAnim - 45) / 35) * (0-(0)));
            zz = 0 + (((tickAnim - 45) / 35) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (18.75-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 45) {
            xx = 18.75 + (((tickAnim - 40) / 5) * (0-(18.75)));
            yy = 0 + (((tickAnim - 40) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(xx), jaw.rotateAngleY + (float) Math.toRadians(yy), jaw.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 45) {
            xx = 0 + (((tickAnim - 0) / 45) * (9-(0)));
            yy = 0 + (((tickAnim - 0) / 45) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 45) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(throat, throat.rotateAngleX + (float) Math.toRadians(xx), throat.rotateAngleY + (float) Math.toRadians(yy), throat.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 39) {
            xx = 0 + (((tickAnim - 0) / 39) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 39) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 39) * (0-(0)));
        }
        else if (tickAnim >= 39 && tickAnim < 45) {
            xx = 0 + (((tickAnim - 39) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 39) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 39) / 6) * (1.35-(0)));
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
    public void animNoise(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraXinjiangtitan entity = (EntityPrehistoricFloraXinjiangtitan) entitylivingbaseIn;
        int animCycle = 50;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;


        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*287/2.0-90))*-1), neck2.rotateAngleY + (float) Math.toRadians(0), neck2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*287/2.0-90))*1), neck3.rotateAngleY + (float) Math.toRadians(0), neck3.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(neck4, neck4.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*287/2.0-90))*-1), neck4.rotateAngleY + (float) Math.toRadians(0), neck4.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(neck5, neck5.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*287/2.0-120))*-1), neck5.rotateAngleY + (float) Math.toRadians(0), neck5.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(neck6, neck6.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*287/2.0-140))*-1), neck6.rotateAngleY + (float) Math.toRadians(0), neck6.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(neck7, neck7.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*287/2.0-180))*-1), neck7.rotateAngleY + (float) Math.toRadians(0), neck7.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(neck8, neck8.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*287/2.0-200))*1), neck8.rotateAngleY + (float) Math.toRadians(0), neck8.rotateAngleZ + (float) Math.toRadians(0));



        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (15.75-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 15.75 + (((tickAnim - 20) / 10) * (20.75-(15.75)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 20.75 + (((tickAnim - 30) / 20) * (0-(20.75)));
            yy = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(xx), jaw.rotateAngleY + (float) Math.toRadians(yy), jaw.rotateAngleZ + (float) Math.toRadians(zz));

    }
    public void animRunning(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraXinjiangtitan entity = (EntityPrehistoricFloraXinjiangtitan) entitylivingbaseIn;
        int animCycle = 35;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        this.setRotateAngle(hips, hips.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*205/0.5-20))*1.2), hips.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*205))*-1.5), hips.rotateAngleZ + (float) Math.toRadians(0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*205-20))*1.5));


        this.setRotateAngle(tail1, tail1.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*205/0.5-20))*0.3), tail1.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*205+90))*3), tail1.rotateAngleZ + (float) Math.toRadians(0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*205-30))*2));


        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*205/0.5-20))*0.5), tail2.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*205+200))*-5), tail2.rotateAngleZ + (float) Math.toRadians(0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*205-30))*2));


        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*205/0.5-20))*0.3), tail3.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*205+200))*-5), tail3.rotateAngleZ + (float) Math.toRadians(0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*205-50))*2));


        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*205/0.5-80))*1), tail4.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*205+200))*-5), tail4.rotateAngleZ + (float) Math.toRadians(0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*205-50))*2));


        this.setRotateAngle(tail5, tail5.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*205/0.5-80))*2), tail5.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*205+160))*-10), tail5.rotateAngleZ + (float) Math.toRadians(0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*205-50))*2));


        this.setRotateAngle(tail6, tail6.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*205/0.5-80))*4), tail6.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*205+140))*-15), tail6.rotateAngleZ + (float) Math.toRadians(0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*205-50))*2));


        this.setRotateAngle(tail7, tail7.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*205/0.5-80))*5), tail7.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*205+100))*-15), tail7.rotateAngleZ + (float) Math.toRadians(0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*205-50))*2));


        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*205/0.5-35))*-1.8), body.rotateAngleY + (float) Math.toRadians(0), body.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*205-80))*3.5));


        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*205/0.5-140))*1), chest.rotateAngleY + (float) Math.toRadians(0), chest.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*205-130))*-2));



        if (tickAnim >= 0 && tickAnim < 19) {
            xx = -11.75 + (((tickAnim - 0) / 19) * (16.25-(-11.75)));
            yy = 0 + (((tickAnim - 0) / 19) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 19) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 25) {
            xx = 16.25 + (((tickAnim - 19) / 6) * (-9.79189-(16.25)));
            yy = 0 + (((tickAnim - 19) / 6) * (0.14623-(0)));
            zz = 0 + (((tickAnim - 19) / 6) * (-1.7439-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 28) {
            xx = -9.79189 + (((tickAnim - 25) / 3) * (-24-(-9.79189)));
            yy = 0.14623 + (((tickAnim - 25) / 3) * (0-(0.14623)));
            zz = -1.7439 + (((tickAnim - 25) / 3) * (0-(-1.7439)));
        }
        else if (tickAnim >= 28 && tickAnim < 35) {
            xx = -24 + (((tickAnim - 28) / 7) * (-11.75-(-24)));
            yy = 0 + (((tickAnim - 28) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm1, leftArm1.rotateAngleX + (float) Math.toRadians(xx), leftArm1.rotateAngleY + (float) Math.toRadians(yy), leftArm1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 19) {
            xx = 12.25 + (((tickAnim - 0) / 19) * (5.25-(12.25)));
            yy = 0 + (((tickAnim - 0) / 19) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 19) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 25) {
            xx = 5.25 + (((tickAnim - 19) / 6) * (-7.71971-(5.25)));
            yy = 0 + (((tickAnim - 19) / 6) * (-3.96958-(0)));
            zz = 0 + (((tickAnim - 19) / 6) * (8.3616-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 28) {
            xx = -7.71971 + (((tickAnim - 25) / 3) * (18.75-(-7.71971)));
            yy = -3.96958 + (((tickAnim - 25) / 3) * (0-(-3.96958)));
            zz = 8.3616 + (((tickAnim - 25) / 3) * (0-(8.3616)));
        }
        else if (tickAnim >= 28 && tickAnim < 35) {
            xx = 18.75 + (((tickAnim - 28) / 7) * (12.25-(18.75)));
            yy = 0 + (((tickAnim - 28) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm2, leftArm2.rotateAngleX + (float) Math.toRadians(xx), leftArm2.rotateAngleY + (float) Math.toRadians(yy), leftArm2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 0) / 19) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 19) * (-0.85-(0)));
            zz = 0 + (((tickAnim - 0) / 19) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 19) / 6) * (0-(0)));
            yy = -0.85 + (((tickAnim - 19) / 6) * (0.56-(-0.85)));
            zz = 0 + (((tickAnim - 19) / 6) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 25) / 3) * (0-(0)));
            yy = 0.56 + (((tickAnim - 25) / 3) * (-1.375-(0.56)));
            zz = 0 + (((tickAnim - 25) / 3) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 32) {
            xx = 0 + (((tickAnim - 28) / 4) * (0-(0)));
            yy = -1.375 + (((tickAnim - 28) / 4) * (-0.7+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220/0.5))*0.2-(-1.375)));
            zz = 0 + (((tickAnim - 28) / 4) * (0-(0)));
        }
        else if (tickAnim >= 32 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 32) / 3) * (0-(0)));
            yy = -0.7+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220/0.5))*0.2 + (((tickAnim - 32) / 3) * (0-(-0.7+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220/0.5))*0.2)));
            zz = 0 + (((tickAnim - 32) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftArm2.rotationPointX = this.leftArm2.rotationPointX + (float)(xx);
        this.leftArm2.rotationPointY = this.leftArm2.rotationPointY - (float)(yy);
        this.leftArm2.rotationPointZ = this.leftArm2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 0) / 19) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 19) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 19) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 19) / 6) * (36.04-(0)));
            yy = 0 + (((tickAnim - 19) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 19) / 6) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 27) {
            xx = 36.04 + (((tickAnim - 25) / 2) * (0-(36.04)));
            yy = 0 + (((tickAnim - 25) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 2) * (0-(0)));
        }
        else if (tickAnim >= 27 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 27) / 1) * (6.25-(0)));
            yy = 0 + (((tickAnim - 27) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 27) / 1) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 35) {
            xx = 6.25 + (((tickAnim - 28) / 7) * (0-(6.25)));
            yy = 0 + (((tickAnim - 28) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftHand, leftHand.rotateAngleX + (float) Math.toRadians(xx), leftHand.rotateAngleY + (float) Math.toRadians(yy), leftHand.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 0) / 19) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 19) * (-0.925-(0)));
            zz = 0 + (((tickAnim - 0) / 19) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 19) / 6) * (0-(0)));
            yy = -0.925 + (((tickAnim - 19) / 6) * (1.225-(-0.925)));
            zz = 0 + (((tickAnim - 19) / 6) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 27) {
            xx = 0 + (((tickAnim - 25) / 2) * (0-(0)));
            yy = 1.225 + (((tickAnim - 25) / 2) * (0-(1.225)));
            zz = 0 + (((tickAnim - 25) / 2) * (0-(0)));
        }
        else if (tickAnim >= 27 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 27) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 27) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 27) / 1) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 28) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 28) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftHand.rotationPointX = this.leftHand.rotationPointX + (float)(xx);
        this.leftHand.rotationPointY = this.leftHand.rotationPointY - (float)(yy);
        this.leftHand.rotationPointZ = this.leftHand.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 9.64 + (((tickAnim - 0) / 4) * (16.25-(9.64)));
            yy = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 10) {
            xx = 16.25 + (((tickAnim - 4) / 6) * (-9.79189-(16.25)));
            yy = 0 + (((tickAnim - 4) / 6) * (0.14623-(0)));
            zz = 0 + (((tickAnim - 4) / 6) * (1.74388-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = -9.79189 + (((tickAnim - 10) / 3) * (-24-(-9.79189)));
            yy = 0.14623 + (((tickAnim - 10) / 3) * (0-(0.14623)));
            zz = 1.74388 + (((tickAnim - 10) / 3) * (0-(1.74388)));
        }
        else if (tickAnim >= 13 && tickAnim < 35) {
            xx = -24 + (((tickAnim - 13) / 22) * (9.64-(-24)));
            yy = 0 + (((tickAnim - 13) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 22) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm1, rightArm1.rotateAngleX + (float) Math.toRadians(xx), rightArm1.rotateAngleY + (float) Math.toRadians(yy), rightArm1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 4 + (((tickAnim - 0) / 4) * (5.25-(4)));
            yy = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 10) {
            xx = 5.25 + (((tickAnim - 4) / 6) * (-7.71971-(5.25)));
            yy = 0 + (((tickAnim - 4) / 6) * (-3.96958-(0)));
            zz = 0 + (((tickAnim - 4) / 6) * (-8.36164-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = -7.71971 + (((tickAnim - 10) / 3) * (18.75-(-7.71971)));
            yy = -3.96958 + (((tickAnim - 10) / 3) * (0-(-3.96958)));
            zz = -8.36164 + (((tickAnim - 10) / 3) * (0-(-8.36164)));
        }
        else if (tickAnim >= 13 && tickAnim < 35) {
            xx = 18.75 + (((tickAnim - 13) / 22) * (4-(18.75)));
            yy = 0 + (((tickAnim - 13) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 22) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm2, rightArm2.rotateAngleX + (float) Math.toRadians(xx), rightArm2.rotateAngleY + (float) Math.toRadians(yy), rightArm2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            yy = -0.525 + (((tickAnim - 0) / 4) * (-0.85-(-0.525)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 4) / 6) * (0-(0)));
            yy = -0.85 + (((tickAnim - 4) / 6) * (0.56-(-0.85)));
            zz = 0 + (((tickAnim - 4) / 6) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            yy = 0.56 + (((tickAnim - 10) / 3) * (-1.375-(0.56)));
            zz = 0 + (((tickAnim - 10) / 3) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 17) {
            xx = 0 + (((tickAnim - 13) / 4) * (0-(0)));
            yy = -1.375 + (((tickAnim - 13) / 4) * (-1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220/0.5))*0.2-(-1.375)));
            zz = 0 + (((tickAnim - 13) / 4) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 22) {
            xx = 0 + (((tickAnim - 17) / 5) * (0-(0)));
            yy = -1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220/0.5))*0.2 + (((tickAnim - 17) / 5) * (-0.975-(-1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220/0.5))*0.2)));
            zz = 0 + (((tickAnim - 17) / 5) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 22) / 13) * (0-(0)));
            yy = -0.975 + (((tickAnim - 22) / 13) * (-0.525-(-0.975)));
            zz = 0 + (((tickAnim - 22) / 13) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightArm2.rotationPointX = this.rightArm2.rotationPointX + (float)(xx);
        this.rightArm2.rotationPointY = this.rightArm2.rotationPointY - (float)(yy);
        this.rightArm2.rotationPointZ = this.rightArm2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = -8.82 + (((tickAnim - 0) / 4) * (0-(-8.82)));
            yy = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 4) / 6) * (36.04-(0)));
            yy = 0 + (((tickAnim - 4) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 6) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 36.04 + (((tickAnim - 10) / 3) * (0-(36.04)));
            yy = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 3) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 13) / 0) * (6.25-(0)));
            yy = 0 + (((tickAnim - 13) / 0) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 0) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 35) {
            xx = 6.25 + (((tickAnim - 13) / 22) * (-8.82-(6.25)));
            yy = 0 + (((tickAnim - 13) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 22) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightHand, rightHand.rotateAngleX + (float) Math.toRadians(xx), rightHand.rotateAngleY + (float) Math.toRadians(yy), rightHand.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            yy = -0.685 + (((tickAnim - 0) / 4) * (-0.925-(-0.685)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 4) / 6) * (0-(0)));
            yy = -0.925 + (((tickAnim - 4) / 6) * (1.225-(-0.925)));
            zz = 0 + (((tickAnim - 4) / 6) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            yy = 1.225 + (((tickAnim - 10) / 3) * (0-(1.225)));
            zz = 0 + (((tickAnim - 10) / 3) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 13) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 13) / 15) * (1.285-(0)));
            zz = 0 + (((tickAnim - 13) / 15) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 28) / 7) * (0-(0)));
            yy = 1.285 + (((tickAnim - 28) / 7) * (-0.685-(1.285)));
            zz = 0 + (((tickAnim - 28) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightHand.rotationPointX = this.rightHand.rotationPointX + (float)(xx);
        this.rightHand.rotationPointY = this.rightHand.rotationPointY - (float)(yy);
        this.rightHand.rotationPointZ = this.rightHand.rotationPointZ + (float)(zz);



        this.setRotateAngle(neck1, neck1.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*205/0.5-200))*0.1), neck1.rotateAngleY + (float) Math.toRadians(0), neck1.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*205-200))*2));


        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*205/0.5-240))*-0.2), neck2.rotateAngleY + (float) Math.toRadians(0), neck2.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*205-230))*2));


        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*205/0.5-240))*-0.1), neck3.rotateAngleY + (float) Math.toRadians(0), neck3.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*205-260))*2));


        this.setRotateAngle(neck4, neck4.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*205/0.5-240))*-0.2), neck4.rotateAngleY + (float) Math.toRadians(0), neck4.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*205-290))*2));


        this.setRotateAngle(neck5, neck5.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*205/0.5-260))*-0.2), neck5.rotateAngleY + (float) Math.toRadians(0), neck5.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*205-320))));


        this.setRotateAngle(neck6, neck6.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*205/0.5-300))*-0.2), neck6.rotateAngleY + (float) Math.toRadians(0), neck6.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*205-370))*2));


        this.setRotateAngle(neck7, neck7.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*205/0.5-330))*-0.2), neck7.rotateAngleY + (float) Math.toRadians(0), neck7.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*205-400))*2));


        this.setRotateAngle(neck8, neck8.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*205/0.5-330))*-0.2), neck8.rotateAngleY + (float) Math.toRadians(0), neck8.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*205-440))*2));



        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 7.5 + (((tickAnim - 0) / 10) * (24-(7.5)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 22) {
            xx = 24 + (((tickAnim - 10) / 12) * (-16.5-(24)));
            yy = 0 + (((tickAnim - 10) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 12) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 35) {
            xx = -16.5 + (((tickAnim - 22) / 13) * (7.5-(-16.5)));
            yy = 0 + (((tickAnim - 22) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 22) / 13) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg1, leftLeg1.rotateAngleX + (float) Math.toRadians(xx), leftLeg1.rotateAngleY + (float) Math.toRadians(yy), leftLeg1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 5 + (((tickAnim - 0) / 10) * (8.75-(5)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 16) {
            xx = 8.75 + (((tickAnim - 10) / 6) * (-18.19-(8.75)));
            yy = 0 + (((tickAnim - 10) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 6) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 19) {
            xx = -18.19 + (((tickAnim - 16) / 3) * (-18.19-(-18.19)));
            yy = 0 + (((tickAnim - 16) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 16) / 3) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 22) {
            xx = -18.19 + (((tickAnim - 19) / 3) * (-3-(-18.19)));
            yy = 0 + (((tickAnim - 19) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 19) / 3) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 35) {
            xx = -3 + (((tickAnim - 22) / 13) * (5-(-3)));
            yy = 0 + (((tickAnim - 22) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 22) / 13) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg2, leftLeg2.rotateAngleX + (float) Math.toRadians(xx), leftLeg2.rotateAngleY + (float) Math.toRadians(yy), leftLeg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0.875-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 16) {
            xx = 0 + (((tickAnim - 10) / 6) * (0-(0)));
            yy = 0.875 + (((tickAnim - 10) / 6) * (3.865-(0.875)));
            zz = 0 + (((tickAnim - 10) / 6) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 16) / 3) * (0-(0)));
            yy = 3.865 + (((tickAnim - 16) / 3) * (3.865-(3.865)));
            zz = 0 + (((tickAnim - 16) / 3) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 22) {
            xx = 0 + (((tickAnim - 19) / 3) * (0-(0)));
            yy = 3.865 + (((tickAnim - 19) / 3) * (-1-(3.865)));
            zz = 0 + (((tickAnim - 19) / 3) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 22) / 3) * (0-(0)));
            yy = -1 + (((tickAnim - 22) / 3) * (-0.55+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220/0.5))*0.2-(-1)));
            zz = 0 + (((tickAnim - 22) / 3) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 25) / 5) * (0-(0)));
            yy = -0.55+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220/0.5))*0.2 + (((tickAnim - 25) / 5) * (-0.25-(-0.55+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220/0.5))*0.2)));
            zz = 0 + (((tickAnim - 25) / 5) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 30) / 5) * (0-(0)));
            yy = -0.25 + (((tickAnim - 30) / 5) * (0-(-0.25)));
            zz = 0 + (((tickAnim - 30) / 5) * (0-(0)));
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
            xx = -11.75 + (((tickAnim - 0) / 10) * (19.5-(-11.75)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 22) {
            xx = 19.5 + (((tickAnim - 10) / 12) * (20.75-(19.5)));
            yy = 0 + (((tickAnim - 10) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 12) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 35) {
            xx = 20.75 + (((tickAnim - 22) / 13) * (-11.75-(20.75)));
            yy = 0 + (((tickAnim - 22) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 22) / 13) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftFoot, leftFoot.rotateAngleX + (float) Math.toRadians(xx), leftFoot.rotateAngleY + (float) Math.toRadians(yy), leftFoot.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = -0.4 + (((tickAnim - 0) / 10) * (-1.9-(-0.4)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 22) {
            xx = 0 + (((tickAnim - 10) / 12) * (0-(0)));
            yy = -1.9 + (((tickAnim - 10) / 12) * (-2.425-(-1.9)));
            zz = 0 + (((tickAnim - 10) / 12) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 22) / 6) * (0-(0)));
            yy = -2.425 + (((tickAnim - 22) / 6) * (-0.1-(-2.425)));
            zz = 0 + (((tickAnim - 22) / 6) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 28) / 7) * (0-(0)));
            yy = -0.1 + (((tickAnim - 28) / 7) * (-0.4-(-0.1)));
            zz = 0 + (((tickAnim - 28) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftFoot.rotationPointX = this.leftFoot.rotationPointX + (float)(xx);
        this.leftFoot.rotationPointY = this.leftFoot.rotationPointY - (float)(yy);
        this.leftFoot.rotationPointZ = this.leftFoot.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (-50.68563-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (10.6293-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (-12.6936-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 16) {
            xx = -50.68563 + (((tickAnim - 10) / 6) * (0-(-50.68563)));
            yy = 10.6293 + (((tickAnim - 10) / 6) * (0-(10.6293)));
            zz = -12.6936 + (((tickAnim - 10) / 6) * (0-(-12.6936)));
        }
        else if (tickAnim >= 16 && tickAnim < 22) {
            xx = 0 + (((tickAnim - 16) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 16) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 16) / 6) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 22) / 13) * (0-(0)));
            yy = 0 + (((tickAnim - 22) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 22) / 13) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftToes, leftToes.rotateAngleX + (float) Math.toRadians(xx), leftToes.rotateAngleY + (float) Math.toRadians(yy), leftToes.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0.525-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (2.75-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 16) {
            xx = 0 + (((tickAnim - 10) / 6) * (0-(0)));
            yy = 0.525 + (((tickAnim - 10) / 6) * (0-(0.525)));
            zz = 2.75 + (((tickAnim - 10) / 6) * (0-(2.75)));
        }
        else if (tickAnim >= 16 && tickAnim < 22) {
            xx = 0 + (((tickAnim - 16) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 16) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 16) / 6) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 22) / 13) * (0-(0)));
            yy = 0 + (((tickAnim - 22) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 22) / 13) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftToes.rotationPointX = this.leftToes.rotationPointX + (float)(xx);
        this.leftToes.rotationPointY = this.leftToes.rotationPointY - (float)(yy);
        this.leftToes.rotationPointZ = this.leftToes.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 4 + (((tickAnim - 0) / 7) * (-16.5-(4)));
            yy = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 29) {
            xx = -16.5 + (((tickAnim - 7) / 22) * (24-(-16.5)));
            yy = 0 + (((tickAnim - 7) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 22) * (0-(0)));
        }
        else if (tickAnim >= 29 && tickAnim < 35) {
            xx = 24 + (((tickAnim - 29) / 6) * (4-(24)));
            yy = 0 + (((tickAnim - 29) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 29) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg1, rightLeg1.rotateAngleX + (float) Math.toRadians(xx), rightLeg1.rotateAngleY + (float) Math.toRadians(yy), rightLeg1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = -13.75 + (((tickAnim - 0) / 4) * (-18.19-(-13.75)));
            yy = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 7) {
            xx = -18.19 + (((tickAnim - 4) / 3) * (-3-(-18.19)));
            yy = 0 + (((tickAnim - 4) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 3) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 29) {
            xx = -3 + (((tickAnim - 7) / 22) * (8.75-(-3)));
            yy = 0 + (((tickAnim - 7) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 22) * (0-(0)));
        }
        else if (tickAnim >= 29 && tickAnim < 35) {
            xx = 8.75 + (((tickAnim - 29) / 6) * (-13.75-(8.75)));
            yy = 0 + (((tickAnim - 29) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 29) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg2, rightLeg2.rotateAngleX + (float) Math.toRadians(xx), rightLeg2.rotateAngleY + (float) Math.toRadians(yy), rightLeg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            yy = 4.675 + (((tickAnim - 0) / 4) * (3.865-(4.675)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 4) / 3) * (0-(0)));
            yy = 3.865 + (((tickAnim - 4) / 3) * (-1-(3.865)));
            zz = 0 + (((tickAnim - 4) / 3) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 7) / 3) * (0-(0)));
            yy = -1 + (((tickAnim - 7) / 3) * (-0.55+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220/0.5))*0.2-(-1)));
            zz = 0 + (((tickAnim - 7) / 3) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 16) {
            xx = 0 + (((tickAnim - 10) / 6) * (0-(0)));
            yy = -0.55+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220/0.5))*0.2 + (((tickAnim - 10) / 6) * (0-(-0.55+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220/0.5))*0.2)));
            zz = 0 + (((tickAnim - 10) / 6) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 29) {
            xx = 0 + (((tickAnim - 16) / 13) * (0-(0)));
            yy = 0 + (((tickAnim - 16) / 13) * (0.875-(0)));
            zz = 0 + (((tickAnim - 16) / 13) * (0-(0)));
        }
        else if (tickAnim >= 29 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 29) / 6) * (0-(0)));
            yy = 0.875 + (((tickAnim - 29) / 6) * (4.675-(0.875)));
            zz = 0 + (((tickAnim - 29) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightLeg2.rotationPointX = this.rightLeg2.rotationPointX + (float)(xx);
        this.rightLeg2.rotationPointY = this.rightLeg2.rotationPointY - (float)(yy);
        this.rightLeg2.rotationPointZ = this.rightLeg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 19.75 + (((tickAnim - 0) / 7) * (20.75-(19.75)));
            yy = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 20) {
            xx = 20.75 + (((tickAnim - 7) / 13) * (-11.02-(20.75)));
            yy = 0 + (((tickAnim - 7) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 13) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 29) {
            xx = -11.02 + (((tickAnim - 20) / 9) * (19.5-(-11.02)));
            yy = 0 + (((tickAnim - 20) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 9) * (0-(0)));
        }
        else if (tickAnim >= 29 && tickAnim < 35) {
            xx = 19.5 + (((tickAnim - 29) / 6) * (19.75-(19.5)));
            yy = 0 + (((tickAnim - 29) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 29) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightFoot, rightFoot.rotateAngleX + (float) Math.toRadians(xx), rightFoot.rotateAngleY + (float) Math.toRadians(yy), rightFoot.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            yy = 0.45 + (((tickAnim - 0) / 7) * (-2.425-(0.45)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 7) / 6) * (0-(0)));
            yy = -2.425 + (((tickAnim - 7) / 6) * (-0.1-(-2.425)));
            zz = 0 + (((tickAnim - 7) / 6) * (0.2-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 13) / 7) * (0-(0)));
            yy = -0.1 + (((tickAnim - 13) / 7) * (-0.675-(-0.1)));
            zz = 0.2 + (((tickAnim - 13) / 7) * (0.425-(0.2)));
        }
        else if (tickAnim >= 20 && tickAnim < 29) {
            xx = 0 + (((tickAnim - 20) / 9) * (0-(0)));
            yy = -0.675 + (((tickAnim - 20) / 9) * (-1.9-(-0.675)));
            zz = 0.425 + (((tickAnim - 20) / 9) * (0-(0.425)));
        }
        else if (tickAnim >= 29 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 29) / 6) * (0-(0)));
            yy = -1.9 + (((tickAnim - 29) / 6) * (0.45-(-1.9)));
            zz = 0 + (((tickAnim - 29) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightFoot.rotationPointX = this.rightFoot.rotationPointX + (float)(xx);
        this.rightFoot.rotationPointY = this.rightFoot.rotationPointY - (float)(yy);
        this.rightFoot.rotationPointZ = this.rightFoot.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 29) {
            xx = 0 + (((tickAnim - 20) / 9) * (-50.68563-(0)));
            yy = 0 + (((tickAnim - 20) / 9) * (-10.62926-(0)));
            zz = 0 + (((tickAnim - 20) / 9) * (12.69361-(0)));
        }
        else if (tickAnim >= 29 && tickAnim < 35) {
            xx = -50.68563 + (((tickAnim - 29) / 6) * (0-(-50.68563)));
            yy = -10.62926 + (((tickAnim - 29) / 6) * (0-(-10.62926)));
            zz = 12.69361 + (((tickAnim - 29) / 6) * (0-(12.69361)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightToes, rightToes.rotateAngleX + (float) Math.toRadians(xx), rightToes.rotateAngleY + (float) Math.toRadians(yy), rightToes.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 29) {
            xx = 0 + (((tickAnim - 20) / 9) * (0-(0)));
            yy = 0 + (((tickAnim - 20) / 9) * (-0.525-(0)));
            zz = 0 + (((tickAnim - 20) / 9) * (2.75-(0)));
        }
        else if (tickAnim >= 29 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 29) / 6) * (0-(0)));
            yy = -0.525 + (((tickAnim - 29) / 6) * (0-(-0.525)));
            zz = 2.75 + (((tickAnim - 29) / 6) * (0-(2.75)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightToes.rotationPointX = this.rightToes.rotationPointX + (float)(xx);
        this.rightToes.rotationPointY = this.rightToes.rotationPointY - (float)(yy);
        this.rightToes.rotationPointZ = this.rightToes.rotationPointZ + (float)(zz);

    }
    public void animWalking(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraXinjiangtitan entity = (EntityPrehistoricFloraXinjiangtitan) entitylivingbaseIn;
        int animCycle = 53;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;

        if (tickAnim >= 0 && tickAnim < 24) {
            xx = -24 + (((tickAnim - 0) / 24) * (-1.25-(-24)));
            yy = 0 + (((tickAnim - 0) / 24) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 24) * (0-(0)));
        }
        else if (tickAnim >= 24 && tickAnim < 40) {
            xx = -1.25 + (((tickAnim - 24) / 16) * (16.25-(-1.25)));
            yy = 0 + (((tickAnim - 24) / 16) * (0-(0)));
            zz = 0 + (((tickAnim - 24) / 16) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 49) {
            xx = 16.25 + (((tickAnim - 40) / 9) * (-9.79189-(16.25)));
            yy = 0 + (((tickAnim - 40) / 9) * (0.14623-(0)));
            zz = 0 + (((tickAnim - 40) / 9) * (-1.7439-(0)));
        }
        else if (tickAnim >= 49 && tickAnim < 53) {
            xx = -9.79189 + (((tickAnim - 49) / 4) * (-24-(-9.79189)));
            yy = 0.14623 + (((tickAnim - 49) / 4) * (0-(0.14623)));
            zz = -1.7439 + (((tickAnim - 49) / 4) * (0-(-1.7439)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm1, leftArm1.rotateAngleX + (float) Math.toRadians(xx), leftArm1.rotateAngleY + (float) Math.toRadians(yy), leftArm1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 24) {
            xx = 18.75 + (((tickAnim - 0) / 24) * (13.25-(18.75)));
            yy = 0 + (((tickAnim - 0) / 24) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 24) * (0-(0)));
        }
        else if (tickAnim >= 24 && tickAnim < 40) {
            xx = 13.25 + (((tickAnim - 24) / 16) * (5.25-(13.25)));
            yy = 0 + (((tickAnim - 24) / 16) * (0-(0)));
            zz = 0 + (((tickAnim - 24) / 16) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 49) {
            xx = 5.25 + (((tickAnim - 40) / 9) * (-7.71971-(5.25)));
            yy = 0 + (((tickAnim - 40) / 9) * (-3.96958-(0)));
            zz = 0 + (((tickAnim - 40) / 9) * (8.3616-(0)));
        }
        else if (tickAnim >= 49 && tickAnim < 53) {
            xx = -7.71971 + (((tickAnim - 49) / 4) * (18.75-(-7.71971)));
            yy = -3.96958 + (((tickAnim - 49) / 4) * (0-(-3.96958)));
            zz = 8.3616 + (((tickAnim - 49) / 4) * (0-(8.3616)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm2, leftArm2.rotateAngleX + (float) Math.toRadians(xx), leftArm2.rotateAngleY + (float) Math.toRadians(yy), leftArm2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            yy = -1.375 + (((tickAnim - 0) / 6) * (-0.925+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220/0.7))*0.08-(-1.375)));
            zz = 0 + (((tickAnim - 0) / 6) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 6) / 6) * (0-(0)));
            yy = -0.925+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220/0.7))*0.08 + (((tickAnim - 6) / 6) * (-1.2-(-0.925+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220/0.7))*0.08)));
            zz = 0 + (((tickAnim - 6) / 6) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 12) / 28) * (0-(0)));
            yy = -1.2 + (((tickAnim - 12) / 28) * (-0.85-(-1.2)));
            zz = 0 + (((tickAnim - 12) / 28) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 49) {
            xx = 0 + (((tickAnim - 40) / 9) * (0-(0)));
            yy = -0.85 + (((tickAnim - 40) / 9) * (0.56-(-0.85)));
            zz = 0 + (((tickAnim - 40) / 9) * (0-(0)));
        }
        else if (tickAnim >= 49 && tickAnim < 53) {
            xx = 0 + (((tickAnim - 49) / 4) * (0-(0)));
            yy = 0.56 + (((tickAnim - 49) / 4) * (-1.375-(0.56)));
            zz = 0 + (((tickAnim - 49) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftArm2.rotationPointX = this.leftArm2.rotationPointX + (float)(xx);
        this.leftArm2.rotationPointY = this.leftArm2.rotationPointY - (float)(yy);
        this.leftArm2.rotationPointZ = this.leftArm2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 24) {
            xx = 6.25 + (((tickAnim - 0) / 24) * (-10.25-(6.25)));
            yy = 0 + (((tickAnim - 0) / 24) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 24) * (0-(0)));
        }
        else if (tickAnim >= 24 && tickAnim < 40) {
            xx = -10.25 + (((tickAnim - 24) / 16) * (0-(-10.25)));
            yy = 0 + (((tickAnim - 24) / 16) * (0-(0)));
            zz = 0 + (((tickAnim - 24) / 16) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 49) {
            xx = 0 + (((tickAnim - 40) / 9) * (36.04-(0)));
            yy = 0 + (((tickAnim - 40) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 9) * (0-(0)));
        }
        else if (tickAnim >= 49 && tickAnim < 52) {
            xx = 36.04 + (((tickAnim - 49) / 3) * (0-(36.04)));
            yy = 0 + (((tickAnim - 49) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 49) / 3) * (0-(0)));
        }
        else if (tickAnim >= 52 && tickAnim < 53) {
            xx = 0 + (((tickAnim - 52) / 1) * (6.25-(0)));
            yy = 0 + (((tickAnim - 52) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 52) / 1) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftHand, leftHand.rotateAngleX + (float) Math.toRadians(xx), leftHand.rotateAngleY + (float) Math.toRadians(yy), leftHand.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 24) {
            xx = 0 + (((tickAnim - 0) / 24) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 24) * (1-(0)));
            zz = 0 + (((tickAnim - 0) / 24) * (0-(0)));
        }
        else if (tickAnim >= 24 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 24) / 16) * (0-(0)));
            yy = 1 + (((tickAnim - 24) / 16) * (-0.925-(1)));
            zz = 0 + (((tickAnim - 24) / 16) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 45) {
            xx = 0 + (((tickAnim - 40) / 5) * (0-(0)));
            yy = -0.925 + (((tickAnim - 40) / 5) * (1.225-(-0.925)));
            zz = 0 + (((tickAnim - 40) / 5) * (0-(0)));
        }
        else if (tickAnim >= 45 && tickAnim < 49) {
            xx = 0 + (((tickAnim - 45) / 4) * (0-(0)));
            yy = 1.225 + (((tickAnim - 45) / 4) * (1.225-(1.225)));
            zz = 0 + (((tickAnim - 45) / 4) * (0-(0)));
        }
        else if (tickAnim >= 49 && tickAnim < 53) {
            xx = 0 + (((tickAnim - 49) / 4) * (0-(0)));
            yy = 1.225 + (((tickAnim - 49) / 4) * (0-(1.225)));
            zz = 0 + (((tickAnim - 49) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftHand.rotationPointX = this.leftHand.rotationPointX + (float)(xx);
        this.leftHand.rotationPointY = this.leftHand.rotationPointY - (float)(yy);
        this.leftHand.rotationPointZ = this.leftHand.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 12) {
            xx = 8 + (((tickAnim - 0) / 12) * (16.25-(8)));
            yy = 0 + (((tickAnim - 0) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 12) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 21) {
            xx = 16.25 + (((tickAnim - 12) / 9) * (-9.79189-(16.25)));
            yy = 0 + (((tickAnim - 12) / 9) * (0.14623-(0)));
            zz = 0 + (((tickAnim - 12) / 9) * (1.74388-(0)));
        }
        else if (tickAnim >= 21 && tickAnim < 26) {
            xx = -9.79189 + (((tickAnim - 21) / 5) * (-24-(-9.79189)));
            yy = 0.14623 + (((tickAnim - 21) / 5) * (0-(0.14623)));
            zz = 1.74388 + (((tickAnim - 21) / 5) * (0-(1.74388)));
        }
        else if (tickAnim >= 26 && tickAnim < 53) {
            xx = -24 + (((tickAnim - 26) / 27) * (8-(-24)));
            yy = 0 + (((tickAnim - 26) / 27) * (0-(0)));
            zz = 0 + (((tickAnim - 26) / 27) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm1, rightArm1.rotateAngleX + (float) Math.toRadians(xx), rightArm1.rotateAngleY + (float) Math.toRadians(yy), rightArm1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (3.75-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 12) {
            xx = 3.75 + (((tickAnim - 8) / 4) * (5.25-(3.75)));
            yy = 0 + (((tickAnim - 8) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 4) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 21) {
            xx = 5.25 + (((tickAnim - 12) / 9) * (-7.71971-(5.25)));
            yy = 0 + (((tickAnim - 12) / 9) * (-3.96958-(0)));
            zz = 0 + (((tickAnim - 12) / 9) * (-8.36164-(0)));
        }
        else if (tickAnim >= 21 && tickAnim < 26) {
            xx = -7.71971 + (((tickAnim - 21) / 5) * (18.75-(-7.71971)));
            yy = -3.96958 + (((tickAnim - 21) / 5) * (0-(-3.96958)));
            zz = -8.36164 + (((tickAnim - 21) / 5) * (0-(-8.36164)));
        }
        else if (tickAnim >= 26 && tickAnim < 53) {
            xx = 18.75 + (((tickAnim - 26) / 27) * (0-(18.75)));
            yy = 0 + (((tickAnim - 26) / 27) * (0-(0)));
            zz = 0 + (((tickAnim - 26) / 27) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm2, rightArm2.rotateAngleX + (float) Math.toRadians(xx), rightArm2.rotateAngleY + (float) Math.toRadians(yy), rightArm2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 0) / 12) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 12) * (-0.85-(0)));
            zz = 0 + (((tickAnim - 0) / 12) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 21) {
            xx = 0 + (((tickAnim - 12) / 9) * (0-(0)));
            yy = -0.85 + (((tickAnim - 12) / 9) * (0.56-(-0.85)));
            zz = 0 + (((tickAnim - 12) / 9) * (0-(0)));
        }
        else if (tickAnim >= 21 && tickAnim < 26) {
            xx = 0 + (((tickAnim - 21) / 5) * (0-(0)));
            yy = 0.56 + (((tickAnim - 21) / 5) * (-1.375-(0.56)));
            zz = 0 + (((tickAnim - 21) / 5) * (0-(0)));
        }
        else if (tickAnim >= 26 && tickAnim < 32) {
            xx = 0 + (((tickAnim - 26) / 6) * (0-(0)));
            yy = -1.375 + (((tickAnim - 26) / 6) * (-0.925+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220/0.7))*0.08-(-1.375)));
            zz = 0 + (((tickAnim - 26) / 6) * (0-(0)));
        }
        else if (tickAnim >= 32 && tickAnim < 38) {
            xx = 0 + (((tickAnim - 32) / 6) * (0-(0)));
            yy = -0.925+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220/0.7))*0.08 + (((tickAnim - 32) / 6) * (-1.2-(-0.925+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220/0.7))*0.08)));
            zz = 0 + (((tickAnim - 32) / 6) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 53) {
            xx = 0 + (((tickAnim - 38) / 15) * (0-(0)));
            yy = -1.2 + (((tickAnim - 38) / 15) * (0-(-1.2)));
            zz = 0 + (((tickAnim - 38) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightArm2.rotationPointX = this.rightArm2.rotationPointX + (float)(xx);
        this.rightArm2.rotationPointY = this.rightArm2.rotationPointY - (float)(yy);
        this.rightArm2.rotationPointZ = this.rightArm2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 12) {
            xx = -7.25 + (((tickAnim - 0) / 12) * (0-(-7.25)));
            yy = 0 + (((tickAnim - 0) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 12) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 21) {
            xx = 0 + (((tickAnim - 12) / 9) * (36.04-(0)));
            yy = 0 + (((tickAnim - 12) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 9) * (0-(0)));
        }
        else if (tickAnim >= 21 && tickAnim < 24) {
            xx = 36.04 + (((tickAnim - 21) / 3) * (0-(36.04)));
            yy = 0 + (((tickAnim - 21) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 21) / 3) * (0-(0)));
        }
        else if (tickAnim >= 24 && tickAnim < 26) {
            xx = 0 + (((tickAnim - 24) / 2) * (6.25-(0)));
            yy = 0 + (((tickAnim - 24) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 24) / 2) * (0-(0)));
        }
        else if (tickAnim >= 26 && tickAnim < 53) {
            xx = 6.25 + (((tickAnim - 26) / 27) * (-7.25-(6.25)));
            yy = 0 + (((tickAnim - 26) / 27) * (0-(0)));
            zz = 0 + (((tickAnim - 26) / 27) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightHand, rightHand.rotateAngleX + (float) Math.toRadians(xx), rightHand.rotateAngleY + (float) Math.toRadians(yy), rightHand.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 0) / 12) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 12) * (-0.925-(0)));
            zz = 0 + (((tickAnim - 0) / 12) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 12) / 6) * (0-(0)));
            yy = -0.925 + (((tickAnim - 12) / 6) * (1.065-(-0.925)));
            zz = 0 + (((tickAnim - 12) / 6) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 21) {
            xx = 0 + (((tickAnim - 18) / 3) * (0-(0)));
            yy = 1.065 + (((tickAnim - 18) / 3) * (1.225-(1.065)));
            zz = 0 + (((tickAnim - 18) / 3) * (0-(0)));
        }
        else if (tickAnim >= 21 && tickAnim < 26) {
            xx = 0 + (((tickAnim - 21) / 5) * (0-(0)));
            yy = 1.225 + (((tickAnim - 21) / 5) * (0-(1.225)));
            zz = 0 + (((tickAnim - 21) / 5) * (0-(0)));
        }
        else if (tickAnim >= 26 && tickAnim < 53) {
            xx = 0 + (((tickAnim - 26) / 27) * (0-(0)));
            yy = 0 + (((tickAnim - 26) / 27) * (0-(0)));
            zz = 0 + (((tickAnim - 26) / 27) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightHand.rotationPointX = this.rightHand.rotationPointX + (float)(xx);
        this.rightHand.rotationPointY = this.rightHand.rotationPointY - (float)(yy);
        this.rightHand.rotationPointZ = this.rightHand.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 26) {
            xx = 0 + (((tickAnim - 0) / 26) * (24-(0)));
            yy = 0 + (((tickAnim - 0) / 26) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 26) * (0-(0)));
        }
        else if (tickAnim >= 26 && tickAnim < 39) {
            xx = 24 + (((tickAnim - 26) / 13) * (-13.75-(24)));
            yy = 0 + (((tickAnim - 26) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 26) / 13) * (0-(0)));
        }
        else if (tickAnim >= 39 && tickAnim < 53) {
            xx = -13.75 + (((tickAnim - 39) / 14) * (0-(-13.75)));
            yy = 0 + (((tickAnim - 39) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 39) / 14) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg1, leftLeg1.rotateAngleX + (float) Math.toRadians(xx), leftLeg1.rotateAngleY + (float) Math.toRadians(yy), leftLeg1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 26) {
            xx = 0 + (((tickAnim - 0) / 26) * (8.75-(0)));
            yy = 0 + (((tickAnim - 0) / 26) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 26) * (0-(0)));
        }
        else if (tickAnim >= 26 && tickAnim < 31) {
            xx = 8.75 + (((tickAnim - 26) / 5) * (-10.97-(8.75)));
            yy = 0 + (((tickAnim - 26) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 26) / 5) * (0-(0)));
        }
        else if (tickAnim >= 31 && tickAnim < 36) {
            xx = -10.97 + (((tickAnim - 31) / 5) * (-18.19-(-10.97)));
            yy = 0 + (((tickAnim - 31) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 31) / 5) * (0-(0)));
        }
        else if (tickAnim >= 36 && tickAnim < 39) {
            xx = -18.19 + (((tickAnim - 36) / 3) * (-0.25-(-18.19)));
            yy = 0 + (((tickAnim - 36) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 36) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg2, leftLeg2.rotateAngleX + (float) Math.toRadians(xx), leftLeg2.rotateAngleY + (float) Math.toRadians(yy), leftLeg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 26) {
            xx = 0 + (((tickAnim - 0) / 26) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 26) * (0.875-(0)));
            zz = 0 + (((tickAnim - 0) / 26) * (0-(0)));
        }
        else if (tickAnim >= 26 && tickAnim < 36) {
            xx = 0 + (((tickAnim - 26) / 10) * (0-(0)));
            yy = 0.875 + (((tickAnim - 26) / 10) * (3.865-(0.875)));
            zz = 0 + (((tickAnim - 26) / 10) * (0-(0)));
        }
        else if (tickAnim >= 36 && tickAnim < 39) {
            xx = 0 + (((tickAnim - 36) / 3) * (0-(0)));
            yy = 3.865 + (((tickAnim - 36) / 3) * (-0.175-(3.865)));
            zz = 0 + (((tickAnim - 36) / 3) * (0-(0)));
        }
        else if (tickAnim >= 39 && tickAnim < 45) {
            xx = 0 + (((tickAnim - 39) / 6) * (0-(0)));
            yy = -0.175 + (((tickAnim - 39) / 6) * (0.275+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220/0.7))*0.08-(-0.175)));
            zz = 0 + (((tickAnim - 39) / 6) * (0-(0)));
        }
        else if (tickAnim >= 45 && tickAnim < 51) {
            xx = 0 + (((tickAnim - 45) / 6) * (0-(0)));
            yy = 0.275+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220/0.7))*0.08 + (((tickAnim - 45) / 6) * (0-(0.275+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220/0.7))*0.08)));
            zz = 0 + (((tickAnim - 45) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftLeg2.rotationPointX = this.leftLeg2.rotationPointX + (float)(xx);
        this.leftLeg2.rotationPointY = this.leftLeg2.rotationPointY - (float)(yy);
        this.leftLeg2.rotationPointZ = this.leftLeg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 0) / 11) * (-12.25-(0)));
            yy = 0 + (((tickAnim - 0) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 11) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 26) {
            xx = -12.25 + (((tickAnim - 11) / 15) * (19.5-(-12.25)));
            yy = 0 + (((tickAnim - 11) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 15) * (0-(0)));
        }
        else if (tickAnim >= 26 && tickAnim < 34) {
            xx = 19.5 + (((tickAnim - 26) / 8) * (13.75-(19.5)));
            yy = 0 + (((tickAnim - 26) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 26) / 8) * (0-(0)));
        }
        else if (tickAnim >= 34 && tickAnim < 37) {
            xx = 13.75 + (((tickAnim - 34) / 3) * (8.15-(13.75)));
            yy = 0 + (((tickAnim - 34) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 34) / 3) * (0-(0)));
        }
        else if (tickAnim >= 37 && tickAnim < 39) {
            xx = 8.15 + (((tickAnim - 37) / 2) * (14.25-(8.15)));
            yy = 0 + (((tickAnim - 37) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 37) / 2) * (0-(0)));
        }
        else if (tickAnim >= 39 && tickAnim < 53) {
            xx = 14.25 + (((tickAnim - 39) / 14) * (0-(14.25)));
            yy = 0 + (((tickAnim - 39) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 39) / 14) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftFoot, leftFoot.rotateAngleX + (float) Math.toRadians(xx), leftFoot.rotateAngleY + (float) Math.toRadians(yy), leftFoot.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 26) {
            xx = 0 + (((tickAnim - 0) / 26) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 26) * (-1.9-(0)));
            zz = 0 + (((tickAnim - 0) / 26) * (0-(0)));
        }
        else if (tickAnim >= 26 && tickAnim < 34) {
            xx = 0 + (((tickAnim - 26) / 8) * (0-(0)));
            yy = -1.9 + (((tickAnim - 26) / 8) * (0.725-(-1.9)));
            zz = 0 + (((tickAnim - 26) / 8) * (0-(0)));
        }
        else if (tickAnim >= 34 && tickAnim < 37) {
            xx = 0 + (((tickAnim - 34) / 3) * (0-(0)));
            yy = 0.725 + (((tickAnim - 34) / 3) * (-2.905-(0.725)));
            zz = 0 + (((tickAnim - 34) / 3) * (0-(0)));
        }
        else if (tickAnim >= 37 && tickAnim < 39) {
            xx = 0 + (((tickAnim - 37) / 2) * (0-(0)));
            yy = -2.905 + (((tickAnim - 37) / 2) * (-2.425-(-2.905)));
            zz = 0 + (((tickAnim - 37) / 2) * (0-(0)));
        }
        else if (tickAnim >= 39 && tickAnim < 53) {
            xx = 0 + (((tickAnim - 39) / 14) * (0-(0)));
            yy = -2.425 + (((tickAnim - 39) / 14) * (0-(-2.425)));
            zz = 0 + (((tickAnim - 39) / 14) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftFoot.rotationPointX = this.leftFoot.rotationPointX + (float)(xx);
        this.leftFoot.rotationPointY = this.leftFoot.rotationPointY - (float)(yy);
        this.leftFoot.rotationPointZ = this.leftFoot.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 0) / 11) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 11) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 27) {
            xx = 0 + (((tickAnim - 11) / 16) * (-50.68563-(0)));
            yy = 0 + (((tickAnim - 11) / 16) * (10.6293-(0)));
            zz = 0 + (((tickAnim - 11) / 16) * (-12.6936-(0)));
        }
        else if (tickAnim >= 27 && tickAnim < 32) {
            xx = -50.68563 + (((tickAnim - 27) / 5) * (0-(-50.68563)));
            yy = 10.6293 + (((tickAnim - 27) / 5) * (0-(10.6293)));
            zz = -12.6936 + (((tickAnim - 27) / 5) * (0-(-12.6936)));
        }
        else if (tickAnim >= 32 && tickAnim < 39) {
            xx = 0 + (((tickAnim - 32) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 32) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 32) / 7) * (0-(0)));
        }
        else if (tickAnim >= 39 && tickAnim < 53) {
            xx = 0 + (((tickAnim - 39) / 14) * (0-(0)));
            yy = 0 + (((tickAnim - 39) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 39) / 14) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftToes, leftToes.rotateAngleX + (float) Math.toRadians(xx), leftToes.rotateAngleY + (float) Math.toRadians(yy), leftToes.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 0) / 11) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 11) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 27) {
            xx = 0 + (((tickAnim - 11) / 16) * (0-(0)));
            yy = 0 + (((tickAnim - 11) / 16) * (0.525-(0)));
            zz = 0 + (((tickAnim - 11) / 16) * (2.75-(0)));
        }
        else if (tickAnim >= 27 && tickAnim < 32) {
            xx = 0 + (((tickAnim - 27) / 5) * (0-(0)));
            yy = 0.525 + (((tickAnim - 27) / 5) * (0-(0.525)));
            zz = 2.75 + (((tickAnim - 27) / 5) * (0-(2.75)));
        }
        else if (tickAnim >= 32 && tickAnim < 39) {
            xx = 0 + (((tickAnim - 32) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 32) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 32) / 7) * (0-(0)));
        }
        else if (tickAnim >= 39 && tickAnim < 53) {
            xx = 0 + (((tickAnim - 39) / 14) * (0-(0)));
            yy = 0 + (((tickAnim - 39) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 39) / 14) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftToes.rotationPointX = this.leftToes.rotationPointX + (float)(xx);
        this.leftToes.rotationPointY = this.leftToes.rotationPointY - (float)(yy);
        this.leftToes.rotationPointZ = this.leftToes.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 24 + (((tickAnim - 0) / 15) * (-16.5-(24)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 53) {
            xx = -16.5 + (((tickAnim - 15) / 38) * (24-(-16.5)));
            yy = 0 + (((tickAnim - 15) / 38) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 38) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg1, rightLeg1.rotateAngleX + (float) Math.toRadians(xx), rightLeg1.rotateAngleY + (float) Math.toRadians(yy), rightLeg1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 8.75 + (((tickAnim - 0) / 7) * (-10.97-(8.75)));
            yy = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 12) {
            xx = -10.97 + (((tickAnim - 7) / 5) * (-18.19-(-10.97)));
            yy = 0 + (((tickAnim - 7) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 5) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 15) {
            xx = -18.19 + (((tickAnim - 12) / 3) * (-3-(-18.19)));
            yy = 0 + (((tickAnim - 12) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 3) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 53) {
            xx = -3 + (((tickAnim - 15) / 38) * (8.75-(-3)));
            yy = 0 + (((tickAnim - 15) / 38) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 38) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg2, rightLeg2.rotateAngleX + (float) Math.toRadians(xx), rightLeg2.rotateAngleY + (float) Math.toRadians(yy), rightLeg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 0) / 12) * (0-(0)));
            yy = 0.875 + (((tickAnim - 0) / 12) * (3.865-(0.875)));
            zz = 0 + (((tickAnim - 0) / 12) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 12) / 3) * (0-(0)));
            yy = 3.865 + (((tickAnim - 12) / 3) * (-1-(3.865)));
            zz = 0 + (((tickAnim - 12) / 3) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 21) {
            xx = 0 + (((tickAnim - 15) / 6) * (0-(0)));
            yy = -1 + (((tickAnim - 15) / 6) * (-0.55+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220/0.7))*0.08-(-1)));
            zz = 0 + (((tickAnim - 15) / 6) * (0-(0)));
        }
        else if (tickAnim >= 21 && tickAnim < 27) {
            xx = 0 + (((tickAnim - 21) / 6) * (0-(0)));
            yy = -0.55+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220/0.7))*0.08 + (((tickAnim - 21) / 6) * (-0.825-(-0.55+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220/0.7))*0.08)));
            zz = 0 + (((tickAnim - 21) / 6) * (0-(0)));
        }
        else if (tickAnim >= 27 && tickAnim < 53) {
            xx = 0 + (((tickAnim - 27) / 26) * (0-(0)));
            yy = -0.825 + (((tickAnim - 27) / 26) * (0.875-(-0.825)));
            zz = 0 + (((tickAnim - 27) / 26) * (0-(0)));
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
            xx = 19.5 + (((tickAnim - 0) / 10) * (13.75-(19.5)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 13.75 + (((tickAnim - 10) / 3) * (8.15-(13.75)));
            yy = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 3) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = 8.15 + (((tickAnim - 13) / 2) * (20.75-(8.15)));
            yy = 0 + (((tickAnim - 13) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 2) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 31) {
            xx = 20.75 + (((tickAnim - 15) / 16) * (0-(20.75)));
            yy = 0 + (((tickAnim - 15) / 16) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 16) * (0-(0)));
        }
        else if (tickAnim >= 31 && tickAnim < 53) {
            xx = 0 + (((tickAnim - 31) / 22) * (19.5-(0)));
            yy = 0 + (((tickAnim - 31) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 31) / 22) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightFoot, rightFoot.rotateAngleX + (float) Math.toRadians(xx), rightFoot.rotateAngleY + (float) Math.toRadians(yy), rightFoot.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = -1.9 + (((tickAnim - 0) / 10) * (0.725-(-1.9)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            yy = 0.725 + (((tickAnim - 10) / 3) * (-2.905-(0.725)));
            zz = 0 + (((tickAnim - 10) / 3) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 13) / 2) * (0-(0)));
            yy = -2.905 + (((tickAnim - 13) / 2) * (-2.425-(-2.905)));
            zz = 0 + (((tickAnim - 13) / 2) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 31) {
            xx = 0 + (((tickAnim - 15) / 16) * (0-(0)));
            yy = -2.425 + (((tickAnim - 15) / 16) * (-0.01-(-2.425)));
            zz = 0 + (((tickAnim - 15) / 16) * (0-(0)));
        }
        else if (tickAnim >= 31 && tickAnim < 43) {
            xx = 0 + (((tickAnim - 31) / 12) * (0-(0)));
            yy = -0.01 + (((tickAnim - 31) / 12) * (1.56-(-0.01)));
            zz = 0 + (((tickAnim - 31) / 12) * (0-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 53) {
            xx = 0 + (((tickAnim - 43) / 10) * (0-(0)));
            yy = 1.56 + (((tickAnim - 43) / 10) * (-1.9-(1.56)));
            zz = 0 + (((tickAnim - 43) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightFoot.rotationPointX = this.rightFoot.rotationPointX + (float)(xx);
        this.rightFoot.rotationPointY = this.rightFoot.rotationPointY - (float)(yy);
        this.rightFoot.rotationPointZ = this.rightFoot.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = -50.68563 + (((tickAnim - 0) / 7) * (0-(-50.68563)));
            yy = -10.62926 + (((tickAnim - 0) / 7) * (0-(-10.62926)));
            zz = 12.69361 + (((tickAnim - 0) / 7) * (0-(12.69361)));
        }
        else if (tickAnim >= 7 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 7) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 7) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 8) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 31) {
            xx = 0 + (((tickAnim - 15) / 16) * (0-(0)));
            yy = 0 + (((tickAnim - 15) / 16) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 16) * (0-(0)));
        }
        else if (tickAnim >= 31 && tickAnim < 53) {
            xx = 0 + (((tickAnim - 31) / 22) * (-50.68563-(0)));
            yy = 0 + (((tickAnim - 31) / 22) * (-10.62926-(0)));
            zz = 0 + (((tickAnim - 31) / 22) * (12.69361-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightToes, rightToes.rotateAngleX + (float) Math.toRadians(xx), rightToes.rotateAngleY + (float) Math.toRadians(yy), rightToes.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            yy = -0.525 + (((tickAnim - 0) / 7) * (0-(-0.525)));
            zz = 2.75 + (((tickAnim - 0) / 7) * (0-(2.75)));
        }
        else if (tickAnim >= 7 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 7) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 7) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 8) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 31) {
            xx = 0 + (((tickAnim - 15) / 16) * (0-(0)));
            yy = 0 + (((tickAnim - 15) / 16) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 16) * (0-(0)));
        }
        else if (tickAnim >= 31 && tickAnim < 53) {
            xx = 0 + (((tickAnim - 31) / 22) * (0-(0)));
            yy = 0 + (((tickAnim - 31) / 22) * (-0.525-(0)));
            zz = 0 + (((tickAnim - 31) / 22) * (2.75-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightToes.rotationPointX = this.rightToes.rotationPointX + (float)(xx);
        this.rightToes.rotationPointY = this.rightToes.rotationPointY - (float)(yy);
        this.rightToes.rotationPointZ = this.rightToes.rotationPointZ + (float)(zz);



        this.setRotateAngle(hips, hips.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*202/0.75))*0.7), hips.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*203/1.5))*-0.5), hips.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*203/1.5-20))*1.5));


        this.setRotateAngle(tail1, tail1.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*202/0.75))*0.1), tail1.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*203/1.5+90))*1.5), tail1.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*203/1.5-20))*1));


        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*202/0.75))*0.1), tail2.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*203/1.5+200))*-3), tail2.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*203/1.5-30))*1));


        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*202/0.75))*0.1), tail3.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*203/1.5+200))*-3), tail3.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*203/1.5-50))*1));


        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*202/0.75-80))*-0.4), tail4.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*203/1.5+200))*-3), tail4.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*203/1.5-50))*0.5));


        this.setRotateAngle(tail5, tail5.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*202/0.75-80))*-0.4), tail5.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*203/1.5+160))*-5), tail5.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*203/1.5-50))*0.5));




        this.setRotateAngle(tail6, tail6.rotateAngleX + (float) Math.toRadians(xx), tail6.rotateAngleY + (float) Math.toRadians(yy), tail6.rotateAngleZ + (float) Math.toRadians(zz));



        this.setRotateAngle(tail7, tail7.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*202/0.75+80))*-3), tail7.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*203/1.5+100))*-15), tail7.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*203/1.5-50))*0.5));


        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*202/0.75-30))*-0.8), body.rotateAngleY + (float) Math.toRadians(0), body.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*203/1.5-40))*-2.5));


        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*202/0.75-140))*-0.5), chest.rotateAngleY + (float) Math.toRadians(0), chest.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*203/1.5-180))*-1));


        this.setRotateAngle(neck1, neck1.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*202/0.75-200))*0.3), neck1.rotateAngleY + (float) Math.toRadians(0), neck1.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*203/1.5-200))*1));


        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*202/0.75-240))*-0.3), neck2.rotateAngleY + (float) Math.toRadians(0), neck2.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*203/1.5-230))*-1));


        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*202/0.75-240))*-0.5), neck3.rotateAngleY + (float) Math.toRadians(0), neck3.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*203/1.5-260))*1));


        this.setRotateAngle(neck4, neck4.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*202/0.75-240))*-0.5), neck4.rotateAngleY + (float) Math.toRadians(0), neck4.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*203/1.5-290))*-1));


        this.setRotateAngle(neck5, neck5.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*202/0.75-260))*-0.5), neck5.rotateAngleY + (float) Math.toRadians(0), neck5.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*203/1.5-320))*-1));


        this.setRotateAngle(neck6, neck6.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*202/0.75-300))*-0.5), neck6.rotateAngleY + (float) Math.toRadians(0), neck6.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*203/1.5-370))*-1));


        this.setRotateAngle(neck7, neck7.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*202/0.75-330))*-0.5), neck7.rotateAngleY + (float) Math.toRadians(0), neck7.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*203/1.5-400))*-1));


        this.setRotateAngle(neck8, neck8.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*202/0.75-330))*-0.5), neck8.rotateAngleY + (float) Math.toRadians(0), neck8.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*203/1.5-440))*-1));

    }

        public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        EntityPrehistoricFloraXinjiangtitan e = (EntityPrehistoricFloraXinjiangtitan) entity;
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
