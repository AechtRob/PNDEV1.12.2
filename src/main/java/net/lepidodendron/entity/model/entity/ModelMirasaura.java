package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.EntityPrehistoricFloraMirasaura;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.lepidodendron.entity.model.llibraryextensions.AdvancedModelRendererExtended;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;

public class ModelMirasaura extends ModelBasePalaeopedia {
    private final AdvancedModelRenderer root;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer body;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer scale1;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer chest;
    private final AdvancedModelRenderer cube_r6;
    private final AdvancedModelRenderer cube_r7;
    private final AdvancedModelRenderer neck;
    private final AdvancedModelRenderer cube_r8;
    private final AdvancedModelRenderer cube_r9;
    private final AdvancedModelRenderer cube_r10;
    private final AdvancedModelRenderer cube_r11;
    private final AdvancedModelRenderer head;
    private final AdvancedModelRenderer cube_r12;
    private final AdvancedModelRenderer cube_r13;
    private final AdvancedModelRenderer cube_r14;
    private final AdvancedModelRenderer cube_r15;
    private final AdvancedModelRenderer jaw;
    private final AdvancedModelRenderer cube_r16;
    private final AdvancedModelRenderer cube_r17;
    private final AdvancedModelRenderer rightArm1;
    private final AdvancedModelRenderer cube_r18;
    private final AdvancedModelRenderer rightArm2;
    private final AdvancedModelRenderer cube_r19;
    private final AdvancedModelRenderer rightArm3;
    private final AdvancedModelRenderer cube_r20;
    private final AdvancedModelRenderer leftArm1;
    private final AdvancedModelRenderer cube_r21;
    private final AdvancedModelRenderer leftArm2;
    private final AdvancedModelRenderer cube_r22;
    private final AdvancedModelRenderer leftArm3;
    private final AdvancedModelRenderer cube_r23;
    private final AdvancedModelRenderer tail1;
    private final AdvancedModelRenderer tail2;
    private final AdvancedModelRenderer tail3;
    private final AdvancedModelRenderer tail4;
    private final AdvancedModelRenderer rightLeg1;
    private final AdvancedModelRenderer cube_r24;
    private final AdvancedModelRenderer rightLeg2;
    private final AdvancedModelRenderer cube_r25;
    private final AdvancedModelRenderer rightLeg3;
    private final AdvancedModelRenderer cube_r26;
    private final AdvancedModelRenderer leftLeg1;
    private final AdvancedModelRenderer cube_r27;
    private final AdvancedModelRenderer leftLeg2;
    private final AdvancedModelRenderer cube_r28;
    private final AdvancedModelRenderer leftLeg3;
    private final AdvancedModelRenderer cube_r29;

    private ModelAnimator animator;

    public ModelMirasaura() {
        this.textureWidth = 64;
        this.textureHeight = 64;

        this.root = new AdvancedModelRenderer(this);
        this.root.setRotationPoint(0.0F, 19.2768F, 4.5956F);


        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(0.0F, -0.0018F, 0.9544F);
        this.root.addChild(cube_r1);
        this.setRotateAngle(cube_r1, -0.1745F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 42, 16, -1.0F, 0.5F, 0.0F, 2, 1, 3, -0.01F, false));
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 40, 10, -1.0F, -1.0F, 0.0F, 2, 2, 3, 0.0F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(1.5F, 0.0732F, -1.8956F);
        this.root.addChild(cube_r2);
        this.setRotateAngle(cube_r2, -0.0873F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 23, 20, -3.0F, 1.0F, -2.5F, 3, 1, 6, -0.02F, false));
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 23, 0, -3.0F, -1.5F, -2.5F, 3, 3, 6, -0.01F, false));

        this.body = new AdvancedModelRenderer(this);
        this.body.setRotationPoint(0.0F, -0.7768F, -4.1456F);
        this.root.addChild(body);


        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(0.0F, 1.0F, -2.3F);
        this.body.addChild(cube_r3);
        this.setRotateAngle(cube_r3, -0.0262F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 23, 10, -1.5F, -2.0F, -2.5F, 3, 4, 5, 0.0F, false));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(-0.5F, 0.8216F, -5.9035F);
        this.body.addChild(cube_r4);
        this.setRotateAngle(cube_r4, -0.1527F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 26, 38, 0.0F, -2.575F, -0.05F, 1, 1, 5, 0.0F, false));

        this.scale1 = new AdvancedModelRenderer(this);
        this.scale1.setRotationPoint(0.0F, -0.6553F, -6.322F);
        this.body.addChild(scale1);
        this.setRotateAngle(scale1, 0.1745F, 0.0F, 0.0F);


        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(0.0F, 6.0F, -0.5F);
        this.scale1.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.0087F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 23, 28, -0.025F, -5.5F, 4.45F, 0, 2, 7, 0.0F, false));
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 0, 0, -0.025F, -25.5F, 0.45F, 0, 20, 11, 0.0F, false));

        this.chest = new AdvancedModelRenderer(this);
        this.chest.setRotationPoint(0.0F, -0.5631F, -4.6315F);
        this.body.addChild(chest);


        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(-0.5F, -0.9645F, -0.6762F);
        this.chest.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.8945F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 50, 41, 0.0F, -0.325F, -2.0F, 1, 2, 2, 0.01F, false));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(0.0F, 1.4631F, -1.0185F);
        this.chest.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.0654F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 0, 39, -1.0F, -1.575F, -1.1F, 2, 3, 3, 0.01F, false));

        this.neck = new AdvancedModelRenderer(this);
        this.neck.setRotationPoint(0.0F, 1.1234F, -2.0302F);
        this.chest.addChild(neck);


        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(0.0F, 0.655F, -1.1101F);
        this.neck.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.0393F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 43, 51, -1.0F, -1.475F, 0.5F, 2, 1, 1, -0.02F, false));

        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(0.025F, 0.805F, -1.1101F);
        this.neck.addChild(cube_r9);
        this.setRotateAngle(cube_r9, -0.5585F, 0.0F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 29, 45, -1.025F, -1.5F, -1.8F, 1, 1, 3, 0.0F, true));
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 29, 45, -0.025F, -1.5F, -1.8F, 1, 1, 3, 0.0F, false));

        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(0.0F, 0.655F, -1.1101F);
        this.neck.addChild(cube_r10);
        this.setRotateAngle(cube_r10, -0.6632F, 0.0F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 42, 21, -1.0F, -1.5F, -1.8F, 2, 1, 3, -0.01F, false));

        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(0.0F, 0.63F, -1.1101F);
        this.neck.addChild(cube_r11);
        this.setRotateAngle(cube_r11, -0.4887F, 0.0F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 38, 28, -1.0F, -0.8F, -1.975F, 2, 1, 4, -0.02F, false));

        this.head = new AdvancedModelRenderer(this);
        this.head.setRotationPoint(0.0F, -1.3412F, -1.6714F);
        this.neck.addChild(head);
        this.head.cubeList.add(new ModelBox(head, 51, 30, -1.0F, 0.5538F, -0.8417F, 2, 1, 1, 0.015F, false));
        this.head.cubeList.add(new ModelBox(head, 50, 34, -1.0F, 0.5538F, -2.4667F, 2, 1, 2, 0.01F, false));
        this.head.cubeList.add(new ModelBox(head, 53, 20, 0.2F, 0.1038F, -2.4417F, 1, 1, 1, 0.01F, false));
        this.head.cubeList.add(new ModelBox(head, 53, 20, -1.2F, 0.1038F, -2.4417F, 1, 1, 1, 0.01F, true));
        this.head.cubeList.add(new ModelBox(head, 0, 51, 0.025F, 0.1038F, -1.7917F, 1, 1, 2, 0.01F, false));
        this.head.cubeList.add(new ModelBox(head, 0, 51, -1.025F, 0.1038F, -1.7917F, 1, 1, 2, 0.01F, true));
        this.head.cubeList.add(new ModelBox(head, 0, 32, -0.5F, 0.566F, -6.0417F, 1, 1, 5, 0.02F, false));
        this.head.cubeList.add(new ModelBox(head, 23, 37, 0.4F, 0.766F, -5.5417F, 0, 1, 4, 0.0F, false));
        this.head.cubeList.add(new ModelBox(head, 23, 37, -0.4F, 0.766F, -5.5417F, 0, 1, 4, 0.0F, true));

        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(-0.525F, 1.066F, -4.0417F);
        this.head.addChild(cube_r12);
        this.setRotateAngle(cube_r12, 0.0F, -0.2182F, 0.0F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 51, 10, 0.0F, -0.5F, 0.0F, 1, 1, 2, 0.0F, true));

        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(0.525F, 1.066F, -4.0417F);
        this.head.addChild(cube_r13);
        this.setRotateAngle(cube_r13, 0.0F, 0.2182F, 0.0F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 51, 10, -1.0F, -0.5F, 0.0F, 1, 1, 2, 0.0F, false));

        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(0.5F, -0.0702F, -2.1644F);
        this.head.addChild(cube_r14);
        this.setRotateAngle(cube_r14, 0.3316F, 0.0F, 0.0F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 51, 6, -1.0F, 0.0F, -2.0F, 1, 1, 2, 0.02F, false));

        this.cube_r15 = new AdvancedModelRenderer(this);
        this.cube_r15.setRotationPoint(0.0F, 0.2538F, -0.9917F);
        this.head.addChild(cube_r15);
        this.setRotateAngle(cube_r15, 0.0873F, 0.0F, 0.0F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 27, 50, -1.0F, -0.45F, -1.5F, 2, 1, 2, 0.01F, false));
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 50, 51, -1.0F, -0.45F, 0.125F, 2, 1, 1, 0.02F, false));

        this.jaw = new AdvancedModelRenderer(this);
        this.jaw.setRotationPoint(0.0F, 1.0538F, -0.0417F);
        this.head.addChild(jaw);
        this.setRotateAngle(jaw, -0.0262F, 0.0F, 0.0F);
        this.jaw.cubeList.add(new ModelBox(jaw, 53, 14, -0.5F, -0.7F, -1.4485F, 1, 1, 1, 0.0F, false));
        this.jaw.cubeList.add(new ModelBox(jaw, 13, 38, -0.5F, -0.1033F, -5.9488F, 1, 1, 5, 0.01F, false));
        this.jaw.cubeList.add(new ModelBox(jaw, 21, 38, 0.4F, -0.3033F, -5.4488F, 0, 1, 3, 0.0F, false));
        this.jaw.cubeList.add(new ModelBox(jaw, 21, 38, -0.4F, -0.3033F, -5.4488F, 0, 1, 3, 0.0F, true));
        this.jaw.cubeList.add(new ModelBox(jaw, 42, 6, -1.0F, -0.075F, -2.4F, 2, 1, 2, -0.01F, false));
        this.jaw.cubeList.add(new ModelBox(jaw, 36, 51, -1.0F, -0.075F, -0.8F, 2, 1, 1, -0.005F, false));

        this.cube_r16 = new AdvancedModelRenderer(this);
        this.cube_r16.setRotationPoint(-0.5F, 0.3967F, -3.9488F);
        this.jaw.addChild(cube_r16);
        this.setRotateAngle(cube_r16, 0.0F, -0.192F, 0.0F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 51, 26, 0.0F, -0.5F, 0.0F, 1, 1, 2, 0.0F, true));

        this.cube_r17 = new AdvancedModelRenderer(this);
        this.cube_r17.setRotationPoint(0.5F, 0.3967F, -3.9488F);
        this.jaw.addChild(cube_r17);
        this.setRotateAngle(cube_r17, 0.0F, 0.192F, 0.0F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 51, 26, -1.0F, -0.5F, 0.0F, 1, 1, 2, 0.0F, false));

        this.rightArm1 = new AdvancedModelRenderer(this);
        this.rightArm1.setRotationPoint(-0.855F, 2.056F, -0.454F);
        this.chest.addChild(rightArm1);
        this.setRotateAngle(rightArm1, -0.1125F, 0.3855F, 0.1945F);


        this.cube_r18 = new AdvancedModelRenderer(this);
        this.cube_r18.setRotationPoint(-0.9047F, 1.0386F, 0.639F);
        this.rightArm1.addChild(cube_r18);
        this.setRotateAngle(cube_r18, -0.6981F, -1.2149F, 0.0188F);
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 13, 32, -0.5435F, -0.6331F, -1.6786F, 1, 1, 3, 0.01F, true));

        this.rightArm2 = new AdvancedModelRenderer(this);
        this.rightArm2.setRotationPoint(-1.8681F, 1.3325F, 0.9143F);
        this.rightArm1.addChild(rightArm2);
        this.setRotateAngle(rightArm2, 0.4347F, 0.1597F, -0.3256F);


        this.cube_r19 = new AdvancedModelRenderer(this);
        this.cube_r19.setRotationPoint(0.3919F, -0.079F, -0.031F);
        this.rightArm2.addChild(cube_r19);
        this.setRotateAngle(cube_r19, -0.535F, 0.1629F, -0.0089F);
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 53, 0, -0.8691F, 0.0113F, -0.4432F, 1, 3, 1, 0.0F, true));

        this.rightArm3 = new AdvancedModelRenderer(this);
        this.rightArm3.setRotationPoint(-0.0039F, 2.4084F, -1.7417F);
        this.rightArm2.addChild(rightArm3);
        this.setRotateAngle(rightArm3, 0.2508F, -0.8406F, 0.338F);


        this.cube_r20 = new AdvancedModelRenderer(this);
        this.cube_r20.setRotationPoint(0.2102F, -2.496F, 1.9041F);
        this.rightArm3.addChild(cube_r20);
        this.setRotateAngle(cube_r20, -0.535F, 0.1629F, -0.0089F);
        this.cube_r20.cubeList.add(new ModelBox(cube_r20, 50, 38, -1.5433F, 3.0984F, -1.8969F, 2, 0, 2, 0.0F, true));

        this.leftArm1 = new AdvancedModelRenderer(this);
        this.leftArm1.setRotationPoint(0.855F, 2.056F, -0.454F);
        this.chest.addChild(leftArm1);
        this.setRotateAngle(leftArm1, -0.1125F, -0.3855F, -0.1945F);


        this.cube_r21 = new AdvancedModelRenderer(this);
        this.cube_r21.setRotationPoint(0.9047F, 1.0386F, 0.639F);
        this.leftArm1.addChild(cube_r21);
        this.setRotateAngle(cube_r21, -0.6981F, 1.2149F, -0.0188F);
        this.cube_r21.cubeList.add(new ModelBox(cube_r21, 13, 32, -0.4565F, -0.6331F, -1.6786F, 1, 1, 3, 0.01F, false));

        this.leftArm2 = new AdvancedModelRenderer(this);
        this.leftArm2.setRotationPoint(1.8681F, 1.3325F, 0.9143F);
        this.leftArm1.addChild(leftArm2);
        this.setRotateAngle(leftArm2, 0.4347F, -0.1597F, 0.3256F);


        this.cube_r22 = new AdvancedModelRenderer(this);
        this.cube_r22.setRotationPoint(-0.3919F, -0.079F, -0.031F);
        this.leftArm2.addChild(cube_r22);
        this.setRotateAngle(cube_r22, -0.535F, -0.1629F, 0.0089F);
        this.cube_r22.cubeList.add(new ModelBox(cube_r22, 53, 0, -0.1309F, 0.0113F, -0.4432F, 1, 3, 1, 0.0F, false));

        this.leftArm3 = new AdvancedModelRenderer(this);
        this.leftArm3.setRotationPoint(0.0039F, 2.4084F, -1.7417F);
        this.leftArm2.addChild(leftArm3);
        this.setRotateAngle(leftArm3, 0.2508F, 0.8406F, -0.338F);


        this.cube_r23 = new AdvancedModelRenderer(this);
        this.cube_r23.setRotationPoint(-0.2102F, -2.496F, 1.9041F);
        this.leftArm3.addChild(cube_r23);
        this.setRotateAngle(cube_r23, -0.535F, -0.1629F, 0.0089F);
        this.cube_r23.cubeList.add(new ModelBox(cube_r23, 50, 38, -0.4567F, 3.0984F, -1.8969F, 2, 0, 2, 0.0F, false));

        this.tail1 = new AdvancedModelRenderer(this);
        this.tail1.setRotationPoint(0.0F, -0.1726F, 4.018F);
        this.root.addChild(tail1);
        this.setRotateAngle(tail1, -0.1745F, 0.0F, 0.0F);
        this.tail1.cubeList.add(new ModelBox(tail1, 38, 46, -0.825F, -0.205F, 0.01F, 1, 1, 3, 0.0F, false));
        this.tail1.cubeList.add(new ModelBox(tail1, 0, 46, -0.825F, 0.445F, 0.01F, 1, 1, 3, -0.01F, false));
        this.tail1.cubeList.add(new ModelBox(tail1, 47, 46, -0.175F, -0.2F, 0.0F, 1, 1, 3, 0.0F, false));
        this.tail1.cubeList.add(new ModelBox(tail1, 9, 50, -0.175F, 0.45F, 0.0F, 1, 1, 3, -0.01F, false));

        this.tail2 = new AdvancedModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, 0.551F, 2.8736F);
        this.tail1.addChild(tail2);
        this.setRotateAngle(tail2, -0.1222F, 0.0F, 0.0F);
        this.tail2.cubeList.add(new ModelBox(tail2, 39, 40, -0.5F, -0.5F, -0.1F, 1, 1, 4, 0.0F, false));

        this.tail3 = new AdvancedModelRenderer(this);
        this.tail3.setRotationPoint(0.0F, 0.0162F, 3.7518F);
        this.tail2.addChild(tail3);
        this.setRotateAngle(tail3, 0.2182F, 0.0F, 0.0F);
        this.tail3.cubeList.add(new ModelBox(tail3, 39, 34, -0.5F, -0.5F, 0.0F, 1, 1, 4, -0.01F, false));

        this.tail4 = new AdvancedModelRenderer(this);
        this.tail4.setRotationPoint(0.0F, 0.0048F, 3.7482F);
        this.tail3.addChild(tail4);
        this.setRotateAngle(tail4, 0.2618F, 0.0F, 0.0F);
        this.tail4.cubeList.add(new ModelBox(tail4, 42, 0, -0.5F, -0.5F, 0.0F, 1, 1, 4, 0.0F, false));

        this.rightLeg1 = new AdvancedModelRenderer(this);
        this.rightLeg1.setRotationPoint(-0.9947F, -0.1868F, 2.3537F);
        this.root.addChild(rightLeg1);
        this.setRotateAngle(rightLeg1, -0.7915F, 0.089F, -0.4511F);


        this.cube_r24 = new AdvancedModelRenderer(this);
        this.cube_r24.setRotationPoint(-0.3008F, 1.1202F, -0.2607F);
        this.rightLeg1.addChild(cube_r24);
        this.setRotateAngle(cube_r24, -1.6166F, 0.1669F, 0.7799F);
        this.cube_r24.cubeList.add(new ModelBox(cube_r24, 20, 45, -1.0F, -1.147F, -1.0553F, 1, 1, 3, 0.0F, true));
        this.cube_r24.cubeList.add(new ModelBox(cube_r24, 11, 45, -1.0F, -0.622F, -1.0553F, 1, 1, 3, 0.01F, true));

        this.rightLeg2 = new AdvancedModelRenderer(this);
        this.rightLeg2.setRotationPoint(-2.0196F, 2.104F, -0.4351F);
        this.rightLeg1.addChild(rightLeg2);
        this.setRotateAngle(rightLeg2, 0.3491F, 0.0076F, 0.542F);


        this.cube_r25 = new AdvancedModelRenderer(this);
        this.cube_r25.setRotationPoint(0.3862F, -0.5035F, 0.5429F);
        this.rightLeg2.addChild(cube_r25);
        this.setRotateAngle(cube_r25, -1.2347F, 0.2082F, 0.1967F);
        this.cube_r25.cubeList.add(new ModelBox(cube_r25, 18, 50, -0.6125F, -0.1193F, 0.2067F, 1, 1, 3, 0.0F, true));

        this.rightLeg3 = new AdvancedModelRenderer(this);
        this.rightLeg3.setRotationPoint(-0.2211F, 2.5696F, 1.2713F);
        this.rightLeg2.addChild(rightLeg3);


        this.cube_r26 = new AdvancedModelRenderer(this);
        this.cube_r26.setRotationPoint(-0.0581F, 0.1728F, -0.5556F);
        this.rightLeg3.addChild(cube_r26);
        this.setRotateAngle(cube_r26, -1.2249F, -0.3442F, -0.0972F);
        this.cube_r26.cubeList.add(new ModelBox(cube_r26, 53, 17, -1.5436F, -0.5588F, -0.0098F, 2, 2, 0, 0.0F, true));

        this.leftLeg1 = new AdvancedModelRenderer(this);
        this.leftLeg1.setRotationPoint(0.9947F, -0.1868F, 2.3537F);
        this.root.addChild(leftLeg1);
        this.setRotateAngle(leftLeg1, -0.7915F, -0.089F, 0.4511F);


        this.cube_r27 = new AdvancedModelRenderer(this);
        this.cube_r27.setRotationPoint(0.3008F, 1.1202F, -0.2607F);
        this.leftLeg1.addChild(cube_r27);
        this.setRotateAngle(cube_r27, -1.6166F, -0.1669F, -0.7799F);
        this.cube_r27.cubeList.add(new ModelBox(cube_r27, 20, 45, 0.0F, -1.147F, -1.0553F, 1, 1, 3, 0.0F, false));
        this.cube_r27.cubeList.add(new ModelBox(cube_r27, 11, 45, 0.0F, -0.622F, -1.0553F, 1, 1, 3, 0.01F, false));

        this.leftLeg2 = new AdvancedModelRenderer(this);
        this.leftLeg2.setRotationPoint(2.0196F, 2.104F, -0.4351F);
        this.leftLeg1.addChild(leftLeg2);
        this.setRotateAngle(leftLeg2, 0.3491F, -0.0076F, -0.542F);


        this.cube_r28 = new AdvancedModelRenderer(this);
        this.cube_r28.setRotationPoint(-0.3862F, -0.5035F, 0.5429F);
        this.leftLeg2.addChild(cube_r28);
        this.setRotateAngle(cube_r28, -1.2347F, -0.2082F, -0.1967F);
        this.cube_r28.cubeList.add(new ModelBox(cube_r28, 18, 50, -0.3875F, -0.1193F, 0.2067F, 1, 1, 3, 0.0F, false));

        this.leftLeg3 = new AdvancedModelRenderer(this);
        this.leftLeg3.setRotationPoint(0.2211F, 2.5696F, 1.2713F);
        this.leftLeg2.addChild(leftLeg3);


        this.cube_r29 = new AdvancedModelRenderer(this);
        this.cube_r29.setRotationPoint(0.0581F, 0.1728F, -0.5556F);
        this.leftLeg3.addChild(cube_r29);
        this.setRotateAngle(cube_r29, -1.2249F, 0.3442F, 0.0972F);
        this.cube_r29.cubeList.add(new ModelBox(cube_r29, 53, 17, -0.4564F, -0.5588F, -0.0098F, 2, 2, 0, 0.0F, false));

        updateDefaultPose();
        animator = ModelAnimator.create();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        animate((IAnimatedEntity) entity, f, f1, f2, f3, f4, f5);
        this.root.render(f5);
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
        this.root.offsetY = -1.7F;
        this.root.offsetX = 1.0F;
        this.root.rotateAngleY = (float)Math.toRadians(230);
        this.root.rotateAngleX = (float)Math.toRadians(8);
        this.root.rotateAngleZ = (float)Math.toRadians(-8);
        this.root.scaleChildren = true;
        float scaler = 2.4F;
        this.root.setScale(scaler, scaler, scaler);
        //Start of pose:

        //End of pose, now render the model:
        this.root.render(f);
        //Reset rotations, positions and sizing:
        this.root.setScale(1.0F, 1.0F, 1.0F);
        this.root.scaleChildren = false;
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
        //this.resetToDefaultPose();
        //this.root.offsetY = 1.28F;

        EntityPrehistoricFloraMirasaura Mirasaura = (EntityPrehistoricFloraMirasaura) e;
        float speed = 0.1f;

        this.faceTarget(f3, f4, 8, neck);
        this.faceTarget(f3, f4, 8, head);

        AdvancedModelRenderer[] Tail = {this.tail1, this.tail2, this.tail3, this.tail4};

        if(Mirasaura.getIsMoving()) {

        } else {
            this.chainSwing(Tail, (speed * 0.6F) * 2F, 0.05F, 0.12F, f2, 1F);
            this.chainWave(Tail, (speed * 0.35F), 0.125F * 0.1F, 0.2F, f2, 1F);
        }

        if (Mirasaura.getIsClimbing()) {
            //Pose for climbing:
            //this.root.offsetY = 1.40F;
        }

    }

    @Override
    public void setLivingAnimations(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        super.setLivingAnimations(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
        this.resetToDefaultPose();
        EntityPrehistoricFloraMirasaura ee = (EntityPrehistoricFloraMirasaura) entitylivingbaseIn;


        if(ee.getIsMoving()) {
            if (ee.getIsFast()) {
                if (ee.getIsClimbing()) {
                    if(!ee.getHeadCollided()) {
                        animClimb(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, false);
                    } else {
                        animClimb(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, true);
                    }
                } else {
                    animRun(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
                }
            } else {
                if (ee.getIsClimbing()) {
                    if(!ee.getHeadCollided()) {
                        animClimb(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, false);
                    } else {
                        animClimb(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, true);
                    }
                } else {
                    animWalk(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
                }
            }
        }

        if (ee.getAnimation() == ee.EAT_ANIMATION || ee.getAnimation() == ee.ATTACK_ANIMATION) {
            animEat(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.LAY_ANIMATION) {
            animLay(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.MAKE_NEST_ANIMATION) {
            animNest(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.ROAR_ANIMATION) {
            animNoise(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }


    }

    public void animLay(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraMirasaura entity = (EntityPrehistoricFloraMirasaura) entitylivingbaseIn;
        int animCycle = 50;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (-8.5-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = -8.5 + (((tickAnim - 20) / 10) * (-8.5-(-8.5)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = -8.5 + (((tickAnim - 30) / 20) * (0-(-8.5)));
            yy = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(root, root.rotateAngleX + (float) Math.toRadians(xx), root.rotateAngleY + (float) Math.toRadians(yy), root.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (-1.825-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            yy = -1.825 + (((tickAnim - 20) / 10) * (-1.825-(-1.825)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            yy = -1.825 + (((tickAnim - 30) / 20) * (0-(-1.825)));
            zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.root.rotationPointX = this.root.rotationPointX + (float)(xx);
        this.root.rotationPointY = this.root.rotationPointY - (float)(yy);
        this.root.rotationPointZ = this.root.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (4.25-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 4.25 + (((tickAnim - 20) / 10) * (4.25-(4.25)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 4.25 + (((tickAnim - 30) / 20) * (0-(4.25)));
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
            xx = 0 + (((tickAnim - 0) / 20) * (9.25-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 9.25 + (((tickAnim - 20) / 10) * (9.25-(9.25)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 9.25 + (((tickAnim - 30) / 20) * (0-(9.25)));
            yy = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(xx), neck.rotateAngleY + (float) Math.toRadians(yy), neck.rotateAngleZ + (float) Math.toRadians(zz));




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
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (18.5-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 18.5 + (((tickAnim - 20) / 10) * (18.5-(18.5)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            zz = 18.5 + (((tickAnim - 30) / 20) * (0-(18.5)));
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
            xx = 0 + (((tickAnim - 0) / 20) * (17.35455-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (6.99566-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (-27.37354-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 17.35455 + (((tickAnim - 20) / 10) * (17.35455-(17.35455)));
            yy = 6.99566 + (((tickAnim - 20) / 10) * (6.99566-(6.99566)));
            zz = -27.37354 + (((tickAnim - 20) / 10) * (-27.37354-(-27.37354)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 17.35455 + (((tickAnim - 30) / 20) * (0-(17.35455)));
            yy = 6.99566 + (((tickAnim - 30) / 20) * (0-(6.99566)));
            zz = -27.37354 + (((tickAnim - 30) / 20) * (0-(-27.37354)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm3, rightArm3.rotateAngleX + (float) Math.toRadians(xx), rightArm3.rotateAngleY + (float) Math.toRadians(yy), rightArm3.rotateAngleZ + (float) Math.toRadians(zz));


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
        this.rightArm3.rotationPointX = this.rightArm3.rotationPointX + (float)(xx);
        this.rightArm3.rotationPointY = this.rightArm3.rotationPointY - (float)(yy);
        this.rightArm3.rotationPointZ = this.rightArm3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (-18.5-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = -18.5 + (((tickAnim - 20) / 10) * (-18.5-(-18.5)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            zz = -18.5 + (((tickAnim - 30) / 20) * (0-(-18.5)));
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
            xx = 0 + (((tickAnim - 0) / 20) * (17.35455-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (6.99566-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (27.37354-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 17.35455 + (((tickAnim - 20) / 10) * (17.35455-(17.35455)));
            yy = 6.99566 + (((tickAnim - 20) / 10) * (6.99566-(6.99566)));
            zz = 27.37354 + (((tickAnim - 20) / 10) * (27.37354-(27.37354)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 17.35455 + (((tickAnim - 30) / 20) * (0-(17.35455)));
            yy = 6.99566 + (((tickAnim - 30) / 20) * (0-(6.99566)));
            zz = 27.37354 + (((tickAnim - 30) / 20) * (0-(27.37354)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm3, leftArm3.rotateAngleX + (float) Math.toRadians(xx), leftArm3.rotateAngleY + (float) Math.toRadians(yy), leftArm3.rotateAngleZ + (float) Math.toRadians(zz));


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
        this.leftArm3.rotationPointX = this.leftArm3.rotationPointX + (float)(xx);
        this.leftArm3.rotationPointY = this.leftArm3.rotationPointY - (float)(yy);
        this.leftArm3.rotationPointZ = this.leftArm3.rotationPointZ + (float)(zz);




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
        this.setRotateAngle(tail1, tail1.rotateAngleX + (float) Math.toRadians(xx), tail1.rotateAngleY + (float) Math.toRadians(yy), tail1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (12.75-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 12.75 + (((tickAnim - 20) / 10) * (12.75-(12.75)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 12.75 + (((tickAnim - 30) / 20) * (0-(12.75)));
            yy = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(xx), tail2.rotateAngleY + (float) Math.toRadians(yy), tail2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (-10-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = -10 + (((tickAnim - 10) / 10) * (0-(-10)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
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
        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(xx), tail3.rotateAngleY + (float) Math.toRadians(yy), tail3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (-15.5-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = -15.5 + (((tickAnim - 20) / 10) * (-15.5-(-15.5)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = -15.5 + (((tickAnim - 30) / 20) * (0-(-15.5)));
            yy = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(xx), tail4.rotateAngleY + (float) Math.toRadians(yy), tail4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (31.97157-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (-21.40933-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (38.64286-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 31.97157 + (((tickAnim - 20) / 10) * (31.97157-(31.97157)));
            yy = -21.40933 + (((tickAnim - 20) / 10) * (-21.40933-(-21.40933)));
            zz = 38.64286 + (((tickAnim - 20) / 10) * (38.64286-(38.64286)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 31.97157 + (((tickAnim - 30) / 20) * (0-(31.97157)));
            yy = -21.40933 + (((tickAnim - 30) / 20) * (0-(-21.40933)));
            zz = 38.64286 + (((tickAnim - 30) / 20) * (0-(38.64286)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg1, rightLeg1.rotateAngleX + (float) Math.toRadians(xx), rightLeg1.rotateAngleY + (float) Math.toRadians(yy), rightLeg1.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (0.525-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 0.525 + (((tickAnim - 20) / 10) * (0.525-(0.525)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 0.525 + (((tickAnim - 30) / 20) * (0-(0.525)));
            yy = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightLeg1.rotationPointX = this.rightLeg1.rotationPointX + (float)(xx);
        this.rightLeg1.rotationPointY = this.rightLeg1.rotationPointY - (float)(yy);
        this.rightLeg1.rotationPointZ = this.rightLeg1.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (45-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 45 + (((tickAnim - 20) / 10) * (45-(45)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 45 + (((tickAnim - 30) / 20) * (0-(45)));
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
            xx = 0 + (((tickAnim - 0) / 20) * (-39.64232-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (-28.77848-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (-40.5045-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = -39.64232 + (((tickAnim - 20) / 10) * (-39.64232-(-39.64232)));
            yy = -28.77848 + (((tickAnim - 20) / 10) * (-28.77848-(-28.77848)));
            zz = -40.5045 + (((tickAnim - 20) / 10) * (-40.5045-(-40.5045)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = -39.64232 + (((tickAnim - 30) / 20) * (0-(-39.64232)));
            yy = -28.77848 + (((tickAnim - 30) / 20) * (0-(-28.77848)));
            zz = -40.5045 + (((tickAnim - 30) / 20) * (0-(-40.5045)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg3, rightLeg3.rotateAngleX + (float) Math.toRadians(xx), rightLeg3.rotateAngleY + (float) Math.toRadians(yy), rightLeg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0.275-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 10) / 10) * (0.4-(0)));
            yy = 0.275 + (((tickAnim - 10) / 10) * (0-(0.275)));
            zz = 0 + (((tickAnim - 10) / 10) * (-0.35-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 0.4 + (((tickAnim - 20) / 10) * (0.4-(0.4)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = -0.35 + (((tickAnim - 20) / 10) * (-0.35-(-0.35)));
        }
        else if (tickAnim >= 30 && tickAnim < 35) {
            xx = 0.4 + (((tickAnim - 30) / 5) * (0.3-(0.4)));
            yy = 0 + (((tickAnim - 30) / 5) * (0.33-(0)));
            zz = -0.35 + (((tickAnim - 30) / 5) * (-0.26-(-0.35)));
        }
        else if (tickAnim >= 35 && tickAnim < 40) {
            xx = 0.3 + (((tickAnim - 35) / 5) * (0.2-(0.3)));
            yy = 0.33 + (((tickAnim - 35) / 5) * (0.35-(0.33)));
            zz = -0.26 + (((tickAnim - 35) / 5) * (-0.17-(-0.26)));
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = 0.2 + (((tickAnim - 40) / 10) * (0-(0.2)));
            yy = 0.35 + (((tickAnim - 40) / 10) * (0-(0.35)));
            zz = -0.17 + (((tickAnim - 40) / 10) * (0-(-0.17)));
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
            xx = 0 + (((tickAnim - 0) / 20) * (31.97157-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (21.40933-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (-38.64286-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 31.97157 + (((tickAnim - 20) / 10) * (31.97157-(31.97157)));
            yy = 21.40933 + (((tickAnim - 20) / 10) * (21.40933-(21.40933)));
            zz = -38.64286 + (((tickAnim - 20) / 10) * (-38.64286-(-38.64286)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 31.97157 + (((tickAnim - 30) / 20) * (0-(31.97157)));
            yy = 21.40933 + (((tickAnim - 30) / 20) * (0-(21.40933)));
            zz = -38.64286 + (((tickAnim - 30) / 20) * (0-(-38.64286)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg1, leftLeg1.rotateAngleX + (float) Math.toRadians(xx), leftLeg1.rotateAngleY + (float) Math.toRadians(yy), leftLeg1.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (0.525-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 0.525 + (((tickAnim - 20) / 10) * (0.525-(0.525)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 0.525 + (((tickAnim - 30) / 20) * (0-(0.525)));
            yy = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftLeg1.rotationPointX = this.leftLeg1.rotationPointX + (float)(xx);
        this.leftLeg1.rotationPointY = this.leftLeg1.rotationPointY - (float)(yy);
        this.leftLeg1.rotationPointZ = this.leftLeg1.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (45-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 45 + (((tickAnim - 20) / 10) * (45-(45)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 45 + (((tickAnim - 30) / 20) * (0-(45)));
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
            xx = 0 + (((tickAnim - 0) / 20) * (-39.64232-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (28.77848-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (40.5045-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = -39.64232 + (((tickAnim - 20) / 10) * (-39.64232-(-39.64232)));
            yy = 28.77848 + (((tickAnim - 20) / 10) * (28.77848-(28.77848)));
            zz = 40.5045 + (((tickAnim - 20) / 10) * (40.5045-(40.5045)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = -39.64232 + (((tickAnim - 30) / 20) * (0-(-39.64232)));
            yy = 28.77848 + (((tickAnim - 30) / 20) * (0-(28.77848)));
            zz = 40.5045 + (((tickAnim - 30) / 20) * (0-(40.5045)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg3, leftLeg3.rotateAngleX + (float) Math.toRadians(xx), leftLeg3.rotateAngleY + (float) Math.toRadians(yy), leftLeg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0.45-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 10) / 10) * (-0.3-(0)));
            yy = 0.45 + (((tickAnim - 10) / 10) * (0-(0.45)));
            zz = 0 + (((tickAnim - 10) / 10) * (-0.425-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = -0.3 + (((tickAnim - 20) / 10) * (-0.3-(-0.3)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = -0.425 + (((tickAnim - 20) / 10) * (-0.425-(-0.425)));
        }
        else if (tickAnim >= 30 && tickAnim < 35) {
            xx = -0.3 + (((tickAnim - 30) / 5) * (-0.22-(-0.3)));
            yy = 0 + (((tickAnim - 30) / 5) * (0.365-(0)));
            zz = -0.425 + (((tickAnim - 30) / 5) * (-0.32-(-0.425)));
        }
        else if (tickAnim >= 35 && tickAnim < 40) {
            xx = -0.22 + (((tickAnim - 35) / 5) * (-0.15-(-0.22)));
            yy = 0.365 + (((tickAnim - 35) / 5) * (0.375-(0.365)));
            zz = -0.32 + (((tickAnim - 35) / 5) * (-0.21-(-0.32)));
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = -0.15 + (((tickAnim - 40) / 10) * (0-(-0.15)));
            yy = 0.375 + (((tickAnim - 40) / 10) * (0-(0.375)));
            zz = -0.21 + (((tickAnim - 40) / 10) * (0-(-0.21)));
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
    public void animNest(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraMirasaura entity = (EntityPrehistoricFloraMirasaura) entitylivingbaseIn;
        int animCycle = 50;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 0) / 25) * (54.93212-(0)));
            yy = 0 + (((tickAnim - 0) / 25) * (-23.96205-(0)));
            zz = 0 + (((tickAnim - 0) / 25) * (-3.93517-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 39) {
            xx = 54.93212 + (((tickAnim - 25) / 14) * (36.30834-(54.93212)));
            yy = -23.96205 + (((tickAnim - 25) / 14) * (-10.70468-(-23.96205)));
            zz = -3.93517 + (((tickAnim - 25) / 14) * (-55.88156-(-3.93517)));
        }
        else if (tickAnim >= 39 && tickAnim < 50) {
            xx = 36.30834 + (((tickAnim - 39) / 11) * (0-(36.30834)));
            yy = -10.70468 + (((tickAnim - 39) / 11) * (0-(-10.70468)));
            zz = -55.88156 + (((tickAnim - 39) / 11) * (0-(-55.88156)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg1, leftLeg1.rotateAngleX + (float) Math.toRadians(xx), leftLeg1.rotateAngleY + (float) Math.toRadians(yy), leftLeg1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 0) / 25) * (23.5-(0)));
            yy = 0 + (((tickAnim - 0) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 25) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 50) {
            xx = 23.5 + (((tickAnim - 25) / 25) * (0-(23.5)));
            yy = 0 + (((tickAnim - 25) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 25) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg2, leftLeg2.rotateAngleX + (float) Math.toRadians(xx), leftLeg2.rotateAngleY + (float) Math.toRadians(yy), leftLeg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (-22.58733-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (4.11853-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (7.24449-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 11) {
            xx = -22.58733 + (((tickAnim - 5) / 6) * (-28.89754-(-22.58733)));
            yy = 4.11853 + (((tickAnim - 5) / 6) * (8.92348-(4.11853)));
            zz = 7.24449 + (((tickAnim - 5) / 6) * (15.69639-(7.24449)));
        }
        else if (tickAnim >= 11 && tickAnim < 25) {
            xx = -28.89754 + (((tickAnim - 11) / 14) * (56.25-(-28.89754)));
            yy = 8.92348 + (((tickAnim - 11) / 14) * (0-(8.92348)));
            zz = 15.69639 + (((tickAnim - 11) / 14) * (0-(15.69639)));
        }
        else if (tickAnim >= 25 && tickAnim < 39) {
            xx = 56.25 + (((tickAnim - 25) / 14) * (78.63-(56.25)));
            yy = 0 + (((tickAnim - 25) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 14) * (0-(0)));
        }
        else if (tickAnim >= 39 && tickAnim < 45) {
            xx = 78.63 + (((tickAnim - 39) / 6) * (8.69189-(78.63)));
            yy = 0 + (((tickAnim - 39) / 6) * (-5.98482-(0)));
            zz = 0 + (((tickAnim - 39) / 6) * (34.29476-(0)));
        }
        else if (tickAnim >= 45 && tickAnim < 50) {
            xx = 8.69189 + (((tickAnim - 45) / 5) * (0-(8.69189)));
            yy = -5.98482 + (((tickAnim - 45) / 5) * (0-(-5.98482)));
            zz = 34.29476 + (((tickAnim - 45) / 5) * (0-(34.29476)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg3, leftLeg3.rotateAngleX + (float) Math.toRadians(xx), leftLeg3.rotateAngleY + (float) Math.toRadians(yy), leftLeg3.rotateAngleZ + (float) Math.toRadians(zz));


    }
    public void animEat(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraMirasaura entity = (EntityPrehistoricFloraMirasaura) entitylivingbaseIn;
        int animCycle = 20;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (26.75-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 26.75 + (((tickAnim - 10) / 10) * (0-(26.75)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(xx), neck.rotateAngleY + (float) Math.toRadians(yy), neck.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (27.37348-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (-0.66276-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (-0.29294-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 27.37348 + (((tickAnim - 5) / 5) * (15.75-(27.37348)));
            yy = -0.66276 + (((tickAnim - 5) / 5) * (0-(-0.66276)));
            zz = -0.29294 + (((tickAnim - 5) / 5) * (0-(-0.29294)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 15.75 + (((tickAnim - 10) / 10) * (0-(15.75)));
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
            xx = 0 + (((tickAnim - 0) / 5) * (9.75-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 9.75 + (((tickAnim - 5) / 3) * (14.75-(9.75)));
            yy = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 3) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 14.75 + (((tickAnim - 8) / 2) * (0-(14.75)));
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
    public void animNoise(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraMirasaura entity = (EntityPrehistoricFloraMirasaura) entitylivingbaseIn;
        int animCycle = 29;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 0) / 14) * (-5.775+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*10-(0)));
            yy = 0 + (((tickAnim - 0) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 14) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 29) {
            xx = -5.775+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*10 + (((tickAnim - 14) / 15) * (0-(-5.775+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*10)));
            yy = 0 + (((tickAnim - 14) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(xx), chest.rotateAngleY + (float) Math.toRadians(yy), chest.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 0) / 14) * (-15.75-(0)));
            yy = 0 + (((tickAnim - 0) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 14) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 29) {
            xx = -15.75 + (((tickAnim - 14) / 15) * (0-(-15.75)));
            yy = 0 + (((tickAnim - 14) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(xx), neck.rotateAngleY + (float) Math.toRadians(yy), neck.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 0) / 14) * (44.675+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-50-(0)));
            yy = 0 + (((tickAnim - 0) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 14) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 29) {
            xx = 44.675+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-50 + (((tickAnim - 14) / 15) * (0-(44.675+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-50)));
            yy = 0 + (((tickAnim - 14) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 0) / 9) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 9) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 9) / 5) * (-59.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*150-(0)));
            yy = 0 + (((tickAnim - 9) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 5) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 29) {
            xx = -59.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*150 + (((tickAnim - 14) / 15) * (0-(-59.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*150)));
            yy = 0 + (((tickAnim - 14) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(xx), jaw.rotateAngleY + (float) Math.toRadians(yy), jaw.rotateAngleZ + (float) Math.toRadians(zz));


    }
    public void animWalk(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraMirasaura entity = (EntityPrehistoricFloraMirasaura) entitylivingbaseIn;
        int animCycle = 40;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        this.setRotateAngle(root, root.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.5))*-2), root.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-50))*4), root.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-50))*-2));
        this.root.rotationPointX = this.root.rotationPointX + (float)(0);
        this.root.rotationPointY = this.root.rotationPointY - (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.5))*-0.5);
        this.root.rotationPointZ = this.root.rotationPointZ + (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.5-50))*0.5);


        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.5-50))*2), body.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-50))*-5), body.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-50))*3));


        this.setRotateAngle(scale1, scale1.rotateAngleX + (float) Math.toRadians(0), scale1.rotateAngleY + (float) Math.toRadians(0), scale1.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-50))*1));


        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(0), chest.rotateAngleY + (float) Math.toRadians(0), chest.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.5-100))*2), neck.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-150))*-1), neck.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.5-100))*-4), head.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-150))*1), head.rotateAngleZ + (float) Math.toRadians(0));



        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 14.75 + (((tickAnim - 0) / 10) * (8.95347-(14.75)));
            yy = 0 + (((tickAnim - 0) / 10) * (-30.11139-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (20.21785-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 8.95347 + (((tickAnim - 10) / 10) * (11.19656-(8.95347)));
            yy = -30.11139 + (((tickAnim - 10) / 10) * (-54.78962-(-30.11139)));
            zz = 20.21785 + (((tickAnim - 10) / 10) * (-26.81842-(20.21785)));
        }
        else if (tickAnim >= 20 && tickAnim < 40) {
            xx = 11.19656 + (((tickAnim - 20) / 20) * (14.75-(11.19656)));
            yy = -54.78962 + (((tickAnim - 20) / 20) * (0-(-54.78962)));
            zz = -26.81842 + (((tickAnim - 20) / 20) * (0-(-26.81842)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm1, rightArm1.rotateAngleX + (float) Math.toRadians(xx), rightArm1.rotateAngleY + (float) Math.toRadians(yy), rightArm1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 60.78687 + (((tickAnim - 0) / 10) * (-45.00785-(60.78687)));
            yy = 16.14048 + (((tickAnim - 0) / 10) * (33.22931-(16.14048)));
            zz = 55.00225 + (((tickAnim - 0) / 10) * (13.94432-(55.00225)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = -45.00785 + (((tickAnim - 10) / 10) * (-29.33941-(-45.00785)));
            yy = 33.22931 + (((tickAnim - 10) / 10) * (16.14165-(33.22931)));
            zz = 13.94432 + (((tickAnim - 10) / 10) * (34.77151-(13.94432)));
        }
        else if (tickAnim >= 20 && tickAnim < 40) {
            xx = -29.33941 + (((tickAnim - 20) / 20) * (60.78687-(-29.33941)));
            yy = 16.14165 + (((tickAnim - 20) / 20) * (16.14048-(16.14165)));
            zz = 34.77151 + (((tickAnim - 20) / 20) * (55.00225-(34.77151)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm2, rightArm2.rotateAngleX + (float) Math.toRadians(xx), rightArm2.rotateAngleY + (float) Math.toRadians(yy), rightArm2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0.025 + (((tickAnim - 0) / 20) * (0-(0.025)));
            yy = -0.275 + (((tickAnim - 0) / 20) * (0-(-0.275)));
            zz = -0.05 + (((tickAnim - 0) / 20) * (0-(-0.05)));
        }
        else if (tickAnim >= 20 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 20) / 20) * (0.025-(0)));
            yy = 0 + (((tickAnim - 20) / 20) * (-0.275-(0)));
            zz = 0 + (((tickAnim - 20) / 20) * (-0.05-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightArm2.rotationPointX = this.rightArm2.rotationPointX + (float)(xx);
        this.rightArm2.rotationPointY = this.rightArm2.rotationPointY - (float)(yy);
        this.rightArm2.rotationPointZ = this.rightArm2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 57.01128 + (((tickAnim - 0) / 3) * (74.36083-(57.01128)));
            yy = 38.24081 + (((tickAnim - 0) / 3) * (79.46999-(38.24081)));
            zz = -46.14569 + (((tickAnim - 0) / 3) * (-72.46178-(-46.14569)));
        }
        else if (tickAnim >= 3 && tickAnim < 10) {
            xx = 74.36083 + (((tickAnim - 3) / 7) * (97.08796-(74.36083)));
            yy = 79.46999 + (((tickAnim - 3) / 7) * (50.05405-(79.46999)));
            zz = -72.46178 + (((tickAnim - 3) / 7) * (-38.66617-(-72.46178)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 97.08796 + (((tickAnim - 10) / 10) * (40.92888-(97.08796)));
            yy = 50.05405 + (((tickAnim - 10) / 10) * (3.36868-(50.05405)));
            zz = -38.66617 + (((tickAnim - 10) / 10) * (-43.90075-(-38.66617)));
        }
        else if (tickAnim >= 20 && tickAnim < 27) {
            xx = 40.92888 + (((tickAnim - 20) / 7) * (-7.00752-(40.92888)));
            yy = 3.36868 + (((tickAnim - 20) / 7) * (19.54373-(3.36868)));
            zz = -43.90075 + (((tickAnim - 20) / 7) * (-30.98337-(-43.90075)));
        }
        else if (tickAnim >= 27 && tickAnim < 31) {
            xx = -7.00752 + (((tickAnim - 27) / 4) * (-17.75164-(-7.00752)));
            yy = 19.54373 + (((tickAnim - 27) / 4) * (25.38657-(19.54373)));
            zz = -30.98337 + (((tickAnim - 27) / 4) * (-35.7216-(-30.98337)));
        }
        else if (tickAnim >= 31 && tickAnim < 40) {
            xx = -17.75164 + (((tickAnim - 31) / 9) * (57.01128-(-17.75164)));
            yy = 25.38657 + (((tickAnim - 31) / 9) * (38.24081-(25.38657)));
            zz = -35.7216 + (((tickAnim - 31) / 9) * (-46.14569-(-35.7216)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm3, rightArm3.rotateAngleX + (float) Math.toRadians(xx), rightArm3.rotateAngleY + (float) Math.toRadians(yy), rightArm3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0.225-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0.225-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 17) {
            xx = 0.225 + (((tickAnim - 3) / 14) * (0.04-(0.225)));
            yy = 0 + (((tickAnim - 3) / 14) * (0.3-(0)));
            zz = 0.225 + (((tickAnim - 3) / 14) * (0.04-(0.225)));
        }
        else if (tickAnim >= 17 && tickAnim < 20) {
            xx = 0.04 + (((tickAnim - 17) / 3) * (0-(0.04)));
            yy = 0.3 + (((tickAnim - 17) / 3) * (-0.175-(0.3)));
            zz = 0.04 + (((tickAnim - 17) / 3) * (0-(0.04)));
        }
        else if (tickAnim >= 20 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 20) / 3) * (0-(0)));
            yy = -0.175 + (((tickAnim - 20) / 3) * (0.415-(-0.175)));
            zz = 0 + (((tickAnim - 20) / 3) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 23) / 2) * (0-(0)));
            yy = 0.415 + (((tickAnim - 23) / 2) * (0.89-(0.415)));
            zz = 0 + (((tickAnim - 23) / 2) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 27) {
            xx = 0 + (((tickAnim - 25) / 2) * (0-(0)));
            yy = 0.89 + (((tickAnim - 25) / 2) * (0.9-(0.89)));
            zz = 0 + (((tickAnim - 25) / 2) * (0-(0)));
        }
        else if (tickAnim >= 27 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 27) / 13) * (0-(0)));
            yy = 0.9 + (((tickAnim - 27) / 13) * (0-(0.9)));
            zz = 0 + (((tickAnim - 27) / 13) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightArm3.rotationPointX = this.rightArm3.rotationPointX + (float)(xx);
        this.rightArm3.rotationPointY = this.rightArm3.rotationPointY - (float)(yy);
        this.rightArm3.rotationPointZ = this.rightArm3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 11.19656 + (((tickAnim - 0) / 20) * (14.75-(11.19656)));
            yy = 54.78962 + (((tickAnim - 0) / 20) * (0-(54.78962)));
            zz = 26.81842 + (((tickAnim - 0) / 20) * (0-(26.81842)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 14.75 + (((tickAnim - 20) / 10) * (8.95347-(14.75)));
            yy = 0 + (((tickAnim - 20) / 10) * (30.11139-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (-20.21785-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = 8.95347 + (((tickAnim - 30) / 10) * (11.19656-(8.95347)));
            yy = 30.11139 + (((tickAnim - 30) / 10) * (54.78962-(30.11139)));
            zz = -20.21785 + (((tickAnim - 30) / 10) * (26.81842-(-20.21785)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm1, leftArm1.rotateAngleX + (float) Math.toRadians(xx), leftArm1.rotateAngleY + (float) Math.toRadians(yy), leftArm1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = -29.33941 + (((tickAnim - 0) / 20) * (60.78687-(-29.33941)));
            yy = -16.14165 + (((tickAnim - 0) / 20) * (-16.14048-(-16.14165)));
            zz = -34.77151 + (((tickAnim - 0) / 20) * (-55.00225-(-34.77151)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 60.78687 + (((tickAnim - 20) / 10) * (-45.00785-(60.78687)));
            yy = -16.14048 + (((tickAnim - 20) / 10) * (-33.22931-(-16.14048)));
            zz = -55.00225 + (((tickAnim - 20) / 10) * (-13.94432-(-55.00225)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = -45.00785 + (((tickAnim - 30) / 10) * (-29.33941-(-45.00785)));
            yy = -33.22931 + (((tickAnim - 30) / 10) * (-16.14165-(-33.22931)));
            zz = -13.94432 + (((tickAnim - 30) / 10) * (-34.77151-(-13.94432)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm2, leftArm2.rotateAngleX + (float) Math.toRadians(xx), leftArm2.rotateAngleY + (float) Math.toRadians(yy), leftArm2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (0.025-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (-0.275-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (-0.05-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 40) {
            xx = 0.025 + (((tickAnim - 20) / 20) * (0-(0.025)));
            yy = -0.275 + (((tickAnim - 20) / 20) * (0-(-0.275)));
            zz = -0.05 + (((tickAnim - 20) / 20) * (0-(-0.05)));
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
            xx = 40.92888 + (((tickAnim - 0) / 10) * (-49.20152-(40.92888)));
            yy = -3.36868 + (((tickAnim - 0) / 10) * (11.24379-(-3.36868)));
            zz = 43.90075 + (((tickAnim - 0) / 10) * (-15.15763-(43.90075)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = -49.20152 + (((tickAnim - 10) / 10) * (57.01128-(-49.20152)));
            yy = 11.24379 + (((tickAnim - 10) / 10) * (-38.24081-(11.24379)));
            zz = -15.15763 + (((tickAnim - 10) / 10) * (46.14569-(-15.15763)));
        }
        else if (tickAnim >= 20 && tickAnim < 23) {
            xx = 57.01128 + (((tickAnim - 20) / 3) * (74.36083-(57.01128)));
            yy = -38.24081 + (((tickAnim - 20) / 3) * (-79.46999-(-38.24081)));
            zz = 46.14569 + (((tickAnim - 20) / 3) * (72.46178-(46.14569)));
        }
        else if (tickAnim >= 23 && tickAnim < 30) {
            xx = 74.36083 + (((tickAnim - 23) / 7) * (97.08796-(74.36083)));
            yy = -79.46999 + (((tickAnim - 23) / 7) * (-50.05405-(-79.46999)));
            zz = 72.46178 + (((tickAnim - 23) / 7) * (38.66617-(72.46178)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = 97.08796 + (((tickAnim - 30) / 10) * (40.92888-(97.08796)));
            yy = -50.05405 + (((tickAnim - 30) / 10) * (-3.36868-(-50.05405)));
            zz = 38.66617 + (((tickAnim - 30) / 10) * (43.90075-(38.66617)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm3, leftArm3.rotateAngleX + (float) Math.toRadians(xx), leftArm3.rotateAngleY + (float) Math.toRadians(yy), leftArm3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            yy = 0.125 + (((tickAnim - 0) / 2) * (0.18-(0.125)));
            zz = 0 + (((tickAnim - 0) / 2) * (0.06-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 2) / 1) * (0-(0)));
            yy = 0.18 + (((tickAnim - 2) / 1) * (0.555-(0.18)));
            zz = 0.06 + (((tickAnim - 2) / 1) * (0.12-(0.06)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            yy = 0.555 + (((tickAnim - 3) / 2) * (0.65-(0.555)));
            zz = 0.12 + (((tickAnim - 3) / 2) * (0.18-(0.12)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            yy = 0.65 + (((tickAnim - 5) / 3) * (0.715-(0.65)));
            zz = 0.18 + (((tickAnim - 5) / 3) * (0.27-(0.18)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            yy = 0.715 + (((tickAnim - 8) / 2) * (0.425-(0.715)));
            zz = 0.27 + (((tickAnim - 8) / 2) * (0.35-(0.27)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            yy = 0.425 + (((tickAnim - 10) / 10) * (0-(0.425)));
            zz = 0.35 + (((tickAnim - 10) / 10) * (0-(0.35)));
        }
        else if (tickAnim >= 20 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 20) / 3) * (0.225-(0)));
            yy = 0 + (((tickAnim - 20) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 3) * (0.225-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 37) {
            xx = 0.225 + (((tickAnim - 23) / 14) * (0.04-(0.225)));
            yy = 0 + (((tickAnim - 23) / 14) * (0.325-(0)));
            zz = 0.225 + (((tickAnim - 23) / 14) * (0.04-(0.225)));
        }
        else if (tickAnim >= 37 && tickAnim < 40) {
            xx = 0.04 + (((tickAnim - 37) / 3) * (0-(0.04)));
            yy = 0.325 + (((tickAnim - 37) / 3) * (0.125-(0.325)));
            zz = 0.04 + (((tickAnim - 37) / 3) * (0-(0.04)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftArm3.rotationPointX = this.leftArm3.rotationPointX + (float)(xx);
        this.leftArm3.rotationPointY = this.leftArm3.rotationPointY - (float)(yy);
        this.leftArm3.rotationPointZ = this.leftArm3.rotationPointZ + (float)(zz);



        this.setRotateAngle(tail1, tail1.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.5-50))*-2), tail1.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-100))*5), tail1.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-50))*-2));


        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.5-100))*-2), tail2.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-150))*10), tail2.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-50))*-2));


        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.5-100))*-2), tail3.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-200))*15), tail3.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-50))*-2));


        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.5-100))*-2), tail4.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-250))*20), tail4.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-50))*-2));



        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 20.67752 + (((tickAnim - 0) / 15) * (52.60142-(20.67752)));
            yy = -7.76835 + (((tickAnim - 0) / 15) * (18.86321-(-7.76835)));
            zz = 2.33058 + (((tickAnim - 0) / 15) * (2.36398-(2.33058)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = 52.60142 + (((tickAnim - 15) / 5) * (30.72523-(52.60142)));
            yy = 18.86321 + (((tickAnim - 15) / 5) * (11.79032-(18.86321)));
            zz = 2.36398 + (((tickAnim - 15) / 5) * (26.60296-(2.36398)));
        }
        else if (tickAnim >= 20 && tickAnim < 23) {
            xx = 30.72523 + (((tickAnim - 20) / 3) * (19.89756-(30.72523)));
            yy = 11.79032 + (((tickAnim - 20) / 3) * (8.34833-(11.79032)));
            zz = 26.60296 + (((tickAnim - 20) / 3) * (39.10179-(26.60296)));
        }
        else if (tickAnim >= 23 && tickAnim < 30) {
            xx = 19.89756 + (((tickAnim - 23) / 7) * (4.90021-(19.89756)));
            yy = 8.34833 + (((tickAnim - 23) / 7) * (-20.51441-(8.34833)));
            zz = 39.10179 + (((tickAnim - 23) / 7) * (2.12301-(39.10179)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = 4.90021 + (((tickAnim - 30) / 10) * (20.67752-(4.90021)));
            yy = -20.51441 + (((tickAnim - 30) / 10) * (-7.76835-(-20.51441)));
            zz = 2.12301 + (((tickAnim - 30) / 10) * (2.33058-(2.12301)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg1, rightLeg1.rotateAngleX + (float) Math.toRadians(xx), rightLeg1.rotateAngleY + (float) Math.toRadians(yy), rightLeg1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 6 + (((tickAnim - 0) / 15) * (7.25-(6)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = 7.25 + (((tickAnim - 15) / 5) * (18.84-(7.25)));
            yy = 0 + (((tickAnim - 15) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 5) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 23) {
            xx = 18.84 + (((tickAnim - 20) / 3) * (24.63-(18.84)));
            yy = 0 + (((tickAnim - 20) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 3) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 30) {
            xx = 24.63 + (((tickAnim - 23) / 7) * (-15.5-(24.63)));
            yy = 0 + (((tickAnim - 23) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 7) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = -15.5 + (((tickAnim - 30) / 10) * (6-(-15.5)));
            yy = 0 + (((tickAnim - 30) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg2, rightLeg2.rotateAngleX + (float) Math.toRadians(xx), rightLeg2.rotateAngleY + (float) Math.toRadians(yy), rightLeg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            yy = -0.2 + (((tickAnim - 0) / 15) * (0-(-0.2)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 15) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 15) / 15) * (-0.2-(0)));
            zz = 0 + (((tickAnim - 15) / 15) * (0-(0)));
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
            xx = -19.30446 + (((tickAnim - 0) / 7) * (-29.55666-(-19.30446)));
            yy = 1.05087 + (((tickAnim - 0) / 7) * (14.08394-(1.05087)));
            zz = -7.03477 + (((tickAnim - 0) / 7) * (-16.21943-(-7.03477)));
        }
        else if (tickAnim >= 7 && tickAnim < 15) {
            xx = -29.55666 + (((tickAnim - 7) / 8) * (63.66755-(-29.55666)));
            yy = 14.08394 + (((tickAnim - 7) / 8) * (45.70902-(14.08394)));
            zz = -16.21943 + (((tickAnim - 7) / 8) * (-4.37878-(-16.21943)));
        }
        else if (tickAnim >= 15 && tickAnim < 18) {
            xx = 63.66755 + (((tickAnim - 15) / 3) * (81.77096-(63.66755)));
            yy = 45.70902 + (((tickAnim - 15) / 3) * (52.0229-(45.70902)));
            zz = -4.37878 + (((tickAnim - 15) / 3) * (4.68733-(-4.37878)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = 81.77096 + (((tickAnim - 18) / 2) * (49.93798-(81.77096)));
            yy = 52.0229 + (((tickAnim - 18) / 2) * (25.58664-(52.0229)));
            zz = 4.68733 + (((tickAnim - 18) / 2) * (0.44684-(4.68733)));
        }
        else if (tickAnim >= 20 && tickAnim < 23) {
            xx = 49.93798 + (((tickAnim - 20) / 3) * (1.56352-(49.93798)));
            yy = 25.58664 + (((tickAnim - 20) / 3) * (-14.06774-(25.58664)));
            zz = 0.44684 + (((tickAnim - 20) / 3) * (-5.9139-(0.44684)));
        }
        else if (tickAnim >= 23 && tickAnim < 27) {
            xx = 1.56352 + (((tickAnim - 23) / 4) * (-1.52693-(1.56352)));
            yy = -14.06774 + (((tickAnim - 23) / 4) * (-5.07032-(-14.06774)));
            zz = -5.9139 + (((tickAnim - 23) / 4) * (-5.5968-(-5.9139)));
        }
        else if (tickAnim >= 27 && tickAnim < 30) {
            xx = -1.52693 + (((tickAnim - 27) / 3) * (21.65071-(-1.52693)));
            yy = -5.07032 + (((tickAnim - 27) / 3) * (2.12762-(-5.07032)));
            zz = -5.5968 + (((tickAnim - 27) / 3) * (-5.34311-(-5.5968)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = 21.65071 + (((tickAnim - 30) / 10) * (-19.30446-(21.65071)));
            yy = 2.12762 + (((tickAnim - 30) / 10) * (1.05087-(2.12762)));
            zz = -5.34311 + (((tickAnim - 30) / 10) * (-7.03477-(-5.34311)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg3, rightLeg3.rotateAngleX + (float) Math.toRadians(xx), rightLeg3.rotateAngleY + (float) Math.toRadians(yy), rightLeg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            yy = 0.15 + (((tickAnim - 0) / 4) * (0.83-(0.15)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 27) {
            xx = 0 + (((tickAnim - 4) / 23) * (0-(0)));
            yy = 0.83 + (((tickAnim - 4) / 23) * (0.435-(0.83)));
            zz = 0 + (((tickAnim - 4) / 23) * (0-(0)));
        }
        else if (tickAnim >= 27 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 27) / 3) * (0-(0)));
            yy = 0.435 + (((tickAnim - 27) / 3) * (0-(0.435)));
            zz = 0 + (((tickAnim - 27) / 3) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 30) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 30) / 3) * (0.23-(0)));
            zz = 0 + (((tickAnim - 30) / 3) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 33) / 2) * (0-(0)));
            yy = 0.23 + (((tickAnim - 33) / 2) * (0.255-(0.23)));
            zz = 0 + (((tickAnim - 33) / 2) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 38) {
            xx = 0 + (((tickAnim - 35) / 3) * (0-(0)));
            yy = 0.255 + (((tickAnim - 35) / 3) * (0.3-(0.255)));
            zz = 0 + (((tickAnim - 35) / 3) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 38) / 2) * (0-(0)));
            yy = 0.3 + (((tickAnim - 38) / 2) * (0.15-(0.3)));
            zz = 0 + (((tickAnim - 38) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightLeg3.rotationPointX = this.rightLeg3.rotationPointX + (float)(xx);
        this.rightLeg3.rotationPointY = this.rightLeg3.rotationPointY - (float)(yy);
        this.rightLeg3.rotationPointZ = this.rightLeg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 30.72523 + (((tickAnim - 0) / 3) * (19.89756-(30.72523)));
            yy = -11.79032 + (((tickAnim - 0) / 3) * (-8.34833-(-11.79032)));
            zz = -26.60296 + (((tickAnim - 0) / 3) * (-39.10179-(-26.60296)));
        }
        else if (tickAnim >= 3 && tickAnim < 10) {
            xx = 19.89756 + (((tickAnim - 3) / 7) * (4.90021-(19.89756)));
            yy = -8.34833 + (((tickAnim - 3) / 7) * (20.51441-(-8.34833)));
            zz = -39.10179 + (((tickAnim - 3) / 7) * (-2.12301-(-39.10179)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 4.90021 + (((tickAnim - 10) / 10) * (20.67752-(4.90021)));
            yy = 20.51441 + (((tickAnim - 10) / 10) * (7.76835-(20.51441)));
            zz = -2.12301 + (((tickAnim - 10) / 10) * (-2.33058-(-2.12301)));
        }
        else if (tickAnim >= 20 && tickAnim < 35) {
            xx = 20.67752 + (((tickAnim - 20) / 15) * (52.60142-(20.67752)));
            yy = 7.76835 + (((tickAnim - 20) / 15) * (-18.86321-(7.76835)));
            zz = -2.33058 + (((tickAnim - 20) / 15) * (-2.36398-(-2.33058)));
        }
        else if (tickAnim >= 35 && tickAnim < 40) {
            xx = 52.60142 + (((tickAnim - 35) / 5) * (30.72523-(52.60142)));
            yy = -18.86321 + (((tickAnim - 35) / 5) * (-11.79032-(-18.86321)));
            zz = -2.36398 + (((tickAnim - 35) / 5) * (-26.60296-(-2.36398)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg1, leftLeg1.rotateAngleX + (float) Math.toRadians(xx), leftLeg1.rotateAngleY + (float) Math.toRadians(yy), leftLeg1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 18.84 + (((tickAnim - 0) / 3) * (24.63-(18.84)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 10) {
            xx = 24.63 + (((tickAnim - 3) / 7) * (-15.5-(24.63)));
            yy = 0 + (((tickAnim - 3) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 7) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = -15.5 + (((tickAnim - 10) / 10) * (6-(-15.5)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 35) {
            xx = 6 + (((tickAnim - 20) / 15) * (7.25-(6)));
            yy = 0 + (((tickAnim - 20) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 15) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 40) {
            xx = 7.25 + (((tickAnim - 35) / 5) * (18.84-(7.25)));
            yy = 0 + (((tickAnim - 35) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg2, leftLeg2.rotateAngleX + (float) Math.toRadians(xx), leftLeg2.rotateAngleY + (float) Math.toRadians(yy), leftLeg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (-0.2-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            yy = -0.2 + (((tickAnim - 10) / 10) * (-0.2-(-0.2)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 20) / 15) * (0-(0)));
            yy = -0.2 + (((tickAnim - 20) / 15) * (0-(-0.2)));
            zz = 0 + (((tickAnim - 20) / 15) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 35) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 35) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftLeg2.rotationPointX = this.leftLeg2.rotationPointX + (float)(xx);
        this.leftLeg2.rotationPointY = this.leftLeg2.rotationPointY - (float)(yy);
        this.leftLeg2.rotationPointZ = this.leftLeg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 81.77096 + (((tickAnim - 0) / 4) * (1.56352-(81.77096)));
            yy = -52.0229 + (((tickAnim - 0) / 4) * (14.06774-(-52.0229)));
            zz = -4.68733 + (((tickAnim - 0) / 4) * (5.9139-(-4.68733)));
        }
        else if (tickAnim >= 4 && tickAnim < 8) {
            xx = 1.56352 + (((tickAnim - 4) / 4) * (-1.52693-(1.56352)));
            yy = 14.06774 + (((tickAnim - 4) / 4) * (5.07032-(14.06774)));
            zz = 5.9139 + (((tickAnim - 4) / 4) * (5.5968-(5.9139)));
        }
        else if (tickAnim >= 8 && tickAnim < 12) {
            xx = -1.52693 + (((tickAnim - 8) / 4) * (21.65071-(-1.52693)));
            yy = 5.07032 + (((tickAnim - 8) / 4) * (-2.12762-(5.07032)));
            zz = 5.5968 + (((tickAnim - 8) / 4) * (5.34311-(5.5968)));
        }
        else if (tickAnim >= 12 && tickAnim < 22) {
            xx = 21.65071 + (((tickAnim - 12) / 10) * (-19.30446-(21.65071)));
            yy = -2.12762 + (((tickAnim - 12) / 10) * (-1.05087-(-2.12762)));
            zz = 5.34311 + (((tickAnim - 12) / 10) * (7.03477-(5.34311)));
        }
        else if (tickAnim >= 22 && tickAnim < 28) {
            xx = -19.30446 + (((tickAnim - 22) / 6) * (-29.55666-(-19.30446)));
            yy = -1.05087 + (((tickAnim - 22) / 6) * (-14.08394-(-1.05087)));
            zz = 7.03477 + (((tickAnim - 22) / 6) * (16.21943-(7.03477)));
        }
        else if (tickAnim >= 28 && tickAnim < 37) {
            xx = -29.55666 + (((tickAnim - 28) / 9) * (63.66755-(-29.55666)));
            yy = -14.08394 + (((tickAnim - 28) / 9) * (-45.70902-(-14.08394)));
            zz = 16.21943 + (((tickAnim - 28) / 9) * (4.37878-(16.21943)));
        }
        else if (tickAnim >= 37 && tickAnim < 40) {
            xx = 63.66755 + (((tickAnim - 37) / 3) * (81.77096-(63.66755)));
            yy = -45.70902 + (((tickAnim - 37) / 3) * (-52.0229-(-45.70902)));
            zz = 4.37878 + (((tickAnim - 37) / 3) * (-4.68733-(4.37878)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg3, leftLeg3.rotateAngleX + (float) Math.toRadians(xx), leftLeg3.rotateAngleY + (float) Math.toRadians(yy), leftLeg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 4) * (0.45-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 4) / 8) * (0-(0)));
            yy = 0.45 + (((tickAnim - 4) / 8) * (0.425-(0.45)));
            zz = 0 + (((tickAnim - 4) / 8) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 12) / 2) * (0-(0)));
            yy = 0.425 + (((tickAnim - 12) / 2) * (0.43-(0.425)));
            zz = 0 + (((tickAnim - 12) / 2) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 17) {
            xx = 0 + (((tickAnim - 14) / 3) * (0-(0)));
            yy = 0.43 + (((tickAnim - 14) / 3) * (0.555-(0.43)));
            zz = 0 + (((tickAnim - 14) / 3) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 17) / 2) * (0-(0)));
            yy = 0.555 + (((tickAnim - 17) / 2) * (0.5-(0.555)));
            zz = 0 + (((tickAnim - 17) / 2) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 22) {
            xx = 0 + (((tickAnim - 19) / 3) * (0-(0)));
            yy = 0.5 + (((tickAnim - 19) / 3) * (0.525-(0.5)));
            zz = 0 + (((tickAnim - 19) / 3) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 26) {
            xx = 0 + (((tickAnim - 22) / 4) * (0-(0)));
            yy = 0.525 + (((tickAnim - 22) / 4) * (0.955-(0.525)));
            zz = 0 + (((tickAnim - 22) / 4) * (0-(0)));
        }
        else if (tickAnim >= 26 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 26) / 14) * (0-(0)));
            yy = 0.955 + (((tickAnim - 26) / 14) * (0-(0.955)));
            zz = 0 + (((tickAnim - 26) / 14) * (0-(0)));
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
    public void animRun(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraMirasaura entity = (EntityPrehistoricFloraMirasaura) entitylivingbaseIn;
        int animCycle = 15;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        this.setRotateAngle(root, root.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*479/0.5))*-2), root.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*479-50))*9), root.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*479-50))*-9));
        this.root.rotationPointX = this.root.rotationPointX + (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*479))*-0.5);
        this.root.rotationPointY = this.root.rotationPointY - (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*479/0.5))*-0.5);
        this.root.rotationPointZ = this.root.rotationPointZ + (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*479/0.5-50))*1);


        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*479/0.5-50))*2), body.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*479-50))*-9), body.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*479-50))*9));


        this.setRotateAngle(scale1, scale1.rotateAngleX + (float) Math.toRadians(0), scale1.rotateAngleY + (float) Math.toRadians(0), scale1.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*479-100))*-5));


        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(0), chest.rotateAngleY + (float) Math.toRadians(0), chest.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*479/0.5-100))*2), neck.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*479-150))*-9), neck.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*479/0.5-100))*-4), head.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*479-150))*9), head.rotateAngleZ + (float) Math.toRadians(0));



        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 14.75 + (((tickAnim - 0) / 3) * (8.95347-(14.75)));
            yy = 0 + (((tickAnim - 0) / 3) * (-30.11139-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (20.21785-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 8) {
            xx = 8.95347 + (((tickAnim - 3) / 5) * (11.19656-(8.95347)));
            yy = -30.11139 + (((tickAnim - 3) / 5) * (-54.78962-(-30.11139)));
            zz = 20.21785 + (((tickAnim - 3) / 5) * (-26.81842-(20.21785)));
        }
        else if (tickAnim >= 8 && tickAnim < 15) {
            xx = 11.19656 + (((tickAnim - 8) / 7) * (14.75-(11.19656)));
            yy = -54.78962 + (((tickAnim - 8) / 7) * (0-(-54.78962)));
            zz = -26.81842 + (((tickAnim - 8) / 7) * (0-(-26.81842)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm1, rightArm1.rotateAngleX + (float) Math.toRadians(xx), rightArm1.rotateAngleY + (float) Math.toRadians(yy), rightArm1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 60.78687 + (((tickAnim - 0) / 3) * (-45.00785-(60.78687)));
            yy = 16.14048 + (((tickAnim - 0) / 3) * (33.22931-(16.14048)));
            zz = 55.00225 + (((tickAnim - 0) / 3) * (13.94432-(55.00225)));
        }
        else if (tickAnim >= 3 && tickAnim < 8) {
            xx = -45.00785 + (((tickAnim - 3) / 5) * (-29.33941-(-45.00785)));
            yy = 33.22931 + (((tickAnim - 3) / 5) * (16.14165-(33.22931)));
            zz = 13.94432 + (((tickAnim - 3) / 5) * (34.77151-(13.94432)));
        }
        else if (tickAnim >= 8 && tickAnim < 15) {
            xx = -29.33941 + (((tickAnim - 8) / 7) * (60.78687-(-29.33941)));
            yy = 16.14165 + (((tickAnim - 8) / 7) * (16.14048-(16.14165)));
            zz = 34.77151 + (((tickAnim - 8) / 7) * (55.00225-(34.77151)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm2, rightArm2.rotateAngleX + (float) Math.toRadians(xx), rightArm2.rotateAngleY + (float) Math.toRadians(yy), rightArm2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0.025 + (((tickAnim - 0) / 8) * (0-(0.025)));
            yy = -0.275 + (((tickAnim - 0) / 8) * (0-(-0.275)));
            zz = -0.05 + (((tickAnim - 0) / 8) * (0-(-0.05)));
        }
        else if (tickAnim >= 8 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 8) / 7) * (0.025-(0)));
            yy = 0 + (((tickAnim - 8) / 7) * (-0.275-(0)));
            zz = 0 + (((tickAnim - 8) / 7) * (-0.05-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightArm2.rotationPointX = this.rightArm2.rotationPointX + (float)(xx);
        this.rightArm2.rotationPointY = this.rightArm2.rotationPointY - (float)(yy);
        this.rightArm2.rotationPointZ = this.rightArm2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 1) {
            xx = 57.01128 + (((tickAnim - 0) / 1) * (74.36083-(57.01128)));
            yy = 38.24081 + (((tickAnim - 0) / 1) * (79.46999-(38.24081)));
            zz = -46.14569 + (((tickAnim - 0) / 1) * (-72.46178-(-46.14569)));
        }
        else if (tickAnim >= 1 && tickAnim < 3) {
            xx = 74.36083 + (((tickAnim - 1) / 2) * (97.08796-(74.36083)));
            yy = 79.46999 + (((tickAnim - 1) / 2) * (50.05405-(79.46999)));
            zz = -72.46178 + (((tickAnim - 1) / 2) * (-38.66617-(-72.46178)));
        }
        else if (tickAnim >= 3 && tickAnim < 8) {
            xx = 97.08796 + (((tickAnim - 3) / 5) * (40.92888-(97.08796)));
            yy = 50.05405 + (((tickAnim - 3) / 5) * (3.36868-(50.05405)));
            zz = -38.66617 + (((tickAnim - 3) / 5) * (-43.90075-(-38.66617)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 40.92888 + (((tickAnim - 8) / 2) * (-7.00752-(40.92888)));
            yy = 3.36868 + (((tickAnim - 8) / 2) * (19.54373-(3.36868)));
            zz = -43.90075 + (((tickAnim - 8) / 2) * (-30.98337-(-43.90075)));
        }
        else if (tickAnim >= 10 && tickAnim < 12) {
            xx = -7.00752 + (((tickAnim - 10) / 2) * (-17.75164-(-7.00752)));
            yy = 19.54373 + (((tickAnim - 10) / 2) * (25.38657-(19.54373)));
            zz = -30.98337 + (((tickAnim - 10) / 2) * (-35.7216-(-30.98337)));
        }
        else if (tickAnim >= 12 && tickAnim < 15) {
            xx = -17.75164 + (((tickAnim - 12) / 3) * (57.01128-(-17.75164)));
            yy = 25.38657 + (((tickAnim - 12) / 3) * (38.24081-(25.38657)));
            zz = -35.7216 + (((tickAnim - 12) / 3) * (-46.14569-(-35.7216)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm3, rightArm3.rotateAngleX + (float) Math.toRadians(xx), rightArm3.rotateAngleY + (float) Math.toRadians(yy), rightArm3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 1) {
            xx = 0 + (((tickAnim - 0) / 1) * (0.225-(0)));
            yy = 0 + (((tickAnim - 0) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 1) * (0.225-(0)));
        }
        else if (tickAnim >= 1 && tickAnim < 6) {
            xx = 0.225 + (((tickAnim - 1) / 5) * (0.04-(0.225)));
            yy = 0 + (((tickAnim - 1) / 5) * (0.3-(0)));
            zz = 0.225 + (((tickAnim - 1) / 5) * (0.04-(0.225)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = 0.04 + (((tickAnim - 6) / 2) * (0-(0.04)));
            yy = 0.3 + (((tickAnim - 6) / 2) * (0.025-(0.3)));
            zz = 0.04 + (((tickAnim - 6) / 2) * (0-(0.04)));
        }
        else if (tickAnim >= 8 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 8) / 0) * (0-(0)));
            yy = 0.025 + (((tickAnim - 8) / 0) * (0.465-(0.025)));
            zz = 0 + (((tickAnim - 8) / 0) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            yy = 0.465 + (((tickAnim - 8) / 2) * (0.95-(0.465)));
            zz = 0 + (((tickAnim - 8) / 2) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 10) / 5) * (0-(0)));
            yy = 0.95 + (((tickAnim - 10) / 5) * (0-(0.95)));
            zz = 0 + (((tickAnim - 10) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightArm3.rotationPointX = this.rightArm3.rotationPointX + (float)(xx);
        this.rightArm3.rotationPointY = this.rightArm3.rotationPointY - (float)(yy);
        this.rightArm3.rotationPointZ = this.rightArm3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 11.19656 + (((tickAnim - 0) / 8) * (14.75-(11.19656)));
            yy = 54.78962 + (((tickAnim - 0) / 8) * (0-(54.78962)));
            zz = 26.81842 + (((tickAnim - 0) / 8) * (0-(26.81842)));
        }
        else if (tickAnim >= 8 && tickAnim < 11) {
            xx = 14.75 + (((tickAnim - 8) / 3) * (8.95347-(14.75)));
            yy = 0 + (((tickAnim - 8) / 3) * (30.11139-(0)));
            zz = 0 + (((tickAnim - 8) / 3) * (-20.21785-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 15) {
            xx = 8.95347 + (((tickAnim - 11) / 4) * (11.19656-(8.95347)));
            yy = 30.11139 + (((tickAnim - 11) / 4) * (54.78962-(30.11139)));
            zz = -20.21785 + (((tickAnim - 11) / 4) * (26.81842-(-20.21785)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm1, leftArm1.rotateAngleX + (float) Math.toRadians(xx), leftArm1.rotateAngleY + (float) Math.toRadians(yy), leftArm1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = -29.33941 + (((tickAnim - 0) / 8) * (60.78687-(-29.33941)));
            yy = -16.14165 + (((tickAnim - 0) / 8) * (-16.14048-(-16.14165)));
            zz = -34.77151 + (((tickAnim - 0) / 8) * (-55.00225-(-34.77151)));
        }
        else if (tickAnim >= 8 && tickAnim < 11) {
            xx = 60.78687 + (((tickAnim - 8) / 3) * (-45.00785-(60.78687)));
            yy = -16.14048 + (((tickAnim - 8) / 3) * (-33.22931-(-16.14048)));
            zz = -55.00225 + (((tickAnim - 8) / 3) * (-13.94432-(-55.00225)));
        }
        else if (tickAnim >= 11 && tickAnim < 15) {
            xx = -45.00785 + (((tickAnim - 11) / 4) * (-29.33941-(-45.00785)));
            yy = -33.22931 + (((tickAnim - 11) / 4) * (-16.14165-(-33.22931)));
            zz = -13.94432 + (((tickAnim - 11) / 4) * (-34.77151-(-13.94432)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm2, leftArm2.rotateAngleX + (float) Math.toRadians(xx), leftArm2.rotateAngleY + (float) Math.toRadians(yy), leftArm2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (0.025-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (-0.275-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (-0.05-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 15) {
            xx = 0.025 + (((tickAnim - 8) / 7) * (0-(0.025)));
            yy = -0.275 + (((tickAnim - 8) / 7) * (0-(-0.275)));
            zz = -0.05 + (((tickAnim - 8) / 7) * (0-(-0.05)));
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
            xx = 40.92888 + (((tickAnim - 0) / 3) * (-49.20152-(40.92888)));
            yy = -3.36868 + (((tickAnim - 0) / 3) * (11.24379-(-3.36868)));
            zz = 43.90075 + (((tickAnim - 0) / 3) * (-15.15763-(43.90075)));
        }
        else if (tickAnim >= 3 && tickAnim < 8) {
            xx = -49.20152 + (((tickAnim - 3) / 5) * (57.01128-(-49.20152)));
            yy = 11.24379 + (((tickAnim - 3) / 5) * (-38.24081-(11.24379)));
            zz = -15.15763 + (((tickAnim - 3) / 5) * (46.14569-(-15.15763)));
        }
        else if (tickAnim >= 8 && tickAnim < 8) {
            xx = 57.01128 + (((tickAnim - 8) / 0) * (74.36083-(57.01128)));
            yy = -38.24081 + (((tickAnim - 8) / 0) * (-79.46999-(-38.24081)));
            zz = 46.14569 + (((tickAnim - 8) / 0) * (72.46178-(46.14569)));
        }
        else if (tickAnim >= 8 && tickAnim < 11) {
            xx = 74.36083 + (((tickAnim - 8) / 3) * (97.08796-(74.36083)));
            yy = -79.46999 + (((tickAnim - 8) / 3) * (-50.05405-(-79.46999)));
            zz = 72.46178 + (((tickAnim - 8) / 3) * (38.66617-(72.46178)));
        }
        else if (tickAnim >= 11 && tickAnim < 15) {
            xx = 97.08796 + (((tickAnim - 11) / 4) * (40.92888-(97.08796)));
            yy = -50.05405 + (((tickAnim - 11) / 4) * (-3.36868-(-50.05405)));
            zz = 38.66617 + (((tickAnim - 11) / 4) * (43.90075-(38.66617)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm3, leftArm3.rotateAngleX + (float) Math.toRadians(xx), leftArm3.rotateAngleY + (float) Math.toRadians(yy), leftArm3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 1) {
            xx = 0 + (((tickAnim - 0) / 1) * (0-(0)));
            yy = 0.125 + (((tickAnim - 0) / 1) * (0.33-(0.125)));
            zz = 0 + (((tickAnim - 0) / 1) * (0.06-(0)));
        }
        else if (tickAnim >= 1 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 1) / 1) * (0-(0)));
            yy = 0.33 + (((tickAnim - 1) / 1) * (0.555-(0.33)));
            zz = 0.06 + (((tickAnim - 1) / 1) * (0.12-(0.06)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 2) / 1) * (0-(0)));
            yy = 0.555 + (((tickAnim - 2) / 1) * (0.65-(0.555)));
            zz = 0.12 + (((tickAnim - 2) / 1) * (0.18-(0.12)));
        }
        else if (tickAnim >= 3 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 3) / 0) * (0-(0)));
            yy = 0.65 + (((tickAnim - 3) / 0) * (0.425-(0.65)));
            zz = 0.18 + (((tickAnim - 3) / 0) * (0.35-(0.18)));
        }
        else if (tickAnim >= 3 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 3) / 5) * (0-(0)));
            yy = 0.425 + (((tickAnim - 3) / 5) * (0-(0.425)));
            zz = 0.35 + (((tickAnim - 3) / 5) * (0-(0.35)));
        }
        else if (tickAnim >= 8 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 8) / 0) * (0.225-(0)));
            yy = 0 + (((tickAnim - 8) / 0) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 0) * (0.225-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = 0.225 + (((tickAnim - 8) / 5) * (0.04-(0.225)));
            yy = 0 + (((tickAnim - 8) / 5) * (0.325-(0)));
            zz = 0.225 + (((tickAnim - 8) / 5) * (0.04-(0.225)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = 0.04 + (((tickAnim - 13) / 2) * (0-(0.04)));
            yy = 0.325 + (((tickAnim - 13) / 2) * (0.125-(0.325)));
            zz = 0.04 + (((tickAnim - 13) / 2) * (0-(0.04)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftArm3.rotationPointX = this.leftArm3.rotationPointX + (float)(xx);
        this.leftArm3.rotationPointY = this.leftArm3.rotationPointY - (float)(yy);
        this.leftArm3.rotationPointZ = this.leftArm3.rotationPointZ + (float)(zz);



        this.setRotateAngle(tail1, tail1.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*479/0.5-50))*-2), tail1.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*479-100))*3), tail1.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*479-50))*-2));


        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*479/0.5-100))*-2), tail2.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*479-150))*10), tail2.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*479-50))*-2));


        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*479/0.5-100))*-2), tail3.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*479-200))*15), tail3.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*479-50))*-2));


        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*479/0.5-100))*-2), tail4.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*479-250))*20), tail4.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*479-50))*-2));



        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 20.67752 + (((tickAnim - 0) / 6) * (52.60142-(20.67752)));
            yy = -7.76835 + (((tickAnim - 0) / 6) * (18.86321-(-7.76835)));
            zz = 2.33058 + (((tickAnim - 0) / 6) * (2.36398-(2.33058)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = 52.60142 + (((tickAnim - 6) / 2) * (30.72523-(52.60142)));
            yy = 18.86321 + (((tickAnim - 6) / 2) * (11.79032-(18.86321)));
            zz = 2.36398 + (((tickAnim - 6) / 2) * (26.60296-(2.36398)));
        }
        else if (tickAnim >= 8 && tickAnim < 8) {
            xx = 30.72523 + (((tickAnim - 8) / 0) * (19.89756-(30.72523)));
            yy = 11.79032 + (((tickAnim - 8) / 0) * (8.34833-(11.79032)));
            zz = 26.60296 + (((tickAnim - 8) / 0) * (39.10179-(26.60296)));
        }
        else if (tickAnim >= 8 && tickAnim < 11) {
            xx = 19.89756 + (((tickAnim - 8) / 3) * (4.90021-(19.89756)));
            yy = 8.34833 + (((tickAnim - 8) / 3) * (-20.51441-(8.34833)));
            zz = 39.10179 + (((tickAnim - 8) / 3) * (2.12301-(39.10179)));
        }
        else if (tickAnim >= 11 && tickAnim < 15) {
            xx = 4.90021 + (((tickAnim - 11) / 4) * (20.67752-(4.90021)));
            yy = -20.51441 + (((tickAnim - 11) / 4) * (-7.76835-(-20.51441)));
            zz = 2.12301 + (((tickAnim - 11) / 4) * (2.33058-(2.12301)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg1, rightLeg1.rotateAngleX + (float) Math.toRadians(xx), rightLeg1.rotateAngleY + (float) Math.toRadians(yy), rightLeg1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 6 + (((tickAnim - 0) / 6) * (7.25-(6)));
            yy = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = 7.25 + (((tickAnim - 6) / 2) * (18.84-(7.25)));
            yy = 0 + (((tickAnim - 6) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 2) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 8) {
            xx = 18.84 + (((tickAnim - 8) / 0) * (24.63-(18.84)));
            yy = 0 + (((tickAnim - 8) / 0) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 0) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 11) {
            xx = 24.63 + (((tickAnim - 8) / 3) * (-15.5-(24.63)));
            yy = 0 + (((tickAnim - 8) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 3) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 15) {
            xx = -15.5 + (((tickAnim - 11) / 4) * (6-(-15.5)));
            yy = 0 + (((tickAnim - 11) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg2, rightLeg2.rotateAngleX + (float) Math.toRadians(xx), rightLeg2.rotateAngleY + (float) Math.toRadians(yy), rightLeg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            yy = -0.2 + (((tickAnim - 0) / 6) * (0-(-0.2)));
            zz = 0 + (((tickAnim - 0) / 6) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 6) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 6) / 5) * (-0.2-(0)));
            zz = 0 + (((tickAnim - 6) / 5) * (0-(0)));
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
            xx = -19.30446 + (((tickAnim - 0) / 3) * (-29.55666-(-19.30446)));
            yy = 1.05087 + (((tickAnim - 0) / 3) * (14.08394-(1.05087)));
            zz = -7.03477 + (((tickAnim - 0) / 3) * (-16.21943-(-7.03477)));
        }
        else if (tickAnim >= 3 && tickAnim < 6) {
            xx = -29.55666 + (((tickAnim - 3) / 3) * (63.66755-(-29.55666)));
            yy = 14.08394 + (((tickAnim - 3) / 3) * (45.70902-(14.08394)));
            zz = -16.21943 + (((tickAnim - 3) / 3) * (-4.37878-(-16.21943)));
        }
        else if (tickAnim >= 6 && tickAnim < 7) {
            xx = 63.66755 + (((tickAnim - 6) / 1) * (81.77096-(63.66755)));
            yy = 45.70902 + (((tickAnim - 6) / 1) * (52.0229-(45.70902)));
            zz = -4.37878 + (((tickAnim - 6) / 1) * (4.68733-(-4.37878)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = 81.77096 + (((tickAnim - 7) / 1) * (49.93798-(81.77096)));
            yy = 52.0229 + (((tickAnim - 7) / 1) * (25.58664-(52.0229)));
            zz = 4.68733 + (((tickAnim - 7) / 1) * (0.44684-(4.68733)));
        }
        else if (tickAnim >= 8 && tickAnim < 8) {
            xx = 49.93798 + (((tickAnim - 8) / 0) * (1.56352-(49.93798)));
            yy = 25.58664 + (((tickAnim - 8) / 0) * (-14.06774-(25.58664)));
            zz = 0.44684 + (((tickAnim - 8) / 0) * (-5.9139-(0.44684)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 1.56352 + (((tickAnim - 8) / 2) * (-1.52693-(1.56352)));
            yy = -14.06774 + (((tickAnim - 8) / 2) * (-5.07032-(-14.06774)));
            zz = -5.9139 + (((tickAnim - 8) / 2) * (-5.5968-(-5.9139)));
        }
        else if (tickAnim >= 10 && tickAnim < 11) {
            xx = -1.52693 + (((tickAnim - 10) / 1) * (21.65071-(-1.52693)));
            yy = -5.07032 + (((tickAnim - 10) / 1) * (2.12762-(-5.07032)));
            zz = -5.5968 + (((tickAnim - 10) / 1) * (-5.34311-(-5.5968)));
        }
        else if (tickAnim >= 11 && tickAnim < 15) {
            xx = 21.65071 + (((tickAnim - 11) / 4) * (-19.30446-(21.65071)));
            yy = 2.12762 + (((tickAnim - 11) / 4) * (1.05087-(2.12762)));
            zz = -5.34311 + (((tickAnim - 11) / 4) * (-7.03477-(-5.34311)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg3, rightLeg3.rotateAngleX + (float) Math.toRadians(xx), rightLeg3.rotateAngleY + (float) Math.toRadians(yy), rightLeg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            yy = 0.15 + (((tickAnim - 0) / 2) * (0.83-(0.15)));
            zz = 0 + (((tickAnim - 0) / 2) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 2) / 8) * (0-(0)));
            yy = 0.83 + (((tickAnim - 2) / 8) * (0.435-(0.83)));
            zz = 0 + (((tickAnim - 2) / 8) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 10) / 1) * (0-(0)));
            yy = 0.435 + (((tickAnim - 10) / 1) * (0-(0.435)));
            zz = 0 + (((tickAnim - 10) / 1) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 11) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 11) / 1) * (0.23-(0)));
            zz = 0 + (((tickAnim - 11) / 1) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 12) / 1) * (0-(0)));
            yy = 0.23 + (((tickAnim - 12) / 1) * (0.255-(0.23)));
            zz = 0 + (((tickAnim - 12) / 1) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 13) / 1) * (0-(0)));
            yy = 0.255 + (((tickAnim - 13) / 1) * (0.3-(0.255)));
            zz = 0 + (((tickAnim - 13) / 1) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 14) / 1) * (0-(0)));
            yy = 0.3 + (((tickAnim - 14) / 1) * (0.15-(0.3)));
            zz = 0 + (((tickAnim - 14) / 1) * (0-(0)));
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
            xx = 30.72523 + (((tickAnim - 0) / 1) * (19.89756-(30.72523)));
            yy = -11.79032 + (((tickAnim - 0) / 1) * (-8.34833-(-11.79032)));
            zz = -26.60296 + (((tickAnim - 0) / 1) * (-39.10179-(-26.60296)));
        }
        else if (tickAnim >= 1 && tickAnim < 3) {
            xx = 19.89756 + (((tickAnim - 1) / 2) * (4.90021-(19.89756)));
            yy = -8.34833 + (((tickAnim - 1) / 2) * (20.51441-(-8.34833)));
            zz = -39.10179 + (((tickAnim - 1) / 2) * (-2.12301-(-39.10179)));
        }
        else if (tickAnim >= 3 && tickAnim < 8) {
            xx = 4.90021 + (((tickAnim - 3) / 5) * (20.67752-(4.90021)));
            yy = 20.51441 + (((tickAnim - 3) / 5) * (7.76835-(20.51441)));
            zz = -2.12301 + (((tickAnim - 3) / 5) * (-2.33058-(-2.12301)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = 20.67752 + (((tickAnim - 8) / 5) * (52.60142-(20.67752)));
            yy = 7.76835 + (((tickAnim - 8) / 5) * (-18.86321-(7.76835)));
            zz = -2.33058 + (((tickAnim - 8) / 5) * (-2.36398-(-2.33058)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = 52.60142 + (((tickAnim - 13) / 2) * (30.72523-(52.60142)));
            yy = -18.86321 + (((tickAnim - 13) / 2) * (-11.79032-(-18.86321)));
            zz = -2.36398 + (((tickAnim - 13) / 2) * (-26.60296-(-2.36398)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg1, leftLeg1.rotateAngleX + (float) Math.toRadians(xx), leftLeg1.rotateAngleY + (float) Math.toRadians(yy), leftLeg1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 1) {
            xx = 18.84 + (((tickAnim - 0) / 1) * (24.63-(18.84)));
            yy = 0 + (((tickAnim - 0) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 1) * (0-(0)));
        }
        else if (tickAnim >= 1 && tickAnim < 3) {
            xx = 24.63 + (((tickAnim - 1) / 2) * (-15.5-(24.63)));
            yy = 0 + (((tickAnim - 1) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 1) / 2) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 8) {
            xx = -15.5 + (((tickAnim - 3) / 5) * (6-(-15.5)));
            yy = 0 + (((tickAnim - 3) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 5) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = 6 + (((tickAnim - 8) / 5) * (7.25-(6)));
            yy = 0 + (((tickAnim - 8) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 5) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = 7.25 + (((tickAnim - 13) / 2) * (18.84-(7.25)));
            yy = 0 + (((tickAnim - 13) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg2, leftLeg2.rotateAngleX + (float) Math.toRadians(xx), leftLeg2.rotateAngleY + (float) Math.toRadians(yy), leftLeg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (-0.2-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 3) / 5) * (0-(0)));
            yy = -0.2 + (((tickAnim - 3) / 5) * (-0.2-(-0.2)));
            zz = 0 + (((tickAnim - 3) / 5) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 8) / 5) * (0-(0)));
            yy = -0.2 + (((tickAnim - 8) / 5) * (0-(-0.2)));
            zz = 0 + (((tickAnim - 8) / 5) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 13) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 13) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 2) * (0-(0)));
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
            xx = 81.77096 + (((tickAnim - 0) / 2) * (1.56352-(81.77096)));
            yy = -52.0229 + (((tickAnim - 0) / 2) * (14.06774-(-52.0229)));
            zz = -4.68733 + (((tickAnim - 0) / 2) * (5.9139-(-4.68733)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = 1.56352 + (((tickAnim - 2) / 1) * (-1.52693-(1.56352)));
            yy = 14.06774 + (((tickAnim - 2) / 1) * (5.07032-(14.06774)));
            zz = 5.9139 + (((tickAnim - 2) / 1) * (5.5968-(5.9139)));
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = -1.52693 + (((tickAnim - 3) / 1) * (21.65071-(-1.52693)));
            yy = 5.07032 + (((tickAnim - 3) / 1) * (-2.12762-(5.07032)));
            zz = 5.5968 + (((tickAnim - 3) / 1) * (5.34311-(5.5968)));
        }
        else if (tickAnim >= 4 && tickAnim < 8) {
            xx = 21.65071 + (((tickAnim - 4) / 4) * (-19.30446-(21.65071)));
            yy = -2.12762 + (((tickAnim - 4) / 4) * (-1.05087-(-2.12762)));
            zz = 5.34311 + (((tickAnim - 4) / 4) * (7.03477-(5.34311)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = -19.30446 + (((tickAnim - 8) / 2) * (-29.55666-(-19.30446)));
            yy = -1.05087 + (((tickAnim - 8) / 2) * (-14.08394-(-1.05087)));
            zz = 7.03477 + (((tickAnim - 8) / 2) * (16.21943-(7.03477)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = -29.55666 + (((tickAnim - 10) / 3) * (63.66755-(-29.55666)));
            yy = -14.08394 + (((tickAnim - 10) / 3) * (-45.70902-(-14.08394)));
            zz = 16.21943 + (((tickAnim - 10) / 3) * (4.37878-(16.21943)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = 63.66755 + (((tickAnim - 13) / 2) * (81.77096-(63.66755)));
            yy = -45.70902 + (((tickAnim - 13) / 2) * (-52.0229-(-45.70902)));
            zz = 4.37878 + (((tickAnim - 13) / 2) * (-4.68733-(4.37878)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg3, leftLeg3.rotateAngleX + (float) Math.toRadians(xx), leftLeg3.rotateAngleY + (float) Math.toRadians(yy), leftLeg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 2) * (0.45-(0)));
            zz = 0 + (((tickAnim - 0) / 2) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 2) / 2) * (0-(0)));
            yy = 0.45 + (((tickAnim - 2) / 2) * (0.425-(0.45)));
            zz = 0 + (((tickAnim - 2) / 2) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 4) / 1) * (0-(0)));
            yy = 0.425 + (((tickAnim - 4) / 1) * (0.43-(0.425)));
            zz = 0 + (((tickAnim - 4) / 1) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 5) / 1) * (0-(0)));
            yy = 0.43 + (((tickAnim - 5) / 1) * (0.555-(0.43)));
            zz = 0 + (((tickAnim - 5) / 1) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 6) / 2) * (0-(0)));
            yy = 0.555 + (((tickAnim - 6) / 2) * (0.5-(0.555)));
            zz = 0 + (((tickAnim - 6) / 2) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 8) / 0) * (0-(0)));
            yy = 0.5 + (((tickAnim - 8) / 0) * (0.525-(0.5)));
            zz = 0 + (((tickAnim - 8) / 0) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            yy = 0.525 + (((tickAnim - 8) / 2) * (0.955-(0.525)));
            zz = 0 + (((tickAnim - 8) / 2) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 10) / 5) * (0-(0)));
            yy = 0.955 + (((tickAnim - 10) / 5) * (0-(0.955)));
            zz = 0 + (((tickAnim - 10) / 5) * (0-(0)));
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
    public void animClimb(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, boolean isStatic) {
        EntityPrehistoricFloraMirasaura entity = (EntityPrehistoricFloraMirasaura) entitylivingbaseIn;
        int animCycle = 40;
        double tickAnim = 0;
        if (!isStatic) {
            tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        }        double xx = 0;
        double yy = 0;
        double zz = 0;
        this.setRotateAngle(root, root.rotateAngleX + (float) Math.toRadians(-85.5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.5))*-2), root.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-50))*4), root.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-50))*-2));
        this.root.rotationPointX = this.root.rotationPointX + (float)(0);
        this.root.rotationPointY = this.root.rotationPointY - (float)(5.65+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.5))*-0.5);
        this.root.rotationPointZ = this.root.rotationPointZ + (float)(-9.1+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.5-50))*0.5);


        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.5-50))*2), body.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-50))*-5), body.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-50))*3));


        this.setRotateAngle(scale1, scale1.rotateAngleX + (float) Math.toRadians(0), scale1.rotateAngleY + (float) Math.toRadians(0), scale1.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-50))*1));


        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(0), chest.rotateAngleY + (float) Math.toRadians(0), chest.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.5-100))*2), neck.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-150))*-1), neck.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.5-100))*-4), head.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-150))*1), head.rotateAngleZ + (float) Math.toRadians(0));



        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 24.39523 + (((tickAnim - 0) / 10) * (8.95347-(24.39523)));
            yy = -6.62463 + (((tickAnim - 0) / 10) * (-30.11139-(-6.62463)));
            zz = 29.3331 + (((tickAnim - 0) / 10) * (20.21785-(29.3331)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 8.95347 + (((tickAnim - 10) / 10) * (-8.1603-(8.95347)));
            yy = -30.11139 + (((tickAnim - 10) / 10) * (-52.02002-(-30.11139)));
            zz = 20.21785 + (((tickAnim - 10) / 10) * (9.50063-(20.21785)));
        }
        else if (tickAnim >= 20 && tickAnim < 40) {
            xx = -8.1603 + (((tickAnim - 20) / 20) * (24.39523-(-8.1603)));
            yy = -52.02002 + (((tickAnim - 20) / 20) * (-6.62463-(-52.02002)));
            zz = 9.50063 + (((tickAnim - 20) / 20) * (29.3331-(9.50063)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm1, rightArm1.rotateAngleX + (float) Math.toRadians(xx), rightArm1.rotateAngleY + (float) Math.toRadians(yy), rightArm1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 60.78687 + (((tickAnim - 0) / 10) * (-64.50785-(60.78687)));
            yy = 16.14048 + (((tickAnim - 0) / 10) * (33.22931-(16.14048)));
            zz = 55.00225 + (((tickAnim - 0) / 10) * (13.94432-(55.00225)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = -64.50785 + (((tickAnim - 10) / 10) * (-29.33941-(-64.50785)));
            yy = 33.22931 + (((tickAnim - 10) / 10) * (16.14165-(33.22931)));
            zz = 13.94432 + (((tickAnim - 10) / 10) * (34.77151-(13.94432)));
        }
        else if (tickAnim >= 20 && tickAnim < 40) {
            xx = -29.33941 + (((tickAnim - 20) / 20) * (60.78687-(-29.33941)));
            yy = 16.14165 + (((tickAnim - 20) / 20) * (16.14048-(16.14165)));
            zz = 34.77151 + (((tickAnim - 20) / 20) * (55.00225-(34.77151)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm2, rightArm2.rotateAngleX + (float) Math.toRadians(xx), rightArm2.rotateAngleY + (float) Math.toRadians(yy), rightArm2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0.025 + (((tickAnim - 0) / 20) * (0-(0.025)));
            yy = -0.275 + (((tickAnim - 0) / 20) * (0-(-0.275)));
            zz = -0.05 + (((tickAnim - 0) / 20) * (0-(-0.05)));
        }
        else if (tickAnim >= 20 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 20) / 20) * (0.025-(0)));
            yy = 0 + (((tickAnim - 20) / 20) * (-0.275-(0)));
            zz = 0 + (((tickAnim - 20) / 20) * (-0.05-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightArm2.rotationPointX = this.rightArm2.rotationPointX + (float)(xx);
        this.rightArm2.rotationPointY = this.rightArm2.rotationPointY - (float)(yy);
        this.rightArm2.rotationPointZ = this.rightArm2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 57.01128 + (((tickAnim - 0) / 3) * (74.36083-(57.01128)));
            yy = -38.24081 + (((tickAnim - 0) / 3) * (-79.46999-(-38.24081)));
            zz = 46.14569 + (((tickAnim - 0) / 3) * (72.46178-(46.14569)));
        }
        else if (tickAnim >= 3 && tickAnim < 10) {
            xx = 74.36083 + (((tickAnim - 3) / 7) * (259.46111-(74.36083)));
            yy = -79.46999 + (((tickAnim - 3) / 7) * (9.62576-(-79.46999)));
            zz = 72.46178 + (((tickAnim - 3) / 7) * (-122.46507-(72.46178)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 259.46111 + (((tickAnim - 10) / 10) * (97.08796-(259.46111)));
            yy = 9.62576 + (((tickAnim - 10) / 10) * (-50.05405-(9.62576)));
            zz = -122.46507 + (((tickAnim - 10) / 10) * (38.66617-(-122.46507)));
        }
        else if (tickAnim >= 20 && tickAnim < 27) {
            xx = 97.08796 + (((tickAnim - 20) / 7) * (65.05307-(97.08796)));
            yy = -50.05405 + (((tickAnim - 20) / 7) * (-32.97375-(-50.05405)));
            zz = 38.66617 + (((tickAnim - 20) / 7) * (79.53192-(38.66617)));
        }
        else if (tickAnim >= 27 && tickAnim < 40) {
            xx = 65.05307 + (((tickAnim - 27) / 13) * (57.01128-(65.05307)));
            yy = -32.97375 + (((tickAnim - 27) / 13) * (-38.24081-(-32.97375)));
            zz = 79.53192 + (((tickAnim - 27) / 13) * (46.14569-(79.53192)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm3, rightArm3.rotateAngleX + (float) Math.toRadians(xx), rightArm3.rotateAngleY + (float) Math.toRadians(yy), rightArm3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0.225-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0.225-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 10) {
            xx = 0.225 + (((tickAnim - 3) / 7) * (0.13-(0.225)));
            yy = 0 + (((tickAnim - 3) / 7) * (0.145-(0)));
            zz = 0.225 + (((tickAnim - 3) / 7) * (0.08-(0.225)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = 0.13 + (((tickAnim - 10) / 5) * (0.04-(0.13)));
            yy = 0.145 + (((tickAnim - 10) / 5) * (0.6-(0.145)));
            zz = 0.08 + (((tickAnim - 10) / 5) * (0.04-(0.08)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = 0.04 + (((tickAnim - 15) / 5) * (-0.575-(0.04)));
            yy = 0.6 + (((tickAnim - 15) / 5) * (0.125-(0.6)));
            zz = 0.04 + (((tickAnim - 15) / 5) * (0-(0.04)));
        }
        else if (tickAnim >= 20 && tickAnim < 23) {
            xx = -0.575 + (((tickAnim - 20) / 3) * (-0.41-(-0.575)));
            yy = 0.125 + (((tickAnim - 20) / 3) * (-0.11-(0.125)));
            zz = 0 + (((tickAnim - 20) / 3) * (-0.01-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 27) {
            xx = -0.41 + (((tickAnim - 23) / 4) * (-0.25-(-0.41)));
            yy = -0.11 + (((tickAnim - 23) / 4) * (0.1-(-0.11)));
            zz = -0.01 + (((tickAnim - 23) / 4) * (-0.025-(-0.01)));
        }
        else if (tickAnim >= 27 && tickAnim < 33) {
            xx = -0.25 + (((tickAnim - 27) / 6) * (-0.52-(-0.25)));
            yy = 0.1 + (((tickAnim - 27) / 6) * (1.07-(0.1)));
            zz = -0.025 + (((tickAnim - 27) / 6) * (-0.01-(-0.025)));
        }
        else if (tickAnim >= 33 && tickAnim < 40) {
            xx = -0.52 + (((tickAnim - 33) / 7) * (0-(-0.52)));
            yy = 1.07 + (((tickAnim - 33) / 7) * (0-(1.07)));
            zz = -0.01 + (((tickAnim - 33) / 7) * (0-(-0.01)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightArm3.rotationPointX = this.rightArm3.rotationPointX + (float)(xx);
        this.rightArm3.rotationPointY = this.rightArm3.rotationPointY - (float)(yy);
        this.rightArm3.rotationPointZ = this.rightArm3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = -8.1603 + (((tickAnim - 0) / 20) * (24.39523-(-8.1603)));
            yy = 52.02002 + (((tickAnim - 0) / 20) * (6.62463-(52.02002)));
            zz = -9.50063 + (((tickAnim - 0) / 20) * (-29.3331-(-9.50063)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 24.39523 + (((tickAnim - 20) / 10) * (8.95347-(24.39523)));
            yy = 6.62463 + (((tickAnim - 20) / 10) * (30.11139-(6.62463)));
            zz = -29.3331 + (((tickAnim - 20) / 10) * (-20.21785-(-29.3331)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = 8.95347 + (((tickAnim - 30) / 10) * (-8.1603-(8.95347)));
            yy = 30.11139 + (((tickAnim - 30) / 10) * (52.02002-(30.11139)));
            zz = -20.21785 + (((tickAnim - 30) / 10) * (-9.50063-(-20.21785)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm1, leftArm1.rotateAngleX + (float) Math.toRadians(xx), leftArm1.rotateAngleY + (float) Math.toRadians(yy), leftArm1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = -29.33941 + (((tickAnim - 0) / 20) * (60.78687-(-29.33941)));
            yy = -16.14165 + (((tickAnim - 0) / 20) * (-16.14048-(-16.14165)));
            zz = -34.77151 + (((tickAnim - 0) / 20) * (-55.00225-(-34.77151)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 60.78687 + (((tickAnim - 20) / 10) * (-62.00785-(60.78687)));
            yy = -16.14048 + (((tickAnim - 20) / 10) * (-33.22931-(-16.14048)));
            zz = -55.00225 + (((tickAnim - 20) / 10) * (-13.94432-(-55.00225)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = -62.00785 + (((tickAnim - 30) / 10) * (-29.33941-(-62.00785)));
            yy = -33.22931 + (((tickAnim - 30) / 10) * (-16.14165-(-33.22931)));
            zz = -13.94432 + (((tickAnim - 30) / 10) * (-34.77151-(-13.94432)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm2, leftArm2.rotateAngleX + (float) Math.toRadians(xx), leftArm2.rotateAngleY + (float) Math.toRadians(yy), leftArm2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (0.025-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (-0.275-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (-0.05-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 40) {
            xx = 0.025 + (((tickAnim - 20) / 20) * (0-(0.025)));
            yy = -0.275 + (((tickAnim - 20) / 20) * (0-(-0.275)));
            zz = -0.05 + (((tickAnim - 20) / 20) * (0-(-0.05)));
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
            xx = 36.40421 + (((tickAnim - 0) / 10) * (-43.56176-(36.40421)));
            yy = -17.36879 + (((tickAnim - 0) / 10) * (18.44758-(-17.36879)));
            zz = 66.90255 + (((tickAnim - 0) / 10) * (4.83862-(66.90255)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = -43.56176 + (((tickAnim - 10) / 10) * (57.01128-(-43.56176)));
            yy = 18.44758 + (((tickAnim - 10) / 10) * (-38.24081-(18.44758)));
            zz = 4.83862 + (((tickAnim - 10) / 10) * (46.14569-(4.83862)));
        }
        else if (tickAnim >= 20 && tickAnim < 23) {
            xx = 57.01128 + (((tickAnim - 20) / 3) * (74.36083-(57.01128)));
            yy = -38.24081 + (((tickAnim - 20) / 3) * (-79.46999-(-38.24081)));
            zz = 46.14569 + (((tickAnim - 20) / 3) * (72.46178-(46.14569)));
        }
        else if (tickAnim >= 23 && tickAnim < 30) {
            xx = 74.36083 + (((tickAnim - 23) / 7) * (97.08796-(74.36083)));
            yy = -79.46999 + (((tickAnim - 23) / 7) * (-50.05405-(-79.46999)));
            zz = 72.46178 + (((tickAnim - 23) / 7) * (38.66617-(72.46178)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = 97.08796 + (((tickAnim - 30) / 10) * (36.40421-(97.08796)));
            yy = -50.05405 + (((tickAnim - 30) / 10) * (-17.36879-(-50.05405)));
            zz = 38.66617 + (((tickAnim - 30) / 10) * (66.90255-(38.66617)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm3, leftArm3.rotateAngleX + (float) Math.toRadians(xx), leftArm3.rotateAngleY + (float) Math.toRadians(yy), leftArm3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            yy = 0.125 + (((tickAnim - 0) / 2) * (0.18-(0.125)));
            zz = 0 + (((tickAnim - 0) / 2) * (0.06-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 2) / 3) * (0-(0)));
            yy = 0.18 + (((tickAnim - 2) / 3) * (0.35-(0.18)));
            zz = 0.06 + (((tickAnim - 2) / 3) * (0.18-(0.06)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 5) / 5) * (0.1-(0)));
            yy = 0.35 + (((tickAnim - 5) / 5) * (0.15-(0.35)));
            zz = 0.18 + (((tickAnim - 5) / 5) * (0.175-(0.18)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 0.1 + (((tickAnim - 10) / 10) * (0-(0.1)));
            yy = 0.15 + (((tickAnim - 10) / 10) * (0-(0.15)));
            zz = 0.175 + (((tickAnim - 10) / 10) * (0-(0.175)));
        }
        else if (tickAnim >= 20 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 20) / 3) * (0.225-(0)));
            yy = 0 + (((tickAnim - 20) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 3) * (0.225-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 37) {
            xx = 0.225 + (((tickAnim - 23) / 14) * (0.04-(0.225)));
            yy = 0 + (((tickAnim - 23) / 14) * (0.6-(0)));
            zz = 0.225 + (((tickAnim - 23) / 14) * (0.04-(0.225)));
        }
        else if (tickAnim >= 37 && tickAnim < 40) {
            xx = 0.04 + (((tickAnim - 37) / 3) * (0-(0.04)));
            yy = 0.6 + (((tickAnim - 37) / 3) * (0.125-(0.6)));
            zz = 0.04 + (((tickAnim - 37) / 3) * (0-(0.04)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftArm3.rotationPointX = this.leftArm3.rotationPointX + (float)(xx);
        this.leftArm3.rotationPointY = this.leftArm3.rotationPointY - (float)(yy);
        this.leftArm3.rotationPointZ = this.leftArm3.rotationPointZ + (float)(zz);



        this.setRotateAngle(tail1, tail1.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.5-50))*-2), tail1.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-100))*5), tail1.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-50))*-2));


        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.5-100))*-2), tail2.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-150))*10), tail2.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-50))*-2));


        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.5-100))*-2), tail3.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-200))*15), tail3.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-50))*-2));


        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.5-100))*-2), tail4.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-250))*20), tail4.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-50))*-2));



        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 23.71288 + (((tickAnim - 0) / 15) * (52.60142-(23.71288)));
            yy = 7.33604 + (((tickAnim - 0) / 15) * (18.86321-(7.33604)));
            zz = 36.6112 + (((tickAnim - 0) / 15) * (2.36398-(36.6112)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = 52.60142 + (((tickAnim - 15) / 5) * (59.06719-(52.60142)));
            yy = 18.86321 + (((tickAnim - 15) / 5) * (15.97556-(18.86321)));
            zz = 2.36398 + (((tickAnim - 15) / 5) * (19.13676-(2.36398)));
        }
        else if (tickAnim >= 20 && tickAnim < 23) {
            xx = 59.06719 + (((tickAnim - 20) / 3) * (36.20042-(59.06719)));
            yy = 15.97556 + (((tickAnim - 20) / 3) * (15.21616-(15.97556)));
            zz = 19.13676 + (((tickAnim - 20) / 3) * (43.64322-(19.13676)));
        }
        else if (tickAnim >= 23 && tickAnim < 30) {
            xx = 36.20042 + (((tickAnim - 23) / 7) * (3.66325-(36.20042)));
            yy = 15.21616 + (((tickAnim - 23) / 7) * (5.68077-(15.21616)));
            zz = 43.64322 + (((tickAnim - 23) / 7) * (31.29879-(43.64322)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = 3.66325 + (((tickAnim - 30) / 10) * (23.71288-(3.66325)));
            yy = 5.68077 + (((tickAnim - 30) / 10) * (7.33604-(5.68077)));
            zz = 31.29879 + (((tickAnim - 30) / 10) * (36.6112-(31.29879)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg1, rightLeg1.rotateAngleX + (float) Math.toRadians(xx), rightLeg1.rotateAngleY + (float) Math.toRadians(yy), rightLeg1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 6 + (((tickAnim - 0) / 15) * (7.25-(6)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = 7.25 + (((tickAnim - 15) / 5) * (18.84-(7.25)));
            yy = 0 + (((tickAnim - 15) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 5) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 23) {
            xx = 18.84 + (((tickAnim - 20) / 3) * (24.63-(18.84)));
            yy = 0 + (((tickAnim - 20) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 3) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 30) {
            xx = 24.63 + (((tickAnim - 23) / 7) * (-15.5-(24.63)));
            yy = 0 + (((tickAnim - 23) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 7) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = -15.5 + (((tickAnim - 30) / 10) * (6-(-15.5)));
            yy = 0 + (((tickAnim - 30) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg2, rightLeg2.rotateAngleX + (float) Math.toRadians(xx), rightLeg2.rotateAngleY + (float) Math.toRadians(yy), rightLeg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            yy = -0.2 + (((tickAnim - 0) / 15) * (0-(-0.2)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 15) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 15) / 15) * (-0.2-(0)));
            zz = 0 + (((tickAnim - 15) / 15) * (0-(0)));
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
            xx = -17.31111 + (((tickAnim - 0) / 7) * (-29.55666-(-17.31111)));
            yy = -8.74026 + (((tickAnim - 0) / 7) * (14.08394-(-8.74026)));
            zz = -36.023 + (((tickAnim - 0) / 7) * (-16.21943-(-36.023)));
        }
        else if (tickAnim >= 7 && tickAnim < 15) {
            xx = -29.55666 + (((tickAnim - 7) / 8) * (63.66755-(-29.55666)));
            yy = 14.08394 + (((tickAnim - 7) / 8) * (45.70902-(14.08394)));
            zz = -16.21943 + (((tickAnim - 7) / 8) * (-4.37878-(-16.21943)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = 63.66755 + (((tickAnim - 15) / 5) * (81.77096-(63.66755)));
            yy = 45.70902 + (((tickAnim - 15) / 5) * (52.0229-(45.70902)));
            zz = -4.37878 + (((tickAnim - 15) / 5) * (4.68733-(-4.37878)));
        }
        else if (tickAnim >= 20 && tickAnim < 22) {
            xx = 81.77096 + (((tickAnim - 20) / 2) * (49.93798-(81.77096)));
            yy = 52.0229 + (((tickAnim - 20) / 2) * (25.58664-(52.0229)));
            zz = 4.68733 + (((tickAnim - 20) / 2) * (0.44684-(4.68733)));
        }
        else if (tickAnim >= 22 && tickAnim < 27) {
            xx = 49.93798 + (((tickAnim - 22) / 5) * (1.24237-(49.93798)));
            yy = 25.58664 + (((tickAnim - 22) / 5) * (-5.14726-(25.58664)));
            zz = 0.44684 + (((tickAnim - 22) / 5) * (-35.97025-(0.44684)));
        }
        else if (tickAnim >= 27 && tickAnim < 30) {
            xx = 1.24237 + (((tickAnim - 27) / 3) * (16.57546-(1.24237)));
            yy = -5.14726 + (((tickAnim - 27) / 3) * (14.28512-(-5.14726)));
            zz = -35.97025 + (((tickAnim - 27) / 3) * (-39.65854-(-35.97025)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = 16.57546 + (((tickAnim - 30) / 10) * (-17.31111-(16.57546)));
            yy = 14.28512 + (((tickAnim - 30) / 10) * (-8.74026-(14.28512)));
            zz = -39.65854 + (((tickAnim - 30) / 10) * (-36.023-(-39.65854)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg3, rightLeg3.rotateAngleX + (float) Math.toRadians(xx), rightLeg3.rotateAngleY + (float) Math.toRadians(yy), rightLeg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            yy = 0.4 + (((tickAnim - 0) / 4) * (0.83-(0.4)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 27) {
            xx = 0 + (((tickAnim - 4) / 23) * (0-(0)));
            yy = 0.83 + (((tickAnim - 4) / 23) * (0.435-(0.83)));
            zz = 0 + (((tickAnim - 4) / 23) * (0-(0)));
        }
        else if (tickAnim >= 27 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 27) / 3) * (0-(0)));
            yy = 0.435 + (((tickAnim - 27) / 3) * (0-(0.435)));
            zz = 0 + (((tickAnim - 27) / 3) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 30) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 30) / 3) * (0.455-(0)));
            zz = 0 + (((tickAnim - 30) / 3) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 33) / 2) * (0-(0)));
            yy = 0.455 + (((tickAnim - 33) / 2) * (0.73-(0.455)));
            zz = 0 + (((tickAnim - 33) / 2) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 38) {
            xx = 0 + (((tickAnim - 35) / 3) * (0-(0)));
            yy = 0.73 + (((tickAnim - 35) / 3) * (0.8-(0.73)));
            zz = 0 + (((tickAnim - 35) / 3) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 38) / 2) * (0-(0)));
            yy = 0.8 + (((tickAnim - 38) / 2) * (0.4-(0.8)));
            zz = 0 + (((tickAnim - 38) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightLeg3.rotationPointX = this.rightLeg3.rotationPointX + (float)(xx);
        this.rightLeg3.rotationPointY = this.rightLeg3.rotationPointY - (float)(yy);
        this.rightLeg3.rotationPointZ = this.rightLeg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 36.20042 + (((tickAnim - 0) / 3) * (19.89756-(36.20042)));
            yy = -15.21616 + (((tickAnim - 0) / 3) * (-8.34833-(-15.21616)));
            zz = -43.64322 + (((tickAnim - 0) / 3) * (-39.10179-(-43.64322)));
        }
        else if (tickAnim >= 3 && tickAnim < 10) {
            xx = 19.89756 + (((tickAnim - 3) / 7) * (2.6271-(19.89756)));
            yy = -8.34833 + (((tickAnim - 3) / 7) * (2.05957-(-8.34833)));
            zz = -39.10179 + (((tickAnim - 3) / 7) * (-22.72446-(-39.10179)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 2.6271 + (((tickAnim - 10) / 10) * (24.08168-(2.6271)));
            yy = 2.05957 + (((tickAnim - 10) / 10) * (-7.97617-(2.05957)));
            zz = -22.72446 + (((tickAnim - 10) / 10) * (-38.28116-(-22.72446)));
        }
        else if (tickAnim >= 20 && tickAnim < 35) {
            xx = 24.08168 + (((tickAnim - 20) / 15) * (59.06719-(24.08168)));
            yy = -7.97617 + (((tickAnim - 20) / 15) * (-15.97556-(-7.97617)));
            zz = -38.28116 + (((tickAnim - 20) / 15) * (-19.13676-(-38.28116)));
        }
        else if (tickAnim >= 35 && tickAnim < 40) {
            xx = 59.06719 + (((tickAnim - 35) / 5) * (36.20042-(59.06719)));
            yy = -15.97556 + (((tickAnim - 35) / 5) * (-15.21616-(-15.97556)));
            zz = -19.13676 + (((tickAnim - 35) / 5) * (-43.64322-(-19.13676)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg1, leftLeg1.rotateAngleX + (float) Math.toRadians(xx), leftLeg1.rotateAngleY + (float) Math.toRadians(yy), leftLeg1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 18.84 + (((tickAnim - 0) / 3) * (24.63-(18.84)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 10) {
            xx = 24.63 + (((tickAnim - 3) / 7) * (-15.5-(24.63)));
            yy = 0 + (((tickAnim - 3) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 7) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = -15.5 + (((tickAnim - 10) / 10) * (6-(-15.5)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 35) {
            xx = 6 + (((tickAnim - 20) / 15) * (7.25-(6)));
            yy = 0 + (((tickAnim - 20) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 15) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 40) {
            xx = 7.25 + (((tickAnim - 35) / 5) * (18.84-(7.25)));
            yy = 0 + (((tickAnim - 35) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg2, leftLeg2.rotateAngleX + (float) Math.toRadians(xx), leftLeg2.rotateAngleY + (float) Math.toRadians(yy), leftLeg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (-0.2-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            yy = -0.2 + (((tickAnim - 10) / 10) * (-0.2-(-0.2)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 20) / 15) * (0-(0)));
            yy = -0.2 + (((tickAnim - 20) / 15) * (0-(-0.2)));
            zz = 0 + (((tickAnim - 20) / 15) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 35) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 35) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftLeg2.rotationPointX = this.leftLeg2.rotationPointX + (float)(xx);
        this.leftLeg2.rotationPointY = this.leftLeg2.rotationPointY - (float)(yy);
        this.leftLeg2.rotationPointZ = this.leftLeg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 81.77096 + (((tickAnim - 0) / 4) * (1.56352-(81.77096)));
            yy = -52.0229 + (((tickAnim - 0) / 4) * (14.06774-(-52.0229)));
            zz = -4.68733 + (((tickAnim - 0) / 4) * (5.9139-(-4.68733)));
        }
        else if (tickAnim >= 4 && tickAnim < 8) {
            xx = 1.56352 + (((tickAnim - 4) / 4) * (-1.52693-(1.56352)));
            yy = 14.06774 + (((tickAnim - 4) / 4) * (5.07032-(14.06774)));
            zz = 5.9139 + (((tickAnim - 4) / 4) * (5.5968-(5.9139)));
        }
        else if (tickAnim >= 8 && tickAnim < 12) {
            xx = -1.52693 + (((tickAnim - 8) / 4) * (20.95789-(-1.52693)));
            yy = 5.07032 + (((tickAnim - 8) / 4) * (-5.95185-(5.07032)));
            zz = 5.5968 + (((tickAnim - 8) / 4) * (15.14819-(5.5968)));
        }
        else if (tickAnim >= 12 && tickAnim < 22) {
            xx = 20.95789 + (((tickAnim - 12) / 10) * (-18.65089-(20.95789)));
            yy = -5.95185 + (((tickAnim - 12) / 10) * (5.17913-(-5.95185)));
            zz = 15.14819 + (((tickAnim - 12) / 10) * (25.005-(15.14819)));
        }
        else if (tickAnim >= 22 && tickAnim < 28) {
            xx = -18.65089 + (((tickAnim - 22) / 6) * (-29.55666-(-18.65089)));
            yy = 5.17913 + (((tickAnim - 22) / 6) * (-14.08394-(5.17913)));
            zz = 25.005 + (((tickAnim - 22) / 6) * (16.21943-(25.005)));
        }
        else if (tickAnim >= 28 && tickAnim < 37) {
            xx = -29.55666 + (((tickAnim - 28) / 9) * (63.66755-(-29.55666)));
            yy = -14.08394 + (((tickAnim - 28) / 9) * (-45.70902-(-14.08394)));
            zz = 16.21943 + (((tickAnim - 28) / 9) * (4.37878-(16.21943)));
        }
        else if (tickAnim >= 37 && tickAnim < 40) {
            xx = 63.66755 + (((tickAnim - 37) / 3) * (81.77096-(63.66755)));
            yy = -45.70902 + (((tickAnim - 37) / 3) * (-52.0229-(-45.70902)));
            zz = 4.37878 + (((tickAnim - 37) / 3) * (-4.68733-(4.37878)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg3, leftLeg3.rotateAngleX + (float) Math.toRadians(xx), leftLeg3.rotateAngleY + (float) Math.toRadians(yy), leftLeg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 4) * (0.45-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 4) / 8) * (0-(0)));
            yy = 0.45 + (((tickAnim - 4) / 8) * (1.125-(0.45)));
            zz = 0 + (((tickAnim - 4) / 8) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 12) / 2) * (0-(0)));
            yy = 1.125 + (((tickAnim - 12) / 2) * (1.35-(1.125)));
            zz = 0 + (((tickAnim - 12) / 2) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 17) {
            xx = 0 + (((tickAnim - 14) / 3) * (0-(0)));
            yy = 1.35 + (((tickAnim - 14) / 3) * (1.28-(1.35)));
            zz = 0 + (((tickAnim - 14) / 3) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 17) / 2) * (0-(0)));
            yy = 1.28 + (((tickAnim - 17) / 2) * (0.9-(1.28)));
            zz = 0 + (((tickAnim - 17) / 2) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 22) {
            xx = 0 + (((tickAnim - 19) / 3) * (0-(0)));
            yy = 0.9 + (((tickAnim - 19) / 3) * (0.525-(0.9)));
            zz = 0 + (((tickAnim - 19) / 3) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 26) {
            xx = 0 + (((tickAnim - 22) / 4) * (0-(0)));
            yy = 0.525 + (((tickAnim - 22) / 4) * (0.405-(0.525)));
            zz = 0 + (((tickAnim - 22) / 4) * (0-(0)));
        }
        else if (tickAnim >= 26 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 26) / 14) * (0-(0)));
            yy = 0.405 + (((tickAnim - 26) / 14) * (0-(0.405)));
            zz = 0 + (((tickAnim - 26) / 14) * (0-(0)));
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


    public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        EntityPrehistoricFloraMirasaura e = (EntityPrehistoricFloraMirasaura) entity;
        animator.update(entity);
        //this.resetToDefaultPose();

    }
}
