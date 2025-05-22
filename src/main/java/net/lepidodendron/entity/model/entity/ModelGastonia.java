package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.EntityPrehistoricFloraGastonia;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;

public class ModelGastonia extends ModelBasePalaeopedia {
    private final AdvancedModelRenderer root;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer sidespike9;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer cube_r6;
    private final AdvancedModelRenderer cube_r7;
    private final AdvancedModelRenderer sidespike27;
    private final AdvancedModelRenderer cube_r8;
    private final AdvancedModelRenderer cube_r9;
    private final AdvancedModelRenderer cube_r10;
    private final AdvancedModelRenderer cube_r11;
    private final AdvancedModelRenderer cube_r12;
    private final AdvancedModelRenderer leftLeg;
    private final AdvancedModelRenderer leftLeg2;
    private final AdvancedModelRenderer leftLeg3;
    private final AdvancedModelRenderer leftLeg4;
    private final AdvancedModelRenderer rightLeg;
    private final AdvancedModelRenderer rightLeg2;
    private final AdvancedModelRenderer rightLeg3;
    private final AdvancedModelRenderer rightLeg4;
    private final AdvancedModelRenderer tail;
    private final AdvancedModelRenderer cube_r13;
    private final AdvancedModelRenderer cube_r14;
    private final AdvancedModelRenderer sidespike10;
    private final AdvancedModelRenderer cube_r15;
    private final AdvancedModelRenderer cube_r16;
    private final AdvancedModelRenderer cube_r17;
    private final AdvancedModelRenderer cube_r18;
    private final AdvancedModelRenderer sidespike28;
    private final AdvancedModelRenderer cube_r19;
    private final AdvancedModelRenderer cube_r20;
    private final AdvancedModelRenderer cube_r21;
    private final AdvancedModelRenderer cube_r22;
    private final AdvancedModelRenderer sidespike11;
    private final AdvancedModelRenderer cube_r23;
    private final AdvancedModelRenderer cube_r24;
    private final AdvancedModelRenderer cube_r25;
    private final AdvancedModelRenderer cube_r26;
    private final AdvancedModelRenderer cube_r27;
    private final AdvancedModelRenderer cube_r28;
    private final AdvancedModelRenderer sidespike29;
    private final AdvancedModelRenderer cube_r29;
    private final AdvancedModelRenderer cube_r30;
    private final AdvancedModelRenderer cube_r31;
    private final AdvancedModelRenderer cube_r32;
    private final AdvancedModelRenderer cube_r33;
    private final AdvancedModelRenderer cube_r34;
    private final AdvancedModelRenderer tail2;
    private final AdvancedModelRenderer cube_r35;
    private final AdvancedModelRenderer cube_r36;
    private final AdvancedModelRenderer sidespike13;
    private final AdvancedModelRenderer cube_r37;
    private final AdvancedModelRenderer cube_r38;
    private final AdvancedModelRenderer cube_r39;
    private final AdvancedModelRenderer cube_r40;
    private final AdvancedModelRenderer cube_r41;
    private final AdvancedModelRenderer cube_r42;
    private final AdvancedModelRenderer sidespike31;
    private final AdvancedModelRenderer cube_r43;
    private final AdvancedModelRenderer cube_r44;
    private final AdvancedModelRenderer cube_r45;
    private final AdvancedModelRenderer cube_r46;
    private final AdvancedModelRenderer cube_r47;
    private final AdvancedModelRenderer cube_r48;
    private final AdvancedModelRenderer sidespike12;
    private final AdvancedModelRenderer cube_r49;
    private final AdvancedModelRenderer cube_r50;
    private final AdvancedModelRenderer cube_r51;
    private final AdvancedModelRenderer cube_r52;
    private final AdvancedModelRenderer cube_r53;
    private final AdvancedModelRenderer cube_r54;
    private final AdvancedModelRenderer sidespike30;
    private final AdvancedModelRenderer cube_r55;
    private final AdvancedModelRenderer cube_r56;
    private final AdvancedModelRenderer cube_r57;
    private final AdvancedModelRenderer cube_r58;
    private final AdvancedModelRenderer cube_r59;
    private final AdvancedModelRenderer cube_r60;
    private final AdvancedModelRenderer tail3;
    private final AdvancedModelRenderer sidespike14;
    private final AdvancedModelRenderer cube_r61;
    private final AdvancedModelRenderer cube_r62;
    private final AdvancedModelRenderer cube_r63;
    private final AdvancedModelRenderer cube_r64;
    private final AdvancedModelRenderer sidespike32;
    private final AdvancedModelRenderer cube_r65;
    private final AdvancedModelRenderer cube_r66;
    private final AdvancedModelRenderer cube_r67;
    private final AdvancedModelRenderer cube_r68;
    private final AdvancedModelRenderer tail4;
    private final AdvancedModelRenderer sidespike15;
    private final AdvancedModelRenderer cube_r69;
    private final AdvancedModelRenderer cube_r70;
    private final AdvancedModelRenderer cube_r71;
    private final AdvancedModelRenderer cube_r72;
    private final AdvancedModelRenderer cube_r73;
    private final AdvancedModelRenderer sidespike33;
    private final AdvancedModelRenderer cube_r74;
    private final AdvancedModelRenderer cube_r75;
    private final AdvancedModelRenderer cube_r76;
    private final AdvancedModelRenderer cube_r77;
    private final AdvancedModelRenderer cube_r78;
    private final AdvancedModelRenderer sidespike16;
    private final AdvancedModelRenderer cube_r79;
    private final AdvancedModelRenderer cube_r80;
    private final AdvancedModelRenderer sidespike34;
    private final AdvancedModelRenderer cube_r81;
    private final AdvancedModelRenderer cube_r82;
    private final AdvancedModelRenderer tail5;
    private final AdvancedModelRenderer cube_r83;
    private final AdvancedModelRenderer cube_r84;
    private final AdvancedModelRenderer sidespike17;
    private final AdvancedModelRenderer cube_r85;
    private final AdvancedModelRenderer cube_r86;
    private final AdvancedModelRenderer sidespike35;
    private final AdvancedModelRenderer cube_r87;
    private final AdvancedModelRenderer cube_r88;
    private final AdvancedModelRenderer sidespike18;
    private final AdvancedModelRenderer cube_r89;
    private final AdvancedModelRenderer sidespike36;
    private final AdvancedModelRenderer cube_r90;
    private final AdvancedModelRenderer body;
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
    private final AdvancedModelRenderer sidespike5;
    private final AdvancedModelRenderer cube_r115;
    private final AdvancedModelRenderer cube_r116;
    private final AdvancedModelRenderer cube_r117;
    private final AdvancedModelRenderer cube_r118;
    private final AdvancedModelRenderer cube_r119;
    private final AdvancedModelRenderer sidespike23;
    private final AdvancedModelRenderer cube_r120;
    private final AdvancedModelRenderer cube_r121;
    private final AdvancedModelRenderer cube_r122;
    private final AdvancedModelRenderer cube_r123;
    private final AdvancedModelRenderer cube_r124;
    private final AdvancedModelRenderer sidespike6;
    private final AdvancedModelRenderer cube_r125;
    private final AdvancedModelRenderer cube_r126;
    private final AdvancedModelRenderer cube_r127;
    private final AdvancedModelRenderer cube_r128;
    private final AdvancedModelRenderer cube_r129;
    private final AdvancedModelRenderer sidespike24;
    private final AdvancedModelRenderer cube_r130;
    private final AdvancedModelRenderer cube_r131;
    private final AdvancedModelRenderer cube_r132;
    private final AdvancedModelRenderer cube_r133;
    private final AdvancedModelRenderer cube_r134;
    private final AdvancedModelRenderer sidespike7;
    private final AdvancedModelRenderer cube_r135;
    private final AdvancedModelRenderer cube_r136;
    private final AdvancedModelRenderer cube_r137;
    private final AdvancedModelRenderer cube_r138;
    private final AdvancedModelRenderer cube_r139;
    private final AdvancedModelRenderer sidespike25;
    private final AdvancedModelRenderer cube_r140;
    private final AdvancedModelRenderer cube_r141;
    private final AdvancedModelRenderer cube_r142;
    private final AdvancedModelRenderer cube_r143;
    private final AdvancedModelRenderer cube_r144;
    private final AdvancedModelRenderer sidespike8;
    private final AdvancedModelRenderer cube_r145;
    private final AdvancedModelRenderer cube_r146;
    private final AdvancedModelRenderer cube_r147;
    private final AdvancedModelRenderer cube_r148;
    private final AdvancedModelRenderer cube_r149;
    private final AdvancedModelRenderer sidespike26;
    private final AdvancedModelRenderer cube_r150;
    private final AdvancedModelRenderer cube_r151;
    private final AdvancedModelRenderer cube_r152;
    private final AdvancedModelRenderer cube_r153;
    private final AdvancedModelRenderer cube_r154;
    private final AdvancedModelRenderer spike3;
    private final AdvancedModelRenderer cube_r155;
    private final AdvancedModelRenderer cube_r156;
    private final AdvancedModelRenderer spike8;
    private final AdvancedModelRenderer cube_r157;
    private final AdvancedModelRenderer cube_r158;
    private final AdvancedModelRenderer spike4;
    private final AdvancedModelRenderer cube_r159;
    private final AdvancedModelRenderer cube_r160;
    private final AdvancedModelRenderer cube_r161;
    private final AdvancedModelRenderer spike9;
    private final AdvancedModelRenderer cube_r162;
    private final AdvancedModelRenderer cube_r163;
    private final AdvancedModelRenderer cube_r164;
    private final AdvancedModelRenderer spike5;
    private final AdvancedModelRenderer cube_r165;
    private final AdvancedModelRenderer cube_r166;
    private final AdvancedModelRenderer spike10;
    private final AdvancedModelRenderer cube_r167;
    private final AdvancedModelRenderer cube_r168;
    private final AdvancedModelRenderer body2;
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
    private final AdvancedModelRenderer sidespike4;
    private final AdvancedModelRenderer cube_r179;
    private final AdvancedModelRenderer cube_r180;
    private final AdvancedModelRenderer cube_r181;
    private final AdvancedModelRenderer cube_r182;
    private final AdvancedModelRenderer cube_r183;
    private final AdvancedModelRenderer sidespike22;
    private final AdvancedModelRenderer cube_r184;
    private final AdvancedModelRenderer cube_r185;
    private final AdvancedModelRenderer cube_r186;
    private final AdvancedModelRenderer cube_r187;
    private final AdvancedModelRenderer cube_r188;
    private final AdvancedModelRenderer spike;
    private final AdvancedModelRenderer cube_r189;
    private final AdvancedModelRenderer cube_r190;
    private final AdvancedModelRenderer spike6;
    private final AdvancedModelRenderer cube_r191;
    private final AdvancedModelRenderer cube_r192;
    private final AdvancedModelRenderer spike2;
    private final AdvancedModelRenderer cube_r193;
    private final AdvancedModelRenderer cube_r194;
    private final AdvancedModelRenderer spike7;
    private final AdvancedModelRenderer cube_r195;
    private final AdvancedModelRenderer cube_r196;
    private final AdvancedModelRenderer leftArm;
    private final AdvancedModelRenderer leftArm2;
    private final AdvancedModelRenderer leftArm3;
    private final AdvancedModelRenderer rightArm;
    private final AdvancedModelRenderer rightArm2;
    private final AdvancedModelRenderer rightArm3;
    private final AdvancedModelRenderer neck;
    private final AdvancedModelRenderer cube_r197;
    private final AdvancedModelRenderer cube_r198;
    private final AdvancedModelRenderer cube_r199;
    private final AdvancedModelRenderer cube_r200;
    private final AdvancedModelRenderer cube_r201;
    private final AdvancedModelRenderer cube_r202;
    private final AdvancedModelRenderer sidespike3;
    private final AdvancedModelRenderer cube_r203;
    private final AdvancedModelRenderer cube_r204;
    private final AdvancedModelRenderer sidespike21;
    private final AdvancedModelRenderer cube_r205;
    private final AdvancedModelRenderer cube_r206;
    private final AdvancedModelRenderer neck2;
    private final AdvancedModelRenderer cube_r207;
    private final AdvancedModelRenderer cube_r208;
    private final AdvancedModelRenderer cube_r209;
    private final AdvancedModelRenderer sidespike;
    private final AdvancedModelRenderer cube_r210;
    private final AdvancedModelRenderer sidespike19;
    private final AdvancedModelRenderer cube_r211;
    private final AdvancedModelRenderer sidespike2;
    private final AdvancedModelRenderer cube_r212;
    private final AdvancedModelRenderer cube_r213;
    private final AdvancedModelRenderer sidespike20;
    private final AdvancedModelRenderer cube_r214;
    private final AdvancedModelRenderer cube_r215;
    private final AdvancedModelRenderer head;
    private final AdvancedModelRenderer cube_r216;
    private final AdvancedModelRenderer cube_r217;
    private final AdvancedModelRenderer cube_r218;
    private final AdvancedModelRenderer cube_r219;
    private final AdvancedModelRenderer cube_r220;
    private final AdvancedModelRenderer cube_r221;
    private final AdvancedModelRenderer cube_r222;
    private final AdvancedModelRenderer cube_r223;
    private final AdvancedModelRenderer cube_r224;
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
    private final AdvancedModelRenderer leftNose;
    private final AdvancedModelRenderer cube_r238;
    private final AdvancedModelRenderer jaw;
    private final AdvancedModelRenderer cube_r239;
    private final AdvancedModelRenderer cube_r240;
    private final AdvancedModelRenderer cube_r241;
    private final AdvancedModelRenderer cube_r242;
    private final AdvancedModelRenderer cube_r243;
    private final AdvancedModelRenderer cube_r244;
    private final AdvancedModelRenderer cube_r245;
    private final AdvancedModelRenderer throat;
    private final AdvancedModelRenderer cube_r246;
    private final AdvancedModelRenderer eye;
    private final AdvancedModelRenderer eye2;

    private ModelAnimator animator;

    public ModelGastonia() {

        this.textureWidth = 128;
        this.textureHeight = 128;

        this.root = new AdvancedModelRenderer(this);
        this.root.setRotationPoint(0.0F, 1.7373F, 8.1639F);


        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(0.5F, 0.1127F, 0.8111F);
        this.root.addChild(cube_r1);
        this.setRotateAngle(cube_r1, -0.2618F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 84, 36, -1.5F, -0.75F, -1.0F, 0, 1, 9, 0.0F, true));
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 80, 25, -4.0F, -0.75F, -1.0F, 0, 1, 9, 0.0F, true));
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 84, 47, -6.5F, -0.75F, -1.0F, 0, 1, 9, 0.0F, true));
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 84, 47, 5.5F, -0.75F, -1.0F, 0, 1, 9, 0.0F, false));
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 84, 36, 0.5F, -0.75F, -1.0F, 0, 1, 9, 0.0F, false));
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 80, 25, 3.0F, -0.75F, -1.0F, 0, 1, 9, 0.0F, false));
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 0, 28, -7.5F, 0.0F, -1.0F, 14, 6, 9, 0.0F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(-1.0F, 6.2627F, -0.1639F);
        this.root.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.2618F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 41, 44, -5.5F, -1.05F, -1.2F, 13, 6, 8, 0.0F, false));

        this.sidespike9 = new AdvancedModelRenderer(this);
        this.sidespike9.setRotationPoint(7.3598F, 2.1608F, 3.1996F);
        this.root.addChild(sidespike9);
        this.setRotateAngle(sidespike9, -0.5215F, -1.0696F, 0.6545F);


        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(4.8638F, 0.0F, -0.086F);
        this.sidespike9.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.0F, 0.5061F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 93, 66, -5.0F, -0.5F, -2.0F, 5, 1, 3, -0.006F, false));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(5.9516F, 0.0F, 0.3856F);
        this.sidespike9.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.0F, 0.3316F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 63, 107, -0.875F, -0.5F, -0.8F, 4, 1, 1, -0.003F, false));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(3.5843F, 0.5F, -2.1918F);
        this.sidespike9.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.0F, -0.1309F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 110, 98, 0.5F, -1.0F, 1.0F, 3, 1, 1, -0.01F, false));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(-0.2815F, 0.0F, -2.6639F);
        this.sidespike9.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.0F, 0.0873F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 36, 91, -6.0F, -0.5F, 0.0F, 6, 1, 4, -0.003F, false));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(3.6843F, 0.5F, -2.1418F);
        this.sidespike9.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.0F, -0.1309F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 94, 17, -4.0F, -1.0F, 0.75F, 4, 1, 3, -0.01F, false));
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 91, 72, -4.0F, -1.0F, 0.0F, 10, 1, 1, 0.0F, false));

        this.sidespike27 = new AdvancedModelRenderer(this);
        this.sidespike27.setRotationPoint(-7.3598F, 2.1608F, 3.1996F);
        this.root.addChild(sidespike27);
        this.setRotateAngle(sidespike27, -0.5215F, 1.0696F, -0.6545F);


        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(-4.8638F, 0.0F, -0.086F);
        this.sidespike27.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.0F, -0.5061F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 93, 66, 0.0F, -0.5F, -2.0F, 5, 1, 3, -0.006F, true));

        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(-5.9516F, 0.0F, 0.3856F);
        this.sidespike27.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.0F, -0.3316F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 63, 107, -3.125F, -0.5F, -0.8F, 4, 1, 1, -0.003F, true));

        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(-3.5843F, 0.5F, -2.1918F);
        this.sidespike27.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 0.0F, 0.1309F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 110, 98, -3.5F, -1.0F, 1.0F, 3, 1, 1, -0.01F, true));

        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(0.2815F, 0.0F, -2.6639F);
        this.sidespike27.addChild(cube_r11);
        this.setRotateAngle(cube_r11, 0.0F, -0.0873F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 36, 91, 0.0F, -0.5F, 0.0F, 6, 1, 4, -0.003F, true));

        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(-3.6843F, 0.5F, -2.1418F);
        this.sidespike27.addChild(cube_r12);
        this.setRotateAngle(cube_r12, 0.0F, 0.1309F, 0.0F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 94, 17, 0.0F, -1.0F, 0.75F, 4, 1, 3, -0.01F, true));
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 91, 72, -6.0F, -1.0F, 0.0F, 10, 1, 1, 0.0F, true));

        this.leftLeg = new AdvancedModelRenderer(this);
        this.leftLeg.setRotationPoint(5.9615F, 2.9396F, 1.9529F);
        this.root.addChild(leftLeg);
        this.setRotateAngle(leftLeg, -0.3046F, -0.2627F, 0.0374F);
        this.leftLeg.cubeList.add(new ModelBox(leftLeg, 41, 59, -3.0F, 0.5F, -3.0F, 6, 10, 7, 0.0F, false));

        this.leftLeg2 = new AdvancedModelRenderer(this);
        this.leftLeg2.setRotationPoint(0.0F, 10.5F, -2.5F);
        this.leftLeg.addChild(leftLeg2);
        this.setRotateAngle(leftLeg2, 0.8319F, 0.185F, 0.0004F);
        this.leftLeg2.cubeList.add(new ModelBox(leftLeg2, 42, 77, -2.0F, 0.0F, 0.0F, 4, 9, 4, 0.0F, false));

        this.leftLeg3 = new AdvancedModelRenderer(this);
        this.leftLeg3.setRotationPoint(0.0F, 8.953F, 3.9201F);
        this.leftLeg2.addChild(leftLeg3);
        this.setRotateAngle(leftLeg3, -0.7854F, 0.0F, 0.0F);
        this.leftLeg3.cubeList.add(new ModelBox(leftLeg3, 93, 58, -2.0F, 0.0F, -3.0F, 4, 4, 3, -0.01F, false));

        this.leftLeg4 = new AdvancedModelRenderer(this);
        this.leftLeg4.setRotationPoint(0.0F, 2.9681F, -2.2674F);
        this.leftLeg3.addChild(leftLeg4);
        this.setRotateAngle(leftLeg4, 0.2486F, -0.0064F, 0.0254F);
        this.leftLeg4.cubeList.add(new ModelBox(leftLeg4, 78, 84, -2.5F, 0.0F, -3.0F, 5, 2, 5, 0.0F, false));

        this.rightLeg = new AdvancedModelRenderer(this);
        this.rightLeg.setRotationPoint(-5.9615F, 2.9396F, 1.9529F);
        this.root.addChild(rightLeg);
        this.setRotateAngle(rightLeg, -0.3046F, 0.2627F, -0.0374F);
        this.rightLeg.cubeList.add(new ModelBox(rightLeg, 41, 59, -3.0F, 0.5F, -3.0F, 6, 10, 7, 0.0F, true));

        this.rightLeg2 = new AdvancedModelRenderer(this);
        this.rightLeg2.setRotationPoint(0.0F, 10.5F, -2.5F);
        this.rightLeg.addChild(rightLeg2);
        this.setRotateAngle(rightLeg2, 0.8319F, -0.185F, -0.0004F);
        this.rightLeg2.cubeList.add(new ModelBox(rightLeg2, 42, 77, -2.0F, 0.0F, 0.0F, 4, 9, 4, 0.0F, true));

        this.rightLeg3 = new AdvancedModelRenderer(this);
        this.rightLeg3.setRotationPoint(0.0F, 8.953F, 3.9201F);
        this.rightLeg2.addChild(rightLeg3);
        this.setRotateAngle(rightLeg3, -0.7854F, 0.0F, 0.0F);
        this.rightLeg3.cubeList.add(new ModelBox(rightLeg3, 93, 58, -2.0F, 0.0F, -3.0F, 4, 4, 3, -0.01F, true));

        this.rightLeg4 = new AdvancedModelRenderer(this);
        this.rightLeg4.setRotationPoint(0.0F, 2.9681F, -2.2674F);
        this.rightLeg3.addChild(rightLeg4);
        this.setRotateAngle(rightLeg4, 0.2486F, 0.0064F, -0.0254F);
        this.rightLeg4.cubeList.add(new ModelBox(rightLeg4, 78, 84, -2.5F, 0.0F, -3.0F, 5, 2, 5, 0.0F, true));

        this.tail = new AdvancedModelRenderer(this);
        this.tail.setRotationPoint(0.0F, 2.302F, 8.2226F);
        this.root.addChild(tail);
        this.setRotateAngle(tail, -0.3927F, 0.0F, 0.0F);
        this.tail.cubeList.add(new ModelBox(tail, 47, 28, -3.5F, 0.0F, 0.0F, 7, 6, 9, 0.0F, false));

        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(-1.75F, 2.5F, 5.0F);
        this.tail.addChild(cube_r13);
        this.setRotateAngle(cube_r13, 0.0F, 0.1309F, 0.0F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 29, 71, -1.0F, -3.0F, -1.0F, 2, 1, 3, 0.0F, true));

        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(1.75F, 2.5F, 5.0F);
        this.tail.addChild(cube_r14);
        this.setRotateAngle(cube_r14, 0.0F, -0.1309F, 0.0F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 29, 71, -1.0F, -3.0F, -1.0F, 2, 1, 3, 0.0F, false));

        this.sidespike10 = new AdvancedModelRenderer(this);
        this.sidespike10.setRotationPoint(3.301F, 1.3999F, 0.9405F);
        this.tail.addChild(sidespike10);
        this.setRotateAngle(sidespike10, -0.0324F, -0.9383F, 0.0202F);


        this.cube_r15 = new AdvancedModelRenderer(this);
        this.cube_r15.setRotationPoint(4.8638F, 0.0F, -0.086F);
        this.sidespike10.addChild(cube_r15);
        this.setRotateAngle(cube_r15, 0.0F, 0.5061F, 0.0F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 94, 12, -5.0F, -0.5F, -2.0F, 5, 1, 3, -0.006F, false));

        this.cube_r16 = new AdvancedModelRenderer(this);
        this.cube_r16.setRotationPoint(5.9516F, 0.0F, 0.3856F);
        this.sidespike10.addChild(cube_r16);
        this.setRotateAngle(cube_r16, 0.0F, 0.3316F, 0.0F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 107, 107, -0.875F, -0.5F, -0.8F, 4, 1, 1, -0.003F, false));

        this.cube_r17 = new AdvancedModelRenderer(this);
        this.cube_r17.setRotationPoint(3.5843F, 0.5F, -2.1918F);
        this.sidespike10.addChild(cube_r17);
        this.setRotateAngle(cube_r17, 0.0F, -0.1309F, 0.0F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 88, 110, 0.5F, -1.0F, 1.0F, 3, 1, 1, -0.01F, false));

        this.cube_r18 = new AdvancedModelRenderer(this);
        this.cube_r18.setRotationPoint(3.6843F, 0.5F, -2.1418F);
        this.sidespike10.addChild(cube_r18);
        this.setRotateAngle(cube_r18, 0.0F, -0.1309F, 0.0F);
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 36, 97, -4.0F, -1.0F, 0.75F, 4, 1, 3, -0.01F, false));
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 91, 75, -4.0F, -1.0F, 0.0F, 10, 1, 1, 0.0F, false));

        this.sidespike28 = new AdvancedModelRenderer(this);
        this.sidespike28.setRotationPoint(-3.301F, 1.3999F, 0.9405F);
        this.tail.addChild(sidespike28);
        this.setRotateAngle(sidespike28, -0.0324F, 0.9383F, -0.0202F);


        this.cube_r19 = new AdvancedModelRenderer(this);
        this.cube_r19.setRotationPoint(-4.8638F, 0.0F, -0.086F);
        this.sidespike28.addChild(cube_r19);
        this.setRotateAngle(cube_r19, 0.0F, -0.5061F, 0.0F);
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 94, 12, 0.0F, -0.5F, -2.0F, 5, 1, 3, -0.006F, true));

        this.cube_r20 = new AdvancedModelRenderer(this);
        this.cube_r20.setRotationPoint(-5.9516F, 0.0F, 0.3856F);
        this.sidespike28.addChild(cube_r20);
        this.setRotateAngle(cube_r20, 0.0F, -0.3316F, 0.0F);
        this.cube_r20.cubeList.add(new ModelBox(cube_r20, 107, 107, -3.125F, -0.5F, -0.8F, 4, 1, 1, -0.003F, true));

        this.cube_r21 = new AdvancedModelRenderer(this);
        this.cube_r21.setRotationPoint(-3.5843F, 0.5F, -2.1918F);
        this.sidespike28.addChild(cube_r21);
        this.setRotateAngle(cube_r21, 0.0F, 0.1309F, 0.0F);
        this.cube_r21.cubeList.add(new ModelBox(cube_r21, 88, 110, -3.5F, -1.0F, 1.0F, 3, 1, 1, -0.01F, true));

        this.cube_r22 = new AdvancedModelRenderer(this);
        this.cube_r22.setRotationPoint(-3.6843F, 0.5F, -2.1418F);
        this.sidespike28.addChild(cube_r22);
        this.setRotateAngle(cube_r22, 0.0F, 0.1309F, 0.0F);
        this.cube_r22.cubeList.add(new ModelBox(cube_r22, 36, 97, 0.0F, -1.0F, 0.75F, 4, 1, 3, -0.01F, true));
        this.cube_r22.cubeList.add(new ModelBox(cube_r22, 91, 75, -6.0F, -1.0F, 0.0F, 10, 1, 1, 0.0F, true));

        this.sidespike11 = new AdvancedModelRenderer(this);
        this.sidespike11.setRotationPoint(1.6777F, 1.1307F, 6.238F);
        this.tail.addChild(sidespike11);
        this.setRotateAngle(sidespike11, -0.0864F, -0.6717F, 0.1206F);


        this.cube_r23 = new AdvancedModelRenderer(this);
        this.cube_r23.setRotationPoint(5.3486F, 0.0F, 0.7887F);
        this.sidespike11.addChild(cube_r23);
        this.setRotateAngle(cube_r23, 0.0F, 0.4625F, 0.0F);
        this.cube_r23.cubeList.add(new ModelBox(cube_r23, 0, 99, -4.3F, -0.5F, -2.175F, 5, 1, 2, -0.006F, false));

        this.cube_r24 = new AdvancedModelRenderer(this);
        this.cube_r24.setRotationPoint(6.4016F, 0.0F, 0.0606F);
        this.sidespike11.addChild(cube_r24);
        this.setRotateAngle(cube_r24, 0.0F, 0.2007F, 0.0F);
        this.cube_r24.cubeList.add(new ModelBox(cube_r24, 11, 109, -0.875F, -0.5F, -0.8F, 4, 1, 1, -0.003F, false));

        this.cube_r25 = new AdvancedModelRenderer(this);
        this.cube_r25.setRotationPoint(3.5843F, 0.5F, -2.1918F);
        this.sidespike11.addChild(cube_r25);
        this.setRotateAngle(cube_r25, 0.0F, -0.1309F, 0.0F);
        this.cube_r25.cubeList.add(new ModelBox(cube_r25, 110, 92, 0.05F, -1.0F, 1.0F, 3, 1, 1, -0.01F, false));

        this.cube_r26 = new AdvancedModelRenderer(this);
        this.cube_r26.setRotationPoint(3.5537F, 0.5F, -1.1503F);
        this.sidespike11.addChild(cube_r26);
        this.setRotateAngle(cube_r26, 0.0F, 0.3054F, 0.0F);
        this.cube_r26.cubeList.add(new ModelBox(cube_r26, 103, 51, -4.0F, -1.0F, -0.525F, 4, 1, 2, -0.01F, false));

        this.cube_r27 = new AdvancedModelRenderer(this);
        this.cube_r27.setRotationPoint(2.6928F, 0.5F, -2.2723F);
        this.sidespike11.addChild(cube_r27);
        this.setRotateAngle(cube_r27, 0.0F, 0.3054F, 0.0F);
        this.cube_r27.cubeList.add(new ModelBox(cube_r27, 94, 22, -7.0F, -1.0F, 0.0F, 7, 1, 1, 0.003F, false));

        this.cube_r28 = new AdvancedModelRenderer(this);
        this.cube_r28.setRotationPoint(3.6843F, 0.5F, -2.1418F);
        this.sidespike11.addChild(cube_r28);
        this.setRotateAngle(cube_r28, 0.0F, -0.1309F, 0.0F);
        this.cube_r28.cubeList.add(new ModelBox(cube_r28, 0, 96, -1.0F, -1.0F, 0.0F, 7, 1, 1, 0.0F, false));

        this.sidespike29 = new AdvancedModelRenderer(this);
        this.sidespike29.setRotationPoint(-1.6777F, 1.1307F, 6.238F);
        this.tail.addChild(sidespike29);
        this.setRotateAngle(sidespike29, -0.0864F, 0.6717F, -0.1206F);


        this.cube_r29 = new AdvancedModelRenderer(this);
        this.cube_r29.setRotationPoint(-5.3486F, 0.0F, 0.7887F);
        this.sidespike29.addChild(cube_r29);
        this.setRotateAngle(cube_r29, 0.0F, -0.4625F, 0.0F);
        this.cube_r29.cubeList.add(new ModelBox(cube_r29, 0, 99, -0.7F, -0.5F, -2.175F, 5, 1, 2, -0.006F, true));

        this.cube_r30 = new AdvancedModelRenderer(this);
        this.cube_r30.setRotationPoint(-6.4016F, 0.0F, 0.0606F);
        this.sidespike29.addChild(cube_r30);
        this.setRotateAngle(cube_r30, 0.0F, -0.2007F, 0.0F);
        this.cube_r30.cubeList.add(new ModelBox(cube_r30, 11, 109, -3.125F, -0.5F, -0.8F, 4, 1, 1, -0.003F, true));

        this.cube_r31 = new AdvancedModelRenderer(this);
        this.cube_r31.setRotationPoint(-3.5843F, 0.5F, -2.1918F);
        this.sidespike29.addChild(cube_r31);
        this.setRotateAngle(cube_r31, 0.0F, 0.1309F, 0.0F);
        this.cube_r31.cubeList.add(new ModelBox(cube_r31, 110, 92, -3.05F, -1.0F, 1.0F, 3, 1, 1, -0.01F, true));

        this.cube_r32 = new AdvancedModelRenderer(this);
        this.cube_r32.setRotationPoint(-3.5537F, 0.5F, -1.1503F);
        this.sidespike29.addChild(cube_r32);
        this.setRotateAngle(cube_r32, 0.0F, -0.3054F, 0.0F);
        this.cube_r32.cubeList.add(new ModelBox(cube_r32, 103, 51, 0.0F, -1.0F, -0.525F, 4, 1, 2, -0.01F, true));

        this.cube_r33 = new AdvancedModelRenderer(this);
        this.cube_r33.setRotationPoint(-2.6928F, 0.5F, -2.2723F);
        this.sidespike29.addChild(cube_r33);
        this.setRotateAngle(cube_r33, 0.0F, -0.3054F, 0.0F);
        this.cube_r33.cubeList.add(new ModelBox(cube_r33, 94, 22, 0.0F, -1.0F, 0.0F, 7, 1, 1, 0.003F, true));

        this.cube_r34 = new AdvancedModelRenderer(this);
        this.cube_r34.setRotationPoint(-3.6843F, 0.5F, -2.1418F);
        this.sidespike29.addChild(cube_r34);
        this.setRotateAngle(cube_r34, 0.0F, 0.1309F, 0.0F);
        this.cube_r34.cubeList.add(new ModelBox(cube_r34, 0, 96, -6.0F, -1.0F, 0.0F, 7, 1, 1, 0.0F, true));

        this.tail2 = new AdvancedModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, 0.0129F, 7.9962F);
        this.tail.addChild(tail2);
        this.setRotateAngle(tail2, 0.0873F, 0.0F, 0.0F);
        this.tail2.cubeList.add(new ModelBox(tail2, 116, 43, 0.5F, -0.5129F, 6.0038F, 1, 1, 2, 0.0F, false));
        this.tail2.cubeList.add(new ModelBox(tail2, 116, 43, -1.5F, -0.5129F, 6.0038F, 1, 1, 2, 0.0F, true));
        this.tail2.cubeList.add(new ModelBox(tail2, 0, 61, -2.5F, 0.0F, 0.0F, 5, 5, 9, 0.0F, false));

        this.cube_r35 = new AdvancedModelRenderer(this);
        this.cube_r35.setRotationPoint(-0.5F, 2.4871F, 4.0038F);
        this.tail2.addChild(cube_r35);
        this.setRotateAngle(cube_r35, 0.0F, 0.1309F, 0.0F);
        this.cube_r35.cubeList.add(new ModelBox(cube_r35, 116, 35, -1.0F, -3.0F, -2.0F, 1, 1, 2, 0.0F, true));

        this.cube_r36 = new AdvancedModelRenderer(this);
        this.cube_r36.setRotationPoint(0.5F, 2.4871F, 4.0038F);
        this.tail2.addChild(cube_r36);
        this.setRotateAngle(cube_r36, 0.0F, -0.1309F, 0.0F);
        this.cube_r36.cubeList.add(new ModelBox(cube_r36, 116, 35, 0.0F, -3.0F, -2.0F, 1, 1, 2, 0.0F, false));

        this.sidespike13 = new AdvancedModelRenderer(this);
        this.sidespike13.setRotationPoint(-0.6268F, 1.6469F, 5.8946F);
        this.tail2.addChild(sidespike13);
        this.setRotateAngle(sidespike13, -0.0638F, -0.592F, 0.0535F);


        this.cube_r37 = new AdvancedModelRenderer(this);
        this.cube_r37.setRotationPoint(5.3486F, 0.0F, 0.7887F);
        this.sidespike13.addChild(cube_r37);
        this.setRotateAngle(cube_r37, 0.0F, 0.4625F, 0.0F);
        this.cube_r37.cubeList.add(new ModelBox(cube_r37, 52, 105, -2.3F, -0.5F, -2.175F, 3, 1, 2, -0.006F, false));

        this.cube_r38 = new AdvancedModelRenderer(this);
        this.cube_r38.setRotationPoint(6.4016F, 0.0F, 0.0606F);
        this.sidespike13.addChild(cube_r38);
        this.setRotateAngle(cube_r38, 0.0F, 0.2007F, 0.0F);
        this.cube_r38.cubeList.add(new ModelBox(cube_r38, 108, 61, -0.875F, -0.5F, -0.8F, 4, 1, 1, -0.003F, false));

        this.cube_r39 = new AdvancedModelRenderer(this);
        this.cube_r39.setRotationPoint(3.5843F, 0.5F, -2.1918F);
        this.sidespike13.addChild(cube_r39);
        this.setRotateAngle(cube_r39, 0.0F, -0.1309F, 0.0F);
        this.cube_r39.cubeList.add(new ModelBox(cube_r39, 97, 110, 0.05F, -1.0F, 1.0F, 3, 1, 1, -0.01F, false));

        this.cube_r40 = new AdvancedModelRenderer(this);
        this.cube_r40.setRotationPoint(3.6843F, 0.5F, -2.1418F);
        this.sidespike13.addChild(cube_r40);
        this.setRotateAngle(cube_r40, 0.0F, 0.2618F, 0.0F);
        this.cube_r40.cubeList.add(new ModelBox(cube_r40, 63, 110, -2.0F, -1.0F, 0.75F, 2, 1, 2, -0.013F, false));

        this.cube_r41 = new AdvancedModelRenderer(this);
        this.cube_r41.setRotationPoint(3.6843F, 0.5F, -2.1418F);
        this.sidespike13.addChild(cube_r41);
        this.setRotateAngle(cube_r41, 0.0F, 0.2182F, 0.0F);
        this.cube_r41.cubeList.add(new ModelBox(cube_r41, 115, 110, -2.0F, -1.0F, 0.0F, 2, 1, 1, 0.003F, false));

        this.cube_r42 = new AdvancedModelRenderer(this);
        this.cube_r42.setRotationPoint(3.6843F, 0.5F, -2.1418F);
        this.sidespike13.addChild(cube_r42);
        this.setRotateAngle(cube_r42, 0.0F, -0.1309F, 0.0F);
        this.cube_r42.cubeList.add(new ModelBox(cube_r42, 15, 103, 0.0F, -1.0F, 0.0F, 6, 1, 1, 0.0F, false));

        this.sidespike31 = new AdvancedModelRenderer(this);
        this.sidespike31.setRotationPoint(0.6268F, 1.6469F, 5.8946F);
        this.tail2.addChild(sidespike31);
        this.setRotateAngle(sidespike31, -0.0638F, 0.592F, -0.0535F);


        this.cube_r43 = new AdvancedModelRenderer(this);
        this.cube_r43.setRotationPoint(-5.3486F, 0.0F, 0.7887F);
        this.sidespike31.addChild(cube_r43);
        this.setRotateAngle(cube_r43, 0.0F, -0.4625F, 0.0F);
        this.cube_r43.cubeList.add(new ModelBox(cube_r43, 52, 105, -0.7F, -0.5F, -2.175F, 3, 1, 2, -0.006F, true));

        this.cube_r44 = new AdvancedModelRenderer(this);
        this.cube_r44.setRotationPoint(-6.4016F, 0.0F, 0.0606F);
        this.sidespike31.addChild(cube_r44);
        this.setRotateAngle(cube_r44, 0.0F, -0.2007F, 0.0F);
        this.cube_r44.cubeList.add(new ModelBox(cube_r44, 108, 61, -3.125F, -0.5F, -0.8F, 4, 1, 1, -0.003F, true));

        this.cube_r45 = new AdvancedModelRenderer(this);
        this.cube_r45.setRotationPoint(-3.5843F, 0.5F, -2.1918F);
        this.sidespike31.addChild(cube_r45);
        this.setRotateAngle(cube_r45, 0.0F, 0.1309F, 0.0F);
        this.cube_r45.cubeList.add(new ModelBox(cube_r45, 97, 110, -3.05F, -1.0F, 1.0F, 3, 1, 1, -0.01F, true));

        this.cube_r46 = new AdvancedModelRenderer(this);
        this.cube_r46.setRotationPoint(-3.6843F, 0.5F, -2.1418F);
        this.sidespike31.addChild(cube_r46);
        this.setRotateAngle(cube_r46, 0.0F, -0.2618F, 0.0F);
        this.cube_r46.cubeList.add(new ModelBox(cube_r46, 63, 110, 0.0F, -1.0F, 0.75F, 2, 1, 2, -0.013F, true));

        this.cube_r47 = new AdvancedModelRenderer(this);
        this.cube_r47.setRotationPoint(-3.6843F, 0.5F, -2.1418F);
        this.sidespike31.addChild(cube_r47);
        this.setRotateAngle(cube_r47, 0.0F, -0.2182F, 0.0F);
        this.cube_r47.cubeList.add(new ModelBox(cube_r47, 115, 110, 0.0F, -1.0F, 0.0F, 2, 1, 1, 0.003F, true));

        this.cube_r48 = new AdvancedModelRenderer(this);
        this.cube_r48.setRotationPoint(-3.6843F, 0.5F, -2.1418F);
        this.sidespike31.addChild(cube_r48);
        this.setRotateAngle(cube_r48, 0.0F, 0.1309F, 0.0F);
        this.cube_r48.cubeList.add(new ModelBox(cube_r48, 15, 103, -6.0F, -1.0F, 0.0F, 6, 1, 1, 0.0F, true));

        this.sidespike12 = new AdvancedModelRenderer(this);
        this.sidespike12.setRotationPoint(0.8732F, 1.1469F, 2.4446F);
        this.tail2.addChild(sidespike12);
        this.setRotateAngle(sidespike12, -0.1683F, -0.5848F, 0.1115F);


        this.cube_r49 = new AdvancedModelRenderer(this);
        this.cube_r49.setRotationPoint(5.3486F, 0.0F, 0.7887F);
        this.sidespike12.addChild(cube_r49);
        this.setRotateAngle(cube_r49, 0.0F, 0.4625F, 0.0F);
        this.cube_r49.cubeList.add(new ModelBox(cube_r49, 99, 31, -4.3F, -0.5F, -2.175F, 5, 1, 2, -0.006F, false));

        this.cube_r50 = new AdvancedModelRenderer(this);
        this.cube_r50.setRotationPoint(6.4016F, 0.0F, 0.0606F);
        this.sidespike12.addChild(cube_r50);
        this.setRotateAngle(cube_r50, 0.0F, 0.2007F, 0.0F);
        this.cube_r50.cubeList.add(new ModelBox(cube_r50, 108, 58, -0.875F, -0.5F, -0.8F, 4, 1, 1, -0.003F, false));

        this.cube_r51 = new AdvancedModelRenderer(this);
        this.cube_r51.setRotationPoint(3.5843F, 0.5F, -2.1918F);
        this.sidespike12.addChild(cube_r51);
        this.setRotateAngle(cube_r51, 0.0F, -0.1309F, 0.0F);
        this.cube_r51.cubeList.add(new ModelBox(cube_r51, 110, 95, 0.05F, -1.0F, 1.0F, 3, 1, 1, -0.01F, false));

        this.cube_r52 = new AdvancedModelRenderer(this);
        this.cube_r52.setRotationPoint(3.6843F, 0.5F, -2.1418F);
        this.sidespike12.addChild(cube_r52);
        this.setRotateAngle(cube_r52, 0.0F, 0.2618F, 0.0F);
        this.cube_r52.cubeList.add(new ModelBox(cube_r52, 77, 103, -4.0F, -1.0F, 0.75F, 4, 1, 2, -0.013F, false));

        this.cube_r53 = new AdvancedModelRenderer(this);
        this.cube_r53.setRotationPoint(3.6843F, 0.5F, -2.1418F);
        this.sidespike12.addChild(cube_r53);
        this.setRotateAngle(cube_r53, 0.0F, 0.2182F, 0.0F);
        this.cube_r53.cubeList.add(new ModelBox(cube_r53, 0, 103, -6.0F, -1.0F, 0.0F, 6, 1, 1, 0.003F, false));

        this.cube_r54 = new AdvancedModelRenderer(this);
        this.cube_r54.setRotationPoint(3.6843F, 0.5F, -2.1418F);
        this.sidespike12.addChild(cube_r54);
        this.setRotateAngle(cube_r54, 0.0F, -0.1309F, 0.0F);
        this.cube_r54.cubeList.add(new ModelBox(cube_r54, 36, 102, 0.0F, -1.0F, 0.0F, 6, 1, 1, 0.0F, false));

        this.sidespike30 = new AdvancedModelRenderer(this);
        this.sidespike30.setRotationPoint(-0.8732F, 1.1469F, 2.4446F);
        this.tail2.addChild(sidespike30);
        this.setRotateAngle(sidespike30, -0.1683F, 0.5848F, -0.1115F);


        this.cube_r55 = new AdvancedModelRenderer(this);
        this.cube_r55.setRotationPoint(-5.3486F, 0.0F, 0.7887F);
        this.sidespike30.addChild(cube_r55);
        this.setRotateAngle(cube_r55, 0.0F, -0.4625F, 0.0F);
        this.cube_r55.cubeList.add(new ModelBox(cube_r55, 99, 31, -0.7F, -0.5F, -2.175F, 5, 1, 2, -0.006F, true));

        this.cube_r56 = new AdvancedModelRenderer(this);
        this.cube_r56.setRotationPoint(-6.4016F, 0.0F, 0.0606F);
        this.sidespike30.addChild(cube_r56);
        this.setRotateAngle(cube_r56, 0.0F, -0.2007F, 0.0F);
        this.cube_r56.cubeList.add(new ModelBox(cube_r56, 108, 58, -3.125F, -0.5F, -0.8F, 4, 1, 1, -0.003F, true));

        this.cube_r57 = new AdvancedModelRenderer(this);
        this.cube_r57.setRotationPoint(-3.5843F, 0.5F, -2.1918F);
        this.sidespike30.addChild(cube_r57);
        this.setRotateAngle(cube_r57, 0.0F, 0.1309F, 0.0F);
        this.cube_r57.cubeList.add(new ModelBox(cube_r57, 110, 95, -3.05F, -1.0F, 1.0F, 3, 1, 1, -0.01F, true));

        this.cube_r58 = new AdvancedModelRenderer(this);
        this.cube_r58.setRotationPoint(-3.6843F, 0.5F, -2.1418F);
        this.sidespike30.addChild(cube_r58);
        this.setRotateAngle(cube_r58, 0.0F, -0.2618F, 0.0F);
        this.cube_r58.cubeList.add(new ModelBox(cube_r58, 77, 103, 0.0F, -1.0F, 0.75F, 4, 1, 2, -0.013F, true));

        this.cube_r59 = new AdvancedModelRenderer(this);
        this.cube_r59.setRotationPoint(-3.6843F, 0.5F, -2.1418F);
        this.sidespike30.addChild(cube_r59);
        this.setRotateAngle(cube_r59, 0.0F, -0.2182F, 0.0F);
        this.cube_r59.cubeList.add(new ModelBox(cube_r59, 0, 103, 0.0F, -1.0F, 0.0F, 6, 1, 1, 0.003F, true));

        this.cube_r60 = new AdvancedModelRenderer(this);
        this.cube_r60.setRotationPoint(-3.6843F, 0.5F, -2.1418F);
        this.sidespike30.addChild(cube_r60);
        this.setRotateAngle(cube_r60, 0.0F, 0.1309F, 0.0F);
        this.cube_r60.cubeList.add(new ModelBox(cube_r60, 36, 102, -6.0F, -1.0F, 0.0F, 6, 1, 1, 0.0F, true));

        this.tail3 = new AdvancedModelRenderer(this);
        this.tail3.setRotationPoint(-0.5F, 0.3314F, 7.9991F);
        this.tail2.addChild(tail3);
        this.setRotateAngle(tail3, 0.0785F, 0.0F, 0.0F);
        this.tail3.cubeList.add(new ModelBox(tail3, 116, 47, 1.0F, -0.5942F, 1.5048F, 1, 1, 2, 0.0F, false));
        this.tail3.cubeList.add(new ModelBox(tail3, 116, 51, 1.0F, -0.5942F, 5.5048F, 1, 1, 2, 0.0F, false));
        this.tail3.cubeList.add(new ModelBox(tail3, 116, 47, -1.0F, -0.5942F, 1.5048F, 1, 1, 2, 0.0F, true));
        this.tail3.cubeList.add(new ModelBox(tail3, 116, 51, -1.0F, -0.5942F, 5.5048F, 1, 1, 2, 0.0F, true));
        this.tail3.cubeList.add(new ModelBox(tail3, 68, 59, -1.5F, -0.275F, 0.0F, 4, 4, 8, 0.0F, false));

        this.sidespike14 = new AdvancedModelRenderer(this);
        this.sidespike14.setRotationPoint(-1.8268F, 0.5405F, 2.2456F);
        this.tail3.addChild(sidespike14);
        this.setRotateAngle(sidespike14, -0.1683F, -0.5848F, 0.1115F);


        this.cube_r61 = new AdvancedModelRenderer(this);
        this.cube_r61.setRotationPoint(5.3486F, 0.0F, 0.7886F);
        this.sidespike14.addChild(cube_r61);
        this.setRotateAngle(cube_r61, 0.0F, 0.4625F, 0.0F);
        this.cube_r61.cubeList.add(new ModelBox(cube_r61, 22, 106, -0.3F, -0.5F, -2.175F, 1, 1, 2, -0.006F, false));

        this.cube_r62 = new AdvancedModelRenderer(this);
        this.cube_r62.setRotationPoint(6.4016F, 0.0F, 0.0606F);
        this.sidespike14.addChild(cube_r62);
        this.setRotateAngle(cube_r62, 0.0F, 0.2007F, 0.0F);
        this.cube_r62.cubeList.add(new ModelBox(cube_r62, 22, 110, -0.875F, -0.5F, -0.8F, 4, 1, 1, -0.003F, false));

        this.cube_r63 = new AdvancedModelRenderer(this);
        this.cube_r63.setRotationPoint(3.5843F, 0.5F, -2.1918F);
        this.sidespike14.addChild(cube_r63);
        this.setRotateAngle(cube_r63, 0.0F, -0.1309F, 0.0F);
        this.cube_r63.cubeList.add(new ModelBox(cube_r63, 112, 25, 0.05F, -1.0F, 1.0F, 3, 1, 1, -0.01F, false));

        this.cube_r64 = new AdvancedModelRenderer(this);
        this.cube_r64.setRotationPoint(3.6843F, 0.5F, -2.1418F);
        this.sidespike14.addChild(cube_r64);
        this.setRotateAngle(cube_r64, 0.0F, -0.1309F, 0.0F);
        this.cube_r64.cubeList.add(new ModelBox(cube_r64, 103, 40, 0.0F, -1.0F, 0.0F, 6, 1, 1, 0.0F, false));

        this.sidespike32 = new AdvancedModelRenderer(this);
        this.sidespike32.setRotationPoint(2.8268F, 0.5405F, 2.2456F);
        this.tail3.addChild(sidespike32);
        this.setRotateAngle(sidespike32, -0.1683F, 0.5848F, -0.1115F);


        this.cube_r65 = new AdvancedModelRenderer(this);
        this.cube_r65.setRotationPoint(-5.3486F, 0.0F, 0.7886F);
        this.sidespike32.addChild(cube_r65);
        this.setRotateAngle(cube_r65, 0.0F, -0.4625F, 0.0F);
        this.cube_r65.cubeList.add(new ModelBox(cube_r65, 22, 106, -0.7F, -0.5F, -2.175F, 1, 1, 2, -0.006F, true));

        this.cube_r66 = new AdvancedModelRenderer(this);
        this.cube_r66.setRotationPoint(-6.4016F, 0.0F, 0.0606F);
        this.sidespike32.addChild(cube_r66);
        this.setRotateAngle(cube_r66, 0.0F, -0.2007F, 0.0F);
        this.cube_r66.cubeList.add(new ModelBox(cube_r66, 22, 110, -3.125F, -0.5F, -0.8F, 4, 1, 1, -0.003F, true));

        this.cube_r67 = new AdvancedModelRenderer(this);
        this.cube_r67.setRotationPoint(-3.5843F, 0.5F, -2.1918F);
        this.sidespike32.addChild(cube_r67);
        this.setRotateAngle(cube_r67, 0.0F, 0.1309F, 0.0F);
        this.cube_r67.cubeList.add(new ModelBox(cube_r67, 112, 25, -3.05F, -1.0F, 1.0F, 3, 1, 1, -0.01F, true));

        this.cube_r68 = new AdvancedModelRenderer(this);
        this.cube_r68.setRotationPoint(-3.6843F, 0.5F, -2.1418F);
        this.sidespike32.addChild(cube_r68);
        this.setRotateAngle(cube_r68, 0.0F, 0.1309F, 0.0F);
        this.cube_r68.cubeList.add(new ModelBox(cube_r68, 103, 40, -6.0F, -1.0F, 0.0F, 6, 1, 1, 0.0F, true));

        this.tail4 = new AdvancedModelRenderer(this);
        this.tail4.setRotationPoint(-0.5F, 0.0976F, 7.0217F);
        this.tail3.addChild(tail4);
        this.setRotateAngle(tail4, 0.1658F, 0.0F, 0.0F);
        this.tail4.cubeList.add(new ModelBox(tail4, 56, 116, 1.25F, -0.4919F, 1.9831F, 1, 1, 2, 0.0F, false));
        this.tail4.cubeList.add(new ModelBox(tail4, 77, 116, 1.25F, -0.4919F, 5.2331F, 1, 1, 2, 0.0F, false));
        this.tail4.cubeList.add(new ModelBox(tail4, 56, 116, -0.25F, -0.4919F, 1.9831F, 1, 1, 2, 0.0F, true));
        this.tail4.cubeList.add(new ModelBox(tail4, 77, 116, -0.25F, -0.4919F, 5.2331F, 1, 1, 2, 0.0F, true));
        this.tail4.cubeList.add(new ModelBox(tail4, 68, 72, -0.5F, -0.275F, 0.0F, 3, 3, 8, 0.0F, false));

        this.sidespike15 = new AdvancedModelRenderer(this);
        this.sidespike15.setRotationPoint(4.6269F, 0.931F, 2.2654F);
        this.tail4.addChild(sidespike15);
        this.setRotateAngle(sidespike15, -0.1743F, -0.6281F, 0.115F);


        this.cube_r69 = new AdvancedModelRenderer(this);
        this.cube_r69.setRotationPoint(-0.6429F, 0.0F, 1.4303F);
        this.sidespike15.addChild(cube_r69);
        this.setRotateAngle(cube_r69, 0.0F, 0.4625F, 0.0F);
        this.cube_r69.cubeList.add(new ModelBox(cube_r69, 111, 9, -1.3F, -0.5F, -1.425F, 3, 1, 1, -0.006F, false));

        this.cube_r70 = new AdvancedModelRenderer(this);
        this.cube_r70.setRotationPoint(1.5129F, 0.0F, 0.3275F);
        this.sidespike15.addChild(cube_r70);
        this.setRotateAngle(cube_r70, 0.0F, 0.5934F, 0.0F);
        this.cube_r70.cubeList.add(new ModelBox(cube_r70, 109, 3, -3.75F, -0.5F, -1.0F, 4, 1, 1, -0.003F, false));

        this.cube_r71 = new AdvancedModelRenderer(this);
        this.cube_r71.setRotationPoint(3.5122F, 0.0F, 0.2752F);
        this.sidespike15.addChild(cube_r71);
        this.setRotateAngle(cube_r71, 0.0F, 0.0262F, 0.0F);
        this.cube_r71.cubeList.add(new ModelBox(cube_r71, 116, 55, -2.0F, -0.5F, -1.0F, 2, 1, 1, -0.003F, false));

        this.cube_r72 = new AdvancedModelRenderer(this);
        this.cube_r72.setRotationPoint(-0.3244F, 0.5F, -1.2391F);
        this.sidespike15.addChild(cube_r72);
        this.setRotateAngle(cube_r72, 0.0F, 0.3927F, 0.0F);
        this.cube_r72.cubeList.add(new ModelBox(cube_r72, 109, 0, -4.0F, -1.0F, 0.0F, 4, 1, 1, 0.0F, false));

        this.cube_r73 = new AdvancedModelRenderer(this);
        this.cube_r73.setRotationPoint(-2.3073F, 0.5F, -1.5001F);
        this.sidespike15.addChild(cube_r73);
        this.setRotateAngle(cube_r73, 0.0F, -0.1309F, 0.0F);
        this.cube_r73.cubeList.add(new ModelBox(cube_r73, 108, 78, 2.0F, -1.0F, 0.0F, 4, 1, 1, 0.0F, false));

        this.sidespike33 = new AdvancedModelRenderer(this);
        this.sidespike33.setRotationPoint(-2.6269F, 0.931F, 2.2654F);
        this.tail4.addChild(sidespike33);
        this.setRotateAngle(sidespike33, -0.1743F, 0.6281F, -0.115F);


        this.cube_r74 = new AdvancedModelRenderer(this);
        this.cube_r74.setRotationPoint(0.6429F, 0.0F, 1.4303F);
        this.sidespike33.addChild(cube_r74);
        this.setRotateAngle(cube_r74, 0.0F, -0.4625F, 0.0F);
        this.cube_r74.cubeList.add(new ModelBox(cube_r74, 111, 9, -1.7F, -0.5F, -1.425F, 3, 1, 1, -0.006F, true));

        this.cube_r75 = new AdvancedModelRenderer(this);
        this.cube_r75.setRotationPoint(-1.5129F, 0.0F, 0.3275F);
        this.sidespike33.addChild(cube_r75);
        this.setRotateAngle(cube_r75, 0.0F, -0.5934F, 0.0F);
        this.cube_r75.cubeList.add(new ModelBox(cube_r75, 109, 3, -0.25F, -0.5F, -1.0F, 4, 1, 1, -0.003F, true));

        this.cube_r76 = new AdvancedModelRenderer(this);
        this.cube_r76.setRotationPoint(-3.5122F, 0.0F, 0.2752F);
        this.sidespike33.addChild(cube_r76);
        this.setRotateAngle(cube_r76, 0.0F, -0.0262F, 0.0F);
        this.cube_r76.cubeList.add(new ModelBox(cube_r76, 116, 55, 0.0F, -0.5F, -1.0F, 2, 1, 1, -0.003F, true));

        this.cube_r77 = new AdvancedModelRenderer(this);
        this.cube_r77.setRotationPoint(0.3244F, 0.5F, -1.2391F);
        this.sidespike33.addChild(cube_r77);
        this.setRotateAngle(cube_r77, 0.0F, -0.3927F, 0.0F);
        this.cube_r77.cubeList.add(new ModelBox(cube_r77, 109, 0, 0.0F, -1.0F, 0.0F, 4, 1, 1, 0.0F, true));

        this.cube_r78 = new AdvancedModelRenderer(this);
        this.cube_r78.setRotationPoint(2.3073F, 0.5F, -1.5001F);
        this.sidespike33.addChild(cube_r78);
        this.setRotateAngle(cube_r78, 0.0F, 0.1309F, 0.0F);
        this.cube_r78.cubeList.add(new ModelBox(cube_r78, 108, 78, -6.0F, -1.0F, 0.0F, 4, 1, 1, 0.0F, true));

        this.sidespike16 = new AdvancedModelRenderer(this);
        this.sidespike16.setRotationPoint(2.008F, 0.9078F, 5.4346F);
        this.tail4.addChild(sidespike16);
        this.setRotateAngle(sidespike16, -0.0462F, -0.281F, 0.0967F);


        this.cube_r79 = new AdvancedModelRenderer(this);
        this.cube_r79.setRotationPoint(3.3499F, 0.0F, 0.1041F);
        this.sidespike16.addChild(cube_r79);
        this.setRotateAngle(cube_r79, 0.0F, 0.1876F, 0.0F);
        this.cube_r79.cubeList.add(new ModelBox(cube_r79, 106, 110, -2.875F, -0.5F, -0.8F, 3, 1, 1, -0.003F, false));

        this.cube_r80 = new AdvancedModelRenderer(this);
        this.cube_r80.setRotationPoint(-2.3073F, 0.5F, -1.5001F);
        this.sidespike16.addChild(cube_r80);
        this.setRotateAngle(cube_r80, 0.0F, -0.1309F, 0.0F);
        this.cube_r80.cubeList.add(new ModelBox(cube_r80, 74, 107, 2.0F, -1.0F, 0.0F, 4, 1, 1, 0.0F, false));

        this.sidespike34 = new AdvancedModelRenderer(this);
        this.sidespike34.setRotationPoint(-0.008F, 0.9078F, 5.4346F);
        this.tail4.addChild(sidespike34);
        this.setRotateAngle(sidespike34, -0.0462F, 0.281F, -0.0967F);


        this.cube_r81 = new AdvancedModelRenderer(this);
        this.cube_r81.setRotationPoint(-3.3499F, 0.0F, 0.1041F);
        this.sidespike34.addChild(cube_r81);
        this.setRotateAngle(cube_r81, 0.0F, -0.1876F, 0.0F);
        this.cube_r81.cubeList.add(new ModelBox(cube_r81, 106, 110, -0.125F, -0.5F, -0.8F, 3, 1, 1, -0.003F, true));

        this.cube_r82 = new AdvancedModelRenderer(this);
        this.cube_r82.setRotationPoint(2.3073F, 0.5F, -1.5001F);
        this.sidespike34.addChild(cube_r82);
        this.setRotateAngle(cube_r82, 0.0F, 0.1309F, 0.0F);
        this.cube_r82.cubeList.add(new ModelBox(cube_r82, 74, 107, -6.0F, -1.0F, 0.0F, 4, 1, 1, 0.0F, true));

        this.tail5 = new AdvancedModelRenderer(this);
        this.tail5.setRotationPoint(-0.5F, 0.0991F, 7.013F);
        this.tail4.addChild(tail5);
        this.setRotateAngle(tail5, 0.0873F, 0.0F, 0.0F);
        this.tail5.cubeList.add(new ModelBox(tail5, 0, 76, 0.5F, -0.275F, 0.0F, 2, 2, 9, 0.0F, false));

        this.cube_r83 = new AdvancedModelRenderer(this);
        this.cube_r83.setRotationPoint(0.925F, 0.109F, 2.9701F);
        this.tail5.addChild(cube_r83);
        this.setRotateAngle(cube_r83, 0.0F, 0.0F, -0.2182F);
        this.cube_r83.cubeList.add(new ModelBox(cube_r83, 84, 116, -0.5F, -0.5F, -1.0F, 1, 1, 2, 0.0F, true));

        this.cube_r84 = new AdvancedModelRenderer(this);
        this.cube_r84.setRotationPoint(2.075F, 0.109F, 2.9701F);
        this.tail5.addChild(cube_r84);
        this.setRotateAngle(cube_r84, 0.0F, 0.0F, 0.2182F);
        this.cube_r84.cubeList.add(new ModelBox(cube_r84, 84, 116, -0.5F, -0.5F, -1.0F, 1, 1, 2, 0.0F, false));

        this.sidespike17 = new AdvancedModelRenderer(this);
        this.sidespike17.setRotationPoint(1.3288F, 0.689F, 1.4102F);
        this.tail5.addChild(sidespike17);
        this.setRotateAngle(sidespike17, -0.1335F, -0.281F, 0.0967F);


        this.cube_r85 = new AdvancedModelRenderer(this);
        this.cube_r85.setRotationPoint(0.4101F, 0.0F, 0.7022F);
        this.sidespike17.addChild(cube_r85);
        this.setRotateAngle(cube_r85, 0.0F, 0.2007F, 0.0F);
        this.cube_r85.cubeList.add(new ModelBox(cube_r85, 111, 22, 0.125F, -0.5F, -0.8F, 3, 1, 1, -0.003F, false));

        this.cube_r86 = new AdvancedModelRenderer(this);
        this.cube_r86.setRotationPoint(-2.3073F, 0.5F, -1.5001F);
        this.sidespike17.addChild(cube_r86);
        this.setRotateAngle(cube_r86, 0.0F, -0.1309F, 0.0F);
        this.cube_r86.cubeList.add(new ModelBox(cube_r86, 111, 12, 3.0F, -1.0F, 0.0F, 3, 1, 1, 0.0F, false));

        this.sidespike35 = new AdvancedModelRenderer(this);
        this.sidespike35.setRotationPoint(1.6712F, 0.689F, 1.4102F);
        this.tail5.addChild(sidespike35);
        this.setRotateAngle(sidespike35, -0.1335F, 0.281F, -0.0967F);


        this.cube_r87 = new AdvancedModelRenderer(this);
        this.cube_r87.setRotationPoint(-0.4101F, 0.0F, 0.7022F);
        this.sidespike35.addChild(cube_r87);
        this.setRotateAngle(cube_r87, 0.0F, -0.2007F, 0.0F);
        this.cube_r87.cubeList.add(new ModelBox(cube_r87, 111, 22, -3.125F, -0.5F, -0.8F, 3, 1, 1, -0.003F, true));

        this.cube_r88 = new AdvancedModelRenderer(this);
        this.cube_r88.setRotationPoint(2.3073F, 0.5F, -1.5001F);
        this.sidespike35.addChild(cube_r88);
        this.setRotateAngle(cube_r88, 0.0F, 0.1309F, 0.0F);
        this.cube_r88.cubeList.add(new ModelBox(cube_r88, 111, 12, -6.0F, -1.0F, 0.0F, 3, 1, 1, 0.0F, true));

        this.sidespike18 = new AdvancedModelRenderer(this);
        this.sidespike18.setRotationPoint(0.4696F, 0.5068F, 4.2669F);
        this.tail5.addChild(sidespike18);
        this.setRotateAngle(sidespike18, -0.1335F, -0.281F, 0.0967F);


        this.cube_r89 = new AdvancedModelRenderer(this);
        this.cube_r89.setRotationPoint(-2.3073F, 0.5F, -1.5001F);
        this.sidespike18.addChild(cube_r89);
        this.setRotateAngle(cube_r89, 0.0F, -0.1309F, 0.0F);
        this.cube_r89.cubeList.add(new ModelBox(cube_r89, 116, 104, 4.0F, -1.0F, 0.0F, 2, 1, 1, 0.0F, false));

        this.sidespike36 = new AdvancedModelRenderer(this);
        this.sidespike36.setRotationPoint(2.5304F, 0.5068F, 4.2669F);
        this.tail5.addChild(sidespike36);
        this.setRotateAngle(sidespike36, -0.1335F, 0.281F, -0.0967F);


        this.cube_r90 = new AdvancedModelRenderer(this);
        this.cube_r90.setRotationPoint(2.3073F, 0.5F, -1.5001F);
        this.sidespike36.addChild(cube_r90);
        this.setRotateAngle(cube_r90, 0.0F, 0.1309F, 0.0F);
        this.cube_r90.cubeList.add(new ModelBox(cube_r90, 116, 104, -6.0F, -1.0F, 0.0F, 2, 1, 1, 0.0F, true));

        this.body = new AdvancedModelRenderer(this);
        this.body.setRotationPoint(0.0F, -0.171F, -0.1732F);
        this.root.addChild(body);


        this.cube_r91 = new AdvancedModelRenderer(this);
        this.cube_r91.setRotationPoint(-7.75F, 0.2351F, -12.5066F);
        this.body.addChild(cube_r91);
        this.setRotateAngle(cube_r91, 0.0F, 0.0F, -0.1745F);
        this.cube_r91.cubeList.add(new ModelBox(cube_r91, 119, 95, -0.5F, -0.3F, -1.0F, 1, 1, 1, 0.0F, true));
        this.cube_r91.cubeList.add(new ModelBox(cube_r91, 114, 85, -0.5F, -0.3F, 1.5F, 1, 1, 2, 0.0F, true));
        this.cube_r91.cubeList.add(new ModelBox(cube_r91, 119, 92, -0.5F, -0.3F, 5.0F, 1, 1, 1, 0.0F, true));

        this.cube_r92 = new AdvancedModelRenderer(this);
        this.cube_r92.setRotationPoint(-5.75F, 0.2851F, -13.0066F);
        this.body.addChild(cube_r92);
        this.setRotateAngle(cube_r92, 0.0873F, 0.0F, -0.1745F);
        this.cube_r92.cubeList.add(new ModelBox(cube_r92, 114, 81, -0.5F, -0.3F, -1.0F, 1, 1, 2, 0.0F, true));

        this.cube_r93 = new AdvancedModelRenderer(this);
        this.cube_r93.setRotationPoint(-4.75F, 0.2351F, -10.0066F);
        this.body.addChild(cube_r93);
        this.setRotateAngle(cube_r93, 0.0F, 0.0F, -0.1745F);
        this.cube_r93.cubeList.add(new ModelBox(cube_r93, 70, 114, -1.5F, -0.5F, -1.0F, 1, 1, 2, 0.0F, true));

        this.cube_r94 = new AdvancedModelRenderer(this);
        this.cube_r94.setRotationPoint(-6.0F, 0.1351F, -7.0066F);
        this.body.addChild(cube_r94);
        this.setRotateAngle(cube_r94, 0.0F, 0.0F, -0.1745F);
        this.cube_r94.cubeList.add(new ModelBox(cube_r94, 114, 72, -0.5F, -0.3F, -1.0F, 1, 1, 2, 0.0F, true));

        this.cube_r95 = new AdvancedModelRenderer(this);
        this.cube_r95.setRotationPoint(-7.7153F, 0.2321F, -4.0066F);
        this.body.addChild(cube_r95);
        this.setRotateAngle(cube_r95, 0.0452F, 0.2615F, 0.0117F);
        this.cube_r95.cubeList.add(new ModelBox(cube_r95, 119, 67, -0.5F, -0.5F, -0.5F, 1, 1, 1, 0.0F, true));

        this.cube_r96 = new AdvancedModelRenderer(this);
        this.cube_r96.setRotationPoint(-4.9653F, 0.2321F, -4.2566F);
        this.body.addChild(cube_r96);
        this.setRotateAngle(cube_r96, 0.0452F, -0.2615F, -0.0117F);
        this.cube_r96.cubeList.add(new ModelBox(cube_r96, 119, 64, -0.5F, -0.5F, -0.5F, 1, 1, 1, 0.0F, true));

        this.cube_r97 = new AdvancedModelRenderer(this);
        this.cube_r97.setRotationPoint(-2.2153F, 0.2321F, -3.5066F);
        this.body.addChild(cube_r97);
        this.setRotateAngle(cube_r97, 0.0447F, -0.218F, -0.0097F);
        this.cube_r97.cubeList.add(new ModelBox(cube_r97, 119, 61, -0.5F, -0.5F, -0.5F, 1, 1, 1, 0.0F, true));

        this.cube_r98 = new AdvancedModelRenderer(this);
        this.cube_r98.setRotationPoint(0.0347F, 0.2321F, -3.2566F);
        this.body.addChild(cube_r98);
        this.setRotateAngle(cube_r98, 0.0443F, 0.0F, 0.0F);
        this.cube_r98.cubeList.add(new ModelBox(cube_r98, 119, 76, -0.5F, -0.5F, -0.5F, 1, 1, 1, 0.0F, true));
        this.cube_r98.cubeList.add(new ModelBox(cube_r98, 119, 76, -0.5695F, -0.5F, -0.5F, 1, 1, 1, 0.0F, false));

        this.cube_r99 = new AdvancedModelRenderer(this);
        this.cube_r99.setRotationPoint(-1.0F, 0.1351F, -6.0066F);
        this.body.addChild(cube_r99);
        this.setRotateAngle(cube_r99, 0.0F, 0.0F, -0.1745F);
        this.cube_r99.cubeList.add(new ModelBox(cube_r99, 63, 114, -0.5F, -0.3F, -1.0F, 1, 1, 2, 0.0F, true));

        this.cube_r100 = new AdvancedModelRenderer(this);
        this.cube_r100.setRotationPoint(-1.0F, 0.2351F, -9.0066F);
        this.body.addChild(cube_r100);
        this.setRotateAngle(cube_r100, 0.0F, 0.0F, -0.1745F);
        this.cube_r100.cubeList.add(new ModelBox(cube_r100, 41, 114, -0.5F, -0.3F, -1.0F, 1, 1, 2, 0.0F, true));

        this.cube_r101 = new AdvancedModelRenderer(this);
        this.cube_r101.setRotationPoint(-1.0F, 0.2851F, -12.0066F);
        this.body.addChild(cube_r101);
        this.setRotateAngle(cube_r101, 0.0873F, 0.0F, -0.1745F);
        this.cube_r101.cubeList.add(new ModelBox(cube_r101, 34, 114, -0.5F, -0.3F, -1.0F, 1, 1, 2, 0.0F, true));

        this.cube_r102 = new AdvancedModelRenderer(this);
        this.cube_r102.setRotationPoint(7.7153F, 0.2321F, -4.0066F);
        this.body.addChild(cube_r102);
        this.setRotateAngle(cube_r102, 0.0452F, -0.2615F, -0.0117F);
        this.cube_r102.cubeList.add(new ModelBox(cube_r102, 119, 67, -0.5F, -0.5F, -0.5F, 1, 1, 1, 0.0F, false));

        this.cube_r103 = new AdvancedModelRenderer(this);
        this.cube_r103.setRotationPoint(4.9653F, 0.2321F, -4.2566F);
        this.body.addChild(cube_r103);
        this.setRotateAngle(cube_r103, 0.0452F, 0.2615F, 0.0117F);
        this.cube_r103.cubeList.add(new ModelBox(cube_r103, 119, 64, -0.5F, -0.5F, -0.5F, 1, 1, 1, 0.0F, false));

        this.cube_r104 = new AdvancedModelRenderer(this);
        this.cube_r104.setRotationPoint(2.2153F, 0.2321F, -3.5066F);
        this.body.addChild(cube_r104);
        this.setRotateAngle(cube_r104, 0.0447F, 0.218F, 0.0097F);
        this.cube_r104.cubeList.add(new ModelBox(cube_r104, 119, 61, -0.5F, -0.5F, -0.5F, 1, 1, 1, 0.0F, false));

        this.cube_r105 = new AdvancedModelRenderer(this);
        this.cube_r105.setRotationPoint(6.0F, 0.1351F, -7.0066F);
        this.body.addChild(cube_r105);
        this.setRotateAngle(cube_r105, 0.0F, 0.0F, 0.1745F);
        this.cube_r105.cubeList.add(new ModelBox(cube_r105, 114, 72, -0.5F, -0.3F, -1.0F, 1, 1, 2, 0.0F, false));

        this.cube_r106 = new AdvancedModelRenderer(this);
        this.cube_r106.setRotationPoint(1.0F, 0.1351F, -6.0066F);
        this.body.addChild(cube_r106);
        this.setRotateAngle(cube_r106, 0.0F, 0.0F, 0.1745F);
        this.cube_r106.cubeList.add(new ModelBox(cube_r106, 63, 114, -0.5F, -0.3F, -1.0F, 1, 1, 2, 0.0F, false));

        this.cube_r107 = new AdvancedModelRenderer(this);
        this.cube_r107.setRotationPoint(7.75F, 0.2351F, -12.5066F);
        this.body.addChild(cube_r107);
        this.setRotateAngle(cube_r107, 0.0F, 0.0F, 0.1745F);
        this.cube_r107.cubeList.add(new ModelBox(cube_r107, 119, 95, -0.5F, -0.3F, -1.0F, 1, 1, 1, 0.0F, false));
        this.cube_r107.cubeList.add(new ModelBox(cube_r107, 119, 92, -0.5F, -0.3F, 5.0F, 1, 1, 1, 0.0F, false));
        this.cube_r107.cubeList.add(new ModelBox(cube_r107, 114, 85, -0.5F, -0.3F, 1.5F, 1, 1, 2, 0.0F, false));

        this.cube_r108 = new AdvancedModelRenderer(this);
        this.cube_r108.setRotationPoint(4.75F, 0.2351F, -10.0066F);
        this.body.addChild(cube_r108);
        this.setRotateAngle(cube_r108, 0.0F, 0.0F, 0.1745F);
        this.cube_r108.cubeList.add(new ModelBox(cube_r108, 70, 114, 0.5F, -0.5F, -1.0F, 1, 1, 2, 0.0F, false));

        this.cube_r109 = new AdvancedModelRenderer(this);
        this.cube_r109.setRotationPoint(1.0F, 0.2351F, -9.0066F);
        this.body.addChild(cube_r109);
        this.setRotateAngle(cube_r109, 0.0F, 0.0F, 0.1745F);
        this.cube_r109.cubeList.add(new ModelBox(cube_r109, 41, 114, -0.5F, -0.3F, -1.0F, 1, 1, 2, 0.0F, false));

        this.cube_r110 = new AdvancedModelRenderer(this);
        this.cube_r110.setRotationPoint(5.75F, 0.2851F, -13.0066F);
        this.body.addChild(cube_r110);
        this.setRotateAngle(cube_r110, 0.0873F, 0.0F, 0.1745F);
        this.cube_r110.cubeList.add(new ModelBox(cube_r110, 114, 81, -0.5F, -0.3F, -1.0F, 1, 1, 2, 0.0F, false));

        this.cube_r111 = new AdvancedModelRenderer(this);
        this.cube_r111.setRotationPoint(1.0F, 0.2851F, -12.0066F);
        this.body.addChild(cube_r111);
        this.setRotateAngle(cube_r111, 0.0873F, 0.0F, 0.1745F);
        this.cube_r111.cubeList.add(new ModelBox(cube_r111, 34, 114, -0.5F, -0.3F, -1.0F, 1, 1, 2, 0.0F, false));

        this.cube_r112 = new AdvancedModelRenderer(this);
        this.cube_r112.setRotationPoint(0.0F, -0.2717F, 9.741F);
        this.body.addChild(cube_r112);
        this.setRotateAngle(cube_r112, 0.0436F, 0.0F, 0.0F);
        this.cube_r112.cubeList.add(new ModelBox(cube_r112, 14, 120, -9.75F, 0.275F, -14.225F, 1, 1, 1, 0.0F, true));
        this.cube_r112.cubeList.add(new ModelBox(cube_r112, 120, 6, -9.75F, 0.775F, -16.725F, 1, 1, 1, 0.0F, true));
        this.cube_r112.cubeList.add(new ModelBox(cube_r112, 14, 120, 8.75F, 0.275F, -14.225F, 1, 1, 1, 0.0F, false));
        this.cube_r112.cubeList.add(new ModelBox(cube_r112, 120, 6, 8.75F, 0.775F, -16.725F, 1, 1, 1, 0.0F, false));

        this.cube_r113 = new AdvancedModelRenderer(this);
        this.cube_r113.setRotationPoint(0.0F, 0.2283F, 0.991F);
        this.body.addChild(cube_r113);
        this.setRotateAngle(cube_r113, 0.0436F, 0.0F, 0.0F);
        this.cube_r113.cubeList.add(new ModelBox(cube_r113, 120, 12, -9.75F, 0.775F, -10.725F, 1, 1, 1, 0.0F, true));
        this.cube_r113.cubeList.add(new ModelBox(cube_r113, 120, 3, -9.75F, 1.425F, -15.475F, 1, 1, 1, 0.0F, true));
        this.cube_r113.cubeList.add(new ModelBox(cube_r113, 120, 9, -9.75F, 1.025F, -13.225F, 1, 1, 1, 0.0F, true));
        this.cube_r113.cubeList.add(new ModelBox(cube_r113, 120, 12, 8.75F, 0.775F, -10.725F, 1, 1, 1, 0.0F, false));
        this.cube_r113.cubeList.add(new ModelBox(cube_r113, 120, 9, 8.75F, 1.025F, -13.225F, 1, 1, 1, 0.0F, false));
        this.cube_r113.cubeList.add(new ModelBox(cube_r113, 120, 3, 8.75F, 1.425F, -15.475F, 1, 1, 1, 0.0F, false));

        this.cube_r114 = new AdvancedModelRenderer(this);
        this.cube_r114.setRotationPoint(-0.5F, 0.2283F, -0.009F);
        this.body.addChild(cube_r114);
        this.setRotateAngle(cube_r114, 0.0436F, 0.0F, 0.0F);
        this.cube_r114.cubeList.add(new ModelBox(cube_r114, 0, 0, -8.5F, -0.225F, -14.975F, 18, 12, 15, 0.01F, false));

        this.sidespike5 = new AdvancedModelRenderer(this);
        this.sidespike5.setRotationPoint(6.4858F, 5.7489F, -12.9438F);
        this.body.addChild(sidespike5);
        this.setRotateAngle(sidespike5, -0.0515F, -0.5203F, 0.1487F);


        this.cube_r115 = new AdvancedModelRenderer(this);
        this.cube_r115.setRotationPoint(4.1138F, 0.0F, -1.086F);
        this.sidespike5.addChild(cube_r115);
        this.setRotateAngle(cube_r115, 0.0F, 0.5061F, 0.0F);
        this.cube_r115.cubeList.add(new ModelBox(cube_r115, 30, 105, -2.0F, -0.5F, -2.0F, 2, 1, 3, -0.006F, false));

        this.cube_r116 = new AdvancedModelRenderer(this);
        this.cube_r116.setRotationPoint(8.0382F, 0.0F, -1.5911F);
        this.sidespike5.addChild(cube_r116);
        this.setRotateAngle(cube_r116, 0.0F, 0.3316F, 0.0F);
        this.cube_r116.cubeList.add(new ModelBox(cube_r116, 109, 101, -3.875F, -0.5F, -0.8F, 4, 1, 1, -0.003F, false));

        this.cube_r117 = new AdvancedModelRenderer(this);
        this.cube_r117.setRotationPoint(2.9343F, 0.5F, -3.1418F);
        this.sidespike5.addChild(cube_r117);
        this.setRotateAngle(cube_r117, 0.0F, 0.2618F, 0.0F);
        this.cube_r117.cubeList.add(new ModelBox(cube_r117, 33, 110, -2.0F, -1.0F, 0.0F, 2, 1, 2, 0.003F, false));

        this.cube_r118 = new AdvancedModelRenderer(this);
        this.cube_r118.setRotationPoint(2.9343F, 0.5F, -3.1918F);
        this.sidespike5.addChild(cube_r118);
        this.setRotateAngle(cube_r118, 0.0F, -0.1309F, 0.0F);
        this.cube_r118.cubeList.add(new ModelBox(cube_r118, 18, 113, 0.5F, -1.0F, 1.0F, 3, 1, 1, -0.01F, false));

        this.cube_r119 = new AdvancedModelRenderer(this);
        this.cube_r119.setRotationPoint(2.9343F, 0.5F, -3.1418F);
        this.sidespike5.addChild(cube_r119);
        this.setRotateAngle(cube_r119, 0.0F, -0.1309F, 0.0F);
        this.cube_r119.cubeList.add(new ModelBox(cube_r119, 99, 89, 0.0F, -1.0F, 0.0F, 6, 1, 1, 0.0F, false));

        this.sidespike23 = new AdvancedModelRenderer(this);
        this.sidespike23.setRotationPoint(-6.4858F, 5.7489F, -12.9438F);
        this.body.addChild(sidespike23);
        this.setRotateAngle(sidespike23, -0.0515F, 0.5203F, -0.1487F);


        this.cube_r120 = new AdvancedModelRenderer(this);
        this.cube_r120.setRotationPoint(-4.1138F, 0.0F, -1.086F);
        this.sidespike23.addChild(cube_r120);
        this.setRotateAngle(cube_r120, 0.0F, -0.5061F, 0.0F);
        this.cube_r120.cubeList.add(new ModelBox(cube_r120, 30, 105, 0.0F, -0.5F, -2.0F, 2, 1, 3, -0.006F, true));

        this.cube_r121 = new AdvancedModelRenderer(this);
        this.cube_r121.setRotationPoint(-8.0382F, 0.0F, -1.5911F);
        this.sidespike23.addChild(cube_r121);
        this.setRotateAngle(cube_r121, 0.0F, -0.3316F, 0.0F);
        this.cube_r121.cubeList.add(new ModelBox(cube_r121, 109, 101, -0.125F, -0.5F, -0.8F, 4, 1, 1, -0.003F, true));

        this.cube_r122 = new AdvancedModelRenderer(this);
        this.cube_r122.setRotationPoint(-2.9343F, 0.5F, -3.1418F);
        this.sidespike23.addChild(cube_r122);
        this.setRotateAngle(cube_r122, 0.0F, -0.2618F, 0.0F);
        this.cube_r122.cubeList.add(new ModelBox(cube_r122, 33, 110, 0.0F, -1.0F, 0.0F, 2, 1, 2, 0.003F, true));

        this.cube_r123 = new AdvancedModelRenderer(this);
        this.cube_r123.setRotationPoint(-2.9343F, 0.5F, -3.1918F);
        this.sidespike23.addChild(cube_r123);
        this.setRotateAngle(cube_r123, 0.0F, 0.1309F, 0.0F);
        this.cube_r123.cubeList.add(new ModelBox(cube_r123, 18, 113, -3.5F, -1.0F, 1.0F, 3, 1, 1, -0.01F, true));

        this.cube_r124 = new AdvancedModelRenderer(this);
        this.cube_r124.setRotationPoint(-2.9343F, 0.5F, -3.1418F);
        this.sidespike23.addChild(cube_r124);
        this.setRotateAngle(cube_r124, 0.0F, 0.1309F, 0.0F);
        this.cube_r124.cubeList.add(new ModelBox(cube_r124, 99, 89, -6.0F, -1.0F, 0.0F, 6, 1, 1, 0.0F, true));

        this.sidespike6 = new AdvancedModelRenderer(this);
        this.sidespike6.setRotationPoint(9.0385F, 5.249F, -8.6243F);
        this.body.addChild(sidespike6);
        this.setRotateAngle(sidespike6, 0.1911F, -0.5125F, 0.0993F);


        this.cube_r125 = new AdvancedModelRenderer(this);
        this.cube_r125.setRotationPoint(1.4598F, -0.3462F, -0.441F);
        this.sidespike6.addChild(cube_r125);
        this.setRotateAngle(cube_r125, 0.0F, 0.5061F, 0.0F);
        this.cube_r125.cubeList.add(new ModelBox(cube_r125, 41, 105, -2.0F, -0.5F, -2.0F, 2, 1, 3, -0.006F, false));

        this.cube_r126 = new AdvancedModelRenderer(this);
        this.cube_r126.setRotationPoint(5.3841F, -0.3462F, -0.9462F);
        this.sidespike6.addChild(cube_r126);
        this.setRotateAngle(cube_r126, 0.0F, 0.3316F, 0.0F);
        this.cube_r126.cubeList.add(new ModelBox(cube_r126, 0, 110, -3.875F, -0.5F, -0.8F, 4, 1, 1, -0.003F, false));

        this.cube_r127 = new AdvancedModelRenderer(this);
        this.cube_r127.setRotationPoint(0.2802F, 0.1538F, -2.4968F);
        this.sidespike6.addChild(cube_r127);
        this.setRotateAngle(cube_r127, 0.0F, 0.2618F, 0.0F);
        this.cube_r127.cubeList.add(new ModelBox(cube_r127, 42, 110, -2.0F, -1.0F, 0.0F, 2, 1, 2, 0.003F, false));

        this.cube_r128 = new AdvancedModelRenderer(this);
        this.cube_r128.setRotationPoint(0.2802F, 0.1538F, -2.5468F);
        this.sidespike6.addChild(cube_r128);
        this.setRotateAngle(cube_r128, 0.0F, -0.1309F, 0.0F);
        this.cube_r128.cubeList.add(new ModelBox(cube_r128, 88, 113, 0.5F, -1.0F, 1.0F, 3, 1, 1, -0.01F, false));

        this.cube_r129 = new AdvancedModelRenderer(this);
        this.cube_r129.setRotationPoint(0.2802F, 0.1538F, -2.4968F);
        this.sidespike6.addChild(cube_r129);
        this.setRotateAngle(cube_r129, 0.0F, -0.1309F, 0.0F);
        this.cube_r129.cubeList.add(new ModelBox(cube_r129, 64, 100, 0.0F, -1.0F, 0.0F, 6, 1, 1, 0.0F, false));

        this.sidespike24 = new AdvancedModelRenderer(this);
        this.sidespike24.setRotationPoint(-8.0385F, 5.249F, -8.6243F);
        this.body.addChild(sidespike24);
        this.setRotateAngle(sidespike24, 0.1911F, 0.5125F, -0.0993F);


        this.cube_r130 = new AdvancedModelRenderer(this);
        this.cube_r130.setRotationPoint(-2.3219F, -0.595F, -0.887F);
        this.sidespike24.addChild(cube_r130);
        this.setRotateAngle(cube_r130, 0.0F, -0.5061F, 0.0F);
        this.cube_r130.cubeList.add(new ModelBox(cube_r130, 41, 105, 0.0F, -0.5F, -2.0F, 2, 1, 3, -0.006F, true));

        this.cube_r131 = new AdvancedModelRenderer(this);
        this.cube_r131.setRotationPoint(-6.2462F, -0.595F, -1.3921F);
        this.sidespike24.addChild(cube_r131);
        this.setRotateAngle(cube_r131, 0.0F, -0.3316F, 0.0F);
        this.cube_r131.cubeList.add(new ModelBox(cube_r131, 0, 110, -0.125F, -0.5F, -0.8F, 4, 1, 1, -0.003F, true));

        this.cube_r132 = new AdvancedModelRenderer(this);
        this.cube_r132.setRotationPoint(-1.1423F, -0.095F, -2.9428F);
        this.sidespike24.addChild(cube_r132);
        this.setRotateAngle(cube_r132, 0.0F, -0.2618F, 0.0F);
        this.cube_r132.cubeList.add(new ModelBox(cube_r132, 42, 110, 0.0F, -1.0F, 0.0F, 2, 1, 2, 0.003F, true));

        this.cube_r133 = new AdvancedModelRenderer(this);
        this.cube_r133.setRotationPoint(-1.1423F, -0.095F, -2.9928F);
        this.sidespike24.addChild(cube_r133);
        this.setRotateAngle(cube_r133, 0.0F, 0.1309F, 0.0F);
        this.cube_r133.cubeList.add(new ModelBox(cube_r133, 88, 113, -3.5F, -1.0F, 1.0F, 3, 1, 1, -0.01F, true));

        this.cube_r134 = new AdvancedModelRenderer(this);
        this.cube_r134.setRotationPoint(-1.1423F, -0.095F, -2.9428F);
        this.sidespike24.addChild(cube_r134);
        this.setRotateAngle(cube_r134, 0.0F, 0.1309F, 0.0F);
        this.cube_r134.cubeList.add(new ModelBox(cube_r134, 64, 100, -6.0F, -1.0F, 0.0F, 6, 1, 1, 0.0F, true));

        this.sidespike7 = new AdvancedModelRenderer(this);
        this.sidespike7.setRotationPoint(8.1107F, 3.4989F, -5.5438F);
        this.body.addChild(sidespike7);
        this.setRotateAngle(sidespike7, 0.1231F, -0.5203F, 0.1487F);


        this.cube_r135 = new AdvancedModelRenderer(this);
        this.cube_r135.setRotationPoint(4.1138F, 0.0F, -1.086F);
        this.sidespike7.addChild(cube_r135);
        this.setRotateAngle(cube_r135, 0.0F, 0.5061F, 0.0F);
        this.cube_r135.cubeList.add(new ModelBox(cube_r135, 95, 92, -4.0F, -0.5F, -2.0F, 4, 1, 3, -0.006F, false));

        this.cube_r136 = new AdvancedModelRenderer(this);
        this.cube_r136.setRotationPoint(8.0382F, 0.0F, -1.5911F);
        this.sidespike7.addChild(cube_r136);
        this.setRotateAngle(cube_r136, 0.0F, 0.3316F, 0.0F);
        this.cube_r136.cubeList.add(new ModelBox(cube_r136, 96, 107, -3.875F, -0.5F, -0.8F, 4, 1, 1, -0.003F, false));

        this.cube_r137 = new AdvancedModelRenderer(this);
        this.cube_r137.setRotationPoint(2.9343F, 0.5F, -3.1418F);
        this.sidespike7.addChild(cube_r137);
        this.setRotateAngle(cube_r137, 0.0F, 0.2618F, 0.0F);
        this.cube_r137.cubeList.add(new ModelBox(cube_r137, 103, 47, -4.0F, -1.0F, 0.0F, 4, 1, 2, 0.003F, false));

        this.cube_r138 = new AdvancedModelRenderer(this);
        this.cube_r138.setRotationPoint(2.9343F, 0.5F, -3.1918F);
        this.sidespike7.addChild(cube_r138);
        this.setRotateAngle(cube_r138, 0.0F, -0.1309F, 0.0F);
        this.cube_r138.cubeList.add(new ModelBox(cube_r138, 0, 113, 0.5F, -1.0F, 1.0F, 3, 1, 1, -0.01F, false));

        this.cube_r139 = new AdvancedModelRenderer(this);
        this.cube_r139.setRotationPoint(2.9343F, 0.5F, -3.1418F);
        this.sidespike7.addChild(cube_r139);
        this.setRotateAngle(cube_r139, 0.0F, -0.1309F, 0.0F);
        this.cube_r139.cubeList.add(new ModelBox(cube_r139, 99, 86, 0.0F, -1.0F, 0.0F, 6, 1, 1, 0.0F, false));

        this.sidespike25 = new AdvancedModelRenderer(this);
        this.sidespike25.setRotationPoint(-8.1107F, 3.4989F, -5.5438F);
        this.body.addChild(sidespike25);
        this.setRotateAngle(sidespike25, 0.1231F, 0.5203F, -0.1487F);


        this.cube_r140 = new AdvancedModelRenderer(this);
        this.cube_r140.setRotationPoint(-4.1138F, 0.0F, -1.086F);
        this.sidespike25.addChild(cube_r140);
        this.setRotateAngle(cube_r140, 0.0F, -0.5061F, 0.0F);
        this.cube_r140.cubeList.add(new ModelBox(cube_r140, 95, 92, 0.0F, -0.5F, -2.0F, 4, 1, 3, -0.006F, true));

        this.cube_r141 = new AdvancedModelRenderer(this);
        this.cube_r141.setRotationPoint(-8.0382F, 0.0F, -1.5911F);
        this.sidespike25.addChild(cube_r141);
        this.setRotateAngle(cube_r141, 0.0F, -0.3316F, 0.0F);
        this.cube_r141.cubeList.add(new ModelBox(cube_r141, 96, 107, -0.125F, -0.5F, -0.8F, 4, 1, 1, -0.003F, true));

        this.cube_r142 = new AdvancedModelRenderer(this);
        this.cube_r142.setRotationPoint(-2.9343F, 0.5F, -3.1418F);
        this.sidespike25.addChild(cube_r142);
        this.setRotateAngle(cube_r142, 0.0F, -0.2618F, 0.0F);
        this.cube_r142.cubeList.add(new ModelBox(cube_r142, 103, 47, 0.0F, -1.0F, 0.0F, 4, 1, 2, 0.003F, true));

        this.cube_r143 = new AdvancedModelRenderer(this);
        this.cube_r143.setRotationPoint(-2.9343F, 0.5F, -3.1918F);
        this.sidespike25.addChild(cube_r143);
        this.setRotateAngle(cube_r143, 0.0F, 0.1309F, 0.0F);
        this.cube_r143.cubeList.add(new ModelBox(cube_r143, 0, 113, -3.5F, -1.0F, 1.0F, 3, 1, 1, -0.01F, true));

        this.cube_r144 = new AdvancedModelRenderer(this);
        this.cube_r144.setRotationPoint(-2.9343F, 0.5F, -3.1418F);
        this.sidespike25.addChild(cube_r144);
        this.setRotateAngle(cube_r144, 0.0F, 0.1309F, 0.0F);
        this.cube_r144.cubeList.add(new ModelBox(cube_r144, 99, 86, -6.0F, -1.0F, 0.0F, 6, 1, 1, 0.0F, true));

        this.sidespike8 = new AdvancedModelRenderer(this);
        this.sidespike8.setRotationPoint(7.6608F, 2.4739F, -2.0938F);
        this.body.addChild(sidespike8);
        this.setRotateAngle(sidespike8, -0.0564F, -0.6124F, 0.256F);


        this.cube_r145 = new AdvancedModelRenderer(this);
        this.cube_r145.setRotationPoint(4.1138F, 0.0F, -1.086F);
        this.sidespike8.addChild(cube_r145);
        this.setRotateAngle(cube_r145, 0.0F, 0.5061F, 0.0F);
        this.cube_r145.cubeList.add(new ModelBox(cube_r145, 94, 7, -5.0F, -0.5F, -2.0F, 5, 1, 3, -0.006F, false));

        this.cube_r146 = new AdvancedModelRenderer(this);
        this.cube_r146.setRotationPoint(5.2016F, 0.0F, -0.6144F);
        this.sidespike8.addChild(cube_r146);
        this.setRotateAngle(cube_r146, 0.0F, 0.3316F, 0.0F);
        this.cube_r146.cubeList.add(new ModelBox(cube_r146, 11, 106, -0.875F, -0.5F, -0.8F, 4, 1, 1, -0.003F, false));

        this.cube_r147 = new AdvancedModelRenderer(this);
        this.cube_r147.setRotationPoint(2.9343F, 0.5F, -3.1418F);
        this.sidespike8.addChild(cube_r147);
        this.setRotateAngle(cube_r147, 0.0F, 0.2618F, 0.0F);
        this.cube_r147.cubeList.add(new ModelBox(cube_r147, 103, 43, -4.0F, -1.0F, 0.0F, 4, 1, 2, 0.003F, false));

        this.cube_r148 = new AdvancedModelRenderer(this);
        this.cube_r148.setRotationPoint(2.8343F, 0.5F, -3.1918F);
        this.sidespike8.addChild(cube_r148);
        this.setRotateAngle(cube_r148, 0.0F, -0.1309F, 0.0F);
        this.cube_r148.cubeList.add(new ModelBox(cube_r148, 112, 28, 0.5F, -1.0F, 1.0F, 3, 1, 1, -0.01F, false));

        this.cube_r149 = new AdvancedModelRenderer(this);
        this.cube_r149.setRotationPoint(2.9343F, 0.5F, -3.1418F);
        this.sidespike8.addChild(cube_r149);
        this.setRotateAngle(cube_r149, 0.0F, -0.1309F, 0.0F);
        this.cube_r149.cubeList.add(new ModelBox(cube_r149, 99, 83, 0.0F, -1.0F, 0.0F, 6, 1, 1, 0.0F, false));

        this.sidespike26 = new AdvancedModelRenderer(this);
        this.sidespike26.setRotationPoint(-7.6608F, 2.4739F, -2.0938F);
        this.body.addChild(sidespike26);
        this.setRotateAngle(sidespike26, -0.0564F, 0.6124F, -0.256F);


        this.cube_r150 = new AdvancedModelRenderer(this);
        this.cube_r150.setRotationPoint(-4.1138F, 0.0F, -1.086F);
        this.sidespike26.addChild(cube_r150);
        this.setRotateAngle(cube_r150, 0.0F, -0.5061F, 0.0F);
        this.cube_r150.cubeList.add(new ModelBox(cube_r150, 94, 7, 0.0F, -0.5F, -2.0F, 5, 1, 3, -0.006F, true));

        this.cube_r151 = new AdvancedModelRenderer(this);
        this.cube_r151.setRotationPoint(-5.2016F, 0.0F, -0.6144F);
        this.sidespike26.addChild(cube_r151);
        this.setRotateAngle(cube_r151, 0.0F, -0.3316F, 0.0F);
        this.cube_r151.cubeList.add(new ModelBox(cube_r151, 11, 106, -3.125F, -0.5F, -0.8F, 4, 1, 1, -0.003F, true));

        this.cube_r152 = new AdvancedModelRenderer(this);
        this.cube_r152.setRotationPoint(-2.9343F, 0.5F, -3.1418F);
        this.sidespike26.addChild(cube_r152);
        this.setRotateAngle(cube_r152, 0.0F, -0.2618F, 0.0F);
        this.cube_r152.cubeList.add(new ModelBox(cube_r152, 103, 43, 0.0F, -1.0F, 0.0F, 4, 1, 2, 0.003F, true));

        this.cube_r153 = new AdvancedModelRenderer(this);
        this.cube_r153.setRotationPoint(-2.8343F, 0.5F, -3.1918F);
        this.sidespike26.addChild(cube_r153);
        this.setRotateAngle(cube_r153, 0.0F, 0.1309F, 0.0F);
        this.cube_r153.cubeList.add(new ModelBox(cube_r153, 112, 28, -3.5F, -1.0F, 1.0F, 3, 1, 1, -0.01F, true));

        this.cube_r154 = new AdvancedModelRenderer(this);
        this.cube_r154.setRotationPoint(-2.9343F, 0.5F, -3.1418F);
        this.sidespike26.addChild(cube_r154);
        this.setRotateAngle(cube_r154, 0.0F, 0.1309F, 0.0F);
        this.cube_r154.cubeList.add(new ModelBox(cube_r154, 99, 83, -6.0F, -1.0F, 0.0F, 6, 1, 1, 0.0F, true));

        this.spike3 = new AdvancedModelRenderer(this);
        this.spike3.setRotationPoint(3.8467F, -0.0679F, -13.2491F);
        this.body.addChild(spike3);
        this.setRotateAngle(spike3, -0.4774F, 0.0302F, 0.1283F);


        this.cube_r155 = new AdvancedModelRenderer(this);
        this.cube_r155.setRotationPoint(-0.2351F, 0.062F, 1.8043F);
        this.spike3.addChild(cube_r155);
        this.setRotateAngle(cube_r155, 0.6017F, -0.0916F, 0.1983F);
        this.cube_r155.cubeList.add(new ModelBox(cube_r155, 45, 118, -0.5F, -1.75F, -1.925F, 1, 2, 1, -0.003F, false));
        this.cube_r155.cubeList.add(new ModelBox(cube_r155, 72, 94, -0.5F, -3.0F, -1.0F, 1, 4, 1, -0.005F, false));

        this.cube_r156 = new AdvancedModelRenderer(this);
        this.cube_r156.setRotationPoint(-1.6754F, 0.4318F, 0.021F);
        this.spike3.addChild(cube_r156);
        this.setRotateAngle(cube_r156, -0.0091F, -0.0916F, 0.1983F);
        this.cube_r156.cubeList.add(new ModelBox(cube_r156, 51, 112, 1.0F, -4.05F, -1.0F, 1, 5, 1, 0.0F, false));

        this.spike8 = new AdvancedModelRenderer(this);
        this.spike8.setRotationPoint(-3.8467F, -0.0679F, -13.2491F);
        this.body.addChild(spike8);
        this.setRotateAngle(spike8, -0.4774F, -0.0302F, -0.1283F);


        this.cube_r157 = new AdvancedModelRenderer(this);
        this.cube_r157.setRotationPoint(0.2351F, 0.062F, 1.8043F);
        this.spike8.addChild(cube_r157);
        this.setRotateAngle(cube_r157, 0.6017F, 0.0916F, -0.1983F);
        this.cube_r157.cubeList.add(new ModelBox(cube_r157, 45, 118, -0.5F, -1.75F, -1.925F, 1, 2, 1, -0.003F, true));
        this.cube_r157.cubeList.add(new ModelBox(cube_r157, 72, 94, -0.5F, -3.0F, -1.0F, 1, 4, 1, -0.005F, true));

        this.cube_r158 = new AdvancedModelRenderer(this);
        this.cube_r158.setRotationPoint(1.6754F, 0.4318F, 0.021F);
        this.spike8.addChild(cube_r158);
        this.setRotateAngle(cube_r158, -0.0091F, 0.0916F, -0.1983F);
        this.cube_r158.cubeList.add(new ModelBox(cube_r158, 51, 112, -2.0F, -4.05F, -1.0F, 1, 5, 1, 0.0F, true));

        this.spike4 = new AdvancedModelRenderer(this);
        this.spike4.setRotationPoint(3.8467F, -0.0679F, -9.4991F);
        this.body.addChild(spike4);
        this.setRotateAngle(spike4, -0.521F, 0.0302F, 0.1283F);


        this.cube_r159 = new AdvancedModelRenderer(this);
        this.cube_r159.setRotationPoint(-0.2351F, 0.062F, 1.8043F);
        this.spike4.addChild(cube_r159);
        this.setRotateAngle(cube_r159, 0.6017F, -0.0916F, 0.1983F);
        this.cube_r159.cubeList.add(new ModelBox(cube_r159, 40, 118, -0.5F, -1.75F, -1.925F, 1, 2, 1, -0.003F, false));

        this.cube_r160 = new AdvancedModelRenderer(this);
        this.cube_r160.setRotationPoint(-0.2351F, 0.062F, 1.8043F);
        this.spike4.addChild(cube_r160);
        this.setRotateAngle(cube_r160, 0.6454F, -0.0916F, 0.1983F);
        this.cube_r160.cubeList.add(new ModelBox(cube_r160, 96, 117, -0.5F, -3.0F, -1.0F, 1, 4, 1, -0.005F, false));

        this.cube_r161 = new AdvancedModelRenderer(this);
        this.cube_r161.setRotationPoint(-1.6754F, 0.4318F, 0.021F);
        this.spike4.addChild(cube_r161);
        this.setRotateAngle(cube_r161, -0.0091F, -0.0916F, 0.1983F);
        this.cube_r161.cubeList.add(new ModelBox(cube_r161, 91, 116, 1.0F, -3.05F, -1.0F, 1, 4, 1, 0.0F, false));

        this.spike9 = new AdvancedModelRenderer(this);
        this.spike9.setRotationPoint(-3.8467F, -0.0679F, -9.4991F);
        this.body.addChild(spike9);
        this.setRotateAngle(spike9, -0.521F, -0.0302F, -0.1283F);


        this.cube_r162 = new AdvancedModelRenderer(this);
        this.cube_r162.setRotationPoint(0.2351F, 0.062F, 1.8043F);
        this.spike9.addChild(cube_r162);
        this.setRotateAngle(cube_r162, 0.6017F, 0.0916F, -0.1983F);
        this.cube_r162.cubeList.add(new ModelBox(cube_r162, 40, 118, -0.5F, -1.75F, -1.925F, 1, 2, 1, -0.003F, true));

        this.cube_r163 = new AdvancedModelRenderer(this);
        this.cube_r163.setRotationPoint(0.2351F, 0.062F, 1.8043F);
        this.spike9.addChild(cube_r163);
        this.setRotateAngle(cube_r163, 0.6454F, 0.0916F, -0.1983F);
        this.cube_r163.cubeList.add(new ModelBox(cube_r163, 96, 117, -0.5F, -3.0F, -1.0F, 1, 4, 1, -0.005F, true));

        this.cube_r164 = new AdvancedModelRenderer(this);
        this.cube_r164.setRotationPoint(1.6754F, 0.4318F, 0.021F);
        this.spike9.addChild(cube_r164);
        this.setRotateAngle(cube_r164, -0.0091F, 0.0916F, -0.1983F);
        this.cube_r164.cubeList.add(new ModelBox(cube_r164, 91, 116, -2.0F, -3.05F, -1.0F, 1, 4, 1, 0.0F, true));

        this.spike5 = new AdvancedModelRenderer(this);
        this.spike5.setRotationPoint(3.3967F, 0.9321F, -6.3491F);
        this.body.addChild(spike5);
        this.setRotateAngle(spike5, -0.3356F, -0.2454F, 0.1341F);


        this.cube_r165 = new AdvancedModelRenderer(this);
        this.cube_r165.setRotationPoint(-0.2351F, 0.062F, 1.8043F);
        this.spike5.addChild(cube_r165);
        this.setRotateAngle(cube_r165, 0.6454F, -0.0916F, 0.1983F);
        this.cube_r165.cubeList.add(new ModelBox(cube_r165, 118, 39, -0.5F, -2.725F, -1.0F, 1, 2, 1, -0.005F, false));

        this.cube_r166 = new AdvancedModelRenderer(this);
        this.cube_r166.setRotationPoint(-1.6754F, 0.4318F, 0.021F);
        this.spike5.addChild(cube_r166);
        this.setRotateAngle(cube_r166, -0.0091F, -0.0916F, 0.1983F);
        this.cube_r166.cubeList.add(new ModelBox(cube_r166, 25, 118, 1.0F, -3.05F, -1.0F, 1, 3, 1, 0.0F, false));

        this.spike10 = new AdvancedModelRenderer(this);
        this.spike10.setRotationPoint(-3.3967F, 0.9321F, -6.3491F);
        this.body.addChild(spike10);
        this.setRotateAngle(spike10, -0.3356F, 0.2454F, -0.1341F);


        this.cube_r167 = new AdvancedModelRenderer(this);
        this.cube_r167.setRotationPoint(0.2351F, 0.062F, 1.8043F);
        this.spike10.addChild(cube_r167);
        this.setRotateAngle(cube_r167, 0.6454F, 0.0916F, -0.1983F);
        this.cube_r167.cubeList.add(new ModelBox(cube_r167, 118, 39, -0.5F, -2.725F, -1.0F, 1, 2, 1, -0.005F, true));

        this.cube_r168 = new AdvancedModelRenderer(this);
        this.cube_r168.setRotationPoint(1.6754F, 0.4318F, 0.021F);
        this.spike10.addChild(cube_r168);
        this.setRotateAngle(cube_r168, -0.0091F, 0.0916F, -0.1983F);
        this.cube_r168.cubeList.add(new ModelBox(cube_r168, 25, 118, -2.0F, -3.05F, -1.0F, 1, 3, 1, 0.0F, true));

        this.body2 = new AdvancedModelRenderer(this);
        this.body2.setRotationPoint(0.0F, 1.0036F, -14.7062F);
        this.body.addChild(body2);


        this.cube_r169 = new AdvancedModelRenderer(this);
        this.cube_r169.setRotationPoint(-0.5F, -0.248F, -0.1496F);
        this.body2.addChild(cube_r169);
        this.setRotateAngle(cube_r169, 0.3491F, 0.0F, 0.0F);
        this.cube_r169.cubeList.add(new ModelBox(cube_r169, 0, 44, -6.5F, 0.025F, -6.0F, 14, 10, 6, 0.0F, false));

        this.cube_r170 = new AdvancedModelRenderer(this);
        this.cube_r170.setRotationPoint(-5.75F, 1.4994F, -4.0193F);
        this.body2.addChild(cube_r170);
        this.setRotateAngle(cube_r170, 0.4272F, 0.0916F, -0.1983F);
        this.cube_r170.cubeList.add(new ModelBox(cube_r170, 18, 116, -0.5F, -0.6F, -1.0F, 1, 1, 2, 0.0F, true));

        this.cube_r171 = new AdvancedModelRenderer(this);
        this.cube_r171.setRotationPoint(-5.75F, 0.2315F, -1.3004F);
        this.body2.addChild(cube_r171);
        this.setRotateAngle(cube_r171, 0.211F, 0.056F, -0.2559F);
        this.cube_r171.cubeList.add(new ModelBox(cube_r171, 0, 116, -0.5F, -0.3F, -1.0F, 1, 1, 2, 0.0F, true));

        this.cube_r172 = new AdvancedModelRenderer(this);
        this.cube_r172.setRotationPoint(-1.0F, 0.2315F, -1.3004F);
        this.body2.addChild(cube_r172);
        this.setRotateAngle(cube_r172, 0.211F, 0.056F, -0.2559F);
        this.cube_r172.cubeList.add(new ModelBox(cube_r172, 114, 31, -0.5F, -0.3F, -1.0F, 1, 1, 2, 0.0F, true));

        this.cube_r173 = new AdvancedModelRenderer(this);
        this.cube_r173.setRotationPoint(-1.0F, 1.4994F, -4.0193F);
        this.body2.addChild(cube_r173);
        this.setRotateAngle(cube_r173, 0.4272F, 0.0916F, -0.1983F);
        this.cube_r173.cubeList.add(new ModelBox(cube_r173, 27, 114, -0.5F, -0.6F, -1.0F, 1, 1, 2, 0.0F, true));

        this.cube_r174 = new AdvancedModelRenderer(this);
        this.cube_r174.setRotationPoint(5.75F, 0.2315F, -1.3004F);
        this.body2.addChild(cube_r174);
        this.setRotateAngle(cube_r174, 0.211F, -0.056F, 0.2559F);
        this.cube_r174.cubeList.add(new ModelBox(cube_r174, 0, 116, -0.5F, -0.3F, -1.0F, 1, 1, 2, 0.0F, false));

        this.cube_r175 = new AdvancedModelRenderer(this);
        this.cube_r175.setRotationPoint(1.0F, 0.2315F, -1.3004F);
        this.body2.addChild(cube_r175);
        this.setRotateAngle(cube_r175, 0.211F, -0.056F, 0.2559F);
        this.cube_r175.cubeList.add(new ModelBox(cube_r175, 114, 31, -0.5F, -0.3F, -1.0F, 1, 1, 2, 0.0F, false));

        this.cube_r176 = new AdvancedModelRenderer(this);
        this.cube_r176.setRotationPoint(5.75F, 1.4994F, -4.0193F);
        this.body2.addChild(cube_r176);
        this.setRotateAngle(cube_r176, 0.4272F, -0.0916F, 0.1983F);
        this.cube_r176.cubeList.add(new ModelBox(cube_r176, 18, 116, -0.5F, -0.6F, -1.0F, 1, 1, 2, 0.0F, false));

        this.cube_r177 = new AdvancedModelRenderer(this);
        this.cube_r177.setRotationPoint(1.0F, 1.4994F, -4.0193F);
        this.body2.addChild(cube_r177);
        this.setRotateAngle(cube_r177, 0.4272F, -0.0916F, 0.1983F);
        this.cube_r177.cubeList.add(new ModelBox(cube_r177, 27, 114, -0.5F, -0.6F, -1.0F, 1, 1, 2, 0.0F, false));

        this.cube_r178 = new AdvancedModelRenderer(this);
        this.cube_r178.setRotationPoint(-9.0F, 1.3262F, -3.2042F);
        this.body2.addChild(cube_r178);
        this.setRotateAngle(cube_r178, 0.3491F, 0.0F, 0.0F);
        this.cube_r178.cubeList.add(new ModelBox(cube_r178, 19, 120, 1.25F, 0.95F, 1.0F, 1, 1, 1, 0.0F, true));
        this.cube_r178.cubeList.add(new ModelBox(cube_r178, 7, 117, 1.5F, 0.75F, -2.0F, 1, 1, 2, 0.0F, true));
        this.cube_r178.cubeList.add(new ModelBox(cube_r178, 19, 120, 15.75F, 0.95F, 1.0F, 1, 1, 1, 0.0F, false));
        this.cube_r178.cubeList.add(new ModelBox(cube_r178, 7, 117, 15.5F, 0.75F, -2.0F, 1, 1, 2, 0.0F, false));

        this.sidespike4 = new AdvancedModelRenderer(this);
        this.sidespike4.setRotationPoint(7.4108F, 5.0953F, -1.9376F);
        this.body2.addChild(sidespike4);
        this.setRotateAngle(sidespike4, -0.0475F, -0.346F, 0.1392F);


        this.cube_r179 = new AdvancedModelRenderer(this);
        this.cube_r179.setRotationPoint(4.1138F, 0.0F, -1.086F);
        this.sidespike4.addChild(cube_r179);
        this.setRotateAngle(cube_r179, 0.0F, 0.5061F, 0.0F);
        this.cube_r179.cubeList.add(new ModelBox(cube_r179, 91, 78, -5.0F, -0.5F, -2.0F, 5, 1, 3, -0.006F, false));

        this.cube_r180 = new AdvancedModelRenderer(this);
        this.cube_r180.setRotationPoint(8.0382F, 0.0F, -1.5911F);
        this.sidespike4.addChild(cube_r180);
        this.setRotateAngle(cube_r180, 0.0F, 0.3316F, 0.0F);
        this.cube_r180.cubeList.add(new ModelBox(cube_r180, 85, 107, -3.875F, -0.5F, -0.8F, 4, 1, 1, -0.003F, false));

        this.cube_r181 = new AdvancedModelRenderer(this);
        this.cube_r181.setRotationPoint(2.9343F, 0.5F, -3.1418F);
        this.sidespike4.addChild(cube_r181);
        this.setRotateAngle(cube_r181, 0.0F, 0.2618F, 0.0F);
        this.cube_r181.cubeList.add(new ModelBox(cube_r181, 95, 97, -5.0F, -1.0F, 0.0F, 5, 1, 2, 0.003F, false));

        this.cube_r182 = new AdvancedModelRenderer(this);
        this.cube_r182.setRotationPoint(2.9343F, 0.5F, -3.2418F);
        this.sidespike4.addChild(cube_r182);
        this.setRotateAngle(cube_r182, 0.0F, -0.1309F, 0.0F);
        this.cube_r182.cubeList.add(new ModelBox(cube_r182, 111, 6, 0.5F, -1.0F, 1.0F, 3, 1, 1, -0.01F, false));

        this.cube_r183 = new AdvancedModelRenderer(this);
        this.cube_r183.setRotationPoint(2.9343F, 0.5F, -3.1418F);
        this.sidespike4.addChild(cube_r183);
        this.setRotateAngle(cube_r183, 0.0F, -0.1309F, 0.0F);
        this.cube_r183.cubeList.add(new ModelBox(cube_r183, 79, 100, 0.0F, -1.0F, 0.0F, 6, 1, 1, 0.0F, false));

        this.sidespike22 = new AdvancedModelRenderer(this);
        this.sidespike22.setRotationPoint(-7.4108F, 5.0953F, -1.9376F);
        this.body2.addChild(sidespike22);
        this.setRotateAngle(sidespike22, -0.0475F, 0.346F, -0.1392F);


        this.cube_r184 = new AdvancedModelRenderer(this);
        this.cube_r184.setRotationPoint(-4.1138F, 0.0F, -1.086F);
        this.sidespike22.addChild(cube_r184);
        this.setRotateAngle(cube_r184, 0.0F, -0.5061F, 0.0F);
        this.cube_r184.cubeList.add(new ModelBox(cube_r184, 91, 78, 0.0F, -0.5F, -2.0F, 5, 1, 3, -0.006F, true));

        this.cube_r185 = new AdvancedModelRenderer(this);
        this.cube_r185.setRotationPoint(-8.0382F, 0.0F, -1.5911F);
        this.sidespike22.addChild(cube_r185);
        this.setRotateAngle(cube_r185, 0.0F, -0.3316F, 0.0F);
        this.cube_r185.cubeList.add(new ModelBox(cube_r185, 85, 107, -0.125F, -0.5F, -0.8F, 4, 1, 1, -0.003F, true));

        this.cube_r186 = new AdvancedModelRenderer(this);
        this.cube_r186.setRotationPoint(-2.9343F, 0.5F, -3.1418F);
        this.sidespike22.addChild(cube_r186);
        this.setRotateAngle(cube_r186, 0.0F, -0.2618F, 0.0F);
        this.cube_r186.cubeList.add(new ModelBox(cube_r186, 95, 97, 0.0F, -1.0F, 0.0F, 5, 1, 2, 0.003F, true));

        this.cube_r187 = new AdvancedModelRenderer(this);
        this.cube_r187.setRotationPoint(-2.9343F, 0.5F, -3.2418F);
        this.sidespike22.addChild(cube_r187);
        this.setRotateAngle(cube_r187, 0.0F, 0.1309F, 0.0F);
        this.cube_r187.cubeList.add(new ModelBox(cube_r187, 111, 6, -3.5F, -1.0F, 1.0F, 3, 1, 1, -0.01F, true));

        this.cube_r188 = new AdvancedModelRenderer(this);
        this.cube_r188.setRotationPoint(-2.9343F, 0.5F, -3.1418F);
        this.sidespike22.addChild(cube_r188);
        this.setRotateAngle(cube_r188, 0.0F, 0.1309F, 0.0F);
        this.cube_r188.cubeList.add(new ModelBox(cube_r188, 79, 100, -6.0F, -1.0F, 0.0F, 6, 1, 1, 0.0F, true));

        this.spike = new AdvancedModelRenderer(this);
        this.spike.setRotationPoint(3.921F, 1.2315F, -4.0913F);
        this.body2.addChild(spike);
        this.setRotateAngle(spike, -0.1038F, 0.1274F, 0.2003F);


        this.cube_r189 = new AdvancedModelRenderer(this);
        this.cube_r189.setRotationPoint(0.1912F, -1.284F, 0.1768F);
        this.spike.addChild(cube_r189);
        this.setRotateAngle(cube_r189, 0.6017F, -0.0916F, 0.1983F);
        this.cube_r189.cubeList.add(new ModelBox(cube_r189, 118, 18, -0.9586F, 0.1586F, -1.1207F, 1, 2, 1, -0.005F, false));

        this.cube_r190 = new AdvancedModelRenderer(this);
        this.cube_r190.setRotationPoint(-1.6754F, 0.4319F, 0.021F);
        this.spike.addChild(cube_r190);
        this.setRotateAngle(cube_r190, -0.0091F, -0.0916F, 0.1983F);
        this.cube_r190.cubeList.add(new ModelBox(cube_r190, 15, 99, 0.5414F, -1.8508F, -1.0079F, 1, 2, 1, 0.0F, false));

        this.spike6 = new AdvancedModelRenderer(this);
        this.spike6.setRotationPoint(-3.921F, 1.2315F, -4.0913F);
        this.body2.addChild(spike6);
        this.setRotateAngle(spike6, -0.1038F, -0.1274F, -0.2003F);


        this.cube_r191 = new AdvancedModelRenderer(this);
        this.cube_r191.setRotationPoint(-0.1912F, -1.284F, 0.1768F);
        this.spike6.addChild(cube_r191);
        this.setRotateAngle(cube_r191, 0.6017F, 0.0916F, -0.1983F);
        this.cube_r191.cubeList.add(new ModelBox(cube_r191, 118, 18, -0.0414F, 0.1586F, -1.1207F, 1, 2, 1, -0.005F, true));

        this.cube_r192 = new AdvancedModelRenderer(this);
        this.cube_r192.setRotationPoint(1.6754F, 0.4319F, 0.021F);
        this.spike6.addChild(cube_r192);
        this.setRotateAngle(cube_r192, -0.0091F, 0.0916F, -0.1983F);
        this.cube_r192.cubeList.add(new ModelBox(cube_r192, 15, 99, -1.5414F, -1.8508F, -1.0079F, 1, 2, 1, 0.0F, true));

        this.spike2 = new AdvancedModelRenderer(this);
        this.spike2.setRotationPoint(3.9254F, 0.5425F, -1.6904F);
        this.body2.addChild(spike2);
        this.setRotateAngle(spike2, -0.3474F, 0.0153F, 0.0873F);


        this.cube_r193 = new AdvancedModelRenderer(this);
        this.cube_r193.setRotationPoint(0.1912F, -1.284F, 0.1768F);
        this.spike2.addChild(cube_r193);
        this.setRotateAngle(cube_r193, 0.6017F, -0.0916F, 0.1983F);
        this.cube_r193.cubeList.add(new ModelBox(cube_r193, 30, 118, -0.977F, 0.1452F, -1.0373F, 1, 2, 1, -0.005F, false));

        this.cube_r194 = new AdvancedModelRenderer(this);
        this.cube_r194.setRotationPoint(-1.6754F, 0.4319F, 0.021F);
        this.spike2.addChild(cube_r194);
        this.setRotateAngle(cube_r194, -0.0091F, -0.0916F, 0.1983F);
        this.cube_r194.cubeList.add(new ModelBox(cube_r194, 108, 117, 0.523F, -2.9096F, -0.9472F, 1, 3, 1, 0.0F, false));

        this.spike7 = new AdvancedModelRenderer(this);
        this.spike7.setRotationPoint(-3.9254F, 0.5425F, -1.6904F);
        this.body2.addChild(spike7);
        this.setRotateAngle(spike7, -0.3474F, -0.0153F, -0.0873F);


        this.cube_r195 = new AdvancedModelRenderer(this);
        this.cube_r195.setRotationPoint(-0.1912F, -1.284F, 0.1768F);
        this.spike7.addChild(cube_r195);
        this.setRotateAngle(cube_r195, 0.6017F, 0.0916F, -0.1983F);
        this.cube_r195.cubeList.add(new ModelBox(cube_r195, 30, 118, -0.023F, 0.1452F, -1.0373F, 1, 2, 1, -0.005F, true));

        this.cube_r196 = new AdvancedModelRenderer(this);
        this.cube_r196.setRotationPoint(1.6754F, 0.4319F, 0.021F);
        this.spike7.addChild(cube_r196);
        this.setRotateAngle(cube_r196, -0.0091F, 0.0916F, -0.1983F);
        this.cube_r196.cubeList.add(new ModelBox(cube_r196, 108, 117, -1.523F, -2.9096F, -0.9472F, 1, 3, 1, 0.0F, true));

        this.leftArm = new AdvancedModelRenderer(this);
        this.leftArm.setRotationPoint(7.0F, 9.752F, -1.3496F);
        this.body2.addChild(leftArm);
        this.setRotateAngle(leftArm, 0.9163F, 0.0F, 0.0F);
        this.leftArm.cubeList.add(new ModelBox(leftArm, 23, 77, -2.5F, -1.0F, -1.0F, 5, 8, 4, 0.0F, false));

        this.leftArm2 = new AdvancedModelRenderer(this);
        this.leftArm2.setRotationPoint(0.0F, 6.7687F, 1.7626F);
        this.leftArm.addChild(leftArm2);
        this.setRotateAngle(leftArm2, -1.2217F, 0.0F, 0.0F);
        this.leftArm2.cubeList.add(new ModelBox(leftArm2, 20, 89, -2.0F, -0.5F, -3.25F, 4, 9, 4, 0.0F, false));

        this.leftArm3 = new AdvancedModelRenderer(this);
        this.leftArm3.setRotationPoint(0.0F, 7.9596F, -2.037F);
        this.leftArm2.addChild(leftArm3);
        this.setRotateAngle(leftArm3, 0.3054F, 0.0F, 0.0F);
        this.leftArm3.cubeList.add(new ModelBox(leftArm3, 0, 88, -2.5F, 0.0F, -2.5F, 5, 2, 5, 0.0F, false));

        this.rightArm = new AdvancedModelRenderer(this);
        this.rightArm.setRotationPoint(-7.0F, 9.752F, -1.3496F);
        this.body2.addChild(rightArm);
        this.setRotateAngle(rightArm, 0.9163F, 0.0F, 0.0F);
        this.rightArm.cubeList.add(new ModelBox(rightArm, 23, 77, -2.5F, -1.0F, -1.0F, 5, 8, 4, 0.0F, true));

        this.rightArm2 = new AdvancedModelRenderer(this);
        this.rightArm2.setRotationPoint(0.0F, 6.7687F, 1.7626F);
        this.rightArm.addChild(rightArm2);
        this.setRotateAngle(rightArm2, -1.2217F, 0.0F, 0.0F);
        this.rightArm2.cubeList.add(new ModelBox(rightArm2, 20, 89, -2.0F, -0.5F, -3.25F, 4, 9, 4, 0.0F, true));

        this.rightArm3 = new AdvancedModelRenderer(this);
        this.rightArm3.setRotationPoint(0.0F, 7.9596F, -2.037F);
        this.rightArm2.addChild(rightArm3);
        this.setRotateAngle(rightArm3, 0.3054F, 0.0F, 0.0F);
        this.rightArm3.cubeList.add(new ModelBox(rightArm3, 0, 88, -2.5F, 0.0F, -2.5F, 5, 2, 5, 0.0F, true));

        this.neck = new AdvancedModelRenderer(this);
        this.neck.setRotationPoint(0.0F, 2.9944F, -4.331F);
        this.body2.addChild(neck);
        this.setRotateAngle(neck, 0.1745F, 0.0F, 0.0F);
        this.neck.cubeList.add(new ModelBox(neck, 67, 0, -3.0F, -1.2004F, -5.9424F, 6, 5, 7, 0.0F, false));
        this.neck.cubeList.add(new ModelBox(neck, 119, 58, 0.5F, -1.4491F, -5.3836F, 1, 1, 1, 0.0F, false));
        this.neck.cubeList.add(new ModelBox(neck, 119, 58, -1.5F, -1.4491F, -5.3836F, 1, 1, 1, 0.0F, true));

        this.cube_r197 = new AdvancedModelRenderer(this);
        this.cube_r197.setRotationPoint(-2.75F, -0.9491F, -2.3836F);
        this.neck.addChild(cube_r197);
        this.setRotateAngle(cube_r197, 0.0F, 0.0F, -0.6109F);
        this.cube_r197.cubeList.add(new ModelBox(cube_r197, 35, 118, -0.5F, -1.75F, -0.5F, 1, 2, 1, 0.0F, true));

        this.cube_r198 = new AdvancedModelRenderer(this);
        this.cube_r198.setRotationPoint(-1.75F, -0.9491F, -2.6336F);
        this.neck.addChild(cube_r198);
        this.setRotateAngle(cube_r198, 0.0873F, 0.0F, 0.0F);
        this.cube_r198.cubeList.add(new ModelBox(cube_r198, 111, 113, 0.25F, -0.5F, -1.0F, 1, 1, 2, 0.0F, true));
        this.cube_r198.cubeList.add(new ModelBox(cube_r198, 111, 113, 2.25F, -0.5F, -1.0F, 1, 1, 2, 0.0F, false));

        this.cube_r199 = new AdvancedModelRenderer(this);
        this.cube_r199.setRotationPoint(-2.75F, -0.9491F, -4.8836F);
        this.neck.addChild(cube_r199);
        this.setRotateAngle(cube_r199, 0.0F, 0.0F, -0.7854F);
        this.cube_r199.cubeList.add(new ModelBox(cube_r199, 120, 0, -0.5F, -0.75F, 0.0F, 1, 1, 1, 0.0F, true));

        this.cube_r200 = new AdvancedModelRenderer(this);
        this.cube_r200.setRotationPoint(2.75F, -0.9491F, -2.3836F);
        this.neck.addChild(cube_r200);
        this.setRotateAngle(cube_r200, 0.0F, 0.0F, 0.6109F);
        this.cube_r200.cubeList.add(new ModelBox(cube_r200, 35, 118, -0.5F, -1.75F, -0.5F, 1, 2, 1, 0.0F, false));

        this.cube_r201 = new AdvancedModelRenderer(this);
        this.cube_r201.setRotationPoint(2.75F, -0.9491F, -4.8836F);
        this.neck.addChild(cube_r201);
        this.setRotateAngle(cube_r201, 0.0F, 0.0F, 0.7854F);
        this.cube_r201.cubeList.add(new ModelBox(cube_r201, 120, 0, -0.5F, -0.75F, 0.0F, 1, 1, 1, 0.0F, false));

        this.cube_r202 = new AdvancedModelRenderer(this);
        this.cube_r202.setRotationPoint(0.5F, 3.7996F, -5.9424F);
        this.neck.addChild(cube_r202);
        this.setRotateAngle(cube_r202, -0.3927F, 0.0F, 0.0F);
        this.cube_r202.cubeList.add(new ModelBox(cube_r202, 67, 13, -3.0F, -3.0F, 0.0F, 5, 3, 8, 0.0F, false));

        this.sidespike3 = new AdvancedModelRenderer(this);
        this.sidespike3.setRotationPoint(3.6544F, 2.1009F, -3.0108F);
        this.neck.addChild(sidespike3);
        this.setRotateAngle(sidespike3, 0.0F, 0.2182F, 0.0F);
        this.sidespike3.cubeList.add(new ModelBox(sidespike3, 118, 15, -1.0244F, -0.5F, 0.192F, 2, 1, 1, -0.006F, false));

        this.cube_r203 = new AdvancedModelRenderer(this);
        this.cube_r203.setRotationPoint(-0.6494F, 0.0F, 1.817F);
        this.sidespike3.addChild(cube_r203);
        this.setRotateAngle(cube_r203, 0.0F, 0.3054F, 0.0F);
        this.cube_r203.cubeList.add(new ModelBox(cube_r203, 67, 25, -0.875F, -0.5F, -0.85F, 5, 1, 1, -0.003F, false));

        this.cube_r204 = new AdvancedModelRenderer(this);
        this.cube_r204.setRotationPoint(-0.8494F, 0.5F, -0.808F);
        this.sidespike3.addChild(cube_r204);
        this.setRotateAngle(cube_r204, 0.0F, -0.1309F, 0.0F);
        this.cube_r204.cubeList.add(new ModelBox(cube_r204, 94, 101, 0.0F, -1.0F, 0.0F, 6, 1, 1, 0.0F, false));

        this.sidespike21 = new AdvancedModelRenderer(this);
        this.sidespike21.setRotationPoint(-3.6544F, 2.1009F, -3.0108F);
        this.neck.addChild(sidespike21);
        this.setRotateAngle(sidespike21, 0.0F, -0.2182F, 0.0F);
        this.sidespike21.cubeList.add(new ModelBox(sidespike21, 118, 15, -0.9756F, -0.5F, 0.192F, 2, 1, 1, -0.006F, true));

        this.cube_r205 = new AdvancedModelRenderer(this);
        this.cube_r205.setRotationPoint(0.6494F, 0.0F, 1.817F);
        this.sidespike21.addChild(cube_r205);
        this.setRotateAngle(cube_r205, 0.0F, -0.3054F, 0.0F);
        this.cube_r205.cubeList.add(new ModelBox(cube_r205, 67, 25, -4.125F, -0.5F, -0.85F, 5, 1, 1, -0.003F, true));

        this.cube_r206 = new AdvancedModelRenderer(this);
        this.cube_r206.setRotationPoint(0.8494F, 0.5F, -0.808F);
        this.sidespike21.addChild(cube_r206);
        this.setRotateAngle(cube_r206, 0.0F, 0.1309F, 0.0F);
        this.cube_r206.cubeList.add(new ModelBox(cube_r206, 94, 101, -6.0F, -1.0F, 0.0F, 6, 1, 1, 0.0F, true));

        this.neck2 = new AdvancedModelRenderer(this);
        this.neck2.setRotationPoint(0.0F, -0.0987F, -4.4411F);
        this.neck.addChild(neck2);
        this.setRotateAngle(neck2, -0.0436F, 0.0F, 0.0F);
        this.neck2.cubeList.add(new ModelBox(neck2, 59, 84, -2.0F, -0.7004F, -4.9425F, 4, 4, 5, 0.0F, false));
        this.neck2.cubeList.add(new ModelBox(neck2, 118, 113, 0.5F, -0.9504F, -4.1925F, 1, 1, 1, 0.0F, false));
        this.neck2.cubeList.add(new ModelBox(neck2, 50, 119, 0.5F, -0.9504F, -2.4425F, 1, 1, 1, 0.0F, false));
        this.neck2.cubeList.add(new ModelBox(neck2, 118, 113, -1.5F, -0.9504F, -4.1925F, 1, 1, 1, 0.0F, true));
        this.neck2.cubeList.add(new ModelBox(neck2, 50, 119, -1.5F, -0.9504F, -2.4425F, 1, 1, 1, 0.0F, true));

        this.cube_r207 = new AdvancedModelRenderer(this);
        this.cube_r207.setRotationPoint(-0.5F, 3.2996F, -4.9425F);
        this.neck2.addChild(cube_r207);
        this.setRotateAngle(cube_r207, -0.1309F, 0.0F, 0.0F);
        this.cube_r207.cubeList.add(new ModelBox(cube_r207, 78, 92, -1.0F, -2.0F, 0.0F, 3, 2, 5, 0.0F, false));

        this.cube_r208 = new AdvancedModelRenderer(this);
        this.cube_r208.setRotationPoint(-2.0F, -0.4504F, -2.1925F);
        this.neck2.addChild(cube_r208);
        this.setRotateAngle(cube_r208, 0.0F, 0.0F, -0.8727F);
        this.cube_r208.cubeList.add(new ModelBox(cube_r208, 0, 120, -0.5F, -0.75F, -0.5F, 1, 1, 1, 0.0F, true));
        this.cube_r208.cubeList.add(new ModelBox(cube_r208, 119, 98, -0.5F, -0.5F, -2.5F, 1, 1, 1, 0.0F, true));

        this.cube_r209 = new AdvancedModelRenderer(this);
        this.cube_r209.setRotationPoint(2.0F, -0.4504F, -2.1925F);
        this.neck2.addChild(cube_r209);
        this.setRotateAngle(cube_r209, 0.0F, 0.0F, 0.8727F);
        this.cube_r209.cubeList.add(new ModelBox(cube_r209, 0, 120, -0.5F, -0.75F, -0.5F, 1, 1, 1, 0.0F, false));
        this.cube_r209.cubeList.add(new ModelBox(cube_r209, 119, 98, -0.5F, -0.5F, -2.5F, 1, 1, 1, 0.0F, false));

        this.sidespike = new AdvancedModelRenderer(this);
        this.sidespike.setRotationPoint(2.4044F, 1.7746F, -3.7197F);
        this.neck2.addChild(sidespike);
        this.setRotateAngle(sidespike, 0.1745F, -0.6545F, 0.0F);


        this.cube_r210 = new AdvancedModelRenderer(this);
        this.cube_r210.setRotationPoint(-0.8494F, 0.5F, -0.808F);
        this.sidespike.addChild(cube_r210);
        this.setRotateAngle(cube_r210, 0.0F, 0.0873F, 0.0F);
        this.cube_r210.cubeList.add(new ModelBox(cube_r210, 113, 117, 0.0F, -1.0F, 0.0F, 2, 1, 1, 0.0F, false));

        this.sidespike19 = new AdvancedModelRenderer(this);
        this.sidespike19.setRotationPoint(-2.4044F, 1.7746F, -3.7197F);
        this.neck2.addChild(sidespike19);
        this.setRotateAngle(sidespike19, 0.1745F, 0.6545F, 0.0F);


        this.cube_r211 = new AdvancedModelRenderer(this);
        this.cube_r211.setRotationPoint(0.8494F, 0.5F, -0.808F);
        this.sidespike19.addChild(cube_r211);
        this.setRotateAngle(cube_r211, 0.0F, -0.0873F, 0.0F);
        this.cube_r211.cubeList.add(new ModelBox(cube_r211, 113, 117, -2.0F, -1.0F, 0.0F, 2, 1, 1, 0.0F, true));

        this.sidespike2 = new AdvancedModelRenderer(this);
        this.sidespike2.setRotationPoint(2.4044F, 1.9246F, -1.7197F);
        this.neck2.addChild(sidespike2);
        this.setRotateAngle(sidespike2, 0.0F, -0.4363F, 0.0F);


        this.cube_r212 = new AdvancedModelRenderer(this);
        this.cube_r212.setRotationPoint(-1.0994F, 0.0F, 0.767F);
        this.sidespike2.addChild(cube_r212);
        this.setRotateAngle(cube_r212, 0.0F, 0.2182F, 0.0F);
        this.cube_r212.cubeList.add(new ModelBox(cube_r212, 114, 89, 0.125F, -0.5F, -0.85F, 2, 1, 1, -0.003F, false));

        this.cube_r213 = new AdvancedModelRenderer(this);
        this.cube_r213.setRotationPoint(-0.8494F, 0.5F, -0.808F);
        this.sidespike2.addChild(cube_r213);
        this.setRotateAngle(cube_r213, 0.0F, -0.1309F, 0.0F);
        this.cube_r213.cubeList.add(new ModelBox(cube_r213, 52, 109, 0.0F, -1.0F, 0.0F, 4, 1, 1, 0.0F, false));

        this.sidespike20 = new AdvancedModelRenderer(this);
        this.sidespike20.setRotationPoint(-2.4044F, 1.9246F, -1.7197F);
        this.neck2.addChild(sidespike20);
        this.setRotateAngle(sidespike20, 0.0F, 0.4363F, 0.0F);


        this.cube_r214 = new AdvancedModelRenderer(this);
        this.cube_r214.setRotationPoint(1.0994F, 0.0F, 0.767F);
        this.sidespike20.addChild(cube_r214);
        this.setRotateAngle(cube_r214, 0.0F, -0.2182F, 0.0F);
        this.cube_r214.cubeList.add(new ModelBox(cube_r214, 114, 89, -2.125F, -0.5F, -0.85F, 2, 1, 1, -0.003F, true));

        this.cube_r215 = new AdvancedModelRenderer(this);
        this.cube_r215.setRotationPoint(0.8494F, 0.5F, -0.808F);
        this.sidespike20.addChild(cube_r215);
        this.setRotateAngle(cube_r215, 0.0F, 0.1309F, 0.0F);
        this.cube_r215.cubeList.add(new ModelBox(cube_r215, 52, 109, -4.0F, -1.0F, 0.0F, 4, 1, 1, 0.0F, true));

        this.head = new AdvancedModelRenderer(this);
        this.head.setRotationPoint(0.0F, 0.5918F, -4.5647F);
        this.neck2.addChild(head);
        this.setRotateAngle(head, 0.6109F, 0.0F, 0.0F);


        this.cube_r216 = new AdvancedModelRenderer(this);
        this.cube_r216.setRotationPoint(0.5F, -1.1F, -3.3F);
        this.head.addChild(cube_r216);
        this.setRotateAngle(cube_r216, -0.5934F, 0.0F, 0.0F);
        this.cube_r216.cubeList.add(new ModelBox(cube_r216, 64, 103, -3.0F, -1.3F, 1.25F, 5, 2, 1, 0.0F, false));
        this.cube_r216.cubeList.add(new ModelBox(cube_r216, 103, 35, -3.0F, -2.3F, 2.25F, 5, 3, 1, 0.004F, false));

        this.cube_r217 = new AdvancedModelRenderer(this);
        this.cube_r217.setRotationPoint(2.1196F, 0.2614F, -2.2261F);
        this.head.addChild(cube_r217);
        this.setRotateAngle(cube_r217, 1.7462F, -0.1987F, 1.8395F);
        this.cube_r217.cubeList.add(new ModelBox(cube_r217, 109, 17, -0.5F, -0.5F, -1.5F, 1, 1, 3, 0.0F, false));

        this.cube_r218 = new AdvancedModelRenderer(this);
        this.cube_r218.setRotationPoint(1.8779F, -1.6516F, 0.1835F);
        this.head.addChild(cube_r218);
        this.setRotateAngle(cube_r218, -0.4707F, 0.8284F, -0.303F);
        this.cube_r218.cubeList.add(new ModelBox(cube_r218, 118, 107, -0.2F, -0.05F, 0.125F, 1, 1, 1, 0.01F, false));

        this.cube_r219 = new AdvancedModelRenderer(this);
        this.cube_r219.setRotationPoint(2.6472F, -1.7893F, -0.2623F);
        this.head.addChild(cube_r219);
        this.setRotateAngle(cube_r219, -0.1601F, 0.0452F, 0.1412F);
        this.cube_r219.cubeList.add(new ModelBox(cube_r219, 104, 113, -0.75F, -0.025F, -1.65F, 1, 1, 2, 0.0F, false));

        this.cube_r220 = new AdvancedModelRenderer(this);
        this.cube_r220.setRotationPoint(2.8621F, -2.0493F, -1.8969F);
        this.head.addChild(cube_r220);
        this.setRotateAngle(cube_r220, 0.1143F, 0.2968F, 0.1661F);
        this.cube_r220.cubeList.add(new ModelBox(cube_r220, 97, 113, -1.0F, 0.0F, -2.0F, 1, 1, 2, 0.0F, false));

        this.cube_r221 = new AdvancedModelRenderer(this);
        this.cube_r221.setRotationPoint(2.459F, -2.056F, -2.1035F);
        this.head.addChild(cube_r221);
        this.setRotateAngle(cube_r221, 0.0271F, 0.4311F, -0.0123F);
        this.cube_r221.cubeList.add(new ModelBox(cube_r221, 11, 112, -1.0F, 0.05F, -2.0F, 1, 2, 2, 0.003F, false));

        this.cube_r222 = new AdvancedModelRenderer(this);
        this.cube_r222.setRotationPoint(-9.5F, -0.3013F, -2.3122F);
        this.head.addChild(cube_r222);
        this.setRotateAngle(cube_r222, -0.0744F, 0.3991F, -0.0443F);
        this.cube_r222.cubeList.add(new ModelBox(cube_r222, 72, 110, 8.9211F, -0.8159F, 1.8852F, 2, 1, 2, 0.003F, false));

        this.cube_r223 = new AdvancedModelRenderer(this);
        this.cube_r223.setRotationPoint(0.9383F, -0.5297F, -5.9876F);
        this.head.addChild(cube_r223);
        this.setRotateAngle(cube_r223, -0.0739F, 0.3817F, -0.0429F);
        this.cube_r223.cubeList.add(new ModelBox(cube_r223, 99, 25, -2.0F, 0.0F, 0.0F, 2, 1, 4, 0.003F, false));

        this.cube_r224 = new AdvancedModelRenderer(this);
        this.cube_r224.setRotationPoint(1.6255F, -1.9415F, -3.9186F);
        this.head.addChild(cube_r224);
        this.setRotateAngle(cube_r224, 0.4334F, 0.3679F, -0.0446F);
        this.cube_r224.cubeList.add(new ModelBox(cube_r224, 56, 112, -1.0F, 0.0F, -2.0F, 1, 1, 2, 0.003F, false));

        this.cube_r225 = new AdvancedModelRenderer(this);
        this.cube_r225.setRotationPoint(-2.1196F, 0.2614F, -2.2261F);
        this.head.addChild(cube_r225);
        this.setRotateAngle(cube_r225, 1.7462F, 0.1987F, -1.8395F);
        this.cube_r225.cubeList.add(new ModelBox(cube_r225, 109, 17, -0.5F, -0.5F, -1.5F, 1, 1, 3, 0.0F, true));

        this.cube_r226 = new AdvancedModelRenderer(this);
        this.cube_r226.setRotationPoint(-1.8779F, -1.6516F, 0.1835F);
        this.head.addChild(cube_r226);
        this.setRotateAngle(cube_r226, -0.4707F, -0.8284F, 0.303F);
        this.cube_r226.cubeList.add(new ModelBox(cube_r226, 118, 107, -0.8F, -0.05F, 0.125F, 1, 1, 1, 0.01F, true));

        this.cube_r227 = new AdvancedModelRenderer(this);
        this.cube_r227.setRotationPoint(-2.6472F, -1.7893F, -0.2623F);
        this.head.addChild(cube_r227);
        this.setRotateAngle(cube_r227, -0.1601F, -0.0452F, -0.1412F);
        this.cube_r227.cubeList.add(new ModelBox(cube_r227, 104, 113, -0.25F, -0.025F, -1.65F, 1, 1, 2, 0.0F, true));

        this.cube_r228 = new AdvancedModelRenderer(this);
        this.cube_r228.setRotationPoint(-2.8621F, -2.0493F, -1.8969F);
        this.head.addChild(cube_r228);
        this.setRotateAngle(cube_r228, 0.1143F, -0.2968F, -0.1661F);
        this.cube_r228.cubeList.add(new ModelBox(cube_r228, 97, 113, 0.0F, 0.0F, -2.0F, 1, 1, 2, 0.0F, true));

        this.cube_r229 = new AdvancedModelRenderer(this);
        this.cube_r229.setRotationPoint(-2.459F, -2.056F, -2.1035F);
        this.head.addChild(cube_r229);
        this.setRotateAngle(cube_r229, 0.0271F, -0.4311F, 0.0123F);
        this.cube_r229.cubeList.add(new ModelBox(cube_r229, 11, 112, 0.0F, 0.05F, -2.0F, 1, 2, 2, 0.003F, true));

        this.cube_r230 = new AdvancedModelRenderer(this);
        this.cube_r230.setRotationPoint(-1.6255F, -1.9415F, -3.9186F);
        this.head.addChild(cube_r230);
        this.setRotateAngle(cube_r230, 0.4334F, -0.3679F, 0.0446F);
        this.cube_r230.cubeList.add(new ModelBox(cube_r230, 56, 112, 0.0F, 0.0F, -2.0F, 1, 1, 2, 0.003F, true));

        this.cube_r231 = new AdvancedModelRenderer(this);
        this.cube_r231.setRotationPoint(-0.9383F, -0.5297F, -5.9876F);
        this.head.addChild(cube_r231);
        this.setRotateAngle(cube_r231, -0.0739F, -0.3817F, 0.0429F);
        this.cube_r231.cubeList.add(new ModelBox(cube_r231, 99, 25, 0.0F, 0.0F, 0.0F, 2, 1, 4, 0.003F, true));

        this.cube_r232 = new AdvancedModelRenderer(this);
        this.cube_r232.setRotationPoint(1.0F, -0.4581F, -3.804F);
        this.head.addChild(cube_r232);
        this.setRotateAngle(cube_r232, -0.0175F, 0.0F, 0.0F);
        this.cube_r232.cubeList.add(new ModelBox(cube_r232, 29, 61, -2.0F, 0.0F, -3.0F, 2, 1, 3, 0.01F, false));

        this.cube_r233 = new AdvancedModelRenderer(this);
        this.cube_r233.setRotationPoint(-2.5F, -0.3013F, -2.3122F);
        this.head.addChild(cube_r233);
        this.setRotateAngle(cube_r233, -0.0744F, -0.3991F, 0.0443F);
        this.cube_r233.cubeList.add(new ModelBox(cube_r233, 72, 110, 0.125F, -1.0F, -2.8F, 2, 1, 2, 0.003F, true));

        this.cube_r234 = new AdvancedModelRenderer(this);
        this.cube_r234.setRotationPoint(0.0F, -1.9253F, -4.0863F);
        this.head.addChild(cube_r234);
        this.setRotateAngle(cube_r234, 0.4712F, 0.0F, 0.0F);
        this.cube_r234.cubeList.add(new ModelBox(cube_r234, 110, 64, -1.0F, 0.0F, -2.0F, 2, 1, 2, 0.007F, false));

        this.cube_r235 = new AdvancedModelRenderer(this);
        this.cube_r235.setRotationPoint(0.0F, -1.0173F, -5.8683F);
        this.head.addChild(cube_r235);
        this.setRotateAngle(cube_r235, 0.733F, 0.0F, 0.0F);
        this.cube_r235.cubeList.add(new ModelBox(cube_r235, 101, 117, -1.0F, 0.0F, -1.0F, 2, 1, 1, -0.005F, false));

        this.cube_r236 = new AdvancedModelRenderer(this);
        this.cube_r236.setRotationPoint(-0.5F, -1.8468F, -5.0832F);
        this.head.addChild(cube_r236);
        this.setRotateAngle(cube_r236, 0.0785F, 0.0F, 0.0F);
        this.cube_r236.cubeList.add(new ModelBox(cube_r236, 0, 106, -1.0F, 0.0F, 1.0F, 3, 1, 2, 0.0F, false));

        this.cube_r237 = new AdvancedModelRenderer(this);
        this.cube_r237.setRotationPoint(0.5F, -2.0972F, -2.107F);
        this.head.addChild(cube_r237);
        this.setRotateAngle(cube_r237, -0.1833F, 0.0F, 0.0F);
        this.cube_r237.cubeList.add(new ModelBox(cube_r237, 57, 94, -3.0F, 0.0F, 0.0F, 5, 2, 2, -0.01F, false));

        this.leftNose = new AdvancedModelRenderer(this);
        this.leftNose.setRotationPoint(0.6761F, -0.5459F, -6.2988F);
        this.head.addChild(leftNose);
        this.setRotateAngle(leftNose, 0.2214F, 0.1704F, 0.0381F);


        this.cube_r238 = new AdvancedModelRenderer(this);
        this.cube_r238.setRotationPoint(0.25F, 0.085F, 2.5075F);
        this.leftNose.addChild(cube_r238);
        this.setRotateAngle(cube_r238, -0.0175F, 0.0F, 0.0F);
        this.cube_r238.cubeList.add(new ModelBox(cube_r238, 68, 118, -0.75F, -0.05F, -2.5F, 1, 1, 1, 0.0F, false));
        this.cube_r238.cubeList.add(new ModelBox(cube_r238, 68, 118, -2.1023F, -0.05F, -2.5F, 1, 1, 1, 0.0F, true));

        this.jaw = new AdvancedModelRenderer(this);
        this.jaw.setRotationPoint(0.0F, 0.74F, -1.8019F);
        this.head.addChild(jaw);


        this.cube_r239 = new AdvancedModelRenderer(this);
        this.cube_r239.setRotationPoint(0.5F, -1.84F, -1.4981F);
        this.jaw.addChild(cube_r239);
        this.setRotateAngle(cube_r239, -0.5934F, 0.0F, 0.0F);
        this.cube_r239.cubeList.add(new ModelBox(cube_r239, 90, 104, -3.0F, 0.7F, 1.25F, 5, 1, 1, 0.0F, false));
        this.cube_r239.cubeList.add(new ModelBox(cube_r239, 103, 55, -3.0F, 0.7F, 2.25F, 5, 1, 1, 0.0F, false));

        this.cube_r240 = new AdvancedModelRenderer(this);
        this.cube_r240.setRotationPoint(1.0F, -1.198F, -2.0021F);
        this.jaw.addChild(cube_r240);
        this.setRotateAngle(cube_r240, -0.0175F, 0.0F, 0.0F);
        this.cube_r240.cubeList.add(new ModelBox(cube_r240, 29, 66, -2.0F, 1.0F, -3.0F, 2, 1, 3, 0.01F, false));

        this.cube_r241 = new AdvancedModelRenderer(this);
        this.cube_r241.setRotationPoint(-11.0F, -0.8971F, -1.531F);
        this.jaw.addChild(cube_r241);
        this.setRotateAngle(cube_r241, -0.1047F, 0.0F, 0.0F);
        this.cube_r241.cubeList.add(new ModelBox(cube_r241, 110, 68, 10.0F, 0.75F, -0.5F, 2, 1, 2, 0.005F, false));

        this.cube_r242 = new AdvancedModelRenderer(this);
        this.cube_r242.setRotationPoint(-12.7682F, -0.2641F, -4.1798F);
        this.jaw.addChild(cube_r242);
        this.setRotateAngle(cube_r242, -0.3414F, -0.3538F, 0.1316F);
        this.cube_r242.cubeList.add(new ModelBox(cube_r242, 81, 110, 11.1596F, -2.1034F, -4.0105F, 0, 2, 3, 0.0F, true));

        this.cube_r243 = new AdvancedModelRenderer(this);
        this.cube_r243.setRotationPoint(-0.9383F, -1.2696F, -4.1857F);
        this.jaw.addChild(cube_r243);
        this.setRotateAngle(cube_r243, -0.0739F, -0.3817F, 0.0429F);
        this.cube_r243.cubeList.add(new ModelBox(cube_r243, 51, 99, 0.0F, 1.0F, 0.0F, 2, 1, 4, 0.003F, true));

        this.cube_r244 = new AdvancedModelRenderer(this);
        this.cube_r244.setRotationPoint(-11.2318F, -0.2641F, -4.1798F);
        this.jaw.addChild(cube_r244);
        this.setRotateAngle(cube_r244, -0.3414F, 0.3538F, -0.1316F);
        this.cube_r244.cubeList.add(new ModelBox(cube_r244, 81, 110, 11.1596F, -1.8966F, 4.8105F, 0, 2, 3, 0.0F, false));

        this.cube_r245 = new AdvancedModelRenderer(this);
        this.cube_r245.setRotationPoint(0.9383F, -1.2696F, -4.1857F);
        this.jaw.addChild(cube_r245);
        this.setRotateAngle(cube_r245, -0.0739F, 0.3817F, -0.0429F);
        this.cube_r245.cubeList.add(new ModelBox(cube_r245, 51, 99, -2.0F, 1.0F, 0.0F, 2, 1, 4, 0.003F, false));

        this.throat = new AdvancedModelRenderer(this);
        this.throat.setRotationPoint(0.0F, 0.8983F, -2.1643F);
        this.jaw.addChild(throat);
        this.setRotateAngle(throat, -0.4189F, 0.0F, 0.0F);


        this.cube_r246 = new AdvancedModelRenderer(this);
        this.cube_r246.setRotationPoint(1.0F, -1.7954F, 0.6334F);
        this.throat.addChild(cube_r246);
        this.setRotateAngle(cube_r246, -0.1047F, 0.0F, 0.0F);
        this.cube_r246.cubeList.add(new ModelBox(cube_r246, 94, 0, -2.0F, 0.75F, -0.5F, 2, 1, 5, 0.0F, false));

        this.eye = new AdvancedModelRenderer(this);
        this.eye.setRotationPoint(2.0303F, -0.6F, -2.3013F);
        this.head.addChild(eye);
        this.setRotateAngle(eye, 0.0F, 0.3054F, 0.0F);
        this.eye.cubeList.add(new ModelBox(eye, 63, 118, -0.5F, -0.5F, -0.5F, 1, 1, 1, 0.0F, false));

        this.eye2 = new AdvancedModelRenderer(this);
        this.eye2.setRotationPoint(-2.0303F, -0.6F, -2.3013F);
        this.head.addChild(eye2);
        this.setRotateAngle(eye2, 0.0F, -0.3054F, 0.0F);
        this.eye2.cubeList.add(new ModelBox(eye2, 63, 118, -0.5F, -0.5F, -0.5F, 1, 1, 1, 0.0F, true));


        updateDefaultPose();
        animator = ModelAnimator.create();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        //this.main.rotateAngleY = (float)Math.toRadians(((EntityPrehistoricFloraGastonia)entity).getRotationAngle());
        animate((IAnimatedEntity) entity, f, f1, f2, f3, f4, f5);
        this.root.render(f5);
    }

    public void renderStaticWall(float f) {

        resetToDefaultPose();
    }

    @Override
    public void renderStaticBook(float f) {
        //Rotations, positions and sizing:
        this.root.offsetY = 0.F;
        this.root.offsetX = 1.3F;
        this.root.rotateAngleY = (float)Math.toRadians(180);
        this.root.rotateAngleX = (float)Math.toRadians(10);
        this.root.rotateAngleZ = (float)Math.toRadians(-10);
        this.root.scaleChildren = true;
        float scaler = 0.6F;
        this.root.setScale(scaler, scaler, scaler);
        //Start of pose:

        //End of pose, now render the model:
        this.root.render(f);
        //Reset rotations, positions and sizing:
        this.root.setScale(1.0F, 1.0F, 1.0F);
        this.root.scaleChildren = false;
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

        EntityPrehistoricFloraGastonia gastonia = (EntityPrehistoricFloraGastonia) e;
        if (gastonia.getIsSneaking()) {
            this.faceTarget(f3, f4, 1, root);
        }
        this.faceTarget(f3, f4, 14, neck);
        this.faceTarget(f3, f4, 14, neck2);
        this.faceTarget(f3, f4, 14, head);

        AdvancedModelRenderer[] Tail = {this.tail, this.tail2, this.tail3, this.tail4, this.tail5};
        AdvancedModelRenderer[] Neck = {this.neck, this.neck2, this.head};
        //AdvancedModelRenderer[] ArmL = {this.leftarm, this.leftarm2, this.leftarm3};
        //AdvancedModelRenderer[] ArmR = {this.rightarm, this.rightarm2, this.rightarm3};

        gastonia.tailBuffer.applyChainSwingBuffer(Tail);

        if (gastonia.getAnimation() == gastonia.LAY_ANIMATION) {
            this.chainSwing(Neck, 0.5F, 0.10F, 0.5, f2, 0.8F);
            this.chainWave(Neck, 0.5F * 2, -0.02F, 0.5F, f2, 0.8F);
        }
        else {
            if (!gastonia.isReallyInWater()) {

                if (f3 == 0.0F || !gastonia.getIsMoving()) {
                    if (gastonia.getAnimation() != gastonia.EAT_ANIMATION
                            && gastonia.getAnimation() != gastonia.DRINK_ANIMATION
                            && gastonia.getAnimation() != gastonia.ATTACK_ANIMATION) {
                        this.chainSwing(Neck, 0.05F, 0.10F, 0.5, f2, 0.8F);
                        this.chainWave(Neck, 0.05F * 2, -0.02F, 0.5F, f2, 0.8F);
                    }

                    if (gastonia.getAnimation() != gastonia.ATTACK_ANIMATION) {
                        this.chainWave(Tail, (0.15F * 0.35F), 0.125F * 0.15F, 0.2F, f2, 1F);
                        this.chainSwing(Tail, (0.15F * 0.35F) * 4F, 0.05F * 0.35F, 0.12F, f2, 1F);
                    }

                    return;
                }

                if (gastonia.getIsFast()) { //Running
                    if (gastonia.getIsSneaking()) {

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

        EntityPrehistoricFloraGastonia ee = (EntityPrehistoricFloraGastonia) entitylivingbaseIn;

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
        else if (ee.getAnimation() == ee.GRAZE_ANIMATION) {
            animGraze(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.ROAR_ANIMATION) { //The roar/warn anim
            animRoar(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.HIDE_ANIMATION) { //The roar/warn anim
            animHide(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }

    }

    public void animGraze(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraGastonia entity = (EntityPrehistoricFloraGastonia) entitylivingbaseIn;
        int animCycle = 220;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*0.5-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 170) {
            xx = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*0.5 + (((tickAnim - 40) / 130) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*0.5-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*0.5)));
            yy = 0 + (((tickAnim - 40) / 130) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 130) * (0-(0)));
        }
        else if (tickAnim >= 170 && tickAnim < 220) {
            xx = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*0.5 + (((tickAnim - 170) / 50) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*0.5)));
            yy = 0 + (((tickAnim - 170) / 50) * (0-(0)));
            zz = 0 + (((tickAnim - 170) / 50) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail, tail.rotateAngleX + (float) Math.toRadians(xx), tail.rotateAngleY + (float) Math.toRadians(yy), tail.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-50))*0.5-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 170) {
            xx = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-50))*0.5 + (((tickAnim - 40) / 130) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-50))*0.5-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-50))*0.5)));
            yy = 0 + (((tickAnim - 40) / 130) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 130) * (0-(0)));
        }
        else if (tickAnim >= 170 && tickAnim < 220) {
            xx = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-50))*0.5 + (((tickAnim - 170) / 50) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-50))*0.5)));
            yy = 0 + (((tickAnim - 170) / 50) * (0-(0)));
            zz = 0 + (((tickAnim - 170) / 50) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(xx), tail2.rotateAngleY + (float) Math.toRadians(yy), tail2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-80))*0.5-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 170) {
            xx = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-80))*0.5 + (((tickAnim - 40) / 130) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-80))*0.5-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-80))*0.5)));
            yy = 0 + (((tickAnim - 40) / 130) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 130) * (0-(0)));
        }
        else if (tickAnim >= 170 && tickAnim < 220) {
            xx = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-80))*0.5 + (((tickAnim - 170) / 50) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-80))*0.5)));
            yy = 0 + (((tickAnim - 170) / 50) * (0-(0)));
            zz = 0 + (((tickAnim - 170) / 50) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(xx), tail3.rotateAngleY + (float) Math.toRadians(yy), tail3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-120))*0.5-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 170) {
            xx = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-120))*0.5 + (((tickAnim - 40) / 130) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-120))*0.5-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-120))*0.5)));
            yy = 0 + (((tickAnim - 40) / 130) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 130) * (0-(0)));
        }
        else if (tickAnim >= 170 && tickAnim < 220) {
            xx = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-120))*0.5 + (((tickAnim - 170) / 50) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-120))*0.5)));
            yy = 0 + (((tickAnim - 170) / 50) * (0-(0)));
            zz = 0 + (((tickAnim - 170) / 50) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(xx), tail4.rotateAngleY + (float) Math.toRadians(yy), tail4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-160))*0.5-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 170) {
            xx = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-160))*0.5 + (((tickAnim - 40) / 130) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-160))*0.5-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-160))*0.5)));
            yy = 0 + (((tickAnim - 40) / 130) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 130) * (0-(0)));
        }
        else if (tickAnim >= 170 && tickAnim < 220) {
            xx = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-160))*0.5 + (((tickAnim - 170) / 50) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-160))*0.5)));
            yy = 0 + (((tickAnim - 170) / 50) * (0-(0)));
            zz = 0 + (((tickAnim - 170) / 50) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail5, tail5.rotateAngleX + (float) Math.toRadians(xx), tail5.rotateAngleY + (float) Math.toRadians(yy), tail5.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (1.25-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 170) {
            xx = 1.25 + (((tickAnim - 40) / 130) * (1.25-(1.25)));
            yy = 0 + (((tickAnim - 40) / 130) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 130) * (0-(0)));
        }
        else if (tickAnim >= 170 && tickAnim < 220) {
            xx = 1.25 + (((tickAnim - 170) / 50) * (0-(1.25)));
            yy = 0 + (((tickAnim - 170) / 50) * (0-(0)));
            zz = 0 + (((tickAnim - 170) / 50) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(xx), body.rotateAngleY + (float) Math.toRadians(yy), body.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (4.75-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 170) {
            xx = 4.75 + (((tickAnim - 40) / 130) * (4.75-(4.75)));
            yy = 0 + (((tickAnim - 40) / 130) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 130) * (0-(0)));
        }
        else if (tickAnim >= 170 && tickAnim < 220) {
            xx = 4.75 + (((tickAnim - 170) / 50) * (0-(4.75)));
            yy = 0 + (((tickAnim - 170) / 50) * (0-(0)));
            zz = 0 + (((tickAnim - 170) / 50) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body2, body2.rotateAngleX + (float) Math.toRadians(xx), body2.rotateAngleY + (float) Math.toRadians(yy), body2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (-43.5-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 170) {
            xx = -43.5 + (((tickAnim - 40) / 130) * (-43.5-(-43.5)));
            yy = 0 + (((tickAnim - 40) / 130) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 130) * (0-(0)));
        }
        else if (tickAnim >= 170 && tickAnim < 220) {
            xx = -43.5 + (((tickAnim - 170) / 50) * (0-(-43.5)));
            yy = 0 + (((tickAnim - 170) / 50) * (0-(0)));
            zz = 0 + (((tickAnim - 170) / 50) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm, leftArm.rotateAngleX + (float) Math.toRadians(xx), leftArm.rotateAngleY + (float) Math.toRadians(yy), leftArm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 0) / 19) * (-18.05-(0)));
            yy = 0 + (((tickAnim - 0) / 19) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 19) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 40) {
            xx = -18.05 + (((tickAnim - 19) / 21) * (14.5-(-18.05)));
            yy = 0 + (((tickAnim - 19) / 21) * (0-(0)));
            zz = 0 + (((tickAnim - 19) / 21) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 170) {
            xx = 14.5 + (((tickAnim - 40) / 130) * (14.5-(14.5)));
            yy = 0 + (((tickAnim - 40) / 130) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 130) * (0-(0)));
        }
        else if (tickAnim >= 170 && tickAnim < 195) {
            xx = 14.5 + (((tickAnim - 170) / 25) * (-13.5-(14.5)));
            yy = 0 + (((tickAnim - 170) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 170) / 25) * (0-(0)));
        }
        else if (tickAnim >= 195 && tickAnim < 220) {
            xx = -13.5 + (((tickAnim - 195) / 25) * (0-(-13.5)));
            yy = 0 + (((tickAnim - 195) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 195) / 25) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm2, leftArm2.rotateAngleX + (float) Math.toRadians(xx), leftArm2.rotateAngleY + (float) Math.toRadians(yy), leftArm2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (0.2-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 170) {
            xx = 0 + (((tickAnim - 40) / 130) * (0-(0)));
            yy = 0.2 + (((tickAnim - 40) / 130) * (0.2-(0.2)));
            zz = 0 + (((tickAnim - 40) / 130) * (0-(0)));
        }
        else if (tickAnim >= 170 && tickAnim < 220) {
            xx = 0 + (((tickAnim - 170) / 50) * (0-(0)));
            yy = 0.2 + (((tickAnim - 170) / 50) * (0-(0.2)));
            zz = 0 + (((tickAnim - 170) / 50) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftArm2.rotationPointX = this.leftArm2.rotationPointX + (float)(xx);
        this.leftArm2.rotationPointY = this.leftArm2.rotationPointY - (float)(yy);
        this.leftArm2.rotationPointZ = this.leftArm2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 0) / 19) * (78.41-(0)));
            yy = 0 + (((tickAnim - 0) / 19) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 19) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 40) {
            xx = 78.41 + (((tickAnim - 19) / 21) * (22.25-(78.41)));
            yy = 0 + (((tickAnim - 19) / 21) * (0-(0)));
            zz = 0 + (((tickAnim - 19) / 21) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 170) {
            xx = 22.25 + (((tickAnim - 40) / 130) * (22.25-(22.25)));
            yy = 0 + (((tickAnim - 40) / 130) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 130) * (0-(0)));
        }
        else if (tickAnim >= 170 && tickAnim < 195) {
            xx = 22.25 + (((tickAnim - 170) / 25) * (81.88-(22.25)));
            yy = 0 + (((tickAnim - 170) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 170) / 25) * (0-(0)));
        }
        else if (tickAnim >= 195 && tickAnim < 220) {
            xx = 81.88 + (((tickAnim - 195) / 25) * (0-(81.88)));
            yy = 0 + (((tickAnim - 195) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 195) / 25) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm3, leftArm3.rotateAngleX + (float) Math.toRadians(xx), leftArm3.rotateAngleY + (float) Math.toRadians(yy), leftArm3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (0.675-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (-0.475-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 170) {
            xx = 0 + (((tickAnim - 40) / 130) * (0-(0)));
            yy = 0.675 + (((tickAnim - 40) / 130) * (0.675-(0.675)));
            zz = -0.475 + (((tickAnim - 40) / 130) * (-0.475-(-0.475)));
        }
        else if (tickAnim >= 170 && tickAnim < 220) {
            xx = 0 + (((tickAnim - 170) / 50) * (0-(0)));
            yy = 0.675 + (((tickAnim - 170) / 50) * (0-(0.675)));
            zz = -0.475 + (((tickAnim - 170) / 50) * (0-(-0.475)));
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
            xx = 0 + (((tickAnim - 0) / 40) * (-14.25-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 170) {
            xx = -14.25 + (((tickAnim - 40) / 130) * (-14.25-(-14.25)));
            yy = 0 + (((tickAnim - 40) / 130) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 130) * (0-(0)));
        }
        else if (tickAnim >= 170 && tickAnim < 220) {
            xx = -14.25 + (((tickAnim - 170) / 50) * (0-(-14.25)));
            yy = 0 + (((tickAnim - 170) / 50) * (0-(0)));
            zz = 0 + (((tickAnim - 170) / 50) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm, rightArm.rotateAngleX + (float) Math.toRadians(xx), rightArm.rotateAngleY + (float) Math.toRadians(yy), rightArm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (4.75-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 170) {
            xx = 4.75 + (((tickAnim - 40) / 130) * (4.75-(4.75)));
            yy = 0 + (((tickAnim - 40) / 130) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 130) * (0-(0)));
        }
        else if (tickAnim >= 170 && tickAnim < 220) {
            xx = 4.75 + (((tickAnim - 170) / 50) * (0-(4.75)));
            yy = 0 + (((tickAnim - 170) / 50) * (0-(0)));
            zz = 0 + (((tickAnim - 170) / 50) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm3, rightArm3.rotateAngleX + (float) Math.toRadians(xx), rightArm3.rotateAngleY + (float) Math.toRadians(yy), rightArm3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (5.625+Math.sin((Math.PI/180)*(((double)tickAnim/20)*70-30))*5-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 55) {
            xx = 5.625+Math.sin((Math.PI/180)*(((double)tickAnim/20)*70-30))*5 + (((tickAnim - 40) / 15) * (6.75-(5.625+Math.sin((Math.PI/180)*(((double)tickAnim/20)*70-30))*5)));
            yy = 0 + (((tickAnim - 40) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 15) * (0-(0)));
        }
        else if (tickAnim >= 55 && tickAnim < 70) {
            xx = 6.75 + (((tickAnim - 55) / 15) * (6-(6.75)));
            yy = 0 + (((tickAnim - 55) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 55) / 15) * (0-(0)));
        }
        else if (tickAnim >= 70 && tickAnim < 85) {
            xx = 6 + (((tickAnim - 70) / 15) * (4.25-(6)));
            yy = 0 + (((tickAnim - 70) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 70) / 15) * (0-(0)));
        }
        else if (tickAnim >= 85 && tickAnim < 105) {
            xx = 4.25 + (((tickAnim - 85) / 20) * (8.75-(4.25)));
            yy = 0 + (((tickAnim - 85) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 85) / 20) * (0-(0)));
        }
        else if (tickAnim >= 105 && tickAnim < 120) {
            xx = 8.75 + (((tickAnim - 105) / 15) * (6.75-(8.75)));
            yy = 0 + (((tickAnim - 105) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 105) / 15) * (0-(0)));
        }
        else if (tickAnim >= 120 && tickAnim < 135) {
            xx = 6.75 + (((tickAnim - 120) / 15) * (4.25-(6.75)));
            yy = 0 + (((tickAnim - 120) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 120) / 15) * (0-(0)));
        }
        else if (tickAnim >= 135 && tickAnim < 155) {
            xx = 4.25 + (((tickAnim - 135) / 20) * (8.75-(4.25)));
            yy = 0 + (((tickAnim - 135) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 135) / 20) * (0-(0)));
        }
        else if (tickAnim >= 155 && tickAnim < 170) {
            xx = 8.75 + (((tickAnim - 155) / 15) * (6.75-(8.75)));
            yy = 0 + (((tickAnim - 155) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 155) / 15) * (0-(0)));
        }
        else if (tickAnim >= 170 && tickAnim < 220) {
            xx = 6.75 + (((tickAnim - 170) / 50) * (0-(6.75)));
            yy = 0 + (((tickAnim - 170) / 50) * (0-(0)));
            zz = 0 + (((tickAnim - 170) / 50) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(xx), neck.rotateAngleY + (float) Math.toRadians(yy), neck.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (9.25-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 55) {
            xx = 9.25 + (((tickAnim - 40) / 15) * (4.75-(9.25)));
            yy = 0 + (((tickAnim - 40) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 15) * (0-(0)));
        }
        else if (tickAnim >= 55 && tickAnim < 70) {
            xx = 4.75 + (((tickAnim - 55) / 15) * (3.75-(4.75)));
            yy = 0 + (((tickAnim - 55) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 55) / 15) * (0-(0)));
        }
        else if (tickAnim >= 70 && tickAnim < 85) {
            xx = 3.75 + (((tickAnim - 70) / 15) * (5.5-(3.75)));
            yy = 0 + (((tickAnim - 70) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 70) / 15) * (0-(0)));
        }
        else if (tickAnim >= 85 && tickAnim < 105) {
            xx = 5.5 + (((tickAnim - 85) / 20) * (9.25-(5.5)));
            yy = 0 + (((tickAnim - 85) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 85) / 20) * (0-(0)));
        }
        else if (tickAnim >= 105 && tickAnim < 120) {
            xx = 9.25 + (((tickAnim - 105) / 15) * (4.75-(9.25)));
            yy = 0 + (((tickAnim - 105) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 105) / 15) * (0-(0)));
        }
        else if (tickAnim >= 120 && tickAnim < 135) {
            xx = 4.75 + (((tickAnim - 120) / 15) * (5.5-(4.75)));
            yy = 0 + (((tickAnim - 120) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 120) / 15) * (0-(0)));
        }
        else if (tickAnim >= 135 && tickAnim < 155) {
            xx = 5.5 + (((tickAnim - 135) / 20) * (9.25-(5.5)));
            yy = 0 + (((tickAnim - 135) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 135) / 20) * (0-(0)));
        }
        else if (tickAnim >= 155 && tickAnim < 170) {
            xx = 9.25 + (((tickAnim - 155) / 15) * (4.75-(9.25)));
            yy = 0 + (((tickAnim - 155) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 155) / 15) * (0-(0)));
        }
        else if (tickAnim >= 170 && tickAnim < 220) {
            xx = 4.75 + (((tickAnim - 170) / 50) * (0-(4.75)));
            yy = 0 + (((tickAnim - 170) / 50) * (0-(0)));
            zz = 0 + (((tickAnim - 170) / 50) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(xx), neck2.rotateAngleY + (float) Math.toRadians(yy), neck2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (2.66-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 29) {
            xx = 2.66 + (((tickAnim - 20) / 9) * (-4.5-(2.66)));
            yy = 0 + (((tickAnim - 20) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 9) * (0-(0)));
        }
        else if (tickAnim >= 29 && tickAnim < 40) {
            xx = -4.5 + (((tickAnim - 29) / 11) * (0-(-4.5)));
            yy = 0 + (((tickAnim - 29) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 29) / 11) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 55) {
            xx = 0 + (((tickAnim - 40) / 15) * (13-(0)));
            yy = 0 + (((tickAnim - 40) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 15) * (0-(0)));
        }
        else if (tickAnim >= 55 && tickAnim < 70) {
            xx = 13 + (((tickAnim - 55) / 15) * (5-(13)));
            yy = 0 + (((tickAnim - 55) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 55) / 15) * (0-(0)));
        }
        else if (tickAnim >= 70 && tickAnim < 85) {
            xx = 5 + (((tickAnim - 70) / 15) * (13.66-(5)));
            yy = 0 + (((tickAnim - 70) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 70) / 15) * (0-(0)));
        }
        else if (tickAnim >= 85 && tickAnim < 94) {
            xx = 13.66 + (((tickAnim - 85) / 9) * (7.5-(13.66)));
            yy = 0 + (((tickAnim - 85) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 85) / 9) * (0-(0)));
        }
        else if (tickAnim >= 94 && tickAnim < 105) {
            xx = 7.5 + (((tickAnim - 94) / 11) * (7.25-(7.5)));
            yy = 0 + (((tickAnim - 94) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 94) / 11) * (0-(0)));
        }
        else if (tickAnim >= 105 && tickAnim < 120) {
            xx = 7.25 + (((tickAnim - 105) / 15) * (13-(7.25)));
            yy = 0 + (((tickAnim - 105) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 105) / 15) * (0-(0)));
        }
        else if (tickAnim >= 120 && tickAnim < 135) {
            xx = 13 + (((tickAnim - 120) / 15) * (13.66-(13)));
            yy = 0 + (((tickAnim - 120) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 120) / 15) * (0-(0)));
        }
        else if (tickAnim >= 135 && tickAnim < 144) {
            xx = 13.66 + (((tickAnim - 135) / 9) * (7.5-(13.66)));
            yy = 0 + (((tickAnim - 135) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 135) / 9) * (0-(0)));
        }
        else if (tickAnim >= 144 && tickAnim < 155) {
            xx = 7.5 + (((tickAnim - 144) / 11) * (7.25-(7.5)));
            yy = 0 + (((tickAnim - 144) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 144) / 11) * (0-(0)));
        }
        else if (tickAnim >= 155 && tickAnim < 170) {
            xx = 7.25 + (((tickAnim - 155) / 15) * (13-(7.25)));
            yy = 0 + (((tickAnim - 155) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 155) / 15) * (0-(0)));
        }
        else if (tickAnim >= 170 && tickAnim < 185) {
            xx = 13 + (((tickAnim - 170) / 15) * (12.35-(13)));
            yy = 0 + (((tickAnim - 170) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 170) / 15) * (0-(0)));
        }
        else if (tickAnim >= 185 && tickAnim < 220) {
            xx = 12.35 + (((tickAnim - 185) / 35) * (0-(12.35)));
            yy = 0 + (((tickAnim - 185) / 35) * (0-(0)));
            zz = 0 + (((tickAnim - 185) / 35) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 20 && tickAnim < 29) {
            xx = 0 + (((tickAnim - 20) / 9) * (16.5-(0)));
            yy = 0 + (((tickAnim - 20) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 9) * (0-(0)));
        }
        else if (tickAnim >= 29 && tickAnim < 40) {
            xx = 16.5 + (((tickAnim - 29) / 11) * (0-(16.5)));
            yy = 0 + (((tickAnim - 29) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 29) / 11) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 55) {
            xx = 0 + (((tickAnim - 40) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 40) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 15) * (0-(0)));
        }
        else if (tickAnim >= 55 && tickAnim < 63) {
            xx = 0 + (((tickAnim - 55) / 8) * (5.25-(0)));
            yy = 0 + (((tickAnim - 55) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 55) / 8) * (0-(0)));
        }
        else if (tickAnim >= 63 && tickAnim < 70) {
            xx = 5.25 + (((tickAnim - 63) / 7) * (0-(5.25)));
            yy = 0 + (((tickAnim - 63) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 63) / 7) * (0-(0)));
        }
        else if (tickAnim >= 70 && tickAnim < 85) {
            xx = 0 + (((tickAnim - 70) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 70) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 70) / 15) * (0-(0)));
        }
        else if (tickAnim >= 85 && tickAnim < 94) {
            xx = 0 + (((tickAnim - 85) / 9) * (16.5-(0)));
            yy = 0 + (((tickAnim - 85) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 85) / 9) * (0-(0)));
        }
        else if (tickAnim >= 94 && tickAnim < 105) {
            xx = 16.5 + (((tickAnim - 94) / 11) * (0-(16.5)));
            yy = 0 + (((tickAnim - 94) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 94) / 11) * (0-(0)));
        }
        else if (tickAnim >= 105 && tickAnim < 120) {
            xx = 0 + (((tickAnim - 105) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 105) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 105) / 15) * (0-(0)));
        }
        else if (tickAnim >= 120 && tickAnim < 135) {
            xx = 0 + (((tickAnim - 120) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 120) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 120) / 15) * (0-(0)));
        }
        else if (tickAnim >= 135 && tickAnim < 144) {
            xx = 0 + (((tickAnim - 135) / 9) * (16.5-(0)));
            yy = 0 + (((tickAnim - 135) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 135) / 9) * (0-(0)));
        }
        else if (tickAnim >= 144 && tickAnim < 155) {
            xx = 16.5 + (((tickAnim - 144) / 11) * (0-(16.5)));
            yy = 0 + (((tickAnim - 144) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 144) / 11) * (0-(0)));
        }
        else if (tickAnim >= 155 && tickAnim < 170) {
            xx = 0 + (((tickAnim - 155) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 155) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 155) / 15) * (0-(0)));
        }
        else if (tickAnim >= 170 && tickAnim < 178) {
            xx = 0 + (((tickAnim - 170) / 8) * (7-(0)));
            yy = 0 + (((tickAnim - 170) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 170) / 8) * (0-(0)));
        }
        else if (tickAnim >= 178 && tickAnim < 185) {
            xx = 7 + (((tickAnim - 178) / 7) * (0-(7)));
            yy = 0 + (((tickAnim - 178) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 178) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(xx), jaw.rotateAngleY + (float) Math.toRadians(yy), jaw.rotateAngleZ + (float) Math.toRadians(zz));


    }
    public void animAttack(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraGastonia entity = (EntityPrehistoricFloraGastonia) entitylivingbaseIn;
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
        this.setRotateAngle(root, root.rotateAngleX + (float) Math.toRadians(xx), root.rotateAngleY + (float) Math.toRadians(yy), root.rotateAngleZ + (float) Math.toRadians(zz));


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
        this.root.rotationPointX = this.root.rotationPointX + (float)(xx);
        this.root.rotationPointY = this.root.rotationPointY - (float)(yy);
        this.root.rotationPointZ = this.root.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 25) {
            xx = 2.75 + (((tickAnim - 0) / 25) * (2.75-(2.75)));
            yy = 0 + (((tickAnim - 0) / 25) * (0-(0)));
            zz = -5 + (((tickAnim - 0) / 25) * (-5-(-5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(sidespike9, sidespike9.rotateAngleX + (float) Math.toRadians(xx), sidespike9.rotateAngleY + (float) Math.toRadians(yy), sidespike9.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 25) {
            xx = 2.75 + (((tickAnim - 0) / 25) * (2.75-(2.75)));
            yy = 0 + (((tickAnim - 0) / 25) * (0-(0)));
            zz = 5 + (((tickAnim - 0) / 25) * (5-(5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(sidespike27, sidespike27.rotateAngleX + (float) Math.toRadians(xx), sidespike27.rotateAngleY + (float) Math.toRadians(yy), sidespike27.rotateAngleZ + (float) Math.toRadians(zz));




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
            xx = -21.91367 + (((tickAnim - 0) / 7) * (-12.41367-(-21.91367)));
            yy = 0.42163 + (((tickAnim - 0) / 7) * (0.42163-(0.42163)));
            zz = 4.20772 + (((tickAnim - 0) / 7) * (4.20772-(4.20772)));
        }
        else if (tickAnim >= 7 && tickAnim < 16) {
            xx = -12.41367 + (((tickAnim - 7) / 9) * (-2.76741-(-12.41367)));
            yy = 0.42163 + (((tickAnim - 7) / 9) * (-2.39439-(0.42163)));
            zz = 4.20772 + (((tickAnim - 7) / 9) * (-6.18806-(4.20772)));
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
            yy = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 16) {
            xx = 0 + (((tickAnim - 7) / 9) * (0-(0)));
            yy = 0 + (((tickAnim - 7) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 9) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 16) / 9) * (0-(0)));
            yy = 0 + (((tickAnim - 16) / 9) * (0-(0)));
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
            xx = 3.23707 + (((tickAnim - 7) / 9) * (4.90081-(3.23707)));
            yy = -9.92479 + (((tickAnim - 7) / 9) * (23.18063-(-9.92479)));
            zz = 3.44653 + (((tickAnim - 7) / 9) * (-0.68713-(3.44653)));
        }
        else if (tickAnim >= 16 && tickAnim < 25) {
            xx = 4.90081 + (((tickAnim - 16) / 9) * (3.42262-(4.90081)));
            yy = 23.18063 + (((tickAnim - 16) / 9) * (6.1452-(23.18063)));
            zz = -0.68713 + (((tickAnim - 16) / 9) * (-2.1206-(-0.68713)));
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
            xx = 10.05129 + (((tickAnim - 7) / 9) * (10.04513-(10.05129)));
            yy = -6.7637 + (((tickAnim - 7) / 9) * (20.45884-(-6.7637)));
            zz = -1.81312 + (((tickAnim - 7) / 9) * (-4.45935-(-1.81312)));
        }
        else if (tickAnim >= 16 && tickAnim < 25) {
            xx = 10.04513 + (((tickAnim - 16) / 9) * (10.27609-(10.04513)));
            yy = 20.45884 + (((tickAnim - 16) / 9) * (11.828-(20.45884)));
            zz = -4.45935 + (((tickAnim - 16) / 9) * (3.2051-(-4.45935)));
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
            xx = 3.67214 + (((tickAnim - 11) / 5) * (12.91998-(3.67214)));
            yy = 5.78231 + (((tickAnim - 11) / 5) * (29.96483-(5.78231)));
            zz = 0.83761 + (((tickAnim - 11) / 5) * (4.02032-(0.83761)));
        }
        else if (tickAnim >= 16 && tickAnim < 25) {
            xx = 12.91998 + (((tickAnim - 16) / 9) * (3.6122-(12.91998)));
            yy = 29.96483 + (((tickAnim - 16) / 9) * (7.6738-(29.96483)));
            zz = 4.02032 + (((tickAnim - 16) / 9) * (1.091-(4.02032)));
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
            xx = 4.46645 + (((tickAnim - 11) / 5) * (9.01401-(4.46645)));
            yy = -11.1025 + (((tickAnim - 11) / 5) * (32.12352-(-11.1025)));
            zz = -2.74715 + (((tickAnim - 11) / 5) * (-2.52806-(-2.74715)));
        }
        else if (tickAnim >= 16 && tickAnim < 25) {
            xx = 9.01401 + (((tickAnim - 16) / 9) * (4-(9.01401)));
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
            xx = 15.36869 + (((tickAnim - 16) / 5) * (-31.69605-(15.36869)));
            yy = -2.82785 + (((tickAnim - 16) / 5) * (-1.28539-(-2.82785)));
            zz = 2.61409 + (((tickAnim - 16) / 5) * (1.18822-(2.61409)));
        }
        else if (tickAnim >= 21 && tickAnim < 25) {
            xx = -31.69605 + (((tickAnim - 21) / 4) * (-27-(-31.69605)));
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
            xx = 16 + (((tickAnim - 0) / 8) * (-20.88034-(16)));
            yy = 0 + (((tickAnim - 0) / 8) * (-1.33292-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (1.54255-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 16) {
            xx = -20.88034 + (((tickAnim - 8) / 8) * (-22.18369-(-20.88034)));
            yy = -1.33292 + (((tickAnim - 8) / 8) * (-14.66207-(-1.33292)));
            zz = 1.54255 + (((tickAnim - 8) / 8) * (16.96807-(1.54255)));
        }
        else if (tickAnim >= 16 && tickAnim < 21) {
            xx = -22.18369 + (((tickAnim - 16) / 5) * (72.23469-(-22.18369)));
            yy = -14.66207 + (((tickAnim - 16) / 5) * (-6.66458-(-14.66207)));
            zz = 16.96807 + (((tickAnim - 16) / 5) * (7.71276-(16.96807)));
        }
        else if (tickAnim >= 21 && tickAnim < 25) {
            xx = 72.23469 + (((tickAnim - 21) / 4) * (16-(72.23469)));
            yy = -6.66458 + (((tickAnim - 21) / 4) * (0-(-6.66458)));
            zz = 7.71276 + (((tickAnim - 21) / 4) * (0-(7.71276)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm3, leftArm3.rotateAngleX + (float) Math.toRadians(xx), leftArm3.rotateAngleY + (float) Math.toRadians(yy), leftArm3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 16) {
            xx = 0 + (((tickAnim - 0) / 16) * (0.65-(0)));
            yy = 0 + (((tickAnim - 0) / 16) * (1.1-(0)));
            zz = 0 + (((tickAnim - 0) / 16) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 25) {
            xx = 0.65 + (((tickAnim - 16) / 9) * (0-(0.65)));
            yy = 1.1 + (((tickAnim - 16) / 9) * (0-(1.1)));
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
            xx = -22.78049 + (((tickAnim - 7) / 4) * (-33.57328-(-22.78049)));
            yy = -8.49014 + (((tickAnim - 7) / 4) * (-6.64722-(-8.49014)));
            zz = 0.41083 + (((tickAnim - 7) / 4) * (1.79365-(0.41083)));
        }
        else if (tickAnim >= 11 && tickAnim < 16) {
            xx = -33.57328 + (((tickAnim - 11) / 5) * (-30.02463-(-33.57328)));
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
            xx = 10.29393 + (((tickAnim - 0) / 7) * (10.29393-(10.29393)));
            yy = -4.27613 + (((tickAnim - 0) / 7) * (-4.27613-(-4.27613)));
            zz = 13.12564 + (((tickAnim - 0) / 7) * (13.12564-(13.12564)));
        }
        else if (tickAnim >= 7 && tickAnim < 11) {
            xx = 10.29393 + (((tickAnim - 7) / 4) * (65.31941-(10.29393)));
            yy = -4.27613 + (((tickAnim - 7) / 4) * (-2.33243-(-4.27613)));
            zz = 13.12564 + (((tickAnim - 7) / 4) * (7.15944-(13.12564)));
        }
        else if (tickAnim >= 11 && tickAnim < 16) {
            xx = 65.31941 + (((tickAnim - 11) / 5) * (20.25-(65.31941)));
            yy = -2.33243 + (((tickAnim - 11) / 5) * (0-(-2.33243)));
            zz = 7.15944 + (((tickAnim - 11) / 5) * (0-(7.15944)));
        }
        else if (tickAnim >= 16 && tickAnim < 25) {
            xx = 20.25 + (((tickAnim - 16) / 9) * (10.29393-(20.25)));
            yy = 0 + (((tickAnim - 16) / 9) * (-4.27613-(0)));
            zz = 0 + (((tickAnim - 16) / 9) * (13.12564-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm3, rightArm3.rotateAngleX + (float) Math.toRadians(xx), rightArm3.rotateAngleY + (float) Math.toRadians(yy), rightArm3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (-0.675-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 7) / 4) * (0-(0)));
            yy = -0.675 + (((tickAnim - 7) / 4) * (0.33-(-0.675)));
            zz = 0 + (((tickAnim - 7) / 4) * (-0.575-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 16) {
            xx = 0 + (((tickAnim - 11) / 5) * (0-(0)));
            yy = 0.33 + (((tickAnim - 11) / 5) * (0-(0.33)));
            zz = -0.575 + (((tickAnim - 11) / 5) * (0-(-0.575)));
        }
        else if (tickAnim >= 16 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 16) / 9) * (0-(0)));
            yy = 0 + (((tickAnim - 16) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 16) / 9) * (0-(0)));
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
    public void animHide(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraGastonia entity = (EntityPrehistoricFloraGastonia) entitylivingbaseIn;
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
        this.setRotateAngle(root, root.rotateAngleX + (float) Math.toRadians(xx), root.rotateAngleY + (float) Math.toRadians(yy), root.rotateAngleZ + (float) Math.toRadians(zz));


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
        this.root.rotationPointX = this.root.rotationPointX + (float)(xx);
        this.root.rotationPointY = this.root.rotationPointY - (float)(yy);
        this.root.rotationPointZ = this.root.rotationPointZ + (float)(zz);




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
            xx = 0 + (((tickAnim - 0) / 23) * (38.5-(0)));
            yy = 0 + (((tickAnim - 0) / 23) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 23) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 45) {
            xx = 38.5 + (((tickAnim - 23) / 22) * (38.54569-(38.5)));
            yy = 0 + (((tickAnim - 23) / 22) * (-4.73951-(0)));
            zz = 0 + (((tickAnim - 23) / 22) * (0.31887-(0)));
        }
        else if (tickAnim >= 45 && tickAnim < 117) {
            xx = 38.54569 + (((tickAnim - 45) / 72) * (38.54569-(38.54569)));
            yy = -4.73951 + (((tickAnim - 45) / 72) * (-4.73951-(-4.73951)));
            zz = 0.31887 + (((tickAnim - 45) / 72) * (0.31887-(0.31887)));
        }
        else if (tickAnim >= 117 && tickAnim < 160) {
            xx = 38.54569 + (((tickAnim - 117) / 43) * (0-(38.54569)));
            yy = -4.73951 + (((tickAnim - 117) / 43) * (0-(-4.73951)));
            zz = 0.31887 + (((tickAnim - 117) / 43) * (0-(0.31887)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg2, leftLeg2.rotateAngleX + (float) Math.toRadians(xx), leftLeg2.rotateAngleY + (float) Math.toRadians(yy), leftLeg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 0) / 23) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 23) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 23) * (0-(0)));
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
            xx = 0 + (((tickAnim - 0) / 23) * (38.5-(0)));
            yy = 0 + (((tickAnim - 0) / 23) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 23) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 45) {
            xx = 38.5 + (((tickAnim - 23) / 22) * (38.54569-(38.5)));
            yy = 0 + (((tickAnim - 23) / 22) * (4.73951-(0)));
            zz = 0 + (((tickAnim - 23) / 22) * (-0.31887-(0)));
        }
        else if (tickAnim >= 45 && tickAnim < 117) {
            xx = 38.54569 + (((tickAnim - 45) / 72) * (38.54569-(38.54569)));
            yy = 4.73951 + (((tickAnim - 45) / 72) * (4.73951-(4.73951)));
            zz = -0.31887 + (((tickAnim - 45) / 72) * (-0.31887-(-0.31887)));
        }
        else if (tickAnim >= 117 && tickAnim < 160) {
            xx = 38.54569 + (((tickAnim - 117) / 43) * (0-(38.54569)));
            yy = 4.73951 + (((tickAnim - 117) / 43) * (0-(4.73951)));
            zz = -0.31887 + (((tickAnim - 117) / 43) * (0-(-0.31887)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg2, rightLeg2.rotateAngleX + (float) Math.toRadians(xx), rightLeg2.rotateAngleY + (float) Math.toRadians(yy), rightLeg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 0) / 23) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 23) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 23) * (0-(0)));
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
            xx = 0 + (((tickAnim - 0) / 10) * (-5.36-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 23) {
            xx = -5.36 + (((tickAnim - 10) / 13) * (2-(-5.36)));
            yy = 0 + (((tickAnim - 10) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 13) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 45) {
            xx = 2 + (((tickAnim - 23) / 22) * (-3.25-(2)));
            yy = 0 + (((tickAnim - 23) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 22) * (0-(0)));
        }
        else if (tickAnim >= 45 && tickAnim < 117) {
            xx = -3.25 + (((tickAnim - 45) / 72) * (-3.25-(-3.25)));
            yy = 0 + (((tickAnim - 45) / 72) * (0-(0)));
            zz = 0 + (((tickAnim - 45) / 72) * (0-(0)));
        }
        else if (tickAnim >= 117 && tickAnim < 139) {
            xx = -3.25 + (((tickAnim - 117) / 22) * (-5.56-(-3.25)));
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
            xx = -0.5 + (((tickAnim - 23) / 22) * (-0.5-(-0.5)));
            yy = 0 + (((tickAnim - 23) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 22) * (0-(0)));
        }
        else if (tickAnim >= 45 && tickAnim < 117) {
            xx = -0.5 + (((tickAnim - 45) / 72) * (-0.5-(-0.5)));
            yy = 0 + (((tickAnim - 45) / 72) * (0-(0)));
            zz = 0 + (((tickAnim - 45) / 72) * (0-(0)));
        }
        else if (tickAnim >= 117 && tickAnim < 139) {
            xx = -0.5 + (((tickAnim - 117) / 22) * (-4.99-(-0.5)));
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
            xx = 0 + (((tickAnim - 0) / 45) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 45) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 45) * (0-(0)));
        }
        else if (tickAnim >= 45 && tickAnim < 117) {
            xx = 0 + (((tickAnim - 45) / 72) * (0-(0)));
            yy = 0 + (((tickAnim - 45) / 72) * (0-(0)));
            zz = 0 + (((tickAnim - 45) / 72) * (0-(0)));
        }
        else if (tickAnim >= 117 && tickAnim < 126) {
            xx = 0 + (((tickAnim - 117) / 9) * (12.88-(0)));
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
            xx = -34.75 + (((tickAnim - 23) / 22) * (-47.84658-(-34.75)));
            yy = 0 + (((tickAnim - 23) / 22) * (2.87389-(0)));
            zz = 0 + (((tickAnim - 23) / 22) * (-6.11021-(0)));
        }
        else if (tickAnim >= 45 && tickAnim < 117) {
            xx = -47.84658 + (((tickAnim - 45) / 72) * (-47.84658-(-47.84658)));
            yy = 2.87389 + (((tickAnim - 45) / 72) * (2.87389-(2.87389)));
            zz = -6.11021 + (((tickAnim - 45) / 72) * (-6.11021-(-6.11021)));
        }
        else if (tickAnim >= 117 && tickAnim < 135) {
            xx = -47.84658 + (((tickAnim - 117) / 18) * (-22.6038-(-47.84658)));
            yy = 2.87389 + (((tickAnim - 117) / 18) * (1.65801-(2.87389)));
            zz = -6.11021 + (((tickAnim - 117) / 18) * (-3.52512-(-6.11021)));
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
            yy = 0 + (((tickAnim - 23) / 22) * (0-(0)));
            zz = -0.825 + (((tickAnim - 23) / 22) * (-1.42-(-0.825)));
        }
        else if (tickAnim >= 45 && tickAnim < 117) {
            xx = 0 + (((tickAnim - 45) / 72) * (0-(0)));
            yy = 0 + (((tickAnim - 45) / 72) * (0-(0)));
            zz = -1.42 + (((tickAnim - 45) / 72) * (-1.42-(-1.42)));
        }
        else if (tickAnim >= 117 && tickAnim < 160) {
            xx = 0 + (((tickAnim - 117) / 43) * (0-(0)));
            yy = 0 + (((tickAnim - 117) / 43) * (0-(0)));
            zz = -1.42 + (((tickAnim - 117) / 43) * (0-(-1.42)));
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
            xx = 13.63176 + (((tickAnim - 23) / 22) * (56.49356-(13.63176)));
            yy = -2.1241 + (((tickAnim - 23) / 22) * (-9.86484-(-2.1241)));
            zz = -3.57836 + (((tickAnim - 23) / 22) * (3.33713-(-3.57836)));
        }
        else if (tickAnim >= 45 && tickAnim < 117) {
            xx = 56.49356 + (((tickAnim - 45) / 72) * (56.49356-(56.49356)));
            yy = -9.86484 + (((tickAnim - 45) / 72) * (-9.86484-(-9.86484)));
            zz = 3.33713 + (((tickAnim - 45) / 72) * (3.33713-(3.33713)));
        }
        else if (tickAnim >= 117 && tickAnim < 135) {
            xx = 56.49356 + (((tickAnim - 117) / 18) * (52.09244-(56.49356)));
            yy = -9.86484 + (((tickAnim - 117) / 18) * (-5.69126-(-9.86484)));
            zz = 3.33713 + (((tickAnim - 117) / 18) * (1.92527-(3.33713)));
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
            xx = -34.75 + (((tickAnim - 23) / 22) * (-47.84658-(-34.75)));
            yy = 0 + (((tickAnim - 23) / 22) * (2.87389-(0)));
            zz = 0 + (((tickAnim - 23) / 22) * (6.11021-(0)));
        }
        else if (tickAnim >= 45 && tickAnim < 117) {
            xx = -47.84658 + (((tickAnim - 45) / 72) * (-47.84658-(-47.84658)));
            yy = 2.87389 + (((tickAnim - 45) / 72) * (2.87389-(2.87389)));
            zz = 6.11021 + (((tickAnim - 45) / 72) * (6.11021-(6.11021)));
        }
        else if (tickAnim >= 117 && tickAnim < 125) {
            xx = -47.84658 + (((tickAnim - 117) / 8) * (-43.09814-(-47.84658)));
            yy = 2.87389 + (((tickAnim - 117) / 8) * (1.56758-(2.87389)));
            zz = 6.11021 + (((tickAnim - 117) / 8) * (3.33284-(6.11021)));
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
            yy = 0 + (((tickAnim - 23) / 22) * (0-(0)));
            zz = -0.825 + (((tickAnim - 23) / 22) * (-1.42-(-0.825)));
        }
        else if (tickAnim >= 45 && tickAnim < 117) {
            xx = 0 + (((tickAnim - 45) / 72) * (0-(0)));
            yy = 0 + (((tickAnim - 45) / 72) * (0-(0)));
            zz = -1.42 + (((tickAnim - 45) / 72) * (-1.42-(-1.42)));
        }
        else if (tickAnim >= 117 && tickAnim < 135) {
            xx = 0 + (((tickAnim - 117) / 18) * (0-(0)));
            yy = 0 + (((tickAnim - 117) / 18) * (0-(0)));
            zz = -1.42 + (((tickAnim - 117) / 18) * (0.225-(-1.42)));
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
            xx = 13.63176 + (((tickAnim - 23) / 22) * (56.49356-(13.63176)));
            yy = -2.1241 + (((tickAnim - 23) / 22) * (9.86484-(-2.1241)));
            zz = -3.57836 + (((tickAnim - 23) / 22) * (-3.33713-(-3.57836)));
        }
        else if (tickAnim >= 45 && tickAnim < 117) {
            xx = 56.49356 + (((tickAnim - 45) / 72) * (56.49356-(56.49356)));
            yy = 9.86484 + (((tickAnim - 45) / 72) * (9.86484-(9.86484)));
            zz = -3.33713 + (((tickAnim - 45) / 72) * (-3.33713-(-3.33713)));
        }
        else if (tickAnim >= 117 && tickAnim < 125) {
            xx = 56.49356 + (((tickAnim - 117) / 8) * (76.81467-(56.49356)));
            yy = 9.86484 + (((tickAnim - 117) / 8) * (5.38082-(9.86484)));
            zz = -3.33713 + (((tickAnim - 117) / 8) * (-1.82025-(-3.33713)));
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


    }
    public void animEat(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraGastonia entity = (EntityPrehistoricFloraGastonia) entitylivingbaseIn;
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
        this.setRotateAngle(body2, body2.rotateAngleX + (float) Math.toRadians(xx), body2.rotateAngleY + (float) Math.toRadians(yy), body2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 0) / 12) * (-7.5-(0)));
            yy = 0 + (((tickAnim - 0) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 12) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 23) {
            xx = -7.5 + (((tickAnim - 12) / 11) * (0-(-7.5)));
            yy = 0 + (((tickAnim - 12) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 11) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm, leftArm.rotateAngleX + (float) Math.toRadians(xx), leftArm.rotateAngleY + (float) Math.toRadians(yy), leftArm.rotateAngleZ + (float) Math.toRadians(zz));




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
        this.setRotateAngle(leftArm3, leftArm3.rotateAngleX + (float) Math.toRadians(xx), leftArm3.rotateAngleY + (float) Math.toRadians(yy), leftArm3.rotateAngleZ + (float) Math.toRadians(zz));


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
        this.leftArm3.rotationPointX = this.leftArm3.rotationPointX + (float)(xx);
        this.leftArm3.rotationPointY = this.leftArm3.rotationPointY - (float)(yy);
        this.leftArm3.rotationPointZ = this.leftArm3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 0) / 12) * (-7.5-(0)));
            yy = 0 + (((tickAnim - 0) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 12) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 23) {
            xx = -7.5 + (((tickAnim - 12) / 11) * (0-(-7.5)));
            yy = 0 + (((tickAnim - 12) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 11) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm, rightArm.rotateAngleX + (float) Math.toRadians(xx), rightArm.rotateAngleY + (float) Math.toRadians(yy), rightArm.rotateAngleZ + (float) Math.toRadians(zz));




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
        this.setRotateAngle(rightArm3, rightArm3.rotateAngleX + (float) Math.toRadians(xx), rightArm3.rotateAngleY + (float) Math.toRadians(yy), rightArm3.rotateAngleZ + (float) Math.toRadians(zz));


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
        this.rightArm3.rotationPointX = this.rightArm3.rotationPointX + (float)(xx);
        this.rightArm3.rotationPointY = this.rightArm3.rotationPointY - (float)(yy);
        this.rightArm3.rotationPointZ = this.rightArm3.rotationPointZ + (float)(zz);




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
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(xx), neck.rotateAngleY + (float) Math.toRadians(yy), neck.rotateAngleZ + (float) Math.toRadians(zz));




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




        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 0) / 6) * (9-(0)));
            yy = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 12) {
            xx = 9 + (((tickAnim - 6) / 6) * (-14.25-(9)));
            yy = 0 + (((tickAnim - 6) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 6) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 16) {
            xx = -14.25 + (((tickAnim - 12) / 4) * (0-(-14.25)));
            yy = 0 + (((tickAnim - 12) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 4) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 16) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 16) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 16) / 7) * (0-(0)));
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


    }
    public void animLay(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraGastonia entity = (EntityPrehistoricFloraGastonia) entitylivingbaseIn;
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
        this.setRotateAngle(root, root.rotateAngleX + (float) Math.toRadians(xx), root.rotateAngleY + (float) Math.toRadians(yy), root.rotateAngleZ + (float) Math.toRadians(zz));


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
        this.root.rotationPointX = this.root.rotationPointX + (float)(xx);
        this.root.rotationPointY = this.root.rotationPointY - (float)(yy);
        this.root.rotationPointZ = this.root.rotationPointZ + (float)(zz);




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
            xx = 0 + (((tickAnim - 0) / 20) * (32.5-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 32.5 + (((tickAnim - 20) / 10) * (32.5-(32.5)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 32.5 + (((tickAnim - 30) / 20) * (0-(32.5)));
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
            xx = 0 + (((tickAnim - 0) / 20) * (13.25-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 13.25 + (((tickAnim - 20) / 10) * (13.25-(13.25)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 13.25 + (((tickAnim - 30) / 20) * (0-(13.25)));
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
            xx = 0 + (((tickAnim - 0) / 20) * (32.5-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 32.5 + (((tickAnim - 20) / 10) * (32.5-(32.5)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 32.5 + (((tickAnim - 30) / 20) * (0-(32.5)));
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
            xx = 0 + (((tickAnim - 0) / 20) * (13.25-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 13.25 + (((tickAnim - 20) / 10) * (13.25-(13.25)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 13.25 + (((tickAnim - 30) / 20) * (0-(13.25)));
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
            xx = 0 + (((tickAnim - 0) / 8) * (-5.46-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 20) {
            xx = -5.46 + (((tickAnim - 8) / 12) * (-3.5-(-5.46)));
            yy = 0 + (((tickAnim - 8) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 12) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = -3.5 + (((tickAnim - 20) / 10) * (-3.5-(-3.5)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 37) {
            xx = -3.5 + (((tickAnim - 30) / 7) * (-9.33-(-3.5)));
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
            xx = 0 + (((tickAnim - 0) / 8) * (-5.06-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 20) {
            xx = -5.06 + (((tickAnim - 8) / 12) * (8.25-(-5.06)));
            yy = 0 + (((tickAnim - 8) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 12) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 8.25 + (((tickAnim - 20) / 10) * (8.25-(8.25)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 37) {
            xx = 8.25 + (((tickAnim - 30) / 7) * (5.04-(8.25)));
            yy = 0 + (((tickAnim - 30) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 7) * (0-(0)));
        }
        else if (tickAnim >= 37 && tickAnim < 42) {
            xx = 5.04 + (((tickAnim - 37) / 5) * (-6.56-(5.04)));
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
            xx = -3.5 + (((tickAnim - 8) / 12) * (0-(-3.5)));
            yy = 0 + (((tickAnim - 8) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 12) * (0-(0)));
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
        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(xx), tail4.rotateAngleY + (float) Math.toRadians(yy), tail4.rotateAngleZ + (float) Math.toRadians(zz));




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
    public void animNest(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraGastonia entity = (EntityPrehistoricFloraGastonia) entitylivingbaseIn;
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
    public void animRoar(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraGastonia entity = (EntityPrehistoricFloraGastonia) entitylivingbaseIn;
        int animCycle = 35;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;


        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.876-70))*-2), neck2.rotateAngleY + (float) Math.toRadians(0), neck2.rotateAngleZ + (float) Math.toRadians(0));


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


    }
    public void animRunning(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraGastonia entity = (EntityPrehistoricFloraGastonia) entitylivingbaseIn;
        int animCycle = 29;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        this.setRotateAngle(root, root.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*247/0.5-70))*2), root.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*247))*1.5), root.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*247-20))*2));
        this.root.rotationPointX = this.root.rotationPointX + (float)(0);
        this.root.rotationPointY = this.root.rotationPointY - (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*247/0.5-80))*-0.25);
        this.root.rotationPointZ = this.root.rotationPointZ + (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*247/0.5))*0.35);


        this.setRotateAngle(sidespike9, sidespike9.rotateAngleX + (float) Math.toRadians(2.75), sidespike9.rotateAngleY + (float) Math.toRadians(0), sidespike9.rotateAngleZ + (float) Math.toRadians(-5));


        this.setRotateAngle(sidespike27, sidespike27.rotateAngleX + (float) Math.toRadians(2.75), sidespike27.rotateAngleY + (float) Math.toRadians(0), sidespike27.rotateAngleZ + (float) Math.toRadians(5));



        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 2.25 + (((tickAnim - 0) / 8) * (16.75-(2.25)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 14) {
            xx = 16.75 + (((tickAnim - 8) / 6) * (-4.56831-(16.75)));
            yy = 0 + (((tickAnim - 8) / 6) * (0.34182-(0)));
            zz = 0 + (((tickAnim - 8) / 6) * (0.69186-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 18) {
            xx = -4.56831 + (((tickAnim - 14) / 4) * (-15.25-(-4.56831)));
            yy = 0.34182 + (((tickAnim - 14) / 4) * (0-(0.34182)));
            zz = 0.69186 + (((tickAnim - 14) / 4) * (0-(0.69186)));
        }
        else if (tickAnim >= 18 && tickAnim < 29) {
            xx = -15.25 + (((tickAnim - 18) / 11) * (2.25-(-15.25)));
            yy = 0 + (((tickAnim - 18) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 11) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg, leftLeg.rotateAngleX + (float) Math.toRadians(xx), leftLeg.rotateAngleY + (float) Math.toRadians(yy), leftLeg.rotateAngleZ + (float) Math.toRadians(zz));




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
        else if (tickAnim >= 14 && tickAnim < 18) {
            xx = -17.25 + (((tickAnim - 14) / 4) * (-13-(-17.25)));
            yy = 0 + (((tickAnim - 14) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 4) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 29) {
            xx = -13 + (((tickAnim - 18) / 11) * (0-(-13)));
            yy = 0 + (((tickAnim - 18) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 11) * (0-(0)));
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
        else if (tickAnim >= 14 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 14) / 4) * (0-(0)));
            yy = 1.1 + (((tickAnim - 14) / 4) * (0-(1.1)));
            zz = 0 + (((tickAnim - 14) / 4) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 29) {
            xx = 0 + (((tickAnim - 18) / 11) * (0-(0)));
            yy = 0 + (((tickAnim - 18) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 11) * (0-(0)));
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
        else if (tickAnim >= 8 && tickAnim < 11) {
            xx = 14.25 + (((tickAnim - 8) / 3) * (-26.69-(14.25)));
            yy = 0 + (((tickAnim - 8) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 3) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 14) {
            xx = -26.69 + (((tickAnim - 11) / 3) * (-11.5-(-26.69)));
            yy = 0 + (((tickAnim - 11) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 3) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 18) {
            xx = -11.5 + (((tickAnim - 14) / 4) * (15-(-11.5)));
            yy = 0 + (((tickAnim - 14) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 4) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 29) {
            xx = 15 + (((tickAnim - 18) / 11) * (0-(15)));
            yy = 0 + (((tickAnim - 18) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 11) * (0-(0)));
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
        else if (tickAnim >= 8 && tickAnim < 11) {
            xx = 21 + (((tickAnim - 8) / 3) * (79.31-(21)));
            yy = 0 + (((tickAnim - 8) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 3) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 14) {
            xx = 79.31 + (((tickAnim - 11) / 3) * (62.75-(79.31)));
            yy = 0 + (((tickAnim - 11) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 3) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 18) {
            xx = 62.75 + (((tickAnim - 14) / 4) * (12.75-(62.75)));
            yy = 0 + (((tickAnim - 14) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 4) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 29) {
            xx = 12.75 + (((tickAnim - 18) / 11) * (0-(12.75)));
            yy = 0 + (((tickAnim - 18) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 11) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg4, leftLeg4.rotateAngleX + (float) Math.toRadians(xx), leftLeg4.rotateAngleY + (float) Math.toRadians(yy), leftLeg4.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            yy = -0.35 + (((tickAnim - 0) / 8) * (0.025-(-0.35)));
            zz = 0 + (((tickAnim - 0) / 8) * (0.35-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 8) / 3) * (0-(0)));
            yy = 0.025 + (((tickAnim - 8) / 3) * (0-(0.025)));
            zz = 0.35 + (((tickAnim - 8) / 3) * (-0.175-(0.35)));
        }
        else if (tickAnim >= 11 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 11) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 11) / 3) * (0-(0)));
            zz = -0.175 + (((tickAnim - 11) / 3) * (-0.425-(-0.175)));
        }
        else if (tickAnim >= 14 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 14) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 14) / 4) * (-0.4-(0)));
            zz = -0.425 + (((tickAnim - 14) / 4) * (0-(-0.425)));
        }
        else if (tickAnim >= 18 && tickAnim < 29) {
            xx = 0 + (((tickAnim - 18) / 11) * (0-(0)));
            yy = -0.4 + (((tickAnim - 18) / 11) * (-0.35-(-0.4)));
            zz = 0 + (((tickAnim - 18) / 11) * (0-(0)));
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
            xx = -6.81831 + (((tickAnim - 0) / 3) * (-15.25-(-6.81831)));
            yy = 0.34182 + (((tickAnim - 0) / 3) * (0-(0.34182)));
            zz = 0.69186 + (((tickAnim - 0) / 3) * (0-(0.69186)));
        }
        else if (tickAnim >= 3 && tickAnim < 22) {
            xx = -15.25 + (((tickAnim - 3) / 19) * (16.75-(-15.25)));
            yy = 0 + (((tickAnim - 3) / 19) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 19) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 29) {
            xx = 16.75 + (((tickAnim - 22) / 7) * (-6.81831-(16.75)));
            yy = 0 + (((tickAnim - 22) / 7) * (0.34182-(0)));
            zz = 0 + (((tickAnim - 22) / 7) * (0.69186-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg, rightLeg.rotateAngleX + (float) Math.toRadians(xx), rightLeg.rotateAngleY + (float) Math.toRadians(yy), rightLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = -12.25 + (((tickAnim - 0) / 3) * (-13-(-12.25)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 22) {
            xx = -13 + (((tickAnim - 3) / 19) * (7.75-(-13)));
            yy = 0 + (((tickAnim - 3) / 19) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 19) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 23) {
            xx = 7.75 + (((tickAnim - 22) / 1) * (8.08+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*10-(7.75)));
            yy = 0 + (((tickAnim - 22) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 22) / 1) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 29) {
            xx = 8.08+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*10 + (((tickAnim - 23) / 6) * (-12.25-(8.08+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*10)));
            yy = 0 + (((tickAnim - 23) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 6) * (0-(0)));
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
        else if (tickAnim >= 3 && tickAnim < 22) {
            xx = 0 + (((tickAnim - 3) / 19) * (0-(0)));
            yy = 0 + (((tickAnim - 3) / 19) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 19) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 29) {
            xx = 0 + (((tickAnim - 22) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 22) / 7) * (1.1-(0)));
            zz = 0 + (((tickAnim - 22) / 7) * (0-(0)));
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
        else if (tickAnim >= 3 && tickAnim < 22) {
            xx = 13.5 + (((tickAnim - 3) / 19) * (14.25-(13.5)));
            yy = 0 + (((tickAnim - 3) / 19) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 19) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 25) {
            xx = 14.25 + (((tickAnim - 22) / 3) * (-27.64-(14.25)));
            yy = 0 + (((tickAnim - 22) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 22) / 3) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 29) {
            xx = -27.64 + (((tickAnim - 25) / 4) * (-11.5-(-27.64)));
            yy = 0 + (((tickAnim - 25) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 4) * (0-(0)));
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
        else if (tickAnim >= 15 && tickAnim < 22) {
            xx = -19.5 + (((tickAnim - 15) / 7) * (21-(-19.5)));
            yy = 0 + (((tickAnim - 15) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 7) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 25) {
            xx = 21 + (((tickAnim - 22) / 3) * (76.45-(21)));
            yy = 0 + (((tickAnim - 22) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 22) / 3) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 28) {
            xx = 76.45 + (((tickAnim - 25) / 3) * (76.45-(76.45)));
            yy = 0 + (((tickAnim - 25) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 3) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 29) {
            xx = 76.45 + (((tickAnim - 28) / 1) * (62.75-(76.45)));
            yy = 0 + (((tickAnim - 28) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 1) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg4, rightLeg4.rotateAngleX + (float) Math.toRadians(xx), rightLeg4.rotateAngleY + (float) Math.toRadians(yy), rightLeg4.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (-0.4-(0)));
            zz = -0.425 + (((tickAnim - 0) / 3) * (0-(-0.425)));
        }
        else if (tickAnim >= 3 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 3) / 4) * (0-(0)));
            yy = -0.4 + (((tickAnim - 3) / 4) * (0.145-(-0.4)));
            zz = 0 + (((tickAnim - 3) / 4) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 7) / 2) * (0-(0)));
            yy = 0.145 + (((tickAnim - 7) / 2) * (0.375-(0.145)));
            zz = 0 + (((tickAnim - 7) / 2) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 9) / 6) * (0-(0)));
            yy = 0.375 + (((tickAnim - 9) / 6) * (0.275-(0.375)));
            zz = 0 + (((tickAnim - 9) / 6) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 22) {
            xx = 0 + (((tickAnim - 15) / 7) * (0-(0)));
            yy = 0.275 + (((tickAnim - 15) / 7) * (0.525-(0.275)));
            zz = 0 + (((tickAnim - 15) / 7) * (0.575-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 22) / 3) * (0-(0)));
            yy = 0.525 + (((tickAnim - 22) / 3) * (0.24-(0.525)));
            zz = 0.575 + (((tickAnim - 22) / 3) * (-0.685-(0.575)));
        }
        else if (tickAnim >= 25 && tickAnim < 29) {
            xx = 0 + (((tickAnim - 25) / 4) * (0-(0)));
            yy = 0.24 + (((tickAnim - 25) / 4) * (0-(0.24)));
            zz = -0.685 + (((tickAnim - 25) / 4) * (-0.425-(-0.685)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightLeg4.rotationPointX = this.rightLeg4.rotationPointX + (float)(xx);
        this.rightLeg4.rotationPointY = this.rightLeg4.rotationPointY - (float)(yy);
        this.rightLeg4.rotationPointZ = this.rightLeg4.rotationPointZ + (float)(zz);



        this.setRotateAngle(tail, tail.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*247/0.5-60))*-0.5), tail.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*247-50))*-3), tail.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*247-20))*1));


        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*247/0.5-90))*1), tail2.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*247-100))*-5), tail2.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*247-20))*1));


        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*247/0.5-150))*1), tail3.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*247-150))*-8), tail3.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*247-20))*1));


        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*247/0.5-200))*1.5), tail4.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*247-200))*-12), tail4.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*247-20))*1));


        this.setRotateAngle(tail5, tail5.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*247/0.5-250))*1.5), tail5.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*247-250))*-15), tail5.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*247-20))*1));


        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*247/0.5-250))*2), body.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*247-50))*-2.5), body.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*247-80))*2));


        this.setRotateAngle(body2, body2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*247/0.5-150))*-2.5), body2.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*247-150))*1), body2.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*247-70))*-2));



        if (tickAnim >= 0 && tickAnim < 17) {
            xx = -47 + (((tickAnim - 0) / 17) * (7.5-(-47)));
            yy = 0 + (((tickAnim - 0) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 17) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 23) {
            xx = 7.5 + (((tickAnim - 17) / 6) * (-22.85366-(7.5)));
            yy = 0 + (((tickAnim - 17) / 6) * (2.60239-(0)));
            zz = 0 + (((tickAnim - 17) / 6) * (-4.56118-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 29) {
            xx = -22.85366 + (((tickAnim - 23) / 6) * (-47-(-22.85366)));
            yy = 2.60239 + (((tickAnim - 23) / 6) * (0-(2.60239)));
            zz = -4.56118 + (((tickAnim - 23) / 6) * (0-(-4.56118)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm, leftArm.rotateAngleX + (float) Math.toRadians(xx), leftArm.rotateAngleY + (float) Math.toRadians(yy), leftArm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 17) {
            xx = 34 + (((tickAnim - 0) / 17) * (19-(34)));
            yy = 0 + (((tickAnim - 0) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 17) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 23) {
            xx = 19 + (((tickAnim - 17) / 6) * (-33.2256+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150+30))*-30-(19)));
            yy = 0 + (((tickAnim - 17) / 6) * (4.46114-(0)));
            zz = 0 + (((tickAnim - 17) / 6) * (0.90956-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 29) {
            xx = -33.2256+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150+30))*-30 + (((tickAnim - 23) / 6) * (34-(-33.2256+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150+30))*-30)));
            yy = 4.46114 + (((tickAnim - 23) / 6) * (0-(4.46114)));
            zz = 0.90956 + (((tickAnim - 23) / 6) * (0-(0.90956)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm2, leftArm2.rotateAngleX + (float) Math.toRadians(xx), leftArm2.rotateAngleY + (float) Math.toRadians(yy), leftArm2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 17) {
            xx = 0 + (((tickAnim - 0) / 17) * (0-(0)));
            yy = 1 + (((tickAnim - 0) / 17) * (0-(1)));
            zz = 0.275 + (((tickAnim - 0) / 17) * (-0.575-(0.275)));
        }
        else if (tickAnim >= 17 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 17) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 17) / 6) * (0-(0)));
            zz = -0.575 + (((tickAnim - 17) / 6) * (-0.65-(-0.575)));
        }
        else if (tickAnim >= 23 && tickAnim < 29) {
            xx = 0 + (((tickAnim - 23) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 23) / 6) * (1-(0)));
            zz = -0.65 + (((tickAnim - 23) / 6) * (0.275-(-0.65)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftArm2.rotationPointX = this.leftArm2.rotationPointX + (float)(xx);
        this.leftArm2.rotationPointY = this.leftArm2.rotationPointY - (float)(yy);
        this.leftArm2.rotationPointZ = this.leftArm2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 12.25257 + (((tickAnim - 0) / 7) * (0-(12.25257)));
            yy = 5.90404 + (((tickAnim - 0) / 7) * (0-(5.90404)));
            zz = 2.76612 + (((tickAnim - 0) / 7) * (0-(2.76612)));
        }
        else if (tickAnim >= 7 && tickAnim < 17) {
            xx = 0 + (((tickAnim - 7) / 10) * (52.75-(0)));
            yy = 0 + (((tickAnim - 7) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 10) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 20) {
            xx = 52.75 + (((tickAnim - 17) / 3) * (85.77-(52.75)));
            yy = 0 + (((tickAnim - 17) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 17) / 3) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 23) {
            xx = 85.77 + (((tickAnim - 20) / 3) * (87.28-(85.77)));
            yy = 0 + (((tickAnim - 20) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 3) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 29) {
            xx = 87.28 + (((tickAnim - 23) / 6) * (12.25257-(87.28)));
            yy = 0 + (((tickAnim - 23) / 6) * (5.90404-(0)));
            zz = 0 + (((tickAnim - 23) / 6) * (2.76612-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm3, leftArm3.rotateAngleX + (float) Math.toRadians(xx), leftArm3.rotateAngleY + (float) Math.toRadians(yy), leftArm3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            yy = 1.225 + (((tickAnim - 0) / 7) * (1.95-(1.225)));
            zz = -0.175 + (((tickAnim - 0) / 7) * (-0.05-(-0.175)));
        }
        else if (tickAnim >= 7 && tickAnim < 17) {
            xx = 0 + (((tickAnim - 7) / 10) * (0-(0)));
            yy = 1.95 + (((tickAnim - 7) / 10) * (0.85-(1.95)));
            zz = -0.05 + (((tickAnim - 7) / 10) * (-0.175-(-0.05)));
        }
        else if (tickAnim >= 17 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 17) / 3) * (0-(0)));
            yy = 0.85 + (((tickAnim - 17) / 3) * (0.73-(0.85)));
            zz = -0.175 + (((tickAnim - 17) / 3) * (-0.07-(-0.175)));
        }
        else if (tickAnim >= 20 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 20) / 3) * (0-(0)));
            yy = 0.73 + (((tickAnim - 20) / 3) * (-0.695-(0.73)));
            zz = -0.07 + (((tickAnim - 20) / 3) * (0.055-(-0.07)));
        }
        else if (tickAnim >= 23 && tickAnim < 29) {
            xx = 0 + (((tickAnim - 23) / 6) * (0-(0)));
            yy = -0.695 + (((tickAnim - 23) / 6) * (1.225-(-0.695)));
            zz = 0.055 + (((tickAnim - 23) / 6) * (-0.175-(0.055)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftArm3.rotationPointX = this.leftArm3.rotationPointX + (float)(xx);
        this.leftArm3.rotationPointY = this.leftArm3.rotationPointY - (float)(yy);
        this.leftArm3.rotationPointZ = this.leftArm3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 7.5 + (((tickAnim - 0) / 6) * (-22.85366-(7.5)));
            yy = 0 + (((tickAnim - 0) / 6) * (-2.60239-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (4.56118-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 12) {
            xx = -22.85366 + (((tickAnim - 6) / 6) * (-42.25-(-22.85366)));
            yy = -2.60239 + (((tickAnim - 6) / 6) * (0-(-2.60239)));
            zz = 4.56118 + (((tickAnim - 6) / 6) * (0-(4.56118)));
        }
        else if (tickAnim >= 12 && tickAnim < 29) {
            xx = -42.25 + (((tickAnim - 12) / 17) * (7.5-(-42.25)));
            yy = 0 + (((tickAnim - 12) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 17) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm, rightArm.rotateAngleX + (float) Math.toRadians(xx), rightArm.rotateAngleY + (float) Math.toRadians(yy), rightArm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 19 + (((tickAnim - 0) / 6) * (-42.4756+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150+30))*30-(19)));
            yy = 0 + (((tickAnim - 0) / 6) * (-4.46114-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (-0.90956-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 12) {
            xx = -42.4756+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150+30))*30 + (((tickAnim - 6) / 6) * (23-(-42.4756+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150+30))*30)));
            yy = -4.46114 + (((tickAnim - 6) / 6) * (0-(-4.46114)));
            zz = -0.90956 + (((tickAnim - 6) / 6) * (0-(-0.90956)));
        }
        else if (tickAnim >= 12 && tickAnim < 29) {
            xx = 23 + (((tickAnim - 12) / 17) * (19-(23)));
            yy = 0 + (((tickAnim - 12) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 17) * (0-(0)));
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
            zz = 0 + (((tickAnim - 0) / 6) * (-0.65-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 6) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 6) / 6) * (0.575-(0)));
            zz = -0.65 + (((tickAnim - 6) / 6) * (0.45-(-0.65)));
        }
        else if (tickAnim >= 12 && tickAnim < 29) {
            xx = 0 + (((tickAnim - 12) / 17) * (0-(0)));
            yy = 0.575 + (((tickAnim - 12) / 17) * (0-(0.575)));
            zz = 0.45 + (((tickAnim - 12) / 17) * (0-(0.45)));
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
            xx = 53.43419 + (((tickAnim - 0) / 3) * (85.77-(53.43419)));
            yy = -3.19023 + (((tickAnim - 0) / 3) * (0-(-3.19023)));
            zz = 2.72719 + (((tickAnim - 0) / 3) * (0-(2.72719)));
        }
        else if (tickAnim >= 3 && tickAnim < 6) {
            xx = 85.77 + (((tickAnim - 3) / 3) * (72.78-(85.77)));
            yy = 0 + (((tickAnim - 3) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 3) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 10) {
            xx = 72.78 + (((tickAnim - 6) / 4) * (13.16313-(72.78)));
            yy = 0 + (((tickAnim - 6) / 4) * (-4.98264-(0)));
            zz = 0 + (((tickAnim - 6) / 4) * (-2.28717-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 12) {
            xx = 13.16313 + (((tickAnim - 10) / 2) * (22.10525-(13.16313)));
            yy = -4.98264 + (((tickAnim - 10) / 2) * (0.50426-(-4.98264)));
            zz = -2.28717 + (((tickAnim - 10) / 2) * (-1.51489-(-2.28717)));
        }
        else if (tickAnim >= 12 && tickAnim < 23) {
            xx = 22.10525 + (((tickAnim - 12) / 11) * (-9.25675-(22.10525)));
            yy = 0.50426 + (((tickAnim - 12) / 11) * (2.74557-(0.50426)));
            zz = -1.51489 + (((tickAnim - 12) / 11) * (0.15686-(-1.51489)));
        }
        else if (tickAnim >= 23 && tickAnim < 29) {
            xx = -9.25675 + (((tickAnim - 23) / 6) * (53.43419-(-9.25675)));
            yy = 2.74557 + (((tickAnim - 23) / 6) * (-3.19023-(2.74557)));
            zz = 0.15686 + (((tickAnim - 23) / 6) * (2.72719-(0.15686)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm3, rightArm3.rotateAngleX + (float) Math.toRadians(xx), rightArm3.rotateAngleY + (float) Math.toRadians(yy), rightArm3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0.2 + (((tickAnim - 0) / 3) * (0-(0.2)));
            yy = 0.6 + (((tickAnim - 0) / 3) * (0.73-(0.6)));
            zz = -0.425 + (((tickAnim - 0) / 3) * (-0.37-(-0.425)));
        }
        else if (tickAnim >= 3 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 3) / 3) * (0-(0)));
            yy = 0.73 + (((tickAnim - 3) / 3) * (0.33-(0.73)));
            zz = -0.37 + (((tickAnim - 3) / 3) * (-0.32-(-0.37)));
        }
        else if (tickAnim >= 6 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 6) / 4) * (0-(0)));
            yy = 0.33 + (((tickAnim - 6) / 4) * (0.53-(0.33)));
            zz = -0.32 + (((tickAnim - 6) / 4) * (-0.14-(-0.32)));
        }
        else if (tickAnim >= 10 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 10) / 2) * (0-(0)));
            yy = 0.53 + (((tickAnim - 10) / 2) * (0.475-(0.53)));
            zz = -0.14 + (((tickAnim - 10) / 2) * (-0.575-(-0.14)));
        }
        else if (tickAnim >= 12 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 12) / 7) * (0-(0)));
            yy = 0.475 + (((tickAnim - 12) / 7) * (1.625-(0.475)));
            zz = -0.575 + (((tickAnim - 12) / 7) * (-0.725-(-0.575)));
        }
        else if (tickAnim >= 19 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 19) / 4) * (0-(0)));
            yy = 1.625 + (((tickAnim - 19) / 4) * (1.625-(1.625)));
            zz = -0.725 + (((tickAnim - 19) / 4) * (-0.725-(-0.725)));
        }
        else if (tickAnim >= 23 && tickAnim < 29) {
            xx = 0 + (((tickAnim - 23) / 6) * (0.2-(0)));
            yy = 1.625 + (((tickAnim - 23) / 6) * (0.6-(1.625)));
            zz = -0.725 + (((tickAnim - 23) / 6) * (-0.425-(-0.725)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightArm3.rotationPointX = this.rightArm3.rotationPointX + (float)(xx);
        this.rightArm3.rotationPointY = this.rightArm3.rotationPointY - (float)(yy);
        this.rightArm3.rotationPointZ = this.rightArm3.rotationPointZ + (float)(zz);



        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(-3+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*247/0.5-150))*2), neck.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*247-150))*-1), neck.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*247-100))*-2));


        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(-2+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*247/0.5-200))*2), neck2.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*247-120))*1), neck2.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*247-150))*-2));


        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(-2+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*247/0.5-250))*0.5), head.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*247-220))*-1), head.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*247-200))*1.5));

    }
    public void animWalking(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraGastonia entity = (EntityPrehistoricFloraGastonia) entitylivingbaseIn;
        int animCycle = 42;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        this.setRotateAngle(root, root.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*169/0.5-50))*-1), root.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*169-50))*1), root.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*169-20))*1.5));
        this.root.rotationPointX = this.root.rotationPointX + (float)(0);
        this.root.rotationPointY = this.root.rotationPointY - (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*169/0.5-80))*-0.15);
        this.root.rotationPointZ = this.root.rotationPointZ + (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*169/0.5))*0.25);


        this.setRotateAngle(sidespike9, sidespike9.rotateAngleX + (float) Math.toRadians(2.75), sidespike9.rotateAngleY + (float) Math.toRadians(0), sidespike9.rotateAngleZ + (float) Math.toRadians(-5));


        this.setRotateAngle(sidespike27, sidespike27.rotateAngleX + (float) Math.toRadians(2.75), sidespike27.rotateAngleY + (float) Math.toRadians(0), sidespike27.rotateAngleZ + (float) Math.toRadians(5));



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
        this.setRotateAngle(leftLeg, leftLeg.rotateAngleX + (float) Math.toRadians(xx), leftLeg.rotateAngleY + (float) Math.toRadians(yy), leftLeg.rotateAngleZ + (float) Math.toRadians(zz));




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
            xx = -11.5 + (((tickAnim - 21) / 5) * (7.5-(-11.5)));
            yy = 0 + (((tickAnim - 21) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 21) / 5) * (0-(0)));
        }
        else if (tickAnim >= 26 && tickAnim < 43) {
            xx = 7.5 + (((tickAnim - 26) / 17) * (0-(7.5)));
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
            xx = 62.75 + (((tickAnim - 21) / 5) * (20.75-(62.75)));
            yy = 0 + (((tickAnim - 21) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 21) / 5) * (0-(0)));
        }
        else if (tickAnim >= 26 && tickAnim < 43) {
            xx = 20.75 + (((tickAnim - 26) / 17) * (0-(20.75)));
            yy = 0 + (((tickAnim - 26) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 26) / 17) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg4, leftLeg4.rotateAngleX + (float) Math.toRadians(xx), leftLeg4.rotateAngleY + (float) Math.toRadians(yy), leftLeg4.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 21) {
            xx = 0 + (((tickAnim - 13) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 13) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 8) * (-0.425-(0)));
        }
        else if (tickAnim >= 21 && tickAnim < 26) {
            xx = 0 + (((tickAnim - 21) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 21) / 5) * (-0.075-(0)));
            zz = -0.425 + (((tickAnim - 21) / 5) * (0-(-0.425)));
        }
        else if (tickAnim >= 26 && tickAnim < 43) {
            xx = 0 + (((tickAnim - 26) / 17) * (0-(0)));
            yy = -0.075 + (((tickAnim - 26) / 17) * (0-(-0.075)));
            zz = 0 + (((tickAnim - 26) / 17) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftLeg4.rotationPointX = this.leftLeg4.rotationPointX + (float)(xx);
        this.leftLeg4.rotationPointY = this.leftLeg4.rotationPointY - (float)(yy);
        this.leftLeg4.rotationPointZ = this.leftLeg4.rotationPointZ + (float)(zz);




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
        this.setRotateAngle(rightLeg, rightLeg.rotateAngleX + (float) Math.toRadians(xx), rightLeg.rotateAngleY + (float) Math.toRadians(yy), rightLeg.rotateAngleZ + (float) Math.toRadians(zz));




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
            xx = -11.5 + (((tickAnim - 0) / 4) * (7.5-(-11.5)));
            yy = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 32) {
            xx = 7.5 + (((tickAnim - 4) / 28) * (14.25-(7.5)));
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
            xx = 62.75 + (((tickAnim - 0) / 4) * (20.75-(62.75)));
            yy = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 13) {
            xx = 20.75 + (((tickAnim - 4) / 9) * (1-(20.75)));
            yy = 0 + (((tickAnim - 4) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 9) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 23) {
            xx = 1 + (((tickAnim - 13) / 10) * (-19.5-(1)));
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
        this.setRotateAngle(rightLeg4, rightLeg4.rotateAngleX + (float) Math.toRadians(xx), rightLeg4.rotateAngleY + (float) Math.toRadians(yy), rightLeg4.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 4) * (-0.075-(0)));
            zz = -0.425 + (((tickAnim - 0) / 4) * (0-(-0.425)));
        }
        else if (tickAnim >= 4 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 4) / 5) * (0-(0)));
            yy = -0.075 + (((tickAnim - 4) / 5) * (0.445-(-0.075)));
            zz = 0 + (((tickAnim - 4) / 5) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 9) / 4) * (0-(0)));
            yy = 0.445 + (((tickAnim - 9) / 4) * (0.7-(0.445)));
            zz = 0 + (((tickAnim - 9) / 4) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 13) / 10) * (0-(0)));
            yy = 0.7 + (((tickAnim - 13) / 10) * (0.275-(0.7)));
            zz = 0 + (((tickAnim - 13) / 10) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 32) {
            xx = 0 + (((tickAnim - 23) / 9) * (0-(0)));
            yy = 0.275 + (((tickAnim - 23) / 9) * (0-(0.275)));
            zz = 0 + (((tickAnim - 23) / 9) * (0-(0)));
        }
        else if (tickAnim >= 32 && tickAnim < 43) {
            xx = 0 + (((tickAnim - 32) / 11) * (0-(0)));
            yy = 0 + (((tickAnim - 32) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 32) / 11) * (-0.425-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightLeg4.rotationPointX = this.rightLeg4.rotationPointX + (float)(xx);
        this.rightLeg4.rotationPointY = this.rightLeg4.rotationPointY - (float)(yy);
        this.rightLeg4.rotationPointZ = this.rightLeg4.rotationPointZ + (float)(zz);



        this.setRotateAngle(tail, tail.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*169/0.5-30))*0.5), tail.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*169))*0.5), tail.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*169-20))*1));


        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*169/0.5-100))*-0.8), tail2.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*169-50))*1), tail2.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*169-40))*-1));


        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*169/0.5-150))*-1), tail3.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*169-100))*1.5), tail3.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*169-60))*-1));


        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*169/0.5-150))*-1.5), tail4.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*169-150))*2), tail4.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*169-80))*-1));


        this.setRotateAngle(tail5, tail5.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*169/0.5-200))*-2), tail5.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*169-200))*2.5), tail5.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*169-100))*-1));


        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*169/0.5-200))*-1), body.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*169-50))*-1), body.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*169-80))*1.5));


        this.setRotateAngle(sidespike5, sidespike5.rotateAngleX + (float) Math.toRadians(0), sidespike5.rotateAngleY + (float) Math.toRadians(0), sidespike5.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*169-70))*1));


        this.setRotateAngle(sidespike23, sidespike23.rotateAngleX + (float) Math.toRadians(0), sidespike23.rotateAngleY + (float) Math.toRadians(0), sidespike23.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*169-70))*1));


        this.setRotateAngle(sidespike6, sidespike6.rotateAngleX + (float) Math.toRadians(0), sidespike6.rotateAngleY + (float) Math.toRadians(0), sidespike6.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*169-90))*1));


        this.setRotateAngle(sidespike24, sidespike24.rotateAngleX + (float) Math.toRadians(0), sidespike24.rotateAngleY + (float) Math.toRadians(0), sidespike24.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*169-90))*1));


        this.setRotateAngle(sidespike7, sidespike7.rotateAngleX + (float) Math.toRadians(0), sidespike7.rotateAngleY + (float) Math.toRadians(0), sidespike7.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*169-120))*1));


        this.setRotateAngle(sidespike25, sidespike25.rotateAngleX + (float) Math.toRadians(0), sidespike25.rotateAngleY + (float) Math.toRadians(0), sidespike25.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*169-120))*1));


        this.setRotateAngle(sidespike8, sidespike8.rotateAngleX + (float) Math.toRadians(0), sidespike8.rotateAngleY + (float) Math.toRadians(0), sidespike8.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*169-140))*1));


        this.setRotateAngle(sidespike26, sidespike26.rotateAngleX + (float) Math.toRadians(0), sidespike26.rotateAngleY + (float) Math.toRadians(0), sidespike26.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*169-140))*1));


        this.setRotateAngle(body2, body2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*169/0.5-150))*-0.5), body2.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*169-150))*0.5), body2.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*169-70))*-1.5));


        this.setRotateAngle(sidespike4, sidespike4.rotateAngleX + (float) Math.toRadians(0), sidespike4.rotateAngleY + (float) Math.toRadians(0), sidespike4.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*169-30))*-1.5));


        this.setRotateAngle(sidespike22, sidespike22.rotateAngleX + (float) Math.toRadians(0), sidespike22.rotateAngleY + (float) Math.toRadians(0), sidespike22.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*169-30))*-1.5));



        if (tickAnim >= 0 && tickAnim < 25) {
            xx = -50.75 + (((tickAnim - 0) / 25) * (7.5-(-50.75)));
            yy = 0 + (((tickAnim - 0) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 25) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 33) {
            xx = 7.5 + (((tickAnim - 25) / 8) * (-22.85366-(7.5)));
            yy = 0 + (((tickAnim - 25) / 8) * (2.60239-(0)));
            zz = 0 + (((tickAnim - 25) / 8) * (-4.56118-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 41) {
            xx = -22.85366 + (((tickAnim - 33) / 8) * (-53-(-22.85366)));
            yy = 2.60239 + (((tickAnim - 33) / 8) * (0-(2.60239)));
            zz = -4.56118 + (((tickAnim - 33) / 8) * (0-(-4.56118)));
        }
        else if (tickAnim >= 41 && tickAnim < 43) {
            xx = -53 + (((tickAnim - 41) / 2) * (-50.75-(-53)));
            yy = 0 + (((tickAnim - 41) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 41) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm, leftArm.rotateAngleX + (float) Math.toRadians(xx), leftArm.rotateAngleY + (float) Math.toRadians(yy), leftArm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 25) {
            xx = 37 + (((tickAnim - 0) / 25) * (19-(37)));
            yy = 0 + (((tickAnim - 0) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 25) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 33) {
            xx = 19 + (((tickAnim - 25) / 8) * (-27.4756+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150+30))*-20-(19)));
            yy = 0 + (((tickAnim - 25) / 8) * (4.46114-(0)));
            zz = 0 + (((tickAnim - 25) / 8) * (0.90956-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 41) {
            xx = -27.4756+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150+30))*-20 + (((tickAnim - 33) / 8) * (36.5-(-27.4756+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150+30))*-20)));
            yy = 4.46114 + (((tickAnim - 33) / 8) * (0-(4.46114)));
            zz = 0.90956 + (((tickAnim - 33) / 8) * (0-(0.90956)));
        }
        else if (tickAnim >= 41 && tickAnim < 43) {
            xx = 36.5 + (((tickAnim - 41) / 2) * (37-(36.5)));
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
            yy = 1.75 + (((tickAnim - 0) / 25) * (0.55-(1.75)));
            zz = 0.4 + (((tickAnim - 0) / 25) * (0.525-(0.4)));
        }
        else if (tickAnim >= 25 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 25) / 8) * (0-(0)));
            yy = 0.55 + (((tickAnim - 25) / 8) * (0.45-(0.55)));
            zz = 0.525 + (((tickAnim - 25) / 8) * (0.625-(0.525)));
        }
        else if (tickAnim >= 33 && tickAnim < 41) {
            xx = 0 + (((tickAnim - 33) / 8) * (0-(0)));
            yy = 0.45 + (((tickAnim - 33) / 8) * (1.75-(0.45)));
            zz = 0.625 + (((tickAnim - 33) / 8) * (0.4-(0.625)));
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
            xx = 14 + (((tickAnim - 0) / 9) * (0-(14)));
            yy = 0 + (((tickAnim - 0) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 9) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 9) / 16) * (52.75-(0)));
            yy = 0 + (((tickAnim - 9) / 16) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 16) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 29) {
            xx = 52.75 + (((tickAnim - 25) / 4) * (85.77-(52.75)));
            yy = 0 + (((tickAnim - 25) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 4) * (0-(0)));
        }
        else if (tickAnim >= 29 && tickAnim < 33) {
            xx = 85.77 + (((tickAnim - 29) / 4) * (87.28-(85.77)));
            yy = 0 + (((tickAnim - 29) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 29) / 4) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 41) {
            xx = 87.28 + (((tickAnim - 33) / 8) * (12-(87.28)));
            yy = 0 + (((tickAnim - 33) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 8) * (0-(0)));
        }
        else if (tickAnim >= 41 && tickAnim < 43) {
            xx = 12 + (((tickAnim - 41) / 2) * (14-(12)));
            yy = 0 + (((tickAnim - 41) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 41) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm3, leftArm3.rotateAngleX + (float) Math.toRadians(xx), leftArm3.rotateAngleY + (float) Math.toRadians(yy), leftArm3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 0) / 9) * (0-(0)));
            yy = 0.975 + (((tickAnim - 0) / 9) * (1.525-(0.975)));
            zz = 0 + (((tickAnim - 0) / 9) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 9) / 16) * (0-(0)));
            yy = 1.525 + (((tickAnim - 9) / 16) * (0.275-(1.525)));
            zz = 0 + (((tickAnim - 9) / 16) * (-0.375-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 29) {
            xx = 0 + (((tickAnim - 25) / 4) * (0-(0)));
            yy = 0.275 + (((tickAnim - 25) / 4) * (0.58-(0.275)));
            zz = -0.375 + (((tickAnim - 25) / 4) * (-0.27-(-0.375)));
        }
        else if (tickAnim >= 29 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 29) / 4) * (0-(0)));
            yy = 0.58 + (((tickAnim - 29) / 4) * (-0.095-(0.58)));
            zz = -0.27 + (((tickAnim - 29) / 4) * (-0.17-(-0.27)));
        }
        else if (tickAnim >= 33 && tickAnim < 41) {
            xx = 0 + (((tickAnim - 33) / 8) * (0-(0)));
            yy = -0.095 + (((tickAnim - 33) / 8) * (0.825-(-0.095)));
            zz = -0.17 + (((tickAnim - 33) / 8) * (0-(-0.17)));
        }
        else if (tickAnim >= 41 && tickAnim < 43) {
            xx = 0 + (((tickAnim - 41) / 2) * (0-(0)));
            yy = 0.825 + (((tickAnim - 41) / 2) * (0.975-(0.825)));
            zz = 0 + (((tickAnim - 41) / 2) * (0-(0)));
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
            xx = 7.5 + (((tickAnim - 0) / 8) * (-22.85366-(7.5)));
            yy = 0 + (((tickAnim - 0) / 8) * (-2.60239-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (4.56118-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 16) {
            xx = -22.85366 + (((tickAnim - 8) / 8) * (-53-(-22.85366)));
            yy = -2.60239 + (((tickAnim - 8) / 8) * (0-(-2.60239)));
            zz = 4.56118 + (((tickAnim - 8) / 8) * (0-(4.56118)));
        }
        else if (tickAnim >= 16 && tickAnim < 43) {
            xx = -53 + (((tickAnim - 16) / 27) * (7.5-(-53)));
            yy = 0 + (((tickAnim - 16) / 27) * (0-(0)));
            zz = 0 + (((tickAnim - 16) / 27) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm, rightArm.rotateAngleX + (float) Math.toRadians(xx), rightArm.rotateAngleY + (float) Math.toRadians(yy), rightArm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 19 + (((tickAnim - 0) / 8) * (-27.4756+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150+30))*20-(19)));
            yy = 0 + (((tickAnim - 0) / 8) * (-4.46114-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (-0.90956-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 16) {
            xx = -27.4756+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150+30))*20 + (((tickAnim - 8) / 8) * (36.5-(-27.4756+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150+30))*20)));
            yy = -4.46114 + (((tickAnim - 8) / 8) * (0-(-4.46114)));
            zz = -0.90956 + (((tickAnim - 8) / 8) * (0-(-0.90956)));
        }
        else if (tickAnim >= 16 && tickAnim < 43) {
            xx = 36.5 + (((tickAnim - 16) / 27) * (19-(36.5)));
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
            yy = 0.55 + (((tickAnim - 0) / 8) * (0.45-(0.55)));
            zz = 0.525 + (((tickAnim - 0) / 8) * (0.625-(0.525)));
        }
        else if (tickAnim >= 8 && tickAnim < 16) {
            xx = 0 + (((tickAnim - 8) / 8) * (0-(0)));
            yy = 0.45 + (((tickAnim - 8) / 8) * (1.75-(0.45)));
            zz = 0.625 + (((tickAnim - 8) / 8) * (0.4-(0.625)));
        }
        else if (tickAnim >= 16 && tickAnim < 43) {
            xx = 0 + (((tickAnim - 16) / 27) * (0-(0)));
            yy = 1.75 + (((tickAnim - 16) / 27) * (0.55-(1.75)));
            zz = 0.4 + (((tickAnim - 16) / 27) * (0.525-(0.4)));
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
            xx = 52.75 + (((tickAnim - 0) / 4) * (85.77-(52.75)));
            yy = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 8) {
            xx = 85.77 + (((tickAnim - 4) / 4) * (87.28-(85.77)));
            yy = 0 + (((tickAnim - 4) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 4) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 15) {
            xx = 87.28 + (((tickAnim - 8) / 7) * (16.25-(87.28)));
            yy = 0 + (((tickAnim - 8) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 7) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 16) {
            xx = 16.25 + (((tickAnim - 15) / 1) * (16-(16.25)));
            yy = 0 + (((tickAnim - 15) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 1) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 33) {
            xx = 16 + (((tickAnim - 16) / 17) * (-0.49-(16)));
            yy = 0 + (((tickAnim - 16) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 16) / 17) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 43) {
            xx = -0.49 + (((tickAnim - 33) / 10) * (52.75-(-0.49)));
            yy = 0 + (((tickAnim - 33) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm3, rightArm3.rotateAngleX + (float) Math.toRadians(xx), rightArm3.rotateAngleY + (float) Math.toRadians(yy), rightArm3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            yy = 0.275 + (((tickAnim - 0) / 4) * (0.58-(0.275)));
            zz = -0.375 + (((tickAnim - 0) / 4) * (-0.27-(-0.375)));
        }
        else if (tickAnim >= 4 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 4) / 4) * (0-(0)));
            yy = 0.58 + (((tickAnim - 4) / 4) * (-0.095-(0.58)));
            zz = -0.27 + (((tickAnim - 4) / 4) * (-0.17-(-0.27)));
        }
        else if (tickAnim >= 8 && tickAnim < 16) {
            xx = 0 + (((tickAnim - 8) / 8) * (0-(0)));
            yy = -0.095 + (((tickAnim - 8) / 8) * (0.4-(-0.095)));
            zz = -0.17 + (((tickAnim - 8) / 8) * (0-(-0.17)));
        }
        else if (tickAnim >= 16 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 16) / 12) * (0-(0)));
            yy = 0.4 + (((tickAnim - 16) / 12) * (1.48-(0.4)));
            zz = 0 + (((tickAnim - 16) / 12) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 28) / 5) * (0-(0)));
            yy = 1.48 + (((tickAnim - 28) / 5) * (1.545-(1.48)));
            zz = 0 + (((tickAnim - 28) / 5) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 43) {
            xx = 0 + (((tickAnim - 33) / 10) * (0-(0)));
            yy = 1.545 + (((tickAnim - 33) / 10) * (0.275-(1.545)));
            zz = 0 + (((tickAnim - 33) / 10) * (-0.375-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightArm3.rotationPointX = this.rightArm3.rotationPointX + (float)(xx);
        this.rightArm3.rotationPointY = this.rightArm3.rotationPointY - (float)(yy);
        this.rightArm3.rotationPointZ = this.rightArm3.rotationPointZ + (float)(zz);



        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(-3+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*169/0.5-150))*0.5), neck.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*169-150))*0.5), neck.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*169-100))*-1.5));


        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(-2+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*169/0.5-200))*0.5), neck2.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*169-180))*0.5), neck2.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*169-150))*-1.5));


        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(-2+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*169/0.5-250))*0.5), head.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*169-220))*-0.5), head.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*169-200))*1.5));

    }
    public void animSneaking(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraGastonia entity = (EntityPrehistoricFloraGastonia) entitylivingbaseIn;
        int animCycle = 40;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        this.setRotateAngle(root, root.rotateAngleX + (float) Math.toRadians(0), root.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-50))*1.5), root.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180+80))*1));
        this.root.rotationPointX = this.root.rotationPointX + (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-50))*-0.15);
        this.root.rotationPointY = this.root.rotationPointY - (float)(-2.775);
        this.root.rotationPointZ = this.root.rotationPointZ + (float)(0);


        this.setRotateAngle(sidespike9, sidespike9.rotateAngleX + (float) Math.toRadians(2.75), sidespike9.rotateAngleY + (float) Math.toRadians(0), sidespike9.rotateAngleZ + (float) Math.toRadians(-5));


        this.setRotateAngle(sidespike27, sidespike27.rotateAngleX + (float) Math.toRadians(2.75), sidespike27.rotateAngleY + (float) Math.toRadians(0), sidespike27.rotateAngleZ + (float) Math.toRadians(5));



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
            xx = 4.39977 + (((tickAnim - 0) / 8) * (20.09295-(4.39977)));
            yy = -17.87225 + (((tickAnim - 0) / 8) * (-14.00319-(-17.87225)));
            zz = 15.95299 + (((tickAnim - 0) / 8) * (13.6523-(15.95299)));
        }
        else if (tickAnim >= 8 && tickAnim < 17) {
            xx = 20.09295 + (((tickAnim - 8) / 9) * (-0.71388-(20.09295)));
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




        if (tickAnim >= 0 && tickAnim < 40) {
            xx = -14 + (((tickAnim - 0) / 40) * (-14-(-14)));
            yy = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg3, leftLeg3.rotateAngleX + (float) Math.toRadians(xx), leftLeg3.rotateAngleY + (float) Math.toRadians(yy), leftLeg3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 19.0207 + (((tickAnim - 0) / 8) * (69.38535-(19.0207)));
            yy = 4.54463 + (((tickAnim - 0) / 8) * (2.27231-(4.54463)));
            zz = -20.64103 + (((tickAnim - 0) / 8) * (-10.32051-(-20.64103)));
        }
        else if (tickAnim >= 8 && tickAnim < 17) {
            xx = 69.38535 + (((tickAnim - 8) / 9) * (24.25-(69.38535)));
            yy = 2.27231 + (((tickAnim - 8) / 9) * (0-(2.27231)));
            zz = -10.32051 + (((tickAnim - 8) / 9) * (0-(-10.32051)));
        }
        else if (tickAnim >= 17 && tickAnim < 40) {
            xx = 24.25 + (((tickAnim - 17) / 23) * (19.0207-(24.25)));
            yy = 0 + (((tickAnim - 17) / 23) * (4.54463-(0)));
            zz = 0 + (((tickAnim - 17) / 23) * (-20.64103-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg4, leftLeg4.rotateAngleX + (float) Math.toRadians(xx), leftLeg4.rotateAngleY + (float) Math.toRadians(yy), leftLeg4.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            yy = 0.675 + (((tickAnim - 0) / 40) * (0.675-(0.675)));
            zz = 0 + (((tickAnim - 0) / 40) * (0-(0)));
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
            zz = -4.5 + (((tickAnim - 0) / 17) * (8.3202-(-4.5)));
        }
        else if (tickAnim >= 17 && tickAnim < 35) {
            xx = 1.70046 + (((tickAnim - 17) / 18) * (0.48966-(1.70046)));
            yy = -2.0667 + (((tickAnim - 17) / 18) * (-0.29645-(-2.0667)));
            zz = 8.3202 + (((tickAnim - 17) / 18) * (-1.25859-(8.3202)));
        }
        else if (tickAnim >= 35 && tickAnim < 40) {
            xx = 0.48966 + (((tickAnim - 35) / 5) * (0-(0.48966)));
            yy = -0.29645 + (((tickAnim - 35) / 5) * (0-(-0.29645)));
            zz = -1.25859 + (((tickAnim - 35) / 5) * (-4.5-(-1.25859)));
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
            xx = 20.75 + (((tickAnim - 17) / 9) * (36.20229-(20.75)));
            yy = 0 + (((tickAnim - 17) / 9) * (7.50723-(0)));
            zz = 0 + (((tickAnim - 17) / 9) * (0.64435-(0)));
        }
        else if (tickAnim >= 26 && tickAnim < 35) {
            xx = 36.20229 + (((tickAnim - 26) / 9) * (21.65459-(36.20229)));
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
            xx = 0 + (((tickAnim - 17) / 9) * (-31.25-(0)));
            yy = 0 + (((tickAnim - 17) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 17) / 9) * (0-(0)));
        }
        else if (tickAnim >= 26 && tickAnim < 35) {
            xx = -31.25 + (((tickAnim - 26) / 9) * (0-(-31.25)));
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
            xx = -21.91367 + (((tickAnim - 0) / 17) * (-20.88361-(-21.91367)));
            yy = 0.42163 + (((tickAnim - 0) / 17) * (3.24819-(0.42163)));
            zz = 4.20772 + (((tickAnim - 0) / 17) * (-8.23543-(4.20772)));
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
            xx = -20 + (((tickAnim - 35) / 5) * (-21.91367-(-20)));
            yy = 0 + (((tickAnim - 35) / 5) * (0.42163-(0)));
            zz = 0 + (((tickAnim - 35) / 5) * (4.20772-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg4, rightLeg4.rotateAngleX + (float) Math.toRadians(xx), rightLeg4.rotateAngleY + (float) Math.toRadians(yy), rightLeg4.rotateAngleZ + (float) Math.toRadians(zz));



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
            xx = -27.00059 + (((tickAnim - 6) / 7) * (-31.16885-(-27.00059)));
            yy = 0.74441 + (((tickAnim - 6) / 7) * (3.15511-(0.74441)));
            zz = -0.09141 + (((tickAnim - 6) / 7) * (2.1148-(-0.09141)));
        }
        else if (tickAnim >= 13 && tickAnim < 22) {
            xx = -31.16885 + (((tickAnim - 13) / 9) * (-21.02247-(-31.16885)));
            yy = 3.15511 + (((tickAnim - 13) / 9) * (5.83368-(3.15511)));
            zz = 2.1148 + (((tickAnim - 13) / 9) * (4.56614-(2.1148)));
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
            xx = 16 + (((tickAnim - 0) / 6) * (15.44389-(16)));
            yy = 0 + (((tickAnim - 0) / 6) * (6.45353-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (-9.83997-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 13) {
            xx = 15.44389 + (((tickAnim - 6) / 7) * (71.05778-(15.44389)));
            yy = 6.45353 + (((tickAnim - 6) / 7) * (-4.8023-(6.45353)));
            zz = -9.83997 + (((tickAnim - 6) / 7) * (-1.67062-(-9.83997)));
        }
        else if (tickAnim >= 13 && tickAnim < 22) {
            xx = 71.05778 + (((tickAnim - 13) / 9) * (15.68433-(71.05778)));
            yy = -4.8023 + (((tickAnim - 13) / 9) * (-17.30878-(-4.8023)));
            zz = -1.67062 + (((tickAnim - 13) / 9) * (7.40643-(-1.67062)));
        }
        else if (tickAnim >= 22 && tickAnim < 40) {
            xx = 15.68433 + (((tickAnim - 22) / 18) * (16-(15.68433)));
            yy = -17.30878 + (((tickAnim - 22) / 18) * (0-(-17.30878)));
            zz = 7.40643 + (((tickAnim - 22) / 18) * (0-(7.40643)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm3, leftArm3.rotateAngleX + (float) Math.toRadians(xx), leftArm3.rotateAngleY + (float) Math.toRadians(yy), leftArm3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 6) * (-0.275-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 6) / 7) * (0.13-(0)));
            yy = -0.275 + (((tickAnim - 6) / 7) * (0.395-(-0.275)));
            zz = 0 + (((tickAnim - 6) / 7) * (-0.55-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 22) {
            xx = 0.13 + (((tickAnim - 13) / 9) * (0.275-(0.13)));
            yy = 0.395 + (((tickAnim - 13) / 9) * (-0.08-(0.395)));
            zz = -0.55 + (((tickAnim - 13) / 9) * (0-(-0.55)));
        }
        else if (tickAnim >= 22 && tickAnim < 40) {
            xx = 0.275 + (((tickAnim - 22) / 18) * (0-(0.275)));
            yy = -0.08 + (((tickAnim - 22) / 18) * (0-(-0.08)));
            zz = 0 + (((tickAnim - 22) / 18) * (0-(0)));
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
            xx = -24.25 + (((tickAnim - 23) / 9) * (-33.46978-(-24.25)));
            yy = 0 + (((tickAnim - 23) / 9) * (-2.61602-(0)));
            zz = 0 + (((tickAnim - 23) / 9) * (0.12598-(0)));
        }
        else if (tickAnim >= 32 && tickAnim < 40) {
            xx = -33.46978 + (((tickAnim - 32) / 8) * (-22.76049-(-33.46978)));
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
            xx = 10.29393 + (((tickAnim - 0) / 23) * (14.6581-(10.29393)));
            yy = -4.27613 + (((tickAnim - 0) / 23) * (16.64116-(-4.27613)));
            zz = 13.12564 + (((tickAnim - 0) / 23) * (-4.23491-(13.12564)));
        }
        else if (tickAnim >= 23 && tickAnim < 32) {
            xx = 14.6581 + (((tickAnim - 23) / 9) * (68.8721-(14.6581)));
            yy = 16.64116 + (((tickAnim - 23) / 9) * (5.68449-(16.64116)));
            zz = -4.23491 + (((tickAnim - 23) / 9) * (4.85871-(-4.23491)));
        }
        else if (tickAnim >= 32 && tickAnim < 40) {
            xx = 68.8721 + (((tickAnim - 32) / 8) * (10.29393-(68.8721)));
            yy = 5.68449 + (((tickAnim - 32) / 8) * (-4.27613-(5.68449)));
            zz = 4.85871 + (((tickAnim - 32) / 8) * (13.12564-(4.85871)));
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
            zz = 0 + (((tickAnim - 0) / 23) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 32) {
            xx = 0 + (((tickAnim - 23) / 9) * (0-(0)));
            yy = 0 + (((tickAnim - 23) / 9) * (0.575-(0)));
            zz = 0 + (((tickAnim - 23) / 9) * (-0.35-(0)));
        }
        else if (tickAnim >= 32 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 32) / 8) * (0-(0)));
            yy = 0.575 + (((tickAnim - 32) / 8) * (0-(0.575)));
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
        EntityPrehistoricFloraGastonia e = (EntityPrehistoricFloraGastonia) entity;
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
