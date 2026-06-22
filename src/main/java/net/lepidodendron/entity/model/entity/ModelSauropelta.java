package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.EntityPrehistoricFloraSauropelta;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;

public class ModelSauropelta extends ModelBasePalaeopedia {
    private final AdvancedModelRenderer hips;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer HipsOsteoderms;
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
    private final AdvancedModelRenderer HipsOsteoderms2;
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
    private final AdvancedModelRenderer leftLeg1;
    private final AdvancedModelRenderer LeftLegOsteoderms;
    private final AdvancedModelRenderer cube_r26;
    private final AdvancedModelRenderer cube_r27;
    private final AdvancedModelRenderer cube_r28;
    private final AdvancedModelRenderer cube_r29;
    private final AdvancedModelRenderer cube_r30;
    private final AdvancedModelRenderer cube_r31;
    private final AdvancedModelRenderer leftLeg2;
    private final AdvancedModelRenderer leftLeg3;
    private final AdvancedModelRenderer leftFoot;
    private final AdvancedModelRenderer rightLeg1;
    private final AdvancedModelRenderer RightLegOsteoderms;
    private final AdvancedModelRenderer cube_r32;
    private final AdvancedModelRenderer cube_r33;
    private final AdvancedModelRenderer cube_r34;
    private final AdvancedModelRenderer cube_r35;
    private final AdvancedModelRenderer cube_r36;
    private final AdvancedModelRenderer cube_r37;
    private final AdvancedModelRenderer rightLeg2;
    private final AdvancedModelRenderer rightLeg3;
    private final AdvancedModelRenderer rightFoot;
    private final AdvancedModelRenderer tail1;
    private final AdvancedModelRenderer TailOsteoderms1;
    private final AdvancedModelRenderer cube_r38;
    private final AdvancedModelRenderer cube_r39;
    private final AdvancedModelRenderer cube_r40;
    private final AdvancedModelRenderer cube_r41;
    private final AdvancedModelRenderer cube_r42;
    private final AdvancedModelRenderer cube_r43;
    private final AdvancedModelRenderer cube_r44;
    private final AdvancedModelRenderer cube_r45;
    private final AdvancedModelRenderer cube_r46;
    private final AdvancedModelRenderer TailOsteoderms5;
    private final AdvancedModelRenderer cube_r47;
    private final AdvancedModelRenderer cube_r48;
    private final AdvancedModelRenderer cube_r49;
    private final AdvancedModelRenderer cube_r50;
    private final AdvancedModelRenderer cube_r51;
    private final AdvancedModelRenderer cube_r52;
    private final AdvancedModelRenderer cube_r53;
    private final AdvancedModelRenderer cube_r54;
    private final AdvancedModelRenderer cube_r55;
    private final AdvancedModelRenderer tail2;
    private final AdvancedModelRenderer TailOsteoderms2;
    private final AdvancedModelRenderer cube_r56;
    private final AdvancedModelRenderer cube_r57;
    private final AdvancedModelRenderer cube_r58;
    private final AdvancedModelRenderer cube_r59;
    private final AdvancedModelRenderer cube_r60;
    private final AdvancedModelRenderer cube_r61;
    private final AdvancedModelRenderer cube_r62;
    private final AdvancedModelRenderer cube_r63;
    private final AdvancedModelRenderer TailOsteoderms6;
    private final AdvancedModelRenderer cube_r64;
    private final AdvancedModelRenderer cube_r65;
    private final AdvancedModelRenderer cube_r66;
    private final AdvancedModelRenderer cube_r67;
    private final AdvancedModelRenderer cube_r68;
    private final AdvancedModelRenderer cube_r69;
    private final AdvancedModelRenderer cube_r70;
    private final AdvancedModelRenderer cube_r71;
    private final AdvancedModelRenderer tail3;
    private final AdvancedModelRenderer TailOsteoderms3;
    private final AdvancedModelRenderer cube_r72;
    private final AdvancedModelRenderer cube_r73;
    private final AdvancedModelRenderer cube_r74;
    private final AdvancedModelRenderer cube_r75;
    private final AdvancedModelRenderer TailOsteoderms7;
    private final AdvancedModelRenderer cube_r76;
    private final AdvancedModelRenderer cube_r77;
    private final AdvancedModelRenderer cube_r78;
    private final AdvancedModelRenderer cube_r79;
    private final AdvancedModelRenderer cube_r80;
    private final AdvancedModelRenderer cube_r81;
    private final AdvancedModelRenderer cube_r82;
    private final AdvancedModelRenderer cube_r83;
    private final AdvancedModelRenderer tail4;
    private final AdvancedModelRenderer TailOsteoderms4;
    private final AdvancedModelRenderer cube_r84;
    private final AdvancedModelRenderer cube_r85;
    private final AdvancedModelRenderer cube_r86;
    private final AdvancedModelRenderer cube_r87;
    private final AdvancedModelRenderer cube_r88;
    private final AdvancedModelRenderer cube_r89;
    private final AdvancedModelRenderer cube_r90;
    private final AdvancedModelRenderer cube_r91;
    private final AdvancedModelRenderer TailOsteoderms8;
    private final AdvancedModelRenderer cube_r92;
    private final AdvancedModelRenderer cube_r93;
    private final AdvancedModelRenderer cube_r94;
    private final AdvancedModelRenderer cube_r95;
    private final AdvancedModelRenderer cube_r96;
    private final AdvancedModelRenderer cube_r97;
    private final AdvancedModelRenderer cube_r98;
    private final AdvancedModelRenderer body;
    private final AdvancedModelRenderer BodyOsteoderms;
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
    private final AdvancedModelRenderer BodyOsteoderms2;
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
    private final AdvancedModelRenderer cube_r137;
    private final AdvancedModelRenderer cube_r138;
    private final AdvancedModelRenderer cube_r139;
    private final AdvancedModelRenderer cube_r140;
    private final AdvancedModelRenderer cube_r141;
    private final AdvancedModelRenderer cube_r142;
    private final AdvancedModelRenderer cube_r143;
    private final AdvancedModelRenderer cube_r144;
    private final AdvancedModelRenderer cube_r145;
    private final AdvancedModelRenderer cube_r146;
    private final AdvancedModelRenderer chest;
    private final AdvancedModelRenderer ChestOsteoderms;
    private final AdvancedModelRenderer cube_r147;
    private final AdvancedModelRenderer cube_r148;
    private final AdvancedModelRenderer cube_r149;
    private final AdvancedModelRenderer cube_r150;
    private final AdvancedModelRenderer cube_r151;
    private final AdvancedModelRenderer cube_r152;
    private final AdvancedModelRenderer cube_r153;
    private final AdvancedModelRenderer cube_r154;
    private final AdvancedModelRenderer cube_r155;
    private final AdvancedModelRenderer cube_r156;
    private final AdvancedModelRenderer cube_r157;
    private final AdvancedModelRenderer cube_r158;
    private final AdvancedModelRenderer cube_r159;
    private final AdvancedModelRenderer cube_r160;
    private final AdvancedModelRenderer cube_r161;
    private final AdvancedModelRenderer cube_r162;
    private final AdvancedModelRenderer cube_r163;
    private final AdvancedModelRenderer cube_r164;
    private final AdvancedModelRenderer cube_r165;
    private final AdvancedModelRenderer cube_r166;
    private final AdvancedModelRenderer ChestOsteoderms2;
    private final AdvancedModelRenderer cube_r167;
    private final AdvancedModelRenderer cube_r168;
    private final AdvancedModelRenderer cube_r169;
    private final AdvancedModelRenderer cube_r170;
    private final AdvancedModelRenderer cube_r171;
    private final AdvancedModelRenderer cube_r172;
    private final AdvancedModelRenderer cube_r173;
    private final AdvancedModelRenderer cube_r174;
    private final AdvancedModelRenderer cube_r175;
    private final AdvancedModelRenderer cube_r176;
    private final AdvancedModelRenderer cube_r177;
    private final AdvancedModelRenderer cube_r178;
    private final AdvancedModelRenderer cube_r179;
    private final AdvancedModelRenderer cube_r180;
    private final AdvancedModelRenderer cube_r181;
    private final AdvancedModelRenderer cube_r182;
    private final AdvancedModelRenderer cube_r183;
    private final AdvancedModelRenderer cube_r184;
    private final AdvancedModelRenderer cube_r185;
    private final AdvancedModelRenderer cube_r186;
    private final AdvancedModelRenderer leftArm1;
    private final AdvancedModelRenderer LeftArmOsteoderms1;
    private final AdvancedModelRenderer cube_r187;
    private final AdvancedModelRenderer cube_r188;
    private final AdvancedModelRenderer cube_r189;
    private final AdvancedModelRenderer cube_r190;
    private final AdvancedModelRenderer cube_r191;
    private final AdvancedModelRenderer leftArm2;
    private final AdvancedModelRenderer LeftArmOsteoderms2;
    private final AdvancedModelRenderer cube_r192;
    private final AdvancedModelRenderer cube_r193;
    private final AdvancedModelRenderer leftHand;
    private final AdvancedModelRenderer rightArm1;
    private final AdvancedModelRenderer RightArmOsteoderms1;
    private final AdvancedModelRenderer cube_r194;
    private final AdvancedModelRenderer cube_r195;
    private final AdvancedModelRenderer cube_r196;
    private final AdvancedModelRenderer cube_r197;
    private final AdvancedModelRenderer cube_r198;
    private final AdvancedModelRenderer rightArm2;
    private final AdvancedModelRenderer RightArmOsteoderms2;
    private final AdvancedModelRenderer cube_r199;
    private final AdvancedModelRenderer cube_r200;
    private final AdvancedModelRenderer rightHand;
    private final AdvancedModelRenderer neck1;
    private final AdvancedModelRenderer NeckOsteoderms1;
    private final AdvancedModelRenderer cube_r201;
    private final AdvancedModelRenderer cube_r202;
    private final AdvancedModelRenderer cube_r203;
    private final AdvancedModelRenderer cube_r204;
    private final AdvancedModelRenderer NeckOsteoderms6;
    private final AdvancedModelRenderer cube_r205;
    private final AdvancedModelRenderer cube_r206;
    private final AdvancedModelRenderer cube_r207;
    private final AdvancedModelRenderer cube_r208;
    private final AdvancedModelRenderer neck2;
    private final AdvancedModelRenderer NeckOsteoderms2;
    private final AdvancedModelRenderer cube_r209;
    private final AdvancedModelRenderer cube_r210;
    private final AdvancedModelRenderer cube_r211;
    private final AdvancedModelRenderer cube_r212;
    private final AdvancedModelRenderer NeckOsteoderms5;
    private final AdvancedModelRenderer cube_r213;
    private final AdvancedModelRenderer cube_r214;
    private final AdvancedModelRenderer cube_r215;
    private final AdvancedModelRenderer cube_r216;
    private final AdvancedModelRenderer neck3;
    private final AdvancedModelRenderer NeckOsteoderms3;
    private final AdvancedModelRenderer cube_r217;
    private final AdvancedModelRenderer cube_r218;
    private final AdvancedModelRenderer cube_r219;
    private final AdvancedModelRenderer cube_r220;
    private final AdvancedModelRenderer NeckOsteoderms4;
    private final AdvancedModelRenderer cube_r221;
    private final AdvancedModelRenderer cube_r222;
    private final AdvancedModelRenderer cube_r223;
    private final AdvancedModelRenderer cube_r224;
    private final AdvancedModelRenderer head;
    private final AdvancedModelRenderer cube_r225;
    private final AdvancedModelRenderer cube_r226;
    private final AdvancedModelRenderer cube_r227;
    private final AdvancedModelRenderer cube_r228;
    private final AdvancedModelRenderer cube_r229;
    private final AdvancedModelRenderer cube_r230;
    private final AdvancedModelRenderer cube_r231;
    private final AdvancedModelRenderer cube_r232;
    private final AdvancedModelRenderer cube_r233;
    private final AdvancedModelRenderer cube_r234;
    private final AdvancedModelRenderer cube_r235;
    private final AdvancedModelRenderer cube_r236;
    private final AdvancedModelRenderer cube_r237;
    private final AdvancedModelRenderer jaw;
    private final AdvancedModelRenderer cube_r238;
    private final AdvancedModelRenderer cube_r239;
    private final AdvancedModelRenderer cube_r240;
    private final AdvancedModelRenderer cube_r241;
    private final AdvancedModelRenderer cube_r242;
    private final AdvancedModelRenderer cube_r243;
    private final AdvancedModelRenderer cube_r244;
    private final AdvancedModelRenderer cube_r245;
    private final AdvancedModelRenderer throat;
    private final AdvancedModelRenderer cube_r246;

    private ModelAnimator animator;

    public ModelSauropelta() {
        this.textureWidth = 124;
        this.textureHeight = 124;

        this.hips = new AdvancedModelRenderer(this);
        this.hips.setRotationPoint(0.0F, 6.0F, 8.5F);
        this.setRotateAngle(hips, -0.0436F, 0.0F, 0.0F);
        this.hips.cubeList.add(new ModelBox(hips, 0, 46, -8.5F, -4.5F, -4.5F, 17, 12, 7, 0.0F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(-1.0F, -4.25F, 1.5F);
        this.hips.addChild(cube_r1);
        this.setRotateAngle(cube_r1, -0.3491F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 49, 26, -6.0F, 0.0F, 0.0F, 14, 10, 7, 0.0F, false));

        this.HipsOsteoderms = new AdvancedModelRenderer(this);
        this.HipsOsteoderms.setRotationPoint(6.4F, -1.45F, 5.25F);
        this.hips.addChild(HipsOsteoderms);


        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.HipsOsteoderms.addChild(cube_r2);
        this.setRotateAngle(cube_r2, -0.0262F, 0.0327F, 0.8083F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 107, 24, -1.9432F, -1.3375F, -2.6341F, 1, 1, 2, 0.0F, false));
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 21, 113, -1.4665F, -0.5227F, 0.2245F, 1, 1, 2, 0.0F, false));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(-0.75F, 0.0F, 0.0F);
        this.HipsOsteoderms.addChild(cube_r3);
        this.setRotateAngle(cube_r3, -0.0262F, 0.0327F, 0.8083F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 83, 112, -3.8417F, 0.6521F, -2.644F, 1, 1, 2, 0.0F, false));
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 112, 110, -3.3649F, 1.4669F, 0.2145F, 1, 1, 2, 0.0F, false));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.HipsOsteoderms.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.4626F, 0.0327F, 2.3333F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 77, 116, -0.5F, -0.5F, 0.0F, 1, 1, 2, 0.0F, false));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(-4.9F, -2.45F, -5.0F);
        this.HipsOsteoderms.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.2182F, -0.2182F, 0.7854F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 63, 116, -0.5F, -0.5F, 0.0F, 1, 1, 2, 0.0F, false));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(1.5F, -1.7F, -5.0F);
        this.HipsOsteoderms.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.2182F, -0.2182F, 2.3562F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 112, 59, -0.5F, -0.5F, 0.0F, 1, 1, 2, 0.0F, false));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(0.85F, -2.45F, -5.0F);
        this.HipsOsteoderms.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.2182F, -0.2182F, 0.7854F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 62, 112, -0.5F, -0.5F, 0.0F, 1, 1, 2, 0.0F, false));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(-2.15F, -2.45F, -5.0F);
        this.HipsOsteoderms.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.2182F, -0.2182F, 0.7854F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 112, 63, -0.5F, -0.5F, 0.0F, 1, 1, 2, 0.0F, false));

        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(1.5F, -1.7F, -8.0F);
        this.HipsOsteoderms.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.2182F, -0.2182F, 2.3562F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 69, 112, -0.5F, -0.5F, 0.0F, 1, 1, 2, 0.0F, false));

        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(1.1F, -2.45F, -8.0F);
        this.HipsOsteoderms.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 0.2182F, -0.2182F, 0.7854F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 76, 112, -0.5F, -0.5F, 0.0F, 1, 1, 2, 0.0F, false));

        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(-1.65F, -2.45F, -8.0F);
        this.HipsOsteoderms.addChild(cube_r11);
        this.setRotateAngle(cube_r11, 0.2182F, -0.2182F, 0.7854F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 34, 110, -0.5F, -0.5F, 0.0F, 1, 1, 2, 0.0F, false));

        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(-4.65F, -2.45F, -8.0F);
        this.HipsOsteoderms.addChild(cube_r12);
        this.setRotateAngle(cube_r12, 0.2182F, -0.2182F, 0.7854F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 70, 116, -0.5F, -0.5F, 0.0F, 1, 1, 2, 0.0F, false));

        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(1.25F, 3.7F, 1.5F);
        this.HipsOsteoderms.addChild(cube_r13);
        this.setRotateAngle(cube_r13, 0.0F, -0.7854F, 0.0F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 101, 68, -2.0F, -1.0F, 0.0F, 2, 1, 2, 0.0F, false));

        this.HipsOsteoderms2 = new AdvancedModelRenderer(this);
        this.HipsOsteoderms2.setRotationPoint(-6.4F, -1.45F, 5.25F);
        this.hips.addChild(HipsOsteoderms2);


        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.HipsOsteoderms2.addChild(cube_r14);
        this.setRotateAngle(cube_r14, -0.0262F, -0.0327F, -0.8083F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 107, 24, 0.9432F, -1.3375F, -2.6341F, 1, 1, 2, 0.0F, true));
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 21, 113, 0.4665F, -0.5227F, 0.2245F, 1, 1, 2, 0.0F, true));

        this.cube_r15 = new AdvancedModelRenderer(this);
        this.cube_r15.setRotationPoint(0.75F, 0.0F, 0.0F);
        this.HipsOsteoderms2.addChild(cube_r15);
        this.setRotateAngle(cube_r15, -0.0262F, -0.0327F, -0.8083F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 83, 112, 2.8417F, 0.6521F, -2.644F, 1, 1, 2, 0.0F, true));
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 112, 110, 2.3649F, 1.4669F, 0.2145F, 1, 1, 2, 0.0F, true));

        this.cube_r16 = new AdvancedModelRenderer(this);
        this.cube_r16.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.HipsOsteoderms2.addChild(cube_r16);
        this.setRotateAngle(cube_r16, 0.4626F, -0.0327F, -2.3333F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 77, 116, -0.5F, -0.5F, 0.0F, 1, 1, 2, 0.0F, true));

        this.cube_r17 = new AdvancedModelRenderer(this);
        this.cube_r17.setRotationPoint(4.9F, -2.45F, -5.0F);
        this.HipsOsteoderms2.addChild(cube_r17);
        this.setRotateAngle(cube_r17, 0.2182F, 0.2182F, -0.7854F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 63, 116, -0.5F, -0.5F, 0.0F, 1, 1, 2, 0.0F, true));

        this.cube_r18 = new AdvancedModelRenderer(this);
        this.cube_r18.setRotationPoint(-1.5F, -1.7F, -5.0F);
        this.HipsOsteoderms2.addChild(cube_r18);
        this.setRotateAngle(cube_r18, 0.2182F, 0.2182F, -2.3562F);
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 112, 59, -0.5F, -0.5F, 0.0F, 1, 1, 2, 0.0F, true));

        this.cube_r19 = new AdvancedModelRenderer(this);
        this.cube_r19.setRotationPoint(-0.85F, -2.45F, -5.0F);
        this.HipsOsteoderms2.addChild(cube_r19);
        this.setRotateAngle(cube_r19, 0.2182F, 0.2182F, -0.7854F);
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 62, 112, -0.5F, -0.5F, 0.0F, 1, 1, 2, 0.0F, true));

        this.cube_r20 = new AdvancedModelRenderer(this);
        this.cube_r20.setRotationPoint(2.15F, -2.45F, -5.0F);
        this.HipsOsteoderms2.addChild(cube_r20);
        this.setRotateAngle(cube_r20, 0.2182F, 0.2182F, -0.7854F);
        this.cube_r20.cubeList.add(new ModelBox(cube_r20, 112, 63, -0.5F, -0.5F, 0.0F, 1, 1, 2, 0.0F, true));

        this.cube_r21 = new AdvancedModelRenderer(this);
        this.cube_r21.setRotationPoint(-1.5F, -1.7F, -8.0F);
        this.HipsOsteoderms2.addChild(cube_r21);
        this.setRotateAngle(cube_r21, 0.2182F, 0.2182F, -2.3562F);
        this.cube_r21.cubeList.add(new ModelBox(cube_r21, 69, 112, -0.5F, -0.5F, 0.0F, 1, 1, 2, 0.0F, true));

        this.cube_r22 = new AdvancedModelRenderer(this);
        this.cube_r22.setRotationPoint(-1.1F, -2.45F, -8.0F);
        this.HipsOsteoderms2.addChild(cube_r22);
        this.setRotateAngle(cube_r22, 0.2182F, 0.2182F, -0.7854F);
        this.cube_r22.cubeList.add(new ModelBox(cube_r22, 76, 112, -0.5F, -0.5F, 0.0F, 1, 1, 2, 0.0F, true));

        this.cube_r23 = new AdvancedModelRenderer(this);
        this.cube_r23.setRotationPoint(1.65F, -2.45F, -8.0F);
        this.HipsOsteoderms2.addChild(cube_r23);
        this.setRotateAngle(cube_r23, 0.2182F, 0.2182F, -0.7854F);
        this.cube_r23.cubeList.add(new ModelBox(cube_r23, 34, 110, -0.5F, -0.5F, 0.0F, 1, 1, 2, 0.0F, true));

        this.cube_r24 = new AdvancedModelRenderer(this);
        this.cube_r24.setRotationPoint(4.65F, -2.45F, -8.0F);
        this.HipsOsteoderms2.addChild(cube_r24);
        this.setRotateAngle(cube_r24, 0.2182F, 0.2182F, -0.7854F);
        this.cube_r24.cubeList.add(new ModelBox(cube_r24, 70, 116, -0.5F, -0.5F, 0.0F, 1, 1, 2, 0.0F, true));

        this.cube_r25 = new AdvancedModelRenderer(this);
        this.cube_r25.setRotationPoint(-1.25F, 3.7F, 1.5F);
        this.HipsOsteoderms2.addChild(cube_r25);
        this.setRotateAngle(cube_r25, 0.0F, 0.7854F, 0.0F);
        this.cube_r25.cubeList.add(new ModelBox(cube_r25, 101, 68, 0.0F, -1.0F, 0.0F, 2, 1, 2, 0.0F, true));

        this.leftLeg1 = new AdvancedModelRenderer(this);
        this.leftLeg1.setRotationPoint(7.1F, 0.0F, 0.0F);
        this.hips.addChild(leftLeg1);
        this.setRotateAngle(leftLeg1, 0.0436F, -0.48F, 0.0F);
        this.leftLeg1.cubeList.add(new ModelBox(leftLeg1, 0, 66, -2.5F, -2.35F, -3.9F, 5, 12, 8, 0.0F, false));

        this.LeftLegOsteoderms = new AdvancedModelRenderer(this);
        this.LeftLegOsteoderms.setRotationPoint(4.05F, 2.25F, 0.0F);
        this.leftLeg1.addChild(LeftLegOsteoderms);


        this.cube_r26 = new AdvancedModelRenderer(this);
        this.cube_r26.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.LeftLegOsteoderms.addChild(cube_r26);
        this.setRotateAngle(cube_r26, 0.0F, -0.7854F, 0.0F);
        this.cube_r26.cubeList.add(new ModelBox(cube_r26, 55, 102, -2.0F, -1.0F, 0.0F, 2, 1, 2, 0.0F, false));

        this.cube_r27 = new AdvancedModelRenderer(this);
        this.cube_r27.setRotationPoint(0.0F, -0.25F, -3.0F);
        this.LeftLegOsteoderms.addChild(cube_r27);
        this.setRotateAngle(cube_r27, 0.0F, -0.7854F, 0.0F);
        this.cube_r27.cubeList.add(new ModelBox(cube_r27, 18, 102, -2.0F, -1.0F, 0.0F, 2, 1, 2, 0.0F, false));

        this.cube_r28 = new AdvancedModelRenderer(this);
        this.cube_r28.setRotationPoint(-2.15F, -3.4F, -3.55F);
        this.LeftLegOsteoderms.addChild(cube_r28);
        this.setRotateAngle(cube_r28, 0.2182F, -0.2182F, 2.3562F);
        this.cube_r28.cubeList.add(new ModelBox(cube_r28, 14, 110, -0.5F, -0.5F, 0.0F, 1, 1, 2, 0.0F, false));

        this.cube_r29 = new AdvancedModelRenderer(this);
        this.cube_r29.setRotationPoint(-2.15F, -3.4F, -0.85F);
        this.LeftLegOsteoderms.addChild(cube_r29);
        this.setRotateAngle(cube_r29, 0.2182F, -0.2182F, 2.3562F);
        this.cube_r29.cubeList.add(new ModelBox(cube_r29, 117, 44, -0.5F, -0.5F, 0.0F, 1, 1, 2, 0.0F, false));

        this.cube_r30 = new AdvancedModelRenderer(this);
        this.cube_r30.setRotationPoint(-2.15F, -3.4F, 1.85F);
        this.LeftLegOsteoderms.addChild(cube_r30);
        this.setRotateAngle(cube_r30, 0.2182F, -0.2182F, 2.3562F);
        this.cube_r30.cubeList.add(new ModelBox(cube_r30, 7, 110, -0.5F, -0.5F, 0.0F, 1, 1, 2, 0.0F, false));

        this.cube_r31 = new AdvancedModelRenderer(this);
        this.cube_r31.setRotationPoint(0.0F, 0.25F, 3.0F);
        this.LeftLegOsteoderms.addChild(cube_r31);
        this.setRotateAngle(cube_r31, 0.0F, -0.7854F, 0.0F);
        this.cube_r31.cubeList.add(new ModelBox(cube_r31, 91, 102, -2.0F, -1.0F, 0.0F, 2, 1, 2, 0.0F, false));

        this.leftLeg2 = new AdvancedModelRenderer(this);
        this.leftLeg2.setRotationPoint(0.0F, 8.0F, -1.5F);
        this.leftLeg1.addChild(leftLeg2);
        this.setRotateAngle(leftLeg2, 0.6109F, 0.0F, 0.0F);
        this.leftLeg2.cubeList.add(new ModelBox(leftLeg2, 27, 66, -2.0F, -0.75F, -2.25F, 4, 9, 4, 0.0F, false));

        this.leftLeg3 = new AdvancedModelRenderer(this);
        this.leftLeg3.setRotationPoint(0.0F, 7.5F, -1.0F);
        this.leftLeg2.addChild(leftLeg3);
        this.setRotateAngle(leftLeg3, -0.9163F, 0.0F, 0.0F);
        this.leftLeg3.cubeList.add(new ModelBox(leftLeg3, 92, 22, -2.0F, -2.0F, -1.0F, 4, 5, 3, -0.01F, false));

        this.leftFoot = new AdvancedModelRenderer(this);
        this.leftFoot.setRotationPoint(0.0F, 1.5F, -0.5F);
        this.leftLeg3.addChild(leftFoot);
        this.setRotateAngle(leftFoot, 0.3054F, 0.0F, 0.0F);
        this.leftFoot.cubeList.add(new ModelBox(leftFoot, 0, 87, -2.5F, 0.0F, -3.0F, 5, 2, 5, 0.0F, false));

        this.rightLeg1 = new AdvancedModelRenderer(this);
        this.rightLeg1.setRotationPoint(-7.1F, 0.0F, 0.0F);
        this.hips.addChild(rightLeg1);
        this.setRotateAngle(rightLeg1, 0.0436F, 0.48F, 0.0F);
        this.rightLeg1.cubeList.add(new ModelBox(rightLeg1, 0, 66, -2.5F, -2.35F, -3.9F, 5, 12, 8, 0.0F, true));

        this.RightLegOsteoderms = new AdvancedModelRenderer(this);
        this.RightLegOsteoderms.setRotationPoint(-4.05F, 2.25F, 0.0F);
        this.rightLeg1.addChild(RightLegOsteoderms);


        this.cube_r32 = new AdvancedModelRenderer(this);
        this.cube_r32.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.RightLegOsteoderms.addChild(cube_r32);
        this.setRotateAngle(cube_r32, 0.0F, 0.7854F, 0.0F);
        this.cube_r32.cubeList.add(new ModelBox(cube_r32, 55, 102, 0.0F, -1.0F, 0.0F, 2, 1, 2, 0.0F, true));

        this.cube_r33 = new AdvancedModelRenderer(this);
        this.cube_r33.setRotationPoint(0.0F, -0.25F, -3.0F);
        this.RightLegOsteoderms.addChild(cube_r33);
        this.setRotateAngle(cube_r33, 0.0F, 0.7854F, 0.0F);
        this.cube_r33.cubeList.add(new ModelBox(cube_r33, 18, 102, 0.0F, -1.0F, 0.0F, 2, 1, 2, 0.0F, true));

        this.cube_r34 = new AdvancedModelRenderer(this);
        this.cube_r34.setRotationPoint(2.15F, -3.4F, -3.55F);
        this.RightLegOsteoderms.addChild(cube_r34);
        this.setRotateAngle(cube_r34, 0.2182F, 0.2182F, -2.3562F);
        this.cube_r34.cubeList.add(new ModelBox(cube_r34, 14, 110, -0.5F, -0.5F, 0.0F, 1, 1, 2, 0.0F, true));

        this.cube_r35 = new AdvancedModelRenderer(this);
        this.cube_r35.setRotationPoint(2.15F, -3.4F, -0.85F);
        this.RightLegOsteoderms.addChild(cube_r35);
        this.setRotateAngle(cube_r35, 0.2182F, 0.2182F, -2.3562F);
        this.cube_r35.cubeList.add(new ModelBox(cube_r35, 117, 44, -0.5F, -0.5F, 0.0F, 1, 1, 2, 0.0F, true));

        this.cube_r36 = new AdvancedModelRenderer(this);
        this.cube_r36.setRotationPoint(2.15F, -3.4F, 1.85F);
        this.RightLegOsteoderms.addChild(cube_r36);
        this.setRotateAngle(cube_r36, 0.2182F, 0.2182F, -2.3562F);
        this.cube_r36.cubeList.add(new ModelBox(cube_r36, 7, 110, -0.5F, -0.5F, 0.0F, 1, 1, 2, 0.0F, true));

        this.cube_r37 = new AdvancedModelRenderer(this);
        this.cube_r37.setRotationPoint(0.0F, 0.25F, 3.0F);
        this.RightLegOsteoderms.addChild(cube_r37);
        this.setRotateAngle(cube_r37, 0.0F, 0.7854F, 0.0F);
        this.cube_r37.cubeList.add(new ModelBox(cube_r37, 91, 102, 0.0F, -1.0F, 0.0F, 2, 1, 2, 0.0F, true));

        this.rightLeg2 = new AdvancedModelRenderer(this);
        this.rightLeg2.setRotationPoint(0.0F, 8.0F, -1.5F);
        this.rightLeg1.addChild(rightLeg2);
        this.setRotateAngle(rightLeg2, 0.6109F, 0.0F, 0.0F);
        this.rightLeg2.cubeList.add(new ModelBox(rightLeg2, 27, 66, -2.0F, -0.75F, -2.25F, 4, 9, 4, 0.0F, true));

        this.rightLeg3 = new AdvancedModelRenderer(this);
        this.rightLeg3.setRotationPoint(0.0F, 7.5F, -1.0F);
        this.rightLeg2.addChild(rightLeg3);
        this.setRotateAngle(rightLeg3, -0.9163F, 0.0F, 0.0F);
        this.rightLeg3.cubeList.add(new ModelBox(rightLeg3, 92, 22, -2.0F, -2.0F, -1.0F, 4, 5, 3, -0.01F, true));

        this.rightFoot = new AdvancedModelRenderer(this);
        this.rightFoot.setRotationPoint(0.0F, 1.5F, -0.5F);
        this.rightLeg3.addChild(rightFoot);
        this.setRotateAngle(rightFoot, 0.3054F, 0.0F, 0.0F);
        this.rightFoot.cubeList.add(new ModelBox(rightFoot, 0, 87, -2.5F, 0.0F, -3.0F, 5, 2, 5, 0.0F, true));

        this.tail1 = new AdvancedModelRenderer(this);
        this.tail1.setRotationPoint(0.0F, 0.0F, 7.5F);
        this.hips.addChild(tail1);
        this.setRotateAngle(tail1, -0.3054F, 0.0F, 0.0F);
        this.tail1.cubeList.add(new ModelBox(tail1, 49, 44, -3.5F, -1.75F, -2.0F, 7, 6, 12, 0.0F, false));

        this.TailOsteoderms1 = new AdvancedModelRenderer(this);
        this.TailOsteoderms1.setRotationPoint(2.9F, -0.4F, 0.75F);
        this.tail1.addChild(TailOsteoderms1);


        this.cube_r38 = new AdvancedModelRenderer(this);
        this.cube_r38.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.TailOsteoderms1.addChild(cube_r38);
        this.setRotateAngle(cube_r38, 0.2182F, -0.2182F, 2.3562F);
        this.cube_r38.cubeList.add(new ModelBox(cube_r38, 106, 95, -0.5F, -0.5F, 0.0F, 1, 1, 2, 0.0F, false));

        this.cube_r39 = new AdvancedModelRenderer(this);
        this.cube_r39.setRotationPoint(-0.9F, -0.75F, 0.0F);
        this.TailOsteoderms1.addChild(cube_r39);
        this.setRotateAngle(cube_r39, 0.2182F, -0.2182F, 0.7854F);
        this.cube_r39.cubeList.add(new ModelBox(cube_r39, 113, 95, -0.5F, -0.5F, 0.0F, 1, 1, 2, 0.0F, false));

        this.cube_r40 = new AdvancedModelRenderer(this);
        this.cube_r40.setRotationPoint(-1.4F, -0.75F, 6.5F);
        this.TailOsteoderms1.addChild(cube_r40);
        this.setRotateAngle(cube_r40, 0.2182F, -0.2182F, 0.7854F);
        this.cube_r40.cubeList.add(new ModelBox(cube_r40, 7, 114, -0.5F, -0.5F, 0.0F, 1, 1, 2, 0.0F, false));

        this.cube_r41 = new AdvancedModelRenderer(this);
        this.cube_r41.setRotationPoint(0.0F, 0.0F, 6.5F);
        this.TailOsteoderms1.addChild(cube_r41);
        this.setRotateAngle(cube_r41, 0.2182F, -0.2182F, 2.3562F);
        this.cube_r41.cubeList.add(new ModelBox(cube_r41, 55, 110, -0.5F, -0.5F, 0.0F, 1, 1, 2, 0.0F, false));

        this.cube_r42 = new AdvancedModelRenderer(this);
        this.cube_r42.setRotationPoint(-1.15F, -0.75F, 3.25F);
        this.TailOsteoderms1.addChild(cube_r42);
        this.setRotateAngle(cube_r42, 0.2182F, -0.2182F, 0.7854F);
        this.cube_r42.cubeList.add(new ModelBox(cube_r42, 0, 114, -0.5F, -0.5F, 0.0F, 1, 1, 2, 0.0F, false));

        this.cube_r43 = new AdvancedModelRenderer(this);
        this.cube_r43.setRotationPoint(0.0F, 0.0F, 3.25F);
        this.TailOsteoderms1.addChild(cube_r43);
        this.setRotateAngle(cube_r43, 0.2182F, -0.2182F, 2.3562F);
        this.cube_r43.cubeList.add(new ModelBox(cube_r43, 110, 51, -0.5F, -0.5F, 0.0F, 1, 1, 2, 0.0F, false));

        this.cube_r44 = new AdvancedModelRenderer(this);
        this.cube_r44.setRotationPoint(2.0F, 2.15F, 4.25F);
        this.TailOsteoderms1.addChild(cube_r44);
        this.setRotateAngle(cube_r44, 0.0F, -0.7854F, 0.0F);
        this.cube_r44.cubeList.add(new ModelBox(cube_r44, 101, 72, -2.0F, -1.0F, 0.0F, 2, 1, 2, 0.0F, false));

        this.cube_r45 = new AdvancedModelRenderer(this);
        this.cube_r45.setRotationPoint(2.0F, 1.9F, 7.5F);
        this.TailOsteoderms1.addChild(cube_r45);
        this.setRotateAngle(cube_r45, 0.0F, -0.7854F, 0.0F);
        this.cube_r45.cubeList.add(new ModelBox(cube_r45, 0, 102, -2.0F, -1.0F, 0.0F, 2, 1, 2, 0.0F, false));

        this.cube_r46 = new AdvancedModelRenderer(this);
        this.cube_r46.setRotationPoint(2.0F, 2.65F, 1.0F);
        this.TailOsteoderms1.addChild(cube_r46);
        this.setRotateAngle(cube_r46, 0.0F, -0.7854F, 0.0F);
        this.cube_r46.cubeList.add(new ModelBox(cube_r46, 106, 88, -2.0F, -1.0F, 0.0F, 2, 1, 2, 0.0F, false));

        this.TailOsteoderms5 = new AdvancedModelRenderer(this);
        this.TailOsteoderms5.setRotationPoint(-2.9F, -0.4F, 0.75F);
        this.tail1.addChild(TailOsteoderms5);


        this.cube_r47 = new AdvancedModelRenderer(this);
        this.cube_r47.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.TailOsteoderms5.addChild(cube_r47);
        this.setRotateAngle(cube_r47, 0.2182F, 0.2182F, -2.3562F);
        this.cube_r47.cubeList.add(new ModelBox(cube_r47, 106, 95, -0.5F, -0.5F, 0.0F, 1, 1, 2, 0.0F, true));

        this.cube_r48 = new AdvancedModelRenderer(this);
        this.cube_r48.setRotationPoint(0.9F, -0.75F, 0.0F);
        this.TailOsteoderms5.addChild(cube_r48);
        this.setRotateAngle(cube_r48, 0.2182F, 0.2182F, -0.7854F);
        this.cube_r48.cubeList.add(new ModelBox(cube_r48, 113, 95, -0.5F, -0.5F, 0.0F, 1, 1, 2, 0.0F, true));

        this.cube_r49 = new AdvancedModelRenderer(this);
        this.cube_r49.setRotationPoint(1.4F, -0.75F, 6.5F);
        this.TailOsteoderms5.addChild(cube_r49);
        this.setRotateAngle(cube_r49, 0.2182F, 0.2182F, -0.7854F);
        this.cube_r49.cubeList.add(new ModelBox(cube_r49, 7, 114, -0.5F, -0.5F, 0.0F, 1, 1, 2, 0.0F, true));

        this.cube_r50 = new AdvancedModelRenderer(this);
        this.cube_r50.setRotationPoint(0.0F, 0.0F, 6.5F);
        this.TailOsteoderms5.addChild(cube_r50);
        this.setRotateAngle(cube_r50, 0.2182F, 0.2182F, -2.3562F);
        this.cube_r50.cubeList.add(new ModelBox(cube_r50, 55, 110, -0.5F, -0.5F, 0.0F, 1, 1, 2, 0.0F, true));

        this.cube_r51 = new AdvancedModelRenderer(this);
        this.cube_r51.setRotationPoint(1.15F, -0.75F, 3.25F);
        this.TailOsteoderms5.addChild(cube_r51);
        this.setRotateAngle(cube_r51, 0.2182F, 0.2182F, -0.7854F);
        this.cube_r51.cubeList.add(new ModelBox(cube_r51, 0, 114, -0.5F, -0.5F, 0.0F, 1, 1, 2, 0.0F, true));

        this.cube_r52 = new AdvancedModelRenderer(this);
        this.cube_r52.setRotationPoint(0.0F, 0.0F, 3.25F);
        this.TailOsteoderms5.addChild(cube_r52);
        this.setRotateAngle(cube_r52, 0.2182F, 0.2182F, -2.3562F);
        this.cube_r52.cubeList.add(new ModelBox(cube_r52, 110, 51, -0.5F, -0.5F, 0.0F, 1, 1, 2, 0.0F, true));

        this.cube_r53 = new AdvancedModelRenderer(this);
        this.cube_r53.setRotationPoint(-2.0F, 2.15F, 4.25F);
        this.TailOsteoderms5.addChild(cube_r53);
        this.setRotateAngle(cube_r53, 0.0F, 0.7854F, 0.0F);
        this.cube_r53.cubeList.add(new ModelBox(cube_r53, 101, 72, 0.0F, -1.0F, 0.0F, 2, 1, 2, 0.0F, true));

        this.cube_r54 = new AdvancedModelRenderer(this);
        this.cube_r54.setRotationPoint(-2.0F, 1.9F, 7.5F);
        this.TailOsteoderms5.addChild(cube_r54);
        this.setRotateAngle(cube_r54, 0.0F, 0.7854F, 0.0F);
        this.cube_r54.cubeList.add(new ModelBox(cube_r54, 0, 102, 0.0F, -1.0F, 0.0F, 2, 1, 2, 0.0F, true));

        this.cube_r55 = new AdvancedModelRenderer(this);
        this.cube_r55.setRotationPoint(-2.0F, 2.65F, 1.0F);
        this.TailOsteoderms5.addChild(cube_r55);
        this.setRotateAngle(cube_r55, 0.0F, 0.7854F, 0.0F);
        this.cube_r55.cubeList.add(new ModelBox(cube_r55, 106, 88, 0.0F, -1.0F, 0.0F, 2, 1, 2, 0.0F, true));

        this.tail2 = new AdvancedModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, 0.0F, 10.0F);
        this.tail1.addChild(tail2);
        this.setRotateAngle(tail2, 0.1745F, 0.0F, 0.0F);
        this.tail2.cubeList.add(new ModelBox(tail2, 49, 63, -2.0F, -1.5F, -1.0F, 4, 4, 12, 0.0F, false));

        this.TailOsteoderms2 = new AdvancedModelRenderer(this);
        this.TailOsteoderms2.setRotationPoint(3.2F, 0.75F, 6.75F);
        this.tail2.addChild(TailOsteoderms2);


        this.cube_r56 = new AdvancedModelRenderer(this);
        this.cube_r56.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.TailOsteoderms2.addChild(cube_r56);
        this.setRotateAngle(cube_r56, 0.0F, -0.7854F, 0.0F);
        this.cube_r56.cubeList.add(new ModelBox(cube_r56, 91, 106, -2.0F, -1.0F, 0.0F, 2, 1, 2, 0.0F, false));

        this.cube_r57 = new AdvancedModelRenderer(this);
        this.cube_r57.setRotationPoint(-0.1F, -0.25F, 2.8F);
        this.TailOsteoderms2.addChild(cube_r57);
        this.setRotateAngle(cube_r57, 0.0F, -0.7854F, 0.0F);
        this.cube_r57.cubeList.add(new ModelBox(cube_r57, 9, 102, -2.0F, -1.0F, 0.0F, 2, 1, 2, 0.0F, false));

        this.cube_r58 = new AdvancedModelRenderer(this);
        this.cube_r58.setRotationPoint(0.1F, 0.25F, -3.0F);
        this.TailOsteoderms2.addChild(cube_r58);
        this.setRotateAngle(cube_r58, 0.0F, -0.7854F, 0.0F);
        this.cube_r58.cubeList.add(new ModelBox(cube_r58, 27, 105, -2.0F, -1.0F, 0.0F, 2, 1, 2, 0.0F, false));

        this.cube_r59 = new AdvancedModelRenderer(this);
        this.cube_r59.setRotationPoint(0.2F, 0.5F, -6.0F);
        this.TailOsteoderms2.addChild(cube_r59);
        this.setRotateAngle(cube_r59, 0.0F, -0.7854F, 0.0F);
        this.cube_r59.cubeList.add(new ModelBox(cube_r59, 36, 106, -2.0F, -1.0F, 0.0F, 2, 1, 2, 0.0F, false));

        this.cube_r60 = new AdvancedModelRenderer(this);
        this.cube_r60.setRotationPoint(-2.45F, -1.65F, 1.75F);
        this.TailOsteoderms2.addChild(cube_r60);
        this.setRotateAngle(cube_r60, 0.2182F, -0.2182F, 0.7854F);
        this.cube_r60.cubeList.add(new ModelBox(cube_r60, 114, 16, -0.5F, -0.5F, 0.0F, 1, 1, 2, 0.0F, false));

        this.cube_r61 = new AdvancedModelRenderer(this);
        this.cube_r61.setRotationPoint(-2.2F, -1.65F, -1.25F);
        this.TailOsteoderms2.addChild(cube_r61);
        this.setRotateAngle(cube_r61, 0.2182F, -0.2182F, 0.7854F);
        this.cube_r61.cubeList.add(new ModelBox(cube_r61, 114, 12, -0.5F, -0.5F, 0.0F, 1, 1, 2, 0.0F, false));

        this.cube_r62 = new AdvancedModelRenderer(this);
        this.cube_r62.setRotationPoint(-1.95F, -1.65F, -4.25F);
        this.TailOsteoderms2.addChild(cube_r62);
        this.setRotateAngle(cube_r62, 0.2182F, -0.2182F, 0.7854F);
        this.cube_r62.cubeList.add(new ModelBox(cube_r62, 21, 117, -0.5F, -0.5F, 0.0F, 1, 1, 2, 0.0F, false));

        this.cube_r63 = new AdvancedModelRenderer(this);
        this.cube_r63.setRotationPoint(-1.95F, -1.65F, -7.0F);
        this.TailOsteoderms2.addChild(cube_r63);
        this.setRotateAngle(cube_r63, 0.2182F, -0.2182F, 0.7854F);
        this.cube_r63.cubeList.add(new ModelBox(cube_r63, 14, 114, -0.5F, -0.5F, 0.0F, 1, 1, 2, 0.0F, false));

        this.TailOsteoderms6 = new AdvancedModelRenderer(this);
        this.TailOsteoderms6.setRotationPoint(-3.2F, 0.75F, 6.75F);
        this.tail2.addChild(TailOsteoderms6);


        this.cube_r64 = new AdvancedModelRenderer(this);
        this.cube_r64.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.TailOsteoderms6.addChild(cube_r64);
        this.setRotateAngle(cube_r64, 0.0F, 0.7854F, 0.0F);
        this.cube_r64.cubeList.add(new ModelBox(cube_r64, 91, 106, 0.0F, -1.0F, 0.0F, 2, 1, 2, 0.0F, true));

        this.cube_r65 = new AdvancedModelRenderer(this);
        this.cube_r65.setRotationPoint(0.1F, -0.25F, 2.8F);
        this.TailOsteoderms6.addChild(cube_r65);
        this.setRotateAngle(cube_r65, 0.0F, 0.7854F, 0.0F);
        this.cube_r65.cubeList.add(new ModelBox(cube_r65, 9, 102, 0.0F, -1.0F, 0.0F, 2, 1, 2, 0.0F, true));

        this.cube_r66 = new AdvancedModelRenderer(this);
        this.cube_r66.setRotationPoint(-0.1F, 0.25F, -3.0F);
        this.TailOsteoderms6.addChild(cube_r66);
        this.setRotateAngle(cube_r66, 0.0F, 0.7854F, 0.0F);
        this.cube_r66.cubeList.add(new ModelBox(cube_r66, 27, 105, 0.0F, -1.0F, 0.0F, 2, 1, 2, 0.0F, true));

        this.cube_r67 = new AdvancedModelRenderer(this);
        this.cube_r67.setRotationPoint(-0.2F, 0.5F, -6.0F);
        this.TailOsteoderms6.addChild(cube_r67);
        this.setRotateAngle(cube_r67, 0.0F, 0.7854F, 0.0F);
        this.cube_r67.cubeList.add(new ModelBox(cube_r67, 36, 106, 0.0F, -1.0F, 0.0F, 2, 1, 2, 0.0F, true));

        this.cube_r68 = new AdvancedModelRenderer(this);
        this.cube_r68.setRotationPoint(2.45F, -1.65F, 1.75F);
        this.TailOsteoderms6.addChild(cube_r68);
        this.setRotateAngle(cube_r68, 0.2182F, 0.2182F, -0.7854F);
        this.cube_r68.cubeList.add(new ModelBox(cube_r68, 114, 16, -0.5F, -0.5F, 0.0F, 1, 1, 2, 0.0F, true));

        this.cube_r69 = new AdvancedModelRenderer(this);
        this.cube_r69.setRotationPoint(2.2F, -1.65F, -1.25F);
        this.TailOsteoderms6.addChild(cube_r69);
        this.setRotateAngle(cube_r69, 0.2182F, 0.2182F, -0.7854F);
        this.cube_r69.cubeList.add(new ModelBox(cube_r69, 114, 12, -0.5F, -0.5F, 0.0F, 1, 1, 2, 0.0F, true));

        this.cube_r70 = new AdvancedModelRenderer(this);
        this.cube_r70.setRotationPoint(1.95F, -1.65F, -4.25F);
        this.TailOsteoderms6.addChild(cube_r70);
        this.setRotateAngle(cube_r70, 0.2182F, 0.2182F, -0.7854F);
        this.cube_r70.cubeList.add(new ModelBox(cube_r70, 21, 117, -0.5F, -0.5F, 0.0F, 1, 1, 2, 0.0F, true));

        this.cube_r71 = new AdvancedModelRenderer(this);
        this.cube_r71.setRotationPoint(1.95F, -1.65F, -7.0F);
        this.TailOsteoderms6.addChild(cube_r71);
        this.setRotateAngle(cube_r71, 0.2182F, 0.2182F, -0.7854F);
        this.cube_r71.cubeList.add(new ModelBox(cube_r71, 14, 114, -0.5F, -0.5F, 0.0F, 1, 1, 2, 0.0F, true));

        this.tail3 = new AdvancedModelRenderer(this);
        this.tail3.setRotationPoint(0.0F, -0.25F, 11.0F);
        this.tail2.addChild(tail3);
        this.setRotateAngle(tail3, 0.1309F, 0.0F, 0.0F);
        this.tail3.cubeList.add(new ModelBox(tail3, 27, 80, -1.5F, -1.0F, -1.0F, 3, 3, 12, 0.0F, false));

        this.TailOsteoderms3 = new AdvancedModelRenderer(this);
        this.TailOsteoderms3.setRotationPoint(2.65F, 0.75F, 1.55F);
        this.tail3.addChild(TailOsteoderms3);


        this.cube_r72 = new AdvancedModelRenderer(this);
        this.cube_r72.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.TailOsteoderms3.addChild(cube_r72);
        this.setRotateAngle(cube_r72, 0.0F, -0.7854F, 0.0F);
        this.cube_r72.cubeList.add(new ModelBox(cube_r72, 54, 106, -2.0F, -1.0F, 0.0F, 2, 1, 2, 0.0F, false));

        this.cube_r73 = new AdvancedModelRenderer(this);
        this.cube_r73.setRotationPoint(-0.25F, 0.0F, 3.2F);
        this.TailOsteoderms3.addChild(cube_r73);
        this.setRotateAngle(cube_r73, 0.0F, -0.7854F, 0.0F);
        this.cube_r73.cubeList.add(new ModelBox(cube_r73, 45, 106, -2.0F, -1.0F, 0.0F, 2, 1, 2, 0.0F, false));

        this.cube_r74 = new AdvancedModelRenderer(this);
        this.cube_r74.setRotationPoint(-0.5F, 0.0F, 8.7F);
        this.TailOsteoderms3.addChild(cube_r74);
        this.setRotateAngle(cube_r74, 0.0F, -0.7854F, 0.0F);
        this.cube_r74.cubeList.add(new ModelBox(cube_r74, 21, 90, -1.0F, -1.0F, 0.0F, 1, 1, 1, 0.0F, false));

        this.cube_r75 = new AdvancedModelRenderer(this);
        this.cube_r75.setRotationPoint(-0.5F, 0.0F, 5.95F);
        this.TailOsteoderms3.addChild(cube_r75);
        this.setRotateAngle(cube_r75, 0.0F, -0.7854F, 0.0F);
        this.cube_r75.cubeList.add(new ModelBox(cube_r75, 21, 87, -1.0F, -1.0F, 0.0F, 1, 1, 1, 0.0F, false));

        this.TailOsteoderms7 = new AdvancedModelRenderer(this);
        this.TailOsteoderms7.setRotationPoint(-2.65F, 0.75F, 1.55F);
        this.tail3.addChild(TailOsteoderms7);


        this.cube_r76 = new AdvancedModelRenderer(this);
        this.cube_r76.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.TailOsteoderms7.addChild(cube_r76);
        this.setRotateAngle(cube_r76, 0.0F, 0.7854F, 0.0F);
        this.cube_r76.cubeList.add(new ModelBox(cube_r76, 54, 106, 0.0F, -1.0F, 0.0F, 2, 1, 2, 0.0F, true));

        this.cube_r77 = new AdvancedModelRenderer(this);
        this.cube_r77.setRotationPoint(0.25F, 0.0F, 3.2F);
        this.TailOsteoderms7.addChild(cube_r77);
        this.setRotateAngle(cube_r77, 0.0F, 0.7854F, 0.0F);
        this.cube_r77.cubeList.add(new ModelBox(cube_r77, 45, 106, 0.0F, -1.0F, 0.0F, 2, 1, 2, 0.0F, true));

        this.cube_r78 = new AdvancedModelRenderer(this);
        this.cube_r78.setRotationPoint(0.5F, 0.0F, 8.7F);
        this.TailOsteoderms7.addChild(cube_r78);
        this.setRotateAngle(cube_r78, 0.0F, 0.7854F, 0.0F);
        this.cube_r78.cubeList.add(new ModelBox(cube_r78, 21, 90, 0.0F, -1.0F, 0.0F, 1, 1, 1, 0.0F, true));

        this.cube_r79 = new AdvancedModelRenderer(this);
        this.cube_r79.setRotationPoint(0.5F, 0.0F, 5.95F);
        this.TailOsteoderms7.addChild(cube_r79);
        this.setRotateAngle(cube_r79, 0.0F, 0.7854F, 0.0F);
        this.cube_r79.cubeList.add(new ModelBox(cube_r79, 21, 87, 0.0F, -1.0F, 0.0F, 1, 1, 1, 0.0F, true));

        this.cube_r80 = new AdvancedModelRenderer(this);
        this.cube_r80.setRotationPoint(2.65F, -1.15F, 7.45F);
        this.TailOsteoderms7.addChild(cube_r80);
        this.setRotateAngle(cube_r80, 0.2182F, 0.2182F, -0.7854F);
        this.cube_r80.cubeList.add(new ModelBox(cube_r80, 114, 28, -0.5F, -0.5F, 0.0F, 1, 1, 2, 0.0F, true));

        this.cube_r81 = new AdvancedModelRenderer(this);
        this.cube_r81.setRotationPoint(2.65F, -1.15F, 4.7F);
        this.TailOsteoderms7.addChild(cube_r81);
        this.setRotateAngle(cube_r81, 0.2182F, 0.2182F, -0.7854F);
        this.cube_r81.cubeList.add(new ModelBox(cube_r81, 28, 114, -0.5F, -0.5F, 0.0F, 1, 1, 2, 0.0F, true));

        this.cube_r82 = new AdvancedModelRenderer(this);
        this.cube_r82.setRotationPoint(2.65F, -1.15F, 1.95F);
        this.TailOsteoderms7.addChild(cube_r82);
        this.setRotateAngle(cube_r82, 0.2182F, 0.2182F, -0.7854F);
        this.cube_r82.cubeList.add(new ModelBox(cube_r82, 114, 24, -0.5F, -0.5F, 0.0F, 1, 1, 2, 0.0F, true));

        this.cube_r83 = new AdvancedModelRenderer(this);
        this.cube_r83.setRotationPoint(2.65F, -1.15F, -1.05F);
        this.TailOsteoderms7.addChild(cube_r83);
        this.setRotateAngle(cube_r83, 0.2182F, 0.2182F, -0.7854F);
        this.cube_r83.cubeList.add(new ModelBox(cube_r83, 114, 20, -0.5F, -0.5F, 0.0F, 1, 1, 2, 0.0F, true));

        this.tail4 = new AdvancedModelRenderer(this);
        this.tail4.setRotationPoint(-0.5F, 0.25F, 11.0F);
        this.tail3.addChild(tail4);
        this.setRotateAngle(tail4, 0.1309F, 0.0F, 0.0F);
        this.tail4.cubeList.add(new ModelBox(tail4, 58, 80, -0.5F, -1.0F, -1.0F, 2, 2, 13, 0.0F, false));

        this.TailOsteoderms4 = new AdvancedModelRenderer(this);
        this.TailOsteoderms4.setRotationPoint(1.95F, 0.5F, 6.25F);
        this.tail4.addChild(TailOsteoderms4);


        this.cube_r84 = new AdvancedModelRenderer(this);
        this.cube_r84.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.TailOsteoderms4.addChild(cube_r84);
        this.setRotateAngle(cube_r84, 0.0F, -0.7854F, 0.0F);
        this.cube_r84.cubeList.add(new ModelBox(cube_r84, 44, 72, -1.0F, -1.0F, 0.0F, 1, 1, 1, 0.0F, false));

        this.cube_r85 = new AdvancedModelRenderer(this);
        this.cube_r85.setRotationPoint(0.0F, 0.0F, 4.25F);
        this.TailOsteoderms4.addChild(cube_r85);
        this.setRotateAngle(cube_r85, 0.0F, -0.7854F, 0.0F);
        this.cube_r85.cubeList.add(new ModelBox(cube_r85, 86, 22, -1.0F, -1.0F, 0.0F, 1, 1, 1, 0.0F, false));

        this.cube_r86 = new AdvancedModelRenderer(this);
        this.cube_r86.setRotationPoint(0.0F, 0.0F, 2.25F);
        this.TailOsteoderms4.addChild(cube_r86);
        this.setRotateAngle(cube_r86, 0.0F, -0.7854F, 0.0F);
        this.cube_r86.cubeList.add(new ModelBox(cube_r86, 44, 75, -1.0F, -1.0F, 0.0F, 1, 1, 1, 0.0F, false));

        this.cube_r87 = new AdvancedModelRenderer(this);
        this.cube_r87.setRotationPoint(0.1F, 0.0F, -2.25F);
        this.TailOsteoderms4.addChild(cube_r87);
        this.setRotateAngle(cube_r87, 0.0F, -0.7854F, 0.0F);
        this.cube_r87.cubeList.add(new ModelBox(cube_r87, 44, 69, -1.0F, -1.0F, 0.0F, 1, 1, 1, 0.0F, false));

        this.cube_r88 = new AdvancedModelRenderer(this);
        this.cube_r88.setRotationPoint(0.2F, 0.0F, -4.75F);
        this.TailOsteoderms4.addChild(cube_r88);
        this.setRotateAngle(cube_r88, 0.0F, -0.7854F, 0.0F);
        this.cube_r88.cubeList.add(new ModelBox(cube_r88, 44, 66, -1.0F, -1.0F, 0.0F, 1, 1, 1, 0.0F, false));

        this.cube_r89 = new AdvancedModelRenderer(this);
        this.cube_r89.setRotationPoint(-1.45F, -0.7F, 0.75F);
        this.TailOsteoderms4.addChild(cube_r89);
        this.setRotateAngle(cube_r89, 0.2182F, -0.2182F, 0.7854F);
        this.cube_r89.cubeList.add(new ModelBox(cube_r89, 115, 80, -0.5F, -0.5F, 0.0F, 1, 1, 2, 0.0F, false));

        this.cube_r90 = new AdvancedModelRenderer(this);
        this.cube_r90.setRotationPoint(-1.45F, -0.8F, -3.75F);
        this.TailOsteoderms4.addChild(cube_r90);
        this.setRotateAngle(cube_r90, 0.2182F, -0.2182F, 0.7854F);
        this.cube_r90.cubeList.add(new ModelBox(cube_r90, 111, 114, -0.5F, -0.5F, 0.0F, 1, 1, 2, 0.0F, false));

        this.cube_r91 = new AdvancedModelRenderer(this);
        this.cube_r91.setRotationPoint(-1.45F, -0.8F, -6.0F);
        this.TailOsteoderms4.addChild(cube_r91);
        this.setRotateAngle(cube_r91, 0.2182F, -0.2182F, 0.7854F);
        this.cube_r91.cubeList.add(new ModelBox(cube_r91, 114, 106, -0.5F, -0.5F, 0.0F, 1, 1, 2, 0.0F, false));

        this.TailOsteoderms8 = new AdvancedModelRenderer(this);
        this.TailOsteoderms8.setRotationPoint(-0.95F, 0.5F, 6.25F);
        this.tail4.addChild(TailOsteoderms8);


        this.cube_r92 = new AdvancedModelRenderer(this);
        this.cube_r92.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.TailOsteoderms8.addChild(cube_r92);
        this.setRotateAngle(cube_r92, 0.0F, 0.7854F, 0.0F);
        this.cube_r92.cubeList.add(new ModelBox(cube_r92, 44, 72, 0.0F, -1.0F, 0.0F, 1, 1, 1, 0.0F, true));

        this.cube_r93 = new AdvancedModelRenderer(this);
        this.cube_r93.setRotationPoint(0.0F, 0.0F, 4.25F);
        this.TailOsteoderms8.addChild(cube_r93);
        this.setRotateAngle(cube_r93, 0.0F, 0.7854F, 0.0F);
        this.cube_r93.cubeList.add(new ModelBox(cube_r93, 86, 22, 0.0F, -1.0F, 0.0F, 1, 1, 1, 0.0F, true));

        this.cube_r94 = new AdvancedModelRenderer(this);
        this.cube_r94.setRotationPoint(0.0F, 0.0F, 2.25F);
        this.TailOsteoderms8.addChild(cube_r94);
        this.setRotateAngle(cube_r94, 0.0F, 0.7854F, 0.0F);
        this.cube_r94.cubeList.add(new ModelBox(cube_r94, 44, 75, 0.0F, -1.0F, 0.0F, 1, 1, 1, 0.0F, true));

        this.cube_r95 = new AdvancedModelRenderer(this);
        this.cube_r95.setRotationPoint(-0.1F, 0.0F, -2.25F);
        this.TailOsteoderms8.addChild(cube_r95);
        this.setRotateAngle(cube_r95, 0.0F, 0.7854F, 0.0F);
        this.cube_r95.cubeList.add(new ModelBox(cube_r95, 44, 69, 0.0F, -1.0F, 0.0F, 1, 1, 1, 0.0F, true));

        this.cube_r96 = new AdvancedModelRenderer(this);
        this.cube_r96.setRotationPoint(-0.2F, 0.0F, -4.75F);
        this.TailOsteoderms8.addChild(cube_r96);
        this.setRotateAngle(cube_r96, 0.0F, 0.7854F, 0.0F);
        this.cube_r96.cubeList.add(new ModelBox(cube_r96, 44, 66, 0.0F, -1.0F, 0.0F, 1, 1, 1, 0.0F, true));

        this.cube_r97 = new AdvancedModelRenderer(this);
        this.cube_r97.setRotationPoint(1.45F, -0.6F, 3.0F);
        this.TailOsteoderms8.addChild(cube_r97);
        this.setRotateAngle(cube_r97, 0.2182F, 0.2182F, -0.7854F);
        this.cube_r97.cubeList.add(new ModelBox(cube_r97, 21, 93, -0.5F, -0.5F, 1.0F, 1, 1, 1, 0.0F, true));

        this.cube_r98 = new AdvancedModelRenderer(this);
        this.cube_r98.setRotationPoint(1.45F, -0.7F, -1.5F);
        this.TailOsteoderms8.addChild(cube_r98);
        this.setRotateAngle(cube_r98, 0.2182F, 0.2182F, -0.7854F);
        this.cube_r98.cubeList.add(new ModelBox(cube_r98, 115, 76, -0.5F, -0.5F, 0.0F, 1, 1, 2, 0.0F, true));

        this.body = new AdvancedModelRenderer(this);
        this.body.setRotationPoint(0.0F, -1.0F, -2.75F);
        this.hips.addChild(body);
        this.setRotateAngle(body, 0.1309F, 0.0F, 0.0F);
        this.body.cubeList.add(new ModelBox(body, 0, 0, -10.0F, -3.95F, -11.95F, 20, 13, 12, 0.0F, false));

        this.BodyOsteoderms = new AdvancedModelRenderer(this);
        this.BodyOsteoderms.setRotationPoint(11.4F, 3.0F, -10.25F);
        this.body.addChild(BodyOsteoderms);


        this.cube_r99 = new AdvancedModelRenderer(this);
        this.cube_r99.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.BodyOsteoderms.addChild(cube_r99);
        this.setRotateAngle(cube_r99, 0.0F, -0.7854F, 0.0F);
        this.cube_r99.cubeList.add(new ModelBox(cube_r99, 106, 80, -2.0F, -1.0F, 0.0F, 2, 1, 2, 0.0F, false));

        this.cube_r100 = new AdvancedModelRenderer(this);
        this.cube_r100.setRotationPoint(0.0F, 0.0F, 3.0F);
        this.BodyOsteoderms.addChild(cube_r100);
        this.setRotateAngle(cube_r100, 0.0F, -0.7854F, 0.0F);
        this.cube_r100.cubeList.add(new ModelBox(cube_r100, 0, 106, -2.0F, -1.0F, 0.0F, 2, 1, 2, 0.0F, false));

        this.cube_r101 = new AdvancedModelRenderer(this);
        this.cube_r101.setRotationPoint(0.0F, 0.0F, 6.0F);
        this.BodyOsteoderms.addChild(cube_r101);
        this.setRotateAngle(cube_r101, 0.0F, -0.7854F, 0.0F);
        this.cube_r101.cubeList.add(new ModelBox(cube_r101, 18, 106, -2.0F, -1.0F, 0.0F, 2, 1, 2, 0.0F, false));

        this.cube_r102 = new AdvancedModelRenderer(this);
        this.cube_r102.setRotationPoint(0.0F, 0.0F, 9.0F);
        this.BodyOsteoderms.addChild(cube_r102);
        this.setRotateAngle(cube_r102, 0.0F, -0.7854F, 0.0F);
        this.cube_r102.cubeList.add(new ModelBox(cube_r102, 9, 106, -2.0F, -1.0F, 0.0F, 2, 1, 2, 0.0F, false));

        this.cube_r103 = new AdvancedModelRenderer(this);
        this.cube_r103.setRotationPoint(-3.15F, -6.4F, -1.25F);
        this.BodyOsteoderms.addChild(cube_r103);
        this.setRotateAngle(cube_r103, 0.2182F, -0.2182F, 0.7854F);
        this.cube_r103.cubeList.add(new ModelBox(cube_r103, 107, 106, -0.5F, -0.5F, 0.0F, 1, 1, 2, 0.0F, false));

        this.cube_r104 = new AdvancedModelRenderer(this);
        this.cube_r104.setRotationPoint(-6.4F, -6.4F, -1.25F);
        this.BodyOsteoderms.addChild(cube_r104);
        this.setRotateAngle(cube_r104, 0.2182F, -0.2182F, 0.7854F);
        this.cube_r104.cubeList.add(new ModelBox(cube_r104, 63, 108, -0.5F, -0.5F, 0.0F, 1, 1, 2, 0.0F, false));

        this.cube_r105 = new AdvancedModelRenderer(this);
        this.cube_r105.setRotationPoint(-9.65F, -6.4F, -1.25F);
        this.BodyOsteoderms.addChild(cube_r105);
        this.setRotateAngle(cube_r105, 0.2182F, -0.2182F, 0.7854F);
        this.cube_r105.cubeList.add(new ModelBox(cube_r105, 70, 108, -0.5F, -0.5F, 0.0F, 1, 1, 2, 0.0F, false));

        this.cube_r106 = new AdvancedModelRenderer(this);
        this.cube_r106.setRotationPoint(-9.4F, -6.4F, 1.75F);
        this.BodyOsteoderms.addChild(cube_r106);
        this.setRotateAngle(cube_r106, 0.2182F, -0.2182F, 0.7854F);
        this.cube_r106.cubeList.add(new ModelBox(cube_r106, 41, 110, -0.5F, -0.5F, 0.0F, 1, 1, 2, 0.0F, false));

        this.cube_r107 = new AdvancedModelRenderer(this);
        this.cube_r107.setRotationPoint(-9.4F, -6.4F, 4.75F);
        this.BodyOsteoderms.addChild(cube_r107);
        this.setRotateAngle(cube_r107, 0.2182F, -0.2182F, 0.7854F);
        this.cube_r107.cubeList.add(new ModelBox(cube_r107, 77, 108, -0.5F, -0.5F, 0.0F, 1, 1, 2, 0.0F, false));

        this.cube_r108 = new AdvancedModelRenderer(this);
        this.cube_r108.setRotationPoint(-9.65F, -6.4F, 7.75F);
        this.BodyOsteoderms.addChild(cube_r108);
        this.setRotateAngle(cube_r108, 0.2182F, -0.2182F, 0.7854F);
        this.cube_r108.cubeList.add(new ModelBox(cube_r108, 107, 12, -0.5F, -0.5F, 0.0F, 1, 1, 2, 0.0F, false));

        this.cube_r109 = new AdvancedModelRenderer(this);
        this.cube_r109.setRotationPoint(-5.9F, -6.4F, 7.75F);
        this.BodyOsteoderms.addChild(cube_r109);
        this.setRotateAngle(cube_r109, 0.2182F, -0.2182F, 0.7854F);
        this.cube_r109.cubeList.add(new ModelBox(cube_r109, 107, 28, -0.5F, -0.5F, 0.0F, 1, 1, 2, 0.0F, false));

        this.cube_r110 = new AdvancedModelRenderer(this);
        this.cube_r110.setRotationPoint(-2.65F, -6.4F, 7.75F);
        this.BodyOsteoderms.addChild(cube_r110);
        this.setRotateAngle(cube_r110, 0.2182F, -0.2182F, 0.7854F);
        this.cube_r110.cubeList.add(new ModelBox(cube_r110, 107, 32, -0.5F, -0.5F, 0.0F, 1, 1, 2, 0.0F, false));

        this.cube_r111 = new AdvancedModelRenderer(this);
        this.cube_r111.setRotationPoint(-2.4F, -6.4F, 4.75F);
        this.BodyOsteoderms.addChild(cube_r111);
        this.setRotateAngle(cube_r111, 0.2182F, -0.2182F, 0.7854F);
        this.cube_r111.cubeList.add(new ModelBox(cube_r111, 84, 108, -0.5F, -0.5F, 0.0F, 1, 1, 2, 0.0F, false));

        this.cube_r112 = new AdvancedModelRenderer(this);
        this.cube_r112.setRotationPoint(-5.9F, -6.4F, 1.75F);
        this.BodyOsteoderms.addChild(cube_r112);
        this.setRotateAngle(cube_r112, 0.2182F, -0.2182F, 0.7854F);
        this.cube_r112.cubeList.add(new ModelBox(cube_r112, 110, 72, -0.5F, -0.5F, 0.0F, 1, 1, 2, 0.0F, false));

        this.cube_r113 = new AdvancedModelRenderer(this);
        this.cube_r113.setRotationPoint(-5.65F, -6.4F, 4.75F);
        this.BodyOsteoderms.addChild(cube_r113);
        this.setRotateAngle(cube_r113, 0.2182F, -0.2182F, 0.7854F);
        this.cube_r113.cubeList.add(new ModelBox(cube_r113, 27, 109, -0.5F, -0.5F, 0.0F, 1, 1, 2, 0.0F, false));

        this.cube_r114 = new AdvancedModelRenderer(this);
        this.cube_r114.setRotationPoint(-2.65F, -6.4F, 1.75F);
        this.BodyOsteoderms.addChild(cube_r114);
        this.setRotateAngle(cube_r114, 0.2182F, -0.2182F, 0.7854F);
        this.cube_r114.cubeList.add(new ModelBox(cube_r114, 91, 110, -0.5F, -0.5F, 0.0F, 1, 1, 2, 0.0F, false));

        this.cube_r115 = new AdvancedModelRenderer(this);
        this.cube_r115.setRotationPoint(-2.0F, -5.4F, -1.25F);
        this.BodyOsteoderms.addChild(cube_r115);
        this.setRotateAngle(cube_r115, 0.2182F, -0.2182F, 2.3562F);
        this.cube_r115.cubeList.add(new ModelBox(cube_r115, 109, 102, -0.5F, -0.5F, 0.0F, 1, 1, 2, 0.0F, false));

        this.cube_r116 = new AdvancedModelRenderer(this);
        this.cube_r116.setRotationPoint(-2.0F, -2.9F, -1.25F);
        this.BodyOsteoderms.addChild(cube_r116);
        this.setRotateAngle(cube_r116, 0.2182F, -0.2182F, 2.3562F);
        this.cube_r116.cubeList.add(new ModelBox(cube_r116, 0, 110, -0.5F, -0.5F, 0.0F, 1, 1, 2, 0.0F, false));

        this.cube_r117 = new AdvancedModelRenderer(this);
        this.cube_r117.setRotationPoint(-2.0F, -2.65F, 1.75F);
        this.BodyOsteoderms.addChild(cube_r117);
        this.setRotateAngle(cube_r117, 0.2182F, -0.2182F, 2.3562F);
        this.cube_r117.cubeList.add(new ModelBox(cube_r117, 115, 84, -0.5F, -0.5F, 0.0F, 1, 1, 2, 0.0F, false));

        this.cube_r118 = new AdvancedModelRenderer(this);
        this.cube_r118.setRotationPoint(-2.0F, -5.65F, 1.75F);
        this.BodyOsteoderms.addChild(cube_r118);
        this.setRotateAngle(cube_r118, 0.2182F, -0.2182F, 2.3562F);
        this.cube_r118.cubeList.add(new ModelBox(cube_r118, 115, 88, -0.5F, -0.5F, 0.0F, 1, 1, 2, 0.0F, false));

        this.cube_r119 = new AdvancedModelRenderer(this);
        this.cube_r119.setRotationPoint(-2.0F, -5.65F, 4.75F);
        this.BodyOsteoderms.addChild(cube_r119);
        this.setRotateAngle(cube_r119, 0.2182F, -0.2182F, 2.3562F);
        this.cube_r119.cubeList.add(new ModelBox(cube_r119, 107, 16, -0.5F, -0.5F, 0.0F, 1, 1, 2, 0.0F, false));

        this.cube_r120 = new AdvancedModelRenderer(this);
        this.cube_r120.setRotationPoint(-2.0F, -2.65F, 4.75F);
        this.BodyOsteoderms.addChild(cube_r120);
        this.setRotateAngle(cube_r120, 0.2182F, -0.2182F, 2.3562F);
        this.cube_r120.cubeList.add(new ModelBox(cube_r120, 107, 20, -0.5F, -0.5F, 0.0F, 1, 1, 2, 0.0F, false));

        this.cube_r121 = new AdvancedModelRenderer(this);
        this.cube_r121.setRotationPoint(-2.0F, -2.9F, 7.75F);
        this.BodyOsteoderms.addChild(cube_r121);
        this.setRotateAngle(cube_r121, 0.2182F, -0.2182F, 2.3562F);
        this.cube_r121.cubeList.add(new ModelBox(cube_r121, 98, 110, -0.5F, -0.5F, 0.0F, 1, 1, 2, 0.0F, false));

        this.cube_r122 = new AdvancedModelRenderer(this);
        this.cube_r122.setRotationPoint(-2.0F, -5.65F, 7.75F);
        this.BodyOsteoderms.addChild(cube_r122);
        this.setRotateAngle(cube_r122, 0.2182F, -0.2182F, 2.3562F);
        this.cube_r122.cubeList.add(new ModelBox(cube_r122, 105, 110, -0.5F, -0.5F, 0.0F, 1, 1, 2, 0.0F, false));

        this.BodyOsteoderms2 = new AdvancedModelRenderer(this);
        this.BodyOsteoderms2.setRotationPoint(-11.4F, 3.0F, -10.25F);
        this.body.addChild(BodyOsteoderms2);


        this.cube_r123 = new AdvancedModelRenderer(this);
        this.cube_r123.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.BodyOsteoderms2.addChild(cube_r123);
        this.setRotateAngle(cube_r123, 0.0F, 0.7854F, 0.0F);
        this.cube_r123.cubeList.add(new ModelBox(cube_r123, 106, 80, 0.0F, -1.0F, 0.0F, 2, 1, 2, 0.0F, true));

        this.cube_r124 = new AdvancedModelRenderer(this);
        this.cube_r124.setRotationPoint(0.0F, 0.0F, 3.0F);
        this.BodyOsteoderms2.addChild(cube_r124);
        this.setRotateAngle(cube_r124, 0.0F, 0.7854F, 0.0F);
        this.cube_r124.cubeList.add(new ModelBox(cube_r124, 0, 106, 0.0F, -1.0F, 0.0F, 2, 1, 2, 0.0F, true));

        this.cube_r125 = new AdvancedModelRenderer(this);
        this.cube_r125.setRotationPoint(0.0F, 0.0F, 6.0F);
        this.BodyOsteoderms2.addChild(cube_r125);
        this.setRotateAngle(cube_r125, 0.0F, 0.7854F, 0.0F);
        this.cube_r125.cubeList.add(new ModelBox(cube_r125, 18, 106, 0.0F, -1.0F, 0.0F, 2, 1, 2, 0.0F, true));

        this.cube_r126 = new AdvancedModelRenderer(this);
        this.cube_r126.setRotationPoint(0.0F, 0.0F, 9.0F);
        this.BodyOsteoderms2.addChild(cube_r126);
        this.setRotateAngle(cube_r126, 0.0F, 0.7854F, 0.0F);
        this.cube_r126.cubeList.add(new ModelBox(cube_r126, 9, 106, 0.0F, -1.0F, 0.0F, 2, 1, 2, 0.0F, true));

        this.cube_r127 = new AdvancedModelRenderer(this);
        this.cube_r127.setRotationPoint(3.15F, -6.4F, -1.25F);
        this.BodyOsteoderms2.addChild(cube_r127);
        this.setRotateAngle(cube_r127, 0.2182F, 0.2182F, -0.7854F);
        this.cube_r127.cubeList.add(new ModelBox(cube_r127, 107, 106, -0.5F, -0.5F, 0.0F, 1, 1, 2, 0.0F, true));

        this.cube_r128 = new AdvancedModelRenderer(this);
        this.cube_r128.setRotationPoint(6.4F, -6.4F, -1.25F);
        this.BodyOsteoderms2.addChild(cube_r128);
        this.setRotateAngle(cube_r128, 0.2182F, 0.2182F, -0.7854F);
        this.cube_r128.cubeList.add(new ModelBox(cube_r128, 63, 108, -0.5F, -0.5F, 0.0F, 1, 1, 2, 0.0F, true));

        this.cube_r129 = new AdvancedModelRenderer(this);
        this.cube_r129.setRotationPoint(9.65F, -6.4F, -1.25F);
        this.BodyOsteoderms2.addChild(cube_r129);
        this.setRotateAngle(cube_r129, 0.2182F, 0.2182F, -0.7854F);
        this.cube_r129.cubeList.add(new ModelBox(cube_r129, 70, 108, -0.5F, -0.5F, 0.0F, 1, 1, 2, 0.0F, true));

        this.cube_r130 = new AdvancedModelRenderer(this);
        this.cube_r130.setRotationPoint(9.4F, -6.4F, 1.75F);
        this.BodyOsteoderms2.addChild(cube_r130);
        this.setRotateAngle(cube_r130, 0.2182F, 0.2182F, -0.7854F);
        this.cube_r130.cubeList.add(new ModelBox(cube_r130, 41, 110, -0.5F, -0.5F, 0.0F, 1, 1, 2, 0.0F, true));

        this.cube_r131 = new AdvancedModelRenderer(this);
        this.cube_r131.setRotationPoint(9.4F, -6.4F, 4.75F);
        this.BodyOsteoderms2.addChild(cube_r131);
        this.setRotateAngle(cube_r131, 0.2182F, 0.2182F, -0.7854F);
        this.cube_r131.cubeList.add(new ModelBox(cube_r131, 77, 108, -0.5F, -0.5F, 0.0F, 1, 1, 2, 0.0F, true));

        this.cube_r132 = new AdvancedModelRenderer(this);
        this.cube_r132.setRotationPoint(9.65F, -6.4F, 7.75F);
        this.BodyOsteoderms2.addChild(cube_r132);
        this.setRotateAngle(cube_r132, 0.2182F, 0.2182F, -0.7854F);
        this.cube_r132.cubeList.add(new ModelBox(cube_r132, 107, 12, -0.5F, -0.5F, 0.0F, 1, 1, 2, 0.0F, true));

        this.cube_r133 = new AdvancedModelRenderer(this);
        this.cube_r133.setRotationPoint(5.9F, -6.4F, 7.75F);
        this.BodyOsteoderms2.addChild(cube_r133);
        this.setRotateAngle(cube_r133, 0.2182F, 0.2182F, -0.7854F);
        this.cube_r133.cubeList.add(new ModelBox(cube_r133, 107, 28, -0.5F, -0.5F, 0.0F, 1, 1, 2, 0.0F, true));

        this.cube_r134 = new AdvancedModelRenderer(this);
        this.cube_r134.setRotationPoint(2.65F, -6.4F, 7.75F);
        this.BodyOsteoderms2.addChild(cube_r134);
        this.setRotateAngle(cube_r134, 0.2182F, 0.2182F, -0.7854F);
        this.cube_r134.cubeList.add(new ModelBox(cube_r134, 107, 32, -0.5F, -0.5F, 0.0F, 1, 1, 2, 0.0F, true));

        this.cube_r135 = new AdvancedModelRenderer(this);
        this.cube_r135.setRotationPoint(2.4F, -6.4F, 4.75F);
        this.BodyOsteoderms2.addChild(cube_r135);
        this.setRotateAngle(cube_r135, 0.2182F, 0.2182F, -0.7854F);
        this.cube_r135.cubeList.add(new ModelBox(cube_r135, 84, 108, -0.5F, -0.5F, 0.0F, 1, 1, 2, 0.0F, true));

        this.cube_r136 = new AdvancedModelRenderer(this);
        this.cube_r136.setRotationPoint(5.9F, -6.4F, 1.75F);
        this.BodyOsteoderms2.addChild(cube_r136);
        this.setRotateAngle(cube_r136, 0.2182F, 0.2182F, -0.7854F);
        this.cube_r136.cubeList.add(new ModelBox(cube_r136, 110, 72, -0.5F, -0.5F, 0.0F, 1, 1, 2, 0.0F, true));

        this.cube_r137 = new AdvancedModelRenderer(this);
        this.cube_r137.setRotationPoint(5.65F, -6.4F, 4.75F);
        this.BodyOsteoderms2.addChild(cube_r137);
        this.setRotateAngle(cube_r137, 0.2182F, 0.2182F, -0.7854F);
        this.cube_r137.cubeList.add(new ModelBox(cube_r137, 27, 109, -0.5F, -0.5F, 0.0F, 1, 1, 2, 0.0F, true));

        this.cube_r138 = new AdvancedModelRenderer(this);
        this.cube_r138.setRotationPoint(2.65F, -6.4F, 1.75F);
        this.BodyOsteoderms2.addChild(cube_r138);
        this.setRotateAngle(cube_r138, 0.2182F, 0.2182F, -0.7854F);
        this.cube_r138.cubeList.add(new ModelBox(cube_r138, 91, 110, -0.5F, -0.5F, 0.0F, 1, 1, 2, 0.0F, true));

        this.cube_r139 = new AdvancedModelRenderer(this);
        this.cube_r139.setRotationPoint(2.0F, -5.4F, -1.25F);
        this.BodyOsteoderms2.addChild(cube_r139);
        this.setRotateAngle(cube_r139, 0.2182F, 0.2182F, -2.3562F);
        this.cube_r139.cubeList.add(new ModelBox(cube_r139, 109, 102, -0.5F, -0.5F, 0.0F, 1, 1, 2, 0.0F, true));

        this.cube_r140 = new AdvancedModelRenderer(this);
        this.cube_r140.setRotationPoint(2.0F, -2.9F, -1.25F);
        this.BodyOsteoderms2.addChild(cube_r140);
        this.setRotateAngle(cube_r140, 0.2182F, 0.2182F, -2.3562F);
        this.cube_r140.cubeList.add(new ModelBox(cube_r140, 0, 110, -0.5F, -0.5F, 0.0F, 1, 1, 2, 0.0F, true));

        this.cube_r141 = new AdvancedModelRenderer(this);
        this.cube_r141.setRotationPoint(2.0F, -2.65F, 1.75F);
        this.BodyOsteoderms2.addChild(cube_r141);
        this.setRotateAngle(cube_r141, 0.2182F, 0.2182F, -2.3562F);
        this.cube_r141.cubeList.add(new ModelBox(cube_r141, 115, 84, -0.5F, -0.5F, 0.0F, 1, 1, 2, 0.0F, true));

        this.cube_r142 = new AdvancedModelRenderer(this);
        this.cube_r142.setRotationPoint(2.0F, -5.65F, 1.75F);
        this.BodyOsteoderms2.addChild(cube_r142);
        this.setRotateAngle(cube_r142, 0.2182F, 0.2182F, -2.3562F);
        this.cube_r142.cubeList.add(new ModelBox(cube_r142, 115, 88, -0.5F, -0.5F, 0.0F, 1, 1, 2, 0.0F, true));

        this.cube_r143 = new AdvancedModelRenderer(this);
        this.cube_r143.setRotationPoint(2.0F, -5.65F, 4.75F);
        this.BodyOsteoderms2.addChild(cube_r143);
        this.setRotateAngle(cube_r143, 0.2182F, 0.2182F, -2.3562F);
        this.cube_r143.cubeList.add(new ModelBox(cube_r143, 107, 16, -0.5F, -0.5F, 0.0F, 1, 1, 2, 0.0F, true));

        this.cube_r144 = new AdvancedModelRenderer(this);
        this.cube_r144.setRotationPoint(2.0F, -2.65F, 4.75F);
        this.BodyOsteoderms2.addChild(cube_r144);
        this.setRotateAngle(cube_r144, 0.2182F, 0.2182F, -2.3562F);
        this.cube_r144.cubeList.add(new ModelBox(cube_r144, 107, 20, -0.5F, -0.5F, 0.0F, 1, 1, 2, 0.0F, true));

        this.cube_r145 = new AdvancedModelRenderer(this);
        this.cube_r145.setRotationPoint(2.0F, -2.9F, 7.75F);
        this.BodyOsteoderms2.addChild(cube_r145);
        this.setRotateAngle(cube_r145, 0.2182F, 0.2182F, -2.3562F);
        this.cube_r145.cubeList.add(new ModelBox(cube_r145, 98, 110, -0.5F, -0.5F, 0.0F, 1, 1, 2, 0.0F, true));

        this.cube_r146 = new AdvancedModelRenderer(this);
        this.cube_r146.setRotationPoint(2.0F, -5.65F, 7.75F);
        this.BodyOsteoderms2.addChild(cube_r146);
        this.setRotateAngle(cube_r146, 0.2182F, 0.2182F, -2.3562F);
        this.cube_r146.cubeList.add(new ModelBox(cube_r146, 105, 110, -0.5F, -0.5F, 0.0F, 1, 1, 2, 0.0F, true));

        this.chest = new AdvancedModelRenderer(this);
        this.chest.setRotationPoint(0.0F, -1.0F, -11.75F);
        this.body.addChild(chest);
        this.setRotateAngle(chest, 0.1745F, 0.0F, 0.0F);
        this.chest.cubeList.add(new ModelBox(chest, 0, 26, -8.0F, -2.5F, -6.0F, 16, 11, 8, 0.0F, false));
        this.chest.cubeList.add(new ModelBox(chest, 65, 0, -6.5F, -2.25F, -9.0F, 13, 9, 4, 0.0F, false));

        this.ChestOsteoderms = new AdvancedModelRenderer(this);
        this.ChestOsteoderms.setRotationPoint(9.7332F, 3.6125F, -3.5829F);
        this.chest.addChild(ChestOsteoderms);


        this.cube_r147 = new AdvancedModelRenderer(this);
        this.cube_r147.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.ChestOsteoderms.addChild(cube_r147);
        this.setRotateAngle(cube_r147, -0.1482F, -0.146F, 0.2104F);
        this.cube_r147.cubeList.add(new ModelBox(cube_r147, 106, 84, -2.392F, -1.5F, 0.2712F, 3, 2, 1, 0.0F, false));
        this.cube_r147.cubeList.add(new ModelBox(cube_r147, 106, 76, -2.392F, -1.5F, 1.0212F, 3, 2, 1, 0.01F, false));

        this.cube_r148 = new AdvancedModelRenderer(this);
        this.cube_r148.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.ChestOsteoderms.addChild(cube_r148);
        this.setRotateAngle(cube_r148, -0.1568F, -0.3617F, 0.2445F);
        this.cube_r148.cubeList.add(new ModelBox(cube_r148, 64, 104, -0.013F, -1.5F, 0.8958F, 3, 2, 1, 0.0F, false));

        this.cube_r149 = new AdvancedModelRenderer(this);
        this.cube_r149.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.ChestOsteoderms.addChild(cube_r149);
        this.setRotateAngle(cube_r149, -0.1664F, -0.4909F, 0.2676F);
        this.cube_r149.cubeList.add(new ModelBox(cube_r149, 91, 99, 2.2042F, -1.0F, 0.5179F, 5, 1, 1, -0.01F, false));

        this.cube_r150 = new AdvancedModelRenderer(this);
        this.cube_r150.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.ChestOsteoderms.addChild(cube_r150);
        this.setRotateAngle(cube_r150, -0.1863F, -0.6627F, 0.3041F);
        this.cube_r150.cubeList.add(new ModelBox(cube_r150, 56, 96, 2.8978F, -1.0F, -0.7765F, 6, 1, 1, 0.01F, false));

        this.cube_r151 = new AdvancedModelRenderer(this);
        this.cube_r151.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.ChestOsteoderms.addChild(cube_r151);
        this.setRotateAngle(cube_r151, -0.1596F, -0.4048F, 0.2519F);
        this.cube_r151.cubeList.add(new ModelBox(cube_r151, 28, 96, -3.0F, -1.5F, 0.0F, 6, 2, 1, 0.02F, false));

        this.cube_r152 = new AdvancedModelRenderer(this);
        this.cube_r152.setRotationPoint(-1.5F, -1.25F, -3.75F);
        this.ChestOsteoderms.addChild(cube_r152);
        this.setRotateAngle(cube_r152, -0.3411F, 0.0426F, 0.0929F);
        this.cube_r152.cubeList.add(new ModelBox(cube_r152, 115, 92, -2.5F, -1.0F, -0.134F, 2, 1, 1, 0.0F, false));

        this.cube_r153 = new AdvancedModelRenderer(this);
        this.cube_r153.setRotationPoint(-1.5F, -1.25F, -3.75F);
        this.ChestOsteoderms.addChild(cube_r153);
        this.setRotateAngle(cube_r153, -0.3607F, -0.3268F, 0.2285F);
        this.cube_r153.cubeList.add(new ModelBox(cube_r153, 100, 9, -2.0F, -1.0F, 0.0F, 4, 1, 1, 0.01F, false));

        this.cube_r154 = new AdvancedModelRenderer(this);
        this.cube_r154.setRotationPoint(-3.8332F, -4.0125F, -4.9171F);
        this.ChestOsteoderms.addChild(cube_r154);
        this.setRotateAngle(cube_r154, 0.2182F, -0.2182F, 2.3562F);
        this.cube_r154.cubeList.add(new ModelBox(cube_r154, 111, 4, -0.5F, -0.5F, 0.0F, 1, 1, 2, 0.0F, false));

        this.cube_r155 = new AdvancedModelRenderer(this);
        this.cube_r155.setRotationPoint(-8.2332F, -5.2625F, -4.9171F);
        this.ChestOsteoderms.addChild(cube_r155);
        this.setRotateAngle(cube_r155, 0.2182F, -0.2182F, 0.7854F);
        this.cube_r155.cubeList.add(new ModelBox(cube_r155, 111, 8, -0.5F, -0.5F, 0.0F, 1, 1, 2, 0.0F, false));

        this.cube_r156 = new AdvancedModelRenderer(this);
        this.cube_r156.setRotationPoint(-6.2332F, -5.2625F, -4.9171F);
        this.ChestOsteoderms.addChild(cube_r156);
        this.setRotateAngle(cube_r156, 0.2182F, -0.2182F, 0.7854F);
        this.cube_r156.cubeList.add(new ModelBox(cube_r156, 112, 40, -0.5F, -0.5F, 0.0F, 1, 1, 2, 0.0F, false));

        this.cube_r157 = new AdvancedModelRenderer(this);
        this.cube_r157.setRotationPoint(-4.2332F, -5.2625F, -4.9171F);
        this.ChestOsteoderms.addChild(cube_r157);
        this.setRotateAngle(cube_r157, 0.2182F, -0.2182F, 0.7854F);
        this.cube_r157.cubeList.add(new ModelBox(cube_r157, 104, 114, -0.5F, -0.5F, 0.0F, 1, 1, 2, 0.0F, false));

        this.cube_r158 = new AdvancedModelRenderer(this);
        this.cube_r158.setRotationPoint(-2.3332F, -4.2625F, -1.6671F);
        this.ChestOsteoderms.addChild(cube_r158);
        this.setRotateAngle(cube_r158, 0.2182F, -0.2182F, 2.3562F);
        this.cube_r158.cubeList.add(new ModelBox(cube_r158, 116, 99, -0.5F, -0.5F, 0.0F, 1, 1, 2, 0.0F, false));

        this.cube_r159 = new AdvancedModelRenderer(this);
        this.cube_r159.setRotationPoint(-2.3332F, -4.5125F, 1.0829F);
        this.ChestOsteoderms.addChild(cube_r159);
        this.setRotateAngle(cube_r159, 0.2182F, -0.2182F, 2.3562F);
        this.cube_r159.cubeList.add(new ModelBox(cube_r159, 107, 36, -0.5F, -0.5F, 0.0F, 1, 1, 2, 0.0F, false));

        this.cube_r160 = new AdvancedModelRenderer(this);
        this.cube_r160.setRotationPoint(-2.3332F, -2.7625F, 0.5829F);
        this.ChestOsteoderms.addChild(cube_r160);
        this.setRotateAngle(cube_r160, 0.2182F, -0.2182F, 2.3562F);
        this.cube_r160.cubeList.add(new ModelBox(cube_r160, 100, 106, -0.5F, -0.5F, 0.0F, 1, 1, 2, 0.0F, false));

        this.cube_r161 = new AdvancedModelRenderer(this);
        this.cube_r161.setRotationPoint(-2.4832F, -5.5125F, 1.3329F);
        this.ChestOsteoderms.addChild(cube_r161);
        this.setRotateAngle(cube_r161, 0.2182F, -0.2182F, 0.7854F);
        this.cube_r161.cubeList.add(new ModelBox(cube_r161, 110, 47, -0.5F, -0.5F, 0.0F, 1, 1, 2, 0.0F, false));

        this.cube_r162 = new AdvancedModelRenderer(this);
        this.cube_r162.setRotationPoint(-4.9832F, -5.5125F, 1.3329F);
        this.ChestOsteoderms.addChild(cube_r162);
        this.setRotateAngle(cube_r162, 0.2182F, -0.2182F, 0.7854F);
        this.cube_r162.cubeList.add(new ModelBox(cube_r162, 48, 110, -0.5F, -0.5F, 0.0F, 1, 1, 2, 0.0F, false));

        this.cube_r163 = new AdvancedModelRenderer(this);
        this.cube_r163.setRotationPoint(-7.9832F, -5.5125F, 1.3329F);
        this.ChestOsteoderms.addChild(cube_r163);
        this.setRotateAngle(cube_r163, 0.2182F, -0.2182F, 0.7854F);
        this.cube_r163.cubeList.add(new ModelBox(cube_r163, 111, 0, -0.5F, -0.5F, 0.0F, 1, 1, 2, 0.0F, false));

        this.cube_r164 = new AdvancedModelRenderer(this);
        this.cube_r164.setRotationPoint(-8.2332F, -5.5125F, -1.6671F);
        this.ChestOsteoderms.addChild(cube_r164);
        this.setRotateAngle(cube_r164, 0.2182F, -0.2182F, 0.7854F);
        this.cube_r164.cubeList.add(new ModelBox(cube_r164, 90, 114, -0.5F, -0.5F, 0.0F, 1, 1, 2, 0.0F, false));

        this.cube_r165 = new AdvancedModelRenderer(this);
        this.cube_r165.setRotationPoint(-5.4832F, -5.5125F, -1.6671F);
        this.ChestOsteoderms.addChild(cube_r165);
        this.setRotateAngle(cube_r165, 0.2182F, -0.2182F, 0.7854F);
        this.cube_r165.cubeList.add(new ModelBox(cube_r165, 97, 114, -0.5F, -0.5F, 0.0F, 1, 1, 2, 0.0F, false));

        this.cube_r166 = new AdvancedModelRenderer(this);
        this.cube_r166.setRotationPoint(-2.7332F, -5.5125F, -1.6671F);
        this.ChestOsteoderms.addChild(cube_r166);
        this.setRotateAngle(cube_r166, 0.2182F, -0.2182F, 0.7854F);
        this.cube_r166.cubeList.add(new ModelBox(cube_r166, 56, 116, -0.5F, -0.5F, 0.0F, 1, 1, 2, 0.0F, false));

        this.ChestOsteoderms2 = new AdvancedModelRenderer(this);
        this.ChestOsteoderms2.setRotationPoint(-9.7332F, 3.6125F, -3.5829F);
        this.chest.addChild(ChestOsteoderms2);


        this.cube_r167 = new AdvancedModelRenderer(this);
        this.cube_r167.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.ChestOsteoderms2.addChild(cube_r167);
        this.setRotateAngle(cube_r167, -0.1482F, 0.146F, -0.2104F);
        this.cube_r167.cubeList.add(new ModelBox(cube_r167, 106, 84, -0.608F, -1.5F, 0.2712F, 3, 2, 1, 0.0F, true));
        this.cube_r167.cubeList.add(new ModelBox(cube_r167, 106, 76, -0.608F, -1.5F, 1.0212F, 3, 2, 1, 0.01F, true));

        this.cube_r168 = new AdvancedModelRenderer(this);
        this.cube_r168.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.ChestOsteoderms2.addChild(cube_r168);
        this.setRotateAngle(cube_r168, -0.1568F, 0.3617F, -0.2445F);
        this.cube_r168.cubeList.add(new ModelBox(cube_r168, 64, 104, -2.987F, -1.5F, 0.8958F, 3, 2, 1, 0.0F, true));

        this.cube_r169 = new AdvancedModelRenderer(this);
        this.cube_r169.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.ChestOsteoderms2.addChild(cube_r169);
        this.setRotateAngle(cube_r169, -0.1664F, 0.4909F, -0.2676F);
        this.cube_r169.cubeList.add(new ModelBox(cube_r169, 91, 99, -7.2042F, -1.0F, 0.5179F, 5, 1, 1, -0.01F, true));

        this.cube_r170 = new AdvancedModelRenderer(this);
        this.cube_r170.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.ChestOsteoderms2.addChild(cube_r170);
        this.setRotateAngle(cube_r170, -0.1863F, 0.6627F, -0.3041F);
        this.cube_r170.cubeList.add(new ModelBox(cube_r170, 56, 96, -8.8978F, -1.0F, -0.7765F, 6, 1, 1, 0.01F, true));

        this.cube_r171 = new AdvancedModelRenderer(this);
        this.cube_r171.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.ChestOsteoderms2.addChild(cube_r171);
        this.setRotateAngle(cube_r171, -0.1596F, 0.4048F, -0.2519F);
        this.cube_r171.cubeList.add(new ModelBox(cube_r171, 28, 96, -3.0F, -1.5F, 0.0F, 6, 2, 1, 0.02F, true));

        this.cube_r172 = new AdvancedModelRenderer(this);
        this.cube_r172.setRotationPoint(1.5F, -1.25F, -3.75F);
        this.ChestOsteoderms2.addChild(cube_r172);
        this.setRotateAngle(cube_r172, -0.3411F, -0.0426F, -0.0929F);
        this.cube_r172.cubeList.add(new ModelBox(cube_r172, 115, 92, 0.5F, -1.0F, -0.134F, 2, 1, 1, 0.0F, true));

        this.cube_r173 = new AdvancedModelRenderer(this);
        this.cube_r173.setRotationPoint(1.5F, -1.25F, -3.75F);
        this.ChestOsteoderms2.addChild(cube_r173);
        this.setRotateAngle(cube_r173, -0.3607F, 0.3268F, -0.2285F);
        this.cube_r173.cubeList.add(new ModelBox(cube_r173, 100, 9, -2.0F, -1.0F, 0.0F, 4, 1, 1, 0.01F, true));

        this.cube_r174 = new AdvancedModelRenderer(this);
        this.cube_r174.setRotationPoint(3.8332F, -4.0125F, -4.9171F);
        this.ChestOsteoderms2.addChild(cube_r174);
        this.setRotateAngle(cube_r174, 0.2182F, 0.2182F, -2.3562F);
        this.cube_r174.cubeList.add(new ModelBox(cube_r174, 111, 4, -0.5F, -0.5F, 0.0F, 1, 1, 2, 0.0F, true));

        this.cube_r175 = new AdvancedModelRenderer(this);
        this.cube_r175.setRotationPoint(8.2332F, -5.2625F, -4.9171F);
        this.ChestOsteoderms2.addChild(cube_r175);
        this.setRotateAngle(cube_r175, 0.2182F, 0.2182F, -0.7854F);
        this.cube_r175.cubeList.add(new ModelBox(cube_r175, 111, 8, -0.5F, -0.5F, 0.0F, 1, 1, 2, 0.0F, true));

        this.cube_r176 = new AdvancedModelRenderer(this);
        this.cube_r176.setRotationPoint(6.2332F, -5.2625F, -4.9171F);
        this.ChestOsteoderms2.addChild(cube_r176);
        this.setRotateAngle(cube_r176, 0.2182F, 0.2182F, -0.7854F);
        this.cube_r176.cubeList.add(new ModelBox(cube_r176, 112, 40, -0.5F, -0.5F, 0.0F, 1, 1, 2, 0.0F, true));

        this.cube_r177 = new AdvancedModelRenderer(this);
        this.cube_r177.setRotationPoint(4.2332F, -5.2625F, -4.9171F);
        this.ChestOsteoderms2.addChild(cube_r177);
        this.setRotateAngle(cube_r177, 0.2182F, 0.2182F, -0.7854F);
        this.cube_r177.cubeList.add(new ModelBox(cube_r177, 104, 114, -0.5F, -0.5F, 0.0F, 1, 1, 2, 0.0F, true));

        this.cube_r178 = new AdvancedModelRenderer(this);
        this.cube_r178.setRotationPoint(2.3332F, -4.2625F, -1.6671F);
        this.ChestOsteoderms2.addChild(cube_r178);
        this.setRotateAngle(cube_r178, 0.2182F, 0.2182F, -2.3562F);
        this.cube_r178.cubeList.add(new ModelBox(cube_r178, 116, 99, -0.5F, -0.5F, 0.0F, 1, 1, 2, 0.0F, true));

        this.cube_r179 = new AdvancedModelRenderer(this);
        this.cube_r179.setRotationPoint(2.3332F, -4.5125F, 1.0829F);
        this.ChestOsteoderms2.addChild(cube_r179);
        this.setRotateAngle(cube_r179, 0.2182F, 0.2182F, -2.3562F);
        this.cube_r179.cubeList.add(new ModelBox(cube_r179, 107, 36, -0.5F, -0.5F, 0.0F, 1, 1, 2, 0.0F, true));

        this.cube_r180 = new AdvancedModelRenderer(this);
        this.cube_r180.setRotationPoint(2.3332F, -2.7625F, 0.5829F);
        this.ChestOsteoderms2.addChild(cube_r180);
        this.setRotateAngle(cube_r180, 0.2182F, 0.2182F, -2.3562F);
        this.cube_r180.cubeList.add(new ModelBox(cube_r180, 100, 106, -0.5F, -0.5F, 0.0F, 1, 1, 2, 0.0F, true));

        this.cube_r181 = new AdvancedModelRenderer(this);
        this.cube_r181.setRotationPoint(2.4832F, -5.5125F, 1.3329F);
        this.ChestOsteoderms2.addChild(cube_r181);
        this.setRotateAngle(cube_r181, 0.2182F, 0.2182F, -0.7854F);
        this.cube_r181.cubeList.add(new ModelBox(cube_r181, 110, 47, -0.5F, -0.5F, 0.0F, 1, 1, 2, 0.0F, true));

        this.cube_r182 = new AdvancedModelRenderer(this);
        this.cube_r182.setRotationPoint(4.9832F, -5.5125F, 1.3329F);
        this.ChestOsteoderms2.addChild(cube_r182);
        this.setRotateAngle(cube_r182, 0.2182F, 0.2182F, -0.7854F);
        this.cube_r182.cubeList.add(new ModelBox(cube_r182, 48, 110, -0.5F, -0.5F, 0.0F, 1, 1, 2, 0.0F, true));

        this.cube_r183 = new AdvancedModelRenderer(this);
        this.cube_r183.setRotationPoint(7.9832F, -5.5125F, 1.3329F);
        this.ChestOsteoderms2.addChild(cube_r183);
        this.setRotateAngle(cube_r183, 0.2182F, 0.2182F, -0.7854F);
        this.cube_r183.cubeList.add(new ModelBox(cube_r183, 111, 0, -0.5F, -0.5F, 0.0F, 1, 1, 2, 0.0F, true));

        this.cube_r184 = new AdvancedModelRenderer(this);
        this.cube_r184.setRotationPoint(8.2332F, -5.5125F, -1.6671F);
        this.ChestOsteoderms2.addChild(cube_r184);
        this.setRotateAngle(cube_r184, 0.2182F, 0.2182F, -0.7854F);
        this.cube_r184.cubeList.add(new ModelBox(cube_r184, 90, 114, -0.5F, -0.5F, 0.0F, 1, 1, 2, 0.0F, true));

        this.cube_r185 = new AdvancedModelRenderer(this);
        this.cube_r185.setRotationPoint(5.4832F, -5.5125F, -1.6671F);
        this.ChestOsteoderms2.addChild(cube_r185);
        this.setRotateAngle(cube_r185, 0.2182F, 0.2182F, -0.7854F);
        this.cube_r185.cubeList.add(new ModelBox(cube_r185, 97, 114, -0.5F, -0.5F, 0.0F, 1, 1, 2, 0.0F, true));

        this.cube_r186 = new AdvancedModelRenderer(this);
        this.cube_r186.setRotationPoint(2.7332F, -5.5125F, -1.6671F);
        this.ChestOsteoderms2.addChild(cube_r186);
        this.setRotateAngle(cube_r186, 0.2182F, 0.2182F, -0.7854F);
        this.cube_r186.cubeList.add(new ModelBox(cube_r186, 56, 116, -0.5F, -0.5F, 0.0F, 1, 1, 2, 0.0F, true));

        this.leftArm1 = new AdvancedModelRenderer(this);
        this.leftArm1.setRotationPoint(6.4F, 4.5F, -6.0F);
        this.chest.addChild(leftArm1);
        this.setRotateAngle(leftArm1, 0.3927F, 0.48F, -0.0873F);
        this.leftArm1.cubeList.add(new ModelBox(leftArm1, 82, 63, -2.0F, -1.55F, -3.3F, 4, 10, 5, 0.0F, false));

        this.LeftArmOsteoderms1 = new AdvancedModelRenderer(this);
        this.LeftArmOsteoderms1.setRotationPoint(1.45F, 4.6F, -1.75F);
        this.leftArm1.addChild(LeftArmOsteoderms1);


        this.cube_r187 = new AdvancedModelRenderer(this);
        this.cube_r187.setRotationPoint(0.0F, 0.25F, 2.25F);
        this.LeftArmOsteoderms1.addChild(cube_r187);
        this.setRotateAngle(cube_r187, 1.5708F, 0.7854F, 2.8798F);
        this.cube_r187.cubeList.add(new ModelBox(cube_r187, 49, 114, -0.5F, -0.5F, 0.0F, 1, 1, 2, 0.0F, false));

        this.cube_r188 = new AdvancedModelRenderer(this);
        this.cube_r188.setRotationPoint(0.0F, -2.75F, 0.85F);
        this.LeftArmOsteoderms1.addChild(cube_r188);
        this.setRotateAngle(cube_r188, 1.5708F, 0.7854F, 2.8798F);
        this.cube_r188.cubeList.add(new ModelBox(cube_r188, 114, 36, -0.5F, -0.5F, 0.0F, 1, 1, 2, 0.0F, false));

        this.cube_r189 = new AdvancedModelRenderer(this);
        this.cube_r189.setRotationPoint(0.0F, -5.5F, 0.0F);
        this.LeftArmOsteoderms1.addChild(cube_r189);
        this.setRotateAngle(cube_r189, 1.5708F, 0.7854F, 2.8798F);
        this.cube_r189.cubeList.add(new ModelBox(cube_r189, 114, 32, -0.5F, -0.5F, 0.0F, 1, 1, 2, 0.0F, false));

        this.cube_r190 = new AdvancedModelRenderer(this);
        this.cube_r190.setRotationPoint(0.0F, -5.5F, 1.75F);
        this.LeftArmOsteoderms1.addChild(cube_r190);
        this.setRotateAngle(cube_r190, 1.5708F, 0.7854F, 2.8798F);
        this.cube_r190.cubeList.add(new ModelBox(cube_r190, 35, 114, -0.5F, -0.5F, 0.0F, 1, 1, 2, 0.0F, false));

        this.cube_r191 = new AdvancedModelRenderer(this);
        this.cube_r191.setRotationPoint(0.0F, -2.75F, 2.5F);
        this.LeftArmOsteoderms1.addChild(cube_r191);
        this.setRotateAngle(cube_r191, 1.5708F, 0.7854F, 2.8798F);
        this.cube_r191.cubeList.add(new ModelBox(cube_r191, 42, 114, -0.5F, -0.5F, 0.0F, 1, 1, 2, 0.0F, false));

        this.leftArm2 = new AdvancedModelRenderer(this);
        this.leftArm2.setRotationPoint(0.0F, 7.25F, -0.7F);
        this.leftArm1.addChild(leftArm2);
        this.setRotateAngle(leftArm2, -1.0472F, 0.0F, 0.0F);
        this.leftArm2.cubeList.add(new ModelBox(leftArm2, 88, 44, -1.5F, -1.45F, -1.8F, 3, 8, 4, 0.0F, false));

        this.LeftArmOsteoderms2 = new AdvancedModelRenderer(this);
        this.LeftArmOsteoderms2.setRotationPoint(0.0F, 1.5F, 1.75F);
        this.leftArm2.addChild(LeftArmOsteoderms2);


        this.cube_r192 = new AdvancedModelRenderer(this);
        this.cube_r192.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.LeftArmOsteoderms2.addChild(cube_r192);
        this.setRotateAngle(cube_r192, -0.5299F, -0.7119F, 0.3655F);
        this.cube_r192.cubeList.add(new ModelBox(cube_r192, 82, 104, -1.0F, -1.0F, -1.0F, 2, 1, 2, 0.0F, false));

        this.cube_r193 = new AdvancedModelRenderer(this);
        this.cube_r193.setRotationPoint(0.0F, -2.0F, 0.0F);
        this.LeftArmOsteoderms2.addChild(cube_r193);
        this.setRotateAngle(cube_r193, -0.5299F, -0.7119F, 0.3655F);
        this.cube_r193.cubeList.add(new ModelBox(cube_r193, 73, 104, -1.0F, -1.0F, -1.0F, 2, 1, 2, 0.0F, false));

        this.leftHand = new AdvancedModelRenderer(this);
        this.leftHand.setRotationPoint(0.0F, 5.5F, 0.25F);
        this.leftArm2.addChild(leftHand);
        this.setRotateAngle(leftHand, 0.4363F, -0.3927F, -0.2182F);
        this.leftHand.cubeList.add(new ModelBox(leftHand, 86, 14, -2.5F, 0.0F, -4.0F, 5, 2, 5, 0.0F, false));

        this.rightArm1 = new AdvancedModelRenderer(this);
        this.rightArm1.setRotationPoint(-6.4F, 4.5F, -6.0F);
        this.chest.addChild(rightArm1);
        this.setRotateAngle(rightArm1, 0.3927F, -0.48F, 0.0873F);
        this.rightArm1.cubeList.add(new ModelBox(rightArm1, 82, 63, -2.0F, -1.55F, -3.3F, 4, 10, 5, 0.0F, true));

        this.RightArmOsteoderms1 = new AdvancedModelRenderer(this);
        this.RightArmOsteoderms1.setRotationPoint(-1.45F, 4.6F, -1.75F);
        this.rightArm1.addChild(RightArmOsteoderms1);


        this.cube_r194 = new AdvancedModelRenderer(this);
        this.cube_r194.setRotationPoint(0.0F, 0.25F, 2.25F);
        this.RightArmOsteoderms1.addChild(cube_r194);
        this.setRotateAngle(cube_r194, 1.5708F, -0.7854F, -2.8798F);
        this.cube_r194.cubeList.add(new ModelBox(cube_r194, 49, 114, -0.5F, -0.5F, 0.0F, 1, 1, 2, 0.0F, true));

        this.cube_r195 = new AdvancedModelRenderer(this);
        this.cube_r195.setRotationPoint(0.0F, -2.75F, 0.85F);
        this.RightArmOsteoderms1.addChild(cube_r195);
        this.setRotateAngle(cube_r195, 1.5708F, -0.7854F, -2.8798F);
        this.cube_r195.cubeList.add(new ModelBox(cube_r195, 114, 36, -0.5F, -0.5F, 0.0F, 1, 1, 2, 0.0F, true));

        this.cube_r196 = new AdvancedModelRenderer(this);
        this.cube_r196.setRotationPoint(0.0F, -5.5F, 0.0F);
        this.RightArmOsteoderms1.addChild(cube_r196);
        this.setRotateAngle(cube_r196, 1.5708F, -0.7854F, -2.8798F);
        this.cube_r196.cubeList.add(new ModelBox(cube_r196, 114, 32, -0.5F, -0.5F, 0.0F, 1, 1, 2, 0.0F, true));

        this.cube_r197 = new AdvancedModelRenderer(this);
        this.cube_r197.setRotationPoint(0.0F, -5.5F, 1.75F);
        this.RightArmOsteoderms1.addChild(cube_r197);
        this.setRotateAngle(cube_r197, 1.5708F, -0.7854F, -2.8798F);
        this.cube_r197.cubeList.add(new ModelBox(cube_r197, 35, 114, -0.5F, -0.5F, 0.0F, 1, 1, 2, 0.0F, true));

        this.cube_r198 = new AdvancedModelRenderer(this);
        this.cube_r198.setRotationPoint(0.0F, -2.75F, 2.5F);
        this.RightArmOsteoderms1.addChild(cube_r198);
        this.setRotateAngle(cube_r198, 1.5708F, -0.7854F, -2.8798F);
        this.cube_r198.cubeList.add(new ModelBox(cube_r198, 42, 114, -0.5F, -0.5F, 0.0F, 1, 1, 2, 0.0F, true));

        this.rightArm2 = new AdvancedModelRenderer(this);
        this.rightArm2.setRotationPoint(0.0F, 7.25F, -0.7F);
        this.rightArm1.addChild(rightArm2);
        this.setRotateAngle(rightArm2, -1.0472F, 0.0F, 0.0F);
        this.rightArm2.cubeList.add(new ModelBox(rightArm2, 88, 44, -1.5F, -1.45F, -1.8F, 3, 8, 4, 0.0F, true));

        this.RightArmOsteoderms2 = new AdvancedModelRenderer(this);
        this.RightArmOsteoderms2.setRotationPoint(0.0F, 1.5F, 1.75F);
        this.rightArm2.addChild(RightArmOsteoderms2);


        this.cube_r199 = new AdvancedModelRenderer(this);
        this.cube_r199.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.RightArmOsteoderms2.addChild(cube_r199);
        this.setRotateAngle(cube_r199, -0.5299F, 0.7119F, -0.3655F);
        this.cube_r199.cubeList.add(new ModelBox(cube_r199, 82, 104, -1.0F, -1.0F, -1.0F, 2, 1, 2, 0.0F, true));

        this.cube_r200 = new AdvancedModelRenderer(this);
        this.cube_r200.setRotationPoint(0.0F, -2.0F, 0.0F);
        this.RightArmOsteoderms2.addChild(cube_r200);
        this.setRotateAngle(cube_r200, -0.5299F, 0.7119F, -0.3655F);
        this.cube_r200.cubeList.add(new ModelBox(cube_r200, 73, 104, -1.0F, -1.0F, -1.0F, 2, 1, 2, 0.0F, true));

        this.rightHand = new AdvancedModelRenderer(this);
        this.rightHand.setRotationPoint(0.0F, 5.5F, 0.25F);
        this.rightArm2.addChild(rightHand);
        this.setRotateAngle(rightHand, 0.4363F, 0.3927F, 0.2182F);
        this.rightHand.cubeList.add(new ModelBox(rightHand, 86, 14, -2.5F, 0.0F, -4.0F, 5, 2, 5, 0.0F, true));

        this.neck1 = new AdvancedModelRenderer(this);
        this.neck1.setRotationPoint(0.5F, -0.25F, -9.0F);
        this.chest.addChild(neck1);
        this.setRotateAngle(neck1, -0.3927F, 0.0F, 0.0F);
        this.neck1.cubeList.add(new ModelBox(neck1, 65, 14, -3.5F, -1.75F, -2.0F, 6, 6, 4, 0.0F, false));

        this.NeckOsteoderms1 = new AdvancedModelRenderer(this);
        this.NeckOsteoderms1.setRotationPoint(2.5F, -2.25F, -1.0F);
        this.neck1.addChild(NeckOsteoderms1);


        this.cube_r201 = new AdvancedModelRenderer(this);
        this.cube_r201.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.NeckOsteoderms1.addChild(cube_r201);
        this.setRotateAngle(cube_r201, -0.1116F, -0.3539F, -0.962F);
        this.cube_r201.cubeList.add(new ModelBox(cube_r201, 101, 65, -2.0171F, -1.0F, 0.261F, 4, 1, 1, 0.0F, false));

        this.cube_r202 = new AdvancedModelRenderer(this);
        this.cube_r202.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.NeckOsteoderms1.addChild(cube_r202);
        this.setRotateAngle(cube_r202, -0.1048F, 0.0365F, -1.0047F);
        this.cube_r202.cubeList.add(new ModelBox(cube_r202, 71, 96, -1.7679F, -1.0F, 0.866F, 5, 1, 1, 0.01F, false));

        this.cube_r203 = new AdvancedModelRenderer(this);
        this.cube_r203.setRotationPoint(2.2332F, 4.3625F, 0.6671F);
        this.NeckOsteoderms1.addChild(cube_r203);
        this.setRotateAngle(cube_r203, 0.1318F, -0.4934F, 0.2462F);
        this.cube_r203.cubeList.add(new ModelBox(cube_r203, 106, 92, -3.0F, -1.0F, 0.0F, 3, 1, 1, 0.0F, false));

        this.cube_r204 = new AdvancedModelRenderer(this);
        this.cube_r204.setRotationPoint(0.65F, 4.0F, -0.5F);
        this.NeckOsteoderms1.addChild(cube_r204);
        this.setRotateAngle(cube_r204, 0.1167F, -0.1036F, 0.2968F);
        this.cube_r204.cubeList.add(new ModelBox(cube_r204, 56, 99, -1.7679F, -1.0F, 0.866F, 5, 1, 1, 0.01F, false));

        this.NeckOsteoderms6 = new AdvancedModelRenderer(this);
        this.NeckOsteoderms6.setRotationPoint(-3.5F, -2.25F, -1.0F);
        this.neck1.addChild(NeckOsteoderms6);


        this.cube_r205 = new AdvancedModelRenderer(this);
        this.cube_r205.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.NeckOsteoderms6.addChild(cube_r205);
        this.setRotateAngle(cube_r205, -0.1116F, 0.3539F, 0.962F);
        this.cube_r205.cubeList.add(new ModelBox(cube_r205, 101, 65, -1.9829F, -1.0F, 0.261F, 4, 1, 1, 0.0F, true));

        this.cube_r206 = new AdvancedModelRenderer(this);
        this.cube_r206.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.NeckOsteoderms6.addChild(cube_r206);
        this.setRotateAngle(cube_r206, -0.1048F, -0.0365F, 1.0047F);
        this.cube_r206.cubeList.add(new ModelBox(cube_r206, 71, 96, -3.2321F, -1.0F, 0.866F, 5, 1, 1, 0.01F, true));

        this.cube_r207 = new AdvancedModelRenderer(this);
        this.cube_r207.setRotationPoint(-2.2332F, 4.3625F, 0.6671F);
        this.NeckOsteoderms6.addChild(cube_r207);
        this.setRotateAngle(cube_r207, 0.1318F, 0.4934F, -0.2462F);
        this.cube_r207.cubeList.add(new ModelBox(cube_r207, 106, 92, 0.0F, -1.0F, 0.0F, 3, 1, 1, 0.0F, true));

        this.cube_r208 = new AdvancedModelRenderer(this);
        this.cube_r208.setRotationPoint(-0.65F, 4.0F, -0.5F);
        this.NeckOsteoderms6.addChild(cube_r208);
        this.setRotateAngle(cube_r208, 0.1167F, 0.1036F, -0.2968F);
        this.cube_r208.cubeList.add(new ModelBox(cube_r208, 56, 99, -3.232F, -1.0F, 0.866F, 5, 1, 1, 0.01F, true));

        this.neck2 = new AdvancedModelRenderer(this);
        this.neck2.setRotationPoint(-0.5F, -0.25F, -2.0F);
        this.neck1.addChild(neck2);
        this.setRotateAngle(neck2, -0.0873F, 0.0F, 0.0F);
        this.neck2.cubeList.add(new ModelBox(neck2, 89, 79, -2.0F, -1.25F, -3.0F, 4, 5, 4, 0.0F, false));

        this.NeckOsteoderms2 = new AdvancedModelRenderer(this);
        this.NeckOsteoderms2.setRotationPoint(2.8319F, -2.7462F, -1.3329F);
        this.neck2.addChild(NeckOsteoderms2);


        this.cube_r209 = new AdvancedModelRenderer(this);
        this.cube_r209.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.NeckOsteoderms2.addChild(cube_r209);
        this.setRotateAngle(cube_r209, 0.0847F, -0.3237F, -1.1241F);
        this.cube_r209.cubeList.add(new ModelBox(cube_r209, 104, 99, -3.3F, -1.0F, 0.0F, 3, 1, 1, 0.0F, false));

        this.cube_r210 = new AdvancedModelRenderer(this);
        this.cube_r210.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.NeckOsteoderms2.addChild(cube_r210);
        this.setRotateAngle(cube_r210, 0.0808F, 0.1112F, -1.0881F);
        this.cube_r210.cubeList.add(new ModelBox(cube_r210, 100, 0, -2.5F, -1.0F, -0.134F, 4, 1, 1, 0.01F, false));

        this.cube_r211 = new AdvancedModelRenderer(this);
        this.cube_r211.setRotationPoint(-0.8319F, 4.7462F, -0.6671F);
        this.NeckOsteoderms2.addChild(cube_r211);
        this.setRotateAngle(cube_r211, 0.1431F, -0.6231F, 0.2251F);
        this.cube_r211.cubeList.add(new ModelBox(cube_r211, 103, 59, -1.0F, -1.0F, 0.0F, 3, 1, 1, 0.0F, false));

        this.cube_r212 = new AdvancedModelRenderer(this);
        this.cube_r212.setRotationPoint(-0.8319F, 4.7462F, -0.6671F);
        this.NeckOsteoderms2.addChild(cube_r212);
        this.setRotateAngle(cube_r212, 0.1167F, -0.1036F, 0.2968F);
        this.cube_r212.cubeList.add(new ModelBox(cube_r212, 100, 3, -0.7679F, -1.0F, 0.866F, 4, 1, 1, 0.01F, false));

        this.NeckOsteoderms5 = new AdvancedModelRenderer(this);
        this.NeckOsteoderms5.setRotationPoint(-2.8319F, -2.7462F, -1.3329F);
        this.neck2.addChild(NeckOsteoderms5);


        this.cube_r213 = new AdvancedModelRenderer(this);
        this.cube_r213.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.NeckOsteoderms5.addChild(cube_r213);
        this.setRotateAngle(cube_r213, 0.0847F, 0.3237F, 1.1241F);
        this.cube_r213.cubeList.add(new ModelBox(cube_r213, 104, 99, 0.3F, -1.0F, 0.0F, 3, 1, 1, 0.0F, true));

        this.cube_r214 = new AdvancedModelRenderer(this);
        this.cube_r214.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.NeckOsteoderms5.addChild(cube_r214);
        this.setRotateAngle(cube_r214, 0.0808F, -0.1112F, 1.0881F);
        this.cube_r214.cubeList.add(new ModelBox(cube_r214, 100, 0, -1.5F, -1.0F, -0.134F, 4, 1, 1, 0.01F, true));

        this.cube_r215 = new AdvancedModelRenderer(this);
        this.cube_r215.setRotationPoint(0.8319F, 4.7462F, -0.6671F);
        this.NeckOsteoderms5.addChild(cube_r215);
        this.setRotateAngle(cube_r215, 0.1431F, 0.6231F, -0.2251F);
        this.cube_r215.cubeList.add(new ModelBox(cube_r215, 103, 59, -2.0F, -1.0F, 0.0F, 3, 1, 1, 0.0F, true));

        this.cube_r216 = new AdvancedModelRenderer(this);
        this.cube_r216.setRotationPoint(0.8319F, 4.7462F, -0.6671F);
        this.NeckOsteoderms5.addChild(cube_r216);
        this.setRotateAngle(cube_r216, 0.1167F, 0.1036F, -0.2968F);
        this.cube_r216.cubeList.add(new ModelBox(cube_r216, 100, 3, -3.2321F, -1.0F, 0.866F, 4, 1, 1, 0.01F, true));

        this.neck3 = new AdvancedModelRenderer(this);
        this.neck3.setRotationPoint(0.0F, 0.5F, -3.0F);
        this.neck2.addChild(neck3);
        this.setRotateAngle(neck3, 0.2618F, 0.0F, 0.0F);
        this.neck3.cubeList.add(new ModelBox(neck3, 89, 89, -1.5F, -1.5F, -4.0F, 3, 4, 5, 0.0F, false));

        this.NeckOsteoderms3 = new AdvancedModelRenderer(this);
        this.NeckOsteoderms3.setRotationPoint(2.0196F, -1.7192F, -0.082F);
        this.neck3.addChild(NeckOsteoderms3);


        this.cube_r217 = new AdvancedModelRenderer(this);
        this.cube_r217.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.NeckOsteoderms3.addChild(cube_r217);
        this.setRotateAngle(cube_r217, 0.0F, -0.5672F, -0.9599F);
        this.cube_r217.cubeList.add(new ModelBox(cube_r217, 117, 70, -2.0F, -1.0F, -1.0F, 2, 1, 1, 0.0F, false));

        this.cube_r218 = new AdvancedModelRenderer(this);
        this.cube_r218.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.NeckOsteoderms3.addChild(cube_r218);
        this.setRotateAngle(cube_r218, 0.0F, -0.0436F, -0.9599F);
        this.cube_r218.cubeList.add(new ModelBox(cube_r218, 100, 6, -2.0F, -1.0F, -1.0F, 4, 1, 1, 0.01F, false));

        this.cube_r219 = new AdvancedModelRenderer(this);
        this.cube_r219.setRotationPoint(0.0F, 3.5F, 0.0F);
        this.NeckOsteoderms3.addChild(cube_r219);
        this.setRotateAngle(cube_r219, 0.0F, -0.0436F, 0.3927F);
        this.cube_r219.cubeList.add(new ModelBox(cube_r219, 101, 62, -2.0F, -1.0F, -1.0F, 4, 1, 1, 0.01F, false));

        this.cube_r220 = new AdvancedModelRenderer(this);
        this.cube_r220.setRotationPoint(0.0F, 3.5F, 0.0F);
        this.NeckOsteoderms3.addChild(cube_r220);
        this.setRotateAngle(cube_r220, 0.0F, -0.5672F, 0.3927F);
        this.cube_r220.cubeList.add(new ModelBox(cube_r220, 117, 67, -2.0F, -1.0F, -1.0F, 2, 1, 1, 0.0F, false));

        this.NeckOsteoderms4 = new AdvancedModelRenderer(this);
        this.NeckOsteoderms4.setRotationPoint(-2.0196F, -1.7192F, -0.082F);
        this.neck3.addChild(NeckOsteoderms4);


        this.cube_r221 = new AdvancedModelRenderer(this);
        this.cube_r221.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.NeckOsteoderms4.addChild(cube_r221);
        this.setRotateAngle(cube_r221, 0.0F, 0.5672F, 0.9599F);
        this.cube_r221.cubeList.add(new ModelBox(cube_r221, 117, 70, 0.0F, -1.0F, -1.0F, 2, 1, 1, 0.0F, true));

        this.cube_r222 = new AdvancedModelRenderer(this);
        this.cube_r222.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.NeckOsteoderms4.addChild(cube_r222);
        this.setRotateAngle(cube_r222, 0.0F, 0.0436F, 0.9599F);
        this.cube_r222.cubeList.add(new ModelBox(cube_r222, 100, 6, -2.0F, -1.0F, -1.0F, 4, 1, 1, 0.01F, true));

        this.cube_r223 = new AdvancedModelRenderer(this);
        this.cube_r223.setRotationPoint(0.0F, 3.5F, 0.0F);
        this.NeckOsteoderms4.addChild(cube_r223);
        this.setRotateAngle(cube_r223, 0.0F, 0.0436F, -0.3927F);
        this.cube_r223.cubeList.add(new ModelBox(cube_r223, 101, 62, -2.0F, -1.0F, -1.0F, 4, 1, 1, 0.01F, true));

        this.cube_r224 = new AdvancedModelRenderer(this);
        this.cube_r224.setRotationPoint(0.0F, 3.5F, 0.0F);
        this.NeckOsteoderms4.addChild(cube_r224);
        this.setRotateAngle(cube_r224, 0.0F, 0.5672F, -0.3927F);
        this.cube_r224.cubeList.add(new ModelBox(cube_r224, 117, 67, 0.0F, -1.0F, -1.0F, 2, 1, 1, 0.0F, true));

        this.head = new AdvancedModelRenderer(this);
        this.head.setRotationPoint(0.0F, 0.0F, -3.0F);
        this.neck3.addChild(head);
        this.setRotateAngle(head, 0.5236F, 0.0F, 0.0F);
        this.head.cubeList.add(new ModelBox(head, 92, 31, -2.0F, -1.85F, -3.0F, 4, 3, 3, 0.01F, false));

        this.cube_r225 = new AdvancedModelRenderer(this);
        this.cube_r225.setRotationPoint(-1.0F, 0.972F, -6.1226F);
        this.head.addChild(cube_r225);
        this.setRotateAngle(cube_r225, 0.6109F, 0.0F, 0.0F);
        this.cube_r225.cubeList.add(new ModelBox(cube_r225, 117, 51, 0.0F, -0.9F, 0.25F, 2, 1, 1, 0.02F, false));

        this.cube_r226 = new AdvancedModelRenderer(this);
        this.cube_r226.setRotationPoint(-1.0F, -0.5285F, -6.6307F);
        this.head.addChild(cube_r226);
        this.setRotateAngle(cube_r226, 1.8326F, 0.0F, 0.0F);
        this.cube_r226.cubeList.add(new ModelBox(cube_r226, 117, 48, 0.0F, -0.65F, -1.6F, 2, 1, 1, 0.03F, false));

        this.cube_r227 = new AdvancedModelRenderer(this);
        this.cube_r227.setRotationPoint(-1.0F, -0.5285F, -6.6307F);
        this.head.addChild(cube_r227);
        this.setRotateAngle(cube_r227, 1.1345F, 0.0F, 0.0F);
        this.cube_r227.cubeList.add(new ModelBox(cube_r227, 116, 103, 0.0F, 0.0F, -1.0F, 2, 1, 1, 0.0F, false));

        this.cube_r228 = new AdvancedModelRenderer(this);
        this.cube_r228.setRotationPoint(-1.0F, -1.6757F, -4.9924F);
        this.head.addChild(cube_r228);
        this.setRotateAngle(cube_r228, 0.6109F, 0.0F, 0.0F);
        this.cube_r228.cubeList.add(new ModelBox(cube_r228, 103, 43, 0.0F, 0.0F, -2.0F, 2, 1, 2, 0.01F, false));

        this.cube_r229 = new AdvancedModelRenderer(this);
        this.cube_r229.setRotationPoint(-1.0F, -1.85F, -3.0F);
        this.head.addChild(cube_r229);
        this.setRotateAngle(cube_r229, 0.0873F, 0.0F, 0.0F);
        this.cube_r229.cubeList.add(new ModelBox(cube_r229, 69, 99, 0.0F, 1.0F, -3.15F, 2, 1, 3, -0.01F, false));
        this.cube_r229.cubeList.add(new ModelBox(cube_r229, 100, 102, 0.0F, 0.0F, -2.0F, 2, 1, 2, 0.0F, false));

        this.cube_r230 = new AdvancedModelRenderer(this);
        this.cube_r230.setRotationPoint(-1.75F, -0.6F, -1.5F);
        this.head.addChild(cube_r230);
        this.setRotateAngle(cube_r230, -0.6981F, -0.0873F, 0.4363F);
        this.cube_r230.cubeList.add(new ModelBox(cube_r230, 110, 68, 0.0F, 0.0F, 0.0F, 1, 1, 2, 0.0F, true));

        this.cube_r231 = new AdvancedModelRenderer(this);
        this.cube_r231.setRotationPoint(-1.95F, -1.85F, -3.0F);
        this.head.addChild(cube_r231);
        this.setRotateAngle(cube_r231, 0.0873F, -0.3491F, 0.0F);
        this.cube_r231.cubeList.add(new ModelBox(cube_r231, 28, 100, 0.0F, 1.0F, -3.0F, 1, 1, 3, 0.0F, true));

        this.cube_r232 = new AdvancedModelRenderer(this);
        this.cube_r232.setRotationPoint(-1.95F, -1.85F, -3.0F);
        this.head.addChild(cube_r232);
        this.setRotateAngle(cube_r232, 0.0873F, -0.5236F, 0.0F);
        this.cube_r232.cubeList.add(new ModelBox(cube_r232, 110, 55, 0.0F, 0.0F, -2.0F, 1, 1, 2, 0.0F, true));

        this.cube_r233 = new AdvancedModelRenderer(this);
        this.cube_r233.setRotationPoint(-2.0F, -1.85F, -3.0F);
        this.head.addChild(cube_r233);
        this.setRotateAngle(cube_r233, 0.0436F, -0.1745F, 0.0873F);
        this.cube_r233.cubeList.add(new ModelBox(cube_r233, 37, 101, 0.0F, 0.0F, 0.0F, 1, 1, 3, 0.0F, true));

        this.cube_r234 = new AdvancedModelRenderer(this);
        this.cube_r234.setRotationPoint(1.95F, -1.85F, -3.0F);
        this.head.addChild(cube_r234);
        this.setRotateAngle(cube_r234, 0.0873F, 0.3491F, 0.0F);
        this.cube_r234.cubeList.add(new ModelBox(cube_r234, 28, 100, -1.0F, 1.0F, -3.0F, 1, 1, 3, 0.0F, false));

        this.cube_r235 = new AdvancedModelRenderer(this);
        this.cube_r235.setRotationPoint(1.95F, -1.85F, -3.0F);
        this.head.addChild(cube_r235);
        this.setRotateAngle(cube_r235, 0.0873F, 0.5236F, 0.0F);
        this.cube_r235.cubeList.add(new ModelBox(cube_r235, 110, 55, -1.0F, 0.0F, -2.0F, 1, 1, 2, 0.0F, false));

        this.cube_r236 = new AdvancedModelRenderer(this);
        this.cube_r236.setRotationPoint(1.75F, -0.6F, -1.5F);
        this.head.addChild(cube_r236);
        this.setRotateAngle(cube_r236, -0.6981F, 0.0873F, -0.4363F);
        this.cube_r236.cubeList.add(new ModelBox(cube_r236, 110, 68, -1.0F, 0.0F, 0.0F, 1, 1, 2, 0.0F, false));

        this.cube_r237 = new AdvancedModelRenderer(this);
        this.cube_r237.setRotationPoint(2.0F, -1.85F, -3.0F);
        this.head.addChild(cube_r237);
        this.setRotateAngle(cube_r237, 0.0436F, 0.1745F, -0.0873F);
        this.cube_r237.cubeList.add(new ModelBox(cube_r237, 37, 101, -1.0F, 0.0F, 0.0F, 1, 1, 3, 0.0F, false));

        this.jaw = new AdvancedModelRenderer(this);
        this.jaw.setRotationPoint(0.0F, 1.15F, -0.75F);
        this.head.addChild(jaw);
        this.setRotateAngle(jaw, 0.0436F, 0.0F, 0.0F);
        this.jaw.cubeList.add(new ModelBox(jaw, 88, 57, -2.0F, -0.15F, -2.25F, 4, 1, 3, -0.02F, false));

        this.cube_r238 = new AdvancedModelRenderer(this);
        this.cube_r238.setRotationPoint(-0.9923F, -0.9274F, -4.4255F);
        this.jaw.addChild(cube_r238);
        this.setRotateAngle(cube_r238, -0.3467F, -0.2839F, 0.1696F);
        this.cube_r238.cubeList.add(new ModelBox(cube_r238, 103, 53, 0.0623F, -2.0F, 0.1F, 0, 2, 3, 0.0F, true));
        this.cube_r238.cubeList.add(new ModelBox(cube_r238, 103, 47, 0.05F, -2.0F, 0.1F, 0, 2, 3, 0.0F, true));

        this.cube_r239 = new AdvancedModelRenderer(this);
        this.cube_r239.setRotationPoint(0.9923F, -0.9274F, -4.4255F);
        this.jaw.addChild(cube_r239);
        this.setRotateAngle(cube_r239, -0.3467F, 0.2839F, -0.1696F);
        this.cube_r239.cubeList.add(new ModelBox(cube_r239, 103, 53, -0.0623F, -2.0F, 0.1F, 0, 2, 3, 0.0F, false));
        this.cube_r239.cubeList.add(new ModelBox(cube_r239, 103, 47, -0.05F, -2.0F, 0.1F, 0, 2, 3, 0.0F, false));

        this.cube_r240 = new AdvancedModelRenderer(this);
        this.cube_r240.setRotationPoint(-1.9F, -0.75F, -2.1F);
        this.jaw.addChild(cube_r240);
        this.setRotateAngle(cube_r240, -0.1533F, -0.3534F, 0.1164F);
        this.cube_r240.cubeList.add(new ModelBox(cube_r240, 46, 101, 0.0F, 0.1F, -3.0F, 1, 1, 3, 0.0F, true));

        this.cube_r241 = new AdvancedModelRenderer(this);
        this.cube_r241.setRotationPoint(1.9F, -0.75F, -2.1F);
        this.jaw.addChild(cube_r241);
        this.setRotateAngle(cube_r241, -0.1533F, 0.3534F, -0.1164F);
        this.cube_r241.cubeList.add(new ModelBox(cube_r241, 46, 101, -1.0F, 0.1F, -3.0F, 1, 1, 3, 0.0F, false));

        this.cube_r242 = new AdvancedModelRenderer(this);
        this.cube_r242.setRotationPoint(-1.0F, -0.65F, -2.35F);
        this.jaw.addChild(cube_r242);
        this.setRotateAngle(cube_r242, 0.1571F, 0.0F, 0.0F);
        this.cube_r242.cubeList.add(new ModelBox(cube_r242, 92, 38, -1.0F, 0.0F, -0.05F, 4, 1, 3, -0.01F, false));

        this.cube_r243 = new AdvancedModelRenderer(this);
        this.cube_r243.setRotationPoint(-1.0F, 0.75F, -2.25F);
        this.jaw.addChild(cube_r243);
        this.setRotateAngle(cube_r243, -0.2618F, 0.0F, 0.0F);
        this.cube_r243.cubeList.add(new ModelBox(cube_r243, 117, 54, 0.0F, -1.0F, -3.95F, 2, 1, 1, 0.01F, false));
        this.cube_r243.cubeList.add(new ModelBox(cube_r243, 15, 96, 0.0F, -1.0F, -3.7F, 2, 1, 4, 0.0F, false));

        this.cube_r244 = new AdvancedModelRenderer(this);
        this.cube_r244.setRotationPoint(-1.0F, -0.9924F, -4.889F);
        this.jaw.addChild(cube_r244);
        this.setRotateAngle(cube_r244, -0.1309F, 0.0F, 0.0F);
        this.cube_r244.cubeList.add(new ModelBox(cube_r244, 80, 99, 0.0F, 0.0F, 0.0F, 2, 1, 3, -0.01F, false));

        this.cube_r245 = new AdvancedModelRenderer(this);
        this.cube_r245.setRotationPoint(-1.0F, -0.65F, -2.25F);
        this.jaw.addChild(cube_r245);
        this.setRotateAngle(cube_r245, -0.5847F, 0.0F, 0.0F);
        this.cube_r245.cubeList.add(new ModelBox(cube_r245, 43, 96, -1.0F, -1.9F, -0.15F, 4, 2, 2, -0.03F, false));

        this.throat = new AdvancedModelRenderer(this);
        this.throat.setRotationPoint(0.0F, 0.85F, -2.25F);
        this.jaw.addChild(throat);
        this.setRotateAngle(throat, 0.0873F, 0.0F, 0.0F);


        this.cube_r246 = new AdvancedModelRenderer(this);
        this.cube_r246.setRotationPoint(-1.0F, 0.0F, 0.0F);
        this.throat.addChild(cube_r246);
        this.setRotateAngle(cube_r246, -0.6981F, 0.0F, 0.0F);
        this.cube_r246.cubeList.add(new ModelBox(cube_r246, 0, 95, 0.0F, -1.0F, 0.0F, 2, 1, 5, -0.02F, false));
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
        this.resetToDefaultPose();
    }

    @Override
    public void renderStaticBook(float f) {
        //Rotations, positions and sizing:
        this.hips.offsetY = 0.16F;
        this.hips.offsetX = -0.03F;
        this.hips.rotateAngleY = (float)Math.toRadians(150);
        this.hips.rotateAngleX = (float)Math.toRadians(2);
        this.hips.rotateAngleZ = (float)Math.toRadians(0);
        this.hips.scaleChildren = true;
        float scaler = 0.646F;
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

        EntityPrehistoricFloraSauropelta entityYuxi = (EntityPrehistoricFloraSauropelta) e;

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
    public void setLivingAnimations(EntityLivingBase entitylivinghipsIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        super.setLivingAnimations(entitylivinghipsIn, limbSwing, limbSwingAmount, partialTickTime);
        this.resetToDefaultPose();

        EntityPrehistoricFloraSauropelta ee = (EntityPrehistoricFloraSauropelta) entitylivinghipsIn;

        if (ee.getAnimation() != ee.HIDE_ANIMATION) {
            if (!ee.isReallyInWater()) {
                if (ee.getIsMoving()) {
                    if (ee.getIsFast()) { //Running
                        animRunning(entitylivinghipsIn, limbSwing, limbSwingAmount, partialTickTime);
                    } else { //Walking
                        animWalking(entitylivinghipsIn, limbSwing, limbSwingAmount, partialTickTime);
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
            animEat(entitylivinghipsIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.ATTACK_ANIMATION) {
            //animAttack(entitylivinghipsIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.MAKE_NEST_ANIMATION) {
            animNest(entitylivinghipsIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.LAY_ANIMATION) {
            animLay(entitylivinghipsIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.ROAR_ANIMATION) { //The noise anim
            animNoise(entitylivinghipsIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.ALERT_ANIMATION) { //The noise anim
            //animAlert(entitylivinghipsIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.HIDE_ANIMATION) { //The hiding and unhiding anim
            animHide(entitylivinghipsIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.DRINK_ANIMATION) {
            animGraze(entitylivinghipsIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }

    }
    public void animGraze(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraSauropelta entity = (EntityPrehistoricFloraSauropelta) entitylivingbaseIn;
        int animCycle = 185;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
     if (tickAnim >= 0 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 0) / 50) * (-0.5-(0)));
            yy = 0 + (((tickAnim - 0) / 50) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 50) * (0-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 160) {
            xx = -0.5 + (((tickAnim - 50) / 110) * (-0.5-(-0.5)));
            yy = 0 + (((tickAnim - 50) / 110) * (0-(0)));
            zz = 0 + (((tickAnim - 50) / 110) * (0-(0)));
        }
        else if (tickAnim >= 160 && tickAnim < 185) {
            xx = -0.5 + (((tickAnim - 160) / 25) * (0-(-0.5)));
            yy = 0 + (((tickAnim - 160) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 160) / 25) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(hips, hips.rotateAngleX + (float) Math.toRadians(xx), hips.rotateAngleY + (float) Math.toRadians(yy), hips.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 0) / 50) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 50) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 50) * (-0.125-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 160) {
            xx = 0 + (((tickAnim - 50) / 110) * (0-(0)));
            yy = 0 + (((tickAnim - 50) / 110) * (0-(0)));
            zz = -0.125 + (((tickAnim - 50) / 110) * (-0.125-(-0.125)));
        }
        else if (tickAnim >= 160 && tickAnim < 185) {
            xx = 0 + (((tickAnim - 160) / 25) * (0-(0)));
            yy = 0 + (((tickAnim - 160) / 25) * (0-(0)));
            zz = -0.125 + (((tickAnim - 160) / 25) * (0-(-0.125)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.hips.rotationPointX = this.hips.rotationPointX + (float)(xx);
        this.hips.rotationPointY = this.hips.rotationPointY - (float)(yy);
        this.hips.rotationPointZ = this.hips.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 0) / 50) * (2-(0)));
            yy = 0 + (((tickAnim - 0) / 50) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 50) * (0-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 160) {
            xx = 2 + (((tickAnim - 50) / 110) * (2-(2)));
            yy = 0 + (((tickAnim - 50) / 110) * (0-(0)));
            zz = 0 + (((tickAnim - 50) / 110) * (0-(0)));
        }
        else if (tickAnim >= 160 && tickAnim < 185) {
            xx = 2 + (((tickAnim - 160) / 25) * (0-(2)));
            yy = 0 + (((tickAnim - 160) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 160) / 25) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg1, leftLeg1.rotateAngleX + (float) Math.toRadians(xx), leftLeg1.rotateAngleY + (float) Math.toRadians(yy), leftLeg1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 0) / 50) * (-6.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*90+50))*1-(0)));
            yy = 0 + (((tickAnim - 0) / 50) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 50) * (0-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 160) {
            xx = -6.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*90+50))*1 + (((tickAnim - 50) / 110) * (-6.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*90+50))*1-(-6.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*90+50))*1)));
            yy = 0 + (((tickAnim - 50) / 110) * (0-(0)));
            zz = 0 + (((tickAnim - 50) / 110) * (0-(0)));
        }
        else if (tickAnim >= 160 && tickAnim < 185) {
            xx = -6.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*90+50))*1 + (((tickAnim - 160) / 25) * (0-(-6.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*90+50))*1)));
            yy = 0 + (((tickAnim - 160) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 160) / 25) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail1, tail1.rotateAngleX + (float) Math.toRadians(xx), tail1.rotateAngleY + (float) Math.toRadians(yy), tail1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 0) / 50) * (-0.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*90))*0.5-(0)));
            yy = 0 + (((tickAnim - 0) / 50) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 50) * (0-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 160) {
            xx = -0.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*90))*0.5 + (((tickAnim - 50) / 110) * (-0.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*90))*0.5-(-0.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*90))*0.5)));
            yy = 0 + (((tickAnim - 50) / 110) * (0-(0)));
            zz = 0 + (((tickAnim - 50) / 110) * (0-(0)));
        }
        else if (tickAnim >= 160 && tickAnim < 185) {
            xx = -0.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*90))*0.5 + (((tickAnim - 160) / 25) * (0-(-0.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*90))*0.5)));
            yy = 0 + (((tickAnim - 160) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 160) / 25) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(xx), tail2.rotateAngleY + (float) Math.toRadians(yy), tail2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 0) / 50) * (-4+Math.sin((Math.PI/180)*(((double)tickAnim/20)*90-50))*0.5-(0)));
            yy = 0 + (((tickAnim - 0) / 50) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 50) * (0-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 160) {
            xx = -4+Math.sin((Math.PI/180)*(((double)tickAnim/20)*90-50))*0.5 + (((tickAnim - 50) / 110) * (-4+Math.sin((Math.PI/180)*(((double)tickAnim/20)*90-50))*0.5-(-4+Math.sin((Math.PI/180)*(((double)tickAnim/20)*90-50))*0.5)));
            yy = 0 + (((tickAnim - 50) / 110) * (0-(0)));
            zz = 0 + (((tickAnim - 50) / 110) * (0-(0)));
        }
        else if (tickAnim >= 160 && tickAnim < 185) {
            xx = -4+Math.sin((Math.PI/180)*(((double)tickAnim/20)*90-50))*0.5 + (((tickAnim - 160) / 25) * (0-(-4+Math.sin((Math.PI/180)*(((double)tickAnim/20)*90-50))*0.5)));
            yy = 0 + (((tickAnim - 160) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 160) / 25) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(xx), tail3.rotateAngleY + (float) Math.toRadians(yy), tail3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 0) / 50) * (6.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*90-100))*0.5-(0)));
            yy = 0 + (((tickAnim - 0) / 50) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 50) * (0-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 160) {
            xx = 6.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*90-100))*0.5 + (((tickAnim - 50) / 110) * (6.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*90-100))*0.5-(6.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*90-100))*0.5)));
            yy = 0 + (((tickAnim - 50) / 110) * (0-(0)));
            zz = 0 + (((tickAnim - 50) / 110) * (0-(0)));
        }
        else if (tickAnim >= 160 && tickAnim < 185) {
            xx = 6.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*90-100))*0.5 + (((tickAnim - 160) / 25) * (0-(6.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*90-100))*0.5)));
            yy = 0 + (((tickAnim - 160) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 160) / 25) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(xx), tail4.rotateAngleY + (float) Math.toRadians(yy), tail4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 0) / 50) * (-0.5-(0)));
            yy = 0 + (((tickAnim - 0) / 50) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 50) * (0-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 106) {
            xx = -0.5 + (((tickAnim - 50) / 56) * (-0.5-(-0.5)));
            yy = 0 + (((tickAnim - 50) / 56) * (0-(0)));
            zz = 0 + (((tickAnim - 50) / 56) * (0-(0)));
        }
        else if (tickAnim >= 106 && tickAnim < 126) {
            xx = -0.5 + (((tickAnim - 106) / 20) * (0-(-0.5)));
            yy = 0 + (((tickAnim - 106) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 106) / 20) * (0-(0)));
        }
        else if (tickAnim >= 126 && tickAnim < 160) {
            xx = 0 + (((tickAnim - 126) / 34) * (-1.75-(0)));
            yy = 0 + (((tickAnim - 126) / 34) * (0-(0)));
            zz = 0 + (((tickAnim - 126) / 34) * (0-(0)));
        }
        else if (tickAnim >= 160 && tickAnim < 170) {
            xx = -1.75 + (((tickAnim - 160) / 10) * (-1.75-(-1.75)));
            yy = 0 + (((tickAnim - 160) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 160) / 10) * (0-(0)));
        }
        else if (tickAnim >= 170 && tickAnim < 185) {
            xx = -1.75 + (((tickAnim - 170) / 15) * (0-(-1.75)));
            yy = 0 + (((tickAnim - 170) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 170) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(xx), body.rotateAngleY + (float) Math.toRadians(yy), body.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 0) / 50) * (-0.25-(0)));
            yy = 0 + (((tickAnim - 0) / 50) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 50) * (0-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 106) {
            xx = -0.25 + (((tickAnim - 50) / 56) * (0-(-0.25)));
            yy = 0 + (((tickAnim - 50) / 56) * (0-(0)));
            zz = 0 + (((tickAnim - 50) / 56) * (0-(0)));
        }
        else if (tickAnim >= 106 && tickAnim < 126) {
            xx = 0 + (((tickAnim - 106) / 20) * (1.25-(0)));
            yy = 0 + (((tickAnim - 106) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 106) / 20) * (0-(0)));
        }
        else if (tickAnim >= 126 && tickAnim < 160) {
            xx = 1.25 + (((tickAnim - 126) / 34) * (-1.5-(1.25)));
            yy = 0 + (((tickAnim - 126) / 34) * (0-(0)));
            zz = 0 + (((tickAnim - 126) / 34) * (0-(0)));
        }
        else if (tickAnim >= 160 && tickAnim < 170) {
            xx = -1.5 + (((tickAnim - 160) / 10) * (-1.5-(-1.5)));
            yy = 0 + (((tickAnim - 160) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 160) / 10) * (0-(0)));
        }
        else if (tickAnim >= 170 && tickAnim < 185) {
            xx = -1.5 + (((tickAnim - 170) / 15) * (0-(-1.5)));
            yy = 0 + (((tickAnim - 170) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 170) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(xx), chest.rotateAngleY + (float) Math.toRadians(yy), chest.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 0) / 50) * (-30.75-(0)));
            yy = 0 + (((tickAnim - 0) / 50) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 50) * (0-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 106) {
            xx = -30.75 + (((tickAnim - 50) / 56) * (-30.75-(-30.75)));
            yy = 0 + (((tickAnim - 50) / 56) * (0-(0)));
            zz = 0 + (((tickAnim - 50) / 56) * (0-(0)));
        }
        else if (tickAnim >= 106 && tickAnim < 126) {
            xx = -30.75 + (((tickAnim - 106) / 20) * (-33.75-(-30.75)));
            yy = 0 + (((tickAnim - 106) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 106) / 20) * (0-(0)));
        }
        else if (tickAnim >= 126 && tickAnim < 160) {
            xx = -33.75 + (((tickAnim - 126) / 34) * (-33.75-(-33.75)));
            yy = 0 + (((tickAnim - 126) / 34) * (0-(0)));
            zz = 0 + (((tickAnim - 126) / 34) * (0-(0)));
        }
        else if (tickAnim >= 160 && tickAnim < 170) {
            xx = -33.75 + (((tickAnim - 160) / 10) * (-33.75-(-33.75)));
            yy = 0 + (((tickAnim - 160) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 160) / 10) * (0-(0)));
        }
        else if (tickAnim >= 170 && tickAnim < 185) {
            xx = -33.75 + (((tickAnim - 170) / 15) * (0-(-33.75)));
            yy = 0 + (((tickAnim - 170) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 170) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm1, leftArm1.rotateAngleX + (float) Math.toRadians(xx), leftArm1.rotateAngleY + (float) Math.toRadians(yy), leftArm1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 0) / 23) * (-21.15915-(0)));
            yy = 0 + (((tickAnim - 0) / 23) * (3.78987-(0)));
            zz = 0 + (((tickAnim - 0) / 23) * (1.26724-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 50) {
            xx = -21.15915 + (((tickAnim - 23) / 27) * (15.47095-(-21.15915)));
            yy = 3.78987 + (((tickAnim - 23) / 27) * (8.26882-(3.78987)));
            zz = 1.26724 + (((tickAnim - 23) / 27) * (2.76488-(1.26724)));
        }
        else if (tickAnim >= 50 && tickAnim < 106) {
            xx = 15.47095 + (((tickAnim - 50) / 56) * (15.47095-(15.47095)));
            yy = 8.26882 + (((tickAnim - 50) / 56) * (8.26882-(8.26882)));
            zz = 2.76488 + (((tickAnim - 50) / 56) * (2.76488-(2.76488)));
        }
        else if (tickAnim >= 106 && tickAnim < 126) {
            xx = 15.47095 + (((tickAnim - 106) / 20) * (15.47095-(15.47095)));
            yy = 8.26882 + (((tickAnim - 106) / 20) * (8.26882-(8.26882)));
            zz = 2.76488 + (((tickAnim - 106) / 20) * (2.76488-(2.76488)));
        }
        else if (tickAnim >= 126 && tickAnim < 160) {
            xx = 15.47095 + (((tickAnim - 126) / 34) * (42.47095-(15.47095)));
            yy = 8.26882 + (((tickAnim - 126) / 34) * (8.26882-(8.26882)));
            zz = 2.76488 + (((tickAnim - 126) / 34) * (2.76488-(2.76488)));
        }
        else if (tickAnim >= 160 && tickAnim < 170) {
            xx = 42.47095 + (((tickAnim - 160) / 10) * (42.47095-(42.47095)));
            yy = 8.26882 + (((tickAnim - 160) / 10) * (8.26882-(8.26882)));
            zz = 2.76488 + (((tickAnim - 160) / 10) * (2.76488-(2.76488)));
        }
        else if (tickAnim >= 170 && tickAnim < 178) {
            xx = 42.47095 + (((tickAnim - 170) / 8) * (-11.76453-(42.47095)));
            yy = 8.26882 + (((tickAnim - 170) / 8) * (4.13441-(8.26882)));
            zz = 2.76488 + (((tickAnim - 170) / 8) * (1.38244-(2.76488)));
        }
        else if (tickAnim >= 178 && tickAnim < 185) {
            xx = -11.76453 + (((tickAnim - 178) / 7) * (0-(-11.76453)));
            yy = 4.13441 + (((tickAnim - 178) / 7) * (0-(4.13441)));
            zz = 1.38244 + (((tickAnim - 178) / 7) * (0-(1.38244)));
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
            zz = 0 + (((tickAnim - 0) / 23) * (-0.85-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 23) / 27) * (0-(0)));
            yy = 0 + (((tickAnim - 23) / 27) * (0-(0)));
            zz = -0.85 + (((tickAnim - 23) / 27) * (0-(-0.85)));
        }
        else if (tickAnim >= 50 && tickAnim < 106) {
            xx = 0 + (((tickAnim - 50) / 56) * (0-(0)));
            yy = 0 + (((tickAnim - 50) / 56) * (0-(0)));
            zz = 0 + (((tickAnim - 50) / 56) * (0-(0)));
        }
        else if (tickAnim >= 106 && tickAnim < 126) {
            xx = 0 + (((tickAnim - 106) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 106) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 106) / 20) * (0-(0)));
        }
        else if (tickAnim >= 126 && tickAnim < 170) {
            xx = 0 + (((tickAnim - 126) / 44) * (0-(0)));
            yy = 0 + (((tickAnim - 126) / 44) * (0-(0)));
            zz = 0 + (((tickAnim - 126) / 44) * (0-(0)));
        }
        else if (tickAnim >= 170 && tickAnim < 178) {
            xx = 0 + (((tickAnim - 170) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 170) / 8) * (0.125-(0)));
            zz = 0 + (((tickAnim - 170) / 8) * (-0.85-(0)));
        }
        else if (tickAnim >= 178 && tickAnim < 185) {
            xx = 0 + (((tickAnim - 178) / 7) * (0-(0)));
            yy = 0.125 + (((tickAnim - 178) / 7) * (0-(0.125)));
            zz = -0.85 + (((tickAnim - 178) / 7) * (0-(-0.85)));
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
            xx = 0 + (((tickAnim - 0) / 23) * (59.36705-(0)));
            yy = 0 + (((tickAnim - 0) / 23) * (16.68755-(0)));
            zz = 0 + (((tickAnim - 0) / 23) * (1.92653-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 50) {
            xx = 59.36705 + (((tickAnim - 23) / 27) * (16.43781-(59.36705)));
            yy = 16.68755 + (((tickAnim - 23) / 27) * (6.77982-(16.68755)));
            zz = 1.92653 + (((tickAnim - 23) / 27) * (-9.16024-(1.92653)));
        }
        else if (tickAnim >= 50 && tickAnim < 106) {
            xx = 16.43781 + (((tickAnim - 50) / 56) * (16.43781-(16.43781)));
            yy = 6.77982 + (((tickAnim - 50) / 56) * (6.77982-(6.77982)));
            zz = -9.16024 + (((tickAnim - 50) / 56) * (-9.16024-(-9.16024)));
        }
        else if (tickAnim >= 106 && tickAnim < 126) {
            xx = 16.43781 + (((tickAnim - 106) / 20) * (16.43781-(16.43781)));
            yy = 6.77982 + (((tickAnim - 106) / 20) * (6.77982-(6.77982)));
            zz = -9.16024 + (((tickAnim - 106) / 20) * (-9.16024-(-9.16024)));
        }
        else if (tickAnim >= 126 && tickAnim < 160) {
            xx = 16.43781 + (((tickAnim - 126) / 34) * (-7.4531-(16.43781)));
            yy = 6.77982 + (((tickAnim - 126) / 34) * (9.738-(6.77982)));
            zz = -9.16024 + (((tickAnim - 126) / 34) * (5.41745-(-9.16024)));
        }
        else if (tickAnim >= 160 && tickAnim < 170) {
            xx = -7.4531 + (((tickAnim - 160) / 10) * (-7.4531-(-7.4531)));
            yy = 9.738 + (((tickAnim - 160) / 10) * (9.738-(9.738)));
            zz = 5.41745 + (((tickAnim - 160) / 10) * (5.41745-(5.41745)));
        }
        else if (tickAnim >= 170 && tickAnim < 178) {
            xx = -7.4531 + (((tickAnim - 170) / 8) * (68.72948-(-7.4531)));
            yy = 9.738 + (((tickAnim - 170) / 8) * (13.61125-(9.738)));
            zz = 5.41745 + (((tickAnim - 170) / 8) * (-0.12045-(5.41745)));
        }
        else if (tickAnim >= 178 && tickAnim < 185) {
            xx = 68.72948 + (((tickAnim - 178) / 7) * (0-(68.72948)));
            yy = 13.61125 + (((tickAnim - 178) / 7) * (0-(13.61125)));
            zz = -0.12045 + (((tickAnim - 178) / 7) * (0-(-0.12045)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftHand, leftHand.rotateAngleX + (float) Math.toRadians(xx), leftHand.rotateAngleY + (float) Math.toRadians(yy), leftHand.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 0) / 23) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 23) * (0.6-(0)));
            zz = 0 + (((tickAnim - 0) / 23) * (-0.945-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 23) / 27) * (0-(0)));
            yy = 0.6 + (((tickAnim - 23) / 27) * (0.3-(0.6)));
            zz = -0.945 + (((tickAnim - 23) / 27) * (0.275-(-0.945)));
        }
        else if (tickAnim >= 50 && tickAnim < 106) {
            xx = 0 + (((tickAnim - 50) / 56) * (0-(0)));
            yy = 0.3 + (((tickAnim - 50) / 56) * (0.3-(0.3)));
            zz = 0.275 + (((tickAnim - 50) / 56) * (0.275-(0.275)));
        }
        else if (tickAnim >= 106 && tickAnim < 126) {
            xx = 0 + (((tickAnim - 106) / 20) * (0-(0)));
            yy = 0.3 + (((tickAnim - 106) / 20) * (0.3-(0.3)));
            zz = 0.275 + (((tickAnim - 106) / 20) * (0.275-(0.275)));
        }
        else if (tickAnim >= 126 && tickAnim < 160) {
            xx = 0 + (((tickAnim - 126) / 34) * (0-(0)));
            yy = 0.3 + (((tickAnim - 126) / 34) * (0.545-(0.3)));
            zz = 0.275 + (((tickAnim - 126) / 34) * (0.06-(0.275)));
        }
        else if (tickAnim >= 160 && tickAnim < 170) {
            xx = 0 + (((tickAnim - 160) / 10) * (0-(0)));
            yy = 0.545 + (((tickAnim - 160) / 10) * (0.545-(0.545)));
            zz = 0.06 + (((tickAnim - 160) / 10) * (0.06-(0.06)));
        }
        else if (tickAnim >= 170 && tickAnim < 178) {
            xx = 0 + (((tickAnim - 170) / 8) * (0-(0)));
            yy = 0.545 + (((tickAnim - 170) / 8) * (0.65-(0.545)));
            zz = 0.06 + (((tickAnim - 170) / 8) * (-1.245-(0.06)));
        }
        else if (tickAnim >= 178 && tickAnim < 185) {
            xx = 0 + (((tickAnim - 178) / 7) * (0-(0)));
            yy = 0.65 + (((tickAnim - 178) / 7) * (0-(0.65)));
            zz = -1.245 + (((tickAnim - 178) / 7) * (0-(-1.245)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftHand.rotationPointX = this.leftHand.rotationPointX + (float)(xx);
        this.leftHand.rotationPointY = this.leftHand.rotationPointY - (float)(yy);
        this.leftHand.rotationPointZ = this.leftHand.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 0) / 50) * (-4-(0)));
            yy = 0 + (((tickAnim - 0) / 50) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 50) * (0-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 64) {
            xx = -4 + (((tickAnim - 50) / 14) * (-4.5-(-4)));
            yy = 0 + (((tickAnim - 50) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 50) / 14) * (0-(0)));
        }
        else if (tickAnim >= 64 && tickAnim < 92) {
            xx = -4.5 + (((tickAnim - 64) / 28) * (-4-(-4.5)));
            yy = 0 + (((tickAnim - 64) / 28) * (0-(0)));
            zz = 0 + (((tickAnim - 64) / 28) * (0-(0)));
        }
        else if (tickAnim >= 92 && tickAnim < 106) {
            xx = -4 + (((tickAnim - 92) / 14) * (-4.5-(-4)));
            yy = 0 + (((tickAnim - 92) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 92) / 14) * (0-(0)));
        }
        else if (tickAnim >= 106 && tickAnim < 126) {
            xx = -4.5 + (((tickAnim - 106) / 20) * (-5-(-4.5)));
            yy = 0 + (((tickAnim - 106) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 106) / 20) * (0-(0)));
        }
        else if (tickAnim >= 126 && tickAnim < 160) {
            xx = -5 + (((tickAnim - 126) / 34) * (-4.25-(-5)));
            yy = 0 + (((tickAnim - 126) / 34) * (0-(0)));
            zz = 0 + (((tickAnim - 126) / 34) * (0-(0)));
        }
        else if (tickAnim >= 160 && tickAnim < 185) {
            xx = -4.25 + (((tickAnim - 160) / 25) * (0-(-4.25)));
            yy = 0 + (((tickAnim - 160) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 160) / 25) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck1, neck1.rotateAngleX + (float) Math.toRadians(xx), neck1.rotateAngleY + (float) Math.toRadians(yy), neck1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 0) / 50) * (-4.5-(0)));
            yy = 0 + (((tickAnim - 0) / 50) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 50) * (0-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 58) {
            xx = -4.5 + (((tickAnim - 50) / 8) * (-5.25-(-4.5)));
            yy = 0 + (((tickAnim - 50) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 50) / 8) * (0-(0)));
        }
        else if (tickAnim >= 58 && tickAnim < 61) {
            xx = -5.25 + (((tickAnim - 58) / 3) * (-5-(-5.25)));
            yy = 0 + (((tickAnim - 58) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 58) / 3) * (0-(0)));
        }
        else if (tickAnim >= 61 && tickAnim < 64) {
            xx = -5 + (((tickAnim - 61) / 3) * (-5.25-(-5)));
            yy = 0 + (((tickAnim - 61) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 61) / 3) * (0-(0)));
        }
        else if (tickAnim >= 64 && tickAnim < 92) {
            xx = -5.25 + (((tickAnim - 64) / 28) * (-4.5-(-5.25)));
            yy = 0 + (((tickAnim - 64) / 28) * (0-(0)));
            zz = 0 + (((tickAnim - 64) / 28) * (0-(0)));
        }
        else if (tickAnim >= 92 && tickAnim < 99) {
            xx = -4.5 + (((tickAnim - 92) / 7) * (-5.25-(-4.5)));
            yy = 0 + (((tickAnim - 92) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 92) / 7) * (0-(0)));
        }
        else if (tickAnim >= 99 && tickAnim < 103) {
            xx = -5.25 + (((tickAnim - 99) / 4) * (-5-(-5.25)));
            yy = 0 + (((tickAnim - 99) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 99) / 4) * (0-(0)));
        }
        else if (tickAnim >= 103 && tickAnim < 106) {
            xx = -5 + (((tickAnim - 103) / 3) * (-5.25-(-5)));
            yy = 0 + (((tickAnim - 103) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 103) / 3) * (0-(0)));
        }
        else if (tickAnim >= 106 && tickAnim < 126) {
            xx = -5.25 + (((tickAnim - 106) / 20) * (-5.45+Math.sin((Math.PI/180)*(((double)tickAnim/20)*60+40))*-3-(-5.25)));
            yy = 0 + (((tickAnim - 106) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 106) / 20) * (0-(0)));
        }
        else if (tickAnim >= 126 && tickAnim < 160) {
            xx = -5.45+Math.sin((Math.PI/180)*(((double)tickAnim/20)*60+40))*-3 + (((tickAnim - 126) / 34) * (-7.5-(-5.45+Math.sin((Math.PI/180)*(((double)tickAnim/20)*60+40))*-3)));
            yy = 0 + (((tickAnim - 126) / 34) * (0-(0)));
            zz = 0 + (((tickAnim - 126) / 34) * (0-(0)));
        }
        else if (tickAnim >= 160 && tickAnim < 185) {
            xx = -7.5 + (((tickAnim - 160) / 25) * (0-(-7.5)));
            yy = 0 + (((tickAnim - 160) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 160) / 25) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(xx), neck2.rotateAngleY + (float) Math.toRadians(yy), neck2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 0) / 50) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 50) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 50) * (-0.3-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 64) {
            xx = 0 + (((tickAnim - 50) / 14) * (0-(0)));
            yy = 0 + (((tickAnim - 50) / 14) * (0-(0)));
            zz = -0.3 + (((tickAnim - 50) / 14) * (-0.2-(-0.3)));
        }
        else if (tickAnim >= 64 && tickAnim < 92) {
            xx = 0 + (((tickAnim - 64) / 28) * (0-(0)));
            yy = 0 + (((tickAnim - 64) / 28) * (0-(0)));
            zz = -0.2 + (((tickAnim - 64) / 28) * (-0.3-(-0.2)));
        }
        else if (tickAnim >= 92 && tickAnim < 106) {
            xx = 0 + (((tickAnim - 92) / 14) * (0-(0)));
            yy = 0 + (((tickAnim - 92) / 14) * (0-(0)));
            zz = -0.3 + (((tickAnim - 92) / 14) * (-0.2-(-0.3)));
        }
        else if (tickAnim >= 106 && tickAnim < 126) {
            xx = 0 + (((tickAnim - 106) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 106) / 20) * (0-(0)));
            zz = -0.2 + (((tickAnim - 106) / 20) * (0-(-0.2)));
        }
        else if (tickAnim >= 126 && tickAnim < 160) {
            xx = 0 + (((tickAnim - 126) / 34) * (0-(0)));
            yy = 0 + (((tickAnim - 126) / 34) * (0-(0)));
            zz = 0 + (((tickAnim - 126) / 34) * (-0.25-(0)));
        }
        else if (tickAnim >= 160 && tickAnim < 185) {
            xx = 0 + (((tickAnim - 160) / 25) * (0-(0)));
            yy = 0 + (((tickAnim - 160) / 25) * (0-(0)));
            zz = -0.25 + (((tickAnim - 160) / 25) * (0-(-0.25)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.neck2.rotationPointX = this.neck2.rotationPointX + (float)(xx);
        this.neck2.rotationPointY = this.neck2.rotationPointY - (float)(yy);
        this.neck2.rotationPointZ = this.neck2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 0) / 50) * (-4.5-(0)));
            yy = 0 + (((tickAnim - 0) / 50) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 50) * (0-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 58) {
            xx = -4.5 + (((tickAnim - 50) / 8) * (-0.25-(-4.5)));
            yy = 0 + (((tickAnim - 50) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 50) / 8) * (0-(0)));
        }
        else if (tickAnim >= 58 && tickAnim < 61) {
            xx = -0.25 + (((tickAnim - 58) / 3) * (-1.5-(-0.25)));
            yy = 0 + (((tickAnim - 58) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 58) / 3) * (0-(0)));
        }
        else if (tickAnim >= 61 && tickAnim < 64) {
            xx = -1.5 + (((tickAnim - 61) / 3) * (-0.25-(-1.5)));
            yy = 0 + (((tickAnim - 61) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 61) / 3) * (0-(0)));
        }
        else if (tickAnim >= 64 && tickAnim < 92) {
            xx = -0.25 + (((tickAnim - 64) / 28) * (-4.5-(-0.25)));
            yy = 0 + (((tickAnim - 64) / 28) * (0-(0)));
            zz = 0 + (((tickAnim - 64) / 28) * (0-(0)));
        }
        else if (tickAnim >= 92 && tickAnim < 99) {
            xx = -4.5 + (((tickAnim - 92) / 7) * (-0.25-(-4.5)));
            yy = 0 + (((tickAnim - 92) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 92) / 7) * (0-(0)));
        }
        else if (tickAnim >= 99 && tickAnim < 103) {
            xx = -0.25 + (((tickAnim - 99) / 4) * (-1.5-(-0.25)));
            yy = 0 + (((tickAnim - 99) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 99) / 4) * (0-(0)));
        }
        else if (tickAnim >= 103 && tickAnim < 106) {
            xx = -1.5 + (((tickAnim - 103) / 3) * (-0.25-(-1.5)));
            yy = 0 + (((tickAnim - 103) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 103) / 3) * (0-(0)));
        }
        else if (tickAnim >= 106 && tickAnim < 126) {
            xx = -0.25 + (((tickAnim - 106) / 20) * (-10.75-(-0.25)));
            yy = 0 + (((tickAnim - 106) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 106) / 20) * (0-(0)));
        }
        else if (tickAnim >= 126 && tickAnim < 160) {
            xx = -10.75 + (((tickAnim - 126) / 34) * (-8.5-(-10.75)));
            yy = 0 + (((tickAnim - 126) / 34) * (0-(0)));
            zz = 0 + (((tickAnim - 126) / 34) * (0-(0)));
        }
        else if (tickAnim >= 160 && tickAnim < 170) {
            xx = -8.5 + (((tickAnim - 160) / 10) * (-24-(-8.5)));
            yy = 0 + (((tickAnim - 160) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 160) / 10) * (0-(0)));
        }
        else if (tickAnim >= 170 && tickAnim < 185) {
            xx = -24 + (((tickAnim - 170) / 15) * (0-(-24)));
            yy = 0 + (((tickAnim - 170) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 170) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(xx), neck3.rotateAngleY + (float) Math.toRadians(yy), neck3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 0) / 50) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 50) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 50) * (-0.275-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 64) {
            xx = 0 + (((tickAnim - 50) / 14) * (0-(0)));
            yy = 0 + (((tickAnim - 50) / 14) * (0-(0)));
            zz = -0.275 + (((tickAnim - 50) / 14) * (-0.18-(-0.275)));
        }
        else if (tickAnim >= 64 && tickAnim < 92) {
            xx = 0 + (((tickAnim - 64) / 28) * (0-(0)));
            yy = 0 + (((tickAnim - 64) / 28) * (0-(0)));
            zz = -0.18 + (((tickAnim - 64) / 28) * (-0.275-(-0.18)));
        }
        else if (tickAnim >= 92 && tickAnim < 106) {
            xx = 0 + (((tickAnim - 92) / 14) * (0-(0)));
            yy = 0 + (((tickAnim - 92) / 14) * (0-(0)));
            zz = -0.275 + (((tickAnim - 92) / 14) * (-0.18-(-0.275)));
        }
        else if (tickAnim >= 106 && tickAnim < 126) {
            xx = 0 + (((tickAnim - 106) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 106) / 20) * (0-(0)));
            zz = -0.18 + (((tickAnim - 106) / 20) * (0-(-0.18)));
        }
        else if (tickAnim >= 126 && tickAnim < 160) {
            xx = 0 + (((tickAnim - 126) / 34) * (0-(0)));
            yy = 0 + (((tickAnim - 126) / 34) * (0-(0)));
            zz = 0 + (((tickAnim - 126) / 34) * (-0.425-(0)));
        }
        else if (tickAnim >= 160 && tickAnim < 185) {
            xx = 0 + (((tickAnim - 160) / 25) * (0-(0)));
            yy = 0 + (((tickAnim - 160) / 25) * (0-(0)));
            zz = -0.425 + (((tickAnim - 160) / 25) * (0-(-0.425)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.neck3.rotationPointX = this.neck3.rotationPointX + (float)(xx);
        this.neck3.rotationPointY = this.neck3.rotationPointY - (float)(yy);
        this.neck3.rotationPointZ = this.neck3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 0) / 23) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 23) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 23) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 37) {
            xx = 0 + (((tickAnim - 23) / 14) * (-12.12-(0)));
            yy = 0 + (((tickAnim - 23) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 14) * (0-(0)));
        }
        else if (tickAnim >= 37 && tickAnim < 50) {
            xx = -12.12 + (((tickAnim - 37) / 13) * (0-(-12.12)));
            yy = 0 + (((tickAnim - 37) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 37) / 13) * (0-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 58) {
            xx = 0 + (((tickAnim - 50) / 8) * (5.5-(0)));
            yy = 0 + (((tickAnim - 50) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 50) / 8) * (0-(0)));
        }
        else if (tickAnim >= 58 && tickAnim < 61) {
            xx = 5.5 + (((tickAnim - 58) / 3) * (4-(5.5)));
            yy = 0 + (((tickAnim - 58) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 58) / 3) * (0-(0)));
        }
        else if (tickAnim >= 61 && tickAnim < 64) {
            xx = 4 + (((tickAnim - 61) / 3) * (0-(4)));
            yy = 0 + (((tickAnim - 61) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 61) / 3) * (0-(0)));
        }
        else if (tickAnim >= 64 && tickAnim < 78) {
            xx = 0 + (((tickAnim - 64) / 14) * (-12.12-(0)));
            yy = 0 + (((tickAnim - 64) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 64) / 14) * (0-(0)));
        }
        else if (tickAnim >= 78 && tickAnim < 92) {
            xx = -12.12 + (((tickAnim - 78) / 14) * (0-(-12.12)));
            yy = 0 + (((tickAnim - 78) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 78) / 14) * (0-(0)));
        }
        else if (tickAnim >= 92 && tickAnim < 99) {
            xx = 0 + (((tickAnim - 92) / 7) * (5.5-(0)));
            yy = 0 + (((tickAnim - 92) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 92) / 7) * (0-(0)));
        }
        else if (tickAnim >= 99 && tickAnim < 103) {
            xx = 5.5 + (((tickAnim - 99) / 4) * (4-(5.5)));
            yy = 0 + (((tickAnim - 99) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 99) / 4) * (0-(0)));
        }
        else if (tickAnim >= 103 && tickAnim < 106) {
            xx = 4 + (((tickAnim - 103) / 3) * (0-(4)));
            yy = 0 + (((tickAnim - 103) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 103) / 3) * (0-(0)));
        }
        else if (tickAnim >= 106 && tickAnim < 160) {
            xx = 0 + (((tickAnim - 106) / 54) * (-13.5-(0)));
            yy = 0 + (((tickAnim - 106) / 54) * (0-(0)));
            zz = 0 + (((tickAnim - 106) / 54) * (0-(0)));
        }
        else if (tickAnim >= 160 && tickAnim < 170) {
            xx = -13.5 + (((tickAnim - 160) / 10) * (-2-(-13.5)));
            yy = 0 + (((tickAnim - 160) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 160) / 10) * (0-(0)));
        }
        else if (tickAnim >= 170 && tickAnim < 185) {
            xx = -2 + (((tickAnim - 170) / 15) * (0-(-2)));
            yy = 0 + (((tickAnim - 170) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 170) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 0) / 23) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 23) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 23) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 37) {
            xx = 0 + (((tickAnim - 23) / 14) * (26-(0)));
            yy = 0 + (((tickAnim - 23) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 14) * (0-(0)));
        }
        else if (tickAnim >= 37 && tickAnim < 50) {
            xx = 26 + (((tickAnim - 37) / 13) * (0-(26)));
            yy = 0 + (((tickAnim - 37) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 37) / 13) * (0-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 58) {
            xx = 0 + (((tickAnim - 50) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 50) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 50) / 8) * (0-(0)));
        }
        else if (tickAnim >= 58 && tickAnim < 61) {
            xx = 0 + (((tickAnim - 58) / 3) * (2.75-(0)));
            yy = 0 + (((tickAnim - 58) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 58) / 3) * (0-(0)));
        }
        else if (tickAnim >= 61 && tickAnim < 64) {
            xx = 2.75 + (((tickAnim - 61) / 3) * (0-(2.75)));
            yy = 0 + (((tickAnim - 61) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 61) / 3) * (0-(0)));
        }
        else if (tickAnim >= 64 && tickAnim < 78) {
            xx = 0 + (((tickAnim - 64) / 14) * (26-(0)));
            yy = 0 + (((tickAnim - 64) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 64) / 14) * (0-(0)));
        }
        else if (tickAnim >= 78 && tickAnim < 92) {
            xx = 26 + (((tickAnim - 78) / 14) * (0-(26)));
            yy = 0 + (((tickAnim - 78) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 78) / 14) * (0-(0)));
        }
        else if (tickAnim >= 92 && tickAnim < 99) {
            xx = 0 + (((tickAnim - 92) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 92) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 92) / 7) * (0-(0)));
        }
        else if (tickAnim >= 99 && tickAnim < 103) {
            xx = 0 + (((tickAnim - 99) / 4) * (2.75-(0)));
            yy = 0 + (((tickAnim - 99) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 99) / 4) * (0-(0)));
        }
        else if (tickAnim >= 103 && tickAnim < 106) {
            xx = 2.75 + (((tickAnim - 103) / 3) * (0-(2.75)));
            yy = 0 + (((tickAnim - 103) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 103) / 3) * (0-(0)));
        }
        else if (tickAnim >= 106 && tickAnim < 126) {
            xx = 0 + (((tickAnim - 106) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 106) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 106) / 20) * (0-(0)));
        }
        else if (tickAnim >= 126 && tickAnim < 160) {
            xx = 0 + (((tickAnim - 126) / 34) * (26-(0)));
            yy = 0 + (((tickAnim - 126) / 34) * (0-(0)));
            zz = 0 + (((tickAnim - 126) / 34) * (0-(0)));
        }
        else if (tickAnim >= 160 && tickAnim < 164) {
            xx = 26 + (((tickAnim - 160) / 4) * (0-(26)));
            yy = 0 + (((tickAnim - 160) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 160) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(xx), jaw.rotateAngleY + (float) Math.toRadians(yy), jaw.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 50 && tickAnim < 58) {
            xx = 0 + (((tickAnim - 50) / 8) * (7.5-(0)));
            yy = 0 + (((tickAnim - 50) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 50) / 8) * (0-(0)));
        }
        else if (tickAnim >= 58 && tickAnim < 63) {
            xx = 7.5 + (((tickAnim - 58) / 5) * (0-(7.5)));
            yy = 0 + (((tickAnim - 58) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 58) / 5) * (0-(0)));
        }
        else if (tickAnim >= 63 && tickAnim < 160) {
            xx = 0 + (((tickAnim - 63) / 97) * (0-(0)));
            yy = 0 + (((tickAnim - 63) / 97) * (0-(0)));
            zz = 0 + (((tickAnim - 63) / 97) * (0-(0)));
        }
        else if (tickAnim >= 160 && tickAnim < 164) {
            xx = 0 + (((tickAnim - 160) / 4) * (6.5-(0)));
            yy = 0 + (((tickAnim - 160) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 160) / 4) * (0-(0)));
        }
        else if (tickAnim >= 164 && tickAnim < 168) {
            xx = 6.5 + (((tickAnim - 164) / 4) * (12.75-(6.5)));
            yy = 0 + (((tickAnim - 164) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 164) / 4) * (0-(0)));
        }
        else if (tickAnim >= 168 && tickAnim < 177) {
            xx = 12.75 + (((tickAnim - 168) / 9) * (0-(12.75)));
            yy = 0 + (((tickAnim - 168) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 168) / 9) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(throat, throat.rotateAngleX + (float) Math.toRadians(xx), throat.rotateAngleY + (float) Math.toRadians(yy), throat.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 49) {
            xx = 0 + (((tickAnim - 0) / 49) * (-2.25-(0)));
            yy = 0 + (((tickAnim - 0) / 49) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 49) * (0-(0)));
        }
        else if (tickAnim >= 49 && tickAnim < 72) {
            xx = -2.25 + (((tickAnim - 49) / 23) * (-2.25-(-2.25)));
            yy = 0 + (((tickAnim - 49) / 23) * (0-(0)));
            zz = 0 + (((tickAnim - 49) / 23) * (0-(0)));
        }
        else if (tickAnim >= 72 && tickAnim < 106) {
            xx = -2.25 + (((tickAnim - 72) / 34) * (-2.25-(-2.25)));
            yy = 0 + (((tickAnim - 72) / 34) * (0-(0)));
            zz = 0 + (((tickAnim - 72) / 34) * (0-(0)));
        }
        else if (tickAnim >= 106 && tickAnim < 126) {
            xx = -2.25 + (((tickAnim - 106) / 20) * (-4.25-(-2.25)));
            yy = 0 + (((tickAnim - 106) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 106) / 20) * (0-(0)));
        }
        else if (tickAnim >= 126 && tickAnim < 160) {
            xx = -4.25 + (((tickAnim - 126) / 34) * (-6.5-(-4.25)));
            yy = 0 + (((tickAnim - 126) / 34) * (0-(0)));
            zz = 0 + (((tickAnim - 126) / 34) * (0-(0)));
        }
        else if (tickAnim >= 160 && tickAnim < 170) {
            xx = -6.5 + (((tickAnim - 160) / 10) * (-6.5-(-6.5)));
            yy = 0 + (((tickAnim - 160) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 160) / 10) * (0-(0)));
        }
        else if (tickAnim >= 170 && tickAnim < 185) {
            xx = -6.5 + (((tickAnim - 170) / 15) * (0-(-6.5)));
            yy = 0 + (((tickAnim - 170) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 170) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm1, rightArm1.rotateAngleX + (float) Math.toRadians(xx), rightArm1.rotateAngleY + (float) Math.toRadians(yy), rightArm1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 49) {
            xx = 0 + (((tickAnim - 0) / 49) * (8.75-(0)));
            yy = 0 + (((tickAnim - 0) / 49) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 49) * (0-(0)));
        }
        else if (tickAnim >= 49 && tickAnim < 72) {
            xx = 8.75 + (((tickAnim - 49) / 23) * (8.75-(8.75)));
            yy = 0 + (((tickAnim - 49) / 23) * (0-(0)));
            zz = 0 + (((tickAnim - 49) / 23) * (0-(0)));
        }
        else if (tickAnim >= 72 && tickAnim < 106) {
            xx = 8.75 + (((tickAnim - 72) / 34) * (8.75-(8.75)));
            yy = 0 + (((tickAnim - 72) / 34) * (0-(0)));
            zz = 0 + (((tickAnim - 72) / 34) * (0-(0)));
        }
        else if (tickAnim >= 106 && tickAnim < 126) {
            xx = 8.75 + (((tickAnim - 106) / 20) * (6.5-(8.75)));
            yy = 0 + (((tickAnim - 106) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 106) / 20) * (0-(0)));
        }
        else if (tickAnim >= 126 && tickAnim < 160) {
            xx = 6.5 + (((tickAnim - 126) / 34) * (24.75-(6.5)));
            yy = 0 + (((tickAnim - 126) / 34) * (0-(0)));
            zz = 0 + (((tickAnim - 126) / 34) * (0-(0)));
        }
        else if (tickAnim >= 160 && tickAnim < 170) {
            xx = 24.75 + (((tickAnim - 160) / 10) * (24.75-(24.75)));
            yy = 0 + (((tickAnim - 160) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 160) / 10) * (0-(0)));
        }
        else if (tickAnim >= 170 && tickAnim < 185) {
            xx = 24.75 + (((tickAnim - 170) / 15) * (0-(24.75)));
            yy = 0 + (((tickAnim - 170) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 170) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm2, rightArm2.rotateAngleX + (float) Math.toRadians(xx), rightArm2.rotateAngleY + (float) Math.toRadians(yy), rightArm2.rotateAngleZ + (float) Math.toRadians(zz));

        this.rightArm2.rotationPointX = this.rightArm2.rotationPointX + (float)(0);
        this.rightArm2.rotationPointY = this.rightArm2.rotationPointY - (float)(0);
        this.rightArm2.rotationPointZ = this.rightArm2.rotationPointZ + (float)(0);



        if (tickAnim >= 0 && tickAnim < 49) {
            xx = 0 + (((tickAnim - 0) / 49) * (-3.75-(0)));
            yy = 0 + (((tickAnim - 0) / 49) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 49) * (0-(0)));
        }
        else if (tickAnim >= 49 && tickAnim < 72) {
            xx = -3.75 + (((tickAnim - 49) / 23) * (-3.75-(-3.75)));
            yy = 0 + (((tickAnim - 49) / 23) * (0-(0)));
            zz = 0 + (((tickAnim - 49) / 23) * (0-(0)));
        }
        else if (tickAnim >= 72 && tickAnim < 106) {
            xx = -3.75 + (((tickAnim - 72) / 34) * (-3.75-(-3.75)));
            yy = 0 + (((tickAnim - 72) / 34) * (0-(0)));
            zz = 0 + (((tickAnim - 72) / 34) * (0-(0)));
        }
        else if (tickAnim >= 106 && tickAnim < 126) {
            xx = -3.75 + (((tickAnim - 106) / 20) * (0-(-3.75)));
            yy = 0 + (((tickAnim - 106) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 106) / 20) * (0-(0)));
        }
        else if (tickAnim >= 126 && tickAnim < 160) {
            xx = 0 + (((tickAnim - 126) / 34) * (-8.75-(0)));
            yy = 0 + (((tickAnim - 126) / 34) * (4-(0)));
            zz = 0 + (((tickAnim - 126) / 34) * (0-(0)));
        }
        else if (tickAnim >= 160 && tickAnim < 170) {
            xx = -8.75 + (((tickAnim - 160) / 10) * (-8.75-(-8.75)));
            yy = 4 + (((tickAnim - 160) / 10) * (4-(4)));
            zz = 0 + (((tickAnim - 160) / 10) * (0-(0)));
        }
        else if (tickAnim >= 170 && tickAnim < 185) {
            xx = -8.75 + (((tickAnim - 170) / 15) * (0-(-8.75)));
            yy = 4 + (((tickAnim - 170) / 15) * (0-(4)));
            zz = 0 + (((tickAnim - 170) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightHand, rightHand.rotateAngleX + (float) Math.toRadians(xx), rightHand.rotateAngleY + (float) Math.toRadians(yy), rightHand.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 49) {
            xx = 0 + (((tickAnim - 0) / 49) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 49) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 49) * (0.275-(0)));
        }
        else if (tickAnim >= 49 && tickAnim < 72) {
            xx = 0 + (((tickAnim - 49) / 23) * (0-(0)));
            yy = 0 + (((tickAnim - 49) / 23) * (0-(0)));
            zz = 0.275 + (((tickAnim - 49) / 23) * (0.275-(0.275)));
        }
        else if (tickAnim >= 72 && tickAnim < 106) {
            xx = 0 + (((tickAnim - 72) / 34) * (0-(0)));
            yy = 0 + (((tickAnim - 72) / 34) * (0-(0)));
            zz = 0.275 + (((tickAnim - 72) / 34) * (0.275-(0.275)));
        }
        else if (tickAnim >= 106 && tickAnim < 185) {
            xx = 0 + (((tickAnim - 106) / 79) * (0-(0)));
            yy = 0 + (((tickAnim - 106) / 79) * (0-(0)));
            zz = 0.275 + (((tickAnim - 106) / 79) * (0-(0.275)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightHand.rotationPointX = this.rightHand.rotationPointX + (float)(xx);
        this.rightHand.rotationPointY = this.rightHand.rotationPointY - (float)(yy);
        this.rightHand.rotationPointZ = this.rightHand.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 0) / 50) * (2-(0)));
            yy = 0 + (((tickAnim - 0) / 50) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 50) * (0-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 160) {
            xx = 2 + (((tickAnim - 50) / 110) * (2-(2)));
            yy = 0 + (((tickAnim - 50) / 110) * (0-(0)));
            zz = 0 + (((tickAnim - 50) / 110) * (0-(0)));
        }
        else if (tickAnim >= 160 && tickAnim < 185) {
            xx = 2 + (((tickAnim - 160) / 25) * (0-(2)));
            yy = 0 + (((tickAnim - 160) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 160) / 25) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg1, rightLeg1.rotateAngleX + (float) Math.toRadians(xx), rightLeg1.rotateAngleY + (float) Math.toRadians(yy), rightLeg1.rotateAngleZ + (float) Math.toRadians(zz));

    }
    
    public void animHide(EntityLivingBase entitylivinghipsIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraSauropelta entity = (EntityPrehistoricFloraSauropelta) entitylivinghipsIn;
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
        this.setRotateAngle(hips, hips.rotateAngleX + (float) Math.toRadians(xx), hips.rotateAngleY + (float) Math.toRadians(yy), hips.rotateAngleZ + (float) Math.toRadians(zz));


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
        this.hips.rotationPointX = this.hips.rotationPointX + (float)(xx);
        this.hips.rotationPointY = this.hips.rotationPointY - (float)(yy);
        this.hips.rotationPointZ = this.hips.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 0) / 23) * (-6.0562-(0)));
            yy = 0 + (((tickAnim - 0) / 23) * (10.57522-(0)));
            zz = 0 + (((tickAnim - 0) / 23) * (-3.17512-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 45) {
            xx = -6.0562 + (((tickAnim - 23) / 22) * (-21.9146-(-6.0562)));
            yy = 10.57522 + (((tickAnim - 23) / 22) * (-3.59067-(10.57522)));
            zz = -3.17512 + (((tickAnim - 23) / 22) * (-2.07987-(-3.17512)));
        }
        else if (tickAnim >= 45 && tickAnim < 117) {
            xx = -21.9146 + (((tickAnim - 45) / 72) * (-21.9146-(-21.9146)));
            yy = -3.59067 + (((tickAnim - 45) / 72) * (-3.59067-(-3.59067)));
            zz = -2.07987 + (((tickAnim - 45) / 72) * (-2.07987-(-2.07987)));
        }
        else if (tickAnim >= 117 && tickAnim < 160) {
            xx = -21.9146 + (((tickAnim - 117) / 43) * (0-(-21.9146)));
            yy = -3.59067 + (((tickAnim - 117) / 43) * (0-(-3.59067)));
            zz = -2.07987 + (((tickAnim - 117) / 43) * (0-(-2.07987)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg1, leftLeg1.rotateAngleX + (float) Math.toRadians(xx), leftLeg1.rotateAngleY + (float) Math.toRadians(yy), leftLeg1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 0) / 23) * (43.25-(0)));
            yy = 0 + (((tickAnim - 0) / 23) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 23) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 45) {
            xx = 43.25 + (((tickAnim - 23) / 22) * (43.25-(43.25)));
            yy = 0 + (((tickAnim - 23) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 22) * (0-(0)));
        }
        else if (tickAnim >= 45 && tickAnim < 117) {
            xx = 43.25 + (((tickAnim - 45) / 72) * (43.25-(43.25)));
            yy = 0 + (((tickAnim - 45) / 72) * (0-(0)));
            zz = 0 + (((tickAnim - 45) / 72) * (0-(0)));
        }
        else if (tickAnim >= 117 && tickAnim < 160) {
            xx = 43.25 + (((tickAnim - 117) / 43) * (0-(43.25)));
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
            yy = 0 + (((tickAnim - 0) / 23) * (1.4-(0)));
            zz = 0 + (((tickAnim - 0) / 23) * (-0.5-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 45) {
            xx = 0 + (((tickAnim - 23) / 22) * (0-(0)));
            yy = 1.4 + (((tickAnim - 23) / 22) * (1.4-(1.4)));
            zz = -0.5 + (((tickAnim - 23) / 22) * (-0.5-(-0.5)));
        }
        else if (tickAnim >= 45 && tickAnim < 117) {
            xx = 0 + (((tickAnim - 45) / 72) * (0-(0)));
            yy = 1.4 + (((tickAnim - 45) / 72) * (1.4-(1.4)));
            zz = -0.5 + (((tickAnim - 45) / 72) * (-0.5-(-0.5)));
        }
        else if (tickAnim >= 117 && tickAnim < 160) {
            xx = 0 + (((tickAnim - 117) / 43) * (0-(0)));
            yy = 1.4 + (((tickAnim - 117) / 43) * (0-(1.4)));
            zz = -0.5 + (((tickAnim - 117) / 43) * (0-(-0.5)));
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
            xx = 0 + (((tickAnim - 0) / 23) * (-23.25-(0)));
            yy = 0 + (((tickAnim - 0) / 23) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 23) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 45) {
            xx = -23.25 + (((tickAnim - 23) / 22) * (-21.25-(-23.25)));
            yy = 0 + (((tickAnim - 23) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 22) * (0-(0)));
        }
        else if (tickAnim >= 45 && tickAnim < 117) {
            xx = -21.25 + (((tickAnim - 45) / 72) * (-21.25-(-21.25)));
            yy = 0 + (((tickAnim - 45) / 72) * (0-(0)));
            zz = 0 + (((tickAnim - 45) / 72) * (0-(0)));
        }
        else if (tickAnim >= 117 && tickAnim < 160) {
            xx = -21.25 + (((tickAnim - 117) / 43) * (0-(-21.25)));
            yy = 0 + (((tickAnim - 117) / 43) * (0-(0)));
            zz = 0 + (((tickAnim - 117) / 43) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg3, leftLeg3.rotateAngleX + (float) Math.toRadians(xx), leftLeg3.rotateAngleY + (float) Math.toRadians(yy), leftLeg3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 0) / 23) * (-1-(0)));
            yy = 0 + (((tickAnim - 0) / 23) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 23) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 45) {
            xx = -1 + (((tickAnim - 23) / 22) * (0-(-1)));
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
        this.setRotateAngle(leftFoot, leftFoot.rotateAngleX + (float) Math.toRadians(xx), leftFoot.rotateAngleY + (float) Math.toRadians(yy), leftFoot.rotateAngleZ + (float) Math.toRadians(zz));

        this.leftFoot.rotationPointX = this.leftFoot.rotationPointX + (float)(0);
        this.leftFoot.rotationPointY = this.leftFoot.rotationPointY - (float)(0);
        this.leftFoot.rotationPointZ = this.leftFoot.rotationPointZ + (float)(0);



        if (tickAnim >= 0 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 0) / 23) * (6-(0)));
            yy = 0 + (((tickAnim - 0) / 23) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 23) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 45) {
            xx = 6 + (((tickAnim - 23) / 22) * (-9.25-(6)));
            yy = 0 + (((tickAnim - 23) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 22) * (0-(0)));
        }
        else if (tickAnim >= 45 && tickAnim < 117) {
            xx = -9.25 + (((tickAnim - 45) / 72) * (-9.25-(-9.25)));
            yy = 0 + (((tickAnim - 45) / 72) * (0-(0)));
            zz = 0 + (((tickAnim - 45) / 72) * (0-(0)));
        }
        else if (tickAnim >= 117 && tickAnim < 160) {
            xx = -9.25 + (((tickAnim - 117) / 43) * (0-(-9.25)));
            yy = 0 + (((tickAnim - 117) / 43) * (0-(0)));
            zz = 0 + (((tickAnim - 117) / 43) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail1, tail1.rotateAngleX + (float) Math.toRadians(xx), tail1.rotateAngleY + (float) Math.toRadians(yy), tail1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (-8.75-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 23) {
            xx = -8.75 + (((tickAnim - 13) / 10) * (0-(-8.75)));
            yy = 0 + (((tickAnim - 13) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 10) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 45) {
            xx = 0 + (((tickAnim - 23) / 22) * (0-(0)));
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
        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(xx), tail2.rotateAngleY + (float) Math.toRadians(yy), tail2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 117 && tickAnim < 160) {
            xx = 0 + (((tickAnim - 117) / 43) * (0-(0)));
            yy = 0 + (((tickAnim - 117) / 43) * (0-(0)));
            zz = 0 + (((tickAnim - 117) / 43) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(xx), tail3.rotateAngleY + (float) Math.toRadians(yy), tail3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 0) / 23) * (9.5-(0)));
            yy = 0 + (((tickAnim - 0) / 23) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 23) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 45) {
            xx = 9.5 + (((tickAnim - 23) / 22) * (9.5-(9.5)));
            yy = 0 + (((tickAnim - 23) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 22) * (0-(0)));
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
        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(xx), tail4.rotateAngleY + (float) Math.toRadians(yy), tail4.rotateAngleZ + (float) Math.toRadians(zz));




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
        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(xx), chest.rotateAngleY + (float) Math.toRadians(yy), chest.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 0) / 23) * (23.75-(0)));
            yy = 0 + (((tickAnim - 0) / 23) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 23) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 45) {
            xx = 23.75 + (((tickAnim - 23) / 22) * (27.98525-(23.75)));
            yy = 0 + (((tickAnim - 23) / 22) * (2.17906-(0)));
            zz = 0 + (((tickAnim - 23) / 22) * (-5.25082-(0)));
        }
        else if (tickAnim >= 45 && tickAnim < 117) {
            xx = 27.98525 + (((tickAnim - 45) / 72) * (27.98525-(27.98525)));
            yy = 2.17906 + (((tickAnim - 45) / 72) * (2.17906-(2.17906)));
            zz = -5.25082 + (((tickAnim - 45) / 72) * (-5.25082-(-5.25082)));
        }
        else if (tickAnim >= 117 && tickAnim < 160) {
            xx = 27.98525 + (((tickAnim - 117) / 43) * (0-(27.98525)));
            yy = 2.17906 + (((tickAnim - 117) / 43) * (0-(2.17906)));
            zz = -5.25082 + (((tickAnim - 117) / 43) * (0-(-5.25082)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm1, leftArm1.rotateAngleX + (float) Math.toRadians(xx), leftArm1.rotateAngleY + (float) Math.toRadians(yy), leftArm1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 0) / 23) * (-34.75-(0)));
            yy = 0 + (((tickAnim - 0) / 23) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 23) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 45) {
            xx = -34.75 + (((tickAnim - 23) / 22) * (-28.09658-(-34.75)));
            yy = 0 + (((tickAnim - 23) / 22) * (2.87389-(0)));
            zz = 0 + (((tickAnim - 23) / 22) * (6.11021-(0)));
        }
        else if (tickAnim >= 45 && tickAnim < 117) {
            xx = -28.09658 + (((tickAnim - 45) / 72) * (-28.09658-(-28.09658)));
            yy = 2.87389 + (((tickAnim - 45) / 72) * (2.87389-(2.87389)));
            zz = 6.11021 + (((tickAnim - 45) / 72) * (6.11021-(6.11021)));
        }
        else if (tickAnim >= 117 && tickAnim < 160) {
            xx = -28.09658 + (((tickAnim - 117) / 43) * (0-(-28.09658)));
            yy = 2.87389 + (((tickAnim - 117) / 43) * (0-(2.87389)));
            zz = 6.11021 + (((tickAnim - 117) / 43) * (0-(6.11021)));
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
            yy = 0 + (((tickAnim - 23) / 22) * (0.925-(0)));
            zz = -0.825 + (((tickAnim - 23) / 22) * (0.205-(-0.825)));
        }
        else if (tickAnim >= 45 && tickAnim < 117) {
            xx = 0 + (((tickAnim - 45) / 72) * (0-(0)));
            yy = 0.925 + (((tickAnim - 45) / 72) * (0.925-(0.925)));
            zz = 0.205 + (((tickAnim - 45) / 72) * (0.205-(0.205)));
        }
        else if (tickAnim >= 117 && tickAnim < 160) {
            xx = 0 + (((tickAnim - 117) / 43) * (0-(0)));
            yy = 0.925 + (((tickAnim - 117) / 43) * (0-(0.925)));
            zz = 0.205 + (((tickAnim - 117) / 43) * (0-(0.205)));
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
            xx = 0 + (((tickAnim - 0) / 23) * (12.31778-(0)));
            yy = 0 + (((tickAnim - 0) / 23) * (16.60555-(0)));
            zz = 0 + (((tickAnim - 0) / 23) * (5.77342-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 45) {
            xx = 12.31778 + (((tickAnim - 23) / 22) * (-10.29872-(12.31778)));
            yy = 16.60555 + (((tickAnim - 23) / 22) * (18.0149-(16.60555)));
            zz = 5.77342 + (((tickAnim - 23) / 22) * (10.19987-(5.77342)));
        }
        else if (tickAnim >= 45 && tickAnim < 117) {
            xx = -10.29872 + (((tickAnim - 45) / 72) * (-10.29872-(-10.29872)));
            yy = 18.0149 + (((tickAnim - 45) / 72) * (18.0149-(18.0149)));
            zz = 10.19987 + (((tickAnim - 45) / 72) * (10.19987-(10.19987)));
        }
        else if (tickAnim >= 117 && tickAnim < 160) {
            xx = -10.29872 + (((tickAnim - 117) / 43) * (0-(-10.29872)));
            yy = 18.0149 + (((tickAnim - 117) / 43) * (0-(18.0149)));
            zz = 10.19987 + (((tickAnim - 117) / 43) * (0-(10.19987)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftHand, leftHand.rotateAngleX + (float) Math.toRadians(xx), leftHand.rotateAngleY + (float) Math.toRadians(yy), leftHand.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 0) / 23) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 23) * (1.25-(0)));
            zz = 0 + (((tickAnim - 0) / 23) * (0.4-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 45) {
            xx = 0 + (((tickAnim - 23) / 22) * (0-(0)));
            yy = 1.25 + (((tickAnim - 23) / 22) * (1.5-(1.25)));
            zz = 0.4 + (((tickAnim - 23) / 22) * (0.05-(0.4)));
        }
        else if (tickAnim >= 45 && tickAnim < 117) {
            xx = 0 + (((tickAnim - 45) / 72) * (0-(0)));
            yy = 1.5 + (((tickAnim - 45) / 72) * (1.5-(1.5)));
            zz = 0.05 + (((tickAnim - 45) / 72) * (0.05-(0.05)));
        }
        else if (tickAnim >= 117 && tickAnim < 160) {
            xx = 0 + (((tickAnim - 117) / 43) * (0-(0)));
            yy = 1.5 + (((tickAnim - 117) / 43) * (0-(1.5)));
            zz = 0.05 + (((tickAnim - 117) / 43) * (0-(0.05)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftHand.rotationPointX = this.leftHand.rotationPointX + (float)(xx);
        this.leftHand.rotationPointY = this.leftHand.rotationPointY - (float)(yy);
        this.leftHand.rotationPointZ = this.leftHand.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 0) / 23) * (27-(0)));
            yy = 0 + (((tickAnim - 0) / 23) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 23) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 45) {
            xx = 27 + (((tickAnim - 23) / 22) * (18.75-(27)));
            yy = 0 + (((tickAnim - 23) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 22) * (0-(0)));
        }
        else if (tickAnim >= 45 && tickAnim < 117) {
            xx = 18.75 + (((tickAnim - 45) / 72) * (18.75-(18.75)));
            yy = 0 + (((tickAnim - 45) / 72) * (0-(0)));
            zz = 0 + (((tickAnim - 45) / 72) * (0-(0)));
        }
        else if (tickAnim >= 117 && tickAnim < 160) {
            xx = 18.75 + (((tickAnim - 117) / 43) * (0-(18.75)));
            yy = 0 + (((tickAnim - 117) / 43) * (0-(0)));
            zz = 0 + (((tickAnim - 117) / 43) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck1, neck1.rotateAngleX + (float) Math.toRadians(xx), neck1.rotateAngleY + (float) Math.toRadians(yy), neck1.rotateAngleZ + (float) Math.toRadians(zz));


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
        this.neck1.rotationPointX = this.neck1.rotationPointX + (float)(xx);
        this.neck1.rotationPointY = this.neck1.rotationPointY - (float)(yy);
        this.neck1.rotationPointZ = this.neck1.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 0) / 23) * (18.25-(0)));
            yy = 0 + (((tickAnim - 0) / 23) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 23) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 45) {
            xx = 18.25 + (((tickAnim - 23) / 22) * (3-(18.25)));
            yy = 0 + (((tickAnim - 23) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 22) * (0-(0)));
        }
        else if (tickAnim >= 45 && tickAnim < 117) {
            xx = 3 + (((tickAnim - 45) / 72) * (3-(3)));
            yy = 0 + (((tickAnim - 45) / 72) * (0-(0)));
            zz = 0 + (((tickAnim - 45) / 72) * (0-(0)));
        }
        else if (tickAnim >= 117 && tickAnim < 160) {
            xx = 3 + (((tickAnim - 117) / 43) * (0-(3)));
            yy = 0 + (((tickAnim - 117) / 43) * (0-(0)));
            zz = 0 + (((tickAnim - 117) / 43) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(xx), neck2.rotateAngleY + (float) Math.toRadians(yy), neck2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 0) / 23) * (2.75-(0)));
            yy = 0 + (((tickAnim - 0) / 23) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 23) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 45) {
            xx = 2.75 + (((tickAnim - 23) / 22) * (2.75-(2.75)));
            yy = 0 + (((tickAnim - 23) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 22) * (0-(0)));
        }
        else if (tickAnim >= 45 && tickAnim < 117) {
            xx = 2.75 + (((tickAnim - 45) / 72) * (2.75-(2.75)));
            yy = 0 + (((tickAnim - 45) / 72) * (0-(0)));
            zz = 0 + (((tickAnim - 45) / 72) * (0-(0)));
        }
        else if (tickAnim >= 117 && tickAnim < 160) {
            xx = 2.75 + (((tickAnim - 117) / 43) * (0-(2.75)));
            yy = 0 + (((tickAnim - 117) / 43) * (0-(0)));
            zz = 0 + (((tickAnim - 117) / 43) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(xx), neck3.rotateAngleY + (float) Math.toRadians(yy), neck3.rotateAngleZ + (float) Math.toRadians(zz));



        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(0), head.rotateAngleY + (float) Math.toRadians(0), head.rotateAngleZ + (float) Math.toRadians(0));



        if (tickAnim >= 0 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 0) / 23) * (23.75-(0)));
            yy = 0 + (((tickAnim - 0) / 23) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 23) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 45) {
            xx = 23.75 + (((tickAnim - 23) / 22) * (27.98525-(23.75)));
            yy = 0 + (((tickAnim - 23) / 22) * (-2.17906-(0)));
            zz = 0 + (((tickAnim - 23) / 22) * (5.25082-(0)));
        }
        else if (tickAnim >= 45 && tickAnim < 117) {
            xx = 27.98525 + (((tickAnim - 45) / 72) * (27.98525-(27.98525)));
            yy = -2.17906 + (((tickAnim - 45) / 72) * (-2.17906-(-2.17906)));
            zz = 5.25082 + (((tickAnim - 45) / 72) * (5.25082-(5.25082)));
        }
        else if (tickAnim >= 117 && tickAnim < 160) {
            xx = 27.98525 + (((tickAnim - 117) / 43) * (0-(27.98525)));
            yy = -2.17906 + (((tickAnim - 117) / 43) * (0-(-2.17906)));
            zz = 5.25082 + (((tickAnim - 117) / 43) * (0-(5.25082)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm1, rightArm1.rotateAngleX + (float) Math.toRadians(xx), rightArm1.rotateAngleY + (float) Math.toRadians(yy), rightArm1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 0) / 23) * (-34.75-(0)));
            yy = 0 + (((tickAnim - 0) / 23) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 23) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 45) {
            xx = -34.75 + (((tickAnim - 23) / 22) * (-28.09658-(-34.75)));
            yy = 0 + (((tickAnim - 23) / 22) * (2.87389-(0)));
            zz = 0 + (((tickAnim - 23) / 22) * (6.11021-(0)));
        }
        else if (tickAnim >= 45 && tickAnim < 117) {
            xx = -28.09658 + (((tickAnim - 45) / 72) * (-28.09658-(-28.09658)));
            yy = 2.87389 + (((tickAnim - 45) / 72) * (2.87389-(2.87389)));
            zz = 6.11021 + (((tickAnim - 45) / 72) * (6.11021-(6.11021)));
        }
        else if (tickAnim >= 117 && tickAnim < 160) {
            xx = -28.09658 + (((tickAnim - 117) / 43) * (0-(-28.09658)));
            yy = 2.87389 + (((tickAnim - 117) / 43) * (0-(2.87389)));
            zz = 6.11021 + (((tickAnim - 117) / 43) * (0-(6.11021)));
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
            yy = 0 + (((tickAnim - 23) / 22) * (0.925-(0)));
            zz = -0.825 + (((tickAnim - 23) / 22) * (0.205-(-0.825)));
        }
        else if (tickAnim >= 45 && tickAnim < 117) {
            xx = 0 + (((tickAnim - 45) / 72) * (0-(0)));
            yy = 0.925 + (((tickAnim - 45) / 72) * (0.925-(0.925)));
            zz = 0.205 + (((tickAnim - 45) / 72) * (0.205-(0.205)));
        }
        else if (tickAnim >= 117 && tickAnim < 160) {
            xx = 0 + (((tickAnim - 117) / 43) * (0-(0)));
            yy = 0.925 + (((tickAnim - 117) / 43) * (0-(0.925)));
            zz = 0.205 + (((tickAnim - 117) / 43) * (0-(0.205)));
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
            xx = 0 + (((tickAnim - 0) / 23) * (12.31778-(0)));
            yy = 0 + (((tickAnim - 0) / 23) * (-16.60555-(0)));
            zz = 0 + (((tickAnim - 0) / 23) * (-5.77342-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 45) {
            xx = 12.31778 + (((tickAnim - 23) / 22) * (-10.29872-(12.31778)));
            yy = -16.60555 + (((tickAnim - 23) / 22) * (-18.0149-(-16.60555)));
            zz = -5.77342 + (((tickAnim - 23) / 22) * (-10.19987-(-5.77342)));
        }
        else if (tickAnim >= 45 && tickAnim < 117) {
            xx = -10.29872 + (((tickAnim - 45) / 72) * (-10.29872-(-10.29872)));
            yy = -18.0149 + (((tickAnim - 45) / 72) * (-18.0149-(-18.0149)));
            zz = -10.19987 + (((tickAnim - 45) / 72) * (-10.19987-(-10.19987)));
        }
        else if (tickAnim >= 117 && tickAnim < 160) {
            xx = -10.29872 + (((tickAnim - 117) / 43) * (0-(-10.29872)));
            yy = -18.0149 + (((tickAnim - 117) / 43) * (0-(-18.0149)));
            zz = -10.19987 + (((tickAnim - 117) / 43) * (0-(-10.19987)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightHand, rightHand.rotateAngleX + (float) Math.toRadians(xx), rightHand.rotateAngleY + (float) Math.toRadians(yy), rightHand.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 0) / 23) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 23) * (1.25-(0)));
            zz = 0 + (((tickAnim - 0) / 23) * (0.4-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 45) {
            xx = 0 + (((tickAnim - 23) / 22) * (0-(0)));
            yy = 1.25 + (((tickAnim - 23) / 22) * (1.5-(1.25)));
            zz = 0.4 + (((tickAnim - 23) / 22) * (0.05-(0.4)));
        }
        else if (tickAnim >= 45 && tickAnim < 117) {
            xx = 0 + (((tickAnim - 45) / 72) * (0-(0)));
            yy = 1.5 + (((tickAnim - 45) / 72) * (1.5-(1.5)));
            zz = 0.05 + (((tickAnim - 45) / 72) * (0.05-(0.05)));
        }
        else if (tickAnim >= 117 && tickAnim < 160) {
            xx = 0 + (((tickAnim - 117) / 43) * (0-(0)));
            yy = 1.5 + (((tickAnim - 117) / 43) * (0-(1.5)));
            zz = 0.05 + (((tickAnim - 117) / 43) * (0-(0.05)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightHand.rotationPointX = this.rightHand.rotationPointX + (float)(xx);
        this.rightHand.rotationPointY = this.rightHand.rotationPointY - (float)(yy);
        this.rightHand.rotationPointZ = this.rightHand.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 0) / 23) * (-6.0562-(0)));
            yy = 0 + (((tickAnim - 0) / 23) * (-10.57522-(0)));
            zz = 0 + (((tickAnim - 0) / 23) * (3.17512-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 45) {
            xx = -6.0562 + (((tickAnim - 23) / 22) * (-21.48541-(-6.0562)));
            yy = -10.57522 + (((tickAnim - 23) / 22) * (3.83732-(-10.57522)));
            zz = 3.17512 + (((tickAnim - 23) / 22) * (2.90804-(3.17512)));
        }
        else if (tickAnim >= 45 && tickAnim < 117) {
            xx = -21.48541 + (((tickAnim - 45) / 72) * (-21.48541-(-21.48541)));
            yy = 3.83732 + (((tickAnim - 45) / 72) * (3.83732-(3.83732)));
            zz = 2.90804 + (((tickAnim - 45) / 72) * (2.90804-(2.90804)));
        }
        else if (tickAnim >= 117 && tickAnim < 160) {
            xx = -21.48541 + (((tickAnim - 117) / 43) * (0-(-21.48541)));
            yy = 3.83732 + (((tickAnim - 117) / 43) * (0-(3.83732)));
            zz = 2.90804 + (((tickAnim - 117) / 43) * (0-(2.90804)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg1, rightLeg1.rotateAngleX + (float) Math.toRadians(xx), rightLeg1.rotateAngleY + (float) Math.toRadians(yy), rightLeg1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 0) / 23) * (43.25-(0)));
            yy = 0 + (((tickAnim - 0) / 23) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 23) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 45) {
            xx = 43.25 + (((tickAnim - 23) / 22) * (43.25-(43.25)));
            yy = 0 + (((tickAnim - 23) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 22) * (0-(0)));
        }
        else if (tickAnim >= 45 && tickAnim < 117) {
            xx = 43.25 + (((tickAnim - 45) / 72) * (43.25-(43.25)));
            yy = 0 + (((tickAnim - 45) / 72) * (0-(0)));
            zz = 0 + (((tickAnim - 45) / 72) * (0-(0)));
        }
        else if (tickAnim >= 117 && tickAnim < 160) {
            xx = 43.25 + (((tickAnim - 117) / 43) * (0-(43.25)));
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
            yy = 0 + (((tickAnim - 0) / 23) * (1.4-(0)));
            zz = 0 + (((tickAnim - 0) / 23) * (-0.5-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 45) {
            xx = 0 + (((tickAnim - 23) / 22) * (0-(0)));
            yy = 1.4 + (((tickAnim - 23) / 22) * (1.4-(1.4)));
            zz = -0.5 + (((tickAnim - 23) / 22) * (-0.5-(-0.5)));
        }
        else if (tickAnim >= 45 && tickAnim < 117) {
            xx = 0 + (((tickAnim - 45) / 72) * (0-(0)));
            yy = 1.4 + (((tickAnim - 45) / 72) * (1.4-(1.4)));
            zz = -0.5 + (((tickAnim - 45) / 72) * (-0.5-(-0.5)));
        }
        else if (tickAnim >= 117 && tickAnim < 160) {
            xx = 0 + (((tickAnim - 117) / 43) * (0-(0)));
            yy = 1.4 + (((tickAnim - 117) / 43) * (0-(1.4)));
            zz = -0.5 + (((tickAnim - 117) / 43) * (0-(-0.5)));
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
            xx = 0 + (((tickAnim - 0) / 23) * (-23.25-(0)));
            yy = 0 + (((tickAnim - 0) / 23) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 23) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 45) {
            xx = -23.25 + (((tickAnim - 23) / 22) * (-21.25-(-23.25)));
            yy = 0 + (((tickAnim - 23) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 22) * (0-(0)));
        }
        else if (tickAnim >= 45 && tickAnim < 117) {
            xx = -21.25 + (((tickAnim - 45) / 72) * (-21.25-(-21.25)));
            yy = 0 + (((tickAnim - 45) / 72) * (0-(0)));
            zz = 0 + (((tickAnim - 45) / 72) * (0-(0)));
        }
        else if (tickAnim >= 117 && tickAnim < 160) {
            xx = -21.25 + (((tickAnim - 117) / 43) * (0-(-21.25)));
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
            xx = 0 + (((tickAnim - 0) / 23) * (-1-(0)));
            yy = 0 + (((tickAnim - 0) / 23) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 23) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 45) {
            xx = -1 + (((tickAnim - 23) / 22) * (0-(-1)));
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
        this.setRotateAngle(rightFoot, rightFoot.rotateAngleX + (float) Math.toRadians(xx), rightFoot.rotateAngleY + (float) Math.toRadians(yy), rightFoot.rotateAngleZ + (float) Math.toRadians(zz));

        this.rightFoot.rotationPointX = this.rightFoot.rotationPointX + (float)(0);
        this.rightFoot.rotationPointY = this.rightFoot.rotationPointY - (float)(0);
        this.rightFoot.rotationPointZ = this.rightFoot.rotationPointZ + (float)(0);
        
    }
    public void animLay(EntityLivingBase entitylivinghipsIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraSauropelta entity = (EntityPrehistoricFloraSauropelta) entitylivinghipsIn;
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
        this.setRotateAngle(hips, hips.rotateAngleX + (float) Math.toRadians(xx), hips.rotateAngleY + (float) Math.toRadians(yy), hips.rotateAngleZ + (float) Math.toRadians(zz));


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
        this.hips.rotationPointX = this.hips.rotationPointX + (float)(xx);
        this.hips.rotationPointY = this.hips.rotationPointY - (float)(yy);
        this.hips.rotationPointZ = this.hips.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (-23.75-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = -23.75 + (((tickAnim - 20) / 10) * (-23.75-(-23.75)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = -23.75 + (((tickAnim - 30) / 20) * (0-(-23.75)));
            yy = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg1, leftLeg1.rotateAngleX + (float) Math.toRadians(xx), leftLeg1.rotateAngleY + (float) Math.toRadians(yy), leftLeg1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (43.25-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 43.25 + (((tickAnim - 20) / 10) * (43.25-(43.25)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 43.25 + (((tickAnim - 30) / 20) * (0-(43.25)));
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
            xx = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (1.25-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (-0.325-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            yy = 1.25 + (((tickAnim - 20) / 10) * (1.25-(1.25)));
            zz = -0.325 + (((tickAnim - 20) / 10) * (-0.325-(-0.325)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            yy = 1.25 + (((tickAnim - 30) / 20) * (0-(1.25)));
            zz = -0.325 + (((tickAnim - 30) / 20) * (0-(-0.325)));
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
            xx = 0 + (((tickAnim - 0) / 20) * (-19.75-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = -19.75 + (((tickAnim - 20) / 10) * (-19.75-(-19.75)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = -19.75 + (((tickAnim - 30) / 20) * (0-(-19.75)));
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
            xx = 0 + (((tickAnim - 0) / 20) * (6.21393-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (1.41133-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (-2.92786-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 6.21393 + (((tickAnim - 20) / 10) * (6.21393-(6.21393)));
            yy = 1.41133 + (((tickAnim - 20) / 10) * (1.41133-(1.41133)));
            zz = -2.92786 + (((tickAnim - 20) / 10) * (-2.92786-(-2.92786)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 6.21393 + (((tickAnim - 30) / 20) * (0-(6.21393)));
            yy = 1.41133 + (((tickAnim - 30) / 20) * (0-(1.41133)));
            zz = -2.92786 + (((tickAnim - 30) / 20) * (0-(-2.92786)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftFoot, leftFoot.rotateAngleX + (float) Math.toRadians(xx), leftFoot.rotateAngleY + (float) Math.toRadians(yy), leftFoot.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (-14.4-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 20) {
            xx = -14.4 + (((tickAnim - 8) / 12) * (-2.75-(-14.4)));
            yy = 0 + (((tickAnim - 8) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 12) * (0-(0)));
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
        this.setRotateAngle(tail1, tail1.rotateAngleX + (float) Math.toRadians(xx), tail1.rotateAngleY + (float) Math.toRadians(yy), tail1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (-1.9891-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (-0.74796-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0.74633-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 20) {
            xx = -1.9891 + (((tickAnim - 8) / 12) * (-2.25-(-1.9891)));
            yy = -0.74796 + (((tickAnim - 8) / 12) * (0-(-0.74796)));
            zz = 0.74633 + (((tickAnim - 8) / 12) * (0-(0.74633)));
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
        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(xx), tail2.rotateAngleY + (float) Math.toRadians(yy), tail2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (10.94-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 20) {
            xx = 10.94 + (((tickAnim - 8) / 12) * (8.25-(10.94)));
            yy = 0 + (((tickAnim - 8) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 12) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 8.25 + (((tickAnim - 20) / 10) * (8.25-(8.25)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 37) {
            xx = 8.25 + (((tickAnim - 30) / 7) * (-4.71-(8.25)));
            yy = 0 + (((tickAnim - 30) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 7) * (0-(0)));
        }
        else if (tickAnim >= 37 && tickAnim < 42) {
            xx = -4.71 + (((tickAnim - 37) / 5) * (-13.06-(-4.71)));
            yy = 0 + (((tickAnim - 37) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 37) / 5) * (0-(0)));
        }
        else if (tickAnim >= 42 && tickAnim < 50) {
            xx = -13.06 + (((tickAnim - 42) / 8) * (0-(-13.06)));
            yy = 0 + (((tickAnim - 42) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 42) / 8) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(xx), tail3.rotateAngleY + (float) Math.toRadians(yy), tail3.rotateAngleZ + (float) Math.toRadians(zz));




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
        this.setRotateAngle(leftArm1, leftArm1.rotateAngleX + (float) Math.toRadians(xx), leftArm1.rotateAngleY + (float) Math.toRadians(yy), leftArm1.rotateAngleZ + (float) Math.toRadians(zz));




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
        this.setRotateAngle(leftHand, leftHand.rotateAngleX + (float) Math.toRadians(xx), leftHand.rotateAngleY + (float) Math.toRadians(yy), leftHand.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (-0.75-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = -0.75 + (((tickAnim - 20) / 10) * (-0.75-(-0.75)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            zz = -0.75 + (((tickAnim - 30) / 20) * (0-(-0.75)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftHand.rotationPointX = this.leftHand.rotationPointX + (float)(xx);
        this.leftHand.rotationPointY = this.leftHand.rotationPointY - (float)(yy);
        this.leftHand.rotationPointZ = this.leftHand.rotationPointZ + (float)(zz);




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
        this.setRotateAngle(rightArm1, rightArm1.rotateAngleX + (float) Math.toRadians(xx), rightArm1.rotateAngleY + (float) Math.toRadians(yy), rightArm1.rotateAngleZ + (float) Math.toRadians(zz));




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
        this.setRotateAngle(rightHand, rightHand.rotateAngleX + (float) Math.toRadians(xx), rightHand.rotateAngleY + (float) Math.toRadians(yy), rightHand.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (-0.75-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = -0.75 + (((tickAnim - 20) / 10) * (-0.75-(-0.75)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            zz = -0.75 + (((tickAnim - 30) / 20) * (0-(-0.75)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightHand.rotationPointX = this.rightHand.rotationPointX + (float)(xx);
        this.rightHand.rotationPointY = this.rightHand.rotationPointY - (float)(yy);
        this.rightHand.rotationPointZ = this.rightHand.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (-23.75-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = -23.75 + (((tickAnim - 20) / 10) * (-23.75-(-23.75)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = -23.75 + (((tickAnim - 30) / 20) * (0-(-23.75)));
            yy = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg1, rightLeg1.rotateAngleX + (float) Math.toRadians(xx), rightLeg1.rotateAngleY + (float) Math.toRadians(yy), rightLeg1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (43.25-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 43.25 + (((tickAnim - 20) / 10) * (43.25-(43.25)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 43.25 + (((tickAnim - 30) / 20) * (0-(43.25)));
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
            xx = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (1.25-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (-0.325-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            yy = 1.25 + (((tickAnim - 20) / 10) * (1.25-(1.25)));
            zz = -0.325 + (((tickAnim - 20) / 10) * (-0.325-(-0.325)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            yy = 1.25 + (((tickAnim - 30) / 20) * (0-(1.25)));
            zz = -0.325 + (((tickAnim - 30) / 20) * (0-(-0.325)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightLeg2.rotationPointX = this.rightLeg2.rotationPointX + (float)(xx);
        this.rightLeg2.rotationPointY = this.rightLeg2.rotationPointY - (float)(yy);
        this.rightLeg2.rotationPointZ = this.rightLeg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (-19.75-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = -19.75 + (((tickAnim - 20) / 10) * (-19.75-(-19.75)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = -19.75 + (((tickAnim - 30) / 20) * (0-(-19.75)));
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
            xx = 0 + (((tickAnim - 0) / 20) * (6.21393-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (1.41133-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (-2.92786-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 6.21393 + (((tickAnim - 20) / 10) * (6.21393-(6.21393)));
            yy = 1.41133 + (((tickAnim - 20) / 10) * (1.41133-(1.41133)));
            zz = -2.92786 + (((tickAnim - 20) / 10) * (-2.92786-(-2.92786)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 6.21393 + (((tickAnim - 30) / 20) * (0-(6.21393)));
            yy = 1.41133 + (((tickAnim - 30) / 20) * (0-(1.41133)));
            zz = -2.92786 + (((tickAnim - 30) / 20) * (0-(-2.92786)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightFoot, rightFoot.rotateAngleX + (float) Math.toRadians(xx), rightFoot.rotateAngleY + (float) Math.toRadians(yy), rightFoot.rotateAngleZ + (float) Math.toRadians(zz));

    }
    public void animNest(EntityLivingBase entitylivinghipsIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraSauropelta entity = (EntityPrehistoricFloraSauropelta) entitylivinghipsIn;
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
            xx = 0 + (((tickAnim - 0) / 15) * (19.25-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 23) {
            xx = 19.25 + (((tickAnim - 15) / 8) * (-19.58-(19.25)));
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
            yy = 0 + (((tickAnim - 0) / 15) * (0.3-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 15) / 8) * (0-(0)));
            yy = 0.3 + (((tickAnim - 15) / 8) * (1.325-(0.3)));
            zz = 0 + (((tickAnim - 15) / 8) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 23) / 10) * (0-(0)));
            yy = 1.325 + (((tickAnim - 23) / 10) * (-0.75-(1.325)));
            zz = 0 + (((tickAnim - 23) / 10) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 33) / 17) * (0-(0)));
            yy = -0.75 + (((tickAnim - 33) / 17) * (0-(-0.75)));
            zz = 0 + (((tickAnim - 33) / 17) * (0-(0)));
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
            xx = 0 + (((tickAnim - 0) / 15) * (17.25-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 19) {
            xx = 17.25 + (((tickAnim - 15) / 4) * (-5.78-(17.25)));
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
            xx = 0 + (((tickAnim - 0) / 15) * (14.25-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 23) {
            xx = 14.25 + (((tickAnim - 15) / 8) * (85.25-(14.25)));
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
        this.setRotateAngle(leftFoot, leftFoot.rotateAngleX + (float) Math.toRadians(xx), leftFoot.rotateAngleY + (float) Math.toRadians(yy), leftFoot.rotateAngleZ + (float) Math.toRadians(zz));


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
            zz = -0.14 + (((tickAnim - 19) / 4) * (-0.925-(-0.14)));
        }
        else if (tickAnim >= 23 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 23) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 23) / 10) * (0-(0)));
            zz = -0.925 + (((tickAnim - 23) / 10) * (0-(-0.925)));
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
        this.leftFoot.rotationPointX = this.leftFoot.rotationPointX + (float)(xx);
        this.leftFoot.rotationPointY = this.leftFoot.rotationPointY - (float)(yy);
        this.leftFoot.rotationPointZ = this.leftFoot.rotationPointZ + (float)(zz);

    }
    public void animEat(EntityLivingBase entitylivinghipsIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraSauropelta entity = (EntityPrehistoricFloraSauropelta) entitylivinghipsIn;
        int animCycle = 22;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
     if (tickAnim >= 0 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 0) / 12) * (4.5-(0)));
            yy = 0 + (((tickAnim - 0) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 12) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 23) {
            xx = 4.5 + (((tickAnim - 12) / 11) * (0-(4.5)));
            yy = 0 + (((tickAnim - 12) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 11) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(xx), body.rotateAngleY + (float) Math.toRadians(yy), body.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 0) / 12) * (5.75-(0)));
            yy = 0 + (((tickAnim - 0) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 12) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 23) {
            xx = 5.75 + (((tickAnim - 12) / 11) * (0-(5.75)));
            yy = 0 + (((tickAnim - 12) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 11) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(xx), chest.rotateAngleY + (float) Math.toRadians(yy), chest.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 0) / 12) * (-8.51342-(0)));
            yy = 0 + (((tickAnim - 0) / 12) * (4.07252-(0)));
            zz = 0 + (((tickAnim - 0) / 12) * (-15.34635-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 23) {
            xx = -8.51342 + (((tickAnim - 12) / 11) * (0-(-8.51342)));
            yy = 4.07252 + (((tickAnim - 12) / 11) * (0-(4.07252)));
            zz = -15.34635 + (((tickAnim - 12) / 11) * (0-(-15.34635)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm1, leftArm1.rotateAngleX + (float) Math.toRadians(xx), leftArm1.rotateAngleY + (float) Math.toRadians(yy), leftArm1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 0) / 12) * (-15-(0)));
            yy = 0 + (((tickAnim - 0) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 12) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 23) {
            xx = -15 + (((tickAnim - 12) / 11) * (0-(-15)));
            yy = 0 + (((tickAnim - 12) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 11) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm2, leftArm2.rotateAngleX + (float) Math.toRadians(xx), leftArm2.rotateAngleY + (float) Math.toRadians(yy), leftArm2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 0) / 12) * (11.75-(0)));
            yy = 0 + (((tickAnim - 0) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 12) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 23) {
            xx = 11.75 + (((tickAnim - 12) / 11) * (0-(11.75)));
            yy = 0 + (((tickAnim - 12) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 11) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftHand, leftHand.rotateAngleX + (float) Math.toRadians(xx), leftHand.rotateAngleY + (float) Math.toRadians(yy), leftHand.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 0) / 12) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 12) * (-0.2-(0)));
            zz = 0 + (((tickAnim - 0) / 12) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 12) / 11) * (0-(0)));
            yy = -0.2 + (((tickAnim - 12) / 11) * (0-(-0.2)));
            zz = 0 + (((tickAnim - 12) / 11) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftHand.rotationPointX = this.leftHand.rotationPointX + (float)(xx);
        this.leftHand.rotationPointY = this.leftHand.rotationPointY - (float)(yy);
        this.leftHand.rotationPointZ = this.leftHand.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 0) / 12) * (13.5-(0)));
            yy = 0 + (((tickAnim - 0) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 12) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 23) {
            xx = 13.5 + (((tickAnim - 12) / 11) * (0-(13.5)));
            yy = 0 + (((tickAnim - 12) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 11) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck1, neck1.rotateAngleX + (float) Math.toRadians(xx), neck1.rotateAngleY + (float) Math.toRadians(yy), neck1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 0) / 12) * (16.25-(0)));
            yy = 0 + (((tickAnim - 0) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 12) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 16) {
            xx = 16.25 + (((tickAnim - 12) / 4) * (21.5-(16.25)));
            yy = 0 + (((tickAnim - 12) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 4) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 23) {
            xx = 21.5 + (((tickAnim - 16) / 7) * (0-(21.5)));
            yy = 0 + (((tickAnim - 16) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 16) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(xx), neck2.rotateAngleY + (float) Math.toRadians(yy), neck2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 0) / 12) * (19.25-(0)));
            yy = 0 + (((tickAnim - 0) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 12) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 16) {
            xx = 19.25 + (((tickAnim - 12) / 4) * (0-(19.25)));
            yy = 0 + (((tickAnim - 12) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 0) / 12) * (19.25-(0)));
            yy = 0 + (((tickAnim - 0) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 12) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 16) {
            xx = 19.25 + (((tickAnim - 12) / 4) * (0-(19.25)));
            yy = 0 + (((tickAnim - 12) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(xx), jaw.rotateAngleY + (float) Math.toRadians(yy), jaw.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 0) / 12) * (-9.76342-(0)));
            yy = 0 + (((tickAnim - 0) / 12) * (-4.07252-(0)));
            zz = 0 + (((tickAnim - 0) / 12) * (15.34635-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 23) {
            xx = -9.76342 + (((tickAnim - 12) / 11) * (0-(-9.76342)));
            yy = -4.07252 + (((tickAnim - 12) / 11) * (0-(-4.07252)));
            zz = 15.34635 + (((tickAnim - 12) / 11) * (0-(15.34635)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm1, rightArm1.rotateAngleX + (float) Math.toRadians(xx), rightArm1.rotateAngleY + (float) Math.toRadians(yy), rightArm1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 0) / 12) * (-15-(0)));
            yy = 0 + (((tickAnim - 0) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 12) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 23) {
            xx = -15 + (((tickAnim - 12) / 11) * (0-(-15)));
            yy = 0 + (((tickAnim - 12) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 11) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm2, rightArm2.rotateAngleX + (float) Math.toRadians(xx), rightArm2.rotateAngleY + (float) Math.toRadians(yy), rightArm2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 0) / 12) * (11.75-(0)));
            yy = 0 + (((tickAnim - 0) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 12) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 23) {
            xx = 11.75 + (((tickAnim - 12) / 11) * (0-(11.75)));
            yy = 0 + (((tickAnim - 12) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 11) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightHand, rightHand.rotateAngleX + (float) Math.toRadians(xx), rightHand.rotateAngleY + (float) Math.toRadians(yy), rightHand.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 0) / 12) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 12) * (-0.2-(0)));
            zz = 0 + (((tickAnim - 0) / 12) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 12) / 11) * (0-(0)));
            yy = -0.2 + (((tickAnim - 12) / 11) * (0-(-0.2)));
            zz = 0 + (((tickAnim - 12) / 11) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightHand.rotationPointX = this.rightHand.rotationPointX + (float)(xx);
        this.rightHand.rotationPointY = this.rightHand.rotationPointY - (float)(yy);
        this.rightHand.rotationPointZ = this.rightHand.rotationPointZ + (float)(zz);

    }
    public void animNoise(EntityLivingBase entitylivinghipsIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraSauropelta entity = (EntityPrehistoricFloraSauropelta) entitylivinghipsIn;
        int animCycle = 35;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
     if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.876-70))*-2 + (((tickAnim - 0) / 20) * (-2.9535+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.876-70))*-2-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.876-70))*-2)));
            yy = 0 + (((tickAnim - 0) / 20) * (-1.03652-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (-5.14694-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 35) {
            xx = -2.9535+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.876-70))*-2 + (((tickAnim - 20) / 15) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.876-70))*-2-(-2.9535+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.876-70))*-2)));
            yy = -1.03652 + (((tickAnim - 20) / 15) * (0-(-1.03652)));
            zz = -5.14694 + (((tickAnim - 20) / 15) * (0-(-5.14694)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck1, neck1.rotateAngleX + (float) Math.toRadians(xx), neck1.rotateAngleY + (float) Math.toRadians(yy), neck1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.876-70))*-2 + (((tickAnim - 0) / 18) * (0.2091+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.876-70))*-2-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.876-70))*-2)));
            yy = 0 + (((tickAnim - 0) / 18) * (0.38306-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (2.72321-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 35) {
            xx = 0.2091+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.876-70))*-2 + (((tickAnim - 18) / 17) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.876-70))*-2-(0.2091+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.876-70))*-2)));
            yy = 0.38306 + (((tickAnim - 18) / 17) * (0-(0.38306)));
            zz = 2.72321 + (((tickAnim - 18) / 17) * (0-(2.72321)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(xx), neck2.rotateAngleY + (float) Math.toRadians(yy), neck2.rotateAngleZ + (float) Math.toRadians(zz));



        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.876-150))*-2), head.rotateAngleY + (float) Math.toRadians(0), head.rotateAngleZ + (float) Math.toRadians(0));



        if (tickAnim >= 0 && tickAnim < 17) {
            xx = 0 + (((tickAnim - 0) / 17) * (24.5-(0)));
            yy = 0 + (((tickAnim - 0) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 17) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 20) {
            xx = 24.5 + (((tickAnim - 17) / 3) * (27.75-(24.5)));
            yy = 0 + (((tickAnim - 17) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 17) / 3) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 35) {
            xx = 27.75 + (((tickAnim - 20) / 15) * (0-(27.75)));
            yy = 0 + (((tickAnim - 20) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(xx), jaw.rotateAngleY + (float) Math.toRadians(yy), jaw.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (-16-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 35) {
            xx = -16 + (((tickAnim - 20) / 15) * (0-(-16)));
            yy = 0 + (((tickAnim - 20) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(throat, throat.rotateAngleX + (float) Math.toRadians(xx), throat.rotateAngleY + (float) Math.toRadians(yy), throat.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0.625+Math.sin((Math.PI/180)*(((double)tickAnim/20)*800))*-0.1-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 20) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 20) / 15) * (0-(0)));
            zz = 0.625+Math.sin((Math.PI/180)*(((double)tickAnim/20)*800))*-0.1 + (((tickAnim - 20) / 15) * (0-(0.625+Math.sin((Math.PI/180)*(((double)tickAnim/20)*800))*-0.1)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.throat.rotationPointX = this.throat.rotationPointX + (float)(xx);
        this.throat.rotationPointY = this.throat.rotationPointY - (float)(yy);
        this.throat.rotationPointZ = this.throat.rotationPointZ + (float)(zz);


        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 1 + (((tickAnim - 0) / 20) * (1-(1)));
            yy = 1 + (((tickAnim - 0) / 20) * (1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*800))*0.2-(1)));
            zz = 1 + (((tickAnim - 0) / 20) * (1-(1)));
        }
        else if (tickAnim >= 20 && tickAnim < 35) {
            xx = 1 + (((tickAnim - 20) / 15) * (1-(1)));
            yy = 1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*800))*0.2 + (((tickAnim - 20) / 15) * (1-(1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*800))*0.2)));
            zz = 1 + (((tickAnim - 20) / 15) * (1-(1)));
        }
        else {
            xx = 1;
            yy = 1;
            zz = 1;
        }
        this.throat.setScale((float)xx, (float)yy, (float)zz);

    }
    public void animAlert(EntityLivingBase entitylivinghipsIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraSauropelta entity = (EntityPrehistoricFloraSauropelta) entitylivinghipsIn;


    }
    public void animWalking(EntityLivingBase entitylivinghipsIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraSauropelta entity = (EntityPrehistoricFloraSauropelta) entitylivinghipsIn;
        int animCycle = 42;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        this.setRotateAngle(hips, hips.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*169/0.5-70))*1.5), hips.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*169-50))*2.5), hips.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*169-20))*1.5));
        this.hips.rotationPointX = this.hips.rotationPointX + (float)(0);
        this.hips.rotationPointY = this.hips.rotationPointY - (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*169/0.5-80))*-0.15);
        this.hips.rotationPointZ = this.hips.rotationPointZ + (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*169/0.5))*0.25);



        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 1.5 + (((tickAnim - 0) / 13) * (16.75-(1.5)));
            yy = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 21) {
            xx = 16.75 + (((tickAnim - 13) / 8) * (-4.56831-(16.75)));
            yy = 0 + (((tickAnim - 13) / 8) * (0.34182-(0)));
            zz = 0 + (((tickAnim - 13) / 8) * (0.69186-(0)));
        }
        else if (tickAnim >= 21 && tickAnim < 26) {
            xx = -4.56831 + (((tickAnim - 21) / 5) * (-15.25-(-4.56831)));
            yy = 0.34182 + (((tickAnim - 21) / 5) * (0-(0.34182)));
            zz = 0.69186 + (((tickAnim - 21) / 5) * (0-(0.69186)));
        }
        else if (tickAnim >= 26 && tickAnim < 43) {
            xx = -15.25 + (((tickAnim - 26) / 17) * (1.5-(-15.25)));
            yy = 0 + (((tickAnim - 26) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 26) / 17) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg1, leftLeg1.rotateAngleX + (float) Math.toRadians(xx), leftLeg1.rotateAngleY + (float) Math.toRadians(yy), leftLeg1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (7.75-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 21) {
            xx = 7.75 + (((tickAnim - 13) / 8) * (-17.25-(7.75)));
            yy = 0 + (((tickAnim - 13) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 8) * (0-(0)));
        }
        else if (tickAnim >= 21 && tickAnim < 26) {
            xx = -17.25 + (((tickAnim - 21) / 5) * (-13-(-17.25)));
            yy = 0 + (((tickAnim - 21) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 21) / 5) * (0-(0)));
        }
        else if (tickAnim >= 26 && tickAnim < 43) {
            xx = -13 + (((tickAnim - 26) / 17) * (0-(-13)));
            yy = 0 + (((tickAnim - 26) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 26) / 17) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg2, leftLeg2.rotateAngleX + (float) Math.toRadians(xx), leftLeg2.rotateAngleY + (float) Math.toRadians(yy), leftLeg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 21) {
            xx = 0 + (((tickAnim - 13) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 13) / 8) * (1.1-(0)));
            zz = 0 + (((tickAnim - 13) / 8) * (0-(0)));
        }
        else if (tickAnim >= 21 && tickAnim < 26) {
            xx = 0 + (((tickAnim - 21) / 5) * (0-(0)));
            yy = 1.1 + (((tickAnim - 21) / 5) * (0-(1.1)));
            zz = 0 + (((tickAnim - 21) / 5) * (0-(0)));
        }
        else if (tickAnim >= 26 && tickAnim < 43) {
            xx = 0 + (((tickAnim - 26) / 17) * (0-(0)));
            yy = 0 + (((tickAnim - 26) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 26) / 17) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftLeg2.rotationPointX = this.leftLeg2.rotationPointX + (float)(xx);
        this.leftLeg2.rotationPointY = this.leftLeg2.rotationPointY - (float)(yy);
        this.leftLeg2.rotationPointZ = this.leftLeg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (14.25-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
            xx = 14.25 + (((tickAnim - 13) / 5) * (-26.69-(14.25)));
            yy = 0 + (((tickAnim - 13) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 5) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 21) {
            xx = -26.69 + (((tickAnim - 18) / 3) * (-11.5-(-26.69)));
            yy = 0 + (((tickAnim - 18) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 3) * (0-(0)));
        }
        else if (tickAnim >= 21 && tickAnim < 26) {
            xx = -11.5 + (((tickAnim - 21) / 5) * (15-(-11.5)));
            yy = 0 + (((tickAnim - 21) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 21) / 5) * (0-(0)));
        }
        else if (tickAnim >= 26 && tickAnim < 43) {
            xx = 15 + (((tickAnim - 26) / 17) * (0-(15)));
            yy = 0 + (((tickAnim - 26) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 26) / 17) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg3, leftLeg3.rotateAngleX + (float) Math.toRadians(xx), leftLeg3.rotateAngleY + (float) Math.toRadians(yy), leftLeg3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (21-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
            xx = 21 + (((tickAnim - 13) / 5) * (79.31-(21)));
            yy = 0 + (((tickAnim - 13) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 5) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 21) {
            xx = 79.31 + (((tickAnim - 18) / 3) * (62.75-(79.31)));
            yy = 0 + (((tickAnim - 18) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 3) * (0-(0)));
        }
        else if (tickAnim >= 21 && tickAnim < 26) {
            xx = 62.75 + (((tickAnim - 21) / 5) * (12.75-(62.75)));
            yy = 0 + (((tickAnim - 21) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 21) / 5) * (0-(0)));
        }
        else if (tickAnim >= 26 && tickAnim < 43) {
            xx = 12.75 + (((tickAnim - 26) / 17) * (0-(12.75)));
            yy = 0 + (((tickAnim - 26) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 26) / 17) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftFoot, leftFoot.rotateAngleX + (float) Math.toRadians(xx), leftFoot.rotateAngleY + (float) Math.toRadians(yy), leftFoot.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (1.025-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 13) / 5) * (0-(0)));
            yy = 1.025 + (((tickAnim - 13) / 5) * (0-(1.025)));
            zz = 0 + (((tickAnim - 13) / 5) * (-0.875-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 21) {
            xx = 0 + (((tickAnim - 18) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 18) / 3) * (0-(0)));
            zz = -0.875 + (((tickAnim - 18) / 3) * (-0.425-(-0.875)));
        }
        else if (tickAnim >= 21 && tickAnim < 26) {
            xx = 0 + (((tickAnim - 21) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 21) / 5) * (-0.4-(0)));
            zz = -0.425 + (((tickAnim - 21) / 5) * (0-(-0.425)));
        }
        else if (tickAnim >= 26 && tickAnim < 43) {
            xx = 0 + (((tickAnim - 26) / 17) * (0-(0)));
            yy = -0.4 + (((tickAnim - 26) / 17) * (0-(-0.4)));
            zz = 0 + (((tickAnim - 26) / 17) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftFoot.rotationPointX = this.leftFoot.rotationPointX + (float)(xx);
        this.leftFoot.rotationPointY = this.leftFoot.rotationPointY - (float)(yy);
        this.leftFoot.rotationPointZ = this.leftFoot.rotationPointZ + (float)(zz);



        this.setRotateAngle(tail1, tail1.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*169/0.5-60))*-0.5), tail1.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*169-50))*-2), tail1.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*169-20))*1));


        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*169/0.5-90))*1), tail2.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*169-100))*-3), tail2.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*169-20))*1));


        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*169/0.5-150))*1), tail3.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*169-150))*-5), tail3.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*169-20))*1));


        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*169/0.5-200))*1.5), tail4.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*169-200))*-9), tail4.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*169-20))*1));


        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*169/0.5-250))*1.5), body.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*169-50))*-3), body.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*169-80))*1.5));


        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*169/0.5-150))*-1), chest.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*169-150))*1), chest.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*169-70))*-1.5));



        if (tickAnim >= 0 && tickAnim < 25) {
            xx = -43.25 + (((tickAnim - 0) / 25) * (7.5-(-43.25)));
            yy = 0 + (((tickAnim - 0) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 25) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 33) {
            xx = 7.5 + (((tickAnim - 25) / 8) * (-22.85366-(7.5)));
            yy = 0 + (((tickAnim - 25) / 8) * (2.60239-(0)));
            zz = 0 + (((tickAnim - 25) / 8) * (-4.56118-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 41) {
            xx = -22.85366 + (((tickAnim - 33) / 8) * (-47-(-22.85366)));
            yy = 2.60239 + (((tickAnim - 33) / 8) * (0-(2.60239)));
            zz = -4.56118 + (((tickAnim - 33) / 8) * (0-(-4.56118)));
        }
        else if (tickAnim >= 41 && tickAnim < 43) {
            xx = -47 + (((tickAnim - 41) / 2) * (-43.25-(-47)));
            yy = 0 + (((tickAnim - 41) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 41) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm1, leftArm1.rotateAngleX + (float) Math.toRadians(xx), leftArm1.rotateAngleY + (float) Math.toRadians(yy), leftArm1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 25) {
            xx = 26.25 + (((tickAnim - 0) / 25) * (19-(26.25)));
            yy = 0 + (((tickAnim - 0) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 25) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 33) {
            xx = 19 + (((tickAnim - 25) / 8) * (-56.7256+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150+30))*-30-(19)));
            yy = 0 + (((tickAnim - 25) / 8) * (4.46114-(0)));
            zz = 0 + (((tickAnim - 25) / 8) * (0.90956-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 41) {
            xx = -56.7256+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150+30))*-30 + (((tickAnim - 33) / 8) * (28.5-(-56.7256+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150+30))*-30)));
            yy = 4.46114 + (((tickAnim - 33) / 8) * (0-(4.46114)));
            zz = 0.90956 + (((tickAnim - 33) / 8) * (0-(0.90956)));
        }
        else if (tickAnim >= 41 && tickAnim < 43) {
            xx = 28.5 + (((tickAnim - 41) / 2) * (26.25-(28.5)));
            yy = 0 + (((tickAnim - 41) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 41) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm2, leftArm2.rotateAngleX + (float) Math.toRadians(xx), leftArm2.rotateAngleY + (float) Math.toRadians(yy), leftArm2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 0) / 25) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 25) * (-0.575-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 25) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 25) / 8) * (0.4-(0)));
            zz = -0.575 + (((tickAnim - 25) / 8) * (0.075-(-0.575)));
        }
        else if (tickAnim >= 33 && tickAnim < 41) {
            xx = 0 + (((tickAnim - 33) / 8) * (0-(0)));
            yy = 0.4 + (((tickAnim - 33) / 8) * (0-(0.4)));
            zz = 0.075 + (((tickAnim - 33) / 8) * (0-(0.075)));
        }
        else if (tickAnim >= 41 && tickAnim < 43) {
            xx = 0 + (((tickAnim - 41) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 41) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 41) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftArm2.rotationPointX = this.leftArm2.rotationPointX + (float)(xx);
        this.leftArm2.rotationPointY = this.leftArm2.rotationPointY - (float)(yy);
        this.leftArm2.rotationPointZ = this.leftArm2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 9) {
            xx = 14.59119 + (((tickAnim - 0) / 9) * (0-(14.59119)));
            yy = 10.29704 + (((tickAnim - 0) / 9) * (0-(10.29704)));
            zz = -1.42656 + (((tickAnim - 0) / 9) * (0-(-1.42656)));
        }
        else if (tickAnim >= 9 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 9) / 16) * (-4.41281-(0)));
            yy = 0 + (((tickAnim - 9) / 16) * (9.25314-(0)));
            zz = 0 + (((tickAnim - 9) / 16) * (13.41788-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 29) {
            xx = -4.41281 + (((tickAnim - 25) / 4) * (84.12677-(-4.41281)));
            yy = 9.25314 + (((tickAnim - 25) / 4) * (21.6558-(9.25314)));
            zz = 13.41788 + (((tickAnim - 25) / 4) * (7.9654-(13.41788)));
        }
        else if (tickAnim >= 29 && tickAnim < 33) {
            xx = 84.12677 + (((tickAnim - 29) / 4) * (87.28-(84.12677)));
            yy = 21.6558 + (((tickAnim - 29) / 4) * (0-(21.6558)));
            zz = 7.9654 + (((tickAnim - 29) / 4) * (0-(7.9654)));
        }
        else if (tickAnim >= 33 && tickAnim < 41) {
            xx = 87.28 + (((tickAnim - 33) / 8) * (16.75257-(87.28)));
            yy = 0 + (((tickAnim - 33) / 8) * (5.90404-(0)));
            zz = 0 + (((tickAnim - 33) / 8) * (2.76612-(0)));
        }
        else if (tickAnim >= 41 && tickAnim < 43) {
            xx = 16.75257 + (((tickAnim - 41) / 2) * (14.59119-(16.75257)));
            yy = 5.90404 + (((tickAnim - 41) / 2) * (10.29704-(5.90404)));
            zz = 2.76612 + (((tickAnim - 41) / 2) * (-1.42656-(2.76612)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftHand, leftHand.rotateAngleX + (float) Math.toRadians(xx), leftHand.rotateAngleY + (float) Math.toRadians(yy), leftHand.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 0) / 9) * (0-(0)));
            yy = -0.25 + (((tickAnim - 0) / 9) * (1.175-(-0.25)));
            zz = -0.5 + (((tickAnim - 0) / 9) * (-0.8-(-0.5)));
        }
        else if (tickAnim >= 9 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 9) / 16) * (0-(0)));
            yy = 1.175 + (((tickAnim - 9) / 16) * (1.125-(1.175)));
            zz = -0.8 + (((tickAnim - 9) / 16) * (-0.375-(-0.8)));
        }
        else if (tickAnim >= 25 && tickAnim < 29) {
            xx = 0 + (((tickAnim - 25) / 4) * (0-(0)));
            yy = 1.125 + (((tickAnim - 25) / 4) * (1.03-(1.125)));
            zz = -0.375 + (((tickAnim - 25) / 4) * (-1.345-(-0.375)));
        }
        else if (tickAnim >= 29 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 29) / 4) * (0-(0)));
            yy = 1.03 + (((tickAnim - 29) / 4) * (-0.695-(1.03)));
            zz = -1.345 + (((tickAnim - 29) / 4) * (-0.995-(-1.345)));
        }
        else if (tickAnim >= 33 && tickAnim < 41) {
            xx = 0 + (((tickAnim - 33) / 8) * (0-(0)));
            yy = -0.695 + (((tickAnim - 33) / 8) * (0-(-0.695)));
            zz = -0.995 + (((tickAnim - 33) / 8) * (-0.175-(-0.995)));
        }
        else if (tickAnim >= 41 && tickAnim < 43) {
            xx = 0 + (((tickAnim - 41) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 41) / 2) * (-0.25-(0)));
            zz = -0.175 + (((tickAnim - 41) / 2) * (-0.5-(-0.175)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftHand.rotationPointX = this.leftHand.rotationPointX + (float)(xx);
        this.leftHand.rotationPointY = this.leftHand.rotationPointY - (float)(yy);
        this.leftHand.rotationPointZ = this.leftHand.rotationPointZ + (float)(zz);



        this.setRotateAngle(neck1, neck1.rotateAngleX + (float) Math.toRadians(-3+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*169/0.5-150))*0.5), neck1.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*169-150))*-1), neck1.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*169-100))*-1.5));


        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(-2+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*169/0.5-200))*0.5), neck2.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*169-120))*-1), neck2.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*169-150))*-1.5));


        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(-2+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*169/0.5-250))*0.5), head.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*169-220))*-1), head.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*169-200))*1.5));



        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 7.5 + (((tickAnim - 0) / 8) * (-22.85366-(7.5)));
            yy = 0 + (((tickAnim - 0) / 8) * (-2.60239-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (4.56118-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 16) {
            xx = -22.85366 + (((tickAnim - 8) / 8) * (-42.25-(-22.85366)));
            yy = -2.60239 + (((tickAnim - 8) / 8) * (0-(-2.60239)));
            zz = 4.56118 + (((tickAnim - 8) / 8) * (0-(4.56118)));
        }
        else if (tickAnim >= 16 && tickAnim < 43) {
            xx = -42.25 + (((tickAnim - 16) / 27) * (7.5-(-42.25)));
            yy = 0 + (((tickAnim - 16) / 27) * (0-(0)));
            zz = 0 + (((tickAnim - 16) / 27) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm1, rightArm1.rotateAngleX + (float) Math.toRadians(xx), rightArm1.rotateAngleY + (float) Math.toRadians(yy), rightArm1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 19 + (((tickAnim - 0) / 8) * (-55.9756+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150+30))*30-(19)));
            yy = 0 + (((tickAnim - 0) / 8) * (-4.46114-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (-0.90956-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 16) {
            xx = -55.9756+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150+30))*30 + (((tickAnim - 8) / 8) * (38-(-55.9756+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150+30))*30)));
            yy = -4.46114 + (((tickAnim - 8) / 8) * (0-(-4.46114)));
            zz = -0.90956 + (((tickAnim - 8) / 8) * (0-(-0.90956)));
        }
        else if (tickAnim >= 16 && tickAnim < 43) {
            xx = 38 + (((tickAnim - 16) / 27) * (19-(38)));
            yy = 0 + (((tickAnim - 16) / 27) * (0-(0)));
            zz = 0 + (((tickAnim - 16) / 27) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm2, rightArm2.rotateAngleX + (float) Math.toRadians(xx), rightArm2.rotateAngleY + (float) Math.toRadians(yy), rightArm2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0.875-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0.4-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 16) {
            xx = 0 + (((tickAnim - 8) / 8) * (0-(0)));
            yy = 0.875 + (((tickAnim - 8) / 8) * (0-(0.875)));
            zz = 0.4 + (((tickAnim - 8) / 8) * (0-(0.4)));
        }
        else if (tickAnim >= 16 && tickAnim < 43) {
            xx = 0 + (((tickAnim - 16) / 27) * (0-(0)));
            yy = 0 + (((tickAnim - 16) / 27) * (0-(0)));
            zz = 0 + (((tickAnim - 16) / 27) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightArm2.rotationPointX = this.rightArm2.rotationPointX + (float)(xx);
        this.rightArm2.rotationPointY = this.rightArm2.rotationPointY - (float)(yy);
        this.rightArm2.rotationPointZ = this.rightArm2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0.85147 + (((tickAnim - 0) / 4) * (84.20345-(0.85147)));
            yy = -11.61546 + (((tickAnim - 0) / 4) * (-17.40497-(-11.61546)));
            zz = -9.62377 + (((tickAnim - 0) / 4) * (-6.48644-(-9.62377)));
        }
        else if (tickAnim >= 4 && tickAnim < 8) {
            xx = 84.20345 + (((tickAnim - 4) / 4) * (72.18453-(84.20345)));
            yy = -17.40497 + (((tickAnim - 4) / 4) * (-22.56157-(-17.40497)));
            zz = -6.48644 + (((tickAnim - 4) / 4) * (-3.00075-(-6.48644)));
        }
        else if (tickAnim >= 8 && tickAnim < 14) {
            xx = 72.18453 + (((tickAnim - 8) / 6) * (13.0911-(72.18453)));
            yy = -22.56157 + (((tickAnim - 8) / 6) * (-9.42692-(-22.56157)));
            zz = -3.00075 + (((tickAnim - 8) / 6) * (-5.87689-(-3.00075)));
        }
        else if (tickAnim >= 14 && tickAnim < 16) {
            xx = 13.0911 + (((tickAnim - 14) / 2) * (4.0462-(13.0911)));
            yy = -9.42692 + (((tickAnim - 14) / 2) * (-7.59563-(-9.42692)));
            zz = -5.87689 + (((tickAnim - 14) / 2) * (-4.04896-(-5.87689)));
        }
        else if (tickAnim >= 16 && tickAnim < 33) {
            xx = 4.0462 + (((tickAnim - 16) / 17) * (-11.97107-(4.0462)));
            yy = -7.59563 + (((tickAnim - 16) / 17) * (4.17572-(-7.59563)));
            zz = -4.04896 + (((tickAnim - 16) / 17) * (-6.03834-(-4.04896)));
        }
        else if (tickAnim >= 33 && tickAnim < 43) {
            xx = -11.97107 + (((tickAnim - 33) / 10) * (0.85147-(-11.97107)));
            yy = 4.17572 + (((tickAnim - 33) / 10) * (-11.61546-(4.17572)));
            zz = -6.03834 + (((tickAnim - 33) / 10) * (-9.62377-(-6.03834)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightHand, rightHand.rotateAngleX + (float) Math.toRadians(xx), rightHand.rotateAngleY + (float) Math.toRadians(yy), rightHand.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            yy = 1.3 + (((tickAnim - 0) / 4) * (0.88-(1.3)));
            zz = -0.45 + (((tickAnim - 0) / 4) * (-1.47-(-0.45)));
        }
        else if (tickAnim >= 4 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 4) / 4) * (0-(0)));
            yy = 0.88 + (((tickAnim - 4) / 4) * (0.095-(0.88)));
            zz = -1.47 + (((tickAnim - 4) / 4) * (-1.02-(-1.47)));
        }
        else if (tickAnim >= 8 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 8) / 6) * (0.375-(0)));
            yy = 0.095 + (((tickAnim - 8) / 6) * (0.3-(0.095)));
            zz = -1.02 + (((tickAnim - 8) / 6) * (0.075-(-1.02)));
        }
        else if (tickAnim >= 14 && tickAnim < 16) {
            xx = 0.375 + (((tickAnim - 14) / 2) * (0.375-(0.375)));
            yy = 0.3 + (((tickAnim - 14) / 2) * (0.875-(0.3)));
            zz = 0.075 + (((tickAnim - 14) / 2) * (0.075-(0.075)));
        }
        else if (tickAnim >= 16 && tickAnim < 28) {
            xx = 0.375 + (((tickAnim - 16) / 12) * (0.325-(0.375)));
            yy = 0.875 + (((tickAnim - 16) / 12) * (1.45-(0.875)));
            zz = 0.075 + (((tickAnim - 16) / 12) * (0-(0.075)));
        }
        else if (tickAnim >= 28 && tickAnim < 33) {
            xx = 0.325 + (((tickAnim - 28) / 5) * (0-(0.325)));
            yy = 1.45 + (((tickAnim - 28) / 5) * (1.1-(1.45)));
            zz = 0 + (((tickAnim - 28) / 5) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 43) {
            xx = 0 + (((tickAnim - 33) / 10) * (0-(0)));
            yy = 1.1 + (((tickAnim - 33) / 10) * (1.3-(1.1)));
            zz = 0 + (((tickAnim - 33) / 10) * (-0.45-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightHand.rotationPointX = this.rightHand.rotationPointX + (float)(xx);
        this.rightHand.rotationPointY = this.rightHand.rotationPointY - (float)(yy);
        this.rightHand.rotationPointZ = this.rightHand.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = -6.81831 + (((tickAnim - 0) / 4) * (-15.25-(-6.81831)));
            yy = 0.34182 + (((tickAnim - 0) / 4) * (0-(0.34182)));
            zz = 0.69186 + (((tickAnim - 0) / 4) * (0-(0.69186)));
        }
        else if (tickAnim >= 4 && tickAnim < 32) {
            xx = -15.25 + (((tickAnim - 4) / 28) * (16.75-(-15.25)));
            yy = 0 + (((tickAnim - 4) / 28) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 28) * (0-(0)));
        }
        else if (tickAnim >= 32 && tickAnim < 43) {
            xx = 16.75 + (((tickAnim - 32) / 11) * (-6.81831-(16.75)));
            yy = 0 + (((tickAnim - 32) / 11) * (0.34182-(0)));
            zz = 0 + (((tickAnim - 32) / 11) * (0.69186-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg1, rightLeg1.rotateAngleX + (float) Math.toRadians(xx), rightLeg1.rotateAngleY + (float) Math.toRadians(yy), rightLeg1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = -12.25 + (((tickAnim - 0) / 4) * (-13-(-12.25)));
            yy = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 32) {
            xx = -13 + (((tickAnim - 4) / 28) * (7.75-(-13)));
            yy = 0 + (((tickAnim - 4) / 28) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 28) * (0-(0)));
        }
        else if (tickAnim >= 32 && tickAnim < 33) {
            xx = 7.75 + (((tickAnim - 32) / 1) * (8.08+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*10-(7.75)));
            yy = 0 + (((tickAnim - 32) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 32) / 1) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 43) {
            xx = 8.08+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*10 + (((tickAnim - 33) / 10) * (-12.25-(8.08+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*10)));
            yy = 0 + (((tickAnim - 33) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg2, rightLeg2.rotateAngleX + (float) Math.toRadians(xx), rightLeg2.rotateAngleY + (float) Math.toRadians(yy), rightLeg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            yy = 1.1 + (((tickAnim - 0) / 4) * (0-(1.1)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 32) {
            xx = 0 + (((tickAnim - 4) / 28) * (0-(0)));
            yy = 0 + (((tickAnim - 4) / 28) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 28) * (0-(0)));
        }
        else if (tickAnim >= 32 && tickAnim < 43) {
            xx = 0 + (((tickAnim - 32) / 11) * (0-(0)));
            yy = 0 + (((tickAnim - 32) / 11) * (1.1-(0)));
            zz = 0 + (((tickAnim - 32) / 11) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightLeg2.rotationPointX = this.rightLeg2.rotationPointX + (float)(xx);
        this.rightLeg2.rotationPointY = this.rightLeg2.rotationPointY - (float)(yy);
        this.rightLeg2.rotationPointZ = this.rightLeg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = -11.5 + (((tickAnim - 0) / 4) * (13.5-(-11.5)));
            yy = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 32) {
            xx = 13.5 + (((tickAnim - 4) / 28) * (14.25-(13.5)));
            yy = 0 + (((tickAnim - 4) / 28) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 28) * (0-(0)));
        }
        else if (tickAnim >= 32 && tickAnim < 38) {
            xx = 14.25 + (((tickAnim - 32) / 6) * (-27.64-(14.25)));
            yy = 0 + (((tickAnim - 32) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 32) / 6) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 43) {
            xx = -27.64 + (((tickAnim - 38) / 5) * (-11.5-(-27.64)));
            yy = 0 + (((tickAnim - 38) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 38) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg3, rightLeg3.rotateAngleX + (float) Math.toRadians(xx), rightLeg3.rotateAngleY + (float) Math.toRadians(yy), rightLeg3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 62.75 + (((tickAnim - 0) / 4) * (14-(62.75)));
            yy = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 13) {
            xx = 14 + (((tickAnim - 4) / 9) * (-3.75-(14)));
            yy = 0 + (((tickAnim - 4) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 9) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 23) {
            xx = -3.75 + (((tickAnim - 13) / 10) * (-19.5-(-3.75)));
            yy = 0 + (((tickAnim - 13) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 10) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 32) {
            xx = -19.5 + (((tickAnim - 23) / 9) * (21-(-19.5)));
            yy = 0 + (((tickAnim - 23) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 9) * (0-(0)));
        }
        else if (tickAnim >= 32 && tickAnim < 38) {
            xx = 21 + (((tickAnim - 32) / 6) * (76.45-(21)));
            yy = 0 + (((tickAnim - 32) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 32) / 6) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 40) {
            xx = 76.45 + (((tickAnim - 38) / 2) * (76.45-(76.45)));
            yy = 0 + (((tickAnim - 38) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 38) / 2) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 43) {
            xx = 76.45 + (((tickAnim - 40) / 3) * (62.75-(76.45)));
            yy = 0 + (((tickAnim - 40) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightFoot, rightFoot.rotateAngleX + (float) Math.toRadians(xx), rightFoot.rotateAngleY + (float) Math.toRadians(yy), rightFoot.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 4) * (-0.4-(0)));
            zz = -0.425 + (((tickAnim - 0) / 4) * (0-(-0.425)));
        }
        else if (tickAnim >= 4 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 4) / 5) * (0-(0)));
            yy = -0.4 + (((tickAnim - 4) / 5) * (0.145-(-0.4)));
            zz = 0 + (((tickAnim - 4) / 5) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 9) / 4) * (0-(0)));
            yy = 0.145 + (((tickAnim - 9) / 4) * (0.375-(0.145)));
            zz = 0 + (((tickAnim - 9) / 4) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 13) / 10) * (0-(0)));
            yy = 0.375 + (((tickAnim - 13) / 10) * (0.275-(0.375)));
            zz = 0 + (((tickAnim - 13) / 10) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 32) {
            xx = 0 + (((tickAnim - 23) / 9) * (0-(0)));
            yy = 0.275 + (((tickAnim - 23) / 9) * (0.525-(0.275)));
            zz = 0 + (((tickAnim - 23) / 9) * (0.575-(0)));
        }
        else if (tickAnim >= 32 && tickAnim < 38) {
            xx = 0 + (((tickAnim - 32) / 6) * (0-(0)));
            yy = 0.525 + (((tickAnim - 32) / 6) * (0.24-(0.525)));
            zz = 0.575 + (((tickAnim - 32) / 6) * (-0.685-(0.575)));
        }
        else if (tickAnim >= 38 && tickAnim < 43) {
            xx = 0 + (((tickAnim - 38) / 5) * (0-(0)));
            yy = 0.24 + (((tickAnim - 38) / 5) * (0-(0.24)));
            zz = -0.685 + (((tickAnim - 38) / 5) * (-0.425-(-0.685)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightFoot.rotationPointX = this.rightFoot.rotationPointX + (float)(xx);
        this.rightFoot.rotationPointY = this.rightFoot.rotationPointY - (float)(yy);
        this.rightFoot.rotationPointZ = this.rightFoot.rotationPointZ + (float)(zz);
        
    }
    public void animRunning(EntityLivingBase entitylivinghipsIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraSauropelta entity = (EntityPrehistoricFloraSauropelta) entitylivinghipsIn;
        int animCycle = 28;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        this.setRotateAngle(hips, hips.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*254/0.5-70))*2.5), hips.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*254-50))*2), hips.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*254-20))*2));
        this.hips.rotationPointX = this.hips.rotationPointX + (float)(0);
        this.hips.rotationPointY = this.hips.rotationPointY - (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*254/0.5-80))*-0.3);
        this.hips.rotationPointZ = this.hips.rotationPointZ + (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*254/0.5))*0.5);



        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 1.5 + (((tickAnim - 0) / 8) * (16.75-(1.5)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 14) {
            xx = 16.75 + (((tickAnim - 8) / 6) * (-4.56831-(16.75)));
            yy = 0 + (((tickAnim - 8) / 6) * (0.34182-(0)));
            zz = 0 + (((tickAnim - 8) / 6) * (0.69186-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 17) {
            xx = -4.56831 + (((tickAnim - 14) / 3) * (-15.25-(-4.56831)));
            yy = 0.34182 + (((tickAnim - 14) / 3) * (0-(0.34182)));
            zz = 0.69186 + (((tickAnim - 14) / 3) * (0-(0.69186)));
        }
        else if (tickAnim >= 17 && tickAnim < 28) {
            xx = -15.25 + (((tickAnim - 17) / 11) * (1.5-(-15.25)));
            yy = 0 + (((tickAnim - 17) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 17) / 11) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg1, leftLeg1.rotateAngleX + (float) Math.toRadians(xx), leftLeg1.rotateAngleY + (float) Math.toRadians(yy), leftLeg1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (7.75-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 14) {
            xx = 7.75 + (((tickAnim - 8) / 6) * (-17.25-(7.75)));
            yy = 0 + (((tickAnim - 8) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 6) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 17) {
            xx = -17.25 + (((tickAnim - 14) / 3) * (-13-(-17.25)));
            yy = 0 + (((tickAnim - 14) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 3) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 28) {
            xx = -13 + (((tickAnim - 17) / 11) * (0-(-13)));
            yy = 0 + (((tickAnim - 17) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 17) / 11) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg2, leftLeg2.rotateAngleX + (float) Math.toRadians(xx), leftLeg2.rotateAngleY + (float) Math.toRadians(yy), leftLeg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 8) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 8) / 6) * (1.1-(0)));
            zz = 0 + (((tickAnim - 8) / 6) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 17) {
            xx = 0 + (((tickAnim - 14) / 3) * (0-(0)));
            yy = 1.1 + (((tickAnim - 14) / 3) * (0-(1.1)));
            zz = 0 + (((tickAnim - 14) / 3) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 17) / 11) * (0-(0)));
            yy = 0 + (((tickAnim - 17) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 17) / 11) * (0-(0)));
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
            xx = 0 + (((tickAnim - 0) / 8) * (14.25-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 12) {
            xx = 14.25 + (((tickAnim - 8) / 4) * (-26.69-(14.25)));
            yy = 0 + (((tickAnim - 8) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 4) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 14) {
            xx = -26.69 + (((tickAnim - 12) / 2) * (-11.5-(-26.69)));
            yy = 0 + (((tickAnim - 12) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 2) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 17) {
            xx = -11.5 + (((tickAnim - 14) / 3) * (15-(-11.5)));
            yy = 0 + (((tickAnim - 14) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 3) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 28) {
            xx = 15 + (((tickAnim - 17) / 11) * (0-(15)));
            yy = 0 + (((tickAnim - 17) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 17) / 11) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg3, leftLeg3.rotateAngleX + (float) Math.toRadians(xx), leftLeg3.rotateAngleY + (float) Math.toRadians(yy), leftLeg3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (21-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 12) {
            xx = 21 + (((tickAnim - 8) / 4) * (79.31-(21)));
            yy = 0 + (((tickAnim - 8) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 4) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 14) {
            xx = 79.31 + (((tickAnim - 12) / 2) * (62.75-(79.31)));
            yy = 0 + (((tickAnim - 12) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 2) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 17) {
            xx = 62.75 + (((tickAnim - 14) / 3) * (12.75-(62.75)));
            yy = 0 + (((tickAnim - 14) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 3) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 28) {
            xx = 12.75 + (((tickAnim - 17) / 11) * (0-(12.75)));
            yy = 0 + (((tickAnim - 17) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 17) / 11) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftFoot, leftFoot.rotateAngleX + (float) Math.toRadians(xx), leftFoot.rotateAngleY + (float) Math.toRadians(yy), leftFoot.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (1.025-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 8) / 4) * (0-(0)));
            yy = 1.025 + (((tickAnim - 8) / 4) * (0-(1.025)));
            zz = 0 + (((tickAnim - 8) / 4) * (-0.875-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 12) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 12) / 2) * (0-(0)));
            zz = -0.875 + (((tickAnim - 12) / 2) * (-0.425-(-0.875)));
        }
        else if (tickAnim >= 14 && tickAnim < 17) {
            xx = 0 + (((tickAnim - 14) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 14) / 3) * (-0.4-(0)));
            zz = -0.425 + (((tickAnim - 14) / 3) * (0-(-0.425)));
        }
        else if (tickAnim >= 17 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 17) / 11) * (0-(0)));
            yy = -0.4 + (((tickAnim - 17) / 11) * (0-(-0.4)));
            zz = 0 + (((tickAnim - 17) / 11) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftFoot.rotationPointX = this.leftFoot.rotationPointX + (float)(xx);
        this.leftFoot.rotationPointY = this.leftFoot.rotationPointY - (float)(yy);
        this.leftFoot.rotationPointZ = this.leftFoot.rotationPointZ + (float)(zz);



        this.setRotateAngle(tail1, tail1.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*254/0.5-60))*-0.5), tail1.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*254-50))*-2), tail1.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*254-20))*1));


        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*254/0.5-90))*1), tail2.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*254-100))*-3), tail2.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*254-20))*1));


        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*254/0.5-150))*1), tail3.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*254-150))*-5), tail3.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*254-20))*1));


        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*254/0.5-200))*1.5), tail4.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*254-200))*-9), tail4.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*254-20))*1));


        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*254/0.5-250))*2.5), body.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*254-50))*-3), body.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*254-80))*2));


        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*254/0.5-150))*-2), chest.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*254-150))*2), chest.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*254-70))*-2.5));



        if (tickAnim >= 0 && tickAnim < 17) {
            xx = -43.25 + (((tickAnim - 0) / 17) * (7.5-(-43.25)));
            yy = 0 + (((tickAnim - 0) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 17) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 22) {
            xx = 7.5 + (((tickAnim - 17) / 5) * (-22.85366-(7.5)));
            yy = 0 + (((tickAnim - 17) / 5) * (2.60239-(0)));
            zz = 0 + (((tickAnim - 17) / 5) * (-4.56118-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 27) {
            xx = -22.85366 + (((tickAnim - 22) / 5) * (-47-(-22.85366)));
            yy = 2.60239 + (((tickAnim - 22) / 5) * (0-(2.60239)));
            zz = -4.56118 + (((tickAnim - 22) / 5) * (0-(-4.56118)));
        }
        else if (tickAnim >= 27 && tickAnim < 28) {
            xx = -47 + (((tickAnim - 27) / 1) * (-43.25-(-47)));
            yy = 0 + (((tickAnim - 27) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 27) / 1) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm1, leftArm1.rotateAngleX + (float) Math.toRadians(xx), leftArm1.rotateAngleY + (float) Math.toRadians(yy), leftArm1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 17) {
            xx = 26.25 + (((tickAnim - 0) / 17) * (19-(26.25)));
            yy = 0 + (((tickAnim - 0) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 17) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 22) {
            xx = 19 + (((tickAnim - 17) / 5) * (-33.6506+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150+30))*-30-(19)));
            yy = 0 + (((tickAnim - 17) / 5) * (4.46114-(0)));
            zz = 0 + (((tickAnim - 17) / 5) * (0.90956-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 27) {
            xx = -33.6506+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150+30))*-30 + (((tickAnim - 22) / 5) * (28.5-(-33.6506+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150+30))*-30)));
            yy = 4.46114 + (((tickAnim - 22) / 5) * (0-(4.46114)));
            zz = 0.90956 + (((tickAnim - 22) / 5) * (0-(0.90956)));
        }
        else if (tickAnim >= 27 && tickAnim < 28) {
            xx = 28.5 + (((tickAnim - 27) / 1) * (26.25-(28.5)));
            yy = 0 + (((tickAnim - 27) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 27) / 1) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm2, leftArm2.rotateAngleX + (float) Math.toRadians(xx), leftArm2.rotateAngleY + (float) Math.toRadians(yy), leftArm2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 17) {
            xx = 0 + (((tickAnim - 0) / 17) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 17) * (-0.575-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 22) {
            xx = 0 + (((tickAnim - 17) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 17) / 5) * (0.4-(0)));
            zz = -0.575 + (((tickAnim - 17) / 5) * (0.075-(-0.575)));
        }
        else if (tickAnim >= 22 && tickAnim < 27) {
            xx = 0 + (((tickAnim - 22) / 5) * (0-(0)));
            yy = 0.4 + (((tickAnim - 22) / 5) * (0-(0.4)));
            zz = 0.075 + (((tickAnim - 22) / 5) * (0-(0.075)));
        }
        else if (tickAnim >= 27 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 27) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 27) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 27) / 1) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftArm2.rotationPointX = this.leftArm2.rotationPointX + (float)(xx);
        this.leftArm2.rotationPointY = this.leftArm2.rotationPointY - (float)(yy);
        this.leftArm2.rotationPointZ = this.leftArm2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 14.59119 + (((tickAnim - 0) / 6) * (0-(14.59119)));
            yy = 10.29704 + (((tickAnim - 0) / 6) * (0-(10.29704)));
            zz = -1.42656 + (((tickAnim - 0) / 6) * (0-(-1.42656)));
        }
        else if (tickAnim >= 6 && tickAnim < 17) {
            xx = 0 + (((tickAnim - 6) / 11) * (-4.41281-(0)));
            yy = 0 + (((tickAnim - 6) / 11) * (9.25314-(0)));
            zz = 0 + (((tickAnim - 6) / 11) * (13.41788-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 19) {
            xx = -4.41281 + (((tickAnim - 17) / 2) * (84.12677-(-4.41281)));
            yy = 9.25314 + (((tickAnim - 17) / 2) * (21.6558-(9.25314)));
            zz = 13.41788 + (((tickAnim - 17) / 2) * (7.9654-(13.41788)));
        }
        else if (tickAnim >= 19 && tickAnim < 22) {
            xx = 84.12677 + (((tickAnim - 19) / 3) * (87.28-(84.12677)));
            yy = 21.6558 + (((tickAnim - 19) / 3) * (0-(21.6558)));
            zz = 7.9654 + (((tickAnim - 19) / 3) * (0-(7.9654)));
        }
        else if (tickAnim >= 22 && tickAnim < 27) {
            xx = 87.28 + (((tickAnim - 22) / 5) * (16.75257-(87.28)));
            yy = 0 + (((tickAnim - 22) / 5) * (5.90404-(0)));
            zz = 0 + (((tickAnim - 22) / 5) * (2.76612-(0)));
        }
        else if (tickAnim >= 27 && tickAnim < 28) {
            xx = 16.75257 + (((tickAnim - 27) / 1) * (14.59119-(16.75257)));
            yy = 5.90404 + (((tickAnim - 27) / 1) * (10.29704-(5.90404)));
            zz = 2.76612 + (((tickAnim - 27) / 1) * (-1.42656-(2.76612)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftHand, leftHand.rotateAngleX + (float) Math.toRadians(xx), leftHand.rotateAngleY + (float) Math.toRadians(yy), leftHand.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            yy = -0.25 + (((tickAnim - 0) / 6) * (1.175-(-0.25)));
            zz = -0.5 + (((tickAnim - 0) / 6) * (-0.8-(-0.5)));
        }
        else if (tickAnim >= 6 && tickAnim < 17) {
            xx = 0 + (((tickAnim - 6) / 11) * (0-(0)));
            yy = 1.175 + (((tickAnim - 6) / 11) * (1.125-(1.175)));
            zz = -0.8 + (((tickAnim - 6) / 11) * (-0.375-(-0.8)));
        }
        else if (tickAnim >= 17 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 17) / 2) * (0-(0)));
            yy = 1.125 + (((tickAnim - 17) / 2) * (1.03-(1.125)));
            zz = -0.375 + (((tickAnim - 17) / 2) * (-1.345-(-0.375)));
        }
        else if (tickAnim >= 19 && tickAnim < 22) {
            xx = 0 + (((tickAnim - 19) / 3) * (0-(0)));
            yy = 1.03 + (((tickAnim - 19) / 3) * (-0.695-(1.03)));
            zz = -1.345 + (((tickAnim - 19) / 3) * (-0.995-(-1.345)));
        }
        else if (tickAnim >= 22 && tickAnim < 27) {
            xx = 0 + (((tickAnim - 22) / 5) * (0-(0)));
            yy = -0.695 + (((tickAnim - 22) / 5) * (0-(-0.695)));
            zz = -0.995 + (((tickAnim - 22) / 5) * (-0.175-(-0.995)));
        }
        else if (tickAnim >= 27 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 27) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 27) / 1) * (-0.25-(0)));
            zz = -0.175 + (((tickAnim - 27) / 1) * (-0.5-(-0.175)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftHand.rotationPointX = this.leftHand.rotationPointX + (float)(xx);
        this.leftHand.rotationPointY = this.leftHand.rotationPointY - (float)(yy);
        this.leftHand.rotationPointZ = this.leftHand.rotationPointZ + (float)(zz);



        this.setRotateAngle(neck1, neck1.rotateAngleX + (float) Math.toRadians(-3+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*254/0.5-150))*1.5), neck1.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*254-150))*-2), neck1.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*254-100))*-2.5));


        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(-2+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*254/0.5-200))*1.5), neck2.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*254-120))*-2), neck2.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*254-150))*-2.5));


        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(-2+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*169/0.5-250))*0.5), head.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*169-220))*-1), head.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*169-200))*1.5));



        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 7.5 + (((tickAnim - 0) / 6) * (-22.85366-(7.5)));
            yy = 0 + (((tickAnim - 0) / 6) * (-2.60239-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (4.56118-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 11) {
            xx = -22.85366 + (((tickAnim - 6) / 5) * (-42.25-(-22.85366)));
            yy = -2.60239 + (((tickAnim - 6) / 5) * (0-(-2.60239)));
            zz = 4.56118 + (((tickAnim - 6) / 5) * (0-(4.56118)));
        }
        else if (tickAnim >= 11 && tickAnim < 28) {
            xx = -42.25 + (((tickAnim - 11) / 17) * (7.5-(-42.25)));
            yy = 0 + (((tickAnim - 11) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 17) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm1, rightArm1.rotateAngleX + (float) Math.toRadians(xx), rightArm1.rotateAngleY + (float) Math.toRadians(yy), rightArm1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 19 + (((tickAnim - 0) / 6) * (-55.9756+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150+30))*30-(19)));
            yy = 0 + (((tickAnim - 0) / 6) * (-4.46114-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (-0.90956-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 11) {
            xx = -55.9756+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150+30))*30 + (((tickAnim - 6) / 5) * (38-(-55.9756+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150+30))*30)));
            yy = -4.46114 + (((tickAnim - 6) / 5) * (0-(-4.46114)));
            zz = -0.90956 + (((tickAnim - 6) / 5) * (0-(-0.90956)));
        }
        else if (tickAnim >= 11 && tickAnim < 28) {
            xx = 38 + (((tickAnim - 11) / 17) * (19-(38)));
            yy = 0 + (((tickAnim - 11) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 17) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm2, rightArm2.rotateAngleX + (float) Math.toRadians(xx), rightArm2.rotateAngleY + (float) Math.toRadians(yy), rightArm2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 6) * (0.875-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (0.4-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 6) / 5) * (0-(0)));
            yy = 0.875 + (((tickAnim - 6) / 5) * (0-(0.875)));
            zz = 0.4 + (((tickAnim - 6) / 5) * (0-(0.4)));
        }
        else if (tickAnim >= 11 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 11) / 17) * (0-(0)));
            yy = 0 + (((tickAnim - 11) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 17) * (0-(0)));
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
            xx = 0.85147 + (((tickAnim - 0) / 3) * (84.20345-(0.85147)));
            yy = -11.61546 + (((tickAnim - 0) / 3) * (-17.40497-(-11.61546)));
            zz = -9.62377 + (((tickAnim - 0) / 3) * (-6.48644-(-9.62377)));
        }
        else if (tickAnim >= 3 && tickAnim < 6) {
            xx = 84.20345 + (((tickAnim - 3) / 3) * (72.18453-(84.20345)));
            yy = -17.40497 + (((tickAnim - 3) / 3) * (-22.56157-(-17.40497)));
            zz = -6.48644 + (((tickAnim - 3) / 3) * (-3.00075-(-6.48644)));
        }
        else if (tickAnim >= 6 && tickAnim < 9) {
            xx = 72.18453 + (((tickAnim - 6) / 3) * (13.0911-(72.18453)));
            yy = -22.56157 + (((tickAnim - 6) / 3) * (-9.42692-(-22.56157)));
            zz = -3.00075 + (((tickAnim - 6) / 3) * (-5.87689-(-3.00075)));
        }
        else if (tickAnim >= 9 && tickAnim < 11) {
            xx = 13.0911 + (((tickAnim - 9) / 2) * (4.0462-(13.0911)));
            yy = -9.42692 + (((tickAnim - 9) / 2) * (-7.59563-(-9.42692)));
            zz = -5.87689 + (((tickAnim - 9) / 2) * (-4.04896-(-5.87689)));
        }
        else if (tickAnim >= 11 && tickAnim < 22) {
            xx = 4.0462 + (((tickAnim - 11) / 11) * (-11.97107-(4.0462)));
            yy = -7.59563 + (((tickAnim - 11) / 11) * (4.17572-(-7.59563)));
            zz = -4.04896 + (((tickAnim - 11) / 11) * (-6.03834-(-4.04896)));
        }
        else if (tickAnim >= 22 && tickAnim < 28) {
            xx = -11.97107 + (((tickAnim - 22) / 6) * (0.85147-(-11.97107)));
            yy = 4.17572 + (((tickAnim - 22) / 6) * (-11.61546-(4.17572)));
            zz = -6.03834 + (((tickAnim - 22) / 6) * (-9.62377-(-6.03834)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightHand, rightHand.rotateAngleX + (float) Math.toRadians(xx), rightHand.rotateAngleY + (float) Math.toRadians(yy), rightHand.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 1.3 + (((tickAnim - 0) / 3) * (0.88-(1.3)));
            zz = -0.45 + (((tickAnim - 0) / 3) * (-1.47-(-0.45)));
        }
        else if (tickAnim >= 3 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 3) / 3) * (0-(0)));
            yy = 0.88 + (((tickAnim - 3) / 3) * (0.095-(0.88)));
            zz = -1.47 + (((tickAnim - 3) / 3) * (-1.02-(-1.47)));
        }
        else if (tickAnim >= 6 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 6) / 3) * (0.375-(0)));
            yy = 0.095 + (((tickAnim - 6) / 3) * (0.3-(0.095)));
            zz = -1.02 + (((tickAnim - 6) / 3) * (0.075-(-1.02)));
        }
        else if (tickAnim >= 9 && tickAnim < 11) {
            xx = 0.375 + (((tickAnim - 9) / 2) * (0.375-(0.375)));
            yy = 0.3 + (((tickAnim - 9) / 2) * (0.875-(0.3)));
            zz = 0.075 + (((tickAnim - 9) / 2) * (0.075-(0.075)));
        }
        else if (tickAnim >= 11 && tickAnim < 18) {
            xx = 0.375 + (((tickAnim - 11) / 7) * (0.325-(0.375)));
            yy = 0.875 + (((tickAnim - 11) / 7) * (1.45-(0.875)));
            zz = 0.075 + (((tickAnim - 11) / 7) * (0-(0.075)));
        }
        else if (tickAnim >= 18 && tickAnim < 22) {
            xx = 0.325 + (((tickAnim - 18) / 4) * (0-(0.325)));
            yy = 1.45 + (((tickAnim - 18) / 4) * (1.1-(1.45)));
            zz = 0 + (((tickAnim - 18) / 4) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 22) / 6) * (0-(0)));
            yy = 1.1 + (((tickAnim - 22) / 6) * (1.3-(1.1)));
            zz = 0 + (((tickAnim - 22) / 6) * (-0.45-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightHand.rotationPointX = this.rightHand.rotationPointX + (float)(xx);
        this.rightHand.rotationPointY = this.rightHand.rotationPointY - (float)(yy);
        this.rightHand.rotationPointZ = this.rightHand.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = -6.81831 + (((tickAnim - 0) / 3) * (-15.25-(-6.81831)));
            yy = 0.34182 + (((tickAnim - 0) / 3) * (0-(0.34182)));
            zz = 0.69186 + (((tickAnim - 0) / 3) * (0-(0.69186)));
        }
        else if (tickAnim >= 3 && tickAnim < 21) {
            xx = -15.25 + (((tickAnim - 3) / 18) * (16.75-(-15.25)));
            yy = 0 + (((tickAnim - 3) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 18) * (0-(0)));
        }
        else if (tickAnim >= 21 && tickAnim < 28) {
            xx = 16.75 + (((tickAnim - 21) / 7) * (-6.81831-(16.75)));
            yy = 0 + (((tickAnim - 21) / 7) * (0.34182-(0)));
            zz = 0 + (((tickAnim - 21) / 7) * (0.69186-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg1, rightLeg1.rotateAngleX + (float) Math.toRadians(xx), rightLeg1.rotateAngleY + (float) Math.toRadians(yy), rightLeg1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = -12.25 + (((tickAnim - 0) / 3) * (-13-(-12.25)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 21) {
            xx = -13 + (((tickAnim - 3) / 18) * (7.75-(-13)));
            yy = 0 + (((tickAnim - 3) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 18) * (0-(0)));
        }
        else if (tickAnim >= 21 && tickAnim < 22) {
            xx = 7.75 + (((tickAnim - 21) / 1) * (8.08+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*10-(7.75)));
            yy = 0 + (((tickAnim - 21) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 21) / 1) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 28) {
            xx = 8.08+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*10 + (((tickAnim - 22) / 6) * (-12.25-(8.08+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*10)));
            yy = 0 + (((tickAnim - 22) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 22) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg2, rightLeg2.rotateAngleX + (float) Math.toRadians(xx), rightLeg2.rotateAngleY + (float) Math.toRadians(yy), rightLeg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 1.1 + (((tickAnim - 0) / 3) * (0-(1.1)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 21) {
            xx = 0 + (((tickAnim - 3) / 18) * (0-(0)));
            yy = 0 + (((tickAnim - 3) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 18) * (0-(0)));
        }
        else if (tickAnim >= 21 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 21) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 21) / 7) * (1.1-(0)));
            zz = 0 + (((tickAnim - 21) / 7) * (0-(0)));
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
            xx = -11.5 + (((tickAnim - 0) / 3) * (13.5-(-11.5)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 21) {
            xx = 13.5 + (((tickAnim - 3) / 18) * (14.25-(13.5)));
            yy = 0 + (((tickAnim - 3) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 18) * (0-(0)));
        }
        else if (tickAnim >= 21 && tickAnim < 25) {
            xx = 14.25 + (((tickAnim - 21) / 4) * (-27.64-(14.25)));
            yy = 0 + (((tickAnim - 21) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 21) / 4) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 28) {
            xx = -27.64 + (((tickAnim - 25) / 3) * (-11.5-(-27.64)));
            yy = 0 + (((tickAnim - 25) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg3, rightLeg3.rotateAngleX + (float) Math.toRadians(xx), rightLeg3.rotateAngleY + (float) Math.toRadians(yy), rightLeg3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 62.75 + (((tickAnim - 0) / 3) * (14-(62.75)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 9) {
            xx = 14 + (((tickAnim - 3) / 6) * (-3.75-(14)));
            yy = 0 + (((tickAnim - 3) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 6) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 15) {
            xx = -3.75 + (((tickAnim - 9) / 6) * (-19.5-(-3.75)));
            yy = 0 + (((tickAnim - 9) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 6) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 21) {
            xx = -19.5 + (((tickAnim - 15) / 6) * (21-(-19.5)));
            yy = 0 + (((tickAnim - 15) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 6) * (0-(0)));
        }
        else if (tickAnim >= 21 && tickAnim < 25) {
            xx = 21 + (((tickAnim - 21) / 4) * (76.45-(21)));
            yy = 0 + (((tickAnim - 21) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 21) / 4) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 27) {
            xx = 76.45 + (((tickAnim - 25) / 2) * (76.45-(76.45)));
            yy = 0 + (((tickAnim - 25) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 2) * (0-(0)));
        }
        else if (tickAnim >= 27 && tickAnim < 28) {
            xx = 76.45 + (((tickAnim - 27) / 1) * (62.75-(76.45)));
            yy = 0 + (((tickAnim - 27) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 27) / 1) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightFoot, rightFoot.rotateAngleX + (float) Math.toRadians(xx), rightFoot.rotateAngleY + (float) Math.toRadians(yy), rightFoot.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (-0.4-(0)));
            zz = -0.425 + (((tickAnim - 0) / 3) * (0-(-0.425)));
        }
        else if (tickAnim >= 3 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 3) / 3) * (0-(0)));
            yy = -0.4 + (((tickAnim - 3) / 3) * (0.145-(-0.4)));
            zz = 0 + (((tickAnim - 3) / 3) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 6) / 3) * (0-(0)));
            yy = 0.145 + (((tickAnim - 6) / 3) * (0.375-(0.145)));
            zz = 0 + (((tickAnim - 6) / 3) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 9) / 6) * (0-(0)));
            yy = 0.375 + (((tickAnim - 9) / 6) * (0.275-(0.375)));
            zz = 0 + (((tickAnim - 9) / 6) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 21) {
            xx = 0 + (((tickAnim - 15) / 6) * (0-(0)));
            yy = 0.275 + (((tickAnim - 15) / 6) * (0.525-(0.275)));
            zz = 0 + (((tickAnim - 15) / 6) * (0.575-(0)));
        }
        else if (tickAnim >= 21 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 21) / 4) * (0-(0)));
            yy = 0.525 + (((tickAnim - 21) / 4) * (0.24-(0.525)));
            zz = 0.575 + (((tickAnim - 21) / 4) * (-0.685-(0.575)));
        }
        else if (tickAnim >= 25 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 25) / 3) * (0-(0)));
            yy = 0.24 + (((tickAnim - 25) / 3) * (0-(0.24)));
            zz = -0.685 + (((tickAnim - 25) / 3) * (-0.425-(-0.685)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightFoot.rotationPointX = this.rightFoot.rotationPointX + (float)(xx);
        this.rightFoot.rotationPointY = this.rightFoot.rotationPointY - (float)(yy);
        this.rightFoot.rotationPointZ = this.rightFoot.rotationPointZ + (float)(zz);
        
    }

        public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        EntityPrehistoricFloraSauropelta e = (EntityPrehistoricFloraSauropelta) entity;
        animator.update(entity);


    }
}
