package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.EntityPrehistoricFloraVenetoraptor;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;

public class ModelVenetoraptor extends ModelBasePalaeopedia {
    private final AdvancedModelRenderer hips;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer leftLeg;
    private final AdvancedModelRenderer leftLeg2;
    private final AdvancedModelRenderer leftLeg3;
    private final AdvancedModelRenderer leftLeg4;
    private final AdvancedModelRenderer leftdewclaw;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer leftdewclaw2;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer rightLeg;
    private final AdvancedModelRenderer rightLeg2;
    private final AdvancedModelRenderer rightLeg3;
    private final AdvancedModelRenderer rightLeg4;
    private final AdvancedModelRenderer rightdewclaw;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer rightdewclaw2;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer body;
    private final AdvancedModelRenderer cube_r6;
    private final AdvancedModelRenderer chest;
    private final AdvancedModelRenderer cube_r7;
    private final AdvancedModelRenderer leftArm;
    private final AdvancedModelRenderer cube_r8;
    private final AdvancedModelRenderer leftArm2;
    private final AdvancedModelRenderer leftArm3;
    private final AdvancedModelRenderer cube_r9;
    private final AdvancedModelRenderer rightArm;
    private final AdvancedModelRenderer cube_r10;
    private final AdvancedModelRenderer rightArm2;
    private final AdvancedModelRenderer rightArm3;
    private final AdvancedModelRenderer cube_r11;
    private final AdvancedModelRenderer neck3;
    private final AdvancedModelRenderer cube_r12;
    private final AdvancedModelRenderer neck2;
    private final AdvancedModelRenderer cube_r13;
    private final AdvancedModelRenderer neck;
    private final AdvancedModelRenderer cube_r14;
    private final AdvancedModelRenderer head;
    private final AdvancedModelRenderer cube_r15;
    private final AdvancedModelRenderer cube_r16;
    private final AdvancedModelRenderer cube_r17;
    private final AdvancedModelRenderer jaw;
    private final AdvancedModelRenderer cube_r18;
    private final AdvancedModelRenderer eye;
    private final AdvancedModelRenderer tail;
    private final AdvancedModelRenderer tail2;
    private final AdvancedModelRenderer tail3;
    private final AdvancedModelRenderer tail4;

    private ModelAnimator animator;

    public ModelVenetoraptor() {
        this.textureWidth = 62;
        this.textureHeight = 62;

        this.hips = new AdvancedModelRenderer(this);
        this.hips.setRotationPoint(-0.0055F, 3.3088F, 0.8753F);


        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(-0.0138F, 2.1012F, 1.7023F);
        this.hips.addChild(cube_r1);
        this.setRotateAngle(cube_r1, -0.0873F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 21, 29, -1.0F, -2.8F, -2.0F, 2, 1, 4, 0.0F, false));
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 17, 38, -2.0F, -2.3F, -2.0F, 4, 5, 4, 0.0F, false));

        this.leftLeg = new AdvancedModelRenderer(this);
        this.leftLeg.setRotationPoint(2.1862F, 1.6012F, 0.7023F);
        this.hips.addChild(leftLeg);
        this.setRotateAngle(leftLeg, -0.6109F, 0.0F, 0.0F);
        this.leftLeg.cubeList.add(new ModelBox(leftLeg, 34, 38, -1.0F, -1.0F, -1.0F, 2, 8, 4, 0.004F, false));

        this.leftLeg2 = new AdvancedModelRenderer(this);
        this.leftLeg2.setRotationPoint(0.0F, 6.8F, -0.8F);
        this.leftLeg.addChild(leftLeg2);
        this.setRotateAngle(leftLeg2, 1.1781F, 0.0F, 0.0F);
        this.leftLeg2.cubeList.add(new ModelBox(leftLeg2, 15, 48, -1.0F, 0.0425F, -0.2651F, 2, 11, 2, 0.0F, false));

        this.leftLeg3 = new AdvancedModelRenderer(this);
        this.leftLeg3.setRotationPoint(0.0F, 11.0F, 1.3F);
        this.leftLeg2.addChild(leftLeg3);
        this.setRotateAngle(leftLeg3, -0.8727F, 0.0F, 0.0F);
        this.leftLeg3.cubeList.add(new ModelBox(leftLeg3, 0, 13, -1.0F, -0.167F, -0.7852F, 2, 6, 1, -0.004F, false));
        this.leftLeg3.cubeList.add(new ModelBox(leftLeg3, 0, 26, -1.0F, -0.167F, -1.1852F, 2, 6, 1, -0.007F, false));

        this.leftLeg4 = new AdvancedModelRenderer(this);
        this.leftLeg4.setRotationPoint(0.0F, 5.258F, -0.1852F);
        this.leftLeg3.addChild(leftLeg4);
        this.setRotateAngle(leftLeg4, 0.3054F, 0.0F, 0.0F);
        this.leftLeg4.cubeList.add(new ModelBox(leftLeg4, 43, 35, -0.9F, -0.5F, -4.5F, 2, 1, 5, 0.0F, false));

        this.leftdewclaw = new AdvancedModelRenderer(this);
        this.leftdewclaw.setRotationPoint(-0.7576F, 0.9365F, -0.6525F);
        this.leftLeg3.addChild(leftdewclaw);


        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(-0.0424F, 0.769F, -0.145F);
        this.leftdewclaw.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.9065F, -0.9874F, 1.1244F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 20, 0, -0.3433F, -0.2332F, -1.2988F, 1, 1, 2, 0.0F, false));

        this.leftdewclaw2 = new AdvancedModelRenderer(this);
        this.leftdewclaw2.setRotationPoint(-0.7007F, 3.3402F, -1.0124F);
        this.leftLeg3.addChild(leftdewclaw2);


        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(-0.4992F, 0.5928F, 0.3273F);
        this.leftdewclaw2.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.9703F, 0.2172F, 0.3302F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 53, 33, -0.1F, -0.4511F, -2.0083F, 1, 1, 3, 0.0F, false));

        this.rightLeg = new AdvancedModelRenderer(this);
        this.rightLeg.setRotationPoint(-2.2138F, 1.6012F, 0.7023F);
        this.hips.addChild(rightLeg);
        this.setRotateAngle(rightLeg, -0.6109F, 0.0F, 0.0F);
        this.rightLeg.cubeList.add(new ModelBox(rightLeg, 34, 38, -1.0F, -1.0F, -1.0F, 2, 8, 4, 0.004F, true));

        this.rightLeg2 = new AdvancedModelRenderer(this);
        this.rightLeg2.setRotationPoint(0.0F, 6.8F, -0.8F);
        this.rightLeg.addChild(rightLeg2);
        this.setRotateAngle(rightLeg2, 1.1781F, 0.0F, 0.0F);
        this.rightLeg2.cubeList.add(new ModelBox(rightLeg2, 15, 48, -1.0F, 0.0425F, -0.2651F, 2, 11, 2, 0.0F, true));

        this.rightLeg3 = new AdvancedModelRenderer(this);
        this.rightLeg3.setRotationPoint(0.0F, 11.0F, 1.3F);
        this.rightLeg2.addChild(rightLeg3);
        this.setRotateAngle(rightLeg3, -0.8727F, 0.0F, 0.0F);
        this.rightLeg3.cubeList.add(new ModelBox(rightLeg3, 0, 13, -1.0F, -0.167F, -0.7852F, 2, 6, 1, -0.004F, true));
        this.rightLeg3.cubeList.add(new ModelBox(rightLeg3, 0, 26, -1.0F, -0.167F, -1.1852F, 2, 6, 1, -0.007F, true));

        this.rightLeg4 = new AdvancedModelRenderer(this);
        this.rightLeg4.setRotationPoint(0.0F, 5.258F, -0.1852F);
        this.rightLeg3.addChild(rightLeg4);
        this.setRotateAngle(rightLeg4, 0.3054F, 0.0F, 0.0F);
        this.rightLeg4.cubeList.add(new ModelBox(rightLeg4, 43, 35, -1.1F, -0.5F, -4.5F, 2, 1, 5, 0.0F, true));

        this.rightdewclaw = new AdvancedModelRenderer(this);
        this.rightdewclaw.setRotationPoint(0.7576F, 0.9365F, -0.6525F);
        this.rightLeg3.addChild(rightdewclaw);


        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(0.0424F, 0.769F, -0.145F);
        this.rightdewclaw.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.9065F, 0.9874F, -1.1244F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 20, 0, -0.6567F, -0.2332F, -1.2988F, 1, 1, 2, 0.0F, true));

        this.rightdewclaw2 = new AdvancedModelRenderer(this);
        this.rightdewclaw2.setRotationPoint(0.7007F, 3.3402F, -1.0124F);
        this.rightLeg3.addChild(rightdewclaw2);


        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(0.4992F, 0.5928F, 0.3273F);
        this.rightdewclaw2.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.9703F, -0.2172F, -0.3302F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 53, 33, -0.9F, -0.4511F, -2.0083F, 1, 1, 3, 0.0F, true));

        this.body = new AdvancedModelRenderer(this);
        this.body.setRotationPoint(-0.0138F, 0.6012F, -0.7977F);
        this.hips.addChild(body);


        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(0.0F, -1.2F, -6.0F);
        this.body.addChild(cube_r6);
        this.setRotateAngle(cube_r6, -0.0349F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 31, 0, -1.5F, -0.5F, 0.0F, 3, 1, 7, 0.0F, false));
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 0, 13, -2.5F, 0.0F, 0.0F, 5, 5, 7, 0.0F, false));

        this.chest = new AdvancedModelRenderer(this);
        this.chest.setRotationPoint(0.0F, 1.0F, -5.5F);
        this.body.addChild(chest);


        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(0.0F, -1.8F, -4.0F);
        this.chest.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.0524F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 24, 48, -1.0F, -0.7F, 0.0F, 2, 1, 4, 0.0F, false));
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 0, 37, -2.0F, -0.2F, 0.0F, 4, 5, 4, 0.0F, false));

        this.leftArm = new AdvancedModelRenderer(this);
        this.leftArm.setRotationPoint(1.8F, 1.4F, -2.4F);
        this.chest.addChild(leftArm);
        this.setRotateAngle(leftArm, -1.1184F, 0.1018F, -0.4415F);
        this.leftArm.cubeList.add(new ModelBox(leftArm, 48, 4, 0.0F, -1.0F, -0.4F, 1, 2, 5, 0.004F, false));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(0.6F, -0.9F, 4.5F);
        this.leftArm.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.1714F, -0.0331F, -0.3345F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 0, 0, -0.02F, -4.1F, -4.9F, 0, 4, 5, 0.0F, false));
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 14, 0, 0.0F, -4.1F, -4.9F, 0, 4, 5, 0.0F, false));

        this.leftArm2 = new AdvancedModelRenderer(this);
        this.leftArm2.setRotationPoint(0.0F, -0.8F, 4.5F);
        this.leftArm.addChild(leftArm2);
        this.setRotateAngle(leftArm2, -1.6144F, 0.0F, 0.0F);
        this.leftArm2.cubeList.add(new ModelBox(leftArm2, 52, 49, 0.0F, -0.1922F, 0.0607F, 1, 1, 4, 0.0F, false));
        this.leftArm2.cubeList.add(new ModelBox(leftArm2, 33, 51, 0.0F, 0.4078F, 0.0607F, 1, 1, 4, -0.008F, false));

        this.leftArm3 = new AdvancedModelRenderer(this);
        this.leftArm3.setRotationPoint(1.0F, 0.4078F, 3.9607F);
        this.leftArm2.addChild(leftArm3);
        this.setRotateAngle(leftArm3, 0.1855F, -0.3435F, -0.0631F);
        this.leftArm3.cubeList.add(new ModelBox(leftArm3, 38, 26, -1.0F, -0.9F, 0.0F, 1, 2, 6, 0.0F, false));

        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(-1.0F, 0.8F, 0.0F);
        this.leftArm3.addChild(cube_r9);
        this.setRotateAngle(cube_r9, -0.7418F, 0.0F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 44, 53, 0.0F, -0.7F, 0.0F, 1, 1, 3, 0.004F, false));

        this.rightArm = new AdvancedModelRenderer(this);
        this.rightArm.setRotationPoint(-1.8F, 1.4F, -2.4F);
        this.chest.addChild(rightArm);
        this.setRotateAngle(rightArm, -1.1184F, -0.1018F, 0.4415F);
        this.rightArm.cubeList.add(new ModelBox(rightArm, 48, 4, -1.0F, -1.0F, -0.4F, 1, 2, 5, 0.004F, true));

        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(-0.6F, -0.9F, 4.5F);
        this.rightArm.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 0.1714F, 0.0331F, 0.3345F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 0, 0, 0.02F, -4.1F, -4.9F, 0, 4, 5, 0.0F, true));
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 14, 0, 0.0F, -4.1F, -4.9F, 0, 4, 5, 0.0F, true));

        this.rightArm2 = new AdvancedModelRenderer(this);
        this.rightArm2.setRotationPoint(0.0F, -0.8F, 4.5F);
        this.rightArm.addChild(rightArm2);
        this.setRotateAngle(rightArm2, -1.6144F, 0.0F, 0.0F);
        this.rightArm2.cubeList.add(new ModelBox(rightArm2, 52, 49, -1.0F, -0.1922F, 0.0607F, 1, 1, 4, 0.0F, true));
        this.rightArm2.cubeList.add(new ModelBox(rightArm2, 33, 51, -1.0F, 0.4078F, 0.0607F, 1, 1, 4, -0.008F, true));

        this.rightArm3 = new AdvancedModelRenderer(this);
        this.rightArm3.setRotationPoint(-1.0F, 0.4078F, 3.9607F);
        this.rightArm2.addChild(rightArm3);
        this.setRotateAngle(rightArm3, 0.1855F, 0.3435F, 0.0631F);
        this.rightArm3.cubeList.add(new ModelBox(rightArm3, 38, 26, 0.0F, -0.9F, 0.0F, 1, 2, 6, 0.0F, true));

        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(1.0F, 0.8F, 0.0F);
        this.rightArm3.addChild(cube_r11);
        this.setRotateAngle(cube_r11, -0.7418F, 0.0F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 44, 53, -1.0F, -0.7F, 0.0F, 1, 1, 3, 0.004F, true));

        this.neck3 = new AdvancedModelRenderer(this);
        this.neck3.setRotationPoint(0.0F, -1.4F, -2.2F);
        this.chest.addChild(neck3);


        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(0.0F, 0.0F, -0.9F);
        this.neck3.addChild(cube_r12);
        this.setRotateAngle(cube_r12, -0.5672F, 0.0F, 0.0F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 0, 47, -1.5F, -1.1F, -1.7F, 3, 3, 4, 0.0F, false));

        this.neck2 = new AdvancedModelRenderer(this);
        this.neck2.setRotationPoint(0.0F, -0.5F, -2.1F);
        this.neck3.addChild(neck2);


        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(0.0F, -3.5F, -1.9F);
        this.neck2.addChild(cube_r13);
        this.setRotateAngle(cube_r13, -0.7418F, 0.0F, 0.0F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 47, 20, -1.0F, 0.0F, 0.0F, 2, 3, 4, 0.0F, false));

        this.neck = new AdvancedModelRenderer(this);
        this.neck.setRotationPoint(0.0F, -2.5F, -2.1F);
        this.neck2.addChild(neck);


        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(0.0F, -1.5F, -2.7F);
        this.neck.addChild(cube_r14);
        this.setRotateAngle(cube_r14, -0.1745F, 0.0F, 0.0F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 50, 42, -1.0F, 0.0F, 0.0F, 2, 3, 3, -0.005F, false));

        this.head = new AdvancedModelRenderer(this);
        this.head.setRotationPoint(0.0F, -0.9F, -2.7F);
        this.neck.addChild(head);
        this.head.cubeList.add(new ModelBox(head, 53, 28, -1.0F, -0.6F, -2.0F, 2, 2, 2, 0.004F, false));

        this.cube_r15 = new AdvancedModelRenderer(this);
        this.cube_r15.setRotationPoint(0.5F, 0.9765F, -4.497F);
        this.head.addChild(cube_r15);
        this.setRotateAngle(cube_r15, 0.9774F, 0.0F, 0.0F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 14, 0, -1.0F, -0.0123F, -1.0406F, 1, 1, 1, 0.0F, false));

        this.cube_r16 = new AdvancedModelRenderer(this);
        this.cube_r16.setRotationPoint(-0.7F, -0.6F, -2.0F);
        this.head.addChild(cube_r16);
        this.setRotateAngle(cube_r16, 0.5585F, 0.0F, 0.0F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 24, 54, 0.0F, 0.0013F, -2.9935F, 1, 1, 3, -0.003F, true));
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 24, 54, 0.4F, 0.0013F, -2.9935F, 1, 1, 3, 0.0F, false));

        this.cube_r17 = new AdvancedModelRenderer(this);
        this.cube_r17.setRotationPoint(-0.7F, 1.4F, -2.0F);
        this.head.addChild(cube_r17);
        this.setRotateAngle(cube_r17, 0.2269F, 0.0F, 0.0F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 18, 15, 0.0F, -1.0F, -1.8F, 1, 1, 2, 0.003F, true));
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 18, 15, 0.4F, -1.0F, -1.8F, 1, 1, 2, 0.005F, false));

        this.jaw = new AdvancedModelRenderer(this);
        this.jaw.setRotationPoint(0.0F, 1.3F, 0.0F);
        this.head.addChild(jaw);
        this.setRotateAngle(jaw, 0.0436F, 0.0F, 0.0F);
        this.jaw.cubeList.add(new ModelBox(jaw, 31, 9, -1.0F, 0.0F, -2.0F, 2, 1, 2, 0.0F, false));
        this.jaw.cubeList.add(new ModelBox(jaw, 14, 29, -0.4807F, -0.975F, -1.95F, 1, 1, 2, 0.06F, false));
        this.jaw.cubeList.add(new ModelBox(jaw, 26, 15, -0.3F, 0.0F, -4.0F, 1, 1, 2, -0.003F, false));
        this.jaw.cubeList.add(new ModelBox(jaw, 26, 15, -0.7F, 0.0F, -4.0F, 1, 1, 2, -0.005F, true));

        this.cube_r18 = new AdvancedModelRenderer(this);
        this.cube_r18.setRotationPoint(0.0F, 1.0F, -4.0F);
        this.jaw.addChild(cube_r18);
        this.setRotateAngle(cube_r18, -0.3054F, 0.0F, 0.0F);
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 6, 0, -0.5F, -1.0F, -1.0F, 1, 1, 1, -0.007F, false));

        this.eye = new AdvancedModelRenderer(this);
        this.eye.setRotationPoint(0.0F, 0.3F, -1.4F);
        this.head.addChild(eye);
        this.eye.cubeList.add(new ModelBox(eye, 26, 19, -1.1F, -0.5F, -0.5F, 2, 1, 1, 0.0F, true));
        this.eye.cubeList.add(new ModelBox(eye, 26, 19, -0.9F, -0.5F, -0.5F, 2, 1, 1, 0.0F, false));

        this.tail = new AdvancedModelRenderer(this);
        this.tail.setRotationPoint(-0.0138F, 1.0012F, 3.7023F);
        this.hips.addChild(tail);
        this.setRotateAngle(tail, -0.0436F, 0.0F, 0.0F);
        this.tail.cubeList.add(new ModelBox(tail, 26, 15, -1.5F, -1.0F, -1.0F, 3, 3, 7, 0.0F, false));
        this.tail.cubeList.add(new ModelBox(tail, 41, 45, -0.5F, -1.5F, 0.0F, 1, 1, 6, 0.0F, false));

        this.tail2 = new AdvancedModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, 0.0F, 6.0F);
        this.tail.addChild(tail2);
        this.setRotateAngle(tail2, 0.1309F, 0.0F, 0.0F);
        this.tail2.cubeList.add(new ModelBox(tail2, 0, 26, -1.0F, -1.0F, -1.0F, 2, 2, 8, 0.0F, false));
        this.tail2.cubeList.add(new ModelBox(tail2, 40, 9, 0.0F, -1.5F, 0.0F, 0, 3, 7, 0.0F, false));

        this.tail3 = new AdvancedModelRenderer(this);
        this.tail3.setRotationPoint(0.0F, 0.0F, 7.0F);
        this.tail2.addChild(tail3);
        this.setRotateAngle(tail3, 0.0873F, 0.0F, 0.0F);
        this.tail3.cubeList.add(new ModelBox(tail3, 18, 3, -0.5F, -1.0F, -1.0F, 1, 1, 10, 0.0F, false));
        this.tail3.cubeList.add(new ModelBox(tail3, 28, 26, 0.0F, -1.5F, 0.0F, 0, 2, 9, 0.0F, false));

        this.tail4 = new AdvancedModelRenderer(this);
        this.tail4.setRotationPoint(0.0F, -0.5F, 9.0F);
        this.tail3.addChild(tail4);
        this.setRotateAngle(tail4, -0.2182F, 0.0F, 0.0F);
        this.tail4.cubeList.add(new ModelBox(tail4, 0, 0, -0.5F, -0.5F, -0.2F, 1, 1, 11, -0.004F, false));
        this.tail4.cubeList.add(new ModelBox(tail4, 14, 15, 0.0F, -0.9F, -0.2F, 0, 2, 11, -0.004F, false));
        this.tail4.cubeList.add(new ModelBox(tail4, 0, 0, 0.0F, -0.4F, 10.8F, 0, 1, 2, -0.004F, false));

        updateDefaultPose();
        animator = ModelAnimator.create();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        animate((IAnimatedEntity) entity, f, f1, f2, f3, f4, f5);
        this.hips.render(f5);
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
        this.hips.offsetY = -1.3F;
        this.hips.offsetX = 1.2F;
        this.hips.offsetZ = 2.0F;
        this.hips.rotateAngleY = (float)Math.toRadians(200);
        this.hips.rotateAngleX = (float)Math.toRadians(8);
        this.hips.rotateAngleZ = (float)Math.toRadians(-8);
        this.hips.scaleChildren = true;
        float scaler = 4.0F;
        this.hips.setScale(scaler, scaler, scaler);
        //Start of pose:

        //End of pose, now render the model:
        this.hips.render(f);
        //Reset rotations, positions and sizing:
        this.hips.setScale(1.0F, 1.0F, 1.0F);
        this.hips.scaleChildren = false;
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

        EntityPrehistoricFloraVenetoraptor Venetoraptor = (EntityPrehistoricFloraVenetoraptor) e;
        float masterSpeed = Venetoraptor.getTravelSpeed();

        this.faceTarget(f3, f4, 2, neck);
        this.faceTarget(f3, f4, 4, head);

        AdvancedModelRenderer[] Tail = {this.tail, this.tail2, this.tail3, this.tail4};

        if (Venetoraptor.getAnimation() == Venetoraptor.MAKE_NEST_ANIMATION) {
            //this.swing(Neck, 0.5F, 0.10F, false, 0.5F,-0.05F, f2, 0.8F);
            //this.walk(Neck, 0.5F * 2, -0.02F, false, 0.5F,0.01F, f2, 0.8F);
            return;
        }


        if (Venetoraptor.getIsClimbing()) {
            //Pose for climbing:
            //this.root.offsetY = 1.40F;
        }

    }

    @Override
    public void setLivingAnimations(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        super.setLivingAnimations(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
        this.resetToDefaultPose();
        EntityPrehistoricFloraVenetoraptor ee = (EntityPrehistoricFloraVenetoraptor) entitylivingbaseIn;


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
        else if (ee.getIsClimbing()) { //Is climbing but is static
            animClimb(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, true);
        }

        if (ee.getAnimation() == ee.EAT_ANIMATION) {
            animEat(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        } else if (ee.getAnimation() == ee.ROAR_ANIMATION) {
            animRoar(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        } else if (ee.getAnimation() == ee.LAY_ANIMATION) {
            animLay(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        } else if (ee.getAnimation() == ee.MAKE_NEST_ANIMATION) {
            animNest(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        } else if (ee.getAnimation() == ee.ATTACK_ANIMATION) {
            animAttack(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        } else if (ee.getAnimation() == ee.GRAPPLE_ANIMATION) {
            animGrapple(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        } else if (ee.getAnimation() == ee.STAND_ANIMATION) {
            animStand(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }


    }

    public void animEat(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraVenetoraptor entity = (EntityPrehistoricFloraVenetoraptor) entitylivingbaseIn;
        int animCycle = 10;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (7.5-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 7.5 + (((tickAnim - 5) / 5) * (0-(7.5)));
            yy = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(xx), body.rotateAngleY + (float) Math.toRadians(yy), body.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (11-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 11 + (((tickAnim - 5) / 5) * (0-(11)));
            yy = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(xx), chest.rotateAngleY + (float) Math.toRadians(yy), chest.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (37.25-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 37.25 + (((tickAnim - 5) / 5) * (0-(37.25)));
            yy = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(xx), neck3.rotateAngleY + (float) Math.toRadians(yy), neck3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (34.25-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 34.25 + (((tickAnim - 5) / 5) * (0-(34.25)));
            yy = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(xx), neck2.rotateAngleY + (float) Math.toRadians(yy), neck2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (21.62-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 21.62 + (((tickAnim - 3) / 2) * (-10.25-(21.62)));
            yy = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 2) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 7) {
            xx = -10.25 + (((tickAnim - 5) / 2) * (22.77-(-10.25)));
            yy = 0 + (((tickAnim - 5) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 2) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 10) {
            xx = 22.77 + (((tickAnim - 7) / 3) * (0-(22.77)));
            yy = 0 + (((tickAnim - 7) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0.25-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            zz = 0.25 + (((tickAnim - 3) / 2) * (0-(0.25)));
        }
        else if (tickAnim >= 5 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 5) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 5) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 2) * (0.175-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 7) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 7) / 3) * (0-(0)));
            zz = 0.175 + (((tickAnim - 7) / 3) * (0-(0.175)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.head.rotationPointX = this.head.rotationPointX + (float)(xx);
        this.head.rotationPointY = this.head.rotationPointY - (float)(yy);
        this.head.rotationPointZ = this.head.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 3) / 1) * (20.5-(0)));
            yy = 0 + (((tickAnim - 3) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 1) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 5) {
            xx = 20.5 + (((tickAnim - 4) / 1) * (0-(20.5)));
            yy = 0 + (((tickAnim - 4) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 1) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(xx), jaw.rotateAngleY + (float) Math.toRadians(yy), jaw.rotateAngleZ + (float) Math.toRadians(zz));


    }
    public void animAttack(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraVenetoraptor entity = (EntityPrehistoricFloraVenetoraptor) entitylivingbaseIn;
        int animCycle = 10;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (-10-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 6) {
            xx = -10 + (((tickAnim - 3) / 3) * (5-(-10)));
            yy = 0 + (((tickAnim - 3) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 3) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 10) {
            xx = 5 + (((tickAnim - 6) / 4) * (0-(5)));
            yy = 0 + (((tickAnim - 6) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(xx), body.rotateAngleY + (float) Math.toRadians(yy), body.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (19.25-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 6) {
            xx = 19.25 + (((tickAnim - 3) / 3) * (0-(19.25)));
            yy = 0 + (((tickAnim - 3) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 3) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 6) / 2) * (-0.95-(0)));
            yy = 0 + (((tickAnim - 6) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 2) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = -0.95 + (((tickAnim - 8) / 2) * (0-(-0.95)));
            yy = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(xx), neck3.rotateAngleY + (float) Math.toRadians(yy), neck3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (-0.3-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (-0.1-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 3) / 3) * (0-(0)));
            yy = -0.3 + (((tickAnim - 3) / 3) * (0-(-0.3)));
            zz = -0.1 + (((tickAnim - 3) / 3) * (0-(-0.1)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 6) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 6) / 2) * (-0.16-(0)));
            zz = 0 + (((tickAnim - 6) / 2) * (0.18-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            yy = -0.16 + (((tickAnim - 8) / 2) * (0-(-0.16)));
            zz = 0.18 + (((tickAnim - 8) / 2) * (0-(0.18)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.neck3.rotationPointX = this.neck3.rotationPointX + (float)(xx);
        this.neck3.rotationPointY = this.neck3.rotationPointY - (float)(yy);
        this.neck3.rotationPointZ = this.neck3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (-17.25-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 6) {
            xx = -17.25 + (((tickAnim - 3) / 3) * (20-(-17.25)));
            yy = 0 + (((tickAnim - 3) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 3) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 10) {
            xx = 20 + (((tickAnim - 6) / 4) * (0-(20)));
            yy = 0 + (((tickAnim - 6) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(xx), neck2.rotateAngleY + (float) Math.toRadians(yy), neck2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (-0.175-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0.15-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 3) / 3) * (0-(0)));
            yy = -0.175 + (((tickAnim - 3) / 3) * (0-(-0.175)));
            zz = 0.15 + (((tickAnim - 3) / 3) * (0-(0.15)));
        }
        else if (tickAnim >= 6 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 6) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 6) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.neck2.rotationPointX = this.neck2.rotationPointX + (float)(xx);
        this.neck2.rotationPointY = this.neck2.rotationPointY - (float)(yy);
        this.neck2.rotationPointZ = this.neck2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (-4.25-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 6) {
            xx = -4.25 + (((tickAnim - 3) / 3) * (-12.25-(-4.25)));
            yy = 0 + (((tickAnim - 3) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 3) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 10) {
            xx = -12.25 + (((tickAnim - 6) / 4) * (0-(-12.25)));
            yy = 0 + (((tickAnim - 6) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(xx), neck.rotateAngleY + (float) Math.toRadians(yy), neck.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 3) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 3) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 3) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 6) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 6) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.neck.rotationPointX = this.neck.rotationPointX + (float)(xx);
        this.neck.rotationPointY = this.neck.rotationPointY - (float)(yy);
        this.neck.rotationPointZ = this.neck.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (18-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 6) {
            xx = 18 + (((tickAnim - 3) / 3) * (-26.5-(18)));
            yy = 0 + (((tickAnim - 3) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 3) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = -26.5 + (((tickAnim - 6) / 2) * (-10.65-(-26.5)));
            yy = 0 + (((tickAnim - 6) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 2) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = -10.65 + (((tickAnim - 8) / 2) * (0-(-10.65)));
            yy = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 6) * (-0.225-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (0.55-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 6) / 4) * (0-(0)));
            yy = -0.225 + (((tickAnim - 6) / 4) * (0-(-0.225)));
            zz = 0.55 + (((tickAnim - 6) / 4) * (0-(0.55)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.head.rotationPointX = this.head.rotationPointX + (float)(xx);
        this.head.rotationPointY = this.head.rotationPointY - (float)(yy);
        this.head.rotationPointZ = this.head.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 3) / 3) * (22-(0)));
            yy = 0 + (((tickAnim - 3) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 3) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = 22 + (((tickAnim - 6) / 2) * (0-(22)));
            yy = 0 + (((tickAnim - 6) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(xx), jaw.rotateAngleY + (float) Math.toRadians(yy), jaw.rotateAngleZ + (float) Math.toRadians(zz));


    }
    public void animLay(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraVenetoraptor entity = (EntityPrehistoricFloraVenetoraptor) entitylivingbaseIn;
        int animCycle = 50;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (-32.25-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 30) {
            xx = -32.25 + (((tickAnim - 15) / 15) * (-32.25-(-32.25)));
            yy = 0 + (((tickAnim - 15) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 15) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = -32.25 + (((tickAnim - 30) / 10) * (13.25-(-32.25)));
            yy = 0 + (((tickAnim - 30) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 10) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = 13.25 + (((tickAnim - 40) / 10) * (0-(13.25)));
            yy = 0 + (((tickAnim - 40) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(hips, hips.rotateAngleX + (float) Math.toRadians(xx), hips.rotateAngleY + (float) Math.toRadians(yy), hips.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (-9.325-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (9.725-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 15) / 15) * (0-(0)));
            yy = -9.325 + (((tickAnim - 15) / 15) * (-9.325-(-9.325)));
            zz = 9.725 + (((tickAnim - 15) / 15) * (9.725-(9.725)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 30) / 10) * (0-(0)));
            yy = -9.325 + (((tickAnim - 30) / 10) * (-5.15-(-9.325)));
            zz = 9.725 + (((tickAnim - 30) / 10) * (6.6-(9.725)));
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 40) / 10) * (0-(0)));
            yy = -5.15 + (((tickAnim - 40) / 10) * (0-(-5.15)));
            zz = 6.6 + (((tickAnim - 40) / 10) * (0-(6.6)));
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
            xx = 0 + (((tickAnim - 0) / 15) * (16.25-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 30) {
            xx = 16.25 + (((tickAnim - 15) / 15) * (16.25-(16.25)));
            yy = 0 + (((tickAnim - 15) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 15) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 16.25 + (((tickAnim - 30) / 20) * (0-(16.25)));
            yy = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(xx), body.rotateAngleY + (float) Math.toRadians(yy), body.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0.15-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0.15-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 15) / 15) * (0-(0)));
            yy = 0.15 + (((tickAnim - 15) / 15) * (0.15-(0.15)));
            zz = 0.15 + (((tickAnim - 15) / 15) * (0.15-(0.15)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            yy = 0.15 + (((tickAnim - 30) / 20) * (0-(0.15)));
            zz = 0.15 + (((tickAnim - 30) / 20) * (0-(0.15)));
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
            xx = 0 + (((tickAnim - 0) / 15) * (-21.35911-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (-1.81798-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (-14.40925-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 30) {
            xx = -21.35911 + (((tickAnim - 15) / 15) * (-21.35911-(-21.35911)));
            yy = -1.81798 + (((tickAnim - 15) / 15) * (-1.81798-(-1.81798)));
            zz = -14.40925 + (((tickAnim - 15) / 15) * (-14.40925-(-14.40925)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = -21.35911 + (((tickAnim - 30) / 10) * (-39.79547-(-21.35911)));
            yy = -1.81798 + (((tickAnim - 30) / 10) * (25.45482-(-1.81798)));
            zz = -14.40925 + (((tickAnim - 30) / 10) * (-56.29435-(-14.40925)));
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = -39.79547 + (((tickAnim - 40) / 10) * (0-(-39.79547)));
            yy = 25.45482 + (((tickAnim - 40) / 10) * (0-(25.45482)));
            zz = -56.29435 + (((tickAnim - 40) / 10) * (0-(-56.29435)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm, leftArm.rotateAngleX + (float) Math.toRadians(xx), leftArm.rotateAngleY + (float) Math.toRadians(yy), leftArm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (-21.35911-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (1.81798-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (14.40925-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 30) {
            xx = -21.35911 + (((tickAnim - 15) / 15) * (-21.35911-(-21.35911)));
            yy = 1.81798 + (((tickAnim - 15) / 15) * (1.81798-(1.81798)));
            zz = 14.40925 + (((tickAnim - 15) / 15) * (14.40925-(14.40925)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = -21.35911 + (((tickAnim - 30) / 10) * (-39.79547-(-21.35911)));
            yy = 1.81798 + (((tickAnim - 30) / 10) * (-25.45482-(1.81798)));
            zz = 14.40925 + (((tickAnim - 30) / 10) * (56.29435-(14.40925)));
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = -39.79547 + (((tickAnim - 40) / 10) * (0-(-39.79547)));
            yy = -25.45482 + (((tickAnim - 40) / 10) * (0-(-25.45482)));
            zz = 56.29435 + (((tickAnim - 40) / 10) * (0-(56.29435)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm, rightArm.rotateAngleX + (float) Math.toRadians(xx), rightArm.rotateAngleY + (float) Math.toRadians(yy), rightArm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (10.75-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 30) {
            xx = 10.75 + (((tickAnim - 15) / 15) * (10.75-(10.75)));
            yy = 0 + (((tickAnim - 15) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 15) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 10.75 + (((tickAnim - 30) / 20) * (0-(10.75)));
            yy = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(xx), neck3.rotateAngleY + (float) Math.toRadians(yy), neck3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (-9.25-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 15) {
            xx = -9.25 + (((tickAnim - 8) / 7) * (-3.75-(-9.25)));
            yy = 0 + (((tickAnim - 8) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 7) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 30) {
            xx = -3.75 + (((tickAnim - 15) / 15) * (-3.75-(-3.75)));
            yy = 0 + (((tickAnim - 15) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 15) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = -3.75 + (((tickAnim - 30) / 10) * (10.5-(-3.75)));
            yy = 0 + (((tickAnim - 30) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 10) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = 10.5 + (((tickAnim - 40) / 10) * (0-(10.5)));
            yy = 0 + (((tickAnim - 40) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(xx), neck2.rotateAngleY + (float) Math.toRadians(yy), neck2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (18.75-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 30) {
            xx = 18.75 + (((tickAnim - 15) / 15) * (18.75-(18.75)));
            yy = 0 + (((tickAnim - 15) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 15) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = 18.75 + (((tickAnim - 30) / 10) * (-35-(18.75)));
            yy = 0 + (((tickAnim - 30) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 10) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = -35 + (((tickAnim - 40) / 10) * (0-(-35)));
            yy = 0 + (((tickAnim - 40) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(xx), neck.rotateAngleY + (float) Math.toRadians(yy), neck.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 30) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 30) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 30) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 10) * (0-(0)));
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
        this.neck.rotationPointX = this.neck.rotationPointX + (float)(xx);
        this.neck.rotationPointY = this.neck.rotationPointY - (float)(yy);
        this.neck.rotationPointZ = this.neck.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (12.25-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 15) {
            xx = 12.25 + (((tickAnim - 8) / 7) * (-3.5-(12.25)));
            yy = 0 + (((tickAnim - 8) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 7) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 30) {
            xx = -3.5 + (((tickAnim - 15) / 15) * (-3.5-(-3.5)));
            yy = 0 + (((tickAnim - 15) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 15) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = -3.5 + (((tickAnim - 30) / 10) * (0-(-3.5)));
            yy = 0 + (((tickAnim - 30) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 10) * (0-(0)));
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
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (-6.75-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 30) {
            xx = -6.75 + (((tickAnim - 15) / 15) * (-6.75-(-6.75)));
            yy = 0 + (((tickAnim - 15) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 15) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = -6.75 + (((tickAnim - 30) / 10) * (4.5-(-6.75)));
            yy = 0 + (((tickAnim - 30) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 10) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = 4.5 + (((tickAnim - 40) / 10) * (0-(4.5)));
            yy = 0 + (((tickAnim - 40) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail, tail.rotateAngleX + (float) Math.toRadians(xx), tail.rotateAngleY + (float) Math.toRadians(yy), tail.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (-0.65-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 15) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 15) / 15) * (0-(0)));
            zz = -0.65 + (((tickAnim - 15) / 15) * (-0.65-(-0.65)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 30) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 30) / 10) * (0-(0)));
            zz = -0.65 + (((tickAnim - 30) / 10) * (-0.45-(-0.65)));
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 40) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 40) / 10) * (0-(0)));
            zz = -0.45 + (((tickAnim - 40) / 10) * (0-(-0.45)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.tail.rotationPointX = this.tail.rotationPointX + (float)(xx);
        this.tail.rotationPointY = this.tail.rotationPointY - (float)(yy);
        this.tail.rotationPointZ = this.tail.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (-6.25-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 30) {
            xx = -6.25 + (((tickAnim - 15) / 15) * (-6.25-(-6.25)));
            yy = 0 + (((tickAnim - 15) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 15) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 35) {
            xx = -6.25 + (((tickAnim - 30) / 5) * (1.87-(-6.25)));
            yy = 0 + (((tickAnim - 30) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 5) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 40) {
            xx = 1.87 + (((tickAnim - 35) / 5) * (1.75-(1.87)));
            yy = 0 + (((tickAnim - 35) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 5) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = 1.75 + (((tickAnim - 40) / 10) * (0-(1.75)));
            yy = 0 + (((tickAnim - 40) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(xx), tail2.rotateAngleY + (float) Math.toRadians(yy), tail2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (-0.4-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 15) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 15) / 15) * (0-(0)));
            zz = -0.4 + (((tickAnim - 15) / 15) * (-0.4-(-0.4)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 30) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 30) / 10) * (0-(0)));
            zz = -0.4 + (((tickAnim - 30) / 10) * (0-(-0.4)));
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
        this.tail2.rotationPointX = this.tail2.rotationPointX + (float)(xx);
        this.tail2.rotationPointY = this.tail2.rotationPointY - (float)(yy);
        this.tail2.rotationPointZ = this.tail2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (28.75-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 30) {
            xx = 28.75 + (((tickAnim - 15) / 15) * (28.75-(28.75)));
            yy = 0 + (((tickAnim - 15) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 15) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 35) {
            xx = 28.75 + (((tickAnim - 30) / 5) * (-5.63-(28.75)));
            yy = 0 + (((tickAnim - 30) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 5) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 40) {
            xx = -5.63 + (((tickAnim - 35) / 5) * (-20-(-5.63)));
            yy = 0 + (((tickAnim - 35) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 5) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = -20 + (((tickAnim - 40) / 10) * (0-(-20)));
            yy = 0 + (((tickAnim - 40) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(xx), tail3.rotateAngleY + (float) Math.toRadians(yy), tail3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (-0.4-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 15) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 15) / 15) * (0-(0)));
            zz = -0.4 + (((tickAnim - 15) / 15) * (-0.4-(-0.4)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 30) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 30) / 10) * (0-(0)));
            zz = -0.4 + (((tickAnim - 30) / 10) * (0-(-0.4)));
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
        this.tail3.rotationPointX = this.tail3.rotationPointX + (float)(xx);
        this.tail3.rotationPointY = this.tail3.rotationPointY - (float)(yy);
        this.tail3.rotationPointZ = this.tail3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (18.25-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 30) {
            xx = 18.25 + (((tickAnim - 15) / 15) * (18.25-(18.25)));
            yy = 0 + (((tickAnim - 15) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 15) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = 18.25 + (((tickAnim - 30) / 10) * (-8.5-(18.25)));
            yy = 0 + (((tickAnim - 30) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 10) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = -8.5 + (((tickAnim - 40) / 10) * (0-(-8.5)));
            yy = 0 + (((tickAnim - 40) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(xx), tail4.rotateAngleY + (float) Math.toRadians(yy), tail4.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (-0.3-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 15) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 15) / 15) * (0-(0)));
            zz = -0.3 + (((tickAnim - 15) / 15) * (-0.3-(-0.3)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 30) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 30) / 10) * (0-(0)));
            zz = -0.3 + (((tickAnim - 30) / 10) * (0-(-0.3)));
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
        this.tail4.rotationPointX = this.tail4.rotationPointX + (float)(xx);
        this.tail4.rotationPointY = this.tail4.rotationPointY - (float)(yy);
        this.tail4.rotationPointZ = this.tail4.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (-27.75-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 30) {
            xx = -27.75 + (((tickAnim - 15) / 15) * (-27.75-(-27.75)));
            yy = 0 + (((tickAnim - 15) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 15) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = -27.75 + (((tickAnim - 30) / 10) * (-47.5-(-27.75)));
            yy = 0 + (((tickAnim - 30) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 10) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = -47.5 + (((tickAnim - 40) / 10) * (0-(-47.5)));
            yy = 0 + (((tickAnim - 40) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg, leftLeg.rotateAngleX + (float) Math.toRadians(xx), leftLeg.rotateAngleY + (float) Math.toRadians(yy), leftLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (22.5-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 30) {
            xx = 22.5 + (((tickAnim - 15) / 15) * (22.5-(22.5)));
            yy = 0 + (((tickAnim - 15) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 15) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 22.5 + (((tickAnim - 30) / 20) * (0-(22.5)));
            yy = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg2, leftLeg2.rotateAngleX + (float) Math.toRadians(xx), leftLeg2.rotateAngleY + (float) Math.toRadians(yy), leftLeg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (-36-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 30) {
            xx = -36 + (((tickAnim - 15) / 15) * (-36-(-36)));
            yy = 0 + (((tickAnim - 15) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 15) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = -36 + (((tickAnim - 30) / 10) * (-30-(-36)));
            yy = 0 + (((tickAnim - 30) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 10) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = -30 + (((tickAnim - 40) / 10) * (0-(-30)));
            yy = 0 + (((tickAnim - 40) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg3, leftLeg3.rotateAngleX + (float) Math.toRadians(xx), leftLeg3.rotateAngleY + (float) Math.toRadians(yy), leftLeg3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (75-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 30) {
            xx = 75 + (((tickAnim - 15) / 15) * (75-(75)));
            yy = 0 + (((tickAnim - 15) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 15) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = 75 + (((tickAnim - 30) / 10) * (53.25-(75)));
            yy = 0 + (((tickAnim - 30) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 10) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = 53.25 + (((tickAnim - 40) / 10) * (0-(53.25)));
            yy = 0 + (((tickAnim - 40) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg4, leftLeg4.rotateAngleX + (float) Math.toRadians(xx), leftLeg4.rotateAngleY + (float) Math.toRadians(yy), leftLeg4.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (2.06-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 8) / 7) * (0-(0)));
            yy = 2.06 + (((tickAnim - 8) / 7) * (0.725-(2.06)));
            zz = 0 + (((tickAnim - 8) / 7) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 15) / 15) * (0-(0)));
            yy = 0.725 + (((tickAnim - 15) / 15) * (0.725-(0.725)));
            zz = 0 + (((tickAnim - 15) / 15) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 30) / 10) * (0-(0)));
            yy = 0.725 + (((tickAnim - 30) / 10) * (0-(0.725)));
            zz = 0 + (((tickAnim - 30) / 10) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 45) {
            xx = 0 + (((tickAnim - 40) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 40) / 5) * (0.325-(0)));
            zz = 0 + (((tickAnim - 40) / 5) * (0-(0)));
        }
        else if (tickAnim >= 45 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 45) / 5) * (0-(0)));
            yy = 0.325 + (((tickAnim - 45) / 5) * (0-(0.325)));
            zz = 0 + (((tickAnim - 45) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftLeg4.rotationPointX = this.leftLeg4.rotationPointX + (float)(xx);
        this.leftLeg4.rotationPointY = this.leftLeg4.rotationPointY - (float)(yy);
        this.leftLeg4.rotationPointZ = this.leftLeg4.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (-27.75-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 30) {
            xx = -27.75 + (((tickAnim - 15) / 15) * (-27.75-(-27.75)));
            yy = 0 + (((tickAnim - 15) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 15) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = -27.75 + (((tickAnim - 30) / 10) * (-47.5-(-27.75)));
            yy = 0 + (((tickAnim - 30) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 10) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = -47.5 + (((tickAnim - 40) / 10) * (0-(-47.5)));
            yy = 0 + (((tickAnim - 40) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg, rightLeg.rotateAngleX + (float) Math.toRadians(xx), rightLeg.rotateAngleY + (float) Math.toRadians(yy), rightLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (22.5-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 30) {
            xx = 22.5 + (((tickAnim - 15) / 15) * (22.5-(22.5)));
            yy = 0 + (((tickAnim - 15) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 15) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 22.5 + (((tickAnim - 30) / 20) * (0-(22.5)));
            yy = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg2, rightLeg2.rotateAngleX + (float) Math.toRadians(xx), rightLeg2.rotateAngleY + (float) Math.toRadians(yy), rightLeg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (-36-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 30) {
            xx = -36 + (((tickAnim - 15) / 15) * (-36-(-36)));
            yy = 0 + (((tickAnim - 15) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 15) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = -36 + (((tickAnim - 30) / 10) * (-30-(-36)));
            yy = 0 + (((tickAnim - 30) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 10) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = -30 + (((tickAnim - 40) / 10) * (0-(-30)));
            yy = 0 + (((tickAnim - 40) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg3, rightLeg3.rotateAngleX + (float) Math.toRadians(xx), rightLeg3.rotateAngleY + (float) Math.toRadians(yy), rightLeg3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (75-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 30) {
            xx = 75 + (((tickAnim - 15) / 15) * (75-(75)));
            yy = 0 + (((tickAnim - 15) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 15) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = 75 + (((tickAnim - 30) / 10) * (53.25-(75)));
            yy = 0 + (((tickAnim - 30) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 10) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = 53.25 + (((tickAnim - 40) / 10) * (0-(53.25)));
            yy = 0 + (((tickAnim - 40) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg4, rightLeg4.rotateAngleX + (float) Math.toRadians(xx), rightLeg4.rotateAngleY + (float) Math.toRadians(yy), rightLeg4.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (2.06-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 8) / 7) * (0-(0)));
            yy = 2.06 + (((tickAnim - 8) / 7) * (0.725-(2.06)));
            zz = 0 + (((tickAnim - 8) / 7) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 15) / 15) * (0-(0)));
            yy = 0.725 + (((tickAnim - 15) / 15) * (0.725-(0.725)));
            zz = 0 + (((tickAnim - 15) / 15) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 30) / 10) * (0-(0)));
            yy = 0.725 + (((tickAnim - 30) / 10) * (0-(0.725)));
            zz = 0 + (((tickAnim - 30) / 10) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 45) {
            xx = 0 + (((tickAnim - 40) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 40) / 5) * (0.325-(0)));
            zz = 0 + (((tickAnim - 40) / 5) * (0-(0)));
        }
        else if (tickAnim >= 45 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 45) / 5) * (0-(0)));
            yy = 0.325 + (((tickAnim - 45) / 5) * (0-(0.325)));
            zz = 0 + (((tickAnim - 45) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightLeg4.rotationPointX = this.rightLeg4.rotationPointX + (float)(xx);
        this.rightLeg4.rotationPointY = this.rightLeg4.rotationPointY - (float)(yy);
        this.rightLeg4.rotationPointZ = this.rightLeg4.rotationPointZ + (float)(zz);



    }
    public void animNest(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraVenetoraptor entity = (EntityPrehistoricFloraVenetoraptor) entitylivingbaseIn;
        int animCycle = 50;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (-29.25-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = -29.25 + (((tickAnim - 10) / 10) * (-30.5-(-29.25)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 37) {
            xx = -30.5 + (((tickAnim - 20) / 17) * (25-(-30.5)));
            yy = 0 + (((tickAnim - 20) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 17) * (0-(0)));
        }
        else if (tickAnim >= 37 && tickAnim < 43) {
            xx = 25 + (((tickAnim - 37) / 6) * (-16.5-(25)));
            yy = 0 + (((tickAnim - 37) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 37) / 6) * (0-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 50) {
            xx = -16.5 + (((tickAnim - 43) / 7) * (0-(-16.5)));
            yy = 0 + (((tickAnim - 43) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 43) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg, leftLeg.rotateAngleX + (float) Math.toRadians(xx), leftLeg.rotateAngleY + (float) Math.toRadians(yy), leftLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (29.62-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 29.62 + (((tickAnim - 10) / 10) * (-6.75-(29.62)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 37) {
            xx = -6.75 + (((tickAnim - 20) / 17) * (22.5-(-6.75)));
            yy = 0 + (((tickAnim - 20) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 17) * (0-(0)));
        }
        else if (tickAnim >= 37 && tickAnim < 43) {
            xx = 22.5 + (((tickAnim - 37) / 6) * (30.25-(22.5)));
            yy = 0 + (((tickAnim - 37) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 37) / 6) * (0-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 50) {
            xx = 30.25 + (((tickAnim - 43) / 7) * (0-(30.25)));
            yy = 0 + (((tickAnim - 43) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 43) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg2, leftLeg2.rotateAngleX + (float) Math.toRadians(xx), leftLeg2.rotateAngleY + (float) Math.toRadians(yy), leftLeg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (-24.13-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = -24.13 + (((tickAnim - 10) / 10) * (11.25-(-24.13)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 37) {
            xx = 11.25 + (((tickAnim - 20) / 17) * (21.5-(11.25)));
            yy = 0 + (((tickAnim - 20) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 17) * (0-(0)));
        }
        else if (tickAnim >= 37 && tickAnim < 43) {
            xx = 21.5 + (((tickAnim - 37) / 6) * (-22.75-(21.5)));
            yy = 0 + (((tickAnim - 37) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 37) / 6) * (0-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 50) {
            xx = -22.75 + (((tickAnim - 43) / 7) * (0-(-22.75)));
            yy = 0 + (((tickAnim - 43) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 43) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg3, leftLeg3.rotateAngleX + (float) Math.toRadians(xx), leftLeg3.rotateAngleY + (float) Math.toRadians(yy), leftLeg3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (76.37-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 76.37 + (((tickAnim - 10) / 10) * (26.75-(76.37)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 27) {
            xx = 26.75 + (((tickAnim - 20) / 7) * (-12.3-(26.75)));
            yy = 0 + (((tickAnim - 20) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 7) * (0-(0)));
        }
        else if (tickAnim >= 27 && tickAnim < 37) {
            xx = -12.3 + (((tickAnim - 27) / 10) * (42.25-(-12.3)));
            yy = 0 + (((tickAnim - 27) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 27) / 10) * (0-(0)));
        }
        else if (tickAnim >= 37 && tickAnim < 43) {
            xx = 42.25 + (((tickAnim - 37) / 6) * (68.88-(42.25)));
            yy = 0 + (((tickAnim - 37) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 37) / 6) * (0-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 50) {
            xx = 68.88 + (((tickAnim - 43) / 7) * (0-(68.88)));
            yy = 0 + (((tickAnim - 43) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 43) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg4, leftLeg4.rotateAngleX + (float) Math.toRadians(xx), leftLeg4.rotateAngleY + (float) Math.toRadians(yy), leftLeg4.rotateAngleZ + (float) Math.toRadians(zz));



    }
    public void animGrapple(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraVenetoraptor entity = (EntityPrehistoricFloraVenetoraptor) entitylivingbaseIn;
        int animCycle = 55;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (-28.75-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 23) {
            xx = -28.75 + (((tickAnim - 10) / 13) * (-32.6975-(-28.75)));
            yy = 0 + (((tickAnim - 10) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 13) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 27) {
            xx = -32.6975 + (((tickAnim - 23) / 4) * (-32.6975-(-32.6975)));
            yy = 0 + (((tickAnim - 23) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 4) * (0-(0)));
        }
        else if (tickAnim >= 27 && tickAnim < 31) {
            xx = -32.6975 + (((tickAnim - 27) / 4) * (-32.6975-(-32.6975)));
            yy = 0 + (((tickAnim - 27) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 27) / 4) * (0-(0)));
        }
        else if (tickAnim >= 31 && tickAnim < 40) {
            xx = -32.6975 + (((tickAnim - 31) / 9) * (-32.6975-(-32.6975)));
            yy = 0 + (((tickAnim - 31) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 31) / 9) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 55) {
            xx = -32.6975 + (((tickAnim - 40) / 15) * (0-(-32.6975)));
            yy = 0 + (((tickAnim - 40) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(hips, hips.rotateAngleX + (float) Math.toRadians(xx), hips.rotateAngleY + (float) Math.toRadians(yy), hips.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (-4.4-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (10.85-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 10) / 13) * (0-(0)));
            yy = -4.4 + (((tickAnim - 10) / 13) * (-5.075-(-4.4)));
            zz = 10.85 + (((tickAnim - 10) / 13) * (10.475-(10.85)));
        }
        else if (tickAnim >= 23 && tickAnim < 27) {
            xx = 0 + (((tickAnim - 23) / 4) * (0-(0)));
            yy = -5.075 + (((tickAnim - 23) / 4) * (-0.045-(-5.075)));
            zz = 10.475 + (((tickAnim - 23) / 4) * (9.005-(10.475)));
        }
        else if (tickAnim >= 27 && tickAnim < 31) {
            xx = 0 + (((tickAnim - 27) / 4) * (0-(0)));
            yy = -0.045 + (((tickAnim - 27) / 4) * (-5.075-(-0.045)));
            zz = 9.005 + (((tickAnim - 27) / 4) * (10.475-(9.005)));
        }
        else if (tickAnim >= 31 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 31) / 9) * (0-(0)));
            yy = -5.075 + (((tickAnim - 31) / 9) * (-5.075-(-5.075)));
            zz = 10.475 + (((tickAnim - 31) / 9) * (10.475-(10.475)));
        }
        else if (tickAnim >= 40 && tickAnim < 55) {
            xx = 0 + (((tickAnim - 40) / 15) * (0-(0)));
            yy = -5.075 + (((tickAnim - 40) / 15) * (0-(-5.075)));
            zz = 10.475 + (((tickAnim - 40) / 15) * (0-(10.475)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.hips.rotationPointX = this.hips.rotationPointX + (float)(xx);
        this.hips.rotationPointY = this.hips.rotationPointY - (float)(yy);
        this.hips.rotationPointZ = this.hips.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (-19-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 23) {
            xx = -19 + (((tickAnim - 10) / 13) * (-19-(-19)));
            yy = 0 + (((tickAnim - 10) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 13) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 27) {
            xx = -19 + (((tickAnim - 23) / 4) * (-19-(-19)));
            yy = 0 + (((tickAnim - 23) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 4) * (0-(0)));
        }
        else if (tickAnim >= 27 && tickAnim < 31) {
            xx = -19 + (((tickAnim - 27) / 4) * (-19-(-19)));
            yy = 0 + (((tickAnim - 27) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 27) / 4) * (0-(0)));
        }
        else if (tickAnim >= 31 && tickAnim < 40) {
            xx = -19 + (((tickAnim - 31) / 9) * (-19-(-19)));
            yy = 0 + (((tickAnim - 31) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 31) / 9) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 55) {
            xx = -19 + (((tickAnim - 40) / 15) * (0-(-19)));
            yy = 0 + (((tickAnim - 40) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(xx), body.rotateAngleY + (float) Math.toRadians(yy), body.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0.75-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 10) / 13) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 13) * (0-(0)));
            zz = 0.75 + (((tickAnim - 10) / 13) * (0.75-(0.75)));
        }
        else if (tickAnim >= 23 && tickAnim < 27) {
            xx = 0 + (((tickAnim - 23) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 23) / 4) * (0-(0)));
            zz = 0.75 + (((tickAnim - 23) / 4) * (0.75-(0.75)));
        }
        else if (tickAnim >= 27 && tickAnim < 31) {
            xx = 0 + (((tickAnim - 27) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 27) / 4) * (0-(0)));
            zz = 0.75 + (((tickAnim - 27) / 4) * (0.75-(0.75)));
        }
        else if (tickAnim >= 31 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 31) / 9) * (0-(0)));
            yy = 0 + (((tickAnim - 31) / 9) * (0-(0)));
            zz = 0.75 + (((tickAnim - 31) / 9) * (0.75-(0.75)));
        }
        else if (tickAnim >= 40 && tickAnim < 55) {
            xx = 0 + (((tickAnim - 40) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 40) / 15) * (0-(0)));
            zz = 0.75 + (((tickAnim - 40) / 15) * (0-(0.75)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.body.rotationPointX = this.body.rotationPointX + (float)(xx);
        this.body.rotationPointY = this.body.rotationPointY - (float)(yy);
        this.body.rotationPointZ = this.body.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (-9.5-Math.sin((Math.PI/180)*(((double)tickAnim/20)*1400))*1-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 23) {
            xx = -9.5-Math.sin((Math.PI/180)*(((double)tickAnim/20)*1400))*1 + (((tickAnim - 10) / 13) * (-9.5-Math.sin((Math.PI/180)*(((double)tickAnim/20)*1400))*1-(-9.5-Math.sin((Math.PI/180)*(((double)tickAnim/20)*1400))*1)));
            yy = 0 + (((tickAnim - 10) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 13) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 27) {
            xx = -9.5-Math.sin((Math.PI/180)*(((double)tickAnim/20)*1400))*1 + (((tickAnim - 23) / 4) * (-9.5-Math.sin((Math.PI/180)*(((double)tickAnim/20)*1400))*1-(-9.5-Math.sin((Math.PI/180)*(((double)tickAnim/20)*1400))*1)));
            yy = 0 + (((tickAnim - 23) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 4) * (0-(0)));
        }
        else if (tickAnim >= 27 && tickAnim < 31) {
            xx = -9.5-Math.sin((Math.PI/180)*(((double)tickAnim/20)*1400))*1 + (((tickAnim - 27) / 4) * (-9.5-Math.sin((Math.PI/180)*(((double)tickAnim/20)*1400))*1-(-9.5-Math.sin((Math.PI/180)*(((double)tickAnim/20)*1400))*1)));
            yy = 0 + (((tickAnim - 27) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 27) / 4) * (0-(0)));
        }
        else if (tickAnim >= 31 && tickAnim < 40) {
            xx = -9.5-Math.sin((Math.PI/180)*(((double)tickAnim/20)*1400))*1 + (((tickAnim - 31) / 9) * (-9.5-Math.sin((Math.PI/180)*(((double)tickAnim/20)*1400))*1-(-9.5-Math.sin((Math.PI/180)*(((double)tickAnim/20)*1400))*1)));
            yy = 0 + (((tickAnim - 31) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 31) / 9) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 55) {
            xx = -9.5-Math.sin((Math.PI/180)*(((double)tickAnim/20)*1400))*1 + (((tickAnim - 40) / 15) * (0-(-9.5-Math.sin((Math.PI/180)*(((double)tickAnim/20)*1400))*1)));
            yy = 0 + (((tickAnim - 40) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(xx), chest.rotateAngleY + (float) Math.toRadians(yy), chest.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (-15.6978824557-Math.sin((Math.PI/180)*(((double)tickAnim/20)*1400))*1-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (-10.14623-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (-63.34974-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 23) {
            xx = -15.6978824557-Math.sin((Math.PI/180)*(((double)tickAnim/20)*1400))*1 + (((tickAnim - 10) / 13) * (-15.6978824557-Math.sin((Math.PI/180)*(((double)tickAnim/20)*1400))*1-(-15.6978824557-Math.sin((Math.PI/180)*(((double)tickAnim/20)*1400))*1)));
            yy = -10.14623 + (((tickAnim - 10) / 13) * (-10.14623-(-10.14623)));
            zz = -63.34974 + (((tickAnim - 10) / 13) * (-63.34974-(-63.34974)));
        }
        else if (tickAnim >= 23 && tickAnim < 27) {
            xx = -15.6978824557-Math.sin((Math.PI/180)*(((double)tickAnim/20)*1400))*1 + (((tickAnim - 23) / 4) * (53.25-(-15.6978824557-Math.sin((Math.PI/180)*(((double)tickAnim/20)*1400))*1)));
            yy = -10.14623 + (((tickAnim - 23) / 4) * (0-(-10.14623)));
            zz = -63.34974 + (((tickAnim - 23) / 4) * (0-(-63.34974)));
        }
        else if (tickAnim >= 27 && tickAnim < 31) {
            xx = 53.25 + (((tickAnim - 27) / 4) * (-15.6978824557-Math.sin((Math.PI/180)*(((double)tickAnim/20)*1400))*1-(53.25)));
            yy = 0 + (((tickAnim - 27) / 4) * (-10.14623-(0)));
            zz = 0 + (((tickAnim - 27) / 4) * (-63.34974-(0)));
        }
        else if (tickAnim >= 31 && tickAnim < 40) {
            xx = -15.6978824557-Math.sin((Math.PI/180)*(((double)tickAnim/20)*1400))*1 + (((tickAnim - 31) / 9) * (-15.6978824557-Math.sin((Math.PI/180)*(((double)tickAnim/20)*1400))*1-(-15.6978824557-Math.sin((Math.PI/180)*(((double)tickAnim/20)*1400))*1)));
            yy = -10.14623 + (((tickAnim - 31) / 9) * (-10.14623-(-10.14623)));
            zz = -63.34974 + (((tickAnim - 31) / 9) * (-63.34974-(-63.34974)));
        }
        else if (tickAnim >= 40 && tickAnim < 55) {
            xx = -15.6978824557-Math.sin((Math.PI/180)*(((double)tickAnim/20)*1400))*1 + (((tickAnim - 40) / 15) * (0-(-15.6978824557-Math.sin((Math.PI/180)*(((double)tickAnim/20)*1400))*1)));
            yy = -10.14623 + (((tickAnim - 40) / 15) * (0-(-10.14623)));
            zz = -63.34974 + (((tickAnim - 40) / 15) * (0-(-63.34974)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm, leftArm.rotateAngleX + (float) Math.toRadians(xx), leftArm.rotateAngleY + (float) Math.toRadians(yy), leftArm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (60.25-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 23) {
            xx = 60.25 + (((tickAnim - 10) / 13) * (60.25-(60.25)));
            yy = 0 + (((tickAnim - 10) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 13) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 27) {
            xx = 60.25 + (((tickAnim - 23) / 4) * (40-(60.25)));
            yy = 0 + (((tickAnim - 23) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 4) * (0-(0)));
        }
        else if (tickAnim >= 27 && tickAnim < 31) {
            xx = 40 + (((tickAnim - 27) / 4) * (60.25-(40)));
            yy = 0 + (((tickAnim - 27) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 27) / 4) * (0-(0)));
        }
        else if (tickAnim >= 31 && tickAnim < 40) {
            xx = 60.25 + (((tickAnim - 31) / 9) * (60.25-(60.25)));
            yy = 0 + (((tickAnim - 31) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 31) / 9) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 55) {
            xx = 60.25 + (((tickAnim - 40) / 15) * (0-(60.25)));
            yy = 0 + (((tickAnim - 40) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm2, leftArm2.rotateAngleX + (float) Math.toRadians(xx), leftArm2.rotateAngleY + (float) Math.toRadians(yy), leftArm2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (-15.6978824557-Math.sin((Math.PI/180)*(((double)tickAnim/20)*1400))*1-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (10.14623-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (63.34974-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 23) {
            xx = -15.6978824557-Math.sin((Math.PI/180)*(((double)tickAnim/20)*1400))*1 + (((tickAnim - 10) / 13) * (-15.6978824557-Math.sin((Math.PI/180)*(((double)tickAnim/20)*1400))*1-(-15.6978824557-Math.sin((Math.PI/180)*(((double)tickAnim/20)*1400))*1)));
            yy = 10.14623 + (((tickAnim - 10) / 13) * (10.14623-(10.14623)));
            zz = 63.34974 + (((tickAnim - 10) / 13) * (63.34974-(63.34974)));
        }
        else if (tickAnim >= 23 && tickAnim < 27) {
            xx = -15.6978824557-Math.sin((Math.PI/180)*(((double)tickAnim/20)*1400))*1 + (((tickAnim - 23) / 4) * (53.25-(-15.6978824557-Math.sin((Math.PI/180)*(((double)tickAnim/20)*1400))*1)));
            yy = 10.14623 + (((tickAnim - 23) / 4) * (0-(10.14623)));
            zz = 63.34974 + (((tickAnim - 23) / 4) * (0-(63.34974)));
        }
        else if (tickAnim >= 27 && tickAnim < 31) {
            xx = 53.25 + (((tickAnim - 27) / 4) * (-15.6978824557-Math.sin((Math.PI/180)*(((double)tickAnim/20)*1400))*1-(53.25)));
            yy = 0 + (((tickAnim - 27) / 4) * (10.14623-(0)));
            zz = 0 + (((tickAnim - 27) / 4) * (63.34974-(0)));
        }
        else if (tickAnim >= 31 && tickAnim < 40) {
            xx = -15.6978824557-Math.sin((Math.PI/180)*(((double)tickAnim/20)*1400))*1 + (((tickAnim - 31) / 9) * (-15.6978824557-Math.sin((Math.PI/180)*(((double)tickAnim/20)*1400))*1-(-15.6978824557-Math.sin((Math.PI/180)*(((double)tickAnim/20)*1400))*1)));
            yy = 10.14623 + (((tickAnim - 31) / 9) * (10.14623-(10.14623)));
            zz = 63.34974 + (((tickAnim - 31) / 9) * (63.34974-(63.34974)));
        }
        else if (tickAnim >= 40 && tickAnim < 55) {
            xx = -15.6978824557-Math.sin((Math.PI/180)*(((double)tickAnim/20)*1400))*1 + (((tickAnim - 40) / 15) * (0-(-15.6978824557-Math.sin((Math.PI/180)*(((double)tickAnim/20)*1400))*1)));
            yy = 10.14623 + (((tickAnim - 40) / 15) * (0-(10.14623)));
            zz = 63.34974 + (((tickAnim - 40) / 15) * (0-(63.34974)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm, rightArm.rotateAngleX + (float) Math.toRadians(xx), rightArm.rotateAngleY + (float) Math.toRadians(yy), rightArm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (60.25-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 23) {
            xx = 60.25 + (((tickAnim - 10) / 13) * (60.25-(60.25)));
            yy = 0 + (((tickAnim - 10) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 13) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 27) {
            xx = 60.25 + (((tickAnim - 23) / 4) * (40-(60.25)));
            yy = 0 + (((tickAnim - 23) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 4) * (0-(0)));
        }
        else if (tickAnim >= 27 && tickAnim < 31) {
            xx = 40 + (((tickAnim - 27) / 4) * (60.25-(40)));
            yy = 0 + (((tickAnim - 27) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 27) / 4) * (0-(0)));
        }
        else if (tickAnim >= 31 && tickAnim < 40) {
            xx = 60.25 + (((tickAnim - 31) / 9) * (60.25-(60.25)));
            yy = 0 + (((tickAnim - 31) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 31) / 9) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 55) {
            xx = 60.25 + (((tickAnim - 40) / 15) * (0-(60.25)));
            yy = 0 + (((tickAnim - 40) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm2, rightArm2.rotateAngleX + (float) Math.toRadians(xx), rightArm2.rotateAngleY + (float) Math.toRadians(yy), rightArm2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (-21-Math.sin((Math.PI/180)*(((double)tickAnim/20)*1400))*-1-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 23) {
            xx = -21-Math.sin((Math.PI/180)*(((double)tickAnim/20)*1400))*-1 + (((tickAnim - 10) / 13) * (-36.25-Math.sin((Math.PI/180)*(((double)tickAnim/20)*1400))*-1-(-21-Math.sin((Math.PI/180)*(((double)tickAnim/20)*1400))*-1)));
            yy = 0 + (((tickAnim - 10) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 13) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 27) {
            xx = -36.25-Math.sin((Math.PI/180)*(((double)tickAnim/20)*1400))*-1 + (((tickAnim - 23) / 4) * (6-Math.sin((Math.PI/180)*(((double)tickAnim/20)*1400))*-1-(-36.25-Math.sin((Math.PI/180)*(((double)tickAnim/20)*1400))*-1)));
            yy = 0 + (((tickAnim - 23) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 4) * (0-(0)));
        }
        else if (tickAnim >= 27 && tickAnim < 31) {
            xx = 6-Math.sin((Math.PI/180)*(((double)tickAnim/20)*1400))*-1 + (((tickAnim - 27) / 4) * (-14.25-Math.sin((Math.PI/180)*(((double)tickAnim/20)*1400))*-1-(6-Math.sin((Math.PI/180)*(((double)tickAnim/20)*1400))*-1)));
            yy = 0 + (((tickAnim - 27) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 27) / 4) * (0-(0)));
        }
        else if (tickAnim >= 31 && tickAnim < 40) {
            xx = -14.25-Math.sin((Math.PI/180)*(((double)tickAnim/20)*1400))*-1 + (((tickAnim - 31) / 9) * (-32.5-Math.sin((Math.PI/180)*(((double)tickAnim/20)*1400))*-1-(-14.25-Math.sin((Math.PI/180)*(((double)tickAnim/20)*1400))*-1)));
            yy = 0 + (((tickAnim - 31) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 31) / 9) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 55) {
            xx = -32.5-Math.sin((Math.PI/180)*(((double)tickAnim/20)*1400))*-1 + (((tickAnim - 40) / 15) * (0-(-32.5-Math.sin((Math.PI/180)*(((double)tickAnim/20)*1400))*-1)));
            yy = 0 + (((tickAnim - 40) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(xx), neck3.rotateAngleY + (float) Math.toRadians(yy), neck3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (18.75-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 23) {
            xx = 18.75 + (((tickAnim - 10) / 13) * (28-(18.75)));
            yy = 0 + (((tickAnim - 10) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 13) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 27) {
            xx = 28 + (((tickAnim - 23) / 4) * (18.75-(28)));
            yy = 0 + (((tickAnim - 23) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 4) * (0-(0)));
        }
        else if (tickAnim >= 27 && tickAnim < 31) {
            xx = 18.75 + (((tickAnim - 27) / 4) * (18.75-(18.75)));
            yy = 0 + (((tickAnim - 27) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 27) / 4) * (0-(0)));
        }
        else if (tickAnim >= 31 && tickAnim < 40) {
            xx = 18.75 + (((tickAnim - 31) / 9) * (33.75-(18.75)));
            yy = 0 + (((tickAnim - 31) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 31) / 9) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 55) {
            xx = 33.75 + (((tickAnim - 40) / 15) * (0-(33.75)));
            yy = 0 + (((tickAnim - 40) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(xx), neck2.rotateAngleY + (float) Math.toRadians(yy), neck2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 0) / 23) * (7.42-(0)));
            yy = 0 + (((tickAnim - 0) / 23) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 23) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 27) {
            xx = 7.42 + (((tickAnim - 23) / 4) * (-23.5-(7.42)));
            yy = 0 + (((tickAnim - 23) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 4) * (0-(0)));
        }
        else if (tickAnim >= 27 && tickAnim < 31) {
            xx = -23.5 + (((tickAnim - 27) / 4) * (0-(-23.5)));
            yy = 0 + (((tickAnim - 27) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 27) / 4) * (0-(0)));
        }
        else if (tickAnim >= 31 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 31) / 9) * (0-(0)));
            yy = 0 + (((tickAnim - 31) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 31) / 9) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 55) {
            xx = 0 + (((tickAnim - 40) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 40) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(xx), neck.rotateAngleY + (float) Math.toRadians(yy), neck.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 0) / 23) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 23) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 23) * (0.1-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 31) {
            xx = 0 + (((tickAnim - 23) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 23) / 8) * (0-(0)));
            zz = 0.1 + (((tickAnim - 23) / 8) * (0-(0.1)));
        }
        else if (tickAnim >= 31 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 31) / 9) * (0-(0)));
            yy = 0 + (((tickAnim - 31) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 31) / 9) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 55) {
            xx = 0 + (((tickAnim - 40) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 40) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 15) * (0-(0)));
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
            xx = 0 + (((tickAnim - 0) / 10) * (27.75-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 23) {
            xx = 27.75 + (((tickAnim - 10) / 13) * (0-(27.75)));
            yy = 0 + (((tickAnim - 10) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 13) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 27) {
            xx = 0 + (((tickAnim - 23) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 23) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 4) * (0-(0)));
        }
        else if (tickAnim >= 27 && tickAnim < 31) {
            xx = 0 + (((tickAnim - 27) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 27) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 27) / 4) * (0-(0)));
        }
        else if (tickAnim >= 31 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 31) / 9) * (0-(0)));
            yy = 0 + (((tickAnim - 31) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 31) / 9) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 55) {
            xx = 0 + (((tickAnim - 40) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 40) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0.25-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 55) {
            xx = 0 + (((tickAnim - 10) / 45) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 45) * (0-(0)));
            zz = 0.25 + (((tickAnim - 10) / 45) * (0-(0.25)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.head.rotationPointX = this.head.rotationPointX + (float)(xx);
        this.head.rotationPointY = this.head.rotationPointY - (float)(yy);
        this.head.rotationPointZ = this.head.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (16.25-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 23) {
            xx = 16.25 + (((tickAnim - 10) / 13) * (27.5-(16.25)));
            yy = 0 + (((tickAnim - 10) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 13) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 27) {
            xx = 27.5 + (((tickAnim - 23) / 4) * (0-(27.5)));
            yy = 0 + (((tickAnim - 23) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 4) * (0-(0)));
        }
        else if (tickAnim >= 27 && tickAnim < 31) {
            xx = 0 + (((tickAnim - 27) / 4) * (27.5-(0)));
            yy = 0 + (((tickAnim - 27) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 27) / 4) * (0-(0)));
        }
        else if (tickAnim >= 31 && tickAnim < 40) {
            xx = 27.5 + (((tickAnim - 31) / 9) * (27.5-(27.5)));
            yy = 0 + (((tickAnim - 31) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 31) / 9) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 55) {
            xx = 27.5 + (((tickAnim - 40) / 15) * (0-(27.5)));
            yy = 0 + (((tickAnim - 40) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(xx), jaw.rotateAngleY + (float) Math.toRadians(yy), jaw.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (20.5-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (-0-Math.sin((Math.PI/180)*(((double)tickAnim/20)*1200))*1-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 23) {
            xx = 20.5 + (((tickAnim - 10) / 13) * (20.5-(20.5)));
            yy = -0-Math.sin((Math.PI/180)*(((double)tickAnim/20)*1200))*1 + (((tickAnim - 10) / 13) * (-0-Math.sin((Math.PI/180)*(((double)tickAnim/20)*1200))*1-(-0-Math.sin((Math.PI/180)*(((double)tickAnim/20)*1200))*1)));
            zz = 0 + (((tickAnim - 10) / 13) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 27) {
            xx = 20.5 + (((tickAnim - 23) / 4) * (0-(20.5)));
            yy = -0-Math.sin((Math.PI/180)*(((double)tickAnim/20)*1200))*1 + (((tickAnim - 23) / 4) * (0-(-0-Math.sin((Math.PI/180)*(((double)tickAnim/20)*1200))*1)));
            zz = 0 + (((tickAnim - 23) / 4) * (0-(0)));
        }
        else if (tickAnim >= 27 && tickAnim < 31) {
            xx = 0 + (((tickAnim - 27) / 4) * (20.5-(0)));
            yy = 0 + (((tickAnim - 27) / 4) * (-0-Math.sin((Math.PI/180)*(((double)tickAnim/20)*1200))*1-(0)));
            zz = 0 + (((tickAnim - 27) / 4) * (0-(0)));
        }
        else if (tickAnim >= 31 && tickAnim < 40) {
            xx = 20.5 + (((tickAnim - 31) / 9) * (20.5-(20.5)));
            yy = -0-Math.sin((Math.PI/180)*(((double)tickAnim/20)*1200))*1 + (((tickAnim - 31) / 9) * (-0-Math.sin((Math.PI/180)*(((double)tickAnim/20)*1200))*1-(-0-Math.sin((Math.PI/180)*(((double)tickAnim/20)*1200))*1)));
            zz = 0 + (((tickAnim - 31) / 9) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 55) {
            xx = 20.5 + (((tickAnim - 40) / 15) * (0-(20.5)));
            yy = -0-Math.sin((Math.PI/180)*(((double)tickAnim/20)*1200))*1 + (((tickAnim - 40) / 15) * (0-(-0-Math.sin((Math.PI/180)*(((double)tickAnim/20)*1200))*1)));
            zz = 0 + (((tickAnim - 40) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail, tail.rotateAngleX + (float) Math.toRadians(xx), tail.rotateAngleY + (float) Math.toRadians(yy), tail.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (6.5-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (-0-Math.sin((Math.PI/180)*(((double)tickAnim/20)*1200-50))*2-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 23) {
            xx = 6.5 + (((tickAnim - 10) / 13) * (6.5-(6.5)));
            yy = -0-Math.sin((Math.PI/180)*(((double)tickAnim/20)*1200-50))*2 + (((tickAnim - 10) / 13) * (-0-Math.sin((Math.PI/180)*(((double)tickAnim/20)*1200-50))*2-(-0-Math.sin((Math.PI/180)*(((double)tickAnim/20)*1200-50))*2)));
            zz = 0 + (((tickAnim - 10) / 13) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 27) {
            xx = 6.5 + (((tickAnim - 23) / 4) * (0-(6.5)));
            yy = -0-Math.sin((Math.PI/180)*(((double)tickAnim/20)*1200-50))*2 + (((tickAnim - 23) / 4) * (0-(-0-Math.sin((Math.PI/180)*(((double)tickAnim/20)*1200-50))*2)));
            zz = 0 + (((tickAnim - 23) / 4) * (0-(0)));
        }
        else if (tickAnim >= 27 && tickAnim < 31) {
            xx = 0 + (((tickAnim - 27) / 4) * (6.5-(0)));
            yy = 0 + (((tickAnim - 27) / 4) * (-0-Math.sin((Math.PI/180)*(((double)tickAnim/20)*1200-50))*2-(0)));
            zz = 0 + (((tickAnim - 27) / 4) * (0-(0)));
        }
        else if (tickAnim >= 31 && tickAnim < 40) {
            xx = 6.5 + (((tickAnim - 31) / 9) * (6.5-(6.5)));
            yy = -0-Math.sin((Math.PI/180)*(((double)tickAnim/20)*1200-50))*2 + (((tickAnim - 31) / 9) * (-0-Math.sin((Math.PI/180)*(((double)tickAnim/20)*1200-50))*2-(-0-Math.sin((Math.PI/180)*(((double)tickAnim/20)*1200-50))*2)));
            zz = 0 + (((tickAnim - 31) / 9) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 55) {
            xx = 6.5 + (((tickAnim - 40) / 15) * (0-(6.5)));
            yy = -0-Math.sin((Math.PI/180)*(((double)tickAnim/20)*1200-50))*2 + (((tickAnim - 40) / 15) * (0-(-0-Math.sin((Math.PI/180)*(((double)tickAnim/20)*1200-50))*2)));
            zz = 0 + (((tickAnim - 40) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(xx), tail2.rotateAngleY + (float) Math.toRadians(yy), tail2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (18.75-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (-0-Math.sin((Math.PI/180)*(((double)tickAnim/20)*1200-100))*3-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 23) {
            xx = 18.75 + (((tickAnim - 10) / 13) * (18.75-(18.75)));
            yy = -0-Math.sin((Math.PI/180)*(((double)tickAnim/20)*1200-100))*3 + (((tickAnim - 10) / 13) * (-0-Math.sin((Math.PI/180)*(((double)tickAnim/20)*1200-100))*3-(-0-Math.sin((Math.PI/180)*(((double)tickAnim/20)*1200-100))*3)));
            zz = 0 + (((tickAnim - 10) / 13) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 27) {
            xx = 18.75 + (((tickAnim - 23) / 4) * (0-(18.75)));
            yy = -0-Math.sin((Math.PI/180)*(((double)tickAnim/20)*1200-100))*3 + (((tickAnim - 23) / 4) * (0-(-0-Math.sin((Math.PI/180)*(((double)tickAnim/20)*1200-100))*3)));
            zz = 0 + (((tickAnim - 23) / 4) * (0-(0)));
        }
        else if (tickAnim >= 27 && tickAnim < 31) {
            xx = 0 + (((tickAnim - 27) / 4) * (18.75-(0)));
            yy = 0 + (((tickAnim - 27) / 4) * (-0-Math.sin((Math.PI/180)*(((double)tickAnim/20)*1200-100))*3-(0)));
            zz = 0 + (((tickAnim - 27) / 4) * (0-(0)));
        }
        else if (tickAnim >= 31 && tickAnim < 40) {
            xx = 18.75 + (((tickAnim - 31) / 9) * (18.75-(18.75)));
            yy = -0-Math.sin((Math.PI/180)*(((double)tickAnim/20)*1200-100))*3 + (((tickAnim - 31) / 9) * (-0-Math.sin((Math.PI/180)*(((double)tickAnim/20)*1200-100))*3-(-0-Math.sin((Math.PI/180)*(((double)tickAnim/20)*1200-100))*3)));
            zz = 0 + (((tickAnim - 31) / 9) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 55) {
            xx = 18.75 + (((tickAnim - 40) / 15) * (0-(18.75)));
            yy = -0-Math.sin((Math.PI/180)*(((double)tickAnim/20)*1200-100))*3 + (((tickAnim - 40) / 15) * (0-(-0-Math.sin((Math.PI/180)*(((double)tickAnim/20)*1200-100))*3)));
            zz = 0 + (((tickAnim - 40) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(xx), tail3.rotateAngleY + (float) Math.toRadians(yy), tail3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (17.5-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (-0-Math.sin((Math.PI/180)*(((double)tickAnim/20)*1200-150))*4-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 23) {
            xx = 17.5 + (((tickAnim - 10) / 13) * (17.5-(17.5)));
            yy = -0-Math.sin((Math.PI/180)*(((double)tickAnim/20)*1200-150))*4 + (((tickAnim - 10) / 13) * (-0-Math.sin((Math.PI/180)*(((double)tickAnim/20)*1200-150))*4-(-0-Math.sin((Math.PI/180)*(((double)tickAnim/20)*1200-150))*4)));
            zz = 0 + (((tickAnim - 10) / 13) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 27) {
            xx = 17.5 + (((tickAnim - 23) / 4) * (0-(17.5)));
            yy = -0-Math.sin((Math.PI/180)*(((double)tickAnim/20)*1200-150))*4 + (((tickAnim - 23) / 4) * (0-(-0-Math.sin((Math.PI/180)*(((double)tickAnim/20)*1200-150))*4)));
            zz = 0 + (((tickAnim - 23) / 4) * (0-(0)));
        }
        else if (tickAnim >= 27 && tickAnim < 31) {
            xx = 0 + (((tickAnim - 27) / 4) * (17.5-(0)));
            yy = 0 + (((tickAnim - 27) / 4) * (-0-Math.sin((Math.PI/180)*(((double)tickAnim/20)*1200-150))*4-(0)));
            zz = 0 + (((tickAnim - 27) / 4) * (0-(0)));
        }
        else if (tickAnim >= 31 && tickAnim < 40) {
            xx = 17.5 + (((tickAnim - 31) / 9) * (17.5-(17.5)));
            yy = -0-Math.sin((Math.PI/180)*(((double)tickAnim/20)*1200-150))*4 + (((tickAnim - 31) / 9) * (-0-Math.sin((Math.PI/180)*(((double)tickAnim/20)*1200-150))*4-(-0-Math.sin((Math.PI/180)*(((double)tickAnim/20)*1200-150))*4)));
            zz = 0 + (((tickAnim - 31) / 9) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 55) {
            xx = 17.5 + (((tickAnim - 40) / 15) * (0-(17.5)));
            yy = -0-Math.sin((Math.PI/180)*(((double)tickAnim/20)*1200-150))*4 + (((tickAnim - 40) / 15) * (0-(-0-Math.sin((Math.PI/180)*(((double)tickAnim/20)*1200-150))*4)));
            zz = 0 + (((tickAnim - 40) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(xx), tail4.rotateAngleY + (float) Math.toRadians(yy), tail4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (-22.5-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = -22.5 + (((tickAnim - 5) / 5) * (3.75-(-22.5)));
            yy = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 5) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 23) {
            xx = 3.75 + (((tickAnim - 10) / 13) * (7.75-(3.75)));
            yy = 0 + (((tickAnim - 10) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 13) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 27) {
            xx = 7.75 + (((tickAnim - 23) / 4) * (25.25-(7.75)));
            yy = 0 + (((tickAnim - 23) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 4) * (0-(0)));
        }
        else if (tickAnim >= 27 && tickAnim < 31) {
            xx = 25.25 + (((tickAnim - 27) / 4) * (7.75-(25.25)));
            yy = 0 + (((tickAnim - 27) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 27) / 4) * (0-(0)));
        }
        else if (tickAnim >= 31 && tickAnim < 40) {
            xx = 7.75 + (((tickAnim - 31) / 9) * (7.75-(7.75)));
            yy = 0 + (((tickAnim - 31) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 31) / 9) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 43) {
            xx = 7.75 + (((tickAnim - 40) / 3) * (-22.91-(7.75)));
            yy = 0 + (((tickAnim - 40) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 3) * (0-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 45) {
            xx = -22.91 + (((tickAnim - 43) / 2) * (-17.08-(-22.91)));
            yy = 0 + (((tickAnim - 43) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 43) / 2) * (0-(0)));
        }
        else if (tickAnim >= 45 && tickAnim < 55) {
            xx = -17.08 + (((tickAnim - 45) / 10) * (0-(-17.08)));
            yy = 0 + (((tickAnim - 45) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 45) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg, leftLeg.rotateAngleX + (float) Math.toRadians(xx), leftLeg.rotateAngleY + (float) Math.toRadians(yy), leftLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 5) / 3) * (21.87-(0)));
            yy = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 3) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 21.87 + (((tickAnim - 8) / 2) * (20.75-(21.87)));
            yy = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 2) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 23) {
            xx = 20.75 + (((tickAnim - 10) / 13) * (26.75-(20.75)));
            yy = 0 + (((tickAnim - 10) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 13) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 27) {
            xx = 26.75 + (((tickAnim - 23) / 4) * (0-(26.75)));
            yy = 0 + (((tickAnim - 23) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 4) * (0-(0)));
        }
        else if (tickAnim >= 27 && tickAnim < 31) {
            xx = 0 + (((tickAnim - 27) / 4) * (26.75-(0)));
            yy = 0 + (((tickAnim - 27) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 27) / 4) * (0-(0)));
        }
        else if (tickAnim >= 31 && tickAnim < 40) {
            xx = 26.75 + (((tickAnim - 31) / 9) * (26.75-(26.75)));
            yy = 0 + (((tickAnim - 31) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 31) / 9) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 43) {
            xx = 26.75 + (((tickAnim - 40) / 3) * (28.62-(26.75)));
            yy = 0 + (((tickAnim - 40) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 3) * (0-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 45) {
            xx = 28.62 + (((tickAnim - 43) / 2) * (9-(28.62)));
            yy = 0 + (((tickAnim - 43) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 43) / 2) * (0-(0)));
        }
        else if (tickAnim >= 45 && tickAnim < 55) {
            xx = 9 + (((tickAnim - 45) / 10) * (0-(9)));
            yy = 0 + (((tickAnim - 45) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 45) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg2, leftLeg2.rotateAngleX + (float) Math.toRadians(xx), leftLeg2.rotateAngleY + (float) Math.toRadians(yy), leftLeg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 10 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 10) / 13) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 13) * (-0.375-(0)));
            zz = 0 + (((tickAnim - 10) / 13) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 27) {
            xx = 0 + (((tickAnim - 23) / 4) * (0-(0)));
            yy = -0.375 + (((tickAnim - 23) / 4) * (0-(-0.375)));
            zz = 0 + (((tickAnim - 23) / 4) * (0-(0)));
        }
        else if (tickAnim >= 27 && tickAnim < 31) {
            xx = 0 + (((tickAnim - 27) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 27) / 4) * (-0.375-(0)));
            zz = 0 + (((tickAnim - 27) / 4) * (0-(0)));
        }
        else if (tickAnim >= 31 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 31) / 9) * (0-(0)));
            yy = -0.375 + (((tickAnim - 31) / 9) * (-0.375-(-0.375)));
            zz = 0 + (((tickAnim - 31) / 9) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 45) {
            xx = 0 + (((tickAnim - 40) / 5) * (0-(0)));
            yy = -0.375 + (((tickAnim - 40) / 5) * (0-(-0.375)));
            zz = 0 + (((tickAnim - 40) / 5) * (0-(0)));
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
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 5) / 3) * (-44.5-(0)));
            yy = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 3) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = -44.5 + (((tickAnim - 8) / 2) * (-40.5-(-44.5)));
            yy = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 2) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 23) {
            xx = -40.5 + (((tickAnim - 10) / 13) * (-49.5-(-40.5)));
            yy = 0 + (((tickAnim - 10) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 13) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 27) {
            xx = -49.5 + (((tickAnim - 23) / 4) * (0-(-49.5)));
            yy = 0 + (((tickAnim - 23) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 4) * (0-(0)));
        }
        else if (tickAnim >= 27 && tickAnim < 31) {
            xx = 0 + (((tickAnim - 27) / 4) * (-49.5-(0)));
            yy = 0 + (((tickAnim - 27) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 27) / 4) * (0-(0)));
        }
        else if (tickAnim >= 31 && tickAnim < 40) {
            xx = -49.5 + (((tickAnim - 31) / 9) * (-49.5-(-49.5)));
            yy = 0 + (((tickAnim - 31) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 31) / 9) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 43) {
            xx = -49.5 + (((tickAnim - 40) / 3) * (-48.5-(-49.5)));
            yy = 0 + (((tickAnim - 40) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 3) * (0-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 45) {
            xx = -48.5 + (((tickAnim - 43) / 2) * (-7.25-(-48.5)));
            yy = 0 + (((tickAnim - 43) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 43) / 2) * (0-(0)));
        }
        else if (tickAnim >= 45 && tickAnim < 55) {
            xx = -7.25 + (((tickAnim - 45) / 10) * (0-(-7.25)));
            yy = 0 + (((tickAnim - 45) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 45) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg3, leftLeg3.rotateAngleX + (float) Math.toRadians(xx), leftLeg3.rotateAngleY + (float) Math.toRadians(yy), leftLeg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 10 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 10) / 13) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 13) * (-0.225-(0)));
            zz = 0 + (((tickAnim - 10) / 13) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 27) {
            xx = 0 + (((tickAnim - 23) / 4) * (0-(0)));
            yy = -0.225 + (((tickAnim - 23) / 4) * (0-(-0.225)));
            zz = 0 + (((tickAnim - 23) / 4) * (0-(0)));
        }
        else if (tickAnim >= 27 && tickAnim < 31) {
            xx = 0 + (((tickAnim - 27) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 27) / 4) * (-0.225-(0)));
            zz = 0 + (((tickAnim - 27) / 4) * (0-(0)));
        }
        else if (tickAnim >= 31 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 31) / 9) * (0-(0)));
            yy = -0.225 + (((tickAnim - 31) / 9) * (-0.225-(-0.225)));
            zz = 0 + (((tickAnim - 31) / 9) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 55) {
            xx = 0 + (((tickAnim - 40) / 15) * (0-(0)));
            yy = -0.225 + (((tickAnim - 40) / 15) * (0-(-0.225)));
            zz = 0 + (((tickAnim - 40) / 15) * (0-(0)));
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
            xx = 0 + (((tickAnim - 0) / 5) * (31.75-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 31.75 + (((tickAnim - 5) / 3) * (72.62-(31.75)));
            yy = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 3) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 72.62 + (((tickAnim - 8) / 2) * (46-(72.62)));
            yy = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 2) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 23) {
            xx = 46 + (((tickAnim - 10) / 13) * (49.75-(46)));
            yy = 0 + (((tickAnim - 10) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 13) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 27) {
            xx = 49.75 + (((tickAnim - 23) / 4) * (7-(49.75)));
            yy = 0 + (((tickAnim - 23) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 4) * (0-(0)));
        }
        else if (tickAnim >= 27 && tickAnim < 31) {
            xx = 7 + (((tickAnim - 27) / 4) * (49.75-(7)));
            yy = 0 + (((tickAnim - 27) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 27) / 4) * (0-(0)));
        }
        else if (tickAnim >= 31 && tickAnim < 40) {
            xx = 49.75 + (((tickAnim - 31) / 9) * (49.75-(49.75)));
            yy = 0 + (((tickAnim - 31) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 31) / 9) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 43) {
            xx = 49.75 + (((tickAnim - 40) / 3) * (88.33-(49.75)));
            yy = 0 + (((tickAnim - 40) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 3) * (0-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 45) {
            xx = 88.33 + (((tickAnim - 43) / 2) * (40.42-(88.33)));
            yy = 0 + (((tickAnim - 43) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 43) / 2) * (0-(0)));
        }
        else if (tickAnim >= 45 && tickAnim < 55) {
            xx = 40.42 + (((tickAnim - 45) / 10) * (0-(40.42)));
            yy = 0 + (((tickAnim - 45) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 45) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg4, leftLeg4.rotateAngleX + (float) Math.toRadians(xx), leftLeg4.rotateAngleY + (float) Math.toRadians(yy), leftLeg4.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 5) / 3) * (0.975-(0)));
            zz = 0 + (((tickAnim - 5) / 3) * (-0.475-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            yy = 0.975 + (((tickAnim - 8) / 2) * (0-(0.975)));
            zz = -0.475 + (((tickAnim - 8) / 2) * (0-(-0.475)));
        }
        else if (tickAnim >= 10 && tickAnim < 45) {
            xx = 0 + (((tickAnim - 10) / 35) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 35) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 35) * (0-(0)));
        }
        else if (tickAnim >= 45 && tickAnim < 49) {
            xx = 0 + (((tickAnim - 45) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 45) / 4) * (1.05-(0)));
            zz = 0 + (((tickAnim - 45) / 4) * (0-(0)));
        }
        else if (tickAnim >= 49 && tickAnim < 55) {
            xx = 0 + (((tickAnim - 49) / 6) * (0-(0)));
            yy = 1.05 + (((tickAnim - 49) / 6) * (0-(1.05)));
            zz = 0 + (((tickAnim - 49) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftLeg4.rotationPointX = this.leftLeg4.rotationPointX + (float)(xx);
        this.leftLeg4.rotationPointY = this.leftLeg4.rotationPointY - (float)(yy);
        this.leftLeg4.rotationPointZ = this.leftLeg4.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (17.83-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 10) {
            xx = 17.83 + (((tickAnim - 3) / 7) * (3.75-(17.83)));
            yy = 0 + (((tickAnim - 3) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 7) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 23) {
            xx = 3.75 + (((tickAnim - 10) / 13) * (7.75-(3.75)));
            yy = 0 + (((tickAnim - 10) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 13) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 27) {
            xx = 7.75 + (((tickAnim - 23) / 4) * (25.25-(7.75)));
            yy = 0 + (((tickAnim - 23) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 4) * (0-(0)));
        }
        else if (tickAnim >= 27 && tickAnim < 31) {
            xx = 25.25 + (((tickAnim - 27) / 4) * (7.75-(25.25)));
            yy = 0 + (((tickAnim - 27) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 27) / 4) * (0-(0)));
        }
        else if (tickAnim >= 31 && tickAnim < 40) {
            xx = 7.75 + (((tickAnim - 31) / 9) * (7.75-(7.75)));
            yy = 0 + (((tickAnim - 31) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 31) / 9) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 45) {
            xx = 7.75 + (((tickAnim - 40) / 5) * (21.17-(7.75)));
            yy = 0 + (((tickAnim - 40) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 5) * (0-(0)));
        }
        else if (tickAnim >= 45 && tickAnim < 50) {
            xx = 21.17 + (((tickAnim - 45) / 5) * (-5.92-(21.17)));
            yy = 0 + (((tickAnim - 45) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 45) / 5) * (0-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 55) {
            xx = -5.92 + (((tickAnim - 50) / 5) * (0-(-5.92)));
            yy = 0 + (((tickAnim - 50) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 50) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg, rightLeg.rotateAngleX + (float) Math.toRadians(xx), rightLeg.rotateAngleY + (float) Math.toRadians(yy), rightLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (19.92-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 10) {
            xx = 19.92 + (((tickAnim - 3) / 7) * (20.75-(19.92)));
            yy = 0 + (((tickAnim - 3) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 7) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 23) {
            xx = 20.75 + (((tickAnim - 10) / 13) * (26.75-(20.75)));
            yy = 0 + (((tickAnim - 10) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 13) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 27) {
            xx = 26.75 + (((tickAnim - 23) / 4) * (0-(26.75)));
            yy = 0 + (((tickAnim - 23) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 4) * (0-(0)));
        }
        else if (tickAnim >= 27 && tickAnim < 31) {
            xx = 0 + (((tickAnim - 27) / 4) * (26.75-(0)));
            yy = 0 + (((tickAnim - 27) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 27) / 4) * (0-(0)));
        }
        else if (tickAnim >= 31 && tickAnim < 40) {
            xx = 26.75 + (((tickAnim - 31) / 9) * (26.75-(26.75)));
            yy = 0 + (((tickAnim - 31) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 31) / 9) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 45) {
            xx = 26.75 + (((tickAnim - 40) / 5) * (16.58-(26.75)));
            yy = 0 + (((tickAnim - 40) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 5) * (0-(0)));
        }
        else if (tickAnim >= 45 && tickAnim < 50) {
            xx = 16.58 + (((tickAnim - 45) / 5) * (19.42-(16.58)));
            yy = 0 + (((tickAnim - 45) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 45) / 5) * (0-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 55) {
            xx = 19.42 + (((tickAnim - 50) / 5) * (0-(19.42)));
            yy = 0 + (((tickAnim - 50) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 50) / 5) * (0-(0)));
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
        else if (tickAnim >= 10 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 10) / 13) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 13) * (-0.375-(0)));
            zz = 0 + (((tickAnim - 10) / 13) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 27) {
            xx = 0 + (((tickAnim - 23) / 4) * (0-(0)));
            yy = -0.375 + (((tickAnim - 23) / 4) * (0-(-0.375)));
            zz = 0 + (((tickAnim - 23) / 4) * (0-(0)));
        }
        else if (tickAnim >= 27 && tickAnim < 31) {
            xx = 0 + (((tickAnim - 27) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 27) / 4) * (-0.375-(0)));
            zz = 0 + (((tickAnim - 27) / 4) * (0-(0)));
        }
        else if (tickAnim >= 31 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 31) / 9) * (0-(0)));
            yy = -0.375 + (((tickAnim - 31) / 9) * (-0.375-(-0.375)));
            zz = 0 + (((tickAnim - 31) / 9) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 55) {
            xx = 0 + (((tickAnim - 40) / 15) * (0-(0)));
            yy = -0.375 + (((tickAnim - 40) / 15) * (0-(-0.375)));
            zz = 0 + (((tickAnim - 40) / 15) * (0-(0)));
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
            xx = 0 + (((tickAnim - 0) / 3) * (-52.5-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 6) {
            xx = -52.5 + (((tickAnim - 3) / 3) * (-15-(-52.5)));
            yy = 0 + (((tickAnim - 3) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 3) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 10) {
            xx = -15 + (((tickAnim - 6) / 4) * (-40.5-(-15)));
            yy = 0 + (((tickAnim - 6) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 4) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 23) {
            xx = -40.5 + (((tickAnim - 10) / 13) * (-49.5-(-40.5)));
            yy = 0 + (((tickAnim - 10) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 13) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 27) {
            xx = -49.5 + (((tickAnim - 23) / 4) * (0-(-49.5)));
            yy = 0 + (((tickAnim - 23) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 4) * (0-(0)));
        }
        else if (tickAnim >= 27 && tickAnim < 31) {
            xx = 0 + (((tickAnim - 27) / 4) * (-49.5-(0)));
            yy = 0 + (((tickAnim - 27) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 27) / 4) * (0-(0)));
        }
        else if (tickAnim >= 31 && tickAnim < 40) {
            xx = -49.5 + (((tickAnim - 31) / 9) * (-49.5-(-49.5)));
            yy = 0 + (((tickAnim - 31) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 31) / 9) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 45) {
            xx = -49.5 + (((tickAnim - 40) / 5) * (-43-(-49.5)));
            yy = 0 + (((tickAnim - 40) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 5) * (0-(0)));
        }
        else if (tickAnim >= 45 && tickAnim < 50) {
            xx = -43 + (((tickAnim - 45) / 5) * (-43.75-(-43)));
            yy = 0 + (((tickAnim - 45) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 45) / 5) * (0-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 55) {
            xx = -43.75 + (((tickAnim - 50) / 5) * (0-(-43.75)));
            yy = 0 + (((tickAnim - 50) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 50) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg3, rightLeg3.rotateAngleX + (float) Math.toRadians(xx), rightLeg3.rotateAngleY + (float) Math.toRadians(yy), rightLeg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 10) / 13) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 13) * (-0.225-(0)));
            zz = 0 + (((tickAnim - 10) / 13) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 27) {
            xx = 0 + (((tickAnim - 23) / 4) * (0-(0)));
            yy = -0.225 + (((tickAnim - 23) / 4) * (0-(-0.225)));
            zz = 0 + (((tickAnim - 23) / 4) * (0-(0)));
        }
        else if (tickAnim >= 27 && tickAnim < 31) {
            xx = 0 + (((tickAnim - 27) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 27) / 4) * (-0.225-(0)));
            zz = 0 + (((tickAnim - 27) / 4) * (0-(0)));
        }
        else if (tickAnim >= 31 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 31) / 9) * (0-(0)));
            yy = -0.225 + (((tickAnim - 31) / 9) * (-0.225-(-0.225)));
            zz = 0 + (((tickAnim - 31) / 9) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 45) {
            xx = 0 + (((tickAnim - 40) / 5) * (0-(0)));
            yy = -0.225 + (((tickAnim - 40) / 5) * (0-(-0.225)));
            zz = 0 + (((tickAnim - 40) / 5) * (0-(0)));
        }
        else if (tickAnim >= 45 && tickAnim < 55) {
            xx = 0 + (((tickAnim - 45) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 45) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 45) / 10) * (0-(0)));
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
            xx = 0 + (((tickAnim - 0) / 3) * (82.58-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 6) {
            xx = 82.58 + (((tickAnim - 3) / 3) * (-2.75-(82.58)));
            yy = 0 + (((tickAnim - 3) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 3) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 10) {
            xx = -2.75 + (((tickAnim - 6) / 4) * (46-(-2.75)));
            yy = 0 + (((tickAnim - 6) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 4) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 23) {
            xx = 46 + (((tickAnim - 10) / 13) * (49.75-(46)));
            yy = 0 + (((tickAnim - 10) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 13) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 27) {
            xx = 49.75 + (((tickAnim - 23) / 4) * (7-(49.75)));
            yy = 0 + (((tickAnim - 23) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 4) * (0-(0)));
        }
        else if (tickAnim >= 27 && tickAnim < 31) {
            xx = 7 + (((tickAnim - 27) / 4) * (49.75-(7)));
            yy = 0 + (((tickAnim - 27) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 27) / 4) * (0-(0)));
        }
        else if (tickAnim >= 31 && tickAnim < 40) {
            xx = 49.75 + (((tickAnim - 31) / 9) * (49.75-(49.75)));
            yy = 0 + (((tickAnim - 31) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 31) / 9) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 45) {
            xx = 49.75 + (((tickAnim - 40) / 5) * (26.67-(49.75)));
            yy = 0 + (((tickAnim - 40) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 5) * (0-(0)));
        }
        else if (tickAnim >= 45 && tickAnim < 50) {
            xx = 26.67 + (((tickAnim - 45) / 5) * (69.58-(26.67)));
            yy = 0 + (((tickAnim - 45) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 45) / 5) * (0-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 55) {
            xx = 69.58 + (((tickAnim - 50) / 5) * (0-(69.58)));
            yy = 0 + (((tickAnim - 50) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 50) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg4, rightLeg4.rotateAngleX + (float) Math.toRadians(xx), rightLeg4.rotateAngleY + (float) Math.toRadians(yy), rightLeg4.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (1.275-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (-0.4-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 3) / 3) * (0-(0)));
            yy = 1.275 + (((tickAnim - 3) / 3) * (0-(1.275)));
            zz = -0.4 + (((tickAnim - 3) / 3) * (0-(-0.4)));
        }
        else if (tickAnim >= 6 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 6) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 6) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 4) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 55) {
            xx = 0 + (((tickAnim - 10) / 45) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 45) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 45) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightLeg4.rotationPointX = this.rightLeg4.rotationPointX + (float)(xx);
        this.rightLeg4.rotationPointY = this.rightLeg4.rotationPointY - (float)(yy);
        this.rightLeg4.rotationPointZ = this.rightLeg4.rotationPointZ + (float)(zz);



    }
    public void animRoar(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraVenetoraptor entity = (EntityPrehistoricFloraVenetoraptor) entitylivingbaseIn;
        int animCycle = 30;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 11) {
            xx = -0-Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*-3 + (((tickAnim - 0) / 11) * (4.075-Math.sin((Math.PI/180)*(((double)tickAnim/20)*160+120))*-15-(-0-Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*-3)));
            yy = 0 + (((tickAnim - 0) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 11) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 30) {
            xx = 4.075-Math.sin((Math.PI/180)*(((double)tickAnim/20)*160+120))*-15 + (((tickAnim - 11) / 19) * (0-(4.075-Math.sin((Math.PI/180)*(((double)tickAnim/20)*160+120))*-15)));
            yy = 0 + (((tickAnim - 11) / 19) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 19) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(xx), neck3.rotateAngleY + (float) Math.toRadians(yy), neck3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 11) {
            xx = 5.75-Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-100))*-6 + (((tickAnim - 0) / 11) * (-2.55-Math.sin((Math.PI/180)*(((double)tickAnim/20)*560+80))*-10-(5.75-Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-100))*-6)));
            yy = 0 + (((tickAnim - 0) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 11) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 30) {
            xx = -2.55-Math.sin((Math.PI/180)*(((double)tickAnim/20)*560+80))*-10 + (((tickAnim - 11) / 19) * (0-(-2.55-Math.sin((Math.PI/180)*(((double)tickAnim/20)*560+80))*-10)));
            yy = 0 + (((tickAnim - 11) / 19) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 19) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(xx), neck2.rotateAngleY + (float) Math.toRadians(yy), neck2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 0) / 11) * (3.55-Math.sin((Math.PI/180)*(((double)tickAnim/20)*560+80))*13-(0)));
            yy = 0 + (((tickAnim - 0) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 11) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 30) {
            xx = 3.55-Math.sin((Math.PI/180)*(((double)tickAnim/20)*560+80))*13 + (((tickAnim - 11) / 19) * (0-(3.55-Math.sin((Math.PI/180)*(((double)tickAnim/20)*560+80))*13)));
            yy = 0 + (((tickAnim - 11) / 19) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 19) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(xx), neck.rotateAngleY + (float) Math.toRadians(yy), neck.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 0) / 11) * (6.675-Math.sin((Math.PI/180)*(((double)tickAnim/20)*760+80))*-12-(0)));
            yy = 0 + (((tickAnim - 0) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 11) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 30) {
            xx = 6.675-Math.sin((Math.PI/180)*(((double)tickAnim/20)*760+80))*-12 + (((tickAnim - 11) / 19) * (0-(6.675-Math.sin((Math.PI/180)*(((double)tickAnim/20)*760+80))*-12)));
            yy = 0 + (((tickAnim - 11) / 19) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 19) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 0) / 11) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 11) * (0.275-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 11) / 19) * (0-(0)));
            yy = 0 + (((tickAnim - 11) / 19) * (0-(0)));
            zz = 0.275 + (((tickAnim - 11) / 19) * (0-(0.275)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.head.rotationPointX = this.head.rotationPointX + (float)(xx);
        this.head.rotationPointY = this.head.rotationPointY - (float)(yy);
        this.head.rotationPointZ = this.head.rotationPointZ + (float)(zz);





        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (12.5-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 9) {
            xx = 12.5 + (((tickAnim - 5) / 4) * (0-(12.5)));
            yy = 0 + (((tickAnim - 5) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 4) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 9) / 3) * (12.75-Math.sin((Math.PI/180)*(((double)tickAnim/20)*560))*15-(0)));
            yy = 0 + (((tickAnim - 9) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 3) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 30) {
            xx = 12.75-Math.sin((Math.PI/180)*(((double)tickAnim/20)*560))*15 + (((tickAnim - 12) / 18) * (0-(12.75-Math.sin((Math.PI/180)*(((double)tickAnim/20)*560))*15)));
            yy = 0 + (((tickAnim - 12) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 18) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(xx), jaw.rotateAngleY + (float) Math.toRadians(yy), jaw.rotateAngleZ + (float) Math.toRadians(zz));



    }
    public void animStand(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraVenetoraptor entity = (EntityPrehistoricFloraVenetoraptor) entitylivingbaseIn;
        int animCycle = 41;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;


        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(0), neck3.rotateAngleY + (float) Math.toRadians(0), neck3.rotateAngleZ + (float) Math.toRadians(0));



        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (-21.1-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = -21.1 + (((tickAnim - 20) / 10) * (-29.25-(-21.1)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 42) {
            xx = -29.25 + (((tickAnim - 30) / 12) * (0-(-29.25)));
            yy = 0 + (((tickAnim - 30) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(xx), neck2.rotateAngleY + (float) Math.toRadians(yy), neck2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (-0.3-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0.175-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            yy = -0.3 + (((tickAnim - 20) / 10) * (-0.425-(-0.3)));
            zz = 0.175 + (((tickAnim - 20) / 10) * (0.325-(0.175)));
        }
        else if (tickAnim >= 30 && tickAnim < 42) {
            xx = 0 + (((tickAnim - 30) / 12) * (0-(0)));
            yy = -0.425 + (((tickAnim - 30) / 12) * (0-(-0.425)));
            zz = 0.325 + (((tickAnim - 30) / 12) * (0-(0.325)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.neck2.rotationPointX = this.neck2.rotationPointX + (float)(xx);
        this.neck2.rotationPointY = this.neck2.rotationPointY - (float)(yy);
        this.neck2.rotationPointZ = this.neck2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (9.75-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 9.75 + (((tickAnim - 20) / 10) * (11.25-(9.75)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 42) {
            xx = 11.25 + (((tickAnim - 30) / 12) * (0-(11.25)));
            yy = 0 + (((tickAnim - 30) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(xx), neck.rotateAngleY + (float) Math.toRadians(yy), neck.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0.125-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0.125 + (((tickAnim - 20) / 10) * (0.125-(0.125)));
        }
        else if (tickAnim >= 30 && tickAnim < 42) {
            xx = 0 + (((tickAnim - 30) / 12) * (0-(0)));
            yy = 0 + (((tickAnim - 30) / 12) * (0-(0)));
            zz = 0.125 + (((tickAnim - 30) / 12) * (0-(0.125)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.neck.rotationPointX = this.neck.rotationPointX + (float)(xx);
        this.neck.rotationPointY = this.neck.rotationPointY - (float)(yy);
        this.neck.rotationPointZ = this.neck.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (-12.55-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = -12.55 + (((tickAnim - 20) / 10) * (-15.75-(-12.55)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 42) {
            xx = -15.75 + (((tickAnim - 30) / 12) * (0-(-15.75)));
            yy = 0 + (((tickAnim - 30) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (20.5-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 20.5 + (((tickAnim - 20) / 10) * (24.75-(20.5)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 38) {
            xx = 24.75 + (((tickAnim - 30) / 8) * (0-(24.75)));
            yy = 0 + (((tickAnim - 30) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 8) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 42) {
            xx = 0 + (((tickAnim - 38) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 38) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 38) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(xx), jaw.rotateAngleY + (float) Math.toRadians(yy), jaw.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 1 + (((tickAnim - 0) / 20) * (1-(1)));
            yy = 1 + (((tickAnim - 0) / 20) * (0.01-(1)));
            zz = 1 + (((tickAnim - 0) / 20) * (1-(1)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 1 + (((tickAnim - 20) / 10) * (1-(1)));
            yy = 0.01 + (((tickAnim - 20) / 10) * (0.01-(0.01)));
            zz = 1 + (((tickAnim - 20) / 10) * (1-(1)));
        }
        else if (tickAnim >= 30 && tickAnim < 35) {
            xx = 1 + (((tickAnim - 30) / 5) * (1-(1)));
            yy = 0.01 + (((tickAnim - 30) / 5) * (1-(0.01)));
            zz = 1 + (((tickAnim - 30) / 5) * (1-(1)));
        }
        else if (tickAnim >= 35 && tickAnim < 42) {
            xx = 1 + (((tickAnim - 35) / 7) * (1-(1)));
            yy = 1 + (((tickAnim - 35) / 7) * (1-(1)));
            zz = 1 + (((tickAnim - 35) / 7) * (1-(1)));
        }
        else {
            xx = 1;
            yy = 1;
            zz = 1;
        }
        this.eye.setScale((float)xx, (float)yy, (float)zz);

    }
    public void animRun(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraVenetoraptor entity = (EntityPrehistoricFloraVenetoraptor) entitylivingbaseIn;
        int animCycle = 10;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        this.setRotateAngle(hips, hips.rotateAngleX + (float) Math.toRadians(1.5-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/0.5-10))*-7), hips.rotateAngleY + (float) Math.toRadians(0), hips.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720-10))*4));
        this.hips.rotationPointX = this.hips.rotationPointX + (float)(0);
        this.hips.rotationPointY = this.hips.rotationPointY - (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/0.5-120))*2);
        this.hips.rotationPointZ = this.hips.rotationPointZ + (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/0.5-40))*-2);


        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/0.5-120))*-10), body.rotateAngleY + (float) Math.toRadians(0), body.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720-10))*-4));


        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/0.5-120))*10), chest.rotateAngleY + (float) Math.toRadians(0), chest.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(leftArm, leftArm.rotateAngleX + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/0.5-120))*-5), leftArm.rotateAngleY + (float) Math.toRadians(0), leftArm.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(leftArm2, leftArm2.rotateAngleX + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/0.5-180))*5), leftArm2.rotateAngleY + (float) Math.toRadians(0), leftArm2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(rightArm, rightArm.rotateAngleX + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5-720))*-5), rightArm.rotateAngleY + (float) Math.toRadians(0), rightArm.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(rightArm2, rightArm2.rotateAngleX + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/0.5-180))*5), rightArm2.rotateAngleY + (float) Math.toRadians(0), rightArm2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(19.5-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/0.5-130))*-10), neck3.rotateAngleY + (float) Math.toRadians(0), neck3.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(10.25-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/0.5-200))*-10), neck2.rotateAngleY + (float) Math.toRadians(0), neck2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(-31-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/0.5-300))*-10), neck.rotateAngleY + (float) Math.toRadians(0), neck.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/0.5-350))*-5), head.rotateAngleY + (float) Math.toRadians(0), head.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tail, tail.rotateAngleX + (float) Math.toRadians(1.5-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/0.5))*10), tail.rotateAngleY + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720-50))*2), tail.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(1.5-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/0.5-50))*12), tail2.rotateAngleY + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720-100))*3), tail2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(1.5-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/0.5-150))*15), tail3.rotateAngleY + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720-200))*4), tail3.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(1.5-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/0.5-200))*18), tail4.rotateAngleY + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720-250))*5), tail4.rotateAngleZ + (float) Math.toRadians(0));



        if (tickAnim >= 0 && tickAnim < 5) {
            xx = -20.74241 + (((tickAnim - 0) / 5) * (32.5-(-20.74241)));
            yy = -1.86861 + (((tickAnim - 0) / 5) * (0-(-1.86861)));
            zz = -0.36509 + (((tickAnim - 0) / 5) * (0-(-0.36509)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 32.5 + (((tickAnim - 5) / 3) * (118.62-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*300-(32.5)));
            yy = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 3) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 118.62-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*300 + (((tickAnim - 8) / 2) * (-20.74241-(118.62-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*300)));
            yy = 0 + (((tickAnim - 8) / 2) * (-1.86861-(0)));
            zz = 0 + (((tickAnim - 8) / 2) * (-0.36509-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg, leftLeg.rotateAngleX + (float) Math.toRadians(xx), leftLeg.rotateAngleY + (float) Math.toRadians(yy), leftLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = -10.25 + (((tickAnim - 0) / 5) * (24.2-(-10.25)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 24.2 + (((tickAnim - 5) / 3) * (-108.855-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-50))*250-(24.2)));
            yy = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 3) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = -108.855-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-50))*250 + (((tickAnim - 8) / 2) * (-10.25-(-108.855-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-50))*250)));
            yy = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg2, leftLeg2.rotateAngleX + (float) Math.toRadians(xx), leftLeg2.rotateAngleY + (float) Math.toRadians(yy), leftLeg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (-0.5-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 5) / 1) * (0-(0)));
            yy = -0.5 + (((tickAnim - 5) / 1) * (-1.1-(-0.5)));
            zz = 0 + (((tickAnim - 5) / 1) * (0.25-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 6) / 4) * (0-(0)));
            yy = -1.1 + (((tickAnim - 6) / 4) * (0-(-1.1)));
            zz = 0.25 + (((tickAnim - 6) / 4) * (0-(0.25)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftLeg2.rotationPointX = this.leftLeg2.rotationPointX + (float)(xx);
        this.leftLeg2.rotationPointY = this.leftLeg2.rotationPointY - (float)(yy);
        this.leftLeg2.rotationPointZ = this.leftLeg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 1) {
            xx = -7.75 + (((tickAnim - 0) / 1) * (-20.65-(-7.75)));
            yy = 0 + (((tickAnim - 0) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 1) * (0-(0)));
        }
        else if (tickAnim >= 1 && tickAnim < 2) {
            xx = -20.65 + (((tickAnim - 1) / 1) * (1.46-(-20.65)));
            yy = 0 + (((tickAnim - 1) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 1) / 1) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 5) {
            xx = 1.46 + (((tickAnim - 2) / 3) * (0-(1.46)));
            yy = 0 + (((tickAnim - 2) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 2) / 3) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 5) / 2) * (-38.13-(0)));
            yy = 0 + (((tickAnim - 5) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 2) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = -38.13 + (((tickAnim - 7) / 1) * (-57.19-(-38.13)));
            yy = 0 + (((tickAnim - 7) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 1) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = -57.19 + (((tickAnim - 8) / 2) * (-7.75-(-57.19)));
            yy = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg3, leftLeg3.rotateAngleX + (float) Math.toRadians(xx), leftLeg3.rotateAngleY + (float) Math.toRadians(yy), leftLeg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 2) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 2) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 2) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 2) / 3) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 5) / 3) * (-0.7-(0)));
            zz = 0 + (((tickAnim - 5) / 3) * (-0.25-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            yy = -0.7 + (((tickAnim - 8) / 2) * (0-(-0.7)));
            zz = -0.25 + (((tickAnim - 8) / 2) * (0-(-0.25)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftLeg3.rotationPointX = this.leftLeg3.rotationPointX + (float)(xx);
        this.leftLeg3.rotationPointY = this.leftLeg3.rotationPointY - (float)(yy);
        this.leftLeg3.rotationPointZ = this.leftLeg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 1) {
            xx = 40.75 + (((tickAnim - 0) / 1) * (29.59467-(40.75)));
            yy = 0 + (((tickAnim - 0) / 1) * (0.55193-(0)));
            zz = 0 + (((tickAnim - 0) / 1) * (-1.12159-(0)));
        }
        else if (tickAnim >= 1 && tickAnim < 2) {
            xx = 29.59467 + (((tickAnim - 1) / 1) * (-7.06161-(29.59467)));
            yy = 0.55193 + (((tickAnim - 1) / 1) * (1.10387-(0.55193)));
            zz = -1.12159 + (((tickAnim - 1) / 1) * (-2.24323-(-1.12159)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = -7.06161 + (((tickAnim - 2) / 1) * (26.43-(-7.06161)));
            yy = 1.10387 + (((tickAnim - 2) / 1) * (0-(1.10387)));
            zz = -2.24323 + (((tickAnim - 2) / 1) * (0-(-2.24323)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 26.43 + (((tickAnim - 3) / 2) * (85.5-(26.43)));
            yy = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 2) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 7) {
            xx = 85.5 + (((tickAnim - 5) / 2) * (124.33-(85.5)));
            yy = 0 + (((tickAnim - 5) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 2) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = 124.33 + (((tickAnim - 7) / 1) * (91.62-(124.33)));
            yy = 0 + (((tickAnim - 7) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 1) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 8) {
            xx = 91.62 + (((tickAnim - 8) / 0) * (85.74599-(91.62)));
            yy = 0 + (((tickAnim - 8) / 0) * (-3.81928-(0)));
            zz = 0 + (((tickAnim - 8) / 0) * (-1.29518-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 85.74599 + (((tickAnim - 8) / 2) * (40.75-(85.74599)));
            yy = -3.81928 + (((tickAnim - 8) / 2) * (0-(-3.81928)));
            zz = -1.29518 + (((tickAnim - 8) / 2) * (0-(-1.29518)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg4, leftLeg4.rotateAngleX + (float) Math.toRadians(xx), leftLeg4.rotateAngleY + (float) Math.toRadians(yy), leftLeg4.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            yy = 0.1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*30 + (((tickAnim - 0) / 2) * (-0.25-(0.1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*30)));
            zz = 0 + (((tickAnim - 0) / 2) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 2) / 1) * (0-(0)));
            yy = -0.25 + (((tickAnim - 2) / 1) * (-0.85-(-0.25)));
            zz = 0 + (((tickAnim - 2) / 1) * (-0.05-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            yy = -0.85 + (((tickAnim - 3) / 2) * (0-(-0.85)));
            zz = -0.05 + (((tickAnim - 3) / 2) * (0-(-0.05)));
        }
        else if (tickAnim >= 5 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 5) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 5) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 2) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 7) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 7) / 1) * (0.82-(0)));
            zz = 0 + (((tickAnim - 7) / 1) * (-0.3-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 8) / 0) * (0-(0)));
            yy = 0.82 + (((tickAnim - 8) / 0) * (0-(0.82)));
            zz = -0.3 + (((tickAnim - 8) / 0) * (-0.3-(-0.3)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 8) / 2) * (0.1-(0)));
            zz = -0.3 + (((tickAnim - 8) / 2) * (0-(-0.3)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftLeg4.rotationPointX = this.leftLeg4.rotationPointX + (float)(xx);
        this.leftLeg4.rotationPointY = this.leftLeg4.rotationPointY - (float)(yy);
        this.leftLeg4.rotationPointZ = this.leftLeg4.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (16.08376-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (-3.73239-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (12.72248-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 16.08376 + (((tickAnim - 5) / 3) * (52.08376-(16.08376)));
            yy = -3.73239 + (((tickAnim - 5) / 3) * (-3.73239-(-3.73239)));
            zz = 12.72248 + (((tickAnim - 5) / 3) * (12.72248-(12.72248)));
        }
        else if (tickAnim >= 8 && tickAnim < 8) {
            xx = 52.08376 + (((tickAnim - 8) / 0) * (52.08376-(52.08376)));
            yy = -3.73239 + (((tickAnim - 8) / 0) * (-3.73239-(-3.73239)));
            zz = 12.72248 + (((tickAnim - 8) / 0) * (12.72248-(12.72248)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 52.08376 + (((tickAnim - 8) / 2) * (0-(52.08376)));
            yy = -3.73239 + (((tickAnim - 8) / 2) * (0-(-3.73239)));
            zz = 12.72248 + (((tickAnim - 8) / 2) * (0-(12.72248)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftdewclaw, leftdewclaw.rotateAngleX + (float) Math.toRadians(xx), leftdewclaw.rotateAngleY + (float) Math.toRadians(yy), leftdewclaw.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (22.58932-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (-4.30472-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (9.97536-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 22.58932 + (((tickAnim - 5) / 3) * (67.08932-(22.58932)));
            yy = -4.30472 + (((tickAnim - 5) / 3) * (-4.30472-(-4.30472)));
            zz = 9.97536 + (((tickAnim - 5) / 3) * (9.97536-(9.97536)));
        }
        else if (tickAnim >= 8 && tickAnim < 8) {
            xx = 67.08932 + (((tickAnim - 8) / 0) * (67.08932-(67.08932)));
            yy = -4.30472 + (((tickAnim - 8) / 0) * (-4.30472-(-4.30472)));
            zz = 9.97536 + (((tickAnim - 8) / 0) * (9.97536-(9.97536)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 67.08932 + (((tickAnim - 8) / 2) * (0-(67.08932)));
            yy = -4.30472 + (((tickAnim - 8) / 2) * (0-(-4.30472)));
            zz = 9.97536 + (((tickAnim - 8) / 2) * (0-(9.97536)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftdewclaw2, leftdewclaw2.rotateAngleX + (float) Math.toRadians(xx), leftdewclaw2.rotateAngleY + (float) Math.toRadians(yy), leftdewclaw2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 45.5 + (((tickAnim - 0) / 3) * (50.12-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*300-(45.5)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 50.12-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*300 + (((tickAnim - 3) / 2) * (-20.74241-(50.12-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*300)));
            yy = 0 + (((tickAnim - 3) / 2) * (1.86861-(0)));
            zz = 0 + (((tickAnim - 3) / 2) * (0.36509-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = -20.74241 + (((tickAnim - 5) / 5) * (45.5-(-20.74241)));
            yy = 1.86861 + (((tickAnim - 5) / 5) * (0-(1.86861)));
            zz = 0.36509 + (((tickAnim - 5) / 5) * (0-(0.36509)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg, rightLeg.rotateAngleX + (float) Math.toRadians(xx), rightLeg.rotateAngleY + (float) Math.toRadians(yy), rightLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 24.2 + (((tickAnim - 0) / 3) * (-143.38-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-50))*250-(24.2)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = -143.38-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-50))*250 + (((tickAnim - 3) / 2) * (-10.25-(-143.38-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-50))*250)));
            yy = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 2) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = -10.25 + (((tickAnim - 5) / 5) * (24.2-(-10.25)));
            yy = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg2, rightLeg2.rotateAngleX + (float) Math.toRadians(xx), rightLeg2.rotateAngleY + (float) Math.toRadians(yy), rightLeg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 1) {
            xx = 0 + (((tickAnim - 0) / 1) * (0-(0)));
            yy = -0.5 + (((tickAnim - 0) / 1) * (-1.1-(-0.5)));
            zz = 0 + (((tickAnim - 0) / 1) * (0.25-(0)));
        }
        else if (tickAnim >= 1 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 1) / 4) * (0-(0)));
            yy = -1.1 + (((tickAnim - 1) / 4) * (0-(-1.1)));
            zz = 0.25 + (((tickAnim - 1) / 4) * (0-(0.25)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 5) / 5) * (-0.5-(0)));
            zz = 0 + (((tickAnim - 5) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightLeg2.rotationPointX = this.rightLeg2.rotationPointX + (float)(xx);
        this.rightLeg2.rotationPointY = this.rightLeg2.rotationPointY - (float)(yy);
        this.rightLeg2.rotationPointZ = this.rightLeg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 10.25 + (((tickAnim - 0) / 2) * (-25.805-(10.25)));
            yy = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 2) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = -25.805 + (((tickAnim - 2) / 1) * (-57.19-(-25.805)));
            yy = 0 + (((tickAnim - 2) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 2) / 1) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = -57.19 + (((tickAnim - 3) / 2) * (-7.75-(-57.19)));
            yy = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 2) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 6) {
            xx = -7.75 + (((tickAnim - 5) / 1) * (-20.65-(-7.75)));
            yy = 0 + (((tickAnim - 5) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 1) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 7) {
            xx = -20.65 + (((tickAnim - 6) / 1) * (1.46-(-20.65)));
            yy = 0 + (((tickAnim - 6) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 1) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 10) {
            xx = 1.46 + (((tickAnim - 7) / 3) * (10.25-(1.46)));
            yy = 0 + (((tickAnim - 7) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg3, rightLeg3.rotateAngleX + (float) Math.toRadians(xx), rightLeg3.rotateAngleY + (float) Math.toRadians(yy), rightLeg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (-0.7-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (-0.25-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            yy = -0.7 + (((tickAnim - 3) / 2) * (0-(-0.7)));
            zz = -0.25 + (((tickAnim - 3) / 2) * (0-(-0.25)));
        }
        else if (tickAnim >= 5 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 5) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 5) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 2) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 7) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 7) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightLeg3.rotationPointX = this.rightLeg3.rotationPointX + (float)(xx);
        this.rightLeg3.rotationPointY = this.rightLeg3.rotationPointY - (float)(yy);
        this.rightLeg3.rotationPointZ = this.rightLeg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 85.5 + (((tickAnim - 0) / 2) * (124.33-(85.5)));
            yy = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 2) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = 124.33 + (((tickAnim - 2) / 1) * (91.62-(124.33)));
            yy = 0 + (((tickAnim - 2) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 2) / 1) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 3) {
            xx = 91.62 + (((tickAnim - 3) / 0) * (85.74599-(91.62)));
            yy = 0 + (((tickAnim - 3) / 0) * (-3.81928-(0)));
            zz = 0 + (((tickAnim - 3) / 0) * (-1.29518-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 85.74599 + (((tickAnim - 3) / 2) * (39.25-(85.74599)));
            yy = -3.81928 + (((tickAnim - 3) / 2) * (0-(-3.81928)));
            zz = -1.29518 + (((tickAnim - 3) / 2) * (0-(-1.29518)));
        }
        else if (tickAnim >= 5 && tickAnim < 6) {
            xx = 39.25 + (((tickAnim - 5) / 1) * (29.59467-(39.25)));
            yy = 0 + (((tickAnim - 5) / 1) * (0.55193-(0)));
            zz = 0 + (((tickAnim - 5) / 1) * (-1.12159-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 7) {
            xx = 29.59467 + (((tickAnim - 6) / 1) * (-12.25678-(29.59467)));
            yy = 0.55193 + (((tickAnim - 6) / 1) * (0.24056-(0.55193)));
            zz = -1.12159 + (((tickAnim - 6) / 1) * (2.42802-(-1.12159)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = -12.25678 + (((tickAnim - 7) / 1) * (26.43-(-12.25678)));
            yy = 0.24056 + (((tickAnim - 7) / 1) * (0-(0.24056)));
            zz = 2.42802 + (((tickAnim - 7) / 1) * (0-(2.42802)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 26.43 + (((tickAnim - 8) / 2) * (85.5-(26.43)));
            yy = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg4, rightLeg4.rotateAngleX + (float) Math.toRadians(xx), rightLeg4.rotateAngleY + (float) Math.toRadians(yy), rightLeg4.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 2) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 2) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 2) / 1) * (0.82-(0)));
            zz = 0 + (((tickAnim - 2) / 1) * (-0.3-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 3) / 0) * (0-(0)));
            yy = 0.82 + (((tickAnim - 3) / 0) * (0-(0.82)));
            zz = -0.3 + (((tickAnim - 3) / 0) * (-0.3-(-0.3)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 3) / 2) * (-4.325+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*20-(0)));
            zz = -0.3 + (((tickAnim - 3) / 2) * (0-(-0.3)));
        }
        else if (tickAnim >= 5 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 5) / 1) * (0-(0)));
            yy = -4.325+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*20 + (((tickAnim - 5) / 1) * (1.355-(-4.325+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*20)));
            zz = 0 + (((tickAnim - 5) / 1) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 6) / 1) * (0-(0)));
            yy = 1.355 + (((tickAnim - 6) / 1) * (-0.35-(1.355)));
            zz = 0 + (((tickAnim - 6) / 1) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 7) / 1) * (0-(0)));
            yy = -0.35 + (((tickAnim - 7) / 1) * (0-(-0.35)));
            zz = 0 + (((tickAnim - 7) / 1) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightLeg4.rotationPointX = this.rightLeg4.rotationPointX + (float)(xx);
        this.rightLeg4.rotationPointY = this.rightLeg4.rotationPointY - (float)(yy);
        this.rightLeg4.rotationPointZ = this.rightLeg4.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 16.08376 + (((tickAnim - 0) / 3) * (52.08376-(16.08376)));
            yy = -3.73239 + (((tickAnim - 0) / 3) * (-3.73239-(-3.73239)));
            zz = 12.72248 + (((tickAnim - 0) / 3) * (12.72248-(12.72248)));
        }
        else if (tickAnim >= 3 && tickAnim < 3) {
            xx = 52.08376 + (((tickAnim - 3) / 0) * (52.08376-(52.08376)));
            yy = -3.73239 + (((tickAnim - 3) / 0) * (-3.73239-(-3.73239)));
            zz = 12.72248 + (((tickAnim - 3) / 0) * (12.72248-(12.72248)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 52.08376 + (((tickAnim - 3) / 2) * (0-(52.08376)));
            yy = -3.73239 + (((tickAnim - 3) / 2) * (0-(-3.73239)));
            zz = 12.72248 + (((tickAnim - 3) / 2) * (0-(12.72248)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 5) / 5) * (16.08376-(0)));
            yy = 0 + (((tickAnim - 5) / 5) * (-3.73239-(0)));
            zz = 0 + (((tickAnim - 5) / 5) * (12.72248-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightdewclaw, rightdewclaw.rotateAngleX + (float) Math.toRadians(xx), rightdewclaw.rotateAngleY + (float) Math.toRadians(yy), rightdewclaw.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 22.58932 + (((tickAnim - 0) / 3) * (67.08932-(22.58932)));
            yy = -4.30472 + (((tickAnim - 0) / 3) * (-4.30472-(-4.30472)));
            zz = 9.97536 + (((tickAnim - 0) / 3) * (9.97536-(9.97536)));
        }
        else if (tickAnim >= 3 && tickAnim < 3) {
            xx = 67.08932 + (((tickAnim - 3) / 0) * (67.08932-(67.08932)));
            yy = -4.30472 + (((tickAnim - 3) / 0) * (-4.30472-(-4.30472)));
            zz = 9.97536 + (((tickAnim - 3) / 0) * (9.97536-(9.97536)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 67.08932 + (((tickAnim - 3) / 2) * (0-(67.08932)));
            yy = -4.30472 + (((tickAnim - 3) / 2) * (0-(-4.30472)));
            zz = 9.97536 + (((tickAnim - 3) / 2) * (0-(9.97536)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 5) / 5) * (22.58932-(0)));
            yy = 0 + (((tickAnim - 5) / 5) * (-4.30472-(0)));
            zz = 0 + (((tickAnim - 5) / 5) * (9.97536-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightdewclaw2, rightdewclaw2.rotateAngleX + (float) Math.toRadians(xx), rightdewclaw2.rotateAngleY + (float) Math.toRadians(yy), rightdewclaw2.rotateAngleZ + (float) Math.toRadians(zz));

    }
    public void animWalk(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraVenetoraptor entity = (EntityPrehistoricFloraVenetoraptor) entitylivingbaseIn;
        int animCycle = 20;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        this.setRotateAngle(hips, hips.rotateAngleX + (float) Math.toRadians(1.5-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5-10))*-7), hips.rotateAngleY + (float) Math.toRadians(0), hips.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-10))*4));
        this.hips.rotationPointX = this.hips.rotationPointX + (float)(0);
        this.hips.rotationPointY = this.hips.rotationPointY - (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5-120))*2);
        this.hips.rotationPointZ = this.hips.rotationPointZ + (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5-40))*-2);


        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5-120))*-10), body.rotateAngleY + (float) Math.toRadians(0), body.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-10))*-4));


        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5-120))*10), chest.rotateAngleY + (float) Math.toRadians(0), chest.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(leftArm, leftArm.rotateAngleX + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5-120))*-5), leftArm.rotateAngleY + (float) Math.toRadians(0), leftArm.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(leftArm2, leftArm2.rotateAngleX + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5-180))*5), leftArm2.rotateAngleY + (float) Math.toRadians(0), leftArm2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(rightArm, rightArm.rotateAngleX + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5-120))*-5), rightArm.rotateAngleY + (float) Math.toRadians(0), rightArm.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(rightArm2, rightArm2.rotateAngleX + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5-180))*5), rightArm2.rotateAngleY + (float) Math.toRadians(0), rightArm2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5-130))*-10), neck3.rotateAngleY + (float) Math.toRadians(0), neck3.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5-200))*-10), neck2.rotateAngleY + (float) Math.toRadians(0), neck2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5-300))*-10), neck.rotateAngleY + (float) Math.toRadians(0), neck.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5-350))*-5), head.rotateAngleY + (float) Math.toRadians(0), head.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tail, tail.rotateAngleX + (float) Math.toRadians(1.5-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5))*10), tail.rotateAngleY + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-50))*2), tail.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(1.5-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5-50))*12), tail2.rotateAngleY + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-100))*3), tail2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(1.5-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5-150))*15), tail3.rotateAngleY + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-200))*4), tail3.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(1.5-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5-200))*18), tail4.rotateAngleY + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-250))*5), tail4.rotateAngleZ + (float) Math.toRadians(0));



        if (tickAnim >= 0 && tickAnim < 10) {
            xx = -20.74241 + (((tickAnim - 0) / 10) * (32.5-(-20.74241)));
            yy = -1.86861 + (((tickAnim - 0) / 10) * (0-(-1.86861)));
            zz = -0.36509 + (((tickAnim - 0) / 10) * (0-(-0.36509)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = 32.5 + (((tickAnim - 10) / 5) * (124.945-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*200-(32.5)));
            yy = 0 + (((tickAnim - 10) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 5) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = 124.945-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*200 + (((tickAnim - 15) / 5) * (-20.74241-(124.945-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*200)));
            yy = 0 + (((tickAnim - 15) / 5) * (-1.86861-(0)));
            zz = 0 + (((tickAnim - 15) / 5) * (-0.36509-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg, leftLeg.rotateAngleX + (float) Math.toRadians(xx), leftLeg.rotateAngleY + (float) Math.toRadians(yy), leftLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = -10.25 + (((tickAnim - 0) / 10) * (24.2-(-10.25)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = 24.2 + (((tickAnim - 10) / 5) * (-30.58-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-50))*250-(24.2)));
            yy = 0 + (((tickAnim - 10) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 5) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = -30.58-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-50))*250 + (((tickAnim - 15) / 5) * (-10.25-(-30.58-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-50))*250)));
            yy = 0 + (((tickAnim - 15) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg2, leftLeg2.rotateAngleX + (float) Math.toRadians(xx), leftLeg2.rotateAngleY + (float) Math.toRadians(yy), leftLeg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (-0.5-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            yy = -0.5 + (((tickAnim - 10) / 3) * (-1.1-(-0.5)));
            zz = 0 + (((tickAnim - 10) / 3) * (0.25-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 13) / 7) * (0-(0)));
            yy = -1.1 + (((tickAnim - 13) / 7) * (0-(-1.1)));
            zz = 0.25 + (((tickAnim - 13) / 7) * (0-(0.25)));
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
            xx = -7.75 + (((tickAnim - 0) / 2) * (-20.65-(-7.75)));
            yy = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 2) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = -20.65 + (((tickAnim - 2) / 1) * (1.46-(-20.65)));
            yy = 0 + (((tickAnim - 2) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 2) / 1) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 10) {
            xx = 1.46 + (((tickAnim - 3) / 7) * (0-(1.46)));
            yy = 0 + (((tickAnim - 3) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 7) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 10) / 3) * (-38.13-(0)));
            yy = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 3) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 17) {
            xx = -38.13 + (((tickAnim - 13) / 4) * (-57.19-(-38.13)));
            yy = 0 + (((tickAnim - 13) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 4) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 20) {
            xx = -57.19 + (((tickAnim - 17) / 3) * (-7.75-(-57.19)));
            yy = 0 + (((tickAnim - 17) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 17) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg3, leftLeg3.rotateAngleX + (float) Math.toRadians(xx), leftLeg3.rotateAngleY + (float) Math.toRadians(yy), leftLeg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 3) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 3) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 7) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 17) {
            xx = 0 + (((tickAnim - 10) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 7) * (-0.7-(0)));
            zz = 0 + (((tickAnim - 10) / 7) * (-0.25-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 17) / 3) * (0-(0)));
            yy = -0.7 + (((tickAnim - 17) / 3) * (0-(-0.7)));
            zz = -0.25 + (((tickAnim - 17) / 3) * (0-(-0.25)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftLeg3.rotationPointX = this.leftLeg3.rotationPointX + (float)(xx);
        this.leftLeg3.rotationPointY = this.leftLeg3.rotationPointY - (float)(yy);
        this.leftLeg3.rotationPointZ = this.leftLeg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 40.75 + (((tickAnim - 0) / 2) * (29.59467-(40.75)));
            yy = 0 + (((tickAnim - 0) / 2) * (0.55193-(0)));
            zz = 0 + (((tickAnim - 0) / 2) * (-1.12159-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = 29.59467 + (((tickAnim - 2) / 1) * (-7.06161-(29.59467)));
            yy = 0.55193 + (((tickAnim - 2) / 1) * (1.10387-(0.55193)));
            zz = -1.12159 + (((tickAnim - 2) / 1) * (-2.24323-(-1.12159)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = -7.06161 + (((tickAnim - 3) / 2) * (26.43-(-7.06161)));
            yy = 1.10387 + (((tickAnim - 3) / 2) * (0-(1.10387)));
            zz = -2.24323 + (((tickAnim - 3) / 2) * (0-(-2.24323)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 26.43 + (((tickAnim - 5) / 5) * (85.5-(26.43)));
            yy = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 5) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 85.5 + (((tickAnim - 10) / 3) * (124.33-(85.5)));
            yy = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 3) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = 124.33 + (((tickAnim - 13) / 2) * (91.62-(124.33)));
            yy = 0 + (((tickAnim - 13) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 2) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 17) {
            xx = 91.62 + (((tickAnim - 15) / 2) * (85.74599-(91.62)));
            yy = 0 + (((tickAnim - 15) / 2) * (-3.81928-(0)));
            zz = 0 + (((tickAnim - 15) / 2) * (-1.29518-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 20) {
            xx = 85.74599 + (((tickAnim - 17) / 3) * (40.75-(85.74599)));
            yy = -3.81928 + (((tickAnim - 17) / 3) * (0-(-3.81928)));
            zz = -1.29518 + (((tickAnim - 17) / 3) * (0-(-1.29518)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg4, leftLeg4.rotateAngleX + (float) Math.toRadians(xx), leftLeg4.rotateAngleY + (float) Math.toRadians(yy), leftLeg4.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0.1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*30 + (((tickAnim - 0) / 3) * (-0.25-(0.1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*30)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            yy = -0.25 + (((tickAnim - 3) / 2) * (-0.85-(-0.25)));
            zz = 0 + (((tickAnim - 3) / 2) * (-0.05-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            yy = -0.85 + (((tickAnim - 5) / 5) * (0-(-0.85)));
            zz = -0.05 + (((tickAnim - 5) / 5) * (0-(-0.05)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 3) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 13) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 13) / 2) * (0.82-(0)));
            zz = 0 + (((tickAnim - 13) / 2) * (-0.3-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 17) {
            xx = 0 + (((tickAnim - 15) / 2) * (0-(0)));
            yy = 0.82 + (((tickAnim - 15) / 2) * (0-(0.82)));
            zz = -0.3 + (((tickAnim - 15) / 2) * (-0.3-(-0.3)));
        }
        else if (tickAnim >= 17 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 17) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 17) / 3) * (0.1-(0)));
            zz = -0.3 + (((tickAnim - 17) / 3) * (0-(-0.3)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftLeg4.rotationPointX = this.leftLeg4.rotationPointX + (float)(xx);
        this.leftLeg4.rotationPointY = this.leftLeg4.rotationPointY - (float)(yy);
        this.leftLeg4.rotationPointZ = this.leftLeg4.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (16.08376-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (-3.73239-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (12.72248-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = 16.08376 + (((tickAnim - 10) / 5) * (52.08376-(16.08376)));
            yy = -3.73239 + (((tickAnim - 10) / 5) * (-3.73239-(-3.73239)));
            zz = 12.72248 + (((tickAnim - 10) / 5) * (12.72248-(12.72248)));
        }
        else if (tickAnim >= 15 && tickAnim < 17) {
            xx = 52.08376 + (((tickAnim - 15) / 2) * (52.08376-(52.08376)));
            yy = -3.73239 + (((tickAnim - 15) / 2) * (-3.73239-(-3.73239)));
            zz = 12.72248 + (((tickAnim - 15) / 2) * (12.72248-(12.72248)));
        }
        else if (tickAnim >= 17 && tickAnim < 20) {
            xx = 52.08376 + (((tickAnim - 17) / 3) * (0-(52.08376)));
            yy = -3.73239 + (((tickAnim - 17) / 3) * (0-(-3.73239)));
            zz = 12.72248 + (((tickAnim - 17) / 3) * (0-(12.72248)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftdewclaw, leftdewclaw.rotateAngleX + (float) Math.toRadians(xx), leftdewclaw.rotateAngleY + (float) Math.toRadians(yy), leftdewclaw.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (22.58932-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (-4.30472-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (9.97536-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = 22.58932 + (((tickAnim - 10) / 5) * (67.08932-(22.58932)));
            yy = -4.30472 + (((tickAnim - 10) / 5) * (-4.30472-(-4.30472)));
            zz = 9.97536 + (((tickAnim - 10) / 5) * (9.97536-(9.97536)));
        }
        else if (tickAnim >= 15 && tickAnim < 17) {
            xx = 67.08932 + (((tickAnim - 15) / 2) * (67.08932-(67.08932)));
            yy = -4.30472 + (((tickAnim - 15) / 2) * (-4.30472-(-4.30472)));
            zz = 9.97536 + (((tickAnim - 15) / 2) * (9.97536-(9.97536)));
        }
        else if (tickAnim >= 17 && tickAnim < 20) {
            xx = 67.08932 + (((tickAnim - 17) / 3) * (0-(67.08932)));
            yy = -4.30472 + (((tickAnim - 17) / 3) * (0-(-4.30472)));
            zz = 9.97536 + (((tickAnim - 17) / 3) * (0-(9.97536)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftdewclaw2, leftdewclaw2.rotateAngleX + (float) Math.toRadians(xx), leftdewclaw2.rotateAngleY + (float) Math.toRadians(yy), leftdewclaw2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 32.5 + (((tickAnim - 0) / 5) * (40.895-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*180-(32.5)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 40.895-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*180 + (((tickAnim - 5) / 5) * (-20.74241-(40.895-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*180)));
            yy = 0 + (((tickAnim - 5) / 5) * (1.86861-(0)));
            zz = 0 + (((tickAnim - 5) / 5) * (0.36509-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = -20.74241 + (((tickAnim - 10) / 10) * (32.5-(-20.74241)));
            yy = 1.86861 + (((tickAnim - 10) / 10) * (0-(1.86861)));
            zz = 0.36509 + (((tickAnim - 10) / 10) * (0-(0.36509)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg, rightLeg.rotateAngleX + (float) Math.toRadians(xx), rightLeg.rotateAngleY + (float) Math.toRadians(yy), rightLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 24.2 + (((tickAnim - 0) / 5) * (-129.33-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-50))*250-(24.2)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = -129.33-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-50))*250 + (((tickAnim - 5) / 5) * (-10.25-(-129.33-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-50))*250)));
            yy = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 5) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = -10.25 + (((tickAnim - 10) / 10) * (24.2-(-10.25)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg2, rightLeg2.rotateAngleX + (float) Math.toRadians(xx), rightLeg2.rotateAngleY + (float) Math.toRadians(yy), rightLeg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = -0.5 + (((tickAnim - 0) / 3) * (-1.1-(-0.5)));
            zz = 0 + (((tickAnim - 0) / 3) * (0.25-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 3) / 7) * (0-(0)));
            yy = -1.1 + (((tickAnim - 3) / 7) * (0-(-1.1)));
            zz = 0.25 + (((tickAnim - 3) / 7) * (0-(0.25)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 10) * (-0.5-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
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
            xx = 0 + (((tickAnim - 0) / 3) * (-38.13-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 7) {
            xx = -38.13 + (((tickAnim - 3) / 4) * (-57.19-(-38.13)));
            yy = 0 + (((tickAnim - 3) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 4) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 10) {
            xx = -57.19 + (((tickAnim - 7) / 3) * (-7.75-(-57.19)));
            yy = 0 + (((tickAnim - 7) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 3) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 12) {
            xx = -7.75 + (((tickAnim - 10) / 2) * (-20.65-(-7.75)));
            yy = 0 + (((tickAnim - 10) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 2) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 13) {
            xx = -20.65 + (((tickAnim - 12) / 1) * (1.46-(-20.65)));
            yy = 0 + (((tickAnim - 12) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 1) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 20) {
            xx = 1.46 + (((tickAnim - 13) / 7) * (0-(1.46)));
            yy = 0 + (((tickAnim - 13) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg3, rightLeg3.rotateAngleX + (float) Math.toRadians(xx), rightLeg3.rotateAngleY + (float) Math.toRadians(yy), rightLeg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (-0.7-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (-0.25-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 7) / 3) * (0-(0)));
            yy = -0.7 + (((tickAnim - 7) / 3) * (0-(-0.7)));
            zz = -0.25 + (((tickAnim - 7) / 3) * (0-(-0.25)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 3) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 13) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 13) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 7) * (0-(0)));
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
            xx = 85.5 + (((tickAnim - 0) / 3) * (124.33-(85.5)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 124.33 + (((tickAnim - 3) / 2) * (91.62-(124.33)));
            yy = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 2) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 7) {
            xx = 91.62 + (((tickAnim - 5) / 2) * (85.74599-(91.62)));
            yy = 0 + (((tickAnim - 5) / 2) * (-3.81928-(0)));
            zz = 0 + (((tickAnim - 5) / 2) * (-1.29518-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 10) {
            xx = 85.74599 + (((tickAnim - 7) / 3) * (40.75-(85.74599)));
            yy = -3.81928 + (((tickAnim - 7) / 3) * (0-(-3.81928)));
            zz = -1.29518 + (((tickAnim - 7) / 3) * (0-(-1.29518)));
        }
        else if (tickAnim >= 10 && tickAnim < 12) {
            xx = 40.75 + (((tickAnim - 10) / 2) * (29.59467-(40.75)));
            yy = 0 + (((tickAnim - 10) / 2) * (0.55193-(0)));
            zz = 0 + (((tickAnim - 10) / 2) * (-1.12159-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 13) {
            xx = 29.59467 + (((tickAnim - 12) / 1) * (-7.00678-(29.59467)));
            yy = 0.55193 + (((tickAnim - 12) / 1) * (0.24056-(0.55193)));
            zz = -1.12159 + (((tickAnim - 12) / 1) * (2.42802-(-1.12159)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = -7.00678 + (((tickAnim - 13) / 2) * (26.43-(-7.00678)));
            yy = 0.24056 + (((tickAnim - 13) / 2) * (0-(0.24056)));
            zz = 2.42802 + (((tickAnim - 13) / 2) * (0-(2.42802)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = 26.43 + (((tickAnim - 15) / 5) * (85.5-(26.43)));
            yy = 0 + (((tickAnim - 15) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg4, rightLeg4.rotateAngleX + (float) Math.toRadians(xx), rightLeg4.rotateAngleY + (float) Math.toRadians(yy), rightLeg4.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 3) / 2) * (0.82-(0)));
            zz = 0 + (((tickAnim - 3) / 2) * (-0.3-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 5) / 2) * (0-(0)));
            yy = 0.82 + (((tickAnim - 5) / 2) * (0-(0.82)));
            zz = -0.3 + (((tickAnim - 5) / 2) * (-0.3-(-0.3)));
        }
        else if (tickAnim >= 7 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 7) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 7) / 3) * (-8.325+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*20-(0)));
            zz = -0.3 + (((tickAnim - 7) / 3) * (0-(-0.3)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            yy = -8.325+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*20 + (((tickAnim - 10) / 3) * (-0.225-(-8.325+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*20)));
            zz = 0 + (((tickAnim - 10) / 3) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 13) / 2) * (0-(0)));
            yy = -0.225 + (((tickAnim - 13) / 2) * (0-(-0.225)));
            zz = 0 + (((tickAnim - 13) / 2) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 15) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 15) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightLeg4.rotationPointX = this.rightLeg4.rotationPointX + (float)(xx);
        this.rightLeg4.rotationPointY = this.rightLeg4.rotationPointY - (float)(yy);
        this.rightLeg4.rotationPointZ = this.rightLeg4.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 16.08376 + (((tickAnim - 0) / 5) * (52.08376-(16.08376)));
            yy = -3.73239 + (((tickAnim - 0) / 5) * (-3.73239-(-3.73239)));
            zz = 12.72248 + (((tickAnim - 0) / 5) * (12.72248-(12.72248)));
        }
        else if (tickAnim >= 5 && tickAnim < 7) {
            xx = 52.08376 + (((tickAnim - 5) / 2) * (52.08376-(52.08376)));
            yy = -3.73239 + (((tickAnim - 5) / 2) * (-3.73239-(-3.73239)));
            zz = 12.72248 + (((tickAnim - 5) / 2) * (12.72248-(12.72248)));
        }
        else if (tickAnim >= 7 && tickAnim < 10) {
            xx = 52.08376 + (((tickAnim - 7) / 3) * (0-(52.08376)));
            yy = -3.73239 + (((tickAnim - 7) / 3) * (0-(-3.73239)));
            zz = 12.72248 + (((tickAnim - 7) / 3) * (0-(12.72248)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 10) / 10) * (16.08376-(0)));
            yy = 0 + (((tickAnim - 10) / 10) * (-3.73239-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (12.72248-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightdewclaw, rightdewclaw.rotateAngleX + (float) Math.toRadians(xx), rightdewclaw.rotateAngleY + (float) Math.toRadians(yy), rightdewclaw.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 22.58932 + (((tickAnim - 0) / 5) * (67.08932-(22.58932)));
            yy = -4.30472 + (((tickAnim - 0) / 5) * (-4.30472-(-4.30472)));
            zz = 9.97536 + (((tickAnim - 0) / 5) * (9.97536-(9.97536)));
        }
        else if (tickAnim >= 5 && tickAnim < 7) {
            xx = 67.08932 + (((tickAnim - 5) / 2) * (67.08932-(67.08932)));
            yy = -4.30472 + (((tickAnim - 5) / 2) * (-4.30472-(-4.30472)));
            zz = 9.97536 + (((tickAnim - 5) / 2) * (9.97536-(9.97536)));
        }
        else if (tickAnim >= 7 && tickAnim < 10) {
            xx = 67.08932 + (((tickAnim - 7) / 3) * (0-(67.08932)));
            yy = -4.30472 + (((tickAnim - 7) / 3) * (0-(-4.30472)));
            zz = 9.97536 + (((tickAnim - 7) / 3) * (0-(9.97536)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 10) / 10) * (22.58932-(0)));
            yy = 0 + (((tickAnim - 10) / 10) * (-4.30472-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (9.97536-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightdewclaw2, rightdewclaw2.rotateAngleX + (float) Math.toRadians(xx), rightdewclaw2.rotateAngleY + (float) Math.toRadians(yy), rightdewclaw2.rotateAngleZ + (float) Math.toRadians(zz));

    }
    public void animClimb(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, boolean isStatic) {
        EntityPrehistoricFloraVenetoraptor entity = (EntityPrehistoricFloraVenetoraptor) entitylivingbaseIn;
        int animCycle = 30;
        double tickAnim = 0;
        if (!isStatic) {
            tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        }
        double xx = 0;
        double yy = 0;
        double zz = 0;
        this.setRotateAngle(hips, hips.rotateAngleX + (float) Math.toRadians(-70.5-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480-50))*5), hips.rotateAngleY + (float) Math.toRadians(0), hips.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240-50))*-5));
        this.hips.rotationPointX = this.hips.rotationPointX + (float)(0);
        this.hips.rotationPointY = this.hips.rotationPointY - (float)(1.775+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240/0.5-50))*-1);
        this.hips.rotationPointZ = this.hips.rotationPointZ + (float)(-11.375);


        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(4.25-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480-30))*-5), body.rotateAngleY + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240-70))*5), body.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(7.25-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480-80))*-5), chest.rotateAngleY + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240-90))*-5), chest.rotateAngleZ + (float) Math.toRadians(0));



        if (tickAnim >= 0 && tickAnim < 15) {
            xx = -44.35049 + (((tickAnim - 0) / 15) * (25.16061-(-44.35049)));
            yy = 18.47284 + (((tickAnim - 0) / 15) * (24.34443-(18.47284)));
            zz = -53.62485 + (((tickAnim - 0) / 15) * (-6.88486-(-53.62485)));
        }
        else if (tickAnim >= 15 && tickAnim < 23) {
            xx = 25.16061 + (((tickAnim - 15) / 8) * (-12.16237-(25.16061)));
            yy = 24.34443 + (((tickAnim - 15) / 8) * (-8.87525-(24.34443)));
            zz = -6.88486 + (((tickAnim - 15) / 8) * (-66.58613-(-6.88486)));
        }
        else if (tickAnim >= 23 && tickAnim < 30) {
            xx = -12.16237 + (((tickAnim - 23) / 7) * (-44.35049-(-12.16237)));
            yy = -8.87525 + (((tickAnim - 23) / 7) * (18.47284-(-8.87525)));
            zz = -66.58613 + (((tickAnim - 23) / 7) * (-53.62485-(-66.58613)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm, leftArm.rotateAngleX + (float) Math.toRadians(xx), leftArm.rotateAngleY + (float) Math.toRadians(yy), leftArm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 16.14141 + (((tickAnim - 0) / 15) * (26.75-(16.14141)));
            yy = 3.1786 + (((tickAnim - 0) / 15) * (0-(3.1786)));
            zz = -12.86971 + (((tickAnim - 0) / 15) * (0-(-12.86971)));
        }
        else if (tickAnim >= 15 && tickAnim < 23) {
            xx = 26.75 + (((tickAnim - 15) / 8) * (0.03424-(26.75)));
            yy = 0 + (((tickAnim - 15) / 8) * (-0.41249-(0)));
            zz = 0 + (((tickAnim - 15) / 8) * (-12.74112-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 30) {
            xx = 0.03424 + (((tickAnim - 23) / 7) * (16.14141-(0.03424)));
            yy = -0.41249 + (((tickAnim - 23) / 7) * (3.1786-(-0.41249)));
            zz = -12.74112 + (((tickAnim - 23) / 7) * (-12.86971-(-12.74112)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm2, leftArm2.rotateAngleX + (float) Math.toRadians(xx), leftArm2.rotateAngleY + (float) Math.toRadians(yy), leftArm2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 2.88373 + (((tickAnim - 0) / 8) * (-34.34714-(2.88373)));
            yy = 23.74487 + (((tickAnim - 0) / 8) * (46.10124-(23.74487)));
            zz = 24.36287 + (((tickAnim - 0) / 8) * (21.50757-(24.36287)));
        }
        else if (tickAnim >= 8 && tickAnim < 15) {
            xx = -34.34714 + (((tickAnim - 8) / 7) * (-48.84539-(-34.34714)));
            yy = 46.10124 + (((tickAnim - 8) / 7) * (45.33344-(46.10124)));
            zz = 21.50757 + (((tickAnim - 8) / 7) * (-4.99636-(21.50757)));
        }
        else if (tickAnim >= 15 && tickAnim < 23) {
            xx = -48.84539 + (((tickAnim - 15) / 8) * (4.54951-(-48.84539)));
            yy = 45.33344 + (((tickAnim - 15) / 8) * (-22.17736-(45.33344)));
            zz = -4.99636 + (((tickAnim - 15) / 8) * (-0.26398-(-4.99636)));
        }
        else if (tickAnim >= 23 && tickAnim < 30) {
            xx = 4.54951 + (((tickAnim - 23) / 7) * (2.88373-(4.54951)));
            yy = -22.17736 + (((tickAnim - 23) / 7) * (23.74487-(-22.17736)));
            zz = -0.26398 + (((tickAnim - 23) / 7) * (24.36287-(-0.26398)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm3, leftArm3.rotateAngleX + (float) Math.toRadians(xx), leftArm3.rotateAngleY + (float) Math.toRadians(yy), leftArm3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (0.325-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (-0.275-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 30) {
            xx = 0.325 + (((tickAnim - 15) / 15) * (0-(0.325)));
            yy = 0 + (((tickAnim - 15) / 15) * (0-(0)));
            zz = -0.275 + (((tickAnim - 15) / 15) * (0-(-0.275)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftArm3.rotationPointX = this.leftArm3.rotationPointX + (float)(xx);
        this.leftArm3.rotationPointY = this.leftArm3.rotationPointY - (float)(yy);
        this.leftArm3.rotationPointZ = this.leftArm3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 25.16061 + (((tickAnim - 0) / 8) * (-12.16237-(25.16061)));
            yy = -24.34443 + (((tickAnim - 0) / 8) * (8.87525-(-24.34443)));
            zz = 6.88486 + (((tickAnim - 0) / 8) * (66.58613-(6.88486)));
        }
        else if (tickAnim >= 8 && tickAnim < 15) {
            xx = -12.16237 + (((tickAnim - 8) / 7) * (-44.35049-(-12.16237)));
            yy = 8.87525 + (((tickAnim - 8) / 7) * (-18.47284-(8.87525)));
            zz = 66.58613 + (((tickAnim - 8) / 7) * (53.62485-(66.58613)));
        }
        else if (tickAnim >= 15 && tickAnim < 30) {
            xx = -44.35049 + (((tickAnim - 15) / 15) * (25.16061-(-44.35049)));
            yy = -18.47284 + (((tickAnim - 15) / 15) * (-24.34443-(-18.47284)));
            zz = 53.62485 + (((tickAnim - 15) / 15) * (6.88486-(53.62485)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm, rightArm.rotateAngleX + (float) Math.toRadians(xx), rightArm.rotateAngleY + (float) Math.toRadians(yy), rightArm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 26.75 + (((tickAnim - 0) / 8) * (0.03424-(26.75)));
            yy = 0 + (((tickAnim - 0) / 8) * (0.41249-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (12.74112-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 15) {
            xx = 0.03424 + (((tickAnim - 8) / 7) * (19.5-(0.03424)));
            yy = 0.41249 + (((tickAnim - 8) / 7) * (0-(0.41249)));
            zz = 12.74112 + (((tickAnim - 8) / 7) * (0-(12.74112)));
        }
        else if (tickAnim >= 15 && tickAnim < 30) {
            xx = 19.5 + (((tickAnim - 15) / 15) * (26.75-(19.5)));
            yy = 0 + (((tickAnim - 15) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm2, rightArm2.rotateAngleX + (float) Math.toRadians(xx), rightArm2.rotateAngleY + (float) Math.toRadians(yy), rightArm2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = -48.84539 + (((tickAnim - 0) / 8) * (4.54951-(-48.84539)));
            yy = -45.33344 + (((tickAnim - 0) / 8) * (22.17736-(-45.33344)));
            zz = 4.99636 + (((tickAnim - 0) / 8) * (0.26398-(4.99636)));
        }
        else if (tickAnim >= 8 && tickAnim < 15) {
            xx = 4.54951 + (((tickAnim - 8) / 7) * (8.49479-(4.54951)));
            yy = 22.17736 + (((tickAnim - 8) / 7) * (-41.50074-(22.17736)));
            zz = 0.26398 + (((tickAnim - 8) / 7) * (-20.42832-(0.26398)));
        }
        else if (tickAnim >= 15 && tickAnim < 23) {
            xx = 8.49479 + (((tickAnim - 15) / 8) * (-38.20028-(8.49479)));
            yy = -41.50074 + (((tickAnim - 15) / 8) * (-57.44054-(-41.50074)));
            zz = -20.42832 + (((tickAnim - 15) / 8) * (-4.75578-(-20.42832)));
        }
        else if (tickAnim >= 23 && tickAnim < 30) {
            xx = -38.20028 + (((tickAnim - 23) / 7) * (-48.84539-(-38.20028)));
            yy = -57.44054 + (((tickAnim - 23) / 7) * (-45.33344-(-57.44054)));
            zz = -4.75578 + (((tickAnim - 23) / 7) * (4.99636-(-4.75578)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm3, rightArm3.rotateAngleX + (float) Math.toRadians(xx), rightArm3.rotateAngleY + (float) Math.toRadians(yy), rightArm3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0.325 + (((tickAnim - 0) / 15) * (0-(0.325)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = -0.275 + (((tickAnim - 0) / 15) * (0-(-0.275)));
        }
        else if (tickAnim >= 15 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 15) / 15) * (0.325-(0)));
            yy = 0 + (((tickAnim - 15) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 15) * (-0.275-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightArm3.rotationPointX = this.rightArm3.rotationPointX + (float)(xx);
        this.rightArm3.rotationPointY = this.rightArm3.rotationPointY - (float)(yy);
        this.rightArm3.rotationPointZ = this.rightArm3.rotationPointZ + (float)(zz);



        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(25.25-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480-20))*5), neck3.rotateAngleY + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240-90))*5), neck3.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(-33.75), neck.rotateAngleY + (float) Math.toRadians(0), neck.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tail, tail.rotateAngleX + (float) Math.toRadians(-7.25-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480-120))*5), tail.rotateAngleY + (float) Math.toRadians(0), tail.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(-7.25-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480-190))*5), tail2.rotateAngleY + (float) Math.toRadians(0), tail2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(-12-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480-240))*5), tail3.rotateAngleY + (float) Math.toRadians(0), tail3.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480-290))*5), tail4.rotateAngleY + (float) Math.toRadians(0), tail4.rotateAngleZ + (float) Math.toRadians(0));



        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 37.75 + (((tickAnim - 0) / 7) * (-17.04968-(37.75)));
            yy = 0 + (((tickAnim - 0) / 7) * (-1.8038-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (-1.1397-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 13) {
            xx = -17.04968 + (((tickAnim - 7) / 6) * (-39.1869-(-17.04968)));
            yy = -1.8038 + (((tickAnim - 7) / 6) * (-3.38213-(-1.8038)));
            zz = -1.1397 + (((tickAnim - 7) / 6) * (-2.13694-(-1.1397)));
        }
        else if (tickAnim >= 13 && tickAnim < 30) {
            xx = -39.1869 + (((tickAnim - 13) / 17) * (37.75-(-39.1869)));
            yy = -3.38213 + (((tickAnim - 13) / 17) * (0-(-3.38213)));
            zz = -2.13694 + (((tickAnim - 13) / 17) * (0-(-2.13694)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg, leftLeg.rotateAngleX + (float) Math.toRadians(xx), leftLeg.rotateAngleY + (float) Math.toRadians(yy), leftLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 12 + (((tickAnim - 0) / 3) * (37.07-(12)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 7) {
            xx = 37.07 + (((tickAnim - 3) / 4) * (52.85-(37.07)));
            yy = 0 + (((tickAnim - 3) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 4) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 13) {
            xx = 52.85 + (((tickAnim - 7) / 6) * (33.12772-(52.85)));
            yy = 0 + (((tickAnim - 7) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 6) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 21) {
            xx = 33.12772 + (((tickAnim - 13) / 8) * (42.2-(33.12772)));
            yy = 0 + (((tickAnim - 13) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 8) * (0-(0)));
        }
        else if (tickAnim >= 21 && tickAnim < 30) {
            xx = 42.2 + (((tickAnim - 21) / 9) * (12-(42.2)));
            yy = 0 + (((tickAnim - 21) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 21) / 9) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg2, leftLeg2.rotateAngleX + (float) Math.toRadians(xx), leftLeg2.rotateAngleY + (float) Math.toRadians(yy), leftLeg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (-1.085-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0.27-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 3) / 4) * (0-(0)));
            yy = -1.085 + (((tickAnim - 3) / 4) * (-1.75-(-1.085)));
            zz = 0.27 + (((tickAnim - 3) / 4) * (0.72-(0.27)));
        }
        else if (tickAnim >= 7 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 7) / 6) * (0-(0)));
            yy = -1.75 + (((tickAnim - 7) / 6) * (-0.75-(-1.75)));
            zz = 0.72 + (((tickAnim - 7) / 6) * (0-(0.72)));
        }
        else if (tickAnim >= 13 && tickAnim < 21) {
            xx = 0 + (((tickAnim - 13) / 8) * (0-(0)));
            yy = -0.75 + (((tickAnim - 13) / 8) * (-1.34-(-0.75)));
            zz = 0 + (((tickAnim - 13) / 8) * (0.46-(0)));
        }
        else if (tickAnim >= 21 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 21) / 9) * (0-(0)));
            yy = -1.34 + (((tickAnim - 21) / 9) * (0-(-1.34)));
            zz = 0.46 + (((tickAnim - 21) / 9) * (0-(0.46)));
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
            xx = 10.75 + (((tickAnim - 0) / 5) * (-117.4-(10.75)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 13) {
            xx = -117.4 + (((tickAnim - 5) / 8) * (-59.5-(-117.4)));
            yy = 0 + (((tickAnim - 5) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 8) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 25) {
            xx = -59.5 + (((tickAnim - 13) / 12) * (-75.60986-(-59.5)));
            yy = 0 + (((tickAnim - 13) / 12) * (-0.18124-(0)));
            zz = 0 + (((tickAnim - 13) / 12) * (-0.01255-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 30) {
            xx = -75.60986 + (((tickAnim - 25) / 5) * (10.75-(-75.60986)));
            yy = -0.18124 + (((tickAnim - 25) / 5) * (0-(-0.18124)));
            zz = -0.01255 + (((tickAnim - 25) / 5) * (0-(-0.01255)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg3, leftLeg3.rotateAngleX + (float) Math.toRadians(xx), leftLeg3.rotateAngleY + (float) Math.toRadians(yy), leftLeg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (-0.225-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (-1.365-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 5) / 8) * (0-(0)));
            yy = -0.225 + (((tickAnim - 5) / 8) * (-0.4-(-0.225)));
            zz = -1.365 + (((tickAnim - 5) / 8) * (0-(-1.365)));
        }
        else if (tickAnim >= 13 && tickAnim < 21) {
            xx = 0 + (((tickAnim - 13) / 8) * (0-(0)));
            yy = -0.4 + (((tickAnim - 13) / 8) * (-0.75-(-0.4)));
            zz = 0 + (((tickAnim - 13) / 8) * (-0.78-(0)));
        }
        else if (tickAnim >= 21 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 21) / 4) * (0-(0)));
            yy = -0.75 + (((tickAnim - 21) / 4) * (-0.8-(-0.75)));
            zz = -0.78 + (((tickAnim - 21) / 4) * (-0.6-(-0.78)));
        }
        else if (tickAnim >= 25 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 25) / 5) * (0-(0)));
            yy = -0.8 + (((tickAnim - 25) / 5) * (0-(-0.8)));
            zz = -0.6 + (((tickAnim - 25) / 5) * (0-(-0.6)));
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
            xx = 99.25 + (((tickAnim - 0) / 3) * (163.25-(99.25)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 163.25 + (((tickAnim - 3) / 2) * (158.62-(163.25)));
            yy = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 2) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 7) {
            xx = 158.62 + (((tickAnim - 5) / 2) * (86.29-(158.62)));
            yy = 0 + (((tickAnim - 5) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 2) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 13) {
            xx = 86.29 + (((tickAnim - 7) / 6) * (48-(86.29)));
            yy = 0 + (((tickAnim - 7) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 6) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 21) {
            xx = 48 + (((tickAnim - 13) / 8) * (13.95-(48)));
            yy = 0 + (((tickAnim - 13) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 8) * (0-(0)));
        }
        else if (tickAnim >= 21 && tickAnim < 25) {
            xx = 13.95 + (((tickAnim - 21) / 4) * (72.75-(13.95)));
            yy = 0 + (((tickAnim - 21) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 21) / 4) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 30) {
            xx = 72.75 + (((tickAnim - 25) / 5) * (99.25-(72.75)));
            yy = 0 + (((tickAnim - 25) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg4, leftLeg4.rotateAngleX + (float) Math.toRadians(xx), leftLeg4.rotateAngleY + (float) Math.toRadians(yy), leftLeg4.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (-0.375-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (-0.225-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            yy = -0.375 + (((tickAnim - 3) / 2) * (-0.19-(-0.375)));
            zz = -0.225 + (((tickAnim - 3) / 2) * (-0.46-(-0.225)));
        }
        else if (tickAnim >= 5 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 5) / 2) * (0-(0)));
            yy = -0.19 + (((tickAnim - 5) / 2) * (0-(-0.19)));
            zz = -0.46 + (((tickAnim - 5) / 2) * (0-(-0.46)));
        }
        else if (tickAnim >= 7 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 7) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 7) / 6) * (1.05-(0)));
            zz = 0 + (((tickAnim - 7) / 6) * (-0.65-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 21) {
            xx = 0 + (((tickAnim - 13) / 8) * (0-(0)));
            yy = 1.05 + (((tickAnim - 13) / 8) * (-0.55-(1.05)));
            zz = -0.65 + (((tickAnim - 13) / 8) * (0-(-0.65)));
        }
        else if (tickAnim >= 21 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 21) / 4) * (0-(0)));
            yy = -0.55 + (((tickAnim - 21) / 4) * (1.3-(-0.55)));
            zz = 0 + (((tickAnim - 21) / 4) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 27) {
            xx = 0 + (((tickAnim - 25) / 2) * (0-(0)));
            yy = 1.3 + (((tickAnim - 25) / 2) * (2.12-(1.3)));
            zz = 0 + (((tickAnim - 25) / 2) * (-0.25-(0)));
        }
        else if (tickAnim >= 27 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 27) / 3) * (0-(0)));
            yy = 2.12 + (((tickAnim - 27) / 3) * (0-(2.12)));
            zz = -0.25 + (((tickAnim - 27) / 3) * (0-(-0.25)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftLeg4.rotationPointX = this.leftLeg4.rotationPointX + (float)(xx);
        this.leftLeg4.rotationPointY = this.leftLeg4.rotationPointY - (float)(yy);
        this.leftLeg4.rotationPointZ = this.leftLeg4.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 29 + (((tickAnim - 0) / 7) * (0-(29)));
            yy = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 7) / 6) * (22-(0)));
            yy = 0 + (((tickAnim - 7) / 6) * (-11.5-(0)));
            zz = 0 + (((tickAnim - 7) / 6) * (12-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 30) {
            xx = 22 + (((tickAnim - 13) / 17) * (29-(22)));
            yy = -11.5 + (((tickAnim - 13) / 17) * (0-(-11.5)));
            zz = 12 + (((tickAnim - 13) / 17) * (0-(12)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftdewclaw, leftdewclaw.rotateAngleX + (float) Math.toRadians(xx), leftdewclaw.rotateAngleY + (float) Math.toRadians(yy), leftdewclaw.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 42.5 + (((tickAnim - 0) / 7) * (56.5-(42.5)));
            yy = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 10) {
            xx = 56.5 + (((tickAnim - 7) / 3) * (25.45201-(56.5)));
            yy = 0 + (((tickAnim - 7) / 3) * (-3.41479-(0)));
            zz = 0 + (((tickAnim - 7) / 3) * (9.76899-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 25.45201 + (((tickAnim - 10) / 3) * (24.91602-(25.45201)));
            yy = -3.41479 + (((tickAnim - 10) / 3) * (-5.97589-(-3.41479)));
            zz = 9.76899 + (((tickAnim - 10) / 3) * (17.09574-(9.76899)));
        }
        else if (tickAnim >= 13 && tickAnim < 30) {
            xx = 24.91602 + (((tickAnim - 13) / 17) * (42.5-(24.91602)));
            yy = -5.97589 + (((tickAnim - 13) / 17) * (0-(-5.97589)));
            zz = 17.09574 + (((tickAnim - 13) / 17) * (0-(17.09574)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftdewclaw2, leftdewclaw2.rotateAngleX + (float) Math.toRadians(xx), leftdewclaw2.rotateAngleY + (float) Math.toRadians(yy), leftdewclaw2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = -39.1869 + (((tickAnim - 0) / 18) * (37.75-(-39.1869)));
            yy = 3.38213 + (((tickAnim - 0) / 18) * (0-(3.38213)));
            zz = 2.13694 + (((tickAnim - 0) / 18) * (0-(2.13694)));
        }
        else if (tickAnim >= 18 && tickAnim < 24) {
            xx = 37.75 + (((tickAnim - 18) / 6) * (-17.04968-(37.75)));
            yy = 0 + (((tickAnim - 18) / 6) * (1.8038-(0)));
            zz = 0 + (((tickAnim - 18) / 6) * (1.1397-(0)));
        }
        else if (tickAnim >= 24 && tickAnim < 30) {
            xx = -17.04968 + (((tickAnim - 24) / 6) * (-39.1869-(-17.04968)));
            yy = 1.8038 + (((tickAnim - 24) / 6) * (3.38213-(1.8038)));
            zz = 1.1397 + (((tickAnim - 24) / 6) * (2.13694-(1.1397)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg, rightLeg.rotateAngleX + (float) Math.toRadians(xx), rightLeg.rotateAngleY + (float) Math.toRadians(yy), rightLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 33.12772 + (((tickAnim - 0) / 8) * (42.2-(33.12772)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 18) {
            xx = 42.2 + (((tickAnim - 8) / 10) * (12-(42.2)));
            yy = 0 + (((tickAnim - 8) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 10) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 21) {
            xx = 12 + (((tickAnim - 18) / 3) * (37.07-(12)));
            yy = 0 + (((tickAnim - 18) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 3) * (0-(0)));
        }
        else if (tickAnim >= 21 && tickAnim < 24) {
            xx = 37.07 + (((tickAnim - 21) / 3) * (52.85-(37.07)));
            yy = 0 + (((tickAnim - 21) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 21) / 3) * (0-(0)));
        }
        else if (tickAnim >= 24 && tickAnim < 30) {
            xx = 52.85 + (((tickAnim - 24) / 6) * (33.12772-(52.85)));
            yy = 0 + (((tickAnim - 24) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 24) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg2, rightLeg2.rotateAngleX + (float) Math.toRadians(xx), rightLeg2.rotateAngleY + (float) Math.toRadians(yy), rightLeg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            yy = -0.75 + (((tickAnim - 0) / 8) * (-1.34-(-0.75)));
            zz = 0 + (((tickAnim - 0) / 8) * (0.46-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 8) / 10) * (0-(0)));
            yy = -1.34 + (((tickAnim - 8) / 10) * (0-(-1.34)));
            zz = 0.46 + (((tickAnim - 8) / 10) * (0-(0.46)));
        }
        else if (tickAnim >= 18 && tickAnim < 21) {
            xx = 0 + (((tickAnim - 18) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 18) / 3) * (-1.085-(0)));
            zz = 0 + (((tickAnim - 18) / 3) * (0.27-(0)));
        }
        else if (tickAnim >= 21 && tickAnim < 24) {
            xx = 0 + (((tickAnim - 21) / 3) * (0-(0)));
            yy = -1.085 + (((tickAnim - 21) / 3) * (-1.75-(-1.085)));
            zz = 0.27 + (((tickAnim - 21) / 3) * (0.72-(0.27)));
        }
        else if (tickAnim >= 24 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 24) / 6) * (0-(0)));
            yy = -1.75 + (((tickAnim - 24) / 6) * (-0.75-(-1.75)));
            zz = 0.72 + (((tickAnim - 24) / 6) * (0-(0.72)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightLeg2.rotationPointX = this.rightLeg2.rotationPointX + (float)(xx);
        this.rightLeg2.rotationPointY = this.rightLeg2.rotationPointY - (float)(yy);
        this.rightLeg2.rotationPointZ = this.rightLeg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = -59.5 + (((tickAnim - 0) / 13) * (-75.60986-(-59.5)));
            yy = 0 + (((tickAnim - 0) / 13) * (-0.18124-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (-0.01255-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
            xx = -75.60986 + (((tickAnim - 13) / 5) * (10.75-(-75.60986)));
            yy = -0.18124 + (((tickAnim - 13) / 5) * (0-(-0.18124)));
            zz = -0.01255 + (((tickAnim - 13) / 5) * (0-(-0.01255)));
        }
        else if (tickAnim >= 18 && tickAnim < 23) {
            xx = 10.75 + (((tickAnim - 18) / 5) * (-117.4-(10.75)));
            yy = 0 + (((tickAnim - 18) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 5) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 30) {
            xx = -117.4 + (((tickAnim - 23) / 7) * (-59.5-(-117.4)));
            yy = 0 + (((tickAnim - 23) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg3, rightLeg3.rotateAngleX + (float) Math.toRadians(xx), rightLeg3.rotateAngleY + (float) Math.toRadians(yy), rightLeg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            yy = -0.4 + (((tickAnim - 0) / 8) * (-0.75-(-0.4)));
            zz = 0 + (((tickAnim - 0) / 8) * (-0.78-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 8) / 5) * (0-(0)));
            yy = -0.75 + (((tickAnim - 8) / 5) * (-0.8-(-0.75)));
            zz = -0.78 + (((tickAnim - 8) / 5) * (-0.6-(-0.78)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 13) / 5) * (0-(0)));
            yy = -0.8 + (((tickAnim - 13) / 5) * (0-(-0.8)));
            zz = -0.6 + (((tickAnim - 13) / 5) * (0-(-0.6)));
        }
        else if (tickAnim >= 18 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 18) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 18) / 5) * (-0.225-(0)));
            zz = 0 + (((tickAnim - 18) / 5) * (-1.365-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 23) / 7) * (0-(0)));
            yy = -0.225 + (((tickAnim - 23) / 7) * (-0.4-(-0.225)));
            zz = -1.365 + (((tickAnim - 23) / 7) * (0-(-1.365)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightLeg3.rotationPointX = this.rightLeg3.rotationPointX + (float)(xx);
        this.rightLeg3.rotationPointY = this.rightLeg3.rotationPointY - (float)(yy);
        this.rightLeg3.rotationPointZ = this.rightLeg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 48 + (((tickAnim - 0) / 8) * (13.95-(48)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = 13.95 + (((tickAnim - 8) / 5) * (72.75-(13.95)));
            yy = 0 + (((tickAnim - 8) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 5) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
            xx = 72.75 + (((tickAnim - 13) / 5) * (99.25-(72.75)));
            yy = 0 + (((tickAnim - 13) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 5) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 21) {
            xx = 99.25 + (((tickAnim - 18) / 3) * (163.25-(99.25)));
            yy = 0 + (((tickAnim - 18) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 3) * (0-(0)));
        }
        else if (tickAnim >= 21 && tickAnim < 23) {
            xx = 163.25 + (((tickAnim - 21) / 2) * (158.62-(163.25)));
            yy = 0 + (((tickAnim - 21) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 21) / 2) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 24) {
            xx = 158.62 + (((tickAnim - 23) / 1) * (86.29-(158.62)));
            yy = 0 + (((tickAnim - 23) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 1) * (0-(0)));
        }
        else if (tickAnim >= 24 && tickAnim < 30) {
            xx = 86.29 + (((tickAnim - 24) / 6) * (48-(86.29)));
            yy = 0 + (((tickAnim - 24) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 24) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg4, rightLeg4.rotateAngleX + (float) Math.toRadians(xx), rightLeg4.rotateAngleY + (float) Math.toRadians(yy), rightLeg4.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            yy = 1.05 + (((tickAnim - 0) / 8) * (-0.55-(1.05)));
            zz = -0.65 + (((tickAnim - 0) / 8) * (0-(-0.65)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 8) / 5) * (0-(0)));
            yy = -0.55 + (((tickAnim - 8) / 5) * (1.3-(-0.55)));
            zz = 0 + (((tickAnim - 8) / 5) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 13) / 1) * (0-(0)));
            yy = 1.3 + (((tickAnim - 13) / 1) * (2.12-(1.3)));
            zz = 0 + (((tickAnim - 13) / 1) * (-0.25-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 14) / 4) * (0-(0)));
            yy = 2.12 + (((tickAnim - 14) / 4) * (0-(2.12)));
            zz = -0.25 + (((tickAnim - 14) / 4) * (0-(-0.25)));
        }
        else if (tickAnim >= 18 && tickAnim < 21) {
            xx = 0 + (((tickAnim - 18) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 18) / 3) * (-0.375-(0)));
            zz = 0 + (((tickAnim - 18) / 3) * (-0.225-(0)));
        }
        else if (tickAnim >= 21 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 21) / 2) * (0-(0)));
            yy = -0.375 + (((tickAnim - 21) / 2) * (-0.19-(-0.375)));
            zz = -0.225 + (((tickAnim - 21) / 2) * (-0.46-(-0.225)));
        }
        else if (tickAnim >= 23 && tickAnim < 24) {
            xx = 0 + (((tickAnim - 23) / 1) * (0-(0)));
            yy = -0.19 + (((tickAnim - 23) / 1) * (0-(-0.19)));
            zz = -0.46 + (((tickAnim - 23) / 1) * (0-(-0.46)));
        }
        else if (tickAnim >= 24 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 24) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 24) / 6) * (1.05-(0)));
            zz = 0 + (((tickAnim - 24) / 6) * (-0.65-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightLeg4.rotationPointX = this.rightLeg4.rotationPointX + (float)(xx);
        this.rightLeg4.rotationPointY = this.rightLeg4.rotationPointY - (float)(yy);
        this.rightLeg4.rotationPointZ = this.rightLeg4.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 22 + (((tickAnim - 0) / 18) * (29-(22)));
            yy = 11.5 + (((tickAnim - 0) / 18) * (0-(11.5)));
            zz = -12 + (((tickAnim - 0) / 18) * (0-(-12)));
        }
        else if (tickAnim >= 18 && tickAnim < 30) {
            xx = 29 + (((tickAnim - 18) / 12) * (22-(29)));
            yy = 0 + (((tickAnim - 18) / 12) * (11.5-(0)));
            zz = 0 + (((tickAnim - 18) / 12) * (-12-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightdewclaw, rightdewclaw.rotateAngleX + (float) Math.toRadians(xx), rightdewclaw.rotateAngleY + (float) Math.toRadians(yy), rightdewclaw.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 24.91602 + (((tickAnim - 0) / 18) * (42.5-(24.91602)));
            yy = 5.97589 + (((tickAnim - 0) / 18) * (0-(5.97589)));
            zz = -17.09574 + (((tickAnim - 0) / 18) * (0-(-17.09574)));
        }
        else if (tickAnim >= 18 && tickAnim < 30) {
            xx = 42.5 + (((tickAnim - 18) / 12) * (24.91602-(42.5)));
            yy = 0 + (((tickAnim - 18) / 12) * (5.97589-(0)));
            zz = 0 + (((tickAnim - 18) / 12) * (-17.09574-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightdewclaw2, rightdewclaw2.rotateAngleX + (float) Math.toRadians(xx), rightdewclaw2.rotateAngleY + (float) Math.toRadians(yy), rightdewclaw2.rotateAngleZ + (float) Math.toRadians(zz));

    }

    public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        EntityPrehistoricFloraVenetoraptor e = (EntityPrehistoricFloraVenetoraptor) entity;
        animator.update(entity);
        //this.resetToDefaultPose();

    }
}
