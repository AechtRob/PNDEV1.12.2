package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.EntityPrehistoricFloraSpinosaurus;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;

public class ModelSpinosaurus extends ModelBasePalaeopedia {

    private final AdvancedModelRenderer hips;
    private final AdvancedModelRenderer sailEnd;
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
    private final AdvancedModelRenderer leftLeg1;
    private final AdvancedModelRenderer leftLeg2;
    private final AdvancedModelRenderer leftLeg3;
    private final AdvancedModelRenderer leftFoot;
    private final AdvancedModelRenderer leftToes;
    private final AdvancedModelRenderer cube_r12;
    private final AdvancedModelRenderer rightLeg1;
    private final AdvancedModelRenderer rightLeg2;
    private final AdvancedModelRenderer rightLeg3;
    private final AdvancedModelRenderer rightFoot;
    private final AdvancedModelRenderer rightToes;
    private final AdvancedModelRenderer cube_r13;
    private final AdvancedModelRenderer tail1;
    private final AdvancedModelRenderer tail2;
    private final AdvancedModelRenderer cube_r14;
    private final AdvancedModelRenderer tail3;
    private final AdvancedModelRenderer cube_r15;
    private final AdvancedModelRenderer tail4;
    private final AdvancedModelRenderer cube_r16;
    private final AdvancedModelRenderer cube_r17;
    private final AdvancedModelRenderer tail5;
    private final AdvancedModelRenderer cube_r18;
    private final AdvancedModelRenderer cube_r19;
    private final AdvancedModelRenderer tail6;
    private final AdvancedModelRenderer cube_r20;
    private final AdvancedModelRenderer tail7;
    private final AdvancedModelRenderer cube_r21;
    private final AdvancedModelRenderer body;
    private final AdvancedModelRenderer cube_r22;
    private final AdvancedModelRenderer sailMiddle;
    private final AdvancedModelRenderer cube_r23;
    private final AdvancedModelRenderer cube_r24;
    private final AdvancedModelRenderer cube_r25;
    private final AdvancedModelRenderer cube_r26;
    private final AdvancedModelRenderer cube_r27;
    private final AdvancedModelRenderer cube_r28;
    private final AdvancedModelRenderer cube_r29;
    private final AdvancedModelRenderer cube_r30;
    private final AdvancedModelRenderer cube_r31;
    private final AdvancedModelRenderer chest;
    private final AdvancedModelRenderer cube_r32;
    private final AdvancedModelRenderer sailFront;
    private final AdvancedModelRenderer cube_r33;
    private final AdvancedModelRenderer cube_r34;
    private final AdvancedModelRenderer cube_r35;
    private final AdvancedModelRenderer cube_r36;
    private final AdvancedModelRenderer cube_r37;
    private final AdvancedModelRenderer cube_r38;
    private final AdvancedModelRenderer cube_r39;
    private final AdvancedModelRenderer leftArm1;
    private final AdvancedModelRenderer leftArm2;
    private final AdvancedModelRenderer leftHand;
    private final AdvancedModelRenderer leftThumb;
    private final AdvancedModelRenderer cube_r40;
    private final AdvancedModelRenderer leftFingers;
    private final AdvancedModelRenderer cube_r41;
    private final AdvancedModelRenderer cube_r42;
    private final AdvancedModelRenderer rightArm1;
    private final AdvancedModelRenderer rightArm2;
    private final AdvancedModelRenderer rightHand;
    private final AdvancedModelRenderer rightThumb;
    private final AdvancedModelRenderer cube_r43;
    private final AdvancedModelRenderer rightFingers;
    private final AdvancedModelRenderer cube_r44;
    private final AdvancedModelRenderer cube_r45;
    private final AdvancedModelRenderer neck1;
    private final AdvancedModelRenderer cube_r46;
    private final AdvancedModelRenderer neck2;
    private final AdvancedModelRenderer cube_r47;
    private final AdvancedModelRenderer neck3;
    private final AdvancedModelRenderer cube_r48;
    private final AdvancedModelRenderer neck4;
    private final AdvancedModelRenderer cube_r49;
    private final AdvancedModelRenderer cube_r50;
    private final AdvancedModelRenderer throat1;
    private final AdvancedModelRenderer cube_r51;
    private final AdvancedModelRenderer throat2;
    private final AdvancedModelRenderer cube_r52;
    private final AdvancedModelRenderer head;
    private final AdvancedModelRenderer cube_r53;
    private final AdvancedModelRenderer cube_r54;
    private final AdvancedModelRenderer cube_r55;
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
    private final AdvancedModelRenderer spinofaarus;
    private final AdvancedModelRenderer cube_r83;
    private final AdvancedModelRenderer cube_r84;
    private final AdvancedModelRenderer cube_r85;
    private final AdvancedModelRenderer cube_r86;
    private final AdvancedModelRenderer cube_r87;
    private final AdvancedModelRenderer jaw;
    private final AdvancedModelRenderer cube_r88;
    private final AdvancedModelRenderer cube_r89;
    private final AdvancedModelRenderer cube_r90;
    private final AdvancedModelRenderer leftJaw1;
    private final AdvancedModelRenderer cube_r91;
    private final AdvancedModelRenderer leftJaw2;
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
    private final AdvancedModelRenderer cube_r102;
    private final AdvancedModelRenderer cube_r103;
    private final AdvancedModelRenderer cube_r104;
    private final AdvancedModelRenderer cube_r105;
    private final AdvancedModelRenderer cube_r106;
    private final AdvancedModelRenderer cube_r107;
    private final AdvancedModelRenderer rightJaw1;
    private final AdvancedModelRenderer cube_r108;
    private final AdvancedModelRenderer rightJaw2;
    private final AdvancedModelRenderer cube_r109;
    private final AdvancedModelRenderer cube_r110;
    private final AdvancedModelRenderer cube_r111;
    private final AdvancedModelRenderer cube_r112;
    private final AdvancedModelRenderer cube_r113;
    private final AdvancedModelRenderer cube_r114;
    private final AdvancedModelRenderer cube_r115;
    private final AdvancedModelRenderer cube_r116;
    private final AdvancedModelRenderer cube_r117;
    private final AdvancedModelRenderer cube_r118;
    private final AdvancedModelRenderer cube_r119;
    private final AdvancedModelRenderer cube_r120;
    private final AdvancedModelRenderer cube_r121;
    private final AdvancedModelRenderer cube_r122;
    private final AdvancedModelRenderer cube_r123;
    private final AdvancedModelRenderer cube_r124;

    private ModelAnimator animator;

    public ModelSpinosaurus() {
        this.textureWidth = 240;
        this.textureHeight = 240;

        this.hips = new AdvancedModelRenderer(this);
        this.hips.setRotationPoint(0.0F, -7.0F, 0.25F);
        this.setRotateAngle(hips, -0.1745F, 0.0F, 0.0F);
        this.hips.cubeList.add(new ModelBox(hips, 52, 78, -5.0F, -6.0F, -9.0F, 10, 17, 18, 0.0F, false));

        this.sailEnd = new AdvancedModelRenderer(this);
        this.sailEnd.setRotationPoint(0.0F, -6.0F, 8.0F);
        this.hips.addChild(sailEnd);


        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(-4.0F, -12.6825F, -0.6671F);
        this.sailEnd.addChild(cube_r1);
        this.setRotateAngle(cube_r1, -1.8326F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 116, 225, 3.5F, -1.0424F, 0.0205F, 1, 1, 2, 0.0F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(-4.0F, -17.6065F, -1.5353F);
        this.sailEnd.addChild(cube_r2);
        this.setRotateAngle(cube_r2, -1.8326F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 16, 225, 3.5F, -1.0424F, 0.0205F, 1, 1, 2, 0.0F, false));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(-4.0F, -28.2507F, -20.9283F);
        this.sailEnd.addChild(cube_r3);
        this.setRotateAngle(cube_r3, -1.3963F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 108, 100, 3.0F, -17.2924F, 10.8705F, 2, 16, 17, 0.01F, false));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(-4.0F, -27.9126F, -7.202F);
        this.sailEnd.addChild(cube_r4);
        this.setRotateAngle(cube_r4, -1.2654F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 184, 225, 3.5F, -0.9782F, 0.0101F, 1, 1, 3, 0.0F, false));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(-4.0F, -22.9977F, -3.7605F);
        this.sailEnd.addChild(cube_r5);
        this.setRotateAngle(cube_r5, -1.2654F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 92, 225, 3.5F, -0.9782F, 0.0101F, 1, 1, 3, 0.0F, false));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(-4.0F, -28.2507F, -20.9283F);
        this.sailEnd.addChild(cube_r6);
        this.setRotateAngle(cube_r6, -0.9599F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 68, 184, 3.0F, -11.0782F, 6.1601F, 2, 14, 11, 0.0F, false));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(-4.0F, -28.2507F, -20.9283F);
        this.sailEnd.addChild(cube_r7);
        this.setRotateAngle(cube_r7, -0.0873F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 84, 225, 3.5F, -3.152F, 9.196F, 1, 1, 3, 0.0F, false));
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 210, 26, 3.0F, -2.402F, 5.446F, 2, 7, 7, -0.02F, false));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(-4.0F, -28.1507F, -20.9283F);
        this.sailEnd.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.3491F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 222, 120, 3.5F, -0.5754F, 3.7009F, 1, 1, 3, 0.0F, false));

        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(-4.0F, -28.2507F, -20.9283F);
        this.sailEnd.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.3491F, 0.0F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 214, 83, 3.0F, 0.1246F, -0.0491F, 2, 8, 6, -0.01F, false));

        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(0.0F, 0.0F, 1.0F);
        this.sailEnd.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 0.1309F, 0.0F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 122, 201, -1.0F, -30.0F, -18.0F, 2, 22, 3, 0.03F, false));

        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(0.0F, -6.25F, -13.5F);
        this.sailEnd.addChild(cube_r11);
        this.setRotateAngle(cube_r11, -0.1309F, 0.0F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 108, 74, -2.0F, 0.0F, -4.0F, 4, 7, 19, 0.0F, false));

        this.leftLeg1 = new AdvancedModelRenderer(this);
        this.leftLeg1.setRotationPoint(4.0F, 0.0F, 0.0F);
        this.hips.addChild(leftLeg1);
        this.setRotateAngle(leftLeg1, -0.2182F, 0.0F, -0.1745F);
        this.leftLeg1.cubeList.add(new ModelBox(leftLeg1, 76, 157, -4.0F, -4.0F, -3.0F, 6, 17, 10, 0.0F, false));

        this.leftLeg2 = new AdvancedModelRenderer(this);
        this.leftLeg2.setRotationPoint(0.0F, 11.5F, 0.0F);
        this.leftLeg1.addChild(leftLeg2);
        this.setRotateAngle(leftLeg2, 0.7854F, 0.0F, 0.1745F);
        this.leftLeg2.cubeList.add(new ModelBox(leftLeg2, 0, 195, -3.5F, -1.5F, -2.5F, 5, 17, 6, 0.0F, false));

        this.leftLeg3 = new AdvancedModelRenderer(this);
        this.leftLeg3.setRotationPoint(0.0F, 14.5F, 0.0F);
        this.leftLeg2.addChild(leftLeg3);
        this.setRotateAngle(leftLeg3, -0.7418F, 0.0F, 0.0F);
        this.leftLeg3.cubeList.add(new ModelBox(leftLeg3, 204, 214, -3.0F, -1.5F, -1.0F, 4, 8, 4, 0.0F, false));

        this.leftFoot = new AdvancedModelRenderer(this);
        this.leftFoot.setRotationPoint(0.0F, 5.5F, 0.5F);
        this.leftLeg3.addChild(leftFoot);
        this.setRotateAngle(leftFoot, 0.3491F, 0.0F, 0.0F);
        this.leftFoot.cubeList.add(new ModelBox(leftFoot, 134, 67, -3.5F, 0.0F, -2.5F, 5, 2, 5, 0.01F, false));

        this.leftToes = new AdvancedModelRenderer(this);
        this.leftToes.setRotationPoint(0.0F, 1.0F, -2.25F);
        this.leftFoot.addChild(leftToes);
        this.leftToes.cubeList.add(new ModelBox(leftToes, 146, 124, -4.0F, -1.0F, -5.75F, 6, 2, 6, 0.0F, false));
        this.leftToes.cubeList.add(new ModelBox(leftToes, 70, 164, 0.5F, -1.0F, -5.75F, 1, 2, 2, 0.01F, false));
        this.leftToes.cubeList.add(new ModelBox(leftToes, 70, 168, -1.5F, -1.0F, -5.75F, 1, 2, 2, 0.01F, false));
        this.leftToes.cubeList.add(new ModelBox(leftToes, 70, 172, -3.5F, -1.0F, -5.75F, 1, 2, 2, 0.01F, false));

        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(-4.0F, -1.0F, 0.25F);
        this.leftToes.addChild(cube_r12);
        this.setRotateAngle(cube_r12, 0.0F, 0.3927F, 0.0F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 70, 176, 0.5F, 0.0F, -4.0F, 1, 2, 2, -0.01F, false));
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 152, 221, 0.0F, 0.0F, -4.0F, 2, 2, 4, -0.02F, false));

        this.rightLeg1 = new AdvancedModelRenderer(this);
        this.rightLeg1.setRotationPoint(-4.0F, 0.0F, 0.0F);
        this.hips.addChild(rightLeg1);
        this.setRotateAngle(rightLeg1, -0.2182F, 0.0F, 0.1745F);
        this.rightLeg1.cubeList.add(new ModelBox(rightLeg1, 76, 157, -2.0F, -4.0F, -3.0F, 6, 17, 10, 0.0F, true));

        this.rightLeg2 = new AdvancedModelRenderer(this);
        this.rightLeg2.setRotationPoint(0.0F, 11.5F, 0.0F);
        this.rightLeg1.addChild(rightLeg2);
        this.setRotateAngle(rightLeg2, 0.7854F, 0.0F, -0.1745F);
        this.rightLeg2.cubeList.add(new ModelBox(rightLeg2, 0, 195, -1.5F, -1.5F, -2.5F, 5, 17, 6, 0.0F, true));

        this.rightLeg3 = new AdvancedModelRenderer(this);
        this.rightLeg3.setRotationPoint(0.0F, 14.5F, 0.0F);
        this.rightLeg2.addChild(rightLeg3);
        this.setRotateAngle(rightLeg3, -0.7418F, 0.0F, 0.0F);
        this.rightLeg3.cubeList.add(new ModelBox(rightLeg3, 204, 214, -1.0F, -1.5F, -1.0F, 4, 8, 4, 0.0F, true));

        this.rightFoot = new AdvancedModelRenderer(this);
        this.rightFoot.setRotationPoint(0.0F, 5.5F, 0.5F);
        this.rightLeg3.addChild(rightFoot);
        this.setRotateAngle(rightFoot, 0.3491F, 0.0F, 0.0F);
        this.rightFoot.cubeList.add(new ModelBox(rightFoot, 134, 67, -1.5F, 0.0F, -2.5F, 5, 2, 5, 0.01F, true));

        this.rightToes = new AdvancedModelRenderer(this);
        this.rightToes.setRotationPoint(0.0F, 1.0F, -2.25F);
        this.rightFoot.addChild(rightToes);
        this.rightToes.cubeList.add(new ModelBox(rightToes, 146, 124, -2.0F, -1.0F, -5.75F, 6, 2, 6, 0.0F, true));
        this.rightToes.cubeList.add(new ModelBox(rightToes, 70, 164, -1.5F, -1.0F, -5.75F, 1, 2, 2, 0.01F, true));
        this.rightToes.cubeList.add(new ModelBox(rightToes, 70, 168, 0.5F, -1.0F, -5.75F, 1, 2, 2, 0.01F, true));
        this.rightToes.cubeList.add(new ModelBox(rightToes, 70, 172, 2.5F, -1.0F, -5.75F, 1, 2, 2, 0.01F, true));

        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(4.0F, -1.0F, 0.25F);
        this.rightToes.addChild(cube_r13);
        this.setRotateAngle(cube_r13, 0.0F, -0.3927F, 0.0F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 70, 176, -1.5F, 0.0F, -4.0F, 1, 2, 2, -0.01F, true));
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 152, 221, -2.0F, 0.0F, -4.0F, 2, 2, 4, -0.02F, true));

        this.tail1 = new AdvancedModelRenderer(this);
        this.tail1.setRotationPoint(0.0F, -2.0F, 8.0F);
        this.hips.addChild(tail1);
        this.setRotateAngle(tail1, 0.0436F, 0.0F, 0.0F);
        this.tail1.cubeList.add(new ModelBox(tail1, 86, 0, -3.0F, -3.5F, -1.0F, 6, 12, 16, 0.0F, false));
        this.tail1.cubeList.add(new ModelBox(tail1, 134, 155, -1.5F, -8.0F, -1.0F, 3, 5, 16, 0.0F, false));
        this.tail1.cubeList.add(new ModelBox(tail1, 136, 176, 0.0F, -13.0F, -1.0F, 0, 5, 16, 0.0F, false));

        this.tail2 = new AdvancedModelRenderer(this);
        this.tail2.setRotationPoint(0.5F, 0.0F, 14.0F);
        this.tail1.addChild(tail2);
        this.setRotateAngle(tail2, 0.0873F, 0.0F, 0.0F);
        this.tail2.cubeList.add(new ModelBox(tail2, 52, 113, -3.0F, -3.0F, -1.0F, 5, 10, 16, 0.0F, false));

        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(-0.5F, -8.0F, -2.0F);
        this.tail2.addChild(cube_r14);
        this.setRotateAngle(cube_r14, -0.0873F, 0.0F, 0.0F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 174, 43, -1.0F, 0.0F, 2.0F, 2, 5, 15, -0.01F, false));

        this.tail3 = new AdvancedModelRenderer(this);
        this.tail3.setRotationPoint(0.0F, 0.0F, 14.0F);
        this.tail2.addChild(tail3);
        this.setRotateAngle(tail3, 0.0436F, 0.0F, 0.0F);
        this.tail3.cubeList.add(new ModelBox(tail3, 94, 133, -2.5F, -2.5F, -1.0F, 4, 8, 16, 0.0F, false));

        this.cube_r15 = new AdvancedModelRenderer(this);
        this.cube_r15.setRotationPoint(0.5F, -6.5F, 0.0F);
        this.tail3.addChild(cube_r15);
        this.setRotateAngle(cube_r15, 0.0873F, 0.0F, 0.0F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 34, 159, -2.0F, 0.0F, -1.0F, 2, 6, 16, 0.0F, false));

        this.tail4 = new AdvancedModelRenderer(this);
        this.tail4.setRotationPoint(0.0F, 0.0F, 14.0F);
        this.tail3.addChild(tail4);
        this.setRotateAngle(tail4, 0.0436F, 0.0F, 0.0F);
        this.tail4.cubeList.add(new ModelBox(tail4, 154, 67, -2.0F, -2.25F, -1.0F, 3, 5, 16, 0.0F, false));

        this.cube_r16 = new AdvancedModelRenderer(this);
        this.cube_r16.setRotationPoint(1.0F, -7.75F, 0.0F);
        this.tail4.addChild(cube_r16);
        this.setRotateAngle(cube_r16, 0.1309F, 0.0F, 0.0F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 174, 0, -2.0F, 0.0F, -1.0F, 1, 8, 15, 0.0F, false));

        this.cube_r17 = new AdvancedModelRenderer(this);
        this.cube_r17.setRotationPoint(1.0F, 5.5F, 0.0F);
        this.tail4.addChild(cube_r17);
        this.setRotateAngle(cube_r17, -0.0436F, 0.0F, 0.0F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 182, 88, -2.0F, -4.0F, -1.0F, 1, 4, 15, 0.0F, false));

        this.tail5 = new AdvancedModelRenderer(this);
        this.tail5.setRotationPoint(0.0F, 0.0F, 14.5F);
        this.tail4.addChild(tail5);
        this.setRotateAngle(tail5, -0.1309F, 0.0F, 0.0F);
        this.tail5.cubeList.add(new ModelBox(tail5, 172, 167, -1.5F, -2.0F, -0.5F, 2, 4, 16, 0.01F, false));

        this.cube_r18 = new AdvancedModelRenderer(this);
        this.cube_r18.setRotationPoint(0.0F, -9.5F, -2.0F);
        this.tail5.addChild(cube_r18);
        this.setRotateAngle(cube_r18, 0.0436F, 0.0F, 0.0F);
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 0, 150, -1.0F, 0.0F, 0.0F, 1, 9, 16, 0.01F, false));

        this.cube_r19 = new AdvancedModelRenderer(this);
        this.cube_r19.setRotationPoint(0.0F, 6.0F, 0.5F);
        this.tail5.addChild(cube_r19);
        this.setRotateAngle(cube_r19, 0.1134F, 0.0F, 0.0F);
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 0, 175, -1.0F, -4.0F, -1.0F, 1, 4, 16, 0.01F, false));

        this.tail6 = new AdvancedModelRenderer(this);
        this.tail6.setRotationPoint(0.0F, 0.0F, 15.0F);
        this.tail5.addChild(tail6);
        this.setRotateAngle(tail6, -0.1309F, 0.0F, 0.0F);
        this.tail6.cubeList.add(new ModelBox(tail6, 34, 181, -1.5F, -1.75F, -0.5F, 2, 3, 15, 0.0F, false));

        this.cube_r20 = new AdvancedModelRenderer(this);
        this.cube_r20.setRotationPoint(0.5F, -9.5F, -2.5F);
        this.tail6.addChild(cube_r20);
        this.setRotateAngle(cube_r20, 0.0873F, 0.0F, 0.0F);
        this.cube_r20.cubeList.add(new ModelBox(cube_r20, 0, 118, -1.0F, 0.0F, 0.0F, 0, 14, 18, 0.0F, false));

        this.tail7 = new AdvancedModelRenderer(this);
        this.tail7.setRotationPoint(0.0F, 0.0F, 14.0F);
        this.tail6.addChild(tail7);
        this.setRotateAngle(tail7, -0.2618F, 0.0F, 0.0F);
        this.tail7.cubeList.add(new ModelBox(tail7, 182, 107, -1.0F, -1.5F, -0.5F, 1, 2, 15, 0.0F, false));

        this.cube_r21 = new AdvancedModelRenderer(this);
        this.cube_r21.setRotationPoint(-0.5F, 0.5F, 14.5F);
        this.tail7.addChild(cube_r21);
        this.setRotateAngle(cube_r21, 0.1484F, 0.0F, 0.0F);
        this.cube_r21.cubeList.add(new ModelBox(cube_r21, 108, 176, -0.01F, -11.0F, -14.0F, 0, 11, 14, 0.0F, false));

        this.body = new AdvancedModelRenderer(this);
        this.body.setRotationPoint(0.0F, -1.0F, -7.5F);
        this.hips.addChild(body);
        this.setRotateAngle(body, 0.1745F, 0.0F, 0.0F);
        this.body.cubeList.add(new ModelBox(body, 0, 0, -7.0F, -5.5F, -27.5F, 14, 17, 29, 0.0F, false));

        this.cube_r22 = new AdvancedModelRenderer(this);
        this.cube_r22.setRotationPoint(0.0F, 12.5F, -27.5F);
        this.body.addChild(cube_r22);
        this.setRotateAngle(cube_r22, -0.0873F, 0.0F, 0.0F);
        this.cube_r22.cubeList.add(new ModelBox(cube_r22, 0, 46, -6.0F, -4.0F, 0.0F, 12, 4, 28, 0.0F, false));

        this.sailMiddle = new AdvancedModelRenderer(this);
        this.sailMiddle.setRotationPoint(0.0F, -5.5F, -27.5F);
        this.body.addChild(sailMiddle);
        this.sailMiddle.cubeList.add(new ModelBox(sailMiddle, 50, 199, -1.0F, -26.5F, 24.0F, 2, 20, 5, 0.02F, false));
        this.sailMiddle.cubeList.add(new ModelBox(sailMiddle, 0, 78, -1.0F, -20.0F, 0.0F, 2, 16, 24, 0.01F, false));

        this.cube_r23 = new AdvancedModelRenderer(this);
        this.cube_r23.setRotationPoint(-4.0F, -19.7979F, -1.3793F);
        this.sailMiddle.addChild(cube_r23);
        this.setRotateAngle(cube_r23, 0.1745F, 0.0F, 0.0F);
        this.cube_r23.cubeList.add(new ModelBox(cube_r23, 38, 225, 3.5F, -3.9783F, 28.4929F, 1, 1, 3, 0.0F, false));
        this.cube_r23.cubeList.add(new ModelBox(cube_r23, 214, 120, 3.5F, -3.9783F, 22.4929F, 1, 1, 3, 0.0F, false));
        this.cube_r23.cubeList.add(new ModelBox(cube_r23, 206, 0, 3.0F, -3.0283F, 20.4929F, 2, 3, 10, -0.03F, false));

        this.cube_r24 = new AdvancedModelRenderer(this);
        this.cube_r24.setRotationPoint(-4.0F, -19.7979F, -1.3793F);
        this.sailMiddle.addChild(cube_r24);
        this.setRotateAngle(cube_r24, -0.1745F, 0.0F, 0.0F);
        this.cube_r24.cubeList.add(new ModelBox(cube_r24, 50, 224, 3.5F, -10.9067F, 14.1118F, 1, 1, 3, 0.0F, false));
        this.cube_r24.cubeList.add(new ModelBox(cube_r24, 146, 100, 3.0F, -9.9567F, 9.6118F, 2, 8, 16, -0.02F, false));

        this.cube_r25 = new AdvancedModelRenderer(this);
        this.cube_r25.setRotationPoint(-4.0F, -26.7338F, 9.0559F);
        this.sailMiddle.addChild(cube_r25);
        this.setRotateAngle(cube_r25, 0.2618F, 0.0F, 0.0F);
        this.cube_r25.cubeList.add(new ModelBox(cube_r25, 22, 195, 3.5F, -1.6567F, -1.5882F, 1, 1, 3, 0.0F, false));

        this.cube_r26 = new AdvancedModelRenderer(this);
        this.cube_r26.setRotationPoint(-4.0F, -25.4514F, 3.6128F);
        this.sailMiddle.addChild(cube_r26);
        this.setRotateAngle(cube_r26, 0.6545F, 0.0F, 0.0F);
        this.cube_r26.cubeList.add(new ModelBox(cube_r26, 182, 63, 3.5F, -1.0168F, -2.9976F, 1, 1, 3, 0.0F, false));

        this.cube_r27 = new AdvancedModelRenderer(this);
        this.cube_r27.setRotationPoint(-4.0F, -19.7979F, -1.3793F);
        this.sailMiddle.addChild(cube_r27);
        this.setRotateAngle(cube_r27, 0.3491F, 0.0F, 0.0F);
        this.cube_r27.cubeList.add(new ModelBox(cube_r27, 166, 206, 3.0F, -3.8169F, 5.3024F, 2, 9, 8, -0.01F, false));

        this.cube_r28 = new AdvancedModelRenderer(this);
        this.cube_r28.setRotationPoint(-4.0F, -21.2803F, -0.6829F);
        this.sailMiddle.addChild(cube_r28);
        this.setRotateAngle(cube_r28, 1.2217F, 0.0F, 0.0F);
        this.cube_r28.cubeList.add(new ModelBox(cube_r28, 174, 63, 3.5F, -0.9701F, -2.9772F, 1, 1, 3, 0.0F, false));

        this.cube_r29 = new AdvancedModelRenderer(this);
        this.cube_r29.setRotationPoint(-4.0F, -19.7979F, -1.3793F);
        this.sailMiddle.addChild(cube_r29);
        this.setRotateAngle(cube_r29, 0.9163F, 0.0F, 0.0F);
        this.cube_r29.cubeList.add(new ModelBox(cube_r29, 76, 139, 3.0F, -0.3701F, -0.4772F, 2, 9, 7, -0.02F, false));

        this.cube_r30 = new AdvancedModelRenderer(this);
        this.cube_r30.setRotationPoint(0.5F, -4.0F, 0.0F);
        this.sailMiddle.addChild(cube_r30);
        this.setRotateAngle(cube_r30, 0.2182F, 0.0F, 0.0F);
        this.cube_r30.cubeList.add(new ModelBox(cube_r30, 134, 43, -2.5F, 0.0F, 0.0F, 4, 8, 16, 0.0F, false));

        this.cube_r31 = new AdvancedModelRenderer(this);
        this.cube_r31.setRotationPoint(0.5F, -7.463F, 15.6207F);
        this.sailMiddle.addChild(cube_r31);
        this.setRotateAngle(cube_r31, -0.0873F, 0.0F, 0.0F);
        this.cube_r31.cubeList.add(new ModelBox(cube_r31, 172, 146, -3.0F, 0.0F, 0.0F, 5, 8, 13, 0.0F, false));

        this.chest = new AdvancedModelRenderer(this);
        this.chest.setRotationPoint(0.0F, 0.0F, -26.0F);
        this.body.addChild(chest);
        this.setRotateAngle(chest, 0.0873F, 0.0F, 0.0F);
        this.chest.cubeList.add(new ModelBox(chest, 80, 46, -6.0F, -5.0F, -13.5F, 12, 13, 15, 0.0F, false));

        this.cube_r32 = new AdvancedModelRenderer(this);
        this.cube_r32.setRotationPoint(0.0F, 8.0F, -13.5F);
        this.chest.addChild(cube_r32);
        this.setRotateAngle(cube_r32, -0.3491F, 0.0F, 0.0F);
        this.cube_r32.cubeList.add(new ModelBox(cube_r32, 130, 24, -5.0F, -6.0F, 0.0F, 10, 6, 13, 0.0F, false));

        this.sailFront = new AdvancedModelRenderer(this);
        this.sailFront.setRotationPoint(0.0F, -5.0F, -0.5F);
        this.chest.addChild(sailFront);
        this.sailFront.cubeList.add(new ModelBox(sailFront, 122, 28, -1.0F, -20.35F, -0.8F, 2, 16, 2, 0.0F, false));
        this.sailFront.cubeList.add(new ModelBox(sailFront, 94, 113, -1.0F, -14.35F, -4.7F, 2, 12, 4, 0.0F, false));

        this.cube_r33 = new AdvancedModelRenderer(this);
        this.cube_r33.setRotationPoint(0.0F, -14.4979F, -6.0793F);
        this.sailFront.addChild(cube_r33);
        this.setRotateAngle(cube_r33, 0.829F, 0.0F, 0.0F);
        this.cube_r33.cubeList.add(new ModelBox(cube_r33, 94, 193, -1.0F, 1.4F, 1.0F, 2, 3, 5, -0.03F, false));
        this.cube_r33.cubeList.add(new ModelBox(cube_r33, 132, 212, -1.0F, 0.0F, 0.0F, 2, 2, 8, -0.02F, false));

        this.cube_r34 = new AdvancedModelRenderer(this);
        this.cube_r34.setRotationPoint(0.0F, -17.447F, -3.3769F);
        this.sailFront.addChild(cube_r34);
        this.setRotateAngle(cube_r34, 1.2654F, 0.0F, 0.0F);
        this.cube_r34.cubeList.add(new ModelBox(cube_r34, 42, 136, -0.5F, -0.95F, -2.0F, 1, 1, 2, 0.0F, false));

        this.cube_r35 = new AdvancedModelRenderer(this);
        this.cube_r35.setRotationPoint(0.0F, -13.574F, -6.462F);
        this.sailFront.addChild(cube_r35);
        this.setRotateAngle(cube_r35, 1.6144F, 0.0F, 0.0F);
        this.cube_r35.cubeList.add(new ModelBox(cube_r35, 58, 224, -0.5F, -0.95F, -2.0F, 1, 1, 2, 0.0F, false));

        this.cube_r36 = new AdvancedModelRenderer(this);
        this.cube_r36.setRotationPoint(0.0F, -8.9546F, -8.3754F);
        this.sailFront.addChild(cube_r36);
        this.setRotateAngle(cube_r36, 1.6144F, 0.0F, 0.0F);
        this.cube_r36.cubeList.add(new ModelBox(cube_r36, 16, 222, -0.5F, -0.95F, -2.0F, 1, 1, 2, 0.0F, false));

        this.cube_r37 = new AdvancedModelRenderer(this);
        this.cube_r37.setRotationPoint(0.0F, -4.3352F, -10.2888F);
        this.sailFront.addChild(cube_r37);
        this.setRotateAngle(cube_r37, 1.6144F, 0.0F, 0.0F);
        this.cube_r37.cubeList.add(new ModelBox(cube_r37, 36, 136, -0.5F, -0.95F, -2.0F, 1, 1, 2, 0.0F, false));

        this.cube_r38 = new AdvancedModelRenderer(this);
        this.cube_r38.setRotationPoint(0.0F, -14.4979F, -6.0793F);
        this.sailFront.addChild(cube_r38);
        this.setRotateAngle(cube_r38, 1.1781F, 0.0F, 0.0F);
        this.cube_r38.cubeList.add(new ModelBox(cube_r38, 172, 124, -1.0F, 0.0F, -16.0F, 2, 6, 16, -0.01F, false));

        this.cube_r39 = new AdvancedModelRenderer(this);
        this.cube_r39.setRotationPoint(0.0F, -4.5F, 0.0F);
        this.sailFront.addChild(cube_r39);
        this.setRotateAngle(cube_r39, 0.3491F, 0.0F, 0.0F);
        this.cube_r39.cubeList.add(new ModelBox(cube_r39, 176, 23, -1.5F, 0.0F, -13.5F, 3, 5, 14, 0.0F, false));

        this.leftArm1 = new AdvancedModelRenderer(this);
        this.leftArm1.setRotationPoint(5.0F, 6.0F, -8.5F);
        this.chest.addChild(leftArm1);
        this.setRotateAngle(leftArm1, 1.0908F, 0.1745F, 0.0F);
        this.leftArm1.cubeList.add(new ModelBox(leftArm1, 0, 0, -2.0F, -1.0F, -2.5F, 4, 13, 5, 0.0F, false));

        this.leftArm2 = new AdvancedModelRenderer(this);
        this.leftArm2.setRotationPoint(0.0F, 11.0F, 0.0F);
        this.leftArm1.addChild(leftArm2);
        this.setRotateAngle(leftArm2, -1.0472F, 0.0F, 0.0F);
        this.leftArm2.cubeList.add(new ModelBox(leftArm2, 58, 0, -1.5F, -1.0F, -2.5F, 3, 8, 5, 0.0F, false));

        this.leftHand = new AdvancedModelRenderer(this);
        this.leftHand.setRotationPoint(1.0F, 6.75F, 0.0F);
        this.leftArm2.addChild(leftHand);
        this.setRotateAngle(leftHand, 0.0873F, 0.0F, 0.0F);
        this.leftHand.cubeList.add(new ModelBox(leftHand, 75, 0, -2.0F, -0.25F, -2.0F, 2, 5, 4, 0.01F, false));

        this.leftThumb = new AdvancedModelRenderer(this);
        this.leftThumb.setRotationPoint(0.0F, 0.75F, -1.5F);
        this.leftHand.addChild(leftThumb);
        this.setRotateAngle(leftThumb, -0.1745F, 0.0F, 0.2618F);
        this.leftThumb.cubeList.add(new ModelBox(leftThumb, 88, 0, -2.0F, 0.0F, -0.5F, 2, 6, 2, 0.01F, false));

        this.cube_r40 = new AdvancedModelRenderer(this);
        this.cube_r40.setRotationPoint(0.0F, 6.0F, 0.0F);
        this.leftThumb.addChild(cube_r40);
        this.setRotateAngle(cube_r40, 0.0F, 0.0F, 0.3054F);
        this.cube_r40.cubeList.add(new ModelBox(cube_r40, 77, 10, -3.0F, 0.0F, 0.0F, 3, 4, 1, 0.0F, false));

        this.leftFingers = new AdvancedModelRenderer(this);
        this.leftFingers.setRotationPoint(0.0F, 3.75F, 0.5F);
        this.leftHand.addChild(leftFingers);


        this.cube_r41 = new AdvancedModelRenderer(this);
        this.cube_r41.setRotationPoint(-0.5F, 3.9399F, 0.9154F);
        this.leftFingers.addChild(cube_r41);
        this.setRotateAngle(cube_r41, 0.1203F, -0.0559F, 0.433F);
        this.cube_r41.cubeList.add(new ModelBox(cube_r41, 67, 14, -3.0F, 0.0F, -1.5F, 3, 6, 3, -0.01F, false));

        this.cube_r42 = new AdvancedModelRenderer(this);
        this.cube_r42.setRotationPoint(-6.5F, -3.0F, 0.0F);
        this.leftFingers.addChild(cube_r42);
        this.setRotateAngle(cube_r42, 0.1309F, 0.0F, 0.0F);
        this.cube_r42.cubeList.add(new ModelBox(cube_r42, 58, 14, 5.0F, 0.0F, -1.5F, 1, 7, 3, 0.0F, false));

        this.rightArm1 = new AdvancedModelRenderer(this);
        this.rightArm1.setRotationPoint(-5.0F, 6.0F, -8.5F);
        this.chest.addChild(rightArm1);
        this.setRotateAngle(rightArm1, 1.0908F, -0.1745F, 0.0F);
        this.rightArm1.cubeList.add(new ModelBox(rightArm1, 0, 0, -2.0F, -1.0F, -2.5F, 4, 13, 5, 0.0F, true));

        this.rightArm2 = new AdvancedModelRenderer(this);
        this.rightArm2.setRotationPoint(0.0F, 11.0F, 0.0F);
        this.rightArm1.addChild(rightArm2);
        this.setRotateAngle(rightArm2, -1.0472F, 0.0F, 0.0F);
        this.rightArm2.cubeList.add(new ModelBox(rightArm2, 58, 0, -1.5F, -1.0F, -2.5F, 3, 8, 5, 0.0F, true));

        this.rightHand = new AdvancedModelRenderer(this);
        this.rightHand.setRotationPoint(-1.0F, 6.75F, 0.0F);
        this.rightArm2.addChild(rightHand);
        this.setRotateAngle(rightHand, 0.0873F, 0.0F, 0.0F);
        this.rightHand.cubeList.add(new ModelBox(rightHand, 75, 0, 0.0F, -0.25F, -2.0F, 2, 5, 4, 0.01F, true));

        this.rightThumb = new AdvancedModelRenderer(this);
        this.rightThumb.setRotationPoint(0.0F, 0.75F, -1.5F);
        this.rightHand.addChild(rightThumb);
        this.setRotateAngle(rightThumb, -0.1745F, 0.0F, -0.2618F);
        this.rightThumb.cubeList.add(new ModelBox(rightThumb, 88, 0, 0.0F, 0.0F, -0.5F, 2, 6, 2, 0.01F, true));

        this.cube_r43 = new AdvancedModelRenderer(this);
        this.cube_r43.setRotationPoint(0.0F, 6.0F, 0.0F);
        this.rightThumb.addChild(cube_r43);
        this.setRotateAngle(cube_r43, 0.0F, 0.0F, -0.3054F);
        this.cube_r43.cubeList.add(new ModelBox(cube_r43, 77, 10, 0.0F, 0.0F, 0.0F, 3, 4, 1, 0.0F, true));

        this.rightFingers = new AdvancedModelRenderer(this);
        this.rightFingers.setRotationPoint(0.0F, 3.75F, 0.5F);
        this.rightHand.addChild(rightFingers);


        this.cube_r44 = new AdvancedModelRenderer(this);
        this.cube_r44.setRotationPoint(0.5F, 3.9399F, 0.9154F);
        this.rightFingers.addChild(cube_r44);
        this.setRotateAngle(cube_r44, 0.1203F, 0.0559F, -0.433F);
        this.cube_r44.cubeList.add(new ModelBox(cube_r44, 67, 14, 0.0F, 0.0F, -1.5F, 3, 6, 3, -0.01F, true));

        this.cube_r45 = new AdvancedModelRenderer(this);
        this.cube_r45.setRotationPoint(6.5F, -3.0F, 0.0F);
        this.rightFingers.addChild(cube_r45);
        this.setRotateAngle(cube_r45, 0.1309F, 0.0F, 0.0F);
        this.cube_r45.cubeList.add(new ModelBox(cube_r45, 58, 14, -6.0F, 0.0F, -1.5F, 1, 7, 3, 0.0F, true));

        this.neck1 = new AdvancedModelRenderer(this);
        this.neck1.setRotationPoint(0.0F, -1.0F, -12.5F);
        this.chest.addChild(neck1);
        this.setRotateAngle(neck1, -0.5672F, 0.0F, 0.0F);
        this.neck1.cubeList.add(new ModelBox(neck1, 130, 0, -4.0F, -4.0F, -11.0F, 8, 10, 14, 0.0F, false));

        this.cube_r46 = new AdvancedModelRenderer(this);
        this.cube_r46.setRotationPoint(0.0F, -4.0F, -2.0F);
        this.neck1.addChild(cube_r46);
        this.setRotateAngle(cube_r46, -0.3491F, 0.0F, 0.0F);
        this.cube_r46.cubeList.add(new ModelBox(cube_r46, 192, 63, 0.0F, -6.0F, -8.0F, 0, 6, 14, 0.0F, false));
        this.cube_r46.cubeList.add(new ModelBox(cube_r46, 136, 197, -1.5F, 0.0F, -8.0F, 3, 3, 12, 0.01F, false));

        this.neck2 = new AdvancedModelRenderer(this);
        this.neck2.setRotationPoint(0.0F, -1.0F, -8.5F);
        this.neck1.addChild(neck2);
        this.setRotateAngle(neck2, -0.5672F, 0.0F, 0.0F);
        this.neck2.cubeList.add(new ModelBox(neck2, 134, 133, -3.5F, -2.75F, -10.5F, 7, 10, 12, 0.0F, false));

        this.cube_r47 = new AdvancedModelRenderer(this);
        this.cube_r47.setRotationPoint(0.0F, -5.0F, -1.5F);
        this.neck2.addChild(cube_r47);
        this.setRotateAngle(cube_r47, -0.2182F, 0.0F, 0.0F);
        this.cube_r47.cubeList.add(new ModelBox(cube_r47, 94, 201, -1.5F, 0.25F, -9.0F, 3, 4, 11, 0.0F, false));

        this.neck3 = new AdvancedModelRenderer(this);
        this.neck3.setRotationPoint(0.0F, 0.0F, -9.5F);
        this.neck2.addChild(neck3);
        this.setRotateAngle(neck3, 0.3491F, 0.0F, 0.0F);
        this.neck3.cubeList.add(new ModelBox(neck3, 168, 187, -3.0F, -2.5F, -9.0F, 6, 9, 10, 0.0F, false));

        this.cube_r48 = new AdvancedModelRenderer(this);
        this.cube_r48.setRotationPoint(0.0F, -6.5F, 1.0F);
        this.neck3.addChild(cube_r48);
        this.setRotateAngle(cube_r48, -0.0873F, 0.0F, 0.0F);
        this.cube_r48.cubeList.add(new ModelBox(cube_r48, 108, 157, -1.0F, 0.0F, -9.0F, 2, 8, 10, 0.0F, false));

        this.neck4 = new AdvancedModelRenderer(this);
        this.neck4.setRotationPoint(0.0F, 0.0F, -8.0F);
        this.neck3.addChild(neck4);
        this.setRotateAngle(neck4, 0.4363F, 0.0F, 0.0F);
        this.neck4.cubeList.add(new ModelBox(neck4, 22, 199, -2.5F, -2.25F, -8.0F, 5, 7, 9, 0.0F, false));
        this.neck4.cubeList.add(new ModelBox(neck4, 220, 77, -2.5F, -2.25F, -10.0F, 5, 4, 2, 0.0F, false));

        this.cube_r49 = new AdvancedModelRenderer(this);
        this.cube_r49.setRotationPoint(0.0F, -5.9531F, -4.9608F);
        this.neck4.addChild(cube_r49);
        this.setRotateAngle(cube_r49, 0.48F, 0.0F, 0.0F);
        this.cube_r49.cubeList.add(new ModelBox(cube_r49, 214, 97, -1.0F, 0.0F, -7.0F, 2, 5, 7, -0.02F, false));

        this.cube_r50 = new AdvancedModelRenderer(this);
        this.cube_r50.setRotationPoint(0.0F, -6.75F, 3.0F);
        this.neck4.addChild(cube_r50);
        this.setRotateAngle(cube_r50, 0.0873F, 0.0F, 0.0F);
        this.cube_r50.cubeList.add(new ModelBox(cube_r50, 208, 174, -1.0F, 0.1F, -8.0F, 2, 5, 8, -0.01F, false));

        this.throat1 = new AdvancedModelRenderer(this);
        this.throat1.setRotationPoint(0.0F, 5.0F, -4.0F);
        this.neck4.addChild(throat1);
        this.setRotateAngle(throat1, 0.4363F, 0.0F, 0.0F);


        this.cube_r51 = new AdvancedModelRenderer(this);
        this.cube_r51.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.throat1.addChild(cube_r51);
        this.setRotateAngle(cube_r51, -0.1309F, 0.0F, 0.0F);
        this.cube_r51.cubeList.add(new ModelBox(cube_r51, 214, 109, -1.5F, -1.25F, -7.0F, 3, 5, 6, 0.0F, false));

        this.throat2 = new AdvancedModelRenderer(this);
        this.throat2.setRotationPoint(0.0F, -0.1958F, -1.4872F);
        this.throat1.addChild(throat2);
        this.setRotateAngle(throat2, -0.2182F, 0.0F, 0.0F);


        this.cube_r52 = new AdvancedModelRenderer(this);
        this.cube_r52.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.throat2.addChild(cube_r52);
        this.setRotateAngle(cube_r52, -0.1309F, 0.0F, 0.0F);
        this.cube_r52.cubeList.add(new ModelBox(cube_r52, 208, 42, -2.0F, -1.25F, -0.5F, 4, 5, 8, 0.0F, false));

        this.head = new AdvancedModelRenderer(this);
        this.head.setRotationPoint(0.0F, 1.0F, -9.0F);
        this.neck4.addChild(head);
        this.setRotateAngle(head, 0.3491F, 0.0F, 0.0F);
        this.head.cubeList.add(new ModelBox(head, 22, 215, -2.0F, -3.25F, -3.0F, 4, 8, 4, 0.01F, false));
        this.head.cubeList.add(new ModelBox(head, 80, 74, -1.5F, 3.75F, -10.0F, 3, 1, 3, -0.01F, false));

        this.cube_r53 = new AdvancedModelRenderer(this);
        this.cube_r53.setRotationPoint(-2.0F, 2.0F, 2.0F);
        this.head.addChild(cube_r53);
        this.setRotateAngle(cube_r53, 0.0F, -0.1484F, 0.0F);
        this.cube_r53.cubeList.add(new ModelBox(cube_r53, 142, 222, -1.0F, -5.25F, -5.0F, 1, 3, 4, 0.0F, true));
        this.cube_r53.cubeList.add(new ModelBox(cube_r53, 208, 160, -1.0F, -2.25F, -10.0F, 1, 5, 9, 0.01F, true));

        this.cube_r54 = new AdvancedModelRenderer(this);
        this.cube_r54.setRotationPoint(-1.261F, -3.0F, -2.9451F);
        this.head.addChild(cube_r54);
        this.setRotateAngle(cube_r54, 0.48F, -0.1484F, 0.0F);
        this.cube_r54.cubeList.add(new ModelBox(cube_r54, 192, 225, -0.8F, 0.55F, -3.0F, 1, 1, 2, 0.0F, true));
        this.cube_r54.cubeList.add(new ModelBox(cube_r54, 94, 184, -0.75F, -0.25F, -6.0F, 1, 3, 6, 0.0F, true));

        this.cube_r55 = new AdvancedModelRenderer(this);
        this.cube_r55.setRotationPoint(-2.2411F, -2.8644F, -5.1975F);
        this.head.addChild(cube_r55);
        this.setRotateAngle(cube_r55, 0.0632F, 0.0182F, -0.3241F);
        this.cube_r55.cubeList.add(new ModelBox(cube_r55, 192, 83, 0.0F, 0.0F, 0.0F, 1, 2, 3, -0.01F, true));

        this.cube_r56 = new AdvancedModelRenderer(this);
        this.cube_r56.setRotationPoint(-1.5F, -0.4795F, -8.3221F);
        this.head.addChild(cube_r56);
        this.setRotateAngle(cube_r56, 0.6741F, 0.0182F, -0.3241F);
        this.cube_r56.cubeList.add(new ModelBox(cube_r56, 186, 206, 0.0F, 0.0F, -2.0F, 1, 2, 6, 0.0F, true));

        this.cube_r57 = new AdvancedModelRenderer(this);
        this.cube_r57.setRotationPoint(1.261F, -3.0F, -2.9451F);
        this.head.addChild(cube_r57);
        this.setRotateAngle(cube_r57, 0.48F, 0.1484F, 0.0F);
        this.cube_r57.cubeList.add(new ModelBox(cube_r57, 192, 225, -0.2F, 0.55F, -3.0F, 1, 1, 2, 0.0F, false));
        this.cube_r57.cubeList.add(new ModelBox(cube_r57, 94, 184, -0.25F, -0.25F, -6.0F, 1, 3, 6, 0.0F, false));

        this.cube_r58 = new AdvancedModelRenderer(this);
        this.cube_r58.setRotationPoint(2.0F, 2.0F, 2.0F);
        this.head.addChild(cube_r58);
        this.setRotateAngle(cube_r58, 0.0F, 0.1484F, 0.0F);
        this.cube_r58.cubeList.add(new ModelBox(cube_r58, 142, 222, 0.0F, -5.25F, -5.0F, 1, 3, 4, 0.0F, false));
        this.cube_r58.cubeList.add(new ModelBox(cube_r58, 208, 160, 0.0F, -2.25F, -10.0F, 1, 5, 9, 0.01F, false));

        this.cube_r59 = new AdvancedModelRenderer(this);
        this.cube_r59.setRotationPoint(0.0F, -4.1453F, -5.5055F);
        this.head.addChild(cube_r59);
        this.setRotateAngle(cube_r59, 0.7941F, 0.0F, 0.0F);
        this.cube_r59.cubeList.add(new ModelBox(cube_r59, 132, 222, 0.0F, -2.0F, -5.0F, 0, 2, 5, 0.0F, false));

        this.cube_r60 = new AdvancedModelRenderer(this);
        this.cube_r60.setRotationPoint(0.0F, -3.4444F, -4.7923F);
        this.head.addChild(cube_r60);
        this.setRotateAngle(cube_r60, 0.7941F, 0.0F, 0.0F);
        this.cube_r60.cubeList.add(new ModelBox(cube_r60, 220, 62, -0.5F, -1.0F, -7.0F, 1, 1, 7, 0.0F, false));

        this.cube_r61 = new AdvancedModelRenderer(this);
        this.cube_r61.setRotationPoint(1.0F, -3.25F, -3.0F);
        this.head.addChild(cube_r61);
        this.setRotateAngle(cube_r61, 0.48F, 0.0F, 0.0F);
        this.cube_r61.cubeList.add(new ModelBox(cube_r61, 108, 225, -1.5F, -1.0F, -4.5F, 1, 1, 3, 0.01F, false));
        this.cube_r61.cubeList.add(new ModelBox(cube_r61, 208, 55, -2.5F, 0.0F, -6.0F, 3, 1, 6, 0.0F, false));

        this.cube_r62 = new AdvancedModelRenderer(this);
        this.cube_r62.setRotationPoint(2.2411F, -2.8644F, -5.1975F);
        this.head.addChild(cube_r62);
        this.setRotateAngle(cube_r62, 0.0632F, -0.0182F, 0.3241F);
        this.cube_r62.cubeList.add(new ModelBox(cube_r62, 192, 83, -1.0F, 0.0F, 0.0F, 1, 2, 3, -0.01F, false));

        this.cube_r63 = new AdvancedModelRenderer(this);
        this.cube_r63.setRotationPoint(-1.5F, -0.4795F, -8.3221F);
        this.head.addChild(cube_r63);
        this.setRotateAngle(cube_r63, 1.0668F, 0.0182F, -0.3241F);
        this.cube_r63.cubeList.add(new ModelBox(cube_r63, 196, 203, 0.0F, 0.0F, -2.0F, 1, 2, 6, -0.02F, true));

        this.cube_r64 = new AdvancedModelRenderer(this);
        this.cube_r64.setRotationPoint(1.5F, -0.4795F, -8.3221F);
        this.head.addChild(cube_r64);
        this.setRotateAngle(cube_r64, 1.0668F, -0.0182F, 0.3241F);
        this.cube_r64.cubeList.add(new ModelBox(cube_r64, 196, 203, -1.0F, 0.0F, -2.0F, 1, 2, 6, -0.02F, false));

        this.cube_r65 = new AdvancedModelRenderer(this);
        this.cube_r65.setRotationPoint(1.5F, -0.4795F, -8.3221F);
        this.head.addChild(cube_r65);
        this.setRotateAngle(cube_r65, 0.6741F, -0.0182F, 0.3241F);
        this.cube_r65.cubeList.add(new ModelBox(cube_r65, 186, 206, -1.0F, 0.0F, -2.0F, 1, 2, 6, 0.0F, false));

        this.cube_r66 = new AdvancedModelRenderer(this);
        this.cube_r66.setRotationPoint(0.0F, -3.25F, -3.0F);
        this.head.addChild(cube_r66);
        this.setRotateAngle(cube_r66, 0.3927F, 0.0F, 0.0F);
        this.cube_r66.cubeList.add(new ModelBox(cube_r66, 220, 214, -1.5F, 0.0F, -1.0F, 3, 2, 4, 0.01F, false));

        this.cube_r67 = new AdvancedModelRenderer(this);
        this.cube_r67.setRotationPoint(0.5F, 8.2682F, -22.8229F);
        this.head.addChild(cube_r67);
        this.setRotateAngle(cube_r67, 0.5411F, 0.0F, 0.0F);
        this.cube_r67.cubeList.add(new ModelBox(cube_r67, 86, 28, -1.5F, 0.0F, 0.0F, 2, 2, 16, 0.01F, false));

        this.cube_r68 = new AdvancedModelRenderer(this);
        this.cube_r68.setRotationPoint(0.5F, 9.253F, -22.9966F);
        this.head.addChild(cube_r68);
        this.setRotateAngle(cube_r68, 1.3963F, 0.0F, 0.0F);
        this.cube_r68.cubeList.add(new ModelBox(cube_r68, 88, 155, -1.5F, 0.0F, 0.0F, 2, 1, 1, -0.002F, false));

        this.cube_r69 = new AdvancedModelRenderer(this);
        this.cube_r69.setRotationPoint(0.5F, 10.2293F, -22.7801F);
        this.head.addChild(cube_r69);
        this.setRotateAngle(cube_r69, 1.789F, 0.0F, 0.0F);
        this.cube_r69.cubeList.add(new ModelBox(cube_r69, 82, 155, -1.5F, 0.0F, 0.0F, 2, 1, 1, -0.001F, false));

        this.cube_r70 = new AdvancedModelRenderer(this);
        this.cube_r70.setRotationPoint(0.5F, 7.4008F, -19.9517F);
        this.head.addChild(cube_r70);
        this.setRotateAngle(cube_r70, 0.7854F, 0.0F, 0.0F);
        this.cube_r70.cubeList.add(new ModelBox(cube_r70, 94, 129, -1.5F, 0.0F, -4.0F, 2, 1, 3, 0.0F, false));

        this.cube_r71 = new AdvancedModelRenderer(this);
        this.cube_r71.setRotationPoint(0.5F, 8.1356F, -16.876F);
        this.head.addChild(cube_r71);
        this.setRotateAngle(cube_r71, 0.0873F, 0.0F, 0.0F);
        this.cube_r71.cubeList.add(new ModelBox(cube_r71, 92, 74, -1.5F, -1.0F, -3.0F, 2, 1, 3, 0.0F, false));

        this.cube_r72 = new AdvancedModelRenderer(this);
        this.cube_r72.setRotationPoint(0.5F, 8.1356F, -16.876F);
        this.head.addChild(cube_r72);
        this.setRotateAngle(cube_r72, 0.6196F, 0.0F, 0.0F);
        this.cube_r72.cubeList.add(new ModelBox(cube_r72, 200, 187, -2.0F, -2.0F, 0.2F, 3, 2, 12, -0.01F, false));

        this.cube_r73 = new AdvancedModelRenderer(this);
        this.cube_r73.setRotationPoint(-0.5F, 7.1847F, -14.8368F);
        this.head.addChild(cube_r73);
        this.setRotateAngle(cube_r73, 0.5236F, 0.0F, 0.0F);
        this.cube_r73.cubeList.add(new ModelBox(cube_r73, 164, 223, -0.75F, -0.25F, -0.25F, 0, 1, 5, 0.0F, true));
        this.cube_r73.cubeList.add(new ModelBox(cube_r73, 106, 113, -0.5F, -0.5F, -2.25F, 0, 2, 1, 0.0F, true));
        this.cube_r73.cubeList.add(new ModelBox(cube_r73, 106, 113, 1.5F, -0.5F, -2.25F, 0, 2, 1, 0.0F, false));
        this.cube_r73.cubeList.add(new ModelBox(cube_r73, 164, 223, 1.75F, -0.25F, -0.25F, 0, 1, 5, 0.0F, false));

        this.cube_r74 = new AdvancedModelRenderer(this);
        this.cube_r74.setRotationPoint(-0.5F, 7.1847F, -14.8368F);
        this.head.addChild(cube_r74);
        this.setRotateAngle(cube_r74, 0.0436F, 0.0F, 0.0F);
        this.cube_r74.cubeList.add(new ModelBox(cube_r74, 106, 127, -0.25F, 0.75F, -3.75F, 0, 1, 1, 0.0F, true));
        this.cube_r74.cubeList.add(new ModelBox(cube_r74, 106, 127, 1.25F, 0.75F, -3.75F, 0, 1, 1, 0.0F, false));

        this.cube_r75 = new AdvancedModelRenderer(this);
        this.cube_r75.setRotationPoint(-0.5F, 7.1847F, -14.8368F);
        this.head.addChild(cube_r75);
        this.setRotateAngle(cube_r75, 0.48F, 0.0F, 0.0F);
        this.cube_r75.cubeList.add(new ModelBox(cube_r75, 130, 43, -0.25F, -1.5F, -5.25F, 0, 1, 1, 0.0F, true));
        this.cube_r75.cubeList.add(new ModelBox(cube_r75, 130, 43, 1.25F, -1.5F, -5.25F, 0, 1, 1, 0.0F, false));

        this.cube_r76 = new AdvancedModelRenderer(this);
        this.cube_r76.setRotationPoint(-0.5F, 7.1847F, -14.8368F);
        this.head.addChild(cube_r76);
        this.setRotateAngle(cube_r76, 0.6545F, 0.0F, 0.0F);
        this.cube_r76.cubeList.add(new ModelBox(cube_r76, 106, 116, -0.25F, -2.5F, -6.55F, 0, 2, 1, 0.0F, true));
        this.cube_r76.cubeList.add(new ModelBox(cube_r76, 106, 116, 1.25F, -2.5F, -6.55F, 0, 2, 1, 0.0F, false));

        this.cube_r77 = new AdvancedModelRenderer(this);
        this.cube_r77.setRotationPoint(-0.5F, 10.4635F, -20.826F);
        this.head.addChild(cube_r77);
        this.setRotateAngle(cube_r77, 0.9843F, -0.3093F, -0.4295F);
        this.cube_r77.cubeList.add(new ModelBox(cube_r77, 132, 43, -0.25F, -1.0F, -1.0F, 0, 1, 1, 0.0F, true));

        this.cube_r78 = new AdvancedModelRenderer(this);
        this.cube_r78.setRotationPoint(-1.0F, 8.8892F, -16.5363F);
        this.head.addChild(cube_r78);
        this.setRotateAngle(cube_r78, 0.4625F, 0.0F, 0.0F);
        this.cube_r78.cubeList.add(new ModelBox(cube_r78, 84, 209, 0.03F, -2.0F, -5.0F, 0, 2, 5, 0.0F, true));
        this.cube_r78.cubeList.add(new ModelBox(cube_r78, 84, 209, 1.97F, -2.0F, -5.0F, 0, 2, 5, 0.0F, false));

        this.cube_r79 = new AdvancedModelRenderer(this);
        this.cube_r79.setRotationPoint(0.5F, 10.4635F, -20.826F);
        this.head.addChild(cube_r79);
        this.setRotateAngle(cube_r79, 0.9843F, 0.3093F, 0.4295F);
        this.cube_r79.cubeList.add(new ModelBox(cube_r79, 132, 43, 0.25F, -1.0F, -1.0F, 0, 1, 1, 0.0F, false));

        this.cube_r80 = new AdvancedModelRenderer(this);
        this.cube_r80.setRotationPoint(0.5F, 4.2709F, -10.9544F);
        this.head.addChild(cube_r80);
        this.setRotateAngle(cube_r80, 0.4363F, 0.0F, 0.0F);
        this.cube_r80.cubeList.add(new ModelBox(cube_r80, 200, 201, -2.0F, -1.0F, -7.25F, 3, 2, 11, 0.0F, false));

        this.cube_r81 = new AdvancedModelRenderer(this);
        this.cube_r81.setRotationPoint(1.0F, 9.2537F, -18.5028F);
        this.head.addChild(cube_r81);
        this.setRotateAngle(cube_r81, 0.6632F, 0.0F, 0.0F);
        this.cube_r81.cubeList.add(new ModelBox(cube_r81, 76, 155, -2.0F, -1.0F, -3.8F, 2, 1, 1, -0.002F, false));

        this.cube_r82 = new AdvancedModelRenderer(this);
        this.cube_r82.setRotationPoint(0.5F, 8.9753F, -16.7168F);
        this.head.addChild(cube_r82);
        this.setRotateAngle(cube_r82, 0.4451F, 0.0F, 0.0F);
        this.cube_r82.cubeList.add(new ModelBox(cube_r82, 154, 88, -2.0F, -1.0F, 0.0F, 3, 1, 11, -0.001F, false));

        this.spinofaarus = new AdvancedModelRenderer(this);
        this.spinofaarus.setRotationPoint(-1.5F, 13.8435F, -26.6877F);
        this.head.addChild(spinofaarus);


        this.cube_r83 = new AdvancedModelRenderer(this);
        this.cube_r83.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.spinofaarus.addChild(cube_r83);
        this.setRotateAngle(cube_r83, 1.6983F, -0.1063F, 0.6913F);
        this.cube_r83.cubeList.add(new ModelBox(cube_r83, 168, 176, 0.0F, 0.0F, -1.0F, 1, 3, 1, 0.0F, true));

        this.cube_r84 = new AdvancedModelRenderer(this);
        this.cube_r84.setRotationPoint(1.0F, -1.9726F, -0.3301F);
        this.spinofaarus.addChild(cube_r84);
        this.setRotateAngle(cube_r84, 1.7366F, 0.0F, 0.0F);
        this.cube_r84.cubeList.add(new ModelBox(cube_r84, 106, 125, -0.8F, 0.5F, -3.05F, 1, 2, 0, 0.0F, true));
        this.cube_r84.cubeList.add(new ModelBox(cube_r84, 106, 125, 0.8F, 0.5F, -3.05F, 1, 2, 0, 0.0F, false));
        this.cube_r84.cubeList.add(new ModelBox(cube_r84, 64, 222, -1.0F, 0.0F, -3.0F, 3, 3, 3, 0.01F, false));

        this.cube_r85 = new AdvancedModelRenderer(this);
        this.cube_r85.setRotationPoint(3.0F, 0.0F, 0.0F);
        this.spinofaarus.addChild(cube_r85);
        this.setRotateAngle(cube_r85, 1.6983F, 0.1063F, -0.6913F);
        this.cube_r85.cubeList.add(new ModelBox(cube_r85, 168, 176, -1.0F, 0.0F, -1.0F, 1, 3, 1, 0.0F, false));

        this.cube_r86 = new AdvancedModelRenderer(this);
        this.cube_r86.setRotationPoint(2.0F, -6.8573F, 3.1541F);
        this.spinofaarus.addChild(cube_r86);
        this.setRotateAngle(cube_r86, 0.9512F, 0.0F, 0.0F);
        this.cube_r86.cubeList.add(new ModelBox(cube_r86, 84, 216, -2.0F, 0.0F, -6.0F, 3, 3, 6, 0.0F, false));

        this.cube_r87 = new AdvancedModelRenderer(this);
        this.cube_r87.setRotationPoint(2.0F, -6.8573F, 3.1541F);
        this.spinofaarus.addChild(cube_r87);
        this.setRotateAngle(cube_r87, 0.4538F, 0.0F, 0.0F);
        this.cube_r87.cubeList.add(new ModelBox(cube_r87, 36, 139, -2.0F, 0.0F, 0.0F, 3, 3, 17, 0.01F, false));

        this.jaw = new AdvancedModelRenderer(this);
        this.jaw.setRotationPoint(1.0F, 5.25F, 0.0F);
        this.head.addChild(jaw);
        this.setRotateAngle(jaw, 0.2182F, 0.0F, 0.0F);
        this.jaw.cubeList.add(new ModelBox(jaw, 102, 216, -3.0F, -2.25F, -3.0F, 4, 5, 4, 0.01F, false));
        this.jaw.cubeList.add(new ModelBox(jaw, 152, 212, -2.5F, -2.25F, -7.0F, 3, 5, 4, 0.01F, false));
        this.jaw.cubeList.add(new ModelBox(jaw, 208, 136, -2.5F, 0.75F, -16.0F, 3, 2, 9, 0.01F, false));

        this.cube_r88 = new AdvancedModelRenderer(this);
        this.cube_r88.setRotationPoint(0.0F, 1.75F, -16.0F);
        this.jaw.addChild(cube_r88);
        this.setRotateAngle(cube_r88, 0.1745F, 0.0F, 0.0F);
        this.cube_r88.cubeList.add(new ModelBox(cube_r88, 220, 70, -2.0F, -1.0F, -4.75F, 2, 2, 5, 0.01F, false));

        this.cube_r89 = new AdvancedModelRenderer(this);
        this.cube_r89.setRotationPoint(-2.5F, -2.25F, -7.0F);
        this.jaw.addChild(cube_r89);
        this.setRotateAngle(cube_r89, -0.5277F, -0.1006F, 0.0835F);
        this.cube_r89.cubeList.add(new ModelBox(cube_r89, 210, 13, 0.1F, -5.0F, 0.0F, 2, 5, 8, 0.01F, false));

        this.cube_r90 = new AdvancedModelRenderer(this);
        this.cube_r90.setRotationPoint(0.5F, -2.25F, -7.0F);
        this.jaw.addChild(cube_r90);
        this.setRotateAngle(cube_r90, -0.5277F, 0.1006F, -0.0835F);
        this.cube_r90.cubeList.add(new ModelBox(cube_r90, 64, 209, -2.1F, -5.0F, 0.0F, 2, 5, 8, 0.01F, false));

        this.leftJaw1 = new AdvancedModelRenderer(this);
        this.leftJaw1.setRotationPoint(1.0F, 0.0F, 0.25F);
        this.jaw.addChild(leftJaw1);
        this.setRotateAngle(leftJaw1, 0.0F, 0.0F, -0.0175F);


        this.cube_r91 = new AdvancedModelRenderer(this);
        this.cube_r91.setRotationPoint(0.0F, -3.25F, 1.75F);
        this.leftJaw1.addChild(cube_r91);
        this.setRotateAngle(cube_r91, 0.0F, 0.1396F, 0.0F);
        this.cube_r91.cubeList.add(new ModelBox(cube_r91, 208, 147, -2.25F, 1.0F, -9.0F, 3, 5, 8, 0.0F, false));

        this.leftJaw2 = new AdvancedModelRenderer(this);
        this.leftJaw2.setRotationPoint(-0.5F, -2.25F, -7.15F);
        this.leftJaw1.addChild(leftJaw2);
        this.leftJaw2.cubeList.add(new ModelBox(leftJaw2, 208, 124, -2.0F, 3.0007F, -9.1676F, 2, 2, 10, -0.01F, false));

        this.cube_r92 = new AdvancedModelRenderer(this);
        this.cube_r92.setRotationPoint(-1.5F, 1.903F, -7.2452F);
        this.leftJaw2.addChild(cube_r92);
        this.setRotateAngle(cube_r92, 0.4102F, 0.0F, 0.0F);
        this.cube_r92.cubeList.add(new ModelBox(cube_r92, 200, 83, 0.5F, 0.0F, -3.0F, 1, 2, 3, 0.0F, false));

        this.cube_r93 = new AdvancedModelRenderer(this);
        this.cube_r93.setRotationPoint(-1.5F, 3.2833F, -12.2321F);
        this.leftJaw2.addChild(cube_r93);
        this.setRotateAngle(cube_r93, 0.4712F, 0.0F, 0.0F);
        this.cube_r93.cubeList.add(new ModelBox(cube_r93, 132, 45, -0.03F, -1.0F, -3.0F, 1, 1, 0, 0.0F, false));
        this.cube_r93.cubeList.add(new ModelBox(cube_r93, 16, 218, 0.97F, -1.0F, -3.0F, 0, 1, 3, 0.0F, false));

        this.cube_r94 = new AdvancedModelRenderer(this);
        this.cube_r94.setRotationPoint(-1.5F, 3.1538F, -9.6168F);
        this.leftJaw2.addChild(cube_r94);
        this.setRotateAngle(cube_r94, 0.0785F, 0.0F, 0.0F);
        this.cube_r94.cubeList.add(new ModelBox(cube_r94, 208, 83, 0.97F, -1.0F, -3.0F, 0, 1, 3, 0.0F, false));

        this.cube_r95 = new AdvancedModelRenderer(this);
        this.cube_r95.setRotationPoint(-1.5F, 1.2704F, -7.3903F);
        this.leftJaw2.addChild(cube_r95);
        this.setRotateAngle(cube_r95, 0.2967F, 0.0F, 0.0F);
        this.cube_r95.cubeList.add(new ModelBox(cube_r95, 130, 45, 0.5F, 0.0F, -3.0F, 1, 1, 0, -0.001F, false));
        this.cube_r95.cubeList.add(new ModelBox(cube_r95, 70, 180, 1.49F, 0.0F, -3.0F, 0, 1, 3, -0.001F, false));

        this.cube_r96 = new AdvancedModelRenderer(this);
        this.cube_r96.setRotationPoint(-1.5F, 1.2704F, -7.3903F);
        this.leftJaw2.addChild(cube_r96);
        this.setRotateAngle(cube_r96, 0.1833F, 0.0F, 0.0F);
        this.cube_r96.cubeList.add(new ModelBox(cube_r96, 0, 218, 1.49F, 0.0F, 0.0F, 0, 1, 8, 0.0F, false));

        this.cube_r97 = new AdvancedModelRenderer(this);
        this.cube_r97.setRotationPoint(-0.5F, 3.8049F, -14.525F);
        this.leftJaw2.addChild(cube_r97);
        this.setRotateAngle(cube_r97, 0.7532F, 0.4502F, 0.277F);
        this.cube_r97.cubeList.add(new ModelBox(cube_r97, 34, 150, -0.4F, -0.25F, -0.9F, 0, 1, 1, 0.0F, false));

        this.cube_r98 = new AdvancedModelRenderer(this);
        this.cube_r98.setRotationPoint(-1.5F, -0.1F, 0.5F);
        this.leftJaw2.addChild(cube_r98);
        this.setRotateAngle(cube_r98, 0.5149F, 0.0F, 0.0F);
        this.cube_r98.cubeList.add(new ModelBox(cube_r98, 106, 122, 0.75F, -5.25F, -14.3F, 0, 2, 1, 0.0F, false));

        this.cube_r99 = new AdvancedModelRenderer(this);
        this.cube_r99.setRotationPoint(-1.5F, -0.1F, 0.5F);
        this.leftJaw2.addChild(cube_r99);
        this.setRotateAngle(cube_r99, -0.0524F, 0.0F, 0.0F);
        this.cube_r99.cubeList.add(new ModelBox(cube_r99, 106, 119, 0.75F, 2.25F, -13.0F, 0, 2, 1, 0.0F, false));
        this.cube_r99.cubeList.add(new ModelBox(cube_r99, 50, 136, 0.75F, 3.25F, -11.5F, 0, 1, 1, 0.0F, false));

        this.cube_r100 = new AdvancedModelRenderer(this);
        this.cube_r100.setRotationPoint(-1.5F, -0.1F, 0.5F);
        this.leftJaw2.addChild(cube_r100);
        this.setRotateAngle(cube_r100, 0.2531F, 0.0F, 0.0F);
        this.cube_r100.cubeList.add(new ModelBox(cube_r100, 48, 136, 1.0F, -0.25F, -10.25F, 0, 1, 1, 0.0F, false));
        this.cube_r100.cubeList.add(new ModelBox(cube_r100, 186, 214, 0.5F, 0.0F, -8.0F, 1, 3, 8, 0.01F, false));

        this.cube_r101 = new AdvancedModelRenderer(this);
        this.cube_r101.setRotationPoint(-1.5F, -0.1F, 0.5F);
        this.leftJaw2.addChild(cube_r101);
        this.setRotateAngle(cube_r101, 0.1658F, 0.0F, 0.0F);
        this.cube_r101.cubeList.add(new ModelBox(cube_r101, 174, 223, 1.25F, 0.0F, -8.75F, 0, 1, 5, 0.0F, false));

        this.cube_r102 = new AdvancedModelRenderer(this);
        this.cube_r102.setRotationPoint(-1.5F, 2.8822F, -12.6274F);
        this.leftJaw2.addChild(cube_r102);
        this.setRotateAngle(cube_r102, -1.7191F, 0.0F, 0.0F);
        this.cube_r102.cubeList.add(new ModelBox(cube_r102, 226, 55, -1.0F, -2.0F, 0.0F, 2, 2, 1, 0.0F, false));

        this.cube_r103 = new AdvancedModelRenderer(this);
        this.cube_r103.setRotationPoint(-1.5F, 3.0386F, -13.6151F);
        this.leftJaw2.addChild(cube_r103);
        this.setRotateAngle(cube_r103, -1.4137F, 0.0F, 0.0F);
        this.cube_r103.cubeList.add(new ModelBox(cube_r103, 222, 40, -1.0F, -1.0F, 0.0F, 2, 1, 1, 0.001F, false));

        this.cube_r104 = new AdvancedModelRenderer(this);
        this.cube_r104.setRotationPoint(-1.5F, 4.548F, -14.9272F);
        this.leftJaw2.addChild(cube_r104);
        this.setRotateAngle(cube_r104, -0.7156F, 0.0F, 0.0F);
        this.cube_r104.cubeList.add(new ModelBox(cube_r104, 198, 225, -1.0F, -2.0F, 0.0F, 2, 2, 1, 0.0F, false));

        this.cube_r105 = new AdvancedModelRenderer(this);
        this.cube_r105.setRotationPoint(-1.5F, 5.4935F, -14.6016F);
        this.leftJaw2.addChild(cube_r105);
        this.setRotateAngle(cube_r105, 0.3316F, 0.0F, 0.0F);
        this.cube_r105.cubeList.add(new ModelBox(cube_r105, 216, 40, -1.0F, -1.0F, 0.0F, 2, 1, 1, 0.001F, false));

        this.cube_r106 = new AdvancedModelRenderer(this);
        this.cube_r106.setRotationPoint(-1.5F, 5.8519F, -13.668F);
        this.leftJaw2.addChild(cube_r106);
        this.setRotateAngle(cube_r106, 1.2043F, 0.0F, 0.0F);
        this.cube_r106.cubeList.add(new ModelBox(cube_r106, 210, 40, -1.0F, -1.0F, 0.0F, 2, 1, 1, 0.0F, false));

        this.cube_r107 = new AdvancedModelRenderer(this);
        this.cube_r107.setRotationPoint(-1.5F, 4.8551F, -8.7684F);
        this.leftJaw2.addChild(cube_r107);
        this.setRotateAngle(cube_r107, 0.2007F, 0.0F, 0.0F);
        this.cube_r107.cubeList.add(new ModelBox(cube_r107, 220, 220, 0.0F, -2.0F, -5.0F, 1, 2, 5, 0.01F, false));

        this.rightJaw1 = new AdvancedModelRenderer(this);
        this.rightJaw1.setRotationPoint(-3.0F, 0.0F, 0.25F);
        this.jaw.addChild(rightJaw1);
        this.setRotateAngle(rightJaw1, 0.0F, 0.0F, 0.0175F);


        this.cube_r108 = new AdvancedModelRenderer(this);
        this.cube_r108.setRotationPoint(0.0F, -3.25F, 1.75F);
        this.rightJaw1.addChild(cube_r108);
        this.setRotateAngle(cube_r108, 0.0F, -0.1396F, 0.0F);
        this.cube_r108.cubeList.add(new ModelBox(cube_r108, 208, 147, -0.75F, 1.0F, -9.0F, 3, 5, 8, 0.0F, true));

        this.rightJaw2 = new AdvancedModelRenderer(this);
        this.rightJaw2.setRotationPoint(0.5F, -2.25F, -7.15F);
        this.rightJaw1.addChild(rightJaw2);
        this.rightJaw2.cubeList.add(new ModelBox(rightJaw2, 208, 124, 0.0F, 3.0007F, -9.1676F, 2, 2, 10, -0.01F, true));

        this.cube_r109 = new AdvancedModelRenderer(this);
        this.cube_r109.setRotationPoint(1.5F, 1.903F, -7.2452F);
        this.rightJaw2.addChild(cube_r109);
        this.setRotateAngle(cube_r109, 0.4102F, 0.0F, 0.0F);
        this.cube_r109.cubeList.add(new ModelBox(cube_r109, 200, 83, -1.5F, 0.0F, -3.0F, 1, 2, 3, 0.0F, true));

        this.cube_r110 = new AdvancedModelRenderer(this);
        this.cube_r110.setRotationPoint(1.5F, 3.2833F, -12.2321F);
        this.rightJaw2.addChild(cube_r110);
        this.setRotateAngle(cube_r110, 0.4712F, 0.0F, 0.0F);
        this.cube_r110.cubeList.add(new ModelBox(cube_r110, 132, 45, -0.97F, -1.0F, -3.0F, 1, 1, 0, 0.0F, true));
        this.cube_r110.cubeList.add(new ModelBox(cube_r110, 16, 218, -0.97F, -1.0F, -3.0F, 0, 1, 3, 0.0F, true));

        this.cube_r111 = new AdvancedModelRenderer(this);
        this.cube_r111.setRotationPoint(1.5F, 3.1538F, -9.6168F);
        this.rightJaw2.addChild(cube_r111);
        this.setRotateAngle(cube_r111, 0.0785F, 0.0F, 0.0F);
        this.cube_r111.cubeList.add(new ModelBox(cube_r111, 208, 83, -0.97F, -1.0F, -3.0F, 0, 1, 3, 0.0F, true));

        this.cube_r112 = new AdvancedModelRenderer(this);
        this.cube_r112.setRotationPoint(1.5F, 1.2704F, -7.3903F);
        this.rightJaw2.addChild(cube_r112);
        this.setRotateAngle(cube_r112, 0.2967F, 0.0F, 0.0F);
        this.cube_r112.cubeList.add(new ModelBox(cube_r112, 130, 45, -1.5F, 0.0F, -3.0F, 1, 1, 0, -0.001F, true));
        this.cube_r112.cubeList.add(new ModelBox(cube_r112, 70, 180, -1.49F, 0.0F, -3.0F, 0, 1, 3, -0.001F, true));

        this.cube_r113 = new AdvancedModelRenderer(this);
        this.cube_r113.setRotationPoint(1.5F, 1.2704F, -7.3903F);
        this.rightJaw2.addChild(cube_r113);
        this.setRotateAngle(cube_r113, 0.1833F, 0.0F, 0.0F);
        this.cube_r113.cubeList.add(new ModelBox(cube_r113, 0, 218, -1.49F, 0.0F, 0.0F, 0, 1, 8, 0.0F, true));

        this.cube_r114 = new AdvancedModelRenderer(this);
        this.cube_r114.setRotationPoint(0.5F, 3.8049F, -14.525F);
        this.rightJaw2.addChild(cube_r114);
        this.setRotateAngle(cube_r114, 0.7532F, -0.4502F, -0.277F);
        this.cube_r114.cubeList.add(new ModelBox(cube_r114, 34, 150, 0.4F, -0.25F, -0.9F, 0, 1, 1, 0.0F, true));

        this.cube_r115 = new AdvancedModelRenderer(this);
        this.cube_r115.setRotationPoint(1.5F, -0.1F, 0.5F);
        this.rightJaw2.addChild(cube_r115);
        this.setRotateAngle(cube_r115, 0.5149F, 0.0F, 0.0F);
        this.cube_r115.cubeList.add(new ModelBox(cube_r115, 106, 122, -0.75F, -5.25F, -14.3F, 0, 2, 1, 0.0F, true));

        this.cube_r116 = new AdvancedModelRenderer(this);
        this.cube_r116.setRotationPoint(1.5F, -0.1F, 0.5F);
        this.rightJaw2.addChild(cube_r116);
        this.setRotateAngle(cube_r116, -0.0524F, 0.0F, 0.0F);
        this.cube_r116.cubeList.add(new ModelBox(cube_r116, 106, 119, -0.75F, 2.25F, -13.0F, 0, 2, 1, 0.0F, true));
        this.cube_r116.cubeList.add(new ModelBox(cube_r116, 50, 136, -0.75F, 3.25F, -11.5F, 0, 1, 1, 0.0F, true));

        this.cube_r117 = new AdvancedModelRenderer(this);
        this.cube_r117.setRotationPoint(1.5F, -0.1F, 0.5F);
        this.rightJaw2.addChild(cube_r117);
        this.setRotateAngle(cube_r117, 0.2531F, 0.0F, 0.0F);
        this.cube_r117.cubeList.add(new ModelBox(cube_r117, 48, 136, -1.0F, -0.25F, -10.25F, 0, 1, 1, 0.0F, true));
        this.cube_r117.cubeList.add(new ModelBox(cube_r117, 186, 214, -1.5F, 0.0F, -8.0F, 1, 3, 8, 0.01F, true));

        this.cube_r118 = new AdvancedModelRenderer(this);
        this.cube_r118.setRotationPoint(1.5F, -0.1F, 0.5F);
        this.rightJaw2.addChild(cube_r118);
        this.setRotateAngle(cube_r118, 0.1658F, 0.0F, 0.0F);
        this.cube_r118.cubeList.add(new ModelBox(cube_r118, 174, 223, -1.25F, 0.0F, -8.75F, 0, 1, 5, 0.0F, true));

        this.cube_r119 = new AdvancedModelRenderer(this);
        this.cube_r119.setRotationPoint(1.5F, 2.8822F, -12.6274F);
        this.rightJaw2.addChild(cube_r119);
        this.setRotateAngle(cube_r119, -1.7191F, 0.0F, 0.0F);
        this.cube_r119.cubeList.add(new ModelBox(cube_r119, 226, 55, -1.0F, -2.0F, 0.0F, 2, 2, 1, 0.0F, true));

        this.cube_r120 = new AdvancedModelRenderer(this);
        this.cube_r120.setRotationPoint(1.5F, 3.0386F, -13.6151F);
        this.rightJaw2.addChild(cube_r120);
        this.setRotateAngle(cube_r120, -1.4137F, 0.0F, 0.0F);
        this.cube_r120.cubeList.add(new ModelBox(cube_r120, 222, 40, -1.0F, -1.0F, 0.0F, 2, 1, 1, 0.001F, true));

        this.cube_r121 = new AdvancedModelRenderer(this);
        this.cube_r121.setRotationPoint(1.5F, 4.548F, -14.9272F);
        this.rightJaw2.addChild(cube_r121);
        this.setRotateAngle(cube_r121, -0.7156F, 0.0F, 0.0F);
        this.cube_r121.cubeList.add(new ModelBox(cube_r121, 198, 225, -1.0F, -2.0F, 0.0F, 2, 2, 1, 0.0F, true));

        this.cube_r122 = new AdvancedModelRenderer(this);
        this.cube_r122.setRotationPoint(1.5F, 5.4935F, -14.6016F);
        this.rightJaw2.addChild(cube_r122);
        this.setRotateAngle(cube_r122, 0.3316F, 0.0F, 0.0F);
        this.cube_r122.cubeList.add(new ModelBox(cube_r122, 216, 40, -1.0F, -1.0F, 0.0F, 2, 1, 1, 0.001F, true));

        this.cube_r123 = new AdvancedModelRenderer(this);
        this.cube_r123.setRotationPoint(1.5F, 5.8519F, -13.668F);
        this.rightJaw2.addChild(cube_r123);
        this.setRotateAngle(cube_r123, 1.2043F, 0.0F, 0.0F);
        this.cube_r123.cubeList.add(new ModelBox(cube_r123, 210, 40, -1.0F, -1.0F, 0.0F, 2, 1, 1, 0.0F, true));

        this.cube_r124 = new AdvancedModelRenderer(this);
        this.cube_r124.setRotationPoint(1.5F, 4.8551F, -8.7684F);
        this.rightJaw2.addChild(cube_r124);
        this.setRotateAngle(cube_r124, 0.2007F, 0.0F, 0.0F);
        this.cube_r124.cubeList.add(new ModelBox(cube_r124, 220, 220, -1.0F, -2.0F, -5.0F, 1, 2, 5, 0.01F, true));

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
        this.hips.offsetY = 0.3F;
        this.hips.offsetX = 1.0F;
        this.hips.rotateAngleY = (float)Math.toRadians(-150);
        this.hips.rotateAngleX = (float)Math.toRadians(6);
        this.hips.rotateAngleZ = (float)Math.toRadians(-2);
        this.hips.scaleChildren = true;
        float scaler = 0.7F;
        this.hips.setScale(scaler, scaler, scaler);
        //Start of pose:
        
        //End of pose, now render the model:
        this.hips.render(f);
        //Reset rotations, positions and sizing:
        this.hips.setScale(1.0F, 1.0F, 1.0F);
        this.hips.scaleChildren = false;
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

        EntityPrehistoricFloraSpinosaurus EntitySpinosaurus = (EntityPrehistoricFloraSpinosaurus) e;

        this.faceTarget(f3, f4, 8, neck1);
        this.faceTarget(f3, f4, 8, neck2);
        this.faceTarget(f3, f4, 8, neck3);
        this.faceTarget(f3, f4, 8, neck4);
        this.faceTarget(f3, f4, 8, head);

        AdvancedModelRenderer[] Tail = {this.tail1, this.tail2, this.tail3, this.tail4, this.tail5, this.tail6, this.tail7};
        AdvancedModelRenderer[] Neck = {this.neck1, this.neck2, this.neck3, this.neck4, this.head};
        AdvancedModelRenderer[] ArmL = {this.leftArm1, this.leftArm2, this.leftHand};
        AdvancedModelRenderer[] ArmR = {this.rightArm1, this.rightArm2, this.rightHand};

        EntitySpinosaurus.tailBuffer.applyChainSwingBuffer(Tail);

        if (EntitySpinosaurus.getAnimation() == EntitySpinosaurus.LAY_ANIMATION) {
            this.chainSwing(Neck, 0.5F, 0.10F, 0.5, f2, 0.8F);
            this.chainWave(Neck, 0.5F * 2, -0.02F, 0.5F, f2, 0.8F);
        }
        else {
            if (!EntitySpinosaurus.isReallyInWater() && EntitySpinosaurus.getAnimation() != EntitySpinosaurus.STAND_ANIMATION && EntitySpinosaurus.getAnimation() != EntitySpinosaurus.GRAPPLE_ANIMATION) {

                if (f3 == 0.0F || !EntitySpinosaurus.getIsMoving()) { //Is moving at all
                    this.chainSwing(Neck, 0.05F, 0.10F, 0.5, f2, 0.8F);
                    this.chainWave(Neck, 0.05F * 2, -0.02F, 0.5F, f2, 0.8F);

                    this.chainWave(Tail, (0.15F * 0.35F), 0.125F * 0.15F, 0.2F, f2, 1F);
                    this.chainSwing(Tail, (0.15F * 0.35F) * 4F, 0.05F * 0.35F, 0.12F, f2, 1F);

                    this.chainWaveExtended(ArmL, 0.175F, 0.03F, 0.1F, 3F, f2, 1F);
                    this.chainWaveExtended(ArmR, 0.175F, -0.03F, -0.1F, 0f, f2, 1F);
                    this.chainFlapExtended(ArmL, 0.175F, -0.03F, 0.1F, 3F, f2, 1F);
                    this.chainFlapExtended(ArmR, 0.175F, -0.03F, -0.1F, 0f, f2, 1F);
                    this.walk(this.leftArm1, 0.175F, 0.10F, true, 3F, 0.05F, f2, 1F);
                    this.walk(this.rightArm1, 0.175F, -0.10F, true, 0F, 0.05F, f2, 1F);
                    this.flap(this.leftArm1, 0.175F, -0.10F, true, 3F, 0.05F, f2, 1F);
                    this.flap(this.rightArm1, 0.175F, -0.10F, true, 0F, 0.05F, f2, 1F);

                    return;
                }

                if (EntitySpinosaurus.getIsFast()) { //Running


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

    public void animAttack(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraSpinosaurus entity = (EntityPrehistoricFloraSpinosaurus) entitylivingbaseIn;
        int animCycle = 22;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 0) / 6) * (-6.55+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*50-(0)));
            yy = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 15) {
            xx = -6.55+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*50 + (((tickAnim - 6) / 9) * (49.4431+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-50-(-6.55+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*50)));
            yy = 0 + (((tickAnim - 6) / 9) * (4.62302-(0)));
            zz = 0 + (((tickAnim - 6) / 9) * (-1.16569-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 23) {
            xx = 49.4431+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-50 + (((tickAnim - 15) / 8) * (0-(49.4431+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-50)));
            yy = 4.62302 + (((tickAnim - 15) / 8) * (0-(4.62302)));
            zz = -1.16569 + (((tickAnim - 15) / 8) * (0-(-1.16569)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck1, neck1.rotateAngleX + (float) Math.toRadians(xx), neck1.rotateAngleY + (float) Math.toRadians(yy), neck1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 0) / 6) * (-12.3+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*50-(0)));
            yy = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (1.45+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-20-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 15) {
            xx = -12.3+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*50 + (((tickAnim - 6) / 9) * (-13.7135+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*50-(-12.3+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*50)));
            yy = 0 + (((tickAnim - 6) / 9) * (-1.64091-(0)));
            zz = 1.45+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-20 + (((tickAnim - 6) / 9) * (-6.03157-(1.45+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-20)));
        }
        else if (tickAnim >= 15 && tickAnim < 23) {
            xx = -13.7135+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*50 + (((tickAnim - 15) / 8) * (0-(-13.7135+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*50)));
            yy = -1.64091 + (((tickAnim - 15) / 8) * (0-(-1.64091)));
            zz = -6.03157 + (((tickAnim - 15) / 8) * (0-(-6.03157)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(xx), neck2.rotateAngleY + (float) Math.toRadians(yy), neck2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0.13-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0.565-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 3) / 3) * (0-(0)));
            yy = 0.13 + (((tickAnim - 3) / 3) * (0.3-(0.13)));
            zz = 0.565 + (((tickAnim - 3) / 3) * (0.325-(0.565)));
        }
        else if (tickAnim >= 6 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 6) / 9) * (0-(0)));
            yy = 0.3 + (((tickAnim - 6) / 9) * (0.8-(0.3)));
            zz = 0.325 + (((tickAnim - 6) / 9) * (0-(0.325)));
        }
        else if (tickAnim >= 15 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 15) / 8) * (0-(0)));
            yy = 0.8 + (((tickAnim - 15) / 8) * (0-(0.8)));
            zz = 0 + (((tickAnim - 15) / 8) * (0-(0)));
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
            xx = 0 + (((tickAnim - 0) / 6) * (5.5-(0)));
            yy = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 15) {
            xx = 5.5 + (((tickAnim - 6) / 9) * (-0.50841-(5.5)));
            yy = 0 + (((tickAnim - 6) / 9) * (0.58408-(0)));
            zz = 0 + (((tickAnim - 6) / 9) * (-1.64968-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 23) {
            xx = -0.50841 + (((tickAnim - 15) / 8) * (0-(-0.50841)));
            yy = 0.58408 + (((tickAnim - 15) / 8) * (0-(0.58408)));
            zz = -1.64968 + (((tickAnim - 15) / 8) * (0-(-1.64968)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(xx), neck3.rotateAngleY + (float) Math.toRadians(yy), neck3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 0) / 6) * (4.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-50-(0)));
            yy = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 12) {
            xx = 4.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-50 + (((tickAnim - 6) / 6) * (-4.4818+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-50-(4.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-50)));
            yy = 0 + (((tickAnim - 6) / 6) * (1.04783-(0)));
            zz = 0 + (((tickAnim - 6) / 6) * (-3.00475-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 15) {
            xx = -4.4818+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-50 + (((tickAnim - 12) / 3) * (-108.3429+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*150-(-4.4818+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-50)));
            yy = 1.04783 + (((tickAnim - 12) / 3) * (1.64659-(1.04783)));
            zz = -3.00475 + (((tickAnim - 12) / 3) * (-4.72175-(-3.00475)));
        }
        else if (tickAnim >= 15 && tickAnim < 23) {
            xx = -108.3429+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*150 + (((tickAnim - 15) / 8) * (0-(-108.3429+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*150)));
            yy = 1.64659 + (((tickAnim - 15) / 8) * (0-(1.64659)));
            zz = -4.72175 + (((tickAnim - 15) / 8) * (0-(-4.72175)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck4, neck4.rotateAngleX + (float) Math.toRadians(xx), neck4.rotateAngleY + (float) Math.toRadians(yy), neck4.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (0.5-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 6) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 6) / 6) * (0.825-(0)));
            zz = 0.5 + (((tickAnim - 6) / 6) * (-1.705-(0.5)));
        }
        else if (tickAnim >= 12 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 12) / 1) * (0.11-(0)));
            yy = 0.825 + (((tickAnim - 12) / 1) * (0.875-(0.825)));
            zz = -1.705 + (((tickAnim - 12) / 1) * (-1.81-(-1.705)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = 0.11 + (((tickAnim - 13) / 2) * (0.225-(0.11)));
            yy = 0.875 + (((tickAnim - 13) / 2) * (0.175-(0.875)));
            zz = -1.81 + (((tickAnim - 13) / 2) * (-1.925-(-1.81)));
        }
        else if (tickAnim >= 15 && tickAnim < 18) {
            xx = 0.225 + (((tickAnim - 15) / 3) * (0-(0.225)));
            yy = 0.175 + (((tickAnim - 15) / 3) * (0.05-(0.175)));
            zz = -1.925 + (((tickAnim - 15) / 3) * (0.15-(-1.925)));
        }
        else if (tickAnim >= 18 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 18) / 5) * (0-(0)));
            yy = 0.05 + (((tickAnim - 18) / 5) * (0-(0.05)));
            zz = 0.15 + (((tickAnim - 18) / 5) * (0-(0.15)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.neck4.rotationPointX = this.neck4.rotationPointX + (float)(xx);
        this.neck4.rotationPointY = this.neck4.rotationPointY - (float)(yy);
        this.neck4.rotationPointZ = this.neck4.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 0) / 6) * (-8.25-(0)));
            yy = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 15) {
            xx = -8.25 + (((tickAnim - 6) / 9) * (-14.73386-(-8.25)));
            yy = 0 + (((tickAnim - 6) / 9) * (-4.48108-(0)));
            zz = 0 + (((tickAnim - 6) / 9) * (-0.4126-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 23) {
            xx = -14.73386 + (((tickAnim - 15) / 8) * (0-(-14.73386)));
            yy = -4.48108 + (((tickAnim - 15) / 8) * (0-(-4.48108)));
            zz = -0.4126 + (((tickAnim - 15) / 8) * (0-(-0.4126)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));

        this.head.rotationPointX = this.head.rotationPointX + (float)(0);
        this.head.rotationPointY = this.head.rotationPointY - (float)(0);
        this.head.rotationPointZ = this.head.rotationPointZ + (float)(0);



        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 6) / 6) * (38-(0)));
            yy = 0 + (((tickAnim - 6) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 6) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 15) {
            xx = 38 + (((tickAnim - 12) / 3) * (0-(38)));
            yy = 0 + (((tickAnim - 12) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(xx), jaw.rotateAngleY + (float) Math.toRadians(yy), jaw.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 0) / 6) * (-11.5-(0)));
            yy = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 15) {
            xx = -11.5 + (((tickAnim - 6) / 9) * (2.95064-(-11.5)));
            yy = 0 + (((tickAnim - 6) / 9) * (-1.52967-(0)));
            zz = 0 + (((tickAnim - 6) / 9) * (3.6964-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 23) {
            xx = 2.95064 + (((tickAnim - 15) / 8) * (0-(2.95064)));
            yy = -1.52967 + (((tickAnim - 15) / 8) * (0-(-1.52967)));
            zz = 3.6964 + (((tickAnim - 15) / 8) * (0-(3.6964)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(throat1, throat1.rotateAngleX + (float) Math.toRadians(xx), throat1.rotateAngleY + (float) Math.toRadians(yy), throat1.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (1.875-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 15) / 8) * (0-(0)));
            yy = 1.875 + (((tickAnim - 15) / 8) * (0-(1.875)));
            zz = 0 + (((tickAnim - 15) / 8) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.throat1.rotationPointX = this.throat1.rotationPointX + (float)(xx);
        this.throat1.rotationPointY = this.throat1.rotationPointY - (float)(yy);
        this.throat1.rotationPointZ = this.throat1.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 0) / 6) * (9.75-(0)));
            yy = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 12) {
            xx = 9.75 + (((tickAnim - 6) / 6) * (8.24512-(9.75)));
            yy = 0 + (((tickAnim - 6) / 6) * (2.74243-(0)));
            zz = 0 + (((tickAnim - 6) / 6) * (-0.20395-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 15) {
            xx = 8.24512 + (((tickAnim - 12) / 3) * (5.70513-(8.24512)));
            yy = 2.74243 + (((tickAnim - 12) / 3) * (2.48246-(2.74243)));
            zz = -0.20395 + (((tickAnim - 12) / 3) * (-0.2957-(-0.20395)));
        }
        else if (tickAnim >= 15 && tickAnim < 23) {
            xx = 5.70513 + (((tickAnim - 15) / 8) * (0-(5.70513)));
            yy = 2.48246 + (((tickAnim - 15) / 8) * (0-(2.48246)));
            zz = -0.2957 + (((tickAnim - 15) / 8) * (0-(-0.2957)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(throat2, throat2.rotateAngleX + (float) Math.toRadians(xx), throat2.rotateAngleY + (float) Math.toRadians(yy), throat2.rotateAngleZ + (float) Math.toRadians(zz));

    }
    public void animEat(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraSpinosaurus entity = (EntityPrehistoricFloraSpinosaurus) entitylivingbaseIn;
        int animCycle = 20;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (37.75-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 37.75 + (((tickAnim - 10) / 10) * (0-(37.75)));
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
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (-0.4-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            yy = -0.4 + (((tickAnim - 10) / 10) * (0-(-0.4)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.neck1.rotationPointX = this.neck1.rotationPointX + (float)(xx);
        this.neck1.rotationPointY = this.neck1.rotationPointY - (float)(yy);
        this.neck1.rotationPointZ = this.neck1.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (6-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 6 + (((tickAnim - 10) / 10) * (0-(6)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
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
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.neck2.rotationPointX = this.neck2.rotationPointX + (float)(xx);
        this.neck2.rotationPointY = this.neck2.rotationPointY - (float)(yy);
        this.neck2.rotationPointZ = this.neck2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (22.5-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 22.5 + (((tickAnim - 5) / 5) * (4-(22.5)));
            yy = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 5) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 4 + (((tickAnim - 10) / 10) * (0-(4)));
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
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0.525-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (1.925-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            yy = 0.525 + (((tickAnim - 5) / 5) * (0-(0.525)));
            zz = 1.925 + (((tickAnim - 5) / 5) * (0-(1.925)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.neck3.rotationPointX = this.neck3.rotationPointX + (float)(xx);
        this.neck3.rotationPointY = this.neck3.rotationPointY - (float)(yy);
        this.neck3.rotationPointZ = this.neck3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (8.75-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 8.75 + (((tickAnim - 10) / 10) * (0-(8.75)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck4, neck4.rotateAngleX + (float) Math.toRadians(xx), neck4.rotateAngleY + (float) Math.toRadians(yy), neck4.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (1.2-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 1.2 + (((tickAnim - 10) / 10) * (0-(1.2)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.neck4.rotationPointX = this.neck4.rotationPointX + (float)(xx);
        this.neck4.rotationPointY = this.neck4.rotationPointY - (float)(yy);
        this.neck4.rotationPointZ = this.neck4.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (9.5-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 9.5 + (((tickAnim - 10) / 10) * (0-(9.5)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
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
            zz = 0 + (((tickAnim - 0) / 10) * (0.35-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0.35 + (((tickAnim - 10) / 10) * (0-(0.35)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.head.rotationPointX = this.head.rotationPointX + (float)(xx);
        this.head.rotationPointY = this.head.rotationPointY - (float)(yy);
        this.head.rotationPointZ = this.head.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 4) / 3) * (23.25-(0)));
            yy = 0 + (((tickAnim - 4) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 3) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 10) {
            xx = 23.25 + (((tickAnim - 7) / 3) * (0-(23.25)));
            yy = 0 + (((tickAnim - 7) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(xx), jaw.rotateAngleY + (float) Math.toRadians(yy), jaw.rotateAngleZ + (float) Math.toRadians(zz));




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
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightJaw1, rightJaw1.rotateAngleX + (float) Math.toRadians(xx), rightJaw1.rotateAngleY + (float) Math.toRadians(yy), rightJaw1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (-22-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = -22 + (((tickAnim - 10) / 10) * (0-(-22)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(throat1, throat1.rotateAngleX + (float) Math.toRadians(xx), throat1.rotateAngleY + (float) Math.toRadians(yy), throat1.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (1.825-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 1.825 + (((tickAnim - 10) / 10) * (0-(1.825)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.throat1.rotationPointX = this.throat1.rotationPointX + (float)(xx);
        this.throat1.rotationPointY = this.throat1.rotationPointY - (float)(yy);
        this.throat1.rotationPointZ = this.throat1.rotationPointZ + (float)(zz);

    }
    public void animNest(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraSpinosaurus entity = (EntityPrehistoricFloraSpinosaurus) entitylivingbaseIn;
        int animCycle = 50;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (26.25-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 50) {
            xx = 26.25 + (((tickAnim - 15) / 35) * (0-(26.25)));
            yy = 0 + (((tickAnim - 15) / 35) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 35) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg1, leftLeg1.rotateAngleX + (float) Math.toRadians(xx), leftLeg1.rotateAngleY + (float) Math.toRadians(yy), leftLeg1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 24) {
            xx = 0 + (((tickAnim - 15) / 9) * (26-(0)));
            yy = 0 + (((tickAnim - 15) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 9) * (0-(0)));
        }
        else if (tickAnim >= 24 && tickAnim < 38) {
            xx = 26 + (((tickAnim - 24) / 14) * (-15.21-(26)));
            yy = 0 + (((tickAnim - 24) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 24) / 14) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 50) {
            xx = -15.21 + (((tickAnim - 38) / 12) * (0-(-15.21)));
            yy = 0 + (((tickAnim - 38) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 38) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg2, leftLeg2.rotateAngleX + (float) Math.toRadians(xx), leftLeg2.rotateAngleY + (float) Math.toRadians(yy), leftLeg2.rotateAngleZ + (float) Math.toRadians(zz));

        this.leftLeg2.rotationPointX = this.leftLeg2.rotationPointX + (float)(0);
        this.leftLeg2.rotationPointY = this.leftLeg2.rotationPointY - (float)(0);
        this.leftLeg2.rotationPointZ = this.leftLeg2.rotationPointZ + (float)(0);



        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 15) / 15) * (-44.75-(0)));
            yy = 0 + (((tickAnim - 15) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 15) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 38) {
            xx = -44.75 + (((tickAnim - 30) / 8) * (-44.75-(-44.75)));
            yy = 0 + (((tickAnim - 30) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 8) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 50) {
            xx = -44.75 + (((tickAnim - 38) / 12) * (0-(-44.75)));
            yy = 0 + (((tickAnim - 38) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 38) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg3, leftLeg3.rotateAngleX + (float) Math.toRadians(xx), leftLeg3.rotateAngleY + (float) Math.toRadians(yy), leftLeg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 38) {
            xx = 0 + (((tickAnim - 0) / 38) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 38) * (1.65-(0)));
            zz = 0 + (((tickAnim - 0) / 38) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 38) / 12) * (0-(0)));
            yy = 1.65 + (((tickAnim - 38) / 12) * (0-(1.65)));
            zz = 0 + (((tickAnim - 38) / 12) * (0-(0)));
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
    public void animLay(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraSpinosaurus entity = (EntityPrehistoricFloraSpinosaurus) entitylivingbaseIn;
        int animCycle = 50;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (-5.5-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = -5.5 + (((tickAnim - 10) / 10) * (4-(-5.5)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 4 + (((tickAnim - 20) / 10) * (4-(4)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = 4 + (((tickAnim - 30) / 10) * (14-(4)));
            yy = 0 + (((tickAnim - 30) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 10) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = 14 + (((tickAnim - 40) / 10) * (0-(14)));
            yy = 0 + (((tickAnim - 40) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(hips, hips.rotateAngleX + (float) Math.toRadians(xx), hips.rotateAngleY + (float) Math.toRadians(yy), hips.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (-10.815-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (1.02-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            yy = -10.815 + (((tickAnim - 10) / 10) * (-14.875-(-10.815)));
            zz = 1.02 + (((tickAnim - 10) / 10) * (2.05-(1.02)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            yy = -14.875 + (((tickAnim - 20) / 10) * (-14.875-(-14.875)));
            zz = 2.05 + (((tickAnim - 20) / 10) * (2.05-(2.05)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 30) / 10) * (0-(0)));
            yy = -14.875 + (((tickAnim - 30) / 10) * (-5.265-(-14.875)));
            zz = 2.05 + (((tickAnim - 30) / 10) * (-3.03-(2.05)));
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 40) / 10) * (0-(0)));
            yy = -5.265 + (((tickAnim - 40) / 10) * (0-(-5.265)));
            zz = -3.03 + (((tickAnim - 40) / 10) * (0-(-3.03)));
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
            xx = 0 + (((tickAnim - 0) / 20) * (-61.90857-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (-23.48407-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (-9.1157-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = -61.90857 + (((tickAnim - 20) / 10) * (-61.90857-(-61.90857)));
            yy = -23.48407 + (((tickAnim - 20) / 10) * (-23.48407-(-23.48407)));
            zz = -9.1157 + (((tickAnim - 20) / 10) * (-9.1157-(-9.1157)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = -61.90857 + (((tickAnim - 30) / 20) * (0-(-61.90857)));
            yy = -23.48407 + (((tickAnim - 30) / 20) * (0-(-23.48407)));
            zz = -9.1157 + (((tickAnim - 30) / 20) * (0-(-9.1157)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg1, leftLeg1.rotateAngleX + (float) Math.toRadians(xx), leftLeg1.rotateAngleY + (float) Math.toRadians(yy), leftLeg1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (51.04024-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (-6.58491-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0.73422-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 51.04024 + (((tickAnim - 10) / 10) * (38.58048-(51.04024)));
            yy = -6.58491 + (((tickAnim - 10) / 10) * (-13.16983-(-6.58491)));
            zz = 0.73422 + (((tickAnim - 10) / 10) * (-1.46844-(0.73422)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 38.58048 + (((tickAnim - 20) / 10) * (38.58048-(38.58048)));
            yy = -13.16983 + (((tickAnim - 20) / 10) * (-13.16983-(-13.16983)));
            zz = -1.46844 + (((tickAnim - 20) / 10) * (-1.46844-(-1.46844)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = 38.58048 + (((tickAnim - 30) / 10) * (33.79024-(38.58048)));
            yy = -13.16983 + (((tickAnim - 30) / 10) * (-6.58491-(-13.16983)));
            zz = -1.46844 + (((tickAnim - 30) / 10) * (-0.73422-(-1.46844)));
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = 33.79024 + (((tickAnim - 40) / 10) * (0-(33.79024)));
            yy = -6.58491 + (((tickAnim - 40) / 10) * (0-(-6.58491)));
            zz = -0.73422 + (((tickAnim - 40) / 10) * (0-(-0.73422)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg2, leftLeg2.rotateAngleX + (float) Math.toRadians(xx), leftLeg2.rotateAngleY + (float) Math.toRadians(yy), leftLeg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (-41.29024-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (-6.58491-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0.73422-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = -41.29024 + (((tickAnim - 10) / 10) * (-38.8169-(-41.29024)));
            yy = -6.58491 + (((tickAnim - 10) / 10) * (0.07445-(-6.58491)));
            zz = 0.73422 + (((tickAnim - 10) / 10) * (-0.5681-(0.73422)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = -38.8169 + (((tickAnim - 20) / 10) * (-38.8169-(-38.8169)));
            yy = 0.07445 + (((tickAnim - 20) / 10) * (0.07445-(0.07445)));
            zz = -0.5681 + (((tickAnim - 20) / 10) * (-0.5681-(-0.5681)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = -38.8169 + (((tickAnim - 30) / 20) * (0-(-38.8169)));
            yy = 0.07445 + (((tickAnim - 30) / 20) * (0-(0.07445)));
            zz = -0.5681 + (((tickAnim - 30) / 20) * (0-(-0.5681)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg3, leftLeg3.rotateAngleX + (float) Math.toRadians(xx), leftLeg3.rotateAngleY + (float) Math.toRadians(yy), leftLeg3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (-6.25-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 30) {
            xx = -6.25 + (((tickAnim - 10) / 20) * (-6.25-(-6.25)));
            yy = 0 + (((tickAnim - 10) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 20) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = -6.25 + (((tickAnim - 30) / 20) * (0-(-6.25)));
            yy = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail1, tail1.rotateAngleX + (float) Math.toRadians(xx), tail1.rotateAngleY + (float) Math.toRadians(yy), tail1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (-8.25-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = -8.25 + (((tickAnim - 10) / 10) * (-12-(-8.25)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = -12 + (((tickAnim - 20) / 10) * (-12-(-12)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = -12 + (((tickAnim - 30) / 20) * (0-(-12)));
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
            xx = 0 + (((tickAnim - 0) / 10) * (-7-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = -7 + (((tickAnim - 10) / 10) * (-14.5-(-7)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = -14.5 + (((tickAnim - 20) / 10) * (-14.5-(-14.5)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = -14.5 + (((tickAnim - 30) / 10) * (-17.25-(-14.5)));
            yy = 0 + (((tickAnim - 30) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 10) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = -17.25 + (((tickAnim - 40) / 10) * (0-(-17.25)));
            yy = 0 + (((tickAnim - 40) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(xx), tail3.rotateAngleY + (float) Math.toRadians(yy), tail3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 5) / 5) * (16.5-(0)));
            yy = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 5) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 16.5 + (((tickAnim - 10) / 10) * (21.25-(16.5)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 21.25 + (((tickAnim - 20) / 10) * (21.25-(21.25)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 39) {
            xx = 21.25 + (((tickAnim - 30) / 9) * (0-(21.25)));
            yy = 0 + (((tickAnim - 30) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 9) * (0-(0)));
        }
        else if (tickAnim >= 39 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 39) / 11) * (0-(0)));
            yy = 0 + (((tickAnim - 39) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 39) / 11) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(xx), tail4.rotateAngleY + (float) Math.toRadians(yy), tail4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 5) / 5) * (11.56196-(0)));
            yy = 0 + (((tickAnim - 5) / 5) * (1.7557-(0)));
            zz = 0 + (((tickAnim - 5) / 5) * (-2.52518-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 11.56196 + (((tickAnim - 10) / 10) * (9.56196-(11.56196)));
            yy = 1.7557 + (((tickAnim - 10) / 10) * (1.7557-(1.7557)));
            zz = -2.52518 + (((tickAnim - 10) / 10) * (-2.52518-(-2.52518)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 9.56196 + (((tickAnim - 20) / 10) * (9.56196-(9.56196)));
            yy = 1.7557 + (((tickAnim - 20) / 10) * (1.7557-(1.7557)));
            zz = -2.52518 + (((tickAnim - 20) / 10) * (-2.52518-(-2.52518)));
        }
        else if (tickAnim >= 30 && tickAnim < 39) {
            xx = 9.56196 + (((tickAnim - 30) / 9) * (0-(9.56196)));
            yy = 1.7557 + (((tickAnim - 30) / 9) * (0-(1.7557)));
            zz = -2.52518 + (((tickAnim - 30) / 9) * (0-(-2.52518)));
        }
        else if (tickAnim >= 39 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 39) / 11) * (0-(0)));
            yy = 0 + (((tickAnim - 39) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 39) / 11) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail5, tail5.rotateAngleX + (float) Math.toRadians(xx), tail5.rotateAngleY + (float) Math.toRadians(yy), tail5.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 5) / 5) * (9.75-(0)));
            yy = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 5) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 9.75 + (((tickAnim - 10) / 10) * (7.25-(9.75)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 7.25 + (((tickAnim - 20) / 10) * (7.25-(7.25)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 7.25 + (((tickAnim - 30) / 20) * (0-(7.25)));
            yy = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail6, tail6.rotateAngleX + (float) Math.toRadians(xx), tail6.rotateAngleY + (float) Math.toRadians(yy), tail6.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 4) / 1) * (26-(0)));
            yy = 0 + (((tickAnim - 4) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 1) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 26 + (((tickAnim - 5) / 5) * (10-(26)));
            yy = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 5) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 10 + (((tickAnim - 10) / 10) * (11-(10)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
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
        this.setRotateAngle(tail7, tail7.rotateAngleX + (float) Math.toRadians(xx), tail7.rotateAngleY + (float) Math.toRadians(yy), tail7.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 7) / 13) * (-22.5-(0)));
            yy = 0 + (((tickAnim - 7) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 13) * (-33.5-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = -22.5 + (((tickAnim - 20) / 10) * (-22.5-(-22.5)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = -33.5 + (((tickAnim - 20) / 10) * (-33.5-(-33.5)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = -22.5 + (((tickAnim - 30) / 10) * (-13.00276-(-22.5)));
            yy = 0 + (((tickAnim - 30) / 10) * (6.05821-(0)));
            zz = -33.5 + (((tickAnim - 30) / 10) * (-48.99628-(-33.5)));
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = -13.00276 + (((tickAnim - 40) / 10) * (0-(-13.00276)));
            yy = 6.05821 + (((tickAnim - 40) / 10) * (0-(6.05821)));
            zz = -48.99628 + (((tickAnim - 40) / 10) * (0-(-48.99628)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm1, leftArm1.rotateAngleX + (float) Math.toRadians(xx), leftArm1.rotateAngleY + (float) Math.toRadians(yy), leftArm1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 7) / 6) * (-19.86017-(0)));
            yy = 0 + (((tickAnim - 7) / 6) * (-26.87796-(0)));
            zz = 0 + (((tickAnim - 7) / 6) * (-33.03923-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 20) {
            xx = -19.86017 + (((tickAnim - 13) / 7) * (-40.9782-(-19.86017)));
            yy = -26.87796 + (((tickAnim - 13) / 7) * (-18.64788-(-26.87796)));
            zz = -33.03923 + (((tickAnim - 13) / 7) * (-43.82711-(-33.03923)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = -40.9782 + (((tickAnim - 20) / 10) * (-40.9782-(-40.9782)));
            yy = -18.64788 + (((tickAnim - 20) / 10) * (-18.64788-(-18.64788)));
            zz = -43.82711 + (((tickAnim - 20) / 10) * (-43.82711-(-43.82711)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = -40.9782 + (((tickAnim - 30) / 20) * (0-(-40.9782)));
            yy = -18.64788 + (((tickAnim - 30) / 20) * (0-(-18.64788)));
            zz = -43.82711 + (((tickAnim - 30) / 20) * (0-(-43.82711)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm2, leftArm2.rotateAngleX + (float) Math.toRadians(xx), leftArm2.rotateAngleY + (float) Math.toRadians(yy), leftArm2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (-40-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = -40 + (((tickAnim - 20) / 10) * (-40-(-40)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            zz = -40 + (((tickAnim - 30) / 20) * (0-(-40)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftThumb, leftThumb.rotateAngleX + (float) Math.toRadians(xx), leftThumb.rotateAngleY + (float) Math.toRadians(yy), leftThumb.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (-2.25-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = -2.25 + (((tickAnim - 10) / 10) * (-2.25-(-2.25)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = -2.25 + (((tickAnim - 20) / 10) * (-2.25-(-2.25)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = -2.25 + (((tickAnim - 30) / 20) * (0-(-2.25)));
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
            xx = 0 + (((tickAnim - 0) / 10) * (-4.75-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = -4.75 + (((tickAnim - 10) / 10) * (-4.75-(-4.75)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = -4.75 + (((tickAnim - 20) / 10) * (-4.75-(-4.75)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = -4.75 + (((tickAnim - 30) / 20) * (0-(-4.75)));
            yy = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(xx), neck2.rotateAngleY + (float) Math.toRadians(yy), neck2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (-0.2-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0.6-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            yy = -0.2 + (((tickAnim - 10) / 10) * (-0.2-(-0.2)));
            zz = 0.6 + (((tickAnim - 10) / 10) * (0.6-(0.6)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            yy = -0.2 + (((tickAnim - 20) / 10) * (-0.2-(-0.2)));
            zz = 0.6 + (((tickAnim - 20) / 10) * (0.6-(0.6)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            yy = -0.2 + (((tickAnim - 30) / 20) * (0-(-0.2)));
            zz = 0.6 + (((tickAnim - 30) / 20) * (0-(0.6)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.neck2.rotationPointX = this.neck2.rotationPointX + (float)(xx);
        this.neck2.rotationPointY = this.neck2.rotationPointY - (float)(yy);
        this.neck2.rotationPointZ = this.neck2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (-5.5-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = -5.5 + (((tickAnim - 10) / 10) * (-5.5-(-5.5)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = -5.5 + (((tickAnim - 20) / 10) * (-5.5-(-5.5)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = -5.5 + (((tickAnim - 30) / 10) * (-20.25-(-5.5)));
            yy = 0 + (((tickAnim - 30) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 10) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = -20.25 + (((tickAnim - 40) / 10) * (0-(-20.25)));
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
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (-0.275-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            yy = -0.275 + (((tickAnim - 10) / 10) * (-0.275-(-0.275)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            yy = -0.275 + (((tickAnim - 20) / 10) * (-0.275-(-0.275)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 30) / 10) * (0-(0)));
            yy = -0.275 + (((tickAnim - 30) / 10) * (-0.59-(-0.275)));
            zz = 0 + (((tickAnim - 30) / 10) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 40) / 10) * (0-(0)));
            yy = -0.59 + (((tickAnim - 40) / 10) * (0-(-0.59)));
            zz = 0 + (((tickAnim - 40) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.neck3.rotationPointX = this.neck3.rotationPointX + (float)(xx);
        this.neck3.rotationPointY = this.neck3.rotationPointY - (float)(yy);
        this.neck3.rotationPointZ = this.neck3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (15.25-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 15.25 + (((tickAnim - 10) / 10) * (0-(15.25)));
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
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (-61.90857-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (23.48407-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (9.1157-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = -61.90857 + (((tickAnim - 20) / 10) * (-61.90857-(-61.90857)));
            yy = 23.48407 + (((tickAnim - 20) / 10) * (23.48407-(23.48407)));
            zz = 9.1157 + (((tickAnim - 20) / 10) * (9.1157-(9.1157)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = -61.90857 + (((tickAnim - 30) / 20) * (0-(-61.90857)));
            yy = 23.48407 + (((tickAnim - 30) / 20) * (0-(23.48407)));
            zz = 9.1157 + (((tickAnim - 30) / 20) * (0-(9.1157)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg1, rightLeg1.rotateAngleX + (float) Math.toRadians(xx), rightLeg1.rotateAngleY + (float) Math.toRadians(yy), rightLeg1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (51.04024-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (6.58491-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (-0.73422-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 51.04024 + (((tickAnim - 10) / 10) * (38.58048-(51.04024)));
            yy = 6.58491 + (((tickAnim - 10) / 10) * (13.16983-(6.58491)));
            zz = -0.73422 + (((tickAnim - 10) / 10) * (-1.46844-(-0.73422)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 38.58048 + (((tickAnim - 20) / 10) * (38.58048-(38.58048)));
            yy = 13.16983 + (((tickAnim - 20) / 10) * (13.16983-(13.16983)));
            zz = -1.46844 + (((tickAnim - 20) / 10) * (-1.46844-(-1.46844)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = 38.58048 + (((tickAnim - 30) / 10) * (33.79024-(38.58048)));
            yy = 13.16983 + (((tickAnim - 30) / 10) * (6.58491-(13.16983)));
            zz = -1.46844 + (((tickAnim - 30) / 10) * (0.73422-(-1.46844)));
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = 33.79024 + (((tickAnim - 40) / 10) * (0-(33.79024)));
            yy = 6.58491 + (((tickAnim - 40) / 10) * (0-(6.58491)));
            zz = 0.73422 + (((tickAnim - 40) / 10) * (0-(0.73422)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg2, rightLeg2.rotateAngleX + (float) Math.toRadians(xx), rightLeg2.rotateAngleY + (float) Math.toRadians(yy), rightLeg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (-41.87-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = -41.87 + (((tickAnim - 10) / 10) * (-42.25-(-41.87)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = -42.25 + (((tickAnim - 20) / 10) * (-42.25-(-42.25)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = -42.25 + (((tickAnim - 30) / 20) * (0-(-42.25)));
            yy = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg3, rightLeg3.rotateAngleX + (float) Math.toRadians(xx), rightLeg3.rotateAngleY + (float) Math.toRadians(yy), rightLeg3.rotateAngleZ + (float) Math.toRadians(zz));


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
        this.rightLeg3.rotationPointX = this.rightLeg3.rotationPointX + (float)(xx);
        this.rightLeg3.rotationPointY = this.rightLeg3.rotationPointY - (float)(yy);
        this.rightLeg3.rotationPointZ = this.rightLeg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (28.38-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 28.38 + (((tickAnim - 10) / 10) * (66.75-(28.38)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 66.75 + (((tickAnim - 20) / 10) * (66.75-(66.75)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = 66.75 + (((tickAnim - 30) / 10) * (5.59439-(66.75)));
            yy = 0 + (((tickAnim - 30) / 10) * (2.927-(0)));
            zz = 0 + (((tickAnim - 30) / 10) * (-6.08502-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = 5.59439 + (((tickAnim - 40) / 10) * (0-(5.59439)));
            yy = 2.927 + (((tickAnim - 40) / 10) * (0-(2.927)));
            zz = -6.08502 + (((tickAnim - 40) / 10) * (0-(-6.08502)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightFoot, rightFoot.rotateAngleX + (float) Math.toRadians(xx), rightFoot.rotateAngleY + (float) Math.toRadians(yy), rightFoot.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (-3.025-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = -3.025 + (((tickAnim - 10) / 10) * (-3.025-(-3.025)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = -3.025 + (((tickAnim - 20) / 10) * (-3.025-(-3.025)));
        }
        else if (tickAnim >= 30 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 30) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 30) / 5) * (1-(0)));
            zz = -3.025 + (((tickAnim - 30) / 5) * (-1.81-(-3.025)));
        }
        else if (tickAnim >= 35 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 35) / 5) * (0-(0)));
            yy = 1 + (((tickAnim - 35) / 5) * (0.6-(1)));
            zz = -1.81 + (((tickAnim - 35) / 5) * (-0.6-(-1.81)));
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 40) / 10) * (0-(0)));
            yy = 0.6 + (((tickAnim - 40) / 10) * (0-(0.6)));
            zz = -0.6 + (((tickAnim - 40) / 10) * (0-(-0.6)));
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
            xx = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 7) / 13) * (-22.5-(0)));
            yy = 0 + (((tickAnim - 7) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 13) * (33.5-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = -22.5 + (((tickAnim - 20) / 10) * (-22.5-(-22.5)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 33.5 + (((tickAnim - 20) / 10) * (33.5-(33.5)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = -22.5 + (((tickAnim - 30) / 10) * (-13.00276-(-22.5)));
            yy = 0 + (((tickAnim - 30) / 10) * (6.05821-(0)));
            zz = 33.5 + (((tickAnim - 30) / 10) * (48.99628-(33.5)));
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = -13.00276 + (((tickAnim - 40) / 10) * (0-(-13.00276)));
            yy = 6.05821 + (((tickAnim - 40) / 10) * (0-(6.05821)));
            zz = 48.99628 + (((tickAnim - 40) / 10) * (0-(48.99628)));
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
        else if (tickAnim >= 7 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 7) / 6) * (-19.86017-(0)));
            yy = 0 + (((tickAnim - 7) / 6) * (26.87796-(0)));
            zz = 0 + (((tickAnim - 7) / 6) * (33.03923-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 20) {
            xx = -19.86017 + (((tickAnim - 13) / 7) * (-40.9782-(-19.86017)));
            yy = 26.87796 + (((tickAnim - 13) / 7) * (18.64788-(26.87796)));
            zz = 33.03923 + (((tickAnim - 13) / 7) * (43.82711-(33.03923)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = -40.9782 + (((tickAnim - 20) / 10) * (-40.9782-(-40.9782)));
            yy = 18.64788 + (((tickAnim - 20) / 10) * (18.64788-(18.64788)));
            zz = 43.82711 + (((tickAnim - 20) / 10) * (43.82711-(43.82711)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = -40.9782 + (((tickAnim - 30) / 20) * (0-(-40.9782)));
            yy = 18.64788 + (((tickAnim - 30) / 20) * (0-(18.64788)));
            zz = 43.82711 + (((tickAnim - 30) / 20) * (0-(43.82711)));
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
        else if (tickAnim >= 7 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 7) / 13) * (-5.5-(0)));
            yy = 0 + (((tickAnim - 7) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 13) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = -5.5 + (((tickAnim - 20) / 10) * (-5.5-(-5.5)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = -5.5 + (((tickAnim - 30) / 20) * (0-(-5.5)));
            yy = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightHand, rightHand.rotateAngleX + (float) Math.toRadians(xx), rightHand.rotateAngleY + (float) Math.toRadians(yy), rightHand.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (40-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 40 + (((tickAnim - 20) / 10) * (40-(40)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            zz = 40 + (((tickAnim - 30) / 20) * (0-(40)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightThumb, rightThumb.rotateAngleX + (float) Math.toRadians(xx), rightThumb.rotateAngleY + (float) Math.toRadians(yy), rightThumb.rotateAngleZ + (float) Math.toRadians(zz));

    }
    public void animFishing(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraSpinosaurus entity = (EntityPrehistoricFloraSpinosaurus) entitylivingbaseIn;
        int animCycle = 739;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (-5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+30))*-10-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 41) {
            xx = -5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+30))*-10 + (((tickAnim - 40) / 1) * (-12.75-(-5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+30))*-10)));
            yy = 0 + (((tickAnim - 40) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 1) * (0-(0)));
        }
        else if (tickAnim >= 41 && tickAnim < 285) {
            xx = -12.75 + (((tickAnim - 41) / 244) * (-12.75-(-12.75)));
            yy = 0 + (((tickAnim - 41) / 244) * (0-(0)));
            zz = 0 + (((tickAnim - 41) / 244) * (0-(0)));
        }
        else if (tickAnim >= 285 && tickAnim < 314) {
            xx = -12.75 + (((tickAnim - 285) / 29) * (-11.59228-(-12.75)));
            yy = 0 + (((tickAnim - 285) / 29) * (0.36397-(0)));
            zz = 0 + (((tickAnim - 285) / 29) * (0.93142-(0)));
        }
        else if (tickAnim >= 314 && tickAnim < 320) {
            xx = -11.59228 + (((tickAnim - 314) / 6) * (-14.75-(-11.59228)));
            yy = 0.36397 + (((tickAnim - 314) / 6) * (0-(0.36397)));
            zz = 0.93142 + (((tickAnim - 314) / 6) * (0-(0.93142)));
        }
        else if (tickAnim >= 320 && tickAnim < 675) {
            xx = -14.75 + (((tickAnim - 320) / 355) * (-14.75-(-14.75)));
            yy = 0 + (((tickAnim - 320) / 355) * (0-(0)));
            zz = 0 + (((tickAnim - 320) / 355) * (0-(0)));
        }
        else if (tickAnim >= 675 && tickAnim < 690) {
            xx = -14.75 + (((tickAnim - 675) / 15) * (7-(-14.75)));
            yy = 0 + (((tickAnim - 675) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 675) / 15) * (0-(0)));
        }
        else if (tickAnim >= 690 && tickAnim < 715) {
            xx = 7 + (((tickAnim - 690) / 25) * (3.12511-(7)));
            yy = 0 + (((tickAnim - 690) / 25) * (-0.13353-(0)));
            zz = 0 + (((tickAnim - 690) / 25) * (-1.7449-(0)));
        }
        else if (tickAnim >= 715 && tickAnim < 739) {
            xx = 3.12511 + (((tickAnim - 715) / 24) * (0-(3.12511)));
            yy = -0.13353 + (((tickAnim - 715) / 24) * (0-(-0.13353)));
            zz = -1.7449 + (((tickAnim - 715) / 24) * (0-(-1.7449)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(hips, hips.rotateAngleX + (float) Math.toRadians(xx), hips.rotateAngleY + (float) Math.toRadians(yy), hips.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 41) {
            xx = 0 + (((tickAnim - 0) / 41) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 41) * (-2.025-(0)));
            zz = 0 + (((tickAnim - 0) / 41) * (0.975-(0)));
        }
        else if (tickAnim >= 41 && tickAnim < 285) {
            xx = 0 + (((tickAnim - 41) / 244) * (0-(0)));
            yy = -2.025 + (((tickAnim - 41) / 244) * (-2.025-(-2.025)));
            zz = 0.975 + (((tickAnim - 41) / 244) * (0.975-(0.975)));
        }
        else if (tickAnim >= 285 && tickAnim < 320) {
            xx = 0 + (((tickAnim - 285) / 35) * (0-(0)));
            yy = -2.025 + (((tickAnim - 285) / 35) * (-2.175-(-2.025)));
            zz = 0.975 + (((tickAnim - 285) / 35) * (-7.245-(0.975)));
        }
        else if (tickAnim >= 320 && tickAnim < 675) {
            xx = 0 + (((tickAnim - 320) / 355) * (0-(0)));
            yy = -2.175 + (((tickAnim - 320) / 355) * (-2.175-(-2.175)));
            zz = -7.245 + (((tickAnim - 320) / 355) * (-7.245-(-7.245)));
        }
        else if (tickAnim >= 675 && tickAnim < 690) {
            xx = 0 + (((tickAnim - 675) / 15) * (0-(0)));
            yy = -2.175 + (((tickAnim - 675) / 15) * (0-(-2.175)));
            zz = -7.245 + (((tickAnim - 675) / 15) * (-8.865-(-7.245)));
        }
        else if (tickAnim >= 690 && tickAnim < 739) {
            xx = 0 + (((tickAnim - 690) / 49) * (0-(0)));
            yy = 0 + (((tickAnim - 690) / 49) * (0-(0)));
            zz = -8.865 + (((tickAnim - 690) / 49) * (0-(-8.865)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.hips.rotationPointX = this.hips.rotationPointX + (float)(xx);
        this.hips.rotationPointY = this.hips.rotationPointY - (float)(yy);
        this.hips.rotationPointZ = this.hips.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 27) {
            xx = 0 + (((tickAnim - 0) / 27) * (-21.90588-(0)));
            yy = 0 + (((tickAnim - 0) / 27) * (0.04683-(0)));
            zz = 0 + (((tickAnim - 0) / 27) * (0.17966-(0)));
        }
        else if (tickAnim >= 27 && tickAnim < 40) {
            xx = -21.90588 + (((tickAnim - 27) / 13) * (-9.20784-(-21.90588)));
            yy = 0.04683 + (((tickAnim - 27) / 13) * (0.06244-(0.04683)));
            zz = 0.17966 + (((tickAnim - 27) / 13) * (0.23955-(0.17966)));
        }
        else if (tickAnim >= 40 && tickAnim < 285) {
            xx = -9.20784 + (((tickAnim - 40) / 245) * (-9.20784-(-9.20784)));
            yy = 0.06244 + (((tickAnim - 40) / 245) * (0.06244-(0.06244)));
            zz = 0.23955 + (((tickAnim - 40) / 245) * (0.23955-(0.23955)));
        }
        else if (tickAnim >= 285 && tickAnim < 304) {
            xx = -9.20784 + (((tickAnim - 285) / 19) * (7.19592-(-9.20784)));
            yy = 0.06244 + (((tickAnim - 285) / 19) * (0.1306-(0.06244)));
            zz = 0.23955 + (((tickAnim - 285) / 19) * (-1.13744-(0.23955)));
        }
        else if (tickAnim >= 304 && tickAnim < 320) {
            xx = 7.19592 + (((tickAnim - 304) / 16) * (20.75-(7.19592)));
            yy = 0.1306 + (((tickAnim - 304) / 16) * (0-(0.1306)));
            zz = -1.13744 + (((tickAnim - 304) / 16) * (0-(-1.13744)));
        }
        else if (tickAnim >= 320 && tickAnim < 675) {
            xx = 20.75 + (((tickAnim - 320) / 355) * (20.75-(20.75)));
            yy = 0 + (((tickAnim - 320) / 355) * (0-(0)));
            zz = 0 + (((tickAnim - 320) / 355) * (0-(0)));
        }
        else if (tickAnim >= 675 && tickAnim < 678) {
            xx = 20.75 + (((tickAnim - 675) / 3) * (19.75-(20.75)));
            yy = 0 + (((tickAnim - 675) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 675) / 3) * (0-(0)));
        }
        else if (tickAnim >= 678 && tickAnim < 688) {
            xx = 19.75 + (((tickAnim - 678) / 10) * (-28.71-(19.75)));
            yy = 0 + (((tickAnim - 678) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 678) / 10) * (0-(0)));
        }
        else if (tickAnim >= 688 && tickAnim < 690) {
            xx = -28.71 + (((tickAnim - 688) / 2) * (-20-(-28.71)));
            yy = 0 + (((tickAnim - 688) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 688) / 2) * (0-(0)));
        }
        else if (tickAnim >= 690 && tickAnim < 715) {
            xx = -20 + (((tickAnim - 690) / 25) * (-27.65505-(-20)));
            yy = 0 + (((tickAnim - 690) / 25) * (-4.59279-(0)));
            zz = 0 + (((tickAnim - 690) / 25) * (3.86501-(0)));
        }
        else if (tickAnim >= 715 && tickAnim < 727) {
            xx = -27.65505 + (((tickAnim - 715) / 12) * (1.6-(-27.65505)));
            yy = -4.59279 + (((tickAnim - 715) / 12) * (0-(-4.59279)));
            zz = 3.86501 + (((tickAnim - 715) / 12) * (0-(3.86501)));
        }
        else if (tickAnim >= 727 && tickAnim < 739) {
            xx = 1.6 + (((tickAnim - 727) / 12) * (0-(1.6)));
            yy = 0 + (((tickAnim - 727) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 727) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg1, leftLeg1.rotateAngleX + (float) Math.toRadians(xx), leftLeg1.rotateAngleY + (float) Math.toRadians(yy), leftLeg1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 27) {
            xx = 0 + (((tickAnim - 0) / 27) * (20.25-(0)));
            yy = 0 + (((tickAnim - 0) / 27) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 27) * (0-(0)));
        }
        else if (tickAnim >= 27 && tickAnim < 40) {
            xx = 20.25 + (((tickAnim - 27) / 13) * (0-(20.25)));
            yy = 0 + (((tickAnim - 27) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 27) / 13) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 285) {
            xx = 0 + (((tickAnim - 40) / 245) * (0-(0)));
            yy = 0 + (((tickAnim - 40) / 245) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 245) * (0-(0)));
        }
        else if (tickAnim >= 285 && tickAnim < 320) {
            xx = 0 + (((tickAnim - 285) / 35) * (5.5-(0)));
            yy = 0 + (((tickAnim - 285) / 35) * (0-(0)));
            zz = 0 + (((tickAnim - 285) / 35) * (0-(0)));
        }
        else if (tickAnim >= 320 && tickAnim < 675) {
            xx = 5.5 + (((tickAnim - 320) / 355) * (5.5-(5.5)));
            yy = 0 + (((tickAnim - 320) / 355) * (0-(0)));
            zz = 0 + (((tickAnim - 320) / 355) * (0-(0)));
        }
        else if (tickAnim >= 675 && tickAnim < 678) {
            xx = 5.5 + (((tickAnim - 675) / 3) * (5.5-(5.5)));
            yy = 0 + (((tickAnim - 675) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 675) / 3) * (0-(0)));
        }
        else if (tickAnim >= 678 && tickAnim < 681) {
            xx = 5.5 + (((tickAnim - 678) / 3) * (37.25-(5.5)));
            yy = 0 + (((tickAnim - 678) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 678) / 3) * (0-(0)));
        }
        else if (tickAnim >= 681 && tickAnim < 690) {
            xx = 37.25 + (((tickAnim - 681) / 9) * (0-(37.25)));
            yy = 0 + (((tickAnim - 681) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 681) / 9) * (0-(0)));
        }
        else if (tickAnim >= 690 && tickAnim < 715) {
            xx = 0 + (((tickAnim - 690) / 25) * (-7.25-(0)));
            yy = 0 + (((tickAnim - 690) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 690) / 25) * (0-(0)));
        }
        else if (tickAnim >= 715 && tickAnim < 727) {
            xx = -7.25 + (((tickAnim - 715) / 12) * (49.95-(-7.25)));
            yy = 0 + (((tickAnim - 715) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 715) / 12) * (0-(0)));
        }
        else if (tickAnim >= 727 && tickAnim < 739) {
            xx = 49.95 + (((tickAnim - 727) / 12) * (0-(49.95)));
            yy = 0 + (((tickAnim - 727) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 727) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg2, leftLeg2.rotateAngleX + (float) Math.toRadians(xx), leftLeg2.rotateAngleY + (float) Math.toRadians(yy), leftLeg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 27) {
            xx = 0 + (((tickAnim - 0) / 27) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 27) * (0.775-(0)));
            zz = 0 + (((tickAnim - 0) / 27) * (-0.85-(0)));
        }
        else if (tickAnim >= 27 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 27) / 13) * (0-(0)));
            yy = 0.775 + (((tickAnim - 27) / 13) * (0-(0.775)));
            zz = -0.85 + (((tickAnim - 27) / 13) * (0-(-0.85)));
        }
        else if (tickAnim >= 40 && tickAnim < 285) {
            xx = 0 + (((tickAnim - 40) / 245) * (0-(0)));
            yy = 0 + (((tickAnim - 40) / 245) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 245) * (0-(0)));
        }
        else if (tickAnim >= 285 && tickAnim < 675) {
            xx = 0 + (((tickAnim - 285) / 390) * (0-(0)));
            yy = 0 + (((tickAnim - 285) / 390) * (0-(0)));
            zz = 0 + (((tickAnim - 285) / 390) * (0-(0)));
        }
        else if (tickAnim >= 675 && tickAnim < 678) {
            xx = 0 + (((tickAnim - 675) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 675) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 675) / 3) * (0-(0)));
        }
        else if (tickAnim >= 678 && tickAnim < 681) {
            xx = 0 + (((tickAnim - 678) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 678) / 3) * (0.9-(0)));
            zz = 0 + (((tickAnim - 678) / 3) * (-1.475-(0)));
        }
        else if (tickAnim >= 681 && tickAnim < 690) {
            xx = 0 + (((tickAnim - 681) / 9) * (0-(0)));
            yy = 0.9 + (((tickAnim - 681) / 9) * (0-(0.9)));
            zz = -1.475 + (((tickAnim - 681) / 9) * (0-(-1.475)));
        }
        else if (tickAnim >= 690 && tickAnim < 715) {
            xx = 0 + (((tickAnim - 690) / 25) * (0-(0)));
            yy = 0 + (((tickAnim - 690) / 25) * (-0.775-(0)));
            zz = 0 + (((tickAnim - 690) / 25) * (0-(0)));
        }
        else if (tickAnim >= 715 && tickAnim < 727) {
            xx = 0 + (((tickAnim - 715) / 12) * (0-(0)));
            yy = -0.775 + (((tickAnim - 715) / 12) * (0.69-(-0.775)));
            zz = 0 + (((tickAnim - 715) / 12) * (-1.35-(0)));
        }
        else if (tickAnim >= 727 && tickAnim < 739) {
            xx = 0 + (((tickAnim - 727) / 12) * (0-(0)));
            yy = 0.69 + (((tickAnim - 727) / 12) * (0-(0.69)));
            zz = -1.35 + (((tickAnim - 727) / 12) * (0-(-1.35)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftLeg2.rotationPointX = this.leftLeg2.rotationPointX + (float)(xx);
        this.leftLeg2.rotationPointY = this.leftLeg2.rotationPointY - (float)(yy);
        this.leftLeg2.rotationPointZ = this.leftLeg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 27) {
            xx = 0 + (((tickAnim - 0) / 27) * (-3.25-(0)));
            yy = 0 + (((tickAnim - 0) / 27) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 27) * (0-(0)));
        }
        else if (tickAnim >= 27 && tickAnim < 40) {
            xx = -3.25 + (((tickAnim - 27) / 13) * (23-(-3.25)));
            yy = 0 + (((tickAnim - 27) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 27) / 13) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 285) {
            xx = 23 + (((tickAnim - 40) / 245) * (23-(23)));
            yy = 0 + (((tickAnim - 40) / 245) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 245) * (0-(0)));
        }
        else if (tickAnim >= 285 && tickAnim < 304) {
            xx = 23 + (((tickAnim - 285) / 19) * (10.5-(23)));
            yy = 0 + (((tickAnim - 285) / 19) * (0-(0)));
            zz = 0 + (((tickAnim - 285) / 19) * (0-(0)));
        }
        else if (tickAnim >= 304 && tickAnim < 320) {
            xx = 10.5 + (((tickAnim - 304) / 16) * (10.5-(10.5)));
            yy = 0 + (((tickAnim - 304) / 16) * (0-(0)));
            zz = 0 + (((tickAnim - 304) / 16) * (0-(0)));
        }
        else if (tickAnim >= 320 && tickAnim < 675) {
            xx = 10.5 + (((tickAnim - 320) / 355) * (10.5-(10.5)));
            yy = 0 + (((tickAnim - 320) / 355) * (0-(0)));
            zz = 0 + (((tickAnim - 320) / 355) * (0-(0)));
        }
        else if (tickAnim >= 675 && tickAnim < 678) {
            xx = 10.5 + (((tickAnim - 675) / 3) * (10.5-(10.5)));
            yy = 0 + (((tickAnim - 675) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 675) / 3) * (0-(0)));
        }
        else if (tickAnim >= 678 && tickAnim < 683) {
            xx = 10.5 + (((tickAnim - 678) / 5) * (-41.5-(10.5)));
            yy = 0 + (((tickAnim - 678) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 678) / 5) * (0-(0)));
        }
        else if (tickAnim >= 683 && tickAnim < 690) {
            xx = -41.5 + (((tickAnim - 683) / 7) * (17.5-(-41.5)));
            yy = 0 + (((tickAnim - 683) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 683) / 7) * (0-(0)));
        }
        else if (tickAnim >= 690 && tickAnim < 715) {
            xx = 17.5 + (((tickAnim - 690) / 25) * (26.75-(17.5)));
            yy = 0 + (((tickAnim - 690) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 690) / 25) * (0-(0)));
        }
        else if (tickAnim >= 715 && tickAnim < 727) {
            xx = 26.75 + (((tickAnim - 715) / 12) * (-34.49-(26.75)));
            yy = 0 + (((tickAnim - 715) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 715) / 12) * (0-(0)));
        }
        else if (tickAnim >= 727 && tickAnim < 739) {
            xx = -34.49 + (((tickAnim - 727) / 12) * (0-(-34.49)));
            yy = 0 + (((tickAnim - 727) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 727) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg3, leftLeg3.rotateAngleX + (float) Math.toRadians(xx), leftLeg3.rotateAngleY + (float) Math.toRadians(yy), leftLeg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (0.75-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 285) {
            xx = 0 + (((tickAnim - 40) / 245) * (0-(0)));
            yy = 0.75 + (((tickAnim - 40) / 245) * (0.75-(0.75)));
            zz = 0 + (((tickAnim - 40) / 245) * (0-(0)));
        }
        else if (tickAnim >= 285 && tickAnim < 320) {
            xx = 0 + (((tickAnim - 285) / 35) * (0-(0)));
            yy = 0.75 + (((tickAnim - 285) / 35) * (0-(0.75)));
            zz = 0 + (((tickAnim - 285) / 35) * (0-(0)));
        }
        else if (tickAnim >= 320 && tickAnim < 675) {
            xx = 0 + (((tickAnim - 320) / 355) * (0-(0)));
            yy = 0 + (((tickAnim - 320) / 355) * (0-(0)));
            zz = 0 + (((tickAnim - 320) / 355) * (0-(0)));
        }
        else if (tickAnim >= 675 && tickAnim < 678) {
            xx = 0 + (((tickAnim - 675) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 675) / 3) * (-0.825-(0)));
            zz = 0 + (((tickAnim - 675) / 3) * (0-(0)));
        }
        else if (tickAnim >= 678 && tickAnim < 683) {
            xx = 0 + (((tickAnim - 678) / 5) * (0-(0)));
            yy = -0.825 + (((tickAnim - 678) / 5) * (-0.345-(-0.825)));
            zz = 0 + (((tickAnim - 678) / 5) * (0.975-(0)));
        }
        else if (tickAnim >= 683 && tickAnim < 688) {
            xx = 0 + (((tickAnim - 683) / 5) * (0-(0)));
            yy = -0.345 + (((tickAnim - 683) / 5) * (0.39-(-0.345)));
            zz = 0.975 + (((tickAnim - 683) / 5) * (-0.12-(0.975)));
        }
        else if (tickAnim >= 688 && tickAnim < 690) {
            xx = 0 + (((tickAnim - 688) / 2) * (0-(0)));
            yy = 0.39 + (((tickAnim - 688) / 2) * (0-(0.39)));
            zz = -0.12 + (((tickAnim - 688) / 2) * (0-(-0.12)));
        }
        else if (tickAnim >= 690 && tickAnim < 715) {
            xx = 0 + (((tickAnim - 690) / 25) * (0-(0)));
            yy = 0 + (((tickAnim - 690) / 25) * (-1.35-(0)));
            zz = 0 + (((tickAnim - 690) / 25) * (0-(0)));
        }
        else if (tickAnim >= 715 && tickAnim < 727) {
            xx = 0 + (((tickAnim - 715) / 12) * (0-(0)));
            yy = -1.35 + (((tickAnim - 715) / 12) * (-0.31-(-1.35)));
            zz = 0 + (((tickAnim - 715) / 12) * (1.275-(0)));
        }
        else if (tickAnim >= 727 && tickAnim < 739) {
            xx = 0 + (((tickAnim - 727) / 12) * (0-(0)));
            yy = -0.31 + (((tickAnim - 727) / 12) * (0-(-0.31)));
            zz = 1.275 + (((tickAnim - 727) / 12) * (0-(1.275)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftLeg3.rotationPointX = this.leftLeg3.rotationPointX + (float)(xx);
        this.leftLeg3.rotationPointY = this.leftLeg3.rotationPointY - (float)(yy);
        this.leftLeg3.rotationPointZ = this.leftLeg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (3-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 138) {
            xx = 3 + (((tickAnim - 40) / 98) * (3-(3)));
            yy = 0 + (((tickAnim - 40) / 98) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 98) * (0-(0)));
        }
        else if (tickAnim >= 138 && tickAnim < 283) {
            xx = 3 + (((tickAnim - 138) / 145) * (5.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*60))*1-(3)));
            yy = 0 + (((tickAnim - 138) / 145) * (0-(0)));
            zz = 0 + (((tickAnim - 138) / 145) * (0-(0)));
        }
        else if (tickAnim >= 283 && tickAnim < 320) {
            xx = 5.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*60))*1 + (((tickAnim - 283) / 37) * (14.85-(5.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*60))*1)));
            yy = 0 + (((tickAnim - 283) / 37) * (0-(0)));
            zz = 0 + (((tickAnim - 283) / 37) * (0-(0)));
        }
        else if (tickAnim >= 320 && tickAnim < 651) {
            xx = 14.85 + (((tickAnim - 320) / 331) * (15.5-(14.85)));
            yy = 0 + (((tickAnim - 320) / 331) * (0-(0)));
            zz = 0 + (((tickAnim - 320) / 331) * (0-(0)));
        }
        else if (tickAnim >= 651 && tickAnim < 675) {
            xx = 15.5 + (((tickAnim - 651) / 24) * (13.75-(15.5)));
            yy = 0 + (((tickAnim - 651) / 24) * (0-(0)));
            zz = 0 + (((tickAnim - 651) / 24) * (0-(0)));
        }
        else if (tickAnim >= 675 && tickAnim < 683) {
            xx = 13.75 + (((tickAnim - 675) / 8) * (4.87-(13.75)));
            yy = 0 + (((tickAnim - 675) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 675) / 8) * (0-(0)));
        }
        else if (tickAnim >= 683 && tickAnim < 686) {
            xx = 4.87 + (((tickAnim - 683) / 3) * (0-(4.87)));
            yy = 0 + (((tickAnim - 683) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 683) / 3) * (0-(0)));
        }
        else if (tickAnim >= 686 && tickAnim < 690) {
            xx = 0 + (((tickAnim - 686) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 686) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 686) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail1, tail1.rotateAngleX + (float) Math.toRadians(xx), tail1.rotateAngleY + (float) Math.toRadians(yy), tail1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (5.75-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 138) {
            xx = 5.75 + (((tickAnim - 40) / 98) * (5.75-(5.75)));
            yy = 0 + (((tickAnim - 40) / 98) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 98) * (0-(0)));
        }
        else if (tickAnim >= 138 && tickAnim < 283) {
            xx = 5.75 + (((tickAnim - 138) / 145) * (10.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*60-20))*1-(5.75)));
            yy = 0 + (((tickAnim - 138) / 145) * (0-(0)));
            zz = 0 + (((tickAnim - 138) / 145) * (0-(0)));
        }
        else if (tickAnim >= 283 && tickAnim < 341) {
            xx = 10.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*60-20))*1 + (((tickAnim - 283) / 58) * (10-(10.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*60-20))*1)));
            yy = 0 + (((tickAnim - 283) / 58) * (0-(0)));
            zz = 0 + (((tickAnim - 283) / 58) * (0-(0)));
        }
        else if (tickAnim >= 341 && tickAnim < 651) {
            xx = 10 + (((tickAnim - 341) / 310) * (11.75-(10)));
            yy = 0 + (((tickAnim - 341) / 310) * (0-(0)));
            zz = 0 + (((tickAnim - 341) / 310) * (0-(0)));
        }
        else if (tickAnim >= 651 && tickAnim < 675) {
            xx = 11.75 + (((tickAnim - 651) / 24) * (9.25-(11.75)));
            yy = 0 + (((tickAnim - 651) / 24) * (0-(0)));
            zz = 0 + (((tickAnim - 651) / 24) * (0-(0)));
        }
        else if (tickAnim >= 675 && tickAnim < 680) {
            xx = 9.25 + (((tickAnim - 675) / 5) * (11.55-(9.25)));
            yy = 0 + (((tickAnim - 675) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 675) / 5) * (0-(0)));
        }
        else if (tickAnim >= 680 && tickAnim < 686) {
            xx = 11.55 + (((tickAnim - 680) / 6) * (0-(11.55)));
            yy = 0 + (((tickAnim - 680) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 680) / 6) * (0-(0)));
        }
        else if (tickAnim >= 686 && tickAnim < 690) {
            xx = 0 + (((tickAnim - 686) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 686) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 686) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(xx), tail2.rotateAngleY + (float) Math.toRadians(yy), tail2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (7-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 138) {
            xx = 7 + (((tickAnim - 40) / 98) * (7-(7)));
            yy = 0 + (((tickAnim - 40) / 98) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 98) * (0-(0)));
        }
        else if (tickAnim >= 138 && tickAnim < 283) {
            xx = 7 + (((tickAnim - 138) / 145) * (4.75+Math.sin((Math.PI/180)*(((double)tickAnim/20)*60-40))*1-(7)));
            yy = 0 + (((tickAnim - 138) / 145) * (0-(0)));
            zz = 0 + (((tickAnim - 138) / 145) * (0-(0)));
        }
        else if (tickAnim >= 283 && tickAnim < 341) {
            xx = 4.75+Math.sin((Math.PI/180)*(((double)tickAnim/20)*60-40))*1 + (((tickAnim - 283) / 58) * (0-(4.75+Math.sin((Math.PI/180)*(((double)tickAnim/20)*60-40))*1)));
            yy = 0 + (((tickAnim - 283) / 58) * (0-(0)));
            zz = 0 + (((tickAnim - 283) / 58) * (0-(0)));
        }
        else if (tickAnim >= 341 && tickAnim < 651) {
            xx = 0 + (((tickAnim - 341) / 310) * (-3-(0)));
            yy = 0 + (((tickAnim - 341) / 310) * (0-(0)));
            zz = 0 + (((tickAnim - 341) / 310) * (0-(0)));
        }
        else if (tickAnim >= 651 && tickAnim < 675) {
            xx = -3 + (((tickAnim - 651) / 24) * (-1.75-(-3)));
            yy = 0 + (((tickAnim - 651) / 24) * (0-(0)));
            zz = 0 + (((tickAnim - 651) / 24) * (0-(0)));
        }
        else if (tickAnim >= 675 && tickAnim < 683) {
            xx = -1.75 + (((tickAnim - 675) / 8) * (8.65-(-1.75)));
            yy = 0 + (((tickAnim - 675) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 675) / 8) * (0-(0)));
        }
        else if (tickAnim >= 683 && tickAnim < 686) {
            xx = 8.65 + (((tickAnim - 683) / 3) * (0-(8.65)));
            yy = 0 + (((tickAnim - 683) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 683) / 3) * (0-(0)));
        }
        else if (tickAnim >= 686 && tickAnim < 690) {
            xx = 0 + (((tickAnim - 686) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 686) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 686) / 4) * (0-(0)));
        }
        else if (tickAnim >= 690 && tickAnim < 700) {
            xx = 0 + (((tickAnim - 690) / 10) * (-6.75-(0)));
            yy = 0 + (((tickAnim - 690) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 690) / 10) * (0-(0)));
        }
        else if (tickAnim >= 700 && tickAnim < 739) {
            xx = -6.75 + (((tickAnim - 700) / 39) * (0-(-6.75)));
            yy = 0 + (((tickAnim - 700) / 39) * (0-(0)));
            zz = 0 + (((tickAnim - 700) / 39) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(xx), tail3.rotateAngleY + (float) Math.toRadians(yy), tail3.rotateAngleZ + (float) Math.toRadians(zz));

        this.tail3.rotationPointX = this.tail3.rotationPointX + (float)(0);
        this.tail3.rotationPointY = this.tail3.rotationPointY - (float)(0);
        this.tail3.rotationPointZ = this.tail3.rotationPointZ + (float)(0);



        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (4.75-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 138) {
            xx = 4.75 + (((tickAnim - 40) / 98) * (4.75-(4.75)));
            yy = 0 + (((tickAnim - 40) / 98) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 98) * (0-(0)));
        }
        else if (tickAnim >= 138 && tickAnim < 283) {
            xx = 4.75 + (((tickAnim - 138) / 145) * (-1.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*60-60))*1-(4.75)));
            yy = 0 + (((tickAnim - 138) / 145) * (0-(0)));
            zz = 0 + (((tickAnim - 138) / 145) * (0-(0)));
        }
        else if (tickAnim >= 283 && tickAnim < 341) {
            xx = -1.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*60-60))*1 + (((tickAnim - 283) / 58) * (-11-(-1.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*60-60))*1)));
            yy = 0 + (((tickAnim - 283) / 58) * (0-(0)));
            zz = 0 + (((tickAnim - 283) / 58) * (0-(0)));
        }
        else if (tickAnim >= 341 && tickAnim < 651) {
            xx = -11 + (((tickAnim - 341) / 310) * (-0.5-(-11)));
            yy = 0 + (((tickAnim - 341) / 310) * (0-(0)));
            zz = 0 + (((tickAnim - 341) / 310) * (0-(0)));
        }
        else if (tickAnim >= 651 && tickAnim < 675) {
            xx = -0.5 + (((tickAnim - 651) / 24) * (1.75-(-0.5)));
            yy = 0 + (((tickAnim - 651) / 24) * (0-(0)));
            zz = 0 + (((tickAnim - 651) / 24) * (0-(0)));
        }
        else if (tickAnim >= 675 && tickAnim < 680) {
            xx = 1.75 + (((tickAnim - 675) / 5) * (-7.79-(1.75)));
            yy = 0 + (((tickAnim - 675) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 675) / 5) * (0-(0)));
        }
        else if (tickAnim >= 680 && tickAnim < 686) {
            xx = -7.79 + (((tickAnim - 680) / 6) * (10.85-(-7.79)));
            yy = 0 + (((tickAnim - 680) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 680) / 6) * (0-(0)));
        }
        else if (tickAnim >= 686 && tickAnim < 690) {
            xx = 10.85 + (((tickAnim - 686) / 4) * (0-(10.85)));
            yy = 0 + (((tickAnim - 686) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 686) / 4) * (0-(0)));
        }
        else if (tickAnim >= 690 && tickAnim < 700) {
            xx = 0 + (((tickAnim - 690) / 10) * (-8-(0)));
            yy = 0 + (((tickAnim - 690) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 690) / 10) * (0-(0)));
        }
        else if (tickAnim >= 700 && tickAnim < 739) {
            xx = -8 + (((tickAnim - 700) / 39) * (0-(-8)));
            yy = 0 + (((tickAnim - 700) / 39) * (0-(0)));
            zz = 0 + (((tickAnim - 700) / 39) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(xx), tail4.rotateAngleY + (float) Math.toRadians(yy), tail4.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (0.225-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 138) {
            xx = 0 + (((tickAnim - 40) / 98) * (0-(0)));
            yy = 0.225 + (((tickAnim - 40) / 98) * (0.225-(0.225)));
            zz = 0 + (((tickAnim - 40) / 98) * (0-(0)));
        }
        else if (tickAnim >= 138 && tickAnim < 283) {
            xx = 0 + (((tickAnim - 138) / 145) * (0-(0)));
            yy = 0.225 + (((tickAnim - 138) / 145) * (0-(0.225)));
            zz = 0 + (((tickAnim - 138) / 145) * (0-(0)));
        }
        else if (tickAnim >= 283 && tickAnim < 341) {
            xx = 0 + (((tickAnim - 283) / 58) * (0-(0)));
            yy = 0 + (((tickAnim - 283) / 58) * (-0.1-(0)));
            zz = 0 + (((tickAnim - 283) / 58) * (0-(0)));
        }
        else if (tickAnim >= 341 && tickAnim < 651) {
            xx = 0 + (((tickAnim - 341) / 310) * (0-(0)));
            yy = -0.1 + (((tickAnim - 341) / 310) * (0-(-0.1)));
            zz = 0 + (((tickAnim - 341) / 310) * (0-(0)));
        }
        else if (tickAnim >= 651 && tickAnim < 675) {
            xx = 0 + (((tickAnim - 651) / 24) * (0-(0)));
            yy = 0 + (((tickAnim - 651) / 24) * (0-(0)));
            zz = 0 + (((tickAnim - 651) / 24) * (0-(0)));
        }
        else if (tickAnim >= 675 && tickAnim < 680) {
            xx = 0 + (((tickAnim - 675) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 675) / 5) * (-0.03-(0)));
            zz = 0 + (((tickAnim - 675) / 5) * (0-(0)));
        }
        else if (tickAnim >= 680 && tickAnim < 686) {
            xx = 0 + (((tickAnim - 680) / 6) * (0-(0)));
            yy = -0.03 + (((tickAnim - 680) / 6) * (0.125-(-0.03)));
            zz = 0 + (((tickAnim - 680) / 6) * (0-(0)));
        }
        else if (tickAnim >= 686 && tickAnim < 700) {
            xx = 0 + (((tickAnim - 686) / 14) * (0-(0)));
            yy = 0.125 + (((tickAnim - 686) / 14) * (-0.11-(0.125)));
            zz = 0 + (((tickAnim - 686) / 14) * (0-(0)));
        }
        else if (tickAnim >= 700 && tickAnim < 739) {
            xx = 0 + (((tickAnim - 700) / 39) * (0-(0)));
            yy = -0.11 + (((tickAnim - 700) / 39) * (0-(-0.11)));
            zz = 0 + (((tickAnim - 700) / 39) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.tail4.rotationPointX = this.tail4.rotationPointX + (float)(xx);
        this.tail4.rotationPointY = this.tail4.rotationPointY - (float)(yy);
        this.tail4.rotationPointZ = this.tail4.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (-10.5-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 138) {
            xx = -10.5 + (((tickAnim - 40) / 98) * (-10.5-(-10.5)));
            yy = 0 + (((tickAnim - 40) / 98) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 98) * (0-(0)));
        }
        else if (tickAnim >= 138 && tickAnim < 341) {
            xx = -10.5 + (((tickAnim - 138) / 203) * (-9.85-(-10.5)));
            yy = 0 + (((tickAnim - 138) / 203) * (0-(0)));
            zz = 0 + (((tickAnim - 138) / 203) * (0-(0)));
        }
        else if (tickAnim >= 341 && tickAnim < 651) {
            xx = -9.85 + (((tickAnim - 341) / 310) * (0-(-9.85)));
            yy = 0 + (((tickAnim - 341) / 310) * (0-(0)));
            zz = 0 + (((tickAnim - 341) / 310) * (0-(0)));
        }
        else if (tickAnim >= 651 && tickAnim < 675) {
            xx = 0 + (((tickAnim - 651) / 24) * (9.25-(0)));
            yy = 0 + (((tickAnim - 651) / 24) * (0-(0)));
            zz = 0 + (((tickAnim - 651) / 24) * (0-(0)));
        }
        else if (tickAnim >= 675 && tickAnim < 680) {
            xx = 9.25 + (((tickAnim - 675) / 5) * (-3.04-(9.25)));
            yy = 0 + (((tickAnim - 675) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 675) / 5) * (0-(0)));
        }
        else if (tickAnim >= 680 && tickAnim < 686) {
            xx = -3.04 + (((tickAnim - 680) / 6) * (17.05-(-3.04)));
            yy = 0 + (((tickAnim - 680) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 680) / 6) * (0-(0)));
        }
        else if (tickAnim >= 686 && tickAnim < 690) {
            xx = 17.05 + (((tickAnim - 686) / 4) * (0-(17.05)));
            yy = 0 + (((tickAnim - 686) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 686) / 4) * (0-(0)));
        }
        else if (tickAnim >= 690 && tickAnim < 700) {
            xx = 0 + (((tickAnim - 690) / 10) * (-10-(0)));
            yy = 0 + (((tickAnim - 690) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 690) / 10) * (0-(0)));
        }
        else if (tickAnim >= 700 && tickAnim < 739) {
            xx = -10 + (((tickAnim - 700) / 39) * (0-(-10)));
            yy = 0 + (((tickAnim - 700) / 39) * (0-(0)));
            zz = 0 + (((tickAnim - 700) / 39) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail5, tail5.rotateAngleX + (float) Math.toRadians(xx), tail5.rotateAngleY + (float) Math.toRadians(yy), tail5.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (-0.175-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 138) {
            xx = 0 + (((tickAnim - 40) / 98) * (0-(0)));
            yy = -0.175 + (((tickAnim - 40) / 98) * (-0.175-(-0.175)));
            zz = 0 + (((tickAnim - 40) / 98) * (0-(0)));
        }
        else if (tickAnim >= 138 && tickAnim < 675) {
            xx = 0 + (((tickAnim - 138) / 537) * (0-(0)));
            yy = -0.175 + (((tickAnim - 138) / 537) * (0-(-0.175)));
            zz = 0 + (((tickAnim - 138) / 537) * (0-(0)));
        }
        else if (tickAnim >= 675 && tickAnim < 680) {
            xx = 0 + (((tickAnim - 675) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 675) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 675) / 5) * (-0.35-(0)));
        }
        else if (tickAnim >= 680 && tickAnim < 700) {
            xx = 0 + (((tickAnim - 680) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 680) / 20) * (-0.2-(0)));
            zz = -0.35 + (((tickAnim - 680) / 20) * (0-(-0.35)));
        }
        else if (tickAnim >= 700 && tickAnim < 739) {
            xx = 0 + (((tickAnim - 700) / 39) * (0-(0)));
            yy = -0.2 + (((tickAnim - 700) / 39) * (0-(-0.2)));
            zz = 0 + (((tickAnim - 700) / 39) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.tail5.rotationPointX = this.tail5.rotationPointX + (float)(xx);
        this.tail5.rotationPointY = this.tail5.rotationPointY - (float)(yy);
        this.tail5.rotationPointZ = this.tail5.rotationPointZ + (float)(zz);



        this.setRotateAngle(tail6, tail6.rotateAngleX + (float) Math.toRadians(0), tail6.rotateAngleY + (float) Math.toRadians(0), tail6.rotateAngleZ + (float) Math.toRadians(0));



        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (1.9005125532+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+30))*0.5-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (-0.61723-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (-0.0952-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 109) {
            xx = 1.9005125532+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+30))*0.5 + (((tickAnim - 40) / 69) * (1.9005125532+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+30))*0.5-(1.9005125532+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+30))*0.5)));
            yy = -0.61723 + (((tickAnim - 40) / 69) * (-0.61723-(-0.61723)));
            zz = -0.0952 + (((tickAnim - 40) / 69) * (-0.0952-(-0.0952)));
        }
        else if (tickAnim >= 109 && tickAnim < 259) {
            xx = 1.9005125532+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+30))*0.5 + (((tickAnim - 109) / 150) * (1.9005125532+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+30))*0.5-(1.9005125532+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+30))*0.5)));
            yy = -0.61723 + (((tickAnim - 109) / 150) * (-0.61723-(-0.61723)));
            zz = -0.0952 + (((tickAnim - 109) / 150) * (-0.0952-(-0.0952)));
        }
        else if (tickAnim >= 259 && tickAnim < 285) {
            xx = 1.9005125532+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+30))*0.5 + (((tickAnim - 259) / 26) * (1.9005125532+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+30))*0.5-(1.9005125532+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+30))*0.5)));
            yy = -0.61723 + (((tickAnim - 259) / 26) * (-0.61723-(-0.61723)));
            zz = -0.0952 + (((tickAnim - 259) / 26) * (-0.0952-(-0.0952)));
        }
        else if (tickAnim >= 285 && tickAnim < 320) {
            xx = 1.9005125532+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+30))*0.5 + (((tickAnim - 285) / 35) * (7.6505+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+30))*0.5-(1.9005125532+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+30))*0.5)));
            yy = -0.61723 + (((tickAnim - 285) / 35) * (-0.61723-(-0.61723)));
            zz = -0.0952 + (((tickAnim - 285) / 35) * (-0.0952-(-0.0952)));
        }
        else if (tickAnim >= 320 && tickAnim < 340) {
            xx = 7.6505+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+30))*0.5 + (((tickAnim - 320) / 20) * (5.4005+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+30))*0.2-(7.6505+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+30))*0.5)));
            yy = -0.61723 + (((tickAnim - 320) / 20) * (-0.61723-(-0.61723)));
            zz = -0.0952 + (((tickAnim - 320) / 20) * (-0.0952-(-0.0952)));
        }
        else if (tickAnim >= 340 && tickAnim < 580) {
            xx = 5.4005+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+30))*0.2 + (((tickAnim - 340) / 240) * (5.9005+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+30))*0.2-(5.4005+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+30))*0.2)));
            yy = -0.61723 + (((tickAnim - 340) / 240) * (-0.61723-(-0.61723)));
            zz = -0.0952 + (((tickAnim - 340) / 240) * (-0.0952-(-0.0952)));
        }
        else if (tickAnim >= 580 && tickAnim < 675) {
            xx = 5.9005+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+30))*0.2 + (((tickAnim - 580) / 95) * (8.4005+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+30))*0.5-(5.9005+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+30))*0.2)));
            yy = -0.61723 + (((tickAnim - 580) / 95) * (-0.61723-(-0.61723)));
            zz = -0.0952 + (((tickAnim - 580) / 95) * (-0.0952-(-0.0952)));
        }
        else if (tickAnim >= 675 && tickAnim < 679) {
            xx = 8.4005+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+30))*0.5 + (((tickAnim - 675) / 4) * (11.87277-(8.4005+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+30))*0.5)));
            yy = -0.61723 + (((tickAnim - 675) / 4) * (-0.36005-(-0.61723)));
            zz = -0.0952 + (((tickAnim - 675) / 4) * (-0.05553-(-0.0952)));
        }
        else if (tickAnim >= 679 && tickAnim < 685) {
            xx = 11.87277 + (((tickAnim - 679) / 6) * (0-(11.87277)));
            yy = -0.36005 + (((tickAnim - 679) / 6) * (0-(-0.36005)));
            zz = -0.05553 + (((tickAnim - 679) / 6) * (0-(-0.05553)));
        }
        else if (tickAnim >= 685 && tickAnim < 715) {
            xx = 0 + (((tickAnim - 685) / 30) * (0-(0)));
            yy = 0 + (((tickAnim - 685) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 685) / 30) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(xx), body.rotateAngleY + (float) Math.toRadians(yy), body.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (-2-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 320) {
            xx = -2 + (((tickAnim - 40) / 280) * (-3.25-(-2)));
            yy = 0 + (((tickAnim - 40) / 280) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 280) * (0-(0)));
        }
        else if (tickAnim >= 320 && tickAnim < 340) {
            xx = -3.25 + (((tickAnim - 320) / 20) * (-2-(-3.25)));
            yy = 0 + (((tickAnim - 320) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 320) / 20) * (0-(0)));
        }
        else if (tickAnim >= 340 && tickAnim < 675) {
            xx = -2 + (((tickAnim - 340) / 335) * (-2-(-2)));
            yy = 0 + (((tickAnim - 340) / 335) * (0-(0)));
            zz = 0 + (((tickAnim - 340) / 335) * (0-(0)));
        }
        else if (tickAnim >= 675 && tickAnim < 679) {
            xx = -2 + (((tickAnim - 675) / 4) * (-5.25-(-2)));
            yy = 0 + (((tickAnim - 675) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 675) / 4) * (0-(0)));
        }
        else if (tickAnim >= 679 && tickAnim < 685) {
            xx = -5.25 + (((tickAnim - 679) / 6) * (0-(-5.25)));
            yy = 0 + (((tickAnim - 679) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 679) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(sailMiddle, sailMiddle.rotateAngleX + (float) Math.toRadians(xx), sailMiddle.rotateAngleY + (float) Math.toRadians(yy), sailMiddle.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (0.8-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0.05-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 285) {
            xx = 0 + (((tickAnim - 40) / 245) * (0-(0)));
            yy = 0.8 + (((tickAnim - 40) / 245) * (0.8-(0.8)));
            zz = 0.05 + (((tickAnim - 40) / 245) * (0.05-(0.05)));
        }
        else if (tickAnim >= 285 && tickAnim < 320) {
            xx = 0 + (((tickAnim - 285) / 35) * (0-(0)));
            yy = 0.8 + (((tickAnim - 285) / 35) * (1.325-(0.8)));
            zz = 0.05 + (((tickAnim - 285) / 35) * (2.8-(0.05)));
        }
        else if (tickAnim >= 320 && tickAnim < 340) {
            xx = 0 + (((tickAnim - 320) / 20) * (0-(0)));
            yy = 1.325 + (((tickAnim - 320) / 20) * (0.9-(1.325)));
            zz = 2.8 + (((tickAnim - 320) / 20) * (2.025-(2.8)));
        }
        else if (tickAnim >= 340 && tickAnim < 675) {
            xx = 0 + (((tickAnim - 340) / 335) * (0-(0)));
            yy = 0.9 + (((tickAnim - 340) / 335) * (0.9-(0.9)));
            zz = 2.025 + (((tickAnim - 340) / 335) * (3.45-(2.025)));
        }
        else if (tickAnim >= 675 && tickAnim < 679) {
            xx = 0 + (((tickAnim - 675) / 4) * (0-(0)));
            yy = 0.9 + (((tickAnim - 675) / 4) * (1.8-(0.9)));
            zz = 3.45 + (((tickAnim - 675) / 4) * (4.125-(3.45)));
        }
        else if (tickAnim >= 679 && tickAnim < 685) {
            xx = 0 + (((tickAnim - 679) / 6) * (0-(0)));
            yy = 1.8 + (((tickAnim - 679) / 6) * (0-(1.8)));
            zz = 4.125 + (((tickAnim - 679) / 6) * (0-(4.125)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.sailMiddle.rotationPointX = this.sailMiddle.rotationPointX + (float)(xx);
        this.sailMiddle.rotationPointY = this.sailMiddle.rotationPointY - (float)(yy);
        this.sailMiddle.rotationPointZ = this.sailMiddle.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (6+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+120))*1-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 109) {
            xx = 6+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+120))*1 + (((tickAnim - 40) / 69) * (6+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+120))*1-(6+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+120))*1)));
            yy = 0 + (((tickAnim - 40) / 69) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 69) * (0-(0)));
        }
        else if (tickAnim >= 109 && tickAnim < 259) {
            xx = 6+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+120))*1 + (((tickAnim - 109) / 150) * (6+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+120))*1-(6+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+120))*1)));
            yy = 0 + (((tickAnim - 109) / 150) * (0-(0)));
            zz = 0 + (((tickAnim - 109) / 150) * (0-(0)));
        }
        else if (tickAnim >= 259 && tickAnim < 285) {
            xx = 6+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+120))*1 + (((tickAnim - 259) / 26) * (6+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+120))*1-(6+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+120))*1)));
            yy = 0 + (((tickAnim - 259) / 26) * (0-(0)));
            zz = 0 + (((tickAnim - 259) / 26) * (0-(0)));
        }
        else if (tickAnim >= 285 && tickAnim < 320) {
            xx = 6+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+120))*1 + (((tickAnim - 285) / 35) * (0.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+120))*1-(6+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+120))*1)));
            yy = 0 + (((tickAnim - 285) / 35) * (0-(0)));
            zz = 0 + (((tickAnim - 285) / 35) * (0-(0)));
        }
        else if (tickAnim >= 320 && tickAnim < 340) {
            xx = 0.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+120))*1 + (((tickAnim - 320) / 20) * (6+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+50))*-0.2-(0.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+120))*1)));
            yy = 0 + (((tickAnim - 320) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 320) / 20) * (0-(0)));
        }
        else if (tickAnim >= 340 && tickAnim < 580) {
            xx = 6+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+50))*-0.2 + (((tickAnim - 340) / 240) * (7+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+50))*-0.5-(6+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+50))*-0.2)));
            yy = 0 + (((tickAnim - 340) / 240) * (0-(0)));
            zz = 0 + (((tickAnim - 340) / 240) * (0-(0)));
        }
        else if (tickAnim >= 580 && tickAnim < 675) {
            xx = 7+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+50))*-0.5 + (((tickAnim - 580) / 95) * (5.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+50))*-0.5-(7+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+50))*-0.5)));
            yy = 0 + (((tickAnim - 580) / 95) * (0-(0)));
            zz = 0 + (((tickAnim - 580) / 95) * (0-(0)));
        }
        else if (tickAnim >= 675 && tickAnim < 679) {
            xx = 5.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+50))*-0.5 + (((tickAnim - 675) / 4) * (-4.96-(5.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+50))*-0.5)));
            yy = 0 + (((tickAnim - 675) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 675) / 4) * (0-(0)));
        }
        else if (tickAnim >= 679 && tickAnim < 685) {
            xx = -4.96 + (((tickAnim - 679) / 6) * (0-(-4.96)));
            yy = 0 + (((tickAnim - 679) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 679) / 6) * (0-(0)));
        }
        else if (tickAnim >= 685 && tickAnim < 715) {
            xx = 0 + (((tickAnim - 685) / 30) * (0-(0)));
            yy = 0 + (((tickAnim - 685) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 685) / 30) * (0-(0)));
        }
        else if (tickAnim >= 715 && tickAnim < 739) {
            xx = 0 + (((tickAnim - 715) / 24) * (0-(0)));
            yy = 0 + (((tickAnim - 715) / 24) * (0-(0)));
            zz = 0 + (((tickAnim - 715) / 24) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(xx), chest.rotateAngleY + (float) Math.toRadians(yy), chest.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0.65-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 739) {
            xx = 0 + (((tickAnim - 40) / 699) * (0-(0)));
            yy = 0 + (((tickAnim - 40) / 699) * (0-(0)));
            zz = 0.65 + (((tickAnim - 40) / 699) * (0-(0.65)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.chest.rotationPointX = this.chest.rotationPointX + (float)(xx);
        this.chest.rotationPointY = this.chest.rotationPointY - (float)(yy);
        this.chest.rotationPointZ = this.chest.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 39) {
            xx = 0 + (((tickAnim - 0) / 39) * (-7.25-(0)));
            yy = 0 + (((tickAnim - 0) / 39) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 39) * (0-(0)));
        }
        else if (tickAnim >= 39 && tickAnim < 40) {
            xx = -7.25 + (((tickAnim - 39) / 1) * (-7.925+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+120))*-1-(-7.25)));
            yy = 0 + (((tickAnim - 39) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 39) / 1) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 320) {
            xx = -7.925+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+120))*-1 + (((tickAnim - 40) / 280) * (-5.925+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+120))*-1-(-7.925+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+120))*-1)));
            yy = 0 + (((tickAnim - 40) / 280) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 280) * (0-(0)));
        }
        else if (tickAnim >= 320 && tickAnim < 340) {
            xx = -5.925+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+120))*-1 + (((tickAnim - 320) / 20) * (-10.425+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+120))*-1-(-5.925+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+120))*-1)));
            yy = 0 + (((tickAnim - 320) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 320) / 20) * (0-(0)));
        }
        else if (tickAnim >= 340 && tickAnim < 675) {
            xx = -10.425+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+120))*-1 + (((tickAnim - 340) / 335) * (-14.925+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+120))*-1-(-10.425+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+120))*-1)));
            yy = 0 + (((tickAnim - 340) / 335) * (0-(0)));
            zz = 0 + (((tickAnim - 340) / 335) * (0-(0)));
        }
        else if (tickAnim >= 675 && tickAnim < 679) {
            xx = -14.925+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+120))*-1 + (((tickAnim - 675) / 4) * (-3.5-(-14.925+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+120))*-1)));
            yy = 0 + (((tickAnim - 675) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 675) / 4) * (0-(0)));
        }
        else if (tickAnim >= 679 && tickAnim < 685) {
            xx = -3.5 + (((tickAnim - 679) / 6) * (0-(-3.5)));
            yy = 0 + (((tickAnim - 679) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 679) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(sailFront, sailFront.rotateAngleX + (float) Math.toRadians(xx), sailFront.rotateAngleY + (float) Math.toRadians(yy), sailFront.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 39) {
            xx = 0 + (((tickAnim - 0) / 39) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 39) * (0.225-(0)));
            zz = 0 + (((tickAnim - 0) / 39) * (0-(0)));
        }
        else if (tickAnim >= 39 && tickAnim < 285) {
            xx = 0 + (((tickAnim - 39) / 246) * (0-(0)));
            yy = 0.225 + (((tickAnim - 39) / 246) * (0.225-(0.225)));
            zz = 0 + (((tickAnim - 39) / 246) * (0-(0)));
        }
        else if (tickAnim >= 285 && tickAnim < 320) {
            xx = 0 + (((tickAnim - 285) / 35) * (0-(0)));
            yy = 0.225 + (((tickAnim - 285) / 35) * (0.955-(0.225)));
            zz = 0 + (((tickAnim - 285) / 35) * (1.6-(0)));
        }
        else if (tickAnim >= 320 && tickAnim < 675) {
            xx = 0 + (((tickAnim - 320) / 355) * (0-(0)));
            yy = 0.955 + (((tickAnim - 320) / 355) * (0.535-(0.955)));
            zz = 1.6 + (((tickAnim - 320) / 355) * (2.675-(1.6)));
        }
        else if (tickAnim >= 675 && tickAnim < 679) {
            xx = 0 + (((tickAnim - 675) / 4) * (0-(0)));
            yy = 0.535 + (((tickAnim - 675) / 4) * (1.265-(0.535)));
            zz = 2.675 + (((tickAnim - 675) / 4) * (2.78-(2.675)));
        }
        else if (tickAnim >= 679 && tickAnim < 685) {
            xx = 0 + (((tickAnim - 679) / 6) * (0-(0)));
            yy = 1.265 + (((tickAnim - 679) / 6) * (0-(1.265)));
            zz = 2.78 + (((tickAnim - 679) / 6) * (0-(2.78)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.sailFront.rotationPointX = this.sailFront.rotationPointX + (float)(xx);
        this.sailFront.rotationPointY = this.sailFront.rotationPointY - (float)(yy);
        this.sailFront.rotationPointZ = this.sailFront.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (21.28087-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (7.45599-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (-2.23477-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 285) {
            xx = 21.28087 + (((tickAnim - 40) / 245) * (21.28087-(21.28087)));
            yy = 7.45599 + (((tickAnim - 40) / 245) * (7.45599-(7.45599)));
            zz = -2.23477 + (((tickAnim - 40) / 245) * (-2.23477-(-2.23477)));
        }
        else if (tickAnim >= 285 && tickAnim < 314) {
            xx = 21.28087 + (((tickAnim - 285) / 29) * (34.28087-(21.28087)));
            yy = 7.45599 + (((tickAnim - 285) / 29) * (7.45599-(7.45599)));
            zz = -2.23477 + (((tickAnim - 285) / 29) * (-2.23477-(-2.23477)));
        }
        else if (tickAnim >= 314 && tickAnim < 340) {
            xx = 34.28087 + (((tickAnim - 314) / 26) * (21.28087-(34.28087)));
            yy = 7.45599 + (((tickAnim - 314) / 26) * (7.45599-(7.45599)));
            zz = -2.23477 + (((tickAnim - 314) / 26) * (-2.23477-(-2.23477)));
        }
        else if (tickAnim >= 340 && tickAnim < 675) {
            xx = 21.28087 + (((tickAnim - 340) / 335) * (21.28087-(21.28087)));
            yy = 7.45599 + (((tickAnim - 340) / 335) * (7.45599-(7.45599)));
            zz = -2.23477 + (((tickAnim - 340) / 335) * (-2.23477-(-2.23477)));
        }
        else if (tickAnim >= 675 && tickAnim < 680) {
            xx = 21.28087 + (((tickAnim - 675) / 5) * (41.03087-(21.28087)));
            yy = 7.45599 + (((tickAnim - 675) / 5) * (7.45599-(7.45599)));
            zz = -2.23477 + (((tickAnim - 675) / 5) * (-2.23477-(-2.23477)));
        }
        else if (tickAnim >= 680 && tickAnim < 685) {
            xx = 41.03087 + (((tickAnim - 680) / 5) * (0-(41.03087)));
            yy = 7.45599 + (((tickAnim - 680) / 5) * (0-(7.45599)));
            zz = -2.23477 + (((tickAnim - 680) / 5) * (0-(-2.23477)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm1, leftArm1.rotateAngleX + (float) Math.toRadians(xx), leftArm1.rotateAngleY + (float) Math.toRadians(yy), leftArm1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (-44.25-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 285) {
            xx = -44.25 + (((tickAnim - 40) / 245) * (-44.25-(-44.25)));
            yy = 0 + (((tickAnim - 40) / 245) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 245) * (0-(0)));
        }
        else if (tickAnim >= 285 && tickAnim < 340) {
            xx = -44.25 + (((tickAnim - 285) / 55) * (-44.25-(-44.25)));
            yy = 0 + (((tickAnim - 285) / 55) * (0-(0)));
            zz = 0 + (((tickAnim - 285) / 55) * (0-(0)));
        }
        else if (tickAnim >= 340 && tickAnim < 675) {
            xx = -44.25 + (((tickAnim - 340) / 335) * (-44.25-(-44.25)));
            yy = 0 + (((tickAnim - 340) / 335) * (0-(0)));
            zz = 0 + (((tickAnim - 340) / 335) * (0-(0)));
        }
        else if (tickAnim >= 675 && tickAnim < 685) {
            xx = -44.25 + (((tickAnim - 675) / 10) * (0-(-44.25)));
            yy = 0 + (((tickAnim - 675) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 675) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm2, leftArm2.rotateAngleX + (float) Math.toRadians(xx), leftArm2.rotateAngleY + (float) Math.toRadians(yy), leftArm2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftHand, leftHand.rotateAngleX + (float) Math.toRadians(xx), leftHand.rotateAngleY + (float) Math.toRadians(yy), leftHand.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (-7+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+200))*-1-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 109) {
            xx = -7+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+200))*-1 + (((tickAnim - 40) / 69) * (-7+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+200))*-1-(-7+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+200))*-1)));
            yy = 0 + (((tickAnim - 40) / 69) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 69) * (0-(0)));
        }
        else if (tickAnim >= 109 && tickAnim < 259) {
            xx = -7+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+200))*-1 + (((tickAnim - 109) / 150) * (-7.75+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+200))*-1-(-7+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+200))*-1)));
            yy = 0 + (((tickAnim - 109) / 150) * (0-(0)));
            zz = 0 + (((tickAnim - 109) / 150) * (0-(0)));
        }
        else if (tickAnim >= 259 && tickAnim < 285) {
            xx = -7.75+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+200))*-1 + (((tickAnim - 259) / 26) * (-7.75+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+200))*-1-(-7.75+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+200))*-1)));
            yy = 0 + (((tickAnim - 259) / 26) * (0-(0)));
            zz = 0 + (((tickAnim - 259) / 26) * (0-(0)));
        }
        else if (tickAnim >= 285 && tickAnim < 314) {
            xx = -7.75+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+200))*-1 + (((tickAnim - 285) / 29) * (-11+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+200))*-1-(-7.75+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+200))*-1)));
            yy = 0 + (((tickAnim - 285) / 29) * (0-(0)));
            zz = 0 + (((tickAnim - 285) / 29) * (0-(0)));
        }
        else if (tickAnim >= 314 && tickAnim < 340) {
            xx = -11+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+200))*-1 + (((tickAnim - 314) / 26) * (-6.15+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+200))*-10-(-11+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+200))*-1)));
            yy = 0 + (((tickAnim - 314) / 26) * (0-(0)));
            zz = 0 + (((tickAnim - 314) / 26) * (0-(0)));
        }
        else if (tickAnim >= 340 && tickAnim < 341) {
            xx = -6.15+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+200))*-10 + (((tickAnim - 340) / 1) * (-1.55+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+200))*-1-(-6.15+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+200))*-10)));
            yy = 0 + (((tickAnim - 340) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 340) / 1) * (0-(0)));
        }
        else if (tickAnim >= 341 && tickAnim < 375) {
            xx = -1.55+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+200))*-1 + (((tickAnim - 341) / 34) * (-1.55+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+200))*0.5-(-1.55+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+200))*-1)));
            yy = 0 + (((tickAnim - 341) / 34) * (0-(0)));
            zz = 0 + (((tickAnim - 341) / 34) * (0-(0)));
        }
        else if (tickAnim >= 375 && tickAnim < 560) {
            xx = -1.55+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+200))*0.5 + (((tickAnim - 375) / 185) * (5.6155+Math.sin((Math.PI/180)*(((double)tickAnim/20)*20+200))*0.5-(-1.55+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+200))*0.5)));
            yy = 0 + (((tickAnim - 375) / 185) * (0.6224-(0)));
            zz = 0 + (((tickAnim - 375) / 185) * (-1.21684-(0)));
        }
        else if (tickAnim >= 560 && tickAnim < 653) {
            xx = 5.6155+Math.sin((Math.PI/180)*(((double)tickAnim/20)*20+200))*0.5 + (((tickAnim - 560) / 93) * (2.6155+Math.sin((Math.PI/180)*(((double)tickAnim/20)*20+200))*0.5-(5.6155+Math.sin((Math.PI/180)*(((double)tickAnim/20)*20+200))*0.5)));
            yy = 0.6224 + (((tickAnim - 560) / 93) * (0.6224-(0.6224)));
            zz = -1.21684 + (((tickAnim - 560) / 93) * (-1.21684-(-1.21684)));
        }
        else if (tickAnim >= 653 && tickAnim < 675) {
            xx = 2.6155+Math.sin((Math.PI/180)*(((double)tickAnim/20)*20+200))*0.5 + (((tickAnim - 653) / 22) * (2.8655+Math.sin((Math.PI/180)*(((double)tickAnim/20)*20+200))*0.5-(2.6155+Math.sin((Math.PI/180)*(((double)tickAnim/20)*20+200))*0.5)));
            yy = 0.6224 + (((tickAnim - 653) / 22) * (0.6224-(0.6224)));
            zz = -1.21684 + (((tickAnim - 653) / 22) * (-1.21684-(-1.21684)));
        }
        else if (tickAnim >= 675 && tickAnim < 679) {
            xx = 2.8655+Math.sin((Math.PI/180)*(((double)tickAnim/20)*20+200))*0.5 + (((tickAnim - 675) / 4) * (-4.76971-(2.8655+Math.sin((Math.PI/180)*(((double)tickAnim/20)*20+200))*0.5)));
            yy = 0.6224 + (((tickAnim - 675) / 4) * (0.36307-(0.6224)));
            zz = -1.21684 + (((tickAnim - 675) / 4) * (-0.70982-(-1.21684)));
        }
        else if (tickAnim >= 679 && tickAnim < 685) {
            xx = -4.76971 + (((tickAnim - 679) / 6) * (34.75-(-4.76971)));
            yy = 0.36307 + (((tickAnim - 679) / 6) * (0-(0.36307)));
            zz = -0.70982 + (((tickAnim - 679) / 6) * (0-(-0.70982)));
        }
        else if (tickAnim >= 685 && tickAnim < 699) {
            xx = 34.75 + (((tickAnim - 685) / 14) * (18.61083-(34.75)));
            yy = 0 + (((tickAnim - 685) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 685) / 14) * (0.63128-(0)));
        }
        else if (tickAnim >= 699 && tickAnim < 707) {
            xx = 18.61083 + (((tickAnim - 699) / 8) * (9.57417-(18.61083)));
            yy = 0 + (((tickAnim - 699) / 8) * (0-(0)));
            zz = 0.63128 + (((tickAnim - 699) / 8) * (-3.83952-(0.63128)));
        }
        else if (tickAnim >= 707 && tickAnim < 708) {
            xx = 9.57417 + (((tickAnim - 707) / 1) * (7.94-(9.57417)));
            yy = 0 + (((tickAnim - 707) / 1) * (0-(0)));
            zz = -3.83952 + (((tickAnim - 707) / 1) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220))*1-(-3.83952)));
        }
        else if (tickAnim >= 708 && tickAnim < 715) {
            xx = 7.94 + (((tickAnim - 708) / 7) * (0-(7.94)));
            yy = 0 + (((tickAnim - 708) / 7) * (0-(0)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220))*1 + (((tickAnim - 708) / 7) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220))*1)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck1, neck1.rotateAngleX + (float) Math.toRadians(xx), neck1.rotateAngleY + (float) Math.toRadians(yy), neck1.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 314) {
            xx = 0 + (((tickAnim - 0) / 314) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 314) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 314) * (1.05-(0)));
        }
        else if (tickAnim >= 314 && tickAnim < 675) {
            xx = 0 + (((tickAnim - 314) / 361) * (0-(0)));
            yy = 0 + (((tickAnim - 314) / 361) * (0-(0)));
            zz = 1.05 + (((tickAnim - 314) / 361) * (0-(1.05)));
        }
        else if (tickAnim >= 675 && tickAnim < 685) {
            xx = 0 + (((tickAnim - 675) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 675) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 675) / 10) * (0-(0)));
        }
        else if (tickAnim >= 685 && tickAnim < 715) {
            xx = 0 + (((tickAnim - 685) / 30) * (0-(0)));
            yy = 0 + (((tickAnim - 685) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 685) / 30) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.neck1.rotationPointX = this.neck1.rotationPointX + (float)(xx);
        this.neck1.rotationPointY = this.neck1.rotationPointY - (float)(yy);
        this.neck1.rotationPointZ = this.neck1.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (-9+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+250))*1-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 109) {
            xx = -9+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+250))*1 + (((tickAnim - 40) / 69) * (-9+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+250))*1-(-9+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+250))*1)));
            yy = 0 + (((tickAnim - 40) / 69) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 69) * (0-(0)));
        }
        else if (tickAnim >= 109 && tickAnim < 259) {
            xx = -9+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+250))*1 + (((tickAnim - 109) / 150) * (1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+250))*1-(-9+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+250))*1)));
            yy = 0 + (((tickAnim - 109) / 150) * (0-(0)));
            zz = 0 + (((tickAnim - 109) / 150) * (0-(0)));
        }
        else if (tickAnim >= 259 && tickAnim < 285) {
            xx = 1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+250))*1 + (((tickAnim - 259) / 26) * (1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+250))*1-(1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+250))*1)));
            yy = 0 + (((tickAnim - 259) / 26) * (0-(0)));
            zz = 0 + (((tickAnim - 259) / 26) * (0-(0)));
        }
        else if (tickAnim >= 285 && tickAnim < 314) {
            xx = 1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+250))*1 + (((tickAnim - 285) / 29) * (-14.75+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+250))*1-(1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+250))*1)));
            yy = 0 + (((tickAnim - 285) / 29) * (0-(0)));
            zz = 0 + (((tickAnim - 285) / 29) * (0-(0)));
        }
        else if (tickAnim >= 314 && tickAnim < 340) {
            xx = -14.75+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+250))*1 + (((tickAnim - 314) / 26) * (16.825+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+250))*-20-(-14.75+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+250))*1)));
            yy = 0 + (((tickAnim - 314) / 26) * (0-(0)));
            zz = 0 + (((tickAnim - 314) / 26) * (0-(0)));
        }
        else if (tickAnim >= 340 && tickAnim < 341) {
            xx = 16.825+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+250))*-20 + (((tickAnim - 340) / 1) * (10.325+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+250))*-1-(16.825+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+250))*-20)));
            yy = 0 + (((tickAnim - 340) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 340) / 1) * (0-(0)));
        }
        else if (tickAnim >= 341 && tickAnim < 375) {
            xx = 10.325+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+250))*-1 + (((tickAnim - 341) / 34) * (10.325+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+250))*-1-(10.325+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+250))*-1)));
            yy = 0 + (((tickAnim - 341) / 34) * (0-(0)));
            zz = 0 + (((tickAnim - 341) / 34) * (0-(0)));
        }
        else if (tickAnim >= 375 && tickAnim < 560) {
            xx = 10.325+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+250))*-1 + (((tickAnim - 375) / 185) * (-1.175+Math.sin((Math.PI/180)*(((double)tickAnim/20)*20+250))*-1-(10.325+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+250))*-1)));
            yy = 0 + (((tickAnim - 375) / 185) * (0-(0)));
            zz = 0 + (((tickAnim - 375) / 185) * (0-(0)));
        }
        else if (tickAnim >= 560 && tickAnim < 653) {
            xx = -1.175+Math.sin((Math.PI/180)*(((double)tickAnim/20)*20+250))*-1 + (((tickAnim - 560) / 93) * (-6.675+Math.sin((Math.PI/180)*(((double)tickAnim/20)*20+250))*-1-(-1.175+Math.sin((Math.PI/180)*(((double)tickAnim/20)*20+250))*-1)));
            yy = 0 + (((tickAnim - 560) / 93) * (0-(0)));
            zz = 0 + (((tickAnim - 560) / 93) * (0-(0)));
        }
        else if (tickAnim >= 653 && tickAnim < 675) {
            xx = -6.675+Math.sin((Math.PI/180)*(((double)tickAnim/20)*20+250))*-1 + (((tickAnim - 653) / 22) * (-6.675+Math.sin((Math.PI/180)*(((double)tickAnim/20)*20+250))*-1-(-6.675+Math.sin((Math.PI/180)*(((double)tickAnim/20)*20+250))*-1)));
            yy = 0 + (((tickAnim - 653) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 653) / 22) * (0-(0)));
        }
        else if (tickAnim >= 675 && tickAnim < 679) {
            xx = -6.675+Math.sin((Math.PI/180)*(((double)tickAnim/20)*20+250))*-1 + (((tickAnim - 675) / 4) * (-7.88-(-6.675+Math.sin((Math.PI/180)*(((double)tickAnim/20)*20+250))*-1)));
            yy = 0 + (((tickAnim - 675) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 675) / 4) * (0-(0)));
        }
        else if (tickAnim >= 679 && tickAnim < 685) {
            xx = -7.88 + (((tickAnim - 679) / 6) * (25.075+Math.sin((Math.PI/180)*(((double)tickAnim/20)*20+250))*-1-(-7.88)));
            yy = 0 + (((tickAnim - 679) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 679) / 6) * (0-(0)));
        }
        else if (tickAnim >= 685 && tickAnim < 699) {
            xx = 25.075+Math.sin((Math.PI/180)*(((double)tickAnim/20)*20+250))*-1 + (((tickAnim - 685) / 14) * (0-(25.075+Math.sin((Math.PI/180)*(((double)tickAnim/20)*20+250))*-1)));
            yy = 0 + (((tickAnim - 685) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 685) / 14) * (0-(0)));
        }
        else if (tickAnim >= 699 && tickAnim < 707) {
            xx = 0 + (((tickAnim - 699) / 8) * (-0.05-(0)));
            yy = 0 + (((tickAnim - 699) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 699) / 8) * (-0.17448-(0)));
        }
        else if (tickAnim >= 707 && tickAnim < 708) {
            xx = -0.05 + (((tickAnim - 707) / 1) * (0.25-(-0.05)));
            yy = 0 + (((tickAnim - 707) / 1) * (0-(0)));
            zz = -0.17448 + (((tickAnim - 707) / 1) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220-80))*2-(-0.17448)));
        }
        else if (tickAnim >= 708 && tickAnim < 715) {
            xx = 0.25 + (((tickAnim - 708) / 7) * (0-(0.25)));
            yy = 0 + (((tickAnim - 708) / 7) * (0-(0)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220-80))*2 + (((tickAnim - 708) / 7) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220-80))*2)));
        }
        else if (tickAnim >= 715 && tickAnim < 739) {
            xx = 0 + (((tickAnim - 715) / 24) * (0-(0)));
            yy = 0 + (((tickAnim - 715) / 24) * (0-(0)));
            zz = 0 + (((tickAnim - 715) / 24) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(xx), neck2.rotateAngleY + (float) Math.toRadians(yy), neck2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (-0.6-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (1.35-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 259) {
            xx = 0 + (((tickAnim - 40) / 219) * (0-(0)));
            yy = -0.6 + (((tickAnim - 40) / 219) * (0.08-(-0.6)));
            zz = 1.35 + (((tickAnim - 40) / 219) * (0.635-(1.35)));
        }
        else if (tickAnim >= 259 && tickAnim < 285) {
            xx = 0 + (((tickAnim - 259) / 26) * (0-(0)));
            yy = 0.08 + (((tickAnim - 259) / 26) * (0.08-(0.08)));
            zz = 0.635 + (((tickAnim - 259) / 26) * (0.635-(0.635)));
        }
        else if (tickAnim >= 285 && tickAnim < 314) {
            xx = 0 + (((tickAnim - 285) / 29) * (0-(0)));
            yy = 0.08 + (((tickAnim - 285) / 29) * (-1.125-(0.08)));
            zz = 0.635 + (((tickAnim - 285) / 29) * (1.8-(0.635)));
        }
        else if (tickAnim >= 314 && tickAnim < 340) {
            xx = 0 + (((tickAnim - 314) / 26) * (0-(0)));
            yy = -1.125 + (((tickAnim - 314) / 26) * (0.275-(-1.125)));
            zz = 1.8 + (((tickAnim - 314) / 26) * (0-(1.8)));
        }
        else if (tickAnim >= 340 && tickAnim < 560) {
            xx = 0 + (((tickAnim - 340) / 220) * (0-(0)));
            yy = 0.275 + (((tickAnim - 340) / 220) * (0.1-(0.275)));
            zz = 0 + (((tickAnim - 340) / 220) * (0.7-(0)));
        }
        else if (tickAnim >= 560 && tickAnim < 653) {
            xx = 0 + (((tickAnim - 560) / 93) * (0-(0)));
            yy = 0.1 + (((tickAnim - 560) / 93) * (-0.33-(0.1)));
            zz = 0.7 + (((tickAnim - 560) / 93) * (1-(0.7)));
        }
        else if (tickAnim >= 653 && tickAnim < 675) {
            xx = 0 + (((tickAnim - 653) / 22) * (0-(0)));
            yy = -0.33 + (((tickAnim - 653) / 22) * (-0.33-(-0.33)));
            zz = 1 + (((tickAnim - 653) / 22) * (1-(1)));
        }
        else if (tickAnim >= 675 && tickAnim < 679) {
            xx = 0 + (((tickAnim - 675) / 4) * (0-(0)));
            yy = -0.33 + (((tickAnim - 675) / 4) * (-0.35-(-0.33)));
            zz = 1 + (((tickAnim - 675) / 4) * (0.9-(1)));
        }
        else if (tickAnim >= 679 && tickAnim < 685) {
            xx = 0 + (((tickAnim - 679) / 6) * (0-(0)));
            yy = -0.35 + (((tickAnim - 679) / 6) * (-0.05-(-0.35)));
            zz = 0.9 + (((tickAnim - 679) / 6) * (0-(0.9)));
        }
        else if (tickAnim >= 685 && tickAnim < 715) {
            xx = 0 + (((tickAnim - 685) / 30) * (0-(0)));
            yy = -0.05 + (((tickAnim - 685) / 30) * (0-(-0.05)));
            zz = 0 + (((tickAnim - 685) / 30) * (0-(0)));
        }
        else if (tickAnim >= 715 && tickAnim < 739) {
            xx = 0 + (((tickAnim - 715) / 24) * (0-(0)));
            yy = 0 + (((tickAnim - 715) / 24) * (0-(0)));
            zz = 0 + (((tickAnim - 715) / 24) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.neck2.rotationPointX = this.neck2.rotationPointX + (float)(xx);
        this.neck2.rotationPointY = this.neck2.rotationPointY - (float)(yy);
        this.neck2.rotationPointZ = this.neck2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (15+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+300))*1-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 109) {
            xx = 15+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+300))*1 + (((tickAnim - 40) / 69) * (15+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+300))*1-(15+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+300))*1)));
            yy = 0 + (((tickAnim - 40) / 69) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 69) * (0-(0)));
        }
        else if (tickAnim >= 109 && tickAnim < 259) {
            xx = 15+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+300))*1 + (((tickAnim - 109) / 150) * (5.75+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+300))*1-(15+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+300))*1)));
            yy = 0 + (((tickAnim - 109) / 150) * (0-(0)));
            zz = 0 + (((tickAnim - 109) / 150) * (0-(0)));
        }
        else if (tickAnim >= 259 && tickAnim < 285) {
            xx = 5.75+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+300))*1 + (((tickAnim - 259) / 26) * (5.75+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+300))*1-(5.75+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+300))*1)));
            yy = 0 + (((tickAnim - 259) / 26) * (0-(0)));
            zz = 0 + (((tickAnim - 259) / 26) * (0-(0)));
        }
        else if (tickAnim >= 285 && tickAnim < 314) {
            xx = 5.75+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+300))*1 + (((tickAnim - 285) / 29) * (7+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+300))*1-(5.75+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+300))*1)));
            yy = 0 + (((tickAnim - 285) / 29) * (0-(0)));
            zz = 0 + (((tickAnim - 285) / 29) * (0-(0)));
        }
        else if (tickAnim >= 314 && tickAnim < 340) {
            xx = 7+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+300))*1 + (((tickAnim - 314) / 26) * (11.75+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+300))*1-(7+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+300))*1)));
            yy = 0 + (((tickAnim - 314) / 26) * (0-(0)));
            zz = 0 + (((tickAnim - 314) / 26) * (0-(0)));
        }
        else if (tickAnim >= 340 && tickAnim < 375) {
            xx = 11.75+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+300))*1 + (((tickAnim - 340) / 35) * (11.75+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+300))*1-(11.75+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+300))*1)));
            yy = 0 + (((tickAnim - 340) / 35) * (0-(0)));
            zz = 0 + (((tickAnim - 340) / 35) * (0-(0)));
        }
        else if (tickAnim >= 375 && tickAnim < 560) {
            xx = 11.75+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+300))*1 + (((tickAnim - 375) / 185) * (27.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*20+300))*1-(11.75+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+300))*1)));
            yy = 0 + (((tickAnim - 375) / 185) * (0-(0)));
            zz = 0 + (((tickAnim - 375) / 185) * (0-(0)));
        }
        else if (tickAnim >= 560 && tickAnim < 653) {
            xx = 27.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*20+300))*1 + (((tickAnim - 560) / 93) * (38+Math.sin((Math.PI/180)*(((double)tickAnim/20)*20+300))*1-(27.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*20+300))*1)));
            yy = 0 + (((tickAnim - 560) / 93) * (0-(0)));
            zz = 0 + (((tickAnim - 560) / 93) * (0-(0)));
        }
        else if (tickAnim >= 653 && tickAnim < 675) {
            xx = 38+Math.sin((Math.PI/180)*(((double)tickAnim/20)*20+300))*1 + (((tickAnim - 653) / 22) * (38+Math.sin((Math.PI/180)*(((double)tickAnim/20)*20+300))*1-(38+Math.sin((Math.PI/180)*(((double)tickAnim/20)*20+300))*1)));
            yy = 0 + (((tickAnim - 653) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 653) / 22) * (0-(0)));
        }
        else if (tickAnim >= 675 && tickAnim < 679) {
            xx = 38+Math.sin((Math.PI/180)*(((double)tickAnim/20)*20+300))*1 + (((tickAnim - 675) / 4) * (24-(38+Math.sin((Math.PI/180)*(((double)tickAnim/20)*20+300))*1)));
            yy = 0 + (((tickAnim - 675) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 675) / 4) * (0-(0)));
        }
        else if (tickAnim >= 679 && tickAnim < 685) {
            xx = 24 + (((tickAnim - 679) / 6) * (0-(24)));
            yy = 0 + (((tickAnim - 679) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 679) / 6) * (0-(0)));
        }
        else if (tickAnim >= 685 && tickAnim < 699) {
            xx = 0 + (((tickAnim - 685) / 14) * (0-(0)));
            yy = 0 + (((tickAnim - 685) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 685) / 14) * (0-(0)));
        }
        else if (tickAnim >= 699 && tickAnim < 707) {
            xx = 0 + (((tickAnim - 699) / 8) * (-0.6-(0)));
            yy = 0 + (((tickAnim - 699) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 699) / 8) * (0.04619-(0)));
        }
        else if (tickAnim >= 707 && tickAnim < 708) {
            xx = -0.6 + (((tickAnim - 707) / 1) * (-0.75-(-0.6)));
            yy = 0 + (((tickAnim - 707) / 1) * (0-(0)));
            zz = 0.04619 + (((tickAnim - 707) / 1) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220-170))*3-(0.04619)));
        }
        else if (tickAnim >= 708 && tickAnim < 715) {
            xx = -0.75 + (((tickAnim - 708) / 7) * (0-(-0.75)));
            yy = 0 + (((tickAnim - 708) / 7) * (0-(0)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220-170))*3 + (((tickAnim - 708) / 7) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220-170))*3)));
        }
        else if (tickAnim >= 715 && tickAnim < 739) {
            xx = 0 + (((tickAnim - 715) / 24) * (0-(0)));
            yy = 0 + (((tickAnim - 715) / 24) * (0-(0)));
            zz = 0 + (((tickAnim - 715) / 24) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(xx), neck3.rotateAngleY + (float) Math.toRadians(yy), neck3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (-0.01-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0.975-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 340) {
            xx = 0 + (((tickAnim - 40) / 300) * (0-(0)));
            yy = -0.01 + (((tickAnim - 40) / 300) * (-0.11-(-0.01)));
            zz = 0.975 + (((tickAnim - 40) / 300) * (0.785-(0.975)));
        }
        else if (tickAnim >= 340 && tickAnim < 560) {
            xx = 0 + (((tickAnim - 340) / 220) * (0-(0)));
            yy = -0.11 + (((tickAnim - 340) / 220) * (0.575-(-0.11)));
            zz = 0.785 + (((tickAnim - 340) / 220) * (2.425-(0.785)));
        }
        else if (tickAnim >= 560 && tickAnim < 653) {
            xx = 0 + (((tickAnim - 560) / 93) * (0-(0)));
            yy = 0.575 + (((tickAnim - 560) / 93) * (0.825-(0.575)));
            zz = 2.425 + (((tickAnim - 560) / 93) * (3.275-(2.425)));
        }
        else if (tickAnim >= 653 && tickAnim < 675) {
            xx = 0 + (((tickAnim - 653) / 22) * (0-(0)));
            yy = 0.825 + (((tickAnim - 653) / 22) * (0.825-(0.825)));
            zz = 3.275 + (((tickAnim - 653) / 22) * (3.275-(3.275)));
        }
        else if (tickAnim >= 675 && tickAnim < 685) {
            xx = 0 + (((tickAnim - 675) / 10) * (0-(0)));
            yy = 0.825 + (((tickAnim - 675) / 10) * (-0.02-(0.825)));
            zz = 3.275 + (((tickAnim - 675) / 10) * (0.3-(3.275)));
        }
        else if (tickAnim >= 685 && tickAnim < 715) {
            xx = 0 + (((tickAnim - 685) / 30) * (0-(0)));
            yy = -0.02 + (((tickAnim - 685) / 30) * (0-(-0.02)));
            zz = 0.3 + (((tickAnim - 685) / 30) * (0-(0.3)));
        }
        else if (tickAnim >= 715 && tickAnim < 739) {
            xx = 0 + (((tickAnim - 715) / 24) * (0-(0)));
            yy = 0 + (((tickAnim - 715) / 24) * (0-(0)));
            zz = 0 + (((tickAnim - 715) / 24) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.neck3.rotationPointX = this.neck3.rotationPointX + (float)(xx);
        this.neck3.rotationPointY = this.neck3.rotationPointY - (float)(yy);
        this.neck3.rotationPointZ = this.neck3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (7+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+350))*-2-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 259) {
            xx = 7+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+350))*-2 + (((tickAnim - 40) / 219) * (7+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+350))*-2-(7+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+350))*-2)));
            yy = 0 + (((tickAnim - 40) / 219) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 219) * (0-(0)));
        }
        else if (tickAnim >= 259 && tickAnim < 285) {
            xx = 7+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+350))*-2 + (((tickAnim - 259) / 26) * (7+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+350))*-2-(7+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+350))*-2)));
            yy = 0 + (((tickAnim - 259) / 26) * (0-(0)));
            zz = 0 + (((tickAnim - 259) / 26) * (0-(0)));
        }
        else if (tickAnim >= 285 && tickAnim < 314) {
            xx = 7+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+350))*-2 + (((tickAnim - 285) / 29) * (27+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+350))*-2-(7+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+350))*-2)));
            yy = 0 + (((tickAnim - 285) / 29) * (0-(0)));
            zz = 0 + (((tickAnim - 285) / 29) * (0-(0)));
        }
        else if (tickAnim >= 314 && tickAnim < 328) {
            xx = 27+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+350))*-2 + (((tickAnim - 314) / 14) * (-18.875+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+380))*28-(27+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+350))*-2)));
            yy = 0 + (((tickAnim - 314) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 314) / 14) * (0-(0)));
        }
        else if (tickAnim >= 328 && tickAnim < 340) {
            xx = -18.875+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+380))*28 + (((tickAnim - 328) / 12) * (-4.075+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+350))*-1-(-18.875+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+380))*28)));
            yy = 0 + (((tickAnim - 328) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 328) / 12) * (0-(0)));
        }
        else if (tickAnim >= 340 && tickAnim < 375) {
            xx = -4.075+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+350))*-1 + (((tickAnim - 340) / 35) * (-3.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+150))*-1-(-4.075+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+350))*-1)));
            yy = 0 + (((tickAnim - 340) / 35) * (0-(0)));
            zz = 0 + (((tickAnim - 340) / 35) * (0-(0)));
        }
        else if (tickAnim >= 375 && tickAnim < 560) {
            xx = -3.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+150))*-1 + (((tickAnim - 375) / 185) * (-16.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*20+350))*1-(-3.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+150))*-1)));
            yy = 0 + (((tickAnim - 375) / 185) * (0-(0)));
            zz = 0 + (((tickAnim - 375) / 185) * (0-(0)));
        }
        else if (tickAnim >= 560 && tickAnim < 653) {
            xx = -16.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*20+350))*1 + (((tickAnim - 560) / 93) * (-8.125+Math.sin((Math.PI/180)*(((double)tickAnim/20)*20+200))*5-(-16.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*20+350))*1)));
            yy = 0 + (((tickAnim - 560) / 93) * (0-(0)));
            zz = 0 + (((tickAnim - 560) / 93) * (0-(0)));
        }
        else if (tickAnim >= 653 && tickAnim < 675) {
            xx = -8.125+Math.sin((Math.PI/180)*(((double)tickAnim/20)*20+200))*5 + (((tickAnim - 653) / 22) * (-6.425+Math.sin((Math.PI/180)*(((double)tickAnim/20)*20+200))*5-(-8.125+Math.sin((Math.PI/180)*(((double)tickAnim/20)*20+200))*5)));
            yy = 0 + (((tickAnim - 653) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 653) / 22) * (0-(0)));
        }
        else if (tickAnim >= 675 && tickAnim < 679) {
            xx = -6.425+Math.sin((Math.PI/180)*(((double)tickAnim/20)*20+200))*5 + (((tickAnim - 675) / 4) * (5.5-(-6.425+Math.sin((Math.PI/180)*(((double)tickAnim/20)*20+200))*5)));
            yy = 0 + (((tickAnim - 675) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 675) / 4) * (0-(0)));
        }
        else if (tickAnim >= 679 && tickAnim < 685) {
            xx = 5.5 + (((tickAnim - 679) / 6) * (0-(5.5)));
            yy = 0 + (((tickAnim - 679) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 679) / 6) * (0-(0)));
        }
        else if (tickAnim >= 685 && tickAnim < 699) {
            xx = 0 + (((tickAnim - 685) / 14) * (0-(0)));
            yy = 0 + (((tickAnim - 685) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 685) / 14) * (0-(0)));
        }
        else if (tickAnim >= 699 && tickAnim < 707) {
            xx = 0 + (((tickAnim - 699) / 8) * (-14.1-(0)));
            yy = 0 + (((tickAnim - 699) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 699) / 8) * (0.17448-(0)));
        }
        else if (tickAnim >= 707 && tickAnim < 708) {
            xx = -14.1 + (((tickAnim - 707) / 1) * (-17.25-(-14.1)));
            yy = 0 + (((tickAnim - 707) / 1) * (0-(0)));
            zz = 0.17448 + (((tickAnim - 707) / 1) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220-260))*4-(0.17448)));
        }
        else if (tickAnim >= 708 && tickAnim < 715) {
            xx = -17.25 + (((tickAnim - 708) / 7) * (0-(-17.25)));
            yy = 0 + (((tickAnim - 708) / 7) * (0-(0)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220-260))*4 + (((tickAnim - 708) / 7) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220-260))*4)));
        }
        else if (tickAnim >= 715 && tickAnim < 739) {
            xx = 0 + (((tickAnim - 715) / 24) * (0-(0)));
            yy = 0 + (((tickAnim - 715) / 24) * (0-(0)));
            zz = 0 + (((tickAnim - 715) / 24) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck4, neck4.rotateAngleX + (float) Math.toRadians(xx), neck4.rotateAngleY + (float) Math.toRadians(yy), neck4.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0.85-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 285) {
            xx = 0 + (((tickAnim - 40) / 245) * (0-(0)));
            yy = 0 + (((tickAnim - 40) / 245) * (0-(0)));
            zz = 0.85 + (((tickAnim - 40) / 245) * (1.1-(0.85)));
        }
        else if (tickAnim >= 285 && tickAnim < 314) {
            xx = 0 + (((tickAnim - 285) / 29) * (0-(0)));
            yy = 0 + (((tickAnim - 285) / 29) * (0.475-(0)));
            zz = 1.1 + (((tickAnim - 285) / 29) * (3.1-(1.1)));
        }
        else if (tickAnim >= 314 && tickAnim < 340) {
            xx = 0 + (((tickAnim - 314) / 26) * (0-(0)));
            yy = 0.475 + (((tickAnim - 314) / 26) * (0-(0.475)));
            zz = 3.1 + (((tickAnim - 314) / 26) * (0-(3.1)));
        }
        else if (tickAnim >= 340 && tickAnim < 560) {
            xx = 0 + (((tickAnim - 340) / 220) * (0-(0)));
            yy = 0 + (((tickAnim - 340) / 220) * (0.2-(0)));
            zz = 0 + (((tickAnim - 340) / 220) * (-1.95-(0)));
        }
        else if (tickAnim >= 560 && tickAnim < 675) {
            xx = 0 + (((tickAnim - 560) / 115) * (0-(0)));
            yy = 0.2 + (((tickAnim - 560) / 115) * (0-(0.2)));
            zz = -1.95 + (((tickAnim - 560) / 115) * (0-(-1.95)));
        }
        else if (tickAnim >= 675 && tickAnim < 679) {
            xx = 0 + (((tickAnim - 675) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 675) / 4) * (0.01-(0)));
            zz = 0 + (((tickAnim - 675) / 4) * (0.785-(0)));
        }
        else if (tickAnim >= 679 && tickAnim < 685) {
            xx = 0 + (((tickAnim - 679) / 6) * (0-(0)));
            yy = 0.01 + (((tickAnim - 679) / 6) * (0-(0.01)));
            zz = 0.785 + (((tickAnim - 679) / 6) * (0-(0.785)));
        }
        else if (tickAnim >= 685 && tickAnim < 715) {
            xx = 0 + (((tickAnim - 685) / 30) * (0-(0)));
            yy = 0 + (((tickAnim - 685) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 685) / 30) * (0-(0)));
        }
        else if (tickAnim >= 715 && tickAnim < 739) {
            xx = 0 + (((tickAnim - 715) / 24) * (0-(0)));
            yy = 0 + (((tickAnim - 715) / 24) * (0-(0)));
            zz = 0 + (((tickAnim - 715) / 24) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.neck4.rotationPointX = this.neck4.rotationPointX + (float)(xx);
        this.neck4.rotationPointY = this.neck4.rotationPointY - (float)(yy);
        this.neck4.rotationPointZ = this.neck4.rotationPointZ + (float)(zz);




        if (tickAnim >= 259 && tickAnim < 285) {
            xx = 0 + (((tickAnim - 259) / 26) * (0-(0)));
            yy = 0 + (((tickAnim - 259) / 26) * (0-(0)));
            zz = 0 + (((tickAnim - 259) / 26) * (0-(0)));
        }
        else if (tickAnim >= 285 && tickAnim < 679) {
            xx = 0 + (((tickAnim - 285) / 394) * (0-(0)));
            yy = 0 + (((tickAnim - 285) / 394) * (0-(0)));
            zz = 0 + (((tickAnim - 285) / 394) * (0-(0)));
        }
        else if (tickAnim >= 679 && tickAnim < 685) {
            xx = 0 + (((tickAnim - 679) / 6) * (-8-(0)));
            yy = 0 + (((tickAnim - 679) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 679) / 6) * (0-(0)));
        }
        else if (tickAnim >= 685 && tickAnim < 693) {
            xx = -8 + (((tickAnim - 685) / 8) * (3.5-(-8)));
            yy = 0 + (((tickAnim - 685) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 685) / 8) * (0-(0)));
        }
        else if (tickAnim >= 693 && tickAnim < 699) {
            xx = 3.5 + (((tickAnim - 693) / 6) * (21.75-(3.5)));
            yy = 0 + (((tickAnim - 693) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 693) / 6) * (0-(0)));
        }
        else if (tickAnim >= 699 && tickAnim < 704) {
            xx = 21.75 + (((tickAnim - 699) / 5) * (-5.42-(21.75)));
            yy = 0 + (((tickAnim - 699) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 699) / 5) * (0-(0)));
        }
        else if (tickAnim >= 704 && tickAnim < 708) {
            xx = -5.42 + (((tickAnim - 704) / 4) * (-13.75-(-5.42)));
            yy = 0 + (((tickAnim - 704) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 704) / 4) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220-440))*6-(0)));
        }
        else if (tickAnim >= 708 && tickAnim < 715) {
            xx = -13.75 + (((tickAnim - 708) / 7) * (-4.2+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-9-(-13.75)));
            yy = 0 + (((tickAnim - 708) / 7) * (0-(0)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220-440))*6 + (((tickAnim - 708) / 7) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220-440))*6)));
        }
        else if (tickAnim >= 715 && tickAnim < 725) {
            xx = -4.2+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-9 + (((tickAnim - 715) / 10) * (-10.75-(-4.2+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-9)));
            yy = 0 + (((tickAnim - 715) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 715) / 10) * (0-(0)));
        }
        else if (tickAnim >= 725 && tickAnim < 739) {
            xx = -10.75 + (((tickAnim - 725) / 14) * (0-(-10.75)));
            yy = 0 + (((tickAnim - 725) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 725) / 14) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 675 && tickAnim < 679) {
            xx = 0 + (((tickAnim - 675) / 4) * (9.25-(0)));
            yy = 0 + (((tickAnim - 675) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 675) / 4) * (0-(0)));
        }
        else if (tickAnim >= 679 && tickAnim < 683) {
            xx = 9.25 + (((tickAnim - 679) / 4) * (31.46-(9.25)));
            yy = 0 + (((tickAnim - 679) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 679) / 4) * (0-(0)));
        }
        else if (tickAnim >= 683 && tickAnim < 685) {
            xx = 31.46 + (((tickAnim - 683) / 2) * (8-(31.46)));
            yy = 0 + (((tickAnim - 683) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 683) / 2) * (0-(0)));
        }
        else if (tickAnim >= 685 && tickAnim < 699) {
            xx = 8 + (((tickAnim - 685) / 14) * (8-(8)));
            yy = 0 + (((tickAnim - 685) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 685) / 14) * (0-(0)));
        }
        else if (tickAnim >= 699 && tickAnim < 704) {
            xx = 8 + (((tickAnim - 699) / 5) * (29.5-(8)));
            yy = 0 + (((tickAnim - 699) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 699) / 5) * (0-(0)));
        }
        else if (tickAnim >= 704 && tickAnim < 708) {
            xx = 29.5 + (((tickAnim - 704) / 4) * (0-(29.5)));
            yy = 0 + (((tickAnim - 704) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 704) / 4) * (0-(0)));
        }
        else if (tickAnim >= 708 && tickAnim < 715) {
            xx = 0 + (((tickAnim - 708) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 708) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 708) / 7) * (0-(0)));
        }
        else if (tickAnim >= 715 && tickAnim < 725) {
            xx = 0 + (((tickAnim - 715) / 10) * (12.75-(0)));
            yy = 0 + (((tickAnim - 715) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 715) / 10) * (0-(0)));
        }
        else if (tickAnim >= 725 && tickAnim < 728) {
            xx = 12.75 + (((tickAnim - 725) / 3) * (0-(12.75)));
            yy = 0 + (((tickAnim - 725) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 725) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(xx), jaw.rotateAngleY + (float) Math.toRadians(yy), jaw.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 675) {
            xx = 0 + (((tickAnim - 0) / 675) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 675) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 675) * (0-(0)));
        }
        else if (tickAnim >= 675 && tickAnim < 683) {
            xx = 0 + (((tickAnim - 675) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 675) / 8) * (-5-(0)));
            zz = 0 + (((tickAnim - 675) / 8) * (0-(0)));
        }
        else if (tickAnim >= 683 && tickAnim < 685) {
            xx = 0 + (((tickAnim - 683) / 2) * (0-(0)));
            yy = -5 + (((tickAnim - 683) / 2) * (-5-(-5)));
            zz = 0 + (((tickAnim - 683) / 2) * (0-(0)));
        }
        else if (tickAnim >= 685 && tickAnim < 699) {
            xx = 0 + (((tickAnim - 685) / 14) * (0-(0)));
            yy = -5 + (((tickAnim - 685) / 14) * (-5-(-5)));
            zz = 0 + (((tickAnim - 685) / 14) * (0-(0)));
        }
        else if (tickAnim >= 699 && tickAnim < 704) {
            xx = 0 + (((tickAnim - 699) / 5) * (0-(0)));
            yy = -5 + (((tickAnim - 699) / 5) * (0-(-5)));
            zz = 0 + (((tickAnim - 699) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftJaw1, leftJaw1.rotateAngleX + (float) Math.toRadians(xx), leftJaw1.rotateAngleY + (float) Math.toRadians(yy), leftJaw1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 675 && tickAnim < 683) {
            xx = 0 + (((tickAnim - 675) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 675) / 8) * (7.75-(0)));
            zz = 0 + (((tickAnim - 675) / 8) * (0-(0)));
        }
        else if (tickAnim >= 683 && tickAnim < 685) {
            xx = 0 + (((tickAnim - 683) / 2) * (0-(0)));
            yy = 7.75 + (((tickAnim - 683) / 2) * (7.75-(7.75)));
            zz = 0 + (((tickAnim - 683) / 2) * (0-(0)));
        }
        else if (tickAnim >= 685 && tickAnim < 699) {
            xx = 0 + (((tickAnim - 685) / 14) * (0-(0)));
            yy = 7.75 + (((tickAnim - 685) / 14) * (7.75-(7.75)));
            zz = 0 + (((tickAnim - 685) / 14) * (0-(0)));
        }
        else if (tickAnim >= 699 && tickAnim < 704) {
            xx = 0 + (((tickAnim - 699) / 5) * (0-(0)));
            yy = 7.75 + (((tickAnim - 699) / 5) * (0-(7.75)));
            zz = 0 + (((tickAnim - 699) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftJaw2, leftJaw2.rotateAngleX + (float) Math.toRadians(xx), leftJaw2.rotateAngleY + (float) Math.toRadians(yy), leftJaw2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 675 && tickAnim < 683) {
            xx = 0 + (((tickAnim - 675) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 675) / 8) * (5-(0)));
            zz = 0 + (((tickAnim - 675) / 8) * (0-(0)));
        }
        else if (tickAnim >= 683 && tickAnim < 685) {
            xx = 0 + (((tickAnim - 683) / 2) * (0-(0)));
            yy = 5 + (((tickAnim - 683) / 2) * (5-(5)));
            zz = 0 + (((tickAnim - 683) / 2) * (0-(0)));
        }
        else if (tickAnim >= 685 && tickAnim < 699) {
            xx = 0 + (((tickAnim - 685) / 14) * (0-(0)));
            yy = 5 + (((tickAnim - 685) / 14) * (5-(5)));
            zz = 0 + (((tickAnim - 685) / 14) * (0-(0)));
        }
        else if (tickAnim >= 699 && tickAnim < 704) {
            xx = 0 + (((tickAnim - 699) / 5) * (0-(0)));
            yy = 5 + (((tickAnim - 699) / 5) * (0-(5)));
            zz = 0 + (((tickAnim - 699) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightJaw1, rightJaw1.rotateAngleX + (float) Math.toRadians(xx), rightJaw1.rotateAngleY + (float) Math.toRadians(yy), rightJaw1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 675 && tickAnim < 683) {
            xx = 0 + (((tickAnim - 675) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 675) / 8) * (-7.5-(0)));
            zz = 0 + (((tickAnim - 675) / 8) * (0-(0)));
        }
        else if (tickAnim >= 683 && tickAnim < 685) {
            xx = 0 + (((tickAnim - 683) / 2) * (0-(0)));
            yy = -7.5 + (((tickAnim - 683) / 2) * (-7.5-(-7.5)));
            zz = 0 + (((tickAnim - 683) / 2) * (0-(0)));
        }
        else if (tickAnim >= 685 && tickAnim < 699) {
            xx = 0 + (((tickAnim - 685) / 14) * (0-(0)));
            yy = -7.5 + (((tickAnim - 685) / 14) * (-7.5-(-7.5)));
            zz = 0 + (((tickAnim - 685) / 14) * (0-(0)));
        }
        else if (tickAnim >= 699 && tickAnim < 704) {
            xx = 0 + (((tickAnim - 699) / 5) * (0-(0)));
            yy = -7.5 + (((tickAnim - 699) / 5) * (0-(-7.5)));
            zz = 0 + (((tickAnim - 699) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightJaw2, rightJaw2.rotateAngleX + (float) Math.toRadians(xx), rightJaw2.rotateAngleY + (float) Math.toRadians(yy), rightJaw2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 320) {
            xx = 0 + (((tickAnim - 0) / 320) * (12.75-(0)));
            yy = 0 + (((tickAnim - 0) / 320) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 320) * (0-(0)));
        }
        else if (tickAnim >= 320 && tickAnim < 560) {
            xx = 12.75 + (((tickAnim - 320) / 240) * (9.81-(12.75)));
            yy = 0 + (((tickAnim - 320) / 240) * (0-(0)));
            zz = 0 + (((tickAnim - 320) / 240) * (0-(0)));
        }
        else if (tickAnim >= 560 && tickAnim < 683) {
            xx = 9.81 + (((tickAnim - 560) / 123) * (0-(9.81)));
            yy = 0 + (((tickAnim - 560) / 123) * (0-(0)));
            zz = 0 + (((tickAnim - 560) / 123) * (0-(0)));
        }
        else if (tickAnim >= 683 && tickAnim < 685) {
            xx = 0 + (((tickAnim - 683) / 2) * (19.5-(0)));
            yy = 0 + (((tickAnim - 683) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 683) / 2) * (0-(0)));
        }
        else if (tickAnim >= 685 && tickAnim < 699) {
            xx = 19.5 + (((tickAnim - 685) / 14) * (-46.2-(19.5)));
            yy = 0 + (((tickAnim - 685) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 685) / 14) * (0-(0)));
        }
        else if (tickAnim >= 699 && tickAnim < 704) {
            xx = -46.2 + (((tickAnim - 699) / 5) * (0.5-(-46.2)));
            yy = 0 + (((tickAnim - 699) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 699) / 5) * (0-(0)));
        }
        else if (tickAnim >= 704 && tickAnim < 708) {
            xx = 0.5 + (((tickAnim - 704) / 4) * (12-(0.5)));
            yy = 0 + (((tickAnim - 704) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 704) / 4) * (0-(0)));
        }
        else if (tickAnim >= 708 && tickAnim < 715) {
            xx = 12 + (((tickAnim - 708) / 7) * (0-(12)));
            yy = 0 + (((tickAnim - 708) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 708) / 7) * (0-(0)));
        }
        else if (tickAnim >= 715 && tickAnim < 723) {
            xx = 0 + (((tickAnim - 715) / 8) * (15.5-(0)));
            yy = 0 + (((tickAnim - 715) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 715) / 8) * (0-(0)));
        }
        else if (tickAnim >= 723 && tickAnim < 728) {
            xx = 15.5 + (((tickAnim - 723) / 5) * (27.75-(15.5)));
            yy = 0 + (((tickAnim - 723) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 723) / 5) * (0-(0)));
        }
        else if (tickAnim >= 728 && tickAnim < 739) {
            xx = 27.75 + (((tickAnim - 728) / 11) * (0-(27.75)));
            yy = 0 + (((tickAnim - 728) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 728) / 11) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(throat2, throat2.rotateAngleX + (float) Math.toRadians(xx), throat2.rotateAngleY + (float) Math.toRadians(yy), throat2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 683 && tickAnim < 685) {
            xx = 0 + (((tickAnim - 683) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 683) / 2) * (-0.575-(0)));
            zz = 0 + (((tickAnim - 683) / 2) * (0.225-(0)));
        }
        else if (tickAnim >= 685 && tickAnim < 699) {
            xx = 0 + (((tickAnim - 685) / 14) * (0-(0)));
            yy = -0.575 + (((tickAnim - 685) / 14) * (-0.565-(-0.575)));
            zz = 0.225 + (((tickAnim - 685) / 14) * (-0.07-(0.225)));
        }
        else if (tickAnim >= 699 && tickAnim < 708) {
            xx = 0 + (((tickAnim - 699) / 9) * (0-(0)));
            yy = -0.565 + (((tickAnim - 699) / 9) * (0.175-(-0.565)));
            zz = -0.07 + (((tickAnim - 699) / 9) * (1.075-(-0.07)));
        }
        else if (tickAnim >= 708 && tickAnim < 715) {
            xx = 0 + (((tickAnim - 708) / 7) * (0-(0)));
            yy = 0.175 + (((tickAnim - 708) / 7) * (0-(0.175)));
            zz = 1.075 + (((tickAnim - 708) / 7) * (0-(1.075)));
        }
        else if (tickAnim >= 715 && tickAnim < 728) {
            xx = 0 + (((tickAnim - 715) / 13) * (0-(0)));
            yy = 0 + (((tickAnim - 715) / 13) * (-0.6-(0)));
            zz = 0 + (((tickAnim - 715) / 13) * (0-(0)));
        }
        else if (tickAnim >= 728 && tickAnim < 739) {
            xx = 0 + (((tickAnim - 728) / 11) * (0-(0)));
            yy = -0.6 + (((tickAnim - 728) / 11) * (0-(-0.6)));
            zz = 0 + (((tickAnim - 728) / 11) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.throat2.rotationPointX = this.throat2.rotationPointX + (float)(xx);
        this.throat2.rotationPointY = this.throat2.rotationPointY - (float)(yy);
        this.throat2.rotationPointZ = this.throat2.rotationPointZ + (float)(zz);


        if (tickAnim >= 0 && tickAnim < 560) {
            xx = 1 + (((tickAnim - 0) / 560) * (1-(1)));
            yy = 1 + (((tickAnim - 0) / 560) * (1-(1)));
            zz = 1 + (((tickAnim - 0) / 560) * (1.2-(1)));
        }
        else if (tickAnim >= 560 && tickAnim < 683) {
            xx = 1 + (((tickAnim - 560) / 123) * (1-(1)));
            yy = 1 + (((tickAnim - 560) / 123) * (1-(1)));
            zz = 1.2 + (((tickAnim - 560) / 123) * (1-(1.2)));
        }
        else if (tickAnim >= 683 && tickAnim < 685) {
            xx = 1 + (((tickAnim - 683) / 2) * (1-(1)));
            yy = 1 + (((tickAnim - 683) / 2) * (1.3-(1)));
            zz = 1 + (((tickAnim - 683) / 2) * (1.3-(1)));
        }
        else if (tickAnim >= 685 && tickAnim < 704) {
            xx = 1 + (((tickAnim - 685) / 19) * (1-(1)));
            yy = 1.3 + (((tickAnim - 685) / 19) * (1-(1.3)));
            zz = 1.3 + (((tickAnim - 685) / 19) * (1.4-(1.3)));
        }
        else if (tickAnim >= 704 && tickAnim < 708) {
            xx = 1 + (((tickAnim - 704) / 4) * (0.5-(1)));
            yy = 1 + (((tickAnim - 704) / 4) * (1.075-(1)));
            zz = 1.4 + (((tickAnim - 704) / 4) * (1.575-(1.4)));
        }
        else if (tickAnim >= 708 && tickAnim < 715) {
            xx = 0.5 + (((tickAnim - 708) / 7) * (1-(0.5)));
            yy = 1.075 + (((tickAnim - 708) / 7) * (1-(1.075)));
            zz = 1.575 + (((tickAnim - 708) / 7) * (1-(1.575)));
        }
        else if (tickAnim >= 715 && tickAnim < 728) {
            xx = 1 + (((tickAnim - 715) / 13) * (1-(1)));
            yy = 1 + (((tickAnim - 715) / 13) * (1-(1)));
            zz = 1 + (((tickAnim - 715) / 13) * (1.1-(1)));
        }
        else if (tickAnim >= 728 && tickAnim < 739) {
            xx = 1 + (((tickAnim - 728) / 11) * (1-(1)));
            yy = 1 + (((tickAnim - 728) / 11) * (1-(1)));
            zz = 1.1 + (((tickAnim - 728) / 11) * (1-(1.1)));
        }
        else {
            xx = 1;
            yy = 1;
            zz = 1;
        }
        this.throat2.setScale((float)xx, (float)yy, (float)zz);




        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (4.425+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+30))*10-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 41) {
            xx = 4.425+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+30))*10 + (((tickAnim - 40) / 1) * (12-(4.425+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+30))*10)));
            yy = 0 + (((tickAnim - 40) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 1) * (0-(0)));
        }
        else if (tickAnim >= 41 && tickAnim < 285) {
            xx = 12 + (((tickAnim - 41) / 244) * (12-(12)));
            yy = 0 + (((tickAnim - 41) / 244) * (0-(0)));
            zz = 0 + (((tickAnim - 41) / 244) * (0-(0)));
        }
        else if (tickAnim >= 285 && tickAnim < 313) {
            xx = 12 + (((tickAnim - 285) / 28) * (-6.15+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+200))*-10-(12)));
            yy = 0 + (((tickAnim - 285) / 28) * (0-(0)));
            zz = 0 + (((tickAnim - 285) / 28) * (0-(0)));
        }
        else if (tickAnim >= 313 && tickAnim < 325) {
            xx = -6.15+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+200))*-10 + (((tickAnim - 313) / 12) * (-5.75-(-6.15+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+200))*-10)));
            yy = 0 + (((tickAnim - 313) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 313) / 12) * (0-(0)));
        }
        else if (tickAnim >= 325 && tickAnim < 675) {
            xx = -5.75 + (((tickAnim - 325) / 350) * (-5.75-(-5.75)));
            yy = 0 + (((tickAnim - 325) / 350) * (0-(0)));
            zz = 0 + (((tickAnim - 325) / 350) * (0-(0)));
        }
        else if (tickAnim >= 675 && tickAnim < 690) {
            xx = -5.75 + (((tickAnim - 675) / 15) * (-21-(-5.75)));
            yy = 0 + (((tickAnim - 675) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 675) / 15) * (0-(0)));
        }
        else if (tickAnim >= 690 && tickAnim < 715) {
            xx = -21 + (((tickAnim - 690) / 25) * (19.25-(-21)));
            yy = 0 + (((tickAnim - 690) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 690) / 25) * (0-(0)));
        }
        else if (tickAnim >= 715 && tickAnim < 739) {
            xx = 19.25 + (((tickAnim - 715) / 24) * (0-(19.25)));
            yy = 0 + (((tickAnim - 715) / 24) * (0-(0)));
            zz = 0 + (((tickAnim - 715) / 24) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg1, rightLeg1.rotateAngleX + (float) Math.toRadians(xx), rightLeg1.rotateAngleY + (float) Math.toRadians(yy), rightLeg1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 285) {
            xx = 0 + (((tickAnim - 0) / 285) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 285) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 285) * (0-(0)));
        }
        else if (tickAnim >= 285 && tickAnim < 298) {
            xx = 0 + (((tickAnim - 285) / 13) * (31.79-(0)));
            yy = 0 + (((tickAnim - 285) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 285) / 13) * (0-(0)));
        }
        else if (tickAnim >= 298 && tickAnim < 310) {
            xx = 31.79 + (((tickAnim - 298) / 12) * (12.39-(31.79)));
            yy = 0 + (((tickAnim - 298) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 298) / 12) * (0-(0)));
        }
        else if (tickAnim >= 310 && tickAnim < 325) {
            xx = 12.39 + (((tickAnim - 310) / 15) * (-9.75-(12.39)));
            yy = 0 + (((tickAnim - 310) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 310) / 15) * (0-(0)));
        }
        else if (tickAnim >= 325 && tickAnim < 675) {
            xx = -9.75 + (((tickAnim - 325) / 350) * (-9.75-(-9.75)));
            yy = 0 + (((tickAnim - 325) / 350) * (0-(0)));
            zz = 0 + (((tickAnim - 325) / 350) * (0-(0)));
        }
        else if (tickAnim >= 675 && tickAnim < 690) {
            xx = -9.75 + (((tickAnim - 675) / 15) * (-4.75-(-9.75)));
            yy = 0 + (((tickAnim - 675) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 675) / 15) * (0-(0)));
        }
        else if (tickAnim >= 690 && tickAnim < 699) {
            xx = -4.75 + (((tickAnim - 690) / 9) * (52.88-(-4.75)));
            yy = 0 + (((tickAnim - 690) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 690) / 9) * (0-(0)));
        }
        else if (tickAnim >= 699 && tickAnim < 715) {
            xx = 52.88 + (((tickAnim - 699) / 16) * (-5-(52.88)));
            yy = 0 + (((tickAnim - 699) / 16) * (0-(0)));
            zz = 0 + (((tickAnim - 699) / 16) * (0-(0)));
        }
        else if (tickAnim >= 715 && tickAnim < 739) {
            xx = -5 + (((tickAnim - 715) / 24) * (0-(-5)));
            yy = 0 + (((tickAnim - 715) / 24) * (0-(0)));
            zz = 0 + (((tickAnim - 715) / 24) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg2, rightLeg2.rotateAngleX + (float) Math.toRadians(xx), rightLeg2.rotateAngleY + (float) Math.toRadians(yy), rightLeg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 285) {
            xx = 0 + (((tickAnim - 0) / 285) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 285) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 285) * (0-(0)));
        }
        else if (tickAnim >= 285 && tickAnim < 298) {
            xx = 0 + (((tickAnim - 285) / 13) * (0-(0)));
            yy = 0 + (((tickAnim - 285) / 13) * (0.825-(0)));
            zz = 0 + (((tickAnim - 285) / 13) * (-1.01-(0)));
        }
        else if (tickAnim >= 298 && tickAnim < 310) {
            xx = 0 + (((tickAnim - 298) / 12) * (0-(0)));
            yy = 0.825 + (((tickAnim - 298) / 12) * (0.725-(0.825)));
            zz = -1.01 + (((tickAnim - 298) / 12) * (-0.9-(-1.01)));
        }
        else if (tickAnim >= 310 && tickAnim < 325) {
            xx = 0 + (((tickAnim - 310) / 15) * (0-(0)));
            yy = 0.725 + (((tickAnim - 310) / 15) * (0-(0.725)));
            zz = -0.9 + (((tickAnim - 310) / 15) * (0-(-0.9)));
        }
        else if (tickAnim >= 325 && tickAnim < 675) {
            xx = 0 + (((tickAnim - 325) / 350) * (0-(0)));
            yy = 0 + (((tickAnim - 325) / 350) * (0-(0)));
            zz = 0 + (((tickAnim - 325) / 350) * (0-(0)));
        }
        else if (tickAnim >= 675 && tickAnim < 690) {
            xx = 0 + (((tickAnim - 675) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 675) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 675) / 15) * (0-(0)));
        }
        else if (tickAnim >= 690 && tickAnim < 699) {
            xx = 0 + (((tickAnim - 690) / 9) * (0-(0)));
            yy = 0 + (((tickAnim - 690) / 9) * (0.85-(0)));
            zz = 0 + (((tickAnim - 690) / 9) * (-1.625-(0)));
        }
        else if (tickAnim >= 699 && tickAnim < 715) {
            xx = 0 + (((tickAnim - 699) / 16) * (0-(0)));
            yy = 0.85 + (((tickAnim - 699) / 16) * (-0.65-(0.85)));
            zz = -1.625 + (((tickAnim - 699) / 16) * (0-(-1.625)));
        }
        else if (tickAnim >= 715 && tickAnim < 739) {
            xx = 0 + (((tickAnim - 715) / 24) * (0-(0)));
            yy = -0.65 + (((tickAnim - 715) / 24) * (0-(-0.65)));
            zz = 0 + (((tickAnim - 715) / 24) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightLeg2.rotationPointX = this.rightLeg2.rotationPointX + (float)(xx);
        this.rightLeg2.rotationPointY = this.rightLeg2.rotationPointY - (float)(yy);
        this.rightLeg2.rotationPointZ = this.rightLeg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 285) {
            xx = 0 + (((tickAnim - 0) / 285) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 285) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 285) * (0-(0)));
        }
        else if (tickAnim >= 285 && tickAnim < 310) {
            xx = 0 + (((tickAnim - 285) / 25) * (-43.64-(0)));
            yy = 0 + (((tickAnim - 285) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 285) / 25) * (0-(0)));
        }
        else if (tickAnim >= 310 && tickAnim < 317) {
            xx = -43.64 + (((tickAnim - 310) / 7) * (-43.64-(-43.64)));
            yy = 0 + (((tickAnim - 310) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 310) / 7) * (0-(0)));
        }
        else if (tickAnim >= 317 && tickAnim < 325) {
            xx = -43.64 + (((tickAnim - 317) / 8) * (27.25-(-43.64)));
            yy = 0 + (((tickAnim - 317) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 317) / 8) * (0-(0)));
        }
        else if (tickAnim >= 325 && tickAnim < 675) {
            xx = 27.25 + (((tickAnim - 325) / 350) * (27.25-(27.25)));
            yy = 0 + (((tickAnim - 325) / 350) * (0-(0)));
            zz = 0 + (((tickAnim - 325) / 350) * (0-(0)));
        }
        else if (tickAnim >= 675 && tickAnim < 690) {
            xx = 27.25 + (((tickAnim - 675) / 15) * (16.5-(27.25)));
            yy = 0 + (((tickAnim - 675) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 675) / 15) * (0-(0)));
        }
        else if (tickAnim >= 690 && tickAnim < 699) {
            xx = 16.5 + (((tickAnim - 690) / 9) * (-28.44-(16.5)));
            yy = 0 + (((tickAnim - 690) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 690) / 9) * (0-(0)));
        }
        else if (tickAnim >= 699 && tickAnim < 715) {
            xx = -28.44 + (((tickAnim - 699) / 16) * (14.75-(-28.44)));
            yy = 0 + (((tickAnim - 699) / 16) * (0-(0)));
            zz = 0 + (((tickAnim - 699) / 16) * (0-(0)));
        }
        else if (tickAnim >= 715 && tickAnim < 739) {
            xx = 14.75 + (((tickAnim - 715) / 24) * (0-(14.75)));
            yy = 0 + (((tickAnim - 715) / 24) * (0-(0)));
            zz = 0 + (((tickAnim - 715) / 24) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg3, rightLeg3.rotateAngleX + (float) Math.toRadians(xx), rightLeg3.rotateAngleY + (float) Math.toRadians(yy), rightLeg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 285) {
            xx = 0 + (((tickAnim - 0) / 285) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 285) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 285) * (0-(0)));
        }
        else if (tickAnim >= 285 && tickAnim < 310) {
            xx = 0 + (((tickAnim - 285) / 25) * (0-(0)));
            yy = 0 + (((tickAnim - 285) / 25) * (1.585-(0)));
            zz = 0 + (((tickAnim - 285) / 25) * (0.075-(0)));
        }
        else if (tickAnim >= 310 && tickAnim < 317) {
            xx = 0 + (((tickAnim - 310) / 7) * (0-(0)));
            yy = 1.585 + (((tickAnim - 310) / 7) * (1.585-(1.585)));
            zz = 0.075 + (((tickAnim - 310) / 7) * (0.075-(0.075)));
        }
        else if (tickAnim >= 317 && tickAnim < 325) {
            xx = 0 + (((tickAnim - 317) / 8) * (0-(0)));
            yy = 1.585 + (((tickAnim - 317) / 8) * (-0.15-(1.585)));
            zz = 0.075 + (((tickAnim - 317) / 8) * (0-(0.075)));
        }
        else if (tickAnim >= 325 && tickAnim < 675) {
            xx = 0 + (((tickAnim - 325) / 350) * (0-(0)));
            yy = -0.15 + (((tickAnim - 325) / 350) * (-0.15-(-0.15)));
            zz = 0 + (((tickAnim - 325) / 350) * (0-(0)));
        }
        else if (tickAnim >= 675 && tickAnim < 690) {
            xx = 0 + (((tickAnim - 675) / 15) * (0-(0)));
            yy = -0.15 + (((tickAnim - 675) / 15) * (0-(-0.15)));
            zz = 0 + (((tickAnim - 675) / 15) * (0-(0)));
        }
        else if (tickAnim >= 690 && tickAnim < 699) {
            xx = 0 + (((tickAnim - 690) / 9) * (0-(0)));
            yy = 0 + (((tickAnim - 690) / 9) * (-0.145-(0)));
            zz = 0 + (((tickAnim - 690) / 9) * (1.51-(0)));
        }
        else if (tickAnim >= 699 && tickAnim < 715) {
            xx = 0 + (((tickAnim - 699) / 16) * (0-(0)));
            yy = -0.145 + (((tickAnim - 699) / 16) * (-0.85-(-0.145)));
            zz = 1.51 + (((tickAnim - 699) / 16) * (-0.525-(1.51)));
        }
        else if (tickAnim >= 715 && tickAnim < 739) {
            xx = 0 + (((tickAnim - 715) / 24) * (0-(0)));
            yy = -0.85 + (((tickAnim - 715) / 24) * (0-(-0.85)));
            zz = -0.525 + (((tickAnim - 715) / 24) * (0-(-0.525)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightLeg3.rotationPointX = this.rightLeg3.rotationPointX + (float)(xx);
        this.rightLeg3.rotationPointY = this.rightLeg3.rotationPointY - (float)(yy);
        this.rightLeg3.rotationPointZ = this.rightLeg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 285) {
            xx = 0 + (((tickAnim - 0) / 285) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 285) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 285) * (0-(0)));
        }
        else if (tickAnim >= 285 && tickAnim < 292) {
            xx = 0 + (((tickAnim - 285) / 7) * (47.17-(0)));
            yy = 0 + (((tickAnim - 285) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 285) / 7) * (0-(0)));
        }
        else if (tickAnim >= 292 && tickAnim < 310) {
            xx = 47.17 + (((tickAnim - 292) / 18) * (77.36-(47.17)));
            yy = 0 + (((tickAnim - 292) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 292) / 18) * (0-(0)));
        }
        else if (tickAnim >= 310 && tickAnim < 317) {
            xx = 77.36 + (((tickAnim - 310) / 7) * (77.36-(77.36)));
            yy = 0 + (((tickAnim - 310) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 310) / 7) * (0-(0)));
        }
        else if (tickAnim >= 317 && tickAnim < 325) {
            xx = 77.36 + (((tickAnim - 317) / 8) * (2.75-(77.36)));
            yy = 0 + (((tickAnim - 317) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 317) / 8) * (0-(0)));
        }
        else if (tickAnim >= 325 && tickAnim < 675) {
            xx = 2.75 + (((tickAnim - 325) / 350) * (2.75-(2.75)));
            yy = 0 + (((tickAnim - 325) / 350) * (0-(0)));
            zz = 0 + (((tickAnim - 325) / 350) * (0-(0)));
        }
        else if (tickAnim >= 675 && tickAnim < 690) {
            xx = 2.75 + (((tickAnim - 675) / 15) * (2.25-(2.75)));
            yy = 0 + (((tickAnim - 675) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 675) / 15) * (0-(0)));
        }
        else if (tickAnim >= 690 && tickAnim < 699) {
            xx = 2.25 + (((tickAnim - 690) / 9) * (48.56-(2.25)));
            yy = 0 + (((tickAnim - 690) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 690) / 9) * (0-(0)));
        }
        else if (tickAnim >= 699 && tickAnim < 706) {
            xx = 48.56 + (((tickAnim - 699) / 7) * (61.58-(48.56)));
            yy = 0 + (((tickAnim - 699) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 699) / 7) * (0-(0)));
        }
        else if (tickAnim >= 706 && tickAnim < 715) {
            xx = 61.58 + (((tickAnim - 706) / 9) * (-31-(61.58)));
            yy = 0 + (((tickAnim - 706) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 706) / 9) * (0-(0)));
        }
        else if (tickAnim >= 715 && tickAnim < 739) {
            xx = -31 + (((tickAnim - 715) / 24) * (0-(-31)));
            yy = 0 + (((tickAnim - 715) / 24) * (0-(0)));
            zz = 0 + (((tickAnim - 715) / 24) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightFoot, rightFoot.rotateAngleX + (float) Math.toRadians(xx), rightFoot.rotateAngleY + (float) Math.toRadians(yy), rightFoot.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (2.075-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 285) {
            xx = 0 + (((tickAnim - 40) / 245) * (0-(0)));
            yy = 2.075 + (((tickAnim - 40) / 245) * (2.075-(2.075)));
            zz = 0 + (((tickAnim - 40) / 245) * (0-(0)));
        }
        else if (tickAnim >= 285 && tickAnim < 299) {
            xx = 0 + (((tickAnim - 285) / 14) * (-0.1-(0)));
            yy = 2.075 + (((tickAnim - 285) / 14) * (2.025-(2.075)));
            zz = 0 + (((tickAnim - 285) / 14) * (-0.225-(0)));
        }
        else if (tickAnim >= 299 && tickAnim < 310) {
            xx = -0.1 + (((tickAnim - 299) / 11) * (-0.175-(-0.1)));
            yy = 2.025 + (((tickAnim - 299) / 11) * (1.3-(2.025)));
            zz = -0.225 + (((tickAnim - 299) / 11) * (-0.525-(-0.225)));
        }
        else if (tickAnim >= 310 && tickAnim < 317) {
            xx = -0.175 + (((tickAnim - 310) / 7) * (-0.175-(-0.175)));
            yy = 1.3 + (((tickAnim - 310) / 7) * (1.3-(1.3)));
            zz = -0.525 + (((tickAnim - 310) / 7) * (-0.75-(-0.525)));
        }
        else if (tickAnim >= 317 && tickAnim < 325) {
            xx = -0.175 + (((tickAnim - 317) / 8) * (0-(-0.175)));
            yy = 1.3 + (((tickAnim - 317) / 8) * (1.125-(1.3)));
            zz = -0.75 + (((tickAnim - 317) / 8) * (0-(-0.75)));
        }
        else if (tickAnim >= 325 && tickAnim < 675) {
            xx = 0 + (((tickAnim - 325) / 350) * (0-(0)));
            yy = 1.125 + (((tickAnim - 325) / 350) * (1.125-(1.125)));
            zz = 0 + (((tickAnim - 325) / 350) * (0-(0)));
        }
        else if (tickAnim >= 675 && tickAnim < 690) {
            xx = 0 + (((tickAnim - 675) / 15) * (0-(0)));
            yy = 1.125 + (((tickAnim - 675) / 15) * (-0.3-(1.125)));
            zz = 0 + (((tickAnim - 675) / 15) * (0-(0)));
        }
        else if (tickAnim >= 690 && tickAnim < 699) {
            xx = 0 + (((tickAnim - 690) / 9) * (-0.15-(0)));
            yy = -0.3 + (((tickAnim - 690) / 9) * (1.095-(-0.3)));
            zz = 0 + (((tickAnim - 690) / 9) * (-1-(0)));
        }
        else if (tickAnim >= 699 && tickAnim < 706) {
            xx = -0.15 + (((tickAnim - 699) / 7) * (-0.07-(-0.15)));
            yy = 1.095 + (((tickAnim - 699) / 7) * (-0.24-(1.095)));
            zz = -1 + (((tickAnim - 699) / 7) * (-1.105-(-1)));
        }
        else if (tickAnim >= 706 && tickAnim < 712) {
            xx = -0.07 + (((tickAnim - 706) / 6) * (-0.03-(-0.07)));
            yy = -0.24 + (((tickAnim - 706) / 6) * (-1.175-(-0.24)));
            zz = -1.105 + (((tickAnim - 706) / 6) * (-0.45-(-1.105)));
        }
        else if (tickAnim >= 712 && tickAnim < 715) {
            xx = -0.03 + (((tickAnim - 712) / 3) * (0-(-0.03)));
            yy = -1.175 + (((tickAnim - 712) / 3) * (0.025-(-1.175)));
            zz = -0.45 + (((tickAnim - 712) / 3) * (0.075-(-0.45)));
        }
        else if (tickAnim >= 715 && tickAnim < 739) {
            xx = 0 + (((tickAnim - 715) / 24) * (0-(0)));
            yy = 0.025 + (((tickAnim - 715) / 24) * (0-(0.025)));
            zz = 0.075 + (((tickAnim - 715) / 24) * (0-(0.075)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightFoot.rotationPointX = this.rightFoot.rotationPointX + (float)(xx);
        this.rightFoot.rotationPointY = this.rightFoot.rotationPointY - (float)(yy);
        this.rightFoot.rotationPointZ = this.rightFoot.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 285) {
            xx = 0 + (((tickAnim - 0) / 285) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 285) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 285) * (0-(0)));
        }
        else if (tickAnim >= 285 && tickAnim < 292) {
            xx = 0 + (((tickAnim - 285) / 7) * (-27.75-(0)));
            yy = 0 + (((tickAnim - 285) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 285) / 7) * (0-(0)));
        }
        else if (tickAnim >= 292 && tickAnim < 299) {
            xx = -27.75 + (((tickAnim - 292) / 7) * (0-(-27.75)));
            yy = 0 + (((tickAnim - 292) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 292) / 7) * (0-(0)));
        }
        else if (tickAnim >= 299 && tickAnim < 310) {
            xx = 0 + (((tickAnim - 299) / 11) * (18.75-(0)));
            yy = 0 + (((tickAnim - 299) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 299) / 11) * (0-(0)));
        }
        else if (tickAnim >= 310 && tickAnim < 325) {
            xx = 18.75 + (((tickAnim - 310) / 15) * (0-(18.75)));
            yy = 0 + (((tickAnim - 310) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 310) / 15) * (0-(0)));
        }
        else if (tickAnim >= 325 && tickAnim < 675) {
            xx = 0 + (((tickAnim - 325) / 350) * (0-(0)));
            yy = 0 + (((tickAnim - 325) / 350) * (0-(0)));
            zz = 0 + (((tickAnim - 325) / 350) * (0-(0)));
        }
        else if (tickAnim >= 675 && tickAnim < 690) {
            xx = 0 + (((tickAnim - 675) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 675) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 675) / 15) * (0-(0)));
        }
        else if (tickAnim >= 690 && tickAnim < 699) {
            xx = 0 + (((tickAnim - 690) / 9) * (24.75-(0)));
            yy = 0 + (((tickAnim - 690) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 690) / 9) * (0-(0)));
        }
        else if (tickAnim >= 699 && tickAnim < 705) {
            xx = 24.75 + (((tickAnim - 699) / 6) * (0-(24.75)));
            yy = 0 + (((tickAnim - 699) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 699) / 6) * (0-(0)));
        }
        else if (tickAnim >= 705 && tickAnim < 712) {
            xx = 0 + (((tickAnim - 705) / 7) * (-32.02-(0)));
            yy = 0 + (((tickAnim - 705) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 705) / 7) * (0-(0)));
        }
        else if (tickAnim >= 712 && tickAnim < 715) {
            xx = -32.02 + (((tickAnim - 712) / 3) * (0-(-32.02)));
            yy = 0 + (((tickAnim - 712) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 712) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightToes, rightToes.rotateAngleX + (float) Math.toRadians(xx), rightToes.rotateAngleY + (float) Math.toRadians(yy), rightToes.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (22.5-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 285) {
            xx = 22.5 + (((tickAnim - 40) / 245) * (22.5-(22.5)));
            yy = 0 + (((tickAnim - 40) / 245) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 245) * (0-(0)));
        }
        else if (tickAnim >= 285 && tickAnim < 314) {
            xx = 22.5 + (((tickAnim - 285) / 29) * (36.25-(22.5)));
            yy = 0 + (((tickAnim - 285) / 29) * (0-(0)));
            zz = 0 + (((tickAnim - 285) / 29) * (0-(0)));
        }
        else if (tickAnim >= 314 && tickAnim < 340) {
            xx = 36.25 + (((tickAnim - 314) / 26) * (22.5-(36.25)));
            yy = 0 + (((tickAnim - 314) / 26) * (0-(0)));
            zz = 0 + (((tickAnim - 314) / 26) * (0-(0)));
        }
        else if (tickAnim >= 340 && tickAnim < 675) {
            xx = 22.5 + (((tickAnim - 340) / 335) * (22.5-(22.5)));
            yy = 0 + (((tickAnim - 340) / 335) * (0-(0)));
            zz = 0 + (((tickAnim - 340) / 335) * (0-(0)));
        }
        else if (tickAnim >= 675 && tickAnim < 680) {
            xx = 22.5 + (((tickAnim - 675) / 5) * (34.25-(22.5)));
            yy = 0 + (((tickAnim - 675) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 675) / 5) * (0-(0)));
        }
        else if (tickAnim >= 680 && tickAnim < 685) {
            xx = 34.25 + (((tickAnim - 680) / 5) * (0-(34.25)));
            yy = 0 + (((tickAnim - 680) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 680) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm1, rightArm1.rotateAngleX + (float) Math.toRadians(xx), rightArm1.rotateAngleY + (float) Math.toRadians(yy), rightArm1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (-35.82232-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (-7.24514-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (-4.02303-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 285) {
            xx = -35.82232 + (((tickAnim - 40) / 245) * (-35.82232-(-35.82232)));
            yy = -7.24514 + (((tickAnim - 40) / 245) * (-7.24514-(-7.24514)));
            zz = -4.02303 + (((tickAnim - 40) / 245) * (-4.02303-(-4.02303)));
        }
        else if (tickAnim >= 285 && tickAnim < 675) {
            xx = -35.82232 + (((tickAnim - 285) / 390) * (-35.82232-(-35.82232)));
            yy = -7.24514 + (((tickAnim - 285) / 390) * (-7.24514-(-7.24514)));
            zz = -4.02303 + (((tickAnim - 285) / 390) * (-4.02303-(-4.02303)));
        }
        else if (tickAnim >= 675 && tickAnim < 685) {
            xx = -35.82232 + (((tickAnim - 675) / 10) * (0-(-35.82232)));
            yy = -7.24514 + (((tickAnim - 675) / 10) * (0-(-7.24514)));
            zz = -4.02303 + (((tickAnim - 675) / 10) * (0-(-4.02303)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm2, rightArm2.rotateAngleX + (float) Math.toRadians(xx), rightArm2.rotateAngleY + (float) Math.toRadians(yy), rightArm2.rotateAngleZ + (float) Math.toRadians(zz));

    }
    public void animNoise(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraSpinosaurus entity = (EntityPrehistoricFloraSpinosaurus) entitylivingbaseIn;
        int animCycle = 60;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;


        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*120-100))*3), neck2.rotateAngleY + (float) Math.toRadians(0), neck2.rotateAngleZ + (float) Math.toRadians(0));
        this.neck2.rotationPointX = this.neck2.rotationPointX + (float)(0);
        this.neck2.rotationPointY = this.neck2.rotationPointY - (float)(0);
        this.neck2.rotationPointZ = this.neck2.rotationPointZ + (float)(0.45);


        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*120-200))*-3), neck3.rotateAngleY + (float) Math.toRadians(0), neck3.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(neck4, neck4.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*120-300))*3), neck4.rotateAngleY + (float) Math.toRadians(0), neck4.rotateAngleZ + (float) Math.toRadians(0));
        this.neck4.rotationPointX = this.neck4.rotationPointX + (float)(0);
        this.neck4.rotationPointY = this.neck4.rotationPointY - (float)(0);
        this.neck4.rotationPointZ = this.neck4.rotationPointZ + (float)(0.375);


        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*120-400))*3), head.rotateAngleY + (float) Math.toRadians(0), head.rotateAngleZ + (float) Math.toRadians(0));



        if (tickAnim >= 0 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 0) / 28) * (10.45+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120+50))*-10-(0)));
            yy = 0 + (((tickAnim - 0) / 28) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 28) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 60) {
            xx = 10.45+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120+50))*-10 + (((tickAnim - 28) / 32) * (0-(10.45+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120+50))*-10)));
            yy = 0 + (((tickAnim - 28) / 32) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 32) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(xx), jaw.rotateAngleY + (float) Math.toRadians(yy), jaw.rotateAngleZ + (float) Math.toRadians(zz));



        this.setRotateAngle(throat1, throat1.rotateAngleX + (float) Math.toRadians(0), throat1.rotateAngleY + (float) Math.toRadians(0), throat1.rotateAngleZ + (float) Math.toRadians(0));

        if (tickAnim >= 0 && tickAnim < 28) {
            xx = 1 + (((tickAnim - 0) / 28) * (1-(1)));
            yy = 1 + (((tickAnim - 0) / 28) * (1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000))*-0.05-(1)));
            zz = 1 + (((tickAnim - 0) / 28) * (1-(1)));
        }
        else if (tickAnim >= 28 && tickAnim < 60) {
            xx = 1 + (((tickAnim - 28) / 32) * (1-(1)));
            yy = 1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000))*-0.05 + (((tickAnim - 28) / 32) * (1-(1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000))*-0.05)));
            zz = 1 + (((tickAnim - 28) / 32) * (1-(1)));
        }
        else {
            xx = 1;
            yy = 1;
            zz = 1;
        }
        this.throat1.setScale((float)xx, (float)yy, (float)zz);



        this.setRotateAngle(throat2, throat2.rotateAngleX + (float) Math.toRadians(0), throat2.rotateAngleY + (float) Math.toRadians(0), throat2.rotateAngleZ + (float) Math.toRadians(0));

    }
    public void animRoar(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraSpinosaurus entity = (EntityPrehistoricFloraSpinosaurus) entitylivingbaseIn;
        int animCycle = 110;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (-2.5-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 75) {
            xx = -2.5 + (((tickAnim - 40) / 35) * (-2.5-(-2.5)));
            yy = 0 + (((tickAnim - 40) / 35) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 35) * (0-(0)));
        }
        else if (tickAnim >= 75 && tickAnim < 110) {
            xx = -2.5 + (((tickAnim - 75) / 35) * (0-(-2.5)));
            yy = 0 + (((tickAnim - 75) / 35) * (0-(0)));
            zz = 0 + (((tickAnim - 75) / 35) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(hips, hips.rotateAngleX + (float) Math.toRadians(xx), hips.rotateAngleY + (float) Math.toRadians(yy), hips.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (8.45-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 75) {
            xx = 0 + (((tickAnim - 40) / 35) * (0-(0)));
            yy = 0 + (((tickAnim - 40) / 35) * (0-(0)));
            zz = 8.45 + (((tickAnim - 40) / 35) * (8.45-(8.45)));
        }
        else if (tickAnim >= 75 && tickAnim < 110) {
            xx = 0 + (((tickAnim - 75) / 35) * (0-(0)));
            yy = 0 + (((tickAnim - 75) / 35) * (0-(0)));
            zz = 8.45 + (((tickAnim - 75) / 35) * (0-(8.45)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.hips.rotationPointX = this.hips.rotationPointX + (float)(xx);
        this.hips.rotationPointY = this.hips.rotationPointY - (float)(yy);
        this.hips.rotationPointZ = this.hips.rotationPointZ + (float)(zz);



        this.setRotateAngle(sailEnd, sailEnd.rotateAngleX + (float) Math.toRadians(0), sailEnd.rotateAngleY + (float) Math.toRadians(0), sailEnd.rotateAngleZ + (float) Math.toRadians(0));

        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (1.025-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 75) {
            xx = 0 + (((tickAnim - 40) / 35) * (0-(0)));
            yy = 0 + (((tickAnim - 40) / 35) * (0-(0)));
            zz = 1.025 + (((tickAnim - 40) / 35) * (1.025-(1.025)));
        }
        else if (tickAnim >= 75 && tickAnim < 110) {
            xx = 0 + (((tickAnim - 75) / 35) * (0-(0)));
            yy = 0 + (((tickAnim - 75) / 35) * (0-(0)));
            zz = 1.025 + (((tickAnim - 75) / 35) * (0-(1.025)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.sailEnd.rotationPointX = this.sailEnd.rotationPointX + (float)(xx);
        this.sailEnd.rotationPointY = this.sailEnd.rotationPointY - (float)(yy);
        this.sailEnd.rotationPointZ = this.sailEnd.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (-16.25-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 75) {
            xx = -16.25 + (((tickAnim - 40) / 35) * (-16.25-(-16.25)));
            yy = 0 + (((tickAnim - 40) / 35) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 35) * (0-(0)));
        }
        else if (tickAnim >= 75 && tickAnim < 110) {
            xx = -16.25 + (((tickAnim - 75) / 35) * (0-(-16.25)));
            yy = 0 + (((tickAnim - 75) / 35) * (0-(0)));
            zz = 0 + (((tickAnim - 75) / 35) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg1, leftLeg1.rotateAngleX + (float) Math.toRadians(xx), leftLeg1.rotateAngleY + (float) Math.toRadians(yy), leftLeg1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (-6.25-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 75) {
            xx = -6.25 + (((tickAnim - 40) / 35) * (-6.25-(-6.25)));
            yy = 0 + (((tickAnim - 40) / 35) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 35) * (0-(0)));
        }
        else if (tickAnim >= 75 && tickAnim < 110) {
            xx = -6.25 + (((tickAnim - 75) / 35) * (0-(-6.25)));
            yy = 0 + (((tickAnim - 75) / 35) * (0-(0)));
            zz = 0 + (((tickAnim - 75) / 35) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg2, leftLeg2.rotateAngleX + (float) Math.toRadians(xx), leftLeg2.rotateAngleY + (float) Math.toRadians(yy), leftLeg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (24.83708-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (-4.04075-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (-5.17659-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 75) {
            xx = 24.83708 + (((tickAnim - 40) / 35) * (24.83708-(24.83708)));
            yy = -4.04075 + (((tickAnim - 40) / 35) * (-4.04075-(-4.04075)));
            zz = -5.17659 + (((tickAnim - 40) / 35) * (-5.17659-(-5.17659)));
        }
        else if (tickAnim >= 75 && tickAnim < 110) {
            xx = 24.83708 + (((tickAnim - 75) / 35) * (0-(24.83708)));
            yy = -4.04075 + (((tickAnim - 75) / 35) * (0-(-4.04075)));
            zz = -5.17659 + (((tickAnim - 75) / 35) * (0-(-5.17659)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg3, leftLeg3.rotateAngleX + (float) Math.toRadians(xx), leftLeg3.rotateAngleY + (float) Math.toRadians(yy), leftLeg3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*5 + (((tickAnim - 0) / 40) * (4.5-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*5)));
            zz = 0 + (((tickAnim - 0) / 40) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 75) {
            xx = 0 + (((tickAnim - 40) / 35) * (0-(0)));
            yy = 4.5 + (((tickAnim - 40) / 35) * (5.75-(4.5)));
            zz = 0 + (((tickAnim - 40) / 35) * (0-(0)));
        }
        else if (tickAnim >= 75 && tickAnim < 110) {
            xx = 0 + (((tickAnim - 75) / 35) * (0-(0)));
            yy = 5.75 + (((tickAnim - 75) / 35) * (0-(5.75)));
            zz = 0 + (((tickAnim - 75) / 35) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail1, tail1.rotateAngleX + (float) Math.toRadians(xx), tail1.rotateAngleY + (float) Math.toRadians(yy), tail1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (9.5-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 75) {
            xx = 0 + (((tickAnim - 40) / 35) * (0-(0)));
            yy = 9.5 + (((tickAnim - 40) / 35) * (10-(9.5)));
            zz = 0 + (((tickAnim - 40) / 35) * (0-(0)));
        }
        else if (tickAnim >= 75 && tickAnim < 110) {
            xx = 0 + (((tickAnim - 75) / 35) * (0-(0)));
            yy = 10 + (((tickAnim - 75) / 35) * (0-(10)));
            zz = 0 + (((tickAnim - 75) / 35) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(xx), tail2.rotateAngleY + (float) Math.toRadians(yy), tail2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            yy = 3.825+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-50))*5 + (((tickAnim - 0) / 40) * (8-(3.825+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-50))*5)));
            zz = 0 + (((tickAnim - 0) / 40) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 75) {
            xx = 0 + (((tickAnim - 40) / 35) * (0-(0)));
            yy = 8 + (((tickAnim - 40) / 35) * (8.75-(8)));
            zz = 0 + (((tickAnim - 40) / 35) * (0-(0)));
        }
        else if (tickAnim >= 75 && tickAnim < 110) {
            xx = 0 + (((tickAnim - 75) / 35) * (0-(0)));
            yy = 8.75 + (((tickAnim - 75) / 35) * (0-(8.75)));
            zz = 0 + (((tickAnim - 75) / 35) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(xx), tail3.rotateAngleY + (float) Math.toRadians(yy), tail3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            yy = 3.85+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-50))*5 + (((tickAnim - 0) / 40) * (5.25-(3.85+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-50))*5)));
            zz = 0 + (((tickAnim - 0) / 40) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 75) {
            xx = 0 + (((tickAnim - 40) / 35) * (0-(0)));
            yy = 5.25 + (((tickAnim - 40) / 35) * (5.75-(5.25)));
            zz = 0 + (((tickAnim - 40) / 35) * (0-(0)));
        }
        else if (tickAnim >= 75 && tickAnim < 110) {
            xx = 0 + (((tickAnim - 75) / 35) * (0-(0)));
            yy = 5.75 + (((tickAnim - 75) / 35) * (0-(5.75)));
            zz = 0 + (((tickAnim - 75) / 35) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(xx), tail4.rotateAngleY + (float) Math.toRadians(yy), tail4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 75) {
            xx = 0 + (((tickAnim - 0) / 75) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 75) * (1.5-(0)));
            zz = 0 + (((tickAnim - 0) / 75) * (0-(0)));
        }
        else if (tickAnim >= 75 && tickAnim < 110) {
            xx = 0 + (((tickAnim - 75) / 35) * (0-(0)));
            yy = 1.5 + (((tickAnim - 75) / 35) * (0-(1.5)));
            zz = 0 + (((tickAnim - 75) / 35) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail5, tail5.rotateAngleX + (float) Math.toRadians(xx), tail5.rotateAngleY + (float) Math.toRadians(yy), tail5.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 75) {
            xx = 0 + (((tickAnim - 0) / 75) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 75) * (1.5-(0)));
            zz = 0 + (((tickAnim - 0) / 75) * (0-(0)));
        }
        else if (tickAnim >= 75 && tickAnim < 110) {
            xx = 0 + (((tickAnim - 75) / 35) * (0-(0)));
            yy = 1.5 + (((tickAnim - 75) / 35) * (0-(1.5)));
            zz = 0 + (((tickAnim - 75) / 35) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail6, tail6.rotateAngleX + (float) Math.toRadians(xx), tail6.rotateAngleY + (float) Math.toRadians(yy), tail6.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (-4.5-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 75) {
            xx = -4.5 + (((tickAnim - 40) / 35) * (-4.5-(-4.5)));
            yy = 0 + (((tickAnim - 40) / 35) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 35) * (0-(0)));
        }
        else if (tickAnim >= 75 && tickAnim < 110) {
            xx = -4.5 + (((tickAnim - 75) / 35) * (0-(-4.5)));
            yy = 0 + (((tickAnim - 75) / 35) * (0-(0)));
            zz = 0 + (((tickAnim - 75) / 35) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(xx), body.rotateAngleY + (float) Math.toRadians(yy), body.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (1.25-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 75) {
            xx = 1.25 + (((tickAnim - 40) / 35) * (1.25-(1.25)));
            yy = 0 + (((tickAnim - 40) / 35) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 35) * (0-(0)));
        }
        else if (tickAnim >= 75 && tickAnim < 110) {
            xx = 1.25 + (((tickAnim - 75) / 35) * (0-(1.25)));
            yy = 0 + (((tickAnim - 75) / 35) * (0-(0)));
            zz = 0 + (((tickAnim - 75) / 35) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(sailMiddle, sailMiddle.rotateAngleX + (float) Math.toRadians(xx), sailMiddle.rotateAngleY + (float) Math.toRadians(yy), sailMiddle.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (-0.6-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (-0.7-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 75) {
            xx = 0 + (((tickAnim - 40) / 35) * (0-(0)));
            yy = -0.6 + (((tickAnim - 40) / 35) * (-0.6-(-0.6)));
            zz = -0.7 + (((tickAnim - 40) / 35) * (-0.7-(-0.7)));
        }
        else if (tickAnim >= 75 && tickAnim < 110) {
            xx = 0 + (((tickAnim - 75) / 35) * (0-(0)));
            yy = -0.6 + (((tickAnim - 75) / 35) * (0-(-0.6)));
            zz = -0.7 + (((tickAnim - 75) / 35) * (0-(-0.7)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.sailMiddle.rotationPointX = this.sailMiddle.rotationPointX + (float)(xx);
        this.sailMiddle.rotationPointY = this.sailMiddle.rotationPointY - (float)(yy);
        this.sailMiddle.rotationPointZ = this.sailMiddle.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (-3.5-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 75) {
            xx = -3.5 + (((tickAnim - 40) / 35) * (-3.5-(-3.5)));
            yy = 0 + (((tickAnim - 40) / 35) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 35) * (0-(0)));
        }
        else if (tickAnim >= 75 && tickAnim < 110) {
            xx = -3.5 + (((tickAnim - 75) / 35) * (0-(-3.5)));
            yy = 0 + (((tickAnim - 75) / 35) * (0-(0)));
            zz = 0 + (((tickAnim - 75) / 35) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(xx), chest.rotateAngleY + (float) Math.toRadians(yy), chest.rotateAngleZ + (float) Math.toRadians(zz));



        this.setRotateAngle(sailFront, sailFront.rotateAngleX + (float) Math.toRadians(0), sailFront.rotateAngleY + (float) Math.toRadians(0), sailFront.rotateAngleZ + (float) Math.toRadians(0));

        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (-0.375-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (-2.1-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 75) {
            xx = 0 + (((tickAnim - 40) / 35) * (0-(0)));
            yy = -0.375 + (((tickAnim - 40) / 35) * (-0.375-(-0.375)));
            zz = -2.1 + (((tickAnim - 40) / 35) * (-2.1-(-2.1)));
        }
        else if (tickAnim >= 75 && tickAnim < 110) {
            xx = 0 + (((tickAnim - 75) / 35) * (0-(0)));
            yy = -0.375 + (((tickAnim - 75) / 35) * (0-(-0.375)));
            zz = -2.1 + (((tickAnim - 75) / 35) * (0-(-2.1)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.sailFront.rotationPointX = this.sailFront.rotationPointX + (float)(xx);
        this.sailFront.rotationPointY = this.sailFront.rotationPointY - (float)(yy);
        this.sailFront.rotationPointZ = this.sailFront.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (-16.75-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 75) {
            xx = 0 + (((tickAnim - 40) / 35) * (0-(0)));
            yy = 0 + (((tickAnim - 40) / 35) * (0-(0)));
            zz = -16.75 + (((tickAnim - 40) / 35) * (-19-(-16.75)));
        }
        else if (tickAnim >= 75 && tickAnim < 110) {
            xx = 0 + (((tickAnim - 75) / 35) * (0-(0)));
            yy = 0 + (((tickAnim - 75) / 35) * (0-(0)));
            zz = -19 + (((tickAnim - 75) / 35) * (0-(-19)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm1, leftArm1.rotateAngleX + (float) Math.toRadians(xx), leftArm1.rotateAngleY + (float) Math.toRadians(yy), leftArm1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (-2.25-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 75) {
            xx = -2.25 + (((tickAnim - 40) / 35) * (-2.25-(-2.25)));
            yy = 0 + (((tickAnim - 40) / 35) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 35) * (0-(0)));
        }
        else if (tickAnim >= 75 && tickAnim < 110) {
            xx = -2.25 + (((tickAnim - 75) / 35) * (0-(-2.25)));
            yy = 0 + (((tickAnim - 75) / 35) * (0-(0)));
            zz = 0 + (((tickAnim - 75) / 35) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck1, neck1.rotateAngleX + (float) Math.toRadians(xx), neck1.rotateAngleY + (float) Math.toRadians(yy), neck1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (-6.5-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 75) {
            xx = -6.5 + (((tickAnim - 40) / 35) * (-6.5-(-6.5)));
            yy = 0 + (((tickAnim - 40) / 35) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 35) * (0-(0)));
        }
        else if (tickAnim >= 75 && tickAnim < 110) {
            xx = -6.5 + (((tickAnim - 75) / 35) * (0-(-6.5)));
            yy = 0 + (((tickAnim - 75) / 35) * (0-(0)));
            zz = 0 + (((tickAnim - 75) / 35) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(xx), neck2.rotateAngleY + (float) Math.toRadians(yy), neck2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (-0.3-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0.775-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 75) {
            xx = 0 + (((tickAnim - 40) / 35) * (0-(0)));
            yy = -0.3 + (((tickAnim - 40) / 35) * (-0.3-(-0.3)));
            zz = 0.775 + (((tickAnim - 40) / 35) * (0.775-(0.775)));
        }
        else if (tickAnim >= 75 && tickAnim < 110) {
            xx = 0 + (((tickAnim - 75) / 35) * (0-(0)));
            yy = -0.3 + (((tickAnim - 75) / 35) * (0-(-0.3)));
            zz = 0.775 + (((tickAnim - 75) / 35) * (0-(0.775)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.neck2.rotationPointX = this.neck2.rotationPointX + (float)(xx);
        this.neck2.rotationPointY = this.neck2.rotationPointY - (float)(yy);
        this.neck2.rotationPointZ = this.neck2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (4.75-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 75) {
            xx = 4.75 + (((tickAnim - 40) / 35) * (4.75-(4.75)));
            yy = 0 + (((tickAnim - 40) / 35) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 35) * (0-(0)));
        }
        else if (tickAnim >= 75 && tickAnim < 110) {
            xx = 4.75 + (((tickAnim - 75) / 35) * (0-(4.75)));
            yy = 0 + (((tickAnim - 75) / 35) * (0-(0)));
            zz = 0 + (((tickAnim - 75) / 35) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(xx), neck3.rotateAngleY + (float) Math.toRadians(yy), neck3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (14.75-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 75) {
            xx = 14.75 + (((tickAnim - 40) / 35) * (12-(14.75)));
            yy = 0 + (((tickAnim - 40) / 35) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 35) * (0-(0)));
        }
        else if (tickAnim >= 75 && tickAnim < 110) {
            xx = 12 + (((tickAnim - 75) / 35) * (0-(12)));
            yy = 0 + (((tickAnim - 75) / 35) * (0-(0)));
            zz = 0 + (((tickAnim - 75) / 35) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck4, neck4.rotateAngleX + (float) Math.toRadians(xx), neck4.rotateAngleY + (float) Math.toRadians(yy), neck4.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (0.3-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (1.875-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 75) {
            xx = 0 + (((tickAnim - 40) / 35) * (0-(0)));
            yy = 0.3 + (((tickAnim - 40) / 35) * (0.3-(0.3)));
            zz = 1.875 + (((tickAnim - 40) / 35) * (1.875-(1.875)));
        }
        else if (tickAnim >= 75 && tickAnim < 110) {
            xx = 0 + (((tickAnim - 75) / 35) * (0-(0)));
            yy = 0.3 + (((tickAnim - 75) / 35) * (0-(0.3)));
            zz = 1.875 + (((tickAnim - 75) / 35) * (0-(1.875)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.neck4.rotationPointX = this.neck4.rotationPointX + (float)(xx);
        this.neck4.rotationPointY = this.neck4.rotationPointY - (float)(yy);
        this.neck4.rotationPointZ = this.neck4.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (7-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 56) {
            xx = 7 + (((tickAnim - 40) / 16) * (7-(7)));
            yy = 0 + (((tickAnim - 40) / 16) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 16) * (0-(0)));
        }
        else if (tickAnim >= 56 && tickAnim < 75) {
            xx = 7 + (((tickAnim - 56) / 19) * (9.5-(7)));
            yy = 0 + (((tickAnim - 56) / 19) * (0-(0)));
            zz = 0 + (((tickAnim - 56) / 19) * (0-(0)));
        }
        else if (tickAnim >= 75 && tickAnim < 110) {
            xx = 9.5 + (((tickAnim - 75) / 35) * (0-(9.5)));
            yy = 0 + (((tickAnim - 75) / 35) * (0-(0)));
            zz = 0 + (((tickAnim - 75) / 35) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 56 && tickAnim < 67) {
            xx = 0 + (((tickAnim - 56) / 11) * (2-(0)));
            yy = 0 + (((tickAnim - 56) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 56) / 11) * (0-(0)));
        }
        else if (tickAnim >= 67 && tickAnim < 75) {
            xx = 2 + (((tickAnim - 67) / 8) * (0-(2)));
            yy = 0 + (((tickAnim - 67) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 67) / 8) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(xx), jaw.rotateAngleY + (float) Math.toRadians(yy), jaw.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (-16.25-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 75) {
            xx = -16.25 + (((tickAnim - 40) / 35) * (-16.25-(-16.25)));
            yy = 0 + (((tickAnim - 40) / 35) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 35) * (0-(0)));
        }
        else if (tickAnim >= 75 && tickAnim < 110) {
            xx = -16.25 + (((tickAnim - 75) / 35) * (0-(-16.25)));
            yy = 0 + (((tickAnim - 75) / 35) * (0-(0)));
            zz = 0 + (((tickAnim - 75) / 35) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(throat1, throat1.rotateAngleX + (float) Math.toRadians(xx), throat1.rotateAngleY + (float) Math.toRadians(yy), throat1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (22-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 75) {
            xx = 22 + (((tickAnim - 40) / 35) * (22-(22)));
            yy = 0 + (((tickAnim - 40) / 35) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 35) * (0-(0)));
        }
        else if (tickAnim >= 75 && tickAnim < 93) {
            xx = 22 + (((tickAnim - 75) / 18) * (-15.52-(22)));
            yy = 0 + (((tickAnim - 75) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 75) / 18) * (0-(0)));
        }
        else if (tickAnim >= 93 && tickAnim < 110) {
            xx = -15.52 + (((tickAnim - 93) / 17) * (0-(-15.52)));
            yy = 0 + (((tickAnim - 93) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 93) / 17) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg1, rightLeg1.rotateAngleX + (float) Math.toRadians(xx), rightLeg1.rotateAngleY + (float) Math.toRadians(yy), rightLeg1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (36.88-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 40) {
            xx = 36.88 + (((tickAnim - 20) / 20) * (-7.25-(36.88)));
            yy = 0 + (((tickAnim - 20) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 20) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 75) {
            xx = -7.25 + (((tickAnim - 40) / 35) * (-7.25-(-7.25)));
            yy = 0 + (((tickAnim - 40) / 35) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 35) * (0-(0)));
        }
        else if (tickAnim >= 75 && tickAnim < 93) {
            xx = -7.25 + (((tickAnim - 75) / 18) * (30.8-(-7.25)));
            yy = 0 + (((tickAnim - 75) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 75) / 18) * (0-(0)));
        }
        else if (tickAnim >= 93 && tickAnim < 110) {
            xx = 30.8 + (((tickAnim - 93) / 17) * (0-(30.8)));
            yy = 0 + (((tickAnim - 93) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 93) / 17) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg2, rightLeg2.rotateAngleX + (float) Math.toRadians(xx), rightLeg2.rotateAngleY + (float) Math.toRadians(yy), rightLeg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (-28.21458-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0.10656-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (-0.42138-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 40) {
            xx = -28.21458 + (((tickAnim - 20) / 20) * (8.07085-(-28.21458)));
            yy = 0.10656 + (((tickAnim - 20) / 20) * (0.21312-(0.10656)));
            zz = -0.42138 + (((tickAnim - 20) / 20) * (-0.84275-(-0.42138)));
        }
        else if (tickAnim >= 40 && tickAnim < 75) {
            xx = 8.07085 + (((tickAnim - 40) / 35) * (8.07085-(8.07085)));
            yy = 0.21312 + (((tickAnim - 40) / 35) * (0.21312-(0.21312)));
            zz = -0.84275 + (((tickAnim - 40) / 35) * (-0.84275-(-0.84275)));
        }
        else if (tickAnim >= 75 && tickAnim < 93) {
            xx = 8.07085 + (((tickAnim - 75) / 18) * (-38.40674-(8.07085)));
            yy = 0.21312 + (((tickAnim - 75) / 18) * (0.10148-(0.21312)));
            zz = -0.84275 + (((tickAnim - 75) / 18) * (-0.40131-(-0.84275)));
        }
        else if (tickAnim >= 93 && tickAnim < 110) {
            xx = -38.40674 + (((tickAnim - 93) / 17) * (0-(-38.40674)));
            yy = 0.10148 + (((tickAnim - 93) / 17) * (0-(0.10148)));
            zz = -0.40131 + (((tickAnim - 93) / 17) * (0-(-0.40131)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg3, rightLeg3.rotateAngleX + (float) Math.toRadians(xx), rightLeg3.rotateAngleY + (float) Math.toRadians(yy), rightLeg3.rotateAngleZ + (float) Math.toRadians(zz));

        this.rightLeg3.rotationPointX = this.rightLeg3.rotationPointX + (float)(0);
        this.rightLeg3.rotationPointY = this.rightLeg3.rotationPointY - (float)(0);
        this.rightLeg3.rotationPointZ = this.rightLeg3.rotationPointZ + (float)(0);



        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (57.19293-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (1.03387-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0.72048-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 40) {
            xx = 57.19293 + (((tickAnim - 20) / 20) * (-20.11414-(57.19293)));
            yy = 1.03387 + (((tickAnim - 20) / 20) * (2.06775-(1.03387)));
            zz = 0.72048 + (((tickAnim - 20) / 20) * (1.44095-(0.72048)));
        }
        else if (tickAnim >= 40 && tickAnim < 75) {
            xx = -20.11414 + (((tickAnim - 40) / 35) * (-20.11414-(-20.11414)));
            yy = 2.06775 + (((tickAnim - 40) / 35) * (2.06775-(2.06775)));
            zz = 1.44095 + (((tickAnim - 40) / 35) * (1.44095-(1.44095)));
        }
        else if (tickAnim >= 75 && tickAnim < 93) {
            xx = -20.11414 + (((tickAnim - 75) / 18) * (73.42184-(-20.11414)));
            yy = 2.06775 + (((tickAnim - 75) / 18) * (0.98464-(2.06775)));
            zz = 1.44095 + (((tickAnim - 75) / 18) * (0.68617-(1.44095)));
        }
        else if (tickAnim >= 93 && tickAnim < 110) {
            xx = 73.42184 + (((tickAnim - 93) / 17) * (0-(73.42184)));
            yy = 0.98464 + (((tickAnim - 93) / 17) * (0-(0.98464)));
            zz = 0.68617 + (((tickAnim - 93) / 17) * (0-(0.68617)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightFoot, rightFoot.rotateAngleX + (float) Math.toRadians(xx), rightFoot.rotateAngleY + (float) Math.toRadians(yy), rightFoot.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (-0.175-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 75) {
            xx = 0 + (((tickAnim - 40) / 35) * (0-(0)));
            yy = -0.175 + (((tickAnim - 40) / 35) * (-0.175-(-0.175)));
            zz = 0 + (((tickAnim - 40) / 35) * (0-(0)));
        }
        else if (tickAnim >= 75 && tickAnim < 110) {
            xx = 0 + (((tickAnim - 75) / 35) * (0-(0)));
            yy = -0.175 + (((tickAnim - 75) / 35) * (0-(-0.175)));
            zz = 0 + (((tickAnim - 75) / 35) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightFoot.rotationPointX = this.rightFoot.rotationPointX + (float)(xx);
        this.rightFoot.rotationPointY = this.rightFoot.rotationPointY - (float)(yy);
        this.rightFoot.rotationPointZ = this.rightFoot.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (20.5-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 75) {
            xx = 0 + (((tickAnim - 40) / 35) * (0-(0)));
            yy = 0 + (((tickAnim - 40) / 35) * (0-(0)));
            zz = 20.5 + (((tickAnim - 40) / 35) * (23.5-(20.5)));
        }
        else if (tickAnim >= 75 && tickAnim < 110) {
            xx = 0 + (((tickAnim - 75) / 35) * (0-(0)));
            yy = 0 + (((tickAnim - 75) / 35) * (0-(0)));
            zz = 23.5 + (((tickAnim - 75) / 35) * (0-(23.5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm1, rightArm1.rotateAngleX + (float) Math.toRadians(xx), rightArm1.rotateAngleY + (float) Math.toRadians(yy), rightArm1.rotateAngleZ + (float) Math.toRadians(zz));

    }
    public void animRelax(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraSpinosaurus entity = (EntityPrehistoricFloraSpinosaurus) entitylivingbaseIn;
        int animCycle = 550;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 80) {
            xx = 0 + (((tickAnim - 0) / 80) * (-12.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-5-(0)));
            yy = 0 + (((tickAnim - 0) / 80) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 80) * (0-(0)));
        }
        else if (tickAnim >= 80 && tickAnim < 120) {
            xx = -12.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-5 + (((tickAnim - 80) / 40) * (2.75-(-12.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-5)));
            yy = 0 + (((tickAnim - 80) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 80) / 40) * (0-(0)));
        }
        else if (tickAnim >= 120 && tickAnim < 220) {
            xx = 2.75 + (((tickAnim - 120) / 100) * (2.75-(2.75)));
            yy = 0 + (((tickAnim - 120) / 100) * (0-(0)));
            zz = 0 + (((tickAnim - 120) / 100) * (0-(0)));
        }
        else if (tickAnim >= 220 && tickAnim < 450) {
            xx = 2.75 + (((tickAnim - 220) / 230) * (2.75-(2.75)));
            yy = 0 + (((tickAnim - 220) / 230) * (0-(0)));
            zz = 0 + (((tickAnim - 220) / 230) * (0-(0)));
        }
        else if (tickAnim >= 450 && tickAnim < 495) {
            xx = 2.75 + (((tickAnim - 450) / 45) * (10.5-(2.75)));
            yy = 0 + (((tickAnim - 450) / 45) * (0-(0)));
            zz = 0 + (((tickAnim - 450) / 45) * (0-(0)));
        }
        else if (tickAnim >= 495 && tickAnim < 550) {
            xx = 10.5 + (((tickAnim - 495) / 55) * (0-(10.5)));
            yy = 0 + (((tickAnim - 495) / 55) * (0-(0)));
            zz = 0 + (((tickAnim - 495) / 55) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(hips, hips.rotateAngleX + (float) Math.toRadians(xx), hips.rotateAngleY + (float) Math.toRadians(yy), hips.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (-9.285-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (6.37-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 80) {
            xx = 0 + (((tickAnim - 40) / 40) * (0-(0)));
            yy = -9.285 + (((tickAnim - 40) / 40) * (-16.3-(-9.285)));
            zz = 6.37 + (((tickAnim - 40) / 40) * (12.65-(6.37)));
        }
        else if (tickAnim >= 80 && tickAnim < 120) {
            xx = 0 + (((tickAnim - 80) / 40) * (0-(0)));
            yy = -16.3 + (((tickAnim - 80) / 40) * (-19.58-(-16.3)));
            zz = 12.65 + (((tickAnim - 80) / 40) * (12.65-(12.65)));
        }
        else if (tickAnim >= 120 && tickAnim < 220) {
            xx = 0 + (((tickAnim - 120) / 100) * (0-(0)));
            yy = -19.58 + (((tickAnim - 120) / 100) * (-19.58-(-19.58)));
            zz = 12.65 + (((tickAnim - 120) / 100) * (12.65-(12.65)));
        }
        else if (tickAnim >= 220 && tickAnim < 450) {
            xx = 0 + (((tickAnim - 220) / 230) * (0-(0)));
            yy = -19.58 + (((tickAnim - 220) / 230) * (-19.58-(-19.58)));
            zz = 12.65 + (((tickAnim - 220) / 230) * (12.65-(12.65)));
        }
        else if (tickAnim >= 450 && tickAnim < 495) {
            xx = 0 + (((tickAnim - 450) / 45) * (0-(0)));
            yy = -19.58 + (((tickAnim - 450) / 45) * (-10.58-(-19.58)));
            zz = 12.65 + (((tickAnim - 450) / 45) * (5.75-(12.65)));
        }
        else if (tickAnim >= 495 && tickAnim < 550) {
            xx = 0 + (((tickAnim - 495) / 55) * (0-(0)));
            yy = -10.58 + (((tickAnim - 495) / 55) * (0-(-10.58)));
            zz = 5.75 + (((tickAnim - 495) / 55) * (0-(5.75)));
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
            xx = 0 + (((tickAnim - 0) / 80) * (-46.41063-(0)));
            yy = 0 + (((tickAnim - 0) / 80) * (-24.49705-(0)));
            zz = 0 + (((tickAnim - 0) / 80) * (-2.48629-(0)));
        }
        else if (tickAnim >= 80 && tickAnim < 120) {
            xx = -46.41063 + (((tickAnim - 80) / 40) * (-73.62319-(-46.41063)));
            yy = -24.49705 + (((tickAnim - 80) / 40) * (-29.6925-(-24.49705)));
            zz = -2.48629 + (((tickAnim - 80) / 40) * (1.52179-(-2.48629)));
        }
        else if (tickAnim >= 120 && tickAnim < 220) {
            xx = -73.62319 + (((tickAnim - 120) / 100) * (-73.62319-(-73.62319)));
            yy = -29.6925 + (((tickAnim - 120) / 100) * (-29.6925-(-29.6925)));
            zz = 1.52179 + (((tickAnim - 120) / 100) * (1.52179-(1.52179)));
        }
        else if (tickAnim >= 220 && tickAnim < 450) {
            xx = -73.62319 + (((tickAnim - 220) / 230) * (-73.62319-(-73.62319)));
            yy = -29.6925 + (((tickAnim - 220) / 230) * (-29.6925-(-29.6925)));
            zz = 1.52179 + (((tickAnim - 220) / 230) * (1.52179-(1.52179)));
        }
        else if (tickAnim >= 450 && tickAnim < 495) {
            xx = -73.62319 + (((tickAnim - 450) / 45) * (-48.92825-(-73.62319)));
            yy = -29.6925 + (((tickAnim - 450) / 45) * (-25.4917-(-29.6925)));
            zz = 1.52179 + (((tickAnim - 450) / 45) * (5.95398-(1.52179)));
        }
        else if (tickAnim >= 495 && tickAnim < 550) {
            xx = -48.92825 + (((tickAnim - 495) / 55) * (0-(-48.92825)));
            yy = -25.4917 + (((tickAnim - 495) / 55) * (0-(-25.4917)));
            zz = 5.95398 + (((tickAnim - 495) / 55) * (0-(5.95398)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg1, leftLeg1.rotateAngleX + (float) Math.toRadians(xx), leftLeg1.rotateAngleY + (float) Math.toRadians(yy), leftLeg1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 80) {
            xx = 0 + (((tickAnim - 0) / 80) * (42.5-(0)));
            yy = 0 + (((tickAnim - 0) / 80) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 80) * (0-(0)));
        }
        else if (tickAnim >= 80 && tickAnim < 120) {
            xx = 42.5 + (((tickAnim - 80) / 40) * (48.14369-(42.5)));
            yy = 0 + (((tickAnim - 80) / 40) * (-2.13146-(0)));
            zz = 0 + (((tickAnim - 80) / 40) * (-7.71261-(0)));
        }
        else if (tickAnim >= 120 && tickAnim < 220) {
            xx = 48.14369 + (((tickAnim - 120) / 100) * (48.14369-(48.14369)));
            yy = -2.13146 + (((tickAnim - 120) / 100) * (-2.13146-(-2.13146)));
            zz = -7.71261 + (((tickAnim - 120) / 100) * (-7.71261-(-7.71261)));
        }
        else if (tickAnim >= 220 && tickAnim < 450) {
            xx = 48.14369 + (((tickAnim - 220) / 230) * (48.14369-(48.14369)));
            yy = -2.13146 + (((tickAnim - 220) / 230) * (-2.13146-(-2.13146)));
            zz = -7.71261 + (((tickAnim - 220) / 230) * (-7.71261-(-7.71261)));
        }
        else if (tickAnim >= 450 && tickAnim < 495) {
            xx = 48.14369 + (((tickAnim - 450) / 45) * (45.64369-(48.14369)));
            yy = -2.13146 + (((tickAnim - 450) / 45) * (-2.13146-(-2.13146)));
            zz = -7.71261 + (((tickAnim - 450) / 45) * (-7.71261-(-7.71261)));
        }
        else if (tickAnim >= 495 && tickAnim < 550) {
            xx = 45.64369 + (((tickAnim - 495) / 55) * (0-(45.64369)));
            yy = -2.13146 + (((tickAnim - 495) / 55) * (0-(-2.13146)));
            zz = -7.71261 + (((tickAnim - 495) / 55) * (0-(-7.71261)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg2, leftLeg2.rotateAngleX + (float) Math.toRadians(xx), leftLeg2.rotateAngleY + (float) Math.toRadians(yy), leftLeg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 80) {
            xx = 0 + (((tickAnim - 0) / 80) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 80) * (0.975-(0)));
            zz = 0 + (((tickAnim - 0) / 80) * (-1.375-(0)));
        }
        else if (tickAnim >= 80 && tickAnim < 120) {
            xx = 0 + (((tickAnim - 80) / 40) * (0-(0)));
            yy = 0.975 + (((tickAnim - 80) / 40) * (0.53-(0.975)));
            zz = -1.375 + (((tickAnim - 80) / 40) * (-1.27-(-1.375)));
        }
        else if (tickAnim >= 120 && tickAnim < 220) {
            xx = 0 + (((tickAnim - 120) / 100) * (0-(0)));
            yy = 0.53 + (((tickAnim - 120) / 100) * (0.53-(0.53)));
            zz = -1.27 + (((tickAnim - 120) / 100) * (-1.27-(-1.27)));
        }
        else if (tickAnim >= 220 && tickAnim < 450) {
            xx = 0 + (((tickAnim - 220) / 230) * (0-(0)));
            yy = 0.53 + (((tickAnim - 220) / 230) * (0.53-(0.53)));
            zz = -1.27 + (((tickAnim - 220) / 230) * (-1.27-(-1.27)));
        }
        else if (tickAnim >= 450 && tickAnim < 495) {
            xx = 0 + (((tickAnim - 450) / 45) * (0-(0)));
            yy = 0.53 + (((tickAnim - 450) / 45) * (0.53-(0.53)));
            zz = -1.27 + (((tickAnim - 450) / 45) * (-0.47-(-1.27)));
        }
        else if (tickAnim >= 495 && tickAnim < 550) {
            xx = 0 + (((tickAnim - 495) / 55) * (0-(0)));
            yy = 0.53 + (((tickAnim - 495) / 55) * (0-(0.53)));
            zz = -0.47 + (((tickAnim - 495) / 55) * (0-(-0.47)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftLeg2.rotationPointX = this.leftLeg2.rotationPointX + (float)(xx);
        this.leftLeg2.rotationPointY = this.leftLeg2.rotationPointY - (float)(yy);
        this.leftLeg2.rotationPointZ = this.leftLeg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 80) {
            xx = 0 + (((tickAnim - 0) / 80) * (-49-(0)));
            yy = 0 + (((tickAnim - 0) / 80) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 80) * (0-(0)));
        }
        else if (tickAnim >= 80 && tickAnim < 120) {
            xx = -49 + (((tickAnim - 80) / 40) * (-42-(-49)));
            yy = 0 + (((tickAnim - 80) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 80) / 40) * (0-(0)));
        }
        else if (tickAnim >= 120 && tickAnim < 220) {
            xx = -42 + (((tickAnim - 120) / 100) * (-42-(-42)));
            yy = 0 + (((tickAnim - 120) / 100) * (0-(0)));
            zz = 0 + (((tickAnim - 120) / 100) * (0-(0)));
        }
        else if (tickAnim >= 220 && tickAnim < 450) {
            xx = -42 + (((tickAnim - 220) / 230) * (-42-(-42)));
            yy = 0 + (((tickAnim - 220) / 230) * (0-(0)));
            zz = 0 + (((tickAnim - 220) / 230) * (0-(0)));
        }
        else if (tickAnim >= 450 && tickAnim < 495) {
            xx = -42 + (((tickAnim - 450) / 45) * (-58-(-42)));
            yy = 0 + (((tickAnim - 450) / 45) * (0-(0)));
            zz = 0 + (((tickAnim - 450) / 45) * (0-(0)));
        }
        else if (tickAnim >= 495 && tickAnim < 550) {
            xx = -58 + (((tickAnim - 495) / 55) * (0-(-58)));
            yy = 0 + (((tickAnim - 495) / 55) * (0-(0)));
            zz = 0 + (((tickAnim - 495) / 55) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg3, leftLeg3.rotateAngleX + (float) Math.toRadians(xx), leftLeg3.rotateAngleY + (float) Math.toRadians(yy), leftLeg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 80) {
            xx = 0 + (((tickAnim - 0) / 80) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 80) * (-0.6-(0)));
            zz = 0 + (((tickAnim - 0) / 80) * (0-(0)));
        }
        else if (tickAnim >= 80 && tickAnim < 98) {
            xx = 0 + (((tickAnim - 80) / 18) * (0-(0)));
            yy = -0.6 + (((tickAnim - 80) / 18) * (1.65-(-0.6)));
            zz = 0 + (((tickAnim - 80) / 18) * (0-(0)));
        }
        else if (tickAnim >= 98 && tickAnim < 120) {
            xx = 0 + (((tickAnim - 98) / 22) * (0-(0)));
            yy = 1.65 + (((tickAnim - 98) / 22) * (3.05-(1.65)));
            zz = 0 + (((tickAnim - 98) / 22) * (0-(0)));
        }
        else if (tickAnim >= 120 && tickAnim < 220) {
            xx = 0 + (((tickAnim - 120) / 100) * (0-(0)));
            yy = 3.05 + (((tickAnim - 120) / 100) * (3.05-(3.05)));
            zz = 0 + (((tickAnim - 120) / 100) * (0-(0)));
        }
        else if (tickAnim >= 220 && tickAnim < 450) {
            xx = 0 + (((tickAnim - 220) / 230) * (0-(0)));
            yy = 3.05 + (((tickAnim - 220) / 230) * (3.05-(3.05)));
            zz = 0 + (((tickAnim - 220) / 230) * (0-(0)));
        }
        else if (tickAnim >= 450 && tickAnim < 495) {
            xx = 0 + (((tickAnim - 450) / 45) * (0-(0)));
            yy = 3.05 + (((tickAnim - 450) / 45) * (0-(3.05)));
            zz = 0 + (((tickAnim - 450) / 45) * (0-(0)));
        }
        else if (tickAnim >= 495 && tickAnim < 550) {
            xx = 0 + (((tickAnim - 495) / 55) * (0-(0)));
            yy = 0 + (((tickAnim - 495) / 55) * (0-(0)));
            zz = 0 + (((tickAnim - 495) / 55) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftLeg3.rotationPointX = this.leftLeg3.rotationPointX + (float)(xx);
        this.leftLeg3.rotationPointY = this.leftLeg3.rotationPointY - (float)(yy);
        this.leftLeg3.rotationPointZ = this.leftLeg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 0) / 30) * (-7.1579-(0)));
            yy = 0 + (((tickAnim - 0) / 30) * (4.95517-(0)));
            zz = 0 + (((tickAnim - 0) / 30) * (2.02052-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 80) {
            xx = -7.1579 + (((tickAnim - 30) / 50) * (2.2456-(-7.1579)));
            yy = 4.95517 + (((tickAnim - 30) / 50) * (13.21378-(4.95517)));
            zz = 2.02052 + (((tickAnim - 30) / 50) * (5.38805-(2.02052)));
        }
        else if (tickAnim >= 80 && tickAnim < 120) {
            xx = 2.2456 + (((tickAnim - 80) / 40) * (-6.0044-(2.2456)));
            yy = 13.21378 + (((tickAnim - 80) / 40) * (13.21378-(13.21378)));
            zz = 5.38805 + (((tickAnim - 80) / 40) * (5.38805-(5.38805)));
        }
        else if (tickAnim >= 120 && tickAnim < 220) {
            xx = -6.0044 + (((tickAnim - 120) / 100) * (-6.0044-(-6.0044)));
            yy = 13.21378 + (((tickAnim - 120) / 100) * (13.21378-(13.21378)));
            zz = 5.38805 + (((tickAnim - 120) / 100) * (5.38805-(5.38805)));
        }
        else if (tickAnim >= 220 && tickAnim < 450) {
            xx = -6.0044 + (((tickAnim - 220) / 230) * (-6.0044-(-6.0044)));
            yy = 13.21378 + (((tickAnim - 220) / 230) * (13.21378-(13.21378)));
            zz = 5.38805 + (((tickAnim - 220) / 230) * (5.38805-(5.38805)));
        }
        else if (tickAnim >= 450 && tickAnim < 495) {
            xx = -6.0044 + (((tickAnim - 450) / 45) * (-6.5044-(-6.0044)));
            yy = 13.21378 + (((tickAnim - 450) / 45) * (13.21378-(13.21378)));
            zz = 5.38805 + (((tickAnim - 450) / 45) * (5.38805-(5.38805)));
        }
        else if (tickAnim >= 495 && tickAnim < 550) {
            xx = -6.5044 + (((tickAnim - 495) / 55) * (0-(-6.5044)));
            yy = 13.21378 + (((tickAnim - 495) / 55) * (0-(13.21378)));
            zz = 5.38805 + (((tickAnim - 495) / 55) * (0-(5.38805)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail1, tail1.rotateAngleX + (float) Math.toRadians(xx), tail1.rotateAngleY + (float) Math.toRadians(yy), tail1.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 80) {
            xx = 0 + (((tickAnim - 0) / 80) * (-1.075-(0)));
            yy = 0 + (((tickAnim - 0) / 80) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 80) * (0-(0)));
        }
        else if (tickAnim >= 80 && tickAnim < 550) {
            xx = -1.075 + (((tickAnim - 80) / 470) * (0-(-1.075)));
            yy = 0 + (((tickAnim - 80) / 470) * (0-(0)));
            zz = 0 + (((tickAnim - 80) / 470) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.tail1.rotationPointX = this.tail1.rotationPointX + (float)(xx);
        this.tail1.rotationPointY = this.tail1.rotationPointY - (float)(yy);
        this.tail1.rotationPointZ = this.tail1.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 0) / 30) * (0.75-(0)));
            yy = 0 + (((tickAnim - 0) / 30) * (5.34375-(0)));
            zz = 0 + (((tickAnim - 0) / 30) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 80) {
            xx = 0.75 + (((tickAnim - 30) / 50) * (0-(0.75)));
            yy = 5.34375 + (((tickAnim - 30) / 50) * (14.25-(5.34375)));
            zz = 0 + (((tickAnim - 30) / 50) * (0-(0)));
        }
        else if (tickAnim >= 80 && tickAnim < 120) {
            xx = 0 + (((tickAnim - 80) / 40) * (-6.5-(0)));
            yy = 14.25 + (((tickAnim - 80) / 40) * (14.25-(14.25)));
            zz = 0 + (((tickAnim - 80) / 40) * (0-(0)));
        }
        else if (tickAnim >= 120 && tickAnim < 220) {
            xx = -6.5 + (((tickAnim - 120) / 100) * (-6.5-(-6.5)));
            yy = 14.25 + (((tickAnim - 120) / 100) * (14.25-(14.25)));
            zz = 0 + (((tickAnim - 120) / 100) * (0-(0)));
        }
        else if (tickAnim >= 220 && tickAnim < 450) {
            xx = -6.5 + (((tickAnim - 220) / 230) * (-6.5-(-6.5)));
            yy = 14.25 + (((tickAnim - 220) / 230) * (14.25-(14.25)));
            zz = 0 + (((tickAnim - 220) / 230) * (0-(0)));
        }
        else if (tickAnim >= 450 && tickAnim < 495) {
            xx = -6.5 + (((tickAnim - 450) / 45) * (-9.5-(-6.5)));
            yy = 14.25 + (((tickAnim - 450) / 45) * (14.25-(14.25)));
            zz = 0 + (((tickAnim - 450) / 45) * (0-(0)));
        }
        else if (tickAnim >= 495 && tickAnim < 550) {
            xx = -9.5 + (((tickAnim - 495) / 55) * (0-(-9.5)));
            yy = 14.25 + (((tickAnim - 495) / 55) * (0-(14.25)));
            zz = 0 + (((tickAnim - 495) / 55) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(xx), tail2.rotateAngleY + (float) Math.toRadians(yy), tail2.rotateAngleZ + (float) Math.toRadians(zz));

        this.tail2.rotationPointX = this.tail2.rotationPointX + (float)(0);
        this.tail2.rotationPointY = this.tail2.rotationPointY - (float)(0);
        this.tail2.rotationPointZ = this.tail2.rotationPointZ + (float)(0);



        if (tickAnim >= 0 && tickAnim < 80) {
            xx = 0 + (((tickAnim - 0) / 80) * (0.84204-(0)));
            yy = 0 + (((tickAnim - 0) / 80) * (11.79607-(0)));
            zz = 0 + (((tickAnim - 0) / 80) * (4.08255-(0)));
        }
        else if (tickAnim >= 80 && tickAnim < 120) {
            xx = 0.84204 + (((tickAnim - 80) / 40) * (8.09204-(0.84204)));
            yy = 11.79607 + (((tickAnim - 80) / 40) * (11.79607-(11.79607)));
            zz = 4.08255 + (((tickAnim - 80) / 40) * (4.08255-(4.08255)));
        }
        else if (tickAnim >= 120 && tickAnim < 220) {
            xx = 8.09204 + (((tickAnim - 120) / 100) * (8.09204-(8.09204)));
            yy = 11.79607 + (((tickAnim - 120) / 100) * (11.79607-(11.79607)));
            zz = 4.08255 + (((tickAnim - 120) / 100) * (4.08255-(4.08255)));
        }
        else if (tickAnim >= 220 && tickAnim < 450) {
            xx = 8.09204 + (((tickAnim - 220) / 230) * (8.09204-(8.09204)));
            yy = 11.79607 + (((tickAnim - 220) / 230) * (11.79607-(11.79607)));
            zz = 4.08255 + (((tickAnim - 220) / 230) * (4.08255-(4.08255)));
        }
        else if (tickAnim >= 450 && tickAnim < 495) {
            xx = 8.09204 + (((tickAnim - 450) / 45) * (-6.90796-(8.09204)));
            yy = 11.79607 + (((tickAnim - 450) / 45) * (11.79607-(11.79607)));
            zz = 4.08255 + (((tickAnim - 450) / 45) * (4.08255-(4.08255)));
        }
        else if (tickAnim >= 495 && tickAnim < 550) {
            xx = -6.90796 + (((tickAnim - 495) / 55) * (0-(-6.90796)));
            yy = 11.79607 + (((tickAnim - 495) / 55) * (0-(11.79607)));
            zz = 4.08255 + (((tickAnim - 495) / 55) * (0-(4.08255)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(xx), tail3.rotateAngleY + (float) Math.toRadians(yy), tail3.rotateAngleZ + (float) Math.toRadians(zz));

        this.tail3.rotationPointX = this.tail3.rotationPointX + (float)(0);
        this.tail3.rotationPointY = this.tail3.rotationPointY - (float)(0);
        this.tail3.rotationPointZ = this.tail3.rotationPointZ + (float)(0);



        if (tickAnim >= 0 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 0) / 50) * (5.67563-(0)));
            yy = 0 + (((tickAnim - 0) / 50) * (5.17806-(0)));
            zz = 0 + (((tickAnim - 0) / 50) * (-0.56075-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 80) {
            xx = 5.67563 + (((tickAnim - 50) / 30) * (-0.119-(5.67563)));
            yy = 5.17806 + (((tickAnim - 50) / 30) * (8.2849-(5.17806)));
            zz = -0.56075 + (((tickAnim - 50) / 30) * (-0.8972-(-0.56075)));
        }
        else if (tickAnim >= 80 && tickAnim < 120) {
            xx = -0.119 + (((tickAnim - 80) / 40) * (-0.119-(-0.119)));
            yy = 8.2849 + (((tickAnim - 80) / 40) * (8.2849-(8.2849)));
            zz = -0.8972 + (((tickAnim - 80) / 40) * (-0.8972-(-0.8972)));
        }
        else if (tickAnim >= 120 && tickAnim < 220) {
            xx = -0.119 + (((tickAnim - 120) / 100) * (-0.119-(-0.119)));
            yy = 8.2849 + (((tickAnim - 120) / 100) * (8.2849-(8.2849)));
            zz = -0.8972 + (((tickAnim - 120) / 100) * (-0.8972-(-0.8972)));
        }
        else if (tickAnim >= 220 && tickAnim < 450) {
            xx = -0.119 + (((tickAnim - 220) / 230) * (-0.119-(-0.119)));
            yy = 8.2849 + (((tickAnim - 220) / 230) * (8.2849-(8.2849)));
            zz = -0.8972 + (((tickAnim - 220) / 230) * (-0.8972-(-0.8972)));
        }
        else if (tickAnim >= 450 && tickAnim < 495) {
            xx = -0.119 + (((tickAnim - 450) / 45) * (-3.869-(-0.119)));
            yy = 8.2849 + (((tickAnim - 450) / 45) * (8.2849-(8.2849)));
            zz = -0.8972 + (((tickAnim - 450) / 45) * (-0.8972-(-0.8972)));
        }
        else if (tickAnim >= 495 && tickAnim < 550) {
            xx = -3.869 + (((tickAnim - 495) / 55) * (0-(-3.869)));
            yy = 8.2849 + (((tickAnim - 495) / 55) * (0-(8.2849)));
            zz = -0.8972 + (((tickAnim - 495) / 55) * (0-(-0.8972)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(xx), tail4.rotateAngleY + (float) Math.toRadians(yy), tail4.rotateAngleZ + (float) Math.toRadians(zz));

        this.tail4.rotationPointX = this.tail4.rotationPointX + (float)(0);
        this.tail4.rotationPointY = this.tail4.rotationPointY - (float)(0);
        this.tail4.rotationPointZ = this.tail4.rotationPointZ + (float)(0);



        if (tickAnim >= 0 && tickAnim < 80) {
            xx = 0 + (((tickAnim - 0) / 80) * (6.24044-(0)));
            yy = 0 + (((tickAnim - 0) / 80) * (21.65786-(0)));
            zz = 0 + (((tickAnim - 0) / 80) * (1.33346-(0)));
        }
        else if (tickAnim >= 80 && tickAnim < 120) {
            xx = 6.24044 + (((tickAnim - 80) / 40) * (6.24044-(6.24044)));
            yy = 21.65786 + (((tickAnim - 80) / 40) * (21.65786-(21.65786)));
            zz = 1.33346 + (((tickAnim - 80) / 40) * (1.33346-(1.33346)));
        }
        else if (tickAnim >= 120 && tickAnim < 220) {
            xx = 6.24044 + (((tickAnim - 120) / 100) * (6.24044-(6.24044)));
            yy = 21.65786 + (((tickAnim - 120) / 100) * (21.65786-(21.65786)));
            zz = 1.33346 + (((tickAnim - 120) / 100) * (1.33346-(1.33346)));
        }
        else if (tickAnim >= 220 && tickAnim < 450) {
            xx = 6.24044 + (((tickAnim - 220) / 230) * (6.24044-(6.24044)));
            yy = 21.65786 + (((tickAnim - 220) / 230) * (21.65786-(21.65786)));
            zz = 1.33346 + (((tickAnim - 220) / 230) * (1.33346-(1.33346)));
        }
        else if (tickAnim >= 450 && tickAnim < 495) {
            xx = 6.24044 + (((tickAnim - 450) / 45) * (0-(6.24044)));
            yy = 21.65786 + (((tickAnim - 450) / 45) * (23.25-(21.65786)));
            zz = 1.33346 + (((tickAnim - 450) / 45) * (0-(1.33346)));
        }
        else if (tickAnim >= 495 && tickAnim < 550) {
            xx = 0 + (((tickAnim - 495) / 55) * (0-(0)));
            yy = 23.25 + (((tickAnim - 495) / 55) * (0-(23.25)));
            zz = 0 + (((tickAnim - 495) / 55) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail5, tail5.rotateAngleX + (float) Math.toRadians(xx), tail5.rotateAngleY + (float) Math.toRadians(yy), tail5.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 80) {
            xx = 0 + (((tickAnim - 0) / 80) * (0.375-(0)));
            yy = 0 + (((tickAnim - 0) / 80) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 80) * (0.875-(0)));
        }
        else if (tickAnim >= 80 && tickAnim < 120) {
            xx = 0.375 + (((tickAnim - 80) / 40) * (0.375-(0.375)));
            yy = 0 + (((tickAnim - 80) / 40) * (0-(0)));
            zz = 0.875 + (((tickAnim - 80) / 40) * (0.875-(0.875)));
        }
        else if (tickAnim >= 120 && tickAnim < 220) {
            xx = 0.375 + (((tickAnim - 120) / 100) * (0.375-(0.375)));
            yy = 0 + (((tickAnim - 120) / 100) * (0-(0)));
            zz = 0.875 + (((tickAnim - 120) / 100) * (0.875-(0.875)));
        }
        else if (tickAnim >= 220 && tickAnim < 450) {
            xx = 0.375 + (((tickAnim - 220) / 230) * (0.375-(0.375)));
            yy = 0 + (((tickAnim - 220) / 230) * (0-(0)));
            zz = 0.875 + (((tickAnim - 220) / 230) * (0.875-(0.875)));
        }
        else if (tickAnim >= 450 && tickAnim < 495) {
            xx = 0.375 + (((tickAnim - 450) / 45) * (0-(0.375)));
            yy = 0 + (((tickAnim - 450) / 45) * (0-(0)));
            zz = 0.875 + (((tickAnim - 450) / 45) * (0-(0.875)));
        }
        else if (tickAnim >= 495 && tickAnim < 550) {
            xx = 0 + (((tickAnim - 495) / 55) * (0-(0)));
            yy = 0 + (((tickAnim - 495) / 55) * (0-(0)));
            zz = 0 + (((tickAnim - 495) / 55) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.tail5.rotationPointX = this.tail5.rotationPointX + (float)(xx);
        this.tail5.rotationPointY = this.tail5.rotationPointY - (float)(yy);
        this.tail5.rotationPointZ = this.tail5.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 80) {
            xx = 0 + (((tickAnim - 0) / 80) * (7.75-(0)));
            yy = 0 + (((tickAnim - 0) / 80) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 80) * (0-(0)));
        }
        else if (tickAnim >= 80 && tickAnim < 120) {
            xx = 7.75 + (((tickAnim - 80) / 40) * (7.75-(7.75)));
            yy = 0 + (((tickAnim - 80) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 80) / 40) * (0-(0)));
        }
        else if (tickAnim >= 120 && tickAnim < 220) {
            xx = 7.75 + (((tickAnim - 120) / 100) * (7.75-(7.75)));
            yy = 0 + (((tickAnim - 120) / 100) * (0-(0)));
            zz = 0 + (((tickAnim - 120) / 100) * (0-(0)));
        }
        else if (tickAnim >= 220 && tickAnim < 450) {
            xx = 7.75 + (((tickAnim - 220) / 230) * (7.75-(7.75)));
            yy = 0 + (((tickAnim - 220) / 230) * (0-(0)));
            zz = 0 + (((tickAnim - 220) / 230) * (0-(0)));
        }
        else if (tickAnim >= 450 && tickAnim < 495) {
            xx = 7.75 + (((tickAnim - 450) / 45) * (19.75-(7.75)));
            yy = 0 + (((tickAnim - 450) / 45) * (0-(0)));
            zz = 0 + (((tickAnim - 450) / 45) * (0-(0)));
        }
        else if (tickAnim >= 495 && tickAnim < 550) {
            xx = 19.75 + (((tickAnim - 495) / 55) * (0-(19.75)));
            yy = 0 + (((tickAnim - 495) / 55) * (0-(0)));
            zz = 0 + (((tickAnim - 495) / 55) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail6, tail6.rotateAngleX + (float) Math.toRadians(xx), tail6.rotateAngleY + (float) Math.toRadians(yy), tail6.rotateAngleZ + (float) Math.toRadians(zz));

        this.tail6.rotationPointX = this.tail6.rotationPointX + (float)(0);
        this.tail6.rotationPointY = this.tail6.rotationPointY - (float)(0);
        this.tail6.rotationPointZ = this.tail6.rotationPointZ + (float)(0);



        if (tickAnim >= 0 && tickAnim < 80) {
            xx = 0 + (((tickAnim - 0) / 80) * (16.91998-(0)));
            yy = 0 + (((tickAnim - 0) / 80) * (11.72448-(0)));
            zz = 0 + (((tickAnim - 0) / 80) * (-0.7794-(0)));
        }
        else if (tickAnim >= 80 && tickAnim < 120) {
            xx = 16.91998 + (((tickAnim - 80) / 40) * (0-(16.91998)));
            yy = 11.72448 + (((tickAnim - 80) / 40) * (0-(11.72448)));
            zz = -0.7794 + (((tickAnim - 80) / 40) * (0-(-0.7794)));
        }
        else if (tickAnim >= 120 && tickAnim < 220) {
            xx = 0 + (((tickAnim - 120) / 100) * (0-(0)));
            yy = 0 + (((tickAnim - 120) / 100) * (0-(0)));
            zz = 0 + (((tickAnim - 120) / 100) * (0-(0)));
        }
        else if (tickAnim >= 220 && tickAnim < 450) {
            xx = 0 + (((tickAnim - 220) / 230) * (0-(0)));
            yy = 0 + (((tickAnim - 220) / 230) * (0-(0)));
            zz = 0 + (((tickAnim - 220) / 230) * (0-(0)));
        }
        else if (tickAnim >= 450 && tickAnim < 495) {
            xx = 0 + (((tickAnim - 450) / 45) * (11.75-(0)));
            yy = 0 + (((tickAnim - 450) / 45) * (0-(0)));
            zz = 0 + (((tickAnim - 450) / 45) * (0-(0)));
        }
        else if (tickAnim >= 495 && tickAnim < 550) {
            xx = 11.75 + (((tickAnim - 495) / 55) * (0-(11.75)));
            yy = 0 + (((tickAnim - 495) / 55) * (0-(0)));
            zz = 0 + (((tickAnim - 495) / 55) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail7, tail7.rotateAngleX + (float) Math.toRadians(xx), tail7.rotateAngleY + (float) Math.toRadians(yy), tail7.rotateAngleZ + (float) Math.toRadians(zz));

        this.tail7.rotationPointX = this.tail7.rotationPointX + (float)(0);
        this.tail7.rotationPointY = this.tail7.rotationPointY - (float)(0);
        this.tail7.rotationPointZ = this.tail7.rotationPointZ + (float)(0);



        if (tickAnim >= 0 && tickAnim < 80) {
            xx = 0 + (((tickAnim - 0) / 80) * (14-(0)));
            yy = 0 + (((tickAnim - 0) / 80) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 80) * (-19.75-(0)));
        }
        else if (tickAnim >= 80 && tickAnim < 120) {
            xx = 14 + (((tickAnim - 80) / 40) * (-30.48712-(14)));
            yy = 0 + (((tickAnim - 80) / 40) * (-14.75757-(0)));
            zz = -19.75 + (((tickAnim - 80) / 40) * (-68.42501-(-19.75)));
        }
        else if (tickAnim >= 120 && tickAnim < 220) {
            xx = -30.48712 + (((tickAnim - 120) / 100) * (-30.48712-(-30.48712)));
            yy = -14.75757 + (((tickAnim - 120) / 100) * (-14.75757-(-14.75757)));
            zz = -68.42501 + (((tickAnim - 120) / 100) * (-68.42501-(-68.42501)));
        }
        else if (tickAnim >= 220 && tickAnim < 450) {
            xx = -30.48712 + (((tickAnim - 220) / 230) * (-30.48712-(-30.48712)));
            yy = -14.75757 + (((tickAnim - 220) / 230) * (-14.75757-(-14.75757)));
            zz = -68.42501 + (((tickAnim - 220) / 230) * (-68.42501-(-68.42501)));
        }
        else if (tickAnim >= 450 && tickAnim < 495) {
            xx = -30.48712 + (((tickAnim - 450) / 45) * (-32.27202-(-30.48712)));
            yy = -14.75757 + (((tickAnim - 450) / 45) * (-17.35932-(-14.75757)));
            zz = -68.42501 + (((tickAnim - 450) / 45) * (-65.28826-(-68.42501)));
        }
        else if (tickAnim >= 495 && tickAnim < 550) {
            xx = -32.27202 + (((tickAnim - 495) / 55) * (0-(-32.27202)));
            yy = -17.35932 + (((tickAnim - 495) / 55) * (0-(-17.35932)));
            zz = -65.28826 + (((tickAnim - 495) / 55) * (0-(-65.28826)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm1, leftArm1.rotateAngleX + (float) Math.toRadians(xx), leftArm1.rotateAngleY + (float) Math.toRadians(yy), leftArm1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 80) {
            xx = 0 + (((tickAnim - 0) / 80) * (-66.5-(0)));
            yy = 0 + (((tickAnim - 0) / 80) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 80) * (0-(0)));
        }
        else if (tickAnim >= 80 && tickAnim < 100) {
            xx = -66.5 + (((tickAnim - 80) / 20) * (-30.99577-(-66.5)));
            yy = 0 + (((tickAnim - 80) / 20) * (-13.81207-(0)));
            zz = 0 + (((tickAnim - 80) / 20) * (19.94806-(0)));
        }
        else if (tickAnim >= 100 && tickAnim < 120) {
            xx = -30.99577 + (((tickAnim - 100) / 20) * (-9.45618-(-30.99577)));
            yy = -13.81207 + (((tickAnim - 100) / 20) * (-18.9617-(-13.81207)));
            zz = 19.94806 + (((tickAnim - 100) / 20) * (-5.38852-(19.94806)));
        }
        else if (tickAnim >= 120 && tickAnim < 220) {
            xx = -9.45618 + (((tickAnim - 120) / 100) * (-9.45618-(-9.45618)));
            yy = -18.9617 + (((tickAnim - 120) / 100) * (-18.9617-(-18.9617)));
            zz = -5.38852 + (((tickAnim - 120) / 100) * (-5.38852-(-5.38852)));
        }
        else if (tickAnim >= 220 && tickAnim < 450) {
            xx = -9.45618 + (((tickAnim - 220) / 230) * (-9.45618-(-9.45618)));
            yy = -18.9617 + (((tickAnim - 220) / 230) * (-18.9617-(-18.9617)));
            zz = -5.38852 + (((tickAnim - 220) / 230) * (-5.38852-(-5.38852)));
        }
        else if (tickAnim >= 450 && tickAnim < 550) {
            xx = -9.45618 + (((tickAnim - 450) / 100) * (0-(-9.45618)));
            yy = -18.9617 + (((tickAnim - 450) / 100) * (0-(-18.9617)));
            zz = -5.38852 + (((tickAnim - 450) / 100) * (0-(-5.38852)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm2, leftArm2.rotateAngleX + (float) Math.toRadians(xx), leftArm2.rotateAngleY + (float) Math.toRadians(yy), leftArm2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 100) {
            xx = 0 + (((tickAnim - 0) / 100) * (38.0583+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*45-(0)));
            yy = 0 + (((tickAnim - 0) / 100) * (-8.54167-(0)));
            zz = 0 + (((tickAnim - 0) / 100) * (0-(0)));
        }
        else if (tickAnim >= 100 && tickAnim < 120) {
            xx = 38.0583+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*45 + (((tickAnim - 100) / 20) * (-5-(38.0583+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*45)));
            yy = -8.54167 + (((tickAnim - 100) / 20) * (-10.25-(-8.54167)));
            zz = 0 + (((tickAnim - 100) / 20) * (0-(0)));
        }
        else if (tickAnim >= 120 && tickAnim < 260) {
            xx = -5 + (((tickAnim - 120) / 140) * (-5-(-5)));
            yy = -10.25 + (((tickAnim - 120) / 140) * (-10.25-(-10.25)));
            zz = 0 + (((tickAnim - 120) / 140) * (0-(0)));
        }
        else if (tickAnim >= 260 && tickAnim < 300) {
            xx = -5 + (((tickAnim - 260) / 40) * (-5.07343-(-5)));
            yy = -10.25 + (((tickAnim - 260) / 40) * (-10.6248+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-2-(-10.25)));
            zz = 0 + (((tickAnim - 260) / 40) * (-0.04908-(0)));
        }
        else if (tickAnim >= 300 && tickAnim < 301) {
            xx = -5.07343 + (((tickAnim - 300) / 1) * (-5.07343-(-5.07343)));
            yy = -10.6248+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-2 + (((tickAnim - 300) / 1) * (-11.77481-(-10.6248+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-2)));
            zz = -0.04908 + (((tickAnim - 300) / 1) * (-0.04908-(-0.04908)));
        }
        else if (tickAnim >= 301 && tickAnim < 409) {
            xx = -5.07343 + (((tickAnim - 301) / 108) * (-5.07343-(-5.07343)));
            yy = -11.77481 + (((tickAnim - 301) / 108) * (-11.77481-(-11.77481)));
            zz = -0.04908 + (((tickAnim - 301) / 108) * (-0.04908-(-0.04908)));
        }
        else if (tickAnim >= 409 && tickAnim < 410) {
            xx = -5.07343 + (((tickAnim - 409) / 1) * (-5.07343-(-5.07343)));
            yy = -11.77481 + (((tickAnim - 409) / 1) * (-15.8998+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-5-(-11.77481)));
            zz = -0.04908 + (((tickAnim - 409) / 1) * (-0.04908-(-0.04908)));
        }
        else if (tickAnim >= 410 && tickAnim < 425) {
            xx = -5.07343 + (((tickAnim - 410) / 15) * (-5.23951-(-5.07343)));
            yy = -15.8998+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-5 + (((tickAnim - 410) / 15) * (-12.76443-(-15.8998+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-5)));
            zz = -0.04908 + (((tickAnim - 410) / 15) * (0.73242-(-0.04908)));
        }
        else if (tickAnim >= 425 && tickAnim < 450) {
            xx = -5.23951 + (((tickAnim - 425) / 25) * (-5.23951-(-5.23951)));
            yy = -12.76443 + (((tickAnim - 425) / 25) * (-12.76443-(-12.76443)));
            zz = 0.73242 + (((tickAnim - 425) / 25) * (0.73242-(0.73242)));
        }
        else if (tickAnim >= 450 && tickAnim < 495) {
            xx = -5.23951 + (((tickAnim - 450) / 45) * (7.75-(-5.23951)));
            yy = -12.76443 + (((tickAnim - 450) / 45) * (0-(-12.76443)));
            zz = 0.73242 + (((tickAnim - 450) / 45) * (0-(0.73242)));
        }
        else if (tickAnim >= 495 && tickAnim < 550) {
            xx = 7.75 + (((tickAnim - 495) / 55) * (0-(7.75)));
            yy = 0 + (((tickAnim - 495) / 55) * (0-(0)));
            zz = 0 + (((tickAnim - 495) / 55) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck1, neck1.rotateAngleX + (float) Math.toRadians(xx), neck1.rotateAngleY + (float) Math.toRadians(yy), neck1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 120) {
            xx = 0 + (((tickAnim - 0) / 120) * (-0.01582-(0)));
            yy = 0 + (((tickAnim - 0) / 120) * (-1.68668-(0)));
            zz = 0 + (((tickAnim - 0) / 120) * (-3.42509-(0)));
        }
        else if (tickAnim >= 120 && tickAnim < 260) {
            xx = -0.01582 + (((tickAnim - 120) / 140) * (-0.01582-(-0.01582)));
            yy = -1.68668 + (((tickAnim - 120) / 140) * (-1.68668-(-1.68668)));
            zz = -3.42509 + (((tickAnim - 120) / 140) * (-3.42509-(-3.42509)));
        }
        else if (tickAnim >= 260 && tickAnim < 300) {
            xx = -0.01582 + (((tickAnim - 260) / 40) * (0.13308-(-0.01582)));
            yy = -1.68668 + (((tickAnim - 260) / 40) * (-4.6488+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*2-(-1.68668)));
            zz = -3.42509 + (((tickAnim - 260) / 40) * (-6.5932-(-3.42509)));
        }
        else if (tickAnim >= 300 && tickAnim < 301) {
            xx = 0.13308 + (((tickAnim - 300) / 1) * (0.13308-(0.13308)));
            yy = -4.6488+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*2 + (((tickAnim - 300) / 1) * (-3.69883-(-4.6488+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*2)));
            zz = -6.5932 + (((tickAnim - 300) / 1) * (-6.5932-(-6.5932)));
        }
        else if (tickAnim >= 301 && tickAnim < 409) {
            xx = 0.13308 + (((tickAnim - 301) / 108) * (0.13308-(0.13308)));
            yy = -3.69883 + (((tickAnim - 301) / 108) * (-3.69883-(-3.69883)));
            zz = -6.5932 + (((tickAnim - 301) / 108) * (-6.5932-(-6.5932)));
        }
        else if (tickAnim >= 409 && tickAnim < 410) {
            xx = 0.13308 + (((tickAnim - 409) / 1) * (0.13308-(0.13308)));
            yy = -3.69883 + (((tickAnim - 409) / 1) * (-7.9488+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-5-(-3.69883)));
            zz = -6.5932 + (((tickAnim - 409) / 1) * (-6.5932-(-6.5932)));
        }
        else if (tickAnim >= 410 && tickAnim < 425) {
            xx = 0.13308 + (((tickAnim - 410) / 15) * (-0.02166-(0.13308)));
            yy = -7.9488+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-5 + (((tickAnim - 410) / 15) * (-6.44177-(-7.9488+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-5)));
            zz = -6.5932 + (((tickAnim - 410) / 15) * (-4.84296-(-6.5932)));
        }
        else if (tickAnim >= 425 && tickAnim < 450) {
            xx = -0.02166 + (((tickAnim - 425) / 25) * (-0.02166-(-0.02166)));
            yy = -6.44177 + (((tickAnim - 425) / 25) * (-6.44177-(-6.44177)));
            zz = -4.84296 + (((tickAnim - 425) / 25) * (-4.84296-(-4.84296)));
        }
        else if (tickAnim >= 450 && tickAnim < 495) {
            xx = -0.02166 + (((tickAnim - 450) / 45) * (0-(-0.02166)));
            yy = -6.44177 + (((tickAnim - 450) / 45) * (0-(-6.44177)));
            zz = -4.84296 + (((tickAnim - 450) / 45) * (0-(-4.84296)));
        }
        else if (tickAnim >= 495 && tickAnim < 550) {
            xx = 0 + (((tickAnim - 495) / 55) * (0-(0)));
            yy = 0 + (((tickAnim - 495) / 55) * (0-(0)));
            zz = 0 + (((tickAnim - 495) / 55) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(xx), neck2.rotateAngleY + (float) Math.toRadians(yy), neck2.rotateAngleZ + (float) Math.toRadians(zz));

        this.neck2.rotationPointX = this.neck2.rotationPointX + (float)(0);
        this.neck2.rotationPointY = this.neck2.rotationPointY - (float)(0);
        this.neck2.rotationPointZ = this.neck2.rotationPointZ + (float)(0);



        if (tickAnim >= 0 && tickAnim < 80) {
            xx = 0 + (((tickAnim - 0) / 80) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 80) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 80) * (0-(0)));
        }
        else if (tickAnim >= 80 && tickAnim < 100) {
            xx = 0 + (((tickAnim - 80) / 20) * (-7.22894-(0)));
            yy = 0 + (((tickAnim - 80) / 20) * (-2.34911-(0)));
            zz = 0 + (((tickAnim - 80) / 20) * (-3.56407-(0)));
        }
        else if (tickAnim >= 100 && tickAnim < 120) {
            xx = -7.22894 + (((tickAnim - 100) / 20) * (0.02527-(-7.22894)));
            yy = -2.34911 + (((tickAnim - 100) / 20) * (-2.81893-(-2.34911)));
            zz = -3.56407 + (((tickAnim - 100) / 20) * (-4.27689-(-3.56407)));
        }
        else if (tickAnim >= 120 && tickAnim < 220) {
            xx = 0.02527 + (((tickAnim - 120) / 100) * (0.02527-(0.02527)));
            yy = -2.81893 + (((tickAnim - 120) / 100) * (-2.81893-(-2.81893)));
            zz = -4.27689 + (((tickAnim - 120) / 100) * (-4.27689-(-4.27689)));
        }
        else if (tickAnim >= 220 && tickAnim < 260) {
            xx = 0.02527 + (((tickAnim - 220) / 40) * (0.02527-(0.02527)));
            yy = -2.81893 + (((tickAnim - 220) / 40) * (-2.81893-(-2.81893)));
            zz = -4.27689 + (((tickAnim - 220) / 40) * (-4.27689-(-4.27689)));
        }
        else if (tickAnim >= 260 && tickAnim < 300) {
            xx = 0.02527 + (((tickAnim - 260) / 40) * (0.15706-(0.02527)));
            yy = -2.81893 + (((tickAnim - 260) / 40) * (-5.1342+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*2-(-2.81893)));
            zz = -4.27689 + (((tickAnim - 260) / 40) * (-7.1678-(-4.27689)));
        }
        else if (tickAnim >= 300 && tickAnim < 301) {
            xx = 0.15706 + (((tickAnim - 300) / 1) * (0.15706-(0.15706)));
            yy = -5.1342+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*2 + (((tickAnim - 300) / 1) * (-4.15921-(-5.1342+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*2)));
            zz = -7.1678 + (((tickAnim - 300) / 1) * (-7.1678-(-7.1678)));
        }
        else if (tickAnim >= 301 && tickAnim < 409) {
            xx = 0.15706 + (((tickAnim - 301) / 108) * (0.15706-(0.15706)));
            yy = -4.15921 + (((tickAnim - 301) / 108) * (-4.15921-(-4.15921)));
            zz = -7.1678 + (((tickAnim - 301) / 108) * (-7.1678-(-7.1678)));
        }
        else if (tickAnim >= 409 && tickAnim < 410) {
            xx = 0.15706 + (((tickAnim - 409) / 1) * (0.15706-(0.15706)));
            yy = -4.15921 + (((tickAnim - 409) / 1) * (-8.4592+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-5-(-4.15921)));
            zz = -7.1678 + (((tickAnim - 409) / 1) * (-7.1678-(-7.1678)));
        }
        else if (tickAnim >= 410 && tickAnim < 425) {
            xx = 0.15706 + (((tickAnim - 410) / 15) * (0.22796-(0.15706)));
            yy = -8.4592+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-5 + (((tickAnim - 410) / 15) * (-6.27096-(-8.4592+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-5)));
            zz = -7.1678 + (((tickAnim - 410) / 15) * (-7.94763-(-7.1678)));
        }
        else if (tickAnim >= 425 && tickAnim < 450) {
            xx = 0.22796 + (((tickAnim - 425) / 25) * (0.22796-(0.22796)));
            yy = -6.27096 + (((tickAnim - 425) / 25) * (-6.27096-(-6.27096)));
            zz = -7.94763 + (((tickAnim - 425) / 25) * (-7.94763-(-7.94763)));
        }
        else if (tickAnim >= 450 && tickAnim < 495) {
            xx = 0.22796 + (((tickAnim - 450) / 45) * (-14.5-(0.22796)));
            yy = -6.27096 + (((tickAnim - 450) / 45) * (0-(-6.27096)));
            zz = -7.94763 + (((tickAnim - 450) / 45) * (0-(-7.94763)));
        }
        else if (tickAnim >= 495 && tickAnim < 550) {
            xx = -14.5 + (((tickAnim - 495) / 55) * (0-(-14.5)));
            yy = 0 + (((tickAnim - 495) / 55) * (0-(0)));
            zz = 0 + (((tickAnim - 495) / 55) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(xx), neck3.rotateAngleY + (float) Math.toRadians(yy), neck3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 495) {
            xx = 0 + (((tickAnim - 0) / 495) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 495) * (-0.375-(0)));
            zz = 0 + (((tickAnim - 0) / 495) * (0-(0)));
        }
        else if (tickAnim >= 495 && tickAnim < 550) {
            xx = 0 + (((tickAnim - 495) / 55) * (0-(0)));
            yy = -0.375 + (((tickAnim - 495) / 55) * (0-(-0.375)));
            zz = 0 + (((tickAnim - 495) / 55) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.neck3.rotationPointX = this.neck3.rotationPointX + (float)(xx);
        this.neck3.rotationPointY = this.neck3.rotationPointY - (float)(yy);
        this.neck3.rotationPointZ = this.neck3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 495) {
            xx = 0 + (((tickAnim - 0) / 495) * (-8.25-(0)));
            yy = 0 + (((tickAnim - 0) / 495) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 495) * (0-(0)));
        }
        else if (tickAnim >= 495 && tickAnim < 550) {
            xx = -8.25 + (((tickAnim - 495) / 55) * (0-(-8.25)));
            yy = 0 + (((tickAnim - 495) / 55) * (0-(0)));
            zz = 0 + (((tickAnim - 495) / 55) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck4, neck4.rotateAngleX + (float) Math.toRadians(xx), neck4.rotateAngleY + (float) Math.toRadians(yy), neck4.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 495) {
            xx = 0 + (((tickAnim - 0) / 495) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 495) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 495) * (-0.95-(0)));
        }
        else if (tickAnim >= 495 && tickAnim < 550) {
            xx = 0 + (((tickAnim - 495) / 55) * (0-(0)));
            yy = 0 + (((tickAnim - 495) / 55) * (0-(0)));
            zz = -0.95 + (((tickAnim - 495) / 55) * (0-(-0.95)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.neck4.rotationPointX = this.neck4.rotationPointX + (float)(xx);
        this.neck4.rotationPointY = this.neck4.rotationPointY - (float)(yy);
        this.neck4.rotationPointZ = this.neck4.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 80) {
            xx = 0 + (((tickAnim - 0) / 80) * (9-(0)));
            yy = 0 + (((tickAnim - 0) / 80) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 80) * (0-(0)));
        }
        else if (tickAnim >= 80 && tickAnim < 100) {
            xx = 9 + (((tickAnim - 80) / 20) * (19.63-(9)));
            yy = 0 + (((tickAnim - 80) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 80) / 20) * (0-(0)));
        }
        else if (tickAnim >= 100 && tickAnim < 120) {
            xx = 19.63 + (((tickAnim - 100) / 20) * (7.75-(19.63)));
            yy = 0 + (((tickAnim - 100) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 100) / 20) * (0-(0)));
        }
        else if (tickAnim >= 120 && tickAnim < 220) {
            xx = 7.75 + (((tickAnim - 120) / 100) * (7.75-(7.75)));
            yy = 0 + (((tickAnim - 120) / 100) * (0-(0)));
            zz = 0 + (((tickAnim - 120) / 100) * (0-(0)));
        }
        else if (tickAnim >= 220 && tickAnim < 495) {
            xx = 7.75 + (((tickAnim - 220) / 275) * (0-(7.75)));
            yy = 0 + (((tickAnim - 220) / 275) * (0-(0)));
            zz = 0 + (((tickAnim - 220) / 275) * (0-(0)));
        }
        else if (tickAnim >= 495 && tickAnim < 550) {
            xx = 0 + (((tickAnim - 495) / 55) * (0-(0)));
            yy = 0 + (((tickAnim - 495) / 55) * (0-(0)));
            zz = 0 + (((tickAnim - 495) / 55) * (0-(0)));
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
            zz = 0 + (((tickAnim - 0) / 80) * (0-(0)));
        }
        else if (tickAnim >= 80 && tickAnim < 100) {
            xx = 0 + (((tickAnim - 80) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 80) / 20) * (0.325-(0)));
            zz = 0 + (((tickAnim - 80) / 20) * (0.95-(0)));
        }
        else if (tickAnim >= 100 && tickAnim < 120) {
            xx = 0 + (((tickAnim - 100) / 20) * (0-(0)));
            yy = 0.325 + (((tickAnim - 100) / 20) * (0-(0.325)));
            zz = 0.95 + (((tickAnim - 100) / 20) * (0-(0.95)));
        }
        else if (tickAnim >= 120 && tickAnim < 550) {
            xx = 0 + (((tickAnim - 120) / 430) * (0-(0)));
            yy = 0 + (((tickAnim - 120) / 430) * (0-(0)));
            zz = 0 + (((tickAnim - 120) / 430) * (0-(0)));
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
            xx = 0 + (((tickAnim - 0) / 80) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 80) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 80) * (0-(0)));
        }
        else if (tickAnim >= 80 && tickAnim < 120) {
            xx = 0 + (((tickAnim - 80) / 40) * (7.75+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150))*1-(0)));
            yy = 0 + (((tickAnim - 80) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 80) / 40) * (0-(0)));
        }
        else if (tickAnim >= 120 && tickAnim < 410) {
            xx = 7.75+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150))*1 + (((tickAnim - 120) / 290) * (7.75+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150))*1-(7.75+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150))*1)));
            yy = 0 + (((tickAnim - 120) / 290) * (0-(0)));
            zz = 0 + (((tickAnim - 120) / 290) * (0-(0)));
        }
        else if (tickAnim >= 410 && tickAnim < 425) {
            xx = 7.75+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150))*1 + (((tickAnim - 410) / 15) * (0-(7.75+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150))*1)));
            yy = 0 + (((tickAnim - 410) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 410) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(xx), jaw.rotateAngleY + (float) Math.toRadians(yy), jaw.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 80) {
            xx = 0 + (((tickAnim - 0) / 80) * (-12.75-(0)));
            yy = 0 + (((tickAnim - 0) / 80) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 80) * (0-(0)));
        }
        else if (tickAnim >= 80 && tickAnim < 100) {
            xx = -12.75 + (((tickAnim - 80) / 20) * (-12.75-(-12.75)));
            yy = 0 + (((tickAnim - 80) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 80) / 20) * (0-(0)));
        }
        else if (tickAnim >= 100 && tickAnim < 120) {
            xx = -12.75 + (((tickAnim - 100) / 20) * (-8.5-(-12.75)));
            yy = 0 + (((tickAnim - 100) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 100) / 20) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*150))-(0)));
        }
        else if (tickAnim >= 120 && tickAnim < 410) {
            xx = -8.5 + (((tickAnim - 120) / 290) * (-6-(-8.5)));
            yy = 0 + (((tickAnim - 120) / 290) * (0-(0)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*150)) + (((tickAnim - 120) / 290) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*150)))));
        }
        else if (tickAnim >= 410 && tickAnim < 425) {
            xx = -6 + (((tickAnim - 410) / 15) * (-5.5-(-6)));
            yy = 0 + (((tickAnim - 410) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 410) / 15) * (0-(0)));
        }
        else if (tickAnim >= 425 && tickAnim < 495) {
            xx = -5.5 + (((tickAnim - 425) / 70) * (3.5-(-5.5)));
            yy = 0 + (((tickAnim - 425) / 70) * (0-(0)));
            zz = 0 + (((tickAnim - 425) / 70) * (0-(0)));
        }
        else if (tickAnim >= 495 && tickAnim < 550) {
            xx = 3.5 + (((tickAnim - 495) / 55) * (0-(3.5)));
            yy = 0 + (((tickAnim - 495) / 55) * (0-(0)));
            zz = 0 + (((tickAnim - 495) / 55) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(throat1, throat1.rotateAngleX + (float) Math.toRadians(xx), throat1.rotateAngleY + (float) Math.toRadians(yy), throat1.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 80) {
            xx = 0 + (((tickAnim - 0) / 80) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 80) * (0.18-(0)));
            zz = 0 + (((tickAnim - 0) / 80) * (2.975-(0)));
        }
        else if (tickAnim >= 80 && tickAnim < 100) {
            xx = 0 + (((tickAnim - 80) / 20) * (0-(0)));
            yy = 0.18 + (((tickAnim - 80) / 20) * (0.18-(0.18)));
            zz = 2.975 + (((tickAnim - 80) / 20) * (2.975-(2.975)));
        }
        else if (tickAnim >= 100 && tickAnim < 120) {
            xx = 0 + (((tickAnim - 100) / 20) * (0-(0)));
            yy = 0.18 + (((tickAnim - 100) / 20) * (0.35+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150))*0.1-(0.18)));
            zz = 2.975 + (((tickAnim - 100) / 20) * (3.7-(2.975)));
        }
        else if (tickAnim >= 120 && tickAnim < 410) {
            xx = 0 + (((tickAnim - 120) / 290) * (0-(0)));
            yy = 0.35+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150))*0.1 + (((tickAnim - 120) / 290) * (0.83-(0.35+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150))*0.1)));
            zz = 3.7 + (((tickAnim - 120) / 290) * (2.975-(3.7)));
        }
        else if (tickAnim >= 410 && tickAnim < 425) {
            xx = 0 + (((tickAnim - 410) / 15) * (0-(0)));
            yy = 0.83 + (((tickAnim - 410) / 15) * (0.675-(0.83)));
            zz = 2.975 + (((tickAnim - 410) / 15) * (1.875-(2.975)));
        }
        else if (tickAnim >= 425 && tickAnim < 495) {
            xx = 0 + (((tickAnim - 425) / 70) * (0-(0)));
            yy = 0.675 + (((tickAnim - 425) / 70) * (1.525-(0.675)));
            zz = 1.875 + (((tickAnim - 425) / 70) * (0.83-(1.875)));
        }
        else if (tickAnim >= 495 && tickAnim < 550) {
            xx = 0 + (((tickAnim - 495) / 55) * (0-(0)));
            yy = 1.525 + (((tickAnim - 495) / 55) * (0-(1.525)));
            zz = 0.83 + (((tickAnim - 495) / 55) * (0-(0.83)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.throat1.rotationPointX = this.throat1.rotationPointX + (float)(xx);
        this.throat1.rotationPointY = this.throat1.rotationPointY - (float)(yy);
        this.throat1.rotationPointZ = this.throat1.rotationPointZ + (float)(zz);


        if (tickAnim >= 120 && tickAnim < 410) {
            xx = 1 + (((tickAnim - 120) / 290) * (1-(1)));
            yy = 1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150))*-0.1 + (((tickAnim - 120) / 290) * (1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150))*-0.1-(1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150))*-0.1)));
            zz = 1 + (((tickAnim - 120) / 290) * (1-(1)));
        }
        else if (tickAnim >= 410 && tickAnim < 425) {
            xx = 1 + (((tickAnim - 410) / 15) * (1-(1)));
            yy = 1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150))*-0.1 + (((tickAnim - 410) / 15) * (1-(1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150))*-0.1)));
            zz = 1 + (((tickAnim - 410) / 15) * (1-(1)));
        }
        else {
            xx = 1;
            yy = 1;
            zz = 1;
        }
        this.throat1.setScale((float)xx, (float)yy, (float)zz);




        if (tickAnim >= 0 && tickAnim < 80) {
            xx = 0 + (((tickAnim - 0) / 80) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 80) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 80) * (0-(0)));
        }
        else if (tickAnim >= 80 && tickAnim < 100) {
            xx = 0 + (((tickAnim - 80) / 20) * (0.84311-(0)));
            yy = 0 + (((tickAnim - 80) / 20) * (31.11779-(0)));
            zz = 0 + (((tickAnim - 80) / 20) * (-32.4726-(0)));
        }
        else if (tickAnim >= 100 && tickAnim < 120) {
            xx = 0.84311 + (((tickAnim - 100) / 20) * (0-(0.84311)));
            yy = 31.11779 + (((tickAnim - 100) / 20) * (0-(31.11779)));
            zz = -32.4726 + (((tickAnim - 100) / 20) * (0-(-32.4726)));
        }
        else if (tickAnim >= 120 && tickAnim < 220) {
            xx = 0 + (((tickAnim - 120) / 100) * (0-(0)));
            yy = 0 + (((tickAnim - 120) / 100) * (0-(0)));
            zz = 0 + (((tickAnim - 120) / 100) * (0-(0)));
        }
        else if (tickAnim >= 220 && tickAnim < 450) {
            xx = 0 + (((tickAnim - 220) / 230) * (0-(0)));
            yy = 0 + (((tickAnim - 220) / 230) * (0-(0)));
            zz = 0 + (((tickAnim - 220) / 230) * (0-(0)));
        }
        else if (tickAnim >= 450 && tickAnim < 495) {
            xx = 0 + (((tickAnim - 450) / 45) * (0-(0)));
            yy = 0 + (((tickAnim - 450) / 45) * (0-(0)));
            zz = 0 + (((tickAnim - 450) / 45) * (-18.5-(0)));
        }
        else if (tickAnim >= 495 && tickAnim < 520) {
            xx = 0 + (((tickAnim - 495) / 25) * (0-(0)));
            yy = 0 + (((tickAnim - 495) / 25) * (0-(0)));
            zz = -18.5 + (((tickAnim - 495) / 25) * (-40.25-(-18.5)));
        }
        else if (tickAnim >= 520 && tickAnim < 550) {
            xx = 0 + (((tickAnim - 520) / 30) * (0-(0)));
            yy = 0 + (((tickAnim - 520) / 30) * (0-(0)));
            zz = -40.25 + (((tickAnim - 520) / 30) * (0-(-40.25)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftHand, leftHand.rotateAngleX + (float) Math.toRadians(xx), leftHand.rotateAngleY + (float) Math.toRadians(yy), leftHand.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 80) {
            xx = 0 + (((tickAnim - 0) / 80) * (-46.80042-(0)));
            yy = 0 + (((tickAnim - 0) / 80) * (24.51835-(0)));
            zz = 0 + (((tickAnim - 0) / 80) * (1.84615-(0)));
        }
        else if (tickAnim >= 80 && tickAnim < 120) {
            xx = -46.80042 + (((tickAnim - 80) / 40) * (-73.62319-(-46.80042)));
            yy = 24.51835 + (((tickAnim - 80) / 40) * (29.6925-(24.51835)));
            zz = 1.84615 + (((tickAnim - 80) / 40) * (-1.52179-(1.84615)));
        }
        else if (tickAnim >= 120 && tickAnim < 220) {
            xx = -73.62319 + (((tickAnim - 120) / 100) * (-73.62319-(-73.62319)));
            yy = 29.6925 + (((tickAnim - 120) / 100) * (29.6925-(29.6925)));
            zz = -1.52179 + (((tickAnim - 120) / 100) * (-1.52179-(-1.52179)));
        }
        else if (tickAnim >= 220 && tickAnim < 450) {
            xx = -73.62319 + (((tickAnim - 220) / 230) * (-73.62319-(-73.62319)));
            yy = 29.6925 + (((tickAnim - 220) / 230) * (29.6925-(29.6925)));
            zz = -1.52179 + (((tickAnim - 220) / 230) * (-1.52179-(-1.52179)));
        }
        else if (tickAnim >= 450 && tickAnim < 495) {
            xx = -73.62319 + (((tickAnim - 450) / 45) * (-48.92825-(-73.62319)));
            yy = 29.6925 + (((tickAnim - 450) / 45) * (25.4917-(29.6925)));
            zz = -1.52179 + (((tickAnim - 450) / 45) * (-5.95398-(-1.52179)));
        }
        else if (tickAnim >= 495 && tickAnim < 550) {
            xx = -48.92825 + (((tickAnim - 495) / 55) * (0-(-48.92825)));
            yy = 25.4917 + (((tickAnim - 495) / 55) * (0-(25.4917)));
            zz = -5.95398 + (((tickAnim - 495) / 55) * (0-(-5.95398)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg1, rightLeg1.rotateAngleX + (float) Math.toRadians(xx), rightLeg1.rotateAngleY + (float) Math.toRadians(yy), rightLeg1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 80) {
            xx = 0 + (((tickAnim - 0) / 80) * (42.5-(0)));
            yy = 0 + (((tickAnim - 0) / 80) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 80) * (0-(0)));
        }
        else if (tickAnim >= 80 && tickAnim < 120) {
            xx = 42.5 + (((tickAnim - 80) / 40) * (48.14369-(42.5)));
            yy = 0 + (((tickAnim - 80) / 40) * (2.13146-(0)));
            zz = 0 + (((tickAnim - 80) / 40) * (7.71261-(0)));
        }
        else if (tickAnim >= 120 && tickAnim < 220) {
            xx = 48.14369 + (((tickAnim - 120) / 100) * (48.14369-(48.14369)));
            yy = 2.13146 + (((tickAnim - 120) / 100) * (2.13146-(2.13146)));
            zz = 7.71261 + (((tickAnim - 120) / 100) * (7.71261-(7.71261)));
        }
        else if (tickAnim >= 220 && tickAnim < 450) {
            xx = 48.14369 + (((tickAnim - 220) / 230) * (48.14369-(48.14369)));
            yy = 2.13146 + (((tickAnim - 220) / 230) * (2.13146-(2.13146)));
            zz = 7.71261 + (((tickAnim - 220) / 230) * (7.71261-(7.71261)));
        }
        else if (tickAnim >= 450 && tickAnim < 495) {
            xx = 48.14369 + (((tickAnim - 450) / 45) * (45.64369-(48.14369)));
            yy = 2.13146 + (((tickAnim - 450) / 45) * (2.13146-(2.13146)));
            zz = 7.71261 + (((tickAnim - 450) / 45) * (7.71261-(7.71261)));
        }
        else if (tickAnim >= 495 && tickAnim < 550) {
            xx = 45.64369 + (((tickAnim - 495) / 55) * (0-(45.64369)));
            yy = 2.13146 + (((tickAnim - 495) / 55) * (0-(2.13146)));
            zz = 7.71261 + (((tickAnim - 495) / 55) * (0-(7.71261)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg2, rightLeg2.rotateAngleX + (float) Math.toRadians(xx), rightLeg2.rotateAngleY + (float) Math.toRadians(yy), rightLeg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 80) {
            xx = 0 + (((tickAnim - 0) / 80) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 80) * (0.975-(0)));
            zz = 0 + (((tickAnim - 0) / 80) * (-1.375-(0)));
        }
        else if (tickAnim >= 80 && tickAnim < 120) {
            xx = 0 + (((tickAnim - 80) / 40) * (0-(0)));
            yy = 0.975 + (((tickAnim - 80) / 40) * (0.53-(0.975)));
            zz = -1.375 + (((tickAnim - 80) / 40) * (-1.27-(-1.375)));
        }
        else if (tickAnim >= 120 && tickAnim < 220) {
            xx = 0 + (((tickAnim - 120) / 100) * (0-(0)));
            yy = 0.53 + (((tickAnim - 120) / 100) * (0.53-(0.53)));
            zz = -1.27 + (((tickAnim - 120) / 100) * (-1.27-(-1.27)));
        }
        else if (tickAnim >= 220 && tickAnim < 450) {
            xx = 0 + (((tickAnim - 220) / 230) * (0-(0)));
            yy = 0.53 + (((tickAnim - 220) / 230) * (0.53-(0.53)));
            zz = -1.27 + (((tickAnim - 220) / 230) * (-1.27-(-1.27)));
        }
        else if (tickAnim >= 450 && tickAnim < 495) {
            xx = 0 + (((tickAnim - 450) / 45) * (0-(0)));
            yy = 0.53 + (((tickAnim - 450) / 45) * (0.53-(0.53)));
            zz = -1.27 + (((tickAnim - 450) / 45) * (-0.47-(-1.27)));
        }
        else if (tickAnim >= 495 && tickAnim < 550) {
            xx = 0 + (((tickAnim - 495) / 55) * (0-(0)));
            yy = 0.53 + (((tickAnim - 495) / 55) * (0-(0.53)));
            zz = -0.47 + (((tickAnim - 495) / 55) * (0-(-0.47)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightLeg2.rotationPointX = this.rightLeg2.rotationPointX + (float)(xx);
        this.rightLeg2.rotationPointY = this.rightLeg2.rotationPointY - (float)(yy);
        this.rightLeg2.rotationPointZ = this.rightLeg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 80) {
            xx = 0 + (((tickAnim - 0) / 80) * (-49-(0)));
            yy = 0 + (((tickAnim - 0) / 80) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 80) * (0-(0)));
        }
        else if (tickAnim >= 80 && tickAnim < 120) {
            xx = -49 + (((tickAnim - 80) / 40) * (-42-(-49)));
            yy = 0 + (((tickAnim - 80) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 80) / 40) * (0-(0)));
        }
        else if (tickAnim >= 120 && tickAnim < 220) {
            xx = -42 + (((tickAnim - 120) / 100) * (-42-(-42)));
            yy = 0 + (((tickAnim - 120) / 100) * (0-(0)));
            zz = 0 + (((tickAnim - 120) / 100) * (0-(0)));
        }
        else if (tickAnim >= 220 && tickAnim < 450) {
            xx = -42 + (((tickAnim - 220) / 230) * (-42-(-42)));
            yy = 0 + (((tickAnim - 220) / 230) * (0-(0)));
            zz = 0 + (((tickAnim - 220) / 230) * (0-(0)));
        }
        else if (tickAnim >= 450 && tickAnim < 495) {
            xx = -42 + (((tickAnim - 450) / 45) * (-58-(-42)));
            yy = 0 + (((tickAnim - 450) / 45) * (0-(0)));
            zz = 0 + (((tickAnim - 450) / 45) * (0-(0)));
        }
        else if (tickAnim >= 495 && tickAnim < 550) {
            xx = -58 + (((tickAnim - 495) / 55) * (0-(-58)));
            yy = 0 + (((tickAnim - 495) / 55) * (0-(0)));
            zz = 0 + (((tickAnim - 495) / 55) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg3, rightLeg3.rotateAngleX + (float) Math.toRadians(xx), rightLeg3.rotateAngleY + (float) Math.toRadians(yy), rightLeg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 80) {
            xx = 0 + (((tickAnim - 0) / 80) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 80) * (-0.6-(0)));
            zz = 0 + (((tickAnim - 0) / 80) * (0-(0)));
        }
        else if (tickAnim >= 80 && tickAnim < 98) {
            xx = 0 + (((tickAnim - 80) / 18) * (0-(0)));
            yy = -0.6 + (((tickAnim - 80) / 18) * (1.65-(-0.6)));
            zz = 0 + (((tickAnim - 80) / 18) * (0-(0)));
        }
        else if (tickAnim >= 98 && tickAnim < 120) {
            xx = 0 + (((tickAnim - 98) / 22) * (0-(0)));
            yy = 1.65 + (((tickAnim - 98) / 22) * (3.05-(1.65)));
            zz = 0 + (((tickAnim - 98) / 22) * (0-(0)));
        }
        else if (tickAnim >= 120 && tickAnim < 220) {
            xx = 0 + (((tickAnim - 120) / 100) * (0-(0)));
            yy = 3.05 + (((tickAnim - 120) / 100) * (3.05-(3.05)));
            zz = 0 + (((tickAnim - 120) / 100) * (0-(0)));
        }
        else if (tickAnim >= 220 && tickAnim < 450) {
            xx = 0 + (((tickAnim - 220) / 230) * (0-(0)));
            yy = 3.05 + (((tickAnim - 220) / 230) * (3.05-(3.05)));
            zz = 0 + (((tickAnim - 220) / 230) * (0-(0)));
        }
        else if (tickAnim >= 450 && tickAnim < 495) {
            xx = 0 + (((tickAnim - 450) / 45) * (0-(0)));
            yy = 3.05 + (((tickAnim - 450) / 45) * (0-(3.05)));
            zz = 0 + (((tickAnim - 450) / 45) * (0-(0)));
        }
        else if (tickAnim >= 495 && tickAnim < 550) {
            xx = 0 + (((tickAnim - 495) / 55) * (0-(0)));
            yy = 0 + (((tickAnim - 495) / 55) * (0-(0)));
            zz = 0 + (((tickAnim - 495) / 55) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightLeg3.rotationPointX = this.rightLeg3.rotationPointX + (float)(xx);
        this.rightLeg3.rotationPointY = this.rightLeg3.rotationPointY - (float)(yy);
        this.rightLeg3.rotationPointZ = this.rightLeg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 55) {
            xx = 0 + (((tickAnim - 0) / 55) * (50.67-(0)));
            yy = 0 + (((tickAnim - 0) / 55) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 55) * (0-(0)));
        }
        else if (tickAnim >= 55 && tickAnim < 80) {
            xx = 50.67 + (((tickAnim - 55) / 25) * (68.25-(50.67)));
            yy = 0 + (((tickAnim - 55) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 55) / 25) * (0-(0)));
        }
        else if (tickAnim >= 80 && tickAnim < 450) {
            xx = 68.25 + (((tickAnim - 80) / 370) * (68.25-(68.25)));
            yy = 0 + (((tickAnim - 80) / 370) * (0-(0)));
            zz = 0 + (((tickAnim - 80) / 370) * (0-(0)));
        }
        else if (tickAnim >= 450 && tickAnim < 495) {
            xx = 68.25 + (((tickAnim - 450) / 45) * (53.54-(68.25)));
            yy = 0 + (((tickAnim - 450) / 45) * (0-(0)));
            zz = 0 + (((tickAnim - 450) / 45) * (0-(0)));
        }
        else if (tickAnim >= 495 && tickAnim < 550) {
            xx = 53.54 + (((tickAnim - 495) / 55) * (0-(53.54)));
            yy = 0 + (((tickAnim - 495) / 55) * (0-(0)));
            zz = 0 + (((tickAnim - 495) / 55) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightFoot, rightFoot.rotateAngleX + (float) Math.toRadians(xx), rightFoot.rotateAngleY + (float) Math.toRadians(yy), rightFoot.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 30) * (2.675-(0)));
            zz = 0 + (((tickAnim - 0) / 30) * (-1.005-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 55) {
            xx = 0 + (((tickAnim - 30) / 25) * (0-(0)));
            yy = 2.675 + (((tickAnim - 30) / 25) * (2.125-(2.675)));
            zz = -1.005 + (((tickAnim - 30) / 25) * (-2.005-(-1.005)));
        }
        else if (tickAnim >= 55 && tickAnim < 80) {
            xx = 0 + (((tickAnim - 55) / 25) * (0-(0)));
            yy = 2.125 + (((tickAnim - 55) / 25) * (2.125-(2.125)));
            zz = -2.005 + (((tickAnim - 55) / 25) * (-2.005-(-2.005)));
        }
        else if (tickAnim >= 80 && tickAnim < 98) {
            xx = 0 + (((tickAnim - 80) / 18) * (0-(0)));
            yy = 2.125 + (((tickAnim - 80) / 18) * (0-(2.125)));
            zz = -2.005 + (((tickAnim - 80) / 18) * (-1.275-(-2.005)));
        }
        else if (tickAnim >= 98 && tickAnim < 120) {
            xx = 0 + (((tickAnim - 98) / 22) * (0-(0)));
            yy = 0 + (((tickAnim - 98) / 22) * (0-(0)));
            zz = -1.275 + (((tickAnim - 98) / 22) * (0-(-1.275)));
        }
        else if (tickAnim >= 120 && tickAnim < 220) {
            xx = 0 + (((tickAnim - 120) / 100) * (0-(0)));
            yy = 0 + (((tickAnim - 120) / 100) * (0-(0)));
            zz = 0 + (((tickAnim - 120) / 100) * (0-(0)));
        }
        else if (tickAnim >= 220 && tickAnim < 450) {
            xx = 0 + (((tickAnim - 220) / 230) * (0-(0)));
            yy = 0 + (((tickAnim - 220) / 230) * (0-(0)));
            zz = 0 + (((tickAnim - 220) / 230) * (0-(0)));
        }
        else if (tickAnim >= 450 && tickAnim < 495) {
            xx = 0 + (((tickAnim - 450) / 45) * (0-(0)));
            yy = 0 + (((tickAnim - 450) / 45) * (0-(0)));
            zz = 0 + (((tickAnim - 450) / 45) * (-0.7-(0)));
        }
        else if (tickAnim >= 495 && tickAnim < 550) {
            xx = 0 + (((tickAnim - 495) / 55) * (0-(0)));
            yy = 0 + (((tickAnim - 495) / 55) * (0-(0)));
            zz = -0.7 + (((tickAnim - 495) / 55) * (0-(-0.7)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightFoot.rotationPointX = this.rightFoot.rotationPointX + (float)(xx);
        this.rightFoot.rotationPointY = this.rightFoot.rotationPointY - (float)(yy);
        this.rightFoot.rotationPointZ = this.rightFoot.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 80) {
            xx = 0 + (((tickAnim - 0) / 80) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 80) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 80) * (14-(0)));
        }
        else if (tickAnim >= 80 && tickAnim < 120) {
            xx = 0 + (((tickAnim - 80) / 40) * (-30.48712-(0)));
            yy = 0 + (((tickAnim - 80) / 40) * (14.75757-(0)));
            zz = 14 + (((tickAnim - 80) / 40) * (68.42501-(14)));
        }
        else if (tickAnim >= 120 && tickAnim < 220) {
            xx = -30.48712 + (((tickAnim - 120) / 100) * (-30.48712-(-30.48712)));
            yy = 14.75757 + (((tickAnim - 120) / 100) * (14.75757-(14.75757)));
            zz = 68.42501 + (((tickAnim - 120) / 100) * (68.42501-(68.42501)));
        }
        else if (tickAnim >= 220 && tickAnim < 450) {
            xx = -30.48712 + (((tickAnim - 220) / 230) * (-30.48712-(-30.48712)));
            yy = 14.75757 + (((tickAnim - 220) / 230) * (14.75757-(14.75757)));
            zz = 68.42501 + (((tickAnim - 220) / 230) * (68.42501-(68.42501)));
        }
        else if (tickAnim >= 450 && tickAnim < 495) {
            xx = -30.48712 + (((tickAnim - 450) / 45) * (-32.27202-(-30.48712)));
            yy = 14.75757 + (((tickAnim - 450) / 45) * (17.35932-(14.75757)));
            zz = 68.42501 + (((tickAnim - 450) / 45) * (65.28826-(68.42501)));
        }
        else if (tickAnim >= 495 && tickAnim < 550) {
            xx = -32.27202 + (((tickAnim - 495) / 55) * (0-(-32.27202)));
            yy = 17.35932 + (((tickAnim - 495) / 55) * (0-(17.35932)));
            zz = 65.28826 + (((tickAnim - 495) / 55) * (0-(65.28826)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm1, rightArm1.rotateAngleX + (float) Math.toRadians(xx), rightArm1.rotateAngleY + (float) Math.toRadians(yy), rightArm1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 80) {
            xx = 0 + (((tickAnim - 0) / 80) * (-66.5-(0)));
            yy = 0 + (((tickAnim - 0) / 80) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 80) * (0-(0)));
        }
        else if (tickAnim >= 80 && tickAnim < 100) {
            xx = -66.5 + (((tickAnim - 80) / 20) * (-36.49577-(-66.5)));
            yy = 0 + (((tickAnim - 80) / 20) * (13.81207-(0)));
            zz = 0 + (((tickAnim - 80) / 20) * (-19.94806-(0)));
        }
        else if (tickAnim >= 100 && tickAnim < 120) {
            xx = -36.49577 + (((tickAnim - 100) / 20) * (-9.45618-(-36.49577)));
            yy = 13.81207 + (((tickAnim - 100) / 20) * (18.9617-(13.81207)));
            zz = -19.94806 + (((tickAnim - 100) / 20) * (5.38852-(-19.94806)));
        }
        else if (tickAnim >= 120 && tickAnim < 220) {
            xx = -9.45618 + (((tickAnim - 120) / 100) * (-9.45618-(-9.45618)));
            yy = 18.9617 + (((tickAnim - 120) / 100) * (18.9617-(18.9617)));
            zz = 5.38852 + (((tickAnim - 120) / 100) * (5.38852-(5.38852)));
        }
        else if (tickAnim >= 220 && tickAnim < 450) {
            xx = -9.45618 + (((tickAnim - 220) / 230) * (-9.45618-(-9.45618)));
            yy = 18.9617 + (((tickAnim - 220) / 230) * (18.9617-(18.9617)));
            zz = 5.38852 + (((tickAnim - 220) / 230) * (5.38852-(5.38852)));
        }
        else if (tickAnim >= 450 && tickAnim < 550) {
            xx = -9.45618 + (((tickAnim - 450) / 100) * (0-(-9.45618)));
            yy = 18.9617 + (((tickAnim - 450) / 100) * (0-(18.9617)));
            zz = 5.38852 + (((tickAnim - 450) / 100) * (0-(5.38852)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm2, rightArm2.rotateAngleX + (float) Math.toRadians(xx), rightArm2.rotateAngleY + (float) Math.toRadians(yy), rightArm2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 80 && tickAnim < 100) {
            xx = 0 + (((tickAnim - 80) / 20) * (0.84311-(0)));
            yy = 0 + (((tickAnim - 80) / 20) * (-31.11779-(0)));
            zz = 0 + (((tickAnim - 80) / 20) * (32.4726-(0)));
        }
        else if (tickAnim >= 100 && tickAnim < 120) {
            xx = 0.84311 + (((tickAnim - 100) / 20) * (0-(0.84311)));
            yy = -31.11779 + (((tickAnim - 100) / 20) * (0-(-31.11779)));
            zz = 32.4726 + (((tickAnim - 100) / 20) * (0-(32.4726)));
        }
        else if (tickAnim >= 120 && tickAnim < 220) {
            xx = 0 + (((tickAnim - 120) / 100) * (0-(0)));
            yy = 0 + (((tickAnim - 120) / 100) * (0-(0)));
            zz = 0 + (((tickAnim - 120) / 100) * (0-(0)));
        }
        else if (tickAnim >= 220 && tickAnim < 450) {
            xx = 0 + (((tickAnim - 220) / 230) * (0-(0)));
            yy = 0 + (((tickAnim - 220) / 230) * (0-(0)));
            zz = 0 + (((tickAnim - 220) / 230) * (0-(0)));
        }
        else if (tickAnim >= 450 && tickAnim < 495) {
            xx = 0 + (((tickAnim - 450) / 45) * (0-(0)));
            yy = 0 + (((tickAnim - 450) / 45) * (0-(0)));
            zz = 0 + (((tickAnim - 450) / 45) * (18.5-(0)));
        }
        else if (tickAnim >= 495 && tickAnim < 520) {
            xx = 0 + (((tickAnim - 495) / 25) * (0-(0)));
            yy = 0 + (((tickAnim - 495) / 25) * (0-(0)));
            zz = 18.5 + (((tickAnim - 495) / 25) * (40.25-(18.5)));
        }
        else if (tickAnim >= 520 && tickAnim < 550) {
            xx = 0 + (((tickAnim - 520) / 30) * (0-(0)));
            yy = 0 + (((tickAnim - 520) / 30) * (0-(0)));
            zz = 40.25 + (((tickAnim - 520) / 30) * (0-(40.25)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightHand, rightHand.rotateAngleX + (float) Math.toRadians(xx), rightHand.rotateAngleY + (float) Math.toRadians(yy), rightHand.rotateAngleZ + (float) Math.toRadians(zz));

    }
    public void animDisplay(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraSpinosaurus entity = (EntityPrehistoricFloraSpinosaurus) entitylivingbaseIn;
        int animCycle = 270;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 0) / 35) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 35) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 35) * (-1.75-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 35) / 25) * (0-(0)));
            yy = 0 + (((tickAnim - 35) / 25) * (0-(0)));
            zz = -1.75 + (((tickAnim - 35) / 25) * (0-(-1.75)));
        }
        else if (tickAnim >= 60 && tickAnim < 95) {
            xx = 0 + (((tickAnim - 60) / 35) * (0-(0)));
            yy = 0 + (((tickAnim - 60) / 35) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 35) * (0.75-(0)));
        }
        else if (tickAnim >= 95 && tickAnim < 119) {
            xx = 0 + (((tickAnim - 95) / 24) * (0-(0)));
            yy = 0 + (((tickAnim - 95) / 24) * (0-(0)));
            zz = 0.75 + (((tickAnim - 95) / 24) * (0-(0.75)));
        }
        else if (tickAnim >= 119 && tickAnim < 120) {
            xx = 0 + (((tickAnim - 119) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 119) / 1) * (8.675+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*10-(0)));
            zz = 0 + (((tickAnim - 119) / 1) * (0-(0)));
        }
        else if (tickAnim >= 120 && tickAnim < 180) {
            xx = 0 + (((tickAnim - 120) / 60) * (-6.8605-(0)));
            yy = 8.675+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*10 + (((tickAnim - 120) / 60) * (17.00774-(8.675+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*10)));
            zz = 0 + (((tickAnim - 120) / 60) * (2.45655-(0)));
        }
        else if (tickAnim >= 180 && tickAnim < 220) {
            xx = -6.8605 + (((tickAnim - 180) / 40) * (-6.8605-(-6.8605)));
            yy = 17.00774 + (((tickAnim - 180) / 40) * (17.00774-(17.00774)));
            zz = 2.45655 + (((tickAnim - 180) / 40) * (2.45655-(2.45655)));
        }
        else if (tickAnim >= 220 && tickAnim < 270) {
            xx = -6.8605 + (((tickAnim - 220) / 50) * (0-(-6.8605)));
            yy = 17.00774 + (((tickAnim - 220) / 50) * (0-(17.00774)));
            zz = 2.45655 + (((tickAnim - 220) / 50) * (0-(2.45655)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(hips, hips.rotateAngleX + (float) Math.toRadians(xx), hips.rotateAngleY + (float) Math.toRadians(yy), hips.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 119) {
            xx = 0 + (((tickAnim - 0) / 119) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 119) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 119) * (0-(0)));
        }
        else if (tickAnim >= 119 && tickAnim < 180) {
            xx = 0 + (((tickAnim - 119) / 61) * (0-(0)));
            yy = 0 + (((tickAnim - 119) / 61) * (0-(0)));
            zz = 0 + (((tickAnim - 119) / 61) * (2.475-(0)));
        }
        else if (tickAnim >= 180 && tickAnim < 220) {
            xx = 0 + (((tickAnim - 180) / 40) * (0-(0)));
            yy = 0 + (((tickAnim - 180) / 40) * (0-(0)));
            zz = 2.475 + (((tickAnim - 180) / 40) * (2.475-(2.475)));
        }
        else if (tickAnim >= 220 && tickAnim < 270) {
            xx = 0 + (((tickAnim - 220) / 50) * (0-(0)));
            yy = 0 + (((tickAnim - 220) / 50) * (0-(0)));
            zz = 2.475 + (((tickAnim - 220) / 50) * (0-(2.475)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.hips.rotationPointX = this.hips.rotationPointX + (float)(xx);
        this.hips.rotationPointY = this.hips.rotationPointY - (float)(yy);
        this.hips.rotationPointZ = this.hips.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 0) / 35) * (24-(0)));
            yy = 0 + (((tickAnim - 0) / 35) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 35) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 60) {
            xx = 24 + (((tickAnim - 35) / 25) * (0-(24)));
            yy = 0 + (((tickAnim - 35) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 25) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 95) {
            xx = 0 + (((tickAnim - 60) / 35) * (0-(0)));
            yy = 0 + (((tickAnim - 60) / 35) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 35) * (-2.25-(0)));
        }
        else if (tickAnim >= 95 && tickAnim < 120) {
            xx = 0 + (((tickAnim - 95) / 25) * (0-(0)));
            yy = 0 + (((tickAnim - 95) / 25) * (0-(0)));
            zz = -2.25 + (((tickAnim - 95) / 25) * (0-(-2.25)));
        }
        else if (tickAnim >= 120 && tickAnim < 180) {
            xx = 0 + (((tickAnim - 120) / 60) * (2.9136-(0)));
            yy = 0 + (((tickAnim - 120) / 60) * (-15.25906-(0)));
            zz = 0 + (((tickAnim - 120) / 60) * (-11.89272-(0)));
        }
        else if (tickAnim >= 180 && tickAnim < 220) {
            xx = 2.9136 + (((tickAnim - 180) / 40) * (2.9136-(2.9136)));
            yy = -15.25906 + (((tickAnim - 180) / 40) * (-15.25906-(-15.25906)));
            zz = -11.89272 + (((tickAnim - 180) / 40) * (-11.89272-(-11.89272)));
        }
        else if (tickAnim >= 220 && tickAnim < 270) {
            xx = 2.9136 + (((tickAnim - 220) / 50) * (0-(2.9136)));
            yy = -15.25906 + (((tickAnim - 220) / 50) * (0-(-15.25906)));
            zz = -11.89272 + (((tickAnim - 220) / 50) * (0-(-11.89272)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg1, leftLeg1.rotateAngleX + (float) Math.toRadians(xx), leftLeg1.rotateAngleY + (float) Math.toRadians(yy), leftLeg1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 0) / 35) * (9.5-(0)));
            yy = 0 + (((tickAnim - 0) / 35) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 35) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 44) {
            xx = 9.5 + (((tickAnim - 35) / 9) * (26.27-(9.5)));
            yy = 0 + (((tickAnim - 35) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 9) * (0-(0)));
        }
        else if (tickAnim >= 44 && tickAnim < 60) {
            xx = 26.27 + (((tickAnim - 44) / 16) * (0-(26.27)));
            yy = 0 + (((tickAnim - 44) / 16) * (0-(0)));
            zz = 0 + (((tickAnim - 44) / 16) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 120) {
            xx = 0 + (((tickAnim - 60) / 60) * (0-(0)));
            yy = 0 + (((tickAnim - 60) / 60) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 60) * (0-(0)));
        }
        else if (tickAnim >= 120 && tickAnim < 270) {
            xx = 0 + (((tickAnim - 120) / 150) * (0-(0)));
            yy = 0 + (((tickAnim - 120) / 150) * (0-(0)));
            zz = 0 + (((tickAnim - 120) / 150) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg2, leftLeg2.rotateAngleX + (float) Math.toRadians(xx), leftLeg2.rotateAngleY + (float) Math.toRadians(yy), leftLeg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 0) / 35) * (7-(0)));
            yy = 0 + (((tickAnim - 0) / 35) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 35) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 48) {
            xx = 7 + (((tickAnim - 35) / 13) * (-42.48-(7)));
            yy = 0 + (((tickAnim - 35) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 13) * (0-(0)));
        }
        else if (tickAnim >= 48 && tickAnim < 60) {
            xx = -42.48 + (((tickAnim - 48) / 12) * (0-(-42.48)));
            yy = 0 + (((tickAnim - 48) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 48) / 12) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 120) {
            xx = 0 + (((tickAnim - 60) / 60) * (0-(0)));
            yy = 0 + (((tickAnim - 60) / 60) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 60) * (0-(0)));
        }
        else if (tickAnim >= 120 && tickAnim < 180) {
            xx = 0 + (((tickAnim - 120) / 60) * (16.75-(0)));
            yy = 0 + (((tickAnim - 120) / 60) * (0-(0)));
            zz = 0 + (((tickAnim - 120) / 60) * (0-(0)));
        }
        else if (tickAnim >= 180 && tickAnim < 220) {
            xx = 16.75 + (((tickAnim - 180) / 40) * (16.75-(16.75)));
            yy = 0 + (((tickAnim - 180) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 180) / 40) * (0-(0)));
        }
        else if (tickAnim >= 220 && tickAnim < 270) {
            xx = 16.75 + (((tickAnim - 220) / 50) * (0-(16.75)));
            yy = 0 + (((tickAnim - 220) / 50) * (0-(0)));
            zz = 0 + (((tickAnim - 220) / 50) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg3, leftLeg3.rotateAngleX + (float) Math.toRadians(xx), leftLeg3.rotateAngleY + (float) Math.toRadians(yy), leftLeg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 0) / 35) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 35) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 35) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 48) {
            xx = 0 + (((tickAnim - 35) / 13) * (0-(0)));
            yy = 0 + (((tickAnim - 35) / 13) * (1.75-(0)));
            zz = 0 + (((tickAnim - 35) / 13) * (0-(0)));
        }
        else if (tickAnim >= 48 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 48) / 12) * (0-(0)));
            yy = 1.75 + (((tickAnim - 48) / 12) * (0-(1.75)));
            zz = 0 + (((tickAnim - 48) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftLeg3.rotationPointX = this.leftLeg3.rotationPointX + (float)(xx);
        this.leftLeg3.rotationPointY = this.leftLeg3.rotationPointY - (float)(yy);
        this.leftLeg3.rotationPointZ = this.leftLeg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 120) {
            xx = 0 + (((tickAnim - 0) / 120) * (3.75213-(0)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*250-100))*0.1 + (((tickAnim - 0) / 120) * (1.491082488+Math.sin((Math.PI/180)*(((double)tickAnim/20)*250-100))*0.1-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*250-100))*0.1)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*250-100))*0.1 + (((tickAnim - 0) / 120) * (0.1633371881+Math.sin((Math.PI/180)*(((double)tickAnim/20)*250-100))*0.1-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*250-100))*0.1)));
        }
        else if (tickAnim >= 120 && tickAnim < 180) {
            xx = 3.75213 + (((tickAnim - 120) / 60) * (3.8175-(3.75213)));
            yy = 1.491082488+Math.sin((Math.PI/180)*(((double)tickAnim/20)*250-100))*0.1 + (((tickAnim - 120) / 60) * (8.4491+Math.sin((Math.PI/180)*(((double)tickAnim/20)*250-100))*0.1-(1.491082488+Math.sin((Math.PI/180)*(((double)tickAnim/20)*250-100))*0.1)));
            zz = 0.1633371881+Math.sin((Math.PI/180)*(((double)tickAnim/20)*250-100))*0.1 + (((tickAnim - 120) / 60) * (0.9319+Math.sin((Math.PI/180)*(((double)tickAnim/20)*250-100))*0.1-(0.1633371881+Math.sin((Math.PI/180)*(((double)tickAnim/20)*250-100))*0.1)));
        }
        else if (tickAnim >= 180 && tickAnim < 220) {
            xx = 3.8175 + (((tickAnim - 180) / 40) * (3.8175-(3.8175)));
            yy = 8.4491+Math.sin((Math.PI/180)*(((double)tickAnim/20)*250-100))*0.1 + (((tickAnim - 180) / 40) * (8.4491+Math.sin((Math.PI/180)*(((double)tickAnim/20)*250-100))*0.1-(8.4491+Math.sin((Math.PI/180)*(((double)tickAnim/20)*250-100))*0.1)));
            zz = 0.9319+Math.sin((Math.PI/180)*(((double)tickAnim/20)*250-100))*0.1 + (((tickAnim - 180) / 40) * (0.9319+Math.sin((Math.PI/180)*(((double)tickAnim/20)*250-100))*0.1-(0.9319+Math.sin((Math.PI/180)*(((double)tickAnim/20)*250-100))*0.1)));
        }
        else if (tickAnim >= 220 && tickAnim < 270) {
            xx = 3.8175 + (((tickAnim - 220) / 50) * (0-(3.8175)));
            yy = 8.4491+Math.sin((Math.PI/180)*(((double)tickAnim/20)*250-100))*0.1 + (((tickAnim - 220) / 50) * (0-(8.4491+Math.sin((Math.PI/180)*(((double)tickAnim/20)*250-100))*0.1)));
            zz = 0.9319+Math.sin((Math.PI/180)*(((double)tickAnim/20)*250-100))*0.1 + (((tickAnim - 220) / 50) * (0-(0.9319+Math.sin((Math.PI/180)*(((double)tickAnim/20)*250-100))*0.1)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail1, tail1.rotateAngleX + (float) Math.toRadians(xx), tail1.rotateAngleY + (float) Math.toRadians(yy), tail1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 120) {
            xx = 0 + (((tickAnim - 0) / 120) * (2.75-(0)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*250-150))*0.2 + (((tickAnim - 0) / 120) * (9.75+Math.sin((Math.PI/180)*(((double)tickAnim/20)*250-150))*0.2-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*250-150))*0.2)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*250-150))*0.2 + (((tickAnim - 0) / 120) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*250-150))*0.2-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*250-150))*0.2)));
        }
        else if (tickAnim >= 120 && tickAnim < 220) {
            xx = 2.75 + (((tickAnim - 120) / 100) * (2.68762-(2.75)));
            yy = 9.75+Math.sin((Math.PI/180)*(((double)tickAnim/20)*250-150))*0.2 + (((tickAnim - 120) / 100) * (7.0247+Math.sin((Math.PI/180)*(((double)tickAnim/20)*250-150))*0.2-(9.75+Math.sin((Math.PI/180)*(((double)tickAnim/20)*250-150))*0.2)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*250-150))*0.2 + (((tickAnim - 120) / 100) * (-0.3744+Math.sin((Math.PI/180)*(((double)tickAnim/20)*250-150))*0.2-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*250-150))*0.2)));
        }
        else if (tickAnim >= 220 && tickAnim < 270) {
            xx = 2.68762 + (((tickAnim - 220) / 50) * (0-(2.68762)));
            yy = 7.0247+Math.sin((Math.PI/180)*(((double)tickAnim/20)*250-150))*0.2 + (((tickAnim - 220) / 50) * (0-(7.0247+Math.sin((Math.PI/180)*(((double)tickAnim/20)*250-150))*0.2)));
            zz = -0.3744+Math.sin((Math.PI/180)*(((double)tickAnim/20)*250-150))*0.2 + (((tickAnim - 220) / 50) * (0-(-0.3744+Math.sin((Math.PI/180)*(((double)tickAnim/20)*250-150))*0.2)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(xx), tail2.rotateAngleY + (float) Math.toRadians(yy), tail2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 120) {
            xx = 0 + (((tickAnim - 0) / 120) * (3-(0)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*250-200))*0.3 + (((tickAnim - 0) / 120) * (8+Math.sin((Math.PI/180)*(((double)tickAnim/20)*250-200))*0.3-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*250-200))*0.3)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*250-200))*0.3 + (((tickAnim - 0) / 120) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*250-200))*0.3-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*250-200))*0.3)));
        }
        else if (tickAnim >= 120 && tickAnim < 180) {
            xx = 3 + (((tickAnim - 120) / 60) * (2.97013-(3)));
            yy = 8+Math.sin((Math.PI/180)*(((double)tickAnim/20)*250-200))*0.3 + (((tickAnim - 120) / 60) * (-5.4386+Math.sin((Math.PI/180)*(((double)tickAnim/20)*250-200))*0.3-(8+Math.sin((Math.PI/180)*(((double)tickAnim/20)*250-200))*0.3)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*250-200))*0.3 + (((tickAnim - 120) / 60) * (-1.2878+Math.sin((Math.PI/180)*(((double)tickAnim/20)*250-200))*0.3-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*250-200))*0.3)));
        }
        else if (tickAnim >= 180 && tickAnim < 220) {
            xx = 2.97013 + (((tickAnim - 180) / 40) * (2.97013-(2.97013)));
            yy = -5.4386+Math.sin((Math.PI/180)*(((double)tickAnim/20)*250-200))*0.3 + (((tickAnim - 180) / 40) * (-5.4386+Math.sin((Math.PI/180)*(((double)tickAnim/20)*250-200))*0.3-(-5.4386+Math.sin((Math.PI/180)*(((double)tickAnim/20)*250-200))*0.3)));
            zz = -1.2878+Math.sin((Math.PI/180)*(((double)tickAnim/20)*250-200))*0.3 + (((tickAnim - 180) / 40) * (-1.2878+Math.sin((Math.PI/180)*(((double)tickAnim/20)*250-200))*0.3-(-1.2878+Math.sin((Math.PI/180)*(((double)tickAnim/20)*250-200))*0.3)));
        }
        else if (tickAnim >= 220 && tickAnim < 270) {
            xx = 2.97013 + (((tickAnim - 220) / 50) * (0-(2.97013)));
            yy = -5.4386+Math.sin((Math.PI/180)*(((double)tickAnim/20)*250-200))*0.3 + (((tickAnim - 220) / 50) * (0-(-5.4386+Math.sin((Math.PI/180)*(((double)tickAnim/20)*250-200))*0.3)));
            zz = -1.2878+Math.sin((Math.PI/180)*(((double)tickAnim/20)*250-200))*0.3 + (((tickAnim - 220) / 50) * (0-(-1.2878+Math.sin((Math.PI/180)*(((double)tickAnim/20)*250-200))*0.3)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(xx), tail3.rotateAngleY + (float) Math.toRadians(yy), tail3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 120) {
            xx = 0 + (((tickAnim - 0) / 120) * (1.5-(0)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*250-250))*1 + (((tickAnim - 0) / 120) * (6.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*250-250))*1-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*250-250))*1)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*250-250))*1 + (((tickAnim - 0) / 120) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*250-250))*1-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*250-250))*1)));
        }
        else if (tickAnim >= 120 && tickAnim < 180) {
            xx = 1.5 + (((tickAnim - 120) / 60) * (1.47733-(1.5)));
            yy = 6.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*250-250))*1 + (((tickAnim - 120) / 60) * (-4.4742+Math.sin((Math.PI/180)*(((double)tickAnim/20)*250-250))*1-(6.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*250-250))*1)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*250-250))*1 + (((tickAnim - 120) / 60) * (-0.747+Math.sin((Math.PI/180)*(((double)tickAnim/20)*250-250))*1-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*250-250))*1)));
        }
        else if (tickAnim >= 180 && tickAnim < 220) {
            xx = 1.47733 + (((tickAnim - 180) / 40) * (1.47733-(1.47733)));
            yy = -4.4742+Math.sin((Math.PI/180)*(((double)tickAnim/20)*250-250))*1 + (((tickAnim - 180) / 40) * (-4.4742+Math.sin((Math.PI/180)*(((double)tickAnim/20)*250-250))*1-(-4.4742+Math.sin((Math.PI/180)*(((double)tickAnim/20)*250-250))*1)));
            zz = -0.747+Math.sin((Math.PI/180)*(((double)tickAnim/20)*250-250))*1 + (((tickAnim - 180) / 40) * (-0.747+Math.sin((Math.PI/180)*(((double)tickAnim/20)*250-250))*1-(-0.747+Math.sin((Math.PI/180)*(((double)tickAnim/20)*250-250))*1)));
        }
        else if (tickAnim >= 220 && tickAnim < 270) {
            xx = 1.47733 + (((tickAnim - 220) / 50) * (0-(1.47733)));
            yy = -4.4742+Math.sin((Math.PI/180)*(((double)tickAnim/20)*250-250))*1 + (((tickAnim - 220) / 50) * (0-(-4.4742+Math.sin((Math.PI/180)*(((double)tickAnim/20)*250-250))*1)));
            zz = -0.747+Math.sin((Math.PI/180)*(((double)tickAnim/20)*250-250))*1 + (((tickAnim - 220) / 50) * (0-(-0.747+Math.sin((Math.PI/180)*(((double)tickAnim/20)*250-250))*1)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(xx), tail4.rotateAngleY + (float) Math.toRadians(yy), tail4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 120) {
            xx = 0 + (((tickAnim - 0) / 120) * (2.75-(0)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*250-300))*1.5 + (((tickAnim - 0) / 120) * (7.75+Math.sin((Math.PI/180)*(((double)tickAnim/20)*250-300))*1.5-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*250-300))*1.5)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*250-300))*1.5 + (((tickAnim - 0) / 120) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*250-300))*1.5-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*250-300))*1.5)));
        }
        else if (tickAnim >= 120 && tickAnim < 180) {
            xx = 2.75 + (((tickAnim - 120) / 60) * (2.73414-(2.75)));
            yy = 7.75+Math.sin((Math.PI/180)*(((double)tickAnim/20)*250-300))*1.5 + (((tickAnim - 120) / 60) * (0.8786+Math.sin((Math.PI/180)*(((double)tickAnim/20)*250-300))*1.5-(7.75+Math.sin((Math.PI/180)*(((double)tickAnim/20)*250-300))*1.5)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*250-300))*1.5 + (((tickAnim - 120) / 60) * (-1.1874+Math.sin((Math.PI/180)*(((double)tickAnim/20)*250-300))*1.5-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*250-300))*1.5)));
        }
        else if (tickAnim >= 180 && tickAnim < 220) {
            xx = 2.73414 + (((tickAnim - 180) / 40) * (2.73414-(2.73414)));
            yy = 0.8786+Math.sin((Math.PI/180)*(((double)tickAnim/20)*250-300))*1.5 + (((tickAnim - 180) / 40) * (0.8786+Math.sin((Math.PI/180)*(((double)tickAnim/20)*250-300))*1.5-(0.8786+Math.sin((Math.PI/180)*(((double)tickAnim/20)*250-300))*1.5)));
            zz = -1.1874+Math.sin((Math.PI/180)*(((double)tickAnim/20)*250-300))*1.5 + (((tickAnim - 180) / 40) * (-1.1874+Math.sin((Math.PI/180)*(((double)tickAnim/20)*250-300))*1.5-(-1.1874+Math.sin((Math.PI/180)*(((double)tickAnim/20)*250-300))*1.5)));
        }
        else if (tickAnim >= 220 && tickAnim < 270) {
            xx = 2.73414 + (((tickAnim - 220) / 50) * (0-(2.73414)));
            yy = 0.8786+Math.sin((Math.PI/180)*(((double)tickAnim/20)*250-300))*1.5 + (((tickAnim - 220) / 50) * (0-(0.8786+Math.sin((Math.PI/180)*(((double)tickAnim/20)*250-300))*1.5)));
            zz = -1.1874+Math.sin((Math.PI/180)*(((double)tickAnim/20)*250-300))*1.5 + (((tickAnim - 220) / 50) * (0-(-1.1874+Math.sin((Math.PI/180)*(((double)tickAnim/20)*250-300))*1.5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail5, tail5.rotateAngleX + (float) Math.toRadians(xx), tail5.rotateAngleY + (float) Math.toRadians(yy), tail5.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 120) {
            xx = 0 + (((tickAnim - 0) / 120) * (4.25-(0)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*250-400))*1.6 + (((tickAnim - 0) / 120) * (10.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*250-400))*1.6-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*250-400))*1.6)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*250-400))*1.6 + (((tickAnim - 0) / 120) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*250-400))*1.6-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*250-400))*1.6)));
        }
        else if (tickAnim >= 120 && tickAnim < 180) {
            xx = 4.25 + (((tickAnim - 120) / 60) * (4.26149-(4.25)));
            yy = 10.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*250-400))*1.6 + (((tickAnim - 120) / 60) * (-7.4717+Math.sin((Math.PI/180)*(((double)tickAnim/20)*250-400))*1.6-(10.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*250-400))*1.6)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*250-400))*1.6 + (((tickAnim - 120) / 60) * (1.0003+Math.sin((Math.PI/180)*(((double)tickAnim/20)*250-400))*1.6-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*250-400))*1.6)));
        }
        else if (tickAnim >= 180 && tickAnim < 220) {
            xx = 4.26149 + (((tickAnim - 180) / 40) * (4.26149-(4.26149)));
            yy = -7.4717+Math.sin((Math.PI/180)*(((double)tickAnim/20)*250-400))*1.6 + (((tickAnim - 180) / 40) * (-7.4717+Math.sin((Math.PI/180)*(((double)tickAnim/20)*250-400))*1.6-(-7.4717+Math.sin((Math.PI/180)*(((double)tickAnim/20)*250-400))*1.6)));
            zz = 1.0003+Math.sin((Math.PI/180)*(((double)tickAnim/20)*250-400))*1.6 + (((tickAnim - 180) / 40) * (1.0003+Math.sin((Math.PI/180)*(((double)tickAnim/20)*250-400))*1.6-(1.0003+Math.sin((Math.PI/180)*(((double)tickAnim/20)*250-400))*1.6)));
        }
        else if (tickAnim >= 220 && tickAnim < 270) {
            xx = 4.26149 + (((tickAnim - 220) / 50) * (0-(4.26149)));
            yy = -7.4717+Math.sin((Math.PI/180)*(((double)tickAnim/20)*250-400))*1.6 + (((tickAnim - 220) / 50) * (0-(-7.4717+Math.sin((Math.PI/180)*(((double)tickAnim/20)*250-400))*1.6)));
            zz = 1.0003+Math.sin((Math.PI/180)*(((double)tickAnim/20)*250-400))*1.6 + (((tickAnim - 220) / 50) * (0-(1.0003+Math.sin((Math.PI/180)*(((double)tickAnim/20)*250-400))*1.6)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail6, tail6.rotateAngleX + (float) Math.toRadians(xx), tail6.rotateAngleY + (float) Math.toRadians(yy), tail6.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 120) {
            xx = 0 + (((tickAnim - 0) / 120) * (5.80154-(0)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*250-450))*1.7 + (((tickAnim - 0) / 120) * (7.5127692196+Math.sin((Math.PI/180)*(((double)tickAnim/20)*250-450))*1.7-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*250-450))*1.7)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*250-450))*1.7 + (((tickAnim - 0) / 120) * (-1.4943591977+Math.sin((Math.PI/180)*(((double)tickAnim/20)*250-450))*1.7-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*250-450))*1.7)));
        }
        else if (tickAnim >= 120 && tickAnim < 180) {
            xx = 5.80154 + (((tickAnim - 120) / 60) * (5.66244-(5.80154)));
            yy = 7.5127692196+Math.sin((Math.PI/180)*(((double)tickAnim/20)*250-450))*1.7 + (((tickAnim - 120) / 60) * (-1.3836+Math.sin((Math.PI/180)*(((double)tickAnim/20)*250-450))*1.7-(7.5127692196+Math.sin((Math.PI/180)*(((double)tickAnim/20)*250-450))*1.7)));
            zz = -1.4943591977+Math.sin((Math.PI/180)*(((double)tickAnim/20)*250-450))*1.7 + (((tickAnim - 120) / 60) * (2.986+Math.sin((Math.PI/180)*(((double)tickAnim/20)*250-450))*1.7-(-1.4943591977+Math.sin((Math.PI/180)*(((double)tickAnim/20)*250-450))*1.7)));
        }
        else if (tickAnim >= 180 && tickAnim < 220) {
            xx = 5.66244 + (((tickAnim - 180) / 40) * (5.66244-(5.66244)));
            yy = -1.3836+Math.sin((Math.PI/180)*(((double)tickAnim/20)*250-450))*1.7 + (((tickAnim - 180) / 40) * (-1.3836+Math.sin((Math.PI/180)*(((double)tickAnim/20)*250-450))*1.7-(-1.3836+Math.sin((Math.PI/180)*(((double)tickAnim/20)*250-450))*1.7)));
            zz = 2.986+Math.sin((Math.PI/180)*(((double)tickAnim/20)*250-450))*1.7 + (((tickAnim - 180) / 40) * (2.986+Math.sin((Math.PI/180)*(((double)tickAnim/20)*250-450))*1.7-(2.986+Math.sin((Math.PI/180)*(((double)tickAnim/20)*250-450))*1.7)));
        }
        else if (tickAnim >= 220 && tickAnim < 270) {
            xx = 5.66244 + (((tickAnim - 220) / 50) * (0-(5.66244)));
            yy = -1.3836+Math.sin((Math.PI/180)*(((double)tickAnim/20)*250-450))*1.7 + (((tickAnim - 220) / 50) * (0-(-1.3836+Math.sin((Math.PI/180)*(((double)tickAnim/20)*250-450))*1.7)));
            zz = 2.986+Math.sin((Math.PI/180)*(((double)tickAnim/20)*250-450))*1.7 + (((tickAnim - 220) / 50) * (0-(2.986+Math.sin((Math.PI/180)*(((double)tickAnim/20)*250-450))*1.7)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail7, tail7.rotateAngleX + (float) Math.toRadians(xx), tail7.rotateAngleY + (float) Math.toRadians(yy), tail7.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 119) {
            xx = 0 + (((tickAnim - 0) / 119) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 119) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 119) * (0-(0)));
        }
        else if (tickAnim >= 119 && tickAnim < 120) {
            xx = 0 + (((tickAnim - 119) / 1) * (-4.35+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-5-(0)));
            yy = 0 + (((tickAnim - 119) / 1) * (4.375+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*5-(0)));
            zz = 0 + (((tickAnim - 119) / 1) * (0-(0)));
        }
        else if (tickAnim >= 120 && tickAnim < 180) {
            xx = -4.35+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-5 + (((tickAnim - 120) / 60) * (-3.75-(-4.35+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-5)));
            yy = 4.375+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*5 + (((tickAnim - 120) / 60) * (8.5-(4.375+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*5)));
            zz = 0 + (((tickAnim - 120) / 60) * (0-(0)));
        }
        else if (tickAnim >= 180 && tickAnim < 220) {
            xx = -3.75 + (((tickAnim - 180) / 40) * (-3.75-(-3.75)));
            yy = 8.5 + (((tickAnim - 180) / 40) * (8.5-(8.5)));
            zz = 0 + (((tickAnim - 180) / 40) * (0-(0)));
        }
        else if (tickAnim >= 220 && tickAnim < 270) {
            xx = -3.75 + (((tickAnim - 220) / 50) * (0-(-3.75)));
            yy = 8.5 + (((tickAnim - 220) / 50) * (0-(8.5)));
            zz = 0 + (((tickAnim - 220) / 50) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(xx), body.rotateAngleY + (float) Math.toRadians(yy), body.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 120) {
            xx = 0 + (((tickAnim - 0) / 120) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 120) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 120) * (0-(0)));
        }
        else if (tickAnim >= 120 && tickAnim < 180) {
            xx = 0 + (((tickAnim - 120) / 60) * (1-(0)));
            yy = 0 + (((tickAnim - 120) / 60) * (1.5-(0)));
            zz = 0 + (((tickAnim - 120) / 60) * (0-(0)));
        }
        else if (tickAnim >= 180 && tickAnim < 220) {
            xx = 1 + (((tickAnim - 180) / 40) * (1-(1)));
            yy = 1.5 + (((tickAnim - 180) / 40) * (1.5-(1.5)));
            zz = 0 + (((tickAnim - 180) / 40) * (0-(0)));
        }
        else if (tickAnim >= 220 && tickAnim < 270) {
            xx = 1 + (((tickAnim - 220) / 50) * (0-(1)));
            yy = 1.5 + (((tickAnim - 220) / 50) * (0-(1.5)));
            zz = 0 + (((tickAnim - 220) / 50) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(sailMiddle, sailMiddle.rotateAngleX + (float) Math.toRadians(xx), sailMiddle.rotateAngleY + (float) Math.toRadians(yy), sailMiddle.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 119) {
            xx = 0 + (((tickAnim - 0) / 119) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 119) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 119) * (0-(0)));
        }
        else if (tickAnim >= 119 && tickAnim < 120) {
            xx = 0 + (((tickAnim - 119) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 119) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 119) / 1) * (0-(0)));
        }
        else if (tickAnim >= 120 && tickAnim < 180) {
            xx = 0 + (((tickAnim - 120) / 60) * (-5.5-(0)));
            yy = 0 + (((tickAnim - 120) / 60) * (6.25-(0)));
            zz = 0 + (((tickAnim - 120) / 60) * (0-(0)));
        }
        else if (tickAnim >= 180 && tickAnim < 220) {
            xx = -5.5 + (((tickAnim - 180) / 40) * (-5.5-(-5.5)));
            yy = 6.25 + (((tickAnim - 180) / 40) * (6.25-(6.25)));
            zz = 0 + (((tickAnim - 180) / 40) * (0-(0)));
        }
        else if (tickAnim >= 220 && tickAnim < 270) {
            xx = -5.5 + (((tickAnim - 220) / 50) * (0-(-5.5)));
            yy = 6.25 + (((tickAnim - 220) / 50) * (0-(6.25)));
            zz = 0 + (((tickAnim - 220) / 50) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(xx), chest.rotateAngleY + (float) Math.toRadians(yy), chest.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 120) {
            xx = 0 + (((tickAnim - 0) / 120) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 120) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 120) * (0-(0)));
        }
        else if (tickAnim >= 120 && tickAnim < 180) {
            xx = 0 + (((tickAnim - 120) / 60) * (7.01802-(0)));
            yy = 0 + (((tickAnim - 120) / 60) * (1.67592-(0)));
            zz = 0 + (((tickAnim - 120) / 60) * (0.70982-(0)));
        }
        else if (tickAnim >= 180 && tickAnim < 220) {
            xx = 7.01802 + (((tickAnim - 180) / 40) * (7.01802-(7.01802)));
            yy = 1.67592 + (((tickAnim - 180) / 40) * (1.67592-(1.67592)));
            zz = 0.70982 + (((tickAnim - 180) / 40) * (0.70982-(0.70982)));
        }
        else if (tickAnim >= 220 && tickAnim < 270) {
            xx = 7.01802 + (((tickAnim - 220) / 50) * (0-(7.01802)));
            yy = 1.67592 + (((tickAnim - 220) / 50) * (0-(1.67592)));
            zz = 0.70982 + (((tickAnim - 220) / 50) * (0-(0.70982)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(sailFront, sailFront.rotateAngleX + (float) Math.toRadians(xx), sailFront.rotateAngleY + (float) Math.toRadians(yy), sailFront.rotateAngleZ + (float) Math.toRadians(zz));

        this.sailFront.rotationPointX = this.sailFront.rotationPointX + (float)(0);
        this.sailFront.rotationPointY = this.sailFront.rotationPointY - (float)(0);
        this.sailFront.rotationPointZ = this.sailFront.rotationPointZ + (float)(0);



        if (tickAnim >= 0 && tickAnim < 35) {
            xx = 14.85+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-100))*15 + (((tickAnim - 0) / 35) * (13.75-(14.85+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-100))*15)));
            yy = 0 + (((tickAnim - 0) / 35) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*250-100))*1-(0)));
            zz = 0 + (((tickAnim - 0) / 35) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*250-100))*1-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 120) {
            xx = 13.75 + (((tickAnim - 35) / 85) * (13.75-(13.75)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*250-100))*1 + (((tickAnim - 35) / 85) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*250-100))*1-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*250-100))*1)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*250-100))*1 + (((tickAnim - 35) / 85) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*250-100))*1-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*250-100))*1)));
        }
        else if (tickAnim >= 120 && tickAnim < 180) {
            xx = 13.75 + (((tickAnim - 120) / 60) * (4.5-(13.75)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*250-100))*1 + (((tickAnim - 120) / 60) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*250-100))*1-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*250-100))*1)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*250-100))*1 + (((tickAnim - 120) / 60) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*250-100))*1-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*250-100))*1)));
        }
        else if (tickAnim >= 180 && tickAnim < 220) {
            xx = 4.5 + (((tickAnim - 180) / 40) * (-2-(4.5)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*250-100))*1 + (((tickAnim - 180) / 40) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*250-100))*1-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*250-100))*1)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*250-100))*1 + (((tickAnim - 180) / 40) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*250-100))*1-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*250-100))*1)));
        }
        else if (tickAnim >= 220 && tickAnim < 270) {
            xx = -2 + (((tickAnim - 220) / 50) * (0-(-2)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*250-100))*1 + (((tickAnim - 220) / 50) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*250-100))*1)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*250-100))*1 + (((tickAnim - 220) / 50) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*250-100))*1)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck1, neck1.rotateAngleX + (float) Math.toRadians(xx), neck1.rotateAngleY + (float) Math.toRadians(yy), neck1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 0) / 35) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 35) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*250-150))*1-(0)));
            zz = 0 + (((tickAnim - 0) / 35) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*250-150))*1-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 120) {
            xx = 0 + (((tickAnim - 35) / 85) * (0-(0)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*250-150))*1 + (((tickAnim - 35) / 85) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*250-150))*1-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*250-150))*1)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*250-150))*1 + (((tickAnim - 35) / 85) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*250-150))*1-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*250-150))*1)));
        }
        else if (tickAnim >= 120 && tickAnim < 140) {
            xx = 0 + (((tickAnim - 120) / 20) * (5.05839-(0)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*250-150))*1 + (((tickAnim - 120) / 20) * (7.6682+Math.sin((Math.PI/180)*(((double)tickAnim/20)*250-150))*1-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*250-150))*1)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*250-150))*1 + (((tickAnim - 120) / 20) * (3.7415+Math.sin((Math.PI/180)*(((double)tickAnim/20)*250-150))*1-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*250-150))*1)));
        }
        else if (tickAnim >= 140 && tickAnim < 180) {
            xx = 5.05839 + (((tickAnim - 140) / 40) * (1.5-(5.05839)));
            yy = 7.6682+Math.sin((Math.PI/180)*(((double)tickAnim/20)*250-150))*1 + (((tickAnim - 140) / 40) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*250-150))*1-(7.6682+Math.sin((Math.PI/180)*(((double)tickAnim/20)*250-150))*1)));
            zz = 3.7415+Math.sin((Math.PI/180)*(((double)tickAnim/20)*250-150))*1 + (((tickAnim - 140) / 40) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*250-150))*1-(3.7415+Math.sin((Math.PI/180)*(((double)tickAnim/20)*250-150))*1)));
        }
        else if (tickAnim >= 180 && tickAnim < 220) {
            xx = 1.5 + (((tickAnim - 180) / 40) * (-3.75-(1.5)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*250-150))*1 + (((tickAnim - 180) / 40) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*250-150))*1-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*250-150))*1)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*250-150))*1 + (((tickAnim - 180) / 40) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*250-150))*1-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*250-150))*1)));
        }
        else if (tickAnim >= 220 && tickAnim < 247) {
            xx = -3.75 + (((tickAnim - 220) / 27) * (10.27475-(-3.75)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*250-150))*1 + (((tickAnim - 220) / 27) * (-1.1399976971+Math.sin((Math.PI/180)*(((double)tickAnim/20)*250-150))*1-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*250-150))*1)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*250-150))*1 + (((tickAnim - 220) / 27) * (-3.3281398419+Math.sin((Math.PI/180)*(((double)tickAnim/20)*250-150))*1-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*250-150))*1)));
        }
        else if (tickAnim >= 247 && tickAnim < 270) {
            xx = 10.27475 + (((tickAnim - 247) / 23) * (0-(10.27475)));
            yy = -1.1399976971+Math.sin((Math.PI/180)*(((double)tickAnim/20)*250-150))*1 + (((tickAnim - 247) / 23) * (0-(-1.1399976971+Math.sin((Math.PI/180)*(((double)tickAnim/20)*250-150))*1)));
            zz = -3.3281398419+Math.sin((Math.PI/180)*(((double)tickAnim/20)*250-150))*1 + (((tickAnim - 247) / 23) * (0-(-3.3281398419+Math.sin((Math.PI/180)*(((double)tickAnim/20)*250-150))*1)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(xx), neck2.rotateAngleY + (float) Math.toRadians(yy), neck2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 180) {
            xx = 0 + (((tickAnim - 0) / 180) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 180) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 180) * (0-(0)));
        }
        else if (tickAnim >= 180 && tickAnim < 220) {
            xx = 0 + (((tickAnim - 180) / 40) * (0-(0)));
            yy = 0 + (((tickAnim - 180) / 40) * (-0.325-(0)));
            zz = 0 + (((tickAnim - 180) / 40) * (0.8-(0)));
        }
        else if (tickAnim >= 220 && tickAnim < 270) {
            xx = 0 + (((tickAnim - 220) / 50) * (0-(0)));
            yy = -0.325 + (((tickAnim - 220) / 50) * (0-(-0.325)));
            zz = 0.8 + (((tickAnim - 220) / 50) * (0-(0.8)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.neck2.rotationPointX = this.neck2.rotationPointX + (float)(xx);
        this.neck2.rotationPointY = this.neck2.rotationPointY - (float)(yy);
        this.neck2.rotationPointZ = this.neck2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 35) {
            xx = 9.425+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-110))*10 + (((tickAnim - 0) / 35) * (5.25-(9.425+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-110))*10)));
            yy = 0 + (((tickAnim - 0) / 35) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*250-250))*1-(0)));
            zz = 0 + (((tickAnim - 0) / 35) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*250-250))*1-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 120) {
            xx = 5.25 + (((tickAnim - 35) / 85) * (5.25-(5.25)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*250-250))*1 + (((tickAnim - 35) / 85) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*250-250))*1-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*250-250))*1)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*250-250))*1 + (((tickAnim - 35) / 85) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*250-250))*1-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*250-250))*1)));
        }
        else if (tickAnim >= 120 && tickAnim < 140) {
            xx = 5.25 + (((tickAnim - 120) / 20) * (-4.95173-(5.25)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*250-250))*1 + (((tickAnim - 120) / 20) * (2.6314+Math.sin((Math.PI/180)*(((double)tickAnim/20)*250-250))*1-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*250-250))*1)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*250-250))*1 + (((tickAnim - 120) / 20) * (4.6196+Math.sin((Math.PI/180)*(((double)tickAnim/20)*250-250))*1-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*250-250))*1)));
        }
        else if (tickAnim >= 140 && tickAnim < 180) {
            xx = -4.95173 + (((tickAnim - 140) / 40) * (-7.25-(-4.95173)));
            yy = 2.6314+Math.sin((Math.PI/180)*(((double)tickAnim/20)*250-250))*1 + (((tickAnim - 140) / 40) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*250-250))*1-(2.6314+Math.sin((Math.PI/180)*(((double)tickAnim/20)*250-250))*1)));
            zz = 4.6196+Math.sin((Math.PI/180)*(((double)tickAnim/20)*250-250))*1 + (((tickAnim - 140) / 40) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*250-250))*1-(4.6196+Math.sin((Math.PI/180)*(((double)tickAnim/20)*250-250))*1)));
        }
        else if (tickAnim >= 180 && tickAnim < 220) {
            xx = -7.25 + (((tickAnim - 180) / 40) * (10.75-(-7.25)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*250-250))*1 + (((tickAnim - 180) / 40) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*250-250))*1-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*250-250))*1)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*250-250))*1 + (((tickAnim - 180) / 40) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*250-250))*1-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*250-250))*1)));
        }
        else if (tickAnim >= 220 && tickAnim < 247) {
            xx = 10.75 + (((tickAnim - 220) / 27) * (5.18096-(10.75)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*250-250))*1 + (((tickAnim - 220) / 27) * (-4.776696124+Math.sin((Math.PI/180)*(((double)tickAnim/20)*250-250))*1-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*250-250))*1)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*250-250))*1 + (((tickAnim - 220) / 27) * (-3.2472378172+Math.sin((Math.PI/180)*(((double)tickAnim/20)*250-250))*1-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*250-250))*1)));
        }
        else if (tickAnim >= 247 && tickAnim < 270) {
            xx = 5.18096 + (((tickAnim - 247) / 23) * (0-(5.18096)));
            yy = -4.776696124+Math.sin((Math.PI/180)*(((double)tickAnim/20)*250-250))*1 + (((tickAnim - 247) / 23) * (0-(-4.776696124+Math.sin((Math.PI/180)*(((double)tickAnim/20)*250-250))*1)));
            zz = -3.2472378172+Math.sin((Math.PI/180)*(((double)tickAnim/20)*250-250))*1 + (((tickAnim - 247) / 23) * (0-(-3.2472378172+Math.sin((Math.PI/180)*(((double)tickAnim/20)*250-250))*1)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(xx), neck3.rotateAngleY + (float) Math.toRadians(yy), neck3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 180) {
            xx = 0 + (((tickAnim - 0) / 180) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 180) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 180) * (0-(0)));
        }
        else if (tickAnim >= 180 && tickAnim < 220) {
            xx = 0 + (((tickAnim - 180) / 40) * (0-(0)));
            yy = 0 + (((tickAnim - 180) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 180) / 40) * (0.725-(0)));
        }
        else if (tickAnim >= 220 && tickAnim < 270) {
            xx = 0 + (((tickAnim - 220) / 50) * (0-(0)));
            yy = 0 + (((tickAnim - 220) / 50) * (0-(0)));
            zz = 0.725 + (((tickAnim - 220) / 50) * (0-(0.725)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.neck3.rotationPointX = this.neck3.rotationPointX + (float)(xx);
        this.neck3.rotationPointY = this.neck3.rotationPointY - (float)(yy);
        this.neck3.rotationPointZ = this.neck3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 0) / 35) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 35) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*250-300))*1-(0)));
            zz = 0 + (((tickAnim - 0) / 35) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*250-300))*1-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 120) {
            xx = 0 + (((tickAnim - 35) / 85) * (0-(0)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*250-300))*1 + (((tickAnim - 35) / 85) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*250-300))*1-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*250-300))*1)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*250-300))*1 + (((tickAnim - 35) / 85) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*250-300))*1-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*250-300))*1)));
        }
        else if (tickAnim >= 120 && tickAnim < 220) {
            xx = 0 + (((tickAnim - 120) / 100) * (0-(0)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*250-300))*1 + (((tickAnim - 120) / 100) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*250-300))*1-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*250-300))*1)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*250-300))*1 + (((tickAnim - 120) / 100) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*250-300))*1-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*250-300))*1)));
        }
        else if (tickAnim >= 220 && tickAnim < 247) {
            xx = 0 + (((tickAnim - 220) / 27) * (0.25767-(0)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*250-300))*1 + (((tickAnim - 220) / 27) * (-7.9350363701+Math.sin((Math.PI/180)*(((double)tickAnim/20)*250-300))*1-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*250-300))*1)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*250-300))*1 + (((tickAnim - 220) / 27) * (-3.9738618911+Math.sin((Math.PI/180)*(((double)tickAnim/20)*250-300))*1-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*250-300))*1)));
        }
        else if (tickAnim >= 247 && tickAnim < 270) {
            xx = 0.25767 + (((tickAnim - 247) / 23) * (0-(0.25767)));
            yy = -7.9350363701+Math.sin((Math.PI/180)*(((double)tickAnim/20)*250-300))*1 + (((tickAnim - 247) / 23) * (0-(-7.9350363701+Math.sin((Math.PI/180)*(((double)tickAnim/20)*250-300))*1)));
            zz = -3.9738618911+Math.sin((Math.PI/180)*(((double)tickAnim/20)*250-300))*1 + (((tickAnim - 247) / 23) * (0-(-3.9738618911+Math.sin((Math.PI/180)*(((double)tickAnim/20)*250-300))*1)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck4, neck4.rotateAngleX + (float) Math.toRadians(xx), neck4.rotateAngleY + (float) Math.toRadians(yy), neck4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 35) {
            xx = 9.425+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-110))*10 + (((tickAnim - 0) / 35) * (7.25-(9.425+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-110))*10)));
            yy = 0 + (((tickAnim - 0) / 35) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*250-350))*1-(0)));
            zz = 0 + (((tickAnim - 0) / 35) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*250-350))*1-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 120) {
            xx = 7.25 + (((tickAnim - 35) / 85) * (7.25-(7.25)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*250-350))*1 + (((tickAnim - 35) / 85) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*250-350))*1-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*250-350))*1)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*250-350))*1 + (((tickAnim - 35) / 85) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*250-350))*1-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*250-350))*1)));
        }
        else if (tickAnim >= 120 && tickAnim < 180) {
            xx = 7.25 + (((tickAnim - 120) / 60) * (-3.25-(7.25)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*250-350))*1 + (((tickAnim - 120) / 60) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*250-350))*1-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*250-350))*1)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*250-350))*1 + (((tickAnim - 120) / 60) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*250-350))*1-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*250-350))*1)));
        }
        else if (tickAnim >= 180 && tickAnim < 220) {
            xx = -3.25 + (((tickAnim - 180) / 40) * (-3.25-(-3.25)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*250-350))*1 + (((tickAnim - 180) / 40) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*250-350))*1-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*250-350))*1)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*250-350))*1 + (((tickAnim - 180) / 40) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*250-350))*1-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*250-350))*1)));
        }
        else if (tickAnim >= 220 && tickAnim < 270) {
            xx = -3.25 + (((tickAnim - 220) / 50) * (0-(-3.25)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*250-350))*1 + (((tickAnim - 220) / 50) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*250-350))*1)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*250-350))*1 + (((tickAnim - 220) / 50) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*250-350))*1)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));

        this.head.rotationPointX = this.head.rotationPointX + (float)(0);
        this.head.rotationPointY = this.head.rotationPointY - (float)(0);
        this.head.rotationPointZ = this.head.rotationPointZ + (float)(0);



        if (tickAnim >= 120 && tickAnim < 125) {
            xx = 0 + (((tickAnim - 120) / 5) * (3.5-(0)));
            yy = 0 + (((tickAnim - 120) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 120) / 5) * (0-(0)));
        }
        else if (tickAnim >= 125 && tickAnim < 130) {
            xx = 3.5 + (((tickAnim - 125) / 5) * (0-(3.5)));
            yy = 0 + (((tickAnim - 125) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 125) / 5) * (0-(0)));
        }
        else if (tickAnim >= 130 && tickAnim < 135) {
            xx = 0 + (((tickAnim - 130) / 5) * (3.5-(0)));
            yy = 0 + (((tickAnim - 130) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 130) / 5) * (0-(0)));
        }
        else if (tickAnim >= 135 && tickAnim < 140) {
            xx = 3.5 + (((tickAnim - 135) / 5) * (0-(3.5)));
            yy = 0 + (((tickAnim - 135) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 135) / 5) * (0-(0)));
        }
        else if (tickAnim >= 140 && tickAnim < 145) {
            xx = 0 + (((tickAnim - 140) / 5) * (3.5-(0)));
            yy = 0 + (((tickAnim - 140) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 140) / 5) * (0-(0)));
        }
        else if (tickAnim >= 145 && tickAnim < 150) {
            xx = 3.5 + (((tickAnim - 145) / 5) * (0-(3.5)));
            yy = 0 + (((tickAnim - 145) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 145) / 5) * (0-(0)));
        }
        else if (tickAnim >= 150 && tickAnim < 155) {
            xx = 0 + (((tickAnim - 150) / 5) * (3.5-(0)));
            yy = 0 + (((tickAnim - 150) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 150) / 5) * (0-(0)));
        }
        else if (tickAnim >= 155 && tickAnim < 160) {
            xx = 3.5 + (((tickAnim - 155) / 5) * (0-(3.5)));
            yy = 0 + (((tickAnim - 155) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 155) / 5) * (0-(0)));
        }
        else if (tickAnim >= 160 && tickAnim < 165) {
            xx = 0 + (((tickAnim - 160) / 5) * (3.5-(0)));
            yy = 0 + (((tickAnim - 160) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 160) / 5) * (0-(0)));
        }
        else if (tickAnim >= 165 && tickAnim < 170) {
            xx = 3.5 + (((tickAnim - 165) / 5) * (0-(3.5)));
            yy = 0 + (((tickAnim - 165) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 165) / 5) * (0-(0)));
        }
        else if (tickAnim >= 170 && tickAnim < 175) {
            xx = 0 + (((tickAnim - 170) / 5) * (3.5-(0)));
            yy = 0 + (((tickAnim - 170) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 170) / 5) * (0-(0)));
        }
        else if (tickAnim >= 175 && tickAnim < 180) {
            xx = 3.5 + (((tickAnim - 175) / 5) * (0-(3.5)));
            yy = 0 + (((tickAnim - 175) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 175) / 5) * (0-(0)));
        }
        else if (tickAnim >= 180 && tickAnim < 185) {
            xx = 0 + (((tickAnim - 180) / 5) * (3.5-(0)));
            yy = 0 + (((tickAnim - 180) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 180) / 5) * (0-(0)));
        }
        else if (tickAnim >= 185 && tickAnim < 190) {
            xx = 3.5 + (((tickAnim - 185) / 5) * (0-(3.5)));
            yy = 0 + (((tickAnim - 185) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 185) / 5) * (0-(0)));
        }
        else if (tickAnim >= 190 && tickAnim < 195) {
            xx = 0 + (((tickAnim - 190) / 5) * (3.5-(0)));
            yy = 0 + (((tickAnim - 190) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 190) / 5) * (0-(0)));
        }
        else if (tickAnim >= 195 && tickAnim < 200) {
            xx = 3.5 + (((tickAnim - 195) / 5) * (0-(3.5)));
            yy = 0 + (((tickAnim - 195) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 195) / 5) * (0-(0)));
        }
        else if (tickAnim >= 200 && tickAnim < 205) {
            xx = 0 + (((tickAnim - 200) / 5) * (3.5-(0)));
            yy = 0 + (((tickAnim - 200) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 200) / 5) * (0-(0)));
        }
        else if (tickAnim >= 205 && tickAnim < 210) {
            xx = 3.5 + (((tickAnim - 205) / 5) * (0-(3.5)));
            yy = 0 + (((tickAnim - 205) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 205) / 5) * (0-(0)));
        }
        else if (tickAnim >= 210 && tickAnim < 215) {
            xx = 0 + (((tickAnim - 210) / 5) * (3.5-(0)));
            yy = 0 + (((tickAnim - 210) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 210) / 5) * (0-(0)));
        }
        else if (tickAnim >= 215 && tickAnim < 220) {
            xx = 3.5 + (((tickAnim - 215) / 5) * (0-(3.5)));
            yy = 0 + (((tickAnim - 215) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 215) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(xx), jaw.rotateAngleY + (float) Math.toRadians(yy), jaw.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 0) / 35) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 35) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 35) * (1.5-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 35) / 25) * (0-(0)));
            yy = 0 + (((tickAnim - 35) / 25) * (0-(0)));
            zz = 1.5 + (((tickAnim - 35) / 25) * (0-(1.5)));
        }
        else if (tickAnim >= 60 && tickAnim < 95) {
            xx = 0 + (((tickAnim - 60) / 35) * (24-(0)));
            yy = 0 + (((tickAnim - 60) / 35) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 35) * (0-(0)));
        }
        else if (tickAnim >= 95 && tickAnim < 120) {
            xx = 24 + (((tickAnim - 95) / 25) * (0-(24)));
            yy = 0 + (((tickAnim - 95) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 95) / 25) * (0-(0)));
        }
        else if (tickAnim >= 120 && tickAnim < 180) {
            xx = 0 + (((tickAnim - 120) / 60) * (-1.98562-(0)));
            yy = 0 + (((tickAnim - 120) / 60) * (14.52331-(0)));
            zz = 0 + (((tickAnim - 120) / 60) * (6.30348-(0)));
        }
        else if (tickAnim >= 180 && tickAnim < 220) {
            xx = -1.98562 + (((tickAnim - 180) / 40) * (-1.98562-(-1.98562)));
            yy = 14.52331 + (((tickAnim - 180) / 40) * (14.52331-(14.52331)));
            zz = 6.30348 + (((tickAnim - 180) / 40) * (6.30348-(6.30348)));
        }
        else if (tickAnim >= 220 && tickAnim < 243) {
            xx = -1.98562 + (((tickAnim - 220) / 23) * (-20.59209-(-1.98562)));
            yy = 14.52331 + (((tickAnim - 220) / 23) * (7.98782-(14.52331)));
            zz = 6.30348 + (((tickAnim - 220) / 23) * (3.46691-(6.30348)));
        }
        else if (tickAnim >= 243 && tickAnim < 270) {
            xx = -20.59209 + (((tickAnim - 243) / 27) * (0-(-20.59209)));
            yy = 7.98782 + (((tickAnim - 243) / 27) * (0-(7.98782)));
            zz = 3.46691 + (((tickAnim - 243) / 27) * (0-(3.46691)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg1, rightLeg1.rotateAngleX + (float) Math.toRadians(xx), rightLeg1.rotateAngleY + (float) Math.toRadians(yy), rightLeg1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 60 && tickAnim < 95) {
            xx = 0 + (((tickAnim - 60) / 35) * (9.5-(0)));
            yy = 0 + (((tickAnim - 60) / 35) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 35) * (0-(0)));
        }
        else if (tickAnim >= 95 && tickAnim < 104) {
            xx = 9.5 + (((tickAnim - 95) / 9) * (26.27-(9.5)));
            yy = 0 + (((tickAnim - 95) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 95) / 9) * (0-(0)));
        }
        else if (tickAnim >= 104 && tickAnim < 120) {
            xx = 26.27 + (((tickAnim - 104) / 16) * (0-(26.27)));
            yy = 0 + (((tickAnim - 104) / 16) * (0-(0)));
            zz = 0 + (((tickAnim - 104) / 16) * (0-(0)));
        }
        else if (tickAnim >= 120 && tickAnim < 180) {
            xx = 0 + (((tickAnim - 120) / 60) * (-12.5-(0)));
            yy = 0 + (((tickAnim - 120) / 60) * (0-(0)));
            zz = 0 + (((tickAnim - 120) / 60) * (0-(0)));
        }
        else if (tickAnim >= 180 && tickAnim < 220) {
            xx = -12.5 + (((tickAnim - 180) / 40) * (-12.5-(-12.5)));
            yy = 0 + (((tickAnim - 180) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 180) / 40) * (0-(0)));
        }
        else if (tickAnim >= 220 && tickAnim < 243) {
            xx = -12.5 + (((tickAnim - 220) / 23) * (45.13-(-12.5)));
            yy = 0 + (((tickAnim - 220) / 23) * (0-(0)));
            zz = 0 + (((tickAnim - 220) / 23) * (0-(0)));
        }
        else if (tickAnim >= 243 && tickAnim < 270) {
            xx = 45.13 + (((tickAnim - 243) / 27) * (0-(45.13)));
            yy = 0 + (((tickAnim - 243) / 27) * (0-(0)));
            zz = 0 + (((tickAnim - 243) / 27) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg2, rightLeg2.rotateAngleX + (float) Math.toRadians(xx), rightLeg2.rotateAngleY + (float) Math.toRadians(yy), rightLeg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 60 && tickAnim < 95) {
            xx = 0 + (((tickAnim - 60) / 35) * (7-(0)));
            yy = 0 + (((tickAnim - 60) / 35) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 35) * (0-(0)));
        }
        else if (tickAnim >= 95 && tickAnim < 108) {
            xx = 7 + (((tickAnim - 95) / 13) * (-42.48-(7)));
            yy = 0 + (((tickAnim - 95) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 95) / 13) * (0-(0)));
        }
        else if (tickAnim >= 108 && tickAnim < 120) {
            xx = -42.48 + (((tickAnim - 108) / 12) * (0-(-42.48)));
            yy = 0 + (((tickAnim - 108) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 108) / 12) * (0-(0)));
        }
        else if (tickAnim >= 120 && tickAnim < 143) {
            xx = 0 + (((tickAnim - 120) / 23) * (-36.47248-(0)));
            yy = 0 + (((tickAnim - 120) / 23) * (-0.69366-(0)));
            zz = 0 + (((tickAnim - 120) / 23) * (-2.27167-(0)));
        }
        else if (tickAnim >= 143 && tickAnim < 180) {
            xx = -36.47248 + (((tickAnim - 143) / 37) * (25.55504-(-36.47248)));
            yy = -0.69366 + (((tickAnim - 143) / 37) * (-1.38731-(-0.69366)));
            zz = -2.27167 + (((tickAnim - 143) / 37) * (-4.54334-(-2.27167)));
        }
        else if (tickAnim >= 180 && tickAnim < 220) {
            xx = 25.55504 + (((tickAnim - 180) / 40) * (25.55504-(25.55504)));
            yy = -1.38731 + (((tickAnim - 180) / 40) * (-1.38731-(-1.38731)));
            zz = -4.54334 + (((tickAnim - 180) / 40) * (-4.54334-(-4.54334)));
        }
        else if (tickAnim >= 220 && tickAnim < 243) {
            xx = 25.55504 + (((tickAnim - 220) / 23) * (-37.94473-(25.55504)));
            yy = -1.38731 + (((tickAnim - 220) / 23) * (-0.76302-(-1.38731)));
            zz = -4.54334 + (((tickAnim - 220) / 23) * (-2.49883-(-4.54334)));
        }
        else if (tickAnim >= 243 && tickAnim < 270) {
            xx = -37.94473 + (((tickAnim - 243) / 27) * (0-(-37.94473)));
            yy = -0.76302 + (((tickAnim - 243) / 27) * (0-(-0.76302)));
            zz = -2.49883 + (((tickAnim - 243) / 27) * (0-(-2.49883)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg3, rightLeg3.rotateAngleX + (float) Math.toRadians(xx), rightLeg3.rotateAngleY + (float) Math.toRadians(yy), rightLeg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 95 && tickAnim < 108) {
            xx = 0 + (((tickAnim - 95) / 13) * (0-(0)));
            yy = 0 + (((tickAnim - 95) / 13) * (1.725-(0)));
            zz = 0 + (((tickAnim - 95) / 13) * (0-(0)));
        }
        else if (tickAnim >= 108 && tickAnim < 120) {
            xx = 0 + (((tickAnim - 108) / 12) * (0-(0)));
            yy = 1.725 + (((tickAnim - 108) / 12) * (0-(1.725)));
            zz = 0 + (((tickAnim - 108) / 12) * (0-(0)));
        }
        else if (tickAnim >= 120 && tickAnim < 143) {
            xx = 0 + (((tickAnim - 120) / 23) * (0-(0)));
            yy = 0 + (((tickAnim - 120) / 23) * (1.8-(0)));
            zz = 0 + (((tickAnim - 120) / 23) * (0-(0)));
        }
        else if (tickAnim >= 143 && tickAnim < 180) {
            xx = 0 + (((tickAnim - 143) / 37) * (0-(0)));
            yy = 1.8 + (((tickAnim - 143) / 37) * (-0.525-(1.8)));
            zz = 0 + (((tickAnim - 143) / 37) * (0-(0)));
        }
        else if (tickAnim >= 180 && tickAnim < 220) {
            xx = 0 + (((tickAnim - 180) / 40) * (0-(0)));
            yy = -0.525 + (((tickAnim - 180) / 40) * (-0.525-(-0.525)));
            zz = 0 + (((tickAnim - 180) / 40) * (0-(0)));
        }
        else if (tickAnim >= 220 && tickAnim < 243) {
            xx = 0 + (((tickAnim - 220) / 23) * (0-(0)));
            yy = -0.525 + (((tickAnim - 220) / 23) * (1.785-(-0.525)));
            zz = 0 + (((tickAnim - 220) / 23) * (0-(0)));
        }
        else if (tickAnim >= 243 && tickAnim < 270) {
            xx = 0 + (((tickAnim - 243) / 27) * (0-(0)));
            yy = 1.785 + (((tickAnim - 243) / 27) * (0-(1.785)));
            zz = 0 + (((tickAnim - 243) / 27) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightLeg3.rotationPointX = this.rightLeg3.rotationPointX + (float)(xx);
        this.rightLeg3.rotationPointY = this.rightLeg3.rotationPointY - (float)(yy);
        this.rightLeg3.rotationPointZ = this.rightLeg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 60 && tickAnim < 95) {
            xx = 0 + (((tickAnim - 60) / 35) * (48.5-(0)));
            yy = 0 + (((tickAnim - 60) / 35) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 35) * (0-(0)));
        }
        else if (tickAnim >= 95 && tickAnim < 108) {
            xx = 48.5 + (((tickAnim - 95) / 13) * (69.63-(48.5)));
            yy = 0 + (((tickAnim - 95) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 95) / 13) * (0-(0)));
        }
        else if (tickAnim >= 108 && tickAnim < 120) {
            xx = 69.63 + (((tickAnim - 108) / 12) * (0-(69.63)));
            yy = 0 + (((tickAnim - 108) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 108) / 12) * (0-(0)));
        }
        else if (tickAnim >= 120 && tickAnim < 143) {
            xx = 0 + (((tickAnim - 120) / 23) * (76-(0)));
            yy = 0 + (((tickAnim - 120) / 23) * (0-(0)));
            zz = 0 + (((tickAnim - 120) / 23) * (0-(0)));
        }
        else if (tickAnim >= 143 && tickAnim < 180) {
            xx = 76 + (((tickAnim - 143) / 37) * (0-(76)));
            yy = 0 + (((tickAnim - 143) / 37) * (0-(0)));
            zz = 0 + (((tickAnim - 143) / 37) * (0-(0)));
        }
        else if (tickAnim >= 180 && tickAnim < 220) {
            xx = 0 + (((tickAnim - 180) / 40) * (0-(0)));
            yy = 0 + (((tickAnim - 180) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 180) / 40) * (0-(0)));
        }
        else if (tickAnim >= 220 && tickAnim < 243) {
            xx = 0 + (((tickAnim - 220) / 23) * (76.5-(0)));
            yy = 0 + (((tickAnim - 220) / 23) * (0-(0)));
            zz = 0 + (((tickAnim - 220) / 23) * (0-(0)));
        }
        else if (tickAnim >= 243 && tickAnim < 270) {
            xx = 76.5 + (((tickAnim - 243) / 27) * (0-(76.5)));
            yy = 0 + (((tickAnim - 243) / 27) * (0-(0)));
            zz = 0 + (((tickAnim - 243) / 27) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightFoot, rightFoot.rotateAngleX + (float) Math.toRadians(xx), rightFoot.rotateAngleY + (float) Math.toRadians(yy), rightFoot.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 60 && tickAnim < 95) {
            xx = 0 + (((tickAnim - 60) / 35) * (0-(0)));
            yy = 0 + (((tickAnim - 60) / 35) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 35) * (0-(0)));
        }
        else if (tickAnim >= 95 && tickAnim < 108) {
            xx = 0 + (((tickAnim - 95) / 13) * (0-(0)));
            yy = 0 + (((tickAnim - 95) / 13) * (1.15-(0)));
            zz = 0 + (((tickAnim - 95) / 13) * (-0.55-(0)));
        }
        else if (tickAnim >= 108 && tickAnim < 120) {
            xx = 0 + (((tickAnim - 108) / 12) * (0-(0)));
            yy = 1.15 + (((tickAnim - 108) / 12) * (0-(1.15)));
            zz = -0.55 + (((tickAnim - 108) / 12) * (0-(-0.55)));
        }
        else if (tickAnim >= 120 && tickAnim < 143) {
            xx = 0 + (((tickAnim - 120) / 23) * (0-(0)));
            yy = 0 + (((tickAnim - 120) / 23) * (0-(0)));
            zz = 0 + (((tickAnim - 120) / 23) * (-0.65-(0)));
        }
        else if (tickAnim >= 143 && tickAnim < 180) {
            xx = 0 + (((tickAnim - 143) / 37) * (0-(0)));
            yy = 0 + (((tickAnim - 143) / 37) * (0-(0)));
            zz = -0.65 + (((tickAnim - 143) / 37) * (0-(-0.65)));
        }
        else if (tickAnim >= 180 && tickAnim < 270) {
            xx = 0 + (((tickAnim - 180) / 90) * (0-(0)));
            yy = 0 + (((tickAnim - 180) / 90) * (0-(0)));
            zz = 0 + (((tickAnim - 180) / 90) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightFoot.rotationPointX = this.rightFoot.rotationPointX + (float)(xx);
        this.rightFoot.rotationPointY = this.rightFoot.rotationPointY - (float)(yy);
        this.rightFoot.rotationPointZ = this.rightFoot.rotationPointZ + (float)(zz);




        if (tickAnim >= 60 && tickAnim < 70) {
            xx = 0 + (((tickAnim - 60) / 10) * (-22.93-(0)));
            yy = 0 + (((tickAnim - 60) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 10) * (0-(0)));
        }
        else if (tickAnim >= 70 && tickAnim < 83) {
            xx = -22.93 + (((tickAnim - 70) / 13) * (-38.37-(-22.93)));
            yy = 0 + (((tickAnim - 70) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 70) / 13) * (0-(0)));
        }
        else if (tickAnim >= 83 && tickAnim < 95) {
            xx = -38.37 + (((tickAnim - 83) / 12) * (-28-(-38.37)));
            yy = 0 + (((tickAnim - 83) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 83) / 12) * (0-(0)));
        }
        else if (tickAnim >= 95 && tickAnim < 108) {
            xx = -28 + (((tickAnim - 95) / 13) * (0-(-28)));
            yy = 0 + (((tickAnim - 95) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 95) / 13) * (0-(0)));
        }
        else if (tickAnim >= 108 && tickAnim < 120) {
            xx = 0 + (((tickAnim - 108) / 12) * (0-(0)));
            yy = 0 + (((tickAnim - 108) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 108) / 12) * (0-(0)));
        }
        else if (tickAnim >= 120 && tickAnim < 143) {
            xx = 0 + (((tickAnim - 120) / 23) * (15.5-(0)));
            yy = 0 + (((tickAnim - 120) / 23) * (0-(0)));
            zz = 0 + (((tickAnim - 120) / 23) * (0-(0)));
        }
        else if (tickAnim >= 143 && tickAnim < 180) {
            xx = 15.5 + (((tickAnim - 143) / 37) * (0-(15.5)));
            yy = 0 + (((tickAnim - 143) / 37) * (0-(0)));
            zz = 0 + (((tickAnim - 143) / 37) * (0-(0)));
        }
        else if (tickAnim >= 180 && tickAnim < 220) {
            xx = 0 + (((tickAnim - 180) / 40) * (0-(0)));
            yy = 0 + (((tickAnim - 180) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 180) / 40) * (0-(0)));
        }
        else if (tickAnim >= 220 && tickAnim < 243) {
            xx = 0 + (((tickAnim - 220) / 23) * (21.75-(0)));
            yy = 0 + (((tickAnim - 220) / 23) * (0-(0)));
            zz = 0 + (((tickAnim - 220) / 23) * (0-(0)));
        }
        else if (tickAnim >= 243 && tickAnim < 270) {
            xx = 21.75 + (((tickAnim - 243) / 27) * (0-(21.75)));
            yy = 0 + (((tickAnim - 243) / 27) * (0-(0)));
            zz = 0 + (((tickAnim - 243) / 27) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightToes, rightToes.rotateAngleX + (float) Math.toRadians(xx), rightToes.rotateAngleY + (float) Math.toRadians(yy), rightToes.rotateAngleZ + (float) Math.toRadians(zz));

    }
    public void animWalking(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraSpinosaurus entity = (EntityPrehistoricFloraSpinosaurus) entitylivingbaseIn;
        int animCycle = 60;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;

        if (tickAnim >= 0 && tickAnim < 33) {
            xx = -18.87833 + (((tickAnim - 0) / 33) * (-15.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+13))*50-(-18.87833)));
            yy = -4.91352 + (((tickAnim - 0) / 33) * (0-(-4.91352)));
            zz = 2.99028 + (((tickAnim - 0) / 33) * (0-(2.99028)));
        }
        else if (tickAnim >= 33 && tickAnim < 60) {
            xx = -15.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+13))*50 + (((tickAnim - 33) / 27) * (-18.87833-(-15.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+13))*50)));
            yy = 0 + (((tickAnim - 33) / 27) * (-4.91352-(0)));
            zz = 0 + (((tickAnim - 33) / 27) * (2.99028-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg1, leftLeg1.rotateAngleX + (float) Math.toRadians(xx), leftLeg1.rotateAngleY + (float) Math.toRadians(yy), leftLeg1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 33) {
            xx = -1.75 + (((tickAnim - 0) / 33) * (3.25-(-1.75)));
            yy = 0 + (((tickAnim - 0) / 33) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 33) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 41) {
            xx = 3.25 + (((tickAnim - 33) / 8) * (114.905+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+130))*120-(3.25)));
            yy = 0 + (((tickAnim - 33) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 8) * (0-(0)));
        }
        else if (tickAnim >= 41 && tickAnim < 60) {
            xx = 114.905+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+130))*120 + (((tickAnim - 41) / 19) * (-1.75-(114.905+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+130))*120)));
            yy = 0 + (((tickAnim - 41) / 19) * (0-(0)));
            zz = 0 + (((tickAnim - 41) / 19) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg2, leftLeg2.rotateAngleX + (float) Math.toRadians(xx), leftLeg2.rotateAngleY + (float) Math.toRadians(yy), leftLeg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220/0.5))*0.2 + (((tickAnim - 0) / 2) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220/0.5))*0.2)));
            zz = 0 + (((tickAnim - 0) / 2) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 58) {
            xx = 0 + (((tickAnim - 2) / 56) * (0-(0)));
            yy = 0 + (((tickAnim - 2) / 56) * (0-(0)));
            zz = 0 + (((tickAnim - 2) / 56) * (0-(0)));
        }
        else if (tickAnim >= 58 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 58) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 58) / 2) * (-0.125+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220/0.5))*0.2-(0)));
            zz = 0 + (((tickAnim - 58) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftLeg2.rotationPointX = this.leftLeg2.rotationPointX + (float)(xx);
        this.leftLeg2.rotationPointY = this.leftLeg2.rotationPointY - (float)(yy);
        this.leftLeg2.rotationPointZ = this.leftLeg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 19.25 + (((tickAnim - 0) / 3) * (19.78-(19.25)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 33) {
            xx = 19.78 + (((tickAnim - 3) / 30) * (0-(19.78)));
            yy = 0 + (((tickAnim - 3) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 30) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 48) {
            xx = 0 + (((tickAnim - 33) / 15) * (-43.42-(0)));
            yy = 0 + (((tickAnim - 33) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 15) * (0-(0)));
        }
        else if (tickAnim >= 48 && tickAnim < 53) {
            xx = -43.42 + (((tickAnim - 48) / 5) * (-43.42-(-43.42)));
            yy = 0 + (((tickAnim - 48) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 48) / 5) * (0-(0)));
        }
        else if (tickAnim >= 53 && tickAnim < 60) {
            xx = -43.42 + (((tickAnim - 53) / 7) * (19.25-(-43.42)));
            yy = 0 + (((tickAnim - 53) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 53) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg3, leftLeg3.rotateAngleX + (float) Math.toRadians(xx), leftLeg3.rotateAngleY + (float) Math.toRadians(yy), leftLeg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            yy = -1.05+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220/0.5))*-0.1 + (((tickAnim - 0) / 2) * (-1.175-(-1.05+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220/0.5))*-0.1)));
            zz = 0 + (((tickAnim - 0) / 2) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 2) / 31) * (0-(0)));
            yy = -1.175 + (((tickAnim - 2) / 31) * (0-(-1.175)));
            zz = 0 + (((tickAnim - 2) / 31) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 48) {
            xx = 0 + (((tickAnim - 33) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 33) / 15) * (1.74-(0)));
            zz = 0 + (((tickAnim - 33) / 15) * (0-(0)));
        }
        else if (tickAnim >= 48 && tickAnim < 58) {
            xx = 0 + (((tickAnim - 48) / 10) * (0-(0)));
            yy = 1.74 + (((tickAnim - 48) / 10) * (-0.6-(1.74)));
            zz = 0 + (((tickAnim - 48) / 10) * (0-(0)));
        }
        else if (tickAnim >= 58 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 58) / 2) * (0-(0)));
            yy = -0.6 + (((tickAnim - 58) / 2) * (-1.375+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220/0.5))*0.4-(-0.6)));
            zz = 0 + (((tickAnim - 58) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftLeg3.rotationPointX = this.leftLeg3.rotationPointX + (float)(xx);
        this.leftLeg3.rotationPointY = this.leftLeg3.rotationPointY - (float)(yy);
        this.leftLeg3.rotationPointZ = this.leftLeg3.rotationPointZ + (float)(zz);



        this.setRotateAngle(hips, hips.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*120/0.5+45))*-1), hips.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*120+30))*0.8), hips.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*120+30))*0.8));
        this.hips.rotationPointX = this.hips.rotationPointX + (float)(0);
        this.hips.rotationPointY = this.hips.rotationPointY - (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*120/0.5+160))*-0.35);
        this.hips.rotationPointZ = this.hips.rotationPointZ + (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*120/0.5+170))*-0.59);


        this.setRotateAngle(tail1, tail1.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*120/0.5+190))*-1.5), tail1.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*120))*0.8), tail1.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*120+30))*0.8));


        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*120/0.5-50))*-1), tail2.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*120-50))*1), tail2.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*120+30))*0.8));


        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*120/0.5-100))*-1), tail3.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*120-100))*2), tail3.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*120+30))*0.8));


        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*120/0.5-150))*-0.5), tail4.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*120-150))*3), tail4.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*120+30))*0.8));


        this.setRotateAngle(tail5, tail5.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*120/0.5-200))*-0.5), tail5.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*120-200))*4), tail5.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*120+30))*0.8));


        this.setRotateAngle(tail6, tail6.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*120/0.5-250))*-1), tail6.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*120-250))*5), tail6.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*120+30))*0.8));


        this.setRotateAngle(tail7, tail7.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*120/0.5-300))*-1), tail7.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*120-300))*6), tail7.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*120+60))*-1));


        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*120/0.5-150))*-1), body.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*120+30))*-0.8), body.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*120))*-2));


        this.setRotateAngle(sailMiddle, sailMiddle.rotateAngleX + (float) Math.toRadians(0), sailMiddle.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*120-100))*0.2), sailMiddle.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*120))*2));


        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*120/0.5+150))*-1), chest.rotateAngleY + (float) Math.toRadians(0), chest.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(sailFront, sailFront.rotateAngleX + (float) Math.toRadians(-1.5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*120/0.5+150))*1.5), sailFront.rotateAngleY + (float) Math.toRadians(0), sailFront.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*120))*2));


        this.setRotateAngle(leftArm1, leftArm1.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*120/0.5-200))*2), leftArm1.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*120-150))*0.8), leftArm1.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*120+30))*0.8));


        this.setRotateAngle(leftArm2, leftArm2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*120/0.5-350))*-2), leftArm2.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*120-150))*-0.8), leftArm2.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*120+30))*0.8));


        this.setRotateAngle(neck1, neck1.rotateAngleX + (float) Math.toRadians(-3.75+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*120/0.5+190))*2), neck1.rotateAngleY + (float) Math.toRadians(0), neck1.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*120+200))*-1));
        this.neck1.rotationPointX = this.neck1.rotationPointX + (float)(0);
        this.neck1.rotationPointY = this.neck1.rotationPointY - (float)(0);
        this.neck1.rotationPointZ = this.neck1.rotationPointZ + (float)(0.45);


        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*120/0.5+200))*-2), neck2.rotateAngleY + (float) Math.toRadians(0), neck2.rotateAngleZ + (float) Math.toRadians(0));
        this.neck2.rotationPointX = this.neck2.rotationPointX + (float)(0);
        this.neck2.rotationPointY = this.neck2.rotationPointY - (float)(0);
        this.neck2.rotationPointZ = this.neck2.rotationPointZ + (float)(0.275);


        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*120/0.5+250))*-2), neck3.rotateAngleY + (float) Math.toRadians(0), neck3.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(neck4, neck4.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*120/0.5+250))*1), neck4.rotateAngleY + (float) Math.toRadians(0), neck4.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(throat1, throat1.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*120/0.5+550))*-2), throat1.rotateAngleY + (float) Math.toRadians(0), throat1.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*120/0.5+550))*2), head.rotateAngleY + (float) Math.toRadians(0), head.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(spinofaarus, spinofaarus.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*120/0.5-50))*-0.5), spinofaarus.rotateAngleY + (float) Math.toRadians(0), spinofaarus.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(sailEnd, sailEnd.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*120/0.5+45))*1), sailEnd.rotateAngleY + (float) Math.toRadians(0), sailEnd.rotateAngleZ + (float) Math.toRadians(0));
        this.sailEnd.rotationPointX = this.sailEnd.rotationPointX + (float)(0);
        this.sailEnd.rotationPointY = this.sailEnd.rotationPointY - (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*120/0.5+70))*0.15);
        this.sailEnd.rotationPointZ = this.sailEnd.rotationPointZ + (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*120/0.5+50))*-0.15);



        if (tickAnim >= 0 && tickAnim < 30) {
            xx = -17.75+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-50))*-70 + (((tickAnim - 0) / 30) * (51.2717+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+13))*-70-(-17.75+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-50))*-70)));
            yy = 0 + (((tickAnim - 0) / 30) * (4.91352-(0)));
            zz = 0 + (((tickAnim - 0) / 30) * (-2.99028-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 60) {
            xx = 51.2717+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+13))*-70 + (((tickAnim - 30) / 30) * (55.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+105))*20-(51.2717+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+13))*-70)));
            yy = 4.91352 + (((tickAnim - 30) / 30) * (0-(4.91352)));
            zz = -2.99028 + (((tickAnim - 30) / 30) * (0-(-2.99028)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg1, rightLeg1.rotateAngleX + (float) Math.toRadians(xx), rightLeg1.rotateAngleY + (float) Math.toRadians(yy), rightLeg1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 3.25 + (((tickAnim - 0) / 8) * (-52.245+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+80))*80-(3.25)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 30) {
            xx = -52.245+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+80))*80 + (((tickAnim - 8) / 22) * (-1.75-(-52.245+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+80))*80)));
            yy = 0 + (((tickAnim - 8) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 22) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 60) {
            xx = -1.75 + (((tickAnim - 30) / 30) * (1.975+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+100))*-1-(-1.75)));
            yy = 0 + (((tickAnim - 30) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 30) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg2, rightLeg2.rotateAngleX + (float) Math.toRadians(xx), rightLeg2.rotateAngleY + (float) Math.toRadians(yy), rightLeg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 0) / 28) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 28) * (-0.725-(0)));
            zz = 0 + (((tickAnim - 0) / 28) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 28) / 2) * (0-(0)));
            yy = -0.725 + (((tickAnim - 28) / 2) * (-0.525+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220/0.5))*0.1-(-0.725)));
            zz = 0 + (((tickAnim - 28) / 2) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 32) {
            xx = 0 + (((tickAnim - 30) / 2) * (0-(0)));
            yy = -0.525+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220/0.5))*0.1 + (((tickAnim - 30) / 2) * (0-(-0.525+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220/0.5))*0.1)));
            zz = 0 + (((tickAnim - 30) / 2) * (0-(0)));
        }
        else if (tickAnim >= 32 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 32) / 28) * (0-(0)));
            yy = 0 + (((tickAnim - 32) / 28) * (0-(0)));
            zz = 0 + (((tickAnim - 32) / 28) * (0-(0)));
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
            xx = 0 + (((tickAnim - 0) / 18) * (-43.42-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 22) {
            xx = -43.42 + (((tickAnim - 18) / 4) * (-43.42-(-43.42)));
            yy = 0 + (((tickAnim - 18) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 4) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 30) {
            xx = -43.42 + (((tickAnim - 22) / 8) * (30.25-(-43.42)));
            yy = 0 + (((tickAnim - 22) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 22) / 8) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 60) {
            xx = 30.25 + (((tickAnim - 30) / 30) * (0-(30.25)));
            yy = 0 + (((tickAnim - 30) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 30) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg3, rightLeg3.rotateAngleX + (float) Math.toRadians(xx), rightLeg3.rotateAngleY + (float) Math.toRadians(yy), rightLeg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (1.95-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 18) / 10) * (0-(0)));
            yy = 1.95 + (((tickAnim - 18) / 10) * (-0.975-(1.95)));
            zz = 0 + (((tickAnim - 18) / 10) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 28) / 2) * (0-(0)));
            yy = -0.975 + (((tickAnim - 28) / 2) * (-0.625+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220/0.5))*-0.1-(-0.975)));
            zz = 0 + (((tickAnim - 28) / 2) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 32) {
            xx = 0 + (((tickAnim - 30) / 2) * (0-(0)));
            yy = -0.625+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220/0.5))*-0.1 + (((tickAnim - 30) / 2) * (-0.85-(-0.625+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220/0.5))*-0.1)));
            zz = 0 + (((tickAnim - 30) / 2) * (0-(0)));
        }
        else if (tickAnim >= 32 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 32) / 28) * (0-(0)));
            yy = -0.85 + (((tickAnim - 32) / 28) * (0-(-0.85)));
            zz = 0 + (((tickAnim - 32) / 28) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightLeg3.rotationPointX = this.rightLeg3.rotationPointX + (float)(xx);
        this.rightLeg3.rotationPointY = this.rightLeg3.rotationPointY - (float)(yy);
        this.rightLeg3.rotationPointZ = this.rightLeg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 22) {
            xx = 56.5 + (((tickAnim - 0) / 22) * (74.72-(56.5)));
            yy = 0 + (((tickAnim - 0) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 22) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 30) {
            xx = 74.72 + (((tickAnim - 22) / 8) * (-9-(74.72)));
            yy = 0 + (((tickAnim - 22) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 22) / 8) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 43) {
            xx = -9 + (((tickAnim - 30) / 13) * (-29.5-(-9)));
            yy = 0 + (((tickAnim - 30) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 13) * (0-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 51) {
            xx = -29.5 + (((tickAnim - 43) / 8) * (58.35-(-29.5)));
            yy = 0 + (((tickAnim - 43) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 43) / 8) * (0-(0)));
        }
        else if (tickAnim >= 51 && tickAnim < 60) {
            xx = 58.35 + (((tickAnim - 51) / 9) * (56.5-(58.35)));
            yy = 0 + (((tickAnim - 51) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 51) / 9) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightFoot, rightFoot.rotateAngleX + (float) Math.toRadians(xx), rightFoot.rotateAngleY + (float) Math.toRadians(yy), rightFoot.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 0) / 14) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 14) * (1.6-(0)));
            zz = 0 + (((tickAnim - 0) / 14) * (-0.35-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 14) / 16) * (0-(0)));
            yy = 1.6 + (((tickAnim - 14) / 16) * (0.325-(1.6)));
            zz = -0.35 + (((tickAnim - 14) / 16) * (0-(-0.35)));
        }
        else if (tickAnim >= 30 && tickAnim < 37) {
            xx = 0 + (((tickAnim - 30) / 7) * (0-(0)));
            yy = 0.325 + (((tickAnim - 30) / 7) * (0.675-(0.325)));
            zz = 0 + (((tickAnim - 30) / 7) * (0-(0)));
        }
        else if (tickAnim >= 37 && tickAnim < 43) {
            xx = 0 + (((tickAnim - 37) / 6) * (0-(0)));
            yy = 0.675 + (((tickAnim - 37) / 6) * (-0.725-(0.675)));
            zz = 0 + (((tickAnim - 37) / 6) * (0-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 51) {
            xx = 0 + (((tickAnim - 43) / 8) * (0-(0)));
            yy = -0.725 + (((tickAnim - 43) / 8) * (-1.675-(-0.725)));
            zz = 0 + (((tickAnim - 43) / 8) * (-0.925-(0)));
        }
        else if (tickAnim >= 51 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 51) / 9) * (0-(0)));
            yy = -1.675 + (((tickAnim - 51) / 9) * (0-(-1.675)));
            zz = -0.925 + (((tickAnim - 51) / 9) * (0-(-0.925)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightFoot.rotationPointX = this.rightFoot.rotationPointX + (float)(xx);
        this.rightFoot.rotationPointY = this.rightFoot.rotationPointY - (float)(yy);
        this.rightFoot.rotationPointZ = this.rightFoot.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 14) {
            xx = -3.5 + (((tickAnim - 0) / 14) * (20.04-(-3.5)));
            yy = 0 + (((tickAnim - 0) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 14) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 18) {
            xx = 20.04 + (((tickAnim - 14) / 4) * (22-(20.04)));
            yy = 0 + (((tickAnim - 14) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 4) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 22) {
            xx = 22 + (((tickAnim - 18) / 4) * (22-(22)));
            yy = 0 + (((tickAnim - 18) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 4) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 30) {
            xx = 22 + (((tickAnim - 22) / 8) * (0-(22)));
            yy = 0 + (((tickAnim - 22) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 22) / 8) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 43) {
            xx = 0 + (((tickAnim - 30) / 13) * (0-(0)));
            yy = 0 + (((tickAnim - 30) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 13) * (0-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 51) {
            xx = 0 + (((tickAnim - 43) / 8) * (-93.87-(0)));
            yy = 0 + (((tickAnim - 43) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 43) / 8) * (0-(0)));
        }
        else if (tickAnim >= 51 && tickAnim < 60) {
            xx = -93.87 + (((tickAnim - 51) / 9) * (-3.5-(-93.87)));
            yy = 0 + (((tickAnim - 51) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 51) / 9) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightToes, rightToes.rotateAngleX + (float) Math.toRadians(xx), rightToes.rotateAngleY + (float) Math.toRadians(yy), rightToes.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 30) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 43) {
            xx = 0 + (((tickAnim - 30) / 13) * (0-(0)));
            yy = 0 + (((tickAnim - 30) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 13) * (0-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 47) {
            xx = 0 + (((tickAnim - 43) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 43) / 4) * (0.1-(0)));
            zz = 0 + (((tickAnim - 43) / 4) * (0.6-(0)));
        }
        else if (tickAnim >= 47 && tickAnim < 51) {
            xx = 0 + (((tickAnim - 47) / 4) * (0-(0)));
            yy = 0.1 + (((tickAnim - 47) / 4) * (-0.2-(0.1)));
            zz = 0.6 + (((tickAnim - 47) / 4) * (-0.775-(0.6)));
        }
        else if (tickAnim >= 51 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 51) / 9) * (0-(0)));
            yy = -0.2 + (((tickAnim - 51) / 9) * (0-(-0.2)));
            zz = -0.775 + (((tickAnim - 51) / 9) * (0-(-0.775)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightToes.rotationPointX = this.rightToes.rotationPointX + (float)(xx);
        this.rightToes.rotationPointY = this.rightToes.rotationPointY - (float)(yy);
        this.rightToes.rotationPointZ = this.rightToes.rotationPointZ + (float)(zz);



        this.setRotateAngle(rightArm1, rightArm1.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*120/0.5-200))*2), rightArm1.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*120-150))*0.8), rightArm1.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*120+30))*0.8));


        this.setRotateAngle(rightArm2, rightArm2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*120/0.5-350))*-2), rightArm2.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*120-150))*-0.8), rightArm2.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*120+30))*0.8));

    }
    public void animRunning(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraSpinosaurus entity = (EntityPrehistoricFloraSpinosaurus) entitylivingbaseIn;
        int animCycle = 40;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;

        if (tickAnim >= 0 && tickAnim < 22) {
            xx = -18.87833 + (((tickAnim - 0) / 22) * (-15.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+13))*50-(-18.87833)));
            yy = -4.91352 + (((tickAnim - 0) / 22) * (0-(-4.91352)));
            zz = 2.99028 + (((tickAnim - 0) / 22) * (0-(2.99028)));
        }
        else if (tickAnim >= 22 && tickAnim < 40) {
            xx = -15.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+13))*50 + (((tickAnim - 22) / 18) * (-18.87833-(-15.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+13))*50)));
            yy = 0 + (((tickAnim - 22) / 18) * (-4.91352-(0)));
            zz = 0 + (((tickAnim - 22) / 18) * (2.99028-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg1, leftLeg1.rotateAngleX + (float) Math.toRadians(xx), leftLeg1.rotateAngleY + (float) Math.toRadians(yy), leftLeg1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 22) {
            xx = -1.75 + (((tickAnim - 0) / 22) * (3.25-(-1.75)));
            yy = 0 + (((tickAnim - 0) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 22) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 28) {
            xx = 3.25 + (((tickAnim - 22) / 6) * (69.155+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+130))*120-(3.25)));
            yy = 0 + (((tickAnim - 22) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 22) / 6) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 40) {
            xx = 69.155+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+130))*120 + (((tickAnim - 28) / 12) * (-1.75-(69.155+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+130))*120)));
            yy = 0 + (((tickAnim - 28) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg2, leftLeg2.rotateAngleX + (float) Math.toRadians(xx), leftLeg2.rotateAngleY + (float) Math.toRadians(yy), leftLeg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220/0.5))*0.1 + (((tickAnim - 0) / 2) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220/0.5))*0.1)));
            zz = 0 + (((tickAnim - 0) / 2) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 39) {
            xx = 0 + (((tickAnim - 2) / 37) * (0-(0)));
            yy = 0 + (((tickAnim - 2) / 37) * (0-(0)));
            zz = 0 + (((tickAnim - 2) / 37) * (0-(0)));
        }
        else if (tickAnim >= 39 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 39) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 39) / 1) * (-0.075+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220/0.5))*0.1-(0)));
            zz = 0 + (((tickAnim - 39) / 1) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftLeg2.rotationPointX = this.leftLeg2.rotationPointX + (float)(xx);
        this.leftLeg2.rotationPointY = this.leftLeg2.rotationPointY - (float)(yy);
        this.leftLeg2.rotationPointZ = this.leftLeg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 19.25 + (((tickAnim - 0) / 3) * (19.78-(19.25)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 22) {
            xx = 19.78 + (((tickAnim - 3) / 19) * (0-(19.78)));
            yy = 0 + (((tickAnim - 3) / 19) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 19) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 22) / 11) * (-43.42-(0)));
            yy = 0 + (((tickAnim - 22) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 22) / 11) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 35) {
            xx = -43.42 + (((tickAnim - 33) / 2) * (-43.42-(-43.42)));
            yy = 0 + (((tickAnim - 33) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 2) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 40) {
            xx = -43.42 + (((tickAnim - 35) / 5) * (19.25-(-43.42)));
            yy = 0 + (((tickAnim - 35) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg3, leftLeg3.rotateAngleX + (float) Math.toRadians(xx), leftLeg3.rotateAngleY + (float) Math.toRadians(yy), leftLeg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            yy = -1.025+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220/0.5))*-0.1 + (((tickAnim - 0) / 2) * (-0.825-(-1.025+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220/0.5))*-0.1)));
            zz = 0 + (((tickAnim - 0) / 2) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 22) {
            xx = 0 + (((tickAnim - 2) / 20) * (0-(0)));
            yy = -0.825 + (((tickAnim - 2) / 20) * (0-(-0.825)));
            zz = 0 + (((tickAnim - 2) / 20) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 22) / 11) * (0-(0)));
            yy = 0 + (((tickAnim - 22) / 11) * (2.06-(0)));
            zz = 0 + (((tickAnim - 22) / 11) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 33) / 2) * (0-(0)));
            yy = 2.06 + (((tickAnim - 33) / 2) * (1.835-(2.06)));
            zz = 0 + (((tickAnim - 33) / 2) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 35) / 5) * (0-(0)));
            yy = 1.835 + (((tickAnim - 35) / 5) * (-1.025+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220/0.5))*-0.1-(1.835)));
            zz = 0 + (((tickAnim - 35) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftLeg3.rotationPointX = this.leftLeg3.rotationPointX + (float)(xx);
        this.leftLeg3.rotationPointY = this.leftLeg3.rotationPointY - (float)(yy);
        this.leftLeg3.rotationPointZ = this.leftLeg3.rotationPointZ + (float)(zz);



        this.setRotateAngle(hips, hips.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.5+45))*-1.2), hips.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180+30))*1), hips.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180+30))*2));
        this.hips.rotationPointX = this.hips.rotationPointX + (float)(0);
        this.hips.rotationPointY = this.hips.rotationPointY - (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.5+120))*0.5);
        this.hips.rotationPointZ = this.hips.rotationPointZ + (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.5+170))*-0.8);


        this.setRotateAngle(tail1, tail1.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.5))*1.5), tail1.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180))*0.8), tail1.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180+30))*0.8));


        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.5-50))*-1.5), tail2.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-50))*1), tail2.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180+30))*0.8));


        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.5-100))*-1.8), tail3.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-100))*2), tail3.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180+30))*0.8));


        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.5-150))*-1.5), tail4.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-150))*3), tail4.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180+30))*0.8));


        this.setRotateAngle(tail5, tail5.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.5-200))*-1.5), tail5.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-200))*4), tail5.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180+30))*0.8));


        this.setRotateAngle(tail6, tail6.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.5-250))*-2), tail6.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-250))*5), tail6.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180+30))*0.8));


        this.setRotateAngle(tail7, tail7.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.5-300))*-2), tail7.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-300))*6), tail7.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180+60))*-1));


        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(0), body.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180+30))*-1), body.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180))*-2));


        this.setRotateAngle(sailMiddle, sailMiddle.rotateAngleX + (float) Math.toRadians(0), sailMiddle.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-100))*0.2), sailMiddle.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180))*2.2));


        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.5+150))*1.5), chest.rotateAngleY + (float) Math.toRadians(0), chest.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(sailFront, sailFront.rotateAngleX + (float) Math.toRadians(-1.5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.5+150))*-2.0), sailFront.rotateAngleY + (float) Math.toRadians(0), sailFront.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180+5))*1.8));


        this.setRotateAngle(leftArm1, leftArm1.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.5-200))*-3), leftArm1.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-150))*0.8), leftArm1.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180+30))*0.8));


        this.setRotateAngle(leftArm2, leftArm2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.5-350))*-2), leftArm2.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-150))*-0.8), leftArm2.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180+30))*0.8));


        this.setRotateAngle(neck1, neck1.rotateAngleX + (float) Math.toRadians(7.25+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.5+190))*-2.5), neck1.rotateAngleY + (float) Math.toRadians(0), neck1.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180+200))*-1));


        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.5+200))*2.5), neck2.rotateAngleY + (float) Math.toRadians(0), neck2.rotateAngleZ + (float) Math.toRadians(0));
        this.neck2.rotationPointX = this.neck2.rotationPointX + (float)(0);
        this.neck2.rotationPointY = this.neck2.rotationPointY - (float)(0);
        this.neck2.rotationPointZ = this.neck2.rotationPointZ + (float)(0.275);


        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(-13.75+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.5+250))*-2), neck3.rotateAngleY + (float) Math.toRadians(0), neck3.rotateAngleZ + (float) Math.toRadians(0));
        this.neck3.rotationPointX = this.neck3.rotationPointX + (float)(0);
        this.neck3.rotationPointY = this.neck3.rotationPointY - (float)(-0.175);
        this.neck3.rotationPointZ = this.neck3.rotationPointZ + (float)(-1.275);


        this.setRotateAngle(neck4, neck4.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.5+350))*-1), neck4.rotateAngleY + (float) Math.toRadians(0), neck4.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(throat1, throat1.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.5+550))*2), throat1.rotateAngleY + (float) Math.toRadians(0), throat1.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.5+550))*-2), head.rotateAngleY + (float) Math.toRadians(0), head.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(spinofaarus, spinofaarus.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.5-50))*-0.5), spinofaarus.rotateAngleY + (float) Math.toRadians(0), spinofaarus.rotateAngleZ + (float) Math.toRadians(0));



        if (tickAnim >= 0 && tickAnim < 20) {
            xx = -17.75+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-50))*-70 + (((tickAnim - 0) / 20) * (51.2717+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+13))*-70-(-17.75+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-50))*-70)));
            yy = 0 + (((tickAnim - 0) / 20) * (4.91352-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (-2.99028-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 40) {
            xx = 51.2717+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+13))*-70 + (((tickAnim - 20) / 20) * (44.05+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+105))*20-(51.2717+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+13))*-70)));
            yy = 4.91352 + (((tickAnim - 20) / 20) * (0-(4.91352)));
            zz = -2.99028 + (((tickAnim - 20) / 20) * (0-(-2.99028)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg1, rightLeg1.rotateAngleX + (float) Math.toRadians(xx), rightLeg1.rotateAngleY + (float) Math.toRadians(yy), rightLeg1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 3.25 + (((tickAnim - 0) / 6) * (-52.245+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+80))*80-(3.25)));
            yy = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 20) {
            xx = -52.245+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+80))*80 + (((tickAnim - 6) / 14) * (-11.5-(-52.245+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+80))*80)));
            yy = 0 + (((tickAnim - 6) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 14) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 40) {
            xx = -11.5 + (((tickAnim - 20) / 20) * (1.975+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+100))*-1-(-11.5)));
            yy = 0 + (((tickAnim - 20) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg2, rightLeg2.rotateAngleX + (float) Math.toRadians(xx), rightLeg2.rotateAngleY + (float) Math.toRadians(yy), rightLeg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 0) / 19) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 19) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 19) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 19) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 19) / 1) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220/0.5))*0.1-(0)));
            zz = 0 + (((tickAnim - 19) / 1) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 22) {
            xx = 0 + (((tickAnim - 20) / 2) * (0-(0)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220/0.5))*0.1 + (((tickAnim - 20) / 2) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220/0.5))*0.1)));
            zz = 0 + (((tickAnim - 20) / 2) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 22) / 18) * (0-(0)));
            yy = 0 + (((tickAnim - 22) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 22) / 18) * (0-(0)));
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
            xx = 0 + (((tickAnim - 0) / 13) * (-43.42-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = -43.42 + (((tickAnim - 13) / 2) * (-43.42-(-43.42)));
            yy = 0 + (((tickAnim - 13) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 2) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = -43.42 + (((tickAnim - 15) / 5) * (14.5-(-43.42)));
            yy = 0 + (((tickAnim - 15) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 5) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 40) {
            xx = 14.5 + (((tickAnim - 20) / 20) * (0-(14.5)));
            yy = 0 + (((tickAnim - 20) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg3, rightLeg3.rotateAngleX + (float) Math.toRadians(xx), rightLeg3.rotateAngleY + (float) Math.toRadians(yy), rightLeg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (1.8-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 13) / 2) * (0-(0)));
            yy = 1.8 + (((tickAnim - 13) / 2) * (1.8-(1.8)));
            zz = 0 + (((tickAnim - 13) / 2) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 15) / 4) * (0-(0)));
            yy = 1.8 + (((tickAnim - 15) / 4) * (0-(1.8)));
            zz = 0 + (((tickAnim - 15) / 4) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 19) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 19) / 1) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220/0.5))*-0.1-(0)));
            zz = 0 + (((tickAnim - 19) / 1) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 22) {
            xx = 0 + (((tickAnim - 20) / 2) * (0-(0)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220/0.5))*-0.1 + (((tickAnim - 20) / 2) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220/0.5))*-0.1)));
            zz = 0 + (((tickAnim - 20) / 2) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 22) / 18) * (0-(0)));
            yy = 0 + (((tickAnim - 22) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 22) / 18) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightLeg3.rotationPointX = this.rightLeg3.rotationPointX + (float)(xx);
        this.rightLeg3.rotationPointY = this.rightLeg3.rotationPointY - (float)(yy);
        this.rightLeg3.rotationPointZ = this.rightLeg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 56.5 + (((tickAnim - 0) / 15) * (52.47-(56.5)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = 52.47 + (((tickAnim - 15) / 5) * (8.18173-(52.47)));
            yy = 0 + (((tickAnim - 15) / 5) * (-2.12354-(0)));
            zz = 0 + (((tickAnim - 15) / 5) * (3.6823-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 25) {
            xx = 8.18173 + (((tickAnim - 20) / 5) * (-2.46286-(8.18173)));
            yy = -2.12354 + (((tickAnim - 20) / 5) * (-1.51011-(-2.12354)));
            zz = 3.6823 + (((tickAnim - 20) / 5) * (4.76706-(3.6823)));
        }
        else if (tickAnim >= 25 && tickAnim < 28) {
            xx = -2.46286 + (((tickAnim - 25) / 3) * (-10.71892-(-2.46286)));
            yy = -1.51011 + (((tickAnim - 25) / 3) * (-1.51011-(-1.51011)));
            zz = 4.76706 + (((tickAnim - 25) / 3) * (4.76706-(4.76706)));
        }
        else if (tickAnim >= 28 && tickAnim < 34) {
            xx = -10.71892 + (((tickAnim - 28) / 6) * (68.85-(-10.71892)));
            yy = -1.51011 + (((tickAnim - 28) / 6) * (0-(-1.51011)));
            zz = 4.76706 + (((tickAnim - 28) / 6) * (0-(4.76706)));
        }
        else if (tickAnim >= 34 && tickAnim < 40) {
            xx = 68.85 + (((tickAnim - 34) / 6) * (56.5-(68.85)));
            yy = 0 + (((tickAnim - 34) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 34) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightFoot, rightFoot.rotateAngleX + (float) Math.toRadians(xx), rightFoot.rotateAngleY + (float) Math.toRadians(yy), rightFoot.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (1.6-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (-0.35-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            yy = 1.6 + (((tickAnim - 10) / 10) * (-0.05-(1.6)));
            zz = -0.35 + (((tickAnim - 10) / 10) * (0-(-0.35)));
        }
        else if (tickAnim >= 20 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 20) / 5) * (0-(0)));
            yy = -0.05 + (((tickAnim - 20) / 5) * (1.25-(-0.05)));
            zz = 0 + (((tickAnim - 20) / 5) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 25) / 3) * (0-(0)));
            yy = 1.25 + (((tickAnim - 25) / 3) * (1.375-(1.25)));
            zz = 0 + (((tickAnim - 25) / 3) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 34) {
            xx = 0 + (((tickAnim - 28) / 6) * (0-(0)));
            yy = 1.375 + (((tickAnim - 28) / 6) * (0-(1.375)));
            zz = 0 + (((tickAnim - 28) / 6) * (0-(0)));
        }
        else if (tickAnim >= 34 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 34) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 34) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 34) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightFoot.rotationPointX = this.rightFoot.rotationPointX + (float)(xx);
        this.rightFoot.rotationPointY = this.rightFoot.rotationPointY - (float)(yy);
        this.rightFoot.rotationPointZ = this.rightFoot.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = -3.5 + (((tickAnim - 0) / 10) * (20.04-(-3.5)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 20.04 + (((tickAnim - 10) / 3) * (22-(20.04)));
            yy = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 3) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = 22 + (((tickAnim - 13) / 2) * (22-(22)));
            yy = 0 + (((tickAnim - 13) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 2) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = 22 + (((tickAnim - 15) / 5) * (0-(22)));
            yy = 0 + (((tickAnim - 15) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 5) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 20) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 20) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 8) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 34) {
            xx = 0 + (((tickAnim - 28) / 6) * (-93.87-(0)));
            yy = 0 + (((tickAnim - 28) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 6) * (0-(0)));
        }
        else if (tickAnim >= 34 && tickAnim < 40) {
            xx = -93.87 + (((tickAnim - 34) / 6) * (-3.5-(-93.87)));
            yy = 0 + (((tickAnim - 34) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 34) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightToes, rightToes.rotateAngleX + (float) Math.toRadians(xx), rightToes.rotateAngleY + (float) Math.toRadians(yy), rightToes.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 20) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 20) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 8) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 32) {
            xx = 0 + (((tickAnim - 28) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 28) / 4) * (0.1-(0)));
            zz = 0 + (((tickAnim - 28) / 4) * (0.6-(0)));
        }
        else if (tickAnim >= 32 && tickAnim < 34) {
            xx = 0 + (((tickAnim - 32) / 2) * (0-(0)));
            yy = 0.1 + (((tickAnim - 32) / 2) * (-0.2-(0.1)));
            zz = 0.6 + (((tickAnim - 32) / 2) * (-0.775-(0.6)));
        }
        else if (tickAnim >= 34 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 34) / 6) * (0-(0)));
            yy = -0.2 + (((tickAnim - 34) / 6) * (0-(-0.2)));
            zz = -0.775 + (((tickAnim - 34) / 6) * (0-(-0.775)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightToes.rotationPointX = this.rightToes.rotationPointX + (float)(xx);
        this.rightToes.rotationPointY = this.rightToes.rotationPointY - (float)(yy);
        this.rightToes.rotationPointZ = this.rightToes.rotationPointZ + (float)(zz);



        this.setRotateAngle(rightArm1, rightArm1.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.5-200))*-3), rightArm1.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-150))*0.8), rightArm1.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180+30))*0.8));


        this.setRotateAngle(rightArm2, rightArm2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.5-350))*-2), rightArm2.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-150))*-0.8), rightArm2.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180+30))*0.8));

    }

    @Override
    public void setLivingAnimations(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        super.setLivingAnimations(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
        this.resetToDefaultPose();
        EntityPrehistoricFloraSpinosaurus ee = (EntityPrehistoricFloraSpinosaurus) entitylivingbaseIn;

//        if (!ee.isInWater()) {
            if (ee.getIsMoving()) {
                if (ee.getIsFast()) { //Running
                    animRunning(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);

                } else { //Walking
                    animWalking(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
                }
            }
        if (ee.getAnimation() == ee.EAT_ANIMATION) {
            animEat(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.ATTACK_ANIMATION) {
            animAttack(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.MAKE_NEST_ANIMATION) {
            animNest(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.LAY_ANIMATION) {
            animLay(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.ROAR_ANIMATION) { //Ambient
            animRoar(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.STAND_ANIMATION) { //Ambient
            animRelax(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.GRAPPLE_ANIMATION) { //Ambient
            animDisplay(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.SECOND_GRAPPLE_ANIMATION) { //Ambient
            animRelax(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.DRINK_ANIMATION) {
            animFishing(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.NOISE_ANIMATION) {
            animNoise(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        
    }

    public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        EntityPrehistoricFloraSpinosaurus e = (EntityPrehistoricFloraSpinosaurus) entity;
        animator.update(entity);

        animator.setAnimation(e.HURT_ANIMATION);
        animator.startKeyframe(10);
        animator.rotate(this.neck1, (float) Math.toRadians(-5),0,0);
        animator.rotate(this.neck2, (float) Math.toRadians(-5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.neck3, (float) Math.toRadians(-5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.neck4, (float) Math.toRadians(-5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.jaw, (float) Math.toRadians(35), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(10);
        animator.resetKeyframe(10);
    }
}
