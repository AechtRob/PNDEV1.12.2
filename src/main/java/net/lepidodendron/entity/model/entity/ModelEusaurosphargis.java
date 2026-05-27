package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.EntityPrehistoricFloraEusaurosphargis;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;

public class ModelEusaurosphargis extends ModelBasePalaeopedia {
    private final AdvancedModelRenderer main;
    private final AdvancedModelRenderer body;
    private final AdvancedModelRenderer tail;
    private final AdvancedModelRenderer tail2;
    private final AdvancedModelRenderer tail3;
    private final AdvancedModelRenderer body2;
    private final AdvancedModelRenderer neck;
    private final AdvancedModelRenderer neck2;
    private final AdvancedModelRenderer head;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer cube_r6;
    private final AdvancedModelRenderer cube_r7;
    private final AdvancedModelRenderer jaw;
    private final AdvancedModelRenderer cube_r8;
    private final AdvancedModelRenderer cube_r9;
    private final AdvancedModelRenderer cube_r10;
    private final AdvancedModelRenderer cube_r11;
    private final AdvancedModelRenderer eye;
    private final AdvancedModelRenderer flangeRight;
    private final AdvancedModelRenderer cube_r12;
    private final AdvancedModelRenderer cube_r13;
    private final AdvancedModelRenderer cube_r14;
    private final AdvancedModelRenderer cube_r15;
    private final AdvancedModelRenderer flangeLeft;
    private final AdvancedModelRenderer cube_r16;
    private final AdvancedModelRenderer cube_r17;
    private final AdvancedModelRenderer cube_r18;
    private final AdvancedModelRenderer cube_r19;
    private final AdvancedModelRenderer leftArm;
    private final AdvancedModelRenderer cube_r20;
    private final AdvancedModelRenderer leftArm2;
    private final AdvancedModelRenderer cube_r21;
    private final AdvancedModelRenderer leftArm3;
    private final AdvancedModelRenderer cube_r22;
    private final AdvancedModelRenderer rightArm;
    private final AdvancedModelRenderer cube_r23;
    private final AdvancedModelRenderer rightArm2;
    private final AdvancedModelRenderer cube_r24;
    private final AdvancedModelRenderer rightArm3;
    private final AdvancedModelRenderer cube_r25;
    private final AdvancedModelRenderer leftLeg;
    private final AdvancedModelRenderer cube_r26;
    private final AdvancedModelRenderer leftLeg2;
    private final AdvancedModelRenderer cube_r27;
    private final AdvancedModelRenderer leftLeg3;
    private final AdvancedModelRenderer cube_r28;
    private final AdvancedModelRenderer rightLeg;
    private final AdvancedModelRenderer cube_r29;
    private final AdvancedModelRenderer rightLeg2;
    private final AdvancedModelRenderer cube_r30;
    private final AdvancedModelRenderer rightLeg3;
    private final AdvancedModelRenderer cube_r31;


    private ModelAnimator animator;

    public ModelEusaurosphargis() {
        this.textureWidth = 55;
        this.textureHeight = 54;

        this.main = new AdvancedModelRenderer(this);
        this.main.setRotationPoint(0.0F, 20.2818F, 0.2455F);


        this.body = new AdvancedModelRenderer(this);
        this.body.setRotationPoint(0.0F, 1.1182F, 8.2546F);
        this.main.addChild(body);
        this.setRotateAngle(body, -0.0873F, 0.0F, 0.0F);
        this.body.cubeList.add(new ModelBox(body, 35, 0, -1.5F, -1.0F, -1.5F, 3, 2, 3, 0.0F, false));

        this.tail = new AdvancedModelRenderer(this);
        this.tail.setRotationPoint(0.0F, 0.0174F, 1.1008F);
        this.body.addChild(tail);
        this.setRotateAngle(tail, -0.0873F, 0.0F, 0.0F);
        this.tail.cubeList.add(new ModelBox(tail, 23, 29, -2.0F, -0.5F, -0.8F, 4, 1, 4, 0.0F, false));
        this.tail.cubeList.add(new ModelBox(tail, 23, 35, -1.0F, -1.0F, 0.2F, 2, 2, 3, 0.0F, false));
        this.tail.cubeList.add(new ModelBox(tail, 46, 9, -1.5F, -0.5F, 3.2F, 3, 1, 1, 0.0F, false));

        this.tail2 = new AdvancedModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, -0.0811F, 4.0842F);
        this.tail.addChild(tail2);
        this.setRotateAngle(tail2, 0.1309F, 0.0F, 0.0F);
        this.tail2.cubeList.add(new ModelBox(tail2, 40, 28, -0.5F, -0.4F, -0.1F, 1, 1, 3, 0.0F, false));

        this.tail3 = new AdvancedModelRenderer(this);
        this.tail3.setRotationPoint(0.0F, 0.0869F, 2.7993F);
        this.tail2.addChild(tail3);
        this.setRotateAngle(tail3, 0.0873F, 0.0F, 0.0F);
        this.tail3.cubeList.add(new ModelBox(tail3, 7, 48, -0.5F, -0.5F, 0.0F, 1, 1, 2, 0.01F, false));

        this.body2 = new AdvancedModelRenderer(this);
        this.body2.setRotationPoint(0.0F, 0.0F, -1.6F);
        this.body.addChild(body2);
        this.body2.cubeList.add(new ModelBox(body2, 0, 0, -2.0F, -1.5F, -12.9F, 4, 3, 13, 0.0F, false));
        this.body2.cubeList.add(new ModelBox(body2, 0, 17, -3.0F, -1.8F, -9.9F, 6, 3, 8, 0.0F, false));
        this.body2.cubeList.add(new ModelBox(body2, 14, 2, -0.5F, -1.85F, -9.9F, 1, 0, 8, 0.0F, false));
        this.body2.cubeList.add(new ModelBox(body2, 22, 2, -0.5F, -1.525F, -1.9F, 1, 0, 2, 0.0F, false));
        this.body2.cubeList.add(new ModelBox(body2, 24, 2, -0.5F, -1.525F, -11.9F, 1, 0, 2, 0.0F, false));
        this.body2.cubeList.add(new ModelBox(body2, 9, 43, -1.5F, -1.5F, -13.9F, 3, 3, 1, 0.0F, false));

        this.neck = new AdvancedModelRenderer(this);
        this.neck.setRotationPoint(0.0F, -0.5F, -13.9F);
        this.body2.addChild(neck);
        this.setRotateAngle(neck, -0.3054F, 0.0F, 0.0F);
        this.neck.cubeList.add(new ModelBox(neck, 31, 43, -1.0F, -1.0F, -1.6F, 2, 2, 2, -0.1F, false));

        this.neck2 = new AdvancedModelRenderer(this);
        this.neck2.setRotationPoint(0.0F, -0.7698F, -1.3892F);
        this.neck.addChild(neck2);
        this.setRotateAngle(neck2, 0.2443F, 0.0F, 0.0F);
        this.neck2.cubeList.add(new ModelBox(neck2, 0, 43, -1.0F, -0.3F, -1.9F, 2, 2, 2, -0.14F, false));

        this.head = new AdvancedModelRenderer(this);
        this.head.setRotationPoint(0.0F, -0.0016F, -1.6702F);
        this.neck2.addChild(head);
        this.setRotateAngle(head, 0.3796F, 0.0F, 0.0F);
        this.head.cubeList.add(new ModelBox(head, 45, 33, -1.0F, 0.1748F, -1.938F, 2, 1, 2, 0.01F, false));
        this.head.cubeList.add(new ModelBox(head, 40, 43, -1.0F, -0.3252F, -1.938F, 2, 1, 2, 0.02F, false));
        this.head.cubeList.add(new ModelBox(head, 35, 6, -0.5F, 0.2748F, -3.738F, 1, 1, 4, 0.0F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(-0.5693F, 1.8524F, -4.0349F);
        this.head.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.0F, -0.2531F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 47, 47, 0.1314F, -1.5876F, 0.2601F, 1, 1, 2, -0.01F, true));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(0.5693F, 1.8524F, -4.0349F);
        this.head.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.0F, 0.2531F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 47, 47, -1.1314F, -1.5876F, 0.2601F, 1, 1, 2, -0.01F, false));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(0.0F, 1.478F, -2.8463F);
        this.head.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.2618F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 18, 46, -0.5F, -1.393F, -0.5499F, 1, 1, 2, 0.0F, false));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(0.5F, 0.6538F, -0.5417F);
        this.head.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.0F, 0.4363F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 49, 31, -0.5861F, -0.979F, 0.1846F, 1, 0, 1, 0.0F, false));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(-0.5F, 0.6538F, -0.5417F);
        this.head.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.0F, -0.4363F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 34, 51, -0.4139F, -0.979F, 0.1846F, 1, 0, 1, 0.0F, false));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(-0.7F, 1.1538F, -0.6417F);
        this.head.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.3359F, -0.6752F, -0.8225F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 25, 46, 0.1643F, -0.7243F, 0.0846F, 1, 0, 1, 0.0F, false));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(0.7F, 1.1538F, -0.6417F);
        this.head.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.3359F, 0.6752F, 0.8225F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 40, 33, -1.1643F, -0.7243F, 0.0846F, 1, 0, 1, 0.0F, false));

        this.jaw = new AdvancedModelRenderer(this);
        this.jaw.setRotationPoint(0.0F, 1.1538F, -0.1417F);
        this.head.addChild(jaw);
        this.setRotateAngle(jaw, -0.0436F, 0.0F, 0.0F);
        this.jaw.cubeList.add(new ModelBox(jaw, 25, 48, -1.0F, -1.1507F, -1.3147F, 2, 1, 1, -0.05F, false));
        this.jaw.cubeList.add(new ModelBox(jaw, 22, 41, -0.5F, -0.4719F, -3.5449F, 1, 1, 3, 0.01F, false));
        this.jaw.cubeList.add(new ModelBox(jaw, 45, 37, -1.0F, -0.479F, -1.7964F, 2, 1, 2, 0.0F, false));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(-0.5886F, 1.0985F, -3.8468F);
        this.jaw.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.0F, -0.2531F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 48, 0, 0.1513F, -1.5976F, 0.2601F, 1, 1, 2, -0.01F, true));

        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(0.5886F, 1.0985F, -3.8468F);
        this.jaw.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.0F, 0.2531F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 48, 0, -1.1513F, -1.5976F, 0.2601F, 1, 1, 2, -0.01F, false));

        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(0.0F, -0.9812F, -0.2844F);
        this.jaw.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 0.2182F, 0.0F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 29, 51, -0.5F, 0.495F, -0.6002F, 1, 1, 1, 0.0F, false));

        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(-0.5F, 1.0971F, -1.4297F);
        this.jaw.addChild(cube_r11);
        this.setRotateAngle(cube_r11, -0.0436F, 0.0F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 48, 12, 0.0F, -1.527F, -1.1393F, 1, 1, 2, 0.0F, false));

        this.eye = new AdvancedModelRenderer(this);
        this.eye.setRotationPoint(0.0F, 0.2748F, -1.338F);
        this.head.addChild(eye);
        this.eye.cubeList.add(new ModelBox(eye, 32, 48, 0.03F, -0.5F, -0.5F, 1, 1, 1, 0.01F, false));
        this.eye.cubeList.add(new ModelBox(eye, 49, 28, -1.03F, -0.5F, -0.5F, 1, 1, 1, 0.01F, false));

        this.flangeRight = new AdvancedModelRenderer(this);
        this.flangeRight.setRotationPoint(-2.1F, 0.0F, -0.9F);
        this.body2.addChild(flangeRight);
        this.flangeRight.cubeList.add(new ModelBox(flangeRight, 14, 50, -0.9F, -0.5F, -10.0F, 1, 1, 1, 0.0F, false));
        this.flangeRight.cubeList.add(new ModelBox(flangeRight, 29, 17, -1.9F, -0.5F, -9.0F, 2, 1, 9, 0.0F, false));
        this.flangeRight.cubeList.add(new ModelBox(flangeRight, 19, 50, -0.9F, -0.5F, 0.0F, 1, 1, 1, 0.0F, false));

        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(-1.9F, 0.0F, -1.4F);
        this.flangeRight.addChild(cube_r12);
        this.setRotateAngle(cube_r12, -1.0036F, 0.0F, 0.0F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 18, 43, -0.5F, -0.5F, 0.0F, 1, 1, 0, 0.0F, false));

        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(-2.4F, 0.0F, -3.5F);
        this.flangeRight.addChild(cube_r13);
        this.setRotateAngle(cube_r13, -1.0036F, 0.0F, 0.0F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 45, 51, -0.5F, -0.5F, 0.0F, 1, 1, 0, 0.0F, false));

        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(-2.4F, 0.0F, -5.5F);
        this.flangeRight.addChild(cube_r14);
        this.setRotateAngle(cube_r14, -1.0036F, 0.0F, 0.0F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 42, 51, -0.5F, -0.5F, 0.0F, 1, 1, 0, 0.0F, false));

        this.cube_r15 = new AdvancedModelRenderer(this);
        this.cube_r15.setRotationPoint(-2.0F, 0.0F, -7.5F);
        this.flangeRight.addChild(cube_r15);
        this.setRotateAngle(cube_r15, -1.0036F, 0.0F, 0.0F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 14, 48, -0.5F, -0.5F, 0.0F, 1, 1, 0, 0.0F, false));

        this.flangeLeft = new AdvancedModelRenderer(this);
        this.flangeLeft.setRotationPoint(2.1F, 0.0F, -0.9F);
        this.body2.addChild(flangeLeft);
        this.flangeLeft.cubeList.add(new ModelBox(flangeLeft, 49, 41, -0.1F, -0.5F, -10.0F, 1, 1, 1, 0.0F, false));
        this.flangeLeft.cubeList.add(new ModelBox(flangeLeft, 0, 29, -0.1F, -0.5F, -9.0F, 2, 1, 9, 0.0F, false));
        this.flangeLeft.cubeList.add(new ModelBox(flangeLeft, 24, 51, -0.1F, -0.5F, 0.0F, 1, 1, 1, 0.0F, false));

        this.cube_r16 = new AdvancedModelRenderer(this);
        this.cube_r16.setRotationPoint(1.9F, 0.0F, -1.4F);
        this.flangeLeft.addChild(cube_r16);
        this.setRotateAngle(cube_r16, -1.0036F, 0.0F, 0.0F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 31, 41, -0.5F, -0.5F, 0.0F, 1, 1, 0, 0.0F, false));

        this.cube_r17 = new AdvancedModelRenderer(this);
        this.cube_r17.setRotationPoint(2.4F, 0.0F, -3.5F);
        this.flangeLeft.addChild(cube_r17);
        this.setRotateAngle(cube_r17, -1.0036F, 0.0F, 0.0F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 39, 51, -0.5F, -0.5F, 0.0F, 1, 1, 0, 0.0F, false));

        this.cube_r18 = new AdvancedModelRenderer(this);
        this.cube_r18.setRotationPoint(2.4F, 0.0F, -5.5F);
        this.flangeLeft.addChild(cube_r18);
        this.setRotateAngle(cube_r18, -1.0036F, 0.0F, 0.0F);
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 37, 48, -0.5F, -0.5F, 0.0F, 1, 1, 0, 0.0F, false));

        this.cube_r19 = new AdvancedModelRenderer(this);
        this.cube_r19.setRotationPoint(2.0F, 0.0F, -7.5F);
        this.flangeLeft.addChild(cube_r19);
        this.setRotateAngle(cube_r19, -1.0036F, 0.0F, 0.0F);
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 45, 41, -0.5F, -0.5F, 0.0F, 1, 1, 0, 0.0F, false));

        this.leftArm = new AdvancedModelRenderer(this);
        this.leftArm.setRotationPoint(1.4228F, -0.4013F, -12.3441F);
        this.body2.addChild(leftArm);
        this.setRotateAngle(leftArm, 0.0846F, 0.2013F, 0.4013F);


        this.cube_r20 = new AdvancedModelRenderer(this);
        this.cube_r20.setRotationPoint(-0.0721F, 0.5389F, 0.2948F);
        this.leftArm.addChild(cube_r20);
        this.setRotateAngle(cube_r20, 0.0279F, -0.2882F, 0.4885F);
        this.cube_r20.cubeList.add(new ModelBox(cube_r20, 35, 12, -0.6F, -1.0F, -1.2F, 4, 1, 2, 0.0F, false));

        this.leftArm2 = new AdvancedModelRenderer(this);
        this.leftArm2.setRotationPoint(2.9506F, 1.5376F, 1.2507F);
        this.leftArm.addChild(leftArm2);


        this.cube_r21 = new AdvancedModelRenderer(this);
        this.cube_r21.setRotationPoint(0.2F, 0.0F, -0.2F);
        this.leftArm2.addChild(cube_r21);
        this.setRotateAngle(cube_r21, -1.4843F, 0.7448F, 0.6228F);
        this.cube_r21.cubeList.add(new ModelBox(cube_r21, 46, 6, -0.7F, -0.4F, -0.3F, 3, 1, 1, 0.0F, false));

        this.leftArm3 = new AdvancedModelRenderer(this);
        this.leftArm3.setRotationPoint(1.2201F, 1.2539F, -1.3419F);
        this.leftArm2.addChild(leftArm3);


        this.cube_r22 = new AdvancedModelRenderer(this);
        this.cube_r22.setRotationPoint(1.2834F, -0.2818F, -0.6627F);
        this.leftArm3.addChild(cube_r22);
        this.setRotateAngle(cube_r22, 0.3256F, -1.2319F, -0.6984F);
        this.cube_r22.cubeList.add(new ModelBox(cube_r22, 34, 39, -0.9989F, -0.1001F, -1.5055F, 2, 0, 3, 0.0F, false));

        this.rightArm = new AdvancedModelRenderer(this);
        this.rightArm.setRotationPoint(-1.4228F, -0.4013F, -12.3441F);
        this.body2.addChild(rightArm);
        this.setRotateAngle(rightArm, 0.0846F, -0.2013F, -0.4013F);


        this.cube_r23 = new AdvancedModelRenderer(this);
        this.cube_r23.setRotationPoint(0.0721F, 0.5389F, 0.2948F);
        this.rightArm.addChild(cube_r23);
        this.setRotateAngle(cube_r23, 0.0279F, 0.2882F, -0.4885F);
        this.cube_r23.cubeList.add(new ModelBox(cube_r23, 35, 12, -3.4F, -1.0F, -1.2F, 4, 1, 2, 0.0F, true));

        this.rightArm2 = new AdvancedModelRenderer(this);
        this.rightArm2.setRotationPoint(-2.9506F, 1.5376F, 1.2507F);
        this.rightArm.addChild(rightArm2);


        this.cube_r24 = new AdvancedModelRenderer(this);
        this.cube_r24.setRotationPoint(-0.2F, 0.0F, -0.2F);
        this.rightArm2.addChild(cube_r24);
        this.setRotateAngle(cube_r24, -1.4843F, -0.7448F, -0.6228F);
        this.cube_r24.cubeList.add(new ModelBox(cube_r24, 46, 6, -2.3F, -0.4F, -0.3F, 3, 1, 1, 0.0F, true));

        this.rightArm3 = new AdvancedModelRenderer(this);
        this.rightArm3.setRotationPoint(-1.2201F, 1.2539F, -1.3419F);
        this.rightArm2.addChild(rightArm3);


        this.cube_r25 = new AdvancedModelRenderer(this);
        this.cube_r25.setRotationPoint(-1.2834F, -0.2818F, -0.6627F);
        this.rightArm3.addChild(cube_r25);
        this.setRotateAngle(cube_r25, 0.3256F, 1.2319F, 0.6984F);
        this.cube_r25.cubeList.add(new ModelBox(cube_r25, 34, 39, -1.0011F, -0.1001F, -1.5055F, 2, 0, 3, 0.0F, true));

        this.leftLeg = new AdvancedModelRenderer(this);
        this.leftLeg.setRotationPoint(1.5F, 0.9182F, 7.9046F);
        this.main.addChild(leftLeg);
        this.setRotateAngle(leftLeg, 0.0F, 0.0F, -0.5236F);


        this.cube_r26 = new AdvancedModelRenderer(this);
        this.cube_r26.setRotationPoint(1.0463F, 0.9F, -0.3453F);
        this.leftLeg.addChild(cube_r26);
        this.setRotateAngle(cube_r26, 0.6545F, 0.48F, 0.3491F);
        this.cube_r26.cubeList.add(new ModelBox(cube_r26, 34, 35, -2.0F, -1.0F, -0.5F, 4, 2, 1, 0.0F, false));

        this.leftLeg2 = new AdvancedModelRenderer(this);
        this.leftLeg2.setRotationPoint(2.3213F, 1.1F, -1.2214F);
        this.leftLeg.addChild(leftLeg2);
        this.setRotateAngle(leftLeg2, -0.0599F, 0.4506F, 0.6202F);


        this.cube_r27 = new AdvancedModelRenderer(this);
        this.cube_r27.setRotationPoint(-0.2F, 0.0F, 0.2F);
        this.leftLeg2.addChild(cube_r27);
        this.setRotateAngle(cube_r27, -1.7879F, 0.8571F, -1.9663F);
        this.cube_r27.cubeList.add(new ModelBox(cube_r27, 11, 40, -3.919F, -0.2853F, -0.4544F, 4, 1, 1, 0.0F, false));

        this.leftLeg3 = new AdvancedModelRenderer(this);
        this.leftLeg3.setRotationPoint(0.9974F, 2.5F, 2.7845F);
        this.leftLeg2.addChild(leftLeg3);
        this.setRotateAngle(leftLeg3, 0.0F, -0.2618F, 0.0F);


        this.cube_r28 = new AdvancedModelRenderer(this);
        this.cube_r28.setRotationPoint(1.7F, 0.0F, -1.2F);
        this.leftLeg3.addChild(cube_r28);
        this.setRotateAngle(cube_r28, 0.0775F, 0.2218F, -0.0446F);
        this.cube_r28.cubeList.add(new ModelBox(cube_r28, 0, 40, -2.2458F, 0.0409F, -0.5581F, 3, 0, 2, 0.0F, false));

        this.rightLeg = new AdvancedModelRenderer(this);
        this.rightLeg.setRotationPoint(-1.5F, 0.9182F, 7.9046F);
        this.main.addChild(rightLeg);
        this.setRotateAngle(rightLeg, 0.0F, 0.0F, 0.5236F);


        this.cube_r29 = new AdvancedModelRenderer(this);
        this.cube_r29.setRotationPoint(-1.0463F, 0.9F, -0.3453F);
        this.rightLeg.addChild(cube_r29);
        this.setRotateAngle(cube_r29, 0.6545F, -0.48F, -0.3491F);
        this.cube_r29.cubeList.add(new ModelBox(cube_r29, 34, 35, -2.0F, -1.0F, -0.5F, 4, 2, 1, 0.0F, true));

        this.rightLeg2 = new AdvancedModelRenderer(this);
        this.rightLeg2.setRotationPoint(-2.3213F, 1.1F, -1.2214F);
        this.rightLeg.addChild(rightLeg2);
        this.setRotateAngle(rightLeg2, -0.0599F, -0.4506F, -0.6202F);


        this.cube_r30 = new AdvancedModelRenderer(this);
        this.cube_r30.setRotationPoint(0.2F, 0.0F, 0.2F);
        this.rightLeg2.addChild(cube_r30);
        this.setRotateAngle(cube_r30, -1.7879F, -0.8571F, 1.9663F);
        this.cube_r30.cubeList.add(new ModelBox(cube_r30, 11, 40, -0.081F, -0.2853F, -0.4544F, 4, 1, 1, 0.0F, true));

        this.rightLeg3 = new AdvancedModelRenderer(this);
        this.rightLeg3.setRotationPoint(-0.9974F, 2.5F, 2.7845F);
        this.rightLeg2.addChild(rightLeg3);
        this.setRotateAngle(rightLeg3, 0.0F, 0.2618F, 0.0F);


        this.cube_r31 = new AdvancedModelRenderer(this);
        this.cube_r31.setRotationPoint(-1.7F, 0.0F, -1.2F);
        this.rightLeg3.addChild(cube_r31);
        this.setRotateAngle(cube_r31, 0.0775F, -0.2218F, 0.0446F);
        this.cube_r31.cubeList.add(new ModelBox(cube_r31, 0, 40, -0.7542F, 0.0409F, -0.5581F, 3, 0, 2, 0.0F, true));

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
        this.main.offsetY = -0.4F;
        this.main.offsetX = 0.1F;
        this.main.offsetZ = 2.0F;
        this.main.rotateAngleY = (float)Math.toRadians(130);
        this.main.rotateAngleX = (float)Math.toRadians(0);
        this.main.rotateAngleZ = (float)Math.toRadians(0);
        this.main.scaleChildren = true;
        float scaler = 0.8F;
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
    public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
        super.setRotationAngles(f, f1, f2, f3, f4, f5, e);
        //this.resetToDefaultPose();

        EntityPrehistoricFloraEusaurosphargis entityEusaurosphargis = (EntityPrehistoricFloraEusaurosphargis) e;

        this.faceTarget(f3, f4, 12, neck);
        this.faceTarget(f3, f4, 12, neck2);
        this.faceTarget(f3, f4, 12, head);

        AdvancedModelRenderer[] Tail = {this.tail, this.tail2, this.tail3};
        AdvancedModelRenderer[] Neck = {this.neck, this.neck2, this.head};

        entityEusaurosphargis.tailBuffer.applyChainSwingBuffer(Tail);

        if (entityEusaurosphargis.getAnimation() == entityEusaurosphargis.LAY_ANIMATION) {
            this.chainSwing(Neck, 0.5F, 0.10F, 0.5, f2, 0.8F);
            this.chainWave(Neck, 0.5F * 2, -0.02F, 0.5F, f2, 0.8F);
        } else {
            if (!entityEusaurosphargis.isReallyInWater()) {

                if (f3 == 0.0F || !entityEusaurosphargis.getIsMoving()) {
                    this.chainWave(Tail, (0.15F * 0.35F), 0.125F * 0.15F, 0.2F, f2, 1F);
                    this.chainSwing(Tail, (0.15F * 0.35F) * 4F, 0.05F * 0.35F, 0.12F, f2, 1F);
                    return;
                }

                if (entityEusaurosphargis.getIsFast()) { //Running


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
        EntityPrehistoricFloraEusaurosphargis ee = (EntityPrehistoricFloraEusaurosphargis) entitylivingbaseIn;

        if (!ee.isReallyInWater()) {
            if (ee.getIsMoving()) {
                if (ee.getIsFast()) { //Running
                    animRunning(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
                } else { //Walking
                    animWalking(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
                }
            }
        } else {
            //Swimming pose:
            if (!ee.getIsMoving()) { //static in water
                //
            } else {
                //moving in water
                //
            }
        }
        if (ee.getAnimation() == ee.EAT_ANIMATION) {
            animEat(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        } else if (ee.getAnimation() == ee.IDLE2) {
            animBurrow(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        } else if (ee.getAnimation() == ee.IDLE1) {
            animIdle(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }

    }

    public void animIdle(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraEusaurosphargis entity = (EntityPrehistoricFloraEusaurosphargis) entitylivingbaseIn;
        int animCycle = 15;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 7) {
            xx = 1 + (((tickAnim - 0) / 7) * (1-(1)));
            yy = 1 + (((tickAnim - 0) / 7) * (0.015-(1)));
            zz = 1 + (((tickAnim - 0) / 7) * (1-(1)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = 1 + (((tickAnim - 7) / 1) * (1-(1)));
            yy = 0.015 + (((tickAnim - 7) / 1) * (0.015-(0.015)));
            zz = 1 + (((tickAnim - 7) / 1) * (1-(1)));
        }
        else if (tickAnim >= 8 && tickAnim < 15) {
            xx = 1 + (((tickAnim - 8) / 7) * (1-(1)));
            yy = 0.015 + (((tickAnim - 8) / 7) * (1-(0.015)));
            zz = 1 + (((tickAnim - 8) / 7) * (1-(1)));
        }
        else {
            xx = 1;
            yy = 1;
            zz = 1;
        }
        this.eye.setScale((float)xx, (float)yy, (float)zz);


    }
    public void animBurrow(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraEusaurosphargis entity = (EntityPrehistoricFloraEusaurosphargis) entitylivingbaseIn;
        int animCycle = 760;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (2-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = 2 + (((tickAnim - 15) / 20) * (4-(2)));
            yy = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 750) {
            xx = 4 + (((tickAnim - 35) / 715) * (4-(4)));
            yy = 0 + (((tickAnim - 35) / 715) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 715) * (0-(0)));
        }
        else if (tickAnim >= 750 && tickAnim < 755) {
            xx = 4 + (((tickAnim - 750) / 5) * (-11-(4)));
            yy = 0 + (((tickAnim - 750) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 750) / 5) * (0-(0)));
        }
        else if (tickAnim >= 755 && tickAnim < 760) {
            xx = -11 + (((tickAnim - 755) / 5) * (0-(-11)));
            yy = 0 + (((tickAnim - 755) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 755) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(main, main.rotateAngleX + (float) Math.toRadians(xx), main.rotateAngleY + (float) Math.toRadians(yy), main.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (-1.7-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 15) / 10) * (0-(0)));
            yy = -1.7 + (((tickAnim - 15) / 10) * (-3.15-(-1.7)));
            zz = 0 + (((tickAnim - 15) / 10) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 25) / 10) * (0-(0)));
            yy = -3.15 + (((tickAnim - 25) / 10) * (-4.445-(-3.15)));
            zz = 0 + (((tickAnim - 25) / 10) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 750) {
            xx = 0 + (((tickAnim - 35) / 715) * (0-(0)));
            yy = -4.445 + (((tickAnim - 35) / 715) * (-4.445-(-4.445)));
            zz = 0 + (((tickAnim - 35) / 715) * (0-(0)));
        }
        else if (tickAnim >= 750 && tickAnim < 760) {
            xx = 0 + (((tickAnim - 750) / 10) * (0-(0)));
            yy = -4.445 + (((tickAnim - 750) / 10) * (0-(-4.445)));
            zz = 0 + (((tickAnim - 750) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.main.rotationPointX = this.main.rotationPointX + (float)(xx);
        this.main.rotationPointY = this.main.rotationPointY - (float)(yy);
        this.main.rotationPointZ = this.main.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (38.69708-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (-16.60623-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (2.15637-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 18) {
            xx = 38.69708 + (((tickAnim - 15) / 3) * (48.86034-(38.69708)));
            yy = -16.60623 + (((tickAnim - 15) / 3) * (-11.03013-(-16.60623)));
            zz = 2.15637 + (((tickAnim - 15) / 3) * (-4.79121-(2.15637)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = 48.86034 + (((tickAnim - 18) / 2) * (38.69708-(48.86034)));
            yy = -11.03013 + (((tickAnim - 18) / 2) * (-16.60623-(-11.03013)));
            zz = -4.79121 + (((tickAnim - 18) / 2) * (2.15637-(-4.79121)));
        }
        else if (tickAnim >= 20 && tickAnim < 23) {
            xx = 38.69708 + (((tickAnim - 20) / 3) * (48.86034-(38.69708)));
            yy = -16.60623 + (((tickAnim - 20) / 3) * (-11.03013-(-16.60623)));
            zz = 2.15637 + (((tickAnim - 20) / 3) * (-4.79121-(2.15637)));
        }
        else if (tickAnim >= 23 && tickAnim < 25) {
            xx = 48.86034 + (((tickAnim - 23) / 2) * (38.69708-(48.86034)));
            yy = -11.03013 + (((tickAnim - 23) / 2) * (-16.60623-(-11.03013)));
            zz = -4.79121 + (((tickAnim - 23) / 2) * (2.15637-(-4.79121)));
        }
        else if (tickAnim >= 25 && tickAnim < 35) {
            xx = 38.69708 + (((tickAnim - 25) / 10) * (38.69708-(38.69708)));
            yy = -16.60623 + (((tickAnim - 25) / 10) * (-16.60623-(-16.60623)));
            zz = 2.15637 + (((tickAnim - 25) / 10) * (2.15637-(2.15637)));
        }
        else if (tickAnim >= 35 && tickAnim < 750) {
            xx = 38.69708 + (((tickAnim - 35) / 715) * (38.69708-(38.69708)));
            yy = -16.60623 + (((tickAnim - 35) / 715) * (-16.60623-(-16.60623)));
            zz = 2.15637 + (((tickAnim - 35) / 715) * (2.15637-(2.15637)));
        }
        else if (tickAnim >= 750 && tickAnim < 760) {
            xx = 38.69708 + (((tickAnim - 750) / 10) * (0-(38.69708)));
            yy = -16.60623 + (((tickAnim - 750) / 10) * (0-(-16.60623)));
            zz = 2.15637 + (((tickAnim - 750) / 10) * (0-(2.15637)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg, rightLeg.rotateAngleX + (float) Math.toRadians(xx), rightLeg.rotateAngleY + (float) Math.toRadians(yy), rightLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 0) / 35) * (-40.29141-(0)));
            yy = 0 + (((tickAnim - 0) / 35) * (-2.72672-(0)));
            zz = 0 + (((tickAnim - 0) / 35) * (-3.35495-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 750) {
            xx = -40.29141 + (((tickAnim - 35) / 715) * (-40.29141-(-40.29141)));
            yy = -2.72672 + (((tickAnim - 35) / 715) * (-2.72672-(-2.72672)));
            zz = -3.35495 + (((tickAnim - 35) / 715) * (-3.35495-(-3.35495)));
        }
        else if (tickAnim >= 750 && tickAnim < 760) {
            xx = -40.29141 + (((tickAnim - 750) / 10) * (0-(-40.29141)));
            yy = -2.72672 + (((tickAnim - 750) / 10) * (0-(-2.72672)));
            zz = -3.35495 + (((tickAnim - 750) / 10) * (0-(-3.35495)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg3, rightLeg3.rotateAngleX + (float) Math.toRadians(xx), rightLeg3.rotateAngleY + (float) Math.toRadians(yy), rightLeg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 0) / 35) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 35) * (0.325-(0)));
            zz = 0 + (((tickAnim - 0) / 35) * (0.275-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 750) {
            xx = 0 + (((tickAnim - 35) / 715) * (0-(0)));
            yy = 0.325 + (((tickAnim - 35) / 715) * (0.325-(0.325)));
            zz = 0.275 + (((tickAnim - 35) / 715) * (0.275-(0.275)));
        }
        else if (tickAnim >= 750 && tickAnim < 760) {
            xx = 0 + (((tickAnim - 750) / 10) * (0-(0)));
            yy = 0.325 + (((tickAnim - 750) / 10) * (0-(0.325)));
            zz = 0.275 + (((tickAnim - 750) / 10) * (0-(0.275)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightLeg3.rotationPointX = this.rightLeg3.rotationPointX + (float)(xx);
        this.rightLeg3.rotationPointY = this.rightLeg3.rotationPointY - (float)(yy);
        this.rightLeg3.rotationPointZ = this.rightLeg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 750) {
            xx = 0 + (((tickAnim - 0) / 750) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 750) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 750) * (0-(0)));
        }
        else if (tickAnim >= 750 && tickAnim < 755) {
            xx = 0 + (((tickAnim - 750) / 5) * (-3.75-(0)));
            yy = 0 + (((tickAnim - 750) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 750) / 5) * (0-(0)));
        }
        else if (tickAnim >= 755 && tickAnim < 760) {
            xx = -3.75 + (((tickAnim - 755) / 5) * (0-(-3.75)));
            yy = 0 + (((tickAnim - 755) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 755) / 5) * (0-(0)));
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



        if (tickAnim >= 0 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 0) / 35) * (-6-(0)));
            yy = 0 + (((tickAnim - 0) / 35) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 35) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 750) {
            xx = -6 + (((tickAnim - 35) / 715) * (-6-(-6)));
            yy = 0 + (((tickAnim - 35) / 715) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 715) * (0-(0)));
        }
        else if (tickAnim >= 750 && tickAnim < 760) {
            xx = -6 + (((tickAnim - 750) / 10) * (0-(-6)));
            yy = 0 + (((tickAnim - 750) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 750) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail, tail.rotateAngleX + (float) Math.toRadians(xx), tail.rotateAngleY + (float) Math.toRadians(yy), tail.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 0) / 35) * (9.75-(0)));
            yy = 0 + (((tickAnim - 0) / 35) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 35) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 750) {
            xx = 9.75 + (((tickAnim - 35) / 715) * (9.75-(9.75)));
            yy = 0 + (((tickAnim - 35) / 715) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 715) * (0-(0)));
        }
        else if (tickAnim >= 750 && tickAnim < 760) {
            xx = 9.75 + (((tickAnim - 750) / 10) * (0-(9.75)));
            yy = 0 + (((tickAnim - 750) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 750) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(xx), tail2.rotateAngleY + (float) Math.toRadians(yy), tail2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 0) / 35) * (16.5-(0)));
            yy = 0 + (((tickAnim - 0) / 35) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 35) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 750) {
            xx = 16.5 + (((tickAnim - 35) / 715) * (16.5-(16.5)));
            yy = 0 + (((tickAnim - 35) / 715) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 715) * (0-(0)));
        }
        else if (tickAnim >= 750 && tickAnim < 760) {
            xx = 16.5 + (((tickAnim - 750) / 10) * (0-(16.5)));
            yy = 0 + (((tickAnim - 750) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 750) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(xx), tail3.rotateAngleY + (float) Math.toRadians(yy), tail3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = -0-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-4 + (((tickAnim - 0) / 15) * (2.25-(-0-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-4)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 18) {
            xx = 2.25 + (((tickAnim - 15) / 3) * (2.24638-(2.25)));
            yy = 0 + (((tickAnim - 15) / 3) * (-0.12753-(0)));
            zz = 0 + (((tickAnim - 15) / 3) * (3.2475-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = 2.24638 + (((tickAnim - 18) / 2) * (2.25-(2.24638)));
            yy = -0.12753 + (((tickAnim - 18) / 2) * (0-(-0.12753)));
            zz = 3.2475 + (((tickAnim - 18) / 2) * (0-(3.2475)));
        }
        else if (tickAnim >= 20 && tickAnim < 23) {
            xx = 2.25 + (((tickAnim - 20) / 3) * (2.24638-(2.25)));
            yy = 0 + (((tickAnim - 20) / 3) * (-0.12753-(0)));
            zz = 0 + (((tickAnim - 20) / 3) * (3.2475-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 25) {
            xx = 2.24638 + (((tickAnim - 23) / 2) * (2.25-(2.24638)));
            yy = -0.12753 + (((tickAnim - 23) / 2) * (0-(-0.12753)));
            zz = 3.2475 + (((tickAnim - 23) / 2) * (0-(3.2475)));
        }
        else if (tickAnim >= 25 && tickAnim < 28) {
            xx = 2.25 + (((tickAnim - 25) / 3) * (2.24638-(2.25)));
            yy = 0 + (((tickAnim - 25) / 3) * (0.12753-(0)));
            zz = 0 + (((tickAnim - 25) / 3) * (-3.2475-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 30) {
            xx = 2.24638 + (((tickAnim - 28) / 2) * (2.25-(2.24638)));
            yy = 0.12753 + (((tickAnim - 28) / 2) * (0-(0.12753)));
            zz = -3.2475 + (((tickAnim - 28) / 2) * (0-(-3.2475)));
        }
        else if (tickAnim >= 30 && tickAnim < 33) {
            xx = 2.25 + (((tickAnim - 30) / 3) * (2.24638-(2.25)));
            yy = 0 + (((tickAnim - 30) / 3) * (0.12753-(0)));
            zz = 0 + (((tickAnim - 30) / 3) * (-3.2475-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 35) {
            xx = 2.24638 + (((tickAnim - 33) / 2) * (2.75-(2.24638)));
            yy = 0.12753 + (((tickAnim - 33) / 2) * (0-(0.12753)));
            zz = -3.2475 + (((tickAnim - 33) / 2) * (0-(-3.2475)));
        }
        else if (tickAnim >= 35 && tickAnim < 750) {
            xx = 2.75 + (((tickAnim - 35) / 715) * (2.75-(2.75)));
            yy = 0 + (((tickAnim - 35) / 715) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 715) * (0-(0)));
        }
        else if (tickAnim >= 750 && tickAnim < 760) {
            xx = 2.75 + (((tickAnim - 750) / 10) * (0-(2.75)));
            yy = 0 + (((tickAnim - 750) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 750) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body2, body2.rotateAngleX + (float) Math.toRadians(xx), body2.rotateAngleY + (float) Math.toRadians(yy), body2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (30.25-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 25) {
            xx = 30.25 + (((tickAnim - 15) / 10) * (24.75-(30.25)));
            yy = 0 + (((tickAnim - 15) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 10) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 35) {
            xx = 24.75 + (((tickAnim - 25) / 10) * (15.5-(24.75)));
            yy = 0 + (((tickAnim - 25) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 10) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 750) {
            xx = 15.5 + (((tickAnim - 35) / 715) * (15.5-(15.5)));
            yy = 0 + (((tickAnim - 35) / 715) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 715) * (0-(0)));
        }
        else if (tickAnim >= 750 && tickAnim < 755) {
            xx = 15.5 + (((tickAnim - 750) / 5) * (0-(15.5)));
            yy = 0 + (((tickAnim - 750) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 750) / 5) * (0-(0)));
        }
        else if (tickAnim >= 755 && tickAnim < 760) {
            xx = 0 + (((tickAnim - 755) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 755) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 755) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(xx), neck.rotateAngleY + (float) Math.toRadians(yy), neck.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (-4-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 25) {
            xx = -4 + (((tickAnim - 15) / 10) * (-16.25-(-4)));
            yy = 0 + (((tickAnim - 15) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 10) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 35) {
            xx = -16.25 + (((tickAnim - 25) / 10) * (-20.25-(-16.25)));
            yy = 0 + (((tickAnim - 25) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 10) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 750) {
            xx = -20.25 + (((tickAnim - 35) / 715) * (-20.25-(-20.25)));
            yy = 0 + (((tickAnim - 35) / 715) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 715) * (0-(0)));
        }
        else if (tickAnim >= 750 && tickAnim < 755) {
            xx = -20.25 + (((tickAnim - 750) / 5) * (0-(-20.25)));
            yy = 0 + (((tickAnim - 750) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 750) / 5) * (0-(0)));
        }
        else if (tickAnim >= 755 && tickAnim < 760) {
            xx = 0 + (((tickAnim - 755) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 755) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 755) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(xx), neck2.rotateAngleY + (float) Math.toRadians(yy), neck2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (-25.25-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = -25.25 + (((tickAnim - 15) / 20) * (-32-(-25.25)));
            yy = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 750) {
            xx = -32 + (((tickAnim - 35) / 715) * (-32-(-32)));
            yy = 0 + (((tickAnim - 35) / 715) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 715) * (0-(0)));
        }
        else if (tickAnim >= 750 && tickAnim < 755) {
            xx = -32 + (((tickAnim - 750) / 5) * (0-(-32)));
            yy = 0 + (((tickAnim - 750) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 750) / 5) * (0-(0)));
        }
        else if (tickAnim >= 755 && tickAnim < 760) {
            xx = 0 + (((tickAnim - 755) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 755) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 755) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0.325-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            zz = 0.325 + (((tickAnim - 15) / 20) * (0.325-(0.325)));
        }
        else if (tickAnim >= 35 && tickAnim < 750) {
            xx = 0 + (((tickAnim - 35) / 715) * (0-(0)));
            yy = 0 + (((tickAnim - 35) / 715) * (0-(0)));
            zz = 0.325 + (((tickAnim - 35) / 715) * (0.325-(0.325)));
        }
        else if (tickAnim >= 750 && tickAnim < 760) {
            xx = 0 + (((tickAnim - 750) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 750) / 10) * (0-(0)));
            zz = 0.325 + (((tickAnim - 750) / 10) * (0-(0.325)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.head.rotationPointX = this.head.rotationPointX + (float)(xx);
        this.head.rotationPointY = this.head.rotationPointY - (float)(yy);
        this.head.rotationPointZ = this.head.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = -0-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*10 + (((tickAnim - 0) / 15) * (0-(-0-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*10)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-15 + (((tickAnim - 0) / 15) * (-36.25-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-15)));
        }
        else if (tickAnim >= 15 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 15) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 15) / 3) * (0-(0)));
            zz = -36.25 + (((tickAnim - 15) / 3) * (-41.94-(-36.25)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 18) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 18) / 2) * (0-(0)));
            zz = -41.94 + (((tickAnim - 18) / 2) * (-37.25-(-41.94)));
        }
        else if (tickAnim >= 20 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 20) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 20) / 3) * (0-(0)));
            zz = -37.25 + (((tickAnim - 20) / 3) * (-41.94-(-37.25)));
        }
        else if (tickAnim >= 23 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 23) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 23) / 2) * (0-(0)));
            zz = -41.94 + (((tickAnim - 23) / 2) * (-38.75-(-41.94)));
        }
        else if (tickAnim >= 25 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 25) / 3) * (47.28812-(0)));
            yy = 0 + (((tickAnim - 25) / 3) * (-16.85362-(0)));
            zz = -38.75 + (((tickAnim - 25) / 3) * (-32.5926-(-38.75)));
        }
        else if (tickAnim >= 28 && tickAnim < 30) {
            xx = 47.28812 + (((tickAnim - 28) / 2) * (0-(47.28812)));
            yy = -16.85362 + (((tickAnim - 28) / 2) * (0-(-16.85362)));
            zz = -32.5926 + (((tickAnim - 28) / 2) * (-41.75-(-32.5926)));
        }
        else if (tickAnim >= 30 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 30) / 3) * (45.69909-(0)));
            yy = 0 + (((tickAnim - 30) / 3) * (-9.9695-(0)));
            zz = -41.75 + (((tickAnim - 30) / 3) * (-36.49892-(-41.75)));
        }
        else if (tickAnim >= 33 && tickAnim < 35) {
            xx = 45.69909 + (((tickAnim - 33) / 2) * (0-(45.69909)));
            yy = -9.9695 + (((tickAnim - 33) / 2) * (0-(-9.9695)));
            zz = -36.49892 + (((tickAnim - 33) / 2) * (-28.75-(-36.49892)));
        }
        else if (tickAnim >= 35 && tickAnim < 750) {
            xx = 0 + (((tickAnim - 35) / 715) * (0-(0)));
            yy = 0 + (((tickAnim - 35) / 715) * (0-(0)));
            zz = -28.75 + (((tickAnim - 35) / 715) * (-28.75-(-28.75)));
        }
        else if (tickAnim >= 750 && tickAnim < 755) {
            xx = 0 + (((tickAnim - 750) / 5) * (13.68274-(0)));
            yy = 0 + (((tickAnim - 750) / 5) * (1.29886-(0)));
            zz = -28.75 + (((tickAnim - 750) / 5) * (-15.37056-(-28.75)));
        }
        else if (tickAnim >= 755 && tickAnim < 760) {
            xx = 13.68274 + (((tickAnim - 755) / 5) * (0-(13.68274)));
            yy = 1.29886 + (((tickAnim - 755) / 5) * (0-(1.29886)));
            zz = -15.37056 + (((tickAnim - 755) / 5) * (0-(-15.37056)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm, leftArm.rotateAngleX + (float) Math.toRadians(xx), leftArm.rotateAngleY + (float) Math.toRadians(yy), leftArm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (-9.5-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 15) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 15) / 10) * (0-(0)));
            zz = -9.5 + (((tickAnim - 15) / 10) * (-8.75-(-9.5)));
        }
        else if (tickAnim >= 25 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 25) / 3) * (26.75-(0)));
            yy = 0 + (((tickAnim - 25) / 3) * (-24-(0)));
            zz = -8.75 + (((tickAnim - 25) / 3) * (0-(-8.75)));
        }
        else if (tickAnim >= 28 && tickAnim < 28) {
            xx = 26.75 + (((tickAnim - 28) / 0) * (-0.51114-(26.75)));
            yy = -24 + (((tickAnim - 28) / 0) * (-19.01089-(-24)));
            zz = 0 + (((tickAnim - 28) / 0) * (-32.13235-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 30) {
            xx = -0.51114 + (((tickAnim - 28) / 2) * (0-(-0.51114)));
            yy = -19.01089 + (((tickAnim - 28) / 2) * (0-(-19.01089)));
            zz = -32.13235 + (((tickAnim - 28) / 2) * (-8.75-(-32.13235)));
        }
        else if (tickAnim >= 30 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 30) / 3) * (26.75-(0)));
            yy = 0 + (((tickAnim - 30) / 3) * (-24-(0)));
            zz = -8.75 + (((tickAnim - 30) / 3) * (0-(-8.75)));
        }
        else if (tickAnim >= 33 && tickAnim < 33) {
            xx = 26.75 + (((tickAnim - 33) / 0) * (-0.51114-(26.75)));
            yy = -24 + (((tickAnim - 33) / 0) * (-19.01089-(-24)));
            zz = 0 + (((tickAnim - 33) / 0) * (-32.13235-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 35) {
            xx = -0.51114 + (((tickAnim - 33) / 2) * (0-(-0.51114)));
            yy = -19.01089 + (((tickAnim - 33) / 2) * (0-(-19.01089)));
            zz = -32.13235 + (((tickAnim - 33) / 2) * (-8.75-(-32.13235)));
        }
        else if (tickAnim >= 35 && tickAnim < 750) {
            xx = 0 + (((tickAnim - 35) / 715) * (0-(0)));
            yy = 0 + (((tickAnim - 35) / 715) * (0-(0)));
            zz = -8.75 + (((tickAnim - 35) / 715) * (-8.75-(-8.75)));
        }
        else if (tickAnim >= 750 && tickAnim < 760) {
            xx = 0 + (((tickAnim - 750) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 750) / 10) * (0-(0)));
            zz = -8.75 + (((tickAnim - 750) / 10) * (0-(-8.75)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm2, leftArm2.rotateAngleX + (float) Math.toRadians(xx), leftArm2.rotateAngleY + (float) Math.toRadians(yy), leftArm2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (1.86306-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (27.70018-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (47.66759-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 25) {
            xx = 1.86306 + (((tickAnim - 15) / 10) * (-3.02103-(1.86306)));
            yy = 27.70018 + (((tickAnim - 15) / 10) * (31.09088-(27.70018)));
            zz = 47.66759 + (((tickAnim - 15) / 10) * (41.80443-(47.66759)));
        }
        else if (tickAnim >= 25 && tickAnim < 26) {
            xx = -3.02103 + (((tickAnim - 25) / 1) * (-17.24646-(-3.02103)));
            yy = 31.09088 + (((tickAnim - 25) / 1) * (42.32111-(31.09088)));
            zz = 41.80443 + (((tickAnim - 25) / 1) * (29.67545-(41.80443)));
        }
        else if (tickAnim >= 26 && tickAnim < 28) {
            xx = -17.24646 + (((tickAnim - 26) / 2) * (24.72376-(-17.24646)));
            yy = 42.32111 + (((tickAnim - 26) / 2) * (5.29746-(42.32111)));
            zz = 29.67545 + (((tickAnim - 26) / 2) * (78.66181-(29.67545)));
        }
        else if (tickAnim >= 28 && tickAnim < 30) {
            xx = 24.72376 + (((tickAnim - 28) / 2) * (-3.02103-(24.72376)));
            yy = 5.29746 + (((tickAnim - 28) / 2) * (31.09088-(5.29746)));
            zz = 78.66181 + (((tickAnim - 28) / 2) * (41.80443-(78.66181)));
        }
        else if (tickAnim >= 30 && tickAnim < 31) {
            xx = -3.02103 + (((tickAnim - 30) / 1) * (-17.24646-(-3.02103)));
            yy = 31.09088 + (((tickAnim - 30) / 1) * (42.32111-(31.09088)));
            zz = 41.80443 + (((tickAnim - 30) / 1) * (29.67545-(41.80443)));
        }
        else if (tickAnim >= 31 && tickAnim < 33) {
            xx = -17.24646 + (((tickAnim - 31) / 2) * (24.72376-(-17.24646)));
            yy = 42.32111 + (((tickAnim - 31) / 2) * (5.29746-(42.32111)));
            zz = 29.67545 + (((tickAnim - 31) / 2) * (78.66181-(29.67545)));
        }
        else if (tickAnim >= 33 && tickAnim < 35) {
            xx = 24.72376 + (((tickAnim - 33) / 2) * (-3.02103-(24.72376)));
            yy = 5.29746 + (((tickAnim - 33) / 2) * (31.09088-(5.29746)));
            zz = 78.66181 + (((tickAnim - 33) / 2) * (41.80443-(78.66181)));
        }
        else if (tickAnim >= 35 && tickAnim < 750) {
            xx = -3.02103 + (((tickAnim - 35) / 715) * (-3.02103-(-3.02103)));
            yy = 31.09088 + (((tickAnim - 35) / 715) * (31.09088-(31.09088)));
            zz = 41.80443 + (((tickAnim - 35) / 715) * (41.80443-(41.80443)));
        }
        else if (tickAnim >= 750 && tickAnim < 760) {
            xx = -3.02103 + (((tickAnim - 750) / 10) * (0-(-3.02103)));
            yy = 31.09088 + (((tickAnim - 750) / 10) * (0-(31.09088)));
            zz = 41.80443 + (((tickAnim - 750) / 10) * (0-(41.80443)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm3, leftArm3.rotateAngleX + (float) Math.toRadians(xx), leftArm3.rotateAngleY + (float) Math.toRadians(yy), leftArm3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (0.125-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 7) / 8) * (0-(0)));
            yy = 0.125 + (((tickAnim - 7) / 8) * (0-(0.125)));
            zz = 0 + (((tickAnim - 7) / 8) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 15) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 15) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 10) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 25) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 25) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 5) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 30) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 30) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 5) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 750) {
            xx = 0 + (((tickAnim - 35) / 715) * (0-(0)));
            yy = 0 + (((tickAnim - 35) / 715) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 715) * (0-(0)));
        }
        else if (tickAnim >= 750 && tickAnim < 760) {
            xx = 0 + (((tickAnim - 750) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 750) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 750) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftArm3.rotationPointX = this.leftArm3.rotationPointX + (float)(xx);
        this.leftArm3.rotationPointY = this.leftArm3.rotationPointY - (float)(yy);
        this.leftArm3.rotationPointZ = this.leftArm3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (38.69708-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (16.60623-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (-2.15637-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 25) {
            xx = 38.69708 + (((tickAnim - 15) / 10) * (36.34691-(38.69708)));
            yy = 16.60623 + (((tickAnim - 15) / 10) * (15.9129-(16.60623)));
            zz = -2.15637 + (((tickAnim - 15) / 10) * (-11.89494-(-2.15637)));
        }
        else if (tickAnim >= 25 && tickAnim < 28) {
            xx = 36.34691 + (((tickAnim - 25) / 3) * (51.05171-(36.34691)));
            yy = 15.9129 + (((tickAnim - 25) / 3) * (3.19224-(15.9129)));
            zz = -11.89494 + (((tickAnim - 25) / 3) * (-6.18622-(-11.89494)));
        }
        else if (tickAnim >= 28 && tickAnim < 30) {
            xx = 51.05171 + (((tickAnim - 28) / 2) * (36.34691-(51.05171)));
            yy = 3.19224 + (((tickAnim - 28) / 2) * (15.9129-(3.19224)));
            zz = -6.18622 + (((tickAnim - 28) / 2) * (-11.89494-(-6.18622)));
        }
        else if (tickAnim >= 30 && tickAnim < 33) {
            xx = 36.34691 + (((tickAnim - 30) / 3) * (51.05171-(36.34691)));
            yy = 15.9129 + (((tickAnim - 30) / 3) * (3.19224-(15.9129)));
            zz = -11.89494 + (((tickAnim - 30) / 3) * (-6.18622-(-11.89494)));
        }
        else if (tickAnim >= 33 && tickAnim < 35) {
            xx = 51.05171 + (((tickAnim - 33) / 2) * (36.34691-(51.05171)));
            yy = 3.19224 + (((tickAnim - 33) / 2) * (15.9129-(3.19224)));
            zz = -6.18622 + (((tickAnim - 33) / 2) * (-11.89494-(-6.18622)));
        }
        else if (tickAnim >= 35 && tickAnim < 750) {
            xx = 36.34691 + (((tickAnim - 35) / 715) * (36.34691-(36.34691)));
            yy = 15.9129 + (((tickAnim - 35) / 715) * (15.9129-(15.9129)));
            zz = -11.89494 + (((tickAnim - 35) / 715) * (-11.89494-(-11.89494)));
        }
        else if (tickAnim >= 750 && tickAnim < 760) {
            xx = 36.34691 + (((tickAnim - 750) / 10) * (0-(36.34691)));
            yy = 15.9129 + (((tickAnim - 750) / 10) * (0-(15.9129)));
            zz = -11.89494 + (((tickAnim - 750) / 10) * (0-(-11.89494)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg, leftLeg.rotateAngleX + (float) Math.toRadians(xx), leftLeg.rotateAngleY + (float) Math.toRadians(yy), leftLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = -0-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*10 + (((tickAnim - 0) / 15) * (0-(-0-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*10)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*15 + (((tickAnim - 0) / 15) * (42-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*15)));
        }
        else if (tickAnim >= 15 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 15) / 3) * (46.57731-(0)));
            yy = 0 + (((tickAnim - 15) / 3) * (3.16821-(0)));
            zz = 42 + (((tickAnim - 15) / 3) * (37.02002-(42)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = 46.57731 + (((tickAnim - 18) / 2) * (0-(46.57731)));
            yy = 3.16821 + (((tickAnim - 18) / 2) * (0-(3.16821)));
            zz = 37.02002 + (((tickAnim - 18) / 2) * (42-(37.02002)));
        }
        else if (tickAnim >= 20 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 20) / 3) * (46.57731-(0)));
            yy = 0 + (((tickAnim - 20) / 3) * (3.16821-(0)));
            zz = 42 + (((tickAnim - 20) / 3) * (37.02002-(42)));
        }
        else if (tickAnim >= 23 && tickAnim < 25) {
            xx = 46.57731 + (((tickAnim - 23) / 2) * (0-(46.57731)));
            yy = 3.16821 + (((tickAnim - 23) / 2) * (0-(3.16821)));
            zz = 37.02002 + (((tickAnim - 23) / 2) * (42-(37.02002)));
        }
        else if (tickAnim >= 25 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 25) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 25) / 3) * (0-(0)));
            zz = 42 + (((tickAnim - 25) / 3) * (48-(42)));
        }
        else if (tickAnim >= 28 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 28) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 28) / 2) * (0-(0)));
            zz = 48 + (((tickAnim - 28) / 2) * (45-(48)));
        }
        else if (tickAnim >= 30 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 30) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 30) / 3) * (0-(0)));
            zz = 45 + (((tickAnim - 30) / 3) * (50.75-(45)));
        }
        else if (tickAnim >= 33 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 33) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 33) / 2) * (0-(0)));
            zz = 50.75 + (((tickAnim - 33) / 2) * (40-(50.75)));
        }
        else if (tickAnim >= 35 && tickAnim < 750) {
            xx = 0 + (((tickAnim - 35) / 715) * (0-(0)));
            yy = 0 + (((tickAnim - 35) / 715) * (0-(0)));
            zz = 40 + (((tickAnim - 35) / 715) * (40-(40)));
        }
        else if (tickAnim >= 750 && tickAnim < 755) {
            xx = 0 + (((tickAnim - 750) / 5) * (13.68274-(0)));
            yy = 0 + (((tickAnim - 750) / 5) * (-1.29886-(0)));
            zz = 40 + (((tickAnim - 750) / 5) * (15.37056-(40)));
        }
        else if (tickAnim >= 755 && tickAnim < 760) {
            xx = 13.68274 + (((tickAnim - 755) / 5) * (0-(13.68274)));
            yy = -1.29886 + (((tickAnim - 755) / 5) * (0-(-1.29886)));
            zz = 15.37056 + (((tickAnim - 755) / 5) * (0-(15.37056)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm, rightArm.rotateAngleX + (float) Math.toRadians(xx), rightArm.rotateAngleY + (float) Math.toRadians(yy), rightArm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 15) / 3) * (26.75-(0)));
            yy = 0 + (((tickAnim - 15) / 3) * (24-(0)));
            zz = 0 + (((tickAnim - 15) / 3) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 18) {
            xx = 26.75 + (((tickAnim - 18) / 0) * (-0.51114-(26.75)));
            yy = 24 + (((tickAnim - 18) / 0) * (19.01089-(24)));
            zz = 0 + (((tickAnim - 18) / 0) * (32.13235-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = -0.51114 + (((tickAnim - 18) / 2) * (0-(-0.51114)));
            yy = 19.01089 + (((tickAnim - 18) / 2) * (0-(19.01089)));
            zz = 32.13235 + (((tickAnim - 18) / 2) * (0-(32.13235)));
        }
        else if (tickAnim >= 20 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 20) / 3) * (26.75-(0)));
            yy = 0 + (((tickAnim - 20) / 3) * (24-(0)));
            zz = 0 + (((tickAnim - 20) / 3) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 23) {
            xx = 26.75 + (((tickAnim - 23) / 0) * (-0.51114-(26.75)));
            yy = 24 + (((tickAnim - 23) / 0) * (19.01089-(24)));
            zz = 0 + (((tickAnim - 23) / 0) * (32.13235-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 25) {
            xx = -0.51114 + (((tickAnim - 23) / 2) * (0-(-0.51114)));
            yy = 19.01089 + (((tickAnim - 23) / 2) * (0-(19.01089)));
            zz = 32.13235 + (((tickAnim - 23) / 2) * (0-(32.13235)));
        }
        else if (tickAnim >= 25 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 25) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 25) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 10) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 750) {
            xx = 0 + (((tickAnim - 35) / 715) * (0-(0)));
            yy = 0 + (((tickAnim - 35) / 715) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 715) * (0-(0)));
        }
        else if (tickAnim >= 750 && tickAnim < 760) {
            xx = 0 + (((tickAnim - 750) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 750) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 750) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm2, rightArm2.rotateAngleX + (float) Math.toRadians(xx), rightArm2.rotateAngleY + (float) Math.toRadians(yy), rightArm2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (-4.80043-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (-12.42453-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (-21.08336-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 15) {
            xx = -4.80043 + (((tickAnim - 8) / 7) * (5.39913-(-4.80043)));
            yy = -12.42453 + (((tickAnim - 8) / 7) * (-24.84906-(-12.42453)));
            zz = -21.08336 + (((tickAnim - 8) / 7) * (-42.16672-(-21.08336)));
        }
        else if (tickAnim >= 15 && tickAnim < 16) {
            xx = 5.39913 + (((tickAnim - 15) / 1) * (-17.24646-(5.39913)));
            yy = -24.84906 + (((tickAnim - 15) / 1) * (-42.32111-(-24.84906)));
            zz = -42.16672 + (((tickAnim - 15) / 1) * (-29.67545-(-42.16672)));
        }
        else if (tickAnim >= 16 && tickAnim < 18) {
            xx = -17.24646 + (((tickAnim - 16) / 2) * (24.72376-(-17.24646)));
            yy = -42.32111 + (((tickAnim - 16) / 2) * (-5.29746-(-42.32111)));
            zz = -29.67545 + (((tickAnim - 16) / 2) * (-78.66181-(-29.67545)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = 24.72376 + (((tickAnim - 18) / 2) * (5.39913-(24.72376)));
            yy = -5.29746 + (((tickAnim - 18) / 2) * (-24.84906-(-5.29746)));
            zz = -78.66181 + (((tickAnim - 18) / 2) * (-42.16672-(-78.66181)));
        }
        else if (tickAnim >= 20 && tickAnim < 21) {
            xx = 5.39913 + (((tickAnim - 20) / 1) * (-17.24646-(5.39913)));
            yy = -24.84906 + (((tickAnim - 20) / 1) * (-42.32111-(-24.84906)));
            zz = -42.16672 + (((tickAnim - 20) / 1) * (-29.67545-(-42.16672)));
        }
        else if (tickAnim >= 21 && tickAnim < 23) {
            xx = -17.24646 + (((tickAnim - 21) / 2) * (24.72376-(-17.24646)));
            yy = -42.32111 + (((tickAnim - 21) / 2) * (-5.29746-(-42.32111)));
            zz = -29.67545 + (((tickAnim - 21) / 2) * (-78.66181-(-29.67545)));
        }
        else if (tickAnim >= 23 && tickAnim < 25) {
            xx = 24.72376 + (((tickAnim - 23) / 2) * (-0.10087-(24.72376)));
            yy = -5.29746 + (((tickAnim - 23) / 2) * (-24.84906-(-5.29746)));
            zz = -78.66181 + (((tickAnim - 23) / 2) * (-42.16672-(-78.66181)));
        }
        else if (tickAnim >= 25 && tickAnim < 35) {
            xx = -0.10087 + (((tickAnim - 25) / 10) * (-0.10087-(-0.10087)));
            yy = -24.84906 + (((tickAnim - 25) / 10) * (-24.84906-(-24.84906)));
            zz = -42.16672 + (((tickAnim - 25) / 10) * (-42.16672-(-42.16672)));
        }
        else if (tickAnim >= 35 && tickAnim < 750) {
            xx = -0.10087 + (((tickAnim - 35) / 715) * (-0.10087-(-0.10087)));
            yy = -24.84906 + (((tickAnim - 35) / 715) * (-24.84906-(-24.84906)));
            zz = -42.16672 + (((tickAnim - 35) / 715) * (-42.16672-(-42.16672)));
        }
        else if (tickAnim >= 750 && tickAnim < 760) {
            xx = -0.10087 + (((tickAnim - 750) / 10) * (0-(-0.10087)));
            yy = -24.84906 + (((tickAnim - 750) / 10) * (0-(-24.84906)));
            zz = -42.16672 + (((tickAnim - 750) / 10) * (0-(-42.16672)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm3, rightArm3.rotateAngleX + (float) Math.toRadians(xx), rightArm3.rotateAngleY + (float) Math.toRadians(yy), rightArm3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0.225-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 8) / 7) * (0-(0)));
            yy = 0.225 + (((tickAnim - 8) / 7) * (0-(0.225)));
            zz = 0 + (((tickAnim - 8) / 7) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 15) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 15) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 5) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 760) {
            xx = 0 + (((tickAnim - 20) / 740) * (0-(0)));
            yy = 0 + (((tickAnim - 20) / 740) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 740) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightArm3.rotationPointX = this.rightArm3.rotationPointX + (float)(xx);
        this.rightArm3.rotationPointY = this.rightArm3.rotationPointY - (float)(yy);
        this.rightArm3.rotationPointZ = this.rightArm3.rotationPointZ + (float)(zz);




        if (tickAnim >= 510 && tickAnim < 520) {
            xx = 1 + (((tickAnim - 510) / 10) * (1-(1)));
            yy = 1 + (((tickAnim - 510) / 10) * (0.0675-(1)));
            zz = 1 + (((tickAnim - 510) / 10) * (1-(1)));
        }
        else if (tickAnim >= 520 && tickAnim < 523) {
            xx = 1 + (((tickAnim - 520) / 3) * (1-(1)));
            yy = 0.0675 + (((tickAnim - 520) / 3) * (0.0675-(0.0675)));
            zz = 1 + (((tickAnim - 520) / 3) * (1-(1)));
        }
        else if (tickAnim >= 523 && tickAnim < 535) {
            xx = 1 + (((tickAnim - 523) / 12) * (1-(1)));
            yy = 0.0675 + (((tickAnim - 523) / 12) * (1-(0.0675)));
            zz = 1 + (((tickAnim - 523) / 12) * (1-(1)));
        }
        else {
            xx = 1;
            yy = 1;
            zz = 1;
        }
        this.eye.setScale((float)xx, (float)yy, (float)zz);


    }
    public void animEat(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraEusaurosphargis entity = (EntityPrehistoricFloraEusaurosphargis) entitylivingbaseIn;
        int animCycle = 20;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (29.5-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 29.5 + (((tickAnim - 10) / 10) * (0-(29.5)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(xx), neck.rotateAngleY + (float) Math.toRadians(yy), neck.rotateAngleZ + (float) Math.toRadians(zz));

        this.neck.rotationPointX = this.neck.rotationPointX + (float)(0);
        this.neck.rotationPointY = this.neck.rotationPointY - (float)(0);
        this.neck.rotationPointZ = this.neck.rotationPointZ + (float)(0);


        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(0), neck2.rotateAngleY + (float) Math.toRadians(0), neck2.rotateAngleZ + (float) Math.toRadians(0));



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
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (40.5-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 40.5 + (((tickAnim - 8) / 2) * (0-(40.5)));
            yy = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(xx), jaw.rotateAngleY + (float) Math.toRadians(yy), jaw.rotateAngleZ + (float) Math.toRadians(zz));
       
    }
    public void animRunning(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraEusaurosphargis entity = (EntityPrehistoricFloraEusaurosphargis) entitylivingbaseIn;
        int animCycle = 7;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        this.setRotateAngle(main, main.rotateAngleX + (float) Math.toRadians(0), main.rotateAngleY + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*960-70))*15), main.rotateAngleZ + (float) Math.toRadians(0));
        this.main.rotationPointX = this.main.rotationPointX + (float)(0);
        this.main.rotationPointY = this.main.rotationPointY - (float)(0.25+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*960/0.5-80))*-0.5);
        this.main.rotationPointZ = this.main.rotationPointZ + (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*960/0.5-40))*-0.5);



        if (tickAnim >= 0 && tickAnim < 4) {
            xx = -17.75 + (((tickAnim - 0) / 4) * (62.89187-(-17.75)));
            yy = 0 + (((tickAnim - 0) / 4) * (27.61426-(0)));
            zz = -15.25 + (((tickAnim - 0) / 4) * (-17.30569-(-15.25)));
        }
        else if (tickAnim >= 4 && tickAnim < 6) {
            xx = 62.89187 + (((tickAnim - 4) / 2) * (33.39681-(62.89187)));
            yy = 27.61426 + (((tickAnim - 4) / 2) * (6.82485-(27.61426)));
            zz = -17.30569 + (((tickAnim - 4) / 2) * (7.48279-(-17.30569)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = 33.39681 + (((tickAnim - 6) / 2) * (-17.75-(33.39681)));
            yy = 6.82485 + (((tickAnim - 6) / 2) * (0-(6.82485)));
            zz = 7.48279 + (((tickAnim - 6) / 2) * (-15.25-(7.48279)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg, rightLeg.rotateAngleX + (float) Math.toRadians(xx), rightLeg.rotateAngleY + (float) Math.toRadians(yy), rightLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (7.5-(0)));
            yy = -53.25 + (((tickAnim - 0) / 4) * (0-(-53.25)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 6) {
            xx = 7.5 + (((tickAnim - 4) / 2) * (-20.28789-(7.5)));
            yy = 0 + (((tickAnim - 4) / 2) * (-15.92427-(0)));
            zz = 0 + (((tickAnim - 4) / 2) * (41.29046-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = -20.28789 + (((tickAnim - 6) / 2) * (0-(-20.28789)));
            yy = -15.92427 + (((tickAnim - 6) / 2) * (-53.25-(-15.92427)));
            zz = 41.29046 + (((tickAnim - 6) / 2) * (0-(41.29046)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg2, rightLeg2.rotateAngleX + (float) Math.toRadians(xx), rightLeg2.rotateAngleY + (float) Math.toRadians(yy), rightLeg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 26.95253 + (((tickAnim - 0) / 2) * (12.20839-(26.95253)));
            yy = 4.01029 + (((tickAnim - 0) / 2) * (-27.87131-(4.01029)));
            zz = -7.83973 + (((tickAnim - 0) / 2) * (13.20491-(-7.83973)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = 12.20839 + (((tickAnim - 2) / 1) * (-1.44593-(12.20839)));
            yy = -27.87131 + (((tickAnim - 2) / 1) * (-1.83411-(-27.87131)));
            zz = 13.20491 + (((tickAnim - 2) / 1) * (25.82845-(13.20491)));
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = -1.44593 + (((tickAnim - 3) / 1) * (0-(-1.44593)));
            yy = -1.83411 + (((tickAnim - 3) / 1) * (36-(-1.83411)));
            zz = 25.82845 + (((tickAnim - 3) / 1) * (-32.75-(25.82845)));
        }
        else if (tickAnim >= 4 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 4) / 2) * (3.34915-(0)));
            yy = 36 + (((tickAnim - 4) / 2) * (34.39377-(36)));
            zz = -32.75 + (((tickAnim - 4) / 2) * (-55.65385-(-32.75)));
        }
        else if (tickAnim >= 6 && tickAnim < 7) {
            xx = 3.34915 + (((tickAnim - 6) / 1) * (0-(3.34915)));
            yy = 34.39377 + (((tickAnim - 6) / 1) * (0-(34.39377)));
            zz = -55.65385 + (((tickAnim - 6) / 1) * (0-(-55.65385)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 7) / 1) * (26.95253-(0)));
            yy = 0 + (((tickAnim - 7) / 1) * (4.01029-(0)));
            zz = 0 + (((tickAnim - 7) / 1) * (-7.83973-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg3, rightLeg3.rotateAngleX + (float) Math.toRadians(xx), rightLeg3.rotateAngleY + (float) Math.toRadians(yy), rightLeg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 1) {
            xx = 0 + (((tickAnim - 0) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 1) * (0.99-(0)));
            zz = 0 + (((tickAnim - 0) / 1) * (-0.15-(0)));
        }
        else if (tickAnim >= 1 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 1) / 1) * (0.15-(0)));
            yy = 0.99 + (((tickAnim - 1) / 1) * (1.6-(0.99)));
            zz = -0.15 + (((tickAnim - 1) / 1) * (-0.725-(-0.15)));
        }
        else if (tickAnim >= 2 && tickAnim < 4) {
            xx = 0.15 + (((tickAnim - 2) / 2) * (0-(0.15)));
            yy = 1.6 + (((tickAnim - 2) / 2) * (0-(1.6)));
            zz = -0.725 + (((tickAnim - 2) / 2) * (0-(-0.725)));
        }
        else if (tickAnim >= 4 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 4) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 4) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightLeg3.rotationPointX = this.rightLeg3.rotationPointX + (float)(xx);
        this.rightLeg3.rotationPointY = this.rightLeg3.rotationPointY - (float)(yy);
        this.rightLeg3.rotationPointZ = this.rightLeg3.rotationPointZ + (float)(zz);



        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*960/0.5-50))*-2), body.rotateAngleY + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*960-10))*-18), body.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*960-10))*-4.5));
        this.body.rotationPointX = this.body.rotationPointX + (float)(0);
        this.body.rotationPointY = this.body.rotationPointY - (float)(0);
        this.body.rotationPointZ = this.body.rotationPointZ + (float)(0);


        this.setRotateAngle(tail, tail.rotateAngleX + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*960/0.5-100))*-2), tail.rotateAngleY + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*960-10))*-1), tail.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*960-10))*-3));


        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*960/0.5-150))*-5), tail2.rotateAngleY + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*960-50))*-5), tail2.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*960-50))*-5));


        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*960/0.5-200))*-5), tail3.rotateAngleY + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*960-100))*-10), tail3.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*960-100))*-10));


        this.setRotateAngle(body2, body2.rotateAngleX + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*960/0.5-60))*3), body2.rotateAngleY + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*960-10))*18), body2.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*960-60))*4.5));


        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(17.0694-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*960/0.5-50))*-1), neck.rotateAngleY + (float) Math.toRadians(-4.8155-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*960-50))*-15), neck.rotateAngleZ + (float) Math.toRadians(-3.7733+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*960-70))*-4.5));


        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(-14.85342), neck2.rotateAngleY + (float) Math.toRadians(0.55035), neck2.rotateAngleZ + (float) Math.toRadians(0.56906));



        if (tickAnim >= 0 && tickAnim < 4) {
            xx = -15.25 + (((tickAnim - 0) / 4) * (50.87467-(-15.25)));
            yy = 32.75 + (((tickAnim - 0) / 4) * (-12.7506-(32.75)));
            zz = 0 + (((tickAnim - 0) / 4) * (-17.02109-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 6) {
            xx = 50.87467 + (((tickAnim - 4) / 2) * (-25.15043-(50.87467)));
            yy = -12.7506 + (((tickAnim - 4) / 2) * (8.07856-(-12.7506)));
            zz = -17.02109 + (((tickAnim - 4) / 2) * (-42.03782-(-17.02109)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = -25.15043 + (((tickAnim - 6) / 2) * (-15.25-(-25.15043)));
            yy = 8.07856 + (((tickAnim - 6) / 2) * (32.75-(8.07856)));
            zz = -42.03782 + (((tickAnim - 6) / 2) * (0-(-42.03782)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm, leftArm.rotateAngleX + (float) Math.toRadians(xx), leftArm.rotateAngleY + (float) Math.toRadians(yy), leftArm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 16.53843 + (((tickAnim - 0) / 4) * (17.75-(16.53843)));
            yy = -27.13689 + (((tickAnim - 0) / 4) * (-28.75-(-27.13689)));
            zz = -6.82661 + (((tickAnim - 0) / 4) * (23.25-(-6.82661)));
        }
        else if (tickAnim >= 4 && tickAnim < 6) {
            xx = 17.75 + (((tickAnim - 4) / 2) * (0-(17.75)));
            yy = -28.75 + (((tickAnim - 4) / 2) * (0-(-28.75)));
            zz = 23.25 + (((tickAnim - 4) / 2) * (0-(23.25)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 6) / 2) * (16.53843-(0)));
            yy = 0 + (((tickAnim - 6) / 2) * (-27.13689-(0)));
            zz = 0 + (((tickAnim - 6) / 2) * (-6.82661-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm2, leftArm2.rotateAngleX + (float) Math.toRadians(xx), leftArm2.rotateAngleY + (float) Math.toRadians(yy), leftArm2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 17.07071 + (((tickAnim - 0) / 2) * (-16.38301-(17.07071)));
            yy = 34.07548 + (((tickAnim - 0) / 2) * (50.76045-(34.07548)));
            zz = 13.32869 + (((tickAnim - 0) / 2) * (-9.6873-(13.32869)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = -16.38301 + (((tickAnim - 2) / 1) * (-30.44491-(-16.38301)));
            yy = 50.76045 + (((tickAnim - 2) / 1) * (60.52532-(50.76045)));
            zz = -9.6873 + (((tickAnim - 2) / 1) * (-23.23097-(-9.6873)));
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = -30.44491 + (((tickAnim - 3) / 1) * (58.77664-(-30.44491)));
            yy = 60.52532 + (((tickAnim - 3) / 1) * (46.70941-(60.52532)));
            zz = -23.23097 + (((tickAnim - 3) / 1) * (38.4888-(-23.23097)));
        }
        else if (tickAnim >= 4 && tickAnim < 6) {
            xx = 58.77664 + (((tickAnim - 4) / 2) * (21.75-(58.77664)));
            yy = 46.70941 + (((tickAnim - 4) / 2) * (0-(46.70941)));
            zz = 38.4888 + (((tickAnim - 4) / 2) * (79.25-(38.4888)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = 21.75 + (((tickAnim - 6) / 2) * (17.07071-(21.75)));
            yy = 0 + (((tickAnim - 6) / 2) * (34.07548-(0)));
            zz = 79.25 + (((tickAnim - 6) / 2) * (13.32869-(79.25)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm3, leftArm3.rotateAngleX + (float) Math.toRadians(xx), leftArm3.rotateAngleY + (float) Math.toRadians(yy), leftArm3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 2) * (0.25-(0)));
            zz = 0 + (((tickAnim - 0) / 2) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 2) / 2) * (0-(0)));
            yy = 0.25 + (((tickAnim - 2) / 2) * (0-(0.25)));
            zz = 0 + (((tickAnim - 2) / 2) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 4) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 4) / 2) * (0.425-(0)));
            zz = 0 + (((tickAnim - 4) / 2) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 6) / 2) * (0-(0)));
            yy = 0.425 + (((tickAnim - 6) / 2) * (0-(0.425)));
            zz = 0 + (((tickAnim - 6) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftArm3.rotationPointX = this.leftArm3.rotationPointX + (float)(xx);
        this.leftArm3.rotationPointY = this.leftArm3.rotationPointY - (float)(yy);
        this.leftArm3.rotationPointZ = this.leftArm3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 61.19471 + (((tickAnim - 0) / 2) * (33.39681-(61.19471)));
            yy = -32.2094 + (((tickAnim - 0) / 2) * (-6.82485-(-32.2094)));
            zz = 11.36162 + (((tickAnim - 0) / 2) * (-7.48279-(11.36162)));
        }
        else if (tickAnim >= 2 && tickAnim < 4) {
            xx = 33.39681 + (((tickAnim - 2) / 2) * (-17.75-(33.39681)));
            yy = -6.82485 + (((tickAnim - 2) / 2) * (0-(-6.82485)));
            zz = -7.48279 + (((tickAnim - 2) / 2) * (15.25-(-7.48279)));
        }
        else if (tickAnim >= 4 && tickAnim < 8) {
            xx = -17.75 + (((tickAnim - 4) / 4) * (61.19471-(-17.75)));
            yy = 0 + (((tickAnim - 4) / 4) * (-32.2094-(0)));
            zz = 15.25 + (((tickAnim - 4) / 4) * (11.36162-(15.25)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg, leftLeg.rotateAngleX + (float) Math.toRadians(xx), leftLeg.rotateAngleY + (float) Math.toRadians(yy), leftLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 7.5 + (((tickAnim - 0) / 2) * (-20.28789-(7.5)));
            yy = 0 + (((tickAnim - 0) / 2) * (15.92427-(0)));
            zz = 0 + (((tickAnim - 0) / 2) * (-41.29046-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 4) {
            xx = -20.28789 + (((tickAnim - 2) / 2) * (0-(-20.28789)));
            yy = 15.92427 + (((tickAnim - 2) / 2) * (53.25-(15.92427)));
            zz = -41.29046 + (((tickAnim - 2) / 2) * (0-(-41.29046)));
        }
        else if (tickAnim >= 4 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 4) / 4) * (7.5-(0)));
            yy = 53.25 + (((tickAnim - 4) / 4) * (0-(53.25)));
            zz = 0 + (((tickAnim - 4) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg2, leftLeg2.rotateAngleX + (float) Math.toRadians(xx), leftLeg2.rotateAngleY + (float) Math.toRadians(yy), leftLeg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 1) {
            xx = 0 + (((tickAnim - 0) / 1) * (-49.78713-(0)));
            yy = -36 + (((tickAnim - 0) / 1) * (-43.67619-(-36)));
            zz = 32.75 + (((tickAnim - 0) / 1) * (112.78804-(32.75)));
        }
        else if (tickAnim >= 1 && tickAnim < 2) {
            xx = -49.78713 + (((tickAnim - 1) / 1) * (3.34915-(-49.78713)));
            yy = -43.67619 + (((tickAnim - 1) / 1) * (-34.39377-(-43.67619)));
            zz = 112.78804 + (((tickAnim - 1) / 1) * (55.65385-(112.78804)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = 3.34915 + (((tickAnim - 2) / 1) * (0-(3.34915)));
            yy = -34.39377 + (((tickAnim - 2) / 1) * (0-(-34.39377)));
            zz = 55.65385 + (((tickAnim - 2) / 1) * (0-(55.65385)));
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 3) / 1) * (26.95253-(0)));
            yy = 0 + (((tickAnim - 3) / 1) * (4.01029-(0)));
            zz = 0 + (((tickAnim - 3) / 1) * (-7.83973-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 6) {
            xx = 26.95253 + (((tickAnim - 4) / 2) * (-0.27922-(26.95253)));
            yy = 4.01029 + (((tickAnim - 4) / 2) * (29.82637-(4.01029)));
            zz = -7.83973 + (((tickAnim - 4) / 2) * (-23.56938-(-7.83973)));
        }
        else if (tickAnim >= 6 && tickAnim < 7) {
            xx = -0.27922 + (((tickAnim - 6) / 1) * (-1.44593-(-0.27922)));
            yy = 29.82637 + (((tickAnim - 6) / 1) * (1.83411-(29.82637)));
            zz = -23.56938 + (((tickAnim - 6) / 1) * (-25.82845-(-23.56938)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = -1.44593 + (((tickAnim - 7) / 1) * (0-(-1.44593)));
            yy = 1.83411 + (((tickAnim - 7) / 1) * (-36-(1.83411)));
            zz = -25.82845 + (((tickAnim - 7) / 1) * (32.75-(-25.82845)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg3, leftLeg3.rotateAngleX + (float) Math.toRadians(xx), leftLeg3.rotateAngleY + (float) Math.toRadians(yy), leftLeg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 4) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 4) / 1) * (1.415-(0)));
            zz = 0 + (((tickAnim - 4) / 1) * (-0.15-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 5) / 1) * (-0.075-(0)));
            yy = 1.415 + (((tickAnim - 5) / 1) * (1.125-(1.415)));
            zz = -0.15 + (((tickAnim - 5) / 1) * (-0.725-(-0.15)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = -0.075 + (((tickAnim - 6) / 2) * (0-(-0.075)));
            yy = 1.125 + (((tickAnim - 6) / 2) * (0-(1.125)));
            zz = -0.725 + (((tickAnim - 6) / 2) * (0-(-0.725)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftLeg3.rotationPointX = this.leftLeg3.rotationPointX + (float)(xx);
        this.leftLeg3.rotationPointY = this.leftLeg3.rotationPointY - (float)(yy);
        this.leftLeg3.rotationPointZ = this.leftLeg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 50.87467 + (((tickAnim - 0) / 3) * (-25.15043-(50.87467)));
            yy = 12.7506 + (((tickAnim - 0) / 3) * (-8.07856-(12.7506)));
            zz = 17.02109 + (((tickAnim - 0) / 3) * (42.03782-(17.02109)));
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = -25.15043 + (((tickAnim - 3) / 1) * (-15.25-(-25.15043)));
            yy = -8.07856 + (((tickAnim - 3) / 1) * (-32.75-(-8.07856)));
            zz = 42.03782 + (((tickAnim - 3) / 1) * (0-(42.03782)));
        }
        else if (tickAnim >= 4 && tickAnim < 8) {
            xx = -15.25 + (((tickAnim - 4) / 4) * (50.87467-(-15.25)));
            yy = -32.75 + (((tickAnim - 4) / 4) * (12.7506-(-32.75)));
            zz = 0 + (((tickAnim - 4) / 4) * (17.02109-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm, rightArm.rotateAngleX + (float) Math.toRadians(xx), rightArm.rotateAngleY + (float) Math.toRadians(yy), rightArm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 17.75 + (((tickAnim - 0) / 3) * (0-(17.75)));
            yy = 28.75 + (((tickAnim - 0) / 3) * (0-(28.75)));
            zz = -23.25 + (((tickAnim - 0) / 3) * (0-(-23.25)));
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 3) / 1) * (16.53843-(0)));
            yy = 0 + (((tickAnim - 3) / 1) * (27.13689-(0)));
            zz = 0 + (((tickAnim - 3) / 1) * (6.82661-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 8) {
            xx = 16.53843 + (((tickAnim - 4) / 4) * (17.75-(16.53843)));
            yy = 27.13689 + (((tickAnim - 4) / 4) * (28.75-(27.13689)));
            zz = 6.82661 + (((tickAnim - 4) / 4) * (-23.25-(6.82661)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm2, rightArm2.rotateAngleX + (float) Math.toRadians(xx), rightArm2.rotateAngleY + (float) Math.toRadians(yy), rightArm2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 1) {
            xx = 58.77664 + (((tickAnim - 0) / 1) * (114.9058-(58.77664)));
            yy = -46.70941 + (((tickAnim - 0) / 1) * (35.70819-(-46.70941)));
            zz = -38.4888 + (((tickAnim - 0) / 1) * (-41.09604-(-38.4888)));
        }
        else if (tickAnim >= 1 && tickAnim < 3) {
            xx = 114.9058 + (((tickAnim - 1) / 2) * (21.75-(114.9058)));
            yy = 35.70819 + (((tickAnim - 1) / 2) * (0-(35.70819)));
            zz = -41.09604 + (((tickAnim - 1) / 2) * (-79.25-(-41.09604)));
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = 21.75 + (((tickAnim - 3) / 1) * (17.07071-(21.75)));
            yy = 0 + (((tickAnim - 3) / 1) * (-34.07548-(0)));
            zz = -79.25 + (((tickAnim - 3) / 1) * (-13.32869-(-79.25)));
        }
        else if (tickAnim >= 4 && tickAnim < 5) {
            xx = 17.07071 + (((tickAnim - 4) / 1) * (-16.38301-(17.07071)));
            yy = -34.07548 + (((tickAnim - 4) / 1) * (-50.76045-(-34.07548)));
            zz = -13.32869 + (((tickAnim - 4) / 1) * (9.6873-(-13.32869)));
        }
        else if (tickAnim >= 5 && tickAnim < 6) {
            xx = -16.38301 + (((tickAnim - 5) / 1) * (-16.38301-(-16.38301)));
            yy = -50.76045 + (((tickAnim - 5) / 1) * (-50.76045-(-50.76045)));
            zz = 9.6873 + (((tickAnim - 5) / 1) * (9.6873-(9.6873)));
        }
        else if (tickAnim >= 6 && tickAnim < 7) {
            xx = -16.38301 + (((tickAnim - 6) / 1) * (-30.44491-(-16.38301)));
            yy = -50.76045 + (((tickAnim - 6) / 1) * (-60.52532-(-50.76045)));
            zz = 9.6873 + (((tickAnim - 6) / 1) * (23.23097-(9.6873)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = -30.44491 + (((tickAnim - 7) / 1) * (58.77664-(-30.44491)));
            yy = -60.52532 + (((tickAnim - 7) / 1) * (-46.70941-(-60.52532)));
            zz = 23.23097 + (((tickAnim - 7) / 1) * (-38.4888-(23.23097)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm3, rightArm3.rotateAngleX + (float) Math.toRadians(xx), rightArm3.rotateAngleY + (float) Math.toRadians(yy), rightArm3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 1) {
            xx = 0 + (((tickAnim - 0) / 1) * (-0.075-(0)));
            yy = 0 + (((tickAnim - 0) / 1) * (0.425-(0)));
            zz = 0 + (((tickAnim - 0) / 1) * (-0.6-(0)));
        }
        else if (tickAnim >= 1 && tickAnim < 3) {
            xx = -0.075 + (((tickAnim - 1) / 2) * (0-(-0.075)));
            yy = 0.425 + (((tickAnim - 1) / 2) * (0.425-(0.425)));
            zz = -0.6 + (((tickAnim - 1) / 2) * (0-(-0.6)));
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 3) / 1) * (0-(0)));
            yy = 0.425 + (((tickAnim - 3) / 1) * (0-(0.425)));
            zz = 0 + (((tickAnim - 3) / 1) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 4) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 4) / 1) * (0.25-(0)));
            zz = 0 + (((tickAnim - 4) / 1) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 5) / 1) * (0-(0)));
            yy = 0.25 + (((tickAnim - 5) / 1) * (0.25-(0.25)));
            zz = 0 + (((tickAnim - 5) / 1) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 6) / 2) * (0-(0)));
            yy = 0.25 + (((tickAnim - 6) / 2) * (0-(0.25)));
            zz = 0 + (((tickAnim - 6) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightArm3.rotationPointX = this.rightArm3.rotationPointX + (float)(xx);
        this.rightArm3.rotationPointY = this.rightArm3.rotationPointY - (float)(yy);
        this.rightArm3.rotationPointZ = this.rightArm3.rotationPointZ + (float)(zz);

        
    }
    public void animWalking(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraEusaurosphargis entity = (EntityPrehistoricFloraEusaurosphargis) entitylivingbaseIn;
        int animCycle = 16;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        this.setRotateAngle(main, main.rotateAngleX + (float) Math.toRadians(0), main.rotateAngleY + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*430-70))*5), main.rotateAngleZ + (float) Math.toRadians(0));
        this.main.rotationPointX = this.main.rotationPointX + (float)(0);
        this.main.rotationPointY = this.main.rotationPointY - (float)(0.25+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*430/0.5-80))*-0.5);
        this.main.rotationPointZ = this.main.rotationPointZ + (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*430/0.5-40))*-0.5);



        if (tickAnim >= 0 && tickAnim < 8) {
            xx = -11.97923 + (((tickAnim - 0) / 8) * (54.64187-(-11.97923)));
            yy = -2.58029 + (((tickAnim - 0) / 8) * (27.61426-(-2.58029)));
            zz = -11.97923 + (((tickAnim - 0) / 8) * (-17.30569-(-11.97923)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = 54.64187 + (((tickAnim - 8) / 5) * (33.39681-(54.64187)));
            yy = 27.61426 + (((tickAnim - 8) / 5) * (6.82485-(27.61426)));
            zz = -17.30569 + (((tickAnim - 8) / 5) * (7.48279-(-17.30569)));
        }
        else if (tickAnim >= 13 && tickAnim < 17) {
            xx = 33.39681 + (((tickAnim - 13) / 4) * (-11.97923-(33.39681)));
            yy = 6.82485 + (((tickAnim - 13) / 4) * (-2.58029-(6.82485)));
            zz = 7.48279 + (((tickAnim - 13) / 4) * (-11.97923-(7.48279)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg, rightLeg.rotateAngleX + (float) Math.toRadians(xx), rightLeg.rotateAngleY + (float) Math.toRadians(yy), rightLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (7.5-(0)));
            yy = -53.25 + (((tickAnim - 0) / 8) * (0-(-53.25)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = 7.5 + (((tickAnim - 8) / 5) * (-20.28789-(7.5)));
            yy = 0 + (((tickAnim - 8) / 5) * (-15.92427-(0)));
            zz = 0 + (((tickAnim - 8) / 5) * (41.29046-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 17) {
            xx = -20.28789 + (((tickAnim - 13) / 4) * (0-(-20.28789)));
            yy = -15.92427 + (((tickAnim - 13) / 4) * (-53.25-(-15.92427)));
            zz = 41.29046 + (((tickAnim - 13) / 4) * (0-(41.29046)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg2, rightLeg2.rotateAngleX + (float) Math.toRadians(xx), rightLeg2.rotateAngleY + (float) Math.toRadians(yy), rightLeg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 19.00689 + (((tickAnim - 0) / 4) * (4.23017-(19.00689)));
            yy = 1.51753 + (((tickAnim - 0) / 4) * (-27.52271-(1.51753)));
            zz = -5.49332 + (((tickAnim - 0) / 4) * (16.51718-(-5.49332)));
        }
        else if (tickAnim >= 4 && tickAnim < 6) {
            xx = 4.23017 + (((tickAnim - 4) / 2) * (-6.52512-(4.23017)));
            yy = -27.52271 + (((tickAnim - 4) / 2) * (-21.58593-(-27.52271)));
            zz = 16.51718 + (((tickAnim - 4) / 2) * (33.12223-(16.51718)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = -6.52512 + (((tickAnim - 6) / 2) * (0-(-6.52512)));
            yy = -21.58593 + (((tickAnim - 6) / 2) * (36-(-21.58593)));
            zz = 33.12223 + (((tickAnim - 6) / 2) * (-32.75-(33.12223)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 8) / 2) * (-49.78713-(0)));
            yy = 36 + (((tickAnim - 8) / 2) * (43.67619-(36)));
            zz = -32.75 + (((tickAnim - 8) / 2) * (-112.78804-(-32.75)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = -49.78713 + (((tickAnim - 10) / 3) * (3.34915-(-49.78713)));
            yy = 43.67619 + (((tickAnim - 10) / 3) * (34.39377-(43.67619)));
            zz = -112.78804 + (((tickAnim - 10) / 3) * (-55.65385-(-112.78804)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = 3.34915 + (((tickAnim - 13) / 2) * (0-(3.34915)));
            yy = 34.39377 + (((tickAnim - 13) / 2) * (0-(34.39377)));
            zz = -55.65385 + (((tickAnim - 13) / 2) * (0-(-55.65385)));
        }
        else if (tickAnim >= 15 && tickAnim < 17) {
            xx = 0 + (((tickAnim - 15) / 2) * (19.00689-(0)));
            yy = 0 + (((tickAnim - 15) / 2) * (1.51753-(0)));
            zz = 0 + (((tickAnim - 15) / 2) * (-5.49332-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg3, rightLeg3.rotateAngleX + (float) Math.toRadians(xx), rightLeg3.rotateAngleY + (float) Math.toRadians(yy), rightLeg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 0) / 2) * (-0.2-(0)));
            yy = 0 + (((tickAnim - 0) / 2) * (0.965-(0)));
            zz = 0 + (((tickAnim - 0) / 2) * (-0.4-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 4) {
            xx = -0.2 + (((tickAnim - 2) / 2) * (0.225-(-0.2)));
            yy = 0.965 + (((tickAnim - 2) / 2) * (1.6-(0.965)));
            zz = -0.4 + (((tickAnim - 2) / 2) * (-1.025-(-0.4)));
        }
        else if (tickAnim >= 4 && tickAnim < 8) {
            xx = 0.225 + (((tickAnim - 4) / 4) * (0-(0.225)));
            yy = 1.6 + (((tickAnim - 4) / 4) * (0-(1.6)));
            zz = -1.025 + (((tickAnim - 4) / 4) * (0-(-1.025)));
        }
        else if (tickAnim >= 8 && tickAnim < 17) {
            xx = 0 + (((tickAnim - 8) / 9) * (0-(0)));
            yy = 0 + (((tickAnim - 8) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 9) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightLeg3.rotationPointX = this.rightLeg3.rotationPointX + (float)(xx);
        this.rightLeg3.rotationPointY = this.rightLeg3.rotationPointY - (float)(yy);
        this.rightLeg3.rotationPointZ = this.rightLeg3.rotationPointZ + (float)(zz);



        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*430/0.5-50))*-2), body.rotateAngleY + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*430-10))*-7), body.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*430-10))*-4.5));
        this.body.rotationPointX = this.body.rotationPointX + (float)(0);
        this.body.rotationPointY = this.body.rotationPointY - (float)(0);
        this.body.rotationPointZ = this.body.rotationPointZ + (float)(0);


        this.setRotateAngle(tail, tail.rotateAngleX + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*430/0.5-100))*-2), tail.rotateAngleY + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*430-10))*-1), tail.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*430-10))*-3));


        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*430/0.5-150))*-5), tail2.rotateAngleY + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*430-50))*-5), tail2.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*430-50))*-5));


        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*430/0.5-200))*-5), tail3.rotateAngleY + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*430-100))*-10), tail3.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*430-100))*-10));


        this.setRotateAngle(body2, body2.rotateAngleX + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*430/0.5-60))*3), body2.rotateAngleY + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*430-10))*7), body2.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*430-60))*4.5));


        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*430/0.5-50))*-1), neck.rotateAngleY + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*430-50))*-4.5), neck.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*430-70))*-4.5));



        if (tickAnim >= 0 && tickAnim < 8) {
            xx = -15.25 + (((tickAnim - 0) / 8) * (50.87467-(-15.25)));
            yy = 32.75 + (((tickAnim - 0) / 8) * (-12.7506-(32.75)));
            zz = 0 + (((tickAnim - 0) / 8) * (-17.02109-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = 50.87467 + (((tickAnim - 8) / 5) * (-25.15043-(50.87467)));
            yy = -12.7506 + (((tickAnim - 8) / 5) * (8.07856-(-12.7506)));
            zz = -17.02109 + (((tickAnim - 8) / 5) * (-42.03782-(-17.02109)));
        }
        else if (tickAnim >= 13 && tickAnim < 17) {
            xx = -25.15043 + (((tickAnim - 13) / 4) * (-15.25-(-25.15043)));
            yy = 8.07856 + (((tickAnim - 13) / 4) * (32.75-(8.07856)));
            zz = -42.03782 + (((tickAnim - 13) / 4) * (0-(-42.03782)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm, leftArm.rotateAngleX + (float) Math.toRadians(xx), leftArm.rotateAngleY + (float) Math.toRadians(yy), leftArm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 16.53843 + (((tickAnim - 0) / 8) * (17.75-(16.53843)));
            yy = -27.13689 + (((tickAnim - 0) / 8) * (-28.75-(-27.13689)));
            zz = -6.82661 + (((tickAnim - 0) / 8) * (23.25-(-6.82661)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = 17.75 + (((tickAnim - 8) / 5) * (0-(17.75)));
            yy = -28.75 + (((tickAnim - 8) / 5) * (0-(-28.75)));
            zz = 23.25 + (((tickAnim - 8) / 5) * (0-(23.25)));
        }
        else if (tickAnim >= 13 && tickAnim < 17) {
            xx = 0 + (((tickAnim - 13) / 4) * (16.53843-(0)));
            yy = 0 + (((tickAnim - 13) / 4) * (-27.13689-(0)));
            zz = 0 + (((tickAnim - 13) / 4) * (-6.82661-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm2, leftArm2.rotateAngleX + (float) Math.toRadians(xx), leftArm2.rotateAngleY + (float) Math.toRadians(yy), leftArm2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 17.07071 + (((tickAnim - 0) / 3) * (-16.38301-(17.07071)));
            yy = 34.07548 + (((tickAnim - 0) / 3) * (50.76045-(34.07548)));
            zz = 13.32869 + (((tickAnim - 0) / 3) * (-9.6873-(13.32869)));
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = -16.38301 + (((tickAnim - 3) / 1) * (-16.38301-(-16.38301)));
            yy = 50.76045 + (((tickAnim - 3) / 1) * (50.76045-(50.76045)));
            zz = -9.6873 + (((tickAnim - 3) / 1) * (-9.6873-(-9.6873)));
        }
        else if (tickAnim >= 4 && tickAnim < 6) {
            xx = -16.38301 + (((tickAnim - 4) / 2) * (-30.44491-(-16.38301)));
            yy = 50.76045 + (((tickAnim - 4) / 2) * (60.52532-(50.76045)));
            zz = -9.6873 + (((tickAnim - 4) / 2) * (-23.23097-(-9.6873)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = -30.44491 + (((tickAnim - 6) / 2) * (58.77664-(-30.44491)));
            yy = 60.52532 + (((tickAnim - 6) / 2) * (46.70941-(60.52532)));
            zz = -23.23097 + (((tickAnim - 6) / 2) * (38.4888-(-23.23097)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 58.77664 + (((tickAnim - 8) / 2) * (84.48367-(58.77664)));
            yy = 46.70941 + (((tickAnim - 8) / 2) * (-56.79393-(46.70941)));
            zz = 38.4888 + (((tickAnim - 8) / 2) * (83.53926-(38.4888)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 84.48367 + (((tickAnim - 10) / 3) * (21.75-(84.48367)));
            yy = -56.79393 + (((tickAnim - 10) / 3) * (0-(-56.79393)));
            zz = 83.53926 + (((tickAnim - 10) / 3) * (79.25-(83.53926)));
        }
        else if (tickAnim >= 13 && tickAnim < 17) {
            xx = 21.75 + (((tickAnim - 13) / 4) * (17.07071-(21.75)));
            yy = 0 + (((tickAnim - 13) / 4) * (34.07548-(0)));
            zz = 79.25 + (((tickAnim - 13) / 4) * (13.32869-(79.25)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm3, leftArm3.rotateAngleX + (float) Math.toRadians(xx), leftArm3.rotateAngleY + (float) Math.toRadians(yy), leftArm3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0.25-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 3) / 1) * (0-(0)));
            yy = 0.25 + (((tickAnim - 3) / 1) * (0.25-(0.25)));
            zz = 0 + (((tickAnim - 3) / 1) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 4) / 4) * (0-(0)));
            yy = 0.25 + (((tickAnim - 4) / 4) * (0-(0.25)));
            zz = 0 + (((tickAnim - 4) / 4) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 8) / 2) * (0.4-(0)));
            yy = 0 + (((tickAnim - 8) / 2) * (0.425-(0)));
            zz = 0 + (((tickAnim - 8) / 2) * (-0.6-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 0.4 + (((tickAnim - 10) / 3) * (0-(0.4)));
            yy = 0.425 + (((tickAnim - 10) / 3) * (0.425-(0.425)));
            zz = -0.6 + (((tickAnim - 10) / 3) * (0-(-0.6)));
        }
        else if (tickAnim >= 13 && tickAnim < 17) {
            xx = 0 + (((tickAnim - 13) / 4) * (0-(0)));
            yy = 0.425 + (((tickAnim - 13) / 4) * (0-(0.425)));
            zz = 0 + (((tickAnim - 13) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftArm3.rotationPointX = this.leftArm3.rotationPointX + (float)(xx);
        this.leftArm3.rotationPointY = this.leftArm3.rotationPointY - (float)(yy);
        this.leftArm3.rotationPointZ = this.leftArm3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 54.64187 + (((tickAnim - 0) / 4) * (33.39681-(54.64187)));
            yy = -27.61426 + (((tickAnim - 0) / 4) * (-6.82485-(-27.61426)));
            zz = 17.30569 + (((tickAnim - 0) / 4) * (-7.48279-(17.30569)));
        }
        else if (tickAnim >= 4 && tickAnim < 8) {
            xx = 33.39681 + (((tickAnim - 4) / 4) * (-11.97923-(33.39681)));
            yy = -6.82485 + (((tickAnim - 4) / 4) * (2.58029-(-6.82485)));
            zz = -7.48279 + (((tickAnim - 4) / 4) * (11.97923-(-7.48279)));
        }
        else if (tickAnim >= 8 && tickAnim < 17) {
            xx = -11.97923 + (((tickAnim - 8) / 9) * (54.64187-(-11.97923)));
            yy = 2.58029 + (((tickAnim - 8) / 9) * (-27.61426-(2.58029)));
            zz = 11.97923 + (((tickAnim - 8) / 9) * (17.30569-(11.97923)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg, leftLeg.rotateAngleX + (float) Math.toRadians(xx), leftLeg.rotateAngleY + (float) Math.toRadians(yy), leftLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 7.5 + (((tickAnim - 0) / 4) * (-20.28789-(7.5)));
            yy = 0 + (((tickAnim - 0) / 4) * (15.92427-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (-41.29046-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 8) {
            xx = -20.28789 + (((tickAnim - 4) / 4) * (0-(-20.28789)));
            yy = 15.92427 + (((tickAnim - 4) / 4) * (53.25-(15.92427)));
            zz = -41.29046 + (((tickAnim - 4) / 4) * (0-(-41.29046)));
        }
        else if (tickAnim >= 8 && tickAnim < 17) {
            xx = 0 + (((tickAnim - 8) / 9) * (7.5-(0)));
            yy = 53.25 + (((tickAnim - 8) / 9) * (0-(53.25)));
            zz = 0 + (((tickAnim - 8) / 9) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg2, leftLeg2.rotateAngleX + (float) Math.toRadians(xx), leftLeg2.rotateAngleY + (float) Math.toRadians(yy), leftLeg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 0) / 2) * (-49.78713-(0)));
            yy = -36 + (((tickAnim - 0) / 2) * (-43.67619-(-36)));
            zz = 32.75 + (((tickAnim - 0) / 2) * (112.78804-(32.75)));
        }
        else if (tickAnim >= 2 && tickAnim < 4) {
            xx = -49.78713 + (((tickAnim - 2) / 2) * (3.34915-(-49.78713)));
            yy = -43.67619 + (((tickAnim - 2) / 2) * (-34.39377-(-43.67619)));
            zz = 112.78804 + (((tickAnim - 2) / 2) * (55.65385-(112.78804)));
        }
        else if (tickAnim >= 4 && tickAnim < 7) {
            xx = 3.34915 + (((tickAnim - 4) / 3) * (0-(3.34915)));
            yy = -34.39377 + (((tickAnim - 4) / 3) * (0-(-34.39377)));
            zz = 55.65385 + (((tickAnim - 4) / 3) * (0-(55.65385)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 7) / 1) * (19.00689-(0)));
            yy = 0 + (((tickAnim - 7) / 1) * (1.51753-(0)));
            zz = 0 + (((tickAnim - 7) / 1) * (-5.49332-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = 19.00689 + (((tickAnim - 8) / 5) * (-5.79161-(19.00689)));
            yy = 1.51753 + (((tickAnim - 8) / 5) * (27.87131-(1.51753)));
            zz = -5.49332 + (((tickAnim - 8) / 5) * (-13.20491-(-5.49332)));
        }
        else if (tickAnim >= 13 && tickAnim < 14) {
            xx = -5.79161 + (((tickAnim - 13) / 1) * (-6.52512-(-5.79161)));
            yy = 27.87131 + (((tickAnim - 13) / 1) * (21.58593-(27.87131)));
            zz = -13.20491 + (((tickAnim - 13) / 1) * (-33.12223-(-13.20491)));
        }
        else if (tickAnim >= 14 && tickAnim < 17) {
            xx = -6.52512 + (((tickAnim - 14) / 3) * (0-(-6.52512)));
            yy = 21.58593 + (((tickAnim - 14) / 3) * (-36-(21.58593)));
            zz = -33.12223 + (((tickAnim - 14) / 3) * (32.75-(-33.12223)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg3, leftLeg3.rotateAngleX + (float) Math.toRadians(xx), leftLeg3.rotateAngleY + (float) Math.toRadians(yy), leftLeg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 8) / 2) * (-0.2-(0)));
            yy = 0 + (((tickAnim - 8) / 2) * (0.765-(0)));
            zz = 0 + (((tickAnim - 8) / 2) * (-0.4-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = -0.2 + (((tickAnim - 10) / 3) * (-0.275-(-0.2)));
            yy = 0.765 + (((tickAnim - 10) / 3) * (1.6-(0.765)));
            zz = -0.4 + (((tickAnim - 10) / 3) * (-1.025-(-0.4)));
        }
        else if (tickAnim >= 13 && tickAnim < 17) {
            xx = -0.275 + (((tickAnim - 13) / 4) * (0-(-0.275)));
            yy = 1.6 + (((tickAnim - 13) / 4) * (0-(1.6)));
            zz = -1.025 + (((tickAnim - 13) / 4) * (0-(-1.025)));
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
            xx = 50.87467 + (((tickAnim - 0) / 5) * (-25.15043-(50.87467)));
            yy = 12.7506 + (((tickAnim - 0) / 5) * (-8.07856-(12.7506)));
            zz = 17.02109 + (((tickAnim - 0) / 5) * (42.03782-(17.02109)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = -25.15043 + (((tickAnim - 5) / 3) * (-15.25-(-25.15043)));
            yy = -8.07856 + (((tickAnim - 5) / 3) * (-32.75-(-8.07856)));
            zz = 42.03782 + (((tickAnim - 5) / 3) * (0-(42.03782)));
        }
        else if (tickAnim >= 8 && tickAnim < 17) {
            xx = -15.25 + (((tickAnim - 8) / 9) * (50.87467-(-15.25)));
            yy = -32.75 + (((tickAnim - 8) / 9) * (12.7506-(-32.75)));
            zz = 0 + (((tickAnim - 8) / 9) * (17.02109-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm, rightArm.rotateAngleX + (float) Math.toRadians(xx), rightArm.rotateAngleY + (float) Math.toRadians(yy), rightArm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 17.75 + (((tickAnim - 0) / 5) * (0-(17.75)));
            yy = 28.75 + (((tickAnim - 0) / 5) * (0-(28.75)));
            zz = -23.25 + (((tickAnim - 0) / 5) * (0-(-23.25)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 5) / 3) * (16.53843-(0)));
            yy = 0 + (((tickAnim - 5) / 3) * (27.13689-(0)));
            zz = 0 + (((tickAnim - 5) / 3) * (6.82661-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 17) {
            xx = 16.53843 + (((tickAnim - 8) / 9) * (17.75-(16.53843)));
            yy = 27.13689 + (((tickAnim - 8) / 9) * (28.75-(27.13689)));
            zz = 6.82661 + (((tickAnim - 8) / 9) * (-23.25-(6.82661)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm2, rightArm2.rotateAngleX + (float) Math.toRadians(xx), rightArm2.rotateAngleY + (float) Math.toRadians(yy), rightArm2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 58.77664 + (((tickAnim - 0) / 2) * (114.9058-(58.77664)));
            yy = -46.70941 + (((tickAnim - 0) / 2) * (35.70819-(-46.70941)));
            zz = -38.4888 + (((tickAnim - 0) / 2) * (-41.09604-(-38.4888)));
        }
        else if (tickAnim >= 2 && tickAnim < 5) {
            xx = 114.9058 + (((tickAnim - 2) / 3) * (21.75-(114.9058)));
            yy = 35.70819 + (((tickAnim - 2) / 3) * (0-(35.70819)));
            zz = -41.09604 + (((tickAnim - 2) / 3) * (-79.25-(-41.09604)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 21.75 + (((tickAnim - 5) / 3) * (17.07071-(21.75)));
            yy = 0 + (((tickAnim - 5) / 3) * (-34.07548-(0)));
            zz = -79.25 + (((tickAnim - 5) / 3) * (-13.32869-(-79.25)));
        }
        else if (tickAnim >= 8 && tickAnim < 11) {
            xx = 17.07071 + (((tickAnim - 8) / 3) * (-16.38301-(17.07071)));
            yy = -34.07548 + (((tickAnim - 8) / 3) * (-50.76045-(-34.07548)));
            zz = -13.32869 + (((tickAnim - 8) / 3) * (9.6873-(-13.32869)));
        }
        else if (tickAnim >= 11 && tickAnim < 13) {
            xx = -16.38301 + (((tickAnim - 11) / 2) * (-16.38301-(-16.38301)));
            yy = -50.76045 + (((tickAnim - 11) / 2) * (-50.76045-(-50.76045)));
            zz = 9.6873 + (((tickAnim - 11) / 2) * (9.6873-(9.6873)));
        }
        else if (tickAnim >= 13 && tickAnim < 14) {
            xx = -16.38301 + (((tickAnim - 13) / 1) * (-30.44491-(-16.38301)));
            yy = -50.76045 + (((tickAnim - 13) / 1) * (-60.52532-(-50.76045)));
            zz = 9.6873 + (((tickAnim - 13) / 1) * (23.23097-(9.6873)));
        }
        else if (tickAnim >= 14 && tickAnim < 17) {
            xx = -30.44491 + (((tickAnim - 14) / 3) * (58.77664-(-30.44491)));
            yy = -60.52532 + (((tickAnim - 14) / 3) * (-46.70941-(-60.52532)));
            zz = 23.23097 + (((tickAnim - 14) / 3) * (-38.4888-(23.23097)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm3, rightArm3.rotateAngleX + (float) Math.toRadians(xx), rightArm3.rotateAngleY + (float) Math.toRadians(yy), rightArm3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 0) / 2) * (-0.075-(0)));
            yy = 0 + (((tickAnim - 0) / 2) * (0.425-(0)));
            zz = 0 + (((tickAnim - 0) / 2) * (-0.6-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 5) {
            xx = -0.075 + (((tickAnim - 2) / 3) * (0-(-0.075)));
            yy = 0.425 + (((tickAnim - 2) / 3) * (0.425-(0.425)));
            zz = -0.6 + (((tickAnim - 2) / 3) * (0-(-0.6)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            yy = 0.425 + (((tickAnim - 5) / 3) * (0-(0.425)));
            zz = 0 + (((tickAnim - 5) / 3) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 8) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 8) / 3) * (0.25-(0)));
            zz = 0 + (((tickAnim - 8) / 3) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 11) / 2) * (0-(0)));
            yy = 0.25 + (((tickAnim - 11) / 2) * (0.25-(0.25)));
            zz = 0 + (((tickAnim - 11) / 2) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 17) {
            xx = 0 + (((tickAnim - 13) / 4) * (0-(0)));
            yy = 0.25 + (((tickAnim - 13) / 4) * (0-(0.25)));
            zz = 0 + (((tickAnim - 13) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightArm3.rotationPointX = this.rightArm3.rotationPointX + (float)(xx);
        this.rightArm3.rotationPointY = this.rightArm3.rotationPointY - (float)(yy);
        this.rightArm3.rotationPointZ = this.rightArm3.rotationPointZ + (float)(zz);


    }

    public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        EntityPrehistoricFloraEusaurosphargis e = (EntityPrehistoricFloraEusaurosphargis) entity;
        animator.update(entity);

        animator.setAnimation(e.ROAR_ANIMATION);
        animator.startKeyframe(10);
        animator.move(this.neck, 0,0,-0.5F);
        animator.rotate(this.head, (float) Math.toRadians(-17), (float) Math.toRadians(0), (float) Math.toRadians(0));
        //animator.rotate(this.upperjaw, (float) Math.toRadians(-25), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.jaw, (float) Math.toRadians(10), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(10);
        animator.resetKeyframe(10);


    }
}
