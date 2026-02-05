package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.EntityPrehistoricFloraSpicomellus;
import net.lepidodendron.entity.EntityPrehistoricFloraMantellisaurus;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;

public class ModelSpicomellus extends ModelBasePalaeopedia {
    private final AdvancedModelRenderer main;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer MainOsteodermsLeft;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer MainOsteodermsRight;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer cube_r6;
    private final AdvancedModelRenderer cube_r7;
    private final AdvancedModelRenderer leftLeg;
    private final AdvancedModelRenderer cube_r8;
    private final AdvancedModelRenderer leftLeg2;
    private final AdvancedModelRenderer leftLeg3;
    private final AdvancedModelRenderer leftLeg4;
    private final AdvancedModelRenderer rightLeg;
    private final AdvancedModelRenderer cube_r9;
    private final AdvancedModelRenderer rightLeg2;
    private final AdvancedModelRenderer rightLeg3;
    private final AdvancedModelRenderer rightLeg4;
    private final AdvancedModelRenderer tail;
    private final AdvancedModelRenderer TailOsteodermsLeft;
    private final AdvancedModelRenderer cube_r10;
    private final AdvancedModelRenderer cube_r11;
    private final AdvancedModelRenderer cube_r12;
    private final AdvancedModelRenderer cube_r13;
    private final AdvancedModelRenderer TailOsteodermsRight;
    private final AdvancedModelRenderer cube_r14;
    private final AdvancedModelRenderer cube_r15;
    private final AdvancedModelRenderer cube_r16;
    private final AdvancedModelRenderer cube_r17;
    private final AdvancedModelRenderer tail2;
    private final AdvancedModelRenderer Tail2OsteodermsLeft;
    private final AdvancedModelRenderer cube_r18;
    private final AdvancedModelRenderer cube_r19;
    private final AdvancedModelRenderer cube_r20;
    private final AdvancedModelRenderer cube_r21;
    private final AdvancedModelRenderer Tail2OsteodermsRight;
    private final AdvancedModelRenderer cube_r22;
    private final AdvancedModelRenderer cube_r23;
    private final AdvancedModelRenderer cube_r24;
    private final AdvancedModelRenderer cube_r25;
    private final AdvancedModelRenderer tail3;
    private final AdvancedModelRenderer Tail3OsteodermsLeft;
    private final AdvancedModelRenderer cube_r26;
    private final AdvancedModelRenderer cube_r27;
    private final AdvancedModelRenderer cube_r28;
    private final AdvancedModelRenderer cube_r29;
    private final AdvancedModelRenderer Tail3OsteodermsRight;
    private final AdvancedModelRenderer cube_r30;
    private final AdvancedModelRenderer cube_r31;
    private final AdvancedModelRenderer cube_r32;
    private final AdvancedModelRenderer cube_r33;
    private final AdvancedModelRenderer tail4;
    private final AdvancedModelRenderer Tail4OsteodermsLeft;
    private final AdvancedModelRenderer cube_r34;
    private final AdvancedModelRenderer Tail4OsteodermsRight;
    private final AdvancedModelRenderer cube_r35;
    private final AdvancedModelRenderer tail5;
    private final AdvancedModelRenderer Tail5OsteodermsLeft;
    private final AdvancedModelRenderer cube_r36;
    private final AdvancedModelRenderer cube_r37;
    private final AdvancedModelRenderer cube_r38;
    private final AdvancedModelRenderer cube_r39;
    private final AdvancedModelRenderer cube_r40;
    private final AdvancedModelRenderer cube_r41;
    private final AdvancedModelRenderer Tail5OsteodermsRight;
    private final AdvancedModelRenderer cube_r42;
    private final AdvancedModelRenderer cube_r43;
    private final AdvancedModelRenderer cube_r44;
    private final AdvancedModelRenderer cube_r45;
    private final AdvancedModelRenderer cube_r46;
    private final AdvancedModelRenderer cube_r47;
    private final AdvancedModelRenderer body;
    private final AdvancedModelRenderer cube_r48;
    private final AdvancedModelRenderer cube_r49;
    private final AdvancedModelRenderer BodyOsteodermsLeft;
    private final AdvancedModelRenderer cube_r50;
    private final AdvancedModelRenderer cube_r51;
    private final AdvancedModelRenderer cube_r52;
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
    private final AdvancedModelRenderer BodyOsteodermsRight;
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
    private final AdvancedModelRenderer cube_r97;
    private final AdvancedModelRenderer cube_r98;
    private final AdvancedModelRenderer cube_r99;
    private final AdvancedModelRenderer body2;
    private final AdvancedModelRenderer cube_r100;
    private final AdvancedModelRenderer cube_r101;
    private final AdvancedModelRenderer cube_r102;
    private final AdvancedModelRenderer cube_r103;
    private final AdvancedModelRenderer cube_r104;
    private final AdvancedModelRenderer Body2OsteodermsLeft;
    private final AdvancedModelRenderer cube_r105;
    private final AdvancedModelRenderer cube_r106;
    private final AdvancedModelRenderer cube_r107;
    private final AdvancedModelRenderer cube_r108;
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
    private final AdvancedModelRenderer Body2OsteodermsRight;
    private final AdvancedModelRenderer cube_r121;
    private final AdvancedModelRenderer cube_r122;
    private final AdvancedModelRenderer cube_r123;
    private final AdvancedModelRenderer cube_r124;
    private final AdvancedModelRenderer cube_r125;
    private final AdvancedModelRenderer cube_r126;
    private final AdvancedModelRenderer cube_r127;
    private final AdvancedModelRenderer cube_r128;
    private final AdvancedModelRenderer cube_r129;
    private final AdvancedModelRenderer cube_r130;
    private final AdvancedModelRenderer cube_r131;
    private final AdvancedModelRenderer cube_r132;
    private final AdvancedModelRenderer cube_r133;
    private final AdvancedModelRenderer cube_r134;
    private final AdvancedModelRenderer cube_r135;
    private final AdvancedModelRenderer cube_r136;
    private final AdvancedModelRenderer leftArm;
    private final AdvancedModelRenderer leftArm2;
    private final AdvancedModelRenderer leftArm3;
    private final AdvancedModelRenderer rightArm;
    private final AdvancedModelRenderer rightArm2;
    private final AdvancedModelRenderer rightArm3;
    private final AdvancedModelRenderer neck;
    private final AdvancedModelRenderer cube_r137;
    private final AdvancedModelRenderer cube_r138;
    private final AdvancedModelRenderer cube_r139;
    private final AdvancedModelRenderer NeckOsteodermsLeft;
    private final AdvancedModelRenderer cube_r140;
    private final AdvancedModelRenderer cube_r141;
    private final AdvancedModelRenderer cube_r142;
    private final AdvancedModelRenderer cube_r143;
    private final AdvancedModelRenderer cube_r144;
    private final AdvancedModelRenderer cube_r145;
    private final AdvancedModelRenderer cube_r146;
    private final AdvancedModelRenderer cube_r147;
    private final AdvancedModelRenderer NeckOsteodermsRight;
    private final AdvancedModelRenderer cube_r148;
    private final AdvancedModelRenderer cube_r149;
    private final AdvancedModelRenderer cube_r150;
    private final AdvancedModelRenderer cube_r151;
    private final AdvancedModelRenderer cube_r152;
    private final AdvancedModelRenderer cube_r153;
    private final AdvancedModelRenderer cube_r154;
    private final AdvancedModelRenderer cube_r155;
    private final AdvancedModelRenderer neck2;
    private final AdvancedModelRenderer cube_r156;
    private final AdvancedModelRenderer Neck2OsteodermsLeft;
    private final AdvancedModelRenderer cube_r157;
    private final AdvancedModelRenderer cube_r158;
    private final AdvancedModelRenderer cube_r159;
    private final AdvancedModelRenderer cube_r160;
    private final AdvancedModelRenderer Neck2OsteodermsRight;
    private final AdvancedModelRenderer cube_r161;
    private final AdvancedModelRenderer cube_r162;
    private final AdvancedModelRenderer cube_r163;
    private final AdvancedModelRenderer cube_r164;
    private final AdvancedModelRenderer head;
    private final AdvancedModelRenderer cube_r165;
    private final AdvancedModelRenderer cube_r166;
    private final AdvancedModelRenderer cube_r167;
    private final AdvancedModelRenderer cube_r168;
    private final AdvancedModelRenderer HeadOsteodermsLeft;
    private final AdvancedModelRenderer cube_r169;
    private final AdvancedModelRenderer cube_r170;
    private final AdvancedModelRenderer cube_r171;
    private final AdvancedModelRenderer cube_r172;
    private final AdvancedModelRenderer cube_r173;
    private final AdvancedModelRenderer cube_r174;
    private final AdvancedModelRenderer HeadOsteodermsRight;
    private final AdvancedModelRenderer cube_r175;
    private final AdvancedModelRenderer cube_r176;
    private final AdvancedModelRenderer cube_r177;
    private final AdvancedModelRenderer cube_r178;
    private final AdvancedModelRenderer cube_r179;
    private final AdvancedModelRenderer cube_r180;
    private final AdvancedModelRenderer jaw;
    private final AdvancedModelRenderer cube_r181;
    private final AdvancedModelRenderer cube_r182;
    private final AdvancedModelRenderer cube_r183;
    private final AdvancedModelRenderer cube_r184;
    private final AdvancedModelRenderer JawOsteodermsLeft;
    private final AdvancedModelRenderer cube_r185;
    private final AdvancedModelRenderer cube_r186;
    private final AdvancedModelRenderer JawOsteodermsRight;
    private final AdvancedModelRenderer cube_r187;
    private final AdvancedModelRenderer cube_r188;
    private final AdvancedModelRenderer eye;
    private final AdvancedModelRenderer cube_r189;

    private ModelAnimator animator;

    public ModelSpicomellus() {

        this.textureWidth = 140;
        this.textureHeight = 140;

        this.main = new AdvancedModelRenderer(this);
        this.main.setRotationPoint(0.0F, 5.0F, 7.0F);
        this.setRotateAngle(main, -0.0873F, 0.0F, 0.0F);
        this.main.cubeList.add(new ModelBox(main, 0, 42, -8.0F, -4.25F, -5.0F, 16, 6, 10, 0.0F, false));
        this.main.cubeList.add(new ModelBox(main, 98, 40, 0.0F, -5.5F, -5.0F, 0, 3, 9, 0.0F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(0.0F, 3.75F, 5.0F);
        this.main.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.4363F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 53, 42, -6.0F, -6.0F, -9.0F, 12, 6, 10, 0.0F, false));

        this.MainOsteodermsLeft = new AdvancedModelRenderer(this);
        this.MainOsteodermsLeft.setRotationPoint(0.0F, -4.0F, -16.5F);
        this.main.addChild(MainOsteodermsLeft);
        this.MainOsteodermsLeft.cubeList.add(new ModelBox(MainOsteodermsLeft, 95, 59, 1.5F, -1.25F, 11.75F, 2, 1, 9, 0.0F, false));
        this.MainOsteodermsLeft.cubeList.add(new ModelBox(MainOsteodermsLeft, 23, 98, 5.0F, -1.25F, 12.0F, 2, 1, 9, 0.0F, false));
        this.MainOsteodermsLeft.cubeList.add(new ModelBox(MainOsteodermsLeft, 101, 129, 8.0F, 0.75F, 13.0F, 1, 1, 3, 0.0F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(8.0F, -0.25F, 11.75F);
        this.MainOsteodermsLeft.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.0F, 0.0F, 0.7854F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 104, 103, 0.0F, -1.0F, 0.25F, 0, 1, 9, 0.0F, false));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(11.8885F, 0.9179F, 21.8645F);
        this.MainOsteodermsLeft.addChild(cube_r3);
        this.setRotateAngle(cube_r3, -0.1537F, 0.9236F, -0.6846F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 82, 113, 0.0F, -1.0F, -7.0F, 1, 1, 7, -0.01F, false));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(8.0F, 2.75F, 16.25F);
        this.MainOsteodermsLeft.addChild(cube_r4);
        this.setRotateAngle(cube_r4, -0.1309F, 0.7854F, -0.6545F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 0, 75, -1.0F, -1.0F, 0.0F, 1, 1, 13, 0.0F, false));

        this.MainOsteodermsRight = new AdvancedModelRenderer(this);
        this.MainOsteodermsRight.setRotationPoint(0.0F, -4.0F, -16.5F);
        this.main.addChild(MainOsteodermsRight);
        this.MainOsteodermsRight.cubeList.add(new ModelBox(MainOsteodermsRight, 95, 59, -3.5F, -1.25F, 11.75F, 2, 1, 9, 0.0F, true));
        this.MainOsteodermsRight.cubeList.add(new ModelBox(MainOsteodermsRight, 23, 98, -7.0F, -1.25F, 12.0F, 2, 1, 9, 0.0F, true));
        this.MainOsteodermsRight.cubeList.add(new ModelBox(MainOsteodermsRight, 101, 129, -9.0F, 0.75F, 13.0F, 1, 1, 3, 0.0F, true));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(-8.0F, -0.25F, 11.75F);
        this.MainOsteodermsRight.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.0F, 0.0F, -0.7854F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 104, 103, 0.0F, -1.0F, 0.25F, 0, 1, 9, 0.0F, true));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(-11.8885F, 0.9179F, 21.8645F);
        this.MainOsteodermsRight.addChild(cube_r6);
        this.setRotateAngle(cube_r6, -0.1537F, -0.9236F, 0.6846F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 82, 113, -1.0F, -1.0F, -7.0F, 1, 1, 7, -0.01F, true));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(-8.0F, 2.75F, 16.25F);
        this.MainOsteodermsRight.addChild(cube_r7);
        this.setRotateAngle(cube_r7, -0.1309F, -0.7854F, 0.6545F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 0, 75, 0.0F, -1.0F, 0.0F, 1, 1, 13, 0.0F, true));

        this.leftLeg = new AdvancedModelRenderer(this);
        this.leftLeg.setRotationPoint(5.0F, 0.75F, 0.0F);
        this.main.addChild(leftLeg);
        this.setRotateAngle(leftLeg, 0.0F, -0.1745F, 0.0F);


        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(3.0F, 9.0F, 0.0F);
        this.leftLeg.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.0F, 0.0F, -0.0873F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 70, 59, -6.0F, -12.0F, -3.0F, 6, 12, 6, 0.0F, false));

        this.leftLeg2 = new AdvancedModelRenderer(this);
        this.leftLeg2.setRotationPoint(0.5F, 8.0F, -1.0F);
        this.leftLeg.addChild(leftLeg2);
        this.setRotateAngle(leftLeg2, 0.48F, 0.0F, 0.0F);
        this.leftLeg2.cubeList.add(new ModelBox(leftLeg2, 65, 104, -2.0F, -0.5F, -1.75F, 4, 8, 4, 0.0F, false));

        this.leftLeg3 = new AdvancedModelRenderer(this);
        this.leftLeg3.setRotationPoint(0.0F, 7.5F, 2.25F);
        this.leftLeg2.addChild(leftLeg3);
        this.setRotateAngle(leftLeg3, -0.6981F, 0.0F, 0.0F);
        this.leftLeg3.cubeList.add(new ModelBox(leftLeg3, 116, 70, -2.0F, 0.0F, -3.0F, 4, 4, 3, -0.01F, false));

        this.leftLeg4 = new AdvancedModelRenderer(this);
        this.leftLeg4.setRotationPoint(0.0F, 3.5F, -1.5F);
        this.leftLeg3.addChild(leftLeg4);
        this.setRotateAngle(leftLeg4, 0.3054F, 0.0F, 0.0F);
        this.leftLeg4.cubeList.add(new ModelBox(leftLeg4, 15, 109, -2.5F, -0.5F, -3.5F, 5, 2, 5, 0.0F, false));

        this.rightLeg = new AdvancedModelRenderer(this);
        this.rightLeg.setRotationPoint(-5.0F, 0.75F, 0.0F);
        this.main.addChild(rightLeg);
        this.setRotateAngle(rightLeg, 0.0F, 0.1745F, 0.0F);


        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(-3.0F, 9.0F, 0.0F);
        this.rightLeg.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.0F, 0.0F, 0.0873F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 70, 59, 0.0F, -12.0F, -3.0F, 6, 12, 6, 0.0F, true));

        this.rightLeg2 = new AdvancedModelRenderer(this);
        this.rightLeg2.setRotationPoint(-0.5F, 8.0F, -1.0F);
        this.rightLeg.addChild(rightLeg2);
        this.setRotateAngle(rightLeg2, 0.48F, 0.0F, 0.0F);
        this.rightLeg2.cubeList.add(new ModelBox(rightLeg2, 65, 104, -2.0F, -0.5F, -1.75F, 4, 8, 4, 0.0F, true));

        this.rightLeg3 = new AdvancedModelRenderer(this);
        this.rightLeg3.setRotationPoint(0.0F, 7.5F, 2.25F);
        this.rightLeg2.addChild(rightLeg3);
        this.setRotateAngle(rightLeg3, -0.6981F, 0.0F, 0.0F);
        this.rightLeg3.cubeList.add(new ModelBox(rightLeg3, 116, 70, -2.0F, 0.0F, -3.0F, 4, 4, 3, -0.01F, true));

        this.rightLeg4 = new AdvancedModelRenderer(this);
        this.rightLeg4.setRotationPoint(0.0F, 3.5F, -1.5F);
        this.rightLeg3.addChild(rightLeg4);
        this.setRotateAngle(rightLeg4, 0.3054F, 0.0F, 0.0F);
        this.rightLeg4.cubeList.add(new ModelBox(rightLeg4, 15, 109, -2.5F, -0.5F, -3.5F, 5, 2, 5, 0.0F, true));

        this.tail = new AdvancedModelRenderer(this);
        this.tail.setRotationPoint(0.0F, -1.25F, 4.5F);
        this.main.addChild(tail);
        this.setRotateAngle(tail, -0.2182F, 0.0F, 0.0F);
        this.tail.cubeList.add(new ModelBox(tail, 65, 0, -5.5F, -2.9F, -0.5F, 11, 6, 6, 0.0F, false));
        this.tail.cubeList.add(new ModelBox(tail, 79, 122, 0.0F, -3.9F, 0.0F, 0, 1, 5, 0.0F, false));

        this.TailOsteodermsLeft = new AdvancedModelRenderer(this);
        this.TailOsteodermsLeft.setRotationPoint(0.0F, -2.9F, 1.75F);
        this.tail.addChild(TailOsteodermsLeft);
        this.TailOsteodermsLeft.cubeList.add(new ModelBox(TailOsteodermsLeft, 53, 117, 1.25F, -1.0F, -1.75F, 1, 1, 5, 0.0F, false));
        this.TailOsteodermsLeft.cubeList.add(new ModelBox(TailOsteodermsLeft, 29, 75, 3.5F, -1.0F, -1.75F, 0, 1, 1, 0.0F, false));

        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(5.7536F, -1.7632F, 2.3126F);
        this.TailOsteodermsLeft.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 0.7801F, 1.2656F, -0.0201F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 123, 103, 0.0F, -1.0F, -4.0F, 1, 1, 4, -0.01F, false));

        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(6.2154F, 0.4669F, 4.1197F);
        this.TailOsteodermsLeft.addChild(cube_r11);
        this.setRotateAngle(cube_r11, 0.7893F, 1.2564F, 0.2625F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 131, 77, 0.0F, -1.0F, -2.0F, 1, 1, 2, -0.01F, false));

        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(3.5F, 2.5F, 2.0F);
        this.TailOsteodermsLeft.addChild(cube_r12);
        this.setRotateAngle(cube_r12, 0.3927F, 0.9599F, -0.1745F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 117, 46, 0.0F, -1.0F, 2.0F, 1, 1, 5, 0.0F, false));

        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(3.5F, 1.0F, 0.5F);
        this.TailOsteodermsLeft.addChild(cube_r13);
        this.setRotateAngle(cube_r13, 0.4363F, 1.0472F, -0.3927F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 100, 0, 0.0F, -1.0F, 0.0F, 1, 1, 9, 0.0F, false));

        this.TailOsteodermsRight = new AdvancedModelRenderer(this);
        this.TailOsteodermsRight.setRotationPoint(0.0F, -2.9F, 1.75F);
        this.tail.addChild(TailOsteodermsRight);
        this.TailOsteodermsRight.cubeList.add(new ModelBox(TailOsteodermsRight, 53, 117, -2.25F, -1.0F, -1.75F, 1, 1, 5, 0.0F, true));
        this.TailOsteodermsRight.cubeList.add(new ModelBox(TailOsteodermsRight, 29, 75, -3.5F, -1.0F, -1.75F, 0, 1, 1, 0.0F, true));

        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(-5.7536F, -1.7632F, 2.3126F);
        this.TailOsteodermsRight.addChild(cube_r14);
        this.setRotateAngle(cube_r14, 0.7801F, -1.2656F, 0.0201F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 123, 103, -1.0F, -1.0F, -4.0F, 1, 1, 4, -0.01F, true));

        this.cube_r15 = new AdvancedModelRenderer(this);
        this.cube_r15.setRotationPoint(-6.2154F, 0.4669F, 4.1197F);
        this.TailOsteodermsRight.addChild(cube_r15);
        this.setRotateAngle(cube_r15, 0.7893F, -1.2564F, -0.2625F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 131, 77, -1.0F, -1.0F, -2.0F, 1, 1, 2, -0.01F, true));

        this.cube_r16 = new AdvancedModelRenderer(this);
        this.cube_r16.setRotationPoint(-3.5F, 2.5F, 2.0F);
        this.TailOsteodermsRight.addChild(cube_r16);
        this.setRotateAngle(cube_r16, 0.3927F, -0.9599F, 0.1745F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 117, 46, -1.0F, -1.0F, 2.0F, 1, 1, 5, 0.0F, true));

        this.cube_r17 = new AdvancedModelRenderer(this);
        this.cube_r17.setRotationPoint(-3.5F, 1.0F, 0.5F);
        this.TailOsteodermsRight.addChild(cube_r17);
        this.setRotateAngle(cube_r17, 0.4363F, -1.0472F, 0.3927F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 100, 0, -1.0F, -1.0F, 0.0F, 1, 1, 9, 0.0F, true));

        this.tail2 = new AdvancedModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, -1.0F, 5.0F);
        this.tail.addChild(tail2);
        this.setRotateAngle(tail2, 0.1309F, 0.0F, 0.0F);
        this.tail2.cubeList.add(new ModelBox(tail2, 0, 59, -3.0F, -1.8F, -0.5F, 6, 5, 10, 0.0F, false));
        this.tail2.cubeList.add(new ModelBox(tail2, 29, 78, 0.0F, -2.8F, 1.25F, 0, 1, 1, 0.0F, false));
        this.tail2.cubeList.add(new ModelBox(tail2, 117, 18, -1.0F, -2.55F, 3.25F, 2, 1, 5, 0.0F, false));

        this.Tail2OsteodermsLeft = new AdvancedModelRenderer(this);
        this.Tail2OsteodermsLeft.setRotationPoint(-0.25F, -0.55F, -4.0F);
        this.tail2.addChild(Tail2OsteodermsLeft);
        this.Tail2OsteodermsLeft.cubeList.add(new ModelBox(Tail2OsteodermsLeft, 29, 81, 1.5F, -2.25F, 5.25F, 0, 1, 1, 0.0F, false));

        this.cube_r18 = new AdvancedModelRenderer(this);
        this.cube_r18.setRotationPoint(0.75F, 1.0F, 13.75F);
        this.Tail2OsteodermsLeft.addChild(cube_r18);
        this.setRotateAngle(cube_r18, 0.2182F, 0.7854F, 0.0F);
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 131, 85, 1.5F, -1.0F, 0.5F, 1, 1, 2, 0.0F, false));

        this.cube_r19 = new AdvancedModelRenderer(this);
        this.cube_r19.setRotationPoint(0.75F, 1.0F, 11.0F);
        this.Tail2OsteodermsLeft.addChild(cube_r19);
        this.setRotateAngle(cube_r19, 0.2182F, 0.7854F, 0.0F);
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 131, 81, 1.5F, -1.0F, 1.0F, 1, 1, 2, 0.0F, false));

        this.cube_r20 = new AdvancedModelRenderer(this);
        this.cube_r20.setRotationPoint(0.75F, 0.75F, 8.25F);
        this.Tail2OsteodermsLeft.addChild(cube_r20);
        this.setRotateAngle(cube_r20, 0.2182F, 0.7854F, 0.0F);
        this.cube_r20.cubeList.add(new ModelBox(cube_r20, 11, 130, 1.5F, -1.0F, 1.0F, 1, 1, 3, 0.0F, false));

        this.cube_r21 = new AdvancedModelRenderer(this);
        this.cube_r21.setRotationPoint(0.75F, 0.75F, 5.5F);
        this.Tail2OsteodermsLeft.addChild(cube_r21);
        this.setRotateAngle(cube_r21, 0.2182F, 0.7854F, 0.0F);
        this.cube_r21.cubeList.add(new ModelBox(cube_r21, 13, 124, 1.5F, -1.0F, 0.75F, 1, 1, 4, 0.0F, false));

        this.Tail2OsteodermsRight = new AdvancedModelRenderer(this);
        this.Tail2OsteodermsRight.setRotationPoint(0.25F, -0.55F, -4.0F);
        this.tail2.addChild(Tail2OsteodermsRight);
        this.Tail2OsteodermsRight.cubeList.add(new ModelBox(Tail2OsteodermsRight, 29, 81, -1.5F, -2.25F, 5.25F, 0, 1, 1, 0.0F, true));

        this.cube_r22 = new AdvancedModelRenderer(this);
        this.cube_r22.setRotationPoint(-0.75F, 1.0F, 13.75F);
        this.Tail2OsteodermsRight.addChild(cube_r22);
        this.setRotateAngle(cube_r22, 0.2182F, -0.7854F, 0.0F);
        this.cube_r22.cubeList.add(new ModelBox(cube_r22, 131, 85, -2.5F, -1.0F, 0.5F, 1, 1, 2, 0.0F, true));

        this.cube_r23 = new AdvancedModelRenderer(this);
        this.cube_r23.setRotationPoint(-0.75F, 1.0F, 11.0F);
        this.Tail2OsteodermsRight.addChild(cube_r23);
        this.setRotateAngle(cube_r23, 0.2182F, -0.7854F, 0.0F);
        this.cube_r23.cubeList.add(new ModelBox(cube_r23, 131, 81, -2.5F, -1.0F, 1.0F, 1, 1, 2, 0.0F, true));

        this.cube_r24 = new AdvancedModelRenderer(this);
        this.cube_r24.setRotationPoint(-0.75F, 0.75F, 8.25F);
        this.Tail2OsteodermsRight.addChild(cube_r24);
        this.setRotateAngle(cube_r24, 0.2182F, -0.7854F, 0.0F);
        this.cube_r24.cubeList.add(new ModelBox(cube_r24, 11, 130, -2.5F, -1.0F, 1.0F, 1, 1, 3, 0.0F, true));

        this.cube_r25 = new AdvancedModelRenderer(this);
        this.cube_r25.setRotationPoint(-0.75F, 0.75F, 5.5F);
        this.Tail2OsteodermsRight.addChild(cube_r25);
        this.setRotateAngle(cube_r25, 0.2182F, -0.7854F, 0.0F);
        this.cube_r25.cubeList.add(new ModelBox(cube_r25, 13, 124, -2.5F, -1.0F, 0.75F, 1, 1, 4, 0.0F, true));

        this.tail3 = new AdvancedModelRenderer(this);
        this.tail3.setRotationPoint(0.0F, -0.0436F, 8.9991F);
        this.tail2.addChild(tail3);
        this.setRotateAngle(tail3, 0.0436F, 0.0F, 0.0F);
        this.tail3.cubeList.add(new ModelBox(tail3, 33, 70, -2.0F, -1.7F, -0.5F, 4, 4, 10, 0.0F, false));
        this.tail3.cubeList.add(new ModelBox(tail3, 113, 25, -1.0F, -2.2064F, 0.5009F, 2, 1, 7, 0.0F, false));

        this.Tail3OsteodermsLeft = new AdvancedModelRenderer(this);
        this.Tail3OsteodermsLeft.setRotationPoint(-1.5F, 0.2436F, 1.2509F);
        this.tail3.addChild(Tail3OsteodermsLeft);


        this.cube_r26 = new AdvancedModelRenderer(this);
        this.cube_r26.setRotationPoint(0.0F, 0.0F, 7.5F);
        this.Tail3OsteodermsLeft.addChild(cube_r26);
        this.setRotateAngle(cube_r26, 0.2182F, 0.7854F, 0.0F);
        this.cube_r26.cubeList.add(new ModelBox(cube_r26, 131, 97, 1.5F, -1.0F, 1.75F, 1, 1, 2, 0.0F, false));

        this.cube_r27 = new AdvancedModelRenderer(this);
        this.cube_r27.setRotationPoint(0.0F, 0.5F, 5.0F);
        this.Tail3OsteodermsLeft.addChild(cube_r27);
        this.setRotateAngle(cube_r27, 0.2182F, 0.7854F, 0.0F);
        this.cube_r27.cubeList.add(new ModelBox(cube_r27, 131, 93, 1.5F, -1.0F, 2.25F, 1, 1, 2, 0.0F, false));

        this.cube_r28 = new AdvancedModelRenderer(this);
        this.cube_r28.setRotationPoint(0.0F, 0.75F, 0.0F);
        this.Tail3OsteodermsLeft.addChild(cube_r28);
        this.setRotateAngle(cube_r28, 0.2182F, 0.7854F, 0.0F);
        this.cube_r28.cubeList.add(new ModelBox(cube_r28, 20, 130, 1.5F, -1.0F, 1.75F, 1, 1, 3, 0.0F, false));

        this.cube_r29 = new AdvancedModelRenderer(this);
        this.cube_r29.setRotationPoint(0.0F, 0.75F, 2.5F);
        this.Tail3OsteodermsLeft.addChild(cube_r29);
        this.setRotateAngle(cube_r29, 0.2182F, 0.7854F, 0.0F);
        this.cube_r29.cubeList.add(new ModelBox(cube_r29, 131, 89, 1.5F, -1.0F, 2.5F, 1, 1, 2, 0.0F, false));

        this.Tail3OsteodermsRight = new AdvancedModelRenderer(this);
        this.Tail3OsteodermsRight.setRotationPoint(1.5F, 0.2436F, 1.2509F);
        this.tail3.addChild(Tail3OsteodermsRight);


        this.cube_r30 = new AdvancedModelRenderer(this);
        this.cube_r30.setRotationPoint(0.0F, 0.0F, 7.5F);
        this.Tail3OsteodermsRight.addChild(cube_r30);
        this.setRotateAngle(cube_r30, 0.2182F, -0.7854F, 0.0F);
        this.cube_r30.cubeList.add(new ModelBox(cube_r30, 131, 97, -2.5F, -1.0F, 1.75F, 1, 1, 2, 0.0F, true));

        this.cube_r31 = new AdvancedModelRenderer(this);
        this.cube_r31.setRotationPoint(0.0F, 0.5F, 5.0F);
        this.Tail3OsteodermsRight.addChild(cube_r31);
        this.setRotateAngle(cube_r31, 0.2182F, -0.7854F, 0.0F);
        this.cube_r31.cubeList.add(new ModelBox(cube_r31, 131, 93, -2.5F, -1.0F, 2.25F, 1, 1, 2, 0.0F, true));

        this.cube_r32 = new AdvancedModelRenderer(this);
        this.cube_r32.setRotationPoint(0.0F, 0.75F, 0.0F);
        this.Tail3OsteodermsRight.addChild(cube_r32);
        this.setRotateAngle(cube_r32, 0.2182F, -0.7854F, 0.0F);
        this.cube_r32.cubeList.add(new ModelBox(cube_r32, 20, 130, -2.5F, -1.0F, 1.75F, 1, 1, 3, 0.0F, true));

        this.cube_r33 = new AdvancedModelRenderer(this);
        this.cube_r33.setRotationPoint(0.0F, 0.75F, 2.5F);
        this.Tail3OsteodermsRight.addChild(cube_r33);
        this.setRotateAngle(cube_r33, 0.2182F, -0.7854F, 0.0F);
        this.cube_r33.cubeList.add(new ModelBox(cube_r33, 131, 89, -2.5F, -1.0F, 2.5F, 1, 1, 2, 0.0F, true));

        this.tail4 = new AdvancedModelRenderer(this);
        this.tail4.setRotationPoint(0.0F, -0.6436F, 8.9991F);
        this.tail3.addChild(tail4);
        this.setRotateAngle(tail4, 0.0436F, 0.0F, 0.0F);
        this.tail4.cubeList.add(new ModelBox(tail4, 62, 78, -1.5F, -1.0F, -0.5F, 3, 3, 10, 0.0F, false));

        this.Tail4OsteodermsLeft = new AdvancedModelRenderer(this);
        this.Tail4OsteodermsLeft.setRotationPoint(1.5F, -0.25F, 1.5F);
        this.tail4.addChild(Tail4OsteodermsLeft);


        this.cube_r34 = new AdvancedModelRenderer(this);
        this.cube_r34.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Tail4OsteodermsLeft.addChild(cube_r34);
        this.setRotateAngle(cube_r34, 0.0436F, 0.0F, -0.2618F);
        this.cube_r34.cubeList.add(new ModelBox(cube_r34, 36, 116, -0.5F, 0.0F, 0.0F, 1, 0, 7, 0.0F, false));

        this.Tail4OsteodermsRight = new AdvancedModelRenderer(this);
        this.Tail4OsteodermsRight.setRotationPoint(-1.5F, -0.25F, 1.5F);
        this.tail4.addChild(Tail4OsteodermsRight);


        this.cube_r35 = new AdvancedModelRenderer(this);
        this.cube_r35.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Tail4OsteodermsRight.addChild(cube_r35);
        this.setRotateAngle(cube_r35, 0.0436F, 0.0F, 0.2618F);
        this.cube_r35.cubeList.add(new ModelBox(cube_r35, 36, 116, -0.5F, 0.0F, 0.0F, 1, 0, 7, 0.0F, true));

        this.tail5 = new AdvancedModelRenderer(this);
        this.tail5.setRotationPoint(0.0F, -0.5F, 9.0F);
        this.tail4.addChild(tail5);
        this.tail5.cubeList.add(new ModelBox(tail5, 89, 78, -1.0F, -0.4F, -0.5F, 2, 2, 10, 0.0F, false));

        this.Tail5OsteodermsLeft = new AdvancedModelRenderer(this);
        this.Tail5OsteodermsLeft.setRotationPoint(1.0F, 0.6372F, 0.0019F);
        this.tail5.addChild(Tail5OsteodermsLeft);


        this.cube_r36 = new AdvancedModelRenderer(this);
        this.cube_r36.setRotationPoint(0.0F, -0.1F, 9.0F);
        this.Tail5OsteodermsLeft.addChild(cube_r36);
        this.setRotateAngle(cube_r36, 0.2182F, 0.2618F, -0.0436F);
        this.cube_r36.cubeList.add(new ModelBox(cube_r36, 66, 117, -1.0F, -1.0F, 0.0F, 1, 1, 5, 0.0F, false));

        this.cube_r37 = new AdvancedModelRenderer(this);
        this.cube_r37.setRotationPoint(0.0F, 0.0F, 6.5F);
        this.Tail5OsteodermsLeft.addChild(cube_r37);
        this.setRotateAngle(cube_r37, 0.1309F, 0.5672F, -0.1745F);
        this.cube_r37.cubeList.add(new ModelBox(cube_r37, 99, 114, -1.0F, -1.0F, 0.0F, 1, 1, 7, 0.0F, false));

        this.cube_r38 = new AdvancedModelRenderer(this);
        this.cube_r38.setRotationPoint(0.0F, 0.0F, 4.5F);
        this.Tail5OsteodermsLeft.addChild(cube_r38);
        this.setRotateAngle(cube_r38, 0.0F, 0.8727F, -0.3054F);
        this.cube_r38.cubeList.add(new ModelBox(cube_r38, 114, 78, -1.0F, -1.0F, 0.0F, 1, 1, 7, 0.0F, false));

        this.cube_r39 = new AdvancedModelRenderer(this);
        this.cube_r39.setRotationPoint(0.0F, 0.0F, 3.0F);
        this.Tail5OsteodermsLeft.addChild(cube_r39);
        this.setRotateAngle(cube_r39, 0.0F, 1.1781F, -0.1745F);
        this.cube_r39.cubeList.add(new ModelBox(cube_r39, 116, 114, -1.0F, -1.0F, 0.0F, 1, 1, 6, 0.0F, false));

        this.cube_r40 = new AdvancedModelRenderer(this);
        this.cube_r40.setRotationPoint(0.0F, 0.0F, 1.6F);
        this.Tail5OsteodermsLeft.addChild(cube_r40);
        this.setRotateAngle(cube_r40, 0.0F, 1.3526F, -0.1745F);
        this.cube_r40.cubeList.add(new ModelBox(cube_r40, 24, 124, -1.0F, -1.0F, 0.0F, 1, 1, 4, 0.0F, false));

        this.cube_r41 = new AdvancedModelRenderer(this);
        this.cube_r41.setRotationPoint(0.0F, 0.0F, 0.25F);
        this.Tail5OsteodermsLeft.addChild(cube_r41);
        this.setRotateAngle(cube_r41, 0.0F, 1.4835F, -0.1745F);
        this.cube_r41.cubeList.add(new ModelBox(cube_r41, 110, 131, -1.0F, -1.0F, 0.0F, 1, 1, 2, 0.0F, false));

        this.Tail5OsteodermsRight = new AdvancedModelRenderer(this);
        this.Tail5OsteodermsRight.setRotationPoint(-1.0F, 0.6372F, 0.0019F);
        this.tail5.addChild(Tail5OsteodermsRight);


        this.cube_r42 = new AdvancedModelRenderer(this);
        this.cube_r42.setRotationPoint(0.0F, -0.1F, 9.0F);
        this.Tail5OsteodermsRight.addChild(cube_r42);
        this.setRotateAngle(cube_r42, 0.2182F, -0.2618F, 0.0436F);
        this.cube_r42.cubeList.add(new ModelBox(cube_r42, 66, 117, 0.0F, -1.0F, 0.0F, 1, 1, 5, 0.0F, true));

        this.cube_r43 = new AdvancedModelRenderer(this);
        this.cube_r43.setRotationPoint(0.0F, 0.0F, 6.5F);
        this.Tail5OsteodermsRight.addChild(cube_r43);
        this.setRotateAngle(cube_r43, 0.1309F, -0.5672F, 0.1745F);
        this.cube_r43.cubeList.add(new ModelBox(cube_r43, 99, 114, 0.0F, -1.0F, 0.0F, 1, 1, 7, 0.0F, true));

        this.cube_r44 = new AdvancedModelRenderer(this);
        this.cube_r44.setRotationPoint(0.0F, 0.0F, 4.5F);
        this.Tail5OsteodermsRight.addChild(cube_r44);
        this.setRotateAngle(cube_r44, 0.0F, -0.8727F, 0.3054F);
        this.cube_r44.cubeList.add(new ModelBox(cube_r44, 114, 78, 0.0F, -1.0F, 0.0F, 1, 1, 7, 0.0F, true));

        this.cube_r45 = new AdvancedModelRenderer(this);
        this.cube_r45.setRotationPoint(0.0F, 0.0F, 3.0F);
        this.Tail5OsteodermsRight.addChild(cube_r45);
        this.setRotateAngle(cube_r45, 0.0F, -1.1781F, 0.1745F);
        this.cube_r45.cubeList.add(new ModelBox(cube_r45, 116, 114, 0.0F, -1.0F, 0.0F, 1, 1, 6, 0.0F, true));

        this.cube_r46 = new AdvancedModelRenderer(this);
        this.cube_r46.setRotationPoint(0.0F, 0.0F, 1.6F);
        this.Tail5OsteodermsRight.addChild(cube_r46);
        this.setRotateAngle(cube_r46, 0.0F, -1.3526F, 0.1745F);
        this.cube_r46.cubeList.add(new ModelBox(cube_r46, 24, 124, 0.0F, -1.0F, 0.0F, 1, 1, 4, 0.0F, true));

        this.cube_r47 = new AdvancedModelRenderer(this);
        this.cube_r47.setRotationPoint(0.0F, 0.0F, 0.25F);
        this.Tail5OsteodermsRight.addChild(cube_r47);
        this.setRotateAngle(cube_r47, 0.0F, -1.4835F, 0.1745F);
        this.cube_r47.cubeList.add(new ModelBox(cube_r47, 110, 131, 0.0F, -1.0F, 0.0F, 1, 1, 2, 0.0F, true));

        this.body = new AdvancedModelRenderer(this);
        this.body.setRotationPoint(0.0F, -2.25F, -4.5F);
        this.main.addChild(body);
        this.setRotateAngle(body, 0.2618F, 0.0F, 0.0F);
        this.body.cubeList.add(new ModelBox(body, 0, 0, -9.0F, -2.1F, -13.5F, 18, 7, 14, 0.01F, false));

        this.cube_r48 = new AdvancedModelRenderer(this);
        this.cube_r48.setRotationPoint(0.0F, -1.75F, -12.0F);
        this.body.addChild(cube_r48);
        this.setRotateAngle(cube_r48, -0.0873F, 0.0F, 0.0F);
        this.cube_r48.cubeList.add(new ModelBox(cube_r48, 0, 90, 0.0F, -2.75F, 0.25F, 0, 3, 11, 0.0F, false));

        this.cube_r49 = new AdvancedModelRenderer(this);
        this.cube_r49.setRotationPoint(0.0F, 10.0F, -5.5F);
        this.body.addChild(cube_r49);
        this.setRotateAngle(cube_r49, -0.1309F, 0.0F, 0.0F);
        this.cube_r49.cubeList.add(new ModelBox(cube_r49, 0, 22, -7.5F, -6.0F, -8.0F, 15, 6, 13, 0.0F, false));

        this.BodyOsteodermsLeft = new AdvancedModelRenderer(this);
        this.BodyOsteodermsLeft.setRotationPoint(12.0795F, 3.3761F, -11.7586F);
        this.body.addChild(BodyOsteodermsLeft);


        this.cube_r50 = new AdvancedModelRenderer(this);
        this.cube_r50.setRotationPoint(-12.0795F, -5.1261F, 0.0086F);
        this.BodyOsteodermsLeft.addChild(cube_r50);
        this.setRotateAngle(cube_r50, 0.1745F, 0.0F, 0.0F);
        this.cube_r50.cubeList.add(new ModelBox(cube_r50, 116, 122, 6.0F, -1.75F, -1.5F, 2, 2, 3, 0.0F, false));

        this.cube_r51 = new AdvancedModelRenderer(this);
        this.cube_r51.setRotationPoint(-3.0795F, -2.6261F, 1.5086F);
        this.BodyOsteodermsLeft.addChild(cube_r51);
        this.setRotateAngle(cube_r51, 0.0F, 0.1745F, 0.0F);
        this.cube_r51.cubeList.add(new ModelBox(cube_r51, 90, 123, 0.0F, -2.0F, -3.0F, 2, 2, 3, 0.0F, false));

        this.cube_r52 = new AdvancedModelRenderer(this);
        this.cube_r52.setRotationPoint(-3.0795F, -2.6261F, 2.2586F);
        this.BodyOsteodermsLeft.addChild(cube_r52);
        this.setRotateAngle(cube_r52, 0.0F, -0.0873F, 0.0F);
        this.cube_r52.cubeList.add(new ModelBox(cube_r52, 94, 13, 0.0F, -2.0F, 0.0F, 2, 2, 9, 0.0F, false));

        this.cube_r53 = new AdvancedModelRenderer(this);
        this.cube_r53.setRotationPoint(-3.0795F, -5.4761F, 1.5086F);
        this.BodyOsteodermsLeft.addChild(cube_r53);
        this.setRotateAngle(cube_r53, 0.2618F, 0.0F, 0.7854F);
        this.cube_r53.cubeList.add(new ModelBox(cube_r53, 62, 70, 0.0F, -1.9F, -3.0F, 0, 2, 3, 0.0F, false));

        this.cube_r54 = new AdvancedModelRenderer(this);
        this.cube_r54.setRotationPoint(-3.0795F, -5.4761F, 2.2586F);
        this.BodyOsteodermsLeft.addChild(cube_r54);
        this.setRotateAngle(cube_r54, -0.1309F, 0.0F, 0.7854F);
        this.cube_r54.cubeList.add(new ModelBox(cube_r54, 46, 104, 0.0F, -1.9F, 0.0F, 0, 2, 9, 0.0F, false));

        this.cube_r55 = new AdvancedModelRenderer(this);
        this.cube_r55.setRotationPoint(-12.0795F, -5.1261F, 0.0086F);
        this.BodyOsteodermsLeft.addChild(cube_r55);
        this.setRotateAngle(cube_r55, -0.0873F, 0.0F, 0.0F);
        this.cube_r55.cubeList.add(new ModelBox(cube_r55, 60, 92, 6.0F, -2.25F, 2.25F, 2, 2, 9, 0.0F, false));

        this.cube_r56 = new AdvancedModelRenderer(this);
        this.cube_r56.setRotationPoint(-12.0795F, -5.1261F, -0.2414F);
        this.BodyOsteodermsLeft.addChild(cube_r56);
        this.setRotateAngle(cube_r56, -0.0873F, 0.0F, 0.0F);
        this.cube_r56.cubeList.add(new ModelBox(cube_r56, 89, 91, 2.0F, -2.25F, 2.25F, 2, 2, 9, 0.0F, false));

        this.cube_r57 = new AdvancedModelRenderer(this);
        this.cube_r57.setRotationPoint(-9.8295F, -5.1261F, 0.0086F);
        this.BodyOsteodermsLeft.addChild(cube_r57);
        this.setRotateAngle(cube_r57, -0.2618F, 0.0F, 0.2182F);
        this.cube_r57.cubeList.add(new ModelBox(cube_r57, 132, 41, 0.0F, -3.25F, 0.0F, 1, 3, 1, 0.0F, false));

        this.cube_r58 = new AdvancedModelRenderer(this);
        this.cube_r58.setRotationPoint(-10.0795F, -5.1261F, -1.9914F);
        this.BodyOsteodermsLeft.addChild(cube_r58);
        this.setRotateAngle(cube_r58, -0.3054F, 0.0F, 0.2618F);
        this.cube_r58.cubeList.add(new ModelBox(cube_r58, 74, 131, 0.0F, -4.25F, 0.0F, 1, 4, 1, 0.0F, false));

        this.cube_r59 = new AdvancedModelRenderer(this);
        this.cube_r59.setRotationPoint(-1.25F, -1.75F, 11.5F);
        this.BodyOsteodermsLeft.addChild(cube_r59);
        this.setRotateAngle(cube_r59, 0.298F, -1.1583F, 0.0295F);
        this.cube_r59.cubeList.add(new ModelBox(cube_r59, 132, 32, -0.4226F, 0.0F, -0.9063F, 2, 1, 1, 0.0F, false));

        this.cube_r60 = new AdvancedModelRenderer(this);
        this.cube_r60.setRotationPoint(-1.25F, -1.75F, 11.5F);
        this.BodyOsteodermsLeft.addChild(cube_r60);
        this.setRotateAngle(cube_r60, 0.1817F, -0.8609F, 0.1654F);
        this.cube_r60.cubeList.add(new ModelBox(cube_r60, 132, 35, -2.1305F, 0.0F, -0.9914F, 2, 1, 1, 0.01F, false));

        this.cube_r61 = new AdvancedModelRenderer(this);
        this.cube_r61.setRotationPoint(-1.25F, -1.75F, 11.5F);
        this.BodyOsteodermsLeft.addChild(cube_r61);
        this.setRotateAngle(cube_r61, 0.148F, -0.6457F, 0.2144F);
        this.cube_r61.cubeList.add(new ModelBox(cube_r61, 131, 62, -3.8654F, 0.0F, -1.4291F, 2, 1, 2, 0.02F, false));

        this.cube_r62 = new AdvancedModelRenderer(this);
        this.cube_r62.setRotationPoint(-1.25F, -1.75F, 11.5F);
        this.BodyOsteodermsLeft.addChild(cube_r62);
        this.setRotateAngle(cube_r62, 0.1235F, -0.2997F, 0.2672F);
        this.cube_r62.cubeList.add(new ModelBox(cube_r62, 132, 38, -2.0F, 0.0F, -1.0F, 2, 1, 1, 0.0F, false));

        this.cube_r63 = new AdvancedModelRenderer(this);
        this.cube_r63.setRotationPoint(0.25F, -0.9F, 8.15F);
        this.BodyOsteodermsLeft.addChild(cube_r63);
        this.setRotateAngle(cube_r63, 0.2386F, -0.9382F, 0.0957F);
        this.cube_r63.cubeList.add(new ModelBox(cube_r63, 132, 26, -0.4226F, 0.0F, -0.9063F, 2, 1, 1, 0.0F, false));

        this.cube_r64 = new AdvancedModelRenderer(this);
        this.cube_r64.setRotationPoint(0.25F, -0.9F, 8.15F);
        this.BodyOsteodermsLeft.addChild(cube_r64);
        this.setRotateAngle(cube_r64, 0.1749F, -0.639F, 0.1844F);
        this.cube_r64.cubeList.add(new ModelBox(cube_r64, 132, 29, -2.1305F, 0.0F, -0.9914F, 2, 1, 1, 0.01F, false));

        this.cube_r65 = new AdvancedModelRenderer(this);
        this.cube_r65.setRotationPoint(0.25F, -0.9F, 8.15F);
        this.BodyOsteodermsLeft.addChild(cube_r65);
        this.setRotateAngle(cube_r65, 0.1539F, -0.4237F, 0.2257F);
        this.cube_r65.cubeList.add(new ModelBox(cube_r65, 0, 125, -4.8654F, 0.0F, -1.4291F, 3, 1, 2, 0.02F, false));

        this.cube_r66 = new AdvancedModelRenderer(this);
        this.cube_r66.setRotationPoint(0.25F, -0.9F, 8.15F);
        this.BodyOsteodermsLeft.addChild(cube_r66);
        this.setRotateAngle(cube_r66, 0.1406F, -0.0784F, 0.2783F);
        this.cube_r66.cubeList.add(new ModelBox(cube_r66, 90, 129, -4.0F, 0.0F, -1.0F, 4, 1, 1, 0.0F, false));

        this.cube_r67 = new AdvancedModelRenderer(this);
        this.cube_r67.setRotationPoint(1.0F, -0.25F, 4.0F);
        this.BodyOsteodermsLeft.addChild(cube_r67);
        this.setRotateAngle(cube_r67, 0.2098F, -0.7166F, 0.1218F);
        this.cube_r67.cubeList.add(new ModelBox(cube_r67, 132, 20, -0.4226F, 0.0F, -0.9063F, 2, 1, 1, 0.0F, false));

        this.cube_r68 = new AdvancedModelRenderer(this);
        this.cube_r68.setRotationPoint(1.0F, -0.25F, 4.0F);
        this.BodyOsteodermsLeft.addChild(cube_r68);
        this.setRotateAngle(cube_r68, 0.1726F, -0.4166F, 0.1903F);
        this.cube_r68.cubeList.add(new ModelBox(cube_r68, 132, 23, -2.1305F, 0.0F, -0.9914F, 2, 1, 1, 0.01F, false));

        this.cube_r69 = new AdvancedModelRenderer(this);
        this.cube_r69.setRotationPoint(1.0F, -0.25F, 4.0F);
        this.BodyOsteodermsLeft.addChild(cube_r69);
        this.setRotateAngle(cube_r69, 0.1609F, -0.2014F, 0.2283F);
        this.cube_r69.cubeList.add(new ModelBox(cube_r69, 68, 124, -4.8654F, 0.0F, -1.4291F, 3, 1, 2, 0.02F, false));

        this.cube_r70 = new AdvancedModelRenderer(this);
        this.cube_r70.setRotationPoint(1.0F, -0.25F, 4.0F);
        this.BodyOsteodermsLeft.addChild(cube_r70);
        this.setRotateAngle(cube_r70, 0.1593F, 0.1433F, 0.2837F);
        this.cube_r70.cubeList.add(new ModelBox(cube_r70, 121, 8, -5.0F, 0.0F, -1.0F, 5, 1, 1, 0.0F, false));

        this.cube_r71 = new AdvancedModelRenderer(this);
        this.cube_r71.setRotationPoint(0.0F, -0.2F, -0.5F);
        this.BodyOsteodermsLeft.addChild(cube_r71);
        this.setRotateAngle(cube_r71, 0.0628F, -0.3879F, 0.1885F);
        this.cube_r71.cubeList.add(new ModelBox(cube_r71, 132, 14, -0.4226F, 0.0F, -0.9063F, 2, 1, 1, 0.0F, false));

        this.cube_r72 = new AdvancedModelRenderer(this);
        this.cube_r72.setRotationPoint(0.0F, -0.2F, -0.5F);
        this.BodyOsteodermsLeft.addChild(cube_r72);
        this.setRotateAngle(cube_r72, 0.0583F, -0.083F, 0.2074F);
        this.cube_r72.cubeList.add(new ModelBox(cube_r72, 132, 17, -2.1305F, 0.0F, -0.9914F, 2, 1, 1, 0.01F, false));

        this.cube_r73 = new AdvancedModelRenderer(this);
        this.cube_r73.setRotationPoint(0.0F, -0.2F, -0.5F);
        this.BodyOsteodermsLeft.addChild(cube_r73);
        this.setRotateAngle(cube_r73, 0.0587F, 0.1348F, 0.2202F);
        this.cube_r73.cubeList.add(new ModelBox(cube_r73, 131, 58, -3.8654F, 0.0F, -1.4291F, 2, 1, 2, 0.02F, false));

        this.cube_r74 = new AdvancedModelRenderer(this);
        this.cube_r74.setRotationPoint(0.0F, -0.2F, -0.5F);
        this.BodyOsteodermsLeft.addChild(cube_r74);
        this.setRotateAngle(cube_r74, 0.0656F, 0.4832F, 0.2428F);
        this.cube_r74.cubeList.add(new ModelBox(cube_r74, 79, 129, -4.0F, 0.0F, -1.0F, 4, 1, 1, 0.0F, false));

        this.BodyOsteodermsRight = new AdvancedModelRenderer(this);
        this.BodyOsteodermsRight.setRotationPoint(-12.0795F, 3.3761F, -11.7586F);
        this.body.addChild(BodyOsteodermsRight);


        this.cube_r75 = new AdvancedModelRenderer(this);
        this.cube_r75.setRotationPoint(12.0795F, -5.1261F, 0.0086F);
        this.BodyOsteodermsRight.addChild(cube_r75);
        this.setRotateAngle(cube_r75, 0.1745F, 0.0F, 0.0F);
        this.cube_r75.cubeList.add(new ModelBox(cube_r75, 116, 122, -8.0F, -1.75F, -1.5F, 2, 2, 3, 0.0F, true));

        this.cube_r76 = new AdvancedModelRenderer(this);
        this.cube_r76.setRotationPoint(3.0795F, -2.6261F, 1.5086F);
        this.BodyOsteodermsRight.addChild(cube_r76);
        this.setRotateAngle(cube_r76, 0.0F, -0.1745F, 0.0F);
        this.cube_r76.cubeList.add(new ModelBox(cube_r76, 90, 123, -2.0F, -2.0F, -3.0F, 2, 2, 3, 0.0F, true));

        this.cube_r77 = new AdvancedModelRenderer(this);
        this.cube_r77.setRotationPoint(3.0795F, -2.6261F, 2.2586F);
        this.BodyOsteodermsRight.addChild(cube_r77);
        this.setRotateAngle(cube_r77, 0.0F, 0.0873F, 0.0F);
        this.cube_r77.cubeList.add(new ModelBox(cube_r77, 94, 13, -2.0F, -2.0F, 0.0F, 2, 2, 9, 0.0F, true));

        this.cube_r78 = new AdvancedModelRenderer(this);
        this.cube_r78.setRotationPoint(3.0795F, -5.4761F, 1.5086F);
        this.BodyOsteodermsRight.addChild(cube_r78);
        this.setRotateAngle(cube_r78, 0.2618F, 0.0F, -0.7854F);
        this.cube_r78.cubeList.add(new ModelBox(cube_r78, 62, 70, 0.0F, -1.9F, -3.0F, 0, 2, 3, 0.0F, true));

        this.cube_r79 = new AdvancedModelRenderer(this);
        this.cube_r79.setRotationPoint(3.0795F, -5.4761F, 2.2586F);
        this.BodyOsteodermsRight.addChild(cube_r79);
        this.setRotateAngle(cube_r79, -0.1309F, 0.0F, -0.7854F);
        this.cube_r79.cubeList.add(new ModelBox(cube_r79, 46, 104, 0.0F, -1.9F, 0.0F, 0, 2, 9, 0.0F, true));

        this.cube_r80 = new AdvancedModelRenderer(this);
        this.cube_r80.setRotationPoint(12.0795F, -5.1261F, 0.0086F);
        this.BodyOsteodermsRight.addChild(cube_r80);
        this.setRotateAngle(cube_r80, -0.0873F, 0.0F, 0.0F);
        this.cube_r80.cubeList.add(new ModelBox(cube_r80, 60, 92, -8.0F, -2.25F, 2.25F, 2, 2, 9, 0.0F, true));

        this.cube_r81 = new AdvancedModelRenderer(this);
        this.cube_r81.setRotationPoint(12.0795F, -5.1261F, -0.2414F);
        this.BodyOsteodermsRight.addChild(cube_r81);
        this.setRotateAngle(cube_r81, -0.0873F, 0.0F, 0.0F);
        this.cube_r81.cubeList.add(new ModelBox(cube_r81, 89, 91, -4.0F, -2.25F, 2.25F, 2, 2, 9, 0.0F, true));

        this.cube_r82 = new AdvancedModelRenderer(this);
        this.cube_r82.setRotationPoint(9.8295F, -5.1261F, 0.0086F);
        this.BodyOsteodermsRight.addChild(cube_r82);
        this.setRotateAngle(cube_r82, -0.2618F, 0.0F, -0.2182F);
        this.cube_r82.cubeList.add(new ModelBox(cube_r82, 132, 41, -1.0F, -3.25F, 0.0F, 1, 3, 1, 0.0F, true));

        this.cube_r83 = new AdvancedModelRenderer(this);
        this.cube_r83.setRotationPoint(10.0795F, -5.1261F, -1.9914F);
        this.BodyOsteodermsRight.addChild(cube_r83);
        this.setRotateAngle(cube_r83, -0.3054F, 0.0F, -0.2618F);
        this.cube_r83.cubeList.add(new ModelBox(cube_r83, 74, 131, -1.0F, -4.25F, 0.0F, 1, 4, 1, 0.0F, true));

        this.cube_r84 = new AdvancedModelRenderer(this);
        this.cube_r84.setRotationPoint(1.25F, -1.75F, 11.5F);
        this.BodyOsteodermsRight.addChild(cube_r84);
        this.setRotateAngle(cube_r84, 0.298F, 1.1583F, -0.0295F);
        this.cube_r84.cubeList.add(new ModelBox(cube_r84, 132, 32, -1.5774F, 0.0F, -0.9063F, 2, 1, 1, 0.0F, true));

        this.cube_r85 = new AdvancedModelRenderer(this);
        this.cube_r85.setRotationPoint(1.25F, -1.75F, 11.5F);
        this.BodyOsteodermsRight.addChild(cube_r85);
        this.setRotateAngle(cube_r85, 0.1817F, 0.8609F, -0.1654F);
        this.cube_r85.cubeList.add(new ModelBox(cube_r85, 132, 35, 0.1305F, 0.0F, -0.9914F, 2, 1, 1, 0.01F, true));

        this.cube_r86 = new AdvancedModelRenderer(this);
        this.cube_r86.setRotationPoint(1.25F, -1.75F, 11.5F);
        this.BodyOsteodermsRight.addChild(cube_r86);
        this.setRotateAngle(cube_r86, 0.148F, 0.6457F, -0.2144F);
        this.cube_r86.cubeList.add(new ModelBox(cube_r86, 131, 62, 1.8654F, 0.0F, -1.4291F, 2, 1, 2, 0.02F, true));

        this.cube_r87 = new AdvancedModelRenderer(this);
        this.cube_r87.setRotationPoint(1.25F, -1.75F, 11.5F);
        this.BodyOsteodermsRight.addChild(cube_r87);
        this.setRotateAngle(cube_r87, 0.1235F, 0.2997F, -0.2672F);
        this.cube_r87.cubeList.add(new ModelBox(cube_r87, 132, 38, 0.0F, 0.0F, -1.0F, 2, 1, 1, 0.0F, true));

        this.cube_r88 = new AdvancedModelRenderer(this);
        this.cube_r88.setRotationPoint(-0.25F, -0.9F, 8.15F);
        this.BodyOsteodermsRight.addChild(cube_r88);
        this.setRotateAngle(cube_r88, 0.2386F, 0.9382F, -0.0957F);
        this.cube_r88.cubeList.add(new ModelBox(cube_r88, 132, 26, -1.5774F, 0.0F, -0.9063F, 2, 1, 1, 0.0F, true));

        this.cube_r89 = new AdvancedModelRenderer(this);
        this.cube_r89.setRotationPoint(-0.25F, -0.9F, 8.15F);
        this.BodyOsteodermsRight.addChild(cube_r89);
        this.setRotateAngle(cube_r89, 0.1749F, 0.639F, -0.1844F);
        this.cube_r89.cubeList.add(new ModelBox(cube_r89, 132, 29, 0.1305F, 0.0F, -0.9914F, 2, 1, 1, 0.01F, true));

        this.cube_r90 = new AdvancedModelRenderer(this);
        this.cube_r90.setRotationPoint(-0.25F, -0.9F, 8.15F);
        this.BodyOsteodermsRight.addChild(cube_r90);
        this.setRotateAngle(cube_r90, 0.1539F, 0.4237F, -0.2257F);
        this.cube_r90.cubeList.add(new ModelBox(cube_r90, 0, 125, 1.8654F, 0.0F, -1.4291F, 3, 1, 2, 0.02F, true));

        this.cube_r91 = new AdvancedModelRenderer(this);
        this.cube_r91.setRotationPoint(-0.25F, -0.9F, 8.15F);
        this.BodyOsteodermsRight.addChild(cube_r91);
        this.setRotateAngle(cube_r91, 0.1406F, 0.0784F, -0.2783F);
        this.cube_r91.cubeList.add(new ModelBox(cube_r91, 90, 129, 0.0F, 0.0F, -1.0F, 4, 1, 1, 0.0F, true));

        this.cube_r92 = new AdvancedModelRenderer(this);
        this.cube_r92.setRotationPoint(-1.0F, -0.25F, 4.0F);
        this.BodyOsteodermsRight.addChild(cube_r92);
        this.setRotateAngle(cube_r92, 0.2098F, 0.7166F, -0.1218F);
        this.cube_r92.cubeList.add(new ModelBox(cube_r92, 132, 20, -1.5774F, 0.0F, -0.9063F, 2, 1, 1, 0.0F, true));

        this.cube_r93 = new AdvancedModelRenderer(this);
        this.cube_r93.setRotationPoint(-1.0F, -0.25F, 4.0F);
        this.BodyOsteodermsRight.addChild(cube_r93);
        this.setRotateAngle(cube_r93, 0.1726F, 0.4166F, -0.1903F);
        this.cube_r93.cubeList.add(new ModelBox(cube_r93, 132, 23, 0.1305F, 0.0F, -0.9914F, 2, 1, 1, 0.01F, true));

        this.cube_r94 = new AdvancedModelRenderer(this);
        this.cube_r94.setRotationPoint(-1.0F, -0.25F, 4.0F);
        this.BodyOsteodermsRight.addChild(cube_r94);
        this.setRotateAngle(cube_r94, 0.1609F, 0.2014F, -0.2283F);
        this.cube_r94.cubeList.add(new ModelBox(cube_r94, 68, 124, 1.8654F, 0.0F, -1.4291F, 3, 1, 2, 0.02F, true));

        this.cube_r95 = new AdvancedModelRenderer(this);
        this.cube_r95.setRotationPoint(-1.0F, -0.25F, 4.0F);
        this.BodyOsteodermsRight.addChild(cube_r95);
        this.setRotateAngle(cube_r95, 0.1593F, -0.1433F, -0.2837F);
        this.cube_r95.cubeList.add(new ModelBox(cube_r95, 121, 8, 0.0F, 0.0F, -1.0F, 5, 1, 1, 0.0F, true));

        this.cube_r96 = new AdvancedModelRenderer(this);
        this.cube_r96.setRotationPoint(0.0F, -0.2F, -0.5F);
        this.BodyOsteodermsRight.addChild(cube_r96);
        this.setRotateAngle(cube_r96, 0.0628F, 0.3879F, -0.1885F);
        this.cube_r96.cubeList.add(new ModelBox(cube_r96, 132, 14, -1.5774F, 0.0F, -0.9063F, 2, 1, 1, 0.0F, true));

        this.cube_r97 = new AdvancedModelRenderer(this);
        this.cube_r97.setRotationPoint(0.0F, -0.2F, -0.5F);
        this.BodyOsteodermsRight.addChild(cube_r97);
        this.setRotateAngle(cube_r97, 0.0583F, 0.083F, -0.2074F);
        this.cube_r97.cubeList.add(new ModelBox(cube_r97, 132, 17, 0.1305F, 0.0F, -0.9914F, 2, 1, 1, 0.01F, true));

        this.cube_r98 = new AdvancedModelRenderer(this);
        this.cube_r98.setRotationPoint(0.0F, -0.2F, -0.5F);
        this.BodyOsteodermsRight.addChild(cube_r98);
        this.setRotateAngle(cube_r98, 0.0587F, -0.1348F, -0.2202F);
        this.cube_r98.cubeList.add(new ModelBox(cube_r98, 131, 58, 1.8654F, 0.0F, -1.4291F, 2, 1, 2, 0.02F, true));

        this.cube_r99 = new AdvancedModelRenderer(this);
        this.cube_r99.setRotationPoint(0.0F, -0.2F, -0.5F);
        this.BodyOsteodermsRight.addChild(cube_r99);
        this.setRotateAngle(cube_r99, 0.0656F, -0.4832F, -0.2428F);
        this.cube_r99.cubeList.add(new ModelBox(cube_r99, 79, 129, 0.0F, 0.0F, -1.0F, 4, 1, 1, 0.0F, true));

        this.body2 = new AdvancedModelRenderer(this);
        this.body2.setRotationPoint(0.0F, 0.0F, -13.0F);
        this.body.addChild(body2);
        this.setRotateAngle(body2, 0.1745F, 0.0F, 0.0F);
        this.body2.cubeList.add(new ModelBox(body2, 33, 59, -7.0F, -2.0F, -3.5F, 14, 6, 4, 0.0F, false));
        this.body2.cubeList.add(new ModelBox(body2, 29, 85, -6.0F, -2.0F, -6.5F, 12, 6, 3, 0.0F, false));

        this.cube_r100 = new AdvancedModelRenderer(this);
        this.cube_r100.setRotationPoint(0.0F, -5.4306F, -4.125F);
        this.body2.addChild(cube_r100);
        this.setRotateAngle(cube_r100, -0.6981F, 0.0F, 0.0F);
        this.cube_r100.cubeList.add(new ModelBox(cube_r100, 30, 117, -0.5F, 0.0F, 0.0F, 1, 5, 1, -0.01F, false));

        this.cube_r101 = new AdvancedModelRenderer(this);
        this.cube_r101.setRotationPoint(0.0F, -5.3344F, 0.7835F);
        this.body2.addChild(cube_r101);
        this.setRotateAngle(cube_r101, -0.7418F, 0.0F, 0.0F);
        this.cube_r101.cubeList.add(new ModelBox(cube_r101, 29, 130, -0.5F, 0.0F, 0.0F, 1, 5, 1, -0.01F, false));

        this.cube_r102 = new AdvancedModelRenderer(this);
        this.cube_r102.setRotationPoint(0.0F, -1.75F, -1.5F);
        this.body2.addChild(cube_r102);
        this.setRotateAngle(cube_r102, -0.5672F, 0.0F, 0.0F);
        this.cube_r102.cubeList.add(new ModelBox(cube_r102, 40, 129, -0.5F, -7.25F, 0.0F, 1, 7, 1, 0.0F, false));

        this.cube_r103 = new AdvancedModelRenderer(this);
        this.cube_r103.setRotationPoint(0.0F, -1.75F, -6.25F);
        this.body2.addChild(cube_r103);
        this.setRotateAngle(cube_r103, -0.5236F, 0.0F, 0.0F);
        this.cube_r103.cubeList.add(new ModelBox(cube_r103, 83, 92, -0.5F, -8.25F, 0.0F, 1, 8, 1, 0.0F, false));

        this.cube_r104 = new AdvancedModelRenderer(this);
        this.cube_r104.setRotationPoint(0.0F, 4.0F, -6.5F);
        this.body2.addChild(cube_r104);
        this.setRotateAngle(cube_r104, -0.6545F, 0.0F, 0.0F);
        this.cube_r104.cubeList.add(new ModelBox(cube_r104, 57, 22, -5.0F, -6.0F, 0.0F, 10, 6, 8, 0.0F, false));

        this.Body2OsteodermsLeft = new AdvancedModelRenderer(this);
        this.Body2OsteodermsLeft.setRotationPoint(7.9197F, -1.1356F, -4.6342F);
        this.body2.addChild(Body2OsteodermsLeft);


        this.cube_r105 = new AdvancedModelRenderer(this);
        this.cube_r105.setRotationPoint(-0.9197F, -0.1144F, 4.1342F);
        this.Body2OsteodermsLeft.addChild(cube_r105);
        this.setRotateAngle(cube_r105, 0.0F, 0.3491F, 0.0F);
        this.cube_r105.cubeList.add(new ModelBox(cube_r105, 101, 123, -0.5F, 0.0F, -3.0F, 2, 2, 3, 0.0F, false));

        this.cube_r106 = new AdvancedModelRenderer(this);
        this.cube_r106.setRotationPoint(-7.9197F, -0.6144F, 5.6342F);
        this.Body2OsteodermsLeft.addChild(cube_r106);
        this.setRotateAngle(cube_r106, 0.1745F, 0.0F, 0.0F);
        this.cube_r106.cubeList.add(new ModelBox(cube_r106, 121, 0, 5.5F, -2.0F, -7.0F, 0, 2, 5, 0.0F, false));

        this.cube_r107 = new AdvancedModelRenderer(this);
        this.cube_r107.setRotationPoint(-6.4197F, -0.6144F, 2.3842F);
        this.Body2OsteodermsLeft.addChild(cube_r107);
        this.setRotateAngle(cube_r107, -0.4363F, 0.0F, 0.3491F);
        this.cube_r107.cubeList.add(new ModelBox(cube_r107, 35, 129, 0.0F, -7.25F, 0.0F, 1, 7, 1, 0.0F, false));

        this.cube_r108 = new AdvancedModelRenderer(this);
        this.cube_r108.setRotationPoint(-7.1697F, -0.6144F, 0.6342F);
        this.Body2OsteodermsLeft.addChild(cube_r108);
        this.setRotateAngle(cube_r108, -0.3927F, 0.0F, 0.4363F);
        this.cube_r108.cubeList.add(new ModelBox(cube_r108, 88, 13, 0.0F, -7.25F, 0.0F, 1, 7, 1, 0.0F, false));

        this.cube_r109 = new AdvancedModelRenderer(this);
        this.cube_r109.setRotationPoint(0.0F, 0.0F, -0.5F);
        this.Body2OsteodermsLeft.addChild(cube_r109);
        this.setRotateAngle(cube_r109, 0.0F, -0.4363F, -0.3491F);
        this.cube_r109.cubeList.add(new ModelBox(cube_r109, 131, 71, -3.0F, -1.0F, 0.0F, 3, 1, 1, -0.01F, false));

        this.cube_r110 = new AdvancedModelRenderer(this);
        this.cube_r110.setRotationPoint(2.4099F, 4.0117F, 1.6257F);
        this.Body2OsteodermsLeft.addChild(cube_r110);
        this.setRotateAngle(cube_r110, -0.1538F, 0.145F, 0.2467F);
        this.cube_r110.cubeList.add(new ModelBox(cube_r110, 132, 3, -2.1305F, 0.0F, -0.9914F, 2, 1, 1, 0.01F, false));

        this.cube_r111 = new AdvancedModelRenderer(this);
        this.cube_r111.setRotationPoint(2.4099F, 4.0117F, 1.6257F);
        this.Body2OsteodermsLeft.addChild(cube_r111);
        this.setRotateAngle(cube_r111, -0.2001F, 0.704F, 0.1385F);
        this.cube_r111.cubeList.add(new ModelBox(cube_r111, 56, 129, -4.0F, 0.0F, -1.0F, 4, 1, 1, 0.0F, false));

        this.cube_r112 = new AdvancedModelRenderer(this);
        this.cube_r112.setRotationPoint(2.4099F, 4.0117F, 1.6257F);
        this.Body2OsteodermsLeft.addChild(cube_r112);
        this.setRotateAngle(cube_r112, -0.1627F, 0.3605F, 0.2112F);
        this.cube_r112.cubeList.add(new ModelBox(cube_r112, 130, 54, -3.8654F, 0.0F, -1.4291F, 2, 1, 2, 0.02F, false));

        this.cube_r113 = new AdvancedModelRenderer(this);
        this.cube_r113.setRotationPoint(2.4099F, 4.0117F, 1.6257F);
        this.Body2OsteodermsLeft.addChild(cube_r113);
        this.setRotateAngle(cube_r113, -0.154F, -0.1569F, 0.2933F);
        this.cube_r113.cubeList.add(new ModelBox(cube_r113, 132, 11, -0.4226F, 0.0F, -0.9063F, 2, 1, 1, 0.0F, false));

        this.cube_r114 = new AdvancedModelRenderer(this);
        this.cube_r114.setRotationPoint(1.1599F, 3.0117F, -1.1243F);
        this.Body2OsteodermsLeft.addChild(cube_r114);
        this.setRotateAngle(cube_r114, -0.5341F, 0.7201F, -0.0127F);
        this.cube_r114.cubeList.add(new ModelBox(cube_r114, 45, 129, -4.0F, 0.0F, -1.0F, 4, 1, 1, 0.0F, false));

        this.cube_r115 = new AdvancedModelRenderer(this);
        this.cube_r115.setRotationPoint(1.1599F, 3.0117F, -1.1243F);
        this.Body2OsteodermsLeft.addChild(cube_r115);
        this.setRotateAngle(cube_r115, -0.4304F, 0.4097F, 0.1782F);
        this.cube_r115.cubeList.add(new ModelBox(cube_r115, 130, 50, -3.8654F, 0.0F, -1.4291F, 2, 1, 2, 0.02F, false));

        this.cube_r116 = new AdvancedModelRenderer(this);
        this.cube_r116.setRotationPoint(1.1599F, 3.0117F, -1.1243F);
        this.Body2OsteodermsLeft.addChild(cube_r116);
        this.setRotateAngle(cube_r116, -0.4021F, 0.21F, 0.2707F);
        this.cube_r116.cubeList.add(new ModelBox(cube_r116, 0, 132, -2.1305F, 0.0F, -0.9914F, 2, 1, 1, 0.01F, false));

        this.cube_r117 = new AdvancedModelRenderer(this);
        this.cube_r117.setRotationPoint(1.1599F, 3.0117F, -1.1243F);
        this.Body2OsteodermsLeft.addChild(cube_r117);
        this.setRotateAngle(cube_r117, -0.3938F, -0.0719F, 0.389F);
        this.cube_r117.cubeList.add(new ModelBox(cube_r117, 132, 0, -0.4226F, 0.0F, -0.9063F, 2, 1, 1, 0.0F, false));

        this.cube_r118 = new AdvancedModelRenderer(this);
        this.cube_r118.setRotationPoint(-3.6697F, 1.3356F, -1.3658F);
        this.Body2OsteodermsLeft.addChild(cube_r118);
        this.setRotateAngle(cube_r118, 0.0F, -0.2182F, -0.3491F);
        this.cube_r118.cubeList.add(new ModelBox(cube_r118, 113, 34, 1.0F, -1.0F, 0.0F, 8, 1, 1, 0.0F, false));

        this.cube_r119 = new AdvancedModelRenderer(this);
        this.cube_r119.setRotationPoint(-3.7218F, -3.6718F, 0.8247F);
        this.Body2OsteodermsLeft.addChild(cube_r119);
        this.setRotateAngle(cube_r119, 0.0F, -0.6545F, -1.0036F);
        this.cube_r119.cubeList.add(new ModelBox(cube_r119, 0, 129, -4.25F, 0.0F, 0.05F, 4, 1, 1, -0.01F, false));

        this.cube_r120 = new AdvancedModelRenderer(this);
        this.cube_r120.setRotationPoint(-5.6697F, -0.6144F, -0.8658F);
        this.Body2OsteodermsLeft.addChild(cube_r120);
        this.setRotateAngle(cube_r120, 0.0F, -0.4363F, -1.0036F);
        this.cube_r120.cubeList.add(new ModelBox(cube_r120, 113, 37, 0.0F, 0.0F, 0.0F, 8, 1, 1, 0.0F, false));

        this.Body2OsteodermsRight = new AdvancedModelRenderer(this);
        this.Body2OsteodermsRight.setRotationPoint(-7.9197F, -1.1356F, -4.6342F);
        this.body2.addChild(Body2OsteodermsRight);


        this.cube_r121 = new AdvancedModelRenderer(this);
        this.cube_r121.setRotationPoint(0.9197F, -0.1144F, 4.1342F);
        this.Body2OsteodermsRight.addChild(cube_r121);
        this.setRotateAngle(cube_r121, 0.0F, -0.3491F, 0.0F);
        this.cube_r121.cubeList.add(new ModelBox(cube_r121, 101, 123, -1.5F, 0.0F, -3.0F, 2, 2, 3, 0.0F, true));

        this.cube_r122 = new AdvancedModelRenderer(this);
        this.cube_r122.setRotationPoint(7.9197F, -0.6144F, 5.6342F);
        this.Body2OsteodermsRight.addChild(cube_r122);
        this.setRotateAngle(cube_r122, 0.1745F, 0.0F, 0.0F);
        this.cube_r122.cubeList.add(new ModelBox(cube_r122, 121, 0, -5.5F, -2.0F, -7.0F, 0, 2, 5, 0.0F, true));

        this.cube_r123 = new AdvancedModelRenderer(this);
        this.cube_r123.setRotationPoint(6.4197F, -0.6144F, 2.3842F);
        this.Body2OsteodermsRight.addChild(cube_r123);
        this.setRotateAngle(cube_r123, -0.4363F, 0.0F, -0.3491F);
        this.cube_r123.cubeList.add(new ModelBox(cube_r123, 35, 129, -1.0F, -7.25F, 0.0F, 1, 7, 1, 0.0F, true));

        this.cube_r124 = new AdvancedModelRenderer(this);
        this.cube_r124.setRotationPoint(7.1697F, -0.6144F, 0.6342F);
        this.Body2OsteodermsRight.addChild(cube_r124);
        this.setRotateAngle(cube_r124, -0.3927F, 0.0F, -0.4363F);
        this.cube_r124.cubeList.add(new ModelBox(cube_r124, 88, 13, -1.0F, -7.25F, 0.0F, 1, 7, 1, 0.0F, true));

        this.cube_r125 = new AdvancedModelRenderer(this);
        this.cube_r125.setRotationPoint(0.0F, 0.0F, -0.5F);
        this.Body2OsteodermsRight.addChild(cube_r125);
        this.setRotateAngle(cube_r125, 0.0F, 0.4363F, 0.3491F);
        this.cube_r125.cubeList.add(new ModelBox(cube_r125, 131, 71, 0.0F, -1.0F, 0.0F, 3, 1, 1, -0.01F, true));

        this.cube_r126 = new AdvancedModelRenderer(this);
        this.cube_r126.setRotationPoint(-2.4099F, 4.0117F, 1.6257F);
        this.Body2OsteodermsRight.addChild(cube_r126);
        this.setRotateAngle(cube_r126, -0.1538F, -0.145F, -0.2467F);
        this.cube_r126.cubeList.add(new ModelBox(cube_r126, 132, 3, 0.1305F, 0.0F, -0.9914F, 2, 1, 1, 0.01F, true));

        this.cube_r127 = new AdvancedModelRenderer(this);
        this.cube_r127.setRotationPoint(-2.4099F, 4.0117F, 1.6257F);
        this.Body2OsteodermsRight.addChild(cube_r127);
        this.setRotateAngle(cube_r127, -0.2001F, -0.704F, -0.1385F);
        this.cube_r127.cubeList.add(new ModelBox(cube_r127, 56, 129, 0.0F, 0.0F, -1.0F, 4, 1, 1, 0.0F, true));

        this.cube_r128 = new AdvancedModelRenderer(this);
        this.cube_r128.setRotationPoint(-2.4099F, 4.0117F, 1.6257F);
        this.Body2OsteodermsRight.addChild(cube_r128);
        this.setRotateAngle(cube_r128, -0.1627F, -0.3605F, -0.2112F);
        this.cube_r128.cubeList.add(new ModelBox(cube_r128, 130, 54, 1.8654F, 0.0F, -1.4291F, 2, 1, 2, 0.02F, true));

        this.cube_r129 = new AdvancedModelRenderer(this);
        this.cube_r129.setRotationPoint(-2.4099F, 4.0117F, 1.6257F);
        this.Body2OsteodermsRight.addChild(cube_r129);
        this.setRotateAngle(cube_r129, -0.154F, 0.1569F, -0.2933F);
        this.cube_r129.cubeList.add(new ModelBox(cube_r129, 132, 11, -1.5774F, 0.0F, -0.9063F, 2, 1, 1, 0.0F, true));

        this.cube_r130 = new AdvancedModelRenderer(this);
        this.cube_r130.setRotationPoint(-1.1599F, 3.0117F, -1.1243F);
        this.Body2OsteodermsRight.addChild(cube_r130);
        this.setRotateAngle(cube_r130, -0.5341F, -0.7201F, 0.0127F);
        this.cube_r130.cubeList.add(new ModelBox(cube_r130, 45, 129, 0.0F, 0.0F, -1.0F, 4, 1, 1, 0.0F, true));

        this.cube_r131 = new AdvancedModelRenderer(this);
        this.cube_r131.setRotationPoint(-1.1599F, 3.0117F, -1.1243F);
        this.Body2OsteodermsRight.addChild(cube_r131);
        this.setRotateAngle(cube_r131, -0.4304F, -0.4097F, -0.1782F);
        this.cube_r131.cubeList.add(new ModelBox(cube_r131, 130, 50, 1.8654F, 0.0F, -1.4291F, 2, 1, 2, 0.02F, true));

        this.cube_r132 = new AdvancedModelRenderer(this);
        this.cube_r132.setRotationPoint(-1.1599F, 3.0117F, -1.1243F);
        this.Body2OsteodermsRight.addChild(cube_r132);
        this.setRotateAngle(cube_r132, -0.4021F, -0.21F, -0.2707F);
        this.cube_r132.cubeList.add(new ModelBox(cube_r132, 0, 132, 0.1305F, 0.0F, -0.9914F, 2, 1, 1, 0.01F, true));

        this.cube_r133 = new AdvancedModelRenderer(this);
        this.cube_r133.setRotationPoint(-1.1599F, 3.0117F, -1.1243F);
        this.Body2OsteodermsRight.addChild(cube_r133);
        this.setRotateAngle(cube_r133, -0.3938F, 0.0719F, -0.389F);
        this.cube_r133.cubeList.add(new ModelBox(cube_r133, 132, 0, -1.5774F, 0.0F, -0.9063F, 2, 1, 1, 0.0F, true));

        this.cube_r134 = new AdvancedModelRenderer(this);
        this.cube_r134.setRotationPoint(3.6697F, 1.3356F, -1.3658F);
        this.Body2OsteodermsRight.addChild(cube_r134);
        this.setRotateAngle(cube_r134, 0.0F, 0.2182F, 0.3491F);
        this.cube_r134.cubeList.add(new ModelBox(cube_r134, 113, 34, -9.0F, -1.0F, 0.0F, 8, 1, 1, 0.0F, true));

        this.cube_r135 = new AdvancedModelRenderer(this);
        this.cube_r135.setRotationPoint(3.7218F, -3.6718F, 0.8247F);
        this.Body2OsteodermsRight.addChild(cube_r135);
        this.setRotateAngle(cube_r135, 0.0F, 0.6545F, 1.0036F);
        this.cube_r135.cubeList.add(new ModelBox(cube_r135, 0, 129, 0.25F, 0.0F, 0.05F, 4, 1, 1, -0.01F, true));

        this.cube_r136 = new AdvancedModelRenderer(this);
        this.cube_r136.setRotationPoint(5.6697F, -0.6144F, -0.8658F);
        this.Body2OsteodermsRight.addChild(cube_r136);
        this.setRotateAngle(cube_r136, 0.0F, 0.4363F, 1.0036F);
        this.cube_r136.cubeList.add(new ModelBox(cube_r136, 113, 37, -8.0F, 0.0F, 0.0F, 8, 1, 1, 0.0F, true));

        this.leftArm = new AdvancedModelRenderer(this);
        this.leftArm.setRotationPoint(5.0F, 5.0F, -3.5F);
        this.body2.addChild(leftArm);
        this.setRotateAngle(leftArm, 0.2618F, 0.3927F, -0.1745F);
        this.leftArm.cubeList.add(new ModelBox(leftArm, 94, 25, -2.0F, -2.0F, -2.5F, 4, 9, 5, 0.0F, false));

        this.leftArm2 = new AdvancedModelRenderer(this);
        this.leftArm2.setRotationPoint(-0.5F, 6.0F, 0.0F);
        this.leftArm.addChild(leftArm2);
        this.setRotateAngle(leftArm2, -0.829F, 0.0F, 0.0F);
        this.leftArm2.cubeList.add(new ModelBox(leftArm2, 0, 105, -1.0F, -1.0F, -2.0F, 3, 9, 4, 0.0F, false));

        this.leftArm3 = new AdvancedModelRenderer(this);
        this.leftArm3.setRotationPoint(0.0F, 6.75F, 0.0F);
        this.leftArm2.addChild(leftArm3);
        this.setRotateAngle(leftArm3, 0.1745F, -0.3491F, -0.0436F);
        this.leftArm3.cubeList.add(new ModelBox(leftArm3, 65, 13, -2.0F, 0.0F, -4.0F, 5, 2, 6, 0.0F, false));

        this.rightArm = new AdvancedModelRenderer(this);
        this.rightArm.setRotationPoint(-5.0F, 5.0F, -3.5F);
        this.body2.addChild(rightArm);
        this.setRotateAngle(rightArm, 0.2618F, -0.3927F, 0.1745F);
        this.rightArm.cubeList.add(new ModelBox(rightArm, 94, 25, -2.0F, -2.0F, -2.5F, 4, 9, 5, 0.0F, true));

        this.rightArm2 = new AdvancedModelRenderer(this);
        this.rightArm2.setRotationPoint(0.5F, 6.0F, 0.0F);
        this.rightArm.addChild(rightArm2);
        this.setRotateAngle(rightArm2, -0.829F, 0.0F, 0.0F);
        this.rightArm2.cubeList.add(new ModelBox(rightArm2, 0, 105, -2.0F, -1.0F, -2.0F, 3, 9, 4, 0.0F, true));

        this.rightArm3 = new AdvancedModelRenderer(this);
        this.rightArm3.setRotationPoint(0.0F, 6.75F, 0.0F);
        this.rightArm2.addChild(rightArm3);
        this.setRotateAngle(rightArm3, 0.1745F, 0.3491F, 0.0436F);
        this.rightArm3.cubeList.add(new ModelBox(rightArm3, 65, 13, -3.0F, 0.0F, -4.0F, 5, 2, 6, 0.0F, true));

        this.neck = new AdvancedModelRenderer(this);
        this.neck.setRotationPoint(0.0F, -1.0F, -6.0F);
        this.body2.addChild(neck);
        this.setRotateAngle(neck, -0.3927F, 0.0F, 0.0F);
        this.neck.cubeList.add(new ModelBox(neck, 83, 103, -2.5F, -0.9F, -4.0F, 5, 4, 5, 0.0F, false));

        this.cube_r137 = new AdvancedModelRenderer(this);
        this.cube_r137.setRotationPoint(0.0F, -2.7634F, -2.4804F);
        this.neck.addChild(cube_r137);
        this.setRotateAngle(cube_r137, -0.5672F, 0.0F, 0.0F);
        this.cube_r137.cubeList.add(new ModelBox(cube_r137, 23, 90, -0.5F, 0.0F, 0.0F, 1, 3, 1, -0.01F, false));

        this.cube_r138 = new AdvancedModelRenderer(this);
        this.cube_r138.setRotationPoint(0.0F, -0.65F, -1.75F);
        this.neck.addChild(cube_r138);
        this.setRotateAngle(cube_r138, -0.1309F, 0.0F, 0.0F);
        this.cube_r138.cubeList.add(new ModelBox(cube_r138, 88, 37, -0.5F, -3.0F, -1.0F, 1, 3, 1, 0.0F, false));

        this.cube_r139 = new AdvancedModelRenderer(this);
        this.cube_r139.setRotationPoint(-0.5F, 3.1F, -4.0F);
        this.neck.addChild(cube_r139);
        this.setRotateAngle(cube_r139, -0.1745F, 0.0F, 0.0F);
        this.cube_r139.cubeList.add(new ModelBox(cube_r139, 95, 70, -1.5F, -1.0F, 0.0F, 4, 1, 6, 0.0F, false));

        this.NeckOsteodermsLeft = new AdvancedModelRenderer(this);
        this.NeckOsteodermsLeft.setRotationPoint(3.0F, 1.2F, -2.0F);
        this.neck.addChild(NeckOsteodermsLeft);


        this.cube_r140 = new AdvancedModelRenderer(this);
        this.cube_r140.setRotationPoint(0.6735F, 1.5763F, -1.4657F);
        this.NeckOsteodermsLeft.addChild(cube_r140);
        this.setRotateAngle(cube_r140, 0.0F, 0.0F, 0.829F);
        this.cube_r140.cubeList.add(new ModelBox(cube_r140, 131, 74, -3.0F, 0.0F, 0.0F, 3, 1, 1, -0.01F, false));

        this.cube_r141 = new AdvancedModelRenderer(this);
        this.cube_r141.setRotationPoint(0.6971F, 2.088F, 0.9889F);
        this.NeckOsteodermsLeft.addChild(cube_r141);
        this.setRotateAngle(cube_r141, 0.0F, -0.1745F, 0.4363F);
        this.cube_r141.cubeList.add(new ModelBox(cube_r141, 131, 131, -2.0F, -1.0F, 0.0F, 2, 1, 1, -0.01F, false));

        this.cube_r142 = new AdvancedModelRenderer(this);
        this.cube_r142.setRotationPoint(-1.1F, 1.25F, 1.25F);
        this.NeckOsteodermsLeft.addChild(cube_r142);
        this.setRotateAngle(cube_r142, 0.0F, 0.1309F, 0.4363F);
        this.cube_r142.cubeList.add(new ModelBox(cube_r142, 123, 128, 0.0F, -1.0F, 0.0F, 4, 1, 1, 0.0F, false));

        this.cube_r143 = new AdvancedModelRenderer(this);
        this.cube_r143.setRotationPoint(-1.0F, -0.25F, 0.5F);
        this.NeckOsteodermsLeft.addChild(cube_r143);
        this.setRotateAngle(cube_r143, 0.0F, 0.3491F, 0.829F);
        this.cube_r143.cubeList.add(new ModelBox(cube_r143, 112, 128, 0.0F, 0.0F, -1.0F, 4, 1, 1, 0.0F, false));

        this.cube_r144 = new AdvancedModelRenderer(this);
        this.cube_r144.setRotationPoint(-1.25F, -1.45F, 0.5F);
        this.NeckOsteodermsLeft.addChild(cube_r144);
        this.setRotateAngle(cube_r144, -0.0283F, -0.0454F, -0.1265F);
        this.cube_r144.cubeList.add(new ModelBox(cube_r144, 57, 37, 0.0F, 0.0F, -1.0F, 14, 1, 1, 0.0F, false));

        this.cube_r145 = new AdvancedModelRenderer(this);
        this.cube_r145.setRotationPoint(-1.25F, -1.45F, 0.5F);
        this.NeckOsteodermsLeft.addChild(cube_r145);
        this.setRotateAngle(cube_r145, -0.0287F, -0.1763F, -0.1228F);
        this.cube_r145.cubeList.add(new ModelBox(cube_r145, 114, 87, -0.1904F, 0.0F, -1.9051F, 7, 1, 1, -0.01F, false));

        this.cube_r146 = new AdvancedModelRenderer(this);
        this.cube_r146.setRotationPoint(3.6718F, -7.0288F, -0.049F);
        this.NeckOsteodermsLeft.addChild(cube_r146);
        this.setRotateAngle(cube_r146, 0.0F, -0.2094F, -0.6981F);
        this.cube_r146.cubeList.add(new ModelBox(cube_r146, 112, 100, -8.0F, 0.0F, 0.0F, 8, 1, 1, -0.01F, false));

        this.cube_r147 = new AdvancedModelRenderer(this);
        this.cube_r147.setRotationPoint(-2.5F, -1.85F, 0.25F);
        this.NeckOsteodermsLeft.addChild(cube_r147);
        this.setRotateAngle(cube_r147, 0.0F, -0.0873F, -0.6981F);
        this.cube_r147.cubeList.add(new ModelBox(cube_r147, 21, 95, 0.0F, 0.0F, -1.0F, 16, 1, 1, 0.0F, false));

        this.NeckOsteodermsRight = new AdvancedModelRenderer(this);
        this.NeckOsteodermsRight.setRotationPoint(-3.0F, 1.2F, -2.0F);
        this.neck.addChild(NeckOsteodermsRight);


        this.cube_r148 = new AdvancedModelRenderer(this);
        this.cube_r148.setRotationPoint(-0.6735F, 1.5763F, -1.4657F);
        this.NeckOsteodermsRight.addChild(cube_r148);
        this.setRotateAngle(cube_r148, 0.0F, 0.0F, -0.829F);
        this.cube_r148.cubeList.add(new ModelBox(cube_r148, 131, 74, 0.0F, 0.0F, 0.0F, 3, 1, 1, -0.01F, true));

        this.cube_r149 = new AdvancedModelRenderer(this);
        this.cube_r149.setRotationPoint(-0.6971F, 2.088F, 0.9889F);
        this.NeckOsteodermsRight.addChild(cube_r149);
        this.setRotateAngle(cube_r149, 0.0F, 0.1745F, -0.4363F);
        this.cube_r149.cubeList.add(new ModelBox(cube_r149, 131, 131, 0.0F, -1.0F, 0.0F, 2, 1, 1, -0.01F, true));

        this.cube_r150 = new AdvancedModelRenderer(this);
        this.cube_r150.setRotationPoint(1.1F, 1.25F, 1.25F);
        this.NeckOsteodermsRight.addChild(cube_r150);
        this.setRotateAngle(cube_r150, 0.0F, -0.1309F, -0.4363F);
        this.cube_r150.cubeList.add(new ModelBox(cube_r150, 123, 128, -4.0F, -1.0F, 0.0F, 4, 1, 1, 0.0F, true));

        this.cube_r151 = new AdvancedModelRenderer(this);
        this.cube_r151.setRotationPoint(1.0F, -0.25F, 0.5F);
        this.NeckOsteodermsRight.addChild(cube_r151);
        this.setRotateAngle(cube_r151, 0.0F, -0.3491F, -0.829F);
        this.cube_r151.cubeList.add(new ModelBox(cube_r151, 112, 128, -4.0F, 0.0F, -1.0F, 4, 1, 1, 0.0F, true));

        this.cube_r152 = new AdvancedModelRenderer(this);
        this.cube_r152.setRotationPoint(1.25F, -1.45F, 0.5F);
        this.NeckOsteodermsRight.addChild(cube_r152);
        this.setRotateAngle(cube_r152, -0.0283F, 0.0454F, 0.1265F);
        this.cube_r152.cubeList.add(new ModelBox(cube_r152, 57, 37, -14.0F, 0.0F, -1.0F, 14, 1, 1, 0.0F, true));

        this.cube_r153 = new AdvancedModelRenderer(this);
        this.cube_r153.setRotationPoint(1.25F, -1.45F, 0.5F);
        this.NeckOsteodermsRight.addChild(cube_r153);
        this.setRotateAngle(cube_r153, -0.0287F, 0.1763F, 0.1228F);
        this.cube_r153.cubeList.add(new ModelBox(cube_r153, 114, 87, -6.8096F, 0.0F, -1.9051F, 7, 1, 1, -0.01F, true));

        this.cube_r154 = new AdvancedModelRenderer(this);
        this.cube_r154.setRotationPoint(-3.6718F, -7.0288F, -0.049F);
        this.NeckOsteodermsRight.addChild(cube_r154);
        this.setRotateAngle(cube_r154, 0.0F, 0.2094F, 0.6981F);
        this.cube_r154.cubeList.add(new ModelBox(cube_r154, 112, 100, 0.0F, 0.0F, 0.0F, 8, 1, 1, -0.01F, true));

        this.cube_r155 = new AdvancedModelRenderer(this);
        this.cube_r155.setRotationPoint(2.5F, -1.85F, 0.25F);
        this.NeckOsteodermsRight.addChild(cube_r155);
        this.setRotateAngle(cube_r155, 0.0F, 0.0873F, 0.6981F);
        this.cube_r155.cubeList.add(new ModelBox(cube_r155, 21, 95, -16.0F, 0.0F, -1.0F, 16, 1, 1, 0.0F, true));

        this.neck2 = new AdvancedModelRenderer(this);
        this.neck2.setRotationPoint(0.0F, 0.0F, -3.5F);
        this.neck.addChild(neck2);
        this.setRotateAngle(neck2, -0.2618F, 0.0F, 0.0F);
        this.neck2.cubeList.add(new ModelBox(neck2, 112, 91, -2.0F, -0.8F, -4.0F, 4, 3, 5, -0.02F, false));

        this.cube_r156 = new AdvancedModelRenderer(this);
        this.cube_r156.setRotationPoint(0.0F, 3.45F, -4.5F);
        this.neck2.addChild(cube_r156);
        this.setRotateAngle(cube_r156, 0.0873F, 0.0F, 0.0F);
        this.cube_r156.cubeList.add(new ModelBox(cube_r156, 117, 11, -1.5F, -2.0F, 1.0F, 3, 2, 4, 0.0F, false));

        this.Neck2OsteodermsLeft = new AdvancedModelRenderer(this);
        this.Neck2OsteodermsLeft.setRotationPoint(2.0F, 1.2F, -1.75F);
        this.neck2.addChild(Neck2OsteodermsLeft);


        this.cube_r157 = new AdvancedModelRenderer(this);
        this.cube_r157.setRotationPoint(0.0F, -0.25F, 0.0F);
        this.Neck2OsteodermsLeft.addChild(cube_r157);
        this.setRotateAngle(cube_r157, 0.1745F, -0.3054F, 0.48F);
        this.cube_r157.cubeList.add(new ModelBox(cube_r157, 127, 125, 0.0F, 0.0F, 0.0F, 4, 1, 1, 0.0F, false));

        this.cube_r158 = new AdvancedModelRenderer(this);
        this.cube_r158.setRotationPoint(1.6919F, 0.6307F, 0.6014F);
        this.Neck2OsteodermsLeft.addChild(cube_r158);
        this.setRotateAngle(cube_r158, 0.192F, -0.52F, 0.4366F);
        this.cube_r158.cubeList.add(new ModelBox(cube_r158, 68, 128, -4.0F, 0.0F, 0.0F, 4, 1, 1, -0.01F, false));

        this.cube_r159 = new AdvancedModelRenderer(this);
        this.cube_r159.setRotationPoint(3.0607F, -4.8434F, -1.1526F);
        this.Neck2OsteodermsLeft.addChild(cube_r159);
        this.setRotateAngle(cube_r159, 0.0F, 0.0436F, -0.6109F);
        this.cube_r159.cubeList.add(new ModelBox(cube_r159, 98, 56, -8.0F, 0.0F, 0.0F, 8, 1, 1, -0.01F, false));

        this.cube_r160 = new AdvancedModelRenderer(this);
        this.cube_r160.setRotationPoint(-1.0F, -2.0F, -0.5F);
        this.Neck2OsteodermsLeft.addChild(cube_r160);
        this.setRotateAngle(cube_r160, 0.0F, 0.1309F, -0.6109F);
        this.cube_r160.cubeList.add(new ModelBox(cube_r160, 98, 53, -1.0F, 0.0F, 0.0F, 8, 1, 1, 0.0F, false));

        this.Neck2OsteodermsRight = new AdvancedModelRenderer(this);
        this.Neck2OsteodermsRight.setRotationPoint(-2.0F, 1.2F, -1.75F);
        this.neck2.addChild(Neck2OsteodermsRight);


        this.cube_r161 = new AdvancedModelRenderer(this);
        this.cube_r161.setRotationPoint(0.0F, -0.25F, 0.0F);
        this.Neck2OsteodermsRight.addChild(cube_r161);
        this.setRotateAngle(cube_r161, 0.1745F, 0.3054F, -0.48F);
        this.cube_r161.cubeList.add(new ModelBox(cube_r161, 127, 125, -4.0F, 0.0F, 0.0F, 4, 1, 1, 0.0F, true));

        this.cube_r162 = new AdvancedModelRenderer(this);
        this.cube_r162.setRotationPoint(-1.6919F, 0.6307F, 0.6014F);
        this.Neck2OsteodermsRight.addChild(cube_r162);
        this.setRotateAngle(cube_r162, 0.192F, 0.52F, -0.4366F);
        this.cube_r162.cubeList.add(new ModelBox(cube_r162, 68, 128, 0.0F, 0.0F, 0.0F, 4, 1, 1, -0.01F, true));

        this.cube_r163 = new AdvancedModelRenderer(this);
        this.cube_r163.setRotationPoint(-3.0607F, -4.8434F, -1.1526F);
        this.Neck2OsteodermsRight.addChild(cube_r163);
        this.setRotateAngle(cube_r163, 0.0F, -0.0436F, 0.6109F);
        this.cube_r163.cubeList.add(new ModelBox(cube_r163, 98, 56, 0.0F, 0.0F, 0.0F, 8, 1, 1, -0.01F, true));

        this.cube_r164 = new AdvancedModelRenderer(this);
        this.cube_r164.setRotationPoint(1.0F, -2.0F, -0.5F);
        this.Neck2OsteodermsRight.addChild(cube_r164);
        this.setRotateAngle(cube_r164, 0.0F, -0.1309F, 0.6109F);
        this.cube_r164.cubeList.add(new ModelBox(cube_r164, 98, 53, -7.0F, 0.0F, 0.0F, 8, 1, 1, 0.0F, true));

        this.head = new AdvancedModelRenderer(this);
        this.head.setRotationPoint(0.0F, 0.0F, -4.0F);
        this.neck2.addChild(head);
        this.setRotateAngle(head, 0.4363F, 0.0F, 0.0F);
        this.head.cubeList.add(new ModelBox(head, 15, 117, -2.0F, -0.8F, -2.5F, 4, 3, 3, 0.02F, false));

        this.cube_r165 = new AdvancedModelRenderer(this);
        this.cube_r165.setRotationPoint(0.0F, 2.1076F, -7.1087F);
        this.head.addChild(cube_r165);
        this.setRotateAngle(cube_r165, 1.0908F, 0.0F, 0.0F);
        this.cube_r165.cubeList.add(new ModelBox(cube_r165, 117, 131, -1.0F, 0.0F, -1.0F, 2, 1, 1, 0.03F, false));

        this.cube_r166 = new AdvancedModelRenderer(this);
        this.cube_r166.setRotationPoint(0.0F, 1.047F, -6.048F);
        this.head.addChild(cube_r166);
        this.setRotateAngle(cube_r166, 0.7854F, 0.0F, 0.0F);
        this.cube_r166.cubeList.add(new ModelBox(cube_r166, 131, 117, -1.0F, 0.0F, -1.5F, 2, 1, 1, -0.01F, false));
        this.cube_r166.cubeList.add(new ModelBox(cube_r166, 131, 114, -1.0F, 0.0F, -1.0F, 2, 1, 1, 0.0F, false));

        this.cube_r167 = new AdvancedModelRenderer(this);
        this.cube_r167.setRotationPoint(0.0F, -0.8F, -2.5F);
        this.head.addChild(cube_r167);
        this.setRotateAngle(cube_r167, 0.48F, 0.0F, 0.0F);
        this.cube_r167.cubeList.add(new ModelBox(cube_r167, 46, 98, -1.0F, 0.0F, -4.0F, 2, 1, 4, 0.01F, false));

        this.cube_r168 = new AdvancedModelRenderer(this);
        this.cube_r168.setRotationPoint(0.0F, 1.2F, -2.5F);
        this.head.addChild(cube_r168);
        this.setRotateAngle(cube_r168, 0.1309F, 0.0F, 0.0F);
        this.cube_r168.cubeList.add(new ModelBox(cube_r168, 123, 109, -1.0F, -1.0F, -2.4F, 2, 1, 3, 0.0F, false));
        this.cube_r168.cubeList.add(new ModelBox(cube_r168, 117, 53, -1.0F, 0.0F, -4.0F, 2, 1, 4, 0.02F, false));

        this.HeadOsteodermsLeft = new AdvancedModelRenderer(this);
        this.HeadOsteodermsLeft.setRotationPoint(2.1481F, -0.6945F, -2.7026F);
        this.head.addChild(HeadOsteodermsLeft);


        this.cube_r169 = new AdvancedModelRenderer(this);
        this.cube_r169.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.HeadOsteodermsLeft.addChild(cube_r169);
        this.setRotateAngle(cube_r169, 0.4899F, 0.1932F, 0.102F);
        this.cube_r169.cubeList.add(new ModelBox(cube_r169, 130, 46, -2.0F, 0.0F, -0.05F, 2, 1, 2, -0.02F, false));

        this.cube_r170 = new AdvancedModelRenderer(this);
        this.cube_r170.setRotationPoint(-0.1481F, 1.9445F, 0.2026F);
        this.HeadOsteodermsLeft.addChild(cube_r170);
        this.setRotateAngle(cube_r170, 0.0F, 0.48F, 0.48F);
        this.cube_r170.cubeList.add(new ModelBox(cube_r170, 15, 105, -1.0F, -0.05F, 0.0F, 1, 1, 2, 0.0F, false));

        this.cube_r171 = new AdvancedModelRenderer(this);
        this.cube_r171.setRotationPoint(-1.1481F, 1.2798F, -2.4585F);
        this.HeadOsteodermsLeft.addChild(cube_r171);
        this.setRotateAngle(cube_r171, 0.5131F, 0.3463F, 0.189F);
        this.cube_r171.cubeList.add(new ModelBox(cube_r171, 46, 124, -2.0F, 0.0F, 0.0F, 2, 1, 3, -0.01F, false));

        this.cube_r172 = new AdvancedModelRenderer(this);
        this.cube_r172.setRotationPoint(-1.1481F, 1.2164F, -2.3074F);
        this.HeadOsteodermsLeft.addChild(cube_r172);
        this.setRotateAngle(cube_r172, 0.1388F, 0.3373F, 0.0462F);
        this.cube_r172.cubeList.add(new ModelBox(cube_r172, 35, 124, -2.0F, 0.0F, 0.0F, 2, 1, 3, 0.0F, false));

        this.cube_r173 = new AdvancedModelRenderer(this);
        this.cube_r173.setRotationPoint(-1.1481F, 2.2665F, -2.6231F);
        this.HeadOsteodermsLeft.addChild(cube_r173);
        this.setRotateAngle(cube_r173, 0.1392F, 0.346F, 0.0475F);
        this.cube_r173.cubeList.add(new ModelBox(cube_r173, 36, 109, -1.0F, 0.0F, 0.0F, 1, 1, 3, 0.0F, false));

        this.cube_r174 = new AdvancedModelRenderer(this);
        this.cube_r174.setRotationPoint(-1.298F, 3.058F, -2.5925F);
        this.HeadOsteodermsLeft.addChild(cube_r174);
        this.setRotateAngle(cube_r174, 0.3422F, 0.3178F, 0.1349F);
        this.cube_r174.cubeList.add(new ModelBox(cube_r174, 131, 66, 0.0F, 0.0F, 0.0F, 0, 1, 3, 0.0F, false));

        this.HeadOsteodermsRight = new AdvancedModelRenderer(this);
        this.HeadOsteodermsRight.setRotationPoint(-2.1481F, -0.6945F, -2.7026F);
        this.head.addChild(HeadOsteodermsRight);


        this.cube_r175 = new AdvancedModelRenderer(this);
        this.cube_r175.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.HeadOsteodermsRight.addChild(cube_r175);
        this.setRotateAngle(cube_r175, 0.4899F, -0.1932F, -0.102F);
        this.cube_r175.cubeList.add(new ModelBox(cube_r175, 130, 46, 0.0F, 0.0F, -0.05F, 2, 1, 2, -0.02F, true));

        this.cube_r176 = new AdvancedModelRenderer(this);
        this.cube_r176.setRotationPoint(0.1481F, 1.9445F, 0.2026F);
        this.HeadOsteodermsRight.addChild(cube_r176);
        this.setRotateAngle(cube_r176, 0.0F, -0.48F, -0.48F);
        this.cube_r176.cubeList.add(new ModelBox(cube_r176, 15, 105, 0.0F, -0.05F, 0.0F, 1, 1, 2, 0.0F, true));

        this.cube_r177 = new AdvancedModelRenderer(this);
        this.cube_r177.setRotationPoint(1.1481F, 1.2798F, -2.4585F);
        this.HeadOsteodermsRight.addChild(cube_r177);
        this.setRotateAngle(cube_r177, 0.5131F, -0.3463F, -0.189F);
        this.cube_r177.cubeList.add(new ModelBox(cube_r177, 46, 124, 0.0F, 0.0F, 0.0F, 2, 1, 3, -0.01F, true));

        this.cube_r178 = new AdvancedModelRenderer(this);
        this.cube_r178.setRotationPoint(1.1481F, 1.2164F, -2.3074F);
        this.HeadOsteodermsRight.addChild(cube_r178);
        this.setRotateAngle(cube_r178, 0.1388F, -0.3373F, -0.0462F);
        this.cube_r178.cubeList.add(new ModelBox(cube_r178, 35, 124, 0.0F, 0.0F, 0.0F, 2, 1, 3, 0.0F, true));

        this.cube_r179 = new AdvancedModelRenderer(this);
        this.cube_r179.setRotationPoint(1.1481F, 2.2665F, -2.6231F);
        this.HeadOsteodermsRight.addChild(cube_r179);
        this.setRotateAngle(cube_r179, 0.1392F, -0.346F, -0.0475F);
        this.cube_r179.cubeList.add(new ModelBox(cube_r179, 36, 109, 0.0F, 0.0F, 0.0F, 1, 1, 3, 0.0F, true));

        this.cube_r180 = new AdvancedModelRenderer(this);
        this.cube_r180.setRotationPoint(1.298F, 3.058F, -2.5925F);
        this.HeadOsteodermsRight.addChild(cube_r180);
        this.setRotateAngle(cube_r180, 0.3422F, -0.3178F, -0.1349F);
        this.cube_r180.cubeList.add(new ModelBox(cube_r180, 131, 66, 0.0F, 0.0F, 0.0F, 0, 1, 3, 0.0F, true));

        this.jaw = new AdvancedModelRenderer(this);
        this.jaw.setRotationPoint(0.0F, 2.0F, -0.5F);
        this.head.addChild(jaw);
        this.setRotateAngle(jaw, 0.0436F, 0.0F, 0.0F);
        this.jaw.cubeList.add(new ModelBox(jaw, 117, 40, -2.0F, -0.3F, -2.0F, 4, 2, 3, 0.0F, false));

        this.cube_r181 = new AdvancedModelRenderer(this);
        this.cube_r181.setRotationPoint(0.0F, 1.3794F, -5.7656F);
        this.jaw.addChild(cube_r181);
        this.setRotateAngle(cube_r181, -0.0698F, 0.0F, 0.0F);
        this.cube_r181.cubeList.add(new ModelBox(cube_r181, 0, 119, -1.0F, -1.0F, 0.0F, 2, 1, 4, -0.01F, false));

        this.cube_r182 = new AdvancedModelRenderer(this);
        this.cube_r182.setRotationPoint(0.0F, 1.3794F, -5.7656F);
        this.jaw.addChild(cube_r182);
        this.setRotateAngle(cube_r182, -0.2618F, 0.0F, 0.0F);
        this.cube_r182.cubeList.add(new ModelBox(cube_r182, 124, 131, -1.0F, -1.0F, -1.0F, 2, 1, 1, 0.01F, false));

        this.cube_r183 = new AdvancedModelRenderer(this);
        this.cube_r183.setRotationPoint(0.0F, -0.3F, -2.0F);
        this.jaw.addChild(cube_r183);
        this.setRotateAngle(cube_r183, 0.1745F, 0.0F, 0.0F);
        this.cube_r183.cubeList.add(new ModelBox(cube_r183, 118, 59, -1.0F, 0.0F, -4.0F, 2, 1, 4, 0.0F, false));

        this.cube_r184 = new AdvancedModelRenderer(this);
        this.cube_r184.setRotationPoint(0.0F, -0.3F, -2.0F);
        this.jaw.addChild(cube_r184);
        this.setRotateAngle(cube_r184, -0.3927F, 0.0F, 0.0F);
        this.cube_r184.cubeList.add(new ModelBox(cube_r184, 118, 65, -2.0F, -1.0F, 0.0F, 4, 1, 2, -0.01F, false));

        this.JawOsteodermsLeft = new AdvancedModelRenderer(this);
        this.JawOsteodermsLeft.setRotationPoint(0.9F, 0.2775F, -4.7082F);
        this.jaw.addChild(JawOsteodermsLeft);


        this.cube_r185 = new AdvancedModelRenderer(this);
        this.cube_r185.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.JawOsteodermsLeft.addChild(cube_r185);
        this.setRotateAngle(cube_r185, -0.1373F, 0.3224F, -0.1029F);
        this.cube_r185.cubeList.add(new ModelBox(cube_r185, 67, 131, 0.0F, -1.0F, -0.05F, 0, 1, 3, 0.0F, false));

        this.cube_r186 = new AdvancedModelRenderer(this);
        this.cube_r186.setRotationPoint(0.1F, 0.8848F, 0.1737F);
        this.JawOsteodermsLeft.addChild(cube_r186);
        this.setRotateAngle(cube_r186, 0.1855F, 0.3435F, 0.0631F);
        this.cube_r186.cubeList.add(new ModelBox(cube_r186, 57, 124, -2.0F, -1.0F, -0.05F, 2, 1, 3, -0.01F, false));

        this.JawOsteodermsRight = new AdvancedModelRenderer(this);
        this.JawOsteodermsRight.setRotationPoint(-0.9F, 0.2775F, -4.7082F);
        this.jaw.addChild(JawOsteodermsRight);


        this.cube_r187 = new AdvancedModelRenderer(this);
        this.cube_r187.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.JawOsteodermsRight.addChild(cube_r187);
        this.setRotateAngle(cube_r187, -0.1373F, -0.3224F, 0.1029F);
        this.cube_r187.cubeList.add(new ModelBox(cube_r187, 67, 131, 0.0F, -1.0F, -0.05F, 0, 1, 3, 0.0F, true));

        this.cube_r188 = new AdvancedModelRenderer(this);
        this.cube_r188.setRotationPoint(-0.1F, 0.8848F, 0.1737F);
        this.JawOsteodermsRight.addChild(cube_r188);
        this.setRotateAngle(cube_r188, 0.1855F, -0.3435F, -0.0631F);
        this.cube_r188.cubeList.add(new ModelBox(cube_r188, 57, 124, 0.0F, -1.0F, -0.05F, 2, 1, 3, -0.01F, true));

        this.eye = new AdvancedModelRenderer(this);
        this.eye.setRotationPoint(0.0F, 0.0327F, -1.4373F);
        this.head.addChild(eye);


        this.cube_r189 = new AdvancedModelRenderer(this);
        this.cube_r189.setRotationPoint(0.0F, -0.0327F, -0.0627F);
        this.eye.addChild(cube_r189);
        this.setRotateAngle(cube_r189, 0.3054F, 0.0F, 0.0F);
        this.cube_r189.cubeList.add(new ModelBox(cube_r189, 127, 122, -2.0F, -0.45F, -0.45F, 4, 1, 1, 0.03F, false));


        updateDefaultPose();
        animator = ModelAnimator.create();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        //this.main.rotateAngleY = (float)Math.toRadians(((EntityPrehistoricFloraSpicomellus)entity).getRotationAngle());
        animate((IAnimatedEntity) entity, f, f1, f2, f3, f4, f5);
        this.main.render(f5);
    }

    public void renderStaticWall(float f) {

        resetToDefaultPose();
    }

    @Override
    public void renderStaticBook(float f) {
        //Rotations, positions and sizing:
        this.main.offsetY = 0.6F;
        this.main.offsetX = 0.1F;
        this.main.rotateAngleY = (float)Math.toRadians(220);
        this.main.rotateAngleX = (float)Math.toRadians(0);
        this.main.rotateAngleZ = (float)Math.toRadians(0);
        this.main.scaleChildren = true;
        float scaler = 0.5F;
        this.main.setScale(scaler, scaler, scaler);
        //Start of pose:

        //End of pose, now render the model:
        this.main.render(f);
        //Reset rotations, positions and sizing:
        this.main.setScale(1.0F, 1.0F, 1.0F);
        this.main.scaleChildren = false;
        resetToDefaultPose();
    }

    public void renderStaticFloor(float f) {
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

        EntityPrehistoricFloraSpicomellus Spicomellus = (EntityPrehistoricFloraSpicomellus) e;
        if (Spicomellus.getIsSneaking()) {
            this.faceTarget(f3, f4, 1, main);
        }
        this.faceTarget(f3, f4, 14, neck);
        this.faceTarget(f3, f4, 14, neck2);
        this.faceTarget(f3, f4, 14, head);

        AdvancedModelRenderer[] Tail = {this.tail, this.tail2, this.tail3, this.tail4, this.tail5};
        AdvancedModelRenderer[] Neck = {this.neck, this.neck2, this.head};
        //AdvancedModelRenderer[] ArmL = {this.leftarm, this.leftarm2, this.leftarm3};
        //AdvancedModelRenderer[] ArmR = {this.rightarm, this.rightarm2, this.rightarm3};

        Spicomellus.tailBuffer.applyChainSwingBuffer(Tail);

        if (Spicomellus.getAnimation() == Spicomellus.LAY_ANIMATION) {
            this.chainSwing(Neck, 0.5F, 0.10F, 0.5, f2, 0.8F);
            this.chainWave(Neck, 0.5F * 2, -0.02F, 0.5F, f2, 0.8F);
        }
        else {
            if (!Spicomellus.isReallyInWater()) {

                if (f3 == 0.0F || !Spicomellus.getIsMoving()) {
                    if (Spicomellus.getAnimation() != Spicomellus.EAT_ANIMATION
                            && Spicomellus.getAnimation() != Spicomellus.DRINK_ANIMATION
                            && Spicomellus.getAnimation() != Spicomellus.ATTACK_ANIMATION) {
                        this.chainSwing(Neck, 0.05F, 0.10F, 0.5, f2, 0.8F);
                        this.chainWave(Neck, 0.05F * 2, -0.02F, 0.5F, f2, 0.8F);
                    }

                    if (Spicomellus.getAnimation() != Spicomellus.ATTACK_ANIMATION) {
                        this.chainWave(Tail, (0.15F * 0.35F), 0.125F * 0.15F, 0.2F, f2, 1F);
                        this.chainSwing(Tail, (0.15F * 0.35F) * 4F, 0.05F * 0.35F, 0.12F, f2, 1F);
                    }

                    return;
                }

                if (Spicomellus.getIsFast()) { //Running
                    if (Spicomellus.getIsSneaking()) {

                    }
                    else { //normal run:

                    }

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
        this.eye.setScale(1,1,1);

        EntityPrehistoricFloraSpicomellus ee = (EntityPrehistoricFloraSpicomellus) entitylivingbaseIn;

        if (!ee.isReallyInWater()) {
            if (ee.getIsMoving()) {
                if (ee.getIsFast()) { //Running
                    if (ee.getIsSneaking()) {
                        animSneaking(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
                    }
                    else {
                        animRunning(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
                    }
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
        else if (ee.getAnimation() == ee.ATTACK_ANIMATION) {
            animAttack(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.MAKE_NEST_ANIMATION) {
            animNest(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.LAY_ANIMATION) {
            animLay(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.DRINK_ANIMATION) {
            animGraze(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.ROAR_ANIMATION) { //The roar/warn anim
            animRoar(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.HIDE_ANIMATION) { //The roar/warn anim
            animHide(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.IDLE_1) { //The roar/warn anim
            animBlink(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.IDLE_2) { //The roar/warn anim
            animYawn(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }

    }

    public void animGraze(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraSpicomellus entity = (EntityPrehistoricFloraSpicomellus) entitylivingbaseIn;
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
        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(xx), body.rotateAngleY + (float) Math.toRadians(yy), body.rotateAngleZ + (float) Math.toRadians(zz));




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
        this.leftArm3.rotationPointX = this.leftArm3.rotationPointX + (float)(xx);
        this.leftArm3.rotationPointY = this.leftArm3.rotationPointY - (float)(yy);
        this.leftArm3.rotationPointZ = this.leftArm3.rotationPointZ + (float)(zz);




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
        this.setRotateAngle(rightArm2, rightArm2.rotateAngleX + (float) Math.toRadians(xx), rightArm2.rotateAngleY + (float) Math.toRadians(yy), rightArm2.rotateAngleZ + (float) Math.toRadians(zz));




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
        this.setRotateAngle(rightArm3, rightArm3.rotateAngleX + (float) Math.toRadians(xx), rightArm3.rotateAngleY + (float) Math.toRadians(yy), rightArm3.rotateAngleZ + (float) Math.toRadians(zz));


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
        this.rightArm3.rotationPointX = this.rightArm3.rotationPointX + (float)(xx);
        this.rightArm3.rotationPointY = this.rightArm3.rotationPointY - (float)(yy);
        this.rightArm3.rotationPointZ = this.rightArm3.rotationPointZ + (float)(zz);




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
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(xx), neck.rotateAngleY + (float) Math.toRadians(yy), neck.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 40) {
            xx = -0-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-20 + (((tickAnim - 0) / 40) * (19.25-(-0-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-20)));
            yy = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 43) {
            xx = 19.25 + (((tickAnim - 40) / 3) * (21.42-(19.25)));
            yy = 0 + (((tickAnim - 40) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 3) * (0-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 60) {
            xx = 21.42 + (((tickAnim - 43) / 17) * (9-(21.42)));
            yy = 0 + (((tickAnim - 43) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 43) / 17) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 73) {
            xx = 9 + (((tickAnim - 60) / 13) * (19.25-(9)));
            yy = 0 + (((tickAnim - 60) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 13) * (0-(0)));
        }
        else if (tickAnim >= 73 && tickAnim < 76) {
            xx = 19.25 + (((tickAnim - 73) / 3) * (21.42-(19.25)));
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
        

    }
    public void animHide(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraSpicomellus entity = (EntityPrehistoricFloraSpicomellus) entitylivingbaseIn;
        int animCycle = 160;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 0) / 23) * (-14-(0)));
            yy = 0 + (((tickAnim - 0) / 23) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 23) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 45) {
            xx = -14 + (((tickAnim - 23) / 22) * (0-(-14)));
            yy = 0 + (((tickAnim - 23) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 22) * (0-(0)));
        }
        else if (tickAnim >= 45 && tickAnim < 117) {
            xx = 0 + (((tickAnim - 45) / 72) * (0-(0)));
            yy = 0 + (((tickAnim - 45) / 72) * (0-(0)));
            zz = 0 + (((tickAnim - 45) / 72) * (0-(0)));
        }
        else if (tickAnim >= 117 && tickAnim < 160) {
            xx = 0 + (((tickAnim - 117) / 43) * (0-(0)));
            yy = 0 + (((tickAnim - 117) / 43) * (0-(0)));
            zz = 0 + (((tickAnim - 117) / 43) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(main, main.rotateAngleX + (float) Math.toRadians(xx), main.rotateAngleY + (float) Math.toRadians(yy), main.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 0) / 23) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 23) * (-5.41-(0)));
            zz = 0 + (((tickAnim - 0) / 23) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 45) {
            xx = 0 + (((tickAnim - 23) / 22) * (0-(0)));
            yy = -5.41 + (((tickAnim - 23) / 22) * (-5.41-(-5.41)));
            zz = 0 + (((tickAnim - 23) / 22) * (0-(0)));
        }
        else if (tickAnim >= 45 && tickAnim < 117) {
            xx = 0 + (((tickAnim - 45) / 72) * (0-(0)));
            yy = -5.41 + (((tickAnim - 45) / 72) * (-5.41-(-5.41)));
            zz = 0 + (((tickAnim - 45) / 72) * (0-(0)));
        }
        else if (tickAnim >= 117 && tickAnim < 160) {
            xx = 0 + (((tickAnim - 117) / 43) * (0-(0)));
            yy = -5.41 + (((tickAnim - 117) / 43) * (0-(-5.41)));
            zz = 0 + (((tickAnim - 117) / 43) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.main.rotationPointX = this.main.rotationPointX + (float)(xx);
        this.main.rotationPointY = this.main.rotationPointY - (float)(yy);
        this.main.rotationPointZ = this.main.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 0) / 23) * (5.6938-(0)));
            yy = 0 + (((tickAnim - 0) / 23) * (-10.57522-(0)));
            zz = 0 + (((tickAnim - 0) / 23) * (-3.17512-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 45) {
            xx = 5.6938 + (((tickAnim - 23) / 22) * (-13.44245-(5.6938)));
            yy = -10.57522 + (((tickAnim - 23) / 22) * (-2.64182-(-10.57522)));
            zz = -3.17512 + (((tickAnim - 23) / 22) * (-0.91951-(-3.17512)));
        }
        else if (tickAnim >= 45 && tickAnim < 117) {
            xx = -13.44245 + (((tickAnim - 45) / 72) * (-13.44245-(-13.44245)));
            yy = -2.64182 + (((tickAnim - 45) / 72) * (-2.64182-(-2.64182)));
            zz = -0.91951 + (((tickAnim - 45) / 72) * (-0.91951-(-0.91951)));
        }
        else if (tickAnim >= 117 && tickAnim < 160) {
            xx = -13.44245 + (((tickAnim - 117) / 43) * (0-(-13.44245)));
            yy = -2.64182 + (((tickAnim - 117) / 43) * (0-(-2.64182)));
            zz = -0.91951 + (((tickAnim - 117) / 43) * (0-(-0.91951)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg, leftLeg.rotateAngleX + (float) Math.toRadians(xx), leftLeg.rotateAngleY + (float) Math.toRadians(yy), leftLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 0) / 23) * (49.68208-(0)));
            yy = 0 + (((tickAnim - 0) / 23) * (5.85153-(0)));
            zz = 0 + (((tickAnim - 0) / 23) * (-1.32881-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 45) {
            xx = 49.68208 + (((tickAnim - 23) / 22) * (56.5-(49.68208)));
            yy = 5.85153 + (((tickAnim - 23) / 22) * (0-(5.85153)));
            zz = -1.32881 + (((tickAnim - 23) / 22) * (0-(-1.32881)));
        }
        else if (tickAnim >= 45 && tickAnim < 117) {
            xx = 56.5 + (((tickAnim - 45) / 72) * (56.5-(56.5)));
            yy = 0 + (((tickAnim - 45) / 72) * (0-(0)));
            zz = 0 + (((tickAnim - 45) / 72) * (0-(0)));
        }
        else if (tickAnim >= 117 && tickAnim < 160) {
            xx = 56.5 + (((tickAnim - 117) / 43) * (0-(56.5)));
            yy = 0 + (((tickAnim - 117) / 43) * (0-(0)));
            zz = 0 + (((tickAnim - 117) / 43) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg2, leftLeg2.rotateAngleX + (float) Math.toRadians(xx), leftLeg2.rotateAngleY + (float) Math.toRadians(yy), leftLeg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 0) / 23) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 23) * (0.35-(0)));
            zz = 0 + (((tickAnim - 0) / 23) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 45) {
            xx = 0 + (((tickAnim - 23) / 22) * (0-(0)));
            yy = 0.35 + (((tickAnim - 23) / 22) * (0.35-(0.35)));
            zz = 0 + (((tickAnim - 23) / 22) * (0-(0)));
        }
        else if (tickAnim >= 45 && tickAnim < 117) {
            xx = 0 + (((tickAnim - 45) / 72) * (0-(0)));
            yy = 0.35 + (((tickAnim - 45) / 72) * (0.35-(0.35)));
            zz = 0 + (((tickAnim - 45) / 72) * (0-(0)));
        }
        else if (tickAnim >= 117 && tickAnim < 160) {
            xx = 0 + (((tickAnim - 117) / 43) * (0-(0)));
            yy = 0.35 + (((tickAnim - 117) / 43) * (0-(0.35)));
            zz = 0 + (((tickAnim - 117) / 43) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftLeg2.rotationPointX = this.leftLeg2.rotationPointX + (float)(xx);
        this.leftLeg2.rotationPointY = this.leftLeg2.rotationPointY - (float)(yy);
        this.leftLeg2.rotationPointZ = this.leftLeg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 0) / 23) * (-26.5-(0)));
            yy = 0 + (((tickAnim - 0) / 23) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 23) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 45) {
            xx = -26.5 + (((tickAnim - 23) / 22) * (-21.5-(-26.5)));
            yy = 0 + (((tickAnim - 23) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 22) * (0-(0)));
        }
        else if (tickAnim >= 45 && tickAnim < 117) {
            xx = -21.5 + (((tickAnim - 45) / 72) * (-21.5-(-21.5)));
            yy = 0 + (((tickAnim - 45) / 72) * (0-(0)));
            zz = 0 + (((tickAnim - 45) / 72) * (0-(0)));
        }
        else if (tickAnim >= 117 && tickAnim < 160) {
            xx = -21.5 + (((tickAnim - 117) / 43) * (0-(-21.5)));
            yy = 0 + (((tickAnim - 117) / 43) * (0-(0)));
            zz = 0 + (((tickAnim - 117) / 43) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg3, leftLeg3.rotateAngleX + (float) Math.toRadians(xx), leftLeg3.rotateAngleY + (float) Math.toRadians(yy), leftLeg3.rotateAngleZ + (float) Math.toRadians(zz));

        this.leftLeg3.rotationPointX = this.leftLeg3.rotationPointX + (float)(0);
        this.leftLeg3.rotationPointY = this.leftLeg3.rotationPointY - (float)(0);
        this.leftLeg3.rotationPointZ = this.leftLeg3.rotationPointZ + (float)(0);



        if (tickAnim >= 0 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 0) / 23) * (-15.5-(0)));
            yy = 0 + (((tickAnim - 0) / 23) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 23) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 45) {
            xx = -15.5 + (((tickAnim - 23) / 22) * (-20.5-(-15.5)));
            yy = 0 + (((tickAnim - 23) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 22) * (0-(0)));
        }
        else if (tickAnim >= 45 && tickAnim < 117) {
            xx = -20.5 + (((tickAnim - 45) / 72) * (-20.5-(-20.5)));
            yy = 0 + (((tickAnim - 45) / 72) * (0-(0)));
            zz = 0 + (((tickAnim - 45) / 72) * (0-(0)));
        }
        else if (tickAnim >= 117 && tickAnim < 160) {
            xx = -20.5 + (((tickAnim - 117) / 43) * (0-(-20.5)));
            yy = 0 + (((tickAnim - 117) / 43) * (0-(0)));
            zz = 0 + (((tickAnim - 117) / 43) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg4, leftLeg4.rotateAngleX + (float) Math.toRadians(xx), leftLeg4.rotateAngleY + (float) Math.toRadians(yy), leftLeg4.rotateAngleZ + (float) Math.toRadians(zz));

        this.leftLeg4.rotationPointX = this.leftLeg4.rotationPointX + (float)(0);
        this.leftLeg4.rotationPointY = this.leftLeg4.rotationPointY - (float)(0);
        this.leftLeg4.rotationPointZ = this.leftLeg4.rotationPointZ + (float)(0);



        if (tickAnim >= 0 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 0) / 23) * (5.6938-(0)));
            yy = 0 + (((tickAnim - 0) / 23) * (10.57522-(0)));
            zz = 0 + (((tickAnim - 0) / 23) * (3.17512-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 45) {
            xx = 5.6938 + (((tickAnim - 23) / 22) * (-13.44245-(5.6938)));
            yy = 10.57522 + (((tickAnim - 23) / 22) * (2.64182-(10.57522)));
            zz = 3.17512 + (((tickAnim - 23) / 22) * (0.91951-(3.17512)));
        }
        else if (tickAnim >= 45 && tickAnim < 117) {
            xx = -13.44245 + (((tickAnim - 45) / 72) * (-13.44245-(-13.44245)));
            yy = 2.64182 + (((tickAnim - 45) / 72) * (2.64182-(2.64182)));
            zz = 0.91951 + (((tickAnim - 45) / 72) * (0.91951-(0.91951)));
        }
        else if (tickAnim >= 117 && tickAnim < 160) {
            xx = -13.44245 + (((tickAnim - 117) / 43) * (0-(-13.44245)));
            yy = 2.64182 + (((tickAnim - 117) / 43) * (0-(2.64182)));
            zz = 0.91951 + (((tickAnim - 117) / 43) * (0-(0.91951)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg, rightLeg.rotateAngleX + (float) Math.toRadians(xx), rightLeg.rotateAngleY + (float) Math.toRadians(yy), rightLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 0) / 23) * (49.68208-(0)));
            yy = 0 + (((tickAnim - 0) / 23) * (-5.85153-(0)));
            zz = 0 + (((tickAnim - 0) / 23) * (1.32881-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 45) {
            xx = 49.68208 + (((tickAnim - 23) / 22) * (56.5-(49.68208)));
            yy = -5.85153 + (((tickAnim - 23) / 22) * (0-(-5.85153)));
            zz = 1.32881 + (((tickAnim - 23) / 22) * (0-(1.32881)));
        }
        else if (tickAnim >= 45 && tickAnim < 117) {
            xx = 56.5 + (((tickAnim - 45) / 72) * (56.5-(56.5)));
            yy = 0 + (((tickAnim - 45) / 72) * (0-(0)));
            zz = 0 + (((tickAnim - 45) / 72) * (0-(0)));
        }
        else if (tickAnim >= 117 && tickAnim < 160) {
            xx = 56.5 + (((tickAnim - 117) / 43) * (0-(56.5)));
            yy = 0 + (((tickAnim - 117) / 43) * (0-(0)));
            zz = 0 + (((tickAnim - 117) / 43) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg2, rightLeg2.rotateAngleX + (float) Math.toRadians(xx), rightLeg2.rotateAngleY + (float) Math.toRadians(yy), rightLeg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 0) / 23) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 23) * (0.35-(0)));
            zz = 0 + (((tickAnim - 0) / 23) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 45) {
            xx = 0 + (((tickAnim - 23) / 22) * (0-(0)));
            yy = 0.35 + (((tickAnim - 23) / 22) * (0.35-(0.35)));
            zz = 0 + (((tickAnim - 23) / 22) * (0-(0)));
        }
        else if (tickAnim >= 45 && tickAnim < 117) {
            xx = 0 + (((tickAnim - 45) / 72) * (0-(0)));
            yy = 0.35 + (((tickAnim - 45) / 72) * (0.35-(0.35)));
            zz = 0 + (((tickAnim - 45) / 72) * (0-(0)));
        }
        else if (tickAnim >= 117 && tickAnim < 160) {
            xx = 0 + (((tickAnim - 117) / 43) * (0-(0)));
            yy = 0.35 + (((tickAnim - 117) / 43) * (0-(0.35)));
            zz = 0 + (((tickAnim - 117) / 43) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightLeg2.rotationPointX = this.rightLeg2.rotationPointX + (float)(xx);
        this.rightLeg2.rotationPointY = this.rightLeg2.rotationPointY - (float)(yy);
        this.rightLeg2.rotationPointZ = this.rightLeg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 0) / 23) * (-26.5-(0)));
            yy = 0 + (((tickAnim - 0) / 23) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 23) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 45) {
            xx = -26.5 + (((tickAnim - 23) / 22) * (-21.5-(-26.5)));
            yy = 0 + (((tickAnim - 23) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 22) * (0-(0)));
        }
        else if (tickAnim >= 45 && tickAnim < 117) {
            xx = -21.5 + (((tickAnim - 45) / 72) * (-21.5-(-21.5)));
            yy = 0 + (((tickAnim - 45) / 72) * (0-(0)));
            zz = 0 + (((tickAnim - 45) / 72) * (0-(0)));
        }
        else if (tickAnim >= 117 && tickAnim < 160) {
            xx = -21.5 + (((tickAnim - 117) / 43) * (0-(-21.5)));
            yy = 0 + (((tickAnim - 117) / 43) * (0-(0)));
            zz = 0 + (((tickAnim - 117) / 43) * (0-(0)));
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



        if (tickAnim >= 0 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 0) / 23) * (-15.5-(0)));
            yy = 0 + (((tickAnim - 0) / 23) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 23) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 45) {
            xx = -15.5 + (((tickAnim - 23) / 22) * (-20.5-(-15.5)));
            yy = 0 + (((tickAnim - 23) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 22) * (0-(0)));
        }
        else if (tickAnim >= 45 && tickAnim < 117) {
            xx = -20.5 + (((tickAnim - 45) / 72) * (-20.5-(-20.5)));
            yy = 0 + (((tickAnim - 45) / 72) * (0-(0)));
            zz = 0 + (((tickAnim - 45) / 72) * (0-(0)));
        }
        else if (tickAnim >= 117 && tickAnim < 160) {
            xx = -20.5 + (((tickAnim - 117) / 43) * (0-(-20.5)));
            yy = 0 + (((tickAnim - 117) / 43) * (0-(0)));
            zz = 0 + (((tickAnim - 117) / 43) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg4, rightLeg4.rotateAngleX + (float) Math.toRadians(xx), rightLeg4.rotateAngleY + (float) Math.toRadians(yy), rightLeg4.rotateAngleZ + (float) Math.toRadians(zz));

        this.rightLeg4.rotationPointX = this.rightLeg4.rotationPointX + (float)(0);
        this.rightLeg4.rotationPointY = this.rightLeg4.rotationPointY - (float)(0);
        this.rightLeg4.rotationPointZ = this.rightLeg4.rotationPointZ + (float)(0);



        if (tickAnim >= 0 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 0) / 23) * (6.75-(0)));
            yy = 0 + (((tickAnim - 0) / 23) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 23) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 45) {
            xx = 6.75 + (((tickAnim - 23) / 22) * (-6.25-(6.75)));
            yy = 0 + (((tickAnim - 23) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 22) * (0-(0)));
        }
        else if (tickAnim >= 45 && tickAnim < 117) {
            xx = -6.25 + (((tickAnim - 45) / 72) * (-6.25-(-6.25)));
            yy = 0 + (((tickAnim - 45) / 72) * (0-(0)));
            zz = 0 + (((tickAnim - 45) / 72) * (0-(0)));
        }
        else if (tickAnim >= 117 && tickAnim < 139) {
            xx = -6.25 + (((tickAnim - 117) / 22) * (0-(-6.25)));
            yy = 0 + (((tickAnim - 117) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 117) / 22) * (0-(0)));
        }
        else if (tickAnim >= 139 && tickAnim < 160) {
            xx = 0 + (((tickAnim - 139) / 21) * (0-(0)));
            yy = 0 + (((tickAnim - 139) / 21) * (0-(0)));
            zz = 0 + (((tickAnim - 139) / 21) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail, tail.rotateAngleX + (float) Math.toRadians(xx), tail.rotateAngleY + (float) Math.toRadians(yy), tail.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (-11.11-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 23) {
            xx = -11.11 + (((tickAnim - 10) / 13) * (-7.75-(-11.11)));
            yy = 0 + (((tickAnim - 10) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 13) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 45) {
            xx = -7.75 + (((tickAnim - 23) / 22) * (-8.75-(-7.75)));
            yy = 0 + (((tickAnim - 23) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 22) * (0-(0)));
        }
        else if (tickAnim >= 45 && tickAnim < 117) {
            xx = -8.75 + (((tickAnim - 45) / 72) * (-8.75-(-8.75)));
            yy = 0 + (((tickAnim - 45) / 72) * (0-(0)));
            zz = 0 + (((tickAnim - 45) / 72) * (0-(0)));
        }
        else if (tickAnim >= 117 && tickAnim < 139) {
            xx = -8.75 + (((tickAnim - 117) / 22) * (-5.56-(-8.75)));
            yy = 0 + (((tickAnim - 117) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 117) / 22) * (0-(0)));
        }
        else if (tickAnim >= 139 && tickAnim < 160) {
            xx = -5.56 + (((tickAnim - 139) / 21) * (0-(-5.56)));
            yy = 0 + (((tickAnim - 139) / 21) * (0-(0)));
            zz = 0 + (((tickAnim - 139) / 21) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(xx), tail2.rotateAngleY + (float) Math.toRadians(yy), tail2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (-5-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 23) {
            xx = -5 + (((tickAnim - 10) / 13) * (-0.5-(-5)));
            yy = 0 + (((tickAnim - 10) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 13) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 45) {
            xx = -0.5 + (((tickAnim - 23) / 22) * (-6.75-(-0.5)));
            yy = 0 + (((tickAnim - 23) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 22) * (0-(0)));
        }
        else if (tickAnim >= 45 && tickAnim < 117) {
            xx = -6.75 + (((tickAnim - 45) / 72) * (-6.75-(-6.75)));
            yy = 0 + (((tickAnim - 45) / 72) * (0-(0)));
            zz = 0 + (((tickAnim - 45) / 72) * (0-(0)));
        }
        else if (tickAnim >= 117 && tickAnim < 139) {
            xx = -6.75 + (((tickAnim - 117) / 22) * (-4.99-(-6.75)));
            yy = 0 + (((tickAnim - 117) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 117) / 22) * (0-(0)));
        }
        else if (tickAnim >= 139 && tickAnim < 160) {
            xx = -4.99 + (((tickAnim - 139) / 21) * (0-(-4.99)));
            yy = 0 + (((tickAnim - 139) / 21) * (0-(0)));
            zz = 0 + (((tickAnim - 139) / 21) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(xx), tail3.rotateAngleY + (float) Math.toRadians(yy), tail3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (-3.75-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 23) {
            xx = -3.75 + (((tickAnim - 10) / 13) * (1.25-(-3.75)));
            yy = 0 + (((tickAnim - 10) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 13) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 45) {
            xx = 1.25 + (((tickAnim - 23) / 22) * (1.25-(1.25)));
            yy = 0 + (((tickAnim - 23) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 22) * (0-(0)));
        }
        else if (tickAnim >= 45 && tickAnim < 117) {
            xx = 1.25 + (((tickAnim - 45) / 72) * (1.25-(1.25)));
            yy = 0 + (((tickAnim - 45) / 72) * (0-(0)));
            zz = 0 + (((tickAnim - 45) / 72) * (0-(0)));
        }
        else if (tickAnim >= 117 && tickAnim < 126) {
            xx = 1.25 + (((tickAnim - 117) / 9) * (-10.48-(1.25)));
            yy = 0 + (((tickAnim - 117) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 117) / 9) * (0-(0)));
        }
        else if (tickAnim >= 126 && tickAnim < 139) {
            xx = -10.48 + (((tickAnim - 126) / 13) * (-7.65-(-10.48)));
            yy = 0 + (((tickAnim - 126) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 126) / 13) * (0-(0)));
        }
        else if (tickAnim >= 139 && tickAnim < 160) {
            xx = -7.65 + (((tickAnim - 139) / 21) * (0-(-7.65)));
            yy = 0 + (((tickAnim - 139) / 21) * (0-(0)));
            zz = 0 + (((tickAnim - 139) / 21) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(xx), tail4.rotateAngleY + (float) Math.toRadians(yy), tail4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 45) {
            xx = 0 + (((tickAnim - 0) / 45) * (17.25-(0)));
            yy = 0 + (((tickAnim - 0) / 45) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 45) * (0-(0)));
        }
        else if (tickAnim >= 45 && tickAnim < 117) {
            xx = 17.25 + (((tickAnim - 45) / 72) * (17.25-(17.25)));
            yy = 0 + (((tickAnim - 45) / 72) * (0-(0)));
            zz = 0 + (((tickAnim - 45) / 72) * (0-(0)));
        }
        else if (tickAnim >= 117 && tickAnim < 126) {
            xx = 17.25 + (((tickAnim - 117) / 9) * (12.88-(17.25)));
            yy = 0 + (((tickAnim - 117) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 117) / 9) * (0-(0)));
        }
        else if (tickAnim >= 126 && tickAnim < 139) {
            xx = 12.88 + (((tickAnim - 126) / 13) * (-9.25-(12.88)));
            yy = 0 + (((tickAnim - 126) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 126) / 13) * (0-(0)));
        }
        else if (tickAnim >= 139 && tickAnim < 151) {
            xx = -9.25 + (((tickAnim - 139) / 12) * (-14.82-(-9.25)));
            yy = 0 + (((tickAnim - 139) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 139) / 12) * (0-(0)));
        }
        else if (tickAnim >= 151 && tickAnim < 160) {
            xx = -14.82 + (((tickAnim - 151) / 9) * (0-(-14.82)));
            yy = 0 + (((tickAnim - 151) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 151) / 9) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail5, tail5.rotateAngleX + (float) Math.toRadians(xx), tail5.rotateAngleY + (float) Math.toRadians(yy), tail5.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 0) / 23) * (4.75-(0)));
            yy = 0 + (((tickAnim - 0) / 23) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 23) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 45) {
            xx = 4.75 + (((tickAnim - 23) / 22) * (-2.5-(4.75)));
            yy = 0 + (((tickAnim - 23) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 22) * (0-(0)));
        }
        else if (tickAnim >= 45 && tickAnim < 117) {
            xx = -2.5 + (((tickAnim - 45) / 72) * (-2.5-(-2.5)));
            yy = 0 + (((tickAnim - 45) / 72) * (0-(0)));
            zz = 0 + (((tickAnim - 45) / 72) * (0-(0)));
        }
        else if (tickAnim >= 117 && tickAnim < 160) {
            xx = -2.5 + (((tickAnim - 117) / 43) * (0-(-2.5)));
            yy = 0 + (((tickAnim - 117) / 43) * (0-(0)));
            zz = 0 + (((tickAnim - 117) / 43) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(xx), body.rotateAngleY + (float) Math.toRadians(yy), body.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 45) {
            xx = 0 + (((tickAnim - 0) / 45) * (9.5-(0)));
            yy = 0 + (((tickAnim - 0) / 45) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 45) * (0-(0)));
        }
        else if (tickAnim >= 45 && tickAnim < 117) {
            xx = 9.5 + (((tickAnim - 45) / 72) * (9.5-(9.5)));
            yy = 0 + (((tickAnim - 45) / 72) * (0-(0)));
            zz = 0 + (((tickAnim - 45) / 72) * (0-(0)));
        }
        else if (tickAnim >= 117 && tickAnim < 160) {
            xx = 9.5 + (((tickAnim - 117) / 43) * (0-(9.5)));
            yy = 0 + (((tickAnim - 117) / 43) * (0-(0)));
            zz = 0 + (((tickAnim - 117) / 43) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body2, body2.rotateAngleX + (float) Math.toRadians(xx), body2.rotateAngleY + (float) Math.toRadians(yy), body2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 0) / 23) * (23.75-(0)));
            yy = 0 + (((tickAnim - 0) / 23) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 23) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 45) {
            xx = 23.75 + (((tickAnim - 23) / 22) * (-11.51475-(23.75)));
            yy = 0 + (((tickAnim - 23) / 22) * (2.17906-(0)));
            zz = 0 + (((tickAnim - 23) / 22) * (-5.25082-(0)));
        }
        else if (tickAnim >= 45 && tickAnim < 117) {
            xx = -11.51475 + (((tickAnim - 45) / 72) * (-11.51475-(-11.51475)));
            yy = 2.17906 + (((tickAnim - 45) / 72) * (2.17906-(2.17906)));
            zz = -5.25082 + (((tickAnim - 45) / 72) * (-5.25082-(-5.25082)));
        }
        else if (tickAnim >= 117 && tickAnim < 135) {
            xx = -11.51475 + (((tickAnim - 117) / 18) * (-32.89313-(-11.51475)));
            yy = 2.17906 + (((tickAnim - 117) / 18) * (1.25715-(2.17906)));
            zz = -5.25082 + (((tickAnim - 117) / 18) * (-3.02932-(-5.25082)));
        }
        else if (tickAnim >= 135 && tickAnim < 148) {
            xx = -32.89313 + (((tickAnim - 135) / 13) * (22.14987-(-32.89313)));
            yy = 1.25715 + (((tickAnim - 135) / 13) * (0.58667-(1.25715)));
            zz = -3.02932 + (((tickAnim - 135) / 13) * (-1.41368-(-3.02932)));
        }
        else if (tickAnim >= 148 && tickAnim < 160) {
            xx = 22.14987 + (((tickAnim - 148) / 12) * (0-(22.14987)));
            yy = 0.58667 + (((tickAnim - 148) / 12) * (0-(0.58667)));
            zz = -1.41368 + (((tickAnim - 148) / 12) * (0-(-1.41368)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm, leftArm.rotateAngleX + (float) Math.toRadians(xx), leftArm.rotateAngleY + (float) Math.toRadians(yy), leftArm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 0) / 23) * (-34.75-(0)));
            yy = 0 + (((tickAnim - 0) / 23) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 23) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 45) {
            xx = -34.75 + (((tickAnim - 23) / 22) * (-47.73003-(-34.75)));
            yy = 0 + (((tickAnim - 23) / 22) * (-3.08129-(0)));
            zz = 0 + (((tickAnim - 23) / 22) * (-8.35366-(0)));
        }
        else if (tickAnim >= 45 && tickAnim < 117) {
            xx = -47.73003 + (((tickAnim - 45) / 72) * (-47.73003-(-47.73003)));
            yy = -3.08129 + (((tickAnim - 45) / 72) * (-3.08129-(-3.08129)));
            zz = -8.35366 + (((tickAnim - 45) / 72) * (-8.35366-(-8.35366)));
        }
        else if (tickAnim >= 117 && tickAnim < 135) {
            xx = -47.73003 + (((tickAnim - 117) / 18) * (-22.6038-(-47.73003)));
            yy = -3.08129 + (((tickAnim - 117) / 18) * (1.65801-(-3.08129)));
            zz = -8.35366 + (((tickAnim - 117) / 18) * (-3.52512-(-8.35366)));
        }
        else if (tickAnim >= 135 && tickAnim < 148) {
            xx = -22.6038 + (((tickAnim - 135) / 13) * (-37.29844-(-22.6038)));
            yy = 1.65801 + (((tickAnim - 135) / 13) * (0.77374-(1.65801)));
            zz = -3.52512 + (((tickAnim - 135) / 13) * (-1.64506-(-3.52512)));
        }
        else if (tickAnim >= 148 && tickAnim < 160) {
            xx = -37.29844 + (((tickAnim - 148) / 12) * (0-(-37.29844)));
            yy = 0.77374 + (((tickAnim - 148) / 12) * (0-(0.77374)));
            zz = -1.64506 + (((tickAnim - 148) / 12) * (0-(-1.64506)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm2, leftArm2.rotateAngleX + (float) Math.toRadians(xx), leftArm2.rotateAngleY + (float) Math.toRadians(yy), leftArm2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 0) / 23) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 23) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 23) * (-0.825-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 45) {
            xx = 0 + (((tickAnim - 23) / 22) * (0-(0)));
            yy = 0 + (((tickAnim - 23) / 22) * (0.875-(0)));
            zz = -0.825 + (((tickAnim - 23) / 22) * (1.28-(-0.825)));
        }
        else if (tickAnim >= 45 && tickAnim < 117) {
            xx = 0 + (((tickAnim - 45) / 72) * (0-(0)));
            yy = 0.875 + (((tickAnim - 45) / 72) * (0.875-(0.875)));
            zz = 1.28 + (((tickAnim - 45) / 72) * (1.28-(1.28)));
        }
        else if (tickAnim >= 117 && tickAnim < 160) {
            xx = 0 + (((tickAnim - 117) / 43) * (0-(0)));
            yy = 0.875 + (((tickAnim - 117) / 43) * (0-(0.875)));
            zz = 1.28 + (((tickAnim - 117) / 43) * (0-(1.28)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftArm2.rotationPointX = this.leftArm2.rotationPointX + (float)(xx);
        this.leftArm2.rotationPointY = this.leftArm2.rotationPointY - (float)(yy);
        this.leftArm2.rotationPointZ = this.leftArm2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 0) / 23) * (13.63176-(0)));
            yy = 0 + (((tickAnim - 0) / 23) * (-2.1241-(0)));
            zz = 0 + (((tickAnim - 0) / 23) * (-3.57836-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 45) {
            xx = 13.63176 + (((tickAnim - 23) / 22) * (54.71432-(13.63176)));
            yy = -2.1241 + (((tickAnim - 23) / 22) * (4.49472-(-2.1241)));
            zz = -3.57836 + (((tickAnim - 23) / 22) * (-3.0136-(-3.57836)));
        }
        else if (tickAnim >= 45 && tickAnim < 117) {
            xx = 54.71432 + (((tickAnim - 45) / 72) * (54.71432-(54.71432)));
            yy = 4.49472 + (((tickAnim - 45) / 72) * (4.49472-(4.49472)));
            zz = -3.0136 + (((tickAnim - 45) / 72) * (-3.0136-(-3.0136)));
        }
        else if (tickAnim >= 117 && tickAnim < 135) {
            xx = 54.71432 + (((tickAnim - 117) / 18) * (52.09244-(54.71432)));
            yy = 4.49472 + (((tickAnim - 117) / 18) * (-5.69126-(4.49472)));
            zz = -3.0136 + (((tickAnim - 117) / 18) * (1.92527-(-3.0136)));
        }
        else if (tickAnim >= 135 && tickAnim < 148) {
            xx = 52.09244 + (((tickAnim - 135) / 13) * (72.8098-(52.09244)));
            yy = -5.69126 + (((tickAnim - 135) / 13) * (-2.65592-(-5.69126)));
            zz = 1.92527 + (((tickAnim - 135) / 13) * (0.89846-(1.92527)));
        }
        else if (tickAnim >= 148 && tickAnim < 160) {
            xx = 72.8098 + (((tickAnim - 148) / 12) * (0-(72.8098)));
            yy = -2.65592 + (((tickAnim - 148) / 12) * (0-(-2.65592)));
            zz = 0.89846 + (((tickAnim - 148) / 12) * (0-(0.89846)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm3, leftArm3.rotateAngleX + (float) Math.toRadians(xx), leftArm3.rotateAngleY + (float) Math.toRadians(yy), leftArm3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 0) / 23) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 23) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 23) * (0.4-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 45) {
            xx = 0 + (((tickAnim - 23) / 22) * (0-(0)));
            yy = 0 + (((tickAnim - 23) / 22) * (-0.525-(0)));
            zz = 0.4 + (((tickAnim - 23) / 22) * (-0.325-(0.4)));
        }
        else if (tickAnim >= 45 && tickAnim < 117) {
            xx = 0 + (((tickAnim - 45) / 72) * (0-(0)));
            yy = -0.525 + (((tickAnim - 45) / 72) * (-0.525-(-0.525)));
            zz = -0.325 + (((tickAnim - 45) / 72) * (-0.325-(-0.325)));
        }
        else if (tickAnim >= 117 && tickAnim < 135) {
            xx = 0 + (((tickAnim - 117) / 18) * (0-(0)));
            yy = -0.525 + (((tickAnim - 117) / 18) * (-0.3-(-0.525)));
            zz = -0.325 + (((tickAnim - 117) / 18) * (0.06-(-0.325)));
        }
        else if (tickAnim >= 135 && tickAnim < 160) {
            xx = 0 + (((tickAnim - 135) / 25) * (0-(0)));
            yy = -0.3 + (((tickAnim - 135) / 25) * (0-(-0.3)));
            zz = 0.06 + (((tickAnim - 135) / 25) * (0-(0.06)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftArm3.rotationPointX = this.leftArm3.rotationPointX + (float)(xx);
        this.leftArm3.rotationPointY = this.leftArm3.rotationPointY - (float)(yy);
        this.leftArm3.rotationPointZ = this.leftArm3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 0) / 23) * (23.75-(0)));
            yy = 0 + (((tickAnim - 0) / 23) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 23) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 45) {
            xx = 23.75 + (((tickAnim - 23) / 22) * (-11.51475-(23.75)));
            yy = 0 + (((tickAnim - 23) / 22) * (-2.17906-(0)));
            zz = 0 + (((tickAnim - 23) / 22) * (5.25082-(0)));
        }
        else if (tickAnim >= 45 && tickAnim < 117) {
            xx = -11.51475 + (((tickAnim - 45) / 72) * (-11.51475-(-11.51475)));
            yy = -2.17906 + (((tickAnim - 45) / 72) * (-2.17906-(-2.17906)));
            zz = 5.25082 + (((tickAnim - 45) / 72) * (5.25082-(5.25082)));
        }
        else if (tickAnim >= 117 && tickAnim < 125) {
            xx = -11.51475 + (((tickAnim - 117) / 8) * (-1.03077-(-11.51475)));
            yy = -2.17906 + (((tickAnim - 117) / 8) * (-1.18858-(-2.17906)));
            zz = 5.25082 + (((tickAnim - 117) / 8) * (2.86408-(5.25082)));
        }
        else if (tickAnim >= 125 && tickAnim < 135) {
            xx = -1.03077 + (((tickAnim - 125) / 10) * (-1.5-(-1.03077)));
            yy = -1.18858 + (((tickAnim - 125) / 10) * (0-(-1.18858)));
            zz = 2.86408 + (((tickAnim - 125) / 10) * (0-(2.86408)));
        }
        else if (tickAnim >= 135 && tickAnim < 160) {
            xx = -1.5 + (((tickAnim - 135) / 25) * (0-(-1.5)));
            yy = 0 + (((tickAnim - 135) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 135) / 25) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm, rightArm.rotateAngleX + (float) Math.toRadians(xx), rightArm.rotateAngleY + (float) Math.toRadians(yy), rightArm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 0) / 23) * (-34.75-(0)));
            yy = 0 + (((tickAnim - 0) / 23) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 23) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 45) {
            xx = -34.75 + (((tickAnim - 23) / 22) * (-47.73003-(-34.75)));
            yy = 0 + (((tickAnim - 23) / 22) * (3.08129-(0)));
            zz = 0 + (((tickAnim - 23) / 22) * (8.35366-(0)));
        }
        else if (tickAnim >= 45 && tickAnim < 117) {
            xx = -47.73003 + (((tickAnim - 45) / 72) * (-47.73003-(-47.73003)));
            yy = 3.08129 + (((tickAnim - 45) / 72) * (3.08129-(3.08129)));
            zz = 8.35366 + (((tickAnim - 45) / 72) * (8.35366-(8.35366)));
        }
        else if (tickAnim >= 117 && tickAnim < 125) {
            xx = -47.73003 + (((tickAnim - 117) / 8) * (-43.09814-(-47.73003)));
            yy = 3.08129 + (((tickAnim - 117) / 8) * (1.56758-(3.08129)));
            zz = 8.35366 + (((tickAnim - 117) / 8) * (3.33284-(8.35366)));
        }
        else if (tickAnim >= 125 && tickAnim < 135) {
            xx = -43.09814 + (((tickAnim - 125) / 10) * (-13.25-(-43.09814)));
            yy = 1.56758 + (((tickAnim - 125) / 10) * (0-(1.56758)));
            zz = 3.33284 + (((tickAnim - 125) / 10) * (0-(3.33284)));
        }
        else if (tickAnim >= 135 && tickAnim < 160) {
            xx = -13.25 + (((tickAnim - 135) / 25) * (0-(-13.25)));
            yy = 0 + (((tickAnim - 135) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 135) / 25) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm2, rightArm2.rotateAngleX + (float) Math.toRadians(xx), rightArm2.rotateAngleY + (float) Math.toRadians(yy), rightArm2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 0) / 23) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 23) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 23) * (-0.825-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 45) {
            xx = 0 + (((tickAnim - 23) / 22) * (0-(0)));
            yy = 0 + (((tickAnim - 23) / 22) * (0.875-(0)));
            zz = -0.825 + (((tickAnim - 23) / 22) * (1.28-(-0.825)));
        }
        else if (tickAnim >= 45 && tickAnim < 117) {
            xx = 0 + (((tickAnim - 45) / 72) * (0-(0)));
            yy = 0.875 + (((tickAnim - 45) / 72) * (0.875-(0.875)));
            zz = 1.28 + (((tickAnim - 45) / 72) * (1.28-(1.28)));
        }
        else if (tickAnim >= 117 && tickAnim < 135) {
            xx = 0 + (((tickAnim - 117) / 18) * (0-(0)));
            yy = 0.875 + (((tickAnim - 117) / 18) * (0-(0.875)));
            zz = 1.28 + (((tickAnim - 117) / 18) * (0.225-(1.28)));
        }
        else if (tickAnim >= 135 && tickAnim < 160) {
            xx = 0 + (((tickAnim - 135) / 25) * (0-(0)));
            yy = 0 + (((tickAnim - 135) / 25) * (0-(0)));
            zz = 0.225 + (((tickAnim - 135) / 25) * (0-(0.225)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightArm2.rotationPointX = this.rightArm2.rotationPointX + (float)(xx);
        this.rightArm2.rotationPointY = this.rightArm2.rotationPointY - (float)(yy);
        this.rightArm2.rotationPointZ = this.rightArm2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 0) / 23) * (13.63176-(0)));
            yy = 0 + (((tickAnim - 0) / 23) * (-2.1241-(0)));
            zz = 0 + (((tickAnim - 0) / 23) * (-3.57836-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 45) {
            xx = 13.63176 + (((tickAnim - 23) / 22) * (54.71432-(13.63176)));
            yy = -2.1241 + (((tickAnim - 23) / 22) * (-4.49472-(-2.1241)));
            zz = -3.57836 + (((tickAnim - 23) / 22) * (3.0136-(-3.57836)));
        }
        else if (tickAnim >= 45 && tickAnim < 117) {
            xx = 54.71432 + (((tickAnim - 45) / 72) * (54.71432-(54.71432)));
            yy = -4.49472 + (((tickAnim - 45) / 72) * (-4.49472-(-4.49472)));
            zz = 3.0136 + (((tickAnim - 45) / 72) * (3.0136-(3.0136)));
        }
        else if (tickAnim >= 117 && tickAnim < 125) {
            xx = 54.71432 + (((tickAnim - 117) / 8) * (76.81467-(54.71432)));
            yy = -4.49472 + (((tickAnim - 117) / 8) * (5.38082-(-4.49472)));
            zz = 3.0136 + (((tickAnim - 117) / 8) * (-1.82025-(3.0136)));
        }
        else if (tickAnim >= 125 && tickAnim < 135) {
            xx = 76.81467 + (((tickAnim - 125) / 10) * (13-(76.81467)));
            yy = 5.38082 + (((tickAnim - 125) / 10) * (0-(5.38082)));
            zz = -1.82025 + (((tickAnim - 125) / 10) * (0-(-1.82025)));
        }
        else if (tickAnim >= 135 && tickAnim < 160) {
            xx = 13 + (((tickAnim - 135) / 25) * (0-(13)));
            yy = 0 + (((tickAnim - 135) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 135) / 25) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm3, rightArm3.rotateAngleX + (float) Math.toRadians(xx), rightArm3.rotateAngleY + (float) Math.toRadians(yy), rightArm3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 0) / 23) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 23) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 23) * (0.4-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 45) {
            xx = 0 + (((tickAnim - 23) / 22) * (0-(0)));
            yy = 0 + (((tickAnim - 23) / 22) * (-0.525-(0)));
            zz = 0.4 + (((tickAnim - 23) / 22) * (-0.325-(0.4)));
        }
        else if (tickAnim >= 45 && tickAnim < 117) {
            xx = 0 + (((tickAnim - 45) / 72) * (0-(0)));
            yy = -0.525 + (((tickAnim - 45) / 72) * (-0.525-(-0.525)));
            zz = -0.325 + (((tickAnim - 45) / 72) * (-0.325-(-0.325)));
        }
        else if (tickAnim >= 117 && tickAnim < 125) {
            xx = 0 + (((tickAnim - 117) / 8) * (0-(0)));
            yy = -0.525 + (((tickAnim - 117) / 8) * (0.62-(-0.525)));
            zz = -0.325 + (((tickAnim - 117) / 8) * (-0.605-(-0.325)));
        }
        else if (tickAnim >= 125 && tickAnim < 135) {
            xx = 0 + (((tickAnim - 125) / 10) * (0-(0)));
            yy = 0.62 + (((tickAnim - 125) / 10) * (0.85-(0.62)));
            zz = -0.605 + (((tickAnim - 125) / 10) * (-0.575-(-0.605)));
        }
        else if (tickAnim >= 135 && tickAnim < 160) {
            xx = 0 + (((tickAnim - 135) / 25) * (0-(0)));
            yy = 0.85 + (((tickAnim - 135) / 25) * (0-(0.85)));
            zz = -0.575 + (((tickAnim - 135) / 25) * (0-(-0.575)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightArm3.rotationPointX = this.rightArm3.rotationPointX + (float)(xx);
        this.rightArm3.rotationPointY = this.rightArm3.rotationPointY - (float)(yy);
        this.rightArm3.rotationPointZ = this.rightArm3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 0) / 23) * (27-(0)));
            yy = 0 + (((tickAnim - 0) / 23) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 23) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 45) {
            xx = 27 + (((tickAnim - 23) / 22) * (30-(27)));
            yy = 0 + (((tickAnim - 23) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 22) * (0-(0)));
        }
        else if (tickAnim >= 45 && tickAnim < 117) {
            xx = 30 + (((tickAnim - 45) / 72) * (30-(30)));
            yy = 0 + (((tickAnim - 45) / 72) * (0-(0)));
            zz = 0 + (((tickAnim - 45) / 72) * (0-(0)));
        }
        else if (tickAnim >= 117 && tickAnim < 160) {
            xx = 30 + (((tickAnim - 117) / 43) * (0-(30)));
            yy = 0 + (((tickAnim - 117) / 43) * (0-(0)));
            zz = 0 + (((tickAnim - 117) / 43) * (0-(0)));
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
            zz = 0 + (((tickAnim - 0) / 23) * (0.225-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 117) {
            xx = 0 + (((tickAnim - 23) / 94) * (0-(0)));
            yy = 0 + (((tickAnim - 23) / 94) * (0-(0)));
            zz = 0.225 + (((tickAnim - 23) / 94) * (0.225-(0.225)));
        }
        else if (tickAnim >= 117 && tickAnim < 160) {
            xx = 0 + (((tickAnim - 117) / 43) * (0-(0)));
            yy = 0 + (((tickAnim - 117) / 43) * (0-(0)));
            zz = 0.225 + (((tickAnim - 117) / 43) * (0-(0.225)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.neck.rotationPointX = this.neck.rotationPointX + (float)(xx);
        this.neck.rotationPointY = this.neck.rotationPointY - (float)(yy);
        this.neck.rotationPointZ = this.neck.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 0) / 23) * (18.25-(0)));
            yy = 0 + (((tickAnim - 0) / 23) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 23) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 45) {
            xx = 18.25 + (((tickAnim - 23) / 22) * (22.25-(18.25)));
            yy = 0 + (((tickAnim - 23) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 22) * (0-(0)));
        }
        else if (tickAnim >= 45 && tickAnim < 117) {
            xx = 22.25 + (((tickAnim - 45) / 72) * (22.25-(22.25)));
            yy = 0 + (((tickAnim - 45) / 72) * (0-(0)));
            zz = 0 + (((tickAnim - 45) / 72) * (0-(0)));
        }
        else if (tickAnim >= 117 && tickAnim < 160) {
            xx = 22.25 + (((tickAnim - 117) / 43) * (0-(22.25)));
            yy = 0 + (((tickAnim - 117) / 43) * (0-(0)));
            zz = 0 + (((tickAnim - 117) / 43) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(xx), neck2.rotateAngleY + (float) Math.toRadians(yy), neck2.rotateAngleZ + (float) Math.toRadians(zz));


    }
    public void animEat(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraSpicomellus entity = (EntityPrehistoricFloraSpicomellus) entitylivingbaseIn;
        int animCycle = 20;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (9.75-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 9.75 + (((tickAnim - 10) / 10) * (0-(9.75)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body2, body2.rotateAngleX + (float) Math.toRadians(xx), body2.rotateAngleY + (float) Math.toRadians(yy), body2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (-15.70029-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0.00152-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (-3.78849-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = -15.70029 + (((tickAnim - 10) / 10) * (0-(-15.70029)));
            yy = 0.00152 + (((tickAnim - 10) / 10) * (0-(0.00152)));
            zz = -3.78849 + (((tickAnim - 10) / 10) * (0-(-3.78849)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm, leftArm.rotateAngleX + (float) Math.toRadians(xx), leftArm.rotateAngleY + (float) Math.toRadians(yy), leftArm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (-4.14375-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (-3.92467-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (-3.10032-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = -4.14375 + (((tickAnim - 10) / 10) * (0-(-4.14375)));
            yy = -3.92467 + (((tickAnim - 10) / 10) * (0-(-3.92467)));
            zz = -3.10032 + (((tickAnim - 10) / 10) * (0-(-3.10032)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm2, leftArm2.rotateAngleX + (float) Math.toRadians(xx), leftArm2.rotateAngleY + (float) Math.toRadians(yy), leftArm2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (10.25-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 10.25 + (((tickAnim - 10) / 10) * (0-(10.25)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm3, leftArm3.rotateAngleX + (float) Math.toRadians(xx), leftArm3.rotateAngleY + (float) Math.toRadians(yy), leftArm3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (-15.49315-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (-0.00673-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (3.24731-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = -15.49315 + (((tickAnim - 10) / 10) * (0-(-15.49315)));
            yy = -0.00673 + (((tickAnim - 10) / 10) * (0-(-0.00673)));
            zz = 3.24731 + (((tickAnim - 10) / 10) * (0-(3.24731)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm, rightArm.rotateAngleX + (float) Math.toRadians(xx), rightArm.rotateAngleY + (float) Math.toRadians(yy), rightArm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (-4.14375-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (3.92467-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (3.10032-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = -4.14375 + (((tickAnim - 10) / 10) * (0-(-4.14375)));
            yy = 3.92467 + (((tickAnim - 10) / 10) * (0-(3.92467)));
            zz = 3.10032 + (((tickAnim - 10) / 10) * (0-(3.10032)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm2, rightArm2.rotateAngleX + (float) Math.toRadians(xx), rightArm2.rotateAngleY + (float) Math.toRadians(yy), rightArm2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (10.25-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 10.25 + (((tickAnim - 10) / 10) * (0-(10.25)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm3, rightArm3.rotateAngleX + (float) Math.toRadians(xx), rightArm3.rotateAngleY + (float) Math.toRadians(yy), rightArm3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (26-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 26 + (((tickAnim - 10) / 10) * (0-(26)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(xx), neck.rotateAngleY + (float) Math.toRadians(yy), neck.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (11.75-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 11.75 + (((tickAnim - 10) / 3) * (24.06-(11.75)));
            yy = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 3) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 20) {
            xx = 24.06 + (((tickAnim - 13) / 7) * (0-(24.06)));
            yy = 0 + (((tickAnim - 13) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(xx), neck2.rotateAngleY + (float) Math.toRadians(yy), neck2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (12.25-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 12.25 + (((tickAnim - 5) / 5) * (-9.5-(12.25)));
            yy = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 5) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = -9.5 + (((tickAnim - 10) / 3) * (0-(-9.5)));
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
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 5) / 5) * (18.25-(0)));
            yy = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 5) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 18.25 + (((tickAnim - 10) / 3) * (0-(18.25)));
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
    public void animYawn(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraSpicomellus entity = (EntityPrehistoricFloraSpicomellus) entitylivingbaseIn;
        int animCycle = 50;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (-1-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 33) {
            xx = -1 + (((tickAnim - 20) / 13) * (-2.75-(-1)));
            yy = 0 + (((tickAnim - 20) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 13) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 50) {
            xx = -2.75 + (((tickAnim - 33) / 17) * (0-(-2.75)));
            yy = 0 + (((tickAnim - 33) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 17) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(xx), neck.rotateAngleY + (float) Math.toRadians(yy), neck.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (3.25-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 33) {
            xx = 3.25 + (((tickAnim - 20) / 13) * (7.25-(3.25)));
            yy = 0 + (((tickAnim - 20) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 13) * (0-(0)));
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
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(xx), neck2.rotateAngleY + (float) Math.toRadians(yy), neck2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (-6.25-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 33) {
            xx = -6.25 + (((tickAnim - 20) / 13) * (-11.75-(-6.25)));
            yy = 0 + (((tickAnim - 20) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 13) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 50) {
            xx = -11.75 + (((tickAnim - 33) / 17) * (0-(-11.75)));
            yy = 0 + (((tickAnim - 33) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 17) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (18-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 33) {
            xx = 18 + (((tickAnim - 20) / 13) * (20.75-(18)));
            yy = 0 + (((tickAnim - 20) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 13) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 40) {
            xx = 20.75 + (((tickAnim - 33) / 7) * (0-(20.75)));
            yy = 0 + (((tickAnim - 33) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(xx), jaw.rotateAngleY + (float) Math.toRadians(yy), jaw.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 10) / 10) * (13.25-(0)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 13.25 + (((tickAnim - 20) / 10) * (13.25-(13.25)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = 13.25 + (((tickAnim - 30) / 10) * (0-(13.25)));
            yy = 0 + (((tickAnim - 30) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(eye, eye.rotateAngleX + (float) Math.toRadians(xx), eye.rotateAngleY + (float) Math.toRadians(yy), eye.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 10) * (0.075-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            yy = 0.075 + (((tickAnim - 20) / 10) * (0.075-(0.075)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 30) / 10) * (0-(0)));
            yy = 0.075 + (((tickAnim - 30) / 10) * (0-(0.075)));
            zz = 0 + (((tickAnim - 30) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.eye.rotationPointX = this.eye.rotationPointX + (float)(xx);
        this.eye.rotationPointY = this.eye.rotationPointY - (float)(yy);
        this.eye.rotationPointZ = this.eye.rotationPointZ + (float)(zz);


        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 1 + (((tickAnim - 0) / 10) * (1-(1)));
            yy = 1 + (((tickAnim - 0) / 10) * (1-(1)));
            zz = 1 + (((tickAnim - 0) / 10) * (1-(1)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 1 + (((tickAnim - 10) / 10) * (1-(1)));
            yy = 1 + (((tickAnim - 10) / 10) * (0-(1)));
            zz = 1 + (((tickAnim - 10) / 10) * (1-(1)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 1 + (((tickAnim - 20) / 10) * (1-(1)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 1 + (((tickAnim - 20) / 10) * (1-(1)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = 1 + (((tickAnim - 30) / 10) * (1-(1)));
            yy = 0 + (((tickAnim - 30) / 10) * (1-(0)));
            zz = 1 + (((tickAnim - 30) / 10) * (1-(1)));
        }
        else {
            xx = 1;
            yy = 1;
            zz = 1;
        }
        this.eye.setScale((float)xx, (float)yy, (float)zz);


    }
    public void animBlink(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraSpicomellus entity = (EntityPrehistoricFloraSpicomellus) entitylivingbaseIn;
        int animCycle = 14;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (13.25-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = 13.25 + (((tickAnim - 7) / 1) * (13.25-(13.25)));
            yy = 0 + (((tickAnim - 7) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 1) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 14) {
            xx = 13.25 + (((tickAnim - 8) / 6) * (0-(13.25)));
            yy = 0 + (((tickAnim - 8) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(eye, eye.rotateAngleX + (float) Math.toRadians(xx), eye.rotateAngleY + (float) Math.toRadians(yy), eye.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (0.075-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 7) / 1) * (0-(0)));
            yy = 0.075 + (((tickAnim - 7) / 1) * (0.075-(0.075)));
            zz = 0 + (((tickAnim - 7) / 1) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 8) / 6) * (0-(0)));
            yy = 0.075 + (((tickAnim - 8) / 6) * (0-(0.075)));
            zz = 0 + (((tickAnim - 8) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.eye.rotationPointX = this.eye.rotationPointX + (float)(xx);
        this.eye.rotationPointY = this.eye.rotationPointY - (float)(yy);
        this.eye.rotationPointZ = this.eye.rotationPointZ + (float)(zz);


        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 1 + (((tickAnim - 0) / 7) * (1-(1)));
            yy = 1 + (((tickAnim - 0) / 7) * (0-(1)));
            zz = 1 + (((tickAnim - 0) / 7) * (1-(1)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = 1 + (((tickAnim - 7) / 1) * (1-(1)));
            yy = 0 + (((tickAnim - 7) / 1) * (0-(0)));
            zz = 1 + (((tickAnim - 7) / 1) * (1-(1)));
        }
        else if (tickAnim >= 8 && tickAnim < 14) {
            xx = 1 + (((tickAnim - 8) / 6) * (1-(1)));
            yy = 0 + (((tickAnim - 8) / 6) * (1-(0)));
            zz = 1 + (((tickAnim - 8) / 6) * (1-(1)));
        }
        else {
            xx = 1;
            yy = 1;
            zz = 1;
        }
        this.eye.setScale((float)xx, (float)yy, (float)zz);



    }
    public void animAttack(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraSpicomellus entity = (EntityPrehistoricFloraSpicomellus) entitylivingbaseIn;
        int animCycle = 25;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (8.5-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 16) {
            xx = 0 + (((tickAnim - 7) / 9) * (-1.26455-(0)));
            yy = 8.5 + (((tickAnim - 7) / 9) * (27.9367-(8.5)));
            zz = 0 + (((tickAnim - 7) / 9) * (-6.48796-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 25) {
            xx = -1.26455 + (((tickAnim - 16) / 9) * (0-(-1.26455)));
            yy = 27.9367 + (((tickAnim - 16) / 9) * (0-(27.9367)));
            zz = -6.48796 + (((tickAnim - 16) / 9) * (0-(-6.48796)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(main, main.rotateAngleX + (float) Math.toRadians(xx), main.rotateAngleY + (float) Math.toRadians(yy), main.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 0) / 25) * (0-(0)));
            yy = -2.775 + (((tickAnim - 0) / 25) * (-2.775-(-2.775)));
            zz = 0 + (((tickAnim - 0) / 25) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.main.rotationPointX = this.main.rotationPointX + (float)(xx);
        this.main.rotationPointY = this.main.rotationPointY - (float)(yy);
        this.main.rotationPointZ = this.main.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = -10.25 + (((tickAnim - 0) / 7) * (-10.01905-(-10.25)));
            yy = 0 + (((tickAnim - 0) / 7) * (-1.80249-(0)));
            zz = -0.75 + (((tickAnim - 0) / 7) * (-1.53055-(-0.75)));
        }
        else if (tickAnim >= 7 && tickAnim < 16) {
            xx = -10.01905 + (((tickAnim - 7) / 9) * (1.37594-(-10.01905)));
            yy = -1.80249 + (((tickAnim - 7) / 9) * (-3.67813-(-1.80249)));
            zz = -1.53055 + (((tickAnim - 7) / 9) * (-1.95829-(-1.53055)));
        }
        else if (tickAnim >= 16 && tickAnim < 25) {
            xx = 1.37594 + (((tickAnim - 16) / 9) * (-10.25-(1.37594)));
            yy = -3.67813 + (((tickAnim - 16) / 9) * (0-(-3.67813)));
            zz = -1.95829 + (((tickAnim - 16) / 9) * (-0.75-(-1.95829)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg, leftLeg.rotateAngleX + (float) Math.toRadians(xx), leftLeg.rotateAngleY + (float) Math.toRadians(yy), leftLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 4.39977 + (((tickAnim - 0) / 7) * (5.39977-(4.39977)));
            yy = -17.87225 + (((tickAnim - 0) / 7) * (-17.87225-(-17.87225)));
            zz = 15.95299 + (((tickAnim - 0) / 7) * (15.95299-(15.95299)));
        }
        else if (tickAnim >= 7 && tickAnim < 16) {
            xx = 5.39977 + (((tickAnim - 7) / 9) * (5.24898-(5.39977)));
            yy = -17.87225 + (((tickAnim - 7) / 9) * (-21.30971-(-17.87225)));
            zz = 15.95299 + (((tickAnim - 7) / 9) * (18.48523-(15.95299)));
        }
        else if (tickAnim >= 16 && tickAnim < 25) {
            xx = 5.24898 + (((tickAnim - 16) / 9) * (4.39977-(5.24898)));
            yy = -21.30971 + (((tickAnim - 16) / 9) * (-17.87225-(-21.30971)));
            zz = 18.48523 + (((tickAnim - 16) / 9) * (15.95299-(18.48523)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg2, leftLeg2.rotateAngleX + (float) Math.toRadians(xx), leftLeg2.rotateAngleY + (float) Math.toRadians(yy), leftLeg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 0) / 25) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 25) * (0-(0)));
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
            xx = -14 + (((tickAnim - 0) / 7) * (-14.75-(-14)));
            yy = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 25) {
            xx = -14.75 + (((tickAnim - 7) / 18) * (-14-(-14.75)));
            yy = 0 + (((tickAnim - 7) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 18) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg3, leftLeg3.rotateAngleX + (float) Math.toRadians(xx), leftLeg3.rotateAngleY + (float) Math.toRadians(yy), leftLeg3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 19.0207 + (((tickAnim - 0) / 7) * (19.0207-(19.0207)));
            yy = 4.54463 + (((tickAnim - 0) / 7) * (4.54463-(4.54463)));
            zz = -20.64103 + (((tickAnim - 0) / 7) * (-20.64103-(-20.64103)));
        }
        else if (tickAnim >= 7 && tickAnim < 16) {
            xx = 19.0207 + (((tickAnim - 7) / 9) * (6.78193-(19.0207)));
            yy = 4.54463 + (((tickAnim - 7) / 9) * (6.0532-(4.54463)));
            zz = -20.64103 + (((tickAnim - 7) / 9) * (-15.37338-(-20.64103)));
        }
        else if (tickAnim >= 16 && tickAnim < 25) {
            xx = 6.78193 + (((tickAnim - 16) / 9) * (19.0207-(6.78193)));
            yy = 6.0532 + (((tickAnim - 16) / 9) * (4.54463-(6.0532)));
            zz = -15.37338 + (((tickAnim - 16) / 9) * (-20.64103-(-15.37338)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg4, leftLeg4.rotateAngleX + (float) Math.toRadians(xx), leftLeg4.rotateAngleY + (float) Math.toRadians(yy), leftLeg4.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            yy = 0.675 + (((tickAnim - 0) / 7) * (0.675-(0.675)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 16) {
            xx = 0 + (((tickAnim - 7) / 9) * (0-(0)));
            yy = 0.675 + (((tickAnim - 7) / 9) * (-0.095-(0.675)));
            zz = 0 + (((tickAnim - 7) / 9) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 16) / 9) * (0-(0)));
            yy = -0.095 + (((tickAnim - 16) / 9) * (0.675-(-0.095)));
            zz = 0 + (((tickAnim - 16) / 9) * (0-(0)));
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
            xx = 0 + (((tickAnim - 0) / 7) * (-5.5-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            zz = -4.5 + (((tickAnim - 0) / 7) * (3.75-(-4.5)));
        }
        else if (tickAnim >= 7 && tickAnim < 16) {
            xx = -5.5 + (((tickAnim - 7) / 9) * (-7.51444-(-5.5)));
            yy = 0 + (((tickAnim - 7) / 9) * (-4.61301-(0)));
            zz = 3.75 + (((tickAnim - 7) / 9) * (9.90917-(3.75)));
        }
        else if (tickAnim >= 16 && tickAnim < 25) {
            xx = -7.51444 + (((tickAnim - 16) / 9) * (0-(-7.51444)));
            yy = -4.61301 + (((tickAnim - 16) / 9) * (0-(-4.61301)));
            zz = 9.90917 + (((tickAnim - 16) / 9) * (-4.5-(9.90917)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg, rightLeg.rotateAngleX + (float) Math.toRadians(xx), rightLeg.rotateAngleY + (float) Math.toRadians(yy), rightLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 25) {
            xx = 21.96772 + (((tickAnim - 0) / 25) * (21.96772-(21.96772)));
            yy = 11.06933 + (((tickAnim - 0) / 25) * (11.06933-(11.06933)));
            zz = 4.6694 + (((tickAnim - 0) / 25) * (4.6694-(4.6694)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg2, rightLeg2.rotateAngleX + (float) Math.toRadians(xx), rightLeg2.rotateAngleY + (float) Math.toRadians(yy), rightLeg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 16) {
            xx = 0 + (((tickAnim - 7) / 9) * (-12.25-(0)));
            yy = 0 + (((tickAnim - 7) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 9) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 25) {
            xx = -12.25 + (((tickAnim - 16) / 9) * (0-(-12.25)));
            yy = 0 + (((tickAnim - 16) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 16) / 9) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg3, rightLeg3.rotateAngleX + (float) Math.toRadians(xx), rightLeg3.rotateAngleY + (float) Math.toRadians(yy), rightLeg3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = -21.91367 + (((tickAnim - 0) / 7) * (-12.51178-(-21.91367)));
            yy = 0.42163 + (((tickAnim - 0) / 7) * (1.08109-(0.42163)));
            zz = 4.20772 + (((tickAnim - 0) / 7) * (-3.26392-(4.20772)));
        }
        else if (tickAnim >= 7 && tickAnim < 16) {
            xx = -12.51178 + (((tickAnim - 7) / 9) * (-2.76741-(-12.51178)));
            yy = 1.08109 + (((tickAnim - 7) / 9) * (-2.39439-(1.08109)));
            zz = -3.26392 + (((tickAnim - 7) / 9) * (-6.18806-(-3.26392)));
        }
        else if (tickAnim >= 16 && tickAnim < 25) {
            xx = -2.76741 + (((tickAnim - 16) / 9) * (-21.91367-(-2.76741)));
            yy = -2.39439 + (((tickAnim - 16) / 9) * (0.42163-(-2.39439)));
            zz = -6.18806 + (((tickAnim - 16) / 9) * (4.20772-(-6.18806)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg4, rightLeg4.rotateAngleX + (float) Math.toRadians(xx), rightLeg4.rotateAngleY + (float) Math.toRadians(yy), rightLeg4.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            yy = 1 + (((tickAnim - 0) / 7) * (1-(1)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 16) {
            xx = 0 + (((tickAnim - 7) / 9) * (0-(0)));
            yy = 1 + (((tickAnim - 7) / 9) * (1.25-(1)));
            zz = 0 + (((tickAnim - 7) / 9) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 16) / 9) * (0-(0)));
            yy = 1.25 + (((tickAnim - 16) / 9) * (1-(1.25)));
            zz = 0 + (((tickAnim - 16) / 9) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightLeg4.rotationPointX = this.rightLeg4.rotationPointX + (float)(xx);
        this.rightLeg4.rotationPointY = this.rightLeg4.rotationPointY - (float)(yy);
        this.rightLeg4.rotationPointZ = this.rightLeg4.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 3.42262 + (((tickAnim - 0) / 7) * (3.23707-(3.42262)));
            yy = 6.1452 + (((tickAnim - 0) / 7) * (-9.92479-(6.1452)));
            zz = -2.1206 + (((tickAnim - 0) / 7) * (3.44653-(-2.1206)));
        }
        else if (tickAnim >= 7 && tickAnim < 16) {
            xx = 3.23707 + (((tickAnim - 7) / 9) * (5.51383-(3.23707)));
            yy = -9.92479 + (((tickAnim - 7) / 9) * (1.85025-(-9.92479)));
            zz = 3.44653 + (((tickAnim - 7) / 9) * (2.09237-(3.44653)));
        }
        else if (tickAnim >= 16 && tickAnim < 25) {
            xx = 5.51383 + (((tickAnim - 16) / 9) * (3.42262-(5.51383)));
            yy = 1.85025 + (((tickAnim - 16) / 9) * (6.1452-(1.85025)));
            zz = 2.09237 + (((tickAnim - 16) / 9) * (-2.1206-(2.09237)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail, tail.rotateAngleX + (float) Math.toRadians(xx), tail.rotateAngleY + (float) Math.toRadians(yy), tail.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 16) {
            xx = 0 + (((tickAnim - 0) / 16) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 16) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 16) * (-1.175-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 16) / 9) * (0-(0)));
            yy = 0 + (((tickAnim - 16) / 9) * (0-(0)));
            zz = -1.175 + (((tickAnim - 16) / 9) * (0-(-1.175)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.tail.rotationPointX = this.tail.rotationPointX + (float)(xx);
        this.tail.rotationPointY = this.tail.rotationPointY - (float)(yy);
        this.tail.rotationPointZ = this.tail.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 10.27609 + (((tickAnim - 0) / 7) * (10.05129-(10.27609)));
            yy = 11.828 + (((tickAnim - 0) / 7) * (-6.7637-(11.828)));
            zz = 3.2051 + (((tickAnim - 0) / 7) * (-1.81312-(3.2051)));
        }
        else if (tickAnim >= 7 && tickAnim < 16) {
            xx = 10.05129 + (((tickAnim - 7) / 9) * (15.0635-(10.05129)));
            yy = -6.7637 + (((tickAnim - 7) / 9) * (14.6732-(-6.7637)));
            zz = -1.81312 + (((tickAnim - 7) / 9) * (12.04292-(-1.81312)));
        }
        else if (tickAnim >= 16 && tickAnim < 25) {
            xx = 15.0635 + (((tickAnim - 16) / 9) * (10.27609-(15.0635)));
            yy = 14.6732 + (((tickAnim - 16) / 9) * (11.828-(14.6732)));
            zz = 12.04292 + (((tickAnim - 16) / 9) * (3.2051-(12.04292)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(xx), tail2.rotateAngleY + (float) Math.toRadians(yy), tail2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 16) {
            xx = 0 + (((tickAnim - 0) / 16) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 16) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 16) * (-0.7-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 16) / 9) * (0-(0)));
            yy = 0 + (((tickAnim - 16) / 9) * (0-(0)));
            zz = -0.7 + (((tickAnim - 16) / 9) * (0-(-0.7)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.tail2.rotationPointX = this.tail2.rotationPointX + (float)(xx);
        this.tail2.rotationPointY = this.tail2.rotationPointY - (float)(yy);
        this.tail2.rotationPointZ = this.tail2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 3.6122 + (((tickAnim - 0) / 7) * (3.55609-(3.6122)));
            yy = 7.6738 + (((tickAnim - 0) / 7) * (-3.71268-(7.6738)));
            zz = 1.091 + (((tickAnim - 0) / 7) * (-0.52452-(1.091)));
        }
        else if (tickAnim >= 7 && tickAnim < 11) {
            xx = 3.55609 + (((tickAnim - 7) / 4) * (3.67214-(3.55609)));
            yy = -3.71268 + (((tickAnim - 7) / 4) * (5.78231-(-3.71268)));
            zz = -0.52452 + (((tickAnim - 7) / 4) * (0.83761-(-0.52452)));
        }
        else if (tickAnim >= 11 && tickAnim < 16) {
            xx = 3.67214 + (((tickAnim - 11) / 5) * (14.58543-(3.67214)));
            yy = 5.78231 + (((tickAnim - 11) / 5) * (38.36731-(5.78231)));
            zz = 0.83761 + (((tickAnim - 11) / 5) * (6.97748-(0.83761)));
        }
        else if (tickAnim >= 16 && tickAnim < 25) {
            xx = 14.58543 + (((tickAnim - 16) / 9) * (3.6122-(14.58543)));
            yy = 38.36731 + (((tickAnim - 16) / 9) * (7.6738-(38.36731)));
            zz = 6.97748 + (((tickAnim - 16) / 9) * (1.091-(6.97748)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(xx), tail3.rotateAngleY + (float) Math.toRadians(yy), tail3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 16) {
            xx = 0 + (((tickAnim - 0) / 16) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 16) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 16) * (-0.475-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 16) / 9) * (0-(0)));
            yy = 0 + (((tickAnim - 16) / 9) * (0-(0)));
            zz = -0.475 + (((tickAnim - 16) / 9) * (0-(-0.475)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.tail3.rotationPointX = this.tail3.rotationPointX + (float)(xx);
        this.tail3.rotationPointY = this.tail3.rotationPointY - (float)(yy);
        this.tail3.rotationPointZ = this.tail3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 4 + (((tickAnim - 0) / 2) * (4.18888-(4)));
            yy = 0 + (((tickAnim - 0) / 2) * (7.62386-(0)));
            zz = 0 + (((tickAnim - 0) / 2) * (1.84373-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 7) {
            xx = 4.18888 + (((tickAnim - 2) / 5) * (4.27804-(4.18888)));
            yy = 7.62386 + (((tickAnim - 2) / 5) * (-11.42091-(7.62386)));
            zz = 1.84373 + (((tickAnim - 2) / 5) * (-2.77991-(1.84373)));
        }
        else if (tickAnim >= 7 && tickAnim < 11) {
            xx = 4.27804 + (((tickAnim - 7) / 4) * (4.46645-(4.27804)));
            yy = -11.42091 + (((tickAnim - 7) / 4) * (-11.1025-(-11.42091)));
            zz = -2.77991 + (((tickAnim - 7) / 4) * (-2.74715-(-2.77991)));
        }
        else if (tickAnim >= 11 && tickAnim < 16) {
            xx = 4.46645 + (((tickAnim - 11) / 5) * (-1.23599-(4.46645)));
            yy = -11.1025 + (((tickAnim - 11) / 5) * (32.12352-(-11.1025)));
            zz = -2.74715 + (((tickAnim - 11) / 5) * (-2.52806-(-2.74715)));
        }
        else if (tickAnim >= 16 && tickAnim < 25) {
            xx = -1.23599 + (((tickAnim - 16) / 9) * (4-(-1.23599)));
            yy = 32.12352 + (((tickAnim - 16) / 9) * (0-(32.12352)));
            zz = -2.52806 + (((tickAnim - 16) / 9) * (0-(-2.52806)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(xx), tail4.rotateAngleY + (float) Math.toRadians(yy), tail4.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 16) {
            xx = 0 + (((tickAnim - 0) / 16) * (-0.375-(0)));
            yy = 0 + (((tickAnim - 0) / 16) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 16) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 25) {
            xx = -0.375 + (((tickAnim - 16) / 9) * (0-(-0.375)));
            yy = 0 + (((tickAnim - 16) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 16) / 9) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.tail4.rotationPointX = this.tail4.rotationPointX + (float)(xx);
        this.tail4.rotationPointY = this.tail4.rotationPointY - (float)(yy);
        this.tail4.rotationPointZ = this.tail4.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 4 + (((tickAnim - 0) / 2) * (4.48287-(4)));
            yy = 0 + (((tickAnim - 0) / 2) * (16.22514-(0)));
            zz = 0 + (((tickAnim - 0) / 2) * (2.65577-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 7) {
            xx = 4.48287 + (((tickAnim - 2) / 5) * (4.4291-(4.48287)));
            yy = 16.22514 + (((tickAnim - 2) / 5) * (-17.27772-(16.22514)));
            zz = 2.65577 + (((tickAnim - 2) / 5) * (-2.82375-(2.65577)));
        }
        else if (tickAnim >= 7 && tickAnim < 11) {
            xx = 4.4291 + (((tickAnim - 7) / 4) * (5.06268-(4.4291)));
            yy = -17.27772 + (((tickAnim - 7) / 4) * (-23.24493-(-17.27772)));
            zz = -2.82375 + (((tickAnim - 7) / 4) * (-4.02267-(-2.82375)));
        }
        else if (tickAnim >= 11 && tickAnim < 13) {
            xx = 5.06268 + (((tickAnim - 11) / 2) * (5.81088-(5.06268)));
            yy = -23.24493 + (((tickAnim - 11) / 2) * (-23.27634-(-23.24493)));
            zz = -4.02267 + (((tickAnim - 11) / 2) * (-4.37813-(-4.02267)));
        }
        else if (tickAnim >= 13 && tickAnim < 16) {
            xx = 5.81088 + (((tickAnim - 13) / 3) * (4.78072-(5.81088)));
            yy = -23.27634 + (((tickAnim - 13) / 3) * (22.94728-(-23.27634)));
            zz = -4.37813 + (((tickAnim - 13) / 3) * (3.84504-(-4.37813)));
        }
        else if (tickAnim >= 16 && tickAnim < 25) {
            xx = 4.78072 + (((tickAnim - 16) / 9) * (4-(4.78072)));
            yy = 22.94728 + (((tickAnim - 16) / 9) * (0-(22.94728)));
            zz = 3.84504 + (((tickAnim - 16) / 9) * (0-(3.84504)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail5, tail5.rotateAngleX + (float) Math.toRadians(xx), tail5.rotateAngleY + (float) Math.toRadians(yy), tail5.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (-3-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 16) {
            xx = 0 + (((tickAnim - 7) / 9) * (0-(0)));
            yy = -3 + (((tickAnim - 7) / 9) * (-16.25-(-3)));
            zz = 0 + (((tickAnim - 7) / 9) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 16) / 9) * (0-(0)));
            yy = -16.25 + (((tickAnim - 16) / 9) * (0-(-16.25)));
            zz = 0 + (((tickAnim - 16) / 9) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(xx), body.rotateAngleY + (float) Math.toRadians(yy), body.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0.575-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 16) {
            xx = 0 + (((tickAnim - 7) / 9) * (0-(0)));
            yy = 0 + (((tickAnim - 7) / 9) * (0-(0)));
            zz = 0.575 + (((tickAnim - 7) / 9) * (0.8-(0.575)));
        }
        else if (tickAnim >= 16 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 16) / 9) * (0-(0)));
            yy = 0 + (((tickAnim - 16) / 9) * (0-(0)));
            zz = 0.8 + (((tickAnim - 16) / 9) * (0-(0.8)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.body.rotationPointX = this.body.rotationPointX + (float)(xx);
        this.body.rotationPointY = this.body.rotationPointY - (float)(yy);
        this.body.rotationPointZ = this.body.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (6.75-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 16) {
            xx = 0 + (((tickAnim - 7) / 9) * (0-(0)));
            yy = 6.75 + (((tickAnim - 7) / 9) * (-7.25-(6.75)));
            zz = 0 + (((tickAnim - 7) / 9) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 16) / 9) * (0-(0)));
            yy = -7.25 + (((tickAnim - 16) / 9) * (0-(-7.25)));
            zz = 0 + (((tickAnim - 16) / 9) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body2, body2.rotateAngleX + (float) Math.toRadians(xx), body2.rotateAngleY + (float) Math.toRadians(yy), body2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0.7-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 16) {
            xx = 0 + (((tickAnim - 7) / 9) * (0-(0)));
            yy = 0 + (((tickAnim - 7) / 9) * (0-(0)));
            zz = 0.7 + (((tickAnim - 7) / 9) * (0.325-(0.7)));
        }
        else if (tickAnim >= 16 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 16) / 9) * (0-(0)));
            yy = 0 + (((tickAnim - 16) / 9) * (0-(0)));
            zz = 0.325 + (((tickAnim - 16) / 9) * (0-(0.325)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.body2.rotationPointX = this.body2.rotationPointX + (float)(xx);
        this.body2.rotationPointY = this.body2.rotationPointY - (float)(yy);
        this.body2.rotationPointZ = this.body2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 9.5 + (((tickAnim - 0) / 7) * (23.34894-(9.5)));
            yy = 0 + (((tickAnim - 0) / 7) * (6.95358-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0.70128-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 16) {
            xx = 23.34894 + (((tickAnim - 7) / 9) * (5.95426-(23.34894)));
            yy = 6.95358 + (((tickAnim - 7) / 9) * (6.07676-(6.95358)));
            zz = 0.70128 + (((tickAnim - 7) / 9) * (-14.16866-(0.70128)));
        }
        else if (tickAnim >= 16 && tickAnim < 25) {
            xx = 5.95426 + (((tickAnim - 16) / 9) * (9.5-(5.95426)));
            yy = 6.07676 + (((tickAnim - 16) / 9) * (0-(6.07676)));
            zz = -14.16866 + (((tickAnim - 16) / 9) * (0-(-14.16866)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm, leftArm.rotateAngleX + (float) Math.toRadians(xx), leftArm.rotateAngleY + (float) Math.toRadians(yy), leftArm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = -27 + (((tickAnim - 0) / 8) * (-1.72796-(-27)));
            yy = 0 + (((tickAnim - 0) / 8) * (-5.39863-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (4.99054-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 16) {
            xx = -1.72796 + (((tickAnim - 8) / 8) * (15.36869-(-1.72796)));
            yy = -5.39863 + (((tickAnim - 8) / 8) * (-2.82785-(-5.39863)));
            zz = 4.99054 + (((tickAnim - 8) / 8) * (2.61409-(4.99054)));
        }
        else if (tickAnim >= 16 && tickAnim < 21) {
            xx = 15.36869 + (((tickAnim - 16) / 5) * (-64.44605-(15.36869)));
            yy = -2.82785 + (((tickAnim - 16) / 5) * (-1.28539-(-2.82785)));
            zz = 2.61409 + (((tickAnim - 16) / 5) * (1.18822-(2.61409)));
        }
        else if (tickAnim >= 21 && tickAnim < 25) {
            xx = -64.44605 + (((tickAnim - 21) / 4) * (-27-(-64.44605)));
            yy = -1.28539 + (((tickAnim - 21) / 4) * (0-(-1.28539)));
            zz = 1.18822 + (((tickAnim - 21) / 4) * (0-(1.18822)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm2, leftArm2.rotateAngleX + (float) Math.toRadians(xx), leftArm2.rotateAngleY + (float) Math.toRadians(yy), leftArm2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 17.66804 + (((tickAnim - 0) / 8) * (-20.88034-(17.66804)));
            yy = 2.48452 + (((tickAnim - 0) / 8) * (-1.33292-(2.48452)));
            zz = -5.18281 + (((tickAnim - 0) / 8) * (1.54255-(-5.18281)));
        }
        else if (tickAnim >= 8 && tickAnim < 16) {
            xx = -20.88034 + (((tickAnim - 8) / 8) * (-28.69268-(-20.88034)));
            yy = -1.33292 + (((tickAnim - 8) / 8) * (-11.92234-(-1.33292)));
            zz = 1.54255 + (((tickAnim - 8) / 8) * (28.79334-(1.54255)));
        }
        else if (tickAnim >= 16 && tickAnim < 21) {
            xx = -28.69268 + (((tickAnim - 16) / 5) * (73.06443-(-28.69268)));
            yy = -11.92234 + (((tickAnim - 16) / 5) * (19.37774-(-11.92234)));
            zz = 28.79334 + (((tickAnim - 16) / 5) * (4.28651-(28.79334)));
        }
        else if (tickAnim >= 21 && tickAnim < 25) {
            xx = 73.06443 + (((tickAnim - 21) / 4) * (17.66804-(73.06443)));
            yy = 19.37774 + (((tickAnim - 21) / 4) * (2.48452-(19.37774)));
            zz = 4.28651 + (((tickAnim - 21) / 4) * (-5.18281-(4.28651)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm3, leftArm3.rotateAngleX + (float) Math.toRadians(xx), leftArm3.rotateAngleY + (float) Math.toRadians(yy), leftArm3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 16) {
            xx = 0 + (((tickAnim - 0) / 16) * (0-(0)));
            yy = 1.1 + (((tickAnim - 0) / 16) * (0.5-(1.1)));
            zz = 0 + (((tickAnim - 0) / 16) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 16) / 9) * (0-(0)));
            yy = 0.5 + (((tickAnim - 16) / 9) * (1.1-(0.5)));
            zz = 0 + (((tickAnim - 16) / 9) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftArm3.rotationPointX = this.leftArm3.rotationPointX + (float)(xx);
        this.leftArm3.rotationPointY = this.leftArm3.rotationPointY - (float)(yy);
        this.leftArm3.rotationPointZ = this.leftArm3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 10.73257 + (((tickAnim - 0) / 7) * (10.66661-(10.73257)));
            yy = 1.96004 + (((tickAnim - 0) / 7) * (0.15592-(1.96004)));
            zz = -9.39344 + (((tickAnim - 0) / 7) * (-12.96423-(-9.39344)));
        }
        else if (tickAnim >= 7 && tickAnim < 11) {
            xx = 10.66661 + (((tickAnim - 7) / 4) * (21.34835-(10.66661)));
            yy = 0.15592 + (((tickAnim - 7) / 4) * (-11.20289-(0.15592)));
            zz = -12.96423 + (((tickAnim - 7) / 4) * (-4.76041-(-12.96423)));
        }
        else if (tickAnim >= 11 && tickAnim < 16) {
            xx = 21.34835 + (((tickAnim - 11) / 5) * (7.76643-(21.34835)));
            yy = -11.20289 + (((tickAnim - 11) / 5) * (-24.83345-(-11.20289)));
            zz = -4.76041 + (((tickAnim - 11) / 5) * (5.08418-(-4.76041)));
        }
        else if (tickAnim >= 16 && tickAnim < 25) {
            xx = 7.76643 + (((tickAnim - 16) / 9) * (10.73257-(7.76643)));
            yy = -24.83345 + (((tickAnim - 16) / 9) * (1.96004-(-24.83345)));
            zz = 5.08418 + (((tickAnim - 16) / 9) * (-9.39344-(5.08418)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm, rightArm.rotateAngleX + (float) Math.toRadians(xx), rightArm.rotateAngleY + (float) Math.toRadians(yy), rightArm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = -22.76049 + (((tickAnim - 0) / 7) * (-22.78049-(-22.76049)));
            yy = -4.99423 + (((tickAnim - 0) / 7) * (-8.49014-(-4.99423)));
            zz = 0.2405 + (((tickAnim - 0) / 7) * (0.41083-(0.2405)));
        }
        else if (tickAnim >= 7 && tickAnim < 11) {
            xx = -22.78049 + (((tickAnim - 7) / 4) * (-64.57328-(-22.78049)));
            yy = -8.49014 + (((tickAnim - 7) / 4) * (-6.64722-(-8.49014)));
            zz = 0.41083 + (((tickAnim - 7) / 4) * (1.79365-(0.41083)));
        }
        else if (tickAnim >= 11 && tickAnim < 16) {
            xx = -64.57328 + (((tickAnim - 11) / 5) * (-30.02463-(-64.57328)));
            yy = -6.64722 + (((tickAnim - 11) / 5) * (-4.43573-(-6.64722)));
            zz = 1.79365 + (((tickAnim - 11) / 5) * (3.45304-(1.79365)));
        }
        else if (tickAnim >= 16 && tickAnim < 25) {
            xx = -30.02463 + (((tickAnim - 16) / 9) * (-22.76049-(-30.02463)));
            yy = -4.43573 + (((tickAnim - 16) / 9) * (-4.99423-(-4.43573)));
            zz = 3.45304 + (((tickAnim - 16) / 9) * (0.2405-(3.45304)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm2, rightArm2.rotateAngleX + (float) Math.toRadians(xx), rightArm2.rotateAngleY + (float) Math.toRadians(yy), rightArm2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 10.29393 + (((tickAnim - 0) / 7) * (18.20659-(10.29393)));
            yy = -4.27613 + (((tickAnim - 0) / 7) * (-7.729-(-4.27613)));
            zz = 13.12564 + (((tickAnim - 0) / 7) * (19.98876-(13.12564)));
        }
        else if (tickAnim >= 7 && tickAnim < 11) {
            xx = 18.20659 + (((tickAnim - 7) / 4) * (65.31941-(18.20659)));
            yy = -7.729 + (((tickAnim - 7) / 4) * (-2.33243-(-7.729)));
            zz = 19.98876 + (((tickAnim - 7) / 4) * (7.15944-(19.98876)));
        }
        else if (tickAnim >= 11 && tickAnim < 16) {
            xx = 65.31941 + (((tickAnim - 11) / 5) * (24.51511-(65.31941)));
            yy = -2.33243 + (((tickAnim - 11) / 5) * (-10.1132-(-2.33243)));
            zz = 7.15944 + (((tickAnim - 11) / 5) * (16.37105-(7.15944)));
        }
        else if (tickAnim >= 16 && tickAnim < 25) {
            xx = 24.51511 + (((tickAnim - 16) / 9) * (10.29393-(24.51511)));
            yy = -10.1132 + (((tickAnim - 16) / 9) * (-4.27613-(-10.1132)));
            zz = 16.37105 + (((tickAnim - 16) / 9) * (13.12564-(16.37105)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm3, rightArm3.rotateAngleX + (float) Math.toRadians(xx), rightArm3.rotateAngleY + (float) Math.toRadians(yy), rightArm3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0.45 + (((tickAnim - 0) / 7) * (0.45-(0.45)));
            yy = 0.95 + (((tickAnim - 0) / 7) * (0.95-(0.95)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 11) {
            xx = 0.45 + (((tickAnim - 7) / 4) * (0-(0.45)));
            yy = 0.95 + (((tickAnim - 7) / 4) * (0.33-(0.95)));
            zz = 0 + (((tickAnim - 7) / 4) * (-0.575-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 16) {
            xx = 0 + (((tickAnim - 11) / 5) * (0-(0)));
            yy = 0.33 + (((tickAnim - 11) / 5) * (1.45-(0.33)));
            zz = -0.575 + (((tickAnim - 11) / 5) * (-0.35-(-0.575)));
        }
        else if (tickAnim >= 16 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 16) / 9) * (0.45-(0)));
            yy = 1.45 + (((tickAnim - 16) / 9) * (0.95-(1.45)));
            zz = -0.35 + (((tickAnim - 16) / 9) * (0-(-0.35)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightArm3.rotationPointX = this.rightArm3.rotationPointX + (float)(xx);
        this.rightArm3.rotationPointY = this.rightArm3.rotationPointY - (float)(yy);
        this.rightArm3.rotationPointZ = this.rightArm3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0.03094 + (((tickAnim - 0) / 7) * (0.16644-(0.03094)));
            yy = -3.2006 + (((tickAnim - 0) / 7) * (-9.84626-(-3.2006)));
            zz = -0.566 + (((tickAnim - 0) / 7) * (-1.75662-(-0.566)));
        }
        else if (tickAnim >= 7 && tickAnim < 16) {
            xx = 0.16644 + (((tickAnim - 7) / 9) * (0.14436-(0.16644)));
            yy = -9.84626 + (((tickAnim - 7) / 9) * (-9.10801-(-9.84626)));
            zz = -1.75662 + (((tickAnim - 7) / 9) * (-1.62255-(-1.75662)));
        }
        else if (tickAnim >= 16 && tickAnim < 25) {
            xx = 0.14436 + (((tickAnim - 16) / 9) * (0.03094-(0.14436)));
            yy = -9.10801 + (((tickAnim - 16) / 9) * (-3.2006-(-9.10801)));
            zz = -1.62255 + (((tickAnim - 16) / 9) * (-0.566-(-1.62255)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(xx), neck.rotateAngleY + (float) Math.toRadians(yy), neck.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 25) {
            xx = 0.01678 + (((tickAnim - 0) / 25) * (0.01678-(0.01678)));
            yy = -6.1977 + (((tickAnim - 0) / 25) * (-6.1977-(-6.1977)));
            zz = -0.4357 + (((tickAnim - 0) / 25) * (-0.4357-(-0.4357)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(xx), neck2.rotateAngleY + (float) Math.toRadians(yy), neck2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 25) {
            xx = 0.18141 + (((tickAnim - 0) / 25) * (0.18141-(0.18141)));
            yy = -9.0615 + (((tickAnim - 0) / 25) * (-9.0615-(-9.0615)));
            zz = -2.4547 + (((tickAnim - 0) / 25) * (-2.4547-(-2.4547)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));


    }
    public void animNest(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraSpicomellus entity = (EntityPrehistoricFloraSpicomellus) entitylivingbaseIn;
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
        this.setRotateAngle(leftLeg, leftLeg.rotateAngleX + (float) Math.toRadians(xx), leftLeg.rotateAngleY + (float) Math.toRadians(yy), leftLeg.rotateAngleZ + (float) Math.toRadians(zz));




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
    public void animLay(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraSpicomellus entity = (EntityPrehistoricFloraSpicomellus) entitylivingbaseIn;
        int animCycle = 50;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (-7.25-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = -7.25 + (((tickAnim - 20) / 10) * (-7.25-(-7.25)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = -7.25 + (((tickAnim - 30) / 20) * (0-(-7.25)));
            yy = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(main, main.rotateAngleX + (float) Math.toRadians(xx), main.rotateAngleY + (float) Math.toRadians(yy), main.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (-4.925-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (2.05-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            yy = -4.925 + (((tickAnim - 20) / 10) * (-4.925-(-4.925)));
            zz = 2.05 + (((tickAnim - 20) / 10) * (2.05-(2.05)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            yy = -4.925 + (((tickAnim - 30) / 20) * (0-(-4.925)));
            zz = 2.05 + (((tickAnim - 30) / 20) * (0-(2.05)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.main.rotationPointX = this.main.rotationPointX + (float)(xx);
        this.main.rotationPointY = this.main.rotationPointY - (float)(yy);
        this.main.rotationPointZ = this.main.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (-13.75-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = -13.75 + (((tickAnim - 20) / 10) * (-13.75-(-13.75)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = -13.75 + (((tickAnim - 30) / 20) * (0-(-13.75)));
            yy = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg, leftLeg.rotateAngleX + (float) Math.toRadians(xx), leftLeg.rotateAngleY + (float) Math.toRadians(yy), leftLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (56-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 56 + (((tickAnim - 20) / 10) * (56-(56)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 56 + (((tickAnim - 30) / 20) * (0-(56)));
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
            xx = 0 + (((tickAnim - 0) / 20) * (-24.75-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = -24.75 + (((tickAnim - 20) / 10) * (-24.75-(-24.75)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = -24.75 + (((tickAnim - 30) / 20) * (0-(-24.75)));
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
            xx = 0 + (((tickAnim - 0) / 20) * (-9.25-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = -9.25 + (((tickAnim - 20) / 10) * (-9.25-(-9.25)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = -9.25 + (((tickAnim - 30) / 20) * (0-(-9.25)));
            yy = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg4, leftLeg4.rotateAngleX + (float) Math.toRadians(xx), leftLeg4.rotateAngleY + (float) Math.toRadians(yy), leftLeg4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (-13.75-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = -13.75 + (((tickAnim - 20) / 10) * (-13.75-(-13.75)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = -13.75 + (((tickAnim - 30) / 20) * (0-(-13.75)));
            yy = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg, rightLeg.rotateAngleX + (float) Math.toRadians(xx), rightLeg.rotateAngleY + (float) Math.toRadians(yy), rightLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (56-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 56 + (((tickAnim - 20) / 10) * (56-(56)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 56 + (((tickAnim - 30) / 20) * (0-(56)));
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
            xx = 0 + (((tickAnim - 0) / 20) * (-24.75-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = -24.75 + (((tickAnim - 20) / 10) * (-24.75-(-24.75)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = -24.75 + (((tickAnim - 30) / 20) * (0-(-24.75)));
            yy = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg3, rightLeg3.rotateAngleX + (float) Math.toRadians(xx), rightLeg3.rotateAngleY + (float) Math.toRadians(yy), rightLeg3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (-9.25-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = -9.25 + (((tickAnim - 20) / 10) * (-9.25-(-9.25)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = -9.25 + (((tickAnim - 30) / 20) * (0-(-9.25)));
            yy = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg4, rightLeg4.rotateAngleX + (float) Math.toRadians(xx), rightLeg4.rotateAngleY + (float) Math.toRadians(yy), rightLeg4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (-2.75-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = -2.75 + (((tickAnim - 20) / 10) * (-2.75-(-2.75)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = -2.75 + (((tickAnim - 30) / 20) * (0-(-2.75)));
            yy = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail, tail.rotateAngleX + (float) Math.toRadians(xx), tail.rotateAngleY + (float) Math.toRadians(yy), tail.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (-9.71-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 20) {
            xx = -9.71 + (((tickAnim - 8) / 12) * (-12.5-(-9.71)));
            yy = 0 + (((tickAnim - 8) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 12) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = -12.5 + (((tickAnim - 20) / 10) * (-12.5-(-12.5)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 37) {
            xx = -12.5 + (((tickAnim - 30) / 7) * (-9.33-(-12.5)));
            yy = 0 + (((tickAnim - 30) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 7) * (0-(0)));
        }
        else if (tickAnim >= 37 && tickAnim < 50) {
            xx = -9.33 + (((tickAnim - 37) / 13) * (0-(-9.33)));
            yy = 0 + (((tickAnim - 37) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 37) / 13) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(xx), tail2.rotateAngleY + (float) Math.toRadians(yy), tail2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (-5.56-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 20) {
            xx = -5.56 + (((tickAnim - 8) / 12) * (4-(-5.56)));
            yy = 0 + (((tickAnim - 8) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 12) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 4 + (((tickAnim - 20) / 10) * (4-(4)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 37) {
            xx = 4 + (((tickAnim - 30) / 7) * (-3.46-(4)));
            yy = 0 + (((tickAnim - 30) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 7) * (0-(0)));
        }
        else if (tickAnim >= 37 && tickAnim < 42) {
            xx = -3.46 + (((tickAnim - 37) / 5) * (-6.56-(-3.46)));
            yy = 0 + (((tickAnim - 37) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 37) / 5) * (0-(0)));
        }
        else if (tickAnim >= 42 && tickAnim < 50) {
            xx = -6.56 + (((tickAnim - 42) / 8) * (0-(-6.56)));
            yy = 0 + (((tickAnim - 42) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 42) / 8) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(xx), tail3.rotateAngleY + (float) Math.toRadians(yy), tail3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (-3.5-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 20) {
            xx = -3.5 + (((tickAnim - 8) / 12) * (4-(-3.5)));
            yy = 0 + (((tickAnim - 8) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 12) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 4 + (((tickAnim - 20) / 10) * (4-(4)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 37) {
            xx = 4 + (((tickAnim - 30) / 7) * (-5.08-(4)));
            yy = 0 + (((tickAnim - 30) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 7) * (0-(0)));
        }
        else if (tickAnim >= 37 && tickAnim < 42) {
            xx = -5.08 + (((tickAnim - 37) / 5) * (-8.92-(-5.08)));
            yy = 0 + (((tickAnim - 37) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 37) / 5) * (0-(0)));
        }
        else if (tickAnim >= 42 && tickAnim < 50) {
            xx = -8.92 + (((tickAnim - 42) / 8) * (0-(-8.92)));
            yy = 0 + (((tickAnim - 42) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 42) / 8) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(xx), tail4.rotateAngleY + (float) Math.toRadians(yy), tail4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 8) / 12) * (14-(0)));
            yy = 0 + (((tickAnim - 8) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 12) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 14 + (((tickAnim - 20) / 10) * (14-(14)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 37) {
            xx = 14 + (((tickAnim - 30) / 7) * (12.75-(14)));
            yy = 0 + (((tickAnim - 30) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 7) * (0-(0)));
        }
        else if (tickAnim >= 37 && tickAnim < 42) {
            xx = 12.75 + (((tickAnim - 37) / 5) * (0-(12.75)));
            yy = 0 + (((tickAnim - 37) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 37) / 5) * (0-(0)));
        }
        else if (tickAnim >= 42 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 42) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 42) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 42) / 8) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail5, tail5.rotateAngleX + (float) Math.toRadians(xx), tail5.rotateAngleY + (float) Math.toRadians(yy), tail5.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (15.5-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 15.5 + (((tickAnim - 20) / 10) * (15.5-(15.5)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 15.5 + (((tickAnim - 30) / 20) * (0-(15.5)));
            yy = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm, leftArm.rotateAngleX + (float) Math.toRadians(xx), leftArm.rotateAngleY + (float) Math.toRadians(yy), leftArm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (-27.25-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = -27.25 + (((tickAnim - 20) / 10) * (-27.25-(-27.25)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = -27.25 + (((tickAnim - 30) / 20) * (0-(-27.25)));
            yy = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm2, leftArm2.rotateAngleX + (float) Math.toRadians(xx), leftArm2.rotateAngleY + (float) Math.toRadians(yy), leftArm2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (18.25-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 18.25 + (((tickAnim - 20) / 10) * (18.25-(18.25)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 18.25 + (((tickAnim - 30) / 20) * (0-(18.25)));
            yy = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm3, leftArm3.rotateAngleX + (float) Math.toRadians(xx), leftArm3.rotateAngleY + (float) Math.toRadians(yy), leftArm3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (15.5-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 15.5 + (((tickAnim - 20) / 10) * (15.5-(15.5)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 15.5 + (((tickAnim - 30) / 20) * (0-(15.5)));
            yy = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm, rightArm.rotateAngleX + (float) Math.toRadians(xx), rightArm.rotateAngleY + (float) Math.toRadians(yy), rightArm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (-27.25-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = -27.25 + (((tickAnim - 20) / 10) * (-27.25-(-27.25)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = -27.25 + (((tickAnim - 30) / 20) * (0-(-27.25)));
            yy = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm2, rightArm2.rotateAngleX + (float) Math.toRadians(xx), rightArm2.rotateAngleY + (float) Math.toRadians(yy), rightArm2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (18.25-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 18.25 + (((tickAnim - 20) / 10) * (18.25-(18.25)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 18.25 + (((tickAnim - 30) / 20) * (0-(18.25)));
            yy = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm3, rightArm3.rotateAngleX + (float) Math.toRadians(xx), rightArm3.rotateAngleY + (float) Math.toRadians(yy), rightArm3.rotateAngleZ + (float) Math.toRadians(zz));


    }
    public void animRoar(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraSpicomellus entity = (EntityPrehistoricFloraSpicomellus) entitylivingbaseIn;
        int animCycle = 40;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;


        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(-1.1-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-100))*2), neck2.rotateAngleY + (float) Math.toRadians(0), neck2.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.5-80))*0.7));


        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(0.15-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-180))*5), head.rotateAngleY + (float) Math.toRadians(0), head.rotateAngleZ + (float) Math.toRadians(0));
        this.head.rotationPointX = this.head.rotationPointX + (float)(0);
        this.head.rotationPointY = this.head.rotationPointY - (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.2))*0.01);
        this.head.rotationPointZ = this.head.rotationPointZ + (float)(0);


        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(7.975-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-250))*8), jaw.rotateAngleY + (float) Math.toRadians(0), jaw.rotateAngleZ + (float) Math.toRadians(0));
        this.jaw.rotationPointX = this.jaw.rotationPointX + (float)(0);
        this.jaw.rotationPointY = this.jaw.rotationPointY - (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.2-50))*0.015);
        this.jaw.rotationPointZ = this.jaw.rotationPointZ + (float)(0);
        
    }
    public void animWalking(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraSpicomellus entity = (EntityPrehistoricFloraSpicomellus) entitylivingbaseIn;
        int animCycle = 60;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        this.setRotateAngle(main, main.rotateAngleX + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*120/0.5))*0.7), main.rotateAngleY + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*120))*2), main.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*120-50))*1));
        this.main.rotationPointX = this.main.rotationPointX + (float)(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*120))*0.3);
        this.main.rotationPointY = this.main.rotationPointY - (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*120/0.5+30))*0.2);
        this.main.rotationPointZ = this.main.rotationPointZ + (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*120/0.5-70))*0.3);



        if (tickAnim >= 0 && tickAnim < 16) {
            xx = 2 + (((tickAnim - 0) / 16) * (20.5-(2)));
            yy = 0 + (((tickAnim - 0) / 16) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 16) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 25) {
            xx = 20.5 + (((tickAnim - 16) / 9) * (122.495-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*150-(20.5)));
            yy = 0 + (((tickAnim - 16) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 16) / 9) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 34) {
            xx = 122.495-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*150 + (((tickAnim - 25) / 9) * (-22.75-(122.495-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*150)));
            yy = 0 + (((tickAnim - 25) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 9) * (0-(0)));
        }
        else if (tickAnim >= 34 && tickAnim < 60) {
            xx = -22.75 + (((tickAnim - 34) / 26) * (2-(-22.75)));
            yy = 0 + (((tickAnim - 34) / 26) * (0-(0)));
            zz = 0 + (((tickAnim - 34) / 26) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg, leftLeg.rotateAngleX + (float) Math.toRadians(xx), leftLeg.rotateAngleY + (float) Math.toRadians(yy), leftLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 16) {
            xx = 5.75 + (((tickAnim - 0) / 16) * (13.5-(5.75)));
            yy = 0 + (((tickAnim - 0) / 16) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 16) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 25) {
            xx = 13.5 + (((tickAnim - 16) / 9) * (174-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*150-(13.5)));
            yy = 0 + (((tickAnim - 16) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 16) / 9) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 34) {
            xx = 174-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*150 + (((tickAnim - 25) / 9) * (0-(174-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*150)));
            yy = 0 + (((tickAnim - 25) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 9) * (0-(0)));
        }
        else if (tickAnim >= 34 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 34) / 26) * (5.75-(0)));
            yy = 0 + (((tickAnim - 34) / 26) * (0-(0)));
            zz = 0 + (((tickAnim - 34) / 26) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg2, leftLeg2.rotateAngleX + (float) Math.toRadians(xx), leftLeg2.rotateAngleY + (float) Math.toRadians(yy), leftLeg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 16) {
            xx = 12 + (((tickAnim - 0) / 16) * (14.25-(12)));
            yy = 0 + (((tickAnim - 0) / 16) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 16) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 25) {
            xx = 14.25 + (((tickAnim - 16) / 9) * (-43.13-(14.25)));
            yy = 0 + (((tickAnim - 16) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 16) / 9) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 30) {
            xx = -43.13 + (((tickAnim - 25) / 5) * (-554.255-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-550-(-43.13)));
            yy = 0 + (((tickAnim - 25) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 5) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 34) {
            xx = -554.255-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-550 + (((tickAnim - 30) / 4) * (16.25-(-554.255-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-550)));
            yy = 0 + (((tickAnim - 30) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 4) * (0-(0)));
        }
        else if (tickAnim >= 34 && tickAnim < 60) {
            xx = 16.25 + (((tickAnim - 34) / 26) * (12-(16.25)));
            yy = 0 + (((tickAnim - 34) / 26) * (0-(0)));
            zz = 0 + (((tickAnim - 34) / 26) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg3, leftLeg3.rotateAngleX + (float) Math.toRadians(xx), leftLeg3.rotateAngleY + (float) Math.toRadians(yy), leftLeg3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = -18.75 + (((tickAnim - 0) / 18) * (85.21-(-18.75)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 28) {
            xx = 85.21 + (((tickAnim - 18) / 10) * (87.12-(85.21)));
            yy = 0 + (((tickAnim - 18) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 10) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 32) {
            xx = 87.12 + (((tickAnim - 28) / 4) * (25.97-(87.12)));
            yy = 0 + (((tickAnim - 28) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 4) * (0-(0)));
        }
        else if (tickAnim >= 32 && tickAnim < 34) {
            xx = 25.97 + (((tickAnim - 32) / 2) * (6.75-(25.97)));
            yy = 0 + (((tickAnim - 32) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 32) / 2) * (0-(0)));
        }
        else if (tickAnim >= 34 && tickAnim < 40) {
            xx = 6.75 + (((tickAnim - 34) / 6) * (-1.08-(6.75)));
            yy = 0 + (((tickAnim - 34) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 34) / 6) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 60) {
            xx = -1.08 + (((tickAnim - 40) / 20) * (-18.75-(-1.08)));
            yy = 0 + (((tickAnim - 40) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg4, leftLeg4.rotateAngleX + (float) Math.toRadians(xx), leftLeg4.rotateAngleY + (float) Math.toRadians(yy), leftLeg4.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 34) {
            xx = 0 + (((tickAnim - 0) / 34) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 34) * (-0.35-(0)));
            zz = 0 + (((tickAnim - 0) / 34) * (0-(0)));
        }
        else if (tickAnim >= 34 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 34) / 6) * (0-(0)));
            yy = -0.35 + (((tickAnim - 34) / 6) * (0-(-0.35)));
            zz = 0 + (((tickAnim - 34) / 6) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 40) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 40) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftLeg4.rotationPointX = this.leftLeg4.rotationPointX + (float)(xx);
        this.leftLeg4.rotationPointY = this.leftLeg4.rotationPointY - (float)(yy);
        this.leftLeg4.rotationPointZ = this.leftLeg4.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 42) {
            xx = -22.75 + (((tickAnim - 0) / 42) * (20.5-(-22.75)));
            yy = 0 + (((tickAnim - 0) / 42) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 42) * (0-(0)));
        }
        else if (tickAnim >= 42 && tickAnim < 52) {
            xx = 20.5 + (((tickAnim - 42) / 10) * (-74.03-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-100-(20.5)));
            yy = 0 + (((tickAnim - 42) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 42) / 10) * (0-(0)));
        }
        else if (tickAnim >= 52 && tickAnim < 60) {
            xx = -74.03-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-100 + (((tickAnim - 52) / 8) * (-22.75-(-74.03-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-100)));
            yy = 0 + (((tickAnim - 52) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 52) / 8) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg, rightLeg.rotateAngleX + (float) Math.toRadians(xx), rightLeg.rotateAngleY + (float) Math.toRadians(yy), rightLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 42) {
            xx = 0 + (((tickAnim - 0) / 42) * (13.5-(0)));
            yy = 0 + (((tickAnim - 0) / 42) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 42) * (0-(0)));
        }
        else if (tickAnim >= 42 && tickAnim < 51) {
            xx = 13.5 + (((tickAnim - 42) / 9) * (-45.975-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-100-(13.5)));
            yy = 0 + (((tickAnim - 42) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 42) / 9) * (0-(0)));
        }
        else if (tickAnim >= 51 && tickAnim < 60) {
            xx = -45.975-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-100 + (((tickAnim - 51) / 9) * (0-(-45.975-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-100)));
            yy = 0 + (((tickAnim - 51) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 51) / 9) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg2, rightLeg2.rotateAngleX + (float) Math.toRadians(xx), rightLeg2.rotateAngleY + (float) Math.toRadians(yy), rightLeg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 42) {
            xx = 16 + (((tickAnim - 0) / 42) * (14.25-(16)));
            yy = 0 + (((tickAnim - 0) / 42) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 42) * (0-(0)));
        }
        else if (tickAnim >= 42 && tickAnim < 51) {
            xx = 14.25 + (((tickAnim - 42) / 9) * (-43.13-(14.25)));
            yy = 0 + (((tickAnim - 42) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 42) / 9) * (0-(0)));
        }
        else if (tickAnim >= 51 && tickAnim < 56) {
            xx = -43.13 + (((tickAnim - 51) / 5) * (168.545-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*300-(-43.13)));
            yy = 0 + (((tickAnim - 51) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 51) / 5) * (0-(0)));
        }
        else if (tickAnim >= 56 && tickAnim < 60) {
            xx = 168.545-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*300 + (((tickAnim - 56) / 4) * (16-(168.545-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*300)));
            yy = 0 + (((tickAnim - 56) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 56) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg3, rightLeg3.rotateAngleX + (float) Math.toRadians(xx), rightLeg3.rotateAngleY + (float) Math.toRadians(yy), rightLeg3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 7 + (((tickAnim - 0) / 13) * (-10.75-(7)));
            yy = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 25) {
            xx = -10.75 + (((tickAnim - 13) / 12) * (-24.67-(-10.75)));
            yy = 0 + (((tickAnim - 13) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 12) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 29) {
            xx = -24.67 + (((tickAnim - 25) / 4) * (-17-(-24.67)));
            yy = 0 + (((tickAnim - 25) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 4) * (0-(0)));
        }
        else if (tickAnim >= 29 && tickAnim < 44) {
            xx = -17 + (((tickAnim - 29) / 15) * (85.21-(-17)));
            yy = 0 + (((tickAnim - 29) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 29) / 15) * (0-(0)));
        }
        else if (tickAnim >= 44 && tickAnim < 54) {
            xx = 85.21 + (((tickAnim - 44) / 10) * (78.87-(85.21)));
            yy = 0 + (((tickAnim - 44) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 44) / 10) * (0-(0)));
        }
        else if (tickAnim >= 54 && tickAnim < 58) {
            xx = 78.87 + (((tickAnim - 54) / 4) * (22.2-(78.87)));
            yy = 0 + (((tickAnim - 54) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 54) / 4) * (0-(0)));
        }
        else if (tickAnim >= 58 && tickAnim < 59) {
            xx = 22.2 + (((tickAnim - 58) / 1) * (7-(22.2)));
            yy = 0 + (((tickAnim - 58) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 58) / 1) * (0-(0)));
        }
        else if (tickAnim >= 59 && tickAnim < 60) {
            xx = 7 + (((tickAnim - 59) / 1) * (7-(7)));
            yy = 0 + (((tickAnim - 59) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 59) / 1) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg4, rightLeg4.rotateAngleX + (float) Math.toRadians(xx), rightLeg4.rotateAngleY + (float) Math.toRadians(yy), rightLeg4.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (0.275-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 29) {
            xx = 0 + (((tickAnim - 13) / 16) * (0-(0)));
            yy = 0.275 + (((tickAnim - 13) / 16) * (-0.575-(0.275)));
            zz = 0 + (((tickAnim - 13) / 16) * (0-(0)));
        }
        else if (tickAnim >= 29 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 29) / 31) * (0-(0)));
            yy = -0.575 + (((tickAnim - 29) / 31) * (0-(-0.575)));
            zz = 0 + (((tickAnim - 29) / 31) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightLeg4.rotationPointX = this.rightLeg4.rotationPointX + (float)(xx);
        this.rightLeg4.rotationPointY = this.rightLeg4.rotationPointY - (float)(yy);
        this.rightLeg4.rotationPointZ = this.rightLeg4.rotationPointZ + (float)(zz);



        this.setRotateAngle(tail, tail.rotateAngleX + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*120/0.5-50))*1), tail.rotateAngleY + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*120-50))*0.5), tail.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*120-50))*1));


        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*120/0.5-100))*0.5), tail2.rotateAngleY + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*120-80))*0.6), tail2.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*120-50))*1));


        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*120/0.5-150))*0.5), tail3.rotateAngleY + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*120-10))*1), tail3.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*120-50))*1));


        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*120/0.5-200))*0.5), tail4.rotateAngleY + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*120-150))*2), tail4.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*120-50))*1));


        this.setRotateAngle(tail5, tail5.rotateAngleX + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*120/0.5-250))*0.5), tail5.rotateAngleY + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*120-150))*3), tail5.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*120-50))*1));


        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*120/0.5-50))*-0.8), body.rotateAngleY + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*120-20))*-3), body.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*120-150))*1));


        this.setRotateAngle(body2, body2.rotateAngleX + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*120/0.5-50))*1), body2.rotateAngleY + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*120-60))*3), body2.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*120-150))*-1));



        if (tickAnim >= 0 && tickAnim < 33) {
            xx = -25.41 + (((tickAnim - 0) / 33) * (20.5-(-25.41)));
            yy = 0 + (((tickAnim - 0) / 33) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 33) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 53) {
            xx = 20.5 + (((tickAnim - 33) / 20) * (-36.5-(20.5)));
            yy = 0 + (((tickAnim - 33) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 20) * (0-(0)));
        }
        else if (tickAnim >= 53 && tickAnim < 55) {
            xx = -36.5 + (((tickAnim - 53) / 2) * (-33.41-(-36.5)));
            yy = 0 + (((tickAnim - 53) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 53) / 2) * (0-(0)));
        }
        else if (tickAnim >= 55 && tickAnim < 60) {
            xx = -33.41 + (((tickAnim - 55) / 5) * (-25.41-(-33.41)));
            yy = 0 + (((tickAnim - 55) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 55) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm, leftArm.rotateAngleX + (float) Math.toRadians(xx), leftArm.rotateAngleY + (float) Math.toRadians(yy), leftArm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 33) {
            xx = 8.25 + (((tickAnim - 0) / 33) * (0-(8.25)));
            yy = 0 + (((tickAnim - 0) / 33) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 33) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 43) {
            xx = 0 + (((tickAnim - 33) / 10) * (-70.95-Math.sin((Math.PI/180)*(((double)tickAnim/20)*150))*50-(0)));
            yy = 0 + (((tickAnim - 33) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 10) * (0-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 53) {
            xx = -70.95-Math.sin((Math.PI/180)*(((double)tickAnim/20)*150))*50 + (((tickAnim - 43) / 10) * (11-(-70.95-Math.sin((Math.PI/180)*(((double)tickAnim/20)*150))*50)));
            yy = 0 + (((tickAnim - 43) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 43) / 10) * (0-(0)));
        }
        else if (tickAnim >= 53 && tickAnim < 55) {
            xx = 11 + (((tickAnim - 53) / 2) * (10.5-(11)));
            yy = 0 + (((tickAnim - 53) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 53) / 2) * (0-(0)));
        }
        else if (tickAnim >= 55 && tickAnim < 60) {
            xx = 10.5 + (((tickAnim - 55) / 5) * (8.25-(10.5)));
            yy = 0 + (((tickAnim - 55) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 55) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm2, leftArm2.rotateAngleX + (float) Math.toRadians(xx), leftArm2.rotateAngleY + (float) Math.toRadians(yy), leftArm2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 0) / 33) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 33) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 33) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 43) {
            xx = 0 + (((tickAnim - 33) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 33) / 10) * (0.35-(0)));
            zz = 0 + (((tickAnim - 33) / 10) * (1.1-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 53) {
            xx = 0 + (((tickAnim - 43) / 10) * (0-(0)));
            yy = 0.35 + (((tickAnim - 43) / 10) * (0-(0.35)));
            zz = 1.1 + (((tickAnim - 43) / 10) * (0-(1.1)));
        }
        else if (tickAnim >= 53 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 53) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 53) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 53) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftArm2.rotationPointX = this.leftArm2.rotationPointX + (float)(xx);
        this.leftArm2.rotationPointY = this.leftArm2.rotationPointY - (float)(yy);
        this.leftArm2.rotationPointZ = this.leftArm2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 17) {
            xx = 20.00924 + (((tickAnim - 0) / 17) * (-0.25-(20.00924)));
            yy = 2.9231 + (((tickAnim - 0) / 17) * (0-(2.9231)));
            zz = -5.52759 + (((tickAnim - 0) / 17) * (0-(-5.52759)));
        }
        else if (tickAnim >= 17 && tickAnim < 33) {
            xx = -0.25 + (((tickAnim - 17) / 16) * (71.12198-(-0.25)));
            yy = 0 + (((tickAnim - 17) / 16) * (-0.90435-(0)));
            zz = 0 + (((tickAnim - 17) / 16) * (-7.09888-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 36) {
            xx = 71.12198 + (((tickAnim - 33) / 3) * (80.91508-(71.12198)));
            yy = -0.90435 + (((tickAnim - 33) / 3) * (-4.85097-(-0.90435)));
            zz = -7.09888 + (((tickAnim - 33) / 3) * (-4.96373-(-7.09888)));
        }
        else if (tickAnim >= 36 && tickAnim < 43) {
            xx = 80.91508 + (((tickAnim - 36) / 7) * (98.29437-(80.91508)));
            yy = -4.85097 + (((tickAnim - 36) / 7) * (16.69086-(-4.85097)));
            zz = -4.96373 + (((tickAnim - 36) / 7) * (-1.44171-(-4.96373)));
        }
        else if (tickAnim >= 43 && tickAnim < 53) {
            xx = 98.29437 + (((tickAnim - 43) / 10) * (26.22371-(98.29437)));
            yy = 16.69086 + (((tickAnim - 43) / 10) * (4.33195-(16.69086)));
            zz = -1.44171 + (((tickAnim - 43) / 10) * (-6.43381-(-1.44171)));
        }
        else if (tickAnim >= 53 && tickAnim < 55) {
            xx = 26.22371 + (((tickAnim - 53) / 2) * (24.71696-(26.22371)));
            yy = 4.33195 + (((tickAnim - 53) / 2) * (4.36926-(4.33195)));
            zz = -6.43381 + (((tickAnim - 53) / 2) * (-6.4062-(-6.43381)));
        }
        else if (tickAnim >= 55 && tickAnim < 60) {
            xx = 24.71696 + (((tickAnim - 55) / 5) * (20.00924-(24.71696)));
            yy = 4.36926 + (((tickAnim - 55) / 5) * (2.9231-(4.36926)));
            zz = -6.4062 + (((tickAnim - 55) / 5) * (-5.52759-(-6.4062)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm3, leftArm3.rotateAngleX + (float) Math.toRadians(xx), leftArm3.rotateAngleY + (float) Math.toRadians(yy), leftArm3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 17) {
            xx = 0 + (((tickAnim - 0) / 17) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 17) * (0.05-(0)));
            zz = 0 + (((tickAnim - 0) / 17) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 17) / 16) * (0-(0)));
            yy = 0.05 + (((tickAnim - 17) / 16) * (0.5-(0.05)));
            zz = 0 + (((tickAnim - 17) / 16) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 36) {
            xx = 0 + (((tickAnim - 33) / 3) * (0-(0)));
            yy = 0.5 + (((tickAnim - 33) / 3) * (0.93-(0.5)));
            zz = 0 + (((tickAnim - 33) / 3) * (-0.94-(0)));
        }
        else if (tickAnim >= 36 && tickAnim < 43) {
            xx = 0 + (((tickAnim - 36) / 7) * (0-(0)));
            yy = 0.93 + (((tickAnim - 36) / 7) * (0-(0.93)));
            zz = -0.94 + (((tickAnim - 36) / 7) * (-0.75-(-0.94)));
        }
        else if (tickAnim >= 43 && tickAnim < 53) {
            xx = 0 + (((tickAnim - 43) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 43) / 10) * (0.3-(0)));
            zz = -0.75 + (((tickAnim - 43) / 10) * (-0.075-(-0.75)));
        }
        else if (tickAnim >= 53 && tickAnim < 55) {
            xx = 0 + (((tickAnim - 53) / 2) * (0-(0)));
            yy = 0.3 + (((tickAnim - 53) / 2) * (0.325-(0.3)));
            zz = -0.075 + (((tickAnim - 53) / 2) * (0-(-0.075)));
        }
        else if (tickAnim >= 55 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 55) / 5) * (0-(0)));
            yy = 0.325 + (((tickAnim - 55) / 5) * (0-(0.325)));
            zz = 0 + (((tickAnim - 55) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftArm3.rotationPointX = this.leftArm3.rotationPointX + (float)(xx);
        this.leftArm3.rotationPointY = this.leftArm3.rotationPointY - (float)(yy);
        this.leftArm3.rotationPointZ = this.leftArm3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 20.5 + (((tickAnim - 0) / 3) * (13.07-(20.5)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 19) {
            xx = 13.07 + (((tickAnim - 3) / 16) * (-36.5-(13.07)));
            yy = 0 + (((tickAnim - 3) / 16) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 16) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 22) {
            xx = -36.5 + (((tickAnim - 19) / 3) * (-32.66-(-36.5)));
            yy = 0 + (((tickAnim - 19) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 19) / 3) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 60) {
            xx = -32.66 + (((tickAnim - 22) / 38) * (20.5-(-32.66)));
            yy = 0 + (((tickAnim - 22) / 38) * (0-(0)));
            zz = 0 + (((tickAnim - 22) / 38) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm, rightArm.rotateAngleX + (float) Math.toRadians(xx), rightArm.rotateAngleY + (float) Math.toRadians(yy), rightArm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (3.55-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 10) {
            xx = 3.55 + (((tickAnim - 3) / 7) * (-10.75-Math.sin((Math.PI/180)*(((double)tickAnim/20)*150-50))*50-(3.55)));
            yy = 0 + (((tickAnim - 3) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 7) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 19) {
            xx = -10.75-Math.sin((Math.PI/180)*(((double)tickAnim/20)*150-50))*50 + (((tickAnim - 10) / 9) * (12-(-10.75-Math.sin((Math.PI/180)*(((double)tickAnim/20)*150-50))*50)));
            yy = 0 + (((tickAnim - 10) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 9) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 22) {
            xx = 12 + (((tickAnim - 19) / 3) * (8.25-(12)));
            yy = 0 + (((tickAnim - 19) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 19) / 3) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 60) {
            xx = 8.25 + (((tickAnim - 22) / 38) * (0-(8.25)));
            yy = 0 + (((tickAnim - 22) / 38) * (0-(0)));
            zz = 0 + (((tickAnim - 22) / 38) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm2, rightArm2.rotateAngleX + (float) Math.toRadians(xx), rightArm2.rotateAngleY + (float) Math.toRadians(yy), rightArm2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0.35-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (1.1-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 10) / 9) * (0-(0)));
            yy = 0.35 + (((tickAnim - 10) / 9) * (0-(0.35)));
            zz = 1.1 + (((tickAnim - 10) / 9) * (0-(1.1)));
        }
        else if (tickAnim >= 19 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 19) / 41) * (0-(0)));
            yy = 0 + (((tickAnim - 19) / 41) * (0-(0)));
            zz = 0 + (((tickAnim - 19) / 41) * (0-(0)));
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
            xx = 71.12198 + (((tickAnim - 0) / 3) * (87.91508-(71.12198)));
            yy = -0.90435 + (((tickAnim - 0) / 3) * (-4.85097-(-0.90435)));
            zz = -7.09888 + (((tickAnim - 0) / 3) * (-4.96373-(-7.09888)));
        }
        else if (tickAnim >= 3 && tickAnim < 10) {
            xx = 87.91508 + (((tickAnim - 3) / 7) * (98.29437-(87.91508)));
            yy = -4.85097 + (((tickAnim - 3) / 7) * (-16.69086-(-4.85097)));
            zz = -4.96373 + (((tickAnim - 3) / 7) * (1.44171-(-4.96373)));
        }
        else if (tickAnim >= 10 && tickAnim < 19) {
            xx = 98.29437 + (((tickAnim - 10) / 9) * (26.60501-(98.29437)));
            yy = -16.69086 + (((tickAnim - 10) / 9) * (-5.37085-(-16.69086)));
            zz = 1.44171 + (((tickAnim - 10) / 9) * (7.89279-(1.44171)));
        }
        else if (tickAnim >= 19 && tickAnim < 22) {
            xx = 26.60501 + (((tickAnim - 19) / 3) * (26.60501-(26.60501)));
            yy = -5.37085 + (((tickAnim - 19) / 3) * (-5.37085-(-5.37085)));
            zz = 7.89279 + (((tickAnim - 19) / 3) * (7.89279-(7.89279)));
        }
        else if (tickAnim >= 22 && tickAnim < 40) {
            xx = 26.60501 + (((tickAnim - 22) / 18) * (5.50868-(26.60501)));
            yy = -5.37085 + (((tickAnim - 22) / 18) * (-3.15889-(-5.37085)));
            zz = 7.89279 + (((tickAnim - 22) / 18) * (0.17495-(7.89279)));
        }
        else if (tickAnim >= 40 && tickAnim < 60) {
            xx = 5.50868 + (((tickAnim - 40) / 20) * (71.12198-(5.50868)));
            yy = -3.15889 + (((tickAnim - 40) / 20) * (-0.90435-(-3.15889)));
            zz = 0.17495 + (((tickAnim - 40) / 20) * (-7.09888-(0.17495)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm3, rightArm3.rotateAngleX + (float) Math.toRadians(xx), rightArm3.rotateAngleY + (float) Math.toRadians(yy), rightArm3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0.95 + (((tickAnim - 0) / 3) * (0.93-(0.95)));
            zz = -0.225 + (((tickAnim - 0) / 3) * (-0.94-(-0.225)));
        }
        else if (tickAnim >= 3 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 3) / 7) * (0-(0)));
            yy = 0.93 + (((tickAnim - 3) / 7) * (0-(0.93)));
            zz = -0.94 + (((tickAnim - 3) / 7) * (-0.75-(-0.94)));
        }
        else if (tickAnim >= 10 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 10) / 9) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 9) * (0.375-(0)));
            zz = -0.75 + (((tickAnim - 10) / 9) * (0-(-0.75)));
        }
        else if (tickAnim >= 19 && tickAnim < 22) {
            xx = 0 + (((tickAnim - 19) / 3) * (0-(0)));
            yy = 0.375 + (((tickAnim - 19) / 3) * (0.375-(0.375)));
            zz = 0 + (((tickAnim - 19) / 3) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 22) / 18) * (0-(0)));
            yy = 0.375 + (((tickAnim - 22) / 18) * (0-(0.375)));
            zz = 0 + (((tickAnim - 22) / 18) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 40) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 40) / 20) * (0.95-(0)));
            zz = 0 + (((tickAnim - 40) / 20) * (-0.225-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightArm3.rotationPointX = this.rightArm3.rotationPointX + (float)(xx);
        this.rightArm3.rotationPointY = this.rightArm3.rotationPointY - (float)(yy);
        this.rightArm3.rotationPointZ = this.rightArm3.rotationPointZ + (float)(zz);



        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*120/0.5-100))*2), neck.rotateAngleY + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*120-50))*-2), neck.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*120-150))*1));


        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*120/0.5-150))*-2), neck2.rotateAngleY + (float) Math.toRadians(0), neck2.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*120-200))*2));


        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*120/0.5-150))*2), head.rotateAngleY + (float) Math.toRadians(0), head.rotateAngleZ + (float) Math.toRadians(0));

    }
    public void animRunning(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraSpicomellus entity = (EntityPrehistoricFloraSpicomellus) entitylivingbaseIn;
        int animCycle = 40;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        this.setRotateAngle(main, main.rotateAngleX + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.5))*1), main.rotateAngleY + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180))*3), main.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-50))*2));
        this.main.rotationPointX = this.main.rotationPointX + (float)(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180))*0.4);
        this.main.rotationPointY = this.main.rotationPointY - (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.5+30))*0.4);
        this.main.rotationPointZ = this.main.rotationPointZ + (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.5-70))*-0.4);



        if (tickAnim >= 0 && tickAnim < 9) {
            xx = 2 + (((tickAnim - 0) / 9) * (20.5-(2)));
            yy = 0 + (((tickAnim - 0) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 9) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 15) {
            xx = 20.5 + (((tickAnim - 9) / 6) * (97.27-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*150-(20.5)));
            yy = 0 + (((tickAnim - 9) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 6) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 21) {
            xx = 97.27-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*150 + (((tickAnim - 15) / 6) * (-22.75-(97.27-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*150)));
            yy = 0 + (((tickAnim - 15) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 6) * (0-(0)));
        }
        else if (tickAnim >= 21 && tickAnim < 40) {
            xx = -22.75 + (((tickAnim - 21) / 19) * (2-(-22.75)));
            yy = 0 + (((tickAnim - 21) / 19) * (0-(0)));
            zz = 0 + (((tickAnim - 21) / 19) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg, leftLeg.rotateAngleX + (float) Math.toRadians(xx), leftLeg.rotateAngleY + (float) Math.toRadians(yy), leftLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 9) {
            xx = 5.75 + (((tickAnim - 0) / 9) * (13.5-(5.75)));
            yy = 0 + (((tickAnim - 0) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 9) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 15) {
            xx = 13.5 + (((tickAnim - 9) / 6) * (116.6-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*150-(13.5)));
            yy = 0 + (((tickAnim - 9) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 6) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 21) {
            xx = 116.6-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*150 + (((tickAnim - 15) / 6) * (0-(116.6-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*150)));
            yy = 0 + (((tickAnim - 15) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 6) * (0-(0)));
        }
        else if (tickAnim >= 21 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 21) / 19) * (5.75-(0)));
            yy = 0 + (((tickAnim - 21) / 19) * (0-(0)));
            zz = 0 + (((tickAnim - 21) / 19) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg2, leftLeg2.rotateAngleX + (float) Math.toRadians(xx), leftLeg2.rotateAngleY + (float) Math.toRadians(yy), leftLeg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 9) {
            xx = 12 + (((tickAnim - 0) / 9) * (14.25-(12)));
            yy = 0 + (((tickAnim - 0) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 9) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 15) {
            xx = 14.25 + (((tickAnim - 9) / 6) * (-43.13-(14.25)));
            yy = 0 + (((tickAnim - 9) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 6) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 18) {
            xx = -43.13 + (((tickAnim - 15) / 3) * (-296.355-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-350-(-43.13)));
            yy = 0 + (((tickAnim - 15) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 3) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 21) {
            xx = -296.355-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-350 + (((tickAnim - 18) / 3) * (16.25-(-296.355-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-350)));
            yy = 0 + (((tickAnim - 18) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 3) * (0-(0)));
        }
        else if (tickAnim >= 21 && tickAnim < 25) {
            xx = 16.25 + (((tickAnim - 21) / 4) * (8.1-(16.25)));
            yy = 0 + (((tickAnim - 21) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 21) / 4) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 40) {
            xx = 8.1 + (((tickAnim - 25) / 15) * (12-(8.1)));
            yy = 0 + (((tickAnim - 25) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg3, leftLeg3.rotateAngleX + (float) Math.toRadians(xx), leftLeg3.rotateAngleY + (float) Math.toRadians(yy), leftLeg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 15 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 15) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 15) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 3) * (-1.175-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 21) {
            xx = 0 + (((tickAnim - 18) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 18) / 3) * (0-(0)));
            zz = -1.175 + (((tickAnim - 18) / 3) * (0-(-1.175)));
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
            xx = -18.75 + (((tickAnim - 0) / 3) * (-17-(-18.75)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 11) {
            xx = -17 + (((tickAnim - 3) / 8) * (85.21-(-17)));
            yy = 0 + (((tickAnim - 3) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 8) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 18) {
            xx = 85.21 + (((tickAnim - 11) / 7) * (107.12-(85.21)));
            yy = 0 + (((tickAnim - 11) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 7) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 21) {
            xx = 107.12 + (((tickAnim - 18) / 3) * (6.75-(107.12)));
            yy = 0 + (((tickAnim - 18) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 3) * (0-(0)));
        }
        else if (tickAnim >= 21 && tickAnim < 25) {
            xx = 6.75 + (((tickAnim - 21) / 4) * (8.92-(6.75)));
            yy = 0 + (((tickAnim - 21) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 21) / 4) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 40) {
            xx = 8.92 + (((tickAnim - 25) / 15) * (-18.75-(8.92)));
            yy = 0 + (((tickAnim - 25) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg4, leftLeg4.rotateAngleX + (float) Math.toRadians(xx), leftLeg4.rotateAngleY + (float) Math.toRadians(yy), leftLeg4.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = -0.45 + (((tickAnim - 0) / 3) * (-0.575-(-0.45)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 3) / 15) * (0-(0)));
            yy = -0.575 + (((tickAnim - 3) / 15) * (0-(-0.575)));
            zz = 0 + (((tickAnim - 3) / 15) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 21) {
            xx = 0 + (((tickAnim - 18) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 18) / 3) * (-0.525-(0)));
            zz = 0 + (((tickAnim - 18) / 3) * (0-(0)));
        }
        else if (tickAnim >= 21 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 21) / 12) * (0-(0)));
            yy = -0.525 + (((tickAnim - 21) / 12) * (0-(-0.525)));
            zz = 0 + (((tickAnim - 21) / 12) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 33) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 33) / 7) * (-0.45-(0)));
            zz = 0 + (((tickAnim - 33) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftLeg4.rotationPointX = this.leftLeg4.rotationPointX + (float)(xx);
        this.leftLeg4.rotationPointY = this.leftLeg4.rotationPointY - (float)(yy);
        this.leftLeg4.rotationPointZ = this.leftLeg4.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 27) {
            xx = -22.75 + (((tickAnim - 0) / 27) * (20.5-(-22.75)));
            yy = 0 + (((tickAnim - 0) / 27) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 27) * (0-(0)));
        }
        else if (tickAnim >= 27 && tickAnim < 34) {
            xx = 20.5 + (((tickAnim - 27) / 7) * (64.145-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-50))*100-(20.5)));
            yy = 0 + (((tickAnim - 27) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 27) / 7) * (0-(0)));
        }
        else if (tickAnim >= 34 && tickAnim < 40) {
            xx = 64.145-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-50))*100 + (((tickAnim - 34) / 6) * (-22.75-(64.145-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-50))*100)));
            yy = 0 + (((tickAnim - 34) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 34) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg, rightLeg.rotateAngleX + (float) Math.toRadians(xx), rightLeg.rotateAngleY + (float) Math.toRadians(yy), rightLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 27) {
            xx = 0 + (((tickAnim - 0) / 27) * (13.5-(0)));
            yy = 0 + (((tickAnim - 0) / 27) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 27) * (0-(0)));
        }
        else if (tickAnim >= 27 && tickAnim < 34) {
            xx = 13.5 + (((tickAnim - 27) / 7) * (-69.1-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-100-(13.5)));
            yy = 0 + (((tickAnim - 27) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 27) / 7) * (0-(0)));
        }
        else if (tickAnim >= 34 && tickAnim < 40) {
            xx = -69.1-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-100 + (((tickAnim - 34) / 6) * (0-(-69.1-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-100)));
            yy = 0 + (((tickAnim - 34) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 34) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg2, rightLeg2.rotateAngleX + (float) Math.toRadians(xx), rightLeg2.rotateAngleY + (float) Math.toRadians(yy), rightLeg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 27) {
            xx = 16 + (((tickAnim - 0) / 27) * (14.25-(16)));
            yy = 0 + (((tickAnim - 0) / 27) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 27) * (0-(0)));
        }
        else if (tickAnim >= 27 && tickAnim < 33) {
            xx = 14.25 + (((tickAnim - 27) / 6) * (-42.13-(14.25)));
            yy = 0 + (((tickAnim - 27) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 27) / 6) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 37) {
            xx = -42.13 + (((tickAnim - 33) / 4) * (211.17-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+30))*300-(-42.13)));
            yy = 0 + (((tickAnim - 33) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 4) * (0-(0)));
        }
        else if (tickAnim >= 37 && tickAnim < 40) {
            xx = 211.17-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+30))*300 + (((tickAnim - 37) / 3) * (16-(211.17-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+30))*300)));
            yy = 0 + (((tickAnim - 37) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 37) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg3, rightLeg3.rotateAngleX + (float) Math.toRadians(xx), rightLeg3.rotateAngleY + (float) Math.toRadians(yy), rightLeg3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 9) {
            xx = 7 + (((tickAnim - 0) / 9) * (-10.75-(7)));
            yy = 0 + (((tickAnim - 0) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 9) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 17) {
            xx = -10.75 + (((tickAnim - 9) / 8) * (-24.67-(-10.75)));
            yy = 0 + (((tickAnim - 9) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 8) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 19) {
            xx = -24.67 + (((tickAnim - 17) / 2) * (-17-(-24.67)));
            yy = 0 + (((tickAnim - 17) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 17) / 2) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 28) {
            xx = -17 + (((tickAnim - 19) / 9) * (85.21-(-17)));
            yy = 0 + (((tickAnim - 19) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 19) / 9) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 36) {
            xx = 85.21 + (((tickAnim - 28) / 8) * (66.17-(85.21)));
            yy = 0 + (((tickAnim - 28) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 8) * (0-(0)));
        }
        else if (tickAnim >= 36 && tickAnim < 40) {
            xx = 66.17 + (((tickAnim - 36) / 4) * (7-(66.17)));
            yy = 0 + (((tickAnim - 36) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 36) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg4, rightLeg4.rotateAngleX + (float) Math.toRadians(xx), rightLeg4.rotateAngleY + (float) Math.toRadians(yy), rightLeg4.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 0) / 9) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 9) * (0.275-(0)));
            zz = 0 + (((tickAnim - 0) / 9) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 9) / 10) * (0-(0)));
            yy = 0.275 + (((tickAnim - 9) / 10) * (-0.575-(0.275)));
            zz = 0 + (((tickAnim - 9) / 10) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 19) / 21) * (0-(0)));
            yy = -0.575 + (((tickAnim - 19) / 21) * (0-(-0.575)));
            zz = 0 + (((tickAnim - 19) / 21) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightLeg4.rotationPointX = this.rightLeg4.rotationPointX + (float)(xx);
        this.rightLeg4.rotationPointY = this.rightLeg4.rotationPointY - (float)(yy);
        this.rightLeg4.rotationPointZ = this.rightLeg4.rotationPointZ + (float)(zz);



        this.setRotateAngle(tail, tail.rotateAngleX + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.5-50))*2), tail.rotateAngleY + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-50))*0.5), tail.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-50))*1));


        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.5-100))*1), tail2.rotateAngleY + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-70))*0.55), tail2.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-50))*1));


        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.5-150))*1), tail3.rotateAngleY + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-90))*2), tail3.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-50))*1));


        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.5-200))*1), tail4.rotateAngleY + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-120))*3), tail4.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-50))*1));


        this.setRotateAngle(tail5, tail5.rotateAngleX + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.5-250))*1), tail5.rotateAngleY + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-150))*4), tail5.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-50))*1));


        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.5-80))*1.2), body.rotateAngleY + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-20))*-3), body.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-150))*2));


        this.setRotateAngle(body2, body2.rotateAngleX + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.5-50))*-1.5), body2.rotateAngleY + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-100))*2), body2.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-150))*-2));



        if (tickAnim >= 0 && tickAnim < 23) {
            xx = -25.41 + (((tickAnim - 0) / 23) * (27-(-25.41)));
            yy = 0 + (((tickAnim - 0) / 23) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 23) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 35) {
            xx = 27 + (((tickAnim - 23) / 12) * (-36.5-(27)));
            yy = 0 + (((tickAnim - 23) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 12) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 37) {
            xx = -36.5 + (((tickAnim - 35) / 2) * (-32.66-(-36.5)));
            yy = 0 + (((tickAnim - 35) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 2) * (0-(0)));
        }
        else if (tickAnim >= 37 && tickAnim < 40) {
            xx = -32.66 + (((tickAnim - 37) / 3) * (-25.41-(-32.66)));
            yy = 0 + (((tickAnim - 37) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 37) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm, leftArm.rotateAngleX + (float) Math.toRadians(xx), leftArm.rotateAngleY + (float) Math.toRadians(yy), leftArm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 23) {
            xx = 8.25 + (((tickAnim - 0) / 23) * (0-(8.25)));
            yy = 0 + (((tickAnim - 0) / 23) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 23) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 29) {
            xx = 0 + (((tickAnim - 23) / 6) * (-190.475-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-150-(0)));
            yy = 0 + (((tickAnim - 23) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 6) * (0-(0)));
        }
        else if (tickAnim >= 29 && tickAnim < 35) {
            xx = -190.475-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-150 + (((tickAnim - 29) / 6) * (13.25-(-190.475-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-150)));
            yy = 0 + (((tickAnim - 29) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 29) / 6) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 37) {
            xx = 13.25 + (((tickAnim - 35) / 2) * (8.25-(13.25)));
            yy = 0 + (((tickAnim - 35) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 2) * (0-(0)));
        }
        else if (tickAnim >= 37 && tickAnim < 40) {
            xx = 8.25 + (((tickAnim - 37) / 3) * (8.25-(8.25)));
            yy = 0 + (((tickAnim - 37) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 37) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm2, leftArm2.rotateAngleX + (float) Math.toRadians(xx), leftArm2.rotateAngleY + (float) Math.toRadians(yy), leftArm2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 11) {
            xx = 20.00924 + (((tickAnim - 0) / 11) * (-3-(20.00924)));
            yy = 2.9231 + (((tickAnim - 0) / 11) * (0-(2.9231)));
            zz = -5.52759 + (((tickAnim - 0) / 11) * (0-(-5.52759)));
        }
        else if (tickAnim >= 11 && tickAnim < 23) {
            xx = -3 + (((tickAnim - 11) / 12) * (71.12198-(-3)));
            yy = 0 + (((tickAnim - 11) / 12) * (-0.90435-(0)));
            zz = 0 + (((tickAnim - 11) / 12) * (-7.09888-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 24) {
            xx = 71.12198 + (((tickAnim - 23) / 1) * (80.91508-(71.12198)));
            yy = -0.90435 + (((tickAnim - 23) / 1) * (-4.85097-(-0.90435)));
            zz = -7.09888 + (((tickAnim - 23) / 1) * (-4.96373-(-7.09888)));
        }
        else if (tickAnim >= 24 && tickAnim < 29) {
            xx = 80.91508 + (((tickAnim - 24) / 5) * (98.29437-(80.91508)));
            yy = -4.85097 + (((tickAnim - 24) / 5) * (16.69086-(-4.85097)));
            zz = -4.96373 + (((tickAnim - 24) / 5) * (-1.44171-(-4.96373)));
        }
        else if (tickAnim >= 29 && tickAnim < 35) {
            xx = 98.29437 + (((tickAnim - 29) / 6) * (24.60501-(98.29437)));
            yy = 16.69086 + (((tickAnim - 29) / 6) * (5.37085-(16.69086)));
            zz = -1.44171 + (((tickAnim - 29) / 6) * (-7.89279-(-1.44171)));
        }
        else if (tickAnim >= 35 && tickAnim < 37) {
            xx = 24.60501 + (((tickAnim - 35) / 2) * (26.60501-(24.60501)));
            yy = 5.37085 + (((tickAnim - 35) / 2) * (5.37085-(5.37085)));
            zz = -7.89279 + (((tickAnim - 35) / 2) * (-7.89279-(-7.89279)));
        }
        else if (tickAnim >= 37 && tickAnim < 40) {
            xx = 26.60501 + (((tickAnim - 37) / 3) * (20.00924-(26.60501)));
            yy = 5.37085 + (((tickAnim - 37) / 3) * (2.9231-(5.37085)));
            zz = -7.89279 + (((tickAnim - 37) / 3) * (-5.52759-(-7.89279)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm3, leftArm3.rotateAngleX + (float) Math.toRadians(xx), leftArm3.rotateAngleY + (float) Math.toRadians(yy), leftArm3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (-0.455-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 5) / 6) * (0-(0)));
            yy = -0.455 + (((tickAnim - 5) / 6) * (0.05-(-0.455)));
            zz = 0 + (((tickAnim - 5) / 6) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 11) / 12) * (0-(0)));
            yy = 0.05 + (((tickAnim - 11) / 12) * (0.5-(0.05)));
            zz = 0 + (((tickAnim - 11) / 12) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 24) {
            xx = 0 + (((tickAnim - 23) / 1) * (0-(0)));
            yy = 0.5 + (((tickAnim - 23) / 1) * (0.93-(0.5)));
            zz = 0 + (((tickAnim - 23) / 1) * (-0.94-(0)));
        }
        else if (tickAnim >= 24 && tickAnim < 29) {
            xx = 0 + (((tickAnim - 24) / 5) * (0-(0)));
            yy = 0.93 + (((tickAnim - 24) / 5) * (0-(0.93)));
            zz = -0.94 + (((tickAnim - 24) / 5) * (-0.75-(-0.94)));
        }
        else if (tickAnim >= 29 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 29) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 29) / 6) * (0-(0)));
            zz = -0.75 + (((tickAnim - 29) / 6) * (0-(-0.75)));
        }
        else if (tickAnim >= 35 && tickAnim < 37) {
            xx = 0 + (((tickAnim - 35) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 35) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 2) * (0-(0)));
        }
        else if (tickAnim >= 37 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 37) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 37) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 37) / 3) * (0-(0)));
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
            xx = 26 + (((tickAnim - 0) / 13) * (-36.5-(26)));
            yy = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 14) {
            xx = -36.5 + (((tickAnim - 13) / 1) * (-32.66-(-36.5)));
            yy = 0 + (((tickAnim - 13) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 1) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 40) {
            xx = -32.66 + (((tickAnim - 14) / 26) * (26-(-32.66)));
            yy = 0 + (((tickAnim - 14) / 26) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 26) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm, rightArm.rotateAngleX + (float) Math.toRadians(xx), rightArm.rotateAngleY + (float) Math.toRadians(yy), rightArm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (-8.325-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*100-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 13) {
            xx = -8.325-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*100 + (((tickAnim - 7) / 6) * (12-(-8.325-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*100)));
            yy = 0 + (((tickAnim - 7) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 6) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 14) {
            xx = 12 + (((tickAnim - 13) / 1) * (8.25-(12)));
            yy = 0 + (((tickAnim - 13) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 1) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 40) {
            xx = 8.25 + (((tickAnim - 14) / 26) * (0-(8.25)));
            yy = 0 + (((tickAnim - 14) / 26) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 26) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm2, rightArm2.rotateAngleX + (float) Math.toRadians(xx), rightArm2.rotateAngleY + (float) Math.toRadians(yy), rightArm2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 71.12198 + (((tickAnim - 0) / 2) * (87.91508-(71.12198)));
            yy = -0.90435 + (((tickAnim - 0) / 2) * (-4.85097-(-0.90435)));
            zz = -7.09888 + (((tickAnim - 0) / 2) * (-4.96373-(-7.09888)));
        }
        else if (tickAnim >= 2 && tickAnim < 7) {
            xx = 87.91508 + (((tickAnim - 2) / 5) * (98.29437-(87.91508)));
            yy = -4.85097 + (((tickAnim - 2) / 5) * (-16.69086-(-4.85097)));
            zz = -4.96373 + (((tickAnim - 2) / 5) * (1.44171-(-4.96373)));
        }
        else if (tickAnim >= 7 && tickAnim < 13) {
            xx = 98.29437 + (((tickAnim - 7) / 6) * (26.60501-(98.29437)));
            yy = -16.69086 + (((tickAnim - 7) / 6) * (-5.37085-(-16.69086)));
            zz = 1.44171 + (((tickAnim - 7) / 6) * (7.89279-(1.44171)));
        }
        else if (tickAnim >= 13 && tickAnim < 14) {
            xx = 26.60501 + (((tickAnim - 13) / 1) * (26.60501-(26.60501)));
            yy = -5.37085 + (((tickAnim - 13) / 1) * (-5.37085-(-5.37085)));
            zz = 7.89279 + (((tickAnim - 13) / 1) * (7.89279-(7.89279)));
        }
        else if (tickAnim >= 14 && tickAnim < 27) {
            xx = 26.60501 + (((tickAnim - 14) / 13) * (5.50868-(26.60501)));
            yy = -5.37085 + (((tickAnim - 14) / 13) * (-3.15889-(-5.37085)));
            zz = 7.89279 + (((tickAnim - 14) / 13) * (0.17495-(7.89279)));
        }
        else if (tickAnim >= 27 && tickAnim < 40) {
            xx = 5.50868 + (((tickAnim - 27) / 13) * (71.12198-(5.50868)));
            yy = -3.15889 + (((tickAnim - 27) / 13) * (-0.90435-(-3.15889)));
            zz = 0.17495 + (((tickAnim - 27) / 13) * (-7.09888-(0.17495)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm3, rightArm3.rotateAngleX + (float) Math.toRadians(xx), rightArm3.rotateAngleY + (float) Math.toRadians(yy), rightArm3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            yy = 0.95 + (((tickAnim - 0) / 2) * (0.93-(0.95)));
            zz = -0.225 + (((tickAnim - 0) / 2) * (-0.94-(-0.225)));
        }
        else if (tickAnim >= 2 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 2) / 5) * (0-(0)));
            yy = 0.93 + (((tickAnim - 2) / 5) * (0-(0.93)));
            zz = -0.94 + (((tickAnim - 2) / 5) * (-0.75-(-0.94)));
        }
        else if (tickAnim >= 7 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 7) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 7) / 6) * (0-(0)));
            zz = -0.75 + (((tickAnim - 7) / 6) * (0-(-0.75)));
        }
        else if (tickAnim >= 13 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 13) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 13) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 1) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 14) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 14) / 4) * (0.535-(0)));
            zz = 0 + (((tickAnim - 14) / 4) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 18) / 5) * (0-(0)));
            yy = 0.535 + (((tickAnim - 18) / 5) * (-0.295-(0.535)));
            zz = 0 + (((tickAnim - 18) / 5) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 27) {
            xx = 0 + (((tickAnim - 23) / 4) * (0-(0)));
            yy = -0.295 + (((tickAnim - 23) / 4) * (-0.275-(-0.295)));
            zz = 0 + (((tickAnim - 23) / 4) * (0-(0)));
        }
        else if (tickAnim >= 27 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 27) / 13) * (0-(0)));
            yy = -0.275 + (((tickAnim - 27) / 13) * (0.95-(-0.275)));
            zz = 0 + (((tickAnim - 27) / 13) * (-0.225-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightArm3.rotationPointX = this.rightArm3.rotationPointX + (float)(xx);
        this.rightArm3.rotationPointY = this.rightArm3.rotationPointY - (float)(yy);
        this.rightArm3.rotationPointZ = this.rightArm3.rotationPointZ + (float)(zz);



        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.5-100))*-2), neck.rotateAngleY + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-100))*-2), neck.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-150))*1));


        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.5-150))*-2), neck2.rotateAngleY + (float) Math.toRadians(0), neck2.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-200))*2));


        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.5-150))*2), head.rotateAngleY + (float) Math.toRadians(0), head.rotateAngleZ + (float) Math.toRadians(0));

    }
    public void animSneaking(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraSpicomellus entity = (EntityPrehistoricFloraSpicomellus) entitylivingbaseIn;
        int animCycle = 40;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        this.setRotateAngle(main, main.rotateAngleX + (float) Math.toRadians(0), main.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-50))*1.5), main.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180+80))*1));
        this.main.rotationPointX = this.main.rotationPointX + (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-50))*-0.15);
        this.main.rotationPointY = this.main.rotationPointY - (float)(-2.775);
        this.main.rotationPointZ = this.main.rotationPointZ + (float)(0);



        if (tickAnim >= 0 && tickAnim < 17) {
            xx = -10.25 + (((tickAnim - 0) / 17) * (-7.75-(-10.25)));
            yy = 0 + (((tickAnim - 0) / 17) * (0-(0)));
            zz = -0.75 + (((tickAnim - 0) / 17) * (-15.5-(-0.75)));
        }
        else if (tickAnim >= 17 && tickAnim < 40) {
            xx = -7.75 + (((tickAnim - 17) / 23) * (-10.25-(-7.75)));
            yy = 0 + (((tickAnim - 17) / 23) * (0-(0)));
            zz = -15.5 + (((tickAnim - 17) / 23) * (-0.75-(-15.5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg, leftLeg.rotateAngleX + (float) Math.toRadians(xx), leftLeg.rotateAngleY + (float) Math.toRadians(yy), leftLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 4.39977 + (((tickAnim - 0) / 8) * (37.59295-(4.39977)));
            yy = -17.87225 + (((tickAnim - 0) / 8) * (-14.00319-(-17.87225)));
            zz = 15.95299 + (((tickAnim - 0) / 8) * (13.6523-(15.95299)));
        }
        else if (tickAnim >= 8 && tickAnim < 17) {
            xx = 37.59295 + (((tickAnim - 8) / 9) * (-0.71388-(37.59295)));
            yy = -14.00319 + (((tickAnim - 8) / 9) * (-10.13412-(-14.00319)));
            zz = 13.6523 + (((tickAnim - 8) / 9) * (11.35161-(13.6523)));
        }
        else if (tickAnim >= 17 && tickAnim < 40) {
            xx = -0.71388 + (((tickAnim - 17) / 23) * (4.39977-(-0.71388)));
            yy = -10.13412 + (((tickAnim - 17) / 23) * (-17.87225-(-10.13412)));
            zz = 11.35161 + (((tickAnim - 17) / 23) * (15.95299-(11.35161)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg2, leftLeg2.rotateAngleX + (float) Math.toRadians(xx), leftLeg2.rotateAngleY + (float) Math.toRadians(yy), leftLeg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0.425-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 17) {
            xx = 0 + (((tickAnim - 8) / 9) * (0-(0)));
            yy = 0.425 + (((tickAnim - 8) / 9) * (0-(0.425)));
            zz = 0 + (((tickAnim - 8) / 9) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 17) / 23) * (0-(0)));
            yy = 0 + (((tickAnim - 17) / 23) * (0-(0)));
            zz = 0 + (((tickAnim - 17) / 23) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftLeg2.rotationPointX = this.leftLeg2.rotationPointX + (float)(xx);
        this.leftLeg2.rotationPointY = this.leftLeg2.rotationPointY - (float)(yy);
        this.leftLeg2.rotationPointZ = this.leftLeg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = -14 + (((tickAnim - 0) / 8) * (-40.75-(-14)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 17) {
            xx = -40.75 + (((tickAnim - 8) / 9) * (-26.5-(-40.75)));
            yy = 0 + (((tickAnim - 8) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 9) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 40) {
            xx = -26.5 + (((tickAnim - 17) / 23) * (-14-(-26.5)));
            yy = 0 + (((tickAnim - 17) / 23) * (0-(0)));
            zz = 0 + (((tickAnim - 17) / 23) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg3, leftLeg3.rotateAngleX + (float) Math.toRadians(xx), leftLeg3.rotateAngleY + (float) Math.toRadians(yy), leftLeg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (-0.175-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 17) {
            xx = 0 + (((tickAnim - 8) / 9) * (0-(0)));
            yy = -0.175 + (((tickAnim - 8) / 9) * (0-(-0.175)));
            zz = 0 + (((tickAnim - 8) / 9) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 17) / 23) * (0-(0)));
            yy = 0 + (((tickAnim - 17) / 23) * (0-(0)));
            zz = 0 + (((tickAnim - 17) / 23) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftLeg3.rotationPointX = this.leftLeg3.rotationPointX + (float)(xx);
        this.leftLeg3.rotationPointY = this.leftLeg3.rotationPointY - (float)(yy);
        this.leftLeg3.rotationPointZ = this.leftLeg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 19.0207 + (((tickAnim - 0) / 8) * (69.38535-(19.0207)));
            yy = 4.54463 + (((tickAnim - 0) / 8) * (2.27231-(4.54463)));
            zz = -20.64103 + (((tickAnim - 0) / 8) * (-10.32051-(-20.64103)));
        }
        else if (tickAnim >= 8 && tickAnim < 17) {
            xx = 69.38535 + (((tickAnim - 8) / 9) * (38.75-(69.38535)));
            yy = 2.27231 + (((tickAnim - 8) / 9) * (0-(2.27231)));
            zz = -10.32051 + (((tickAnim - 8) / 9) * (0-(-10.32051)));
        }
        else if (tickAnim >= 17 && tickAnim < 40) {
            xx = 38.75 + (((tickAnim - 17) / 23) * (19.0207-(38.75)));
            yy = 0 + (((tickAnim - 17) / 23) * (4.54463-(0)));
            zz = 0 + (((tickAnim - 17) / 23) * (-20.64103-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg4, leftLeg4.rotateAngleX + (float) Math.toRadians(xx), leftLeg4.rotateAngleY + (float) Math.toRadians(yy), leftLeg4.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            yy = 1.325 + (((tickAnim - 0) / 8) * (1.325-(1.325)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 17) {
            xx = 0 + (((tickAnim - 8) / 9) * (0-(0)));
            yy = 1.325 + (((tickAnim - 8) / 9) * (1.055-(1.325)));
            zz = 0 + (((tickAnim - 8) / 9) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 17) / 23) * (0-(0)));
            yy = 1.055 + (((tickAnim - 17) / 23) * (1.325-(1.055)));
            zz = 0 + (((tickAnim - 17) / 23) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftLeg4.rotationPointX = this.leftLeg4.rotationPointX + (float)(xx);
        this.leftLeg4.rotationPointY = this.leftLeg4.rotationPointY - (float)(yy);
        this.leftLeg4.rotationPointZ = this.leftLeg4.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 17) {
            xx = 0 + (((tickAnim - 0) / 17) * (1.70046-(0)));
            yy = 0 + (((tickAnim - 0) / 17) * (-2.0667-(0)));
            zz = -2 + (((tickAnim - 0) / 17) * (8.3202-(-2)));
        }
        else if (tickAnim >= 17 && tickAnim < 35) {
            xx = 1.70046 + (((tickAnim - 17) / 18) * (0.48966-(1.70046)));
            yy = -2.0667 + (((tickAnim - 17) / 18) * (-0.29645-(-2.0667)));
            zz = 8.3202 + (((tickAnim - 17) / 18) * (-1.25859-(8.3202)));
        }
        else if (tickAnim >= 35 && tickAnim < 40) {
            xx = 0.48966 + (((tickAnim - 35) / 5) * (0-(0.48966)));
            yy = -0.29645 + (((tickAnim - 35) / 5) * (0-(-0.29645)));
            zz = -1.25859 + (((tickAnim - 35) / 5) * (-2-(-1.25859)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg, rightLeg.rotateAngleX + (float) Math.toRadians(xx), rightLeg.rotateAngleY + (float) Math.toRadians(yy), rightLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 17) {
            xx = 21.96772 + (((tickAnim - 0) / 17) * (20.75-(21.96772)));
            yy = 11.06933 + (((tickAnim - 0) / 17) * (0-(11.06933)));
            zz = 4.6694 + (((tickAnim - 0) / 17) * (0-(4.6694)));
        }
        else if (tickAnim >= 17 && tickAnim < 26) {
            xx = 20.75 + (((tickAnim - 17) / 9) * (46.95229-(20.75)));
            yy = 0 + (((tickAnim - 17) / 9) * (7.50723-(0)));
            zz = 0 + (((tickAnim - 17) / 9) * (0.64435-(0)));
        }
        else if (tickAnim >= 26 && tickAnim < 35) {
            xx = 46.95229 + (((tickAnim - 26) / 9) * (21.65459-(46.95229)));
            yy = 7.50723 + (((tickAnim - 26) / 9) * (15.01445-(7.50723)));
            zz = 0.64435 + (((tickAnim - 26) / 9) * (1.2887-(0.64435)));
        }
        else if (tickAnim >= 35 && tickAnim < 40) {
            xx = 21.65459 + (((tickAnim - 35) / 5) * (21.96772-(21.65459)));
            yy = 15.01445 + (((tickAnim - 35) / 5) * (11.06933-(15.01445)));
            zz = 1.2887 + (((tickAnim - 35) / 5) * (4.6694-(1.2887)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg2, rightLeg2.rotateAngleX + (float) Math.toRadians(xx), rightLeg2.rotateAngleY + (float) Math.toRadians(yy), rightLeg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 17) {
            xx = 0 + (((tickAnim - 0) / 17) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 17) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 26) {
            xx = 0 + (((tickAnim - 17) / 9) * (-43.25-(0)));
            yy = 0 + (((tickAnim - 17) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 17) / 9) * (0-(0)));
        }
        else if (tickAnim >= 26 && tickAnim < 35) {
            xx = -43.25 + (((tickAnim - 26) / 9) * (0-(-43.25)));
            yy = 0 + (((tickAnim - 26) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 26) / 9) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg3, rightLeg3.rotateAngleX + (float) Math.toRadians(xx), rightLeg3.rotateAngleY + (float) Math.toRadians(yy), rightLeg3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 17) {
            xx = -20.84106 + (((tickAnim - 0) / 17) * (-20.88361-(-20.84106)));
            yy = -0.64266 + (((tickAnim - 0) / 17) * (3.24819-(-0.64266)));
            zz = -1.60114 + (((tickAnim - 0) / 17) * (-8.23543-(-1.60114)));
        }
        else if (tickAnim >= 17 && tickAnim < 26) {
            xx = -20.88361 + (((tickAnim - 17) / 9) * (44.46172-(-20.88361)));
            yy = 3.24819 + (((tickAnim - 17) / 9) * (2.13775-(3.24819)));
            zz = -8.23543 + (((tickAnim - 17) / 9) * (-3.34705-(-8.23543)));
        }
        else if (tickAnim >= 26 && tickAnim < 35) {
            xx = 44.46172 + (((tickAnim - 26) / 9) * (-20-(44.46172)));
            yy = 2.13775 + (((tickAnim - 26) / 9) * (0-(2.13775)));
            zz = -3.34705 + (((tickAnim - 26) / 9) * (0-(-3.34705)));
        }
        else if (tickAnim >= 35 && tickAnim < 40) {
            xx = -20 + (((tickAnim - 35) / 5) * (-20.84106-(-20)));
            yy = 0 + (((tickAnim - 35) / 5) * (-0.64266-(0)));
            zz = 0 + (((tickAnim - 35) / 5) * (-1.60114-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg4, rightLeg4.rotateAngleX + (float) Math.toRadians(xx), rightLeg4.rotateAngleY + (float) Math.toRadians(yy), rightLeg4.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 17) {
            xx = 0 + (((tickAnim - 0) / 17) * (0-(0)));
            yy = 0.825 + (((tickAnim - 0) / 17) * (0.8-(0.825)));
            zz = 0 + (((tickAnim - 0) / 17) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 17) / 23) * (0-(0)));
            yy = 0.8 + (((tickAnim - 17) / 23) * (0.825-(0.8)));
            zz = 0 + (((tickAnim - 17) / 23) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightLeg4.rotationPointX = this.rightLeg4.rotationPointX + (float)(xx);
        this.rightLeg4.rotationPointY = this.rightLeg4.rotationPointY - (float)(yy);
        this.rightLeg4.rotationPointZ = this.rightLeg4.rotationPointZ + (float)(zz);



        this.setRotateAngle(tail, tail.rotateAngleX + (float) Math.toRadians(3.42262), tail.rotateAngleY + (float) Math.toRadians(6.1452+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-100))*2), tail.rotateAngleZ + (float) Math.toRadians(-2.1206+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180+50))*1));


        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(10.27609), tail2.rotateAngleY + (float) Math.toRadians(11.828+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-150))*4), tail2.rotateAngleZ + (float) Math.toRadians(3.2051+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180+100))*2));
        this.tail2.rotationPointX = this.tail2.rotationPointX + (float)(0);
        this.tail2.rotationPointY = this.tail2.rotationPointY - (float)(0);
        this.tail2.rotationPointZ = this.tail2.rotationPointZ + (float)(-0.625);


        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(3.6122), tail3.rotateAngleY + (float) Math.toRadians(7.6738+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-200))*6), tail3.rotateAngleZ + (float) Math.toRadians(1.091+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180+150))*2));


        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(4), tail4.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-250))*9), tail4.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180+200))*4));


        this.setRotateAngle(tail5, tail5.rotateAngleX + (float) Math.toRadians(4), tail5.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-300))*12), tail5.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180+250))*6));


        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(0), body.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-100))*-1), body.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180+140))*-1.5));


        this.setRotateAngle(body2, body2.rotateAngleX + (float) Math.toRadians(0), body2.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180))*-2), body2.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180+100))*1.8));



        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 9.5 + (((tickAnim - 0) / 6) * (9.95828-(9.5)));
            yy = 0 + (((tickAnim - 0) / 6) * (5.25505-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (9.96122-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 13) {
            xx = 9.95828 + (((tickAnim - 6) / 7) * (12.05459-(9.95828)));
            yy = 5.25505 + (((tickAnim - 6) / 7) * (11.0737-(5.25505)));
            zz = 9.96122 + (((tickAnim - 6) / 7) * (-5.85006-(9.96122)));
        }
        else if (tickAnim >= 13 && tickAnim < 22) {
            xx = 12.05459 + (((tickAnim - 13) / 9) * (-0.92173-(12.05459)));
            yy = 11.0737 + (((tickAnim - 13) / 9) * (17.53887-(11.0737)));
            zz = -5.85006 + (((tickAnim - 13) / 9) * (-23.41816-(-5.85006)));
        }
        else if (tickAnim >= 22 && tickAnim < 40) {
            xx = -0.92173 + (((tickAnim - 22) / 18) * (9.5-(-0.92173)));
            yy = 17.53887 + (((tickAnim - 22) / 18) * (0-(17.53887)));
            zz = -23.41816 + (((tickAnim - 22) / 18) * (0-(-23.41816)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm, leftArm.rotateAngleX + (float) Math.toRadians(xx), leftArm.rotateAngleY + (float) Math.toRadians(yy), leftArm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 6) {
            xx = -27 + (((tickAnim - 0) / 6) * (-27.00059-(-27)));
            yy = 0 + (((tickAnim - 0) / 6) * (0.74441-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (-0.09141-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 13) {
            xx = -27.00059 + (((tickAnim - 6) / 7) * (-68.14841-(-27.00059)));
            yy = 0.74441 + (((tickAnim - 6) / 7) * (-2.25415-(0.74441)));
            zz = -0.09141 + (((tickAnim - 6) / 7) * (4.71197-(-0.09141)));
        }
        else if (tickAnim >= 13 && tickAnim < 22) {
            xx = -68.14841 + (((tickAnim - 13) / 9) * (-21.02247-(-68.14841)));
            yy = -2.25415 + (((tickAnim - 13) / 9) * (5.83368-(-2.25415)));
            zz = 4.71197 + (((tickAnim - 13) / 9) * (4.56614-(4.71197)));
        }
        else if (tickAnim >= 22 && tickAnim < 40) {
            xx = -21.02247 + (((tickAnim - 22) / 18) * (-27-(-21.02247)));
            yy = 5.83368 + (((tickAnim - 22) / 18) * (0-(5.83368)));
            zz = 4.56614 + (((tickAnim - 22) / 18) * (0-(4.56614)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm2, leftArm2.rotateAngleX + (float) Math.toRadians(xx), leftArm2.rotateAngleY + (float) Math.toRadians(yy), leftArm2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 18.40422 + (((tickAnim - 0) / 6) * (20.54129-(18.40422)));
            yy = 3.77732 + (((tickAnim - 0) / 6) * (8.70776-(3.77732)));
            zz = -7.71921 + (((tickAnim - 0) / 6) * (-16.68001-(-7.71921)));
        }
        else if (tickAnim >= 6 && tickAnim < 13) {
            xx = 20.54129 + (((tickAnim - 6) / 7) * (71.05778-(20.54129)));
            yy = 8.70776 + (((tickAnim - 6) / 7) * (-4.8023-(8.70776)));
            zz = -16.68001 + (((tickAnim - 6) / 7) * (-1.67062-(-16.68001)));
        }
        else if (tickAnim >= 13 && tickAnim < 22) {
            xx = 71.05778 + (((tickAnim - 13) / 9) * (9.58433-(71.05778)));
            yy = -4.8023 + (((tickAnim - 13) / 9) * (-13.00878-(-4.8023)));
            zz = -1.67062 + (((tickAnim - 13) / 9) * (-7.56857-(-1.67062)));
        }
        else if (tickAnim >= 22 && tickAnim < 23) {
            xx = 9.58433 + (((tickAnim - 22) / 1) * (7.99577-(9.58433)));
            yy = -13.00878 + (((tickAnim - 22) / 1) * (-13.66847-(-13.00878)));
            zz = -7.56857 + (((tickAnim - 22) / 1) * (-6.87618-(-7.56857)));
        }
        else if (tickAnim >= 23 && tickAnim < 40) {
            xx = 7.99577 + (((tickAnim - 23) / 17) * (18.40422-(7.99577)));
            yy = -13.66847 + (((tickAnim - 23) / 17) * (3.77732-(-13.66847)));
            zz = -6.87618 + (((tickAnim - 23) / 17) * (-7.71921-(-6.87618)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm3, leftArm3.rotateAngleX + (float) Math.toRadians(xx), leftArm3.rotateAngleY + (float) Math.toRadians(yy), leftArm3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 6) {
            xx = -0.475 + (((tickAnim - 0) / 6) * (-0.475-(-0.475)));
            yy = 1.55 + (((tickAnim - 0) / 6) * (1.1-(1.55)));
            zz = 0 + (((tickAnim - 0) / 6) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 13) {
            xx = -0.475 + (((tickAnim - 6) / 7) * (0.13-(-0.475)));
            yy = 1.1 + (((tickAnim - 6) / 7) * (0.395-(1.1)));
            zz = 0 + (((tickAnim - 6) / 7) * (-0.55-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 22) {
            xx = 0.13 + (((tickAnim - 13) / 9) * (0.275-(0.13)));
            yy = 0.395 + (((tickAnim - 13) / 9) * (1.045-(0.395)));
            zz = -0.55 + (((tickAnim - 13) / 9) * (0-(-0.55)));
        }
        else if (tickAnim >= 22 && tickAnim < 23) {
            xx = 0.275 + (((tickAnim - 22) / 1) * (0-(0.275)));
            yy = 1.045 + (((tickAnim - 22) / 1) * (0.775-(1.045)));
            zz = 0 + (((tickAnim - 22) / 1) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 23) / 17) * (-0.475-(0)));
            yy = 0.775 + (((tickAnim - 23) / 17) * (1.55-(0.775)));
            zz = 0 + (((tickAnim - 23) / 17) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftArm3.rotationPointX = this.leftArm3.rotationPointX + (float)(xx);
        this.leftArm3.rotationPointY = this.leftArm3.rotationPointY - (float)(yy);
        this.leftArm3.rotationPointZ = this.leftArm3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 23) {
            xx = 10.73257 + (((tickAnim - 0) / 23) * (7.85463-(10.73257)));
            yy = 1.96004 + (((tickAnim - 0) / 23) * (-11.43261-(1.96004)));
            zz = -9.39344 + (((tickAnim - 0) / 23) * (12.81946-(-9.39344)));
        }
        else if (tickAnim >= 23 && tickAnim < 32) {
            xx = 7.85463 + (((tickAnim - 23) / 9) * (16.86212-(7.85463)));
            yy = -11.43261 + (((tickAnim - 23) / 9) * (-4.41741-(-11.43261)));
            zz = 12.81946 + (((tickAnim - 23) / 9) * (1.18413-(12.81946)));
        }
        else if (tickAnim >= 32 && tickAnim < 40) {
            xx = 16.86212 + (((tickAnim - 32) / 8) * (10.73257-(16.86212)));
            yy = -4.41741 + (((tickAnim - 32) / 8) * (1.96004-(-4.41741)));
            zz = 1.18413 + (((tickAnim - 32) / 8) * (-9.39344-(1.18413)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm, rightArm.rotateAngleX + (float) Math.toRadians(xx), rightArm.rotateAngleY + (float) Math.toRadians(yy), rightArm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 23) {
            xx = -22.76049 + (((tickAnim - 0) / 23) * (-24.25-(-22.76049)));
            yy = -4.99423 + (((tickAnim - 0) / 23) * (0-(-4.99423)));
            zz = 0.2405 + (((tickAnim - 0) / 23) * (0-(0.2405)));
        }
        else if (tickAnim >= 23 && tickAnim < 32) {
            xx = -24.25 + (((tickAnim - 23) / 9) * (-60.46978-(-24.25)));
            yy = 0 + (((tickAnim - 23) / 9) * (-2.61602-(0)));
            zz = 0 + (((tickAnim - 23) / 9) * (0.12598-(0)));
        }
        else if (tickAnim >= 32 && tickAnim < 40) {
            xx = -60.46978 + (((tickAnim - 32) / 8) * (-22.76049-(-60.46978)));
            yy = -2.61602 + (((tickAnim - 32) / 8) * (-4.99423-(-2.61602)));
            zz = 0.12598 + (((tickAnim - 32) / 8) * (0.2405-(0.12598)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm2, rightArm2.rotateAngleX + (float) Math.toRadians(xx), rightArm2.rotateAngleY + (float) Math.toRadians(yy), rightArm2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 23) {
            xx = 15.29393 + (((tickAnim - 0) / 23) * (15.08433-(15.29393)));
            yy = -4.27613 + (((tickAnim - 0) / 23) * (12.10619-(-4.27613)));
            zz = 13.12564 + (((tickAnim - 0) / 23) * (6.23358-(13.12564)));
        }
        else if (tickAnim >= 23 && tickAnim < 32) {
            xx = 15.08433 + (((tickAnim - 23) / 9) * (69.9797-(15.08433)));
            yy = 12.10619 + (((tickAnim - 23) / 9) * (-18.41281-(12.10619)));
            zz = 6.23358 + (((tickAnim - 23) / 9) * (9.45109-(6.23358)));
        }
        else if (tickAnim >= 32 && tickAnim < 40) {
            xx = 69.9797 + (((tickAnim - 32) / 8) * (15.29393-(69.9797)));
            yy = -18.41281 + (((tickAnim - 32) / 8) * (-4.27613-(-18.41281)));
            zz = 9.45109 + (((tickAnim - 32) / 8) * (13.12564-(9.45109)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm3, rightArm3.rotateAngleX + (float) Math.toRadians(xx), rightArm3.rotateAngleY + (float) Math.toRadians(yy), rightArm3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 0) / 23) * (0-(0)));
            yy = 1.15 + (((tickAnim - 0) / 23) * (1.55-(1.15)));
            zz = 0 + (((tickAnim - 0) / 23) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 32) {
            xx = 0 + (((tickAnim - 23) / 9) * (0-(0)));
            yy = 1.55 + (((tickAnim - 23) / 9) * (0.575-(1.55)));
            zz = 0 + (((tickAnim - 23) / 9) * (-0.35-(0)));
        }
        else if (tickAnim >= 32 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 32) / 8) * (0-(0)));
            yy = 0.575 + (((tickAnim - 32) / 8) * (1.15-(0.575)));
            zz = -0.35 + (((tickAnim - 32) / 8) * (0-(-0.35)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightArm3.rotationPointX = this.rightArm3.rotationPointX + (float)(xx);
        this.rightArm3.rotationPointY = this.rightArm3.rotationPointY - (float)(yy);
        this.rightArm3.rotationPointZ = this.rightArm3.rotationPointZ + (float)(zz);



        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(0.03094), neck.rotateAngleY + (float) Math.toRadians(-3.2006+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180+50))*-2), neck.rotateAngleZ + (float) Math.toRadians(-0.566+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180+150))*1.8));


        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(0.01678), neck2.rotateAngleY + (float) Math.toRadians(-6.1977+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180+100))*3), neck2.rotateAngleZ + (float) Math.toRadians(-0.4357+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180+250))*2));


        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(0.18141), head.rotateAngleY + (float) Math.toRadians(-9.0615+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180+180))*-4.5), head.rotateAngleZ + (float) Math.toRadians(-2.4547+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180+300))*2));

    }


    public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        EntityPrehistoricFloraSpicomellus e = (EntityPrehistoricFloraSpicomellus) entity;
        animator.update(entity);

        animator.setAnimation(e.HURT_ANIMATION);
        animator.startKeyframe(5);
        animator.rotate(this.neck, (float) Math.toRadians(-4), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.neck2, (float) Math.toRadians(-4), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.head, (float) Math.toRadians(-5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.jaw, (float) Math.toRadians(30), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(15);
        animator.resetKeyframe(10);

    }
}
