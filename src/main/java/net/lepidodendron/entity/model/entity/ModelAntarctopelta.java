package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.EntityPrehistoricFloraAntarctopelta;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;

public class ModelAntarctopelta extends ModelBasePalaeopedia {
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
    private final AdvancedModelRenderer body1;
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
    private final AdvancedModelRenderer body2;
    private final AdvancedModelRenderer cube_r25;
    private final AdvancedModelRenderer cube_r26;
    private final AdvancedModelRenderer cube_r27;
    private final AdvancedModelRenderer cube_r28;
    private final AdvancedModelRenderer cube_r29;
    private final AdvancedModelRenderer cube_r30;
    private final AdvancedModelRenderer cube_r31;
    private final AdvancedModelRenderer cube_r32;
    private final AdvancedModelRenderer chest;
    private final AdvancedModelRenderer cube_r33;
    private final AdvancedModelRenderer cube_r34;
    private final AdvancedModelRenderer neck1;
    private final AdvancedModelRenderer cube_r35;
    private final AdvancedModelRenderer neck2;
    private final AdvancedModelRenderer cube_r36;
    private final AdvancedModelRenderer cube_r37;
    private final AdvancedModelRenderer head;
    private final AdvancedModelRenderer cube_r38;
    private final AdvancedModelRenderer cube_r39;
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
    private final AdvancedModelRenderer cube_r50;
    private final AdvancedModelRenderer cube_r51;
    private final AdvancedModelRenderer cube_r52;
    private final AdvancedModelRenderer cube_r53;
    private final AdvancedModelRenderer cube_r54;
    private final AdvancedModelRenderer cube_r55;
    private final AdvancedModelRenderer jaw;
    private final AdvancedModelRenderer cube_r56;
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
    private final AdvancedModelRenderer eyes;
    private final AdvancedModelRenderer cube_r71;
    private final AdvancedModelRenderer cube_r72;
    private final AdvancedModelRenderer rightArm;
    private final AdvancedModelRenderer cube_r73;
    private final AdvancedModelRenderer cube_r74;
    private final AdvancedModelRenderer rightArm10;
    private final AdvancedModelRenderer rightArm11;
    private final AdvancedModelRenderer leftArm;
    private final AdvancedModelRenderer cube_r75;
    private final AdvancedModelRenderer cube_r76;
    private final AdvancedModelRenderer leftArm2;
    private final AdvancedModelRenderer leftArm3;
    private final AdvancedModelRenderer tail1;
    private final AdvancedModelRenderer cube_r77;
    private final AdvancedModelRenderer cube_r78;
    private final AdvancedModelRenderer cube_r79;
    private final AdvancedModelRenderer cube_r80;
    private final AdvancedModelRenderer tail2;
    private final AdvancedModelRenderer cube_r81;
    private final AdvancedModelRenderer cube_r82;
    private final AdvancedModelRenderer cube_r83;
    private final AdvancedModelRenderer cube_r84;
    private final AdvancedModelRenderer tail3;
    private final AdvancedModelRenderer cube_r85;
    private final AdvancedModelRenderer cube_r86;
    private final AdvancedModelRenderer cube_r87;
    private final AdvancedModelRenderer cube_r88;
    private final AdvancedModelRenderer tail4;
    private final AdvancedModelRenderer cube_r89;
    private final AdvancedModelRenderer cube_r90;
    private final AdvancedModelRenderer cube_r91;
    private final AdvancedModelRenderer cube_r92;
    private final AdvancedModelRenderer cube_r93;
    private final AdvancedModelRenderer cube_r94;
    private final AdvancedModelRenderer cube_r95;
    private final AdvancedModelRenderer cube_r96;
    private final AdvancedModelRenderer cube_r97;
    private final AdvancedModelRenderer cube_r98;
    private final AdvancedModelRenderer cube_r99;
    private final AdvancedModelRenderer cube_r100;
    private final AdvancedModelRenderer cube_r101;
    private final AdvancedModelRenderer leftLeg1;
    private final AdvancedModelRenderer leftLeg2;
    private final AdvancedModelRenderer leftLeg3;
    private final AdvancedModelRenderer leftLeg4;
    private final AdvancedModelRenderer rightLeg9;
    private final AdvancedModelRenderer rightLeg10;
    private final AdvancedModelRenderer rightLeg11;
    private final AdvancedModelRenderer rightLeg12;

    private ModelAnimator animator;

    public ModelAntarctopelta() {
        this.textureWidth = 93;
        this.textureHeight = 93;

        this.hip = new AdvancedModelRenderer(this);
        this.hip.setRotationPoint(0.0F, 7.5386F, 7.1836F);


        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(3.6299F, -0.55F, 6.8F);
        this.hip.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.1571F, -0.2618F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 70, 85, 0.0F, -2.0F, -1.0F, 1, 1, 2, 0.0F, true));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(7.8049F, 2.325F, 1.9F);
        this.hip.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.3491F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 18, 86, -1.0F, -1.0F, 0.0F, 1, 1, 1, 0.0F, true));
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 18, 86, -15.6097F, -1.0F, 0.0F, 1, 1, 1, 0.0F, false));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(6.0799F, -0.9F, 1.7F);
        this.hip.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.1869F, 0.0869F, 0.5461F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 12, 83, 0.0F, -2.0F, -1.0F, 1, 1, 2, 0.0F, true));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(4.8049F, -1.225F, 1.725F);
        this.hip.addChild(cube_r4);
        this.setRotateAngle(cube_r4, -0.1396F, -0.1134F, 0.8767F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 6, 85, -1.0F, -2.0F, 0.0F, 1, 1, 2, 0.0F, true));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(-3.6299F, -0.55F, 6.8F);
        this.hip.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.1571F, 0.2618F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 70, 85, -1.0F, -2.0F, -1.0F, 1, 1, 2, 0.0F, false));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(-6.0799F, -0.9F, 1.7F);
        this.hip.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.1869F, -0.0869F, -0.5461F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 12, 83, -1.0F, -2.0F, -1.0F, 1, 1, 2, 0.0F, false));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(-4.8049F, -1.225F, 1.725F);
        this.hip.addChild(cube_r7);
        this.setRotateAngle(cube_r7, -0.1396F, 0.1134F, -0.8767F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 6, 85, 0.0F, -2.0F, 0.0F, 1, 1, 2, 0.0F, false));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(0.0F, 1.125F, 0.325F);
        this.hip.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.0698F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 0, 39, -6.5F, 2.0F, -1.0F, 13, 5, 9, 0.0F, false));

        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(0.0F, 0.45F, 0.0F);
        this.hip.addChild(cube_r9);
        this.setRotateAngle(cube_r9, -0.1833F, 0.0F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 0, 22, -7.5F, -3.6391F, -1.0155F, 15, 7, 10, 0.0F, false));

        this.body1 = new AdvancedModelRenderer(this);
        this.body1.setRotationPoint(0.0F, -3.375F, -0.275F);
        this.hip.addChild(body1);


        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(5.2799F, 1.725F, -2.0F);
        this.body1.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 0.026F, -0.214F, 0.8283F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 86, 14, -1.0F, -2.0F, 0.0F, 1, 1, 2, 0.0F, true));

        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(8.2299F, 8.5F, -9.075F);
        this.body1.addChild(cube_r11);
        this.setRotateAngle(cube_r11, -0.0654F, 0.0F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 54, 86, -1.0F, -1.0F, 0.0F, 1, 1, 1, 0.0F, true));
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 54, 86, -16.4597F, -1.0F, 0.0F, 1, 1, 1, 0.0F, false));

        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(8.2299F, 8.425F, -6.225F);
        this.body1.addChild(cube_r12);
        this.setRotateAngle(cube_r12, 0.1658F, 0.0F, 0.0F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 86, 19, -1.0F, -1.0F, 0.0F, 1, 1, 1, 0.0F, true));
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 86, 19, -16.4597F, -1.0F, 0.0F, 1, 1, 1, 0.0F, false));

        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(8.2299F, 7.775F, -3.05F);
        this.body1.addChild(cube_r13);
        this.setRotateAngle(cube_r13, 0.3709F, 0.0F, 0.0F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 16, 68, -1.0F, -1.0F, 0.0F, 1, 1, 1, 0.0F, true));
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 16, 68, -16.4597F, -1.0F, 0.0F, 1, 1, 1, 0.0F, false));

        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(8.2299F, 6.85F, -0.725F);
        this.body1.addChild(cube_r14);
        this.setRotateAngle(cube_r14, 0.4712F, 0.0F, 0.0F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 24, 85, -1.0F, -1.0F, 0.0F, 1, 1, 1, 0.0F, true));
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 24, 85, -16.4597F, -1.0F, 0.0F, 1, 1, 1, 0.0F, false));

        this.cube_r15 = new AdvancedModelRenderer(this);
        this.cube_r15.setRotationPoint(6.4799F, 2.85F, -2.55F);
        this.body1.addChild(cube_r15);
        this.setRotateAngle(cube_r15, 0.1707F, 0.045F, 0.6952F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 82, 83, 0.0F, -2.0F, -1.0F, 1, 1, 2, 0.0F, true));

        this.cube_r16 = new AdvancedModelRenderer(this);
        this.cube_r16.setRotationPoint(6.4799F, 3.625F, -6.15F);
        this.body1.addChild(cube_r16);
        this.setRotateAngle(cube_r16, 0.258F, 0.045F, 0.6952F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 36, 85, 0.0F, -2.0F, -1.0F, 1, 1, 2, 0.0F, true));

        this.cube_r17 = new AdvancedModelRenderer(this);
        this.cube_r17.setRotationPoint(5.1049F, 2.175F, -5.1F);
        this.body1.addChild(cube_r17);
        this.setRotateAngle(cube_r17, 0.2118F, -0.1202F, 0.7753F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 0, 85, -1.0F, -2.0F, 0.0F, 1, 1, 2, 0.0F, true));

        this.cube_r18 = new AdvancedModelRenderer(this);
        this.cube_r18.setRotationPoint(4.3799F, 2.575F, -8.575F);
        this.body1.addChild(cube_r18);
        this.setRotateAngle(cube_r18, 0.2029F, -0.0588F, 0.8272F);
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 82, 62, -1.0F, -2.0F, 0.0F, 1, 2, 2, 0.0F, true));

        this.cube_r19 = new AdvancedModelRenderer(this);
        this.cube_r19.setRotationPoint(-6.4799F, 2.85F, -2.55F);
        this.body1.addChild(cube_r19);
        this.setRotateAngle(cube_r19, 0.1707F, -0.045F, -0.6952F);
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 82, 83, -1.0F, -2.0F, -1.0F, 1, 1, 2, 0.0F, false));

        this.cube_r20 = new AdvancedModelRenderer(this);
        this.cube_r20.setRotationPoint(-6.4799F, 3.625F, -6.15F);
        this.body1.addChild(cube_r20);
        this.setRotateAngle(cube_r20, 0.258F, -0.045F, -0.6952F);
        this.cube_r20.cubeList.add(new ModelBox(cube_r20, 36, 85, -1.0F, -2.0F, -1.0F, 1, 1, 2, 0.0F, false));

        this.cube_r21 = new AdvancedModelRenderer(this);
        this.cube_r21.setRotationPoint(-5.2799F, 1.725F, -2.0F);
        this.body1.addChild(cube_r21);
        this.setRotateAngle(cube_r21, 0.026F, 0.214F, -0.8283F);
        this.cube_r21.cubeList.add(new ModelBox(cube_r21, 86, 14, 0.0F, -2.0F, 0.0F, 1, 1, 2, 0.0F, false));

        this.cube_r22 = new AdvancedModelRenderer(this);
        this.cube_r22.setRotationPoint(-5.1049F, 2.175F, -5.1F);
        this.body1.addChild(cube_r22);
        this.setRotateAngle(cube_r22, 0.2118F, 0.1202F, -0.7753F);
        this.cube_r22.cubeList.add(new ModelBox(cube_r22, 0, 85, 0.0F, -2.0F, 0.0F, 1, 1, 2, 0.0F, false));

        this.cube_r23 = new AdvancedModelRenderer(this);
        this.cube_r23.setRotationPoint(-4.3799F, 2.575F, -8.575F);
        this.body1.addChild(cube_r23);
        this.setRotateAngle(cube_r23, 0.2029F, 0.0588F, -0.8272F);
        this.cube_r23.cubeList.add(new ModelBox(cube_r23, 82, 62, 0.0F, -2.0F, 0.0F, 1, 2, 2, 0.0F, false));

        this.cube_r24 = new AdvancedModelRenderer(this);
        this.cube_r24.setRotationPoint(0.0F, 4.25F, -7.525F);
        this.body1.addChild(cube_r24);
        this.setRotateAngle(cube_r24, 0.1134F, 0.0F, 0.0F);
        this.cube_r24.cubeList.add(new ModelBox(cube_r24, 0, 0, -8.0F, -3.3899F, -2.0266F, 16, 12, 10, 0.0F, false));

        this.body2 = new AdvancedModelRenderer(this);
        this.body2.setRotationPoint(0.0F, 3.375F, -9.725F);
        this.body1.addChild(body2);
        this.setRotateAngle(body2, 0.3927F, 0.0F, 0.0F);
        this.body2.cubeList.add(new ModelBox(body2, 44, 39, -6.5F, -2.0F, -5.0F, 13, 10, 6, 0.0F, false));

        this.cube_r25 = new AdvancedModelRenderer(this);
        this.cube_r25.setRotationPoint(4.6799F, 1.85F, -4.225F);
        this.body2.addChild(cube_r25);
        this.setRotateAngle(cube_r25, 0.2152F, 0.3147F, 0.6737F);
        this.cube_r25.cubeList.add(new ModelBox(cube_r25, 28, 78, 0.0F, -2.0F, 0.0F, 1, 1, 1, 0.0F, true));

        this.cube_r26 = new AdvancedModelRenderer(this);
        this.cube_r26.setRotationPoint(5.0049F, 1.925F, -0.425F);
        this.body2.addChild(cube_r26);
        this.setRotateAngle(cube_r26, 0.1637F, 0.2088F, 0.6556F);
        this.cube_r26.cubeList.add(new ModelBox(cube_r26, 76, 83, 0.0F, -2.0F, -1.0F, 1, 1, 2, 0.0F, true));

        this.cube_r27 = new AdvancedModelRenderer(this);
        this.cube_r27.setRotationPoint(3.7799F, -0.375F, -1.675F);
        this.body2.addChild(cube_r27);
        this.setRotateAngle(cube_r27, 0.2475F, 0.013F, 0.8179F);
        this.cube_r27.cubeList.add(new ModelBox(cube_r27, 18, 83, -1.0F, -2.0F, 0.0F, 1, 1, 2, 0.0F, true));

        this.cube_r28 = new AdvancedModelRenderer(this);
        this.cube_r28.setRotationPoint(3.3799F, -0.075F, -4.425F);
        this.body2.addChild(cube_r28);
        this.setRotateAngle(cube_r28, 0.219F, 0.0852F, 0.0189F);
        this.cube_r28.cubeList.add(new ModelBox(cube_r28, 84, 59, 0.0F, -2.0F, 0.0F, 1, 1, 2, 0.0F, true));

        this.cube_r29 = new AdvancedModelRenderer(this);
        this.cube_r29.setRotationPoint(-4.6799F, 1.85F, -4.225F);
        this.body2.addChild(cube_r29);
        this.setRotateAngle(cube_r29, 0.2152F, -0.3147F, -0.6737F);
        this.cube_r29.cubeList.add(new ModelBox(cube_r29, 28, 78, -1.0F, -2.0F, 0.0F, 1, 1, 1, 0.0F, false));

        this.cube_r30 = new AdvancedModelRenderer(this);
        this.cube_r30.setRotationPoint(-5.0049F, 1.925F, -0.425F);
        this.body2.addChild(cube_r30);
        this.setRotateAngle(cube_r30, 0.1637F, -0.2088F, -0.6556F);
        this.cube_r30.cubeList.add(new ModelBox(cube_r30, 76, 83, -1.0F, -2.0F, -1.0F, 1, 1, 2, 0.0F, false));

        this.cube_r31 = new AdvancedModelRenderer(this);
        this.cube_r31.setRotationPoint(-3.7799F, -0.375F, -1.675F);
        this.body2.addChild(cube_r31);
        this.setRotateAngle(cube_r31, 0.2475F, -0.013F, -0.8179F);
        this.cube_r31.cubeList.add(new ModelBox(cube_r31, 18, 83, 0.0F, -2.0F, 0.0F, 1, 1, 2, 0.0F, false));

        this.cube_r32 = new AdvancedModelRenderer(this);
        this.cube_r32.setRotationPoint(-3.3799F, -0.075F, -4.425F);
        this.body2.addChild(cube_r32);
        this.setRotateAngle(cube_r32, 0.219F, -0.0852F, -0.0189F);
        this.cube_r32.cubeList.add(new ModelBox(cube_r32, 84, 59, -1.0F, -2.0F, 0.0F, 1, 1, 2, 0.0F, false));

        this.chest = new AdvancedModelRenderer(this);
        this.chest.setRotationPoint(0.0F, -1.6F, -2.975F);
        this.body2.addChild(chest);
        this.setRotateAngle(chest, -0.1353F, 0.0F, 0.0F);
        this.chest.cubeList.add(new ModelBox(chest, 52, 0, -5.6314F, 0.0041F, -5.0801F, 11, 7, 4, 0.0F, false));

        this.cube_r33 = new AdvancedModelRenderer(this);
        this.cube_r33.setRotationPoint(2.5985F, 2.0171F, -4.2455F);
        this.chest.addChild(cube_r33);
        this.setRotateAngle(cube_r33, 0.2182F, 0.0F, 0.0F);
        this.cube_r33.cubeList.add(new ModelBox(cube_r33, 84, 56, 0.0F, -2.0F, 0.0F, 1, 1, 2, 0.0F, true));
        this.cube_r33.cubeList.add(new ModelBox(cube_r33, 84, 56, -6.4597F, -2.0F, 0.0F, 1, 1, 2, 0.0F, false));

        this.cube_r34 = new AdvancedModelRenderer(this);
        this.cube_r34.setRotationPoint(-0.1313F, 7.5378F, -4.0447F);
        this.chest.addChild(cube_r34);
        this.setRotateAngle(cube_r34, -0.4974F, 0.0F, 0.0F);
        this.cube_r34.cubeList.add(new ModelBox(cube_r34, 20, 55, -4.0F, -2.0F, -1.0F, 8, 2, 5, 0.0F, true));

        this.neck1 = new AdvancedModelRenderer(this);
        this.neck1.setRotationPoint(-0.1313F, 2.0378F, -4.0447F);
        this.chest.addChild(neck1);
        this.setRotateAngle(neck1, -0.48F, 0.0F, 0.0F);
        this.neck1.cubeList.add(new ModelBox(neck1, 52, 11, -3.5F, -1.7271F, -3.6227F, 7, 5, 5, 0.0F, false));

        this.cube_r35 = new AdvancedModelRenderer(this);
        this.cube_r35.setRotationPoint(1.7299F, 0.05F, -2.1F);
        this.neck1.addChild(cube_r35);
        this.setRotateAngle(cube_r35, 0.2705F, 0.0F, 0.0F);
        this.cube_r35.cubeList.add(new ModelBox(cube_r35, 84, 53, 0.0F, -2.0F, -1.0F, 1, 1, 2, 0.0F, true));
        this.cube_r35.cubeList.add(new ModelBox(cube_r35, 84, 53, -4.4597F, -2.0F, -1.0F, 1, 1, 2, 0.0F, false));

        this.neck2 = new AdvancedModelRenderer(this);
        this.neck2.setRotationPoint(0.0F, 0.1F, -3.5F);
        this.neck1.addChild(neck2);
        this.setRotateAngle(neck2, -0.0524F, 0.0F, 0.0F);
        this.neck2.cubeList.add(new ModelBox(neck2, 60, 66, -2.5F, -1.6F, -4.5F, 5, 4, 5, 0.0F, false));

        this.cube_r36 = new AdvancedModelRenderer(this);
        this.cube_r36.setRotationPoint(0.9799F, 0.525F, -1.925F);
        this.neck2.addChild(cube_r36);
        this.setRotateAngle(cube_r36, 0.4276F, 0.0F, 0.0F);
        this.cube_r36.cubeList.add(new ModelBox(cube_r36, 84, 30, 0.0F, -2.0F, 0.0F, 1, 1, 2, 0.0F, true));
        this.cube_r36.cubeList.add(new ModelBox(cube_r36, 84, 30, -2.9597F, -2.0F, 0.0F, 1, 1, 2, 0.0F, false));

        this.cube_r37 = new AdvancedModelRenderer(this);
        this.cube_r37.setRotationPoint(0.7299F, 0.625F, -3.775F);
        this.neck2.addChild(cube_r37);
        this.setRotateAngle(cube_r37, 0.3665F, 0.0F, 0.0F);
        this.cube_r37.cubeList.add(new ModelBox(cube_r37, 40, 53, 0.0F, -2.0F, 1.0F, 1, 1, 1, 0.0F, true));
        this.cube_r37.cubeList.add(new ModelBox(cube_r37, 40, 53, -2.4597F, -2.0F, 1.0F, 1, 1, 1, 0.0F, false));

        this.head = new AdvancedModelRenderer(this);
        this.head.setRotationPoint(0.0F, -0.175F, -3.65F);
        this.neck2.addChild(head);
        this.setRotateAngle(head, 0.3054F, 0.0F, 0.0F);


        this.cube_r38 = new AdvancedModelRenderer(this);
        this.cube_r38.setRotationPoint(0.1299F, 1.1986F, -3.9152F);
        this.head.addChild(cube_r38);
        this.setRotateAngle(cube_r38, 0.0998F, 0.4205F, 0.1201F);
        this.cube_r38.cubeList.add(new ModelBox(cube_r38, 82, 49, 1.0F, -1.0F, -1.0F, 0, 1, 3, 0.0F, true));

        this.cube_r39 = new AdvancedModelRenderer(this);
        this.cube_r39.setRotationPoint(1.9049F, -0.3264F, 0.5598F);
        this.head.addChild(cube_r39);
        this.setRotateAngle(cube_r39, 0.0779F, 0.2054F, 0.1912F);
        this.cube_r39.cubeList.add(new ModelBox(cube_r39, 82, 45, 0.0F, -2.0F, -2.0F, 1, 2, 2, 0.0F, true));

        this.cube_r40 = new AdvancedModelRenderer(this);
        this.cube_r40.setRotationPoint(1.4299F, 0.2736F, -2.4652F);
        this.head.addChild(cube_r40);
        this.setRotateAngle(cube_r40, 0.1653F, -0.0158F, 0.1463F);
        this.cube_r40.cubeList.add(new ModelBox(cube_r40, 82, 4, -1.0F, -2.0F, -1.0F, 2, 2, 2, 0.0F, true));

        this.cube_r41 = new AdvancedModelRenderer(this);
        this.cube_r41.setRotationPoint(0.9299F, 1.0736F, -3.8902F);
        this.head.addChild(cube_r41);
        this.setRotateAngle(cube_r41, 0.1036F, 0.4522F, 0.0252F);
        this.cube_r41.cubeList.add(new ModelBox(cube_r41, 56, 81, 0.0F, -2.0F, -2.0F, 1, 2, 3, 0.0F, true));

        this.cube_r42 = new AdvancedModelRenderer(this);
        this.cube_r42.setRotationPoint(0.9299F, 0.4986F, -3.9152F);
        this.head.addChild(cube_r42);
        this.setRotateAngle(cube_r42, 0.1833F, 0.3405F, 0.2317F);
        this.cube_r42.cubeList.add(new ModelBox(cube_r42, 84, 27, 0.0F, -2.0F, -1.0F, 1, 1, 2, 0.0F, true));

        this.cube_r43 = new AdvancedModelRenderer(this);
        this.cube_r43.setRotationPoint(-0.1299F, 1.1986F, -3.9152F);
        this.head.addChild(cube_r43);
        this.setRotateAngle(cube_r43, 0.0998F, -0.4205F, -0.1201F);
        this.cube_r43.cubeList.add(new ModelBox(cube_r43, 82, 49, -1.0F, -1.0F, -1.0F, 0, 1, 3, 0.0F, false));

        this.cube_r44 = new AdvancedModelRenderer(this);
        this.cube_r44.setRotationPoint(-0.9299F, 0.4986F, -3.9152F);
        this.head.addChild(cube_r44);
        this.setRotateAngle(cube_r44, 0.1833F, -0.3405F, -0.2317F);
        this.cube_r44.cubeList.add(new ModelBox(cube_r44, 84, 27, -1.0F, -2.0F, -1.0F, 1, 1, 2, 0.0F, false));

        this.cube_r45 = new AdvancedModelRenderer(this);
        this.cube_r45.setRotationPoint(-0.9299F, 1.0736F, -3.8902F);
        this.head.addChild(cube_r45);
        this.setRotateAngle(cube_r45, 0.1036F, -0.4522F, -0.0252F);
        this.cube_r45.cubeList.add(new ModelBox(cube_r45, 56, 81, -1.0F, -2.0F, -2.0F, 1, 2, 3, 0.0F, false));

        this.cube_r46 = new AdvancedModelRenderer(this);
        this.cube_r46.setRotationPoint(-1.4299F, 0.2736F, -2.4652F);
        this.head.addChild(cube_r46);
        this.setRotateAngle(cube_r46, 0.1653F, 0.0158F, -0.1463F);
        this.cube_r46.cubeList.add(new ModelBox(cube_r46, 82, 4, -1.0F, -2.0F, -1.0F, 2, 2, 2, 0.0F, false));

        this.cube_r47 = new AdvancedModelRenderer(this);
        this.cube_r47.setRotationPoint(-1.9049F, -0.3264F, 0.5598F);
        this.head.addChild(cube_r47);
        this.setRotateAngle(cube_r47, 0.0779F, -0.2054F, -0.1912F);
        this.cube_r47.cubeList.add(new ModelBox(cube_r47, 82, 45, -1.0F, -2.0F, -2.0F, 1, 2, 2, 0.0F, false));

        this.cube_r48 = new AdvancedModelRenderer(this);
        this.cube_r48.setRotationPoint(0.0F, 0.0986F, -2.3402F);
        this.head.addChild(cube_r48);
        this.setRotateAngle(cube_r48, 0.2007F, 0.0F, 0.0F);
        this.cube_r48.cubeList.add(new ModelBox(cube_r48, 80, 66, -2.0F, -2.0F, -1.0F, 4, 2, 2, 0.0F, false));

        this.cube_r49 = new AdvancedModelRenderer(this);
        this.cube_r49.setRotationPoint(0.0F, -0.5514F, -5.2152F);
        this.head.addChild(cube_r49);
        this.setRotateAngle(cube_r49, 0.4538F, 0.0F, 0.0F);
        this.cube_r49.cubeList.add(new ModelBox(cube_r49, 34, 53, -1.0F, -1.0F, -1.0F, 2, 1, 1, -0.001F, false));

        this.cube_r50 = new AdvancedModelRenderer(this);
        this.cube_r50.setRotationPoint(0.0F, -1.4764F, -5.9152F);
        this.head.addChild(cube_r50);
        this.setRotateAngle(cube_r50, 0.096F, 0.0F, 0.0F);
        this.cube_r50.cubeList.add(new ModelBox(cube_r50, 80, 35, -1.5F, 0.0174F, -0.0088F, 3, 1, 3, 0.0F, false));

        this.cube_r51 = new AdvancedModelRenderer(this);
        this.cube_r51.setRotationPoint(0.0F, 1.1736F, -6.1152F);
        this.head.addChild(cube_r51);
        this.setRotateAngle(cube_r51, -0.2705F, 0.0F, 0.0F);
        this.cube_r51.cubeList.add(new ModelBox(cube_r51, 84, 21, -1.0F, -2.0F, -1.0F, 2, 2, 1, 0.0F, false));

        this.cube_r52 = new AdvancedModelRenderer(this);
        this.cube_r52.setRotationPoint(0.0F, 0.8986F, -7.0652F);
        this.head.addChild(cube_r52);
        this.setRotateAngle(cube_r52, 0.3927F, 0.0F, 0.0F);
        this.cube_r52.cubeList.add(new ModelBox(cube_r52, 82, 42, -1.0F, 0.0F, -0.0106F, 2, 1, 2, 0.001F, false));

        this.cube_r53 = new AdvancedModelRenderer(this);
        this.cube_r53.setRotationPoint(0.0F, 1.0736F, -4.4152F);
        this.head.addChild(cube_r53);
        this.setRotateAngle(cube_r53, 0.0873F, 0.0F, 0.0F);
        this.cube_r53.cubeList.add(new ModelBox(cube_r53, 21, 88, -1.0F, -2.0F, -2.0F, 2, 2, 3, -0.001F, false));

        this.cube_r54 = new AdvancedModelRenderer(this);
        this.cube_r54.setRotationPoint(0.0F, 1.2236F, -4.4152F);
        this.head.addChild(cube_r54);
        this.setRotateAngle(cube_r54, 0.1571F, 0.0F, 0.0F);
        this.cube_r54.cubeList.add(new ModelBox(cube_r54, 68, 62, -2.5F, -2.0F, 1.0F, 5, 2, 2, 0.0F, false));

        this.cube_r55 = new AdvancedModelRenderer(this);
        this.cube_r55.setRotationPoint(0.0F, 0.1736F, -0.0152F);
        this.head.addChild(cube_r55);
        this.setRotateAngle(cube_r55, -0.1222F, 0.0F, 0.0F);
        this.cube_r55.cubeList.add(new ModelBox(cube_r55, 0, 76, -3.0F, -2.0F, -2.0F, 6, 3, 2, 0.001F, false));

        this.jaw = new AdvancedModelRenderer(this);
        this.jaw.setRotationPoint(0.0F, 0.8986F, -0.4152F);
        this.head.addChild(jaw);
        this.setRotateAngle(jaw, -0.1745F, 0.0F, 0.0F);


        this.cube_r56 = new AdvancedModelRenderer(this);
        this.cube_r56.setRotationPoint(0.1299F, 1.3F, -3.175F);
        this.jaw.addChild(cube_r56);
        this.setRotateAngle(cube_r56, 0.3224F, 0.4205F, 0.1201F);
        this.cube_r56.cubeList.add(new ModelBox(cube_r56, 40, 62, 1.0F, -1.0F, -1.0F, 0, 1, 3, 0.0F, true));

        this.cube_r57 = new AdvancedModelRenderer(this);
        this.cube_r57.setRotationPoint(2.0049F, 0.6F, -3.125F);
        this.jaw.addChild(cube_r57);
        this.setRotateAngle(cube_r57, -0.0099F, 0.3947F, -0.0093F);
        this.cube_r57.cubeList.add(new ModelBox(cube_r57, 22, 86, 0.0F, -2.0212F, -1.0196F, 0, 2, 1, 0.0F, true));

        this.cube_r58 = new AdvancedModelRenderer(this);
        this.cube_r58.setRotationPoint(0.6741F, 2.6274F, -3.4907F);
        this.jaw.addChild(cube_r58);
        this.setRotateAngle(cube_r58, 0.4164F, 0.4251F, 0.0589F);
        this.cube_r58.cubeList.add(new ModelBox(cube_r58, 82, 8, -1.0F, -2.0F, -1.0F, 2, 1, 2, 0.0F, true));

        this.cube_r59 = new AdvancedModelRenderer(this);
        this.cube_r59.setRotationPoint(1.3049F, 2.25F, -2.225F);
        this.jaw.addChild(cube_r59);
        this.setRotateAngle(cube_r59, 0.1579F, 0.4501F, 0.0608F);
        this.cube_r59.cubeList.add(new ModelBox(cube_r59, 86, 17, -1.0F, -2.0F, -1.0F, 2, 1, 1, 0.0F, true));

        this.cube_r60 = new AdvancedModelRenderer(this);
        this.cube_r60.setRotationPoint(-1.9799F, -0.0229F, -1.6738F);
        this.jaw.addChild(cube_r60);
        this.setRotateAngle(cube_r60, -0.3927F, 0.0F, 0.0F);
        this.cube_r60.cubeList.add(new ModelBox(cube_r60, 20, 53, -1.0201F, -1.0F, 0.0F, 6, 1, 1, -0.001F, false));

        this.cube_r61 = new AdvancedModelRenderer(this);
        this.cube_r61.setRotationPoint(-0.1299F, 1.3F, -3.175F);
        this.jaw.addChild(cube_r61);
        this.setRotateAngle(cube_r61, 0.3224F, -0.4205F, -0.1201F);
        this.cube_r61.cubeList.add(new ModelBox(cube_r61, 40, 62, -1.0F, -1.0F, -1.0F, 0, 1, 3, 0.0F, false));

        this.cube_r62 = new AdvancedModelRenderer(this);
        this.cube_r62.setRotationPoint(-2.0049F, 0.6F, -3.125F);
        this.jaw.addChild(cube_r62);
        this.setRotateAngle(cube_r62, -0.0099F, -0.3947F, 0.0093F);
        this.cube_r62.cubeList.add(new ModelBox(cube_r62, 22, 86, 0.0F, -2.0212F, -1.0196F, 0, 2, 1, 0.0F, false));

        this.cube_r63 = new AdvancedModelRenderer(this);
        this.cube_r63.setRotationPoint(0.0F, 0.4F, -2.15F);
        this.jaw.addChild(cube_r63);
        this.setRotateAngle(cube_r63, 0.0393F, 0.0F, 0.0F);
        this.cube_r63.cubeList.add(new ModelBox(cube_r63, 0, 81, -2.0F, -2.0F, -1.0F, 4, 2, 2, 0.0F, false));

        this.cube_r64 = new AdvancedModelRenderer(this);
        this.cube_r64.setRotationPoint(-0.6741F, 2.6274F, -3.4907F);
        this.jaw.addChild(cube_r64);
        this.setRotateAngle(cube_r64, 0.4164F, -0.4251F, -0.0589F);
        this.cube_r64.cubeList.add(new ModelBox(cube_r64, 82, 8, -1.0F, -2.0F, -1.0F, 2, 1, 2, 0.0F, false));

        this.cube_r65 = new AdvancedModelRenderer(this);
        this.cube_r65.setRotationPoint(-1.3049F, 2.25F, -2.225F);
        this.jaw.addChild(cube_r65);
        this.setRotateAngle(cube_r65, 0.1579F, -0.4501F, -0.0608F);
        this.cube_r65.cubeList.add(new ModelBox(cube_r65, 86, 17, -1.0F, -2.0F, -1.0F, 2, 1, 1, 0.0F, false));

        this.cube_r66 = new AdvancedModelRenderer(this);
        this.cube_r66.setRotationPoint(0.0F, 2.2F, -5.475F);
        this.jaw.addChild(cube_r66);
        this.setRotateAngle(cube_r66, -0.7723F, 0.0F, 0.0F);
        this.cube_r66.cubeList.add(new ModelBox(cube_r66, 84, 33, -1.0F, -0.9694F, -0.9837F, 2, 1, 1, 0.0F, false));

        this.cube_r67 = new AdvancedModelRenderer(this);
        this.cube_r67.setRotationPoint(0.0F, 2.2F, -4.5F);
        this.jaw.addChild(cube_r67);
        this.setRotateAngle(cube_r67, 0.0087F, 0.0F, 0.0F);
        this.cube_r67.cubeList.add(new ModelBox(cube_r67, 36, 81, -1.0F, -1.0087F, -1.0F, 2, 1, 3, -0.001F, false));

        this.cube_r68 = new AdvancedModelRenderer(this);
        this.cube_r68.setRotationPoint(0.0F, 2.05F, -1.6F);
        this.jaw.addChild(cube_r68);
        this.setRotateAngle(cube_r68, 0.2443F, 0.0F, 0.0F);
        this.cube_r68.cubeList.add(new ModelBox(cube_r68, 76, 75, -2.5F, -2.0F, -1.0F, 5, 1, 2, -0.001F, false));

        this.cube_r69 = new AdvancedModelRenderer(this);
        this.cube_r69.setRotationPoint(0.0F, 2.0F, -1.9F);
        this.jaw.addChild(cube_r69);
        this.setRotateAngle(cube_r69, 0.288F, 0.0F, 0.0F);
        this.cube_r69.cubeList.add(new ModelBox(cube_r69, 66, 35, -2.0F, -1.0F, -1.0F, 4, 1, 3, 0.0F, false));

        this.cube_r70 = new AdvancedModelRenderer(this);
        this.cube_r70.setRotationPoint(0.0F, 1.15F, 0.9F);
        this.jaw.addChild(cube_r70);
        this.setRotateAngle(cube_r70, 0.3578F, 0.0F, 0.0F);
        this.cube_r70.cubeList.add(new ModelBox(cube_r70, 50, 35, -3.0F, -2.0F, -2.0F, 6, 2, 2, 0.0F, false));

        this.eyes = new AdvancedModelRenderer(this);
        this.eyes.setRotationPoint(0.0F, -0.3264F, -2.5569F);
        this.head.addChild(eyes);


        this.cube_r71 = new AdvancedModelRenderer(this);
        this.cube_r71.setRotationPoint(1.7799F, 0.5F, 0.5417F);
        this.eyes.addChild(cube_r71);
        this.setRotateAngle(cube_r71, 0.0F, 0.0873F, 0.0F);
        this.cube_r71.cubeList.add(new ModelBox(cube_r71, 16, 70, 0.0F, -1.0F, -1.0F, 1, 1, 1, 0.0F, true));

        this.cube_r72 = new AdvancedModelRenderer(this);
        this.cube_r72.setRotationPoint(-1.7799F, 0.5F, 0.5417F);
        this.eyes.addChild(cube_r72);
        this.setRotateAngle(cube_r72, 0.0F, -0.0873F, 0.0F);
        this.cube_r72.cubeList.add(new ModelBox(cube_r72, 16, 70, -1.0F, -1.0F, -1.0F, 1, 1, 1, 0.0F, false));

        this.rightArm = new AdvancedModelRenderer(this);
        this.rightArm.setRotationPoint(-5.1112F, 5.9671F, -1.7205F);
        this.chest.addChild(rightArm);
        this.setRotateAngle(rightArm, 0.6632F, -0.4363F, 0.0F);
        this.rightArm.cubeList.add(new ModelBox(rightArm, 64, 75, -1.25F, -0.1498F, -1.8697F, 3, 7, 3, 0.0F, false));

        this.cube_r73 = new AdvancedModelRenderer(this);
        this.cube_r73.setRotationPoint(-1.15F, 4.25F, -1.0F);
        this.rightArm.addChild(cube_r73);
        this.setRotateAngle(cube_r73, 0.0F, -0.3491F, 0.0F);
        this.cube_r73.cubeList.add(new ModelBox(cube_r73, 24, 83, 0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, false));

        this.cube_r74 = new AdvancedModelRenderer(this);
        this.cube_r74.setRotationPoint(-1.15F, 1.75F, -1.25F);
        this.rightArm.addChild(cube_r74);
        this.setRotateAngle(cube_r74, 0.0F, -0.3491F, 0.0F);
        this.cube_r74.cubeList.add(new ModelBox(cube_r74, 12, 81, 0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, false));

        this.rightArm10 = new AdvancedModelRenderer(this);
        this.rightArm10.setRotationPoint(0.75F, 5.7755F, 0.5955F);
        this.rightArm.addChild(rightArm10);
        this.setRotateAngle(rightArm10, -1.0894F, 0.1663F, -0.0503F);
        this.rightArm10.cubeList.add(new ModelBox(rightArm10, 76, 11, -1.4797F, 0.4191F, -2.16F, 2, 6, 3, 0.0F, false));

        this.rightArm11 = new AdvancedModelRenderer(this);
        this.rightArm11.setRotationPoint(-0.2759F, 6.1976F, -0.002F);
        this.rightArm10.addChild(rightArm11);
        this.setRotateAngle(rightArm11, 0.1897F, 0.2336F, 0.0428F);
        this.rightArm11.cubeList.add(new ModelBox(rightArm11, 76, 78, -1.4314F, -0.4685F, -2.8263F, 3, 2, 3, 0.0F, false));

        this.leftArm = new AdvancedModelRenderer(this);
        this.leftArm.setRotationPoint(4.8485F, 5.9671F, -1.7205F);
        this.chest.addChild(leftArm);
        this.setRotateAngle(leftArm, 0.6632F, 0.4363F, 0.0F);
        this.leftArm.cubeList.add(new ModelBox(leftArm, 64, 75, -1.75F, -0.1498F, -1.8697F, 3, 7, 3, 0.0F, true));

        this.cube_r75 = new AdvancedModelRenderer(this);
        this.cube_r75.setRotationPoint(1.15F, 4.25F, -1.0F);
        this.leftArm.addChild(cube_r75);
        this.setRotateAngle(cube_r75, 0.0F, 0.3491F, 0.0F);
        this.cube_r75.cubeList.add(new ModelBox(cube_r75, 24, 83, -1.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, true));

        this.cube_r76 = new AdvancedModelRenderer(this);
        this.cube_r76.setRotationPoint(1.15F, 1.75F, -1.25F);
        this.leftArm.addChild(cube_r76);
        this.setRotateAngle(cube_r76, 0.0F, 0.3491F, 0.0F);
        this.cube_r76.cubeList.add(new ModelBox(cube_r76, 12, 81, -1.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, true));

        this.leftArm2 = new AdvancedModelRenderer(this);
        this.leftArm2.setRotationPoint(-0.75F, 5.7755F, 0.5955F);
        this.leftArm.addChild(leftArm2);
        this.setRotateAngle(leftArm2, -1.0894F, -0.1663F, 0.0503F);
        this.leftArm2.cubeList.add(new ModelBox(leftArm2, 76, 11, -0.5203F, 0.4191F, -2.16F, 2, 6, 3, 0.0F, true));

        this.leftArm3 = new AdvancedModelRenderer(this);
        this.leftArm3.setRotationPoint(0.2759F, 6.1976F, -0.002F);
        this.leftArm2.addChild(leftArm3);
        this.setRotateAngle(leftArm3, 0.1897F, -0.2336F, -0.0428F);
        this.leftArm3.cubeList.add(new ModelBox(leftArm3, 76, 78, -1.5686F, -0.4685F, -2.8263F, 3, 2, 3, 0.0F, true));

        this.tail1 = new AdvancedModelRenderer(this);
        this.tail1.setRotationPoint(0.0F, -0.5F, 8.5F);
        this.hip.addChild(tail1);
        this.setRotateAngle(tail1, -0.6545F, 0.0F, 0.0F);
        this.tail1.cubeList.add(new ModelBox(tail1, 50, 22, -5.5F, -1.201F, 0.049F, 11, 7, 6, 0.0F, false));

        this.cube_r77 = new AdvancedModelRenderer(this);
        this.cube_r77.setRotationPoint(2.3549F, 0.225F, 2.15F);
        this.tail1.addChild(cube_r77);
        this.setRotateAngle(cube_r77, 0.5323F, -0.2618F, 0.0F);
        this.cube_r77.cubeList.add(new ModelBox(cube_r77, 86, 11, 0.0F, -2.0F, -1.0F, 1, 1, 2, 0.0F, true));

        this.cube_r78 = new AdvancedModelRenderer(this);
        this.cube_r78.setRotationPoint(3.9799F, 1.65F, 3.2F);
        this.tail1.addChild(cube_r78);
        this.setRotateAngle(cube_r78, 0.1271F, 0.1304F, 0.6222F);
        this.cube_r78.cubeList.add(new ModelBox(cube_r78, 42, 85, 0.0F, -2.0F, -1.0F, 1, 1, 2, 0.0F, true));

        this.cube_r79 = new AdvancedModelRenderer(this);
        this.cube_r79.setRotationPoint(-2.3549F, 0.225F, 2.15F);
        this.tail1.addChild(cube_r79);
        this.setRotateAngle(cube_r79, 0.5323F, 0.2618F, 0.0F);
        this.cube_r79.cubeList.add(new ModelBox(cube_r79, 86, 11, -1.0F, -2.0F, -1.0F, 1, 1, 2, 0.0F, false));

        this.cube_r80 = new AdvancedModelRenderer(this);
        this.cube_r80.setRotationPoint(-3.9799F, 1.65F, 3.2F);
        this.tail1.addChild(cube_r80);
        this.setRotateAngle(cube_r80, 0.1271F, -0.1304F, -0.6222F);
        this.cube_r80.cubeList.add(new ModelBox(cube_r80, 42, 85, -1.0F, -2.0F, -1.0F, 1, 1, 2, 0.0F, false));

        this.tail2 = new AdvancedModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, 0.675F, 4.4F);
        this.tail1.addChild(tail2);
        this.setRotateAngle(tail2, 0.1396F, 0.0F, 0.0F);
        this.tail2.cubeList.add(new ModelBox(tail2, 40, 66, -3.0F, -1.7068F, 1.126F, 6, 5, 4, 0.0F, false));

        this.cube_r81 = new AdvancedModelRenderer(this);
        this.cube_r81.setRotationPoint(1.3799F, -0.025F, 2.375F);
        this.tail2.addChild(cube_r81);
        this.setRotateAngle(cube_r81, 0.3621F, -0.2376F, -0.0664F);
        this.cube_r81.cubeList.add(new ModelBox(cube_r81, 12, 86, 0.0F, -2.0F, -1.0F, 1, 1, 2, 0.0F, true));

        this.cube_r82 = new AdvancedModelRenderer(this);
        this.cube_r82.setRotationPoint(1.0549F, 0.725F, 1.775F);
        this.tail2.addChild(cube_r82);
        this.setRotateAngle(cube_r82, 0.2281F, 0.2158F, 0.6984F);
        this.cube_r82.cubeList.add(new ModelBox(cube_r82, 48, 85, 0.0F, -2.0F, 0.0F, 1, 1, 2, 0.0F, true));

        this.cube_r83 = new AdvancedModelRenderer(this);
        this.cube_r83.setRotationPoint(-1.3799F, -0.025F, 2.375F);
        this.tail2.addChild(cube_r83);
        this.setRotateAngle(cube_r83, 0.3621F, 0.2376F, 0.0664F);
        this.cube_r83.cubeList.add(new ModelBox(cube_r83, 12, 86, -1.0F, -2.0F, -1.0F, 1, 1, 2, 0.0F, false));

        this.cube_r84 = new AdvancedModelRenderer(this);
        this.cube_r84.setRotationPoint(-1.0549F, 0.725F, 1.775F);
        this.tail2.addChild(cube_r84);
        this.setRotateAngle(cube_r84, 0.2281F, -0.2158F, -0.6984F);
        this.cube_r84.cubeList.add(new ModelBox(cube_r84, 48, 85, -1.0F, -2.0F, 0.0F, 1, 1, 2, 0.0F, false));

        this.tail3 = new AdvancedModelRenderer(this);
        this.tail3.setRotationPoint(0.0F, -0.675F, 4.15F);
        this.tail2.addChild(tail3);
        this.setRotateAngle(tail3, 0.0873F, 0.0F, 0.0F);
        this.tail3.cubeList.add(new ModelBox(tail3, 0, 68, -1.5F, -0.9762F, -0.536F, 3, 3, 5, 0.0F, false));

        this.cube_r85 = new AdvancedModelRenderer(this);
        this.cube_r85.setRotationPoint(0.5549F, 0.3238F, 0.514F);
        this.tail3.addChild(cube_r85);
        this.setRotateAngle(cube_r85, -0.6018F, -0.17F, 0.1441F);
        this.cube_r85.cubeList.add(new ModelBox(cube_r85, 64, 85, 0.0F, -2.0F, -1.0F, 1, 1, 2, 0.0F, true));

        this.cube_r86 = new AdvancedModelRenderer(this);
        this.cube_r86.setRotationPoint(1.3299F, -0.1012F, 3.039F);
        this.tail3.addChild(cube_r86);
        this.setRotateAngle(cube_r86, -0.0367F, -0.667F, -0.8099F);
        this.cube_r86.cubeList.add(new ModelBox(cube_r86, 82, 39, -1.0F, -1.0F, -1.0F, 2, 1, 2, 0.0F, true));

        this.cube_r87 = new AdvancedModelRenderer(this);
        this.cube_r87.setRotationPoint(-0.5549F, 0.3238F, 0.514F);
        this.tail3.addChild(cube_r87);
        this.setRotateAngle(cube_r87, -0.6018F, 0.17F, -0.1441F);
        this.cube_r87.cubeList.add(new ModelBox(cube_r87, 64, 85, -1.0F, -2.0F, -1.0F, 1, 1, 2, 0.0F, false));

        this.cube_r88 = new AdvancedModelRenderer(this);
        this.cube_r88.setRotationPoint(-1.3299F, -0.1012F, 3.039F);
        this.tail3.addChild(cube_r88);
        this.setRotateAngle(cube_r88, -0.0367F, 0.667F, 0.8099F);
        this.cube_r88.cubeList.add(new ModelBox(cube_r88, 82, 39, -1.0F, -1.0F, -1.0F, 2, 1, 2, 0.0F, false));

        this.tail4 = new AdvancedModelRenderer(this);
        this.tail4.setRotationPoint(0.0F, 0.1238F, 4.014F);
        this.tail3.addChild(tail4);
        this.setRotateAngle(tail4, 0.2182F, 0.0F, 0.0F);
        this.tail4.cubeList.add(new ModelBox(tail4, 46, 55, -1.0F, -1.075F, -1.3F, 2, 2, 9, 0.0F, false));

        this.cube_r89 = new AdvancedModelRenderer(this);
        this.cube_r89.setRotationPoint(1.5549F, -0.175F, 1.275F);
        this.tail4.addChild(cube_r89);
        this.setRotateAngle(cube_r89, -0.2492F, -0.6558F, -0.5345F);
        this.cube_r89.cubeList.add(new ModelBox(cube_r89, 32, 72, -1.0F, -1.0F, -1.0F, 2, 1, 2, 0.0F, true));

        this.cube_r90 = new AdvancedModelRenderer(this);
        this.cube_r90.setRotationPoint(2.0549F, -0.025F, 4.075F);
        this.tail4.addChild(cube_r90);
        this.setRotateAngle(cube_r90, 0.0673F, 0.7342F, -0.2331F);
        this.cube_r90.cubeList.add(new ModelBox(cube_r90, 0, 89, -2.0F, -1.0F, -3.0F, 3, 1, 4, 0.0F, true));

        this.cube_r91 = new AdvancedModelRenderer(this);
        this.cube_r91.setRotationPoint(2.0799F, -0.025F, 6.6F);
        this.tail4.addChild(cube_r91);
        this.setRotateAngle(cube_r91, 0.0914F, -0.925F, -0.281F);
        this.cube_r91.cubeList.add(new ModelBox(cube_r91, 80, 70, -2.0F, -1.0F, -1.0F, 3, 1, 3, 0.0F, true));

        this.cube_r92 = new AdvancedModelRenderer(this);
        this.cube_r92.setRotationPoint(2.0799F, -0.325F, 9.825F);
        this.tail4.addChild(cube_r92);
        this.setRotateAngle(cube_r92, 0.1812F, 0.4834F, -0.1541F);
        this.cube_r92.cubeList.add(new ModelBox(cube_r92, 46, 81, -1.0F, -1.0F, -3.0F, 2, 1, 3, 0.0F, true));

        this.cube_r93 = new AdvancedModelRenderer(this);
        this.cube_r93.setRotationPoint(1.6049F, -0.65F, 11.65F);
        this.tail4.addChild(cube_r93);
        this.setRotateAngle(cube_r93, 0.2792F, 0.6763F, 0.0064F);
        this.cube_r93.cubeList.add(new ModelBox(cube_r93, 84, 24, 0.0F, -1.0F, -2.0F, 1, 1, 2, 0.0F, true));

        this.cube_r94 = new AdvancedModelRenderer(this);
        this.cube_r94.setRotationPoint(0.0F, 0.85F, 8.575F);
        this.tail4.addChild(cube_r94);
        this.setRotateAngle(cube_r94, 0.2094F, 0.0F, 0.0F);
        this.cube_r94.cubeList.add(new ModelBox(cube_r94, 48, 75, -1.5F, -1.9825F, -0.9324F, 3, 1, 5, 0.0F, true));

        this.cube_r95 = new AdvancedModelRenderer(this);
        this.cube_r95.setRotationPoint(0.0F, -1.2F, 13.1F);
        this.tail4.addChild(cube_r95);
        this.setRotateAngle(cube_r95, 0.6109F, 0.0F, 0.0F);
        this.cube_r95.cubeList.add(new ModelBox(cube_r95, 58, 86, -0.5F, -1.0F, 0.0F, 1, 1, 1, 0.0F, false));

        this.cube_r96 = new AdvancedModelRenderer(this);
        this.cube_r96.setRotationPoint(-2.0799F, -0.025F, 6.6F);
        this.tail4.addChild(cube_r96);
        this.setRotateAngle(cube_r96, 0.0914F, 0.925F, 0.281F);
        this.cube_r96.cubeList.add(new ModelBox(cube_r96, 80, 70, -1.0F, -1.0F, -1.0F, 3, 1, 3, 0.0F, false));

        this.cube_r97 = new AdvancedModelRenderer(this);
        this.cube_r97.setRotationPoint(-1.6049F, -0.65F, 11.65F);
        this.tail4.addChild(cube_r97);
        this.setRotateAngle(cube_r97, 0.2792F, -0.6763F, -0.0064F);
        this.cube_r97.cubeList.add(new ModelBox(cube_r97, 84, 24, -1.0F, -1.0F, -2.0F, 1, 1, 2, 0.0F, false));

        this.cube_r98 = new AdvancedModelRenderer(this);
        this.cube_r98.setRotationPoint(-2.0799F, -0.325F, 9.825F);
        this.tail4.addChild(cube_r98);
        this.setRotateAngle(cube_r98, 0.1812F, -0.4834F, 0.1541F);
        this.cube_r98.cubeList.add(new ModelBox(cube_r98, 46, 81, -1.0F, -1.0F, -3.0F, 2, 1, 3, 0.0F, false));

        this.cube_r99 = new AdvancedModelRenderer(this);
        this.cube_r99.setRotationPoint(-2.0549F, -0.025F, 4.075F);
        this.tail4.addChild(cube_r99);
        this.setRotateAngle(cube_r99, 0.0673F, -0.7342F, 0.2331F);
        this.cube_r99.cubeList.add(new ModelBox(cube_r99, 0, 89, -1.0F, -1.0F, -3.0F, 3, 1, 4, 0.0F, false));

        this.cube_r100 = new AdvancedModelRenderer(this);
        this.cube_r100.setRotationPoint(-1.5549F, -0.175F, 1.275F);
        this.tail4.addChild(cube_r100);
        this.setRotateAngle(cube_r100, -0.2492F, 0.6558F, 0.5345F);
        this.cube_r100.cubeList.add(new ModelBox(cube_r100, 32, 72, -1.0F, -1.0F, -1.0F, 2, 1, 2, 0.0F, false));

        this.cube_r101 = new AdvancedModelRenderer(this);
        this.cube_r101.setRotationPoint(0.0F, 0.075F, 12.7F);
        this.tail4.addChild(cube_r101);
        this.setRotateAngle(cube_r101, 0.3578F, 0.0F, 0.0F);
        this.cube_r101.cubeList.add(new ModelBox(cube_r101, 68, 55, -1.0F, -2.0277F, -5.0827F, 2, 1, 6, 0.0F, false));

        this.leftLeg1 = new AdvancedModelRenderer(this);
        this.leftLeg1.setRotationPoint(-7.4799F, 1.4F, 5.25F);
        this.hip.addChild(leftLeg1);
        this.setRotateAngle(leftLeg1, -0.2356F, 0.0F, 0.0F);
        this.leftLeg1.cubeList.add(new ModelBox(leftLeg1, 0, 53, -1.8F, -2.0F, -3.0F, 4, 9, 6, 0.0F, false));

        this.leftLeg2 = new AdvancedModelRenderer(this);
        this.leftLeg2.setRotationPoint(0.25F, 7.0F, -3.0F);
        this.leftLeg1.addChild(leftLeg2);
        this.setRotateAngle(leftLeg2, -0.6981F, 0.0F, 0.0F);
        this.leftLeg2.cubeList.add(new ModelBox(leftLeg2, 20, 62, -1.5F, -3.0F, 0.0F, 3, 3, 7, 0.0F, false));

        this.leftLeg3 = new AdvancedModelRenderer(this);
        this.leftLeg3.setRotationPoint(0.0F, -3.0F, 7.0F);
        this.leftLeg2.addChild(leftLeg3);
        this.setRotateAngle(leftLeg3, 0.5672F, 0.0F, 0.0F);
        this.leftLeg3.cubeList.add(new ModelBox(leftLeg3, 28, 81, -1.0F, 0.0F, -2.0F, 2, 5, 2, 0.0F, false));

        this.leftLeg4 = new AdvancedModelRenderer(this);
        this.leftLeg4.setRotationPoint(0.0F, 3.75F, -0.25F);
        this.leftLeg3.addChild(leftLeg4);
        this.setRotateAngle(leftLeg4, 0.3752F, 0.0F, 0.0F);
        this.leftLeg4.cubeList.add(new ModelBox(leftLeg4, 16, 72, -2.0F, -0.1194F, -3.7868F, 4, 2, 4, 0.0F, false));

        this.rightLeg9 = new AdvancedModelRenderer(this);
        this.rightLeg9.setRotationPoint(7.4799F, 1.4F, 5.25F);
        this.hip.addChild(rightLeg9);
        this.setRotateAngle(rightLeg9, -0.2356F, 0.0F, 0.0F);
        this.rightLeg9.cubeList.add(new ModelBox(rightLeg9, 0, 53, -2.2F, -2.0F, -3.0F, 4, 9, 6, 0.0F, true));

        this.rightLeg10 = new AdvancedModelRenderer(this);
        this.rightLeg10.setRotationPoint(-0.25F, 7.0F, -3.0F);
        this.rightLeg9.addChild(rightLeg10);
        this.setRotateAngle(rightLeg10, -0.6981F, 0.0F, 0.0F);
        this.rightLeg10.cubeList.add(new ModelBox(rightLeg10, 20, 62, -1.5F, -3.0F, 0.0F, 3, 3, 7, 0.0F, true));

        this.rightLeg11 = new AdvancedModelRenderer(this);
        this.rightLeg11.setRotationPoint(0.0F, -3.0F, 7.0F);
        this.rightLeg10.addChild(rightLeg11);
        this.setRotateAngle(rightLeg11, 0.5672F, 0.0F, 0.0F);
        this.rightLeg11.cubeList.add(new ModelBox(rightLeg11, 28, 81, -1.0F, 0.0F, -2.0F, 2, 5, 2, 0.0F, true));

        this.rightLeg12 = new AdvancedModelRenderer(this);
        this.rightLeg12.setRotationPoint(0.0F, 3.75F, -0.25F);
        this.rightLeg11.addChild(rightLeg12);
        this.setRotateAngle(rightLeg12, 0.3752F, 0.0F, 0.0F);
        this.rightLeg12.cubeList.add(new ModelBox(rightLeg12, 16, 72, -2.0F, -0.1194F, -3.7868F, 4, 2, 4, 0.0F, true));
        updateDefaultPose();
        animator = ModelAnimator.create();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        animate((IAnimatedEntity) entity, f, f1, f2, f3, f4, f5);
        this.hip.render(f5);
    }

    public void renderStaticWall(float f) {
        resetToDefaultPose();
    }
    public void renderStaticFloor(float f) {
        this.resetToDefaultPose();
    }

    @Override
    public void renderStaticBook(float f) {
        //Rotations, positions and sizing:
        this.hip.offsetY = 0.16F;
        this.hip.offsetX = -0.03F;
        this.hip.rotateAngleY = (float)Math.toRadians(150);
        this.hip.rotateAngleX = (float)Math.toRadians(2);
        this.hip.rotateAngleZ = (float)Math.toRadians(0);
        this.hip.scaleChildren = true;
        float scaler = 0.646F;
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

        EntityPrehistoricFloraAntarctopelta entityYuxi = (EntityPrehistoricFloraAntarctopelta) e;

        if (entityYuxi.getAnimation() == entityYuxi.HIDE_ANIMATION) {
            return;
        }

        AdvancedModelRenderer[] Tail = {this.tail1, this.tail2, this.tail3};
        AdvancedModelRenderer[] Neck = {this.neck1, this.neck2, this.head};
        entityYuxi.tailBuffer.applyChainSwingBuffer(Tail);

        if (entityYuxi.getAnimation() == entityYuxi.LAY_ANIMATION) {
            this.chainSwing(Neck, 0.5F, 0.10F, 0.5, f2, 0.8F);
            this.chainWave(Neck, 0.5F * 2, -0.02F, 0.5F, f2, 0.8F);
        }
        else {
            if (!entityYuxi.isReallyInWater()) {

                if (f3 == 0.0F || !entityYuxi.getIsMoving()) {
                    if (entityYuxi.getAnimation() != entityYuxi.EAT_ANIMATION
                        && entityYuxi.getAnimation() != entityYuxi.DRINK_ANIMATION
                        && entityYuxi.getAnimation() != entityYuxi.HIDE_ANIMATION) {
                        this.chainSwing(Neck, 0.05F, 0.10F, 0.5, f2, 0.8F);
                        this.chainWave(Neck, 0.05F * 2, -0.02F, 0.5F, f2, 0.8F);
                    }

                    this.chainWave(Tail, (0.15F * 0.35F), 0.1F * 0.1F, 0.2F, f2, 1F);
                    this.chainSwing(Tail, (0.15F * 0.35F) * 4F, 0.05F * 0.05F, 0.12F, f2, 1F);


                    return;
                }

                if (entityYuxi.getIsFast()) { //Running


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
    public void setLivingAnimations(EntityLivingBase entitylivinghipIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        super.setLivingAnimations(entitylivinghipIn, limbSwing, limbSwingAmount, partialTickTime);
        this.resetToDefaultPose();

        EntityPrehistoricFloraAntarctopelta ee = (EntityPrehistoricFloraAntarctopelta) entitylivinghipIn;

        if (ee.getAnimation() != ee.HIDE_ANIMATION) {
            if (!ee.isReallyInWater()) {
                if (ee.getIsMoving()) {
                    if (ee.getIsFast()) { //Running
                        animRunning(entitylivinghipIn, limbSwing, limbSwingAmount, partialTickTime);
                    } else { //Walking
                        animWalking(entitylivinghipIn, limbSwing, limbSwingAmount, partialTickTime);
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
        }
        if (ee.getAnimation() == ee.EAT_ANIMATION) {
            animEat(entitylivinghipIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.ATTACK_ANIMATION) {
            //animAttack(entitylivinghipIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.MAKE_NEST_ANIMATION) {
            animNest(entitylivinghipIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.LAY_ANIMATION) {
            animLay(entitylivinghipIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.ROAR_ANIMATION) { //The noise anim
            animNoise(entitylivinghipIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.ALERT_ANIMATION) { //The noise anim
            animAlert(entitylivinghipIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.HIDE_ANIMATION) { //The hiding and unhiding anim
            animHide(entitylivinghipIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.DRINK_ANIMATION) {
            animGraze(entitylivinghipIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }

    }
    public void animGraze(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraAntarctopelta entity = (EntityPrehistoricFloraAntarctopelta) entitylivingbaseIn;
        int animCycle = 125;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
     if (tickAnim >= 0 && tickAnim < 40) {
            xx = -0-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-10 + (((tickAnim - 0) / 40) * (9.75-(-0-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-10)));
            yy = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 93) {
            xx = 9.75 + (((tickAnim - 40) / 53) * (9.75-(9.75)));
            yy = 0 + (((tickAnim - 40) / 53) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 53) * (0-(0)));
        }
        else if (tickAnim >= 93 && tickAnim < 125) {
            xx = 9.75 + (((tickAnim - 93) / 32) * (0-(9.75)));
            yy = 0 + (((tickAnim - 93) / 32) * (0-(0)));
            zz = 0 + (((tickAnim - 93) / 32) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body1, body1.rotateAngleX + (float) Math.toRadians(xx), body1.rotateAngleY + (float) Math.toRadians(yy), body1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 40) {
            xx = -0-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*10 + (((tickAnim - 0) / 40) * (9-(-0-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*10)));
            yy = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 93) {
            xx = 9 + (((tickAnim - 40) / 53) * (9-(9)));
            yy = 0 + (((tickAnim - 40) / 53) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 53) * (0-(0)));
        }
        else if (tickAnim >= 93 && tickAnim < 125) {
            xx = 9 + (((tickAnim - 93) / 32) * (0-(9)));
            yy = 0 + (((tickAnim - 93) / 32) * (0-(0)));
            zz = 0 + (((tickAnim - 93) / 32) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body2, body2.rotateAngleX + (float) Math.toRadians(xx), body2.rotateAngleY + (float) Math.toRadians(yy), body2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 40) {
            xx = -0-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-30 + (((tickAnim - 0) / 40) * (20.5-(-0-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-30)));
            yy = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 53) {
            xx = 20.5 + (((tickAnim - 40) / 13) * (18-(20.5)));
            yy = 0 + (((tickAnim - 40) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 13) * (0-(0)));
        }
        else if (tickAnim >= 53 && tickAnim < 93) {
            xx = 18 + (((tickAnim - 53) / 40) * (18-(18)));
            yy = 0 + (((tickAnim - 53) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 53) / 40) * (0-(0)));
        }
        else if (tickAnim >= 93 && tickAnim < 125) {
            xx = 18 + (((tickAnim - 93) / 32) * (0-(18)));
            yy = 0 + (((tickAnim - 93) / 32) * (0-(0)));
            zz = 0 + (((tickAnim - 93) / 32) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck1, neck1.rotateAngleX + (float) Math.toRadians(xx), neck1.rotateAngleY + (float) Math.toRadians(yy), neck1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 40) {
            xx = -0-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-20 + (((tickAnim - 0) / 40) * (12.25-(-0-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-20)));
            yy = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 43) {
            xx = 12.25 + (((tickAnim - 40) / 3) * (21.42-(12.25)));
            yy = 0 + (((tickAnim - 40) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 3) * (0-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 60) {
            xx = 21.42 + (((tickAnim - 43) / 17) * (9-(21.42)));
            yy = 0 + (((tickAnim - 43) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 43) / 17) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 73) {
            xx = 9 + (((tickAnim - 60) / 13) * (12.25-(9)));
            yy = 0 + (((tickAnim - 60) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 13) * (0-(0)));
        }
        else if (tickAnim >= 73 && tickAnim < 76) {
            xx = 12.25 + (((tickAnim - 73) / 3) * (21.42-(12.25)));
            yy = 0 + (((tickAnim - 73) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 73) / 3) * (0-(0)));
        }
        else if (tickAnim >= 76 && tickAnim < 93) {
            xx = 21.42 + (((tickAnim - 76) / 17) * (9-(21.42)));
            yy = 0 + (((tickAnim - 76) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 76) / 17) * (0-(0)));
        }
        else if (tickAnim >= 93 && tickAnim < 125) {
            xx = 9 + (((tickAnim - 93) / 32) * (0-(9)));
            yy = 0 + (((tickAnim - 93) / 32) * (0-(0)));
            zz = 0 + (((tickAnim - 93) / 32) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(xx), neck2.rotateAngleY + (float) Math.toRadians(yy), neck2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 0) / 28) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 28) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 28) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 28) / 12) * (-14.26958-(0)));
            yy = 0 + (((tickAnim - 28) / 12) * (0.65244-(0)));
            zz = 0 + (((tickAnim - 28) / 12) * (-3.43873-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 43) {
            xx = -14.26958 + (((tickAnim - 40) / 3) * (-17.51958-(-14.26958)));
            yy = 0.65244 + (((tickAnim - 40) / 3) * (0.65244-(0.65244)));
            zz = -3.43873 + (((tickAnim - 40) / 3) * (-3.43873-(-3.43873)));
        }
        else if (tickAnim >= 43 && tickAnim < 50) {
            xx = -17.51958 + (((tickAnim - 43) / 7) * (0-(-17.51958)));
            yy = 0.65244 + (((tickAnim - 43) / 7) * (0-(0.65244)));
            zz = -3.43873 + (((tickAnim - 43) / 7) * (0-(-3.43873)));
        }
        else if (tickAnim >= 50 && tickAnim < 53) {
            xx = 0 + (((tickAnim - 50) / 3) * (4.37-(0)));
            yy = 0 + (((tickAnim - 50) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 50) / 3) * (0-(0)));
        }
        else if (tickAnim >= 53 && tickAnim < 55) {
            xx = 4.37 + (((tickAnim - 53) / 2) * (8-(4.37)));
            yy = 0 + (((tickAnim - 53) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 53) / 2) * (0-(0)));
        }
        else if (tickAnim >= 55 && tickAnim < 58) {
            xx = 8 + (((tickAnim - 55) / 3) * (7.87-(8)));
            yy = 0 + (((tickAnim - 55) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 55) / 3) * (0-(0)));
        }
        else if (tickAnim >= 58 && tickAnim < 60) {
            xx = 7.87 + (((tickAnim - 58) / 2) * (8.75-(7.87)));
            yy = 0 + (((tickAnim - 58) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 58) / 2) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 73) {
            xx = 8.75 + (((tickAnim - 60) / 13) * (-14.26958-(8.75)));
            yy = 0 + (((tickAnim - 60) / 13) * (0.65244-(0)));
            zz = 0 + (((tickAnim - 60) / 13) * (-3.43873-(0)));
        }
        else if (tickAnim >= 73 && tickAnim < 76) {
            xx = -14.26958 + (((tickAnim - 73) / 3) * (-17.51958-(-14.26958)));
            yy = 0.65244 + (((tickAnim - 73) / 3) * (0.65244-(0.65244)));
            zz = -3.43873 + (((tickAnim - 73) / 3) * (-3.43873-(-3.43873)));
        }
        else if (tickAnim >= 76 && tickAnim < 83) {
            xx = -17.51958 + (((tickAnim - 76) / 7) * (0-(-17.51958)));
            yy = 0.65244 + (((tickAnim - 76) / 7) * (0-(0.65244)));
            zz = -3.43873 + (((tickAnim - 76) / 7) * (0-(-3.43873)));
        }
        else if (tickAnim >= 83 && tickAnim < 85) {
            xx = 0 + (((tickAnim - 83) / 2) * (4.37-(0)));
            yy = 0 + (((tickAnim - 83) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 83) / 2) * (0-(0)));
        }
        else if (tickAnim >= 85 && tickAnim < 88) {
            xx = 4.37 + (((tickAnim - 85) / 3) * (8-(4.37)));
            yy = 0 + (((tickAnim - 85) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 85) / 3) * (0-(0)));
        }
        else if (tickAnim >= 88 && tickAnim < 90) {
            xx = 8 + (((tickAnim - 88) / 2) * (7.87-(8)));
            yy = 0 + (((tickAnim - 88) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 88) / 2) * (0-(0)));
        }
        else if (tickAnim >= 90 && tickAnim < 93) {
            xx = 7.87 + (((tickAnim - 90) / 3) * (8.75-(7.87)));
            yy = 0 + (((tickAnim - 90) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 90) / 3) * (0-(0)));
        }
        else if (tickAnim >= 93 && tickAnim < 125) {
            xx = 8.75 + (((tickAnim - 93) / 32) * (0-(8.75)));
            yy = 0 + (((tickAnim - 93) / 32) * (0-(0)));
            zz = 0 + (((tickAnim - 93) / 32) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 0) / 28) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 28) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 28) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 28) / 12) * (16.75-(0)));
            yy = 0 + (((tickAnim - 28) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 12) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 43) {
            xx = 16.75 + (((tickAnim - 40) / 3) * (0-(16.75)));
            yy = 0 + (((tickAnim - 40) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 3) * (0-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 43) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 43) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 43) / 7) * (0-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 53) {
            xx = 0 + (((tickAnim - 50) / 3) * (3-(0)));
            yy = 0 + (((tickAnim - 50) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 50) / 3) * (0-(0)));
        }
        else if (tickAnim >= 53 && tickAnim < 55) {
            xx = 3 + (((tickAnim - 53) / 2) * (0-(3)));
            yy = 0 + (((tickAnim - 53) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 53) / 2) * (0-(0)));
        }
        else if (tickAnim >= 55 && tickAnim < 58) {
            xx = 0 + (((tickAnim - 55) / 3) * (3-(0)));
            yy = 0 + (((tickAnim - 55) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 55) / 3) * (0-(0)));
        }
        else if (tickAnim >= 58 && tickAnim < 60) {
            xx = 3 + (((tickAnim - 58) / 2) * (0-(3)));
            yy = 0 + (((tickAnim - 58) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 58) / 2) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 73) {
            xx = 0 + (((tickAnim - 60) / 13) * (16.75-(0)));
            yy = 0 + (((tickAnim - 60) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 13) * (0-(0)));
        }
        else if (tickAnim >= 73 && tickAnim < 76) {
            xx = 16.75 + (((tickAnim - 73) / 3) * (0-(16.75)));
            yy = 0 + (((tickAnim - 73) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 73) / 3) * (0-(0)));
        }
        else if (tickAnim >= 76 && tickAnim < 83) {
            xx = 0 + (((tickAnim - 76) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 76) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 76) / 7) * (0-(0)));
        }
        else if (tickAnim >= 83 && tickAnim < 85) {
            xx = 0 + (((tickAnim - 83) / 2) * (3-(0)));
            yy = 0 + (((tickAnim - 83) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 83) / 2) * (0-(0)));
        }
        else if (tickAnim >= 85 && tickAnim < 88) {
            xx = 3 + (((tickAnim - 85) / 3) * (0-(3)));
            yy = 0 + (((tickAnim - 85) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 85) / 3) * (0-(0)));
        }
        else if (tickAnim >= 88 && tickAnim < 90) {
            xx = 0 + (((tickAnim - 88) / 2) * (3-(0)));
            yy = 0 + (((tickAnim - 88) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 88) / 2) * (0-(0)));
        }
        else if (tickAnim >= 90 && tickAnim < 93) {
            xx = 3 + (((tickAnim - 90) / 3) * (0-(3)));
            yy = 0 + (((tickAnim - 90) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 90) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(xx), jaw.rotateAngleY + (float) Math.toRadians(yy), jaw.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (-33.75-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 93) {
            xx = -33.75 + (((tickAnim - 40) / 53) * (-33.75-(-33.75)));
            yy = 0 + (((tickAnim - 40) / 53) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 53) * (0-(0)));
        }
        else if (tickAnim >= 93 && tickAnim < 125) {
            xx = -33.75 + (((tickAnim - 93) / 32) * (0-(-33.75)));
            yy = 0 + (((tickAnim - 93) / 32) * (0-(0)));
            zz = 0 + (((tickAnim - 93) / 32) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm10, rightArm10.rotateAngleX + (float) Math.toRadians(xx), rightArm10.rotateAngleY + (float) Math.toRadians(yy), rightArm10.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (34.36521-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (-1.86102-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (7.01036-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 93) {
            xx = 34.36521 + (((tickAnim - 40) / 53) * (34.36521-(34.36521)));
            yy = -1.86102 + (((tickAnim - 40) / 53) * (-1.86102-(-1.86102)));
            zz = 7.01036 + (((tickAnim - 40) / 53) * (7.01036-(7.01036)));
        }
        else if (tickAnim >= 93 && tickAnim < 125) {
            xx = 34.36521 + (((tickAnim - 93) / 32) * (0-(34.36521)));
            yy = -1.86102 + (((tickAnim - 93) / 32) * (0-(-1.86102)));
            zz = 7.01036 + (((tickAnim - 93) / 32) * (0-(7.01036)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm11, rightArm11.rotateAngleX + (float) Math.toRadians(xx), rightArm11.rotateAngleY + (float) Math.toRadians(yy), rightArm11.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 0) / 19) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 19) * (1.125-(0)));
            zz = 0 + (((tickAnim - 0) / 19) * (-0.36-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 19) / 21) * (0-(0)));
            yy = 1.125 + (((tickAnim - 19) / 21) * (0-(1.125)));
            zz = -0.36 + (((tickAnim - 19) / 21) * (-0.75-(-0.36)));
        }
        else if (tickAnim >= 40 && tickAnim < 93) {
            xx = 0 + (((tickAnim - 40) / 53) * (0-(0)));
            yy = 0 + (((tickAnim - 40) / 53) * (0-(0)));
            zz = -0.75 + (((tickAnim - 40) / 53) * (-0.75-(-0.75)));
        }
        else if (tickAnim >= 93 && tickAnim < 125) {
            xx = 0 + (((tickAnim - 93) / 32) * (0-(0)));
            yy = 0 + (((tickAnim - 93) / 32) * (0-(0)));
            zz = -0.75 + (((tickAnim - 93) / 32) * (0-(-0.75)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightArm11.rotationPointX = this.rightArm11.rotationPointX + (float)(xx);
        this.rightArm11.rotationPointY = this.rightArm11.rotationPointY - (float)(yy);
        this.rightArm11.rotationPointZ = this.rightArm11.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (-17.12997-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (10.0878-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (7.4449-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 93) {
            xx = -17.12997 + (((tickAnim - 40) / 53) * (-17.12997-(-17.12997)));
            yy = 10.0878 + (((tickAnim - 40) / 53) * (10.0878-(10.0878)));
            zz = 7.4449 + (((tickAnim - 40) / 53) * (7.4449-(7.4449)));
        }
        else if (tickAnim >= 93 && tickAnim < 125) {
            xx = -17.12997 + (((tickAnim - 93) / 32) * (0-(-17.12997)));
            yy = 10.0878 + (((tickAnim - 93) / 32) * (0-(10.0878)));
            zz = 7.4449 + (((tickAnim - 93) / 32) * (0-(7.4449)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm, rightArm.rotateAngleX + (float) Math.toRadians(xx), rightArm.rotateAngleY + (float) Math.toRadians(yy), rightArm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (-33.75-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 93) {
            xx = -33.75 + (((tickAnim - 40) / 53) * (-33.75-(-33.75)));
            yy = 0 + (((tickAnim - 40) / 53) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 53) * (0-(0)));
        }
        else if (tickAnim >= 93 && tickAnim < 125) {
            xx = -33.75 + (((tickAnim - 93) / 32) * (0-(-33.75)));
            yy = 0 + (((tickAnim - 93) / 32) * (0-(0)));
            zz = 0 + (((tickAnim - 93) / 32) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm10, rightArm10.rotateAngleX + (float) Math.toRadians(xx), rightArm10.rotateAngleY + (float) Math.toRadians(yy), rightArm10.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (34.36521-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (-1.86102-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (7.01036-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 93) {
            xx = 34.36521 + (((tickAnim - 40) / 53) * (34.36521-(34.36521)));
            yy = -1.86102 + (((tickAnim - 40) / 53) * (-1.86102-(-1.86102)));
            zz = 7.01036 + (((tickAnim - 40) / 53) * (7.01036-(7.01036)));
        }
        else if (tickAnim >= 93 && tickAnim < 125) {
            xx = 34.36521 + (((tickAnim - 93) / 32) * (0-(34.36521)));
            yy = -1.86102 + (((tickAnim - 93) / 32) * (0-(-1.86102)));
            zz = 7.01036 + (((tickAnim - 93) / 32) * (0-(7.01036)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm11, rightArm11.rotateAngleX + (float) Math.toRadians(xx), rightArm11.rotateAngleY + (float) Math.toRadians(yy), rightArm11.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 0) / 19) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 19) * (1.125-(0)));
            zz = 0 + (((tickAnim - 0) / 19) * (-0.36-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 19) / 21) * (0-(0)));
            yy = 1.125 + (((tickAnim - 19) / 21) * (0.275-(1.125)));
            zz = -0.36 + (((tickAnim - 19) / 21) * (-0.75-(-0.36)));
        }
        else if (tickAnim >= 40 && tickAnim < 93) {
            xx = 0 + (((tickAnim - 40) / 53) * (0-(0)));
            yy = 0.275 + (((tickAnim - 40) / 53) * (0.275-(0.275)));
            zz = -0.75 + (((tickAnim - 40) / 53) * (-0.75-(-0.75)));
        }
        else if (tickAnim >= 93 && tickAnim < 125) {
            xx = 0 + (((tickAnim - 93) / 32) * (0-(0)));
            yy = 0.275 + (((tickAnim - 93) / 32) * (0-(0.275)));
            zz = -0.75 + (((tickAnim - 93) / 32) * (0-(-0.75)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightArm11.rotationPointX = this.rightArm11.rotationPointX + (float)(xx);
        this.rightArm11.rotationPointY = this.rightArm11.rotationPointY - (float)(yy);
        this.rightArm11.rotationPointZ = this.rightArm11.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (-17.12997-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (-10.0878-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (-7.4449-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 93) {
            xx = -17.12997 + (((tickAnim - 40) / 53) * (-17.12997-(-17.12997)));
            yy = -10.0878 + (((tickAnim - 40) / 53) * (-10.0878-(-10.0878)));
            zz = -7.4449 + (((tickAnim - 40) / 53) * (-7.4449-(-7.4449)));
        }
        else if (tickAnim >= 93 && tickAnim < 125) {
            xx = -17.12997 + (((tickAnim - 93) / 32) * (0-(-17.12997)));
            yy = -10.0878 + (((tickAnim - 93) / 32) * (0-(-10.0878)));
            zz = -7.4449 + (((tickAnim - 93) / 32) * (0-(-7.4449)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm, leftArm.rotateAngleX + (float) Math.toRadians(xx), leftArm.rotateAngleY + (float) Math.toRadians(yy), leftArm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (-33.75-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 93) {
            xx = -33.75 + (((tickAnim - 40) / 53) * (-33.75-(-33.75)));
            yy = 0 + (((tickAnim - 40) / 53) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 53) * (0-(0)));
        }
        else if (tickAnim >= 93 && tickAnim < 125) {
            xx = -33.75 + (((tickAnim - 93) / 32) * (0-(-33.75)));
            yy = 0 + (((tickAnim - 93) / 32) * (0-(0)));
            zz = 0 + (((tickAnim - 93) / 32) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm2, leftArm2.rotateAngleX + (float) Math.toRadians(xx), leftArm2.rotateAngleY + (float) Math.toRadians(yy), leftArm2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (34.36521-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (1.86102-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (-7.01036-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 93) {
            xx = 34.36521 + (((tickAnim - 40) / 53) * (34.36521-(34.36521)));
            yy = 1.86102 + (((tickAnim - 40) / 53) * (1.86102-(1.86102)));
            zz = -7.01036 + (((tickAnim - 40) / 53) * (-7.01036-(-7.01036)));
        }
        else if (tickAnim >= 93 && tickAnim < 125) {
            xx = 34.36521 + (((tickAnim - 93) / 32) * (0-(34.36521)));
            yy = 1.86102 + (((tickAnim - 93) / 32) * (0-(1.86102)));
            zz = -7.01036 + (((tickAnim - 93) / 32) * (0-(-7.01036)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm3, leftArm3.rotateAngleX + (float) Math.toRadians(xx), leftArm3.rotateAngleY + (float) Math.toRadians(yy), leftArm3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 0) / 19) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 19) * (1.125-(0)));
            zz = 0 + (((tickAnim - 0) / 19) * (-0.36-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 19) / 21) * (0-(0)));
            yy = 1.125 + (((tickAnim - 19) / 21) * (0.35-(1.125)));
            zz = -0.36 + (((tickAnim - 19) / 21) * (-0.75-(-0.36)));
        }
        else if (tickAnim >= 40 && tickAnim < 93) {
            xx = 0 + (((tickAnim - 40) / 53) * (0-(0)));
            yy = 0.35 + (((tickAnim - 40) / 53) * (0.35-(0.35)));
            zz = -0.75 + (((tickAnim - 40) / 53) * (-0.75-(-0.75)));
        }
        else if (tickAnim >= 93 && tickAnim < 125) {
            xx = 0 + (((tickAnim - 93) / 32) * (0-(0)));
            yy = 0.35 + (((tickAnim - 93) / 32) * (0-(0.35)));
            zz = -0.75 + (((tickAnim - 93) / 32) * (0-(-0.75)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftArm3.rotationPointX = this.leftArm3.rotationPointX + (float)(xx);
        this.leftArm3.rotationPointY = this.leftArm3.rotationPointY - (float)(yy);
        this.leftArm3.rotationPointZ = this.leftArm3.rotationPointZ + (float)(zz);
    }
    
    public void animHide(EntityLivingBase entitylivinghipIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraAntarctopelta entity = (EntityPrehistoricFloraAntarctopelta) entitylivinghipIn;
        int animCycle = 160;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
     if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (-16.75-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 15) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 15) / 15) * (0-(0)));
            zz = -16.75 + (((tickAnim - 15) / 15) * (-1.75-(-16.75)));
        }
        else if (tickAnim >= 30 && tickAnim < 130) {
            xx = 0 + (((tickAnim - 30) / 100) * (0-(0)));
            yy = 0 + (((tickAnim - 30) / 100) * (0-(0)));
            zz = -1.75 + (((tickAnim - 30) / 100) * (-1.75-(-1.75)));
        }
        else if (tickAnim >= 130 && tickAnim < 160) {
            xx = 0 + (((tickAnim - 130) / 30) * (0-(0)));
            yy = 0 + (((tickAnim - 130) / 30) * (0-(0)));
            zz = -1.75 + (((tickAnim - 130) / 30) * (0-(-1.75)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(hip, hip.rotateAngleX + (float) Math.toRadians(xx), hip.rotateAngleY + (float) Math.toRadians(yy), hip.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (-1.875-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (-2.425-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 30) {
            xx = -1.875 + (((tickAnim - 15) / 15) * (-1.875-(-1.875)));
            yy = -2.425 + (((tickAnim - 15) / 15) * (-2.425-(-2.425)));
            zz = 0 + (((tickAnim - 15) / 15) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 130) {
            xx = -1.875 + (((tickAnim - 30) / 100) * (-1.875-(-1.875)));
            yy = -2.425 + (((tickAnim - 30) / 100) * (-2.425-(-2.425)));
            zz = 0 + (((tickAnim - 30) / 100) * (0-(0)));
        }
        else if (tickAnim >= 130 && tickAnim < 160) {
            xx = -1.875 + (((tickAnim - 130) / 30) * (0-(-1.875)));
            yy = -2.425 + (((tickAnim - 130) / 30) * (0-(-2.425)));
            zz = 0 + (((tickAnim - 130) / 30) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.hip.rotationPointX = this.hip.rotationPointX + (float)(xx);
        this.hip.rotationPointY = this.hip.rotationPointY - (float)(yy);
        this.hip.rotationPointZ = this.hip.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (6.5-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 15) / 15) * (6.5-(0)));
            yy = 0 + (((tickAnim - 15) / 15) * (0-(0)));
            zz = 6.5 + (((tickAnim - 15) / 15) * (0-(6.5)));
        }
        else if (tickAnim >= 30 && tickAnim < 130) {
            xx = 6.5 + (((tickAnim - 30) / 100) * (6.5-(6.5)));
            yy = 0 + (((tickAnim - 30) / 100) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 100) * (0-(0)));
        }
        else if (tickAnim >= 130 && tickAnim < 160) {
            xx = 6.5 + (((tickAnim - 130) / 30) * (0-(6.5)));
            yy = 0 + (((tickAnim - 130) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 130) / 30) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body1, body1.rotateAngleX + (float) Math.toRadians(xx), body1.rotateAngleY + (float) Math.toRadians(yy), body1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (1-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 15) / 15) * (9.25-(0)));
            yy = 0 + (((tickAnim - 15) / 15) * (0-(0)));
            zz = 1 + (((tickAnim - 15) / 15) * (0-(1)));
        }
        else if (tickAnim >= 30 && tickAnim < 130) {
            xx = 9.25 + (((tickAnim - 30) / 100) * (9.25-(9.25)));
            yy = 0 + (((tickAnim - 30) / 100) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 100) * (0-(0)));
        }
        else if (tickAnim >= 130 && tickAnim < 160) {
            xx = 9.25 + (((tickAnim - 130) / 30) * (0-(9.25)));
            yy = 0 + (((tickAnim - 130) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 130) / 30) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body2, body2.rotateAngleX + (float) Math.toRadians(xx), body2.rotateAngleY + (float) Math.toRadians(yy), body2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (2.5-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 15) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 15) / 15) * (0-(0)));
            zz = 2.5 + (((tickAnim - 15) / 15) * (0-(2.5)));
        }
        else if (tickAnim >= 30 && tickAnim < 130) {
            xx = 0 + (((tickAnim - 30) / 100) * (0-(0)));
            yy = 0 + (((tickAnim - 30) / 100) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 100) * (0-(0)));
        }
        else if (tickAnim >= 130 && tickAnim < 160) {
            xx = 0 + (((tickAnim - 130) / 30) * (0-(0)));
            yy = 0 + (((tickAnim - 130) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 130) / 30) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(xx), chest.rotateAngleY + (float) Math.toRadians(yy), chest.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (31.82563-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (10.72009-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0.80609-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 30) {
            xx = 31.82563 + (((tickAnim - 15) / 15) * (38.11133-(31.82563)));
            yy = 10.72009 + (((tickAnim - 15) / 15) * (17.87973-(10.72009)));
            zz = 0.80609 + (((tickAnim - 15) / 15) * (5.23537-(0.80609)));
        }
        else if (tickAnim >= 30 && tickAnim < 130) {
            xx = 38.11133 + (((tickAnim - 30) / 100) * (38.11133-(38.11133)));
            yy = 17.87973 + (((tickAnim - 30) / 100) * (17.87973-(17.87973)));
            zz = 5.23537 + (((tickAnim - 30) / 100) * (5.23537-(5.23537)));
        }
        else if (tickAnim >= 130 && tickAnim < 160) {
            xx = 38.11133 + (((tickAnim - 130) / 30) * (0-(38.11133)));
            yy = 17.87973 + (((tickAnim - 130) / 30) * (0-(17.87973)));
            zz = 5.23537 + (((tickAnim - 130) / 30) * (0-(5.23537)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck1, neck1.rotateAngleX + (float) Math.toRadians(xx), neck1.rotateAngleY + (float) Math.toRadians(yy), neck1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (8.53815-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (6.71878-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0.64994-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 30) {
            xx = 8.53815 + (((tickAnim - 15) / 15) * (7.51552-(8.53815)));
            yy = 6.71878 + (((tickAnim - 15) / 15) * (7.44294-(6.71878)));
            zz = 0.64994 + (((tickAnim - 15) / 15) * (-7.63154-(0.64994)));
        }
        else if (tickAnim >= 30 && tickAnim < 130) {
            xx = 7.51552 + (((tickAnim - 30) / 100) * (7.51552-(7.51552)));
            yy = 7.44294 + (((tickAnim - 30) / 100) * (7.44294-(7.44294)));
            zz = -7.63154 + (((tickAnim - 30) / 100) * (-7.63154-(-7.63154)));
        }
        else if (tickAnim >= 130 && tickAnim < 160) {
            xx = 7.51552 + (((tickAnim - 130) / 30) * (0-(7.51552)));
            yy = 7.44294 + (((tickAnim - 130) / 30) * (0-(7.44294)));
            zz = -7.63154 + (((tickAnim - 130) / 30) * (0-(-7.63154)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(xx), neck2.rotateAngleY + (float) Math.toRadians(yy), neck2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (14-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 30) {
            xx = 14 + (((tickAnim - 15) / 15) * (-31.42079-(14)));
            yy = 0 + (((tickAnim - 15) / 15) * (4.29556-(0)));
            zz = 0 + (((tickAnim - 15) / 15) * (8.76098-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 130) {
            xx = -31.42079 + (((tickAnim - 30) / 100) * (-31.42079-(-31.42079)));
            yy = 4.29556 + (((tickAnim - 30) / 100) * (4.29556-(4.29556)));
            zz = 8.76098 + (((tickAnim - 30) / 100) * (8.76098-(8.76098)));
        }
        else if (tickAnim >= 130 && tickAnim < 160) {
            xx = -31.42079 + (((tickAnim - 130) / 30) * (0-(-31.42079)));
            yy = 4.29556 + (((tickAnim - 130) / 30) * (0-(4.29556)));
            zz = 8.76098 + (((tickAnim - 130) / 30) * (0-(8.76098)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (-8.50108-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (-0.37735-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0.32803-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 30) {
            xx = -8.50108 + (((tickAnim - 15) / 15) * (-8.50108-(-8.50108)));
            yy = -0.37735 + (((tickAnim - 15) / 15) * (-0.37735-(-0.37735)));
            zz = 0.32803 + (((tickAnim - 15) / 15) * (0.32803-(0.32803)));
        }
        else if (tickAnim >= 30 && tickAnim < 130) {
            xx = -8.50108 + (((tickAnim - 30) / 100) * (-8.50108-(-8.50108)));
            yy = -0.37735 + (((tickAnim - 30) / 100) * (-0.37735-(-0.37735)));
            zz = 0.32803 + (((tickAnim - 30) / 100) * (0.32803-(0.32803)));
        }
        else if (tickAnim >= 130 && tickAnim < 160) {
            xx = -8.50108 + (((tickAnim - 130) / 30) * (0-(-8.50108)));
            yy = -0.37735 + (((tickAnim - 130) / 30) * (0-(-0.37735)));
            zz = 0.32803 + (((tickAnim - 130) / 30) * (0-(0.32803)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail1, tail1.rotateAngleX + (float) Math.toRadians(xx), tail1.rotateAngleY + (float) Math.toRadians(yy), tail1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (-7.5-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (15.25-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 30) {
            xx = -7.5 + (((tickAnim - 15) / 15) * (-7.5-(-7.5)));
            yy = 15.25 + (((tickAnim - 15) / 15) * (15.25-(15.25)));
            zz = 0 + (((tickAnim - 15) / 15) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 130) {
            xx = -7.5 + (((tickAnim - 30) / 100) * (-7.5-(-7.5)));
            yy = 15.25 + (((tickAnim - 30) / 100) * (15.25-(15.25)));
            zz = 0 + (((tickAnim - 30) / 100) * (0-(0)));
        }
        else if (tickAnim >= 130 && tickAnim < 160) {
            xx = -7.5 + (((tickAnim - 130) / 30) * (0-(-7.5)));
            yy = 15.25 + (((tickAnim - 130) / 30) * (0-(15.25)));
            zz = 0 + (((tickAnim - 130) / 30) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(xx), tail2.rotateAngleY + (float) Math.toRadians(yy), tail2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (-15.82563-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (10.72009-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (-0.80609-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 30) {
            xx = -15.82563 + (((tickAnim - 15) / 15) * (-16.73346-(-15.82563)));
            yy = 10.72009 + (((tickAnim - 15) / 15) * (19.66908-(10.72009)));
            zz = -0.80609 + (((tickAnim - 15) / 15) * (7.61676-(-0.80609)));
        }
        else if (tickAnim >= 30 && tickAnim < 130) {
            xx = -16.73346 + (((tickAnim - 30) / 100) * (-16.73346-(-16.73346)));
            yy = 19.66908 + (((tickAnim - 30) / 100) * (19.66908-(19.66908)));
            zz = 7.61676 + (((tickAnim - 30) / 100) * (7.61676-(7.61676)));
        }
        else if (tickAnim >= 130 && tickAnim < 160) {
            xx = -16.73346 + (((tickAnim - 130) / 30) * (0-(-16.73346)));
            yy = 19.66908 + (((tickAnim - 130) / 30) * (0-(19.66908)));
            zz = 7.61676 + (((tickAnim - 130) / 30) * (0-(7.61676)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(xx), tail3.rotateAngleY + (float) Math.toRadians(yy), tail3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (-25.5-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (13.25-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 15) {
            xx = -25.5 + (((tickAnim - 8) / 7) * (-1.74473-(-25.5)));
            yy = 13.25 + (((tickAnim - 8) / 7) * (-23.64796-(13.25)));
            zz = 0 + (((tickAnim - 8) / 7) * (8.89732-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 30) {
            xx = -1.74473 + (((tickAnim - 15) / 15) * (7.21492-(-1.74473)));
            yy = -23.64796 + (((tickAnim - 15) / 15) * (-6.92521-(-23.64796)));
            zz = 8.89732 + (((tickAnim - 15) / 15) * (5.85153-(8.89732)));
        }
        else if (tickAnim >= 30 && tickAnim < 130) {
            xx = 7.21492 + (((tickAnim - 30) / 100) * (7.21492-(7.21492)));
            yy = -6.92521 + (((tickAnim - 30) / 100) * (-6.92521-(-6.92521)));
            zz = 5.85153 + (((tickAnim - 30) / 100) * (5.85153-(5.85153)));
        }
        else if (tickAnim >= 130 && tickAnim < 160) {
            xx = 7.21492 + (((tickAnim - 130) / 30) * (0-(7.21492)));
            yy = -6.92521 + (((tickAnim - 130) / 30) * (0-(-6.92521)));
            zz = 5.85153 + (((tickAnim - 130) / 30) * (0-(5.85153)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(xx), tail4.rotateAngleY + (float) Math.toRadians(yy), tail4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (-17.1331-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (13.36294-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (9.48061-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 30) {
            xx = -17.1331 + (((tickAnim - 15) / 15) * (-12.25-(-17.1331)));
            yy = 13.36294 + (((tickAnim - 15) / 15) * (0-(13.36294)));
            zz = 9.48061 + (((tickAnim - 15) / 15) * (0-(9.48061)));
        }
        else if (tickAnim >= 30 && tickAnim < 130) {
            xx = -12.25 + (((tickAnim - 30) / 100) * (-12.25-(-12.25)));
            yy = 0 + (((tickAnim - 30) / 100) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 100) * (0-(0)));
        }
        else if (tickAnim >= 130 && tickAnim < 160) {
            xx = -12.25 + (((tickAnim - 130) / 30) * (0-(-12.25)));
            yy = 0 + (((tickAnim - 130) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 130) / 30) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg1, leftLeg1.rotateAngleX + (float) Math.toRadians(xx), leftLeg1.rotateAngleY + (float) Math.toRadians(yy), leftLeg1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (34.5-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 30) {
            xx = 34.5 + (((tickAnim - 15) / 15) * (0-(34.5)));
            yy = 0 + (((tickAnim - 15) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 15) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 130) {
            xx = 0 + (((tickAnim - 30) / 100) * (0-(0)));
            yy = 0 + (((tickAnim - 30) / 100) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 100) * (0-(0)));
        }
        else if (tickAnim >= 130 && tickAnim < 160) {
            xx = 0 + (((tickAnim - 130) / 30) * (0-(0)));
            yy = 0 + (((tickAnim - 130) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 130) / 30) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg2, leftLeg2.rotateAngleX + (float) Math.toRadians(xx), leftLeg2.rotateAngleY + (float) Math.toRadians(yy), leftLeg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (-25.25-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 30) {
            xx = -25.25 + (((tickAnim - 15) / 15) * (-36.75-(-25.25)));
            yy = 0 + (((tickAnim - 15) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 15) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 130) {
            xx = -36.75 + (((tickAnim - 30) / 100) * (-36.75-(-36.75)));
            yy = 0 + (((tickAnim - 30) / 100) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 100) * (0-(0)));
        }
        else if (tickAnim >= 130 && tickAnim < 160) {
            xx = -36.75 + (((tickAnim - 130) / 30) * (0-(-36.75)));
            yy = 0 + (((tickAnim - 130) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 130) / 30) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg3, leftLeg3.rotateAngleX + (float) Math.toRadians(xx), leftLeg3.rotateAngleY + (float) Math.toRadians(yy), leftLeg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 30) * (0.475-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 130) {
            xx = 0 + (((tickAnim - 30) / 100) * (0-(0)));
            yy = 0 + (((tickAnim - 30) / 100) * (0-(0)));
            zz = 0.475 + (((tickAnim - 30) / 100) * (0.475-(0.475)));
        }
        else if (tickAnim >= 130 && tickAnim < 160) {
            xx = 0 + (((tickAnim - 130) / 30) * (0-(0)));
            yy = 0 + (((tickAnim - 130) / 30) * (0-(0)));
            zz = 0.475 + (((tickAnim - 130) / 30) * (0-(0.475)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftLeg3.rotationPointX = this.leftLeg3.rotationPointX + (float)(xx);
        this.leftLeg3.rotationPointY = this.leftLeg3.rotationPointY - (float)(yy);
        this.leftLeg3.rotationPointZ = this.leftLeg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (7.75-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 15) / 15) * (50.5-(0)));
            yy = 0 + (((tickAnim - 15) / 15) * (0-(0)));
            zz = 7.75 + (((tickAnim - 15) / 15) * (0-(7.75)));
        }
        else if (tickAnim >= 30 && tickAnim < 130) {
            xx = 50.5 + (((tickAnim - 30) / 100) * (50.5-(50.5)));
            yy = 0 + (((tickAnim - 30) / 100) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 100) * (0-(0)));
        }
        else if (tickAnim >= 130 && tickAnim < 160) {
            xx = 50.5 + (((tickAnim - 130) / 30) * (0-(50.5)));
            yy = 0 + (((tickAnim - 130) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 130) / 30) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg4, leftLeg4.rotateAngleX + (float) Math.toRadians(xx), leftLeg4.rotateAngleY + (float) Math.toRadians(yy), leftLeg4.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 15 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 15) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 15) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 15) * (-1.125-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 130) {
            xx = 0 + (((tickAnim - 30) / 100) * (0-(0)));
            yy = 0 + (((tickAnim - 30) / 100) * (0-(0)));
            zz = -1.125 + (((tickAnim - 30) / 100) * (-1.125-(-1.125)));
        }
        else if (tickAnim >= 130 && tickAnim < 160) {
            xx = 0 + (((tickAnim - 130) / 30) * (0-(0)));
            yy = 0 + (((tickAnim - 130) / 30) * (0-(0)));
            zz = -1.125 + (((tickAnim - 130) / 30) * (0-(-1.125)));
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
            xx = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (6.25-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 15) / 15) * (4.49032-(0)));
            yy = 0 + (((tickAnim - 15) / 15) * (-6.02887-(0)));
            zz = 6.25 + (((tickAnim - 15) / 15) * (-1.3911-(6.25)));
        }
        else if (tickAnim >= 30 && tickAnim < 130) {
            xx = 4.49032 + (((tickAnim - 30) / 100) * (4.49032-(4.49032)));
            yy = -6.02887 + (((tickAnim - 30) / 100) * (-6.02887-(-6.02887)));
            zz = -1.3911 + (((tickAnim - 30) / 100) * (-1.3911-(-1.3911)));
        }
        else if (tickAnim >= 130 && tickAnim < 160) {
            xx = 4.49032 + (((tickAnim - 130) / 30) * (0-(4.49032)));
            yy = -6.02887 + (((tickAnim - 130) / 30) * (0-(-6.02887)));
            zz = -1.3911 + (((tickAnim - 130) / 30) * (0-(-1.3911)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg9, rightLeg9.rotateAngleX + (float) Math.toRadians(xx), rightLeg9.rotateAngleY + (float) Math.toRadians(yy), rightLeg9.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (0.62-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 30) {
            xx = 0.62 + (((tickAnim - 15) / 15) * (16.75-(0.62)));
            yy = 0 + (((tickAnim - 15) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 15) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 130) {
            xx = 16.75 + (((tickAnim - 30) / 100) * (16.75-(16.75)));
            yy = 0 + (((tickAnim - 30) / 100) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 100) * (0-(0)));
        }
        else if (tickAnim >= 130 && tickAnim < 160) {
            xx = 16.75 + (((tickAnim - 130) / 30) * (0-(16.75)));
            yy = 0 + (((tickAnim - 130) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 130) / 30) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg9, rightLeg9.rotateAngleX + (float) Math.toRadians(xx), rightLeg9.rotateAngleY + (float) Math.toRadians(yy), rightLeg9.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (-4.25-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 30) {
            xx = -4.25 + (((tickAnim - 15) / 15) * (-20.75-(-4.25)));
            yy = 0 + (((tickAnim - 15) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 15) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 130) {
            xx = -20.75 + (((tickAnim - 30) / 100) * (-20.75-(-20.75)));
            yy = 0 + (((tickAnim - 30) / 100) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 100) * (0-(0)));
        }
        else if (tickAnim >= 130 && tickAnim < 160) {
            xx = -20.75 + (((tickAnim - 130) / 30) * (0-(-20.75)));
            yy = 0 + (((tickAnim - 130) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 130) / 30) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg11, rightLeg11.rotateAngleX + (float) Math.toRadians(xx), rightLeg11.rotateAngleY + (float) Math.toRadians(yy), rightLeg11.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (2.52366-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (-5.93999-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (11.54332-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 30) {
            xx = 2.52366 + (((tickAnim - 15) / 15) * (0.5-(2.52366)));
            yy = -5.93999 + (((tickAnim - 15) / 15) * (0-(-5.93999)));
            zz = 11.54332 + (((tickAnim - 15) / 15) * (0-(11.54332)));
        }
        else if (tickAnim >= 30 && tickAnim < 130) {
            xx = 0.5 + (((tickAnim - 30) / 100) * (0.5-(0.5)));
            yy = 0 + (((tickAnim - 30) / 100) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 100) * (0-(0)));
        }
        else if (tickAnim >= 130 && tickAnim < 160) {
            xx = 0.5 + (((tickAnim - 130) / 30) * (0-(0.5)));
            yy = 0 + (((tickAnim - 130) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 130) / 30) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg12, rightLeg12.rotateAngleX + (float) Math.toRadians(xx), rightLeg12.rotateAngleY + (float) Math.toRadians(yy), rightLeg12.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (20.85524-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (12.09558-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (14.46675-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 30) {
            xx = 20.85524 + (((tickAnim - 15) / 15) * (6.231-(20.85524)));
            yy = 12.09558 + (((tickAnim - 15) / 15) * (-1.30282-(12.09558)));
            zz = 14.46675 + (((tickAnim - 15) / 15) * (23.05343-(14.46675)));
        }
        else if (tickAnim >= 30 && tickAnim < 130) {
            xx = 6.231 + (((tickAnim - 30) / 100) * (6.231-(6.231)));
            yy = -1.30282 + (((tickAnim - 30) / 100) * (-1.30282-(-1.30282)));
            zz = 23.05343 + (((tickAnim - 30) / 100) * (23.05343-(23.05343)));
        }
        else if (tickAnim >= 130 && tickAnim < 160) {
            xx = 6.231 + (((tickAnim - 130) / 30) * (0-(6.231)));
            yy = -1.30282 + (((tickAnim - 130) / 30) * (0-(-1.30282)));
            zz = 23.05343 + (((tickAnim - 130) / 30) * (0-(23.05343)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm, rightArm.rotateAngleX + (float) Math.toRadians(xx), rightArm.rotateAngleY + (float) Math.toRadians(yy), rightArm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (-40.04-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 15) {
            xx = -40.04 + (((tickAnim - 8) / 7) * (-25-(-40.04)));
            yy = 0 + (((tickAnim - 8) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 7) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 30) {
            xx = -25 + (((tickAnim - 15) / 15) * (-42.5-(-25)));
            yy = 0 + (((tickAnim - 15) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 15) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 130) {
            xx = -42.5 + (((tickAnim - 30) / 100) * (-42.5-(-42.5)));
            yy = 0 + (((tickAnim - 30) / 100) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 100) * (0-(0)));
        }
        else if (tickAnim >= 130 && tickAnim < 145) {
            xx = -42.5 + (((tickAnim - 130) / 15) * (-37-(-42.5)));
            yy = 0 + (((tickAnim - 130) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 130) / 15) * (0-(0)));
        }
        else if (tickAnim >= 145 && tickAnim < 160) {
            xx = -37 + (((tickAnim - 145) / 15) * (0-(-37)));
            yy = 0 + (((tickAnim - 145) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 145) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm10, rightArm10.rotateAngleX + (float) Math.toRadians(xx), rightArm10.rotateAngleY + (float) Math.toRadians(yy), rightArm10.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (-1.225-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 130) {
            xx = 0 + (((tickAnim - 8) / 122) * (0-(0)));
            yy = -1.225 + (((tickAnim - 8) / 122) * (-1.225-(-1.225)));
            zz = 0 + (((tickAnim - 8) / 122) * (0-(0)));
        }
        else if (tickAnim >= 130 && tickAnim < 160) {
            xx = 0 + (((tickAnim - 130) / 30) * (0-(0)));
            yy = -1.225 + (((tickAnim - 130) / 30) * (0-(-1.225)));
            zz = 0 + (((tickAnim - 130) / 30) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightArm10.rotationPointX = this.rightArm10.rotationPointX + (float)(xx);
        this.rightArm10.rotationPointY = this.rightArm10.rotationPointY - (float)(yy);
        this.rightArm10.rotationPointZ = this.rightArm10.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (65.75-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 15) {
            xx = 65.75 + (((tickAnim - 8) / 7) * (3.02972-(65.75)));
            yy = 0 + (((tickAnim - 8) / 7) * (0.48849-(0)));
            zz = 0 + (((tickAnim - 8) / 7) * (-12.24563-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 30) {
            xx = 3.02972 + (((tickAnim - 15) / 15) * (11.01961-(3.02972)));
            yy = 0.48849 + (((tickAnim - 15) / 15) * (-2.56573-(0.48849)));
            zz = -12.24563 + (((tickAnim - 15) / 15) * (-4.12411-(-12.24563)));
        }
        else if (tickAnim >= 30 && tickAnim < 130) {
            xx = 11.01961 + (((tickAnim - 30) / 100) * (11.01961-(11.01961)));
            yy = -2.56573 + (((tickAnim - 30) / 100) * (-2.56573-(-2.56573)));
            zz = -4.12411 + (((tickAnim - 30) / 100) * (-4.12411-(-4.12411)));
        }
        else if (tickAnim >= 130 && tickAnim < 145) {
            xx = 11.01961 + (((tickAnim - 130) / 15) * (67.27974-(11.01961)));
            yy = -2.56573 + (((tickAnim - 130) / 15) * (-14.73599-(-2.56573)));
            zz = -4.12411 + (((tickAnim - 130) / 15) * (0.79906-(-4.12411)));
        }
        else if (tickAnim >= 145 && tickAnim < 160) {
            xx = 67.27974 + (((tickAnim - 145) / 15) * (0-(67.27974)));
            yy = -14.73599 + (((tickAnim - 145) / 15) * (0-(-14.73599)));
            zz = 0.79906 + (((tickAnim - 145) / 15) * (0-(0.79906)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm11, rightArm11.rotateAngleX + (float) Math.toRadians(xx), rightArm11.rotateAngleY + (float) Math.toRadians(yy), rightArm11.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (-0.6-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (1.175-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (-1.15-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 15) {
            xx = -0.6 + (((tickAnim - 8) / 7) * (0-(-0.6)));
            yy = 1.175 + (((tickAnim - 8) / 7) * (1.1-(1.175)));
            zz = -1.15 + (((tickAnim - 8) / 7) * (0-(-1.15)));
        }
        else if (tickAnim >= 15 && tickAnim < 130) {
            xx = 0 + (((tickAnim - 15) / 115) * (0-(0)));
            yy = 1.1 + (((tickAnim - 15) / 115) * (1.1-(1.1)));
            zz = 0 + (((tickAnim - 15) / 115) * (0-(0)));
        }
        else if (tickAnim >= 130 && tickAnim < 145) {
            xx = 0 + (((tickAnim - 130) / 15) * (0-(0)));
            yy = 1.1 + (((tickAnim - 130) / 15) * (2.025-(1.1)));
            zz = 0 + (((tickAnim - 130) / 15) * (-0.55-(0)));
        }
        else if (tickAnim >= 145 && tickAnim < 160) {
            xx = 0 + (((tickAnim - 145) / 15) * (0-(0)));
            yy = 2.025 + (((tickAnim - 145) / 15) * (0-(2.025)));
            zz = -0.55 + (((tickAnim - 145) / 15) * (0-(-0.55)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightArm11.rotationPointX = this.rightArm11.rotationPointX + (float)(xx);
        this.rightArm11.rotationPointY = this.rightArm11.rotationPointY - (float)(yy);
        this.rightArm11.rotationPointZ = this.rightArm11.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (-25.5-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 130) {
            xx = 0 + (((tickAnim - 15) / 115) * (0-(0)));
            yy = 0 + (((tickAnim - 15) / 115) * (0-(0)));
            zz = -25.5 + (((tickAnim - 15) / 115) * (-25.5-(-25.5)));
        }
        else if (tickAnim >= 130 && tickAnim < 160) {
            xx = 0 + (((tickAnim - 130) / 30) * (0-(0)));
            yy = 0 + (((tickAnim - 130) / 30) * (0-(0)));
            zz = -25.5 + (((tickAnim - 130) / 30) * (0-(-25.5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm, leftArm.rotateAngleX + (float) Math.toRadians(xx), leftArm.rotateAngleY + (float) Math.toRadians(yy), leftArm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (0.70433-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (2.57826-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0.59058-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 23) {
            xx = 0.70433 + (((tickAnim - 15) / 8) * (-53.93455-(0.70433)));
            yy = 2.57826 + (((tickAnim - 15) / 8) * (2.57826-(2.57826)));
            zz = 0.59058 + (((tickAnim - 15) / 8) * (0.59058-(0.59058)));
        }
        else if (tickAnim >= 23 && tickAnim < 30) {
            xx = -53.93455 + (((tickAnim - 23) / 7) * (-51.29567-(-53.93455)));
            yy = 2.57826 + (((tickAnim - 23) / 7) * (2.57826-(2.57826)));
            zz = 0.59058 + (((tickAnim - 23) / 7) * (0.59058-(0.59058)));
        }
        else if (tickAnim >= 30 && tickAnim < 130) {
            xx = -51.29567 + (((tickAnim - 30) / 100) * (-51.29567-(-51.29567)));
            yy = 2.57826 + (((tickAnim - 30) / 100) * (2.57826-(2.57826)));
            zz = 0.59058 + (((tickAnim - 30) / 100) * (0.59058-(0.59058)));
        }
        else if (tickAnim >= 130 && tickAnim < 160) {
            xx = -51.29567 + (((tickAnim - 130) / 30) * (0-(-51.29567)));
            yy = 2.57826 + (((tickAnim - 130) / 30) * (0-(2.57826)));
            zz = 0.59058 + (((tickAnim - 130) / 30) * (0-(0.59058)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm2, leftArm2.rotateAngleX + (float) Math.toRadians(xx), leftArm2.rotateAngleY + (float) Math.toRadians(yy), leftArm2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 30) * (-1.65-(0)));
            zz = 0 + (((tickAnim - 0) / 30) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 130) {
            xx = 0 + (((tickAnim - 30) / 100) * (0-(0)));
            yy = -1.65 + (((tickAnim - 30) / 100) * (-1.65-(-1.65)));
            zz = 0 + (((tickAnim - 30) / 100) * (0-(0)));
        }
        else if (tickAnim >= 130 && tickAnim < 160) {
            xx = 0 + (((tickAnim - 130) / 30) * (0-(0)));
            yy = -1.65 + (((tickAnim - 130) / 30) * (0-(-1.65)));
            zz = 0 + (((tickAnim - 130) / 30) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftArm2.rotationPointX = this.leftArm2.rotationPointX + (float)(xx);
        this.leftArm2.rotationPointY = this.leftArm2.rotationPointY - (float)(yy);
        this.leftArm2.rotationPointZ = this.leftArm2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (-9.99832-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (-0.17708-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (30.17448-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 23) {
            xx = -9.99832 + (((tickAnim - 15) / 8) * (48-(-9.99832)));
            yy = -0.17708 + (((tickAnim - 15) / 8) * (0-(-0.17708)));
            zz = 30.17448 + (((tickAnim - 15) / 8) * (0-(30.17448)));
        }
        else if (tickAnim >= 23 && tickAnim < 30) {
            xx = 48 + (((tickAnim - 23) / 7) * (33.41478-(48)));
            yy = 0 + (((tickAnim - 23) / 7) * (-5.49227-(0)));
            zz = 0 + (((tickAnim - 23) / 7) * (5.69486-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 130) {
            xx = 33.41478 + (((tickAnim - 30) / 100) * (33.41478-(33.41478)));
            yy = -5.49227 + (((tickAnim - 30) / 100) * (-5.49227-(-5.49227)));
            zz = 5.69486 + (((tickAnim - 30) / 100) * (5.69486-(5.69486)));
        }
        else if (tickAnim >= 130 && tickAnim < 160) {
            xx = 33.41478 + (((tickAnim - 130) / 30) * (0-(33.41478)));
            yy = -5.49227 + (((tickAnim - 130) / 30) * (0-(-5.49227)));
            zz = 5.69486 + (((tickAnim - 130) / 30) * (0-(5.69486)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm3, leftArm3.rotateAngleX + (float) Math.toRadians(xx), leftArm3.rotateAngleY + (float) Math.toRadians(yy), leftArm3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 0) / 30) * (0.125-(0)));
            yy = 0 + (((tickAnim - 0) / 30) * (0.975-(0)));
            zz = 0 + (((tickAnim - 0) / 30) * (-0.2-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 130) {
            xx = 0.125 + (((tickAnim - 30) / 100) * (0.125-(0.125)));
            yy = 0.975 + (((tickAnim - 30) / 100) * (0.975-(0.975)));
            zz = -0.2 + (((tickAnim - 30) / 100) * (-0.2-(-0.2)));
        }
        else if (tickAnim >= 130 && tickAnim < 160) {
            xx = 0.125 + (((tickAnim - 130) / 30) * (0-(0.125)));
            yy = 0.975 + (((tickAnim - 130) / 30) * (0-(0.975)));
            zz = -0.2 + (((tickAnim - 130) / 30) * (0-(-0.2)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftArm3.rotationPointX = this.leftArm3.rotationPointX + (float)(xx);
        this.leftArm3.rotationPointY = this.leftArm3.rotationPointY - (float)(yy);
        this.leftArm3.rotationPointZ = this.leftArm3.rotationPointZ + (float)(zz);
        
    }
    public void animLay(EntityLivingBase entitylivinghipIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraAntarctopelta entity = (EntityPrehistoricFloraAntarctopelta) entitylivinghipIn;
        int animCycle = 50;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
     if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (-17-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = -17 + (((tickAnim - 20) / 10) * (-17-(-17)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = -17 + (((tickAnim - 30) / 20) * (0-(-17)));
            yy = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(hip, hip.rotateAngleX + (float) Math.toRadians(xx), hip.rotateAngleY + (float) Math.toRadians(yy), hip.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (-3.5-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (3.425-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            yy = -3.5 + (((tickAnim - 20) / 10) * (-3.5-(-3.5)));
            zz = 3.425 + (((tickAnim - 20) / 10) * (3.425-(3.425)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            yy = -3.5 + (((tickAnim - 30) / 20) * (0-(-3.5)));
            zz = 3.425 + (((tickAnim - 30) / 20) * (0-(3.425)));
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
            xx = 0 + (((tickAnim - 0) / 20) * (8.75-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 8.75 + (((tickAnim - 20) / 10) * (8.75-(8.75)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 8.75 + (((tickAnim - 30) / 20) * (0-(8.75)));
            yy = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body2, body2.rotateAngleX + (float) Math.toRadians(xx), body2.rotateAngleY + (float) Math.toRadians(yy), body2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (5-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 5 + (((tickAnim - 20) / 10) * (5-(5)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 5 + (((tickAnim - 30) / 20) * (0-(5)));
            yy = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(xx), chest.rotateAngleY + (float) Math.toRadians(yy), chest.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (13-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 13 + (((tickAnim - 20) / 10) * (13-(13)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 13 + (((tickAnim - 30) / 20) * (0-(13)));
            yy = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck1, neck1.rotateAngleX + (float) Math.toRadians(xx), neck1.rotateAngleY + (float) Math.toRadians(yy), neck1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 10) / 10) * (6.25-(0)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 6.25 + (((tickAnim - 20) / 10) * (6.25-(6.25)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 6.25 + (((tickAnim - 30) / 20) * (0-(6.25)));
            yy = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(xx), tail3.rotateAngleY + (float) Math.toRadians(yy), tail3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (-12.25-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = -12.25 + (((tickAnim - 10) / 10) * (8.75-(-12.25)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 8.75 + (((tickAnim - 20) / 10) * (8.75-(8.75)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 8.75 + (((tickAnim - 30) / 20) * (0-(8.75)));
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
            xx = 0 + (((tickAnim - 0) / 20) * (-19-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (11.75-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = -19 + (((tickAnim - 20) / 10) * (-19-(-19)));
            yy = 11.75 + (((tickAnim - 20) / 10) * (11.75-(11.75)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = -19 + (((tickAnim - 30) / 20) * (0-(-19)));
            yy = 11.75 + (((tickAnim - 30) / 20) * (0-(11.75)));
            zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg1, leftLeg1.rotateAngleX + (float) Math.toRadians(xx), leftLeg1.rotateAngleY + (float) Math.toRadians(yy), leftLeg1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (33-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 33 + (((tickAnim - 20) / 10) * (33-(33)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 33 + (((tickAnim - 30) / 20) * (0-(33)));
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
            xx = 0 + (((tickAnim - 0) / 20) * (-24.25-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = -24.25 + (((tickAnim - 20) / 10) * (-24.25-(-24.25)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = -24.25 + (((tickAnim - 30) / 20) * (0-(-24.25)));
            yy = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg3, leftLeg3.rotateAngleX + (float) Math.toRadians(xx), leftLeg3.rotateAngleY + (float) Math.toRadians(yy), leftLeg3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (24.23289-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (-1.54866-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (1.26572-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 24.23289 + (((tickAnim - 20) / 10) * (24.23289-(24.23289)));
            yy = -1.54866 + (((tickAnim - 20) / 10) * (-1.54866-(-1.54866)));
            zz = 1.26572 + (((tickAnim - 20) / 10) * (1.26572-(1.26572)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 24.23289 + (((tickAnim - 30) / 20) * (0-(24.23289)));
            yy = -1.54866 + (((tickAnim - 30) / 20) * (0-(-1.54866)));
            zz = 1.26572 + (((tickAnim - 30) / 20) * (0-(1.26572)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg4, leftLeg4.rotateAngleX + (float) Math.toRadians(xx), leftLeg4.rotateAngleY + (float) Math.toRadians(yy), leftLeg4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (-19-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (-11.75-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = -19 + (((tickAnim - 20) / 10) * (-19-(-19)));
            yy = -11.75 + (((tickAnim - 20) / 10) * (-11.75-(-11.75)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = -19 + (((tickAnim - 30) / 20) * (0-(-19)));
            yy = -11.75 + (((tickAnim - 30) / 20) * (0-(-11.75)));
            zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg9, rightLeg9.rotateAngleX + (float) Math.toRadians(xx), rightLeg9.rotateAngleY + (float) Math.toRadians(yy), rightLeg9.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (33-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 33 + (((tickAnim - 20) / 10) * (33-(33)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 33 + (((tickAnim - 30) / 20) * (0-(33)));
            yy = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg9, rightLeg9.rotateAngleX + (float) Math.toRadians(xx), rightLeg9.rotateAngleY + (float) Math.toRadians(yy), rightLeg9.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (-24.25-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = -24.25 + (((tickAnim - 20) / 10) * (-24.25-(-24.25)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = -24.25 + (((tickAnim - 30) / 20) * (0-(-24.25)));
            yy = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg11, rightLeg11.rotateAngleX + (float) Math.toRadians(xx), rightLeg11.rotateAngleY + (float) Math.toRadians(yy), rightLeg11.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (24.23289-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (1.54866-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (-1.26572-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 24.23289 + (((tickAnim - 20) / 10) * (24.23289-(24.23289)));
            yy = 1.54866 + (((tickAnim - 20) / 10) * (1.54866-(1.54866)));
            zz = -1.26572 + (((tickAnim - 20) / 10) * (-1.26572-(-1.26572)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 24.23289 + (((tickAnim - 30) / 20) * (0-(24.23289)));
            yy = 1.54866 + (((tickAnim - 30) / 20) * (0-(1.54866)));
            zz = -1.26572 + (((tickAnim - 30) / 20) * (0-(-1.26572)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg12, rightLeg12.rotateAngleX + (float) Math.toRadians(xx), rightLeg12.rotateAngleY + (float) Math.toRadians(yy), rightLeg12.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (-22-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (19.25-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = -22 + (((tickAnim - 20) / 10) * (-22-(-22)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 19.25 + (((tickAnim - 20) / 10) * (19.25-(19.25)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = -22 + (((tickAnim - 30) / 20) * (0-(-22)));
            yy = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            zz = 19.25 + (((tickAnim - 30) / 20) * (0-(19.25)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm, rightArm.rotateAngleX + (float) Math.toRadians(xx), rightArm.rotateAngleY + (float) Math.toRadians(yy), rightArm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (19.52209-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (3.82918-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (-11.246-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 19.52209 + (((tickAnim - 20) / 10) * (19.52209-(19.52209)));
            yy = 3.82918 + (((tickAnim - 20) / 10) * (3.82918-(3.82918)));
            zz = -11.246 + (((tickAnim - 20) / 10) * (-11.246-(-11.246)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 19.52209 + (((tickAnim - 30) / 20) * (0-(19.52209)));
            yy = 3.82918 + (((tickAnim - 30) / 20) * (0-(3.82918)));
            zz = -11.246 + (((tickAnim - 30) / 20) * (0-(-11.246)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm11, rightArm11.rotateAngleX + (float) Math.toRadians(xx), rightArm11.rotateAngleY + (float) Math.toRadians(yy), rightArm11.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0.775-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            yy = 0.775 + (((tickAnim - 20) / 10) * (0.775-(0.775)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            yy = 0.775 + (((tickAnim - 30) / 20) * (0-(0.775)));
            zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightArm11.rotationPointX = this.rightArm11.rotationPointX + (float)(xx);
        this.rightArm11.rotationPointY = this.rightArm11.rotationPointY - (float)(yy);
        this.rightArm11.rotationPointZ = this.rightArm11.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (-22-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (-19.25-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = -22 + (((tickAnim - 20) / 10) * (-22-(-22)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = -19.25 + (((tickAnim - 20) / 10) * (-19.25-(-19.25)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = -22 + (((tickAnim - 30) / 20) * (0-(-22)));
            yy = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            zz = -19.25 + (((tickAnim - 30) / 20) * (0-(-19.25)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm, leftArm.rotateAngleX + (float) Math.toRadians(xx), leftArm.rotateAngleY + (float) Math.toRadians(yy), leftArm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (19.52209-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (-3.82918-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (11.246-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 19.52209 + (((tickAnim - 20) / 10) * (19.52209-(19.52209)));
            yy = -3.82918 + (((tickAnim - 20) / 10) * (-3.82918-(-3.82918)));
            zz = 11.246 + (((tickAnim - 20) / 10) * (11.246-(11.246)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 19.52209 + (((tickAnim - 30) / 20) * (0-(19.52209)));
            yy = -3.82918 + (((tickAnim - 30) / 20) * (0-(-3.82918)));
            zz = 11.246 + (((tickAnim - 30) / 20) * (0-(11.246)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm3, leftArm3.rotateAngleX + (float) Math.toRadians(xx), leftArm3.rotateAngleY + (float) Math.toRadians(yy), leftArm3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0.775-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            yy = 0.775 + (((tickAnim - 20) / 10) * (0.775-(0.775)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            yy = 0.775 + (((tickAnim - 30) / 20) * (0-(0.775)));
            zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftArm3.rotationPointX = this.leftArm3.rotationPointX + (float)(xx);
        this.leftArm3.rotationPointY = this.leftArm3.rotationPointY - (float)(yy);
        this.leftArm3.rotationPointZ = this.leftArm3.rotationPointZ + (float)(zz);

    }
    public void animNest(EntityLivingBase entitylivinghipIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraAntarctopelta entity = (EntityPrehistoricFloraAntarctopelta) entitylivinghipIn;
        int animCycle = 50;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
     if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (14.5-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 33) {
            xx = 14.5 + (((tickAnim - 15) / 18) * (-17.5-(14.5)));
            yy = 0 + (((tickAnim - 15) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 18) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 50) {
            xx = -17.5 + (((tickAnim - 33) / 17) * (0-(-17.5)));
            yy = 0 + (((tickAnim - 33) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 17) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg1, leftLeg1.rotateAngleX + (float) Math.toRadians(xx), leftLeg1.rotateAngleY + (float) Math.toRadians(yy), leftLeg1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (13.5-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 23) {
            xx = 13.5 + (((tickAnim - 15) / 8) * (-19.58-(13.5)));
            yy = 0 + (((tickAnim - 15) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 8) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 33) {
            xx = -19.58 + (((tickAnim - 23) / 10) * (-14.5-(-19.58)));
            yy = 0 + (((tickAnim - 23) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 10) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 50) {
            xx = -14.5 + (((tickAnim - 33) / 17) * (0-(-14.5)));
            yy = 0 + (((tickAnim - 33) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 17) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg2, leftLeg2.rotateAngleX + (float) Math.toRadians(xx), leftLeg2.rotateAngleY + (float) Math.toRadians(yy), leftLeg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 15) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 15) / 8) * (1.325-(0)));
            zz = 0 + (((tickAnim - 15) / 8) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 23) / 10) * (0-(0)));
            yy = 1.325 + (((tickAnim - 23) / 10) * (0-(1.325)));
            zz = 0 + (((tickAnim - 23) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftLeg2.rotationPointX = this.leftLeg2.rotationPointX + (float)(xx);
        this.leftLeg2.rotationPointY = this.leftLeg2.rotationPointY - (float)(yy);
        this.leftLeg2.rotationPointZ = this.leftLeg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (25.5-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 19) {
            xx = 25.5 + (((tickAnim - 15) / 4) * (-5.78-(25.5)));
            yy = 0 + (((tickAnim - 15) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 4) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 23) {
            xx = -5.78 + (((tickAnim - 19) / 4) * (-23.32-(-5.78)));
            yy = 0 + (((tickAnim - 19) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 19) / 4) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 33) {
            xx = -23.32 + (((tickAnim - 23) / 10) * (13.25-(-23.32)));
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
        this.setRotateAngle(leftLeg3, leftLeg3.rotateAngleX + (float) Math.toRadians(xx), leftLeg3.rotateAngleY + (float) Math.toRadians(yy), leftLeg3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (39-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 23) {
            xx = 39 + (((tickAnim - 15) / 8) * (85.25-(39)));
            yy = 0 + (((tickAnim - 15) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 8) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 33) {
            xx = 85.25 + (((tickAnim - 23) / 10) * (19-(85.25)));
            yy = 0 + (((tickAnim - 23) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 10) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 50) {
            xx = 19 + (((tickAnim - 33) / 17) * (0-(19)));
            yy = 0 + (((tickAnim - 33) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 17) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg4, leftLeg4.rotateAngleX + (float) Math.toRadians(xx), leftLeg4.rotateAngleY + (float) Math.toRadians(yy), leftLeg4.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 15) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 15) / 4) * (1.2-(0)));
            zz = 0 + (((tickAnim - 15) / 4) * (-0.14-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 19) / 4) * (0-(0)));
            yy = 1.2 + (((tickAnim - 19) / 4) * (0-(1.2)));
            zz = -0.14 + (((tickAnim - 19) / 4) * (-0.275-(-0.14)));
        }
        else if (tickAnim >= 23 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 23) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 23) / 10) * (0-(0)));
            zz = -0.275 + (((tickAnim - 23) / 10) * (0-(-0.275)));
        }
        else if (tickAnim >= 33 && tickAnim < 42) {
            xx = 0 + (((tickAnim - 33) / 9) * (0-(0)));
            yy = 0 + (((tickAnim - 33) / 9) * (0.55-(0)));
            zz = 0 + (((tickAnim - 33) / 9) * (0-(0)));
        }
        else if (tickAnim >= 42 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 42) / 8) * (0-(0)));
            yy = 0.55 + (((tickAnim - 42) / 8) * (0-(0.55)));
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

    }
    public void animEat(EntityLivingBase entitylivinghipIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraAntarctopelta entity = (EntityPrehistoricFloraAntarctopelta) entitylivinghipIn;
        int animCycle = 20;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
     if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (37.5-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 37.5 + (((tickAnim - 10) / 10) * (0-(37.5)));
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
            xx = 0 + (((tickAnim - 0) / 10) * (18-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 18 + (((tickAnim - 10) / 3) * (24-(18)));
            yy = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 3) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 20) {
            xx = 24 + (((tickAnim - 13) / 7) * (0-(24)));
            yy = 0 + (((tickAnim - 13) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(xx), neck2.rotateAngleY + (float) Math.toRadians(yy), neck2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 10) / 3) * (24.25-(0)));
            yy = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 3) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 20) {
            xx = 24.25 + (((tickAnim - 13) / 7) * (0-(24.25)));
            yy = 0 + (((tickAnim - 13) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (30.25-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 30.25 + (((tickAnim - 10) / 3) * (0-(30.25)));
            yy = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(xx), jaw.rotateAngleY + (float) Math.toRadians(yy), jaw.rotateAngleZ + (float) Math.toRadians(zz));

    }
    public void animNoise(EntityLivingBase entitylivinghipIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraAntarctopelta entity = (EntityPrehistoricFloraAntarctopelta) entitylivinghipIn;
        int animCycle = 40;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
     if (tickAnim >= 0 && tickAnim < 25) {
            xx = -0-Math.sin((Math.PI/180)*(((double)tickAnim/20)*300/0.5))*0.1 + (((tickAnim - 0) / 25) * (-0.15-Math.sin((Math.PI/180)*(((double)tickAnim/20)*300/0.75))*1-(-0-Math.sin((Math.PI/180)*(((double)tickAnim/20)*300/0.5))*0.1)));
            yy = 0 + (((tickAnim - 0) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 25) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 40) {
            xx = -0.15-Math.sin((Math.PI/180)*(((double)tickAnim/20)*300/0.75))*1 + (((tickAnim - 25) / 15) * (0-(-0.15-Math.sin((Math.PI/180)*(((double)tickAnim/20)*300/0.75))*1)));
            yy = 0 + (((tickAnim - 25) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck1, neck1.rotateAngleX + (float) Math.toRadians(xx), neck1.rotateAngleY + (float) Math.toRadians(yy), neck1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 25) {
            xx = -0.8-Math.sin((Math.PI/180)*(((double)tickAnim/20)*300/0.75-50))*1 + (((tickAnim - 0) / 25) * (-3.95-Math.sin((Math.PI/180)*(((double)tickAnim/20)*300/0.75-50))*-4-(-0.8-Math.sin((Math.PI/180)*(((double)tickAnim/20)*300/0.75-50))*1)));
            yy = 0 + (((tickAnim - 0) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 25) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 40) {
            xx = -3.95-Math.sin((Math.PI/180)*(((double)tickAnim/20)*300/0.75-50))*-4 + (((tickAnim - 25) / 15) * (0-(-3.95-Math.sin((Math.PI/180)*(((double)tickAnim/20)*300/0.75-50))*-4)));
            yy = 0 + (((tickAnim - 25) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(xx), neck2.rotateAngleY + (float) Math.toRadians(yy), neck2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 0) / 25) * (-4.425-Math.sin((Math.PI/180)*(((double)tickAnim/20)*300/0.75))*-4-(0)));
            yy = 0 + (((tickAnim - 0) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 25) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 40) {
            xx = -4.425-Math.sin((Math.PI/180)*(((double)tickAnim/20)*300/0.75))*-4 + (((tickAnim - 25) / 15) * (0-(-4.425-Math.sin((Math.PI/180)*(((double)tickAnim/20)*300/0.75))*-4)));
            yy = 0 + (((tickAnim - 25) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (17.2-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 18) {
            xx = 17.2 + (((tickAnim - 10) / 8) * (0-(17.2)));
            yy = 0 + (((tickAnim - 10) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 8) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 27) {
            xx = 0 + (((tickAnim - 18) / 9) * (17.2-(0)));
            yy = 0 + (((tickAnim - 18) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 9) * (0-(0)));
        }
        else if (tickAnim >= 27 && tickAnim < 40) {
            xx = 17.2 + (((tickAnim - 27) / 13) * (0-(17.2)));
            yy = 0 + (((tickAnim - 27) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 27) / 13) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(xx), jaw.rotateAngleY + (float) Math.toRadians(yy), jaw.rotateAngleZ + (float) Math.toRadians(zz));

    }
    public void animAlert(EntityLivingBase entitylivinghipIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraAntarctopelta entity = (EntityPrehistoricFloraAntarctopelta) entitylivinghipIn;
        int animCycle = 205;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
     if (tickAnim >= 0 && tickAnim < 30) {
            xx = -11.5-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-50))*15 + (((tickAnim - 0) / 30) * (-19-(-11.5-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-50))*15)));
            yy = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 30) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 168) {
            xx = -19 + (((tickAnim - 30) / 138) * (-19-(-19)));
            yy = 0 + (((tickAnim - 30) / 138) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 138) * (0-(0)));
        }
        else if (tickAnim >= 168 && tickAnim < 185) {
            xx = -19 + (((tickAnim - 168) / 17) * (-5-(-19)));
            yy = 0 + (((tickAnim - 168) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 168) / 17) * (0-(0)));
        }
        else if (tickAnim >= 185 && tickAnim < 205) {
            xx = -5 + (((tickAnim - 185) / 20) * (0-(-5)));
            yy = 0 + (((tickAnim - 185) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 185) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(hip, hip.rotateAngleX + (float) Math.toRadians(xx), hip.rotateAngleY + (float) Math.toRadians(yy), hip.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 0) / 23) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 23) * (-4.54-(0)));
            zz = 0 + (((tickAnim - 0) / 23) * (2.68-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 23) / 7) * (0-(0)));
            yy = -4.54 + (((tickAnim - 23) / 7) * (-5.125-(-4.54)));
            zz = 2.68 + (((tickAnim - 23) / 7) * (3.575-(2.68)));
        }
        else if (tickAnim >= 30 && tickAnim < 168) {
            xx = 0 + (((tickAnim - 30) / 138) * (0-(0)));
            yy = -5.125 + (((tickAnim - 30) / 138) * (-5.125-(-5.125)));
            zz = 3.575 + (((tickAnim - 30) / 138) * (3.575-(3.575)));
        }
        else if (tickAnim >= 168 && tickAnim < 185) {
            xx = 0 + (((tickAnim - 168) / 17) * (0-(0)));
            yy = -5.125 + (((tickAnim - 168) / 17) * (-2.17-(-5.125)));
            zz = 3.575 + (((tickAnim - 168) / 17) * (0.98-(3.575)));
        }
        else if (tickAnim >= 185 && tickAnim < 205) {
            xx = 0 + (((tickAnim - 185) / 20) * (0-(0)));
            yy = -2.17 + (((tickAnim - 185) / 20) * (0-(-2.17)));
            zz = 0.98 + (((tickAnim - 185) / 20) * (0-(0.98)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.hip.rotationPointX = this.hip.rotationPointX + (float)(xx);
        this.hip.rotationPointY = this.hip.rotationPointY - (float)(yy);
        this.hip.rotationPointZ = this.hip.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 30) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 30) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 30) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 10) * (-0.775-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 49) {
            xx = 0 + (((tickAnim - 40) / 9) * (0-(0)));
            yy = 0 + (((tickAnim - 40) / 9) * (0-(0)));
            zz = -0.775 + (((tickAnim - 40) / 9) * (0-(-0.775)));
        }
        else if (tickAnim >= 49 && tickAnim < 59) {
            xx = 0 + (((tickAnim - 49) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 49) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 49) / 10) * (-0.775-(0)));
        }
        else if (tickAnim >= 59 && tickAnim < 68) {
            xx = 0 + (((tickAnim - 59) / 9) * (0-(0)));
            yy = 0 + (((tickAnim - 59) / 9) * (0-(0)));
            zz = -0.775 + (((tickAnim - 59) / 9) * (0-(-0.775)));
        }
        else if (tickAnim >= 68 && tickAnim < 78) {
            xx = 0 + (((tickAnim - 68) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 68) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 68) / 10) * (-0.775-(0)));
        }
        else if (tickAnim >= 78 && tickAnim < 88) {
            xx = 0 + (((tickAnim - 78) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 78) / 10) * (0-(0)));
            zz = -0.775 + (((tickAnim - 78) / 10) * (0-(-0.775)));
        }
        else if (tickAnim >= 88 && tickAnim < 98) {
            xx = 0 + (((tickAnim - 88) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 88) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 88) / 10) * (-0.775-(0)));
        }
        else if (tickAnim >= 98 && tickAnim < 107) {
            xx = 0 + (((tickAnim - 98) / 9) * (0-(0)));
            yy = 0 + (((tickAnim - 98) / 9) * (0-(0)));
            zz = -0.775 + (((tickAnim - 98) / 9) * (0-(-0.775)));
        }
        else if (tickAnim >= 107 && tickAnim < 117) {
            xx = 0 + (((tickAnim - 107) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 107) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 107) / 10) * (-0.775-(0)));
        }
        else if (tickAnim >= 117 && tickAnim < 126) {
            xx = 0 + (((tickAnim - 117) / 9) * (0-(0)));
            yy = 0 + (((tickAnim - 117) / 9) * (0-(0)));
            zz = -0.775 + (((tickAnim - 117) / 9) * (0-(-0.775)));
        }
        else if (tickAnim >= 126 && tickAnim < 136) {
            xx = 0 + (((tickAnim - 126) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 126) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 126) / 10) * (-0.775-(0)));
        }
        else if (tickAnim >= 136 && tickAnim < 145) {
            xx = 0 + (((tickAnim - 136) / 9) * (0-(0)));
            yy = 0 + (((tickAnim - 136) / 9) * (0-(0)));
            zz = -0.775 + (((tickAnim - 136) / 9) * (0-(-0.775)));
        }
        else if (tickAnim >= 145 && tickAnim < 168) {
            xx = 0 + (((tickAnim - 145) / 23) * (0-(0)));
            yy = 0 + (((tickAnim - 145) / 23) * (0-(0)));
            zz = 0 + (((tickAnim - 145) / 23) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body1, body1.rotateAngleX + (float) Math.toRadians(xx), body1.rotateAngleY + (float) Math.toRadians(yy), body1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 0) / 30) * (7.5-(0)));
            yy = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 30) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = 7.5 + (((tickAnim - 30) / 10) * (7.47636-(7.5)));
            yy = 0 + (((tickAnim - 30) / 10) * (0.60768-(0)));
            zz = 0 + (((tickAnim - 30) / 10) * (0.84813-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 49) {
            xx = 7.47636 + (((tickAnim - 40) / 9) * (7.5-(7.47636)));
            yy = 0.60768 + (((tickAnim - 40) / 9) * (0-(0.60768)));
            zz = 0.84813 + (((tickAnim - 40) / 9) * (0-(0.84813)));
        }
        else if (tickAnim >= 49 && tickAnim < 59) {
            xx = 7.5 + (((tickAnim - 49) / 10) * (7.47636-(7.5)));
            yy = 0 + (((tickAnim - 49) / 10) * (0.60768-(0)));
            zz = 0 + (((tickAnim - 49) / 10) * (0.84813-(0)));
        }
        else if (tickAnim >= 59 && tickAnim < 68) {
            xx = 7.47636 + (((tickAnim - 59) / 9) * (7.5-(7.47636)));
            yy = 0.60768 + (((tickAnim - 59) / 9) * (0-(0.60768)));
            zz = 0.84813 + (((tickAnim - 59) / 9) * (0-(0.84813)));
        }
        else if (tickAnim >= 68 && tickAnim < 78) {
            xx = 7.5 + (((tickAnim - 68) / 10) * (7.47636-(7.5)));
            yy = 0 + (((tickAnim - 68) / 10) * (0.60768-(0)));
            zz = 0 + (((tickAnim - 68) / 10) * (0.84813-(0)));
        }
        else if (tickAnim >= 78 && tickAnim < 88) {
            xx = 7.47636 + (((tickAnim - 78) / 10) * (7.5-(7.47636)));
            yy = 0.60768 + (((tickAnim - 78) / 10) * (0-(0.60768)));
            zz = 0.84813 + (((tickAnim - 78) / 10) * (0-(0.84813)));
        }
        else if (tickAnim >= 88 && tickAnim < 98) {
            xx = 7.5 + (((tickAnim - 88) / 10) * (7.47636-(7.5)));
            yy = 0 + (((tickAnim - 88) / 10) * (0.60768-(0)));
            zz = 0 + (((tickAnim - 88) / 10) * (0.84813-(0)));
        }
        else if (tickAnim >= 98 && tickAnim < 107) {
            xx = 7.47636 + (((tickAnim - 98) / 9) * (7.5-(7.47636)));
            yy = 0.60768 + (((tickAnim - 98) / 9) * (0-(0.60768)));
            zz = 0.84813 + (((tickAnim - 98) / 9) * (0-(0.84813)));
        }
        else if (tickAnim >= 107 && tickAnim < 117) {
            xx = 7.5 + (((tickAnim - 107) / 10) * (7.47636-(7.5)));
            yy = 0 + (((tickAnim - 107) / 10) * (0.60768-(0)));
            zz = 0 + (((tickAnim - 107) / 10) * (0.84813-(0)));
        }
        else if (tickAnim >= 117 && tickAnim < 126) {
            xx = 7.47636 + (((tickAnim - 117) / 9) * (7.5-(7.47636)));
            yy = 0.60768 + (((tickAnim - 117) / 9) * (0-(0.60768)));
            zz = 0.84813 + (((tickAnim - 117) / 9) * (0-(0.84813)));
        }
        else if (tickAnim >= 126 && tickAnim < 136) {
            xx = 7.5 + (((tickAnim - 126) / 10) * (7.47636-(7.5)));
            yy = 0 + (((tickAnim - 126) / 10) * (0.60768-(0)));
            zz = 0 + (((tickAnim - 126) / 10) * (0.84813-(0)));
        }
        else if (tickAnim >= 136 && tickAnim < 145) {
            xx = 7.47636 + (((tickAnim - 136) / 9) * (7.5-(7.47636)));
            yy = 0.60768 + (((tickAnim - 136) / 9) * (0-(0.60768)));
            zz = 0.84813 + (((tickAnim - 136) / 9) * (0-(0.84813)));
        }
        else if (tickAnim >= 145 && tickAnim < 168) {
            xx = 7.5 + (((tickAnim - 145) / 23) * (7.5-(7.5)));
            yy = 0 + (((tickAnim - 145) / 23) * (0-(0)));
            zz = 0 + (((tickAnim - 145) / 23) * (0-(0)));
        }
        else if (tickAnim >= 168 && tickAnim < 205) {
            xx = 7.5 + (((tickAnim - 168) / 37) * (0-(7.5)));
            yy = 0 + (((tickAnim - 168) / 37) * (0-(0)));
            zz = 0 + (((tickAnim - 168) / 37) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body2, body2.rotateAngleX + (float) Math.toRadians(xx), body2.rotateAngleY + (float) Math.toRadians(yy), body2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 0) / 30) * (18.25-(0)));
            yy = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 30) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = 18.25 + (((tickAnim - 30) / 10) * (18.24965-(18.25)));
            yy = 0 + (((tickAnim - 30) / 10) * (-0.4935-(0)));
            zz = 0 + (((tickAnim - 30) / 10) * (0.08037-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 49) {
            xx = 18.24965 + (((tickAnim - 40) / 9) * (18.25-(18.24965)));
            yy = -0.4935 + (((tickAnim - 40) / 9) * (0-(-0.4935)));
            zz = 0.08037 + (((tickAnim - 40) / 9) * (0-(0.08037)));
        }
        else if (tickAnim >= 49 && tickAnim < 59) {
            xx = 18.25 + (((tickAnim - 49) / 10) * (18.24965-(18.25)));
            yy = 0 + (((tickAnim - 49) / 10) * (-0.4935-(0)));
            zz = 0 + (((tickAnim - 49) / 10) * (0.08037-(0)));
        }
        else if (tickAnim >= 59 && tickAnim < 68) {
            xx = 18.24965 + (((tickAnim - 59) / 9) * (18.25-(18.24965)));
            yy = -0.4935 + (((tickAnim - 59) / 9) * (0-(-0.4935)));
            zz = 0.08037 + (((tickAnim - 59) / 9) * (0-(0.08037)));
        }
        else if (tickAnim >= 68 && tickAnim < 78) {
            xx = 18.25 + (((tickAnim - 68) / 10) * (18.24965-(18.25)));
            yy = 0 + (((tickAnim - 68) / 10) * (-0.4935-(0)));
            zz = 0 + (((tickAnim - 68) / 10) * (0.08037-(0)));
        }
        else if (tickAnim >= 78 && tickAnim < 88) {
            xx = 18.24965 + (((tickAnim - 78) / 10) * (18.25-(18.24965)));
            yy = -0.4935 + (((tickAnim - 78) / 10) * (0-(-0.4935)));
            zz = 0.08037 + (((tickAnim - 78) / 10) * (0-(0.08037)));
        }
        else if (tickAnim >= 88 && tickAnim < 98) {
            xx = 18.25 + (((tickAnim - 88) / 10) * (18.24965-(18.25)));
            yy = 0 + (((tickAnim - 88) / 10) * (-0.4935-(0)));
            zz = 0 + (((tickAnim - 88) / 10) * (0.08037-(0)));
        }
        else if (tickAnim >= 98 && tickAnim < 107) {
            xx = 18.24965 + (((tickAnim - 98) / 9) * (18.25-(18.24965)));
            yy = -0.4935 + (((tickAnim - 98) / 9) * (0-(-0.4935)));
            zz = 0.08037 + (((tickAnim - 98) / 9) * (0-(0.08037)));
        }
        else if (tickAnim >= 107 && tickAnim < 117) {
            xx = 18.25 + (((tickAnim - 107) / 10) * (18.24965-(18.25)));
            yy = 0 + (((tickAnim - 107) / 10) * (-0.4935-(0)));
            zz = 0 + (((tickAnim - 107) / 10) * (0.08037-(0)));
        }
        else if (tickAnim >= 117 && tickAnim < 126) {
            xx = 18.24965 + (((tickAnim - 117) / 9) * (18.25-(18.24965)));
            yy = -0.4935 + (((tickAnim - 117) / 9) * (0-(-0.4935)));
            zz = 0.08037 + (((tickAnim - 117) / 9) * (0-(0.08037)));
        }
        else if (tickAnim >= 126 && tickAnim < 136) {
            xx = 18.25 + (((tickAnim - 126) / 10) * (18.24965-(18.25)));
            yy = 0 + (((tickAnim - 126) / 10) * (-0.4935-(0)));
            zz = 0 + (((tickAnim - 126) / 10) * (0.08037-(0)));
        }
        else if (tickAnim >= 136 && tickAnim < 143) {
            xx = 18.24965 + (((tickAnim - 136) / 7) * (18.25-(18.24965)));
            yy = -0.4935 + (((tickAnim - 136) / 7) * (0-(-0.4935)));
            zz = 0.08037 + (((tickAnim - 136) / 7) * (0-(0.08037)));
        }
        else if (tickAnim >= 143 && tickAnim < 160) {
            xx = 18.25 + (((tickAnim - 143) / 17) * (21.9367-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*10-(18.25)));
            yy = 0 + (((tickAnim - 143) / 17) * (5.18154-(0)));
            zz = 0 + (((tickAnim - 143) / 17) * (-0.84621-(0)));
        }
        else if (tickAnim >= 160 && tickAnim < 164) {
            xx = 21.9367-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*10 + (((tickAnim - 160) / 4) * (14.71171-(21.9367-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*10)));
            yy = 5.18154 + (((tickAnim - 160) / 4) * (5.18154-(5.18154)));
            zz = -0.84621 + (((tickAnim - 160) / 4) * (-0.84621-(-0.84621)));
        }
        else if (tickAnim >= 164 && tickAnim < 168) {
            xx = 14.71171 + (((tickAnim - 164) / 4) * (14.71171-(14.71171)));
            yy = 5.18154 + (((tickAnim - 164) / 4) * (5.18154-(5.18154)));
            zz = -0.84621 + (((tickAnim - 164) / 4) * (-0.84621-(-0.84621)));
        }
        else if (tickAnim >= 168 && tickAnim < 185) {
            xx = 14.71171 + (((tickAnim - 168) / 17) * (-9.5-(14.71171)));
            yy = 5.18154 + (((tickAnim - 168) / 17) * (0-(5.18154)));
            zz = -0.84621 + (((tickAnim - 168) / 17) * (0-(-0.84621)));
        }
        else if (tickAnim >= 185 && tickAnim < 205) {
            xx = -9.5 + (((tickAnim - 185) / 20) * (0-(-9.5)));
            yy = 0 + (((tickAnim - 185) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 185) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck1, neck1.rotateAngleX + (float) Math.toRadians(xx), neck1.rotateAngleY + (float) Math.toRadians(yy), neck1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 59 && tickAnim < 67) {
            xx = 0 + (((tickAnim - 59) / 8) * (-1-(0)));
            yy = 0 + (((tickAnim - 59) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 59) / 8) * (0-(0)));
        }
        else if (tickAnim >= 67 && tickAnim < 76) {
            xx = -1 + (((tickAnim - 67) / 9) * (0-(-1)));
            yy = 0 + (((tickAnim - 67) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 67) / 9) * (0-(0)));
        }
        else if (tickAnim >= 76 && tickAnim < 143) {
            xx = 0 + (((tickAnim - 76) / 67) * (0-(0)));
            yy = 0 + (((tickAnim - 76) / 67) * (0-(0)));
            zz = 0 + (((tickAnim - 76) / 67) * (0-(0)));
        }
        else if (tickAnim >= 143 && tickAnim < 160) {
            xx = 0 + (((tickAnim - 143) / 17) * (1.075-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*10-(0)));
            yy = 0 + (((tickAnim - 143) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 143) / 17) * (0-(0)));
        }
        else if (tickAnim >= 160 && tickAnim < 164) {
            xx = 1.075-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*10 + (((tickAnim - 160) / 4) * (-6.5-(1.075-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*10)));
            yy = 0 + (((tickAnim - 160) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 160) / 4) * (0-(0)));
        }
        else if (tickAnim >= 164 && tickAnim < 168) {
            xx = -6.5 + (((tickAnim - 164) / 4) * (-6.5-(-6.5)));
            yy = 0 + (((tickAnim - 164) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 164) / 4) * (0-(0)));
        }
        else if (tickAnim >= 168 && tickAnim < 185) {
            xx = -6.5 + (((tickAnim - 168) / 17) * (0-(-6.5)));
            yy = 0 + (((tickAnim - 168) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 168) / 17) * (0-(0)));
        }
        else if (tickAnim >= 185 && tickAnim < 205) {
            xx = 0 + (((tickAnim - 185) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 185) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 185) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(xx), neck2.rotateAngleY + (float) Math.toRadians(yy), neck2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 143) {
            xx = 0 + (((tickAnim - 0) / 143) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 143) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 143) * (0-(0)));
        }
        else if (tickAnim >= 143 && tickAnim < 160) {
            xx = 0 + (((tickAnim - 143) / 17) * (5.75-(0)));
            yy = 0 + (((tickAnim - 143) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 143) / 17) * (0-(0)));
        }
        else if (tickAnim >= 160 && tickAnim < 164) {
            xx = 5.75 + (((tickAnim - 160) / 4) * (5.75-(5.75)));
            yy = 0 + (((tickAnim - 160) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 160) / 4) * (0-(0)));
        }
        else if (tickAnim >= 164 && tickAnim < 168) {
            xx = 5.75 + (((tickAnim - 164) / 4) * (5.75-(5.75)));
            yy = 0 + (((tickAnim - 164) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 164) / 4) * (0-(0)));
        }
        else if (tickAnim >= 168 && tickAnim < 185) {
            xx = 5.75 + (((tickAnim - 168) / 17) * (5.25-(5.75)));
            yy = 0 + (((tickAnim - 168) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 168) / 17) * (0-(0)));
        }
        else if (tickAnim >= 185 && tickAnim < 205) {
            xx = 5.25 + (((tickAnim - 185) / 20) * (0-(5.25)));
            yy = 0 + (((tickAnim - 185) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 185) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 59 && tickAnim < 67) {
            xx = 0 + (((tickAnim - 59) / 8) * (5.75-(0)));
            yy = 0 + (((tickAnim - 59) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 59) / 8) * (0-(0)));
        }
        else if (tickAnim >= 67 && tickAnim < 76) {
            xx = 5.75 + (((tickAnim - 67) / 9) * (0-(5.75)));
            yy = 0 + (((tickAnim - 67) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 67) / 9) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(xx), jaw.rotateAngleY + (float) Math.toRadians(yy), jaw.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (5.3-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-50))*-35-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 30) {
            xx = 5.3-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-50))*-35 + (((tickAnim - 18) / 12) * (9.75-(5.3-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-50))*-35)));
            yy = 0 + (((tickAnim - 18) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 12) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 145) {
            xx = 9.75 + (((tickAnim - 30) / 115) * (9.75-(9.75)));
            yy = 0 + (((tickAnim - 30) / 115) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 115) * (0-(0)));
        }
        else if (tickAnim >= 145 && tickAnim < 160) {
            xx = 9.75 + (((tickAnim - 145) / 15) * (9.85393-(9.75)));
            yy = 0 + (((tickAnim - 145) / 15) * (-5.36639-(0)));
            zz = 0 + (((tickAnim - 145) / 15) * (-0.00475-(0)));
        }
        else if (tickAnim >= 160 && tickAnim < 168) {
            xx = 9.85393 + (((tickAnim - 160) / 8) * (9.85393-(9.85393)));
            yy = -5.36639 + (((tickAnim - 160) / 8) * (-5.36639-(-5.36639)));
            zz = -0.00475 + (((tickAnim - 160) / 8) * (-0.00475-(-0.00475)));
        }
        else if (tickAnim >= 168 && tickAnim < 185) {
            xx = 9.85393 + (((tickAnim - 168) / 17) * (18.25-(9.85393)));
            yy = -5.36639 + (((tickAnim - 168) / 17) * (0-(-5.36639)));
            zz = -0.00475 + (((tickAnim - 168) / 17) * (0-(-0.00475)));
        }
        else if (tickAnim >= 185 && tickAnim < 205) {
            xx = 18.25 + (((tickAnim - 185) / 20) * (0-(18.25)));
            yy = 0 + (((tickAnim - 185) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 185) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail1, tail1.rotateAngleX + (float) Math.toRadians(xx), tail1.rotateAngleY + (float) Math.toRadians(yy), tail1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 18 && tickAnim < 145) {
            xx = 0 + (((tickAnim - 18) / 127) * (0-(0)));
            yy = 0 + (((tickAnim - 18) / 127) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 127) * (0-(0)));
        }
        else if (tickAnim >= 145 && tickAnim < 160) {
            xx = 0 + (((tickAnim - 145) / 15) * (0.29055-(0)));
            yy = 0 + (((tickAnim - 145) / 15) * (-3.64757-(0)));
            zz = 0 + (((tickAnim - 145) / 15) * (-4.21712-(0)));
        }
        else if (tickAnim >= 160 && tickAnim < 168) {
            xx = 0.29055 + (((tickAnim - 160) / 8) * (0.29055-(0.29055)));
            yy = -3.64757 + (((tickAnim - 160) / 8) * (-3.64757-(-3.64757)));
            zz = -4.21712 + (((tickAnim - 160) / 8) * (-4.21712-(-4.21712)));
        }
        else if (tickAnim >= 168 && tickAnim < 185) {
            xx = 0.29055 + (((tickAnim - 168) / 17) * (-12-(0.29055)));
            yy = -3.64757 + (((tickAnim - 168) / 17) * (0-(-3.64757)));
            zz = -4.21712 + (((tickAnim - 168) / 17) * (0-(-4.21712)));
        }
        else if (tickAnim >= 185 && tickAnim < 205) {
            xx = -12 + (((tickAnim - 185) / 20) * (0-(-12)));
            yy = 0 + (((tickAnim - 185) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 185) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(xx), tail2.rotateAngleY + (float) Math.toRadians(yy), tail2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (-0-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-50))*35-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 30) {
            xx = -0-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-50))*35 + (((tickAnim - 18) / 12) * (2.75-(-0-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-50))*35)));
            yy = 0 + (((tickAnim - 18) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 12) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 145) {
            xx = 2.75 + (((tickAnim - 30) / 115) * (2.75-(2.75)));
            yy = 0 + (((tickAnim - 30) / 115) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 115) * (0-(0)));
        }
        else if (tickAnim >= 145 && tickAnim < 160) {
            xx = 2.75 + (((tickAnim - 145) / 15) * (2.88671-(2.75)));
            yy = 0 + (((tickAnim - 145) / 15) * (-10.65066-(0)));
            zz = 0 + (((tickAnim - 145) / 15) * (-1.46658-(0)));
        }
        else if (tickAnim >= 160 && tickAnim < 168) {
            xx = 2.88671 + (((tickAnim - 160) / 8) * (2.88671-(2.88671)));
            yy = -10.65066 + (((tickAnim - 160) / 8) * (-10.65066-(-10.65066)));
            zz = -1.46658 + (((tickAnim - 160) / 8) * (-1.46658-(-1.46658)));
        }
        else if (tickAnim >= 168 && tickAnim < 185) {
            xx = 2.88671 + (((tickAnim - 168) / 17) * (-11.75-(2.88671)));
            yy = -10.65066 + (((tickAnim - 168) / 17) * (0-(-10.65066)));
            zz = -1.46658 + (((tickAnim - 168) / 17) * (0-(-1.46658)));
        }
        else if (tickAnim >= 185 && tickAnim < 205) {
            xx = -11.75 + (((tickAnim - 185) / 20) * (0-(-11.75)));
            yy = 0 + (((tickAnim - 185) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 185) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(xx), tail3.rotateAngleY + (float) Math.toRadians(yy), tail3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (11.825-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-50))*-35-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 30) {
            xx = 11.825-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-50))*-35 + (((tickAnim - 18) / 12) * (16-(11.825-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-50))*-35)));
            yy = 0 + (((tickAnim - 18) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 12) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 145) {
            xx = 16 + (((tickAnim - 30) / 115) * (16-(16)));
            yy = 0 + (((tickAnim - 30) / 115) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 115) * (0-(0)));
        }
        else if (tickAnim >= 145 && tickAnim < 160) {
            xx = 16 + (((tickAnim - 145) / 15) * (13.88559-(16)));
            yy = 0 + (((tickAnim - 145) / 15) * (11.634-(0)));
            zz = 0 + (((tickAnim - 145) / 15) * (-1.25711-(0)));
        }
        else if (tickAnim >= 160 && tickAnim < 168) {
            xx = 13.88559 + (((tickAnim - 160) / 8) * (13.88559-(13.88559)));
            yy = 11.634 + (((tickAnim - 160) / 8) * (11.634-(11.634)));
            zz = -1.25711 + (((tickAnim - 160) / 8) * (-1.25711-(-1.25711)));
        }
        else if (tickAnim >= 168 && tickAnim < 185) {
            xx = 13.88559 + (((tickAnim - 168) / 17) * (-15.75-(13.88559)));
            yy = 11.634 + (((tickAnim - 168) / 17) * (0-(11.634)));
            zz = -1.25711 + (((tickAnim - 168) / 17) * (0-(-1.25711)));
        }
        else if (tickAnim >= 185 && tickAnim < 205) {
            xx = -15.75 + (((tickAnim - 185) / 20) * (0-(-15.75)));
            yy = 0 + (((tickAnim - 185) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 185) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(xx), tail4.rotateAngleY + (float) Math.toRadians(yy), tail4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 30) {
            xx = -11.35-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-50))*15 + (((tickAnim - 0) / 30) * (-34.79259-(-11.35-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-50))*15)));
            yy = 0 + (((tickAnim - 0) / 30) * (7.68837-(0)));
            zz = 0 + (((tickAnim - 0) / 30) * (6.79923-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = -34.79259 + (((tickAnim - 30) / 10) * (-33.29259-(-34.79259)));
            yy = 7.68837 + (((tickAnim - 30) / 10) * (7.68837-(7.68837)));
            zz = 6.79923 + (((tickAnim - 30) / 10) * (6.79923-(6.79923)));
        }
        else if (tickAnim >= 40 && tickAnim < 49) {
            xx = -33.29259 + (((tickAnim - 40) / 9) * (-34.79259-(-33.29259)));
            yy = 7.68837 + (((tickAnim - 40) / 9) * (7.68837-(7.68837)));
            zz = 6.79923 + (((tickAnim - 40) / 9) * (6.79923-(6.79923)));
        }
        else if (tickAnim >= 49 && tickAnim < 59) {
            xx = -34.79259 + (((tickAnim - 49) / 10) * (-33.29259-(-34.79259)));
            yy = 7.68837 + (((tickAnim - 49) / 10) * (7.68837-(7.68837)));
            zz = 6.79923 + (((tickAnim - 49) / 10) * (6.79923-(6.79923)));
        }
        else if (tickAnim >= 59 && tickAnim < 68) {
            xx = -33.29259 + (((tickAnim - 59) / 9) * (-34.79259-(-33.29259)));
            yy = 7.68837 + (((tickAnim - 59) / 9) * (7.68837-(7.68837)));
            zz = 6.79923 + (((tickAnim - 59) / 9) * (6.79923-(6.79923)));
        }
        else if (tickAnim >= 68 && tickAnim < 78) {
            xx = -34.79259 + (((tickAnim - 68) / 10) * (-33.29259-(-34.79259)));
            yy = 7.68837 + (((tickAnim - 68) / 10) * (7.68837-(7.68837)));
            zz = 6.79923 + (((tickAnim - 68) / 10) * (6.79923-(6.79923)));
        }
        else if (tickAnim >= 78 && tickAnim < 88) {
            xx = -33.29259 + (((tickAnim - 78) / 10) * (-34.79259-(-33.29259)));
            yy = 7.68837 + (((tickAnim - 78) / 10) * (7.68837-(7.68837)));
            zz = 6.79923 + (((tickAnim - 78) / 10) * (6.79923-(6.79923)));
        }
        else if (tickAnim >= 88 && tickAnim < 98) {
            xx = -34.79259 + (((tickAnim - 88) / 10) * (-33.29259-(-34.79259)));
            yy = 7.68837 + (((tickAnim - 88) / 10) * (7.68837-(7.68837)));
            zz = 6.79923 + (((tickAnim - 88) / 10) * (6.79923-(6.79923)));
        }
        else if (tickAnim >= 98 && tickAnim < 107) {
            xx = -33.29259 + (((tickAnim - 98) / 9) * (-34.79259-(-33.29259)));
            yy = 7.68837 + (((tickAnim - 98) / 9) * (7.68837-(7.68837)));
            zz = 6.79923 + (((tickAnim - 98) / 9) * (6.79923-(6.79923)));
        }
        else if (tickAnim >= 107 && tickAnim < 117) {
            xx = -34.79259 + (((tickAnim - 107) / 10) * (-33.29259-(-34.79259)));
            yy = 7.68837 + (((tickAnim - 107) / 10) * (7.68837-(7.68837)));
            zz = 6.79923 + (((tickAnim - 107) / 10) * (6.79923-(6.79923)));
        }
        else if (tickAnim >= 117 && tickAnim < 126) {
            xx = -33.29259 + (((tickAnim - 117) / 9) * (-34.79259-(-33.29259)));
            yy = 7.68837 + (((tickAnim - 117) / 9) * (7.68837-(7.68837)));
            zz = 6.79923 + (((tickAnim - 117) / 9) * (6.79923-(6.79923)));
        }
        else if (tickAnim >= 126 && tickAnim < 136) {
            xx = -34.79259 + (((tickAnim - 126) / 10) * (-33.29259-(-34.79259)));
            yy = 7.68837 + (((tickAnim - 126) / 10) * (7.68837-(7.68837)));
            zz = 6.79923 + (((tickAnim - 126) / 10) * (6.79923-(6.79923)));
        }
        else if (tickAnim >= 136 && tickAnim < 145) {
            xx = -33.29259 + (((tickAnim - 136) / 9) * (-34.79259-(-33.29259)));
            yy = 7.68837 + (((tickAnim - 136) / 9) * (7.68837-(7.68837)));
            zz = 6.79923 + (((tickAnim - 136) / 9) * (6.79923-(6.79923)));
        }
        else if (tickAnim >= 145 && tickAnim < 160) {
            xx = -34.79259 + (((tickAnim - 145) / 15) * (-26.10635-(-34.79259)));
            yy = 7.68837 + (((tickAnim - 145) / 15) * (7.86863-(7.68837)));
            zz = 6.79923 + (((tickAnim - 145) / 15) * (2.43236-(6.79923)));
        }
        else if (tickAnim >= 160 && tickAnim < 168) {
            xx = -26.10635 + (((tickAnim - 160) / 8) * (-26.10635-(-26.10635)));
            yy = 7.86863 + (((tickAnim - 160) / 8) * (7.86863-(7.86863)));
            zz = 2.43236 + (((tickAnim - 160) / 8) * (2.43236-(2.43236)));
        }
        else if (tickAnim >= 168 && tickAnim < 185) {
            xx = -26.10635 + (((tickAnim - 168) / 17) * (0-(-26.10635)));
            yy = 7.86863 + (((tickAnim - 168) / 17) * (0-(7.86863)));
            zz = 2.43236 + (((tickAnim - 168) / 17) * (0-(2.43236)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg1, leftLeg1.rotateAngleX + (float) Math.toRadians(xx), leftLeg1.rotateAngleY + (float) Math.toRadians(yy), leftLeg1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 0) / 30) * (28.75-(0)));
            yy = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 30) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = 28.75 + (((tickAnim - 30) / 10) * (20.5-(28.75)));
            yy = 0 + (((tickAnim - 30) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 10) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 49) {
            xx = 20.5 + (((tickAnim - 40) / 9) * (28.75-(20.5)));
            yy = 0 + (((tickAnim - 40) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 9) * (0-(0)));
        }
        else if (tickAnim >= 49 && tickAnim < 59) {
            xx = 28.75 + (((tickAnim - 49) / 10) * (20.5-(28.75)));
            yy = 0 + (((tickAnim - 49) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 49) / 10) * (0-(0)));
        }
        else if (tickAnim >= 59 && tickAnim < 68) {
            xx = 20.5 + (((tickAnim - 59) / 9) * (28.75-(20.5)));
            yy = 0 + (((tickAnim - 59) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 59) / 9) * (0-(0)));
        }
        else if (tickAnim >= 68 && tickAnim < 78) {
            xx = 28.75 + (((tickAnim - 68) / 10) * (20.5-(28.75)));
            yy = 0 + (((tickAnim - 68) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 68) / 10) * (0-(0)));
        }
        else if (tickAnim >= 78 && tickAnim < 88) {
            xx = 20.5 + (((tickAnim - 78) / 10) * (28.75-(20.5)));
            yy = 0 + (((tickAnim - 78) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 78) / 10) * (0-(0)));
        }
        else if (tickAnim >= 88 && tickAnim < 98) {
            xx = 28.75 + (((tickAnim - 88) / 10) * (20.5-(28.75)));
            yy = 0 + (((tickAnim - 88) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 88) / 10) * (0-(0)));
        }
        else if (tickAnim >= 98 && tickAnim < 107) {
            xx = 20.5 + (((tickAnim - 98) / 9) * (28.75-(20.5)));
            yy = 0 + (((tickAnim - 98) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 98) / 9) * (0-(0)));
        }
        else if (tickAnim >= 107 && tickAnim < 117) {
            xx = 28.75 + (((tickAnim - 107) / 10) * (20.5-(28.75)));
            yy = 0 + (((tickAnim - 107) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 107) / 10) * (0-(0)));
        }
        else if (tickAnim >= 117 && tickAnim < 126) {
            xx = 20.5 + (((tickAnim - 117) / 9) * (28.75-(20.5)));
            yy = 0 + (((tickAnim - 117) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 117) / 9) * (0-(0)));
        }
        else if (tickAnim >= 126 && tickAnim < 136) {
            xx = 28.75 + (((tickAnim - 126) / 10) * (20.5-(28.75)));
            yy = 0 + (((tickAnim - 126) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 126) / 10) * (0-(0)));
        }
        else if (tickAnim >= 136 && tickAnim < 145) {
            xx = 20.5 + (((tickAnim - 136) / 9) * (28.75-(20.5)));
            yy = 0 + (((tickAnim - 136) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 136) / 9) * (0-(0)));
        }
        else if (tickAnim >= 145 && tickAnim < 160) {
            xx = 28.75 + (((tickAnim - 145) / 15) * (22.5-(28.75)));
            yy = 0 + (((tickAnim - 145) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 145) / 15) * (0-(0)));
        }
        else if (tickAnim >= 160 && tickAnim < 168) {
            xx = 22.5 + (((tickAnim - 160) / 8) * (22.5-(22.5)));
            yy = 0 + (((tickAnim - 160) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 160) / 8) * (0-(0)));
        }
        else if (tickAnim >= 168 && tickAnim < 185) {
            xx = 22.5 + (((tickAnim - 168) / 17) * (0-(22.5)));
            yy = 0 + (((tickAnim - 168) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 168) / 17) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg2, leftLeg2.rotateAngleX + (float) Math.toRadians(xx), leftLeg2.rotateAngleY + (float) Math.toRadians(yy), leftLeg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (-28.25-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 30) {
            xx = -28.25 + (((tickAnim - 15) / 15) * (-28-(-28.25)));
            yy = 0 + (((tickAnim - 15) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 15) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = -28 + (((tickAnim - 30) / 10) * (-32-(-28)));
            yy = 0 + (((tickAnim - 30) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 10) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 49) {
            xx = -32 + (((tickAnim - 40) / 9) * (-28-(-32)));
            yy = 0 + (((tickAnim - 40) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 9) * (0-(0)));
        }
        else if (tickAnim >= 49 && tickAnim < 59) {
            xx = -28 + (((tickAnim - 49) / 10) * (-32-(-28)));
            yy = 0 + (((tickAnim - 49) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 49) / 10) * (0-(0)));
        }
        else if (tickAnim >= 59 && tickAnim < 68) {
            xx = -32 + (((tickAnim - 59) / 9) * (-28-(-32)));
            yy = 0 + (((tickAnim - 59) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 59) / 9) * (0-(0)));
        }
        else if (tickAnim >= 68 && tickAnim < 78) {
            xx = -28 + (((tickAnim - 68) / 10) * (-32-(-28)));
            yy = 0 + (((tickAnim - 68) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 68) / 10) * (0-(0)));
        }
        else if (tickAnim >= 78 && tickAnim < 88) {
            xx = -32 + (((tickAnim - 78) / 10) * (-28-(-32)));
            yy = 0 + (((tickAnim - 78) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 78) / 10) * (0-(0)));
        }
        else if (tickAnim >= 88 && tickAnim < 98) {
            xx = -28 + (((tickAnim - 88) / 10) * (-32-(-28)));
            yy = 0 + (((tickAnim - 88) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 88) / 10) * (0-(0)));
        }
        else if (tickAnim >= 98 && tickAnim < 107) {
            xx = -32 + (((tickAnim - 98) / 9) * (-28-(-32)));
            yy = 0 + (((tickAnim - 98) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 98) / 9) * (0-(0)));
        }
        else if (tickAnim >= 107 && tickAnim < 117) {
            xx = -28 + (((tickAnim - 107) / 10) * (-32-(-28)));
            yy = 0 + (((tickAnim - 107) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 107) / 10) * (0-(0)));
        }
        else if (tickAnim >= 117 && tickAnim < 126) {
            xx = -32 + (((tickAnim - 117) / 9) * (-28-(-32)));
            yy = 0 + (((tickAnim - 117) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 117) / 9) * (0-(0)));
        }
        else if (tickAnim >= 126 && tickAnim < 136) {
            xx = -28 + (((tickAnim - 126) / 10) * (-32-(-28)));
            yy = 0 + (((tickAnim - 126) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 126) / 10) * (0-(0)));
        }
        else if (tickAnim >= 136 && tickAnim < 145) {
            xx = -32 + (((tickAnim - 136) / 9) * (-28-(-32)));
            yy = 0 + (((tickAnim - 136) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 136) / 9) * (0-(0)));
        }
        else if (tickAnim >= 145 && tickAnim < 160) {
            xx = -28 + (((tickAnim - 145) / 15) * (-46.75-(-28)));
            yy = 0 + (((tickAnim - 145) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 145) / 15) * (0-(0)));
        }
        else if (tickAnim >= 160 && tickAnim < 168) {
            xx = -46.75 + (((tickAnim - 160) / 8) * (-46.75-(-46.75)));
            yy = 0 + (((tickAnim - 160) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 160) / 8) * (0-(0)));
        }
        else if (tickAnim >= 168 && tickAnim < 185) {
            xx = -46.75 + (((tickAnim - 168) / 17) * (-46.75-(-46.75)));
            yy = 0 + (((tickAnim - 168) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 168) / 17) * (0-(0)));
        }
        else if (tickAnim >= 185 && tickAnim < 205) {
            xx = -46.75 + (((tickAnim - 185) / 20) * (0-(-46.75)));
            yy = 0 + (((tickAnim - 185) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 185) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg3, leftLeg3.rotateAngleX + (float) Math.toRadians(xx), leftLeg3.rotateAngleY + (float) Math.toRadians(yy), leftLeg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 145 && tickAnim < 160) {
            xx = 0 + (((tickAnim - 145) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 145) / 15) * (-0.5-(0)));
            zz = 0 + (((tickAnim - 145) / 15) * (1.1-(0)));
        }
        else if (tickAnim >= 160 && tickAnim < 168) {
            xx = 0 + (((tickAnim - 160) / 8) * (0-(0)));
            yy = -0.5 + (((tickAnim - 160) / 8) * (-0.5-(-0.5)));
            zz = 1.1 + (((tickAnim - 160) / 8) * (1.1-(1.1)));
        }
        else if (tickAnim >= 168 && tickAnim < 185) {
            xx = 0 + (((tickAnim - 168) / 17) * (0-(0)));
            yy = -0.5 + (((tickAnim - 168) / 17) * (-0.5-(-0.5)));
            zz = 1.1 + (((tickAnim - 168) / 17) * (1.1-(1.1)));
        }
        else if (tickAnim >= 185 && tickAnim < 205) {
            xx = 0 + (((tickAnim - 185) / 20) * (0-(0)));
            yy = -0.5 + (((tickAnim - 185) / 20) * (0-(-0.5)));
            zz = 1.1 + (((tickAnim - 185) / 20) * (0-(1.1)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftLeg3.rotationPointX = this.leftLeg3.rotationPointX + (float)(xx);
        this.leftLeg3.rotationPointY = this.leftLeg3.rotationPointY - (float)(yy);
        this.leftLeg3.rotationPointZ = this.leftLeg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (19.625-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (-9.5-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 30) {
            xx = 19.625 + (((tickAnim - 15) / 15) * (-16.75-(19.625)));
            yy = 0 + (((tickAnim - 15) / 15) * (0-(0)));
            zz = -9.5 + (((tickAnim - 15) / 15) * (-19-(-9.5)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = -16.75 + (((tickAnim - 30) / 10) * (2.75-(-16.75)));
            yy = 0 + (((tickAnim - 30) / 10) * (0-(0)));
            zz = -19 + (((tickAnim - 30) / 10) * (-19-(-19)));
        }
        else if (tickAnim >= 40 && tickAnim < 49) {
            xx = 2.75 + (((tickAnim - 40) / 9) * (-16.75-(2.75)));
            yy = 0 + (((tickAnim - 40) / 9) * (0-(0)));
            zz = -19 + (((tickAnim - 40) / 9) * (-19-(-19)));
        }
        else if (tickAnim >= 49 && tickAnim < 59) {
            xx = -16.75 + (((tickAnim - 49) / 10) * (2.75-(-16.75)));
            yy = 0 + (((tickAnim - 49) / 10) * (0-(0)));
            zz = -19 + (((tickAnim - 49) / 10) * (-19-(-19)));
        }
        else if (tickAnim >= 59 && tickAnim < 68) {
            xx = 2.75 + (((tickAnim - 59) / 9) * (-16.75-(2.75)));
            yy = 0 + (((tickAnim - 59) / 9) * (0-(0)));
            zz = -19 + (((tickAnim - 59) / 9) * (-19-(-19)));
        }
        else if (tickAnim >= 68 && tickAnim < 78) {
            xx = -16.75 + (((tickAnim - 68) / 10) * (2.75-(-16.75)));
            yy = 0 + (((tickAnim - 68) / 10) * (0-(0)));
            zz = -19 + (((tickAnim - 68) / 10) * (-19-(-19)));
        }
        else if (tickAnim >= 78 && tickAnim < 88) {
            xx = 2.75 + (((tickAnim - 78) / 10) * (-16.75-(2.75)));
            yy = 0 + (((tickAnim - 78) / 10) * (0-(0)));
            zz = -19 + (((tickAnim - 78) / 10) * (-19-(-19)));
        }
        else if (tickAnim >= 88 && tickAnim < 98) {
            xx = -16.75 + (((tickAnim - 88) / 10) * (2.75-(-16.75)));
            yy = 0 + (((tickAnim - 88) / 10) * (0-(0)));
            zz = -19 + (((tickAnim - 88) / 10) * (-19-(-19)));
        }
        else if (tickAnim >= 98 && tickAnim < 107) {
            xx = 2.75 + (((tickAnim - 98) / 9) * (-16.75-(2.75)));
            yy = 0 + (((tickAnim - 98) / 9) * (0-(0)));
            zz = -19 + (((tickAnim - 98) / 9) * (-19-(-19)));
        }
        else if (tickAnim >= 107 && tickAnim < 117) {
            xx = -16.75 + (((tickAnim - 107) / 10) * (2.75-(-16.75)));
            yy = 0 + (((tickAnim - 107) / 10) * (0-(0)));
            zz = -19 + (((tickAnim - 107) / 10) * (-19-(-19)));
        }
        else if (tickAnim >= 117 && tickAnim < 126) {
            xx = 2.75 + (((tickAnim - 117) / 9) * (-16.75-(2.75)));
            yy = 0 + (((tickAnim - 117) / 9) * (0-(0)));
            zz = -19 + (((tickAnim - 117) / 9) * (-19-(-19)));
        }
        else if (tickAnim >= 126 && tickAnim < 136) {
            xx = -16.75 + (((tickAnim - 126) / 10) * (2.75-(-16.75)));
            yy = 0 + (((tickAnim - 126) / 10) * (0-(0)));
            zz = -19 + (((tickAnim - 126) / 10) * (-19-(-19)));
        }
        else if (tickAnim >= 136 && tickAnim < 145) {
            xx = 2.75 + (((tickAnim - 136) / 9) * (-16.75-(2.75)));
            yy = 0 + (((tickAnim - 136) / 9) * (0-(0)));
            zz = -19 + (((tickAnim - 136) / 9) * (-19-(-19)));
        }
        else if (tickAnim >= 145 && tickAnim < 160) {
            xx = -16.75 + (((tickAnim - 145) / 15) * (68.25-(-16.75)));
            yy = 0 + (((tickAnim - 145) / 15) * (0-(0)));
            zz = -19 + (((tickAnim - 145) / 15) * (0-(-19)));
        }
        else if (tickAnim >= 160 && tickAnim < 168) {
            xx = 68.25 + (((tickAnim - 160) / 8) * (68.25-(68.25)));
            yy = 0 + (((tickAnim - 160) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 160) / 8) * (0-(0)));
        }
        else if (tickAnim >= 168 && tickAnim < 185) {
            xx = 68.25 + (((tickAnim - 168) / 17) * (51.5-(68.25)));
            yy = 0 + (((tickAnim - 168) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 168) / 17) * (0-(0)));
        }
        else if (tickAnim >= 185 && tickAnim < 205) {
            xx = 51.5 + (((tickAnim - 185) / 20) * (0-(51.5)));
            yy = 0 + (((tickAnim - 185) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 185) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg4, leftLeg4.rotateAngleX + (float) Math.toRadians(xx), leftLeg4.rotateAngleY + (float) Math.toRadians(yy), leftLeg4.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 145) {
            xx = 0 + (((tickAnim - 0) / 145) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 145) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 145) * (0-(0)));
        }
        else if (tickAnim >= 145 && tickAnim < 160) {
            xx = 0 + (((tickAnim - 145) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 145) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 145) / 15) * (-1.45-(0)));
        }
        else if (tickAnim >= 160 && tickAnim < 168) {
            xx = 0 + (((tickAnim - 160) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 160) / 8) * (0-(0)));
            zz = -1.45 + (((tickAnim - 160) / 8) * (-1.45-(-1.45)));
        }
        else if (tickAnim >= 168 && tickAnim < 185) {
            xx = 0 + (((tickAnim - 168) / 17) * (0-(0)));
            yy = 0 + (((tickAnim - 168) / 17) * (0-(0)));
            zz = -1.45 + (((tickAnim - 168) / 17) * (-1.45-(-1.45)));
        }
        else if (tickAnim >= 185 && tickAnim < 205) {
            xx = 0 + (((tickAnim - 185) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 185) / 20) * (0-(0)));
            zz = -1.45 + (((tickAnim - 185) / 20) * (0-(-1.45)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftLeg4.rotationPointX = this.leftLeg4.rotationPointX + (float)(xx);
        this.leftLeg4.rotationPointY = this.leftLeg4.rotationPointY - (float)(yy);
        this.leftLeg4.rotationPointZ = this.leftLeg4.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 30) {
            xx = -11.675-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-50))*15 + (((tickAnim - 0) / 30) * (-26.10635-(-11.675-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-50))*15)));
            yy = 0 + (((tickAnim - 0) / 30) * (-7.86863-(0)));
            zz = 0 + (((tickAnim - 0) / 30) * (-2.43236-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 168) {
            xx = -26.10635 + (((tickAnim - 30) / 138) * (-26.10635-(-26.10635)));
            yy = -7.86863 + (((tickAnim - 30) / 138) * (-7.86863-(-7.86863)));
            zz = -2.43236 + (((tickAnim - 30) / 138) * (-2.43236-(-2.43236)));
        }
        else if (tickAnim >= 168 && tickAnim < 185) {
            xx = -26.10635 + (((tickAnim - 168) / 17) * (0-(-26.10635)));
            yy = -7.86863 + (((tickAnim - 168) / 17) * (0-(-7.86863)));
            zz = -2.43236 + (((tickAnim - 168) / 17) * (0-(-2.43236)));
        }
        else if (tickAnim >= 185 && tickAnim < 205) {
            xx = 0 + (((tickAnim - 185) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 185) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 185) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg9, rightLeg9.rotateAngleX + (float) Math.toRadians(xx), rightLeg9.rotateAngleY + (float) Math.toRadians(yy), rightLeg9.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 0) / 30) * (22.5-(0)));
            yy = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 30) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 168) {
            xx = 22.5 + (((tickAnim - 30) / 138) * (22.5-(22.5)));
            yy = 0 + (((tickAnim - 30) / 138) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 138) * (0-(0)));
        }
        else if (tickAnim >= 168 && tickAnim < 185) {
            xx = 22.5 + (((tickAnim - 168) / 17) * (0-(22.5)));
            yy = 0 + (((tickAnim - 168) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 168) / 17) * (0-(0)));
        }
        else if (tickAnim >= 185 && tickAnim < 205) {
            xx = 0 + (((tickAnim - 185) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 185) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 185) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg9, rightLeg9.rotateAngleX + (float) Math.toRadians(xx), rightLeg9.rotateAngleY + (float) Math.toRadians(yy), rightLeg9.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 0) / 12) * (-29.43-(0)));
            yy = 0 + (((tickAnim - 0) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 12) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 30) {
            xx = -29.43 + (((tickAnim - 12) / 18) * (-46.75-(-29.43)));
            yy = 0 + (((tickAnim - 12) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 18) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 185) {
            xx = -46.75 + (((tickAnim - 30) / 155) * (-46.75-(-46.75)));
            yy = 0 + (((tickAnim - 30) / 155) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 155) * (0-(0)));
        }
        else if (tickAnim >= 185 && tickAnim < 205) {
            xx = -46.75 + (((tickAnim - 185) / 20) * (0-(-46.75)));
            yy = 0 + (((tickAnim - 185) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 185) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg11, rightLeg11.rotateAngleX + (float) Math.toRadians(xx), rightLeg11.rotateAngleY + (float) Math.toRadians(yy), rightLeg11.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 30) * (-0.5-(0)));
            zz = 0 + (((tickAnim - 0) / 30) * (1.1-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 185) {
            xx = 0 + (((tickAnim - 30) / 155) * (0-(0)));
            yy = -0.5 + (((tickAnim - 30) / 155) * (-0.5-(-0.5)));
            zz = 1.1 + (((tickAnim - 30) / 155) * (1.1-(1.1)));
        }
        else if (tickAnim >= 185 && tickAnim < 205) {
            xx = 0 + (((tickAnim - 185) / 20) * (0-(0)));
            yy = -0.5 + (((tickAnim - 185) / 20) * (0-(-0.5)));
            zz = 1.1 + (((tickAnim - 185) / 20) * (0-(1.1)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightLeg11.rotationPointX = this.rightLeg11.rotationPointX + (float)(xx);
        this.rightLeg11.rotationPointY = this.rightLeg11.rotationPointY - (float)(yy);
        this.rightLeg11.rotationPointZ = this.rightLeg11.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (52.26-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 30) {
            xx = 52.26 + (((tickAnim - 15) / 15) * (68.75-(52.26)));
            yy = 0 + (((tickAnim - 15) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 15) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 168) {
            xx = 68.75 + (((tickAnim - 30) / 138) * (68.25-(68.75)));
            yy = 0 + (((tickAnim - 30) / 138) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 138) * (0-(0)));
        }
        else if (tickAnim >= 168 && tickAnim < 185) {
            xx = 68.25 + (((tickAnim - 168) / 17) * (51.5-(68.25)));
            yy = 0 + (((tickAnim - 168) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 168) / 17) * (0-(0)));
        }
        else if (tickAnim >= 185 && tickAnim < 205) {
            xx = 51.5 + (((tickAnim - 185) / 20) * (0-(51.5)));
            yy = 0 + (((tickAnim - 185) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 185) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg12, rightLeg12.rotateAngleX + (float) Math.toRadians(xx), rightLeg12.rotateAngleY + (float) Math.toRadians(yy), rightLeg12.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 30) * (-1.4-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 168) {
            xx = 0 + (((tickAnim - 30) / 138) * (0-(0)));
            yy = 0 + (((tickAnim - 30) / 138) * (0-(0)));
            zz = -1.4 + (((tickAnim - 30) / 138) * (-1.45-(-1.4)));
        }
        else if (tickAnim >= 168 && tickAnim < 185) {
            xx = 0 + (((tickAnim - 168) / 17) * (0-(0)));
            yy = 0 + (((tickAnim - 168) / 17) * (0-(0)));
            zz = -1.45 + (((tickAnim - 168) / 17) * (-1.45-(-1.45)));
        }
        else if (tickAnim >= 185 && tickAnim < 205) {
            xx = 0 + (((tickAnim - 185) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 185) / 20) * (0-(0)));
            zz = -1.45 + (((tickAnim - 185) / 20) * (0-(-1.45)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightLeg12.rotationPointX = this.rightLeg12.rotationPointX + (float)(xx);
        this.rightLeg12.rotationPointY = this.rightLeg12.rotationPointY - (float)(yy);
        this.rightLeg12.rotationPointZ = this.rightLeg12.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 0) / 30) * (-12-(0)));
            yy = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 30) * (16.5-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 168) {
            xx = -12 + (((tickAnim - 30) / 138) * (-12-(-12)));
            yy = 0 + (((tickAnim - 30) / 138) * (0-(0)));
            zz = 16.5 + (((tickAnim - 30) / 138) * (16.5-(16.5)));
        }
        else if (tickAnim >= 168 && tickAnim < 185) {
            xx = -12 + (((tickAnim - 168) / 17) * (-2.99243-(-12)));
            yy = 0 + (((tickAnim - 168) / 17) * (-6.37231-(0)));
            zz = 16.5 + (((tickAnim - 168) / 17) * (9.47954-(16.5)));
        }
        else if (tickAnim >= 185 && tickAnim < 205) {
            xx = -2.99243 + (((tickAnim - 185) / 20) * (0-(-2.99243)));
            yy = -6.37231 + (((tickAnim - 185) / 20) * (0-(-6.37231)));
            zz = 9.47954 + (((tickAnim - 185) / 20) * (0-(9.47954)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm, rightArm.rotateAngleX + (float) Math.toRadians(xx), rightArm.rotateAngleY + (float) Math.toRadians(yy), rightArm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (-2.74226-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (-3.70188-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (-1.15209-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 30) {
            xx = -2.74226 + (((tickAnim - 15) / 15) * (-16.48452-(-2.74226)));
            yy = -3.70188 + (((tickAnim - 15) / 15) * (-7.40375-(-3.70188)));
            zz = -1.15209 + (((tickAnim - 15) / 15) * (-2.30419-(-1.15209)));
        }
        else if (tickAnim >= 30 && tickAnim < 168) {
            xx = -16.48452 + (((tickAnim - 30) / 138) * (-16.48452-(-16.48452)));
            yy = -7.40375 + (((tickAnim - 30) / 138) * (-7.40375-(-7.40375)));
            zz = -2.30419 + (((tickAnim - 30) / 138) * (-2.30419-(-2.30419)));
        }
        else if (tickAnim >= 168 && tickAnim < 185) {
            xx = -16.48452 + (((tickAnim - 168) / 17) * (0-(-16.48452)));
            yy = -7.40375 + (((tickAnim - 168) / 17) * (0-(-7.40375)));
            zz = -2.30419 + (((tickAnim - 168) / 17) * (0-(-2.30419)));
        }
        else if (tickAnim >= 185 && tickAnim < 205) {
            xx = 0 + (((tickAnim - 185) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 185) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 185) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm10, rightArm10.rotateAngleX + (float) Math.toRadians(xx), rightArm10.rotateAngleY + (float) Math.toRadians(yy), rightArm10.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 0) / 30) * (35.11774-(0)));
            yy = 0 + (((tickAnim - 0) / 30) * (2.531-(0)));
            zz = 0 + (((tickAnim - 0) / 30) * (-2.49893-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 168) {
            xx = 35.11774 + (((tickAnim - 30) / 138) * (35.11774-(35.11774)));
            yy = 2.531 + (((tickAnim - 30) / 138) * (2.531-(2.531)));
            zz = -2.49893 + (((tickAnim - 30) / 138) * (-2.49893-(-2.49893)));
        }
        else if (tickAnim >= 168 && tickAnim < 185) {
            xx = 35.11774 + (((tickAnim - 168) / 17) * (0-(35.11774)));
            yy = 2.531 + (((tickAnim - 168) / 17) * (0-(2.531)));
            zz = -2.49893 + (((tickAnim - 168) / 17) * (-7.25-(-2.49893)));
        }
        else if (tickAnim >= 185 && tickAnim < 205) {
            xx = 0 + (((tickAnim - 185) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 185) / 20) * (0-(0)));
            zz = -7.25 + (((tickAnim - 185) / 20) * (0-(-7.25)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm11, rightArm11.rotateAngleX + (float) Math.toRadians(xx), rightArm11.rotateAngleY + (float) Math.toRadians(yy), rightArm11.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 30) * (0.95-(0)));
            zz = 0 + (((tickAnim - 0) / 30) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 168) {
            xx = 0 + (((tickAnim - 30) / 138) * (0-(0)));
            yy = 0.95 + (((tickAnim - 30) / 138) * (0.95-(0.95)));
            zz = 0 + (((tickAnim - 30) / 138) * (0-(0)));
        }
        else if (tickAnim >= 168 && tickAnim < 185) {
            xx = 0 + (((tickAnim - 168) / 17) * (0-(0)));
            yy = 0.95 + (((tickAnim - 168) / 17) * (0.96-(0.95)));
            zz = 0 + (((tickAnim - 168) / 17) * (0-(0)));
        }
        else if (tickAnim >= 185 && tickAnim < 205) {
            xx = 0 + (((tickAnim - 185) / 20) * (0-(0)));
            yy = 0.96 + (((tickAnim - 185) / 20) * (0-(0.96)));
            zz = 0 + (((tickAnim - 185) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightArm11.rotationPointX = this.rightArm11.rotationPointX + (float)(xx);
        this.rightArm11.rotationPointY = this.rightArm11.rotationPointY - (float)(yy);
        this.rightArm11.rotationPointZ = this.rightArm11.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 0) / 30) * (-12-(0)));
            yy = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 30) * (-16.5-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = -12 + (((tickAnim - 30) / 10) * (-11.87195-(-12)));
            yy = 0 + (((tickAnim - 30) / 10) * (-1.34914-(0)));
            zz = -16.5 + (((tickAnim - 30) / 10) * (-15.99653-(-16.5)));
        }
        else if (tickAnim >= 40 && tickAnim < 49) {
            xx = -11.87195 + (((tickAnim - 40) / 9) * (-12-(-11.87195)));
            yy = -1.34914 + (((tickAnim - 40) / 9) * (0-(-1.34914)));
            zz = -15.99653 + (((tickAnim - 40) / 9) * (-16.5-(-15.99653)));
        }
        else if (tickAnim >= 49 && tickAnim < 59) {
            xx = -12 + (((tickAnim - 49) / 10) * (-11.87195-(-12)));
            yy = 0 + (((tickAnim - 49) / 10) * (-1.34914-(0)));
            zz = -16.5 + (((tickAnim - 49) / 10) * (-15.99653-(-16.5)));
        }
        else if (tickAnim >= 59 && tickAnim < 68) {
            xx = -11.87195 + (((tickAnim - 59) / 9) * (-12-(-11.87195)));
            yy = -1.34914 + (((tickAnim - 59) / 9) * (0-(-1.34914)));
            zz = -15.99653 + (((tickAnim - 59) / 9) * (-16.5-(-15.99653)));
        }
        else if (tickAnim >= 68 && tickAnim < 78) {
            xx = -12 + (((tickAnim - 68) / 10) * (-11.87195-(-12)));
            yy = 0 + (((tickAnim - 68) / 10) * (-1.34914-(0)));
            zz = -16.5 + (((tickAnim - 68) / 10) * (-15.99653-(-16.5)));
        }
        else if (tickAnim >= 78 && tickAnim < 88) {
            xx = -11.87195 + (((tickAnim - 78) / 10) * (-12-(-11.87195)));
            yy = -1.34914 + (((tickAnim - 78) / 10) * (0-(-1.34914)));
            zz = -15.99653 + (((tickAnim - 78) / 10) * (-16.5-(-15.99653)));
        }
        else if (tickAnim >= 88 && tickAnim < 98) {
            xx = -12 + (((tickAnim - 88) / 10) * (-11.87195-(-12)));
            yy = 0 + (((tickAnim - 88) / 10) * (-1.34914-(0)));
            zz = -16.5 + (((tickAnim - 88) / 10) * (-15.99653-(-16.5)));
        }
        else if (tickAnim >= 98 && tickAnim < 107) {
            xx = -11.87195 + (((tickAnim - 98) / 9) * (-12-(-11.87195)));
            yy = -1.34914 + (((tickAnim - 98) / 9) * (0-(-1.34914)));
            zz = -15.99653 + (((tickAnim - 98) / 9) * (-16.5-(-15.99653)));
        }
        else if (tickAnim >= 107 && tickAnim < 117) {
            xx = -12 + (((tickAnim - 107) / 10) * (-11.87195-(-12)));
            yy = 0 + (((tickAnim - 107) / 10) * (-1.34914-(0)));
            zz = -16.5 + (((tickAnim - 107) / 10) * (-15.99653-(-16.5)));
        }
        else if (tickAnim >= 117 && tickAnim < 126) {
            xx = -11.87195 + (((tickAnim - 117) / 9) * (-12-(-11.87195)));
            yy = -1.34914 + (((tickAnim - 117) / 9) * (0-(-1.34914)));
            zz = -15.99653 + (((tickAnim - 117) / 9) * (-16.5-(-15.99653)));
        }
        else if (tickAnim >= 126 && tickAnim < 136) {
            xx = -12 + (((tickAnim - 126) / 10) * (-11.87195-(-12)));
            yy = 0 + (((tickAnim - 126) / 10) * (-1.34914-(0)));
            zz = -16.5 + (((tickAnim - 126) / 10) * (-15.99653-(-16.5)));
        }
        else if (tickAnim >= 136 && tickAnim < 145) {
            xx = -11.87195 + (((tickAnim - 136) / 9) * (-12-(-11.87195)));
            yy = -1.34914 + (((tickAnim - 136) / 9) * (0-(-1.34914)));
            zz = -15.99653 + (((tickAnim - 136) / 9) * (-16.5-(-15.99653)));
        }
        else if (tickAnim >= 145 && tickAnim < 168) {
            xx = -12 + (((tickAnim - 145) / 23) * (-12-(-12)));
            yy = 0 + (((tickAnim - 145) / 23) * (0-(0)));
            zz = -16.5 + (((tickAnim - 145) / 23) * (-16.5-(-16.5)));
        }
        else if (tickAnim >= 168 && tickAnim < 185) {
            xx = -12 + (((tickAnim - 168) / 17) * (-2.99243-(-12)));
            yy = 0 + (((tickAnim - 168) / 17) * (6.37231-(0)));
            zz = -16.5 + (((tickAnim - 168) / 17) * (-9.47954-(-16.5)));
        }
        else if (tickAnim >= 185 && tickAnim < 205) {
            xx = -2.99243 + (((tickAnim - 185) / 20) * (0-(-2.99243)));
            yy = 6.37231 + (((tickAnim - 185) / 20) * (0-(6.37231)));
            zz = -9.47954 + (((tickAnim - 185) / 20) * (0-(-9.47954)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm, leftArm.rotateAngleX + (float) Math.toRadians(xx), leftArm.rotateAngleY + (float) Math.toRadians(yy), leftArm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (-2.74226-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (3.70188-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (1.15209-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 30) {
            xx = -2.74226 + (((tickAnim - 15) / 15) * (-16.48452-(-2.74226)));
            yy = 3.70188 + (((tickAnim - 15) / 15) * (7.40375-(3.70188)));
            zz = 1.15209 + (((tickAnim - 15) / 15) * (2.30419-(1.15209)));
        }
        else if (tickAnim >= 30 && tickAnim < 168) {
            xx = -16.48452 + (((tickAnim - 30) / 138) * (-16.48452-(-16.48452)));
            yy = 7.40375 + (((tickAnim - 30) / 138) * (7.40375-(7.40375)));
            zz = 2.30419 + (((tickAnim - 30) / 138) * (2.30419-(2.30419)));
        }
        else if (tickAnim >= 168 && tickAnim < 185) {
            xx = -16.48452 + (((tickAnim - 168) / 17) * (0-(-16.48452)));
            yy = 7.40375 + (((tickAnim - 168) / 17) * (0-(7.40375)));
            zz = 2.30419 + (((tickAnim - 168) / 17) * (0-(2.30419)));
        }
        else if (tickAnim >= 185 && tickAnim < 205) {
            xx = 0 + (((tickAnim - 185) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 185) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 185) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm2, leftArm2.rotateAngleX + (float) Math.toRadians(xx), leftArm2.rotateAngleY + (float) Math.toRadians(yy), leftArm2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 0) / 30) * (35.11774-(0)));
            yy = 0 + (((tickAnim - 0) / 30) * (-2.531-(0)));
            zz = 0 + (((tickAnim - 0) / 30) * (2.49893-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 168) {
            xx = 35.11774 + (((tickAnim - 30) / 138) * (35.11774-(35.11774)));
            yy = -2.531 + (((tickAnim - 30) / 138) * (-2.531-(-2.531)));
            zz = 2.49893 + (((tickAnim - 30) / 138) * (2.49893-(2.49893)));
        }
        else if (tickAnim >= 168 && tickAnim < 185) {
            xx = 35.11774 + (((tickAnim - 168) / 17) * (0-(35.11774)));
            yy = -2.531 + (((tickAnim - 168) / 17) * (0-(-2.531)));
            zz = 2.49893 + (((tickAnim - 168) / 17) * (7.25-(2.49893)));
        }
        else if (tickAnim >= 185 && tickAnim < 205) {
            xx = 0 + (((tickAnim - 185) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 185) / 20) * (0-(0)));
            zz = 7.25 + (((tickAnim - 185) / 20) * (0-(7.25)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm3, leftArm3.rotateAngleX + (float) Math.toRadians(xx), leftArm3.rotateAngleY + (float) Math.toRadians(yy), leftArm3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 30) * (0.95-(0)));
            zz = 0 + (((tickAnim - 0) / 30) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 168) {
            xx = 0 + (((tickAnim - 30) / 138) * (0-(0)));
            yy = 0.95 + (((tickAnim - 30) / 138) * (0.95-(0.95)));
            zz = 0 + (((tickAnim - 30) / 138) * (0-(0)));
        }
        else if (tickAnim >= 168 && tickAnim < 185) {
            xx = 0 + (((tickAnim - 168) / 17) * (0-(0)));
            yy = 0.95 + (((tickAnim - 168) / 17) * (0.96-(0.95)));
            zz = 0 + (((tickAnim - 168) / 17) * (0-(0)));
        }
        else if (tickAnim >= 185 && tickAnim < 205) {
            xx = 0 + (((tickAnim - 185) / 20) * (0-(0)));
            yy = 0.96 + (((tickAnim - 185) / 20) * (0-(0.96)));
            zz = 0 + (((tickAnim - 185) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftArm3.rotationPointX = this.leftArm3.rotationPointX + (float)(xx);
        this.leftArm3.rotationPointY = this.leftArm3.rotationPointY - (float)(yy);
        this.leftArm3.rotationPointZ = this.leftArm3.rotationPointZ + (float)(zz);




        if (tickAnim >= 62 && tickAnim < 69) {
            xx = 1 + (((tickAnim - 62) / 7) * (1-(1)));
            yy = 1 + (((tickAnim - 62) / 7) * (0.06-(1)));
            zz = 1 + (((tickAnim - 62) / 7) * (1-(1)));
        }
        else if (tickAnim >= 69 && tickAnim < 78) {
            xx = 1 + (((tickAnim - 69) / 9) * (1-(1)));
            yy = 0.06 + (((tickAnim - 69) / 9) * (1-(0.06)));
            zz = 1 + (((tickAnim - 69) / 9) * (1-(1)));
        }
        else if (tickAnim >= 78 && tickAnim < 143) {
            xx = 1 + (((tickAnim - 78) / 65) * (1-(1)));
            yy = 1 + (((tickAnim - 78) / 65) * (1-(1)));
            zz = 1 + (((tickAnim - 78) / 65) * (1-(1)));
        }
        else if (tickAnim >= 143 && tickAnim < 148) {
            xx = 1 + (((tickAnim - 143) / 5) * (1-(1)));
            yy = 1 + (((tickAnim - 143) / 5) * (0.1475-(1)));
            zz = 1 + (((tickAnim - 143) / 5) * (1-(1)));
        }
        else if (tickAnim >= 148 && tickAnim < 153) {
            xx = 1 + (((tickAnim - 148) / 5) * (1-(1)));
            yy = 0.1475 + (((tickAnim - 148) / 5) * (1-(0.1475)));
            zz = 1 + (((tickAnim - 148) / 5) * (1-(1)));
        }
        else {
            xx = 1;
            yy = 1;
            zz = 1;
        }
        this.eyes.setScale((float)xx, (float)yy, (float)zz);

    }
    public void animWalking(EntityLivingBase entitylivinghipIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraAntarctopelta entity = (EntityPrehistoricFloraAntarctopelta) entitylivinghipIn;
        int animCycle = 42;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        this.setRotateAngle(hip, hip.rotateAngleX + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*170/0.5-50))*1), hip.rotateAngleY + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*170+30))*-1), hip.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*170-50))*2));
        this.hip.rotationPointX = this.hip.rotationPointX + (float)(0);
        this.hip.rotationPointY = this.hip.rotationPointY - (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*170/0.5-190))*-0.2);
        this.hip.rotationPointZ = this.hip.rotationPointZ + (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*170/0.5-50))*-0.3);


        this.setRotateAngle(body1, body1.rotateAngleX + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*170/0.5-190))*1), body1.rotateAngleY + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*170+150))*1), body1.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*170-150))*2));


        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*170/0.5-290))*1), chest.rotateAngleY + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*170-50))*1.5), chest.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*170-150))*-1.5));


        this.setRotateAngle(neck1, neck1.rotateAngleX + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*170/0.5-350))*1), neck1.rotateAngleY + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*170-20))*1.5), neck1.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*170-150))*-1.5));


        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*170/0.5-450))*2), neck2.rotateAngleY + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*170-20))*-1.5), neck2.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*170-250))*-1.5));


        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*170/0.5-450))*-2), head.rotateAngleY + (float) Math.toRadians(0), head.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tail1, tail1.rotateAngleX + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*170/0.5))*-1), tail1.rotateAngleY + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*170))*-2), tail1.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*170-50))*-1.5));


        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*170/0.5-50))*-1), tail2.rotateAngleY + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*170-50))*-3), tail2.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*170-100))*-0.5));


        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*170/0.5-100))*-2), tail3.rotateAngleY + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*170-100))*-5), tail3.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*170-150))*-1));


        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*170/0.5-150))*-3), tail4.rotateAngleY + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*170-150))*-6), tail4.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*170-200))*-1));



        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 23.29835 + (((tickAnim - 0) / 3) * (26.9416-(23.29835)));
            yy = 5.66667 + (((tickAnim - 0) / 3) * (5.56747-(5.66667)));
            zz = 0.97695 + (((tickAnim - 0) / 3) * (0.74434-(0.97695)));
        }
        else if (tickAnim >= 3 && tickAnim < 18) {
            xx = 26.9416 + (((tickAnim - 3) / 15) * (-5.5-(26.9416)));
            yy = 5.56747 + (((tickAnim - 3) / 15) * (5.25-(5.56747)));
            zz = 0.74434 + (((tickAnim - 3) / 15) * (0-(0.74434)));
        }
        else if (tickAnim >= 18 && tickAnim < 43) {
            xx = -5.5 + (((tickAnim - 18) / 25) * (23.29835-(-5.5)));
            yy = 5.25 + (((tickAnim - 18) / 25) * (5.66667-(5.25)));
            zz = 0 + (((tickAnim - 18) / 25) * (0.97695-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg1, leftLeg1.rotateAngleX + (float) Math.toRadians(xx), leftLeg1.rotateAngleY + (float) Math.toRadians(yy), leftLeg1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 3.5 + (((tickAnim - 0) / 3) * (12.38-(3.5)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 8) {
            xx = 12.38 + (((tickAnim - 3) / 5) * (20.14-(12.38)));
            yy = 0 + (((tickAnim - 3) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 5) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 18) {
            xx = 20.14 + (((tickAnim - 8) / 10) * (-12.75-(20.14)));
            yy = 0 + (((tickAnim - 8) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 10) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = -12.75 + (((tickAnim - 18) / 2) * (-14.19-(-12.75)));
            yy = 0 + (((tickAnim - 18) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 2) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 43) {
            xx = -14.19 + (((tickAnim - 20) / 23) * (3.5-(-14.19)));
            yy = 0 + (((tickAnim - 20) / 23) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 23) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg2, leftLeg2.rotateAngleX + (float) Math.toRadians(xx), leftLeg2.rotateAngleY + (float) Math.toRadians(yy), leftLeg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 22.25 + (((tickAnim - 0) / 3) * (9.13-(22.25)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 11) {
            xx = 9.13 + (((tickAnim - 3) / 8) * (-21.63-(9.13)));
            yy = 0 + (((tickAnim - 3) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 8) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 15) {
            xx = -21.63 + (((tickAnim - 11) / 4) * (-30.88-(-21.63)));
            yy = 0 + (((tickAnim - 11) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 4) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 18) {
            xx = -30.88 + (((tickAnim - 15) / 3) * (-9.75-(-30.88)));
            yy = 0 + (((tickAnim - 15) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 3) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = -9.75 + (((tickAnim - 18) / 2) * (-11.44-(-9.75)));
            yy = 0 + (((tickAnim - 18) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 2) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 31) {
            xx = -11.44 + (((tickAnim - 20) / 11) * (-6.08-(-11.44)));
            yy = 0 + (((tickAnim - 20) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 11) * (0-(0)));
        }
        else if (tickAnim >= 31 && tickAnim < 43) {
            xx = -6.08 + (((tickAnim - 31) / 12) * (22.25-(-6.08)));
            yy = 0 + (((tickAnim - 31) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 31) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg3, leftLeg3.rotateAngleX + (float) Math.toRadians(xx), leftLeg3.rotateAngleY + (float) Math.toRadians(yy), leftLeg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 0) / 11) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 11) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 11) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 11) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 4) * (0.475-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 15) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 15) / 3) * (0-(0)));
            zz = 0.475 + (((tickAnim - 15) / 3) * (0-(0.475)));
        }
        else if (tickAnim >= 18 && tickAnim < 43) {
            xx = 0 + (((tickAnim - 18) / 25) * (0-(0)));
            yy = 0 + (((tickAnim - 18) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 25) * (0-(0)));
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
            xx = 19.75 + (((tickAnim - 0) / 3) * (57.25-(19.75)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 11) {
            xx = 57.25 + (((tickAnim - 3) / 8) * (77.02-(57.25)));
            yy = 0 + (((tickAnim - 3) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 8) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 13) {
            xx = 77.02 + (((tickAnim - 11) / 2) * (77.02-(77.02)));
            yy = 0 + (((tickAnim - 11) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 2) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 16) {
            xx = 77.02 + (((tickAnim - 13) / 3) * (43.85-(77.02)));
            yy = 0 + (((tickAnim - 13) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 3) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 18) {
            xx = 43.85 + (((tickAnim - 16) / 2) * (27-(43.85)));
            yy = 0 + (((tickAnim - 16) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 16) / 2) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = 27 + (((tickAnim - 18) / 2) * (28.75-(27)));
            yy = 0 + (((tickAnim - 18) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 2) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 31) {
            xx = 28.75 + (((tickAnim - 20) / 11) * (2.49-(28.75)));
            yy = 0 + (((tickAnim - 20) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 11) * (0-(0)));
        }
        else if (tickAnim >= 31 && tickAnim < 38) {
            xx = 2.49 + (((tickAnim - 31) / 7) * (-5.97-(2.49)));
            yy = 0 + (((tickAnim - 31) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 31) / 7) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 43) {
            xx = -5.97 + (((tickAnim - 38) / 5) * (19.75-(-5.97)));
            yy = 0 + (((tickAnim - 38) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 38) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg4, leftLeg4.rotateAngleX + (float) Math.toRadians(xx), leftLeg4.rotateAngleY + (float) Math.toRadians(yy), leftLeg4.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0.2 + (((tickAnim - 0) / 3) * (0-(0.2)));
            zz = 0 + (((tickAnim - 0) / 3) * (-0.925-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 3) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 3) / 8) * (0.6-(0)));
            zz = -0.925 + (((tickAnim - 3) / 8) * (-1.295-(-0.925)));
        }
        else if (tickAnim >= 11 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 11) / 2) * (0-(0)));
            yy = 0.6 + (((tickAnim - 11) / 2) * (0.6-(0.6)));
            zz = -1.295 + (((tickAnim - 11) / 2) * (-1.295-(-1.295)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 13) / 5) * (0-(0)));
            yy = 0.6 + (((tickAnim - 13) / 5) * (0-(0.6)));
            zz = -1.295 + (((tickAnim - 13) / 5) * (-0.45-(-1.295)));
        }
        else if (tickAnim >= 18 && tickAnim < 43) {
            xx = 0 + (((tickAnim - 18) / 25) * (0-(0)));
            yy = 0 + (((tickAnim - 18) / 25) * (0.2-(0)));
            zz = -0.45 + (((tickAnim - 18) / 25) * (0-(-0.45)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftLeg4.rotationPointX = this.leftLeg4.rotationPointX + (float)(xx);
        this.leftLeg4.rotationPointY = this.leftLeg4.rotationPointY - (float)(yy);
        this.leftLeg4.rotationPointZ = this.leftLeg4.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 21) {
            xx = -1.25 + (((tickAnim - 0) / 21) * (23.29835-(-1.25)));
            yy = -5.25 + (((tickAnim - 0) / 21) * (-5.66667-(-5.25)));
            zz = 0 + (((tickAnim - 0) / 21) * (-0.97695-(0)));
        }
        else if (tickAnim >= 21 && tickAnim < 24) {
            xx = 23.29835 + (((tickAnim - 21) / 3) * (26.9416-(23.29835)));
            yy = -5.66667 + (((tickAnim - 21) / 3) * (-5.56747-(-5.66667)));
            zz = -0.97695 + (((tickAnim - 21) / 3) * (-0.74434-(-0.97695)));
        }
        else if (tickAnim >= 24 && tickAnim < 39) {
            xx = 26.9416 + (((tickAnim - 24) / 15) * (-5.5-(26.9416)));
            yy = -5.56747 + (((tickAnim - 24) / 15) * (-5.25-(-5.56747)));
            zz = -0.74434 + (((tickAnim - 24) / 15) * (0-(-0.74434)));
        }
        else if (tickAnim >= 39 && tickAnim < 43) {
            xx = -5.5 + (((tickAnim - 39) / 4) * (-1.25-(-5.5)));
            yy = -5.25 + (((tickAnim - 39) / 4) * (-5.25-(-5.25)));
            zz = 0 + (((tickAnim - 39) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg9, rightLeg9.rotateAngleX + (float) Math.toRadians(xx), rightLeg9.rotateAngleY + (float) Math.toRadians(yy), rightLeg9.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 21) {
            xx = -14 + (((tickAnim - 0) / 21) * (3.5-(-14)));
            yy = 0 + (((tickAnim - 0) / 21) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 21) * (0-(0)));
        }
        else if (tickAnim >= 21 && tickAnim < 24) {
            xx = 3.5 + (((tickAnim - 21) / 3) * (12.38-(3.5)));
            yy = 0 + (((tickAnim - 21) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 21) / 3) * (0-(0)));
        }
        else if (tickAnim >= 24 && tickAnim < 29) {
            xx = 12.38 + (((tickAnim - 24) / 5) * (20.14-(12.38)));
            yy = 0 + (((tickAnim - 24) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 24) / 5) * (0-(0)));
        }
        else if (tickAnim >= 29 && tickAnim < 39) {
            xx = 20.14 + (((tickAnim - 29) / 10) * (-12.75-(20.14)));
            yy = 0 + (((tickAnim - 29) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 29) / 10) * (0-(0)));
        }
        else if (tickAnim >= 39 && tickAnim < 41) {
            xx = -12.75 + (((tickAnim - 39) / 2) * (-14.19-(-12.75)));
            yy = 0 + (((tickAnim - 39) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 39) / 2) * (0-(0)));
        }
        else if (tickAnim >= 41 && tickAnim < 43) {
            xx = -14.19 + (((tickAnim - 41) / 2) * (-14-(-14.19)));
            yy = 0 + (((tickAnim - 41) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 41) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg9, rightLeg9.rotateAngleX + (float) Math.toRadians(xx), rightLeg9.rotateAngleY + (float) Math.toRadians(yy), rightLeg9.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 21) {
            xx = -11.94 + (((tickAnim - 0) / 21) * (22.25-(-11.94)));
            yy = 0 + (((tickAnim - 0) / 21) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 21) * (0-(0)));
        }
        else if (tickAnim >= 21 && tickAnim < 24) {
            xx = 22.25 + (((tickAnim - 21) / 3) * (9.13-(22.25)));
            yy = 0 + (((tickAnim - 21) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 21) / 3) * (0-(0)));
        }
        else if (tickAnim >= 24 && tickAnim < 32) {
            xx = 9.13 + (((tickAnim - 24) / 8) * (-21.63-(9.13)));
            yy = 0 + (((tickAnim - 24) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 24) / 8) * (0-(0)));
        }
        else if (tickAnim >= 32 && tickAnim < 36) {
            xx = -21.63 + (((tickAnim - 32) / 4) * (-30.88-(-21.63)));
            yy = 0 + (((tickAnim - 32) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 32) / 4) * (0-(0)));
        }
        else if (tickAnim >= 36 && tickAnim < 39) {
            xx = -30.88 + (((tickAnim - 36) / 3) * (-9.75-(-30.88)));
            yy = 0 + (((tickAnim - 36) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 36) / 3) * (0-(0)));
        }
        else if (tickAnim >= 39 && tickAnim < 41) {
            xx = -9.75 + (((tickAnim - 39) / 2) * (-10.94-(-9.75)));
            yy = 0 + (((tickAnim - 39) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 39) / 2) * (0-(0)));
        }
        else if (tickAnim >= 41 && tickAnim < 43) {
            xx = -10.94 + (((tickAnim - 41) / 2) * (-11.94-(-10.94)));
            yy = 0 + (((tickAnim - 41) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 41) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg11, rightLeg11.rotateAngleX + (float) Math.toRadians(xx), rightLeg11.rotateAngleY + (float) Math.toRadians(yy), rightLeg11.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 21) {
            xx = 0 + (((tickAnim - 0) / 21) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 21) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 21) * (0-(0)));
        }
        else if (tickAnim >= 21 && tickAnim < 32) {
            xx = 0 + (((tickAnim - 21) / 11) * (0-(0)));
            yy = 0 + (((tickAnim - 21) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 21) / 11) * (0-(0)));
        }
        else if (tickAnim >= 32 && tickAnim < 36) {
            xx = 0 + (((tickAnim - 32) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 32) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 32) / 4) * (0.475-(0)));
        }
        else if (tickAnim >= 36 && tickAnim < 39) {
            xx = 0 + (((tickAnim - 36) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 36) / 3) * (0-(0)));
            zz = 0.475 + (((tickAnim - 36) / 3) * (0-(0.475)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightLeg11.rotationPointX = this.rightLeg11.rotationPointX + (float)(xx);
        this.rightLeg11.rotationPointY = this.rightLeg11.rotationPointY - (float)(yy);
        this.rightLeg11.rotationPointZ = this.rightLeg11.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 27.5 + (((tickAnim - 0) / 10) * (-8.97-(27.5)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 21) {
            xx = -8.97 + (((tickAnim - 10) / 11) * (19.75-(-8.97)));
            yy = 0 + (((tickAnim - 10) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 11) * (0-(0)));
        }
        else if (tickAnim >= 21 && tickAnim < 24) {
            xx = 19.75 + (((tickAnim - 21) / 3) * (57.25-(19.75)));
            yy = 0 + (((tickAnim - 21) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 21) / 3) * (0-(0)));
        }
        else if (tickAnim >= 24 && tickAnim < 32) {
            xx = 57.25 + (((tickAnim - 24) / 8) * (77.02-(57.25)));
            yy = 0 + (((tickAnim - 24) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 24) / 8) * (0-(0)));
        }
        else if (tickAnim >= 32 && tickAnim < 34) {
            xx = 77.02 + (((tickAnim - 32) / 2) * (77.02-(77.02)));
            yy = 0 + (((tickAnim - 32) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 32) / 2) * (0-(0)));
        }
        else if (tickAnim >= 34 && tickAnim < 37) {
            xx = 77.02 + (((tickAnim - 34) / 3) * (43.85-(77.02)));
            yy = 0 + (((tickAnim - 34) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 34) / 3) * (0-(0)));
        }
        else if (tickAnim >= 37 && tickAnim < 39) {
            xx = 43.85 + (((tickAnim - 37) / 2) * (27-(43.85)));
            yy = 0 + (((tickAnim - 37) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 37) / 2) * (0-(0)));
        }
        else if (tickAnim >= 39 && tickAnim < 41) {
            xx = 27 + (((tickAnim - 39) / 2) * (28.75-(27)));
            yy = 0 + (((tickAnim - 39) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 39) / 2) * (0-(0)));
        }
        else if (tickAnim >= 41 && tickAnim < 43) {
            xx = 28.75 + (((tickAnim - 41) / 2) * (27.5-(28.75)));
            yy = 0 + (((tickAnim - 41) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 41) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg12, rightLeg12.rotateAngleX + (float) Math.toRadians(xx), rightLeg12.rotateAngleY + (float) Math.toRadians(yy), rightLeg12.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0.525-(0)));
            zz = -0.525 + (((tickAnim - 0) / 10) * (-0.27-(-0.525)));
        }
        else if (tickAnim >= 10 && tickAnim < 21) {
            xx = 0 + (((tickAnim - 10) / 11) * (0-(0)));
            yy = 0.525 + (((tickAnim - 10) / 11) * (0.2-(0.525)));
            zz = -0.27 + (((tickAnim - 10) / 11) * (0-(-0.27)));
        }
        else if (tickAnim >= 21 && tickAnim < 24) {
            xx = 0 + (((tickAnim - 21) / 3) * (0-(0)));
            yy = 0.2 + (((tickAnim - 21) / 3) * (0-(0.2)));
            zz = 0 + (((tickAnim - 21) / 3) * (-0.925-(0)));
        }
        else if (tickAnim >= 24 && tickAnim < 32) {
            xx = 0 + (((tickAnim - 24) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 24) / 8) * (0.6-(0)));
            zz = -0.925 + (((tickAnim - 24) / 8) * (-1.295-(-0.925)));
        }
        else if (tickAnim >= 32 && tickAnim < 34) {
            xx = 0 + (((tickAnim - 32) / 2) * (0-(0)));
            yy = 0.6 + (((tickAnim - 32) / 2) * (0.6-(0.6)));
            zz = -1.295 + (((tickAnim - 32) / 2) * (-1.295-(-1.295)));
        }
        else if (tickAnim >= 34 && tickAnim < 39) {
            xx = 0 + (((tickAnim - 34) / 5) * (0-(0)));
            yy = 0.6 + (((tickAnim - 34) / 5) * (0-(0.6)));
            zz = -1.295 + (((tickAnim - 34) / 5) * (-0.45-(-1.295)));
        }
        else if (tickAnim >= 39 && tickAnim < 43) {
            xx = 0 + (((tickAnim - 39) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 39) / 4) * (0-(0)));
            zz = -0.45 + (((tickAnim - 39) / 4) * (-0.525-(-0.45)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightLeg12.rotationPointX = this.rightLeg12.rotationPointX + (float)(xx);
        this.rightLeg12.rotationPointY = this.rightLeg12.rotationPointY - (float)(yy);
        this.rightLeg12.rotationPointZ = this.rightLeg12.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = -36.52497 + (((tickAnim - 0) / 15) * (0-(-36.52497)));
            yy = 6.52547 + (((tickAnim - 0) / 15) * (0-(6.52547)));
            zz = 10.48081 + (((tickAnim - 0) / 15) * (0-(10.48081)));
        }
        else if (tickAnim >= 15 && tickAnim < 22) {
            xx = 0 + (((tickAnim - 15) / 7) * (-18.75611-(0)));
            yy = 0 + (((tickAnim - 15) / 7) * (5.76247-(0)));
            zz = 0 + (((tickAnim - 15) / 7) * (12.82151-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 26) {
            xx = -18.75611 + (((tickAnim - 22) / 4) * (-38.14632-(-18.75611)));
            yy = 5.76247 + (((tickAnim - 22) / 4) * (9.13161-(5.76247)));
            zz = 12.82151 + (((tickAnim - 22) / 4) * (21.29253-(12.82151)));
        }
        else if (tickAnim >= 26 && tickAnim < 33) {
            xx = -38.14632 + (((tickAnim - 26) / 7) * (-56.50611-(-38.14632)));
            yy = 9.13161 + (((tickAnim - 26) / 7) * (9.21247-(9.13161)));
            zz = 21.29253 + (((tickAnim - 26) / 7) * (14.79651-(21.29253)));
        }
        else if (tickAnim >= 33 && tickAnim < 43) {
            xx = -56.50611 + (((tickAnim - 33) / 10) * (-36.52497-(-56.50611)));
            yy = 9.21247 + (((tickAnim - 33) / 10) * (6.52547-(9.21247)));
            zz = 14.79651 + (((tickAnim - 33) / 10) * (10.48081-(14.79651)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm, rightArm.rotateAngleX + (float) Math.toRadians(xx), rightArm.rotateAngleY + (float) Math.toRadians(yy), rightArm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 10.38 + (((tickAnim - 0) / 15) * (9.25-(10.38)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 18) {
            xx = 9.25 + (((tickAnim - 15) / 3) * (10.09703-(9.25)));
            yy = 0 + (((tickAnim - 15) / 3) * (-2.31114-(0)));
            zz = 0 + (((tickAnim - 15) / 3) * (0.75864-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 23) {
            xx = 10.09703 + (((tickAnim - 18) / 5) * (-12.09322-(10.09703)));
            yy = -2.31114 + (((tickAnim - 18) / 5) * (-7.7038-(-2.31114)));
            zz = 0.75864 + (((tickAnim - 18) / 5) * (2.52879-(0.75864)));
        }
        else if (tickAnim >= 23 && tickAnim < 26) {
            xx = -12.09322 + (((tickAnim - 23) / 3) * (-21.83305-(-12.09322)));
            yy = -7.7038 + (((tickAnim - 23) / 3) * (-4.10869-(-7.7038)));
            zz = 2.52879 + (((tickAnim - 23) / 3) * (1.34869-(2.52879)));
        }
        else if (tickAnim >= 26 && tickAnim < 33) {
            xx = -21.83305 + (((tickAnim - 26) / 7) * (15.25-(-21.83305)));
            yy = -4.10869 + (((tickAnim - 26) / 7) * (0-(-4.10869)));
            zz = 1.34869 + (((tickAnim - 26) / 7) * (0-(1.34869)));
        }
        else if (tickAnim >= 33 && tickAnim < 36) {
            xx = 15.25 + (((tickAnim - 33) / 3) * (13.47-(15.25)));
            yy = 0 + (((tickAnim - 33) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 3) * (2.475-(0)));
        }
        else if (tickAnim >= 36 && tickAnim < 43) {
            xx = 13.47 + (((tickAnim - 36) / 7) * (10.38-(13.47)));
            yy = 0 + (((tickAnim - 36) / 7) * (0-(0)));
            zz = 2.475 + (((tickAnim - 36) / 7) * (0-(2.475)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm10, rightArm10.rotateAngleX + (float) Math.toRadians(xx), rightArm10.rotateAngleY + (float) Math.toRadians(yy), rightArm10.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 0) / 23) * (0-(0)));
            yy = 0.15 + (((tickAnim - 0) / 23) * (0-(0.15)));
            zz = 0.15 + (((tickAnim - 0) / 23) * (0.4-(0.15)));
        }
        else if (tickAnim >= 23 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 23) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 23) / 10) * (0-(0)));
            zz = 0.4 + (((tickAnim - 23) / 10) * (0-(0.4)));
        }
        else if (tickAnim >= 33 && tickAnim < 43) {
            xx = 0 + (((tickAnim - 33) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 33) / 10) * (0.15-(0)));
            zz = 0 + (((tickAnim - 33) / 10) * (0.15-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightArm10.rotationPointX = this.rightArm10.rotationPointX + (float)(xx);
        this.rightArm10.rotationPointY = this.rightArm10.rotationPointY - (float)(yy);
        this.rightArm10.rotationPointZ = this.rightArm10.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 20.96085 + (((tickAnim - 0) / 15) * (29.75-(20.96085)));
            yy = -0.61636 + (((tickAnim - 0) / 15) * (0-(-0.61636)));
            zz = -0.21586 + (((tickAnim - 0) / 15) * (0-(-0.21586)));
        }
        else if (tickAnim >= 15 && tickAnim < 21) {
            xx = 29.75 + (((tickAnim - 15) / 6) * (91.83252-(29.75)));
            yy = 0 + (((tickAnim - 15) / 6) * (-11.98014-(0)));
            zz = 0 + (((tickAnim - 15) / 6) * (-2.40681-(0)));
        }
        else if (tickAnim >= 21 && tickAnim < 24) {
            xx = 91.83252 + (((tickAnim - 21) / 3) * (87.27116-(91.83252)));
            yy = -11.98014 + (((tickAnim - 21) / 3) * (-13.11389-(-11.98014)));
            zz = -2.40681 + (((tickAnim - 21) / 3) * (-1.91219-(-2.40681)));
        }
        else if (tickAnim >= 24 && tickAnim < 33) {
            xx = 87.27116 + (((tickAnim - 24) / 9) * (39.78461-(87.27116)));
            yy = -13.11389 + (((tickAnim - 24) / 9) * (-1.54361-(-13.11389)));
            zz = -1.91219 + (((tickAnim - 24) / 9) * (1.30321-(-1.91219)));
        }
        else if (tickAnim >= 33 && tickAnim < 36) {
            xx = 39.78461 + (((tickAnim - 33) / 3) * (36.03877-(39.78461)));
            yy = -1.54361 + (((tickAnim - 33) / 3) * (0.30981-(-1.54361)));
            zz = 1.30321 + (((tickAnim - 33) / 3) * (-0.73344-(1.30321)));
        }
        else if (tickAnim >= 36 && tickAnim < 43) {
            xx = 36.03877 + (((tickAnim - 36) / 7) * (20.96085-(36.03877)));
            yy = 0.30981 + (((tickAnim - 36) / 7) * (-0.61636-(0.30981)));
            zz = -0.73344 + (((tickAnim - 36) / 7) * (-0.21586-(-0.73344)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm11, rightArm11.rotateAngleX + (float) Math.toRadians(xx), rightArm11.rotateAngleY + (float) Math.toRadians(yy), rightArm11.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            yy = 0.98 + (((tickAnim - 0) / 15) * (0.8-(0.98)));
            zz = -0.22 + (((tickAnim - 0) / 15) * (-0.475-(-0.22)));
        }
        else if (tickAnim >= 15 && tickAnim < 21) {
            xx = 0 + (((tickAnim - 15) / 6) * (0.03-(0)));
            yy = 0.8 + (((tickAnim - 15) / 6) * (1.255-(0.8)));
            zz = -0.475 + (((tickAnim - 15) / 6) * (-1.435-(-0.475)));
        }
        else if (tickAnim >= 21 && tickAnim < 24) {
            xx = 0.03 + (((tickAnim - 21) / 3) * (0.1-(0.03)));
            yy = 1.255 + (((tickAnim - 21) / 3) * (1.725-(1.255)));
            zz = -1.435 + (((tickAnim - 21) / 3) * (-1.25-(-1.435)));
        }
        else if (tickAnim >= 24 && tickAnim < 33) {
            xx = 0.1 + (((tickAnim - 24) / 9) * (0-(0.1)));
            yy = 1.725 + (((tickAnim - 24) / 9) * (0.975-(1.725)));
            zz = -1.25 + (((tickAnim - 24) / 9) * (-0.225-(-1.25)));
        }
        else if (tickAnim >= 33 && tickAnim < 36) {
            xx = 0 + (((tickAnim - 33) / 3) * (0-(0)));
            yy = 0.975 + (((tickAnim - 33) / 3) * (0.9-(0.975)));
            zz = -0.225 + (((tickAnim - 33) / 3) * (-0.25-(-0.225)));
        }
        else if (tickAnim >= 36 && tickAnim < 43) {
            xx = 0 + (((tickAnim - 36) / 7) * (0-(0)));
            yy = 0.9 + (((tickAnim - 36) / 7) * (0.98-(0.9)));
            zz = -0.25 + (((tickAnim - 36) / 7) * (-0.22-(-0.25)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightArm11.rotationPointX = this.rightArm11.rotationPointX + (float)(xx);
        this.rightArm11.rotationPointY = this.rightArm11.rotationPointY - (float)(yy);
        this.rightArm11.rotationPointZ = this.rightArm11.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = -18.75611 + (((tickAnim - 0) / 5) * (-38.14632-(-18.75611)));
            yy = -9.21247 + (((tickAnim - 0) / 5) * (-9.13161-(-9.21247)));
            zz = -14.79651 + (((tickAnim - 0) / 5) * (-21.29253-(-14.79651)));
        }
        else if (tickAnim >= 5 && tickAnim < 13) {
            xx = -38.14632 + (((tickAnim - 5) / 8) * (-56.50611-(-38.14632)));
            yy = -9.13161 + (((tickAnim - 5) / 8) * (-9.21247-(-9.13161)));
            zz = -21.29253 + (((tickAnim - 5) / 8) * (-14.79651-(-21.29253)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
            xx = -56.50611 + (((tickAnim - 13) / 5) * (-41.02497-(-56.50611)));
            yy = -9.21247 + (((tickAnim - 13) / 5) * (-6.52547-(-9.21247)));
            zz = -14.79651 + (((tickAnim - 13) / 5) * (-10.48081-(-14.79651)));
        }
        else if (tickAnim >= 18 && tickAnim < 33) {
            xx = -41.02497 + (((tickAnim - 18) / 15) * (0-(-41.02497)));
            yy = -6.52547 + (((tickAnim - 18) / 15) * (0-(-6.52547)));
            zz = -10.48081 + (((tickAnim - 18) / 15) * (0-(-10.48081)));
        }
        else if (tickAnim >= 33 && tickAnim < 43) {
            xx = 0 + (((tickAnim - 33) / 10) * (-18.75611-(0)));
            yy = 0 + (((tickAnim - 33) / 10) * (-9.21247-(0)));
            zz = 0 + (((tickAnim - 33) / 10) * (-14.79651-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm, leftArm.rotateAngleX + (float) Math.toRadians(xx), leftArm.rotateAngleY + (float) Math.toRadians(yy), leftArm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = -12.09322 + (((tickAnim - 0) / 5) * (-21.83305-(-12.09322)));
            yy = 7.7038 + (((tickAnim - 0) / 5) * (4.10869-(7.7038)));
            zz = -2.52879 + (((tickAnim - 0) / 5) * (-1.34869-(-2.52879)));
        }
        else if (tickAnim >= 5 && tickAnim < 13) {
            xx = -21.83305 + (((tickAnim - 5) / 8) * (15.25-(-21.83305)));
            yy = 4.10869 + (((tickAnim - 5) / 8) * (0-(4.10869)));
            zz = -1.34869 + (((tickAnim - 5) / 8) * (0-(-1.34869)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = 15.25 + (((tickAnim - 13) / 2) * (9.72-(15.25)));
            yy = 0 + (((tickAnim - 13) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 2) * (-0.025-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 18) {
            xx = 9.72 + (((tickAnim - 15) / 3) * (10.38-(9.72)));
            yy = 0 + (((tickAnim - 15) / 3) * (0-(0)));
            zz = -0.025 + (((tickAnim - 15) / 3) * (0-(-0.025)));
        }
        else if (tickAnim >= 18 && tickAnim < 33) {
            xx = 10.38 + (((tickAnim - 18) / 15) * (9.25-(10.38)));
            yy = 0 + (((tickAnim - 18) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 15) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 36) {
            xx = 9.25 + (((tickAnim - 33) / 3) * (10.09703-(9.25)));
            yy = 0 + (((tickAnim - 33) / 3) * (2.31114-(0)));
            zz = 0 + (((tickAnim - 33) / 3) * (-0.75864-(0)));
        }
        else if (tickAnim >= 36 && tickAnim < 43) {
            xx = 10.09703 + (((tickAnim - 36) / 7) * (-12.09322-(10.09703)));
            yy = 2.31114 + (((tickAnim - 36) / 7) * (7.7038-(2.31114)));
            zz = -0.75864 + (((tickAnim - 36) / 7) * (-2.52879-(-0.75864)));
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
            zz = 0.4 + (((tickAnim - 0) / 13) * (0-(0.4)));
        }
        else if (tickAnim >= 13 && tickAnim < 43) {
            xx = 0 + (((tickAnim - 13) / 30) * (0-(0)));
            yy = 0 + (((tickAnim - 13) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 30) * (0.4-(0)));
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
            xx = 87.27116 + (((tickAnim - 0) / 5) * (97.36077-(87.27116)));
            yy = 13.11389 + (((tickAnim - 0) / 5) * (7.71443-(13.11389)));
            zz = 1.91219 + (((tickAnim - 0) / 5) * (0.41167-(1.91219)));
        }
        else if (tickAnim >= 5 && tickAnim < 13) {
            xx = 97.36077 + (((tickAnim - 5) / 8) * (39.78461-(97.36077)));
            yy = 7.71443 + (((tickAnim - 5) / 8) * (1.54361-(7.71443)));
            zz = 0.41167 + (((tickAnim - 5) / 8) * (-1.30321-(0.41167)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = 39.78461 + (((tickAnim - 13) / 2) * (40.2831-(39.78461)));
            yy = 1.54361 + (((tickAnim - 13) / 2) * (0.979-(1.54361)));
            zz = -1.30321 + (((tickAnim - 13) / 2) * (-3.28083-(-1.30321)));
        }
        else if (tickAnim >= 15 && tickAnim < 18) {
            xx = 40.2831 + (((tickAnim - 15) / 3) * (30.06812-(40.2831)));
            yy = 0.979 + (((tickAnim - 15) / 3) * (1.2155-(0.979)));
            zz = -3.28083 + (((tickAnim - 15) / 3) * (-1.02619-(-3.28083)));
        }
        else if (tickAnim >= 18 && tickAnim < 23) {
            xx = 30.06812 + (((tickAnim - 18) / 5) * (18.48545-(30.06812)));
            yy = 1.2155 + (((tickAnim - 18) / 5) * (0.80536-(1.2155)));
            zz = -1.02619 + (((tickAnim - 18) / 5) * (-0.67994-(-1.02619)));
        }
        else if (tickAnim >= 23 && tickAnim < 33) {
            xx = 18.48545 + (((tickAnim - 23) / 10) * (29.75-(18.48545)));
            yy = 0.80536 + (((tickAnim - 23) / 10) * (0-(0.80536)));
            zz = -0.67994 + (((tickAnim - 23) / 10) * (0-(-0.67994)));
        }
        else if (tickAnim >= 33 && tickAnim < 39) {
            xx = 29.75 + (((tickAnim - 33) / 6) * (92.00635-(29.75)));
            yy = 0 + (((tickAnim - 33) / 6) * (3.93417-(0)));
            zz = 0 + (((tickAnim - 33) / 6) * (0.57366-(0)));
        }
        else if (tickAnim >= 39 && tickAnim < 43) {
            xx = 92.00635 + (((tickAnim - 39) / 4) * (87.27116-(92.00635)));
            yy = 3.93417 + (((tickAnim - 39) / 4) * (13.11389-(3.93417)));
            zz = 0.57366 + (((tickAnim - 39) / 4) * (1.91219-(0.57366)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm3, leftArm3.rotateAngleX + (float) Math.toRadians(xx), leftArm3.rotateAngleY + (float) Math.toRadians(yy), leftArm3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0.1 + (((tickAnim - 0) / 5) * (0.05-(0.1)));
            yy = 1.725 + (((tickAnim - 0) / 5) * (1.38-(1.725)));
            zz = -1.25 + (((tickAnim - 0) / 5) * (-1.345-(-1.25)));
        }
        else if (tickAnim >= 5 && tickAnim < 13) {
            xx = 0.05 + (((tickAnim - 5) / 8) * (0-(0.05)));
            yy = 1.38 + (((tickAnim - 5) / 8) * (0.975-(1.38)));
            zz = -1.345 + (((tickAnim - 5) / 8) * (-0.225-(-1.345)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 13) / 2) * (0-(0)));
            yy = 0.975 + (((tickAnim - 13) / 2) * (0.975-(0.975)));
            zz = -0.225 + (((tickAnim - 13) / 2) * (-0.25-(-0.225)));
        }
        else if (tickAnim >= 15 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 15) / 3) * (0-(0)));
            yy = 0.975 + (((tickAnim - 15) / 3) * (1.225-(0.975)));
            zz = -0.25 + (((tickAnim - 15) / 3) * (-0.28-(-0.25)));
        }
        else if (tickAnim >= 18 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 18) / 5) * (0-(0)));
            yy = 1.225 + (((tickAnim - 18) / 5) * (1.265-(1.225)));
            zz = -0.28 + (((tickAnim - 18) / 5) * (-0.34-(-0.28)));
        }
        else if (tickAnim >= 23 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 23) / 10) * (0-(0)));
            yy = 1.265 + (((tickAnim - 23) / 10) * (0.8-(1.265)));
            zz = -0.34 + (((tickAnim - 23) / 10) * (-0.475-(-0.34)));
        }
        else if (tickAnim >= 33 && tickAnim < 39) {
            xx = 0 + (((tickAnim - 33) / 6) * (0.03-(0)));
            yy = 0.8 + (((tickAnim - 33) / 6) * (1.255-(0.8)));
            zz = -0.475 + (((tickAnim - 33) / 6) * (-1.435-(-0.475)));
        }
        else if (tickAnim >= 39 && tickAnim < 43) {
            xx = 0.03 + (((tickAnim - 39) / 4) * (0.1-(0.03)));
            yy = 1.255 + (((tickAnim - 39) / 4) * (1.725-(1.255)));
            zz = -1.435 + (((tickAnim - 39) / 4) * (-1.25-(-1.435)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftArm3.rotationPointX = this.leftArm3.rotationPointX + (float)(xx);
        this.leftArm3.rotationPointY = this.leftArm3.rotationPointY - (float)(yy);
        this.leftArm3.rotationPointZ = this.leftArm3.rotationPointZ + (float)(zz);
        
    }
    public void animRunning(EntityLivingBase entitylivinghipIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraAntarctopelta entity = (EntityPrehistoricFloraAntarctopelta) entitylivinghipIn;
        int animCycle = 20;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        this.setRotateAngle(hip, hip.rotateAngleX + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5-50))*3), hip.rotateAngleY + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360+30))*-4), hip.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-50))*4));
        this.hip.rotationPointX = this.hip.rotationPointX + (float)(0);
        this.hip.rotationPointY = this.hip.rotationPointY - (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5-190))*-0.5);
        this.hip.rotationPointZ = this.hip.rotationPointZ + (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5-50))*-0.5);


        this.setRotateAngle(body1, body1.rotateAngleX + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5-190))*3), body1.rotateAngleY + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360+150))*4), body1.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-150))*4));


        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5-290))*3), chest.rotateAngleY + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-50))*4.5), chest.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-150))*-4.5));


        this.setRotateAngle(neck1, neck1.rotateAngleX + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5-350))*3), neck1.rotateAngleY + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-20))*4.5), neck1.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-150))*-4.5));


        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5-450))*4), neck2.rotateAngleY + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-20))*-4.5), neck2.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-250))*-4.5));


        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5-450))*-4), head.rotateAngleY + (float) Math.toRadians(0), head.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tail1, tail1.rotateAngleX + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5))*-4), tail1.rotateAngleY + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360))*-2), tail1.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-50))*-1.5));


        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5-50))*-4), tail2.rotateAngleY + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-50))*-3), tail2.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-100))*-0.5));


        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5-100))*-4), tail3.rotateAngleY + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-100))*-5), tail3.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-150))*-1));


        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5-150))*-6), tail4.rotateAngleY + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-150))*-6), tail4.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-200))*-1));



        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 23.29835 + (((tickAnim - 0) / 8) * (-13.5-(23.29835)));
            yy = 5.66667 + (((tickAnim - 0) / 8) * (5.25-(5.66667)));
            zz = 0.97695 + (((tickAnim - 0) / 8) * (0-(0.97695)));
        }
        else if (tickAnim >= 8 && tickAnim < 20) {
            xx = -13.5 + (((tickAnim - 8) / 12) * (23.29835-(-13.5)));
            yy = 5.25 + (((tickAnim - 8) / 12) * (5.66667-(5.25)));
            zz = 0 + (((tickAnim - 8) / 12) * (0.97695-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg1, leftLeg1.rotateAngleX + (float) Math.toRadians(xx), leftLeg1.rotateAngleY + (float) Math.toRadians(yy), leftLeg1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 3 + (((tickAnim - 0) / 2) * (12.38-(3)));
            yy = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 2) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = 12.38 + (((tickAnim - 2) / 1) * (20.14-(12.38)));
            yy = 0 + (((tickAnim - 2) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 2) / 1) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 8) {
            xx = 20.14 + (((tickAnim - 3) / 5) * (-22-(20.14)));
            yy = 0 + (((tickAnim - 3) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 5) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 20) {
            xx = -22 + (((tickAnim - 8) / 12) * (3-(-22)));
            yy = 0 + (((tickAnim - 8) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg2, leftLeg2.rotateAngleX + (float) Math.toRadians(xx), leftLeg2.rotateAngleY + (float) Math.toRadians(yy), leftLeg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 22.25 + (((tickAnim - 0) / 2) * (9.13-(22.25)));
            yy = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 2) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 5) {
            xx = 9.13 + (((tickAnim - 2) / 3) * (-21.63-(9.13)));
            yy = 0 + (((tickAnim - 2) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 2) / 3) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 7) {
            xx = -21.63 + (((tickAnim - 5) / 2) * (-30.88-(-21.63)));
            yy = 0 + (((tickAnim - 5) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 2) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = -30.88 + (((tickAnim - 7) / 1) * (5.25-(-30.88)));
            yy = 0 + (((tickAnim - 7) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 1) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 20) {
            xx = 5.25 + (((tickAnim - 8) / 12) * (22.25-(5.25)));
            yy = 0 + (((tickAnim - 8) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg3, leftLeg3.rotateAngleX + (float) Math.toRadians(xx), leftLeg3.rotateAngleY + (float) Math.toRadians(yy), leftLeg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 5) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 5) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 2) * (0.475-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 7) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 7) / 1) * (0-(0)));
            zz = 0.475 + (((tickAnim - 7) / 1) * (0-(0.475)));
        }
        else if (tickAnim >= 8 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 8) / 12) * (0-(0)));
            yy = 0 + (((tickAnim - 8) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 12) * (0-(0)));
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
            xx = 35.5 + (((tickAnim - 0) / 2) * (57.25-(35.5)));
            yy = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 2) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 5) {
            xx = 57.25 + (((tickAnim - 2) / 3) * (77.02-(57.25)));
            yy = 0 + (((tickAnim - 2) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 2) / 3) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 7) {
            xx = 77.02 + (((tickAnim - 5) / 2) * (77.02-(77.02)));
            yy = 0 + (((tickAnim - 5) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 2) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = 77.02 + (((tickAnim - 7) / 1) * (43.85-(77.02)));
            yy = 0 + (((tickAnim - 7) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 1) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 8) {
            xx = 43.85 + (((tickAnim - 8) / 0) * (27-(43.85)));
            yy = 0 + (((tickAnim - 8) / 0) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 0) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 9) {
            xx = 27 + (((tickAnim - 8) / 1) * (20.25-(27)));
            yy = 0 + (((tickAnim - 8) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 1) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 14) {
            xx = 20.25 + (((tickAnim - 9) / 5) * (-5.26-(20.25)));
            yy = 0 + (((tickAnim - 9) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 5) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 18) {
            xx = -5.26 + (((tickAnim - 14) / 4) * (-6.47-(-5.26)));
            yy = 0 + (((tickAnim - 14) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 4) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = -6.47 + (((tickAnim - 18) / 2) * (35.5-(-6.47)));
            yy = 0 + (((tickAnim - 18) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg4, leftLeg4.rotateAngleX + (float) Math.toRadians(xx), leftLeg4.rotateAngleY + (float) Math.toRadians(yy), leftLeg4.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 2) * (-0.925-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 2) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 2) / 3) * (0.6-(0)));
            zz = -0.925 + (((tickAnim - 2) / 3) * (-1.295-(-0.925)));
        }
        else if (tickAnim >= 5 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 5) / 2) * (0-(0)));
            yy = 0.6 + (((tickAnim - 5) / 2) * (0.6-(0.6)));
            zz = -1.295 + (((tickAnim - 5) / 2) * (-1.295-(-1.295)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 7) / 1) * (0-(0)));
            yy = 0.6 + (((tickAnim - 7) / 1) * (0-(0.6)));
            zz = -1.295 + (((tickAnim - 7) / 1) * (-0.45-(-1.295)));
        }
        else if (tickAnim >= 8 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 8) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 8) / 6) * (1.225-(0)));
            zz = -0.45 + (((tickAnim - 8) / 6) * (-0.22-(-0.45)));
        }
        else if (tickAnim >= 14 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 14) / 4) * (0-(0)));
            yy = 1.225 + (((tickAnim - 14) / 4) * (1.03-(1.225)));
            zz = -0.22 + (((tickAnim - 14) / 4) * (-0.09-(-0.22)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 18) / 2) * (0-(0)));
            yy = 1.03 + (((tickAnim - 18) / 2) * (0-(1.03)));
            zz = -0.09 + (((tickAnim - 18) / 2) * (0-(-0.09)));
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
            xx = -9 + (((tickAnim - 0) / 10) * (23.29835-(-9)));
            yy = -5.25 + (((tickAnim - 0) / 10) * (-5.66667-(-5.25)));
            zz = 0 + (((tickAnim - 0) / 10) * (-0.97695-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 12) {
            xx = 23.29835 + (((tickAnim - 10) / 2) * (26.9416-(23.29835)));
            yy = -5.66667 + (((tickAnim - 10) / 2) * (-5.56747-(-5.66667)));
            zz = -0.97695 + (((tickAnim - 10) / 2) * (-0.74434-(-0.97695)));
        }
        else if (tickAnim >= 12 && tickAnim < 18) {
            xx = 26.9416 + (((tickAnim - 12) / 6) * (-5.5-(26.9416)));
            yy = -5.56747 + (((tickAnim - 12) / 6) * (-5.25-(-5.56747)));
            zz = -0.74434 + (((tickAnim - 12) / 6) * (0-(-0.74434)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = -5.5 + (((tickAnim - 18) / 2) * (-9-(-5.5)));
            yy = -5.25 + (((tickAnim - 18) / 2) * (-5.25-(-5.25)));
            zz = 0 + (((tickAnim - 18) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg9, rightLeg9.rotateAngleX + (float) Math.toRadians(xx), rightLeg9.rotateAngleY + (float) Math.toRadians(yy), rightLeg9.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = -24.75 + (((tickAnim - 0) / 10) * (14.5-(-24.75)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 12) {
            xx = 14.5 + (((tickAnim - 10) / 2) * (12.38-(14.5)));
            yy = 0 + (((tickAnim - 10) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 2) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 13) {
            xx = 12.38 + (((tickAnim - 12) / 1) * (20.14-(12.38)));
            yy = 0 + (((tickAnim - 12) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 1) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
            xx = 20.14 + (((tickAnim - 13) / 5) * (-12.75-(20.14)));
            yy = 0 + (((tickAnim - 13) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 5) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = -12.75 + (((tickAnim - 18) / 2) * (-24.75-(-12.75)));
            yy = 0 + (((tickAnim - 18) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg9, rightLeg9.rotateAngleX + (float) Math.toRadians(xx), rightLeg9.rotateAngleY + (float) Math.toRadians(yy), rightLeg9.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 2.81 + (((tickAnim - 0) / 10) * (22.25-(2.81)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 12) {
            xx = 22.25 + (((tickAnim - 10) / 2) * (9.13-(22.25)));
            yy = 0 + (((tickAnim - 10) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 2) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 15) {
            xx = 9.13 + (((tickAnim - 12) / 3) * (-21.63-(9.13)));
            yy = 0 + (((tickAnim - 12) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 3) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 17) {
            xx = -21.63 + (((tickAnim - 15) / 2) * (-30.88-(-21.63)));
            yy = 0 + (((tickAnim - 15) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 2) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 18) {
            xx = -30.88 + (((tickAnim - 17) / 1) * (-25.5-(-30.88)));
            yy = 0 + (((tickAnim - 17) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 17) / 1) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = -25.5 + (((tickAnim - 18) / 2) * (2.81-(-25.5)));
            yy = 0 + (((tickAnim - 18) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg11, rightLeg11.rotateAngleX + (float) Math.toRadians(xx), rightLeg11.rotateAngleY + (float) Math.toRadians(yy), rightLeg11.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 10) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 5) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 17) {
            xx = 0 + (((tickAnim - 15) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 15) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 2) * (0.475-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 17) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 17) / 1) * (0-(0)));
            zz = 0.475 + (((tickAnim - 17) / 1) * (0-(0.475)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 18) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 18) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightLeg11.rotationPointX = this.rightLeg11.rotationPointX + (float)(xx);
        this.rightLeg11.rotationPointY = this.rightLeg11.rotationPointY - (float)(yy);
        this.rightLeg11.rotationPointZ = this.rightLeg11.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 27.5 + (((tickAnim - 0) / 5) * (-13.97-(27.5)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = -13.97 + (((tickAnim - 5) / 5) * (45.5-(-13.97)));
            yy = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 5) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 12) {
            xx = 45.5 + (((tickAnim - 10) / 2) * (57.25-(45.5)));
            yy = 0 + (((tickAnim - 10) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 2) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 15) {
            xx = 57.25 + (((tickAnim - 12) / 3) * (77.02-(57.25)));
            yy = 0 + (((tickAnim - 12) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 3) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 16) {
            xx = 77.02 + (((tickAnim - 15) / 1) * (77.02-(77.02)));
            yy = 0 + (((tickAnim - 15) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 1) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 18) {
            xx = 77.02 + (((tickAnim - 16) / 2) * (43.85-(77.02)));
            yy = 0 + (((tickAnim - 16) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 16) / 2) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 18) {
            xx = 43.85 + (((tickAnim - 18) / 0) * (51.75-(43.85)));
            yy = 0 + (((tickAnim - 18) / 0) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 0) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = 51.75 + (((tickAnim - 18) / 2) * (27.5-(51.75)));
            yy = 0 + (((tickAnim - 18) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg12, rightLeg12.rotateAngleX + (float) Math.toRadians(xx), rightLeg12.rotateAngleY + (float) Math.toRadians(yy), rightLeg12.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (1.1-(0)));
            zz = -0.525 + (((tickAnim - 0) / 5) * (-0.27-(-0.525)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            yy = 1.1 + (((tickAnim - 5) / 5) * (0.2-(1.1)));
            zz = -0.27 + (((tickAnim - 5) / 5) * (0-(-0.27)));
        }
        else if (tickAnim >= 10 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 10) / 2) * (0-(0)));
            yy = 0.2 + (((tickAnim - 10) / 2) * (0-(0.2)));
            zz = 0 + (((tickAnim - 10) / 2) * (-0.925-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 12) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 12) / 3) * (0.6-(0)));
            zz = -0.925 + (((tickAnim - 12) / 3) * (-1.295-(-0.925)));
        }
        else if (tickAnim >= 15 && tickAnim < 16) {
            xx = 0 + (((tickAnim - 15) / 1) * (0-(0)));
            yy = 0.6 + (((tickAnim - 15) / 1) * (0.6-(0.6)));
            zz = -1.295 + (((tickAnim - 15) / 1) * (-1.295-(-1.295)));
        }
        else if (tickAnim >= 16 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 16) / 2) * (0-(0)));
            yy = 0.6 + (((tickAnim - 16) / 2) * (1.075-(0.6)));
            zz = -1.295 + (((tickAnim - 16) / 2) * (-0.875-(-1.295)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 18) / 2) * (0-(0)));
            yy = 1.075 + (((tickAnim - 18) / 2) * (0-(1.075)));
            zz = -0.875 + (((tickAnim - 18) / 2) * (-0.525-(-0.875)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightLeg12.rotationPointX = this.rightLeg12.rotationPointX + (float)(xx);
        this.rightLeg12.rotationPointY = this.rightLeg12.rotationPointY - (float)(yy);
        this.rightLeg12.rotationPointZ = this.rightLeg12.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = -28.02497 + (((tickAnim - 0) / 7) * (5-(-28.02497)));
            yy = 6.52547 + (((tickAnim - 0) / 7) * (0-(6.52547)));
            zz = 10.48081 + (((tickAnim - 0) / 7) * (0-(10.48081)));
        }
        else if (tickAnim >= 7 && tickAnim < 10) {
            xx = 5 + (((tickAnim - 7) / 3) * (-18.75611-(5)));
            yy = 0 + (((tickAnim - 7) / 3) * (5.76247-(0)));
            zz = 0 + (((tickAnim - 7) / 3) * (12.82151-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = -18.75611 + (((tickAnim - 10) / 3) * (-38.14632-(-18.75611)));
            yy = 5.76247 + (((tickAnim - 10) / 3) * (9.13161-(5.76247)));
            zz = 12.82151 + (((tickAnim - 10) / 3) * (21.29253-(12.82151)));
        }
        else if (tickAnim >= 13 && tickAnim < 16) {
            xx = -38.14632 + (((tickAnim - 13) / 3) * (-67.25611-(-38.14632)));
            yy = 9.13161 + (((tickAnim - 13) / 3) * (9.21247-(9.13161)));
            zz = 21.29253 + (((tickAnim - 13) / 3) * (14.79651-(21.29253)));
        }
        else if (tickAnim >= 16 && tickAnim < 20) {
            xx = -67.25611 + (((tickAnim - 16) / 4) * (-28.02497-(-67.25611)));
            yy = 9.21247 + (((tickAnim - 16) / 4) * (6.52547-(9.21247)));
            zz = 14.79651 + (((tickAnim - 16) / 4) * (10.48081-(14.79651)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm, rightArm.rotateAngleX + (float) Math.toRadians(xx), rightArm.rotateAngleY + (float) Math.toRadians(yy), rightArm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 2.88 + (((tickAnim - 0) / 7) * (29-(2.88)));
            yy = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = 29 + (((tickAnim - 7) / 1) * (10.09703-(29)));
            yy = 0 + (((tickAnim - 7) / 1) * (-2.31114-(0)));
            zz = 0 + (((tickAnim - 7) / 1) * (0.75864-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 11) {
            xx = 10.09703 + (((tickAnim - 8) / 3) * (-12.09322-(10.09703)));
            yy = -2.31114 + (((tickAnim - 8) / 3) * (-7.7038-(-2.31114)));
            zz = 0.75864 + (((tickAnim - 8) / 3) * (2.52879-(0.75864)));
        }
        else if (tickAnim >= 11 && tickAnim < 13) {
            xx = -12.09322 + (((tickAnim - 11) / 2) * (-21.83305-(-12.09322)));
            yy = -7.7038 + (((tickAnim - 11) / 2) * (-4.10869-(-7.7038)));
            zz = 2.52879 + (((tickAnim - 11) / 2) * (1.34869-(2.52879)));
        }
        else if (tickAnim >= 13 && tickAnim < 16) {
            xx = -21.83305 + (((tickAnim - 13) / 3) * (26.25-(-21.83305)));
            yy = -4.10869 + (((tickAnim - 13) / 3) * (0-(-4.10869)));
            zz = 1.34869 + (((tickAnim - 13) / 3) * (0-(1.34869)));
        }
        else if (tickAnim >= 16 && tickAnim < 17) {
            xx = 26.25 + (((tickAnim - 16) / 1) * (19.97-(26.25)));
            yy = 0 + (((tickAnim - 16) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 16) / 1) * (2.475-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 20) {
            xx = 19.97 + (((tickAnim - 17) / 3) * (2.88-(19.97)));
            yy = 0 + (((tickAnim - 17) / 3) * (0-(0)));
            zz = 2.475 + (((tickAnim - 17) / 3) * (0-(2.475)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm10, rightArm10.rotateAngleX + (float) Math.toRadians(xx), rightArm10.rotateAngleY + (float) Math.toRadians(yy), rightArm10.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            yy = 0.15 + (((tickAnim - 0) / 7) * (0-(0.15)));
            zz = 0.15 + (((tickAnim - 0) / 7) * (0-(0.15)));
        }
        else if (tickAnim >= 7 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 7) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 7) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 4) * (0.4-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 16) {
            xx = 0 + (((tickAnim - 11) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 11) / 5) * (0-(0)));
            zz = 0.4 + (((tickAnim - 11) / 5) * (0-(0.4)));
        }
        else if (tickAnim >= 16 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 16) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 16) / 4) * (0.15-(0)));
            zz = 0 + (((tickAnim - 16) / 4) * (0.15-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightArm10.rotationPointX = this.rightArm10.rotationPointX + (float)(xx);
        this.rightArm10.rotationPointY = this.rightArm10.rotationPointY - (float)(yy);
        this.rightArm10.rotationPointZ = this.rightArm10.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 20.96085 + (((tickAnim - 0) / 7) * (29.75-(20.96085)));
            yy = -0.61636 + (((tickAnim - 0) / 7) * (0-(-0.61636)));
            zz = -0.21586 + (((tickAnim - 0) / 7) * (0-(-0.21586)));
        }
        else if (tickAnim >= 7 && tickAnim < 10) {
            xx = 29.75 + (((tickAnim - 7) / 3) * (91.83252-(29.75)));
            yy = 0 + (((tickAnim - 7) / 3) * (-11.98014-(0)));
            zz = 0 + (((tickAnim - 7) / 3) * (-2.40681-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 12) {
            xx = 91.83252 + (((tickAnim - 10) / 2) * (87.27116-(91.83252)));
            yy = -11.98014 + (((tickAnim - 10) / 2) * (-13.11389-(-11.98014)));
            zz = -2.40681 + (((tickAnim - 10) / 2) * (-1.91219-(-2.40681)));
        }
        else if (tickAnim >= 12 && tickAnim < 16) {
            xx = 87.27116 + (((tickAnim - 12) / 4) * (39.78461-(87.27116)));
            yy = -13.11389 + (((tickAnim - 12) / 4) * (-1.54361-(-13.11389)));
            zz = -1.91219 + (((tickAnim - 12) / 4) * (1.30321-(-1.91219)));
        }
        else if (tickAnim >= 16 && tickAnim < 17) {
            xx = 39.78461 + (((tickAnim - 16) / 1) * (36.03877-(39.78461)));
            yy = -1.54361 + (((tickAnim - 16) / 1) * (0.30981-(-1.54361)));
            zz = 1.30321 + (((tickAnim - 16) / 1) * (-0.73344-(1.30321)));
        }
        else if (tickAnim >= 17 && tickAnim < 20) {
            xx = 36.03877 + (((tickAnim - 17) / 3) * (20.96085-(36.03877)));
            yy = 0.30981 + (((tickAnim - 17) / 3) * (-0.61636-(0.30981)));
            zz = -0.73344 + (((tickAnim - 17) / 3) * (-0.21586-(-0.73344)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm11, rightArm11.rotateAngleX + (float) Math.toRadians(xx), rightArm11.rotateAngleY + (float) Math.toRadians(yy), rightArm11.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            yy = 0.98 + (((tickAnim - 0) / 7) * (0.8-(0.98)));
            zz = -0.22 + (((tickAnim - 0) / 7) * (-0.475-(-0.22)));
        }
        else if (tickAnim >= 7 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 7) / 3) * (0.03-(0)));
            yy = 0.8 + (((tickAnim - 7) / 3) * (1.255-(0.8)));
            zz = -0.475 + (((tickAnim - 7) / 3) * (-1.435-(-0.475)));
        }
        else if (tickAnim >= 10 && tickAnim < 12) {
            xx = 0.03 + (((tickAnim - 10) / 2) * (0.1-(0.03)));
            yy = 1.255 + (((tickAnim - 10) / 2) * (1.725-(1.255)));
            zz = -1.435 + (((tickAnim - 10) / 2) * (-1.25-(-1.435)));
        }
        else if (tickAnim >= 12 && tickAnim < 16) {
            xx = 0.1 + (((tickAnim - 12) / 4) * (0-(0.1)));
            yy = 1.725 + (((tickAnim - 12) / 4) * (0.975-(1.725)));
            zz = -1.25 + (((tickAnim - 12) / 4) * (-0.225-(-1.25)));
        }
        else if (tickAnim >= 16 && tickAnim < 17) {
            xx = 0 + (((tickAnim - 16) / 1) * (0-(0)));
            yy = 0.975 + (((tickAnim - 16) / 1) * (0.9-(0.975)));
            zz = -0.225 + (((tickAnim - 16) / 1) * (-0.25-(-0.225)));
        }
        else if (tickAnim >= 17 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 17) / 3) * (0-(0)));
            yy = 0.9 + (((tickAnim - 17) / 3) * (0.98-(0.9)));
            zz = -0.25 + (((tickAnim - 17) / 3) * (-0.22-(-0.25)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightArm11.rotationPointX = this.rightArm11.rotationPointX + (float)(xx);
        this.rightArm11.rotationPointY = this.rightArm11.rotationPointY - (float)(yy);
        this.rightArm11.rotationPointZ = this.rightArm11.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = -18.75611 + (((tickAnim - 0) / 3) * (-38.14632-(-18.75611)));
            yy = -9.21247 + (((tickAnim - 0) / 3) * (-9.13161-(-9.21247)));
            zz = -14.79651 + (((tickAnim - 0) / 3) * (-21.29253-(-14.79651)));
        }
        else if (tickAnim >= 3 && tickAnim < 6) {
            xx = -38.14632 + (((tickAnim - 3) / 3) * (-64.00611-(-38.14632)));
            yy = -9.13161 + (((tickAnim - 3) / 3) * (-9.21247-(-9.13161)));
            zz = -21.29253 + (((tickAnim - 3) / 3) * (-14.79651-(-21.29253)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = -64.00611 + (((tickAnim - 6) / 2) * (-33.27497-(-64.00611)));
            yy = -9.21247 + (((tickAnim - 6) / 2) * (-6.52547-(-9.21247)));
            zz = -14.79651 + (((tickAnim - 6) / 2) * (-10.48081-(-14.79651)));
        }
        else if (tickAnim >= 8 && tickAnim < 16) {
            xx = -33.27497 + (((tickAnim - 8) / 8) * (7.25-(-33.27497)));
            yy = -6.52547 + (((tickAnim - 8) / 8) * (0-(-6.52547)));
            zz = -10.48081 + (((tickAnim - 8) / 8) * (0-(-10.48081)));
        }
        else if (tickAnim >= 16 && tickAnim < 20) {
            xx = 7.25 + (((tickAnim - 16) / 4) * (-18.75611-(7.25)));
            yy = 0 + (((tickAnim - 16) / 4) * (-9.21247-(0)));
            zz = 0 + (((tickAnim - 16) / 4) * (-14.79651-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm, leftArm.rotateAngleX + (float) Math.toRadians(xx), leftArm.rotateAngleY + (float) Math.toRadians(yy), leftArm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = -12.09322 + (((tickAnim - 0) / 3) * (-21.83305-(-12.09322)));
            yy = 7.7038 + (((tickAnim - 0) / 3) * (4.10869-(7.7038)));
            zz = -2.52879 + (((tickAnim - 0) / 3) * (-1.34869-(-2.52879)));
        }
        else if (tickAnim >= 3 && tickAnim < 6) {
            xx = -21.83305 + (((tickAnim - 3) / 3) * (24-(-21.83305)));
            yy = 4.10869 + (((tickAnim - 3) / 3) * (0-(4.10869)));
            zz = -1.34869 + (((tickAnim - 3) / 3) * (0-(-1.34869)));
        }
        else if (tickAnim >= 6 && tickAnim < 7) {
            xx = 24 + (((tickAnim - 6) / 1) * (14.22-(24)));
            yy = 0 + (((tickAnim - 6) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 1) * (-0.025-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = 14.22 + (((tickAnim - 7) / 1) * (0.38-(14.22)));
            yy = 0 + (((tickAnim - 7) / 1) * (0-(0)));
            zz = -0.025 + (((tickAnim - 7) / 1) * (0-(-0.025)));
        }
        else if (tickAnim >= 8 && tickAnim < 16) {
            xx = 0.38 + (((tickAnim - 8) / 8) * (31.75-(0.38)));
            yy = 0 + (((tickAnim - 8) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 8) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 20) {
            xx = 31.75 + (((tickAnim - 16) / 4) * (-12.09322-(31.75)));
            yy = 0 + (((tickAnim - 16) / 4) * (7.7038-(0)));
            zz = 0 + (((tickAnim - 16) / 4) * (-2.52879-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm2, leftArm2.rotateAngleX + (float) Math.toRadians(xx), leftArm2.rotateAngleY + (float) Math.toRadians(yy), leftArm2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            zz = 0.4 + (((tickAnim - 0) / 6) * (0-(0.4)));
        }
        else if (tickAnim >= 6 && tickAnim < 16) {
            xx = 0 + (((tickAnim - 6) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 6) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 10) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 16) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 16) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 16) / 4) * (0.4-(0)));
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
            xx = 87.27116 + (((tickAnim - 0) / 3) * (97.36077-(87.27116)));
            yy = 13.11389 + (((tickAnim - 0) / 3) * (7.71443-(13.11389)));
            zz = 1.91219 + (((tickAnim - 0) / 3) * (0.41167-(1.91219)));
        }
        else if (tickAnim >= 3 && tickAnim < 6) {
            xx = 97.36077 + (((tickAnim - 3) / 3) * (39.78461-(97.36077)));
            yy = 7.71443 + (((tickAnim - 3) / 3) * (1.54361-(7.71443)));
            zz = 0.41167 + (((tickAnim - 3) / 3) * (-1.30321-(0.41167)));
        }
        else if (tickAnim >= 6 && tickAnim < 7) {
            xx = 39.78461 + (((tickAnim - 6) / 1) * (40.2831-(39.78461)));
            yy = 1.54361 + (((tickAnim - 6) / 1) * (0.979-(1.54361)));
            zz = -1.30321 + (((tickAnim - 6) / 1) * (-3.28083-(-1.30321)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = 40.2831 + (((tickAnim - 7) / 1) * (30.06812-(40.2831)));
            yy = 0.979 + (((tickAnim - 7) / 1) * (1.2155-(0.979)));
            zz = -3.28083 + (((tickAnim - 7) / 1) * (-1.02619-(-3.28083)));
        }
        else if (tickAnim >= 8 && tickAnim < 11) {
            xx = 30.06812 + (((tickAnim - 8) / 3) * (18.48545-(30.06812)));
            yy = 1.2155 + (((tickAnim - 8) / 3) * (0.80536-(1.2155)));
            zz = -1.02619 + (((tickAnim - 8) / 3) * (-0.67994-(-1.02619)));
        }
        else if (tickAnim >= 11 && tickAnim < 16) {
            xx = 18.48545 + (((tickAnim - 11) / 5) * (55.20688-(18.48545)));
            yy = 0.80536 + (((tickAnim - 11) / 5) * (5.75851-(0.80536)));
            zz = -0.67994 + (((tickAnim - 11) / 5) * (10.49836-(-0.67994)));
        }
        else if (tickAnim >= 16 && tickAnim < 18) {
            xx = 55.20688 + (((tickAnim - 16) / 2) * (92.00635-(55.20688)));
            yy = 5.75851 + (((tickAnim - 16) / 2) * (3.93417-(5.75851)));
            zz = 10.49836 + (((tickAnim - 16) / 2) * (0.57366-(10.49836)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = 92.00635 + (((tickAnim - 18) / 2) * (87.27116-(92.00635)));
            yy = 3.93417 + (((tickAnim - 18) / 2) * (13.11389-(3.93417)));
            zz = 0.57366 + (((tickAnim - 18) / 2) * (1.91219-(0.57366)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm3, leftArm3.rotateAngleX + (float) Math.toRadians(xx), leftArm3.rotateAngleY + (float) Math.toRadians(yy), leftArm3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0.1 + (((tickAnim - 0) / 3) * (0.05-(0.1)));
            yy = 1.725 + (((tickAnim - 0) / 3) * (1.38-(1.725)));
            zz = -1.25 + (((tickAnim - 0) / 3) * (-1.345-(-1.25)));
        }
        else if (tickAnim >= 3 && tickAnim < 6) {
            xx = 0.05 + (((tickAnim - 3) / 3) * (0-(0.05)));
            yy = 1.38 + (((tickAnim - 3) / 3) * (0.975-(1.38)));
            zz = -1.345 + (((tickAnim - 3) / 3) * (-0.225-(-1.345)));
        }
        else if (tickAnim >= 6 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 6) / 1) * (0-(0)));
            yy = 0.975 + (((tickAnim - 6) / 1) * (0.975-(0.975)));
            zz = -0.225 + (((tickAnim - 6) / 1) * (-0.25-(-0.225)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 7) / 1) * (0-(0)));
            yy = 0.975 + (((tickAnim - 7) / 1) * (1.225-(0.975)));
            zz = -0.25 + (((tickAnim - 7) / 1) * (-0.28-(-0.25)));
        }
        else if (tickAnim >= 8 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 8) / 3) * (0-(0)));
            yy = 1.225 + (((tickAnim - 8) / 3) * (1.265-(1.225)));
            zz = -0.28 + (((tickAnim - 8) / 3) * (-0.34-(-0.28)));
        }
        else if (tickAnim >= 11 && tickAnim < 16) {
            xx = 0 + (((tickAnim - 11) / 5) * (0-(0)));
            yy = 1.265 + (((tickAnim - 11) / 5) * (0.8-(1.265)));
            zz = -0.34 + (((tickAnim - 11) / 5) * (-0.475-(-0.34)));
        }
        else if (tickAnim >= 16 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 16) / 2) * (0.03-(0)));
            yy = 0.8 + (((tickAnim - 16) / 2) * (1.255-(0.8)));
            zz = -0.475 + (((tickAnim - 16) / 2) * (-1.435-(-0.475)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = 0.03 + (((tickAnim - 18) / 2) * (0.1-(0.03)));
            yy = 1.255 + (((tickAnim - 18) / 2) * (1.725-(1.255)));
            zz = -1.435 + (((tickAnim - 18) / 2) * (-1.25-(-1.435)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftArm3.rotationPointX = this.leftArm3.rotationPointX + (float)(xx);
        this.leftArm3.rotationPointY = this.leftArm3.rotationPointY - (float)(yy);
        this.leftArm3.rotationPointZ = this.leftArm3.rotationPointZ + (float)(zz);
        
    }

        public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        EntityPrehistoricFloraAntarctopelta e = (EntityPrehistoricFloraAntarctopelta) entity;
        animator.update(entity);


    }
}
