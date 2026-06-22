package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.EntityPrehistoricFloraPalaeocampa;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelPalaeocampa extends ModelBasePalaeopedia {
    private final AdvancedModelRenderer body;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer cube_r6;
    private final AdvancedModelRenderer cube_r7;
    private final AdvancedModelRenderer cube_r8;
    private final AdvancedModelRenderer cube_r9;
    private final AdvancedModelRenderer cube_r10;
    private final AdvancedModelRenderer cube_r11;
    private final AdvancedModelRenderer cube_r12;
    private final AdvancedModelRenderer cube_r13;
    private final AdvancedModelRenderer cube_r14;
    private final AdvancedModelRenderer cube_r15;
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
    private final AdvancedModelRenderer cube_r40;
    private final AdvancedModelRenderer cube_r41;
    private final AdvancedModelRenderer cube_r42;
    private final AdvancedModelRenderer cube_r43;
    private final AdvancedModelRenderer cube_r44;
    private final AdvancedModelRenderer leftLeg3;
    private final AdvancedModelRenderer rightLeg3;
    private final AdvancedModelRenderer leftLeg4;
    private final AdvancedModelRenderer rightLeg4;
    private final AdvancedModelRenderer leftLeg5;
    private final AdvancedModelRenderer rightLeg5;
    private final AdvancedModelRenderer leftLeg6;
    private final AdvancedModelRenderer rightLeg6;
    private final AdvancedModelRenderer leftLeg7;
    private final AdvancedModelRenderer rightLeg7;
    private final AdvancedModelRenderer tail1;
    private final AdvancedModelRenderer cube_r45;
    private final AdvancedModelRenderer cube_r46;
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
    private final AdvancedModelRenderer leftLeg8;
    private final AdvancedModelRenderer rightLeg8;
    private final AdvancedModelRenderer tail2;
    private final AdvancedModelRenderer cube_r57;
    private final AdvancedModelRenderer cube_r58;
    private final AdvancedModelRenderer cube_r59;
    private final AdvancedModelRenderer cube_r60;
    private final AdvancedModelRenderer cube_r61;
    private final AdvancedModelRenderer cube_r62;
    private final AdvancedModelRenderer cube_r63;
    private final AdvancedModelRenderer cube_r64;
    private final AdvancedModelRenderer cube_r65;
    private final AdvancedModelRenderer cube_r66;
    private final AdvancedModelRenderer cube_r67;
    private final AdvancedModelRenderer cube_r68;
    private final AdvancedModelRenderer cube_r69;
    private final AdvancedModelRenderer cube_r70;
    private final AdvancedModelRenderer cube_r71;
    private final AdvancedModelRenderer cube_r72;
    private final AdvancedModelRenderer cube_r73;
    private final AdvancedModelRenderer cube_r74;
    private final AdvancedModelRenderer cube_r75;
    private final AdvancedModelRenderer cube_r76;
    private final AdvancedModelRenderer cube_r77;
    private final AdvancedModelRenderer cube_r78;
    private final AdvancedModelRenderer cube_r79;
    private final AdvancedModelRenderer cube_r80;
    private final AdvancedModelRenderer cube_r81;
    private final AdvancedModelRenderer cube_r82;
    private final AdvancedModelRenderer cube_r83;
    private final AdvancedModelRenderer cube_r84;
    private final AdvancedModelRenderer leftLeg9;
    private final AdvancedModelRenderer rightLeg9;
    private final AdvancedModelRenderer leftLeg10;
    private final AdvancedModelRenderer rightLeg10;
    private final AdvancedModelRenderer neck;
    private final AdvancedModelRenderer cube_r85;
    private final AdvancedModelRenderer cube_r86;
    private final AdvancedModelRenderer cube_r87;
    private final AdvancedModelRenderer cube_r88;
    private final AdvancedModelRenderer cube_r89;
    private final AdvancedModelRenderer cube_r90;
    private final AdvancedModelRenderer cube_r91;
    private final AdvancedModelRenderer cube_r92;
    private final AdvancedModelRenderer cube_r93;
    private final AdvancedModelRenderer cube_r94;
    private final AdvancedModelRenderer cube_r95;
    private final AdvancedModelRenderer cube_r96;
    private final AdvancedModelRenderer leftLeg2;
    private final AdvancedModelRenderer rightLeg2;
    private final AdvancedModelRenderer head;
    private final AdvancedModelRenderer cube_r97;
    private final AdvancedModelRenderer cube_r98;
    private final AdvancedModelRenderer cube_r99;
    private final AdvancedModelRenderer cube_r100;
    private final AdvancedModelRenderer cube_r101;
    private final AdvancedModelRenderer cube_r102;
    private final AdvancedModelRenderer cube_r103;
    private final AdvancedModelRenderer cube_r104;
    private final AdvancedModelRenderer cube_r105;
    private final AdvancedModelRenderer cube_r106;
    private final AdvancedModelRenderer cube_r107;
    private final AdvancedModelRenderer cube_r108;
    private final AdvancedModelRenderer leftAppendage;
    private final AdvancedModelRenderer rightAppendage;
    private final AdvancedModelRenderer leftAntenna;
    private final AdvancedModelRenderer rightAntenna;
    private final AdvancedModelRenderer leftLeg1;
    private final AdvancedModelRenderer rightLeg1;

    private ModelAnimator animator;

    public ModelPalaeocampa() {
        this.textureWidth = 32;
        this.textureHeight = 32;

        this.body = new AdvancedModelRenderer(this);
        this.body.setRotationPoint(0.0F, 20.0F, -4.0F);
        this.body.cubeList.add(new ModelBox(body, 0, 0, -1.5F, 0.0F, 0.0F, 3, 2, 8, 0.01F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(-0.5F, 0.25F, 7.5F);
        this.body.addChild(cube_r1);
        this.setRotateAngle(cube_r1, -0.1745F, 0.0F, -0.5236F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 18, 21, -0.5F, -2.0F, 0.0F, 1, 2, 0, 0.0F, true));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(-0.5F, 0.25F, 7.1F);
        this.body.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.0F, 0.0F, -0.2618F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 8, 15, -0.5F, -3.0F, 0.0F, 1, 3, 0, 0.0F, true));
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 8, 15, -0.5F, -3.0F, -1.75F, 1, 3, 0, 0.0F, true));
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 8, 15, -0.5F, -3.0F, -3.5F, 1, 3, 0, 0.0F, true));
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 8, 15, -0.5F, -3.0F, -5.25F, 1, 3, 0, 0.0F, true));
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 8, 15, -0.5F, -3.0F, -7.0F, 1, 3, 0, 0.0F, true));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(-0.5F, 0.25F, 7.0F);
        this.body.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.1745F, 0.0F, -0.5236F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 18, 21, -0.5F, -2.0F, 0.0F, 1, 2, 0, 0.0F, true));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(-0.5F, 0.25F, 7.4F);
        this.body.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.0F, 0.0F, -0.7854F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 8, 15, -0.5F, -3.0F, 0.0F, 1, 3, 0, 0.0F, true));
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 8, 15, -0.5F, -3.0F, -1.75F, 1, 3, 0, 0.0F, true));
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 8, 15, -0.5F, -3.0F, -3.5F, 1, 3, 0, 0.0F, true));
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 8, 15, -0.5F, -3.0F, -5.25F, 1, 3, 0, 0.0F, true));
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 8, 15, -0.5F, -3.0F, -7.0F, 1, 3, 0, 0.0F, true));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(-0.5F, 0.25F, 5.75F);
        this.body.addChild(cube_r5);
        this.setRotateAngle(cube_r5, -0.1745F, 0.0F, -0.5236F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 18, 21, -0.5F, -2.0F, 0.0F, 1, 2, 0, 0.0F, true));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(-0.5F, 0.25F, 5.25F);
        this.body.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.1745F, 0.0F, -0.5236F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 18, 21, -0.5F, -2.0F, 0.0F, 1, 2, 0, 0.0F, true));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(-0.5F, 0.25F, 4.0F);
        this.body.addChild(cube_r7);
        this.setRotateAngle(cube_r7, -0.1745F, 0.0F, -0.5236F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 18, 21, -0.5F, -2.0F, 0.0F, 1, 2, 0, 0.0F, true));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(-0.5F, 0.25F, 3.5F);
        this.body.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.1745F, 0.0F, -0.5236F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 18, 21, -0.5F, -2.0F, 0.0F, 1, 2, 0, 0.0F, true));

        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(-0.5F, 0.25F, 2.25F);
        this.body.addChild(cube_r9);
        this.setRotateAngle(cube_r9, -0.1745F, 0.0F, -0.5236F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 18, 21, -0.5F, -2.0F, 0.0F, 1, 2, 0, 0.0F, true));

        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(-0.5F, 0.25F, 1.75F);
        this.body.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 0.1745F, 0.0F, -0.5236F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 18, 21, -0.5F, -2.0F, 0.0F, 1, 2, 0, 0.0F, true));

        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(-0.5F, 0.25F, 0.0F);
        this.body.addChild(cube_r11);
        this.setRotateAngle(cube_r11, 0.1745F, 0.0F, -0.5236F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 18, 21, -0.5F, -2.0F, 0.0F, 1, 2, 0, 0.0F, true));

        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(-0.5F, 0.25F, 0.5F);
        this.body.addChild(cube_r12);
        this.setRotateAngle(cube_r12, -0.1745F, 0.0F, -0.5236F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 18, 21, -0.5F, -2.0F, 0.0F, 1, 2, 0, 0.0F, true));

        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(-1.5F, 1.0F, 3.5F);
        this.body.addChild(cube_r13);
        this.setRotateAngle(cube_r13, 0.0F, -0.3927F, 0.0F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 20, 21, -1.0F, -0.5F, 0.0F, 1, 1, 0, 0.0F, true));

        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(-1.5F, 1.0F, 3.5F);
        this.body.addChild(cube_r14);
        this.setRotateAngle(cube_r14, 0.0F, 0.3927F, 0.0F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 20, 21, -1.0F, -0.5F, 0.0F, 1, 1, 0, 0.0F, true));

        this.cube_r15 = new AdvancedModelRenderer(this);
        this.cube_r15.setRotationPoint(-1.5F, 1.0F, 7.0F);
        this.body.addChild(cube_r15);
        this.setRotateAngle(cube_r15, 0.0F, 0.3927F, 0.0F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 20, 21, -1.0F, -0.5F, 0.0F, 1, 1, 0, 0.0F, true));

        this.cube_r16 = new AdvancedModelRenderer(this);
        this.cube_r16.setRotationPoint(-1.5F, 1.0F, 7.0F);
        this.body.addChild(cube_r16);
        this.setRotateAngle(cube_r16, 0.0F, -0.3927F, 0.0F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 20, 21, -1.0F, -0.5F, 0.0F, 1, 1, 0, 0.0F, true));

        this.cube_r17 = new AdvancedModelRenderer(this);
        this.cube_r17.setRotationPoint(-1.5F, 1.0F, 5.25F);
        this.body.addChild(cube_r17);
        this.setRotateAngle(cube_r17, 0.0F, -0.3927F, 0.0F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 20, 21, -1.0F, -0.5F, 0.0F, 1, 1, 0, 0.0F, true));

        this.cube_r18 = new AdvancedModelRenderer(this);
        this.cube_r18.setRotationPoint(-1.5F, 1.0F, 5.25F);
        this.body.addChild(cube_r18);
        this.setRotateAngle(cube_r18, 0.0F, 0.3927F, 0.0F);
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 20, 21, -1.0F, -0.5F, 0.0F, 1, 1, 0, 0.0F, true));

        this.cube_r19 = new AdvancedModelRenderer(this);
        this.cube_r19.setRotationPoint(-1.5F, 1.0F, 2.0F);
        this.body.addChild(cube_r19);
        this.setRotateAngle(cube_r19, 0.0F, -0.3927F, 0.0F);
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 20, 21, -1.0F, -0.5F, 0.0F, 1, 1, 0, 0.0F, true));

        this.cube_r20 = new AdvancedModelRenderer(this);
        this.cube_r20.setRotationPoint(-1.5F, 1.0F, 2.0F);
        this.body.addChild(cube_r20);
        this.setRotateAngle(cube_r20, 0.0F, 0.3927F, 0.0F);
        this.cube_r20.cubeList.add(new ModelBox(cube_r20, 20, 21, -1.0F, -0.5F, 0.0F, 1, 1, 0, 0.0F, true));

        this.cube_r21 = new AdvancedModelRenderer(this);
        this.cube_r21.setRotationPoint(-1.5F, 1.0F, 0.25F);
        this.body.addChild(cube_r21);
        this.setRotateAngle(cube_r21, 0.0F, -0.3927F, 0.0F);
        this.cube_r21.cubeList.add(new ModelBox(cube_r21, 20, 21, -1.0F, -0.5F, 0.0F, 1, 1, 0, 0.0F, true));

        this.cube_r22 = new AdvancedModelRenderer(this);
        this.cube_r22.setRotationPoint(-1.5F, 1.0F, 0.25F);
        this.body.addChild(cube_r22);
        this.setRotateAngle(cube_r22, 0.0F, 0.3927F, 0.0F);
        this.cube_r22.cubeList.add(new ModelBox(cube_r22, 20, 21, -1.0F, -0.5F, 0.0F, 1, 1, 0, 0.0F, true));

        this.cube_r23 = new AdvancedModelRenderer(this);
        this.cube_r23.setRotationPoint(0.5F, 0.25F, 7.5F);
        this.body.addChild(cube_r23);
        this.setRotateAngle(cube_r23, -0.1745F, 0.0F, 0.5236F);
        this.cube_r23.cubeList.add(new ModelBox(cube_r23, 18, 21, -0.5F, -2.0F, 0.0F, 1, 2, 0, 0.0F, false));

        this.cube_r24 = new AdvancedModelRenderer(this);
        this.cube_r24.setRotationPoint(0.5F, 0.25F, 7.1F);
        this.body.addChild(cube_r24);
        this.setRotateAngle(cube_r24, 0.0F, 0.0F, 0.2618F);
        this.cube_r24.cubeList.add(new ModelBox(cube_r24, 8, 15, -0.5F, -3.0F, 0.0F, 1, 3, 0, 0.0F, false));
        this.cube_r24.cubeList.add(new ModelBox(cube_r24, 8, 15, -0.5F, -3.0F, -1.75F, 1, 3, 0, 0.0F, false));
        this.cube_r24.cubeList.add(new ModelBox(cube_r24, 8, 15, -0.5F, -3.0F, -3.5F, 1, 3, 0, 0.0F, false));
        this.cube_r24.cubeList.add(new ModelBox(cube_r24, 8, 15, -0.5F, -3.0F, -5.25F, 1, 3, 0, 0.0F, false));
        this.cube_r24.cubeList.add(new ModelBox(cube_r24, 8, 15, -0.5F, -3.0F, -7.0F, 1, 3, 0, 0.0F, false));

        this.cube_r25 = new AdvancedModelRenderer(this);
        this.cube_r25.setRotationPoint(0.5F, 0.25F, 7.0F);
        this.body.addChild(cube_r25);
        this.setRotateAngle(cube_r25, 0.1745F, 0.0F, 0.5236F);
        this.cube_r25.cubeList.add(new ModelBox(cube_r25, 18, 21, -0.5F, -2.0F, 0.0F, 1, 2, 0, 0.0F, false));

        this.cube_r26 = new AdvancedModelRenderer(this);
        this.cube_r26.setRotationPoint(0.5F, 0.25F, 7.4F);
        this.body.addChild(cube_r26);
        this.setRotateAngle(cube_r26, 0.0F, 0.0F, 0.7854F);
        this.cube_r26.cubeList.add(new ModelBox(cube_r26, 8, 15, -0.5F, -3.0F, 0.0F, 1, 3, 0, 0.0F, false));
        this.cube_r26.cubeList.add(new ModelBox(cube_r26, 8, 15, -0.5F, -3.0F, -1.75F, 1, 3, 0, 0.0F, false));
        this.cube_r26.cubeList.add(new ModelBox(cube_r26, 8, 15, -0.5F, -3.0F, -3.5F, 1, 3, 0, 0.0F, false));
        this.cube_r26.cubeList.add(new ModelBox(cube_r26, 8, 15, -0.5F, -3.0F, -5.25F, 1, 3, 0, 0.0F, false));
        this.cube_r26.cubeList.add(new ModelBox(cube_r26, 8, 15, -0.5F, -3.0F, -7.0F, 1, 3, 0, 0.0F, false));

        this.cube_r27 = new AdvancedModelRenderer(this);
        this.cube_r27.setRotationPoint(0.5F, 0.25F, 5.75F);
        this.body.addChild(cube_r27);
        this.setRotateAngle(cube_r27, -0.1745F, 0.0F, 0.5236F);
        this.cube_r27.cubeList.add(new ModelBox(cube_r27, 18, 21, -0.5F, -2.0F, 0.0F, 1, 2, 0, 0.0F, false));

        this.cube_r28 = new AdvancedModelRenderer(this);
        this.cube_r28.setRotationPoint(0.5F, 0.25F, 5.25F);
        this.body.addChild(cube_r28);
        this.setRotateAngle(cube_r28, 0.1745F, 0.0F, 0.5236F);
        this.cube_r28.cubeList.add(new ModelBox(cube_r28, 18, 21, -0.5F, -2.0F, 0.0F, 1, 2, 0, 0.0F, false));

        this.cube_r29 = new AdvancedModelRenderer(this);
        this.cube_r29.setRotationPoint(0.5F, 0.25F, 4.0F);
        this.body.addChild(cube_r29);
        this.setRotateAngle(cube_r29, -0.1745F, 0.0F, 0.5236F);
        this.cube_r29.cubeList.add(new ModelBox(cube_r29, 18, 21, -0.5F, -2.0F, 0.0F, 1, 2, 0, 0.0F, false));

        this.cube_r30 = new AdvancedModelRenderer(this);
        this.cube_r30.setRotationPoint(0.5F, 0.25F, 3.5F);
        this.body.addChild(cube_r30);
        this.setRotateAngle(cube_r30, 0.1745F, 0.0F, 0.5236F);
        this.cube_r30.cubeList.add(new ModelBox(cube_r30, 18, 21, -0.5F, -2.0F, 0.0F, 1, 2, 0, 0.0F, false));

        this.cube_r31 = new AdvancedModelRenderer(this);
        this.cube_r31.setRotationPoint(0.5F, 0.25F, 2.25F);
        this.body.addChild(cube_r31);
        this.setRotateAngle(cube_r31, -0.1745F, 0.0F, 0.5236F);
        this.cube_r31.cubeList.add(new ModelBox(cube_r31, 18, 21, -0.5F, -2.0F, 0.0F, 1, 2, 0, 0.0F, false));

        this.cube_r32 = new AdvancedModelRenderer(this);
        this.cube_r32.setRotationPoint(0.5F, 0.25F, 1.75F);
        this.body.addChild(cube_r32);
        this.setRotateAngle(cube_r32, 0.1745F, 0.0F, 0.5236F);
        this.cube_r32.cubeList.add(new ModelBox(cube_r32, 18, 21, -0.5F, -2.0F, 0.0F, 1, 2, 0, 0.0F, false));

        this.cube_r33 = new AdvancedModelRenderer(this);
        this.cube_r33.setRotationPoint(0.5F, 0.25F, 0.0F);
        this.body.addChild(cube_r33);
        this.setRotateAngle(cube_r33, 0.1745F, 0.0F, 0.5236F);
        this.cube_r33.cubeList.add(new ModelBox(cube_r33, 18, 21, -0.5F, -2.0F, 0.0F, 1, 2, 0, 0.0F, false));

        this.cube_r34 = new AdvancedModelRenderer(this);
        this.cube_r34.setRotationPoint(0.5F, 0.25F, 0.5F);
        this.body.addChild(cube_r34);
        this.setRotateAngle(cube_r34, -0.1745F, 0.0F, 0.5236F);
        this.cube_r34.cubeList.add(new ModelBox(cube_r34, 18, 21, -0.5F, -2.0F, 0.0F, 1, 2, 0, 0.0F, false));

        this.cube_r35 = new AdvancedModelRenderer(this);
        this.cube_r35.setRotationPoint(1.5F, 1.0F, 3.5F);
        this.body.addChild(cube_r35);
        this.setRotateAngle(cube_r35, 0.0F, 0.3927F, 0.0F);
        this.cube_r35.cubeList.add(new ModelBox(cube_r35, 20, 21, 0.0F, -0.5F, 0.0F, 1, 1, 0, 0.0F, false));

        this.cube_r36 = new AdvancedModelRenderer(this);
        this.cube_r36.setRotationPoint(1.5F, 1.0F, 3.5F);
        this.body.addChild(cube_r36);
        this.setRotateAngle(cube_r36, 0.0F, -0.3927F, 0.0F);
        this.cube_r36.cubeList.add(new ModelBox(cube_r36, 20, 21, 0.0F, -0.5F, 0.0F, 1, 1, 0, 0.0F, false));

        this.cube_r37 = new AdvancedModelRenderer(this);
        this.cube_r37.setRotationPoint(1.5F, 1.0F, 7.0F);
        this.body.addChild(cube_r37);
        this.setRotateAngle(cube_r37, 0.0F, -0.3927F, 0.0F);
        this.cube_r37.cubeList.add(new ModelBox(cube_r37, 20, 21, 0.0F, -0.5F, 0.0F, 1, 1, 0, 0.0F, false));

        this.cube_r38 = new AdvancedModelRenderer(this);
        this.cube_r38.setRotationPoint(1.5F, 1.0F, 7.0F);
        this.body.addChild(cube_r38);
        this.setRotateAngle(cube_r38, 0.0F, 0.3927F, 0.0F);
        this.cube_r38.cubeList.add(new ModelBox(cube_r38, 20, 21, 0.0F, -0.5F, 0.0F, 1, 1, 0, 0.0F, false));

        this.cube_r39 = new AdvancedModelRenderer(this);
        this.cube_r39.setRotationPoint(1.5F, 1.0F, 5.25F);
        this.body.addChild(cube_r39);
        this.setRotateAngle(cube_r39, 0.0F, 0.3927F, 0.0F);
        this.cube_r39.cubeList.add(new ModelBox(cube_r39, 20, 21, 0.0F, -0.5F, 0.0F, 1, 1, 0, 0.0F, false));

        this.cube_r40 = new AdvancedModelRenderer(this);
        this.cube_r40.setRotationPoint(1.5F, 1.0F, 5.25F);
        this.body.addChild(cube_r40);
        this.setRotateAngle(cube_r40, 0.0F, -0.3927F, 0.0F);
        this.cube_r40.cubeList.add(new ModelBox(cube_r40, 20, 21, 0.0F, -0.5F, 0.0F, 1, 1, 0, 0.0F, false));

        this.cube_r41 = new AdvancedModelRenderer(this);
        this.cube_r41.setRotationPoint(1.5F, 1.0F, 2.0F);
        this.body.addChild(cube_r41);
        this.setRotateAngle(cube_r41, 0.0F, 0.3927F, 0.0F);
        this.cube_r41.cubeList.add(new ModelBox(cube_r41, 20, 21, 0.0F, -0.5F, 0.0F, 1, 1, 0, 0.0F, false));

        this.cube_r42 = new AdvancedModelRenderer(this);
        this.cube_r42.setRotationPoint(1.5F, 1.0F, 2.0F);
        this.body.addChild(cube_r42);
        this.setRotateAngle(cube_r42, 0.0F, -0.3927F, 0.0F);
        this.cube_r42.cubeList.add(new ModelBox(cube_r42, 20, 21, 0.0F, -0.5F, 0.0F, 1, 1, 0, 0.0F, false));

        this.cube_r43 = new AdvancedModelRenderer(this);
        this.cube_r43.setRotationPoint(1.5F, 1.0F, 0.25F);
        this.body.addChild(cube_r43);
        this.setRotateAngle(cube_r43, 0.0F, 0.3927F, 0.0F);
        this.cube_r43.cubeList.add(new ModelBox(cube_r43, 20, 21, 0.0F, -0.5F, 0.0F, 1, 1, 0, 0.0F, false));

        this.cube_r44 = new AdvancedModelRenderer(this);
        this.cube_r44.setRotationPoint(1.5F, 1.0F, 0.25F);
        this.body.addChild(cube_r44);
        this.setRotateAngle(cube_r44, 0.0F, -0.3927F, 0.0F);
        this.cube_r44.cubeList.add(new ModelBox(cube_r44, 20, 21, 0.0F, -0.5F, 0.0F, 1, 1, 0, 0.0F, false));

        this.leftLeg3 = new AdvancedModelRenderer(this);
        this.leftLeg3.setRotationPoint(1.5F, 1.5F, 0.5F);
        this.body.addChild(leftLeg3);
        this.setRotateAngle(leftLeg3, 0.0F, 0.0F, 1.1345F);
        this.leftLeg3.cubeList.add(new ModelBox(leftLeg3, 0, 19, -0.25F, 0.0F, -0.5F, 3, 1, 1, 0.0F, false));

        this.rightLeg3 = new AdvancedModelRenderer(this);
        this.rightLeg3.setRotationPoint(-1.5F, 1.5F, 0.5F);
        this.body.addChild(rightLeg3);
        this.setRotateAngle(rightLeg3, 0.0F, 0.0F, -1.1345F);
        this.rightLeg3.cubeList.add(new ModelBox(rightLeg3, 0, 19, -2.75F, 0.0F, -0.5F, 3, 1, 1, 0.0F, true));

        this.leftLeg4 = new AdvancedModelRenderer(this);
        this.leftLeg4.setRotationPoint(1.5F, 1.5F, 2.0F);
        this.body.addChild(leftLeg4);
        this.setRotateAngle(leftLeg4, 0.0F, 0.0F, 1.1345F);
        this.leftLeg4.cubeList.add(new ModelBox(leftLeg4, 0, 19, -0.25F, 0.0F, -0.5F, 3, 1, 1, 0.0F, false));

        this.rightLeg4 = new AdvancedModelRenderer(this);
        this.rightLeg4.setRotationPoint(-1.5F, 1.5F, 2.0F);
        this.body.addChild(rightLeg4);
        this.setRotateAngle(rightLeg4, 0.0F, 0.0F, -1.1345F);
        this.rightLeg4.cubeList.add(new ModelBox(rightLeg4, 0, 19, -2.75F, 0.0F, -0.5F, 3, 1, 1, 0.0F, true));

        this.leftLeg5 = new AdvancedModelRenderer(this);
        this.leftLeg5.setRotationPoint(1.5F, 1.5F, 3.75F);
        this.body.addChild(leftLeg5);
        this.setRotateAngle(leftLeg5, 0.0F, 0.0F, 1.1345F);
        this.leftLeg5.cubeList.add(new ModelBox(leftLeg5, 0, 19, -0.25F, 0.0F, -0.5F, 3, 1, 1, 0.0F, false));

        this.rightLeg5 = new AdvancedModelRenderer(this);
        this.rightLeg5.setRotationPoint(-1.5F, 1.5F, 3.75F);
        this.body.addChild(rightLeg5);
        this.setRotateAngle(rightLeg5, 0.0F, 0.0F, -1.1345F);
        this.rightLeg5.cubeList.add(new ModelBox(rightLeg5, 0, 19, -2.75F, 0.0F, -0.5F, 3, 1, 1, 0.0F, true));

        this.leftLeg6 = new AdvancedModelRenderer(this);
        this.leftLeg6.setRotationPoint(1.5F, 1.5F, 5.25F);
        this.body.addChild(leftLeg6);
        this.setRotateAngle(leftLeg6, 0.0F, 0.0F, 1.1345F);
        this.leftLeg6.cubeList.add(new ModelBox(leftLeg6, 0, 19, -0.25F, 0.0F, -0.5F, 3, 1, 1, 0.0F, false));

        this.rightLeg6 = new AdvancedModelRenderer(this);
        this.rightLeg6.setRotationPoint(-1.5F, 1.5F, 5.25F);
        this.body.addChild(rightLeg6);
        this.setRotateAngle(rightLeg6, 0.0F, 0.0F, -1.1345F);
        this.rightLeg6.cubeList.add(new ModelBox(rightLeg6, 0, 19, -2.75F, 0.0F, -0.5F, 3, 1, 1, 0.0F, true));

        this.leftLeg7 = new AdvancedModelRenderer(this);
        this.leftLeg7.setRotationPoint(1.5F, 1.5F, 6.75F);
        this.body.addChild(leftLeg7);
        this.setRotateAngle(leftLeg7, 0.0F, 0.0F, 1.1345F);
        this.leftLeg7.cubeList.add(new ModelBox(leftLeg7, 0, 19, -0.25F, 0.0F, -0.5F, 3, 1, 1, 0.0F, false));

        this.rightLeg7 = new AdvancedModelRenderer(this);
        this.rightLeg7.setRotationPoint(-1.5F, 1.5F, 6.75F);
        this.body.addChild(rightLeg7);
        this.setRotateAngle(rightLeg7, 0.0F, 0.0F, -1.1345F);
        this.rightLeg7.cubeList.add(new ModelBox(rightLeg7, 0, 19, -2.75F, 0.0F, -0.5F, 3, 1, 1, 0.0F, true));

        this.tail1 = new AdvancedModelRenderer(this);
        this.tail1.setRotationPoint(0.0F, 0.0F, 8.0F);
        this.body.addChild(tail1);
        this.setRotateAngle(tail1, -0.1745F, 0.0F, 0.0F);
        this.tail1.cubeList.add(new ModelBox(tail1, 8, 18, -1.0F, 0.0F, 0.0F, 2, 1, 2, 0.01F, false));
        this.tail1.cubeList.add(new ModelBox(tail1, 16, 18, -1.0F, 0.75F, 0.0F, 2, 1, 2, 0.0F, false));

        this.cube_r45 = new AdvancedModelRenderer(this);
        this.cube_r45.setRotationPoint(-0.5F, 0.25F, 0.65F);
        this.tail1.addChild(cube_r45);
        this.setRotateAngle(cube_r45, 0.0F, 0.0F, -0.7854F);
        this.cube_r45.cubeList.add(new ModelBox(cube_r45, 8, 15, -0.5F, -3.0F, 0.0F, 1, 3, 0, 0.0F, true));

        this.cube_r46 = new AdvancedModelRenderer(this);
        this.cube_r46.setRotationPoint(-0.5F, 0.25F, 0.25F);
        this.tail1.addChild(cube_r46);
        this.setRotateAngle(cube_r46, 0.1745F, 0.0F, -0.5236F);
        this.cube_r46.cubeList.add(new ModelBox(cube_r46, 18, 21, -0.5F, -2.0F, 0.0F, 1, 2, 0, 0.0F, true));

        this.cube_r47 = new AdvancedModelRenderer(this);
        this.cube_r47.setRotationPoint(-0.5F, 0.25F, 0.35F);
        this.tail1.addChild(cube_r47);
        this.setRotateAngle(cube_r47, 0.0F, 0.0F, -0.2618F);
        this.cube_r47.cubeList.add(new ModelBox(cube_r47, 8, 15, -0.5F, -3.0F, 0.0F, 1, 3, 0, 0.0F, true));

        this.cube_r48 = new AdvancedModelRenderer(this);
        this.cube_r48.setRotationPoint(-0.5F, 0.25F, 0.75F);
        this.tail1.addChild(cube_r48);
        this.setRotateAngle(cube_r48, -0.1745F, 0.0F, -0.5236F);
        this.cube_r48.cubeList.add(new ModelBox(cube_r48, 18, 21, -0.5F, -2.0F, 0.0F, 1, 2, 0, 0.0F, true));

        this.cube_r49 = new AdvancedModelRenderer(this);
        this.cube_r49.setRotationPoint(-1.0F, 1.0F, 0.75F);
        this.tail1.addChild(cube_r49);
        this.setRotateAngle(cube_r49, 0.0F, 0.3927F, 0.0F);
        this.cube_r49.cubeList.add(new ModelBox(cube_r49, 20, 21, -1.0F, -0.5F, 0.0F, 1, 1, 0, 0.0F, true));

        this.cube_r50 = new AdvancedModelRenderer(this);
        this.cube_r50.setRotationPoint(-1.0F, 1.0F, 0.75F);
        this.tail1.addChild(cube_r50);
        this.setRotateAngle(cube_r50, 0.0F, -0.3927F, 0.0F);
        this.cube_r50.cubeList.add(new ModelBox(cube_r50, 20, 21, -1.0F, -0.5F, 0.0F, 1, 1, 0, 0.0F, true));

        this.cube_r51 = new AdvancedModelRenderer(this);
        this.cube_r51.setRotationPoint(0.5F, 0.25F, 0.65F);
        this.tail1.addChild(cube_r51);
        this.setRotateAngle(cube_r51, 0.0F, 0.0F, 0.7854F);
        this.cube_r51.cubeList.add(new ModelBox(cube_r51, 8, 15, -0.5F, -3.0F, 0.0F, 1, 3, 0, 0.0F, false));

        this.cube_r52 = new AdvancedModelRenderer(this);
        this.cube_r52.setRotationPoint(0.5F, 0.25F, 0.25F);
        this.tail1.addChild(cube_r52);
        this.setRotateAngle(cube_r52, 0.1745F, 0.0F, 0.5236F);
        this.cube_r52.cubeList.add(new ModelBox(cube_r52, 18, 21, -0.5F, -2.0F, 0.0F, 1, 2, 0, 0.0F, false));

        this.cube_r53 = new AdvancedModelRenderer(this);
        this.cube_r53.setRotationPoint(0.5F, 0.25F, 0.35F);
        this.tail1.addChild(cube_r53);
        this.setRotateAngle(cube_r53, 0.0F, 0.0F, 0.2618F);
        this.cube_r53.cubeList.add(new ModelBox(cube_r53, 8, 15, -0.5F, -3.0F, 0.0F, 1, 3, 0, 0.0F, false));

        this.cube_r54 = new AdvancedModelRenderer(this);
        this.cube_r54.setRotationPoint(0.5F, 0.25F, 0.75F);
        this.tail1.addChild(cube_r54);
        this.setRotateAngle(cube_r54, -0.1745F, 0.0F, 0.5236F);
        this.cube_r54.cubeList.add(new ModelBox(cube_r54, 18, 21, -0.5F, -2.0F, 0.0F, 1, 2, 0, 0.0F, false));

        this.cube_r55 = new AdvancedModelRenderer(this);
        this.cube_r55.setRotationPoint(1.0F, 1.0F, 0.75F);
        this.tail1.addChild(cube_r55);
        this.setRotateAngle(cube_r55, 0.0F, -0.3927F, 0.0F);
        this.cube_r55.cubeList.add(new ModelBox(cube_r55, 20, 21, 0.0F, -0.5F, 0.0F, 1, 1, 0, 0.0F, false));

        this.cube_r56 = new AdvancedModelRenderer(this);
        this.cube_r56.setRotationPoint(1.0F, 1.0F, 0.75F);
        this.tail1.addChild(cube_r56);
        this.setRotateAngle(cube_r56, 0.0F, 0.3927F, 0.0F);
        this.cube_r56.cubeList.add(new ModelBox(cube_r56, 20, 21, 0.0F, -0.5F, 0.0F, 1, 1, 0, 0.0F, false));

        this.leftLeg8 = new AdvancedModelRenderer(this);
        this.leftLeg8.setRotationPoint(1.0F, 1.0F, 0.75F);
        this.tail1.addChild(leftLeg8);
        this.setRotateAngle(leftLeg8, 0.0F, -0.0873F, 1.1345F);
        this.leftLeg8.cubeList.add(new ModelBox(leftLeg8, 0, 19, 0.0F, 0.0F, -0.5F, 3, 1, 1, 0.0F, false));

        this.rightLeg8 = new AdvancedModelRenderer(this);
        this.rightLeg8.setRotationPoint(-1.0F, 1.0F, 0.75F);
        this.tail1.addChild(rightLeg8);
        this.setRotateAngle(rightLeg8, 0.0F, 0.0873F, -1.1345F);
        this.rightLeg8.cubeList.add(new ModelBox(rightLeg8, 0, 19, -3.0F, 0.0F, -0.5F, 3, 1, 1, 0.0F, true));

        this.tail2 = new AdvancedModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, 0.0F, 2.0F);
        this.tail1.addChild(tail2);
        this.setRotateAngle(tail2, -0.3054F, 0.0F, 0.0F);
        this.tail2.cubeList.add(new ModelBox(tail2, 10, 10, -1.0F, 0.0F, 0.0F, 2, 1, 3, 0.0F, false));
        this.tail2.cubeList.add(new ModelBox(tail2, 10, 14, -1.0F, 0.5F, 0.0F, 2, 1, 3, -0.01F, false));

        this.cube_r57 = new AdvancedModelRenderer(this);
        this.cube_r57.setRotationPoint(-0.5F, 0.25F, 2.0F);
        this.tail2.addChild(cube_r57);
        this.setRotateAngle(cube_r57, -0.1745F, 0.0F, -0.5236F);
        this.cube_r57.cubeList.add(new ModelBox(cube_r57, 18, 21, -0.5F, -2.0F, 0.0F, 1, 2, 0, 0.0F, true));

        this.cube_r58 = new AdvancedModelRenderer(this);
        this.cube_r58.setRotationPoint(-0.5F, 0.25F, 1.6F);
        this.tail2.addChild(cube_r58);
        this.setRotateAngle(cube_r58, 0.0F, 0.0F, -0.2618F);
        this.cube_r58.cubeList.add(new ModelBox(cube_r58, 8, 15, -0.5F, -3.0F, 0.0F, 1, 3, 0, 0.0F, true));
        this.cube_r58.cubeList.add(new ModelBox(cube_r58, 8, 15, -0.5F, -3.0F, -1.75F, 1, 3, 0, 0.0F, true));

        this.cube_r59 = new AdvancedModelRenderer(this);
        this.cube_r59.setRotationPoint(-0.5F, 0.25F, 1.5F);
        this.tail2.addChild(cube_r59);
        this.setRotateAngle(cube_r59, 0.1745F, 0.0F, -0.5236F);
        this.cube_r59.cubeList.add(new ModelBox(cube_r59, 18, 21, -0.5F, -2.0F, 0.0F, 1, 2, 0, 0.0F, true));

        this.cube_r60 = new AdvancedModelRenderer(this);
        this.cube_r60.setRotationPoint(-0.5F, 0.25F, 1.9F);
        this.tail2.addChild(cube_r60);
        this.setRotateAngle(cube_r60, 0.0F, 0.0F, -0.7854F);
        this.cube_r60.cubeList.add(new ModelBox(cube_r60, 8, 15, -0.5F, -3.0F, 0.0F, 1, 3, 0, 0.0F, true));
        this.cube_r60.cubeList.add(new ModelBox(cube_r60, 8, 15, -0.5F, -3.0F, -1.75F, 1, 3, 0, 0.0F, true));

        this.cube_r61 = new AdvancedModelRenderer(this);
        this.cube_r61.setRotationPoint(-0.5F, 0.25F, 0.25F);
        this.tail2.addChild(cube_r61);
        this.setRotateAngle(cube_r61, -0.1745F, 0.0F, -0.5236F);
        this.cube_r61.cubeList.add(new ModelBox(cube_r61, 18, 21, -0.5F, -2.0F, 0.0F, 1, 2, 0, 0.0F, true));

        this.cube_r62 = new AdvancedModelRenderer(this);
        this.cube_r62.setRotationPoint(-0.5F, 0.25F, -0.25F);
        this.tail2.addChild(cube_r62);
        this.setRotateAngle(cube_r62, 0.1745F, 0.0F, -0.5236F);
        this.cube_r62.cubeList.add(new ModelBox(cube_r62, 18, 21, -0.5F, -2.0F, 0.0F, 1, 2, 0, 0.0F, true));

        this.cube_r63 = new AdvancedModelRenderer(this);
        this.cube_r63.setRotationPoint(-0.5F, 0.25F, 2.5F);
        this.tail2.addChild(cube_r63);
        this.setRotateAngle(cube_r63, -0.4363F, 0.0F, -0.5236F);
        this.cube_r63.cubeList.add(new ModelBox(cube_r63, 8, 15, -0.5F, -3.0F, 0.0F, 1, 3, 0, 0.0F, true));

        this.cube_r64 = new AdvancedModelRenderer(this);
        this.cube_r64.setRotationPoint(-0.5F, 0.25F, 2.75F);
        this.tail2.addChild(cube_r64);
        this.setRotateAngle(cube_r64, -0.6908F, 0.1059F, -0.3846F);
        this.cube_r64.cubeList.add(new ModelBox(cube_r64, 8, 15, -0.5F, -3.0F, 0.0F, 1, 3, 0, 0.0F, true));

        this.cube_r65 = new AdvancedModelRenderer(this);
        this.cube_r65.setRotationPoint(-0.5F, 0.25F, 2.75F);
        this.tail2.addChild(cube_r65);
        this.setRotateAngle(cube_r65, -1.1345F, -0.1745F, -0.5236F);
        this.cube_r65.cubeList.add(new ModelBox(cube_r65, 8, 15, -0.5F, -3.0F, 0.0F, 1, 3, 0, 0.0F, true));

        this.cube_r66 = new AdvancedModelRenderer(this);
        this.cube_r66.setRotationPoint(-0.5F, 0.25F, 3.0F);
        this.tail2.addChild(cube_r66);
        this.setRotateAngle(cube_r66, -1.3963F, 0.0F, -0.5236F);
        this.cube_r66.cubeList.add(new ModelBox(cube_r66, 8, 15, -0.5F, -3.0F, 0.0F, 1, 3, 0, 0.0F, true));

        this.cube_r67 = new AdvancedModelRenderer(this);
        this.cube_r67.setRotationPoint(-1.0F, 0.75F, 2.25F);
        this.tail2.addChild(cube_r67);
        this.setRotateAngle(cube_r67, 0.0F, -0.3927F, 0.0F);
        this.cube_r67.cubeList.add(new ModelBox(cube_r67, 20, 21, -1.0F, -0.5F, 0.0F, 1, 1, 0, 0.0F, true));

        this.cube_r68 = new AdvancedModelRenderer(this);
        this.cube_r68.setRotationPoint(-1.0F, 0.75F, 2.25F);
        this.tail2.addChild(cube_r68);
        this.setRotateAngle(cube_r68, 0.0F, 0.3927F, 0.0F);
        this.cube_r68.cubeList.add(new ModelBox(cube_r68, 20, 21, -1.0F, -0.5F, 0.0F, 1, 1, 0, 0.0F, true));

        this.cube_r69 = new AdvancedModelRenderer(this);
        this.cube_r69.setRotationPoint(-1.0F, 0.75F, 0.75F);
        this.tail2.addChild(cube_r69);
        this.setRotateAngle(cube_r69, 0.0F, 0.3927F, 0.0F);
        this.cube_r69.cubeList.add(new ModelBox(cube_r69, 20, 21, -1.0F, -0.5F, 0.0F, 1, 1, 0, 0.0F, true));

        this.cube_r70 = new AdvancedModelRenderer(this);
        this.cube_r70.setRotationPoint(-1.0F, 0.75F, 0.75F);
        this.tail2.addChild(cube_r70);
        this.setRotateAngle(cube_r70, 0.0F, -0.3927F, 0.0F);
        this.cube_r70.cubeList.add(new ModelBox(cube_r70, 20, 21, -1.0F, -0.5F, 0.0F, 1, 1, 0, 0.0F, true));

        this.cube_r71 = new AdvancedModelRenderer(this);
        this.cube_r71.setRotationPoint(0.5F, 0.25F, 2.0F);
        this.tail2.addChild(cube_r71);
        this.setRotateAngle(cube_r71, -0.1745F, 0.0F, 0.5236F);
        this.cube_r71.cubeList.add(new ModelBox(cube_r71, 18, 21, -0.5F, -2.0F, 0.0F, 1, 2, 0, 0.0F, false));

        this.cube_r72 = new AdvancedModelRenderer(this);
        this.cube_r72.setRotationPoint(0.5F, 0.25F, 1.6F);
        this.tail2.addChild(cube_r72);
        this.setRotateAngle(cube_r72, 0.0F, 0.0F, 0.2618F);
        this.cube_r72.cubeList.add(new ModelBox(cube_r72, 8, 15, -0.5F, -3.0F, 0.0F, 1, 3, 0, 0.0F, false));
        this.cube_r72.cubeList.add(new ModelBox(cube_r72, 8, 15, -0.5F, -3.0F, -1.75F, 1, 3, 0, 0.0F, false));

        this.cube_r73 = new AdvancedModelRenderer(this);
        this.cube_r73.setRotationPoint(0.5F, 0.25F, 1.5F);
        this.tail2.addChild(cube_r73);
        this.setRotateAngle(cube_r73, 0.1745F, 0.0F, 0.5236F);
        this.cube_r73.cubeList.add(new ModelBox(cube_r73, 18, 21, -0.5F, -2.0F, 0.0F, 1, 2, 0, 0.0F, false));

        this.cube_r74 = new AdvancedModelRenderer(this);
        this.cube_r74.setRotationPoint(0.5F, 0.25F, 1.9F);
        this.tail2.addChild(cube_r74);
        this.setRotateAngle(cube_r74, 0.0F, 0.0F, 0.7854F);
        this.cube_r74.cubeList.add(new ModelBox(cube_r74, 8, 15, -0.5F, -3.0F, 0.0F, 1, 3, 0, 0.0F, false));
        this.cube_r74.cubeList.add(new ModelBox(cube_r74, 8, 15, -0.5F, -3.0F, -1.75F, 1, 3, 0, 0.0F, false));

        this.cube_r75 = new AdvancedModelRenderer(this);
        this.cube_r75.setRotationPoint(0.5F, 0.25F, 0.25F);
        this.tail2.addChild(cube_r75);
        this.setRotateAngle(cube_r75, -0.1745F, 0.0F, 0.5236F);
        this.cube_r75.cubeList.add(new ModelBox(cube_r75, 18, 21, -0.5F, -2.0F, 0.0F, 1, 2, 0, 0.0F, false));

        this.cube_r76 = new AdvancedModelRenderer(this);
        this.cube_r76.setRotationPoint(0.5F, 0.25F, -0.25F);
        this.tail2.addChild(cube_r76);
        this.setRotateAngle(cube_r76, 0.1745F, 0.0F, 0.5236F);
        this.cube_r76.cubeList.add(new ModelBox(cube_r76, 18, 21, -0.5F, -2.0F, 0.0F, 1, 2, 0, 0.0F, false));

        this.cube_r77 = new AdvancedModelRenderer(this);
        this.cube_r77.setRotationPoint(0.5F, 0.25F, 2.5F);
        this.tail2.addChild(cube_r77);
        this.setRotateAngle(cube_r77, -0.4363F, 0.0F, 0.5236F);
        this.cube_r77.cubeList.add(new ModelBox(cube_r77, 8, 15, -0.5F, -3.0F, 0.0F, 1, 3, 0, 0.0F, false));

        this.cube_r78 = new AdvancedModelRenderer(this);
        this.cube_r78.setRotationPoint(0.5F, 0.25F, 2.75F);
        this.tail2.addChild(cube_r78);
        this.setRotateAngle(cube_r78, -0.6908F, -0.1059F, 0.3846F);
        this.cube_r78.cubeList.add(new ModelBox(cube_r78, 8, 15, -0.5F, -3.0F, 0.0F, 1, 3, 0, 0.0F, false));

        this.cube_r79 = new AdvancedModelRenderer(this);
        this.cube_r79.setRotationPoint(0.5F, 0.25F, 2.75F);
        this.tail2.addChild(cube_r79);
        this.setRotateAngle(cube_r79, -1.1345F, 0.1745F, 0.5236F);
        this.cube_r79.cubeList.add(new ModelBox(cube_r79, 8, 15, -0.5F, -3.0F, 0.0F, 1, 3, 0, 0.0F, false));

        this.cube_r80 = new AdvancedModelRenderer(this);
        this.cube_r80.setRotationPoint(0.5F, 0.25F, 3.0F);
        this.tail2.addChild(cube_r80);
        this.setRotateAngle(cube_r80, -1.3963F, 0.0F, 0.5236F);
        this.cube_r80.cubeList.add(new ModelBox(cube_r80, 8, 15, -0.5F, -3.0F, 0.0F, 1, 3, 0, 0.0F, false));

        this.cube_r81 = new AdvancedModelRenderer(this);
        this.cube_r81.setRotationPoint(1.0F, 0.75F, 2.25F);
        this.tail2.addChild(cube_r81);
        this.setRotateAngle(cube_r81, 0.0F, 0.3927F, 0.0F);
        this.cube_r81.cubeList.add(new ModelBox(cube_r81, 20, 21, 0.0F, -0.5F, 0.0F, 1, 1, 0, 0.0F, false));

        this.cube_r82 = new AdvancedModelRenderer(this);
        this.cube_r82.setRotationPoint(1.0F, 0.75F, 2.25F);
        this.tail2.addChild(cube_r82);
        this.setRotateAngle(cube_r82, 0.0F, -0.3927F, 0.0F);
        this.cube_r82.cubeList.add(new ModelBox(cube_r82, 20, 21, 0.0F, -0.5F, 0.0F, 1, 1, 0, 0.0F, false));

        this.cube_r83 = new AdvancedModelRenderer(this);
        this.cube_r83.setRotationPoint(1.0F, 0.75F, 0.75F);
        this.tail2.addChild(cube_r83);
        this.setRotateAngle(cube_r83, 0.0F, -0.3927F, 0.0F);
        this.cube_r83.cubeList.add(new ModelBox(cube_r83, 20, 21, 0.0F, -0.5F, 0.0F, 1, 1, 0, 0.0F, false));

        this.cube_r84 = new AdvancedModelRenderer(this);
        this.cube_r84.setRotationPoint(1.0F, 0.75F, 0.75F);
        this.tail2.addChild(cube_r84);
        this.setRotateAngle(cube_r84, 0.0F, 0.3927F, 0.0F);
        this.cube_r84.cubeList.add(new ModelBox(cube_r84, 20, 21, 0.0F, -0.5F, 0.0F, 1, 1, 0, 0.0F, false));

        this.leftLeg9 = new AdvancedModelRenderer(this);
        this.leftLeg9.setRotationPoint(1.0F, 1.0F, 0.75F);
        this.tail2.addChild(leftLeg9);
        this.setRotateAngle(leftLeg9, 0.0F, -0.3054F, 1.1345F);
        this.leftLeg9.cubeList.add(new ModelBox(leftLeg9, 0, 19, -0.25F, 0.0F, -0.5F, 3, 1, 1, 0.0F, false));

        this.rightLeg9 = new AdvancedModelRenderer(this);
        this.rightLeg9.setRotationPoint(-1.0F, 1.0F, 0.75F);
        this.tail2.addChild(rightLeg9);
        this.setRotateAngle(rightLeg9, 0.0F, 0.3054F, -1.1345F);
        this.rightLeg9.cubeList.add(new ModelBox(rightLeg9, 0, 19, -2.75F, 0.0F, -0.5F, 3, 1, 1, 0.0F, true));

        this.leftLeg10 = new AdvancedModelRenderer(this);
        this.leftLeg10.setRotationPoint(1.0F, 1.0F, 2.25F);
        this.tail2.addChild(leftLeg10);
        this.setRotateAngle(leftLeg10, 0.0F, -0.3491F, 1.1345F);
        this.leftLeg10.cubeList.add(new ModelBox(leftLeg10, 20, 10, -0.25F, 0.0F, -0.5F, 2, 1, 1, 0.0F, false));

        this.rightLeg10 = new AdvancedModelRenderer(this);
        this.rightLeg10.setRotationPoint(-1.0F, 1.0F, 2.25F);
        this.tail2.addChild(rightLeg10);
        this.setRotateAngle(rightLeg10, 0.0F, 0.3491F, -1.1345F);
        this.rightLeg10.cubeList.add(new ModelBox(rightLeg10, 20, 10, -1.75F, 0.0F, -0.5F, 2, 1, 1, 0.0F, true));

        this.neck = new AdvancedModelRenderer(this);
        this.neck.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.body.addChild(neck);
        this.setRotateAngle(neck, 0.1309F, 0.0F, 0.0F);
        this.neck.cubeList.add(new ModelBox(neck, 0, 15, -1.0F, 0.0F, -2.0F, 2, 2, 2, 0.01F, false));

        this.cube_r85 = new AdvancedModelRenderer(this);
        this.cube_r85.setRotationPoint(-0.5F, 0.25F, -0.85F);
        this.neck.addChild(cube_r85);
        this.setRotateAngle(cube_r85, 0.0F, 0.0F, -0.7854F);
        this.cube_r85.cubeList.add(new ModelBox(cube_r85, 8, 15, -0.5F, -3.0F, 0.0F, 1, 3, 0, 0.0F, true));

        this.cube_r86 = new AdvancedModelRenderer(this);
        this.cube_r86.setRotationPoint(-0.5F, 0.25F, -1.25F);
        this.neck.addChild(cube_r86);
        this.setRotateAngle(cube_r86, 0.1745F, 0.0F, -0.5236F);
        this.cube_r86.cubeList.add(new ModelBox(cube_r86, 18, 21, -0.5F, -2.0F, 0.0F, 1, 2, 0, 0.0F, true));

        this.cube_r87 = new AdvancedModelRenderer(this);
        this.cube_r87.setRotationPoint(-0.5F, 0.25F, -1.15F);
        this.neck.addChild(cube_r87);
        this.setRotateAngle(cube_r87, 0.0F, 0.0F, -0.2618F);
        this.cube_r87.cubeList.add(new ModelBox(cube_r87, 8, 15, -0.5F, -3.0F, 0.0F, 1, 3, 0, 0.0F, true));

        this.cube_r88 = new AdvancedModelRenderer(this);
        this.cube_r88.setRotationPoint(-0.5F, 0.25F, -0.75F);
        this.neck.addChild(cube_r88);
        this.setRotateAngle(cube_r88, -0.1745F, 0.0F, -0.5236F);
        this.cube_r88.cubeList.add(new ModelBox(cube_r88, 18, 21, -0.5F, -2.0F, 0.0F, 1, 2, 0, 0.0F, true));

        this.cube_r89 = new AdvancedModelRenderer(this);
        this.cube_r89.setRotationPoint(-1.0F, 1.0F, -1.25F);
        this.neck.addChild(cube_r89);
        this.setRotateAngle(cube_r89, 0.0F, 0.3927F, 0.0F);
        this.cube_r89.cubeList.add(new ModelBox(cube_r89, 20, 21, -1.0F, -0.5F, 0.0F, 1, 1, 0, 0.0F, true));

        this.cube_r90 = new AdvancedModelRenderer(this);
        this.cube_r90.setRotationPoint(-1.0F, 1.0F, -1.25F);
        this.neck.addChild(cube_r90);
        this.setRotateAngle(cube_r90, 0.0F, -0.3927F, 0.0F);
        this.cube_r90.cubeList.add(new ModelBox(cube_r90, 20, 21, -1.0F, -0.5F, 0.0F, 1, 1, 0, 0.0F, true));

        this.cube_r91 = new AdvancedModelRenderer(this);
        this.cube_r91.setRotationPoint(0.5F, 0.25F, -0.85F);
        this.neck.addChild(cube_r91);
        this.setRotateAngle(cube_r91, 0.0F, 0.0F, 0.7854F);
        this.cube_r91.cubeList.add(new ModelBox(cube_r91, 8, 15, -0.5F, -3.0F, 0.0F, 1, 3, 0, 0.0F, false));

        this.cube_r92 = new AdvancedModelRenderer(this);
        this.cube_r92.setRotationPoint(0.5F, 0.25F, -1.25F);
        this.neck.addChild(cube_r92);
        this.setRotateAngle(cube_r92, 0.1745F, 0.0F, 0.5236F);
        this.cube_r92.cubeList.add(new ModelBox(cube_r92, 18, 21, -0.5F, -2.0F, 0.0F, 1, 2, 0, 0.0F, false));

        this.cube_r93 = new AdvancedModelRenderer(this);
        this.cube_r93.setRotationPoint(0.5F, 0.25F, -1.15F);
        this.neck.addChild(cube_r93);
        this.setRotateAngle(cube_r93, 0.0F, 0.0F, 0.2618F);
        this.cube_r93.cubeList.add(new ModelBox(cube_r93, 8, 15, -0.5F, -3.0F, 0.0F, 1, 3, 0, 0.0F, false));

        this.cube_r94 = new AdvancedModelRenderer(this);
        this.cube_r94.setRotationPoint(0.5F, 0.25F, -0.75F);
        this.neck.addChild(cube_r94);
        this.setRotateAngle(cube_r94, -0.1745F, 0.0F, 0.5236F);
        this.cube_r94.cubeList.add(new ModelBox(cube_r94, 18, 21, -0.5F, -2.0F, 0.0F, 1, 2, 0, 0.0F, false));

        this.cube_r95 = new AdvancedModelRenderer(this);
        this.cube_r95.setRotationPoint(1.0F, 1.0F, -1.25F);
        this.neck.addChild(cube_r95);
        this.setRotateAngle(cube_r95, 0.0F, -0.3927F, 0.0F);
        this.cube_r95.cubeList.add(new ModelBox(cube_r95, 20, 21, 0.0F, -0.5F, 0.0F, 1, 1, 0, 0.0F, false));

        this.cube_r96 = new AdvancedModelRenderer(this);
        this.cube_r96.setRotationPoint(1.0F, 1.0F, -1.25F);
        this.neck.addChild(cube_r96);
        this.setRotateAngle(cube_r96, 0.0F, 0.3927F, 0.0F);
        this.cube_r96.cubeList.add(new ModelBox(cube_r96, 20, 21, 0.0F, -0.5F, 0.0F, 1, 1, 0, 0.0F, false));

        this.leftLeg2 = new AdvancedModelRenderer(this);
        this.leftLeg2.setRotationPoint(1.0F, 1.5F, -1.25F);
        this.neck.addChild(leftLeg2);
        this.setRotateAngle(leftLeg2, 0.0F, 0.0F, 1.1345F);
        this.leftLeg2.cubeList.add(new ModelBox(leftLeg2, 0, 19, -0.5F, 0.0F, -0.5F, 3, 1, 1, 0.0F, false));

        this.rightLeg2 = new AdvancedModelRenderer(this);
        this.rightLeg2.setRotationPoint(-1.0F, 1.5F, -1.25F);
        this.neck.addChild(rightLeg2);
        this.setRotateAngle(rightLeg2, 0.0F, 0.0F, -1.1345F);
        this.rightLeg2.cubeList.add(new ModelBox(rightLeg2, 0, 19, -2.5F, 0.0F, -0.5F, 3, 1, 1, 0.0F, true));

        this.head = new AdvancedModelRenderer(this);
        this.head.setRotationPoint(0.0F, 0.0F, -2.0F);
        this.neck.addChild(head);
        this.setRotateAngle(head, 0.3054F, 0.0F, 0.0F);
        this.head.cubeList.add(new ModelBox(head, 0, 10, -1.0F, 0.0F, -3.0F, 2, 2, 3, 0.0F, false));
        this.head.cubeList.add(new ModelBox(head, 20, 16, -0.75F, -0.05F, -2.75F, 1, 1, 1, 0.001F, false));
        this.head.cubeList.add(new ModelBox(head, 4, 21, -0.25F, -0.05F, -2.75F, 1, 1, 1, 0.0F, false));
        this.head.cubeList.add(new ModelBox(head, 12, 21, -0.75F, -0.05F, -2.25F, 1, 1, 1, 0.0F, false));
        this.head.cubeList.add(new ModelBox(head, 8, 21, -0.25F, -0.05F, -2.25F, 1, 1, 1, -0.001F, false));
        this.head.cubeList.add(new ModelBox(head, 0, 21, -0.5F, 1.05F, -2.9F, 1, 1, 1, 0.0F, false));

        this.cube_r97 = new AdvancedModelRenderer(this);
        this.cube_r97.setRotationPoint(-1.0F, 0.75F, -1.0F);
        this.head.addChild(cube_r97);
        this.setRotateAngle(cube_r97, 0.0F, 0.3927F, 0.0F);
        this.cube_r97.cubeList.add(new ModelBox(cube_r97, 20, 21, -1.0F, -0.5F, 0.0F, 1, 1, 0, 0.0F, true));

        this.cube_r98 = new AdvancedModelRenderer(this);
        this.cube_r98.setRotationPoint(-0.5F, 0.25F, 0.0F);
        this.head.addChild(cube_r98);
        this.setRotateAngle(cube_r98, -0.1745F, 0.0F, -0.5236F);
        this.cube_r98.cubeList.add(new ModelBox(cube_r98, 18, 21, -0.5F, -2.0F, 0.0F, 1, 2, 0, 0.0F, true));

        this.cube_r99 = new AdvancedModelRenderer(this);
        this.cube_r99.setRotationPoint(-0.5F, 0.25F, -0.5F);
        this.head.addChild(cube_r99);
        this.setRotateAngle(cube_r99, 0.1745F, 0.0F, -0.5236F);
        this.cube_r99.cubeList.add(new ModelBox(cube_r99, 18, 21, -0.5F, -2.0F, 0.0F, 1, 2, 0, 0.0F, true));

        this.cube_r100 = new AdvancedModelRenderer(this);
        this.cube_r100.setRotationPoint(-0.5F, 0.25F, -0.1F);
        this.head.addChild(cube_r100);
        this.setRotateAngle(cube_r100, 0.0F, 0.0F, -0.7854F);
        this.cube_r100.cubeList.add(new ModelBox(cube_r100, 8, 15, -0.5F, -3.0F, 0.0F, 1, 3, 0, 0.0F, true));

        this.cube_r101 = new AdvancedModelRenderer(this);
        this.cube_r101.setRotationPoint(-0.5F, 0.25F, -0.4F);
        this.head.addChild(cube_r101);
        this.setRotateAngle(cube_r101, 0.0F, 0.0F, -0.2618F);
        this.cube_r101.cubeList.add(new ModelBox(cube_r101, 8, 15, -0.5F, -3.0F, 0.0F, 1, 3, 0, 0.0F, true));

        this.cube_r102 = new AdvancedModelRenderer(this);
        this.cube_r102.setRotationPoint(-1.0F, 0.75F, -1.0F);
        this.head.addChild(cube_r102);
        this.setRotateAngle(cube_r102, 0.0F, -0.3927F, 0.0F);
        this.cube_r102.cubeList.add(new ModelBox(cube_r102, 20, 21, -1.0F, -0.5F, 0.0F, 1, 1, 0, 0.0F, true));

        this.cube_r103 = new AdvancedModelRenderer(this);
        this.cube_r103.setRotationPoint(1.0F, 0.75F, -1.0F);
        this.head.addChild(cube_r103);
        this.setRotateAngle(cube_r103, 0.0F, -0.3927F, 0.0F);
        this.cube_r103.cubeList.add(new ModelBox(cube_r103, 20, 21, 0.0F, -0.5F, 0.0F, 1, 1, 0, 0.0F, false));

        this.cube_r104 = new AdvancedModelRenderer(this);
        this.cube_r104.setRotationPoint(0.5F, 0.25F, 0.0F);
        this.head.addChild(cube_r104);
        this.setRotateAngle(cube_r104, -0.1745F, 0.0F, 0.5236F);
        this.cube_r104.cubeList.add(new ModelBox(cube_r104, 18, 21, -0.5F, -2.0F, 0.0F, 1, 2, 0, 0.0F, false));

        this.cube_r105 = new AdvancedModelRenderer(this);
        this.cube_r105.setRotationPoint(0.5F, 0.25F, -0.5F);
        this.head.addChild(cube_r105);
        this.setRotateAngle(cube_r105, 0.1745F, 0.0F, 0.5236F);
        this.cube_r105.cubeList.add(new ModelBox(cube_r105, 18, 21, -0.5F, -2.0F, 0.0F, 1, 2, 0, 0.0F, false));

        this.cube_r106 = new AdvancedModelRenderer(this);
        this.cube_r106.setRotationPoint(0.5F, 0.25F, -0.1F);
        this.head.addChild(cube_r106);
        this.setRotateAngle(cube_r106, 0.0F, 0.0F, 0.7854F);
        this.cube_r106.cubeList.add(new ModelBox(cube_r106, 8, 15, -0.5F, -3.0F, 0.0F, 1, 3, 0, 0.0F, false));

        this.cube_r107 = new AdvancedModelRenderer(this);
        this.cube_r107.setRotationPoint(0.5F, 0.25F, -0.4F);
        this.head.addChild(cube_r107);
        this.setRotateAngle(cube_r107, 0.0F, 0.0F, 0.2618F);
        this.cube_r107.cubeList.add(new ModelBox(cube_r107, 8, 15, -0.5F, -3.0F, 0.0F, 1, 3, 0, 0.0F, false));

        this.cube_r108 = new AdvancedModelRenderer(this);
        this.cube_r108.setRotationPoint(1.0F, 0.75F, -1.0F);
        this.head.addChild(cube_r108);
        this.setRotateAngle(cube_r108, 0.0F, 0.3927F, 0.0F);
        this.cube_r108.cubeList.add(new ModelBox(cube_r108, 20, 21, 0.0F, -0.5F, 0.0F, 1, 1, 0, 0.0F, false));

        this.leftAppendage = new AdvancedModelRenderer(this);
        this.leftAppendage.setRotationPoint(0.75F, 2.0F, -2.0F);
        this.head.addChild(leftAppendage);
        this.setRotateAngle(leftAppendage, -0.6545F, -0.2182F, -0.3491F);
        this.leftAppendage.cubeList.add(new ModelBox(leftAppendage, 16, 21, 0.0F, 0.0F, -1.0F, 0, 1, 1, 0.0F, false));

        this.rightAppendage = new AdvancedModelRenderer(this);
        this.rightAppendage.setRotationPoint(-0.75F, 2.0F, -2.0F);
        this.head.addChild(rightAppendage);
        this.setRotateAngle(rightAppendage, -0.6545F, 0.2182F, 0.3491F);
        this.rightAppendage.cubeList.add(new ModelBox(rightAppendage, 16, 21, 0.0F, 0.0F, -1.0F, 0, 1, 1, 0.0F, true));

        this.leftAntenna = new AdvancedModelRenderer(this);
        this.leftAntenna.setRotationPoint(0.75F, 1.0F, -3.0F);
        this.head.addChild(leftAntenna);
        this.setRotateAngle(leftAntenna, 0.0873F, 0.0F, 0.0F);
        this.leftAntenna.cubeList.add(new ModelBox(leftAntenna, 20, 12, 0.0F, -1.5F, -2.0F, 0, 2, 2, 0.0F, false));

        this.rightAntenna = new AdvancedModelRenderer(this);
        this.rightAntenna.setRotationPoint(-0.75F, 1.0F, -3.0F);
        this.head.addChild(rightAntenna);
        this.setRotateAngle(rightAntenna, 0.0873F, 0.0F, 0.0F);
        this.rightAntenna.cubeList.add(new ModelBox(rightAntenna, 20, 12, 0.0F, -1.5F, -2.0F, 0, 2, 2, 0.0F, true));

        this.leftLeg1 = new AdvancedModelRenderer(this);
        this.leftLeg1.setRotationPoint(1.0F, 1.5F, -1.25F);
        this.head.addChild(leftLeg1);
        this.setRotateAngle(leftLeg1, 0.0F, 0.2618F, 1.1345F);
        this.leftLeg1.cubeList.add(new ModelBox(leftLeg1, 20, 10, 0.0F, 0.0F, -0.5F, 2, 1, 1, 0.0F, false));

        this.rightLeg1 = new AdvancedModelRenderer(this);
        this.rightLeg1.setRotationPoint(-1.0F, 1.5F, -1.25F);
        this.head.addChild(rightLeg1);
        this.setRotateAngle(rightLeg1, 0.0F, -0.2618F, -1.1345F);
        this.rightLeg1.cubeList.add(new ModelBox(rightLeg1, 20, 10, -2.0F, 0.0F, -0.5F, 2, 1, 1, 0.0F, true));

        updateDefaultPose();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        this.body.render(f5);
    }
    public void renderStaticFloor(float f) {
        this.setRotateAngle(head, 0.1F, 0.0F, 0.0F);
        this.setRotateAngle(body, -0.2F, 0.2F, 0.0F);
        this.setRotateAngle(tail1, 0.1F, 0.2F, 0.0F);
        this.body.offsetY = 0.34F;
        this.body.render(0.01F);
        resetToDefaultPose();
    }

    @Override
    public void renderStaticBook(float f) {
        //Rotations, positions and sizing:
        this.body.offsetY = -2.4F;
        this.body.offsetX = 1.7F;
        this.body.rotateAngleY = (float)Math.toRadians(225);
        this.body.rotateAngleX = (float)Math.toRadians(25);
        this.body.rotateAngleZ = (float)Math.toRadians(-25);
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

    public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }

    @Override
    public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
        super.setRotationAngles(f, f1, f2, f3, f4, f5, e);
        this.resetToDefaultPose();
        //this.body.offsetY = 1.320F;

        AdvancedModelRenderer[] bodyF = {this.neck, this.head};
        AdvancedModelRenderer[] bodyB = {this.body, this.tail1};

        EntityPrehistoricFloraPalaeocampa ee = (EntityPrehistoricFloraPalaeocampa) e;

        if (ee.getAnimation() != ee.LOOK_ANIMATION) {
            this.faceTarget(f3, f4, 6, head);
            this.faceTarget(f3, f4, 10, body);
        }

        float legFlapDegree = 0.3F;
        float legWalkDegree = 0.5F;
        float legSpeed = 0.23F;
        if (f3 != 0.0f || ee.getAnimation() == ee.LOOK_ANIMATION) {
            this.flap(leftLeg1, legSpeed, -legFlapDegree, false, 0, -legFlapDegree, f2, 0.3F);
            this.flap(rightLeg1, legSpeed, legFlapDegree, false, 2F, legFlapDegree, f2, 0.3F);
            this.flap(leftLeg2, legSpeed, -legFlapDegree, false, 2.0F, -legFlapDegree, f2, 0.3F);
            this.flap(rightLeg2, legSpeed, legFlapDegree, false, 4.0F, legFlapDegree, f2, 0.3F);
            this.flap(leftLeg3, legSpeed, -legFlapDegree, false, 4.0F, -legFlapDegree, f2, 0.3F);
            this.flap(rightLeg3, legSpeed, legFlapDegree, false, 6.0F, legFlapDegree, f2, 0.3F);
            this.flap(leftLeg4, legSpeed, -legFlapDegree, false, 6.0F, -legFlapDegree, f2, 0.3F);
            this.flap(rightLeg4, legSpeed, legFlapDegree, false, 6.0F, legFlapDegree, f2, 0.3F);
            this.flap(leftLeg5, legSpeed, -legFlapDegree, false, 8.0F, -legFlapDegree, f2, 0.3F);
            this.flap(rightLeg5, legSpeed, legFlapDegree, false, 10.0F, legFlapDegree, f2, 0.3F);
        }
        if (ee.getAnimation() != ee.LOOK_ANIMATION && f3 != 0.0F) {
            this.flap(leftLeg6, legSpeed * 1.1F, -legFlapDegree, false, 10.0F, -legFlapDegree, f2, 0.3F);
            this.flap(rightLeg6, legSpeed * 1.1F, legFlapDegree, false, 12.0F, legFlapDegree, f2, 0.3F);
            this.flap(leftLeg7, legSpeed * 1.2F, -legFlapDegree, false, 12.0F, -legFlapDegree, f2, 0.3F);
            this.flap(rightLeg7, legSpeed * 1.2F, legFlapDegree, false, 14.0F, legFlapDegree, f2, 0.3F);
            this.flap(leftLeg8, legSpeed * 1.2F, -legFlapDegree, false, 14.0F, -legFlapDegree, f2, 0.3F);
            this.flap(rightLeg8, legSpeed * 1.2F, legFlapDegree, false, 16.0F, legFlapDegree, f2, 0.3F);
            this.flap(leftLeg9, legSpeed * 1.2F, -legFlapDegree, false, 16.0F, -legFlapDegree, f2, 0.3F);
            this.flap(rightLeg9, legSpeed * 1.2F, legFlapDegree, false, 18.0F, legFlapDegree, f2, 0.3F);
            this.flap(leftLeg10, legSpeed * 1.2F, -legFlapDegree, false, 16.0F, -legFlapDegree, f2, 0.3F);
            this.flap(rightLeg10, legSpeed * 1.2F, legFlapDegree, false, 18.0F, legFlapDegree, f2, 0.3F);
        }

        if (f3 != 0.0f || ee.getAnimation() == ee.LOOK_ANIMATION) {
            this.walk(leftLeg1, legSpeed, -legWalkDegree, false, 0, -legWalkDegree, f2, 0.3F);
            this.walk(rightLeg1, legSpeed, legWalkDegree, false, 2F, legWalkDegree, f2, 0.3F);
            this.walk(leftLeg2, legSpeed, -legWalkDegree, false, 2.0F, -legWalkDegree, f2, 0.3F);
            this.walk(rightLeg2, legSpeed, legWalkDegree, false, 4.0F, legWalkDegree, f2, 0.3F);
            this.walk(leftLeg3, legSpeed, -legWalkDegree, false, 4.0F, -legWalkDegree, f2, 0.3F);
            this.walk(rightLeg3, legSpeed, legWalkDegree, false, 6.0F, legWalkDegree, f2, 0.3F);
            this.walk(leftLeg4, legSpeed, -legWalkDegree, false, 6.0F, -legWalkDegree, f2, 0.3F);
            this.walk(rightLeg4, legSpeed, legWalkDegree, false, 8.0F, legWalkDegree, f2, 0.3F);
            this.walk(leftLeg5, legSpeed, -legWalkDegree, false, 8.0F, -legWalkDegree, f2, 0.3F);
            this.walk(rightLeg5, legSpeed, legWalkDegree, false, 10.0F, legWalkDegree, f2, 0.3F);
        }
        if (ee.getAnimation() != ee.LOOK_ANIMATION && f3 != 0.0F) {
            this.walk(leftLeg6, legSpeed * 1.1F, -legWalkDegree * 1.1F, false, 10.0F, -legWalkDegree, f2, 0.3F);
            this.walk(rightLeg6, legSpeed * 1.1F, legWalkDegree * 1.1F, false, 12.0F, legWalkDegree, f2, 0.3F);
            this.walk(leftLeg7, legSpeed * 1.2F, -legWalkDegree * 1.2F, false, 12.0F, -legWalkDegree, f2, 0.3F);
            this.walk(rightLeg7, legSpeed * 1.2F, legWalkDegree * 1.2F, false, 14.0F, legWalkDegree, f2, 0.3F);
            this.walk(leftLeg8, legSpeed * 1.2F, -legWalkDegree * 1.2F, false, 14.0F, -legWalkDegree, f2, 0.3F);
            this.walk(rightLeg8, legSpeed * 1.2F, legWalkDegree * 1.2F, false, 16.0F, legWalkDegree, f2, 0.3F);
            this.walk(leftLeg9, legSpeed * 1.2F, -legWalkDegree * 1.2F, false, 16.0F, -legWalkDegree, f2, 0.3F);
            this.walk(rightLeg9, legSpeed * 1.2F, legWalkDegree * 1.2F, false, 18.0F, legWalkDegree, f2, 0.3F);
            this.walk(leftLeg10, legSpeed * 1.2F, -legWalkDegree * 1.2F, false, 16.0F, -legWalkDegree, f2, 0.3F);
            this.walk(rightLeg10, legSpeed * 1.2F, legWalkDegree * 1.2F, false, 18.0F, legWalkDegree, f2, 0.3F);
        }

        if (ee.getAnimation() != ee.LOOK_ANIMATION && f3 != 0.0F) {
            this.bob(body, 1F, 0.05F, false, f2, 1);
        }
        //this.walk(body6, 0.8F, -0.010f, false, 2, 0.15F, f2, 0.8F);

        if (ee.getAnimation() != ee.LOOK_ANIMATION) {
            this.chainWave(bodyF, legSpeed * 1.25F, 0.4f, -0.8F, f2, 0.4F);
            this.chainSwing(bodyF, legSpeed * 1.25F, 0.25F, 0.8F, f2, 0.45F);
        }

        this.chainSwing(bodyB, 0.085F, 0.25f, 0.1, f2, 0.15F);

        this.walk(leftAppendage, legSpeed * 1.1F, -legWalkDegree * 1.4F, false, 0.0F, -legWalkDegree, f2, 0.3F);
        this.flap(leftAppendage, legSpeed * 1.1F, -legWalkDegree * 1.4F, false, 0.0F, -legWalkDegree, f2, 0.3F);
        this.swing(leftAppendage, legSpeed * 1.1F, -legWalkDegree * 1.4F, false, 0.0F, -legWalkDegree, f2, 0.3F);


        this.walk(rightAppendage, legSpeed * 1.1F, -legWalkDegree * 1.4F, false, 0.0F, -legWalkDegree, f2, 0.3F);
        this.flap(rightAppendage, legSpeed * 1.1F, legWalkDegree * 1.4F, false, 0.0F, legWalkDegree, f2, 0.3F);
        this.swing(rightAppendage, legSpeed * 1.1F, -legWalkDegree * 1.4F, false, 0.0F, -legWalkDegree, f2, 0.3F);

        this.swing(leftAntenna, 0.36F, -0.21F, false, 0, -0.11F, f2, 0.8F);
        this.swing(rightAntenna, 0.36F, 0.21F, false, 0, 0.11F, f2, 0.8F);
    }



    public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        EntityPrehistoricFloraPalaeocampa e = (EntityPrehistoricFloraPalaeocampa) entity;
        animator.update(entity);
        this.resetToDefaultPose();
        setRotationAngles(f, f1, f2, f3, f4, f5, (Entity) entity);

        animator.setAnimation(e.LOOK_ANIMATION);
        animator.startKeyframe(30);
        animator.move(this.body, 0,-1.5F,0);
        animator.rotate(this.tail1, (float) Math.toRadians(17.5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.body, (float) Math.toRadians(-17.5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.neck, (float) Math.toRadians(-17.5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.head, (float) Math.toRadians(20), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(15);
        animator.startKeyframe(15);
        animator.move(this.body, 0,-1.5F,0);
        animator.rotate(this.tail1, (float) Math.toRadians(17.5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.body, (float) Math.toRadians(-17.5), (float) Math.toRadians(12.5), (float) Math.toRadians(0));
        animator.rotate(this.neck, (float) Math.toRadians(-17.5), (float) Math.toRadians(7.5), (float) Math.toRadians(0));
        animator.rotate(this.head, (float) Math.toRadians(20), (float) Math.toRadians(7.5), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(15);
        animator.startKeyframe(15);
        animator.move(this.body, 0,-1.5F,0);
        animator.rotate(this.tail1, (float) Math.toRadians(17.5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.body, (float) Math.toRadians(-17.5), (float) Math.toRadians(-12.5), (float) Math.toRadians(0));
        animator.rotate(this.neck, (float) Math.toRadians(-17.5), (float) Math.toRadians(-7.5), (float) Math.toRadians(0));
        animator.rotate(this.head, (float) Math.toRadians(20), (float) Math.toRadians(-7.5), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(15);
        animator.startKeyframe(15);
        animator.move(this.body, 0,-1.5F,0);
        animator.rotate(this.tail1, (float) Math.toRadians(17.5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.body, (float) Math.toRadians(-17.5), (float) Math.toRadians(12.5), (float) Math.toRadians(0));
        animator.rotate(this.neck, (float) Math.toRadians(-17.5), (float) Math.toRadians(7.5), (float) Math.toRadians(0));
        animator.rotate(this.head, (float) Math.toRadians(20), (float) Math.toRadians(7.5), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(15);
        animator.startKeyframe(15);
        animator.move(this.body, 0,-1.5F,0);
        animator.rotate(this.tail1, (float) Math.toRadians(17.5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.body, (float) Math.toRadians(-17.5), (float) Math.toRadians(-12.5), (float) Math.toRadians(0));
        animator.rotate(this.neck, (float) Math.toRadians(-17.5), (float) Math.toRadians(-7.5), (float) Math.toRadians(0));
        animator.rotate(this.head, (float) Math.toRadians(20), (float) Math.toRadians(-7.5), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(15);
        animator.resetKeyframe(30);
    }
}
