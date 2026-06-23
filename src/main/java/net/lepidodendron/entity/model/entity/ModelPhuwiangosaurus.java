package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.EntityPrehistoricFloraPhuwiangosaurus;
import net.lepidodendron.entity.EntityPrehistoricFloraPhuwiangosaurus;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;

public class ModelPhuwiangosaurus extends ModelBasePalaeopedia {
    private final AdvancedModelRenderer main;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer leftLeg;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer leftLeg2;
    private final AdvancedModelRenderer leftLeg3;
    private final AdvancedModelRenderer leftLeg4;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer rightLeg;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer rightLeg2;
    private final AdvancedModelRenderer rightLeg3;
    private final AdvancedModelRenderer rightLeg4;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer tail;
    private final AdvancedModelRenderer tail2;
    private final AdvancedModelRenderer tail3;
    private final AdvancedModelRenderer tail4;
    private final AdvancedModelRenderer tail5;
    private final AdvancedModelRenderer tail6;
    private final AdvancedModelRenderer body;
    private final AdvancedModelRenderer cube_r6;
    private final AdvancedModelRenderer body2;
    private final AdvancedModelRenderer cube_r7;
    private final AdvancedModelRenderer cube_r8;
    private final AdvancedModelRenderer cube_r9;
    private final AdvancedModelRenderer leftArm;
    private final AdvancedModelRenderer cube_r10;
    private final AdvancedModelRenderer leftArm2;
    private final AdvancedModelRenderer leftArm3;
    private final AdvancedModelRenderer rightArm;
    private final AdvancedModelRenderer cube_r11;
    private final AdvancedModelRenderer rightArm2;
    private final AdvancedModelRenderer rightArm3;
    private final AdvancedModelRenderer neck;
    private final AdvancedModelRenderer neck2;
    private final AdvancedModelRenderer neck3;
    private final AdvancedModelRenderer neck4;
    private final AdvancedModelRenderer neck5;
    private final AdvancedModelRenderer neck6;
    private final AdvancedModelRenderer head;
    private final AdvancedModelRenderer cube_r12;
    private final AdvancedModelRenderer cube_r13;
    private final AdvancedModelRenderer cube_r14;
    private final AdvancedModelRenderer cube_r15;
    private final AdvancedModelRenderer cube_r16;
    private final AdvancedModelRenderer cube_r17;
    private final AdvancedModelRenderer cube_r18;
    private final AdvancedModelRenderer cube_r19;
    private final AdvancedModelRenderer cube_r20;
    private final AdvancedModelRenderer HEADLEFT;
    private final AdvancedModelRenderer cube_r21;
    private final AdvancedModelRenderer cube_r22;
    private final AdvancedModelRenderer cube_r23;
    private final AdvancedModelRenderer cube_r24;
    private final AdvancedModelRenderer cube_r25;
    private final AdvancedModelRenderer HEADRIGHT;
    private final AdvancedModelRenderer cube_r26;
    private final AdvancedModelRenderer cube_r27;
    private final AdvancedModelRenderer cube_r28;
    private final AdvancedModelRenderer cube_r29;
    private final AdvancedModelRenderer cube_r30;
    private final AdvancedModelRenderer leftEye;
    private final AdvancedModelRenderer rightEye;
    private final AdvancedModelRenderer jaw;
    private final AdvancedModelRenderer cube_r31;
    private final AdvancedModelRenderer cube_r32;
    private final AdvancedModelRenderer cube_r33;
    private final AdvancedModelRenderer JAWLEFT;
    private final AdvancedModelRenderer cube_r34;
    private final AdvancedModelRenderer cube_r35;
    private final AdvancedModelRenderer cube_r36;
    private final AdvancedModelRenderer cube_r37;
    private final AdvancedModelRenderer JAWRIGHT;
    private final AdvancedModelRenderer cube_r38;
    private final AdvancedModelRenderer cube_r39;
    private final AdvancedModelRenderer cube_r40;
    private final AdvancedModelRenderer cube_r41;

    private ModelAnimator animator;

    public ModelPhuwiangosaurus() {
        this.textureWidth = 260;
        this.textureHeight = 260;

        this.main = new AdvancedModelRenderer(this);
        this.main.setRotationPoint(0.0F, -18.0F, 23.75F);
        this.setRotateAngle(main, -0.0436F, 0.0F, 0.0F);
        this.main.cubeList.add(new ModelBox(main, 0, 59, -11.0F, -9.0F, -13.0F, 22, 26, 25, 0.0F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(0.0F, -15.35F, -8.1F);
        this.main.addChild(cube_r1);
        this.setRotateAngle(cube_r1, -0.3054F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 152, 137, -8.0F, 0.0F, -2.0F, 16, 6, 23, 0.0F, false));

        this.leftLeg = new AdvancedModelRenderer(this);
        this.leftLeg.setRotationPoint(10.0F, 0.0F, 0.0F);
        this.main.addChild(leftLeg);
        this.setRotateAngle(leftLeg, -0.1745F, 0.0F, 0.0F);


        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(5.0F, 26.0F, 0.0F);
        this.leftLeg.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.0F, 0.0F, -0.0873F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 198, 44, -10.0F, -32.0F, -6.0F, 10, 30, 12, 0.0F, false));

        this.leftLeg2 = new AdvancedModelRenderer(this);
        this.leftLeg2.setRotationPoint(0.0F, 23.0F, -1.5F);
        this.leftLeg.addChild(leftLeg2);
        this.setRotateAngle(leftLeg2, 0.48F, 0.0F, 0.0F);
        this.leftLeg2.cubeList.add(new ModelBox(leftLeg2, 0, 226, -4.0F, -1.0F, -4.0F, 8, 19, 8, 0.0F, false));

        this.leftLeg3 = new AdvancedModelRenderer(this);
        this.leftLeg3.setRotationPoint(0.0F, 17.0F, 0.0F);
        this.leftLeg2.addChild(leftLeg3);
        this.setRotateAngle(leftLeg3, -0.2618F, 0.0F, 0.0F);
        this.leftLeg3.cubeList.add(new ModelBox(leftLeg3, 125, 44, -5.0F, -0.5F, -5.0F, 10, 4, 9, 0.0F, false));

        this.leftLeg4 = new AdvancedModelRenderer(this);
        this.leftLeg4.setRotationPoint(0.0F, 1.5F, -5.0F);
        this.leftLeg3.addChild(leftLeg4);


        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.leftLeg4.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.0F, -0.2182F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 215, 197, -4.0F, -2.0F, -2.0F, 8, 4, 3, -0.01F, false));

        this.rightLeg = new AdvancedModelRenderer(this);
        this.rightLeg.setRotationPoint(-10.0F, 0.0F, 0.0F);
        this.main.addChild(rightLeg);
        this.setRotateAngle(rightLeg, -0.1745F, 0.0F, 0.0F);


        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(-5.0F, 26.0F, 0.0F);
        this.rightLeg.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.0F, 0.0F, 0.0873F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 198, 44, 0.0F, -32.0F, -6.0F, 10, 30, 12, 0.0F, true));

        this.rightLeg2 = new AdvancedModelRenderer(this);
        this.rightLeg2.setRotationPoint(0.0F, 23.0F, -1.5F);
        this.rightLeg.addChild(rightLeg2);
        this.setRotateAngle(rightLeg2, 0.48F, 0.0F, 0.0F);
        this.rightLeg2.cubeList.add(new ModelBox(rightLeg2, 0, 226, -4.0F, -1.0F, -4.0F, 8, 19, 8, 0.0F, true));

        this.rightLeg3 = new AdvancedModelRenderer(this);
        this.rightLeg3.setRotationPoint(0.0F, 17.0F, 0.0F);
        this.rightLeg2.addChild(rightLeg3);
        this.setRotateAngle(rightLeg3, -0.2618F, 0.0F, 0.0F);
        this.rightLeg3.cubeList.add(new ModelBox(rightLeg3, 125, 44, -5.0F, -0.5F, -5.0F, 10, 4, 9, 0.0F, true));

        this.rightLeg4 = new AdvancedModelRenderer(this);
        this.rightLeg4.setRotationPoint(0.0F, 1.5F, -5.0F);
        this.rightLeg3.addChild(rightLeg4);


        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.rightLeg4.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.0F, 0.2182F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 215, 197, -4.0F, -2.0F, -2.0F, 8, 4, 3, -0.01F, true));

        this.tail = new AdvancedModelRenderer(this);
        this.tail.setRotationPoint(0.0F, 2.0F, 10.0F);
        this.main.addChild(tail);
        this.setRotateAngle(tail, -0.3054F, 0.0F, 0.0F);
        this.tail.cubeList.add(new ModelBox(tail, 0, 111, -7.5F, -11.0F, -2.0F, 15, 20, 25, 0.0F, false));

        this.tail2 = new AdvancedModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, -3.0F, 21.0F);
        this.tail.addChild(tail2);
        this.setRotateAngle(tail2, 0.1745F, 0.0F, 0.0F);
        this.tail2.cubeList.add(new ModelBox(tail2, 81, 137, -5.0F, -7.75F, -2.0F, 10, 15, 25, 0.0F, false));

        this.tail3 = new AdvancedModelRenderer(this);
        this.tail3.setRotationPoint(0.0F, -2.0F, 20.5F);
        this.tail2.addChild(tail3);
        this.setRotateAngle(tail3, 0.1309F, 0.0F, 0.0F);
        this.tail3.cubeList.add(new ModelBox(tail3, 184, 95, -3.0F, -5.5F, -1.5F, 6, 11, 24, 0.0F, false));

        this.tail4 = new AdvancedModelRenderer(this);
        this.tail4.setRotationPoint(0.0F, -0.75F, 21.5F);
        this.tail3.addChild(tail4);
        this.setRotateAngle(tail4, 0.1745F, 0.0F, 0.0F);
        this.tail4.cubeList.add(new ModelBox(tail4, 200, 0, -2.0F, -4.5F, -1.0F, 4, 7, 23, 0.0F, false));

        this.tail5 = new AdvancedModelRenderer(this);
        this.tail5.setRotationPoint(0.0F, -0.75F, 21.0F);
        this.tail4.addChild(tail5);
        this.setRotateAngle(tail5, -0.1309F, 0.0F, 0.0F);
        this.tail5.cubeList.add(new ModelBox(tail5, 110, 205, -1.5F, -3.5F, -1.0F, 3, 4, 23, 0.0F, false));

        this.tail6 = new AdvancedModelRenderer(this);
        this.tail6.setRotationPoint(0.0F, -1.75F, 21.5F);
        this.tail5.addChild(tail6);
        this.setRotateAngle(tail6, -0.3054F, 0.0F, 0.0F);
        this.tail6.cubeList.add(new ModelBox(tail6, 212, 205, -1.0F, -1.5F, -0.5F, 2, 2, 22, 0.0F, false));

        this.body = new AdvancedModelRenderer(this);
        this.body.setRotationPoint(0.0F, -4.0F, -12.0F);
        this.main.addChild(body);
        this.setRotateAngle(body, -0.0873F, 0.0F, 0.0F);
        this.body.cubeList.add(new ModelBox(body, 0, 0, -17.0F, -6.0F, -24.0F, 34, 30, 28, 0.0F, false));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(0.0F, -14.25F, -24.0F);
        this.body.addChild(cube_r6);
        this.setRotateAngle(cube_r6, -0.1309F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 95, 59, -13.0F, -1.25F, 3.0F, 26, 10, 25, 0.0F, false));

        this.body2 = new AdvancedModelRenderer(this);
        this.body2.setRotationPoint(0.0F, -4.0F, -22.0F);
        this.body.addChild(body2);
        this.setRotateAngle(body2, -0.1745F, 0.0F, 0.0F);


        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(0.0F, 24.9063F, -11.1398F);
        this.body2.addChild(cube_r7);
        this.setRotateAngle(cube_r7, -0.1571F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 69, 178, -11.0F, -7.0F, 0.0F, 22, 7, 16, 0.0F, false));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(0.0F, 3.6706F, -12.684F);
        this.body2.addChild(cube_r8);
        this.setRotateAngle(cube_r8, -0.2182F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 0, 157, -9.0F, -17.0F, -2.5F, 18, 18, 16, 0.0F, false));

        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(0.0F, 5.0F, -12.0F);
        this.body2.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.3491F, 0.0F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 95, 95, -12.0F, -2.0F, -6.0F, 24, 21, 20, 0.0F, false));

        this.leftArm = new AdvancedModelRenderer(this);
        this.leftArm.setRotationPoint(12.0F, 20.0F, -6.0F);
        this.body2.addChild(leftArm);
        this.setRotateAngle(leftArm, 0.5672F, 0.0F, 0.0873F);


        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(5.0F, 19.0F, 0.0F);
        this.leftArm.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 0.0F, 0.0F, -0.0873F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 215, 167, -8.0F, -22.0F, -4.0F, 8, 22, 7, 0.0F, false));

        this.leftArm2 = new AdvancedModelRenderer(this);
        this.leftArm2.setRotationPoint(1.0F, 18.0F, -1.0F);
        this.leftArm.addChild(leftArm2);
        this.setRotateAngle(leftArm2, -0.5672F, 0.0F, 0.0F);
        this.leftArm2.cubeList.add(new ModelBox(leftArm2, 231, 131, -3.0F, -1.0F, -2.5F, 6, 15, 6, 0.0F, false));

        this.leftArm3 = new AdvancedModelRenderer(this);
        this.leftArm3.setRotationPoint(0.0F, 13.0F, 0.5F);
        this.leftArm2.addChild(leftArm3);
        this.setRotateAngle(leftArm3, 0.3054F, 0.0F, -0.0873F);
        this.leftArm3.cubeList.add(new ModelBox(leftArm3, 200, 31, -4.0F, -1.0F, -2.5F, 8, 7, 5, 0.0F, false));

        this.rightArm = new AdvancedModelRenderer(this);
        this.rightArm.setRotationPoint(-12.0F, 20.0F, -6.0F);
        this.body2.addChild(rightArm);
        this.setRotateAngle(rightArm, 0.5672F, 0.0F, -0.0873F);


        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(-5.0F, 19.0F, 0.0F);
        this.rightArm.addChild(cube_r11);
        this.setRotateAngle(cube_r11, 0.0F, 0.0F, 0.0873F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 215, 167, 0.0F, -22.0F, -4.0F, 8, 22, 7, 0.0F, true));

        this.rightArm2 = new AdvancedModelRenderer(this);
        this.rightArm2.setRotationPoint(-1.0F, 18.0F, -1.0F);
        this.rightArm.addChild(rightArm2);
        this.setRotateAngle(rightArm2, -0.5672F, 0.0F, 0.0F);
        this.rightArm2.cubeList.add(new ModelBox(rightArm2, 231, 131, -3.0F, -1.0F, -2.5F, 6, 15, 6, 0.0F, true));

        this.rightArm3 = new AdvancedModelRenderer(this);
        this.rightArm3.setRotationPoint(0.0F, 13.0F, 0.5F);
        this.rightArm2.addChild(rightArm3);
        this.setRotateAngle(rightArm3, 0.3054F, 0.0F, 0.0873F);
        this.rightArm3.cubeList.add(new ModelBox(rightArm3, 200, 31, -4.0F, -1.0F, -2.5F, 8, 7, 5, 0.0F, true));

        this.neck = new AdvancedModelRenderer(this);
        this.neck.setRotationPoint(0.0F, 0.0F, -14.5F);
        this.body2.addChild(neck);
        this.setRotateAngle(neck, -0.5672F, 0.0F, 0.0F);
        this.neck.cubeList.add(new ModelBox(neck, 125, 0, -7.0F, -13.0F, -18.5F, 14, 20, 23, 0.0F, false));

        this.neck2 = new AdvancedModelRenderer(this);
        this.neck2.setRotationPoint(0.0F, -2.75F, -17.0F);
        this.neck.addChild(neck2);
        this.setRotateAngle(neck2, -0.2182F, 0.0F, 0.0F);
        this.neck2.cubeList.add(new ModelBox(neck2, 152, 167, -5.5F, -10.0F, -18.5F, 11, 17, 20, 0.0F, false));

        this.neck3 = new AdvancedModelRenderer(this);
        this.neck3.setRotationPoint(0.0F, -1.75F, -17.0F);
        this.neck2.addChild(neck3);
        this.neck3.cubeList.add(new ModelBox(neck3, 0, 192, -4.5F, -8.0F, -17.5F, 9, 14, 19, 0.0F, false));

        this.neck4 = new AdvancedModelRenderer(this);
        this.neck4.setRotationPoint(0.0F, -1.75F, -16.0F);
        this.neck3.addChild(neck4);
        this.setRotateAngle(neck4, -0.0436F, 0.0F, 0.0F);
        this.neck4.cubeList.add(new ModelBox(neck4, 57, 202, -4.0F, -6.0F, -16.5F, 8, 12, 18, 0.0F, false));

        this.neck5 = new AdvancedModelRenderer(this);
        this.neck5.setRotationPoint(0.0F, -0.5F, -15.0F);
        this.neck4.addChild(neck5);
        this.setRotateAngle(neck5, 0.2182F, 0.0F, 0.0F);
        this.neck5.cubeList.add(new ModelBox(neck5, 163, 205, -3.5F, -5.25F, -15.5F, 7, 10, 17, 0.0F, false));

        this.neck6 = new AdvancedModelRenderer(this);
        this.neck6.setRotationPoint(0.0F, 0.25F, -14.0F);
        this.neck5.addChild(neck6);
        this.setRotateAngle(neck6, 0.48F, 0.0F, 0.0F);
        this.neck6.cubeList.add(new ModelBox(neck6, 212, 230, -3.0F, -5.25F, -8.5F, 6, 7, 10, 0.0F, false));
        this.neck6.cubeList.add(new ModelBox(neck6, 164, 44, -2.0F, 1.75F, -8.5F, 4, 1, 10, 0.0F, false));

        this.head = new AdvancedModelRenderer(this);
        this.head.setRotationPoint(0.0F, -2.75F, -7.0F);
        this.neck6.addChild(head);
        this.setRotateAngle(head, 0.5236F, 0.0F, 0.0F);
        this.head.cubeList.add(new ModelBox(head, 227, 31, -3.5F, -3.0F, -4.5F, 7, 5, 5, 0.01F, false));

        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(0.0F, -3.2634F, -4.067F);
        this.head.addChild(cube_r12);
        this.setRotateAngle(cube_r12, -1.7017F, 0.0F, 0.0F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 79, 233, -1.0F, -2.0F, 0.0F, 2, 2, 1, 0.0F, false));

        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(0.0F, -2.5794F, -5.9464F);
        this.head.addChild(cube_r13);
        this.setRotateAngle(cube_r13, -1.2217F, 0.0F, 0.0F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 206, 131, -1.0F, -2.0F, 0.0F, 2, 2, 2, 0.01F, false));

        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(0.0F, -2.0421F, -6.7898F);
        this.head.addChild(cube_r14);
        this.setRotateAngle(cube_r14, -1.0036F, 0.0F, 0.0F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 56, 233, -1.0F, -1.0F, -0.0102F, 2, 1, 2, 0.0F, false));

        this.cube_r15 = new AdvancedModelRenderer(this);
        this.cube_r15.setRotationPoint(0.0F, 1.422F, -8.7898F);
        this.head.addChild(cube_r15);
        this.setRotateAngle(cube_r15, -0.5236F, 0.0F, 0.0F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 57, 192, -1.0F, -4.0F, 0.0F, 2, 4, 2, 0.01F, false));

        this.cube_r16 = new AdvancedModelRenderer(this);
        this.cube_r16.setRotationPoint(0.0F, 2.422F, -10.5219F);
        this.head.addChild(cube_r16);
        this.setRotateAngle(cube_r16, -1.0472F, 0.0F, 0.0F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 224, 131, -1.0F, -3.0F, 0.0F, 2, 3, 1, 0.0F, false));

        this.cube_r17 = new AdvancedModelRenderer(this);
        this.cube_r17.setRotationPoint(0.0F, 4.4049F, -10.2608F);
        this.head.addChild(cube_r17);
        this.setRotateAngle(cube_r17, 0.1309F, 0.0F, 0.0F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 69, 174, -1.5F, -0.5F, 0.0F, 3, 1, 2, -0.01F, false));

        this.cube_r18 = new AdvancedModelRenderer(this);
        this.cube_r18.setRotationPoint(0.0F, 4.1439F, -8.2779F);
        this.head.addChild(cube_r18);
        this.setRotateAngle(cube_r18, 0.1309F, 0.0F, 0.0F);
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 69, 169, -1.5F, -2.0F, -2.0F, 3, 2, 2, 0.0F, false));

        this.cube_r19 = new AdvancedModelRenderer(this);
        this.cube_r19.setRotationPoint(0.0F, 4.4145F, -7.6246F);
        this.head.addChild(cube_r19);
        this.setRotateAngle(cube_r19, 0.3054F, 0.0F, 0.0F);
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 231, 163, -1.0F, -1.0F, -2.0F, 2, 1, 2, 0.01F, false));

        this.cube_r20 = new AdvancedModelRenderer(this);
        this.cube_r20.setRotationPoint(0.0F, 0.0F, -3.5F);
        this.head.addChild(cube_r20);
        this.setRotateAngle(cube_r20, 0.3927F, 0.0F, 0.0F);
        this.cube_r20.cubeList.add(new ModelBox(cube_r20, 33, 226, -2.5F, 0.0F, -6.0F, 5, 2, 6, 0.0F, false));

        this.HEADLEFT = new AdvancedModelRenderer(this);
        this.HEADLEFT.setRotationPoint(0.5F, -0.2751F, -6.0291F);
        this.head.addChild(HEADLEFT);


        this.cube_r21 = new AdvancedModelRenderer(this);
        this.cube_r21.setRotationPoint(-0.5F, 4.68F, -4.2317F);
        this.HEADLEFT.addChild(cube_r21);
        this.setRotateAngle(cube_r21, 0.1309F, 0.0F, 0.0F);
        this.cube_r21.cubeList.add(new ModelBox(cube_r21, 92, 114, 1.48F, -0.5149F, 1.2508F, 0, 1, 1, 0.0F, false));

        this.cube_r22 = new AdvancedModelRenderer(this);
        this.cube_r22.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.HEADLEFT.addChild(cube_r22);
        this.setRotateAngle(cube_r22, 1.0472F, 0.0F, 0.0F);
        this.cube_r22.cubeList.add(new ModelBox(cube_r22, 81, 118, 0.49F, 0.035F, -0.9909F, 1, 2, 4, 0.0F, false));

        this.cube_r23 = new AdvancedModelRenderer(this);
        this.cube_r23.setRotationPoint(0.0F, 2.5712F, -3.0142F);
        this.HEADLEFT.addChild(cube_r23);
        this.setRotateAngle(cube_r23, 0.6981F, 0.0F, 0.0F);
        this.cube_r23.cubeList.add(new ModelBox(cube_r23, 81, 111, 0.5F, 0.0F, 0.0F, 1, 2, 4, 0.0F, false));

        this.cube_r24 = new AdvancedModelRenderer(this);
        this.cube_r24.setRotationPoint(-0.5F, 4.7885F, -2.0957F);
        this.HEADLEFT.addChild(cube_r24);
        this.setRotateAngle(cube_r24, 0.4974F, 0.0F, 0.0F);
        this.cube_r24.cubeList.add(new ModelBox(cube_r24, 69, 163, 1.47F, -0.8434F, 0.1F, 1, 1, 4, 0.0F, false));

        this.cube_r25 = new AdvancedModelRenderer(this);
        this.cube_r25.setRotationPoint(-0.5F, 0.2751F, 2.5291F);
        this.HEADLEFT.addChild(cube_r25);
        this.setRotateAngle(cube_r25, 0.3927F, 0.0F, 0.0F);
        this.cube_r25.cubeList.add(new ModelBox(cube_r25, 72, 233, 1.0F, 1.5F, -5.5F, 1, 1, 2, 0.0F, false));

        this.HEADRIGHT = new AdvancedModelRenderer(this);
        this.HEADRIGHT.setRotationPoint(-0.5F, -0.2751F, -6.0291F);
        this.head.addChild(HEADRIGHT);


        this.cube_r26 = new AdvancedModelRenderer(this);
        this.cube_r26.setRotationPoint(0.5F, 4.68F, -4.2317F);
        this.HEADRIGHT.addChild(cube_r26);
        this.setRotateAngle(cube_r26, 0.1309F, 0.0F, 0.0F);
        this.cube_r26.cubeList.add(new ModelBox(cube_r26, 92, 114, -1.48F, -0.5149F, 1.2508F, 0, 1, 1, 0.0F, true));

        this.cube_r27 = new AdvancedModelRenderer(this);
        this.cube_r27.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.HEADRIGHT.addChild(cube_r27);
        this.setRotateAngle(cube_r27, 1.0472F, 0.0F, 0.0F);
        this.cube_r27.cubeList.add(new ModelBox(cube_r27, 81, 118, -1.49F, 0.035F, -0.9909F, 1, 2, 4, 0.0F, true));

        this.cube_r28 = new AdvancedModelRenderer(this);
        this.cube_r28.setRotationPoint(0.0F, 2.5712F, -3.0142F);
        this.HEADRIGHT.addChild(cube_r28);
        this.setRotateAngle(cube_r28, 0.6981F, 0.0F, 0.0F);
        this.cube_r28.cubeList.add(new ModelBox(cube_r28, 81, 111, -1.5F, 0.0F, 0.0F, 1, 2, 4, 0.0F, true));

        this.cube_r29 = new AdvancedModelRenderer(this);
        this.cube_r29.setRotationPoint(0.5F, 4.7885F, -2.0957F);
        this.HEADRIGHT.addChild(cube_r29);
        this.setRotateAngle(cube_r29, 0.4974F, 0.0F, 0.0F);
        this.cube_r29.cubeList.add(new ModelBox(cube_r29, 69, 163, -2.47F, -0.8434F, 0.1F, 1, 1, 4, 0.0F, true));

        this.cube_r30 = new AdvancedModelRenderer(this);
        this.cube_r30.setRotationPoint(0.5F, 0.2751F, 2.5291F);
        this.HEADRIGHT.addChild(cube_r30);
        this.setRotateAngle(cube_r30, 0.3927F, 0.0F, 0.0F);
        this.cube_r30.cubeList.add(new ModelBox(cube_r30, 72, 233, -2.0F, 1.5F, -5.5F, 1, 1, 2, 0.0F, true));

        this.leftEye = new AdvancedModelRenderer(this);
        this.leftEye.setRotationPoint(3.6F, -0.6F, -3.0F);
        this.head.addChild(leftEye);
        this.leftEye.cubeList.add(new ModelBox(leftEye, 164, 56, -2.0F, -1.0F, -1.0F, 2, 1, 1, 0.0F, false));

        this.rightEye = new AdvancedModelRenderer(this);
        this.rightEye.setRotationPoint(-3.6F, -0.6F, -3.0F);
        this.head.addChild(rightEye);
        this.rightEye.cubeList.add(new ModelBox(rightEye, 164, 56, 0.0F, -1.0F, -1.0F, 2, 1, 1, 0.0F, true));

        this.jaw = new AdvancedModelRenderer(this);
        this.jaw.setRotationPoint(0.0F, 2.0F, -1.0F);
        this.head.addChild(jaw);
        this.setRotateAngle(jaw, 0.0393F, 0.0F, 0.0F);
        this.jaw.cubeList.add(new ModelBox(jaw, 198, 87, -3.5F, 0.0F, -3.5F, 7, 2, 5, 0.0F, false));
        this.jaw.cubeList.add(new ModelBox(jaw, 231, 153, -1.5F, 0.836F, -4.6166F, 3, 2, 7, 0.0F, false));

        this.cube_r31 = new AdvancedModelRenderer(this);
        this.cube_r31.setRotationPoint(0.0F, 2.7705F, -8.8221F);
        this.jaw.addChild(cube_r31);
        this.setRotateAngle(cube_r31, 0.48F, 0.0F, 0.0F);
        this.cube_r31.cubeList.add(new ModelBox(cube_r31, 195, 131, -1.5F, -0.5F, -0.3F, 3, 1, 2, -0.02F, false));

        this.cube_r32 = new AdvancedModelRenderer(this);
        this.cube_r32.setRotationPoint(0.0F, 0.0F, -3.5F);
        this.jaw.addChild(cube_r32);
        this.setRotateAngle(cube_r32, 0.48F, 0.0F, 0.0F);
        this.cube_r32.cubeList.add(new ModelBox(cube_r32, 184, 131, -1.5F, 0.0F, -6.29F, 3, 2, 2, 0.0F, false));
        this.cube_r32.cubeList.add(new ModelBox(cube_r32, 215, 131, -1.0F, -0.5F, -5.8F, 2, 1, 2, 0.0F, false));
        this.cube_r32.cubeList.add(new ModelBox(cube_r32, 223, 87, -2.5F, 0.0F, -4.3F, 5, 2, 5, -0.01F, false));

        this.cube_r33 = new AdvancedModelRenderer(this);
        this.cube_r33.setRotationPoint(0.0F, 0.45F, -3.8F);
        this.jaw.addChild(cube_r33);
        this.setRotateAngle(cube_r33, -0.1745F, 0.0F, 0.0F);
        this.cube_r33.cubeList.add(new ModelBox(cube_r33, 81, 132, -2.5F, -1.95F, -0.45F, 5, 2, 1, -0.02F, false));

        this.JAWLEFT = new AdvancedModelRenderer(this);
        this.JAWLEFT.setRotationPoint(-0.05F, 0.0F, -3.5F);
        this.jaw.addChild(JAWLEFT);


        this.cube_r34 = new AdvancedModelRenderer(this);
        this.cube_r34.setRotationPoint(-36.0F, 0.0F, 0.0F);
        this.JAWLEFT.addChild(cube_r34);
        this.setRotateAngle(cube_r34, -0.2967F, 0.0F, 0.0F);
        this.cube_r34.cubeList.add(new ModelBox(cube_r34, 81, 125, 38.5F, -2.0F, 0.0F, 1, 2, 4, 0.0F, false));

        this.cube_r35 = new AdvancedModelRenderer(this);
        this.cube_r35.setRotationPoint(0.05F, 0.0F, 0.0F);
        this.JAWLEFT.addChild(cube_r35);
        this.setRotateAngle(cube_r35, 0.48F, 0.0F, 0.0F);
        this.cube_r35.cubeList.add(new ModelBox(cube_r35, 65, 233, 0.99F, -0.5F, -3.8F, 1, 1, 2, 0.0F, false));

        this.cube_r36 = new AdvancedModelRenderer(this);
        this.cube_r36.setRotationPoint(0.05F, 2.7705F, -5.3221F);
        this.JAWLEFT.addChild(cube_r36);
        this.setRotateAngle(cube_r36, 0.48F, 0.0F, 0.0F);
        this.cube_r36.cubeList.add(new ModelBox(cube_r36, 92, 111, 1.47F, -0.4805F, 0.8221F, 0, 1, 1, 0.0F, false));

        this.cube_r37 = new AdvancedModelRenderer(this);
        this.cube_r37.setRotationPoint(0.05F, 1.4766F, -3.8981F);
        this.JAWLEFT.addChild(cube_r37);
        this.setRotateAngle(cube_r37, 0.4014F, 0.0F, 0.0F);
        this.cube_r37.cubeList.add(new ModelBox(cube_r37, 69, 157, 1.47F, 0.0076F, -0.05F, 1, 1, 4, 0.0F, false));

        this.JAWRIGHT = new AdvancedModelRenderer(this);
        this.JAWRIGHT.setRotationPoint(0.05F, 0.0F, -3.5F);
        this.jaw.addChild(JAWRIGHT);


        this.cube_r38 = new AdvancedModelRenderer(this);
        this.cube_r38.setRotationPoint(36.0F, 0.0F, 0.0F);
        this.JAWRIGHT.addChild(cube_r38);
        this.setRotateAngle(cube_r38, -0.2967F, 0.0F, 0.0F);
        this.cube_r38.cubeList.add(new ModelBox(cube_r38, 81, 125, -39.5F, -2.0F, 0.0F, 1, 2, 4, 0.0F, true));

        this.cube_r39 = new AdvancedModelRenderer(this);
        this.cube_r39.setRotationPoint(-0.05F, 0.0F, 0.0F);
        this.JAWRIGHT.addChild(cube_r39);
        this.setRotateAngle(cube_r39, 0.48F, 0.0F, 0.0F);
        this.cube_r39.cubeList.add(new ModelBox(cube_r39, 65, 233, -1.99F, -0.5F, -3.8F, 1, 1, 2, 0.0F, true));

        this.cube_r40 = new AdvancedModelRenderer(this);
        this.cube_r40.setRotationPoint(-0.05F, 2.7705F, -5.3221F);
        this.JAWRIGHT.addChild(cube_r40);
        this.setRotateAngle(cube_r40, 0.48F, 0.0F, 0.0F);
        this.cube_r40.cubeList.add(new ModelBox(cube_r40, 92, 111, -1.47F, -0.4805F, 0.8221F, 0, 1, 1, 0.0F, true));

        this.cube_r41 = new AdvancedModelRenderer(this);
        this.cube_r41.setRotationPoint(-0.05F, 1.4766F, -3.8981F);
        this.JAWRIGHT.addChild(cube_r41);
        this.setRotateAngle(cube_r41, 0.4014F, 0.0F, 0.0F);
        this.cube_r41.cubeList.add(new ModelBox(cube_r41, 69, 157, -2.47F, 0.0076F, -0.05F, 1, 1, 4, 0.0F, true));

        updateDefaultPose();
        animator = ModelAnimator.create();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        animate((IAnimatedEntity) entity, f, f1, f2, f3, f4, f5);
        this.main.render(f5);
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
        this.main.offsetY = 1.8F;
        this.main.offsetX = 0.2F;
        this.main.rotateAngleY = (float)Math.toRadians(-68);
        this.main.rotateAngleX = (float)Math.toRadians(15);
        this.main.rotateAngleZ = (float)Math.toRadians(-10);
        this.main.scaleChildren = true;
        float scaler = 0.35F;
        this.main.setScale(scaler, scaler, scaler);
        //Start of pose:
        this.setRotateAngle(main, 0.4F, 3.8F, -0.2F);
        //End of pose, now render the model:
        this.main.render(f);
        //Reset rotations, positions and sizing:
        this.main.setScale(1.0F, 1.0F, 1.0F);
        this.main.scaleChildren = false;
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

        EntityPrehistoricFloraPhuwiangosaurus camara = (EntityPrehistoricFloraPhuwiangosaurus) e;

//        this.faceTarget(f3, f4, 6, neck1);
//        this.faceTarget(f3, f4, 6, neck2);
//        this.faceTarget(f3, f4, 6, neck3);
//        this.faceTarget(f3, f4, 4, neck4);
//        this.faceTarget(f3, f4, 4, neck5);
//        this.faceTarget(f3, f4, 4, head);

        boolean isBaby = camara.getJuvenile();

        if (isBaby) {
            this.neck4.scaleChildren = true;
            this.neck3.scaleChildren = true;
            this.head.scaleChildren = true;
            this.neck4.setScale(1.025F, 1.025F, 1.025F);
            this.neck3.setScale(1.025F, 1.025F, 1.025F);
            this.head.setScale(1.375F, 1.375F, 1.375F);
        }
        else {
            this.neck4.scaleChildren = true;
            this.neck3.scaleChildren = true;
            this.head.scaleChildren = true;
            this.neck4.setScale(1F, 1, 1F);
            this.neck3.setScale(1F, 1, 1F);
            this.head.setScale(1F, 1, 1F);
        }

        AdvancedModelRenderer[] Tail = {this.tail, this.tail2, this.tail3, this.tail4, this.tail5, this.tail6};
        AdvancedModelRenderer[] Neck = {this.neck, this.neck2, this.neck3, this.neck4, this.head};
        //AdvancedModelRenderer[] ArmL = {this.leftarm, this.leftarm2, this.leftarm3};
        //AdvancedModelRenderer[] ArmR = {this.rightarm, this.rightarm2, this.rightarm3};

        camara.tailBuffer.applyChainSwingBuffer(Tail);
        float masterSpeed = camara.getTravelSpeed()/2;

            if (!camara.isInWater()) {

                if (f3 == 0.0F || !camara.getIsMoving()) {
                    if (camara.getAnimation() != camara.EAT_ANIMATION
                        && camara.getAnimation() != camara.DRINK_ANIMATION
                        && camara.getAnimation() != camara.ATTACK_ANIMATION) {
                        this.chainFlap(Neck, 0.05F, 0.05F, 0.5, f2, 0.8F);
                        this.chainWave(Neck, 0.04F * 2, -0.02F, 0.5F, f2, 0.8F);
                        this.walk(jaw, (float) ( 0.04), 0.1F, true, 0, 0, f2, 1);
                    }

                    if (camara.getAnimation() != camara.ATTACK_ANIMATION) {
                        this.chainFlap(Tail, (0.15F * 0.1F), 0.1F, 0.2F, f2, 1F);
                        this.chainWave(Tail, (0.15F * 0.1F) * 2F, 0.05F * 0.35F, 0.12F, f2, 1F);
                        this.chainSwing(Tail, (0.15F * 0.1F) * 8F, 0.05F * 0.35F, 0F, f2, 1F);
                    }

                    return;
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
        EntityPrehistoricFloraPhuwiangosaurus ee = (EntityPrehistoricFloraPhuwiangosaurus) entitylivingbaseIn;

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
        else if (ee.getAnimation() == ee.ROAR_ANIMATION) { //The roar anim
            animRoar(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.NOISE_ANIMATION) { //The noise anim
            animNoise(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.GRAZE_ANIMATION) { //The leaves grazing anim
            animGraze(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }


    }



    public void animGraze(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraPhuwiangosaurus entity = (EntityPrehistoricFloraPhuwiangosaurus) entitylivingbaseIn;
        int animCycle = 180;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (-1.75-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 151) {
            xx = -1.75 + (((tickAnim - 40) / 111) * (-1.75-(-1.75)));
            yy = 0 + (((tickAnim - 40) / 111) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 111) * (0-(0)));
        }
        else if (tickAnim >= 151 && tickAnim < 180) {
            xx = -1.75 + (((tickAnim - 151) / 29) * (0-(-1.75)));
            yy = 0 + (((tickAnim - 151) / 29) * (0-(0)));
            zz = 0 + (((tickAnim - 151) / 29) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(main, main.rotateAngleX + (float) Math.toRadians(xx), main.rotateAngleY + (float) Math.toRadians(yy), main.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (-1.75-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 151) {
            xx = 0 + (((tickAnim - 40) / 111) * (0-(0)));
            yy = 0 + (((tickAnim - 40) / 111) * (0-(0)));
            zz = -1.75 + (((tickAnim - 40) / 111) * (-1.75-(-1.75)));
        }
        else if (tickAnim >= 151 && tickAnim < 180) {
            xx = 0 + (((tickAnim - 151) / 29) * (0-(0)));
            yy = 0 + (((tickAnim - 151) / 29) * (0-(0)));
            zz = -1.75 + (((tickAnim - 151) / 29) * (0-(-1.75)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.main.rotationPointX = this.main.rotationPointX + (float)(xx);
        this.main.rotationPointY = this.main.rotationPointY - (float)(yy);
        this.main.rotationPointZ = this.main.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (6.75-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 151) {
            xx = 6.75 + (((tickAnim - 40) / 111) * (6.75-(6.75)));
            yy = 0 + (((tickAnim - 40) / 111) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 111) * (0-(0)));
        }
        else if (tickAnim >= 151 && tickAnim < 180) {
            xx = 6.75 + (((tickAnim - 151) / 29) * (0-(6.75)));
            yy = 0 + (((tickAnim - 151) / 29) * (0-(0)));
            zz = 0 + (((tickAnim - 151) / 29) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg, leftLeg.rotateAngleX + (float) Math.toRadians(xx), leftLeg.rotateAngleY + (float) Math.toRadians(yy), leftLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (-1.5-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 151) {
            xx = -1.5 + (((tickAnim - 40) / 111) * (-1.5-(-1.5)));
            yy = 0 + (((tickAnim - 40) / 111) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 111) * (0-(0)));
        }
        else if (tickAnim >= 151 && tickAnim < 180) {
            xx = -1.5 + (((tickAnim - 151) / 29) * (0-(-1.5)));
            yy = 0 + (((tickAnim - 151) / 29) * (0-(0)));
            zz = 0 + (((tickAnim - 151) / 29) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg2, leftLeg2.rotateAngleX + (float) Math.toRadians(xx), leftLeg2.rotateAngleY + (float) Math.toRadians(yy), leftLeg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (-0.5-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 151) {
            xx = 0 + (((tickAnim - 40) / 111) * (0-(0)));
            yy = -0.5 + (((tickAnim - 40) / 111) * (-0.5-(-0.5)));
            zz = 0 + (((tickAnim - 40) / 111) * (0-(0)));
        }
        else if (tickAnim >= 151 && tickAnim < 180) {
            xx = 0 + (((tickAnim - 151) / 29) * (0-(0)));
            yy = -0.5 + (((tickAnim - 151) / 29) * (0-(-0.5)));
            zz = 0 + (((tickAnim - 151) / 29) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftLeg2.rotationPointX = this.leftLeg2.rotationPointX + (float)(xx);
        this.leftLeg2.rotationPointY = this.leftLeg2.rotationPointY - (float)(yy);
        this.leftLeg2.rotationPointZ = this.leftLeg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (-2.75-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 151) {
            xx = -2.75 + (((tickAnim - 40) / 111) * (-2.75-(-2.75)));
            yy = 0 + (((tickAnim - 40) / 111) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 111) * (0-(0)));
        }
        else if (tickAnim >= 151 && tickAnim < 180) {
            xx = -2.75 + (((tickAnim - 151) / 29) * (0-(-2.75)));
            yy = 0 + (((tickAnim - 151) / 29) * (0-(0)));
            zz = 0 + (((tickAnim - 151) / 29) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg3, leftLeg3.rotateAngleX + (float) Math.toRadians(xx), leftLeg3.rotateAngleY + (float) Math.toRadians(yy), leftLeg3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*90))*1-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 140) {
            xx = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*90))*1 + (((tickAnim - 40) / 100) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*90))*1-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*90))*1)));
            yy = 0 + (((tickAnim - 40) / 100) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 100) * (0-(0)));
        }
        else if (tickAnim >= 140 && tickAnim < 180) {
            xx = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*90))*1 + (((tickAnim - 140) / 40) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*90))*1)));
            yy = 0 + (((tickAnim - 140) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 140) / 40) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail, tail.rotateAngleX + (float) Math.toRadians(xx), tail.rotateAngleY + (float) Math.toRadians(yy), tail.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*90-50))*1-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 140) {
            xx = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*90-50))*1 + (((tickAnim - 40) / 100) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*90-50))*1-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*90-50))*1)));
            yy = 0 + (((tickAnim - 40) / 100) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 100) * (0-(0)));
        }
        else if (tickAnim >= 140 && tickAnim < 180) {
            xx = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*90-50))*1 + (((tickAnim - 140) / 40) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*90-50))*1)));
            yy = 0 + (((tickAnim - 140) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 140) / 40) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(xx), tail2.rotateAngleY + (float) Math.toRadians(yy), tail2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*90-100))*1-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 140) {
            xx = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*90-100))*1 + (((tickAnim - 40) / 100) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*90-100))*1-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*90-100))*1)));
            yy = 0 + (((tickAnim - 40) / 100) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 100) * (0-(0)));
        }
        else if (tickAnim >= 140 && tickAnim < 180) {
            xx = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*90-100))*1 + (((tickAnim - 140) / 40) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*90-100))*1)));
            yy = 0 + (((tickAnim - 140) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 140) / 40) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(xx), tail3.rotateAngleY + (float) Math.toRadians(yy), tail3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*90-150))*1-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 140) {
            xx = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*90-150))*1 + (((tickAnim - 40) / 100) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*90-150))*1-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*90-150))*1)));
            yy = 0 + (((tickAnim - 40) / 100) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 100) * (0-(0)));
        }
        else if (tickAnim >= 140 && tickAnim < 180) {
            xx = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*90-150))*1 + (((tickAnim - 140) / 40) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*90-150))*1)));
            yy = 0 + (((tickAnim - 140) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 140) / 40) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(xx), tail4.rotateAngleY + (float) Math.toRadians(yy), tail4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*90-200))*2-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 140) {
            xx = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*90-200))*2 + (((tickAnim - 40) / 100) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*90-200))*2-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*90-200))*2)));
            yy = 0 + (((tickAnim - 40) / 100) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 100) * (0-(0)));
        }
        else if (tickAnim >= 140 && tickAnim < 180) {
            xx = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*90-200))*2 + (((tickAnim - 140) / 40) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*90-200))*2)));
            yy = 0 + (((tickAnim - 140) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 140) / 40) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail5, tail5.rotateAngleX + (float) Math.toRadians(xx), tail5.rotateAngleY + (float) Math.toRadians(yy), tail5.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*90-250))*3-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 140) {
            xx = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*90-250))*3 + (((tickAnim - 40) / 100) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*90-250))*3-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*90-250))*3)));
            yy = 0 + (((tickAnim - 40) / 100) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 100) * (0-(0)));
        }
        else if (tickAnim >= 140 && tickAnim < 180) {
            xx = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*90-250))*3 + (((tickAnim - 140) / 40) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*90-250))*3)));
            yy = 0 + (((tickAnim - 140) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 140) / 40) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail6, tail6.rotateAngleX + (float) Math.toRadians(xx), tail6.rotateAngleY + (float) Math.toRadians(yy), tail6.rotateAngleZ + (float) Math.toRadians(zz));



        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(0), body.rotateAngleY + (float) Math.toRadians(0), body.rotateAngleZ + (float) Math.toRadians(0));



        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (-16.25-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 151) {
            xx = -16.25 + (((tickAnim - 40) / 111) * (-16.25-(-16.25)));
            yy = 0 + (((tickAnim - 40) / 111) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 111) * (0-(0)));
        }
        else if (tickAnim >= 151 && tickAnim < 165) {
            xx = -16.25 + (((tickAnim - 151) / 14) * (-20.51-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-30))*-50-(-16.25)));
            yy = 0 + (((tickAnim - 151) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 151) / 14) * (0-(0)));
        }
        else if (tickAnim >= 165 && tickAnim < 180) {
            xx = -20.51-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-30))*-50 + (((tickAnim - 165) / 15) * (0-(-20.51-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-30))*-50)));
            yy = 0 + (((tickAnim - 165) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 165) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm, leftArm.rotateAngleX + (float) Math.toRadians(xx), leftArm.rotateAngleY + (float) Math.toRadians(yy), leftArm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (25.05+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-50-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 40) {
            xx = 25.05+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-50 + (((tickAnim - 20) / 20) * (15.25-(25.05+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-50)));
            yy = 0 + (((tickAnim - 20) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 20) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 151) {
            xx = 15.25 + (((tickAnim - 40) / 111) * (15.25-(15.25)));
            yy = 0 + (((tickAnim - 40) / 111) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 111) * (0-(0)));
        }
        else if (tickAnim >= 151 && tickAnim < 165) {
            xx = 15.25 + (((tickAnim - 151) / 14) * (28.125-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-30))*50-(15.25)));
            yy = 0 + (((tickAnim - 151) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 151) / 14) * (0-(0)));
        }
        else if (tickAnim >= 165 && tickAnim < 180) {
            xx = 28.125-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-30))*50 + (((tickAnim - 165) / 15) * (0-(28.125-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-30))*50)));
            yy = 0 + (((tickAnim - 165) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 165) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm2, leftArm2.rotateAngleX + (float) Math.toRadians(xx), leftArm2.rotateAngleY + (float) Math.toRadians(yy), leftArm2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0.565-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 20) / 20) * (0-(0)));
            yy = 0.565 + (((tickAnim - 20) / 20) * (-1.325-(0.565)));
            zz = 0 + (((tickAnim - 20) / 20) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 151) {
            xx = 0 + (((tickAnim - 40) / 111) * (0-(0)));
            yy = -1.325 + (((tickAnim - 40) / 111) * (-1.325-(-1.325)));
            zz = 0 + (((tickAnim - 40) / 111) * (0-(0)));
        }
        else if (tickAnim >= 151 && tickAnim < 165) {
            xx = 0 + (((tickAnim - 151) / 14) * (0-(0)));
            yy = -1.325 + (((tickAnim - 151) / 14) * (1.045-(-1.325)));
            zz = 0 + (((tickAnim - 151) / 14) * (0-(0)));
        }
        else if (tickAnim >= 165 && tickAnim < 180) {
            xx = 0 + (((tickAnim - 165) / 15) * (0-(0)));
            yy = 1.045 + (((tickAnim - 165) / 15) * (0-(1.045)));
            zz = 0 + (((tickAnim - 165) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftArm2.rotationPointX = this.leftArm2.rotationPointX + (float)(xx);
        this.leftArm2.rotationPointY = this.leftArm2.rotationPointY - (float)(yy);
        this.leftArm2.rotationPointZ = this.leftArm2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (53.13-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 40) {
            xx = 53.13 + (((tickAnim - 20) / 20) * (0.75-(53.13)));
            yy = 0 + (((tickAnim - 20) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 20) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 151) {
            xx = 0.75 + (((tickAnim - 40) / 111) * (0.75-(0.75)));
            yy = 0 + (((tickAnim - 40) / 111) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 111) * (0-(0)));
        }
        else if (tickAnim >= 151 && tickAnim < 165) {
            xx = 0.75 + (((tickAnim - 151) / 14) * (40.31-(0.75)));
            yy = 0 + (((tickAnim - 151) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 151) / 14) * (0-(0)));
        }
        else if (tickAnim >= 165 && tickAnim < 180) {
            xx = 40.31 + (((tickAnim - 165) / 15) * (0-(40.31)));
            yy = 0 + (((tickAnim - 165) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 165) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm3, leftArm3.rotateAngleX + (float) Math.toRadians(xx), leftArm3.rotateAngleY + (float) Math.toRadians(yy), leftArm3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0.93-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (-0.975-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 20) / 20) * (0-(0)));
            yy = 0.93 + (((tickAnim - 20) / 20) * (-0.15-(0.93)));
            zz = -0.975 + (((tickAnim - 20) / 20) * (0-(-0.975)));
        }
        else if (tickAnim >= 40 && tickAnim < 151) {
            xx = 0 + (((tickAnim - 40) / 111) * (0-(0)));
            yy = -0.15 + (((tickAnim - 40) / 111) * (-0.15-(-0.15)));
            zz = 0 + (((tickAnim - 40) / 111) * (0-(0)));
        }
        else if (tickAnim >= 151 && tickAnim < 165) {
            xx = 0 + (((tickAnim - 151) / 14) * (0-(0)));
            yy = -0.15 + (((tickAnim - 151) / 14) * (0.775-(-0.15)));
            zz = 0 + (((tickAnim - 151) / 14) * (-0.425-(0)));
        }
        else if (tickAnim >= 165 && tickAnim < 180) {
            xx = 0 + (((tickAnim - 165) / 15) * (0-(0)));
            yy = 0.775 + (((tickAnim - 165) / 15) * (0-(0.775)));
            zz = -0.425 + (((tickAnim - 165) / 15) * (0-(-0.425)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftArm3.rotationPointX = this.leftArm3.rotationPointX + (float)(xx);
        this.leftArm3.rotationPointY = this.leftArm3.rotationPointY - (float)(yy);
        this.leftArm3.rotationPointZ = this.leftArm3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (8.75-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 45) {
            xx = 8.75 + (((tickAnim - 40) / 5) * (-0.725+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*10-(8.75)));
            yy = 0 + (((tickAnim - 40) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 5) * (0-(0)));
        }
        else if (tickAnim >= 45 && tickAnim < 81) {
            xx = -0.725+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*10 + (((tickAnim - 45) / 36) * (9.825+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+80))*10-(-0.725+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*10)));
            yy = 0 + (((tickAnim - 45) / 36) * (0-(0)));
            zz = 0 + (((tickAnim - 45) / 36) * (0-(0)));
        }
        else if (tickAnim >= 81 && tickAnim < 110) {
            xx = 9.825+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+80))*10 + (((tickAnim - 81) / 29) * (8.75-(9.825+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+80))*10)));
            yy = 0 + (((tickAnim - 81) / 29) * (0-(0)));
            zz = 0 + (((tickAnim - 81) / 29) * (0-(0)));
        }
        else if (tickAnim >= 110 && tickAnim < 115) {
            xx = 8.75 + (((tickAnim - 110) / 5) * (-1.525+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-10-(8.75)));
            yy = 0 + (((tickAnim - 110) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 110) / 5) * (0-(0)));
        }
        else if (tickAnim >= 115 && tickAnim < 180) {
            xx = -1.525+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-10 + (((tickAnim - 115) / 65) * (0-(-1.525+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-10)));
            yy = 0 + (((tickAnim - 115) / 65) * (0-(0)));
            zz = 0 + (((tickAnim - 115) / 65) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(xx), neck.rotateAngleY + (float) Math.toRadians(yy), neck.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (5.5-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 45) {
            xx = 5.5 + (((tickAnim - 40) / 5) * (4.75-(5.5)));
            yy = 0 + (((tickAnim - 40) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 5) * (0-(0)));
        }
        else if (tickAnim >= 45 && tickAnim < 81) {
            xx = 4.75 + (((tickAnim - 45) / 36) * (0-(4.75)));
            yy = 0 + (((tickAnim - 45) / 36) * (0-(0)));
            zz = 0 + (((tickAnim - 45) / 36) * (0-(0)));
        }
        else if (tickAnim >= 81 && tickAnim < 110) {
            xx = 0 + (((tickAnim - 81) / 29) * (5.5-(0)));
            yy = 0 + (((tickAnim - 81) / 29) * (0-(0)));
            zz = 0 + (((tickAnim - 81) / 29) * (0-(0)));
        }
        else if (tickAnim >= 110 && tickAnim < 115) {
            xx = 5.5 + (((tickAnim - 110) / 5) * (4.75-(5.5)));
            yy = 0 + (((tickAnim - 110) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 110) / 5) * (0-(0)));
        }
        else if (tickAnim >= 115 && tickAnim < 180) {
            xx = 4.75 + (((tickAnim - 115) / 65) * (0-(4.75)));
            yy = 0 + (((tickAnim - 115) / 65) * (0-(0)));
            zz = 0 + (((tickAnim - 115) / 65) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(xx), neck2.rotateAngleY + (float) Math.toRadians(yy), neck2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (-2-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 45) {
            xx = -2 + (((tickAnim - 40) / 5) * (-0.5-(-2)));
            yy = 0 + (((tickAnim - 40) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 5) * (0-(0)));
        }
        else if (tickAnim >= 45 && tickAnim < 81) {
            xx = -0.5 + (((tickAnim - 45) / 36) * (0-(-0.5)));
            yy = 0 + (((tickAnim - 45) / 36) * (0-(0)));
            zz = 0 + (((tickAnim - 45) / 36) * (0-(0)));
        }
        else if (tickAnim >= 81 && tickAnim < 110) {
            xx = 0 + (((tickAnim - 81) / 29) * (-2-(0)));
            yy = 0 + (((tickAnim - 81) / 29) * (0-(0)));
            zz = 0 + (((tickAnim - 81) / 29) * (0-(0)));
        }
        else if (tickAnim >= 110 && tickAnim < 115) {
            xx = -2 + (((tickAnim - 110) / 5) * (-0.5-(-2)));
            yy = 0 + (((tickAnim - 110) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 110) / 5) * (0-(0)));
        }
        else if (tickAnim >= 115 && tickAnim < 180) {
            xx = -0.5 + (((tickAnim - 115) / 65) * (0-(-0.5)));
            yy = 0 + (((tickAnim - 115) / 65) * (0-(0)));
            zz = 0 + (((tickAnim - 115) / 65) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(xx), neck3.rotateAngleY + (float) Math.toRadians(yy), neck3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 45) {
            xx = 0 + (((tickAnim - 40) / 5) * (1.75-(0)));
            yy = 0 + (((tickAnim - 40) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 5) * (0-(0)));
        }
        else if (tickAnim >= 45 && tickAnim < 81) {
            xx = 1.75 + (((tickAnim - 45) / 36) * (0-(1.75)));
            yy = 0 + (((tickAnim - 45) / 36) * (0-(0)));
            zz = 0 + (((tickAnim - 45) / 36) * (0-(0)));
        }
        else if (tickAnim >= 81 && tickAnim < 110) {
            xx = 0 + (((tickAnim - 81) / 29) * (0-(0)));
            yy = 0 + (((tickAnim - 81) / 29) * (0-(0)));
            zz = 0 + (((tickAnim - 81) / 29) * (0-(0)));
        }
        else if (tickAnim >= 110 && tickAnim < 115) {
            xx = 0 + (((tickAnim - 110) / 5) * (1.75-(0)));
            yy = 0 + (((tickAnim - 110) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 110) / 5) * (0-(0)));
        }
        else if (tickAnim >= 115 && tickAnim < 151) {
            xx = 1.75 + (((tickAnim - 115) / 36) * (0-(1.75)));
            yy = 0 + (((tickAnim - 115) / 36) * (0-(0)));
            zz = 0 + (((tickAnim - 115) / 36) * (0-(0)));
        }
        else if (tickAnim >= 151 && tickAnim < 180) {
            xx = 0 + (((tickAnim - 151) / 29) * (0-(0)));
            yy = 0 + (((tickAnim - 151) / 29) * (0-(0)));
            zz = 0 + (((tickAnim - 151) / 29) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck4, neck4.rotateAngleX + (float) Math.toRadians(xx), neck4.rotateAngleY + (float) Math.toRadians(yy), neck4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 81) {
            xx = 0 + (((tickAnim - 0) / 81) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 81) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 81) * (0-(0)));
        }
        else if (tickAnim >= 81 && tickAnim < 180) {
            xx = 0 + (((tickAnim - 81) / 99) * (0-(0)));
            yy = 0 + (((tickAnim - 81) / 99) * (0-(0)));
            zz = 0 + (((tickAnim - 81) / 99) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck5, neck5.rotateAngleX + (float) Math.toRadians(xx), neck5.rotateAngleY + (float) Math.toRadians(yy), neck5.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (-15.75-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 45) {
            xx = -15.75 + (((tickAnim - 40) / 5) * (-15.62-(-15.75)));
            yy = 0 + (((tickAnim - 40) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 5) * (0-(0)));
        }
        else if (tickAnim >= 45 && tickAnim < 55) {
            xx = -15.62 + (((tickAnim - 45) / 10) * (12.275+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-30-(-15.62)));
            yy = 0 + (((tickAnim - 45) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 45) / 10) * (0-(0)));
        }
        else if (tickAnim >= 55 && tickAnim < 81) {
            xx = 12.275+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-30 + (((tickAnim - 55) / 26) * (5.95-(12.275+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-30)));
            yy = 0 + (((tickAnim - 55) / 26) * (0-(0)));
            zz = 0 + (((tickAnim - 55) / 26) * (0-(0)));
        }
        else if (tickAnim >= 81 && tickAnim < 110) {
            xx = 5.95 + (((tickAnim - 81) / 29) * (-15.75-(5.95)));
            yy = 0 + (((tickAnim - 81) / 29) * (0-(0)));
            zz = 0 + (((tickAnim - 81) / 29) * (0-(0)));
        }
        else if (tickAnim >= 110 && tickAnim < 115) {
            xx = -15.75 + (((tickAnim - 110) / 5) * (-15.62-(-15.75)));
            yy = 0 + (((tickAnim - 110) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 110) / 5) * (0-(0)));
        }
        else if (tickAnim >= 115 && tickAnim < 125) {
            xx = -15.62 + (((tickAnim - 115) / 10) * (-1.725+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*15-(-15.62)));
            yy = 0 + (((tickAnim - 115) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 115) / 10) * (0-(0)));
        }
        else if (tickAnim >= 125 && tickAnim < 180) {
            xx = -1.725+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*15 + (((tickAnim - 125) / 55) * (0-(-1.725+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*15)));
            yy = 0 + (((tickAnim - 125) / 55) * (0-(0)));
            zz = 0 + (((tickAnim - 125) / 55) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck6, neck6.rotateAngleX + (float) Math.toRadians(xx), neck6.rotateAngleY + (float) Math.toRadians(yy), neck6.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (-20.25-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 45) {
            xx = -20.25 + (((tickAnim - 40) / 5) * (-14.69-(-20.25)));
            yy = 0 + (((tickAnim - 40) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 5) * (0-(0)));
        }
        else if (tickAnim >= 45 && tickAnim < 55) {
            xx = -14.69 + (((tickAnim - 45) / 10) * (0-(-14.69)));
            yy = 0 + (((tickAnim - 45) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 45) / 10) * (0-(0)));
        }
        else if (tickAnim >= 55 && tickAnim < 81) {
            xx = 0 + (((tickAnim - 55) / 26) * (0-(0)));
            yy = 0 + (((tickAnim - 55) / 26) * (0-(0)));
            zz = 0 + (((tickAnim - 55) / 26) * (0-(0)));
        }
        else if (tickAnim >= 81 && tickAnim < 110) {
            xx = 0 + (((tickAnim - 81) / 29) * (-20.25-(0)));
            yy = 0 + (((tickAnim - 81) / 29) * (0-(0)));
            zz = 0 + (((tickAnim - 81) / 29) * (0-(0)));
        }
        else if (tickAnim >= 110 && tickAnim < 115) {
            xx = -20.25 + (((tickAnim - 110) / 5) * (-14.69-(-20.25)));
            yy = 0 + (((tickAnim - 110) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 110) / 5) * (0-(0)));
        }
        else if (tickAnim >= 115 && tickAnim < 151) {
            xx = -14.69 + (((tickAnim - 115) / 36) * (0-(-14.69)));
            yy = 0 + (((tickAnim - 115) / 36) * (0-(0)));
            zz = 0 + (((tickAnim - 115) / 36) * (0-(0)));
        }
        else if (tickAnim >= 151 && tickAnim < 180) {
            xx = 0 + (((tickAnim - 151) / 29) * (0-(0)));
            yy = 0 + (((tickAnim - 151) / 29) * (0-(0)));
            zz = 0 + (((tickAnim - 151) / 29) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 0) / 25) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 25) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 25) / 15) * (19.25-(0)));
            yy = 0 + (((tickAnim - 25) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 15) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 45) {
            xx = 19.25 + (((tickAnim - 40) / 5) * (0-(19.25)));
            yy = 0 + (((tickAnim - 40) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 5) * (0-(0)));
        }
        else if (tickAnim >= 45 && tickAnim < 95) {
            xx = 0 + (((tickAnim - 45) / 50) * (0-(0)));
            yy = 0 + (((tickAnim - 45) / 50) * (0-(0)));
            zz = 0 + (((tickAnim - 45) / 50) * (0-(0)));
        }
        else if (tickAnim >= 95 && tickAnim < 110) {
            xx = 0 + (((tickAnim - 95) / 15) * (19.25-(0)));
            yy = 0 + (((tickAnim - 95) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 95) / 15) * (0-(0)));
        }
        else if (tickAnim >= 110 && tickAnim < 115) {
            xx = 19.25 + (((tickAnim - 110) / 5) * (0-(19.25)));
            yy = 0 + (((tickAnim - 110) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 110) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(xx), jaw.rotateAngleY + (float) Math.toRadians(yy), jaw.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (5.25-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 151) {
            xx = 5.25 + (((tickAnim - 40) / 111) * (5.25-(5.25)));
            yy = 0 + (((tickAnim - 40) / 111) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 111) * (0-(0)));
        }
        else if (tickAnim >= 151 && tickAnim < 180) {
            xx = 5.25 + (((tickAnim - 151) / 29) * (0-(5.25)));
            yy = 0 + (((tickAnim - 151) / 29) * (0-(0)));
            zz = 0 + (((tickAnim - 151) / 29) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm, rightArm.rotateAngleX + (float) Math.toRadians(xx), rightArm.rotateAngleY + (float) Math.toRadians(yy), rightArm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (14-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 151) {
            xx = 14 + (((tickAnim - 40) / 111) * (14-(14)));
            yy = 0 + (((tickAnim - 40) / 111) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 111) * (0-(0)));
        }
        else if (tickAnim >= 151 && tickAnim < 180) {
            xx = 14 + (((tickAnim - 151) / 29) * (0-(14)));
            yy = 0 + (((tickAnim - 151) / 29) * (0-(0)));
            zz = 0 + (((tickAnim - 151) / 29) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm2, rightArm2.rotateAngleX + (float) Math.toRadians(xx), rightArm2.rotateAngleY + (float) Math.toRadians(yy), rightArm2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (-1.15-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 151) {
            xx = 0 + (((tickAnim - 40) / 111) * (0-(0)));
            yy = -1.15 + (((tickAnim - 40) / 111) * (-1.15-(-1.15)));
            zz = 0 + (((tickAnim - 40) / 111) * (0-(0)));
        }
        else if (tickAnim >= 151 && tickAnim < 180) {
            xx = 0 + (((tickAnim - 151) / 29) * (0-(0)));
            yy = -1.15 + (((tickAnim - 151) / 29) * (0-(-1.15)));
            zz = 0 + (((tickAnim - 151) / 29) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightArm2.rotationPointX = this.rightArm2.rotationPointX + (float)(xx);
        this.rightArm2.rotationPointY = this.rightArm2.rotationPointY - (float)(yy);
        this.rightArm2.rotationPointZ = this.rightArm2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (-18-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 151) {
            xx = -18 + (((tickAnim - 40) / 111) * (-18-(-18)));
            yy = 0 + (((tickAnim - 40) / 111) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 111) * (0-(0)));
        }
        else if (tickAnim >= 151 && tickAnim < 180) {
            xx = -18 + (((tickAnim - 151) / 29) * (0-(-18)));
            yy = 0 + (((tickAnim - 151) / 29) * (0-(0)));
            zz = 0 + (((tickAnim - 151) / 29) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm3, rightArm3.rotateAngleX + (float) Math.toRadians(xx), rightArm3.rotateAngleY + (float) Math.toRadians(yy), rightArm3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (-0.125-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 151) {
            xx = 0 + (((tickAnim - 40) / 111) * (0-(0)));
            yy = -0.125 + (((tickAnim - 40) / 111) * (-0.125-(-0.125)));
            zz = 0 + (((tickAnim - 40) / 111) * (0-(0)));
        }
        else if (tickAnim >= 151 && tickAnim < 180) {
            xx = 0 + (((tickAnim - 151) / 29) * (0-(0)));
            yy = -0.125 + (((tickAnim - 151) / 29) * (0-(-0.125)));
            zz = 0 + (((tickAnim - 151) / 29) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightArm3.rotationPointX = this.rightArm3.rotationPointX + (float)(xx);
        this.rightArm3.rotationPointY = this.rightArm3.rotationPointY - (float)(yy);
        this.rightArm3.rotationPointZ = this.rightArm3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (6.75-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 151) {
            xx = 6.75 + (((tickAnim - 40) / 111) * (6.75-(6.75)));
            yy = 0 + (((tickAnim - 40) / 111) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 111) * (0-(0)));
        }
        else if (tickAnim >= 151 && tickAnim < 180) {
            xx = 6.75 + (((tickAnim - 151) / 29) * (0-(6.75)));
            yy = 0 + (((tickAnim - 151) / 29) * (0-(0)));
            zz = 0 + (((tickAnim - 151) / 29) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg, rightLeg.rotateAngleX + (float) Math.toRadians(xx), rightLeg.rotateAngleY + (float) Math.toRadians(yy), rightLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (-1.5-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 151) {
            xx = -1.5 + (((tickAnim - 40) / 111) * (-1.5-(-1.5)));
            yy = 0 + (((tickAnim - 40) / 111) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 111) * (0-(0)));
        }
        else if (tickAnim >= 151 && tickAnim < 180) {
            xx = -1.5 + (((tickAnim - 151) / 29) * (0-(-1.5)));
            yy = 0 + (((tickAnim - 151) / 29) * (0-(0)));
            zz = 0 + (((tickAnim - 151) / 29) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg2, rightLeg2.rotateAngleX + (float) Math.toRadians(xx), rightLeg2.rotateAngleY + (float) Math.toRadians(yy), rightLeg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (-0.5-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 151) {
            xx = 0 + (((tickAnim - 40) / 111) * (0-(0)));
            yy = -0.5 + (((tickAnim - 40) / 111) * (-0.5-(-0.5)));
            zz = 0 + (((tickAnim - 40) / 111) * (0-(0)));
        }
        else if (tickAnim >= 151 && tickAnim < 180) {
            xx = 0 + (((tickAnim - 151) / 29) * (0-(0)));
            yy = -0.5 + (((tickAnim - 151) / 29) * (0-(-0.5)));
            zz = 0 + (((tickAnim - 151) / 29) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightLeg2.rotationPointX = this.rightLeg2.rotationPointX + (float)(xx);
        this.rightLeg2.rotationPointY = this.rightLeg2.rotationPointY - (float)(yy);
        this.rightLeg2.rotationPointZ = this.rightLeg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (-2.75-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 151) {
            xx = -2.75 + (((tickAnim - 40) / 111) * (-2.75-(-2.75)));
            yy = 0 + (((tickAnim - 40) / 111) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 111) * (0-(0)));
        }
        else if (tickAnim >= 151 && tickAnim < 180) {
            xx = -2.75 + (((tickAnim - 151) / 29) * (0-(-2.75)));
            yy = 0 + (((tickAnim - 151) / 29) * (0-(0)));
            zz = 0 + (((tickAnim - 151) / 29) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg3, rightLeg3.rotateAngleX + (float) Math.toRadians(xx), rightLeg3.rotateAngleY + (float) Math.toRadians(yy), rightLeg3.rotateAngleZ + (float) Math.toRadians(zz));

    }
    public void animEat(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraPhuwiangosaurus entity = (EntityPrehistoricFloraPhuwiangosaurus) entitylivingbaseIn;
        int animCycle = 30;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        if (tickAnim >= 0 && tickAnim < 16) {
            xx = 0 + (((tickAnim - 0) / 16) * (7.25-(0)));
            yy = 0 + (((tickAnim - 0) / 16) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 16) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 30) {
            xx = 7.25 + (((tickAnim - 16) / 14) * (0-(7.25)));
            yy = 0 + (((tickAnim - 16) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 16) / 14) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(xx), body.rotateAngleY + (float) Math.toRadians(yy), body.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 16) {
            xx = 0 + (((tickAnim - 0) / 16) * (13.4199-(0)));
            yy = 0 + (((tickAnim - 0) / 16) * (-1.4775-(0)));
            zz = 0 + (((tickAnim - 0) / 16) * (-0.0391-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 30) {
            xx = 13.4199 + (((tickAnim - 16) / 14) * (0-(13.4199)));
            yy = -1.4775 + (((tickAnim - 16) / 14) * (0-(-1.4775)));
            zz = -0.0391 + (((tickAnim - 16) / 14) * (0-(-0.0391)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body2, body2.rotateAngleX + (float) Math.toRadians(xx), body2.rotateAngleY + (float) Math.toRadians(yy), body2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 16) {
            xx = 0 + (((tickAnim - 0) / 16) * (-42.425-(0)));
            yy = 0 + (((tickAnim - 0) / 16) * (0.7062-(0)));
            zz = 0 + (((tickAnim - 0) / 16) * (-13.3369-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 30) {
            xx = -42.425 + (((tickAnim - 16) / 14) * (0-(-42.425)));
            yy = 0.7062 + (((tickAnim - 16) / 14) * (0-(0.7062)));
            zz = -13.3369 + (((tickAnim - 16) / 14) * (0-(-13.3369)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm, leftArm.rotateAngleX + (float) Math.toRadians(xx), leftArm.rotateAngleY + (float) Math.toRadians(yy), leftArm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 16) {
            xx = 0 + (((tickAnim - 0) / 16) * (-20.75-(0)));
            yy = 0 + (((tickAnim - 0) / 16) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 16) * (10.75-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 30) {
            xx = -20.75 + (((tickAnim - 16) / 14) * (0-(-20.75)));
            yy = 0 + (((tickAnim - 16) / 14) * (0-(0)));
            zz = 10.75 + (((tickAnim - 16) / 14) * (0-(10.75)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm2, leftArm2.rotateAngleX + (float) Math.toRadians(xx), leftArm2.rotateAngleY + (float) Math.toRadians(yy), leftArm2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 16) {
            xx = 0 + (((tickAnim - 0) / 16) * (42.25-(0)));
            yy = 0 + (((tickAnim - 0) / 16) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 16) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 30) {
            xx = 42.25 + (((tickAnim - 16) / 14) * (0-(42.25)));
            yy = 0 + (((tickAnim - 16) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 16) / 14) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm3, leftArm3.rotateAngleX + (float) Math.toRadians(xx), leftArm3.rotateAngleY + (float) Math.toRadians(yy), leftArm3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 16) {
            xx = -0-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-50 + (((tickAnim - 0) / 16) * (-23.05-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-100))*50-(-0-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-50)));
            yy = 0 + (((tickAnim - 0) / 16) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 16) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 30) {
            xx = -23.05-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-100))*50 + (((tickAnim - 16) / 14) * (0-(-23.05-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-100))*50)));
            yy = 0 + (((tickAnim - 16) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 16) / 14) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(xx), neck.rotateAngleY + (float) Math.toRadians(yy), neck.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 16) {
            xx = 0 + (((tickAnim - 0) / 16) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 16) * (0.525-(0)));
            zz = 0 + (((tickAnim - 0) / 16) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 16) / 14) * (0-(0)));
            yy = 0.525 + (((tickAnim - 16) / 14) * (0-(0.525)));
            zz = 0 + (((tickAnim - 16) / 14) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.neck.rotationPointX = this.neck.rotationPointX + (float)(xx);
        this.neck.rotationPointY = this.neck.rotationPointY - (float)(yy);
        this.neck.rotationPointZ = this.neck.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 16) {
            xx = 38.3-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-50))*-50 + (((tickAnim - 0) / 16) * (9.425-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-50))*50-(38.3-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-50))*-50)));
            yy = 0 + (((tickAnim - 0) / 16) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 16) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 30) {
            xx = 9.425-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-50))*50 + (((tickAnim - 16) / 14) * (0-(9.425-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-50))*50)));
            yy = 0 + (((tickAnim - 16) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 16) / 14) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(xx), neck2.rotateAngleY + (float) Math.toRadians(yy), neck2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 16) {
            xx = 49.225-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-100))*-50 + (((tickAnim - 0) / 16) * (-25.65-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-100))*50-(49.225-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-100))*-50)));
            yy = 0 + (((tickAnim - 0) / 16) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 16) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 30) {
            xx = -25.65-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-100))*50 + (((tickAnim - 16) / 14) * (0-(-25.65-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-100))*50)));
            yy = 0 + (((tickAnim - 16) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 16) / 14) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(xx), neck3.rotateAngleY + (float) Math.toRadians(yy), neck3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 16) {
            xx = 0.25-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-150))*-50 + (((tickAnim - 0) / 16) * (-45.8471-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-150))*80-(0.25-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-150))*-50)));
            yy = 0 + (((tickAnim - 0) / 16) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 16) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 30) {
            xx = -45.8471-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-150))*80 + (((tickAnim - 16) / 14) * (0-(-45.8471-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-150))*80)));
            yy = 0 + (((tickAnim - 16) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 16) / 14) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck4, neck4.rotateAngleX + (float) Math.toRadians(xx), neck4.rotateAngleY + (float) Math.toRadians(yy), neck4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 30) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck5, neck5.rotateAngleX + (float) Math.toRadians(xx), neck5.rotateAngleY + (float) Math.toRadians(yy), neck5.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 16) {
            xx = 0 + (((tickAnim - 0) / 16) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 16) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 16) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 16) / 14) * (0-(0)));
            yy = 0 + (((tickAnim - 16) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 16) / 14) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck6, neck6.rotateAngleX + (float) Math.toRadians(xx), neck6.rotateAngleY + (float) Math.toRadians(yy), neck6.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 16) {
            xx = 0 + (((tickAnim - 0) / 16) * (-17.5-(0)));
            yy = 0 + (((tickAnim - 0) / 16) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 16) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 30) {
            xx = -17.5 + (((tickAnim - 16) / 14) * (0-(-17.5)));
            yy = 0 + (((tickAnim - 16) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 16) / 14) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (33.5-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 16) {
            xx = 33.5 + (((tickAnim - 10) / 6) * (0-(33.5)));
            yy = 0 + (((tickAnim - 10) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 6) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 16) / 14) * (0-(0)));
            yy = 0 + (((tickAnim - 16) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 16) / 14) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(xx), jaw.rotateAngleY + (float) Math.toRadians(yy), jaw.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 16) {
            xx = 0 + (((tickAnim - 0) / 16) * (-42.425-(0)));
            yy = 0 + (((tickAnim - 0) / 16) * (-0.7062-(0)));
            zz = 0 + (((tickAnim - 0) / 16) * (13.3369-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 30) {
            xx = -42.425 + (((tickAnim - 16) / 14) * (0-(-42.425)));
            yy = -0.7062 + (((tickAnim - 16) / 14) * (0-(-0.7062)));
            zz = 13.3369 + (((tickAnim - 16) / 14) * (0-(13.3369)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm, rightArm.rotateAngleX + (float) Math.toRadians(xx), rightArm.rotateAngleY + (float) Math.toRadians(yy), rightArm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 16) {
            xx = 0 + (((tickAnim - 0) / 16) * (-20.75-(0)));
            yy = 0 + (((tickAnim - 0) / 16) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 16) * (-10.75-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 30) {
            xx = -20.75 + (((tickAnim - 16) / 14) * (0-(-20.75)));
            yy = 0 + (((tickAnim - 16) / 14) * (0-(0)));
            zz = -10.75 + (((tickAnim - 16) / 14) * (0-(-10.75)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm2, rightArm2.rotateAngleX + (float) Math.toRadians(xx), rightArm2.rotateAngleY + (float) Math.toRadians(yy), rightArm2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 16) {
            xx = 0 + (((tickAnim - 0) / 16) * (42.25-(0)));
            yy = 0 + (((tickAnim - 0) / 16) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 16) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 30) {
            xx = 42.25 + (((tickAnim - 16) / 14) * (0-(42.25)));
            yy = 0 + (((tickAnim - 16) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 16) / 14) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm3, rightArm3.rotateAngleX + (float) Math.toRadians(xx), rightArm3.rotateAngleY + (float) Math.toRadians(yy), rightArm3.rotateAngleZ + (float) Math.toRadians(zz));
    }
    public void animNest(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraPhuwiangosaurus entity = (EntityPrehistoricFloraPhuwiangosaurus) entitylivingbaseIn;
        int animCycle = 50;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (17-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 35) {
            xx = 17 + (((tickAnim - 20) / 15) * (-7.5-(17)));
            yy = 0 + (((tickAnim - 20) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 15) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = -7.5 + (((tickAnim - 35) / 15) * (0-(-7.5)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg, leftLeg.rotateAngleX + (float) Math.toRadians(xx), leftLeg.rotateAngleY + (float) Math.toRadians(yy), leftLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (15-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 28) {
            xx = 15 + (((tickAnim - 20) / 8) * (0-(15)));
            yy = 0 + (((tickAnim - 20) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 8) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 28) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 28) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 7) * (0-(0)));
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
        this.setRotateAngle(leftLeg2, leftLeg2.rotateAngleX + (float) Math.toRadians(xx), leftLeg2.rotateAngleY + (float) Math.toRadians(yy), leftLeg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 20) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 20) / 8) * (2.375-(0)));
            zz = 0 + (((tickAnim - 20) / 8) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 28) / 7) * (0-(0)));
            yy = 2.375 + (((tickAnim - 28) / 7) * (0-(2.375)));
            zz = 0 + (((tickAnim - 28) / 7) * (0-(0)));
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




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (31-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 35) {
            xx = 31 + (((tickAnim - 20) / 15) * (10-(31)));
            yy = 0 + (((tickAnim - 20) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 15) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 10 + (((tickAnim - 35) / 15) * (0-(10)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg3, leftLeg3.rotateAngleX + (float) Math.toRadians(xx), leftLeg3.rotateAngleY + (float) Math.toRadians(yy), leftLeg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0.6-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (-0.4-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 20) / 8) * (0-(0)));
            yy = 0.6 + (((tickAnim - 20) / 8) * (1.585-(0.6)));
            zz = -0.4 + (((tickAnim - 20) / 8) * (-0.2-(-0.4)));
        }
        else if (tickAnim >= 28 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 28) / 7) * (0-(0)));
            yy = 1.585 + (((tickAnim - 28) / 7) * (-0.575-(1.585)));
            zz = -0.2 + (((tickAnim - 28) / 7) * (0-(-0.2)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            yy = -0.575 + (((tickAnim - 35) / 15) * (0-(-0.575)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftLeg3.rotationPointX = this.leftLeg3.rotationPointX + (float)(xx);
        this.leftLeg3.rotationPointY = this.leftLeg3.rotationPointY - (float)(yy);
        this.leftLeg3.rotationPointZ = this.leftLeg3.rotationPointZ + (float)(zz);

    }
    public void animLay(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraPhuwiangosaurus entity = (EntityPrehistoricFloraPhuwiangosaurus) entitylivingbaseIn;
        int animCycle = 50;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        if (tickAnim >= 0 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 0) / 19) * (-15.25-(0)));
            yy = 0 + (((tickAnim - 0) / 19) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 19) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 31) {
            xx = -15.25 + (((tickAnim - 19) / 12) * (-15.25-(-15.25)));
            yy = 0 + (((tickAnim - 19) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 19) / 12) * (0-(0)));
        }
        else if (tickAnim >= 31 && tickAnim < 50) {
            xx = -15.25 + (((tickAnim - 31) / 19) * (0-(-15.25)));
            yy = 0 + (((tickAnim - 31) / 19) * (0-(0)));
            zz = 0 + (((tickAnim - 31) / 19) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(main, main.rotateAngleX + (float) Math.toRadians(xx), main.rotateAngleY + (float) Math.toRadians(yy), main.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 0) / 19) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 19) * (-11.9-(0)));
            zz = 0 + (((tickAnim - 0) / 19) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 31) {
            xx = 0 + (((tickAnim - 19) / 12) * (0-(0)));
            yy = -11.9 + (((tickAnim - 19) / 12) * (-11.9-(-11.9)));
            zz = 0 + (((tickAnim - 19) / 12) * (0-(0)));
        }
        else if (tickAnim >= 31 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 31) / 19) * (0-(0)));
            yy = -11.9 + (((tickAnim - 31) / 19) * (0-(-11.9)));
            zz = 0 + (((tickAnim - 31) / 19) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.main.rotationPointX = this.main.rotationPointX + (float)(xx);
        this.main.rotationPointY = this.main.rotationPointY - (float)(yy);
        this.main.rotationPointZ = this.main.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 0) / 19) * (-4.8429-(0)));
            yy = 0 + (((tickAnim - 0) / 19) * (-5.9304-(0)));
            zz = 0 + (((tickAnim - 0) / 19) * (-8.1421-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 31) {
            xx = -4.8429 + (((tickAnim - 19) / 12) * (-4.8429-(-4.8429)));
            yy = -5.9304 + (((tickAnim - 19) / 12) * (-5.9304-(-5.9304)));
            zz = -8.1421 + (((tickAnim - 19) / 12) * (-8.1421-(-8.1421)));
        }
        else if (tickAnim >= 31 && tickAnim < 50) {
            xx = -4.8429 + (((tickAnim - 31) / 19) * (0-(-4.8429)));
            yy = -5.9304 + (((tickAnim - 31) / 19) * (0-(-5.9304)));
            zz = -8.1421 + (((tickAnim - 31) / 19) * (0-(-8.1421)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg, leftLeg.rotateAngleX + (float) Math.toRadians(xx), leftLeg.rotateAngleY + (float) Math.toRadians(yy), leftLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 0) / 19) * (48.4783-(0)));
            yy = 0 + (((tickAnim - 0) / 19) * (-6.1206-(0)));
            zz = 0 + (((tickAnim - 0) / 19) * (-3.8845-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 31) {
            xx = 48.4783 + (((tickAnim - 19) / 12) * (48.4783-(48.4783)));
            yy = -6.1206 + (((tickAnim - 19) / 12) * (-6.1206-(-6.1206)));
            zz = -3.8845 + (((tickAnim - 19) / 12) * (-3.8845-(-3.8845)));
        }
        else if (tickAnim >= 31 && tickAnim < 50) {
            xx = 48.4783 + (((tickAnim - 31) / 19) * (0-(48.4783)));
            yy = -6.1206 + (((tickAnim - 31) / 19) * (0-(-6.1206)));
            zz = -3.8845 + (((tickAnim - 31) / 19) * (0-(-3.8845)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg2, leftLeg2.rotateAngleX + (float) Math.toRadians(xx), leftLeg2.rotateAngleY + (float) Math.toRadians(yy), leftLeg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 0) / 19) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 19) * (2.1-(0)));
            zz = 0 + (((tickAnim - 0) / 19) * (-2.025-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 31) {
            xx = 0 + (((tickAnim - 19) / 12) * (0-(0)));
            yy = 2.1 + (((tickAnim - 19) / 12) * (2.1-(2.1)));
            zz = -2.025 + (((tickAnim - 19) / 12) * (-2.025-(-2.025)));
        }
        else if (tickAnim >= 31 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 31) / 19) * (0-(0)));
            yy = 2.1 + (((tickAnim - 31) / 19) * (0-(2.1)));
            zz = -2.025 + (((tickAnim - 31) / 19) * (0-(-2.025)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftLeg2.rotationPointX = this.leftLeg2.rotationPointX + (float)(xx);
        this.leftLeg2.rotationPointY = this.leftLeg2.rotationPointY - (float)(yy);
        this.leftLeg2.rotationPointZ = this.leftLeg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 0) / 19) * (-26.175-(0)));
            yy = 0 + (((tickAnim - 0) / 19) * (7.7584-(0)));
            zz = 0 + (((tickAnim - 0) / 19) * (4.7235-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 31) {
            xx = -26.175 + (((tickAnim - 19) / 12) * (-26.175-(-26.175)));
            yy = 7.7584 + (((tickAnim - 19) / 12) * (7.7584-(7.7584)));
            zz = 4.7235 + (((tickAnim - 19) / 12) * (4.7235-(4.7235)));
        }
        else if (tickAnim >= 31 && tickAnim < 50) {
            xx = -26.175 + (((tickAnim - 31) / 19) * (0-(-26.175)));
            yy = 7.7584 + (((tickAnim - 31) / 19) * (0-(7.7584)));
            zz = 4.7235 + (((tickAnim - 31) / 19) * (0-(4.7235)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg3, leftLeg3.rotateAngleX + (float) Math.toRadians(xx), leftLeg3.rotateAngleY + (float) Math.toRadians(yy), leftLeg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 0) / 19) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 19) * (0.85-(0)));
            zz = 0 + (((tickAnim - 0) / 19) * (0.3-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 31) {
            xx = 0 + (((tickAnim - 19) / 12) * (0-(0)));
            yy = 0.85 + (((tickAnim - 19) / 12) * (0.85-(0.85)));
            zz = 0.3 + (((tickAnim - 19) / 12) * (0.3-(0.3)));
        }
        else if (tickAnim >= 31 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 31) / 19) * (0-(0)));
            yy = 0.85 + (((tickAnim - 31) / 19) * (0-(0.85)));
            zz = 0.3 + (((tickAnim - 31) / 19) * (0-(0.3)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftLeg3.rotationPointX = this.leftLeg3.rotationPointX + (float)(xx);
        this.leftLeg3.rotationPointY = this.leftLeg3.rotationPointY - (float)(yy);
        this.leftLeg3.rotationPointZ = this.leftLeg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (-3.25-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 19) {
            xx = -3.25 + (((tickAnim - 8) / 11) * (3.75-(-3.25)));
            yy = 0 + (((tickAnim - 8) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 11) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 31) {
            xx = 3.75 + (((tickAnim - 19) / 12) * (3.75-(3.75)));
            yy = 0 + (((tickAnim - 19) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 19) / 12) * (0-(0)));
        }
        else if (tickAnim >= 31 && tickAnim < 40) {
            xx = 3.75 + (((tickAnim - 31) / 9) * (0-(3.75)));
            yy = 0 + (((tickAnim - 31) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 31) / 9) * (0-(0)));
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
        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(xx), tail3.rotateAngleY + (float) Math.toRadians(yy), tail3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (-7.5-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 19) {
            xx = -7.5 + (((tickAnim - 8) / 11) * (0-(-7.5)));
            yy = 0 + (((tickAnim - 8) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 11) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 31) {
            xx = 0 + (((tickAnim - 19) / 12) * (0-(0)));
            yy = 0 + (((tickAnim - 19) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 19) / 12) * (0-(0)));
        }
        else if (tickAnim >= 31 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 31) / 9) * (-7-(0)));
            yy = 0 + (((tickAnim - 31) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 31) / 9) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = -7 + (((tickAnim - 40) / 10) * (0-(-7)));
            yy = 0 + (((tickAnim - 40) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(xx), tail4.rotateAngleY + (float) Math.toRadians(yy), tail4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 8) / 11) * (5.5-(0)));
            yy = 0 + (((tickAnim - 8) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 11) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 31) {
            xx = 5.5 + (((tickAnim - 19) / 12) * (5.5-(5.5)));
            yy = 0 + (((tickAnim - 19) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 19) / 12) * (0-(0)));
        }
        else if (tickAnim >= 31 && tickAnim < 40) {
            xx = 5.5 + (((tickAnim - 31) / 9) * (-1.13-(5.5)));
            yy = 0 + (((tickAnim - 31) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 31) / 9) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = -1.13 + (((tickAnim - 40) / 10) * (0-(-1.13)));
            yy = 0 + (((tickAnim - 40) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail5, tail5.rotateAngleX + (float) Math.toRadians(xx), tail5.rotateAngleY + (float) Math.toRadians(yy), tail5.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 8) / 11) * (17.5-(0)));
            yy = 0 + (((tickAnim - 8) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 11) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 31) {
            xx = 17.5 + (((tickAnim - 19) / 12) * (17.5-(17.5)));
            yy = 0 + (((tickAnim - 19) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 19) / 12) * (0-(0)));
        }
        else if (tickAnim >= 31 && tickAnim < 40) {
            xx = 17.5 + (((tickAnim - 31) / 9) * (2.13-(17.5)));
            yy = 0 + (((tickAnim - 31) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 31) / 9) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = 2.13 + (((tickAnim - 40) / 10) * (0-(2.13)));
            yy = 0 + (((tickAnim - 40) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail6, tail6.rotateAngleX + (float) Math.toRadians(xx), tail6.rotateAngleY + (float) Math.toRadians(yy), tail6.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 0) / 19) * (8.5-(0)));
            yy = 0 + (((tickAnim - 0) / 19) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 19) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 31) {
            xx = 8.5 + (((tickAnim - 19) / 12) * (8.5-(8.5)));
            yy = 0 + (((tickAnim - 19) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 19) / 12) * (0-(0)));
        }
        else if (tickAnim >= 31 && tickAnim < 50) {
            xx = 8.5 + (((tickAnim - 31) / 19) * (0-(8.5)));
            yy = 0 + (((tickAnim - 31) / 19) * (0-(0)));
            zz = 0 + (((tickAnim - 31) / 19) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body2, body2.rotateAngleX + (float) Math.toRadians(xx), body2.rotateAngleY + (float) Math.toRadians(yy), body2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 0) / 19) * (7.25-(0)));
            yy = 0 + (((tickAnim - 0) / 19) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 19) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 31) {
            xx = 7.25 + (((tickAnim - 19) / 12) * (7.25-(7.25)));
            yy = 0 + (((tickAnim - 19) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 19) / 12) * (0-(0)));
        }
        else if (tickAnim >= 31 && tickAnim < 50) {
            xx = 7.25 + (((tickAnim - 31) / 19) * (0-(7.25)));
            yy = 0 + (((tickAnim - 31) / 19) * (0-(0)));
            zz = 0 + (((tickAnim - 31) / 19) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm, leftArm.rotateAngleX + (float) Math.toRadians(xx), leftArm.rotateAngleY + (float) Math.toRadians(yy), leftArm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 0) / 19) * (-15.75-(0)));
            yy = 0 + (((tickAnim - 0) / 19) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 19) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 31) {
            xx = -15.75 + (((tickAnim - 19) / 12) * (-15.75-(-15.75)));
            yy = 0 + (((tickAnim - 19) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 19) / 12) * (0-(0)));
        }
        else if (tickAnim >= 31 && tickAnim < 50) {
            xx = -15.75 + (((tickAnim - 31) / 19) * (0-(-15.75)));
            yy = 0 + (((tickAnim - 31) / 19) * (0-(0)));
            zz = 0 + (((tickAnim - 31) / 19) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm2, leftArm2.rotateAngleX + (float) Math.toRadians(xx), leftArm2.rotateAngleY + (float) Math.toRadians(yy), leftArm2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 0) / 19) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 19) * (0.525-(0)));
            zz = 0 + (((tickAnim - 0) / 19) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 31) {
            xx = 0 + (((tickAnim - 19) / 12) * (0-(0)));
            yy = 0.525 + (((tickAnim - 19) / 12) * (0.525-(0.525)));
            zz = 0 + (((tickAnim - 19) / 12) * (0-(0)));
        }
        else if (tickAnim >= 31 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 31) / 19) * (0-(0)));
            yy = 0.525 + (((tickAnim - 31) / 19) * (0-(0.525)));
            zz = 0 + (((tickAnim - 31) / 19) * (0-(0)));
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
            xx = 0 + (((tickAnim - 0) / 19) * (17-(0)));
            yy = 0 + (((tickAnim - 0) / 19) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 19) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 31) {
            xx = 17 + (((tickAnim - 19) / 12) * (17-(17)));
            yy = 0 + (((tickAnim - 19) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 19) / 12) * (0-(0)));
        }
        else if (tickAnim >= 31 && tickAnim < 50) {
            xx = 17 + (((tickAnim - 31) / 19) * (0-(17)));
            yy = 0 + (((tickAnim - 31) / 19) * (0-(0)));
            zz = 0 + (((tickAnim - 31) / 19) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm3, leftArm3.rotateAngleX + (float) Math.toRadians(xx), leftArm3.rotateAngleY + (float) Math.toRadians(yy), leftArm3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 0) / 19) * (5.5-(0)));
            yy = 0 + (((tickAnim - 0) / 19) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 19) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 31) {
            xx = 5.5 + (((tickAnim - 19) / 12) * (5.5-(5.5)));
            yy = 0 + (((tickAnim - 19) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 19) / 12) * (0-(0)));
        }
        else if (tickAnim >= 31 && tickAnim < 50) {
            xx = 5.5 + (((tickAnim - 31) / 19) * (0-(5.5)));
            yy = 0 + (((tickAnim - 31) / 19) * (0-(0)));
            zz = 0 + (((tickAnim - 31) / 19) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(xx), neck2.rotateAngleY + (float) Math.toRadians(yy), neck2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 0) / 19) * (7.25-(0)));
            yy = 0 + (((tickAnim - 0) / 19) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 19) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 31) {
            xx = 7.25 + (((tickAnim - 19) / 12) * (7.25-(7.25)));
            yy = 0 + (((tickAnim - 19) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 19) / 12) * (0-(0)));
        }
        else if (tickAnim >= 31 && tickAnim < 50) {
            xx = 7.25 + (((tickAnim - 31) / 19) * (0-(7.25)));
            yy = 0 + (((tickAnim - 31) / 19) * (0-(0)));
            zz = 0 + (((tickAnim - 31) / 19) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm, rightArm.rotateAngleX + (float) Math.toRadians(xx), rightArm.rotateAngleY + (float) Math.toRadians(yy), rightArm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 0) / 19) * (-15.75-(0)));
            yy = 0 + (((tickAnim - 0) / 19) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 19) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 31) {
            xx = -15.75 + (((tickAnim - 19) / 12) * (-15.75-(-15.75)));
            yy = 0 + (((tickAnim - 19) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 19) / 12) * (0-(0)));
        }
        else if (tickAnim >= 31 && tickAnim < 50) {
            xx = -15.75 + (((tickAnim - 31) / 19) * (0-(-15.75)));
            yy = 0 + (((tickAnim - 31) / 19) * (0-(0)));
            zz = 0 + (((tickAnim - 31) / 19) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm2, rightArm2.rotateAngleX + (float) Math.toRadians(xx), rightArm2.rotateAngleY + (float) Math.toRadians(yy), rightArm2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 0) / 19) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 19) * (0.525-(0)));
            zz = 0 + (((tickAnim - 0) / 19) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 31) {
            xx = 0 + (((tickAnim - 19) / 12) * (0-(0)));
            yy = 0.525 + (((tickAnim - 19) / 12) * (0.525-(0.525)));
            zz = 0 + (((tickAnim - 19) / 12) * (0-(0)));
        }
        else if (tickAnim >= 31 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 31) / 19) * (0-(0)));
            yy = 0.525 + (((tickAnim - 31) / 19) * (0-(0.525)));
            zz = 0 + (((tickAnim - 31) / 19) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightArm2.rotationPointX = this.rightArm2.rotationPointX + (float)(xx);
        this.rightArm2.rotationPointY = this.rightArm2.rotationPointY - (float)(yy);
        this.rightArm2.rotationPointZ = this.rightArm2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 0) / 19) * (17-(0)));
            yy = 0 + (((tickAnim - 0) / 19) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 19) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 31) {
            xx = 17 + (((tickAnim - 19) / 12) * (17-(17)));
            yy = 0 + (((tickAnim - 19) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 19) / 12) * (0-(0)));
        }
        else if (tickAnim >= 31 && tickAnim < 50) {
            xx = 17 + (((tickAnim - 31) / 19) * (0-(17)));
            yy = 0 + (((tickAnim - 31) / 19) * (0-(0)));
            zz = 0 + (((tickAnim - 31) / 19) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm3, rightArm3.rotateAngleX + (float) Math.toRadians(xx), rightArm3.rotateAngleY + (float) Math.toRadians(yy), rightArm3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 0) / 19) * (-4.8429-(0)));
            yy = 0 + (((tickAnim - 0) / 19) * (5.9304-(0)));
            zz = 0 + (((tickAnim - 0) / 19) * (8.1421-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 31) {
            xx = -4.8429 + (((tickAnim - 19) / 12) * (-4.8429-(-4.8429)));
            yy = 5.9304 + (((tickAnim - 19) / 12) * (5.9304-(5.9304)));
            zz = 8.1421 + (((tickAnim - 19) / 12) * (8.1421-(8.1421)));
        }
        else if (tickAnim >= 31 && tickAnim < 50) {
            xx = -4.8429 + (((tickAnim - 31) / 19) * (0-(-4.8429)));
            yy = 5.9304 + (((tickAnim - 31) / 19) * (0-(5.9304)));
            zz = 8.1421 + (((tickAnim - 31) / 19) * (0-(8.1421)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg, rightLeg.rotateAngleX + (float) Math.toRadians(xx), rightLeg.rotateAngleY + (float) Math.toRadians(yy), rightLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 0) / 19) * (48.4783-(0)));
            yy = 0 + (((tickAnim - 0) / 19) * (6.1206-(0)));
            zz = 0 + (((tickAnim - 0) / 19) * (3.8845-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 31) {
            xx = 48.4783 + (((tickAnim - 19) / 12) * (48.4783-(48.4783)));
            yy = 6.1206 + (((tickAnim - 19) / 12) * (6.1206-(6.1206)));
            zz = 3.8845 + (((tickAnim - 19) / 12) * (3.8845-(3.8845)));
        }
        else if (tickAnim >= 31 && tickAnim < 50) {
            xx = 48.4783 + (((tickAnim - 31) / 19) * (0-(48.4783)));
            yy = 6.1206 + (((tickAnim - 31) / 19) * (0-(6.1206)));
            zz = 3.8845 + (((tickAnim - 31) / 19) * (0-(3.8845)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg2, rightLeg2.rotateAngleX + (float) Math.toRadians(xx), rightLeg2.rotateAngleY + (float) Math.toRadians(yy), rightLeg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 0) / 19) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 19) * (2.1-(0)));
            zz = 0 + (((tickAnim - 0) / 19) * (-2.025-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 31) {
            xx = 0 + (((tickAnim - 19) / 12) * (0-(0)));
            yy = 2.1 + (((tickAnim - 19) / 12) * (2.1-(2.1)));
            zz = -2.025 + (((tickAnim - 19) / 12) * (-2.025-(-2.025)));
        }
        else if (tickAnim >= 31 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 31) / 19) * (0-(0)));
            yy = 2.1 + (((tickAnim - 31) / 19) * (0-(2.1)));
            zz = -2.025 + (((tickAnim - 31) / 19) * (0-(-2.025)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightLeg2.rotationPointX = this.rightLeg2.rotationPointX + (float)(xx);
        this.rightLeg2.rotationPointY = this.rightLeg2.rotationPointY - (float)(yy);
        this.rightLeg2.rotationPointZ = this.rightLeg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 0) / 19) * (-26.0506-(0)));
            yy = 0 + (((tickAnim - 0) / 19) * (-6.6284-(0)));
            zz = 0 + (((tickAnim - 0) / 19) * (-5.7178-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 31) {
            xx = -26.0506 + (((tickAnim - 19) / 12) * (-26.0506-(-26.0506)));
            yy = -6.6284 + (((tickAnim - 19) / 12) * (-6.6284-(-6.6284)));
            zz = -5.7178 + (((tickAnim - 19) / 12) * (-5.7178-(-5.7178)));
        }
        else if (tickAnim >= 31 && tickAnim < 50) {
            xx = -26.0506 + (((tickAnim - 31) / 19) * (0-(-26.0506)));
            yy = -6.6284 + (((tickAnim - 31) / 19) * (0-(-6.6284)));
            zz = -5.7178 + (((tickAnim - 31) / 19) * (0-(-5.7178)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg3, rightLeg3.rotateAngleX + (float) Math.toRadians(xx), rightLeg3.rotateAngleY + (float) Math.toRadians(yy), rightLeg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 0) / 19) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 19) * (0.85-(0)));
            zz = 0 + (((tickAnim - 0) / 19) * (0.3-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 31) {
            xx = 0 + (((tickAnim - 19) / 12) * (0-(0)));
            yy = 0.85 + (((tickAnim - 19) / 12) * (0.85-(0.85)));
            zz = 0.3 + (((tickAnim - 19) / 12) * (0.3-(0.3)));
        }
        else if (tickAnim >= 31 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 31) / 19) * (0-(0)));
            yy = 0.85 + (((tickAnim - 31) / 19) * (0-(0.85)));
            zz = 0.3 + (((tickAnim - 31) / 19) * (0-(0.3)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightLeg3.rotationPointX = this.rightLeg3.rotationPointX + (float)(xx);
        this.rightLeg3.rotationPointY = this.rightLeg3.rotationPointY - (float)(yy);
        this.rightLeg3.rotationPointZ = this.rightLeg3.rotationPointZ + (float)(zz);

    }
    public void animRoar(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraPhuwiangosaurus entity = (EntityPrehistoricFloraPhuwiangosaurus) entitylivingbaseIn;
        int animCycle = 78;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        if (tickAnim >= 0 && tickAnim < 30) {
            xx = -3.85-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-50))*5 + (((tickAnim - 0) / 30) * (-9.6-(-3.85-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-50))*5)));
            yy = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 30) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 58) {
            xx = -9.6 + (((tickAnim - 30) / 28) * (-9.475-Math.sin((Math.PI/180)*(((double)tickAnim/20)*30-50))*-12-(-9.6)));
            yy = 0 + (((tickAnim - 30) / 28) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 28) * (0-(0)));
        }
        else if (tickAnim >= 58 && tickAnim < 78) {
            xx = -9.475-Math.sin((Math.PI/180)*(((double)tickAnim/20)*30-50))*-12 + (((tickAnim - 58) / 20) * (0-(-9.475-Math.sin((Math.PI/180)*(((double)tickAnim/20)*30-50))*-12)));
            yy = 0 + (((tickAnim - 58) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 58) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(xx), neck.rotateAngleY + (float) Math.toRadians(yy), neck.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 30) {
            xx = -3.85-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-50))*5 + (((tickAnim - 0) / 30) * (-7.025-(-3.85-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-50))*5)));
            yy = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 30) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 58) {
            xx = -7.025 + (((tickAnim - 30) / 28) * (-9.15-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-70))*-8-(-7.025)));
            yy = 0 + (((tickAnim - 30) / 28) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 28) * (0-(0)));
        }
        else if (tickAnim >= 58 && tickAnim < 78) {
            xx = -9.15-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-70))*-8 + (((tickAnim - 58) / 20) * (0-(-9.15-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-70))*-8)));
            yy = 0 + (((tickAnim - 58) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 58) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(xx), neck2.rotateAngleY + (float) Math.toRadians(yy), neck2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 30) {
            xx = -6.125-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-50))*8 + (((tickAnim - 0) / 30) * (-7.5-(-6.125-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-50))*8)));
            yy = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 30) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 58) {
            xx = -7.5 + (((tickAnim - 30) / 28) * (-1.025-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*5-(-7.5)));
            yy = 0 + (((tickAnim - 30) / 28) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 28) * (0-(0)));
        }
        else if (tickAnim >= 58 && tickAnim < 78) {
            xx = -1.025-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*5 + (((tickAnim - 58) / 20) * (0-(-1.025-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*5)));
            yy = 0 + (((tickAnim - 58) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 58) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(xx), neck3.rotateAngleY + (float) Math.toRadians(yy), neck3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 3.825-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-50))*-5 + (((tickAnim - 0) / 30) * (8.4-(3.825-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-50))*-5)));
            yy = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 30) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 58) {
            xx = 8.4 + (((tickAnim - 30) / 28) * (9.075-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-100))*7-(8.4)));
            yy = 0 + (((tickAnim - 30) / 28) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 28) * (0-(0)));
        }
        else if (tickAnim >= 58 && tickAnim < 78) {
            xx = 9.075-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-100))*7 + (((tickAnim - 58) / 20) * (0-(9.075-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-100))*7)));
            yy = 0 + (((tickAnim - 58) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 58) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck4, neck4.rotateAngleX + (float) Math.toRadians(xx), neck4.rotateAngleY + (float) Math.toRadians(yy), neck4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 6.1-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-50))*-8 + (((tickAnim - 0) / 30) * (8.775-(6.1-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-50))*-8)));
            yy = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 30) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 58) {
            xx = 8.775 + (((tickAnim - 30) / 28) * (-6.2-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-15-(8.775)));
            yy = 0 + (((tickAnim - 30) / 28) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 28) * (0-(0)));
        }
        else if (tickAnim >= 58 && tickAnim < 78) {
            xx = -6.2-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-15 + (((tickAnim - 58) / 20) * (0-(-6.2-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-15)));
            yy = 0 + (((tickAnim - 58) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 58) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck5, neck5.rotateAngleX + (float) Math.toRadians(xx), neck5.rotateAngleY + (float) Math.toRadians(yy), neck5.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 58) {
            xx = 0 + (((tickAnim - 20) / 38) * (-14-(0)));
            yy = 0 + (((tickAnim - 20) / 38) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 38) * (0-(0)));
        }
        else if (tickAnim >= 58 && tickAnim < 78) {
            xx = -14 + (((tickAnim - 58) / 20) * (0-(-14)));
            yy = 0 + (((tickAnim - 58) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 58) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck6, neck6.rotateAngleX + (float) Math.toRadians(xx), neck6.rotateAngleY + (float) Math.toRadians(yy), neck6.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 38.175-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-50))*-50 + (((tickAnim - 0) / 20) * (22-(38.175-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-50))*-50)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 24) {
            xx = 22 + (((tickAnim - 20) / 4) * (16.75-(22)));
            yy = 0 + (((tickAnim - 20) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 4) * (0-(0)));
        }
        else if (tickAnim >= 24 && tickAnim < 34) {
            xx = 16.75 + (((tickAnim - 24) / 10) * (0-(16.75)));
            yy = 0 + (((tickAnim - 24) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 24) / 10) * (0-(0)));
        }
        else if (tickAnim >= 34 && tickAnim < 58) {
            xx = 0 + (((tickAnim - 34) / 24) * (13-(0)));
            yy = 0 + (((tickAnim - 34) / 24) * (0-(0)));
            zz = 0 + (((tickAnim - 34) / 24) * (0-(0)));
        }
        else if (tickAnim >= 58 && tickAnim < 78) {
            xx = 13 + (((tickAnim - 58) / 20) * (0-(13)));
            yy = 0 + (((tickAnim - 58) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 58) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(xx), jaw.rotateAngleY + (float) Math.toRadians(yy), jaw.rotateAngleZ + (float) Math.toRadians(zz));
        
    }
    public void animNoise(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraPhuwiangosaurus entity = (EntityPrehistoricFloraPhuwiangosaurus) entitylivingbaseIn;
        int animCycle = 78;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        if (tickAnim >= 0 && tickAnim < 30) {
            xx = -3.85-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-50))*5 + (((tickAnim - 0) / 30) * (-9.6-(-3.85-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-50))*5)));
            yy = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 30) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 58) {
            xx = -9.6 + (((tickAnim - 30) / 28) * (-9.475-Math.sin((Math.PI/180)*(((double)tickAnim/20)*30-50))*-12-(-9.6)));
            yy = 0 + (((tickAnim - 30) / 28) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 28) * (0-(0)));
        }
        else if (tickAnim >= 58 && tickAnim < 78) {
            xx = -9.475-Math.sin((Math.PI/180)*(((double)tickAnim/20)*30-50))*-12 + (((tickAnim - 58) / 20) * (0-(-9.475-Math.sin((Math.PI/180)*(((double)tickAnim/20)*30-50))*-12)));
            yy = 0 + (((tickAnim - 58) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 58) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(xx), neck.rotateAngleY + (float) Math.toRadians(yy), neck.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 30) {
            xx = -3.85-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-50))*5 + (((tickAnim - 0) / 30) * (-7.025-(-3.85-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-50))*5)));
            yy = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 30) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 58) {
            xx = -7.025 + (((tickAnim - 30) / 28) * (-9.15-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-70))*-8-(-7.025)));
            yy = 0 + (((tickAnim - 30) / 28) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 28) * (0-(0)));
        }
        else if (tickAnim >= 58 && tickAnim < 78) {
            xx = -9.15-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-70))*-8 + (((tickAnim - 58) / 20) * (0-(-9.15-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-70))*-8)));
            yy = 0 + (((tickAnim - 58) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 58) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(xx), neck2.rotateAngleY + (float) Math.toRadians(yy), neck2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 30) {
            xx = -6.125-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-50))*8 + (((tickAnim - 0) / 30) * (-7.5-(-6.125-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-50))*8)));
            yy = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 30) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 58) {
            xx = -7.5 + (((tickAnim - 30) / 28) * (-1.025-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*5-(-7.5)));
            yy = 0 + (((tickAnim - 30) / 28) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 28) * (0-(0)));
        }
        else if (tickAnim >= 58 && tickAnim < 78) {
            xx = -1.025-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*5 + (((tickAnim - 58) / 20) * (0-(-1.025-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*5)));
            yy = 0 + (((tickAnim - 58) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 58) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(xx), neck3.rotateAngleY + (float) Math.toRadians(yy), neck3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 3.825-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-50))*-5 + (((tickAnim - 0) / 30) * (8.4-(3.825-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-50))*-5)));
            yy = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 30) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 58) {
            xx = 8.4 + (((tickAnim - 30) / 28) * (9.075-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-100))*7-(8.4)));
            yy = 0 + (((tickAnim - 30) / 28) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 28) * (0-(0)));
        }
        else if (tickAnim >= 58 && tickAnim < 78) {
            xx = 9.075-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-100))*7 + (((tickAnim - 58) / 20) * (0-(9.075-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-100))*7)));
            yy = 0 + (((tickAnim - 58) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 58) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck4, neck4.rotateAngleX + (float) Math.toRadians(xx), neck4.rotateAngleY + (float) Math.toRadians(yy), neck4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 6.1-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-50))*-8 + (((tickAnim - 0) / 30) * (8.775-(6.1-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-50))*-8)));
            yy = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 30) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 58) {
            xx = 8.775 + (((tickAnim - 30) / 28) * (-6.2-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-15-(8.775)));
            yy = 0 + (((tickAnim - 30) / 28) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 28) * (0-(0)));
        }
        else if (tickAnim >= 58 && tickAnim < 78) {
            xx = -6.2-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-15 + (((tickAnim - 58) / 20) * (0-(-6.2-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-15)));
            yy = 0 + (((tickAnim - 58) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 58) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck5, neck5.rotateAngleX + (float) Math.toRadians(xx), neck5.rotateAngleY + (float) Math.toRadians(yy), neck5.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 58) {
            xx = 0 + (((tickAnim - 20) / 38) * (-14-(0)));
            yy = 0 + (((tickAnim - 20) / 38) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 38) * (0-(0)));
        }
        else if (tickAnim >= 58 && tickAnim < 78) {
            xx = -14 + (((tickAnim - 58) / 20) * (0-(-14)));
            yy = 0 + (((tickAnim - 58) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 58) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck6, neck6.rotateAngleX + (float) Math.toRadians(xx), neck6.rotateAngleY + (float) Math.toRadians(yy), neck6.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 38.175-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-50))*-50 + (((tickAnim - 0) / 20) * (22-(38.175-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-50))*-50)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 24) {
            xx = 22 + (((tickAnim - 20) / 4) * (16.75-(22)));
            yy = 0 + (((tickAnim - 20) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 4) * (0-(0)));
        }
        else if (tickAnim >= 24 && tickAnim < 34) {
            xx = 16.75 + (((tickAnim - 24) / 10) * (0-(16.75)));
            yy = 0 + (((tickAnim - 24) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 24) / 10) * (0-(0)));
        }
        else if (tickAnim >= 34 && tickAnim < 58) {
            xx = 0 + (((tickAnim - 34) / 24) * (13-(0)));
            yy = 0 + (((tickAnim - 34) / 24) * (0-(0)));
            zz = 0 + (((tickAnim - 34) / 24) * (0-(0)));
        }
        else if (tickAnim >= 58 && tickAnim < 78) {
            xx = 13 + (((tickAnim - 58) / 20) * (0-(13)));
            yy = 0 + (((tickAnim - 58) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 58) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(xx), jaw.rotateAngleY + (float) Math.toRadians(yy), jaw.rotateAngleZ + (float) Math.toRadians(zz));

    }
    public void animAttack(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraPhuwiangosaurus entity = (EntityPrehistoricFloraPhuwiangosaurus) entitylivingbaseIn;
        int animCycle = 20;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        if (tickAnim >= 0 && tickAnim < 5) {
            xx = -0-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-50 + (((tickAnim - 0) / 5) * (-50.2184-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-50))*90-(-0-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-50)));
            yy = 0 + (((tickAnim - 0) / 5) * (3.8065-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (-4.3128-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 11) {
            xx = -50.2184-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-50))*90 + (((tickAnim - 5) / 6) * (-20.8934-(-50.2184-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-50))*90)));
            yy = 3.8065 + (((tickAnim - 5) / 6) * (3.8065-(3.8065)));
            zz = -4.3128 + (((tickAnim - 5) / 6) * (-4.3128-(-4.3128)));
        }
        else if (tickAnim >= 11 && tickAnim < 20) {
            xx = -20.8934 + (((tickAnim - 11) / 9) * (0-(-20.8934)));
            yy = 3.8065 + (((tickAnim - 11) / 9) * (0-(3.8065)));
            zz = -4.3128 + (((tickAnim - 11) / 9) * (0-(-4.3128)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm, leftArm.rotateAngleX + (float) Math.toRadians(xx), leftArm.rotateAngleY + (float) Math.toRadians(yy), leftArm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (-42.125-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-50))*90-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 11) {
            xx = -42.125-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-50))*90 + (((tickAnim - 5) / 6) * (54.575-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*150-(-42.125-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-50))*90)));
            yy = 0 + (((tickAnim - 5) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 6) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 20) {
            xx = 54.575-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*150 + (((tickAnim - 11) / 9) * (0-(54.575-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*150)));
            yy = 0 + (((tickAnim - 11) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 9) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm2, leftArm2.rotateAngleX + (float) Math.toRadians(xx), leftArm2.rotateAngleY + (float) Math.toRadians(yy), leftArm2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (1.125-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0.675-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 5) / 6) * (0-(0)));
            yy = 1.125 + (((tickAnim - 5) / 6) * (1.05-(1.125)));
            zz = 0.675 + (((tickAnim - 5) / 6) * (0-(0.675)));
        }
        else if (tickAnim >= 11 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 11) / 9) * (0-(0)));
            yy = 1.05 + (((tickAnim - 11) / 9) * (0-(1.05)));
            zz = 0 + (((tickAnim - 11) / 9) * (0-(0)));
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
            xx = 0 + (((tickAnim - 0) / 5) * (-74.45-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-50))*190-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 11) {
            xx = -74.45-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-50))*190 + (((tickAnim - 5) / 6) * (35.575-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-50))*-90-(-74.45-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-50))*190)));
            yy = 0 + (((tickAnim - 5) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 6) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 20) {
            xx = 35.575-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-50))*-90 + (((tickAnim - 11) / 9) * (0-(35.575-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-50))*-90)));
            yy = 0 + (((tickAnim - 11) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 9) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm3, leftArm3.rotateAngleX + (float) Math.toRadians(xx), leftArm3.rotateAngleY + (float) Math.toRadians(yy), leftArm3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0.675-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 5) / 6) * (0-(0)));
            yy = 0.675 + (((tickAnim - 5) / 6) * (0-(0.675)));
            zz = 0 + (((tickAnim - 5) / 6) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 11) / 9) * (0-(0)));
            yy = 0 + (((tickAnim - 11) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 9) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftArm3.rotationPointX = this.leftArm3.rotationPointX + (float)(xx);
        this.leftArm3.rotationPointY = this.leftArm3.rotationPointY - (float)(yy);
        this.leftArm3.rotationPointZ = this.leftArm3.rotationPointZ + (float)(zz);

    }
    public void animWalking(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraPhuwiangosaurus entity = (EntityPrehistoricFloraPhuwiangosaurus) entitylivingbaseIn;
        int animCycle = 50;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        this.setRotateAngle(main, main.rotateAngleX + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*144/0.5))*0.5), main.rotateAngleY + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*144))*-1), main.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*144))*1));
        this.main.rotationPointX = this.main.rotationPointX + (float)(0);
        this.main.rotationPointY = this.main.rotationPointY - (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*144/0.5-120))*-0.3);
        this.main.rotationPointZ = this.main.rotationPointZ + (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*144/0.5-50))*-0.3);



        if (tickAnim >= 0 && tickAnim < 33) {
            xx = -4.5 + (((tickAnim - 0) / 33) * (14.75-(-4.5)));
            yy = 0 + (((tickAnim - 0) / 33) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 33) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 43) {
            xx = 14.75 + (((tickAnim - 33) / 10) * (82.737-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-40))*90-(14.75)));
            yy = 0 + (((tickAnim - 33) / 10) * (-2.3623-(0)));
            zz = 0 + (((tickAnim - 33) / 10) * (-1.5552-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 50) {
            xx = 82.737-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-40))*90 + (((tickAnim - 43) / 7) * (-4.5-(82.737-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-40))*90)));
            yy = -2.3623 + (((tickAnim - 43) / 7) * (0-(-2.3623)));
            zz = -1.5552 + (((tickAnim - 43) / 7) * (0-(-1.5552)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg, leftLeg.rotateAngleX + (float) Math.toRadians(xx), leftLeg.rotateAngleY + (float) Math.toRadians(yy), leftLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = -8.25 + (((tickAnim - 0) / 8) * (-8.315-(-8.25)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 20) {
            xx = -8.315 + (((tickAnim - 8) / 12) * (-3.08-(-8.315)));
            yy = 0 + (((tickAnim - 8) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 12) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 33) {
            xx = -3.08 + (((tickAnim - 20) / 13) * (5-(-3.08)));
            yy = 0 + (((tickAnim - 20) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 13) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 38) {
            xx = 5 + (((tickAnim - 33) / 5) * (-25.26-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-40))*-50-(5)));
            yy = 0 + (((tickAnim - 33) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 5) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 43) {
            xx = -25.26-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-40))*-50 + (((tickAnim - 38) / 5) * (98.4-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-40))*100-(-25.26-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-40))*-50)));
            yy = 0 + (((tickAnim - 38) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 38) / 5) * (0-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 50) {
            xx = 98.4-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-40))*100 + (((tickAnim - 43) / 7) * (-8.25-(98.4-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-40))*100)));
            yy = 0 + (((tickAnim - 43) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 43) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg2, leftLeg2.rotateAngleX + (float) Math.toRadians(xx), leftLeg2.rotateAngleY + (float) Math.toRadians(yy), leftLeg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0.75-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 8) / 25) * (0-(0)));
            yy = 0.75 + (((tickAnim - 8) / 25) * (0-(0.75)));
            zz = 0 + (((tickAnim - 8) / 25) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 38) {
            xx = 0 + (((tickAnim - 33) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 33) / 5) * (0.75-(0)));
            zz = 0 + (((tickAnim - 33) / 5) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 43) {
            xx = 0 + (((tickAnim - 38) / 5) * (0-(0)));
            yy = 0.75 + (((tickAnim - 38) / 5) * (1.875-(0.75)));
            zz = 0 + (((tickAnim - 38) / 5) * (-0.65-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 43) / 7) * (0-(0)));
            yy = 1.875 + (((tickAnim - 43) / 7) * (0-(1.875)));
            zz = -0.65 + (((tickAnim - 43) / 7) * (0-(-0.65)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftLeg2.rotationPointX = this.leftLeg2.rotationPointX + (float)(xx);
        this.leftLeg2.rotationPointY = this.leftLeg2.rotationPointY - (float)(yy);
        this.leftLeg2.rotationPointZ = this.leftLeg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 13 + (((tickAnim - 0) / 8) * (7.75-(13)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 20) {
            xx = 7.75 + (((tickAnim - 8) / 12) * (-5-(7.75)));
            yy = 0 + (((tickAnim - 8) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 12) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 33) {
            xx = -5 + (((tickAnim - 20) / 13) * (8.5-(-5)));
            yy = 0 + (((tickAnim - 20) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 13) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 38) {
            xx = 8.5 + (((tickAnim - 33) / 5) * (27.75-(8.5)));
            yy = 0 + (((tickAnim - 33) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 5) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 43) {
            xx = 27.75 + (((tickAnim - 38) / 5) * (36.01-(27.75)));
            yy = 0 + (((tickAnim - 38) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 38) / 5) * (0-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 50) {
            xx = 36.01 + (((tickAnim - 43) / 7) * (13-(36.01)));
            yy = 0 + (((tickAnim - 43) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 43) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg3, leftLeg3.rotateAngleX + (float) Math.toRadians(xx), leftLeg3.rotateAngleY + (float) Math.toRadians(yy), leftLeg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            yy = -0.725 + (((tickAnim - 0) / 8) * (-0.725-(-0.725)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 8) / 5) * (0-(0)));
            yy = -0.725 + (((tickAnim - 8) / 5) * (0.45-(-0.725)));
            zz = 0 + (((tickAnim - 8) / 5) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 13) / 7) * (0-(0)));
            yy = 0.45 + (((tickAnim - 13) / 7) * (0-(0.45)));
            zz = 0 + (((tickAnim - 13) / 7) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 20) / 13) * (0-(0)));
            yy = 0 + (((tickAnim - 20) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 13) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 43) {
            xx = 0 + (((tickAnim - 33) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 33) / 10) * (1.325-(0)));
            zz = 0 + (((tickAnim - 33) / 10) * (0-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 43) / 7) * (0-(0)));
            yy = 1.325 + (((tickAnim - 43) / 7) * (-0.725-(1.325)));
            zz = 0 + (((tickAnim - 43) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftLeg3.rotationPointX = this.leftLeg3.rotationPointX + (float)(xx);
        this.leftLeg3.rotationPointY = this.leftLeg3.rotationPointY - (float)(yy);
        this.leftLeg3.rotationPointZ = this.leftLeg3.rotationPointZ + (float)(zz);



        this.setRotateAngle(tail, tail.rotateAngleX + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*144/0.5+50))*0.5), tail.rotateAngleY + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*144+50))*-1.5), tail.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*144+50))*0.5));


        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*144/0.5-50))*0.5), tail2.rotateAngleY + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*144-80))*-1), tail2.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*144-80))*0.5));


        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*144/0.5-100))*1), tail3.rotateAngleY + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*144-120))*-2), tail3.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*144-120))*1));


        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*144/0.5-150))*1.5), tail4.rotateAngleY + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*144-160))*-2.5), tail4.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*144-160))*1.5));


        this.setRotateAngle(tail5, tail5.rotateAngleX + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*144/0.5-200))*2), tail5.rotateAngleY + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*144-200))*-4), tail5.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*144-200))*2));


        this.setRotateAngle(tail6, tail6.rotateAngleX + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*144/0.5-250))*3), tail6.rotateAngleY + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*144-250))*-6), tail6.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*144-250))*3));


        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*144/0.5-120))*0.5), body.rotateAngleY + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*144))*1.5), body.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*144-150))*1.5));


        this.setRotateAngle(body2, body2.rotateAngleX + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*144/0.5-180))*1), body2.rotateAngleY + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*144-100))*-0.5), body2.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*144-250))*1));



        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 4.75 + (((tickAnim - 0) / 8) * (2.7786-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*40-(4.75)));
            yy = 0 + (((tickAnim - 0) / 8) * (4.2554-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*10-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (-4.5616+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*10-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 16) {
            xx = 2.7786-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*40 + (((tickAnim - 8) / 8) * (-25.5-(2.7786-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*40)));
            yy = 4.2554-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*10 + (((tickAnim - 8) / 8) * (0-(4.2554-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*10)));
            zz = -4.5616+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*10 + (((tickAnim - 8) / 8) * (0-(-4.5616+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*10)));
        }
        else if (tickAnim >= 16 && tickAnim < 50) {
            xx = -25.5 + (((tickAnim - 16) / 34) * (4.75-(-25.5)));
            yy = 0 + (((tickAnim - 16) / 34) * (0-(0)));
            zz = 0 + (((tickAnim - 16) / 34) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm, leftArm.rotateAngleX + (float) Math.toRadians(xx), leftArm.rotateAngleY + (float) Math.toRadians(yy), leftArm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 16.25 + (((tickAnim - 0) / 8) * (-14-(16.25)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 16) {
            xx = -14 + (((tickAnim - 8) / 8) * (16.75-(-14)));
            yy = 0 + (((tickAnim - 8) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 8) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 22) {
            xx = 16.75 + (((tickAnim - 16) / 6) * (12.81-(16.75)));
            yy = 0 + (((tickAnim - 16) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 16) / 6) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 50) {
            xx = 12.81 + (((tickAnim - 22) / 28) * (16.25-(12.81)));
            yy = 0 + (((tickAnim - 22) / 28) * (0-(0)));
            zz = 0 + (((tickAnim - 22) / 28) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm2, leftArm2.rotateAngleX + (float) Math.toRadians(xx), leftArm2.rotateAngleY + (float) Math.toRadians(yy), leftArm2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 16) {
            xx = 0 + (((tickAnim - 8) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 8) / 8) * (-0.425-(0)));
            zz = 0 + (((tickAnim - 8) / 8) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 16) / 34) * (0-(0)));
            yy = -0.425 + (((tickAnim - 16) / 34) * (0-(-0.425)));
            zz = 0 + (((tickAnim - 16) / 34) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftArm2.rotationPointX = this.leftArm2.rotationPointX + (float)(xx);
        this.leftArm2.rotationPointY = this.leftArm2.rotationPointY - (float)(yy);
        this.leftArm2.rotationPointZ = this.leftArm2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (41.25-(0)));
            yy = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 8) {
            xx = 41.25 + (((tickAnim - 4) / 4) * (52-(41.25)));
            yy = 0 + (((tickAnim - 4) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 4) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 16) {
            xx = 52 + (((tickAnim - 8) / 8) * (9.75-(52)));
            yy = 0 + (((tickAnim - 8) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 8) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 22) {
            xx = 9.75 + (((tickAnim - 16) / 6) * (8.25-(9.75)));
            yy = 0 + (((tickAnim - 16) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 16) / 6) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 40) {
            xx = 8.25 + (((tickAnim - 22) / 18) * (-8.25-(8.25)));
            yy = 0 + (((tickAnim - 22) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 22) / 18) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = -8.25 + (((tickAnim - 40) / 10) * (0-(-8.25)));
            yy = 0 + (((tickAnim - 40) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm3, leftArm3.rotateAngleX + (float) Math.toRadians(xx), leftArm3.rotateAngleY + (float) Math.toRadians(yy), leftArm3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0.675-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (-0.875-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 16) {
            xx = 0 + (((tickAnim - 8) / 8) * (0-(0)));
            yy = 0.675 + (((tickAnim - 8) / 8) * (-0.425-(0.675)));
            zz = -0.875 + (((tickAnim - 8) / 8) * (0-(-0.875)));
        }
        else if (tickAnim >= 16 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 16) / 24) * (0-(0)));
            yy = -0.425 + (((tickAnim - 16) / 24) * (0.66-(-0.425)));
            zz = 0 + (((tickAnim - 16) / 24) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 40) / 10) * (0-(0)));
            yy = 0.66 + (((tickAnim - 40) / 10) * (0-(0.66)));
            zz = 0 + (((tickAnim - 40) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftArm3.rotationPointX = this.leftArm3.rotationPointX + (float)(xx);
        this.leftArm3.rotationPointY = this.leftArm3.rotationPointY - (float)(yy);
        this.leftArm3.rotationPointZ = this.leftArm3.rotationPointZ + (float)(zz);



        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*144/0.5-50))*-0.5), neck.rotateAngleY + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*144-100))*0.5), neck.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*144-250))*-1));


        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*144/0.5-150))*-1), neck2.rotateAngleY + (float) Math.toRadians(0), neck2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*144/0.5-200))*-1), neck3.rotateAngleY + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*144-100))*-1), neck3.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(neck4, neck4.rotateAngleX + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*144/0.5-250))*-1), neck4.rotateAngleY + (float) Math.toRadians(0), neck4.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(neck5, neck5.rotateAngleX + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*144/0.5-350))*-1), neck5.rotateAngleY + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*144-250))*-1), neck5.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(neck6, neck6.rotateAngleX + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*144/0.5-400))*-1), neck6.rotateAngleY + (float) Math.toRadians(0), neck6.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*144/0.5-500))*-1), head.rotateAngleY + (float) Math.toRadians(0), head.rotateAngleZ + (float) Math.toRadians(0));



        if (tickAnim >= 0 && tickAnim < 23) {
            xx = -16.35 + (((tickAnim - 0) / 23) * (4.75-(-16.35)));
            yy = 0 + (((tickAnim - 0) / 23) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 23) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 32) {
            xx = 4.75 + (((tickAnim - 23) / 9) * (59.9786-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-20))*80-(4.75)));
            yy = 0 + (((tickAnim - 23) / 9) * (-30.2304-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-30-(0)));
            zz = 0 + (((tickAnim - 23) / 9) * (30.4366+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-30-(0)));
        }
        else if (tickAnim >= 32 && tickAnim < 40) {
            xx = 59.9786-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-20))*80 + (((tickAnim - 32) / 8) * (-22.625-(59.9786-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-20))*80)));
            yy = -30.2304-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-30 + (((tickAnim - 32) / 8) * (0-(-30.2304-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-30)));
            zz = 30.4366+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-30 + (((tickAnim - 32) / 8) * (0-(30.4366+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-30)));
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = -22.625 + (((tickAnim - 40) / 10) * (-16.35-(-22.625)));
            yy = 0 + (((tickAnim - 40) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm, rightArm.rotateAngleX + (float) Math.toRadians(xx), rightArm.rotateAngleY + (float) Math.toRadians(yy), rightArm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 14.25 + (((tickAnim - 0) / 5) * (12.81-(14.25)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 23) {
            xx = 12.81 + (((tickAnim - 5) / 18) * (16.25-(12.81)));
            yy = 0 + (((tickAnim - 5) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 18) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 32) {
            xx = 16.25 + (((tickAnim - 23) / 9) * (-12.225-(16.25)));
            yy = 0 + (((tickAnim - 23) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 9) * (0-(0)));
        }
        else if (tickAnim >= 32 && tickAnim < 40) {
            xx = -12.225 + (((tickAnim - 32) / 8) * (19.25-(-12.225)));
            yy = 0 + (((tickAnim - 32) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 32) / 8) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = 19.25 + (((tickAnim - 40) / 10) * (14.25-(19.25)));
            yy = 0 + (((tickAnim - 40) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm2, rightArm2.rotateAngleX + (float) Math.toRadians(xx), rightArm2.rotateAngleY + (float) Math.toRadians(yy), rightArm2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 0) / 23) * (0-(0)));
            yy = -0.1 + (((tickAnim - 0) / 23) * (0-(-0.1)));
            zz = 0 + (((tickAnim - 0) / 23) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 23) / 27) * (0-(0)));
            yy = 0 + (((tickAnim - 23) / 27) * (-0.1-(0)));
            zz = 0 + (((tickAnim - 23) / 27) * (0-(0)));
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
            xx = 1.75 + (((tickAnim - 0) / 13) * (-9.19-(1.75)));
            yy = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 23) {
            xx = -9.19 + (((tickAnim - 13) / 10) * (0-(-9.19)));
            yy = 0 + (((tickAnim - 13) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 10) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 23) / 5) * (41.25-(0)));
            yy = 0 + (((tickAnim - 23) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 5) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 32) {
            xx = 41.25 + (((tickAnim - 28) / 4) * (52-(41.25)));
            yy = 0 + (((tickAnim - 28) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 4) * (0-(0)));
        }
        else if (tickAnim >= 32 && tickAnim < 40) {
            xx = 52 + (((tickAnim - 32) / 8) * (2.25-(52)));
            yy = 0 + (((tickAnim - 32) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 32) / 8) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = 2.25 + (((tickAnim - 40) / 10) * (1.75-(2.25)));
            yy = 0 + (((tickAnim - 40) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm3, rightArm3.rotateAngleX + (float) Math.toRadians(xx), rightArm3.rotateAngleY + (float) Math.toRadians(yy), rightArm3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            yy = 0.1 + (((tickAnim - 0) / 13) * (0.655-(0.1)));
            zz = -0.125 + (((tickAnim - 0) / 13) * (0-(-0.125)));
        }
        else if (tickAnim >= 13 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 13) / 10) * (0-(0)));
            yy = 0.655 + (((tickAnim - 13) / 10) * (0-(0.655)));
            zz = 0 + (((tickAnim - 13) / 10) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 32) {
            xx = 0 + (((tickAnim - 23) / 9) * (0-(0)));
            yy = 0 + (((tickAnim - 23) / 9) * (0.675-(0)));
            zz = 0 + (((tickAnim - 23) / 9) * (-0.875-(0)));
        }
        else if (tickAnim >= 32 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 32) / 8) * (0-(0)));
            yy = 0.675 + (((tickAnim - 32) / 8) * (-0.275-(0.675)));
            zz = -0.875 + (((tickAnim - 32) / 8) * (0-(-0.875)));
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 40) / 10) * (0-(0)));
            yy = -0.275 + (((tickAnim - 40) / 10) * (0.1-(-0.275)));
            zz = 0 + (((tickAnim - 40) / 10) * (-0.125-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightArm3.rotationPointX = this.rightArm3.rotationPointX + (float)(xx);
        this.rightArm3.rotationPointY = this.rightArm3.rotationPointY - (float)(yy);
        this.rightArm3.rotationPointZ = this.rightArm3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 9 + (((tickAnim - 0) / 10) * (14.475-(9)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 19) {
            xx = 14.475 + (((tickAnim - 10) / 9) * (3.787-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-40))*40-(14.475)));
            yy = 0 + (((tickAnim - 10) / 9) * (2.3623-(0)));
            zz = 0 + (((tickAnim - 10) / 9) * (1.5552-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 28) {
            xx = 3.787-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-40))*40 + (((tickAnim - 19) / 9) * (-4.775-(3.787-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-40))*40)));
            yy = 2.3623 + (((tickAnim - 19) / 9) * (0-(2.3623)));
            zz = 1.5552 + (((tickAnim - 19) / 9) * (0-(1.5552)));
        }
        else if (tickAnim >= 28 && tickAnim < 50) {
            xx = -4.775 + (((tickAnim - 28) / 22) * (9-(-4.775)));
            yy = 0 + (((tickAnim - 28) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 22) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg, rightLeg.rotateAngleX + (float) Math.toRadians(xx), rightLeg.rotateAngleY + (float) Math.toRadians(yy), rightLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = -2.25 + (((tickAnim - 0) / 10) * (5-(-2.25)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 14) {
            xx = 5 + (((tickAnim - 10) / 4) * (16.465-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-40))*-20-(5)));
            yy = 0 + (((tickAnim - 10) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 4) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 19) {
            xx = 16.465-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-40))*-20 + (((tickAnim - 14) / 5) * (14.3-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-40))*50-(16.465-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-40))*-20)));
            yy = 0 + (((tickAnim - 14) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 5) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 28) {
            xx = 14.3-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-40))*50 + (((tickAnim - 19) / 9) * (-8.25-(14.3-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-40))*50)));
            yy = 0 + (((tickAnim - 19) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 19) / 9) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 50) {
            xx = -8.25 + (((tickAnim - 28) / 22) * (-2.25-(-8.25)));
            yy = 0 + (((tickAnim - 28) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 22) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg2, rightLeg2.rotateAngleX + (float) Math.toRadians(xx), rightLeg2.rotateAngleY + (float) Math.toRadians(yy), rightLeg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 10 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 10) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 4) * (0.75-(0)));
            zz = 0 + (((tickAnim - 10) / 4) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 14) / 5) * (0-(0)));
            yy = 0.75 + (((tickAnim - 14) / 5) * (2.7-(0.75)));
            zz = 0 + (((tickAnim - 14) / 5) * (-1.025-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 19) / 9) * (0-(0)));
            yy = 2.7 + (((tickAnim - 19) / 9) * (0-(2.7)));
            zz = -1.025 + (((tickAnim - 19) / 9) * (0-(-1.025)));
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
            xx = -6.25 + (((tickAnim - 0) / 10) * (8.5-(-6.25)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 14) {
            xx = 8.5 + (((tickAnim - 10) / 4) * (27.75-(8.5)));
            yy = 0 + (((tickAnim - 10) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 4) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 19) {
            xx = 27.75 + (((tickAnim - 14) / 5) * (36.01-(27.75)));
            yy = 0 + (((tickAnim - 14) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 5) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 28) {
            xx = 36.01 + (((tickAnim - 19) / 9) * (13-(36.01)));
            yy = 0 + (((tickAnim - 19) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 19) / 9) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 50) {
            xx = 13 + (((tickAnim - 28) / 22) * (-6.25-(13)));
            yy = 0 + (((tickAnim - 28) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 22) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg3, rightLeg3.rotateAngleX + (float) Math.toRadians(xx), rightLeg3.rotateAngleY + (float) Math.toRadians(yy), rightLeg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = -0.225 + (((tickAnim - 0) / 10) * (0-(-0.225)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 10) / 9) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 9) * (0.975-(0)));
            zz = 0 + (((tickAnim - 10) / 9) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 19) / 9) * (0-(0)));
            yy = 0.975 + (((tickAnim - 19) / 9) * (-0.55-(0.975)));
            zz = 0 + (((tickAnim - 19) / 9) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 38) {
            xx = 0 + (((tickAnim - 28) / 10) * (0-(0)));
            yy = -0.55 + (((tickAnim - 28) / 10) * (0.86-(-0.55)));
            zz = 0 + (((tickAnim - 28) / 10) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 38) / 12) * (0-(0)));
            yy = 0.86 + (((tickAnim - 38) / 12) * (-0.225-(0.86)));
            zz = 0 + (((tickAnim - 38) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightLeg3.rotationPointX = this.rightLeg3.rotationPointX + (float)(xx);
        this.rightLeg3.rotationPointY = this.rightLeg3.rotationPointY - (float)(yy);
        this.rightLeg3.rotationPointZ = this.rightLeg3.rotationPointZ + (float)(zz);

    }
    public void animRunning(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraPhuwiangosaurus entity = (EntityPrehistoricFloraPhuwiangosaurus) entitylivingbaseIn;
        int animCycle = 35;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        this.setRotateAngle(main, main.rotateAngleX + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*206/0.5))*1), main.rotateAngleY + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*206))*-2), main.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*206))*1));

        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*206/0.5-120))*-0.6 + (((tickAnim - 0) / 10) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*206/0.5-120))*-0.6-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*206/0.5-120))*-0.6)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*206/0.5-50))*0.8 + (((tickAnim - 0) / 10) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*206/0.5-50))*0.6-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*206/0.5-50))*0.8)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*206/0.5-120))*-0.6 + (((tickAnim - 10) / 3) * (-0.525+Math.sin((Math.PI/180)*(((double)tickAnim/20)*206/0.5-50))*-0.5-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*206/0.5-120))*-0.6)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*206/0.5-50))*0.6 + (((tickAnim - 10) / 3) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*206/0.5-30))*0.6-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*206/0.5-50))*0.6)));
        }
        else if (tickAnim >= 13 && tickAnim < 17) {
            xx = 0 + (((tickAnim - 13) / 4) * (0-(0)));
            yy = -0.525+Math.sin((Math.PI/180)*(((double)tickAnim/20)*206/0.5-50))*-0.5 + (((tickAnim - 13) / 4) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*206/0.5-120))*-0.6-(-0.525+Math.sin((Math.PI/180)*(((double)tickAnim/20)*206/0.5-50))*-0.5)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*206/0.5-30))*0.6 + (((tickAnim - 13) / 4) * (0.175+Math.sin((Math.PI/180)*(((double)tickAnim/20)*206/0.5-20))*0.8-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*206/0.5-30))*0.6)));
        }
        else if (tickAnim >= 17 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 17) / 11) * (0-(0)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*206/0.5-120))*-0.6 + (((tickAnim - 17) / 11) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*206/0.5-120))*-0.6-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*206/0.5-120))*-0.6)));
            zz = 0.175+Math.sin((Math.PI/180)*(((double)tickAnim/20)*206/0.5-20))*0.8 + (((tickAnim - 17) / 11) * (0.1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*206/0.5-50))*0.6-(0.175+Math.sin((Math.PI/180)*(((double)tickAnim/20)*206/0.5-20))*0.8)));
        }
        else if (tickAnim >= 28 && tickAnim < 31) {
            xx = 0 + (((tickAnim - 28) / 3) * (0-(0)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*206/0.5-120))*-0.6 + (((tickAnim - 28) / 3) * (-0.525+Math.sin((Math.PI/180)*(((double)tickAnim/20)*206/0.5-50))*-0.5-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*206/0.5-120))*-0.6)));
            zz = 0.1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*206/0.5-50))*0.6 + (((tickAnim - 28) / 3) * (0.05+Math.sin((Math.PI/180)*(((double)tickAnim/20)*206/0.5-40))*0.6-(0.1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*206/0.5-50))*0.6)));
        }
        else if (tickAnim >= 31 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 31) / 4) * (0-(0)));
            yy = -0.525+Math.sin((Math.PI/180)*(((double)tickAnim/20)*206/0.5-50))*-0.5 + (((tickAnim - 31) / 4) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*206/0.5-120))*-0.6-(-0.525+Math.sin((Math.PI/180)*(((double)tickAnim/20)*206/0.5-50))*-0.5)));
            zz = 0.05+Math.sin((Math.PI/180)*(((double)tickAnim/20)*206/0.5-40))*0.6 + (((tickAnim - 31) / 4) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*206/0.5-50))*0.8-(0.05+Math.sin((Math.PI/180)*(((double)tickAnim/20)*206/0.5-40))*0.6)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.main.rotationPointX = this.main.rotationPointX + (float)(xx);
        this.main.rotationPointY = this.main.rotationPointY - (float)(yy);
        this.main.rotationPointZ = this.main.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 21) {
            xx = -4.5 + (((tickAnim - 0) / 21) * (19.25-(-4.5)));
            yy = 0 + (((tickAnim - 0) / 21) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 21) * (0-(0)));
        }
        else if (tickAnim >= 21 && tickAnim < 28) {
            xx = 19.25 + (((tickAnim - 21) / 7) * (37.112-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-40))*60-(19.25)));
            yy = 0 + (((tickAnim - 21) / 7) * (-2.3623-(0)));
            zz = 0 + (((tickAnim - 21) / 7) * (-1.5552-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 35) {
            xx = 37.112-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-40))*60 + (((tickAnim - 28) / 7) * (-4.5-(37.112-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-40))*60)));
            yy = -2.3623 + (((tickAnim - 28) / 7) * (0-(-2.3623)));
            zz = -1.5552 + (((tickAnim - 28) / 7) * (0-(-1.5552)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg, leftLeg.rotateAngleX + (float) Math.toRadians(xx), leftLeg.rotateAngleY + (float) Math.toRadians(yy), leftLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = -8.25 + (((tickAnim - 0) / 5) * (-8.315-(-8.25)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 14) {
            xx = -8.315 + (((tickAnim - 5) / 9) * (-3.08-(-8.315)));
            yy = 0 + (((tickAnim - 5) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 9) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 21) {
            xx = -3.08 + (((tickAnim - 14) / 7) * (5-(-3.08)));
            yy = 0 + (((tickAnim - 14) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 7) * (0-(0)));
        }
        else if (tickAnim >= 21 && tickAnim < 24) {
            xx = 5 + (((tickAnim - 21) / 3) * (7.065-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-40))*-30-(5)));
            yy = 0 + (((tickAnim - 21) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 21) / 3) * (0-(0)));
        }
        else if (tickAnim >= 24 && tickAnim < 28) {
            xx = 7.065-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-40))*-30 + (((tickAnim - 24) / 4) * (84.6-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-40))*120-(7.065-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-40))*-30)));
            yy = 0 + (((tickAnim - 24) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 24) / 4) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 35) {
            xx = 84.6-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-40))*120 + (((tickAnim - 28) / 7) * (-8.25-(84.6-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-40))*120)));
            yy = 0 + (((tickAnim - 28) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg2, leftLeg2.rotateAngleX + (float) Math.toRadians(xx), leftLeg2.rotateAngleY + (float) Math.toRadians(yy), leftLeg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0.75-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 21) {
            xx = 0 + (((tickAnim - 5) / 16) * (0-(0)));
            yy = 0.75 + (((tickAnim - 5) / 16) * (0-(0.75)));
            zz = 0 + (((tickAnim - 5) / 16) * (0-(0)));
        }
        else if (tickAnim >= 21 && tickAnim < 24) {
            xx = 0 + (((tickAnim - 21) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 21) / 3) * (0.75-(0)));
            zz = 0 + (((tickAnim - 21) / 3) * (0-(0)));
        }
        else if (tickAnim >= 24 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 24) / 4) * (0-(0)));
            yy = 0.75 + (((tickAnim - 24) / 4) * (1.875-(0.75)));
            zz = 0 + (((tickAnim - 24) / 4) * (-0.65-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 28) / 7) * (0-(0)));
            yy = 1.875 + (((tickAnim - 28) / 7) * (0-(1.875)));
            zz = -0.65 + (((tickAnim - 28) / 7) * (0-(-0.65)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftLeg2.rotationPointX = this.leftLeg2.rotationPointX + (float)(xx);
        this.leftLeg2.rotationPointY = this.leftLeg2.rotationPointY - (float)(yy);
        this.leftLeg2.rotationPointZ = this.leftLeg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 13 + (((tickAnim - 0) / 5) * (7.75-(13)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 14) {
            xx = 7.75 + (((tickAnim - 5) / 9) * (-5-(7.75)));
            yy = 0 + (((tickAnim - 5) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 9) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 21) {
            xx = -5 + (((tickAnim - 14) / 7) * (8.5-(-5)));
            yy = 0 + (((tickAnim - 14) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 7) * (0-(0)));
        }
        else if (tickAnim >= 21 && tickAnim < 24) {
            xx = 8.5 + (((tickAnim - 21) / 3) * (27.75-(8.5)));
            yy = 0 + (((tickAnim - 21) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 21) / 3) * (0-(0)));
        }
        else if (tickAnim >= 24 && tickAnim < 28) {
            xx = 27.75 + (((tickAnim - 24) / 4) * (36.01-(27.75)));
            yy = 0 + (((tickAnim - 24) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 24) / 4) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 35) {
            xx = 36.01 + (((tickAnim - 28) / 7) * (13-(36.01)));
            yy = 0 + (((tickAnim - 28) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg3, leftLeg3.rotateAngleX + (float) Math.toRadians(xx), leftLeg3.rotateAngleY + (float) Math.toRadians(yy), leftLeg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = -0.725 + (((tickAnim - 0) / 5) * (-0.725-(-0.725)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 5) / 4) * (0-(0)));
            yy = -0.725 + (((tickAnim - 5) / 4) * (0.45-(-0.725)));
            zz = 0 + (((tickAnim - 5) / 4) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 9) / 5) * (0-(0)));
            yy = 0.45 + (((tickAnim - 9) / 5) * (0-(0.45)));
            zz = 0 + (((tickAnim - 9) / 5) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 21) {
            xx = 0 + (((tickAnim - 14) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 14) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 7) * (0-(0)));
        }
        else if (tickAnim >= 21 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 21) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 21) / 7) * (1.325-(0)));
            zz = 0 + (((tickAnim - 21) / 7) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 32) {
            xx = 0 + (((tickAnim - 28) / 4) * (0-(0)));
            yy = 1.325 + (((tickAnim - 28) / 4) * (1.8-(1.325)));
            zz = 0 + (((tickAnim - 28) / 4) * (0-(0)));
        }
        else if (tickAnim >= 32 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 32) / 3) * (0-(0)));
            yy = 1.8 + (((tickAnim - 32) / 3) * (-0.725-(1.8)));
            zz = 0 + (((tickAnim - 32) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftLeg3.rotationPointX = this.leftLeg3.rotationPointX + (float)(xx);
        this.leftLeg3.rotationPointY = this.leftLeg3.rotationPointY - (float)(yy);
        this.leftLeg3.rotationPointZ = this.leftLeg3.rotationPointZ + (float)(zz);



        this.setRotateAngle(tail, tail.rotateAngleX + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*206/0.5+50))*1.5), tail.rotateAngleY + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*206+50))*-2.5), tail.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*206+50))*1.5));


        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*206/0.5-50))*1.5), tail2.rotateAngleY + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*206-80))*-2), tail2.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*206-80))*1.5));


        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*206/0.5-100))*3), tail3.rotateAngleY + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*206-120))*-3), tail3.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*206-120))*2));


        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*206/0.5-150))*3.5), tail4.rotateAngleY + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*206-160))*-3.5), tail4.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*206-160))*2.5));


        this.setRotateAngle(tail5, tail5.rotateAngleX + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*206/0.5-200))*5), tail5.rotateAngleY + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*206-200))*-5), tail5.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*206-200))*4));


        this.setRotateAngle(tail6, tail6.rotateAngleX + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*206/0.5-250))*7), tail6.rotateAngleY + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*206-250))*-7), tail6.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*206-250))*4));


        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*206/0.5-120))*1.5), body.rotateAngleY + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*206))*2.5), body.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*206-150))*2.5));


        this.setRotateAngle(body2, body2.rotateAngleX + (float) Math.toRadians(2.25-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*206/0.5-180))*2), body2.rotateAngleY + (float) Math.toRadians(-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*206-100))*-1), body2.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*206-250))*1));



        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 13.5 + (((tickAnim - 0) / 6) * (-79.6214-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-50))*120-(13.5)));
            yy = 0 + (((tickAnim - 0) / 6) * (4.2554-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*10-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (-4.5616+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*10-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 11) {
            xx = -79.6214-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-50))*120 + (((tickAnim - 6) / 5) * (63.625-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+40))*100-(-79.6214-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-50))*120)));
            yy = 4.2554-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*10 + (((tickAnim - 6) / 5) * (0-(4.2554-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*10)));
            zz = -4.5616+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*10 + (((tickAnim - 6) / 5) * (0-(-4.5616+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*10)));
        }
        else if (tickAnim >= 11 && tickAnim < 35) {
            xx = 63.625-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+40))*100 + (((tickAnim - 11) / 24) * (13.5-(63.625-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+40))*100)));
            yy = 0 + (((tickAnim - 11) / 24) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 24) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm, leftArm.rotateAngleX + (float) Math.toRadians(xx), leftArm.rotateAngleY + (float) Math.toRadians(yy), leftArm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 20.75 + (((tickAnim - 0) / 6) * (-14-(20.75)));
            yy = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 11) {
            xx = -14 + (((tickAnim - 6) / 5) * (18.75-(-14)));
            yy = 0 + (((tickAnim - 6) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 5) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 15) {
            xx = 18.75 + (((tickAnim - 11) / 4) * (12.06-(18.75)));
            yy = 0 + (((tickAnim - 11) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 4) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = 12.06 + (((tickAnim - 15) / 20) * (20.75-(12.06)));
            yy = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm2, leftArm2.rotateAngleX + (float) Math.toRadians(xx), leftArm2.rotateAngleY + (float) Math.toRadians(yy), leftArm2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            yy = -1.375 + (((tickAnim - 0) / 6) * (0-(-1.375)));
            zz = 0 + (((tickAnim - 0) / 6) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 6) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 6) / 5) * (-1.375-(0)));
            zz = 0 + (((tickAnim - 6) / 5) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 11) / 4) * (0-(0)));
            yy = -1.375 + (((tickAnim - 11) / 4) * (-0.79-(-1.375)));
            zz = 0 + (((tickAnim - 11) / 4) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            yy = -0.79 + (((tickAnim - 15) / 20) * (-1.375-(-0.79)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftArm2.rotationPointX = this.leftArm2.rotationPointX + (float)(xx);
        this.leftArm2.rotationPointY = this.leftArm2.rotationPointY - (float)(yy);
        this.leftArm2.rotationPointZ = this.leftArm2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 6) {
            xx = -9.5 + (((tickAnim - 0) / 6) * (52-(-9.5)));
            yy = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 11) {
            xx = 52 + (((tickAnim - 6) / 5) * (10-(52)));
            yy = 0 + (((tickAnim - 6) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 5) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 15) {
            xx = 10 + (((tickAnim - 11) / 4) * (8.25-(10)));
            yy = 0 + (((tickAnim - 11) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 4) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 27) {
            xx = 8.25 + (((tickAnim - 15) / 12) * (-13.75-(8.25)));
            yy = 0 + (((tickAnim - 15) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 12) * (0-(0)));
        }
        else if (tickAnim >= 27 && tickAnim < 35) {
            xx = -13.75 + (((tickAnim - 27) / 8) * (-9.5-(-13.75)));
            yy = 0 + (((tickAnim - 27) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 27) / 8) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm3, leftArm3.rotateAngleX + (float) Math.toRadians(xx), leftArm3.rotateAngleY + (float) Math.toRadians(yy), leftArm3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = -0.7 + (((tickAnim - 0) / 3) * (0.74-(-0.7)));
            zz = 0 + (((tickAnim - 0) / 3) * (-0.37-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 3) / 3) * (0-(0)));
            yy = 0.74 + (((tickAnim - 3) / 3) * (0.675-(0.74)));
            zz = -0.37 + (((tickAnim - 3) / 3) * (-0.875-(-0.37)));
        }
        else if (tickAnim >= 6 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 6) / 5) * (0-(0)));
            yy = 0.675 + (((tickAnim - 6) / 5) * (0.275-(0.675)));
            zz = -0.875 + (((tickAnim - 6) / 5) * (-0.175-(-0.875)));
        }
        else if (tickAnim >= 11 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 11) / 4) * (0-(0)));
            yy = 0.275 + (((tickAnim - 11) / 4) * (0.575-(0.275)));
            zz = -0.175 + (((tickAnim - 11) / 4) * (0-(-0.175)));
        }
        else if (tickAnim >= 15 && tickAnim < 27) {
            xx = 0 + (((tickAnim - 15) / 12) * (0-(0)));
            yy = 0.575 + (((tickAnim - 15) / 12) * (1.46-(0.575)));
            zz = 0 + (((tickAnim - 15) / 12) * (0-(0)));
        }
        else if (tickAnim >= 27 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 27) / 8) * (0-(0)));
            yy = 1.46 + (((tickAnim - 27) / 8) * (-0.7-(1.46)));
            zz = 0 + (((tickAnim - 27) / 8) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftArm3.rotationPointX = this.leftArm3.rotationPointX + (float)(xx);
        this.leftArm3.rotationPointY = this.leftArm3.rotationPointY - (float)(yy);
        this.leftArm3.rotationPointZ = this.leftArm3.rotationPointZ + (float)(zz);



        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*206/0.5-50))*-1.5), neck.rotateAngleY + (float) Math.toRadians(-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*206-100))*0.5), neck.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*206-250))*-2));

        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 3) * (0.2+Math.sin((Math.PI/180)*(((double)tickAnim/20)*206/0.5-100))*-0.5-(0)));
            zz = 0 + (((tickAnim - 10) / 3) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 17) {
            xx = 0 + (((tickAnim - 13) / 4) * (0-(0)));
            yy = 0.2+Math.sin((Math.PI/180)*(((double)tickAnim/20)*206/0.5-100))*-0.5 + (((tickAnim - 13) / 4) * (0-(0.2+Math.sin((Math.PI/180)*(((double)tickAnim/20)*206/0.5-100))*-0.5)));
            zz = 0 + (((tickAnim - 13) / 4) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 17) / 11) * (0-(0)));
            yy = 0 + (((tickAnim - 17) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 17) / 11) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 31) {
            xx = 0 + (((tickAnim - 28) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 28) / 3) * (0.05+Math.sin((Math.PI/180)*(((double)tickAnim/20)*206/0.5-100))*-0.5-(0)));
            zz = 0 + (((tickAnim - 28) / 3) * (0-(0)));
        }
        else if (tickAnim >= 31 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 31) / 4) * (0-(0)));
            yy = 0.05+Math.sin((Math.PI/180)*(((double)tickAnim/20)*206/0.5-100))*-0.5 + (((tickAnim - 31) / 4) * (0-(0.05+Math.sin((Math.PI/180)*(((double)tickAnim/20)*206/0.5-100))*-0.5)));
            zz = 0 + (((tickAnim - 31) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.neck.rotationPointX = this.neck.rotationPointX + (float)(xx);
        this.neck.rotationPointY = this.neck.rotationPointY - (float)(yy);
        this.neck.rotationPointZ = this.neck.rotationPointZ + (float)(zz);



        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(4.5-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*206/0.5-150))*-2), neck2.rotateAngleY + (float) Math.toRadians(0), neck2.rotateAngleZ + (float) Math.toRadians(0));

        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 3) * (0.8+Math.sin((Math.PI/180)*(((double)tickAnim/20)*206/0.5-170))*-0.8-(0)));
            zz = 0 + (((tickAnim - 10) / 3) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 17) {
            xx = 0 + (((tickAnim - 13) / 4) * (0-(0)));
            yy = 0.8+Math.sin((Math.PI/180)*(((double)tickAnim/20)*206/0.5-170))*-0.8 + (((tickAnim - 13) / 4) * (0-(0.8+Math.sin((Math.PI/180)*(((double)tickAnim/20)*206/0.5-170))*-0.8)));
            zz = 0 + (((tickAnim - 13) / 4) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 17) / 11) * (0-(0)));
            yy = 0 + (((tickAnim - 17) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 17) / 11) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 31) {
            xx = 0 + (((tickAnim - 28) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 28) / 3) * (0.775+Math.sin((Math.PI/180)*(((double)tickAnim/20)*206/0.5-190))*-0.8-(0)));
            zz = 0 + (((tickAnim - 28) / 3) * (0-(0)));
        }
        else if (tickAnim >= 31 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 31) / 4) * (0-(0)));
            yy = 0.775+Math.sin((Math.PI/180)*(((double)tickAnim/20)*206/0.5-190))*-0.8 + (((tickAnim - 31) / 4) * (0-(0.775+Math.sin((Math.PI/180)*(((double)tickAnim/20)*206/0.5-190))*-0.8)));
            zz = 0 + (((tickAnim - 31) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.neck2.rotationPointX = this.neck2.rotationPointX + (float)(xx);
        this.neck2.rotationPointY = this.neck2.rotationPointY - (float)(yy);
        this.neck2.rotationPointZ = this.neck2.rotationPointZ + (float)(zz);



        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(4.25-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*206/0.5-200))*-2), neck3.rotateAngleY + (float) Math.toRadians(-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*206-100))*-1), neck3.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(neck4, neck4.rotateAngleX + (float) Math.toRadians(3.25-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*206/0.5-250))*-2), neck4.rotateAngleY + (float) Math.toRadians(0), neck4.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(neck5, neck5.rotateAngleX + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*206/0.5-350))*-2), neck5.rotateAngleY + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*206-250))*-0.5), neck5.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*206-150))*-1));


        this.setRotateAngle(neck6, neck6.rotateAngleX + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*206/0.5-400))*-2), neck6.rotateAngleY + (float) Math.toRadians(0), neck6.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(-6.75-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*206/0.5-500))*-2), head.rotateAngleY + (float) Math.toRadians(0), head.rotateAngleZ + (float) Math.toRadians(0));



        if (tickAnim >= 0 && tickAnim < 17) {
            xx = 99.9-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+80))*120 + (((tickAnim - 0) / 17) * (13.75-(99.9-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+80))*120)));
            yy = 0 + (((tickAnim - 0) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 17) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 23) {
            xx = 13.75 + (((tickAnim - 17) / 6) * (40.7286-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-20))*80-(13.75)));
            yy = 0 + (((tickAnim - 17) / 6) * (-27.4054-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-30-(0)));
            zz = 0 + (((tickAnim - 17) / 6) * (27.1366+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-30-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 28) {
            xx = 40.7286-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-20))*80 + (((tickAnim - 23) / 5) * (-26.625-(40.7286-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-20))*80)));
            yy = -27.4054-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-30 + (((tickAnim - 23) / 5) * (0-(-27.4054-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-30)));
            zz = 27.1366+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-30 + (((tickAnim - 23) / 5) * (0-(27.1366+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-30)));
        }
        else if (tickAnim >= 28 && tickAnim < 35) {
            xx = -26.625 + (((tickAnim - 28) / 7) * (-18.35-(-26.625)));
            yy = 0 + (((tickAnim - 28) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm, rightArm.rotateAngleX + (float) Math.toRadians(xx), rightArm.rotateAngleY + (float) Math.toRadians(yy), rightArm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 13.5 + (((tickAnim - 0) / 3) * (12.81-(13.5)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 17) {
            xx = 12.81 + (((tickAnim - 3) / 14) * (16.25-(12.81)));
            yy = 0 + (((tickAnim - 3) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 14) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 23) {
            xx = 16.25 + (((tickAnim - 17) / 6) * (-12.225-(16.25)));
            yy = 0 + (((tickAnim - 17) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 17) / 6) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 28) {
            xx = -12.225 + (((tickAnim - 23) / 5) * (12.25-(-12.225)));
            yy = 0 + (((tickAnim - 23) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 5) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 33) {
            xx = 12.25 + (((tickAnim - 28) / 5) * (11.88-(12.25)));
            yy = 0 + (((tickAnim - 28) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 5) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 35) {
            xx = 11.88 + (((tickAnim - 33) / 2) * (13.5-(11.88)));
            yy = 0 + (((tickAnim - 33) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm2, rightArm2.rotateAngleX + (float) Math.toRadians(xx), rightArm2.rotateAngleY + (float) Math.toRadians(yy), rightArm2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 17) {
            xx = 0 + (((tickAnim - 0) / 17) * (0-(0)));
            yy = -0.1 + (((tickAnim - 0) / 17) * (0-(-0.1)));
            zz = 0 + (((tickAnim - 0) / 17) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 17) / 11) * (0-(0)));
            yy = 0 + (((tickAnim - 17) / 11) * (-1.035-(0)));
            zz = 0 + (((tickAnim - 17) / 11) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 28) / 7) * (0-(0)));
            yy = -1.035 + (((tickAnim - 28) / 7) * (-0.1-(-1.035)));
            zz = 0 + (((tickAnim - 28) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightArm2.rotationPointX = this.rightArm2.rotationPointX + (float)(xx);
        this.rightArm2.rotationPointY = this.rightArm2.rotationPointY - (float)(yy);
        this.rightArm2.rotationPointZ = this.rightArm2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 9) {
            xx = 1.75 + (((tickAnim - 0) / 9) * (-11.69-(1.75)));
            yy = 0 + (((tickAnim - 0) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 9) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 17) {
            xx = -11.69 + (((tickAnim - 9) / 8) * (0-(-11.69)));
            yy = 0 + (((tickAnim - 9) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 8) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 17) / 3) * (41.25-(0)));
            yy = 0 + (((tickAnim - 17) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 17) / 3) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 23) {
            xx = 41.25 + (((tickAnim - 20) / 3) * (52-(41.25)));
            yy = 0 + (((tickAnim - 20) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 3) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 28) {
            xx = 52 + (((tickAnim - 23) / 5) * (14.25-(52)));
            yy = 0 + (((tickAnim - 23) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 5) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 35) {
            xx = 14.25 + (((tickAnim - 28) / 7) * (1.75-(14.25)));
            yy = 0 + (((tickAnim - 28) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm3, rightArm3.rotateAngleX + (float) Math.toRadians(xx), rightArm3.rotateAngleY + (float) Math.toRadians(yy), rightArm3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 0) / 9) * (0-(0)));
            yy = 0.1 + (((tickAnim - 0) / 9) * (0.33-(0.1)));
            zz = -0.125 + (((tickAnim - 0) / 9) * (0-(-0.125)));
        }
        else if (tickAnim >= 9 && tickAnim < 17) {
            xx = 0 + (((tickAnim - 9) / 8) * (0-(0)));
            yy = 0.33 + (((tickAnim - 9) / 8) * (-0.7-(0.33)));
            zz = 0 + (((tickAnim - 9) / 8) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 17) / 6) * (0-(0)));
            yy = -0.7 + (((tickAnim - 17) / 6) * (0.675-(-0.7)));
            zz = 0 + (((tickAnim - 17) / 6) * (-0.875-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 23) / 5) * (0-(0)));
            yy = 0.675 + (((tickAnim - 23) / 5) * (-0.4-(0.675)));
            zz = -0.875 + (((tickAnim - 23) / 5) * (0-(-0.875)));
        }
        else if (tickAnim >= 28 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 28) / 7) * (0-(0)));
            yy = -0.4 + (((tickAnim - 28) / 7) * (0.1-(-0.4)));
            zz = 0 + (((tickAnim - 28) / 7) * (-0.125-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightArm3.rotationPointX = this.rightArm3.rotationPointX + (float)(xx);
        this.rightArm3.rotationPointY = this.rightArm3.rotationPointY - (float)(yy);
        this.rightArm3.rotationPointZ = this.rightArm3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 14.5 + (((tickAnim - 0) / 5) * (20.225-(14.5)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 13) {
            xx = 20.225 + (((tickAnim - 5) / 8) * (-6.588-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-40))*60-(20.225)));
            yy = 0 + (((tickAnim - 5) / 8) * (2.3623-(0)));
            zz = 0 + (((tickAnim - 5) / 8) * (1.5552-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 19) {
            xx = -6.588-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-40))*60 + (((tickAnim - 13) / 6) * (-4.775-(-6.588-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-40))*60)));
            yy = 2.3623 + (((tickAnim - 13) / 6) * (0-(2.3623)));
            zz = 1.5552 + (((tickAnim - 13) / 6) * (0-(1.5552)));
        }
        else if (tickAnim >= 19 && tickAnim < 35) {
            xx = -4.775 + (((tickAnim - 19) / 16) * (14.5-(-4.775)));
            yy = 0 + (((tickAnim - 19) / 16) * (0-(0)));
            zz = 0 + (((tickAnim - 19) / 16) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg, rightLeg.rotateAngleX + (float) Math.toRadians(xx), rightLeg.rotateAngleY + (float) Math.toRadians(yy), rightLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = -3 + (((tickAnim - 0) / 5) * (5-(-3)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 5 + (((tickAnim - 5) / 3) * (21.19-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-40))*-20-(5)));
            yy = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 3) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = 21.19-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-40))*-20 + (((tickAnim - 8) / 5) * (7.625-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-40))*90-(21.19-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-40))*-20)));
            yy = 0 + (((tickAnim - 8) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 5) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 19) {
            xx = 7.625-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-40))*90 + (((tickAnim - 13) / 6) * (-8.25-(7.625-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-40))*90)));
            yy = 0 + (((tickAnim - 13) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 6) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 35) {
            xx = -8.25 + (((tickAnim - 19) / 16) * (-3-(-8.25)));
            yy = 0 + (((tickAnim - 19) / 16) * (0-(0)));
            zz = 0 + (((tickAnim - 19) / 16) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg2, rightLeg2.rotateAngleX + (float) Math.toRadians(xx), rightLeg2.rotateAngleY + (float) Math.toRadians(yy), rightLeg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 5 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 5) / 3) * (0.75-(0)));
            zz = 0 + (((tickAnim - 5) / 3) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 8) / 5) * (0-(0)));
            yy = 0.75 + (((tickAnim - 8) / 5) * (2.7-(0.75)));
            zz = 0 + (((tickAnim - 8) / 5) * (-1.025-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 13) / 6) * (0-(0)));
            yy = 2.7 + (((tickAnim - 13) / 6) * (0-(2.7)));
            zz = -1.025 + (((tickAnim - 13) / 6) * (0-(-1.025)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightLeg2.rotationPointX = this.rightLeg2.rotationPointX + (float)(xx);
        this.rightLeg2.rotationPointY = this.rightLeg2.rotationPointY - (float)(yy);
        this.rightLeg2.rotationPointZ = this.rightLeg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 1 + (((tickAnim - 0) / 5) * (8.5-(1)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 8.5 + (((tickAnim - 5) / 3) * (27.75-(8.5)));
            yy = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 3) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = 27.75 + (((tickAnim - 8) / 5) * (36.01-(27.75)));
            yy = 0 + (((tickAnim - 8) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 5) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 19) {
            xx = 36.01 + (((tickAnim - 13) / 6) * (13-(36.01)));
            yy = 0 + (((tickAnim - 13) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 6) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 27) {
            xx = 13 + (((tickAnim - 19) / 8) * (2.82-(13)));
            yy = 0 + (((tickAnim - 19) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 19) / 8) * (0-(0)));
        }
        else if (tickAnim >= 27 && tickAnim < 35) {
            xx = 2.82 + (((tickAnim - 27) / 8) * (1-(2.82)));
            yy = 0 + (((tickAnim - 27) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 27) / 8) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg3, rightLeg3.rotateAngleX + (float) Math.toRadians(xx), rightLeg3.rotateAngleY + (float) Math.toRadians(yy), rightLeg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = -0.225 + (((tickAnim - 0) / 5) * (0-(-0.225)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 5) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 5) / 8) * (0.975-(0)));
            zz = 0 + (((tickAnim - 5) / 8) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 13) / 6) * (0-(0)));
            yy = 0.975 + (((tickAnim - 13) / 6) * (-0.675-(0.975)));
            zz = 0 + (((tickAnim - 13) / 6) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 27) {
            xx = 0 + (((tickAnim - 19) / 8) * (0-(0)));
            yy = -0.675 + (((tickAnim - 19) / 8) * (1.485-(-0.675)));
            zz = 0 + (((tickAnim - 19) / 8) * (0-(0)));
        }
        else if (tickAnim >= 27 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 27) / 8) * (0-(0)));
            yy = 1.485 + (((tickAnim - 27) / 8) * (-0.225-(1.485)));
            zz = 0 + (((tickAnim - 27) / 8) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightLeg3.rotationPointX = this.rightLeg3.rotationPointX + (float)(xx);
        this.rightLeg3.rotationPointY = this.rightLeg3.rotationPointY - (float)(yy);
        this.rightLeg3.rotationPointZ = this.rightLeg3.rotationPointZ + (float)(zz);

    }
        public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        EntityPrehistoricFloraPhuwiangosaurus e = (EntityPrehistoricFloraPhuwiangosaurus) entity;
        animator.update(entity);

        animator.setAnimation(e.HURT_ANIMATION); //30 ticks
        animator.startKeyframe(8);
        animator.rotate(this.head, (float) Math.toRadians(25), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.jaw, (float) Math.toRadians(-30), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(12);
        animator.resetKeyframe(10);

    }
}
