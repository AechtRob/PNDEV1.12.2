package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.EntityPrehistoricFloraAragosaurus;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;

public class ModelAragosaurus extends ModelBasePalaeopedia {
    private final AdvancedModelRenderer main;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer leftLeg;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer leftLeg2;
    private final AdvancedModelRenderer leftLeg3;
    private final AdvancedModelRenderer leftLeg4;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer rightLeg;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer rightLeg2;
    private final AdvancedModelRenderer rightLeg3;
    private final AdvancedModelRenderer rightLeg4;
    private final AdvancedModelRenderer cube_r6;
    private final AdvancedModelRenderer tail;
    private final AdvancedModelRenderer cube_r7;
    private final AdvancedModelRenderer tail2;
    private final AdvancedModelRenderer cube_r8;
    private final AdvancedModelRenderer tail3;
    private final AdvancedModelRenderer tail4;
    private final AdvancedModelRenderer tail5;
    private final AdvancedModelRenderer tail6;
    private final AdvancedModelRenderer tail7;
    private final AdvancedModelRenderer tail8;
    private final AdvancedModelRenderer body;
    private final AdvancedModelRenderer cube_r9;
    private final AdvancedModelRenderer cube_r10;
    private final AdvancedModelRenderer body2;
    private final AdvancedModelRenderer cube_r11;
    private final AdvancedModelRenderer leftArm;
    private final AdvancedModelRenderer cube_r12;
    private final AdvancedModelRenderer leftArm2;
    private final AdvancedModelRenderer leftArm3;
    private final AdvancedModelRenderer cube_r13;
    private final AdvancedModelRenderer rightArm;
    private final AdvancedModelRenderer cube_r14;
    private final AdvancedModelRenderer rightArm2;
    private final AdvancedModelRenderer rightArm3;
    private final AdvancedModelRenderer cube_r15;
    private final AdvancedModelRenderer neck;
    private final AdvancedModelRenderer neck2;
    private final AdvancedModelRenderer neck3;
    private final AdvancedModelRenderer neck4;
    private final AdvancedModelRenderer neck5;
    private final AdvancedModelRenderer neck6;
    private final AdvancedModelRenderer head;
    private final AdvancedModelRenderer cube_r16;
    private final AdvancedModelRenderer cube_r17;
    private final AdvancedModelRenderer cube_r18;
    private final AdvancedModelRenderer cube_r19;
    private final AdvancedModelRenderer cube_r20;
    private final AdvancedModelRenderer cube_r21;
    private final AdvancedModelRenderer cube_r22;
    private final AdvancedModelRenderer cube_r23;
    private final AdvancedModelRenderer cube_r24;
    private final AdvancedModelRenderer cube_r25;
    private final AdvancedModelRenderer cube_r26;
    private final AdvancedModelRenderer cube_r27;
    private final AdvancedModelRenderer cube_r28;
    private final AdvancedModelRenderer cube_r29;
    private final AdvancedModelRenderer eyes;
    private final AdvancedModelRenderer jaw;
    private final AdvancedModelRenderer cube_r30;
    private final AdvancedModelRenderer cube_r31;
    private final AdvancedModelRenderer cube_r32;
    private final AdvancedModelRenderer cube_r33;
    private final AdvancedModelRenderer cube_r34;
    private final AdvancedModelRenderer cube_r35;
    private final AdvancedModelRenderer cube_r36;
    private final AdvancedModelRenderer cube_r37;
    private final AdvancedModelRenderer cube_r38;
    private final AdvancedModelRenderer cube_r39;

    private ModelAnimator animator;

    public ModelAragosaurus() {
        this.textureWidth = 298;
        this.textureHeight = 298;

        this.main = new AdvancedModelRenderer(this);
        this.main.setRotationPoint(0.0F, -31.0F, 22.0F);
        this.setRotateAngle(main, -0.3491F, 0.0F, 0.0F);
        this.main.cubeList.add(new ModelBox(main, 0, 71, -13.0F, -11.0F, -14.0F, 26, 33, 33, 0.0F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(0.0F, -17.349F, -4.0076F);
        this.main.addChild(cube_r1);
        this.setRotateAngle(cube_r1, -0.0873F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 215, 177, -10.0F, 0.0F, 0.0F, 20, 7, 21, 0.0F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(0.0F, -17.349F, -4.0076F);
        this.main.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.1309F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 206, 43, -10.0F, 0.0F, -13.0F, 20, 7, 13, 0.01F, false));

        this.leftLeg = new AdvancedModelRenderer(this);
        this.leftLeg.setRotationPoint(11.5F, 0.0F, 0.0F);
        this.main.addChild(leftLeg);
        this.setRotateAngle(leftLeg, 0.1309F, 0.0F, 0.0F);


        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(7.5F, 30.0F, 0.0F);
        this.leftLeg.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.0F, 0.0F, -0.0873F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 154, 177, -13.0F, -38.0F, -6.0F, 13, 38, 17, 0.0F, false));

        this.leftLeg2 = new AdvancedModelRenderer(this);
        this.leftLeg2.setRotationPoint(0.0F, 29.0F, 0.0F);
        this.leftLeg.addChild(leftLeg2);
        this.setRotateAngle(leftLeg2, 0.5236F, 0.0F, 0.0F);
        this.leftLeg2.cubeList.add(new ModelBox(leftLeg2, 230, 97, -4.5F, -2.0F, -5.0F, 11, 25, 12, 0.0F, false));

        this.leftLeg3 = new AdvancedModelRenderer(this);
        this.leftLeg3.setRotationPoint(0.0F, 21.975F, 5.0F);
        this.leftLeg2.addChild(leftLeg3);
        this.setRotateAngle(leftLeg3, -0.3054F, 0.0F, 0.0F);
        this.leftLeg3.cubeList.add(new ModelBox(leftLeg3, 236, 135, -5.5F, -0.7786F, -11.2699F, 13, 8, 14, 0.0F, false));

        this.leftLeg4 = new AdvancedModelRenderer(this);
        this.leftLeg4.setRotationPoint(0.0F, 0.2214F, -11.2699F);
        this.leftLeg3.addChild(leftLeg4);


        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(-0.5F, -1.0F, 0.0F);
        this.leftLeg4.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.0F, -0.3054F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 232, 268, -4.0F, 1.0F, -3.0F, 11, 7, 5, -0.01F, false));

        this.rightLeg = new AdvancedModelRenderer(this);
        this.rightLeg.setRotationPoint(-11.5F, 0.0F, 0.0F);
        this.main.addChild(rightLeg);
        this.setRotateAngle(rightLeg, 0.1309F, 0.0F, 0.0F);


        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(-7.5F, 30.0F, 0.0F);
        this.rightLeg.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.0F, 0.0F, 0.0873F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 154, 177, 0.0F, -38.0F, -6.0F, 13, 38, 17, 0.0F, true));

        this.rightLeg2 = new AdvancedModelRenderer(this);
        this.rightLeg2.setRotationPoint(0.0F, 29.0F, 0.0F);
        this.rightLeg.addChild(rightLeg2);
        this.setRotateAngle(rightLeg2, 0.5236F, 0.0F, 0.0F);
        this.rightLeg2.cubeList.add(new ModelBox(rightLeg2, 230, 97, -6.5F, -2.0F, -5.0F, 11, 25, 12, 0.0F, true));

        this.rightLeg3 = new AdvancedModelRenderer(this);
        this.rightLeg3.setRotationPoint(0.0F, 21.975F, 5.0F);
        this.rightLeg2.addChild(rightLeg3);
        this.setRotateAngle(rightLeg3, -0.3054F, 0.0F, 0.0F);
        this.rightLeg3.cubeList.add(new ModelBox(rightLeg3, 236, 135, -7.5F, -0.7786F, -11.2699F, 13, 8, 14, 0.0F, true));

        this.rightLeg4 = new AdvancedModelRenderer(this);
        this.rightLeg4.setRotationPoint(0.0F, 0.2214F, -11.2699F);
        this.rightLeg3.addChild(rightLeg4);


        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(0.5F, -1.0F, 0.0F);
        this.rightLeg4.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.0F, 0.3054F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 232, 268, -7.0F, 1.0F, -3.0F, 11, 7, 5, -0.01F, true));

        this.tail = new AdvancedModelRenderer(this);
        this.tail.setRotationPoint(0.0F, -4.0F, 17.0F);
        this.main.addChild(tail);
        this.setRotateAngle(tail, 0.1309F, 0.0F, 0.0F);
        this.tail.cubeList.add(new ModelBox(tail, 77, 177, -8.5F, -7.0F, -1.0F, 17, 21, 20, 0.0F, false));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(0.0F, -11.0F, 2.0F);
        this.tail.addChild(cube_r7);
        this.setRotateAngle(cube_r7, -0.1309F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 137, 43, -6.5F, 0.0F, -3.0F, 13, 5, 20, 0.0F, false));

        this.tail2 = new AdvancedModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, 1.0F, 17.0F);
        this.tail.addChild(tail2);
        this.setRotateAngle(tail2, 0.0436F, 0.0F, 0.0F);
        this.tail2.cubeList.add(new ModelBox(tail2, 215, 206, -5.5F, -7.75F, -1.0F, 11, 16, 20, 0.0F, false));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(0.0F, -9.5F, 1.0F);
        this.tail2.addChild(cube_r8);
        this.setRotateAngle(cube_r8, -0.1047F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 234, 0, -3.5F, 0.0F, -3.0F, 7, 2, 20, 0.0F, false));

        this.tail3 = new AdvancedModelRenderer(this);
        this.tail3.setRotationPoint(0.0F, -1.0F, 17.0F);
        this.tail2.addChild(tail3);
        this.setRotateAngle(tail3, 0.0436F, 0.0F, 0.0F);
        this.tail3.cubeList.add(new ModelBox(tail3, 230, 64, -3.5F, -6.5F, -1.0F, 7, 13, 19, 0.0F, false));

        this.tail4 = new AdvancedModelRenderer(this);
        this.tail4.setRotationPoint(0.0F, -1.0F, 17.0F);
        this.tail3.addChild(tail4);
        this.setRotateAngle(tail4, 0.0873F, 0.0F, 0.0F);
        this.tail4.cubeList.add(new ModelBox(tail4, 185, 243, -2.5F, -5.25F, -1.0F, 5, 9, 18, 0.0F, false));

        this.tail5 = new AdvancedModelRenderer(this);
        this.tail5.setRotationPoint(0.0F, -2.0F, 16.0F);
        this.tail4.addChild(tail5);
        this.setRotateAngle(tail5, 0.1745F, 0.0F, 0.0F);
        this.tail5.cubeList.add(new ModelBox(tail5, 232, 243, -2.0F, -3.25F, -1.0F, 4, 6, 18, 0.0F, false));

        this.tail6 = new AdvancedModelRenderer(this);
        this.tail6.setRotationPoint(0.0F, -0.5F, 16.0F);
        this.tail5.addChild(tail6);
        this.setRotateAngle(tail6, -0.1309F, 0.0F, 0.0F);
        this.tail6.cubeList.add(new ModelBox(tail6, 41, 256, -1.5F, -2.5F, -1.0F, 3, 4, 17, 0.0F, false));

        this.tail7 = new AdvancedModelRenderer(this);
        this.tail7.setRotationPoint(0.0F, -0.25F, 15.5F);
        this.tail6.addChild(tail7);
        this.setRotateAngle(tail7, -0.2618F, 0.0F, 0.0F);
        this.tail7.cubeList.add(new ModelBox(tail7, 234, 23, -1.0F, -2.0F, -0.5F, 2, 3, 16, 0.0F, false));

        this.tail8 = new AdvancedModelRenderer(this);
        this.tail8.setRotationPoint(0.0F, -0.75F, 14.5F);
        this.tail7.addChild(tail8);
        this.setRotateAngle(tail8, -0.1309F, 0.0F, 0.0F);
        this.tail8.cubeList.add(new ModelBox(tail8, 117, 264, -0.5F, -1.0F, -1.0F, 1, 2, 17, 0.0F, false));

        this.body = new AdvancedModelRenderer(this);
        this.body.setRotationPoint(0.0F, -3.0F, -12.0F);
        this.main.addChild(body);
        this.setRotateAngle(body, 0.3054F, 0.0F, 0.0F);


        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(0.0F, -20.0F, -19.0F);
        this.body.addChild(cube_r9);
        this.setRotateAngle(cube_r9, -0.2967F, 0.0F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 119, 135, -15.0F, 0.0F, -4.0F, 30, 13, 28, 0.0F, false));

        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(0.0F, 3.0F, -14.0F);
        this.body.addChild(cube_r10);
        this.setRotateAngle(cube_r10, -0.1309F, 0.0F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 0, 0, -19.0F, -13.25F, -14.0F, 38, 40, 30, 0.0F, false));

        this.body2 = new AdvancedModelRenderer(this);
        this.body2.setRotationPoint(0.0F, -8.0F, -26.0F);
        this.body.addChild(body2);
        this.setRotateAngle(body2, -0.1745F, 0.0F, 0.0F);
        this.body2.cubeList.add(new ModelBox(body2, 119, 71, -14.0F, -3.0F, -21.0F, 28, 36, 27, 0.0F, false));

        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(0.0F, -18.0F, -18.0F);
        this.body2.addChild(cube_r11);
        this.setRotateAngle(cube_r11, -0.2531F, 0.0F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 137, 0, -12.0F, 0.0F, 2.0F, 24, 18, 24, 0.0F, false));

        this.leftArm = new AdvancedModelRenderer(this);
        this.leftArm.setRotationPoint(13.0F, 29.0F, -7.0F);
        this.body2.addChild(leftArm);
        this.setRotateAngle(leftArm, 0.4363F, 0.0F, 0.0436F);


        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(5.0F, 20.0F, -1.0F);
        this.leftArm.addChild(cube_r12);
        this.setRotateAngle(cube_r12, 0.0F, 0.0F, -0.0873F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 77, 138, -10.0F, -27.0F, -4.0F, 10, 27, 10, 0.0F, false));

        this.leftArm2 = new AdvancedModelRenderer(this);
        this.leftArm2.setRotationPoint(0.0F, 19.0F, 0.0F);
        this.leftArm.addChild(leftArm2);
        this.setRotateAngle(leftArm2, -0.4363F, 0.0F, 0.0F);
        this.leftArm2.cubeList.add(new ModelBox(leftArm2, 82, 256, -4.0F, -1.0F, -4.5F, 8, 18, 9, 0.0F, false));

        this.leftArm3 = new AdvancedModelRenderer(this);
        this.leftArm3.setRotationPoint(0.0F, 16.0F, 0.0F);
        this.leftArm2.addChild(leftArm3);
        this.setRotateAngle(leftArm3, 0.2182F, 0.0F, -0.0436F);
        this.leftArm3.cubeList.add(new ModelBox(leftArm3, 236, 158, -5.0F, -1.0F, -3.5F, 10, 11, 7, 0.0F, false));

        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(-5.0F, 6.0F, -1.5F);
        this.leftArm3.addChild(cube_r13);
        this.setRotateAngle(cube_r13, 0.0F, 0.3927F, -0.3927F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 134, 228, -5.0F, 0.0F, 0.0F, 5, 2, 2, 0.0F, false));

        this.rightArm = new AdvancedModelRenderer(this);
        this.rightArm.setRotationPoint(-13.0F, 29.0F, -7.0F);
        this.body2.addChild(rightArm);
        this.setRotateAngle(rightArm, 0.4363F, 0.0F, -0.0436F);


        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(-5.0F, 20.0F, -1.0F);
        this.rightArm.addChild(cube_r14);
        this.setRotateAngle(cube_r14, 0.0F, 0.0F, 0.0873F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 77, 138, 0.0F, -27.0F, -4.0F, 10, 27, 10, 0.0F, true));

        this.rightArm2 = new AdvancedModelRenderer(this);
        this.rightArm2.setRotationPoint(0.0F, 19.0F, 0.0F);
        this.rightArm.addChild(rightArm2);
        this.setRotateAngle(rightArm2, -0.4363F, 0.0F, 0.0F);
        this.rightArm2.cubeList.add(new ModelBox(rightArm2, 82, 256, -4.0F, -1.0F, -4.5F, 8, 18, 9, 0.0F, true));

        this.rightArm3 = new AdvancedModelRenderer(this);
        this.rightArm3.setRotationPoint(0.0F, 16.0F, 0.0F);
        this.rightArm2.addChild(rightArm3);
        this.setRotateAngle(rightArm3, 0.2182F, 0.0F, 0.0436F);
        this.rightArm3.cubeList.add(new ModelBox(rightArm3, 236, 158, -5.0F, -1.0F, -3.5F, 10, 11, 7, 0.0F, true));

        this.cube_r15 = new AdvancedModelRenderer(this);
        this.cube_r15.setRotationPoint(5.0F, 6.0F, -1.5F);
        this.rightArm3.addChild(cube_r15);
        this.setRotateAngle(cube_r15, 0.0F, -0.3927F, 0.3927F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 134, 228, 0.0F, 0.0F, 0.0F, 5, 2, 2, 0.0F, true));

        this.neck = new AdvancedModelRenderer(this);
        this.neck.setRotationPoint(0.0F, -3.0F, -16.0F);
        this.body2.addChild(neck);
        this.setRotateAngle(neck, -0.4363F, 0.0F, 0.0F);
        this.neck.cubeList.add(new ModelBox(neck, 0, 138, -10.0F, -13.0F, -14.0F, 20, 24, 18, 0.0F, false));

        this.neck2 = new AdvancedModelRenderer(this);
        this.neck2.setRotationPoint(0.0F, -2.0F, -12.0F);
        this.neck.addChild(neck2);
        this.setRotateAngle(neck2, -0.1745F, 0.0F, 0.0F);
        this.neck2.cubeList.add(new ModelBox(neck2, 0, 181, -8.5F, -10.75F, -16.0F, 17, 21, 18, 0.0F, false));

        this.neck3 = new AdvancedModelRenderer(this);
        this.neck3.setRotationPoint(0.0F, -1.0F, -15.0F);
        this.neck2.addChild(neck3);
        this.neck3.cubeList.add(new ModelBox(neck3, 71, 219, -7.0F, -9.5F, -15.0F, 14, 19, 17, 0.0F, false));

        this.neck4 = new AdvancedModelRenderer(this);
        this.neck4.setRotationPoint(0.0F, -0.75F, -13.0F);
        this.neck3.addChild(neck4);
        this.setRotateAngle(neck4, 0.0436F, 0.0F, 0.0F);
        this.neck4.cubeList.add(new ModelBox(neck4, 0, 221, -5.5F, -8.5F, -15.0F, 11, 16, 17, 0.0F, false));

        this.neck5 = new AdvancedModelRenderer(this);
        this.neck5.setRotationPoint(0.0F, -0.75F, -13.5F);
        this.neck4.addChild(neck5);
        this.setRotateAngle(neck5, 0.2618F, 0.0F, 0.0F);
        this.neck5.cubeList.add(new ModelBox(neck5, 134, 233, -4.5F, -7.5F, -14.5F, 9, 14, 16, 0.0F, false));

        this.neck6 = new AdvancedModelRenderer(this);
        this.neck6.setRotationPoint(0.0F, -2.0F, -13.0F);
        this.neck5.addChild(neck6);
        this.setRotateAngle(neck6, 0.4363F, 0.0F, 0.0F);
        this.neck6.cubeList.add(new ModelBox(neck6, 0, 255, -3.5F, -5.25F, -11.5F, 7, 13, 13, 0.0F, false));

        this.head = new AdvancedModelRenderer(this);
        this.head.setRotationPoint(0.0F, 0.0F, -11.0F);
        this.neck6.addChild(head);
        this.setRotateAngle(head, 0.2182F, 0.0F, 0.0F);
        this.head.cubeList.add(new ModelBox(head, 154, 264, -4.0F, -5.25F, -5.5F, 8, 8, 7, 0.0F, false));

        this.cube_r16 = new AdvancedModelRenderer(this);
        this.cube_r16.setRotationPoint(-0.5F, -5.4671F, -7.6409F);
        this.head.addChild(cube_r16);
        this.setRotateAngle(cube_r16, -1.6581F, 0.0F, 0.0F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 57, 221, -1.0F, -3.0F, 0.0F, 3, 3, 3, -0.01F, false));

        this.cube_r17 = new AdvancedModelRenderer(this);
        this.cube_r17.setRotationPoint(-0.5F, -4.783F, -9.5203F);
        this.head.addChild(cube_r17);
        this.setRotateAngle(cube_r17, -1.2217F, 0.0F, 0.0F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 273, 47, -1.0F, -2.0F, 0.0F, 3, 2, 4, 0.0F, false));

        this.cube_r18 = new AdvancedModelRenderer(this);
        this.cube_r18.setRotationPoint(-0.5F, -3.2509F, -10.8058F);
        this.head.addChild(cube_r18);
        this.setRotateAngle(cube_r18, -0.6981F, 0.0F, 0.0F);
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 117, 256, -1.0F, -2.0F, 0.0F, 3, 2, 4, 0.01F, false));

        this.cube_r19 = new AdvancedModelRenderer(this);
        this.cube_r19.setRotationPoint(-0.5F, 0.4446F, -12.3366F);
        this.head.addChild(cube_r19);
        this.setRotateAngle(cube_r19, -0.3927F, 0.0F, 0.0F);
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 134, 219, -1.0F, -4.0F, 0.0F, 3, 4, 4, 0.0F, false));

        this.cube_r20 = new AdvancedModelRenderer(this);
        this.cube_r20.setRotationPoint(0.25F, 3.399F, -13.1075F);
        this.head.addChild(cube_r20);
        this.setRotateAngle(cube_r20, 0.3403F, 0.0F, 0.0F);
        this.cube_r20.cubeList.add(new ModelBox(cube_r20, 71, 190, -3.5F, 0.3F, 3.7175F, 1, 2, 1, -0.25F, true));
        this.cube_r20.cubeList.add(new ModelBox(cube_r20, 71, 190, 2.0F, 0.3F, 3.7175F, 1, 2, 1, -0.25F, false));

        this.cube_r21 = new AdvancedModelRenderer(this);
        this.cube_r21.setRotationPoint(0.5F, 3.399F, -12.8575F);
        this.head.addChild(cube_r21);
        this.setRotateAngle(cube_r21, 0.3403F, 0.0F, 0.0F);
        this.cube_r21.cubeList.add(new ModelBox(cube_r21, 57, 240, -3.49F, 0.95F, 3.7275F, 0, 1, 4, 0.0F, true));
        this.cube_r21.cubeList.add(new ModelBox(cube_r21, 57, 240, 2.49F, 0.95F, 3.7275F, 0, 1, 4, 0.0F, false));
        this.cube_r21.cubeList.add(new ModelBox(cube_r21, 273, 60, -3.0F, 0.95F, 1.7375F, 5, 1, 2, 0.0F, false));
        this.cube_r21.cubeList.add(new ModelBox(cube_r21, 57, 250, -2.0F, -0.059F, 0.7625F, 3, 2, 1, 0.01F, false));
        this.cube_r21.cubeList.add(new ModelBox(cube_r21, 57, 246, -2.0F, -0.059F, 0.0F, 3, 2, 1, 0.015F, false));

        this.cube_r22 = new AdvancedModelRenderer(this);
        this.cube_r22.setRotationPoint(-0.5F, 3.7463F, -10.8879F);
        this.head.addChild(cube_r22);
        this.setRotateAngle(cube_r22, -0.1745F, 0.0F, 0.0F);
        this.cube_r22.cubeList.add(new ModelBox(cube_r22, 57, 228, -1.0F, -3.0F, -2.0F, 3, 3, 2, 0.02F, false));

        this.cube_r23 = new AdvancedModelRenderer(this);
        this.cube_r23.setRotationPoint(-0.5F, -0.25F, -5.5F);
        this.head.addChild(cube_r23);
        this.setRotateAngle(cube_r23, 0.1745F, 0.0F, 0.0F);
        this.cube_r23.cubeList.add(new ModelBox(cube_r23, 273, 54, -2.0F, 0.0F, -6.0F, 5, 3, 2, 0.01F, false));
        this.cube_r23.cubeList.add(new ModelBox(cube_r23, 271, 168, -2.5F, 0.0F, -4.05F, 6, 3, 4, 0.01F, false));

        this.cube_r24 = new AdvancedModelRenderer(this);
        this.cube_r24.setRotationPoint(-0.5F, -1.6767F, -7.3179F);
        this.head.addChild(cube_r24);
        this.setRotateAngle(cube_r24, 1.0908F, 0.0F, 0.0F);
        this.cube_r24.cubeList.add(new ModelBox(cube_r24, 185, 271, -2.5F, 0.0F, 0.0F, 6, 3, 4, 0.01F, false));

        this.cube_r25 = new AdvancedModelRenderer(this);
        this.cube_r25.setRotationPoint(-0.5F, 0.4446F, -9.4392F);
        this.head.addChild(cube_r25);
        this.setRotateAngle(cube_r25, 0.7854F, 0.0F, 0.0F);
        this.cube_r25.cubeList.add(new ModelBox(cube_r25, 271, 34, -2.5F, 0.0F, 0.0F, 6, 3, 5, 0.0F, false));

        this.cube_r26 = new AdvancedModelRenderer(this);
        this.cube_r26.setRotationPoint(-0.5F, -0.35F, -5.4F);
        this.head.addChild(cube_r26);
        this.setRotateAngle(cube_r26, 0.1745F, 0.0F, 0.0F);
        this.cube_r26.cubeList.add(new ModelBox(cube_r26, 71, 194, -0.5F, 2.0F, -6.8F, 2, 2, 0, 0.0F, false));

        this.cube_r27 = new AdvancedModelRenderer(this);
        this.cube_r27.setRotationPoint(-2.0F, 4.4661F, -9.6787F);
        this.head.addChild(cube_r27);
        this.setRotateAngle(cube_r27, 0.3665F, 0.0F, 0.0F);
        this.cube_r27.cubeList.add(new ModelBox(cube_r27, 277, 120, -0.05F, -1.0F, 0.0F, 0, 1, 3, 0.0F, true));
        this.cube_r27.cubeList.add(new ModelBox(cube_r27, 277, 120, 4.05F, -1.0F, 0.0F, 0, 1, 3, 0.0F, false));

        this.cube_r28 = new AdvancedModelRenderer(this);
        this.cube_r28.setRotationPoint(-2.0F, 3.4814F, -9.8523F);
        this.head.addChild(cube_r28);
        this.setRotateAngle(cube_r28, 0.2009F, -0.5148F, -0.0999F);
        this.cube_r28.cubeList.add(new ModelBox(cube_r28, 71, 181, 0.0F, -1.0F, -2.0F, 0, 2, 2, 0.0F, true));

        this.cube_r29 = new AdvancedModelRenderer(this);
        this.cube_r29.setRotationPoint(2.0F, 3.4814F, -9.8523F);
        this.head.addChild(cube_r29);
        this.setRotateAngle(cube_r29, 0.2009F, 0.5148F, 0.0999F);
        this.cube_r29.cubeList.add(new ModelBox(cube_r29, 71, 181, 0.0F, -1.0F, -2.0F, 0, 2, 2, 0.0F, false));

        this.eyes = new AdvancedModelRenderer(this);
        this.eyes.setRotationPoint(-0.5F, -2.5F, -4.0F);
        this.head.addChild(eyes);
        this.eyes.cubeList.add(new ModelBox(eyes, 273, 43, -3.5F, -0.5F, -1.0F, 8, 1, 2, 0.01F, false));

        this.jaw = new AdvancedModelRenderer(this);
        this.jaw.setRotationPoint(-0.5F, 2.5F, 0.75F);
        this.head.addChild(jaw);
        this.setRotateAngle(jaw, -0.0873F, 0.0F, 0.0F);
        this.jaw.cubeList.add(new ModelBox(jaw, 255, 23, -3.5F, 0.25F, -6.25F, 8, 3, 7, -0.01F, false));

        this.cube_r30 = new AdvancedModelRenderer(this);
        this.cube_r30.setRotationPoint(0.0F, 4.5231F, -12.3527F);
        this.jaw.addChild(cube_r30);
        this.setRotateAngle(cube_r30, 0.3927F, 0.0F, 0.0F);
        this.cube_r30.cubeList.add(new ModelBox(cube_r30, 277, 125, -1.0F, -1.0F, 0.7727F, 3, 1, 1, -0.01F, false));
        this.cube_r30.cubeList.add(new ModelBox(cube_r30, 277, 107, -1.0F, -1.0F, 0.0F, 3, 1, 1, 0.0F, false));

        this.cube_r31 = new AdvancedModelRenderer(this);
        this.cube_r31.setRotationPoint(0.0F, 0.25F, -6.25F);
        this.jaw.addChild(cube_r31);
        this.setRotateAngle(cube_r31, 0.6109F, 0.0F, 0.0F);
        this.cube_r31.cubeList.add(new ModelBox(cube_r31, 57, 234, -1.0F, 0.0F, -7.45F, 3, 3, 2, 0.01F, false));
        this.cube_r31.cubeList.add(new ModelBox(cube_r31, 277, 97, -2.0F, 0.0F, -5.7F, 5, 3, 2, 0.0F, false));
        this.cube_r31.cubeList.add(new ModelBox(cube_r31, 206, 271, -2.5F, 0.0F, -3.75F, 6, 3, 4, 0.0F, false));

        this.cube_r32 = new AdvancedModelRenderer(this);
        this.cube_r32.setRotationPoint(0.0F, 4.8027F, -5.4245F);
        this.jaw.addChild(cube_r32);
        this.setRotateAngle(cube_r32, -0.0436F, 0.0F, 0.0F);
        this.cube_r32.cubeList.add(new ModelBox(cube_r32, 185, 233, -2.5F, -2.0F, 0.05F, 6, 2, 6, -0.01F, false));

        this.cube_r33 = new AdvancedModelRenderer(this);
        this.cube_r33.setRotationPoint(0.0F, 6.0055F, -9.2394F);
        this.jaw.addChild(cube_r33);
        this.setRotateAngle(cube_r33, 0.3054F, 0.0F, 0.0F);
        this.cube_r33.cubeList.add(new ModelBox(cube_r33, 265, 268, -2.0F, -2.0F, 0.05F, 5, 2, 10, -0.01F, false));

        this.cube_r34 = new AdvancedModelRenderer(this);
        this.cube_r34.setRotationPoint(1.0F, 3.6915F, -11.1649F);
        this.jaw.addChild(cube_r34);
        this.setRotateAngle(cube_r34, 0.4712F, 0.0F, 0.0F);
        this.cube_r34.cubeList.add(new ModelBox(cube_r34, 277, 110, -3.48F, -0.6315F, 2.3149F, 0, 1, 3, 0.0F, true));
        this.cube_r34.cubeList.add(new ModelBox(cube_r34, 71, 197, -3.73F, -0.8815F, 2.0649F, 1, 1, 1, -0.25F, true));
        this.cube_r34.cubeList.add(new ModelBox(cube_r34, 71, 197, 1.73F, -0.8815F, 2.0649F, 1, 1, 1, -0.25F, false));
        this.cube_r34.cubeList.add(new ModelBox(cube_r34, 277, 110, 2.48F, -0.6315F, 2.3149F, 0, 1, 3, 0.0F, false));
        this.cube_r34.cubeList.add(new ModelBox(cube_r34, 277, 103, -3.0F, -0.65F, 0.3349F, 5, 1, 2, -0.02F, false));

        this.cube_r35 = new AdvancedModelRenderer(this);
        this.cube_r35.setRotationPoint(-1.5F, 2.0553F, -10.6145F);
        this.jaw.addChild(cube_r35);
        this.setRotateAngle(cube_r35, 0.3491F, 0.0F, 0.0F);
        this.cube_r35.cubeList.add(new ModelBox(cube_r35, 277, 115, 0.0F, 0.0F, 0.0F, 0, 1, 3, 0.0F, true));
        this.cube_r35.cubeList.add(new ModelBox(cube_r35, 277, 115, 4.0F, 0.0F, 0.0F, 0, 1, 3, 0.0F, false));

        this.cube_r36 = new AdvancedModelRenderer(this);
        this.cube_r36.setRotationPoint(-1.5F, 2.0553F, -10.6145F);
        this.jaw.addChild(cube_r36);
        this.setRotateAngle(cube_r36, 0.6775F, -0.4152F, -0.3138F);
        this.cube_r36.cubeList.add(new ModelBox(cube_r36, 71, 186, 0.0F, 0.0F, -2.0F, 0, 1, 2, 0.0F, true));

        this.cube_r37 = new AdvancedModelRenderer(this);
        this.cube_r37.setRotationPoint(0.0F, 0.15F, -6.15F);
        this.jaw.addChild(cube_r37);
        this.setRotateAngle(cube_r37, 0.6109F, 0.0F, 0.0F);
        this.cube_r37.cubeList.add(new ModelBox(cube_r37, 137, 69, -0.5F, -1.0F, -6.5F, 2, 1, 0, 0.0F, false));

        this.cube_r38 = new AdvancedModelRenderer(this);
        this.cube_r38.setRotationPoint(2.5F, 2.0553F, -10.6145F);
        this.jaw.addChild(cube_r38);
        this.setRotateAngle(cube_r38, 0.6775F, 0.4152F, 0.3138F);
        this.cube_r38.cubeList.add(new ModelBox(cube_r38, 71, 186, 0.0F, 0.0F, -2.0F, 0, 1, 2, 0.0F, false));

        this.cube_r39 = new AdvancedModelRenderer(this);
        this.cube_r39.setRotationPoint(0.0F, 0.25F, -6.25F);
        this.jaw.addChild(cube_r39);
        this.setRotateAngle(cube_r39, 1.3614F, 0.0F, 0.0F);
        this.cube_r39.cubeList.add(new ModelBox(cube_r39, 206, 64, -2.5F, -0.75F, -1.0F, 6, 1, 4, -0.03F, false));
        this.cube_r39.cubeList.add(new ModelBox(cube_r39, 271, 158, -3.5F, 0.2F, 0.0F, 8, 6, 3, -0.02F, false));

        updateDefaultPose();
        animator = ModelAnimator.create();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        animate((IAnimatedEntity) entity, f, f1, f2, f3, f4, f5);
        this.main.render(f5);
    }
    public void renderStaticWall(float f) {
        this.neck.rotateAngleX = (float) Math.toRadians(90);

        this.neck.offsetY = -0F;
        this.neck.offsetX = -0F;
        this.neck.offsetZ = 0.04F;
        this.neck.render(0.01F);
        resetToDefaultPose();
    }
    public void renderStaticFloor(float f) {

        this.main.offsetY = -0.155F;
        this.main.render(0.01F);
        resetToDefaultPose();
    }

    @Override
    public void renderStaticBook(float f) {
        //Rotations, positions and sizing:
        this.main.offsetY = -0.2F;
        this.main.offsetX = 0.2F;
        this.main.offsetZ = 2.0F;
        this.main.rotateAngleY = (float)Math.toRadians(225);
        this.main.rotateAngleX = (float)Math.toRadians(8);
        this.main.rotateAngleZ = (float)Math.toRadians(-8);
        this.main.scaleChildren = true;
        float scaler = 0.3F;
        this.main.setScale(scaler, scaler, scaler);
        //Start of pose:

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

        EntityPrehistoricFloraAragosaurus Aragosaurus = (EntityPrehistoricFloraAragosaurus) e;

//        this.faceTarget(f3, f4, 6, neck1);
//        this.faceTarget(f3, f4, 6, neck2);
//        this.faceTarget(f3, f4, 6, neck3);
//        this.faceTarget(f3, f4, 4, neck4);
//        this.faceTarget(f3, f4, 4, neck5);
//        this.faceTarget(f3, f4, 4, head);

        boolean isBaby = Aragosaurus.getJuvenile();

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

        AdvancedModelRenderer[] Tail = {this.tail, this.tail2, this.tail3, this.tail4, this.tail5, this.tail6, this.tail7};
        AdvancedModelRenderer[] Neck = {this.neck, this.neck2, this.neck3, this.neck4, this.neck5, this.neck6, this.head};
        //AdvancedModelRenderer[] ArmL = {this.leftarm, this.leftarm2, this.leftarm3};
        //AdvancedModelRenderer[] ArmR = {this.rightarm, this.rightarm2, this.rightarm3};

        Aragosaurus.tailBuffer.applyChainSwingBuffer(Tail);
        float masterSpeed = Aragosaurus.getTravelSpeed()/2;

        if (!Aragosaurus.isInWater()) {

            if (f3 == 0.0F || !Aragosaurus.getIsMoving()) {
                if (Aragosaurus.getAnimation() != Aragosaurus.EAT_ANIMATION
                        && Aragosaurus.getAnimation() != Aragosaurus.DRINK_ANIMATION
                        && Aragosaurus.getAnimation() != Aragosaurus.ATTACK_ANIMATION) {
                    this.chainFlap(Neck, 0.05F, 0.02F, 0.5, f2, 0.8F);
                    this.chainWave(Neck, 0.05F * 2, -0.01F, 0.5F, f2, 0.8F);
                }

                if (Aragosaurus.getAnimation() != Aragosaurus.ATTACK_ANIMATION) {
                    this.chainFlap(Tail, (0.15F * 0.1F), 0.05F, 0.2F, f2, 1F);
                    this.chainWave(Tail, (0.15F * 0.1F) * 2F, 0.05F * 0.15F, 0.12F, f2, 1F);
                    this.chainSwing(Tail, (0.15F * 0.1F) * 8F, 0.05F * 0.15F, 0F, f2, 1F);
                }

                return;
            }

            if (Aragosaurus.getAnimation() != Aragosaurus.EAT_ANIMATION
                    && Aragosaurus.getAnimation() != Aragosaurus.DRINK_ANIMATION
                    && Aragosaurus.getAnimation() != Aragosaurus.ATTACK_ANIMATION
                    && Aragosaurus.getAnimation() != Aragosaurus.ATTACK_ANIMATION) {
                this.chainFlap(Neck, 0.05F, 0.02F, 0.5, f2, 0.8F);
                this.chainWave(Neck, 0.05F * 2, -0.01F, 0.5F, f2, 0.8F);
                this.chainFlap(Tail, (0.15F * 0.1F), 0.05F, 0.2F, f2, 1F);
                this.chainWave(Tail, (0.15F * 0.1F) * 2F, 0.05F * 0.15F, 0.12F, f2, 1F);
                this.chainSwing(Tail, (0.15F * 0.1F) * 8F, 0.05F * 0.15F, 0F, f2, 1F);
            }

            if (Aragosaurus.getIsFast()) { //Running
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
        EntityPrehistoricFloraAragosaurus ee = (EntityPrehistoricFloraAragosaurus) entitylivingbaseIn;

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
        EntityPrehistoricFloraAragosaurus entity = (EntityPrehistoricFloraAragosaurus) entitylivingbaseIn;
        int animCycle = 240;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        if (tickAnim >= 0 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 0) / 50) * (-3.25-(0)));
            yy = 0 + (((tickAnim - 0) / 50) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 50) * (0-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 200) {
            xx = -3.25 + (((tickAnim - 50) / 150) * (-3.25-(-3.25)));
            yy = 0 + (((tickAnim - 50) / 150) * (0-(0)));
            zz = 0 + (((tickAnim - 50) / 150) * (0-(0)));
        }
        else if (tickAnim >= 200 && tickAnim < 240) {
            xx = -3.25 + (((tickAnim - 200) / 40) * (0-(-3.25)));
            yy = 0 + (((tickAnim - 200) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 200) / 40) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(main, main.rotateAngleX + (float) Math.toRadians(xx), main.rotateAngleY + (float) Math.toRadians(yy), main.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 0) / 50) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 50) * (-1.25-(0)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-5 + (((tickAnim - 0) / 50) * (-6.2-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-5)));
        }
        else if (tickAnim >= 50 && tickAnim < 200) {
            xx = 0 + (((tickAnim - 50) / 150) * (0-(0)));
            yy = -1.25 + (((tickAnim - 50) / 150) * (-1.25-(-1.25)));
            zz = -6.2 + (((tickAnim - 50) / 150) * (-6.2-(-6.2)));
        }
        else if (tickAnim >= 200 && tickAnim < 240) {
            xx = 0 + (((tickAnim - 200) / 40) * (0-(0)));
            yy = -1.25 + (((tickAnim - 200) / 40) * (0-(-1.25)));
            zz = -6.2 + (((tickAnim - 200) / 40) * (0-(-6.2)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.main.rotationPointX = this.main.rotationPointX + (float)(xx);
        this.main.rotationPointY = this.main.rotationPointY - (float)(yy);
        this.main.rotationPointZ = this.main.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 50) {
            xx = -0-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-15 + (((tickAnim - 0) / 50) * (19.5-(-0-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-15)));
            yy = 0 + (((tickAnim - 0) / 50) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 50) * (0-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 200) {
            xx = 19.5 + (((tickAnim - 50) / 150) * (19.5-(19.5)));
            yy = 0 + (((tickAnim - 50) / 150) * (0-(0)));
            zz = 0 + (((tickAnim - 50) / 150) * (0-(0)));
        }
        else if (tickAnim >= 200 && tickAnim < 240) {
            xx = 19.5 + (((tickAnim - 200) / 40) * (0-(19.5)));
            yy = 0 + (((tickAnim - 200) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 200) / 40) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg, leftLeg.rotateAngleX + (float) Math.toRadians(xx), leftLeg.rotateAngleY + (float) Math.toRadians(yy), leftLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 50) {
            xx = -0-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*15 + (((tickAnim - 0) / 50) * (-3-(-0-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*15)));
            yy = 0 + (((tickAnim - 0) / 50) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 50) * (0-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 200) {
            xx = -3 + (((tickAnim - 50) / 150) * (-3-(-3)));
            yy = 0 + (((tickAnim - 50) / 150) * (0-(0)));
            zz = 0 + (((tickAnim - 50) / 150) * (0-(0)));
        }
        else if (tickAnim >= 200 && tickAnim < 240) {
            xx = -3 + (((tickAnim - 200) / 40) * (0-(-3)));
            yy = 0 + (((tickAnim - 200) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 200) / 40) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg2, leftLeg2.rotateAngleX + (float) Math.toRadians(xx), leftLeg2.rotateAngleY + (float) Math.toRadians(yy), leftLeg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 0) / 50) * (0-(0)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*2 + (((tickAnim - 0) / 50) * (-1.525-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*2)));
            zz = 0 + (((tickAnim - 0) / 50) * (0-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 200) {
            xx = 0 + (((tickAnim - 50) / 150) * (0-(0)));
            yy = -1.525 + (((tickAnim - 50) / 150) * (-1.525-(-1.525)));
            zz = 0 + (((tickAnim - 50) / 150) * (0-(0)));
        }
        else if (tickAnim >= 200 && tickAnim < 240) {
            xx = 0 + (((tickAnim - 200) / 40) * (0-(0)));
            yy = -1.525 + (((tickAnim - 200) / 40) * (0-(-1.525)));
            zz = 0 + (((tickAnim - 200) / 40) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftLeg2.rotationPointX = this.leftLeg2.rotationPointX + (float)(xx);
        this.leftLeg2.rotationPointY = this.leftLeg2.rotationPointY - (float)(yy);
        this.leftLeg2.rotationPointZ = this.leftLeg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 0) / 50) * (-13.75-(0)));
            yy = 0 + (((tickAnim - 0) / 50) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 50) * (0-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 200) {
            xx = -13.75 + (((tickAnim - 50) / 150) * (-13.75-(-13.75)));
            yy = 0 + (((tickAnim - 50) / 150) * (0-(0)));
            zz = 0 + (((tickAnim - 50) / 150) * (0-(0)));
        }
        else if (tickAnim >= 200 && tickAnim < 240) {
            xx = -13.75 + (((tickAnim - 200) / 40) * (0-(-13.75)));
            yy = 0 + (((tickAnim - 200) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 200) / 40) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg3, leftLeg3.rotateAngleX + (float) Math.toRadians(xx), leftLeg3.rotateAngleY + (float) Math.toRadians(yy), leftLeg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 24) {
            xx = 0 + (((tickAnim - 0) / 24) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 24) * (-0.55-(0)));
            zz = 0 + (((tickAnim - 0) / 24) * (0-(0)));
        }
        else if (tickAnim >= 24 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 24) / 26) * (0-(0)));
            yy = -0.55 + (((tickAnim - 24) / 26) * (0-(-0.55)));
            zz = 0 + (((tickAnim - 24) / 26) * (0-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 200) {
            xx = 0 + (((tickAnim - 50) / 150) * (0-(0)));
            yy = 0 + (((tickAnim - 50) / 150) * (0-(0)));
            zz = 0 + (((tickAnim - 50) / 150) * (0-(0)));
        }
        else if (tickAnim >= 200 && tickAnim < 240) {
            xx = 0 + (((tickAnim - 200) / 40) * (0-(0)));
            yy = 0 + (((tickAnim - 200) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 200) / 40) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftLeg3.rotationPointX = this.leftLeg3.rotationPointX + (float)(xx);
        this.leftLeg3.rotationPointY = this.leftLeg3.rotationPointY - (float)(yy);
        this.leftLeg3.rotationPointZ = this.leftLeg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 0) / 50) * (-0-Math.sin((Math.PI/180)*(((double)tickAnim/20)*10-50))*0.2-(0)));
            yy = 0 + (((tickAnim - 0) / 50) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 50) * (0-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 200) {
            xx = -0-Math.sin((Math.PI/180)*(((double)tickAnim/20)*10-50))*0.2 + (((tickAnim - 50) / 150) * (-0-Math.sin((Math.PI/180)*(((double)tickAnim/20)*10-50))*0.2-(-0-Math.sin((Math.PI/180)*(((double)tickAnim/20)*10-50))*0.2)));
            yy = 0 + (((tickAnim - 50) / 150) * (0-(0)));
            zz = 0 + (((tickAnim - 50) / 150) * (0-(0)));
        }
        else if (tickAnim >= 200 && tickAnim < 240) {
            xx = -0-Math.sin((Math.PI/180)*(((double)tickAnim/20)*10-50))*0.2 + (((tickAnim - 200) / 40) * (0-(-0-Math.sin((Math.PI/180)*(((double)tickAnim/20)*10-50))*0.2)));
            yy = 0 + (((tickAnim - 200) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 200) / 40) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail, tail.rotateAngleX + (float) Math.toRadians(xx), tail.rotateAngleY + (float) Math.toRadians(yy), tail.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 0) / 50) * (-0-Math.sin((Math.PI/180)*(((double)tickAnim/20)*20-100))*0.5-(0)));
            yy = 0 + (((tickAnim - 0) / 50) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 50) * (0-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 200) {
            xx = -0-Math.sin((Math.PI/180)*(((double)tickAnim/20)*20-100))*0.5 + (((tickAnim - 50) / 150) * (-0-Math.sin((Math.PI/180)*(((double)tickAnim/20)*20-100))*0.5-(-0-Math.sin((Math.PI/180)*(((double)tickAnim/20)*20-100))*0.5)));
            yy = 0 + (((tickAnim - 50) / 150) * (0-(0)));
            zz = 0 + (((tickAnim - 50) / 150) * (0-(0)));
        }
        else if (tickAnim >= 200 && tickAnim < 240) {
            xx = -0-Math.sin((Math.PI/180)*(((double)tickAnim/20)*20-100))*0.5 + (((tickAnim - 200) / 40) * (0-(-0-Math.sin((Math.PI/180)*(((double)tickAnim/20)*20-100))*0.5)));
            yy = 0 + (((tickAnim - 200) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 200) / 40) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(xx), tail2.rotateAngleY + (float) Math.toRadians(yy), tail2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 0) / 50) * (-0-Math.sin((Math.PI/180)*(((double)tickAnim/20)*30-150))*1-(0)));
            yy = 0 + (((tickAnim - 0) / 50) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 50) * (0-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 200) {
            xx = -0-Math.sin((Math.PI/180)*(((double)tickAnim/20)*30-150))*1 + (((tickAnim - 50) / 150) * (-0-Math.sin((Math.PI/180)*(((double)tickAnim/20)*30-150))*1-(-0-Math.sin((Math.PI/180)*(((double)tickAnim/20)*30-150))*1)));
            yy = 0 + (((tickAnim - 50) / 150) * (0-(0)));
            zz = 0 + (((tickAnim - 50) / 150) * (0-(0)));
        }
        else if (tickAnim >= 200 && tickAnim < 240) {
            xx = -0-Math.sin((Math.PI/180)*(((double)tickAnim/20)*30-150))*1 + (((tickAnim - 200) / 40) * (0-(-0-Math.sin((Math.PI/180)*(((double)tickAnim/20)*30-150))*1)));
            yy = 0 + (((tickAnim - 200) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 200) / 40) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(xx), tail3.rotateAngleY + (float) Math.toRadians(yy), tail3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 0) / 50) * (-0-Math.sin((Math.PI/180)*(((double)tickAnim/20)*40-200))*1-(0)));
            yy = 0 + (((tickAnim - 0) / 50) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 50) * (0-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 200) {
            xx = -0-Math.sin((Math.PI/180)*(((double)tickAnim/20)*40-200))*1 + (((tickAnim - 50) / 150) * (-0-Math.sin((Math.PI/180)*(((double)tickAnim/20)*40-200))*1-(-0-Math.sin((Math.PI/180)*(((double)tickAnim/20)*40-200))*1)));
            yy = 0 + (((tickAnim - 50) / 150) * (0-(0)));
            zz = 0 + (((tickAnim - 50) / 150) * (0-(0)));
        }
        else if (tickAnim >= 200 && tickAnim < 240) {
            xx = -0-Math.sin((Math.PI/180)*(((double)tickAnim/20)*40-200))*1 + (((tickAnim - 200) / 40) * (0-(-0-Math.sin((Math.PI/180)*(((double)tickAnim/20)*40-200))*1)));
            yy = 0 + (((tickAnim - 200) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 200) / 40) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(xx), tail4.rotateAngleY + (float) Math.toRadians(yy), tail4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 0) / 50) * (-0-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-250))*1-(0)));
            yy = 0 + (((tickAnim - 0) / 50) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 50) * (0-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 200) {
            xx = -0-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-250))*1 + (((tickAnim - 50) / 150) * (-0-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-250))*1-(-0-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-250))*1)));
            yy = 0 + (((tickAnim - 50) / 150) * (0-(0)));
            zz = 0 + (((tickAnim - 50) / 150) * (0-(0)));
        }
        else if (tickAnim >= 200 && tickAnim < 240) {
            xx = -0-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-250))*1 + (((tickAnim - 200) / 40) * (0-(-0-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-250))*1)));
            yy = 0 + (((tickAnim - 200) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 200) / 40) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail5, tail5.rotateAngleX + (float) Math.toRadians(xx), tail5.rotateAngleY + (float) Math.toRadians(yy), tail5.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 0) / 50) * (-0-Math.sin((Math.PI/180)*(((double)tickAnim/20)*60-300))*1-(0)));
            yy = 0 + (((tickAnim - 0) / 50) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 50) * (0-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 200) {
            xx = -0-Math.sin((Math.PI/180)*(((double)tickAnim/20)*60-300))*1 + (((tickAnim - 50) / 150) * (-0-Math.sin((Math.PI/180)*(((double)tickAnim/20)*60-300))*1-(-0-Math.sin((Math.PI/180)*(((double)tickAnim/20)*60-300))*1)));
            yy = 0 + (((tickAnim - 50) / 150) * (0-(0)));
            zz = 0 + (((tickAnim - 50) / 150) * (0-(0)));
        }
        else if (tickAnim >= 200 && tickAnim < 240) {
            xx = -0-Math.sin((Math.PI/180)*(((double)tickAnim/20)*60-300))*1 + (((tickAnim - 200) / 40) * (0-(-0-Math.sin((Math.PI/180)*(((double)tickAnim/20)*60-300))*1)));
            yy = 0 + (((tickAnim - 200) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 200) / 40) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail6, tail6.rotateAngleX + (float) Math.toRadians(xx), tail6.rotateAngleY + (float) Math.toRadians(yy), tail6.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 0) / 50) * (-0-Math.sin((Math.PI/180)*(((double)tickAnim/20)*70-350))*1-(0)));
            yy = 0 + (((tickAnim - 0) / 50) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 50) * (0-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 200) {
            xx = -0-Math.sin((Math.PI/180)*(((double)tickAnim/20)*70-350))*1 + (((tickAnim - 50) / 150) * (-0-Math.sin((Math.PI/180)*(((double)tickAnim/20)*70-350))*1-(-0-Math.sin((Math.PI/180)*(((double)tickAnim/20)*70-350))*1)));
            yy = 0 + (((tickAnim - 50) / 150) * (0-(0)));
            zz = 0 + (((tickAnim - 50) / 150) * (0-(0)));
        }
        else if (tickAnim >= 200 && tickAnim < 240) {
            xx = -0-Math.sin((Math.PI/180)*(((double)tickAnim/20)*70-350))*1 + (((tickAnim - 200) / 40) * (0-(-0-Math.sin((Math.PI/180)*(((double)tickAnim/20)*70-350))*1)));
            yy = 0 + (((tickAnim - 200) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 200) / 40) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail7, tail7.rotateAngleX + (float) Math.toRadians(xx), tail7.rotateAngleY + (float) Math.toRadians(yy), tail7.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 0) / 50) * (-0-Math.sin((Math.PI/180)*(((double)tickAnim/20)*80-400))*1-(0)));
            yy = 0 + (((tickAnim - 0) / 50) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 50) * (0-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 200) {
            xx = -0-Math.sin((Math.PI/180)*(((double)tickAnim/20)*80-400))*1 + (((tickAnim - 50) / 150) * (-0-Math.sin((Math.PI/180)*(((double)tickAnim/20)*80-400))*1-(-0-Math.sin((Math.PI/180)*(((double)tickAnim/20)*80-400))*1)));
            yy = 0 + (((tickAnim - 50) / 150) * (0-(0)));
            zz = 0 + (((tickAnim - 50) / 150) * (0-(0)));
        }
        else if (tickAnim >= 200 && tickAnim < 240) {
            xx = -0-Math.sin((Math.PI/180)*(((double)tickAnim/20)*80-400))*1 + (((tickAnim - 200) / 40) * (0-(-0-Math.sin((Math.PI/180)*(((double)tickAnim/20)*80-400))*1)));
            yy = 0 + (((tickAnim - 200) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 200) / 40) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail8, tail8.rotateAngleX + (float) Math.toRadians(xx), tail8.rotateAngleY + (float) Math.toRadians(yy), tail8.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (11.5-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 39) {
            xx = 11.5 + (((tickAnim - 20) / 19) * (-21.5-(11.5)));
            yy = 0 + (((tickAnim - 20) / 19) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 19) * (0-(0)));
        }
        else if (tickAnim >= 39 && tickAnim < 50) {
            xx = -21.5 + (((tickAnim - 39) / 11) * (-18-(-21.5)));
            yy = 0 + (((tickAnim - 39) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 39) / 11) * (0-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 180) {
            xx = -18 + (((tickAnim - 50) / 130) * (-18-(-18)));
            yy = 0 + (((tickAnim - 50) / 130) * (0-(0)));
            zz = 0 + (((tickAnim - 50) / 130) * (0-(0)));
        }
        else if (tickAnim >= 180 && tickAnim < 193) {
            xx = -18 + (((tickAnim - 180) / 13) * (9.87-(-18)));
            yy = 0 + (((tickAnim - 180) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 180) / 13) * (0-(0)));
        }
        else if (tickAnim >= 193 && tickAnim < 205) {
            xx = 9.87 + (((tickAnim - 193) / 12) * (4.25-(9.87)));
            yy = 0 + (((tickAnim - 193) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 193) / 12) * (0-(0)));
        }
        else if (tickAnim >= 205 && tickAnim < 240) {
            xx = 4.25 + (((tickAnim - 205) / 35) * (0-(4.25)));
            yy = 0 + (((tickAnim - 205) / 35) * (0-(0)));
            zz = 0 + (((tickAnim - 205) / 35) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm, leftArm.rotateAngleX + (float) Math.toRadians(xx), leftArm.rotateAngleY + (float) Math.toRadians(yy), leftArm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (6-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 6 + (((tickAnim - 20) / 10) * (22.795-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-50))*100-(6)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 39) {
            xx = 22.795-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-50))*100 + (((tickAnim - 30) / 9) * (20-(22.795-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-50))*100)));
            yy = 0 + (((tickAnim - 30) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 9) * (0-(0)));
        }
        else if (tickAnim >= 39 && tickAnim < 50) {
            xx = 20 + (((tickAnim - 39) / 11) * (16-(20)));
            yy = 0 + (((tickAnim - 39) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 39) / 11) * (0-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 180) {
            xx = 16 + (((tickAnim - 50) / 130) * (16-(16)));
            yy = 0 + (((tickAnim - 50) / 130) * (0-(0)));
            zz = 0 + (((tickAnim - 50) / 130) * (0-(0)));
        }
        else if (tickAnim >= 180 && tickAnim < 193) {
            xx = 16 + (((tickAnim - 180) / 13) * (-35.38-(16)));
            yy = 0 + (((tickAnim - 180) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 180) / 13) * (0-(0)));
        }
        else if (tickAnim >= 193 && tickAnim < 205) {
            xx = -35.38 + (((tickAnim - 193) / 12) * (10.75-(-35.38)));
            yy = 0 + (((tickAnim - 193) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 193) / 12) * (0-(0)));
        }
        else if (tickAnim >= 205 && tickAnim < 240) {
            xx = 10.75 + (((tickAnim - 205) / 35) * (0-(10.75)));
            yy = 0 + (((tickAnim - 205) / 35) * (0-(0)));
            zz = 0 + (((tickAnim - 205) / 35) * (0-(0)));
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
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 20) / 10) * (1.78-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 39) {
            xx = 0 + (((tickAnim - 30) / 9) * (0-(0)));
            yy = 1.78 + (((tickAnim - 30) / 9) * (-1.4-(1.78)));
            zz = 0 + (((tickAnim - 30) / 9) * (0-(0)));
        }
        else if (tickAnim >= 39 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 39) / 11) * (0-(0)));
            yy = -1.4 + (((tickAnim - 39) / 11) * (-1.325-(-1.4)));
            zz = 0 + (((tickAnim - 39) / 11) * (0-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 180) {
            xx = 0 + (((tickAnim - 50) / 130) * (0-(0)));
            yy = -1.325 + (((tickAnim - 50) / 130) * (-1.325-(-1.325)));
            zz = 0 + (((tickAnim - 50) / 130) * (0-(0)));
        }
        else if (tickAnim >= 180 && tickAnim < 193) {
            xx = 0 + (((tickAnim - 180) / 13) * (0-(0)));
            yy = -1.325 + (((tickAnim - 180) / 13) * (1.955-(-1.325)));
            zz = 0 + (((tickAnim - 180) / 13) * (1.975-(0)));
        }
        else if (tickAnim >= 193 && tickAnim < 205) {
            xx = 0 + (((tickAnim - 193) / 12) * (0-(0)));
            yy = 1.955 + (((tickAnim - 193) / 12) * (0-(1.955)));
            zz = 1.975 + (((tickAnim - 193) / 12) * (0-(1.975)));
        }
        else if (tickAnim >= 205 && tickAnim < 240) {
            xx = 0 + (((tickAnim - 205) / 35) * (0-(0)));
            yy = 0 + (((tickAnim - 205) / 35) * (0-(0)));
            zz = 0 + (((tickAnim - 205) / 35) * (0-(0)));
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
            xx = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 24) {
            xx = 0 + (((tickAnim - 20) / 4) * (39.24-(0)));
            yy = 0 + (((tickAnim - 20) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 4) * (0-(0)));
        }
        else if (tickAnim >= 24 && tickAnim < 30) {
            xx = 39.24 + (((tickAnim - 24) / 6) * (27.96-(39.24)));
            yy = 0 + (((tickAnim - 24) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 24) / 6) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 39) {
            xx = 27.96 + (((tickAnim - 30) / 9) * (5.75-(27.96)));
            yy = 0 + (((tickAnim - 30) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 9) * (0-(0)));
        }
        else if (tickAnim >= 39 && tickAnim < 50) {
            xx = 5.75 + (((tickAnim - 39) / 11) * (6.25-(5.75)));
            yy = 0 + (((tickAnim - 39) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 39) / 11) * (0-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 180) {
            xx = 6.25 + (((tickAnim - 50) / 130) * (6.25-(6.25)));
            yy = 0 + (((tickAnim - 50) / 130) * (0-(0)));
            zz = 0 + (((tickAnim - 50) / 130) * (0-(0)));
        }
        else if (tickAnim >= 180 && tickAnim < 193) {
            xx = 6.25 + (((tickAnim - 180) / 13) * (51.82-(6.25)));
            yy = 0 + (((tickAnim - 180) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 180) / 13) * (0-(0)));
        }
        else if (tickAnim >= 193 && tickAnim < 205) {
            xx = 51.82 + (((tickAnim - 193) / 12) * (-10.25-(51.82)));
            yy = 0 + (((tickAnim - 193) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 193) / 12) * (0-(0)));
        }
        else if (tickAnim >= 205 && tickAnim < 240) {
            xx = -10.25 + (((tickAnim - 205) / 35) * (0-(-10.25)));
            yy = 0 + (((tickAnim - 205) / 35) * (0-(0)));
            zz = 0 + (((tickAnim - 205) / 35) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm3, leftArm3.rotateAngleX + (float) Math.toRadians(xx), leftArm3.rotateAngleY + (float) Math.toRadians(yy), leftArm3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (-1.075-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 24) {
            xx = 0 + (((tickAnim - 20) / 4) * (0-(0)));
            yy = -1.075 + (((tickAnim - 20) / 4) * (0.73-(-1.075)));
            zz = 0 + (((tickAnim - 20) / 4) * (0-(0)));
        }
        else if (tickAnim >= 24 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 24) / 6) * (0-(0)));
            yy = 0.73 + (((tickAnim - 24) / 6) * (0-(0.73)));
            zz = 0 + (((tickAnim - 24) / 6) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 39) {
            xx = 0 + (((tickAnim - 30) / 9) * (0-(0)));
            yy = 0 + (((tickAnim - 30) / 9) * (-0.325-(0)));
            zz = 0 + (((tickAnim - 30) / 9) * (0-(0)));
        }
        else if (tickAnim >= 39 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 39) / 11) * (0-(0)));
            yy = -0.325 + (((tickAnim - 39) / 11) * (-0.875-(-0.325)));
            zz = 0 + (((tickAnim - 39) / 11) * (0-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 180) {
            xx = 0 + (((tickAnim - 50) / 130) * (0-(0)));
            yy = -0.875 + (((tickAnim - 50) / 130) * (-0.875-(-0.875)));
            zz = 0 + (((tickAnim - 50) / 130) * (0-(0)));
        }
        else if (tickAnim >= 180 && tickAnim < 193) {
            xx = 0 + (((tickAnim - 180) / 13) * (0-(0)));
            yy = -0.875 + (((tickAnim - 180) / 13) * (1.515-(-0.875)));
            zz = 0 + (((tickAnim - 180) / 13) * (0-(0)));
        }
        else if (tickAnim >= 193 && tickAnim < 205) {
            xx = 0 + (((tickAnim - 193) / 12) * (0-(0)));
            yy = 1.515 + (((tickAnim - 193) / 12) * (-1.3-(1.515)));
            zz = 0 + (((tickAnim - 193) / 12) * (0-(0)));
        }
        else if (tickAnim >= 205 && tickAnim < 240) {
            xx = 0 + (((tickAnim - 205) / 35) * (0-(0)));
            yy = -1.3 + (((tickAnim - 205) / 35) * (0-(-1.3)));
            zz = 0 + (((tickAnim - 205) / 35) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftArm3.rotationPointX = this.leftArm3.rotationPointX + (float)(xx);
        this.leftArm3.rotationPointY = this.leftArm3.rotationPointY - (float)(yy);
        this.leftArm3.rotationPointZ = this.leftArm3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 0) / 50) * (10-(0)));
            yy = 0 + (((tickAnim - 0) / 50) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 50) * (0-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 200) {
            xx = 10 + (((tickAnim - 50) / 150) * (10-(10)));
            yy = 0 + (((tickAnim - 50) / 150) * (0-(0)));
            zz = 0 + (((tickAnim - 50) / 150) * (0-(0)));
        }
        else if (tickAnim >= 200 && tickAnim < 240) {
            xx = 10 + (((tickAnim - 200) / 40) * (0-(10)));
            yy = 0 + (((tickAnim - 200) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 200) / 40) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm, rightArm.rotateAngleX + (float) Math.toRadians(xx), rightArm.rotateAngleY + (float) Math.toRadians(yy), rightArm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (10.1-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 50) {
            xx = 10.1 + (((tickAnim - 20) / 30) * (5.25-(10.1)));
            yy = 0 + (((tickAnim - 20) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 30) * (0-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 200) {
            xx = 5.25 + (((tickAnim - 50) / 150) * (5.25-(5.25)));
            yy = 0 + (((tickAnim - 50) / 150) * (0-(0)));
            zz = 0 + (((tickAnim - 50) / 150) * (0-(0)));
        }
        else if (tickAnim >= 200 && tickAnim < 240) {
            xx = 5.25 + (((tickAnim - 200) / 40) * (0-(5.25)));
            yy = 0 + (((tickAnim - 200) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 200) / 40) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm2, rightArm2.rotateAngleX + (float) Math.toRadians(xx), rightArm2.rotateAngleY + (float) Math.toRadians(yy), rightArm2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 20) / 30) * (0-(0)));
            yy = 0 + (((tickAnim - 20) / 30) * (-0.695-(0)));
            zz = 0 + (((tickAnim - 20) / 30) * (0-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 200) {
            xx = 0 + (((tickAnim - 50) / 150) * (0-(0)));
            yy = -0.695 + (((tickAnim - 50) / 150) * (-0.695-(-0.695)));
            zz = 0 + (((tickAnim - 50) / 150) * (0-(0)));
        }
        else if (tickAnim >= 200 && tickAnim < 240) {
            xx = 0 + (((tickAnim - 200) / 40) * (0-(0)));
            yy = -0.695 + (((tickAnim - 200) / 40) * (0-(-0.695)));
            zz = 0 + (((tickAnim - 200) / 40) * (0-(0)));
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
            xx = 0 + (((tickAnim - 0) / 20) * (-12-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 50) {
            xx = -12 + (((tickAnim - 20) / 30) * (-6-(-12)));
            yy = 0 + (((tickAnim - 20) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 30) * (0-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 200) {
            xx = -6 + (((tickAnim - 50) / 150) * (-6-(-6)));
            yy = 0 + (((tickAnim - 50) / 150) * (0-(0)));
            zz = 0 + (((tickAnim - 50) / 150) * (0-(0)));
        }
        else if (tickAnim >= 200 && tickAnim < 240) {
            xx = -6 + (((tickAnim - 200) / 40) * (0-(-6)));
            yy = 0 + (((tickAnim - 200) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 200) / 40) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm3, rightArm3.rotateAngleX + (float) Math.toRadians(xx), rightArm3.rotateAngleY + (float) Math.toRadians(yy), rightArm3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (-0.95-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 20) / 30) * (0-(0)));
            yy = -0.95 + (((tickAnim - 20) / 30) * (-1.625-(-0.95)));
            zz = 0 + (((tickAnim - 20) / 30) * (0-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 200) {
            xx = 0 + (((tickAnim - 50) / 150) * (0-(0)));
            yy = -1.625 + (((tickAnim - 50) / 150) * (-1.625-(-1.625)));
            zz = 0 + (((tickAnim - 50) / 150) * (0-(0)));
        }
        else if (tickAnim >= 200 && tickAnim < 240) {
            xx = 0 + (((tickAnim - 200) / 40) * (0-(0)));
            yy = -1.625 + (((tickAnim - 200) / 40) * (0-(-1.625)));
            zz = 0 + (((tickAnim - 200) / 40) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightArm3.rotationPointX = this.rightArm3.rotationPointX + (float)(xx);
        this.rightArm3.rotationPointY = this.rightArm3.rotationPointY - (float)(yy);
        this.rightArm3.rotationPointZ = this.rightArm3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 0) / 50) * (4-(0)));
            yy = 0 + (((tickAnim - 0) / 50) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 50) * (0-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 60) {
            xx = 4 + (((tickAnim - 50) / 10) * (2.975-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+40))*-5-(4)));
            yy = 0 + (((tickAnim - 50) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 50) / 10) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 101) {
            xx = 2.975-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+40))*-5 + (((tickAnim - 60) / 41) * (-1.5-(2.975-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+40))*-5)));
            yy = 0 + (((tickAnim - 60) / 41) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 41) * (0-(0)));
        }
        else if (tickAnim >= 101 && tickAnim < 110) {
            xx = -1.5 + (((tickAnim - 101) / 9) * (-1.5-(-1.5)));
            yy = 0 + (((tickAnim - 101) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 101) / 9) * (0-(0)));
        }
        else if (tickAnim >= 110 && tickAnim < 140) {
            xx = -1.5 + (((tickAnim - 110) / 30) * (4-(-1.5)));
            yy = 0 + (((tickAnim - 110) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 110) / 30) * (0-(0)));
        }
        else if (tickAnim >= 140 && tickAnim < 150) {
            xx = 4 + (((tickAnim - 140) / 10) * (7.725-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+40))*5-(4)));
            yy = 0 + (((tickAnim - 140) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 140) / 10) * (0-(0)));
        }
        else if (tickAnim >= 150 && tickAnim < 191) {
            xx = 7.725-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+40))*5 + (((tickAnim - 150) / 41) * (-1.6-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+40))*5-(7.725-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+40))*5)));
            yy = 0 + (((tickAnim - 150) / 41) * (0-(0)));
            zz = 0 + (((tickAnim - 150) / 41) * (0-(0)));
        }
        else if (tickAnim >= 191 && tickAnim < 200) {
            xx = -1.6-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+40))*5 + (((tickAnim - 191) / 9) * (-2.525-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+40))*8-(-1.6-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+40))*5)));
            yy = 0 + (((tickAnim - 191) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 191) / 9) * (0-(0)));
        }
        else if (tickAnim >= 200 && tickAnim < 240) {
            xx = -2.525-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+40))*8 + (((tickAnim - 200) / 40) * (0-(-2.525-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+40))*8)));
            yy = 0 + (((tickAnim - 200) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 200) / 40) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(xx), neck2.rotateAngleY + (float) Math.toRadians(yy), neck2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 0) / 50) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 50) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 50) * (-0.725-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 50) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 50) / 10) * (0-(0)));
            zz = -0.725 + (((tickAnim - 50) / 10) * (-0.725-(-0.725)));
        }
        else if (tickAnim >= 60 && tickAnim < 101) {
            xx = 0 + (((tickAnim - 60) / 41) * (0-(0)));
            yy = 0 + (((tickAnim - 60) / 41) * (0-(0)));
            zz = -0.725 + (((tickAnim - 60) / 41) * (0.38-(-0.725)));
        }
        else if (tickAnim >= 101 && tickAnim < 110) {
            xx = 0 + (((tickAnim - 101) / 9) * (0-(0)));
            yy = 0 + (((tickAnim - 101) / 9) * (0-(0)));
            zz = 0.38 + (((tickAnim - 101) / 9) * (0.38-(0.38)));
        }
        else if (tickAnim >= 110 && tickAnim < 140) {
            xx = 0 + (((tickAnim - 110) / 30) * (0-(0)));
            yy = 0 + (((tickAnim - 110) / 30) * (0-(0)));
            zz = 0.38 + (((tickAnim - 110) / 30) * (-0.725-(0.38)));
        }
        else if (tickAnim >= 140 && tickAnim < 150) {
            xx = 0 + (((tickAnim - 140) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 140) / 10) * (0-(0)));
            zz = -0.725 + (((tickAnim - 140) / 10) * (-0.725-(-0.725)));
        }
        else if (tickAnim >= 150 && tickAnim < 191) {
            xx = 0 + (((tickAnim - 150) / 41) * (0-(0)));
            yy = 0 + (((tickAnim - 150) / 41) * (0-(0)));
            zz = -0.725 + (((tickAnim - 150) / 41) * (0.38-(-0.725)));
        }
        else if (tickAnim >= 191 && tickAnim < 200) {
            xx = 0 + (((tickAnim - 191) / 9) * (0-(0)));
            yy = 0 + (((tickAnim - 191) / 9) * (0-(0)));
            zz = 0.38 + (((tickAnim - 191) / 9) * (0.38-(0.38)));
        }
        else if (tickAnim >= 200 && tickAnim < 240) {
            xx = 0 + (((tickAnim - 200) / 40) * (0-(0)));
            yy = 0 + (((tickAnim - 200) / 40) * (0-(0)));
            zz = 0.38 + (((tickAnim - 200) / 40) * (0-(0.38)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.neck2.rotationPointX = this.neck2.rotationPointX + (float)(xx);
        this.neck2.rotationPointY = this.neck2.rotationPointY - (float)(yy);
        this.neck2.rotationPointZ = this.neck2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 0) / 50) * (7.27044-(0)));
            yy = 0 + (((tickAnim - 0) / 50) * (-0.73205-(0)));
            zz = 0 + (((tickAnim - 0) / 50) * (-1.19364-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 60) {
            xx = 7.27044 + (((tickAnim - 50) / 10) * (7.2204-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+40))*-7-(7.27044)));
            yy = -0.73205 + (((tickAnim - 50) / 10) * (-0.73205-(-0.73205)));
            zz = -1.19364 + (((tickAnim - 50) / 10) * (-1.19364-(-1.19364)));
        }
        else if (tickAnim >= 60 && tickAnim < 101) {
            xx = 7.2204-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+40))*-7 + (((tickAnim - 60) / 41) * (0.77044-(7.2204-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+40))*-7)));
            yy = -0.73205 + (((tickAnim - 60) / 41) * (-0.73205-(-0.73205)));
            zz = -1.19364 + (((tickAnim - 60) / 41) * (-1.19364-(-1.19364)));
        }
        else if (tickAnim >= 101 && tickAnim < 110) {
            xx = 0.77044 + (((tickAnim - 101) / 9) * (0.77044-(0.77044)));
            yy = -0.73205 + (((tickAnim - 101) / 9) * (-0.73205-(-0.73205)));
            zz = -1.19364 + (((tickAnim - 101) / 9) * (-1.19364-(-1.19364)));
        }
        else if (tickAnim >= 110 && tickAnim < 140) {
            xx = 0.77044 + (((tickAnim - 110) / 30) * (7.27044-(0.77044)));
            yy = -0.73205 + (((tickAnim - 110) / 30) * (-0.73205-(-0.73205)));
            zz = -1.19364 + (((tickAnim - 110) / 30) * (-1.19364-(-1.19364)));
        }
        else if (tickAnim >= 140 && tickAnim < 150) {
            xx = 7.27044 + (((tickAnim - 140) / 10) * (12.0204-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+40))*7-(7.27044)));
            yy = -0.73205 + (((tickAnim - 140) / 10) * (-0.73205-(-0.73205)));
            zz = -1.19364 + (((tickAnim - 140) / 10) * (-1.19364-(-1.19364)));
        }
        else if (tickAnim >= 150 && tickAnim < 191) {
            xx = 12.0204-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+40))*7 + (((tickAnim - 150) / 41) * (2.4204-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+40))*6-(12.0204-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+40))*7)));
            yy = -0.73205 + (((tickAnim - 150) / 41) * (-0.73205-(-0.73205)));
            zz = -1.19364 + (((tickAnim - 150) / 41) * (-1.19364-(-1.19364)));
        }
        else if (tickAnim >= 191 && tickAnim < 200) {
            xx = 2.4204-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+40))*6 + (((tickAnim - 191) / 9) * (1.4454-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+40))*9-(2.4204-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+40))*6)));
            yy = -0.73205 + (((tickAnim - 191) / 9) * (-0.73205-(-0.73205)));
            zz = -1.19364 + (((tickAnim - 191) / 9) * (-1.19364-(-1.19364)));
        }
        else if (tickAnim >= 200 && tickAnim < 240) {
            xx = 1.4454-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+40))*9 + (((tickAnim - 200) / 40) * (0-(1.4454-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+40))*9)));
            yy = -0.73205 + (((tickAnim - 200) / 40) * (0-(-0.73205)));
            zz = -1.19364 + (((tickAnim - 200) / 40) * (0-(-1.19364)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(xx), neck3.rotateAngleY + (float) Math.toRadians(yy), neck3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 0) / 50) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 50) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 50) * (-2.325-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 50) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 50) / 10) * (0-(0)));
            zz = -2.325 + (((tickAnim - 50) / 10) * (-2.325-(-2.325)));
        }
        else if (tickAnim >= 60 && tickAnim < 101) {
            xx = 0 + (((tickAnim - 60) / 41) * (0-(0)));
            yy = 0 + (((tickAnim - 60) / 41) * (0-(0)));
            zz = -2.325 + (((tickAnim - 60) / 41) * (-1.055-(-2.325)));
        }
        else if (tickAnim >= 101 && tickAnim < 110) {
            xx = 0 + (((tickAnim - 101) / 9) * (0-(0)));
            yy = 0 + (((tickAnim - 101) / 9) * (0-(0)));
            zz = -1.055 + (((tickAnim - 101) / 9) * (-1.055-(-1.055)));
        }
        else if (tickAnim >= 110 && tickAnim < 140) {
            xx = 0 + (((tickAnim - 110) / 30) * (0-(0)));
            yy = 0 + (((tickAnim - 110) / 30) * (0-(0)));
            zz = -1.055 + (((tickAnim - 110) / 30) * (-2.325-(-1.055)));
        }
        else if (tickAnim >= 140 && tickAnim < 150) {
            xx = 0 + (((tickAnim - 140) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 140) / 10) * (0-(0)));
            zz = -2.325 + (((tickAnim - 140) / 10) * (-2.325-(-2.325)));
        }
        else if (tickAnim >= 150 && tickAnim < 191) {
            xx = 0 + (((tickAnim - 150) / 41) * (0-(0)));
            yy = 0 + (((tickAnim - 150) / 41) * (0-(0)));
            zz = -2.325 + (((tickAnim - 150) / 41) * (-1.055-(-2.325)));
        }
        else if (tickAnim >= 191 && tickAnim < 200) {
            xx = 0 + (((tickAnim - 191) / 9) * (0-(0)));
            yy = 0 + (((tickAnim - 191) / 9) * (0-(0)));
            zz = -1.055 + (((tickAnim - 191) / 9) * (-1.055-(-1.055)));
        }
        else if (tickAnim >= 200 && tickAnim < 240) {
            xx = 0 + (((tickAnim - 200) / 40) * (0-(0)));
            yy = 0 + (((tickAnim - 200) / 40) * (0-(0)));
            zz = -1.055 + (((tickAnim - 200) / 40) * (0-(-1.055)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.neck3.rotationPointX = this.neck3.rotationPointX + (float)(xx);
        this.neck3.rotationPointY = this.neck3.rotationPointY - (float)(yy);
        this.neck3.rotationPointZ = this.neck3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 0) / 50) * (1-(0)));
            yy = 0 + (((tickAnim - 0) / 50) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 50) * (0-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 60) {
            xx = 1 + (((tickAnim - 50) / 10) * (3.55-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+40))*-7-(1)));
            yy = 0 + (((tickAnim - 50) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 50) / 10) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 101) {
            xx = 3.55-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+40))*-7 + (((tickAnim - 60) / 41) * (-3-(3.55-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+40))*-7)));
            yy = 0 + (((tickAnim - 60) / 41) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 41) * (0-(0)));
        }
        else if (tickAnim >= 101 && tickAnim < 110) {
            xx = -3 + (((tickAnim - 101) / 9) * (-3-(-3)));
            yy = 0 + (((tickAnim - 101) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 101) / 9) * (0-(0)));
        }
        else if (tickAnim >= 110 && tickAnim < 140) {
            xx = -3 + (((tickAnim - 110) / 30) * (2-(-3)));
            yy = 0 + (((tickAnim - 110) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 110) / 30) * (0-(0)));
        }
        else if (tickAnim >= 140 && tickAnim < 150) {
            xx = 2 + (((tickAnim - 140) / 10) * (8.375-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+40))*7-(2)));
            yy = 0 + (((tickAnim - 140) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 140) / 10) * (0-(0)));
        }
        else if (tickAnim >= 150 && tickAnim < 191) {
            xx = 8.375-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+40))*7 + (((tickAnim - 150) / 41) * (-3-(8.375-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+40))*7)));
            yy = 0 + (((tickAnim - 150) / 41) * (0-(0)));
            zz = 0 + (((tickAnim - 150) / 41) * (0-(0)));
        }
        else if (tickAnim >= 191 && tickAnim < 200) {
            xx = -3 + (((tickAnim - 191) / 9) * (-3-(-3)));
            yy = 0 + (((tickAnim - 191) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 191) / 9) * (0-(0)));
        }
        else if (tickAnim >= 200 && tickAnim < 240) {
            xx = -3 + (((tickAnim - 200) / 40) * (0-(-3)));
            yy = 0 + (((tickAnim - 200) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 200) / 40) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck4, neck4.rotateAngleX + (float) Math.toRadians(xx), neck4.rotateAngleY + (float) Math.toRadians(yy), neck4.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 0) / 50) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 50) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 50) * (-2.025-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 50) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 50) / 10) * (0-(0)));
            zz = -2.025 + (((tickAnim - 50) / 10) * (-2.025-(-2.025)));
        }
        else if (tickAnim >= 60 && tickAnim < 101) {
            xx = 0 + (((tickAnim - 60) / 41) * (0-(0)));
            yy = 0 + (((tickAnim - 60) / 41) * (0-(0)));
            zz = -2.025 + (((tickAnim - 60) / 41) * (-1.07-(-2.025)));
        }
        else if (tickAnim >= 101 && tickAnim < 110) {
            xx = 0 + (((tickAnim - 101) / 9) * (0-(0)));
            yy = 0 + (((tickAnim - 101) / 9) * (0-(0)));
            zz = -1.07 + (((tickAnim - 101) / 9) * (-1.07-(-1.07)));
        }
        else if (tickAnim >= 110 && tickAnim < 140) {
            xx = 0 + (((tickAnim - 110) / 30) * (0-(0)));
            yy = 0 + (((tickAnim - 110) / 30) * (0-(0)));
            zz = -1.07 + (((tickAnim - 110) / 30) * (-2.025-(-1.07)));
        }
        else if (tickAnim >= 140 && tickAnim < 150) {
            xx = 0 + (((tickAnim - 140) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 140) / 10) * (0-(0)));
            zz = -2.025 + (((tickAnim - 140) / 10) * (-2.025-(-2.025)));
        }
        else if (tickAnim >= 150 && tickAnim < 191) {
            xx = 0 + (((tickAnim - 150) / 41) * (0-(0)));
            yy = 0 + (((tickAnim - 150) / 41) * (0-(0)));
            zz = -2.025 + (((tickAnim - 150) / 41) * (-1.07-(-2.025)));
        }
        else if (tickAnim >= 191 && tickAnim < 200) {
            xx = 0 + (((tickAnim - 191) / 9) * (0-(0)));
            yy = 0 + (((tickAnim - 191) / 9) * (0-(0)));
            zz = -1.07 + (((tickAnim - 191) / 9) * (-1.07-(-1.07)));
        }
        else if (tickAnim >= 200 && tickAnim < 240) {
            xx = 0 + (((tickAnim - 200) / 40) * (0-(0)));
            yy = 0 + (((tickAnim - 200) / 40) * (0-(0)));
            zz = -1.07 + (((tickAnim - 200) / 40) * (0-(-1.07)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.neck4.rotationPointX = this.neck4.rotationPointX + (float)(xx);
        this.neck4.rotationPointY = this.neck4.rotationPointY - (float)(yy);
        this.neck4.rotationPointZ = this.neck4.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 0) / 50) * (-7.5-(0)));
            yy = 0 + (((tickAnim - 0) / 50) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 50) * (0-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 60) {
            xx = -7.5 + (((tickAnim - 50) / 10) * (-5.55-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+40))*15-(-7.5)));
            yy = 0 + (((tickAnim - 50) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 50) / 10) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 101) {
            xx = -5.55-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+40))*15 + (((tickAnim - 60) / 41) * (0-(-5.55-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+40))*15)));
            yy = 0 + (((tickAnim - 60) / 41) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 41) * (0-(0)));
        }
        else if (tickAnim >= 101 && tickAnim < 110) {
            xx = 0 + (((tickAnim - 101) / 9) * (0-(0)));
            yy = 0 + (((tickAnim - 101) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 101) / 9) * (0-(0)));
        }
        else if (tickAnim >= 110 && tickAnim < 140) {
            xx = 0 + (((tickAnim - 110) / 30) * (-7.5-(0)));
            yy = 0 + (((tickAnim - 110) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 110) / 30) * (0-(0)));
        }
        else if (tickAnim >= 140 && tickAnim < 150) {
            xx = -7.5 + (((tickAnim - 140) / 10) * (-17.825-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+40))*-15-(-7.5)));
            yy = 0 + (((tickAnim - 140) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 140) / 10) * (0-(0)));
        }
        else if (tickAnim >= 150 && tickAnim < 191) {
            xx = -17.825-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+40))*-15 + (((tickAnim - 150) / 41) * (-4.025-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+40))*-5-(-17.825-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+40))*-15)));
            yy = 0 + (((tickAnim - 150) / 41) * (0-(0)));
            zz = 0 + (((tickAnim - 150) / 41) * (0-(0)));
        }
        else if (tickAnim >= 191 && tickAnim < 200) {
            xx = -4.025-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+40))*-5 + (((tickAnim - 191) / 9) * (-1.875-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+40))*-5-(-4.025-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+40))*-5)));
            yy = 0 + (((tickAnim - 191) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 191) / 9) * (0-(0)));
        }
        else if (tickAnim >= 200 && tickAnim < 240) {
            xx = -1.875-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+40))*-5 + (((tickAnim - 200) / 40) * (0-(-1.875-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+40))*-5)));
            yy = 0 + (((tickAnim - 200) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 200) / 40) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck5, neck5.rotateAngleX + (float) Math.toRadians(xx), neck5.rotateAngleY + (float) Math.toRadians(yy), neck5.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 0) / 50) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 50) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 50) * (-0.65-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 50) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 50) / 10) * (0-(0)));
            zz = -0.65 + (((tickAnim - 50) / 10) * (-0.65-(-0.65)));
        }
        else if (tickAnim >= 60 && tickAnim < 140) {
            xx = 0 + (((tickAnim - 60) / 80) * (0-(0)));
            yy = 0 + (((tickAnim - 60) / 80) * (0-(0)));
            zz = -0.65 + (((tickAnim - 60) / 80) * (-0.65-(-0.65)));
        }
        else if (tickAnim >= 140 && tickAnim < 150) {
            xx = 0 + (((tickAnim - 140) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 140) / 10) * (0-(0)));
            zz = -0.65 + (((tickAnim - 140) / 10) * (-0.65-(-0.65)));
        }
        else if (tickAnim >= 150 && tickAnim < 240) {
            xx = 0 + (((tickAnim - 150) / 90) * (0-(0)));
            yy = 0 + (((tickAnim - 150) / 90) * (0-(0)));
            zz = -0.65 + (((tickAnim - 150) / 90) * (0-(-0.65)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.neck5.rotationPointX = this.neck5.rotationPointX + (float)(xx);
        this.neck5.rotationPointY = this.neck5.rotationPointY - (float)(yy);
        this.neck5.rotationPointZ = this.neck5.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 0) / 50) * (-18.25-(0)));
            yy = 0 + (((tickAnim - 0) / 50) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 50) * (0-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 60) {
            xx = -18.25 + (((tickAnim - 50) / 10) * (-31.3-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+60))*40-(-18.25)));
            yy = 0 + (((tickAnim - 50) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 50) / 10) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 101) {
            xx = -31.3-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+60))*40 + (((tickAnim - 60) / 41) * (0-(-31.3-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+60))*40)));
            yy = 0 + (((tickAnim - 60) / 41) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 41) * (0-(0)));
        }
        else if (tickAnim >= 101 && tickAnim < 110) {
            xx = 0 + (((tickAnim - 101) / 9) * (0-(0)));
            yy = 0 + (((tickAnim - 101) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 101) / 9) * (0-(0)));
        }
        else if (tickAnim >= 110 && tickAnim < 140) {
            xx = 0 + (((tickAnim - 110) / 30) * (-18.25-(0)));
            yy = 0 + (((tickAnim - 110) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 110) / 30) * (0-(0)));
        }
        else if (tickAnim >= 140 && tickAnim < 150) {
            xx = -18.25 + (((tickAnim - 140) / 10) * (-57.225-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+60))*-40-(-18.25)));
            yy = 0 + (((tickAnim - 140) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 140) / 10) * (0-(0)));
        }
        else if (tickAnim >= 150 && tickAnim < 191) {
            xx = -57.225-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+60))*-40 + (((tickAnim - 150) / 41) * (-10.75-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+60))*-40-(-57.225-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+60))*-40)));
            yy = 0 + (((tickAnim - 150) / 41) * (0-(0)));
            zz = 0 + (((tickAnim - 150) / 41) * (0-(0)));
        }
        else if (tickAnim >= 191 && tickAnim < 200) {
            xx = -10.75-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+60))*-40 + (((tickAnim - 191) / 9) * (-1.35-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+60))*-35-(-10.75-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+60))*-40)));
            yy = 0 + (((tickAnim - 191) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 191) / 9) * (0-(0)));
        }
        else if (tickAnim >= 200 && tickAnim < 240) {
            xx = -1.35-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+60))*-35 + (((tickAnim - 200) / 40) * (0-(-1.35-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+60))*-35)));
            yy = 0 + (((tickAnim - 200) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 200) / 40) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck6, neck6.rotateAngleX + (float) Math.toRadians(xx), neck6.rotateAngleY + (float) Math.toRadians(yy), neck6.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 0) / 50) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 50) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 50) * (-0.475-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 50) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 50) / 10) * (0-(0)));
            zz = -0.475 + (((tickAnim - 50) / 10) * (-0.475-(-0.475)));
        }
        else if (tickAnim >= 60 && tickAnim < 81) {
            xx = 0 + (((tickAnim - 60) / 21) * (0-(0)));
            yy = 0 + (((tickAnim - 60) / 21) * (0.2-(0)));
            zz = -0.475 + (((tickAnim - 60) / 21) * (-0.045-(-0.475)));
        }
        else if (tickAnim >= 81 && tickAnim < 101) {
            xx = 0 + (((tickAnim - 81) / 20) * (0-(0)));
            yy = 0.2 + (((tickAnim - 81) / 20) * (0-(0.2)));
            zz = -0.045 + (((tickAnim - 81) / 20) * (0-(-0.045)));
        }
        else if (tickAnim >= 101 && tickAnim < 140) {
            xx = 0 + (((tickAnim - 101) / 39) * (0-(0)));
            yy = 0 + (((tickAnim - 101) / 39) * (0-(0)));
            zz = 0 + (((tickAnim - 101) / 39) * (-0.475-(0)));
        }
        else if (tickAnim >= 140 && tickAnim < 150) {
            xx = 0 + (((tickAnim - 140) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 140) / 10) * (0-(0)));
            zz = -0.475 + (((tickAnim - 140) / 10) * (-0.475-(-0.475)));
        }
        else if (tickAnim >= 150 && tickAnim < 191) {
            xx = 0 + (((tickAnim - 150) / 41) * (0-(0)));
            yy = 0 + (((tickAnim - 150) / 41) * (0-(0)));
            zz = -0.475 + (((tickAnim - 150) / 41) * (0-(-0.475)));
        }
        else if (tickAnim >= 191 && tickAnim < 240) {
            xx = 0 + (((tickAnim - 191) / 49) * (0-(0)));
            yy = 0 + (((tickAnim - 191) / 49) * (0-(0)));
            zz = 0 + (((tickAnim - 191) / 49) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.neck6.rotationPointX = this.neck6.rotationPointX + (float)(xx);
        this.neck6.rotationPointY = this.neck6.rotationPointY - (float)(yy);
        this.neck6.rotationPointZ = this.neck6.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 24) {
            xx = 0 + (((tickAnim - 0) / 24) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 24) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 24) * (0-(0)));
        }
        else if (tickAnim >= 24 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 24) / 26) * (-18.75-(0)));
            yy = 0 + (((tickAnim - 24) / 26) * (0-(0)));
            zz = 0 + (((tickAnim - 24) / 26) * (-5-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 60) {
            xx = -18.75 + (((tickAnim - 50) / 10) * (-18.75-(-18.75)));
            yy = 0 + (((tickAnim - 50) / 10) * (0-(0)));
            zz = -5 + (((tickAnim - 50) / 10) * (-5-(-5)));
        }
        else if (tickAnim >= 60 && tickAnim < 101) {
            xx = -18.75 + (((tickAnim - 60) / 41) * (0-(-18.75)));
            yy = 0 + (((tickAnim - 60) / 41) * (0-(0)));
            zz = -5 + (((tickAnim - 60) / 41) * (0-(-5)));
        }
        else if (tickAnim >= 101 && tickAnim < 110) {
            xx = 0 + (((tickAnim - 101) / 9) * (0-(0)));
            yy = 0 + (((tickAnim - 101) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 101) / 9) * (0-(0)));
        }
        else if (tickAnim >= 110 && tickAnim < 140) {
            xx = 0 + (((tickAnim - 110) / 30) * (-18.75-(0)));
            yy = 0 + (((tickAnim - 110) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 110) / 30) * (-5-(0)));
        }
        else if (tickAnim >= 140 && tickAnim < 150) {
            xx = -18.75 + (((tickAnim - 140) / 10) * (-18.75-(-18.75)));
            yy = 0 + (((tickAnim - 140) / 10) * (0-(0)));
            zz = -5 + (((tickAnim - 140) / 10) * (-5-(-5)));
        }
        else if (tickAnim >= 150 && tickAnim < 191) {
            xx = -18.75 + (((tickAnim - 150) / 41) * (0-(-18.75)));
            yy = 0 + (((tickAnim - 150) / 41) * (0-(0)));
            zz = -5 + (((tickAnim - 150) / 41) * (0-(-5)));
        }
        else if (tickAnim >= 191 && tickAnim < 200) {
            xx = 0 + (((tickAnim - 191) / 9) * (0-(0)));
            yy = 0 + (((tickAnim - 191) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 191) / 9) * (0-(0)));
        }
        else if (tickAnim >= 200 && tickAnim < 240) {
            xx = 0 + (((tickAnim - 200) / 40) * (0-(0)));
            yy = 0 + (((tickAnim - 200) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 200) / 40) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 1 + (((tickAnim - 0) / 10) * (1-(1)));
            yy = 1 + (((tickAnim - 0) / 10) * (0-(1)));
            zz = 1 + (((tickAnim - 0) / 10) * (1-(1)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 1 + (((tickAnim - 10) / 10) * (1-(1)));
            yy = 0 + (((tickAnim - 10) / 10) * (1-(0)));
            zz = 1 + (((tickAnim - 10) / 10) * (1-(1)));
        }
        else {
            xx = 1;
            yy = 1;
            zz = 1;
        }
        this.eyes.setScale((float)xx, (float)yy, (float)zz);




        if (tickAnim >= 0 && tickAnim < 24) {
            xx = 0 + (((tickAnim - 0) / 24) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 24) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 24) * (0-(0)));
        }
        else if (tickAnim >= 24 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 24) / 26) * (26.75-(0)));
            yy = 0 + (((tickAnim - 24) / 26) * (0-(0)));
            zz = 0 + (((tickAnim - 24) / 26) * (0-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 60) {
            xx = 26.75 + (((tickAnim - 50) / 10) * (0-(26.75)));
            yy = 0 + (((tickAnim - 50) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 50) / 10) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 110) {
            xx = 0 + (((tickAnim - 60) / 50) * (0-(0)));
            yy = 0 + (((tickAnim - 60) / 50) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 50) * (0-(0)));
        }
        else if (tickAnim >= 110 && tickAnim < 140) {
            xx = 0 + (((tickAnim - 110) / 30) * (26.75-(0)));
            yy = 0 + (((tickAnim - 110) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 110) / 30) * (0-(0)));
        }
        else if (tickAnim >= 140 && tickAnim < 150) {
            xx = 26.75 + (((tickAnim - 140) / 10) * (0-(26.75)));
            yy = 0 + (((tickAnim - 140) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 140) / 10) * (0-(0)));
        }
        else if (tickAnim >= 150 && tickAnim < 200) {
            xx = 0 + (((tickAnim - 150) / 50) * (0-(0)));
            yy = 0 + (((tickAnim - 150) / 50) * (0-(0)));
            zz = 0 + (((tickAnim - 150) / 50) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(xx), jaw.rotateAngleY + (float) Math.toRadians(yy), jaw.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (-4.43-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*15-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = -4.43-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*15 + (((tickAnim - 10) / 10) * (-7.25-(-4.43-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*15)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 50) {
            xx = -7.25 + (((tickAnim - 20) / 30) * (-3.5-(-7.25)));
            yy = 0 + (((tickAnim - 20) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 30) * (0-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 200) {
            xx = -3.5 + (((tickAnim - 50) / 150) * (-3.5-(-3.5)));
            yy = 0 + (((tickAnim - 50) / 150) * (0-(0)));
            zz = 0 + (((tickAnim - 50) / 150) * (0-(0)));
        }
        else if (tickAnim >= 200 && tickAnim < 218) {
            xx = -3.5 + (((tickAnim - 200) / 18) * (5.85-(-3.5)));
            yy = 0 + (((tickAnim - 200) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 200) / 18) * (0-(0)));
        }
        else if (tickAnim >= 218 && tickAnim < 230) {
            xx = 5.85 + (((tickAnim - 218) / 12) * (5-(5.85)));
            yy = 0 + (((tickAnim - 218) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 218) / 12) * (0-(0)));
        }
        else if (tickAnim >= 230 && tickAnim < 240) {
            xx = 5 + (((tickAnim - 230) / 10) * (0-(5)));
            yy = 0 + (((tickAnim - 230) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 230) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg, rightLeg.rotateAngleX + (float) Math.toRadians(xx), rightLeg.rotateAngleY + (float) Math.toRadians(yy), rightLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (8.0463-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-15-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (-0.0964-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (-0.05253-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 8.0463-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-15 + (((tickAnim - 5) / 5) * (34.2176-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*55-(8.0463-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-15)));
            yy = -0.0964 + (((tickAnim - 5) / 5) * (-0.19281-(-0.0964)));
            zz = -0.05253 + (((tickAnim - 5) / 5) * (-0.10506-(-0.05253)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 34.2176-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*55 + (((tickAnim - 10) / 10) * (-10.61483-(34.2176-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*55)));
            yy = -0.19281 + (((tickAnim - 10) / 10) * (-0.38562-(-0.19281)));
            zz = -0.10506 + (((tickAnim - 10) / 10) * (-0.21012-(-0.10506)));
        }
        else if (tickAnim >= 20 && tickAnim < 50) {
            xx = -10.61483 + (((tickAnim - 20) / 30) * (-10.61483-(-10.61483)));
            yy = -0.38562 + (((tickAnim - 20) / 30) * (-0.38562-(-0.38562)));
            zz = -0.21012 + (((tickAnim - 20) / 30) * (-0.21012-(-0.21012)));
        }
        else if (tickAnim >= 50 && tickAnim < 200) {
            xx = -10.61483 + (((tickAnim - 50) / 150) * (-10.61483-(-10.61483)));
            yy = -0.38562 + (((tickAnim - 50) / 150) * (-0.38562-(-0.38562)));
            zz = -0.21012 + (((tickAnim - 50) / 150) * (-0.21012-(-0.21012)));
        }
        else if (tickAnim >= 200 && tickAnim < 218) {
            xx = -10.61483 + (((tickAnim - 200) / 18) * (-13.0997-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-180))*-70-(-10.61483)));
            yy = -0.38562 + (((tickAnim - 200) / 18) * (-0.20888-(-0.38562)));
            zz = -0.21012 + (((tickAnim - 200) / 18) * (-0.11382-(-0.21012)));
        }
        else if (tickAnim >= 218 && tickAnim < 230) {
            xx = -13.0997-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-180))*-70 + (((tickAnim - 218) / 12) * (0-(-13.0997-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-180))*-70)));
            yy = -0.20888 + (((tickAnim - 218) / 12) * (0-(-0.20888)));
            zz = -0.11382 + (((tickAnim - 218) / 12) * (0-(-0.11382)));
        }
        else if (tickAnim >= 230 && tickAnim < 240) {
            xx = 0 + (((tickAnim - 230) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 230) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 230) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg2, rightLeg2.rotateAngleX + (float) Math.toRadians(xx), rightLeg2.rotateAngleY + (float) Math.toRadians(yy), rightLeg2.rotateAngleZ + (float) Math.toRadians(zz));


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
        else if (tickAnim >= 20 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 20) / 30) * (0-(0)));
            yy = 0 + (((tickAnim - 20) / 30) * (1.775-(0)));
            zz = 0 + (((tickAnim - 20) / 30) * (0-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 200) {
            xx = 0 + (((tickAnim - 50) / 150) * (0-(0)));
            yy = 1.775 + (((tickAnim - 50) / 150) * (1.775-(1.775)));
            zz = 0 + (((tickAnim - 50) / 150) * (0-(0)));
        }
        else if (tickAnim >= 200 && tickAnim < 219) {
            xx = 0 + (((tickAnim - 200) / 19) * (0-(0)));
            yy = 1.775 + (((tickAnim - 200) / 19) * (5.24-(1.775)));
            zz = 0 + (((tickAnim - 200) / 19) * (0.12-(0)));
        }
        else if (tickAnim >= 219 && tickAnim < 230) {
            xx = 0 + (((tickAnim - 219) / 11) * (0-(0)));
            yy = 5.24 + (((tickAnim - 219) / 11) * (0-(5.24)));
            zz = 0.12 + (((tickAnim - 219) / 11) * (0-(0.12)));
        }
        else if (tickAnim >= 230 && tickAnim < 240) {
            xx = 0 + (((tickAnim - 230) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 230) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 230) / 10) * (0-(0)));
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
            xx = 0 + (((tickAnim - 0) / 10) * (21.75-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 21.75 + (((tickAnim - 10) / 10) * (18.5-(21.75)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 50) {
            xx = 18.5 + (((tickAnim - 20) / 30) * (16.5-(18.5)));
            yy = 0 + (((tickAnim - 20) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 30) * (0-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 200) {
            xx = 16.5 + (((tickAnim - 50) / 150) * (16.5-(16.5)));
            yy = 0 + (((tickAnim - 50) / 150) * (0-(0)));
            zz = 0 + (((tickAnim - 50) / 150) * (0-(0)));
        }
        else if (tickAnim >= 200 && tickAnim < 218) {
            xx = 16.5 + (((tickAnim - 200) / 18) * (24.5-(16.5)));
            yy = 0 + (((tickAnim - 200) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 200) / 18) * (0-(0)));
        }
        else if (tickAnim >= 218 && tickAnim < 230) {
            xx = 24.5 + (((tickAnim - 218) / 12) * (-5.75-(24.5)));
            yy = 0 + (((tickAnim - 218) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 218) / 12) * (0-(0)));
        }
        else if (tickAnim >= 230 && tickAnim < 240) {
            xx = -5.75 + (((tickAnim - 230) / 10) * (0-(-5.75)));
            yy = 0 + (((tickAnim - 230) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 230) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg3, rightLeg3.rotateAngleX + (float) Math.toRadians(xx), rightLeg3.rotateAngleY + (float) Math.toRadians(yy), rightLeg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (1.935-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            yy = 1.935 + (((tickAnim - 10) / 10) * (1.45-(1.935)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 20) / 30) * (0-(0)));
            yy = 1.45 + (((tickAnim - 20) / 30) * (0.65-(1.45)));
            zz = 0 + (((tickAnim - 20) / 30) * (0-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 200) {
            xx = 0 + (((tickAnim - 50) / 150) * (0-(0)));
            yy = 0.65 + (((tickAnim - 50) / 150) * (0.65-(0.65)));
            zz = 0 + (((tickAnim - 50) / 150) * (0-(0)));
        }
        else if (tickAnim >= 200 && tickAnim < 218) {
            xx = 0 + (((tickAnim - 200) / 18) * (0-(0)));
            yy = 0.65 + (((tickAnim - 200) / 18) * (1.26-(0.65)));
            zz = 0 + (((tickAnim - 200) / 18) * (0-(0)));
        }
        else if (tickAnim >= 218 && tickAnim < 230) {
            xx = 0 + (((tickAnim - 218) / 12) * (0-(0)));
            yy = 1.26 + (((tickAnim - 218) / 12) * (-0.275-(1.26)));
            zz = 0 + (((tickAnim - 218) / 12) * (0-(0)));
        }
        else if (tickAnim >= 230 && tickAnim < 240) {
            xx = 0 + (((tickAnim - 230) / 10) * (0-(0)));
            yy = -0.275 + (((tickAnim - 230) / 10) * (0-(-0.275)));
            zz = 0 + (((tickAnim - 230) / 10) * (0-(0)));
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
    public void animNest(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraAragosaurus entity = (EntityPrehistoricFloraAragosaurus) entitylivingbaseIn;
        int animCycle = 50;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        if (tickAnim >= 0 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 0) / 23) * (18.5-(0)));
            yy = 0 + (((tickAnim - 0) / 23) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 23) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 40) {
            xx = 18.5 + (((tickAnim - 23) / 17) * (-19.835-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+40))*-50-(18.5)));
            yy = 0 + (((tickAnim - 23) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 17) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = -19.835-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+40))*-50 + (((tickAnim - 40) / 10) * (0-(-19.835-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+40))*-50)));
            yy = 0 + (((tickAnim - 40) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg, leftLeg.rotateAngleX + (float) Math.toRadians(xx), leftLeg.rotateAngleY + (float) Math.toRadians(yy), leftLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 26) {
            xx = 0 + (((tickAnim - 0) / 26) * (16.21216-(0)));
            yy = 0 + (((tickAnim - 0) / 26) * (-0.23008-(0)));
            zz = 0 + (((tickAnim - 0) / 26) * (-0.56207-(0)));
        }
        else if (tickAnim >= 26 && tickAnim < 34) {
            xx = 16.21216 + (((tickAnim - 26) / 8) * (10.40912-(16.21216)));
            yy = -0.23008 + (((tickAnim - 26) / 8) * (-0.17256-(-0.23008)));
            zz = -0.56207 + (((tickAnim - 26) / 8) * (-0.42156-(-0.56207)));
        }
        else if (tickAnim >= 34 && tickAnim < 44) {
            xx = 10.40912 + (((tickAnim - 34) / 10) * (2.75-(10.40912)));
            yy = -0.17256 + (((tickAnim - 34) / 10) * (0-(-0.17256)));
            zz = -0.42156 + (((tickAnim - 34) / 10) * (0-(-0.42156)));
        }
        else if (tickAnim >= 44 && tickAnim < 50) {
            xx = 2.75 + (((tickAnim - 44) / 6) * (0-(2.75)));
            yy = 0 + (((tickAnim - 44) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 44) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg2, leftLeg2.rotateAngleX + (float) Math.toRadians(xx), leftLeg2.rotateAngleY + (float) Math.toRadians(yy), leftLeg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 26) {
            xx = 0 + (((tickAnim - 0) / 26) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 26) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 26) * (0-(0)));
        }
        else if (tickAnim >= 26 && tickAnim < 34) {
            xx = 0 + (((tickAnim - 26) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 26) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 26) / 8) * (0-(0)));
        }
        else if (tickAnim >= 34 && tickAnim < 44) {
            xx = 0 + (((tickAnim - 34) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 34) / 10) * (0.65-(0)));
            zz = 0 + (((tickAnim - 34) / 10) * (0-(0)));
        }
        else if (tickAnim >= 44 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 44) / 6) * (0-(0)));
            yy = 0.65 + (((tickAnim - 44) / 6) * (0-(0.65)));
            zz = 0 + (((tickAnim - 44) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftLeg2.rotationPointX = this.leftLeg2.rotationPointX + (float)(xx);
        this.leftLeg2.rotationPointY = this.leftLeg2.rotationPointY - (float)(yy);
        this.leftLeg2.rotationPointZ = this.leftLeg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 26) {
            xx = 0 + (((tickAnim - 0) / 26) * (19.5-(0)));
            yy = 0 + (((tickAnim - 0) / 26) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 26) * (0-(0)));
        }
        else if (tickAnim >= 26 && tickAnim < 44) {
            xx = 19.5 + (((tickAnim - 26) / 18) * (0-(19.5)));
            yy = 0 + (((tickAnim - 26) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 26) / 18) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg3, leftLeg3.rotateAngleX + (float) Math.toRadians(xx), leftLeg3.rotateAngleY + (float) Math.toRadians(yy), leftLeg3.rotateAngleZ + (float) Math.toRadians(zz));

    }
    public void animLay(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraAragosaurus entity = (EntityPrehistoricFloraAragosaurus) entitylivingbaseIn;
        int animCycle = 50;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (-9.5-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 33) {
            xx = -9.5 + (((tickAnim - 18) / 15) * (-9.5-(-9.5)));
            yy = 0 + (((tickAnim - 18) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 15) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 50) {
            xx = -9.5 + (((tickAnim - 33) / 17) * (0-(-9.5)));
            yy = 0 + (((tickAnim - 33) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 17) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(main, main.rotateAngleX + (float) Math.toRadians(xx), main.rotateAngleY + (float) Math.toRadians(yy), main.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (-8.9-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 18) / 15) * (0-(0)));
            yy = -8.9 + (((tickAnim - 18) / 15) * (-8.9-(-8.9)));
            zz = 0 + (((tickAnim - 18) / 15) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 33) / 17) * (0-(0)));
            yy = -8.9 + (((tickAnim - 33) / 17) * (0-(-8.9)));
            zz = 0 + (((tickAnim - 33) / 17) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.main.rotationPointX = this.main.rotationPointX + (float)(xx);
        this.main.rotationPointY = this.main.rotationPointY - (float)(yy);
        this.main.rotationPointZ = this.main.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (6.25-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 33) {
            xx = 6.25 + (((tickAnim - 18) / 15) * (6.25-(6.25)));
            yy = 0 + (((tickAnim - 18) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 15) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 50) {
            xx = 6.25 + (((tickAnim - 33) / 17) * (0-(6.25)));
            yy = 0 + (((tickAnim - 33) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 17) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg, leftLeg.rotateAngleX + (float) Math.toRadians(xx), leftLeg.rotateAngleY + (float) Math.toRadians(yy), leftLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (26.5-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 33) {
            xx = 26.5 + (((tickAnim - 18) / 15) * (26.5-(26.5)));
            yy = 0 + (((tickAnim - 18) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 15) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 50) {
            xx = 26.5 + (((tickAnim - 33) / 17) * (0-(26.5)));
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
            yy = 0 + (((tickAnim - 0) / 18) * (2.225-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (-1-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 18) / 15) * (0-(0)));
            yy = 2.225 + (((tickAnim - 18) / 15) * (2.225-(2.225)));
            zz = -1 + (((tickAnim - 18) / 15) * (-1-(-1)));
        }
        else if (tickAnim >= 33 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 33) / 17) * (0-(0)));
            yy = 2.225 + (((tickAnim - 33) / 17) * (0-(2.225)));
            zz = -1 + (((tickAnim - 33) / 17) * (0-(-1)));
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
            xx = 0 + (((tickAnim - 0) / 18) * (-24-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 33) {
            xx = -24 + (((tickAnim - 18) / 15) * (-24-(-24)));
            yy = 0 + (((tickAnim - 18) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 15) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 50) {
            xx = -24 + (((tickAnim - 33) / 17) * (0-(-24)));
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
            xx = 0 + (((tickAnim - 0) / 18) * (-9.5-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 33) {
            xx = -9.5 + (((tickAnim - 18) / 15) * (-9.5-(-9.5)));
            yy = 0 + (((tickAnim - 18) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 15) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 50) {
            xx = -9.5 + (((tickAnim - 33) / 17) * (0-(-9.5)));
            yy = 0 + (((tickAnim - 33) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 17) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail, tail.rotateAngleX + (float) Math.toRadians(xx), tail.rotateAngleY + (float) Math.toRadians(yy), tail.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 8) / 10) * (-9.25-(0)));
            yy = 0 + (((tickAnim - 8) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 10) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 33) {
            xx = -9.25 + (((tickAnim - 18) / 15) * (-9.25-(-9.25)));
            yy = 0 + (((tickAnim - 18) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 15) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 50) {
            xx = -9.25 + (((tickAnim - 33) / 17) * (0-(-9.25)));
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
            xx = 0 + (((tickAnim - 0) / 18) * (-4.25-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 33) {
            xx = -4.25 + (((tickAnim - 18) / 15) * (-4.25-(-4.25)));
            yy = 0 + (((tickAnim - 18) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 15) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 50) {
            xx = -4.25 + (((tickAnim - 33) / 17) * (0-(-4.25)));
            yy = 0 + (((tickAnim - 33) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 17) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(xx), tail3.rotateAngleY + (float) Math.toRadians(yy), tail3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (4.5-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 33) {
            xx = 4.5 + (((tickAnim - 18) / 15) * (4.5-(4.5)));
            yy = 0 + (((tickAnim - 18) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 15) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 50) {
            xx = 4.5 + (((tickAnim - 33) / 17) * (0-(4.5)));
            yy = 0 + (((tickAnim - 33) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 17) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(xx), tail4.rotateAngleY + (float) Math.toRadians(yy), tail4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 0) / 12) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 12) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 12) / 6) * (10.75-(0)));
            yy = 0 + (((tickAnim - 12) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 6) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 33) {
            xx = 10.75 + (((tickAnim - 18) / 15) * (10.75-(10.75)));
            yy = 0 + (((tickAnim - 18) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 15) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 42) {
            xx = 10.75 + (((tickAnim - 33) / 9) * (0-(10.75)));
            yy = 0 + (((tickAnim - 33) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 9) * (0-(0)));
        }
        else if (tickAnim >= 42 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 42) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 42) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 42) / 8) * (0-(0)));
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
        else if (tickAnim >= 11 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 11) / 7) * (11.5-(0)));
            yy = 0 + (((tickAnim - 11) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 7) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 33) {
            xx = 11.5 + (((tickAnim - 18) / 15) * (11.5-(11.5)));
            yy = 0 + (((tickAnim - 18) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 15) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 42) {
            xx = 11.5 + (((tickAnim - 33) / 9) * (0-(11.5)));
            yy = 0 + (((tickAnim - 33) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 9) * (0-(0)));
        }
        else if (tickAnim >= 42 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 42) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 42) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 42) / 8) * (0-(0)));
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
        else if (tickAnim >= 11 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 11) / 7) * (17.75-(0)));
            yy = 0 + (((tickAnim - 11) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 7) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 33) {
            xx = 17.75 + (((tickAnim - 18) / 15) * (17.75-(17.75)));
            yy = 0 + (((tickAnim - 18) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 15) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 42) {
            xx = 17.75 + (((tickAnim - 33) / 9) * (0-(17.75)));
            yy = 0 + (((tickAnim - 33) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 9) * (0-(0)));
        }
        else if (tickAnim >= 42 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 42) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 42) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 42) / 8) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail7, tail7.rotateAngleX + (float) Math.toRadians(xx), tail7.rotateAngleY + (float) Math.toRadians(yy), tail7.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 0) / 11) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 11) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 11) / 7) * (7-(0)));
            yy = 0 + (((tickAnim - 11) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 7) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 33) {
            xx = 7 + (((tickAnim - 18) / 15) * (7-(7)));
            yy = 0 + (((tickAnim - 18) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 15) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 42) {
            xx = 7 + (((tickAnim - 33) / 9) * (0-(7)));
            yy = 0 + (((tickAnim - 33) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 9) * (0-(0)));
        }
        else if (tickAnim >= 42 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 42) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 42) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 42) / 8) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail8, tail8.rotateAngleX + (float) Math.toRadians(xx), tail8.rotateAngleY + (float) Math.toRadians(yy), tail8.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (2.75-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 33) {
            xx = 2.75 + (((tickAnim - 18) / 15) * (2.75-(2.75)));
            yy = 0 + (((tickAnim - 18) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 15) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 50) {
            xx = 2.75 + (((tickAnim - 33) / 17) * (0-(2.75)));
            yy = 0 + (((tickAnim - 33) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 17) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(xx), body.rotateAngleY + (float) Math.toRadians(yy), body.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (5.25-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 33) {
            xx = 5.25 + (((tickAnim - 18) / 15) * (5.25-(5.25)));
            yy = 0 + (((tickAnim - 18) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 15) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 50) {
            xx = 5.25 + (((tickAnim - 33) / 17) * (0-(5.25)));
            yy = 0 + (((tickAnim - 33) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 17) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body2, body2.rotateAngleX + (float) Math.toRadians(xx), body2.rotateAngleY + (float) Math.toRadians(yy), body2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (3-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 33) {
            xx = 3 + (((tickAnim - 18) / 15) * (3-(3)));
            yy = 0 + (((tickAnim - 18) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 15) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 50) {
            xx = 3 + (((tickAnim - 33) / 17) * (0-(3)));
            yy = 0 + (((tickAnim - 33) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 17) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm, leftArm.rotateAngleX + (float) Math.toRadians(xx), leftArm.rotateAngleY + (float) Math.toRadians(yy), leftArm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (-20.5-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 33) {
            xx = -20.5 + (((tickAnim - 18) / 15) * (-20.5-(-20.5)));
            yy = 0 + (((tickAnim - 18) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 15) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 50) {
            xx = -20.5 + (((tickAnim - 33) / 17) * (0-(-20.5)));
            yy = 0 + (((tickAnim - 33) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 17) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm2, leftArm2.rotateAngleX + (float) Math.toRadians(xx), leftArm2.rotateAngleY + (float) Math.toRadians(yy), leftArm2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (1.325-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 18) / 15) * (0-(0)));
            yy = 1.325 + (((tickAnim - 18) / 15) * (1.325-(1.325)));
            zz = 0 + (((tickAnim - 18) / 15) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 33) / 17) * (0-(0)));
            yy = 1.325 + (((tickAnim - 33) / 17) * (0-(1.325)));
            zz = 0 + (((tickAnim - 33) / 17) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftArm2.rotationPointX = this.leftArm2.rotationPointX + (float)(xx);
        this.leftArm2.rotationPointY = this.leftArm2.rotationPointY - (float)(yy);
        this.leftArm2.rotationPointZ = this.leftArm2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (19.5-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 33) {
            xx = 19.5 + (((tickAnim - 18) / 15) * (19.5-(19.5)));
            yy = 0 + (((tickAnim - 18) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 15) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 50) {
            xx = 19.5 + (((tickAnim - 33) / 17) * (0-(19.5)));
            yy = 0 + (((tickAnim - 33) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 17) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm3, leftArm3.rotateAngleX + (float) Math.toRadians(xx), leftArm3.rotateAngleY + (float) Math.toRadians(yy), leftArm3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (3-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 33) {
            xx = 3 + (((tickAnim - 18) / 15) * (3-(3)));
            yy = 0 + (((tickAnim - 18) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 15) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 50) {
            xx = 3 + (((tickAnim - 33) / 17) * (0-(3)));
            yy = 0 + (((tickAnim - 33) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 17) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm, rightArm.rotateAngleX + (float) Math.toRadians(xx), rightArm.rotateAngleY + (float) Math.toRadians(yy), rightArm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (-20.5-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 33) {
            xx = -20.5 + (((tickAnim - 18) / 15) * (-20.5-(-20.5)));
            yy = 0 + (((tickAnim - 18) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 15) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 50) {
            xx = -20.5 + (((tickAnim - 33) / 17) * (0-(-20.5)));
            yy = 0 + (((tickAnim - 33) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 17) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm2, rightArm2.rotateAngleX + (float) Math.toRadians(xx), rightArm2.rotateAngleY + (float) Math.toRadians(yy), rightArm2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (1.325-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 18) / 15) * (0-(0)));
            yy = 1.325 + (((tickAnim - 18) / 15) * (1.325-(1.325)));
            zz = 0 + (((tickAnim - 18) / 15) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 33) / 17) * (0-(0)));
            yy = 1.325 + (((tickAnim - 33) / 17) * (0-(1.325)));
            zz = 0 + (((tickAnim - 33) / 17) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightArm2.rotationPointX = this.rightArm2.rotationPointX + (float)(xx);
        this.rightArm2.rotationPointY = this.rightArm2.rotationPointY - (float)(yy);
        this.rightArm2.rotationPointZ = this.rightArm2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (19.5-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 33) {
            xx = 19.5 + (((tickAnim - 18) / 15) * (19.5-(19.5)));
            yy = 0 + (((tickAnim - 18) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 15) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 50) {
            xx = 19.5 + (((tickAnim - 33) / 17) * (0-(19.5)));
            yy = 0 + (((tickAnim - 33) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 17) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm3, rightArm3.rotateAngleX + (float) Math.toRadians(xx), rightArm3.rotateAngleY + (float) Math.toRadians(yy), rightArm3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (8.5-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 33) {
            xx = 8.5 + (((tickAnim - 18) / 15) * (8.5-(8.5)));
            yy = 0 + (((tickAnim - 18) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 15) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 50) {
            xx = 8.5 + (((tickAnim - 33) / 17) * (0-(8.5)));
            yy = 0 + (((tickAnim - 33) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 17) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(xx), neck.rotateAngleY + (float) Math.toRadians(yy), neck.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (-3.75-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 33) {
            xx = -3.75 + (((tickAnim - 18) / 15) * (-3.75-(-3.75)));
            yy = 0 + (((tickAnim - 18) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 15) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 50) {
            xx = -3.75 + (((tickAnim - 33) / 17) * (0-(-3.75)));
            yy = 0 + (((tickAnim - 33) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 17) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(xx), neck3.rotateAngleY + (float) Math.toRadians(yy), neck3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (-6.5-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 33) {
            xx = -6.5 + (((tickAnim - 18) / 15) * (-6.5-(-6.5)));
            yy = 0 + (((tickAnim - 18) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 15) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 50) {
            xx = -6.5 + (((tickAnim - 33) / 17) * (0-(-6.5)));
            yy = 0 + (((tickAnim - 33) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 17) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck4, neck4.rotateAngleX + (float) Math.toRadians(xx), neck4.rotateAngleY + (float) Math.toRadians(yy), neck4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (6.25-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 33) {
            xx = 6.25 + (((tickAnim - 18) / 15) * (6.25-(6.25)));
            yy = 0 + (((tickAnim - 18) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 15) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 50) {
            xx = 6.25 + (((tickAnim - 33) / 17) * (0-(6.25)));
            yy = 0 + (((tickAnim - 33) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 17) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg, rightLeg.rotateAngleX + (float) Math.toRadians(xx), rightLeg.rotateAngleY + (float) Math.toRadians(yy), rightLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (26.5-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 33) {
            xx = 26.5 + (((tickAnim - 18) / 15) * (26.5-(26.5)));
            yy = 0 + (((tickAnim - 18) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 15) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 50) {
            xx = 26.5 + (((tickAnim - 33) / 17) * (0-(26.5)));
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
            yy = 0 + (((tickAnim - 0) / 18) * (2.225-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (-1-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 18) / 15) * (0-(0)));
            yy = 2.225 + (((tickAnim - 18) / 15) * (2.225-(2.225)));
            zz = -1 + (((tickAnim - 18) / 15) * (-1-(-1)));
        }
        else if (tickAnim >= 33 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 33) / 17) * (0-(0)));
            yy = 2.225 + (((tickAnim - 33) / 17) * (0-(2.225)));
            zz = -1 + (((tickAnim - 33) / 17) * (0-(-1)));
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
            xx = 0 + (((tickAnim - 0) / 18) * (-24-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 33) {
            xx = -24 + (((tickAnim - 18) / 15) * (-24-(-24)));
            yy = 0 + (((tickAnim - 18) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 15) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 50) {
            xx = -24 + (((tickAnim - 33) / 17) * (0-(-24)));
            yy = 0 + (((tickAnim - 33) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 17) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg3, rightLeg3.rotateAngleX + (float) Math.toRadians(xx), rightLeg3.rotateAngleY + (float) Math.toRadians(yy), rightLeg3.rotateAngleZ + (float) Math.toRadians(zz));

    }
    public void animEat(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraAragosaurus entity = (EntityPrehistoricFloraAragosaurus) entitylivingbaseIn;
        int animCycle = 20;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (9.25-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 9.25 + (((tickAnim - 10) / 10) * (0-(9.25)));
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
            xx = 0 + (((tickAnim - 0) / 10) * (10.75-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 10.75 + (((tickAnim - 10) / 10) * (0-(10.75)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body2, body2.rotateAngleX + (float) Math.toRadians(xx), body2.rotateAngleY + (float) Math.toRadians(yy), body2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (-42.7871-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (-5.17048-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (-15.69039-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = -42.7871 + (((tickAnim - 10) / 10) * (0-(-42.7871)));
            yy = -5.17048 + (((tickAnim - 10) / 10) * (0-(-5.17048)));
            zz = -15.69039 + (((tickAnim - 10) / 10) * (0-(-15.69039)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm, leftArm.rotateAngleX + (float) Math.toRadians(xx), leftArm.rotateAngleY + (float) Math.toRadians(yy), leftArm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (-5.92196-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (2.31592-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (16.10936-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = -5.92196 + (((tickAnim - 10) / 10) * (0-(-5.92196)));
            yy = 2.31592 + (((tickAnim - 10) / 10) * (0-(2.31592)));
            zz = 16.10936 + (((tickAnim - 10) / 10) * (0-(16.10936)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm2, leftArm2.rotateAngleX + (float) Math.toRadians(xx), leftArm2.rotateAngleY + (float) Math.toRadians(yy), leftArm2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (1.075-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            yy = 1.075 + (((tickAnim - 10) / 10) * (0-(1.075)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
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
            xx = 0 + (((tickAnim - 0) / 10) * (28-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 28 + (((tickAnim - 10) / 10) * (0-(28)));
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
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0.625-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (-1.325-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            yy = 0.625 + (((tickAnim - 10) / 10) * (0-(0.625)));
            zz = -1.325 + (((tickAnim - 10) / 10) * (0-(-1.325)));
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
            xx = 0 + (((tickAnim - 0) / 10) * (-42.7871-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (5.17048-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (15.69039-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = -42.7871 + (((tickAnim - 10) / 10) * (0-(-42.7871)));
            yy = 5.17048 + (((tickAnim - 10) / 10) * (0-(5.17048)));
            zz = 15.69039 + (((tickAnim - 10) / 10) * (0-(15.69039)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm, rightArm.rotateAngleX + (float) Math.toRadians(xx), rightArm.rotateAngleY + (float) Math.toRadians(yy), rightArm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (-5.92196-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (-2.31592-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (-16.10936-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = -5.92196 + (((tickAnim - 10) / 10) * (0-(-5.92196)));
            yy = -2.31592 + (((tickAnim - 10) / 10) * (0-(-2.31592)));
            zz = -16.10936 + (((tickAnim - 10) / 10) * (0-(-16.10936)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm2, rightArm2.rotateAngleX + (float) Math.toRadians(xx), rightArm2.rotateAngleY + (float) Math.toRadians(yy), rightArm2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (1.075-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            yy = 1.075 + (((tickAnim - 10) / 10) * (0-(1.075)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightArm2.rotationPointX = this.rightArm2.rotationPointX + (float)(xx);
        this.rightArm2.rotationPointY = this.rightArm2.rotationPointY - (float)(yy);
        this.rightArm2.rotationPointZ = this.rightArm2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (28-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 28 + (((tickAnim - 10) / 10) * (0-(28)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm3, rightArm3.rotateAngleX + (float) Math.toRadians(xx), rightArm3.rotateAngleY + (float) Math.toRadians(yy), rightArm3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0.625-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (-1.325-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            yy = 0.625 + (((tickAnim - 10) / 10) * (0-(0.625)));
            zz = -1.325 + (((tickAnim - 10) / 10) * (0-(-1.325)));
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
            xx = 0 + (((tickAnim - 0) / 10) * (22.11032-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (-1.48154-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0.27403-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 22.11032 + (((tickAnim - 10) / 10) * (0-(22.11032)));
            yy = -1.48154 + (((tickAnim - 10) / 10) * (0-(-1.48154)));
            zz = 0.27403 + (((tickAnim - 10) / 10) * (0-(0.27403)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(xx), neck.rotateAngleY + (float) Math.toRadians(yy), neck.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (1.6-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (-4.25-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            yy = 1.6 + (((tickAnim - 10) / 10) * (0-(1.6)));
            zz = -4.25 + (((tickAnim - 10) / 10) * (0-(-4.25)));
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
            xx = 0 + (((tickAnim - 0) / 10) * (13.5-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 13.5 + (((tickAnim - 10) / 10) * (0-(13.5)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(xx), neck2.rotateAngleY + (float) Math.toRadians(yy), neck2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (11.5-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 11.5 + (((tickAnim - 10) / 10) * (0-(11.5)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(xx), neck3.rotateAngleY + (float) Math.toRadians(yy), neck3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (13.5-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 13.5 + (((tickAnim - 10) / 10) * (0-(13.5)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck4, neck4.rotateAngleX + (float) Math.toRadians(xx), neck4.rotateAngleY + (float) Math.toRadians(yy), neck4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (4.5-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 4.5 + (((tickAnim - 10) / 10) * (0-(4.5)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
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
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck6, neck6.rotateAngleX + (float) Math.toRadians(xx), neck6.rotateAngleY + (float) Math.toRadians(yy), neck6.rotateAngleZ + (float) Math.toRadians(zz));




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
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 0) / 6) * (26.25-(0)));
            yy = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 10) {
            xx = 26.25 + (((tickAnim - 6) / 4) * (0-(26.25)));
            yy = 0 + (((tickAnim - 6) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 4) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(xx), jaw.rotateAngleY + (float) Math.toRadians(yy), jaw.rotateAngleZ + (float) Math.toRadians(zz));

    }
    public void animNoise(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraAragosaurus entity = (EntityPrehistoricFloraAragosaurus) entitylivingbaseIn;
        int animCycle = 50;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;


        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*144-120))*2), neck2.rotateAngleY + (float) Math.toRadians(0), neck2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*144-140))*2), neck3.rotateAngleY + (float) Math.toRadians(0), neck3.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(neck4, neck4.rotateAngleX + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*144-180))*2), neck4.rotateAngleY + (float) Math.toRadians(0), neck4.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(neck5, neck5.rotateAngleX + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*144-220))*2), neck5.rotateAngleY + (float) Math.toRadians(0), neck5.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(neck6, neck6.rotateAngleX + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*144-240))*2), neck6.rotateAngleY + (float) Math.toRadians(0), neck6.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*144-280))*2), head.rotateAngleY + (float) Math.toRadians(0), head.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(7.925-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*144-280))*8), jaw.rotateAngleY + (float) Math.toRadians(0), jaw.rotateAngleZ + (float) Math.toRadians(0));

    }
    public void animRunning(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraAragosaurus entity = (EntityPrehistoricFloraAragosaurus) entitylivingbaseIn;
        int animCycle = 35;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        this.setRotateAngle(main, main.rotateAngleX + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*411+30))*2), main.rotateAngleY + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*206))*1), main.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*206))*2));
        this.main.rotationPointX = this.main.rotationPointX + (float)(0);
        this.main.rotationPointY = this.main.rotationPointY - (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*411-100))*-0.5);
        this.main.rotationPointZ = this.main.rotationPointZ + (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*411))*0.6);



        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 8 + (((tickAnim - 0) / 10) * (21.25-(8)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = 21.25 + (((tickAnim - 10) / 5) * (57.53-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*90-(21.25)));
            yy = 0 + (((tickAnim - 10) / 5) * (2.8-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+50))*5-(0)));
            zz = 0 + (((tickAnim - 10) / 5) * (2.9+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+50))*-5-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 19) {
            xx = 57.53-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*90 + (((tickAnim - 15) / 4) * (-7.5-(57.53-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*90)));
            yy = 2.8-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+50))*5 + (((tickAnim - 15) / 4) * (0-(2.8-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+50))*5)));
            zz = 2.9+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+50))*-5 + (((tickAnim - 15) / 4) * (0-(2.9+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+50))*-5)));
        }
        else if (tickAnim >= 19 && tickAnim < 35) {
            xx = -7.5 + (((tickAnim - 19) / 16) * (8-(-7.5)));
            yy = 0 + (((tickAnim - 19) / 16) * (0-(0)));
            zz = 0 + (((tickAnim - 19) / 16) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg, leftLeg.rotateAngleX + (float) Math.toRadians(xx), leftLeg.rotateAngleY + (float) Math.toRadians(yy), leftLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = -7.25 + (((tickAnim - 0) / 10) * (-2.25-(-7.25)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = -2.25 + (((tickAnim - 10) / 5) * (33.355-Math.sin((Math.PI/180)*(((double)tickAnim/20)*100-30))*50-(-2.25)));
            yy = 0 + (((tickAnim - 10) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 5) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 19) {
            xx = 33.355-Math.sin((Math.PI/180)*(((double)tickAnim/20)*100-30))*50 + (((tickAnim - 15) / 4) * (-10-(33.355-Math.sin((Math.PI/180)*(((double)tickAnim/20)*100-30))*50)));
            yy = 0 + (((tickAnim - 15) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 4) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 35) {
            xx = -10 + (((tickAnim - 19) / 16) * (-7.25-(-10)));
            yy = 0 + (((tickAnim - 19) / 16) * (0-(0)));
            zz = 0 + (((tickAnim - 19) / 16) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg2, leftLeg2.rotateAngleX + (float) Math.toRadians(xx), leftLeg2.rotateAngleY + (float) Math.toRadians(yy), leftLeg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = 0.525 + (((tickAnim - 0) / 10) * (-0.595-(0.525)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 10) / 5) * (0-(0)));
            yy = -0.595 + (((tickAnim - 10) / 5) * (10.325+Math.sin((Math.PI/180)*(((double)tickAnim/20)*100))*-10-(-0.595)));
            zz = 0 + (((tickAnim - 10) / 5) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 15) / 4) * (0-(0)));
            yy = 10.325+Math.sin((Math.PI/180)*(((double)tickAnim/20)*100))*-10 + (((tickAnim - 15) / 4) * (-0.9-(10.325+Math.sin((Math.PI/180)*(((double)tickAnim/20)*100))*-10)));
            zz = 0 + (((tickAnim - 15) / 4) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 19) / 16) * (0-(0)));
            yy = -0.9 + (((tickAnim - 19) / 16) * (0.525-(-0.9)));
            zz = 0 + (((tickAnim - 19) / 16) * (0-(0)));
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
            xx = 1.5 + (((tickAnim - 0) / 10) * (17.25-(1.5)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = 17.25 + (((tickAnim - 10) / 5) * (84.6856-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*90-(17.25)));
            yy = 0 + (((tickAnim - 10) / 5) * (0.46007-(0)));
            zz = 0 + (((tickAnim - 10) / 5) * (0.71165-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 19) {
            xx = 84.6856-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*90 + (((tickAnim - 15) / 4) * (17.5-(84.6856-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*90)));
            yy = 0.46007 + (((tickAnim - 15) / 4) * (0-(0.46007)));
            zz = 0.71165 + (((tickAnim - 15) / 4) * (0-(0.71165)));
        }
        else if (tickAnim >= 19 && tickAnim < 35) {
            xx = 17.5 + (((tickAnim - 19) / 16) * (1.5-(17.5)));
            yy = 0 + (((tickAnim - 19) / 16) * (0-(0)));
            zz = 0 + (((tickAnim - 19) / 16) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg3, leftLeg3.rotateAngleX + (float) Math.toRadians(xx), leftLeg3.rotateAngleY + (float) Math.toRadians(yy), leftLeg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = -0.6 + (((tickAnim - 0) / 10) * (1.75-(-0.6)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 10) / 5) * (0-(0)));
            yy = 1.75 + (((tickAnim - 10) / 5) * (4.71-(1.75)));
            zz = 0 + (((tickAnim - 10) / 5) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 15) / 4) * (0-(0)));
            yy = 4.71 + (((tickAnim - 15) / 4) * (1.775-(4.71)));
            zz = 0 + (((tickAnim - 15) / 4) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 19) / 16) * (0-(0)));
            yy = 1.775 + (((tickAnim - 19) / 16) * (-0.6-(1.775)));
            zz = 0 + (((tickAnim - 19) / 16) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftLeg3.rotationPointX = this.leftLeg3.rotationPointX + (float)(xx);
        this.leftLeg3.rotationPointY = this.leftLeg3.rotationPointY - (float)(yy);
        this.leftLeg3.rotationPointZ = this.leftLeg3.rotationPointZ + (float)(zz);



        this.setRotateAngle(tail, tail.rotateAngleX + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*411))*-2), tail.rotateAngleY + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*205))*2), tail.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*205))*2));


        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*411-50))*2), tail2.rotateAngleY + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*206-50))*2), tail2.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*206))*2));


        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*411-100))*-2.2), tail3.rotateAngleY + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*206-100))*3), tail3.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*206))*2));


        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*411-150))*2.5), tail4.rotateAngleY + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*206-150))*3), tail4.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*206))*2));


        this.setRotateAngle(tail5, tail5.rotateAngleX + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*411-200))*2.8), tail5.rotateAngleY + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*206-200))*9), tail5.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*206))*2));


        this.setRotateAngle(tail6, tail6.rotateAngleX + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*411-250))*3), tail6.rotateAngleY + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*206-250))*14), tail6.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*206))*2));


        this.setRotateAngle(tail7, tail7.rotateAngleX + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*411-300))*3.2), tail7.rotateAngleY + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*206-300))*19), tail7.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*206))*2));


        this.setRotateAngle(tail8, tail8.rotateAngleX + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*411-350))*3.5), tail8.rotateAngleY + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*206-350))*22), tail8.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*206))*2));


        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*411+50))*-2), body.rotateAngleY + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*206-70))*-1), body.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*206-70))*-2));


        this.setRotateAngle(body2, body2.rotateAngleX + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*411-50))*-2), body2.rotateAngleY + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*206-120))*1), body2.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*206-120))*2));



        if (tickAnim >= 0 && tickAnim < 18) {
            xx = -12.5 + (((tickAnim - 0) / 18) * (13-(-12.5)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 23) {
            xx = 13 + (((tickAnim - 18) / 5) * (8.165-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-50))*50-(13)));
            yy = 0 + (((tickAnim - 18) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 5) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 28) {
            xx = 8.165-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-50))*50 + (((tickAnim - 23) / 5) * (-29.25-(8.165-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-50))*50)));
            yy = 0 + (((tickAnim - 23) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 5) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 30) {
            xx = -29.25 + (((tickAnim - 28) / 2) * (-26.35-(-29.25)));
            yy = 0 + (((tickAnim - 28) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 2) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 35) {
            xx = -26.35 + (((tickAnim - 30) / 5) * (-12.5-(-26.35)));
            yy = 0 + (((tickAnim - 30) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm, leftArm.rotateAngleX + (float) Math.toRadians(xx), leftArm.rotateAngleY + (float) Math.toRadians(yy), leftArm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 9.75 + (((tickAnim - 0) / 18) * (9.97327-(9.75)));
            yy = 0 + (((tickAnim - 0) / 18) * (-0.7279-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (-0.16104-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 23) {
            xx = 9.97327 + (((tickAnim - 18) / 5) * (-82.6884-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+70))*-90-(9.97327)));
            yy = -0.7279 + (((tickAnim - 18) / 5) * (-0.36395-(-0.7279)));
            zz = -0.16104 + (((tickAnim - 18) / 5) * (-0.08052-(-0.16104)));
        }
        else if (tickAnim >= 23 && tickAnim < 28) {
            xx = -82.6884-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+70))*-90 + (((tickAnim - 23) / 5) * (20.75-(-82.6884-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+70))*-90)));
            yy = -0.36395 + (((tickAnim - 23) / 5) * (0-(-0.36395)));
            zz = -0.08052 + (((tickAnim - 23) / 5) * (0-(-0.08052)));
        }
        else if (tickAnim >= 28 && tickAnim < 30) {
            xx = 20.75 + (((tickAnim - 28) / 2) * (16.7-(20.75)));
            yy = 0 + (((tickAnim - 28) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 2) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 35) {
            xx = 16.7 + (((tickAnim - 30) / 5) * (9.75-(16.7)));
            yy = 0 + (((tickAnim - 30) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm2, leftArm2.rotateAngleX + (float) Math.toRadians(xx), leftArm2.rotateAngleY + (float) Math.toRadians(yy), leftArm2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            yy = -0.3 + (((tickAnim - 0) / 18) * (0-(-0.3)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 18) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 18) / 5) * (1.6-(0)));
            zz = 0 + (((tickAnim - 18) / 5) * (0.825-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 23) / 5) * (0-(0)));
            yy = 1.6 + (((tickAnim - 23) / 5) * (-0.3-(1.6)));
            zz = 0.825 + (((tickAnim - 23) / 5) * (0-(0.825)));
        }
        else if (tickAnim >= 28 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 28) / 2) * (0-(0)));
            yy = -0.3 + (((tickAnim - 28) / 2) * (-0.3-(-0.3)));
            zz = 0 + (((tickAnim - 28) / 2) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 30) / 5) * (0-(0)));
            yy = -0.3 + (((tickAnim - 30) / 5) * (-0.3-(-0.3)));
            zz = 0 + (((tickAnim - 30) / 5) * (0-(0)));
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
            xx = 2.75 + (((tickAnim - 0) / 7) * (-6.69-(2.75)));
            yy = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 18) {
            xx = -6.69 + (((tickAnim - 7) / 11) * (-1.9-(-6.69)));
            yy = 0 + (((tickAnim - 7) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 11) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 23) {
            xx = -1.9 + (((tickAnim - 18) / 5) * (-47.43-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+50))*-100-(-1.9)));
            yy = 0 + (((tickAnim - 18) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 5) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 28) {
            xx = -47.43-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+50))*-100 + (((tickAnim - 23) / 5) * (8-(-47.43-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+50))*-100)));
            yy = 0 + (((tickAnim - 23) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 5) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 30) {
            xx = 8 + (((tickAnim - 28) / 2) * (10.77-(8)));
            yy = 0 + (((tickAnim - 28) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 2) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 35) {
            xx = 10.77 + (((tickAnim - 30) / 5) * (2.75-(10.77)));
            yy = 0 + (((tickAnim - 30) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm3, leftArm3.rotateAngleX + (float) Math.toRadians(xx), leftArm3.rotateAngleY + (float) Math.toRadians(yy), leftArm3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            yy = 0.3 + (((tickAnim - 0) / 7) * (0.375-(0.3)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 7) / 11) * (0-(0)));
            yy = 0.375 + (((tickAnim - 7) / 11) * (-1.225-(0.375)));
            zz = 0 + (((tickAnim - 7) / 11) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 18) / 5) * (0-(0)));
            yy = -1.225 + (((tickAnim - 18) / 5) * (0.49-(-1.225)));
            zz = 0 + (((tickAnim - 18) / 5) * (-0.925-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 23) / 5) * (0-(0)));
            yy = 0.49 + (((tickAnim - 23) / 5) * (-0.425-(0.49)));
            zz = -0.925 + (((tickAnim - 23) / 5) * (0-(-0.925)));
        }
        else if (tickAnim >= 28 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 28) / 2) * (0-(0)));
            yy = -0.425 + (((tickAnim - 28) / 2) * (-0.615-(-0.425)));
            zz = 0 + (((tickAnim - 28) / 2) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 30) / 5) * (0-(0)));
            yy = -0.615 + (((tickAnim - 30) / 5) * (0.3-(-0.615)));
            zz = 0 + (((tickAnim - 30) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftArm3.rotationPointX = this.leftArm3.rotationPointX + (float)(xx);
        this.leftArm3.rotationPointY = this.leftArm3.rotationPointY - (float)(yy);
        this.leftArm3.rotationPointZ = this.leftArm3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 13 + (((tickAnim - 0) / 5) * (-29.435-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-50))*50-(13)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = -29.435-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-50))*50 + (((tickAnim - 5) / 5) * (-29.25-(-29.435-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-50))*50)));
            yy = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 5) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 12) {
            xx = -29.25 + (((tickAnim - 10) / 2) * (-26.35-(-29.25)));
            yy = 0 + (((tickAnim - 10) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 2) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 35) {
            xx = -26.35 + (((tickAnim - 12) / 23) * (13-(-26.35)));
            yy = 0 + (((tickAnim - 12) / 23) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 23) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm, rightArm.rotateAngleX + (float) Math.toRadians(xx), rightArm.rotateAngleY + (float) Math.toRadians(yy), rightArm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 9.97327 + (((tickAnim - 0) / 5) * (114.7866-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+50))*150-(9.97327)));
            yy = -0.7279 + (((tickAnim - 0) / 5) * (-0.36395-(-0.7279)));
            zz = -0.16104 + (((tickAnim - 0) / 5) * (-0.08052-(-0.16104)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 114.7866-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+50))*150 + (((tickAnim - 5) / 5) * (20.75-(114.7866-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+50))*150)));
            yy = -0.36395 + (((tickAnim - 5) / 5) * (0-(-0.36395)));
            zz = -0.08052 + (((tickAnim - 5) / 5) * (0-(-0.08052)));
        }
        else if (tickAnim >= 10 && tickAnim < 12) {
            xx = 20.75 + (((tickAnim - 10) / 2) * (16.7-(20.75)));
            yy = 0 + (((tickAnim - 10) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 2) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 35) {
            xx = 16.7 + (((tickAnim - 12) / 23) * (9.97327-(16.7)));
            yy = 0 + (((tickAnim - 12) / 23) * (-0.7279-(0)));
            zz = 0 + (((tickAnim - 12) / 23) * (-0.16104-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm2, rightArm2.rotateAngleX + (float) Math.toRadians(xx), rightArm2.rotateAngleY + (float) Math.toRadians(yy), rightArm2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (1.6-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0.825-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            yy = 1.6 + (((tickAnim - 5) / 5) * (-0.3-(1.6)));
            zz = 0.825 + (((tickAnim - 5) / 5) * (0-(0.825)));
        }
        else if (tickAnim >= 10 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 10) / 2) * (0-(0)));
            yy = -0.3 + (((tickAnim - 10) / 2) * (-0.3-(-0.3)));
            zz = 0 + (((tickAnim - 10) / 2) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 12) / 23) * (0-(0)));
            yy = -0.3 + (((tickAnim - 12) / 23) * (0-(-0.3)));
            zz = 0 + (((tickAnim - 12) / 23) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightArm2.rotationPointX = this.rightArm2.rotationPointX + (float)(xx);
        this.rightArm2.rotationPointY = this.rightArm2.rotationPointY - (float)(yy);
        this.rightArm2.rotationPointZ = this.rightArm2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 61.35-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-50))*-90 + (((tickAnim - 0) / 5) * (-15.705-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-50))*90-(61.35-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-50))*-90)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = -15.705-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-50))*90 + (((tickAnim - 5) / 5) * (8-(-15.705-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-50))*90)));
            yy = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 5) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 12) {
            xx = 8 + (((tickAnim - 10) / 2) * (10.77-(8)));
            yy = 0 + (((tickAnim - 10) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 2) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 16) {
            xx = 10.77 + (((tickAnim - 12) / 4) * (6.5-(10.77)));
            yy = 0 + (((tickAnim - 12) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 4) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 23) {
            xx = 6.5 + (((tickAnim - 16) / 7) * (-6.69-(6.5)));
            yy = 0 + (((tickAnim - 16) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 16) / 7) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 35) {
            xx = -6.69 + (((tickAnim - 23) / 12) * (-7.675-(-6.69)));
            yy = 0 + (((tickAnim - 23) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm3, rightArm3.rotateAngleX + (float) Math.toRadians(xx), rightArm3.rotateAngleY + (float) Math.toRadians(yy), rightArm3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = -1.225 + (((tickAnim - 0) / 5) * (0.49-(-1.225)));
            zz = 0 + (((tickAnim - 0) / 5) * (-0.925-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            yy = 0.49 + (((tickAnim - 5) / 5) * (-0.425-(0.49)));
            zz = -0.925 + (((tickAnim - 5) / 5) * (0-(-0.925)));
        }
        else if (tickAnim >= 10 && tickAnim < 16) {
            xx = 0 + (((tickAnim - 10) / 6) * (0-(0)));
            yy = -0.425 + (((tickAnim - 10) / 6) * (-0.225-(-0.425)));
            zz = 0 + (((tickAnim - 10) / 6) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 16) / 7) * (0-(0)));
            yy = -0.225 + (((tickAnim - 16) / 7) * (0.375-(-0.225)));
            zz = 0 + (((tickAnim - 16) / 7) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 23) / 12) * (0-(0)));
            yy = 0.375 + (((tickAnim - 23) / 12) * (-1.225-(0.375)));
            zz = 0 + (((tickAnim - 23) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightArm3.rotationPointX = this.rightArm3.rotationPointX + (float)(xx);
        this.rightArm3.rotationPointY = this.rightArm3.rotationPointY - (float)(yy);
        this.rightArm3.rotationPointZ = this.rightArm3.rotationPointZ + (float)(zz);



        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*411))*1), neck.rotateAngleY + (float) Math.toRadians(0), neck.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(0.5-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*411-100))*-1), neck2.rotateAngleY + (float) Math.toRadians(0), neck2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(-0.925-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*411-250))*-2), neck3.rotateAngleY + (float) Math.toRadians(0), neck3.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(neck4, neck4.rotateAngleX + (float) Math.toRadians(-0.85-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*411-300))*-2), neck4.rotateAngleY + (float) Math.toRadians(0), neck4.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(neck5, neck5.rotateAngleX + (float) Math.toRadians(1-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*411-450))*-2), neck5.rotateAngleY + (float) Math.toRadians(0), neck5.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(neck6, neck6.rotateAngleX + (float) Math.toRadians(1-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*411-450))*-2), neck6.rotateAngleY + (float) Math.toRadians(0), neck6.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(-0.175-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*411-550))*-2), head.rotateAngleY + (float) Math.toRadians(0), head.rotateAngleZ + (float) Math.toRadians(0));



        if (tickAnim >= 0 && tickAnim < 25) {
            xx = -11 + (((tickAnim - 0) / 25) * (23.25-(-11)));
            yy = 0 + (((tickAnim - 0) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 25) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 31) {
            xx = 23.25 + (((tickAnim - 25) / 6) * (100.305-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*100-(23.25)));
            yy = 0 + (((tickAnim - 25) / 6) * (-1.925-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+20))*-5-(0)));
            zz = 0 + (((tickAnim - 25) / 6) * (-2.025+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+20))*5-(0)));
        }
        else if (tickAnim >= 31 && tickAnim < 35) {
            xx = 100.305-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*100 + (((tickAnim - 31) / 4) * (-11-(100.305-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*100)));
            yy = -1.925-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+20))*-5 + (((tickAnim - 31) / 4) * (0-(-1.925-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+20))*-5)));
            zz = -2.025+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+20))*5 + (((tickAnim - 31) / 4) * (0-(-2.025+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+20))*5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg, rightLeg.rotateAngleX + (float) Math.toRadians(xx), rightLeg.rotateAngleY + (float) Math.toRadians(yy), rightLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 25) {
            xx = -10 + (((tickAnim - 0) / 25) * (-2.25-(-10)));
            yy = 0 + (((tickAnim - 0) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 25) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 31) {
            xx = -2.25 + (((tickAnim - 25) / 6) * (-79.445-Math.sin((Math.PI/180)*(((double)tickAnim/20)*100-50))*-90-(-2.25)));
            yy = 0 + (((tickAnim - 25) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 6) * (0-(0)));
        }
        else if (tickAnim >= 31 && tickAnim < 35) {
            xx = -79.445-Math.sin((Math.PI/180)*(((double)tickAnim/20)*100-50))*-90 + (((tickAnim - 31) / 4) * (-10-(-79.445-Math.sin((Math.PI/180)*(((double)tickAnim/20)*100-50))*-90)));
            yy = 0 + (((tickAnim - 31) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 31) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg2, rightLeg2.rotateAngleX + (float) Math.toRadians(xx), rightLeg2.rotateAngleY + (float) Math.toRadians(yy), rightLeg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 0) / 25) * (0-(0)));
            yy = -0.9 + (((tickAnim - 0) / 25) * (-0.595-(-0.9)));
            zz = 0 + (((tickAnim - 0) / 25) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 31) {
            xx = 0 + (((tickAnim - 25) / 6) * (0-(0)));
            yy = -0.595 + (((tickAnim - 25) / 6) * (-1.675+Math.sin((Math.PI/180)*(((double)tickAnim/20)*100+50))*-10-(-0.595)));
            zz = 0 + (((tickAnim - 25) / 6) * (0-(0)));
        }
        else if (tickAnim >= 31 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 31) / 4) * (0-(0)));
            yy = -1.675+Math.sin((Math.PI/180)*(((double)tickAnim/20)*100+50))*-10 + (((tickAnim - 31) / 4) * (-0.9-(-1.675+Math.sin((Math.PI/180)*(((double)tickAnim/20)*100+50))*-10)));
            zz = 0 + (((tickAnim - 31) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightLeg2.rotationPointX = this.rightLeg2.rotationPointX + (float)(xx);
        this.rightLeg2.rotationPointY = this.rightLeg2.rotationPointY - (float)(yy);
        this.rightLeg2.rotationPointZ = this.rightLeg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 14) {
            xx = 21.75 + (((tickAnim - 0) / 14) * (1.5-(21.75)));
            yy = 0 + (((tickAnim - 0) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 14) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 25) {
            xx = 1.5 + (((tickAnim - 14) / 11) * (17.25-(1.5)));
            yy = 0 + (((tickAnim - 14) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 11) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 31) {
            xx = 17.25 + (((tickAnim - 25) / 6) * (-62.1644-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-90-(17.25)));
            yy = 0 + (((tickAnim - 25) / 6) * (0.46007-(0)));
            zz = 0 + (((tickAnim - 25) / 6) * (0.71165-(0)));
        }
        else if (tickAnim >= 31 && tickAnim < 35) {
            xx = -62.1644-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-90 + (((tickAnim - 31) / 4) * (21.75-(-62.1644-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-90)));
            yy = 0.46007 + (((tickAnim - 31) / 4) * (0-(0.46007)));
            zz = 0.71165 + (((tickAnim - 31) / 4) * (0-(0.71165)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg3, rightLeg3.rotateAngleX + (float) Math.toRadians(xx), rightLeg3.rotateAngleY + (float) Math.toRadians(yy), rightLeg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 0) / 14) * (0-(0)));
            yy = 1.375 + (((tickAnim - 0) / 14) * (1.35-(1.375)));
            zz = 0 + (((tickAnim - 0) / 14) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 14) / 11) * (0-(0)));
            yy = 1.35 + (((tickAnim - 14) / 11) * (1.75-(1.35)));
            zz = 0 + (((tickAnim - 14) / 11) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 31) {
            xx = 0 + (((tickAnim - 25) / 6) * (0-(0)));
            yy = 1.75 + (((tickAnim - 25) / 6) * (4.71-(1.75)));
            zz = 0 + (((tickAnim - 25) / 6) * (0-(0)));
        }
        else if (tickAnim >= 31 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 31) / 4) * (0-(0)));
            yy = 4.71 + (((tickAnim - 31) / 4) * (1.375-(4.71)));
            zz = 0 + (((tickAnim - 31) / 4) * (0-(0)));
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
    public void animWalking(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraAragosaurus entity = (EntityPrehistoricFloraAragosaurus) entitylivingbaseIn;
        int animCycle = 50;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        this.setRotateAngle(main, main.rotateAngleX + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*283+30))*1.5), main.rotateAngleY + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*142))*0.5), main.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*142))*1));
        this.main.rotationPointX = this.main.rotationPointX + (float)(0);
        this.main.rotationPointY = this.main.rotationPointY - (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*283-100))*-0.3);
        this.main.rotationPointZ = this.main.rotationPointZ + (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*283))*0.5);



        if (tickAnim >= 0 && tickAnim < 14) {
            xx = 5.5 + (((tickAnim - 0) / 14) * (15.25-(5.5)));
            yy = 0 + (((tickAnim - 0) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 14) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 22) {
            xx = 15.25 + (((tickAnim - 14) / 8) * (75.13-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*90-(15.25)));
            yy = 0 + (((tickAnim - 14) / 8) * (2.8-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+50))*5-(0)));
            zz = 0 + (((tickAnim - 14) / 8) * (2.9+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+50))*-5-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 28) {
            xx = 75.13-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*90 + (((tickAnim - 22) / 6) * (-7.5-(75.13-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*90)));
            yy = 2.8-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+50))*5 + (((tickAnim - 22) / 6) * (0-(2.8-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+50))*5)));
            zz = 2.9+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+50))*-5 + (((tickAnim - 22) / 6) * (0-(2.9+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+50))*-5)));
        }
        else if (tickAnim >= 28 && tickAnim < 51) {
            xx = -7.5 + (((tickAnim - 28) / 23) * (5.5-(-7.5)));
            yy = 0 + (((tickAnim - 28) / 23) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 23) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg, leftLeg.rotateAngleX + (float) Math.toRadians(xx), leftLeg.rotateAngleY + (float) Math.toRadians(yy), leftLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 14) {
            xx = -7.25 + (((tickAnim - 0) / 14) * (-2.25-(-7.25)));
            yy = 0 + (((tickAnim - 0) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 14) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 22) {
            xx = -2.25 + (((tickAnim - 14) / 8) * (-75.77-Math.sin((Math.PI/180)*(((double)tickAnim/20)*100))*-90-(-2.25)));
            yy = 0 + (((tickAnim - 14) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 8) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 28) {
            xx = -75.77-Math.sin((Math.PI/180)*(((double)tickAnim/20)*100))*-90 + (((tickAnim - 22) / 6) * (-10-(-75.77-Math.sin((Math.PI/180)*(((double)tickAnim/20)*100))*-90)));
            yy = 0 + (((tickAnim - 22) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 22) / 6) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 51) {
            xx = -10 + (((tickAnim - 28) / 23) * (-7.25-(-10)));
            yy = 0 + (((tickAnim - 28) / 23) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 23) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg2, leftLeg2.rotateAngleX + (float) Math.toRadians(xx), leftLeg2.rotateAngleY + (float) Math.toRadians(yy), leftLeg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 0) / 14) * (0-(0)));
            yy = 0.525 + (((tickAnim - 0) / 14) * (-0.595-(0.525)));
            zz = 0 + (((tickAnim - 0) / 14) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 22) {
            xx = 0 + (((tickAnim - 14) / 8) * (0-(0)));
            yy = -0.595 + (((tickAnim - 14) / 8) * (10.325+Math.sin((Math.PI/180)*(((double)tickAnim/20)*100))*-10-(-0.595)));
            zz = 0 + (((tickAnim - 14) / 8) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 22) / 6) * (0-(0)));
            yy = 10.325+Math.sin((Math.PI/180)*(((double)tickAnim/20)*100))*-10 + (((tickAnim - 22) / 6) * (-0.9-(10.325+Math.sin((Math.PI/180)*(((double)tickAnim/20)*100))*-10)));
            zz = 0 + (((tickAnim - 22) / 6) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 51) {
            xx = 0 + (((tickAnim - 28) / 23) * (0-(0)));
            yy = -0.9 + (((tickAnim - 28) / 23) * (0.525-(-0.9)));
            zz = 0 + (((tickAnim - 28) / 23) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftLeg2.rotationPointX = this.leftLeg2.rotationPointX + (float)(xx);
        this.leftLeg2.rotationPointY = this.leftLeg2.rotationPointY - (float)(yy);
        this.leftLeg2.rotationPointZ = this.leftLeg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 14) {
            xx = 1.5 + (((tickAnim - 0) / 14) * (17.25-(1.5)));
            yy = 0 + (((tickAnim - 0) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 14) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 22) {
            xx = 17.25 + (((tickAnim - 14) / 8) * (84.6856-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*90-(17.25)));
            yy = 0 + (((tickAnim - 14) / 8) * (0.46007-(0)));
            zz = 0 + (((tickAnim - 14) / 8) * (0.71165-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 28) {
            xx = 84.6856-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*90 + (((tickAnim - 22) / 6) * (17.5-(84.6856-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*90)));
            yy = 0.46007 + (((tickAnim - 22) / 6) * (0-(0.46007)));
            zz = 0.71165 + (((tickAnim - 22) / 6) * (0-(0.71165)));
        }
        else if (tickAnim >= 28 && tickAnim < 51) {
            xx = 17.5 + (((tickAnim - 28) / 23) * (1.5-(17.5)));
            yy = 0 + (((tickAnim - 28) / 23) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 23) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg3, leftLeg3.rotateAngleX + (float) Math.toRadians(xx), leftLeg3.rotateAngleY + (float) Math.toRadians(yy), leftLeg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 0) / 14) * (0-(0)));
            yy = 0.125 + (((tickAnim - 0) / 14) * (1.75-(0.125)));
            zz = 0 + (((tickAnim - 0) / 14) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 22) {
            xx = 0 + (((tickAnim - 14) / 8) * (0-(0)));
            yy = 1.75 + (((tickAnim - 14) / 8) * (4.71-(1.75)));
            zz = 0 + (((tickAnim - 14) / 8) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 22) / 6) * (0-(0)));
            yy = 4.71 + (((tickAnim - 22) / 6) * (1.775-(4.71)));
            zz = 0 + (((tickAnim - 22) / 6) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 51) {
            xx = 0 + (((tickAnim - 28) / 23) * (0-(0)));
            yy = 1.775 + (((tickAnim - 28) / 23) * (0.125-(1.775)));
            zz = 0 + (((tickAnim - 28) / 23) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftLeg3.rotationPointX = this.leftLeg3.rotationPointX + (float)(xx);
        this.leftLeg3.rotationPointY = this.leftLeg3.rotationPointY - (float)(yy);
        this.leftLeg3.rotationPointZ = this.leftLeg3.rotationPointZ + (float)(zz);



        this.setRotateAngle(tail, tail.rotateAngleX + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*283))*-1), tail.rotateAngleY + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*142))*1), tail.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*142))*1));


        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*283-50))*1), tail2.rotateAngleY + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*142-50))*1), tail2.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*142))*1));


        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*283-100))*-1.2), tail3.rotateAngleY + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*142-100))*2), tail3.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*142))*1));


        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*283-150))*1.5), tail4.rotateAngleY + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*142-150))*2), tail4.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*142))*1));


        this.setRotateAngle(tail5, tail5.rotateAngleX + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*283-200))*1.8), tail5.rotateAngleY + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*142-200))*6), tail5.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*142))*1));


        this.setRotateAngle(tail6, tail6.rotateAngleX + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*283-250))*2), tail6.rotateAngleY + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*142-250))*10), tail6.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*142))*1));


        this.setRotateAngle(tail7, tail7.rotateAngleX + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*283-300))*2.2), tail7.rotateAngleY + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*142-300))*13), tail7.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*142))*1));


        this.setRotateAngle(tail8, tail8.rotateAngleX + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*283-350))*2.5), tail8.rotateAngleY + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*142-350))*16), tail8.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*142))*1));


        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*283+50))*-1.5), body.rotateAngleY + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*142-70))*-0.5), body.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*142-70))*-1));


        this.setRotateAngle(body2, body2.rotateAngleX + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*283-50))*-1.5), body2.rotateAngleY + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*142-120))*0.5), body2.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*142-120))*1));



        if (tickAnim >= 0 && tickAnim < 27) {
            xx = -12.5 + (((tickAnim - 0) / 27) * (13-(-12.5)));
            yy = 0 + (((tickAnim - 0) / 27) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 27) * (0-(0)));
        }
        else if (tickAnim >= 27 && tickAnim < 33) {
            xx = 13 + (((tickAnim - 27) / 6) * (25.09-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-50))*50-(13)));
            yy = 0 + (((tickAnim - 27) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 27) / 6) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 41) {
            xx = 25.09-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-50))*50 + (((tickAnim - 33) / 8) * (-23.25-(25.09-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-50))*50)));
            yy = 0 + (((tickAnim - 33) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 8) * (0-(0)));
        }
        else if (tickAnim >= 41 && tickAnim < 43) {
            xx = -23.25 + (((tickAnim - 41) / 2) * (-20.9-(-23.25)));
            yy = 0 + (((tickAnim - 41) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 41) / 2) * (0-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 51) {
            xx = -20.9 + (((tickAnim - 43) / 8) * (-12.5-(-20.9)));
            yy = 0 + (((tickAnim - 43) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 43) / 8) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm, leftArm.rotateAngleX + (float) Math.toRadians(xx), leftArm.rotateAngleY + (float) Math.toRadians(yy), leftArm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 27) {
            xx = 9.75 + (((tickAnim - 0) / 27) * (9.97327-(9.75)));
            yy = 0 + (((tickAnim - 0) / 27) * (-0.7279-(0)));
            zz = 0 + (((tickAnim - 0) / 27) * (-0.16104-(0)));
        }
        else if (tickAnim >= 27 && tickAnim < 33) {
            xx = 9.97327 + (((tickAnim - 27) / 6) * (-41.6884-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+70))*-90-(9.97327)));
            yy = -0.7279 + (((tickAnim - 27) / 6) * (-0.36395-(-0.7279)));
            zz = -0.16104 + (((tickAnim - 27) / 6) * (-0.08052-(-0.16104)));
        }
        else if (tickAnim >= 33 && tickAnim < 41) {
            xx = -41.6884-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+70))*-90 + (((tickAnim - 33) / 8) * (16-(-41.6884-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+70))*-90)));
            yy = -0.36395 + (((tickAnim - 33) / 8) * (0-(-0.36395)));
            zz = -0.08052 + (((tickAnim - 33) / 8) * (0-(-0.08052)));
        }
        else if (tickAnim >= 41 && tickAnim < 43) {
            xx = 16 + (((tickAnim - 41) / 2) * (14.2-(16)));
            yy = 0 + (((tickAnim - 41) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 41) / 2) * (0-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 51) {
            xx = 14.2 + (((tickAnim - 43) / 8) * (9.75-(14.2)));
            yy = 0 + (((tickAnim - 43) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 43) / 8) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm2, leftArm2.rotateAngleX + (float) Math.toRadians(xx), leftArm2.rotateAngleY + (float) Math.toRadians(yy), leftArm2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 27) {
            xx = 0 + (((tickAnim - 0) / 27) * (0-(0)));
            yy = -0.3 + (((tickAnim - 0) / 27) * (0-(-0.3)));
            zz = 0 + (((tickAnim - 0) / 27) * (0-(0)));
        }
        else if (tickAnim >= 27 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 27) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 27) / 6) * (1.6-(0)));
            zz = 0 + (((tickAnim - 27) / 6) * (0.825-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 41) {
            xx = 0 + (((tickAnim - 33) / 8) * (0-(0)));
            yy = 1.6 + (((tickAnim - 33) / 8) * (-0.3-(1.6)));
            zz = 0.825 + (((tickAnim - 33) / 8) * (0-(0.825)));
        }
        else if (tickAnim >= 41 && tickAnim < 51) {
            xx = 0 + (((tickAnim - 41) / 10) * (0-(0)));
            yy = -0.3 + (((tickAnim - 41) / 10) * (-0.3-(-0.3)));
            zz = 0 + (((tickAnim - 41) / 10) * (0-(0)));
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
            xx = 2.75 + (((tickAnim - 0) / 10) * (-6.69-(2.75)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 27) {
            xx = -6.69 + (((tickAnim - 10) / 17) * (-1.9-(-6.69)));
            yy = 0 + (((tickAnim - 10) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 17) * (0-(0)));
        }
        else if (tickAnim >= 27 && tickAnim < 33) {
            xx = -1.9 + (((tickAnim - 27) / 6) * (-47.43-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+50))*-100-(-1.9)));
            yy = 0 + (((tickAnim - 27) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 27) / 6) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 41) {
            xx = -47.43-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+50))*-100 + (((tickAnim - 33) / 8) * (8-(-47.43-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+50))*-100)));
            yy = 0 + (((tickAnim - 33) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 8) * (0-(0)));
        }
        else if (tickAnim >= 41 && tickAnim < 43) {
            xx = 8 + (((tickAnim - 41) / 2) * (5.77-(8)));
            yy = 0 + (((tickAnim - 41) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 41) / 2) * (0-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 51) {
            xx = 5.77 + (((tickAnim - 43) / 8) * (2.75-(5.77)));
            yy = 0 + (((tickAnim - 43) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 43) / 8) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm3, leftArm3.rotateAngleX + (float) Math.toRadians(xx), leftArm3.rotateAngleY + (float) Math.toRadians(yy), leftArm3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = 0.3 + (((tickAnim - 0) / 10) * (0.375-(0.3)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 27) {
            xx = 0 + (((tickAnim - 10) / 17) * (0-(0)));
            yy = 0.375 + (((tickAnim - 10) / 17) * (-1.225-(0.375)));
            zz = 0 + (((tickAnim - 10) / 17) * (0-(0)));
        }
        else if (tickAnim >= 27 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 27) / 6) * (0-(0)));
            yy = -1.225 + (((tickAnim - 27) / 6) * (0.49-(-1.225)));
            zz = 0 + (((tickAnim - 27) / 6) * (-0.925-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 41) {
            xx = 0 + (((tickAnim - 33) / 8) * (0-(0)));
            yy = 0.49 + (((tickAnim - 33) / 8) * (-0.425-(0.49)));
            zz = -0.925 + (((tickAnim - 33) / 8) * (0-(-0.925)));
        }
        else if (tickAnim >= 41 && tickAnim < 51) {
            xx = 0 + (((tickAnim - 41) / 10) * (0-(0)));
            yy = -0.425 + (((tickAnim - 41) / 10) * (0.3-(-0.425)));
            zz = 0 + (((tickAnim - 41) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftArm3.rotationPointX = this.leftArm3.rotationPointX + (float)(xx);
        this.leftArm3.rotationPointY = this.leftArm3.rotationPointY - (float)(yy);
        this.leftArm3.rotationPointZ = this.leftArm3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 13 + (((tickAnim - 0) / 7) * (-29.435-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-50))*50-(13)));
            yy = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 14) {
            xx = -29.435-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-50))*50 + (((tickAnim - 7) / 7) * (-23.25-(-29.435-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-50))*50)));
            yy = 0 + (((tickAnim - 7) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 7) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 17) {
            xx = -23.25 + (((tickAnim - 14) / 3) * (-20.9-(-23.25)));
            yy = 0 + (((tickAnim - 14) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 3) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 51) {
            xx = -20.9 + (((tickAnim - 17) / 34) * (13-(-20.9)));
            yy = 0 + (((tickAnim - 17) / 34) * (0-(0)));
            zz = 0 + (((tickAnim - 17) / 34) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm, rightArm.rotateAngleX + (float) Math.toRadians(xx), rightArm.rotateAngleY + (float) Math.toRadians(yy), rightArm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 9.97327 + (((tickAnim - 0) / 7) * (135.7866-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+50))*150-(9.97327)));
            yy = -0.7279 + (((tickAnim - 0) / 7) * (-0.36395-(-0.7279)));
            zz = -0.16104 + (((tickAnim - 0) / 7) * (-0.08052-(-0.16104)));
        }
        else if (tickAnim >= 7 && tickAnim < 14) {
            xx = 135.7866-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+50))*150 + (((tickAnim - 7) / 7) * (16-(135.7866-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+50))*150)));
            yy = -0.36395 + (((tickAnim - 7) / 7) * (0-(-0.36395)));
            zz = -0.08052 + (((tickAnim - 7) / 7) * (0-(-0.08052)));
        }
        else if (tickAnim >= 14 && tickAnim < 17) {
            xx = 16 + (((tickAnim - 14) / 3) * (14.2-(16)));
            yy = 0 + (((tickAnim - 14) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 3) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 51) {
            xx = 14.2 + (((tickAnim - 17) / 34) * (9.97327-(14.2)));
            yy = 0 + (((tickAnim - 17) / 34) * (-0.7279-(0)));
            zz = 0 + (((tickAnim - 17) / 34) * (-0.16104-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm2, rightArm2.rotateAngleX + (float) Math.toRadians(xx), rightArm2.rotateAngleY + (float) Math.toRadians(yy), rightArm2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (1.6-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0.825-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 7) / 7) * (0-(0)));
            yy = 1.6 + (((tickAnim - 7) / 7) * (-0.3-(1.6)));
            zz = 0.825 + (((tickAnim - 7) / 7) * (0-(0.825)));
        }
        else if (tickAnim >= 14 && tickAnim < 17) {
            xx = 0 + (((tickAnim - 14) / 3) * (0-(0)));
            yy = -0.3 + (((tickAnim - 14) / 3) * (-0.3-(-0.3)));
            zz = 0 + (((tickAnim - 14) / 3) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 51) {
            xx = 0 + (((tickAnim - 17) / 34) * (0-(0)));
            yy = -0.3 + (((tickAnim - 17) / 34) * (0-(-0.3)));
            zz = 0 + (((tickAnim - 17) / 34) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightArm2.rotationPointX = this.rightArm2.rotationPointX + (float)(xx);
        this.rightArm2.rotationPointY = this.rightArm2.rotationPointY - (float)(yy);
        this.rightArm2.rotationPointZ = this.rightArm2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 61.35-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-50))*-90 + (((tickAnim - 0) / 7) * (-15.705-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-50))*90-(61.35-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-50))*-90)));
            yy = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 14) {
            xx = -15.705-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-50))*90 + (((tickAnim - 7) / 7) * (8-(-15.705-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-50))*90)));
            yy = 0 + (((tickAnim - 7) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 7) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 17) {
            xx = 8 + (((tickAnim - 14) / 3) * (5.77-(8)));
            yy = 0 + (((tickAnim - 14) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 3) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 23) {
            xx = 5.77 + (((tickAnim - 17) / 6) * (2.75-(5.77)));
            yy = 0 + (((tickAnim - 17) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 17) / 6) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 33) {
            xx = 2.75 + (((tickAnim - 23) / 10) * (-6.69-(2.75)));
            yy = 0 + (((tickAnim - 23) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 10) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 51) {
            xx = -6.69 + (((tickAnim - 33) / 18) * (-7.675-(-6.69)));
            yy = 0 + (((tickAnim - 33) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 18) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm3, rightArm3.rotateAngleX + (float) Math.toRadians(xx), rightArm3.rotateAngleY + (float) Math.toRadians(yy), rightArm3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            yy = -1.225 + (((tickAnim - 0) / 7) * (0.49-(-1.225)));
            zz = 0 + (((tickAnim - 0) / 7) * (-0.925-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 7) / 7) * (0-(0)));
            yy = 0.49 + (((tickAnim - 7) / 7) * (-0.425-(0.49)));
            zz = -0.925 + (((tickAnim - 7) / 7) * (0-(-0.925)));
        }
        else if (tickAnim >= 14 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 14) / 9) * (0-(0)));
            yy = -0.425 + (((tickAnim - 14) / 9) * (0.3-(-0.425)));
            zz = 0 + (((tickAnim - 14) / 9) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 23) / 10) * (0-(0)));
            yy = 0.3 + (((tickAnim - 23) / 10) * (0.375-(0.3)));
            zz = 0 + (((tickAnim - 23) / 10) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 51) {
            xx = 0 + (((tickAnim - 33) / 18) * (0-(0)));
            yy = 0.375 + (((tickAnim - 33) / 18) * (-1.225-(0.375)));
            zz = 0 + (((tickAnim - 33) / 18) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightArm3.rotationPointX = this.rightArm3.rotationPointX + (float)(xx);
        this.rightArm3.rotationPointY = this.rightArm3.rotationPointY - (float)(yy);
        this.rightArm3.rotationPointZ = this.rightArm3.rotationPointZ + (float)(zz);



        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*283))*-0.59), neck.rotateAngleY + (float) Math.toRadians(0), neck.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(0.5-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*283-100))*-0.59), neck2.rotateAngleY + (float) Math.toRadians(0), neck2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(-0.925-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*283-250))*-1.5), neck3.rotateAngleY + (float) Math.toRadians(0), neck3.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(neck4, neck4.rotateAngleX + (float) Math.toRadians(-0.85-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*283-300))*-1), neck4.rotateAngleY + (float) Math.toRadians(0), neck4.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(neck5, neck5.rotateAngleX + (float) Math.toRadians(1-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*283-450))*-1), neck5.rotateAngleY + (float) Math.toRadians(0), neck5.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(neck6, neck6.rotateAngleX + (float) Math.toRadians(1-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*283-450))*-1), neck6.rotateAngleY + (float) Math.toRadians(0), neck6.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(-0.175-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*283-550))*-1), head.rotateAngleY + (float) Math.toRadians(0), head.rotateAngleZ + (float) Math.toRadians(0));



        if (tickAnim >= 0 && tickAnim < 37) {
            xx = -7.5 + (((tickAnim - 0) / 37) * (15.25-(-7.5)));
            yy = 0 + (((tickAnim - 0) / 37) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 37) * (0-(0)));
        }
        else if (tickAnim >= 37 && tickAnim < 44) {
            xx = 15.25 + (((tickAnim - 37) / 7) * (-88.195-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-100-(15.25)));
            yy = 0 + (((tickAnim - 37) / 7) * (-1.925-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+20))*-5-(0)));
            zz = 0 + (((tickAnim - 37) / 7) * (-2.025+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+20))*5-(0)));
        }
        else if (tickAnim >= 44 && tickAnim < 51) {
            xx = -88.195-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-100 + (((tickAnim - 44) / 7) * (-7.5-(-88.195-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-100)));
            yy = -1.925-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+20))*-5 + (((tickAnim - 44) / 7) * (0-(-1.925-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+20))*-5)));
            zz = -2.025+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+20))*5 + (((tickAnim - 44) / 7) * (0-(-2.025+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+20))*5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg, rightLeg.rotateAngleX + (float) Math.toRadians(xx), rightLeg.rotateAngleY + (float) Math.toRadians(yy), rightLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 37) {
            xx = -10 + (((tickAnim - 0) / 37) * (-2.25-(-10)));
            yy = 0 + (((tickAnim - 0) / 37) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 37) * (0-(0)));
        }
        else if (tickAnim >= 37 && tickAnim < 45) {
            xx = -2.25 + (((tickAnim - 37) / 8) * (-73.27-Math.sin((Math.PI/180)*(((double)tickAnim/20)*100-110))*-90-(-2.25)));
            yy = 0 + (((tickAnim - 37) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 37) / 8) * (0-(0)));
        }
        else if (tickAnim >= 45 && tickAnim < 51) {
            xx = -73.27-Math.sin((Math.PI/180)*(((double)tickAnim/20)*100-110))*-90 + (((tickAnim - 45) / 6) * (-10-(-73.27-Math.sin((Math.PI/180)*(((double)tickAnim/20)*100-110))*-90)));
            yy = 0 + (((tickAnim - 45) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 45) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg2, rightLeg2.rotateAngleX + (float) Math.toRadians(xx), rightLeg2.rotateAngleY + (float) Math.toRadians(yy), rightLeg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 37) {
            xx = 0 + (((tickAnim - 0) / 37) * (0-(0)));
            yy = -0.9 + (((tickAnim - 0) / 37) * (-0.595-(-0.9)));
            zz = 0 + (((tickAnim - 0) / 37) * (0-(0)));
        }
        else if (tickAnim >= 37 && tickAnim < 45) {
            xx = 0 + (((tickAnim - 37) / 8) * (0-(0)));
            yy = -0.595 + (((tickAnim - 37) / 8) * (-8.525+Math.sin((Math.PI/180)*(((double)tickAnim/20)*100+50))*-10-(-0.595)));
            zz = 0 + (((tickAnim - 37) / 8) * (0-(0)));
        }
        else if (tickAnim >= 45 && tickAnim < 51) {
            xx = 0 + (((tickAnim - 45) / 6) * (0-(0)));
            yy = -8.525+Math.sin((Math.PI/180)*(((double)tickAnim/20)*100+50))*-10 + (((tickAnim - 45) / 6) * (-0.9-(-8.525+Math.sin((Math.PI/180)*(((double)tickAnim/20)*100+50))*-10)));
            zz = 0 + (((tickAnim - 45) / 6) * (0-(0)));
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
            xx = 17.5 + (((tickAnim - 0) / 20) * (1.5-(17.5)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 37) {
            xx = 1.5 + (((tickAnim - 20) / 17) * (17.25-(1.5)));
            yy = 0 + (((tickAnim - 20) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 17) * (0-(0)));
        }
        else if (tickAnim >= 37 && tickAnim < 45) {
            xx = 17.25 + (((tickAnim - 37) / 8) * (-62.1644-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-90-(17.25)));
            yy = 0 + (((tickAnim - 37) / 8) * (0.46007-(0)));
            zz = 0 + (((tickAnim - 37) / 8) * (0.71165-(0)));
        }
        else if (tickAnim >= 45 && tickAnim < 51) {
            xx = -62.1644-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-90 + (((tickAnim - 45) / 6) * (17.5-(-62.1644-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-90)));
            yy = 0.46007 + (((tickAnim - 45) / 6) * (0-(0.46007)));
            zz = 0.71165 + (((tickAnim - 45) / 6) * (0-(0.71165)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg3, rightLeg3.rotateAngleX + (float) Math.toRadians(xx), rightLeg3.rotateAngleY + (float) Math.toRadians(yy), rightLeg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            yy = 1.775 + (((tickAnim - 0) / 20) * (1.35-(1.775)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 37) {
            xx = 0 + (((tickAnim - 20) / 17) * (0-(0)));
            yy = 1.35 + (((tickAnim - 20) / 17) * (1.75-(1.35)));
            zz = 0 + (((tickAnim - 20) / 17) * (0-(0)));
        }
        else if (tickAnim >= 37 && tickAnim < 45) {
            xx = 0 + (((tickAnim - 37) / 8) * (0-(0)));
            yy = 1.75 + (((tickAnim - 37) / 8) * (4.71-(1.75)));
            zz = 0 + (((tickAnim - 37) / 8) * (0-(0)));
        }
        else if (tickAnim >= 45 && tickAnim < 51) {
            xx = 0 + (((tickAnim - 45) / 6) * (0-(0)));
            yy = 4.71 + (((tickAnim - 45) / 6) * (1.775-(4.71)));
            zz = 0 + (((tickAnim - 45) / 6) * (0-(0)));
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
        EntityPrehistoricFloraAragosaurus e = (EntityPrehistoricFloraAragosaurus) entity;
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
