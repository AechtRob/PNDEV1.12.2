package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.EntityPrehistoricFloraDemandasaurus;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;

public class ModelDemandasaurus extends ModelBasePalaeopedia {
    private final AdvancedModelRenderer Demandasaurus;
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
    private final AdvancedModelRenderer tail8;
    private final AdvancedModelRenderer body;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer chest;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer cube_r6;
    private final AdvancedModelRenderer leftArm1;
    private final AdvancedModelRenderer leftArm2;
    private final AdvancedModelRenderer leftHand;
    private final AdvancedModelRenderer cube_r7;
    private final AdvancedModelRenderer rightArm1;
    private final AdvancedModelRenderer rightArm2;
    private final AdvancedModelRenderer rightHand;
    private final AdvancedModelRenderer cube_r8;
    private final AdvancedModelRenderer neck1;
    private final AdvancedModelRenderer neck2;
    private final AdvancedModelRenderer neck3;
    private final AdvancedModelRenderer neck4;
    private final AdvancedModelRenderer head;
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
    private final AdvancedModelRenderer eyes;
    private final AdvancedModelRenderer cube_r20;
    private final AdvancedModelRenderer jaw;
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

    public ModelDemandasaurus() {
        this.textureWidth = 173;
        this.textureHeight = 173;

        this.Demandasaurus = new AdvancedModelRenderer(this);
        this.Demandasaurus.setRotationPoint(0.0F, -5.75F, 13.25F);


        this.hips = new AdvancedModelRenderer(this);
        this.hips.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Demandasaurus.addChild(hips);


        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(0.5F, -7.0F, -1.25F);
        this.hips.addChild(cube_r1);
        this.setRotateAngle(cube_r1, -0.0873F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 74, 0, -6.5F, -5.0F, -6.0F, 12, 11, 14, 0.0F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(0.5F, 13.25F, -3.25F);
        this.hips.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.1745F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 0, 38, -8.0F, -17.0F, -3.0F, 15, 17, 16, 0.0F, false));

        this.tail1 = new AdvancedModelRenderer(this);
        this.tail1.setRotationPoint(0.0F, -2.0F, 6.0F);
        this.hips.addChild(tail1);
        this.setRotateAngle(tail1, -0.3054F, 0.0F, 0.0F);
        this.tail1.cubeList.add(new ModelBox(tail1, 0, 71, -5.0F, -8.5F, -3.0F, 10, 17, 15, 0.0F, false));

        this.tail2 = new AdvancedModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, -2.75F, 11.0F);
        this.tail1.addChild(tail2);
        this.setRotateAngle(tail2, 0.1745F, 0.0F, 0.0F);
        this.tail2.cubeList.add(new ModelBox(tail2, 102, 93, -3.5F, -5.5F, -2.0F, 7, 12, 15, 0.0F, false));

        this.tail3 = new AdvancedModelRenderer(this);
        this.tail3.setRotationPoint(0.0F, -1.75F, 12.0F);
        this.tail2.addChild(tail3);
        this.setRotateAngle(tail3, 0.0436F, 0.0F, 0.0F);
        this.tail3.cubeList.add(new ModelBox(tail3, 46, 118, -2.5F, -3.5F, -2.0F, 5, 8, 16, 0.0F, false));

        this.tail4 = new AdvancedModelRenderer(this);
        this.tail4.setRotationPoint(0.0F, -0.75F, 13.0F);
        this.tail3.addChild(tail4);
        this.setRotateAngle(tail4, 0.1309F, 0.0F, 0.0F);
        this.tail4.cubeList.add(new ModelBox(tail4, 88, 120, -2.0F, -2.5F, -2.0F, 4, 6, 17, 0.0F, false));

        this.tail5 = new AdvancedModelRenderer(this);
        this.tail5.setRotationPoint(0.0F, -0.75F, 14.0F);
        this.tail4.addChild(tail5);
        this.setRotateAngle(tail5, -0.0873F, 0.0F, 0.0F);
        this.tail5.cubeList.add(new ModelBox(tail5, 122, 25, -1.5F, -1.5F, -1.0F, 3, 5, 18, 0.0F, false));

        this.tail6 = new AdvancedModelRenderer(this);
        this.tail6.setRotationPoint(0.0F, 0.25F, 16.0F);
        this.tail5.addChild(tail6);
        this.setRotateAngle(tail6, -0.0436F, 0.0F, 0.0F);
        this.tail6.cubeList.add(new ModelBox(tail6, 126, 0, -1.0F, -1.5F, -1.0F, 2, 3, 19, 0.0F, false));

        this.tail7 = new AdvancedModelRenderer(this);
        this.tail7.setRotationPoint(0.0F, -0.25F, 17.0F);
        this.tail6.addChild(tail7);
        this.setRotateAngle(tail7, -0.0873F, 0.0F, 0.0F);
        this.tail7.cubeList.add(new ModelBox(tail7, 0, 127, -0.5F, -1.0F, -1.0F, 1, 2, 20, 0.0F, false));

        this.tail8 = new AdvancedModelRenderer(this);
        this.tail8.setRotationPoint(0.0F, -0.25F, 19.0F);
        this.tail7.addChild(tail8);
        this.setRotateAngle(tail8, -0.2182F, 0.0F, 0.0F);
        this.tail8.cubeList.add(new ModelBox(tail8, 130, 120, -0.5F, -0.5F, -0.25F, 1, 1, 20, -0.01F, false));

        this.body = new AdvancedModelRenderer(this);
        this.body.setRotationPoint(0.0F, -3.5F, -6.0F);
        this.hips.addChild(body);
        this.body.cubeList.add(new ModelBox(body, 0, 0, -9.5F, -2.25F, -15.25F, 19, 20, 18, 0.0F, false));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(0.5F, -3.5F, -7.25F);
        this.body.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.1047F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 62, 38, -8.0F, -4.8F, -6.0F, 15, 11, 15, 0.0F, false));

        this.chest = new AdvancedModelRenderer(this);
        this.chest.setRotationPoint(0.0F, -0.5F, -13.0F);
        this.body.addChild(chest);


        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(0.5F, 0.0F, -6.0F);
        this.chest.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.2618F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 50, 93, -6.5F, -5.0F, -5.0F, 12, 11, 14, 0.0F, false));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(0.5F, 14.65F, -10.9F);
        this.chest.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.48F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 118, 64, -7.0F, -9.0F, 0.0F, 13, 9, 10, 0.0F, false));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(0.5F, 17.25F, -1.25F);
        this.chest.addChild(cube_r6);
        this.setRotateAngle(cube_r6, -0.2618F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 62, 64, -8.0F, -16.0F, -10.0F, 15, 16, 13, 0.0F, false));

        this.leftArm1 = new AdvancedModelRenderer(this);
        this.leftArm1.setRotationPoint(7.5F, 12.0F, -6.5F);
        this.chest.addChild(leftArm1);
        this.setRotateAngle(leftArm1, 0.1309F, 0.0F, 0.0F);
        this.leftArm1.cubeList.add(new ModelBox(leftArm1, 146, 83, -2.5F, -2.0F, -2.5F, 5, 13, 5, 0.0F, false));

        this.leftArm2 = new AdvancedModelRenderer(this);
        this.leftArm2.setRotationPoint(0.0F, 11.0F, 0.0F);
        this.leftArm1.addChild(leftArm2);
        this.setRotateAngle(leftArm2, -0.3054F, 0.0F, 0.0F);
        this.leftArm2.cubeList.add(new ModelBox(leftArm2, 100, 25, -2.0F, -1.0F, -2.0F, 4, 9, 4, 0.0F, false));

        this.leftHand = new AdvancedModelRenderer(this);
        this.leftHand.setRotationPoint(0.0F, 8.0F, 0.0F);
        this.leftArm2.addChild(leftHand);
        this.setRotateAngle(leftHand, 0.1745F, 0.0F, 0.0F);
        this.leftHand.cubeList.add(new ModelBox(leftHand, 122, 48, -2.5F, -1.0F, -1.5F, 5, 4, 3, 0.0F, false));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(-2.5F, 1.0F, -0.5F);
        this.leftHand.addChild(cube_r7);
        this.setRotateAngle(cube_r7, -0.247F, 0.3085F, -0.6931F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 116, 28, -2.0F, 0.0F, 0.0F, 2, 1, 1, 0.0F, false));

        this.rightArm1 = new AdvancedModelRenderer(this);
        this.rightArm1.setRotationPoint(-7.5F, 12.0F, -6.5F);
        this.chest.addChild(rightArm1);
        this.setRotateAngle(rightArm1, 0.1309F, 0.0F, 0.0F);
        this.rightArm1.cubeList.add(new ModelBox(rightArm1, 146, 83, -2.5F, -2.0F, -2.5F, 5, 13, 5, 0.0F, true));

        this.rightArm2 = new AdvancedModelRenderer(this);
        this.rightArm2.setRotationPoint(0.0F, 11.0F, 0.0F);
        this.rightArm1.addChild(rightArm2);
        this.setRotateAngle(rightArm2, -0.3054F, 0.0F, 0.0F);
        this.rightArm2.cubeList.add(new ModelBox(rightArm2, 100, 25, -2.0F, -1.0F, -2.0F, 4, 9, 4, 0.0F, true));

        this.rightHand = new AdvancedModelRenderer(this);
        this.rightHand.setRotationPoint(0.0F, 8.0F, 0.0F);
        this.rightArm2.addChild(rightHand);
        this.setRotateAngle(rightHand, 0.1745F, 0.0F, 0.0F);
        this.rightHand.cubeList.add(new ModelBox(rightHand, 122, 48, -2.5F, -1.0F, -1.5F, 5, 4, 3, 0.0F, true));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(2.5F, 1.0F, -0.5F);
        this.rightHand.addChild(cube_r8);
        this.setRotateAngle(cube_r8, -0.247F, -0.3085F, 0.6931F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 116, 28, 0.0F, 0.0F, 0.0F, 2, 1, 1, 0.0F, true));

        this.neck1 = new AdvancedModelRenderer(this);
        this.neck1.setRotationPoint(0.0F, 2.0F, -10.0F);
        this.chest.addChild(neck1);
        this.setRotateAngle(neck1, 0.0436F, 0.0F, 0.0F);
        this.neck1.cubeList.add(new ModelBox(neck1, 0, 103, -4.5F, -5.5F, -13.0F, 9, 10, 14, 0.0F, false));

        this.neck2 = new AdvancedModelRenderer(this);
        this.neck2.setRotationPoint(0.0F, -0.75F, -12.0F);
        this.neck1.addChild(neck2);
        this.setRotateAngle(neck2, -0.3491F, 0.0F, 0.0F);
        this.neck2.cubeList.add(new ModelBox(neck2, 130, 141, -3.0F, -4.5F, -12.0F, 6, 8, 13, 0.0F, false));

        this.neck3 = new AdvancedModelRenderer(this);
        this.neck3.setRotationPoint(0.0F, -1.75F, -11.0F);
        this.neck2.addChild(neck3);
        this.setRotateAngle(neck3, -0.1309F, 0.0F, 0.0F);
        this.neck3.cubeList.add(new ModelBox(neck3, 42, 142, -2.0F, -2.5F, -11.5F, 4, 6, 13, 0.0F, false));

        this.neck4 = new AdvancedModelRenderer(this);
        this.neck4.setRotationPoint(0.0F, 0.25F, -11.0F);
        this.neck3.addChild(neck4);
        this.setRotateAngle(neck4, 0.48F, 0.0F, 0.0F);
        this.neck4.cubeList.add(new ModelBox(neck4, 118, 83, -1.5F, -2.5F, -5.0F, 3, 4, 6, -0.02F, false));

        this.head = new AdvancedModelRenderer(this);
        this.head.setRotationPoint(0.0F, -0.5F, -4.75F);
        this.neck4.addChild(head);


        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(-0.5F, 1.1782F, -3.8235F);
        this.head.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.7854F, 0.0F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 50, 88, -1.0F, 0.0F, -0.05F, 3, 1, 3, -0.02F, false));

        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(-0.5F, 1.1782F, -3.8235F);
        this.head.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 1.0472F, 0.0F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 136, 55, -0.5F, 0.0F, -0.05F, 2, 1, 3, 0.0F, false));

        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(-1.5F, 1.1782F, -3.8235F);
        this.head.addChild(cube_r11);
        this.setRotateAngle(cube_r11, 1.2294F, 0.0741F, 0.2054F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 94, 35, 0.0F, 0.0F, -1.9F, 1, 1, 2, 0.0F, true));

        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(1.5F, 1.1782F, -3.8235F);
        this.head.addChild(cube_r12);
        this.setRotateAngle(cube_r12, 1.2294F, -0.0741F, -0.2054F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 94, 35, -1.0F, 0.0F, -1.9F, 1, 1, 2, 0.0F, false));

        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(0.0F, 3.3497F, -3.6679F);
        this.head.addChild(cube_r13);
        this.setRotateAngle(cube_r13, 0.7974F, 0.1536F, 0.1555F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 58, 92, -1.8263F, -0.6F, -0.1664F, 1, 1, 0, 0.0F, false));

        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(0.0F, 3.3497F, -3.6679F);
        this.head.addChild(cube_r14);
        this.setRotateAngle(cube_r14, 0.7974F, -0.1536F, -0.1555F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 48, 103, 0.8263F, -0.6F, -0.1664F, 1, 1, 0, 0.0F, false));

        this.cube_r15 = new AdvancedModelRenderer(this);
        this.cube_r15.setRotationPoint(0.0F, 3.3497F, -3.6679F);
        this.head.addChild(cube_r15);
        this.setRotateAngle(cube_r15, 0.7854F, 0.0F, 0.0F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 50, 92, -1.0F, -0.6F, 0.05F, 2, 1, 0, 0.0F, false));

        this.cube_r16 = new AdvancedModelRenderer(this);
        this.cube_r16.setRotationPoint(-0.5F, 1.9901F, -3.0549F);
        this.head.addChild(cube_r16);
        this.setRotateAngle(cube_r16, 1.2217F, 0.0F, 0.0F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 74, 35, -1.0F, -1.0F, -1.5F, 3, 1, 2, 0.01F, false));

        this.cube_r17 = new AdvancedModelRenderer(this);
        this.cube_r17.setRotationPoint(-0.5F, 1.2247F, -1.2071F);
        this.head.addChild(cube_r17);
        this.setRotateAngle(cube_r17, 0.48F, 0.0F, 0.0F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 122, 60, -1.0F, -0.25F, -2.95F, 3, 1, 3, -0.02F, false));

        this.cube_r18 = new AdvancedModelRenderer(this);
        this.cube_r18.setRotationPoint(-0.5F, 1.2247F, -1.2071F);
        this.head.addChild(cube_r18);
        this.setRotateAngle(cube_r18, 0.4363F, 0.0F, 0.0F);
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 50, 84, -1.0F, -1.0F, -2.45F, 3, 1, 3, -0.01F, false));

        this.cube_r19 = new AdvancedModelRenderer(this);
        this.cube_r19.setRotationPoint(-0.5F, 0.0F, -0.5F);
        this.head.addChild(cube_r19);
        this.setRotateAngle(cube_r19, 0.2618F, 0.0F, 0.0F);
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 50, 71, -1.0F, -1.8F, -1.45F, 3, 4, 3, 0.01F, false));

        this.eyes = new AdvancedModelRenderer(this);
        this.eyes.setRotationPoint(-0.5F, -0.85F, -0.65F);
        this.head.addChild(eyes);


        this.cube_r20 = new AdvancedModelRenderer(this);
        this.cube_r20.setRotationPoint(0.0F, 0.85F, 0.15F);
        this.eyes.addChild(cube_r20);
        this.setRotateAngle(cube_r20, 0.2618F, 0.0F, 0.0F);
        this.cube_r20.cubeList.add(new ModelBox(cube_r20, 88, 118, -1.0F, -1.3F, -0.45F, 3, 1, 1, 0.02F, false));

        this.jaw = new AdvancedModelRenderer(this);
        this.jaw.setRotationPoint(-0.5F, 2.0F, -0.35F);
        this.head.addChild(jaw);
        this.setRotateAngle(jaw, -0.2182F, 0.0F, 0.0F);


        this.cube_r21 = new AdvancedModelRenderer(this);
        this.cube_r21.setRotationPoint(-1.0F, 0.7013F, -1.3963F);
        this.jaw.addChild(cube_r21);
        this.setRotateAngle(cube_r21, 0.7537F, 0.1603F, 0.1487F);
        this.cube_r21.cubeList.add(new ModelBox(cube_r21, 46, 103, 0.1F, -0.35F, -1.75F, 1, 1, 0, 0.0F, false));
        this.cube_r21.cubeList.add(new ModelBox(cube_r21, 116, 25, 0.0F, 0.0F, -1.9F, 1, 1, 2, -0.01F, true));

        this.cube_r22 = new AdvancedModelRenderer(this);
        this.cube_r22.setRotationPoint(2.0F, 0.7013F, -1.3963F);
        this.jaw.addChild(cube_r22);
        this.setRotateAngle(cube_r22, 0.7537F, -0.1603F, -0.1487F);
        this.cube_r22.cubeList.add(new ModelBox(cube_r22, 60, 92, -1.1F, -0.35F, -1.75F, 1, 1, 0, 0.0F, false));
        this.cube_r22.cubeList.add(new ModelBox(cube_r22, 116, 25, -1.0F, 0.0F, -1.9F, 1, 1, 2, -0.01F, false));

        this.cube_r23 = new AdvancedModelRenderer(this);
        this.cube_r23.setRotationPoint(0.0F, 0.3635F, -1.0277F);
        this.jaw.addChild(cube_r23);
        this.setRotateAngle(cube_r23, 0.7418F, 0.0F, 0.0F);
        this.cube_r23.cubeList.add(new ModelBox(cube_r23, 54, 92, -0.5F, -0.35F, -2.4F, 2, 1, 0, 0.0F, false));
        this.cube_r23.cubeList.add(new ModelBox(cube_r23, 136, 22, -0.5F, 0.0F, -2.55F, 2, 1, 2, -0.02F, false));
        this.cube_r23.cubeList.add(new ModelBox(cube_r23, 84, 35, -1.0F, 0.0F, -2.0F, 3, 1, 2, 0.0F, false));

        this.cube_r24 = new AdvancedModelRenderer(this);
        this.cube_r24.setRotationPoint(0.0F, 1.7147F, -2.5022F);
        this.jaw.addChild(cube_r24);
        this.setRotateAngle(cube_r24, 0.8727F, 0.0F, 0.0F);
        this.cube_r24.cubeList.add(new ModelBox(cube_r24, 126, 22, -1.0F, 0.05F, 0.3F, 3, 1, 2, -0.03F, false));

        this.cube_r25 = new AdvancedModelRenderer(this);
        this.cube_r25.setRotationPoint(0.0F, 0.3635F, -1.0277F);
        this.jaw.addChild(cube_r25);
        this.setRotateAngle(cube_r25, 0.0349F, 0.0F, 0.0F);
        this.cube_r25.cubeList.add(new ModelBox(cube_r25, 136, 89, -1.0F, -0.7F, 0.0F, 3, 1, 1, -0.02F, false));

        this.cube_r26 = new AdvancedModelRenderer(this);
        this.cube_r26.setRotationPoint(0.0F, 0.3635F, -1.0277F);
        this.jaw.addChild(cube_r26);
        this.setRotateAngle(cube_r26, 0.48F, 0.0F, 0.0F);
        this.cube_r26.cubeList.add(new ModelBox(cube_r26, 134, 60, -1.0F, 0.0F, 0.0F, 3, 1, 3, -0.01F, false));

        this.throat = new AdvancedModelRenderer(this);
        this.throat.setRotationPoint(0.5F, 1.2506F, -0.5659F);
        this.jaw.addChild(throat);


        this.cube_r27 = new AdvancedModelRenderer(this);
        this.cube_r27.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.throat.addChild(cube_r27);
        this.setRotateAngle(cube_r27, 0.2618F, 0.0F, 0.0F);
        this.cube_r27.cubeList.add(new ModelBox(cube_r27, 50, 78, -1.0F, -2.0F, -0.2F, 2, 2, 4, 0.0F, false));

        this.cube_r28 = new AdvancedModelRenderer(this);
        this.cube_r28.setRotationPoint(0.0F, -0.7117F, 2.6563F);
        this.throat.addChild(cube_r28);
        this.setRotateAngle(cube_r28, 0.0873F, 0.0F, 0.0F);
        this.cube_r28.cubeList.add(new ModelBox(cube_r28, 136, 83, -1.0F, -3.0F, 0.05F, 2, 3, 3, 0.01F, false));

        this.leftLeg1 = new AdvancedModelRenderer(this);
        this.leftLeg1.setRotationPoint(7.5F, 0.0F, 0.0F);
        this.hips.addChild(leftLeg1);
        this.setRotateAngle(leftLeg1, -0.1745F, 0.0F, 0.0F);
        this.leftLeg1.cubeList.add(new ModelBox(leftLeg1, 76, 143, -3.0F, -1.0F, -4.0F, 6, 17, 8, 0.0F, false));

        this.leftLeg2 = new AdvancedModelRenderer(this);
        this.leftLeg2.setRotationPoint(0.0F, 16.0F, -0.25F);
        this.leftLeg1.addChild(leftLeg2);
        this.setRotateAngle(leftLeg2, 0.2618F, 0.0F, 0.0F);
        this.leftLeg2.cubeList.add(new ModelBox(leftLeg2, 104, 143, -2.5F, -2.0F, -3.0F, 5, 14, 6, 0.0F, false));

        this.leftFoot = new AdvancedModelRenderer(this);
        this.leftFoot.setRotationPoint(0.0F, 11.0F, 0.5F);
        this.leftLeg2.addChild(leftFoot);
        this.setRotateAngle(leftFoot, -0.0873F, 0.0F, 0.0F);
        this.leftFoot.cubeList.add(new ModelBox(leftFoot, 74, 25, -3.0F, 0.0F, -4.0F, 6, 3, 7, 0.0F, false));

        this.leftToes = new AdvancedModelRenderer(this);
        this.leftToes.setRotationPoint(0.0F, 0.0F, -4.0F);
        this.leftFoot.addChild(leftToes);


        this.cube_r29 = new AdvancedModelRenderer(this);
        this.cube_r29.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.leftToes.addChild(cube_r29);
        this.setRotateAngle(cube_r29, 0.0F, -0.2182F, 0.0F);
        this.cube_r29.cubeList.add(new ModelBox(cube_r29, 122, 55, -2.5F, 0.0F, -1.5F, 5, 3, 2, -0.01F, false));

        this.rightLeg1 = new AdvancedModelRenderer(this);
        this.rightLeg1.setRotationPoint(-7.5F, 0.0F, 0.0F);
        this.hips.addChild(rightLeg1);
        this.setRotateAngle(rightLeg1, -0.1745F, 0.0F, 0.0F);
        this.rightLeg1.cubeList.add(new ModelBox(rightLeg1, 76, 143, -3.0F, -1.0F, -4.0F, 6, 17, 8, 0.0F, true));

        this.rightLeg2 = new AdvancedModelRenderer(this);
        this.rightLeg2.setRotationPoint(0.0F, 16.0F, -0.25F);
        this.rightLeg1.addChild(rightLeg2);
        this.setRotateAngle(rightLeg2, 0.2618F, 0.0F, 0.0F);
        this.rightLeg2.cubeList.add(new ModelBox(rightLeg2, 104, 143, -2.5F, -2.0F, -3.0F, 5, 14, 6, 0.0F, true));

        this.rightFoot = new AdvancedModelRenderer(this);
        this.rightFoot.setRotationPoint(0.0F, 11.0F, 0.5F);
        this.rightLeg2.addChild(rightFoot);
        this.setRotateAngle(rightFoot, -0.0873F, 0.0F, 0.0F);
        this.rightFoot.cubeList.add(new ModelBox(rightFoot, 74, 25, -3.0F, 0.0F, -4.0F, 6, 3, 7, 0.0F, true));

        this.rightToes = new AdvancedModelRenderer(this);
        this.rightToes.setRotationPoint(0.0F, 0.0F, -4.0F);
        this.rightFoot.addChild(rightToes);


        this.cube_r30 = new AdvancedModelRenderer(this);
        this.cube_r30.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.rightToes.addChild(cube_r30);
        this.setRotateAngle(cube_r30, 0.0F, 0.2182F, 0.0F);
        this.cube_r30.cubeList.add(new ModelBox(cube_r30, 122, 55, -2.5F, 0.0F, -1.5F, 5, 3, 2, -0.01F, true));
    
        updateDefaultPose();
        animator = ModelAnimator.create();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        animate((IAnimatedEntity) entity, f, f1, f2, f3, f4, f5);
        this.Demandasaurus.render(f5);
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
        this.Demandasaurus.offsetY = 0.8F;
        this.Demandasaurus.offsetX = 0.35F;
        this.Demandasaurus.rotateAngleY = (float)Math.toRadians(240);
        this.Demandasaurus.rotateAngleX = (float)Math.toRadians(0);
        this.Demandasaurus.rotateAngleZ = (float)Math.toRadians(00);
        this.Demandasaurus.scaleChildren = true;
        float scaler = 0.31F;
        this.Demandasaurus.setScale(scaler, scaler, scaler);
        //Start of pose:


        //End of pose, now render the model:
        this.Demandasaurus.render(f);
        //Reset rotations, positions and sizing:
        this.Demandasaurus.setScale(1.0F, 1.0F, 1.0F);
        this.Demandasaurus.scaleChildren = false;
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

        EntityPrehistoricFloraDemandasaurus camara = (EntityPrehistoricFloraDemandasaurus) e;

//        this.faceTarget(f3, f4, 6, neck1);
//        this.faceTarget(f3, f4, 6, neck2);
//        this.faceTarget(f3, f4, 6, neck3);
//        this.faceTarget(f3, f4, 4, neck4);
//        this.faceTarget(f3, f4, 4, neck5);
//        this.faceTarget(f3, f4, 4, head);


        AdvancedModelRenderer[] Tail = {this.tail1, this.tail2, this.tail3, this.tail4, this.tail5, this.tail6, this.tail7, this.tail8};
        AdvancedModelRenderer[] Neck = {this.neck1, this.neck2, this.neck3, this.neck4, this.head};
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
        EntityPrehistoricFloraDemandasaurus ee = (EntityPrehistoricFloraDemandasaurus) entitylivingbaseIn;

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
        else if (ee.getAnimation() == ee.MAKE_NEST_ANIMATION) {
            animNest(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.LAY_ANIMATION) {
            animLay(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.ROAR_ANIMATION) { //The roar anim
            animRoar(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.GRAZE_ANIMATION) { //The leaves grazing anim
            animGraze(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }



    }



    public void animGraze(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraDemandasaurus entity = (EntityPrehistoricFloraDemandasaurus) entitylivingbaseIn;
        int animCycle = 273;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        if (tickAnim >= 0 && tickAnim < 63) {
            xx = 0 + (((tickAnim - 0) / 63) * (4.75-(0)));
            yy = 0 + (((tickAnim - 0) / 63) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 63) * (0-(0)));
        }
        else if (tickAnim >= 63 && tickAnim < 225) {
            xx = 4.75 + (((tickAnim - 63) / 162) * (4.75-(4.75)));
            yy = 0 + (((tickAnim - 63) / 162) * (0-(0)));
            zz = 0 + (((tickAnim - 63) / 162) * (0-(0)));
        }
        else if (tickAnim >= 225 && tickAnim < 273) {
            xx = 4.75 + (((tickAnim - 225) / 48) * (0-(4.75)));
            yy = 0 + (((tickAnim - 225) / 48) * (0-(0)));
            zz = 0 + (((tickAnim - 225) / 48) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(xx), body.rotateAngleY + (float) Math.toRadians(yy), body.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 63) {
            xx = 0 + (((tickAnim - 0) / 63) * (9.25-(0)));
            yy = 0 + (((tickAnim - 0) / 63) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 63) * (0-(0)));
        }
        else if (tickAnim >= 63 && tickAnim < 225) {
            xx = 9.25 + (((tickAnim - 63) / 162) * (9.25-(9.25)));
            yy = 0 + (((tickAnim - 63) / 162) * (0-(0)));
            zz = 0 + (((tickAnim - 63) / 162) * (0-(0)));
        }
        else if (tickAnim >= 225 && tickAnim < 273) {
            xx = 9.25 + (((tickAnim - 225) / 48) * (0-(9.25)));
            yy = 0 + (((tickAnim - 225) / 48) * (0-(0)));
            zz = 0 + (((tickAnim - 225) / 48) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(xx), chest.rotateAngleY + (float) Math.toRadians(yy), chest.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 63) {
            xx = 0 + (((tickAnim - 0) / 63) * (-26-(0)));
            yy = 0 + (((tickAnim - 0) / 63) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 63) * (0-(0)));
        }
        else if (tickAnim >= 63 && tickAnim < 225) {
            xx = -26 + (((tickAnim - 63) / 162) * (-26-(-26)));
            yy = 0 + (((tickAnim - 63) / 162) * (0-(0)));
            zz = 0 + (((tickAnim - 63) / 162) * (0-(0)));
        }
        else if (tickAnim >= 225 && tickAnim < 273) {
            xx = -26 + (((tickAnim - 225) / 48) * (0-(-26)));
            yy = 0 + (((tickAnim - 225) / 48) * (0-(0)));
            zz = 0 + (((tickAnim - 225) / 48) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm1, leftArm1.rotateAngleX + (float) Math.toRadians(xx), leftArm1.rotateAngleY + (float) Math.toRadians(yy), leftArm1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 63) {
            xx = 0 + (((tickAnim - 0) / 63) * (-15.75-(0)));
            yy = 0 + (((tickAnim - 0) / 63) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 63) * (0-(0)));
        }
        else if (tickAnim >= 63 && tickAnim < 225) {
            xx = -15.75 + (((tickAnim - 63) / 162) * (-15.75-(-15.75)));
            yy = 0 + (((tickAnim - 63) / 162) * (0-(0)));
            zz = 0 + (((tickAnim - 63) / 162) * (0-(0)));
        }
        else if (tickAnim >= 225 && tickAnim < 273) {
            xx = -15.75 + (((tickAnim - 225) / 48) * (0-(-15.75)));
            yy = 0 + (((tickAnim - 225) / 48) * (0-(0)));
            zz = 0 + (((tickAnim - 225) / 48) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm2, leftArm2.rotateAngleX + (float) Math.toRadians(xx), leftArm2.rotateAngleY + (float) Math.toRadians(yy), leftArm2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 63) {
            xx = 0 + (((tickAnim - 0) / 63) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 63) * (0.5-(0)));
            zz = 0 + (((tickAnim - 0) / 63) * (0-(0)));
        }
        else if (tickAnim >= 63 && tickAnim < 225) {
            xx = 0 + (((tickAnim - 63) / 162) * (0-(0)));
            yy = 0.5 + (((tickAnim - 63) / 162) * (0.5-(0.5)));
            zz = 0 + (((tickAnim - 63) / 162) * (0-(0)));
        }
        else if (tickAnim >= 225 && tickAnim < 273) {
            xx = 0 + (((tickAnim - 225) / 48) * (0-(0)));
            yy = 0.5 + (((tickAnim - 225) / 48) * (0-(0.5)));
            zz = 0 + (((tickAnim - 225) / 48) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftArm2.rotationPointX = this.leftArm2.rotationPointX + (float)(xx);
        this.leftArm2.rotationPointY = this.leftArm2.rotationPointY - (float)(yy);
        this.leftArm2.rotationPointZ = this.leftArm2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 63) {
            xx = 0 + (((tickAnim - 0) / 63) * (23.5-(0)));
            yy = 0 + (((tickAnim - 0) / 63) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 63) * (0-(0)));
        }
        else if (tickAnim >= 63 && tickAnim < 225) {
            xx = 23.5 + (((tickAnim - 63) / 162) * (23.5-(23.5)));
            yy = 0 + (((tickAnim - 63) / 162) * (0-(0)));
            zz = 0 + (((tickAnim - 63) / 162) * (0-(0)));
        }
        else if (tickAnim >= 225 && tickAnim < 273) {
            xx = 23.5 + (((tickAnim - 225) / 48) * (0-(23.5)));
            yy = 0 + (((tickAnim - 225) / 48) * (0-(0)));
            zz = 0 + (((tickAnim - 225) / 48) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftHand, leftHand.rotateAngleX + (float) Math.toRadians(xx), leftHand.rotateAngleY + (float) Math.toRadians(yy), leftHand.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 63) {
            xx = 0 + (((tickAnim - 0) / 63) * (-11.75-(0)));
            yy = 0 + (((tickAnim - 0) / 63) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 63) * (0-(0)));
        }
        else if (tickAnim >= 63 && tickAnim < 225) {
            xx = -11.75 + (((tickAnim - 63) / 162) * (-11.75-(-11.75)));
            yy = 0 + (((tickAnim - 63) / 162) * (0-(0)));
            zz = 0 + (((tickAnim - 63) / 162) * (0-(0)));
        }
        else if (tickAnim >= 225 && tickAnim < 273) {
            xx = -11.75 + (((tickAnim - 225) / 48) * (0-(-11.75)));
            yy = 0 + (((tickAnim - 225) / 48) * (0-(0)));
            zz = 0 + (((tickAnim - 225) / 48) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm1, rightArm1.rotateAngleX + (float) Math.toRadians(xx), rightArm1.rotateAngleY + (float) Math.toRadians(yy), rightArm1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 63) {
            xx = 0 + (((tickAnim - 0) / 63) * (-27-(0)));
            yy = 0 + (((tickAnim - 0) / 63) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 63) * (0-(0)));
        }
        else if (tickAnim >= 63 && tickAnim < 225) {
            xx = -27 + (((tickAnim - 63) / 162) * (-27-(-27)));
            yy = 0 + (((tickAnim - 63) / 162) * (0-(0)));
            zz = 0 + (((tickAnim - 63) / 162) * (0-(0)));
        }
        else if (tickAnim >= 225 && tickAnim < 273) {
            xx = -27 + (((tickAnim - 225) / 48) * (0-(-27)));
            yy = 0 + (((tickAnim - 225) / 48) * (0-(0)));
            zz = 0 + (((tickAnim - 225) / 48) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm2, rightArm2.rotateAngleX + (float) Math.toRadians(xx), rightArm2.rotateAngleY + (float) Math.toRadians(yy), rightArm2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 63) {
            xx = 0 + (((tickAnim - 0) / 63) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 63) * (0.7-(0)));
            zz = 0 + (((tickAnim - 0) / 63) * (0-(0)));
        }
        else if (tickAnim >= 63 && tickAnim < 225) {
            xx = 0 + (((tickAnim - 63) / 162) * (0-(0)));
            yy = 0.7 + (((tickAnim - 63) / 162) * (0.7-(0.7)));
            zz = 0 + (((tickAnim - 63) / 162) * (0-(0)));
        }
        else if (tickAnim >= 225 && tickAnim < 273) {
            xx = 0 + (((tickAnim - 225) / 48) * (0-(0)));
            yy = 0.7 + (((tickAnim - 225) / 48) * (0-(0.7)));
            zz = 0 + (((tickAnim - 225) / 48) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightArm2.rotationPointX = this.rightArm2.rotationPointX + (float)(xx);
        this.rightArm2.rotationPointY = this.rightArm2.rotationPointY - (float)(yy);
        this.rightArm2.rotationPointZ = this.rightArm2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 63) {
            xx = 0 + (((tickAnim - 0) / 63) * (18.75-(0)));
            yy = 0 + (((tickAnim - 0) / 63) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 63) * (0-(0)));
        }
        else if (tickAnim >= 63 && tickAnim < 225) {
            xx = 18.75 + (((tickAnim - 63) / 162) * (18.75-(18.75)));
            yy = 0 + (((tickAnim - 63) / 162) * (0-(0)));
            zz = 0 + (((tickAnim - 63) / 162) * (0-(0)));
        }
        else if (tickAnim >= 225 && tickAnim < 273) {
            xx = 18.75 + (((tickAnim - 225) / 48) * (0-(18.75)));
            yy = 0 + (((tickAnim - 225) / 48) * (0-(0)));
            zz = 0 + (((tickAnim - 225) / 48) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightHand, rightHand.rotateAngleX + (float) Math.toRadians(xx), rightHand.rotateAngleY + (float) Math.toRadians(yy), rightHand.rotateAngleZ + (float) Math.toRadians(zz));

        this.rightHand.rotationPointX = this.rightHand.rotationPointX + (float)(0);
        this.rightHand.rotationPointY = this.rightHand.rotationPointY - (float)(0);
        this.rightHand.rotationPointZ = this.rightHand.rotationPointZ + (float)(0);



        if (tickAnim >= 0 && tickAnim < 63) {
            xx = 0 + (((tickAnim - 0) / 63) * (12.5-(0)));
            yy = 0 + (((tickAnim - 0) / 63) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 63) * (0-(0)));
        }
        else if (tickAnim >= 63 && tickAnim < 73) {
            xx = 12.5 + (((tickAnim - 63) / 10) * (13.425+Math.sin((Math.PI/180)*(((double)tickAnim/20)*80+80))*-2-(12.5)));
            yy = 0 + (((tickAnim - 63) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 63) / 10) * (0-(0)));
        }
        else if (tickAnim >= 73 && tickAnim < 178) {
            xx = 13.425+Math.sin((Math.PI/180)*(((double)tickAnim/20)*80+80))*-2 + (((tickAnim - 73) / 105) * (11.175+Math.sin((Math.PI/180)*(((double)tickAnim/20)*80+80))*2-(13.425+Math.sin((Math.PI/180)*(((double)tickAnim/20)*80+80))*-2)));
            yy = 0 + (((tickAnim - 73) / 105) * (0-(0)));
            zz = 0 + (((tickAnim - 73) / 105) * (0-(0)));
        }
        else if (tickAnim >= 178 && tickAnim < 225) {
            xx = 11.175+Math.sin((Math.PI/180)*(((double)tickAnim/20)*80+80))*2 + (((tickAnim - 178) / 47) * (7.25-(11.175+Math.sin((Math.PI/180)*(((double)tickAnim/20)*80+80))*2)));
            yy = 0 + (((tickAnim - 178) / 47) * (0-(0)));
            zz = 0 + (((tickAnim - 178) / 47) * (0-(0)));
        }
        else if (tickAnim >= 225 && tickAnim < 273) {
            xx = 7.25 + (((tickAnim - 225) / 48) * (0-(7.25)));
            yy = 0 + (((tickAnim - 225) / 48) * (0-(0)));
            zz = 0 + (((tickAnim - 225) / 48) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck1, neck1.rotateAngleX + (float) Math.toRadians(xx), neck1.rotateAngleY + (float) Math.toRadians(yy), neck1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 0) / 50) * (26.44-(0)));
            yy = 0 + (((tickAnim - 0) / 50) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 50) * (0-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 63) {
            xx = 26.44 + (((tickAnim - 50) / 13) * (22.25-(26.44)));
            yy = 0 + (((tickAnim - 50) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 50) / 13) * (0-(0)));
        }
        else if (tickAnim >= 63 && tickAnim < 113) {
            xx = 22.25 + (((tickAnim - 63) / 50) * (19.75-(22.25)));
            yy = 0 + (((tickAnim - 63) / 50) * (0-(0)));
            zz = 0 + (((tickAnim - 63) / 50) * (0-(0)));
        }
        else if (tickAnim >= 113 && tickAnim < 166) {
            xx = 19.75 + (((tickAnim - 113) / 53) * (26.44-(19.75)));
            yy = 0 + (((tickAnim - 113) / 53) * (0-(0)));
            zz = 0 + (((tickAnim - 113) / 53) * (0-(0)));
        }
        else if (tickAnim >= 166 && tickAnim < 178) {
            xx = 26.44 + (((tickAnim - 166) / 12) * (22.25-(26.44)));
            yy = 0 + (((tickAnim - 166) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 166) / 12) * (0-(0)));
        }
        else if (tickAnim >= 178 && tickAnim < 225) {
            xx = 22.25 + (((tickAnim - 178) / 47) * (19.75-(22.25)));
            yy = 0 + (((tickAnim - 178) / 47) * (0-(0)));
            zz = 0 + (((tickAnim - 178) / 47) * (0-(0)));
        }
        else if (tickAnim >= 225 && tickAnim < 273) {
            xx = 19.75 + (((tickAnim - 225) / 48) * (0-(19.75)));
            yy = 0 + (((tickAnim - 225) / 48) * (0-(0)));
            zz = 0 + (((tickAnim - 225) / 48) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(xx), neck2.rotateAngleY + (float) Math.toRadians(yy), neck2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 37) {
            xx = 0 + (((tickAnim - 0) / 37) * (30.0128-(0)));
            yy = 0 + (((tickAnim - 0) / 37) * (-1.15674-(0)));
            zz = 0 + (((tickAnim - 0) / 37) * (-1.90648-(0)));
        }
        else if (tickAnim >= 37 && tickAnim < 50) {
            xx = 30.0128 + (((tickAnim - 37) / 13) * (30.14329-(30.0128)));
            yy = -1.15674 + (((tickAnim - 37) / 13) * (-0.55971-(-1.15674)));
            zz = -1.90648 + (((tickAnim - 37) / 13) * (-0.92249-(-1.90648)));
        }
        else if (tickAnim >= 50 && tickAnim < 58) {
            xx = 30.14329 + (((tickAnim - 50) / 8) * (23.80732-(30.14329)));
            yy = -0.55971 + (((tickAnim - 50) / 8) * (-0.22389-(-0.55971)));
            zz = -0.92249 + (((tickAnim - 50) / 8) * (-0.369-(-0.92249)));
        }
        else if (tickAnim >= 58 && tickAnim < 73) {
            xx = 23.80732 + (((tickAnim - 58) / 15) * (15.87403-(23.80732)));
            yy = -0.22389 + (((tickAnim - 58) / 15) * (-0.11497-(-0.22389)));
            zz = -0.369 + (((tickAnim - 58) / 15) * (-0.18948-(-0.369)));
        }
        else if (tickAnim >= 73 && tickAnim < 88) {
            xx = 15.87403 + (((tickAnim - 73) / 15) * (9.5-(15.87403)));
            yy = -0.11497 + (((tickAnim - 73) / 15) * (0-(-0.11497)));
            zz = -0.18948 + (((tickAnim - 73) / 15) * (0-(-0.18948)));
        }
        else if (tickAnim >= 88 && tickAnim < 113) {
            xx = 9.5 + (((tickAnim - 88) / 25) * (7.75-(9.5)));
            yy = 0 + (((tickAnim - 88) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 88) / 25) * (0-(0)));
        }
        else if (tickAnim >= 113 && tickAnim < 153) {
            xx = 7.75 + (((tickAnim - 113) / 40) * (30.0128-(7.75)));
            yy = 0 + (((tickAnim - 113) / 40) * (-1.15674-(0)));
            zz = 0 + (((tickAnim - 113) / 40) * (-1.90648-(0)));
        }
        else if (tickAnim >= 153 && tickAnim < 166) {
            xx = 30.0128 + (((tickAnim - 153) / 13) * (24.64329-(30.0128)));
            yy = -1.15674 + (((tickAnim - 153) / 13) * (-0.55971-(-1.15674)));
            zz = -1.90648 + (((tickAnim - 153) / 13) * (-0.92249-(-1.90648)));
        }
        else if (tickAnim >= 166 && tickAnim < 173) {
            xx = 24.64329 + (((tickAnim - 166) / 7) * (23.80732-(24.64329)));
            yy = -0.55971 + (((tickAnim - 166) / 7) * (-0.22389-(-0.55971)));
            zz = -0.92249 + (((tickAnim - 166) / 7) * (-0.369-(-0.92249)));
        }
        else if (tickAnim >= 173 && tickAnim < 204) {
            xx = 23.80732 + (((tickAnim - 173) / 31) * (7.5-(23.80732)));
            yy = -0.22389 + (((tickAnim - 173) / 31) * (0-(-0.22389)));
            zz = -0.369 + (((tickAnim - 173) / 31) * (0-(-0.369)));
        }
        else if (tickAnim >= 204 && tickAnim < 225) {
            xx = 7.5 + (((tickAnim - 204) / 21) * (7.75-(7.5)));
            yy = 0 + (((tickAnim - 204) / 21) * (0-(0)));
            zz = 0 + (((tickAnim - 204) / 21) * (0-(0)));
        }
        else if (tickAnim >= 225 && tickAnim < 273) {
            xx = 7.75 + (((tickAnim - 225) / 48) * (0-(7.75)));
            yy = 0 + (((tickAnim - 225) / 48) * (0-(0)));
            zz = 0 + (((tickAnim - 225) / 48) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(xx), neck3.rotateAngleY + (float) Math.toRadians(yy), neck3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 0) / 50) * (-7-(0)));
            yy = 0 + (((tickAnim - 0) / 50) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 50) * (0-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 63) {
            xx = -7 + (((tickAnim - 50) / 13) * (1-(-7)));
            yy = 0 + (((tickAnim - 50) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 50) / 13) * (0-(0)));
        }
        else if (tickAnim >= 63 && tickAnim < 113) {
            xx = 1 + (((tickAnim - 63) / 50) * (0-(1)));
            yy = 0 + (((tickAnim - 63) / 50) * (0-(0)));
            zz = 0 + (((tickAnim - 63) / 50) * (0-(0)));
        }
        else if (tickAnim >= 113 && tickAnim < 166) {
            xx = 0 + (((tickAnim - 113) / 53) * (-7-(0)));
            yy = 0 + (((tickAnim - 113) / 53) * (0-(0)));
            zz = 0 + (((tickAnim - 113) / 53) * (0-(0)));
        }
        else if (tickAnim >= 166 && tickAnim < 178) {
            xx = -7 + (((tickAnim - 166) / 12) * (1-(-7)));
            yy = 0 + (((tickAnim - 166) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 166) / 12) * (0-(0)));
        }
        else if (tickAnim >= 178 && tickAnim < 204) {
            xx = 1 + (((tickAnim - 178) / 26) * (4.5121+Math.sin((Math.PI/180)*(((double)tickAnim/20)*100+30))*5-(1)));
            yy = 0 + (((tickAnim - 178) / 26) * (-0.51603-(0)));
            zz = 0 + (((tickAnim - 178) / 26) * (0.31602-(0)));
        }
        else if (tickAnim >= 204 && tickAnim < 225) {
            xx = 4.5121+Math.sin((Math.PI/180)*(((double)tickAnim/20)*100+30))*5 + (((tickAnim - 204) / 21) * (0-(4.5121+Math.sin((Math.PI/180)*(((double)tickAnim/20)*100+30))*5)));
            yy = -0.51603 + (((tickAnim - 204) / 21) * (0-(-0.51603)));
            zz = 0.31602 + (((tickAnim - 204) / 21) * (0-(0.31602)));
        }
        else if (tickAnim >= 225 && tickAnim < 273) {
            xx = 0 + (((tickAnim - 225) / 48) * (0-(0)));
            yy = 0 + (((tickAnim - 225) / 48) * (0-(0)));
            zz = 0 + (((tickAnim - 225) / 48) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck4, neck4.rotateAngleX + (float) Math.toRadians(xx), neck4.rotateAngleY + (float) Math.toRadians(yy), neck4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 43) {
            xx = 0 + (((tickAnim - 0) / 43) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 43) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 43) * (0-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 43) / 7) * (-11.25-(0)));
            yy = 0 + (((tickAnim - 43) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 43) / 7) * (0-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 58) {
            xx = -11.25 + (((tickAnim - 50) / 8) * (0-(-11.25)));
            yy = 0 + (((tickAnim - 50) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 50) / 8) * (0-(0)));
        }
        else if (tickAnim >= 58 && tickAnim < 73) {
            xx = 0 + (((tickAnim - 58) / 15) * (8.75-(0)));
            yy = 0 + (((tickAnim - 58) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 58) / 15) * (0-(0)));
        }
        else if (tickAnim >= 73 && tickAnim < 113) {
            xx = 8.75 + (((tickAnim - 73) / 40) * (24.72264-(8.75)));
            yy = 0 + (((tickAnim - 73) / 40) * (1.04856-(0)));
            zz = 0 + (((tickAnim - 73) / 40) * (-0.3433-(0)));
        }
        else if (tickAnim >= 113 && tickAnim < 159) {
            xx = 24.72264 + (((tickAnim - 113) / 46) * (0-(24.72264)));
            yy = 1.04856 + (((tickAnim - 113) / 46) * (0-(1.04856)));
            zz = -0.3433 + (((tickAnim - 113) / 46) * (0-(-0.3433)));
        }
        else if (tickAnim >= 159 && tickAnim < 166) {
            xx = 0 + (((tickAnim - 159) / 7) * (-11.25-(0)));
            yy = 0 + (((tickAnim - 159) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 159) / 7) * (0-(0)));
        }
        else if (tickAnim >= 166 && tickAnim < 173) {
            xx = -11.25 + (((tickAnim - 166) / 7) * (0-(-11.25)));
            yy = 0 + (((tickAnim - 166) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 166) / 7) * (0-(0)));
        }
        else if (tickAnim >= 173 && tickAnim < 188) {
            xx = 0 + (((tickAnim - 173) / 15) * (8.75-(0)));
            yy = 0 + (((tickAnim - 173) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 173) / 15) * (0-(0)));
        }
        else if (tickAnim >= 188 && tickAnim < 225) {
            xx = 8.75 + (((tickAnim - 188) / 37) * (24.72264-(8.75)));
            yy = 0 + (((tickAnim - 188) / 37) * (1.04856-(0)));
            zz = 0 + (((tickAnim - 188) / 37) * (-0.3433-(0)));
        }
        else if (tickAnim >= 225 && tickAnim < 273) {
            xx = 24.72264 + (((tickAnim - 225) / 48) * (0-(24.72264)));
            yy = 1.04856 + (((tickAnim - 225) / 48) * (0-(1.04856)));
            zz = -0.3433 + (((tickAnim - 225) / 48) * (0-(-0.3433)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 85 && tickAnim < 93) {
            xx = 1 + (((tickAnim - 85) / 8) * (1-(1)));
            yy = 1 + (((tickAnim - 85) / 8) * (0.06-(1)));
            zz = 1 + (((tickAnim - 85) / 8) * (1-(1)));
        }
        else if (tickAnim >= 93 && tickAnim < 102) {
            xx = 1 + (((tickAnim - 93) / 9) * (1-(1)));
            yy = 0.06 + (((tickAnim - 93) / 9) * (1-(0.06)));
            zz = 1 + (((tickAnim - 93) / 9) * (1-(1)));
        }
        else {
            xx = 1;
            yy = 1;
            zz = 1;
        }
        this.eyes.setScale((float)xx, (float)yy, (float)zz);




        if (tickAnim >= 0 && tickAnim < 43) {
            xx = 0 + (((tickAnim - 0) / 43) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 43) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 43) * (0-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 43) / 7) * (21-(0)));
            yy = 0 + (((tickAnim - 43) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 43) / 7) * (0-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 58) {
            xx = 21 + (((tickAnim - 50) / 8) * (0-(21)));
            yy = 0 + (((tickAnim - 50) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 50) / 8) * (0-(0)));
        }
        else if (tickAnim >= 58 && tickAnim < 159) {
            xx = 0 + (((tickAnim - 58) / 101) * (0-(0)));
            yy = 0 + (((tickAnim - 58) / 101) * (0-(0)));
            zz = 0 + (((tickAnim - 58) / 101) * (0-(0)));
        }
        else if (tickAnim >= 159 && tickAnim < 166) {
            xx = 0 + (((tickAnim - 159) / 7) * (21-(0)));
            yy = 0 + (((tickAnim - 159) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 159) / 7) * (0-(0)));
        }
        else if (tickAnim >= 166 && tickAnim < 173) {
            xx = 21 + (((tickAnim - 166) / 7) * (0-(21)));
            yy = 0 + (((tickAnim - 166) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 166) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(xx), jaw.rotateAngleY + (float) Math.toRadians(yy), jaw.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 58) {
            xx = 0 + (((tickAnim - 0) / 58) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 58) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 58) * (0-(0)));
        }
        else if (tickAnim >= 58 && tickAnim < 73) {
            xx = 0 + (((tickAnim - 58) / 15) * (-12.5-(0)));
            yy = 0 + (((tickAnim - 58) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 58) / 15) * (0-(0)));
        }
        else if (tickAnim >= 73 && tickAnim < 159) {
            xx = -12.5 + (((tickAnim - 73) / 86) * (2-(-12.5)));
            yy = 0 + (((tickAnim - 73) / 86) * (0-(0)));
            zz = 0 + (((tickAnim - 73) / 86) * (0-(0)));
        }
        else if (tickAnim >= 159 && tickAnim < 166) {
            xx = 2 + (((tickAnim - 159) / 7) * (-9.75-(2)));
            yy = 0 + (((tickAnim - 159) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 159) / 7) * (0-(0)));
        }
        else if (tickAnim >= 166 && tickAnim < 173) {
            xx = -9.75 + (((tickAnim - 166) / 7) * (0-(-9.75)));
            yy = 0 + (((tickAnim - 166) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 166) / 7) * (0-(0)));
        }
        else if (tickAnim >= 173 && tickAnim < 188) {
            xx = 0 + (((tickAnim - 173) / 15) * (-12.5-(0)));
            yy = 0 + (((tickAnim - 173) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 173) / 15) * (0-(0)));
        }
        else if (tickAnim >= 188 && tickAnim < 273) {
            xx = -12.5 + (((tickAnim - 188) / 85) * (0-(-12.5)));
            yy = 0 + (((tickAnim - 188) / 85) * (0-(0)));
            zz = 0 + (((tickAnim - 188) / 85) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(throat, throat.rotateAngleX + (float) Math.toRadians(xx), throat.rotateAngleY + (float) Math.toRadians(yy), throat.rotateAngleZ + (float) Math.toRadians(zz));



        this.setRotateAngle(tail1, tail1.rotateAngleX + (float) Math.toRadians(0), tail1.rotateAngleY + (float) Math.toRadians(0), tail1.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*53/1.006))), tail2.rotateAngleY + (float) Math.toRadians(0), tail2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*53/1.006-50))), tail3.rotateAngleY + (float) Math.toRadians(0), tail3.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*53/1.006-100))), tail4.rotateAngleY + (float) Math.toRadians(0), tail4.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tail5, tail5.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*53/1.006-120))), tail5.rotateAngleY + (float) Math.toRadians(0), tail5.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tail6, tail6.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*53/1.006-150))), tail6.rotateAngleY + (float) Math.toRadians(0), tail6.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tail7, tail7.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*53/1.006-200))), tail7.rotateAngleY + (float) Math.toRadians(0), tail7.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tail8, tail8.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*53/1.006-250))*-4), tail8.rotateAngleY + (float) Math.toRadians(0), tail8.rotateAngleZ + (float) Math.toRadians(0));


    }
    public void animEat(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraDemandasaurus entity = (EntityPrehistoricFloraDemandasaurus) entitylivingbaseIn;
        int animCycle = 20;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (21.25-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 21.25 + (((tickAnim - 10) / 10) * (0-(21.25)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck1, neck1.rotateAngleX + (float) Math.toRadians(xx), neck1.rotateAngleY + (float) Math.toRadians(yy), neck1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (28.5-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 28.5 + (((tickAnim - 10) / 10) * (0-(28.5)));
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
            xx = 0 + (((tickAnim - 0) / 5) * (24.13-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 24.13 + (((tickAnim - 5) / 5) * (26.75-(24.13)));
            yy = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 5) * (0-(0)));
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
        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(xx), neck3.rotateAngleY + (float) Math.toRadians(yy), neck3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (8.25-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 20) {
            xx = 8.25 + (((tickAnim - 5) / 15) * (0-(8.25)));
            yy = 0 + (((tickAnim - 5) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck4, neck4.rotateAngleX + (float) Math.toRadians(xx), neck4.rotateAngleY + (float) Math.toRadians(yy), neck4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (-0.5-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = -0.5 + (((tickAnim - 5) / 3) * (-24.67-(-0.5)));
            yy = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 3) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = -24.67 + (((tickAnim - 8) / 2) * (-22.5-(-24.67)));
            yy = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 2) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = -22.5 + (((tickAnim - 10) / 10) * (0-(-22.5)));
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
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 5) / 3) * (14.5-(0)));
            yy = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 3) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 14.5 + (((tickAnim - 8) / 2) * (0-(14.5)));
            yy = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(xx), jaw.rotateAngleY + (float) Math.toRadians(yy), jaw.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (19.5-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 19.5 + (((tickAnim - 10) / 10) * (0-(19.5)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(throat, throat.rotateAngleX + (float) Math.toRadians(xx), throat.rotateAngleY + (float) Math.toRadians(yy), throat.rotateAngleZ + (float) Math.toRadians(zz));

    }
    public void animNest(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraDemandasaurus entity = (EntityPrehistoricFloraDemandasaurus) entitylivingbaseIn;
        int animCycle = 50;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (24.25-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 35) {
            xx = 24.25 + (((tickAnim - 20) / 15) * (-13.75-(24.25)));
            yy = 0 + (((tickAnim - 20) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 15) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = -13.75 + (((tickAnim - 35) / 15) * (0-(-13.75)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg1, leftLeg1.rotateAngleX + (float) Math.toRadians(xx), leftLeg1.rotateAngleY + (float) Math.toRadians(yy), leftLeg1.rotateAngleZ + (float) Math.toRadians(zz));




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
            xx = 0 + (((tickAnim - 28) / 7) * (10.5-(0)));
            yy = 0 + (((tickAnim - 28) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 7) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 10.5 + (((tickAnim - 35) / 15) * (0-(10.5)));
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
            yy = 2.375 + (((tickAnim - 28) / 7) * (-0.825-(2.375)));
            zz = 0 + (((tickAnim - 28) / 7) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            yy = -0.825 + (((tickAnim - 35) / 15) * (0-(-0.825)));
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
            xx = 31 + (((tickAnim - 20) / 15) * (3.5-(31)));
            yy = 0 + (((tickAnim - 20) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 15) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 3.5 + (((tickAnim - 35) / 15) * (0-(3.5)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftFoot, leftFoot.rotateAngleX + (float) Math.toRadians(xx), leftFoot.rotateAngleY + (float) Math.toRadians(yy), leftFoot.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0.6-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (-0.4-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 20) / 15) * (0-(0)));
            yy = 0.6 + (((tickAnim - 20) / 15) * (-0.575-(0.6)));
            zz = -0.4 + (((tickAnim - 20) / 15) * (0-(-0.4)));
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
        this.leftFoot.rotationPointX = this.leftFoot.rotationPointX + (float)(xx);
        this.leftFoot.rotationPointY = this.leftFoot.rotationPointY - (float)(yy);
        this.leftFoot.rotationPointZ = this.leftFoot.rotationPointZ + (float)(zz);



        this.setRotateAngle(leftToes, leftToes.rotateAngleX + (float) Math.toRadians(0), leftToes.rotateAngleY + (float) Math.toRadians(0), leftToes.rotateAngleZ + (float) Math.toRadians(0));
          }
    public void animLay(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraDemandasaurus entity = (EntityPrehistoricFloraDemandasaurus) entitylivingbaseIn;
        int animCycle = 50;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (-17.57292-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (-11.06041-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0.84393-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 33) {
            xx = -17.57292 + (((tickAnim - 18) / 15) * (-17.57292-(-17.57292)));
            yy = -11.06041 + (((tickAnim - 18) / 15) * (-11.06041-(-11.06041)));
            zz = 0.84393 + (((tickAnim - 18) / 15) * (0.84393-(0.84393)));
        }
        else if (tickAnim >= 33 && tickAnim < 50) {
            xx = -17.57292 + (((tickAnim - 33) / 17) * (0-(-17.57292)));
            yy = -11.06041 + (((tickAnim - 33) / 17) * (0-(-11.06041)));
            zz = 0.84393 + (((tickAnim - 33) / 17) * (0-(0.84393)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg1, leftLeg1.rotateAngleX + (float) Math.toRadians(xx), leftLeg1.rotateAngleY + (float) Math.toRadians(yy), leftLeg1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (53.25-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 33) {
            xx = 53.25 + (((tickAnim - 18) / 15) * (53.25-(53.25)));
            yy = 0 + (((tickAnim - 18) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 15) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 50) {
            xx = 53.25 + (((tickAnim - 33) / 17) * (0-(53.25)));
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
            yy = 0 + (((tickAnim - 0) / 18) * (2-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (-0.525-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 18) / 15) * (0-(0)));
            yy = 2 + (((tickAnim - 18) / 15) * (2-(2)));
            zz = -0.525 + (((tickAnim - 18) / 15) * (-0.525-(-0.525)));
        }
        else if (tickAnim >= 33 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 33) / 17) * (0-(0)));
            yy = 2 + (((tickAnim - 33) / 17) * (0-(2)));
            zz = -0.525 + (((tickAnim - 33) / 17) * (0-(-0.525)));
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
            xx = 0 + (((tickAnim - 0) / 18) * (-23.5-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 33) {
            xx = -23.5 + (((tickAnim - 18) / 15) * (-23.5-(-23.5)));
            yy = 0 + (((tickAnim - 18) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 15) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 50) {
            xx = -23.5 + (((tickAnim - 33) / 17) * (0-(-23.5)));
            yy = 0 + (((tickAnim - 33) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 17) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftFoot, leftFoot.rotateAngleX + (float) Math.toRadians(xx), leftFoot.rotateAngleY + (float) Math.toRadians(yy), leftFoot.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0.8-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0.325-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 18) / 15) * (0-(0)));
            yy = 0.8 + (((tickAnim - 18) / 15) * (0.8-(0.8)));
            zz = 0.325 + (((tickAnim - 18) / 15) * (0.325-(0.325)));
        }
        else if (tickAnim >= 33 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 33) / 17) * (0-(0)));
            yy = 0.8 + (((tickAnim - 33) / 17) * (0-(0.8)));
            zz = 0.325 + (((tickAnim - 33) / 17) * (0-(0.325)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftFoot.rotationPointX = this.leftFoot.rotationPointX + (float)(xx);
        this.leftFoot.rotationPointY = this.leftFoot.rotationPointY - (float)(yy);
        this.leftFoot.rotationPointZ = this.leftFoot.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (-17.57292-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (11.06041-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (-0.84393-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 33) {
            xx = -17.57292 + (((tickAnim - 18) / 15) * (-17.57292-(-17.57292)));
            yy = 11.06041 + (((tickAnim - 18) / 15) * (11.06041-(11.06041)));
            zz = -0.84393 + (((tickAnim - 18) / 15) * (-0.84393-(-0.84393)));
        }
        else if (tickAnim >= 33 && tickAnim < 50) {
            xx = -17.57292 + (((tickAnim - 33) / 17) * (0-(-17.57292)));
            yy = 11.06041 + (((tickAnim - 33) / 17) * (0-(11.06041)));
            zz = -0.84393 + (((tickAnim - 33) / 17) * (0-(-0.84393)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg1, rightLeg1.rotateAngleX + (float) Math.toRadians(xx), rightLeg1.rotateAngleY + (float) Math.toRadians(yy), rightLeg1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (53.25-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 33) {
            xx = 53.25 + (((tickAnim - 18) / 15) * (53.25-(53.25)));
            yy = 0 + (((tickAnim - 18) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 15) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 50) {
            xx = 53.25 + (((tickAnim - 33) / 17) * (0-(53.25)));
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
            yy = 0 + (((tickAnim - 0) / 18) * (2-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (-0.525-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 18) / 15) * (0-(0)));
            yy = 2 + (((tickAnim - 18) / 15) * (2-(2)));
            zz = -0.525 + (((tickAnim - 18) / 15) * (-0.525-(-0.525)));
        }
        else if (tickAnim >= 33 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 33) / 17) * (0-(0)));
            yy = 2 + (((tickAnim - 33) / 17) * (0-(2)));
            zz = -0.525 + (((tickAnim - 33) / 17) * (0-(-0.525)));
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
            xx = 0 + (((tickAnim - 0) / 18) * (-23.5-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 33) {
            xx = -23.5 + (((tickAnim - 18) / 15) * (-23.5-(-23.5)));
            yy = 0 + (((tickAnim - 18) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 15) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 50) {
            xx = -23.5 + (((tickAnim - 33) / 17) * (0-(-23.5)));
            yy = 0 + (((tickAnim - 33) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 17) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightFoot, rightFoot.rotateAngleX + (float) Math.toRadians(xx), rightFoot.rotateAngleY + (float) Math.toRadians(yy), rightFoot.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0.8-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0.325-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 18) / 15) * (0-(0)));
            yy = 0.8 + (((tickAnim - 18) / 15) * (0.8-(0.8)));
            zz = 0.325 + (((tickAnim - 18) / 15) * (0.325-(0.325)));
        }
        else if (tickAnim >= 33 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 33) / 17) * (0-(0)));
            yy = 0.8 + (((tickAnim - 33) / 17) * (0-(0.8)));
            zz = 0.325 + (((tickAnim - 33) / 17) * (0-(0.325)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightFoot.rotationPointX = this.rightFoot.rotationPointX + (float)(xx);
        this.rightFoot.rotationPointY = this.rightFoot.rotationPointY - (float)(yy);
        this.rightFoot.rotationPointZ = this.rightFoot.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (-10.5-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 33) {
            xx = -10.5 + (((tickAnim - 18) / 15) * (-10.5-(-10.5)));
            yy = 0 + (((tickAnim - 18) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 15) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 50) {
            xx = -10.5 + (((tickAnim - 33) / 17) * (0-(-10.5)));
            yy = 0 + (((tickAnim - 33) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 17) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(hips, hips.rotateAngleX + (float) Math.toRadians(xx), hips.rotateAngleY + (float) Math.toRadians(yy), hips.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (-8.05-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (1.925-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 18) / 15) * (0-(0)));
            yy = -8.05 + (((tickAnim - 18) / 15) * (-8.05-(-8.05)));
            zz = 1.925 + (((tickAnim - 18) / 15) * (1.925-(1.925)));
        }
        else if (tickAnim >= 33 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 33) / 17) * (0-(0)));
            yy = -8.05 + (((tickAnim - 33) / 17) * (0-(-8.05)));
            zz = 1.925 + (((tickAnim - 33) / 17) * (0-(1.925)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.hips.rotationPointX = this.hips.rotationPointX + (float)(xx);
        this.hips.rotationPointY = this.hips.rotationPointY - (float)(yy);
        this.hips.rotationPointZ = this.hips.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (3.25-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 33) {
            xx = 3.25 + (((tickAnim - 18) / 15) * (3.25-(3.25)));
            yy = 0 + (((tickAnim - 18) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 15) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 50) {
            xx = 3.25 + (((tickAnim - 33) / 17) * (0-(3.25)));
            yy = 0 + (((tickAnim - 33) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 17) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail1, tail1.rotateAngleX + (float) Math.toRadians(xx), tail1.rotateAngleY + (float) Math.toRadians(yy), tail1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (-7.75-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 33) {
            xx = -7.75 + (((tickAnim - 18) / 15) * (-7.75-(-7.75)));
            yy = 0 + (((tickAnim - 18) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 15) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 50) {
            xx = -7.75 + (((tickAnim - 33) / 17) * (0-(-7.75)));
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
            xx = 0 + (((tickAnim - 0) / 18) * (-4-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 33) {
            xx = -4 + (((tickAnim - 18) / 15) * (-4-(-4)));
            yy = 0 + (((tickAnim - 18) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 15) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 50) {
            xx = -4 + (((tickAnim - 33) / 17) * (0-(-4)));
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
            xx = 0 + (((tickAnim - 0) / 18) * (-7.75-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 33) {
            xx = -7.75 + (((tickAnim - 18) / 15) * (-7.75-(-7.75)));
            yy = 0 + (((tickAnim - 18) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 15) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 50) {
            xx = -7.75 + (((tickAnim - 33) / 17) * (0-(-7.75)));
            yy = 0 + (((tickAnim - 33) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 17) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(xx), tail4.rotateAngleY + (float) Math.toRadians(yy), tail4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (11.25-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 33) {
            xx = 11.25 + (((tickAnim - 18) / 15) * (11.25-(11.25)));
            yy = 0 + (((tickAnim - 18) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 15) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 50) {
            xx = 11.25 + (((tickAnim - 33) / 17) * (0-(11.25)));
            yy = 0 + (((tickAnim - 33) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 17) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail5, tail5.rotateAngleX + (float) Math.toRadians(xx), tail5.rotateAngleY + (float) Math.toRadians(yy), tail5.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (15-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 33) {
            xx = 15 + (((tickAnim - 18) / 15) * (15-(15)));
            yy = 0 + (((tickAnim - 18) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 15) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 35) {
            xx = 15 + (((tickAnim - 33) / 2) * (1.11-(15)));
            yy = 0 + (((tickAnim - 33) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 2) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 1.11 + (((tickAnim - 35) / 15) * (0-(1.11)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail6, tail6.rotateAngleX + (float) Math.toRadians(xx), tail6.rotateAngleY + (float) Math.toRadians(yy), tail6.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (15.5-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 21) {
            xx = 15.5 + (((tickAnim - 18) / 3) * (9.75-(15.5)));
            yy = 0 + (((tickAnim - 18) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 3) * (0-(0)));
        }
        else if (tickAnim >= 21 && tickAnim < 33) {
            xx = 9.75 + (((tickAnim - 21) / 12) * (9.75-(9.75)));
            yy = 0 + (((tickAnim - 21) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 21) / 12) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 35) {
            xx = 9.75 + (((tickAnim - 33) / 2) * (18.86-(9.75)));
            yy = 0 + (((tickAnim - 33) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 2) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 38) {
            xx = 18.86 + (((tickAnim - 35) / 3) * (2.09-(18.86)));
            yy = 0 + (((tickAnim - 35) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 3) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 50) {
            xx = 2.09 + (((tickAnim - 38) / 12) * (0-(2.09)));
            yy = 0 + (((tickAnim - 38) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 38) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail7, tail7.rotateAngleX + (float) Math.toRadians(xx), tail7.rotateAngleY + (float) Math.toRadians(yy), tail7.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (15.25-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 21) {
            xx = 15.25 + (((tickAnim - 18) / 3) * (17-(15.25)));
            yy = 0 + (((tickAnim - 18) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 3) * (0-(0)));
        }
        else if (tickAnim >= 21 && tickAnim < 23) {
            xx = 17 + (((tickAnim - 21) / 2) * (10.21-(17)));
            yy = 0 + (((tickAnim - 21) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 21) / 2) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 33) {
            xx = 10.21 + (((tickAnim - 23) / 10) * (11-(10.21)));
            yy = 0 + (((tickAnim - 23) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 10) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 35) {
            xx = 11 + (((tickAnim - 33) / 2) * (13.93-(11)));
            yy = 0 + (((tickAnim - 33) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 2) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 38) {
            xx = 13.93 + (((tickAnim - 35) / 3) * (22.71-(13.93)));
            yy = 0 + (((tickAnim - 35) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 3) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 42) {
            xx = 22.71 + (((tickAnim - 38) / 4) * (-0.01-(22.71)));
            yy = 0 + (((tickAnim - 38) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 38) / 4) * (0-(0)));
        }
        else if (tickAnim >= 42 && tickAnim < 46) {
            xx = -0.01 + (((tickAnim - 42) / 4) * (-8.26-(-0.01)));
            yy = 0 + (((tickAnim - 42) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 42) / 4) * (0-(0)));
        }
        else if (tickAnim >= 46 && tickAnim < 50) {
            xx = -8.26 + (((tickAnim - 46) / 4) * (0-(-8.26)));
            yy = 0 + (((tickAnim - 46) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 46) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail8, tail8.rotateAngleX + (float) Math.toRadians(xx), tail8.rotateAngleY + (float) Math.toRadians(yy), tail8.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (-5.25-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 33) {
            xx = -5.25 + (((tickAnim - 18) / 15) * (-5.25-(-5.25)));
            yy = 0 + (((tickAnim - 18) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 15) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 50) {
            xx = -5.25 + (((tickAnim - 33) / 17) * (0-(-5.25)));
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
            xx = 0 + (((tickAnim - 0) / 18) * (7.25-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 33) {
            xx = 7.25 + (((tickAnim - 18) / 15) * (7.25-(7.25)));
            yy = 0 + (((tickAnim - 18) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 15) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 50) {
            xx = 7.25 + (((tickAnim - 33) / 17) * (0-(7.25)));
            yy = 0 + (((tickAnim - 33) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 17) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(xx), chest.rotateAngleY + (float) Math.toRadians(yy), chest.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (12-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 33) {
            xx = 12 + (((tickAnim - 18) / 15) * (12-(12)));
            yy = 0 + (((tickAnim - 18) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 15) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 50) {
            xx = 12 + (((tickAnim - 33) / 17) * (0-(12)));
            yy = 0 + (((tickAnim - 33) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 17) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm1, leftArm1.rotateAngleX + (float) Math.toRadians(xx), leftArm1.rotateAngleY + (float) Math.toRadians(yy), leftArm1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (-23.75-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 33) {
            xx = -23.75 + (((tickAnim - 18) / 15) * (-23.75-(-23.75)));
            yy = 0 + (((tickAnim - 18) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 15) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 50) {
            xx = -23.75 + (((tickAnim - 33) / 17) * (0-(-23.75)));
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
            yy = 0 + (((tickAnim - 0) / 18) * (1.1-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0.3-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 18) / 15) * (0-(0)));
            yy = 1.1 + (((tickAnim - 18) / 15) * (1.1-(1.1)));
            zz = 0.3 + (((tickAnim - 18) / 15) * (0.3-(0.3)));
        }
        else if (tickAnim >= 33 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 33) / 17) * (0-(0)));
            yy = 1.1 + (((tickAnim - 33) / 17) * (0-(1.1)));
            zz = 0.3 + (((tickAnim - 33) / 17) * (0-(0.3)));
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
            xx = 0 + (((tickAnim - 0) / 18) * (17.5-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 33) {
            xx = 17.5 + (((tickAnim - 18) / 15) * (17.5-(17.5)));
            yy = 0 + (((tickAnim - 18) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 15) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 50) {
            xx = 17.5 + (((tickAnim - 33) / 17) * (0-(17.5)));
            yy = 0 + (((tickAnim - 33) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 17) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftHand, leftHand.rotateAngleX + (float) Math.toRadians(xx), leftHand.rotateAngleY + (float) Math.toRadians(yy), leftHand.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (12-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 33) {
            xx = 12 + (((tickAnim - 18) / 15) * (12-(12)));
            yy = 0 + (((tickAnim - 18) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 15) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 50) {
            xx = 12 + (((tickAnim - 33) / 17) * (0-(12)));
            yy = 0 + (((tickAnim - 33) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 17) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm1, rightArm1.rotateAngleX + (float) Math.toRadians(xx), rightArm1.rotateAngleY + (float) Math.toRadians(yy), rightArm1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (-23.75-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 33) {
            xx = -23.75 + (((tickAnim - 18) / 15) * (-23.75-(-23.75)));
            yy = 0 + (((tickAnim - 18) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 15) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 50) {
            xx = -23.75 + (((tickAnim - 33) / 17) * (0-(-23.75)));
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
            yy = 0 + (((tickAnim - 0) / 18) * (1.1-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0.3-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 18) / 15) * (0-(0)));
            yy = 1.1 + (((tickAnim - 18) / 15) * (1.1-(1.1)));
            zz = 0.3 + (((tickAnim - 18) / 15) * (0.3-(0.3)));
        }
        else if (tickAnim >= 33 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 33) / 17) * (0-(0)));
            yy = 1.1 + (((tickAnim - 33) / 17) * (0-(1.1)));
            zz = 0.3 + (((tickAnim - 33) / 17) * (0-(0.3)));
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
            xx = 0 + (((tickAnim - 0) / 18) * (17.5-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 33) {
            xx = 17.5 + (((tickAnim - 18) / 15) * (17.5-(17.5)));
            yy = 0 + (((tickAnim - 18) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 15) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 50) {
            xx = 17.5 + (((tickAnim - 33) / 17) * (0-(17.5)));
            yy = 0 + (((tickAnim - 33) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 17) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightHand, rightHand.rotateAngleX + (float) Math.toRadians(xx), rightHand.rotateAngleY + (float) Math.toRadians(yy), rightHand.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (-13.75-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 33) {
            xx = -13.75 + (((tickAnim - 18) / 15) * (-13.75-(-13.75)));
            yy = 0 + (((tickAnim - 18) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 15) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 50) {
            xx = -13.75 + (((tickAnim - 33) / 17) * (0-(-13.75)));
            yy = 0 + (((tickAnim - 33) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 17) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck1, neck1.rotateAngleX + (float) Math.toRadians(xx), neck1.rotateAngleY + (float) Math.toRadians(yy), neck1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (15.75-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 33) {
            xx = 15.75 + (((tickAnim - 18) / 15) * (15.75-(15.75)));
            yy = 0 + (((tickAnim - 18) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 15) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 50) {
            xx = 15.75 + (((tickAnim - 33) / 17) * (0-(15.75)));
            yy = 0 + (((tickAnim - 33) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 17) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(xx), neck2.rotateAngleY + (float) Math.toRadians(yy), neck2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (7-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 33) {
            xx = 7 + (((tickAnim - 18) / 15) * (7-(7)));
            yy = 0 + (((tickAnim - 18) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 15) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 50) {
            xx = 7 + (((tickAnim - 33) / 17) * (0-(7)));
            yy = 0 + (((tickAnim - 33) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 17) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(xx), neck3.rotateAngleY + (float) Math.toRadians(yy), neck3.rotateAngleZ + (float) Math.toRadians(zz));
    }
    public void animRoar(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraDemandasaurus entity = (EntityPrehistoricFloraDemandasaurus) entitylivingbaseIn;
        int animCycle = 30;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (-1.575+Math.sin((Math.PI/180)*(((double)tickAnim/20)*100+50))*2-(0)));
            yy = -3.125+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-50))*-4.075 + (((tickAnim - 0) / 15) * (-2.8122+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*0.5-(-3.125+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-50))*-4.075)));
            zz = 0 + (((tickAnim - 0) / 15) * (-0.39852-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 30) {
            xx = -1.575+Math.sin((Math.PI/180)*(((double)tickAnim/20)*100+50))*2 + (((tickAnim - 15) / 15) * (0-(-1.575+Math.sin((Math.PI/180)*(((double)tickAnim/20)*100+50))*2)));
            yy = -2.8122+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*0.5 + (((tickAnim - 15) / 15) * (0-(-2.8122+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*0.5)));
            zz = -0.39852 + (((tickAnim - 15) / 15) * (0-(-0.39852)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck1, neck1.rotateAngleX + (float) Math.toRadians(xx), neck1.rotateAngleY + (float) Math.toRadians(yy), neck1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (-2.1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*100+80))*5-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (-2.0122+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*2-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 30) {
            xx = -2.1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*100+80))*5 + (((tickAnim - 15) / 15) * (0-(-2.1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*100+80))*5)));
            yy = -2.0122+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*2 + (((tickAnim - 15) / 15) * (0-(-2.0122+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*2)));
            zz = 0 + (((tickAnim - 15) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(xx), neck2.rotateAngleY + (float) Math.toRadians(yy), neck2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (0.525+Math.sin((Math.PI/180)*(((double)tickAnim/20)*100+120))*2-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (-0.4122+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-100))*2-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (-4.24728-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 30) {
            xx = 0.525+Math.sin((Math.PI/180)*(((double)tickAnim/20)*100+120))*2 + (((tickAnim - 15) / 15) * (0-(0.525+Math.sin((Math.PI/180)*(((double)tickAnim/20)*100+120))*2)));
            yy = -0.4122+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-100))*2 + (((tickAnim - 15) / 15) * (0-(-0.4122+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-100))*2)));
            zz = -4.24728 + (((tickAnim - 15) / 15) * (0-(-4.24728)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(xx), neck3.rotateAngleY + (float) Math.toRadians(yy), neck3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (5.8+Math.sin((Math.PI/180)*(((double)tickAnim/20)*100+160))*7-(0)));
            yy = -3.1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-50))*-4.075 + (((tickAnim - 0) / 15) * (-0.7372+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-150))*2-(-3.1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-50))*-4.075)));
            zz = 0 + (((tickAnim - 0) / 15) * (-2.4586-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 30) {
            xx = 5.8+Math.sin((Math.PI/180)*(((double)tickAnim/20)*100+160))*7 + (((tickAnim - 15) / 15) * (0-(5.8+Math.sin((Math.PI/180)*(((double)tickAnim/20)*100+160))*7)));
            yy = -0.7372+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-150))*2 + (((tickAnim - 15) / 15) * (0-(-0.7372+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-150))*2)));
            zz = -2.4586 + (((tickAnim - 15) / 15) * (0-(-2.4586)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck4, neck4.rotateAngleX + (float) Math.toRadians(xx), neck4.rotateAngleY + (float) Math.toRadians(yy), neck4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (-2.1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*100+80))*5-(0)));
            yy = -3.1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-50))*-4.075 + (((tickAnim - 0) / 15) * (-9.9622+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*10-(-3.1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-50))*-4.075)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 30) {
            xx = -2.1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*100+80))*5 + (((tickAnim - 15) / 15) * (0-(-2.1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*100+80))*5)));
            yy = -9.9622+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*10 + (((tickAnim - 15) / 15) * (0-(-9.9622+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*10)));
            zz = 0 + (((tickAnim - 15) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 7) / 8) * (16.9-(0)));
            yy = 0 + (((tickAnim - 7) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 8) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = 16.9 + (((tickAnim - 15) / 5) * (29.77-(16.9)));
            yy = 0 + (((tickAnim - 15) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 5) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 29.77 + (((tickAnim - 20) / 10) * (0-(29.77)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(xx), jaw.rotateAngleY + (float) Math.toRadians(yy), jaw.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 8) / 7) * (-11.45-(0)));
            yy = 0 + (((tickAnim - 8) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 7) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = -11.45 + (((tickAnim - 15) / 5) * (-22.9-(-11.45)));
            yy = 0 + (((tickAnim - 15) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 5) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = -22.9 + (((tickAnim - 20) / 10) * (0-(-22.9)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(throat, throat.rotateAngleX + (float) Math.toRadians(xx), throat.rotateAngleY + (float) Math.toRadians(yy), throat.rotateAngleZ + (float) Math.toRadians(zz));
  
    }
    public void animWalking(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraDemandasaurus entity = (EntityPrehistoricFloraDemandasaurus) entitylivingbaseIn;
        int animCycle = 40;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;

        if (tickAnim >= 0 && tickAnim < 20) {
            xx = -4.5 + (((tickAnim - 0) / 20) * (25.25-(-4.5)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 34) {
            xx = 25.25 + (((tickAnim - 20) / 14) * (-12.75-(25.25)));
            yy = 0 + (((tickAnim - 20) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 14) * (0-(0)));
        }
        else if (tickAnim >= 34 && tickAnim < 40) {
            xx = -12.75 + (((tickAnim - 34) / 6) * (-4.5-(-12.75)));
            yy = 0 + (((tickAnim - 34) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 34) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg1, leftLeg1.rotateAngleX + (float) Math.toRadians(xx), leftLeg1.rotateAngleY + (float) Math.toRadians(yy), leftLeg1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 3.25 + (((tickAnim - 0) / 20) * (0-(3.25)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 26) {
            xx = 0 + (((tickAnim - 20) / 6) * (2.04-(0)));
            yy = 0 + (((tickAnim - 20) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 6) * (0-(0)));
        }
        else if (tickAnim >= 26 && tickAnim < 32) {
            xx = 2.04 + (((tickAnim - 26) / 6) * (-1.9-(2.04)));
            yy = 0 + (((tickAnim - 26) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 26) / 6) * (0-(0)));
        }
        else if (tickAnim >= 32 && tickAnim < 34) {
            xx = -1.9 + (((tickAnim - 32) / 2) * (7-(-1.9)));
            yy = 0 + (((tickAnim - 32) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 32) / 2) * (0-(0)));
        }
        else if (tickAnim >= 34 && tickAnim < 40) {
            xx = 7 + (((tickAnim - 34) / 6) * (3.25-(7)));
            yy = 0 + (((tickAnim - 34) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 34) / 6) * (0-(0)));
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
        else if (tickAnim >= 20 && tickAnim < 26) {
            xx = 0 + (((tickAnim - 20) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 20) / 6) * (2.72-(0)));
            zz = 0 + (((tickAnim - 20) / 6) * (-0.25-(0)));
        }
        else if (tickAnim >= 26 && tickAnim < 34) {
            xx = 0 + (((tickAnim - 26) / 8) * (0-(0)));
            yy = 2.72 + (((tickAnim - 26) / 8) * (-0.675-(2.72)));
            zz = -0.25 + (((tickAnim - 26) / 8) * (0-(-0.25)));
        }
        else if (tickAnim >= 34 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 34) / 6) * (0-(0)));
            yy = -0.675 + (((tickAnim - 34) / 6) * (0-(-0.675)));
            zz = 0 + (((tickAnim - 34) / 6) * (0-(0)));
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
            xx = 0.5 + (((tickAnim - 0) / 10) * (-10-(0.5)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = -10 + (((tickAnim - 10) / 10) * (19.75-(-10)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 26) {
            xx = 19.75 + (((tickAnim - 20) / 6) * (12-(19.75)));
            yy = 0 + (((tickAnim - 20) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 6) * (0-(0)));
        }
        else if (tickAnim >= 26 && tickAnim < 32) {
            xx = 12 + (((tickAnim - 26) / 6) * (0-(12)));
            yy = 0 + (((tickAnim - 26) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 26) / 6) * (0-(0)));
        }
        else if (tickAnim >= 32 && tickAnim < 34) {
            xx = 0 + (((tickAnim - 32) / 2) * (6.5-(0)));
            yy = 0 + (((tickAnim - 32) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 32) / 2) * (0-(0)));
        }
        else if (tickAnim >= 34 && tickAnim < 40) {
            xx = 6.5 + (((tickAnim - 34) / 6) * (0.5-(6.5)));
            yy = 0 + (((tickAnim - 34) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 34) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftFoot, leftFoot.rotateAngleX + (float) Math.toRadians(xx), leftFoot.rotateAngleY + (float) Math.toRadians(yy), leftFoot.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            yy = -0.525 + (((tickAnim - 0) / 20) * (0-(-0.525)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 26) {
            xx = 0 + (((tickAnim - 20) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 20) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 6) * (0-(0)));
        }
        else if (tickAnim >= 26 && tickAnim < 32) {
            xx = 0 + (((tickAnim - 26) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 26) / 6) * (-0.45-(0)));
            zz = 0 + (((tickAnim - 26) / 6) * (0-(0)));
        }
        else if (tickAnim >= 32 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 32) / 8) * (0-(0)));
            yy = -0.45 + (((tickAnim - 32) / 8) * (-0.525-(-0.45)));
            zz = 0 + (((tickAnim - 32) / 8) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftFoot.rotationPointX = this.leftFoot.rotationPointX + (float)(xx);
        this.leftFoot.rotationPointY = this.leftFoot.rotationPointY - (float)(yy);
        this.leftFoot.rotationPointZ = this.leftFoot.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 14) {
            xx = 25.25 + (((tickAnim - 0) / 14) * (-12.75-(25.25)));
            yy = 0 + (((tickAnim - 0) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 14) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 40) {
            xx = -12.75 + (((tickAnim - 14) / 26) * (25.25-(-12.75)));
            yy = 0 + (((tickAnim - 14) / 26) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 26) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg1, rightLeg1.rotateAngleX + (float) Math.toRadians(xx), rightLeg1.rotateAngleY + (float) Math.toRadians(yy), rightLeg1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 19.75 + (((tickAnim - 0) / 6) * (12-(19.75)));
            yy = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 12) {
            xx = 12 + (((tickAnim - 6) / 6) * (0-(12)));
            yy = 0 + (((tickAnim - 6) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 6) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 12) / 2) * (6.5-(0)));
            yy = 0 + (((tickAnim - 12) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 2) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 26) {
            xx = 6.5 + (((tickAnim - 14) / 12) * (-7.25-(6.5)));
            yy = 0 + (((tickAnim - 14) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 12) * (0-(0)));
        }
        else if (tickAnim >= 26 && tickAnim < 40) {
            xx = -7.25 + (((tickAnim - 26) / 14) * (19.75-(-7.25)));
            yy = 0 + (((tickAnim - 26) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 26) / 14) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightFoot, rightFoot.rotateAngleX + (float) Math.toRadians(xx), rightFoot.rotateAngleY + (float) Math.toRadians(yy), rightFoot.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 6) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 6) / 6) * (-0.45-(0)));
            zz = 0 + (((tickAnim - 6) / 6) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 26) {
            xx = 0 + (((tickAnim - 12) / 14) * (0-(0)));
            yy = -0.45 + (((tickAnim - 12) / 14) * (0.055-(-0.45)));
            zz = 0 + (((tickAnim - 12) / 14) * (0-(0)));
        }
        else if (tickAnim >= 26 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 26) / 14) * (0-(0)));
            yy = 0.055 + (((tickAnim - 26) / 14) * (0-(0.055)));
            zz = 0 + (((tickAnim - 26) / 14) * (0-(0)));
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
            xx = -42.75 + (((tickAnim - 0) / 7) * (0-(-42.75)));
            yy = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 7) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 7) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 7) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 26) {
            xx = 0 + (((tickAnim - 14) / 12) * (0-(0)));
            yy = 0 + (((tickAnim - 14) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 12) * (0-(0)));
        }
        else if (tickAnim >= 26 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 26) / 14) * (-42.75-(0)));
            yy = 0 + (((tickAnim - 26) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 26) / 14) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightToes, rightToes.rotateAngleX + (float) Math.toRadians(xx), rightToes.rotateAngleY + (float) Math.toRadians(yy), rightToes.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            zz = 0.975 + (((tickAnim - 0) / 7) * (0-(0.975)));
        }
        else if (tickAnim >= 7 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 7) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 7) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 7) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 26) {
            xx = 0 + (((tickAnim - 14) / 12) * (0-(0)));
            yy = 0 + (((tickAnim - 14) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 12) * (0-(0)));
        }
        else if (tickAnim >= 26 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 26) / 14) * (0-(0)));
            yy = 0 + (((tickAnim - 26) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 26) / 14) * (0.975-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightToes.rotationPointX = this.rightToes.rotationPointX + (float)(xx);
        this.rightToes.rotationPointY = this.rightToes.rotationPointY - (float)(yy);
        this.rightToes.rotationPointZ = this.rightToes.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = -9.49907 + (((tickAnim - 0) / 5) * (-19.5-(-9.49907)));
            yy = -0.06106 + (((tickAnim - 0) / 5) * (0-(-0.06106)));
            zz = -1.74893 + (((tickAnim - 0) / 5) * (0-(-1.74893)));
        }
        else if (tickAnim >= 5 && tickAnim < 33) {
            xx = -19.5 + (((tickAnim - 5) / 28) * (17.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-5-(-19.5)));
            yy = 0 + (((tickAnim - 5) / 28) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 28) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 40) {
            xx = 17.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-5 + (((tickAnim - 33) / 7) * (-9.49907-(17.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-5)));
            yy = 0 + (((tickAnim - 33) / 7) * (-0.06106-(0)));
            zz = 0 + (((tickAnim - 33) / 7) * (-1.74893-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm1, leftArm1.rotateAngleX + (float) Math.toRadians(xx), leftArm1.rotateAngleY + (float) Math.toRadians(yy), leftArm1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = -23.982673927+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-35 + (((tickAnim - 0) / 5) * (8.25-(-23.982673927+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-35)));
            yy = 1.32509 + (((tickAnim - 0) / 5) * (0-(1.32509)));
            zz = 1.49818 + (((tickAnim - 0) / 5) * (0-(1.49818)));
        }
        else if (tickAnim >= 5 && tickAnim < 33) {
            xx = 8.25 + (((tickAnim - 5) / 28) * (0-(8.25)));
            yy = 0 + (((tickAnim - 5) / 28) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 28) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 33) / 7) * (-54.5327+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-35-(0)));
            yy = 0 + (((tickAnim - 33) / 7) * (1.32509-(0)));
            zz = 0 + (((tickAnim - 33) / 7) * (1.49818-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm2, leftArm2.rotateAngleX + (float) Math.toRadians(xx), leftArm2.rotateAngleY + (float) Math.toRadians(yy), leftArm2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = 1.2 + (((tickAnim - 0) / 5) * (-0.425-(1.2)));
            zz = 0.075 + (((tickAnim - 0) / 5) * (0-(0.075)));
        }
        else if (tickAnim >= 5 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 5) / 28) * (0-(0)));
            yy = -0.425 + (((tickAnim - 5) / 28) * (0-(-0.425)));
            zz = 0 + (((tickAnim - 5) / 28) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 33) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 33) / 7) * (1.2-(0)));
            zz = 0 + (((tickAnim - 33) / 7) * (0.075-(0)));
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
            xx = 41.75 + (((tickAnim - 0) / 5) * (9.75-(41.75)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 19) {
            xx = 9.75 + (((tickAnim - 5) / 14) * (-4.87-(9.75)));
            yy = 0 + (((tickAnim - 5) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 14) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 33) {
            xx = -4.87 + (((tickAnim - 19) / 14) * (23-(-4.87)));
            yy = 0 + (((tickAnim - 19) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 19) / 14) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 40) {
            xx = 23 + (((tickAnim - 33) / 7) * (41.75-(23)));
            yy = 0 + (((tickAnim - 33) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftHand, leftHand.rotateAngleX + (float) Math.toRadians(xx), leftHand.rotateAngleY + (float) Math.toRadians(yy), leftHand.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = 0.8 + (((tickAnim - 0) / 5) * (-0.375-(0.8)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 5) / 7) * (0-(0)));
            yy = -0.375 + (((tickAnim - 5) / 7) * (0-(-0.375)));
            zz = 0 + (((tickAnim - 5) / 7) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 12) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 12) / 7) * (0.185-(0)));
            zz = 0 + (((tickAnim - 12) / 7) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 26) {
            xx = 0 + (((tickAnim - 19) / 7) * (0-(0)));
            yy = 0.185 + (((tickAnim - 19) / 7) * (-0.335-(0.185)));
            zz = 0 + (((tickAnim - 19) / 7) * (0-(0)));
        }
        else if (tickAnim >= 26 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 26) / 7) * (0-(0)));
            yy = -0.335 + (((tickAnim - 26) / 7) * (0-(-0.335)));
            zz = 0 + (((tickAnim - 26) / 7) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 33) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 33) / 7) * (0.8-(0)));
            zz = 0 + (((tickAnim - 33) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftHand.rotationPointX = this.leftHand.rotationPointX + (float)(xx);
        this.leftHand.rotationPointY = this.leftHand.rotationPointY - (float)(yy);
        this.leftHand.rotationPointZ = this.leftHand.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 10) / 10) * (-42.75-(0)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 27) {
            xx = -42.75 + (((tickAnim - 20) / 7) * (0-(-42.75)));
            yy = 0 + (((tickAnim - 20) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 7) * (0-(0)));
        }
        else if (tickAnim >= 27 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 27) / 13) * (0-(0)));
            yy = 0 + (((tickAnim - 27) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 27) / 13) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftToes, leftToes.rotateAngleX + (float) Math.toRadians(xx), leftToes.rotateAngleY + (float) Math.toRadians(yy), leftToes.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0.975-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 27) {
            xx = 0 + (((tickAnim - 20) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 20) / 7) * (0-(0)));
            zz = 0.975 + (((tickAnim - 20) / 7) * (0-(0.975)));
        }
        else if (tickAnim >= 27 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 27) / 13) * (0-(0)));
            yy = 0 + (((tickAnim - 27) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 27) / 13) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftToes.rotationPointX = this.leftToes.rotationPointX + (float)(xx);
        this.leftToes.rotationPointY = this.leftToes.rotationPointY - (float)(yy);
        this.leftToes.rotationPointZ = this.leftToes.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 0) / 6) * (2.04-(0)));
            yy = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 12) {
            xx = 2.04 + (((tickAnim - 6) / 6) * (-1.9-(2.04)));
            yy = 0 + (((tickAnim - 6) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 6) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 14) {
            xx = -1.9 + (((tickAnim - 12) / 2) * (7-(-1.9)));
            yy = 0 + (((tickAnim - 12) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 2) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 40) {
            xx = 7 + (((tickAnim - 14) / 26) * (0-(7)));
            yy = 0 + (((tickAnim - 14) / 26) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 26) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg2, rightLeg2.rotateAngleX + (float) Math.toRadians(xx), rightLeg2.rotateAngleY + (float) Math.toRadians(yy), rightLeg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 6) * (2.72-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (-0.25-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 6) / 8) * (0-(0)));
            yy = 2.72 + (((tickAnim - 6) / 8) * (-0.675-(2.72)));
            zz = -0.25 + (((tickAnim - 6) / 8) * (0-(-0.25)));
        }
        else if (tickAnim >= 14 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 14) / 26) * (0-(0)));
            yy = -0.675 + (((tickAnim - 14) / 26) * (0-(-0.675)));
            zz = 0 + (((tickAnim - 14) / 26) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightLeg2.rotationPointX = this.rightLeg2.rotationPointX + (float)(xx);
        this.rightLeg2.rotationPointY = this.rightLeg2.rotationPointY - (float)(yy);
        this.rightLeg2.rotationPointZ = this.rightLeg2.rotationPointZ + (float)(zz);



        this.setRotateAngle(hips, hips.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.5))*1), hips.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180))*-1), hips.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180))*2));
        this.hips.rotationPointX = this.hips.rotationPointX + (float)(0);
        this.hips.rotationPointY = this.hips.rotationPointY - (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.5-50))*0.5);
        this.hips.rotationPointZ = this.hips.rotationPointZ + (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.5-100))*-0.2);


        this.setRotateAngle(tail1, tail1.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.5+50))*-0.5), tail1.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-50))*1), tail1.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180))*0.5));


        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.5+100))*-0.5), tail2.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-100))*2), tail2.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-50))*0.5));


        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.5+150))*1), tail3.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-150))*3), tail3.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-100))*0.5));


        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.5+150))*2), tail4.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-200))*6), tail4.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-150))*1));


        this.setRotateAngle(tail5, tail5.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.5+200))*2), tail5.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-250))*9), tail5.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-200))*3));


        this.setRotateAngle(tail6, tail6.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.5+250))*-4), tail6.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-300))*12), tail6.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-250))*5));


        this.setRotateAngle(tail7, tail7.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.5+350))*-5), tail7.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-350))*15), tail7.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-300))*8));


        this.setRotateAngle(tail8, tail8.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.5+420))*10), tail8.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-400))*18), tail8.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-350))*12));


        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.5-100))*0.5), body.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180))*1), body.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-70))*-2));


        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.5-150))*1), chest.rotateAngleY + (float) Math.toRadians(0), chest.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-150))*2));



        if (tickAnim >= 0 && tickAnim < 12) {
            xx = 2.25 + (((tickAnim - 0) / 12) * (17.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-5-(2.25)));
            yy = 0 + (((tickAnim - 0) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 12) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 19) {
            xx = 17.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-5 + (((tickAnim - 12) / 7) * (-34.2491+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*25-(17.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-5)));
            yy = 0 + (((tickAnim - 12) / 7) * (-0.06106-(0)));
            zz = 0 + (((tickAnim - 12) / 7) * (1.74893-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 24) {
            xx = -34.2491+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*25 + (((tickAnim - 19) / 5) * (-19.5-(-34.2491+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*25)));
            yy = -0.06106 + (((tickAnim - 19) / 5) * (0-(-0.06106)));
            zz = 1.74893 + (((tickAnim - 19) / 5) * (0-(1.74893)));
        }
        else if (tickAnim >= 24 && tickAnim < 40) {
            xx = -19.5 + (((tickAnim - 24) / 16) * (2.25-(-19.5)));
            yy = 0 + (((tickAnim - 24) / 16) * (0-(0)));
            zz = 0 + (((tickAnim - 24) / 16) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm1, rightArm1.rotateAngleX + (float) Math.toRadians(xx), rightArm1.rotateAngleY + (float) Math.toRadians(yy), rightArm1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 0) / 12) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 12) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 12) / 7) * (21.3423+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120+10))*-55-(0)));
            yy = 0 + (((tickAnim - 12) / 7) * (1.32509-(0)));
            zz = 0 + (((tickAnim - 12) / 7) * (-1.49818-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 24) {
            xx = 21.3423+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120+10))*-55 + (((tickAnim - 19) / 5) * (8.25-(21.3423+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120+10))*-55)));
            yy = 1.32509 + (((tickAnim - 19) / 5) * (0-(1.32509)));
            zz = -1.49818 + (((tickAnim - 19) / 5) * (0-(-1.49818)));
        }
        else if (tickAnim >= 24 && tickAnim < 40) {
            xx = 8.25 + (((tickAnim - 24) / 16) * (0-(8.25)));
            yy = 0 + (((tickAnim - 24) / 16) * (0-(0)));
            zz = 0 + (((tickAnim - 24) / 16) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm2, rightArm2.rotateAngleX + (float) Math.toRadians(xx), rightArm2.rotateAngleY + (float) Math.toRadians(yy), rightArm2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 0) / 12) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 12) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 12) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 12) / 7) * (1.2-(0)));
            zz = 0 + (((tickAnim - 12) / 7) * (0.075-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 24) {
            xx = 0 + (((tickAnim - 19) / 5) * (0-(0)));
            yy = 1.2 + (((tickAnim - 19) / 5) * (-0.425-(1.2)));
            zz = 0.075 + (((tickAnim - 19) / 5) * (0-(0.075)));
        }
        else if (tickAnim >= 24 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 24) / 16) * (0-(0)));
            yy = -0.425 + (((tickAnim - 24) / 16) * (0-(-0.425)));
            zz = 0 + (((tickAnim - 24) / 16) * (0-(0)));
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
            xx = 0 + (((tickAnim - 0) / 12) * (23-(0)));
            yy = 0 + (((tickAnim - 0) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 12) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 19) {
            xx = 23 + (((tickAnim - 12) / 7) * (41.75-(23)));
            yy = 0 + (((tickAnim - 12) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 7) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 24) {
            xx = 41.75 + (((tickAnim - 19) / 5) * (9.75-(41.75)));
            yy = 0 + (((tickAnim - 19) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 19) / 5) * (0-(0)));
        }
        else if (tickAnim >= 24 && tickAnim < 40) {
            xx = 9.75 + (((tickAnim - 24) / 16) * (0-(9.75)));
            yy = 0 + (((tickAnim - 24) / 16) * (0-(0)));
            zz = 0 + (((tickAnim - 24) / 16) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightHand, rightHand.rotateAngleX + (float) Math.toRadians(xx), rightHand.rotateAngleY + (float) Math.toRadians(yy), rightHand.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 0) / 12) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 12) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 12) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 12) / 7) * (0.8-(0)));
            zz = 0 + (((tickAnim - 12) / 7) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 24) {
            xx = 0 + (((tickAnim - 19) / 5) * (0-(0)));
            yy = 0.8 + (((tickAnim - 19) / 5) * (-0.375-(0.8)));
            zz = 0 + (((tickAnim - 19) / 5) * (0-(0)));
        }
        else if (tickAnim >= 24 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 24) / 16) * (0-(0)));
            yy = -0.375 + (((tickAnim - 24) / 16) * (0-(-0.375)));
            zz = 0 + (((tickAnim - 24) / 16) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightHand.rotationPointX = this.rightHand.rotationPointX + (float)(xx);
        this.rightHand.rotationPointY = this.rightHand.rotationPointY - (float)(yy);
        this.rightHand.rotationPointZ = this.rightHand.rotationPointZ + (float)(zz);



        this.setRotateAngle(neck1, neck1.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.5-250))*1.5), neck1.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-50))*-0.5), neck1.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-200))*1));


        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.5-250))*-2), neck2.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-100))*-0.5), neck2.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-250))*1));


        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.5-300))*2), neck3.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-150))*-0.5), neck3.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-300))*1));


        this.setRotateAngle(neck4, neck4.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.5-350))*1), neck4.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-200))*0.5), neck4.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-350))*1));


        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(0), head.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-250))*1), head.rotateAngleZ + (float) Math.toRadians(0));
    }
    public void animRunning(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraDemandasaurus entity = (EntityPrehistoricFloraDemandasaurus) entitylivingbaseIn;
        int animCycle = 22;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;

        if (tickAnim >= 0 && tickAnim < 11) {
            xx = -4.5 + (((tickAnim - 0) / 11) * (25.25-(-4.5)));
            yy = 0 + (((tickAnim - 0) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 11) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 18) {
            xx = 25.25 + (((tickAnim - 11) / 7) * (-12.75-(25.25)));
            yy = 0 + (((tickAnim - 11) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 7) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 23) {
            xx = -12.75 + (((tickAnim - 18) / 5) * (-4.5-(-12.75)));
            yy = 0 + (((tickAnim - 18) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg1, leftLeg1.rotateAngleX + (float) Math.toRadians(xx), leftLeg1.rotateAngleY + (float) Math.toRadians(yy), leftLeg1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 11) {
            xx = 3.25 + (((tickAnim - 0) / 11) * (0-(3.25)));
            yy = 0 + (((tickAnim - 0) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 11) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 11) / 3) * (2.04-(0)));
            yy = 0 + (((tickAnim - 11) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 3) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 17) {
            xx = 2.04 + (((tickAnim - 14) / 3) * (-1.9-(2.04)));
            yy = 0 + (((tickAnim - 14) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 3) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 18) {
            xx = -1.9 + (((tickAnim - 17) / 1) * (7-(-1.9)));
            yy = 0 + (((tickAnim - 17) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 17) / 1) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 23) {
            xx = 7 + (((tickAnim - 18) / 5) * (3.25-(7)));
            yy = 0 + (((tickAnim - 18) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg2, leftLeg2.rotateAngleX + (float) Math.toRadians(xx), leftLeg2.rotateAngleY + (float) Math.toRadians(yy), leftLeg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 0) / 11) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 11) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 11) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 11) / 3) * (2.72-(0)));
            zz = 0 + (((tickAnim - 11) / 3) * (-0.25-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 14) / 4) * (0-(0)));
            yy = 2.72 + (((tickAnim - 14) / 4) * (-0.675-(2.72)));
            zz = -0.25 + (((tickAnim - 14) / 4) * (0-(-0.25)));
        }
        else if (tickAnim >= 18 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 18) / 5) * (0-(0)));
            yy = -0.675 + (((tickAnim - 18) / 5) * (0-(-0.675)));
            zz = 0 + (((tickAnim - 18) / 5) * (0-(0)));
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
            xx = 0.5 + (((tickAnim - 0) / 6) * (-10-(0.5)));
            yy = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 11) {
            xx = -10 + (((tickAnim - 6) / 5) * (19.75-(-10)));
            yy = 0 + (((tickAnim - 6) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 5) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 14) {
            xx = 19.75 + (((tickAnim - 11) / 3) * (12-(19.75)));
            yy = 0 + (((tickAnim - 11) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 3) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 17) {
            xx = 12 + (((tickAnim - 14) / 3) * (0-(12)));
            yy = 0 + (((tickAnim - 14) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 3) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 17) / 1) * (6.5-(0)));
            yy = 0 + (((tickAnim - 17) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 17) / 1) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 23) {
            xx = 6.5 + (((tickAnim - 18) / 5) * (0.5-(6.5)));
            yy = 0 + (((tickAnim - 18) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftFoot, leftFoot.rotateAngleX + (float) Math.toRadians(xx), leftFoot.rotateAngleY + (float) Math.toRadians(yy), leftFoot.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 0) / 11) * (0-(0)));
            yy = -0.525 + (((tickAnim - 0) / 11) * (0-(-0.525)));
            zz = 0 + (((tickAnim - 0) / 11) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 11) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 11) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 3) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 17) {
            xx = 0 + (((tickAnim - 14) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 14) / 3) * (-0.45-(0)));
            zz = 0 + (((tickAnim - 14) / 3) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 17) / 6) * (0-(0)));
            yy = -0.45 + (((tickAnim - 17) / 6) * (-0.525-(-0.45)));
            zz = 0 + (((tickAnim - 17) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftFoot.rotationPointX = this.leftFoot.rotationPointX + (float)(xx);
        this.leftFoot.rotationPointY = this.leftFoot.rotationPointY - (float)(yy);
        this.leftFoot.rotationPointZ = this.leftFoot.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 25.25 + (((tickAnim - 0) / 7) * (-12.75-(25.25)));
            yy = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 23) {
            xx = -12.75 + (((tickAnim - 7) / 16) * (25.25-(-12.75)));
            yy = 0 + (((tickAnim - 7) / 16) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 16) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg1, rightLeg1.rotateAngleX + (float) Math.toRadians(xx), rightLeg1.rotateAngleY + (float) Math.toRadians(yy), rightLeg1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 19.75 + (((tickAnim - 0) / 3) * (12-(19.75)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 6) {
            xx = 12 + (((tickAnim - 3) / 3) * (0-(12)));
            yy = 0 + (((tickAnim - 3) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 3) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 6) / 1) * (6.5-(0)));
            yy = 0 + (((tickAnim - 6) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 1) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 14) {
            xx = 6.5 + (((tickAnim - 7) / 7) * (-7.25-(6.5)));
            yy = 0 + (((tickAnim - 7) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 7) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 23) {
            xx = -7.25 + (((tickAnim - 14) / 9) * (19.75-(-7.25)));
            yy = 0 + (((tickAnim - 14) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 9) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightFoot, rightFoot.rotateAngleX + (float) Math.toRadians(xx), rightFoot.rotateAngleY + (float) Math.toRadians(yy), rightFoot.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 3) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 3) / 3) * (-0.45-(0)));
            zz = 0 + (((tickAnim - 3) / 3) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 6) / 8) * (0-(0)));
            yy = -0.45 + (((tickAnim - 6) / 8) * (0.055-(-0.45)));
            zz = 0 + (((tickAnim - 6) / 8) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 14) / 9) * (0-(0)));
            yy = 0.055 + (((tickAnim - 14) / 9) * (0-(0.055)));
            zz = 0 + (((tickAnim - 14) / 9) * (0-(0)));
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
            xx = -42.75 + (((tickAnim - 0) / 3) * (0-(-42.75)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 3) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 3) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 4) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 7) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 7) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 7) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 14) / 9) * (-42.75-(0)));
            yy = 0 + (((tickAnim - 14) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 9) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightToes, rightToes.rotateAngleX + (float) Math.toRadians(xx), rightToes.rotateAngleY + (float) Math.toRadians(yy), rightToes.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0.975 + (((tickAnim - 0) / 3) * (0-(0.975)));
        }
        else if (tickAnim >= 3 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 3) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 3) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 4) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 7) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 7) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 7) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 14) / 9) * (0-(0)));
            yy = 0 + (((tickAnim - 14) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 9) * (0.975-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightToes.rotationPointX = this.rightToes.rotationPointX + (float)(xx);
        this.rightToes.rotationPointY = this.rightToes.rotationPointY - (float)(yy);
        this.rightToes.rotationPointZ = this.rightToes.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = -9.49907 + (((tickAnim - 0) / 3) * (-22.25-(-9.49907)));
            yy = -0.06106 + (((tickAnim - 0) / 3) * (0-(-0.06106)));
            zz = -1.74893 + (((tickAnim - 0) / 3) * (0-(-1.74893)));
        }
        else if (tickAnim >= 3 && tickAnim < 18) {
            xx = -22.25 + (((tickAnim - 3) / 15) * (29+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-5-(-22.25)));
            yy = 0 + (((tickAnim - 3) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 15) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 23) {
            xx = 29+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-5 + (((tickAnim - 18) / 5) * (-9.49907-(29+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-5)));
            yy = 0 + (((tickAnim - 18) / 5) * (-0.06106-(0)));
            zz = 0 + (((tickAnim - 18) / 5) * (-1.74893-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm1, leftArm1.rotateAngleX + (float) Math.toRadians(xx), leftArm1.rotateAngleY + (float) Math.toRadians(yy), leftArm1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = -23.982673927+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-35 + (((tickAnim - 0) / 3) * (8.25-(-23.982673927+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-35)));
            yy = 1.32509 + (((tickAnim - 0) / 3) * (0-(1.32509)));
            zz = 1.49818 + (((tickAnim - 0) / 3) * (0-(1.49818)));
        }
        else if (tickAnim >= 3 && tickAnim < 18) {
            xx = 8.25 + (((tickAnim - 3) / 15) * (0-(8.25)));
            yy = 0 + (((tickAnim - 3) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 15) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 18) / 5) * (1.0923+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-35-(0)));
            yy = 0 + (((tickAnim - 18) / 5) * (1.32509-(0)));
            zz = 0 + (((tickAnim - 18) / 5) * (1.49818-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm2, leftArm2.rotateAngleX + (float) Math.toRadians(xx), leftArm2.rotateAngleY + (float) Math.toRadians(yy), leftArm2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 1.2 + (((tickAnim - 0) / 3) * (-0.425-(1.2)));
            zz = 0.075 + (((tickAnim - 0) / 3) * (0-(0.075)));
        }
        else if (tickAnim >= 3 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 3) / 15) * (0-(0)));
            yy = -0.425 + (((tickAnim - 3) / 15) * (0-(-0.425)));
            zz = 0 + (((tickAnim - 3) / 15) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 18) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 18) / 5) * (1.2-(0)));
            zz = 0 + (((tickAnim - 18) / 5) * (0.075-(0)));
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
            xx = 41.75 + (((tickAnim - 0) / 3) * (9.75-(41.75)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 11) {
            xx = 9.75 + (((tickAnim - 3) / 8) * (-4.87-(9.75)));
            yy = 0 + (((tickAnim - 3) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 8) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 18) {
            xx = -4.87 + (((tickAnim - 11) / 7) * (23-(-4.87)));
            yy = 0 + (((tickAnim - 11) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 7) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 23) {
            xx = 23 + (((tickAnim - 18) / 5) * (41.75-(23)));
            yy = 0 + (((tickAnim - 18) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftHand, leftHand.rotateAngleX + (float) Math.toRadians(xx), leftHand.rotateAngleY + (float) Math.toRadians(yy), leftHand.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0.8 + (((tickAnim - 0) / 3) * (-0.375-(0.8)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 3) / 4) * (0-(0)));
            yy = -0.375 + (((tickAnim - 3) / 4) * (0-(-0.375)));
            zz = 0 + (((tickAnim - 3) / 4) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 7) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 7) / 4) * (0.185-(0)));
            zz = 0 + (((tickAnim - 7) / 4) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 11) / 3) * (0-(0)));
            yy = 0.185 + (((tickAnim - 11) / 3) * (-0.335-(0.185)));
            zz = 0 + (((tickAnim - 11) / 3) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 14) / 4) * (0-(0)));
            yy = -0.335 + (((tickAnim - 14) / 4) * (0-(-0.335)));
            zz = 0 + (((tickAnim - 14) / 4) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 18) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 18) / 5) * (0.8-(0)));
            zz = 0 + (((tickAnim - 18) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftHand.rotationPointX = this.leftHand.rotationPointX + (float)(xx);
        this.leftHand.rotationPointY = this.leftHand.rotationPointY - (float)(yy);
        this.leftHand.rotationPointZ = this.leftHand.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 6) / 5) * (-42.75-(0)));
            yy = 0 + (((tickAnim - 6) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 5) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 14) {
            xx = -42.75 + (((tickAnim - 11) / 3) * (0-(-42.75)));
            yy = 0 + (((tickAnim - 11) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 3) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 14) / 9) * (0-(0)));
            yy = 0 + (((tickAnim - 14) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 9) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftToes, leftToes.rotateAngleX + (float) Math.toRadians(xx), leftToes.rotateAngleY + (float) Math.toRadians(yy), leftToes.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 6) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 6) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 5) * (0.975-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 11) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 11) / 3) * (0-(0)));
            zz = 0.975 + (((tickAnim - 11) / 3) * (0-(0.975)));
        }
        else if (tickAnim >= 14 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 14) / 9) * (0-(0)));
            yy = 0 + (((tickAnim - 14) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 9) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftToes.rotationPointX = this.leftToes.rotationPointX + (float)(xx);
        this.leftToes.rotationPointY = this.leftToes.rotationPointY - (float)(yy);
        this.leftToes.rotationPointZ = this.leftToes.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (2.04-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 6) {
            xx = 2.04 + (((tickAnim - 3) / 3) * (-1.9-(2.04)));
            yy = 0 + (((tickAnim - 3) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 3) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 7) {
            xx = -1.9 + (((tickAnim - 6) / 1) * (7-(-1.9)));
            yy = 0 + (((tickAnim - 6) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 1) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 23) {
            xx = 7 + (((tickAnim - 7) / 16) * (0-(7)));
            yy = 0 + (((tickAnim - 7) / 16) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 16) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg2, rightLeg2.rotateAngleX + (float) Math.toRadians(xx), rightLeg2.rotateAngleY + (float) Math.toRadians(yy), rightLeg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (2.72-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (-0.25-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 3) / 4) * (0-(0)));
            yy = 2.72 + (((tickAnim - 3) / 4) * (-0.675-(2.72)));
            zz = -0.25 + (((tickAnim - 3) / 4) * (0-(-0.25)));
        }
        else if (tickAnim >= 7 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 7) / 16) * (0-(0)));
            yy = -0.675 + (((tickAnim - 7) / 16) * (0-(-0.675)));
            zz = 0 + (((tickAnim - 7) / 16) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightLeg2.rotationPointX = this.rightLeg2.rotationPointX + (float)(xx);
        this.rightLeg2.rotationPointY = this.rightLeg2.rotationPointY - (float)(yy);
        this.rightLeg2.rotationPointZ = this.rightLeg2.rotationPointZ + (float)(zz);



        this.setRotateAngle(hips, hips.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*320/0.5))*1.5), hips.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*320))*-1), hips.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*320))*3));
        this.hips.rotationPointX = this.hips.rotationPointX + (float)(0);
        this.hips.rotationPointY = this.hips.rotationPointY - (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*320/0.5-50))*0.7);
        this.hips.rotationPointZ = this.hips.rotationPointZ + (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*320/0.5-100))*-0.5);


        this.setRotateAngle(tail1, tail1.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*320/0.5+50))*-1), tail1.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*320-50))*1), tail1.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*320))*0.5));


        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*320/0.5+100))*-0.5), tail2.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*320-100))*2), tail2.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*320-50))*0.5));


        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*320/0.5+150))*1), tail3.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*320-150))*3), tail3.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*320-100))*0.5));


        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*320/0.5+150))*2), tail4.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*320-200))*6), tail4.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*320-150))*1));


        this.setRotateAngle(tail5, tail5.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*320/0.5+200))*2), tail5.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*320-250))*9), tail5.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*320-200))*3));


        this.setRotateAngle(tail6, tail6.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*320/0.5+250))*-4), tail6.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*320-300))*12), tail6.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*320-250))*5));


        this.setRotateAngle(tail7, tail7.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*320/0.5+350))*-5), tail7.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*320-350))*15), tail7.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*320-300))*8));


        this.setRotateAngle(tail8, tail8.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*320/0.5+420))*10), tail8.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*320-400))*18), tail8.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*320-350))*12));


        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*320/0.5-100))*1), body.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*320))*1), body.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*320-70))*-3));


        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*320/0.5-150))*3), chest.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*320+50))*1), chest.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*320-150))*3));



        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 6.75 + (((tickAnim - 0) / 7) * (25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-5-(6.75)));
            yy = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 11) {
            xx = 25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-5 + (((tickAnim - 7) / 4) * (-34.2491+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*25-(25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-5)));
            yy = 0 + (((tickAnim - 7) / 4) * (-0.06106-(0)));
            zz = 0 + (((tickAnim - 7) / 4) * (1.74893-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 13) {
            xx = -34.2491+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*25 + (((tickAnim - 11) / 2) * (-21.25-(-34.2491+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*25)));
            yy = -0.06106 + (((tickAnim - 11) / 2) * (0-(-0.06106)));
            zz = 1.74893 + (((tickAnim - 11) / 2) * (0-(1.74893)));
        }
        else if (tickAnim >= 13 && tickAnim < 23) {
            xx = -21.25 + (((tickAnim - 13) / 10) * (6.75-(-21.25)));
            yy = 0 + (((tickAnim - 13) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm1, rightArm1.rotateAngleX + (float) Math.toRadians(xx), rightArm1.rotateAngleY + (float) Math.toRadians(yy), rightArm1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 7) / 4) * (40.5173+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120+10))*-55-(0)));
            yy = 0 + (((tickAnim - 7) / 4) * (1.32509-(0)));
            zz = 0 + (((tickAnim - 7) / 4) * (-1.49818-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 13) {
            xx = 40.5173+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120+10))*-55 + (((tickAnim - 11) / 2) * (8.25-(40.5173+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120+10))*-55)));
            yy = 1.32509 + (((tickAnim - 11) / 2) * (0-(1.32509)));
            zz = -1.49818 + (((tickAnim - 11) / 2) * (0-(-1.49818)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
            xx = 8.25 + (((tickAnim - 13) / 5) * (1-(8.25)));
            yy = 0 + (((tickAnim - 13) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 5) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 23) {
            xx = 1 + (((tickAnim - 18) / 5) * (0-(1)));
            yy = 0 + (((tickAnim - 18) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm2, rightArm2.rotateAngleX + (float) Math.toRadians(xx), rightArm2.rotateAngleY + (float) Math.toRadians(yy), rightArm2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 7) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 7) / 4) * (1.2-(0)));
            zz = 0 + (((tickAnim - 7) / 4) * (0.075-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 11) / 2) * (0-(0)));
            yy = 1.2 + (((tickAnim - 11) / 2) * (-0.425-(1.2)));
            zz = 0.075 + (((tickAnim - 11) / 2) * (0-(0.075)));
        }
        else if (tickAnim >= 13 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 13) / 10) * (0-(0)));
            yy = -0.425 + (((tickAnim - 13) / 10) * (0-(-0.425)));
            zz = 0 + (((tickAnim - 13) / 10) * (0-(0)));
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
            xx = 0 + (((tickAnim - 0) / 7) * (23-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 11) {
            xx = 23 + (((tickAnim - 7) / 4) * (41.75-(23)));
            yy = 0 + (((tickAnim - 7) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 4) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 13) {
            xx = 41.75 + (((tickAnim - 11) / 2) * (9.75-(41.75)));
            yy = 0 + (((tickAnim - 11) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 2) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 23) {
            xx = 9.75 + (((tickAnim - 13) / 10) * (0-(9.75)));
            yy = 0 + (((tickAnim - 13) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightHand, rightHand.rotateAngleX + (float) Math.toRadians(xx), rightHand.rotateAngleY + (float) Math.toRadians(yy), rightHand.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 7) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 7) / 4) * (0.8-(0)));
            zz = 0 + (((tickAnim - 7) / 4) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 11) / 2) * (0-(0)));
            yy = 0.8 + (((tickAnim - 11) / 2) * (-0.375-(0.8)));
            zz = 0 + (((tickAnim - 11) / 2) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 13) / 10) * (0-(0)));
            yy = -0.375 + (((tickAnim - 13) / 10) * (0-(-0.375)));
            zz = 0 + (((tickAnim - 13) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightHand.rotationPointX = this.rightHand.rotationPointX + (float)(xx);
        this.rightHand.rotationPointY = this.rightHand.rotationPointY - (float)(yy);
        this.rightHand.rotationPointZ = this.rightHand.rotationPointZ + (float)(zz);



        this.setRotateAngle(neck1, neck1.rotateAngleX + (float) Math.toRadians(-2.25+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*320/0.5-250))*3), neck1.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*320-50))*1), neck1.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*320-200))*1));


        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*320/0.5-250))*-2), neck2.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*320-50))*-1), neck2.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*320-250))*1));


        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(-7.5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*320/0.5-300))*2), neck3.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*320-150))*-0.5), neck3.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*320-300))*1));


        this.setRotateAngle(neck4, neck4.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*320/0.5-350))*1), neck4.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*320-200))*0.5), neck4.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*320-350))*1));


        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(0), head.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*320-250))*1), head.rotateAngleZ + (float) Math.toRadians(0));
    }
        public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        EntityPrehistoricFloraDemandasaurus e = (EntityPrehistoricFloraDemandasaurus) entity;
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
