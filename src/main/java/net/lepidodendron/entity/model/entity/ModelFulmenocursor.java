package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.EntityPrehistoricFloraMyriapod;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;

public class ModelFulmenocursor extends ModelBasePalaeopedia {
    private final AdvancedModelRenderer body;
    private final AdvancedModelRenderer head;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer leftAntenna1;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer rightAntenna1;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer leftLeg1;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer rightLeg1;
    private final AdvancedModelRenderer cube_r6;
    private final AdvancedModelRenderer leftLeg2;
    private final AdvancedModelRenderer cube_r7;
    private final AdvancedModelRenderer rightLeg2;
    private final AdvancedModelRenderer cube_r8;
    private final AdvancedModelRenderer leftLeg3;
    private final AdvancedModelRenderer cube_r9;
    private final AdvancedModelRenderer rightLeg3;
    private final AdvancedModelRenderer cube_r10;
    private final AdvancedModelRenderer leftLeg4;
    private final AdvancedModelRenderer cube_r11;
    private final AdvancedModelRenderer rightLeg4;
    private final AdvancedModelRenderer cube_r12;
    private final AdvancedModelRenderer leftLeg5;
    private final AdvancedModelRenderer cube_r13;
    private final AdvancedModelRenderer rightLeg5;
    private final AdvancedModelRenderer cube_r14;
    private final AdvancedModelRenderer leftLeg6;
    private final AdvancedModelRenderer cube_r15;
    private final AdvancedModelRenderer rightLeg6;
    private final AdvancedModelRenderer cube_r16;
    private final AdvancedModelRenderer leftLeg7;
    private final AdvancedModelRenderer cube_r17;
    private final AdvancedModelRenderer rightLeg7;
    private final AdvancedModelRenderer cube_r18;
    private final AdvancedModelRenderer leftLeg8;
    private final AdvancedModelRenderer cube_r19;
    private final AdvancedModelRenderer rightLeg8;
    private final AdvancedModelRenderer cube_r20;
    private final AdvancedModelRenderer leftLeg9;
    private final AdvancedModelRenderer cube_r21;
    private final AdvancedModelRenderer rightLeg9;
    private final AdvancedModelRenderer cube_r22;
    private final AdvancedModelRenderer leftLeg10;
    private final AdvancedModelRenderer cube_r23;
    private final AdvancedModelRenderer rightLeg10;
    private final AdvancedModelRenderer cube_r24;
    private final AdvancedModelRenderer leftLeg11;
    private final AdvancedModelRenderer cube_r25;
    private final AdvancedModelRenderer rightLeg11;
    private final AdvancedModelRenderer cube_r26;
    private final AdvancedModelRenderer leftLeg12;
    private final AdvancedModelRenderer cube_r27;
    private final AdvancedModelRenderer rightLeg12;
    private final AdvancedModelRenderer cube_r28;
    private final AdvancedModelRenderer leftLeg13;
    private final AdvancedModelRenderer cube_r29;
    private final AdvancedModelRenderer rightLeg13;
    private final AdvancedModelRenderer cube_r30;
    private final AdvancedModelRenderer leftLeg14;
    private final AdvancedModelRenderer cube_r31;
    private final AdvancedModelRenderer rightLeg14;
    private final AdvancedModelRenderer cube_r32;
    private final AdvancedModelRenderer leftLeg15;
    private final AdvancedModelRenderer cube_r33;
    private final AdvancedModelRenderer rightLeg15;
    private final AdvancedModelRenderer cube_r34;
    private final AdvancedModelRenderer ultimatelegleft;
    private final AdvancedModelRenderer cube_r35;
    private final AdvancedModelRenderer ultimatelegright;
    private final AdvancedModelRenderer cube_r36;

    private ModelAnimator animator;

    public ModelFulmenocursor() {
        this.textureWidth = 43;
        this.textureHeight = 41;

        this.body = new AdvancedModelRenderer(this);
        this.body.setRotationPoint(0.0F, 22.5F, 0.0F);
        this.body.cubeList.add(new ModelBox(body, 31, 16, -0.5F, -0.5F, -6.1F, 1, 1, 2, 0.0F, false));
        this.body.cubeList.add(new ModelBox(body, 23, 27, -0.5F, -0.51F, -4.1F, 1, 1, 9, 0.0F, false));
        this.body.cubeList.add(new ModelBox(body, 33, 20, -0.3F, -0.49F, -6.1F, 1, 1, 2, -0.003F, false));
        this.body.cubeList.add(new ModelBox(body, 0, 38, -0.7F, -0.49F, -6.1F, 1, 1, 2, -0.006F, false));
        this.body.cubeList.add(new ModelBox(body, 0, 27, -1.0F, -0.5F, -4.1F, 2, 1, 9, 0.0F, false));
        this.body.cubeList.add(new ModelBox(body, 7, 38, -0.5F, -0.5F, 4.9F, 1, 1, 1, 0.0F, false));

        this.head = new AdvancedModelRenderer(this);
        this.head.setRotationPoint(-0.5F, 0.5F, -7.0F);
        this.body.addChild(head);


        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(0.4F, 0.0F, 1.2F);
        this.head.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.192F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 33, 24, -0.4F, -1.0F, -1.0F, 1, 1, 1, 0.0F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(0.7F, -0.1F, 0.9F);
        this.head.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.2094F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 12, 38, -1.0F, 0.0F, -1.0F, 1, 0, 1, 0.0F, true));
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 12, 38, -0.4F, 0.0F, -1.0F, 1, 0, 1, 0.0F, false));

        this.leftAntenna1 = new AdvancedModelRenderer(this);
        this.leftAntenna1.setRotationPoint(1.1F, -0.5F, 0.2F);
        this.head.addChild(leftAntenna1);
        this.setRotateAngle(leftAntenna1, 0.0838F, -0.0251F, -1.8713F);


        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(-1.0F, 3.7F, -1.8F);
        this.leftAntenna1.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.0524F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 0, 0, 1.0F, -4.0F, -13.0F, 0, 5, 15, 0.0F, false));

        this.rightAntenna1 = new AdvancedModelRenderer(this);
        this.rightAntenna1.setRotationPoint(-0.1F, -0.5F, 0.2F);
        this.head.addChild(rightAntenna1);
        this.setRotateAngle(rightAntenna1, 0.0838F, 0.0251F, 1.8713F);


        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(1.0F, 3.7F, -1.8F);
        this.rightAntenna1.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.0524F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 0, 0, -1.0F, -4.0F, -13.0F, 0, 5, 15, 0.0F, true));

        this.leftLeg1 = new AdvancedModelRenderer(this);
        this.leftLeg1.setRotationPoint(0.7F, 0.0F, -5.3F);
        this.body.addChild(leftLeg1);
        this.setRotateAngle(leftLeg1, 0.0F, -0.096F, 0.0F);


        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(-0.1F, 0.0F, 0.0F);
        this.leftLeg1.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.0F, 0.4363F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 31, 12, 0.0F, -1.5F, 0.0F, 6, 3, 0, 0.0F, false));

        this.rightLeg1 = new AdvancedModelRenderer(this);
        this.rightLeg1.setRotationPoint(-0.7F, 0.0F, -5.3F);
        this.body.addChild(rightLeg1);
        this.setRotateAngle(rightLeg1, 0.0F, 0.096F, 0.0F);


        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(0.1F, 0.0F, 0.0F);
        this.rightLeg1.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.0F, -0.4363F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 31, 12, -6.0F, -1.5F, 0.0F, 6, 3, 0, 0.0F, true));

        this.leftLeg2 = new AdvancedModelRenderer(this);
        this.leftLeg2.setRotationPoint(0.7F, 0.0F, -4.8F);
        this.body.addChild(leftLeg2);
        this.setRotateAngle(leftLeg2, 0.0F, -0.2007F, 0.0F);


        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(-0.1F, 0.0F, 0.0F);
        this.leftLeg2.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.0F, 0.4363F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 31, 12, 0.0F, -1.5F, 0.0F, 6, 3, 0, 0.0F, false));

        this.rightLeg2 = new AdvancedModelRenderer(this);
        this.rightLeg2.setRotationPoint(-0.7F, 0.0F, -4.8F);
        this.body.addChild(rightLeg2);
        this.setRotateAngle(rightLeg2, 0.0F, 0.2007F, 0.0F);


        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(0.1F, 0.0F, 0.0F);
        this.rightLeg2.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.0F, -0.4363F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 31, 12, -6.0F, -1.5F, 0.0F, 6, 3, 0, 0.0F, true));

        this.leftLeg3 = new AdvancedModelRenderer(this);
        this.leftLeg3.setRotationPoint(0.7F, 0.0F, -4.3F);
        this.body.addChild(leftLeg3);
        this.setRotateAngle(leftLeg3, 0.0F, -0.3229F, 0.0F);


        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(-0.1F, 0.0F, 0.0F);
        this.leftLeg3.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.0F, 0.4363F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 31, 12, 0.0F, -1.5F, 0.0F, 6, 3, 0, 0.0F, false));

        this.rightLeg3 = new AdvancedModelRenderer(this);
        this.rightLeg3.setRotationPoint(-0.7F, 0.0F, -4.3F);
        this.body.addChild(rightLeg3);
        this.setRotateAngle(rightLeg3, 0.0F, 0.3229F, 0.0F);


        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(0.1F, 0.0F, 0.0F);
        this.rightLeg3.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 0.0F, -0.4363F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 31, 12, -6.0F, -1.5F, 0.0F, 6, 3, 0, 0.0F, true));

        this.leftLeg4 = new AdvancedModelRenderer(this);
        this.leftLeg4.setRotationPoint(0.9F, 0.0F, -3.6F);
        this.body.addChild(leftLeg4);
        this.setRotateAngle(leftLeg4, 0.0F, -0.3578F, 0.0F);


        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(-0.1F, 0.0F, 0.0F);
        this.leftLeg4.addChild(cube_r11);
        this.setRotateAngle(cube_r11, 0.0F, 0.4363F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 31, 12, 0.0F, -1.5F, 0.0F, 6, 3, 0, 0.0F, false));

        this.rightLeg4 = new AdvancedModelRenderer(this);
        this.rightLeg4.setRotationPoint(-0.9F, 0.0F, -3.6F);
        this.body.addChild(rightLeg4);
        this.setRotateAngle(rightLeg4, 0.0F, 0.3578F, 0.0F);


        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(0.1F, 0.0F, 0.0F);
        this.rightLeg4.addChild(cube_r12);
        this.setRotateAngle(cube_r12, 0.0F, -0.4363F, 0.0F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 31, 12, -6.0F, -1.5F, 0.0F, 6, 3, 0, 0.0F, true));

        this.leftLeg5 = new AdvancedModelRenderer(this);
        this.leftLeg5.setRotationPoint(0.9F, 0.0F, -3.0F);
        this.body.addChild(leftLeg5);
        this.setRotateAngle(leftLeg5, 0.0F, -0.4102F, 0.0F);


        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(-0.1F, 0.0F, 0.0F);
        this.leftLeg5.addChild(cube_r13);
        this.setRotateAngle(cube_r13, 0.0F, 0.4363F, 0.0F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 31, 12, 0.0F, -1.5F, 0.0F, 6, 3, 0, 0.0F, false));

        this.rightLeg5 = new AdvancedModelRenderer(this);
        this.rightLeg5.setRotationPoint(-0.9F, 0.0F, -3.0F);
        this.body.addChild(rightLeg5);
        this.setRotateAngle(rightLeg5, 0.0F, 0.4102F, 0.0F);


        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(0.1F, 0.0F, 0.0F);
        this.rightLeg5.addChild(cube_r14);
        this.setRotateAngle(cube_r14, 0.0F, -0.4363F, 0.0F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 31, 12, -6.0F, -1.5F, 0.0F, 6, 3, 0, 0.0F, true));

        this.leftLeg6 = new AdvancedModelRenderer(this);
        this.leftLeg6.setRotationPoint(0.9F, 0.0F, -2.4F);
        this.body.addChild(leftLeg6);
        this.setRotateAngle(leftLeg6, 0.0F, -0.48F, 0.0F);


        this.cube_r15 = new AdvancedModelRenderer(this);
        this.cube_r15.setRotationPoint(-0.1F, 0.0F, 0.0F);
        this.leftLeg6.addChild(cube_r15);
        this.setRotateAngle(cube_r15, 0.0F, 0.4363F, 0.0F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 31, 12, 0.0F, -1.5F, 0.0F, 6, 3, 0, 0.0F, false));

        this.rightLeg6 = new AdvancedModelRenderer(this);
        this.rightLeg6.setRotationPoint(-0.9F, 0.0F, -2.4F);
        this.body.addChild(rightLeg6);
        this.setRotateAngle(rightLeg6, 0.0F, 0.48F, 0.0F);


        this.cube_r16 = new AdvancedModelRenderer(this);
        this.cube_r16.setRotationPoint(0.1F, 0.0F, 0.0F);
        this.rightLeg6.addChild(cube_r16);
        this.setRotateAngle(cube_r16, 0.0F, -0.4363F, 0.0F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 31, 12, -6.0F, -1.5F, 0.0F, 6, 3, 0, 0.0F, true));

        this.leftLeg7 = new AdvancedModelRenderer(this);
        this.leftLeg7.setRotationPoint(0.9F, 0.0F, -1.8F);
        this.body.addChild(leftLeg7);
        this.setRotateAngle(leftLeg7, 0.0F, -0.48F, 0.0F);


        this.cube_r17 = new AdvancedModelRenderer(this);
        this.cube_r17.setRotationPoint(-0.1F, 0.0F, 0.0F);
        this.leftLeg7.addChild(cube_r17);
        this.setRotateAngle(cube_r17, 0.0F, 0.4363F, 0.0F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 31, 12, 0.0F, -1.5F, 0.0F, 6, 3, 0, 0.0F, false));

        this.rightLeg7 = new AdvancedModelRenderer(this);
        this.rightLeg7.setRotationPoint(-0.9F, 0.0F, -1.8F);
        this.body.addChild(rightLeg7);
        this.setRotateAngle(rightLeg7, 0.0F, 0.48F, 0.0F);


        this.cube_r18 = new AdvancedModelRenderer(this);
        this.cube_r18.setRotationPoint(0.1F, 0.0F, 0.0F);
        this.rightLeg7.addChild(cube_r18);
        this.setRotateAngle(cube_r18, 0.0F, -0.4363F, 0.0F);
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 31, 12, -6.0F, -1.5F, 0.0F, 6, 3, 0, 0.0F, true));

        this.leftLeg8 = new AdvancedModelRenderer(this);
        this.leftLeg8.setRotationPoint(0.9F, 0.0F, -1.1F);
        this.body.addChild(leftLeg8);
        this.setRotateAngle(leftLeg8, 0.0F, -0.5323F, 0.0F);


        this.cube_r19 = new AdvancedModelRenderer(this);
        this.cube_r19.setRotationPoint(-0.1F, 0.0F, 0.0F);
        this.leftLeg8.addChild(cube_r19);
        this.setRotateAngle(cube_r19, 0.0F, 0.4363F, 0.0F);
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 31, 12, 0.0F, -1.5F, 0.0F, 6, 3, 0, 0.0F, false));

        this.rightLeg8 = new AdvancedModelRenderer(this);
        this.rightLeg8.setRotationPoint(-0.9F, 0.0F, -1.1F);
        this.body.addChild(rightLeg8);
        this.setRotateAngle(rightLeg8, 0.0F, 0.5323F, 0.0F);


        this.cube_r20 = new AdvancedModelRenderer(this);
        this.cube_r20.setRotationPoint(0.1F, 0.0F, 0.0F);
        this.rightLeg8.addChild(cube_r20);
        this.setRotateAngle(cube_r20, 0.0F, -0.4363F, 0.0F);
        this.cube_r20.cubeList.add(new ModelBox(cube_r20, 31, 12, -6.0F, -1.5F, 0.0F, 6, 3, 0, 0.0F, true));

        this.leftLeg9 = new AdvancedModelRenderer(this);
        this.leftLeg9.setRotationPoint(0.9F, 0.0F, -0.4F);
        this.body.addChild(leftLeg9);
        this.setRotateAngle(leftLeg9, 0.0F, -0.5847F, 0.0F);


        this.cube_r21 = new AdvancedModelRenderer(this);
        this.cube_r21.setRotationPoint(-0.1F, 0.0F, 0.0F);
        this.leftLeg9.addChild(cube_r21);
        this.setRotateAngle(cube_r21, 0.0F, 0.4363F, 0.0F);
        this.cube_r21.cubeList.add(new ModelBox(cube_r21, 31, 12, 0.0F, -1.5F, 0.0F, 6, 3, 0, 0.0F, false));

        this.rightLeg9 = new AdvancedModelRenderer(this);
        this.rightLeg9.setRotationPoint(-0.9F, 0.0F, -0.4F);
        this.body.addChild(rightLeg9);
        this.setRotateAngle(rightLeg9, 0.0F, 0.5847F, 0.0F);


        this.cube_r22 = new AdvancedModelRenderer(this);
        this.cube_r22.setRotationPoint(0.1F, 0.0F, 0.0F);
        this.rightLeg9.addChild(cube_r22);
        this.setRotateAngle(cube_r22, 0.0F, -0.4363F, 0.0F);
        this.cube_r22.cubeList.add(new ModelBox(cube_r22, 31, 12, -6.0F, -1.5F, 0.0F, 6, 3, 0, 0.0F, true));

        this.leftLeg10 = new AdvancedModelRenderer(this);
        this.leftLeg10.setRotationPoint(0.9F, 0.0F, 0.3F);
        this.body.addChild(leftLeg10);
        this.setRotateAngle(leftLeg10, 0.0F, -0.6196F, 0.0F);


        this.cube_r23 = new AdvancedModelRenderer(this);
        this.cube_r23.setRotationPoint(-0.1F, 0.0F, 0.0F);
        this.leftLeg10.addChild(cube_r23);
        this.setRotateAngle(cube_r23, 0.0F, 0.4363F, 0.0F);
        this.cube_r23.cubeList.add(new ModelBox(cube_r23, 31, 12, 0.0F, -1.5F, 0.0F, 6, 3, 0, 0.0F, false));

        this.rightLeg10 = new AdvancedModelRenderer(this);
        this.rightLeg10.setRotationPoint(-0.9F, 0.0F, 0.3F);
        this.body.addChild(rightLeg10);
        this.setRotateAngle(rightLeg10, 0.0F, 0.6196F, 0.0F);


        this.cube_r24 = new AdvancedModelRenderer(this);
        this.cube_r24.setRotationPoint(0.1F, 0.0F, 0.0F);
        this.rightLeg10.addChild(cube_r24);
        this.setRotateAngle(cube_r24, 0.0F, -0.4363F, 0.0F);
        this.cube_r24.cubeList.add(new ModelBox(cube_r24, 31, 12, -6.0F, -1.5F, 0.0F, 6, 3, 0, 0.0F, true));

        this.leftLeg11 = new AdvancedModelRenderer(this);
        this.leftLeg11.setRotationPoint(0.9F, 0.0F, 1.0F);
        this.body.addChild(leftLeg11);
        this.setRotateAngle(leftLeg11, 0.0F, -0.7069F, 0.0F);


        this.cube_r25 = new AdvancedModelRenderer(this);
        this.cube_r25.setRotationPoint(-0.1F, 0.0F, 0.0F);
        this.leftLeg11.addChild(cube_r25);
        this.setRotateAngle(cube_r25, 0.0F, 0.4363F, 0.0F);
        this.cube_r25.cubeList.add(new ModelBox(cube_r25, 31, 12, 0.0F, -1.5F, 0.0F, 6, 3, 0, 0.0F, false));

        this.rightLeg11 = new AdvancedModelRenderer(this);
        this.rightLeg11.setRotationPoint(-0.9F, 0.0F, 1.0F);
        this.body.addChild(rightLeg11);
        this.setRotateAngle(rightLeg11, 0.0F, 0.7069F, 0.0F);


        this.cube_r26 = new AdvancedModelRenderer(this);
        this.cube_r26.setRotationPoint(0.1F, 0.0F, 0.0F);
        this.rightLeg11.addChild(cube_r26);
        this.setRotateAngle(cube_r26, 0.0F, -0.4363F, 0.0F);
        this.cube_r26.cubeList.add(new ModelBox(cube_r26, 31, 12, -6.0F, -1.5F, 0.0F, 6, 3, 0, 0.0F, true));

        this.leftLeg12 = new AdvancedModelRenderer(this);
        this.leftLeg12.setRotationPoint(1.0F, 0.1F, 1.5F);
        this.body.addChild(leftLeg12);
        this.setRotateAngle(leftLeg12, 0.0F, -0.8552F, 0.0F);


        this.cube_r27 = new AdvancedModelRenderer(this);
        this.cube_r27.setRotationPoint(-0.5205F, 1.4F, 1.3598F);
        this.leftLeg12.addChild(cube_r27);
        this.setRotateAngle(cube_r27, 0.0F, 0.4014F, 0.0F);
        this.cube_r27.cubeList.add(new ModelBox(cube_r27, 31, 8, 1.0F, -3.0F, -1.0F, 8, 3, 0, 0.0F, false));

        this.rightLeg12 = new AdvancedModelRenderer(this);
        this.rightLeg12.setRotationPoint(-1.0F, 0.1F, 1.5F);
        this.body.addChild(rightLeg12);
        this.setRotateAngle(rightLeg12, 0.0F, 0.8552F, 0.0F);


        this.cube_r28 = new AdvancedModelRenderer(this);
        this.cube_r28.setRotationPoint(0.5205F, 1.4F, 1.3598F);
        this.rightLeg12.addChild(cube_r28);
        this.setRotateAngle(cube_r28, 0.0F, -0.4014F, 0.0F);
        this.cube_r28.cubeList.add(new ModelBox(cube_r28, 31, 8, -9.0F, -3.0F, -1.0F, 8, 3, 0, 0.0F, true));

        this.leftLeg13 = new AdvancedModelRenderer(this);
        this.leftLeg13.setRotationPoint(1.0F, 0.1F, 2.2F);
        this.body.addChild(leftLeg13);
        this.setRotateAngle(leftLeg13, 0.0F, -1.0647F, 0.0F);


        this.cube_r29 = new AdvancedModelRenderer(this);
        this.cube_r29.setRotationPoint(-0.5205F, 1.4F, 1.3598F);
        this.leftLeg13.addChild(cube_r29);
        this.setRotateAngle(cube_r29, 0.0F, 0.4014F, 0.0F);
        this.cube_r29.cubeList.add(new ModelBox(cube_r29, 31, 8, 1.0F, -3.0F, -1.0F, 8, 3, 0, 0.0F, false));

        this.rightLeg13 = new AdvancedModelRenderer(this);
        this.rightLeg13.setRotationPoint(-1.0F, 0.1F, 2.2F);
        this.body.addChild(rightLeg13);
        this.setRotateAngle(rightLeg13, 0.0F, 1.0647F, 0.0F);


        this.cube_r30 = new AdvancedModelRenderer(this);
        this.cube_r30.setRotationPoint(0.5205F, 1.4F, 1.3598F);
        this.rightLeg13.addChild(cube_r30);
        this.setRotateAngle(cube_r30, 0.0F, -0.4014F, 0.0F);
        this.cube_r30.cubeList.add(new ModelBox(cube_r30, 31, 8, -9.0F, -3.0F, -1.0F, 8, 3, 0, 0.0F, true));

        this.leftLeg14 = new AdvancedModelRenderer(this);
        this.leftLeg14.setRotationPoint(1.0F, 0.1F, 3.1F);
        this.body.addChild(leftLeg14);
        this.setRotateAngle(leftLeg14, 0.0F, -1.3439F, 0.0F);


        this.cube_r31 = new AdvancedModelRenderer(this);
        this.cube_r31.setRotationPoint(-0.5205F, 1.4F, 1.3598F);
        this.leftLeg14.addChild(cube_r31);
        this.setRotateAngle(cube_r31, 0.0F, 0.4014F, 0.0F);
        this.cube_r31.cubeList.add(new ModelBox(cube_r31, 31, 4, 1.0F, -3.0F, -1.0F, 9, 3, 0, 0.0F, false));

        this.rightLeg14 = new AdvancedModelRenderer(this);
        this.rightLeg14.setRotationPoint(-1.0F, 0.1F, 3.1F);
        this.body.addChild(rightLeg14);
        this.setRotateAngle(rightLeg14, 0.0F, 1.3439F, 0.0F);


        this.cube_r32 = new AdvancedModelRenderer(this);
        this.cube_r32.setRotationPoint(0.5205F, 1.4F, 1.3598F);
        this.rightLeg14.addChild(cube_r32);
        this.setRotateAngle(cube_r32, 0.0F, -0.4014F, 0.0F);
        this.cube_r32.cubeList.add(new ModelBox(cube_r32, 31, 4, -10.0F, -3.0F, -1.0F, 9, 3, 0, 0.0F, true));

        this.leftLeg15 = new AdvancedModelRenderer(this);
        this.leftLeg15.setRotationPoint(1.0F, 0.1F, 4.8F);
        this.body.addChild(leftLeg15);
        this.setRotateAngle(leftLeg15, 0.0F, -1.5882F, 0.0F);


        this.cube_r33 = new AdvancedModelRenderer(this);
        this.cube_r33.setRotationPoint(-0.5205F, 1.4F, 1.3598F);
        this.leftLeg15.addChild(cube_r33);
        this.setRotateAngle(cube_r33, 0.0F, 0.4014F, 0.0F);
        this.cube_r33.cubeList.add(new ModelBox(cube_r33, 31, 0, 1.0F, -3.0F, -1.0F, 10, 3, 0, 0.0F, false));

        this.rightLeg15 = new AdvancedModelRenderer(this);
        this.rightLeg15.setRotationPoint(-1.0F, 0.1F, 4.8F);
        this.body.addChild(rightLeg15);
        this.setRotateAngle(rightLeg15, 0.0F, 1.5882F, 0.0F);


        this.cube_r34 = new AdvancedModelRenderer(this);
        this.cube_r34.setRotationPoint(0.5205F, 1.4F, 1.3598F);
        this.rightLeg15.addChild(cube_r34);
        this.setRotateAngle(cube_r34, 0.0F, -0.4014F, 0.0F);
        this.cube_r34.cubeList.add(new ModelBox(cube_r34, 31, 0, -11.0F, -3.0F, -1.0F, 10, 3, 0, 0.0F, true));

        this.ultimatelegleft = new AdvancedModelRenderer(this);
        this.ultimatelegleft.setRotationPoint(0.7F, -0.2F, 5.7F);
        this.body.addChild(ultimatelegleft);
        this.setRotateAngle(ultimatelegleft, -2.3965F, -1.1575F, 0.8149F);


        this.cube_r35 = new AdvancedModelRenderer(this);
        this.cube_r35.setRotationPoint(-0.5205F, 2.4F, 1.3598F);
        this.ultimatelegleft.addChild(cube_r35);
        this.setRotateAngle(cube_r35, 0.0F, 0.4014F, 0.0F);
        this.cube_r35.cubeList.add(new ModelBox(cube_r35, 0, 21, 1.0F, -3.0F, -1.0F, 16, 5, 0, 0.0F, false));

        this.ultimatelegright = new AdvancedModelRenderer(this);
        this.ultimatelegright.setRotationPoint(-0.7F, -0.2F, 5.7F);
        this.body.addChild(ultimatelegright);
        this.setRotateAngle(ultimatelegright, -2.3965F, 1.1575F, -0.8149F);


        this.cube_r36 = new AdvancedModelRenderer(this);
        this.cube_r36.setRotationPoint(0.5205F, 2.4F, 1.3598F);
        this.ultimatelegright.addChild(cube_r36);
        this.setRotateAngle(cube_r36, 0.0F, -0.4014F, 0.0F);
        this.cube_r36.cubeList.add(new ModelBox(cube_r36, 0, 21, -17.0F, -3.0F, -1.0F, 16, 5, 0, 0.0F, true));

        updateDefaultPose();
        animator = ModelAnimator.create();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        animate((IAnimatedEntity) entity, f, f1, f2, f3, f4, f5);
        this.body.render(f5);
    }
    public void renderStaticFloor(float f) {
        this.resetToDefaultPose();
    }
    @Override
    public void renderStaticBook(float f) {
        //Rotations, positions and sizing:
        this.body.offsetY = -2.8F;
        this.body.offsetX = -1.1F;
        this.body.offsetZ = 2.0F;
        this.body.rotateAngleY = (float)Math.toRadians(120);
        this.body.rotateAngleX = (float)Math.toRadians(1);
        this.body.rotateAngleZ = (float)Math.toRadians(0);
        this.body.scaleChildren = true;
        float scaler = 4.0F;
        this.body.setScale(scaler, scaler, scaler);
        //Start of pose:

        //End of pose, now render the model:
        this.body.render(f);
        //Reset rotations, positions and sizing:
        this.body.setScale(1.0F, 1.0F, 1.0F);
        this.body.scaleChildren = false;
        resetToDefaultPose();

    }

    public void renderStaticDisplayCase(float f) {
        this.body.offsetZ = -0.020F;
        this.body.render(0.01f);
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
        EntityPrehistoricFloraMyriapod ee = (EntityPrehistoricFloraMyriapod) entitylivingbaseIn;

        if (ee.getIsFast()) {
            animRun(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
        }
        else if(ee.getIsMoving()){
            animWalk(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
        }

    }

    public void animWalk(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraMyriapod entity = (EntityPrehistoricFloraMyriapod) entitylivingbaseIn;
        int animCycle = 48;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians((Math.sin((Math.PI/180)*((((double)tickAnim/20D))*(376*2))-90))), body.rotateAngleY + (float) Math.toRadians(0), body.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(leftAntenna1, leftAntenna1.rotateAngleX + (float) Math.toRadians(7.5-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*(300))+450)*13), leftAntenna1.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*(376*2)))*3), leftAntenna1.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(rightAntenna1, rightAntenna1.rotateAngleX + (float) Math.toRadians(12.5-(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*(300))))*10), rightAntenna1.rotateAngleY + (float) Math.toRadians(-(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*(376*2))))*3), rightAntenna1.rotateAngleZ + (float) Math.toRadians(0));



        if (tickAnim >= 0 && tickAnim < 8) {
            xx = -7.32438 + (((tickAnim - 0) / 8) * (0.59034-(-7.32438)));
            yy = 21.29336 + (((tickAnim - 0) / 8) * (-24.53172-(21.29336)));
            zz = 1.89957 + (((tickAnim - 0) / 8) * (0.2042-(1.89957)));
        }
        else if (tickAnim >= 8 && tickAnim < 12) {
            xx = 0.59034 + (((tickAnim - 8) / 4) * (-8.78775-(0.59034)));
            yy = -24.53172 + (((tickAnim - 8) / 4) * (-0.47627-(-24.53172)));
            zz = 0.2042 + (((tickAnim - 8) / 4) * (-20.8186-(0.2042)));
        }
        else if (tickAnim >= 12 && tickAnim < 16) {
            xx = -8.78775 + (((tickAnim - 12) / 4) * (-7.32438-(-8.78775)));
            yy = -0.47627 + (((tickAnim - 12) / 4) * (21.29336-(-0.47627)));
            zz = -20.8186 + (((tickAnim - 12) / 4) * (1.89957-(-20.8186)));
        }
        else if (tickAnim >= 16 && tickAnim < 24) {
            xx = -7.32438 + (((tickAnim - 16) / 8) * (0.59034-(-7.32438)));
            yy = 21.29336 + (((tickAnim - 16) / 8) * (-24.53172-(21.29336)));
            zz = 1.89957 + (((tickAnim - 16) / 8) * (0.2042-(1.89957)));
        }
        else if (tickAnim >= 24 && tickAnim < 28) {
            xx = 0.59034 + (((tickAnim - 24) / 4) * (-8.78775-(0.59034)));
            yy = -24.53172 + (((tickAnim - 24) / 4) * (-0.47627-(-24.53172)));
            zz = 0.2042 + (((tickAnim - 24) / 4) * (-20.8186-(0.2042)));
        }
        else if (tickAnim >= 28 && tickAnim < 32) {
            xx = -8.78775 + (((tickAnim - 28) / 4) * (-7.32438-(-8.78775)));
            yy = -0.47627 + (((tickAnim - 28) / 4) * (21.29336-(-0.47627)));
            zz = -20.8186 + (((tickAnim - 28) / 4) * (1.89957-(-20.8186)));
        }
        else if (tickAnim >= 32 && tickAnim < 40) {
            xx = -7.32438 + (((tickAnim - 32) / 8) * (0.59034-(-7.32438)));
            yy = 21.29336 + (((tickAnim - 32) / 8) * (-24.53172-(21.29336)));
            zz = 1.89957 + (((tickAnim - 32) / 8) * (0.2042-(1.89957)));
        }
        else if (tickAnim >= 40 && tickAnim < 44) {
            xx = 0.59034 + (((tickAnim - 40) / 4) * (-8.78775-(0.59034)));
            yy = -24.53172 + (((tickAnim - 40) / 4) * (-0.47627-(-24.53172)));
            zz = 0.2042 + (((tickAnim - 40) / 4) * (-20.8186-(0.2042)));
        }
        else if (tickAnim >= 44 && tickAnim < 48) {
            xx = -8.78775 + (((tickAnim - 44) / 4) * (-7.32438-(-8.78775)));
            yy = -0.47627 + (((tickAnim - 44) / 4) * (21.29336-(-0.47627)));
            zz = -20.8186 + (((tickAnim - 44) / 4) * (1.89957-(-20.8186)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg1, leftLeg1.rotateAngleX + (float) Math.toRadians(xx), leftLeg1.rotateAngleY + (float) Math.toRadians(yy), leftLeg1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0.59034 + (((tickAnim - 0) / 4) * (-8.78775-(0.59034)));
            yy = 24.53172 + (((tickAnim - 0) / 4) * (0.47627-(24.53172)));
            zz = -0.2042 + (((tickAnim - 0) / 4) * (20.8186-(-0.2042)));
        }
        else if (tickAnim >= 4 && tickAnim < 8) {
            xx = -8.78775 + (((tickAnim - 4) / 4) * (-7.32438-(-8.78775)));
            yy = 0.47627 + (((tickAnim - 4) / 4) * (-21.29336-(0.47627)));
            zz = 20.8186 + (((tickAnim - 4) / 4) * (-1.89957-(20.8186)));
        }
        else if (tickAnim >= 8 && tickAnim < 16) {
            xx = -7.32438 + (((tickAnim - 8) / 8) * (0.59034-(-7.32438)));
            yy = -21.29336 + (((tickAnim - 8) / 8) * (24.53172-(-21.29336)));
            zz = -1.89957 + (((tickAnim - 8) / 8) * (-0.2042-(-1.89957)));
        }
        else if (tickAnim >= 16 && tickAnim < 20) {
            xx = 0.59034 + (((tickAnim - 16) / 4) * (-8.78775-(0.59034)));
            yy = 24.53172 + (((tickAnim - 16) / 4) * (0.47627-(24.53172)));
            zz = -0.2042 + (((tickAnim - 16) / 4) * (20.8186-(-0.2042)));
        }
        else if (tickAnim >= 20 && tickAnim < 24) {
            xx = -8.78775 + (((tickAnim - 20) / 4) * (-7.32438-(-8.78775)));
            yy = 0.47627 + (((tickAnim - 20) / 4) * (-21.29336-(0.47627)));
            zz = 20.8186 + (((tickAnim - 20) / 4) * (-1.89957-(20.8186)));
        }
        else if (tickAnim >= 24 && tickAnim < 32) {
            xx = -7.32438 + (((tickAnim - 24) / 8) * (0.59034-(-7.32438)));
            yy = -21.29336 + (((tickAnim - 24) / 8) * (24.53172-(-21.29336)));
            zz = -1.89957 + (((tickAnim - 24) / 8) * (-0.2042-(-1.89957)));
        }
        else if (tickAnim >= 32 && tickAnim < 36) {
            xx = 0.59034 + (((tickAnim - 32) / 4) * (-8.78775-(0.59034)));
            yy = 24.53172 + (((tickAnim - 32) / 4) * (0.47627-(24.53172)));
            zz = -0.2042 + (((tickAnim - 32) / 4) * (20.8186-(-0.2042)));
        }
        else if (tickAnim >= 36 && tickAnim < 40) {
            xx = -8.78775 + (((tickAnim - 36) / 4) * (-7.32438-(-8.78775)));
            yy = 0.47627 + (((tickAnim - 36) / 4) * (-21.29336-(0.47627)));
            zz = 20.8186 + (((tickAnim - 36) / 4) * (-1.89957-(20.8186)));
        }
        else if (tickAnim >= 40 && tickAnim < 48) {
            xx = -7.32438 + (((tickAnim - 40) / 8) * (0.59034-(-7.32438)));
            yy = -21.29336 + (((tickAnim - 40) / 8) * (24.53172-(-21.29336)));
            zz = -1.89957 + (((tickAnim - 40) / 8) * (-0.2042-(-1.89957)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg1, rightLeg1.rotateAngleX + (float) Math.toRadians(xx), rightLeg1.rotateAngleY + (float) Math.toRadians(yy), rightLeg1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 6) {
            xx = -0.01 + (((tickAnim - 0) / 6) * (-0.0231-(-0.01)));
            yy = 8.75 + (((tickAnim - 0) / 6) * (-17.5014-(8.75)));
            zz = -0.04 + (((tickAnim - 0) / 6) * (-0.1733-(-0.04)));
        }
        else if (tickAnim >= 6 && tickAnim < 10) {
            xx = -0.0231 + (((tickAnim - 6) / 4) * (-15.76886-(-0.0231)));
            yy = -17.5014 + (((tickAnim - 6) / 4) * (-9.767-(-17.5014)));
            zz = -0.1733 + (((tickAnim - 6) / 4) * (-29.28473-(-0.1733)));
        }
        else if (tickAnim >= 10 && tickAnim < 14) {
            xx = -15.76886 + (((tickAnim - 10) / 4) * (0-(-15.76886)));
            yy = -9.767 + (((tickAnim - 10) / 4) * (17.5-(-9.767)));
            zz = -29.28473 + (((tickAnim - 10) / 4) * (0-(-29.28473)));
        }
        else if (tickAnim >= 14 && tickAnim < 22) {
            xx = 0 + (((tickAnim - 14) / 8) * (-0.0231-(0)));
            yy = 17.5 + (((tickAnim - 14) / 8) * (-17.5014-(17.5)));
            zz = 0 + (((tickAnim - 14) / 8) * (-0.1733-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 26) {
            xx = -0.0231 + (((tickAnim - 22) / 4) * (-15.76886-(-0.0231)));
            yy = -17.5014 + (((tickAnim - 22) / 4) * (-9.767-(-17.5014)));
            zz = -0.1733 + (((tickAnim - 22) / 4) * (-29.28473-(-0.1733)));
        }
        else if (tickAnim >= 26 && tickAnim < 30) {
            xx = -15.76886 + (((tickAnim - 26) / 4) * (0-(-15.76886)));
            yy = -9.767 + (((tickAnim - 26) / 4) * (17.5-(-9.767)));
            zz = -29.28473 + (((tickAnim - 26) / 4) * (0-(-29.28473)));
        }
        else if (tickAnim >= 30 && tickAnim < 38) {
            xx = 0 + (((tickAnim - 30) / 8) * (-0.0231-(0)));
            yy = 17.5 + (((tickAnim - 30) / 8) * (-17.5014-(17.5)));
            zz = 0 + (((tickAnim - 30) / 8) * (-0.1733-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 42) {
            xx = -0.0231 + (((tickAnim - 38) / 4) * (-15.76886-(-0.0231)));
            yy = -17.5014 + (((tickAnim - 38) / 4) * (-9.767-(-17.5014)));
            zz = -0.1733 + (((tickAnim - 38) / 4) * (-29.28473-(-0.1733)));
        }
        else if (tickAnim >= 42 && tickAnim < 46) {
            xx = -15.76886 + (((tickAnim - 42) / 4) * (0-(-15.76886)));
            yy = -9.767 + (((tickAnim - 42) / 4) * (17.5-(-9.767)));
            zz = -29.28473 + (((tickAnim - 42) / 4) * (0-(-29.28473)));
        }
        else if (tickAnim >= 46 && tickAnim < 48) {
            xx = 0 + (((tickAnim - 46) / 2) * (-0.01-(0)));
            yy = 17.5 + (((tickAnim - 46) / 2) * (8.75-(17.5)));
            zz = 0 + (((tickAnim - 46) / 2) * (-0.04-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg2, leftLeg2.rotateAngleX + (float) Math.toRadians(xx), leftLeg2.rotateAngleY + (float) Math.toRadians(yy), leftLeg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = -7.9 + (((tickAnim - 0) / 2) * (-15.76886-(-7.9)));
            yy = 13.63 + (((tickAnim - 0) / 2) * (9.767-(13.63)));
            zz = 14.73 + (((tickAnim - 0) / 2) * (29.28473-(14.73)));
        }
        else if (tickAnim >= 2 && tickAnim < 6) {
            xx = -15.76886 + (((tickAnim - 2) / 4) * (0-(-15.76886)));
            yy = 9.767 + (((tickAnim - 2) / 4) * (-17.5-(9.767)));
            zz = 29.28473 + (((tickAnim - 2) / 4) * (0-(29.28473)));
        }
        else if (tickAnim >= 6 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 6) / 8) * (-0.0231-(0)));
            yy = -17.5 + (((tickAnim - 6) / 8) * (17.5014-(-17.5)));
            zz = 0 + (((tickAnim - 6) / 8) * (0.1733-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 18) {
            xx = -0.0231 + (((tickAnim - 14) / 4) * (-15.76886-(-0.0231)));
            yy = 17.5014 + (((tickAnim - 14) / 4) * (9.767-(17.5014)));
            zz = 0.1733 + (((tickAnim - 14) / 4) * (29.28473-(0.1733)));
        }
        else if (tickAnim >= 18 && tickAnim < 22) {
            xx = -15.76886 + (((tickAnim - 18) / 4) * (0-(-15.76886)));
            yy = 9.767 + (((tickAnim - 18) / 4) * (-17.5-(9.767)));
            zz = 29.28473 + (((tickAnim - 18) / 4) * (0-(29.28473)));
        }
        else if (tickAnim >= 22 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 22) / 8) * (-0.0231-(0)));
            yy = -17.5 + (((tickAnim - 22) / 8) * (17.5014-(-17.5)));
            zz = 0 + (((tickAnim - 22) / 8) * (0.1733-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 34) {
            xx = -0.0231 + (((tickAnim - 30) / 4) * (-15.76886-(-0.0231)));
            yy = 17.5014 + (((tickAnim - 30) / 4) * (9.767-(17.5014)));
            zz = 0.1733 + (((tickAnim - 30) / 4) * (29.28473-(0.1733)));
        }
        else if (tickAnim >= 34 && tickAnim < 38) {
            xx = -15.76886 + (((tickAnim - 34) / 4) * (0-(-15.76886)));
            yy = 9.767 + (((tickAnim - 34) / 4) * (-17.5-(9.767)));
            zz = 29.28473 + (((tickAnim - 34) / 4) * (0-(29.28473)));
        }
        else if (tickAnim >= 38 && tickAnim < 46) {
            xx = 0 + (((tickAnim - 38) / 8) * (-0.0231-(0)));
            yy = -17.5 + (((tickAnim - 38) / 8) * (17.5014-(-17.5)));
            zz = 0 + (((tickAnim - 38) / 8) * (0.1733-(0)));
        }
        else if (tickAnim >= 46 && tickAnim < 48) {
            xx = -0.0231 + (((tickAnim - 46) / 2) * (-7.9-(-0.0231)));
            yy = 17.5014 + (((tickAnim - 46) / 2) * (13.63-(17.5014)));
            zz = 0.1733 + (((tickAnim - 46) / 2) * (14.73-(0.1733)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg2, rightLeg2.rotateAngleX + (float) Math.toRadians(xx), rightLeg2.rotateAngleY + (float) Math.toRadians(yy), rightLeg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = -0.01 + (((tickAnim - 0) / 4) * (-0.01771-(-0.01)));
            yy = 3 + (((tickAnim - 0) / 4) * (-12.50154-(3)));
            zz = -0.09 + (((tickAnim - 0) / 4) * (-0.16446-(-0.09)));
        }
        else if (tickAnim >= 4 && tickAnim < 8) {
            xx = -0.01771 + (((tickAnim - 4) / 4) * (-7.40148-(-0.01771)));
            yy = -12.50154 + (((tickAnim - 4) / 4) * (-2.72421-(-12.50154)));
            zz = -0.16446 + (((tickAnim - 4) / 4) * (-23.62591-(-0.16446)));
        }
        else if (tickAnim >= 8 && tickAnim < 12) {
            xx = -7.40148 + (((tickAnim - 8) / 4) * (0.00017-(-7.40148)));
            yy = -2.72421 + (((tickAnim - 8) / 4) * (18.50005-(-2.72421)));
            zz = -23.62591 + (((tickAnim - 8) / 4) * (-0.01264-(-23.62591)));
        }
        else if (tickAnim >= 12 && tickAnim < 20) {
            xx = 0.00017 + (((tickAnim - 12) / 8) * (-0.01771-(0.00017)));
            yy = 18.50005 + (((tickAnim - 12) / 8) * (-12.50154-(18.50005)));
            zz = -0.01264 + (((tickAnim - 12) / 8) * (-0.16446-(-0.01264)));
        }
        else if (tickAnim >= 20 && tickAnim < 24) {
            xx = -0.01771 + (((tickAnim - 20) / 4) * (-7.40148-(-0.01771)));
            yy = -12.50154 + (((tickAnim - 20) / 4) * (-2.72421-(-12.50154)));
            zz = -0.16446 + (((tickAnim - 20) / 4) * (-23.62591-(-0.16446)));
        }
        else if (tickAnim >= 24 && tickAnim < 28) {
            xx = -7.40148 + (((tickAnim - 24) / 4) * (0.00017-(-7.40148)));
            yy = -2.72421 + (((tickAnim - 24) / 4) * (18.50005-(-2.72421)));
            zz = -23.62591 + (((tickAnim - 24) / 4) * (-0.01264-(-23.62591)));
        }
        else if (tickAnim >= 28 && tickAnim < 36) {
            xx = 0.00017 + (((tickAnim - 28) / 8) * (-0.01771-(0.00017)));
            yy = 18.50005 + (((tickAnim - 28) / 8) * (-12.50154-(18.50005)));
            zz = -0.01264 + (((tickAnim - 28) / 8) * (-0.16446-(-0.01264)));
        }
        else if (tickAnim >= 36 && tickAnim < 40) {
            xx = -0.01771 + (((tickAnim - 36) / 4) * (-7.40148-(-0.01771)));
            yy = -12.50154 + (((tickAnim - 36) / 4) * (-2.72421-(-12.50154)));
            zz = -0.16446 + (((tickAnim - 36) / 4) * (-23.62591-(-0.16446)));
        }
        else if (tickAnim >= 40 && tickAnim < 44) {
            xx = -7.40148 + (((tickAnim - 40) / 4) * (0.00017-(-7.40148)));
            yy = -2.72421 + (((tickAnim - 40) / 4) * (18.50005-(-2.72421)));
            zz = -23.62591 + (((tickAnim - 40) / 4) * (-0.01264-(-23.62591)));
        }
        else if (tickAnim >= 44 && tickAnim < 48) {
            xx = 0.00017 + (((tickAnim - 44) / 4) * (-0.01-(0.00017)));
            yy = 18.50005 + (((tickAnim - 44) / 4) * (3-(18.50005)));
            zz = -0.01264 + (((tickAnim - 44) / 4) * (-0.09-(-0.01264)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg3, leftLeg3.rotateAngleX + (float) Math.toRadians(xx), leftLeg3.rotateAngleY + (float) Math.toRadians(yy), leftLeg3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = -7.40148 + (((tickAnim - 0) / 4) * (0.00017-(-7.40148)));
            yy = 2.72421 + (((tickAnim - 0) / 4) * (-18.50005-(2.72421)));
            zz = 23.62591 + (((tickAnim - 0) / 4) * (0.01264-(23.62591)));
        }
        else if (tickAnim >= 4 && tickAnim < 12) {
            xx = 0.00017 + (((tickAnim - 4) / 8) * (-0.01771-(0.00017)));
            yy = -18.50005 + (((tickAnim - 4) / 8) * (12.50154-(-18.50005)));
            zz = 0.01264 + (((tickAnim - 4) / 8) * (0.16446-(0.01264)));
        }
        else if (tickAnim >= 12 && tickAnim < 16) {
            xx = -0.01771 + (((tickAnim - 12) / 4) * (-7.40148-(-0.01771)));
            yy = 12.50154 + (((tickAnim - 12) / 4) * (2.72421-(12.50154)));
            zz = 0.16446 + (((tickAnim - 12) / 4) * (23.62591-(0.16446)));
        }
        else if (tickAnim >= 16 && tickAnim < 20) {
            xx = -7.40148 + (((tickAnim - 16) / 4) * (0.00017-(-7.40148)));
            yy = 2.72421 + (((tickAnim - 16) / 4) * (-18.50005-(2.72421)));
            zz = 23.62591 + (((tickAnim - 16) / 4) * (0.01264-(23.62591)));
        }
        else if (tickAnim >= 20 && tickAnim < 28) {
            xx = 0.00017 + (((tickAnim - 20) / 8) * (-0.01771-(0.00017)));
            yy = -18.50005 + (((tickAnim - 20) / 8) * (12.50154-(-18.50005)));
            zz = 0.01264 + (((tickAnim - 20) / 8) * (0.16446-(0.01264)));
        }
        else if (tickAnim >= 28 && tickAnim < 32) {
            xx = -0.01771 + (((tickAnim - 28) / 4) * (-7.40148-(-0.01771)));
            yy = 12.50154 + (((tickAnim - 28) / 4) * (2.72421-(12.50154)));
            zz = 0.16446 + (((tickAnim - 28) / 4) * (23.62591-(0.16446)));
        }
        else if (tickAnim >= 32 && tickAnim < 36) {
            xx = -7.40148 + (((tickAnim - 32) / 4) * (0.00017-(-7.40148)));
            yy = 2.72421 + (((tickAnim - 32) / 4) * (-18.50005-(2.72421)));
            zz = 23.62591 + (((tickAnim - 32) / 4) * (0.01264-(23.62591)));
        }
        else if (tickAnim >= 36 && tickAnim < 44) {
            xx = 0.00017 + (((tickAnim - 36) / 8) * (-0.01771-(0.00017)));
            yy = -18.50005 + (((tickAnim - 36) / 8) * (12.50154-(-18.50005)));
            zz = 0.01264 + (((tickAnim - 36) / 8) * (0.16446-(0.01264)));
        }
        else if (tickAnim >= 44 && tickAnim < 48) {
            xx = -0.01771 + (((tickAnim - 44) / 4) * (-7.40148-(-0.01771)));
            yy = 12.50154 + (((tickAnim - 44) / 4) * (2.72421-(12.50154)));
            zz = 0.16446 + (((tickAnim - 44) / 4) * (23.62591-(0.16446)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg3, rightLeg3.rotateAngleX + (float) Math.toRadians(xx), rightLeg3.rotateAngleY + (float) Math.toRadians(yy), rightLeg3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 0) / 2) * (-0.00097-(0)));
            yy = -2.5 + (((tickAnim - 0) / 2) * (-10.00029-(-2.5)));
            zz = -0.03 + (((tickAnim - 0) / 2) * (-0.03779-(-0.03)));
        }
        else if (tickAnim >= 2 && tickAnim < 6) {
            xx = -0.00097 + (((tickAnim - 2) / 4) * (2.29562-(-0.00097)));
            yy = -10.00029 + (((tickAnim - 2) / 4) * (3.34466-(-10.00029)));
            zz = -0.03779 + (((tickAnim - 2) / 4) * (-18.23352-(-0.03779)));
        }
        else if (tickAnim >= 6 && tickAnim < 10) {
            xx = 2.29562 + (((tickAnim - 6) / 4) * (0-(2.29562)));
            yy = 3.34466 + (((tickAnim - 6) / 4) * (20-(3.34466)));
            zz = -18.23352 + (((tickAnim - 6) / 4) * (0-(-18.23352)));
        }
        else if (tickAnim >= 10 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 10) / 8) * (-0.00097-(0)));
            yy = 20 + (((tickAnim - 10) / 8) * (-10.00029-(20)));
            zz = 0 + (((tickAnim - 10) / 8) * (-0.03779-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 22) {
            xx = -0.00097 + (((tickAnim - 18) / 4) * (2.29562-(-0.00097)));
            yy = -10.00029 + (((tickAnim - 18) / 4) * (3.34466-(-10.00029)));
            zz = -0.03779 + (((tickAnim - 18) / 4) * (-18.23352-(-0.03779)));
        }
        else if (tickAnim >= 22 && tickAnim < 26) {
            xx = 2.29562 + (((tickAnim - 22) / 4) * (0-(2.29562)));
            yy = 3.34466 + (((tickAnim - 22) / 4) * (20-(3.34466)));
            zz = -18.23352 + (((tickAnim - 22) / 4) * (0-(-18.23352)));
        }
        else if (tickAnim >= 26 && tickAnim < 34) {
            xx = 0 + (((tickAnim - 26) / 8) * (-0.00097-(0)));
            yy = 20 + (((tickAnim - 26) / 8) * (-10.00029-(20)));
            zz = 0 + (((tickAnim - 26) / 8) * (-0.03779-(0)));
        }
        else if (tickAnim >= 34 && tickAnim < 38) {
            xx = -0.00097 + (((tickAnim - 34) / 4) * (2.29562-(-0.00097)));
            yy = -10.00029 + (((tickAnim - 34) / 4) * (3.34466-(-10.00029)));
            zz = -0.03779 + (((tickAnim - 34) / 4) * (-18.23352-(-0.03779)));
        }
        else if (tickAnim >= 38 && tickAnim < 42) {
            xx = 2.29562 + (((tickAnim - 38) / 4) * (0-(2.29562)));
            yy = 3.34466 + (((tickAnim - 38) / 4) * (20-(3.34466)));
            zz = -18.23352 + (((tickAnim - 38) / 4) * (0-(-18.23352)));
        }
        else if (tickAnim >= 42 && tickAnim < 48) {
            xx = 0 + (((tickAnim - 42) / 6) * (0-(0)));
            yy = 20 + (((tickAnim - 42) / 6) * (-2.5-(20)));
            zz = 0 + (((tickAnim - 42) / 6) * (-0.03-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg4, leftLeg4.rotateAngleX + (float) Math.toRadians(xx), leftLeg4.rotateAngleY + (float) Math.toRadians(yy), leftLeg4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 1.15 + (((tickAnim - 0) / 2) * (0-(1.15)));
            yy = -11.67 + (((tickAnim - 0) / 2) * (-20-(-11.67)));
            zz = 9.12 + (((tickAnim - 0) / 2) * (0-(9.12)));
        }
        else if (tickAnim >= 2 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 2) / 8) * (-0.00097-(0)));
            yy = -20 + (((tickAnim - 2) / 8) * (10.00029-(-20)));
            zz = 0 + (((tickAnim - 2) / 8) * (0.03779-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 14) {
            xx = -0.00097 + (((tickAnim - 10) / 4) * (2.29562-(-0.00097)));
            yy = 10.00029 + (((tickAnim - 10) / 4) * (-3.34466-(10.00029)));
            zz = 0.03779 + (((tickAnim - 10) / 4) * (18.23352-(0.03779)));
        }
        else if (tickAnim >= 14 && tickAnim < 18) {
            xx = 2.29562 + (((tickAnim - 14) / 4) * (0-(2.29562)));
            yy = -3.34466 + (((tickAnim - 14) / 4) * (-20-(-3.34466)));
            zz = 18.23352 + (((tickAnim - 14) / 4) * (0-(18.23352)));
        }
        else if (tickAnim >= 18 && tickAnim < 26) {
            xx = 0 + (((tickAnim - 18) / 8) * (-0.00097-(0)));
            yy = -20 + (((tickAnim - 18) / 8) * (10.00029-(-20)));
            zz = 0 + (((tickAnim - 18) / 8) * (0.03779-(0)));
        }
        else if (tickAnim >= 26 && tickAnim < 30) {
            xx = -0.00097 + (((tickAnim - 26) / 4) * (2.29562-(-0.00097)));
            yy = 10.00029 + (((tickAnim - 26) / 4) * (-3.34466-(10.00029)));
            zz = 0.03779 + (((tickAnim - 26) / 4) * (18.23352-(0.03779)));
        }
        else if (tickAnim >= 30 && tickAnim < 34) {
            xx = 2.29562 + (((tickAnim - 30) / 4) * (0-(2.29562)));
            yy = -3.34466 + (((tickAnim - 30) / 4) * (-20-(-3.34466)));
            zz = 18.23352 + (((tickAnim - 30) / 4) * (0-(18.23352)));
        }
        else if (tickAnim >= 34 && tickAnim < 42) {
            xx = 0 + (((tickAnim - 34) / 8) * (-0.00097-(0)));
            yy = -20 + (((tickAnim - 34) / 8) * (10.00029-(-20)));
            zz = 0 + (((tickAnim - 34) / 8) * (0.03779-(0)));
        }
        else if (tickAnim >= 42 && tickAnim < 46) {
            xx = -0.00097 + (((tickAnim - 42) / 4) * (2.29562-(-0.00097)));
            yy = 10.00029 + (((tickAnim - 42) / 4) * (-3.34466-(10.00029)));
            zz = 0.03779 + (((tickAnim - 42) / 4) * (18.23352-(0.03779)));
        }
        else if (tickAnim >= 46 && tickAnim < 48) {
            xx = 2.29562 + (((tickAnim - 46) / 2) * (1.15-(2.29562)));
            yy = -3.34466 + (((tickAnim - 46) / 2) * (-11.67-(-3.34466)));
            zz = 18.23352 + (((tickAnim - 46) / 2) * (9.12-(18.23352)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg4, rightLeg4.rotateAngleX + (float) Math.toRadians(xx), rightLeg4.rotateAngleY + (float) Math.toRadians(yy), rightLeg4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = -0.00059 + (((tickAnim - 0) / 4) * (-1.15091-(-0.00059)));
            yy = -10.0001 + (((tickAnim - 0) / 4) * (3.67456-(-10.0001)));
            zz = -0.02232 + (((tickAnim - 0) / 4) * (-7.58729-(-0.02232)));
        }
        else if (tickAnim >= 4 && tickAnim < 8) {
            xx = -1.15091 + (((tickAnim - 4) / 4) * (-0.00414-(-1.15091)));
            yy = 3.67456 + (((tickAnim - 4) / 4) * (12.50026-(3.67456)));
            zz = -7.58729 + (((tickAnim - 4) / 4) * (0.06287-(-7.58729)));
        }
        else if (tickAnim >= 8 && tickAnim < 16) {
            xx = -0.00414 + (((tickAnim - 8) / 8) * (-0.00059-(-0.00414)));
            yy = 12.50026 + (((tickAnim - 8) / 8) * (-10.0001-(12.50026)));
            zz = 0.06287 + (((tickAnim - 8) / 8) * (-0.02232-(0.06287)));
        }
        else if (tickAnim >= 16 && tickAnim < 20) {
            xx = -0.00059 + (((tickAnim - 16) / 4) * (-1.15091-(-0.00059)));
            yy = -10.0001 + (((tickAnim - 16) / 4) * (3.67456-(-10.0001)));
            zz = -0.02232 + (((tickAnim - 16) / 4) * (-7.58729-(-0.02232)));
        }
        else if (tickAnim >= 20 && tickAnim < 24) {
            xx = -1.15091 + (((tickAnim - 20) / 4) * (-0.00414-(-1.15091)));
            yy = 3.67456 + (((tickAnim - 20) / 4) * (12.50026-(3.67456)));
            zz = -7.58729 + (((tickAnim - 20) / 4) * (0.06287-(-7.58729)));
        }
        else if (tickAnim >= 24 && tickAnim < 32) {
            xx = -0.00414 + (((tickAnim - 24) / 8) * (-0.00059-(-0.00414)));
            yy = 12.50026 + (((tickAnim - 24) / 8) * (-10.0001-(12.50026)));
            zz = 0.06287 + (((tickAnim - 24) / 8) * (-0.02232-(0.06287)));
        }
        else if (tickAnim >= 32 && tickAnim < 36) {
            xx = -0.00059 + (((tickAnim - 32) / 4) * (-1.15091-(-0.00059)));
            yy = -10.0001 + (((tickAnim - 32) / 4) * (3.67456-(-10.0001)));
            zz = -0.02232 + (((tickAnim - 32) / 4) * (-7.58729-(-0.02232)));
        }
        else if (tickAnim >= 36 && tickAnim < 40) {
            xx = -1.15091 + (((tickAnim - 36) / 4) * (-0.00414-(-1.15091)));
            yy = 3.67456 + (((tickAnim - 36) / 4) * (12.50026-(3.67456)));
            zz = -7.58729 + (((tickAnim - 36) / 4) * (0.06287-(-7.58729)));
        }
        else if (tickAnim >= 40 && tickAnim < 48) {
            xx = -0.00414 + (((tickAnim - 40) / 8) * (-0.00059-(-0.00414)));
            yy = 12.50026 + (((tickAnim - 40) / 8) * (-10.0001-(12.50026)));
            zz = 0.06287 + (((tickAnim - 40) / 8) * (-0.02232-(0.06287)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg5, leftLeg5.rotateAngleX + (float) Math.toRadians(xx), leftLeg5.rotateAngleY + (float) Math.toRadians(yy), leftLeg5.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = -0.00414 + (((tickAnim - 0) / 8) * (-0.00059-(-0.00414)));
            yy = -12.50026 + (((tickAnim - 0) / 8) * (10.0001-(-12.50026)));
            zz = -0.06287 + (((tickAnim - 0) / 8) * (0.02232-(-0.06287)));
        }
        else if (tickAnim >= 8 && tickAnim < 12) {
            xx = -0.00059 + (((tickAnim - 8) / 4) * (-1.15091-(-0.00059)));
            yy = 10.0001 + (((tickAnim - 8) / 4) * (-3.67456-(10.0001)));
            zz = 0.02232 + (((tickAnim - 8) / 4) * (7.58729-(0.02232)));
        }
        else if (tickAnim >= 12 && tickAnim < 16) {
            xx = -1.15091 + (((tickAnim - 12) / 4) * (-0.00414-(-1.15091)));
            yy = -3.67456 + (((tickAnim - 12) / 4) * (-12.50026-(-3.67456)));
            zz = 7.58729 + (((tickAnim - 12) / 4) * (-0.06287-(7.58729)));
        }
        else if (tickAnim >= 16 && tickAnim < 24) {
            xx = -0.00414 + (((tickAnim - 16) / 8) * (-0.00059-(-0.00414)));
            yy = -12.50026 + (((tickAnim - 16) / 8) * (10.0001-(-12.50026)));
            zz = -0.06287 + (((tickAnim - 16) / 8) * (0.02232-(-0.06287)));
        }
        else if (tickAnim >= 24 && tickAnim < 28) {
            xx = -0.00059 + (((tickAnim - 24) / 4) * (-1.15091-(-0.00059)));
            yy = 10.0001 + (((tickAnim - 24) / 4) * (-3.67456-(10.0001)));
            zz = 0.02232 + (((tickAnim - 24) / 4) * (7.58729-(0.02232)));
        }
        else if (tickAnim >= 28 && tickAnim < 32) {
            xx = -1.15091 + (((tickAnim - 28) / 4) * (-0.00414-(-1.15091)));
            yy = -3.67456 + (((tickAnim - 28) / 4) * (-12.50026-(-3.67456)));
            zz = 7.58729 + (((tickAnim - 28) / 4) * (-0.06287-(7.58729)));
        }
        else if (tickAnim >= 32 && tickAnim < 40) {
            xx = -0.00414 + (((tickAnim - 32) / 8) * (-0.00059-(-0.00414)));
            yy = -12.50026 + (((tickAnim - 32) / 8) * (10.0001-(-12.50026)));
            zz = -0.06287 + (((tickAnim - 32) / 8) * (0.02232-(-0.06287)));
        }
        else if (tickAnim >= 40 && tickAnim < 44) {
            xx = -0.00059 + (((tickAnim - 40) / 4) * (-1.15091-(-0.00059)));
            yy = 10.0001 + (((tickAnim - 40) / 4) * (-3.67456-(10.0001)));
            zz = 0.02232 + (((tickAnim - 40) / 4) * (7.58729-(0.02232)));
        }
        else if (tickAnim >= 44 && tickAnim < 48) {
            xx = -1.15091 + (((tickAnim - 44) / 4) * (-0.00414-(-1.15091)));
            yy = -3.67456 + (((tickAnim - 44) / 4) * (-12.50026-(-3.67456)));
            zz = 7.58729 + (((tickAnim - 44) / 4) * (-0.06287-(7.58729)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg5, rightLeg5.rotateAngleX + (float) Math.toRadians(xx), rightLeg5.rotateAngleY + (float) Math.toRadians(yy), rightLeg5.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = -0.14 + (((tickAnim - 0) / 2) * (-0.27059-(-0.14)));
            yy = -3.14 + (((tickAnim - 0) / 2) * (3.72037-(-3.14)));
            zz = -6.25 + (((tickAnim - 0) / 2) * (-12.50288-(-6.25)));
        }
        else if (tickAnim >= 2 && tickAnim < 6) {
            xx = -0.27059 + (((tickAnim - 2) / 4) * (-0.00332-(-0.27059)));
            yy = 3.72037 + (((tickAnim - 2) / 4) * (15.00055-(3.72037)));
            zz = -12.50288 + (((tickAnim - 2) / 4) * (0.07501-(-12.50288)));
        }
        else if (tickAnim >= 6 && tickAnim < 14) {
            xx = -0.00332 + (((tickAnim - 6) / 8) * (-0.00003-(-0.00332)));
            yy = 15.00055 + (((tickAnim - 6) / 8) * (-10-(15.00055)));
            zz = 0.07501 + (((tickAnim - 6) / 8) * (-0.0009-(0.07501)));
        }
        else if (tickAnim >= 14 && tickAnim < 18) {
            xx = -0.00003 + (((tickAnim - 14) / 4) * (-0.27059-(-0.00003)));
            yy = -10 + (((tickAnim - 14) / 4) * (3.72037-(-10)));
            zz = -0.0009 + (((tickAnim - 14) / 4) * (-12.50288-(-0.0009)));
        }
        else if (tickAnim >= 18 && tickAnim < 22) {
            xx = -0.27059 + (((tickAnim - 18) / 4) * (-0.00332-(-0.27059)));
            yy = 3.72037 + (((tickAnim - 18) / 4) * (15.00055-(3.72037)));
            zz = -12.50288 + (((tickAnim - 18) / 4) * (0.07501-(-12.50288)));
        }
        else if (tickAnim >= 22 && tickAnim < 30) {
            xx = -0.00332 + (((tickAnim - 22) / 8) * (-0.00003-(-0.00332)));
            yy = 15.00055 + (((tickAnim - 22) / 8) * (-10-(15.00055)));
            zz = 0.07501 + (((tickAnim - 22) / 8) * (-0.0009-(0.07501)));
        }
        else if (tickAnim >= 30 && tickAnim < 34) {
            xx = -0.00003 + (((tickAnim - 30) / 4) * (-0.27059-(-0.00003)));
            yy = -10 + (((tickAnim - 30) / 4) * (3.72037-(-10)));
            zz = -0.0009 + (((tickAnim - 30) / 4) * (-12.50288-(-0.0009)));
        }
        else if (tickAnim >= 34 && tickAnim < 38) {
            xx = -0.27059 + (((tickAnim - 34) / 4) * (-0.00332-(-0.27059)));
            yy = 3.72037 + (((tickAnim - 34) / 4) * (15.00055-(3.72037)));
            zz = -12.50288 + (((tickAnim - 34) / 4) * (0.07501-(-12.50288)));
        }
        else if (tickAnim >= 38 && tickAnim < 46) {
            xx = -0.00332 + (((tickAnim - 38) / 8) * (-0.00003-(-0.00332)));
            yy = 15.00055 + (((tickAnim - 38) / 8) * (-10-(15.00055)));
            zz = 0.07501 + (((tickAnim - 38) / 8) * (-0.0009-(0.07501)));
        }
        else if (tickAnim >= 46 && tickAnim < 48) {
            xx = -0.00003 + (((tickAnim - 46) / 2) * (-0.14-(-0.00003)));
            yy = -10 + (((tickAnim - 46) / 2) * (-3.14-(-10)));
            zz = -0.0009 + (((tickAnim - 46) / 2) * (-6.25-(-0.0009)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg6, leftLeg6.rotateAngleX + (float) Math.toRadians(xx), leftLeg6.rotateAngleY + (float) Math.toRadians(yy), leftLeg6.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 0) / 6) * (-0.00003-(0)));
            yy = -8.75 + (((tickAnim - 0) / 6) * (10-(-8.75)));
            zz = -0.06 + (((tickAnim - 0) / 6) * (0.0009-(-0.06)));
        }
        else if (tickAnim >= 6 && tickAnim < 10) {
            xx = -0.00003 + (((tickAnim - 6) / 4) * (-0.27059-(-0.00003)));
            yy = 10 + (((tickAnim - 6) / 4) * (-3.72037-(10)));
            zz = 0.0009 + (((tickAnim - 6) / 4) * (12.50288-(0.0009)));
        }
        else if (tickAnim >= 10 && tickAnim < 14) {
            xx = -0.27059 + (((tickAnim - 10) / 4) * (-0.00332-(-0.27059)));
            yy = -3.72037 + (((tickAnim - 10) / 4) * (-15.00055-(-3.72037)));
            zz = 12.50288 + (((tickAnim - 10) / 4) * (-0.07501-(12.50288)));
        }
        else if (tickAnim >= 14 && tickAnim < 22) {
            xx = -0.00332 + (((tickAnim - 14) / 8) * (-0.00003-(-0.00332)));
            yy = -15.00055 + (((tickAnim - 14) / 8) * (10-(-15.00055)));
            zz = -0.07501 + (((tickAnim - 14) / 8) * (0.0009-(-0.07501)));
        }
        else if (tickAnim >= 22 && tickAnim < 26) {
            xx = -0.00003 + (((tickAnim - 22) / 4) * (-0.27059-(-0.00003)));
            yy = 10 + (((tickAnim - 22) / 4) * (-3.72037-(10)));
            zz = 0.0009 + (((tickAnim - 22) / 4) * (12.50288-(0.0009)));
        }
        else if (tickAnim >= 26 && tickAnim < 30) {
            xx = -0.27059 + (((tickAnim - 26) / 4) * (-0.00332-(-0.27059)));
            yy = -3.72037 + (((tickAnim - 26) / 4) * (-15.00055-(-3.72037)));
            zz = 12.50288 + (((tickAnim - 26) / 4) * (-0.07501-(12.50288)));
        }
        else if (tickAnim >= 30 && tickAnim < 38) {
            xx = -0.00332 + (((tickAnim - 30) / 8) * (-0.00003-(-0.00332)));
            yy = -15.00055 + (((tickAnim - 30) / 8) * (10-(-15.00055)));
            zz = -0.07501 + (((tickAnim - 30) / 8) * (0.0009-(-0.07501)));
        }
        else if (tickAnim >= 38 && tickAnim < 42) {
            xx = -0.00003 + (((tickAnim - 38) / 4) * (-0.27059-(-0.00003)));
            yy = 10 + (((tickAnim - 38) / 4) * (-3.72037-(10)));
            zz = 0.0009 + (((tickAnim - 38) / 4) * (12.50288-(0.0009)));
        }
        else if (tickAnim >= 42 && tickAnim < 46) {
            xx = -0.27059 + (((tickAnim - 42) / 4) * (-0.00332-(-0.27059)));
            yy = -3.72037 + (((tickAnim - 42) / 4) * (-15.00055-(-3.72037)));
            zz = 12.50288 + (((tickAnim - 42) / 4) * (-0.07501-(12.50288)));
        }
        else if (tickAnim >= 46 && tickAnim < 48) {
            xx = -0.00332 + (((tickAnim - 46) / 2) * (0-(-0.00332)));
            yy = -15.00055 + (((tickAnim - 46) / 2) * (-8.75-(-15.00055)));
            zz = -0.07501 + (((tickAnim - 46) / 2) * (-0.06-(-0.07501)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg6, rightLeg6.rotateAngleX + (float) Math.toRadians(xx), rightLeg6.rotateAngleY + (float) Math.toRadians(yy), rightLeg6.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 1.50701 + (((tickAnim - 0) / 4) * (-0.0039-(1.50701)));
            yy = 2.73196 + (((tickAnim - 0) / 4) * (15.00076-(2.73196)));
            zz = -17.56274 + (((tickAnim - 0) / 4) * (0.08797-(-17.56274)));
        }
        else if (tickAnim >= 4 && tickAnim < 12) {
            xx = -0.0039 + (((tickAnim - 4) / 8) * (0.0006-(-0.0039)));
            yy = 15.00076 + (((tickAnim - 4) / 8) * (-12.50009-(15.00076)));
            zz = 0.08797 + (((tickAnim - 4) / 8) * (0.02068-(0.08797)));
        }
        else if (tickAnim >= 12 && tickAnim < 16) {
            xx = 0.0006 + (((tickAnim - 12) / 4) * (1.50701-(0.0006)));
            yy = -12.50009 + (((tickAnim - 12) / 4) * (2.73196-(-12.50009)));
            zz = 0.02068 + (((tickAnim - 12) / 4) * (-17.56274-(0.02068)));
        }
        else if (tickAnim >= 16 && tickAnim < 20) {
            xx = 1.50701 + (((tickAnim - 16) / 4) * (-0.0039-(1.50701)));
            yy = 2.73196 + (((tickAnim - 16) / 4) * (15.00076-(2.73196)));
            zz = -17.56274 + (((tickAnim - 16) / 4) * (0.08797-(-17.56274)));
        }
        else if (tickAnim >= 20 && tickAnim < 28) {
            xx = -0.0039 + (((tickAnim - 20) / 8) * (0.0006-(-0.0039)));
            yy = 15.00076 + (((tickAnim - 20) / 8) * (-12.50009-(15.00076)));
            zz = 0.08797 + (((tickAnim - 20) / 8) * (0.02068-(0.08797)));
        }
        else if (tickAnim >= 28 && tickAnim < 32) {
            xx = 0.0006 + (((tickAnim - 28) / 4) * (1.50701-(0.0006)));
            yy = -12.50009 + (((tickAnim - 28) / 4) * (2.73196-(-12.50009)));
            zz = 0.02068 + (((tickAnim - 28) / 4) * (-17.56274-(0.02068)));
        }
        else if (tickAnim >= 32 && tickAnim < 36) {
            xx = 1.50701 + (((tickAnim - 32) / 4) * (-0.0039-(1.50701)));
            yy = 2.73196 + (((tickAnim - 32) / 4) * (15.00076-(2.73196)));
            zz = -17.56274 + (((tickAnim - 32) / 4) * (0.08797-(-17.56274)));
        }
        else if (tickAnim >= 36 && tickAnim < 44) {
            xx = -0.0039 + (((tickAnim - 36) / 8) * (0.0006-(-0.0039)));
            yy = 15.00076 + (((tickAnim - 36) / 8) * (-12.50009-(15.00076)));
            zz = 0.08797 + (((tickAnim - 36) / 8) * (0.02068-(0.08797)));
        }
        else if (tickAnim >= 44 && tickAnim < 48) {
            xx = 0.0006 + (((tickAnim - 44) / 4) * (1.50701-(0.0006)));
            yy = -12.50009 + (((tickAnim - 44) / 4) * (2.73196-(-12.50009)));
            zz = 0.02068 + (((tickAnim - 44) / 4) * (-17.56274-(0.02068)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg7, leftLeg7.rotateAngleX + (float) Math.toRadians(xx), leftLeg7.rotateAngleY + (float) Math.toRadians(yy), leftLeg7.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (0.0006-(0)));
            yy = -1.25 + (((tickAnim - 0) / 4) * (12.50009-(-1.25)));
            zz = -0.05 + (((tickAnim - 0) / 4) * (-0.02068-(-0.05)));
        }
        else if (tickAnim >= 4 && tickAnim < 8) {
            xx = 0.0006 + (((tickAnim - 4) / 4) * (1.50701-(0.0006)));
            yy = 12.50009 + (((tickAnim - 4) / 4) * (-2.73196-(12.50009)));
            zz = -0.02068 + (((tickAnim - 4) / 4) * (17.56274-(-0.02068)));
        }
        else if (tickAnim >= 8 && tickAnim < 12) {
            xx = 1.50701 + (((tickAnim - 8) / 4) * (-0.0039-(1.50701)));
            yy = -2.73196 + (((tickAnim - 8) / 4) * (-15.00076-(-2.73196)));
            zz = 17.56274 + (((tickAnim - 8) / 4) * (-0.08797-(17.56274)));
        }
        else if (tickAnim >= 12 && tickAnim < 20) {
            xx = -0.0039 + (((tickAnim - 12) / 8) * (0.0006-(-0.0039)));
            yy = -15.00076 + (((tickAnim - 12) / 8) * (12.50009-(-15.00076)));
            zz = -0.08797 + (((tickAnim - 12) / 8) * (-0.02068-(-0.08797)));
        }
        else if (tickAnim >= 20 && tickAnim < 24) {
            xx = 0.0006 + (((tickAnim - 20) / 4) * (1.50701-(0.0006)));
            yy = 12.50009 + (((tickAnim - 20) / 4) * (-2.73196-(12.50009)));
            zz = -0.02068 + (((tickAnim - 20) / 4) * (17.56274-(-0.02068)));
        }
        else if (tickAnim >= 24 && tickAnim < 28) {
            xx = 1.50701 + (((tickAnim - 24) / 4) * (-0.0039-(1.50701)));
            yy = -2.73196 + (((tickAnim - 24) / 4) * (-15.00076-(-2.73196)));
            zz = 17.56274 + (((tickAnim - 24) / 4) * (-0.08797-(17.56274)));
        }
        else if (tickAnim >= 28 && tickAnim < 36) {
            xx = -0.0039 + (((tickAnim - 28) / 8) * (0.0006-(-0.0039)));
            yy = -15.00076 + (((tickAnim - 28) / 8) * (12.50009-(-15.00076)));
            zz = -0.08797 + (((tickAnim - 28) / 8) * (-0.02068-(-0.08797)));
        }
        else if (tickAnim >= 36 && tickAnim < 40) {
            xx = 0.0006 + (((tickAnim - 36) / 4) * (1.50701-(0.0006)));
            yy = 12.50009 + (((tickAnim - 36) / 4) * (-2.73196-(12.50009)));
            zz = -0.02068 + (((tickAnim - 36) / 4) * (17.56274-(-0.02068)));
        }
        else if (tickAnim >= 40 && tickAnim < 44) {
            xx = 1.50701 + (((tickAnim - 40) / 4) * (-0.0039-(1.50701)));
            yy = -2.73196 + (((tickAnim - 40) / 4) * (-15.00076-(-2.73196)));
            zz = 17.56274 + (((tickAnim - 40) / 4) * (-0.08797-(17.56274)));
        }
        else if (tickAnim >= 44 && tickAnim < 48) {
            xx = -0.0039 + (((tickAnim - 44) / 4) * (0-(-0.0039)));
            yy = -15.00076 + (((tickAnim - 44) / 4) * (-1.25-(-15.00076)));
            zz = -0.08797 + (((tickAnim - 44) / 4) * (-0.05-(-0.08797)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg7, rightLeg7.rotateAngleX + (float) Math.toRadians(xx), rightLeg7.rotateAngleY + (float) Math.toRadians(yy), rightLeg7.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 1.32 + (((tickAnim - 0) / 2) * (-0.00347-(1.32)));
            yy = 9.58 + (((tickAnim - 0) / 2) * (15.00059-(9.58)));
            zz = -8.81 + (((tickAnim - 0) / 2) * (0.07742-(-8.81)));
        }
        else if (tickAnim >= 2 && tickAnim < 10) {
            xx = -0.00347 + (((tickAnim - 2) / 8) * (0-(-0.00347)));
            yy = 15.00059 + (((tickAnim - 2) / 8) * (-12.5-(15.00059)));
            zz = 0.07742 + (((tickAnim - 2) / 8) * (0-(0.07742)));
        }
        else if (tickAnim >= 10 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 10) / 4) * (2.64993-(0)));
            yy = -12.5 + (((tickAnim - 10) / 4) * (4.15793-(-12.5)));
            zz = 0 + (((tickAnim - 10) / 4) * (-17.69329-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 18) {
            xx = 2.64993 + (((tickAnim - 14) / 4) * (-0.00347-(2.64993)));
            yy = 4.15793 + (((tickAnim - 14) / 4) * (15.00059-(4.15793)));
            zz = -17.69329 + (((tickAnim - 14) / 4) * (0.07742-(-17.69329)));
        }
        else if (tickAnim >= 18 && tickAnim < 26) {
            xx = -0.00347 + (((tickAnim - 18) / 8) * (0-(-0.00347)));
            yy = 15.00059 + (((tickAnim - 18) / 8) * (-12.5-(15.00059)));
            zz = 0.07742 + (((tickAnim - 18) / 8) * (0-(0.07742)));
        }
        else if (tickAnim >= 26 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 26) / 4) * (2.64993-(0)));
            yy = -12.5 + (((tickAnim - 26) / 4) * (4.15793-(-12.5)));
            zz = 0 + (((tickAnim - 26) / 4) * (-17.69329-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 34) {
            xx = 2.64993 + (((tickAnim - 30) / 4) * (-0.00347-(2.64993)));
            yy = 4.15793 + (((tickAnim - 30) / 4) * (15.00059-(4.15793)));
            zz = -17.69329 + (((tickAnim - 30) / 4) * (0.07742-(-17.69329)));
        }
        else if (tickAnim >= 34 && tickAnim < 42) {
            xx = -0.00347 + (((tickAnim - 34) / 8) * (0-(-0.00347)));
            yy = 15.00059 + (((tickAnim - 34) / 8) * (-12.5-(15.00059)));
            zz = 0.07742 + (((tickAnim - 34) / 8) * (0-(0.07742)));
        }
        else if (tickAnim >= 42 && tickAnim < 46) {
            xx = 0 + (((tickAnim - 42) / 4) * (2.64993-(0)));
            yy = -12.5 + (((tickAnim - 42) / 4) * (4.15793-(-12.5)));
            zz = 0 + (((tickAnim - 42) / 4) * (-17.69329-(0)));
        }
        else if (tickAnim >= 46 && tickAnim < 48) {
            xx = 2.64993 + (((tickAnim - 46) / 2) * (1.32-(2.64993)));
            yy = 4.15793 + (((tickAnim - 46) / 2) * (9.58-(4.15793)));
            zz = -17.69329 + (((tickAnim - 46) / 2) * (-8.81-(-17.69329)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg8, leftLeg8.rotateAngleX + (float) Math.toRadians(xx), leftLeg8.rotateAngleY + (float) Math.toRadians(yy), leftLeg8.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            yy = 5.62 + (((tickAnim - 0) / 2) * (12.5-(5.62)));
            zz = -0.02 + (((tickAnim - 0) / 2) * (0-(-0.02)));
        }
        else if (tickAnim >= 2 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 2) / 4) * (2.64993-(0)));
            yy = 12.5 + (((tickAnim - 2) / 4) * (-4.15793-(12.5)));
            zz = 0 + (((tickAnim - 2) / 4) * (17.69329-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 10) {
            xx = 2.64993 + (((tickAnim - 6) / 4) * (-0.00347-(2.64993)));
            yy = -4.15793 + (((tickAnim - 6) / 4) * (-15.00059-(-4.15793)));
            zz = 17.69329 + (((tickAnim - 6) / 4) * (-0.07742-(17.69329)));
        }
        else if (tickAnim >= 10 && tickAnim < 18) {
            xx = -0.00347 + (((tickAnim - 10) / 8) * (0-(-0.00347)));
            yy = -15.00059 + (((tickAnim - 10) / 8) * (12.5-(-15.00059)));
            zz = -0.07742 + (((tickAnim - 10) / 8) * (0-(-0.07742)));
        }
        else if (tickAnim >= 18 && tickAnim < 22) {
            xx = 0 + (((tickAnim - 18) / 4) * (2.64993-(0)));
            yy = 12.5 + (((tickAnim - 18) / 4) * (-4.15793-(12.5)));
            zz = 0 + (((tickAnim - 18) / 4) * (17.69329-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 26) {
            xx = 2.64993 + (((tickAnim - 22) / 4) * (-0.00347-(2.64993)));
            yy = -4.15793 + (((tickAnim - 22) / 4) * (-15.00059-(-4.15793)));
            zz = 17.69329 + (((tickAnim - 22) / 4) * (-0.07742-(17.69329)));
        }
        else if (tickAnim >= 26 && tickAnim < 34) {
            xx = -0.00347 + (((tickAnim - 26) / 8) * (0-(-0.00347)));
            yy = -15.00059 + (((tickAnim - 26) / 8) * (12.5-(-15.00059)));
            zz = -0.07742 + (((tickAnim - 26) / 8) * (0-(-0.07742)));
        }
        else if (tickAnim >= 34 && tickAnim < 38) {
            xx = 0 + (((tickAnim - 34) / 4) * (2.64993-(0)));
            yy = 12.5 + (((tickAnim - 34) / 4) * (-4.15793-(12.5)));
            zz = 0 + (((tickAnim - 34) / 4) * (17.69329-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 42) {
            xx = 2.64993 + (((tickAnim - 38) / 4) * (-0.00347-(2.64993)));
            yy = -4.15793 + (((tickAnim - 38) / 4) * (-15.00059-(-4.15793)));
            zz = 17.69329 + (((tickAnim - 38) / 4) * (-0.07742-(17.69329)));
        }
        else if (tickAnim >= 42 && tickAnim < 48) {
            xx = -0.00347 + (((tickAnim - 42) / 6) * (0-(-0.00347)));
            yy = -15.00059 + (((tickAnim - 42) / 6) * (5.62-(-15.00059)));
            zz = -0.07742 + (((tickAnim - 42) / 6) * (-0.02-(-0.07742)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg8, rightLeg8.rotateAngleX + (float) Math.toRadians(xx), rightLeg8.rotateAngleY + (float) Math.toRadians(yy), rightLeg8.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = -0.00051 + (((tickAnim - 0) / 8) * (0.00131-(-0.00051)));
            yy = 17.5001 + (((tickAnim - 0) / 8) * (-10.00038-(17.5001)));
            zz = 0.02279 + (((tickAnim - 0) / 8) * (0.04271-(0.02279)));
        }
        else if (tickAnim >= 8 && tickAnim < 12) {
            xx = 0.00131 + (((tickAnim - 8) / 4) * (8.08157-(0.00131)));
            yy = -10.00038 + (((tickAnim - 8) / 4) * (-5.1843-(-10.00038)));
            zz = 0.04271 + (((tickAnim - 8) / 4) * (-16.99444-(0.04271)));
        }
        else if (tickAnim >= 12 && tickAnim < 16) {
            xx = 8.08157 + (((tickAnim - 12) / 4) * (-0.00051-(8.08157)));
            yy = -5.1843 + (((tickAnim - 12) / 4) * (17.5001-(-5.1843)));
            zz = -16.99444 + (((tickAnim - 12) / 4) * (0.02279-(-16.99444)));
        }
        else if (tickAnim >= 16 && tickAnim < 24) {
            xx = -0.00051 + (((tickAnim - 16) / 8) * (0.00131-(-0.00051)));
            yy = 17.5001 + (((tickAnim - 16) / 8) * (-10.00038-(17.5001)));
            zz = 0.02279 + (((tickAnim - 16) / 8) * (0.04271-(0.02279)));
        }
        else if (tickAnim >= 24 && tickAnim < 28) {
            xx = 0.00131 + (((tickAnim - 24) / 4) * (8.08157-(0.00131)));
            yy = -10.00038 + (((tickAnim - 24) / 4) * (-5.1843-(-10.00038)));
            zz = 0.04271 + (((tickAnim - 24) / 4) * (-16.99444-(0.04271)));
        }
        else if (tickAnim >= 28 && tickAnim < 32) {
            xx = 8.08157 + (((tickAnim - 28) / 4) * (-0.00051-(8.08157)));
            yy = -5.1843 + (((tickAnim - 28) / 4) * (17.5001-(-5.1843)));
            zz = -16.99444 + (((tickAnim - 28) / 4) * (0.02279-(-16.99444)));
        }
        else if (tickAnim >= 32 && tickAnim < 40) {
            xx = -0.00051 + (((tickAnim - 32) / 8) * (0.00131-(-0.00051)));
            yy = 17.5001 + (((tickAnim - 32) / 8) * (-10.00038-(17.5001)));
            zz = 0.02279 + (((tickAnim - 32) / 8) * (0.04271-(0.02279)));
        }
        else if (tickAnim >= 40 && tickAnim < 44) {
            xx = 0.00131 + (((tickAnim - 40) / 4) * (8.08157-(0.00131)));
            yy = -10.00038 + (((tickAnim - 40) / 4) * (-5.1843-(-10.00038)));
            zz = 0.04271 + (((tickAnim - 40) / 4) * (-16.99444-(0.04271)));
        }
        else if (tickAnim >= 44 && tickAnim < 48) {
            xx = 8.08157 + (((tickAnim - 44) / 4) * (-0.00051-(8.08157)));
            yy = -5.1843 + (((tickAnim - 44) / 4) * (17.5001-(-5.1843)));
            zz = -16.99444 + (((tickAnim - 44) / 4) * (0.02279-(-16.99444)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg9, leftLeg9.rotateAngleX + (float) Math.toRadians(xx), leftLeg9.rotateAngleY + (float) Math.toRadians(yy), leftLeg9.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0.00131 + (((tickAnim - 0) / 4) * (8.08157-(0.00131)));
            yy = 10.00038 + (((tickAnim - 0) / 4) * (5.1843-(10.00038)));
            zz = -0.04271 + (((tickAnim - 0) / 4) * (16.99444-(-0.04271)));
        }
        else if (tickAnim >= 4 && tickAnim < 8) {
            xx = 8.08157 + (((tickAnim - 4) / 4) * (-0.00051-(8.08157)));
            yy = 5.1843 + (((tickAnim - 4) / 4) * (-17.5001-(5.1843)));
            zz = 16.99444 + (((tickAnim - 4) / 4) * (-0.02279-(16.99444)));
        }
        else if (tickAnim >= 8 && tickAnim < 16) {
            xx = -0.00051 + (((tickAnim - 8) / 8) * (0.00131-(-0.00051)));
            yy = -17.5001 + (((tickAnim - 8) / 8) * (10.00038-(-17.5001)));
            zz = -0.02279 + (((tickAnim - 8) / 8) * (-0.04271-(-0.02279)));
        }
        else if (tickAnim >= 16 && tickAnim < 20) {
            xx = 0.00131 + (((tickAnim - 16) / 4) * (8.08157-(0.00131)));
            yy = 10.00038 + (((tickAnim - 16) / 4) * (5.1843-(10.00038)));
            zz = -0.04271 + (((tickAnim - 16) / 4) * (16.99444-(-0.04271)));
        }
        else if (tickAnim >= 20 && tickAnim < 24) {
            xx = 8.08157 + (((tickAnim - 20) / 4) * (-0.00051-(8.08157)));
            yy = 5.1843 + (((tickAnim - 20) / 4) * (-17.5001-(5.1843)));
            zz = 16.99444 + (((tickAnim - 20) / 4) * (-0.02279-(16.99444)));
        }
        else if (tickAnim >= 24 && tickAnim < 32) {
            xx = -0.00051 + (((tickAnim - 24) / 8) * (0.00131-(-0.00051)));
            yy = -17.5001 + (((tickAnim - 24) / 8) * (10.00038-(-17.5001)));
            zz = -0.02279 + (((tickAnim - 24) / 8) * (-0.04271-(-0.02279)));
        }
        else if (tickAnim >= 32 && tickAnim < 36) {
            xx = 0.00131 + (((tickAnim - 32) / 4) * (8.08157-(0.00131)));
            yy = 10.00038 + (((tickAnim - 32) / 4) * (5.1843-(10.00038)));
            zz = -0.04271 + (((tickAnim - 32) / 4) * (16.99444-(-0.04271)));
        }
        else if (tickAnim >= 36 && tickAnim < 40) {
            xx = 8.08157 + (((tickAnim - 36) / 4) * (-0.00051-(8.08157)));
            yy = 5.1843 + (((tickAnim - 36) / 4) * (-17.5001-(5.1843)));
            zz = 16.99444 + (((tickAnim - 36) / 4) * (-0.02279-(16.99444)));
        }
        else if (tickAnim >= 40 && tickAnim < 48) {
            xx = -0.00051 + (((tickAnim - 40) / 8) * (0.00131-(-0.00051)));
            yy = -17.5001 + (((tickAnim - 40) / 8) * (10.00038-(-17.5001)));
            zz = -0.02279 + (((tickAnim - 40) / 8) * (-0.04271-(-0.02279)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg9, rightLeg9.rotateAngleX + (float) Math.toRadians(xx), rightLeg9.rotateAngleY + (float) Math.toRadians(yy), rightLeg9.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 0) / 6) * (0.00474-(0)));
            yy = 6.87 + (((tickAnim - 0) / 6) * (-10.00058-(6.87)));
            zz = 0.02 + (((tickAnim - 0) / 6) * (0.07275-(0.02)));
        }
        else if (tickAnim >= 6 && tickAnim < 10) {
            xx = 0.00474 + (((tickAnim - 6) / 4) * (12.99301-(0.00474)));
            yy = -10.00058 + (((tickAnim - 6) / 4) * (-5.49178-(-10.00058)));
            zz = 0.07275 + (((tickAnim - 6) / 4) * (-21.67413-(0.07275)));
        }
        else if (tickAnim >= 10 && tickAnim < 14) {
            xx = 12.99301 + (((tickAnim - 10) / 4) * (-0.00019-(12.99301)));
            yy = -5.49178 + (((tickAnim - 10) / 4) * (12.5-(-5.49178)));
            zz = -21.67413 + (((tickAnim - 10) / 4) * (0.00281-(-21.67413)));
        }
        else if (tickAnim >= 14 && tickAnim < 22) {
            xx = -0.00019 + (((tickAnim - 14) / 8) * (0.00474-(-0.00019)));
            yy = 12.5 + (((tickAnim - 14) / 8) * (-10.00058-(12.5)));
            zz = 0.00281 + (((tickAnim - 14) / 8) * (0.07275-(0.00281)));
        }
        else if (tickAnim >= 22 && tickAnim < 26) {
            xx = 0.00474 + (((tickAnim - 22) / 4) * (12.99301-(0.00474)));
            yy = -10.00058 + (((tickAnim - 22) / 4) * (-5.49178-(-10.00058)));
            zz = 0.07275 + (((tickAnim - 22) / 4) * (-21.67413-(0.07275)));
        }
        else if (tickAnim >= 26 && tickAnim < 30) {
            xx = 12.99301 + (((tickAnim - 26) / 4) * (-0.00019-(12.99301)));
            yy = -5.49178 + (((tickAnim - 26) / 4) * (12.5-(-5.49178)));
            zz = -21.67413 + (((tickAnim - 26) / 4) * (0.00281-(-21.67413)));
        }
        else if (tickAnim >= 30 && tickAnim < 38) {
            xx = -0.00019 + (((tickAnim - 30) / 8) * (0.00474-(-0.00019)));
            yy = 12.5 + (((tickAnim - 30) / 8) * (-10.00058-(12.5)));
            zz = 0.00281 + (((tickAnim - 30) / 8) * (0.07275-(0.00281)));
        }
        else if (tickAnim >= 38 && tickAnim < 42) {
            xx = 0.00474 + (((tickAnim - 38) / 4) * (12.99301-(0.00474)));
            yy = -10.00058 + (((tickAnim - 38) / 4) * (-5.49178-(-10.00058)));
            zz = 0.07275 + (((tickAnim - 38) / 4) * (-21.67413-(0.07275)));
        }
        else if (tickAnim >= 42 && tickAnim < 46) {
            xx = 12.99301 + (((tickAnim - 42) / 4) * (-0.00019-(12.99301)));
            yy = -5.49178 + (((tickAnim - 42) / 4) * (12.5-(-5.49178)));
            zz = -21.67413 + (((tickAnim - 42) / 4) * (0.00281-(-21.67413)));
        }
        else if (tickAnim >= 46 && tickAnim < 48) {
            xx = -0.00019 + (((tickAnim - 46) / 2) * (0-(-0.00019)));
            yy = 12.5 + (((tickAnim - 46) / 2) * (6.87-(12.5)));
            zz = 0.00281 + (((tickAnim - 46) / 2) * (0.02-(0.00281)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg10, leftLeg10.rotateAngleX + (float) Math.toRadians(xx), leftLeg10.rotateAngleY + (float) Math.toRadians(yy), leftLeg10.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 6.5 + (((tickAnim - 0) / 2) * (12.99301-(6.5)));
            yy = 7.75 + (((tickAnim - 0) / 2) * (5.49178-(7.75)));
            zz = 10.8 + (((tickAnim - 0) / 2) * (21.67413-(10.8)));
        }
        else if (tickAnim >= 2 && tickAnim < 6) {
            xx = 12.99301 + (((tickAnim - 2) / 4) * (-0.00019-(12.99301)));
            yy = 5.49178 + (((tickAnim - 2) / 4) * (-12.5-(5.49178)));
            zz = 21.67413 + (((tickAnim - 2) / 4) * (-0.00281-(21.67413)));
        }
        else if (tickAnim >= 6 && tickAnim < 14) {
            xx = -0.00019 + (((tickAnim - 6) / 8) * (0.00474-(-0.00019)));
            yy = -12.5 + (((tickAnim - 6) / 8) * (10.00058-(-12.5)));
            zz = -0.00281 + (((tickAnim - 6) / 8) * (-0.07275-(-0.00281)));
        }
        else if (tickAnim >= 14 && tickAnim < 18) {
            xx = 0.00474 + (((tickAnim - 14) / 4) * (12.99301-(0.00474)));
            yy = 10.00058 + (((tickAnim - 14) / 4) * (5.49178-(10.00058)));
            zz = -0.07275 + (((tickAnim - 14) / 4) * (21.67413-(-0.07275)));
        }
        else if (tickAnim >= 18 && tickAnim < 22) {
            xx = 12.99301 + (((tickAnim - 18) / 4) * (-0.00019-(12.99301)));
            yy = 5.49178 + (((tickAnim - 18) / 4) * (-12.5-(5.49178)));
            zz = 21.67413 + (((tickAnim - 18) / 4) * (-0.00281-(21.67413)));
        }
        else if (tickAnim >= 22 && tickAnim < 30) {
            xx = -0.00019 + (((tickAnim - 22) / 8) * (0.00474-(-0.00019)));
            yy = -12.5 + (((tickAnim - 22) / 8) * (10.00058-(-12.5)));
            zz = -0.00281 + (((tickAnim - 22) / 8) * (-0.07275-(-0.00281)));
        }
        else if (tickAnim >= 30 && tickAnim < 34) {
            xx = 0.00474 + (((tickAnim - 30) / 4) * (12.99301-(0.00474)));
            yy = 10.00058 + (((tickAnim - 30) / 4) * (5.49178-(10.00058)));
            zz = -0.07275 + (((tickAnim - 30) / 4) * (21.67413-(-0.07275)));
        }
        else if (tickAnim >= 34 && tickAnim < 38) {
            xx = 12.99301 + (((tickAnim - 34) / 4) * (-0.00019-(12.99301)));
            yy = 5.49178 + (((tickAnim - 34) / 4) * (-12.5-(5.49178)));
            zz = 21.67413 + (((tickAnim - 34) / 4) * (-0.00281-(21.67413)));
        }
        else if (tickAnim >= 38 && tickAnim < 46) {
            xx = -0.00019 + (((tickAnim - 38) / 8) * (0.00474-(-0.00019)));
            yy = -12.5 + (((tickAnim - 38) / 8) * (10.00058-(-12.5)));
            zz = -0.00281 + (((tickAnim - 38) / 8) * (-0.07275-(-0.00281)));
        }
        else if (tickAnim >= 46 && tickAnim < 48) {
            xx = 0.00474 + (((tickAnim - 46) / 2) * (6.5-(0.00474)));
            yy = 10.00058 + (((tickAnim - 46) / 2) * (7.75-(10.00058)));
            zz = -0.07275 + (((tickAnim - 46) / 2) * (10.8-(-0.07275)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg10, rightLeg10.rotateAngleX + (float) Math.toRadians(xx), rightLeg10.rotateAngleY + (float) Math.toRadians(yy), rightLeg10.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            yy = 1.25 + (((tickAnim - 0) / 4) * (-10-(1.25)));
            zz = -0.03 + (((tickAnim - 0) / 4) * (0-(-0.03)));
        }
        else if (tickAnim >= 4 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 4) / 4) * (10.8448-(0)));
            yy = -10 + (((tickAnim - 4) / 4) * (11.67406-(-10)));
            zz = 0 + (((tickAnim - 4) / 4) * (-20.49807-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 12) {
            xx = 10.8448 + (((tickAnim - 8) / 4) * (0.00468-(10.8448)));
            yy = 11.67406 + (((tickAnim - 8) / 4) * (12.50027-(11.67406)));
            zz = -20.49807 + (((tickAnim - 8) / 4) * (-0.06524-(-20.49807)));
        }
        else if (tickAnim >= 12 && tickAnim < 20) {
            xx = 0.00468 + (((tickAnim - 12) / 8) * (0-(0.00468)));
            yy = 12.50027 + (((tickAnim - 12) / 8) * (-10-(12.50027)));
            zz = -0.06524 + (((tickAnim - 12) / 8) * (0-(-0.06524)));
        }
        else if (tickAnim >= 20 && tickAnim < 24) {
            xx = 0 + (((tickAnim - 20) / 4) * (10.8448-(0)));
            yy = -10 + (((tickAnim - 20) / 4) * (11.67406-(-10)));
            zz = 0 + (((tickAnim - 20) / 4) * (-20.49807-(0)));
        }
        else if (tickAnim >= 24 && tickAnim < 28) {
            xx = 10.8448 + (((tickAnim - 24) / 4) * (0.00468-(10.8448)));
            yy = 11.67406 + (((tickAnim - 24) / 4) * (12.50027-(11.67406)));
            zz = -20.49807 + (((tickAnim - 24) / 4) * (-0.06524-(-20.49807)));
        }
        else if (tickAnim >= 28 && tickAnim < 36) {
            xx = 0.00468 + (((tickAnim - 28) / 8) * (0-(0.00468)));
            yy = 12.50027 + (((tickAnim - 28) / 8) * (-10-(12.50027)));
            zz = -0.06524 + (((tickAnim - 28) / 8) * (0-(-0.06524)));
        }
        else if (tickAnim >= 36 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 36) / 4) * (10.8448-(0)));
            yy = -10 + (((tickAnim - 36) / 4) * (11.67406-(-10)));
            zz = 0 + (((tickAnim - 36) / 4) * (-20.49807-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 44) {
            xx = 10.8448 + (((tickAnim - 40) / 4) * (0.00468-(10.8448)));
            yy = 11.67406 + (((tickAnim - 40) / 4) * (12.50027-(11.67406)));
            zz = -20.49807 + (((tickAnim - 40) / 4) * (-0.06524-(-20.49807)));
        }
        else if (tickAnim >= 44 && tickAnim < 48) {
            xx = 0.00468 + (((tickAnim - 44) / 4) * (0-(0.00468)));
            yy = 12.50027 + (((tickAnim - 44) / 4) * (1.25-(12.50027)));
            zz = -0.06524 + (((tickAnim - 44) / 4) * (-0.03-(-0.06524)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg11, leftLeg11.rotateAngleX + (float) Math.toRadians(xx), leftLeg11.rotateAngleY + (float) Math.toRadians(yy), leftLeg11.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 10.8448 + (((tickAnim - 0) / 4) * (0.00468-(10.8448)));
            yy = -11.67406 + (((tickAnim - 0) / 4) * (-12.50027-(-11.67406)));
            zz = 20.49807 + (((tickAnim - 0) / 4) * (0.06524-(20.49807)));
        }
        else if (tickAnim >= 4 && tickAnim < 12) {
            xx = 0.00468 + (((tickAnim - 4) / 8) * (0-(0.00468)));
            yy = -12.50027 + (((tickAnim - 4) / 8) * (10-(-12.50027)));
            zz = 0.06524 + (((tickAnim - 4) / 8) * (0-(0.06524)));
        }
        else if (tickAnim >= 12 && tickAnim < 16) {
            xx = 0 + (((tickAnim - 12) / 4) * (10.8448-(0)));
            yy = 10 + (((tickAnim - 12) / 4) * (-11.67406-(10)));
            zz = 0 + (((tickAnim - 12) / 4) * (20.49807-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 20) {
            xx = 10.8448 + (((tickAnim - 16) / 4) * (0.00468-(10.8448)));
            yy = -11.67406 + (((tickAnim - 16) / 4) * (-12.50027-(-11.67406)));
            zz = 20.49807 + (((tickAnim - 16) / 4) * (0.06524-(20.49807)));
        }
        else if (tickAnim >= 20 && tickAnim < 28) {
            xx = 0.00468 + (((tickAnim - 20) / 8) * (0-(0.00468)));
            yy = -12.50027 + (((tickAnim - 20) / 8) * (10-(-12.50027)));
            zz = 0.06524 + (((tickAnim - 20) / 8) * (0-(0.06524)));
        }
        else if (tickAnim >= 28 && tickAnim < 32) {
            xx = 0 + (((tickAnim - 28) / 4) * (10.8448-(0)));
            yy = 10 + (((tickAnim - 28) / 4) * (-11.67406-(10)));
            zz = 0 + (((tickAnim - 28) / 4) * (20.49807-(0)));
        }
        else if (tickAnim >= 32 && tickAnim < 36) {
            xx = 10.8448 + (((tickAnim - 32) / 4) * (0.00468-(10.8448)));
            yy = -11.67406 + (((tickAnim - 32) / 4) * (-12.50027-(-11.67406)));
            zz = 20.49807 + (((tickAnim - 32) / 4) * (0.06524-(20.49807)));
        }
        else if (tickAnim >= 36 && tickAnim < 44) {
            xx = 0.00468 + (((tickAnim - 36) / 8) * (0-(0.00468)));
            yy = -12.50027 + (((tickAnim - 36) / 8) * (10-(-12.50027)));
            zz = 0.06524 + (((tickAnim - 36) / 8) * (0-(0.06524)));
        }
        else if (tickAnim >= 44 && tickAnim < 48) {
            xx = 0 + (((tickAnim - 44) / 4) * (10.8448-(0)));
            yy = 10 + (((tickAnim - 44) / 4) * (-11.67406-(10)));
            zz = 0 + (((tickAnim - 44) / 4) * (20.49807-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg11, rightLeg11.rotateAngleX + (float) Math.toRadians(xx), rightLeg11.rotateAngleY + (float) Math.toRadians(yy), rightLeg11.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 4.29 + (((tickAnim - 0) / 2) * (6.21535-(4.29)));
            yy = -2.6 + (((tickAnim - 0) / 2) * (-9.8235-(-2.6)));
            zz = -5.04 + (((tickAnim - 0) / 2) * (-7.01082-(-5.04)));
        }
        else if (tickAnim >= 2 && tickAnim < 6) {
            xx = 6.21535 + (((tickAnim - 2) / 4) * (17.28264-(6.21535)));
            yy = -9.8235 + (((tickAnim - 2) / 4) * (8.95847-(-9.8235)));
            zz = -7.01082 + (((tickAnim - 2) / 4) * (-23.10577-(-7.01082)));
        }
        else if (tickAnim >= 6 && tickAnim < 10) {
            xx = 17.28264 + (((tickAnim - 6) / 4) * (-1.47869-(17.28264)));
            yy = 8.95847 + (((tickAnim - 6) / 4) * (19.05569-(8.95847)));
            zz = -23.10577 + (((tickAnim - 6) / 4) * (0.88071-(-23.10577)));
        }
        else if (tickAnim >= 10 && tickAnim < 18) {
            xx = -1.47869 + (((tickAnim - 10) / 8) * (6.21535-(-1.47869)));
            yy = 19.05569 + (((tickAnim - 10) / 8) * (-9.8235-(19.05569)));
            zz = 0.88071 + (((tickAnim - 10) / 8) * (-7.01082-(0.88071)));
        }
        else if (tickAnim >= 18 && tickAnim < 22) {
            xx = 6.21535 + (((tickAnim - 18) / 4) * (17.28264-(6.21535)));
            yy = -9.8235 + (((tickAnim - 18) / 4) * (8.95847-(-9.8235)));
            zz = -7.01082 + (((tickAnim - 18) / 4) * (-23.10577-(-7.01082)));
        }
        else if (tickAnim >= 22 && tickAnim < 26) {
            xx = 17.28264 + (((tickAnim - 22) / 4) * (-1.47869-(17.28264)));
            yy = 8.95847 + (((tickAnim - 22) / 4) * (19.05569-(8.95847)));
            zz = -23.10577 + (((tickAnim - 22) / 4) * (0.88071-(-23.10577)));
        }
        else if (tickAnim >= 26 && tickAnim < 34) {
            xx = -1.47869 + (((tickAnim - 26) / 8) * (6.21535-(-1.47869)));
            yy = 19.05569 + (((tickAnim - 26) / 8) * (-9.8235-(19.05569)));
            zz = 0.88071 + (((tickAnim - 26) / 8) * (-7.01082-(0.88071)));
        }
        else if (tickAnim >= 34 && tickAnim < 38) {
            xx = 6.21535 + (((tickAnim - 34) / 4) * (17.28264-(6.21535)));
            yy = -9.8235 + (((tickAnim - 34) / 4) * (8.95847-(-9.8235)));
            zz = -7.01082 + (((tickAnim - 34) / 4) * (-23.10577-(-7.01082)));
        }
        else if (tickAnim >= 38 && tickAnim < 42) {
            xx = 17.28264 + (((tickAnim - 38) / 4) * (-1.47869-(17.28264)));
            yy = 8.95847 + (((tickAnim - 38) / 4) * (19.05569-(8.95847)));
            zz = -23.10577 + (((tickAnim - 38) / 4) * (0.88071-(-23.10577)));
        }
        else if (tickAnim >= 42 && tickAnim < 48) {
            xx = -1.47869 + (((tickAnim - 42) / 6) * (4.29-(-1.47869)));
            yy = 19.05569 + (((tickAnim - 42) / 6) * (-2.6-(19.05569)));
            zz = 0.88071 + (((tickAnim - 42) / 6) * (-5.04-(0.88071)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg12, leftLeg12.rotateAngleX + (float) Math.toRadians(xx), leftLeg12.rotateAngleY + (float) Math.toRadians(yy), leftLeg12.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 7.9 + (((tickAnim - 0) / 2) * (-1.47869-(7.9)));
            yy = -14.01 + (((tickAnim - 0) / 2) * (-19.05569-(-14.01)));
            zz = 11.11 + (((tickAnim - 0) / 2) * (-0.88071-(11.11)));
        }
        else if (tickAnim >= 2 && tickAnim < 10) {
            xx = -1.47869 + (((tickAnim - 2) / 8) * (6.21535-(-1.47869)));
            yy = -19.05569 + (((tickAnim - 2) / 8) * (9.8235-(-19.05569)));
            zz = -0.88071 + (((tickAnim - 2) / 8) * (7.01082-(-0.88071)));
        }
        else if (tickAnim >= 10 && tickAnim < 14) {
            xx = 6.21535 + (((tickAnim - 10) / 4) * (17.28264-(6.21535)));
            yy = 9.8235 + (((tickAnim - 10) / 4) * (-8.95847-(9.8235)));
            zz = 7.01082 + (((tickAnim - 10) / 4) * (23.10577-(7.01082)));
        }
        else if (tickAnim >= 14 && tickAnim < 18) {
            xx = 17.28264 + (((tickAnim - 14) / 4) * (-1.47869-(17.28264)));
            yy = -8.95847 + (((tickAnim - 14) / 4) * (-19.05569-(-8.95847)));
            zz = 23.10577 + (((tickAnim - 14) / 4) * (-0.88071-(23.10577)));
        }
        else if (tickAnim >= 18 && tickAnim < 26) {
            xx = -1.47869 + (((tickAnim - 18) / 8) * (6.21535-(-1.47869)));
            yy = -19.05569 + (((tickAnim - 18) / 8) * (9.8235-(-19.05569)));
            zz = -0.88071 + (((tickAnim - 18) / 8) * (7.01082-(-0.88071)));
        }
        else if (tickAnim >= 26 && tickAnim < 30) {
            xx = 6.21535 + (((tickAnim - 26) / 4) * (17.28264-(6.21535)));
            yy = 9.8235 + (((tickAnim - 26) / 4) * (-8.95847-(9.8235)));
            zz = 7.01082 + (((tickAnim - 26) / 4) * (23.10577-(7.01082)));
        }
        else if (tickAnim >= 30 && tickAnim < 34) {
            xx = 17.28264 + (((tickAnim - 30) / 4) * (-1.47869-(17.28264)));
            yy = -8.95847 + (((tickAnim - 30) / 4) * (-19.05569-(-8.95847)));
            zz = 23.10577 + (((tickAnim - 30) / 4) * (-0.88071-(23.10577)));
        }
        else if (tickAnim >= 34 && tickAnim < 42) {
            xx = -1.47869 + (((tickAnim - 34) / 8) * (6.21535-(-1.47869)));
            yy = -19.05569 + (((tickAnim - 34) / 8) * (9.8235-(-19.05569)));
            zz = -0.88071 + (((tickAnim - 34) / 8) * (7.01082-(-0.88071)));
        }
        else if (tickAnim >= 42 && tickAnim < 46) {
            xx = 6.21535 + (((tickAnim - 42) / 4) * (17.28264-(6.21535)));
            yy = 9.8235 + (((tickAnim - 42) / 4) * (-8.95847-(9.8235)));
            zz = 7.01082 + (((tickAnim - 42) / 4) * (23.10577-(7.01082)));
        }
        else if (tickAnim >= 46 && tickAnim < 48) {
            xx = 17.28264 + (((tickAnim - 46) / 2) * (7.9-(17.28264)));
            yy = -8.95847 + (((tickAnim - 46) / 2) * (-14.01-(-8.95847)));
            zz = 23.10577 + (((tickAnim - 46) / 2) * (11.11-(23.10577)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg12, rightLeg12.rotateAngleX + (float) Math.toRadians(xx), rightLeg12.rotateAngleY + (float) Math.toRadians(yy), rightLeg12.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 4.98611 + (((tickAnim - 0) / 4) * (18.69591-(4.98611)));
            yy = -4.84706 + (((tickAnim - 0) / 4) * (14.07241-(-4.84706)));
            zz = -5.6894 + (((tickAnim - 0) / 4) * (-23.8403-(-5.6894)));
        }
        else if (tickAnim >= 4 && tickAnim < 8) {
            xx = 18.69591 + (((tickAnim - 4) / 4) * (-1.02262-(18.69591)));
            yy = 14.07241 + (((tickAnim - 4) / 4) * (27.51976-(14.07241)));
            zz = -23.8403 + (((tickAnim - 4) / 4) * (2.52272-(-23.8403)));
        }
        else if (tickAnim >= 8 && tickAnim < 16) {
            xx = -1.02262 + (((tickAnim - 8) / 8) * (4.98611-(-1.02262)));
            yy = 27.51976 + (((tickAnim - 8) / 8) * (-4.84706-(27.51976)));
            zz = 2.52272 + (((tickAnim - 8) / 8) * (-5.6894-(2.52272)));
        }
        else if (tickAnim >= 16 && tickAnim < 20) {
            xx = 4.98611 + (((tickAnim - 16) / 4) * (18.69591-(4.98611)));
            yy = -4.84706 + (((tickAnim - 16) / 4) * (14.07241-(-4.84706)));
            zz = -5.6894 + (((tickAnim - 16) / 4) * (-23.8403-(-5.6894)));
        }
        else if (tickAnim >= 20 && tickAnim < 24) {
            xx = 18.69591 + (((tickAnim - 20) / 4) * (-1.02262-(18.69591)));
            yy = 14.07241 + (((tickAnim - 20) / 4) * (27.51976-(14.07241)));
            zz = -23.8403 + (((tickAnim - 20) / 4) * (2.52272-(-23.8403)));
        }
        else if (tickAnim >= 24 && tickAnim < 32) {
            xx = -1.02262 + (((tickAnim - 24) / 8) * (4.98611-(-1.02262)));
            yy = 27.51976 + (((tickAnim - 24) / 8) * (-4.84706-(27.51976)));
            zz = 2.52272 + (((tickAnim - 24) / 8) * (-5.6894-(2.52272)));
        }
        else if (tickAnim >= 32 && tickAnim < 36) {
            xx = 4.98611 + (((tickAnim - 32) / 4) * (18.69591-(4.98611)));
            yy = -4.84706 + (((tickAnim - 32) / 4) * (14.07241-(-4.84706)));
            zz = -5.6894 + (((tickAnim - 32) / 4) * (-23.8403-(-5.6894)));
        }
        else if (tickAnim >= 36 && tickAnim < 40) {
            xx = 18.69591 + (((tickAnim - 36) / 4) * (-1.02262-(18.69591)));
            yy = 14.07241 + (((tickAnim - 36) / 4) * (27.51976-(14.07241)));
            zz = -23.8403 + (((tickAnim - 36) / 4) * (2.52272-(-23.8403)));
        }
        else if (tickAnim >= 40 && tickAnim < 48) {
            xx = -1.02262 + (((tickAnim - 40) / 8) * (4.98611-(-1.02262)));
            yy = 27.51976 + (((tickAnim - 40) / 8) * (-4.84706-(27.51976)));
            zz = 2.52272 + (((tickAnim - 40) / 8) * (-5.6894-(2.52272)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg13, leftLeg13.rotateAngleX + (float) Math.toRadians(xx), leftLeg13.rotateAngleY + (float) Math.toRadians(yy), leftLeg13.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = -1.02262 + (((tickAnim - 0) / 8) * (4.98611-(-1.02262)));
            yy = -27.51976 + (((tickAnim - 0) / 8) * (4.84706-(-27.51976)));
            zz = -2.52272 + (((tickAnim - 0) / 8) * (5.6894-(-2.52272)));
        }
        else if (tickAnim >= 8 && tickAnim < 12) {
            xx = 4.98611 + (((tickAnim - 8) / 4) * (18.69591-(4.98611)));
            yy = 4.84706 + (((tickAnim - 8) / 4) * (-14.07241-(4.84706)));
            zz = 5.6894 + (((tickAnim - 8) / 4) * (23.8403-(5.6894)));
        }
        else if (tickAnim >= 12 && tickAnim < 16) {
            xx = 18.69591 + (((tickAnim - 12) / 4) * (-1.02262-(18.69591)));
            yy = -14.07241 + (((tickAnim - 12) / 4) * (-27.51976-(-14.07241)));
            zz = 23.8403 + (((tickAnim - 12) / 4) * (-2.52272-(23.8403)));
        }
        else if (tickAnim >= 16 && tickAnim < 24) {
            xx = -1.02262 + (((tickAnim - 16) / 8) * (4.98611-(-1.02262)));
            yy = -27.51976 + (((tickAnim - 16) / 8) * (4.84706-(-27.51976)));
            zz = -2.52272 + (((tickAnim - 16) / 8) * (5.6894-(-2.52272)));
        }
        else if (tickAnim >= 24 && tickAnim < 28) {
            xx = 4.98611 + (((tickAnim - 24) / 4) * (18.69591-(4.98611)));
            yy = 4.84706 + (((tickAnim - 24) / 4) * (-14.07241-(4.84706)));
            zz = 5.6894 + (((tickAnim - 24) / 4) * (23.8403-(5.6894)));
        }
        else if (tickAnim >= 28 && tickAnim < 32) {
            xx = 18.69591 + (((tickAnim - 28) / 4) * (-1.02262-(18.69591)));
            yy = -14.07241 + (((tickAnim - 28) / 4) * (-27.51976-(-14.07241)));
            zz = 23.8403 + (((tickAnim - 28) / 4) * (-2.52272-(23.8403)));
        }
        else if (tickAnim >= 32 && tickAnim < 40) {
            xx = -1.02262 + (((tickAnim - 32) / 8) * (4.98611-(-1.02262)));
            yy = -27.51976 + (((tickAnim - 32) / 8) * (4.84706-(-27.51976)));
            zz = -2.52272 + (((tickAnim - 32) / 8) * (5.6894-(-2.52272)));
        }
        else if (tickAnim >= 40 && tickAnim < 44) {
            xx = 4.98611 + (((tickAnim - 40) / 4) * (18.69591-(4.98611)));
            yy = 4.84706 + (((tickAnim - 40) / 4) * (-14.07241-(4.84706)));
            zz = 5.6894 + (((tickAnim - 40) / 4) * (23.8403-(5.6894)));
        }
        else if (tickAnim >= 44 && tickAnim < 48) {
            xx = 18.69591 + (((tickAnim - 44) / 4) * (-1.02262-(18.69591)));
            yy = -14.07241 + (((tickAnim - 44) / 4) * (-27.51976-(-14.07241)));
            zz = 23.8403 + (((tickAnim - 44) / 4) * (-2.52272-(23.8403)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg13, rightLeg13.rotateAngleX + (float) Math.toRadians(xx), rightLeg13.rotateAngleY + (float) Math.toRadians(yy), rightLeg13.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 17.29 + (((tickAnim - 0) / 2) * (25.57677-(17.29)));
            yy = 8.75 + (((tickAnim - 0) / 2) * (19.82178-(8.75)));
            zz = -13.39 + (((tickAnim - 0) / 2) * (-24.9331-(-13.39)));
        }
        else if (tickAnim >= 2 && tickAnim < 6) {
            xx = 25.57677 + (((tickAnim - 2) / 4) * (1.88103-(25.57677)));
            yy = 19.82178 + (((tickAnim - 2) / 4) * (35.15634-(19.82178)));
            zz = -24.9331 + (((tickAnim - 2) / 4) * (-1.17111-(-24.9331)));
        }
        else if (tickAnim >= 6 && tickAnim < 14) {
            xx = 1.88103 + (((tickAnim - 6) / 8) * (9.00124-(1.88103)));
            yy = 35.15634 + (((tickAnim - 6) / 8) * (-2.32709-(35.15634)));
            zz = -1.17111 + (((tickAnim - 6) / 8) * (-1.8492-(-1.17111)));
        }
        else if (tickAnim >= 14 && tickAnim < 18) {
            xx = 9.00124 + (((tickAnim - 14) / 4) * (25.57677-(9.00124)));
            yy = -2.32709 + (((tickAnim - 14) / 4) * (19.82178-(-2.32709)));
            zz = -1.8492 + (((tickAnim - 14) / 4) * (-24.9331-(-1.8492)));
        }
        else if (tickAnim >= 18 && tickAnim < 22) {
            xx = 25.57677 + (((tickAnim - 18) / 4) * (1.88103-(25.57677)));
            yy = 19.82178 + (((tickAnim - 18) / 4) * (35.15634-(19.82178)));
            zz = -24.9331 + (((tickAnim - 18) / 4) * (-1.17111-(-24.9331)));
        }
        else if (tickAnim >= 22 && tickAnim < 30) {
            xx = 1.88103 + (((tickAnim - 22) / 8) * (9.00124-(1.88103)));
            yy = 35.15634 + (((tickAnim - 22) / 8) * (-2.32709-(35.15634)));
            zz = -1.17111 + (((tickAnim - 22) / 8) * (-1.8492-(-1.17111)));
        }
        else if (tickAnim >= 30 && tickAnim < 34) {
            xx = 9.00124 + (((tickAnim - 30) / 4) * (25.57677-(9.00124)));
            yy = -2.32709 + (((tickAnim - 30) / 4) * (19.82178-(-2.32709)));
            zz = -1.8492 + (((tickAnim - 30) / 4) * (-24.9331-(-1.8492)));
        }
        else if (tickAnim >= 34 && tickAnim < 38) {
            xx = 25.57677 + (((tickAnim - 34) / 4) * (1.88103-(25.57677)));
            yy = 19.82178 + (((tickAnim - 34) / 4) * (35.15634-(19.82178)));
            zz = -24.9331 + (((tickAnim - 34) / 4) * (-1.17111-(-24.9331)));
        }
        else if (tickAnim >= 38 && tickAnim < 46) {
            xx = 1.88103 + (((tickAnim - 38) / 8) * (9.00124-(1.88103)));
            yy = 35.15634 + (((tickAnim - 38) / 8) * (-2.32709-(35.15634)));
            zz = -1.17111 + (((tickAnim - 38) / 8) * (-1.8492-(-1.17111)));
        }
        else if (tickAnim >= 46 && tickAnim < 48) {
            xx = 9.00124 + (((tickAnim - 46) / 2) * (17.29-(9.00124)));
            yy = -2.32709 + (((tickAnim - 46) / 2) * (8.75-(-2.32709)));
            zz = -1.8492 + (((tickAnim - 46) / 2) * (-13.39-(-1.8492)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg14, leftLeg14.rotateAngleX + (float) Math.toRadians(xx), leftLeg14.rotateAngleY + (float) Math.toRadians(yy), leftLeg14.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 3.66 + (((tickAnim - 0) / 6) * (9.00124-(3.66)));
            yy = -25.79 + (((tickAnim - 0) / 6) * (2.32709-(-25.79)));
            zz = 1.34 + (((tickAnim - 0) / 6) * (1.8492-(1.34)));
        }
        else if (tickAnim >= 6 && tickAnim < 10) {
            xx = 9.00124 + (((tickAnim - 6) / 4) * (25.57677-(9.00124)));
            yy = 2.32709 + (((tickAnim - 6) / 4) * (-19.82178-(2.32709)));
            zz = 1.8492 + (((tickAnim - 6) / 4) * (24.9331-(1.8492)));
        }
        else if (tickAnim >= 10 && tickAnim < 14) {
            xx = 25.57677 + (((tickAnim - 10) / 4) * (1.88103-(25.57677)));
            yy = -19.82178 + (((tickAnim - 10) / 4) * (-35.15634-(-19.82178)));
            zz = 24.9331 + (((tickAnim - 10) / 4) * (1.17111-(24.9331)));
        }
        else if (tickAnim >= 14 && tickAnim < 22) {
            xx = 1.88103 + (((tickAnim - 14) / 8) * (9.00124-(1.88103)));
            yy = -35.15634 + (((tickAnim - 14) / 8) * (2.32709-(-35.15634)));
            zz = 1.17111 + (((tickAnim - 14) / 8) * (1.8492-(1.17111)));
        }
        else if (tickAnim >= 22 && tickAnim < 26) {
            xx = 9.00124 + (((tickAnim - 22) / 4) * (25.57677-(9.00124)));
            yy = 2.32709 + (((tickAnim - 22) / 4) * (-19.82178-(2.32709)));
            zz = 1.8492 + (((tickAnim - 22) / 4) * (24.9331-(1.8492)));
        }
        else if (tickAnim >= 26 && tickAnim < 30) {
            xx = 25.57677 + (((tickAnim - 26) / 4) * (1.88103-(25.57677)));
            yy = -19.82178 + (((tickAnim - 26) / 4) * (-35.15634-(-19.82178)));
            zz = 24.9331 + (((tickAnim - 26) / 4) * (1.17111-(24.9331)));
        }
        else if (tickAnim >= 30 && tickAnim < 38) {
            xx = 1.88103 + (((tickAnim - 30) / 8) * (9.00124-(1.88103)));
            yy = -35.15634 + (((tickAnim - 30) / 8) * (2.32709-(-35.15634)));
            zz = 1.17111 + (((tickAnim - 30) / 8) * (1.8492-(1.17111)));
        }
        else if (tickAnim >= 38 && tickAnim < 42) {
            xx = 9.00124 + (((tickAnim - 38) / 4) * (25.57677-(9.00124)));
            yy = 2.32709 + (((tickAnim - 38) / 4) * (-19.82178-(2.32709)));
            zz = 1.8492 + (((tickAnim - 38) / 4) * (24.9331-(1.8492)));
        }
        else if (tickAnim >= 42 && tickAnim < 46) {
            xx = 25.57677 + (((tickAnim - 42) / 4) * (1.88103-(25.57677)));
            yy = -19.82178 + (((tickAnim - 42) / 4) * (-35.15634-(-19.82178)));
            zz = 24.9331 + (((tickAnim - 42) / 4) * (1.17111-(24.9331)));
        }
        else if (tickAnim >= 46 && tickAnim < 48) {
            xx = 1.88103 + (((tickAnim - 46) / 2) * (3.66-(1.88103)));
            yy = -35.15634 + (((tickAnim - 46) / 2) * (-25.79-(-35.15634)));
            zz = 1.17111 + (((tickAnim - 46) / 2) * (1.34-(1.17111)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg14, rightLeg14.rotateAngleX + (float) Math.toRadians(xx), rightLeg14.rotateAngleY + (float) Math.toRadians(yy), rightLeg14.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 35.76797 + (((tickAnim - 0) / 4) * (1.45184-(35.76797)));
            yy = 29.69986 + (((tickAnim - 0) / 4) * (42.65389-(29.69986)));
            zz = -35.42503 + (((tickAnim - 0) / 4) * (-0.71049-(-35.42503)));
        }
        else if (tickAnim >= 4 && tickAnim < 12) {
            xx = 1.45184 + (((tickAnim - 4) / 8) * (-0.2941-(1.45184)));
            yy = 42.65389 + (((tickAnim - 4) / 8) * (5.21367-(42.65389)));
            zz = -0.71049 + (((tickAnim - 4) / 8) * (7.39367-(-0.71049)));
        }
        else if (tickAnim >= 12 && tickAnim < 16) {
            xx = -0.2941 + (((tickAnim - 12) / 4) * (35.76797-(-0.2941)));
            yy = 5.21367 + (((tickAnim - 12) / 4) * (29.69986-(5.21367)));
            zz = 7.39367 + (((tickAnim - 12) / 4) * (-35.42503-(7.39367)));
        }
        else if (tickAnim >= 16 && tickAnim < 20) {
            xx = 35.76797 + (((tickAnim - 16) / 4) * (1.45184-(35.76797)));
            yy = 29.69986 + (((tickAnim - 16) / 4) * (42.65389-(29.69986)));
            zz = -35.42503 + (((tickAnim - 16) / 4) * (-0.71049-(-35.42503)));
        }
        else if (tickAnim >= 20 && tickAnim < 28) {
            xx = 1.45184 + (((tickAnim - 20) / 8) * (-0.2941-(1.45184)));
            yy = 42.65389 + (((tickAnim - 20) / 8) * (5.21367-(42.65389)));
            zz = -0.71049 + (((tickAnim - 20) / 8) * (7.39367-(-0.71049)));
        }
        else if (tickAnim >= 28 && tickAnim < 32) {
            xx = -0.2941 + (((tickAnim - 28) / 4) * (35.76797-(-0.2941)));
            yy = 5.21367 + (((tickAnim - 28) / 4) * (29.69986-(5.21367)));
            zz = 7.39367 + (((tickAnim - 28) / 4) * (-35.42503-(7.39367)));
        }
        else if (tickAnim >= 32 && tickAnim < 36) {
            xx = 35.76797 + (((tickAnim - 32) / 4) * (1.45184-(35.76797)));
            yy = 29.69986 + (((tickAnim - 32) / 4) * (42.65389-(29.69986)));
            zz = -35.42503 + (((tickAnim - 32) / 4) * (-0.71049-(-35.42503)));
        }
        else if (tickAnim >= 36 && tickAnim < 44) {
            xx = 1.45184 + (((tickAnim - 36) / 8) * (-0.2941-(1.45184)));
            yy = 42.65389 + (((tickAnim - 36) / 8) * (5.21367-(42.65389)));
            zz = -0.71049 + (((tickAnim - 36) / 8) * (7.39367-(-0.71049)));
        }
        else if (tickAnim >= 44 && tickAnim < 48) {
            xx = -0.2941 + (((tickAnim - 44) / 4) * (35.76797-(-0.2941)));
            yy = 5.21367 + (((tickAnim - 44) / 4) * (29.69986-(5.21367)));
            zz = 7.39367 + (((tickAnim - 44) / 4) * (-35.42503-(7.39367)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg15, leftLeg15.rotateAngleX + (float) Math.toRadians(xx), leftLeg15.rotateAngleY + (float) Math.toRadians(yy), leftLeg15.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0.58 + (((tickAnim - 0) / 4) * (-0.2941-(0.58)));
            yy = -23.93 + (((tickAnim - 0) / 4) * (-5.21367-(-23.93)));
            zz = -3.34 + (((tickAnim - 0) / 4) * (-7.39367-(-3.34)));
        }
        else if (tickAnim >= 4 && tickAnim < 8) {
            xx = -0.2941 + (((tickAnim - 4) / 4) * (35.76797-(-0.2941)));
            yy = -5.21367 + (((tickAnim - 4) / 4) * (-29.69986-(-5.21367)));
            zz = -7.39367 + (((tickAnim - 4) / 4) * (35.42503-(-7.39367)));
        }
        else if (tickAnim >= 8 && tickAnim < 12) {
            xx = 35.76797 + (((tickAnim - 8) / 4) * (1.45184-(35.76797)));
            yy = -29.69986 + (((tickAnim - 8) / 4) * (-42.65389-(-29.69986)));
            zz = 35.42503 + (((tickAnim - 8) / 4) * (0.71049-(35.42503)));
        }
        else if (tickAnim >= 12 && tickAnim < 20) {
            xx = 1.45184 + (((tickAnim - 12) / 8) * (-0.2941-(1.45184)));
            yy = -42.65389 + (((tickAnim - 12) / 8) * (-5.21367-(-42.65389)));
            zz = 0.71049 + (((tickAnim - 12) / 8) * (-7.39367-(0.71049)));
        }
        else if (tickAnim >= 20 && tickAnim < 24) {
            xx = -0.2941 + (((tickAnim - 20) / 4) * (35.76797-(-0.2941)));
            yy = -5.21367 + (((tickAnim - 20) / 4) * (-29.69986-(-5.21367)));
            zz = -7.39367 + (((tickAnim - 20) / 4) * (35.42503-(-7.39367)));
        }
        else if (tickAnim >= 24 && tickAnim < 28) {
            xx = 35.76797 + (((tickAnim - 24) / 4) * (1.45184-(35.76797)));
            yy = -29.69986 + (((tickAnim - 24) / 4) * (-42.65389-(-29.69986)));
            zz = 35.42503 + (((tickAnim - 24) / 4) * (0.71049-(35.42503)));
        }
        else if (tickAnim >= 28 && tickAnim < 36) {
            xx = 1.45184 + (((tickAnim - 28) / 8) * (-0.2941-(1.45184)));
            yy = -42.65389 + (((tickAnim - 28) / 8) * (-5.21367-(-42.65389)));
            zz = 0.71049 + (((tickAnim - 28) / 8) * (-7.39367-(0.71049)));
        }
        else if (tickAnim >= 36 && tickAnim < 40) {
            xx = -0.2941 + (((tickAnim - 36) / 4) * (35.76797-(-0.2941)));
            yy = -5.21367 + (((tickAnim - 36) / 4) * (-29.69986-(-5.21367)));
            zz = -7.39367 + (((tickAnim - 36) / 4) * (35.42503-(-7.39367)));
        }
        else if (tickAnim >= 40 && tickAnim < 44) {
            xx = 35.76797 + (((tickAnim - 40) / 4) * (1.45184-(35.76797)));
            yy = -29.69986 + (((tickAnim - 40) / 4) * (-42.65389-(-29.69986)));
            zz = 35.42503 + (((tickAnim - 40) / 4) * (0.71049-(35.42503)));
        }
        else if (tickAnim >= 44 && tickAnim < 48) {
            xx = 1.45184 + (((tickAnim - 44) / 4) * (0.58-(1.45184)));
            yy = -42.65389 + (((tickAnim - 44) / 4) * (-23.93-(-42.65389)));
            zz = 0.71049 + (((tickAnim - 44) / 4) * (-3.34-(0.71049)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg15, rightLeg15.rotateAngleX + (float) Math.toRadians(xx), rightLeg15.rotateAngleY + (float) Math.toRadians(yy), rightLeg15.rotateAngleZ + (float) Math.toRadians(zz));



        this.setRotateAngle(ultimatelegleft, ultimatelegleft.rotateAngleX + (float) Math.toRadians(0), ultimatelegleft.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*(376*2)))), ultimatelegleft.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(ultimatelegright, ultimatelegright.rotateAngleX + (float) Math.toRadians(0), ultimatelegright.rotateAngleY + (float) Math.toRadians(-(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*(376*2))))*3), ultimatelegright.rotateAngleZ + (float) Math.toRadians(0));

    }

    public void animRun(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraMyriapod entity = (EntityPrehistoricFloraMyriapod) entitylivingbaseIn;
        int animCycle = 19;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians((Math.sin((Math.PI/180)*((((double)tickAnim/20D))*(376*2))-90))), body.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*(376*2)))), body.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(leftAntenna1, leftAntenna1.rotateAngleX + (float) Math.toRadians(0), leftAntenna1.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*(376*2)))*3), leftAntenna1.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(rightAntenna1, rightAntenna1.rotateAngleX + (float) Math.toRadians(0), rightAntenna1.rotateAngleY + (float) Math.toRadians(-(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*(376*2))))*3), rightAntenna1.rotateAngleZ + (float) Math.toRadians(0));



        if (tickAnim >= 0 && tickAnim < 3) {
            xx = -7.32438 + (((tickAnim - 0) / 3) * (0.59034-(-7.32438)));
            yy = 21.29336 + (((tickAnim - 0) / 3) * (-24.53172-(21.29336)));
            zz = 1.89957 + (((tickAnim - 0) / 3) * (0.2042-(1.89957)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 0.59034 + (((tickAnim - 3) / 2) * (-8.78775-(0.59034)));
            yy = -24.53172 + (((tickAnim - 3) / 2) * (-0.47627-(-24.53172)));
            zz = 0.2042 + (((tickAnim - 3) / 2) * (-20.8186-(0.2042)));
        }
        else if (tickAnim >= 5 && tickAnim < 6) {
            xx = -8.78775 + (((tickAnim - 5) / 1) * (-7.32438-(-8.78775)));
            yy = -0.47627 + (((tickAnim - 5) / 1) * (21.29336-(-0.47627)));
            zz = -20.8186 + (((tickAnim - 5) / 1) * (1.89957-(-20.8186)));
        }
        else if (tickAnim >= 6 && tickAnim < 10) {
            xx = -7.32438 + (((tickAnim - 6) / 4) * (0.59034-(-7.32438)));
            yy = 21.29336 + (((tickAnim - 6) / 4) * (-24.53172-(21.29336)));
            zz = 1.89957 + (((tickAnim - 6) / 4) * (0.2042-(1.89957)));
        }
        else if (tickAnim >= 10 && tickAnim < 11) {
            xx = 0.59034 + (((tickAnim - 10) / 1) * (-8.78775-(0.59034)));
            yy = -24.53172 + (((tickAnim - 10) / 1) * (-0.47627-(-24.53172)));
            zz = 0.2042 + (((tickAnim - 10) / 1) * (-20.8186-(0.2042)));
        }
        else if (tickAnim >= 11 && tickAnim < 13) {
            xx = -8.78775 + (((tickAnim - 11) / 2) * (-7.32438-(-8.78775)));
            yy = -0.47627 + (((tickAnim - 11) / 2) * (21.29336-(-0.47627)));
            zz = -20.8186 + (((tickAnim - 11) / 2) * (1.89957-(-20.8186)));
        }
        else if (tickAnim >= 13 && tickAnim < 16) {
            xx = -7.32438 + (((tickAnim - 13) / 3) * (0.59034-(-7.32438)));
            yy = 21.29336 + (((tickAnim - 13) / 3) * (-24.53172-(21.29336)));
            zz = 1.89957 + (((tickAnim - 13) / 3) * (0.2042-(1.89957)));
        }
        else if (tickAnim >= 16 && tickAnim < 18) {
            xx = 0.59034 + (((tickAnim - 16) / 2) * (-8.78775-(0.59034)));
            yy = -24.53172 + (((tickAnim - 16) / 2) * (-0.47627-(-24.53172)));
            zz = 0.2042 + (((tickAnim - 16) / 2) * (-20.8186-(0.2042)));
        }
        else if (tickAnim >= 18 && tickAnim < 19) {
            xx = -8.78775 + (((tickAnim - 18) / 1) * (-7.32438-(-8.78775)));
            yy = -0.47627 + (((tickAnim - 18) / 1) * (21.29336-(-0.47627)));
            zz = -20.8186 + (((tickAnim - 18) / 1) * (1.89957-(-20.8186)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg1, leftLeg1.rotateAngleX + (float) Math.toRadians(xx), leftLeg1.rotateAngleY + (float) Math.toRadians(yy), leftLeg1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0.59034 + (((tickAnim - 0) / 2) * (-8.78775-(0.59034)));
            yy = 24.53172 + (((tickAnim - 0) / 2) * (0.47627-(24.53172)));
            zz = -0.2042 + (((tickAnim - 0) / 2) * (20.8186-(-0.2042)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = -8.78775 + (((tickAnim - 2) / 1) * (-7.32438-(-8.78775)));
            yy = 0.47627 + (((tickAnim - 2) / 1) * (-21.29336-(0.47627)));
            zz = 20.8186 + (((tickAnim - 2) / 1) * (-1.89957-(20.8186)));
        }
        else if (tickAnim >= 3 && tickAnim < 6) {
            xx = -7.32438 + (((tickAnim - 3) / 3) * (0.59034-(-7.32438)));
            yy = -21.29336 + (((tickAnim - 3) / 3) * (24.53172-(-21.29336)));
            zz = -1.89957 + (((tickAnim - 3) / 3) * (-0.2042-(-1.89957)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = 0.59034 + (((tickAnim - 6) / 2) * (-8.78775-(0.59034)));
            yy = 24.53172 + (((tickAnim - 6) / 2) * (0.47627-(24.53172)));
            zz = -0.2042 + (((tickAnim - 6) / 2) * (20.8186-(-0.2042)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = -8.78775 + (((tickAnim - 8) / 2) * (-7.32438-(-8.78775)));
            yy = 0.47627 + (((tickAnim - 8) / 2) * (-21.29336-(0.47627)));
            zz = 20.8186 + (((tickAnim - 8) / 2) * (-1.89957-(20.8186)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = -7.32438 + (((tickAnim - 10) / 3) * (0.59034-(-7.32438)));
            yy = -21.29336 + (((tickAnim - 10) / 3) * (24.53172-(-21.29336)));
            zz = -1.89957 + (((tickAnim - 10) / 3) * (-0.2042-(-1.89957)));
        }
        else if (tickAnim >= 13 && tickAnim < 14) {
            xx = 0.59034 + (((tickAnim - 13) / 1) * (-8.78775-(0.59034)));
            yy = 24.53172 + (((tickAnim - 13) / 1) * (0.47627-(24.53172)));
            zz = -0.2042 + (((tickAnim - 13) / 1) * (20.8186-(-0.2042)));
        }
        else if (tickAnim >= 14 && tickAnim < 16) {
            xx = -8.78775 + (((tickAnim - 14) / 2) * (-7.32438-(-8.78775)));
            yy = 0.47627 + (((tickAnim - 14) / 2) * (-21.29336-(0.47627)));
            zz = 20.8186 + (((tickAnim - 14) / 2) * (-1.89957-(20.8186)));
        }
        else if (tickAnim >= 16 && tickAnim < 19) {
            xx = -7.32438 + (((tickAnim - 16) / 3) * (0.59034-(-7.32438)));
            yy = -21.29336 + (((tickAnim - 16) / 3) * (24.53172-(-21.29336)));
            zz = -1.89957 + (((tickAnim - 16) / 3) * (-0.2042-(-1.89957)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg1, rightLeg1.rotateAngleX + (float) Math.toRadians(xx), rightLeg1.rotateAngleY + (float) Math.toRadians(yy), rightLeg1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = -0.01 + (((tickAnim - 0) / 2) * (-0.0231-(-0.01)));
            yy = 8.75 + (((tickAnim - 0) / 2) * (-17.5014-(8.75)));
            zz = -0.04 + (((tickAnim - 0) / 2) * (-0.1733-(-0.04)));
        }
        else if (tickAnim >= 2 && tickAnim < 4) {
            xx = -0.0231 + (((tickAnim - 2) / 2) * (-15.76886-(-0.0231)));
            yy = -17.5014 + (((tickAnim - 2) / 2) * (-9.767-(-17.5014)));
            zz = -0.1733 + (((tickAnim - 2) / 2) * (-29.28473-(-0.1733)));
        }
        else if (tickAnim >= 4 && tickAnim < 6) {
            xx = -15.76886 + (((tickAnim - 4) / 2) * (0-(-15.76886)));
            yy = -9.767 + (((tickAnim - 4) / 2) * (17.5-(-9.767)));
            zz = -29.28473 + (((tickAnim - 4) / 2) * (0-(-29.28473)));
        }
        else if (tickAnim >= 6 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 6) / 3) * (-0.0231-(0)));
            yy = 17.5 + (((tickAnim - 6) / 3) * (-17.5014-(17.5)));
            zz = 0 + (((tickAnim - 6) / 3) * (-0.1733-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 10) {
            xx = -0.0231 + (((tickAnim - 9) / 1) * (-15.76886-(-0.0231)));
            yy = -17.5014 + (((tickAnim - 9) / 1) * (-9.767-(-17.5014)));
            zz = -0.1733 + (((tickAnim - 9) / 1) * (-29.28473-(-0.1733)));
        }
        else if (tickAnim >= 10 && tickAnim < 12) {
            xx = -15.76886 + (((tickAnim - 10) / 2) * (0-(-15.76886)));
            yy = -9.767 + (((tickAnim - 10) / 2) * (17.5-(-9.767)));
            zz = -29.28473 + (((tickAnim - 10) / 2) * (0-(-29.28473)));
        }
        else if (tickAnim >= 12 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 12) / 3) * (-0.0231-(0)));
            yy = 17.5 + (((tickAnim - 12) / 3) * (-17.5014-(17.5)));
            zz = 0 + (((tickAnim - 12) / 3) * (-0.1733-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 17) {
            xx = -0.0231 + (((tickAnim - 15) / 2) * (-15.76886-(-0.0231)));
            yy = -17.5014 + (((tickAnim - 15) / 2) * (-9.767-(-17.5014)));
            zz = -0.1733 + (((tickAnim - 15) / 2) * (-29.28473-(-0.1733)));
        }
        else if (tickAnim >= 17 && tickAnim < 18) {
            xx = -15.76886 + (((tickAnim - 17) / 1) * (0-(-15.76886)));
            yy = -9.767 + (((tickAnim - 17) / 1) * (17.5-(-9.767)));
            zz = -29.28473 + (((tickAnim - 17) / 1) * (0-(-29.28473)));
        }
        else if (tickAnim >= 18 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 18) / 1) * (-0.01-(0)));
            yy = 17.5 + (((tickAnim - 18) / 1) * (8.75-(17.5)));
            zz = 0 + (((tickAnim - 18) / 1) * (-0.04-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg2, leftLeg2.rotateAngleX + (float) Math.toRadians(xx), leftLeg2.rotateAngleY + (float) Math.toRadians(yy), leftLeg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 1) {
            xx = -7.9 + (((tickAnim - 0) / 1) * (-15.76886-(-7.9)));
            yy = 13.63 + (((tickAnim - 0) / 1) * (9.767-(13.63)));
            zz = 14.73 + (((tickAnim - 0) / 1) * (29.28473-(14.73)));
        }
        else if (tickAnim >= 1 && tickAnim < 2) {
            xx = -15.76886 + (((tickAnim - 1) / 1) * (0-(-15.76886)));
            yy = 9.767 + (((tickAnim - 1) / 1) * (-17.5-(9.767)));
            zz = 29.28473 + (((tickAnim - 1) / 1) * (0-(29.28473)));
        }
        else if (tickAnim >= 2 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 2) / 4) * (-0.0231-(0)));
            yy = -17.5 + (((tickAnim - 2) / 4) * (17.5014-(-17.5)));
            zz = 0 + (((tickAnim - 2) / 4) * (0.1733-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 7) {
            xx = -0.0231 + (((tickAnim - 6) / 1) * (-15.76886-(-0.0231)));
            yy = 17.5014 + (((tickAnim - 6) / 1) * (9.767-(17.5014)));
            zz = 0.1733 + (((tickAnim - 6) / 1) * (29.28473-(0.1733)));
        }
        else if (tickAnim >= 7 && tickAnim < 9) {
            xx = -15.76886 + (((tickAnim - 7) / 2) * (0-(-15.76886)));
            yy = 9.767 + (((tickAnim - 7) / 2) * (-17.5-(9.767)));
            zz = 29.28473 + (((tickAnim - 7) / 2) * (0-(29.28473)));
        }
        else if (tickAnim >= 9 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 9) / 3) * (-0.0231-(0)));
            yy = -17.5 + (((tickAnim - 9) / 3) * (17.5014-(-17.5)));
            zz = 0 + (((tickAnim - 9) / 3) * (0.1733-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 14) {
            xx = -0.0231 + (((tickAnim - 12) / 2) * (-15.76886-(-0.0231)));
            yy = 17.5014 + (((tickAnim - 12) / 2) * (9.767-(17.5014)));
            zz = 0.1733 + (((tickAnim - 12) / 2) * (29.28473-(0.1733)));
        }
        else if (tickAnim >= 14 && tickAnim < 15) {
            xx = -15.76886 + (((tickAnim - 14) / 1) * (0-(-15.76886)));
            yy = 9.767 + (((tickAnim - 14) / 1) * (-17.5-(9.767)));
            zz = 29.28473 + (((tickAnim - 14) / 1) * (0-(29.28473)));
        }
        else if (tickAnim >= 15 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 15) / 3) * (-0.0231-(0)));
            yy = -17.5 + (((tickAnim - 15) / 3) * (17.5014-(-17.5)));
            zz = 0 + (((tickAnim - 15) / 3) * (0.1733-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 19) {
            xx = -0.0231 + (((tickAnim - 18) / 1) * (-7.9-(-0.0231)));
            yy = 17.5014 + (((tickAnim - 18) / 1) * (13.63-(17.5014)));
            zz = 0.1733 + (((tickAnim - 18) / 1) * (14.73-(0.1733)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg2, rightLeg2.rotateAngleX + (float) Math.toRadians(xx), rightLeg2.rotateAngleY + (float) Math.toRadians(yy), rightLeg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = -0.01 + (((tickAnim - 0) / 2) * (-0.01771-(-0.01)));
            yy = 3 + (((tickAnim - 0) / 2) * (-12.50154-(3)));
            zz = -0.09 + (((tickAnim - 0) / 2) * (-0.16446-(-0.09)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = -0.01771 + (((tickAnim - 2) / 1) * (-7.40148-(-0.01771)));
            yy = -12.50154 + (((tickAnim - 2) / 1) * (-2.72421-(-12.50154)));
            zz = -0.16446 + (((tickAnim - 2) / 1) * (-23.62591-(-0.16446)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = -7.40148 + (((tickAnim - 3) / 2) * (0.00017-(-7.40148)));
            yy = -2.72421 + (((tickAnim - 3) / 2) * (18.50005-(-2.72421)));
            zz = -23.62591 + (((tickAnim - 3) / 2) * (-0.01264-(-23.62591)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 0.00017 + (((tickAnim - 5) / 3) * (-0.01771-(0.00017)));
            yy = 18.50005 + (((tickAnim - 5) / 3) * (-12.50154-(18.50005)));
            zz = -0.01264 + (((tickAnim - 5) / 3) * (-0.16446-(-0.01264)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = -0.01771 + (((tickAnim - 8) / 2) * (-7.40148-(-0.01771)));
            yy = -12.50154 + (((tickAnim - 8) / 2) * (-2.72421-(-12.50154)));
            zz = -0.16446 + (((tickAnim - 8) / 2) * (-23.62591-(-0.16446)));
        }
        else if (tickAnim >= 10 && tickAnim < 11) {
            xx = -7.40148 + (((tickAnim - 10) / 1) * (0.00017-(-7.40148)));
            yy = -2.72421 + (((tickAnim - 10) / 1) * (18.50005-(-2.72421)));
            zz = -23.62591 + (((tickAnim - 10) / 1) * (-0.01264-(-23.62591)));
        }
        else if (tickAnim >= 11 && tickAnim < 14) {
            xx = 0.00017 + (((tickAnim - 11) / 3) * (-0.01771-(0.00017)));
            yy = 18.50005 + (((tickAnim - 11) / 3) * (-12.50154-(18.50005)));
            zz = -0.01264 + (((tickAnim - 11) / 3) * (-0.16446-(-0.01264)));
        }
        else if (tickAnim >= 14 && tickAnim < 16) {
            xx = -0.01771 + (((tickAnim - 14) / 2) * (-7.40148-(-0.01771)));
            yy = -12.50154 + (((tickAnim - 14) / 2) * (-2.72421-(-12.50154)));
            zz = -0.16446 + (((tickAnim - 14) / 2) * (-23.62591-(-0.16446)));
        }
        else if (tickAnim >= 16 && tickAnim < 18) {
            xx = -7.40148 + (((tickAnim - 16) / 2) * (0.00017-(-7.40148)));
            yy = -2.72421 + (((tickAnim - 16) / 2) * (18.50005-(-2.72421)));
            zz = -23.62591 + (((tickAnim - 16) / 2) * (-0.01264-(-23.62591)));
        }
        else if (tickAnim >= 18 && tickAnim < 19) {
            xx = 0.00017 + (((tickAnim - 18) / 1) * (-0.01-(0.00017)));
            yy = 18.50005 + (((tickAnim - 18) / 1) * (3-(18.50005)));
            zz = -0.01264 + (((tickAnim - 18) / 1) * (-0.09-(-0.01264)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg3, leftLeg3.rotateAngleX + (float) Math.toRadians(xx), leftLeg3.rotateAngleY + (float) Math.toRadians(yy), leftLeg3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = -7.40148 + (((tickAnim - 0) / 2) * (0.00017-(-7.40148)));
            yy = 2.72421 + (((tickAnim - 0) / 2) * (-18.50005-(2.72421)));
            zz = 23.62591 + (((tickAnim - 0) / 2) * (0.01264-(23.62591)));
        }
        else if (tickAnim >= 2 && tickAnim < 5) {
            xx = 0.00017 + (((tickAnim - 2) / 3) * (-0.01771-(0.00017)));
            yy = -18.50005 + (((tickAnim - 2) / 3) * (12.50154-(-18.50005)));
            zz = 0.01264 + (((tickAnim - 2) / 3) * (0.16446-(0.01264)));
        }
        else if (tickAnim >= 5 && tickAnim < 6) {
            xx = -0.01771 + (((tickAnim - 5) / 1) * (-7.40148-(-0.01771)));
            yy = 12.50154 + (((tickAnim - 5) / 1) * (2.72421-(12.50154)));
            zz = 0.16446 + (((tickAnim - 5) / 1) * (23.62591-(0.16446)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = -7.40148 + (((tickAnim - 6) / 2) * (0.00017-(-7.40148)));
            yy = 2.72421 + (((tickAnim - 6) / 2) * (-18.50005-(2.72421)));
            zz = 23.62591 + (((tickAnim - 6) / 2) * (0.01264-(23.62591)));
        }
        else if (tickAnim >= 8 && tickAnim < 11) {
            xx = 0.00017 + (((tickAnim - 8) / 3) * (-0.01771-(0.00017)));
            yy = -18.50005 + (((tickAnim - 8) / 3) * (12.50154-(-18.50005)));
            zz = 0.01264 + (((tickAnim - 8) / 3) * (0.16446-(0.01264)));
        }
        else if (tickAnim >= 11 && tickAnim < 13) {
            xx = -0.01771 + (((tickAnim - 11) / 2) * (-7.40148-(-0.01771)));
            yy = 12.50154 + (((tickAnim - 11) / 2) * (2.72421-(12.50154)));
            zz = 0.16446 + (((tickAnim - 11) / 2) * (23.62591-(0.16446)));
        }
        else if (tickAnim >= 13 && tickAnim < 14) {
            xx = -7.40148 + (((tickAnim - 13) / 1) * (0.00017-(-7.40148)));
            yy = 2.72421 + (((tickAnim - 13) / 1) * (-18.50005-(2.72421)));
            zz = 23.62591 + (((tickAnim - 13) / 1) * (0.01264-(23.62591)));
        }
        else if (tickAnim >= 14 && tickAnim < 18) {
            xx = 0.00017 + (((tickAnim - 14) / 4) * (-0.01771-(0.00017)));
            yy = -18.50005 + (((tickAnim - 14) / 4) * (12.50154-(-18.50005)));
            zz = 0.01264 + (((tickAnim - 14) / 4) * (0.16446-(0.01264)));
        }
        else if (tickAnim >= 18 && tickAnim < 19) {
            xx = -0.01771 + (((tickAnim - 18) / 1) * (-7.40148-(-0.01771)));
            yy = 12.50154 + (((tickAnim - 18) / 1) * (2.72421-(12.50154)));
            zz = 0.16446 + (((tickAnim - 18) / 1) * (23.62591-(0.16446)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg3, rightLeg3.rotateAngleX + (float) Math.toRadians(xx), rightLeg3.rotateAngleY + (float) Math.toRadians(yy), rightLeg3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 1) {
            xx = 0 + (((tickAnim - 0) / 1) * (-0.00097-(0)));
            yy = -2.5 + (((tickAnim - 0) / 1) * (-10.00029-(-2.5)));
            zz = -0.03 + (((tickAnim - 0) / 1) * (-0.03779-(-0.03)));
        }
        else if (tickAnim >= 1 && tickAnim < 2) {
            xx = -0.00097 + (((tickAnim - 1) / 1) * (2.29562-(-0.00097)));
            yy = -10.00029 + (((tickAnim - 1) / 1) * (3.34466-(-10.00029)));
            zz = -0.03779 + (((tickAnim - 1) / 1) * (-18.23352-(-0.03779)));
        }
        else if (tickAnim >= 2 && tickAnim < 4) {
            xx = 2.29562 + (((tickAnim - 2) / 2) * (0-(2.29562)));
            yy = 3.34466 + (((tickAnim - 2) / 2) * (20-(3.34466)));
            zz = -18.23352 + (((tickAnim - 2) / 2) * (0-(-18.23352)));
        }
        else if (tickAnim >= 4 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 4) / 3) * (-0.00097-(0)));
            yy = 20 + (((tickAnim - 4) / 3) * (-10.00029-(20)));
            zz = 0 + (((tickAnim - 4) / 3) * (-0.03779-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 9) {
            xx = -0.00097 + (((tickAnim - 7) / 2) * (2.29562-(-0.00097)));
            yy = -10.00029 + (((tickAnim - 7) / 2) * (3.34466-(-10.00029)));
            zz = -0.03779 + (((tickAnim - 7) / 2) * (-18.23352-(-0.03779)));
        }
        else if (tickAnim >= 9 && tickAnim < 10) {
            xx = 2.29562 + (((tickAnim - 9) / 1) * (0-(2.29562)));
            yy = 3.34466 + (((tickAnim - 9) / 1) * (20-(3.34466)));
            zz = -18.23352 + (((tickAnim - 9) / 1) * (0-(-18.23352)));
        }
        else if (tickAnim >= 10 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 10) / 4) * (-0.00097-(0)));
            yy = 20 + (((tickAnim - 10) / 4) * (-10.00029-(20)));
            zz = 0 + (((tickAnim - 10) / 4) * (-0.03779-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 15) {
            xx = -0.00097 + (((tickAnim - 14) / 1) * (2.29562-(-0.00097)));
            yy = -10.00029 + (((tickAnim - 14) / 1) * (3.34466-(-10.00029)));
            zz = -0.03779 + (((tickAnim - 14) / 1) * (-18.23352-(-0.03779)));
        }
        else if (tickAnim >= 15 && tickAnim < 17) {
            xx = 2.29562 + (((tickAnim - 15) / 2) * (0-(2.29562)));
            yy = 3.34466 + (((tickAnim - 15) / 2) * (20-(3.34466)));
            zz = -18.23352 + (((tickAnim - 15) / 2) * (0-(-18.23352)));
        }
        else if (tickAnim >= 17 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 17) / 2) * (0-(0)));
            yy = 20 + (((tickAnim - 17) / 2) * (-2.5-(20)));
            zz = 0 + (((tickAnim - 17) / 2) * (-0.03-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg4, leftLeg4.rotateAngleX + (float) Math.toRadians(xx), leftLeg4.rotateAngleY + (float) Math.toRadians(yy), leftLeg4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 1) {
            xx = 1.15 + (((tickAnim - 0) / 1) * (0-(1.15)));
            yy = -11.67 + (((tickAnim - 0) / 1) * (-20-(-11.67)));
            zz = 9.12 + (((tickAnim - 0) / 1) * (0-(9.12)));
        }
        else if (tickAnim >= 1 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 1) / 3) * (-0.00097-(0)));
            yy = -20 + (((tickAnim - 1) / 3) * (10.00029-(-20)));
            zz = 0 + (((tickAnim - 1) / 3) * (0.03779-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 6) {
            xx = -0.00097 + (((tickAnim - 4) / 2) * (2.29562-(-0.00097)));
            yy = 10.00029 + (((tickAnim - 4) / 2) * (-3.34466-(10.00029)));
            zz = 0.03779 + (((tickAnim - 4) / 2) * (18.23352-(0.03779)));
        }
        else if (tickAnim >= 6 && tickAnim < 7) {
            xx = 2.29562 + (((tickAnim - 6) / 1) * (0-(2.29562)));
            yy = -3.34466 + (((tickAnim - 6) / 1) * (-20-(-3.34466)));
            zz = 18.23352 + (((tickAnim - 6) / 1) * (0-(18.23352)));
        }
        else if (tickAnim >= 7 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 7) / 3) * (-0.00097-(0)));
            yy = -20 + (((tickAnim - 7) / 3) * (10.00029-(-20)));
            zz = 0 + (((tickAnim - 7) / 3) * (0.03779-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 12) {
            xx = -0.00097 + (((tickAnim - 10) / 2) * (2.29562-(-0.00097)));
            yy = 10.00029 + (((tickAnim - 10) / 2) * (-3.34466-(10.00029)));
            zz = 0.03779 + (((tickAnim - 10) / 2) * (18.23352-(0.03779)));
        }
        else if (tickAnim >= 12 && tickAnim < 14) {
            xx = 2.29562 + (((tickAnim - 12) / 2) * (0-(2.29562)));
            yy = -3.34466 + (((tickAnim - 12) / 2) * (-20-(-3.34466)));
            zz = 18.23352 + (((tickAnim - 12) / 2) * (0-(18.23352)));
        }
        else if (tickAnim >= 14 && tickAnim < 17) {
            xx = 0 + (((tickAnim - 14) / 3) * (-0.00097-(0)));
            yy = -20 + (((tickAnim - 14) / 3) * (10.00029-(-20)));
            zz = 0 + (((tickAnim - 14) / 3) * (0.03779-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 18) {
            xx = -0.00097 + (((tickAnim - 17) / 1) * (2.29562-(-0.00097)));
            yy = 10.00029 + (((tickAnim - 17) / 1) * (-3.34466-(10.00029)));
            zz = 0.03779 + (((tickAnim - 17) / 1) * (18.23352-(0.03779)));
        }
        else if (tickAnim >= 18 && tickAnim < 19) {
            xx = 2.29562 + (((tickAnim - 18) / 1) * (1.15-(2.29562)));
            yy = -3.34466 + (((tickAnim - 18) / 1) * (-11.67-(-3.34466)));
            zz = 18.23352 + (((tickAnim - 18) / 1) * (9.12-(18.23352)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg4, rightLeg4.rotateAngleX + (float) Math.toRadians(xx), rightLeg4.rotateAngleY + (float) Math.toRadians(yy), rightLeg4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = -0.00059 + (((tickAnim - 0) / 2) * (-1.15091-(-0.00059)));
            yy = -10.0001 + (((tickAnim - 0) / 2) * (3.67456-(-10.0001)));
            zz = -0.02232 + (((tickAnim - 0) / 2) * (-7.58729-(-0.02232)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = -1.15091 + (((tickAnim - 2) / 1) * (-0.00414-(-1.15091)));
            yy = 3.67456 + (((tickAnim - 2) / 1) * (12.50026-(3.67456)));
            zz = -7.58729 + (((tickAnim - 2) / 1) * (0.06287-(-7.58729)));
        }
        else if (tickAnim >= 3 && tickAnim < 6) {
            xx = -0.00414 + (((tickAnim - 3) / 3) * (-0.00059-(-0.00414)));
            yy = 12.50026 + (((tickAnim - 3) / 3) * (-10.0001-(12.50026)));
            zz = 0.06287 + (((tickAnim - 3) / 3) * (-0.02232-(0.06287)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = -0.00059 + (((tickAnim - 6) / 2) * (-1.15091-(-0.00059)));
            yy = -10.0001 + (((tickAnim - 6) / 2) * (3.67456-(-10.0001)));
            zz = -0.02232 + (((tickAnim - 6) / 2) * (-7.58729-(-0.02232)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = -1.15091 + (((tickAnim - 8) / 2) * (-0.00414-(-1.15091)));
            yy = 3.67456 + (((tickAnim - 8) / 2) * (12.50026-(3.67456)));
            zz = -7.58729 + (((tickAnim - 8) / 2) * (0.06287-(-7.58729)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = -0.00414 + (((tickAnim - 10) / 3) * (-0.00059-(-0.00414)));
            yy = 12.50026 + (((tickAnim - 10) / 3) * (-10.0001-(12.50026)));
            zz = 0.06287 + (((tickAnim - 10) / 3) * (-0.02232-(0.06287)));
        }
        else if (tickAnim >= 13 && tickAnim < 14) {
            xx = -0.00059 + (((tickAnim - 13) / 1) * (-1.15091-(-0.00059)));
            yy = -10.0001 + (((tickAnim - 13) / 1) * (3.67456-(-10.0001)));
            zz = -0.02232 + (((tickAnim - 13) / 1) * (-7.58729-(-0.02232)));
        }
        else if (tickAnim >= 14 && tickAnim < 16) {
            xx = -1.15091 + (((tickAnim - 14) / 2) * (-0.00414-(-1.15091)));
            yy = 3.67456 + (((tickAnim - 14) / 2) * (12.50026-(3.67456)));
            zz = -7.58729 + (((tickAnim - 14) / 2) * (0.06287-(-7.58729)));
        }
        else if (tickAnim >= 16 && tickAnim < 19) {
            xx = -0.00414 + (((tickAnim - 16) / 3) * (-0.00059-(-0.00414)));
            yy = 12.50026 + (((tickAnim - 16) / 3) * (-10.0001-(12.50026)));
            zz = 0.06287 + (((tickAnim - 16) / 3) * (-0.02232-(0.06287)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg5, leftLeg5.rotateAngleX + (float) Math.toRadians(xx), leftLeg5.rotateAngleY + (float) Math.toRadians(yy), leftLeg5.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = -0.00414 + (((tickAnim - 0) / 3) * (-0.00059-(-0.00414)));
            yy = -12.50026 + (((tickAnim - 0) / 3) * (10.0001-(-12.50026)));
            zz = -0.06287 + (((tickAnim - 0) / 3) * (0.02232-(-0.06287)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = -0.00059 + (((tickAnim - 3) / 2) * (-1.15091-(-0.00059)));
            yy = 10.0001 + (((tickAnim - 3) / 2) * (-3.67456-(10.0001)));
            zz = 0.02232 + (((tickAnim - 3) / 2) * (7.58729-(0.02232)));
        }
        else if (tickAnim >= 5 && tickAnim < 6) {
            xx = -1.15091 + (((tickAnim - 5) / 1) * (-0.00414-(-1.15091)));
            yy = -3.67456 + (((tickAnim - 5) / 1) * (-12.50026-(-3.67456)));
            zz = 7.58729 + (((tickAnim - 5) / 1) * (-0.06287-(7.58729)));
        }
        else if (tickAnim >= 6 && tickAnim < 10) {
            xx = -0.00414 + (((tickAnim - 6) / 4) * (-0.00059-(-0.00414)));
            yy = -12.50026 + (((tickAnim - 6) / 4) * (10.0001-(-12.50026)));
            zz = -0.06287 + (((tickAnim - 6) / 4) * (0.02232-(-0.06287)));
        }
        else if (tickAnim >= 10 && tickAnim < 11) {
            xx = -0.00059 + (((tickAnim - 10) / 1) * (-1.15091-(-0.00059)));
            yy = 10.0001 + (((tickAnim - 10) / 1) * (-3.67456-(10.0001)));
            zz = 0.02232 + (((tickAnim - 10) / 1) * (7.58729-(0.02232)));
        }
        else if (tickAnim >= 11 && tickAnim < 13) {
            xx = -1.15091 + (((tickAnim - 11) / 2) * (-0.00414-(-1.15091)));
            yy = -3.67456 + (((tickAnim - 11) / 2) * (-12.50026-(-3.67456)));
            zz = 7.58729 + (((tickAnim - 11) / 2) * (-0.06287-(7.58729)));
        }
        else if (tickAnim >= 13 && tickAnim < 16) {
            xx = -0.00414 + (((tickAnim - 13) / 3) * (-0.00059-(-0.00414)));
            yy = -12.50026 + (((tickAnim - 13) / 3) * (10.0001-(-12.50026)));
            zz = -0.06287 + (((tickAnim - 13) / 3) * (0.02232-(-0.06287)));
        }
        else if (tickAnim >= 16 && tickAnim < 18) {
            xx = -0.00059 + (((tickAnim - 16) / 2) * (-1.15091-(-0.00059)));
            yy = 10.0001 + (((tickAnim - 16) / 2) * (-3.67456-(10.0001)));
            zz = 0.02232 + (((tickAnim - 16) / 2) * (7.58729-(0.02232)));
        }
        else if (tickAnim >= 18 && tickAnim < 19) {
            xx = -1.15091 + (((tickAnim - 18) / 1) * (-0.00414-(-1.15091)));
            yy = -3.67456 + (((tickAnim - 18) / 1) * (-12.50026-(-3.67456)));
            zz = 7.58729 + (((tickAnim - 18) / 1) * (-0.06287-(7.58729)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg5, rightLeg5.rotateAngleX + (float) Math.toRadians(xx), rightLeg5.rotateAngleY + (float) Math.toRadians(yy), rightLeg5.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 1) {
            xx = -0.14 + (((tickAnim - 0) / 1) * (-0.27059-(-0.14)));
            yy = -3.14 + (((tickAnim - 0) / 1) * (3.72037-(-3.14)));
            zz = -6.25 + (((tickAnim - 0) / 1) * (-12.50288-(-6.25)));
        }
        else if (tickAnim >= 1 && tickAnim < 2) {
            xx = -0.27059 + (((tickAnim - 1) / 1) * (-0.00332-(-0.27059)));
            yy = 3.72037 + (((tickAnim - 1) / 1) * (15.00055-(3.72037)));
            zz = -12.50288 + (((tickAnim - 1) / 1) * (0.07501-(-12.50288)));
        }
        else if (tickAnim >= 2 && tickAnim < 6) {
            xx = -0.00332 + (((tickAnim - 2) / 4) * (-0.00003-(-0.00332)));
            yy = 15.00055 + (((tickAnim - 2) / 4) * (-10-(15.00055)));
            zz = 0.07501 + (((tickAnim - 2) / 4) * (-0.0009-(0.07501)));
        }
        else if (tickAnim >= 6 && tickAnim < 7) {
            xx = -0.00003 + (((tickAnim - 6) / 1) * (-0.27059-(-0.00003)));
            yy = -10 + (((tickAnim - 6) / 1) * (3.72037-(-10)));
            zz = -0.0009 + (((tickAnim - 6) / 1) * (-12.50288-(-0.0009)));
        }
        else if (tickAnim >= 7 && tickAnim < 9) {
            xx = -0.27059 + (((tickAnim - 7) / 2) * (-0.00332-(-0.27059)));
            yy = 3.72037 + (((tickAnim - 7) / 2) * (15.00055-(3.72037)));
            zz = -12.50288 + (((tickAnim - 7) / 2) * (0.07501-(-12.50288)));
        }
        else if (tickAnim >= 9 && tickAnim < 12) {
            xx = -0.00332 + (((tickAnim - 9) / 3) * (-0.00003-(-0.00332)));
            yy = 15.00055 + (((tickAnim - 9) / 3) * (-10-(15.00055)));
            zz = 0.07501 + (((tickAnim - 9) / 3) * (-0.0009-(0.07501)));
        }
        else if (tickAnim >= 12 && tickAnim < 14) {
            xx = -0.00003 + (((tickAnim - 12) / 2) * (-0.27059-(-0.00003)));
            yy = -10 + (((tickAnim - 12) / 2) * (3.72037-(-10)));
            zz = -0.0009 + (((tickAnim - 12) / 2) * (-12.50288-(-0.0009)));
        }
        else if (tickAnim >= 14 && tickAnim < 15) {
            xx = -0.27059 + (((tickAnim - 14) / 1) * (-0.00332-(-0.27059)));
            yy = 3.72037 + (((tickAnim - 14) / 1) * (15.00055-(3.72037)));
            zz = -12.50288 + (((tickAnim - 14) / 1) * (0.07501-(-12.50288)));
        }
        else if (tickAnim >= 15 && tickAnim < 18) {
            xx = -0.00332 + (((tickAnim - 15) / 3) * (-0.00003-(-0.00332)));
            yy = 15.00055 + (((tickAnim - 15) / 3) * (-10-(15.00055)));
            zz = 0.07501 + (((tickAnim - 15) / 3) * (-0.0009-(0.07501)));
        }
        else if (tickAnim >= 18 && tickAnim < 19) {
            xx = -0.00003 + (((tickAnim - 18) / 1) * (-0.14-(-0.00003)));
            yy = -10 + (((tickAnim - 18) / 1) * (-3.14-(-10)));
            zz = -0.0009 + (((tickAnim - 18) / 1) * (-6.25-(-0.0009)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg6, leftLeg6.rotateAngleX + (float) Math.toRadians(xx), leftLeg6.rotateAngleY + (float) Math.toRadians(yy), leftLeg6.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 0) / 2) * (-0.00003-(0)));
            yy = -8.75 + (((tickAnim - 0) / 2) * (10-(-8.75)));
            zz = -0.06 + (((tickAnim - 0) / 2) * (0.0009-(-0.06)));
        }
        else if (tickAnim >= 2 && tickAnim < 4) {
            xx = -0.00003 + (((tickAnim - 2) / 2) * (-0.27059-(-0.00003)));
            yy = 10 + (((tickAnim - 2) / 2) * (-3.72037-(10)));
            zz = 0.0009 + (((tickAnim - 2) / 2) * (12.50288-(0.0009)));
        }
        else if (tickAnim >= 4 && tickAnim < 6) {
            xx = -0.27059 + (((tickAnim - 4) / 2) * (-0.00332-(-0.27059)));
            yy = -3.72037 + (((tickAnim - 4) / 2) * (-15.00055-(-3.72037)));
            zz = 12.50288 + (((tickAnim - 4) / 2) * (-0.07501-(12.50288)));
        }
        else if (tickAnim >= 6 && tickAnim < 9) {
            xx = -0.00332 + (((tickAnim - 6) / 3) * (-0.00003-(-0.00332)));
            yy = -15.00055 + (((tickAnim - 6) / 3) * (10-(-15.00055)));
            zz = -0.07501 + (((tickAnim - 6) / 3) * (0.0009-(-0.07501)));
        }
        else if (tickAnim >= 9 && tickAnim < 10) {
            xx = -0.00003 + (((tickAnim - 9) / 1) * (-0.27059-(-0.00003)));
            yy = 10 + (((tickAnim - 9) / 1) * (-3.72037-(10)));
            zz = 0.0009 + (((tickAnim - 9) / 1) * (12.50288-(0.0009)));
        }
        else if (tickAnim >= 10 && tickAnim < 12) {
            xx = -0.27059 + (((tickAnim - 10) / 2) * (-0.00332-(-0.27059)));
            yy = -3.72037 + (((tickAnim - 10) / 2) * (-15.00055-(-3.72037)));
            zz = 12.50288 + (((tickAnim - 10) / 2) * (-0.07501-(12.50288)));
        }
        else if (tickAnim >= 12 && tickAnim < 15) {
            xx = -0.00332 + (((tickAnim - 12) / 3) * (-0.00003-(-0.00332)));
            yy = -15.00055 + (((tickAnim - 12) / 3) * (10-(-15.00055)));
            zz = -0.07501 + (((tickAnim - 12) / 3) * (0.0009-(-0.07501)));
        }
        else if (tickAnim >= 15 && tickAnim < 17) {
            xx = -0.00003 + (((tickAnim - 15) / 2) * (-0.27059-(-0.00003)));
            yy = 10 + (((tickAnim - 15) / 2) * (-3.72037-(10)));
            zz = 0.0009 + (((tickAnim - 15) / 2) * (12.50288-(0.0009)));
        }
        else if (tickAnim >= 17 && tickAnim < 18) {
            xx = -0.27059 + (((tickAnim - 17) / 1) * (-0.00332-(-0.27059)));
            yy = -3.72037 + (((tickAnim - 17) / 1) * (-15.00055-(-3.72037)));
            zz = 12.50288 + (((tickAnim - 17) / 1) * (-0.07501-(12.50288)));
        }
        else if (tickAnim >= 18 && tickAnim < 19) {
            xx = -0.00332 + (((tickAnim - 18) / 1) * (0-(-0.00332)));
            yy = -15.00055 + (((tickAnim - 18) / 1) * (-8.75-(-15.00055)));
            zz = -0.07501 + (((tickAnim - 18) / 1) * (-0.06-(-0.07501)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg6, rightLeg6.rotateAngleX + (float) Math.toRadians(xx), rightLeg6.rotateAngleY + (float) Math.toRadians(yy), rightLeg6.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 1.50701 + (((tickAnim - 0) / 2) * (-0.0039-(1.50701)));
            yy = 2.73196 + (((tickAnim - 0) / 2) * (15.00076-(2.73196)));
            zz = -17.56274 + (((tickAnim - 0) / 2) * (0.08797-(-17.56274)));
        }
        else if (tickAnim >= 2 && tickAnim < 5) {
            xx = -0.0039 + (((tickAnim - 2) / 3) * (0.0006-(-0.0039)));
            yy = 15.00076 + (((tickAnim - 2) / 3) * (-12.50009-(15.00076)));
            zz = 0.08797 + (((tickAnim - 2) / 3) * (0.02068-(0.08797)));
        }
        else if (tickAnim >= 5 && tickAnim < 6) {
            xx = 0.0006 + (((tickAnim - 5) / 1) * (1.50701-(0.0006)));
            yy = -12.50009 + (((tickAnim - 5) / 1) * (2.73196-(-12.50009)));
            zz = 0.02068 + (((tickAnim - 5) / 1) * (-17.56274-(0.02068)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = 1.50701 + (((tickAnim - 6) / 2) * (-0.0039-(1.50701)));
            yy = 2.73196 + (((tickAnim - 6) / 2) * (15.00076-(2.73196)));
            zz = -17.56274 + (((tickAnim - 6) / 2) * (0.08797-(-17.56274)));
        }
        else if (tickAnim >= 8 && tickAnim < 11) {
            xx = -0.0039 + (((tickAnim - 8) / 3) * (0.0006-(-0.0039)));
            yy = 15.00076 + (((tickAnim - 8) / 3) * (-12.50009-(15.00076)));
            zz = 0.08797 + (((tickAnim - 8) / 3) * (0.02068-(0.08797)));
        }
        else if (tickAnim >= 11 && tickAnim < 13) {
            xx = 0.0006 + (((tickAnim - 11) / 2) * (1.50701-(0.0006)));
            yy = -12.50009 + (((tickAnim - 11) / 2) * (2.73196-(-12.50009)));
            zz = 0.02068 + (((tickAnim - 11) / 2) * (-17.56274-(0.02068)));
        }
        else if (tickAnim >= 13 && tickAnim < 14) {
            xx = 1.50701 + (((tickAnim - 13) / 1) * (-0.0039-(1.50701)));
            yy = 2.73196 + (((tickAnim - 13) / 1) * (15.00076-(2.73196)));
            zz = -17.56274 + (((tickAnim - 13) / 1) * (0.08797-(-17.56274)));
        }
        else if (tickAnim >= 14 && tickAnim < 18) {
            xx = -0.0039 + (((tickAnim - 14) / 4) * (0.0006-(-0.0039)));
            yy = 15.00076 + (((tickAnim - 14) / 4) * (-12.50009-(15.00076)));
            zz = 0.08797 + (((tickAnim - 14) / 4) * (0.02068-(0.08797)));
        }
        else if (tickAnim >= 18 && tickAnim < 19) {
            xx = 0.0006 + (((tickAnim - 18) / 1) * (1.50701-(0.0006)));
            yy = -12.50009 + (((tickAnim - 18) / 1) * (2.73196-(-12.50009)));
            zz = 0.02068 + (((tickAnim - 18) / 1) * (-17.56274-(0.02068)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg7, leftLeg7.rotateAngleX + (float) Math.toRadians(xx), leftLeg7.rotateAngleY + (float) Math.toRadians(yy), leftLeg7.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 0) / 2) * (0.0006-(0)));
            yy = -1.25 + (((tickAnim - 0) / 2) * (12.50009-(-1.25)));
            zz = -0.05 + (((tickAnim - 0) / 2) * (-0.02068-(-0.05)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = 0.0006 + (((tickAnim - 2) / 1) * (1.50701-(0.0006)));
            yy = 12.50009 + (((tickAnim - 2) / 1) * (-2.73196-(12.50009)));
            zz = -0.02068 + (((tickAnim - 2) / 1) * (17.56274-(-0.02068)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 1.50701 + (((tickAnim - 3) / 2) * (-0.0039-(1.50701)));
            yy = -2.73196 + (((tickAnim - 3) / 2) * (-15.00076-(-2.73196)));
            zz = 17.56274 + (((tickAnim - 3) / 2) * (-0.08797-(17.56274)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = -0.0039 + (((tickAnim - 5) / 3) * (0.0006-(-0.0039)));
            yy = -15.00076 + (((tickAnim - 5) / 3) * (12.50009-(-15.00076)));
            zz = -0.08797 + (((tickAnim - 5) / 3) * (-0.02068-(-0.08797)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 0.0006 + (((tickAnim - 8) / 2) * (1.50701-(0.0006)));
            yy = 12.50009 + (((tickAnim - 8) / 2) * (-2.73196-(12.50009)));
            zz = -0.02068 + (((tickAnim - 8) / 2) * (17.56274-(-0.02068)));
        }
        else if (tickAnim >= 10 && tickAnim < 11) {
            xx = 1.50701 + (((tickAnim - 10) / 1) * (-0.0039-(1.50701)));
            yy = -2.73196 + (((tickAnim - 10) / 1) * (-15.00076-(-2.73196)));
            zz = 17.56274 + (((tickAnim - 10) / 1) * (-0.08797-(17.56274)));
        }
        else if (tickAnim >= 11 && tickAnim < 14) {
            xx = -0.0039 + (((tickAnim - 11) / 3) * (0.0006-(-0.0039)));
            yy = -15.00076 + (((tickAnim - 11) / 3) * (12.50009-(-15.00076)));
            zz = -0.08797 + (((tickAnim - 11) / 3) * (-0.02068-(-0.08797)));
        }
        else if (tickAnim >= 14 && tickAnim < 16) {
            xx = 0.0006 + (((tickAnim - 14) / 2) * (1.50701-(0.0006)));
            yy = 12.50009 + (((tickAnim - 14) / 2) * (-2.73196-(12.50009)));
            zz = -0.02068 + (((tickAnim - 14) / 2) * (17.56274-(-0.02068)));
        }
        else if (tickAnim >= 16 && tickAnim < 18) {
            xx = 1.50701 + (((tickAnim - 16) / 2) * (-0.0039-(1.50701)));
            yy = -2.73196 + (((tickAnim - 16) / 2) * (-15.00076-(-2.73196)));
            zz = 17.56274 + (((tickAnim - 16) / 2) * (-0.08797-(17.56274)));
        }
        else if (tickAnim >= 18 && tickAnim < 19) {
            xx = -0.0039 + (((tickAnim - 18) / 1) * (0-(-0.0039)));
            yy = -15.00076 + (((tickAnim - 18) / 1) * (-1.25-(-15.00076)));
            zz = -0.08797 + (((tickAnim - 18) / 1) * (-0.05-(-0.08797)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg7, rightLeg7.rotateAngleX + (float) Math.toRadians(xx), rightLeg7.rotateAngleY + (float) Math.toRadians(yy), rightLeg7.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 1) {
            xx = 1.32 + (((tickAnim - 0) / 1) * (-0.00347-(1.32)));
            yy = 9.58 + (((tickAnim - 0) / 1) * (15.00059-(9.58)));
            zz = -8.81 + (((tickAnim - 0) / 1) * (0.07742-(-8.81)));
        }
        else if (tickAnim >= 1 && tickAnim < 4) {
            xx = -0.00347 + (((tickAnim - 1) / 3) * (0-(-0.00347)));
            yy = 15.00059 + (((tickAnim - 1) / 3) * (-12.5-(15.00059)));
            zz = 0.07742 + (((tickAnim - 1) / 3) * (0-(0.07742)));
        }
        else if (tickAnim >= 4 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 4) / 2) * (2.64993-(0)));
            yy = -12.5 + (((tickAnim - 4) / 2) * (4.15793-(-12.5)));
            zz = 0 + (((tickAnim - 4) / 2) * (-17.69329-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 7) {
            xx = 2.64993 + (((tickAnim - 6) / 1) * (-0.00347-(2.64993)));
            yy = 4.15793 + (((tickAnim - 6) / 1) * (15.00059-(4.15793)));
            zz = -17.69329 + (((tickAnim - 6) / 1) * (0.07742-(-17.69329)));
        }
        else if (tickAnim >= 7 && tickAnim < 10) {
            xx = -0.00347 + (((tickAnim - 7) / 3) * (0-(-0.00347)));
            yy = 15.00059 + (((tickAnim - 7) / 3) * (-12.5-(15.00059)));
            zz = 0.07742 + (((tickAnim - 7) / 3) * (0-(0.07742)));
        }
        else if (tickAnim >= 10 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 10) / 2) * (2.64993-(0)));
            yy = -12.5 + (((tickAnim - 10) / 2) * (4.15793-(-12.5)));
            zz = 0 + (((tickAnim - 10) / 2) * (-17.69329-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 14) {
            xx = 2.64993 + (((tickAnim - 12) / 2) * (-0.00347-(2.64993)));
            yy = 4.15793 + (((tickAnim - 12) / 2) * (15.00059-(4.15793)));
            zz = -17.69329 + (((tickAnim - 12) / 2) * (0.07742-(-17.69329)));
        }
        else if (tickAnim >= 14 && tickAnim < 17) {
            xx = -0.00347 + (((tickAnim - 14) / 3) * (0-(-0.00347)));
            yy = 15.00059 + (((tickAnim - 14) / 3) * (-12.5-(15.00059)));
            zz = 0.07742 + (((tickAnim - 14) / 3) * (0-(0.07742)));
        }
        else if (tickAnim >= 17 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 17) / 1) * (2.64993-(0)));
            yy = -12.5 + (((tickAnim - 17) / 1) * (4.15793-(-12.5)));
            zz = 0 + (((tickAnim - 17) / 1) * (-17.69329-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 19) {
            xx = 2.64993 + (((tickAnim - 18) / 1) * (1.32-(2.64993)));
            yy = 4.15793 + (((tickAnim - 18) / 1) * (9.58-(4.15793)));
            zz = -17.69329 + (((tickAnim - 18) / 1) * (-8.81-(-17.69329)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg8, leftLeg8.rotateAngleX + (float) Math.toRadians(xx), leftLeg8.rotateAngleY + (float) Math.toRadians(yy), leftLeg8.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 1) {
            xx = 0 + (((tickAnim - 0) / 1) * (0-(0)));
            yy = 5.62 + (((tickAnim - 0) / 1) * (12.5-(5.62)));
            zz = -0.02 + (((tickAnim - 0) / 1) * (0-(-0.02)));
        }
        else if (tickAnim >= 1 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 1) / 1) * (2.64993-(0)));
            yy = 12.5 + (((tickAnim - 1) / 1) * (-4.15793-(12.5)));
            zz = 0 + (((tickAnim - 1) / 1) * (17.69329-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 4) {
            xx = 2.64993 + (((tickAnim - 2) / 2) * (-0.00347-(2.64993)));
            yy = -4.15793 + (((tickAnim - 2) / 2) * (-15.00059-(-4.15793)));
            zz = 17.69329 + (((tickAnim - 2) / 2) * (-0.07742-(17.69329)));
        }
        else if (tickAnim >= 4 && tickAnim < 7) {
            xx = -0.00347 + (((tickAnim - 4) / 3) * (0-(-0.00347)));
            yy = -15.00059 + (((tickAnim - 4) / 3) * (12.5-(-15.00059)));
            zz = -0.07742 + (((tickAnim - 4) / 3) * (0-(-0.07742)));
        }
        else if (tickAnim >= 7 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 7) / 2) * (2.64993-(0)));
            yy = 12.5 + (((tickAnim - 7) / 2) * (-4.15793-(12.5)));
            zz = 0 + (((tickAnim - 7) / 2) * (17.69329-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 10) {
            xx = 2.64993 + (((tickAnim - 9) / 1) * (-0.00347-(2.64993)));
            yy = -4.15793 + (((tickAnim - 9) / 1) * (-15.00059-(-4.15793)));
            zz = 17.69329 + (((tickAnim - 9) / 1) * (-0.07742-(17.69329)));
        }
        else if (tickAnim >= 10 && tickAnim < 14) {
            xx = -0.00347 + (((tickAnim - 10) / 4) * (0-(-0.00347)));
            yy = -15.00059 + (((tickAnim - 10) / 4) * (12.5-(-15.00059)));
            zz = -0.07742 + (((tickAnim - 10) / 4) * (0-(-0.07742)));
        }
        else if (tickAnim >= 14 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 14) / 1) * (2.64993-(0)));
            yy = 12.5 + (((tickAnim - 14) / 1) * (-4.15793-(12.5)));
            zz = 0 + (((tickAnim - 14) / 1) * (17.69329-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 17) {
            xx = 2.64993 + (((tickAnim - 15) / 2) * (-0.00347-(2.64993)));
            yy = -4.15793 + (((tickAnim - 15) / 2) * (-15.00059-(-4.15793)));
            zz = 17.69329 + (((tickAnim - 15) / 2) * (-0.07742-(17.69329)));
        }
        else if (tickAnim >= 17 && tickAnim < 19) {
            xx = -0.00347 + (((tickAnim - 17) / 2) * (0-(-0.00347)));
            yy = -15.00059 + (((tickAnim - 17) / 2) * (5.62-(-15.00059)));
            zz = -0.07742 + (((tickAnim - 17) / 2) * (-0.02-(-0.07742)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg8, rightLeg8.rotateAngleX + (float) Math.toRadians(xx), rightLeg8.rotateAngleY + (float) Math.toRadians(yy), rightLeg8.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = -0.00051 + (((tickAnim - 0) / 3) * (0.00131-(-0.00051)));
            yy = 17.5001 + (((tickAnim - 0) / 3) * (-10.00038-(17.5001)));
            zz = 0.02279 + (((tickAnim - 0) / 3) * (0.04271-(0.02279)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 0.00131 + (((tickAnim - 3) / 2) * (8.08157-(0.00131)));
            yy = -10.00038 + (((tickAnim - 3) / 2) * (-5.1843-(-10.00038)));
            zz = 0.04271 + (((tickAnim - 3) / 2) * (-16.99444-(0.04271)));
        }
        else if (tickAnim >= 5 && tickAnim < 6) {
            xx = 8.08157 + (((tickAnim - 5) / 1) * (-0.00051-(8.08157)));
            yy = -5.1843 + (((tickAnim - 5) / 1) * (17.5001-(-5.1843)));
            zz = -16.99444 + (((tickAnim - 5) / 1) * (0.02279-(-16.99444)));
        }
        else if (tickAnim >= 6 && tickAnim < 10) {
            xx = -0.00051 + (((tickAnim - 6) / 4) * (0.00131-(-0.00051)));
            yy = 17.5001 + (((tickAnim - 6) / 4) * (-10.00038-(17.5001)));
            zz = 0.02279 + (((tickAnim - 6) / 4) * (0.04271-(0.02279)));
        }
        else if (tickAnim >= 10 && tickAnim < 11) {
            xx = 0.00131 + (((tickAnim - 10) / 1) * (8.08157-(0.00131)));
            yy = -10.00038 + (((tickAnim - 10) / 1) * (-5.1843-(-10.00038)));
            zz = 0.04271 + (((tickAnim - 10) / 1) * (-16.99444-(0.04271)));
        }
        else if (tickAnim >= 11 && tickAnim < 13) {
            xx = 8.08157 + (((tickAnim - 11) / 2) * (-0.00051-(8.08157)));
            yy = -5.1843 + (((tickAnim - 11) / 2) * (17.5001-(-5.1843)));
            zz = -16.99444 + (((tickAnim - 11) / 2) * (0.02279-(-16.99444)));
        }
        else if (tickAnim >= 13 && tickAnim < 16) {
            xx = -0.00051 + (((tickAnim - 13) / 3) * (0.00131-(-0.00051)));
            yy = 17.5001 + (((tickAnim - 13) / 3) * (-10.00038-(17.5001)));
            zz = 0.02279 + (((tickAnim - 13) / 3) * (0.04271-(0.02279)));
        }
        else if (tickAnim >= 16 && tickAnim < 18) {
            xx = 0.00131 + (((tickAnim - 16) / 2) * (8.08157-(0.00131)));
            yy = -10.00038 + (((tickAnim - 16) / 2) * (-5.1843-(-10.00038)));
            zz = 0.04271 + (((tickAnim - 16) / 2) * (-16.99444-(0.04271)));
        }
        else if (tickAnim >= 18 && tickAnim < 19) {
            xx = 8.08157 + (((tickAnim - 18) / 1) * (-0.00051-(8.08157)));
            yy = -5.1843 + (((tickAnim - 18) / 1) * (17.5001-(-5.1843)));
            zz = -16.99444 + (((tickAnim - 18) / 1) * (0.02279-(-16.99444)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg9, leftLeg9.rotateAngleX + (float) Math.toRadians(xx), leftLeg9.rotateAngleY + (float) Math.toRadians(yy), leftLeg9.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0.00131 + (((tickAnim - 0) / 2) * (8.08157-(0.00131)));
            yy = 10.00038 + (((tickAnim - 0) / 2) * (5.1843-(10.00038)));
            zz = -0.04271 + (((tickAnim - 0) / 2) * (16.99444-(-0.04271)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = 8.08157 + (((tickAnim - 2) / 1) * (-0.00051-(8.08157)));
            yy = 5.1843 + (((tickAnim - 2) / 1) * (-17.5001-(5.1843)));
            zz = 16.99444 + (((tickAnim - 2) / 1) * (-0.02279-(16.99444)));
        }
        else if (tickAnim >= 3 && tickAnim < 6) {
            xx = -0.00051 + (((tickAnim - 3) / 3) * (0.00131-(-0.00051)));
            yy = -17.5001 + (((tickAnim - 3) / 3) * (10.00038-(-17.5001)));
            zz = -0.02279 + (((tickAnim - 3) / 3) * (-0.04271-(-0.02279)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = 0.00131 + (((tickAnim - 6) / 2) * (8.08157-(0.00131)));
            yy = 10.00038 + (((tickAnim - 6) / 2) * (5.1843-(10.00038)));
            zz = -0.04271 + (((tickAnim - 6) / 2) * (16.99444-(-0.04271)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 8.08157 + (((tickAnim - 8) / 2) * (-0.00051-(8.08157)));
            yy = 5.1843 + (((tickAnim - 8) / 2) * (-17.5001-(5.1843)));
            zz = 16.99444 + (((tickAnim - 8) / 2) * (-0.02279-(16.99444)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = -0.00051 + (((tickAnim - 10) / 3) * (0.00131-(-0.00051)));
            yy = -17.5001 + (((tickAnim - 10) / 3) * (10.00038-(-17.5001)));
            zz = -0.02279 + (((tickAnim - 10) / 3) * (-0.04271-(-0.02279)));
        }
        else if (tickAnim >= 13 && tickAnim < 14) {
            xx = 0.00131 + (((tickAnim - 13) / 1) * (8.08157-(0.00131)));
            yy = 10.00038 + (((tickAnim - 13) / 1) * (5.1843-(10.00038)));
            zz = -0.04271 + (((tickAnim - 13) / 1) * (16.99444-(-0.04271)));
        }
        else if (tickAnim >= 14 && tickAnim < 16) {
            xx = 8.08157 + (((tickAnim - 14) / 2) * (-0.00051-(8.08157)));
            yy = 5.1843 + (((tickAnim - 14) / 2) * (-17.5001-(5.1843)));
            zz = 16.99444 + (((tickAnim - 14) / 2) * (-0.02279-(16.99444)));
        }
        else if (tickAnim >= 16 && tickAnim < 19) {
            xx = -0.00051 + (((tickAnim - 16) / 3) * (0.00131-(-0.00051)));
            yy = -17.5001 + (((tickAnim - 16) / 3) * (10.00038-(-17.5001)));
            zz = -0.02279 + (((tickAnim - 16) / 3) * (-0.04271-(-0.02279)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg9, rightLeg9.rotateAngleX + (float) Math.toRadians(xx), rightLeg9.rotateAngleY + (float) Math.toRadians(yy), rightLeg9.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 0) / 2) * (0.00474-(0)));
            yy = 6.87 + (((tickAnim - 0) / 2) * (-10.00058-(6.87)));
            zz = 0.02 + (((tickAnim - 0) / 2) * (0.07275-(0.02)));
        }
        else if (tickAnim >= 2 && tickAnim < 4) {
            xx = 0.00474 + (((tickAnim - 2) / 2) * (12.99301-(0.00474)));
            yy = -10.00058 + (((tickAnim - 2) / 2) * (-5.49178-(-10.00058)));
            zz = 0.07275 + (((tickAnim - 2) / 2) * (-21.67413-(0.07275)));
        }
        else if (tickAnim >= 4 && tickAnim < 6) {
            xx = 12.99301 + (((tickAnim - 4) / 2) * (-0.00019-(12.99301)));
            yy = -5.49178 + (((tickAnim - 4) / 2) * (12.5-(-5.49178)));
            zz = -21.67413 + (((tickAnim - 4) / 2) * (0.00281-(-21.67413)));
        }
        else if (tickAnim >= 6 && tickAnim < 9) {
            xx = -0.00019 + (((tickAnim - 6) / 3) * (0.00474-(-0.00019)));
            yy = 12.5 + (((tickAnim - 6) / 3) * (-10.00058-(12.5)));
            zz = 0.00281 + (((tickAnim - 6) / 3) * (0.07275-(0.00281)));
        }
        else if (tickAnim >= 9 && tickAnim < 10) {
            xx = 0.00474 + (((tickAnim - 9) / 1) * (12.99301-(0.00474)));
            yy = -10.00058 + (((tickAnim - 9) / 1) * (-5.49178-(-10.00058)));
            zz = 0.07275 + (((tickAnim - 9) / 1) * (-21.67413-(0.07275)));
        }
        else if (tickAnim >= 10 && tickAnim < 12) {
            xx = 12.99301 + (((tickAnim - 10) / 2) * (-0.00019-(12.99301)));
            yy = -5.49178 + (((tickAnim - 10) / 2) * (12.5-(-5.49178)));
            zz = -21.67413 + (((tickAnim - 10) / 2) * (0.00281-(-21.67413)));
        }
        else if (tickAnim >= 12 && tickAnim < 15) {
            xx = -0.00019 + (((tickAnim - 12) / 3) * (0.00474-(-0.00019)));
            yy = 12.5 + (((tickAnim - 12) / 3) * (-10.00058-(12.5)));
            zz = 0.00281 + (((tickAnim - 12) / 3) * (0.07275-(0.00281)));
        }
        else if (tickAnim >= 15 && tickAnim < 17) {
            xx = 0.00474 + (((tickAnim - 15) / 2) * (12.99301-(0.00474)));
            yy = -10.00058 + (((tickAnim - 15) / 2) * (-5.49178-(-10.00058)));
            zz = 0.07275 + (((tickAnim - 15) / 2) * (-21.67413-(0.07275)));
        }
        else if (tickAnim >= 17 && tickAnim < 18) {
            xx = 12.99301 + (((tickAnim - 17) / 1) * (-0.00019-(12.99301)));
            yy = -5.49178 + (((tickAnim - 17) / 1) * (12.5-(-5.49178)));
            zz = -21.67413 + (((tickAnim - 17) / 1) * (0.00281-(-21.67413)));
        }
        else if (tickAnim >= 18 && tickAnim < 19) {
            xx = -0.00019 + (((tickAnim - 18) / 1) * (0-(-0.00019)));
            yy = 12.5 + (((tickAnim - 18) / 1) * (6.87-(12.5)));
            zz = 0.00281 + (((tickAnim - 18) / 1) * (0.02-(0.00281)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg10, leftLeg10.rotateAngleX + (float) Math.toRadians(xx), leftLeg10.rotateAngleY + (float) Math.toRadians(yy), leftLeg10.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 1) {
            xx = 6.5 + (((tickAnim - 0) / 1) * (12.99301-(6.5)));
            yy = 7.75 + (((tickAnim - 0) / 1) * (5.49178-(7.75)));
            zz = 10.8 + (((tickAnim - 0) / 1) * (21.67413-(10.8)));
        }
        else if (tickAnim >= 1 && tickAnim < 2) {
            xx = 12.99301 + (((tickAnim - 1) / 1) * (-0.00019-(12.99301)));
            yy = 5.49178 + (((tickAnim - 1) / 1) * (-12.5-(5.49178)));
            zz = 21.67413 + (((tickAnim - 1) / 1) * (-0.00281-(21.67413)));
        }
        else if (tickAnim >= 2 && tickAnim < 6) {
            xx = -0.00019 + (((tickAnim - 2) / 4) * (0.00474-(-0.00019)));
            yy = -12.5 + (((tickAnim - 2) / 4) * (10.00058-(-12.5)));
            zz = -0.00281 + (((tickAnim - 2) / 4) * (-0.07275-(-0.00281)));
        }
        else if (tickAnim >= 6 && tickAnim < 7) {
            xx = 0.00474 + (((tickAnim - 6) / 1) * (12.99301-(0.00474)));
            yy = 10.00058 + (((tickAnim - 6) / 1) * (5.49178-(10.00058)));
            zz = -0.07275 + (((tickAnim - 6) / 1) * (21.67413-(-0.07275)));
        }
        else if (tickAnim >= 7 && tickAnim < 9) {
            xx = 12.99301 + (((tickAnim - 7) / 2) * (-0.00019-(12.99301)));
            yy = 5.49178 + (((tickAnim - 7) / 2) * (-12.5-(5.49178)));
            zz = 21.67413 + (((tickAnim - 7) / 2) * (-0.00281-(21.67413)));
        }
        else if (tickAnim >= 9 && tickAnim < 12) {
            xx = -0.00019 + (((tickAnim - 9) / 3) * (0.00474-(-0.00019)));
            yy = -12.5 + (((tickAnim - 9) / 3) * (10.00058-(-12.5)));
            zz = -0.00281 + (((tickAnim - 9) / 3) * (-0.07275-(-0.00281)));
        }
        else if (tickAnim >= 12 && tickAnim < 14) {
            xx = 0.00474 + (((tickAnim - 12) / 2) * (12.99301-(0.00474)));
            yy = 10.00058 + (((tickAnim - 12) / 2) * (5.49178-(10.00058)));
            zz = -0.07275 + (((tickAnim - 12) / 2) * (21.67413-(-0.07275)));
        }
        else if (tickAnim >= 14 && tickAnim < 15) {
            xx = 12.99301 + (((tickAnim - 14) / 1) * (-0.00019-(12.99301)));
            yy = 5.49178 + (((tickAnim - 14) / 1) * (-12.5-(5.49178)));
            zz = 21.67413 + (((tickAnim - 14) / 1) * (-0.00281-(21.67413)));
        }
        else if (tickAnim >= 15 && tickAnim < 18) {
            xx = -0.00019 + (((tickAnim - 15) / 3) * (0.00474-(-0.00019)));
            yy = -12.5 + (((tickAnim - 15) / 3) * (10.00058-(-12.5)));
            zz = -0.00281 + (((tickAnim - 15) / 3) * (-0.07275-(-0.00281)));
        }
        else if (tickAnim >= 18 && tickAnim < 19) {
            xx = 0.00474 + (((tickAnim - 18) / 1) * (6.5-(0.00474)));
            yy = 10.00058 + (((tickAnim - 18) / 1) * (7.75-(10.00058)));
            zz = -0.07275 + (((tickAnim - 18) / 1) * (10.8-(-0.07275)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg10, rightLeg10.rotateAngleX + (float) Math.toRadians(xx), rightLeg10.rotateAngleY + (float) Math.toRadians(yy), rightLeg10.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            yy = 1.25 + (((tickAnim - 0) / 2) * (-10-(1.25)));
            zz = -0.03 + (((tickAnim - 0) / 2) * (0-(-0.03)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 2) / 1) * (10.8448-(0)));
            yy = -10 + (((tickAnim - 2) / 1) * (11.67406-(-10)));
            zz = 0 + (((tickAnim - 2) / 1) * (-20.49807-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 10.8448 + (((tickAnim - 3) / 2) * (0.00468-(10.8448)));
            yy = 11.67406 + (((tickAnim - 3) / 2) * (12.50027-(11.67406)));
            zz = -20.49807 + (((tickAnim - 3) / 2) * (-0.06524-(-20.49807)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 0.00468 + (((tickAnim - 5) / 3) * (0-(0.00468)));
            yy = 12.50027 + (((tickAnim - 5) / 3) * (-10-(12.50027)));
            zz = -0.06524 + (((tickAnim - 5) / 3) * (0-(-0.06524)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 8) / 2) * (10.8448-(0)));
            yy = -10 + (((tickAnim - 8) / 2) * (11.67406-(-10)));
            zz = 0 + (((tickAnim - 8) / 2) * (-20.49807-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 11) {
            xx = 10.8448 + (((tickAnim - 10) / 1) * (0.00468-(10.8448)));
            yy = 11.67406 + (((tickAnim - 10) / 1) * (12.50027-(11.67406)));
            zz = -20.49807 + (((tickAnim - 10) / 1) * (-0.06524-(-20.49807)));
        }
        else if (tickAnim >= 11 && tickAnim < 14) {
            xx = 0.00468 + (((tickAnim - 11) / 3) * (0-(0.00468)));
            yy = 12.50027 + (((tickAnim - 11) / 3) * (-10-(12.50027)));
            zz = -0.06524 + (((tickAnim - 11) / 3) * (0-(-0.06524)));
        }
        else if (tickAnim >= 14 && tickAnim < 16) {
            xx = 0 + (((tickAnim - 14) / 2) * (10.8448-(0)));
            yy = -10 + (((tickAnim - 14) / 2) * (11.67406-(-10)));
            zz = 0 + (((tickAnim - 14) / 2) * (-20.49807-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 18) {
            xx = 10.8448 + (((tickAnim - 16) / 2) * (0.00468-(10.8448)));
            yy = 11.67406 + (((tickAnim - 16) / 2) * (12.50027-(11.67406)));
            zz = -20.49807 + (((tickAnim - 16) / 2) * (-0.06524-(-20.49807)));
        }
        else if (tickAnim >= 18 && tickAnim < 19) {
            xx = 0.00468 + (((tickAnim - 18) / 1) * (0-(0.00468)));
            yy = 12.50027 + (((tickAnim - 18) / 1) * (1.25-(12.50027)));
            zz = -0.06524 + (((tickAnim - 18) / 1) * (-0.03-(-0.06524)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg11, leftLeg11.rotateAngleX + (float) Math.toRadians(xx), leftLeg11.rotateAngleY + (float) Math.toRadians(yy), leftLeg11.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 10.8448 + (((tickAnim - 0) / 2) * (0.00468-(10.8448)));
            yy = -11.67406 + (((tickAnim - 0) / 2) * (-12.50027-(-11.67406)));
            zz = 20.49807 + (((tickAnim - 0) / 2) * (0.06524-(20.49807)));
        }
        else if (tickAnim >= 2 && tickAnim < 5) {
            xx = 0.00468 + (((tickAnim - 2) / 3) * (0-(0.00468)));
            yy = -12.50027 + (((tickAnim - 2) / 3) * (10-(-12.50027)));
            zz = 0.06524 + (((tickAnim - 2) / 3) * (0-(0.06524)));
        }
        else if (tickAnim >= 5 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 5) / 1) * (10.8448-(0)));
            yy = 10 + (((tickAnim - 5) / 1) * (-11.67406-(10)));
            zz = 0 + (((tickAnim - 5) / 1) * (20.49807-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = 10.8448 + (((tickAnim - 6) / 2) * (0.00468-(10.8448)));
            yy = -11.67406 + (((tickAnim - 6) / 2) * (-12.50027-(-11.67406)));
            zz = 20.49807 + (((tickAnim - 6) / 2) * (0.06524-(20.49807)));
        }
        else if (tickAnim >= 8 && tickAnim < 11) {
            xx = 0.00468 + (((tickAnim - 8) / 3) * (0-(0.00468)));
            yy = -12.50027 + (((tickAnim - 8) / 3) * (10-(-12.50027)));
            zz = 0.06524 + (((tickAnim - 8) / 3) * (0-(0.06524)));
        }
        else if (tickAnim >= 11 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 11) / 2) * (10.8448-(0)));
            yy = 10 + (((tickAnim - 11) / 2) * (-11.67406-(10)));
            zz = 0 + (((tickAnim - 11) / 2) * (20.49807-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 14) {
            xx = 10.8448 + (((tickAnim - 13) / 1) * (0.00468-(10.8448)));
            yy = -11.67406 + (((tickAnim - 13) / 1) * (-12.50027-(-11.67406)));
            zz = 20.49807 + (((tickAnim - 13) / 1) * (0.06524-(20.49807)));
        }
        else if (tickAnim >= 14 && tickAnim < 18) {
            xx = 0.00468 + (((tickAnim - 14) / 4) * (0-(0.00468)));
            yy = -12.50027 + (((tickAnim - 14) / 4) * (10-(-12.50027)));
            zz = 0.06524 + (((tickAnim - 14) / 4) * (0-(0.06524)));
        }
        else if (tickAnim >= 18 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 18) / 1) * (10.8448-(0)));
            yy = 10 + (((tickAnim - 18) / 1) * (-11.67406-(10)));
            zz = 0 + (((tickAnim - 18) / 1) * (20.49807-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg11, rightLeg11.rotateAngleX + (float) Math.toRadians(xx), rightLeg11.rotateAngleY + (float) Math.toRadians(yy), rightLeg11.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 1) {
            xx = 4.29 + (((tickAnim - 0) / 1) * (6.21535-(4.29)));
            yy = -2.6 + (((tickAnim - 0) / 1) * (-9.8235-(-2.6)));
            zz = -5.04 + (((tickAnim - 0) / 1) * (-7.01082-(-5.04)));
        }
        else if (tickAnim >= 1 && tickAnim < 2) {
            xx = 6.21535 + (((tickAnim - 1) / 1) * (17.28264-(6.21535)));
            yy = -9.8235 + (((tickAnim - 1) / 1) * (8.95847-(-9.8235)));
            zz = -7.01082 + (((tickAnim - 1) / 1) * (-23.10577-(-7.01082)));
        }
        else if (tickAnim >= 2 && tickAnim < 4) {
            xx = 17.28264 + (((tickAnim - 2) / 2) * (-1.47869-(17.28264)));
            yy = 8.95847 + (((tickAnim - 2) / 2) * (19.05569-(8.95847)));
            zz = -23.10577 + (((tickAnim - 2) / 2) * (0.88071-(-23.10577)));
        }
        else if (tickAnim >= 4 && tickAnim < 7) {
            xx = -1.47869 + (((tickAnim - 4) / 3) * (6.21535-(-1.47869)));
            yy = 19.05569 + (((tickAnim - 4) / 3) * (-9.8235-(19.05569)));
            zz = 0.88071 + (((tickAnim - 4) / 3) * (-7.01082-(0.88071)));
        }
        else if (tickAnim >= 7 && tickAnim < 9) {
            xx = 6.21535 + (((tickAnim - 7) / 2) * (17.28264-(6.21535)));
            yy = -9.8235 + (((tickAnim - 7) / 2) * (8.95847-(-9.8235)));
            zz = -7.01082 + (((tickAnim - 7) / 2) * (-23.10577-(-7.01082)));
        }
        else if (tickAnim >= 9 && tickAnim < 10) {
            xx = 17.28264 + (((tickAnim - 9) / 1) * (-1.47869-(17.28264)));
            yy = 8.95847 + (((tickAnim - 9) / 1) * (19.05569-(8.95847)));
            zz = -23.10577 + (((tickAnim - 9) / 1) * (0.88071-(-23.10577)));
        }
        else if (tickAnim >= 10 && tickAnim < 14) {
            xx = -1.47869 + (((tickAnim - 10) / 4) * (6.21535-(-1.47869)));
            yy = 19.05569 + (((tickAnim - 10) / 4) * (-9.8235-(19.05569)));
            zz = 0.88071 + (((tickAnim - 10) / 4) * (-7.01082-(0.88071)));
        }
        else if (tickAnim >= 14 && tickAnim < 15) {
            xx = 6.21535 + (((tickAnim - 14) / 1) * (17.28264-(6.21535)));
            yy = -9.8235 + (((tickAnim - 14) / 1) * (8.95847-(-9.8235)));
            zz = -7.01082 + (((tickAnim - 14) / 1) * (-23.10577-(-7.01082)));
        }
        else if (tickAnim >= 15 && tickAnim < 17) {
            xx = 17.28264 + (((tickAnim - 15) / 2) * (-1.47869-(17.28264)));
            yy = 8.95847 + (((tickAnim - 15) / 2) * (19.05569-(8.95847)));
            zz = -23.10577 + (((tickAnim - 15) / 2) * (0.88071-(-23.10577)));
        }
        else if (tickAnim >= 17 && tickAnim < 19) {
            xx = -1.47869 + (((tickAnim - 17) / 2) * (4.29-(-1.47869)));
            yy = 19.05569 + (((tickAnim - 17) / 2) * (-2.6-(19.05569)));
            zz = 0.88071 + (((tickAnim - 17) / 2) * (-5.04-(0.88071)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg12, leftLeg12.rotateAngleX + (float) Math.toRadians(xx), leftLeg12.rotateAngleY + (float) Math.toRadians(yy), leftLeg12.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 1) {
            xx = 7.9 + (((tickAnim - 0) / 1) * (-1.47869-(7.9)));
            yy = -14.01 + (((tickAnim - 0) / 1) * (-19.05569-(-14.01)));
            zz = 11.11 + (((tickAnim - 0) / 1) * (-0.88071-(11.11)));
        }
        else if (tickAnim >= 1 && tickAnim < 4) {
            xx = -1.47869 + (((tickAnim - 1) / 3) * (6.21535-(-1.47869)));
            yy = -19.05569 + (((tickAnim - 1) / 3) * (9.8235-(-19.05569)));
            zz = -0.88071 + (((tickAnim - 1) / 3) * (7.01082-(-0.88071)));
        }
        else if (tickAnim >= 4 && tickAnim < 6) {
            xx = 6.21535 + (((tickAnim - 4) / 2) * (17.28264-(6.21535)));
            yy = 9.8235 + (((tickAnim - 4) / 2) * (-8.95847-(9.8235)));
            zz = 7.01082 + (((tickAnim - 4) / 2) * (23.10577-(7.01082)));
        }
        else if (tickAnim >= 6 && tickAnim < 7) {
            xx = 17.28264 + (((tickAnim - 6) / 1) * (-1.47869-(17.28264)));
            yy = -8.95847 + (((tickAnim - 6) / 1) * (-19.05569-(-8.95847)));
            zz = 23.10577 + (((tickAnim - 6) / 1) * (-0.88071-(23.10577)));
        }
        else if (tickAnim >= 7 && tickAnim < 10) {
            xx = -1.47869 + (((tickAnim - 7) / 3) * (6.21535-(-1.47869)));
            yy = -19.05569 + (((tickAnim - 7) / 3) * (9.8235-(-19.05569)));
            zz = -0.88071 + (((tickAnim - 7) / 3) * (7.01082-(-0.88071)));
        }
        else if (tickAnim >= 10 && tickAnim < 12) {
            xx = 6.21535 + (((tickAnim - 10) / 2) * (17.28264-(6.21535)));
            yy = 9.8235 + (((tickAnim - 10) / 2) * (-8.95847-(9.8235)));
            zz = 7.01082 + (((tickAnim - 10) / 2) * (23.10577-(7.01082)));
        }
        else if (tickAnim >= 12 && tickAnim < 14) {
            xx = 17.28264 + (((tickAnim - 12) / 2) * (-1.47869-(17.28264)));
            yy = -8.95847 + (((tickAnim - 12) / 2) * (-19.05569-(-8.95847)));
            zz = 23.10577 + (((tickAnim - 12) / 2) * (-0.88071-(23.10577)));
        }
        else if (tickAnim >= 14 && tickAnim < 17) {
            xx = -1.47869 + (((tickAnim - 14) / 3) * (6.21535-(-1.47869)));
            yy = -19.05569 + (((tickAnim - 14) / 3) * (9.8235-(-19.05569)));
            zz = -0.88071 + (((tickAnim - 14) / 3) * (7.01082-(-0.88071)));
        }
        else if (tickAnim >= 17 && tickAnim < 18) {
            xx = 6.21535 + (((tickAnim - 17) / 1) * (17.28264-(6.21535)));
            yy = 9.8235 + (((tickAnim - 17) / 1) * (-8.95847-(9.8235)));
            zz = 7.01082 + (((tickAnim - 17) / 1) * (23.10577-(7.01082)));
        }
        else if (tickAnim >= 18 && tickAnim < 19) {
            xx = 17.28264 + (((tickAnim - 18) / 1) * (7.9-(17.28264)));
            yy = -8.95847 + (((tickAnim - 18) / 1) * (-14.01-(-8.95847)));
            zz = 23.10577 + (((tickAnim - 18) / 1) * (11.11-(23.10577)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg12, rightLeg12.rotateAngleX + (float) Math.toRadians(xx), rightLeg12.rotateAngleY + (float) Math.toRadians(yy), rightLeg12.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 4.98611 + (((tickAnim - 0) / 2) * (18.69591-(4.98611)));
            yy = -4.84706 + (((tickAnim - 0) / 2) * (14.07241-(-4.84706)));
            zz = -5.6894 + (((tickAnim - 0) / 2) * (-23.8403-(-5.6894)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = 18.69591 + (((tickAnim - 2) / 1) * (-1.02262-(18.69591)));
            yy = 14.07241 + (((tickAnim - 2) / 1) * (27.51976-(14.07241)));
            zz = -23.8403 + (((tickAnim - 2) / 1) * (2.52272-(-23.8403)));
        }
        else if (tickAnim >= 3 && tickAnim < 6) {
            xx = -1.02262 + (((tickAnim - 3) / 3) * (4.98611-(-1.02262)));
            yy = 27.51976 + (((tickAnim - 3) / 3) * (-4.84706-(27.51976)));
            zz = 2.52272 + (((tickAnim - 3) / 3) * (-5.6894-(2.52272)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = 4.98611 + (((tickAnim - 6) / 2) * (18.69591-(4.98611)));
            yy = -4.84706 + (((tickAnim - 6) / 2) * (14.07241-(-4.84706)));
            zz = -5.6894 + (((tickAnim - 6) / 2) * (-23.8403-(-5.6894)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 18.69591 + (((tickAnim - 8) / 2) * (-1.02262-(18.69591)));
            yy = 14.07241 + (((tickAnim - 8) / 2) * (27.51976-(14.07241)));
            zz = -23.8403 + (((tickAnim - 8) / 2) * (2.52272-(-23.8403)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = -1.02262 + (((tickAnim - 10) / 3) * (4.98611-(-1.02262)));
            yy = 27.51976 + (((tickAnim - 10) / 3) * (-4.84706-(27.51976)));
            zz = 2.52272 + (((tickAnim - 10) / 3) * (-5.6894-(2.52272)));
        }
        else if (tickAnim >= 13 && tickAnim < 14) {
            xx = 4.98611 + (((tickAnim - 13) / 1) * (18.69591-(4.98611)));
            yy = -4.84706 + (((tickAnim - 13) / 1) * (14.07241-(-4.84706)));
            zz = -5.6894 + (((tickAnim - 13) / 1) * (-23.8403-(-5.6894)));
        }
        else if (tickAnim >= 14 && tickAnim < 16) {
            xx = 18.69591 + (((tickAnim - 14) / 2) * (-1.02262-(18.69591)));
            yy = 14.07241 + (((tickAnim - 14) / 2) * (27.51976-(14.07241)));
            zz = -23.8403 + (((tickAnim - 14) / 2) * (2.52272-(-23.8403)));
        }
        else if (tickAnim >= 16 && tickAnim < 19) {
            xx = -1.02262 + (((tickAnim - 16) / 3) * (4.98611-(-1.02262)));
            yy = 27.51976 + (((tickAnim - 16) / 3) * (-4.84706-(27.51976)));
            zz = 2.52272 + (((tickAnim - 16) / 3) * (-5.6894-(2.52272)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg13, leftLeg13.rotateAngleX + (float) Math.toRadians(xx), leftLeg13.rotateAngleY + (float) Math.toRadians(yy), leftLeg13.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = -1.02262 + (((tickAnim - 0) / 3) * (4.98611-(-1.02262)));
            yy = -27.51976 + (((tickAnim - 0) / 3) * (4.84706-(-27.51976)));
            zz = -2.52272 + (((tickAnim - 0) / 3) * (5.6894-(-2.52272)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 4.98611 + (((tickAnim - 3) / 2) * (18.69591-(4.98611)));
            yy = 4.84706 + (((tickAnim - 3) / 2) * (-14.07241-(4.84706)));
            zz = 5.6894 + (((tickAnim - 3) / 2) * (23.8403-(5.6894)));
        }
        else if (tickAnim >= 5 && tickAnim < 6) {
            xx = 18.69591 + (((tickAnim - 5) / 1) * (-1.02262-(18.69591)));
            yy = -14.07241 + (((tickAnim - 5) / 1) * (-27.51976-(-14.07241)));
            zz = 23.8403 + (((tickAnim - 5) / 1) * (-2.52272-(23.8403)));
        }
        else if (tickAnim >= 6 && tickAnim < 10) {
            xx = -1.02262 + (((tickAnim - 6) / 4) * (4.98611-(-1.02262)));
            yy = -27.51976 + (((tickAnim - 6) / 4) * (4.84706-(-27.51976)));
            zz = -2.52272 + (((tickAnim - 6) / 4) * (5.6894-(-2.52272)));
        }
        else if (tickAnim >= 10 && tickAnim < 11) {
            xx = 4.98611 + (((tickAnim - 10) / 1) * (18.69591-(4.98611)));
            yy = 4.84706 + (((tickAnim - 10) / 1) * (-14.07241-(4.84706)));
            zz = 5.6894 + (((tickAnim - 10) / 1) * (23.8403-(5.6894)));
        }
        else if (tickAnim >= 11 && tickAnim < 13) {
            xx = 18.69591 + (((tickAnim - 11) / 2) * (-1.02262-(18.69591)));
            yy = -14.07241 + (((tickAnim - 11) / 2) * (-27.51976-(-14.07241)));
            zz = 23.8403 + (((tickAnim - 11) / 2) * (-2.52272-(23.8403)));
        }
        else if (tickAnim >= 13 && tickAnim < 16) {
            xx = -1.02262 + (((tickAnim - 13) / 3) * (4.98611-(-1.02262)));
            yy = -27.51976 + (((tickAnim - 13) / 3) * (4.84706-(-27.51976)));
            zz = -2.52272 + (((tickAnim - 13) / 3) * (5.6894-(-2.52272)));
        }
        else if (tickAnim >= 16 && tickAnim < 18) {
            xx = 4.98611 + (((tickAnim - 16) / 2) * (18.69591-(4.98611)));
            yy = 4.84706 + (((tickAnim - 16) / 2) * (-14.07241-(4.84706)));
            zz = 5.6894 + (((tickAnim - 16) / 2) * (23.8403-(5.6894)));
        }
        else if (tickAnim >= 18 && tickAnim < 19) {
            xx = 18.69591 + (((tickAnim - 18) / 1) * (-1.02262-(18.69591)));
            yy = -14.07241 + (((tickAnim - 18) / 1) * (-27.51976-(-14.07241)));
            zz = 23.8403 + (((tickAnim - 18) / 1) * (-2.52272-(23.8403)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg13, rightLeg13.rotateAngleX + (float) Math.toRadians(xx), rightLeg13.rotateAngleY + (float) Math.toRadians(yy), rightLeg13.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 1) {
            xx = 17.29 + (((tickAnim - 0) / 1) * (25.57677-(17.29)));
            yy = 8.75 + (((tickAnim - 0) / 1) * (19.82178-(8.75)));
            zz = -13.39 + (((tickAnim - 0) / 1) * (-24.9331-(-13.39)));
        }
        else if (tickAnim >= 1 && tickAnim < 2) {
            xx = 25.57677 + (((tickAnim - 1) / 1) * (1.88103-(25.57677)));
            yy = 19.82178 + (((tickAnim - 1) / 1) * (35.15634-(19.82178)));
            zz = -24.9331 + (((tickAnim - 1) / 1) * (-1.17111-(-24.9331)));
        }
        else if (tickAnim >= 2 && tickAnim < 6) {
            xx = 1.88103 + (((tickAnim - 2) / 4) * (9.00124-(1.88103)));
            yy = 35.15634 + (((tickAnim - 2) / 4) * (-2.32709-(35.15634)));
            zz = -1.17111 + (((tickAnim - 2) / 4) * (-1.8492-(-1.17111)));
        }
        else if (tickAnim >= 6 && tickAnim < 7) {
            xx = 9.00124 + (((tickAnim - 6) / 1) * (25.57677-(9.00124)));
            yy = -2.32709 + (((tickAnim - 6) / 1) * (19.82178-(-2.32709)));
            zz = -1.8492 + (((tickAnim - 6) / 1) * (-24.9331-(-1.8492)));
        }
        else if (tickAnim >= 7 && tickAnim < 9) {
            xx = 25.57677 + (((tickAnim - 7) / 2) * (1.88103-(25.57677)));
            yy = 19.82178 + (((tickAnim - 7) / 2) * (35.15634-(19.82178)));
            zz = -24.9331 + (((tickAnim - 7) / 2) * (-1.17111-(-24.9331)));
        }
        else if (tickAnim >= 9 && tickAnim < 12) {
            xx = 1.88103 + (((tickAnim - 9) / 3) * (9.00124-(1.88103)));
            yy = 35.15634 + (((tickAnim - 9) / 3) * (-2.32709-(35.15634)));
            zz = -1.17111 + (((tickAnim - 9) / 3) * (-1.8492-(-1.17111)));
        }
        else if (tickAnim >= 12 && tickAnim < 14) {
            xx = 9.00124 + (((tickAnim - 12) / 2) * (25.57677-(9.00124)));
            yy = -2.32709 + (((tickAnim - 12) / 2) * (19.82178-(-2.32709)));
            zz = -1.8492 + (((tickAnim - 12) / 2) * (-24.9331-(-1.8492)));
        }
        else if (tickAnim >= 14 && tickAnim < 15) {
            xx = 25.57677 + (((tickAnim - 14) / 1) * (1.88103-(25.57677)));
            yy = 19.82178 + (((tickAnim - 14) / 1) * (35.15634-(19.82178)));
            zz = -24.9331 + (((tickAnim - 14) / 1) * (-1.17111-(-24.9331)));
        }
        else if (tickAnim >= 15 && tickAnim < 18) {
            xx = 1.88103 + (((tickAnim - 15) / 3) * (9.00124-(1.88103)));
            yy = 35.15634 + (((tickAnim - 15) / 3) * (-2.32709-(35.15634)));
            zz = -1.17111 + (((tickAnim - 15) / 3) * (-1.8492-(-1.17111)));
        }
        else if (tickAnim >= 18 && tickAnim < 19) {
            xx = 9.00124 + (((tickAnim - 18) / 1) * (17.29-(9.00124)));
            yy = -2.32709 + (((tickAnim - 18) / 1) * (8.75-(-2.32709)));
            zz = -1.8492 + (((tickAnim - 18) / 1) * (-13.39-(-1.8492)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg14, leftLeg14.rotateAngleX + (float) Math.toRadians(xx), leftLeg14.rotateAngleY + (float) Math.toRadians(yy), leftLeg14.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 3.66 + (((tickAnim - 0) / 2) * (9.00124-(3.66)));
            yy = -25.79 + (((tickAnim - 0) / 2) * (2.32709-(-25.79)));
            zz = 1.34 + (((tickAnim - 0) / 2) * (1.8492-(1.34)));
        }
        else if (tickAnim >= 2 && tickAnim < 4) {
            xx = 9.00124 + (((tickAnim - 2) / 2) * (25.57677-(9.00124)));
            yy = 2.32709 + (((tickAnim - 2) / 2) * (-19.82178-(2.32709)));
            zz = 1.8492 + (((tickAnim - 2) / 2) * (24.9331-(1.8492)));
        }
        else if (tickAnim >= 4 && tickAnim < 6) {
            xx = 25.57677 + (((tickAnim - 4) / 2) * (1.88103-(25.57677)));
            yy = -19.82178 + (((tickAnim - 4) / 2) * (-35.15634-(-19.82178)));
            zz = 24.9331 + (((tickAnim - 4) / 2) * (1.17111-(24.9331)));
        }
        else if (tickAnim >= 6 && tickAnim < 9) {
            xx = 1.88103 + (((tickAnim - 6) / 3) * (9.00124-(1.88103)));
            yy = -35.15634 + (((tickAnim - 6) / 3) * (2.32709-(-35.15634)));
            zz = 1.17111 + (((tickAnim - 6) / 3) * (1.8492-(1.17111)));
        }
        else if (tickAnim >= 9 && tickAnim < 10) {
            xx = 9.00124 + (((tickAnim - 9) / 1) * (25.57677-(9.00124)));
            yy = 2.32709 + (((tickAnim - 9) / 1) * (-19.82178-(2.32709)));
            zz = 1.8492 + (((tickAnim - 9) / 1) * (24.9331-(1.8492)));
        }
        else if (tickAnim >= 10 && tickAnim < 12) {
            xx = 25.57677 + (((tickAnim - 10) / 2) * (1.88103-(25.57677)));
            yy = -19.82178 + (((tickAnim - 10) / 2) * (-35.15634-(-19.82178)));
            zz = 24.9331 + (((tickAnim - 10) / 2) * (1.17111-(24.9331)));
        }
        else if (tickAnim >= 12 && tickAnim < 15) {
            xx = 1.88103 + (((tickAnim - 12) / 3) * (9.00124-(1.88103)));
            yy = -35.15634 + (((tickAnim - 12) / 3) * (2.32709-(-35.15634)));
            zz = 1.17111 + (((tickAnim - 12) / 3) * (1.8492-(1.17111)));
        }
        else if (tickAnim >= 15 && tickAnim < 17) {
            xx = 9.00124 + (((tickAnim - 15) / 2) * (25.57677-(9.00124)));
            yy = 2.32709 + (((tickAnim - 15) / 2) * (-19.82178-(2.32709)));
            zz = 1.8492 + (((tickAnim - 15) / 2) * (24.9331-(1.8492)));
        }
        else if (tickAnim >= 17 && tickAnim < 18) {
            xx = 25.57677 + (((tickAnim - 17) / 1) * (1.88103-(25.57677)));
            yy = -19.82178 + (((tickAnim - 17) / 1) * (-35.15634-(-19.82178)));
            zz = 24.9331 + (((tickAnim - 17) / 1) * (1.17111-(24.9331)));
        }
        else if (tickAnim >= 18 && tickAnim < 19) {
            xx = 1.88103 + (((tickAnim - 18) / 1) * (3.66-(1.88103)));
            yy = -35.15634 + (((tickAnim - 18) / 1) * (-25.79-(-35.15634)));
            zz = 1.17111 + (((tickAnim - 18) / 1) * (1.34-(1.17111)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg14, rightLeg14.rotateAngleX + (float) Math.toRadians(xx), rightLeg14.rotateAngleY + (float) Math.toRadians(yy), rightLeg14.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 35.76797 + (((tickAnim - 0) / 2) * (1.45184-(35.76797)));
            yy = 29.69986 + (((tickAnim - 0) / 2) * (42.65389-(29.69986)));
            zz = -35.42503 + (((tickAnim - 0) / 2) * (-0.71049-(-35.42503)));
        }
        else if (tickAnim >= 2 && tickAnim < 5) {
            xx = 1.45184 + (((tickAnim - 2) / 3) * (-0.2941-(1.45184)));
            yy = 42.65389 + (((tickAnim - 2) / 3) * (5.21367-(42.65389)));
            zz = -0.71049 + (((tickAnim - 2) / 3) * (7.39367-(-0.71049)));
        }
        else if (tickAnim >= 5 && tickAnim < 6) {
            xx = -0.2941 + (((tickAnim - 5) / 1) * (35.76797-(-0.2941)));
            yy = 5.21367 + (((tickAnim - 5) / 1) * (29.69986-(5.21367)));
            zz = 7.39367 + (((tickAnim - 5) / 1) * (-35.42503-(7.39367)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = 35.76797 + (((tickAnim - 6) / 2) * (1.45184-(35.76797)));
            yy = 29.69986 + (((tickAnim - 6) / 2) * (42.65389-(29.69986)));
            zz = -35.42503 + (((tickAnim - 6) / 2) * (-0.71049-(-35.42503)));
        }
        else if (tickAnim >= 8 && tickAnim < 11) {
            xx = 1.45184 + (((tickAnim - 8) / 3) * (-0.2941-(1.45184)));
            yy = 42.65389 + (((tickAnim - 8) / 3) * (5.21367-(42.65389)));
            zz = -0.71049 + (((tickAnim - 8) / 3) * (7.39367-(-0.71049)));
        }
        else if (tickAnim >= 11 && tickAnim < 13) {
            xx = -0.2941 + (((tickAnim - 11) / 2) * (35.76797-(-0.2941)));
            yy = 5.21367 + (((tickAnim - 11) / 2) * (29.69986-(5.21367)));
            zz = 7.39367 + (((tickAnim - 11) / 2) * (-35.42503-(7.39367)));
        }
        else if (tickAnim >= 13 && tickAnim < 14) {
            xx = 35.76797 + (((tickAnim - 13) / 1) * (1.45184-(35.76797)));
            yy = 29.69986 + (((tickAnim - 13) / 1) * (42.65389-(29.69986)));
            zz = -35.42503 + (((tickAnim - 13) / 1) * (-0.71049-(-35.42503)));
        }
        else if (tickAnim >= 14 && tickAnim < 18) {
            xx = 1.45184 + (((tickAnim - 14) / 4) * (-0.2941-(1.45184)));
            yy = 42.65389 + (((tickAnim - 14) / 4) * (5.21367-(42.65389)));
            zz = -0.71049 + (((tickAnim - 14) / 4) * (7.39367-(-0.71049)));
        }
        else if (tickAnim >= 18 && tickAnim < 19) {
            xx = -0.2941 + (((tickAnim - 18) / 1) * (35.76797-(-0.2941)));
            yy = 5.21367 + (((tickAnim - 18) / 1) * (29.69986-(5.21367)));
            zz = 7.39367 + (((tickAnim - 18) / 1) * (-35.42503-(7.39367)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg15, leftLeg15.rotateAngleX + (float) Math.toRadians(xx), leftLeg15.rotateAngleY + (float) Math.toRadians(yy), leftLeg15.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0.58 + (((tickAnim - 0) / 2) * (-0.2941-(0.58)));
            yy = -23.93 + (((tickAnim - 0) / 2) * (-5.21367-(-23.93)));
            zz = -3.34 + (((tickAnim - 0) / 2) * (-7.39367-(-3.34)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = -0.2941 + (((tickAnim - 2) / 1) * (35.76797-(-0.2941)));
            yy = -5.21367 + (((tickAnim - 2) / 1) * (-29.69986-(-5.21367)));
            zz = -7.39367 + (((tickAnim - 2) / 1) * (35.42503-(-7.39367)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 35.76797 + (((tickAnim - 3) / 2) * (1.45184-(35.76797)));
            yy = -29.69986 + (((tickAnim - 3) / 2) * (-42.65389-(-29.69986)));
            zz = 35.42503 + (((tickAnim - 3) / 2) * (0.71049-(35.42503)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 1.45184 + (((tickAnim - 5) / 3) * (-0.2941-(1.45184)));
            yy = -42.65389 + (((tickAnim - 5) / 3) * (-5.21367-(-42.65389)));
            zz = 0.71049 + (((tickAnim - 5) / 3) * (-7.39367-(0.71049)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = -0.2941 + (((tickAnim - 8) / 2) * (35.76797-(-0.2941)));
            yy = -5.21367 + (((tickAnim - 8) / 2) * (-29.69986-(-5.21367)));
            zz = -7.39367 + (((tickAnim - 8) / 2) * (35.42503-(-7.39367)));
        }
        else if (tickAnim >= 10 && tickAnim < 11) {
            xx = 35.76797 + (((tickAnim - 10) / 1) * (1.45184-(35.76797)));
            yy = -29.69986 + (((tickAnim - 10) / 1) * (-42.65389-(-29.69986)));
            zz = 35.42503 + (((tickAnim - 10) / 1) * (0.71049-(35.42503)));
        }
        else if (tickAnim >= 11 && tickAnim < 14) {
            xx = 1.45184 + (((tickAnim - 11) / 3) * (-0.2941-(1.45184)));
            yy = -42.65389 + (((tickAnim - 11) / 3) * (-5.21367-(-42.65389)));
            zz = 0.71049 + (((tickAnim - 11) / 3) * (-7.39367-(0.71049)));
        }
        else if (tickAnim >= 14 && tickAnim < 16) {
            xx = -0.2941 + (((tickAnim - 14) / 2) * (35.76797-(-0.2941)));
            yy = -5.21367 + (((tickAnim - 14) / 2) * (-29.69986-(-5.21367)));
            zz = -7.39367 + (((tickAnim - 14) / 2) * (35.42503-(-7.39367)));
        }
        else if (tickAnim >= 16 && tickAnim < 18) {
            xx = 35.76797 + (((tickAnim - 16) / 2) * (1.45184-(35.76797)));
            yy = -29.69986 + (((tickAnim - 16) / 2) * (-42.65389-(-29.69986)));
            zz = 35.42503 + (((tickAnim - 16) / 2) * (0.71049-(35.42503)));
        }
        else if (tickAnim >= 18 && tickAnim < 19) {
            xx = 1.45184 + (((tickAnim - 18) / 1) * (0.58-(1.45184)));
            yy = -42.65389 + (((tickAnim - 18) / 1) * (-23.93-(-42.65389)));
            zz = 0.71049 + (((tickAnim - 18) / 1) * (-3.34-(0.71049)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg15, rightLeg15.rotateAngleX + (float) Math.toRadians(xx), rightLeg15.rotateAngleY + (float) Math.toRadians(yy), rightLeg15.rotateAngleZ + (float) Math.toRadians(zz));



        this.setRotateAngle(ultimatelegleft, ultimatelegleft.rotateAngleX + (float) Math.toRadians(0), ultimatelegleft.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*(376*2)))), ultimatelegleft.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(ultimatelegright, ultimatelegright.rotateAngleX + (float) Math.toRadians(0), ultimatelegright.rotateAngleY + (float) Math.toRadians(-(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*(376*2))))*3), ultimatelegright.rotateAngleZ + (float) Math.toRadians(0));
    }

    @Override
    public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
        super.setRotationAngles(f, f1, f2, f3, f4, f5, e);
        //this.resetToDefaultPose();
        //this.casineria.offsetY = 1.20F;

        EntityPrehistoricFloraMyriapod entityMyriapod = (EntityPrehistoricFloraMyriapod) e;


    }


    public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        EntityPrehistoricFloraMyriapod e = (EntityPrehistoricFloraMyriapod) entity;
        animator.update(entity);
        
    }
}
