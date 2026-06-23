package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.EntityPrehistoricFloraScutellosaurus;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;

public class ModelScutellosaurus extends ModelBasePalaeopedia {
    private final AdvancedModelRenderer hip;
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
    private final AdvancedModelRenderer body;
    private final AdvancedModelRenderer cube_r16;
    private final AdvancedModelRenderer cube_r17;
    private final AdvancedModelRenderer cube_r18;
    private final AdvancedModelRenderer cube_r19;
    private final AdvancedModelRenderer cube_r20;
    private final AdvancedModelRenderer chest;
    private final AdvancedModelRenderer cube_r21;
    private final AdvancedModelRenderer cube_r22;
    private final AdvancedModelRenderer cube_r23;
    private final AdvancedModelRenderer cube_r24;
    private final AdvancedModelRenderer cube_r25;
    private final AdvancedModelRenderer cube_r26;
    private final AdvancedModelRenderer cube_r27;
    private final AdvancedModelRenderer leftArm;
    private final AdvancedModelRenderer leftArm2;
    private final AdvancedModelRenderer leftArm3;
    private final AdvancedModelRenderer rightArm;
    private final AdvancedModelRenderer rightArm2;
    private final AdvancedModelRenderer rightArm3;
    private final AdvancedModelRenderer notmove;
    private final AdvancedModelRenderer cube_r28;
    private final AdvancedModelRenderer cube_r29;
    private final AdvancedModelRenderer cube_r30;
    private final AdvancedModelRenderer cube_r31;
    private final AdvancedModelRenderer neck1;
    private final AdvancedModelRenderer cube_r32;
    private final AdvancedModelRenderer cube_r33;
    private final AdvancedModelRenderer neck2;
    private final AdvancedModelRenderer cube_r34;
    private final AdvancedModelRenderer cube_r35;
    private final AdvancedModelRenderer cube_r36;
    private final AdvancedModelRenderer neck3;
    private final AdvancedModelRenderer cube_r37;
    private final AdvancedModelRenderer cube_r38;
    private final AdvancedModelRenderer cube_r39;
    private final AdvancedModelRenderer head;
    private final AdvancedModelRenderer cube_r40;
    private final AdvancedModelRenderer cube_r41;
    private final AdvancedModelRenderer cube_r42;
    private final AdvancedModelRenderer cube_r43;
    private final AdvancedModelRenderer cube_r44;
    private final AdvancedModelRenderer cube_r45;
    private final AdvancedModelRenderer cube_r46;
    private final AdvancedModelRenderer cube_r47;
    private final AdvancedModelRenderer cube_r48;
    private final AdvancedModelRenderer cube_r49;
    private final AdvancedModelRenderer jaw;
    private final AdvancedModelRenderer cube_r50;
    private final AdvancedModelRenderer cube_r51;
    private final AdvancedModelRenderer cube_r52;
    private final AdvancedModelRenderer cube_r53;
    private final AdvancedModelRenderer cube_r54;
    private final AdvancedModelRenderer cube_r55;
    private final AdvancedModelRenderer eyes;
    private final AdvancedModelRenderer cube_r56;
    private final AdvancedModelRenderer leftLeg;
    private final AdvancedModelRenderer cube_r57;
    private final AdvancedModelRenderer leftLeg2;
    private final AdvancedModelRenderer leftLeg3;
    private final AdvancedModelRenderer leftLeg4;
    private final AdvancedModelRenderer rightLeg;
    private final AdvancedModelRenderer cube_r58;
    private final AdvancedModelRenderer rightLeg2;
    private final AdvancedModelRenderer rightLeg3;
    private final AdvancedModelRenderer rightLeg4;
    private final AdvancedModelRenderer tail1;
    private final AdvancedModelRenderer cube_r59;
    private final AdvancedModelRenderer cube_r60;
    private final AdvancedModelRenderer cube_r61;
    private final AdvancedModelRenderer cube_r62;
    private final AdvancedModelRenderer cube_r63;
    private final AdvancedModelRenderer cube_r64;
    private final AdvancedModelRenderer tail2;
    private final AdvancedModelRenderer cube_r65;
    private final AdvancedModelRenderer cube_r66;
    private final AdvancedModelRenderer cube_r67;
    private final AdvancedModelRenderer cube_r68;
    private final AdvancedModelRenderer tail3;
    private final AdvancedModelRenderer cube_r69;
    private final AdvancedModelRenderer cube_r70;
    private final AdvancedModelRenderer cube_r71;
    private final AdvancedModelRenderer cube_r72;
    private final AdvancedModelRenderer tail4;
    private final AdvancedModelRenderer cube_r73;
    private final AdvancedModelRenderer cube_r74;
    private final AdvancedModelRenderer cube_r75;
    private final AdvancedModelRenderer cube_r76;

    private ModelAnimator animator;

    public ModelScutellosaurus() {
        this.textureWidth = 50;
        this.textureHeight = 50;

        this.hip = new AdvancedModelRenderer(this);
        this.hip.setRotationPoint(0.0F, 14.5F, 4.0F);
        this.hip.cubeList.add(new ModelBox(hip, 32, 24, -1.5F, -2.75F, 2.0F, 3, 4, 4, 0.01F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(1.5F, -1.6085F, 4.4982F);
        this.hip.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.0F, -0.1047F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 21, 3, -0.5F, 0.0F, -1.5F, 1, 0, 3, 0.0F, true));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(1.55F, -1.2585F, 1.5482F);
        this.hip.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.0F, -0.1396F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 21, 0, -1.0F, 0.0F, -1.5F, 2, 0, 3, 0.0F, true));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(1.25F, -2.25F, 4.5F);
        this.hip.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.0F, -0.1309F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 10, 23, -0.3F, 0.0F, -1.5F, 1, 0, 3, 0.0F, true));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(0.8405F, -3.15F, 4.4441F);
        this.hip.addChild(cube_r4);
        this.setRotateAngle(cube_r4, -0.0351F, -0.1047F, 0.0037F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 0, 1, 0.0F, -0.5F, -1.5F, 0, 1, 3, 0.0F, true));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(2.152F, -2.311F, 1.9284F);
        this.hip.addChild(cube_r5);
        this.setRotateAngle(cube_r5, -0.0893F, -0.2175F, -0.4208F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 0, 2, -0.5F, 0.0F, -1.2F, 1, 0, 2, 0.0F, true));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(1.15F, -3.4359F, 0.381F);
        this.hip.addChild(cube_r6);
        this.setRotateAngle(cube_r6, -0.0523F, -0.0349F, -0.0012F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 0, 15, 0.0F, -0.4F, -2.5F, 0, 1, 5, 0.0F, true));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(-1.15F, -3.4359F, 0.381F);
        this.hip.addChild(cube_r7);
        this.setRotateAngle(cube_r7, -0.0523F, 0.0349F, 0.0012F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 0, 15, 0.0F, -0.4F, -2.5F, 0, 1, 5, 0.0F, false));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(-2.152F, -2.311F, 1.9284F);
        this.hip.addChild(cube_r8);
        this.setRotateAngle(cube_r8, -0.0893F, 0.2175F, 0.4208F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 0, 2, -0.5F, 0.0F, -1.2F, 1, 0, 2, 0.0F, false));

        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(-1.0F, 2.0F, -2.25F);
        this.hip.addChild(cube_r9);
        this.setRotateAngle(cube_r9, -0.0436F, 0.0F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 30, 10, -0.5F, -5.25F, -1.0F, 3, 1, 6, 0.0F, false));

        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(-0.8405F, -3.15F, 4.4441F);
        this.hip.addChild(cube_r10);
        this.setRotateAngle(cube_r10, -0.0351F, 0.1047F, -0.0037F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 0, 1, 0.0F, -0.5F, -1.5F, 0, 1, 3, 0.0F, false));

        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(-1.25F, -2.25F, 4.5F);
        this.hip.addChild(cube_r11);
        this.setRotateAngle(cube_r11, 0.0F, 0.1309F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 10, 23, -0.7F, 0.0F, -1.5F, 1, 0, 3, 0.0F, false));

        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(-0.5F, -3.05F, 2.9F);
        this.hip.addChild(cube_r12);
        this.setRotateAngle(cube_r12, -0.0175F, 0.0F, 0.0F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 20, 36, -0.5F, 0.0F, 0.0F, 2, 1, 3, 0.01F, false));

        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(-1.55F, -1.2585F, 1.5482F);
        this.hip.addChild(cube_r13);
        this.setRotateAngle(cube_r13, 0.0F, 0.1396F, 0.0F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 21, 0, -1.0F, 0.0F, -1.5F, 2, 0, 3, 0.0F, false));

        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(-1.5F, -1.6085F, 4.4982F);
        this.hip.addChild(cube_r14);
        this.setRotateAngle(cube_r14, 0.0F, 0.1047F, 0.0F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 21, 3, -0.5F, 0.0F, -1.5F, 1, 0, 3, 0.0F, false));

        this.cube_r15 = new AdvancedModelRenderer(this);
        this.cube_r15.setRotationPoint(0.0F, 1.75F, 3.0F);
        this.hip.addChild(cube_r15);
        this.setRotateAngle(cube_r15, 0.0873F, 0.0F, 0.0F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 16, 17, -2.0F, -4.7085F, -5.7518F, 4, 5, 6, 0.0F, false));

        this.body = new AdvancedModelRenderer(this);
        this.body.setRotationPoint(0.0F, -3.0F, -2.25F);
        this.hip.addChild(body);
        this.body.cubeList.add(new ModelBox(body, 0, 0, -2.5F, -0.3F, -6.0F, 5, 6, 6, 0.0F, false));
        this.body.cubeList.add(new ModelBox(body, 0, 12, -2.75F, 1.0F, -6.0F, 1, 0, 6, 0.0F, false));
        this.body.cubeList.add(new ModelBox(body, 18, 10, -1.25F, -1.0F, -6.0F, 0, 1, 6, 0.0F, false));
        this.body.cubeList.add(new ModelBox(body, 18, 10, 1.25F, -1.0F, -6.0F, 0, 1, 6, 0.0F, true));
        this.body.cubeList.add(new ModelBox(body, 0, 12, 1.75F, 1.0F, -6.0F, 1, 0, 6, 0.0F, true));

        this.cube_r16 = new AdvancedModelRenderer(this);
        this.cube_r16.setRotationPoint(2.5F, 0.25F, -1.75F);
        this.body.addChild(cube_r16);
        this.setRotateAngle(cube_r16, 0.0F, 0.0F, -0.4363F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 10, 0, -0.4F, 0.0F, -4.25F, 1, 0, 6, 0.0F, true));

        this.cube_r17 = new AdvancedModelRenderer(this);
        this.cube_r17.setRotationPoint(2.25F, 2.55F, -3.0F);
        this.body.addChild(cube_r17);
        this.setRotateAngle(cube_r17, 0.0175F, 0.0F, 0.0F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 12, 0, -0.5F, 0.0F, -3.0F, 1, 0, 6, 0.0F, true));
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 12, 0, -5.0F, 0.0F, -3.0F, 1, 0, 6, 0.0F, false));

        this.cube_r18 = new AdvancedModelRenderer(this);
        this.cube_r18.setRotationPoint(2.55F, 1.8F, -3.0F);
        this.body.addChild(cube_r18);
        this.setRotateAngle(cube_r18, 0.0436F, 0.0698F, 0.0F);
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 14, 0, -0.5F, 0.0F, -3.0F, 1, 0, 6, 0.0F, true));

        this.cube_r19 = new AdvancedModelRenderer(this);
        this.cube_r19.setRotationPoint(-2.5F, 0.25F, -1.75F);
        this.body.addChild(cube_r19);
        this.setRotateAngle(cube_r19, 0.0F, 0.0F, 0.4363F);
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 10, 0, -0.6F, 0.0F, -4.25F, 1, 0, 6, 0.0F, false));

        this.cube_r20 = new AdvancedModelRenderer(this);
        this.cube_r20.setRotationPoint(-2.55F, 1.8F, -3.0F);
        this.body.addChild(cube_r20);
        this.setRotateAngle(cube_r20, 0.0436F, -0.0698F, 0.0F);
        this.cube_r20.cubeList.add(new ModelBox(cube_r20, 14, 0, -0.5F, 0.0F, -3.0F, 1, 0, 6, 0.0F, false));

        this.chest = new AdvancedModelRenderer(this);
        this.chest.setRotationPoint(0.0F, 0.0F, -5.75F);
        this.body.addChild(chest);


        this.cube_r21 = new AdvancedModelRenderer(this);
        this.cube_r21.setRotationPoint(1.85F, 2.7992F, -1.5394F);
        this.chest.addChild(cube_r21);
        this.setRotateAngle(cube_r21, 0.1309F, 0.0873F, 0.0F);
        this.cube_r21.cubeList.add(new ModelBox(cube_r21, 25, 0, -0.5F, 0.0F, -1.5F, 1, 0, 3, 0.0F, true));

        this.cube_r22 = new AdvancedModelRenderer(this);
        this.cube_r22.setRotationPoint(1.85F, 2.2696F, -2.1134F);
        this.chest.addChild(cube_r22);
        this.setRotateAngle(cube_r22, 0.1309F, 0.0873F, 0.0F);
        this.cube_r22.cubeList.add(new ModelBox(cube_r22, 0, 0, -0.5F, 0.0F, -2.0F, 1, 0, 4, 0.0F, true));

        this.cube_r23 = new AdvancedModelRenderer(this);
        this.cube_r23.setRotationPoint(1.75F, 1.7107F, -2.7659F);
        this.chest.addChild(cube_r23);
        this.setRotateAngle(cube_r23, 0.1745F, 0.0698F, 0.0F);
        this.cube_r23.cubeList.add(new ModelBox(cube_r23, 13, 17, -0.5F, 0.0F, -2.5F, 1, 0, 5, 0.0F, true));

        this.cube_r24 = new AdvancedModelRenderer(this);
        this.cube_r24.setRotationPoint(-1.85F, 2.7992F, -1.5394F);
        this.chest.addChild(cube_r24);
        this.setRotateAngle(cube_r24, 0.1309F, -0.0873F, 0.0F);
        this.cube_r24.cubeList.add(new ModelBox(cube_r24, 25, 0, -0.5F, 0.0F, -1.5F, 1, 0, 3, 0.0F, false));

        this.cube_r25 = new AdvancedModelRenderer(this);
        this.cube_r25.setRotationPoint(-1.85F, 2.2696F, -2.1134F);
        this.chest.addChild(cube_r25);
        this.setRotateAngle(cube_r25, 0.1309F, -0.0873F, 0.0F);
        this.cube_r25.cubeList.add(new ModelBox(cube_r25, 0, 0, -0.5F, 0.0F, -2.0F, 1, 0, 4, 0.0F, false));

        this.cube_r26 = new AdvancedModelRenderer(this);
        this.cube_r26.setRotationPoint(-1.75F, 1.7107F, -2.7659F);
        this.chest.addChild(cube_r26);
        this.setRotateAngle(cube_r26, 0.1745F, -0.0698F, 0.0F);
        this.cube_r26.cubeList.add(new ModelBox(cube_r26, 13, 17, -0.5F, 0.0F, -2.5F, 1, 0, 5, 0.0F, false));

        this.cube_r27 = new AdvancedModelRenderer(this);
        this.cube_r27.setRotationPoint(0.0F, 1.8F, -5.2F);
        this.chest.addChild(cube_r27);
        this.setRotateAngle(cube_r27, -0.2443F, 0.0F, 0.0F);
        this.cube_r27.cubeList.add(new ModelBox(cube_r27, 24, 0, -2.0F, -0.5016F, -0.0733F, 4, 3, 6, 0.01F, false));

        this.leftArm = new AdvancedModelRenderer(this);
        this.leftArm.setRotationPoint(2.0F, 3.5F, -4.7F);
        this.chest.addChild(leftArm);
        this.setRotateAngle(leftArm, 0.7854F, 0.0F, -0.2182F);
        this.leftArm.cubeList.add(new ModelBox(leftArm, 28, 28, -0.5F, 0.0F, -0.5F, 1, 4, 1, 0.0F, true));

        this.leftArm2 = new AdvancedModelRenderer(this);
        this.leftArm2.setRotationPoint(0.0F, 4.0F, 0.5F);
        this.leftArm.addChild(leftArm2);
        this.setRotateAngle(leftArm2, -0.8727F, 0.0F, 0.2618F);
        this.leftArm2.cubeList.add(new ModelBox(leftArm2, 42, 10, -0.5F, 0.0F, -1.0F, 1, 3, 1, -0.01F, true));

        this.leftArm3 = new AdvancedModelRenderer(this);
        this.leftArm3.setRotationPoint(0.5F, 3.0F, -0.5F);
        this.leftArm2.addChild(leftArm3);
        this.setRotateAngle(leftArm3, 0.0F, 0.0F, 0.48F);
        this.leftArm3.cubeList.add(new ModelBox(leftArm3, 40, 20, -1.0F, 0.0F, -1.0F, 1, 2, 2, 0.0F, true));

        this.rightArm = new AdvancedModelRenderer(this);
        this.rightArm.setRotationPoint(-2.0F, 3.5F, -4.7F);
        this.chest.addChild(rightArm);
        this.setRotateAngle(rightArm, 0.7854F, 0.0F, 0.2182F);
        this.rightArm.cubeList.add(new ModelBox(rightArm, 28, 28, -0.5F, 0.0F, -0.5F, 1, 4, 1, 0.0F, false));

        this.rightArm2 = new AdvancedModelRenderer(this);
        this.rightArm2.setRotationPoint(0.0F, 4.0F, 0.5F);
        this.rightArm.addChild(rightArm2);
        this.setRotateAngle(rightArm2, -0.8727F, 0.0F, -0.2618F);
        this.rightArm2.cubeList.add(new ModelBox(rightArm2, 42, 10, -0.5F, 0.0F, -1.0F, 1, 3, 1, -0.01F, false));

        this.rightArm3 = new AdvancedModelRenderer(this);
        this.rightArm3.setRotationPoint(-0.5F, 3.0F, -0.5F);
        this.rightArm2.addChild(rightArm3);
        this.setRotateAngle(rightArm3, 0.0F, 0.0F, -0.48F);
        this.rightArm3.cubeList.add(new ModelBox(rightArm3, 40, 20, 0.0F, 0.0F, -1.0F, 1, 2, 2, 0.0F, false));

        this.notmove = new AdvancedModelRenderer(this);
        this.notmove.setRotationPoint(0.0F, 5.0F, -0.1F);
        this.chest.addChild(notmove);
        this.setRotateAngle(notmove, 0.2182F, 0.0F, 0.0F);
        this.notmove.cubeList.add(new ModelBox(notmove, 15, 28, -2.0F, -5.2F, -4.0F, 4, 3, 5, 0.0F, false));

        this.cube_r28 = new AdvancedModelRenderer(this);
        this.cube_r28.setRotationPoint(2.2477F, -4.8103F, -1.7F);
        this.notmove.addChild(cube_r28);
        this.setRotateAngle(cube_r28, 0.0F, 0.0873F, -0.4363F);
        this.cube_r28.cubeList.add(new ModelBox(cube_r28, 15, 17, -0.6F, 0.0F, -2.5F, 1, 0, 5, 0.0F, true));

        this.cube_r29 = new AdvancedModelRenderer(this);
        this.cube_r29.setRotationPoint(0.75F, -5.2F, -1.7F);
        this.notmove.addChild(cube_r29);
        this.setRotateAngle(cube_r29, -0.0012F, 0.1022F, -0.0227F);
        this.cube_r29.cubeList.add(new ModelBox(cube_r29, 0, 16, 0.0996F, -0.4981F, -2.4915F, 0, 1, 5, 0.0F, true));

        this.cube_r30 = new AdvancedModelRenderer(this);
        this.cube_r30.setRotationPoint(-0.75F, -5.2F, -1.7F);
        this.notmove.addChild(cube_r30);
        this.setRotateAngle(cube_r30, -0.0012F, -0.1022F, 0.0227F);
        this.cube_r30.cubeList.add(new ModelBox(cube_r30, 0, 16, -0.0996F, -0.4981F, -2.4915F, 0, 1, 5, 0.0F, false));

        this.cube_r31 = new AdvancedModelRenderer(this);
        this.cube_r31.setRotationPoint(-2.2477F, -4.8103F, -1.7F);
        this.notmove.addChild(cube_r31);
        this.setRotateAngle(cube_r31, 0.0F, -0.0873F, 0.4363F);
        this.cube_r31.cubeList.add(new ModelBox(cube_r31, 15, 17, -0.4F, 0.0F, -2.5F, 1, 0, 5, 0.0F, false));

        this.neck1 = new AdvancedModelRenderer(this);
        this.neck1.setRotationPoint(0.0F, 2.0F, -5.0F);
        this.chest.addChild(neck1);
        this.setRotateAngle(neck1, -0.3491F, 0.0F, 0.0F);
        this.neck1.cubeList.add(new ModelBox(neck1, 30, 17, -1.5F, -1.0F, -2.5F, 3, 2, 3, 0.01F, false));
        this.neck1.cubeList.add(new ModelBox(neck1, 0, 0, -0.5F, -1.3577F, -2.1656F, 0, 1, 1, 0.0F, false));
        this.neck1.cubeList.add(new ModelBox(neck1, 0, 0, 0.5F, -1.3577F, -2.1656F, 0, 1, 1, 0.0F, true));

        this.cube_r32 = new AdvancedModelRenderer(this);
        this.cube_r32.setRotationPoint(1.5F, -0.5F, -1.5F);
        this.neck1.addChild(cube_r32);
        this.setRotateAngle(cube_r32, 0.0F, 0.1745F, 0.0F);
        this.cube_r32.cubeList.add(new ModelBox(cube_r32, 3, 5, -0.5F, 0.0F, -0.5F, 1, 0, 1, 0.0F, true));

        this.cube_r33 = new AdvancedModelRenderer(this);
        this.cube_r33.setRotationPoint(-1.5F, -0.5F, -1.5F);
        this.neck1.addChild(cube_r33);
        this.setRotateAngle(cube_r33, 0.0F, -0.1745F, 0.0F);
        this.cube_r33.cubeList.add(new ModelBox(cube_r33, 3, 5, -0.5F, 0.0F, -0.5F, 1, 0, 1, 0.0F, false));

        this.neck2 = new AdvancedModelRenderer(this);
        this.neck2.setRotationPoint(0.0F, 0.0F, -2.5F);
        this.neck1.addChild(neck2);
        this.setRotateAngle(neck2, -0.2182F, 0.0F, 0.0F);
        this.neck2.cubeList.add(new ModelBox(neck2, 38, 0, -1.0F, -1.0F, -1.75F, 2, 2, 2, 0.0F, false));

        this.cube_r34 = new AdvancedModelRenderer(this);
        this.cube_r34.setRotationPoint(1.0F, -0.5F, -0.75F);
        this.neck2.addChild(cube_r34);
        this.setRotateAngle(cube_r34, 0.0F, 0.0873F, 0.0F);
        this.cube_r34.cubeList.add(new ModelBox(cube_r34, 0, 12, -0.5F, 0.0F, -0.5F, 1, 0, 1, 0.0F, true));

        this.cube_r35 = new AdvancedModelRenderer(this);
        this.cube_r35.setRotationPoint(0.5F, -0.7995F, -0.8513F);
        this.neck2.addChild(cube_r35);
        this.setRotateAngle(cube_r35, -0.0436F, 0.0F, 0.0F);
        this.cube_r35.cubeList.add(new ModelBox(cube_r35, 0, 1, 0.0F, -0.6F, -0.5F, 0, 1, 1, 0.0F, true));
        this.cube_r35.cubeList.add(new ModelBox(cube_r35, 0, 1, -1.0F, -0.6F, -0.5F, 0, 1, 1, 0.0F, false));

        this.cube_r36 = new AdvancedModelRenderer(this);
        this.cube_r36.setRotationPoint(-1.0F, -0.5F, -0.75F);
        this.neck2.addChild(cube_r36);
        this.setRotateAngle(cube_r36, 0.0F, -0.0873F, 0.0F);
        this.cube_r36.cubeList.add(new ModelBox(cube_r36, 0, 12, -0.5F, 0.0F, -0.5F, 1, 0, 1, 0.0F, false));

        this.neck3 = new AdvancedModelRenderer(this);
        this.neck3.setRotationPoint(0.0F, 0.0F, -1.5F);
        this.neck2.addChild(neck3);
        this.setRotateAngle(neck3, 0.3491F, 0.0F, 0.0F);
        this.neck3.cubeList.add(new ModelBox(neck3, 11, 28, -1.0F, -1.0F, -1.75F, 2, 2, 2, -0.01F, false));
        this.neck3.cubeList.add(new ModelBox(neck3, 0, 13, -0.5F, -1.45F, -1.75F, 0, 1, 1, 0.0F, false));
        this.neck3.cubeList.add(new ModelBox(neck3, 0, 13, 0.5F, -1.45F, -1.75F, 0, 1, 1, 0.0F, true));

        this.cube_r37 = new AdvancedModelRenderer(this);
        this.cube_r37.setRotationPoint(0.8F, -0.5F, -0.75F);
        this.neck3.addChild(cube_r37);
        this.setRotateAngle(cube_r37, 0.0F, 0.1309F, 0.0F);
        this.cube_r37.cubeList.add(new ModelBox(cube_r37, 0, 13, -0.5F, 0.0F, -0.5F, 1, 0, 1, 0.0F, true));

        this.cube_r38 = new AdvancedModelRenderer(this);
        this.cube_r38.setRotationPoint(0.5F, -0.8633F, -0.131F);
        this.neck3.addChild(cube_r38);
        this.setRotateAngle(cube_r38, -0.1309F, 0.0F, 0.0F);
        this.cube_r38.cubeList.add(new ModelBox(cube_r38, 0, 2, 0.0F, -0.5F, -0.5F, 0, 1, 1, 0.0F, true));
        this.cube_r38.cubeList.add(new ModelBox(cube_r38, 0, 2, -1.0F, -0.5F, -0.5F, 0, 1, 1, 0.0F, false));

        this.cube_r39 = new AdvancedModelRenderer(this);
        this.cube_r39.setRotationPoint(-0.8F, -0.5F, -0.75F);
        this.neck3.addChild(cube_r39);
        this.setRotateAngle(cube_r39, 0.0F, -0.1309F, 0.0F);
        this.cube_r39.cubeList.add(new ModelBox(cube_r39, 0, 13, -0.5F, 0.0F, -0.5F, 1, 0, 1, 0.0F, false));

        this.head = new AdvancedModelRenderer(this);
        this.head.setRotationPoint(0.0F, -1.025F, -1.75F);
        this.neck3.addChild(head);
        this.setRotateAngle(head, 0.5672F, 0.0F, 0.0F);


        this.cube_r40 = new AdvancedModelRenderer(this);
        this.cube_r40.setRotationPoint(0.0F, -0.1349F, -1.8059F);
        this.head.addChild(cube_r40);
        this.setRotateAngle(cube_r40, 0.3316F, 0.0F, 0.0F);
        this.cube_r40.cubeList.add(new ModelBox(cube_r40, 0, 15, -0.5F, 0.0624F, -2.984F, 1, 1, 3, -0.01F, false));

        this.cube_r41 = new AdvancedModelRenderer(this);
        this.cube_r41.setRotationPoint(0.0F, 1.2651F, -4.0559F);
        this.head.addChild(cube_r41);
        this.setRotateAngle(cube_r41, 0.1745F, 0.2182F, 0.0349F);
        this.cube_r41.cubeList.add(new ModelBox(cube_r41, 17, 36, -0.525F, -0.4356F, 0.2006F, 1, 1, 2, 0.0F, true));

        this.cube_r42 = new AdvancedModelRenderer(this);
        this.cube_r42.setRotationPoint(0.0F, 1.2651F, -4.0559F);
        this.head.addChild(cube_r42);
        this.setRotateAngle(cube_r42, 0.1745F, -0.2182F, -0.0349F);
        this.cube_r42.cubeList.add(new ModelBox(cube_r42, 17, 36, -0.475F, -0.4356F, 0.2006F, 1, 1, 2, 0.0F, false));

        this.cube_r43 = new AdvancedModelRenderer(this);
        this.cube_r43.setRotationPoint(0.0F, 1.2651F, -0.8059F);
        this.head.addChild(cube_r43);
        this.setRotateAngle(cube_r43, 0.1745F, 0.0F, 0.0F);
        this.cube_r43.cubeList.add(new ModelBox(cube_r43, 41, 40, -0.5F, -1.0F, -3.15F, 1, 1, 2, 0.0F, false));

        this.cube_r44 = new AdvancedModelRenderer(this);
        this.cube_r44.setRotationPoint(0.0F, 0.2651F, -0.3059F);
        this.head.addChild(cube_r44);
        this.setRotateAngle(cube_r44, -0.0873F, 0.0F, 0.0F);
        this.cube_r44.cubeList.add(new ModelBox(cube_r44, 18, 40, -1.0F, -0.25F, -1.65F, 2, 1, 2, 0.0F, false));

        this.cube_r45 = new AdvancedModelRenderer(this);
        this.cube_r45.setRotationPoint(0.0F, 1.4987F, -1.9405F);
        this.head.addChild(cube_r45);
        this.setRotateAngle(cube_r45, -0.0873F, 0.0F, 0.0F);
        this.cube_r45.cubeList.add(new ModelBox(cube_r45, 7, 33, -1.0F, -1.0331F, -0.1921F, 2, 1, 2, 0.01F, false));

        this.cube_r46 = new AdvancedModelRenderer(this);
        this.cube_r46.setRotationPoint(0.4467F, 1.1838F, -2.6388F);
        this.head.addChild(cube_r46);
        this.setRotateAngle(cube_r46, 0.1745F, 0.1658F, 0.0F);
        this.cube_r46.cubeList.add(new ModelBox(cube_r46, 11, 24, 0.0F, -0.5F, -1.0F, 0, 1, 2, 0.0F, true));

        this.cube_r47 = new AdvancedModelRenderer(this);
        this.cube_r47.setRotationPoint(-0.4467F, 1.1838F, -2.6388F);
        this.head.addChild(cube_r47);
        this.setRotateAngle(cube_r47, 0.1745F, -0.1658F, 0.0F);
        this.cube_r47.cubeList.add(new ModelBox(cube_r47, 11, 24, 0.0F, -0.5F, -1.0F, 0, 1, 2, 0.0F, false));

        this.cube_r48 = new AdvancedModelRenderer(this);
        this.cube_r48.setRotationPoint(0.6377F, 1.8151F, -2.7092F);
        this.head.addChild(cube_r48);
        this.setRotateAngle(cube_r48, 0.2618F, 0.1658F, 0.0F);
        this.cube_r48.cubeList.add(new ModelBox(cube_r48, 4, 29, 0.0F, -0.9F, -0.8F, 0, 1, 2, 0.0F, true));
        this.cube_r48.cubeList.add(new ModelBox(cube_r48, 0, 3, -0.0177F, -0.9F, -0.8F, 0, 1, 2, 0.0F, true));

        this.cube_r49 = new AdvancedModelRenderer(this);
        this.cube_r49.setRotationPoint(-0.6377F, 1.8151F, -2.7092F);
        this.head.addChild(cube_r49);
        this.setRotateAngle(cube_r49, 0.2618F, -0.1658F, 0.0F);
        this.cube_r49.cubeList.add(new ModelBox(cube_r49, 0, 3, 0.0177F, -0.9F, -0.8F, 0, 1, 2, 0.0F, false));
        this.cube_r49.cubeList.add(new ModelBox(cube_r49, 4, 29, 0.0F, -0.9F, -0.8F, 0, 1, 2, 0.0F, false));

        this.jaw = new AdvancedModelRenderer(this);
        this.jaw.setRotationPoint(0.0F, 1.0651F, -0.006F);
        this.head.addChild(jaw);
        this.setRotateAngle(jaw, 0.0436F, 0.0F, 0.0F);
        this.jaw.cubeList.add(new ModelBox(jaw, 35, 39, -1.0F, 0.0F, -2.0F, 2, 1, 2, 0.005F, false));
        this.jaw.cubeList.add(new ModelBox(jaw, 24, 10, -1.0F, -0.55F, -1.75F, 2, 1, 1, 0.0F, false));
        this.jaw.cubeList.add(new ModelBox(jaw, 42, 7, -0.5F, 0.0F, -3.9F, 1, 1, 2, -0.01F, false));
        this.jaw.cubeList.add(new ModelBox(jaw, 41, 37, -0.5F, 0.0F, -4.2F, 1, 1, 2, -0.03F, false));

        this.cube_r50 = new AdvancedModelRenderer(this);
        this.cube_r50.setRotationPoint(0.5F, 0.0F, -4.0F);
        this.jaw.addChild(cube_r50);
        this.setRotateAngle(cube_r50, 0.0F, 0.1745F, 0.0F);
        this.cube_r50.cubeList.add(new ModelBox(cube_r50, 6, 41, -1.0F, 0.0F, 0.1F, 1, 1, 2, -0.02F, true));

        this.cube_r51 = new AdvancedModelRenderer(this);
        this.cube_r51.setRotationPoint(-0.5F, 0.0F, -4.0F);
        this.jaw.addChild(cube_r51);
        this.setRotateAngle(cube_r51, 0.0F, -0.1745F, 0.0F);
        this.cube_r51.cubeList.add(new ModelBox(cube_r51, 6, 41, 0.0F, 0.0F, 0.1F, 1, 1, 2, -0.02F, false));

        this.cube_r52 = new AdvancedModelRenderer(this);
        this.cube_r52.setRotationPoint(0.6525F, 0.3119F, -2.6148F);
        this.jaw.addChild(cube_r52);
        this.setRotateAngle(cube_r52, -0.0087F, 0.1658F, 0.0F);
        this.cube_r52.cubeList.add(new ModelBox(cube_r52, 11, 25, -0.2F, -0.4F, -1.0F, 0, 1, 2, 0.0F, true));

        this.cube_r53 = new AdvancedModelRenderer(this);
        this.cube_r53.setRotationPoint(-0.6525F, 0.3119F, -2.6148F);
        this.jaw.addChild(cube_r53);
        this.setRotateAngle(cube_r53, -0.0087F, -0.1658F, 0.0F);
        this.cube_r53.cubeList.add(new ModelBox(cube_r53, 11, 25, 0.2F, -0.4F, -1.0F, 0, 1, 2, 0.0F, false));

        this.cube_r54 = new AdvancedModelRenderer(this);
        this.cube_r54.setRotationPoint(0.6525F, 0.3119F, -2.6148F);
        this.jaw.addChild(cube_r54);
        this.setRotateAngle(cube_r54, -0.0436F, 0.1658F, 0.0F);
        this.cube_r54.cubeList.add(new ModelBox(cube_r54, 0, 29, 0.0075F, -0.7F, -1.0F, 0, 1, 2, 0.0F, true));
        this.cube_r54.cubeList.add(new ModelBox(cube_r54, 0, 17, 0.0F, -0.7F, -1.0F, 0, 1, 2, 0.0F, true));

        this.cube_r55 = new AdvancedModelRenderer(this);
        this.cube_r55.setRotationPoint(-0.6525F, 0.3119F, -2.6148F);
        this.jaw.addChild(cube_r55);
        this.setRotateAngle(cube_r55, -0.0436F, -0.1658F, 0.0F);
        this.cube_r55.cubeList.add(new ModelBox(cube_r55, 0, 17, 0.0F, -0.7F, -1.0F, 0, 1, 2, 0.0F, false));
        this.cube_r55.cubeList.add(new ModelBox(cube_r55, 0, 29, -0.0075F, -0.7F, -1.0F, 0, 1, 2, 0.0F, false));

        this.eyes = new AdvancedModelRenderer(this);
        this.eyes.setRotationPoint(0.0F, 0.475F, -1.375F);
        this.head.addChild(eyes);


        this.cube_r56 = new AdvancedModelRenderer(this);
        this.cube_r56.setRotationPoint(0.0F, 0.7901F, 0.5691F);
        this.eyes.addChild(cube_r56);
        this.setRotateAngle(cube_r56, -0.0873F, 0.0F, 0.0F);
        this.cube_r56.cubeList.add(new ModelBox(cube_r56, 30, 10, -1.0F, -1.15F, -1.15F, 2, 1, 1, 0.02F, false));

        this.leftLeg = new AdvancedModelRenderer(this);
        this.leftLeg.setRotationPoint(2.0F, -2.6F, -1.0F);
        this.hip.addChild(leftLeg);
        this.leftLeg.cubeList.add(new ModelBox(leftLeg, 0, 33, -1.0F, 0.0F, -1.25F, 2, 5, 3, 0.01F, true));
        this.leftLeg.cubeList.add(new ModelBox(leftLeg, 0, 0, 0.25F, 0.75F, -1.25F, 1, 0, 2, 0.0F, true));
        this.leftLeg.cubeList.add(new ModelBox(leftLeg, 8, 23, 0.45F, 1.25F, -1.25F, 1, 0, 3, 0.0F, true));
        this.leftLeg.cubeList.add(new ModelBox(leftLeg, 23, 3, 0.25F, 2.0F, -1.25F, 1, 0, 3, 0.0F, true));

        this.cube_r57 = new AdvancedModelRenderer(this);
        this.cube_r57.setRotationPoint(0.8832F, 0.5381F, 0.4125F);
        this.leftLeg.addChild(cube_r57);
        this.setRotateAngle(cube_r57, 0.0245F, -0.0978F, -0.2686F);
        this.cube_r57.cubeList.add(new ModelBox(cube_r57, 25, 3, -0.7F, -0.7F, -1.6F, 1, 0, 3, 0.0F, true));

        this.leftLeg2 = new AdvancedModelRenderer(this);
        this.leftLeg2.setRotationPoint(0.0F, 5.0F, -1.25F);
        this.leftLeg.addChild(leftLeg2);
        this.setRotateAngle(leftLeg2, 0.7418F, 0.0F, 0.0F);
        this.leftLeg2.cubeList.add(new ModelBox(leftLeg2, 0, 23, -1.0F, 0.5F, 0.0F, 2, 6, 2, 0.0F, true));
        this.leftLeg2.cubeList.add(new ModelBox(leftLeg2, 39, 17, -1.0F, 0.0F, 0.0F, 2, 1, 2, -0.01F, true));

        this.leftLeg3 = new AdvancedModelRenderer(this);
        this.leftLeg3.setRotationPoint(0.0F, 6.3F, 1.6F);
        this.leftLeg2.addChild(leftLeg3);
        this.setRotateAngle(leftLeg3, -1.0472F, 0.0F, 0.0F);
        this.leftLeg3.cubeList.add(new ModelBox(leftLeg3, 29, 39, -1.0F, -0.2373F, -0.8379F, 2, 4, 1, -0.03F, true));
        this.leftLeg3.cubeList.add(new ModelBox(leftLeg3, 29, 39, -1.0F, -0.2373F, -1.1879F, 2, 4, 1, -0.01F, true));

        this.leftLeg4 = new AdvancedModelRenderer(this);
        this.leftLeg4.setRotationPoint(0.0F, 2.9526F, -0.6971F);
        this.leftLeg3.addChild(leftLeg4);
        this.setRotateAngle(leftLeg4, 0.3054F, 0.0F, 0.0F);
        this.leftLeg4.cubeList.add(new ModelBox(leftLeg4, 37, 32, -1.5F, 0.0F, -2.5F, 3, 1, 3, 0.0F, true));

        this.rightLeg = new AdvancedModelRenderer(this);
        this.rightLeg.setRotationPoint(-2.0F, -2.6F, -1.0F);
        this.hip.addChild(rightLeg);
        this.rightLeg.cubeList.add(new ModelBox(rightLeg, 0, 33, -1.0F, 0.0F, -1.25F, 2, 5, 3, 0.01F, false));
        this.rightLeg.cubeList.add(new ModelBox(rightLeg, 0, 0, -1.25F, 0.75F, -1.25F, 1, 0, 2, 0.0F, false));
        this.rightLeg.cubeList.add(new ModelBox(rightLeg, 8, 23, -1.45F, 1.25F, -1.25F, 1, 0, 3, 0.0F, false));
        this.rightLeg.cubeList.add(new ModelBox(rightLeg, 23, 3, -1.25F, 2.0F, -1.25F, 1, 0, 3, 0.0F, false));

        this.cube_r58 = new AdvancedModelRenderer(this);
        this.cube_r58.setRotationPoint(-0.8832F, 0.5381F, 0.4125F);
        this.rightLeg.addChild(cube_r58);
        this.setRotateAngle(cube_r58, 0.0245F, 0.0978F, 0.2686F);
        this.cube_r58.cubeList.add(new ModelBox(cube_r58, 25, 3, -0.3F, -0.7F, -1.6F, 1, 0, 3, 0.0F, false));

        this.rightLeg2 = new AdvancedModelRenderer(this);
        this.rightLeg2.setRotationPoint(0.0F, 5.0F, -1.25F);
        this.rightLeg.addChild(rightLeg2);
        this.setRotateAngle(rightLeg2, 0.7418F, 0.0F, 0.0F);
        this.rightLeg2.cubeList.add(new ModelBox(rightLeg2, 0, 23, -1.0F, 0.5F, 0.0F, 2, 6, 2, 0.0F, false));
        this.rightLeg2.cubeList.add(new ModelBox(rightLeg2, 39, 17, -1.0F, 0.0F, 0.0F, 2, 1, 2, -0.01F, false));

        this.rightLeg3 = new AdvancedModelRenderer(this);
        this.rightLeg3.setRotationPoint(0.0F, 6.3F, 1.6F);
        this.rightLeg2.addChild(rightLeg3);
        this.setRotateAngle(rightLeg3, -1.0472F, 0.0F, 0.0F);
        this.rightLeg3.cubeList.add(new ModelBox(rightLeg3, 29, 39, -1.0F, -0.2373F, -0.8379F, 2, 4, 1, -0.03F, false));
        this.rightLeg3.cubeList.add(new ModelBox(rightLeg3, 29, 39, -1.0F, -0.2373F, -1.1879F, 2, 4, 1, -0.01F, false));

        this.rightLeg4 = new AdvancedModelRenderer(this);
        this.rightLeg4.setRotationPoint(0.0F, 2.9526F, -0.6971F);
        this.rightLeg3.addChild(rightLeg4);
        this.setRotateAngle(rightLeg4, 0.3054F, 0.0F, 0.0F);
        this.rightLeg4.cubeList.add(new ModelBox(rightLeg4, 37, 32, -1.5F, 0.0F, -2.5F, 3, 1, 3, 0.0F, false));

        this.tail1 = new AdvancedModelRenderer(this);
        this.tail1.setRotationPoint(0.0F, -1.75F, 6.0F);
        this.hip.addChild(tail1);
        this.tail1.cubeList.add(new ModelBox(tail1, 10, 36, -1.0F, -1.25F, -0.5F, 2, 3, 3, 0.0F, false));
        this.tail1.cubeList.add(new ModelBox(tail1, 28, 32, -1.0F, -1.25F, 2.5F, 2, 2, 5, 0.0F, false));

        this.cube_r59 = new AdvancedModelRenderer(this);
        this.cube_r59.setRotationPoint(1.0306F, -0.5F, 1.6987F);
        this.tail1.addChild(cube_r59);
        this.setRotateAngle(cube_r59, 0.0F, -0.0436F, 0.0F);
        this.cube_r59.cubeList.add(new ModelBox(cube_r59, 0, 12, -0.6F, 0.0F, -1.1F, 1, 0, 3, 0.0F, true));

        this.cube_r60 = new AdvancedModelRenderer(this);
        this.cube_r60.setRotationPoint(1.0448F, -0.0309F, 4.0F);
        this.tail1.addChild(cube_r60);
        this.setRotateAngle(cube_r60, -0.0136F, -0.0506F, 0.2621F);
        this.cube_r60.cubeList.add(new ModelBox(cube_r60, 0, 12, -0.5F, 0.0F, -4.5F, 1, 0, 8, 0.0F, true));

        this.cube_r61 = new AdvancedModelRenderer(this);
        this.cube_r61.setRotationPoint(0.4604F, -1.3F, 3.5976F);
        this.tail1.addChild(cube_r61);
        this.setRotateAngle(cube_r61, 0.0F, -0.0349F, 0.1745F);
        this.cube_r61.cubeList.add(new ModelBox(cube_r61, 24, 2, 0.0F, -0.5F, -3.0F, 0, 1, 7, 0.0F, true));

        this.cube_r62 = new AdvancedModelRenderer(this);
        this.cube_r62.setRotationPoint(-0.4604F, -1.3F, 3.5976F);
        this.tail1.addChild(cube_r62);
        this.setRotateAngle(cube_r62, 0.0F, 0.0349F, -0.1745F);
        this.cube_r62.cubeList.add(new ModelBox(cube_r62, 24, 2, 0.0F, -0.5F, -3.0F, 0, 1, 7, 0.0F, false));

        this.cube_r63 = new AdvancedModelRenderer(this);
        this.cube_r63.setRotationPoint(-1.0448F, -0.0309F, 4.0F);
        this.tail1.addChild(cube_r63);
        this.setRotateAngle(cube_r63, -0.0136F, 0.0506F, -0.2621F);
        this.cube_r63.cubeList.add(new ModelBox(cube_r63, 0, 12, -0.5F, 0.0F, -4.5F, 1, 0, 8, 0.0F, false));

        this.cube_r64 = new AdvancedModelRenderer(this);
        this.cube_r64.setRotationPoint(-1.0306F, -0.5F, 1.6987F);
        this.tail1.addChild(cube_r64);
        this.setRotateAngle(cube_r64, 0.0F, 0.0436F, 0.0F);
        this.cube_r64.cubeList.add(new ModelBox(cube_r64, 0, 12, -0.4F, 0.0F, -1.1F, 1, 0, 3, 0.0F, false));

        this.tail2 = new AdvancedModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, -0.65F, 7.5F);
        this.tail1.addChild(tail2);
        this.tail2.cubeList.add(new ModelBox(tail2, 12, 2, -0.5F, -0.5F, -0.75F, 1, 1, 10, 0.01F, false));

        this.cube_r65 = new AdvancedModelRenderer(this);
        this.cube_r65.setRotationPoint(0.4F, -0.6F, 4.45F);
        this.tail2.addChild(cube_r65);
        this.setRotateAngle(cube_r65, -0.0175F, 0.0F, 0.1745F);
        this.cube_r65.cubeList.add(new ModelBox(cube_r65, 18, 6, 0.0F, -0.5F, -4.5F, 0, 1, 9, 0.0F, true));

        this.cube_r66 = new AdvancedModelRenderer(this);
        this.cube_r66.setRotationPoint(0.7F, 0.25F, 0.8F);
        this.tail2.addChild(cube_r66);
        this.setRotateAngle(cube_r66, -0.0168F, -0.0201F, 0.6983F);
        this.cube_r66.cubeList.add(new ModelBox(cube_r66, 7, 13, -0.25F, 0.0F, -0.75F, 1, 0, 9, 0.0F, true));

        this.cube_r67 = new AdvancedModelRenderer(this);
        this.cube_r67.setRotationPoint(-0.4F, -0.6F, 4.45F);
        this.tail2.addChild(cube_r67);
        this.setRotateAngle(cube_r67, -0.0175F, 0.0F, -0.1745F);
        this.cube_r67.cubeList.add(new ModelBox(cube_r67, 18, 6, 0.0F, -0.5F, -4.5F, 0, 1, 9, 0.0F, false));

        this.cube_r68 = new AdvancedModelRenderer(this);
        this.cube_r68.setRotationPoint(-0.7F, 0.25F, 0.8F);
        this.tail2.addChild(cube_r68);
        this.setRotateAngle(cube_r68, -0.0168F, 0.0201F, -0.6983F);
        this.cube_r68.cubeList.add(new ModelBox(cube_r68, 7, 13, -0.75F, 0.0F, -0.75F, 1, 0, 9, 0.0F, false));

        this.tail3 = new AdvancedModelRenderer(this);
        this.tail3.setRotationPoint(0.0F, 0.0F, 9.25F);
        this.tail2.addChild(tail3);
        this.setRotateAngle(tail3, -0.0873F, 0.0F, 0.0F);
        this.tail3.cubeList.add(new ModelBox(tail3, 0, 12, -0.5F, -0.5F, -0.5F, 1, 1, 10, 0.0F, false));

        this.cube_r69 = new AdvancedModelRenderer(this);
        this.cube_r69.setRotationPoint(0.3F, -0.5F, 4.5F);
        this.tail3.addChild(cube_r69);
        this.setRotateAngle(cube_r69, -0.0052F, -0.0298F, 0.3478F);
        this.cube_r69.cubeList.add(new ModelBox(cube_r69, 18, 5, 0.0F, -0.5F, -4.5F, 0, 1, 9, 0.0F, true));

        this.cube_r70 = new AdvancedModelRenderer(this);
        this.cube_r70.setRotationPoint(0.5F, 0.25F, -8.25F);
        this.tail3.addChild(cube_r70);
        this.setRotateAngle(cube_r70, 0.0F, 0.0F, 0.6981F);
        this.cube_r70.cubeList.add(new ModelBox(cube_r70, 5, 13, -0.25F, 0.0F, 8.25F, 1, 0, 9, 0.0F, true));

        this.cube_r71 = new AdvancedModelRenderer(this);
        this.cube_r71.setRotationPoint(-0.5F, 0.25F, -8.25F);
        this.tail3.addChild(cube_r71);
        this.setRotateAngle(cube_r71, 0.0F, 0.0F, -0.6981F);
        this.cube_r71.cubeList.add(new ModelBox(cube_r71, 5, 13, -0.75F, 0.0F, 8.25F, 1, 0, 9, 0.0F, false));

        this.cube_r72 = new AdvancedModelRenderer(this);
        this.cube_r72.setRotationPoint(-0.3F, -0.5F, 4.5F);
        this.tail3.addChild(cube_r72);
        this.setRotateAngle(cube_r72, -0.0052F, 0.0298F, -0.3478F);
        this.cube_r72.cubeList.add(new ModelBox(cube_r72, 18, 5, 0.0F, -0.5F, -4.5F, 0, 1, 9, 0.0F, false));

        this.tail4 = new AdvancedModelRenderer(this);
        this.tail4.setRotationPoint(0.0F, 0.0F, 9.5F);
        this.tail3.addChild(tail4);
        this.setRotateAngle(tail4, -0.0873F, 0.0F, 0.0F);
        this.tail4.cubeList.add(new ModelBox(tail4, 0, 23, -0.5F, -0.5F, -0.5F, 1, 1, 9, -0.01F, false));

        this.cube_r73 = new AdvancedModelRenderer(this);
        this.cube_r73.setRotationPoint(0.0F, -0.4F, 4.0F);
        this.tail4.addChild(cube_r73);
        this.setRotateAngle(cube_r73, -0.03F, -0.0222F, 0.1732F);
        this.cube_r73.cubeList.add(new ModelBox(cube_r73, 18, 4, 0.1001F, -0.4007F, -4.4966F, 0, 1, 9, 0.0F, true));

        this.cube_r74 = new AdvancedModelRenderer(this);
        this.cube_r74.setRotationPoint(0.6915F, 0.4107F, 4.0F);
        this.tail4.addChild(cube_r74);
        this.setRotateAngle(cube_r74, 0.0F, -0.0524F, 0.6981F);
        this.cube_r74.cubeList.add(new ModelBox(cube_r74, 3, 13, -0.7F, 0.0F, -4.5F, 1, 0, 9, 0.0F, true));

        this.cube_r75 = new AdvancedModelRenderer(this);
        this.cube_r75.setRotationPoint(-0.6915F, 0.4107F, 4.0F);
        this.tail4.addChild(cube_r75);
        this.setRotateAngle(cube_r75, 0.0F, 0.0524F, -0.6981F);
        this.cube_r75.cubeList.add(new ModelBox(cube_r75, 3, 13, -0.3F, 0.0F, -4.5F, 1, 0, 9, 0.0F, false));

        this.cube_r76 = new AdvancedModelRenderer(this);
        this.cube_r76.setRotationPoint(0.0F, -0.4F, 4.0F);
        this.tail4.addChild(cube_r76);
        this.setRotateAngle(cube_r76, -0.03F, 0.0222F, -0.1732F);
        this.cube_r76.cubeList.add(new ModelBox(cube_r76, 18, 4, -0.1001F, -0.4007F, -4.4966F, 0, 1, 9, 0.0F, false));

        updateDefaultPose();
        animator = ModelAnimator.create();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        animate((IAnimatedEntity) entity, f, f1, f2, f3, f4, f5);
        this.hip.render(f5);
    }
    public void renderStaticWall(float f) {

        this.chest.offsetY = 0.0F;
        this.chest.offsetX = 0.0F;
        this.chest.offsetZ = 0.0F;
        this.chest.render(0.01F);
        resetToDefaultPose();
    }

    public void renderStaticFloor(float f) {

        this.hip.offsetY = -0.12F;
        this.hip.render(0.01F);
        resetToDefaultPose();
    }
    @Override
    public void renderStaticBook(float f) {
        //Rotations, positions and sizing:
        this.hip.offsetY = 0.5F;
        this.hip.offsetX = 0.0F;
        this.hip.offsetZ = 2.0F;
        this.hip.rotateAngleY = (float)Math.toRadians(150);
        this.hip.rotateAngleX = (float)Math.toRadians(5);
        this.hip.rotateAngleZ = (float)Math.toRadians(0);
        this.hip.scaleChildren = true;
        float scaler = 0.7F;
        this.hip.setScale(scaler, scaler, scaler);
        //Start of pose:

        //End of pose, now render the model:
        this.hip.render(f);
        //Reset rotations, positions and sizing:
        this.hip.setScale(1.0F, 1.0F, 1.0F);
        this.hip.scaleChildren = false;
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

        EntityPrehistoricFloraScutellosaurus entityScutellosaurus = (EntityPrehistoricFloraScutellosaurus) e;

//        this.faceTarget(f3, f4, 12, Neck1);
//        this.faceTarget(f3, f4, 12, Neck2);
//        this.faceTarget(f3, f4, 12, Neck3);
//        this.faceTarget(f3, f4, 12, Head);

        AdvancedModelRenderer[] Tail = {this.tail1, this.tail2, this.tail3};
        AdvancedModelRenderer[] Neck = {this.chest, this.neck3, this.neck2, this.neck1, this.head};
        //AdvancedModelRenderer[] ArmL = {this.leftarm, this.leftarm2, this.leftarm3};
        //AdvancedModelRenderer[] ArmR = {this.rightarm, this.rightarm2, this.rightarm3};

        entityScutellosaurus.tailBuffer.applyChainSwingBuffer(Tail);

        if (entityScutellosaurus.getAnimation() == entityScutellosaurus.LAY_ANIMATION) {
            this.chainSwing(Neck, 0.5F, 0.10F, 0.5, f2, 0.8F);
            this.chainWave(Neck, 0.5F * 2, -0.02F, 0.5F, f2, 0.8F);
        }
        else {
            if (!entityScutellosaurus.isReallyInWater()) {

                if (f3 == 0.0F || !entityScutellosaurus.getIsMoving()) {
                    if (entityScutellosaurus.getAnimation() != entityScutellosaurus.EAT_ANIMATION
                        && entityScutellosaurus.getAnimation() != entityScutellosaurus.DRINK_ANIMATION) {
                        this.chainSwing(Neck, 0.05F, 0.10F, 0.5, f2, 0.8F);
                        this.chainWave(Neck, 0.05F * 2, -0.02F, 0.5F, f2, 0.8F);
                    }

                    this.chainWave(Tail, (0.15F * 0.35F), 0.125F * 0.15F, 0.2F, f2, 1F);
                    this.chainSwing(Tail, (0.15F * 0.35F) * 4F, 0.05F * 0.35F, 0.12F, f2, 1F);


                    return;
                }

                if (entityScutellosaurus.getIsFast()) { //Running


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
        this.eyes.setScale(1,1,1);
        EntityPrehistoricFloraScutellosaurus ee = (EntityPrehistoricFloraScutellosaurus) entitylivingbaseIn;

        if (!ee.isReallyInWater()) {
            if (ee.getIsMoving()) {
                if (ee.getIsFast()) { //Running
                    animRunning(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
                } else { //Walking
                    animWalking(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
                }
            }
        }
        else {
            //Swimming pose:
            if (!ee.getIsMoving()) { //static in water
                //
            }
            else {
                //moving in water
                //
            }
        }
        if (ee.getAnimation() == ee.EAT_ANIMATION) {
            animEat(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }

        else if (ee.getAnimation() == ee.MAKE_NEST_ANIMATION) {
            animNest(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.LAY_ANIMATION) {
            animLay(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.ROAR_ANIMATION) { //The noise anim
            animNoise(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }

        else if (ee.getAnimation() == ee.STAND_ANIMATION) { //The noise anim
            animIdle(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.ALERT_ANIMATION) {
            animAlert(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.GRAZE_ANIMATION) { //The leaves grazing anim
            animGraze(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }


    }
    public void animIdle(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraScutellosaurus entity = (EntityPrehistoricFloraScutellosaurus) entitylivingbaseIn;
        int animCycle = 12;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 1 + (((tickAnim - 0) / 4) * (1-(1)));
            yy = 1 + (((tickAnim - 0) / 4) * (0.01-(1)));
            zz = 1 + (((tickAnim - 0) / 4) * (1-(1)));
        }
        else if (tickAnim >= 4 && tickAnim < 6) {
            xx = 1 + (((tickAnim - 4) / 2) * (1-(1)));
            yy = 0.01 + (((tickAnim - 4) / 2) * (0.01-(0.01)));
            zz = 1 + (((tickAnim - 4) / 2) * (1-(1)));
        }
        else if (tickAnim >= 6 && tickAnim < 13) {
            xx = 1 + (((tickAnim - 6) / 7) * (1-(1)));
            yy = 0.01 + (((tickAnim - 6) / 7) * (1-(0.01)));
            zz = 1 + (((tickAnim - 6) / 7) * (1-(1)));
        }
        else {
            xx = 1;
            yy = 1;
            zz = 1;
        }
        this.eyes.setScale((float)xx, (float)yy, (float)zz);
        
    }

    public void animNoise(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraScutellosaurus entity = (EntityPrehistoricFloraScutellosaurus) entitylivingbaseIn;
        int animCycle = 40;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        if (tickAnim >= 0 && tickAnim < 15) {
            xx = -0-Math.sin((Math.PI/180)*(((double)tickAnim/20)*1200))*-2 + (((tickAnim - 0) / 15) * (-10.25-(-0-Math.sin((Math.PI/180)*(((double)tickAnim/20)*1200))*-2)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 30) {
            xx = -10.25 + (((tickAnim - 15) / 15) * (-76.725-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-50-(-10.25)));
            yy = 0 + (((tickAnim - 15) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 15) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = -76.725-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-50 + (((tickAnim - 30) / 10) * (0-(-76.725-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-50)));
            yy = 0 + (((tickAnim - 30) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck1, neck1.rotateAngleX + (float) Math.toRadians(xx), neck1.rotateAngleY + (float) Math.toRadians(yy), neck1.rotateAngleZ + (float) Math.toRadians(zz));

        this.neck1.rotationPointX = this.neck1.rotationPointX + (float)(0);
        this.neck1.rotationPointY = this.neck1.rotationPointY - (float)(0);
        this.neck1.rotationPointZ = this.neck1.rotationPointZ + (float)(0);



        if (tickAnim >= 0 && tickAnim < 15) {
            xx = -8.825-Math.sin((Math.PI/180)*(((double)tickAnim/20)*1200+60))*-10 + (((tickAnim - 0) / 15) * (-9.5-(-8.825-Math.sin((Math.PI/180)*(((double)tickAnim/20)*1200+60))*-10)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 30) {
            xx = -9.5 + (((tickAnim - 15) / 15) * (-16.5-(-9.5)));
            yy = 0 + (((tickAnim - 15) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 15) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = -16.5 + (((tickAnim - 30) / 10) * (0-(-16.5)));
            yy = 0 + (((tickAnim - 30) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(xx), neck2.rotateAngleY + (float) Math.toRadians(yy), neck2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0.25-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 15) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 15) / 15) * (0-(0)));
            zz = 0.25 + (((tickAnim - 15) / 15) * (0.25-(0.25)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 30) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 30) / 10) * (0-(0)));
            zz = 0.25 + (((tickAnim - 30) / 10) * (0-(0.25)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.neck2.rotationPointX = this.neck2.rotationPointX + (float)(xx);
        this.neck2.rotationPointY = this.neck2.rotationPointY - (float)(yy);
        this.neck2.rotationPointZ = this.neck2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 8.725-Math.sin((Math.PI/180)*(((double)tickAnim/20)*1200+120))*10 + (((tickAnim - 0) / 6) * (8.725-Math.sin((Math.PI/180)*(((double)tickAnim/20)*1200+120))*10-(8.725-Math.sin((Math.PI/180)*(((double)tickAnim/20)*1200+120))*10)));
            yy = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 15) {
            xx = 8.725-Math.sin((Math.PI/180)*(((double)tickAnim/20)*1200+120))*10 + (((tickAnim - 6) / 9) * (-10-(8.725-Math.sin((Math.PI/180)*(((double)tickAnim/20)*1200+120))*10)));
            yy = 0 + (((tickAnim - 6) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 9) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 30) {
            xx = -10 + (((tickAnim - 15) / 15) * (7.5-(-10)));
            yy = 0 + (((tickAnim - 15) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 15) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = 7.5 + (((tickAnim - 30) / 10) * (0-(7.5)));
            yy = 0 + (((tickAnim - 30) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(xx), neck3.rotateAngleY + (float) Math.toRadians(yy), neck3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 6) {
            xx = -0-Math.sin((Math.PI/180)*(((double)tickAnim/20)*1200))*10 + (((tickAnim - 0) / 6) * (-0-Math.sin((Math.PI/180)*(((double)tickAnim/20)*1200))*10-(-0-Math.sin((Math.PI/180)*(((double)tickAnim/20)*1200))*10)));
            yy = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 15) {
            xx = -0-Math.sin((Math.PI/180)*(((double)tickAnim/20)*1200))*10 + (((tickAnim - 6) / 9) * (-7.25-(-0-Math.sin((Math.PI/180)*(((double)tickAnim/20)*1200))*10)));
            yy = 0 + (((tickAnim - 6) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 9) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 30) {
            xx = -7.25 + (((tickAnim - 15) / 15) * (1.5-(-7.25)));
            yy = 0 + (((tickAnim - 15) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 15) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = 1.5 + (((tickAnim - 30) / 10) * (0-(1.5)));
            yy = 0 + (((tickAnim - 30) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 14.975-Math.sin((Math.PI/180)*(((double)tickAnim/20)*1200+100))*15 + (((tickAnim - 0) / 3) * (6.475-Math.sin((Math.PI/180)*(((double)tickAnim/20)*1200+100))*15-(14.975-Math.sin((Math.PI/180)*(((double)tickAnim/20)*1200+100))*15)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 6) {
            xx = 6.475-Math.sin((Math.PI/180)*(((double)tickAnim/20)*1200+100))*15 + (((tickAnim - 3) / 3) * (14.975-Math.sin((Math.PI/180)*(((double)tickAnim/20)*1200+100))*15-(6.475-Math.sin((Math.PI/180)*(((double)tickAnim/20)*1200+100))*15)));
            yy = 0 + (((tickAnim - 3) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 3) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = 14.975-Math.sin((Math.PI/180)*(((double)tickAnim/20)*1200+100))*15 + (((tickAnim - 6) / 2) * (6.475-Math.sin((Math.PI/180)*(((double)tickAnim/20)*1200+100))*15-(14.975-Math.sin((Math.PI/180)*(((double)tickAnim/20)*1200+100))*15)));
            yy = 0 + (((tickAnim - 6) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 2) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 12) {
            xx = 6.475-Math.sin((Math.PI/180)*(((double)tickAnim/20)*1200+100))*15 + (((tickAnim - 8) / 4) * (14.975-Math.sin((Math.PI/180)*(((double)tickAnim/20)*1200+100))*15-(6.475-Math.sin((Math.PI/180)*(((double)tickAnim/20)*1200+100))*15)));
            yy = 0 + (((tickAnim - 8) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 4) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 18) {
            xx = 14.975-Math.sin((Math.PI/180)*(((double)tickAnim/20)*1200+100))*15 + (((tickAnim - 12) / 6) * (0-(14.975-Math.sin((Math.PI/180)*(((double)tickAnim/20)*1200+100))*15)));
            yy = 0 + (((tickAnim - 12) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 6) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 21) {
            xx = 0 + (((tickAnim - 18) / 3) * (7.8-(0)));
            yy = 0 + (((tickAnim - 18) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 3) * (0-(0)));
        }
        else if (tickAnim >= 21 && tickAnim < 29) {
            xx = 7.8 + (((tickAnim - 21) / 8) * (20.75-(7.8)));
            yy = 0 + (((tickAnim - 21) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 21) / 8) * (0-(0)));
        }
        else if (tickAnim >= 29 && tickAnim < 36) {
            xx = 20.75 + (((tickAnim - 29) / 7) * (0-(20.75)));
            yy = 0 + (((tickAnim - 29) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 29) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(xx), jaw.rotateAngleY + (float) Math.toRadians(yy), jaw.rotateAngleZ + (float) Math.toRadians(zz));

    }
    public void animEat(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraScutellosaurus entity = (EntityPrehistoricFloraScutellosaurus) entitylivingbaseIn;
        int animCycle = 20;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (13-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 13 + (((tickAnim - 10) / 10) * (0-(13)));
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
            xx = 0 + (((tickAnim - 0) / 10) * (11-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 11 + (((tickAnim - 10) / 10) * (0-(11)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(xx), chest.rotateAngleY + (float) Math.toRadians(yy), chest.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (-39-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = -39 + (((tickAnim - 10) / 10) * (0-(-39)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm, leftArm.rotateAngleX + (float) Math.toRadians(xx), leftArm.rotateAngleY + (float) Math.toRadians(yy), leftArm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (-23.25-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (20.25-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (-113.5-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = -23.25 + (((tickAnim - 10) / 10) * (0-(-23.25)));
            yy = 20.25 + (((tickAnim - 10) / 10) * (0-(20.25)));
            zz = -113.5 + (((tickAnim - 10) / 10) * (0-(-113.5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm3, leftArm3.rotateAngleX + (float) Math.toRadians(xx), leftArm3.rotateAngleY + (float) Math.toRadians(yy), leftArm3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (-1.075-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0.725-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0.3-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = -1.075 + (((tickAnim - 10) / 10) * (0-(-1.075)));
            yy = 0.725 + (((tickAnim - 10) / 10) * (0-(0.725)));
            zz = 0.3 + (((tickAnim - 10) / 10) * (0-(0.3)));
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
            xx = 0 + (((tickAnim - 0) / 8) * (19.5-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 19.5 + (((tickAnim - 8) / 2) * (27-(19.5)));
            yy = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 2) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 27 + (((tickAnim - 10) / 10) * (0-(27)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck1, neck1.rotateAngleX + (float) Math.toRadians(xx), neck1.rotateAngleY + (float) Math.toRadians(yy), neck1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (-6.75-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = -6.75 + (((tickAnim - 8) / 2) * (11-(-6.75)));
            yy = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 2) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 11 + (((tickAnim - 10) / 10) * (0-(11)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(xx), neck2.rotateAngleY + (float) Math.toRadians(yy), neck2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (15.75-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 15.75 + (((tickAnim - 8) / 2) * (-0.25-(15.75)));
            yy = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 2) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = -0.25 + (((tickAnim - 10) / 3) * (13.08-(-0.25)));
            yy = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 3) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 20) {
            xx = 13.08 + (((tickAnim - 13) / 7) * (0-(13.08)));
            yy = 0 + (((tickAnim - 13) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(xx), neck3.rotateAngleY + (float) Math.toRadians(yy), neck3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0.05-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0.175-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            yy = 0.05 + (((tickAnim - 8) / 2) * (0-(0.05)));
            zz = 0.175 + (((tickAnim - 8) / 2) * (0-(0.175)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.neck3.rotationPointX = this.neck3.rotationPointX + (float)(xx);
        this.neck3.rotationPointY = this.neck3.rotationPointY - (float)(yy);
        this.neck3.rotationPointZ = this.neck3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (6.75-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 10) {
            xx = 6.75 + (((tickAnim - 7) / 3) * (-13.5-(6.75)));
            yy = 0 + (((tickAnim - 7) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 3) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = -13.5 + (((tickAnim - 10) / 3) * (10.25-(-13.5)));
            yy = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 3) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 20) {
            xx = 10.25 + (((tickAnim - 13) / 7) * (0-(10.25)));
            yy = 0 + (((tickAnim - 13) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 7) * (0-(0)));
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
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 7) / 1) * (19.5-(0)));
            yy = 0 + (((tickAnim - 7) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 1) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 19.5 + (((tickAnim - 8) / 2) * (0-(19.5)));
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
            xx = 0 + (((tickAnim - 0) / 10) * (-39-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = -39 + (((tickAnim - 10) / 10) * (0-(-39)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm, rightArm.rotateAngleX + (float) Math.toRadians(xx), rightArm.rotateAngleY + (float) Math.toRadians(yy), rightArm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (-23.25-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (-20.25-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (113.5-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = -23.25 + (((tickAnim - 10) / 10) * (0-(-23.25)));
            yy = -20.25 + (((tickAnim - 10) / 10) * (0-(-20.25)));
            zz = 113.5 + (((tickAnim - 10) / 10) * (0-(113.5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm3, rightArm3.rotateAngleX + (float) Math.toRadians(xx), rightArm3.rotateAngleY + (float) Math.toRadians(yy), rightArm3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (1.075-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0.725-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0.3-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 1.075 + (((tickAnim - 10) / 10) * (0-(1.075)));
            yy = 0.725 + (((tickAnim - 10) / 10) * (0-(0.725)));
            zz = 0.3 + (((tickAnim - 10) / 10) * (0-(0.3)));
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
    public void animLay(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraScutellosaurus entity = (EntityPrehistoricFloraScutellosaurus) entitylivingbaseIn;
        int animCycle = 50;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (-26.5-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = -26.5 + (((tickAnim - 10) / 10) * (-9.5-(-26.5)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = -9.5 + (((tickAnim - 20) / 10) * (-9.5-(-9.5)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = -9.5 + (((tickAnim - 30) / 10) * (-34-(-9.5)));
            yy = 0 + (((tickAnim - 30) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 10) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = -34 + (((tickAnim - 40) / 10) * (0-(-34)));
            yy = 0 + (((tickAnim - 40) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(hip, hip.rotateAngleX + (float) Math.toRadians(xx), hip.rotateAngleY + (float) Math.toRadians(yy), hip.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (-5.575-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (2.25-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            yy = -5.575 + (((tickAnim - 10) / 10) * (-6-(-5.575)));
            zz = 2.25 + (((tickAnim - 10) / 10) * (2.325-(2.25)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            yy = -6 + (((tickAnim - 20) / 10) * (-6-(-6)));
            zz = 2.325 + (((tickAnim - 20) / 10) * (2.325-(2.325)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 30) / 10) * (0-(0)));
            yy = -6 + (((tickAnim - 30) / 10) * (-5.2-(-6)));
            zz = 2.325 + (((tickAnim - 30) / 10) * (4.635-(2.325)));
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 40) / 10) * (0-(0)));
            yy = -5.2 + (((tickAnim - 40) / 10) * (0-(-5.2)));
            zz = 4.635 + (((tickAnim - 40) / 10) * (0-(4.635)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.hip.rotationPointX = this.hip.rotationPointX + (float)(xx);
        this.hip.rotationPointY = this.hip.rotationPointY - (float)(yy);
        this.hip.rotationPointZ = this.hip.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (5.25-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 5.25 + (((tickAnim - 20) / 10) * (5.25-(5.25)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = 5.25 + (((tickAnim - 30) / 10) * (13.75-(5.25)));
            yy = 0 + (((tickAnim - 30) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 10) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = 13.75 + (((tickAnim - 40) / 10) * (0-(13.75)));
            yy = 0 + (((tickAnim - 40) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(xx), body.rotateAngleY + (float) Math.toRadians(yy), body.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (6.75-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 30) {
            xx = 6.75 + (((tickAnim - 10) / 20) * (6.75-(6.75)));
            yy = 0 + (((tickAnim - 10) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 20) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 6.75 + (((tickAnim - 30) / 20) * (0-(6.75)));
            yy = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(xx), chest.rotateAngleY + (float) Math.toRadians(yy), chest.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 10) / 10) * (-47-(0)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = -47 + (((tickAnim - 20) / 10) * (-47-(-47)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = -47 + (((tickAnim - 30) / 10) * (0-(-47)));
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
        this.setRotateAngle(leftArm, leftArm.rotateAngleX + (float) Math.toRadians(xx), leftArm.rotateAngleY + (float) Math.toRadians(yy), leftArm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 10) / 10) * (-37.25-(0)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = -37.25 + (((tickAnim - 20) / 10) * (-37.25-(-37.25)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = -37.25 + (((tickAnim - 30) / 10) * (0-(-37.25)));
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
        this.setRotateAngle(leftArm2, leftArm2.rotateAngleX + (float) Math.toRadians(xx), leftArm2.rotateAngleY + (float) Math.toRadians(yy), leftArm2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (19.75-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 19.75 + (((tickAnim - 10) / 10) * (0-(19.75)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 30) / 10) * (15-(0)));
            yy = 0 + (((tickAnim - 30) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 10) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = 15 + (((tickAnim - 40) / 10) * (0-(15)));
            yy = 0 + (((tickAnim - 40) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck1, neck1.rotateAngleX + (float) Math.toRadians(xx), neck1.rotateAngleY + (float) Math.toRadians(yy), neck1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (-11-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 40) {
            xx = -11 + (((tickAnim - 10) / 30) * (0-(-11)));
            yy = 0 + (((tickAnim - 10) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 30) * (0-(0)));
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
        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(xx), neck3.rotateAngleY + (float) Math.toRadians(yy), neck3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (-44-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = -44 + (((tickAnim - 10) / 10) * (-62-(-44)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = -62 + (((tickAnim - 20) / 10) * (-62-(-62)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = -62 + (((tickAnim - 30) / 10) * (-36.75-(-62)));
            yy = 0 + (((tickAnim - 30) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 10) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = -36.75 + (((tickAnim - 40) / 10) * (0-(-36.75)));
            yy = 0 + (((tickAnim - 40) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg, leftLeg.rotateAngleX + (float) Math.toRadians(xx), leftLeg.rotateAngleY + (float) Math.toRadians(yy), leftLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (37.25-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 37.25 + (((tickAnim - 10) / 10) * (46.25-(37.25)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 46.25 + (((tickAnim - 20) / 10) * (46.25-(46.25)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = 46.25 + (((tickAnim - 30) / 10) * (25.62-(46.25)));
            yy = 0 + (((tickAnim - 30) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 10) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = 25.62 + (((tickAnim - 40) / 10) * (0-(25.62)));
            yy = 0 + (((tickAnim - 40) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg2, leftLeg2.rotateAngleX + (float) Math.toRadians(xx), leftLeg2.rotateAngleY + (float) Math.toRadians(yy), leftLeg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (-34.67-(0)));
            yy = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 10) {
            xx = -34.67 + (((tickAnim - 4) / 6) * (-37-(-34.67)));
            yy = 0 + (((tickAnim - 4) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 6) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = -37 + (((tickAnim - 10) / 10) * (-45.75-(-37)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = -45.75 + (((tickAnim - 20) / 10) * (-45.75-(-45.75)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = -45.75 + (((tickAnim - 30) / 10) * (-22.38-(-45.75)));
            yy = 0 + (((tickAnim - 30) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 10) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 45) {
            xx = -22.38 + (((tickAnim - 40) / 5) * (-29.94-(-22.38)));
            yy = 0 + (((tickAnim - 40) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 5) * (0-(0)));
        }
        else if (tickAnim >= 45 && tickAnim < 50) {
            xx = -29.94 + (((tickAnim - 45) / 5) * (0-(-29.94)));
            yy = 0 + (((tickAnim - 45) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 45) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg3, leftLeg3.rotateAngleX + (float) Math.toRadians(xx), leftLeg3.rotateAngleY + (float) Math.toRadians(yy), leftLeg3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (49-(0)));
            yy = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 10) {
            xx = 49 + (((tickAnim - 4) / 6) * (69-(49)));
            yy = 0 + (((tickAnim - 4) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 6) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 69 + (((tickAnim - 10) / 10) * (71.5-(69)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 71.5 + (((tickAnim - 20) / 10) * (71.5-(71.5)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = 71.5 + (((tickAnim - 30) / 10) * (65.75-(71.5)));
            yy = 0 + (((tickAnim - 30) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 10) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 45) {
            xx = 65.75 + (((tickAnim - 40) / 5) * (51.87-(65.75)));
            yy = 0 + (((tickAnim - 40) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 5) * (0-(0)));
        }
        else if (tickAnim >= 45 && tickAnim < 50) {
            xx = 51.87 + (((tickAnim - 45) / 5) * (0-(51.87)));
            yy = 0 + (((tickAnim - 45) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 45) / 5) * (0-(0)));
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
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 5) / 5) * (9-(0)));
            yy = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 5) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 9 + (((tickAnim - 10) / 10) * (0-(9)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 30) / 10) * (17.75-(0)));
            yy = 0 + (((tickAnim - 30) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 10) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = 17.75 + (((tickAnim - 40) / 10) * (0-(17.75)));
            yy = 0 + (((tickAnim - 40) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail1, tail1.rotateAngleX + (float) Math.toRadians(xx), tail1.rotateAngleY + (float) Math.toRadians(yy), tail1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 5) / 5) * (13.25-(0)));
            yy = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 5) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 13.25 + (((tickAnim - 10) / 10) * (0-(13.25)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 30) / 10) * (13.75-(0)));
            yy = 0 + (((tickAnim - 30) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 10) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 43) {
            xx = 13.75 + (((tickAnim - 40) / 3) * (0-(13.75)));
            yy = 0 + (((tickAnim - 40) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 3) * (0-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 43) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 43) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 43) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(xx), tail2.rotateAngleY + (float) Math.toRadians(yy), tail2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (9.25-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 9.25 + (((tickAnim - 10) / 10) * (3.5-(9.25)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 3.5 + (((tickAnim - 20) / 10) * (3.5-(3.5)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = 3.5 + (((tickAnim - 30) / 10) * (7.25-(3.5)));
            yy = 0 + (((tickAnim - 30) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 10) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = 7.25 + (((tickAnim - 40) / 10) * (0-(7.25)));
            yy = 0 + (((tickAnim - 40) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(xx), tail3.rotateAngleY + (float) Math.toRadians(yy), tail3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (4.5-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 4.5 + (((tickAnim - 10) / 10) * (16.75-(4.5)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 16.75 + (((tickAnim - 20) / 10) * (16.75-(16.75)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = 16.75 + (((tickAnim - 30) / 10) * (4.25-(16.75)));
            yy = 0 + (((tickAnim - 30) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 10) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 43) {
            xx = 4.25 + (((tickAnim - 40) / 3) * (11.83-(4.25)));
            yy = 0 + (((tickAnim - 40) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 3) * (0-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 46) {
            xx = 11.83 + (((tickAnim - 43) / 3) * (0-(11.83)));
            yy = 0 + (((tickAnim - 43) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 43) / 3) * (0-(0)));
        }
        else if (tickAnim >= 46 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 46) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 46) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 46) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(xx), tail4.rotateAngleY + (float) Math.toRadians(yy), tail4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 10) / 10) * (-47-(0)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = -47 + (((tickAnim - 20) / 10) * (-47-(-47)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = -47 + (((tickAnim - 30) / 10) * (0-(-47)));
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
        this.setRotateAngle(rightArm, rightArm.rotateAngleX + (float) Math.toRadians(xx), rightArm.rotateAngleY + (float) Math.toRadians(yy), rightArm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 10) / 10) * (-37.25-(0)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = -37.25 + (((tickAnim - 20) / 10) * (-37.25-(-37.25)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = -37.25 + (((tickAnim - 30) / 10) * (0-(-37.25)));
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
        this.setRotateAngle(rightArm2, rightArm2.rotateAngleX + (float) Math.toRadians(xx), rightArm2.rotateAngleY + (float) Math.toRadians(yy), rightArm2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (-44-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = -44 + (((tickAnim - 10) / 10) * (-62-(-44)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = -62 + (((tickAnim - 20) / 10) * (-62-(-62)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = -62 + (((tickAnim - 30) / 10) * (-36.75-(-62)));
            yy = 0 + (((tickAnim - 30) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 10) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = -36.75 + (((tickAnim - 40) / 10) * (0-(-36.75)));
            yy = 0 + (((tickAnim - 40) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg, rightLeg.rotateAngleX + (float) Math.toRadians(xx), rightLeg.rotateAngleY + (float) Math.toRadians(yy), rightLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (37.25-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 37.25 + (((tickAnim - 10) / 10) * (46.25-(37.25)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 46.25 + (((tickAnim - 20) / 10) * (46.25-(46.25)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = 46.25 + (((tickAnim - 30) / 10) * (25.62-(46.25)));
            yy = 0 + (((tickAnim - 30) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 10) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = 25.62 + (((tickAnim - 40) / 10) * (0-(25.62)));
            yy = 0 + (((tickAnim - 40) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg2, rightLeg2.rotateAngleX + (float) Math.toRadians(xx), rightLeg2.rotateAngleY + (float) Math.toRadians(yy), rightLeg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (-34.67-(0)));
            yy = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 10) {
            xx = -34.67 + (((tickAnim - 4) / 6) * (-37-(-34.67)));
            yy = 0 + (((tickAnim - 4) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 6) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = -37 + (((tickAnim - 10) / 10) * (-45.75-(-37)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = -45.75 + (((tickAnim - 20) / 10) * (-45.75-(-45.75)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = -45.75 + (((tickAnim - 30) / 10) * (-22.38-(-45.75)));
            yy = 0 + (((tickAnim - 30) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 10) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 45) {
            xx = -22.38 + (((tickAnim - 40) / 5) * (-29.94-(-22.38)));
            yy = 0 + (((tickAnim - 40) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 5) * (0-(0)));
        }
        else if (tickAnim >= 45 && tickAnim < 50) {
            xx = -29.94 + (((tickAnim - 45) / 5) * (0-(-29.94)));
            yy = 0 + (((tickAnim - 45) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 45) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg3, rightLeg3.rotateAngleX + (float) Math.toRadians(xx), rightLeg3.rotateAngleY + (float) Math.toRadians(yy), rightLeg3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (49-(0)));
            yy = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 10) {
            xx = 49 + (((tickAnim - 4) / 6) * (69-(49)));
            yy = 0 + (((tickAnim - 4) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 6) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 69 + (((tickAnim - 10) / 10) * (71.5-(69)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 71.5 + (((tickAnim - 20) / 10) * (71.5-(71.5)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = 71.5 + (((tickAnim - 30) / 10) * (65.75-(71.5)));
            yy = 0 + (((tickAnim - 30) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 10) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 45) {
            xx = 65.75 + (((tickAnim - 40) / 5) * (51.87-(65.75)));
            yy = 0 + (((tickAnim - 40) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 5) * (0-(0)));
        }
        else if (tickAnim >= 45 && tickAnim < 50) {
            xx = 51.87 + (((tickAnim - 45) / 5) * (0-(51.87)));
            yy = 0 + (((tickAnim - 45) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 45) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg4, rightLeg4.rotateAngleX + (float) Math.toRadians(xx), rightLeg4.rotateAngleY + (float) Math.toRadians(yy), rightLeg4.rotateAngleZ + (float) Math.toRadians(zz));

    }

    public void animNest(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraScutellosaurus entity = (EntityPrehistoricFloraScutellosaurus) entitylivingbaseIn;
        int animCycle = 50;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (-25.5-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 23) {
            xx = -25.5 + (((tickAnim - 13) / 10) * (-25.5-(-25.5)));
            yy = 0 + (((tickAnim - 13) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 10) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 33) {
            xx = -25.5 + (((tickAnim - 23) / 10) * (-25.5-(-25.5)));
            yy = 0 + (((tickAnim - 23) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 10) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 50) {
            xx = -25.5 + (((tickAnim - 33) / 17) * (0-(-25.5)));
            yy = 0 + (((tickAnim - 33) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 17) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(hip, hip.rotateAngleX + (float) Math.toRadians(xx), hip.rotateAngleY + (float) Math.toRadians(yy), hip.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (-3.6-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (4.2-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 13) / 10) * (0-(0)));
            yy = -3.6 + (((tickAnim - 13) / 10) * (-3.6-(-3.6)));
            zz = 4.2 + (((tickAnim - 13) / 10) * (4.2-(4.2)));
        }
        else if (tickAnim >= 23 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 23) / 10) * (0-(0)));
            yy = -3.6 + (((tickAnim - 23) / 10) * (-3.6-(-3.6)));
            zz = 4.2 + (((tickAnim - 23) / 10) * (4.2-(4.2)));
        }
        else if (tickAnim >= 33 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 33) / 17) * (0-(0)));
            yy = -3.6 + (((tickAnim - 33) / 17) * (0-(-3.6)));
            zz = 4.2 + (((tickAnim - 33) / 17) * (0-(4.2)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.hip.rotationPointX = this.hip.rotationPointX + (float)(xx);
        this.hip.rotationPointY = this.hip.rotationPointY - (float)(yy);
        this.hip.rotationPointZ = this.hip.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (6.075-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 13) {
            xx = 6.075 + (((tickAnim - 13) / 0) * (8.25-Math.sin((Math.PI/180)*(((double)tickAnim/20)*560+150))*5-(6.075)));
            yy = 0 + (((tickAnim - 13) / 0) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 0) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 33) {
            xx = 8.25-Math.sin((Math.PI/180)*(((double)tickAnim/20)*560+150))*5 + (((tickAnim - 13) / 20) * (8.25-Math.sin((Math.PI/180)*(((double)tickAnim/20)*560+150))*5-(8.25-Math.sin((Math.PI/180)*(((double)tickAnim/20)*560+150))*5)));
            yy = 0 + (((tickAnim - 13) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 20) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 34) {
            xx = 8.25-Math.sin((Math.PI/180)*(((double)tickAnim/20)*560+150))*5 + (((tickAnim - 33) / 1) * (6.65-(8.25-Math.sin((Math.PI/180)*(((double)tickAnim/20)*560+150))*5)));
            yy = 0 + (((tickAnim - 33) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 1) * (0-(0)));
        }
        else if (tickAnim >= 34 && tickAnim < 50) {
            xx = 6.65 + (((tickAnim - 34) / 16) * (0-(6.65)));
            yy = 0 + (((tickAnim - 34) / 16) * (0-(0)));
            zz = 0 + (((tickAnim - 34) / 16) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(xx), body.rotateAngleY + (float) Math.toRadians(yy), body.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (12-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
            xx = 12 + (((tickAnim - 13) / 5) * (17-(12)));
            yy = 0 + (((tickAnim - 13) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 5) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 23) {
            xx = 17 + (((tickAnim - 18) / 5) * (12-(17)));
            yy = 0 + (((tickAnim - 18) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 5) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 28) {
            xx = 12 + (((tickAnim - 23) / 5) * (17-(12)));
            yy = 0 + (((tickAnim - 23) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 5) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 33) {
            xx = 17 + (((tickAnim - 28) / 5) * (12-(17)));
            yy = 0 + (((tickAnim - 28) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 5) * (0-(0)));
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
        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(xx), chest.rotateAngleY + (float) Math.toRadians(yy), chest.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (21.67842-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (-4.36348-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (1.87867-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
            xx = 21.67842 + (((tickAnim - 13) / 5) * (-52.03516-(21.67842)));
            yy = -4.36348 + (((tickAnim - 13) / 5) * (1.84083-(-4.36348)));
            zz = 1.87867 + (((tickAnim - 13) / 5) * (-24.01986-(1.87867)));
        }
        else if (tickAnim >= 18 && tickAnim < 23) {
            xx = -52.03516 + (((tickAnim - 18) / 5) * (21.72149-(-52.03516)));
            yy = 1.84083 + (((tickAnim - 18) / 5) * (2.75618-(1.84083)));
            zz = -24.01986 + (((tickAnim - 18) / 5) * (-1.18515-(-24.01986)));
        }
        else if (tickAnim >= 23 && tickAnim < 28) {
            xx = 21.72149 + (((tickAnim - 23) / 5) * (-52.03516-(21.72149)));
            yy = 2.75618 + (((tickAnim - 23) / 5) * (1.84083-(2.75618)));
            zz = -1.18515 + (((tickAnim - 23) / 5) * (-24.01986-(-1.18515)));
        }
        else if (tickAnim >= 28 && tickAnim < 33) {
            xx = -52.03516 + (((tickAnim - 28) / 5) * (21.67067-(-52.03516)));
            yy = 1.84083 + (((tickAnim - 28) / 5) * (4.59305-(1.84083)));
            zz = -24.01986 + (((tickAnim - 28) / 5) * (-1.97796-(-24.01986)));
        }
        else if (tickAnim >= 33 && tickAnim < 50) {
            xx = 21.67067 + (((tickAnim - 33) / 17) * (0-(21.67067)));
            yy = 4.59305 + (((tickAnim - 33) / 17) * (0-(4.59305)));
            zz = -1.97796 + (((tickAnim - 33) / 17) * (0-(-1.97796)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm, leftArm.rotateAngleX + (float) Math.toRadians(xx), leftArm.rotateAngleY + (float) Math.toRadians(yy), leftArm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (-29-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
            xx = -29 + (((tickAnim - 13) / 5) * (-9.75-(-29)));
            yy = 0 + (((tickAnim - 13) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 5) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 23) {
            xx = -9.75 + (((tickAnim - 18) / 5) * (5.64366-(-9.75)));
            yy = 0 + (((tickAnim - 18) / 5) * (8.45911-(0)));
            zz = 0 + (((tickAnim - 18) / 5) * (-8.185-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 28) {
            xx = 5.64366 + (((tickAnim - 23) / 5) * (-9.75-(5.64366)));
            yy = 8.45911 + (((tickAnim - 23) / 5) * (0-(8.45911)));
            zz = -8.185 + (((tickAnim - 23) / 5) * (0-(-8.185)));
        }
        else if (tickAnim >= 28 && tickAnim < 33) {
            xx = -9.75 + (((tickAnim - 28) / 5) * (12-(-9.75)));
            yy = 0 + (((tickAnim - 28) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 5) * (0-(0)));
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
        this.setRotateAngle(leftArm2, leftArm2.rotateAngleX + (float) Math.toRadians(xx), leftArm2.rotateAngleY + (float) Math.toRadians(yy), leftArm2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 13) / 5) * (-15.33353-(0)));
            yy = 0 + (((tickAnim - 13) / 5) * (33.53712-(0)));
            zz = 0 + (((tickAnim - 13) / 5) * (-66.39551-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 21) {
            xx = -15.33353 + (((tickAnim - 18) / 3) * (0.78719-(-15.33353)));
            yy = 33.53712 + (((tickAnim - 18) / 3) * (18.37595-(33.53712)));
            zz = -66.39551 + (((tickAnim - 18) / 3) * (-5.6888-(-66.39551)));
        }
        else if (tickAnim >= 21 && tickAnim < 23) {
            xx = 0.78719 + (((tickAnim - 21) / 2) * (0-(0.78719)));
            yy = 18.37595 + (((tickAnim - 21) / 2) * (0-(18.37595)));
            zz = -5.6888 + (((tickAnim - 21) / 2) * (0-(-5.6888)));
        }
        else if (tickAnim >= 23 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 23) / 5) * (-15.33353-(0)));
            yy = 0 + (((tickAnim - 23) / 5) * (33.53712-(0)));
            zz = 0 + (((tickAnim - 23) / 5) * (-66.39551-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 31) {
            xx = -15.33353 + (((tickAnim - 28) / 3) * (0.78719-(-15.33353)));
            yy = 33.53712 + (((tickAnim - 28) / 3) * (18.37595-(33.53712)));
            zz = -66.39551 + (((tickAnim - 28) / 3) * (-5.6888-(-66.39551)));
        }
        else if (tickAnim >= 31 && tickAnim < 33) {
            xx = 0.78719 + (((tickAnim - 31) / 2) * (0-(0.78719)));
            yy = 18.37595 + (((tickAnim - 31) / 2) * (0-(18.37595)));
            zz = -5.6888 + (((tickAnim - 31) / 2) * (0-(-5.6888)));
        }
        else if (tickAnim >= 33 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 33) / 17) * (0-(0)));
            yy = 0 + (((tickAnim - 33) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 17) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm3, leftArm3.rotateAngleX + (float) Math.toRadians(xx), leftArm3.rotateAngleY + (float) Math.toRadians(yy), leftArm3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 13 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 13) / 5) * (0.175-(0)));
            yy = 0 + (((tickAnim - 13) / 5) * (0.375-(0)));
            zz = 0 + (((tickAnim - 13) / 5) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 23) {
            xx = 0.175 + (((tickAnim - 18) / 5) * (0-(0.175)));
            yy = 0.375 + (((tickAnim - 18) / 5) * (0-(0.375)));
            zz = 0 + (((tickAnim - 18) / 5) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 23) / 5) * (0.175-(0)));
            yy = 0 + (((tickAnim - 23) / 5) * (0.375-(0)));
            zz = 0 + (((tickAnim - 23) / 5) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 33) {
            xx = 0.175 + (((tickAnim - 28) / 5) * (0-(0.175)));
            yy = 0.375 + (((tickAnim - 28) / 5) * (0-(0.375)));
            zz = 0 + (((tickAnim - 28) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftArm3.rotationPointX = this.leftArm3.rotationPointX + (float)(xx);
        this.leftArm3.rotationPointY = this.leftArm3.rotationPointY - (float)(yy);
        this.leftArm3.rotationPointZ = this.leftArm3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (10.75-Math.sin((Math.PI/180)*(((double)tickAnim/20)*560+250))*5-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 33) {
            xx = 10.75-Math.sin((Math.PI/180)*(((double)tickAnim/20)*560+250))*5 + (((tickAnim - 13) / 20) * (10.75-Math.sin((Math.PI/180)*(((double)tickAnim/20)*560+250))*5-(10.75-Math.sin((Math.PI/180)*(((double)tickAnim/20)*560+250))*5)));
            yy = 0 + (((tickAnim - 13) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 20) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 50) {
            xx = 10.75-Math.sin((Math.PI/180)*(((double)tickAnim/20)*560+250))*5 + (((tickAnim - 33) / 17) * (0-(10.75-Math.sin((Math.PI/180)*(((double)tickAnim/20)*560+250))*5)));
            yy = 0 + (((tickAnim - 33) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 17) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck1, neck1.rotateAngleX + (float) Math.toRadians(xx), neck1.rotateAngleY + (float) Math.toRadians(yy), neck1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (-7.5-Math.sin((Math.PI/180)*(((double)tickAnim/20)*560+350))*10-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 33) {
            xx = -7.5-Math.sin((Math.PI/180)*(((double)tickAnim/20)*560+350))*10 + (((tickAnim - 13) / 20) * (-7.5-Math.sin((Math.PI/180)*(((double)tickAnim/20)*560+350))*10-(-7.5-Math.sin((Math.PI/180)*(((double)tickAnim/20)*560+350))*10)));
            yy = 0 + (((tickAnim - 13) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 20) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 34) {
            xx = -7.5-Math.sin((Math.PI/180)*(((double)tickAnim/20)*560+350))*10 + (((tickAnim - 33) / 1) * (-1.3-(-7.5-Math.sin((Math.PI/180)*(((double)tickAnim/20)*560+350))*10)));
            yy = 0 + (((tickAnim - 33) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 1) * (0-(0)));
        }
        else if (tickAnim >= 34 && tickAnim < 50) {
            xx = -1.3 + (((tickAnim - 34) / 16) * (0-(-1.3)));
            yy = 0 + (((tickAnim - 34) / 16) * (0-(0)));
            zz = 0 + (((tickAnim - 34) / 16) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(xx), neck2.rotateAngleY + (float) Math.toRadians(yy), neck2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (11.25-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 23) {
            xx = 11.25 + (((tickAnim - 13) / 10) * (11.25-(11.25)));
            yy = 0 + (((tickAnim - 13) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 10) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 33) {
            xx = 11.25 + (((tickAnim - 23) / 10) * (11.25-(11.25)));
            yy = 0 + (((tickAnim - 23) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 10) * (0-(0)));
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
        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(xx), neck3.rotateAngleY + (float) Math.toRadians(yy), neck3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (14.5-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 23) {
            xx = 14.5 + (((tickAnim - 13) / 10) * (14.5-(14.5)));
            yy = 0 + (((tickAnim - 13) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 10) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 33) {
            xx = 14.5 + (((tickAnim - 23) / 10) * (14.5-(14.5)));
            yy = 0 + (((tickAnim - 23) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 10) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 50) {
            xx = 14.5 + (((tickAnim - 33) / 17) * (0-(14.5)));
            yy = 0 + (((tickAnim - 33) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 17) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (-29.25-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 23) {
            xx = -29.25 + (((tickAnim - 13) / 10) * (-29.25-(-29.25)));
            yy = 0 + (((tickAnim - 13) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 10) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 33) {
            xx = -29.25 + (((tickAnim - 23) / 10) * (-29.25-(-29.25)));
            yy = 0 + (((tickAnim - 23) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 10) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 50) {
            xx = -29.25 + (((tickAnim - 33) / 17) * (0-(-29.25)));
            yy = 0 + (((tickAnim - 33) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 17) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg, leftLeg.rotateAngleX + (float) Math.toRadians(xx), leftLeg.rotateAngleY + (float) Math.toRadians(yy), leftLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (35.5-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 23) {
            xx = 35.5 + (((tickAnim - 13) / 10) * (35.5-(35.5)));
            yy = 0 + (((tickAnim - 13) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 10) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 33) {
            xx = 35.5 + (((tickAnim - 23) / 10) * (35.5-(35.5)));
            yy = 0 + (((tickAnim - 23) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 10) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 50) {
            xx = 35.5 + (((tickAnim - 33) / 17) * (0-(35.5)));
            yy = 0 + (((tickAnim - 33) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 17) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg2, leftLeg2.rotateAngleX + (float) Math.toRadians(xx), leftLeg2.rotateAngleY + (float) Math.toRadians(yy), leftLeg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (-25.25-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = -25.25 + (((tickAnim - 8) / 5) * (-23-(-25.25)));
            yy = 0 + (((tickAnim - 8) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 5) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 23) {
            xx = -23 + (((tickAnim - 13) / 10) * (-23-(-23)));
            yy = 0 + (((tickAnim - 13) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 10) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 33) {
            xx = -23 + (((tickAnim - 23) / 10) * (-23-(-23)));
            yy = 0 + (((tickAnim - 23) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 10) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 50) {
            xx = -23 + (((tickAnim - 33) / 17) * (0-(-23)));
            yy = 0 + (((tickAnim - 33) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 17) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg3, leftLeg3.rotateAngleX + (float) Math.toRadians(xx), leftLeg3.rotateAngleY + (float) Math.toRadians(yy), leftLeg3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (35.87-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = 35.87 + (((tickAnim - 8) / 5) * (40.25-(35.87)));
            yy = 0 + (((tickAnim - 8) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 5) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 23) {
            xx = 40.25 + (((tickAnim - 13) / 10) * (40.25-(40.25)));
            yy = 0 + (((tickAnim - 13) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 10) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 33) {
            xx = 40.25 + (((tickAnim - 23) / 10) * (40.25-(40.25)));
            yy = 0 + (((tickAnim - 23) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 10) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 50) {
            xx = 40.25 + (((tickAnim - 33) / 17) * (0-(40.25)));
            yy = 0 + (((tickAnim - 33) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 17) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg4, leftLeg4.rotateAngleX + (float) Math.toRadians(xx), leftLeg4.rotateAngleY + (float) Math.toRadians(yy), leftLeg4.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 0) / 33) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 33) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 33) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 42) {
            xx = 0 + (((tickAnim - 33) / 9) * (0-(0)));
            yy = 0 + (((tickAnim - 33) / 9) * (0.775-(0)));
            zz = 0 + (((tickAnim - 33) / 9) * (0-(0)));
        }
        else if (tickAnim >= 42 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 42) / 8) * (0-(0)));
            yy = 0.775 + (((tickAnim - 42) / 8) * (0-(0.775)));
            zz = 0 + (((tickAnim - 42) / 8) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftLeg4.rotationPointX = this.leftLeg4.rotationPointX + (float)(xx);
        this.leftLeg4.rotationPointY = this.leftLeg4.rotationPointY - (float)(yy);
        this.leftLeg4.rotationPointZ = this.leftLeg4.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (7-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 23) {
            xx = 7 + (((tickAnim - 13) / 10) * (7-(7)));
            yy = 0 + (((tickAnim - 13) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 10) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 33) {
            xx = 7 + (((tickAnim - 23) / 10) * (7-(7)));
            yy = 0 + (((tickAnim - 23) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 10) * (0-(0)));
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
        this.setRotateAngle(tail1, tail1.rotateAngleX + (float) Math.toRadians(xx), tail1.rotateAngleY + (float) Math.toRadians(yy), tail1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (13.25-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 23) {
            xx = 13.25 + (((tickAnim - 13) / 10) * (13.25-(13.25)));
            yy = 0 + (((tickAnim - 13) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 10) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 33) {
            xx = 13.25 + (((tickAnim - 23) / 10) * (13.25-(13.25)));
            yy = 0 + (((tickAnim - 23) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 10) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 50) {
            xx = 13.25 + (((tickAnim - 33) / 17) * (0-(13.25)));
            yy = 0 + (((tickAnim - 33) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 17) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(xx), tail2.rotateAngleY + (float) Math.toRadians(yy), tail2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (18.75-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 23) {
            xx = 18.75 + (((tickAnim - 13) / 10) * (18.75-(18.75)));
            yy = 0 + (((tickAnim - 13) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 10) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 33) {
            xx = 18.75 + (((tickAnim - 23) / 10) * (18.75-(18.75)));
            yy = 0 + (((tickAnim - 23) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 10) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 50) {
            xx = 18.75 + (((tickAnim - 33) / 17) * (0-(18.75)));
            yy = 0 + (((tickAnim - 33) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 17) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(xx), tail3.rotateAngleY + (float) Math.toRadians(yy), tail3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (14-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 23) {
            xx = 14 + (((tickAnim - 13) / 10) * (14-(14)));
            yy = 0 + (((tickAnim - 13) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 10) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 33) {
            xx = 14 + (((tickAnim - 23) / 10) * (14-(14)));
            yy = 0 + (((tickAnim - 23) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 10) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 50) {
            xx = 14 + (((tickAnim - 33) / 17) * (0-(14)));
            yy = 0 + (((tickAnim - 33) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 17) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(xx), tail4.rotateAngleY + (float) Math.toRadians(yy), tail4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (21.67842-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (-4.36348-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (1.87867-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
            xx = 21.67842 + (((tickAnim - 13) / 5) * (-52.03516-(21.67842)));
            yy = -4.36348 + (((tickAnim - 13) / 5) * (-1.84083-(-4.36348)));
            zz = 1.87867 + (((tickAnim - 13) / 5) * (24.01986-(1.87867)));
        }
        else if (tickAnim >= 18 && tickAnim < 23) {
            xx = -52.03516 + (((tickAnim - 18) / 5) * (21.72149-(-52.03516)));
            yy = -1.84083 + (((tickAnim - 18) / 5) * (-2.75618-(-1.84083)));
            zz = 24.01986 + (((tickAnim - 18) / 5) * (1.18515-(24.01986)));
        }
        else if (tickAnim >= 23 && tickAnim < 28) {
            xx = 21.72149 + (((tickAnim - 23) / 5) * (-52.03516-(21.72149)));
            yy = -2.75618 + (((tickAnim - 23) / 5) * (-1.84083-(-2.75618)));
            zz = 1.18515 + (((tickAnim - 23) / 5) * (24.01986-(1.18515)));
        }
        else if (tickAnim >= 28 && tickAnim < 33) {
            xx = -52.03516 + (((tickAnim - 28) / 5) * (21.50575-(-52.03516)));
            yy = -1.84083 + (((tickAnim - 28) / 5) * (-8.03452-(-1.84083)));
            zz = 24.01986 + (((tickAnim - 28) / 5) * (3.47684-(24.01986)));
        }
        else if (tickAnim >= 33 && tickAnim < 50) {
            xx = 21.50575 + (((tickAnim - 33) / 17) * (0-(21.50575)));
            yy = -8.03452 + (((tickAnim - 33) / 17) * (0-(-8.03452)));
            zz = 3.47684 + (((tickAnim - 33) / 17) * (0-(3.47684)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm, rightArm.rotateAngleX + (float) Math.toRadians(xx), rightArm.rotateAngleY + (float) Math.toRadians(yy), rightArm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (-29-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
            xx = -29 + (((tickAnim - 13) / 5) * (-9.75-(-29)));
            yy = 0 + (((tickAnim - 13) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 5) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 23) {
            xx = -9.75 + (((tickAnim - 18) / 5) * (5.64366-(-9.75)));
            yy = 0 + (((tickAnim - 18) / 5) * (-8.45911-(0)));
            zz = 0 + (((tickAnim - 18) / 5) * (8.185-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 28) {
            xx = 5.64366 + (((tickAnim - 23) / 5) * (-9.75-(5.64366)));
            yy = -8.45911 + (((tickAnim - 23) / 5) * (0-(-8.45911)));
            zz = 8.185 + (((tickAnim - 23) / 5) * (0-(8.185)));
        }
        else if (tickAnim >= 28 && tickAnim < 33) {
            xx = -9.75 + (((tickAnim - 28) / 5) * (12-(-9.75)));
            yy = 0 + (((tickAnim - 28) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 5) * (0-(0)));
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
        this.setRotateAngle(rightArm2, rightArm2.rotateAngleX + (float) Math.toRadians(xx), rightArm2.rotateAngleY + (float) Math.toRadians(yy), rightArm2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 13) / 5) * (-15.33353-(0)));
            yy = 0 + (((tickAnim - 13) / 5) * (-33.53712-(0)));
            zz = 0 + (((tickAnim - 13) / 5) * (66.39551-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 21) {
            xx = -15.33353 + (((tickAnim - 18) / 3) * (0.78719-(-15.33353)));
            yy = -33.53712 + (((tickAnim - 18) / 3) * (-18.37595-(-33.53712)));
            zz = 66.39551 + (((tickAnim - 18) / 3) * (5.6888-(66.39551)));
        }
        else if (tickAnim >= 21 && tickAnim < 23) {
            xx = 0.78719 + (((tickAnim - 21) / 2) * (0-(0.78719)));
            yy = -18.37595 + (((tickAnim - 21) / 2) * (0-(-18.37595)));
            zz = 5.6888 + (((tickAnim - 21) / 2) * (0-(5.6888)));
        }
        else if (tickAnim >= 23 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 23) / 5) * (-15.33353-(0)));
            yy = 0 + (((tickAnim - 23) / 5) * (-33.53712-(0)));
            zz = 0 + (((tickAnim - 23) / 5) * (66.39551-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 31) {
            xx = -15.33353 + (((tickAnim - 28) / 3) * (0.78719-(-15.33353)));
            yy = -33.53712 + (((tickAnim - 28) / 3) * (-18.37595-(-33.53712)));
            zz = 66.39551 + (((tickAnim - 28) / 3) * (5.6888-(66.39551)));
        }
        else if (tickAnim >= 31 && tickAnim < 33) {
            xx = 0.78719 + (((tickAnim - 31) / 2) * (0-(0.78719)));
            yy = -18.37595 + (((tickAnim - 31) / 2) * (0-(-18.37595)));
            zz = 5.6888 + (((tickAnim - 31) / 2) * (0-(5.6888)));
        }
        else if (tickAnim >= 33 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 33) / 17) * (0-(0)));
            yy = 0 + (((tickAnim - 33) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 17) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm3, rightArm3.rotateAngleX + (float) Math.toRadians(xx), rightArm3.rotateAngleY + (float) Math.toRadians(yy), rightArm3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 13) / 5) * (0.175-(0)));
            yy = 0 + (((tickAnim - 13) / 5) * (0.375-(0)));
            zz = 0 + (((tickAnim - 13) / 5) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 23) {
            xx = 0.175 + (((tickAnim - 18) / 5) * (0-(0.175)));
            yy = 0.375 + (((tickAnim - 18) / 5) * (0-(0.375)));
            zz = 0 + (((tickAnim - 18) / 5) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 23) / 5) * (0.175-(0)));
            yy = 0 + (((tickAnim - 23) / 5) * (0.375-(0)));
            zz = 0 + (((tickAnim - 23) / 5) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 33) {
            xx = 0.175 + (((tickAnim - 28) / 5) * (0-(0.175)));
            yy = 0.375 + (((tickAnim - 28) / 5) * (0-(0.375)));
            zz = 0 + (((tickAnim - 28) / 5) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 33) / 17) * (0-(0)));
            yy = 0 + (((tickAnim - 33) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 17) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightArm3.rotationPointX = this.rightArm3.rotationPointX + (float)(xx);
        this.rightArm3.rotationPointY = this.rightArm3.rotationPointY - (float)(yy);
        this.rightArm3.rotationPointZ = this.rightArm3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (-29.25-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 23) {
            xx = -29.25 + (((tickAnim - 13) / 10) * (-29.25-(-29.25)));
            yy = 0 + (((tickAnim - 13) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 10) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 33) {
            xx = -29.25 + (((tickAnim - 23) / 10) * (-29.25-(-29.25)));
            yy = 0 + (((tickAnim - 23) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 10) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 50) {
            xx = -29.25 + (((tickAnim - 33) / 17) * (0-(-29.25)));
            yy = 0 + (((tickAnim - 33) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 17) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg, rightLeg.rotateAngleX + (float) Math.toRadians(xx), rightLeg.rotateAngleY + (float) Math.toRadians(yy), rightLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (35.5-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 23) {
            xx = 35.5 + (((tickAnim - 13) / 10) * (35.5-(35.5)));
            yy = 0 + (((tickAnim - 13) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 10) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 33) {
            xx = 35.5 + (((tickAnim - 23) / 10) * (35.5-(35.5)));
            yy = 0 + (((tickAnim - 23) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 10) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 50) {
            xx = 35.5 + (((tickAnim - 33) / 17) * (0-(35.5)));
            yy = 0 + (((tickAnim - 33) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 17) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg2, rightLeg2.rotateAngleX + (float) Math.toRadians(xx), rightLeg2.rotateAngleY + (float) Math.toRadians(yy), rightLeg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (-25.25-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = -25.25 + (((tickAnim - 8) / 5) * (-23-(-25.25)));
            yy = 0 + (((tickAnim - 8) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 5) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 23) {
            xx = -23 + (((tickAnim - 13) / 10) * (-23-(-23)));
            yy = 0 + (((tickAnim - 13) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 10) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 33) {
            xx = -23 + (((tickAnim - 23) / 10) * (-23-(-23)));
            yy = 0 + (((tickAnim - 23) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 10) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 50) {
            xx = -23 + (((tickAnim - 33) / 17) * (0-(-23)));
            yy = 0 + (((tickAnim - 33) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 17) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg3, rightLeg3.rotateAngleX + (float) Math.toRadians(xx), rightLeg3.rotateAngleY + (float) Math.toRadians(yy), rightLeg3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (35.87-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = 35.87 + (((tickAnim - 8) / 5) * (40.25-(35.87)));
            yy = 0 + (((tickAnim - 8) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 5) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 23) {
            xx = 40.25 + (((tickAnim - 13) / 10) * (40.25-(40.25)));
            yy = 0 + (((tickAnim - 13) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 10) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 33) {
            xx = 40.25 + (((tickAnim - 23) / 10) * (40.25-(40.25)));
            yy = 0 + (((tickAnim - 23) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 10) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 50) {
            xx = 40.25 + (((tickAnim - 33) / 17) * (0-(40.25)));
            yy = 0 + (((tickAnim - 33) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 17) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg4, rightLeg4.rotateAngleX + (float) Math.toRadians(xx), rightLeg4.rotateAngleY + (float) Math.toRadians(yy), rightLeg4.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 0) / 33) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 33) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 33) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 42) {
            xx = 0 + (((tickAnim - 33) / 9) * (0-(0)));
            yy = 0 + (((tickAnim - 33) / 9) * (0.775-(0)));
            zz = 0 + (((tickAnim - 33) / 9) * (0-(0)));
        }
        else if (tickAnim >= 42 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 42) / 8) * (0-(0)));
            yy = 0.775 + (((tickAnim - 42) / 8) * (0-(0.775)));
            zz = 0 + (((tickAnim - 42) / 8) * (0-(0)));
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
    public void animAlert(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraScutellosaurus entity = (EntityPrehistoricFloraScutellosaurus) entitylivingbaseIn;
        int animCycle = 61;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (5.25497-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (2.48951-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0.2289-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 47) {
            xx = 5.25497 + (((tickAnim - 13) / 34) * (5.25497-(5.25497)));
            yy = 2.48951 + (((tickAnim - 13) / 34) * (2.48951-(2.48951)));
            zz = 0.2289 + (((tickAnim - 13) / 34) * (0.2289-(0.2289)));
        }
        else if (tickAnim >= 47 && tickAnim < 62) {
            xx = 5.25497 + (((tickAnim - 47) / 15) * (0-(5.25497)));
            yy = 2.48951 + (((tickAnim - 47) / 15) * (0-(2.48951)));
            zz = 0.2289 + (((tickAnim - 47) / 15) * (0-(0.2289)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(hip, hip.rotateAngleX + (float) Math.toRadians(xx), hip.rotateAngleY + (float) Math.toRadians(yy), hip.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (-2.475-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 17) {
            xx = 0 + (((tickAnim - 13) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 13) / 4) * (0-(0)));
            zz = -2.475 + (((tickAnim - 13) / 4) * (-2.37-(-2.475)));
        }
        else if (tickAnim >= 17 && tickAnim < 47) {
            xx = 0 + (((tickAnim - 17) / 30) * (0-(0)));
            yy = 0 + (((tickAnim - 17) / 30) * (0-(0)));
            zz = -2.37 + (((tickAnim - 17) / 30) * (-2.37-(-2.37)));
        }
        else if (tickAnim >= 47 && tickAnim < 62) {
            xx = 0 + (((tickAnim - 47) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 47) / 15) * (0-(0)));
            zz = -2.37 + (((tickAnim - 47) / 15) * (0-(-2.37)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.hip.rotationPointX = this.hip.rotationPointX + (float)(xx);
        this.hip.rotationPointY = this.hip.rotationPointY - (float)(yy);
        this.hip.rotationPointZ = this.hip.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (5.75-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 47) {
            xx = 5.75 + (((tickAnim - 13) / 34) * (5.75-(5.75)));
            yy = 0 + (((tickAnim - 13) / 34) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 34) * (0-(0)));
        }
        else if (tickAnim >= 47 && tickAnim < 62) {
            xx = 5.75 + (((tickAnim - 47) / 15) * (0-(5.75)));
            yy = 0 + (((tickAnim - 47) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 47) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(xx), body.rotateAngleY + (float) Math.toRadians(yy), body.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (2.75024-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (-0.74914-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (-0.03599-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 47) {
            xx = 2.75024 + (((tickAnim - 13) / 34) * (2.75024-(2.75024)));
            yy = -0.74914 + (((tickAnim - 13) / 34) * (-0.74914-(-0.74914)));
            zz = -0.03599 + (((tickAnim - 13) / 34) * (-0.03599-(-0.03599)));
        }
        else if (tickAnim >= 47 && tickAnim < 62) {
            xx = 2.75024 + (((tickAnim - 47) / 15) * (0-(2.75024)));
            yy = -0.74914 + (((tickAnim - 47) / 15) * (0-(-0.74914)));
            zz = -0.03599 + (((tickAnim - 47) / 15) * (0-(-0.03599)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(xx), chest.rotateAngleY + (float) Math.toRadians(yy), chest.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (10.75-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 17) {
            xx = 10.75 + (((tickAnim - 13) / 4) * (9.25-(10.75)));
            yy = 0 + (((tickAnim - 13) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 4) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 47) {
            xx = 9.25 + (((tickAnim - 17) / 30) * (9.25-(9.25)));
            yy = 0 + (((tickAnim - 17) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 17) / 30) * (0-(0)));
        }
        else if (tickAnim >= 47 && tickAnim < 62) {
            xx = 9.25 + (((tickAnim - 47) / 15) * (0-(9.25)));
            yy = 0 + (((tickAnim - 47) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 47) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm, leftArm.rotateAngleX + (float) Math.toRadians(xx), leftArm.rotateAngleY + (float) Math.toRadians(yy), leftArm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (-19.15056-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (18.55435-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (-7.28111-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 47) {
            xx = -19.15056 + (((tickAnim - 13) / 34) * (-19.15056-(-19.15056)));
            yy = 18.55435 + (((tickAnim - 13) / 34) * (18.55435-(18.55435)));
            zz = -7.28111 + (((tickAnim - 13) / 34) * (-7.28111-(-7.28111)));
        }
        else if (tickAnim >= 47 && tickAnim < 62) {
            xx = -19.15056 + (((tickAnim - 47) / 15) * (0-(-19.15056)));
            yy = 18.55435 + (((tickAnim - 47) / 15) * (0-(18.55435)));
            zz = -7.28111 + (((tickAnim - 47) / 15) * (0-(-7.28111)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm2, leftArm2.rotateAngleX + (float) Math.toRadians(xx), leftArm2.rotateAngleY + (float) Math.toRadians(yy), leftArm2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (-42.1556-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-80))*50-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (-3.24393-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0.19862-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 17) {
            xx = -42.1556-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-80))*50 + (((tickAnim - 10) / 7) * (-16.60766-(-42.1556-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-80))*50)));
            yy = -3.24393 + (((tickAnim - 10) / 7) * (-6.29837-(-3.24393)));
            zz = 0.19862 + (((tickAnim - 10) / 7) * (0.33031-(0.19862)));
        }
        else if (tickAnim >= 17 && tickAnim < 23) {
            xx = -16.60766 + (((tickAnim - 17) / 6) * (-16.60766-(-16.60766)));
            yy = -6.29837 + (((tickAnim - 17) / 6) * (-6.29837-(-6.29837)));
            zz = 0.33031 + (((tickAnim - 17) / 6) * (0.33031-(0.33031)));
        }
        else if (tickAnim >= 23 && tickAnim < 32) {
            xx = -16.60766 + (((tickAnim - 23) / 9) * (-16.62059-(-16.60766)));
            yy = -6.29837 + (((tickAnim - 23) / 9) * (-5.59883-(-6.29837)));
            zz = 0.33031 + (((tickAnim - 23) / 9) * (0.43399-(0.33031)));
        }
        else if (tickAnim >= 32 && tickAnim < 38) {
            xx = -16.62059 + (((tickAnim - 32) / 6) * (-16.62059-(-16.62059)));
            yy = -5.59883 + (((tickAnim - 32) / 6) * (-5.59883-(-5.59883)));
            zz = 0.43399 + (((tickAnim - 32) / 6) * (0.43399-(0.43399)));
        }
        else if (tickAnim >= 38 && tickAnim < 47) {
            xx = -16.62059 + (((tickAnim - 38) / 9) * (-18.62059-(-16.62059)));
            yy = -5.59883 + (((tickAnim - 38) / 9) * (-5.59883-(-5.59883)));
            zz = 0.43399 + (((tickAnim - 38) / 9) * (0.43399-(0.43399)));
        }
        else if (tickAnim >= 47 && tickAnim < 62) {
            xx = -18.62059 + (((tickAnim - 47) / 15) * (0-(-18.62059)));
            yy = -5.59883 + (((tickAnim - 47) / 15) * (0-(-5.59883)));
            zz = 0.43399 + (((tickAnim - 47) / 15) * (0-(0.43399)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck1, neck1.rotateAngleX + (float) Math.toRadians(xx), neck1.rotateAngleY + (float) Math.toRadians(yy), neck1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 0) / 11) * (-18.125-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-50))*50-(0)));
            yy = 0 + (((tickAnim - 0) / 11) * (-8-(0)));
            zz = 0 + (((tickAnim - 0) / 11) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 17) {
            xx = -18.125-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-50))*50 + (((tickAnim - 11) / 6) * (0-(-18.125-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-50))*50)));
            yy = -8 + (((tickAnim - 11) / 6) * (0-(-8)));
            zz = 0 + (((tickAnim - 11) / 6) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 17) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 17) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 17) / 6) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 23) / 0) * (0-(0)));
            yy = 0 + (((tickAnim - 23) / 0) * (-13.25-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-30))*-30-(0)));
            zz = 0 + (((tickAnim - 23) / 0) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 32) {
            xx = 0 + (((tickAnim - 23) / 9) * (-0.08448-(0)));
            yy = -13.25-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-30))*-30 + (((tickAnim - 23) / 9) * (6.58928-(-13.25-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-30))*-30)));
            zz = 0 + (((tickAnim - 23) / 9) * (1.78256-(0)));
        }
        else if (tickAnim >= 32 && tickAnim < 38) {
            xx = -0.08448 + (((tickAnim - 32) / 6) * (-0.08448-(-0.08448)));
            yy = 6.58928 + (((tickAnim - 32) / 6) * (6.58928-(6.58928)));
            zz = 1.78256 + (((tickAnim - 32) / 6) * (1.78256-(1.78256)));
        }
        else if (tickAnim >= 38 && tickAnim < 47) {
            xx = -0.08448 + (((tickAnim - 38) / 9) * (-4.83448-(-0.08448)));
            yy = 6.58928 + (((tickAnim - 38) / 9) * (6.58928-(6.58928)));
            zz = 1.78256 + (((tickAnim - 38) / 9) * (1.78256-(1.78256)));
        }
        else if (tickAnim >= 47 && tickAnim < 62) {
            xx = -4.83448 + (((tickAnim - 47) / 15) * (0-(-4.83448)));
            yy = 6.58928 + (((tickAnim - 47) / 15) * (0-(6.58928)));
            zz = 1.78256 + (((tickAnim - 47) / 15) * (0-(1.78256)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(xx), neck2.rotateAngleY + (float) Math.toRadians(yy), neck2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 0) / 11) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 11) * (0.175-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 47) {
            xx = 0 + (((tickAnim - 11) / 36) * (0-(0)));
            yy = 0 + (((tickAnim - 11) / 36) * (0-(0)));
            zz = 0.175 + (((tickAnim - 11) / 36) * (0.175-(0.175)));
        }
        else if (tickAnim >= 47 && tickAnim < 62) {
            xx = 0 + (((tickAnim - 47) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 47) / 15) * (0-(0)));
            zz = 0.175 + (((tickAnim - 47) / 15) * (0-(0.175)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.neck2.rotationPointX = this.neck2.rotationPointX + (float)(xx);
        this.neck2.rotationPointY = this.neck2.rotationPointY - (float)(yy);
        this.neck2.rotationPointZ = this.neck2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 0) / 11) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 11) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 11) / 2) * (-2.11-(0)));
            yy = 0 + (((tickAnim - 11) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 2) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 17) {
            xx = -2.11 + (((tickAnim - 13) / 4) * (0-(-2.11)));
            yy = 0 + (((tickAnim - 13) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 4) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 17) / 1) * (1-(0)));
            yy = 0 + (((tickAnim - 17) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 17) / 1) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = 1 + (((tickAnim - 18) / 2) * (0-(1)));
            yy = 0 + (((tickAnim - 18) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 2) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 22) {
            xx = 0 + (((tickAnim - 20) / 2) * (1-(0)));
            yy = 0 + (((tickAnim - 20) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 2) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 23) {
            xx = 1 + (((tickAnim - 22) / 1) * (0-(1)));
            yy = 0 + (((tickAnim - 22) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 22) / 1) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 23) / 5) * (0.31358-(0)));
            yy = 0 + (((tickAnim - 23) / 5) * (-15.4298-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-30))*-30-(0)));
            zz = 0 + (((tickAnim - 23) / 5) * (4.83978-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 32) {
            xx = 0.31358 + (((tickAnim - 28) / 4) * (0-(0.31358)));
            yy = -15.4298-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-30))*-30 + (((tickAnim - 28) / 4) * (1.73634-(-15.4298-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-30))*-30)));
            zz = 4.83978 + (((tickAnim - 28) / 4) * (1.41017-(4.83978)));
        }
        else if (tickAnim >= 32 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 32) / 1) * (1-(0)));
            yy = 1.73634 + (((tickAnim - 32) / 1) * (1.73634-(1.73634)));
            zz = 1.41017 + (((tickAnim - 32) / 1) * (1.41017-(1.41017)));
        }
        else if (tickAnim >= 33 && tickAnim < 35) {
            xx = 1 + (((tickAnim - 33) / 2) * (0-(1)));
            yy = 1.73634 + (((tickAnim - 33) / 2) * (1.73634-(1.73634)));
            zz = 1.41017 + (((tickAnim - 33) / 2) * (1.41017-(1.41017)));
        }
        else if (tickAnim >= 35 && tickAnim < 37) {
            xx = 0 + (((tickAnim - 35) / 2) * (1-(0)));
            yy = 1.73634 + (((tickAnim - 35) / 2) * (1.73634-(1.73634)));
            zz = 1.41017 + (((tickAnim - 35) / 2) * (1.41017-(1.41017)));
        }
        else if (tickAnim >= 37 && tickAnim < 38) {
            xx = 1 + (((tickAnim - 37) / 1) * (0-(1)));
            yy = 1.73634 + (((tickAnim - 37) / 1) * (1.73634-(1.73634)));
            zz = 1.41017 + (((tickAnim - 37) / 1) * (1.41017-(1.41017)));
        }
        else if (tickAnim >= 38 && tickAnim < 62) {
            xx = 0 + (((tickAnim - 38) / 24) * (0-(0)));
            yy = 1.73634 + (((tickAnim - 38) / 24) * (0-(1.73634)));
            zz = 1.41017 + (((tickAnim - 38) / 24) * (0-(1.41017)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(xx), neck3.rotateAngleY + (float) Math.toRadians(yy), neck3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 0) / 11) * (-24.25-(0)));
            yy = 0 + (((tickAnim - 0) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 11) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 17) {
            xx = -24.25 + (((tickAnim - 11) / 6) * (-14.5-(-24.25)));
            yy = 0 + (((tickAnim - 11) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 6) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 18) {
            xx = -14.5 + (((tickAnim - 17) / 1) * (-15.25-(-14.5)));
            yy = 0 + (((tickAnim - 17) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 17) / 1) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = -15.25 + (((tickAnim - 18) / 2) * (-14.5-(-15.25)));
            yy = 0 + (((tickAnim - 18) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 2) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 22) {
            xx = -14.5 + (((tickAnim - 20) / 2) * (-15.25-(-14.5)));
            yy = 0 + (((tickAnim - 20) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 2) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 23) {
            xx = -15.25 + (((tickAnim - 22) / 1) * (-14.5-(-15.25)));
            yy = 0 + (((tickAnim - 22) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 22) / 1) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 28) {
            xx = -14.5 + (((tickAnim - 23) / 5) * (-14.48059-(-14.5)));
            yy = 0 + (((tickAnim - 23) / 5) * (-9.1347-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-80))*50-(0)));
            zz = 0 + (((tickAnim - 23) / 5) * (0.85039-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 32) {
            xx = -14.48059 + (((tickAnim - 28) / 4) * (-14.5-(-14.48059)));
            yy = -9.1347-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-80))*50 + (((tickAnim - 28) / 4) * (0-(-9.1347-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-80))*50)));
            zz = 0.85039 + (((tickAnim - 28) / 4) * (0-(0.85039)));
        }
        else if (tickAnim >= 32 && tickAnim < 33) {
            xx = -14.5 + (((tickAnim - 32) / 1) * (-18.5-(-14.5)));
            yy = 0 + (((tickAnim - 32) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 32) / 1) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 35) {
            xx = -18.5 + (((tickAnim - 33) / 2) * (-14.5-(-18.5)));
            yy = 0 + (((tickAnim - 33) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 2) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 37) {
            xx = -14.5 + (((tickAnim - 35) / 2) * (-18.5-(-14.5)));
            yy = 0 + (((tickAnim - 35) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 2) * (0-(0)));
        }
        else if (tickAnim >= 37 && tickAnim < 38) {
            xx = -18.5 + (((tickAnim - 37) / 1) * (-14.5-(-18.5)));
            yy = 0 + (((tickAnim - 37) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 37) / 1) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 47) {
            xx = -14.5 + (((tickAnim - 38) / 9) * (-4.75-(-14.5)));
            yy = 0 + (((tickAnim - 38) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 38) / 9) * (0-(0)));
        }
        else if (tickAnim >= 47 && tickAnim < 62) {
            xx = -4.75 + (((tickAnim - 47) / 15) * (0-(-4.75)));
            yy = 0 + (((tickAnim - 47) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 47) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 37 && tickAnim < 42) {
            xx = 0 + (((tickAnim - 37) / 5) * (8.25-(0)));
            yy = 0 + (((tickAnim - 37) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 37) / 5) * (0-(0)));
        }
        else if (tickAnim >= 42 && tickAnim < 47) {
            xx = 8.25 + (((tickAnim - 42) / 5) * (0-(8.25)));
            yy = 0 + (((tickAnim - 42) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 42) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(xx), jaw.rotateAngleY + (float) Math.toRadians(yy), jaw.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 0) / 6) * (-30.13-(0)));
            yy = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 13) {
            xx = -30.13 + (((tickAnim - 6) / 7) * (-29.75-(-30.13)));
            yy = 0 + (((tickAnim - 6) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 7) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 17) {
            xx = -29.75 + (((tickAnim - 13) / 4) * (-30.25-(-29.75)));
            yy = 0 + (((tickAnim - 13) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 4) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 47) {
            xx = -30.25 + (((tickAnim - 17) / 30) * (-30.25-(-30.25)));
            yy = 0 + (((tickAnim - 17) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 17) / 30) * (0-(0)));
        }
        else if (tickAnim >= 47 && tickAnim < 62) {
            xx = -30.25 + (((tickAnim - 47) / 15) * (0-(-30.25)));
            yy = 0 + (((tickAnim - 47) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 47) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg, leftLeg.rotateAngleX + (float) Math.toRadians(xx), leftLeg.rotateAngleY + (float) Math.toRadians(yy), leftLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 0) / 6) * (31.7-(0)));
            yy = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 13) {
            xx = 31.7 + (((tickAnim - 6) / 7) * (-2.25-(31.7)));
            yy = 0 + (((tickAnim - 6) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 7) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 47) {
            xx = -2.25 + (((tickAnim - 13) / 34) * (-2.25-(-2.25)));
            yy = 0 + (((tickAnim - 13) / 34) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 34) * (0-(0)));
        }
        else if (tickAnim >= 47 && tickAnim < 53) {
            xx = -2.25 + (((tickAnim - 47) / 6) * (35.75-(-2.25)));
            yy = 0 + (((tickAnim - 47) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 47) / 6) * (0-(0)));
        }
        else if (tickAnim >= 53 && tickAnim < 62) {
            xx = 35.75 + (((tickAnim - 53) / 9) * (0-(35.75)));
            yy = 0 + (((tickAnim - 53) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 53) / 9) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg2, leftLeg2.rotateAngleX + (float) Math.toRadians(xx), leftLeg2.rotateAngleY + (float) Math.toRadians(yy), leftLeg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 0) / 6) * (-19.28-(0)));
            yy = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 9) {
            xx = -19.28 + (((tickAnim - 6) / 3) * (-32.89-(-19.28)));
            yy = 0 + (((tickAnim - 6) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 3) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 13) {
            xx = -32.89 + (((tickAnim - 9) / 4) * (-6.5-(-32.89)));
            yy = 0 + (((tickAnim - 9) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 4) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 47) {
            xx = -6.5 + (((tickAnim - 13) / 34) * (-6.5-(-6.5)));
            yy = 0 + (((tickAnim - 13) / 34) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 34) * (0-(0)));
        }
        else if (tickAnim >= 47 && tickAnim < 53) {
            xx = -6.5 + (((tickAnim - 47) / 6) * (-26.11-(-6.5)));
            yy = 0 + (((tickAnim - 47) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 47) / 6) * (0-(0)));
        }
        else if (tickAnim >= 53 && tickAnim < 62) {
            xx = -26.11 + (((tickAnim - 53) / 9) * (0-(-26.11)));
            yy = 0 + (((tickAnim - 53) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 53) / 9) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg3, leftLeg3.rotateAngleX + (float) Math.toRadians(xx), leftLeg3.rotateAngleY + (float) Math.toRadians(yy), leftLeg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 0) / 9) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 9) * (-0.35-(0)));
            zz = 0 + (((tickAnim - 0) / 9) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 9) / 4) * (0-(0)));
            yy = -0.35 + (((tickAnim - 9) / 4) * (0-(-0.35)));
            zz = 0 + (((tickAnim - 9) / 4) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 47) {
            xx = 0 + (((tickAnim - 13) / 34) * (0-(0)));
            yy = 0 + (((tickAnim - 13) / 34) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 34) * (0-(0)));
        }
        else if (tickAnim >= 47 && tickAnim < 53) {
            xx = 0 + (((tickAnim - 47) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 47) / 6) * (-0.3-(0)));
            zz = 0 + (((tickAnim - 47) / 6) * (0-(0)));
        }
        else if (tickAnim >= 53 && tickAnim < 62) {
            xx = 0 + (((tickAnim - 53) / 9) * (0-(0)));
            yy = -0.3 + (((tickAnim - 53) / 9) * (0-(-0.3)));
            zz = 0 + (((tickAnim - 53) / 9) * (0-(0)));
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
            xx = 0 + (((tickAnim - 0) / 3) * (94.5-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 6) {
            xx = 94.5 + (((tickAnim - 3) / 3) * (94.5-(94.5)));
            yy = 0 + (((tickAnim - 3) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 3) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 13) {
            xx = 94.5 + (((tickAnim - 6) / 7) * (33.75-(94.5)));
            yy = 0 + (((tickAnim - 6) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 7) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 47) {
            xx = 33.75 + (((tickAnim - 13) / 34) * (33.75-(33.75)));
            yy = 0 + (((tickAnim - 13) / 34) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 34) * (0-(0)));
        }
        else if (tickAnim >= 47 && tickAnim < 53) {
            xx = 33.75 + (((tickAnim - 47) / 6) * (89-(33.75)));
            yy = 0 + (((tickAnim - 47) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 47) / 6) * (0-(0)));
        }
        else if (tickAnim >= 53 && tickAnim < 62) {
            xx = 89 + (((tickAnim - 53) / 9) * (0-(89)));
            yy = 0 + (((tickAnim - 53) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 53) / 9) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg4, leftLeg4.rotateAngleX + (float) Math.toRadians(xx), leftLeg4.rotateAngleY + (float) Math.toRadians(yy), leftLeg4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (-7-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 17) {
            xx = -7 + (((tickAnim - 13) / 4) * (-6.75-(-7)));
            yy = 0 + (((tickAnim - 13) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 4) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 47) {
            xx = -6.75 + (((tickAnim - 17) / 30) * (-6.75-(-6.75)));
            yy = 0 + (((tickAnim - 17) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 17) / 30) * (0-(0)));
        }
        else if (tickAnim >= 47 && tickAnim < 62) {
            xx = -6.75 + (((tickAnim - 47) / 15) * (0-(-6.75)));
            yy = 0 + (((tickAnim - 47) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 47) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail1, tail1.rotateAngleX + (float) Math.toRadians(xx), tail1.rotateAngleY + (float) Math.toRadians(yy), tail1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 17) {
            xx = 0 + (((tickAnim - 13) / 4) * (-0.75-(0)));
            yy = 0 + (((tickAnim - 13) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 4) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 47) {
            xx = -0.75 + (((tickAnim - 17) / 30) * (-0.75-(-0.75)));
            yy = 0 + (((tickAnim - 17) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 17) / 30) * (0-(0)));
        }
        else if (tickAnim >= 47 && tickAnim < 62) {
            xx = -0.75 + (((tickAnim - 47) / 15) * (0-(-0.75)));
            yy = 0 + (((tickAnim - 47) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 47) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(xx), tail2.rotateAngleY + (float) Math.toRadians(yy), tail2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 17) {
            xx = 0 + (((tickAnim - 10) / 7) * (1.25-(0)));
            yy = 0 + (((tickAnim - 10) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 7) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 47) {
            xx = 1.25 + (((tickAnim - 17) / 30) * (1.25-(1.25)));
            yy = 0 + (((tickAnim - 17) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 17) / 30) * (0-(0)));
        }
        else if (tickAnim >= 47 && tickAnim < 62) {
            xx = 1.25 + (((tickAnim - 47) / 15) * (0-(1.25)));
            yy = 0 + (((tickAnim - 47) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 47) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(xx), tail3.rotateAngleY + (float) Math.toRadians(yy), tail3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 17) {
            xx = 0 + (((tickAnim - 10) / 7) * (1.5-(0)));
            yy = 0 + (((tickAnim - 10) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 7) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 47) {
            xx = 1.5 + (((tickAnim - 17) / 30) * (1.5-(1.5)));
            yy = 0 + (((tickAnim - 17) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 17) / 30) * (0-(0)));
        }
        else if (tickAnim >= 47 && tickAnim < 62) {
            xx = 1.5 + (((tickAnim - 47) / 15) * (0-(1.5)));
            yy = 0 + (((tickAnim - 47) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 47) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(xx), tail4.rotateAngleY + (float) Math.toRadians(yy), tail4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 0) / 6) * (-2.87-(0)));
            yy = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 13) {
            xx = -2.87 + (((tickAnim - 6) / 7) * (-45.25-(-2.87)));
            yy = 0 + (((tickAnim - 6) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 7) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 17) {
            xx = -45.25 + (((tickAnim - 13) / 4) * (-47.25-(-45.25)));
            yy = 0 + (((tickAnim - 13) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 4) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 47) {
            xx = -47.25 + (((tickAnim - 17) / 30) * (-47.25-(-47.25)));
            yy = 0 + (((tickAnim - 17) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 17) / 30) * (0-(0)));
        }
        else if (tickAnim >= 47 && tickAnim < 53) {
            xx = -47.25 + (((tickAnim - 47) / 6) * (-52.25-(-47.25)));
            yy = 0 + (((tickAnim - 47) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 47) / 6) * (0-(0)));
        }
        else if (tickAnim >= 53 && tickAnim < 62) {
            xx = -52.25 + (((tickAnim - 53) / 9) * (0-(-52.25)));
            yy = 0 + (((tickAnim - 53) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 53) / 9) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm, rightArm.rotateAngleX + (float) Math.toRadians(xx), rightArm.rotateAngleY + (float) Math.toRadians(yy), rightArm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 0) / 6) * (-28.3004-(0)));
            yy = 0 + (((tickAnim - 0) / 6) * (-6.78643-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (16.60315-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 13) {
            xx = -28.3004 + (((tickAnim - 6) / 7) * (8.97457-(-28.3004)));
            yy = -6.78643 + (((tickAnim - 6) / 7) * (-8.34262-(-6.78643)));
            zz = 16.60315 + (((tickAnim - 6) / 7) * (7.19495-(16.60315)));
        }
        else if (tickAnim >= 13 && tickAnim < 17) {
            xx = 8.97457 + (((tickAnim - 13) / 4) * (10.72457-(8.97457)));
            yy = -8.34262 + (((tickAnim - 13) / 4) * (-8.34262-(-8.34262)));
            zz = 7.19495 + (((tickAnim - 13) / 4) * (7.19495-(7.19495)));
        }
        else if (tickAnim >= 17 && tickAnim < 47) {
            xx = 10.72457 + (((tickAnim - 17) / 30) * (10.72457-(10.72457)));
            yy = -8.34262 + (((tickAnim - 17) / 30) * (-8.34262-(-8.34262)));
            zz = 7.19495 + (((tickAnim - 17) / 30) * (7.19495-(7.19495)));
        }
        else if (tickAnim >= 47 && tickAnim < 53) {
            xx = 10.72457 + (((tickAnim - 47) / 6) * (30.45809-(10.72457)));
            yy = -8.34262 + (((tickAnim - 47) / 6) * (-4.63479-(-8.34262)));
            zz = 7.19495 + (((tickAnim - 47) / 6) * (3.9972-(7.19495)));
        }
        else if (tickAnim >= 53 && tickAnim < 62) {
            xx = 30.45809 + (((tickAnim - 53) / 9) * (0-(30.45809)));
            yy = -4.63479 + (((tickAnim - 53) / 9) * (0-(-4.63479)));
            zz = 3.9972 + (((tickAnim - 53) / 9) * (0-(3.9972)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm2, rightArm2.rotateAngleX + (float) Math.toRadians(xx), rightArm2.rotateAngleY + (float) Math.toRadians(yy), rightArm2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 6) / 7) * (-35.37438-(0)));
            yy = 0 + (((tickAnim - 6) / 7) * (-25.0718-(0)));
            zz = 0 + (((tickAnim - 6) / 7) * (113.727-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 47) {
            xx = -35.37438 + (((tickAnim - 13) / 34) * (-35.37438-(-35.37438)));
            yy = -25.0718 + (((tickAnim - 13) / 34) * (-25.0718-(-25.0718)));
            zz = 113.727 + (((tickAnim - 13) / 34) * (113.727-(113.727)));
        }
        else if (tickAnim >= 47 && tickAnim < 53) {
            xx = -35.37438 + (((tickAnim - 47) / 6) * (-25.81474-(-35.37438)));
            yy = -25.0718 + (((tickAnim - 47) / 6) * (-24.78973-(-25.0718)));
            zz = 113.727 + (((tickAnim - 47) / 6) * (94.55591-(113.727)));
        }
        else if (tickAnim >= 53 && tickAnim < 59) {
            xx = -25.81474 + (((tickAnim - 53) / 6) * (0-(-25.81474)));
            yy = -24.78973 + (((tickAnim - 53) / 6) * (0-(-24.78973)));
            zz = 94.55591 + (((tickAnim - 53) / 6) * (0-(94.55591)));
        }
        else if (tickAnim >= 59 && tickAnim < 62) {
            xx = 0 + (((tickAnim - 59) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 59) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 59) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm3, rightArm3.rotateAngleX + (float) Math.toRadians(xx), rightArm3.rotateAngleY + (float) Math.toRadians(yy), rightArm3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (0.475-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (0.425-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 47) {
            xx = 0.475 + (((tickAnim - 13) / 34) * (0.475-(0.475)));
            yy = 0.425 + (((tickAnim - 13) / 34) * (0.425-(0.425)));
            zz = 0 + (((tickAnim - 13) / 34) * (0-(0)));
        }
        else if (tickAnim >= 47 && tickAnim < 62) {
            xx = 0.475 + (((tickAnim - 47) / 15) * (0-(0.475)));
            yy = 0.425 + (((tickAnim - 47) / 15) * (0-(0.425)));
            zz = 0 + (((tickAnim - 47) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightArm3.rotationPointX = this.rightArm3.rotationPointX + (float)(xx);
        this.rightArm3.rotationPointY = this.rightArm3.rotationPointY - (float)(yy);
        this.rightArm3.rotationPointZ = this.rightArm3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (11.5-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 17) {
            xx = 11.5 + (((tickAnim - 13) / 4) * (8.25-(11.5)));
            yy = 0 + (((tickAnim - 13) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 4) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 47) {
            xx = 8.25 + (((tickAnim - 17) / 30) * (8.25-(8.25)));
            yy = 0 + (((tickAnim - 17) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 17) / 30) * (0-(0)));
        }
        else if (tickAnim >= 47 && tickAnim < 62) {
            xx = 8.25 + (((tickAnim - 47) / 15) * (0-(8.25)));
            yy = 0 + (((tickAnim - 47) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 47) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg, rightLeg.rotateAngleX + (float) Math.toRadians(xx), rightLeg.rotateAngleY + (float) Math.toRadians(yy), rightLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (-7.75-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 17) {
            xx = -7.75 + (((tickAnim - 13) / 4) * (-3.5-(-7.75)));
            yy = 0 + (((tickAnim - 13) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 4) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 47) {
            xx = -3.5 + (((tickAnim - 17) / 30) * (-3.5-(-3.5)));
            yy = 0 + (((tickAnim - 17) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 17) / 30) * (0-(0)));
        }
        else if (tickAnim >= 47 && tickAnim < 62) {
            xx = -3.5 + (((tickAnim - 47) / 15) * (0-(-3.5)));
            yy = 0 + (((tickAnim - 47) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 47) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg2, rightLeg2.rotateAngleX + (float) Math.toRadians(xx), rightLeg2.rotateAngleY + (float) Math.toRadians(yy), rightLeg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (26.25-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 47) {
            xx = 26.25 + (((tickAnim - 13) / 34) * (26.25-(26.25)));
            yy = 0 + (((tickAnim - 13) / 34) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 34) * (0-(0)));
        }
        else if (tickAnim >= 47 && tickAnim < 62) {
            xx = 26.25 + (((tickAnim - 47) / 15) * (0-(26.25)));
            yy = 0 + (((tickAnim - 47) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 47) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg3, rightLeg3.rotateAngleX + (float) Math.toRadians(xx), rightLeg3.rotateAngleY + (float) Math.toRadians(yy), rightLeg3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (-36.5-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 47) {
            xx = -36.5 + (((tickAnim - 13) / 34) * (-36.5-(-36.5)));
            yy = 0 + (((tickAnim - 13) / 34) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 34) * (0-(0)));
        }
        else if (tickAnim >= 47 && tickAnim < 62) {
            xx = -36.5 + (((tickAnim - 47) / 15) * (0-(-36.5)));
            yy = 0 + (((tickAnim - 47) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 47) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg4, rightLeg4.rotateAngleX + (float) Math.toRadians(xx), rightLeg4.rotateAngleY + (float) Math.toRadians(yy), rightLeg4.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (-0.35-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 47) {
            xx = 0 + (((tickAnim - 13) / 34) * (0-(0)));
            yy = -0.35 + (((tickAnim - 13) / 34) * (-0.35-(-0.35)));
            zz = 0 + (((tickAnim - 13) / 34) * (0-(0)));
        }
        else if (tickAnim >= 47 && tickAnim < 62) {
            xx = 0 + (((tickAnim - 47) / 15) * (0-(0)));
            yy = -0.35 + (((tickAnim - 47) / 15) * (0-(-0.35)));
            zz = 0 + (((tickAnim - 47) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightLeg4.rotationPointX = this.rightLeg4.rotationPointX + (float)(xx);
        this.rightLeg4.rotationPointY = this.rightLeg4.rotationPointY - (float)(yy);
        this.rightLeg4.rotationPointZ = this.rightLeg4.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 23) {
            xx = 1 + (((tickAnim - 0) / 23) * (1-(1)));
            yy = 1 + (((tickAnim - 0) / 23) * (1-(1)));
            zz = 1 + (((tickAnim - 0) / 23) * (1-(1)));
        }
        else if (tickAnim >= 23 && tickAnim < 27) {
            xx = 1 + (((tickAnim - 23) / 4) * (1-(1)));
            yy = 1 + (((tickAnim - 23) / 4) * (-0.0025-(1)));
            zz = 1 + (((tickAnim - 23) / 4) * (1-(1)));
        }
        else if (tickAnim >= 27 && tickAnim < 28) {
            xx = 1 + (((tickAnim - 27) / 1) * (1-(1)));
            yy = -0.0025 + (((tickAnim - 27) / 1) * (-0.0025-(-0.0025)));
            zz = 1 + (((tickAnim - 27) / 1) * (1-(1)));
        }
        else if (tickAnim >= 28 && tickAnim < 32) {
            xx = 1 + (((tickAnim - 28) / 4) * (1-(1)));
            yy = -0.0025 + (((tickAnim - 28) / 4) * (1-(-0.0025)));
            zz = 1 + (((tickAnim - 28) / 4) * (1-(1)));
        }
        else if (tickAnim >= 32 && tickAnim < 38) {
            xx = 1 + (((tickAnim - 32) / 6) * (1-(1)));
            yy = 1 + (((tickAnim - 32) / 6) * (1-(1)));
            zz = 1 + (((tickAnim - 32) / 6) * (1-(1)));
        }
        else if (tickAnim >= 38 && tickAnim < 42) {
            xx = 1 + (((tickAnim - 38) / 4) * (1-(1)));
            yy = 1 + (((tickAnim - 38) / 4) * (0.3875-(1)));
            zz = 1 + (((tickAnim - 38) / 4) * (1-(1)));
        }
        else if (tickAnim >= 42 && tickAnim < 43) {
            xx = 1 + (((tickAnim - 42) / 1) * (1-(1)));
            yy = 0.3875 + (((tickAnim - 42) / 1) * (0.26-(0.3875)));
            zz = 1 + (((tickAnim - 42) / 1) * (1-(1)));
        }
        else if (tickAnim >= 43 && tickAnim < 47) {
            xx = 1 + (((tickAnim - 43) / 4) * (1-(1)));
            yy = 0.26 + (((tickAnim - 43) / 4) * (1-(0.26)));
            zz = 1 + (((tickAnim - 43) / 4) * (1-(1)));
        }
        else {
            xx = 1;
            yy = 1;
            zz = 1;
        }
        this.eyes.setScale((float)xx, (float)yy, (float)zz);
        
    }
    public void animGraze(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraScutellosaurus entity = (EntityPrehistoricFloraScutellosaurus) entitylivingbaseIn;
        int animCycle = 80;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        if (tickAnim >= 0 && tickAnim < 25) {
            xx = -0-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*40 + (((tickAnim - 0) / 25) * (-36.75-(-0-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*40)));
            yy = 0 + (((tickAnim - 0) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 25) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 54) {
            xx = -36.75 + (((tickAnim - 25) / 29) * (-36.75-(-36.75)));
            yy = 0 + (((tickAnim - 25) / 29) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 29) * (0-(0)));
        }
        else if (tickAnim >= 54 && tickAnim < 80) {
            xx = -36.75 + (((tickAnim - 54) / 26) * (0-(-36.75)));
            yy = 0 + (((tickAnim - 54) / 26) * (0-(0)));
            zz = 0 + (((tickAnim - 54) / 26) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(hip, hip.rotateAngleX + (float) Math.toRadians(xx), hip.rotateAngleY + (float) Math.toRadians(yy), hip.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 0) / 25) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 25) * (1.575-(0)));
            zz = 0 + (((tickAnim - 0) / 25) * (-1.525-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 54) {
            xx = 0 + (((tickAnim - 25) / 29) * (0-(0)));
            yy = 1.575 + (((tickAnim - 25) / 29) * (1.575-(1.575)));
            zz = -1.525 + (((tickAnim - 25) / 29) * (-1.525-(-1.525)));
        }
        else if (tickAnim >= 54 && tickAnim < 80) {
            xx = 0 + (((tickAnim - 54) / 26) * (0-(0)));
            yy = 1.575 + (((tickAnim - 54) / 26) * (0-(1.575)));
            zz = -1.525 + (((tickAnim - 54) / 26) * (0-(-1.525)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.hip.rotationPointX = this.hip.rotationPointX + (float)(xx);
        this.hip.rotationPointY = this.hip.rotationPointY - (float)(yy);
        this.hip.rotationPointZ = this.hip.rotationPointZ + (float)(zz);




        if (tickAnim >= 26 && tickAnim < 31) {
            xx = 0 + (((tickAnim - 26) / 5) * (1.25-(0)));
            yy = 0 + (((tickAnim - 26) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 26) / 5) * (0-(0)));
        }
        else if (tickAnim >= 31 && tickAnim < 38) {
            xx = 1.25 + (((tickAnim - 31) / 7) * (0-(1.25)));
            yy = 0 + (((tickAnim - 31) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 31) / 7) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 42) {
            xx = 0 + (((tickAnim - 38) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 38) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 38) / 4) * (0-(0)));
        }
        else if (tickAnim >= 42 && tickAnim < 47) {
            xx = 0 + (((tickAnim - 42) / 5) * (1.25-(0)));
            yy = 0 + (((tickAnim - 42) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 42) / 5) * (0-(0)));
        }
        else if (tickAnim >= 47 && tickAnim < 54) {
            xx = 1.25 + (((tickAnim - 47) / 7) * (0-(1.25)));
            yy = 0 + (((tickAnim - 47) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 47) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(xx), body.rotateAngleY + (float) Math.toRadians(yy), body.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 26) {
            xx = 0 + (((tickAnim - 0) / 26) * (31.04611-(0)));
            yy = 0 + (((tickAnim - 0) / 26) * (9.7106-(0)));
            zz = 0 + (((tickAnim - 0) / 26) * (-2.39989-(0)));
        }
        else if (tickAnim >= 26 && tickAnim < 80) {
            xx = 31.04611 + (((tickAnim - 26) / 54) * (0-(31.04611)));
            yy = 9.7106 + (((tickAnim - 26) / 54) * (0-(9.7106)));
            zz = -2.39989 + (((tickAnim - 26) / 54) * (0-(-2.39989)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm, leftArm.rotateAngleX + (float) Math.toRadians(xx), leftArm.rotateAngleY + (float) Math.toRadians(yy), leftArm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 26) {
            xx = 0 + (((tickAnim - 0) / 26) * (-26.21673-(0)));
            yy = 0 + (((tickAnim - 0) / 26) * (3.65274-(0)));
            zz = 0 + (((tickAnim - 0) / 26) * (-14.55836-(0)));
        }
        else if (tickAnim >= 26 && tickAnim < 80) {
            xx = -26.21673 + (((tickAnim - 26) / 54) * (0-(-26.21673)));
            yy = 3.65274 + (((tickAnim - 26) / 54) * (0-(3.65274)));
            zz = -14.55836 + (((tickAnim - 26) / 54) * (0-(-14.55836)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm2, leftArm2.rotateAngleX + (float) Math.toRadians(xx), leftArm2.rotateAngleY + (float) Math.toRadians(yy), leftArm2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 26) {
            xx = 0 + (((tickAnim - 0) / 26) * (-13.25-(0)));
            yy = 0 + (((tickAnim - 0) / 26) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 26) * (0-(0)));
        }
        else if (tickAnim >= 26 && tickAnim < 31) {
            xx = -13.25 + (((tickAnim - 26) / 5) * (9.25-(-13.25)));
            yy = 0 + (((tickAnim - 26) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 26) / 5) * (0-(0)));
        }
        else if (tickAnim >= 31 && tickAnim < 33) {
            xx = 9.25 + (((tickAnim - 31) / 2) * (2.25-(9.25)));
            yy = 0 + (((tickAnim - 31) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 31) / 2) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 38) {
            xx = 2.25 + (((tickAnim - 33) / 5) * (-13.25-(2.25)));
            yy = 0 + (((tickAnim - 33) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 5) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 40) {
            xx = -13.25 + (((tickAnim - 38) / 2) * (-16.5-(-13.25)));
            yy = 0 + (((tickAnim - 38) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 38) / 2) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 42) {
            xx = -16.5 + (((tickAnim - 40) / 2) * (-13.25-(-16.5)));
            yy = 0 + (((tickAnim - 40) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 2) * (0-(0)));
        }
        else if (tickAnim >= 42 && tickAnim < 47) {
            xx = -13.25 + (((tickAnim - 42) / 5) * (9.25-(-13.25)));
            yy = 0 + (((tickAnim - 42) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 42) / 5) * (0-(0)));
        }
        else if (tickAnim >= 47 && tickAnim < 48) {
            xx = 9.25 + (((tickAnim - 47) / 1) * (2.25-(9.25)));
            yy = 0 + (((tickAnim - 47) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 47) / 1) * (0-(0)));
        }
        else if (tickAnim >= 48 && tickAnim < 54) {
            xx = 2.25 + (((tickAnim - 48) / 6) * (-13.25-(2.25)));
            yy = 0 + (((tickAnim - 48) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 48) / 6) * (0-(0)));
        }
        else if (tickAnim >= 54 && tickAnim < 56) {
            xx = -13.25 + (((tickAnim - 54) / 2) * (-16.5-(-13.25)));
            yy = 0 + (((tickAnim - 54) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 54) / 2) * (0-(0)));
        }
        else if (tickAnim >= 56 && tickAnim < 68) {
            xx = -16.5 + (((tickAnim - 56) / 12) * (-21.03-(-16.5)));
            yy = 0 + (((tickAnim - 56) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 56) / 12) * (0-(0)));
        }
        else if (tickAnim >= 68 && tickAnim < 80) {
            xx = -21.03 + (((tickAnim - 68) / 12) * (0-(-21.03)));
            yy = 0 + (((tickAnim - 68) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 68) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck1, neck1.rotateAngleX + (float) Math.toRadians(xx), neck1.rotateAngleY + (float) Math.toRadians(yy), neck1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 26) {
            xx = 0 + (((tickAnim - 0) / 26) * (-1-(0)));
            yy = 0 + (((tickAnim - 0) / 26) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 26) * (0-(0)));
        }
        else if (tickAnim >= 26 && tickAnim < 31) {
            xx = -1 + (((tickAnim - 26) / 5) * (12-(-1)));
            yy = 0 + (((tickAnim - 26) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 26) / 5) * (0-(0)));
        }
        else if (tickAnim >= 31 && tickAnim < 33) {
            xx = 12 + (((tickAnim - 31) / 2) * (20-(12)));
            yy = 0 + (((tickAnim - 31) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 31) / 2) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 38) {
            xx = 20 + (((tickAnim - 33) / 5) * (-1-(20)));
            yy = 0 + (((tickAnim - 33) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 5) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 40) {
            xx = -1 + (((tickAnim - 38) / 2) * (2.5-(-1)));
            yy = 0 + (((tickAnim - 38) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 38) / 2) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 42) {
            xx = 2.5 + (((tickAnim - 40) / 2) * (-1-(2.5)));
            yy = 0 + (((tickAnim - 40) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 2) * (0-(0)));
        }
        else if (tickAnim >= 42 && tickAnim < 47) {
            xx = -1 + (((tickAnim - 42) / 5) * (12-(-1)));
            yy = 0 + (((tickAnim - 42) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 42) / 5) * (0-(0)));
        }
        else if (tickAnim >= 47 && tickAnim < 48) {
            xx = 12 + (((tickAnim - 47) / 1) * (20-(12)));
            yy = 0 + (((tickAnim - 47) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 47) / 1) * (0-(0)));
        }
        else if (tickAnim >= 48 && tickAnim < 54) {
            xx = 20 + (((tickAnim - 48) / 6) * (-1-(20)));
            yy = 0 + (((tickAnim - 48) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 48) / 6) * (0-(0)));
        }
        else if (tickAnim >= 54 && tickAnim < 56) {
            xx = -1 + (((tickAnim - 54) / 2) * (2.5-(-1)));
            yy = 0 + (((tickAnim - 54) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 54) / 2) * (0-(0)));
        }
        else if (tickAnim >= 56 && tickAnim < 68) {
            xx = 2.5 + (((tickAnim - 56) / 12) * (-4.46-(2.5)));
            yy = 0 + (((tickAnim - 56) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 56) / 12) * (0-(0)));
        }
        else if (tickAnim >= 68 && tickAnim < 80) {
            xx = -4.46 + (((tickAnim - 68) / 12) * (0-(-4.46)));
            yy = 0 + (((tickAnim - 68) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 68) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(xx), neck2.rotateAngleY + (float) Math.toRadians(yy), neck2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 26) {
            xx = 0 + (((tickAnim - 0) / 26) * (8.25-(0)));
            yy = 0 + (((tickAnim - 0) / 26) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 26) * (0-(0)));
        }
        else if (tickAnim >= 26 && tickAnim < 31) {
            xx = 8.25 + (((tickAnim - 26) / 5) * (-10.5-(8.25)));
            yy = 0 + (((tickAnim - 26) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 26) / 5) * (0-(0)));
        }
        else if (tickAnim >= 31 && tickAnim < 38) {
            xx = -10.5 + (((tickAnim - 31) / 7) * (8.25-(-10.5)));
            yy = 0 + (((tickAnim - 31) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 31) / 7) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 42) {
            xx = 8.25 + (((tickAnim - 38) / 4) * (8.25-(8.25)));
            yy = 0 + (((tickAnim - 38) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 38) / 4) * (0-(0)));
        }
        else if (tickAnim >= 42 && tickAnim < 47) {
            xx = 8.25 + (((tickAnim - 42) / 5) * (-10.5-(8.25)));
            yy = 0 + (((tickAnim - 42) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 42) / 5) * (0-(0)));
        }
        else if (tickAnim >= 47 && tickAnim < 54) {
            xx = -10.5 + (((tickAnim - 47) / 7) * (8.25-(-10.5)));
            yy = 0 + (((tickAnim - 47) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 47) / 7) * (0-(0)));
        }
        else if (tickAnim >= 54 && tickAnim < 80) {
            xx = 8.25 + (((tickAnim - 54) / 26) * (0-(8.25)));
            yy = 0 + (((tickAnim - 54) / 26) * (0-(0)));
            zz = 0 + (((tickAnim - 54) / 26) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(xx), neck3.rotateAngleY + (float) Math.toRadians(yy), neck3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 26) {
            xx = 0 + (((tickAnim - 0) / 26) * (16.75-(0)));
            yy = 0 + (((tickAnim - 0) / 26) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 26) * (0-(0)));
        }
        else if (tickAnim >= 26 && tickAnim < 31) {
            xx = 16.75 + (((tickAnim - 26) / 5) * (-12-(16.75)));
            yy = 0 + (((tickAnim - 26) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 26) / 5) * (0-(0)));
        }
        else if (tickAnim >= 31 && tickAnim < 38) {
            xx = -12 + (((tickAnim - 31) / 7) * (16.75-(-12)));
            yy = 0 + (((tickAnim - 31) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 31) / 7) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 42) {
            xx = 16.75 + (((tickAnim - 38) / 4) * (16.75-(16.75)));
            yy = 0 + (((tickAnim - 38) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 38) / 4) * (0-(0)));
        }
        else if (tickAnim >= 42 && tickAnim < 47) {
            xx = 16.75 + (((tickAnim - 42) / 5) * (-12-(16.75)));
            yy = 0 + (((tickAnim - 42) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 42) / 5) * (0-(0)));
        }
        else if (tickAnim >= 47 && tickAnim < 54) {
            xx = -12 + (((tickAnim - 47) / 7) * (16.75-(-12)));
            yy = 0 + (((tickAnim - 47) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 47) / 7) * (0-(0)));
        }
        else if (tickAnim >= 54 && tickAnim < 68) {
            xx = 16.75 + (((tickAnim - 54) / 14) * (21.85-(16.75)));
            yy = 0 + (((tickAnim - 54) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 54) / 14) * (0-(0)));
        }
        else if (tickAnim >= 68 && tickAnim < 80) {
            xx = 21.85 + (((tickAnim - 68) / 12) * (0-(21.85)));
            yy = 0 + (((tickAnim - 68) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 68) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 26) {
            xx = 0 + (((tickAnim - 0) / 26) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 26) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 26) * (0-(0)));
        }
        else if (tickAnim >= 26 && tickAnim < 29) {
            xx = 0 + (((tickAnim - 26) / 3) * (19.5-(0)));
            yy = 0 + (((tickAnim - 26) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 26) / 3) * (0-(0)));
        }
        else if (tickAnim >= 29 && tickAnim < 33) {
            xx = 19.5 + (((tickAnim - 29) / 4) * (0-(19.5)));
            yy = 0 + (((tickAnim - 29) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 29) / 4) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 33) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 33) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 2) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 37) {
            xx = 0 + (((tickAnim - 35) / 2) * (8.75-(0)));
            yy = 0 + (((tickAnim - 35) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 2) * (0-(0)));
        }
        else if (tickAnim >= 37 && tickAnim < 38) {
            xx = 8.75 + (((tickAnim - 37) / 1) * (0-(8.75)));
            yy = 0 + (((tickAnim - 37) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 37) / 1) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 42) {
            xx = 0 + (((tickAnim - 38) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 38) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 38) / 4) * (0-(0)));
        }
        else if (tickAnim >= 42 && tickAnim < 45) {
            xx = 0 + (((tickAnim - 42) / 3) * (19.5-(0)));
            yy = 0 + (((tickAnim - 42) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 42) / 3) * (0-(0)));
        }
        else if (tickAnim >= 45 && tickAnim < 48) {
            xx = 19.5 + (((tickAnim - 45) / 3) * (0-(19.5)));
            yy = 0 + (((tickAnim - 45) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 45) / 3) * (0-(0)));
        }
        else if (tickAnim >= 48 && tickAnim < 51) {
            xx = 0 + (((tickAnim - 48) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 48) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 48) / 3) * (0-(0)));
        }
        else if (tickAnim >= 51 && tickAnim < 53) {
            xx = 0 + (((tickAnim - 51) / 2) * (8.75-(0)));
            yy = 0 + (((tickAnim - 51) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 51) / 2) * (0-(0)));
        }
        else if (tickAnim >= 53 && tickAnim < 54) {
            xx = 8.75 + (((tickAnim - 53) / 1) * (0-(8.75)));
            yy = 0 + (((tickAnim - 53) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 53) / 1) * (0-(0)));
        }
        else if (tickAnim >= 54 && tickAnim < 80) {
            xx = 0 + (((tickAnim - 54) / 26) * (0-(0)));
            yy = 0 + (((tickAnim - 54) / 26) * (0-(0)));
            zz = 0 + (((tickAnim - 54) / 26) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(xx), jaw.rotateAngleY + (float) Math.toRadians(yy), jaw.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 25) {
            xx = -0-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-30 + (((tickAnim - 0) / 25) * (26-(-0-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-30)));
            yy = 0 + (((tickAnim - 0) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 25) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 54) {
            xx = 26 + (((tickAnim - 25) / 29) * (26-(26)));
            yy = 0 + (((tickAnim - 25) / 29) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 29) * (0-(0)));
        }
        else if (tickAnim >= 54 && tickAnim < 80) {
            xx = 26 + (((tickAnim - 54) / 26) * (0-(26)));
            yy = 0 + (((tickAnim - 54) / 26) * (0-(0)));
            zz = 0 + (((tickAnim - 54) / 26) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg, leftLeg.rotateAngleX + (float) Math.toRadians(xx), leftLeg.rotateAngleY + (float) Math.toRadians(yy), leftLeg.rotateAngleZ + (float) Math.toRadians(zz));



        this.setRotateAngle(leftLeg2, leftLeg2.rotateAngleX + (float) Math.toRadians(0), leftLeg2.rotateAngleY + (float) Math.toRadians(0), leftLeg2.rotateAngleZ + (float) Math.toRadians(0));



        if (tickAnim >= 0 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 0) / 25) * (33.25-(0)));
            yy = 0 + (((tickAnim - 0) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 25) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 54) {
            xx = 33.25 + (((tickAnim - 25) / 29) * (33.25-(33.25)));
            yy = 0 + (((tickAnim - 25) / 29) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 29) * (0-(0)));
        }
        else if (tickAnim >= 54 && tickAnim < 80) {
            xx = 33.25 + (((tickAnim - 54) / 26) * (0-(33.25)));
            yy = 0 + (((tickAnim - 54) / 26) * (0-(0)));
            zz = 0 + (((tickAnim - 54) / 26) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg3, leftLeg3.rotateAngleX + (float) Math.toRadians(xx), leftLeg3.rotateAngleY + (float) Math.toRadians(yy), leftLeg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 0) / 25) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 25) * (-0.1-(0)));
            zz = 0 + (((tickAnim - 0) / 25) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 54) {
            xx = 0 + (((tickAnim - 25) / 29) * (0-(0)));
            yy = -0.1 + (((tickAnim - 25) / 29) * (-0.1-(-0.1)));
            zz = 0 + (((tickAnim - 25) / 29) * (0-(0)));
        }
        else if (tickAnim >= 54 && tickAnim < 80) {
            xx = 0 + (((tickAnim - 54) / 26) * (0-(0)));
            yy = -0.1 + (((tickAnim - 54) / 26) * (0-(-0.1)));
            zz = 0 + (((tickAnim - 54) / 26) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftLeg3.rotationPointX = this.leftLeg3.rotationPointX + (float)(xx);
        this.leftLeg3.rotationPointY = this.leftLeg3.rotationPointY - (float)(yy);
        this.leftLeg3.rotationPointZ = this.leftLeg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 0) / 25) * (-21.5-(0)));
            yy = 0 + (((tickAnim - 0) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 25) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 54) {
            xx = -21.5 + (((tickAnim - 25) / 29) * (-21.5-(-21.5)));
            yy = 0 + (((tickAnim - 25) / 29) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 29) * (0-(0)));
        }
        else if (tickAnim >= 54 && tickAnim < 80) {
            xx = -21.5 + (((tickAnim - 54) / 26) * (0-(-21.5)));
            yy = 0 + (((tickAnim - 54) / 26) * (0-(0)));
            zz = 0 + (((tickAnim - 54) / 26) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg4, leftLeg4.rotateAngleX + (float) Math.toRadians(xx), leftLeg4.rotateAngleY + (float) Math.toRadians(yy), leftLeg4.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 0) / 25) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 25) * (-0.575-(0)));
            zz = 0 + (((tickAnim - 0) / 25) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 54) {
            xx = 0 + (((tickAnim - 25) / 29) * (0-(0)));
            yy = -0.575 + (((tickAnim - 25) / 29) * (-0.575-(-0.575)));
            zz = 0 + (((tickAnim - 25) / 29) * (0-(0)));
        }
        else if (tickAnim >= 54 && tickAnim < 80) {
            xx = 0 + (((tickAnim - 54) / 26) * (0-(0)));
            yy = -0.575 + (((tickAnim - 54) / 26) * (0-(-0.575)));
            zz = 0 + (((tickAnim - 54) / 26) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftLeg4.rotationPointX = this.leftLeg4.rotationPointX + (float)(xx);
        this.leftLeg4.rotationPointY = this.leftLeg4.rotationPointY - (float)(yy);
        this.leftLeg4.rotationPointZ = this.leftLeg4.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 26) {
            xx = 0 + (((tickAnim - 0) / 26) * (6.75-(0)));
            yy = 0 + (((tickAnim - 0) / 26) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 26) * (0-(0)));
        }
        else if (tickAnim >= 26 && tickAnim < 54) {
            xx = 6.75 + (((tickAnim - 26) / 28) * (6.75-(6.75)));
            yy = 0 + (((tickAnim - 26) / 28) * (0-(0)));
            zz = 0 + (((tickAnim - 26) / 28) * (0-(0)));
        }
        else if (tickAnim >= 54 && tickAnim < 80) {
            xx = 6.75 + (((tickAnim - 54) / 26) * (0-(6.75)));
            yy = 0 + (((tickAnim - 54) / 26) * (0-(0)));
            zz = 0 + (((tickAnim - 54) / 26) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail1, tail1.rotateAngleX + (float) Math.toRadians(xx), tail1.rotateAngleY + (float) Math.toRadians(yy), tail1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (16.42-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 26) {
            xx = 16.42 + (((tickAnim - 13) / 13) * (12.75-(16.42)));
            yy = 0 + (((tickAnim - 13) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 13) * (0-(0)));
        }
        else if (tickAnim >= 26 && tickAnim < 54) {
            xx = 12.75 + (((tickAnim - 26) / 28) * (12.75-(12.75)));
            yy = 0 + (((tickAnim - 26) / 28) * (0-(0)));
            zz = 0 + (((tickAnim - 26) / 28) * (0-(0)));
        }
        else if (tickAnim >= 54 && tickAnim < 80) {
            xx = 12.75 + (((tickAnim - 54) / 26) * (0-(12.75)));
            yy = 0 + (((tickAnim - 54) / 26) * (0-(0)));
            zz = 0 + (((tickAnim - 54) / 26) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(xx), tail2.rotateAngleY + (float) Math.toRadians(yy), tail2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (13.35-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 26) {
            xx = 13.35 + (((tickAnim - 13) / 13) * (16.75-(13.35)));
            yy = 0 + (((tickAnim - 13) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 13) * (0-(0)));
        }
        else if (tickAnim >= 26 && tickAnim < 54) {
            xx = 16.75 + (((tickAnim - 26) / 28) * (16.75-(16.75)));
            yy = 0 + (((tickAnim - 26) / 28) * (0-(0)));
            zz = 0 + (((tickAnim - 26) / 28) * (0-(0)));
        }
        else if (tickAnim >= 54 && tickAnim < 80) {
            xx = 16.75 + (((tickAnim - 54) / 26) * (0-(16.75)));
            yy = 0 + (((tickAnim - 54) / 26) * (0-(0)));
            zz = 0 + (((tickAnim - 54) / 26) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(xx), tail3.rotateAngleY + (float) Math.toRadians(yy), tail3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 0) / 11) * (18.25-(0)));
            yy = 0 + (((tickAnim - 0) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 11) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 26) {
            xx = 18.25 + (((tickAnim - 11) / 15) * (0-(18.25)));
            yy = 0 + (((tickAnim - 11) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 15) * (0-(0)));
        }
        else if (tickAnim >= 26 && tickAnim < 54) {
            xx = 0 + (((tickAnim - 26) / 28) * (0-(0)));
            yy = 0 + (((tickAnim - 26) / 28) * (0-(0)));
            zz = 0 + (((tickAnim - 26) / 28) * (0-(0)));
        }
        else if (tickAnim >= 54 && tickAnim < 80) {
            xx = 0 + (((tickAnim - 54) / 26) * (0-(0)));
            yy = 0 + (((tickAnim - 54) / 26) * (0-(0)));
            zz = 0 + (((tickAnim - 54) / 26) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(xx), tail4.rotateAngleY + (float) Math.toRadians(yy), tail4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 26) {
            xx = 0 + (((tickAnim - 0) / 26) * (9.21508-(0)));
            yy = 0 + (((tickAnim - 0) / 26) * (-17.50528-(0)));
            zz = 0 + (((tickAnim - 0) / 26) * (2.88386-(0)));
        }
        else if (tickAnim >= 26 && tickAnim < 80) {
            xx = 9.21508 + (((tickAnim - 26) / 54) * (0-(9.21508)));
            yy = -17.50528 + (((tickAnim - 26) / 54) * (0-(-17.50528)));
            zz = 2.88386 + (((tickAnim - 26) / 54) * (0-(2.88386)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm, rightArm.rotateAngleX + (float) Math.toRadians(xx), rightArm.rotateAngleY + (float) Math.toRadians(yy), rightArm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 26) {
            xx = 0 + (((tickAnim - 0) / 26) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 26) * (-16-(0)));
            zz = 0 + (((tickAnim - 0) / 26) * (0-(0)));
        }
        else if (tickAnim >= 26 && tickAnim < 80) {
            xx = 0 + (((tickAnim - 26) / 54) * (0-(0)));
            yy = -16 + (((tickAnim - 26) / 54) * (0-(-16)));
            zz = 0 + (((tickAnim - 26) / 54) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm2, rightArm2.rotateAngleX + (float) Math.toRadians(xx), rightArm2.rotateAngleY + (float) Math.toRadians(yy), rightArm2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (-25.25-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 25) {
            xx = -25.25 + (((tickAnim - 13) / 12) * (-2.5-(-25.25)));
            yy = 0 + (((tickAnim - 13) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 12) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 54) {
            xx = -2.5 + (((tickAnim - 25) / 29) * (-2.5-(-2.5)));
            yy = 0 + (((tickAnim - 25) / 29) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 29) * (0-(0)));
        }
        else if (tickAnim >= 54 && tickAnim < 80) {
            xx = -2.5 + (((tickAnim - 54) / 26) * (0-(-2.5)));
            yy = 0 + (((tickAnim - 54) / 26) * (0-(0)));
            zz = 0 + (((tickAnim - 54) / 26) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg, rightLeg.rotateAngleX + (float) Math.toRadians(xx), rightLeg.rotateAngleY + (float) Math.toRadians(yy), rightLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0.175-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-150-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 13) {
            xx = 0.175-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-150 + (((tickAnim - 5) / 8) * (16.82-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-50))*50-(0.175-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-150)));
            yy = 0 + (((tickAnim - 5) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 8) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 25) {
            xx = 16.82-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-50))*50 + (((tickAnim - 13) / 12) * (-5.75-(16.82-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-50))*50)));
            yy = 0 + (((tickAnim - 13) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 12) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 54) {
            xx = -5.75 + (((tickAnim - 25) / 29) * (-5.75-(-5.75)));
            yy = 0 + (((tickAnim - 25) / 29) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 29) * (0-(0)));
        }
        else if (tickAnim >= 54 && tickAnim < 68) {
            xx = -5.75 + (((tickAnim - 54) / 14) * (32.97-(-5.75)));
            yy = 0 + (((tickAnim - 54) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 54) / 14) * (0-(0)));
        }
        else if (tickAnim >= 68 && tickAnim < 80) {
            xx = 32.97 + (((tickAnim - 68) / 12) * (0-(32.97)));
            yy = 0 + (((tickAnim - 68) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 68) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg2, rightLeg2.rotateAngleX + (float) Math.toRadians(xx), rightLeg2.rotateAngleY + (float) Math.toRadians(yy), rightLeg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (-0.365-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0.03-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 8) / 5) * (0-(0)));
            yy = -0.365 + (((tickAnim - 8) / 5) * (0-(-0.365)));
            zz = 0.03 + (((tickAnim - 8) / 5) * (0-(0.03)));
        }
        else if (tickAnim >= 13 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 13) / 12) * (0-(0)));
            yy = 0 + (((tickAnim - 13) / 12) * (-0.125-(0)));
            zz = 0 + (((tickAnim - 13) / 12) * (0.075-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 54) {
            xx = 0 + (((tickAnim - 25) / 29) * (0-(0)));
            yy = -0.125 + (((tickAnim - 25) / 29) * (-0.125-(-0.125)));
            zz = 0.075 + (((tickAnim - 25) / 29) * (0.075-(0.075)));
        }
        else if (tickAnim >= 54 && tickAnim < 80) {
            xx = 0 + (((tickAnim - 54) / 26) * (0-(0)));
            yy = -0.125 + (((tickAnim - 54) / 26) * (0-(-0.125)));
            zz = 0.075 + (((tickAnim - 54) / 26) * (0-(0.075)));
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
            xx = 0 + (((tickAnim - 0) / 13) * (57.495-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*150-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 25) {
            xx = 57.495-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*150 + (((tickAnim - 13) / 12) * (40.25-(57.495-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*150)));
            yy = 0 + (((tickAnim - 13) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 12) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 54) {
            xx = 40.25 + (((tickAnim - 25) / 29) * (40.25-(40.25)));
            yy = 0 + (((tickAnim - 25) / 29) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 29) * (0-(0)));
        }
        else if (tickAnim >= 54 && tickAnim < 61) {
            xx = 40.25 + (((tickAnim - 54) / 7) * (-18.38-(40.25)));
            yy = 0 + (((tickAnim - 54) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 54) / 7) * (0-(0)));
        }
        else if (tickAnim >= 61 && tickAnim < 68) {
            xx = -18.38 + (((tickAnim - 61) / 7) * (-30.52-(-18.38)));
            yy = 0 + (((tickAnim - 61) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 61) / 7) * (0-(0)));
        }
        else if (tickAnim >= 68 && tickAnim < 80) {
            xx = -30.52 + (((tickAnim - 68) / 12) * (0-(-30.52)));
            yy = 0 + (((tickAnim - 68) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 68) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg3, rightLeg3.rotateAngleX + (float) Math.toRadians(xx), rightLeg3.rotateAngleY + (float) Math.toRadians(yy), rightLeg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 13) / 12) * (0-(0)));
            yy = 0 + (((tickAnim - 13) / 12) * (-0.35-(0)));
            zz = 0 + (((tickAnim - 13) / 12) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 54) {
            xx = 0 + (((tickAnim - 25) / 29) * (0-(0)));
            yy = -0.35 + (((tickAnim - 25) / 29) * (-0.35-(-0.35)));
            zz = 0 + (((tickAnim - 25) / 29) * (0-(0)));
        }
        else if (tickAnim >= 54 && tickAnim < 80) {
            xx = 0 + (((tickAnim - 54) / 26) * (0-(0)));
            yy = -0.35 + (((tickAnim - 54) / 26) * (0-(-0.35)));
            zz = 0 + (((tickAnim - 54) / 26) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightLeg3.rotationPointX = this.rightLeg3.rotationPointX + (float)(xx);
        this.rightLeg3.rotationPointY = this.rightLeg3.rotationPointY - (float)(yy);
        this.rightLeg3.rotationPointZ = this.rightLeg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (13.125-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-150-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 13) {
            xx = 13.125-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-150 + (((tickAnim - 5) / 8) * (-5.13-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-80))*150-(13.125-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-150)));
            yy = 0 + (((tickAnim - 5) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 8) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 25) {
            xx = -5.13-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-80))*150 + (((tickAnim - 13) / 12) * (5.25-(-5.13-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-80))*150)));
            yy = 0 + (((tickAnim - 13) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 12) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 54) {
            xx = 5.25 + (((tickAnim - 25) / 29) * (5.25-(5.25)));
            yy = 0 + (((tickAnim - 25) / 29) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 29) * (0-(0)));
        }
        else if (tickAnim >= 54 && tickAnim < 61) {
            xx = 5.25 + (((tickAnim - 54) / 7) * (104.39-(5.25)));
            yy = 0 + (((tickAnim - 54) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 54) / 7) * (0-(0)));
        }
        else if (tickAnim >= 61 && tickAnim < 68) {
            xx = 104.39 + (((tickAnim - 61) / 7) * (81.54-(104.39)));
            yy = 0 + (((tickAnim - 61) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 61) / 7) * (0-(0)));
        }
        else if (tickAnim >= 68 && tickAnim < 80) {
            xx = 81.54 + (((tickAnim - 68) / 12) * (0-(81.54)));
            yy = 0 + (((tickAnim - 68) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 68) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg4, rightLeg4.rotateAngleX + (float) Math.toRadians(xx), rightLeg4.rotateAngleY + (float) Math.toRadians(yy), rightLeg4.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 0) / 25) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 25) * (-0.425-(0)));
            zz = 0 + (((tickAnim - 0) / 25) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 54) {
            xx = 0 + (((tickAnim - 25) / 29) * (0-(0)));
            yy = -0.425 + (((tickAnim - 25) / 29) * (-0.425-(-0.425)));
            zz = 0 + (((tickAnim - 25) / 29) * (0-(0)));
        }
        else if (tickAnim >= 54 && tickAnim < 80) {
            xx = 0 + (((tickAnim - 54) / 26) * (0-(0)));
            yy = -0.425 + (((tickAnim - 54) / 26) * (0-(-0.425)));
            zz = 0 + (((tickAnim - 54) / 26) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightLeg4.rotationPointX = this.rightLeg4.rotationPointX + (float)(xx);
        this.rightLeg4.rotationPointY = this.rightLeg4.rotationPointY - (float)(yy);
        this.rightLeg4.rotationPointZ = this.rightLeg4.rotationPointZ + (float)(zz);




        if (tickAnim >= 35 && tickAnim < 37) {
            xx = 1 + (((tickAnim - 35) / 2) * (1-(1)));
            yy = 1 + (((tickAnim - 35) / 2) * (0.03-(1)));
            zz = 1 + (((tickAnim - 35) / 2) * (1-(1)));
        }
        else if (tickAnim >= 37 && tickAnim < 38) {
            xx = 1 + (((tickAnim - 37) / 1) * (1-(1)));
            yy = 0.03 + (((tickAnim - 37) / 1) * (1-(0.03)));
            zz = 1 + (((tickAnim - 37) / 1) * (1-(1)));
        }
        else {
            xx = 1;
            yy = 1;
            zz = 1;
        }
        this.eyes.setScale((float)xx, (float)yy, (float)zz);
        
    }

    public void animRunning(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraScutellosaurus entity = (EntityPrehistoricFloraScutellosaurus) entitylivingbaseIn;
        int animCycle = 12;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        this.setRotateAngle(hip, hip.rotateAngleX + (float) Math.toRadians(-5.5-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*575/0.5))*5.5), hip.rotateAngleY + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*575))*-2), hip.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*575))*5.5));
        this.hip.rotationPointX = this.hip.rotationPointX + (float)(0);
        this.hip.rotationPointY = this.hip.rotationPointY - (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*575/0.5-50))*-1);
        this.hip.rotationPointZ = this.hip.rotationPointZ + (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*575/0.5-50))*1.5);


        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(-1.5-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*575/0.5-100))*-5.5), body.rotateAngleY + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*575-80))*3), body.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*575))*-3.5));


        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(3.25-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*575/0.5-250))*-5.5), chest.rotateAngleY + (float) Math.toRadians(-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*575-80))*-3), chest.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*575))*-3.5));


        this.setRotateAngle(leftArm, leftArm.rotateAngleX + (float) Math.toRadians(29.8168913733-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*575/0.5-300))*-7.5), leftArm.rotateAngleY + (float) Math.toRadians(6.10383), leftArm.rotateAngleZ + (float) Math.toRadians(-3.43335));


        this.setRotateAngle(leftArm2, leftArm2.rotateAngleX + (float) Math.toRadians(-30.6191398952-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*575/0.5-380))*-9.5), leftArm2.rotateAngleY + (float) Math.toRadians(7.38473), leftArm2.rotateAngleZ + (float) Math.toRadians(-13.75634));


        this.setRotateAngle(neck1, neck1.rotateAngleX + (float) Math.toRadians(-13.5-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*575/0.5+10))*-15.5), neck1.rotateAngleY + (float) Math.toRadians(0), neck1.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(-11.25-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*575/0.5))*-12.5), neck2.rotateAngleY + (float) Math.toRadians(0), neck2.rotateAngleZ + (float) Math.toRadians(0));
        this.neck2.rotationPointX = this.neck2.rotationPointX + (float)(0);
        this.neck2.rotationPointY = this.neck2.rotationPointY - (float)(0);
        this.neck2.rotationPointZ = this.neck2.rotationPointZ + (float)(0.2+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*575/0.5))*-0.3);


        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(7.75-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*575/0.5))*12.5), neck3.rotateAngleY + (float) Math.toRadians(0), neck3.rotateAngleZ + (float) Math.toRadians(0));
        this.neck3.rotationPointX = this.neck3.rotationPointX + (float)(0);
        this.neck3.rotationPointY = this.neck3.rotationPointY - (float)(0);
        this.neck3.rotationPointZ = this.neck3.rotationPointZ + (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*575/0.5))*-0.1);


        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(8.25-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*575/0.5))*12.5), head.rotateAngleY + (float) Math.toRadians(0), head.rotateAngleZ + (float) Math.toRadians(0));



        if (tickAnim >= 0 && tickAnim < 2) {
            xx = -46.25 + (((tickAnim - 0) / 2) * (-28.5-(-46.25)));
            yy = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 2) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 8) {
            xx = -28.5 + (((tickAnim - 2) / 6) * (24-(-28.5)));
            yy = 0 + (((tickAnim - 2) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 2) / 6) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = 24 + (((tickAnim - 8) / 5) * (-46.25-(24)));
            yy = 0 + (((tickAnim - 8) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg, leftLeg.rotateAngleX + (float) Math.toRadians(xx), leftLeg.rotateAngleY + (float) Math.toRadians(yy), leftLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 9.5 + (((tickAnim - 0) / 2) * (-7.77906-(9.5)));
            yy = 0 + (((tickAnim - 0) / 2) * (0.53108-(0)));
            zz = 0 + (((tickAnim - 0) / 2) * (-0.2021-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 8) {
            xx = -7.77906 + (((tickAnim - 2) / 6) * (18.25-(-7.77906)));
            yy = 0.53108 + (((tickAnim - 2) / 6) * (0-(0.53108)));
            zz = -0.2021 + (((tickAnim - 2) / 6) * (0-(-0.2021)));
        }
        else if (tickAnim >= 8 && tickAnim < 9) {
            xx = 18.25 + (((tickAnim - 8) / 1) * (38.83-(18.25)));
            yy = 0 + (((tickAnim - 8) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 1) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 13) {
            xx = 38.83 + (((tickAnim - 9) / 4) * (9.5-(38.83)));
            yy = 0 + (((tickAnim - 9) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg2, leftLeg2.rotateAngleX + (float) Math.toRadians(xx), leftLeg2.rotateAngleY + (float) Math.toRadians(yy), leftLeg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = -28.5 + (((tickAnim - 0) / 2) * (2.5-(-28.5)));
            yy = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 2) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = 2.5 + (((tickAnim - 2) / 1) * (-17.68-(2.5)));
            yy = 0 + (((tickAnim - 2) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 2) / 1) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = -17.68 + (((tickAnim - 3) / 1) * (-3.7-(-17.68)));
            yy = 0 + (((tickAnim - 3) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 1) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 8) {
            xx = -3.7 + (((tickAnim - 4) / 4) * (12.5-(-3.7)));
            yy = 0 + (((tickAnim - 4) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 4) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 8) {
            xx = 12.5 + (((tickAnim - 8) / 0) * (18.66-(12.5)));
            yy = 0 + (((tickAnim - 8) / 0) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 0) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 11) {
            xx = 18.66 + (((tickAnim - 8) / 3) * (-42.09-(18.66)));
            yy = 0 + (((tickAnim - 8) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 3) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 13) {
            xx = -42.09 + (((tickAnim - 11) / 2) * (-28.5-(-42.09)));
            yy = 0 + (((tickAnim - 11) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg3, leftLeg3.rotateAngleX + (float) Math.toRadians(xx), leftLeg3.rotateAngleY + (float) Math.toRadians(yy), leftLeg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            yy = -0.275 + (((tickAnim - 0) / 2) * (0-(-0.275)));
            zz = 0.125 + (((tickAnim - 0) / 2) * (0-(0.125)));
        }
        else if (tickAnim >= 2 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 2) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 2) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 2) / 6) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 8) / 0) * (0-(0)));
            yy = 0 + (((tickAnim - 8) / 0) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 0) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 8) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 8) / 3) * (-0.78-(0)));
            zz = 0 + (((tickAnim - 8) / 3) * (-0.12-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 11) / 2) * (0-(0)));
            yy = -0.78 + (((tickAnim - 11) / 2) * (-0.275-(-0.78)));
            zz = -0.12 + (((tickAnim - 11) / 2) * (0.125-(-0.12)));
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
            xx = 84 + (((tickAnim - 0) / 2) * (45-(84)));
            yy = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 2) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = 45 + (((tickAnim - 2) / 1) * (52.58485-(45)));
            yy = 0 + (((tickAnim - 2) / 1) * (2.82089-(0)));
            zz = 0 + (((tickAnim - 2) / 1) * (-1.02147-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = 52.58485 + (((tickAnim - 3) / 1) * (12.32-(52.58485)));
            yy = 2.82089 + (((tickAnim - 3) / 1) * (0-(2.82089)));
            zz = -1.02147 + (((tickAnim - 3) / 1) * (0-(-1.02147)));
        }
        else if (tickAnim >= 4 && tickAnim < 8) {
            xx = 12.32 + (((tickAnim - 4) / 4) * (96-(12.32)));
            yy = 0 + (((tickAnim - 4) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 4) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 9) {
            xx = 96 + (((tickAnim - 8) / 1) * (128-(96)));
            yy = 0 + (((tickAnim - 8) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 1) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 13) {
            xx = 128 + (((tickAnim - 9) / 4) * (84-(128)));
            yy = 0 + (((tickAnim - 9) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg4, leftLeg4.rotateAngleX + (float) Math.toRadians(xx), leftLeg4.rotateAngleY + (float) Math.toRadians(yy), leftLeg4.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 8) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 8) / 1) * (-0.55-(0)));
            zz = 0 + (((tickAnim - 8) / 1) * (-0.025-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 9) / 2) * (0-(0)));
            yy = -0.55 + (((tickAnim - 9) / 2) * (0.16-(-0.55)));
            zz = -0.025 + (((tickAnim - 9) / 2) * (-0.175-(-0.025)));
        }
        else if (tickAnim >= 11 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 11) / 2) * (0-(0)));
            yy = 0.16 + (((tickAnim - 11) / 2) * (0-(0.16)));
            zz = -0.175 + (((tickAnim - 11) / 2) * (0-(-0.175)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftLeg4.rotationPointX = this.leftLeg4.rotationPointX + (float)(xx);
        this.leftLeg4.rotationPointY = this.leftLeg4.rotationPointY - (float)(yy);
        this.leftLeg4.rotationPointZ = this.leftLeg4.rotationPointZ + (float)(zz);



        this.setRotateAngle(tail1, tail1.rotateAngleX + (float) Math.toRadians(5.5-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*575/0.5))*2.5), tail1.rotateAngleY + (float) Math.toRadians(-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*575-50))*-2), tail1.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*575))*5.5));


        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*575/0.5-50))*5.5), tail2.rotateAngleY + (float) Math.toRadians(-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*575-50))*-5), tail2.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*575-50))*5));


        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*575/0.5-100))*8), tail3.rotateAngleY + (float) Math.toRadians(-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*575-100))*-9), tail3.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*575-50))*9));


        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*575/0.5-150))*12), tail4.rotateAngleY + (float) Math.toRadians(-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*575-150))*-14), tail4.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*575-100))*9));


        this.setRotateAngle(rightArm, rightArm.rotateAngleX + (float) Math.toRadians(29.8168913733-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*575/0.5-300))*-7.5), rightArm.rotateAngleY + (float) Math.toRadians(-6.10383), rightArm.rotateAngleZ + (float) Math.toRadians(3.43335));


        this.setRotateAngle(rightArm2, rightArm2.rotateAngleX + (float) Math.toRadians(-30.6191398952-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*575/0.5-380))*-9.5), rightArm2.rotateAngleY + (float) Math.toRadians(-7.38473), rightArm2.rotateAngleZ + (float) Math.toRadians(13.75634));



        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 22 + (((tickAnim - 0) / 7) * (-41-(22)));
            yy = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = -41 + (((tickAnim - 7) / 1) * (-28.5-(-41)));
            yy = 0 + (((tickAnim - 7) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 1) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = -28.5 + (((tickAnim - 8) / 5) * (22-(-28.5)));
            yy = 0 + (((tickAnim - 8) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg, rightLeg.rotateAngleX + (float) Math.toRadians(xx), rightLeg.rotateAngleY + (float) Math.toRadians(yy), rightLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 18.25 + (((tickAnim - 0) / 3) * (37.58-(18.25)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 7) {
            xx = 37.58 + (((tickAnim - 3) / 4) * (18.25-(37.58)));
            yy = 0 + (((tickAnim - 3) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 4) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = 18.25 + (((tickAnim - 7) / 1) * (-7.77906-(18.25)));
            yy = 0 + (((tickAnim - 7) / 1) * (0.53108-(0)));
            zz = 0 + (((tickAnim - 7) / 1) * (-0.2021-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = -7.77906 + (((tickAnim - 8) / 5) * (18.25-(-7.77906)));
            yy = 0.53108 + (((tickAnim - 8) / 5) * (0-(0.53108)));
            zz = -0.2021 + (((tickAnim - 8) / 5) * (0-(-0.2021)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg2, rightLeg2.rotateAngleX + (float) Math.toRadians(xx), rightLeg2.rotateAngleY + (float) Math.toRadians(yy), rightLeg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 1) {
            xx = 12.5 + (((tickAnim - 0) / 1) * (18.66-(12.5)));
            yy = 0 + (((tickAnim - 0) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 1) * (0-(0)));
        }
        else if (tickAnim >= 1 && tickAnim < 5) {
            xx = 18.66 + (((tickAnim - 1) / 4) * (-37.34-(18.66)));
            yy = 0 + (((tickAnim - 1) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 1) / 4) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 7) {
            xx = -37.34 + (((tickAnim - 5) / 2) * (-28.5-(-37.34)));
            yy = 0 + (((tickAnim - 5) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 2) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = -28.5 + (((tickAnim - 7) / 1) * (-2.25-(-28.5)));
            yy = 0 + (((tickAnim - 7) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 1) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 9) {
            xx = -2.25 + (((tickAnim - 8) / 1) * (-19.43-(-2.25)));
            yy = 0 + (((tickAnim - 8) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 1) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 11) {
            xx = -19.43 + (((tickAnim - 9) / 2) * (0.05-(-19.43)));
            yy = 0 + (((tickAnim - 9) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 2) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 13) {
            xx = 0.05 + (((tickAnim - 11) / 2) * (12.5-(0.05)));
            yy = 0 + (((tickAnim - 11) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg3, rightLeg3.rotateAngleX + (float) Math.toRadians(xx), rightLeg3.rotateAngleY + (float) Math.toRadians(yy), rightLeg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (-0.555-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (-0.02-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 5) / 2) * (0-(0)));
            yy = -0.555 + (((tickAnim - 5) / 2) * (-0.275-(-0.555)));
            zz = -0.02 + (((tickAnim - 5) / 2) * (0.125-(-0.02)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 7) / 1) * (0-(0)));
            yy = -0.275 + (((tickAnim - 7) / 1) * (0-(-0.275)));
            zz = 0.125 + (((tickAnim - 7) / 1) * (0-(0.125)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 8) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 8) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 5) * (0-(0)));
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
            xx = 96 + (((tickAnim - 0) / 2) * (128-(96)));
            yy = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 2) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 7) {
            xx = 128 + (((tickAnim - 2) / 5) * (84-(128)));
            yy = 0 + (((tickAnim - 2) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 2) / 5) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = 84 + (((tickAnim - 7) / 1) * (47.18908-(84)));
            yy = 0 + (((tickAnim - 7) / 1) * (-3.84329-(0)));
            zz = 0 + (((tickAnim - 7) / 1) * (1.81564-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 9) {
            xx = 47.18908 + (((tickAnim - 8) / 1) * (47.31605-(47.18908)));
            yy = -3.84329 + (((tickAnim - 8) / 1) * (-2.56219-(-3.84329)));
            zz = 1.81564 + (((tickAnim - 8) / 1) * (1.21043-(1.81564)));
        }
        else if (tickAnim >= 9 && tickAnim < 11) {
            xx = 47.31605 + (((tickAnim - 9) / 2) * (27.57-(47.31605)));
            yy = -2.56219 + (((tickAnim - 9) / 2) * (0-(-2.56219)));
            zz = 1.21043 + (((tickAnim - 9) / 2) * (0-(1.21043)));
        }
        else if (tickAnim >= 11 && tickAnim < 13) {
            xx = 27.57 + (((tickAnim - 11) / 2) * (96-(27.57)));
            yy = 0 + (((tickAnim - 11) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg4, rightLeg4.rotateAngleX + (float) Math.toRadians(xx), rightLeg4.rotateAngleY + (float) Math.toRadians(yy), rightLeg4.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 2) * (-0.775-(0)));
            zz = 0 + (((tickAnim - 0) / 2) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 2) / 3) * (0-(0)));
            yy = -0.775 + (((tickAnim - 2) / 3) * (0.06-(-0.775)));
            zz = 0 + (((tickAnim - 2) / 3) * (-0.15-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 5) / 2) * (0-(0)));
            yy = 0.06 + (((tickAnim - 5) / 2) * (0-(0.06)));
            zz = -0.15 + (((tickAnim - 5) / 2) * (0-(-0.15)));
        }
        else if (tickAnim >= 7 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 7) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 7) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 6) * (0-(0)));
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

    public void animWalking(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraScutellosaurus entity = (EntityPrehistoricFloraScutellosaurus) entitylivingbaseIn;
        int animCycle = 20;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        this.setRotateAngle(hip, hip.rotateAngleX + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*345/0.5+70))*-4), hip.rotateAngleY + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*345))*-2), hip.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*345))*-4));
        this.hip.rotationPointX = this.hip.rotationPointX + (float)(0);
        this.hip.rotationPointY = this.hip.rotationPointY - (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*345/0.5-50))*1);
        this.hip.rotationPointZ = this.hip.rotationPointZ + (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*345/0.5+100))*-1);


        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*345/0.5-40))*-4), body.rotateAngleY + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*345))*-1), body.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*345-50))*4));


        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*345/0.5-100))*-3), chest.rotateAngleY + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*345-50))*3), chest.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*345-50))*-4));


        this.setRotateAngle(leftArm, leftArm.rotateAngleX + (float) Math.toRadians(8.75-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*345/0.5-100))*7), leftArm.rotateAngleY + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*345-50))*-3), leftArm.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*345-50))*4));


        this.setRotateAngle(leftArm2, leftArm2.rotateAngleX + (float) Math.toRadians(-20-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*345/0.5-250))*5), leftArm2.rotateAngleY + (float) Math.toRadians(0), leftArm2.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*345-50))*4));


        this.setRotateAngle(leftArm3, leftArm3.rotateAngleX + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*345/0.5-350))*-5), leftArm3.rotateAngleY + (float) Math.toRadians(0), leftArm3.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(neck1, neck1.rotateAngleX + (float) Math.toRadians(-2.7-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*345/0.5-100))*-9), neck1.rotateAngleY + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*345-50))*3), neck1.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*345-50))*4));


        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(3-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*345/0.5-100))*5), neck2.rotateAngleY + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*345-100))*-3), neck2.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*345-50))*-4));


        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(-9-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*345/0.5-200))*-9), neck3.rotateAngleY + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*345-80))*-3), neck3.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(-4.5-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*345/0.5-180))*9), head.rotateAngleY + (float) Math.toRadians(0), head.rotateAngleZ + (float) Math.toRadians(0));



        if (tickAnim >= 0 && tickAnim < 12) {
            xx = -42 + (((tickAnim - 0) / 12) * (16.97423-(-42)));
            yy = 0 + (((tickAnim - 0) / 12) * (-0.94974-(0)));
            zz = 0 + (((tickAnim - 0) / 12) * (3.10828-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 21) {
            xx = 16.97423 + (((tickAnim - 12) / 9) * (-42-(16.97423)));
            yy = -0.94974 + (((tickAnim - 12) / 9) * (0-(-0.94974)));
            zz = 3.10828 + (((tickAnim - 12) / 9) * (0-(3.10828)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg, leftLeg.rotateAngleX + (float) Math.toRadians(xx), leftLeg.rotateAngleY + (float) Math.toRadians(yy), leftLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 0) / 12) * (20.25-(0)));
            yy = 0 + (((tickAnim - 0) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 12) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 14) {
            xx = 20.25 + (((tickAnim - 12) / 2) * (38.9-(20.25)));
            yy = 0 + (((tickAnim - 12) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 2) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 18) {
            xx = 38.9 + (((tickAnim - 14) / 4) * (7.59-(38.9)));
            yy = 0 + (((tickAnim - 14) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 4) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 21) {
            xx = 7.59 + (((tickAnim - 18) / 3) * (0-(7.59)));
            yy = 0 + (((tickAnim - 18) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg2, leftLeg2.rotateAngleX + (float) Math.toRadians(xx), leftLeg2.rotateAngleY + (float) Math.toRadians(yy), leftLeg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 3.04532 + (((tickAnim - 0) / 2) * (-0.17281-(3.04532)));
            yy = 0.90045 + (((tickAnim - 0) / 2) * (0.54027-(0.90045)));
            zz = 0.84343 + (((tickAnim - 0) / 2) * (0.50606-(0.84343)));
        }
        else if (tickAnim >= 2 && tickAnim < 4) {
            xx = -0.17281 + (((tickAnim - 2) / 2) * (20.25-(-0.17281)));
            yy = 0.54027 + (((tickAnim - 2) / 2) * (0-(0.54027)));
            zz = 0.50606 + (((tickAnim - 2) / 2) * (0-(0.50606)));
        }
        else if (tickAnim >= 4 && tickAnim < 11) {
            xx = 20.25 + (((tickAnim - 4) / 7) * (30-(20.25)));
            yy = 0 + (((tickAnim - 4) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 7) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 14) {
            xx = 30 + (((tickAnim - 11) / 3) * (-21.12-(30)));
            yy = 0 + (((tickAnim - 11) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 3) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 17) {
            xx = -21.12 + (((tickAnim - 14) / 3) * (-41.37-(-21.12)));
            yy = 0 + (((tickAnim - 14) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 3) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 18) {
            xx = -41.37 + (((tickAnim - 17) / 1) * (-37.82-(-41.37)));
            yy = 0 + (((tickAnim - 17) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 17) / 1) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 19) {
            xx = -37.82 + (((tickAnim - 18) / 1) * (-37.82-(-37.82)));
            yy = 0 + (((tickAnim - 18) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 1) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 21) {
            xx = -37.82 + (((tickAnim - 19) / 2) * (3.04532-(-37.82)));
            yy = 0 + (((tickAnim - 19) / 2) * (0.90045-(0)));
            zz = 0 + (((tickAnim - 19) / 2) * (0.84343-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg3, leftLeg3.rotateAngleX + (float) Math.toRadians(xx), leftLeg3.rotateAngleY + (float) Math.toRadians(yy), leftLeg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 4) * (-0.125-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (-0.05-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 4) / 7) * (0-(0)));
            yy = -0.125 + (((tickAnim - 4) / 7) * (0-(-0.125)));
            zz = -0.05 + (((tickAnim - 4) / 7) * (0-(-0.05)));
        }
        else if (tickAnim >= 11 && tickAnim < 17) {
            xx = 0 + (((tickAnim - 11) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 11) / 6) * (-0.75-(0)));
            zz = 0 + (((tickAnim - 11) / 6) * (-0.225-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 17) / 1) * (0-(0)));
            yy = -0.75 + (((tickAnim - 17) / 1) * (-0.525-(-0.75)));
            zz = -0.225 + (((tickAnim - 17) / 1) * (0-(-0.225)));
        }
        else if (tickAnim >= 18 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 18) / 1) * (0-(0)));
            yy = -0.525 + (((tickAnim - 18) / 1) * (-0.525-(-0.525)));
            zz = 0 + (((tickAnim - 18) / 1) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 21) {
            xx = 0 + (((tickAnim - 19) / 2) * (0-(0)));
            yy = -0.525 + (((tickAnim - 19) / 2) * (0-(-0.525)));
            zz = 0 + (((tickAnim - 19) / 2) * (0-(0)));
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
            xx = 36 + (((tickAnim - 0) / 2) * (27.4-(36)));
            yy = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 2) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 4) {
            xx = 27.4 + (((tickAnim - 2) / 2) * (-5.93205-(27.4)));
            yy = 0 + (((tickAnim - 2) / 2) * (-1.10618-(0)));
            zz = 0 + (((tickAnim - 2) / 2) * (5.38795-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 6) {
            xx = -5.93205 + (((tickAnim - 4) / 2) * (-14.2642-(-5.93205)));
            yy = -1.10618 + (((tickAnim - 4) / 2) * (0.56574-(-1.10618)));
            zz = 5.38795 + (((tickAnim - 4) / 2) * (3.20043-(5.38795)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = -14.2642 + (((tickAnim - 6) / 2) * (-10.55-(-14.2642)));
            yy = 0.56574 + (((tickAnim - 6) / 2) * (0-(0.56574)));
            zz = 3.20043 + (((tickAnim - 6) / 2) * (0-(3.20043)));
        }
        else if (tickAnim >= 8 && tickAnim < 11) {
            xx = -10.55 + (((tickAnim - 8) / 3) * (54-(-10.55)));
            yy = 0 + (((tickAnim - 8) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 3) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 13) {
            xx = 54 + (((tickAnim - 11) / 2) * (99.25-(54)));
            yy = 0 + (((tickAnim - 11) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 2) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 17) {
            xx = 99.25 + (((tickAnim - 13) / 4) * (99.25-(99.25)));
            yy = 0 + (((tickAnim - 13) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 4) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 21) {
            xx = 99.25 + (((tickAnim - 17) / 4) * (36-(99.25)));
            yy = 0 + (((tickAnim - 17) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 17) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg4, leftLeg4.rotateAngleX + (float) Math.toRadians(xx), leftLeg4.rotateAngleY + (float) Math.toRadians(yy), leftLeg4.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            yy = 0.35 + (((tickAnim - 0) / 2) * (-0.52-(0.35)));
            zz = 0 + (((tickAnim - 0) / 2) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 2) / 2) * (0-(0)));
            yy = -0.52 + (((tickAnim - 2) / 2) * (-0.6-(-0.52)));
            zz = 0 + (((tickAnim - 2) / 2) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 4) / 4) * (0-(0)));
            yy = -0.6 + (((tickAnim - 4) / 4) * (0-(-0.6)));
            zz = 0 + (((tickAnim - 4) / 4) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 21) {
            xx = 0 + (((tickAnim - 8) / 13) * (0-(0)));
            yy = 0 + (((tickAnim - 8) / 13) * (0.35-(0)));
            zz = 0 + (((tickAnim - 8) / 13) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftLeg4.rotationPointX = this.leftLeg4.rotationPointX + (float)(xx);
        this.leftLeg4.rotationPointY = this.leftLeg4.rotationPointY - (float)(yy);
        this.leftLeg4.rotationPointZ = this.leftLeg4.rotationPointZ + (float)(zz);



        this.setRotateAngle(tail1, tail1.rotateAngleX + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*345/0.5-50))*-4), tail1.rotateAngleY + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*345))*-4), tail1.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*345))*-4));


        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*345/0.5-100))*-4), tail2.rotateAngleY + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*345-50))*-4), tail2.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*345-50))*-4));


        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*345/0.5-500))*-4), tail3.rotateAngleY + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*345-100))*-4), tail3.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*345-100))*-4));


        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*345/0.5))*4), tail4.rotateAngleY + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*345-150))*-4), tail4.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*345-150))*-4));


        this.setRotateAngle(rightArm, rightArm.rotateAngleX + (float) Math.toRadians(8.75-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*345/0.5-100))*7), rightArm.rotateAngleY + (float) Math.toRadians(-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*345-50))*-3), rightArm.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*345-50))*4));


        this.setRotateAngle(rightArm2, rightArm2.rotateAngleX + (float) Math.toRadians(-20-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*345/0.5-250))*5), rightArm2.rotateAngleY + (float) Math.toRadians(0), rightArm2.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*345-50))*4));


        this.setRotateAngle(rightArm3, rightArm3.rotateAngleX + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*345/0.5-350))*-5), rightArm3.rotateAngleY + (float) Math.toRadians(0), rightArm3.rotateAngleZ + (float) Math.toRadians(0));



        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 16.93902 + (((tickAnim - 0) / 10) * (-42-(16.93902)));
            yy = 1.46016 + (((tickAnim - 0) / 10) * (0-(1.46016)));
            zz = -4.78256 + (((tickAnim - 0) / 10) * (0-(-4.78256)));
        }
        else if (tickAnim >= 10 && tickAnim < 21) {
            xx = -42 + (((tickAnim - 10) / 11) * (16.93902-(-42)));
            yy = 0 + (((tickAnim - 10) / 11) * (1.46016-(0)));
            zz = 0 + (((tickAnim - 10) / 11) * (-4.78256-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg, rightLeg.rotateAngleX + (float) Math.toRadians(xx), rightLeg.rotateAngleY + (float) Math.toRadians(yy), rightLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 20.25 + (((tickAnim - 0) / 3) * (38.9-(20.25)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 8) {
            xx = 38.9 + (((tickAnim - 3) / 5) * (7.59-(38.9)));
            yy = 0 + (((tickAnim - 3) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 5) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 7.59 + (((tickAnim - 8) / 2) * (0-(7.59)));
            yy = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 2) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 21) {
            xx = 0 + (((tickAnim - 10) / 11) * (20.25-(0)));
            yy = 0 + (((tickAnim - 10) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 11) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg2, rightLeg2.rotateAngleX + (float) Math.toRadians(xx), rightLeg2.rotateAngleY + (float) Math.toRadians(yy), rightLeg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 30 + (((tickAnim - 0) / 3) * (-21.12-(30)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 6) {
            xx = -21.12 + (((tickAnim - 3) / 3) * (-41.37-(-21.12)));
            yy = 0 + (((tickAnim - 3) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 3) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = -41.37 + (((tickAnim - 6) / 2) * (-37.82-(-41.37)));
            yy = 0 + (((tickAnim - 6) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 2) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 8) {
            xx = -37.82 + (((tickAnim - 8) / 0) * (-37.82-(-37.82)));
            yy = 0 + (((tickAnim - 8) / 0) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 0) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = -37.82 + (((tickAnim - 8) / 2) * (3.04532-(-37.82)));
            yy = 0 + (((tickAnim - 8) / 2) * (0.90045-(0)));
            zz = 0 + (((tickAnim - 8) / 2) * (0.84343-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 12) {
            xx = 3.04532 + (((tickAnim - 10) / 2) * (-0.17281-(3.04532)));
            yy = 0.90045 + (((tickAnim - 10) / 2) * (0.54027-(0.90045)));
            zz = 0.84343 + (((tickAnim - 10) / 2) * (0.50606-(0.84343)));
        }
        else if (tickAnim >= 12 && tickAnim < 14) {
            xx = -0.17281 + (((tickAnim - 12) / 2) * (20.25-(-0.17281)));
            yy = 0.54027 + (((tickAnim - 12) / 2) * (0-(0.54027)));
            zz = 0.50606 + (((tickAnim - 12) / 2) * (0-(0.50606)));
        }
        else if (tickAnim >= 14 && tickAnim < 21) {
            xx = 20.25 + (((tickAnim - 14) / 7) * (30-(20.25)));
            yy = 0 + (((tickAnim - 14) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg3, rightLeg3.rotateAngleX + (float) Math.toRadians(xx), rightLeg3.rotateAngleY + (float) Math.toRadians(yy), rightLeg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 6) * (-0.75-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (-0.225-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 6) / 2) * (0-(0)));
            yy = -0.75 + (((tickAnim - 6) / 2) * (-0.525-(-0.75)));
            zz = -0.225 + (((tickAnim - 6) / 2) * (0-(-0.225)));
        }
        else if (tickAnim >= 8 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 8) / 0) * (0-(0)));
            yy = -0.525 + (((tickAnim - 8) / 0) * (-0.525-(-0.525)));
            zz = 0 + (((tickAnim - 8) / 0) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            yy = -0.525 + (((tickAnim - 8) / 2) * (0-(-0.525)));
            zz = 0 + (((tickAnim - 8) / 2) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 10) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 4) * (-0.125-(0)));
            zz = 0 + (((tickAnim - 10) / 4) * (-0.05-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 21) {
            xx = 0 + (((tickAnim - 14) / 7) * (0-(0)));
            yy = -0.125 + (((tickAnim - 14) / 7) * (0-(-0.125)));
            zz = -0.05 + (((tickAnim - 14) / 7) * (0-(-0.05)));
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
            xx = 54 + (((tickAnim - 0) / 3) * (99.25-(54)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 6) {
            xx = 99.25 + (((tickAnim - 3) / 3) * (99.25-(99.25)));
            yy = 0 + (((tickAnim - 3) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 3) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 10) {
            xx = 99.25 + (((tickAnim - 6) / 4) * (36-(99.25)));
            yy = 0 + (((tickAnim - 6) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 4) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 12) {
            xx = 36 + (((tickAnim - 10) / 2) * (27.4-(36)));
            yy = 0 + (((tickAnim - 10) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 2) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 14) {
            xx = 27.4 + (((tickAnim - 12) / 2) * (-5.93205-(27.4)));
            yy = 0 + (((tickAnim - 12) / 2) * (1.10618-(0)));
            zz = 0 + (((tickAnim - 12) / 2) * (-5.38795-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 16) {
            xx = -5.93205 + (((tickAnim - 14) / 2) * (-10.55-(-5.93205)));
            yy = 1.10618 + (((tickAnim - 14) / 2) * (0-(1.10618)));
            zz = -5.38795 + (((tickAnim - 14) / 2) * (0-(-5.38795)));
        }
        else if (tickAnim >= 16 && tickAnim < 21) {
            xx = -10.55 + (((tickAnim - 16) / 5) * (54-(-10.55)));
            yy = 0 + (((tickAnim - 16) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 16) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg4, rightLeg4.rotateAngleX + (float) Math.toRadians(xx), rightLeg4.rotateAngleY + (float) Math.toRadians(yy), rightLeg4.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0.5-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 10) / 2) * (0-(0)));
            yy = 0.5 + (((tickAnim - 10) / 2) * (-0.37-(0.5)));
            zz = 0 + (((tickAnim - 10) / 2) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 12) / 2) * (0-(0)));
            yy = -0.37 + (((tickAnim - 12) / 2) * (-0.45-(-0.37)));
            zz = 0 + (((tickAnim - 12) / 2) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 16) {
            xx = 0 + (((tickAnim - 14) / 2) * (0-(0)));
            yy = -0.45 + (((tickAnim - 14) / 2) * (-0.325-(-0.45)));
            zz = 0 + (((tickAnim - 14) / 2) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 16) / 2) * (0-(0)));
            yy = -0.325 + (((tickAnim - 16) / 2) * (0-(-0.325)));
            zz = 0 + (((tickAnim - 16) / 2) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 21) {
            xx = 0 + (((tickAnim - 18) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 18) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 3) * (0-(0)));
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

    public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        EntityPrehistoricFloraScutellosaurus e = (EntityPrehistoricFloraScutellosaurus) entity;
        animator.update(entity);

//        animator.setAnimation(e.EAT_ANIMATION); //10 ticks
//        animator.startKeyframe(4);
//        animator.rotate(this.upperbody2, (float) Math.toRadians(10), (float) Math.toRadians(0), (float) Math.toRadians(0));
//        animator.rotate(this.upperbody, (float) Math.toRadians(7.5), (float) Math.toRadians(0), (float) Math.toRadians(0));
//        animator.rotate(this.neck, (float) Math.toRadians(30), (float) Math.toRadians(0), (float) Math.toRadians(0));
//        animator.rotate(this.head, (float) Math.toRadians(15), (float) Math.toRadians(0), (float) Math.toRadians(0));
//        animator.rotate(this.jaw, (float) Math.toRadians(25), (float) Math.toRadians(0), (float) Math.toRadians(0));
//        animator.endKeyframe();
//        animator.setStaticKeyframe(3);
//        animator.resetKeyframe(3);

    }
}
