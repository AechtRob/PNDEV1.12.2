package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.EntityPrehistoricFloraFukuititan;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;

public class ModelFukuititan extends ModelBasePalaeopedia {
    private final AdvancedModelRenderer Fukuititan;
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
    private final AdvancedModelRenderer chest;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer cube_r6;
    private final AdvancedModelRenderer rightArm1;
    private final AdvancedModelRenderer rightArm2;
    private final AdvancedModelRenderer rightHand;
    private final AdvancedModelRenderer leftArm1;
    private final AdvancedModelRenderer leftArm2;
    private final AdvancedModelRenderer leftHand;
    private final AdvancedModelRenderer neck1;
    private final AdvancedModelRenderer neck2;
    private final AdvancedModelRenderer neck3;
    private final AdvancedModelRenderer neck4;
    private final AdvancedModelRenderer neck5;
    private final AdvancedModelRenderer neck6;
    private final AdvancedModelRenderer head;
    private final AdvancedModelRenderer cube_r7;
    private final AdvancedModelRenderer cube_r8;
    private final AdvancedModelRenderer cube_r9;
    private final AdvancedModelRenderer cube_r10;
    private final AdvancedModelRenderer cube_r11;
    private final AdvancedModelRenderer cube_r12;
    private final AdvancedModelRenderer cube_r13;
    private final AdvancedModelRenderer cube_r14;
    private final AdvancedModelRenderer jaws;
    private final AdvancedModelRenderer cube_r15;
    private final AdvancedModelRenderer cube_r16;
    private final AdvancedModelRenderer cube_r17;
    private final AdvancedModelRenderer cube_r18;
    private final AdvancedModelRenderer cube_r19;
    private final AdvancedModelRenderer cube_r20;
    private final AdvancedModelRenderer cube_r21;
    private final AdvancedModelRenderer cube_r22;
    private final AdvancedModelRenderer cube_r23;
    private final AdvancedModelRenderer throat;
    private final AdvancedModelRenderer leftLeg1;
    private final AdvancedModelRenderer leftLeg2;
    private final AdvancedModelRenderer leftFoot;
    private final AdvancedModelRenderer leftToes;
    private final AdvancedModelRenderer rightLeg1;
    private final AdvancedModelRenderer rightLeg2;
    private final AdvancedModelRenderer rightFoot;
    private final AdvancedModelRenderer rightToes;

    private ModelAnimator animator;

    public ModelFukuititan() {
        this.textureWidth = 176;
        this.textureHeight = 176;

        this.Fukuititan = new AdvancedModelRenderer(this);
        this.Fukuititan.setRotationPoint(0.0F, 24.0F, 0.0F);


        this.hips = new AdvancedModelRenderer(this);
        this.hips.setRotationPoint(0.0F, -31.0F, 13.0F);
        this.Fukuititan.addChild(hips);


        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(7.5F, 7.3F, 6.5F);
        this.hips.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.3927F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 62, 60, -16.0F, -12.0F, -14.0F, 17, 12, 16, 0.0F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(6.0F, -2.0F, -5.75F);
        this.hips.addChild(cube_r2);
        this.setRotateAngle(cube_r2, -0.3491F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 81, 31, -13.0F, -10.0F, -3.0F, 14, 14, 15, 0.0F, false));

        this.tail1 = new AdvancedModelRenderer(this);
        this.tail1.setRotationPoint(0.0F, -1.25F, 6.75F);
        this.hips.addChild(tail1);
        this.setRotateAngle(tail1, -0.4363F, 0.0F, 0.0F);
        this.tail1.cubeList.add(new ModelBox(tail1, 96, 0, -5.5F, -6.0F, -1.5F, 11, 12, 16, 0.0F, false));

        this.tail2 = new AdvancedModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, -1.25F, 14.5F);
        this.tail1.addChild(tail2);
        this.setRotateAngle(tail2, 0.2182F, 0.0F, 0.0F);
        this.tail2.cubeList.add(new ModelBox(tail2, 34, 118, -4.5F, -4.0F, -2.0F, 9, 9, 16, 0.0F, false));

        this.tail3 = new AdvancedModelRenderer(this);
        this.tail3.setRotationPoint(0.0F, -1.25F, 14.0F);
        this.tail2.addChild(tail3);
        this.setRotateAngle(tail3, 0.1309F, 0.0F, 0.0F);
        this.tail3.cubeList.add(new ModelBox(tail3, 127, 123, -3.5F, -2.75F, -2.0F, 7, 7, 16, 0.0F, false));

        this.tail4 = new AdvancedModelRenderer(this);
        this.tail4.setRotationPoint(0.0F, -0.5F, 14.0F);
        this.tail3.addChild(tail4);
        this.setRotateAngle(tail4, -0.0436F, 0.0F, 0.0F);
        this.tail4.cubeList.add(new ModelBox(tail4, 0, 131, -2.5F, -2.0F, -1.0F, 5, 5, 16, 0.0F, false));

        this.tail5 = new AdvancedModelRenderer(this);
        this.tail5.setRotationPoint(0.0F, -0.25F, 15.0F);
        this.tail4.addChild(tail5);
        this.setRotateAngle(tail5, -0.0873F, 0.0F, 0.0F);
        this.tail5.cubeList.add(new ModelBox(tail5, 135, 102, -1.5F, -1.0F, -1.0F, 3, 3, 15, 0.0F, false));

        this.tail6 = new AdvancedModelRenderer(this);
        this.tail6.setRotationPoint(0.0F, 0.0F, 14.0F);
        this.tail5.addChild(tail6);
        this.setRotateAngle(tail6, -0.1309F, 0.0F, 0.0F);
        this.tail6.cubeList.add(new ModelBox(tail6, 87, 139, -1.0F, -0.75F, -1.0F, 2, 2, 15, 0.0F, false));

        this.tail7 = new AdvancedModelRenderer(this);
        this.tail7.setRotationPoint(0.0F, 0.0F, 14.0F);
        this.tail6.addChild(tail7);
        this.setRotateAngle(tail7, -0.1309F, 0.0F, 0.0F);
        this.tail7.cubeList.add(new ModelBox(tail7, 68, 127, -0.5F, -0.25F, -1.0F, 1, 1, 16, 0.0F, false));

        this.body = new AdvancedModelRenderer(this);
        this.body.setRotationPoint(0.0F, -5.55F, -7.5F);
        this.hips.addChild(body);
        this.body.cubeList.add(new ModelBox(body, 0, 0, -11.0F, -1.65F, -21.0F, 22, 20, 26, 0.0F, false));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(8.0F, -0.65F, -18.25F);
        this.body.addChild(cube_r3);
        this.setRotateAngle(cube_r3, -0.1309F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 0, 46, -17.0F, -9.0F, -1.0F, 18, 9, 21, 0.0F, false));

        this.chest = new AdvancedModelRenderer(this);
        this.chest.setRotationPoint(0.0F, -1.65F, -20.0F);
        this.body.addChild(chest);


        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(7.0F, 14.55F, -9.25F);
        this.chest.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.2618F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 89, 117, -15.0F, -12.0F, -1.0F, 16, 11, 11, 0.0F, false));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(6.0F, 7.95F, -10.25F);
        this.chest.addChild(cube_r5);
        this.setRotateAngle(cube_r5, -0.2182F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 100, 88, -13.0F, -18.0F, -1.0F, 14, 18, 11, 0.0F, false));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(8.0F, 14.75F, -8.95F);
        this.chest.addChild(cube_r6);
        this.setRotateAngle(cube_r6, -0.5236F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 0, 76, -17.0F, -16.0F, -2.0F, 18, 16, 12, 0.0F, false));

        this.rightArm1 = new AdvancedModelRenderer(this);
        this.rightArm1.setRotationPoint(-9.0F, 10.75F, -4.95F);
        this.chest.addChild(rightArm1);
        this.setRotateAngle(rightArm1, 0.2182F, 0.0F, 0.0F);
        this.rightArm1.cubeList.add(new ModelBox(rightArm1, 70, 0, -2.75F, 0.0F, -3.0F, 6, 14, 6, 0.0F, false));

        this.rightArm2 = new AdvancedModelRenderer(this);
        this.rightArm2.setRotationPoint(0.0F, 14.0F, 0.0F);
        this.rightArm1.addChild(rightArm2);
        this.setRotateAngle(rightArm2, -0.2618F, 0.0F, 0.0F);
        this.rightArm2.cubeList.add(new ModelBox(rightArm2, 0, 46, -2.25F, -1.0F, -3.0F, 5, 10, 5, 0.0F, false));

        this.rightHand = new AdvancedModelRenderer(this);
        this.rightHand.setRotationPoint(0.0F, 9.0F, -0.75F);
        this.rightArm2.addChild(rightHand);
        this.setRotateAngle(rightHand, 0.0436F, 0.0F, 0.0F);
        this.rightHand.cubeList.add(new ModelBox(rightHand, 57, 46, -2.75F, -1.15F, -2.0F, 6, 6, 4, 0.0F, false));

        this.leftArm1 = new AdvancedModelRenderer(this);
        this.leftArm1.setRotationPoint(9.0F, 10.75F, -4.95F);
        this.chest.addChild(leftArm1);
        this.setRotateAngle(leftArm1, 0.2182F, 0.0F, 0.0F);
        this.leftArm1.cubeList.add(new ModelBox(leftArm1, 70, 0, -3.25F, 0.0F, -3.0F, 6, 14, 6, 0.0F, true));

        this.leftArm2 = new AdvancedModelRenderer(this);
        this.leftArm2.setRotationPoint(0.0F, 14.0F, 0.0F);
        this.leftArm1.addChild(leftArm2);
        this.setRotateAngle(leftArm2, -0.2618F, 0.0F, 0.0F);
        this.leftArm2.cubeList.add(new ModelBox(leftArm2, 0, 46, -2.75F, -1.0F, -3.0F, 5, 10, 5, 0.0F, true));

        this.leftHand = new AdvancedModelRenderer(this);
        this.leftHand.setRotationPoint(0.0F, 9.0F, -0.75F);
        this.leftArm2.addChild(leftHand);
        this.setRotateAngle(leftHand, 0.0436F, 0.0F, 0.0F);
        this.leftHand.cubeList.add(new ModelBox(leftHand, 57, 46, -3.25F, -1.15F, -2.0F, 6, 6, 4, 0.0F, true));

        this.neck1 = new AdvancedModelRenderer(this);
        this.neck1.setRotationPoint(0.0F, -5.45F, -8.25F);
        this.chest.addChild(neck1);
        this.setRotateAngle(neck1, -0.6109F, 0.0F, 0.0F);
        this.neck1.cubeList.add(new ModelBox(neck1, 44, 88, -6.0F, -4.25F, -12.0F, 12, 14, 16, 0.0F, false));

        this.neck2 = new AdvancedModelRenderer(this);
        this.neck2.setRotationPoint(0.0F, 0.0F, -12.0F);
        this.neck1.addChild(neck2);
        this.setRotateAngle(neck2, -0.1745F, 0.0F, 0.0F);
        this.neck2.cubeList.add(new ModelBox(neck2, 0, 104, -5.0F, -4.25F, -12.0F, 10, 12, 15, 0.0F, false));

        this.neck3 = new AdvancedModelRenderer(this);
        this.neck3.setRotationPoint(0.0F, 0.0F, -12.0F);
        this.neck2.addChild(neck3);
        this.setRotateAngle(neck3, -0.2618F, 0.0F, 0.0F);
        this.neck3.cubeList.add(new ModelBox(neck3, 124, 45, -4.0F, -4.0F, -12.25F, 8, 10, 15, 0.0F, false));

        this.neck4 = new AdvancedModelRenderer(this);
        this.neck4.setRotationPoint(0.0F, 0.0F, -12.0F);
        this.neck3.addChild(neck4);
        this.setRotateAngle(neck4, 0.0873F, 0.0F, 0.0F);
        this.neck4.cubeList.add(new ModelBox(neck4, 136, 14, -3.0F, -3.75F, -13.25F, 6, 9, 14, 0.0F, false));

        this.neck5 = new AdvancedModelRenderer(this);
        this.neck5.setRotationPoint(0.0F, -0.5F, -13.25F);
        this.neck4.addChild(neck5);
        this.setRotateAngle(neck5, 0.2182F, 0.0F, 0.0F);
        this.neck5.cubeList.add(new ModelBox(neck5, 31, 143, -2.0F, -2.8F, -9.5F, 4, 7, 11, 0.0F, false));

        this.neck6 = new AdvancedModelRenderer(this);
        this.neck6.setRotationPoint(0.0F, 0.3F, -9.5F);
        this.neck5.addChild(neck6);
        this.setRotateAngle(neck6, 0.48F, 0.0F, 0.0F);
        this.neck6.cubeList.add(new ModelBox(neck6, 57, 56, -1.5F, -2.5F, -4.6F, 3, 5, 6, 0.0F, false));

        this.head = new AdvancedModelRenderer(this);
        this.head.setRotationPoint(1.0F, -0.75F, -4.15F);
        this.neck6.addChild(head);
        this.setRotateAngle(head, 0.4363F, 0.0F, 0.0F);
        this.head.cubeList.add(new ModelBox(head, 0, 61, -3.0F, -1.75F, -2.75F, 4, 3, 3, 0.01F, false));
        this.head.cubeList.add(new ModelBox(head, 14, 20, -3.0F, -1.5F, -2.55F, 4, 1, 1, 0.02F, false));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(-0.5F, -0.8F, -0.15F);
        this.head.addChild(cube_r7);
        this.setRotateAngle(cube_r7, -0.1745F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 13, 22, -2.0F, -1.0F, -2.65F, 3, 1, 3, 0.01F, false));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(-0.5F, -1.55F, -1.65F);
        this.head.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.3491F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 0, 76, -2.0F, -1.0F, -2.65F, 3, 2, 2, 0.0F, false));

        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(-0.5F, -1.55F, -3.25F);
        this.head.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.9599F, 0.0F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 94, 7, -2.0F, -1.0F, -2.65F, 3, 1, 2, 0.01F, false));

        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(-0.5F, -0.925F, -3.45F);
        this.head.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 0.8727F, 0.0F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 48, 85, -2.0F, -1.0F, -3.75F, 3, 1, 2, 0.0F, false));

        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(-0.5F, 1.3F, -2.75F);
        this.head.addChild(cube_r11);
        this.setRotateAngle(cube_r11, 0.2618F, 0.0F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 88, 0, -2.0F, -1.0F, -3.75F, 3, 1, 2, 0.01F, false));
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 48, 76, -2.5F, -2.0F, -2.35F, 4, 2, 3, 0.0F, false));

        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(1.0F, 3.225F, -5.025F);
        this.head.addChild(cube_r12);
        this.setRotateAngle(cube_r12, 0.3491F, 0.1658F, 0.1222F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 0, 0, -0.8F, -2.0F, -0.9F, 0, 1, 2, 0.0F, true));

        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(-3.0F, 3.225F, -5.025F);
        this.head.addChild(cube_r13);
        this.setRotateAngle(cube_r13, 0.3491F, -0.1658F, -0.1222F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 0, 0, 0.8F, -2.0F, -0.9F, 0, 1, 2, 0.0F, false));

        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(-1.0F, 2.225F, -4.975F);
        this.head.addChild(cube_r14);
        this.setRotateAngle(cube_r14, 0.3578F, 0.0F, 0.0F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 0, 0, -1.0F, -1.15F, -1.15F, 2, 1, 0, 0.0F, false));

        this.jaws = new AdvancedModelRenderer(this);
        this.jaws.setRotationPoint(-1.0F, 1.25F, 0.25F);
        this.head.addChild(jaws);
        this.setRotateAngle(jaws, -0.0873F, 0.0F, 0.0F);
        this.jaws.cubeList.add(new ModelBox(jaws, 70, 20, -2.0F, 0.0F, -3.0F, 4, 2, 3, 0.0F, false));

        this.cube_r15 = new AdvancedModelRenderer(this);
        this.cube_r15.setRotationPoint(1.0F, 2.075F, -5.2F);
        this.jaws.addChild(cube_r15);
        this.setRotateAngle(cube_r15, 0.0349F, 0.0F, 0.0F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 48, 81, -3.0F, -1.0F, 0.3F, 4, 1, 3, -0.02F, false));

        this.cube_r16 = new AdvancedModelRenderer(this);
        this.cube_r16.setRotationPoint(0.5F, 2.15F, -5.125F);
        this.jaws.addChild(cube_r16);
        this.setRotateAngle(cube_r16, 0.3971F, 0.0F, 0.0F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 0, 80, -2.0F, -1.0F, -1.0F, 3, 1, 2, -0.02F, false));

        this.cube_r17 = new AdvancedModelRenderer(this);
        this.cube_r17.setRotationPoint(0.0F, 0.975F, -5.225F);
        this.jaws.addChild(cube_r17);
        this.setRotateAngle(cube_r17, 0.3578F, 0.0F, 0.0F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 0, 1, -1.0F, -0.3F, -1.1F, 2, 1, 0, 0.0F, false));

        this.cube_r18 = new AdvancedModelRenderer(this);
        this.cube_r18.setRotationPoint(0.5F, 1.975F, -5.225F);
        this.jaws.addChild(cube_r18);
        this.setRotateAngle(cube_r18, 0.3578F, 0.0F, 0.0F);
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 0, 83, -2.0F, -1.0F, -1.0F, 3, 1, 2, -0.01F, false));

        this.cube_r19 = new AdvancedModelRenderer(this);
        this.cube_r19.setRotationPoint(1.0F, 1.975F, -5.275F);
        this.jaws.addChild(cube_r19);
        this.setRotateAngle(cube_r19, 0.3491F, 0.0F, 0.0F);
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 81, 22, -3.0F, -1.0F, 0.4F, 4, 1, 3, -0.015F, false));

        this.cube_r20 = new AdvancedModelRenderer(this);
        this.cube_r20.setRotationPoint(2.0F, 1.975F, -5.275F);
        this.jaws.addChild(cube_r20);
        this.setRotateAngle(cube_r20, 0.3491F, 0.3054F, 0.0F);
        this.cube_r20.cubeList.add(new ModelBox(cube_r20, 0, 1, -0.6F, -1.3F, -0.9F, 0, 1, 2, 0.0F, true));

        this.cube_r21 = new AdvancedModelRenderer(this);
        this.cube_r21.setRotationPoint(-2.0F, 1.975F, -5.275F);
        this.jaws.addChild(cube_r21);
        this.setRotateAngle(cube_r21, 0.3491F, -0.3054F, 0.0F);
        this.cube_r21.cubeList.add(new ModelBox(cube_r21, 0, 1, 0.6F, -1.3F, -0.9F, 0, 1, 2, 0.0F, false));

        this.cube_r22 = new AdvancedModelRenderer(this);
        this.cube_r22.setRotationPoint(1.0F, -1.5F, -1.15F);
        this.jaws.addChild(cube_r22);
        this.setRotateAngle(cube_r22, 0.0829F, 0.0F, 0.0F);
        this.cube_r22.cubeList.add(new ModelBox(cube_r22, 11, 61, -3.0F, 0.0F, 0.0F, 4, 2, 1, -0.015F, false));

        this.cube_r23 = new AdvancedModelRenderer(this);
        this.cube_r23.setRotationPoint(1.0F, 0.0F, -3.0F);
        this.jaws.addChild(cube_r23);
        this.setRotateAngle(cube_r23, 1.1345F, 0.0F, 0.0F);
        this.cube_r23.cubeList.add(new ModelBox(cube_r23, 69, 56, -3.0F, 0.0F, 0.0F, 4, 2, 2, -0.01F, false));

        this.throat = new AdvancedModelRenderer(this);
        this.throat.setRotationPoint(0.0F, 2.0F, 1.25F);
        this.jaws.addChild(throat);
        this.setRotateAngle(throat, -0.48F, 0.0F, 0.0F);
        this.throat.cubeList.add(new ModelBox(throat, 94, 0, -1.5F, -0.4993F, -3.8828F, 3, 2, 5, -0.01F, false));

        this.leftLeg1 = new AdvancedModelRenderer(this);
        this.leftLeg1.setRotationPoint(8.5F, -1.25F, 0.25F);
        this.hips.addChild(leftLeg1);
        this.setRotateAngle(leftLeg1, -0.2618F, 0.0F, 0.0F);
        this.leftLeg1.cubeList.add(new ModelBox(leftLeg1, 139, 70, -3.5F, 0.0F, -3.0F, 7, 19, 8, 0.0F, true));

        this.leftLeg2 = new AdvancedModelRenderer(this);
        this.leftLeg2.setRotationPoint(0.0F, 19.0F, 0.65F);
        this.leftLeg1.addChild(leftLeg2);
        this.setRotateAngle(leftLeg2, 0.3054F, 0.0F, 0.0F);
        this.leftLeg2.cubeList.add(new ModelBox(leftLeg2, 0, 0, -3.0F, -2.0F, -2.75F, 6, 14, 6, 0.0F, true));

        this.leftFoot = new AdvancedModelRenderer(this);
        this.leftFoot.setRotationPoint(0.0F, 11.0F, 0.0F);
        this.leftLeg2.addChild(leftFoot);
        this.setRotateAngle(leftFoot, -0.0436F, 0.0F, 0.0F);
        this.leftFoot.cubeList.add(new ModelBox(leftFoot, 84, 88, -3.5F, 0.0F, -3.25F, 7, 3, 6, 0.0F, true));

        this.leftToes = new AdvancedModelRenderer(this);
        this.leftToes.setRotationPoint(-0.25F, 0.0F, -3.25F);
        this.leftFoot.addChild(leftToes);
        this.setRotateAngle(leftToes, 0.0F, -0.1745F, 0.0F);
        this.leftToes.cubeList.add(new ModelBox(leftToes, 0, 20, -3.0F, 0.0F, -1.5F, 6, 3, 2, -0.01F, true));

        this.rightLeg1 = new AdvancedModelRenderer(this);
        this.rightLeg1.setRotationPoint(-8.5F, -1.25F, 0.25F);
        this.hips.addChild(rightLeg1);
        this.setRotateAngle(rightLeg1, -0.2618F, 0.0F, 0.0F);
        this.rightLeg1.cubeList.add(new ModelBox(rightLeg1, 139, 70, -3.5F, 0.0F, -3.0F, 7, 19, 8, 0.0F, false));

        this.rightLeg2 = new AdvancedModelRenderer(this);
        this.rightLeg2.setRotationPoint(0.0F, 19.0F, 0.65F);
        this.rightLeg1.addChild(rightLeg2);
        this.setRotateAngle(rightLeg2, 0.3054F, 0.0F, 0.0F);
        this.rightLeg2.cubeList.add(new ModelBox(rightLeg2, 0, 0, -3.0F, -2.0F, -2.75F, 6, 14, 6, 0.0F, false));

        this.rightFoot = new AdvancedModelRenderer(this);
        this.rightFoot.setRotationPoint(0.0F, 11.0F, 0.0F);
        this.rightLeg2.addChild(rightFoot);
        this.setRotateAngle(rightFoot, -0.0436F, 0.0F, 0.0F);
        this.rightFoot.cubeList.add(new ModelBox(rightFoot, 84, 88, -3.5F, 0.0F, -3.25F, 7, 3, 6, 0.0F, false));

        this.rightToes = new AdvancedModelRenderer(this);
        this.rightToes.setRotationPoint(0.25F, 0.0F, -3.25F);
        this.rightFoot.addChild(rightToes);
        this.setRotateAngle(rightToes, 0.0F, 0.1745F, 0.0F);
        this.rightToes.cubeList.add(new ModelBox(rightToes, 0, 20, -3.0F, 0.0F, -1.5F, 6, 3, 2, -0.01F, false));

        updateDefaultPose();
        animator = ModelAnimator.create();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        animate((IAnimatedEntity) entity, f, f1, f2, f3, f4, f5);
        this.Fukuititan.render(f5);
    }
    public void renderStaticWall(float f) {
        this.neck1.rotateAngleX = (float) Math.toRadians(90);
        this.setRotateAngle(neck6, 0.2182F, 0.0F, 0.0F);
        this.setRotateAngle(neck5, 0.2674F, -0.1065F, -0.0237F);
        this.setRotateAngle(neck4, 0.1493F, -0.1122F, -0.0168F);
        this.setRotateAngle(neck3, 0.0303F, -0.0959F, 0.0042F);
        this.setRotateAngle(neck2, 0.0302F, -0.1352F, 0.0053F);
        this.setRotateAngle(neck1, -0.0632F, -0.1362F, 0.031F);
        this.setRotateAngle(head, 0.2705F, 0.0F, 0.0F);
        this.neck1.offsetY = -0F;
        this.neck1.offsetX = -0F;
        this.neck1.offsetZ = 0.04F;
        this.neck1.render(0.01F);
        resetToDefaultPose();
    }
    public void renderStaticFloor(float f) {
        this.setRotateAngle(throat, -0.6807F, 0.0F, 0.0F);
        this.setRotateAngle(tail7, -0.1399F, 0.3589F, -0.0494F);
        this.setRotateAngle(tail6, -0.1366F, 0.2898F, -0.0393F);
        this.setRotateAngle(tail5, -0.0903F, 0.2608F, -0.0233F);
        this.setRotateAngle(tail4, -0.0455F, 0.2877F, -0.0129F);
        this.setRotateAngle(tail3, 0.135F, 0.2465F, 0.0331F);
        this.setRotateAngle(tail2, 0.2239F, 0.2257F, 0.0509F);
        this.setRotateAngle(tail1, -0.4396F, 0.1186F, -0.0556F);
        this.setRotateAngle(rightToes, 0.0F, 0.1745F, 0.0F);
        this.setRotateAngle(rightLeg2, 0.3054F, 0.0F, 0.0F);
        this.setRotateAngle(rightLeg1, -0.2618F, 0.0F, 0.0F);
        this.setRotateAngle(rightHand, 0.0436F, 0.0F, 0.0F);
        this.setRotateAngle(rightFoot, -0.0436F, 0.0F, 0.0F);
        this.setRotateAngle(rightArm2, -0.2618F, 0.0F, 0.0F);
        this.setRotateAngle(rightArm1, 0.2182F, 0.0F, 0.0F);
        this.setRotateAngle(neck6, 0.2182F, 0.0F, 0.0F);
        this.setRotateAngle(neck5, 0.2674F, -0.1065F, -0.0237F);
        this.setRotateAngle(neck4, 0.1493F, -0.1122F, -0.0168F);
        this.setRotateAngle(neck3, 0.0303F, -0.0959F, 0.0042F);
        this.setRotateAngle(neck2, 0.0302F, -0.1352F, 0.0053F);
        this.setRotateAngle(neck1, -0.0632F, -0.1362F, 0.031F);
        this.setRotateAngle(leftToes, 0.0F, -0.1745F, 0.0F);
        this.setRotateAngle(leftLeg2, 0.3054F, 0.0F, 0.0F);
        this.setRotateAngle(leftLeg1, -0.2618F, 0.0F, 0.0F);
        this.setRotateAngle(leftHand, 0.0436F, 0.0F, 0.0F);
        this.setRotateAngle(leftFoot, -0.0436F, 0.0F, 0.0F);
        this.setRotateAngle(leftArm2, -0.2618F, 0.0F, 0.0F);
        this.setRotateAngle(leftArm1, 0.2182F, 0.0F, 0.0F);
        this.setRotateAngle(jaws, 0.2138F, 0.0F, 0.0F);
        this.setRotateAngle(hips, 0.0F, -0.0218F, 0.0F);
        this.setRotateAngle(head, 0.2705F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r9, 0.9599F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r8, 0.3491F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r7, -0.1745F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r6, -0.5236F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r5, -0.2182F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r4, 0.2618F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r3, -0.1309F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r23, 1.1345F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r22, 0.0829F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r21, 0.3491F, -0.3054F, 0.0F);
        this.setRotateAngle(cube_r20, 0.3491F, 0.3054F, 0.0F);
        this.setRotateAngle(cube_r2, -0.3491F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r19, 0.3491F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r18, 0.3578F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r17, 0.3578F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r16, 0.3971F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r15, 0.0349F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r14, 0.3578F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r13, 0.3491F, -0.1658F, -0.1222F);
        this.setRotateAngle(cube_r12, 0.3491F, 0.1658F, 0.1222F);
        this.setRotateAngle(cube_r11, 0.2618F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r10, 0.8727F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r1, 0.3927F, 0.0F, 0.0F);
        this.setRotateAngle(chest, 0.0F, -0.1222F, 0.0F);
        this.setRotateAngle(body, 0.0F, -0.0567F, 0.0F);
        this.Fukuititan.offsetY = -0.16F;
        this.Fukuititan.render(0.01F);
        resetToDefaultPose();
    }

    @Override
    public void renderStaticBook(float f) {
        //Rotations, positions and sizing:
        this.Fukuititan.offsetY = 0.6F;
        this.Fukuititan.offsetX = -0.45F;
        this.Fukuititan.rotateAngleY = (float)Math.toRadians(225);
        this.Fukuititan.rotateAngleX = (float)Math.toRadians(8);
        this.Fukuititan.rotateAngleZ = (float)Math.toRadians(-8);
        this.Fukuititan.scaleChildren = true;
        float scaler = 0.48F;
        this.Fukuititan.setScale(scaler, scaler, scaler);
        //Start of pose:

        //End of pose, now render the model:
        this.Fukuititan.render(f);
        //Reset rotations, positions and sizing:
        this.Fukuititan.setScale(1.0F, 1.0F, 1.0F);
        this.Fukuititan.scaleChildren = false;
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

        EntityPrehistoricFloraFukuititan Fukuititan = (EntityPrehistoricFloraFukuititan) e;

//        this.faceTarget(f3, f4, 6, neck1);
//        this.faceTarget(f3, f4, 6, neck2);
//        this.faceTarget(f3, f4, 6, neck3);
//        this.faceTarget(f3, f4, 4, neck4);
//        this.faceTarget(f3, f4, 4, neck5);
//        this.faceTarget(f3, f4, 4, head);

        boolean isBaby = Fukuititan.getJuvenile();

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

        Fukuititan.tailBuffer.applyChainSwingBuffer(Tail);
        float masterSpeed = Fukuititan.getTravelSpeed()/2;

        if (!Fukuititan.isInWater()) {

            if (f3 == 0.0F || !Fukuititan.getIsMoving()) {
                if (Fukuititan.getAnimation() != Fukuititan.EAT_ANIMATION
                        && Fukuititan.getAnimation() != Fukuititan.DRINK_ANIMATION
                        && Fukuititan.getAnimation() != Fukuititan.ATTACK_ANIMATION) {
                    this.chainFlap(Neck, 0.05F, 0.02F, 0.5, f2, 0.8F);
                    this.chainWave(Neck, 0.05F * 2, -0.01F, 0.5F, f2, 0.8F);
                }

                if (Fukuititan.getAnimation() != Fukuititan.ATTACK_ANIMATION) {
                    this.chainFlap(Tail, (0.15F * 0.1F), 0.05F, 0.2F, f2, 1F);
                    this.chainWave(Tail, (0.15F * 0.1F) * 2F, 0.05F * 0.15F, 0.12F, f2, 1F);
                    this.chainSwing(Tail, (0.15F * 0.1F) * 8F, 0.05F * 0.15F, 0F, f2, 1F);
                }

                return;
            }

            if (Fukuititan.getAnimation() != Fukuititan.EAT_ANIMATION
                    && Fukuititan.getAnimation() != Fukuititan.DRINK_ANIMATION
                    && Fukuititan.getAnimation() != Fukuititan.ATTACK_ANIMATION
                    && Fukuititan.getAnimation() != Fukuititan.ATTACK_ANIMATION) {
                this.chainFlap(Neck, 0.05F, 0.02F, 0.5, f2, 0.8F);
                this.chainWave(Neck, 0.05F * 2, -0.01F, 0.5F, f2, 0.8F);
                this.chainFlap(Tail, (0.15F * 0.1F), 0.05F, 0.2F, f2, 1F);
                this.chainWave(Tail, (0.15F * 0.1F) * 2F, 0.05F * 0.15F, 0.12F, f2, 1F);
                this.chainSwing(Tail, (0.15F * 0.1F) * 8F, 0.05F * 0.15F, 0F, f2, 1F);
            }

            if (Fukuititan.getIsFast()) { //Running
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
        EntityPrehistoricFloraFukuititan ee = (EntityPrehistoricFloraFukuititan) entitylivingbaseIn;

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
        EntityPrehistoricFloraFukuititan entity = (EntityPrehistoricFloraFukuititan) entitylivingbaseIn;
        int animCycle = 245;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 80) {
            xx = 0 + (((tickAnim - 0) / 80) * (-3.5-(0)));
            yy = 0 + (((tickAnim - 0) / 80) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 80) * (0-(0)));
        }
        else if (tickAnim >= 80 && tickAnim < 221) {
            xx = -3.5 + (((tickAnim - 80) / 141) * (-3.5-(-3.5)));
            yy = 0 + (((tickAnim - 80) / 141) * (0-(0)));
            zz = 0 + (((tickAnim - 80) / 141) * (0-(0)));
        }
        else if (tickAnim >= 221 && tickAnim < 245) {
            xx = -3.5 + (((tickAnim - 221) / 24) * (0-(-3.5)));
            yy = 0 + (((tickAnim - 221) / 24) * (0-(0)));
            zz = 0 + (((tickAnim - 221) / 24) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(hips, hips.rotateAngleX + (float) Math.toRadians(xx), hips.rotateAngleY + (float) Math.toRadians(yy), hips.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 80) {
            xx = 0 + (((tickAnim - 0) / 80) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 80) * (-1.1-(0)));
            zz = 0 + (((tickAnim - 0) / 80) * (0-(0)));
        }
        else if (tickAnim >= 80 && tickAnim < 221) {
            xx = 0 + (((tickAnim - 80) / 141) * (0-(0)));
            yy = -1.1 + (((tickAnim - 80) / 141) * (-1.1-(-1.1)));
            zz = 0 + (((tickAnim - 80) / 141) * (0-(0)));
        }
        else if (tickAnim >= 221 && tickAnim < 245) {
            xx = 0 + (((tickAnim - 221) / 24) * (0-(0)));
            yy = -1.1 + (((tickAnim - 221) / 24) * (0-(-1.1)));
            zz = 0 + (((tickAnim - 221) / 24) * (0-(0)));
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
            xx = 0 + (((tickAnim - 0) / 80) * (-7-(0)));
            yy = 0 + (((tickAnim - 0) / 80) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 80) * (0-(0)));
        }
        else if (tickAnim >= 80 && tickAnim < 221) {
            xx = -7 + (((tickAnim - 80) / 141) * (-7-(-7)));
            yy = 0 + (((tickAnim - 80) / 141) * (0-(0)));
            zz = 0 + (((tickAnim - 80) / 141) * (0-(0)));
        }
        else if (tickAnim >= 221 && tickAnim < 245) {
            xx = -7 + (((tickAnim - 221) / 24) * (0-(-7)));
            yy = 0 + (((tickAnim - 221) / 24) * (0-(0)));
            zz = 0 + (((tickAnim - 221) / 24) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail1, tail1.rotateAngleX + (float) Math.toRadians(xx), tail1.rotateAngleY + (float) Math.toRadians(yy), tail1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 80) {
            xx = 0 + (((tickAnim - 0) / 80) * (-10.5-(0)));
            yy = 0 + (((tickAnim - 0) / 80) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 80) * (0-(0)));
        }
        else if (tickAnim >= 80 && tickAnim < 221) {
            xx = -10.5 + (((tickAnim - 80) / 141) * (-10.5-(-10.5)));
            yy = 0 + (((tickAnim - 80) / 141) * (0-(0)));
            zz = 0 + (((tickAnim - 80) / 141) * (0-(0)));
        }
        else if (tickAnim >= 221 && tickAnim < 245) {
            xx = -10.5 + (((tickAnim - 221) / 24) * (0-(-10.5)));
            yy = 0 + (((tickAnim - 221) / 24) * (0-(0)));
            zz = 0 + (((tickAnim - 221) / 24) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(xx), tail2.rotateAngleY + (float) Math.toRadians(yy), tail2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 245) {
            xx = 0 + (((tickAnim - 0) / 245) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 245) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 245) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(xx), tail3.rotateAngleY + (float) Math.toRadians(yy), tail3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 80) {
            xx = 0 + (((tickAnim - 0) / 80) * (7.25-(0)));
            yy = 0 + (((tickAnim - 0) / 80) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 80) * (0-(0)));
        }
        else if (tickAnim >= 80 && tickAnim < 221) {
            xx = 7.25 + (((tickAnim - 80) / 141) * (7.25-(7.25)));
            yy = 0 + (((tickAnim - 80) / 141) * (0-(0)));
            zz = 0 + (((tickAnim - 80) / 141) * (0-(0)));
        }
        else if (tickAnim >= 221 && tickAnim < 245) {
            xx = 7.25 + (((tickAnim - 221) / 24) * (0-(7.25)));
            yy = 0 + (((tickAnim - 221) / 24) * (0-(0)));
            zz = 0 + (((tickAnim - 221) / 24) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(xx), tail4.rotateAngleY + (float) Math.toRadians(yy), tail4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 80) {
            xx = 0 + (((tickAnim - 0) / 80) * (15.25-(0)));
            yy = 0 + (((tickAnim - 0) / 80) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 80) * (0-(0)));
        }
        else if (tickAnim >= 80 && tickAnim < 221) {
            xx = 15.25 + (((tickAnim - 80) / 141) * (15.25-(15.25)));
            yy = 0 + (((tickAnim - 80) / 141) * (0-(0)));
            zz = 0 + (((tickAnim - 80) / 141) * (0-(0)));
        }
        else if (tickAnim >= 221 && tickAnim < 245) {
            xx = 15.25 + (((tickAnim - 221) / 24) * (0-(15.25)));
            yy = 0 + (((tickAnim - 221) / 24) * (0-(0)));
            zz = 0 + (((tickAnim - 221) / 24) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail5, tail5.rotateAngleX + (float) Math.toRadians(xx), tail5.rotateAngleY + (float) Math.toRadians(yy), tail5.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 80) {
            xx = 0 + (((tickAnim - 0) / 80) * (14.5-(0)));
            yy = 0 + (((tickAnim - 0) / 80) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 80) * (0-(0)));
        }
        else if (tickAnim >= 80 && tickAnim < 221) {
            xx = 14.5 + (((tickAnim - 80) / 141) * (14.5-(14.5)));
            yy = 0 + (((tickAnim - 80) / 141) * (0-(0)));
            zz = 0 + (((tickAnim - 80) / 141) * (0-(0)));
        }
        else if (tickAnim >= 221 && tickAnim < 227) {
            xx = 14.5 + (((tickAnim - 221) / 6) * (7.76-(14.5)));
            yy = 0 + (((tickAnim - 221) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 221) / 6) * (0-(0)));
        }
        else if (tickAnim >= 227 && tickAnim < 245) {
            xx = 7.76 + (((tickAnim - 227) / 18) * (0-(7.76)));
            yy = 0 + (((tickAnim - 227) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 227) / 18) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail6, tail6.rotateAngleX + (float) Math.toRadians(xx), tail6.rotateAngleY + (float) Math.toRadians(yy), tail6.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 80) {
            xx = 0 + (((tickAnim - 0) / 80) * (11.75-(0)));
            yy = 0 + (((tickAnim - 0) / 80) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 80) * (0-(0)));
        }
        else if (tickAnim >= 80 && tickAnim < 221) {
            xx = 11.75 + (((tickAnim - 80) / 141) * (11.75-(11.75)));
            yy = 0 + (((tickAnim - 80) / 141) * (0-(0)));
            zz = 0 + (((tickAnim - 80) / 141) * (0-(0)));
        }
        else if (tickAnim >= 221 && tickAnim < 227) {
            xx = 11.75 + (((tickAnim - 221) / 6) * (2.97-(11.75)));
            yy = 0 + (((tickAnim - 221) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 221) / 6) * (0-(0)));
        }
        else if (tickAnim >= 227 && tickAnim < 245) {
            xx = 2.97 + (((tickAnim - 227) / 18) * (0-(2.97)));
            yy = 0 + (((tickAnim - 227) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 227) / 18) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail7, tail7.rotateAngleX + (float) Math.toRadians(xx), tail7.rotateAngleY + (float) Math.toRadians(yy), tail7.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 80) {
            xx = 0 + (((tickAnim - 0) / 80) * (-2-(0)));
            yy = 0 + (((tickAnim - 0) / 80) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 80) * (0-(0)));
        }
        else if (tickAnim >= 80 && tickAnim < 221) {
            xx = -2 + (((tickAnim - 80) / 141) * (-2-(-2)));
            yy = 0 + (((tickAnim - 80) / 141) * (0-(0)));
            zz = 0 + (((tickAnim - 80) / 141) * (0-(0)));
        }
        else if (tickAnim >= 221 && tickAnim < 245) {
            xx = -2 + (((tickAnim - 221) / 24) * (0-(-2)));
            yy = 0 + (((tickAnim - 221) / 24) * (0-(0)));
            zz = 0 + (((tickAnim - 221) / 24) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(xx), body.rotateAngleY + (float) Math.toRadians(yy), body.rotateAngleZ + (float) Math.toRadians(zz));



        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(0), chest.rotateAngleY + (float) Math.toRadians(0), chest.rotateAngleZ + (float) Math.toRadians(0));



        if (tickAnim >= 0 && tickAnim < 80) {
            xx = 0 + (((tickAnim - 0) / 80) * (-14.25-(0)));
            yy = 0 + (((tickAnim - 0) / 80) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 80) * (0-(0)));
        }
        else if (tickAnim >= 80 && tickAnim < 221) {
            xx = -14.25 + (((tickAnim - 80) / 141) * (-14.25-(-14.25)));
            yy = 0 + (((tickAnim - 80) / 141) * (0-(0)));
            zz = 0 + (((tickAnim - 80) / 141) * (0-(0)));
        }
        else if (tickAnim >= 221 && tickAnim < 233) {
            xx = -14.25 + (((tickAnim - 221) / 12) * (0.88-(-14.25)));
            yy = 0 + (((tickAnim - 221) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 221) / 12) * (0-(0)));
        }
        else if (tickAnim >= 233 && tickAnim < 245) {
            xx = 0.88 + (((tickAnim - 233) / 12) * (0-(0.88)));
            yy = 0 + (((tickAnim - 233) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 233) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm1, rightArm1.rotateAngleX + (float) Math.toRadians(xx), rightArm1.rotateAngleY + (float) Math.toRadians(yy), rightArm1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (-14.25-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 80) {
            xx = -14.25 + (((tickAnim - 40) / 40) * (11-(-14.25)));
            yy = 0 + (((tickAnim - 40) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 40) * (0-(0)));
        }
        else if (tickAnim >= 80 && tickAnim < 221) {
            xx = 11 + (((tickAnim - 80) / 141) * (11-(11)));
            yy = 0 + (((tickAnim - 80) / 141) * (0-(0)));
            zz = 0 + (((tickAnim - 80) / 141) * (0-(0)));
        }
        else if (tickAnim >= 221 && tickAnim < 233) {
            xx = 11 + (((tickAnim - 221) / 12) * (-21.31-(11)));
            yy = 0 + (((tickAnim - 221) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 221) / 12) * (0-(0)));
        }
        else if (tickAnim >= 233 && tickAnim < 245) {
            xx = -21.31 + (((tickAnim - 233) / 12) * (0-(-21.31)));
            yy = 0 + (((tickAnim - 233) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 233) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm2, rightArm2.rotateAngleX + (float) Math.toRadians(xx), rightArm2.rotateAngleY + (float) Math.toRadians(yy), rightArm2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 80) {
            xx = 0 + (((tickAnim - 40) / 40) * (0-(0)));
            yy = 0 + (((tickAnim - 40) / 40) * (-0.95-(0)));
            zz = 0 + (((tickAnim - 40) / 40) * (0.275-(0)));
        }
        else if (tickAnim >= 80 && tickAnim < 221) {
            xx = 0 + (((tickAnim - 80) / 141) * (0-(0)));
            yy = -0.95 + (((tickAnim - 80) / 141) * (-0.95-(-0.95)));
            zz = 0.275 + (((tickAnim - 80) / 141) * (0.275-(0.275)));
        }
        else if (tickAnim >= 221 && tickAnim < 233) {
            xx = 0 + (((tickAnim - 221) / 12) * (0-(0)));
            yy = -0.95 + (((tickAnim - 221) / 12) * (0.4-(-0.95)));
            zz = 0.275 + (((tickAnim - 221) / 12) * (0-(0.275)));
        }
        else if (tickAnim >= 233 && tickAnim < 245) {
            xx = 0 + (((tickAnim - 233) / 12) * (0-(0)));
            yy = 0.4 + (((tickAnim - 233) / 12) * (0-(0.4)));
            zz = 0 + (((tickAnim - 233) / 12) * (0-(0)));
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
            xx = 0 + (((tickAnim - 0) / 40) * (25.75-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 80) {
            xx = 25.75 + (((tickAnim - 40) / 40) * (6.25-(25.75)));
            yy = 0 + (((tickAnim - 40) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 40) * (0-(0)));
        }
        else if (tickAnim >= 80 && tickAnim < 221) {
            xx = 6.25 + (((tickAnim - 80) / 141) * (6.25-(6.25)));
            yy = 0 + (((tickAnim - 80) / 141) * (0-(0)));
            zz = 0 + (((tickAnim - 80) / 141) * (0-(0)));
        }
        else if (tickAnim >= 221 && tickAnim < 233) {
            xx = 6.25 + (((tickAnim - 221) / 12) * (44.23-(6.25)));
            yy = 0 + (((tickAnim - 221) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 221) / 12) * (0-(0)));
        }
        else if (tickAnim >= 233 && tickAnim < 245) {
            xx = 44.23 + (((tickAnim - 233) / 12) * (0-(44.23)));
            yy = 0 + (((tickAnim - 233) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 233) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightHand, rightHand.rotateAngleX + (float) Math.toRadians(xx), rightHand.rotateAngleY + (float) Math.toRadians(yy), rightHand.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 80) {
            xx = 0 + (((tickAnim - 40) / 40) * (0-(0)));
            yy = 0 + (((tickAnim - 40) / 40) * (-0.9-(0)));
            zz = 0 + (((tickAnim - 40) / 40) * (0-(0)));
        }
        else if (tickAnim >= 80 && tickAnim < 221) {
            xx = 0 + (((tickAnim - 80) / 141) * (0-(0)));
            yy = -0.9 + (((tickAnim - 80) / 141) * (-0.9-(-0.9)));
            zz = 0 + (((tickAnim - 80) / 141) * (0-(0)));
        }
        else if (tickAnim >= 221 && tickAnim < 233) {
            xx = 0 + (((tickAnim - 221) / 12) * (0-(0)));
            yy = -0.9 + (((tickAnim - 221) / 12) * (0.725-(-0.9)));
            zz = 0 + (((tickAnim - 221) / 12) * (0-(0)));
        }
        else if (tickAnim >= 233 && tickAnim < 245) {
            xx = 0 + (((tickAnim - 233) / 12) * (0-(0)));
            yy = 0.725 + (((tickAnim - 233) / 12) * (0-(0.725)));
            zz = 0 + (((tickAnim - 233) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightHand.rotationPointX = this.rightHand.rotationPointX + (float)(xx);
        this.rightHand.rotationPointY = this.rightHand.rotationPointY - (float)(yy);
        this.rightHand.rotationPointZ = this.rightHand.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 80) {
            xx = 0 + (((tickAnim - 0) / 80) * (4.5-(0)));
            yy = 0 + (((tickAnim - 0) / 80) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 80) * (0-(0)));
        }
        else if (tickAnim >= 80 && tickAnim < 221) {
            xx = 4.5 + (((tickAnim - 80) / 141) * (4.5-(4.5)));
            yy = 0 + (((tickAnim - 80) / 141) * (0-(0)));
            zz = 0 + (((tickAnim - 80) / 141) * (0-(0)));
        }
        else if (tickAnim >= 221 && tickAnim < 245) {
            xx = 4.5 + (((tickAnim - 221) / 24) * (0-(4.5)));
            yy = 0 + (((tickAnim - 221) / 24) * (0-(0)));
            zz = 0 + (((tickAnim - 221) / 24) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm1, leftArm1.rotateAngleX + (float) Math.toRadians(xx), leftArm1.rotateAngleY + (float) Math.toRadians(yy), leftArm1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 80) {
            xx = 0 + (((tickAnim - 0) / 80) * (3-(0)));
            yy = 0 + (((tickAnim - 0) / 80) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 80) * (0-(0)));
        }
        else if (tickAnim >= 80 && tickAnim < 221) {
            xx = 3 + (((tickAnim - 80) / 141) * (3-(3)));
            yy = 0 + (((tickAnim - 80) / 141) * (0-(0)));
            zz = 0 + (((tickAnim - 80) / 141) * (0-(0)));
        }
        else if (tickAnim >= 221 && tickAnim < 245) {
            xx = 3 + (((tickAnim - 221) / 24) * (0-(3)));
            yy = 0 + (((tickAnim - 221) / 24) * (0-(0)));
            zz = 0 + (((tickAnim - 221) / 24) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm2, leftArm2.rotateAngleX + (float) Math.toRadians(xx), leftArm2.rotateAngleY + (float) Math.toRadians(yy), leftArm2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 80) {
            xx = 0 + (((tickAnim - 0) / 80) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 80) * (-0.75-(0)));
            zz = 0 + (((tickAnim - 0) / 80) * (0-(0)));
        }
        else if (tickAnim >= 80 && tickAnim < 221) {
            xx = 0 + (((tickAnim - 80) / 141) * (0-(0)));
            yy = -0.75 + (((tickAnim - 80) / 141) * (-0.75-(-0.75)));
            zz = 0 + (((tickAnim - 80) / 141) * (0-(0)));
        }
        else if (tickAnim >= 221 && tickAnim < 245) {
            xx = 0 + (((tickAnim - 221) / 24) * (0-(0)));
            yy = -0.75 + (((tickAnim - 221) / 24) * (0-(-0.75)));
            zz = 0 + (((tickAnim - 221) / 24) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftArm2.rotationPointX = this.leftArm2.rotationPointX + (float)(xx);
        this.leftArm2.rotationPointY = this.leftArm2.rotationPointY - (float)(yy);
        this.leftArm2.rotationPointZ = this.leftArm2.rotationPointZ + (float)(zz);



        this.setRotateAngle(leftHand, leftHand.rotateAngleX + (float) Math.toRadians(0), leftHand.rotateAngleY + (float) Math.toRadians(0), leftHand.rotateAngleZ + (float) Math.toRadians(0));

        if (tickAnim >= 0 && tickAnim < 80) {
            xx = 0 + (((tickAnim - 0) / 80) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 80) * (-1.025-(0)));
            zz = 0 + (((tickAnim - 0) / 80) * (0-(0)));
        }
        else if (tickAnim >= 80 && tickAnim < 221) {
            xx = 0 + (((tickAnim - 80) / 141) * (0-(0)));
            yy = -1.025 + (((tickAnim - 80) / 141) * (-1.025-(-1.025)));
            zz = 0 + (((tickAnim - 80) / 141) * (0-(0)));
        }
        else if (tickAnim >= 221 && tickAnim < 245) {
            xx = 0 + (((tickAnim - 221) / 24) * (0-(0)));
            yy = -1.025 + (((tickAnim - 221) / 24) * (0-(-1.025)));
            zz = 0 + (((tickAnim - 221) / 24) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftHand.rotationPointX = this.leftHand.rotationPointX + (float)(xx);
        this.leftHand.rotationPointY = this.leftHand.rotationPointY - (float)(yy);
        this.leftHand.rotationPointZ = this.leftHand.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 59) {
            xx = 0 + (((tickAnim - 0) / 59) * (-4.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120+50))*2-(0)));
            yy = 0 + (((tickAnim - 0) / 59) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 59) * (0-(0)));
        }
        else if (tickAnim >= 59 && tickAnim < 80) {
            xx = -4.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120+50))*2 + (((tickAnim - 59) / 21) * (0.25-(-4.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120+50))*2)));
            yy = 0 + (((tickAnim - 59) / 21) * (0-(0)));
            zz = 0 + (((tickAnim - 59) / 21) * (0-(0)));
        }
        else if (tickAnim >= 80 && tickAnim < 100) {
            xx = 0.25 + (((tickAnim - 80) / 20) * (-2.25-(0.25)));
            yy = 0 + (((tickAnim - 80) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 80) / 20) * (0-(0)));
        }
        else if (tickAnim >= 100 && tickAnim < 140) {
            xx = -2.25 + (((tickAnim - 100) / 40) * (-4.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120+100))*-5-(-2.25)));
            yy = 0 + (((tickAnim - 100) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 100) / 40) * (0-(0)));
        }
        else if (tickAnim >= 140 && tickAnim < 161) {
            xx = -4.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120+100))*-5 + (((tickAnim - 140) / 21) * (0.25-(-4.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120+100))*-5)));
            yy = 0 + (((tickAnim - 140) / 21) * (0-(0)));
            zz = 0 + (((tickAnim - 140) / 21) * (0-(0)));
        }
        else if (tickAnim >= 161 && tickAnim < 181) {
            xx = 0.25 + (((tickAnim - 161) / 20) * (-2.25-(0.25)));
            yy = 0 + (((tickAnim - 161) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 161) / 20) * (0-(0)));
        }
        else if (tickAnim >= 181 && tickAnim < 221) {
            xx = -2.25 + (((tickAnim - 181) / 40) * (-4.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120+120))*5-(-2.25)));
            yy = 0 + (((tickAnim - 181) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 181) / 40) * (0-(0)));
        }
        else if (tickAnim >= 221 && tickAnim < 245) {
            xx = -4.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120+120))*5 + (((tickAnim - 221) / 24) * (0-(-4.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120+120))*5)));
            yy = 0 + (((tickAnim - 221) / 24) * (0-(0)));
            zz = 0 + (((tickAnim - 221) / 24) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck1, neck1.rotateAngleX + (float) Math.toRadians(xx), neck1.rotateAngleY + (float) Math.toRadians(yy), neck1.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 140 && tickAnim < 221) {
            xx = 0 + (((tickAnim - 140) / 81) * (0-(0)));
            yy = 0 + (((tickAnim - 140) / 81) * (0-(0)));
            zz = 0 + (((tickAnim - 140) / 81) * (0-(0)));
        }
        else if (tickAnim >= 221 && tickAnim < 245) {
            xx = 0 + (((tickAnim - 221) / 24) * (0-(0)));
            yy = 0 + (((tickAnim - 221) / 24) * (0-(0)));
            zz = 0 + (((tickAnim - 221) / 24) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.neck1.rotationPointX = this.neck1.rotationPointX + (float)(xx);
        this.neck1.rotationPointY = this.neck1.rotationPointY - (float)(yy);
        this.neck1.rotationPointZ = this.neck1.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 59) {
            xx = 0 + (((tickAnim - 0) / 59) * (-2.75-(0)));
            yy = 0 + (((tickAnim - 0) / 59) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 59) * (0-(0)));
        }
        else if (tickAnim >= 59 && tickAnim < 80) {
            xx = -2.75 + (((tickAnim - 59) / 21) * (3.25-(-2.75)));
            yy = 0 + (((tickAnim - 59) / 21) * (0-(0)));
            zz = 0 + (((tickAnim - 59) / 21) * (0-(0)));
        }
        else if (tickAnim >= 80 && tickAnim < 100) {
            xx = 3.25 + (((tickAnim - 80) / 20) * (4.5-(3.25)));
            yy = 0 + (((tickAnim - 80) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 80) / 20) * (0-(0)));
        }
        else if (tickAnim >= 100 && tickAnim < 140) {
            xx = 4.5 + (((tickAnim - 100) / 40) * (-2.75-(4.5)));
            yy = 0 + (((tickAnim - 100) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 100) / 40) * (0-(0)));
        }
        else if (tickAnim >= 140 && tickAnim < 161) {
            xx = -2.75 + (((tickAnim - 140) / 21) * (3.25-(-2.75)));
            yy = 0 + (((tickAnim - 140) / 21) * (0-(0)));
            zz = 0 + (((tickAnim - 140) / 21) * (0-(0)));
        }
        else if (tickAnim >= 161 && tickAnim < 181) {
            xx = 3.25 + (((tickAnim - 161) / 20) * (4.5-(3.25)));
            yy = 0 + (((tickAnim - 161) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 161) / 20) * (0-(0)));
        }
        else if (tickAnim >= 181 && tickAnim < 221) {
            xx = 4.5 + (((tickAnim - 181) / 40) * (-2.75-(4.5)));
            yy = 0 + (((tickAnim - 181) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 181) / 40) * (0-(0)));
        }
        else if (tickAnim >= 221 && tickAnim < 245) {
            xx = -2.75 + (((tickAnim - 221) / 24) * (0-(-2.75)));
            yy = 0 + (((tickAnim - 221) / 24) * (0-(0)));
            zz = 0 + (((tickAnim - 221) / 24) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(xx), neck2.rotateAngleY + (float) Math.toRadians(yy), neck2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 80) {
            xx = 0 + (((tickAnim - 0) / 80) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 80) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 80) * (-1.75-(0)));
        }
        else if (tickAnim >= 80 && tickAnim < 140) {
            xx = 0 + (((tickAnim - 80) / 60) * (0-(0)));
            yy = 0 + (((tickAnim - 80) / 60) * (0-(0)));
            zz = -1.75 + (((tickAnim - 80) / 60) * (-1.225-(-1.75)));
        }
        else if (tickAnim >= 140 && tickAnim < 161) {
            xx = 0 + (((tickAnim - 140) / 21) * (0-(0)));
            yy = 0 + (((tickAnim - 140) / 21) * (0-(0)));
            zz = -1.225 + (((tickAnim - 140) / 21) * (-1.75-(-1.225)));
        }
        else if (tickAnim >= 161 && tickAnim < 221) {
            xx = 0 + (((tickAnim - 161) / 60) * (0-(0)));
            yy = 0 + (((tickAnim - 161) / 60) * (0-(0)));
            zz = -1.75 + (((tickAnim - 161) / 60) * (-1.225-(-1.75)));
        }
        else if (tickAnim >= 221 && tickAnim < 245) {
            xx = 0 + (((tickAnim - 221) / 24) * (0-(0)));
            yy = 0 + (((tickAnim - 221) / 24) * (0-(0)));
            zz = -1.225 + (((tickAnim - 221) / 24) * (0-(-1.225)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.neck2.rotationPointX = this.neck2.rotationPointX + (float)(xx);
        this.neck2.rotationPointY = this.neck2.rotationPointY - (float)(yy);
        this.neck2.rotationPointZ = this.neck2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 59) {
            xx = 0 + (((tickAnim - 0) / 59) * (1.25-(0)));
            yy = 0 + (((tickAnim - 0) / 59) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 59) * (0-(0)));
        }
        else if (tickAnim >= 59 && tickAnim < 80) {
            xx = 1.25 + (((tickAnim - 59) / 21) * (7.25-(1.25)));
            yy = 0 + (((tickAnim - 59) / 21) * (0-(0)));
            zz = 0 + (((tickAnim - 59) / 21) * (0-(0)));
        }
        else if (tickAnim >= 80 && tickAnim < 100) {
            xx = 7.25 + (((tickAnim - 80) / 20) * (7.97393-(7.25)));
            yy = 0 + (((tickAnim - 80) / 20) * (-0.19717-(0)));
            zz = 0 + (((tickAnim - 80) / 20) * (-0.23035-(0)));
        }
        else if (tickAnim >= 100 && tickAnim < 140) {
            xx = 7.97393 + (((tickAnim - 100) / 40) * (1.25-(7.97393)));
            yy = -0.19717 + (((tickAnim - 100) / 40) * (0-(-0.19717)));
            zz = -0.23035 + (((tickAnim - 100) / 40) * (0-(-0.23035)));
        }
        else if (tickAnim >= 140 && tickAnim < 161) {
            xx = 1.25 + (((tickAnim - 140) / 21) * (7.25-(1.25)));
            yy = 0 + (((tickAnim - 140) / 21) * (0-(0)));
            zz = 0 + (((tickAnim - 140) / 21) * (0-(0)));
        }
        else if (tickAnim >= 161 && tickAnim < 181) {
            xx = 7.25 + (((tickAnim - 161) / 20) * (7.97393-(7.25)));
            yy = 0 + (((tickAnim - 161) / 20) * (-0.19717-(0)));
            zz = 0 + (((tickAnim - 161) / 20) * (-0.23035-(0)));
        }
        else if (tickAnim >= 181 && tickAnim < 221) {
            xx = 7.97393 + (((tickAnim - 181) / 40) * (1.25-(7.97393)));
            yy = -0.19717 + (((tickAnim - 181) / 40) * (0-(-0.19717)));
            zz = -0.23035 + (((tickAnim - 181) / 40) * (0-(-0.23035)));
        }
        else if (tickAnim >= 221 && tickAnim < 245) {
            xx = 1.25 + (((tickAnim - 221) / 24) * (0-(1.25)));
            yy = 0 + (((tickAnim - 221) / 24) * (0-(0)));
            zz = 0 + (((tickAnim - 221) / 24) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(xx), neck3.rotateAngleY + (float) Math.toRadians(yy), neck3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 80) {
            xx = 0 + (((tickAnim - 0) / 80) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 80) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 80) * (-1.85-(0)));
        }
        else if (tickAnim >= 80 && tickAnim < 140) {
            xx = 0 + (((tickAnim - 80) / 60) * (0-(0)));
            yy = 0 + (((tickAnim - 80) / 60) * (0-(0)));
            zz = -1.85 + (((tickAnim - 80) / 60) * (0-(-1.85)));
        }
        else if (tickAnim >= 140 && tickAnim < 161) {
            xx = 0 + (((tickAnim - 140) / 21) * (0-(0)));
            yy = 0 + (((tickAnim - 140) / 21) * (0-(0)));
            zz = 0 + (((tickAnim - 140) / 21) * (-1.85-(0)));
        }
        else if (tickAnim >= 161 && tickAnim < 221) {
            xx = 0 + (((tickAnim - 161) / 60) * (0-(0)));
            yy = 0 + (((tickAnim - 161) / 60) * (0-(0)));
            zz = -1.85 + (((tickAnim - 161) / 60) * (0-(-1.85)));
        }
        else if (tickAnim >= 221 && tickAnim < 245) {
            xx = 0 + (((tickAnim - 221) / 24) * (0-(0)));
            yy = 0 + (((tickAnim - 221) / 24) * (0-(0)));
            zz = 0 + (((tickAnim - 221) / 24) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.neck3.rotationPointX = this.neck3.rotationPointX + (float)(xx);
        this.neck3.rotationPointY = this.neck3.rotationPointY - (float)(yy);
        this.neck3.rotationPointZ = this.neck3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 59) {
            xx = 0 + (((tickAnim - 0) / 59) * (-5.75-(0)));
            yy = 0 + (((tickAnim - 0) / 59) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 59) * (0-(0)));
        }
        else if (tickAnim >= 59 && tickAnim < 80) {
            xx = -5.75 + (((tickAnim - 59) / 21) * (-4.25-(-5.75)));
            yy = 0 + (((tickAnim - 59) / 21) * (0-(0)));
            zz = 0 + (((tickAnim - 59) / 21) * (0-(0)));
        }
        else if (tickAnim >= 80 && tickAnim < 100) {
            xx = -4.25 + (((tickAnim - 80) / 20) * (-2.75-(-4.25)));
            yy = 0 + (((tickAnim - 80) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 80) / 20) * (0-(0)));
        }
        else if (tickAnim >= 100 && tickAnim < 140) {
            xx = -2.75 + (((tickAnim - 100) / 40) * (-5.75-(-2.75)));
            yy = 0 + (((tickAnim - 100) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 100) / 40) * (0-(0)));
        }
        else if (tickAnim >= 140 && tickAnim < 161) {
            xx = -5.75 + (((tickAnim - 140) / 21) * (-4.25-(-5.75)));
            yy = 0 + (((tickAnim - 140) / 21) * (0-(0)));
            zz = 0 + (((tickAnim - 140) / 21) * (0-(0)));
        }
        else if (tickAnim >= 161 && tickAnim < 181) {
            xx = -4.25 + (((tickAnim - 161) / 20) * (-2.75-(-4.25)));
            yy = 0 + (((tickAnim - 161) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 161) / 20) * (0-(0)));
        }
        else if (tickAnim >= 181 && tickAnim < 221) {
            xx = -2.75 + (((tickAnim - 181) / 40) * (-5.75-(-2.75)));
            yy = 0 + (((tickAnim - 181) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 181) / 40) * (0-(0)));
        }
        else if (tickAnim >= 221 && tickAnim < 245) {
            xx = -5.75 + (((tickAnim - 221) / 24) * (0-(-5.75)));
            yy = 0 + (((tickAnim - 221) / 24) * (0-(0)));
            zz = 0 + (((tickAnim - 221) / 24) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck4, neck4.rotateAngleX + (float) Math.toRadians(xx), neck4.rotateAngleY + (float) Math.toRadians(yy), neck4.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 80) {
            xx = 0 + (((tickAnim - 0) / 80) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 80) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 80) * (-0.9-(0)));
        }
        else if (tickAnim >= 80 && tickAnim < 140) {
            xx = 0 + (((tickAnim - 80) / 60) * (0-(0)));
            yy = 0 + (((tickAnim - 80) / 60) * (0-(0)));
            zz = -0.9 + (((tickAnim - 80) / 60) * (-0.9-(-0.9)));
        }
        else if (tickAnim >= 140 && tickAnim < 161) {
            xx = 0 + (((tickAnim - 140) / 21) * (0-(0)));
            yy = 0 + (((tickAnim - 140) / 21) * (0-(0)));
            zz = -0.9 + (((tickAnim - 140) / 21) * (-0.9-(-0.9)));
        }
        else if (tickAnim >= 161 && tickAnim < 221) {
            xx = 0 + (((tickAnim - 161) / 60) * (0-(0)));
            yy = 0 + (((tickAnim - 161) / 60) * (0-(0)));
            zz = -0.9 + (((tickAnim - 161) / 60) * (-0.9-(-0.9)));
        }
        else if (tickAnim >= 221 && tickAnim < 245) {
            xx = 0 + (((tickAnim - 221) / 24) * (0-(0)));
            yy = 0 + (((tickAnim - 221) / 24) * (0-(0)));
            zz = -0.9 + (((tickAnim - 221) / 24) * (0-(-0.9)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.neck4.rotationPointX = this.neck4.rotationPointX + (float)(xx);
        this.neck4.rotationPointY = this.neck4.rotationPointY - (float)(yy);
        this.neck4.rotationPointZ = this.neck4.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 59) {
            xx = 0 + (((tickAnim - 0) / 59) * (12-(0)));
            yy = 0 + (((tickAnim - 0) / 59) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 59) * (0-(0)));
        }
        else if (tickAnim >= 59 && tickAnim < 80) {
            xx = 12 + (((tickAnim - 59) / 21) * (-4.25-(12)));
            yy = 0 + (((tickAnim - 59) / 21) * (0-(0)));
            zz = 0 + (((tickAnim - 59) / 21) * (0-(0)));
        }
        else if (tickAnim >= 80 && tickAnim < 100) {
            xx = -4.25 + (((tickAnim - 80) / 20) * (-0.25-(-4.25)));
            yy = 0 + (((tickAnim - 80) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 80) / 20) * (0-(0)));
        }
        else if (tickAnim >= 100 && tickAnim < 113) {
            xx = -0.25 + (((tickAnim - 100) / 13) * (6.83-(-0.25)));
            yy = 0 + (((tickAnim - 100) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 100) / 13) * (0-(0)));
        }
        else if (tickAnim >= 113 && tickAnim < 140) {
            xx = 6.83 + (((tickAnim - 113) / 27) * (12-(6.83)));
            yy = 0 + (((tickAnim - 113) / 27) * (0-(0)));
            zz = 0 + (((tickAnim - 113) / 27) * (0-(0)));
        }
        else if (tickAnim >= 140 && tickAnim < 161) {
            xx = 12 + (((tickAnim - 140) / 21) * (-4.25-(12)));
            yy = 0 + (((tickAnim - 140) / 21) * (0-(0)));
            zz = 0 + (((tickAnim - 140) / 21) * (0-(0)));
        }
        else if (tickAnim >= 161 && tickAnim < 181) {
            xx = -4.25 + (((tickAnim - 161) / 20) * (-0.25-(-4.25)));
            yy = 0 + (((tickAnim - 161) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 161) / 20) * (0-(0)));
        }
        else if (tickAnim >= 181 && tickAnim < 194) {
            xx = -0.25 + (((tickAnim - 181) / 13) * (6.83-(-0.25)));
            yy = 0 + (((tickAnim - 181) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 181) / 13) * (0-(0)));
        }
        else if (tickAnim >= 194 && tickAnim < 221) {
            xx = 6.83 + (((tickAnim - 194) / 27) * (12-(6.83)));
            yy = 0 + (((tickAnim - 194) / 27) * (0-(0)));
            zz = 0 + (((tickAnim - 194) / 27) * (0-(0)));
        }
        else if (tickAnim >= 221 && tickAnim < 245) {
            xx = 12 + (((tickAnim - 221) / 24) * (0-(12)));
            yy = 0 + (((tickAnim - 221) / 24) * (0-(0)));
            zz = 0 + (((tickAnim - 221) / 24) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck5, neck5.rotateAngleX + (float) Math.toRadians(xx), neck5.rotateAngleY + (float) Math.toRadians(yy), neck5.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 59) {
            xx = 0 + (((tickAnim - 0) / 59) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 59) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 59) * (-0.085-(0)));
        }
        else if (tickAnim >= 59 && tickAnim < 80) {
            xx = 0 + (((tickAnim - 59) / 21) * (0-(0)));
            yy = 0 + (((tickAnim - 59) / 21) * (0-(0)));
            zz = -0.085 + (((tickAnim - 59) / 21) * (-1.1-(-0.085)));
        }
        else if (tickAnim >= 80 && tickAnim < 100) {
            xx = 0 + (((tickAnim - 80) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 80) / 20) * (0-(0)));
            zz = -1.1 + (((tickAnim - 80) / 20) * (-0.4-(-1.1)));
        }
        else if (tickAnim >= 100 && tickAnim < 140) {
            xx = 0 + (((tickAnim - 100) / 40) * (0-(0)));
            yy = 0 + (((tickAnim - 100) / 40) * (0-(0)));
            zz = -0.4 + (((tickAnim - 100) / 40) * (-0.085-(-0.4)));
        }
        else if (tickAnim >= 140 && tickAnim < 161) {
            xx = 0 + (((tickAnim - 140) / 21) * (0-(0)));
            yy = 0 + (((tickAnim - 140) / 21) * (0-(0)));
            zz = -0.085 + (((tickAnim - 140) / 21) * (-1.1-(-0.085)));
        }
        else if (tickAnim >= 161 && tickAnim < 181) {
            xx = 0 + (((tickAnim - 161) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 161) / 20) * (0-(0)));
            zz = -1.1 + (((tickAnim - 161) / 20) * (-0.4-(-1.1)));
        }
        else if (tickAnim >= 181 && tickAnim < 221) {
            xx = 0 + (((tickAnim - 181) / 40) * (0-(0)));
            yy = 0 + (((tickAnim - 181) / 40) * (0-(0)));
            zz = -0.4 + (((tickAnim - 181) / 40) * (-0.085-(-0.4)));
        }
        else if (tickAnim >= 221 && tickAnim < 245) {
            xx = 0 + (((tickAnim - 221) / 24) * (0-(0)));
            yy = 0 + (((tickAnim - 221) / 24) * (0-(0)));
            zz = -0.085 + (((tickAnim - 221) / 24) * (0-(-0.085)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.neck5.rotationPointX = this.neck5.rotationPointX + (float)(xx);
        this.neck5.rotationPointY = this.neck5.rotationPointY - (float)(yy);
        this.neck5.rotationPointZ = this.neck5.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 59) {
            xx = 0 + (((tickAnim - 0) / 59) * (-2.75-(0)));
            yy = 0 + (((tickAnim - 0) / 59) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 59) * (0-(0)));
        }
        else if (tickAnim >= 59 && tickAnim < 80) {
            xx = -2.75 + (((tickAnim - 59) / 21) * (-12.5-(-2.75)));
            yy = 0 + (((tickAnim - 59) / 21) * (0-(0)));
            zz = 0 + (((tickAnim - 59) / 21) * (0-(0)));
        }
        else if (tickAnim >= 80 && tickAnim < 100) {
            xx = -12.5 + (((tickAnim - 80) / 20) * (-17.75-(-12.5)));
            yy = 0 + (((tickAnim - 80) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 80) / 20) * (0-(0)));
        }
        else if (tickAnim >= 100 && tickAnim < 113) {
            xx = -17.75 + (((tickAnim - 100) / 13) * (-11.9+Math.sin((Math.PI/180)*(((double)tickAnim/20)*100))*-15-(-17.75)));
            yy = 0 + (((tickAnim - 100) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 100) / 13) * (0-(0)));
        }
        else if (tickAnim >= 113 && tickAnim < 140) {
            xx = -11.9+Math.sin((Math.PI/180)*(((double)tickAnim/20)*100))*-15 + (((tickAnim - 113) / 27) * (-2.75-(-11.9+Math.sin((Math.PI/180)*(((double)tickAnim/20)*100))*-15)));
            yy = 0 + (((tickAnim - 113) / 27) * (0-(0)));
            zz = 0 + (((tickAnim - 113) / 27) * (0-(0)));
        }
        else if (tickAnim >= 140 && tickAnim < 161) {
            xx = -2.75 + (((tickAnim - 140) / 21) * (-12.5-(-2.75)));
            yy = 0 + (((tickAnim - 140) / 21) * (0-(0)));
            zz = 0 + (((tickAnim - 140) / 21) * (0-(0)));
        }
        else if (tickAnim >= 161 && tickAnim < 181) {
            xx = -12.5 + (((tickAnim - 161) / 20) * (-17.75-(-12.5)));
            yy = 0 + (((tickAnim - 161) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 161) / 20) * (0-(0)));
        }
        else if (tickAnim >= 181 && tickAnim < 194) {
            xx = -17.75 + (((tickAnim - 181) / 13) * (-11.9+Math.sin((Math.PI/180)*(((double)tickAnim/20)*100))*-15-(-17.75)));
            yy = 0 + (((tickAnim - 181) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 181) / 13) * (0-(0)));
        }
        else if (tickAnim >= 194 && tickAnim < 221) {
            xx = -11.9+Math.sin((Math.PI/180)*(((double)tickAnim/20)*100))*-15 + (((tickAnim - 194) / 27) * (-2.75-(-11.9+Math.sin((Math.PI/180)*(((double)tickAnim/20)*100))*-15)));
            yy = 0 + (((tickAnim - 194) / 27) * (0-(0)));
            zz = 0 + (((tickAnim - 194) / 27) * (0-(0)));
        }
        else if (tickAnim >= 221 && tickAnim < 245) {
            xx = -2.75 + (((tickAnim - 221) / 24) * (0-(-2.75)));
            yy = 0 + (((tickAnim - 221) / 24) * (0-(0)));
            zz = 0 + (((tickAnim - 221) / 24) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck6, neck6.rotateAngleX + (float) Math.toRadians(xx), neck6.rotateAngleY + (float) Math.toRadians(yy), neck6.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 59) {
            xx = 0 + (((tickAnim - 0) / 59) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 59) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 59) * (0.45-(0)));
        }
        else if (tickAnim >= 59 && tickAnim < 80) {
            xx = 0 + (((tickAnim - 59) / 21) * (0-(0)));
            yy = 0 + (((tickAnim - 59) / 21) * (0-(0)));
            zz = 0.45 + (((tickAnim - 59) / 21) * (0-(0.45)));
        }
        else if (tickAnim >= 80 && tickAnim < 140) {
            xx = 0 + (((tickAnim - 80) / 60) * (0-(0)));
            yy = 0 + (((tickAnim - 80) / 60) * (0-(0)));
            zz = 0 + (((tickAnim - 80) / 60) * (0.45-(0)));
        }
        else if (tickAnim >= 140 && tickAnim < 161) {
            xx = 0 + (((tickAnim - 140) / 21) * (0-(0)));
            yy = 0 + (((tickAnim - 140) / 21) * (0-(0)));
            zz = 0.45 + (((tickAnim - 140) / 21) * (0-(0.45)));
        }
        else if (tickAnim >= 161 && tickAnim < 221) {
            xx = 0 + (((tickAnim - 161) / 60) * (0-(0)));
            yy = 0 + (((tickAnim - 161) / 60) * (0-(0)));
            zz = 0 + (((tickAnim - 161) / 60) * (0.45-(0)));
        }
        else if (tickAnim >= 221 && tickAnim < 245) {
            xx = 0 + (((tickAnim - 221) / 24) * (0-(0)));
            yy = 0 + (((tickAnim - 221) / 24) * (0-(0)));
            zz = 0.45 + (((tickAnim - 221) / 24) * (0-(0.45)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.neck6.rotationPointX = this.neck6.rotationPointX + (float)(xx);
        this.neck6.rotationPointY = this.neck6.rotationPointY - (float)(yy);
        this.neck6.rotationPointZ = this.neck6.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 80) {
            xx = 0 + (((tickAnim - 0) / 80) * (-5.5-(0)));
            yy = 0 + (((tickAnim - 0) / 80) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 80) * (0-(0)));
        }
        else if (tickAnim >= 80 && tickAnim < 161) {
            xx = -5.5 + (((tickAnim - 80) / 81) * (-5.5-(-5.5)));
            yy = 0 + (((tickAnim - 80) / 81) * (0-(0)));
            zz = 0 + (((tickAnim - 80) / 81) * (0-(0)));
        }
        else if (tickAnim >= 161 && tickAnim < 245) {
            xx = -5.5 + (((tickAnim - 161) / 84) * (0-(-5.5)));
            yy = 0 + (((tickAnim - 161) / 84) * (0-(0)));
            zz = 0 + (((tickAnim - 161) / 84) * (0-(0)));
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
            zz = 0 + (((tickAnim - 0) / 80) * (0.25-(0)));
        }
        else if (tickAnim >= 80 && tickAnim < 161) {
            xx = 0 + (((tickAnim - 80) / 81) * (0-(0)));
            yy = 0 + (((tickAnim - 80) / 81) * (0-(0)));
            zz = 0.25 + (((tickAnim - 80) / 81) * (0.25-(0.25)));
        }
        else if (tickAnim >= 161 && tickAnim < 245) {
            xx = 0 + (((tickAnim - 161) / 84) * (0-(0)));
            yy = 0 + (((tickAnim - 161) / 84) * (0-(0)));
            zz = 0.25 + (((tickAnim - 161) / 84) * (0-(0.25)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.head.rotationPointX = this.head.rotationPointX + (float)(xx);
        this.head.rotationPointY = this.head.rotationPointY - (float)(yy);
        this.head.rotationPointZ = this.head.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 80) {
            xx = 0 + (((tickAnim - 0) / 80) * (-0.25-(0)));
            yy = 0 + (((tickAnim - 0) / 80) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 80) * (0-(0)));
        }
        else if (tickAnim >= 80 && tickAnim < 221) {
            xx = -0.25 + (((tickAnim - 80) / 141) * (-0.25-(-0.25)));
            yy = 0 + (((tickAnim - 80) / 141) * (0-(0)));
            zz = 0 + (((tickAnim - 80) / 141) * (0-(0)));
        }
        else if (tickAnim >= 221 && tickAnim < 245) {
            xx = -0.25 + (((tickAnim - 221) / 24) * (0-(-0.25)));
            yy = 0 + (((tickAnim - 221) / 24) * (0-(0)));
            zz = 0 + (((tickAnim - 221) / 24) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg1, leftLeg1.rotateAngleX + (float) Math.toRadians(xx), leftLeg1.rotateAngleY + (float) Math.toRadians(yy), leftLeg1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 80) {
            xx = 0 + (((tickAnim - 0) / 80) * (6.5-(0)));
            yy = 0 + (((tickAnim - 0) / 80) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 80) * (0-(0)));
        }
        else if (tickAnim >= 80 && tickAnim < 221) {
            xx = 6.5 + (((tickAnim - 80) / 141) * (6.5-(6.5)));
            yy = 0 + (((tickAnim - 80) / 141) * (0-(0)));
            zz = 0 + (((tickAnim - 80) / 141) * (0-(0)));
        }
        else if (tickAnim >= 221 && tickAnim < 245) {
            xx = 6.5 + (((tickAnim - 221) / 24) * (0-(6.5)));
            yy = 0 + (((tickAnim - 221) / 24) * (0-(0)));
            zz = 0 + (((tickAnim - 221) / 24) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg2, leftLeg2.rotateAngleX + (float) Math.toRadians(xx), leftLeg2.rotateAngleY + (float) Math.toRadians(yy), leftLeg2.rotateAngleZ + (float) Math.toRadians(zz));



        this.setRotateAngle(leftFoot, leftFoot.rotateAngleX + (float) Math.toRadians(0), leftFoot.rotateAngleY + (float) Math.toRadians(0), leftFoot.rotateAngleZ + (float) Math.toRadians(0));



        if (tickAnim >= 0 && tickAnim < 80) {
            xx = 0 + (((tickAnim - 0) / 80) * (-0.25-(0)));
            yy = 0 + (((tickAnim - 0) / 80) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 80) * (0-(0)));
        }
        else if (tickAnim >= 80 && tickAnim < 221) {
            xx = -0.25 + (((tickAnim - 80) / 141) * (-0.25-(-0.25)));
            yy = 0 + (((tickAnim - 80) / 141) * (0-(0)));
            zz = 0 + (((tickAnim - 80) / 141) * (0-(0)));
        }
        else if (tickAnim >= 221 && tickAnim < 245) {
            xx = -0.25 + (((tickAnim - 221) / 24) * (0-(-0.25)));
            yy = 0 + (((tickAnim - 221) / 24) * (0-(0)));
            zz = 0 + (((tickAnim - 221) / 24) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg1, rightLeg1.rotateAngleX + (float) Math.toRadians(xx), rightLeg1.rotateAngleY + (float) Math.toRadians(yy), rightLeg1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 80) {
            xx = 0 + (((tickAnim - 0) / 80) * (6.5-(0)));
            yy = 0 + (((tickAnim - 0) / 80) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 80) * (0-(0)));
        }
        else if (tickAnim >= 80 && tickAnim < 221) {
            xx = 6.5 + (((tickAnim - 80) / 141) * (6.5-(6.5)));
            yy = 0 + (((tickAnim - 80) / 141) * (0-(0)));
            zz = 0 + (((tickAnim - 80) / 141) * (0-(0)));
        }
        else if (tickAnim >= 221 && tickAnim < 245) {
            xx = 6.5 + (((tickAnim - 221) / 24) * (0-(6.5)));
            yy = 0 + (((tickAnim - 221) / 24) * (0-(0)));
            zz = 0 + (((tickAnim - 221) / 24) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg2, rightLeg2.rotateAngleX + (float) Math.toRadians(xx), rightLeg2.rotateAngleY + (float) Math.toRadians(yy), rightLeg2.rotateAngleZ + (float) Math.toRadians(zz));



        this.setRotateAngle(rightFoot, rightFoot.rotateAngleX + (float) Math.toRadians(0), rightFoot.rotateAngleY + (float) Math.toRadians(0), rightFoot.rotateAngleZ + (float) Math.toRadians(0));



        if (tickAnim >= 59 && tickAnim < 74) {
            xx = 0 + (((tickAnim - 59) / 15) * (21.75-(0)));
            yy = 0 + (((tickAnim - 59) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 59) / 15) * (0-(0)));
        }
        else if (tickAnim >= 74 && tickAnim < 80) {
            xx = 21.75 + (((tickAnim - 74) / 6) * (0-(21.75)));
            yy = 0 + (((tickAnim - 74) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 74) / 6) * (0-(0)));
        }
        else if (tickAnim >= 80 && tickAnim < 140) {
            xx = 0 + (((tickAnim - 80) / 60) * (0-(0)));
            yy = 0 + (((tickAnim - 80) / 60) * (0-(0)));
            zz = 0 + (((tickAnim - 80) / 60) * (0-(0)));
        }
        else if (tickAnim >= 140 && tickAnim < 155) {
            xx = 0 + (((tickAnim - 140) / 15) * (21.75-(0)));
            yy = 0 + (((tickAnim - 140) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 140) / 15) * (0-(0)));
        }
        else if (tickAnim >= 155 && tickAnim < 161) {
            xx = 21.75 + (((tickAnim - 155) / 6) * (0-(21.75)));
            yy = 0 + (((tickAnim - 155) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 155) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaws, jaws.rotateAngleX + (float) Math.toRadians(xx), jaws.rotateAngleY + (float) Math.toRadians(yy), jaws.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 59) {
            xx = 0 + (((tickAnim - 0) / 59) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 59) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 59) * (0-(0)));
        }
        else if (tickAnim >= 59 && tickAnim < 74) {
            xx = 0 + (((tickAnim - 59) / 15) * (-12.5-(0)));
            yy = 0 + (((tickAnim - 59) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 59) / 15) * (0-(0)));
        }
        else if (tickAnim >= 74 && tickAnim < 80) {
            xx = -12.5 + (((tickAnim - 74) / 6) * (0-(-12.5)));
            yy = 0 + (((tickAnim - 74) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 74) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(throat, throat.rotateAngleX + (float) Math.toRadians(xx), throat.rotateAngleY + (float) Math.toRadians(yy), throat.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 59) {
            xx = 0 + (((tickAnim - 0) / 59) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 59) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 59) * (0-(0)));
        }
        else if (tickAnim >= 59 && tickAnim < 74) {
            xx = 0 + (((tickAnim - 59) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 59) / 15) * (-0.975-(0)));
            zz = 0 + (((tickAnim - 59) / 15) * (0-(0)));
        }
        else if (tickAnim >= 74 && tickAnim < 80) {
            xx = 0 + (((tickAnim - 74) / 6) * (0-(0)));
            yy = -0.975 + (((tickAnim - 74) / 6) * (0-(-0.975)));
            zz = 0 + (((tickAnim - 74) / 6) * (0-(0)));
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
    public void animNest(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraFukuititan entity = (EntityPrehistoricFloraFukuititan) entitylivingbaseIn;
        int animCycle = 50;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (24.75-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 37) {
            xx = 24.75 + (((tickAnim - 20) / 17) * (-8.5-(24.75)));
            yy = 0 + (((tickAnim - 20) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 17) * (0-(0)));
        }
        else if (tickAnim >= 37 && tickAnim < 50) {
            xx = -8.5 + (((tickAnim - 37) / 13) * (0-(-8.5)));
            yy = 0 + (((tickAnim - 37) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 37) / 13) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg1, leftLeg1.rotateAngleX + (float) Math.toRadians(xx), leftLeg1.rotateAngleY + (float) Math.toRadians(yy), leftLeg1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (16.5-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 29) {
            xx = 16.5 + (((tickAnim - 20) / 9) * (-5.82-(16.5)));
            yy = 0 + (((tickAnim - 20) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 9) * (0-(0)));
        }
        else if (tickAnim >= 29 && tickAnim < 37) {
            xx = -5.82 + (((tickAnim - 29) / 8) * (0-(-5.82)));
            yy = 0 + (((tickAnim - 29) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 29) / 8) * (0-(0)));
        }
        else if (tickAnim >= 37 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 37) / 13) * (0-(0)));
            yy = 0 + (((tickAnim - 37) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 37) / 13) * (0-(0)));
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
        else if (tickAnim >= 20 && tickAnim < 29) {
            xx = 0 + (((tickAnim - 20) / 9) * (0-(0)));
            yy = 0 + (((tickAnim - 20) / 9) * (2.515-(0)));
            zz = 0 + (((tickAnim - 20) / 9) * (0-(0)));
        }
        else if (tickAnim >= 29 && tickAnim < 37) {
            xx = 0 + (((tickAnim - 29) / 8) * (0-(0)));
            yy = 2.515 + (((tickAnim - 29) / 8) * (-0.925-(2.515)));
            zz = 0 + (((tickAnim - 29) / 8) * (0-(0)));
        }
        else if (tickAnim >= 37 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 37) / 13) * (0-(0)));
            yy = -0.925 + (((tickAnim - 37) / 13) * (0-(-0.925)));
            zz = 0 + (((tickAnim - 37) / 13) * (0-(0)));
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
            xx = 0 + (((tickAnim - 0) / 20) * (15-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 29) {
            xx = 15 + (((tickAnim - 20) / 9) * (31.56-(15)));
            yy = 0 + (((tickAnim - 20) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 9) * (0-(0)));
        }
        else if (tickAnim >= 29 && tickAnim < 37) {
            xx = 31.56 + (((tickAnim - 29) / 8) * (8.75-(31.56)));
            yy = 0 + (((tickAnim - 29) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 29) / 8) * (0-(0)));
        }
        else if (tickAnim >= 37 && tickAnim < 50) {
            xx = 8.75 + (((tickAnim - 37) / 13) * (0-(8.75)));
            yy = 0 + (((tickAnim - 37) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 37) / 13) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftFoot, leftFoot.rotateAngleX + (float) Math.toRadians(xx), leftFoot.rotateAngleY + (float) Math.toRadians(yy), leftFoot.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 29) {
            xx = 0 + (((tickAnim - 20) / 9) * (0-(0)));
            yy = 0 + (((tickAnim - 20) / 9) * (0.55-(0)));
            zz = 0 + (((tickAnim - 20) / 9) * (-0.55-(0)));
        }
        else if (tickAnim >= 29 && tickAnim < 37) {
            xx = 0 + (((tickAnim - 29) / 8) * (0-(0)));
            yy = 0.55 + (((tickAnim - 29) / 8) * (0-(0.55)));
            zz = -0.55 + (((tickAnim - 29) / 8) * (0-(-0.55)));
        }
        else if (tickAnim >= 37 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 37) / 13) * (0-(0)));
            yy = 0 + (((tickAnim - 37) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 37) / 13) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftFoot.rotationPointX = this.leftFoot.rotationPointX + (float)(xx);
        this.leftFoot.rotationPointY = this.leftFoot.rotationPointY - (float)(yy);
        this.leftFoot.rotationPointZ = this.leftFoot.rotationPointZ + (float)(zz);

    }
    public void animLay(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraFukuititan entity = (EntityPrehistoricFloraFukuititan) entitylivingbaseIn;
        int animCycle = 50;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (-8.25-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = -8.25 + (((tickAnim - 20) / 10) * (-8.25-(-8.25)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = -8.25 + (((tickAnim - 30) / 20) * (0-(-8.25)));
            yy = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(hips, hips.rotateAngleX + (float) Math.toRadians(xx), hips.rotateAngleY + (float) Math.toRadians(yy), hips.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (-6.675-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (-0.825-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            yy = -6.675 + (((tickAnim - 20) / 10) * (-6.675-(-6.675)));
            zz = -0.825 + (((tickAnim - 20) / 10) * (-0.825-(-0.825)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            yy = -6.675 + (((tickAnim - 30) / 20) * (0-(-6.675)));
            zz = -0.825 + (((tickAnim - 30) / 20) * (0-(-0.825)));
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
            xx = 0 + (((tickAnim - 0) / 20) * (4.75-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 4.75 + (((tickAnim - 20) / 10) * (4.75-(4.75)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 4.75 + (((tickAnim - 30) / 20) * (0-(4.75)));
            yy = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail1, tail1.rotateAngleX + (float) Math.toRadians(xx), tail1.rotateAngleY + (float) Math.toRadians(yy), tail1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (2.25-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 2.25 + (((tickAnim - 20) / 10) * (2.25-(2.25)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 2.25 + (((tickAnim - 30) / 20) * (0-(2.25)));
            yy = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(xx), tail2.rotateAngleY + (float) Math.toRadians(yy), tail2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (4.75-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 4.75 + (((tickAnim - 20) / 10) * (4.75-(4.75)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 4.75 + (((tickAnim - 30) / 20) * (0-(4.75)));
            yy = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(xx), tail3.rotateAngleY + (float) Math.toRadians(yy), tail3.rotateAngleZ + (float) Math.toRadians(zz));




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
        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(xx), tail4.rotateAngleY + (float) Math.toRadians(yy), tail4.rotateAngleZ + (float) Math.toRadians(zz));




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
        this.setRotateAngle(tail5, tail5.rotateAngleX + (float) Math.toRadians(xx), tail5.rotateAngleY + (float) Math.toRadians(yy), tail5.rotateAngleZ + (float) Math.toRadians(zz));




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
        this.setRotateAngle(tail7, tail7.rotateAngleX + (float) Math.toRadians(xx), tail7.rotateAngleY + (float) Math.toRadians(yy), tail7.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (-7-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = -7 + (((tickAnim - 20) / 10) * (-7-(-7)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = -7 + (((tickAnim - 30) / 20) * (0-(-7)));
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
            xx = 0 + (((tickAnim - 0) / 20) * (16-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 16 + (((tickAnim - 20) / 10) * (16-(16)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 16 + (((tickAnim - 30) / 20) * (0-(16)));
            yy = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
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
        this.setRotateAngle(rightArm2, rightArm2.rotateAngleX + (float) Math.toRadians(xx), rightArm2.rotateAngleY + (float) Math.toRadians(yy), rightArm2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (-0.675-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            yy = -0.675 + (((tickAnim - 20) / 10) * (-0.675-(-0.675)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            yy = -0.675 + (((tickAnim - 30) / 20) * (0-(-0.675)));
            zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
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
            xx = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightHand, rightHand.rotateAngleX + (float) Math.toRadians(xx), rightHand.rotateAngleY + (float) Math.toRadians(yy), rightHand.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 20 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            yy = -0.85 + (((tickAnim - 20) / 10) * (-0.85-(-0.85)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightHand.rotationPointX = this.rightHand.rotationPointX + (float)(xx);
        this.rightHand.rotationPointY = this.rightHand.rotationPointY - (float)(yy);
        this.rightHand.rotationPointZ = this.rightHand.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (16-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 16 + (((tickAnim - 20) / 10) * (16-(16)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 16 + (((tickAnim - 30) / 20) * (0-(16)));
            yy = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
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
        this.setRotateAngle(leftArm2, leftArm2.rotateAngleX + (float) Math.toRadians(xx), leftArm2.rotateAngleY + (float) Math.toRadians(yy), leftArm2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (-0.675-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            yy = -0.675 + (((tickAnim - 20) / 10) * (-0.675-(-0.675)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            yy = -0.675 + (((tickAnim - 30) / 20) * (0-(-0.675)));
            zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
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
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftHand, leftHand.rotateAngleX + (float) Math.toRadians(xx), leftHand.rotateAngleY + (float) Math.toRadians(yy), leftHand.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (-0.85-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            yy = -0.85 + (((tickAnim - 20) / 10) * (-0.85-(-0.85)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            yy = -0.85 + (((tickAnim - 30) / 20) * (0-(-0.85)));
            zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
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
            xx = 0 + (((tickAnim - 0) / 20) * (11-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 11 + (((tickAnim - 20) / 10) * (11-(11)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 11 + (((tickAnim - 30) / 20) * (0-(11)));
            yy = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck1, neck1.rotateAngleX + (float) Math.toRadians(xx), neck1.rotateAngleY + (float) Math.toRadians(yy), neck1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (-7.75-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = -7.75 + (((tickAnim - 20) / 10) * (-7.75-(-7.75)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = -7.75 + (((tickAnim - 30) / 20) * (0-(-7.75)));
            yy = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg1, leftLeg1.rotateAngleX + (float) Math.toRadians(xx), leftLeg1.rotateAngleY + (float) Math.toRadians(yy), leftLeg1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (46.58702-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 46.58702 + (((tickAnim - 20) / 10) * (46.58702-(46.58702)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 46.58702 + (((tickAnim - 30) / 20) * (0-(46.58702)));
            yy = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg2, leftLeg2.rotateAngleX + (float) Math.toRadians(xx), leftLeg2.rotateAngleY + (float) Math.toRadians(yy), leftLeg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (1.625-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (-0.575-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            yy = 1.625 + (((tickAnim - 20) / 10) * (1.625-(1.625)));
            zz = -0.575 + (((tickAnim - 20) / 10) * (-0.575-(-0.575)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            yy = 1.625 + (((tickAnim - 30) / 20) * (0-(1.625)));
            zz = -0.575 + (((tickAnim - 30) / 20) * (0-(-0.575)));
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
            xx = 0 + (((tickAnim - 0) / 20) * (-29.75-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = -29.75 + (((tickAnim - 20) / 10) * (-29.75-(-29.75)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = -29.75 + (((tickAnim - 30) / 20) * (0-(-29.75)));
            yy = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftFoot, leftFoot.rotateAngleX + (float) Math.toRadians(xx), leftFoot.rotateAngleY + (float) Math.toRadians(yy), leftFoot.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0.875-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0.675-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            yy = 0.875 + (((tickAnim - 20) / 10) * (0.875-(0.875)));
            zz = 0.675 + (((tickAnim - 20) / 10) * (0.675-(0.675)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            yy = 0.875 + (((tickAnim - 30) / 20) * (0-(0.875)));
            zz = 0.675 + (((tickAnim - 30) / 20) * (0-(0.675)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftFoot.rotationPointX = this.leftFoot.rotationPointX + (float)(xx);
        this.leftFoot.rotationPointY = this.leftFoot.rotationPointY - (float)(yy);
        this.leftFoot.rotationPointZ = this.leftFoot.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (-7.75-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = -7.75 + (((tickAnim - 20) / 10) * (-7.75-(-7.75)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = -7.75 + (((tickAnim - 30) / 20) * (0-(-7.75)));
            yy = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg1, rightLeg1.rotateAngleX + (float) Math.toRadians(xx), rightLeg1.rotateAngleY + (float) Math.toRadians(yy), rightLeg1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (46.58702-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 46.58702 + (((tickAnim - 20) / 10) * (46.58702-(46.58702)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 46.58702 + (((tickAnim - 30) / 20) * (0-(46.58702)));
            yy = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg2, rightLeg2.rotateAngleX + (float) Math.toRadians(xx), rightLeg2.rotateAngleY + (float) Math.toRadians(yy), rightLeg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (1.625-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (-0.575-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            yy = 1.625 + (((tickAnim - 20) / 10) * (1.625-(1.625)));
            zz = -0.575 + (((tickAnim - 20) / 10) * (-0.575-(-0.575)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            yy = 1.625 + (((tickAnim - 30) / 20) * (0-(1.625)));
            zz = -0.575 + (((tickAnim - 30) / 20) * (0-(-0.575)));
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
            xx = 0 + (((tickAnim - 0) / 20) * (-29.75-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = -29.75 + (((tickAnim - 20) / 10) * (-29.75-(-29.75)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = -29.75 + (((tickAnim - 30) / 20) * (0-(-29.75)));
            yy = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightFoot, rightFoot.rotateAngleX + (float) Math.toRadians(xx), rightFoot.rotateAngleY + (float) Math.toRadians(yy), rightFoot.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0.875-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0.675-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            yy = 0.875 + (((tickAnim - 20) / 10) * (0.875-(0.875)));
            zz = 0.675 + (((tickAnim - 20) / 10) * (0.675-(0.675)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            yy = 0.875 + (((tickAnim - 30) / 20) * (0-(0.875)));
            zz = 0.675 + (((tickAnim - 30) / 20) * (0-(0.675)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightFoot.rotationPointX = this.rightFoot.rotationPointX + (float)(xx);
        this.rightFoot.rotationPointY = this.rightFoot.rotationPointY - (float)(yy);
        this.rightFoot.rotationPointZ = this.rightFoot.rotationPointZ + (float)(zz);

    }
    public void animEat(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraFukuititan entity = (EntityPrehistoricFloraFukuititan) entitylivingbaseIn;
        int animCycle = 25;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (11.5-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 25) {
            xx = 11.5 + (((tickAnim - 13) / 12) * (0-(11.5)));
            yy = 0 + (((tickAnim - 13) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(xx), chest.rotateAngleY + (float) Math.toRadians(yy), chest.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (-22.08979-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (1.76851-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (10.35164-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 25) {
            xx = -22.08979 + (((tickAnim - 13) / 12) * (0-(-22.08979)));
            yy = 1.76851 + (((tickAnim - 13) / 12) * (0-(1.76851)));
            zz = 10.35164 + (((tickAnim - 13) / 12) * (0-(10.35164)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm1, rightArm1.rotateAngleX + (float) Math.toRadians(xx), rightArm1.rotateAngleY + (float) Math.toRadians(yy), rightArm1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (-10.5-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 13) / 12) * (0-(0)));
            yy = 0 + (((tickAnim - 13) / 12) * (0-(0)));
            zz = -10.5 + (((tickAnim - 13) / 12) * (0-(-10.5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm2, rightArm2.rotateAngleX + (float) Math.toRadians(xx), rightArm2.rotateAngleY + (float) Math.toRadians(yy), rightArm2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (-22.08979-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (-1.76851-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (-10.35164-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 25) {
            xx = -22.08979 + (((tickAnim - 13) / 12) * (0-(-22.08979)));
            yy = -1.76851 + (((tickAnim - 13) / 12) * (0-(-1.76851)));
            zz = -10.35164 + (((tickAnim - 13) / 12) * (0-(-10.35164)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm1, leftArm1.rotateAngleX + (float) Math.toRadians(xx), leftArm1.rotateAngleY + (float) Math.toRadians(yy), leftArm1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (10.5-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 13) / 12) * (0-(0)));
            yy = 0 + (((tickAnim - 13) / 12) * (0-(0)));
            zz = 10.5 + (((tickAnim - 13) / 12) * (0-(10.5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm2, leftArm2.rotateAngleX + (float) Math.toRadians(xx), leftArm2.rotateAngleY + (float) Math.toRadians(yy), leftArm2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (24.25-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 25) {
            xx = 24.25 + (((tickAnim - 13) / 12) * (0-(24.25)));
            yy = 0 + (((tickAnim - 13) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck1, neck1.rotateAngleX + (float) Math.toRadians(xx), neck1.rotateAngleY + (float) Math.toRadians(yy), neck1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (14.75-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 25) {
            xx = 14.75 + (((tickAnim - 13) / 12) * (0-(14.75)));
            yy = 0 + (((tickAnim - 13) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(xx), neck2.rotateAngleY + (float) Math.toRadians(yy), neck2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (-0.35-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 13) / 12) * (0-(0)));
            yy = -0.35 + (((tickAnim - 13) / 12) * (0-(-0.35)));
            zz = 0 + (((tickAnim - 13) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.neck2.rotationPointX = this.neck2.rotationPointX + (float)(xx);
        this.neck2.rotationPointY = this.neck2.rotationPointY - (float)(yy);
        this.neck2.rotationPointZ = this.neck2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (25.5-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 25) {
            xx = 25.5 + (((tickAnim - 13) / 12) * (0-(25.5)));
            yy = 0 + (((tickAnim - 13) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(xx), neck3.rotateAngleY + (float) Math.toRadians(yy), neck3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (-0.375-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 13) / 12) * (0-(0)));
            yy = -0.375 + (((tickAnim - 13) / 12) * (0-(-0.375)));
            zz = 0 + (((tickAnim - 13) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.neck3.rotationPointX = this.neck3.rotationPointX + (float)(xx);
        this.neck3.rotationPointY = this.neck3.rotationPointY - (float)(yy);
        this.neck3.rotationPointZ = this.neck3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (13-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 25) {
            xx = 13 + (((tickAnim - 13) / 12) * (0-(13)));
            yy = 0 + (((tickAnim - 13) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck4, neck4.rotateAngleX + (float) Math.toRadians(xx), neck4.rotateAngleY + (float) Math.toRadians(yy), neck4.rotateAngleZ + (float) Math.toRadians(zz));



        this.setRotateAngle(neck5, neck5.rotateAngleX + (float) Math.toRadians(0), neck5.rotateAngleY + (float) Math.toRadians(0), neck5.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(neck6, neck6.rotateAngleX + (float) Math.toRadians(0), neck6.rotateAngleY + (float) Math.toRadians(0), neck6.rotateAngleZ + (float) Math.toRadians(0));



        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (15.25-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 25) {
            xx = 15.25 + (((tickAnim - 7) / 18) * (0-(15.25)));
            yy = 0 + (((tickAnim - 7) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 18) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (0.225-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0.45-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 7) / 18) * (0-(0)));
            yy = 0.225 + (((tickAnim - 7) / 18) * (0-(0.225)));
            zz = 0.45 + (((tickAnim - 7) / 18) * (0-(0.45)));
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
        else if (tickAnim >= 7 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 7) / 3) * (19.25-(0)));
            yy = 0 + (((tickAnim - 7) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 3) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 19.25 + (((tickAnim - 10) / 3) * (0-(19.25)));
            yy = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaws, jaws.rotateAngleX + (float) Math.toRadians(xx), jaws.rotateAngleY + (float) Math.toRadians(yy), jaws.rotateAngleZ + (float) Math.toRadians(zz));

    }
    public void animNoise(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraFukuititan entity = (EntityPrehistoricFloraFukuititan) entitylivingbaseIn;
        int animCycle = 45;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 24) {
            xx = 0 + (((tickAnim - 0) / 24) * (-2+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-80))*2-(0)));
            yy = 0 + (((tickAnim - 0) / 24) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 24) * (0-(0)));
        }
        else if (tickAnim >= 24 && tickAnim < 45) {
            xx = -2+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-80))*2 + (((tickAnim - 24) / 21) * (0-(-2+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-80))*2)));
            yy = 0 + (((tickAnim - 24) / 21) * (0-(0)));
            zz = 0 + (((tickAnim - 24) / 21) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck1, neck1.rotateAngleX + (float) Math.toRadians(xx), neck1.rotateAngleY + (float) Math.toRadians(yy), neck1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 24) {
            xx = 0 + (((tickAnim - 0) / 24) * (-2-(0)));
            yy = 0 + (((tickAnim - 0) / 24) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 24) * (0-(0)));
        }
        else if (tickAnim >= 24 && tickAnim < 45) {
            xx = -2 + (((tickAnim - 24) / 21) * (0-(-2)));
            yy = 0 + (((tickAnim - 24) / 21) * (0-(0)));
            zz = 0 + (((tickAnim - 24) / 21) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(xx), neck2.rotateAngleY + (float) Math.toRadians(yy), neck2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 24) {
            xx = 0 + (((tickAnim - 0) / 24) * (-1.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-120))*2-(0)));
            yy = 0 + (((tickAnim - 0) / 24) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 24) * (0-(0)));
        }
        else if (tickAnim >= 24 && tickAnim < 45) {
            xx = -1.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-120))*2 + (((tickAnim - 24) / 21) * (0-(-1.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-120))*2)));
            yy = 0 + (((tickAnim - 24) / 21) * (0-(0)));
            zz = 0 + (((tickAnim - 24) / 21) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(xx), neck3.rotateAngleY + (float) Math.toRadians(yy), neck3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 24) {
            xx = 0 + (((tickAnim - 0) / 24) * (-2.5-(0)));
            yy = 0 + (((tickAnim - 0) / 24) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 24) * (0-(0)));
        }
        else if (tickAnim >= 24 && tickAnim < 45) {
            xx = -2.5 + (((tickAnim - 24) / 21) * (0-(-2.5)));
            yy = 0 + (((tickAnim - 24) / 21) * (0-(0)));
            zz = 0 + (((tickAnim - 24) / 21) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck4, neck4.rotateAngleX + (float) Math.toRadians(xx), neck4.rotateAngleY + (float) Math.toRadians(yy), neck4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 24) {
            xx = 0 + (((tickAnim - 0) / 24) * (-3-(0)));
            yy = 0 + (((tickAnim - 0) / 24) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 24) * (0-(0)));
        }
        else if (tickAnim >= 24 && tickAnim < 45) {
            xx = -3 + (((tickAnim - 24) / 21) * (0-(-3)));
            yy = 0 + (((tickAnim - 24) / 21) * (0-(0)));
            zz = 0 + (((tickAnim - 24) / 21) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck5, neck5.rotateAngleX + (float) Math.toRadians(xx), neck5.rotateAngleY + (float) Math.toRadians(yy), neck5.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 24) {
            xx = 0 + (((tickAnim - 0) / 24) * (18.5-(0)));
            yy = 0 + (((tickAnim - 0) / 24) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 24) * (0-(0)));
        }
        else if (tickAnim >= 24 && tickAnim < 34) {
            xx = 18.5 + (((tickAnim - 24) / 10) * (0-(18.5)));
            yy = 0 + (((tickAnim - 24) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 24) / 10) * (0-(0)));
        }
        else if (tickAnim >= 34 && tickAnim < 45) {
            xx = 0 + (((tickAnim - 34) / 11) * (0-(0)));
            yy = 0 + (((tickAnim - 34) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 34) / 11) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaws, jaws.rotateAngleX + (float) Math.toRadians(xx), jaws.rotateAngleY + (float) Math.toRadians(yy), jaws.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 24) {
            xx = 0 + (((tickAnim - 0) / 24) * (-20.75-(0)));
            yy = 0 + (((tickAnim - 0) / 24) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 24) * (0-(0)));
        }
        else if (tickAnim >= 24 && tickAnim < 34) {
            xx = -20.75 + (((tickAnim - 24) / 10) * (0-(-20.75)));
            yy = 0 + (((tickAnim - 24) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 24) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(throat, throat.rotateAngleX + (float) Math.toRadians(xx), throat.rotateAngleY + (float) Math.toRadians(yy), throat.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 24) {
            xx = 0 + (((tickAnim - 0) / 24) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 24) * (-0.375-(0)));
            zz = 0 + (((tickAnim - 0) / 24) * (-1.05-(0)));
        }
        else if (tickAnim >= 24 && tickAnim < 34) {
            xx = 0 + (((tickAnim - 24) / 10) * (0-(0)));
            yy = -0.375 + (((tickAnim - 24) / 10) * (0-(-0.375)));
            zz = -1.05 + (((tickAnim - 24) / 10) * (0-(-1.05)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.throat.rotationPointX = this.throat.rotationPointX + (float)(xx);
        this.throat.rotationPointY = this.throat.rotationPointY - (float)(yy);
        this.throat.rotationPointZ = this.throat.rotationPointZ + (float)(zz);


        if (tickAnim >= 0 && tickAnim < 24) {
            xx = 1 + (((tickAnim - 0) / 24) * (1-(1)));
            yy = 1 + (((tickAnim - 0) / 24) * (1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000))*0.1-(1)));
            zz = 1 + (((tickAnim - 0) / 24) * (1-(1)));
        }
        else if (tickAnim >= 24 && tickAnim < 34) {
            xx = 1 + (((tickAnim - 24) / 10) * (1-(1)));
            yy = 1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000))*0.1 + (((tickAnim - 24) / 10) * (1-(1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000))*0.1)));
            zz = 1 + (((tickAnim - 24) / 10) * (1-(1)));
        }
        else {
            xx = 1;
            yy = 1;
            zz = 1;
        }
        this.throat.setScale((float)xx, (float)yy, (float)zz);

    }
    public void animRunning(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraFukuititan entity = (EntityPrehistoricFloraFukuititan) entitylivingbaseIn;
        int animCycle = 27;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;

        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 18.75 + (((tickAnim - 0) / 4) * (27.75-(18.75)));
            yy = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 12) {
            xx = 27.75 + (((tickAnim - 4) / 8) * (-15.25-(27.75)));
            yy = 0 + (((tickAnim - 4) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 8) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 28) {
            xx = -15.25 + (((tickAnim - 12) / 16) * (18.75-(-15.25)));
            yy = 0 + (((tickAnim - 12) / 16) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 16) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg1, rightLeg1.rotateAngleX + (float) Math.toRadians(xx), rightLeg1.rotateAngleY + (float) Math.toRadians(yy), rightLeg1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 11.5 + (((tickAnim - 0) / 4) * (15.75-(11.5)));
            yy = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 8) {
            xx = 15.75 + (((tickAnim - 4) / 4) * (-4.12-(15.75)));
            yy = 0 + (((tickAnim - 4) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 4) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 12) {
            xx = -4.12 + (((tickAnim - 8) / 4) * (7-(-4.12)));
            yy = 0 + (((tickAnim - 8) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 4) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 28) {
            xx = 7 + (((tickAnim - 12) / 16) * (11.5-(7)));
            yy = 0 + (((tickAnim - 12) / 16) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 16) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg2, rightLeg2.rotateAngleX + (float) Math.toRadians(xx), rightLeg2.rotateAngleY + (float) Math.toRadians(yy), rightLeg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 4) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 4) / 4) * (3.01-(0)));
            zz = 0 + (((tickAnim - 4) / 4) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 8) / 4) * (0-(0)));
            yy = 3.01 + (((tickAnim - 8) / 4) * (-0.775-(3.01)));
            zz = 0 + (((tickAnim - 8) / 4) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 12) / 16) * (0-(0)));
            yy = -0.775 + (((tickAnim - 12) / 16) * (0-(-0.775)));
            zz = 0 + (((tickAnim - 12) / 16) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightLeg2.rotationPointX = this.rightLeg2.rotationPointX + (float)(xx);
        this.rightLeg2.rotationPointY = this.rightLeg2.rotationPointY - (float)(yy);
        this.rightLeg2.rotationPointZ = this.rightLeg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = -4 + (((tickAnim - 0) / 4) * (9.12535-(-4)));
            yy = 0 + (((tickAnim - 0) / 4) * (3.86129-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (1.92001-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 8) {
            xx = 9.12535 + (((tickAnim - 4) / 4) * (29.88-(9.12535)));
            yy = 3.86129 + (((tickAnim - 4) / 4) * (0-(3.86129)));
            zz = 1.92001 + (((tickAnim - 4) / 4) * (0-(1.92001)));
        }
        else if (tickAnim >= 8 && tickAnim < 12) {
            xx = 29.88 + (((tickAnim - 8) / 4) * (6.25-(29.88)));
            yy = 0 + (((tickAnim - 8) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 4) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 17) {
            xx = 6.25 + (((tickAnim - 12) / 5) * (-1.5-(6.25)));
            yy = 0 + (((tickAnim - 12) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 5) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 28) {
            xx = -1.5 + (((tickAnim - 17) / 11) * (-4-(-1.5)));
            yy = 0 + (((tickAnim - 17) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 17) / 11) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightFoot, rightFoot.rotateAngleX + (float) Math.toRadians(xx), rightFoot.rotateAngleY + (float) Math.toRadians(yy), rightFoot.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            yy = 0.3 + (((tickAnim - 0) / 4) * (0-(0.3)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 4) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 4) / 4) * (0.765-(0)));
            zz = 0 + (((tickAnim - 4) / 4) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 8) / 4) * (0-(0)));
            yy = 0.765 + (((tickAnim - 8) / 4) * (-0.6-(0.765)));
            zz = 0 + (((tickAnim - 8) / 4) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 17) {
            xx = 0 + (((tickAnim - 12) / 5) * (0-(0)));
            yy = -0.6 + (((tickAnim - 12) / 5) * (0-(-0.6)));
            zz = 0 + (((tickAnim - 12) / 5) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 17) / 11) * (0-(0)));
            yy = 0 + (((tickAnim - 17) / 11) * (0.3-(0)));
            zz = 0 + (((tickAnim - 17) / 11) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightFoot.rotationPointX = this.rightFoot.rotationPointX + (float)(xx);
        this.rightFoot.rotationPointY = this.rightFoot.rotationPointY - (float)(yy);
        this.rightFoot.rotationPointZ = this.rightFoot.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 8.06949 + (((tickAnim - 0) / 3) * (-5.38178-(8.06949)));
            yy = 0.13296 + (((tickAnim - 0) / 3) * (0.46534-(0.13296)));
            zz = -1.06316 + (((tickAnim - 0) / 3) * (-3.72106-(-1.06316)));
        }
        else if (tickAnim >= 3 && tickAnim < 6) {
            xx = -5.38178 + (((tickAnim - 3) / 3) * (-24.75-(-5.38178)));
            yy = 0.46534 + (((tickAnim - 3) / 3) * (0-(0.46534)));
            zz = -3.72106 + (((tickAnim - 3) / 3) * (0-(-3.72106)));
        }
        else if (tickAnim >= 6 && tickAnim < 26) {
            xx = -24.75 + (((tickAnim - 6) / 20) * (14.75-(-24.75)));
            yy = 0 + (((tickAnim - 6) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 20) * (0-(0)));
        }
        else if (tickAnim >= 26 && tickAnim < 28) {
            xx = 14.75 + (((tickAnim - 26) / 2) * (8.06949-(14.75)));
            yy = 0 + (((tickAnim - 26) / 2) * (0.13296-(0)));
            zz = 0 + (((tickAnim - 26) / 2) * (-1.06316-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm1, leftArm1.rotateAngleX + (float) Math.toRadians(xx), leftArm1.rotateAngleY + (float) Math.toRadians(yy), leftArm1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = -4.32751 + (((tickAnim - 0) / 3) * (-31.77127-(-4.32751)));
            yy = 0.88552 + (((tickAnim - 0) / 3) * (3.09932-(0.88552)));
            zz = 0.83127 + (((tickAnim - 0) / 3) * (2.90946-(0.83127)));
        }
        else if (tickAnim >= 3 && tickAnim < 6) {
            xx = -31.77127 + (((tickAnim - 3) / 3) * (2-(-31.77127)));
            yy = 3.09932 + (((tickAnim - 3) / 3) * (0-(3.09932)));
            zz = 2.90946 + (((tickAnim - 3) / 3) * (0-(2.90946)));
        }
        else if (tickAnim >= 6 && tickAnim < 26) {
            xx = 2 + (((tickAnim - 6) / 20) * (7-(2)));
            yy = 0 + (((tickAnim - 6) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 20) * (0-(0)));
        }
        else if (tickAnim >= 26 && tickAnim < 28) {
            xx = 7 + (((tickAnim - 26) / 2) * (-4.32751-(7)));
            yy = 0 + (((tickAnim - 26) / 2) * (0.88552-(0)));
            zz = 0 + (((tickAnim - 26) / 2) * (0.83127-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm2, leftArm2.rotateAngleX + (float) Math.toRadians(xx), leftArm2.rotateAngleY + (float) Math.toRadians(yy), leftArm2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = -0.31 + (((tickAnim - 0) / 3) * (0.97-(-0.31)));
            zz = 0.2 + (((tickAnim - 0) / 3) * (0.7-(0.2)));
        }
        else if (tickAnim >= 3 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 3) / 3) * (0-(0)));
            yy = 0.97 + (((tickAnim - 3) / 3) * (-0.75-(0.97)));
            zz = 0.7 + (((tickAnim - 3) / 3) * (0-(0.7)));
        }
        else if (tickAnim >= 6 && tickAnim < 26) {
            xx = 0 + (((tickAnim - 6) / 20) * (0-(0)));
            yy = -0.75 + (((tickAnim - 6) / 20) * (-0.825-(-0.75)));
            zz = 0 + (((tickAnim - 6) / 20) * (0-(0)));
        }
        else if (tickAnim >= 26 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 26) / 2) * (0-(0)));
            yy = -0.825 + (((tickAnim - 26) / 2) * (-0.31-(-0.825)));
            zz = 0 + (((tickAnim - 26) / 2) * (0.2-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftArm2.rotationPointX = this.leftArm2.rotationPointX + (float)(xx);
        this.leftArm2.rotationPointY = this.leftArm2.rotationPointY - (float)(yy);
        this.leftArm2.rotationPointZ = this.leftArm2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 28.68404 + (((tickAnim - 0) / 3) * (52.75-(28.68404)));
            yy = -0.74763 + (((tickAnim - 0) / 3) * (0-(-0.74763)));
            zz = 0.39908 + (((tickAnim - 0) / 3) * (0-(0.39908)));
        }
        else if (tickAnim >= 3 && tickAnim < 6) {
            xx = 52.75 + (((tickAnim - 3) / 3) * (20.25-(52.75)));
            yy = 0 + (((tickAnim - 3) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 3) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 15) {
            xx = 20.25 + (((tickAnim - 6) / 9) * (0-(20.25)));
            yy = 0 + (((tickAnim - 6) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 9) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 26) {
            xx = 0 + (((tickAnim - 15) / 11) * (18.70766-(0)));
            yy = 0 + (((tickAnim - 15) / 11) * (-1.04668-(0)));
            zz = 0 + (((tickAnim - 15) / 11) * (0.55871-(0)));
        }
        else if (tickAnim >= 26 && tickAnim < 28) {
            xx = 18.70766 + (((tickAnim - 26) / 2) * (28.68404-(18.70766)));
            yy = -1.04668 + (((tickAnim - 26) / 2) * (-0.74763-(-1.04668)));
            zz = 0.55871 + (((tickAnim - 26) / 2) * (0.39908-(0.55871)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftHand, leftHand.rotateAngleX + (float) Math.toRadians(xx), leftHand.rotateAngleY + (float) Math.toRadians(yy), leftHand.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0.08 + (((tickAnim - 0) / 3) * (1.15-(0.08)));
            zz = 0.21 + (((tickAnim - 0) / 3) * (0-(0.21)));
        }
        else if (tickAnim >= 3 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 3) / 3) * (0-(0)));
            yy = 1.15 + (((tickAnim - 3) / 3) * (-0.125-(1.15)));
            zz = 0 + (((tickAnim - 3) / 3) * (0.275-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 6) / 9) * (0-(0)));
            yy = -0.125 + (((tickAnim - 6) / 9) * (1.3-(-0.125)));
            zz = 0.275 + (((tickAnim - 6) / 9) * (0-(0.275)));
        }
        else if (tickAnim >= 15 && tickAnim < 26) {
            xx = 0 + (((tickAnim - 15) / 11) * (0-(0)));
            yy = 1.3 + (((tickAnim - 15) / 11) * (-0.35-(1.3)));
            zz = 0 + (((tickAnim - 15) / 11) * (0.3-(0)));
        }
        else if (tickAnim >= 26 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 26) / 2) * (0-(0)));
            yy = -0.35 + (((tickAnim - 26) / 2) * (0.08-(-0.35)));
            zz = 0.3 + (((tickAnim - 26) / 2) * (0.21-(0.3)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftHand.rotationPointX = this.leftHand.rotationPointX + (float)(xx);
        this.leftHand.rotationPointY = this.leftHand.rotationPointY - (float)(yy);
        this.leftHand.rotationPointZ = this.leftHand.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 16) {
            xx = 2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-90))*10 + (((tickAnim - 0) / 16) * (21.5-(2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-90))*10)));
            yy = 0 + (((tickAnim - 0) / 16) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 16) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 26) {
            xx = 21.5 + (((tickAnim - 16) / 10) * (-13.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-90))*10-(21.5)));
            yy = 0 + (((tickAnim - 16) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 16) / 10) * (0-(0)));
        }
        else if (tickAnim >= 26 && tickAnim < 28) {
            xx = -13.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-90))*10 + (((tickAnim - 26) / 2) * (-16.925+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-90))*10-(-13.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-90))*10)));
            yy = 0 + (((tickAnim - 26) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 26) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg1, leftLeg1.rotateAngleX + (float) Math.toRadians(xx), leftLeg1.rotateAngleY + (float) Math.toRadians(yy), leftLeg1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 16) {
            xx = 2.75 + (((tickAnim - 0) / 16) * (20.25-(2.75)));
            yy = 0 + (((tickAnim - 0) / 16) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 16) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 22) {
            xx = 20.25 + (((tickAnim - 16) / 6) * (-12.25-(20.25)));
            yy = 0 + (((tickAnim - 16) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 16) / 6) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 26) {
            xx = -12.25 + (((tickAnim - 22) / 4) * (-0.25-(-12.25)));
            yy = 0 + (((tickAnim - 22) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 22) / 4) * (0-(0)));
        }
        else if (tickAnim >= 26 && tickAnim < 28) {
            xx = -0.25 + (((tickAnim - 26) / 2) * (2.75-(-0.25)));
            yy = 0 + (((tickAnim - 26) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 26) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg2, leftLeg2.rotateAngleX + (float) Math.toRadians(xx), leftLeg2.rotateAngleY + (float) Math.toRadians(yy), leftLeg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 16) {
            xx = 0 + (((tickAnim - 0) / 16) * (0-(0)));
            yy = -0.675 + (((tickAnim - 0) / 16) * (0-(-0.675)));
            zz = 0 + (((tickAnim - 0) / 16) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 22) {
            xx = 0 + (((tickAnim - 16) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 16) / 6) * (3.2-(0)));
            zz = 0 + (((tickAnim - 16) / 6) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 26) {
            xx = 0 + (((tickAnim - 22) / 4) * (0-(0)));
            yy = 3.2 + (((tickAnim - 22) / 4) * (-0.675-(3.2)));
            zz = 0 + (((tickAnim - 22) / 4) * (0-(0)));
        }
        else if (tickAnim >= 26 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 26) / 2) * (0-(0)));
            yy = -0.675 + (((tickAnim - 26) / 2) * (-0.675-(-0.675)));
            zz = 0 + (((tickAnim - 26) / 2) * (0-(0)));
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
            xx = 6.25 + (((tickAnim - 0) / 6) * (-12.47-(6.25)));
            yy = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 16) {
            xx = -12.47 + (((tickAnim - 6) / 10) * (25.25-(-12.47)));
            yy = 0 + (((tickAnim - 6) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 10) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 22) {
            xx = 25.25 + (((tickAnim - 16) / 6) * (36.68-(25.25)));
            yy = 0 + (((tickAnim - 16) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 16) / 6) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 26) {
            xx = 36.68 + (((tickAnim - 22) / 4) * (8.5-(36.68)));
            yy = 0 + (((tickAnim - 22) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 22) / 4) * (0-(0)));
        }
        else if (tickAnim >= 26 && tickAnim < 28) {
            xx = 8.5 + (((tickAnim - 26) / 2) * (6.25-(8.5)));
            yy = 0 + (((tickAnim - 26) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 26) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftFoot, leftFoot.rotateAngleX + (float) Math.toRadians(xx), leftFoot.rotateAngleY + (float) Math.toRadians(yy), leftFoot.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            yy = 0.325 + (((tickAnim - 0) / 6) * (0.5-(0.325)));
            zz = 0 + (((tickAnim - 0) / 6) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 16) {
            xx = 0 + (((tickAnim - 6) / 10) * (0-(0)));
            yy = 0.5 + (((tickAnim - 6) / 10) * (0-(0.5)));
            zz = 0 + (((tickAnim - 6) / 10) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 22) {
            xx = 0 + (((tickAnim - 16) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 16) / 6) * (0.925-(0)));
            zz = 0 + (((tickAnim - 16) / 6) * (-0.325-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 26) {
            xx = 0 + (((tickAnim - 22) / 4) * (0-(0)));
            yy = 0.925 + (((tickAnim - 22) / 4) * (1.075-(0.925)));
            zz = -0.325 + (((tickAnim - 22) / 4) * (0-(-0.325)));
        }
        else if (tickAnim >= 26 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 26) / 2) * (0-(0)));
            yy = 1.075 + (((tickAnim - 26) / 2) * (0.325-(1.075)));
            zz = 0 + (((tickAnim - 26) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftFoot.rotationPointX = this.leftFoot.rotationPointX + (float)(xx);
        this.leftFoot.rotationPointY = this.leftFoot.rotationPointY - (float)(yy);
        this.leftFoot.rotationPointZ = this.leftFoot.rotationPointZ + (float)(zz);



        this.setRotateAngle(hips, hips.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*262/0.5-90))*2), hips.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*262-90))*-2), hips.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*262-90))*-2));
        this.hips.rotationPointX = this.hips.rotationPointX + (float)(0);
        this.hips.rotationPointY = this.hips.rotationPointY - (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*262/0.5-140))*0.3);
        this.hips.rotationPointZ = this.hips.rotationPointZ + (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*262/0.5-150))*-0.2);


        this.setRotateAngle(tail1, tail1.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*262/0.5-120))*0.5), tail1.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*262-150))*1.5), tail1.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*262-100))*1));


        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*262/0.5-120))*-1), tail2.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*262-100))*-2), tail2.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*262-150))*2));


        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*262/0.5-180))*-2), tail3.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*262-90))*-5), tail3.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*262-180))*2));


        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*262/0.5-200))*2), tail4.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*262-70))*-8), tail4.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*262-180))*2));


        this.setRotateAngle(tail5, tail5.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*262/0.5-250))*-3), tail5.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*262))*11), tail5.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*262-180))*2));


        this.setRotateAngle(tail6, tail6.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*262/0.5-300))*-5), tail6.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*262-20))*14), tail6.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*262-180))*2));


        this.setRotateAngle(tail7, tail7.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*262/0.5-380))*-7), tail7.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*262+80))*-17), tail7.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*262-180))*2));


        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*262/0.5-90))*-2), body.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*262-90))*2), body.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*262-180))*-1.5));


        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*260/0.5-120))*-2), chest.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*260-70))*1), chest.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*260-90))*3));



        if (tickAnim >= 0 && tickAnim < 10) {
            xx = -3.25 + (((tickAnim - 0) / 10) * (14.5-(-3.25)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = 14.5 + (((tickAnim - 10) / 5) * (-5.38178-(14.5)));
            yy = 0 + (((tickAnim - 10) / 5) * (-0.46534-(0)));
            zz = 0 + (((tickAnim - 10) / 5) * (3.72106-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 18) {
            xx = -5.38178 + (((tickAnim - 15) / 3) * (-26-(-5.38178)));
            yy = -0.46534 + (((tickAnim - 15) / 3) * (0-(-0.46534)));
            zz = 3.72106 + (((tickAnim - 15) / 3) * (0-(3.72106)));
        }
        else if (tickAnim >= 18 && tickAnim < 28) {
            xx = -26 + (((tickAnim - 18) / 10) * (-3.25-(-26)));
            yy = 0 + (((tickAnim - 18) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm1, rightArm1.rotateAngleX + (float) Math.toRadians(xx), rightArm1.rotateAngleY + (float) Math.toRadians(yy), rightArm1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (5-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = 5 + (((tickAnim - 10) / 5) * (-31.77127-(5)));
            yy = 0 + (((tickAnim - 10) / 5) * (-3.09932-(0)));
            zz = 0 + (((tickAnim - 10) / 5) * (-2.90946-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 18) {
            xx = -31.77127 + (((tickAnim - 15) / 3) * (2-(-31.77127)));
            yy = -3.09932 + (((tickAnim - 15) / 3) * (0-(-3.09932)));
            zz = -2.90946 + (((tickAnim - 15) / 3) * (0-(-2.90946)));
        }
        else if (tickAnim >= 18 && tickAnim < 28) {
            xx = 2 + (((tickAnim - 18) / 10) * (0-(2)));
            yy = 0 + (((tickAnim - 18) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm2, rightArm2.rotateAngleX + (float) Math.toRadians(xx), rightArm2.rotateAngleY + (float) Math.toRadians(yy), rightArm2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (-0.7-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 10) / 5) * (0-(0)));
            yy = -0.7 + (((tickAnim - 10) / 5) * (0.97-(-0.7)));
            zz = 0 + (((tickAnim - 10) / 5) * (0.7-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 15) / 3) * (0-(0)));
            yy = 0.97 + (((tickAnim - 15) / 3) * (-0.75-(0.97)));
            zz = 0.7 + (((tickAnim - 15) / 3) * (0-(0.7)));
        }
        else if (tickAnim >= 18 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 18) / 10) * (0-(0)));
            yy = -0.75 + (((tickAnim - 18) / 10) * (0-(-0.75)));
            zz = 0 + (((tickAnim - 18) / 10) * (0-(0)));
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
            xx = 7.5 + (((tickAnim - 0) / 10) * (15.75-(7.5)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = 15.75 + (((tickAnim - 10) / 5) * (52.75-(15.75)));
            yy = 0 + (((tickAnim - 10) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 5) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 18) {
            xx = 52.75 + (((tickAnim - 15) / 3) * (20.25-(52.75)));
            yy = 0 + (((tickAnim - 15) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 3) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 28) {
            xx = 20.25 + (((tickAnim - 18) / 10) * (7.5-(20.25)));
            yy = 0 + (((tickAnim - 18) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightHand, rightHand.rotateAngleX + (float) Math.toRadians(xx), rightHand.rotateAngleY + (float) Math.toRadians(yy), rightHand.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (-0.275-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 10) / 5) * (0-(0)));
            yy = -0.275 + (((tickAnim - 10) / 5) * (1.15-(-0.275)));
            zz = 0 + (((tickAnim - 10) / 5) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 15) / 3) * (0-(0)));
            yy = 1.15 + (((tickAnim - 15) / 3) * (-0.125-(1.15)));
            zz = 0 + (((tickAnim - 15) / 3) * (0.275-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 18) / 10) * (0-(0)));
            yy = -0.125 + (((tickAnim - 18) / 10) * (0-(-0.125)));
            zz = 0.275 + (((tickAnim - 18) / 10) * (0-(0.275)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightHand.rotationPointX = this.rightHand.rotationPointX + (float)(xx);
        this.rightHand.rotationPointY = this.rightHand.rotationPointY - (float)(yy);
        this.rightHand.rotationPointZ = this.rightHand.rotationPointZ + (float)(zz);



        this.setRotateAngle(neck1, neck1.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*262/0.5-150))*3), neck1.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*262-90))*-1), neck1.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*262-140))*2));


        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*262/0.5-250))*-1), neck2.rotateAngleY + (float) Math.toRadians(0), neck2.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*262-180))*2));


        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*262/0.5-270))*2), neck3.rotateAngleY + (float) Math.toRadians(0), neck3.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*262-230))*2));


        this.setRotateAngle(neck4, neck4.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*262/0.5-200))*-1), neck4.rotateAngleY + (float) Math.toRadians(0), neck4.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*262-280))*-2));


        this.setRotateAngle(neck5, neck5.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*262/0.5-200))*1), neck5.rotateAngleY + (float) Math.toRadians(0), neck5.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*262-350))*2));


        this.setRotateAngle(neck6, neck6.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*262/0.5-480))*-1), neck6.rotateAngleY + (float) Math.toRadians(0), neck6.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*262/0.5-550))*-1), head.rotateAngleY + (float) Math.toRadians(0), head.rotateAngleZ + (float) Math.toRadians(0));


    }
    public void animWalking(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraFukuititan entity = (EntityPrehistoricFloraFukuititan) entitylivingbaseIn;
        int animCycle = 40;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;

        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 17 + (((tickAnim - 0) / 6) * (25.5-(17)));
            yy = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 18) {
            xx = 25.5 + (((tickAnim - 6) / 12) * (-13-(25.5)));
            yy = 0 + (((tickAnim - 6) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 12) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 40) {
            xx = -13 + (((tickAnim - 18) / 22) * (17-(-13)));
            yy = 0 + (((tickAnim - 18) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 22) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg1, rightLeg1.rotateAngleX + (float) Math.toRadians(xx), rightLeg1.rotateAngleY + (float) Math.toRadians(yy), rightLeg1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 11.5 + (((tickAnim - 0) / 6) * (15.75-(11.5)));
            yy = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 12) {
            xx = 15.75 + (((tickAnim - 6) / 6) * (-4.12-(15.75)));
            yy = 0 + (((tickAnim - 6) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 6) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 18) {
            xx = -4.12 + (((tickAnim - 12) / 6) * (7-(-4.12)));
            yy = 0 + (((tickAnim - 12) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 6) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 40) {
            xx = 7 + (((tickAnim - 18) / 22) * (11.5-(7)));
            yy = 0 + (((tickAnim - 18) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 22) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg2, rightLeg2.rotateAngleX + (float) Math.toRadians(xx), rightLeg2.rotateAngleY + (float) Math.toRadians(yy), rightLeg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 6) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 6) / 6) * (3.01-(0)));
            zz = 0 + (((tickAnim - 6) / 6) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 12) / 6) * (0-(0)));
            yy = 3.01 + (((tickAnim - 12) / 6) * (-0.775-(3.01)));
            zz = 0 + (((tickAnim - 12) / 6) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 18) / 22) * (0-(0)));
            yy = -0.775 + (((tickAnim - 18) / 22) * (0-(-0.775)));
            zz = 0 + (((tickAnim - 18) / 22) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightLeg2.rotationPointX = this.rightLeg2.rotationPointX + (float)(xx);
        this.rightLeg2.rotationPointY = this.rightLeg2.rotationPointY - (float)(yy);
        this.rightLeg2.rotationPointZ = this.rightLeg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 6) {
            xx = -4 + (((tickAnim - 0) / 6) * (9.12535-(-4)));
            yy = 0 + (((tickAnim - 0) / 6) * (3.86129-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (1.92001-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 12) {
            xx = 9.12535 + (((tickAnim - 6) / 6) * (29.88-(9.12535)));
            yy = 3.86129 + (((tickAnim - 6) / 6) * (0-(3.86129)));
            zz = 1.92001 + (((tickAnim - 6) / 6) * (0-(1.92001)));
        }
        else if (tickAnim >= 12 && tickAnim < 18) {
            xx = 29.88 + (((tickAnim - 12) / 6) * (6.25-(29.88)));
            yy = 0 + (((tickAnim - 12) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 6) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 24) {
            xx = 6.25 + (((tickAnim - 18) / 6) * (-1.5-(6.25)));
            yy = 0 + (((tickAnim - 18) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 6) * (0-(0)));
        }
        else if (tickAnim >= 24 && tickAnim < 40) {
            xx = -1.5 + (((tickAnim - 24) / 16) * (-4-(-1.5)));
            yy = 0 + (((tickAnim - 24) / 16) * (0-(0)));
            zz = 0 + (((tickAnim - 24) / 16) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightFoot, rightFoot.rotateAngleX + (float) Math.toRadians(xx), rightFoot.rotateAngleY + (float) Math.toRadians(yy), rightFoot.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            yy = 0.3 + (((tickAnim - 0) / 6) * (0-(0.3)));
            zz = 0 + (((tickAnim - 0) / 6) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 6) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 6) / 6) * (0.765-(0)));
            zz = 0 + (((tickAnim - 6) / 6) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 12) / 6) * (0-(0)));
            yy = 0.765 + (((tickAnim - 12) / 6) * (-0.6-(0.765)));
            zz = 0 + (((tickAnim - 12) / 6) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 24) {
            xx = 0 + (((tickAnim - 18) / 6) * (0-(0)));
            yy = -0.6 + (((tickAnim - 18) / 6) * (0-(-0.6)));
            zz = 0 + (((tickAnim - 18) / 6) * (0-(0)));
        }
        else if (tickAnim >= 24 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 24) / 16) * (0-(0)));
            yy = 0 + (((tickAnim - 24) / 16) * (0.3-(0)));
            zz = 0 + (((tickAnim - 24) / 16) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightFoot.rotationPointX = this.rightFoot.rotationPointX + (float)(xx);
        this.rightFoot.rotationPointY = this.rightFoot.rotationPointY - (float)(yy);
        this.rightFoot.rotationPointZ = this.rightFoot.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 8.06949 + (((tickAnim - 0) / 3) * (-5.38178-(8.06949)));
            yy = 0.13296 + (((tickAnim - 0) / 3) * (0.46534-(0.13296)));
            zz = -1.06316 + (((tickAnim - 0) / 3) * (-3.72106-(-1.06316)));
        }
        else if (tickAnim >= 3 && tickAnim < 8) {
            xx = -5.38178 + (((tickAnim - 3) / 5) * (-22.75-(-5.38178)));
            yy = 0.46534 + (((tickAnim - 3) / 5) * (0-(0.46534)));
            zz = -3.72106 + (((tickAnim - 3) / 5) * (0-(-3.72106)));
        }
        else if (tickAnim >= 8 && tickAnim < 38) {
            xx = -22.75 + (((tickAnim - 8) / 30) * (12.75-(-22.75)));
            yy = 0 + (((tickAnim - 8) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 30) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 40) {
            xx = 12.75 + (((tickAnim - 38) / 2) * (8.06949-(12.75)));
            yy = 0 + (((tickAnim - 38) / 2) * (0.13296-(0)));
            zz = 0 + (((tickAnim - 38) / 2) * (-1.06316-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm1, leftArm1.rotateAngleX + (float) Math.toRadians(xx), leftArm1.rotateAngleY + (float) Math.toRadians(yy), leftArm1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = -4.32751 + (((tickAnim - 0) / 3) * (-31.77127-(-4.32751)));
            yy = 0.88552 + (((tickAnim - 0) / 3) * (3.09932-(0.88552)));
            zz = 0.83127 + (((tickAnim - 0) / 3) * (2.90946-(0.83127)));
        }
        else if (tickAnim >= 3 && tickAnim < 8) {
            xx = -31.77127 + (((tickAnim - 3) / 5) * (2-(-31.77127)));
            yy = 3.09932 + (((tickAnim - 3) / 5) * (0-(3.09932)));
            zz = 2.90946 + (((tickAnim - 3) / 5) * (0-(2.90946)));
        }
        else if (tickAnim >= 8 && tickAnim < 38) {
            xx = 2 + (((tickAnim - 8) / 30) * (7-(2)));
            yy = 0 + (((tickAnim - 8) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 30) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 40) {
            xx = 7 + (((tickAnim - 38) / 2) * (-4.32751-(7)));
            yy = 0 + (((tickAnim - 38) / 2) * (0.88552-(0)));
            zz = 0 + (((tickAnim - 38) / 2) * (0.83127-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm2, leftArm2.rotateAngleX + (float) Math.toRadians(xx), leftArm2.rotateAngleY + (float) Math.toRadians(yy), leftArm2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = -0.31 + (((tickAnim - 0) / 3) * (0.97-(-0.31)));
            zz = 0.2 + (((tickAnim - 0) / 3) * (0.7-(0.2)));
        }
        else if (tickAnim >= 3 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 3) / 5) * (0-(0)));
            yy = 0.97 + (((tickAnim - 3) / 5) * (-0.75-(0.97)));
            zz = 0.7 + (((tickAnim - 3) / 5) * (0-(0.7)));
        }
        else if (tickAnim >= 8 && tickAnim < 38) {
            xx = 0 + (((tickAnim - 8) / 30) * (0-(0)));
            yy = -0.75 + (((tickAnim - 8) / 30) * (-0.825-(-0.75)));
            zz = 0 + (((tickAnim - 8) / 30) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 38) / 2) * (0-(0)));
            yy = -0.825 + (((tickAnim - 38) / 2) * (-0.31-(-0.825)));
            zz = 0 + (((tickAnim - 38) / 2) * (0.2-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftArm2.rotationPointX = this.leftArm2.rotationPointX + (float)(xx);
        this.leftArm2.rotationPointY = this.leftArm2.rotationPointY - (float)(yy);
        this.leftArm2.rotationPointZ = this.leftArm2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 28.68404 + (((tickAnim - 0) / 3) * (52.75-(28.68404)));
            yy = -0.74763 + (((tickAnim - 0) / 3) * (0-(-0.74763)));
            zz = 0.39908 + (((tickAnim - 0) / 3) * (0-(0.39908)));
        }
        else if (tickAnim >= 3 && tickAnim < 8) {
            xx = 52.75 + (((tickAnim - 3) / 5) * (20.25-(52.75)));
            yy = 0 + (((tickAnim - 3) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 5) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 22) {
            xx = 20.25 + (((tickAnim - 8) / 14) * (0-(20.25)));
            yy = 0 + (((tickAnim - 8) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 14) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 38) {
            xx = 0 + (((tickAnim - 22) / 16) * (18.70766-(0)));
            yy = 0 + (((tickAnim - 22) / 16) * (-1.04668-(0)));
            zz = 0 + (((tickAnim - 22) / 16) * (0.55871-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 40) {
            xx = 18.70766 + (((tickAnim - 38) / 2) * (28.68404-(18.70766)));
            yy = -1.04668 + (((tickAnim - 38) / 2) * (-0.74763-(-1.04668)));
            zz = 0.55871 + (((tickAnim - 38) / 2) * (0.39908-(0.55871)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftHand, leftHand.rotateAngleX + (float) Math.toRadians(xx), leftHand.rotateAngleY + (float) Math.toRadians(yy), leftHand.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0.08 + (((tickAnim - 0) / 3) * (1.15-(0.08)));
            zz = 0.21 + (((tickAnim - 0) / 3) * (0-(0.21)));
        }
        else if (tickAnim >= 3 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 3) / 5) * (0-(0)));
            yy = 1.15 + (((tickAnim - 3) / 5) * (-0.125-(1.15)));
            zz = 0 + (((tickAnim - 3) / 5) * (0.275-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 22) {
            xx = 0 + (((tickAnim - 8) / 14) * (0-(0)));
            yy = -0.125 + (((tickAnim - 8) / 14) * (1.3-(-0.125)));
            zz = 0.275 + (((tickAnim - 8) / 14) * (0-(0.275)));
        }
        else if (tickAnim >= 22 && tickAnim < 38) {
            xx = 0 + (((tickAnim - 22) / 16) * (0-(0)));
            yy = 1.3 + (((tickAnim - 22) / 16) * (-0.35-(1.3)));
            zz = 0 + (((tickAnim - 22) / 16) * (0.3-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 38) / 2) * (0-(0)));
            yy = -0.35 + (((tickAnim - 38) / 2) * (0.08-(-0.35)));
            zz = 0.3 + (((tickAnim - 38) / 2) * (0.21-(0.3)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftHand.rotationPointX = this.leftHand.rotationPointX + (float)(xx);
        this.leftHand.rotationPointY = this.leftHand.rotationPointY - (float)(yy);
        this.leftHand.rotationPointZ = this.leftHand.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 23) {
            xx = 6+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-90))*10 + (((tickAnim - 0) / 23) * (21.5-(6+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-90))*10)));
            yy = 0 + (((tickAnim - 0) / 23) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 23) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 38) {
            xx = 21.5 + (((tickAnim - 23) / 15) * (-13.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-90))*10-(21.5)));
            yy = 0 + (((tickAnim - 23) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 15) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 40) {
            xx = -13.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-90))*10 + (((tickAnim - 38) / 2) * (-9+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-90))*10-(-13.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-90))*10)));
            yy = 0 + (((tickAnim - 38) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 38) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg1, leftLeg1.rotateAngleX + (float) Math.toRadians(xx), leftLeg1.rotateAngleY + (float) Math.toRadians(yy), leftLeg1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 23) {
            xx = 2.75 + (((tickAnim - 0) / 23) * (20.25-(2.75)));
            yy = 0 + (((tickAnim - 0) / 23) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 23) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 31) {
            xx = 20.25 + (((tickAnim - 23) / 8) * (-12.25-(20.25)));
            yy = 0 + (((tickAnim - 23) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 8) * (0-(0)));
        }
        else if (tickAnim >= 31 && tickAnim < 38) {
            xx = -12.25 + (((tickAnim - 31) / 7) * (-0.25-(-12.25)));
            yy = 0 + (((tickAnim - 31) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 31) / 7) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 40) {
            xx = -0.25 + (((tickAnim - 38) / 2) * (2.75-(-0.25)));
            yy = 0 + (((tickAnim - 38) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 38) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg2, leftLeg2.rotateAngleX + (float) Math.toRadians(xx), leftLeg2.rotateAngleY + (float) Math.toRadians(yy), leftLeg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 0) / 23) * (0-(0)));
            yy = -0.675 + (((tickAnim - 0) / 23) * (0-(-0.675)));
            zz = 0 + (((tickAnim - 0) / 23) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 31) {
            xx = 0 + (((tickAnim - 23) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 23) / 8) * (3.2-(0)));
            zz = 0 + (((tickAnim - 23) / 8) * (0-(0)));
        }
        else if (tickAnim >= 31 && tickAnim < 38) {
            xx = 0 + (((tickAnim - 31) / 7) * (0-(0)));
            yy = 3.2 + (((tickAnim - 31) / 7) * (-0.675-(3.2)));
            zz = 0 + (((tickAnim - 31) / 7) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 38) / 2) * (0-(0)));
            yy = -0.675 + (((tickAnim - 38) / 2) * (-0.675-(-0.675)));
            zz = 0 + (((tickAnim - 38) / 2) * (0-(0)));
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
            xx = 2 + (((tickAnim - 0) / 8) * (-12.47-(2)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 23) {
            xx = -12.47 + (((tickAnim - 8) / 15) * (25.25-(-12.47)));
            yy = 0 + (((tickAnim - 8) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 15) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 31) {
            xx = 25.25 + (((tickAnim - 23) / 8) * (36.68-(25.25)));
            yy = 0 + (((tickAnim - 23) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 8) * (0-(0)));
        }
        else if (tickAnim >= 31 && tickAnim < 38) {
            xx = 36.68 + (((tickAnim - 31) / 7) * (8.5-(36.68)));
            yy = 0 + (((tickAnim - 31) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 31) / 7) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 40) {
            xx = 8.5 + (((tickAnim - 38) / 2) * (2-(8.5)));
            yy = 0 + (((tickAnim - 38) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 38) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftFoot, leftFoot.rotateAngleX + (float) Math.toRadians(xx), leftFoot.rotateAngleY + (float) Math.toRadians(yy), leftFoot.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            yy = 0.325 + (((tickAnim - 0) / 8) * (0.5-(0.325)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 8) / 15) * (0-(0)));
            yy = 0.5 + (((tickAnim - 8) / 15) * (0-(0.5)));
            zz = 0 + (((tickAnim - 8) / 15) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 31) {
            xx = 0 + (((tickAnim - 23) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 23) / 8) * (0.925-(0)));
            zz = 0 + (((tickAnim - 23) / 8) * (-0.325-(0)));
        }
        else if (tickAnim >= 31 && tickAnim < 38) {
            xx = 0 + (((tickAnim - 31) / 7) * (0-(0)));
            yy = 0.925 + (((tickAnim - 31) / 7) * (0-(0.925)));
            zz = -0.325 + (((tickAnim - 31) / 7) * (0-(-0.325)));
        }
        else if (tickAnim >= 38 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 38) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 38) / 2) * (0.325-(0)));
            zz = 0 + (((tickAnim - 38) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftFoot.rotationPointX = this.leftFoot.rotationPointX + (float)(xx);
        this.leftFoot.rotationPointY = this.leftFoot.rotationPointY - (float)(yy);
        this.leftFoot.rotationPointZ = this.leftFoot.rotationPointZ + (float)(zz);



        this.setRotateAngle(hips, hips.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.5-90))*1), hips.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-90))*-2), hips.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-90))*-2));
        this.hips.rotationPointX = this.hips.rotationPointX + (float)(0);
        this.hips.rotationPointY = this.hips.rotationPointY - (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.5-140))*0.3);
        this.hips.rotationPointZ = this.hips.rotationPointZ + (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.5-150))*-0.2);


        this.setRotateAngle(tail1, tail1.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.5-120))*0.5), tail1.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-150))*1.5), tail1.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-100))*1));


        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.5-120))*-1), tail2.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-100))*-2), tail2.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-150))*2));


        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.5-180))*-2), tail3.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-90))*-3), tail3.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-180))*2));


        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.5-200))*2), tail4.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-70))*-5), tail4.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-180))*2));


        this.setRotateAngle(tail5, tail5.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.5-250))*-3), tail5.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180))*7), tail5.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-180))*2));


        this.setRotateAngle(tail6, tail6.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.5-300))*-5), tail6.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-20))*9), tail6.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-180))*2));


        this.setRotateAngle(tail7, tail7.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.5-380))*-7), tail7.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180+80))*-12), tail7.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-180))*2));


        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.5-90))*-1), body.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-90))*2), body.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-180))*-1.5));


        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.5-120))*-1), chest.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-70))*1), chest.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-90))*3));



        if (tickAnim >= 0 && tickAnim < 15) {
            xx = -3.25 + (((tickAnim - 0) / 15) * (14.5-(-3.25)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 22) {
            xx = 14.5 + (((tickAnim - 15) / 7) * (-5.38178-(14.5)));
            yy = 0 + (((tickAnim - 15) / 7) * (-0.46534-(0)));
            zz = 0 + (((tickAnim - 15) / 7) * (3.72106-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 27) {
            xx = -5.38178 + (((tickAnim - 22) / 5) * (-22.75-(-5.38178)));
            yy = -0.46534 + (((tickAnim - 22) / 5) * (0-(-0.46534)));
            zz = 3.72106 + (((tickAnim - 22) / 5) * (0-(3.72106)));
        }
        else if (tickAnim >= 27 && tickAnim < 40) {
            xx = -22.75 + (((tickAnim - 27) / 13) * (-3.25-(-22.75)));
            yy = 0 + (((tickAnim - 27) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 27) / 13) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm1, rightArm1.rotateAngleX + (float) Math.toRadians(xx), rightArm1.rotateAngleY + (float) Math.toRadians(yy), rightArm1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (5-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 22) {
            xx = 5 + (((tickAnim - 15) / 7) * (-31.77127-(5)));
            yy = 0 + (((tickAnim - 15) / 7) * (-3.09932-(0)));
            zz = 0 + (((tickAnim - 15) / 7) * (-2.90946-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 27) {
            xx = -31.77127 + (((tickAnim - 22) / 5) * (2-(-31.77127)));
            yy = -3.09932 + (((tickAnim - 22) / 5) * (0-(-3.09932)));
            zz = -2.90946 + (((tickAnim - 22) / 5) * (0-(-2.90946)));
        }
        else if (tickAnim >= 27 && tickAnim < 40) {
            xx = 2 + (((tickAnim - 27) / 13) * (0-(2)));
            yy = 0 + (((tickAnim - 27) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 27) / 13) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm2, rightArm2.rotateAngleX + (float) Math.toRadians(xx), rightArm2.rotateAngleY + (float) Math.toRadians(yy), rightArm2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (-0.7-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 22) {
            xx = 0 + (((tickAnim - 15) / 7) * (0-(0)));
            yy = -0.7 + (((tickAnim - 15) / 7) * (0.97-(-0.7)));
            zz = 0 + (((tickAnim - 15) / 7) * (0.7-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 27) {
            xx = 0 + (((tickAnim - 22) / 5) * (0-(0)));
            yy = 0.97 + (((tickAnim - 22) / 5) * (-0.75-(0.97)));
            zz = 0.7 + (((tickAnim - 22) / 5) * (0-(0.7)));
        }
        else if (tickAnim >= 27 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 27) / 13) * (0-(0)));
            yy = -0.75 + (((tickAnim - 27) / 13) * (0-(-0.75)));
            zz = 0 + (((tickAnim - 27) / 13) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightArm2.rotationPointX = this.rightArm2.rotationPointX + (float)(xx);
        this.rightArm2.rotationPointY = this.rightArm2.rotationPointY - (float)(yy);
        this.rightArm2.rotationPointZ = this.rightArm2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 7.5 + (((tickAnim - 0) / 15) * (15.75-(7.5)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 22) {
            xx = 15.75 + (((tickAnim - 15) / 7) * (52.75-(15.75)));
            yy = 0 + (((tickAnim - 15) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 7) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 27) {
            xx = 52.75 + (((tickAnim - 22) / 5) * (20.25-(52.75)));
            yy = 0 + (((tickAnim - 22) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 22) / 5) * (0-(0)));
        }
        else if (tickAnim >= 27 && tickAnim < 40) {
            xx = 20.25 + (((tickAnim - 27) / 13) * (7.5-(20.25)));
            yy = 0 + (((tickAnim - 27) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 27) / 13) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightHand, rightHand.rotateAngleX + (float) Math.toRadians(xx), rightHand.rotateAngleY + (float) Math.toRadians(yy), rightHand.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (-0.275-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 22) {
            xx = 0 + (((tickAnim - 15) / 7) * (0-(0)));
            yy = -0.275 + (((tickAnim - 15) / 7) * (1.15-(-0.275)));
            zz = 0 + (((tickAnim - 15) / 7) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 27) {
            xx = 0 + (((tickAnim - 22) / 5) * (0-(0)));
            yy = 1.15 + (((tickAnim - 22) / 5) * (-0.125-(1.15)));
            zz = 0 + (((tickAnim - 22) / 5) * (0.275-(0)));
        }
        else if (tickAnim >= 27 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 27) / 13) * (0-(0)));
            yy = -0.125 + (((tickAnim - 27) / 13) * (0-(-0.125)));
            zz = 0.275 + (((tickAnim - 27) / 13) * (0-(0.275)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightHand.rotationPointX = this.rightHand.rotationPointX + (float)(xx);
        this.rightHand.rotationPointY = this.rightHand.rotationPointY - (float)(yy);
        this.rightHand.rotationPointZ = this.rightHand.rotationPointZ + (float)(zz);



        this.setRotateAngle(neck1, neck1.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.5-150))*2), neck1.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-90))*-1), neck1.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-140))*2));


        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.5-250))*-1), neck2.rotateAngleY + (float) Math.toRadians(0), neck2.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-180))*2));


        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.5-270))*2), neck3.rotateAngleY + (float) Math.toRadians(0), neck3.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-230))*2));


        this.setRotateAngle(neck4, neck4.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.5-200))*-1), neck4.rotateAngleY + (float) Math.toRadians(0), neck4.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-280))*-2));


        this.setRotateAngle(neck5, neck5.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.5-200))*1), neck5.rotateAngleY + (float) Math.toRadians(0), neck5.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-350))*2));


        this.setRotateAngle(neck6, neck6.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.5-480))*-1), neck6.rotateAngleY + (float) Math.toRadians(0), neck6.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.5-550))*-1), head.rotateAngleY + (float) Math.toRadians(0), head.rotateAngleZ + (float) Math.toRadians(0));



    }

        public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        EntityPrehistoricFloraFukuititan e = (EntityPrehistoricFloraFukuititan) entity;
        animator.update(entity);

        animator.setAnimation(e.HURT_ANIMATION); //30 ticks
        animator.startKeyframe(8);
        animator.rotate(this.head, (float) Math.toRadians(-25), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.jaws, (float) Math.toRadians(30), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(12);
        animator.resetKeyframe(10);

    }
}
