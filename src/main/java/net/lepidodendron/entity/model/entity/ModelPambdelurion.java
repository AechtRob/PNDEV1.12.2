package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.EntityPrehistoricFloraPambdelurion;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelPambdelurion extends ModelBasePalaeopedia {
    private final AdvancedModelRenderer Pambdelurion;
    private final AdvancedModelRenderer leftFin4;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer rightFin4;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer leftFin5;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer rightFin5;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer leftFin6;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer rightFin6;
    private final AdvancedModelRenderer cube_r6;
    private final AdvancedModelRenderer leftLeg4;
    private final AdvancedModelRenderer cube_r7;
    private final AdvancedModelRenderer rightLeg4;
    private final AdvancedModelRenderer cube_r8;
    private final AdvancedModelRenderer leftLeg5;
    private final AdvancedModelRenderer cube_r9;
    private final AdvancedModelRenderer rightLeg5;
    private final AdvancedModelRenderer cube_r10;
    private final AdvancedModelRenderer leftLeg6;
    private final AdvancedModelRenderer cube_r11;
    private final AdvancedModelRenderer rightLeg6;
    private final AdvancedModelRenderer cube_r12;
    private final AdvancedModelRenderer tail1;
    private final AdvancedModelRenderer leftFin7;
    private final AdvancedModelRenderer cube_r13;
    private final AdvancedModelRenderer rightFin7;
    private final AdvancedModelRenderer cube_r14;
    private final AdvancedModelRenderer leftFin8;
    private final AdvancedModelRenderer cube_r15;
    private final AdvancedModelRenderer rightFin8;
    private final AdvancedModelRenderer cube_r16;
    private final AdvancedModelRenderer leftLeg7;
    private final AdvancedModelRenderer cube_r17;
    private final AdvancedModelRenderer rightLeg7;
    private final AdvancedModelRenderer cube_r18;
    private final AdvancedModelRenderer leftLeg8;
    private final AdvancedModelRenderer cube_r19;
    private final AdvancedModelRenderer rightLeg8;
    private final AdvancedModelRenderer cube_r20;
    private final AdvancedModelRenderer tail2;
    private final AdvancedModelRenderer leftFin9;
    private final AdvancedModelRenderer cube_r21;
    private final AdvancedModelRenderer rightFin9;
    private final AdvancedModelRenderer cube_r22;
    private final AdvancedModelRenderer leftLeg9;
    private final AdvancedModelRenderer cube_r23;
    private final AdvancedModelRenderer rightLeg9;
    private final AdvancedModelRenderer cube_r24;
    private final AdvancedModelRenderer tail3;
    private final AdvancedModelRenderer leftFin10;
    private final AdvancedModelRenderer cube_r25;
    private final AdvancedModelRenderer rightFin10;
    private final AdvancedModelRenderer cube_r26;
    private final AdvancedModelRenderer leftLeg10;
    private final AdvancedModelRenderer cube_r27;
    private final AdvancedModelRenderer rightLeg10;
    private final AdvancedModelRenderer cube_r28;
    private final AdvancedModelRenderer tail4;
    private final AdvancedModelRenderer leftFin11;
    private final AdvancedModelRenderer cube_r29;
    private final AdvancedModelRenderer rightFin11;
    private final AdvancedModelRenderer cube_r30;
    private final AdvancedModelRenderer leftFin12;
    private final AdvancedModelRenderer cube_r31;
    private final AdvancedModelRenderer rightFin12;
    private final AdvancedModelRenderer cube_r32;
    private final AdvancedModelRenderer leftLeg11;
    private final AdvancedModelRenderer cube_r33;
    private final AdvancedModelRenderer rightLeg11;
    private final AdvancedModelRenderer cube_r34;
    private final AdvancedModelRenderer neck1;
    private final AdvancedModelRenderer leftFin2;
    private final AdvancedModelRenderer cube_r35;
    private final AdvancedModelRenderer rightFin2;
    private final AdvancedModelRenderer cube_r36;
    private final AdvancedModelRenderer leftFin3;
    private final AdvancedModelRenderer cube_r37;
    private final AdvancedModelRenderer rightFin3;
    private final AdvancedModelRenderer cube_r38;
    private final AdvancedModelRenderer leftLeg2;
    private final AdvancedModelRenderer cube_r39;
    private final AdvancedModelRenderer rightLeg2;
    private final AdvancedModelRenderer cube_r40;
    private final AdvancedModelRenderer leftLeg3;
    private final AdvancedModelRenderer cube_r41;
    private final AdvancedModelRenderer rightLeg3;
    private final AdvancedModelRenderer cube_r42;
    private final AdvancedModelRenderer neck2;
    private final AdvancedModelRenderer leftFin1;
    private final AdvancedModelRenderer cube_r43;
    private final AdvancedModelRenderer rightFin1;
    private final AdvancedModelRenderer cube_r44;
    private final AdvancedModelRenderer leftLeg1;
    private final AdvancedModelRenderer cube_r45;
    private final AdvancedModelRenderer rightLeg1;
    private final AdvancedModelRenderer cube_r46;
    private final AdvancedModelRenderer head;
    private final AdvancedModelRenderer cube_r47;
    private final AdvancedModelRenderer cube_r48;
    private final AdvancedModelRenderer cube_r49;
    private final AdvancedModelRenderer cube_r50;
    private final AdvancedModelRenderer cube_r51;
    private final AdvancedModelRenderer cube_r52;
    private final AdvancedModelRenderer cube_r53;
    private final AdvancedModelRenderer cube_r54;
    private final AdvancedModelRenderer cube_r55;
    private final AdvancedModelRenderer cube_r56;
    private final AdvancedModelRenderer leftAppendage1;
    private final AdvancedModelRenderer cube_r57;
    private final AdvancedModelRenderer cube_r58;
    private final AdvancedModelRenderer cube_r59;
    private final AdvancedModelRenderer leftAppendage2;
    private final AdvancedModelRenderer cube_r60;
    private final AdvancedModelRenderer cube_r61;
    private final AdvancedModelRenderer cube_r62;
    private final AdvancedModelRenderer cube_r63;
    private final AdvancedModelRenderer leftAppendage3;
    private final AdvancedModelRenderer cube_r64;
    private final AdvancedModelRenderer leftSpine1;
    private final AdvancedModelRenderer leftSpine2;
    private final AdvancedModelRenderer cube_r65;
    private final AdvancedModelRenderer leftSpine3;
    private final AdvancedModelRenderer leftSpine4;
    private final AdvancedModelRenderer cube_r66;
    private final AdvancedModelRenderer leftSpine5;
    private final AdvancedModelRenderer rightAppendage1;
    private final AdvancedModelRenderer cube_r67;
    private final AdvancedModelRenderer cube_r68;
    private final AdvancedModelRenderer cube_r69;
    private final AdvancedModelRenderer rightAppendage2;
    private final AdvancedModelRenderer cube_r70;
    private final AdvancedModelRenderer cube_r71;
    private final AdvancedModelRenderer cube_r72;
    private final AdvancedModelRenderer cube_r73;
    private final AdvancedModelRenderer rightAppendage3;
    private final AdvancedModelRenderer cube_r74;
    private final AdvancedModelRenderer rightSpine1;
    private final AdvancedModelRenderer rightSpine2;
    private final AdvancedModelRenderer cube_r75;
    private final AdvancedModelRenderer rightSpine3;
    private final AdvancedModelRenderer rightSpine4;
    private final AdvancedModelRenderer cube_r76;
    private final AdvancedModelRenderer rightSpine5;

    private ModelAnimator animator;

    public ModelPambdelurion() {
        this.textureWidth = 64;
        this.textureHeight = 64;

        this.Pambdelurion = new AdvancedModelRenderer(this);
        this.Pambdelurion.setRotationPoint(0.0F, 22.25F, 5.0F);
        this.Pambdelurion.cubeList.add(new ModelBox(Pambdelurion, 0, 0, -4.0F, -1.0F, -4.0F, 8, 2, 8, 0.04F, false));

        this.leftFin4 = new AdvancedModelRenderer(this);
        this.leftFin4.setRotationPoint(4.0F, -0.25F, -3.0F);
        this.Pambdelurion.addChild(leftFin4);


        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.leftFin4.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.0873F, 0.1309F, 0.1745F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 39, 10, -1.0458F, 0.0F, -1.5128F, 6, 0, 3, 0.0F, false));

        this.rightFin4 = new AdvancedModelRenderer(this);
        this.rightFin4.setRotationPoint(-4.0F, -0.25F, -3.0F);
        this.Pambdelurion.addChild(rightFin4);


        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.rightFin4.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.0873F, -0.1309F, -0.1745F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 39, 10, -4.9542F, 0.0F, -1.5128F, 6, 0, 3, 0.0F, true));

        this.leftFin5 = new AdvancedModelRenderer(this);
        this.leftFin5.setRotationPoint(4.0F, -0.25F, -0.25F);
        this.Pambdelurion.addChild(leftFin5);


        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.leftFin5.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.0873F, 0.0873F, 0.1745F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 0, 37, -0.6307F, 0.0F, -1.5057F, 6, 0, 3, 0.0F, false));

        this.rightFin5 = new AdvancedModelRenderer(this);
        this.rightFin5.setRotationPoint(-4.0F, -0.25F, -0.25F);
        this.Pambdelurion.addChild(rightFin5);


        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.rightFin5.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.0873F, -0.0873F, -0.1745F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 0, 37, -5.3693F, 0.0F, -1.5057F, 6, 0, 3, 0.0F, true));

        this.leftFin6 = new AdvancedModelRenderer(this);
        this.leftFin6.setRotationPoint(4.0F, -0.25F, 2.5F);
        this.Pambdelurion.addChild(leftFin6);


        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.leftFin6.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.0873F, 0.0436F, 0.1745F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 36, 23, -0.5654F, 0.0F, -1.5014F, 6, 0, 3, 0.0F, false));

        this.rightFin6 = new AdvancedModelRenderer(this);
        this.rightFin6.setRotationPoint(-4.0F, -0.25F, 2.5F);
        this.Pambdelurion.addChild(rightFin6);


        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.rightFin6.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.0873F, -0.0436F, -0.1745F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 36, 23, -5.4346F, 0.0F, -1.5014F, 6, 0, 3, 0.0F, true));

        this.leftLeg4 = new AdvancedModelRenderer(this);
        this.leftLeg4.setRotationPoint(3.0F, 1.0F, -2.8F);
        this.Pambdelurion.addChild(leftLeg4);


        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.leftLeg4.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.0F, 0.0873F, 0.2618F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 29, 47, 0.0F, -1.0F, -1.0F, 3, 1, 2, 0.0F, false));

        this.rightLeg4 = new AdvancedModelRenderer(this);
        this.rightLeg4.setRotationPoint(-3.0F, 1.0F, -2.8F);
        this.Pambdelurion.addChild(rightLeg4);


        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.rightLeg4.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.0F, -0.0873F, -0.2618F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 29, 47, -3.0F, -1.0F, -1.0F, 3, 1, 2, 0.0F, true));

        this.leftLeg5 = new AdvancedModelRenderer(this);
        this.leftLeg5.setRotationPoint(3.1F, 1.0F, -0.05F);
        this.Pambdelurion.addChild(leftLeg5);


        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.leftLeg5.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.0F, 0.0436F, 0.2618F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 29, 47, 0.0F, -1.0F, -1.0F, 3, 1, 2, 0.0F, false));

        this.rightLeg5 = new AdvancedModelRenderer(this);
        this.rightLeg5.setRotationPoint(-3.1F, 1.0F, -0.05F);
        this.Pambdelurion.addChild(rightLeg5);


        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.rightLeg5.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 0.0F, -0.0436F, -0.2618F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 29, 47, -3.0F, -1.0F, -1.0F, 3, 1, 2, 0.0F, true));

        this.leftLeg6 = new AdvancedModelRenderer(this);
        this.leftLeg6.setRotationPoint(3.05F, 1.0F, 2.5F);
        this.Pambdelurion.addChild(leftLeg6);


        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.leftLeg6.addChild(cube_r11);
        this.setRotateAngle(cube_r11, 0.0F, -0.0436F, 0.2618F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 29, 47, 0.0F, -1.0F, -1.0F, 3, 1, 2, 0.0F, false));

        this.rightLeg6 = new AdvancedModelRenderer(this);
        this.rightLeg6.setRotationPoint(-3.05F, 1.0F, 2.5F);
        this.Pambdelurion.addChild(rightLeg6);


        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.rightLeg6.addChild(cube_r12);
        this.setRotateAngle(cube_r12, 0.0F, 0.0436F, -0.2618F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 29, 47, -3.0F, -1.0F, -1.0F, 3, 1, 2, 0.0F, true));

        this.tail1 = new AdvancedModelRenderer(this);
        this.tail1.setRotationPoint(0.0F, 0.0F, 4.0F);
        this.Pambdelurion.addChild(tail1);
        this.tail1.cubeList.add(new ModelBox(tail1, 0, 11, -3.5F, -1.0F, -1.0F, 7, 2, 6, 0.03F, false));

        this.leftFin7 = new AdvancedModelRenderer(this);
        this.leftFin7.setRotationPoint(3.5F, -0.4F, 1.0F);
        this.tail1.addChild(leftFin7);


        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.leftFin7.addChild(cube_r13);
        this.setRotateAngle(cube_r13, 0.0873F, -0.0436F, 0.1745F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 30, 31, -0.3846F, 0.05F, -1.5014F, 6, 0, 3, 0.0F, false));

        this.rightFin7 = new AdvancedModelRenderer(this);
        this.rightFin7.setRotationPoint(-3.5F, -0.4F, 1.0F);
        this.tail1.addChild(rightFin7);


        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.rightFin7.addChild(cube_r14);
        this.setRotateAngle(cube_r14, 0.0873F, 0.0436F, -0.1745F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 30, 31, -5.6154F, 0.05F, -1.5014F, 6, 0, 3, 0.0F, true));

        this.leftFin8 = new AdvancedModelRenderer(this);
        this.leftFin8.setRotationPoint(3.5F, -0.35F, 3.5F);
        this.tail1.addChild(leftFin8);


        this.cube_r15 = new AdvancedModelRenderer(this);
        this.cube_r15.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.leftFin8.addChild(cube_r15);
        this.setRotateAngle(cube_r15, 0.0873F, -0.1309F, 0.1745F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 31, 35, -1.3042F, 0.0F, -1.5128F, 6, 0, 3, 0.0F, false));

        this.rightFin8 = new AdvancedModelRenderer(this);
        this.rightFin8.setRotationPoint(-3.5F, -0.35F, 3.5F);
        this.tail1.addChild(rightFin8);


        this.cube_r16 = new AdvancedModelRenderer(this);
        this.cube_r16.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.rightFin8.addChild(cube_r16);
        this.setRotateAngle(cube_r16, 0.0873F, 0.1309F, -0.1745F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 31, 35, -4.6958F, 0.0F, -1.5128F, 6, 0, 3, 0.0F, true));

        this.leftLeg7 = new AdvancedModelRenderer(this);
        this.leftLeg7.setRotationPoint(2.8F, 1.0F, 1.0F);
        this.tail1.addChild(leftLeg7);


        this.cube_r17 = new AdvancedModelRenderer(this);
        this.cube_r17.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.leftLeg7.addChild(cube_r17);
        this.setRotateAngle(cube_r17, 0.0F, -0.1309F, 0.2618F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 29, 47, 0.0F, -1.0F, -1.0F, 3, 1, 2, 0.0F, false));

        this.rightLeg7 = new AdvancedModelRenderer(this);
        this.rightLeg7.setRotationPoint(-2.8F, 1.0F, 1.0F);
        this.tail1.addChild(rightLeg7);


        this.cube_r18 = new AdvancedModelRenderer(this);
        this.cube_r18.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.rightLeg7.addChild(cube_r18);
        this.setRotateAngle(cube_r18, 0.0F, 0.1309F, -0.2618F);
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 29, 47, -3.0F, -1.0F, -1.0F, 3, 1, 2, 0.0F, true));

        this.leftLeg8 = new AdvancedModelRenderer(this);
        this.leftLeg8.setRotationPoint(2.5F, 1.0F, 3.5F);
        this.tail1.addChild(leftLeg8);


        this.cube_r19 = new AdvancedModelRenderer(this);
        this.cube_r19.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.leftLeg8.addChild(cube_r19);
        this.setRotateAngle(cube_r19, 0.0F, -0.2182F, 0.3054F);
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 29, 47, -0.25F, -1.0F, -1.0F, 3, 1, 2, 0.0F, false));

        this.rightLeg8 = new AdvancedModelRenderer(this);
        this.rightLeg8.setRotationPoint(-2.5F, 1.0F, 3.5F);
        this.tail1.addChild(rightLeg8);


        this.cube_r20 = new AdvancedModelRenderer(this);
        this.cube_r20.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.rightLeg8.addChild(cube_r20);
        this.setRotateAngle(cube_r20, 0.0F, 0.2182F, -0.3054F);
        this.cube_r20.cubeList.add(new ModelBox(cube_r20, 29, 47, -2.75F, -1.0F, -1.0F, 3, 1, 2, 0.0F, true));

        this.tail2 = new AdvancedModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, 0.0F, 5.0F);
        this.tail1.addChild(tail2);
        this.tail2.cubeList.add(new ModelBox(tail2, 25, 0, -3.0F, -1.0F, -1.0F, 6, 2, 3, 0.02F, false));

        this.leftFin9 = new AdvancedModelRenderer(this);
        this.leftFin9.setRotationPoint(3.0F, -0.35F, 0.15F);
        this.tail2.addChild(leftFin9);


        this.cube_r21 = new AdvancedModelRenderer(this);
        this.cube_r21.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.leftFin9.addChild(cube_r21);
        this.setRotateAngle(cube_r21, 0.0873F, -0.3491F, 0.1745F);
        this.cube_r21.cubeList.add(new ModelBox(cube_r21, 40, 27, -0.6917F, 0.0F, -1.3339F, 5, 0, 3, 0.0F, false));

        this.rightFin9 = new AdvancedModelRenderer(this);
        this.rightFin9.setRotationPoint(-3.0F, -0.35F, 0.15F);
        this.tail2.addChild(rightFin9);


        this.cube_r22 = new AdvancedModelRenderer(this);
        this.cube_r22.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.rightFin9.addChild(cube_r22);
        this.setRotateAngle(cube_r22, 0.0873F, 0.3491F, -0.1745F);
        this.cube_r22.cubeList.add(new ModelBox(cube_r22, 40, 27, -4.3083F, 0.0F, -1.3339F, 5, 0, 3, 0.0F, true));

        this.leftLeg9 = new AdvancedModelRenderer(this);
        this.leftLeg9.setRotationPoint(2.05F, 1.0F, 0.6F);
        this.tail2.addChild(leftLeg9);


        this.cube_r23 = new AdvancedModelRenderer(this);
        this.cube_r23.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.leftLeg9.addChild(cube_r23);
        this.setRotateAngle(cube_r23, 0.0F, -0.2618F, 0.3054F);
        this.cube_r23.cubeList.add(new ModelBox(cube_r23, 29, 47, -0.25F, -1.0F, -1.0F, 3, 1, 2, 0.0F, false));

        this.rightLeg9 = new AdvancedModelRenderer(this);
        this.rightLeg9.setRotationPoint(-2.05F, 1.0F, 0.6F);
        this.tail2.addChild(rightLeg9);


        this.cube_r24 = new AdvancedModelRenderer(this);
        this.cube_r24.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.rightLeg9.addChild(cube_r24);
        this.setRotateAngle(cube_r24, 0.0F, 0.2618F, -0.3054F);
        this.cube_r24.cubeList.add(new ModelBox(cube_r24, 29, 47, -2.75F, -1.0F, -1.0F, 3, 1, 2, 0.0F, true));

        this.tail3 = new AdvancedModelRenderer(this);
        this.tail3.setRotationPoint(0.0F, 0.0F, 2.0F);
        this.tail2.addChild(tail3);
        this.tail3.cubeList.add(new ModelBox(tail3, 16, 38, -2.5F, -1.0F, -1.0F, 5, 2, 3, 0.01F, false));

        this.leftFin10 = new AdvancedModelRenderer(this);
        this.leftFin10.setRotationPoint(2.5F, -0.35F, 0.8F);
        this.tail3.addChild(leftFin10);


        this.cube_r25 = new AdvancedModelRenderer(this);
        this.cube_r25.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.leftFin10.addChild(cube_r25);
        this.setRotateAngle(cube_r25, 0.0436F, -0.3491F, 0.1745F);
        this.cube_r25.cubeList.add(new ModelBox(cube_r25, 39, 44, -0.5019F, 0.0F, -1.0261F, 4, 0, 2, 0.0F, false));

        this.rightFin10 = new AdvancedModelRenderer(this);
        this.rightFin10.setRotationPoint(-2.5F, -0.35F, 0.8F);
        this.tail3.addChild(rightFin10);


        this.cube_r26 = new AdvancedModelRenderer(this);
        this.cube_r26.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.rightFin10.addChild(cube_r26);
        this.setRotateAngle(cube_r26, 0.0436F, 0.3491F, -0.1745F);
        this.cube_r26.cubeList.add(new ModelBox(cube_r26, 39, 44, -3.4981F, 0.0F, -1.0261F, 4, 0, 2, 0.0F, true));

        this.leftLeg10 = new AdvancedModelRenderer(this);
        this.leftLeg10.setRotationPoint(1.65F, 1.0F, 0.45F);
        this.tail3.addChild(leftLeg10);


        this.cube_r27 = new AdvancedModelRenderer(this);
        this.cube_r27.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.leftLeg10.addChild(cube_r27);
        this.setRotateAngle(cube_r27, 0.0F, -0.3054F, 0.3491F);
        this.cube_r27.cubeList.add(new ModelBox(cube_r27, 40, 47, -0.4F, -1.0F, -0.5F, 3, 1, 1, 0.0F, false));

        this.rightLeg10 = new AdvancedModelRenderer(this);
        this.rightLeg10.setRotationPoint(-1.65F, 1.0F, 0.45F);
        this.tail3.addChild(rightLeg10);


        this.cube_r28 = new AdvancedModelRenderer(this);
        this.cube_r28.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.rightLeg10.addChild(cube_r28);
        this.setRotateAngle(cube_r28, 0.0F, 0.3054F, -0.3491F);
        this.cube_r28.cubeList.add(new ModelBox(cube_r28, 40, 47, -2.6F, -1.0F, -0.5F, 3, 1, 1, 0.0F, true));

        this.tail4 = new AdvancedModelRenderer(this);
        this.tail4.setRotationPoint(0.0F, 0.0F, 2.0F);
        this.tail3.addChild(tail4);
        this.tail4.cubeList.add(new ModelBox(tail4, 0, 41, -1.5F, -1.0F, -1.5F, 3, 2, 3, -0.01F, false));
        this.tail4.cubeList.add(new ModelBox(tail4, 49, 4, -1.0F, -0.5F, 1.0F, 2, 1, 1, -0.01F, false));

        this.leftFin11 = new AdvancedModelRenderer(this);
        this.leftFin11.setRotationPoint(1.5F, -0.35F, 0.4F);
        this.tail4.addChild(leftFin11);


        this.cube_r29 = new AdvancedModelRenderer(this);
        this.cube_r29.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.leftFin11.addChild(cube_r29);
        this.setRotateAngle(cube_r29, 0.0436F, -0.3927F, 0.1745F);
        this.cube_r29.cubeList.add(new ModelBox(cube_r29, 26, 44, -0.7863F, 0.0F, -1.1732F, 4, 0, 2, 0.0F, false));

        this.rightFin11 = new AdvancedModelRenderer(this);
        this.rightFin11.setRotationPoint(-1.5F, -0.35F, 0.4F);
        this.tail4.addChild(rightFin11);


        this.cube_r30 = new AdvancedModelRenderer(this);
        this.cube_r30.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.rightFin11.addChild(cube_r30);
        this.setRotateAngle(cube_r30, 0.0436F, 0.3927F, -0.1745F);
        this.cube_r30.cubeList.add(new ModelBox(cube_r30, 26, 44, -3.2137F, 0.0F, -1.1732F, 4, 0, 2, 0.0F, true));

        this.leftFin12 = new AdvancedModelRenderer(this);
        this.leftFin12.setRotationPoint(0.5F, -0.25F, 1.5F);
        this.tail4.addChild(leftFin12);


        this.cube_r31 = new AdvancedModelRenderer(this);
        this.cube_r31.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.leftFin12.addChild(cube_r31);
        this.setRotateAngle(cube_r31, -0.1745F, 0.2618F, 0.0F);
        this.cube_r31.cubeList.add(new ModelBox(cube_r31, 47, 48, -0.3709F, 0.0F, -0.0817F, 1, 0, 2, 0.0F, false));

        this.rightFin12 = new AdvancedModelRenderer(this);
        this.rightFin12.setRotationPoint(-0.5F, -0.25F, 1.5F);
        this.tail4.addChild(rightFin12);


        this.cube_r32 = new AdvancedModelRenderer(this);
        this.cube_r32.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.rightFin12.addChild(cube_r32);
        this.setRotateAngle(cube_r32, -0.1745F, -0.2618F, 0.0F);
        this.cube_r32.cubeList.add(new ModelBox(cube_r32, 47, 48, -0.6291F, 0.0F, -0.0817F, 1, 0, 2, 0.0F, true));

        this.leftLeg11 = new AdvancedModelRenderer(this);
        this.leftLeg11.setRotationPoint(1.25F, 1.0F, 0.25F);
        this.tail4.addChild(leftLeg11);


        this.cube_r33 = new AdvancedModelRenderer(this);
        this.cube_r33.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.leftLeg11.addChild(cube_r33);
        this.setRotateAngle(cube_r33, 0.0F, -0.3927F, 0.48F);
        this.cube_r33.cubeList.add(new ModelBox(cube_r33, 40, 47, -1.15F, -1.0F, -0.5F, 3, 1, 1, 0.0F, false));

        this.rightLeg11 = new AdvancedModelRenderer(this);
        this.rightLeg11.setRotationPoint(-1.25F, 1.0F, 0.25F);
        this.tail4.addChild(rightLeg11);


        this.cube_r34 = new AdvancedModelRenderer(this);
        this.cube_r34.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.rightLeg11.addChild(cube_r34);
        this.setRotateAngle(cube_r34, 0.0F, 0.3927F, -0.48F);
        this.cube_r34.cubeList.add(new ModelBox(cube_r34, 40, 47, -1.85F, -1.0F, -0.5F, 3, 1, 1, 0.0F, true));

        this.neck1 = new AdvancedModelRenderer(this);
        this.neck1.setRotationPoint(0.0F, 0.0F, -4.0F);
        this.Pambdelurion.addChild(neck1);
        this.neck1.cubeList.add(new ModelBox(neck1, 0, 20, -3.5F, -1.0F, -4.0F, 7, 2, 5, 0.03F, false));

        this.leftFin2 = new AdvancedModelRenderer(this);
        this.leftFin2.setRotationPoint(3.5F, -0.35F, -3.5F);
        this.neck1.addChild(leftFin2);


        this.cube_r35 = new AdvancedModelRenderer(this);
        this.cube_r35.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.leftFin2.addChild(cube_r35);
        this.setRotateAngle(cube_r35, 0.0873F, 0.3491F, 0.1745F);
        this.cube_r35.cubeList.add(new ModelBox(cube_r35, 0, 34, -1.342F, 0.0F, -1.0603F, 5, 0, 2, 0.0F, false));

        this.rightFin2 = new AdvancedModelRenderer(this);
        this.rightFin2.setRotationPoint(-3.5F, -0.35F, -3.5F);
        this.neck1.addChild(rightFin2);


        this.cube_r36 = new AdvancedModelRenderer(this);
        this.cube_r36.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.rightFin2.addChild(cube_r36);
        this.setRotateAngle(cube_r36, 0.0873F, -0.3491F, -0.1745F);
        this.cube_r36.cubeList.add(new ModelBox(cube_r36, 0, 34, -3.658F, 0.0F, -1.0603F, 5, 0, 2, 0.0F, true));

        this.leftFin3 = new AdvancedModelRenderer(this);
        this.leftFin3.setRotationPoint(3.5F, -0.35F, -1.5F);
        this.neck1.addChild(leftFin3);


        this.cube_r37 = new AdvancedModelRenderer(this);
        this.cube_r37.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.leftFin3.addChild(cube_r37);
        this.setRotateAngle(cube_r37, 0.0873F, 0.2182F, 0.1745F);
        this.cube_r37.cubeList.add(new ModelBox(cube_r37, 33, 6, -1.3247F, 0.0F, -1.5356F, 6, 0, 3, 0.0F, false));

        this.rightFin3 = new AdvancedModelRenderer(this);
        this.rightFin3.setRotationPoint(-3.5F, -0.35F, -1.5F);
        this.neck1.addChild(rightFin3);


        this.cube_r38 = new AdvancedModelRenderer(this);
        this.cube_r38.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.rightFin3.addChild(cube_r38);
        this.setRotateAngle(cube_r38, 0.0873F, -0.2182F, -0.1745F);
        this.cube_r38.cubeList.add(new ModelBox(cube_r38, 33, 6, -4.6753F, 0.0F, -1.5356F, 6, 0, 3, 0.0F, true));

        this.leftLeg2 = new AdvancedModelRenderer(this);
        this.leftLeg2.setRotationPoint(2.5F, 1.0F, -3.15F);
        this.neck1.addChild(leftLeg2);


        this.cube_r39 = new AdvancedModelRenderer(this);
        this.cube_r39.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.leftLeg2.addChild(cube_r39);
        this.setRotateAngle(cube_r39, 0.0F, 0.2618F, 0.3491F);
        this.cube_r39.cubeList.add(new ModelBox(cube_r39, 40, 47, -0.5F, -1.0F, -0.55F, 3, 1, 1, 0.0F, false));

        this.rightLeg2 = new AdvancedModelRenderer(this);
        this.rightLeg2.setRotationPoint(-2.5F, 1.0F, -3.15F);
        this.neck1.addChild(rightLeg2);


        this.cube_r40 = new AdvancedModelRenderer(this);
        this.cube_r40.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.rightLeg2.addChild(cube_r40);
        this.setRotateAngle(cube_r40, 0.0F, -0.2618F, -0.3491F);
        this.cube_r40.cubeList.add(new ModelBox(cube_r40, 40, 47, -2.5F, -1.0F, -0.55F, 3, 1, 1, 0.0F, true));

        this.leftLeg3 = new AdvancedModelRenderer(this);
        this.leftLeg3.setRotationPoint(2.75F, 1.0F, -1.2F);
        this.neck1.addChild(leftLeg3);


        this.cube_r41 = new AdvancedModelRenderer(this);
        this.cube_r41.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.leftLeg3.addChild(cube_r41);
        this.setRotateAngle(cube_r41, 0.0F, 0.2182F, 0.3054F);
        this.cube_r41.cubeList.add(new ModelBox(cube_r41, 29, 47, -0.3F, -1.0F, -1.0F, 3, 1, 2, 0.0F, false));

        this.rightLeg3 = new AdvancedModelRenderer(this);
        this.rightLeg3.setRotationPoint(-2.75F, 1.0F, -1.2F);
        this.neck1.addChild(rightLeg3);


        this.cube_r42 = new AdvancedModelRenderer(this);
        this.cube_r42.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.rightLeg3.addChild(cube_r42);
        this.setRotateAngle(cube_r42, 0.0F, -0.2182F, -0.3054F);
        this.cube_r42.cubeList.add(new ModelBox(cube_r42, 29, 47, -2.7F, -1.0F, -1.0F, 3, 1, 2, 0.0F, true));

        this.neck2 = new AdvancedModelRenderer(this);
        this.neck2.setRotationPoint(0.0F, 0.0F, -4.0F);
        this.neck1.addChild(neck2);
        this.neck2.cubeList.add(new ModelBox(neck2, 23, 16, -3.0F, -1.0F, -3.0F, 6, 2, 4, 0.02F, false));

        this.leftFin1 = new AdvancedModelRenderer(this);
        this.leftFin1.setRotationPoint(3.0F, -0.45F, -1.5F);
        this.neck2.addChild(leftFin1);


        this.cube_r43 = new AdvancedModelRenderer(this);
        this.cube_r43.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.leftFin1.addChild(cube_r43);
        this.setRotateAngle(cube_r43, 0.0873F, 0.3927F, 0.1745F);
        this.cube_r43.cubeList.add(new ModelBox(cube_r43, 44, 18, -0.9784F, 0.0F, -0.8452F, 4, 0, 2, 0.0F, false));

        this.rightFin1 = new AdvancedModelRenderer(this);
        this.rightFin1.setRotationPoint(-3.0F, -0.45F, -1.5F);
        this.neck2.addChild(rightFin1);


        this.cube_r44 = new AdvancedModelRenderer(this);
        this.cube_r44.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.rightFin1.addChild(cube_r44);
        this.setRotateAngle(cube_r44, 0.0873F, -0.3927F, -0.1745F);
        this.cube_r44.cubeList.add(new ModelBox(cube_r44, 44, 18, -3.0216F, 0.0F, -0.8452F, 4, 0, 2, 0.0F, true));

        this.leftLeg1 = new AdvancedModelRenderer(this);
        this.leftLeg1.setRotationPoint(2.0F, 1.0F, -1.25F);
        this.neck2.addChild(leftLeg1);


        this.cube_r45 = new AdvancedModelRenderer(this);
        this.cube_r45.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.leftLeg1.addChild(cube_r45);
        this.setRotateAngle(cube_r45, 0.0F, 0.2618F, 0.3927F);
        this.cube_r45.cubeList.add(new ModelBox(cube_r45, 40, 47, -0.75F, -1.0F, -0.5F, 3, 1, 1, 0.0F, false));

        this.rightLeg1 = new AdvancedModelRenderer(this);
        this.rightLeg1.setRotationPoint(-2.0F, 1.0F, -1.25F);
        this.neck2.addChild(rightLeg1);


        this.cube_r46 = new AdvancedModelRenderer(this);
        this.cube_r46.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.rightLeg1.addChild(cube_r46);
        this.setRotateAngle(cube_r46, 0.0F, -0.2618F, -0.3927F);
        this.cube_r46.cubeList.add(new ModelBox(cube_r46, 40, 47, -2.25F, -1.0F, -0.5F, 3, 1, 1, 0.0F, true));

        this.head = new AdvancedModelRenderer(this);
        this.head.setRotationPoint(0.0F, 0.25F, -3.0F);
        this.neck2.addChild(head);
        this.head.cubeList.add(new ModelBox(head, 18, 47, -2.0F, -1.25F, -4.0F, 4, 2, 1, 0.0F, false));
        this.head.cubeList.add(new ModelBox(head, 21, 24, -2.5F, -1.25F, -3.0F, 5, 2, 4, 0.01F, false));
        this.head.cubeList.add(new ModelBox(head, 0, 11, 1.75F, -0.15F, -1.0F, 1, 1, 1, 0.0F, false));
        this.head.cubeList.add(new ModelBox(head, 0, 11, -2.75F, -0.15F, -1.0F, 1, 1, 1, 0.0F, true));

        this.cube_r47 = new AdvancedModelRenderer(this);
        this.cube_r47.setRotationPoint(-1.3512F, 0.75F, -0.8754F);
        this.head.addChild(cube_r47);
        this.setRotateAngle(cube_r47, -0.1745F, 2.3998F, 0.0F);
        this.cube_r47.cubeList.add(new ModelBox(cube_r47, 0, 14, -0.5F, 0.0F, 0.0F, 1, 0, 1, 0.0F, true));

        this.cube_r48 = new AdvancedModelRenderer(this);
        this.cube_r48.setRotationPoint(-0.8514F, 0.75F, -3.5074F);
        this.head.addChild(cube_r48);
        this.setRotateAngle(cube_r48, -0.1745F, 0.6545F, 0.0F);
        this.cube_r48.cubeList.add(new ModelBox(cube_r48, 0, 14, -0.5F, 0.0F, 0.0F, 1, 0, 1, 0.0F, true));

        this.cube_r49 = new AdvancedModelRenderer(this);
        this.cube_r49.setRotationPoint(-1.7026F, 0.75F, -2.2829F);
        this.head.addChild(cube_r49);
        this.setRotateAngle(cube_r49, 0.0F, 1.5708F, 0.1745F);
        this.cube_r49.cubeList.add(new ModelBox(cube_r49, 0, 6, -0.5F, 0.0F, 0.0F, 1, 0, 1, 0.0F, true));

        this.cube_r50 = new AdvancedModelRenderer(this);
        this.cube_r50.setRotationPoint(1.7026F, 0.75F, -2.2829F);
        this.head.addChild(cube_r50);
        this.setRotateAngle(cube_r50, 0.0F, -1.5708F, -0.1745F);
        this.cube_r50.cubeList.add(new ModelBox(cube_r50, 0, 6, -0.5F, 0.0F, 0.0F, 1, 0, 1, 0.0F, false));

        this.cube_r51 = new AdvancedModelRenderer(this);
        this.cube_r51.setRotationPoint(1.3512F, 0.75F, -0.8754F);
        this.head.addChild(cube_r51);
        this.setRotateAngle(cube_r51, -0.1745F, -2.3998F, 0.0F);
        this.cube_r51.cubeList.add(new ModelBox(cube_r51, 0, 14, -0.5F, 0.0F, 0.0F, 1, 0, 1, 0.0F, false));

        this.cube_r52 = new AdvancedModelRenderer(this);
        this.cube_r52.setRotationPoint(0.8514F, 0.75F, -3.5074F);
        this.head.addChild(cube_r52);
        this.setRotateAngle(cube_r52, -0.1745F, -0.6545F, 0.0F);
        this.cube_r52.cubeList.add(new ModelBox(cube_r52, 0, 14, -0.5F, 0.0F, 0.0F, 1, 0, 1, 0.0F, false));

        this.cube_r53 = new AdvancedModelRenderer(this);
        this.cube_r53.setRotationPoint(-0.05F, 0.0F, -4.0F);
        this.head.addChild(cube_r53);
        this.setRotateAngle(cube_r53, 0.0F, 0.1309F, 0.0F);
        this.cube_r53.cubeList.add(new ModelBox(cube_r53, 7, 47, -1.0F, -1.0F, -2.0F, 1, 0, 2, 0.0F, true));

        this.cube_r54 = new AdvancedModelRenderer(this);
        this.cube_r54.setRotationPoint(-1.15F, 0.0F, -4.0F);
        this.head.addChild(cube_r54);
        this.setRotateAngle(cube_r54, 0.0F, 0.2618F, 0.0F);
        this.cube_r54.cubeList.add(new ModelBox(cube_r54, 0, 3, -1.0F, -1.0F, -1.0F, 1, 0, 2, 0.0F, true));

        this.cube_r55 = new AdvancedModelRenderer(this);
        this.cube_r55.setRotationPoint(1.15F, 0.0F, -4.0F);
        this.head.addChild(cube_r55);
        this.setRotateAngle(cube_r55, 0.0F, -0.2618F, 0.0F);
        this.cube_r55.cubeList.add(new ModelBox(cube_r55, 0, 3, 0.0F, -1.0F, -1.0F, 1, 0, 2, 0.0F, false));

        this.cube_r56 = new AdvancedModelRenderer(this);
        this.cube_r56.setRotationPoint(0.05F, 0.0F, -4.0F);
        this.head.addChild(cube_r56);
        this.setRotateAngle(cube_r56, 0.0F, -0.1309F, 0.0F);
        this.cube_r56.cubeList.add(new ModelBox(cube_r56, 7, 47, 0.0F, -1.0F, -2.0F, 1, 0, 2, 0.0F, false));

        this.leftAppendage1 = new AdvancedModelRenderer(this);
        this.leftAppendage1.setRotationPoint(2.5F, 0.0F, -1.0F);
        this.head.addChild(leftAppendage1);
        this.setRotateAngle(leftAppendage1, 0.0873F, 0.3927F, 0.0873F);
        this.leftAppendage1.cubeList.add(new ModelBox(leftAppendage1, 15, 31, -1.0F, -1.0F, -2.0F, 5, 1, 4, 0.0F, false));
        this.leftAppendage1.cubeList.add(new ModelBox(leftAppendage1, 0, 28, -1.0F, -0.5F, -2.0F, 5, 1, 4, -0.01F, false));

        this.cube_r57 = new AdvancedModelRenderer(this);
        this.cube_r57.setRotationPoint(0.25F, 0.2F, -2.0F);
        this.leftAppendage1.addChild(cube_r57);
        this.setRotateAngle(cube_r57, 0.0F, -0.2618F, 0.0F);
        this.cube_r57.cubeList.add(new ModelBox(cube_r57, 0, 0, 0.0F, 0.1F, -1.5F, 1, 0, 2, 0.0F, false));
        this.cube_r57.cubeList.add(new ModelBox(cube_r57, 0, 0, 0.0F, -1.0F, -1.5F, 1, 0, 2, 0.0F, false));

        this.cube_r58 = new AdvancedModelRenderer(this);
        this.cube_r58.setRotationPoint(1.75F, 0.2F, -2.0F);
        this.leftAppendage1.addChild(cube_r58);
        this.setRotateAngle(cube_r58, 0.0F, -0.2618F, 0.0F);
        this.cube_r58.cubeList.add(new ModelBox(cube_r58, 38, 50, -0.25F, 0.1F, -1.9F, 1, 0, 2, 0.0F, false));
        this.cube_r58.cubeList.add(new ModelBox(cube_r58, 38, 50, -0.25F, -1.0F, -1.9F, 1, 0, 2, 0.0F, false));

        this.cube_r59 = new AdvancedModelRenderer(this);
        this.cube_r59.setRotationPoint(3.25F, 0.2F, -2.0F);
        this.leftAppendage1.addChild(cube_r59);
        this.setRotateAngle(cube_r59, 0.0F, -0.2182F, 0.0F);
        this.cube_r59.cubeList.add(new ModelBox(cube_r59, 47, 32, -0.5F, 0.1F, -2.5F, 1, 0, 3, 0.0F, false));
        this.cube_r59.cubeList.add(new ModelBox(cube_r59, 47, 32, -0.5F, -1.0F, -2.5F, 1, 0, 3, 0.0F, false));

        this.leftAppendage2 = new AdvancedModelRenderer(this);
        this.leftAppendage2.setRotationPoint(4.0F, -0.25F, -0.5F);
        this.leftAppendage1.addChild(leftAppendage2);
        this.setRotateAngle(leftAppendage2, 0.0F, 0.3927F, 0.0F);
        this.leftAppendage2.cubeList.add(new ModelBox(leftAppendage2, 33, 39, -1.0F, -0.5F, -1.5F, 5, 1, 3, 0.0F, false));

        this.cube_r60 = new AdvancedModelRenderer(this);
        this.cube_r60.setRotationPoint(0.75F, 0.55F, -1.5F);
        this.leftAppendage2.addChild(cube_r60);
        this.setRotateAngle(cube_r60, 0.0F, -0.5061F, 0.0F);
        this.cube_r60.cubeList.add(new ModelBox(cube_r60, 47, 36, -0.0111F, -0.1493F, -2.9906F, 1, 0, 3, 0.0F, false));

        this.cube_r61 = new AdvancedModelRenderer(this);
        this.cube_r61.setRotationPoint(2.25F, 0.55F, -1.5F);
        this.leftAppendage2.addChild(cube_r61);
        this.setRotateAngle(cube_r61, 0.0F, -0.3927F, 0.0F);
        this.cube_r61.cubeList.add(new ModelBox(cube_r61, 0, 47, -0.0081F, -0.1495F, -3.4946F, 1, 0, 4, 0.0F, false));

        this.cube_r62 = new AdvancedModelRenderer(this);
        this.cube_r62.setRotationPoint(2.25F, -0.25F, -1.5F);
        this.leftAppendage2.addChild(cube_r62);
        this.setRotateAngle(cube_r62, 0.0F, -0.3927F, 0.0F);
        this.cube_r62.cubeList.add(new ModelBox(cube_r62, 0, 47, -0.0081F, -0.1495F, -3.4946F, 1, 0, 4, 0.0F, false));

        this.cube_r63 = new AdvancedModelRenderer(this);
        this.cube_r63.setRotationPoint(0.75F, -0.25F, -1.5F);
        this.leftAppendage2.addChild(cube_r63);
        this.setRotateAngle(cube_r63, 0.0F, -0.5061F, 0.0F);
        this.cube_r63.cubeList.add(new ModelBox(cube_r63, 47, 36, -0.0111F, -0.1493F, -2.9906F, 1, 0, 3, 0.0F, false));

        this.leftAppendage3 = new AdvancedModelRenderer(this);
        this.leftAppendage3.setRotationPoint(3.95F, 0.5F, -0.5F);
        this.leftAppendage2.addChild(leftAppendage3);
        this.setRotateAngle(leftAppendage3, 0.0F, 0.3927F, 0.0F);
        this.leftAppendage3.cubeList.add(new ModelBox(leftAppendage3, 44, 0, -1.0F, -1.0F, -1.0F, 4, 1, 2, -0.01F, false));

        this.cube_r64 = new AdvancedModelRenderer(this);
        this.cube_r64.setRotationPoint(-0.2F, -0.75F, -1.0F);
        this.leftAppendage3.addChild(cube_r64);
        this.setRotateAngle(cube_r64, 0.0F, -0.7854F, 0.0F);
        this.cube_r64.cubeList.add(new ModelBox(cube_r64, 11, 47, 0.0F, 0.64F, -4.0F, 1, 0, 4, 0.0F, false));
        this.cube_r64.cubeList.add(new ModelBox(cube_r64, 11, 47, 0.0F, -0.14F, -4.0F, 1, 0, 4, 0.0F, false));

        this.leftSpine1 = new AdvancedModelRenderer(this);
        this.leftSpine1.setRotationPoint(1.2F, -0.7F, -0.9F);
        this.leftAppendage3.addChild(leftSpine1);
        this.setRotateAngle(leftSpine1, 0.0F, 0.3927F, 0.0F);
        this.leftSpine1.cubeList.add(new ModelBox(leftSpine1, 13, 44, 0.2701F, -0.0012F, -0.9865F, 4, 0, 2, 0.0F, false));

        this.leftSpine2 = new AdvancedModelRenderer(this);
        this.leftSpine2.setRotationPoint(2.45F, -0.6F, -0.5F);
        this.leftAppendage3.addChild(leftSpine2);
        this.setRotateAngle(leftSpine2, 0.0F, 0.2618F, 0.0F);


        this.cube_r65 = new AdvancedModelRenderer(this);
        this.cube_r65.setRotationPoint(-0.5F, -0.9F, 2.0F);
        this.leftSpine2.addChild(cube_r65);
        this.setRotateAngle(cube_r65, 0.0F, -0.0436F, 0.0F);
        this.cube_r65.cubeList.add(new ModelBox(cube_r65, 40, 14, 0.5F, 0.9F, -4.0F, 5, 0, 3, 0.0F, false));

        this.leftSpine3 = new AdvancedModelRenderer(this);
        this.leftSpine3.setRotationPoint(2.95F, -0.5F, 1.0F);
        this.leftAppendage3.addChild(leftSpine3);
        this.setRotateAngle(leftSpine3, 0.0F, 0.1745F, 0.0F);
        this.leftSpine3.cubeList.add(new ModelBox(leftSpine3, 21, 11, 0.0F, 0.0F, -3.0F, 7, 0, 3, 0.0F, false));

        this.leftSpine4 = new AdvancedModelRenderer(this);
        this.leftSpine4.setRotationPoint(2.45F, -0.4F, -0.5F);
        this.leftAppendage3.addChild(leftSpine4);
        this.setRotateAngle(leftSpine4, 0.0F, 0.2618F, 0.0F);


        this.cube_r66 = new AdvancedModelRenderer(this);
        this.cube_r66.setRotationPoint(-0.5F, -0.6F, 2.0F);
        this.leftSpine4.addChild(cube_r66);
        this.setRotateAngle(cube_r66, 0.0F, -0.0436F, 0.0F);
        this.cube_r66.cubeList.add(new ModelBox(cube_r66, 40, 14, 0.5F, 0.6F, -4.0F, 5, 0, 3, 0.0F, false));

        this.leftSpine5 = new AdvancedModelRenderer(this);
        this.leftSpine5.setRotationPoint(1.2F, -0.3F, -0.9F);
        this.leftAppendage3.addChild(leftSpine5);
        this.setRotateAngle(leftSpine5, 0.0F, 0.3927F, 0.0F);
        this.leftSpine5.cubeList.add(new ModelBox(leftSpine5, 13, 44, 0.2701F, -0.0012F, -0.9865F, 4, 0, 2, 0.0F, false));

        this.rightAppendage1 = new AdvancedModelRenderer(this);
        this.rightAppendage1.setRotationPoint(-2.5F, 0.0F, -1.0F);
        this.head.addChild(rightAppendage1);
        this.setRotateAngle(rightAppendage1, 0.0873F, -0.3927F, -0.0873F);
        this.rightAppendage1.cubeList.add(new ModelBox(rightAppendage1, 15, 31, -4.0F, -1.0F, -2.0F, 5, 1, 4, 0.0F, true));
        this.rightAppendage1.cubeList.add(new ModelBox(rightAppendage1, 0, 28, -4.0F, -0.5F, -2.0F, 5, 1, 4, -0.01F, true));

        this.cube_r67 = new AdvancedModelRenderer(this);
        this.cube_r67.setRotationPoint(-0.25F, 0.2F, -2.0F);
        this.rightAppendage1.addChild(cube_r67);
        this.setRotateAngle(cube_r67, 0.0F, 0.2618F, 0.0F);
        this.cube_r67.cubeList.add(new ModelBox(cube_r67, 0, 0, -1.0F, 0.1F, -1.5F, 1, 0, 2, 0.0F, true));
        this.cube_r67.cubeList.add(new ModelBox(cube_r67, 0, 0, -1.0F, -1.0F, -1.5F, 1, 0, 2, 0.0F, true));

        this.cube_r68 = new AdvancedModelRenderer(this);
        this.cube_r68.setRotationPoint(-1.75F, 0.2F, -2.0F);
        this.rightAppendage1.addChild(cube_r68);
        this.setRotateAngle(cube_r68, 0.0F, 0.2618F, 0.0F);
        this.cube_r68.cubeList.add(new ModelBox(cube_r68, 38, 50, -0.75F, 0.1F, -1.9F, 1, 0, 2, 0.0F, true));
        this.cube_r68.cubeList.add(new ModelBox(cube_r68, 38, 50, -0.75F, -1.0F, -1.9F, 1, 0, 2, 0.0F, true));

        this.cube_r69 = new AdvancedModelRenderer(this);
        this.cube_r69.setRotationPoint(-3.25F, 0.2F, -2.0F);
        this.rightAppendage1.addChild(cube_r69);
        this.setRotateAngle(cube_r69, 0.0F, 0.2182F, 0.0F);
        this.cube_r69.cubeList.add(new ModelBox(cube_r69, 47, 32, -0.5F, 0.1F, -2.5F, 1, 0, 3, 0.0F, true));
        this.cube_r69.cubeList.add(new ModelBox(cube_r69, 47, 32, -0.5F, -1.0F, -2.5F, 1, 0, 3, 0.0F, true));

        this.rightAppendage2 = new AdvancedModelRenderer(this);
        this.rightAppendage2.setRotationPoint(-4.0F, -0.25F, -0.5F);
        this.rightAppendage1.addChild(rightAppendage2);
        this.setRotateAngle(rightAppendage2, 0.0F, -0.3927F, 0.0F);
        this.rightAppendage2.cubeList.add(new ModelBox(rightAppendage2, 33, 39, -4.0F, -0.5F, -1.5F, 5, 1, 3, 0.0F, true));

        this.cube_r70 = new AdvancedModelRenderer(this);
        this.cube_r70.setRotationPoint(-0.75F, 0.55F, -1.5F);
        this.rightAppendage2.addChild(cube_r70);
        this.setRotateAngle(cube_r70, 0.0F, 0.5061F, 0.0F);
        this.cube_r70.cubeList.add(new ModelBox(cube_r70, 47, 36, -0.9889F, -0.1493F, -2.9906F, 1, 0, 3, 0.0F, true));

        this.cube_r71 = new AdvancedModelRenderer(this);
        this.cube_r71.setRotationPoint(-2.25F, 0.55F, -1.5F);
        this.rightAppendage2.addChild(cube_r71);
        this.setRotateAngle(cube_r71, 0.0F, 0.3927F, 0.0F);
        this.cube_r71.cubeList.add(new ModelBox(cube_r71, 0, 47, -0.9919F, -0.1495F, -3.4946F, 1, 0, 4, 0.0F, true));

        this.cube_r72 = new AdvancedModelRenderer(this);
        this.cube_r72.setRotationPoint(-2.25F, -0.25F, -1.5F);
        this.rightAppendage2.addChild(cube_r72);
        this.setRotateAngle(cube_r72, 0.0F, 0.3927F, 0.0F);
        this.cube_r72.cubeList.add(new ModelBox(cube_r72, 0, 47, -0.9919F, -0.1495F, -3.4946F, 1, 0, 4, 0.0F, true));

        this.cube_r73 = new AdvancedModelRenderer(this);
        this.cube_r73.setRotationPoint(-0.75F, -0.25F, -1.5F);
        this.rightAppendage2.addChild(cube_r73);
        this.setRotateAngle(cube_r73, 0.0F, 0.5061F, 0.0F);
        this.cube_r73.cubeList.add(new ModelBox(cube_r73, 47, 36, -0.9889F, -0.1493F, -2.9906F, 1, 0, 3, 0.0F, true));

        this.rightAppendage3 = new AdvancedModelRenderer(this);
        this.rightAppendage3.setRotationPoint(-3.95F, 0.5F, -0.5F);
        this.rightAppendage2.addChild(rightAppendage3);
        this.setRotateAngle(rightAppendage3, 0.0F, -0.3927F, 0.0F);
        this.rightAppendage3.cubeList.add(new ModelBox(rightAppendage3, 44, 0, -3.0F, -1.0F, -1.0F, 4, 1, 2, -0.01F, true));

        this.cube_r74 = new AdvancedModelRenderer(this);
        this.cube_r74.setRotationPoint(0.2F, -0.75F, -1.0F);
        this.rightAppendage3.addChild(cube_r74);
        this.setRotateAngle(cube_r74, 0.0F, 0.7854F, 0.0F);
        this.cube_r74.cubeList.add(new ModelBox(cube_r74, 11, 47, -1.0F, 0.64F, -4.0F, 1, 0, 4, 0.0F, true));
        this.cube_r74.cubeList.add(new ModelBox(cube_r74, 11, 47, -1.0F, -0.14F, -4.0F, 1, 0, 4, 0.0F, true));

        this.rightSpine1 = new AdvancedModelRenderer(this);
        this.rightSpine1.setRotationPoint(-1.2F, -0.7F, -0.9F);
        this.rightAppendage3.addChild(rightSpine1);
        this.setRotateAngle(rightSpine1, 0.0F, -0.3927F, 0.0F);
        this.rightSpine1.cubeList.add(new ModelBox(rightSpine1, 13, 44, -4.2701F, -0.0012F, -0.9865F, 4, 0, 2, 0.0F, true));

        this.rightSpine2 = new AdvancedModelRenderer(this);
        this.rightSpine2.setRotationPoint(-2.45F, -0.6F, -0.5F);
        this.rightAppendage3.addChild(rightSpine2);
        this.setRotateAngle(rightSpine2, 0.0F, -0.2618F, 0.0F);


        this.cube_r75 = new AdvancedModelRenderer(this);
        this.cube_r75.setRotationPoint(0.5F, -0.9F, 2.0F);
        this.rightSpine2.addChild(cube_r75);
        this.setRotateAngle(cube_r75, 0.0F, 0.0436F, 0.0F);
        this.cube_r75.cubeList.add(new ModelBox(cube_r75, 40, 14, -5.5F, 0.9F, -4.0F, 5, 0, 3, 0.0F, true));

        this.rightSpine3 = new AdvancedModelRenderer(this);
        this.rightSpine3.setRotationPoint(-2.95F, -0.5F, 1.0F);
        this.rightAppendage3.addChild(rightSpine3);
        this.setRotateAngle(rightSpine3, 0.0F, -0.1745F, 0.0F);
        this.rightSpine3.cubeList.add(new ModelBox(rightSpine3, 21, 11, -7.0F, 0.0F, -3.0F, 7, 0, 3, 0.0F, true));

        this.rightSpine4 = new AdvancedModelRenderer(this);
        this.rightSpine4.setRotationPoint(-2.45F, -0.4F, -0.5F);
        this.rightAppendage3.addChild(rightSpine4);
        this.setRotateAngle(rightSpine4, 0.0F, -0.2618F, 0.0F);


        this.cube_r76 = new AdvancedModelRenderer(this);
        this.cube_r76.setRotationPoint(0.5F, -0.6F, 2.0F);
        this.rightSpine4.addChild(cube_r76);
        this.setRotateAngle(cube_r76, 0.0F, 0.0436F, 0.0F);
        this.cube_r76.cubeList.add(new ModelBox(cube_r76, 40, 14, -5.5F, 0.6F, -4.0F, 5, 0, 3, 0.0F, true));

        this.rightSpine5 = new AdvancedModelRenderer(this);
        this.rightSpine5.setRotationPoint(-1.2F, -0.3F, -0.9F);
        this.rightAppendage3.addChild(rightSpine5);
        this.setRotateAngle(rightSpine5, 0.0F, -0.3927F, 0.0F);
        this.rightSpine5.cubeList.add(new ModelBox(rightSpine5, 13, 44, -4.2701F, -0.0012F, -0.9865F, 4, 0, 2, 0.0F, true));

        updateDefaultPose();
        animator = ModelAnimator.create();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        animate((IAnimatedEntity) entity, f, f1, f2, f3, f4, f5);
        //this.head.render(f5 * 0.2F);
        this.Pambdelurion.render(f5);
    }

    public void renderStaticFloor(float f) {
        resetToDefaultPose();
    }

    @Override
    public void renderStaticBook(float f) {
        //Rotations, positions and sizing:
        this.Pambdelurion.offsetY = -2.0F;
        this.Pambdelurion.offsetX = -0.25F;
        this.Pambdelurion.rotateAngleY = (float)Math.toRadians(200);
        this.Pambdelurion.rotateAngleX = (float)Math.toRadians(40);
        this.Pambdelurion.rotateAngleZ = (float)Math.toRadians(-8);
        this.Pambdelurion.scaleChildren = true;
        float scaler = 1.8F;
        this.Pambdelurion.setScale(scaler, scaler, scaler);
        //Start of pose:

        //End of pose, now render the model:
        this.Pambdelurion.render(f);
        //Reset rotations, positions and sizing:
        this.Pambdelurion.setScale(1.0F, 1.0F, 1.0F);
        this.Pambdelurion.scaleChildren = false;
        resetToDefaultPose();
    }

    public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }

    @Override
    public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
        super.setRotationAngles(f, f1, f2, f3, f4, f5, e);
        this.resetToDefaultPose();
        //this.head.offsetY = 1.075F;
        this.Pambdelurion.offsetY = 0F;

        AdvancedModelRenderer[] legsL = {this.leftLeg1, this.leftLeg2, this.leftLeg3, this.leftLeg4, this.leftLeg5, this.leftLeg6, this.leftLeg7, this.leftLeg8, this.leftLeg9, this.leftLeg10, this.leftLeg11};
        AdvancedModelRenderer[] legsR = {this.rightLeg1, this.rightLeg2, this.rightLeg3, this.rightLeg4, this.rightLeg5, this.rightLeg6, this.rightLeg7, this.rightLeg8, this.rightLeg9, this.rightLeg10, this.rightLeg11};
        AdvancedModelRenderer[] antennaL = {this.leftAppendage1, this.leftAppendage2, this.leftAppendage3};
        AdvancedModelRenderer[] antennaR = {this.rightAppendage1, this.rightAppendage2, this.rightAppendage3};
        AdvancedModelRenderer[] bodyF = {this.head, this.neck2, this.neck1};
        AdvancedModelRenderer[] bodyB = {this.tail1, this.tail2, this.tail3, this.tail4};
        AdvancedModelRenderer[] bodyA = {this.head, this.neck2, this.neck1, this.tail1, this.tail2, this.tail3, this.tail4};

        EntityPrehistoricFloraPambdelurion ee = (EntityPrehistoricFloraPambdelurion) e;
        ee.tailBuffer.applyChainSwingBuffer(false, bodyB);

        float fast = 1F;
        if (ee.getIsFast()) {
            fast = 1.6F;
        }

        this.swing(leftFin12, 1.1F, 0.11F, false, 0, 0F, f2, 0.7F);
        this.swing(rightFin12, 1.1F, -0.11F, false, 0, 0F, f2, 0.7F);

        if (f3 != 0.0 && ee.getAnimation() != ee.LOOK_ANIMATION) {

            //this.chainFlap(legsL, 0.5F * fast, 0.1F, -3, f2, 1);
            //this.chainFlap(legsR, 0.5F * fast, 0.1F, -3, f2, 1);

            float legFlap = 0.3F;
            float legFlapSpeed = 0.3F * fast;
            this.flap(leftLeg1, legFlapSpeed, -legFlap, false, 0, -legFlap, f2, legFlapSpeed);
            this.flap(rightLeg1, legFlapSpeed, legFlap, false, 0, legFlap, f2, legFlapSpeed);
            this.flap(leftLeg2, legFlapSpeed, -legFlap, false, 1.0F, -legFlap, f2, legFlapSpeed);
            this.flap(rightLeg2, legFlapSpeed, legFlap, false, 1.0F, legFlap, f2, legFlapSpeed);
            this.flap(leftLeg3, legFlapSpeed, -legFlap, false, 2.0F, -legFlap, f2, legFlapSpeed);
            this.flap(rightLeg3, legFlapSpeed, legFlap, false, 2.0F, legFlap, f2, legFlapSpeed);
            this.flap(leftLeg4, legFlapSpeed, -legFlap, false, 3.0F, -legFlap, f2, legFlapSpeed);
            this.flap(rightLeg4, legFlapSpeed, legFlap, false, 3.0F, legFlap, f2, legFlapSpeed);
            this.flap(leftLeg5, legFlapSpeed, -legFlap, false, 4.0F, -legFlap, f2, legFlapSpeed);
            this.flap(rightLeg5, legFlapSpeed, legFlap, false, 4.0F, legFlap, f2, legFlapSpeed);
            this.flap(leftLeg6, legFlapSpeed, -legFlap, false, 5.0F, -legFlap, f2, legFlapSpeed);
            this.flap(rightLeg6, legFlapSpeed, legFlap, false, 5.0F, legFlap, f2, legFlapSpeed);
            this.flap(leftLeg7, legFlapSpeed, -legFlap, false, 4.0F, -legFlap, f2, legFlapSpeed);
            this.flap(rightLeg7, legFlapSpeed, legFlap, false, 4.0F, legFlap, f2, legFlapSpeed);
            this.flap(leftLeg8, legFlapSpeed, -legFlap, false, 3.0F, -legFlap, f2, legFlapSpeed);
            this.flap(rightLeg8, legFlapSpeed, legFlap, false, 3.0F, legFlap, f2, legFlapSpeed);
            this.flap(leftLeg9, legFlapSpeed, -legFlap, false, 2.0F, -legFlap, f2, legFlapSpeed);
            this.flap(rightLeg9, legFlapSpeed, legFlap, false, 2.0F, legFlap, f2, legFlapSpeed);
            this.flap(leftLeg10, legFlapSpeed, -legFlap, false, 1.0F, -legFlap, f2, legFlapSpeed);
            this.flap(rightLeg10, legFlapSpeed, legFlap, false, 1.0F, legFlap, f2, legFlapSpeed);
            this.flap(leftLeg11, legFlapSpeed, -legFlap, false, 0.0F, -legFlap, f2, legFlapSpeed);
            this.flap(rightLeg11, legFlapSpeed, legFlap, false, 0.0F, legFlap, f2, legFlapSpeed);

//            float legSwing = 0.05F;
//            this.swing(leftLeg1, legFlapSpeed, -legSwing, false, 0, -legSwing, f2, legFlapSpeed);
//            this.swing(rightLeg1, legFlapSpeed, legSwing, false, 0, legSwing, f2, legFlapSpeed);
//            this.swing(leftLeg2, legFlapSpeed, -legSwing, false, 1.0F, -legSwing, f2, legFlapSpeed);
//            this.swing(rightLeg2, legFlapSpeed, legSwing, false, 1.0F, legSwing, f2, legFlapSpeed);
//            this.swing(leftLeg3, legFlapSpeed, -legSwing, false, 2.0F, -legSwing, f2, legFlapSpeed);
//            this.swing(rightLeg3, legFlapSpeed, legSwing, false, 2.0F, legSwing, f2, legFlapSpeed);
//            this.swing(leftLeg4, legFlapSpeed, -legSwing, false, 3.0F, -legSwing, f2, legFlapSpeed);
//            this.swing(rightLeg4, legFlapSpeed, legSwing, false, 3.0F, legSwing, f2, legFlapSpeed);
//            this.swing(leftLeg5, legFlapSpeed, -legSwing, false, 2.0F, -legSwing, f2, legFlapSpeed);
//            this.swing(rightLeg5, legFlapSpeed, legSwing, false, 2.0F, legSwing, f2, legFlapSpeed);
//            this.swing(leftLeg6, legFlapSpeed, -legSwing, false, 1.0F, -legSwing, f2, legFlapSpeed);
//            this.swing(rightLeg6, legFlapSpeed, legSwing, false, 1.0F, legSwing, f2, legFlapSpeed);
//            this.swing(leftLeg7, legFlapSpeed, -legSwing, false, 0.0F, -legSwing, f2, legFlapSpeed);
//            this.swing(rightLeg7, legFlapSpeed, legSwing, false, 0.0F, legSwing, f2, legFlapSpeed);
//            this.swing(leftLeg8, legFlapSpeed, -legSwing, false, 1.0F, -legSwing, f2, legFlapSpeed);
//            this.swing(rightLeg8, legFlapSpeed, legSwing, false, 1.0F, legSwing, f2, legFlapSpeed);
//            this.swing(leftLeg9, legFlapSpeed, -legSwing, false, 2.0F, -legSwing, f2, legFlapSpeed);
//            this.swing(rightLeg9, legFlapSpeed, legSwing, false, 2.0F, legSwing, f2, legFlapSpeed);
//            this.swing(leftLeg10, legFlapSpeed, -legSwing, false, 3.0F, -legSwing, f2, legFlapSpeed);
//            this.swing(rightLeg10, legFlapSpeed, legSwing, false, 3.0F, legSwing, f2, legFlapSpeed);
//            this.swing(leftLeg11, legFlapSpeed, -legSwing, false, 2.0F, -legSwing, f2, legFlapSpeed);
//            this.swing(rightLeg11, legFlapSpeed, legSwing, false, 2.0F, legSwing, f2, legFlapSpeed);

            if (ee.getAnimation() != ee.ATTACK_ANIMATION) {
                this.bob(Pambdelurion, 1F * fast, 0.05F, false, f2, 1);
                this.chainWave(bodyF, 0.4F * fast, 0.018f, 0.08 * fast, f2, 0.25F);
                this.chainWave(bodyB, 0.4F * fast, 0.018f, 0.08 * fast, f2, 0.25F);
                this.chainSwing(bodyA, 0.08F * fast, 0.02f * fast, 0.25, f2, 0.25F);
                this.chainSwing(bodyF, 0.08F * fast, 0.05F * fast, -1, f2, 0.5F);
                this.chainSwing(bodyB, 0.08F * fast, 0.05F * fast, 1, f2, 0.5F);
            }
        } else { //LOOK ANIMATION MIGHT BE RUNNING:
            if (f3 != 0) {
                float legFlap = 0.1F;
                float legFlapSpeed = 0.3F * fast;
                this.flap(leftLeg1, legFlapSpeed, -legFlap, true, 0, -legFlap, f2, legFlapSpeed);
                this.flap(rightLeg1, legFlapSpeed, legFlap, true, 0, legFlap, f2, legFlapSpeed);
                this.flap(leftLeg2, legFlapSpeed, -legFlap, true, 1.0F, -legFlap, f2, legFlapSpeed);
                this.flap(rightLeg2, legFlapSpeed, legFlap, true, 1.0F, legFlap, f2, legFlapSpeed);
                this.flap(leftLeg3, legFlapSpeed, -legFlap, true, 2.0F, -legFlap, f2, legFlapSpeed);
                this.flap(rightLeg3, legFlapSpeed, legFlap, true, 2.0F, legFlap, f2, legFlapSpeed);
                this.flap(leftLeg4, legFlapSpeed, -legFlap, true, 3.0F, -legFlap, f2, legFlapSpeed);
                this.flap(rightLeg4, legFlapSpeed, legFlap, true, 3.0F, legFlap, f2, legFlapSpeed);
                this.flap(leftLeg5, legFlapSpeed, -legFlap, true, 2.0F, -legFlap, f2, legFlapSpeed);
                this.flap(rightLeg5, legFlapSpeed, legFlap, true, 2.0F, legFlap, f2, legFlapSpeed);
                this.flap(leftLeg6, legFlapSpeed, -legFlap, true, 5.0F, -legFlap, f2, legFlapSpeed);
                this.flap(rightLeg6, legFlapSpeed, legFlap, true, 5.0F, legFlap, f2, legFlapSpeed);
                this.flap(leftLeg7, legFlapSpeed, -legFlap, true, 4.0F, -legFlap, f2, legFlapSpeed);
                this.flap(rightLeg7, legFlapSpeed, legFlap, true, 4.0F, legFlap, f2, legFlapSpeed);
                this.flap(leftLeg8, legFlapSpeed, -legFlap, true, 3.0F, -legFlap, f2, legFlapSpeed);
                this.flap(rightLeg8, legFlapSpeed, legFlap, true, 3.0F, legFlap, f2, legFlapSpeed);
                this.flap(leftLeg9, legFlapSpeed, -legFlap, true, 2.0F, -legFlap, f2, legFlapSpeed);
                this.flap(rightLeg9, legFlapSpeed, legFlap, true, 2.0F, legFlap, f2, legFlapSpeed);
                this.flap(leftLeg10, legFlapSpeed, -legFlap, true, 1.0F, -legFlap, f2, legFlapSpeed);
                this.flap(rightLeg10, legFlapSpeed, legFlap, true, 1.0F, legFlap, f2, legFlapSpeed);
                this.flap(leftLeg11, legFlapSpeed, -legFlap, true, 0.0F, -legFlap, f2, legFlapSpeed);
                this.flap(rightLeg11, legFlapSpeed, legFlap, true, 0.0F, legFlap, f2, legFlapSpeed);

//                float legSwing = 0.05F;
//                this.swing(leftLeg1, legFlapSpeed, -legSwing, false, 0, -legSwing, f2, legFlapSpeed);
//                this.swing(rightLeg1, legFlapSpeed, legSwing, false, 0, legSwing, f2, legFlapSpeed);
//                this.swing(leftLeg2, legFlapSpeed, -legSwing, false, 1.0F, -legSwing, f2, legFlapSpeed);
//                this.swing(rightLeg2, legFlapSpeed, legSwing, false, 1.0F, legSwing, f2, legFlapSpeed);
//                this.swing(leftLeg3, legFlapSpeed, -legSwing, false, 2.0F, -legSwing, f2, legFlapSpeed);
//                this.swing(rightLeg3, legFlapSpeed, legSwing, false, 2.0F, legSwing, f2, legFlapSpeed);
//                this.swing(leftLeg4, legFlapSpeed, -legSwing, false, 3.0F, -legSwing, f2, legFlapSpeed);
//                this.swing(rightLeg4, legFlapSpeed, legSwing, false, 3.0F, legSwing, f2, legFlapSpeed);
//                this.swing(leftLeg5, legFlapSpeed, -legSwing, false, 4.0F, -legSwing, f2, legFlapSpeed);
//                this.swing(rightLeg5, legFlapSpeed, legSwing, false, 4.0F, legSwing, f2, legFlapSpeed);
//                this.swing(leftLeg6, legFlapSpeed, -legSwing, false, 5.0F, -legSwing, f2, legFlapSpeed);
//                this.swing(rightLeg6, legFlapSpeed, legSwing, false, 5.0F, legSwing, f2, legFlapSpeed);
//                this.swing(leftLeg7, legFlapSpeed, -legSwing, false, 4.0F, -legSwing, f2, legFlapSpeed);
//                this.swing(rightLeg7, legFlapSpeed, legSwing, false, 4.0F, legSwing, f2, legFlapSpeed);
//                this.swing(leftLeg8, legFlapSpeed, -legSwing, false, 3.0F, -legSwing, f2, legFlapSpeed);
//                this.swing(rightLeg8, legFlapSpeed, legSwing, false, 3.0F, legSwing, f2, legFlapSpeed);
//                this.swing(leftLeg9, legFlapSpeed, -legSwing, false, 2.0F, -legSwing, f2, legFlapSpeed);
//                this.swing(rightLeg9, legFlapSpeed, legSwing, false, 2.0F, legSwing, f2, legFlapSpeed);
//                this.swing(leftLeg10, legFlapSpeed, -legSwing, false, 1.0F, -legSwing, f2, legFlapSpeed);
//                this.swing(rightLeg10, legFlapSpeed, legSwing, false, 1.0F, legSwing, f2, legFlapSpeed);
//                this.swing(leftLeg11, legFlapSpeed, -legSwing, false, 0.0F, -legSwing, f2, legFlapSpeed);
//                this.swing(rightLeg11, legFlapSpeed, legSwing, false, 0.0F, legSwing, f2, legFlapSpeed);
            }
        }

        float finFlap = 0.1F;
        float finFlapSpeed = 0.6F * (fast * 0.65F);
        this.flap(leftFin1, finFlapSpeed, -finFlap, false, 0, -finFlap, f2, finFlapSpeed);
        this.flap(rightFin1, finFlapSpeed, finFlap, false, 0, finFlap, f2, finFlapSpeed);
        this.flap(leftFin2, finFlapSpeed, -finFlap, false, 1.0F, -finFlap, f2, finFlapSpeed);
        this.flap(rightFin2, finFlapSpeed, finFlap, false, 1.0F, finFlap, f2, finFlapSpeed);
        this.flap(leftFin3, finFlapSpeed, -finFlap, false, 2.0F, -finFlap, f2, finFlapSpeed);
        this.flap(rightFin3, finFlapSpeed, finFlap, false, 2.0F, finFlap, f2, finFlapSpeed);
        this.flap(leftFin4, finFlapSpeed, -finFlap, false, 3.0F, -finFlap, f2, finFlapSpeed);
        this.flap(rightFin4, finFlapSpeed, finFlap, false, 3.0F, finFlap, f2, finFlapSpeed);
        this.flap(leftFin5, finFlapSpeed, -finFlap, false, 2.0F, -finFlap, f2, finFlapSpeed);
        this.flap(rightFin5, finFlapSpeed, finFlap, false, 2.0F, finFlap, f2, finFlapSpeed);
        this.flap(leftFin6, finFlapSpeed, -finFlap, false, 1.0F, -finFlap, f2, finFlapSpeed);
        this.flap(rightFin6, finFlapSpeed, finFlap, false, 1.0F, finFlap, f2, finFlapSpeed);
        this.flap(leftFin7, finFlapSpeed, -finFlap, false, 0.0F, -finFlap, f2, finFlapSpeed);
        this.flap(rightFin7, finFlapSpeed, finFlap, false, 0.0F, finFlap, f2, finFlapSpeed);
        this.flap(leftFin8, finFlapSpeed, -finFlap, false, 1.0F, -finFlap, f2, finFlapSpeed);
        this.flap(rightFin8, finFlapSpeed, finFlap, false, 1.0F, finFlap, f2, finFlapSpeed);
        this.flap(leftFin9, finFlapSpeed, -finFlap, false, 2.0F, -finFlap, f2, finFlapSpeed);
        this.flap(rightFin9, finFlapSpeed, finFlap, false, 2.0F, finFlap, f2, finFlapSpeed);
        this.flap(leftFin10, finFlapSpeed, -finFlap, false, 3.0F, -finFlap, f2, finFlapSpeed);
        this.flap(rightFin10, finFlapSpeed, finFlap, false, 3.0F, finFlap, f2, finFlapSpeed);
        this.flap(leftFin11, finFlapSpeed, -finFlap, false, 2.0F, -finFlap, f2, finFlapSpeed);
        this.flap(rightFin11, finFlapSpeed, finFlap, false, 2.0F, finFlap, f2, finFlapSpeed);

        if (ee.getAnimation() != ee.ATTACK_ANIMATION) {
            this.chainSwing(antennaL, 0.12F, -0.2F * fast, 0.3F * fast, f2, 0.7F * fast);
            this.chainSwing(antennaR, 0.12F, 0.2F * fast, 0.3F * fast, f2, 0.7F * fast);
        }

    }

    public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        EntityPrehistoricFloraPambdelurion e = (EntityPrehistoricFloraPambdelurion) entity;
        animator.update(entity);
        this.resetToDefaultPose();
        setRotationAngles(f, f1, f2, f3, f4, f5, (Entity) entity);

        //LOOK duration = 120
        animator.setAnimation(e.LOOK_ANIMATION);
        animator.startKeyframe(20);
        animator.rotate(this.neck1, (float) -Math.toRadians(17.5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.neck2, (float) -Math.toRadians(10), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.head, (float) -Math.toRadians(-15), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(10);
        animator.startKeyframe(20);
        animator.rotate(this.neck1, (float) -Math.toRadians(17.5), (float) Math.toRadians(-2.5), (float) Math.toRadians(0));
        animator.rotate(this.neck2, (float) -Math.toRadians(10), (float) Math.toRadians(-2.5), (float) Math.toRadians(0));
        animator.rotate(this.head, (float) -Math.toRadians(-15), (float) Math.toRadians(-7.5), (float) Math.toRadians(-15.0));
        animator.endKeyframe();
        animator.setStaticKeyframe(5);
        animator.startKeyframe(30);
        animator.rotate(this.neck1, (float) -Math.toRadians(17.5), (float) Math.toRadians(2.5), (float) Math.toRadians(0));
        animator.rotate(this.neck2, (float) -Math.toRadians(10), (float) Math.toRadians(2.5), (float) Math.toRadians(0));
        animator.rotate(this.head, (float) -Math.toRadians(-15), (float) Math.toRadians(7.5), (float) Math.toRadians(15.0));
        animator.endKeyframe();
        animator.setStaticKeyframe(5);
        animator.resetKeyframe(30);

        //ATTACK duration = 60
        animator.setAnimation(e.ATTACK_ANIMATION);
        animator.startKeyframe(5);
        animator.rotate(this.neck1, (float) -Math.toRadians(-5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.neck2, (float) -Math.toRadians(5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.head, (float) -Math.toRadians(12.5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.leftAppendage1, (float) Math.toRadians(0), (float) Math.toRadians(-12.5), (float) Math.toRadians(0));
        animator.rotate(this.rightAppendage1, (float) Math.toRadians(0), (float) Math.toRadians(12.5), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(5);

        animator.startKeyframe(5);
        animator.move(this.Pambdelurion, 0,0,1.0F);
        animator.rotate(this.neck1, (float) -Math.toRadians(2.5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.neck2, (float) -Math.toRadians(10), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.head, (float) -Math.toRadians(15), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.leftAppendage1, (float) Math.toRadians(0), (float) Math.toRadians(22.5), (float) Math.toRadians(0));
        animator.rotate(this.leftAppendage2, (float) Math.toRadians(0), (float) Math.toRadians(10.0), (float) Math.toRadians(0));
        animator.rotate(this.leftAppendage3, (float) Math.toRadians(0), (float) Math.toRadians(10.0), (float) Math.toRadians(0));
        animator.rotate(this.rightAppendage1, (float) Math.toRadians(0), (float) Math.toRadians(-22.5), (float) Math.toRadians(0));
        animator.rotate(this.rightAppendage2, (float) Math.toRadians(0), (float) Math.toRadians(-10.0), (float) Math.toRadians(0));
        animator.rotate(this.rightAppendage3, (float) Math.toRadians(0), (float) Math.toRadians(-10.0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(10);

        animator.startKeyframe(5);
        animator.move(this.Pambdelurion, 0,0,0.66F);
        animator.rotate(this.neck1, (float) -Math.toRadians(2.5), (float) Math.toRadians(10), (float) Math.toRadians(0));
        animator.rotate(this.neck2, (float) -Math.toRadians(10), (float) Math.toRadians(10), (float) Math.toRadians(0));
        animator.rotate(this.head, (float) -Math.toRadians(15), (float) Math.toRadians(10), (float) Math.toRadians(0));
        animator.rotate(this.leftAppendage1, (float) Math.toRadians(0), (float) Math.toRadians(22.5), (float) Math.toRadians(0));
        animator.rotate(this.leftAppendage2, (float) Math.toRadians(0), (float) Math.toRadians(10.0), (float) Math.toRadians(0));
        animator.rotate(this.leftAppendage3, (float) Math.toRadians(0), (float) Math.toRadians(10.0), (float) Math.toRadians(0));
        animator.rotate(this.rightAppendage1, (float) Math.toRadians(0), (float) Math.toRadians(-22.5), (float) Math.toRadians(0));
        animator.rotate(this.rightAppendage2, (float) Math.toRadians(0), (float) Math.toRadians(-10.0), (float) Math.toRadians(0));
        animator.rotate(this.rightAppendage3, (float) Math.toRadians(0), (float) Math.toRadians(-10.0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(5);

        animator.startKeyframe(5);
        animator.move(this.Pambdelurion, 0,0,0.33F);
        animator.rotate(this.neck1, (float) -Math.toRadians(2.5), (float) Math.toRadians(-10), (float) Math.toRadians(0));
        animator.rotate(this.neck2, (float) -Math.toRadians(10), (float) Math.toRadians(-10), (float) Math.toRadians(0));
        animator.rotate(this.head, (float) -Math.toRadians(15), (float) Math.toRadians(-10), (float) Math.toRadians(0));
        animator.rotate(this.leftAppendage1, (float) Math.toRadians(0), (float) Math.toRadians(22.5), (float) Math.toRadians(0));
        animator.rotate(this.leftAppendage2, (float) Math.toRadians(0), (float) Math.toRadians(10.0), (float) Math.toRadians(0));
        animator.rotate(this.leftAppendage3, (float) Math.toRadians(0), (float) Math.toRadians(10.0), (float) Math.toRadians(0));
        animator.rotate(this.rightAppendage1, (float) Math.toRadians(0), (float) Math.toRadians(-22.5), (float) Math.toRadians(0));
        animator.rotate(this.rightAppendage2, (float) Math.toRadians(0), (float) Math.toRadians(-10.0), (float) Math.toRadians(0));
        animator.rotate(this.rightAppendage3, (float) Math.toRadians(0), (float) Math.toRadians(-10.0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(5);

        animator.resetKeyframe(10);
    }
}
