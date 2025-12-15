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
    private final AdvancedModelRenderer leftArm3;
    private final AdvancedModelRenderer leftThumb;
    private final AdvancedModelRenderer cube_r40;
    private final AdvancedModelRenderer leftFingers;
    private final AdvancedModelRenderer cube_r41;
    private final AdvancedModelRenderer cube_r42;
    private final AdvancedModelRenderer rightArm1;
    private final AdvancedModelRenderer rightArm2;
    private final AdvancedModelRenderer rightArm3;
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
        this.hips.setRotationPoint(0.02F, -11.7747F, -4.1962F);
        this.setRotateAngle(hips, -0.1745F, 0.0F, 0.0F);
        this.hips.cubeList.add(new ModelBox(hips, 52, 78, -5.02F, -2.0206F, -3.8285F, 10, 17, 18, 0.0F, false));

        this.sailEnd = new AdvancedModelRenderer(this);
        this.sailEnd.setRotationPoint(-0.02F, -2.0206F, -1.8285F);
        this.hips.addChild(sailEnd);


        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(-4.0F, -12.6825F, 14.3329F);
        this.sailEnd.addChild(cube_r1);
        this.setRotateAngle(cube_r1, -1.8326F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 116, 225, 3.5F, -1.0424F, 0.0205F, 1, 1, 2, 0.0F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(-4.0F, -17.6065F, 13.4647F);
        this.sailEnd.addChild(cube_r2);
        this.setRotateAngle(cube_r2, -1.8326F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 16, 225, 3.5F, -1.0424F, 0.0205F, 1, 1, 2, 0.0F, false));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(-4.0F, -28.2507F, -5.9283F);
        this.sailEnd.addChild(cube_r3);
        this.setRotateAngle(cube_r3, -1.3963F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 108, 100, 3.0F, -17.2924F, 10.8705F, 2, 16, 17, 0.01F, false));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(-4.0F, -27.9126F, 7.798F);
        this.sailEnd.addChild(cube_r4);
        this.setRotateAngle(cube_r4, -1.2654F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 184, 225, 3.5F, -0.9782F, 0.0101F, 1, 1, 3, 0.0F, false));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(-4.0F, -22.9977F, 11.2395F);
        this.sailEnd.addChild(cube_r5);
        this.setRotateAngle(cube_r5, -1.2654F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 92, 225, 3.5F, -0.9782F, 0.0101F, 1, 1, 3, 0.0F, false));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(-4.0F, -28.2507F, -5.9283F);
        this.sailEnd.addChild(cube_r6);
        this.setRotateAngle(cube_r6, -0.9599F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 68, 184, 3.0F, -11.0782F, 6.1601F, 2, 14, 11, 0.0F, false));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(-4.0F, -28.2507F, -5.9283F);
        this.sailEnd.addChild(cube_r7);
        this.setRotateAngle(cube_r7, -0.0873F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 84, 225, 3.5F, -3.152F, 9.196F, 1, 1, 3, 0.0F, false));
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 210, 26, 3.0F, -2.402F, 5.446F, 2, 7, 7, -0.02F, false));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(-4.0F, -28.1507F, -5.9283F);
        this.sailEnd.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.3491F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 222, 120, 3.5F, -0.5754F, 3.7009F, 1, 1, 3, 0.0F, false));

        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(-4.0F, -28.2507F, -5.9283F);
        this.sailEnd.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.3491F, 0.0F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 214, 83, 3.0F, 0.1246F, -0.0491F, 2, 8, 6, -0.01F, false));

        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(0.0F, 0.0F, 16.0F);
        this.sailEnd.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 0.1309F, 0.0F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 122, 201, -1.0F, -30.0F, -18.0F, 2, 22, 3, 0.03F, false));

        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(0.0F, -6.25F, 1.5F);
        this.sailEnd.addChild(cube_r11);
        this.setRotateAngle(cube_r11, -0.1309F, 0.0F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 108, 74, -2.0F, 0.0F, -4.0F, 4, 7, 19, 0.0F, false));

        this.leftLeg1 = new AdvancedModelRenderer(this);
        this.leftLeg1.setRotationPoint(3.98F, 3.9794F, 5.1715F);
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
        this.rightLeg1.setRotationPoint(-4.02F, 3.9794F, 5.1715F);
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
        this.tail1.setRotationPoint(-0.02F, 1.9794F, 13.1715F);
        this.hips.addChild(tail1);
        this.setRotateAngle(tail1, 0.0436F, 0.0F, 0.0F);
        this.tail1.cubeList.add(new ModelBox(tail1, 86, 0, -3.0F, -3.5F, -1.0F, 6, 12, 16, 0.0F, false));
        this.tail1.cubeList.add(new ModelBox(tail1, 134, 155, -1.5F, -8.0F, -0.95F, 3, 5, 16, 0.0F, false));
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
        this.body.setRotationPoint(-0.02F, 2.9794F, -2.3285F);
        this.hips.addChild(body);
        this.setRotateAngle(body, 0.1745F, 0.0F, 0.0F);
        this.body.cubeList.add(new ModelBox(body, 0, 0, -7.0F, -5.5F, -27.5F, 14, 17, 29, 0.0F, false));

        this.cube_r22 = new AdvancedModelRenderer(this);
        this.cube_r22.setRotationPoint(0.0F, 12.5F, -27.5F);
        this.body.addChild(cube_r22);
        this.setRotateAngle(cube_r22, -0.0873F, 0.0F, 0.0F);
        this.cube_r22.cubeList.add(new ModelBox(cube_r22, 0, 46, -6.0F, -4.0F, 0.0F, 12, 4, 28, 0.0F, false));

        this.sailMiddle = new AdvancedModelRenderer(this);
        this.sailMiddle.setRotationPoint(0.0F, -5.9701F, 0.6693F);
        this.body.addChild(sailMiddle);
        this.sailMiddle.cubeList.add(new ModelBox(sailMiddle, 50, 199, -1.074F, -26.1905F, -4.2113F, 2, 20, 5, 0.02F, false));
        this.sailMiddle.cubeList.add(new ModelBox(sailMiddle, 0, 78, -1.074F, -19.6905F, -28.2113F, 2, 16, 24, 0.01F, false));

        this.cube_r23 = new AdvancedModelRenderer(this);
        this.cube_r23.setRotationPoint(-4.074F, -19.4884F, -29.5906F);
        this.sailMiddle.addChild(cube_r23);
        this.setRotateAngle(cube_r23, 0.1745F, 0.0F, 0.0F);
        this.cube_r23.cubeList.add(new ModelBox(cube_r23, 38, 225, 3.5F, -3.9783F, 28.4929F, 1, 1, 3, 0.0F, false));
        this.cube_r23.cubeList.add(new ModelBox(cube_r23, 214, 120, 3.5F, -3.9783F, 22.4929F, 1, 1, 3, 0.0F, false));
        this.cube_r23.cubeList.add(new ModelBox(cube_r23, 206, 0, 3.0F, -3.0283F, 20.4929F, 2, 3, 10, -0.03F, false));

        this.cube_r24 = new AdvancedModelRenderer(this);
        this.cube_r24.setRotationPoint(-4.074F, -19.4884F, -29.5906F);
        this.sailMiddle.addChild(cube_r24);
        this.setRotateAngle(cube_r24, -0.1745F, 0.0F, 0.0F);
        this.cube_r24.cubeList.add(new ModelBox(cube_r24, 50, 224, 3.5F, -10.9067F, 14.1118F, 1, 1, 3, 0.0F, false));
        this.cube_r24.cubeList.add(new ModelBox(cube_r24, 146, 100, 3.0F, -9.9567F, 9.6118F, 2, 8, 16, -0.02F, false));

        this.cube_r25 = new AdvancedModelRenderer(this);
        this.cube_r25.setRotationPoint(-4.074F, -26.4243F, -19.1554F);
        this.sailMiddle.addChild(cube_r25);
        this.setRotateAngle(cube_r25, 0.2618F, 0.0F, 0.0F);
        this.cube_r25.cubeList.add(new ModelBox(cube_r25, 22, 195, 3.5F, -1.6567F, -1.5882F, 1, 1, 3, 0.0F, false));

        this.cube_r26 = new AdvancedModelRenderer(this);
        this.cube_r26.setRotationPoint(-4.074F, -25.1419F, -24.5985F);
        this.sailMiddle.addChild(cube_r26);
        this.setRotateAngle(cube_r26, 0.6545F, 0.0F, 0.0F);
        this.cube_r26.cubeList.add(new ModelBox(cube_r26, 182, 63, 3.5F, -1.0169F, -2.9976F, 1, 1, 3, 0.0F, false));

        this.cube_r27 = new AdvancedModelRenderer(this);
        this.cube_r27.setRotationPoint(-4.074F, -19.4884F, -29.5906F);
        this.sailMiddle.addChild(cube_r27);
        this.setRotateAngle(cube_r27, 0.3491F, 0.0F, 0.0F);
        this.cube_r27.cubeList.add(new ModelBox(cube_r27, 166, 206, 3.0F, -3.8169F, 5.3024F, 2, 9, 8, -0.01F, false));

        this.cube_r28 = new AdvancedModelRenderer(this);
        this.cube_r28.setRotationPoint(-4.074F, -20.9708F, -28.8942F);
        this.sailMiddle.addChild(cube_r28);
        this.setRotateAngle(cube_r28, 1.2217F, 0.0F, 0.0F);
        this.cube_r28.cubeList.add(new ModelBox(cube_r28, 174, 63, 3.5F, -0.9701F, -2.9772F, 1, 1, 3, 0.0F, false));

        this.cube_r29 = new AdvancedModelRenderer(this);
        this.cube_r29.setRotationPoint(-4.074F, -19.4884F, -29.5906F);
        this.sailMiddle.addChild(cube_r29);
        this.setRotateAngle(cube_r29, 0.9163F, 0.0F, 0.0F);
        this.cube_r29.cubeList.add(new ModelBox(cube_r29, 76, 139, 3.0F, -0.3701F, -0.4772F, 2, 9, 7, -0.02F, false));

        this.cube_r30 = new AdvancedModelRenderer(this);
        this.cube_r30.setRotationPoint(0.426F, -3.6905F, -28.2113F);
        this.sailMiddle.addChild(cube_r30);
        this.setRotateAngle(cube_r30, 0.2182F, 0.0F, 0.0F);
        this.cube_r30.cubeList.add(new ModelBox(cube_r30, 134, 43, -2.5F, 0.0F, 0.0F, 4, 8, 16, 0.0F, false));

        this.cube_r31 = new AdvancedModelRenderer(this);
        this.cube_r31.setRotationPoint(0.426F, -7.1535F, -12.5906F);
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
        this.sailFront.setRotationPoint(0.0F, -9.0F, -1.25F);
        this.chest.addChild(sailFront);
        this.sailFront.cubeList.add(new ModelBox(sailFront, 122, 28, -0.9565F, -16.0998F, -0.0993F, 2, 16, 2, 0.0F, false));
        this.sailFront.cubeList.add(new ModelBox(sailFront, 94, 113, -0.9565F, -10.0998F, -3.9993F, 2, 12, 4, 0.0F, false));

        this.cube_r33 = new AdvancedModelRenderer(this);
        this.cube_r33.setRotationPoint(0.0435F, -10.2477F, -5.3786F);
        this.sailFront.addChild(cube_r33);
        this.setRotateAngle(cube_r33, 0.829F, 0.0F, 0.0F);
        this.cube_r33.cubeList.add(new ModelBox(cube_r33, 94, 193, -1.0F, 1.4F, 1.0F, 2, 3, 5, -0.03F, false));
        this.cube_r33.cubeList.add(new ModelBox(cube_r33, 132, 212, -1.0F, 0.0F, 0.0F, 2, 2, 8, -0.02F, false));

        this.cube_r34 = new AdvancedModelRenderer(this);
        this.cube_r34.setRotationPoint(0.0435F, -13.1968F, -2.6762F);
        this.sailFront.addChild(cube_r34);
        this.setRotateAngle(cube_r34, 1.2654F, 0.0F, 0.0F);
        this.cube_r34.cubeList.add(new ModelBox(cube_r34, 42, 136, -0.5F, -0.95F, -2.0F, 1, 1, 2, 0.0F, false));

        this.cube_r35 = new AdvancedModelRenderer(this);
        this.cube_r35.setRotationPoint(0.0435F, -9.3238F, -5.7613F);
        this.sailFront.addChild(cube_r35);
        this.setRotateAngle(cube_r35, 1.6144F, 0.0F, 0.0F);
        this.cube_r35.cubeList.add(new ModelBox(cube_r35, 58, 224, -0.5F, -0.95F, -2.0F, 1, 1, 2, 0.0F, false));

        this.cube_r36 = new AdvancedModelRenderer(this);
        this.cube_r36.setRotationPoint(0.0435F, -4.7044F, -7.6747F);
        this.sailFront.addChild(cube_r36);
        this.setRotateAngle(cube_r36, 1.6144F, 0.0F, 0.0F);
        this.cube_r36.cubeList.add(new ModelBox(cube_r36, 16, 222, -0.5F, -0.95F, -2.0F, 1, 1, 2, 0.0F, false));

        this.cube_r37 = new AdvancedModelRenderer(this);
        this.cube_r37.setRotationPoint(0.0435F, -0.085F, -9.5881F);
        this.sailFront.addChild(cube_r37);
        this.setRotateAngle(cube_r37, 1.6144F, 0.0F, 0.0F);
        this.cube_r37.cubeList.add(new ModelBox(cube_r37, 36, 136, -0.5F, -0.95F, -2.0F, 1, 1, 2, 0.0F, false));

        this.cube_r38 = new AdvancedModelRenderer(this);
        this.cube_r38.setRotationPoint(0.0435F, -10.2477F, -5.3786F);
        this.sailFront.addChild(cube_r38);
        this.setRotateAngle(cube_r38, 1.1781F, 0.0F, 0.0F);
        this.cube_r38.cubeList.add(new ModelBox(cube_r38, 172, 124, -1.0F, 0.0F, -16.0F, 2, 6, 16, -0.01F, false));

        this.cube_r39 = new AdvancedModelRenderer(this);
        this.cube_r39.setRotationPoint(0.0435F, -0.2498F, 0.7007F);
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

        this.leftArm3 = new AdvancedModelRenderer(this);
        this.leftArm3.setRotationPoint(1.0F, 6.75F, 0.0F);
        this.leftArm2.addChild(leftArm3);
        this.setRotateAngle(leftArm3, 0.0873F, 0.0F, 0.0F);
        this.leftArm3.cubeList.add(new ModelBox(leftArm3, 75, 0, -2.0F, -0.25F, -2.0F, 2, 5, 4, 0.01F, false));

        this.leftThumb = new AdvancedModelRenderer(this);
        this.leftThumb.setRotationPoint(0.0F, 0.75F, -1.5F);
        this.leftArm3.addChild(leftThumb);
        this.setRotateAngle(leftThumb, -0.1745F, 0.0F, 0.2618F);
        this.leftThumb.cubeList.add(new ModelBox(leftThumb, 88, 0, -2.0F, 0.0F, -0.5F, 2, 6, 2, 0.01F, false));

        this.cube_r40 = new AdvancedModelRenderer(this);
        this.cube_r40.setRotationPoint(0.0F, 6.0F, 0.0F);
        this.leftThumb.addChild(cube_r40);
        this.setRotateAngle(cube_r40, 0.0F, 0.0F, 0.3054F);
        this.cube_r40.cubeList.add(new ModelBox(cube_r40, 77, 10, -3.0F, 0.0F, 0.0F, 3, 4, 1, 0.0F, false));

        this.leftFingers = new AdvancedModelRenderer(this);
        this.leftFingers.setRotationPoint(0.0F, 3.75F, 0.5F);
        this.leftArm3.addChild(leftFingers);


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

        this.rightArm3 = new AdvancedModelRenderer(this);
        this.rightArm3.setRotationPoint(-1.0F, 6.75F, 0.0F);
        this.rightArm2.addChild(rightArm3);
        this.setRotateAngle(rightArm3, 0.0873F, 0.0F, 0.0F);
        this.rightArm3.cubeList.add(new ModelBox(rightArm3, 75, 0, 0.0F, -0.25F, -2.0F, 2, 5, 4, 0.01F, true));

        this.rightThumb = new AdvancedModelRenderer(this);
        this.rightThumb.setRotationPoint(0.0F, 0.75F, -1.5F);
        this.rightArm3.addChild(rightThumb);
        this.setRotateAngle(rightThumb, -0.1745F, 0.0F, -0.2618F);
        this.rightThumb.cubeList.add(new ModelBox(rightThumb, 88, 0, 0.0F, 0.0F, -0.5F, 2, 6, 2, 0.01F, true));

        this.cube_r43 = new AdvancedModelRenderer(this);
        this.cube_r43.setRotationPoint(0.0F, 6.0F, 0.0F);
        this.rightThumb.addChild(cube_r43);
        this.setRotateAngle(cube_r43, 0.0F, 0.0F, -0.3054F);
        this.cube_r43.cubeList.add(new ModelBox(cube_r43, 77, 10, 0.0F, 0.0F, 0.0F, 3, 4, 1, 0.0F, true));

        this.rightFingers = new AdvancedModelRenderer(this);
        this.rightFingers.setRotationPoint(0.0F, 3.75F, 0.5F);
        this.rightArm3.addChild(rightFingers);


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
        this.cube_r70.setRotationPoint(0.5F, 7.4009F, -19.9517F);
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
        this.spinofaarus.setRotationPoint(0.0F, -0.1566F, -7.6877F);
        this.head.addChild(spinofaarus);


        this.cube_r83 = new AdvancedModelRenderer(this);
        this.cube_r83.setRotationPoint(-1.6441F, 14.3051F, -18.911F);
        this.spinofaarus.addChild(cube_r83);
        this.setRotateAngle(cube_r83, 1.6983F, -0.1063F, 0.6913F);
        this.cube_r83.cubeList.add(new ModelBox(cube_r83, 168, 176, 0.0F, 0.0F, -1.0F, 1, 3, 1, 0.0F, true));

        this.cube_r84 = new AdvancedModelRenderer(this);
        this.cube_r84.setRotationPoint(-0.6441F, 12.3326F, -19.2411F);
        this.spinofaarus.addChild(cube_r84);
        this.setRotateAngle(cube_r84, 1.7366F, 0.0F, 0.0F);
        this.cube_r84.cubeList.add(new ModelBox(cube_r84, 106, 125, -0.8F, 0.5F, -3.05F, 1, 2, 0, 0.0F, true));
        this.cube_r84.cubeList.add(new ModelBox(cube_r84, 106, 125, 0.8F, 0.5F, -3.05F, 1, 2, 0, 0.0F, false));
        this.cube_r84.cubeList.add(new ModelBox(cube_r84, 64, 222, -1.0F, 0.0F, -3.0F, 3, 3, 3, 0.01F, false));

        this.cube_r85 = new AdvancedModelRenderer(this);
        this.cube_r85.setRotationPoint(1.3559F, 14.3051F, -18.911F);
        this.spinofaarus.addChild(cube_r85);
        this.setRotateAngle(cube_r85, 1.6983F, 0.1063F, -0.6913F);
        this.cube_r85.cubeList.add(new ModelBox(cube_r85, 168, 176, -1.0F, 0.0F, -1.0F, 1, 3, 1, 0.0F, false));

        this.cube_r86 = new AdvancedModelRenderer(this);
        this.cube_r86.setRotationPoint(0.3559F, 7.4479F, -15.7568F);
        this.spinofaarus.addChild(cube_r86);
        this.setRotateAngle(cube_r86, 0.9512F, 0.0F, 0.0F);
        this.cube_r86.cubeList.add(new ModelBox(cube_r86, 84, 216, -2.0F, 0.0F, -6.0F, 3, 3, 6, 0.0F, false));

        this.cube_r87 = new AdvancedModelRenderer(this);
        this.cube_r87.setRotationPoint(0.3559F, 7.4479F, -15.7569F);
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
        AdvancedModelRenderer[] ArmL = {this.leftArm1, this.leftArm2, this.leftArm3};
        AdvancedModelRenderer[] ArmR = {this.rightArm1, this.rightArm2, this.rightArm3};

        EntitySpinosaurus.tailBuffer.applyChainSwingBuffer(Tail);

        if (EntitySpinosaurus.getAnimation() == EntitySpinosaurus.LAY_ANIMATION) {
            this.chainSwing(Neck, 0.5F, 0.10F, 0.5, f2, 0.8F);
            this.chainWave(Neck, 0.5F * 2, -0.02F, 0.5F, f2, 0.8F);
        }
        else {
            if (!EntitySpinosaurus.isReallyInWater() && EntitySpinosaurus.getAnimation() != EntitySpinosaurus.STAND_ANIMATION) {

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
            zz = 0.5 + (((tickAnim - 6) / 6) * (0.295-(0.5)));
        }
        else if (tickAnim >= 12 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 12) / 1) * (0-(0)));
            yy = 0.825 + (((tickAnim - 12) / 1) * (0.825-(0.825)));
            zz = 0.295 + (((tickAnim - 12) / 1) * (0.295-(0.295)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 13) / 2) * (0-(0)));
            yy = 0.825 + (((tickAnim - 13) / 2) * (0.825-(0.825)));
            zz = 0.295 + (((tickAnim - 13) / 2) * (0.295-(0.295)));
        }
        else if (tickAnim >= 15 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 15) / 3) * (0-(0)));
            yy = 0.825 + (((tickAnim - 15) / 3) * (0.05-(0.825)));
            zz = 0.295 + (((tickAnim - 15) / 3) * (0.15-(0.295)));
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
            xx = -11.5 + (((tickAnim - 6) / 9) * (-10.54936-(-11.5)));
            yy = 0 + (((tickAnim - 6) / 9) * (-1.52967-(0)));
            zz = 0 + (((tickAnim - 6) / 9) * (3.6964-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 23) {
            xx = -10.54936 + (((tickAnim - 15) / 8) * (0-(-10.54936)));
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
            yy = 0 + (((tickAnim - 0) / 15) * (0.05-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 15) / 8) * (0-(0)));
            yy = 0.05 + (((tickAnim - 15) / 8) * (0-(0.05)));
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
            xx = 0 + (((tickAnim - 0) / 6) * (19-(0)));
            yy = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 12) {
            xx = 19 + (((tickAnim - 6) / 6) * (22.74512-(19)));
            yy = 0 + (((tickAnim - 6) / 6) * (2.74243-(0)));
            zz = 0 + (((tickAnim - 6) / 6) * (-0.20395-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 15) {
            xx = 22.74512 + (((tickAnim - 12) / 3) * (18.95513-(22.74512)));
            yy = 2.74243 + (((tickAnim - 12) / 3) * (2.48246-(2.74243)));
            zz = -0.20395 + (((tickAnim - 12) / 3) * (-0.2957-(-0.20395)));
        }
        else if (tickAnim >= 15 && tickAnim < 23) {
            xx = 18.95513 + (((tickAnim - 15) / 8) * (0-(18.95513)));
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
            xx = 0 + (((tickAnim - 0) / 10) * (28-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 28 + (((tickAnim - 10) / 10) * (64-(28)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 64 + (((tickAnim - 20) / 10) * (64-(64)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = 64 + (((tickAnim - 30) / 10) * (5.75-(64)));
            yy = 0 + (((tickAnim - 30) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 10) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = 5.75 + (((tickAnim - 40) / 10) * (0-(5.75)));
            yy = 0 + (((tickAnim - 40) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftFoot, leftFoot.rotateAngleX + (float) Math.toRadians(xx), leftFoot.rotateAngleY + (float) Math.toRadians(yy), leftFoot.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (-3.025-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = -3.025 + (((tickAnim - 10) / 10) * (-1.275-(-3.025)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = -1.275 + (((tickAnim - 20) / 10) * (-1.275-(-1.275)));
        }
        else if (tickAnim >= 30 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 30) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 30) / 5) * (1.625-(0)));
            zz = -1.275 + (((tickAnim - 30) / 5) * (-0.94-(-1.275)));
        }
        else if (tickAnim >= 35 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 35) / 5) * (0-(0)));
            yy = 1.625 + (((tickAnim - 35) / 5) * (0.6-(1.625)));
            zz = -0.94 + (((tickAnim - 35) / 5) * (-0.6-(-0.94)));
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
        this.leftFoot.rotationPointX = this.leftFoot.rotationPointX + (float)(xx);
        this.leftFoot.rotationPointY = this.leftFoot.rotationPointY - (float)(yy);
        this.leftFoot.rotationPointZ = this.leftFoot.rotationPointZ + (float)(zz);




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
        this.setRotateAngle(leftToes, leftToes.rotateAngleX + (float) Math.toRadians(xx), leftToes.rotateAngleY + (float) Math.toRadians(yy), leftToes.rotateAngleZ + (float) Math.toRadians(zz));




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
        this.setRotateAngle(rightArm3, rightArm3.rotateAngleX + (float) Math.toRadians(xx), rightArm3.rotateAngleY + (float) Math.toRadians(yy), rightArm3.rotateAngleZ + (float) Math.toRadians(zz));




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




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (63.25-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 30) {
            xx = 63.25 + (((tickAnim - 15) / 15) * (71.38-(63.25)));
            yy = 0 + (((tickAnim - 15) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 15) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 38) {
            xx = 71.38 + (((tickAnim - 30) / 8) * (71.38-(71.38)));
            yy = 0 + (((tickAnim - 30) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 8) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 50) {
            xx = 71.38 + (((tickAnim - 38) / 12) * (0-(71.38)));
            yy = 0 + (((tickAnim - 38) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 38) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftFoot, leftFoot.rotateAngleX + (float) Math.toRadians(xx), leftFoot.rotateAngleY + (float) Math.toRadians(yy), leftFoot.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 15) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 15) / 15) * (2.35-(0)));
            zz = 0 + (((tickAnim - 15) / 15) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 38) {
            xx = 0 + (((tickAnim - 30) / 8) * (0-(0)));
            yy = 2.35 + (((tickAnim - 30) / 8) * (3.07-(2.35)));
            zz = 0 + (((tickAnim - 30) / 8) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 38) / 12) * (0-(0)));
            yy = 3.07 + (((tickAnim - 38) / 12) * (0-(3.07)));
            zz = 0 + (((tickAnim - 38) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftFoot.rotationPointX = this.leftFoot.rotationPointX + (float)(xx);
        this.leftFoot.rotationPointY = this.leftFoot.rotationPointY - (float)(yy);
        this.leftFoot.rotationPointZ = this.leftFoot.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 0) / 6) * (-32.87-(0)));
            yy = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 15) {
            xx = -32.87 + (((tickAnim - 6) / 9) * (-65.25-(-32.87)));
            yy = 0 + (((tickAnim - 6) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 9) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 18) {
            xx = -65.25 + (((tickAnim - 15) / 3) * (0-(-65.25)));
            yy = 0 + (((tickAnim - 15) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 3) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 18) / 12) * (19-(0)));
            yy = 0 + (((tickAnim - 18) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 12) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 38) {
            xx = 19 + (((tickAnim - 30) / 8) * (19-(19)));
            yy = 0 + (((tickAnim - 30) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 8) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 50) {
            xx = 19 + (((tickAnim - 38) / 12) * (0-(19)));
            yy = 0 + (((tickAnim - 38) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 38) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftToes, leftToes.rotateAngleX + (float) Math.toRadians(xx), leftToes.rotateAngleY + (float) Math.toRadians(yy), leftToes.rotateAngleZ + (float) Math.toRadians(zz));

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
            yy = 0 + (((tickAnim - 0) / 80) * (2.425-(0)));
            zz = 0 + (((tickAnim - 0) / 80) * (0-(0)));
        }
        else if (tickAnim >= 80 && tickAnim < 98) {
            xx = 0 + (((tickAnim - 80) / 18) * (0-(0)));
            yy = 2.425 + (((tickAnim - 80) / 18) * (1.65-(2.425)));
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
        this.setRotateAngle(leftFoot, leftFoot.rotateAngleX + (float) Math.toRadians(xx), leftFoot.rotateAngleY + (float) Math.toRadians(yy), leftFoot.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 30) * (2.675-(0)));
            zz = 0 + (((tickAnim - 0) / 30) * (-1.005-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 55) {
            xx = 0 + (((tickAnim - 30) / 25) * (0-(0)));
            yy = 2.675 + (((tickAnim - 30) / 25) * (2.125-(2.675)));
            zz = -1.005 + (((tickAnim - 30) / 25) * (-0.755-(-1.005)));
        }
        else if (tickAnim >= 55 && tickAnim < 80) {
            xx = 0 + (((tickAnim - 55) / 25) * (0-(0)));
            yy = 2.125 + (((tickAnim - 55) / 25) * (2.125-(2.125)));
            zz = -0.755 + (((tickAnim - 55) / 25) * (-0.355-(-0.755)));
        }
        else if (tickAnim >= 80 && tickAnim < 98) {
            xx = 0 + (((tickAnim - 80) / 18) * (0-(0)));
            yy = 2.125 + (((tickAnim - 80) / 18) * (0-(2.125)));
            zz = -0.355 + (((tickAnim - 80) / 18) * (-1.275-(-0.355)));
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
        this.leftFoot.rotationPointX = this.leftFoot.rotationPointX + (float)(xx);
        this.leftFoot.rotationPointY = this.leftFoot.rotationPointY - (float)(yy);
        this.leftFoot.rotationPointZ = this.leftFoot.rotationPointZ + (float)(zz);




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
        this.setRotateAngle(leftArm3, leftArm3.rotateAngleX + (float) Math.toRadians(xx), leftArm3.rotateAngleY + (float) Math.toRadians(yy), leftArm3.rotateAngleZ + (float) Math.toRadians(zz));




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
            yy = 0 + (((tickAnim - 0) / 80) * (2.85-(0)));
            zz = 0 + (((tickAnim - 0) / 80) * (0-(0)));
        }
        else if (tickAnim >= 80 && tickAnim < 98) {
            xx = 0 + (((tickAnim - 80) / 18) * (0-(0)));
            yy = 2.85 + (((tickAnim - 80) / 18) * (1.65-(2.85)));
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
            zz = -1.005 + (((tickAnim - 30) / 25) * (-0.28-(-1.005)));
        }
        else if (tickAnim >= 55 && tickAnim < 80) {
            xx = 0 + (((tickAnim - 55) / 25) * (0-(0)));
            yy = 2.125 + (((tickAnim - 55) / 25) * (2.125-(2.125)));
            zz = -0.28 + (((tickAnim - 55) / 25) * (0.07-(-0.28)));
        }
        else if (tickAnim >= 80 && tickAnim < 98) {
            xx = 0 + (((tickAnim - 80) / 18) * (0-(0)));
            yy = 2.125 + (((tickAnim - 80) / 18) * (0-(2.125)));
            zz = 0.07 + (((tickAnim - 80) / 18) * (-1.275-(0.07)));
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
        this.setRotateAngle(rightArm3, rightArm3.rotateAngleX + (float) Math.toRadians(xx), rightArm3.rotateAngleY + (float) Math.toRadians(yy), rightArm3.rotateAngleZ + (float) Math.toRadians(zz));

    }
    public void animFishing(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraSpinosaurus entity = (EntityPrehistoricFloraSpinosaurus) entitylivingbaseIn;
        int animCycle = 585;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 34) {
            xx = 0 + (((tickAnim - 0) / 34) * (2.47445-(0)));
            yy = 0 + (((tickAnim - 0) / 34) * (4.70927-(0)));
            zz = 0 + (((tickAnim - 0) / 34) * (-0.6214-(0)));
        }
        else if (tickAnim >= 34 && tickAnim < 455) {
            xx = 2.47445 + (((tickAnim - 34) / 421) * (2.47445-(2.47445)));
            yy = 4.70927 + (((tickAnim - 34) / 421) * (4.70927-(4.70927)));
            zz = -0.6214 + (((tickAnim - 34) / 421) * (-0.6214-(-0.6214)));
        }
        else if (tickAnim >= 455 && tickAnim < 462) {
            xx = 2.47445 + (((tickAnim - 455) / 7) * (5.97445-(2.47445)));
            yy = 4.70927 + (((tickAnim - 455) / 7) * (4.70927-(4.70927)));
            zz = -0.6214 + (((tickAnim - 455) / 7) * (-0.6214-(-0.6214)));
        }
        else if (tickAnim >= 462 && tickAnim < 470) {
            xx = 5.97445 + (((tickAnim - 462) / 8) * (2.47445-(5.97445)));
            yy = 4.70927 + (((tickAnim - 462) / 8) * (4.70927-(4.70927)));
            zz = -0.6214 + (((tickAnim - 462) / 8) * (-0.6214-(-0.6214)));
        }
        else if (tickAnim >= 470 && tickAnim < 485) {
            xx = 2.47445 + (((tickAnim - 470) / 15) * (6.9744-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*10-(2.47445)));
            yy = 4.70927 + (((tickAnim - 470) / 15) * (4.70927-(4.70927)));
            zz = -0.6214 + (((tickAnim - 470) / 15) * (-0.6214-(-0.6214)));
        }
        else if (tickAnim >= 485 && tickAnim < 493) {
            xx = 6.9744-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*10 + (((tickAnim - 485) / 8) * (2.47445-(6.9744-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*10)));
            yy = 4.70927 + (((tickAnim - 485) / 8) * (4.70927-(4.70927)));
            zz = -0.6214 + (((tickAnim - 485) / 8) * (-0.6214-(-0.6214)));
        }
        else if (tickAnim >= 493 && tickAnim < 571) {
            xx = 2.47445 + (((tickAnim - 493) / 78) * (0-(2.47445)));
            yy = 4.70927 + (((tickAnim - 493) / 78) * (0-(4.70927)));
            zz = -0.6214 + (((tickAnim - 493) / 78) * (0-(-0.6214)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(hips, hips.rotateAngleX + (float) Math.toRadians(xx), hips.rotateAngleY + (float) Math.toRadians(yy), hips.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 34) {
            xx = 0 + (((tickAnim - 0) / 34) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 34) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 34) * (7.925-(0)));
        }
        else if (tickAnim >= 34 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 34) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 34) / 6) * (0-(0)));
            zz = 7.925 + (((tickAnim - 34) / 6) * (7.78-(7.925)));
        }
        else if (tickAnim >= 40 && tickAnim < 493) {
            xx = 0 + (((tickAnim - 40) / 453) * (0-(0)));
            yy = 0 + (((tickAnim - 40) / 453) * (0-(0)));
            zz = 7.78 + (((tickAnim - 40) / 453) * (7.78-(7.78)));
        }
        else if (tickAnim >= 493 && tickAnim < 571) {
            xx = 0 + (((tickAnim - 493) / 78) * (0-(0)));
            yy = 0 + (((tickAnim - 493) / 78) * (0-(0)));
            zz = 7.78 + (((tickAnim - 493) / 78) * (0-(7.78)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.hips.rotationPointX = this.hips.rotationPointX + (float)(xx);
        this.hips.rotationPointY = this.hips.rotationPointY - (float)(yy);
        this.hips.rotationPointZ = this.hips.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 34) {
            xx = 0 + (((tickAnim - 0) / 34) * (-16.47087-(0)));
            yy = 0 + (((tickAnim - 0) / 34) * (-7.86769-(0)));
            zz = 0 + (((tickAnim - 0) / 34) * (1.79272-(0)));
        }
        else if (tickAnim >= 34 && tickAnim < 455) {
            xx = -16.47087 + (((tickAnim - 34) / 421) * (-16.47087-(-16.47087)));
            yy = -7.86769 + (((tickAnim - 34) / 421) * (-7.86769-(-7.86769)));
            zz = 1.79272 + (((tickAnim - 34) / 421) * (1.79272-(1.79272)));
        }
        else if (tickAnim >= 455 && tickAnim < 462) {
            xx = -16.47087 + (((tickAnim - 455) / 7) * (-18.97087-(-16.47087)));
            yy = -7.86769 + (((tickAnim - 455) / 7) * (-7.86769-(-7.86769)));
            zz = 1.79272 + (((tickAnim - 455) / 7) * (1.79272-(1.79272)));
        }
        else if (tickAnim >= 462 && tickAnim < 470) {
            xx = -18.97087 + (((tickAnim - 462) / 8) * (-16.47087-(-18.97087)));
            yy = -7.86769 + (((tickAnim - 462) / 8) * (-7.86769-(-7.86769)));
            zz = 1.79272 + (((tickAnim - 462) / 8) * (1.79272-(1.79272)));
        }
        else if (tickAnim >= 470 && tickAnim < 485) {
            xx = -16.47087 + (((tickAnim - 470) / 15) * (-18.1209-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-10-(-16.47087)));
            yy = -7.86769 + (((tickAnim - 470) / 15) * (-7.86769-(-7.86769)));
            zz = 1.79272 + (((tickAnim - 470) / 15) * (1.79272-(1.79272)));
        }
        else if (tickAnim >= 485 && tickAnim < 493) {
            xx = -18.1209-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-10 + (((tickAnim - 485) / 8) * (-16.47087-(-18.1209-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-10)));
            yy = -7.86769 + (((tickAnim - 485) / 8) * (-7.86769-(-7.86769)));
            zz = 1.79272 + (((tickAnim - 485) / 8) * (1.79272-(1.79272)));
        }
        else if (tickAnim >= 493 && tickAnim < 560) {
            xx = -16.47087 + (((tickAnim - 493) / 67) * (18.27913-(-16.47087)));
            yy = -7.86769 + (((tickAnim - 493) / 67) * (-7.86769-(-7.86769)));
            zz = 1.79272 + (((tickAnim - 493) / 67) * (1.79272-(1.79272)));
        }
        else if (tickAnim >= 560 && tickAnim < 573) {
            xx = 18.27913 + (((tickAnim - 560) / 13) * (-16.61043-(18.27913)));
            yy = -7.86769 + (((tickAnim - 560) / 13) * (-3.93384-(-7.86769)));
            zz = 1.79272 + (((tickAnim - 560) / 13) * (0.89636-(1.79272)));
        }
        else if (tickAnim >= 573 && tickAnim < 585) {
            xx = -16.61043 + (((tickAnim - 573) / 12) * (0-(-16.61043)));
            yy = -3.93384 + (((tickAnim - 573) / 12) * (0-(-3.93384)));
            zz = 0.89636 + (((tickAnim - 573) / 12) * (0-(0.89636)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg1, leftLeg1.rotateAngleX + (float) Math.toRadians(xx), leftLeg1.rotateAngleY + (float) Math.toRadians(yy), leftLeg1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 34) {
            xx = 0 + (((tickAnim - 0) / 34) * (-7.25-(0)));
            yy = 0 + (((tickAnim - 0) / 34) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 34) * (0-(0)));
        }
        else if (tickAnim >= 34 && tickAnim < 455) {
            xx = -7.25 + (((tickAnim - 34) / 421) * (-7.25-(-7.25)));
            yy = 0 + (((tickAnim - 34) / 421) * (0-(0)));
            zz = 0 + (((tickAnim - 34) / 421) * (0-(0)));
        }
        else if (tickAnim >= 455 && tickAnim < 470) {
            xx = -7.25 + (((tickAnim - 455) / 15) * (-7.25-(-7.25)));
            yy = 0 + (((tickAnim - 455) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 455) / 15) * (0-(0)));
        }
        else if (tickAnim >= 470 && tickAnim < 485) {
            xx = -7.25 + (((tickAnim - 470) / 15) * (-10.25-(-7.25)));
            yy = 0 + (((tickAnim - 470) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 470) / 15) * (0-(0)));
        }
        else if (tickAnim >= 485 && tickAnim < 493) {
            xx = -10.25 + (((tickAnim - 485) / 8) * (-7.25-(-10.25)));
            yy = 0 + (((tickAnim - 485) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 485) / 8) * (0-(0)));
        }
        else if (tickAnim >= 493 && tickAnim < 560) {
            xx = -7.25 + (((tickAnim - 493) / 67) * (-3.25-(-7.25)));
            yy = 0 + (((tickAnim - 493) / 67) * (0-(0)));
            zz = 0 + (((tickAnim - 493) / 67) * (0-(0)));
        }
        else if (tickAnim >= 560 && tickAnim < 573) {
            xx = -3.25 + (((tickAnim - 560) / 13) * (29.12-(-3.25)));
            yy = 0 + (((tickAnim - 560) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 560) / 13) * (0-(0)));
        }
        else if (tickAnim >= 573 && tickAnim < 585) {
            xx = 29.12 + (((tickAnim - 573) / 12) * (0-(29.12)));
            yy = 0 + (((tickAnim - 573) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 573) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg2, leftLeg2.rotateAngleX + (float) Math.toRadians(xx), leftLeg2.rotateAngleY + (float) Math.toRadians(yy), leftLeg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 34) {
            xx = 0 + (((tickAnim - 0) / 34) * (18.75-(0)));
            yy = 0 + (((tickAnim - 0) / 34) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 34) * (0-(0)));
        }
        else if (tickAnim >= 34 && tickAnim < 455) {
            xx = 18.75 + (((tickAnim - 34) / 421) * (18.75-(18.75)));
            yy = 0 + (((tickAnim - 34) / 421) * (0-(0)));
            zz = 0 + (((tickAnim - 34) / 421) * (0-(0)));
        }
        else if (tickAnim >= 455 && tickAnim < 462) {
            xx = 18.75 + (((tickAnim - 455) / 7) * (14.5-(18.75)));
            yy = 0 + (((tickAnim - 455) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 455) / 7) * (0-(0)));
        }
        else if (tickAnim >= 462 && tickAnim < 470) {
            xx = 14.5 + (((tickAnim - 462) / 8) * (18.75-(14.5)));
            yy = 0 + (((tickAnim - 462) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 462) / 8) * (0-(0)));
        }
        else if (tickAnim >= 470 && tickAnim < 485) {
            xx = 18.75 + (((tickAnim - 470) / 15) * (6.5-(18.75)));
            yy = 0 + (((tickAnim - 470) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 470) / 15) * (0-(0)));
        }
        else if (tickAnim >= 485 && tickAnim < 493) {
            xx = 6.5 + (((tickAnim - 485) / 8) * (18.75-(6.5)));
            yy = 0 + (((tickAnim - 485) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 485) / 8) * (0-(0)));
        }
        else if (tickAnim >= 493 && tickAnim < 560) {
            xx = 18.75 + (((tickAnim - 493) / 67) * (2.75-(18.75)));
            yy = 0 + (((tickAnim - 493) / 67) * (0-(0)));
            zz = 0 + (((tickAnim - 493) / 67) * (0-(0)));
        }
        else if (tickAnim >= 560 && tickAnim < 573) {
            xx = 2.75 + (((tickAnim - 560) / 13) * (-43.63-(2.75)));
            yy = 0 + (((tickAnim - 560) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 560) / 13) * (0-(0)));
        }
        else if (tickAnim >= 573 && tickAnim < 585) {
            xx = -43.63 + (((tickAnim - 573) / 12) * (0-(-43.63)));
            yy = 0 + (((tickAnim - 573) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 573) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg3, leftLeg3.rotateAngleX + (float) Math.toRadians(xx), leftLeg3.rotateAngleY + (float) Math.toRadians(yy), leftLeg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 34) {
            xx = 0 + (((tickAnim - 0) / 34) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 34) * (-0.325-(0)));
            zz = 0 + (((tickAnim - 0) / 34) * (0-(0)));
        }
        else if (tickAnim >= 34 && tickAnim < 455) {
            xx = 0 + (((tickAnim - 34) / 421) * (0-(0)));
            yy = -0.325 + (((tickAnim - 34) / 421) * (-0.325-(-0.325)));
            zz = 0 + (((tickAnim - 34) / 421) * (0-(0)));
        }
        else if (tickAnim >= 455 && tickAnim < 462) {
            xx = 0 + (((tickAnim - 455) / 7) * (0-(0)));
            yy = -0.325 + (((tickAnim - 455) / 7) * (-0.72-(-0.325)));
            zz = 0 + (((tickAnim - 455) / 7) * (0-(0)));
        }
        else if (tickAnim >= 462 && tickAnim < 470) {
            xx = 0 + (((tickAnim - 462) / 8) * (0-(0)));
            yy = -0.72 + (((tickAnim - 462) / 8) * (-0.325-(-0.72)));
            zz = 0 + (((tickAnim - 462) / 8) * (0-(0)));
        }
        else if (tickAnim >= 470 && tickAnim < 493) {
            xx = 0 + (((tickAnim - 470) / 23) * (0-(0)));
            yy = -0.325 + (((tickAnim - 470) / 23) * (-0.325-(-0.325)));
            zz = 0 + (((tickAnim - 470) / 23) * (0-(0)));
        }
        else if (tickAnim >= 493 && tickAnim < 560) {
            xx = 0 + (((tickAnim - 493) / 67) * (0-(0)));
            yy = -0.325 + (((tickAnim - 493) / 67) * (0-(-0.325)));
            zz = 0 + (((tickAnim - 493) / 67) * (0-(0)));
        }
        else if (tickAnim >= 560 && tickAnim < 573) {
            xx = 0 + (((tickAnim - 560) / 13) * (0-(0)));
            yy = 0 + (((tickAnim - 560) / 13) * (0.76-(0)));
            zz = 0 + (((tickAnim - 560) / 13) * (1.8-(0)));
        }
        else if (tickAnim >= 573 && tickAnim < 585) {
            xx = 0 + (((tickAnim - 573) / 12) * (0-(0)));
            yy = 0.76 + (((tickAnim - 573) / 12) * (0-(0.76)));
            zz = 1.8 + (((tickAnim - 573) / 12) * (0-(1.8)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftLeg3.rotationPointX = this.leftLeg3.rotationPointX + (float)(xx);
        this.leftLeg3.rotationPointY = this.leftLeg3.rotationPointY - (float)(yy);
        this.leftLeg3.rotationPointZ = this.leftLeg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 34) {
            xx = 0 + (((tickAnim - 0) / 34) * (3.72945-(0)));
            yy = 0 + (((tickAnim - 0) / 34) * (1.05831-(0)));
            zz = 0 + (((tickAnim - 0) / 34) * (-2.26524-(0)));
        }
        else if (tickAnim >= 34 && tickAnim < 455) {
            xx = 3.72945 + (((tickAnim - 34) / 421) * (3.72945-(3.72945)));
            yy = 1.05831 + (((tickAnim - 34) / 421) * (1.05831-(1.05831)));
            zz = -2.26524 + (((tickAnim - 34) / 421) * (-2.26524-(-2.26524)));
        }
        else if (tickAnim >= 455 && tickAnim < 462) {
            xx = 3.72945 + (((tickAnim - 455) / 7) * (6.47945-(3.72945)));
            yy = 1.05831 + (((tickAnim - 455) / 7) * (1.05831-(1.05831)));
            zz = -2.26524 + (((tickAnim - 455) / 7) * (-2.26524-(-2.26524)));
        }
        else if (tickAnim >= 462 && tickAnim < 470) {
            xx = 6.47945 + (((tickAnim - 462) / 8) * (3.72945-(6.47945)));
            yy = 1.05831 + (((tickAnim - 462) / 8) * (1.05831-(1.05831)));
            zz = -2.26524 + (((tickAnim - 462) / 8) * (-2.26524-(-2.26524)));
        }
        else if (tickAnim >= 470 && tickAnim < 485) {
            xx = 3.72945 + (((tickAnim - 470) / 15) * (16.72945-(3.72945)));
            yy = 1.05831 + (((tickAnim - 470) / 15) * (1.05831-(1.05831)));
            zz = -2.26524 + (((tickAnim - 470) / 15) * (-2.26524-(-2.26524)));
        }
        else if (tickAnim >= 485 && tickAnim < 493) {
            xx = 16.72945 + (((tickAnim - 485) / 8) * (3.72945-(16.72945)));
            yy = 1.05831 + (((tickAnim - 485) / 8) * (1.05831-(1.05831)));
            zz = -2.26524 + (((tickAnim - 485) / 8) * (-2.26524-(-2.26524)));
        }
        else if (tickAnim >= 493 && tickAnim < 560) {
            xx = 3.72945 + (((tickAnim - 493) / 67) * (-17.02055-(3.72945)));
            yy = 1.05831 + (((tickAnim - 493) / 67) * (1.05831-(1.05831)));
            zz = -2.26524 + (((tickAnim - 493) / 67) * (-2.26524-(-2.26524)));
        }
        else if (tickAnim >= 560 && tickAnim < 573) {
            xx = -17.02055 + (((tickAnim - 560) / 13) * (66.73972-(-17.02055)));
            yy = 1.05831 + (((tickAnim - 560) / 13) * (0.52916-(1.05831)));
            zz = -2.26524 + (((tickAnim - 560) / 13) * (-1.13262-(-2.26524)));
        }
        else if (tickAnim >= 573 && tickAnim < 585) {
            xx = 66.73972 + (((tickAnim - 573) / 12) * (0-(66.73972)));
            yy = 0.52916 + (((tickAnim - 573) / 12) * (0-(0.52916)));
            zz = -1.13262 + (((tickAnim - 573) / 12) * (0-(-1.13262)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftFoot, leftFoot.rotateAngleX + (float) Math.toRadians(xx), leftFoot.rotateAngleY + (float) Math.toRadians(yy), leftFoot.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 34) {
            xx = 0 + (((tickAnim - 0) / 34) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 34) * (-0.2-(0)));
            zz = 0 + (((tickAnim - 0) / 34) * (0-(0)));
        }
        else if (tickAnim >= 34 && tickAnim < 455) {
            xx = 0 + (((tickAnim - 34) / 421) * (0-(0)));
            yy = -0.2 + (((tickAnim - 34) / 421) * (-0.2-(-0.2)));
            zz = 0 + (((tickAnim - 34) / 421) * (0-(0)));
        }
        else if (tickAnim >= 455 && tickAnim < 470) {
            xx = 0 + (((tickAnim - 455) / 15) * (0-(0)));
            yy = -0.2 + (((tickAnim - 455) / 15) * (-0.2-(-0.2)));
            zz = 0 + (((tickAnim - 455) / 15) * (0-(0)));
        }
        else if (tickAnim >= 470 && tickAnim < 493) {
            xx = 0 + (((tickAnim - 470) / 23) * (0-(0)));
            yy = -0.2 + (((tickAnim - 470) / 23) * (-0.2-(-0.2)));
            zz = 0 + (((tickAnim - 470) / 23) * (0-(0)));
        }
        else if (tickAnim >= 493 && tickAnim < 560) {
            xx = 0 + (((tickAnim - 493) / 67) * (0-(0)));
            yy = -0.2 + (((tickAnim - 493) / 67) * (-0.7-(-0.2)));
            zz = 0 + (((tickAnim - 493) / 67) * (0-(0)));
        }
        else if (tickAnim >= 560 && tickAnim < 573) {
            xx = 0 + (((tickAnim - 560) / 13) * (0-(0)));
            yy = -0.7 + (((tickAnim - 560) / 13) * (1.41-(-0.7)));
            zz = 0 + (((tickAnim - 560) / 13) * (0-(0)));
        }
        else if (tickAnim >= 573 && tickAnim < 585) {
            xx = 0 + (((tickAnim - 573) / 12) * (0-(0)));
            yy = 1.41 + (((tickAnim - 573) / 12) * (0-(1.41)));
            zz = 0 + (((tickAnim - 573) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftFoot.rotationPointX = this.leftFoot.rotationPointX + (float)(xx);
        this.leftFoot.rotationPointY = this.leftFoot.rotationPointY - (float)(yy);
        this.leftFoot.rotationPointZ = this.leftFoot.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 560) {
            xx = 0 + (((tickAnim - 0) / 560) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 560) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 560) * (0-(0)));
        }
        else if (tickAnim >= 560 && tickAnim < 573) {
            xx = 0 + (((tickAnim - 560) / 13) * (17.75-(0)));
            yy = 0 + (((tickAnim - 560) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 560) / 13) * (0-(0)));
        }
        else if (tickAnim >= 573 && tickAnim < 585) {
            xx = 17.75 + (((tickAnim - 573) / 12) * (0-(17.75)));
            yy = 0 + (((tickAnim - 573) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 573) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftToes, leftToes.rotateAngleX + (float) Math.toRadians(xx), leftToes.rotateAngleY + (float) Math.toRadians(yy), leftToes.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 46) {
            xx = 0 + (((tickAnim - 0) / 46) * (1.25-(0)));
            yy = 0 + (((tickAnim - 0) / 46) * (1.75-(0)));
            zz = 0 + (((tickAnim - 0) / 46) * (0-(0)));
        }
        else if (tickAnim >= 46 && tickAnim < 455) {
            xx = 1.25 + (((tickAnim - 46) / 409) * (1.25-(1.25)));
            yy = 1.75 + (((tickAnim - 46) / 409) * (1.75-(1.75)));
            zz = 0 + (((tickAnim - 46) / 409) * (0-(0)));
        }
        else if (tickAnim >= 455 && tickAnim < 473) {
            xx = 1.25 + (((tickAnim - 455) / 18) * (0-(1.25)));
            yy = 1.75 + (((tickAnim - 455) / 18) * (0-(1.75)));
            zz = 0 + (((tickAnim - 455) / 18) * (0-(0)));
        }
        else if (tickAnim >= 473 && tickAnim < 485) {
            xx = 0 + (((tickAnim - 473) / 12) * (-2.75029-(0)));
            yy = 0 + (((tickAnim - 473) / 12) * (2.74997-(0)));
            zz = 0 + (((tickAnim - 473) / 12) * (-0.01201-(0)));
        }
        else if (tickAnim >= 485 && tickAnim < 571) {
            xx = -2.75029 + (((tickAnim - 485) / 86) * (0-(-2.75029)));
            yy = 2.74997 + (((tickAnim - 485) / 86) * (0-(2.74997)));
            zz = -0.01201 + (((tickAnim - 485) / 86) * (0-(-0.01201)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail1, tail1.rotateAngleX + (float) Math.toRadians(xx), tail1.rotateAngleY + (float) Math.toRadians(yy), tail1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 47) {
            xx = 0 + (((tickAnim - 0) / 47) * (3-(0)));
            yy = 0 + (((tickAnim - 0) / 47) * (3.5-(0)));
            zz = 0 + (((tickAnim - 0) / 47) * (0-(0)));
        }
        else if (tickAnim >= 47 && tickAnim < 455) {
            xx = 3 + (((tickAnim - 47) / 408) * (3-(3)));
            yy = 3.5 + (((tickAnim - 47) / 408) * (3.5-(3.5)));
            zz = 0 + (((tickAnim - 47) / 408) * (0-(0)));
        }
        else if (tickAnim >= 455 && tickAnim < 473) {
            xx = 3 + (((tickAnim - 455) / 18) * (0-(3)));
            yy = 3.5 + (((tickAnim - 455) / 18) * (0-(3.5)));
            zz = 0 + (((tickAnim - 455) / 18) * (0-(0)));
        }
        else if (tickAnim >= 473 && tickAnim < 485) {
            xx = 0 + (((tickAnim - 473) / 12) * (-1.99897-(0)));
            yy = 0 + (((tickAnim - 473) / 12) * (1.49794-(0)));
            zz = 0 + (((tickAnim - 473) / 12) * (0.07852-(0)));
        }
        else if (tickAnim >= 485 && tickAnim < 571) {
            xx = -1.99897 + (((tickAnim - 485) / 86) * (0-(-1.99897)));
            yy = 1.49794 + (((tickAnim - 485) / 86) * (0-(1.49794)));
            zz = 0.07852 + (((tickAnim - 485) / 86) * (0-(0.07852)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(xx), tail2.rotateAngleY + (float) Math.toRadians(yy), tail2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 48) {
            xx = 0 + (((tickAnim - 0) / 48) * (-1.25-(0)));
            yy = 0 + (((tickAnim - 0) / 48) * (2-(0)));
            zz = 0 + (((tickAnim - 0) / 48) * (0-(0)));
        }
        else if (tickAnim >= 48 && tickAnim < 455) {
            xx = -1.25 + (((tickAnim - 48) / 407) * (-1.25-(-1.25)));
            yy = 2 + (((tickAnim - 48) / 407) * (2-(2)));
            zz = 0 + (((tickAnim - 48) / 407) * (0-(0)));
        }
        else if (tickAnim >= 455 && tickAnim < 473) {
            xx = -1.25 + (((tickAnim - 455) / 18) * (0-(-1.25)));
            yy = 2 + (((tickAnim - 455) / 18) * (-8-(2)));
            zz = 0 + (((tickAnim - 455) / 18) * (0-(0)));
        }
        else if (tickAnim >= 473 && tickAnim < 485) {
            xx = 0 + (((tickAnim - 473) / 12) * (1.22499-(0)));
            yy = -8 + (((tickAnim - 473) / 12) * (-4.50744-(-8)));
            zz = 0 + (((tickAnim - 473) / 12) * (0.22948-(0)));
        }
        else if (tickAnim >= 485 && tickAnim < 571) {
            xx = 1.22499 + (((tickAnim - 485) / 86) * (0-(1.22499)));
            yy = -4.50744 + (((tickAnim - 485) / 86) * (0-(-4.50744)));
            zz = 0.22948 + (((tickAnim - 485) / 86) * (0-(0.22948)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(xx), tail3.rotateAngleY + (float) Math.toRadians(yy), tail3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 48) {
            xx = 0 + (((tickAnim - 0) / 48) * (-6.25-(0)));
            yy = 0 + (((tickAnim - 0) / 48) * (3.5-(0)));
            zz = 0 + (((tickAnim - 0) / 48) * (0-(0)));
        }
        else if (tickAnim >= 48 && tickAnim < 455) {
            xx = -6.25 + (((tickAnim - 48) / 407) * (-6.25-(-6.25)));
            yy = 3.5 + (((tickAnim - 48) / 407) * (3.5-(3.5)));
            zz = 0 + (((tickAnim - 48) / 407) * (0-(0)));
        }
        else if (tickAnim >= 455 && tickAnim < 473) {
            xx = -6.25 + (((tickAnim - 455) / 18) * (0-(-6.25)));
            yy = 3.5 + (((tickAnim - 455) / 18) * (-8-(3.5)));
            zz = 0 + (((tickAnim - 455) / 18) * (0-(0)));
        }
        else if (tickAnim >= 473 && tickAnim < 485) {
            xx = 0 + (((tickAnim - 473) / 12) * (8.1598-(0)));
            yy = -8 + (((tickAnim - 473) / 12) * (-3.08691-(-8)));
            zz = 0 + (((tickAnim - 473) / 12) * (0.93283-(0)));
        }
        else if (tickAnim >= 485 && tickAnim < 571) {
            xx = 8.1598 + (((tickAnim - 485) / 86) * (0-(8.1598)));
            yy = -3.08691 + (((tickAnim - 485) / 86) * (0-(-3.08691)));
            zz = 0.93283 + (((tickAnim - 485) / 86) * (0-(0.93283)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(xx), tail4.rotateAngleY + (float) Math.toRadians(yy), tail4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 49) {
            xx = 0 + (((tickAnim - 0) / 49) * (-5.25-(0)));
            yy = 0 + (((tickAnim - 0) / 49) * (3.75-(0)));
            zz = 0 + (((tickAnim - 0) / 49) * (0-(0)));
        }
        else if (tickAnim >= 49 && tickAnim < 455) {
            xx = -5.25 + (((tickAnim - 49) / 406) * (-5.25-(-5.25)));
            yy = 3.75 + (((tickAnim - 49) / 406) * (3.75-(3.75)));
            zz = 0 + (((tickAnim - 49) / 406) * (0-(0)));
        }
        else if (tickAnim >= 455 && tickAnim < 458) {
            xx = -5.25 + (((tickAnim - 455) / 3) * (-0.24719-(-5.25)));
            yy = 3.75 + (((tickAnim - 455) / 3) * (8.08281-(3.75)));
            zz = 0 + (((tickAnim - 455) / 3) * (0.84992-(0)));
        }
        else if (tickAnim >= 458 && tickAnim < 473) {
            xx = -0.24719 + (((tickAnim - 458) / 15) * (0-(-0.24719)));
            yy = 8.08281 + (((tickAnim - 458) / 15) * (-12.25-(8.08281)));
            zz = 0.84992 + (((tickAnim - 458) / 15) * (0-(0.84992)));
        }
        else if (tickAnim >= 473 && tickAnim < 485) {
            xx = 0 + (((tickAnim - 473) / 12) * (4.31188-(0)));
            yy = -12.25 + (((tickAnim - 473) / 12) * (-5.01141-(-12.25)));
            zz = 0 + (((tickAnim - 473) / 12) * (-0.4115-(0)));
        }
        else if (tickAnim >= 485 && tickAnim < 571) {
            xx = 4.31188 + (((tickAnim - 485) / 86) * (0-(4.31188)));
            yy = -5.01141 + (((tickAnim - 485) / 86) * (0-(-5.01141)));
            zz = -0.4115 + (((tickAnim - 485) / 86) * (0-(-0.4115)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail5, tail5.rotateAngleX + (float) Math.toRadians(xx), tail5.rotateAngleY + (float) Math.toRadians(yy), tail5.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (-13.84-Math.sin((Math.PI/180)*(((double)tickAnim/20)*70-50))*-30-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 18) / 32) * (0-(0)));
            yy = -13.84-Math.sin((Math.PI/180)*(((double)tickAnim/20)*70-50))*-30 + (((tickAnim - 18) / 32) * (4.5-(-13.84-Math.sin((Math.PI/180)*(((double)tickAnim/20)*70-50))*-30)));
            zz = 0 + (((tickAnim - 18) / 32) * (0-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 455) {
            xx = 0 + (((tickAnim - 50) / 405) * (0-(0)));
            yy = 4.5 + (((tickAnim - 50) / 405) * (4.5-(4.5)));
            zz = 0 + (((tickAnim - 50) / 405) * (0-(0)));
        }
        else if (tickAnim >= 455 && tickAnim < 458) {
            xx = 0 + (((tickAnim - 455) / 3) * (0-(0)));
            yy = 4.5 + (((tickAnim - 455) / 3) * (8.31-(4.5)));
            zz = 0 + (((tickAnim - 455) / 3) * (0-(0)));
        }
        else if (tickAnim >= 458 && tickAnim < 462) {
            xx = 0 + (((tickAnim - 458) / 4) * (0.30337-(0)));
            yy = 8.31 + (((tickAnim - 458) / 4) * (13.82988-(8.31)));
            zz = 0 + (((tickAnim - 458) / 4) * (1.27631-(0)));
        }
        else if (tickAnim >= 462 && tickAnim < 473) {
            xx = 0.30337 + (((tickAnim - 462) / 11) * (0-(0.30337)));
            yy = 13.82988 + (((tickAnim - 462) / 11) * (-14-(13.82988)));
            zz = 1.27631 + (((tickAnim - 462) / 11) * (0-(1.27631)));
        }
        else if (tickAnim >= 473 && tickAnim < 485) {
            xx = 0 + (((tickAnim - 473) / 12) * (4.5-(0)));
            yy = -14 + (((tickAnim - 473) / 12) * (-14-(-14)));
            zz = 0 + (((tickAnim - 473) / 12) * (0-(0)));
        }
        else if (tickAnim >= 485 && tickAnim < 571) {
            xx = 4.5 + (((tickAnim - 485) / 86) * (0-(4.5)));
            yy = -14 + (((tickAnim - 485) / 86) * (0-(-14)));
            zz = 0 + (((tickAnim - 485) / 86) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail6, tail6.rotateAngleX + (float) Math.toRadians(xx), tail6.rotateAngleY + (float) Math.toRadians(yy), tail6.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 52) {
            xx = -0.5-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+30))*-1 + (((tickAnim - 0) / 52) * (0-(-0.5-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+30))*-1)));
            yy = 0 + (((tickAnim - 0) / 52) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 52) * (0-(0)));
        }
        else if (tickAnim >= 52 && tickAnim < 455) {
            xx = 0 + (((tickAnim - 52) / 403) * (0-(0)));
            yy = 0 + (((tickAnim - 52) / 403) * (0-(0)));
            zz = 0 + (((tickAnim - 52) / 403) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(xx), body.rotateAngleY + (float) Math.toRadians(yy), body.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 34) {
            xx = 0 + (((tickAnim - 0) / 34) * (11.5-(0)));
            yy = 0 + (((tickAnim - 0) / 34) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 34) * (0-(0)));
        }
        else if (tickAnim >= 34 && tickAnim < 485) {
            xx = 11.5 + (((tickAnim - 34) / 451) * (11.5-(11.5)));
            yy = 0 + (((tickAnim - 34) / 451) * (0-(0)));
            zz = 0 + (((tickAnim - 34) / 451) * (0-(0)));
        }
        else if (tickAnim >= 485 && tickAnim < 585) {
            xx = 11.5 + (((tickAnim - 485) / 100) * (0-(11.5)));
            yy = 0 + (((tickAnim - 485) / 100) * (0-(0)));
            zz = 0 + (((tickAnim - 485) / 100) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm1, leftArm1.rotateAngleX + (float) Math.toRadians(xx), leftArm1.rotateAngleY + (float) Math.toRadians(yy), leftArm1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 34) {
            xx = 0 + (((tickAnim - 0) / 34) * (-21.25-(0)));
            yy = 0 + (((tickAnim - 0) / 34) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 34) * (0-(0)));
        }
        else if (tickAnim >= 34 && tickAnim < 485) {
            xx = -21.25 + (((tickAnim - 34) / 451) * (-21.25-(-21.25)));
            yy = 0 + (((tickAnim - 34) / 451) * (0-(0)));
            zz = 0 + (((tickAnim - 34) / 451) * (0-(0)));
        }
        else if (tickAnim >= 485 && tickAnim < 585) {
            xx = -21.25 + (((tickAnim - 485) / 100) * (0-(-21.25)));
            yy = 0 + (((tickAnim - 485) / 100) * (0-(0)));
            zz = 0 + (((tickAnim - 485) / 100) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm2, leftArm2.rotateAngleX + (float) Math.toRadians(xx), leftArm2.rotateAngleY + (float) Math.toRadians(yy), leftArm2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 34) {
            xx = 0 + (((tickAnim - 0) / 34) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 34) * (1.05-(0)));
            zz = 0 + (((tickAnim - 0) / 34) * (1.125-(0)));
        }
        else if (tickAnim >= 34 && tickAnim < 485) {
            xx = 0 + (((tickAnim - 34) / 451) * (0-(0)));
            yy = 1.05 + (((tickAnim - 34) / 451) * (1.05-(1.05)));
            zz = 1.125 + (((tickAnim - 34) / 451) * (1.125-(1.125)));
        }
        else if (tickAnim >= 485 && tickAnim < 585) {
            xx = 0 + (((tickAnim - 485) / 100) * (0-(0)));
            yy = 1.05 + (((tickAnim - 485) / 100) * (0-(1.05)));
            zz = 1.125 + (((tickAnim - 485) / 100) * (0-(1.125)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftArm2.rotationPointX = this.leftArm2.rotationPointX + (float)(xx);
        this.leftArm2.rotationPointY = this.leftArm2.rotationPointY - (float)(yy);
        this.leftArm2.rotationPointZ = this.leftArm2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 34) {
            xx = 0 + (((tickAnim - 0) / 34) * (25-(0)));
            yy = 0 + (((tickAnim - 0) / 34) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 34) * (0-(0)));
        }
        else if (tickAnim >= 34 && tickAnim < 485) {
            xx = 25 + (((tickAnim - 34) / 451) * (25-(25)));
            yy = 0 + (((tickAnim - 34) / 451) * (0-(0)));
            zz = 0 + (((tickAnim - 34) / 451) * (0-(0)));
        }
        else if (tickAnim >= 485 && tickAnim < 585) {
            xx = 25 + (((tickAnim - 485) / 100) * (0-(25)));
            yy = 0 + (((tickAnim - 485) / 100) * (0-(0)));
            zz = 0 + (((tickAnim - 485) / 100) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm3, leftArm3.rotateAngleX + (float) Math.toRadians(xx), leftArm3.rotateAngleY + (float) Math.toRadians(yy), leftArm3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 34) {
            xx = 0 + (((tickAnim - 0) / 34) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 34) * (0.7-(0)));
            zz = 0 + (((tickAnim - 0) / 34) * (0-(0)));
        }
        else if (tickAnim >= 34 && tickAnim < 485) {
            xx = 0 + (((tickAnim - 34) / 451) * (0-(0)));
            yy = 0.7 + (((tickAnim - 34) / 451) * (0.7-(0.7)));
            zz = 0 + (((tickAnim - 34) / 451) * (0-(0)));
        }
        else if (tickAnim >= 485 && tickAnim < 585) {
            xx = 0 + (((tickAnim - 485) / 100) * (0-(0)));
            yy = 0.7 + (((tickAnim - 485) / 100) * (0-(0.7)));
            zz = 0 + (((tickAnim - 485) / 100) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftArm3.rotationPointX = this.leftArm3.rotationPointX + (float)(xx);
        this.leftArm3.rotationPointY = this.leftArm3.rotationPointY - (float)(yy);
        this.leftArm3.rotationPointZ = this.leftArm3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            yy = -0-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*5 + (((tickAnim - 0) / 40) * (-5-(-0-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*5)));
            zz = 0 + (((tickAnim - 0) / 40) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 120) {
            xx = 0 + (((tickAnim - 40) / 80) * (0-(0)));
            yy = -5 + (((tickAnim - 40) / 80) * (-5-(-5)));
            zz = 0 + (((tickAnim - 40) / 80) * (0-(0)));
        }
        else if (tickAnim >= 120 && tickAnim < 455) {
            xx = 0 + (((tickAnim - 120) / 335) * (1.75-(0)));
            yy = -5 + (((tickAnim - 120) / 335) * (-5-(-5)));
            zz = 0 + (((tickAnim - 120) / 335) * (0-(0)));
        }
        else if (tickAnim >= 455 && tickAnim < 462) {
            xx = 1.75 + (((tickAnim - 455) / 7) * (38-(1.75)));
            yy = -5 + (((tickAnim - 455) / 7) * (-5-(-5)));
            zz = 0 + (((tickAnim - 455) / 7) * (0-(0)));
        }
        else if (tickAnim >= 462 && tickAnim < 473) {
            xx = 38 + (((tickAnim - 462) / 11) * (0-(38)));
            yy = -5 + (((tickAnim - 462) / 11) * (0-(-5)));
            zz = 0 + (((tickAnim - 462) / 11) * (0-(0)));
        }
        else if (tickAnim >= 473 && tickAnim < 485) {
            xx = 0 + (((tickAnim - 473) / 12) * (-10.25-(0)));
            yy = 0 + (((tickAnim - 473) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 473) / 12) * (0-(0)));
        }
        else if (tickAnim >= 485 && tickAnim < 515) {
            xx = -10.25 + (((tickAnim - 485) / 30) * (0-(-10.25)));
            yy = 0 + (((tickAnim - 485) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 485) / 30) * (0-(0)));
        }
        else if (tickAnim >= 515 && tickAnim < 571) {
            xx = 0 + (((tickAnim - 515) / 56) * (0-(0)));
            yy = 0 + (((tickAnim - 515) / 56) * (0-(0)));
            zz = 0 + (((tickAnim - 515) / 56) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck1, neck1.rotateAngleX + (float) Math.toRadians(xx), neck1.rotateAngleY + (float) Math.toRadians(yy), neck1.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 485) {
            xx = 0 + (((tickAnim - 0) / 485) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 485) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 485) * (0.85-(0)));
        }
        else if (tickAnim >= 485 && tickAnim < 571) {
            xx = 0 + (((tickAnim - 485) / 86) * (0-(0)));
            yy = 0 + (((tickAnim - 485) / 86) * (0-(0)));
            zz = 0.85 + (((tickAnim - 485) / 86) * (0-(0.85)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.neck1.rotationPointX = this.neck1.rotationPointX + (float)(xx);
        this.neck1.rotationPointY = this.neck1.rotationPointY - (float)(yy);
        this.neck1.rotationPointZ = this.neck1.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 46) {
            xx = -0-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-5 + (((tickAnim - 0) / 46) * (6-(-0-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-5)));
            yy = 0 + (((tickAnim - 0) / 46) * (-2.75-(0)));
            zz = 0 + (((tickAnim - 0) / 46) * (0-(0)));
        }
        else if (tickAnim >= 46 && tickAnim < 120) {
            xx = 6 + (((tickAnim - 46) / 74) * (6-(6)));
            yy = -2.75 + (((tickAnim - 46) / 74) * (-2.75-(-2.75)));
            zz = 0 + (((tickAnim - 46) / 74) * (0-(0)));
        }
        else if (tickAnim >= 120 && tickAnim < 455) {
            xx = 6 + (((tickAnim - 120) / 335) * (3-(6)));
            yy = -2.75 + (((tickAnim - 120) / 335) * (-2.75-(-2.75)));
            zz = 0 + (((tickAnim - 120) / 335) * (0-(0)));
        }
        else if (tickAnim >= 455 && tickAnim < 462) {
            xx = 3 + (((tickAnim - 455) / 7) * (15.25-(3)));
            yy = -2.75 + (((tickAnim - 455) / 7) * (-2.75-(-2.75)));
            zz = 0 + (((tickAnim - 455) / 7) * (0-(0)));
        }
        else if (tickAnim >= 462 && tickAnim < 473) {
            xx = 15.25 + (((tickAnim - 462) / 11) * (0-(15.25)));
            yy = -2.75 + (((tickAnim - 462) / 11) * (0-(-2.75)));
            zz = 0 + (((tickAnim - 462) / 11) * (0-(0)));
        }
        else if (tickAnim >= 473 && tickAnim < 485) {
            xx = 0 + (((tickAnim - 473) / 12) * (-7-(0)));
            yy = 0 + (((tickAnim - 473) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 473) / 12) * (0-(0)));
        }
        else if (tickAnim >= 485 && tickAnim < 515) {
            xx = -7 + (((tickAnim - 485) / 30) * (-14.3-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*20-(-7)));
            yy = 0 + (((tickAnim - 485) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 485) / 30) * (0-(0)));
        }
        else if (tickAnim >= 515 && tickAnim < 571) {
            xx = -14.3-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*20 + (((tickAnim - 515) / 56) * (0-(-14.3-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*20)));
            yy = 0 + (((tickAnim - 515) / 56) * (0-(0)));
            zz = 0 + (((tickAnim - 515) / 56) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(xx), neck2.rotateAngleY + (float) Math.toRadians(yy), neck2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 462) {
            xx = 0 + (((tickAnim - 0) / 462) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 462) * (0.4-(0)));
            zz = 0 + (((tickAnim - 0) / 462) * (1.325-(0)));
        }
        else if (tickAnim >= 462 && tickAnim < 473) {
            xx = 0 + (((tickAnim - 462) / 11) * (0-(0)));
            yy = 0.4 + (((tickAnim - 462) / 11) * (0-(0.4)));
            zz = 1.325 + (((tickAnim - 462) / 11) * (0-(1.325)));
        }
        else if (tickAnim >= 473 && tickAnim < 485) {
            xx = 0 + (((tickAnim - 473) / 12) * (0-(0)));
            yy = 0 + (((tickAnim - 473) / 12) * (-0.45-(0)));
            zz = 0 + (((tickAnim - 473) / 12) * (1.225-(0)));
        }
        else if (tickAnim >= 485 && tickAnim < 495) {
            xx = 0 + (((tickAnim - 485) / 10) * (0-(0)));
            yy = -0.45 + (((tickAnim - 485) / 10) * (-0.9-(-0.45)));
            zz = 1.225 + (((tickAnim - 485) / 10) * (1.695-(1.225)));
        }
        else if (tickAnim >= 495 && tickAnim < 515) {
            xx = 0 + (((tickAnim - 495) / 20) * (0-(0)));
            yy = -0.9 + (((tickAnim - 495) / 20) * (0-(-0.9)));
            zz = 1.695 + (((tickAnim - 495) / 20) * (0.825-(1.695)));
        }
        else if (tickAnim >= 515 && tickAnim < 571) {
            xx = 0 + (((tickAnim - 515) / 56) * (0-(0)));
            yy = 0 + (((tickAnim - 515) / 56) * (0-(0)));
            zz = 0.825 + (((tickAnim - 515) / 56) * (0-(0.825)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.neck2.rotationPointX = this.neck2.rotationPointX + (float)(xx);
        this.neck2.rotationPointY = this.neck2.rotationPointY - (float)(yy);
        this.neck2.rotationPointZ = this.neck2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 52) {
            xx = -0-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-6 + (((tickAnim - 0) / 52) * (3.5-(-0-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-6)));
            yy = 0 + (((tickAnim - 0) / 52) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 52) * (0-(0)));
        }
        else if (tickAnim >= 52 && tickAnim < 120) {
            xx = 3.5 + (((tickAnim - 52) / 68) * (3.5-(3.5)));
            yy = 0 + (((tickAnim - 52) / 68) * (0-(0)));
            zz = 0 + (((tickAnim - 52) / 68) * (0-(0)));
        }
        else if (tickAnim >= 120 && tickAnim < 455) {
            xx = 3.5 + (((tickAnim - 120) / 335) * (9.25-(3.5)));
            yy = 0 + (((tickAnim - 120) / 335) * (0-(0)));
            zz = 0 + (((tickAnim - 120) / 335) * (0-(0)));
        }
        else if (tickAnim >= 455 && tickAnim < 462) {
            xx = 9.25 + (((tickAnim - 455) / 7) * (-4.5-(9.25)));
            yy = 0 + (((tickAnim - 455) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 455) / 7) * (0-(0)));
        }
        else if (tickAnim >= 462 && tickAnim < 465) {
            xx = -4.5 + (((tickAnim - 462) / 3) * (1.55-(-4.5)));
            yy = 0 + (((tickAnim - 462) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 462) / 3) * (0-(0)));
        }
        else if (tickAnim >= 465 && tickAnim < 473) {
            xx = 1.55 + (((tickAnim - 465) / 8) * (0-(1.55)));
            yy = 0 + (((tickAnim - 465) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 465) / 8) * (0-(0)));
        }
        else if (tickAnim >= 473 && tickAnim < 485) {
            xx = 0 + (((tickAnim - 473) / 12) * (-18.75-(0)));
            yy = 0 + (((tickAnim - 473) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 473) / 12) * (0-(0)));
        }
        else if (tickAnim >= 485 && tickAnim < 493) {
            xx = -18.75 + (((tickAnim - 485) / 8) * (-24.75-(-18.75)));
            yy = 0 + (((tickAnim - 485) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 485) / 8) * (0-(0)));
        }
        else if (tickAnim >= 493 && tickAnim < 515) {
            xx = -24.75 + (((tickAnim - 493) / 22) * (-27.125-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*20-(-24.75)));
            yy = 0 + (((tickAnim - 493) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 493) / 22) * (0-(0)));
        }
        else if (tickAnim >= 515 && tickAnim < 571) {
            xx = -27.125-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*20 + (((tickAnim - 515) / 56) * (0-(-27.125-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*20)));
            yy = 0 + (((tickAnim - 515) / 56) * (0-(0)));
            zz = 0 + (((tickAnim - 515) / 56) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(xx), neck3.rotateAngleY + (float) Math.toRadians(yy), neck3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 455) {
            xx = 0 + (((tickAnim - 0) / 455) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 455) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 455) * (0.55-(0)));
        }
        else if (tickAnim >= 455 && tickAnim < 462) {
            xx = 0 + (((tickAnim - 455) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 455) / 7) * (-0.9-(0)));
            zz = 0.55 + (((tickAnim - 455) / 7) * (-0.8-(0.55)));
        }
        else if (tickAnim >= 462 && tickAnim < 473) {
            xx = 0 + (((tickAnim - 462) / 11) * (0-(0)));
            yy = -0.9 + (((tickAnim - 462) / 11) * (0-(-0.9)));
            zz = -0.8 + (((tickAnim - 462) / 11) * (0-(-0.8)));
        }
        else if (tickAnim >= 473 && tickAnim < 485) {
            xx = 0 + (((tickAnim - 473) / 12) * (0-(0)));
            yy = 0 + (((tickAnim - 473) / 12) * (-0.25-(0)));
            zz = 0 + (((tickAnim - 473) / 12) * (-2-(0)));
        }
        else if (tickAnim >= 485 && tickAnim < 493) {
            xx = 0 + (((tickAnim - 485) / 8) * (0-(0)));
            yy = -0.25 + (((tickAnim - 485) / 8) * (-0.25-(-0.25)));
            zz = -2 + (((tickAnim - 485) / 8) * (-1.325-(-2)));
        }
        else if (tickAnim >= 493 && tickAnim < 515) {
            xx = 0 + (((tickAnim - 493) / 22) * (0-(0)));
            yy = -0.25 + (((tickAnim - 493) / 22) * (0-(-0.25)));
            zz = -1.325 + (((tickAnim - 493) / 22) * (0-(-1.325)));
        }
        else if (tickAnim >= 515 && tickAnim < 571) {
            xx = 0 + (((tickAnim - 515) / 56) * (0-(0)));
            yy = 0 + (((tickAnim - 515) / 56) * (0-(0)));
            zz = 0 + (((tickAnim - 515) / 56) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.neck3.rotationPointX = this.neck3.rotationPointX + (float)(xx);
        this.neck3.rotationPointY = this.neck3.rotationPointY - (float)(yy);
        this.neck3.rotationPointZ = this.neck3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 52) {
            xx = -0-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-7 + (((tickAnim - 0) / 52) * (3-(-0-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-7)));
            yy = 0 + (((tickAnim - 0) / 52) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 52) * (0-(0)));
        }
        else if (tickAnim >= 52 && tickAnim < 120) {
            xx = 3 + (((tickAnim - 52) / 68) * (3-(3)));
            yy = 0 + (((tickAnim - 52) / 68) * (0-(0)));
            zz = 0 + (((tickAnim - 52) / 68) * (0-(0)));
        }
        else if (tickAnim >= 120 && tickAnim < 455) {
            xx = 3 + (((tickAnim - 120) / 335) * (6.75-(3)));
            yy = 0 + (((tickAnim - 120) / 335) * (0-(0)));
            zz = 0 + (((tickAnim - 120) / 335) * (0-(0)));
        }
        else if (tickAnim >= 455 && tickAnim < 462) {
            xx = 6.75 + (((tickAnim - 455) / 7) * (-7-(6.75)));
            yy = 0 + (((tickAnim - 455) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 455) / 7) * (0-(0)));
        }
        else if (tickAnim >= 462 && tickAnim < 473) {
            xx = -7 + (((tickAnim - 462) / 11) * (0-(-7)));
            yy = 0 + (((tickAnim - 462) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 462) / 11) * (0-(0)));
        }
        else if (tickAnim >= 473 && tickAnim < 479) {
            xx = 0 + (((tickAnim - 473) / 6) * (2.37-(0)));
            yy = 0 + (((tickAnim - 473) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 473) / 6) * (0-(0)));
        }
        else if (tickAnim >= 479 && tickAnim < 485) {
            xx = 2.37 + (((tickAnim - 479) / 6) * (-11.75-(2.37)));
            yy = 0 + (((tickAnim - 479) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 479) / 6) * (0-(0)));
        }
        else if (tickAnim >= 485 && tickAnim < 493) {
            xx = -11.75 + (((tickAnim - 485) / 8) * (-19.5-(-11.75)));
            yy = 0 + (((tickAnim - 485) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 485) / 8) * (0-(0)));
        }
        else if (tickAnim >= 493 && tickAnim < 515) {
            xx = -19.5 + (((tickAnim - 493) / 22) * (0-(-19.5)));
            yy = 0 + (((tickAnim - 493) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 493) / 22) * (0-(0)));
        }
        else if (tickAnim >= 515 && tickAnim < 571) {
            xx = 0 + (((tickAnim - 515) / 56) * (0-(0)));
            yy = 0 + (((tickAnim - 515) / 56) * (0-(0)));
            zz = 0 + (((tickAnim - 515) / 56) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck4, neck4.rotateAngleX + (float) Math.toRadians(xx), neck4.rotateAngleY + (float) Math.toRadians(yy), neck4.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 52) {
            xx = 0 + (((tickAnim - 0) / 52) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 52) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 52) * (0.55-(0)));
        }
        else if (tickAnim >= 52 && tickAnim < 120) {
            xx = 0 + (((tickAnim - 52) / 68) * (0-(0)));
            yy = 0 + (((tickAnim - 52) / 68) * (0-(0)));
            zz = 0.55 + (((tickAnim - 52) / 68) * (0.55-(0.55)));
        }
        else if (tickAnim >= 120 && tickAnim < 455) {
            xx = 0 + (((tickAnim - 120) / 335) * (0-(0)));
            yy = 0 + (((tickAnim - 120) / 335) * (0-(0)));
            zz = 0.55 + (((tickAnim - 120) / 335) * (0.875-(0.55)));
        }
        else if (tickAnim >= 455 && tickAnim < 462) {
            xx = 0 + (((tickAnim - 455) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 455) / 7) * (0-(0)));
            zz = 0.875 + (((tickAnim - 455) / 7) * (-0.52-(0.875)));
        }
        else if (tickAnim >= 462 && tickAnim < 473) {
            xx = 0 + (((tickAnim - 462) / 11) * (0-(0)));
            yy = 0 + (((tickAnim - 462) / 11) * (0-(0)));
            zz = -0.52 + (((tickAnim - 462) / 11) * (0-(-0.52)));
        }
        else if (tickAnim >= 473 && tickAnim < 479) {
            xx = 0 + (((tickAnim - 473) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 473) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 473) / 6) * (0.26-(0)));
        }
        else if (tickAnim >= 479 && tickAnim < 485) {
            xx = 0 + (((tickAnim - 479) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 479) / 6) * (0-(0)));
            zz = 0.26 + (((tickAnim - 479) / 6) * (-1.275-(0.26)));
        }
        else if (tickAnim >= 485 && tickAnim < 515) {
            xx = 0 + (((tickAnim - 485) / 30) * (0-(0)));
            yy = 0 + (((tickAnim - 485) / 30) * (0-(0)));
            zz = -1.275 + (((tickAnim - 485) / 30) * (0-(-1.275)));
        }
        else if (tickAnim >= 515 && tickAnim < 571) {
            xx = 0 + (((tickAnim - 515) / 56) * (0-(0)));
            yy = 0 + (((tickAnim - 515) / 56) * (0-(0)));
            zz = 0 + (((tickAnim - 515) / 56) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.neck4.rotationPointX = this.neck4.rotationPointX + (float)(xx);
        this.neck4.rotationPointY = this.neck4.rotationPointY - (float)(yy);
        this.neck4.rotationPointZ = this.neck4.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 52) {
            xx = -0-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-8 + (((tickAnim - 0) / 52) * (5.75-(-0-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-8)));
            yy = 0 + (((tickAnim - 0) / 52) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 52) * (0-(0)));
        }
        else if (tickAnim >= 52 && tickAnim < 70) {
            xx = 5.75 + (((tickAnim - 52) / 18) * (5.75-(5.75)));
            yy = 0 + (((tickAnim - 52) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 52) / 18) * (0-(0)));
        }
        else if (tickAnim >= 70 && tickAnim < 80) {
            xx = 5.75 + (((tickAnim - 70) / 10) * (6-(5.75)));
            yy = 0 + (((tickAnim - 70) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 70) / 10) * (0-(0)));
        }
        else if (tickAnim >= 80 && tickAnim < 91) {
            xx = 6 + (((tickAnim - 80) / 11) * (6.24659-(6)));
            yy = 0 + (((tickAnim - 80) / 11) * (-0.43443-(0)));
            zz = 0 + (((tickAnim - 80) / 11) * (0.90072-(0)));
        }
        else if (tickAnim >= 91 && tickAnim < 120) {
            xx = 6.24659 + (((tickAnim - 91) / 29) * (6.24659-(6.24659)));
            yy = -0.43443 + (((tickAnim - 91) / 29) * (-0.43443-(-0.43443)));
            zz = 0.90072 + (((tickAnim - 91) / 29) * (0.90072-(0.90072)));
        }
        else if (tickAnim >= 120 && tickAnim < 455) {
            xx = 6.24659 + (((tickAnim - 120) / 335) * (7.49659-(6.24659)));
            yy = -0.43443 + (((tickAnim - 120) / 335) * (-0.43443-(-0.43443)));
            zz = 0.90072 + (((tickAnim - 120) / 335) * (0.90072-(0.90072)));
        }
        else if (tickAnim >= 455 && tickAnim < 458) {
            xx = 7.49659 + (((tickAnim - 455) / 3) * (-2.90418-(7.49659)));
            yy = -0.43443 + (((tickAnim - 455) / 3) * (1.24766-(-0.43443)));
            zz = 0.90072 + (((tickAnim - 455) / 3) * (-2.72863-(0.90072)));
        }
        else if (tickAnim >= 458 && tickAnim < 462) {
            xx = -2.90418 + (((tickAnim - 458) / 4) * (2.24659-(-2.90418)));
            yy = 1.24766 + (((tickAnim - 458) / 4) * (-0.43443-(1.24766)));
            zz = -2.72863 + (((tickAnim - 458) / 4) * (0.90072-(-2.72863)));
        }
        else if (tickAnim >= 462 && tickAnim < 465) {
            xx = 2.24659 + (((tickAnim - 462) / 3) * (7.34795-(2.24659)));
            yy = -0.43443 + (((tickAnim - 462) / 3) * (-0.26066-(-0.43443)));
            zz = 0.90072 + (((tickAnim - 462) / 3) * (0.54043-(0.90072)));
        }
        else if (tickAnim >= 465 && tickAnim < 473) {
            xx = 7.34795 + (((tickAnim - 465) / 8) * (0-(7.34795)));
            yy = -0.26066 + (((tickAnim - 465) / 8) * (0-(-0.26066)));
            zz = 0.54043 + (((tickAnim - 465) / 8) * (0-(0.54043)));
        }
        else if (tickAnim >= 473 && tickAnim < 479) {
            xx = 0 + (((tickAnim - 473) / 6) * (11.5-(0)));
            yy = 0 + (((tickAnim - 473) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 473) / 6) * (0-(0)));
        }
        else if (tickAnim >= 479 && tickAnim < 485) {
            xx = 11.5 + (((tickAnim - 479) / 6) * (-3.5-(11.5)));
            yy = 0 + (((tickAnim - 479) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 479) / 6) * (0-(0)));
        }
        else if (tickAnim >= 485 && tickAnim < 493) {
            xx = -3.5 + (((tickAnim - 485) / 8) * (-5.5-(-3.5)));
            yy = 0 + (((tickAnim - 485) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 485) / 8) * (0-(0)));
        }
        else if (tickAnim >= 493 && tickAnim < 515) {
            xx = -5.5 + (((tickAnim - 493) / 22) * (0-(-5.5)));
            yy = 0 + (((tickAnim - 493) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 493) / 22) * (0-(0)));
        }
        else if (tickAnim >= 515 && tickAnim < 571) {
            xx = 0 + (((tickAnim - 515) / 56) * (0-(0)));
            yy = 0 + (((tickAnim - 515) / 56) * (0-(0)));
            zz = 0 + (((tickAnim - 515) / 56) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 473) {
            xx = 0 + (((tickAnim - 0) / 473) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 473) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 473) * (0-(0)));
        }
        else if (tickAnim >= 473 && tickAnim < 479) {
            xx = 0 + (((tickAnim - 473) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 473) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 473) / 6) * (0.325-(0)));
        }
        else if (tickAnim >= 479 && tickAnim < 571) {
            xx = 0 + (((tickAnim - 479) / 92) * (0-(0)));
            yy = 0 + (((tickAnim - 479) / 92) * (0-(0)));
            zz = 0.325 + (((tickAnim - 479) / 92) * (0-(0.325)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.head.rotationPointX = this.head.rotationPointX + (float)(xx);
        this.head.rotationPointY = this.head.rotationPointY - (float)(yy);
        this.head.rotationPointZ = this.head.rotationPointZ + (float)(zz);




        if (tickAnim >= 52 && tickAnim < 70) {
            xx = 0 + (((tickAnim - 52) / 18) * (0-(0)));
            yy = 0 + (((tickAnim - 52) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 52) / 18) * (0-(0)));
        }
        else if (tickAnim >= 70 && tickAnim < 80) {
            xx = 0 + (((tickAnim - 70) / 10) * (0.75-(0)));
            yy = 0 + (((tickAnim - 70) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 70) / 10) * (0-(0)));
        }
        else if (tickAnim >= 80 && tickAnim < 91) {
            xx = 0.75 + (((tickAnim - 80) / 11) * (0-(0.75)));
            yy = 0 + (((tickAnim - 80) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 80) / 11) * (0-(0)));
        }
        else if (tickAnim >= 91 && tickAnim < 455) {
            xx = 0 + (((tickAnim - 91) / 364) * (0-(0)));
            yy = 0 + (((tickAnim - 91) / 364) * (0-(0)));
            zz = 0 + (((tickAnim - 91) / 364) * (0-(0)));
        }
        else if (tickAnim >= 455 && tickAnim < 460) {
            xx = 0 + (((tickAnim - 455) / 5) * (32-(0)));
            yy = 0 + (((tickAnim - 455) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 455) / 5) * (0-(0)));
        }
        else if (tickAnim >= 460 && tickAnim < 462) {
            xx = 32 + (((tickAnim - 460) / 2) * (6.75-(32)));
            yy = 0 + (((tickAnim - 460) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 460) / 2) * (0-(0)));
        }
        else if (tickAnim >= 462 && tickAnim < 478) {
            xx = 6.75 + (((tickAnim - 462) / 16) * (6.75-(6.75)));
            yy = 0 + (((tickAnim - 462) / 16) * (0-(0)));
            zz = 0 + (((tickAnim - 462) / 16) * (0-(0)));
        }
        else if (tickAnim >= 478 && tickAnim < 485) {
            xx = 6.75 + (((tickAnim - 478) / 7) * (15.75-(6.75)));
            yy = 0 + (((tickAnim - 478) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 478) / 7) * (0-(0)));
        }
        else if (tickAnim >= 485 && tickAnim < 493) {
            xx = 15.75 + (((tickAnim - 485) / 8) * (0-(15.75)));
            yy = 0 + (((tickAnim - 485) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 485) / 8) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(xx), jaw.rotateAngleY + (float) Math.toRadians(yy), jaw.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 462) {
            xx = 0 + (((tickAnim - 0) / 462) * (27-(0)));
            yy = 0 + (((tickAnim - 0) / 462) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 462) * (0-(0)));
        }
        else if (tickAnim >= 462 && tickAnim < 485) {
            xx = 27 + (((tickAnim - 462) / 23) * (25.75-(27)));
            yy = 0 + (((tickAnim - 462) / 23) * (0-(0)));
            zz = 0 + (((tickAnim - 462) / 23) * (0-(0)));
        }
        else if (tickAnim >= 485 && tickAnim < 493) {
            xx = 25.75 + (((tickAnim - 485) / 8) * (19-(25.75)));
            yy = 0 + (((tickAnim - 485) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 485) / 8) * (0-(0)));
        }
        else if (tickAnim >= 493 && tickAnim < 571) {
            xx = 19 + (((tickAnim - 493) / 78) * (0-(19)));
            yy = 0 + (((tickAnim - 493) / 78) * (0-(0)));
            zz = 0 + (((tickAnim - 493) / 78) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(throat2, throat2.rotateAngleX + (float) Math.toRadians(xx), throat2.rotateAngleY + (float) Math.toRadians(yy), throat2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 34) {
            xx = 0 + (((tickAnim - 0) / 34) * (13.25-(0)));
            yy = 0 + (((tickAnim - 0) / 34) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 34) * (0-(0)));
        }
        else if (tickAnim >= 34 && tickAnim < 40) {
            xx = 13.25 + (((tickAnim - 34) / 6) * (15.5-(13.25)));
            yy = 0 + (((tickAnim - 34) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 34) / 6) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 455) {
            xx = 15.5 + (((tickAnim - 40) / 415) * (15.5-(15.5)));
            yy = 0 + (((tickAnim - 40) / 415) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 415) * (0-(0)));
        }
        else if (tickAnim >= 455 && tickAnim < 470) {
            xx = 15.5 + (((tickAnim - 455) / 15) * (15.5-(15.5)));
            yy = 0 + (((tickAnim - 455) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 455) / 15) * (0-(0)));
        }
        else if (tickAnim >= 470 && tickAnim < 485) {
            xx = 15.5 + (((tickAnim - 470) / 15) * (9.025-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-10-(15.5)));
            yy = 0 + (((tickAnim - 470) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 470) / 15) * (0-(0)));
        }
        else if (tickAnim >= 485 && tickAnim < 493) {
            xx = 9.025-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-10 + (((tickAnim - 485) / 8) * (15.5-(9.025-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-10)));
            yy = 0 + (((tickAnim - 485) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 485) / 8) * (0-(0)));
        }
        else if (tickAnim >= 493 && tickAnim < 553) {
            xx = 15.5 + (((tickAnim - 493) / 60) * (-4.1185-(15.5)));
            yy = 0 + (((tickAnim - 493) / 60) * (7.34394-(0)));
            zz = 0 + (((tickAnim - 493) / 60) * (-0.82484-(0)));
        }
        else if (tickAnim >= 553 && tickAnim < 571) {
            xx = -4.1185 + (((tickAnim - 553) / 18) * (0-(-4.1185)));
            yy = 7.34394 + (((tickAnim - 553) / 18) * (0-(7.34394)));
            zz = -0.82484 + (((tickAnim - 553) / 18) * (0-(-0.82484)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg1, rightLeg1.rotateAngleX + (float) Math.toRadians(xx), rightLeg1.rotateAngleY + (float) Math.toRadians(yy), rightLeg1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 17) {
            xx = 0 + (((tickAnim - 0) / 17) * (21.75-(0)));
            yy = 0 + (((tickAnim - 0) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 17) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 34) {
            xx = 21.75 + (((tickAnim - 17) / 17) * (0-(21.75)));
            yy = 0 + (((tickAnim - 17) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 17) / 17) * (0-(0)));
        }
        else if (tickAnim >= 34 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 34) / 6) * (-3.5-(0)));
            yy = 0 + (((tickAnim - 34) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 34) / 6) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 455) {
            xx = -3.5 + (((tickAnim - 40) / 415) * (-3.5-(-3.5)));
            yy = 0 + (((tickAnim - 40) / 415) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 415) * (0-(0)));
        }
        else if (tickAnim >= 455 && tickAnim < 462) {
            xx = -3.5 + (((tickAnim - 455) / 7) * (-9.5-(-3.5)));
            yy = 0 + (((tickAnim - 455) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 455) / 7) * (0-(0)));
        }
        else if (tickAnim >= 462 && tickAnim < 470) {
            xx = -9.5 + (((tickAnim - 462) / 8) * (-3.5-(-9.5)));
            yy = 0 + (((tickAnim - 462) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 462) / 8) * (0-(0)));
        }
        else if (tickAnim >= 470 && tickAnim < 485) {
            xx = -3.5 + (((tickAnim - 470) / 15) * (0.5-(-3.5)));
            yy = 0 + (((tickAnim - 470) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 470) / 15) * (0-(0)));
        }
        else if (tickAnim >= 485 && tickAnim < 493) {
            xx = 0.5 + (((tickAnim - 485) / 8) * (-3.5-(0.5)));
            yy = 0 + (((tickAnim - 485) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 485) / 8) * (0-(0)));
        }
        else if (tickAnim >= 493 && tickAnim < 516) {
            xx = -3.5 + (((tickAnim - 493) / 23) * (27.5-(-3.5)));
            yy = 0 + (((tickAnim - 493) / 23) * (0-(0)));
            zz = 0 + (((tickAnim - 493) / 23) * (0-(0)));
        }
        else if (tickAnim >= 516 && tickAnim < 538) {
            xx = 27.5 + (((tickAnim - 516) / 22) * (2.25-(27.5)));
            yy = 0 + (((tickAnim - 516) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 516) / 22) * (0-(0)));
        }
        else if (tickAnim >= 538 && tickAnim < 553) {
            xx = 2.25 + (((tickAnim - 538) / 15) * (0-(2.25)));
            yy = 0 + (((tickAnim - 538) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 538) / 15) * (0-(0)));
        }
        else if (tickAnim >= 553 && tickAnim < 571) {
            xx = 0 + (((tickAnim - 553) / 18) * (0-(0)));
            yy = 0 + (((tickAnim - 553) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 553) / 18) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg2, rightLeg2.rotateAngleX + (float) Math.toRadians(xx), rightLeg2.rotateAngleY + (float) Math.toRadians(yy), rightLeg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 553) {
            xx = 0 + (((tickAnim - 0) / 553) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 553) * (-0.55-(0)));
            zz = 0 + (((tickAnim - 0) / 553) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightLeg2.rotationPointX = this.rightLeg2.rotationPointX + (float)(xx);
        this.rightLeg2.rotationPointY = this.rightLeg2.rotationPointY - (float)(yy);
        this.rightLeg2.rotationPointZ = this.rightLeg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 17) {
            xx = 0 + (((tickAnim - 0) / 17) * (-39.38969-(0)));
            yy = 0 + (((tickAnim - 0) / 17) * (2.68341-(0)));
            zz = 0 + (((tickAnim - 0) / 17) * (6.03315-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 34) {
            xx = -39.38969 + (((tickAnim - 17) / 17) * (3-(-39.38969)));
            yy = 2.68341 + (((tickAnim - 17) / 17) * (0-(2.68341)));
            zz = 6.03315 + (((tickAnim - 17) / 17) * (0-(6.03315)));
        }
        else if (tickAnim >= 34 && tickAnim < 40) {
            xx = 3 + (((tickAnim - 34) / 6) * (0.5-(3)));
            yy = 0 + (((tickAnim - 34) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 34) / 6) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 455) {
            xx = 0.5 + (((tickAnim - 40) / 415) * (0.5-(0.5)));
            yy = 0 + (((tickAnim - 40) / 415) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 415) * (0-(0)));
        }
        else if (tickAnim >= 455 && tickAnim < 470) {
            xx = 0.5 + (((tickAnim - 455) / 15) * (0.5-(0.5)));
            yy = 0 + (((tickAnim - 455) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 455) / 15) * (0-(0)));
        }
        else if (tickAnim >= 470 && tickAnim < 485) {
            xx = 0.5 + (((tickAnim - 470) / 15) * (-1.75-(0.5)));
            yy = 0 + (((tickAnim - 470) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 470) / 15) * (0-(0)));
        }
        else if (tickAnim >= 485 && tickAnim < 493) {
            xx = -1.75 + (((tickAnim - 485) / 8) * (0.5-(-1.75)));
            yy = 0 + (((tickAnim - 485) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 485) / 8) * (0-(0)));
        }
        else if (tickAnim >= 493 && tickAnim < 516) {
            xx = 0.5 + (((tickAnim - 493) / 23) * (-46.23-(0.5)));
            yy = 0 + (((tickAnim - 493) / 23) * (0-(0)));
            zz = 0 + (((tickAnim - 493) / 23) * (0-(0)));
        }
        else if (tickAnim >= 516 && tickAnim < 526) {
            xx = -46.23 + (((tickAnim - 516) / 10) * (-46.23-(-46.23)));
            yy = 0 + (((tickAnim - 516) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 516) / 10) * (0-(0)));
        }
        else if (tickAnim >= 526 && tickAnim < 553) {
            xx = -46.23 + (((tickAnim - 526) / 27) * (-13.5-(-46.23)));
            yy = 0 + (((tickAnim - 526) / 27) * (0-(0)));
            zz = 0 + (((tickAnim - 526) / 27) * (0-(0)));
        }
        else if (tickAnim >= 553 && tickAnim < 571) {
            xx = -13.5 + (((tickAnim - 553) / 18) * (0-(-13.5)));
            yy = 0 + (((tickAnim - 553) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 553) / 18) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg3, rightLeg3.rotateAngleX + (float) Math.toRadians(xx), rightLeg3.rotateAngleY + (float) Math.toRadians(yy), rightLeg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 17) {
            xx = 0 + (((tickAnim - 0) / 17) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 17) * (1.1-(0)));
            zz = 0 + (((tickAnim - 0) / 17) * (1.85-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 34) {
            xx = 0 + (((tickAnim - 17) / 17) * (0-(0)));
            yy = 1.1 + (((tickAnim - 17) / 17) * (0-(1.1)));
            zz = 1.85 + (((tickAnim - 17) / 17) * (0-(1.85)));
        }
        else if (tickAnim >= 34 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 34) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 34) / 6) * (-0.375-(0)));
            zz = 0 + (((tickAnim - 34) / 6) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 455) {
            xx = 0 + (((tickAnim - 40) / 415) * (0-(0)));
            yy = -0.375 + (((tickAnim - 40) / 415) * (-0.375-(-0.375)));
            zz = 0 + (((tickAnim - 40) / 415) * (0-(0)));
        }
        else if (tickAnim >= 455 && tickAnim < 470) {
            xx = 0 + (((tickAnim - 455) / 15) * (0-(0)));
            yy = -0.375 + (((tickAnim - 455) / 15) * (-0.375-(-0.375)));
            zz = 0 + (((tickAnim - 455) / 15) * (0-(0)));
        }
        else if (tickAnim >= 470 && tickAnim < 493) {
            xx = 0 + (((tickAnim - 470) / 23) * (0-(0)));
            yy = -0.375 + (((tickAnim - 470) / 23) * (-0.375-(-0.375)));
            zz = 0 + (((tickAnim - 470) / 23) * (0-(0)));
        }
        else if (tickAnim >= 493 && tickAnim < 516) {
            xx = 0 + (((tickAnim - 493) / 23) * (0-(0)));
            yy = -0.375 + (((tickAnim - 493) / 23) * (0.835-(-0.375)));
            zz = 0 + (((tickAnim - 493) / 23) * (1.85-(0)));
        }
        else if (tickAnim >= 516 && tickAnim < 526) {
            xx = 0 + (((tickAnim - 516) / 10) * (0-(0)));
            yy = 0.835 + (((tickAnim - 516) / 10) * (0.835-(0.835)));
            zz = 1.85 + (((tickAnim - 516) / 10) * (1.85-(1.85)));
        }
        else if (tickAnim >= 526 && tickAnim < 553) {
            xx = 0 + (((tickAnim - 526) / 27) * (0-(0)));
            yy = 0.835 + (((tickAnim - 526) / 27) * (0.55-(0.835)));
            zz = 1.85 + (((tickAnim - 526) / 27) * (0-(1.85)));
        }
        else if (tickAnim >= 553 && tickAnim < 571) {
            xx = 0 + (((tickAnim - 553) / 18) * (0-(0)));
            yy = 0.55 + (((tickAnim - 553) / 18) * (0-(0.55)));
            zz = 0 + (((tickAnim - 553) / 18) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightLeg3.rotationPointX = this.rightLeg3.rotationPointX + (float)(xx);
        this.rightLeg3.rotationPointY = this.rightLeg3.rotationPointY - (float)(yy);
        this.rightLeg3.rotationPointZ = this.rightLeg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 17) {
            xx = 0 + (((tickAnim - 0) / 17) * (74.2-(0)));
            yy = 0 + (((tickAnim - 0) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 17) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 34) {
            xx = 74.2 + (((tickAnim - 17) / 17) * (14.75-(74.2)));
            yy = 0 + (((tickAnim - 17) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 17) / 17) * (0-(0)));
        }
        else if (tickAnim >= 34 && tickAnim < 40) {
            xx = 14.75 + (((tickAnim - 34) / 6) * (-14.75-(14.75)));
            yy = 0 + (((tickAnim - 34) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 34) / 6) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 455) {
            xx = -14.75 + (((tickAnim - 40) / 415) * (-14.75-(-14.75)));
            yy = 0 + (((tickAnim - 40) / 415) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 415) * (0-(0)));
        }
        else if (tickAnim >= 455 && tickAnim < 462) {
            xx = -14.75 + (((tickAnim - 455) / 7) * (-11.5-(-14.75)));
            yy = 0 + (((tickAnim - 455) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 455) / 7) * (0-(0)));
        }
        else if (tickAnim >= 462 && tickAnim < 470) {
            xx = -11.5 + (((tickAnim - 462) / 8) * (-14.75-(-11.5)));
            yy = 0 + (((tickAnim - 462) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 462) / 8) * (0-(0)));
        }
        else if (tickAnim >= 470 && tickAnim < 493) {
            xx = -14.75 + (((tickAnim - 470) / 23) * (-14.75-(-14.75)));
            yy = 0 + (((tickAnim - 470) / 23) * (0-(0)));
            zz = 0 + (((tickAnim - 470) / 23) * (0-(0)));
        }
        else if (tickAnim >= 493 && tickAnim < 516) {
            xx = -14.75 + (((tickAnim - 493) / 23) * (70.58-(-14.75)));
            yy = 0 + (((tickAnim - 493) / 23) * (0-(0)));
            zz = 0 + (((tickAnim - 493) / 23) * (0-(0)));
        }
        else if (tickAnim >= 516 && tickAnim < 526) {
            xx = 70.58 + (((tickAnim - 516) / 10) * (47.83-(70.58)));
            yy = 0 + (((tickAnim - 516) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 516) / 10) * (0-(0)));
        }
        else if (tickAnim >= 526 && tickAnim < 553) {
            xx = 47.83 + (((tickAnim - 526) / 27) * (18.75-(47.83)));
            yy = 0 + (((tickAnim - 526) / 27) * (0-(0)));
            zz = 0 + (((tickAnim - 526) / 27) * (0-(0)));
        }
        else if (tickAnim >= 553 && tickAnim < 571) {
            xx = 18.75 + (((tickAnim - 553) / 18) * (0-(18.75)));
            yy = 0 + (((tickAnim - 553) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 553) / 18) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightFoot, rightFoot.rotateAngleX + (float) Math.toRadians(xx), rightFoot.rotateAngleY + (float) Math.toRadians(yy), rightFoot.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 17) {
            xx = 0 + (((tickAnim - 0) / 17) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 17) * (1.375-(0)));
            zz = 0 + (((tickAnim - 0) / 17) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 34) {
            xx = 0 + (((tickAnim - 17) / 17) * (0-(0)));
            yy = 1.375 + (((tickAnim - 17) / 17) * (0-(1.375)));
            zz = 0 + (((tickAnim - 17) / 17) * (0-(0)));
        }
        else if (tickAnim >= 34 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 34) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 34) / 6) * (-0.55-(0)));
            zz = 0 + (((tickAnim - 34) / 6) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 455) {
            xx = 0 + (((tickAnim - 40) / 415) * (0-(0)));
            yy = -0.55 + (((tickAnim - 40) / 415) * (-0.55-(-0.55)));
            zz = 0 + (((tickAnim - 40) / 415) * (0-(0)));
        }
        else if (tickAnim >= 455 && tickAnim < 470) {
            xx = 0 + (((tickAnim - 455) / 15) * (0-(0)));
            yy = -0.55 + (((tickAnim - 455) / 15) * (-0.55-(-0.55)));
            zz = 0 + (((tickAnim - 455) / 15) * (0-(0)));
        }
        else if (tickAnim >= 470 && tickAnim < 493) {
            xx = 0 + (((tickAnim - 470) / 23) * (0-(0)));
            yy = -0.55 + (((tickAnim - 470) / 23) * (0.075-(-0.55)));
            zz = 0 + (((tickAnim - 470) / 23) * (0-(0)));
        }
        else if (tickAnim >= 493 && tickAnim < 516) {
            xx = 0 + (((tickAnim - 493) / 23) * (0-(0)));
            yy = 0.075 + (((tickAnim - 493) / 23) * (1.3-(0.075)));
            zz = 0 + (((tickAnim - 493) / 23) * (-0.5-(0)));
        }
        else if (tickAnim >= 516 && tickAnim < 526) {
            xx = 0 + (((tickAnim - 516) / 10) * (0-(0)));
            yy = 1.3 + (((tickAnim - 516) / 10) * (1.3-(1.3)));
            zz = -0.5 + (((tickAnim - 516) / 10) * (-0.5-(-0.5)));
        }
        else if (tickAnim >= 526 && tickAnim < 553) {
            xx = 0 + (((tickAnim - 526) / 27) * (0-(0)));
            yy = 1.3 + (((tickAnim - 526) / 27) * (-0.7-(1.3)));
            zz = -0.5 + (((tickAnim - 526) / 27) * (0-(-0.5)));
        }
        else if (tickAnim >= 553 && tickAnim < 571) {
            xx = 0 + (((tickAnim - 553) / 18) * (0-(0)));
            yy = -0.7 + (((tickAnim - 553) / 18) * (0-(-0.7)));
            zz = 0 + (((tickAnim - 553) / 18) * (0-(0)));
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
            xx = 0 + (((tickAnim - 0) / 7) * (-5.23-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 17) {
            xx = -5.23 + (((tickAnim - 7) / 10) * (27.54-(-5.23)));
            yy = 0 + (((tickAnim - 7) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 10) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 34) {
            xx = 27.54 + (((tickAnim - 17) / 17) * (-33.75-(27.54)));
            yy = 0 + (((tickAnim - 17) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 17) / 17) * (0-(0)));
        }
        else if (tickAnim >= 34 && tickAnim < 40) {
            xx = -33.75 + (((tickAnim - 34) / 6) * (0-(-33.75)));
            yy = 0 + (((tickAnim - 34) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 34) / 6) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 493) {
            xx = 0 + (((tickAnim - 40) / 453) * (0-(0)));
            yy = 0 + (((tickAnim - 40) / 453) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 453) * (0-(0)));
        }
        else if (tickAnim >= 493 && tickAnim < 516) {
            xx = 0 + (((tickAnim - 493) / 23) * (28.5-(0)));
            yy = 0 + (((tickAnim - 493) / 23) * (0-(0)));
            zz = 0 + (((tickAnim - 493) / 23) * (0-(0)));
        }
        else if (tickAnim >= 516 && tickAnim < 526) {
            xx = 28.5 + (((tickAnim - 516) / 10) * (28.5-(28.5)));
            yy = 0 + (((tickAnim - 516) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 516) / 10) * (0-(0)));
        }
        else if (tickAnim >= 526 && tickAnim < 553) {
            xx = 28.5 + (((tickAnim - 526) / 27) * (0-(28.5)));
            yy = 0 + (((tickAnim - 526) / 27) * (0-(0)));
            zz = 0 + (((tickAnim - 526) / 27) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightToes, rightToes.rotateAngleX + (float) Math.toRadians(xx), rightToes.rotateAngleY + (float) Math.toRadians(yy), rightToes.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 34) {
            xx = 0 + (((tickAnim - 0) / 34) * (11.5-(0)));
            yy = 0 + (((tickAnim - 0) / 34) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 34) * (0-(0)));
        }
        else if (tickAnim >= 34 && tickAnim < 485) {
            xx = 11.5 + (((tickAnim - 34) / 451) * (11.5-(11.5)));
            yy = 0 + (((tickAnim - 34) / 451) * (0-(0)));
            zz = 0 + (((tickAnim - 34) / 451) * (0-(0)));
        }
        else if (tickAnim >= 485 && tickAnim < 585) {
            xx = 11.5 + (((tickAnim - 485) / 100) * (0-(11.5)));
            yy = 0 + (((tickAnim - 485) / 100) * (0-(0)));
            zz = 0 + (((tickAnim - 485) / 100) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm1, rightArm1.rotateAngleX + (float) Math.toRadians(xx), rightArm1.rotateAngleY + (float) Math.toRadians(yy), rightArm1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 34) {
            xx = 0 + (((tickAnim - 0) / 34) * (-21.25-(0)));
            yy = 0 + (((tickAnim - 0) / 34) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 34) * (0-(0)));
        }
        else if (tickAnim >= 34 && tickAnim < 485) {
            xx = -21.25 + (((tickAnim - 34) / 451) * (-21.25-(-21.25)));
            yy = 0 + (((tickAnim - 34) / 451) * (0-(0)));
            zz = 0 + (((tickAnim - 34) / 451) * (0-(0)));
        }
        else if (tickAnim >= 485 && tickAnim < 585) {
            xx = -21.25 + (((tickAnim - 485) / 100) * (0-(-21.25)));
            yy = 0 + (((tickAnim - 485) / 100) * (0-(0)));
            zz = 0 + (((tickAnim - 485) / 100) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm2, rightArm2.rotateAngleX + (float) Math.toRadians(xx), rightArm2.rotateAngleY + (float) Math.toRadians(yy), rightArm2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 34) {
            xx = 0 + (((tickAnim - 0) / 34) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 34) * (1.05-(0)));
            zz = 0 + (((tickAnim - 0) / 34) * (1.125-(0)));
        }
        else if (tickAnim >= 34 && tickAnim < 485) {
            xx = 0 + (((tickAnim - 34) / 451) * (0-(0)));
            yy = 1.05 + (((tickAnim - 34) / 451) * (1.05-(1.05)));
            zz = 1.125 + (((tickAnim - 34) / 451) * (1.125-(1.125)));
        }
        else if (tickAnim >= 485 && tickAnim < 585) {
            xx = 0 + (((tickAnim - 485) / 100) * (0-(0)));
            yy = 1.05 + (((tickAnim - 485) / 100) * (0-(1.05)));
            zz = 1.125 + (((tickAnim - 485) / 100) * (0-(1.125)));
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
            xx = 0 + (((tickAnim - 0) / 18) * (-1.92077-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (-20.1785-Math.sin((Math.PI/180)*(((double)tickAnim/20)*70-50))*10-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (4.08494-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 25) {
            xx = -1.92077 + (((tickAnim - 18) / 7) * (0-(-1.92077)));
            yy = -20.1785-Math.sin((Math.PI/180)*(((double)tickAnim/20)*70-50))*10 + (((tickAnim - 18) / 7) * (-31.035-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-50))*-50-(-20.1785-Math.sin((Math.PI/180)*(((double)tickAnim/20)*70-50))*10)));
            zz = 4.08494 + (((tickAnim - 18) / 7) * (0-(4.08494)));
        }
        else if (tickAnim >= 25 && tickAnim < 51) {
            xx = 0 + (((tickAnim - 25) / 26) * (0-(0)));
            yy = -31.035-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-50))*-50 + (((tickAnim - 25) / 26) * (5-(-31.035-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-50))*-50)));
            zz = 0 + (((tickAnim - 25) / 26) * (0-(0)));
        }
        else if (tickAnim >= 51 && tickAnim < 455) {
            xx = 0 + (((tickAnim - 51) / 404) * (0-(0)));
            yy = 5 + (((tickAnim - 51) / 404) * (5-(5)));
            zz = 0 + (((tickAnim - 51) / 404) * (0-(0)));
        }
        else if (tickAnim >= 455 && tickAnim < 458) {
            xx = 0 + (((tickAnim - 455) / 3) * (-0.49658-(0)));
            yy = 5 + (((tickAnim - 455) / 3) * (10.36245-(5)));
            zz = 0 + (((tickAnim - 455) / 3) * (-2.13908-(0)));
        }
        else if (tickAnim >= 458 && tickAnim < 462) {
            xx = -0.49658 + (((tickAnim - 458) / 4) * (-0.34826-(-0.49658)));
            yy = 10.36245 + (((tickAnim - 458) / 4) * (21.35162-(10.36245)));
            zz = -2.13908 + (((tickAnim - 458) / 4) * (-2.30304-(-2.13908)));
        }
        else if (tickAnim >= 462 && tickAnim < 473) {
            xx = -0.34826 + (((tickAnim - 462) / 11) * (-0.64708-(-0.34826)));
            yy = 21.35162 + (((tickAnim - 462) / 11) * (-12.20701-(21.35162)));
            zz = -2.30304 + (((tickAnim - 462) / 11) * (2.96478-(-2.30304)));
        }
        else if (tickAnim >= 473 && tickAnim < 485) {
            xx = -0.64708 + (((tickAnim - 473) / 12) * (2.35292-(-0.64708)));
            yy = -12.20701 + (((tickAnim - 473) / 12) * (-12.20701-(-12.20701)));
            zz = 2.96478 + (((tickAnim - 473) / 12) * (2.96478-(2.96478)));
        }
        else if (tickAnim >= 485 && tickAnim < 571) {
            xx = 2.35292 + (((tickAnim - 485) / 86) * (0-(2.35292)));
            yy = -12.20701 + (((tickAnim - 485) / 86) * (0-(-12.20701)));
            zz = 2.96478 + (((tickAnim - 485) / 86) * (0-(2.96478)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail7, tail7.rotateAngleX + (float) Math.toRadians(xx), tail7.rotateAngleY + (float) Math.toRadians(yy), tail7.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 34) {
            xx = 0 + (((tickAnim - 0) / 34) * (25-(0)));
            yy = 0 + (((tickAnim - 0) / 34) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 34) * (0-(0)));
        }
        else if (tickAnim >= 34 && tickAnim < 485) {
            xx = 25 + (((tickAnim - 34) / 451) * (25-(25)));
            yy = 0 + (((tickAnim - 34) / 451) * (0-(0)));
            zz = 0 + (((tickAnim - 34) / 451) * (0-(0)));
        }
        else if (tickAnim >= 485 && tickAnim < 585) {
            xx = 25 + (((tickAnim - 485) / 100) * (0-(25)));
            yy = 0 + (((tickAnim - 485) / 100) * (0-(0)));
            zz = 0 + (((tickAnim - 485) / 100) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm3, rightArm3.rotateAngleX + (float) Math.toRadians(xx), rightArm3.rotateAngleY + (float) Math.toRadians(yy), rightArm3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 34) {
            xx = 0 + (((tickAnim - 0) / 34) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 34) * (0.7-(0)));
            zz = 0 + (((tickAnim - 0) / 34) * (0-(0)));
        }
        else if (tickAnim >= 34 && tickAnim < 485) {
            xx = 0 + (((tickAnim - 34) / 451) * (0-(0)));
            yy = 0.7 + (((tickAnim - 34) / 451) * (0.7-(0.7)));
            zz = 0 + (((tickAnim - 34) / 451) * (0-(0)));
        }
        else if (tickAnim >= 485 && tickAnim < 585) {
            xx = 0 + (((tickAnim - 485) / 100) * (0-(0)));
            yy = 0.7 + (((tickAnim - 485) / 100) * (0-(0.7)));
            zz = 0 + (((tickAnim - 485) / 100) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightArm3.rotationPointX = this.rightArm3.rotationPointX + (float)(xx);
        this.rightArm3.rotationPointY = this.rightArm3.rotationPointY - (float)(yy);
        this.rightArm3.rotationPointZ = this.rightArm3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 485) {
            xx = 0 + (((tickAnim - 0) / 485) * (-14.75-(0)));
            yy = 0 + (((tickAnim - 0) / 485) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 485) * (0-(0)));
        }
        else if (tickAnim >= 485 && tickAnim < 493) {
            xx = -14.75 + (((tickAnim - 485) / 8) * (-7.25-(-14.75)));
            yy = 0 + (((tickAnim - 485) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 485) / 8) * (0-(0)));
        }
        else if (tickAnim >= 493 && tickAnim < 571) {
            xx = -7.25 + (((tickAnim - 493) / 78) * (0-(-7.25)));
            yy = 0 + (((tickAnim - 493) / 78) * (0-(0)));
            zz = 0 + (((tickAnim - 493) / 78) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(throat1, throat1.rotateAngleX + (float) Math.toRadians(xx), throat1.rotateAngleY + (float) Math.toRadians(yy), throat1.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 485) {
            xx = 0 + (((tickAnim - 0) / 485) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 485) * (-0.625-(0)));
            zz = 0 + (((tickAnim - 0) / 485) * (2.45-(0)));
        }
        else if (tickAnim >= 485 && tickAnim < 493) {
            xx = 0 + (((tickAnim - 485) / 8) * (0-(0)));
            yy = -0.625 + (((tickAnim - 485) / 8) * (0-(-0.625)));
            zz = 2.45 + (((tickAnim - 485) / 8) * (0-(2.45)));
        }
        else if (tickAnim >= 493 && tickAnim < 571) {
            xx = 0 + (((tickAnim - 493) / 78) * (0-(0)));
            yy = 0 + (((tickAnim - 493) / 78) * (0-(0)));
            zz = 0 + (((tickAnim - 493) / 78) * (0-(0)));
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
    public void animWalking(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraSpinosaurus entity = (EntityPrehistoricFloraSpinosaurus) entitylivingbaseIn;
        int animCycle = 42;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        this.setRotateAngle(hips, hips.rotateAngleX + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*339-80))*-1.15), hips.rotateAngleY + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*169-80))*-0.2), hips.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*169-20))*0.59));

        if (tickAnim >= 0 && tickAnim < 5) {
            xx = -0-Math.sin((Math.PI/180)*(((double)tickAnim/20)*169))*-0.05 + (((tickAnim - 0) / 5) * (-0-Math.sin((Math.PI/180)*(((double)tickAnim/20)*169))*-0.05-(-0-Math.sin((Math.PI/180)*(((double)tickAnim/20)*169))*-0.05)));
            yy = 0.025+Math.sin((Math.PI/180)*(((double)tickAnim/20)*339/0.3-20))*-0.09 + (((tickAnim - 0) / 5) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*339-20))*-0.19-(0.025+Math.sin((Math.PI/180)*(((double)tickAnim/20)*339/0.3-20))*-0.09)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*339-55))*-0.5 + (((tickAnim - 0) / 5) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*339-55))*-0.5-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*339-55))*-0.5)));
        }
        else if (tickAnim >= 5 && tickAnim < 23) {
            xx = -0-Math.sin((Math.PI/180)*(((double)tickAnim/20)*169))*-0.05 + (((tickAnim - 5) / 18) * (-0-Math.sin((Math.PI/180)*(((double)tickAnim/20)*169))*-0.05-(-0-Math.sin((Math.PI/180)*(((double)tickAnim/20)*169))*-0.05)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*339-20))*-0.19 + (((tickAnim - 5) / 18) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*339-20))*-0.19-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*339-20))*-0.19)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*339-55))*-0.5 + (((tickAnim - 5) / 18) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*339-55))*-0.5-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*339-55))*-0.5)));
        }
        else if (tickAnim >= 23 && tickAnim < 28) {
            xx = -0-Math.sin((Math.PI/180)*(((double)tickAnim/20)*169))*-0.05 + (((tickAnim - 23) / 5) * (-0-Math.sin((Math.PI/180)*(((double)tickAnim/20)*169))*-0.05-(-0-Math.sin((Math.PI/180)*(((double)tickAnim/20)*169))*-0.05)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*339-20))*-0.19 + (((tickAnim - 23) / 5) * (-0.2+Math.sin((Math.PI/180)*(((double)tickAnim/20)*339/0.5-20))*-0.09-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*339-20))*-0.19)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*339-55))*-0.5 + (((tickAnim - 23) / 5) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*339-55))*-0.5-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*339-55))*-0.5)));
        }
        else if (tickAnim >= 28 && tickAnim < 28) {
            xx = -0-Math.sin((Math.PI/180)*(((double)tickAnim/20)*169))*-0.05 + (((tickAnim - 28) / 0) * (-0-Math.sin((Math.PI/180)*(((double)tickAnim/20)*169))*-0.05-(-0-Math.sin((Math.PI/180)*(((double)tickAnim/20)*169))*-0.05)));
            yy = -0.2+Math.sin((Math.PI/180)*(((double)tickAnim/20)*339/0.5-20))*-0.09 + (((tickAnim - 28) / 0) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*339-20))*-0.19-(-0.2+Math.sin((Math.PI/180)*(((double)tickAnim/20)*339/0.5-20))*-0.09)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*339-55))*-0.5 + (((tickAnim - 28) / 0) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*339-55))*-0.5-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*339-55))*-0.5)));
        }
        else if (tickAnim >= 28 && tickAnim < 43) {
            xx = -0-Math.sin((Math.PI/180)*(((double)tickAnim/20)*169))*-0.05 + (((tickAnim - 28) / 15) * (-0-Math.sin((Math.PI/180)*(((double)tickAnim/20)*169))*-0.05-(-0-Math.sin((Math.PI/180)*(((double)tickAnim/20)*169))*-0.05)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*339-20))*-0.19 + (((tickAnim - 28) / 15) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*339-20))*-0.19-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*339-20))*-0.19)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*339-55))*-0.5 + (((tickAnim - 28) / 15) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*339-55))*-0.5-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*339-55))*-0.5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.hips.rotationPointX = this.hips.rotationPointX + (float)(xx);
        this.hips.rotationPointY = this.hips.rotationPointY - (float)(yy);
        this.hips.rotationPointZ = this.hips.rotationPointZ + (float)(zz);



        this.setRotateAngle(sailEnd, sailEnd.rotateAngleX + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*339-80))*1.1), sailEnd.rotateAngleY + (float) Math.toRadians(0), sailEnd.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*169-200))*0.59));



        if (tickAnim >= 0 && tickAnim < 20) {
            xx = -11.44441 + (((tickAnim - 0) / 20) * (14.17578-(-11.44441)));
            yy = -7.09013 + (((tickAnim - 0) / 20) * (-1.74925-(-7.09013)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 32) {
            xx = 14.17578 + (((tickAnim - 20) / 12) * (67.7-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-20))*80-(14.17578)));
            yy = -1.74925 + (((tickAnim - 20) / 12) * (-3.54507-(-1.74925)));
            zz = 0 + (((tickAnim - 20) / 12) * (0-(0)));
        }
        else if (tickAnim >= 32 && tickAnim < 43) {
            xx = 67.7-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-20))*80 + (((tickAnim - 32) / 11) * (-11.44441-(67.7-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-20))*80)));
            yy = -3.54507 + (((tickAnim - 32) / 11) * (-7.09013-(-3.54507)));
            zz = 0 + (((tickAnim - 32) / 11) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg1, leftLeg1.rotateAngleX + (float) Math.toRadians(xx), leftLeg1.rotateAngleY + (float) Math.toRadians(yy), leftLeg1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = -5.5 + (((tickAnim - 0) / 7) * (-2.31-(-5.5)));
            yy = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 22) {
            xx = -2.31 + (((tickAnim - 7) / 15) * (4-(-2.31)));
            yy = 0 + (((tickAnim - 7) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 15) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 32) {
            xx = 4 + (((tickAnim - 22) / 10) * (-85.205-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+30))*-110-(4)));
            yy = 0 + (((tickAnim - 22) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 22) / 10) * (0-(0)));
        }
        else if (tickAnim >= 32 && tickAnim < 43) {
            xx = -85.205-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+30))*-110 + (((tickAnim - 32) / 11) * (-5.5-(-85.205-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+30))*-110)));
            yy = 0 + (((tickAnim - 32) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 32) / 11) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg2, leftLeg2.rotateAngleX + (float) Math.toRadians(xx), leftLeg2.rotateAngleY + (float) Math.toRadians(yy), leftLeg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            yy = 0.275 + (((tickAnim - 0) / 7) * (-0.25-(0.275)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 22) {
            xx = 0 + (((tickAnim - 7) / 15) * (0-(0)));
            yy = -0.25 + (((tickAnim - 7) / 15) * (-0.525-(-0.25)));
            zz = 0 + (((tickAnim - 7) / 15) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 43) {
            xx = 0 + (((tickAnim - 22) / 21) * (0-(0)));
            yy = -0.525 + (((tickAnim - 22) / 21) * (0.275-(-0.525)));
            zz = 0 + (((tickAnim - 22) / 21) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftLeg2.rotationPointX = this.leftLeg2.rotationPointX + (float)(xx);
        this.leftLeg2.rotationPointY = this.leftLeg2.rotationPointY - (float)(yy);
        this.leftLeg2.rotationPointZ = this.leftLeg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 11.55-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*30 + (((tickAnim - 0) / 7) * (-10.37-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-10-(11.55-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*30)));
            yy = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 20) {
            xx = -10.37-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-10 + (((tickAnim - 7) / 13) * (-7.5-(-10.37-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-10)));
            yy = 0 + (((tickAnim - 7) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 13) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 31) {
            xx = -7.5 + (((tickAnim - 20) / 11) * (-42.03-(-7.5)));
            yy = 0 + (((tickAnim - 20) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 11) * (0-(0)));
        }
        else if (tickAnim >= 31 && tickAnim < 37) {
            xx = -42.03 + (((tickAnim - 31) / 6) * (-51.78-(-42.03)));
            yy = 0 + (((tickAnim - 31) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 31) / 6) * (0-(0)));
        }
        else if (tickAnim >= 37 && tickAnim < 43) {
            xx = -51.78 + (((tickAnim - 37) / 6) * (11.55-(-51.78)));
            yy = 0 + (((tickAnim - 37) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 37) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg3, leftLeg3.rotateAngleX + (float) Math.toRadians(xx), leftLeg3.rotateAngleY + (float) Math.toRadians(yy), leftLeg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            yy = -0.475+Math.sin((Math.PI/180)*(((double)tickAnim/20)*550/0.29))*0.02 + (((tickAnim - 0) / 7) * (0.23-(-0.475+Math.sin((Math.PI/180)*(((double)tickAnim/20)*550/0.29))*0.02)));
            zz = -0.475 + (((tickAnim - 0) / 7) * (-0.4-(-0.475)));
        }
        else if (tickAnim >= 7 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 7) / 13) * (0-(0)));
            yy = 0.23 + (((tickAnim - 7) / 13) * (0-(0.23)));
            zz = -0.4 + (((tickAnim - 7) / 13) * (0-(-0.4)));
        }
        else if (tickAnim >= 20 && tickAnim < 31) {
            xx = 0 + (((tickAnim - 20) / 11) * (0-(0)));
            yy = 0 + (((tickAnim - 20) / 11) * (0.645-(0)));
            zz = 0 + (((tickAnim - 20) / 11) * (1.78-(0)));
        }
        else if (tickAnim >= 31 && tickAnim < 37) {
            xx = 0 + (((tickAnim - 31) / 6) * (0-(0)));
            yy = 0.645 + (((tickAnim - 31) / 6) * (0.645-(0.645)));
            zz = 1.78 + (((tickAnim - 31) / 6) * (1.78-(1.78)));
        }
        else if (tickAnim >= 37 && tickAnim < 43) {
            xx = 0 + (((tickAnim - 37) / 6) * (0-(0)));
            yy = 0.645 + (((tickAnim - 37) / 6) * (-0.475+Math.sin((Math.PI/180)*(((double)tickAnim/20)*550/0.29))*0.02-(0.645)));
            zz = 1.78 + (((tickAnim - 37) / 6) * (-0.475-(1.78)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftLeg3.rotationPointX = this.leftLeg3.rotationPointX + (float)(xx);
        this.leftLeg3.rotationPointY = this.leftLeg3.rotationPointY - (float)(yy);
        this.leftLeg3.rotationPointZ = this.leftLeg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 7.0077-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-30 + (((tickAnim - 0) / 7) * (16.101-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*10-(7.0077-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-30)));
            yy = -0.00597 + (((tickAnim - 0) / 7) * (0-(-0.00597)));
            zz = 0.56826 + (((tickAnim - 0) / 7) * (0-(0.56826)));
        }
        else if (tickAnim >= 7 && tickAnim < 12) {
            xx = 16.101-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*10 + (((tickAnim - 7) / 5) * (4.12443-(16.101-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*10)));
            yy = 0 + (((tickAnim - 7) / 5) * (-0.22328-(0)));
            zz = 0 + (((tickAnim - 7) / 5) * (-0.64373-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 20) {
            xx = 4.12443 + (((tickAnim - 12) / 8) * (51.5-(4.12443)));
            yy = -0.22328 + (((tickAnim - 12) / 8) * (0-(-0.22328)));
            zz = -0.64373 + (((tickAnim - 12) / 8) * (0-(-0.64373)));
        }
        else if (tickAnim >= 20 && tickAnim < 31) {
            xx = 51.5 + (((tickAnim - 20) / 11) * (77.64483-(51.5)));
            yy = 0 + (((tickAnim - 20) / 11) * (-0.62393-(0)));
            zz = 0 + (((tickAnim - 20) / 11) * (0.96116-(0)));
        }
        else if (tickAnim >= 31 && tickAnim < 37) {
            xx = 77.64483 + (((tickAnim - 31) / 6) * (71.39483-(77.64483)));
            yy = -0.62393 + (((tickAnim - 31) / 6) * (-0.62393-(-0.62393)));
            zz = 0.96116 + (((tickAnim - 31) / 6) * (0.96116-(0.96116)));
        }
        else if (tickAnim >= 37 && tickAnim < 39) {
            xx = 71.39483 + (((tickAnim - 37) / 2) * (47.83432-(71.39483)));
            yy = -0.62393 + (((tickAnim - 37) / 2) * (0.48954-(-0.62393)));
            zz = 0.96116 + (((tickAnim - 37) / 2) * (-0.79987-(0.96116)));
        }
        else if (tickAnim >= 39 && tickAnim < 43) {
            xx = 47.83432 + (((tickAnim - 39) / 4) * (7.0077-(47.83432)));
            yy = 0.48954 + (((tickAnim - 39) / 4) * (-0.00597-(0.48954)));
            zz = -0.79987 + (((tickAnim - 39) / 4) * (0.56826-(-0.79987)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftFoot, leftFoot.rotateAngleX + (float) Math.toRadians(xx), leftFoot.rotateAngleY + (float) Math.toRadians(yy), leftFoot.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            yy = 0.2 + (((tickAnim - 0) / 7) * (-0.15-(0.2)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 7) / 5) * (0-(0)));
            yy = -0.15 + (((tickAnim - 7) / 5) * (0.3-(-0.15)));
            zz = 0 + (((tickAnim - 7) / 5) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 17) {
            xx = 0 + (((tickAnim - 12) / 5) * (0-(0)));
            yy = 0.3 + (((tickAnim - 12) / 5) * (1.095-(0.3)));
            zz = 0 + (((tickAnim - 12) / 5) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 17) / 3) * (0-(0)));
            yy = 1.095 + (((tickAnim - 17) / 3) * (0.5-(1.095)));
            zz = 0 + (((tickAnim - 17) / 3) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 20) / 5) * (0-(0)));
            yy = 0.5 + (((tickAnim - 20) / 5) * (2-(0.5)));
            zz = 0 + (((tickAnim - 20) / 5) * (-0.19-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 31) {
            xx = 0 + (((tickAnim - 25) / 6) * (0-(0)));
            yy = 2 + (((tickAnim - 25) / 6) * (1.09-(2)));
            zz = -0.19 + (((tickAnim - 25) / 6) * (-0.425-(-0.19)));
        }
        else if (tickAnim >= 31 && tickAnim < 37) {
            xx = 0 + (((tickAnim - 31) / 6) * (0-(0)));
            yy = 1.09 + (((tickAnim - 31) / 6) * (1.09-(1.09)));
            zz = -0.425 + (((tickAnim - 31) / 6) * (-0.425-(-0.425)));
        }
        else if (tickAnim >= 37 && tickAnim < 43) {
            xx = 0 + (((tickAnim - 37) / 6) * (0-(0)));
            yy = 1.09 + (((tickAnim - 37) / 6) * (0.2-(1.09)));
            zz = -0.425 + (((tickAnim - 37) / 6) * (0-(-0.425)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftFoot.rotationPointX = this.leftFoot.rotationPointX + (float)(xx);
        this.leftFoot.rotationPointY = this.leftFoot.rotationPointY - (float)(yy);
        this.leftFoot.rotationPointZ = this.leftFoot.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 0) / 12) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 12) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 12) / 8) * (-61.25-(0)));
            yy = 0 + (((tickAnim - 12) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 8) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 24) {
            xx = -61.25 + (((tickAnim - 20) / 4) * (-17.25-(-61.25)));
            yy = 0 + (((tickAnim - 20) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 4) * (0-(0)));
        }
        else if (tickAnim >= 24 && tickAnim < 31) {
            xx = -17.25 + (((tickAnim - 24) / 7) * (18.75-(-17.25)));
            yy = 0 + (((tickAnim - 24) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 24) / 7) * (0-(0)));
        }
        else if (tickAnim >= 31 && tickAnim < 37) {
            xx = 18.75 + (((tickAnim - 31) / 6) * (35.75-(18.75)));
            yy = 0 + (((tickAnim - 31) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 31) / 6) * (0-(0)));
        }
        else if (tickAnim >= 37 && tickAnim < 43) {
            xx = 35.75 + (((tickAnim - 37) / 6) * (0-(35.75)));
            yy = 0 + (((tickAnim - 37) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 37) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftToes, leftToes.rotateAngleX + (float) Math.toRadians(xx), leftToes.rotateAngleY + (float) Math.toRadians(yy), leftToes.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 0) / 12) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 12) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 12) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 12) / 8) * (-0.175-(0)));
            zz = 0 + (((tickAnim - 12) / 8) * (0.225-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 24) {
            xx = 0 + (((tickAnim - 20) / 4) * (0-(0)));
            yy = -0.175 + (((tickAnim - 20) / 4) * (0-(-0.175)));
            zz = 0.225 + (((tickAnim - 20) / 4) * (0-(0.225)));
        }
        else if (tickAnim >= 24 && tickAnim < 31) {
            xx = 0 + (((tickAnim - 24) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 24) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 24) / 7) * (0.825-(0)));
        }
        else if (tickAnim >= 31 && tickAnim < 37) {
            xx = 0 + (((tickAnim - 31) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 31) / 6) * (0-(0)));
            zz = 0.825 + (((tickAnim - 31) / 6) * (0.175-(0.825)));
        }
        else if (tickAnim >= 37 && tickAnim < 43) {
            xx = 0 + (((tickAnim - 37) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 37) / 6) * (0-(0)));
            zz = 0.175 + (((tickAnim - 37) / 6) * (0-(0.175)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftToes.rotationPointX = this.leftToes.rotationPointX + (float)(xx);
        this.leftToes.rotationPointY = this.leftToes.rotationPointY - (float)(yy);
        this.leftToes.rotationPointZ = this.leftToes.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 12) {
            xx = 14.17578 + (((tickAnim - 0) / 12) * (20.875-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*40-(14.17578)));
            yy = 1.74925 + (((tickAnim - 0) / 12) * (3.54507-(1.74925)));
            zz = 0 + (((tickAnim - 0) / 12) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 23) {
            xx = 20.875-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*40 + (((tickAnim - 12) / 11) * (-11.44441-(20.875-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*40)));
            yy = 3.54507 + (((tickAnim - 12) / 11) * (7.09013-(3.54507)));
            zz = 0 + (((tickAnim - 12) / 11) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 43) {
            xx = -11.44441 + (((tickAnim - 23) / 20) * (14.17578-(-11.44441)));
            yy = 7.09013 + (((tickAnim - 23) / 20) * (1.74925-(7.09013)));
            zz = 0 + (((tickAnim - 23) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg1, rightLeg1.rotateAngleX + (float) Math.toRadians(xx), rightLeg1.rotateAngleY + (float) Math.toRadians(yy), rightLeg1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 11) {
            xx = 4 + (((tickAnim - 0) / 11) * (-87.88-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-100))*110-(4)));
            yy = 0 + (((tickAnim - 0) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 11) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 23) {
            xx = -87.88-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-100))*110 + (((tickAnim - 11) / 12) * (-5.5-(-87.88-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-100))*110)));
            yy = 0 + (((tickAnim - 11) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 12) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 43) {
            xx = -5.5 + (((tickAnim - 23) / 20) * (4-(-5.5)));
            yy = 0 + (((tickAnim - 23) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg2, rightLeg2.rotateAngleX + (float) Math.toRadians(xx), rightLeg2.rotateAngleY + (float) Math.toRadians(yy), rightLeg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 11) {
            xx = -7.5 + (((tickAnim - 0) / 11) * (-42.03-(-7.5)));
            yy = 0 + (((tickAnim - 0) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 11) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 17) {
            xx = -42.03 + (((tickAnim - 11) / 6) * (-51.78-(-42.03)));
            yy = 0 + (((tickAnim - 11) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 6) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 23) {
            xx = -51.78 + (((tickAnim - 17) / 6) * (15.975-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-50))*50-(-51.78)));
            yy = 0 + (((tickAnim - 17) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 17) / 6) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 29) {
            xx = 15.975-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-50))*50 + (((tickAnim - 23) / 6) * (-15.07-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-10-(15.975-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-50))*50)));
            yy = 0 + (((tickAnim - 23) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 6) * (0-(0)));
        }
        else if (tickAnim >= 29 && tickAnim < 43) {
            xx = -15.07-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-10 + (((tickAnim - 29) / 14) * (-7.5-(-15.07-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-10)));
            yy = 0 + (((tickAnim - 29) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 29) / 14) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg3, rightLeg3.rotateAngleX + (float) Math.toRadians(xx), rightLeg3.rotateAngleY + (float) Math.toRadians(yy), rightLeg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 0) / 11) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 11) * (0.645-(0)));
            zz = 0 + (((tickAnim - 0) / 11) * (1.78-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 17) {
            xx = 0 + (((tickAnim - 11) / 6) * (0-(0)));
            yy = 0.645 + (((tickAnim - 11) / 6) * (0.645-(0.645)));
            zz = 1.78 + (((tickAnim - 11) / 6) * (1.78-(1.78)));
        }
        else if (tickAnim >= 17 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 17) / 6) * (0-(0)));
            yy = 0.645 + (((tickAnim - 17) / 6) * (-0.475+Math.sin((Math.PI/180)*(((double)tickAnim/20)*550/0.29))*0.02-(0.645)));
            zz = 1.78 + (((tickAnim - 17) / 6) * (-0.475-(1.78)));
        }
        else if (tickAnim >= 23 && tickAnim < 29) {
            xx = 0 + (((tickAnim - 23) / 6) * (0-(0)));
            yy = -0.475+Math.sin((Math.PI/180)*(((double)tickAnim/20)*550/0.29))*0.02 + (((tickAnim - 23) / 6) * (0.23-(-0.475+Math.sin((Math.PI/180)*(((double)tickAnim/20)*550/0.29))*0.02)));
            zz = -0.475 + (((tickAnim - 23) / 6) * (-0.4-(-0.475)));
        }
        else if (tickAnim >= 29 && tickAnim < 43) {
            xx = 0 + (((tickAnim - 29) / 14) * (0-(0)));
            yy = 0.23 + (((tickAnim - 29) / 14) * (0-(0.23)));
            zz = -0.4 + (((tickAnim - 29) / 14) * (0-(-0.4)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightLeg3.rotationPointX = this.rightLeg3.rotationPointX + (float)(xx);
        this.rightLeg3.rotationPointY = this.rightLeg3.rotationPointY - (float)(yy);
        this.rightLeg3.rotationPointZ = this.rightLeg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 11) {
            xx = 51.5 + (((tickAnim - 0) / 11) * (77.64483-(51.5)));
            yy = 0 + (((tickAnim - 0) / 11) * (-0.62393-(0)));
            zz = 0 + (((tickAnim - 0) / 11) * (0.96116-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 17) {
            xx = 77.64483 + (((tickAnim - 11) / 6) * (71.39483-(77.64483)));
            yy = -0.62393 + (((tickAnim - 11) / 6) * (-0.62393-(-0.62393)));
            zz = 0.96116 + (((tickAnim - 11) / 6) * (0.96116-(0.96116)));
        }
        else if (tickAnim >= 17 && tickAnim < 19) {
            xx = 71.39483 + (((tickAnim - 17) / 2) * (47.83432-(71.39483)));
            yy = -0.62393 + (((tickAnim - 17) / 2) * (0.48954-(-0.62393)));
            zz = 0.96116 + (((tickAnim - 17) / 2) * (-0.79987-(0.96116)));
        }
        else if (tickAnim >= 19 && tickAnim < 23) {
            xx = 47.83432 + (((tickAnim - 19) / 4) * (1.6827-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-50))*-50-(47.83432)));
            yy = 0.48954 + (((tickAnim - 19) / 4) * (-0.00597-(0.48954)));
            zz = -0.79987 + (((tickAnim - 19) / 4) * (0.56826-(-0.79987)));
        }
        else if (tickAnim >= 23 && tickAnim < 29) {
            xx = 1.6827-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-50))*-50 + (((tickAnim - 23) / 6) * (21.1103-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*10-(1.6827-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-50))*-50)));
            yy = -0.00597 + (((tickAnim - 23) / 6) * (-0.49048-(-0.00597)));
            zz = 0.56826 + (((tickAnim - 23) / 6) * (0.41674-(0.56826)));
        }
        else if (tickAnim >= 29 && tickAnim < 34) {
            xx = 21.1103-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*10 + (((tickAnim - 29) / 5) * (4.12443-(21.1103-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*10)));
            yy = -0.49048 + (((tickAnim - 29) / 5) * (-0.22328-(-0.49048)));
            zz = 0.41674 + (((tickAnim - 29) / 5) * (-0.64373-(0.41674)));
        }
        else if (tickAnim >= 34 && tickAnim < 43) {
            xx = 4.12443 + (((tickAnim - 34) / 9) * (51.5-(4.12443)));
            yy = -0.22328 + (((tickAnim - 34) / 9) * (0-(-0.22328)));
            zz = -0.64373 + (((tickAnim - 34) / 9) * (0-(-0.64373)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightFoot, rightFoot.rotateAngleX + (float) Math.toRadians(xx), rightFoot.rotateAngleY + (float) Math.toRadians(yy), rightFoot.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (2-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (-0.19-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 5) / 6) * (0-(0)));
            yy = 2 + (((tickAnim - 5) / 6) * (1.09-(2)));
            zz = -0.19 + (((tickAnim - 5) / 6) * (-0.425-(-0.19)));
        }
        else if (tickAnim >= 11 && tickAnim < 17) {
            xx = 0 + (((tickAnim - 11) / 6) * (0-(0)));
            yy = 1.09 + (((tickAnim - 11) / 6) * (1.09-(1.09)));
            zz = -0.425 + (((tickAnim - 11) / 6) * (-0.425-(-0.425)));
        }
        else if (tickAnim >= 17 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 17) / 6) * (0-(0)));
            yy = 1.09 + (((tickAnim - 17) / 6) * (0.2-(1.09)));
            zz = -0.425 + (((tickAnim - 17) / 6) * (0-(-0.425)));
        }
        else if (tickAnim >= 23 && tickAnim < 29) {
            xx = 0 + (((tickAnim - 23) / 6) * (0-(0)));
            yy = 0.2 + (((tickAnim - 23) / 6) * (-0.15-(0.2)));
            zz = 0 + (((tickAnim - 23) / 6) * (0-(0)));
        }
        else if (tickAnim >= 29 && tickAnim < 34) {
            xx = 0 + (((tickAnim - 29) / 5) * (0-(0)));
            yy = -0.15 + (((tickAnim - 29) / 5) * (0.3-(-0.15)));
            zz = 0 + (((tickAnim - 29) / 5) * (0-(0)));
        }
        else if (tickAnim >= 34 && tickAnim < 43) {
            xx = 0 + (((tickAnim - 34) / 9) * (0-(0)));
            yy = 0.3 + (((tickAnim - 34) / 9) * (0-(0.3)));
            zz = 0 + (((tickAnim - 34) / 9) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightFoot.rotationPointX = this.rightFoot.rotationPointX + (float)(xx);
        this.rightFoot.rotationPointY = this.rightFoot.rotationPointY - (float)(yy);
        this.rightFoot.rotationPointZ = this.rightFoot.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = -61.25 + (((tickAnim - 0) / 5) * (-17.25-(-61.25)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 11) {
            xx = -17.25 + (((tickAnim - 5) / 6) * (18.75-(-17.25)));
            yy = 0 + (((tickAnim - 5) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 6) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 17) {
            xx = 18.75 + (((tickAnim - 11) / 6) * (35.75-(18.75)));
            yy = 0 + (((tickAnim - 11) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 6) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 23) {
            xx = 35.75 + (((tickAnim - 17) / 6) * (0-(35.75)));
            yy = 0 + (((tickAnim - 17) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 17) / 6) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 34) {
            xx = 0 + (((tickAnim - 23) / 11) * (0-(0)));
            yy = 0 + (((tickAnim - 23) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 11) * (0-(0)));
        }
        else if (tickAnim >= 34 && tickAnim < 43) {
            xx = 0 + (((tickAnim - 34) / 9) * (-61.25-(0)));
            yy = 0 + (((tickAnim - 34) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 34) / 9) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightToes, rightToes.rotateAngleX + (float) Math.toRadians(xx), rightToes.rotateAngleY + (float) Math.toRadians(yy), rightToes.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = -0.175 + (((tickAnim - 0) / 5) * (0-(-0.175)));
            zz = 0.225 + (((tickAnim - 0) / 5) * (0-(0.225)));
        }
        else if (tickAnim >= 5 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 5) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 5) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 6) * (0.825-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 17) {
            xx = 0 + (((tickAnim - 11) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 11) / 6) * (0-(0)));
            zz = 0.825 + (((tickAnim - 11) / 6) * (0.175-(0.825)));
        }
        else if (tickAnim >= 17 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 17) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 17) / 6) * (0-(0)));
            zz = 0.175 + (((tickAnim - 17) / 6) * (0-(0.175)));
        }
        else if (tickAnim >= 23 && tickAnim < 34) {
            xx = 0 + (((tickAnim - 23) / 11) * (0-(0)));
            yy = 0 + (((tickAnim - 23) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 11) * (0-(0)));
        }
        else if (tickAnim >= 34 && tickAnim < 43) {
            xx = 0 + (((tickAnim - 34) / 9) * (0-(0)));
            yy = 0 + (((tickAnim - 34) / 9) * (-0.175-(0)));
            zz = 0 + (((tickAnim - 34) / 9) * (0.225-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightToes.rotationPointX = this.rightToes.rotationPointX + (float)(xx);
        this.rightToes.rotationPointY = this.rightToes.rotationPointY - (float)(yy);
        this.rightToes.rotationPointZ = this.rightToes.rotationPointZ + (float)(zz);



        this.setRotateAngle(tail1, tail1.rotateAngleX + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*339-50))*1), tail1.rotateAngleY + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*169-80))*-0.5), tail1.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*169-50))*0.59));


        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*339-50))*1), tail2.rotateAngleY + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*169-130))*-1), tail2.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*169-50))*0.59));


        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*339-100))*1), tail3.rotateAngleY + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*169-180))*-1.5), tail3.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*169-50))*0.59));


        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*339-150))*1), tail4.rotateAngleY + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*169-230))*-2), tail4.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*169-50))*0.59));


        this.setRotateAngle(tail5, tail5.rotateAngleX + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*339-200))*1), tail5.rotateAngleY + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*169-280))*-2.5), tail5.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*169-50))*0.59));


        this.setRotateAngle(tail6, tail6.rotateAngleX + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*339-250))*1), tail6.rotateAngleY + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*169-330))*-3), tail6.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*169-50))*0.59));


        this.setRotateAngle(tail7, tail7.rotateAngleX + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*339-300))*1), tail7.rotateAngleY + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*169-380))*-3.5), tail7.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*339-10))*1.28), body.rotateAngleY + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*169-150))*0.2), body.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*169))*-1));


        this.setRotateAngle(sailMiddle, sailMiddle.rotateAngleX + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*339-130))*1.5), sailMiddle.rotateAngleY + (float) Math.toRadians(0), sailMiddle.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*169-163))*-0.7));
        this.sailMiddle.rotationPointX = this.sailMiddle.rotationPointX + (float)(0);
        this.sailMiddle.rotationPointY = this.sailMiddle.rotationPointY - (float)(-0.275);
        this.sailMiddle.rotationPointZ = this.sailMiddle.rotationPointZ + (float)(0.275);


        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*339+25))*-0.7), chest.rotateAngleY + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*169-150))*-0.2), chest.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*169))*1));


        this.setRotateAngle(sailFront, sailFront.rotateAngleX + (float) Math.toRadians(-0.5-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*339-150))*0.3), sailFront.rotateAngleY + (float) Math.toRadians(0), sailFront.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*169-170))*0.5));
        this.sailFront.rotationPointX = this.sailFront.rotationPointX + (float)(0);
        this.sailFront.rotationPointY = this.sailFront.rotationPointY - (float)(0.6+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*339-120))*0.59);
        this.sailFront.rotationPointZ = this.sailFront.rotationPointZ + (float)(0.3);


        this.setRotateAngle(leftArm1, leftArm1.rotateAngleX + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*339+50))*2), leftArm1.rotateAngleY + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*169-150))*-0.2), leftArm1.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*169))*1));


        this.setRotateAngle(leftArm2, leftArm2.rotateAngleX + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*339+150))*-2), leftArm2.rotateAngleY + (float) Math.toRadians(0), leftArm2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(leftArm3, leftArm3.rotateAngleX + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*339+250))*3), leftArm3.rotateAngleY + (float) Math.toRadians(0), leftArm3.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(rightArm1, rightArm1.rotateAngleX + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*339+50))*2), rightArm1.rotateAngleY + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*169-150))*-0.2), rightArm1.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*169))*1));


        this.setRotateAngle(rightArm2, rightArm2.rotateAngleX + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*339+150))*-2), rightArm2.rotateAngleY + (float) Math.toRadians(0), rightArm2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(rightArm3, rightArm3.rotateAngleX + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*339+250))*3), rightArm3.rotateAngleY + (float) Math.toRadians(0), rightArm3.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(neck1, neck1.rotateAngleX + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*339+190))*1), neck1.rotateAngleY + (float) Math.toRadians(0), neck1.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*169))*-1));


        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*339+100))*1), neck2.rotateAngleY + (float) Math.toRadians(0), neck2.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*169))*1));


        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*339+150))*-1), neck3.rotateAngleY + (float) Math.toRadians(0), neck3.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*169))*1));


        this.setRotateAngle(neck4, neck4.rotateAngleX + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*339+250))*1), neck4.rotateAngleY + (float) Math.toRadians(0), neck4.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*169))*-1));
        this.neck4.rotationPointX = this.neck4.rotationPointX + (float)(0);
        this.neck4.rotationPointY = this.neck4.rotationPointY - (float)(0);
        this.neck4.rotationPointZ = this.neck4.rotationPointZ + (float)(0.175);


        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*339+250))*1), head.rotateAngleY + (float) Math.toRadians(0), head.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*169))*-1));


        this.setRotateAngle(spinofaarus, spinofaarus.rotateAngleX + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*339+250))*-2), spinofaarus.rotateAngleY + (float) Math.toRadians(0), spinofaarus.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*169-50))*1));

    }
    public void animRunning(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraSpinosaurus entity = (EntityPrehistoricFloraSpinosaurus) entitylivingbaseIn;
        int animCycle = 30;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        this.setRotateAngle(hips, hips.rotateAngleX + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480-80))*-1.15), hips.rotateAngleY + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240-80))*-0.5), hips.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240-20))*0.59));

        if (tickAnim >= 0 && tickAnim < 3) {
            xx = -0-Math.sin((Math.PI/180)*(((double)tickAnim/20)*480))*-0.1 + (((tickAnim - 0) / 3) * (-0-Math.sin((Math.PI/180)*(((double)tickAnim/20)*480))*-0.1-(-0-Math.sin((Math.PI/180)*(((double)tickAnim/20)*480))*-0.1)));
            yy = 0.025+Math.sin((Math.PI/180)*(((double)tickAnim/20)*480/0.3-20))*-0.15 + (((tickAnim - 0) / 3) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*480-20))*-0.22-(0.025+Math.sin((Math.PI/180)*(((double)tickAnim/20)*480/0.3-20))*-0.15)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*480-55))*-0.59 + (((tickAnim - 0) / 3) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*480-55))*-0.59-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*480-55))*-0.59)));
        }
        else if (tickAnim >= 3 && tickAnim < 16) {
            xx = -0-Math.sin((Math.PI/180)*(((double)tickAnim/20)*480))*-0.1 + (((tickAnim - 3) / 13) * (-0-Math.sin((Math.PI/180)*(((double)tickAnim/20)*480))*-0.1-(-0-Math.sin((Math.PI/180)*(((double)tickAnim/20)*480))*-0.1)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*480-20))*-0.22 + (((tickAnim - 3) / 13) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*480-20))*-0.22-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*480-20))*-0.22)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*480-55))*-0.59 + (((tickAnim - 3) / 13) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*480-55))*-0.59-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*480-55))*-0.59)));
        }
        else if (tickAnim >= 16 && tickAnim < 19) {
            xx = -0-Math.sin((Math.PI/180)*(((double)tickAnim/20)*480))*-0.1 + (((tickAnim - 16) / 3) * (-0-Math.sin((Math.PI/180)*(((double)tickAnim/20)*480))*-0.1-(-0-Math.sin((Math.PI/180)*(((double)tickAnim/20)*480))*-0.1)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*480-20))*-0.22 + (((tickAnim - 16) / 3) * (-0.2+Math.sin((Math.PI/180)*(((double)tickAnim/20)*480/0.5-20))*-0.15-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*480-20))*-0.22)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*480-55))*-0.59 + (((tickAnim - 16) / 3) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*480-55))*-0.59-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*480-55))*-0.59)));
        }
        else if (tickAnim >= 19 && tickAnim < 20) {
            xx = -0-Math.sin((Math.PI/180)*(((double)tickAnim/20)*480))*-0.1 + (((tickAnim - 19) / 1) * (-0-Math.sin((Math.PI/180)*(((double)tickAnim/20)*480))*-0.1-(-0-Math.sin((Math.PI/180)*(((double)tickAnim/20)*480))*-0.1)));
            yy = -0.2+Math.sin((Math.PI/180)*(((double)tickAnim/20)*480/0.5-20))*-0.15 + (((tickAnim - 19) / 1) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*480-20))*-0.22-(-0.2+Math.sin((Math.PI/180)*(((double)tickAnim/20)*480/0.5-20))*-0.15)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*480-55))*-0.59 + (((tickAnim - 19) / 1) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*480-55))*-0.59-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*480-55))*-0.59)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = -0-Math.sin((Math.PI/180)*(((double)tickAnim/20)*480))*-0.1 + (((tickAnim - 20) / 10) * (-0-Math.sin((Math.PI/180)*(((double)tickAnim/20)*480))*-0.1-(-0-Math.sin((Math.PI/180)*(((double)tickAnim/20)*480))*-0.1)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*480-20))*-0.22 + (((tickAnim - 20) / 10) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*480-20))*-0.22-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*480-20))*-0.22)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*480-55))*-0.59 + (((tickAnim - 20) / 10) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*480-55))*-0.59-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*480-55))*-0.59)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.hips.rotationPointX = this.hips.rotationPointX + (float)(xx);
        this.hips.rotationPointY = this.hips.rotationPointY - (float)(yy);
        this.hips.rotationPointZ = this.hips.rotationPointZ + (float)(zz);



        this.setRotateAngle(sailEnd, sailEnd.rotateAngleX + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480-80))*1.1), sailEnd.rotateAngleY + (float) Math.toRadians(0), sailEnd.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240-200))*0.59));



        if (tickAnim >= 0 && tickAnim < 14) {
            xx = -11.44441 + (((tickAnim - 0) / 14) * (14.17578-(-11.44441)));
            yy = -7.09013 + (((tickAnim - 0) / 14) * (-1.74925-(-7.09013)));
            zz = 0 + (((tickAnim - 0) / 14) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 22) {
            xx = 14.17578 + (((tickAnim - 14) / 8) * (48.1-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-20))*80-(14.17578)));
            yy = -1.74925 + (((tickAnim - 14) / 8) * (-3.54507-(-1.74925)));
            zz = 0 + (((tickAnim - 14) / 8) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 30) {
            xx = 48.1-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-20))*80 + (((tickAnim - 22) / 8) * (-11.44441-(48.1-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-20))*80)));
            yy = -3.54507 + (((tickAnim - 22) / 8) * (-7.09013-(-3.54507)));
            zz = 0 + (((tickAnim - 22) / 8) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg1, leftLeg1.rotateAngleX + (float) Math.toRadians(xx), leftLeg1.rotateAngleY + (float) Math.toRadians(yy), leftLeg1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = -5.5 + (((tickAnim - 0) / 4) * (-2.31-(-5.5)));
            yy = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 15) {
            xx = -2.31 + (((tickAnim - 4) / 11) * (4-(-2.31)));
            yy = 0 + (((tickAnim - 4) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 11) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 22) {
            xx = 4 + (((tickAnim - 15) / 7) * (-85.205-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+30))*-110-(4)));
            yy = 0 + (((tickAnim - 15) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 7) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 30) {
            xx = -85.205-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+30))*-110 + (((tickAnim - 22) / 8) * (-5.5-(-85.205-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+30))*-110)));
            yy = 0 + (((tickAnim - 22) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 22) / 8) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg2, leftLeg2.rotateAngleX + (float) Math.toRadians(xx), leftLeg2.rotateAngleY + (float) Math.toRadians(yy), leftLeg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            yy = 0.275 + (((tickAnim - 0) / 4) * (-0.25-(0.275)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 4) / 11) * (0-(0)));
            yy = -0.25 + (((tickAnim - 4) / 11) * (-0.525-(-0.25)));
            zz = 0 + (((tickAnim - 4) / 11) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 15) / 15) * (0-(0)));
            yy = -0.525 + (((tickAnim - 15) / 15) * (0.275-(-0.525)));
            zz = 0 + (((tickAnim - 15) / 15) * (0-(0)));
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
            xx = 11.55-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*30 + (((tickAnim - 0) / 4) * (-10.37-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-10-(11.55-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*30)));
            yy = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 14) {
            xx = -10.37-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-10 + (((tickAnim - 4) / 10) * (-7.5-(-10.37-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-10)));
            yy = 0 + (((tickAnim - 4) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 10) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 22) {
            xx = -7.5 + (((tickAnim - 14) / 8) * (-42.03-(-7.5)));
            yy = 0 + (((tickAnim - 14) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 8) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 26) {
            xx = -42.03 + (((tickAnim - 22) / 4) * (-51.78-(-42.03)));
            yy = 0 + (((tickAnim - 22) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 22) / 4) * (0-(0)));
        }
        else if (tickAnim >= 26 && tickAnim < 30) {
            xx = -51.78 + (((tickAnim - 26) / 4) * (11.55-(-51.78)));
            yy = 0 + (((tickAnim - 26) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 26) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg3, leftLeg3.rotateAngleX + (float) Math.toRadians(xx), leftLeg3.rotateAngleY + (float) Math.toRadians(yy), leftLeg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            yy = -0.475+Math.sin((Math.PI/180)*(((double)tickAnim/20)*550/0.29))*0.02 + (((tickAnim - 0) / 4) * (0.23-(-0.475+Math.sin((Math.PI/180)*(((double)tickAnim/20)*550/0.29))*0.02)));
            zz = -0.475 + (((tickAnim - 0) / 4) * (-0.4-(-0.475)));
        }
        else if (tickAnim >= 4 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 4) / 10) * (0-(0)));
            yy = 0.23 + (((tickAnim - 4) / 10) * (0-(0.23)));
            zz = -0.4 + (((tickAnim - 4) / 10) * (0-(-0.4)));
        }
        else if (tickAnim >= 14 && tickAnim < 22) {
            xx = 0 + (((tickAnim - 14) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 14) / 8) * (0.645-(0)));
            zz = 0 + (((tickAnim - 14) / 8) * (1.78-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 26) {
            xx = 0 + (((tickAnim - 22) / 4) * (0-(0)));
            yy = 0.645 + (((tickAnim - 22) / 4) * (0.645-(0.645)));
            zz = 1.78 + (((tickAnim - 22) / 4) * (1.78-(1.78)));
        }
        else if (tickAnim >= 26 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 26) / 4) * (0-(0)));
            yy = 0.645 + (((tickAnim - 26) / 4) * (-0.475+Math.sin((Math.PI/180)*(((double)tickAnim/20)*550/0.29))*0.02-(0.645)));
            zz = 1.78 + (((tickAnim - 26) / 4) * (-0.475-(1.78)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftLeg3.rotationPointX = this.leftLeg3.rotationPointX + (float)(xx);
        this.leftLeg3.rotationPointY = this.leftLeg3.rotationPointY - (float)(yy);
        this.leftLeg3.rotationPointZ = this.leftLeg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 7.0077-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-30 + (((tickAnim - 0) / 4) * (16.101-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*10-(7.0077-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-30)));
            yy = -0.00597 + (((tickAnim - 0) / 4) * (0-(-0.00597)));
            zz = 0.56826 + (((tickAnim - 0) / 4) * (0-(0.56826)));
        }
        else if (tickAnim >= 4 && tickAnim < 8) {
            xx = 16.101-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*10 + (((tickAnim - 4) / 4) * (4.12443-(16.101-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*10)));
            yy = 0 + (((tickAnim - 4) / 4) * (-0.22328-(0)));
            zz = 0 + (((tickAnim - 4) / 4) * (-0.64373-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 14) {
            xx = 4.12443 + (((tickAnim - 8) / 6) * (51.5-(4.12443)));
            yy = -0.22328 + (((tickAnim - 8) / 6) * (0-(-0.22328)));
            zz = -0.64373 + (((tickAnim - 8) / 6) * (0-(-0.64373)));
        }
        else if (tickAnim >= 14 && tickAnim < 22) {
            xx = 51.5 + (((tickAnim - 14) / 8) * (77.64483-(51.5)));
            yy = 0 + (((tickAnim - 14) / 8) * (-0.62393-(0)));
            zz = 0 + (((tickAnim - 14) / 8) * (0.96116-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 26) {
            xx = 77.64483 + (((tickAnim - 22) / 4) * (71.39483-(77.64483)));
            yy = -0.62393 + (((tickAnim - 22) / 4) * (-0.62393-(-0.62393)));
            zz = 0.96116 + (((tickAnim - 22) / 4) * (0.96116-(0.96116)));
        }
        else if (tickAnim >= 26 && tickAnim < 28) {
            xx = 71.39483 + (((tickAnim - 26) / 2) * (47.83432-(71.39483)));
            yy = -0.62393 + (((tickAnim - 26) / 2) * (0.48954-(-0.62393)));
            zz = 0.96116 + (((tickAnim - 26) / 2) * (-0.79987-(0.96116)));
        }
        else if (tickAnim >= 28 && tickAnim < 30) {
            xx = 47.83432 + (((tickAnim - 28) / 2) * (7.0077-(47.83432)));
            yy = 0.48954 + (((tickAnim - 28) / 2) * (-0.00597-(0.48954)));
            zz = -0.79987 + (((tickAnim - 28) / 2) * (0.56826-(-0.79987)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftFoot, leftFoot.rotateAngleX + (float) Math.toRadians(xx), leftFoot.rotateAngleY + (float) Math.toRadians(yy), leftFoot.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            yy = 0.2 + (((tickAnim - 0) / 4) * (-0.15-(0.2)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 4) / 4) * (0-(0)));
            yy = -0.15 + (((tickAnim - 4) / 4) * (0.3-(-0.15)));
            zz = 0 + (((tickAnim - 4) / 4) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 8) / 4) * (0-(0)));
            yy = 0.3 + (((tickAnim - 8) / 4) * (1.095-(0.3)));
            zz = 0 + (((tickAnim - 8) / 4) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 12) / 2) * (0-(0)));
            yy = 1.095 + (((tickAnim - 12) / 2) * (0.5-(1.095)));
            zz = 0 + (((tickAnim - 12) / 2) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 14) / 4) * (0-(0)));
            yy = 0.5 + (((tickAnim - 14) / 4) * (2-(0.5)));
            zz = 0 + (((tickAnim - 14) / 4) * (-0.19-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 22) {
            xx = 0 + (((tickAnim - 18) / 4) * (0-(0)));
            yy = 2 + (((tickAnim - 18) / 4) * (1.09-(2)));
            zz = -0.19 + (((tickAnim - 18) / 4) * (-0.425-(-0.19)));
        }
        else if (tickAnim >= 22 && tickAnim < 26) {
            xx = 0 + (((tickAnim - 22) / 4) * (0-(0)));
            yy = 1.09 + (((tickAnim - 22) / 4) * (1.09-(1.09)));
            zz = -0.425 + (((tickAnim - 22) / 4) * (-0.425-(-0.425)));
        }
        else if (tickAnim >= 26 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 26) / 4) * (0-(0)));
            yy = 1.09 + (((tickAnim - 26) / 4) * (0.2-(1.09)));
            zz = -0.425 + (((tickAnim - 26) / 4) * (0-(-0.425)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftFoot.rotationPointX = this.leftFoot.rotationPointX + (float)(xx);
        this.leftFoot.rotationPointY = this.leftFoot.rotationPointY - (float)(yy);
        this.leftFoot.rotationPointZ = this.leftFoot.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 8) / 6) * (-61.25-(0)));
            yy = 0 + (((tickAnim - 8) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 6) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 17) {
            xx = -61.25 + (((tickAnim - 14) / 3) * (-17.25-(-61.25)));
            yy = 0 + (((tickAnim - 14) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 3) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 22) {
            xx = -17.25 + (((tickAnim - 17) / 5) * (18.75-(-17.25)));
            yy = 0 + (((tickAnim - 17) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 17) / 5) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 26) {
            xx = 18.75 + (((tickAnim - 22) / 4) * (35.75-(18.75)));
            yy = 0 + (((tickAnim - 22) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 22) / 4) * (0-(0)));
        }
        else if (tickAnim >= 26 && tickAnim < 30) {
            xx = 35.75 + (((tickAnim - 26) / 4) * (0-(35.75)));
            yy = 0 + (((tickAnim - 26) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 26) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftToes, leftToes.rotateAngleX + (float) Math.toRadians(xx), leftToes.rotateAngleY + (float) Math.toRadians(yy), leftToes.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 8) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 8) / 6) * (-0.175-(0)));
            zz = 0 + (((tickAnim - 8) / 6) * (0.225-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 17) {
            xx = 0 + (((tickAnim - 14) / 3) * (0-(0)));
            yy = -0.175 + (((tickAnim - 14) / 3) * (0-(-0.175)));
            zz = 0.225 + (((tickAnim - 14) / 3) * (0-(0.225)));
        }
        else if (tickAnim >= 17 && tickAnim < 22) {
            xx = 0 + (((tickAnim - 17) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 17) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 17) / 5) * (0.825-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 26) {
            xx = 0 + (((tickAnim - 22) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 22) / 4) * (0-(0)));
            zz = 0.825 + (((tickAnim - 22) / 4) * (0.175-(0.825)));
        }
        else if (tickAnim >= 26 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 26) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 26) / 4) * (0-(0)));
            zz = 0.175 + (((tickAnim - 26) / 4) * (0-(0.175)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftToes.rotationPointX = this.leftToes.rotationPointX + (float)(xx);
        this.leftToes.rotationPointY = this.leftToes.rotationPointY - (float)(yy);
        this.leftToes.rotationPointZ = this.leftToes.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 14.17578 + (((tickAnim - 0) / 8) * (20.875-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*40-(14.17578)));
            yy = 1.74925 + (((tickAnim - 0) / 8) * (3.54507-(1.74925)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 16) {
            xx = 20.875-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*40 + (((tickAnim - 8) / 8) * (-11.44441-(20.875-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*40)));
            yy = 3.54507 + (((tickAnim - 8) / 8) * (7.09013-(3.54507)));
            zz = 0 + (((tickAnim - 8) / 8) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 30) {
            xx = -11.44441 + (((tickAnim - 16) / 14) * (14.17578-(-11.44441)));
            yy = 7.09013 + (((tickAnim - 16) / 14) * (1.74925-(7.09013)));
            zz = 0 + (((tickAnim - 16) / 14) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg1, rightLeg1.rotateAngleX + (float) Math.toRadians(xx), rightLeg1.rotateAngleY + (float) Math.toRadians(yy), rightLeg1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 4 + (((tickAnim - 0) / 8) * (-87.88-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-100))*110-(4)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 16) {
            xx = -87.88-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-100))*110 + (((tickAnim - 8) / 8) * (-5.5-(-87.88-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-100))*110)));
            yy = 0 + (((tickAnim - 8) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 8) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 30) {
            xx = -5.5 + (((tickAnim - 16) / 14) * (4-(-5.5)));
            yy = 0 + (((tickAnim - 16) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 16) / 14) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg2, rightLeg2.rotateAngleX + (float) Math.toRadians(xx), rightLeg2.rotateAngleY + (float) Math.toRadians(yy), rightLeg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = -7.5 + (((tickAnim - 0) / 8) * (-42.03-(-7.5)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 12) {
            xx = -42.03 + (((tickAnim - 8) / 4) * (-51.78-(-42.03)));
            yy = 0 + (((tickAnim - 8) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 4) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 16) {
            xx = -51.78 + (((tickAnim - 12) / 4) * (15.975-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-50))*50-(-51.78)));
            yy = 0 + (((tickAnim - 12) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 4) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 21) {
            xx = 15.975-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-50))*50 + (((tickAnim - 16) / 5) * (-15.07-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-10-(15.975-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-50))*50)));
            yy = 0 + (((tickAnim - 16) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 16) / 5) * (0-(0)));
        }
        else if (tickAnim >= 21 && tickAnim < 30) {
            xx = -15.07-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-10 + (((tickAnim - 21) / 9) * (-7.5-(-15.07-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-10)));
            yy = 0 + (((tickAnim - 21) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 21) / 9) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg3, rightLeg3.rotateAngleX + (float) Math.toRadians(xx), rightLeg3.rotateAngleY + (float) Math.toRadians(yy), rightLeg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0.645-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (1.78-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 8) / 4) * (0-(0)));
            yy = 0.645 + (((tickAnim - 8) / 4) * (0.645-(0.645)));
            zz = 1.78 + (((tickAnim - 8) / 4) * (1.78-(1.78)));
        }
        else if (tickAnim >= 12 && tickAnim < 16) {
            xx = 0 + (((tickAnim - 12) / 4) * (0-(0)));
            yy = 0.645 + (((tickAnim - 12) / 4) * (-0.475+Math.sin((Math.PI/180)*(((double)tickAnim/20)*550/0.29))*0.02-(0.645)));
            zz = 1.78 + (((tickAnim - 12) / 4) * (-0.475-(1.78)));
        }
        else if (tickAnim >= 16 && tickAnim < 21) {
            xx = 0 + (((tickAnim - 16) / 5) * (0-(0)));
            yy = -0.475+Math.sin((Math.PI/180)*(((double)tickAnim/20)*550/0.29))*0.02 + (((tickAnim - 16) / 5) * (0.23-(-0.475+Math.sin((Math.PI/180)*(((double)tickAnim/20)*550/0.29))*0.02)));
            zz = -0.475 + (((tickAnim - 16) / 5) * (-0.4-(-0.475)));
        }
        else if (tickAnim >= 21 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 21) / 9) * (0-(0)));
            yy = 0.23 + (((tickAnim - 21) / 9) * (0-(0.23)));
            zz = -0.4 + (((tickAnim - 21) / 9) * (0-(-0.4)));
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
            xx = 51.5 + (((tickAnim - 0) / 8) * (77.64483-(51.5)));
            yy = 0 + (((tickAnim - 0) / 8) * (-0.62393-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0.96116-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 12) {
            xx = 77.64483 + (((tickAnim - 8) / 4) * (71.39483-(77.64483)));
            yy = -0.62393 + (((tickAnim - 8) / 4) * (-0.62393-(-0.62393)));
            zz = 0.96116 + (((tickAnim - 8) / 4) * (0.96116-(0.96116)));
        }
        else if (tickAnim >= 12 && tickAnim < 13) {
            xx = 71.39483 + (((tickAnim - 12) / 1) * (47.83432-(71.39483)));
            yy = -0.62393 + (((tickAnim - 12) / 1) * (0.48954-(-0.62393)));
            zz = 0.96116 + (((tickAnim - 12) / 1) * (-0.79987-(0.96116)));
        }
        else if (tickAnim >= 13 && tickAnim < 16) {
            xx = 47.83432 + (((tickAnim - 13) / 3) * (1.6827-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-50))*-50-(47.83432)));
            yy = 0.48954 + (((tickAnim - 13) / 3) * (-0.00597-(0.48954)));
            zz = -0.79987 + (((tickAnim - 13) / 3) * (0.56826-(-0.79987)));
        }
        else if (tickAnim >= 16 && tickAnim < 21) {
            xx = 1.6827-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-50))*-50 + (((tickAnim - 16) / 5) * (21.1103-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*10-(1.6827-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-50))*-50)));
            yy = -0.00597 + (((tickAnim - 16) / 5) * (-0.49048-(-0.00597)));
            zz = 0.56826 + (((tickAnim - 16) / 5) * (0.41674-(0.56826)));
        }
        else if (tickAnim >= 21 && tickAnim < 24) {
            xx = 21.1103-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*10 + (((tickAnim - 21) / 3) * (4.12443-(21.1103-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*10)));
            yy = -0.49048 + (((tickAnim - 21) / 3) * (-0.22328-(-0.49048)));
            zz = 0.41674 + (((tickAnim - 21) / 3) * (-0.64373-(0.41674)));
        }
        else if (tickAnim >= 24 && tickAnim < 30) {
            xx = 4.12443 + (((tickAnim - 24) / 6) * (51.5-(4.12443)));
            yy = -0.22328 + (((tickAnim - 24) / 6) * (0-(-0.22328)));
            zz = -0.64373 + (((tickAnim - 24) / 6) * (0-(-0.64373)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightFoot, rightFoot.rotateAngleX + (float) Math.toRadians(xx), rightFoot.rotateAngleY + (float) Math.toRadians(yy), rightFoot.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (2-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (-0.19-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 3) / 5) * (0-(0)));
            yy = 2 + (((tickAnim - 3) / 5) * (1.09-(2)));
            zz = -0.19 + (((tickAnim - 3) / 5) * (-0.425-(-0.19)));
        }
        else if (tickAnim >= 8 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 8) / 4) * (0-(0)));
            yy = 1.09 + (((tickAnim - 8) / 4) * (1.09-(1.09)));
            zz = -0.425 + (((tickAnim - 8) / 4) * (-0.425-(-0.425)));
        }
        else if (tickAnim >= 12 && tickAnim < 16) {
            xx = 0 + (((tickAnim - 12) / 4) * (0-(0)));
            yy = 1.09 + (((tickAnim - 12) / 4) * (0.2-(1.09)));
            zz = -0.425 + (((tickAnim - 12) / 4) * (0-(-0.425)));
        }
        else if (tickAnim >= 16 && tickAnim < 21) {
            xx = 0 + (((tickAnim - 16) / 5) * (0-(0)));
            yy = 0.2 + (((tickAnim - 16) / 5) * (-0.15-(0.2)));
            zz = 0 + (((tickAnim - 16) / 5) * (0-(0)));
        }
        else if (tickAnim >= 21 && tickAnim < 24) {
            xx = 0 + (((tickAnim - 21) / 3) * (0-(0)));
            yy = -0.15 + (((tickAnim - 21) / 3) * (0.3-(-0.15)));
            zz = 0 + (((tickAnim - 21) / 3) * (0-(0)));
        }
        else if (tickAnim >= 24 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 24) / 6) * (0-(0)));
            yy = 0.3 + (((tickAnim - 24) / 6) * (0-(0.3)));
            zz = 0 + (((tickAnim - 24) / 6) * (0-(0)));
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
            xx = -61.25 + (((tickAnim - 0) / 3) * (-17.25-(-61.25)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 8) {
            xx = -17.25 + (((tickAnim - 3) / 5) * (18.75-(-17.25)));
            yy = 0 + (((tickAnim - 3) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 5) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 12) {
            xx = 18.75 + (((tickAnim - 8) / 4) * (35.75-(18.75)));
            yy = 0 + (((tickAnim - 8) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 4) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 16) {
            xx = 35.75 + (((tickAnim - 12) / 4) * (0-(35.75)));
            yy = 0 + (((tickAnim - 12) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 4) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 24) {
            xx = 0 + (((tickAnim - 16) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 16) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 16) / 8) * (0-(0)));
        }
        else if (tickAnim >= 24 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 24) / 6) * (-61.25-(0)));
            yy = 0 + (((tickAnim - 24) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 24) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightToes, rightToes.rotateAngleX + (float) Math.toRadians(xx), rightToes.rotateAngleY + (float) Math.toRadians(yy), rightToes.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = -0.175 + (((tickAnim - 0) / 3) * (0-(-0.175)));
            zz = 0.225 + (((tickAnim - 0) / 3) * (0-(0.225)));
        }
        else if (tickAnim >= 3 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 3) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 3) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 5) * (0.825-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 8) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 8) / 4) * (0-(0)));
            zz = 0.825 + (((tickAnim - 8) / 4) * (0.175-(0.825)));
        }
        else if (tickAnim >= 12 && tickAnim < 16) {
            xx = 0 + (((tickAnim - 12) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 12) / 4) * (0-(0)));
            zz = 0.175 + (((tickAnim - 12) / 4) * (0-(0.175)));
        }
        else if (tickAnim >= 16 && tickAnim < 24) {
            xx = 0 + (((tickAnim - 16) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 16) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 16) / 8) * (0-(0)));
        }
        else if (tickAnim >= 24 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 24) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 24) / 6) * (-0.175-(0)));
            zz = 0 + (((tickAnim - 24) / 6) * (0.225-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightToes.rotationPointX = this.rightToes.rotationPointX + (float)(xx);
        this.rightToes.rotationPointY = this.rightToes.rotationPointY - (float)(yy);
        this.rightToes.rotationPointZ = this.rightToes.rotationPointZ + (float)(zz);



        this.setRotateAngle(tail1, tail1.rotateAngleX + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480-50))*1.5), tail1.rotateAngleY + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240-80))*-0.5), tail1.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240-50))*0.59));


        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480-50))*1.5), tail2.rotateAngleY + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240-130))*-1), tail2.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240-50))*0.59));


        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480-100))*1.5), tail3.rotateAngleY + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240-180))*-1.5), tail3.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240-50))*0.59));


        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480-150))*1.5), tail4.rotateAngleY + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240-230))*-2), tail4.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240-50))*0.59));


        this.setRotateAngle(tail5, tail5.rotateAngleX + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480-200))*1.5), tail5.rotateAngleY + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240-280))*-2.5), tail5.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240-50))*0.59));


        this.setRotateAngle(tail6, tail6.rotateAngleX + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480-250))*1.5), tail6.rotateAngleY + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240-330))*-3), tail6.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240-50))*0.59));


        this.setRotateAngle(tail7, tail7.rotateAngleX + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480-350))*-2), tail7.rotateAngleY + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240-380))*-3.5), tail7.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480-10))*1.28), body.rotateAngleY + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240-150))*0.5), body.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240))*-1));


        this.setRotateAngle(sailMiddle, sailMiddle.rotateAngleX + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480-130))*1.5), sailMiddle.rotateAngleY + (float) Math.toRadians(0), sailMiddle.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240-163))*-0.7));
        this.sailMiddle.rotationPointX = this.sailMiddle.rotationPointX + (float)(0);
        this.sailMiddle.rotationPointY = this.sailMiddle.rotationPointY - (float)(-0.275);
        this.sailMiddle.rotationPointZ = this.sailMiddle.rotationPointZ + (float)(0.275);


        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480+25))*-0.7), chest.rotateAngleY + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240-150))*-0.5), chest.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240))*1));


        this.setRotateAngle(sailFront, sailFront.rotateAngleX + (float) Math.toRadians(-0.5-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480-150))*0.3), sailFront.rotateAngleY + (float) Math.toRadians(0), sailFront.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240-170))*0.5));
        this.sailFront.rotationPointX = this.sailFront.rotationPointX + (float)(0);
        this.sailFront.rotationPointY = this.sailFront.rotationPointY - (float)(0.6+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240/0.5-120))*0.59);
        this.sailFront.rotationPointZ = this.sailFront.rotationPointZ + (float)(0.3);


        this.setRotateAngle(leftArm1, leftArm1.rotateAngleX + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480+50))*2), leftArm1.rotateAngleY + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240-150))*-0.2), leftArm1.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240))*1));


        this.setRotateAngle(leftArm2, leftArm2.rotateAngleX + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480-80))*-1.15), leftArm2.rotateAngleY + (float) Math.toRadians(0), leftArm2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(leftArm3, leftArm3.rotateAngleX + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480+250))*3), leftArm3.rotateAngleY + (float) Math.toRadians(0), leftArm3.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(rightArm1, rightArm1.rotateAngleX + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480+50))*2), rightArm1.rotateAngleY + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240-150))*-0.2), rightArm1.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240))*1));


        this.setRotateAngle(rightArm2, rightArm2.rotateAngleX + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480+150))*-2), rightArm2.rotateAngleY + (float) Math.toRadians(0), rightArm2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(rightArm3, rightArm3.rotateAngleX + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480+250))*3), rightArm3.rotateAngleY + (float) Math.toRadians(0), rightArm3.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(neck1, neck1.rotateAngleX + (float) Math.toRadians(2.9998-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480+190))*2), neck1.rotateAngleY + (float) Math.toRadians(0.05162), neck1.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240))*-1.1194));
        this.neck1.rotationPointX = this.neck1.rotationPointX + (float)(0);
        this.neck1.rotationPointY = this.neck1.rotationPointY - (float)(0);
        this.neck1.rotationPointZ = this.neck1.rotationPointZ + (float)(0.625);


        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(13.75-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480+100))*2), neck2.rotateAngleY + (float) Math.toRadians(0), neck2.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240))*1));
        this.neck2.rotationPointX = this.neck2.rotationPointX + (float)(0);
        this.neck2.rotationPointY = this.neck2.rotationPointY - (float)(0.5);
        this.neck2.rotationPointZ = this.neck2.rotationPointZ + (float)(-0.7);


        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(2.5-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480+150))*-2), neck3.rotateAngleY + (float) Math.toRadians(0), neck3.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240))*1));
        this.neck3.rotationPointX = this.neck3.rotationPointX + (float)(0);
        this.neck3.rotationPointY = this.neck3.rotationPointY - (float)(-0.2);
        this.neck3.rotationPointZ = this.neck3.rotationPointZ + (float)(0);


        this.setRotateAngle(neck4, neck4.rotateAngleX + (float) Math.toRadians(-12.7499-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480+250))*2), neck4.rotateAngleY + (float) Math.toRadians(-0.07762), neck4.rotateAngleZ + (float) Math.toRadians(0.0816+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240))*-1));
        this.neck4.rotationPointX = this.neck4.rotationPointX + (float)(0);
        this.neck4.rotationPointY = this.neck4.rotationPointY - (float)(0);
        this.neck4.rotationPointZ = this.neck4.rotationPointZ + (float)(-0.7);


        this.setRotateAngle(throat1, throat1.rotateAngleX + (float) Math.toRadians(-8.24969), throat1.rotateAngleY + (float) Math.toRadians(-0.02481), throat1.rotateAngleZ + (float) Math.toRadians(0.06861));


        this.setRotateAngle(throat2, throat2.rotateAngleX + (float) Math.toRadians(19.75), throat2.rotateAngleY + (float) Math.toRadians(0), throat2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(-12.9999-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480+250))*-2), head.rotateAngleY + (float) Math.toRadians(-0.03453), head.rotateAngleZ + (float) Math.toRadians(0.1095+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240))*-1));


        this.setRotateAngle(spinofaarus, spinofaarus.rotateAngleX + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480+250))*-2), spinofaarus.rotateAngleY + (float) Math.toRadians(0), spinofaarus.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240-50))*1));

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
