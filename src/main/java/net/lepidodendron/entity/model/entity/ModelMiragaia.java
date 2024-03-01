package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.EntityPrehistoricFloraMiragaia;
import net.lepidodendron.entity.model.llibraryextensions.AdvancedModelBaseExtended;
import net.minecraft.client.model.ModelBox;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;

public class ModelMiragaia extends AdvancedModelBaseExtended {
    private final AdvancedModelRenderer main;
    private final AdvancedModelRenderer body;
    private final AdvancedModelRenderer leftPlate10;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer cube_r6;
    private final AdvancedModelRenderer rightPlate10;
    private final AdvancedModelRenderer cube_r7;
    private final AdvancedModelRenderer cube_r8;
    private final AdvancedModelRenderer cube_r9;
    private final AdvancedModelRenderer cube_r10;
    private final AdvancedModelRenderer cube_r11;
    private final AdvancedModelRenderer cube_r12;
    private final AdvancedModelRenderer leftPlate33;
    private final AdvancedModelRenderer cube_r13;
    private final AdvancedModelRenderer cube_r14;
    private final AdvancedModelRenderer cube_r15;
    private final AdvancedModelRenderer cube_r16;
    private final AdvancedModelRenderer rightPlate33;
    private final AdvancedModelRenderer cube_r17;
    private final AdvancedModelRenderer cube_r18;
    private final AdvancedModelRenderer cube_r19;
    private final AdvancedModelRenderer cube_r20;
    private final AdvancedModelRenderer backleftleg;
    private final AdvancedModelRenderer backleftleg2;
    private final AdvancedModelRenderer backleftleg3;
    private final AdvancedModelRenderer backleftleg4;
    private final AdvancedModelRenderer backrightleg;
    private final AdvancedModelRenderer backrightleg2;
    private final AdvancedModelRenderer backrightleg3;
    private final AdvancedModelRenderer backrightleg4;
    private final AdvancedModelRenderer body2;
    private final AdvancedModelRenderer leftPlate31;
    private final AdvancedModelRenderer cube_r21;
    private final AdvancedModelRenderer cube_r22;
    private final AdvancedModelRenderer cube_r23;
    private final AdvancedModelRenderer cube_r24;
    private final AdvancedModelRenderer cube_r25;
    private final AdvancedModelRenderer cube_r26;
    private final AdvancedModelRenderer rightPlate31;
    private final AdvancedModelRenderer cube_r27;
    private final AdvancedModelRenderer cube_r28;
    private final AdvancedModelRenderer cube_r29;
    private final AdvancedModelRenderer cube_r30;
    private final AdvancedModelRenderer cube_r31;
    private final AdvancedModelRenderer cube_r32;
    private final AdvancedModelRenderer leftPlate9;
    private final AdvancedModelRenderer cube_r33;
    private final AdvancedModelRenderer cube_r34;
    private final AdvancedModelRenderer cube_r35;
    private final AdvancedModelRenderer cube_r36;
    private final AdvancedModelRenderer cube_r37;
    private final AdvancedModelRenderer cube_r38;
    private final AdvancedModelRenderer rightPlate9;
    private final AdvancedModelRenderer cube_r39;
    private final AdvancedModelRenderer cube_r40;
    private final AdvancedModelRenderer cube_r41;
    private final AdvancedModelRenderer cube_r42;
    private final AdvancedModelRenderer cube_r43;
    private final AdvancedModelRenderer cube_r44;
    private final AdvancedModelRenderer leftPlate32;
    private final AdvancedModelRenderer cube_r45;
    private final AdvancedModelRenderer cube_r46;
    private final AdvancedModelRenderer cube_r47;
    private final AdvancedModelRenderer cube_r48;
    private final AdvancedModelRenderer cube_r49;
    private final AdvancedModelRenderer cube_r50;
    private final AdvancedModelRenderer rightPlate32;
    private final AdvancedModelRenderer cube_r51;
    private final AdvancedModelRenderer cube_r52;
    private final AdvancedModelRenderer cube_r53;
    private final AdvancedModelRenderer cube_r54;
    private final AdvancedModelRenderer cube_r55;
    private final AdvancedModelRenderer cube_r56;
    private final AdvancedModelRenderer leftPlate8;
    private final AdvancedModelRenderer cube_r57;
    private final AdvancedModelRenderer cube_r58;
    private final AdvancedModelRenderer cube_r59;
    private final AdvancedModelRenderer cube_r60;
    private final AdvancedModelRenderer cube_r61;
    private final AdvancedModelRenderer rightPlate8;
    private final AdvancedModelRenderer cube_r62;
    private final AdvancedModelRenderer cube_r63;
    private final AdvancedModelRenderer cube_r64;
    private final AdvancedModelRenderer cube_r65;
    private final AdvancedModelRenderer cube_r66;
    private final AdvancedModelRenderer leftPlate30;
    private final AdvancedModelRenderer cube_r67;
    private final AdvancedModelRenderer cube_r68;
    private final AdvancedModelRenderer cube_r69;
    private final AdvancedModelRenderer cube_r70;
    private final AdvancedModelRenderer cube_r71;
    private final AdvancedModelRenderer cube_r72;
    private final AdvancedModelRenderer rightPlate30;
    private final AdvancedModelRenderer cube_r73;
    private final AdvancedModelRenderer cube_r74;
    private final AdvancedModelRenderer cube_r75;
    private final AdvancedModelRenderer cube_r76;
    private final AdvancedModelRenderer cube_r77;
    private final AdvancedModelRenderer cube_r78;
    private final AdvancedModelRenderer upperbody;
    private final AdvancedModelRenderer cube_r79;
    private final AdvancedModelRenderer leftPlate29;
    private final AdvancedModelRenderer cube_r80;
    private final AdvancedModelRenderer cube_r81;
    private final AdvancedModelRenderer cube_r82;
    private final AdvancedModelRenderer cube_r83;
    private final AdvancedModelRenderer cube_r84;
    private final AdvancedModelRenderer cube_r85;
    private final AdvancedModelRenderer cube_r86;
    private final AdvancedModelRenderer rightPlate29;
    private final AdvancedModelRenderer cube_r87;
    private final AdvancedModelRenderer cube_r88;
    private final AdvancedModelRenderer cube_r89;
    private final AdvancedModelRenderer cube_r90;
    private final AdvancedModelRenderer cube_r91;
    private final AdvancedModelRenderer cube_r92;
    private final AdvancedModelRenderer cube_r93;
    private final AdvancedModelRenderer leftPlate7;
    private final AdvancedModelRenderer cube_r94;
    private final AdvancedModelRenderer cube_r95;
    private final AdvancedModelRenderer cube_r96;
    private final AdvancedModelRenderer cube_r97;
    private final AdvancedModelRenderer cube_r98;
    private final AdvancedModelRenderer cube_r99;
    private final AdvancedModelRenderer cube_r100;
    private final AdvancedModelRenderer rightPlate7;
    private final AdvancedModelRenderer cube_r101;
    private final AdvancedModelRenderer cube_r102;
    private final AdvancedModelRenderer cube_r103;
    private final AdvancedModelRenderer cube_r104;
    private final AdvancedModelRenderer cube_r105;
    private final AdvancedModelRenderer cube_r106;
    private final AdvancedModelRenderer cube_r107;
    private final AdvancedModelRenderer leftPlate6;
    private final AdvancedModelRenderer cube_r108;
    private final AdvancedModelRenderer cube_r109;
    private final AdvancedModelRenderer cube_r110;
    private final AdvancedModelRenderer cube_r111;
    private final AdvancedModelRenderer cube_r112;
    private final AdvancedModelRenderer rightPlate6;
    private final AdvancedModelRenderer cube_r113;
    private final AdvancedModelRenderer cube_r114;
    private final AdvancedModelRenderer cube_r115;
    private final AdvancedModelRenderer cube_r116;
    private final AdvancedModelRenderer cube_r117;
    private final AdvancedModelRenderer leftPlate28;
    private final AdvancedModelRenderer cube_r118;
    private final AdvancedModelRenderer cube_r119;
    private final AdvancedModelRenderer cube_r120;
    private final AdvancedModelRenderer cube_r121;
    private final AdvancedModelRenderer cube_r122;
    private final AdvancedModelRenderer cube_r123;
    private final AdvancedModelRenderer rightPlate28;
    private final AdvancedModelRenderer cube_r124;
    private final AdvancedModelRenderer cube_r125;
    private final AdvancedModelRenderer cube_r126;
    private final AdvancedModelRenderer cube_r127;
    private final AdvancedModelRenderer cube_r128;
    private final AdvancedModelRenderer cube_r129;
    private final AdvancedModelRenderer neck4;
    private final AdvancedModelRenderer cube_r130;
    private final AdvancedModelRenderer cube_r131;
    private final AdvancedModelRenderer cube_r132;
    private final AdvancedModelRenderer leftPlate3;
    private final AdvancedModelRenderer cube_r133;
    private final AdvancedModelRenderer cube_r134;
    private final AdvancedModelRenderer cube_r135;
    private final AdvancedModelRenderer cube_r136;
    private final AdvancedModelRenderer cube_r137;
    private final AdvancedModelRenderer rightPlate3;
    private final AdvancedModelRenderer cube_r138;
    private final AdvancedModelRenderer cube_r139;
    private final AdvancedModelRenderer cube_r140;
    private final AdvancedModelRenderer cube_r141;
    private final AdvancedModelRenderer cube_r142;
    private final AdvancedModelRenderer leftPlate25;
    private final AdvancedModelRenderer cube_r143;
    private final AdvancedModelRenderer cube_r144;
    private final AdvancedModelRenderer cube_r145;
    private final AdvancedModelRenderer cube_r146;
    private final AdvancedModelRenderer cube_r147;
    private final AdvancedModelRenderer rightPlate25;
    private final AdvancedModelRenderer cube_r148;
    private final AdvancedModelRenderer cube_r149;
    private final AdvancedModelRenderer cube_r150;
    private final AdvancedModelRenderer cube_r151;
    private final AdvancedModelRenderer cube_r152;
    private final AdvancedModelRenderer leftPlate4;
    private final AdvancedModelRenderer cube_r153;
    private final AdvancedModelRenderer cube_r154;
    private final AdvancedModelRenderer cube_r155;
    private final AdvancedModelRenderer cube_r156;
    private final AdvancedModelRenderer cube_r157;
    private final AdvancedModelRenderer rightPlate4;
    private final AdvancedModelRenderer cube_r158;
    private final AdvancedModelRenderer cube_r159;
    private final AdvancedModelRenderer cube_r160;
    private final AdvancedModelRenderer cube_r161;
    private final AdvancedModelRenderer cube_r162;
    private final AdvancedModelRenderer leftPlate26;
    private final AdvancedModelRenderer cube_r163;
    private final AdvancedModelRenderer cube_r164;
    private final AdvancedModelRenderer cube_r165;
    private final AdvancedModelRenderer cube_r166;
    private final AdvancedModelRenderer cube_r167;
    private final AdvancedModelRenderer rightPlate26;
    private final AdvancedModelRenderer cube_r168;
    private final AdvancedModelRenderer cube_r169;
    private final AdvancedModelRenderer cube_r170;
    private final AdvancedModelRenderer cube_r171;
    private final AdvancedModelRenderer cube_r172;
    private final AdvancedModelRenderer leftPlate27;
    private final AdvancedModelRenderer cube_r173;
    private final AdvancedModelRenderer cube_r174;
    private final AdvancedModelRenderer cube_r175;
    private final AdvancedModelRenderer cube_r176;
    private final AdvancedModelRenderer cube_r177;
    private final AdvancedModelRenderer rightPlate27;
    private final AdvancedModelRenderer cube_r178;
    private final AdvancedModelRenderer cube_r179;
    private final AdvancedModelRenderer cube_r180;
    private final AdvancedModelRenderer cube_r181;
    private final AdvancedModelRenderer cube_r182;
    private final AdvancedModelRenderer leftPlate5;
    private final AdvancedModelRenderer cube_r183;
    private final AdvancedModelRenderer cube_r184;
    private final AdvancedModelRenderer cube_r185;
    private final AdvancedModelRenderer cube_r186;
    private final AdvancedModelRenderer cube_r187;
    private final AdvancedModelRenderer rightPlate5;
    private final AdvancedModelRenderer cube_r188;
    private final AdvancedModelRenderer cube_r189;
    private final AdvancedModelRenderer cube_r190;
    private final AdvancedModelRenderer cube_r191;
    private final AdvancedModelRenderer cube_r192;
    private final AdvancedModelRenderer neck3;
    private final AdvancedModelRenderer leftPlate18;
    private final AdvancedModelRenderer cube_r193;
    private final AdvancedModelRenderer cube_r194;
    private final AdvancedModelRenderer cube_r195;
    private final AdvancedModelRenderer cube_r196;
    private final AdvancedModelRenderer rightPlate18;
    private final AdvancedModelRenderer cube_r197;
    private final AdvancedModelRenderer cube_r198;
    private final AdvancedModelRenderer cube_r199;
    private final AdvancedModelRenderer cube_r200;
    private final AdvancedModelRenderer leftPlate2;
    private final AdvancedModelRenderer cube_r201;
    private final AdvancedModelRenderer cube_r202;
    private final AdvancedModelRenderer cube_r203;
    private final AdvancedModelRenderer cube_r204;
    private final AdvancedModelRenderer rightPlate2;
    private final AdvancedModelRenderer cube_r205;
    private final AdvancedModelRenderer cube_r206;
    private final AdvancedModelRenderer cube_r207;
    private final AdvancedModelRenderer cube_r208;
    private final AdvancedModelRenderer leftPlate24;
    private final AdvancedModelRenderer cube_r209;
    private final AdvancedModelRenderer cube_r210;
    private final AdvancedModelRenderer cube_r211;
    private final AdvancedModelRenderer cube_r212;
    private final AdvancedModelRenderer cube_r213;
    private final AdvancedModelRenderer rightPlate24;
    private final AdvancedModelRenderer cube_r214;
    private final AdvancedModelRenderer cube_r215;
    private final AdvancedModelRenderer cube_r216;
    private final AdvancedModelRenderer cube_r217;
    private final AdvancedModelRenderer cube_r218;
    private final AdvancedModelRenderer neck2;
    private final AdvancedModelRenderer cube_r219;
    private final AdvancedModelRenderer leftPlate23;
    private final AdvancedModelRenderer cube_r220;
    private final AdvancedModelRenderer cube_r221;
    private final AdvancedModelRenderer cube_r222;
    private final AdvancedModelRenderer cube_r223;
    private final AdvancedModelRenderer rightPlate23;
    private final AdvancedModelRenderer cube_r224;
    private final AdvancedModelRenderer cube_r225;
    private final AdvancedModelRenderer cube_r226;
    private final AdvancedModelRenderer cube_r227;
    private final AdvancedModelRenderer leftPlate22;
    private final AdvancedModelRenderer cube_r228;
    private final AdvancedModelRenderer cube_r229;
    private final AdvancedModelRenderer cube_r230;
    private final AdvancedModelRenderer cube_r231;
    private final AdvancedModelRenderer rightPlate22;
    private final AdvancedModelRenderer cube_r232;
    private final AdvancedModelRenderer cube_r233;
    private final AdvancedModelRenderer cube_r234;
    private final AdvancedModelRenderer cube_r235;
    private final AdvancedModelRenderer leftPlate21;
    private final AdvancedModelRenderer cube_r236;
    private final AdvancedModelRenderer cube_r237;
    private final AdvancedModelRenderer cube_r238;
    private final AdvancedModelRenderer cube_r239;
    private final AdvancedModelRenderer rightPlate21;
    private final AdvancedModelRenderer cube_r240;
    private final AdvancedModelRenderer cube_r241;
    private final AdvancedModelRenderer cube_r242;
    private final AdvancedModelRenderer cube_r243;
    private final AdvancedModelRenderer leftPlate19;
    private final AdvancedModelRenderer cube_r244;
    private final AdvancedModelRenderer cube_r245;
    private final AdvancedModelRenderer cube_r246;
    private final AdvancedModelRenderer cube_r247;
    private final AdvancedModelRenderer rightPlate19;
    private final AdvancedModelRenderer cube_r248;
    private final AdvancedModelRenderer cube_r249;
    private final AdvancedModelRenderer cube_r250;
    private final AdvancedModelRenderer cube_r251;
    private final AdvancedModelRenderer neck;
    private final AdvancedModelRenderer cube_r252;
    private final AdvancedModelRenderer head;
    private final AdvancedModelRenderer cube_r253;
    private final AdvancedModelRenderer cube_r254;
    private final AdvancedModelRenderer cube_r255;
    private final AdvancedModelRenderer cube_r256;
    private final AdvancedModelRenderer cube_r257;
    private final AdvancedModelRenderer cube_r258;
    private final AdvancedModelRenderer cube_r259;
    private final AdvancedModelRenderer cube_r260;
    private final AdvancedModelRenderer Eye;
    private final AdvancedModelRenderer jaw;
    private final AdvancedModelRenderer cube_r261;
    private final AdvancedModelRenderer cube_r262;
    private final AdvancedModelRenderer cube_r263;
    private final AdvancedModelRenderer cube_r264;
    private final AdvancedModelRenderer cube_r265;
    private final AdvancedModelRenderer cube_r266;
    private final AdvancedModelRenderer cube_r267;
    private final AdvancedModelRenderer leftPlate20;
    private final AdvancedModelRenderer cube_r268;
    private final AdvancedModelRenderer rightPlate20;
    private final AdvancedModelRenderer cube_r269;
    private final AdvancedModelRenderer leftPlate17;
    private final AdvancedModelRenderer rightPlate17;
    private final AdvancedModelRenderer leftPlate1;
    private final AdvancedModelRenderer rightPlate1;
    private final AdvancedModelRenderer frontleftleg;
    private final AdvancedModelRenderer frontleftleg2;
    private final AdvancedModelRenderer frontleftleg3;
    private final AdvancedModelRenderer frontrightleg;
    private final AdvancedModelRenderer frontrightleg2;
    private final AdvancedModelRenderer frontrightleg3;
    private final AdvancedModelRenderer tail;
    private final AdvancedModelRenderer leftPlate34;
    private final AdvancedModelRenderer cube_r270;
    private final AdvancedModelRenderer rightPlate34;
    private final AdvancedModelRenderer cube_r271;
    private final AdvancedModelRenderer leftPlate11;
    private final AdvancedModelRenderer cube_r272;
    private final AdvancedModelRenderer rightPlate11;
    private final AdvancedModelRenderer cube_r273;
    private final AdvancedModelRenderer tail2;
    private final AdvancedModelRenderer leftPlate35;
    private final AdvancedModelRenderer cube_r274;
    private final AdvancedModelRenderer rightPlate35;
    private final AdvancedModelRenderer cube_r275;
    private final AdvancedModelRenderer leftPlate36;
    private final AdvancedModelRenderer cube_r276;
    private final AdvancedModelRenderer cube_r277;
    private final AdvancedModelRenderer rightPlate36;
    private final AdvancedModelRenderer cube_r278;
    private final AdvancedModelRenderer cube_r279;
    private final AdvancedModelRenderer tail3;
    private final AdvancedModelRenderer leftPlate13;
    private final AdvancedModelRenderer cube_r280;
    private final AdvancedModelRenderer cube_r281;
    private final AdvancedModelRenderer rightPlate13;
    private final AdvancedModelRenderer cube_r282;
    private final AdvancedModelRenderer cube_r283;
    private final AdvancedModelRenderer leftPlate37;
    private final AdvancedModelRenderer cube_r284;
    private final AdvancedModelRenderer cube_r285;
    private final AdvancedModelRenderer rightPlate37;
    private final AdvancedModelRenderer cube_r286;
    private final AdvancedModelRenderer cube_r287;
    private final AdvancedModelRenderer leftPlate12;
    private final AdvancedModelRenderer cube_r288;
    private final AdvancedModelRenderer cube_r289;
    private final AdvancedModelRenderer rightPlate12;
    private final AdvancedModelRenderer cube_r290;
    private final AdvancedModelRenderer cube_r291;
    private final AdvancedModelRenderer tail4;
    private final AdvancedModelRenderer leftPlate15;
    private final AdvancedModelRenderer cube_r292;
    private final AdvancedModelRenderer rightPlate15;
    private final AdvancedModelRenderer cube_r293;
    private final AdvancedModelRenderer leftPlate14;
    private final AdvancedModelRenderer cube_r294;
    private final AdvancedModelRenderer cube_r295;
    private final AdvancedModelRenderer rightPlate14;
    private final AdvancedModelRenderer cube_r296;
    private final AdvancedModelRenderer cube_r297;
    private final AdvancedModelRenderer tail5;
    private final AdvancedModelRenderer leftPlate16;
    private final AdvancedModelRenderer cube_r298;
    private final AdvancedModelRenderer cube_r299;
    private final AdvancedModelRenderer rightPlate16;
    private final AdvancedModelRenderer cube_r300;
    private final AdvancedModelRenderer cube_r301;
    private final AdvancedModelRenderer lefttailSpike;
    private final AdvancedModelRenderer babyskewer_r1;
    private final AdvancedModelRenderer cube_r302;
    private final AdvancedModelRenderer cube_r303;
    private final AdvancedModelRenderer righttailSpike;
    private final AdvancedModelRenderer babyskewer_r2;
    private final AdvancedModelRenderer cube_r304;
    private final AdvancedModelRenderer cube_r305;
    private final AdvancedModelRenderer tail6;
    private final AdvancedModelRenderer lefttailSpike2;
    private final AdvancedModelRenderer babyskewer_r3;
    private final AdvancedModelRenderer cube_r306;
    private final AdvancedModelRenderer cube_r307;
    private final AdvancedModelRenderer righttailSpike2;
    private final AdvancedModelRenderer babyskewer_r4;
    private final AdvancedModelRenderer cube_r308;
    private final AdvancedModelRenderer cube_r309;

    private ModelAnimator animator;

    public ModelMiragaia() {
        this.textureWidth = 160;
        this.textureHeight = 160;

        this.main = new AdvancedModelRenderer(this);
        this.main.setRotationPoint(0.0F, 13.8F, -2.0F);


        this.body = new AdvancedModelRenderer(this);
        this.body.setRotationPoint(0.0F, -17.0F, 13.0F);
        this.main.addChild(body);
        this.setRotateAngle(body, -0.1309F, 0.0F, 0.0F);
        this.body.cubeList.add(new ModelBox(body, 0, 37, -6.5F, -7.25F, -7.0F, 13, 18, 13, 0.0F, false));

        this.leftPlate10 = new AdvancedModelRenderer(this);
        this.leftPlate10.setRotationPoint(2.8F, -6.2195F, -0.8741F);
        this.body.addChild(leftPlate10);
        this.setRotateAngle(leftPlate10, -0.2965F, 0.2424F, 0.2076F);


        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(-0.6934F, -8.0285F, -1.4731F);
        this.leftPlate10.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.0087F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 110, 63, -0.5F, -0.3333F, -0.4228F, 1, 10, 4, -0.18F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(-0.6934F, -10.4349F, 1.3758F);
        this.leftPlate10.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.096F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 126, 128, -0.5F, -0.3118F, -1.4957F, 1, 3, 2, -0.22F, false));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(-0.6934F, -10.3349F, 1.3758F);
        this.leftPlate10.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.1309F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 24, 69, -0.5F, -6.5971F, -0.5435F, 1, 7, 1, -0.18F, false));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(-0.6934F, -11.5349F, -1.2242F);
        this.leftPlate10.addChild(cube_r4);
        this.setRotateAngle(cube_r4, -0.1134F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 51, 37, -0.5F, -0.3054F, -0.2413F, 1, 4, 3, -0.19F, false));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(-0.6934F, -11.4142F, 0.3536F);
        this.leftPlate10.addChild(cube_r5);
        this.setRotateAngle(cube_r5, -0.0698F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 142, 98, -0.5F, -3.9328F, -0.7668F, 1, 2, 1, -0.2F, false));
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 68, 0, -0.5F, -2.6328F, -1.1668F, 1, 3, 2, -0.195F, false));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(-0.6934F, -11.5349F, -1.0242F);
        this.leftPlate10.addChild(cube_r6);
        this.setRotateAngle(cube_r6, -0.2793F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 129, 34, -0.5F, -5.7964F, -0.4091F, 1, 6, 1, -0.193F, false));

        this.rightPlate10 = new AdvancedModelRenderer(this);
        this.rightPlate10.setRotationPoint(-2.8F, -6.2195F, -0.8741F);
        this.body.addChild(rightPlate10);
        this.setRotateAngle(rightPlate10, -0.2965F, -0.2424F, -0.2076F);


        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(0.6934F, -8.0285F, -1.4731F);
        this.rightPlate10.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.0087F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 110, 63, -0.5F, -0.3333F, -0.4228F, 1, 10, 4, -0.18F, true));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(0.6934F, -10.4349F, 1.3758F);
        this.rightPlate10.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.096F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 126, 128, -0.5F, -0.3118F, -1.4957F, 1, 3, 2, -0.22F, true));

        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(0.6934F, -10.3349F, 1.3758F);
        this.rightPlate10.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.1309F, 0.0F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 24, 69, -0.5F, -6.5971F, -0.5435F, 1, 7, 1, -0.18F, true));

        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(0.6934F, -11.5349F, -1.2242F);
        this.rightPlate10.addChild(cube_r10);
        this.setRotateAngle(cube_r10, -0.1134F, 0.0F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 51, 37, -0.5F, -0.3054F, -0.2413F, 1, 4, 3, -0.19F, true));

        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(0.6934F, -11.4142F, 0.3536F);
        this.rightPlate10.addChild(cube_r11);
        this.setRotateAngle(cube_r11, -0.0698F, 0.0F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 142, 98, -0.5F, -3.9328F, -0.7668F, 1, 2, 1, -0.2F, true));
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 68, 0, -0.5F, -2.6328F, -1.1668F, 1, 3, 2, -0.195F, true));

        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(0.6934F, -11.5349F, -1.0242F);
        this.rightPlate10.addChild(cube_r12);
        this.setRotateAngle(cube_r12, -0.2793F, 0.0F, 0.0F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 129, 34, -0.5F, -5.7964F, -0.4091F, 1, 6, 1, -0.193F, true));

        this.leftPlate33 = new AdvancedModelRenderer(this);
        this.leftPlate33.setRotationPoint(3.0F, -5.3195F, 3.6259F);
        this.body.addChild(leftPlate33);
        this.setRotateAngle(leftPlate33, -0.3896F, 0.2325F, 0.1827F);


        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(-0.6934F, -17.0285F, -0.4731F);
        this.leftPlate33.addChild(cube_r13);
        this.setRotateAngle(cube_r13, 0.0087F, 0.0F, 0.0F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 134, 34, -0.5F, 3.7629F, -0.4538F, 1, 5, 1, -0.007F, false));

        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(-0.6934F, -17.0285F, -0.4731F);
        this.leftPlate33.addChild(cube_r14);
        this.setRotateAngle(cube_r14, 0.1309F, 0.0F, 0.0F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 125, 8, -0.5F, -0.2371F, -0.5538F, 1, 9, 1, -0.002F, false));

        this.cube_r15 = new AdvancedModelRenderer(this);
        this.cube_r15.setRotationPoint(-0.6934F, -8.0285F, -1.8731F);
        this.leftPlate33.addChild(cube_r15);
        this.setRotateAngle(cube_r15, -0.096F, 0.0F, 0.0F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 36, 122, -0.5F, -9.3298F, -0.0228F, 1, 9, 1, -0.004F, false));

        this.cube_r16 = new AdvancedModelRenderer(this);
        this.cube_r16.setRotationPoint(-0.6934F, 0.9715F, -1.4731F);
        this.leftPlate33.addChild(cube_r16);
        this.setRotateAngle(cube_r16, 0.0087F, 0.0F, 0.0F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 89, 118, -0.5F, -9.333F, -0.3443F, 1, 10, 3, 0.0F, false));

        this.rightPlate33 = new AdvancedModelRenderer(this);
        this.rightPlate33.setRotationPoint(-3.0F, -5.3195F, 3.6259F);
        this.body.addChild(rightPlate33);
        this.setRotateAngle(rightPlate33, -0.3896F, -0.2325F, -0.1827F);


        this.cube_r17 = new AdvancedModelRenderer(this);
        this.cube_r17.setRotationPoint(0.6934F, -17.0285F, -0.4731F);
        this.rightPlate33.addChild(cube_r17);
        this.setRotateAngle(cube_r17, 0.0087F, 0.0F, 0.0F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 134, 34, -0.5F, 3.7629F, -0.4538F, 1, 5, 1, -0.007F, true));

        this.cube_r18 = new AdvancedModelRenderer(this);
        this.cube_r18.setRotationPoint(0.6934F, -17.0285F, -0.4731F);
        this.rightPlate33.addChild(cube_r18);
        this.setRotateAngle(cube_r18, 0.1309F, 0.0F, 0.0F);
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 125, 8, -0.5F, -0.2371F, -0.5538F, 1, 9, 1, -0.002F, true));

        this.cube_r19 = new AdvancedModelRenderer(this);
        this.cube_r19.setRotationPoint(0.6934F, -8.0285F, -1.8731F);
        this.rightPlate33.addChild(cube_r19);
        this.setRotateAngle(cube_r19, -0.096F, 0.0F, 0.0F);
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 36, 122, -0.5F, -9.3298F, -0.0228F, 1, 9, 1, -0.004F, true));

        this.cube_r20 = new AdvancedModelRenderer(this);
        this.cube_r20.setRotationPoint(0.6934F, 0.9715F, -1.4731F);
        this.rightPlate33.addChild(cube_r20);
        this.setRotateAngle(cube_r20, 0.0087F, 0.0F, 0.0F);
        this.cube_r20.cubeList.add(new ModelBox(cube_r20, 89, 118, -0.5F, -9.333F, -0.3443F, 1, 10, 3, 0.0F, true));

        this.backleftleg = new AdvancedModelRenderer(this);
        this.backleftleg.setRotationPoint(6.75F, -0.4457F, 0.0347F);
        this.body.addChild(backleftleg);
        this.setRotateAngle(backleftleg, -0.0436F, 0.0F, 0.0F);
        this.backleftleg.cubeList.add(new ModelBox(backleftleg, 37, 78, -4.25F, -3.3F, -3.6F, 7, 18, 8, 0.0F, false));

        this.backleftleg2 = new AdvancedModelRenderer(this);
        this.backleftleg2.setRotationPoint(0.25F, 14.45F, -3.1F);
        this.backleftleg.addChild(backleftleg2);
        this.setRotateAngle(backleftleg2, 0.5236F, 0.0F, 0.0F);
        this.backleftleg2.cubeList.add(new ModelBox(backleftleg2, 136, 141, -4.0F, -0.3705F, -0.1819F, 6, 13, 6, 0.0F, false));

        this.backleftleg3 = new AdvancedModelRenderer(this);
        this.backleftleg3.setRotationPoint(0.5F, 9.1789F, 5.4963F);
        this.backleftleg2.addChild(backleftleg3);
        this.setRotateAngle(backleftleg3, -0.5672F, 0.0F, 0.0F);
        this.backleftleg3.cubeList.add(new ModelBox(backleftleg3, 0, 104, -4.0F, 2.75F, -4.5F, 5, 4, 6, 0.0F, false));

        this.backleftleg4 = new AdvancedModelRenderer(this);
        this.backleftleg4.setRotationPoint(-1.5F, 5.6163F, -0.122F);
        this.backleftleg3.addChild(backleftleg4);
        this.setRotateAngle(backleftleg4, 0.2182F, 0.0F, 0.0F);
        this.backleftleg4.cubeList.add(new ModelBox(backleftleg4, 94, 51, -3.5F, -1.25F, -6.75F, 7, 3, 8, 0.0F, false));

        this.backrightleg = new AdvancedModelRenderer(this);
        this.backrightleg.setRotationPoint(-6.75F, -0.4457F, 0.0347F);
        this.body.addChild(backrightleg);
        this.setRotateAngle(backrightleg, -0.0436F, 0.0F, 0.0F);
        this.backrightleg.cubeList.add(new ModelBox(backrightleg, 37, 78, -2.75F, -3.3F, -3.6F, 7, 18, 8, 0.0F, true));

        this.backrightleg2 = new AdvancedModelRenderer(this);
        this.backrightleg2.setRotationPoint(-0.25F, 14.45F, -3.1F);
        this.backrightleg.addChild(backrightleg2);
        this.setRotateAngle(backrightleg2, 0.5236F, 0.0F, 0.0F);
        this.backrightleg2.cubeList.add(new ModelBox(backrightleg2, 136, 141, -2.0F, -0.3705F, -0.1819F, 6, 13, 6, 0.0F, true));

        this.backrightleg3 = new AdvancedModelRenderer(this);
        this.backrightleg3.setRotationPoint(-0.5F, 9.1789F, 5.4963F);
        this.backrightleg2.addChild(backrightleg3);
        this.setRotateAngle(backrightleg3, -0.5672F, 0.0F, 0.0F);
        this.backrightleg3.cubeList.add(new ModelBox(backrightleg3, 0, 104, -1.0F, 2.75F, -4.5F, 5, 4, 6, 0.0F, true));

        this.backrightleg4 = new AdvancedModelRenderer(this);
        this.backrightleg4.setRotationPoint(1.5F, 5.6163F, -0.122F);
        this.backrightleg3.addChild(backrightleg4);
        this.setRotateAngle(backrightleg4, 0.2182F, 0.0F, 0.0F);
        this.backrightleg4.cubeList.add(new ModelBox(backrightleg4, 94, 51, -3.5F, -1.25F, -6.75F, 7, 3, 8, 0.0F, true));

        this.body2 = new AdvancedModelRenderer(this);
        this.body2.setRotationPoint(0.0F, -7.5F, -6.25F);
        this.body.addChild(body2);
        this.setRotateAngle(body2, 0.1309F, 0.0F, 0.0F);
        this.body2.cubeList.add(new ModelBox(body2, 0, 0, -8.5F, 0.0F, -15.0F, 17, 20, 16, 0.0F, false));

        this.leftPlate31 = new AdvancedModelRenderer(this);
        this.leftPlate31.setRotationPoint(3.1F, -0.8195F, -5.2241F);
        this.body2.addChild(leftPlate31);
        this.setRotateAngle(leftPlate31, -0.2342F, 0.3258F, 0.1807F);


        this.cube_r21 = new AdvancedModelRenderer(this);
        this.cube_r21.setRotationPoint(-0.2372F, -6.9867F, -2.0615F);
        this.leftPlate31.addChild(cube_r21);
        this.setRotateAngle(cube_r21, 0.0087F, 0.0F, 0.0F);
        this.cube_r21.cubeList.add(new ModelBox(cube_r21, 117, 45, -0.5F, -0.3333F, -0.4228F, 1, 9, 4, -0.18F, false));

        this.cube_r22 = new AdvancedModelRenderer(this);
        this.cube_r22.setRotationPoint(-0.2182F, -7.9085F, 1.1791F);
        this.leftPlate31.addChild(cube_r22);
        this.setRotateAngle(cube_r22, -0.0524F, 0.0F, 0.0F);
        this.cube_r22.cubeList.add(new ModelBox(cube_r22, 127, 79, -0.519F, -2.2425F, -2.4205F, 1, 4, 2, -0.2F, false));

        this.cube_r23 = new AdvancedModelRenderer(this);
        this.cube_r23.setRotationPoint(-0.2372F, -9.3931F, 0.7873F);
        this.leftPlate31.addChild(cube_r23);
        this.setRotateAngle(cube_r23, 0.1396F, 0.0F, 0.0F);
        this.cube_r23.cubeList.add(new ModelBox(cube_r23, 133, 125, -0.5F, -0.3118F, -1.5957F, 1, 3, 2, -0.22F, false));

        this.cube_r24 = new AdvancedModelRenderer(this);
        this.cube_r24.setRotationPoint(-0.2372F, -11.6931F, -0.4127F);
        this.leftPlate31.addChild(cube_r24);
        this.setRotateAngle(cube_r24, 0.5847F, 0.0F, 0.0F);
        this.cube_r24.cubeList.add(new ModelBox(cube_r24, 130, 7, -0.5F, -0.2238F, -1.8743F, 1, 3, 2, -0.18F, false));

        this.cube_r25 = new AdvancedModelRenderer(this);
        this.cube_r25.setRotationPoint(-0.2372F, -10.4931F, -1.8127F);
        this.leftPlate31.addChild(cube_r25);
        this.setRotateAngle(cube_r25, -0.1134F, 0.0F, 0.0F);
        this.cube_r25.cubeList.add(new ModelBox(cube_r25, 97, 0, -0.5F, -0.3054F, -0.2413F, 1, 4, 2, -0.19F, false));

        this.cube_r26 = new AdvancedModelRenderer(this);
        this.cube_r26.setRotationPoint(-0.2372F, -11.6931F, -0.5127F);
        this.leftPlate31.addChild(cube_r26);
        this.setRotateAngle(cube_r26, -0.6458F, 0.0F, 0.0F);
        this.cube_r26.cubeList.add(new ModelBox(cube_r26, 104, 142, -0.5F, -0.1909F, -0.678F, 1, 2, 1, -0.178F, false));

        this.rightPlate31 = new AdvancedModelRenderer(this);
        this.rightPlate31.setRotationPoint(-3.1F, -0.8195F, -5.2241F);
        this.body2.addChild(rightPlate31);
        this.setRotateAngle(rightPlate31, -0.2342F, -0.3258F, -0.1807F);


        this.cube_r27 = new AdvancedModelRenderer(this);
        this.cube_r27.setRotationPoint(0.2372F, -6.9867F, -2.0615F);
        this.rightPlate31.addChild(cube_r27);
        this.setRotateAngle(cube_r27, 0.0087F, 0.0F, 0.0F);
        this.cube_r27.cubeList.add(new ModelBox(cube_r27, 117, 45, -0.5F, -0.3333F, -0.4228F, 1, 9, 4, -0.18F, true));

        this.cube_r28 = new AdvancedModelRenderer(this);
        this.cube_r28.setRotationPoint(0.2182F, -7.9085F, 1.1791F);
        this.rightPlate31.addChild(cube_r28);
        this.setRotateAngle(cube_r28, -0.0524F, 0.0F, 0.0F);
        this.cube_r28.cubeList.add(new ModelBox(cube_r28, 127, 79, -0.481F, -2.2425F, -2.4205F, 1, 4, 2, -0.2F, true));

        this.cube_r29 = new AdvancedModelRenderer(this);
        this.cube_r29.setRotationPoint(0.2372F, -9.3931F, 0.7873F);
        this.rightPlate31.addChild(cube_r29);
        this.setRotateAngle(cube_r29, 0.1396F, 0.0F, 0.0F);
        this.cube_r29.cubeList.add(new ModelBox(cube_r29, 133, 125, -0.5F, -0.3118F, -1.5957F, 1, 3, 2, -0.22F, true));

        this.cube_r30 = new AdvancedModelRenderer(this);
        this.cube_r30.setRotationPoint(0.2372F, -11.6931F, -0.4127F);
        this.rightPlate31.addChild(cube_r30);
        this.setRotateAngle(cube_r30, 0.5847F, 0.0F, 0.0F);
        this.cube_r30.cubeList.add(new ModelBox(cube_r30, 130, 7, -0.5F, -0.2238F, -1.8743F, 1, 3, 2, -0.18F, true));

        this.cube_r31 = new AdvancedModelRenderer(this);
        this.cube_r31.setRotationPoint(0.2372F, -10.4931F, -1.8127F);
        this.rightPlate31.addChild(cube_r31);
        this.setRotateAngle(cube_r31, -0.1134F, 0.0F, 0.0F);
        this.cube_r31.cubeList.add(new ModelBox(cube_r31, 97, 0, -0.5F, -0.3054F, -0.2413F, 1, 4, 2, -0.19F, true));

        this.cube_r32 = new AdvancedModelRenderer(this);
        this.cube_r32.setRotationPoint(0.2372F, -11.6931F, -0.5127F);
        this.rightPlate31.addChild(cube_r32);
        this.setRotateAngle(cube_r32, -0.6458F, 0.0F, 0.0F);
        this.cube_r32.cubeList.add(new ModelBox(cube_r32, 104, 142, -0.5F, -0.1909F, -0.678F, 1, 2, 1, -0.178F, true));

        this.leftPlate9 = new AdvancedModelRenderer(this);
        this.leftPlate9.setRotationPoint(3.1F, -0.8195F, -1.6241F);
        this.body2.addChild(leftPlate9);
        this.setRotateAngle(leftPlate9, -0.3389F, 0.3258F, 0.1807F);


        this.cube_r33 = new AdvancedModelRenderer(this);
        this.cube_r33.setRotationPoint(-0.2372F, -6.9867F, -2.0615F);
        this.leftPlate9.addChild(cube_r33);
        this.setRotateAngle(cube_r33, 0.0087F, 0.0F, 0.0F);
        this.cube_r33.cubeList.add(new ModelBox(cube_r33, 47, 117, -0.5F, -0.3333F, -0.4228F, 1, 10, 4, -0.18F, false));

        this.cube_r34 = new AdvancedModelRenderer(this);
        this.cube_r34.setRotationPoint(-0.2372F, -9.3931F, 0.7873F);
        this.leftPlate9.addChild(cube_r34);
        this.setRotateAngle(cube_r34, 0.1484F, 0.0F, 0.0F);
        this.cube_r34.cubeList.add(new ModelBox(cube_r34, 133, 119, -0.5F, -0.3118F, -1.5957F, 1, 3, 2, -0.22F, false));

        this.cube_r35 = new AdvancedModelRenderer(this);
        this.cube_r35.setRotationPoint(-0.2372F, -9.2931F, 0.7873F);
        this.leftPlate9.addChild(cube_r35);
        this.setRotateAngle(cube_r35, 0.3403F, 0.0F, 0.0F);
        this.cube_r35.cubeList.add(new ModelBox(cube_r35, 0, 104, -0.5F, -3.8971F, -0.5435F, 1, 4, 1, -0.18F, false));

        this.cube_r36 = new AdvancedModelRenderer(this);
        this.cube_r36.setRotationPoint(-0.2372F, -10.4931F, -1.8127F);
        this.leftPlate9.addChild(cube_r36);
        this.setRotateAngle(cube_r36, -0.1134F, 0.0F, 0.0F);
        this.cube_r36.cubeList.add(new ModelBox(cube_r36, 117, 29, -0.5F, -0.3054F, -0.2413F, 1, 4, 3, -0.19F, false));

        this.cube_r37 = new AdvancedModelRenderer(this);
        this.cube_r37.setRotationPoint(-0.2372F, -10.4931F, -1.6127F);
        this.leftPlate9.addChild(cube_r37);
        this.setRotateAngle(cube_r37, -0.4189F, 0.0F, 0.0F);
        this.cube_r37.cubeList.add(new ModelBox(cube_r37, 115, 9, -0.5F, -2.7964F, -0.4091F, 1, 3, 1, -0.187F, false));

        this.cube_r38 = new AdvancedModelRenderer(this);
        this.cube_r38.setRotationPoint(-0.2372F, -11.6931F, -0.4127F);
        this.leftPlate9.addChild(cube_r38);
        this.setRotateAngle(cube_r38, 1.4224F, 0.0F, 0.0F);
        this.cube_r38.cubeList.add(new ModelBox(cube_r38, 70, 78, -0.5F, -0.5238F, -0.4743F, 1, 1, 1, -0.21F, false));
        this.cube_r38.cubeList.add(new ModelBox(cube_r38, 87, 138, -0.5F, -1.1238F, -1.9743F, 1, 2, 2, -0.213F, false));

        this.rightPlate9 = new AdvancedModelRenderer(this);
        this.rightPlate9.setRotationPoint(-3.1F, -0.8195F, -1.6241F);
        this.body2.addChild(rightPlate9);
        this.setRotateAngle(rightPlate9, -0.3389F, -0.3258F, -0.1807F);


        this.cube_r39 = new AdvancedModelRenderer(this);
        this.cube_r39.setRotationPoint(0.2372F, -6.9867F, -2.0615F);
        this.rightPlate9.addChild(cube_r39);
        this.setRotateAngle(cube_r39, 0.0087F, 0.0F, 0.0F);
        this.cube_r39.cubeList.add(new ModelBox(cube_r39, 47, 117, -0.5F, -0.3333F, -0.4228F, 1, 10, 4, -0.18F, true));

        this.cube_r40 = new AdvancedModelRenderer(this);
        this.cube_r40.setRotationPoint(0.2372F, -9.3931F, 0.7873F);
        this.rightPlate9.addChild(cube_r40);
        this.setRotateAngle(cube_r40, 0.1484F, 0.0F, 0.0F);
        this.cube_r40.cubeList.add(new ModelBox(cube_r40, 133, 119, -0.5F, -0.3118F, -1.5957F, 1, 3, 2, -0.22F, true));

        this.cube_r41 = new AdvancedModelRenderer(this);
        this.cube_r41.setRotationPoint(0.2372F, -9.2931F, 0.7873F);
        this.rightPlate9.addChild(cube_r41);
        this.setRotateAngle(cube_r41, 0.3403F, 0.0F, 0.0F);
        this.cube_r41.cubeList.add(new ModelBox(cube_r41, 0, 104, -0.5F, -3.8971F, -0.5435F, 1, 4, 1, -0.18F, true));

        this.cube_r42 = new AdvancedModelRenderer(this);
        this.cube_r42.setRotationPoint(0.2372F, -10.4931F, -1.8127F);
        this.rightPlate9.addChild(cube_r42);
        this.setRotateAngle(cube_r42, -0.1134F, 0.0F, 0.0F);
        this.cube_r42.cubeList.add(new ModelBox(cube_r42, 117, 29, -0.5F, -0.3054F, -0.2413F, 1, 4, 3, -0.19F, true));

        this.cube_r43 = new AdvancedModelRenderer(this);
        this.cube_r43.setRotationPoint(0.2372F, -10.4931F, -1.6127F);
        this.rightPlate9.addChild(cube_r43);
        this.setRotateAngle(cube_r43, -0.4189F, 0.0F, 0.0F);
        this.cube_r43.cubeList.add(new ModelBox(cube_r43, 115, 9, -0.5F, -2.7964F, -0.4091F, 1, 3, 1, -0.187F, true));

        this.cube_r44 = new AdvancedModelRenderer(this);
        this.cube_r44.setRotationPoint(0.2372F, -11.6931F, -0.4127F);
        this.rightPlate9.addChild(cube_r44);
        this.setRotateAngle(cube_r44, 1.4224F, 0.0F, 0.0F);
        this.cube_r44.cubeList.add(new ModelBox(cube_r44, 70, 78, -0.5F, -0.5238F, -0.4743F, 1, 1, 1, -0.21F, true));
        this.cube_r44.cubeList.add(new ModelBox(cube_r44, 87, 138, -0.5F, -1.1238F, -1.9743F, 1, 2, 2, -0.213F, true));

        this.leftPlate32 = new AdvancedModelRenderer(this);
        this.leftPlate32.setRotationPoint(3.1F, -0.7195F, 1.4759F);
        this.body2.addChild(leftPlate32);
        this.setRotateAngle(leftPlate32, -0.4125F, 0.2851F, 0.1973F);


        this.cube_r45 = new AdvancedModelRenderer(this);
        this.cube_r45.setRotationPoint(-0.6934F, -8.0285F, -1.4731F);
        this.leftPlate32.addChild(cube_r45);
        this.setRotateAngle(cube_r45, 0.0087F, 0.0F, 0.0F);
        this.cube_r45.cubeList.add(new ModelBox(cube_r45, 0, 0, -0.5F, -0.3333F, -0.4228F, 1, 11, 4, -0.18F, false));

        this.cube_r46 = new AdvancedModelRenderer(this);
        this.cube_r46.setRotationPoint(-0.6934F, -10.4349F, 1.3758F);
        this.leftPlate32.addChild(cube_r46);
        this.setRotateAngle(cube_r46, 0.1396F, 0.0F, 0.0F);
        this.cube_r46.cubeList.add(new ModelBox(cube_r46, 34, 133, -0.5F, -0.3118F, -1.5957F, 1, 3, 2, -0.22F, false));

        this.cube_r47 = new AdvancedModelRenderer(this);
        this.cube_r47.setRotationPoint(-0.6934F, -10.3349F, 1.3758F);
        this.leftPlate32.addChild(cube_r47);
        this.setRotateAngle(cube_r47, 0.3403F, 0.0F, 0.0F);
        this.cube_r47.cubeList.add(new ModelBox(cube_r47, 51, 0, -0.5F, -3.8971F, -0.5435F, 1, 4, 1, -0.2F, false));

        this.cube_r48 = new AdvancedModelRenderer(this);
        this.cube_r48.setRotationPoint(-0.6934F, -11.5349F, -1.2242F);
        this.leftPlate32.addChild(cube_r48);
        this.setRotateAngle(cube_r48, -0.1134F, 0.0F, 0.0F);
        this.cube_r48.cubeList.add(new ModelBox(cube_r48, 57, 105, -0.5F, -0.3054F, -0.2413F, 1, 4, 3, -0.19F, false));

        this.cube_r49 = new AdvancedModelRenderer(this);
        this.cube_r49.setRotationPoint(-0.6934F, -13.7349F, -0.0242F);
        this.leftPlate32.addChild(cube_r49);
        this.setRotateAngle(cube_r49, -0.4363F, 0.0F, 0.0F);
        this.cube_r49.cubeList.add(new ModelBox(cube_r49, 97, 22, -0.5F, -0.3799F, -0.4278F, 1, 3, 1, -0.185F, false));

        this.cube_r50 = new AdvancedModelRenderer(this);
        this.cube_r50.setRotationPoint(-0.6934F, -11.9706F, -0.2742F);
        this.leftPlate32.addChild(cube_r50);
        this.setRotateAngle(cube_r50, 1.3788F, 0.0F, 0.0F);
        this.cube_r50.cubeList.add(new ModelBox(cube_r50, 6, 69, -0.5F, -0.3F, 0.3F, 1, 1, 1, -0.22F, false));
        this.cube_r50.cubeList.add(new ModelBox(cube_r50, 138, 88, -0.5F, -0.7F, -1.2F, 1, 2, 2, -0.21F, false));

        this.rightPlate32 = new AdvancedModelRenderer(this);
        this.rightPlate32.setRotationPoint(-3.1F, -0.7195F, 1.4759F);
        this.body2.addChild(rightPlate32);
        this.setRotateAngle(rightPlate32, -0.4125F, -0.2851F, -0.1973F);


        this.cube_r51 = new AdvancedModelRenderer(this);
        this.cube_r51.setRotationPoint(0.6934F, -8.0285F, -1.4731F);
        this.rightPlate32.addChild(cube_r51);
        this.setRotateAngle(cube_r51, 0.0087F, 0.0F, 0.0F);
        this.cube_r51.cubeList.add(new ModelBox(cube_r51, 0, 0, -0.5F, -0.3333F, -0.4228F, 1, 11, 4, -0.18F, true));

        this.cube_r52 = new AdvancedModelRenderer(this);
        this.cube_r52.setRotationPoint(0.6934F, -10.4349F, 1.3758F);
        this.rightPlate32.addChild(cube_r52);
        this.setRotateAngle(cube_r52, 0.1396F, 0.0F, 0.0F);
        this.cube_r52.cubeList.add(new ModelBox(cube_r52, 34, 133, -0.5F, -0.3118F, -1.5957F, 1, 3, 2, -0.22F, true));

        this.cube_r53 = new AdvancedModelRenderer(this);
        this.cube_r53.setRotationPoint(0.6934F, -10.3349F, 1.3758F);
        this.rightPlate32.addChild(cube_r53);
        this.setRotateAngle(cube_r53, 0.3403F, 0.0F, 0.0F);
        this.cube_r53.cubeList.add(new ModelBox(cube_r53, 51, 0, -0.5F, -3.8971F, -0.5435F, 1, 4, 1, -0.2F, true));

        this.cube_r54 = new AdvancedModelRenderer(this);
        this.cube_r54.setRotationPoint(0.6934F, -11.5349F, -1.2242F);
        this.rightPlate32.addChild(cube_r54);
        this.setRotateAngle(cube_r54, -0.1134F, 0.0F, 0.0F);
        this.cube_r54.cubeList.add(new ModelBox(cube_r54, 57, 105, -0.5F, -0.3054F, -0.2413F, 1, 4, 3, -0.19F, true));

        this.cube_r55 = new AdvancedModelRenderer(this);
        this.cube_r55.setRotationPoint(0.6934F, -13.7349F, -0.0242F);
        this.rightPlate32.addChild(cube_r55);
        this.setRotateAngle(cube_r55, -0.4363F, 0.0F, 0.0F);
        this.cube_r55.cubeList.add(new ModelBox(cube_r55, 97, 22, -0.5F, -0.3799F, -0.4278F, 1, 3, 1, -0.185F, true));

        this.cube_r56 = new AdvancedModelRenderer(this);
        this.cube_r56.setRotationPoint(0.6934F, -11.9706F, -0.2742F);
        this.rightPlate32.addChild(cube_r56);
        this.setRotateAngle(cube_r56, 1.3788F, 0.0F, 0.0F);
        this.cube_r56.cubeList.add(new ModelBox(cube_r56, 6, 69, -0.5F, -0.3F, 0.3F, 1, 1, 1, -0.22F, true));
        this.cube_r56.cubeList.add(new ModelBox(cube_r56, 138, 88, -0.5F, -0.7F, -1.2F, 1, 2, 2, -0.21F, true));

        this.leftPlate8 = new AdvancedModelRenderer(this);
        this.leftPlate8.setRotationPoint(3.8F, -0.0195F, -8.8241F);
        this.body2.addChild(leftPlate8);
        this.setRotateAngle(leftPlate8, -0.1906F, 0.3258F, 0.1807F);
        this.leftPlate8.cubeList.add(new ModelBox(leftPlate8, 40, 37, -1.6692F, -7.0988F, -2.7795F, 1, 8, 4, -0.18F, false));

        this.cube_r57 = new AdvancedModelRenderer(this);
        this.cube_r57.setRotationPoint(-1.1502F, -7.6606F, 0.9147F);
        this.leftPlate8.addChild(cube_r57);
        this.setRotateAngle(cube_r57, -0.0524F, 0.0F, 0.0F);
        this.cube_r57.cubeList.add(new ModelBox(cube_r57, 128, 46, -0.519F, -2.2425F, -2.4205F, 1, 4, 2, -0.2F, false));

        this.cube_r58 = new AdvancedModelRenderer(this);
        this.cube_r58.setRotationPoint(-1.1692F, -9.1451F, 0.5229F);
        this.leftPlate8.addChild(cube_r58);
        this.setRotateAngle(cube_r58, 0.1134F, 0.0F, 0.0F);
        this.cube_r58.cubeList.add(new ModelBox(cube_r58, 27, 129, -0.5F, -0.3118F, -1.5957F, 1, 3, 2, -0.22F, false));

        this.cube_r59 = new AdvancedModelRenderer(this);
        this.cube_r59.setRotationPoint(-1.1692F, -11.4451F, -0.6771F);
        this.leftPlate8.addChild(cube_r59);
        this.setRotateAngle(cube_r59, 0.5498F, 0.0F, 0.0F);
        this.cube_r59.cubeList.add(new ModelBox(cube_r59, 130, 13, -0.5F, -0.2238F, -1.7743F, 1, 3, 2, -0.18F, false));

        this.cube_r60 = new AdvancedModelRenderer(this);
        this.cube_r60.setRotationPoint(-1.1692F, -10.2451F, -2.0771F);
        this.leftPlate8.addChild(cube_r60);
        this.setRotateAngle(cube_r60, -0.1309F, 0.0F, 0.0F);
        this.cube_r60.cubeList.add(new ModelBox(cube_r60, 128, 0, -0.5F, -0.4054F, -0.2687F, 1, 4, 2, -0.19F, false));

        this.cube_r61 = new AdvancedModelRenderer(this);
        this.cube_r61.setRotationPoint(-1.1692F, -11.4451F, -0.7771F);
        this.leftPlate8.addChild(cube_r61);
        this.setRotateAngle(cube_r61, -0.6632F, 0.0F, 0.0F);
        this.cube_r61.cubeList.add(new ModelBox(cube_r61, 142, 134, -0.5F, -0.1909F, -0.678F, 1, 2, 1, -0.178F, false));

        this.rightPlate8 = new AdvancedModelRenderer(this);
        this.rightPlate8.setRotationPoint(-3.8F, -0.0195F, -8.8241F);
        this.body2.addChild(rightPlate8);
        this.setRotateAngle(rightPlate8, -0.1906F, -0.3258F, -0.1807F);
        this.rightPlate8.cubeList.add(new ModelBox(rightPlate8, 40, 37, 0.6692F, -7.0988F, -2.7795F, 1, 8, 4, -0.18F, true));

        this.cube_r62 = new AdvancedModelRenderer(this);
        this.cube_r62.setRotationPoint(1.1502F, -7.6606F, 0.9147F);
        this.rightPlate8.addChild(cube_r62);
        this.setRotateAngle(cube_r62, -0.0524F, 0.0F, 0.0F);
        this.cube_r62.cubeList.add(new ModelBox(cube_r62, 128, 46, -0.481F, -2.2425F, -2.4205F, 1, 4, 2, -0.2F, true));

        this.cube_r63 = new AdvancedModelRenderer(this);
        this.cube_r63.setRotationPoint(1.1692F, -9.1451F, 0.5229F);
        this.rightPlate8.addChild(cube_r63);
        this.setRotateAngle(cube_r63, 0.1134F, 0.0F, 0.0F);
        this.cube_r63.cubeList.add(new ModelBox(cube_r63, 27, 129, -0.5F, -0.3118F, -1.5957F, 1, 3, 2, -0.22F, true));

        this.cube_r64 = new AdvancedModelRenderer(this);
        this.cube_r64.setRotationPoint(1.1692F, -11.4451F, -0.6771F);
        this.rightPlate8.addChild(cube_r64);
        this.setRotateAngle(cube_r64, 0.5498F, 0.0F, 0.0F);
        this.cube_r64.cubeList.add(new ModelBox(cube_r64, 130, 13, -0.5F, -0.2238F, -1.7743F, 1, 3, 2, -0.18F, true));

        this.cube_r65 = new AdvancedModelRenderer(this);
        this.cube_r65.setRotationPoint(1.1692F, -10.2451F, -2.0771F);
        this.rightPlate8.addChild(cube_r65);
        this.setRotateAngle(cube_r65, -0.1309F, 0.0F, 0.0F);
        this.cube_r65.cubeList.add(new ModelBox(cube_r65, 128, 0, -0.5F, -0.4054F, -0.2687F, 1, 4, 2, -0.19F, true));

        this.cube_r66 = new AdvancedModelRenderer(this);
        this.cube_r66.setRotationPoint(1.1692F, -11.4451F, -0.7771F);
        this.rightPlate8.addChild(cube_r66);
        this.setRotateAngle(cube_r66, -0.6632F, 0.0F, 0.0F);
        this.cube_r66.cubeList.add(new ModelBox(cube_r66, 142, 134, -0.5F, -0.1909F, -0.678F, 1, 2, 1, -0.178F, true));

        this.leftPlate30 = new AdvancedModelRenderer(this);
        this.leftPlate30.setRotationPoint(3.7F, -1.2195F, -12.1241F);
        this.body2.addChild(leftPlate30);
        this.setRotateAngle(leftPlate30, -0.1033F, 0.3258F, 0.1807F);


        this.cube_r67 = new AdvancedModelRenderer(this);
        this.cube_r67.setRotationPoint(-0.7604F, 1.5953F, -0.4452F);
        this.leftPlate30.addChild(cube_r67);
        this.setRotateAngle(cube_r67, -0.0524F, 0.0F, 0.0F);
        this.cube_r67.cubeList.add(new ModelBox(cube_r67, 0, 37, -0.5F, -6.382F, -2.3125F, 1, 8, 4, -0.18F, false));

        this.cube_r68 = new AdvancedModelRenderer(this);
        this.cube_r68.setRotationPoint(-0.7414F, -5.3265F, 1.2955F);
        this.leftPlate30.addChild(cube_r68);
        this.setRotateAngle(cube_r68, -0.0524F, 0.0F, 0.0F);
        this.cube_r68.cubeList.add(new ModelBox(cube_r68, 42, 105, -0.519F, -2.2425F, -2.4205F, 1, 4, 2, -0.2F, false));

        this.cube_r69 = new AdvancedModelRenderer(this);
        this.cube_r69.setRotationPoint(-0.7604F, -6.8111F, 0.9037F);
        this.leftPlate30.addChild(cube_r69);
        this.setRotateAngle(cube_r69, 0.096F, 0.0F, 0.0F);
        this.cube_r69.cubeList.add(new ModelBox(cube_r69, 103, 130, -0.5F, -0.3118F, -1.5957F, 1, 3, 2, -0.22F, false));

        this.cube_r70 = new AdvancedModelRenderer(this);
        this.cube_r70.setRotationPoint(-0.7604F, -9.1111F, -0.2963F);
        this.leftPlate30.addChild(cube_r70);
        this.setRotateAngle(cube_r70, 0.5498F, 0.0F, 0.0F);
        this.cube_r70.cubeList.add(new ModelBox(cube_r70, 131, 59, -0.5F, -0.2238F, -1.7743F, 1, 3, 2, -0.18F, false));

        this.cube_r71 = new AdvancedModelRenderer(this);
        this.cube_r71.setRotationPoint(-0.7604F, -7.9111F, -1.6963F);
        this.leftPlate30.addChild(cube_r71);
        this.setRotateAngle(cube_r71, -0.1484F, 0.0F, 0.0F);
        this.cube_r71.cubeList.add(new ModelBox(cube_r71, 126, 27, -0.5F, -0.3054F, -0.2413F, 1, 4, 2, -0.185F, false));

        this.cube_r72 = new AdvancedModelRenderer(this);
        this.cube_r72.setRotationPoint(-0.7604F, -9.1111F, -0.3963F);
        this.leftPlate30.addChild(cube_r72);
        this.setRotateAngle(cube_r72, -0.6458F, 0.0F, 0.0F);
        this.cube_r72.cubeList.add(new ModelBox(cube_r72, 0, 143, -0.5F, -0.1909F, -0.678F, 1, 2, 1, -0.19F, false));

        this.rightPlate30 = new AdvancedModelRenderer(this);
        this.rightPlate30.setRotationPoint(-3.7F, -1.2195F, -12.1241F);
        this.body2.addChild(rightPlate30);
        this.setRotateAngle(rightPlate30, -0.1033F, -0.3258F, -0.1807F);


        this.cube_r73 = new AdvancedModelRenderer(this);
        this.cube_r73.setRotationPoint(0.7604F, 1.5953F, -0.4452F);
        this.rightPlate30.addChild(cube_r73);
        this.setRotateAngle(cube_r73, -0.0524F, 0.0F, 0.0F);
        this.cube_r73.cubeList.add(new ModelBox(cube_r73, 0, 37, -0.5F, -6.382F, -2.3125F, 1, 8, 4, -0.18F, true));

        this.cube_r74 = new AdvancedModelRenderer(this);
        this.cube_r74.setRotationPoint(0.7414F, -5.3265F, 1.2955F);
        this.rightPlate30.addChild(cube_r74);
        this.setRotateAngle(cube_r74, -0.0524F, 0.0F, 0.0F);
        this.cube_r74.cubeList.add(new ModelBox(cube_r74, 42, 105, -0.481F, -2.2425F, -2.4205F, 1, 4, 2, -0.2F, true));

        this.cube_r75 = new AdvancedModelRenderer(this);
        this.cube_r75.setRotationPoint(0.7604F, -6.8111F, 0.9037F);
        this.rightPlate30.addChild(cube_r75);
        this.setRotateAngle(cube_r75, 0.096F, 0.0F, 0.0F);
        this.cube_r75.cubeList.add(new ModelBox(cube_r75, 103, 130, -0.5F, -0.3118F, -1.5957F, 1, 3, 2, -0.22F, true));

        this.cube_r76 = new AdvancedModelRenderer(this);
        this.cube_r76.setRotationPoint(0.7604F, -9.1111F, -0.2963F);
        this.rightPlate30.addChild(cube_r76);
        this.setRotateAngle(cube_r76, 0.5498F, 0.0F, 0.0F);
        this.cube_r76.cubeList.add(new ModelBox(cube_r76, 131, 59, -0.5F, -0.2238F, -1.7743F, 1, 3, 2, -0.18F, true));

        this.cube_r77 = new AdvancedModelRenderer(this);
        this.cube_r77.setRotationPoint(0.7604F, -7.9111F, -1.6963F);
        this.rightPlate30.addChild(cube_r77);
        this.setRotateAngle(cube_r77, -0.1484F, 0.0F, 0.0F);
        this.cube_r77.cubeList.add(new ModelBox(cube_r77, 126, 27, -0.5F, -0.3054F, -0.2413F, 1, 4, 2, -0.185F, true));

        this.cube_r78 = new AdvancedModelRenderer(this);
        this.cube_r78.setRotationPoint(0.7604F, -9.1111F, -0.3963F);
        this.rightPlate30.addChild(cube_r78);
        this.setRotateAngle(cube_r78, -0.6458F, 0.0F, 0.0F);
        this.cube_r78.cubeList.add(new ModelBox(cube_r78, 0, 143, -0.5F, -0.1909F, -0.678F, 1, 2, 1, -0.19F, true));

        this.upperbody = new AdvancedModelRenderer(this);
        this.upperbody.setRotationPoint(0.0F, 0.296F, -14.9452F);
        this.body2.addChild(upperbody);
        this.setRotateAngle(upperbody, -0.0873F, 0.0F, 0.0F);
        this.upperbody.cubeList.add(new ModelBox(upperbody, 53, 37, -7.5F, 5.954F, -6.8048F, 15, 12, 9, 0.0F, false));

        this.cube_r79 = new AdvancedModelRenderer(this);
        this.cube_r79.setRotationPoint(2.2644F, -0.0363F, 0.0354F);
        this.upperbody.addChild(cube_r79);
        this.setRotateAngle(cube_r79, 0.48F, 0.0F, 0.0F);
        this.cube_r79.cubeList.add(new ModelBox(cube_r79, 43, 59, -9.7644F, -0.031F, -9.5463F, 15, 8, 10, -0.01F, false));

        this.leftPlate29 = new AdvancedModelRenderer(this);
        this.leftPlate29.setRotationPoint(3.5F, -0.0155F, -0.379F);
        this.upperbody.addChild(leftPlate29);
        this.setRotateAngle(leftPlate29, 0.0538F, 0.3258F, 0.1807F);


        this.cube_r80 = new AdvancedModelRenderer(this);
        this.cube_r80.setRotationPoint(-0.7604F, -6.4047F, -1.9452F);
        this.leftPlate29.addChild(cube_r80);
        this.setRotateAngle(cube_r80, 0.0349F, 0.0F, 0.0F);
        this.cube_r80.cubeList.add(new ModelBox(cube_r80, 103, 118, -0.5F, -0.3333F, -0.4228F, 1, 8, 3, -0.18F, false));

        this.cube_r81 = new AdvancedModelRenderer(this);
        this.cube_r81.setRotationPoint(-0.7414F, -5.3265F, 1.2955F);
        this.leftPlate29.addChild(cube_r81);
        this.setRotateAngle(cube_r81, -0.0524F, 0.0F, 0.0F);
        this.cube_r81.cubeList.add(new ModelBox(cube_r81, 20, 122, -0.519F, -0.2425F, -1.8205F, 1, 7, 2, -0.19F, false));

        this.cube_r82 = new AdvancedModelRenderer(this);
        this.cube_r82.setRotationPoint(-0.7604F, -6.8111F, 0.9037F);
        this.leftPlate29.addChild(cube_r82);
        this.setRotateAngle(cube_r82, 0.096F, 0.0F, 0.0F);
        this.cube_r82.cubeList.add(new ModelBox(cube_r82, 134, 81, -0.5F, -0.3118F, -1.5957F, 1, 2, 2, -0.2F, false));

        this.cube_r83 = new AdvancedModelRenderer(this);
        this.cube_r83.setRotationPoint(-0.7604F, -9.1111F, -0.2963F);
        this.leftPlate29.addChild(cube_r83);
        this.setRotateAngle(cube_r83, 0.5498F, 0.0F, 0.0F);
        this.cube_r83.cubeList.add(new ModelBox(cube_r83, 131, 65, -0.5F, -0.2238F, -1.7743F, 1, 3, 2, -0.22F, false));

        this.cube_r84 = new AdvancedModelRenderer(this);
        this.cube_r84.setRotationPoint(-0.7604F, -7.9111F, -1.6963F);
        this.leftPlate29.addChild(cube_r84);
        this.setRotateAngle(cube_r84, -0.2793F, 0.0F, 0.0F);
        this.cube_r84.cubeList.add(new ModelBox(cube_r84, 37, 105, -0.5F, -0.4054F, -0.3413F, 1, 2, 1, -0.187F, false));

        this.cube_r85 = new AdvancedModelRenderer(this);
        this.cube_r85.setRotationPoint(-0.7604F, -9.1111F, -0.3963F);
        this.leftPlate29.addChild(cube_r85);
        this.setRotateAngle(cube_r85, -0.6632F, 0.0F, 0.0F);
        this.cube_r85.cubeList.add(new ModelBox(cube_r85, 140, 28, -0.5F, -0.1909F, -0.678F, 1, 2, 1, -0.19F, false));

        this.cube_r86 = new AdvancedModelRenderer(this);
        this.cube_r86.setRotationPoint(-0.7604F, -7.0787F, -1.05F);
        this.leftPlate29.addChild(cube_r86);
        this.setRotateAngle(cube_r86, -0.2356F, 0.0F, 0.0F);
        this.cube_r86.cubeList.add(new ModelBox(cube_r86, 73, 138, -0.5F, -1.0F, -1.2F, 1, 2, 2, -0.21F, false));

        this.rightPlate29 = new AdvancedModelRenderer(this);
        this.rightPlate29.setRotationPoint(-3.5F, -0.0155F, -0.379F);
        this.upperbody.addChild(rightPlate29);
        this.setRotateAngle(rightPlate29, 0.0538F, -0.3258F, -0.1807F);


        this.cube_r87 = new AdvancedModelRenderer(this);
        this.cube_r87.setRotationPoint(0.7604F, -6.4047F, -1.9452F);
        this.rightPlate29.addChild(cube_r87);
        this.setRotateAngle(cube_r87, 0.0349F, 0.0F, 0.0F);
        this.cube_r87.cubeList.add(new ModelBox(cube_r87, 103, 118, -0.5F, -0.3333F, -0.4228F, 1, 8, 3, -0.18F, true));

        this.cube_r88 = new AdvancedModelRenderer(this);
        this.cube_r88.setRotationPoint(0.7414F, -5.3265F, 1.2955F);
        this.rightPlate29.addChild(cube_r88);
        this.setRotateAngle(cube_r88, -0.0524F, 0.0F, 0.0F);
        this.cube_r88.cubeList.add(new ModelBox(cube_r88, 20, 122, -0.481F, -0.2425F, -1.8205F, 1, 7, 2, -0.19F, true));

        this.cube_r89 = new AdvancedModelRenderer(this);
        this.cube_r89.setRotationPoint(0.7604F, -6.8111F, 0.9037F);
        this.rightPlate29.addChild(cube_r89);
        this.setRotateAngle(cube_r89, 0.096F, 0.0F, 0.0F);
        this.cube_r89.cubeList.add(new ModelBox(cube_r89, 134, 81, -0.5F, -0.3118F, -1.5957F, 1, 2, 2, -0.2F, true));

        this.cube_r90 = new AdvancedModelRenderer(this);
        this.cube_r90.setRotationPoint(0.7604F, -9.1111F, -0.2963F);
        this.rightPlate29.addChild(cube_r90);
        this.setRotateAngle(cube_r90, 0.5498F, 0.0F, 0.0F);
        this.cube_r90.cubeList.add(new ModelBox(cube_r90, 131, 65, -0.5F, -0.2238F, -1.7743F, 1, 3, 2, -0.22F, true));

        this.cube_r91 = new AdvancedModelRenderer(this);
        this.cube_r91.setRotationPoint(0.7604F, -7.9111F, -1.6963F);
        this.rightPlate29.addChild(cube_r91);
        this.setRotateAngle(cube_r91, -0.2793F, 0.0F, 0.0F);
        this.cube_r91.cubeList.add(new ModelBox(cube_r91, 37, 105, -0.5F, -0.4054F, -0.3413F, 1, 2, 1, -0.187F, true));

        this.cube_r92 = new AdvancedModelRenderer(this);
        this.cube_r92.setRotationPoint(0.7604F, -9.1111F, -0.3963F);
        this.rightPlate29.addChild(cube_r92);
        this.setRotateAngle(cube_r92, -0.6632F, 0.0F, 0.0F);
        this.cube_r92.cubeList.add(new ModelBox(cube_r92, 140, 28, -0.5F, -0.1909F, -0.678F, 1, 2, 1, -0.19F, true));

        this.cube_r93 = new AdvancedModelRenderer(this);
        this.cube_r93.setRotationPoint(0.7604F, -7.0787F, -1.05F);
        this.rightPlate29.addChild(cube_r93);
        this.setRotateAngle(cube_r93, -0.2356F, 0.0F, 0.0F);
        this.cube_r93.cubeList.add(new ModelBox(cube_r93, 73, 138, -0.5F, -1.0F, -1.2F, 1, 2, 2, -0.21F, true));

        this.leftPlate7 = new AdvancedModelRenderer(this);
        this.leftPlate7.setRotationPoint(2.9F, 1.8845F, -2.679F);
        this.upperbody.addChild(leftPlate7);
        this.setRotateAngle(leftPlate7, 0.1497F, 0.3258F, 0.1807F);


        this.cube_r94 = new AdvancedModelRenderer(this);
        this.cube_r94.setRotationPoint(-0.7604F, -6.4047F, -1.9452F);
        this.leftPlate7.addChild(cube_r94);
        this.setRotateAngle(cube_r94, 0.0349F, 0.0F, 0.0F);
        this.cube_r94.cubeList.add(new ModelBox(cube_r94, 0, 69, -0.5F, -0.3333F, -0.4228F, 1, 8, 3, -0.19F, false));

        this.cube_r95 = new AdvancedModelRenderer(this);
        this.cube_r95.setRotationPoint(-0.7414F, -5.3265F, 1.2955F);
        this.leftPlate7.addChild(cube_r95);
        this.setRotateAngle(cube_r95, -0.0524F, 0.0F, 0.0F);
        this.cube_r95.cubeList.add(new ModelBox(cube_r95, 120, 77, -0.519F, -0.2425F, -1.8205F, 1, 7, 2, -0.2F, false));

        this.cube_r96 = new AdvancedModelRenderer(this);
        this.cube_r96.setRotationPoint(-0.7604F, -6.8111F, 0.9037F);
        this.leftPlate7.addChild(cube_r96);
        this.setRotateAngle(cube_r96, 0.096F, 0.0F, 0.0F);
        this.cube_r96.cubeList.add(new ModelBox(cube_r96, 30, 90, -0.5F, -0.3118F, -1.5957F, 1, 2, 2, -0.21F, false));

        this.cube_r97 = new AdvancedModelRenderer(this);
        this.cube_r97.setRotationPoint(-0.7604F, -9.1111F, -0.2963F);
        this.leftPlate7.addChild(cube_r97);
        this.setRotateAngle(cube_r97, 0.5498F, 0.0F, 0.0F);
        this.cube_r97.cubeList.add(new ModelBox(cube_r97, 131, 71, -0.5F, -0.2238F, -1.7743F, 1, 3, 2, -0.22F, false));

        this.cube_r98 = new AdvancedModelRenderer(this);
        this.cube_r98.setRotationPoint(-0.7604F, -7.9111F, -1.6963F);
        this.leftPlate7.addChild(cube_r98);
        this.setRotateAngle(cube_r98, -0.2793F, 0.0F, 0.0F);
        this.cube_r98.cubeList.add(new ModelBox(cube_r98, 140, 44, -0.5F, -0.4054F, -0.2896F, 1, 2, 1, -0.189F, false));

        this.cube_r99 = new AdvancedModelRenderer(this);
        this.cube_r99.setRotationPoint(-0.7604F, -9.1111F, -0.3963F);
        this.leftPlate7.addChild(cube_r99);
        this.setRotateAngle(cube_r99, -0.6458F, 0.0F, 0.0F);
        this.cube_r99.cubeList.add(new ModelBox(cube_r99, 141, 129, -0.5F, -0.1909F, -0.678F, 1, 2, 1, -0.19F, false));

        this.cube_r100 = new AdvancedModelRenderer(this);
        this.cube_r100.setRotationPoint(-0.7604F, -6.73F, -1.1415F);
        this.leftPlate7.addChild(cube_r100);
        this.setRotateAngle(cube_r100, -0.2967F, 0.0F, 0.0F);
        this.cube_r100.cubeList.add(new ModelBox(cube_r100, 80, 138, -0.5F, -1.2F, -1.1F, 1, 2, 2, -0.209F, false));

        this.rightPlate7 = new AdvancedModelRenderer(this);
        this.rightPlate7.setRotationPoint(-2.9F, 1.8845F, -2.679F);
        this.upperbody.addChild(rightPlate7);
        this.setRotateAngle(rightPlate7, 0.1497F, -0.3258F, -0.1807F);


        this.cube_r101 = new AdvancedModelRenderer(this);
        this.cube_r101.setRotationPoint(0.7604F, -6.4047F, -1.9452F);
        this.rightPlate7.addChild(cube_r101);
        this.setRotateAngle(cube_r101, 0.0349F, 0.0F, 0.0F);
        this.cube_r101.cubeList.add(new ModelBox(cube_r101, 0, 69, -0.5F, -0.3333F, -0.4228F, 1, 8, 3, -0.19F, true));

        this.cube_r102 = new AdvancedModelRenderer(this);
        this.cube_r102.setRotationPoint(0.7414F, -5.3265F, 1.2955F);
        this.rightPlate7.addChild(cube_r102);
        this.setRotateAngle(cube_r102, -0.0524F, 0.0F, 0.0F);
        this.cube_r102.cubeList.add(new ModelBox(cube_r102, 120, 77, -0.481F, -0.2425F, -1.8205F, 1, 7, 2, -0.2F, true));

        this.cube_r103 = new AdvancedModelRenderer(this);
        this.cube_r103.setRotationPoint(0.7604F, -6.8111F, 0.9037F);
        this.rightPlate7.addChild(cube_r103);
        this.setRotateAngle(cube_r103, 0.096F, 0.0F, 0.0F);
        this.cube_r103.cubeList.add(new ModelBox(cube_r103, 30, 90, -0.5F, -0.3118F, -1.5957F, 1, 2, 2, -0.21F, true));

        this.cube_r104 = new AdvancedModelRenderer(this);
        this.cube_r104.setRotationPoint(0.7604F, -9.1111F, -0.2963F);
        this.rightPlate7.addChild(cube_r104);
        this.setRotateAngle(cube_r104, 0.5498F, 0.0F, 0.0F);
        this.cube_r104.cubeList.add(new ModelBox(cube_r104, 131, 71, -0.5F, -0.2238F, -1.7743F, 1, 3, 2, -0.22F, true));

        this.cube_r105 = new AdvancedModelRenderer(this);
        this.cube_r105.setRotationPoint(0.7604F, -7.9111F, -1.6963F);
        this.rightPlate7.addChild(cube_r105);
        this.setRotateAngle(cube_r105, -0.2793F, 0.0F, 0.0F);
        this.cube_r105.cubeList.add(new ModelBox(cube_r105, 140, 44, -0.5F, -0.4054F, -0.2896F, 1, 2, 1, -0.189F, true));

        this.cube_r106 = new AdvancedModelRenderer(this);
        this.cube_r106.setRotationPoint(0.7604F, -9.1111F, -0.3963F);
        this.rightPlate7.addChild(cube_r106);
        this.setRotateAngle(cube_r106, -0.6458F, 0.0F, 0.0F);
        this.cube_r106.cubeList.add(new ModelBox(cube_r106, 141, 129, -0.5F, -0.1909F, -0.678F, 1, 2, 1, -0.19F, true));

        this.cube_r107 = new AdvancedModelRenderer(this);
        this.cube_r107.setRotationPoint(0.7604F, -6.73F, -1.1415F);
        this.rightPlate7.addChild(cube_r107);
        this.setRotateAngle(cube_r107, -0.2967F, 0.0F, 0.0F);
        this.cube_r107.cubeList.add(new ModelBox(cube_r107, 80, 138, -0.5F, -1.2F, -1.1F, 1, 2, 2, -0.209F, true));

        this.leftPlate6 = new AdvancedModelRenderer(this);
        this.leftPlate6.setRotationPoint(2.2F, 1.1845F, -5.579F);
        this.upperbody.addChild(leftPlate6);
        this.setRotateAngle(leftPlate6, 0.1934F, 0.3258F, 0.1807F);
        this.leftPlate6.cubeList.add(new ModelBox(leftPlate6, 84, 59, -0.5792F, -3.0995F, -1.8121F, 1, 6, 3, -0.19F, false));

        this.cube_r108 = new AdvancedModelRenderer(this);
        this.cube_r108.setRotationPoint(-0.0602F, -1.388F, 1.4514F);
        this.leftPlate6.addChild(cube_r108);
        this.setRotateAngle(cube_r108, -0.0524F, 0.0F, 0.0F);
        this.cube_r108.cubeList.add(new ModelBox(cube_r108, 126, 121, -0.519F, -0.2425F, -1.8205F, 1, 4, 2, -0.2F, false));

        this.cube_r109 = new AdvancedModelRenderer(this);
        this.cube_r109.setRotationPoint(-0.0792F, -2.8726F, 1.0596F);
        this.leftPlate6.addChild(cube_r109);
        this.setRotateAngle(cube_r109, 0.096F, 0.0F, 0.0F);
        this.cube_r109.cubeList.add(new ModelBox(cube_r109, 142, 48, -0.5F, -0.3118F, -0.5957F, 1, 2, 1, -0.22F, false));

        this.cube_r110 = new AdvancedModelRenderer(this);
        this.cube_r110.setRotationPoint(-0.0792F, -5.1726F, -0.1404F);
        this.leftPlate6.addChild(cube_r110);
        this.setRotateAngle(cube_r110, 0.5498F, 0.0F, 0.0F);
        this.cube_r110.cubeList.add(new ModelBox(cube_r110, 37, 81, -0.5F, 0.7762F, -2.2743F, 1, 2, 2, -0.2F, false));
        this.cube_r110.cubeList.add(new ModelBox(cube_r110, 46, 138, -0.5F, -0.2238F, -0.7743F, 1, 3, 1, -0.187F, false));

        this.cube_r111 = new AdvancedModelRenderer(this);
        this.cube_r111.setRotationPoint(-0.0792F, -3.7726F, -1.2404F);
        this.leftPlate6.addChild(cube_r111);
        this.setRotateAngle(cube_r111, -0.3491F, 0.0F, 0.0F);
        this.cube_r111.cubeList.add(new ModelBox(cube_r111, 67, 22, -0.5F, -1.8485F, -0.2172F, 1, 3, 1, -0.189F, false));

        this.cube_r112 = new AdvancedModelRenderer(this);
        this.cube_r112.setRotationPoint(-0.0792F, -3.7789F, -0.2679F);
        this.leftPlate6.addChild(cube_r112);
        this.setRotateAngle(cube_r112, -0.0175F, 0.0F, 0.0F);
        this.cube_r112.cubeList.add(new ModelBox(cube_r112, 7, 37, -0.5F, -1.0F, -0.6F, 1, 2, 1, -0.21F, false));

        this.rightPlate6 = new AdvancedModelRenderer(this);
        this.rightPlate6.setRotationPoint(-2.2F, 1.1845F, -5.579F);
        this.upperbody.addChild(rightPlate6);
        this.setRotateAngle(rightPlate6, 0.1934F, -0.3258F, -0.1807F);
        this.rightPlate6.cubeList.add(new ModelBox(rightPlate6, 84, 59, -0.4208F, -3.0995F, -1.8121F, 1, 6, 3, -0.19F, true));

        this.cube_r113 = new AdvancedModelRenderer(this);
        this.cube_r113.setRotationPoint(0.0602F, -1.388F, 1.4514F);
        this.rightPlate6.addChild(cube_r113);
        this.setRotateAngle(cube_r113, -0.0524F, 0.0F, 0.0F);
        this.cube_r113.cubeList.add(new ModelBox(cube_r113, 126, 121, -0.481F, -0.2425F, -1.8205F, 1, 4, 2, -0.2F, true));

        this.cube_r114 = new AdvancedModelRenderer(this);
        this.cube_r114.setRotationPoint(0.0792F, -2.8726F, 1.0596F);
        this.rightPlate6.addChild(cube_r114);
        this.setRotateAngle(cube_r114, 0.096F, 0.0F, 0.0F);
        this.cube_r114.cubeList.add(new ModelBox(cube_r114, 142, 48, -0.5F, -0.3118F, -0.5957F, 1, 2, 1, -0.22F, true));

        this.cube_r115 = new AdvancedModelRenderer(this);
        this.cube_r115.setRotationPoint(0.0792F, -5.1726F, -0.1404F);
        this.rightPlate6.addChild(cube_r115);
        this.setRotateAngle(cube_r115, 0.5498F, 0.0F, 0.0F);
        this.cube_r115.cubeList.add(new ModelBox(cube_r115, 37, 81, -0.5F, 0.7762F, -2.2743F, 1, 2, 2, -0.2F, true));
        this.cube_r115.cubeList.add(new ModelBox(cube_r115, 46, 138, -0.5F, -0.2238F, -0.7743F, 1, 3, 1, -0.187F, true));

        this.cube_r116 = new AdvancedModelRenderer(this);
        this.cube_r116.setRotationPoint(0.0792F, -3.7726F, -1.2404F);
        this.rightPlate6.addChild(cube_r116);
        this.setRotateAngle(cube_r116, -0.3491F, 0.0F, 0.0F);
        this.cube_r116.cubeList.add(new ModelBox(cube_r116, 67, 22, -0.5F, -1.8485F, -0.2172F, 1, 3, 1, -0.189F, true));

        this.cube_r117 = new AdvancedModelRenderer(this);
        this.cube_r117.setRotationPoint(0.0792F, -3.7789F, -0.2679F);
        this.rightPlate6.addChild(cube_r117);
        this.setRotateAngle(cube_r117, -0.0175F, 0.0F, 0.0F);
        this.cube_r117.cubeList.add(new ModelBox(cube_r117, 7, 37, -0.5F, -1.0F, -0.6F, 1, 2, 1, -0.21F, true));

        this.leftPlate28 = new AdvancedModelRenderer(this);
        this.leftPlate28.setRotationPoint(2.0F, 3.2845F, -7.179F);
        this.upperbody.addChild(leftPlate28);
        this.setRotateAngle(leftPlate28, 0.3587F, 0.3628F, 0.2583F);


        this.cube_r118 = new AdvancedModelRenderer(this);
        this.cube_r118.setRotationPoint(-0.0792F, -1.6662F, -1.1893F);
        this.leftPlate28.addChild(cube_r118);
        this.setRotateAngle(cube_r118, 0.1745F, 0.0F, 0.0F);
        this.cube_r118.cubeList.add(new ModelBox(cube_r118, 127, 19, -0.5F, -1.4846F, -0.4083F, 1, 4, 2, -0.2F, false));

        this.cube_r119 = new AdvancedModelRenderer(this);
        this.cube_r119.setRotationPoint(-0.0602F, 0.312F, 0.5514F);
        this.leftPlate28.addChild(cube_r119);
        this.setRotateAngle(cube_r119, -0.192F, 0.0F, 0.0F);
        this.cube_r119.cubeList.add(new ModelBox(cube_r119, 128, 53, -0.519F, -2.083F, -1.3073F, 1, 3, 2, -0.19F, false));

        this.cube_r120 = new AdvancedModelRenderer(this);
        this.cube_r120.setRotationPoint(-0.0792F, -2.8726F, 1.0596F);
        this.leftPlate28.addChild(cube_r120);
        this.setRotateAngle(cube_r120, 0.096F, 0.0F, 0.0F);
        this.cube_r120.cubeList.add(new ModelBox(cube_r120, 131, 133, -0.5F, -0.3118F, -1.5957F, 1, 2, 2, -0.21F, false));

        this.cube_r121 = new AdvancedModelRenderer(this);
        this.cube_r121.setRotationPoint(-0.0792F, -3.6276F, -0.2191F);
        this.leftPlate28.addChild(cube_r121);
        this.setRotateAngle(cube_r121, -1.0297F, 0.0F, 0.0F);
        this.cube_r121.cubeList.add(new ModelBox(cube_r121, 106, 9, -0.5F, -0.9F, -1.0F, 1, 2, 3, -0.25F, false));

        this.cube_r122 = new AdvancedModelRenderer(this);
        this.cube_r122.setRotationPoint(-0.0792F, -5.1726F, -0.1404F);
        this.leftPlate28.addChild(cube_r122);
        this.setRotateAngle(cube_r122, 0.5498F, 0.0F, 0.0F);
        this.cube_r122.cubeList.add(new ModelBox(cube_r122, 138, 101, -0.5F, -0.2238F, -0.7743F, 1, 3, 1, -0.22F, false));

        this.cube_r123 = new AdvancedModelRenderer(this);
        this.cube_r123.setRotationPoint(-0.0792F, -3.7726F, -1.2404F);
        this.leftPlate28.addChild(cube_r123);
        this.setRotateAngle(cube_r123, -0.3491F, 0.0F, 0.0F);
        this.cube_r123.cubeList.add(new ModelBox(cube_r123, 111, 113, -0.5F, -1.8485F, -0.2172F, 1, 3, 1, -0.19F, false));

        this.rightPlate28 = new AdvancedModelRenderer(this);
        this.rightPlate28.setRotationPoint(-2.0F, 3.2845F, -7.179F);
        this.upperbody.addChild(rightPlate28);
        this.setRotateAngle(rightPlate28, 0.3587F, -0.3628F, -0.2583F);


        this.cube_r124 = new AdvancedModelRenderer(this);
        this.cube_r124.setRotationPoint(0.0792F, -1.6662F, -1.1893F);
        this.rightPlate28.addChild(cube_r124);
        this.setRotateAngle(cube_r124, 0.1745F, 0.0F, 0.0F);
        this.cube_r124.cubeList.add(new ModelBox(cube_r124, 127, 19, -0.5F, -1.4846F, -0.4083F, 1, 4, 2, -0.2F, true));

        this.cube_r125 = new AdvancedModelRenderer(this);
        this.cube_r125.setRotationPoint(0.0602F, 0.312F, 0.5514F);
        this.rightPlate28.addChild(cube_r125);
        this.setRotateAngle(cube_r125, -0.192F, 0.0F, 0.0F);
        this.cube_r125.cubeList.add(new ModelBox(cube_r125, 128, 53, -0.481F, -2.083F, -1.3073F, 1, 3, 2, -0.19F, true));

        this.cube_r126 = new AdvancedModelRenderer(this);
        this.cube_r126.setRotationPoint(0.0792F, -2.8726F, 1.0596F);
        this.rightPlate28.addChild(cube_r126);
        this.setRotateAngle(cube_r126, 0.096F, 0.0F, 0.0F);
        this.cube_r126.cubeList.add(new ModelBox(cube_r126, 131, 133, -0.5F, -0.3118F, -1.5957F, 1, 2, 2, -0.21F, true));

        this.cube_r127 = new AdvancedModelRenderer(this);
        this.cube_r127.setRotationPoint(0.0792F, -3.6276F, -0.2191F);
        this.rightPlate28.addChild(cube_r127);
        this.setRotateAngle(cube_r127, -1.0297F, 0.0F, 0.0F);
        this.cube_r127.cubeList.add(new ModelBox(cube_r127, 106, 9, -0.5F, -0.9F, -1.0F, 1, 2, 3, -0.25F, true));

        this.cube_r128 = new AdvancedModelRenderer(this);
        this.cube_r128.setRotationPoint(0.0792F, -5.1726F, -0.1404F);
        this.rightPlate28.addChild(cube_r128);
        this.setRotateAngle(cube_r128, 0.5498F, 0.0F, 0.0F);
        this.cube_r128.cubeList.add(new ModelBox(cube_r128, 138, 101, -0.5F, -0.2238F, -0.7743F, 1, 3, 1, -0.22F, true));

        this.cube_r129 = new AdvancedModelRenderer(this);
        this.cube_r129.setRotationPoint(0.0792F, -3.7726F, -1.2404F);
        this.rightPlate28.addChild(cube_r129);
        this.setRotateAngle(cube_r129, -0.3491F, 0.0F, 0.0F);
        this.cube_r129.cubeList.add(new ModelBox(cube_r129, 111, 113, -0.5F, -1.8485F, -0.2172F, 1, 3, 1, -0.19F, true));

        this.neck4 = new AdvancedModelRenderer(this);
        this.neck4.setRotationPoint(0.0F, 7.8129F, -7.4954F);
        this.upperbody.addChild(neck4);
        this.setRotateAngle(neck4, 0.0436F, 0.0F, 0.0F);
        this.neck4.cubeList.add(new ModelBox(neck4, 67, 22, -6.0F, -0.309F, -3.3095F, 12, 9, 5, 0.0F, false));

        this.cube_r130 = new AdvancedModelRenderer(this);
        this.cube_r130.setRotationPoint(2.2644F, -2.7992F, -1.4692F);
        this.neck4.addChild(cube_r130);
        this.setRotateAngle(cube_r130, 0.4363F, 0.0F, 0.0F);
        this.cube_r130.cubeList.add(new ModelBox(cube_r130, 0, 90, -8.2644F, -0.1504F, -2.98F, 12, 8, 5, -0.01F, false));

        this.cube_r131 = new AdvancedModelRenderer(this);
        this.cube_r131.setRotationPoint(-0.5F, 0.7055F, -3.3265F);
        this.neck4.addChild(cube_r131);
        this.setRotateAngle(cube_r131, 0.192F, 0.0F, 0.0F);
        this.cube_r131.cubeList.add(new ModelBox(cube_r131, 97, 0, -3.0F, -2.3716F, -5.9577F, 7, 1, 7, -0.01F, false));

        this.cube_r132 = new AdvancedModelRenderer(this);
        this.cube_r132.setRotationPoint(-0.5F, 0.7055F, -3.3265F);
        this.neck4.addChild(cube_r132);
        this.setRotateAngle(cube_r132, 0.0873F, 0.0F, 0.0F);
        this.cube_r132.cubeList.add(new ModelBox(cube_r132, 95, 30, -3.0F, -1.7311F, -6.215F, 7, 7, 7, 0.0F, false));

        this.leftPlate3 = new AdvancedModelRenderer(this);
        this.leftPlate3.setRotationPoint(1.05F, -0.9785F, -7.7836F);
        this.neck4.addChild(leftPlate3);
        this.setRotateAngle(leftPlate3, 0.277F, 0.3798F, 0.2493F);


        this.cube_r133 = new AdvancedModelRenderer(this);
        this.cube_r133.setRotationPoint(0.1549F, -0.2992F, -0.1491F);
        this.leftPlate3.addChild(cube_r133);
        this.setRotateAngle(cube_r133, 0.3142F, 0.0F, 0.0F);
        this.cube_r133.cubeList.add(new ModelBox(cube_r133, 136, 136, -0.5F, -1.2F, -1.3F, 1, 2, 2, -0.2F, false));

        this.cube_r134 = new AdvancedModelRenderer(this);
        this.cube_r134.setRotationPoint(0.1739F, 0.1789F, -0.4084F);
        this.leftPlate3.addChild(cube_r134);
        this.setRotateAngle(cube_r134, -0.2967F, 0.0F, 0.0F);
        this.cube_r134.cubeList.add(new ModelBox(cube_r134, 137, 5, -0.519F, -1.8331F, -0.4918F, 1, 2, 2, -0.19F, false));

        this.cube_r135 = new AdvancedModelRenderer(this);
        this.cube_r135.setRotationPoint(0.1549F, -1.7794F, -0.2223F);
        this.leftPlate3.addChild(cube_r135);
        this.setRotateAngle(cube_r135, 2.0769F, 0.0F, 0.0F);
        this.cube_r135.cubeList.add(new ModelBox(cube_r135, 65, 83, -0.5F, -0.1F, -0.1F, 1, 1, 1, -0.225F, false));
        this.cube_r135.cubeList.add(new ModelBox(cube_r135, 137, 10, -0.5F, -0.9F, -1.3F, 1, 2, 2, -0.224F, false));

        this.cube_r136 = new AdvancedModelRenderer(this);
        this.cube_r136.setRotationPoint(0.1549F, -3.2056F, -0.0002F);
        this.leftPlate3.addChild(cube_r136);
        this.setRotateAngle(cube_r136, 0.5498F, 0.0F, 0.0F);
        this.cube_r136.cubeList.add(new ModelBox(cube_r136, 94, 140, -0.5F, -0.2238F, -0.7743F, 1, 3, 1, -0.22F, false));

        this.cube_r137 = new AdvancedModelRenderer(this);
        this.cube_r137.setRotationPoint(0.1549F, -1.8056F, -1.1002F);
        this.leftPlate3.addChild(cube_r137);
        this.setRotateAngle(cube_r137, -0.3491F, 0.0F, 0.0F);
        this.cube_r137.cubeList.add(new ModelBox(cube_r137, 140, 106, -0.5F, -1.8485F, -0.2172F, 1, 3, 1, -0.19F, false));

        this.rightPlate3 = new AdvancedModelRenderer(this);
        this.rightPlate3.setRotationPoint(-1.05F, -0.9785F, -7.7836F);
        this.neck4.addChild(rightPlate3);
        this.setRotateAngle(rightPlate3, 0.277F, -0.3798F, -0.2493F);


        this.cube_r138 = new AdvancedModelRenderer(this);
        this.cube_r138.setRotationPoint(-0.1549F, -0.2992F, -0.1491F);
        this.rightPlate3.addChild(cube_r138);
        this.setRotateAngle(cube_r138, 0.3142F, 0.0F, 0.0F);
        this.cube_r138.cubeList.add(new ModelBox(cube_r138, 136, 136, -0.5F, -1.2F, -1.3F, 1, 2, 2, -0.2F, true));

        this.cube_r139 = new AdvancedModelRenderer(this);
        this.cube_r139.setRotationPoint(-0.1739F, 0.1789F, -0.4084F);
        this.rightPlate3.addChild(cube_r139);
        this.setRotateAngle(cube_r139, -0.2967F, 0.0F, 0.0F);
        this.cube_r139.cubeList.add(new ModelBox(cube_r139, 137, 5, -0.481F, -1.8331F, -0.4918F, 1, 2, 2, -0.19F, true));

        this.cube_r140 = new AdvancedModelRenderer(this);
        this.cube_r140.setRotationPoint(-0.1549F, -1.7794F, -0.2223F);
        this.rightPlate3.addChild(cube_r140);
        this.setRotateAngle(cube_r140, 2.0769F, 0.0F, 0.0F);
        this.cube_r140.cubeList.add(new ModelBox(cube_r140, 65, 83, -0.5F, -0.1F, -0.1F, 1, 1, 1, -0.225F, true));
        this.cube_r140.cubeList.add(new ModelBox(cube_r140, 137, 10, -0.5F, -0.9F, -1.3F, 1, 2, 2, -0.224F, true));

        this.cube_r141 = new AdvancedModelRenderer(this);
        this.cube_r141.setRotationPoint(-0.1549F, -3.2056F, -0.0002F);
        this.rightPlate3.addChild(cube_r141);
        this.setRotateAngle(cube_r141, 0.5498F, 0.0F, 0.0F);
        this.cube_r141.cubeList.add(new ModelBox(cube_r141, 94, 140, -0.5F, -0.2238F, -0.7743F, 1, 3, 1, -0.22F, true));

        this.cube_r142 = new AdvancedModelRenderer(this);
        this.cube_r142.setRotationPoint(-0.1549F, -1.8056F, -1.1002F);
        this.rightPlate3.addChild(cube_r142);
        this.setRotateAngle(cube_r142, -0.3491F, 0.0F, 0.0F);
        this.cube_r142.cubeList.add(new ModelBox(cube_r142, 140, 106, -0.5F, -1.8485F, -0.2172F, 1, 3, 1, -0.19F, true));

        this.leftPlate25 = new AdvancedModelRenderer(this);
        this.leftPlate25.setRotationPoint(1.05F, -1.2785F, -6.4836F);
        this.neck4.addChild(leftPlate25);
        this.setRotateAngle(leftPlate25, 0.2307F, 0.3809F, 0.2412F);


        this.cube_r143 = new AdvancedModelRenderer(this);
        this.cube_r143.setRotationPoint(0.1549F, -0.2992F, -0.1491F);
        this.leftPlate25.addChild(cube_r143);
        this.setRotateAngle(cube_r143, 0.3142F, 0.0F, 0.0F);
        this.cube_r143.cubeList.add(new ModelBox(cube_r143, 25, 136, -0.5F, -1.2F, -1.3F, 1, 2, 2, -0.2F, false));

        this.cube_r144 = new AdvancedModelRenderer(this);
        this.cube_r144.setRotationPoint(0.1739F, 0.1789F, -0.4084F);
        this.leftPlate25.addChild(cube_r144);
        this.setRotateAngle(cube_r144, -0.2967F, 0.0F, 0.0F);
        this.cube_r144.cubeList.add(new ModelBox(cube_r144, 52, 136, -0.519F, -1.8331F, -0.4918F, 1, 2, 2, -0.19F, false));

        this.cube_r145 = new AdvancedModelRenderer(this);
        this.cube_r145.setRotationPoint(0.1549F, -1.7794F, -0.2223F);
        this.leftPlate25.addChild(cube_r145);
        this.setRotateAngle(cube_r145, -0.8465F, 0.0F, 0.0F);
        this.cube_r145.cubeList.add(new ModelBox(cube_r145, 136, 56, -0.5F, -1.0F, -0.8F, 1, 2, 2, -0.224F, false));

        this.cube_r146 = new AdvancedModelRenderer(this);
        this.cube_r146.setRotationPoint(0.1549F, -3.2056F, -0.0002F);
        this.leftPlate25.addChild(cube_r146);
        this.setRotateAngle(cube_r146, 0.5498F, 0.0F, 0.0F);
        this.cube_r146.cubeList.add(new ModelBox(cube_r146, 140, 23, -0.5F, -0.2238F, -0.7743F, 1, 3, 1, -0.22F, false));

        this.cube_r147 = new AdvancedModelRenderer(this);
        this.cube_r147.setRotationPoint(0.1549F, -1.8056F, -1.1002F);
        this.leftPlate25.addChild(cube_r147);
        this.setRotateAngle(cube_r147, -0.3491F, 0.0F, 0.0F);
        this.cube_r147.cubeList.add(new ModelBox(cube_r147, 140, 93, -0.5F, -1.8485F, -0.2172F, 1, 3, 1, -0.19F, false));

        this.rightPlate25 = new AdvancedModelRenderer(this);
        this.rightPlate25.setRotationPoint(-1.05F, -1.2785F, -6.4836F);
        this.neck4.addChild(rightPlate25);
        this.setRotateAngle(rightPlate25, 0.2307F, -0.3809F, -0.2412F);


        this.cube_r148 = new AdvancedModelRenderer(this);
        this.cube_r148.setRotationPoint(-0.1549F, -0.2992F, -0.1491F);
        this.rightPlate25.addChild(cube_r148);
        this.setRotateAngle(cube_r148, 0.3142F, 0.0F, 0.0F);
        this.cube_r148.cubeList.add(new ModelBox(cube_r148, 25, 136, -0.5F, -1.2F, -1.3F, 1, 2, 2, -0.2F, true));

        this.cube_r149 = new AdvancedModelRenderer(this);
        this.cube_r149.setRotationPoint(-0.1739F, 0.1789F, -0.4084F);
        this.rightPlate25.addChild(cube_r149);
        this.setRotateAngle(cube_r149, -0.2967F, 0.0F, 0.0F);
        this.cube_r149.cubeList.add(new ModelBox(cube_r149, 52, 136, -0.481F, -1.8331F, -0.4918F, 1, 2, 2, -0.19F, true));

        this.cube_r150 = new AdvancedModelRenderer(this);
        this.cube_r150.setRotationPoint(-0.1549F, -1.7794F, -0.2223F);
        this.rightPlate25.addChild(cube_r150);
        this.setRotateAngle(cube_r150, -0.8465F, 0.0F, 0.0F);
        this.cube_r150.cubeList.add(new ModelBox(cube_r150, 136, 56, -0.5F, -1.0F, -0.8F, 1, 2, 2, -0.224F, true));

        this.cube_r151 = new AdvancedModelRenderer(this);
        this.cube_r151.setRotationPoint(-0.1549F, -3.2056F, -0.0002F);
        this.rightPlate25.addChild(cube_r151);
        this.setRotateAngle(cube_r151, 0.5498F, 0.0F, 0.0F);
        this.cube_r151.cubeList.add(new ModelBox(cube_r151, 140, 23, -0.5F, -0.2238F, -0.7743F, 1, 3, 1, -0.22F, true));

        this.cube_r152 = new AdvancedModelRenderer(this);
        this.cube_r152.setRotationPoint(-0.1549F, -1.8056F, -1.1002F);
        this.rightPlate25.addChild(cube_r152);
        this.setRotateAngle(cube_r152, -0.3491F, 0.0F, 0.0F);
        this.cube_r152.cubeList.add(new ModelBox(cube_r152, 140, 93, -0.5F, -1.8485F, -0.2172F, 1, 3, 1, -0.19F, true));

        this.leftPlate4 = new AdvancedModelRenderer(this);
        this.leftPlate4.setRotationPoint(1.1F, -1.6785F, -5.3836F);
        this.neck4.addChild(leftPlate4);
        this.setRotateAngle(leftPlate4, 0.1974F, 0.4443F, 0.2922F);


        this.cube_r153 = new AdvancedModelRenderer(this);
        this.cube_r153.setRotationPoint(0.1549F, -0.2992F, -0.1491F);
        this.leftPlate4.addChild(cube_r153);
        this.setRotateAngle(cube_r153, 0.3142F, 0.0F, 0.0F);
        this.cube_r153.cubeList.add(new ModelBox(cube_r153, 135, 114, -0.5F, -1.2F, -1.3F, 1, 2, 2, -0.2F, false));

        this.cube_r154 = new AdvancedModelRenderer(this);
        this.cube_r154.setRotationPoint(0.1739F, 0.1789F, -0.4084F);
        this.leftPlate4.addChild(cube_r154);
        this.setRotateAngle(cube_r154, -0.2967F, 0.0F, 0.0F);
        this.cube_r154.cubeList.add(new ModelBox(cube_r154, 122, 135, -0.519F, -1.8331F, -0.4918F, 1, 2, 2, -0.19F, false));

        this.cube_r155 = new AdvancedModelRenderer(this);
        this.cube_r155.setRotationPoint(0.1549F, -1.7794F, -0.2223F);
        this.leftPlate4.addChild(cube_r155);
        this.setRotateAngle(cube_r155, 0.5585F, 0.0F, 0.0F);
        this.cube_r155.cubeList.add(new ModelBox(cube_r155, 13, 136, -0.5F, -0.8F, -0.9F, 1, 2, 2, -0.225F, false));

        this.cube_r156 = new AdvancedModelRenderer(this);
        this.cube_r156.setRotationPoint(0.1549F, -3.2056F, -0.0002F);
        this.leftPlate4.addChild(cube_r156);
        this.setRotateAngle(cube_r156, 0.5498F, 0.0F, 0.0F);
        this.cube_r156.cubeList.add(new ModelBox(cube_r156, 139, 34, -0.5F, -0.2238F, -0.7743F, 1, 3, 1, -0.22F, false));

        this.cube_r157 = new AdvancedModelRenderer(this);
        this.cube_r157.setRotationPoint(0.1549F, -1.8056F, -1.1002F);
        this.leftPlate4.addChild(cube_r157);
        this.setRotateAngle(cube_r157, -0.3491F, 0.0F, 0.0F);
        this.cube_r157.cubeList.add(new ModelBox(cube_r157, 110, 102, -0.5F, -1.8485F, -0.2172F, 1, 3, 1, -0.19F, false));

        this.rightPlate4 = new AdvancedModelRenderer(this);
        this.rightPlate4.setRotationPoint(-1.1F, -1.6785F, -5.3836F);
        this.neck4.addChild(rightPlate4);
        this.setRotateAngle(rightPlate4, 0.1974F, -0.4443F, -0.2922F);


        this.cube_r158 = new AdvancedModelRenderer(this);
        this.cube_r158.setRotationPoint(-0.1549F, -0.2992F, -0.1491F);
        this.rightPlate4.addChild(cube_r158);
        this.setRotateAngle(cube_r158, 0.3142F, 0.0F, 0.0F);
        this.cube_r158.cubeList.add(new ModelBox(cube_r158, 135, 114, -0.5F, -1.2F, -1.3F, 1, 2, 2, -0.2F, true));

        this.cube_r159 = new AdvancedModelRenderer(this);
        this.cube_r159.setRotationPoint(-0.1739F, 0.1789F, -0.4084F);
        this.rightPlate4.addChild(cube_r159);
        this.setRotateAngle(cube_r159, -0.2967F, 0.0F, 0.0F);
        this.cube_r159.cubeList.add(new ModelBox(cube_r159, 122, 135, -0.481F, -1.8331F, -0.4918F, 1, 2, 2, -0.19F, true));

        this.cube_r160 = new AdvancedModelRenderer(this);
        this.cube_r160.setRotationPoint(-0.1549F, -1.7794F, -0.2223F);
        this.rightPlate4.addChild(cube_r160);
        this.setRotateAngle(cube_r160, 0.5585F, 0.0F, 0.0F);
        this.cube_r160.cubeList.add(new ModelBox(cube_r160, 13, 136, -0.5F, -0.8F, -0.9F, 1, 2, 2, -0.225F, true));

        this.cube_r161 = new AdvancedModelRenderer(this);
        this.cube_r161.setRotationPoint(-0.1549F, -3.2056F, -0.0002F);
        this.rightPlate4.addChild(cube_r161);
        this.setRotateAngle(cube_r161, 0.5498F, 0.0F, 0.0F);
        this.cube_r161.cubeList.add(new ModelBox(cube_r161, 139, 34, -0.5F, -0.2238F, -0.7743F, 1, 3, 1, -0.22F, true));

        this.cube_r162 = new AdvancedModelRenderer(this);
        this.cube_r162.setRotationPoint(-0.1549F, -1.8056F, -1.1002F);
        this.rightPlate4.addChild(cube_r162);
        this.setRotateAngle(cube_r162, -0.3491F, 0.0F, 0.0F);
        this.cube_r162.cubeList.add(new ModelBox(cube_r162, 110, 102, -0.5F, -1.8485F, -0.2172F, 1, 3, 1, -0.19F, true));

        this.leftPlate26 = new AdvancedModelRenderer(this);
        this.leftPlate26.setRotationPoint(1.4F, -1.7785F, -3.9836F);
        this.neck4.addChild(leftPlate26);
        this.setRotateAngle(leftPlate26, 0.372F, 0.4443F, 0.2922F);


        this.cube_r163 = new AdvancedModelRenderer(this);
        this.cube_r163.setRotationPoint(-0.0792F, -1.1662F, -0.0893F);
        this.leftPlate26.addChild(cube_r163);
        this.setRotateAngle(cube_r163, 0.3142F, 0.0F, 0.0F);
        this.cube_r163.cubeList.add(new ModelBox(cube_r163, 115, 132, -0.5F, -1.2F, -1.3F, 1, 3, 2, -0.2F, false));

        this.cube_r164 = new AdvancedModelRenderer(this);
        this.cube_r164.setRotationPoint(-0.0602F, -0.688F, -0.3486F);
        this.leftPlate26.addChild(cube_r164);
        this.setRotateAngle(cube_r164, -0.2967F, 0.0F, 0.0F);
        this.cube_r164.cubeList.add(new ModelBox(cube_r164, 133, 24, -0.519F, -1.8331F, -0.4918F, 1, 3, 2, -0.19F, false));

        this.cube_r165 = new AdvancedModelRenderer(this);
        this.cube_r165.setRotationPoint(-0.0792F, -2.6138F, -0.257F);
        this.leftPlate26.addChild(cube_r165);
        this.setRotateAngle(cube_r165, 0.5061F, 0.0F, 0.0F);
        this.cube_r165.cubeList.add(new ModelBox(cube_r165, 134, 19, -0.5F, -0.8F, -0.8F, 1, 2, 2, -0.225F, false));

        this.cube_r166 = new AdvancedModelRenderer(this);
        this.cube_r166.setRotationPoint(-0.0792F, -4.0726F, 0.0596F);
        this.leftPlate26.addChild(cube_r166);
        this.setRotateAngle(cube_r166, 0.5498F, 0.0F, 0.0F);
        this.cube_r166.cubeList.add(new ModelBox(cube_r166, 134, 141, -0.5F, -0.2238F, -0.7743F, 1, 3, 1, -0.22F, false));

        this.cube_r167 = new AdvancedModelRenderer(this);
        this.cube_r167.setRotationPoint(-0.0792F, -2.6726F, -1.0404F);
        this.leftPlate26.addChild(cube_r167);
        this.setRotateAngle(cube_r167, -0.3491F, 0.0F, 0.0F);
        this.cube_r167.cubeList.add(new ModelBox(cube_r167, 32, 139, -0.5F, -1.8485F, -0.2172F, 1, 3, 1, -0.19F, false));

        this.rightPlate26 = new AdvancedModelRenderer(this);
        this.rightPlate26.setRotationPoint(-1.4F, -1.7785F, -3.9836F);
        this.neck4.addChild(rightPlate26);
        this.setRotateAngle(rightPlate26, 0.372F, -0.4443F, -0.2922F);


        this.cube_r168 = new AdvancedModelRenderer(this);
        this.cube_r168.setRotationPoint(0.0792F, -1.1662F, -0.0893F);
        this.rightPlate26.addChild(cube_r168);
        this.setRotateAngle(cube_r168, 0.3142F, 0.0F, 0.0F);
        this.cube_r168.cubeList.add(new ModelBox(cube_r168, 115, 132, -0.5F, -1.2F, -1.3F, 1, 3, 2, -0.2F, true));

        this.cube_r169 = new AdvancedModelRenderer(this);
        this.cube_r169.setRotationPoint(0.0602F, -0.688F, -0.3486F);
        this.rightPlate26.addChild(cube_r169);
        this.setRotateAngle(cube_r169, -0.2967F, 0.0F, 0.0F);
        this.cube_r169.cubeList.add(new ModelBox(cube_r169, 133, 24, -0.481F, -1.8331F, -0.4918F, 1, 3, 2, -0.19F, true));

        this.cube_r170 = new AdvancedModelRenderer(this);
        this.cube_r170.setRotationPoint(0.0792F, -2.6138F, -0.257F);
        this.rightPlate26.addChild(cube_r170);
        this.setRotateAngle(cube_r170, 0.5061F, 0.0F, 0.0F);
        this.cube_r170.cubeList.add(new ModelBox(cube_r170, 134, 19, -0.5F, -0.8F, -0.8F, 1, 2, 2, -0.225F, true));

        this.cube_r171 = new AdvancedModelRenderer(this);
        this.cube_r171.setRotationPoint(0.0792F, -4.0726F, 0.0596F);
        this.rightPlate26.addChild(cube_r171);
        this.setRotateAngle(cube_r171, 0.5498F, 0.0F, 0.0F);
        this.cube_r171.cubeList.add(new ModelBox(cube_r171, 134, 141, -0.5F, -0.2238F, -0.7743F, 1, 3, 1, -0.22F, true));

        this.cube_r172 = new AdvancedModelRenderer(this);
        this.cube_r172.setRotationPoint(0.0792F, -2.6726F, -1.0404F);
        this.rightPlate26.addChild(cube_r172);
        this.setRotateAngle(cube_r172, -0.3491F, 0.0F, 0.0F);
        this.cube_r172.cubeList.add(new ModelBox(cube_r172, 32, 139, -0.5F, -1.8485F, -0.2172F, 1, 3, 1, -0.19F, true));

        this.leftPlate27 = new AdvancedModelRenderer(this);
        this.leftPlate27.setRotationPoint(1.4F, -2.4785F, -2.5836F);
        this.neck4.addChild(leftPlate27);
        this.setRotateAngle(leftPlate27, 0.372F, 0.4443F, 0.2922F);


        this.cube_r173 = new AdvancedModelRenderer(this);
        this.cube_r173.setRotationPoint(-0.0792F, -1.1662F, -0.0893F);
        this.leftPlate27.addChild(cube_r173);
        this.setRotateAngle(cube_r173, 0.3142F, 0.0F, 0.0F);
        this.cube_r173.cubeList.add(new ModelBox(cube_r173, 47, 132, -0.5F, -1.2F, -1.3F, 1, 3, 2, -0.2F, false));

        this.cube_r174 = new AdvancedModelRenderer(this);
        this.cube_r174.setRotationPoint(-0.0602F, -1.788F, 1.2514F);
        this.leftPlate27.addChild(cube_r174);
        this.setRotateAngle(cube_r174, -0.1222F, 0.0F, 0.0F);
        this.cube_r174.cubeList.add(new ModelBox(cube_r174, 89, 132, -0.519F, -0.3134F, -1.7003F, 1, 3, 2, -0.19F, false));

        this.cube_r175 = new AdvancedModelRenderer(this);
        this.cube_r175.setRotationPoint(-0.0792F, -2.079F, 0.0329F);
        this.leftPlate27.addChild(cube_r175);
        this.setRotateAngle(cube_r175, 0.5411F, 0.0F, 0.0F);
        this.cube_r175.cubeList.add(new ModelBox(cube_r175, 135, 96, -0.5F, -1.4F, -0.8F, 1, 2, 2, -0.225F, false));

        this.cube_r176 = new AdvancedModelRenderer(this);
        this.cube_r176.setRotationPoint(-0.0792F, -4.0726F, 0.0596F);
        this.leftPlate27.addChild(cube_r176);
        this.setRotateAngle(cube_r176, 0.5498F, 0.0F, 0.0F);
        this.cube_r176.cubeList.add(new ModelBox(cube_r176, 139, 15, -0.5F, -0.2238F, -0.8155F, 1, 3, 1, -0.22F, false));

        this.cube_r177 = new AdvancedModelRenderer(this);
        this.cube_r177.setRotationPoint(-0.0792F, -2.6726F, -1.0404F);
        this.leftPlate27.addChild(cube_r177);
        this.setRotateAngle(cube_r177, -0.3491F, 0.0F, 0.0F);
        this.cube_r177.cubeList.add(new ModelBox(cube_r177, 108, 84, -0.5F, -1.8485F, -0.2455F, 1, 3, 1, -0.19F, false));

        this.rightPlate27 = new AdvancedModelRenderer(this);
        this.rightPlate27.setRotationPoint(-1.4F, -2.4785F, -2.5836F);
        this.neck4.addChild(rightPlate27);
        this.setRotateAngle(rightPlate27, 0.372F, -0.4443F, -0.2922F);


        this.cube_r178 = new AdvancedModelRenderer(this);
        this.cube_r178.setRotationPoint(0.0792F, -1.1662F, -0.0893F);
        this.rightPlate27.addChild(cube_r178);
        this.setRotateAngle(cube_r178, 0.3142F, 0.0F, 0.0F);
        this.cube_r178.cubeList.add(new ModelBox(cube_r178, 47, 132, -0.5F, -1.2F, -1.3F, 1, 3, 2, -0.2F, true));

        this.cube_r179 = new AdvancedModelRenderer(this);
        this.cube_r179.setRotationPoint(0.0602F, -1.788F, 1.2514F);
        this.rightPlate27.addChild(cube_r179);
        this.setRotateAngle(cube_r179, -0.1222F, 0.0F, 0.0F);
        this.cube_r179.cubeList.add(new ModelBox(cube_r179, 89, 132, -0.481F, -0.3134F, -1.7003F, 1, 3, 2, -0.19F, true));

        this.cube_r180 = new AdvancedModelRenderer(this);
        this.cube_r180.setRotationPoint(0.0792F, -2.079F, 0.0329F);
        this.rightPlate27.addChild(cube_r180);
        this.setRotateAngle(cube_r180, 0.5411F, 0.0F, 0.0F);
        this.cube_r180.cubeList.add(new ModelBox(cube_r180, 135, 96, -0.5F, -1.4F, -0.8F, 1, 2, 2, -0.225F, true));

        this.cube_r181 = new AdvancedModelRenderer(this);
        this.cube_r181.setRotationPoint(0.0792F, -4.0726F, 0.0596F);
        this.rightPlate27.addChild(cube_r181);
        this.setRotateAngle(cube_r181, 0.5498F, 0.0F, 0.0F);
        this.cube_r181.cubeList.add(new ModelBox(cube_r181, 139, 15, -0.5F, -0.2238F, -0.8155F, 1, 3, 1, -0.22F, true));

        this.cube_r182 = new AdvancedModelRenderer(this);
        this.cube_r182.setRotationPoint(0.0792F, -2.6726F, -1.0404F);
        this.rightPlate27.addChild(cube_r182);
        this.setRotateAngle(cube_r182, -0.3491F, 0.0F, 0.0F);
        this.cube_r182.cubeList.add(new ModelBox(cube_r182, 108, 84, -0.5F, -1.8485F, -0.2455F, 1, 3, 1, -0.19F, true));

        this.leftPlate5 = new AdvancedModelRenderer(this);
        this.leftPlate5.setRotationPoint(1.7F, -3.6785F, -1.0836F);
        this.neck4.addChild(leftPlate5);
        this.setRotateAngle(leftPlate5, 0.372F, 0.4443F, 0.2922F);


        this.cube_r183 = new AdvancedModelRenderer(this);
        this.cube_r183.setRotationPoint(-0.0792F, -1.6662F, -1.1893F);
        this.leftPlate5.addChild(cube_r183);
        this.setRotateAngle(cube_r183, 0.1745F, 0.0F, 0.0F);
        this.cube_r183.cubeList.add(new ModelBox(cube_r183, 131, 90, -0.5F, -0.3846F, -0.4083F, 1, 3, 2, -0.2F, false));

        this.cube_r184 = new AdvancedModelRenderer(this);
        this.cube_r184.setRotationPoint(-0.0602F, -1.788F, 1.2514F);
        this.leftPlate5.addChild(cube_r184);
        this.setRotateAngle(cube_r184, -0.1222F, 0.0F, 0.0F);
        this.cube_r184.cubeList.add(new ModelBox(cube_r184, 20, 132, -0.519F, -0.3134F, -1.7003F, 1, 3, 2, -0.19F, false));

        this.cube_r185 = new AdvancedModelRenderer(this);
        this.cube_r185.setRotationPoint(-0.0792F, -2.141F, -0.0943F);
        this.leftPlate5.addChild(cube_r185);
        this.setRotateAngle(cube_r185, 0.5498F, 0.0F, 0.0F);
        this.cube_r185.cubeList.add(new ModelBox(cube_r185, 60, 83, -0.5F, -1.4F, 0.0F, 1, 1, 1, -0.227F, false));
        this.cube_r185.cubeList.add(new ModelBox(cube_r185, 96, 135, -0.5F, -1.1F, -0.8F, 1, 2, 2, -0.225F, false));

        this.cube_r186 = new AdvancedModelRenderer(this);
        this.cube_r186.setRotationPoint(-0.0792F, -4.0726F, 0.0596F);
        this.leftPlate5.addChild(cube_r186);
        this.setRotateAngle(cube_r186, 0.5498F, 0.0F, 0.0F);
        this.cube_r186.cubeList.add(new ModelBox(cube_r186, 114, 138, -0.5F, -0.2238F, -0.7743F, 1, 3, 1, -0.22F, false));

        this.cube_r187 = new AdvancedModelRenderer(this);
        this.cube_r187.setRotationPoint(-0.0792F, -2.6726F, -1.0404F);
        this.leftPlate5.addChild(cube_r187);
        this.setRotateAngle(cube_r187, -0.3491F, 0.0F, 0.0F);
        this.cube_r187.cubeList.add(new ModelBox(cube_r187, 129, 138, -0.5F, -1.8485F, -0.2172F, 1, 3, 1, -0.19F, false));

        this.rightPlate5 = new AdvancedModelRenderer(this);
        this.rightPlate5.setRotationPoint(-1.7F, -3.6785F, -1.0836F);
        this.neck4.addChild(rightPlate5);
        this.setRotateAngle(rightPlate5, 0.372F, -0.4443F, -0.2922F);


        this.cube_r188 = new AdvancedModelRenderer(this);
        this.cube_r188.setRotationPoint(0.0792F, -1.6662F, -1.1893F);
        this.rightPlate5.addChild(cube_r188);
        this.setRotateAngle(cube_r188, 0.1745F, 0.0F, 0.0F);
        this.cube_r188.cubeList.add(new ModelBox(cube_r188, 131, 90, -0.5F, -0.3846F, -0.4083F, 1, 3, 2, -0.2F, true));

        this.cube_r189 = new AdvancedModelRenderer(this);
        this.cube_r189.setRotationPoint(0.0602F, -1.788F, 1.2514F);
        this.rightPlate5.addChild(cube_r189);
        this.setRotateAngle(cube_r189, -0.1222F, 0.0F, 0.0F);
        this.cube_r189.cubeList.add(new ModelBox(cube_r189, 20, 132, -0.481F, -0.3134F, -1.7003F, 1, 3, 2, -0.19F, true));

        this.cube_r190 = new AdvancedModelRenderer(this);
        this.cube_r190.setRotationPoint(0.0792F, -2.141F, -0.0943F);
        this.rightPlate5.addChild(cube_r190);
        this.setRotateAngle(cube_r190, 0.5498F, 0.0F, 0.0F);
        this.cube_r190.cubeList.add(new ModelBox(cube_r190, 60, 83, -0.5F, -1.4F, 0.0F, 1, 1, 1, -0.227F, true));
        this.cube_r190.cubeList.add(new ModelBox(cube_r190, 96, 135, -0.5F, -1.1F, -0.8F, 1, 2, 2, -0.225F, true));

        this.cube_r191 = new AdvancedModelRenderer(this);
        this.cube_r191.setRotationPoint(0.0792F, -4.0726F, 0.0596F);
        this.rightPlate5.addChild(cube_r191);
        this.setRotateAngle(cube_r191, 0.5498F, 0.0F, 0.0F);
        this.cube_r191.cubeList.add(new ModelBox(cube_r191, 114, 138, -0.5F, -0.2238F, -0.7743F, 1, 3, 1, -0.22F, true));

        this.cube_r192 = new AdvancedModelRenderer(this);
        this.cube_r192.setRotationPoint(0.0792F, -2.6726F, -1.0404F);
        this.rightPlate5.addChild(cube_r192);
        this.setRotateAngle(cube_r192, -0.3491F, 0.0F, 0.0F);
        this.cube_r192.cubeList.add(new ModelBox(cube_r192, 129, 138, -0.5F, -1.8485F, -0.2172F, 1, 3, 1, -0.19F, true));

        this.neck3 = new AdvancedModelRenderer(this);
        this.neck3.setRotationPoint(0.0F, 1.65F, -9.3F);
        this.neck4.addChild(neck3);
        this.setRotateAngle(neck3, -0.1745F, 0.0F, 0.0F);
        this.neck3.cubeList.add(new ModelBox(neck3, 102, 15, -2.5F, -2.0271F, -5.6762F, 5, 6, 7, 0.0F, false));

        this.leftPlate18 = new AdvancedModelRenderer(this);
        this.leftPlate18.setRotationPoint(0.85F, -2.0785F, -4.7836F);
        this.neck3.addChild(leftPlate18);
        this.setRotateAngle(leftPlate18, 0.1142F, 0.2941F, 0.2322F);


        this.cube_r193 = new AdvancedModelRenderer(this);
        this.cube_r193.setRotationPoint(-0.019F, -0.204F, 0.4172F);
        this.leftPlate18.addChild(cube_r193);
        this.setRotateAngle(cube_r193, 0.3142F, 0.0F, 0.0F);
        this.cube_r193.cubeList.add(new ModelBox(cube_r193, 133, 104, -0.5F, -1.2F, -1.3F, 1, 2, 2, -0.2F, false));

        this.cube_r194 = new AdvancedModelRenderer(this);
        this.cube_r194.setRotationPoint(0.0F, 0.2742F, 0.1579F);
        this.leftPlate18.addChild(cube_r194);
        this.setRotateAngle(cube_r194, -0.2967F, 0.0F, 0.0F);
        this.cube_r194.cubeList.add(new ModelBox(cube_r194, 133, 109, -0.519F, -1.5331F, -0.8918F, 1, 2, 2, -0.19F, false));

        this.cube_r195 = new AdvancedModelRenderer(this);
        this.cube_r195.setRotationPoint(-0.019F, -3.1104F, 0.5661F);
        this.leftPlate18.addChild(cube_r195);
        this.setRotateAngle(cube_r195, 0.3316F, 0.0F, 0.0F);
        this.cube_r195.cubeList.add(new ModelBox(cube_r195, 142, 52, -0.5F, 0.4762F, -1.1743F, 1, 2, 1, -0.21F, false));
        this.cube_r195.cubeList.add(new ModelBox(cube_r195, 140, 119, -0.5F, -0.2238F, -0.7743F, 1, 3, 1, -0.22F, false));
        this.cube_r195.cubeList.add(new ModelBox(cube_r195, 47, 37, -0.5F, 0.9762F, -1.6743F, 1, 1, 1, -0.22F, false));

        this.cube_r196 = new AdvancedModelRenderer(this);
        this.cube_r196.setRotationPoint(-0.019F, -1.7104F, -0.5339F);
        this.leftPlate18.addChild(cube_r196);
        this.setRotateAngle(cube_r196, -0.3491F, 0.0F, 0.0F);
        this.cube_r196.cubeList.add(new ModelBox(cube_r196, 0, 90, -0.5F, -1.8485F, -0.2172F, 1, 3, 1, -0.186F, false));

        this.rightPlate18 = new AdvancedModelRenderer(this);
        this.rightPlate18.setRotationPoint(-0.85F, -2.0785F, -4.7836F);
        this.neck3.addChild(rightPlate18);
        this.setRotateAngle(rightPlate18, 0.1142F, -0.2941F, -0.2322F);


        this.cube_r197 = new AdvancedModelRenderer(this);
        this.cube_r197.setRotationPoint(0.019F, -0.204F, 0.4172F);
        this.rightPlate18.addChild(cube_r197);
        this.setRotateAngle(cube_r197, 0.3142F, 0.0F, 0.0F);
        this.cube_r197.cubeList.add(new ModelBox(cube_r197, 133, 104, -0.5F, -1.2F, -1.3F, 1, 2, 2, -0.2F, true));

        this.cube_r198 = new AdvancedModelRenderer(this);
        this.cube_r198.setRotationPoint(0.0F, 0.2742F, 0.1579F);
        this.rightPlate18.addChild(cube_r198);
        this.setRotateAngle(cube_r198, -0.2967F, 0.0F, 0.0F);
        this.cube_r198.cubeList.add(new ModelBox(cube_r198, 133, 109, -0.481F, -1.5331F, -0.8918F, 1, 2, 2, -0.19F, true));

        this.cube_r199 = new AdvancedModelRenderer(this);
        this.cube_r199.setRotationPoint(0.019F, -3.1104F, 0.5661F);
        this.rightPlate18.addChild(cube_r199);
        this.setRotateAngle(cube_r199, 0.3316F, 0.0F, 0.0F);
        this.cube_r199.cubeList.add(new ModelBox(cube_r199, 142, 52, -0.5F, 0.4762F, -1.1743F, 1, 2, 1, -0.21F, true));
        this.cube_r199.cubeList.add(new ModelBox(cube_r199, 140, 119, -0.5F, -0.2238F, -0.7743F, 1, 3, 1, -0.22F, true));
        this.cube_r199.cubeList.add(new ModelBox(cube_r199, 47, 37, -0.5F, 0.9762F, -1.6743F, 1, 1, 1, -0.22F, true));

        this.cube_r200 = new AdvancedModelRenderer(this);
        this.cube_r200.setRotationPoint(0.019F, -1.7104F, -0.5339F);
        this.rightPlate18.addChild(cube_r200);
        this.setRotateAngle(cube_r200, -0.3491F, 0.0F, 0.0F);
        this.cube_r200.cubeList.add(new ModelBox(cube_r200, 0, 90, -0.5F, -1.8485F, -0.2172F, 1, 3, 1, -0.186F, true));

        this.leftPlate2 = new AdvancedModelRenderer(this);
        this.leftPlate2.setRotationPoint(0.85F, -2.1785F, -3.0836F);
        this.neck3.addChild(leftPlate2);
        this.setRotateAngle(leftPlate2, 0.1142F, 0.2941F, 0.2322F);


        this.cube_r201 = new AdvancedModelRenderer(this);
        this.cube_r201.setRotationPoint(-0.019F, -0.204F, 0.4172F);
        this.leftPlate2.addChild(cube_r201);
        this.setRotateAngle(cube_r201, 0.3142F, 0.0F, 0.0F);
        this.cube_r201.cubeList.add(new ModelBox(cube_r201, 137, 39, -0.5F, -1.2F, -1.3F, 1, 2, 2, -0.2F, false));

        this.cube_r202 = new AdvancedModelRenderer(this);
        this.cube_r202.setRotationPoint(0.0F, 0.2742F, 0.1579F);
        this.leftPlate2.addChild(cube_r202);
        this.setRotateAngle(cube_r202, -0.2967F, 0.0F, 0.0F);
        this.cube_r202.cubeList.add(new ModelBox(cube_r202, 103, 137, -0.519F, -1.5331F, -0.8918F, 1, 2, 2, -0.19F, false));

        this.cube_r203 = new AdvancedModelRenderer(this);
        this.cube_r203.setRotationPoint(-0.019F, -3.1104F, 0.5661F);
        this.leftPlate2.addChild(cube_r203);
        this.setRotateAngle(cube_r203, 0.3316F, 0.0F, 0.0F);
        this.cube_r203.cubeList.add(new ModelBox(cube_r203, 17, 143, -0.5F, 0.4762F, -1.1743F, 1, 2, 1, -0.21F, false));
        this.cube_r203.cubeList.add(new ModelBox(cube_r203, 140, 111, -0.5F, -0.2238F, -0.7743F, 1, 3, 1, -0.22F, false));
        this.cube_r203.cubeList.add(new ModelBox(cube_r203, 63, 105, -0.5F, 0.9762F, -1.6743F, 1, 1, 1, -0.22F, false));

        this.cube_r204 = new AdvancedModelRenderer(this);
        this.cube_r204.setRotationPoint(-0.019F, -1.7104F, -0.5339F);
        this.leftPlate2.addChild(cube_r204);
        this.setRotateAngle(cube_r204, -0.3491F, 0.0F, 0.0F);
        this.cube_r204.cubeList.add(new ModelBox(cube_r204, 119, 140, -0.5F, -1.8485F, -0.2172F, 1, 3, 1, -0.186F, false));

        this.rightPlate2 = new AdvancedModelRenderer(this);
        this.rightPlate2.setRotationPoint(-0.85F, -2.1785F, -3.0836F);
        this.neck3.addChild(rightPlate2);
        this.setRotateAngle(rightPlate2, 0.1142F, -0.2941F, -0.2322F);


        this.cube_r205 = new AdvancedModelRenderer(this);
        this.cube_r205.setRotationPoint(0.019F, -0.204F, 0.4172F);
        this.rightPlate2.addChild(cube_r205);
        this.setRotateAngle(cube_r205, 0.3142F, 0.0F, 0.0F);
        this.cube_r205.cubeList.add(new ModelBox(cube_r205, 137, 39, -0.5F, -1.2F, -1.3F, 1, 2, 2, -0.2F, true));

        this.cube_r206 = new AdvancedModelRenderer(this);
        this.cube_r206.setRotationPoint(0.0F, 0.2742F, 0.1579F);
        this.rightPlate2.addChild(cube_r206);
        this.setRotateAngle(cube_r206, -0.2967F, 0.0F, 0.0F);
        this.cube_r206.cubeList.add(new ModelBox(cube_r206, 103, 137, -0.481F, -1.5331F, -0.8918F, 1, 2, 2, -0.19F, true));

        this.cube_r207 = new AdvancedModelRenderer(this);
        this.cube_r207.setRotationPoint(0.019F, -3.1104F, 0.5661F);
        this.rightPlate2.addChild(cube_r207);
        this.setRotateAngle(cube_r207, 0.3316F, 0.0F, 0.0F);
        this.cube_r207.cubeList.add(new ModelBox(cube_r207, 17, 143, -0.5F, 0.4762F, -1.1743F, 1, 2, 1, -0.21F, true));
        this.cube_r207.cubeList.add(new ModelBox(cube_r207, 140, 111, -0.5F, -0.2238F, -0.7743F, 1, 3, 1, -0.22F, true));
        this.cube_r207.cubeList.add(new ModelBox(cube_r207, 63, 105, -0.5F, 0.9762F, -1.6743F, 1, 1, 1, -0.22F, true));

        this.cube_r208 = new AdvancedModelRenderer(this);
        this.cube_r208.setRotationPoint(0.019F, -1.7104F, -0.5339F);
        this.rightPlate2.addChild(cube_r208);
        this.setRotateAngle(cube_r208, -0.3491F, 0.0F, 0.0F);
        this.cube_r208.cubeList.add(new ModelBox(cube_r208, 119, 140, -0.5F, -1.8485F, -0.2172F, 1, 3, 1, -0.186F, true));

        this.leftPlate24 = new AdvancedModelRenderer(this);
        this.leftPlate24.setRotationPoint(0.85F, -2.1785F, -1.1836F);
        this.neck3.addChild(leftPlate24);
        this.setRotateAngle(leftPlate24, 0.0532F, 0.2941F, 0.2322F);


        this.cube_r209 = new AdvancedModelRenderer(this);
        this.cube_r209.setRotationPoint(0.1549F, -0.2992F, -0.1491F);
        this.leftPlate24.addChild(cube_r209);
        this.setRotateAngle(cube_r209, 0.3142F, 0.0F, 0.0F);
        this.cube_r209.cubeList.add(new ModelBox(cube_r209, 108, 134, -0.5F, -1.2F, -1.3F, 1, 2, 2, -0.2F, false));

        this.cube_r210 = new AdvancedModelRenderer(this);
        this.cube_r210.setRotationPoint(0.1739F, 0.1789F, -0.4084F);
        this.leftPlate24.addChild(cube_r210);
        this.setRotateAngle(cube_r210, -0.2967F, 0.0F, 0.0F);
        this.cube_r210.cubeList.add(new ModelBox(cube_r210, 135, 0, -0.519F, -1.8331F, -0.4918F, 1, 2, 2, -0.19F, false));

        this.cube_r211 = new AdvancedModelRenderer(this);
        this.cube_r211.setRotationPoint(0.1549F, -3.2056F, -0.0002F);
        this.leftPlate24.addChild(cube_r211);
        this.setRotateAngle(cube_r211, 0.5498F, 0.0F, 0.0F);
        this.cube_r211.cubeList.add(new ModelBox(cube_r211, 7, 138, -0.5F, -0.2238F, -0.7743F, 1, 3, 1, -0.2F, false));

        this.cube_r212 = new AdvancedModelRenderer(this);
        this.cube_r212.setRotationPoint(0.1549F, -1.8056F, -1.1002F);
        this.leftPlate24.addChild(cube_r212);
        this.setRotateAngle(cube_r212, -0.3491F, 0.0F, 0.0F);
        this.cube_r212.cubeList.add(new ModelBox(cube_r212, 20, 138, -0.5F, -1.8485F, -0.2172F, 1, 3, 1, -0.19F, false));

        this.cube_r213 = new AdvancedModelRenderer(this);
        this.cube_r213.setRotationPoint(0.1549F, -1.6228F, -0.0626F);
        this.leftPlate24.addChild(cube_r213);
        this.setRotateAngle(cube_r213, -0.7592F, 0.0F, 0.0F);
        this.cube_r213.cubeList.add(new ModelBox(cube_r213, 135, 46, -0.5F, -0.9F, -1.0F, 1, 2, 2, -0.21F, false));

        this.rightPlate24 = new AdvancedModelRenderer(this);
        this.rightPlate24.setRotationPoint(-0.85F, -2.1785F, -1.1836F);
        this.neck3.addChild(rightPlate24);
        this.setRotateAngle(rightPlate24, 0.0532F, -0.2941F, -0.2322F);


        this.cube_r214 = new AdvancedModelRenderer(this);
        this.cube_r214.setRotationPoint(-0.1549F, -0.2992F, -0.1491F);
        this.rightPlate24.addChild(cube_r214);
        this.setRotateAngle(cube_r214, 0.3142F, 0.0F, 0.0F);
        this.cube_r214.cubeList.add(new ModelBox(cube_r214, 108, 134, -0.5F, -1.2F, -1.3F, 1, 2, 2, -0.2F, true));

        this.cube_r215 = new AdvancedModelRenderer(this);
        this.cube_r215.setRotationPoint(-0.1739F, 0.1789F, -0.4084F);
        this.rightPlate24.addChild(cube_r215);
        this.setRotateAngle(cube_r215, -0.2967F, 0.0F, 0.0F);
        this.cube_r215.cubeList.add(new ModelBox(cube_r215, 135, 0, -0.481F, -1.8331F, -0.4918F, 1, 2, 2, -0.19F, true));

        this.cube_r216 = new AdvancedModelRenderer(this);
        this.cube_r216.setRotationPoint(-0.1549F, -3.2056F, -0.0002F);
        this.rightPlate24.addChild(cube_r216);
        this.setRotateAngle(cube_r216, 0.5498F, 0.0F, 0.0F);
        this.cube_r216.cubeList.add(new ModelBox(cube_r216, 7, 138, -0.5F, -0.2238F, -0.7743F, 1, 3, 1, -0.2F, true));

        this.cube_r217 = new AdvancedModelRenderer(this);
        this.cube_r217.setRotationPoint(-0.1549F, -1.8056F, -1.1002F);
        this.rightPlate24.addChild(cube_r217);
        this.setRotateAngle(cube_r217, -0.3491F, 0.0F, 0.0F);
        this.cube_r217.cubeList.add(new ModelBox(cube_r217, 20, 138, -0.5F, -1.8485F, -0.2172F, 1, 3, 1, -0.19F, true));

        this.cube_r218 = new AdvancedModelRenderer(this);
        this.cube_r218.setRotationPoint(-0.1549F, -1.6228F, -0.0626F);
        this.rightPlate24.addChild(cube_r218);
        this.setRotateAngle(cube_r218, -0.7592F, 0.0F, 0.0F);
        this.cube_r218.cubeList.add(new ModelBox(cube_r218, 135, 46, -0.5F, -0.9F, -1.0F, 1, 2, 2, -0.21F, true));

        this.neck2 = new AdvancedModelRenderer(this);
        this.neck2.setRotationPoint(-0.5F, 0.4729F, -4.6762F);
        this.neck3.addChild(neck2);
        this.setRotateAngle(neck2, -0.192F, 0.0F, 0.0F);


        this.cube_r219 = new AdvancedModelRenderer(this);
        this.cube_r219.setRotationPoint(0.0F, -1.55F, -9.25F);
        this.neck2.addChild(cube_r219);
        this.setRotateAngle(cube_r219, 0.0873F, 0.0F, 0.0F);
        this.cube_r219.cubeList.add(new ModelBox(cube_r219, 91, 68, -1.5F, -0.05F, -0.95F, 4, 5, 10, 0.0F, false));

        this.leftPlate23 = new AdvancedModelRenderer(this);
        this.leftPlate23.setRotationPoint(1.35F, -2.4514F, -2.8074F);
        this.neck2.addChild(leftPlate23);
        this.setRotateAngle(leftPlate23, 0.0793F, 0.2941F, 0.2322F);


        this.cube_r220 = new AdvancedModelRenderer(this);
        this.cube_r220.setRotationPoint(-0.019F, -0.204F, 0.4172F);
        this.leftPlate23.addChild(cube_r220);
        this.setRotateAngle(cube_r220, 0.3142F, 0.0F, 0.0F);
        this.cube_r220.cubeList.add(new ModelBox(cube_r220, 138, 71, -0.5F, -1.2F, -1.3F, 1, 2, 2, -0.2F, false));

        this.cube_r221 = new AdvancedModelRenderer(this);
        this.cube_r221.setRotationPoint(0.0F, 0.2742F, 0.1579F);
        this.leftPlate23.addChild(cube_r221);
        this.setRotateAngle(cube_r221, -0.2967F, 0.0F, 0.0F);
        this.cube_r221.cubeList.add(new ModelBox(cube_r221, 135, 51, -0.519F, -1.5331F, -0.8918F, 1, 2, 2, -0.19F, false));

        this.cube_r222 = new AdvancedModelRenderer(this);
        this.cube_r222.setRotationPoint(-0.019F, -3.1104F, 0.5661F);
        this.leftPlate23.addChild(cube_r222);
        this.setRotateAngle(cube_r222, 0.3316F, 0.0F, 0.0F);
        this.cube_r222.cubeList.add(new ModelBox(cube_r222, 41, 143, -0.5F, 0.4762F, -1.1743F, 1, 2, 1, -0.21F, false));
        this.cube_r222.cubeList.add(new ModelBox(cube_r222, 141, 81, -0.5F, -0.2238F, -0.7743F, 1, 3, 1, -0.22F, false));
        this.cube_r222.cubeList.add(new ModelBox(cube_r222, 143, 32, -0.5F, 0.9762F, -1.6743F, 1, 1, 1, -0.22F, false));

        this.cube_r223 = new AdvancedModelRenderer(this);
        this.cube_r223.setRotationPoint(-0.019F, -1.7104F, -0.5339F);
        this.leftPlate23.addChild(cube_r223);
        this.setRotateAngle(cube_r223, -0.3491F, 0.0F, 0.0F);
        this.cube_r223.cubeList.add(new ModelBox(cube_r223, 99, 141, -0.5F, -1.8485F, -0.2172F, 1, 3, 1, -0.19F, false));

        this.rightPlate23 = new AdvancedModelRenderer(this);
        this.rightPlate23.setRotationPoint(-0.35F, -2.4514F, -2.8074F);
        this.neck2.addChild(rightPlate23);
        this.setRotateAngle(rightPlate23, 0.0793F, -0.2941F, -0.2322F);


        this.cube_r224 = new AdvancedModelRenderer(this);
        this.cube_r224.setRotationPoint(0.019F, -0.204F, 0.4172F);
        this.rightPlate23.addChild(cube_r224);
        this.setRotateAngle(cube_r224, 0.3142F, 0.0F, 0.0F);
        this.cube_r224.cubeList.add(new ModelBox(cube_r224, 138, 71, -0.5F, -1.2F, -1.3F, 1, 2, 2, -0.2F, true));

        this.cube_r225 = new AdvancedModelRenderer(this);
        this.cube_r225.setRotationPoint(0.0F, 0.2742F, 0.1579F);
        this.rightPlate23.addChild(cube_r225);
        this.setRotateAngle(cube_r225, -0.2967F, 0.0F, 0.0F);
        this.cube_r225.cubeList.add(new ModelBox(cube_r225, 135, 51, -0.481F, -1.5331F, -0.8918F, 1, 2, 2, -0.19F, true));

        this.cube_r226 = new AdvancedModelRenderer(this);
        this.cube_r226.setRotationPoint(0.019F, -3.1104F, 0.5661F);
        this.rightPlate23.addChild(cube_r226);
        this.setRotateAngle(cube_r226, 0.3316F, 0.0F, 0.0F);
        this.cube_r226.cubeList.add(new ModelBox(cube_r226, 41, 143, -0.5F, 0.4762F, -1.1743F, 1, 2, 1, -0.21F, true));
        this.cube_r226.cubeList.add(new ModelBox(cube_r226, 141, 81, -0.5F, -0.2238F, -0.7743F, 1, 3, 1, -0.22F, true));
        this.cube_r226.cubeList.add(new ModelBox(cube_r226, 143, 32, -0.5F, 0.9762F, -1.6743F, 1, 1, 1, -0.22F, true));

        this.cube_r227 = new AdvancedModelRenderer(this);
        this.cube_r227.setRotationPoint(0.019F, -1.7104F, -0.5339F);
        this.rightPlate23.addChild(cube_r227);
        this.setRotateAngle(cube_r227, -0.3491F, 0.0F, 0.0F);
        this.cube_r227.cubeList.add(new ModelBox(cube_r227, 99, 141, -0.5F, -1.8485F, -0.2172F, 1, 3, 1, -0.19F, true));

        this.leftPlate22 = new AdvancedModelRenderer(this);
        this.leftPlate22.setRotationPoint(1.35F, -2.0514F, -4.8074F);
        this.neck2.addChild(leftPlate22);
        this.setRotateAngle(leftPlate22, 0.0793F, 0.2941F, 0.2322F);


        this.cube_r228 = new AdvancedModelRenderer(this);
        this.cube_r228.setRotationPoint(-0.019F, -0.204F, 0.4172F);
        this.leftPlate22.addChild(cube_r228);
        this.setRotateAngle(cube_r228, 0.3142F, 0.0F, 0.0F);
        this.cube_r228.cubeList.add(new ModelBox(cube_r228, 66, 138, -0.5F, -1.2F, -1.3F, 1, 2, 2, -0.2F, false));

        this.cube_r229 = new AdvancedModelRenderer(this);
        this.cube_r229.setRotationPoint(0.0F, 0.2742F, 0.1579F);
        this.leftPlate22.addChild(cube_r229);
        this.setRotateAngle(cube_r229, -0.2967F, 0.0F, 0.0F);
        this.cube_r229.cubeList.add(new ModelBox(cube_r229, 138, 66, -0.519F, -1.5331F, -0.8918F, 1, 2, 2, -0.19F, false));

        this.cube_r230 = new AdvancedModelRenderer(this);
        this.cube_r230.setRotationPoint(-0.019F, -3.1104F, 0.5661F);
        this.leftPlate22.addChild(cube_r230);
        this.setRotateAngle(cube_r230, 0.3316F, 0.0F, 0.0F);
        this.cube_r230.cubeList.add(new ModelBox(cube_r230, 5, 143, -0.5F, 0.4762F, -1.1743F, 1, 2, 1, -0.21F, false));
        this.cube_r230.cubeList.add(new ModelBox(cube_r230, 51, 141, -0.5F, -0.2238F, -0.7743F, 1, 3, 1, -0.22F, false));
        this.cube_r230.cubeList.add(new ModelBox(cube_r230, 143, 9, -0.5F, 0.9762F, -1.6743F, 1, 1, 1, -0.22F, false));

        this.cube_r231 = new AdvancedModelRenderer(this);
        this.cube_r231.setRotationPoint(-0.019F, -1.7104F, -0.5339F);
        this.leftPlate22.addChild(cube_r231);
        this.setRotateAngle(cube_r231, -0.3491F, 0.0F, 0.0F);
        this.cube_r231.cubeList.add(new ModelBox(cube_r231, 141, 76, -0.5F, -1.8485F, -0.2172F, 1, 3, 1, -0.186F, false));

        this.rightPlate22 = new AdvancedModelRenderer(this);
        this.rightPlate22.setRotationPoint(-0.35F, -2.0514F, -4.8074F);
        this.neck2.addChild(rightPlate22);
        this.setRotateAngle(rightPlate22, 0.0793F, -0.2941F, -0.2322F);


        this.cube_r232 = new AdvancedModelRenderer(this);
        this.cube_r232.setRotationPoint(0.019F, -0.204F, 0.4172F);
        this.rightPlate22.addChild(cube_r232);
        this.setRotateAngle(cube_r232, 0.3142F, 0.0F, 0.0F);
        this.cube_r232.cubeList.add(new ModelBox(cube_r232, 66, 138, -0.5F, -1.2F, -1.3F, 1, 2, 2, -0.2F, true));

        this.cube_r233 = new AdvancedModelRenderer(this);
        this.cube_r233.setRotationPoint(0.0F, 0.2742F, 0.1579F);
        this.rightPlate22.addChild(cube_r233);
        this.setRotateAngle(cube_r233, -0.2967F, 0.0F, 0.0F);
        this.cube_r233.cubeList.add(new ModelBox(cube_r233, 138, 66, -0.481F, -1.5331F, -0.8918F, 1, 2, 2, -0.19F, true));

        this.cube_r234 = new AdvancedModelRenderer(this);
        this.cube_r234.setRotationPoint(0.019F, -3.1104F, 0.5661F);
        this.rightPlate22.addChild(cube_r234);
        this.setRotateAngle(cube_r234, 0.3316F, 0.0F, 0.0F);
        this.cube_r234.cubeList.add(new ModelBox(cube_r234, 5, 143, -0.5F, 0.4762F, -1.1743F, 1, 2, 1, -0.21F, true));
        this.cube_r234.cubeList.add(new ModelBox(cube_r234, 51, 141, -0.5F, -0.2238F, -0.7743F, 1, 3, 1, -0.22F, true));
        this.cube_r234.cubeList.add(new ModelBox(cube_r234, 143, 9, -0.5F, 0.9762F, -1.6743F, 1, 1, 1, -0.22F, true));

        this.cube_r235 = new AdvancedModelRenderer(this);
        this.cube_r235.setRotationPoint(0.019F, -1.7104F, -0.5339F);
        this.rightPlate22.addChild(cube_r235);
        this.setRotateAngle(cube_r235, -0.3491F, 0.0F, 0.0F);
        this.cube_r235.cubeList.add(new ModelBox(cube_r235, 141, 76, -0.5F, -1.8485F, -0.2172F, 1, 3, 1, -0.186F, true));

        this.leftPlate21 = new AdvancedModelRenderer(this);
        this.leftPlate21.setRotationPoint(1.25F, -1.5514F, -6.8074F);
        this.neck2.addChild(leftPlate21);
        this.setRotateAngle(leftPlate21, 0.067F, 0.3408F, 0.1897F);


        this.cube_r236 = new AdvancedModelRenderer(this);
        this.cube_r236.setRotationPoint(-0.019F, -0.204F, 0.4172F);
        this.leftPlate21.addChild(cube_r236);
        this.setRotateAngle(cube_r236, 0.3142F, 0.0F, 0.0F);
        this.cube_r236.cubeList.add(new ModelBox(cube_r236, 59, 138, -0.5F, -1.2F, -1.3F, 1, 2, 2, -0.2F, false));

        this.cube_r237 = new AdvancedModelRenderer(this);
        this.cube_r237.setRotationPoint(0.0F, 0.2742F, 0.1579F);
        this.leftPlate21.addChild(cube_r237);
        this.setRotateAngle(cube_r237, -0.2967F, 0.0F, 0.0F);
        this.cube_r237.cubeList.add(new ModelBox(cube_r237, 138, 61, -0.519F, -1.5331F, -0.8918F, 1, 2, 2, -0.19F, false));

        this.cube_r238 = new AdvancedModelRenderer(this);
        this.cube_r238.setRotationPoint(-0.019F, -3.1104F, 0.5661F);
        this.leftPlate21.addChild(cube_r238);
        this.setRotateAngle(cube_r238, 0.3316F, 0.0F, 0.0F);
        this.cube_r238.cubeList.add(new ModelBox(cube_r238, 36, 143, -0.5F, 0.4762F, -1.1743F, 1, 2, 1, -0.21F, false));
        this.cube_r238.cubeList.add(new ModelBox(cube_r238, 12, 141, -0.5F, -0.2238F, -0.7743F, 1, 3, 1, -0.22F, false));
        this.cube_r238.cubeList.add(new ModelBox(cube_r238, 142, 116, -0.5F, 0.9762F, -1.6743F, 1, 1, 1, -0.22F, false));

        this.cube_r239 = new AdvancedModelRenderer(this);
        this.cube_r239.setRotationPoint(-0.019F, -1.7104F, -0.5339F);
        this.leftPlate21.addChild(cube_r239);
        this.setRotateAngle(cube_r239, -0.3491F, 0.0F, 0.0F);
        this.cube_r239.cubeList.add(new ModelBox(cube_r239, 25, 141, -0.5F, -1.8485F, -0.2172F, 1, 3, 1, -0.186F, false));

        this.rightPlate21 = new AdvancedModelRenderer(this);
        this.rightPlate21.setRotationPoint(-0.25F, -1.5514F, -6.8074F);
        this.neck2.addChild(rightPlate21);
        this.setRotateAngle(rightPlate21, 0.067F, -0.3408F, -0.1897F);


        this.cube_r240 = new AdvancedModelRenderer(this);
        this.cube_r240.setRotationPoint(0.019F, -0.204F, 0.4172F);
        this.rightPlate21.addChild(cube_r240);
        this.setRotateAngle(cube_r240, 0.3142F, 0.0F, 0.0F);
        this.cube_r240.cubeList.add(new ModelBox(cube_r240, 59, 138, -0.5F, -1.2F, -1.3F, 1, 2, 2, -0.2F, true));

        this.cube_r241 = new AdvancedModelRenderer(this);
        this.cube_r241.setRotationPoint(0.0F, 0.2742F, 0.1579F);
        this.rightPlate21.addChild(cube_r241);
        this.setRotateAngle(cube_r241, -0.2967F, 0.0F, 0.0F);
        this.cube_r241.cubeList.add(new ModelBox(cube_r241, 138, 61, -0.481F, -1.5331F, -0.8918F, 1, 2, 2, -0.19F, true));

        this.cube_r242 = new AdvancedModelRenderer(this);
        this.cube_r242.setRotationPoint(0.019F, -3.1104F, 0.5661F);
        this.rightPlate21.addChild(cube_r242);
        this.setRotateAngle(cube_r242, 0.3316F, 0.0F, 0.0F);
        this.cube_r242.cubeList.add(new ModelBox(cube_r242, 36, 143, -0.5F, 0.4762F, -1.1743F, 1, 2, 1, -0.21F, true));
        this.cube_r242.cubeList.add(new ModelBox(cube_r242, 12, 141, -0.5F, -0.2238F, -0.7743F, 1, 3, 1, -0.22F, true));
        this.cube_r242.cubeList.add(new ModelBox(cube_r242, 142, 116, -0.5F, 0.9762F, -1.6743F, 1, 1, 1, -0.22F, true));

        this.cube_r243 = new AdvancedModelRenderer(this);
        this.cube_r243.setRotationPoint(0.019F, -1.7104F, -0.5339F);
        this.rightPlate21.addChild(cube_r243);
        this.setRotateAngle(cube_r243, -0.3491F, 0.0F, 0.0F);
        this.cube_r243.cubeList.add(new ModelBox(cube_r243, 25, 141, -0.5F, -1.8485F, -0.2172F, 1, 3, 1, -0.186F, true));

        this.leftPlate19 = new AdvancedModelRenderer(this);
        this.leftPlate19.setRotationPoint(1.15F, -1.1514F, -8.8074F);
        this.neck2.addChild(leftPlate19);
        this.setRotateAngle(leftPlate19, 0.0646F, 0.2102F, 0.1808F);


        this.cube_r244 = new AdvancedModelRenderer(this);
        this.cube_r244.setRotationPoint(-0.019F, -0.204F, 0.4172F);
        this.leftPlate19.addChild(cube_r244);
        this.setRotateAngle(cube_r244, 0.3142F, 0.0F, 0.0F);
        this.cube_r244.cubeList.add(new ModelBox(cube_r244, 0, 138, -0.5F, -1.2F, -1.3F, 1, 2, 2, -0.21F, false));

        this.cube_r245 = new AdvancedModelRenderer(this);
        this.cube_r245.setRotationPoint(0.0F, 0.2742F, 0.1579F);
        this.leftPlate19.addChild(cube_r245);
        this.setRotateAngle(cube_r245, -0.2967F, 0.0F, 0.0F);
        this.cube_r245.cubeList.add(new ModelBox(cube_r245, 39, 138, -0.519F, -1.5331F, -0.8918F, 1, 2, 2, -0.2F, false));

        this.cube_r246 = new AdvancedModelRenderer(this);
        this.cube_r246.setRotationPoint(-0.019F, -3.1104F, 0.5661F);
        this.leftPlate19.addChild(cube_r246);
        this.setRotateAngle(cube_r246, 0.3316F, 0.0F, 0.0F);
        this.cube_r246.cubeList.add(new ModelBox(cube_r246, 143, 19, -0.5F, 0.4762F, -1.1743F, 1, 2, 1, -0.213F, false));
        this.cube_r246.cubeList.add(new ModelBox(cube_r246, 124, 140, -0.5F, -0.2238F, -0.7743F, 1, 3, 1, -0.22F, false));
        this.cube_r246.cubeList.add(new ModelBox(cube_r246, 109, 118, -0.5F, 0.9762F, -1.6743F, 1, 1, 1, -0.214F, false));

        this.cube_r247 = new AdvancedModelRenderer(this);
        this.cube_r247.setRotationPoint(-0.019F, -1.7104F, -0.5339F);
        this.leftPlate19.addChild(cube_r247);
        this.setRotateAngle(cube_r247, -0.3491F, 0.0F, 0.0F);
        this.cube_r247.cubeList.add(new ModelBox(cube_r247, 140, 124, -0.5F, -1.8485F, -0.2172F, 1, 3, 1, -0.19F, false));

        this.rightPlate19 = new AdvancedModelRenderer(this);
        this.rightPlate19.setRotationPoint(-0.15F, -1.1514F, -8.8074F);
        this.neck2.addChild(rightPlate19);
        this.setRotateAngle(rightPlate19, 0.0646F, -0.2102F, -0.1808F);


        this.cube_r248 = new AdvancedModelRenderer(this);
        this.cube_r248.setRotationPoint(0.019F, -0.204F, 0.4172F);
        this.rightPlate19.addChild(cube_r248);
        this.setRotateAngle(cube_r248, 0.3142F, 0.0F, 0.0F);
        this.cube_r248.cubeList.add(new ModelBox(cube_r248, 0, 138, -0.5F, -1.2F, -1.3F, 1, 2, 2, -0.21F, true));

        this.cube_r249 = new AdvancedModelRenderer(this);
        this.cube_r249.setRotationPoint(0.0F, 0.2742F, 0.1579F);
        this.rightPlate19.addChild(cube_r249);
        this.setRotateAngle(cube_r249, -0.2967F, 0.0F, 0.0F);
        this.cube_r249.cubeList.add(new ModelBox(cube_r249, 39, 138, -0.481F, -1.5331F, -0.8918F, 1, 2, 2, -0.2F, true));

        this.cube_r250 = new AdvancedModelRenderer(this);
        this.cube_r250.setRotationPoint(0.019F, -3.1104F, 0.5661F);
        this.rightPlate19.addChild(cube_r250);
        this.setRotateAngle(cube_r250, 0.3316F, 0.0F, 0.0F);
        this.cube_r250.cubeList.add(new ModelBox(cube_r250, 143, 19, -0.5F, 0.4762F, -1.1743F, 1, 2, 1, -0.213F, true));
        this.cube_r250.cubeList.add(new ModelBox(cube_r250, 124, 140, -0.5F, -0.2238F, -0.7743F, 1, 3, 1, -0.22F, true));
        this.cube_r250.cubeList.add(new ModelBox(cube_r250, 109, 118, -0.5F, 0.9762F, -1.6743F, 1, 1, 1, -0.214F, true));

        this.cube_r251 = new AdvancedModelRenderer(this);
        this.cube_r251.setRotationPoint(0.019F, -1.7104F, -0.5339F);
        this.rightPlate19.addChild(cube_r251);
        this.setRotateAngle(cube_r251, -0.3491F, 0.0F, 0.0F);
        this.cube_r251.cubeList.add(new ModelBox(cube_r251, 140, 124, -0.5F, -1.8485F, -0.2172F, 1, 3, 1, -0.19F, true));

        this.neck = new AdvancedModelRenderer(this);
        this.neck.setRotationPoint(0.0F, -0.75F, -10.0F);
        this.neck2.addChild(neck);
        this.setRotateAngle(neck, 0.0567F, 0.0F, 0.0F);
        this.neck.cubeList.add(new ModelBox(neck, 108, 84, -1.0F, -0.6014F, -4.9074F, 3, 4, 5, -0.02F, false));

        this.cube_r252 = new AdvancedModelRenderer(this);
        this.cube_r252.setRotationPoint(0.5F, 3.7744F, -5.6641F);
        this.neck.addChild(cube_r252);
        this.setRotateAngle(cube_r252, -0.0262F, 0.0F, 0.0F);
        this.cube_r252.cubeList.add(new ModelBox(cube_r252, 51, 9, -1.0F, -1.0491F, 0.7859F, 2, 1, 4, 0.0F, false));

        this.head = new AdvancedModelRenderer(this);
        this.head.setRotationPoint(1.0F, 0.2986F, -4.9074F);
        this.neck.addChild(head);
        this.setRotateAngle(head, 0.3927F, 0.0F, 0.0F);
        this.head.cubeList.add(new ModelBox(head, 99, 63, -2.0F, -0.4577F, -2.7162F, 3, 2, 2, 0.0F, false));
        this.head.cubeList.add(new ModelBox(head, 60, 78, -2.0F, -0.9577F, -2.7162F, 3, 1, 3, -0.002F, false));
        this.head.cubeList.add(new ModelBox(head, 126, 116, -2.0F, -0.5077F, -0.7162F, 3, 3, 1, 0.01F, false));
        this.head.cubeList.add(new ModelBox(head, 133, 30, -1.5F, 0.5423F, -4.4162F, 2, 1, 2, 0.02F, false));

        this.cube_r253 = new AdvancedModelRenderer(this);
        this.cube_r253.setRotationPoint(0.0F, 6.5658F, -7.4912F);
        this.head.addChild(cube_r253);
        this.setRotateAngle(cube_r253, 0.2356F, 0.0F, 0.0F);
        this.cube_r253.cubeList.add(new ModelBox(cube_r253, 126, 101, -1.5F, -6.1196F, 4.4041F, 2, 2, 2, 0.01F, false));

        this.cube_r254 = new AdvancedModelRenderer(this);
        this.cube_r254.setRotationPoint(0.0F, 6.4658F, -9.1912F);
        this.head.addChild(cube_r254);
        this.setRotateAngle(cube_r254, 0.2531F, 0.0F, 0.0F);
        this.cube_r254.cubeList.add(new ModelBox(cube_r254, 129, 42, -1.5F, -5.5288F, 4.421F, 2, 1, 2, -0.02F, false));

        this.cube_r255 = new AdvancedModelRenderer(this);
        this.cube_r255.setRotationPoint(0.0F, 6.4658F, -9.1912F);
        this.head.addChild(cube_r255);
        this.setRotateAngle(cube_r255, 0.3229F, 0.0F, 0.0F);
        this.cube_r255.cubeList.add(new ModelBox(cube_r255, 126, 106, -1.0F, -5.176F, 1.9694F, 1, 1, 3, -0.03F, false));

        this.cube_r256 = new AdvancedModelRenderer(this);
        this.cube_r256.setRotationPoint(0.0F, 7.6158F, -7.5412F);
        this.head.addChild(cube_r256);
        this.setRotateAngle(cube_r256, 0.0873F, 0.0F, 0.0F);
        this.cube_r256.cubeList.add(new ModelBox(cube_r256, 126, 111, -1.0F, -6.7786F, -0.8702F, 1, 1, 3, 0.0F, false));
        this.cube_r256.cubeList.add(new ModelBox(cube_r256, 131, 86, -1.5F, -6.7786F, 1.9798F, 2, 1, 2, 0.0F, false));

        this.cube_r257 = new AdvancedModelRenderer(this);
        this.cube_r257.setRotationPoint(-1.1F, 1.2423F, -3.9162F);
        this.head.addChild(cube_r257);
        this.setRotateAngle(cube_r257, 0.0F, -0.0873F, 0.0F);
        this.cube_r257.cubeList.add(new ModelBox(cube_r257, 0, 154, 0.0F, -0.5F, -2.5F, 0, 1, 5, 0.0F, true));

        this.cube_r258 = new AdvancedModelRenderer(this);
        this.cube_r258.setRotationPoint(0.1F, 1.2423F, -3.9162F);
        this.head.addChild(cube_r258);
        this.setRotateAngle(cube_r258, 0.0F, 0.0873F, 0.0F);
        this.cube_r258.cubeList.add(new ModelBox(cube_r258, 0, 154, 0.0F, -0.5F, -2.5F, 0, 1, 5, 0.0F, false));

        this.cube_r259 = new AdvancedModelRenderer(this);
        this.cube_r259.setRotationPoint(-1.7F, 6.9158F, -5.2912F);
        this.head.addChild(cube_r259);
        this.setRotateAngle(cube_r259, 0.0F, 0.0F, 1.3963F);
        this.cube_r259.cubeList.add(new ModelBox(cube_r259, 136, 131, -7.866F, -1.8783F, 2.55F, 1, 1, 2, -0.05F, true));

        this.cube_r260 = new AdvancedModelRenderer(this);
        this.cube_r260.setRotationPoint(0.7F, 6.9158F, -5.2912F);
        this.head.addChild(cube_r260);
        this.setRotateAngle(cube_r260, 0.0F, 0.0F, -1.3963F);
        this.cube_r260.cubeList.add(new ModelBox(cube_r260, 136, 131, 6.866F, -1.8783F, 2.55F, 1, 1, 2, -0.05F, false));

        this.Eye = new AdvancedModelRenderer(this);
        this.Eye.setRotationPoint(0.585F, -0.0327F, -2.0662F);
        this.head.addChild(Eye);
        this.Eye.cubeList.add(new ModelBox(Eye, 57, 37, -0.5F, -0.5F, -0.5F, 1, 1, 1, 0.01F, false));
        this.Eye.cubeList.add(new ModelBox(Eye, 57, 37, -2.67F, -0.5F, -0.5F, 1, 1, 1, 0.01F, true));

        this.jaw = new AdvancedModelRenderer(this);
        this.jaw.setRotationPoint(-0.5F, 1.6158F, -0.7912F);
        this.head.addChild(jaw);
        this.setRotateAngle(jaw, 0.0218F, 0.0F, 0.0F);
        this.jaw.cubeList.add(new ModelBox(jaw, 17, 104, -1.5F, -0.1235F, -1.925F, 3, 1, 2, -0.01F, false));
        this.jaw.cubeList.add(new ModelBox(jaw, 27, 122, 0.99F, -1.8235F, -3.175F, 0, 2, 4, 0.0F, false));
        this.jaw.cubeList.add(new ModelBox(jaw, 119, 0, 0.94F, -1.8235F, -3.175F, 0, 2, 4, 0.0F, false));
        this.jaw.cubeList.add(new ModelBox(jaw, 119, 0, -0.94F, -1.8235F, -3.175F, 0, 2, 4, 0.0F, true));
        this.jaw.cubeList.add(new ModelBox(jaw, 27, 122, -0.99F, -1.8235F, -3.175F, 0, 2, 4, 0.0F, true));

        this.cube_r261 = new AdvancedModelRenderer(this);
        this.cube_r261.setRotationPoint(0.0F, 6.8805F, -6.7256F);
        this.jaw.addChild(cube_r261);
        this.setRotateAngle(cube_r261, 0.0436F, 0.0F, 0.0F);
        this.cube_r261.cubeList.add(new ModelBox(cube_r261, 126, 96, -0.5F, -6.9037F, -1.1081F, 1, 1, 3, -0.02F, false));
        this.cube_r261.cubeList.add(new ModelBox(cube_r261, 111, 45, -1.0F, -6.9037F, 1.7419F, 2, 1, 2, -0.01F, false));

        this.cube_r262 = new AdvancedModelRenderer(this);
        this.cube_r262.setRotationPoint(-0.8F, 0.1836F, -3.2435F);
        this.jaw.addChild(cube_r262);
        this.setRotateAngle(cube_r262, 0.0436F, -0.0436F, 0.0019F);
        this.cube_r262.cubeList.add(new ModelBox(cube_r262, 0, 153, 0.0F, -0.5F, -2.0F, 0, 1, 4, 0.0F, true));

        this.cube_r263 = new AdvancedModelRenderer(this);
        this.cube_r263.setRotationPoint(0.8F, 0.1836F, -3.2435F);
        this.jaw.addChild(cube_r263);
        this.setRotateAngle(cube_r263, 0.0436F, 0.0436F, -0.0019F);
        this.cube_r263.cubeList.add(new ModelBox(cube_r263, 0, 153, 0.0F, -0.5F, -2.0F, 0, 1, 4, 0.0F, false));

        this.cube_r264 = new AdvancedModelRenderer(this);
        this.cube_r264.setRotationPoint(0.5F, 8.0F, -4.75F);
        this.jaw.addChild(cube_r264);
        this.setRotateAngle(cube_r264, -0.0436F, 0.0F, 0.0F);
        this.cube_r264.cubeList.add(new ModelBox(cube_r264, 132, 77, -1.5F, -8.2009F, 0.7635F, 2, 1, 2, 0.0F, false));

        this.cube_r265 = new AdvancedModelRenderer(this);
        this.cube_r265.setRotationPoint(-0.75F, 6.75F, -6.0F);
        this.jaw.addChild(cube_r265);
        this.setRotateAngle(cube_r265, -0.4363F, 0.0F, 0.0F);
        this.cube_r265.cubeList.add(new ModelBox(cube_r265, 7, 0, -0.23F, -8.2103F, -0.7025F, 0, 1, 1, 0.0F, true));
        this.cube_r265.cubeList.add(new ModelBox(cube_r265, 0, 0, -0.18F, -8.2103F, -0.7025F, 0, 1, 1, 0.0F, true));
        this.cube_r265.cubeList.add(new ModelBox(cube_r265, 0, 0, 1.68F, -8.2103F, -0.7025F, 0, 1, 1, 0.0F, false));
        this.cube_r265.cubeList.add(new ModelBox(cube_r265, 7, 0, 1.73F, -8.2103F, -0.7025F, 0, 1, 1, 0.0F, false));

        this.cube_r266 = new AdvancedModelRenderer(this);
        this.cube_r266.setRotationPoint(0.0F, 1.46F, -1.8655F);
        this.jaw.addChild(cube_r266);
        this.setRotateAngle(cube_r266, -0.1484F, 0.0F, 0.0F);
        this.cube_r266.cubeList.add(new ModelBox(cube_r266, 52, 10, -1.0F, -1.002F, -0.073F, 2, 1, 3, -0.003F, false));

        this.cube_r267 = new AdvancedModelRenderer(this);
        this.cube_r267.setRotationPoint(0.0F, 0.86F, -3.5655F);
        this.jaw.addChild(cube_r267);
        this.setRotateAngle(cube_r267, -0.3403F, 0.0F, 0.0F);
        this.cube_r267.cubeList.add(new ModelBox(cube_r267, 60, 9, -0.5F, -0.9985F, -0.1958F, 1, 1, 2, 0.0F, false));

        this.leftPlate20 = new AdvancedModelRenderer(this);
        this.leftPlate20.setRotationPoint(1.3F, -0.0014F, -0.0574F);
        this.neck.addChild(leftPlate20);
        this.setRotateAngle(leftPlate20, 0.0F, 0.3491F, 0.0F);


        this.cube_r268 = new AdvancedModelRenderer(this);
        this.cube_r268.setRotationPoint(0.0F, -0.0319F, 0.1667F);
        this.leftPlate20.addChild(cube_r268);
        this.setRotateAngle(cube_r268, -0.2618F, 0.0F, 0.0F);
        this.cube_r268.cubeList.add(new ModelBox(cube_r268, 68, 96, 0.0F, -3.0F, -1.3F, 0, 3, 2, 0.0F, false));

        this.rightPlate20 = new AdvancedModelRenderer(this);
        this.rightPlate20.setRotationPoint(-0.3F, -0.0014F, -0.0574F);
        this.neck.addChild(rightPlate20);
        this.setRotateAngle(rightPlate20, 0.0F, -0.3491F, 0.0F);


        this.cube_r269 = new AdvancedModelRenderer(this);
        this.cube_r269.setRotationPoint(0.0F, -0.0319F, 0.1667F);
        this.rightPlate20.addChild(cube_r269);
        this.setRotateAngle(cube_r269, -0.2618F, 0.0F, 0.0F);
        this.cube_r269.cubeList.add(new ModelBox(cube_r269, 68, 96, 0.0F, -3.0F, -1.3F, 0, 3, 2, 0.0F, true));

        this.leftPlate17 = new AdvancedModelRenderer(this);
        this.leftPlate17.setRotationPoint(1.1F, 0.0486F, -2.0574F);
        this.neck.addChild(leftPlate17);
        this.setRotateAngle(leftPlate17, 0.0F, 0.2182F, 0.0F);
        this.leftPlate17.cubeList.add(new ModelBox(leftPlate17, 91, 102, 0.0F, -2.8319F, -0.8333F, 0, 3, 2, 0.0F, false));

        this.rightPlate17 = new AdvancedModelRenderer(this);
        this.rightPlate17.setRotationPoint(-0.1F, 0.0486F, -2.0574F);
        this.neck.addChild(rightPlate17);
        this.setRotateAngle(rightPlate17, 0.0F, -0.2182F, 0.0F);
        this.rightPlate17.cubeList.add(new ModelBox(rightPlate17, 91, 102, 0.0F, -2.8319F, -0.8333F, 0, 3, 2, 0.0F, true));

        this.leftPlate1 = new AdvancedModelRenderer(this);
        this.leftPlate1.setRotationPoint(0.9F, -0.4014F, -4.0074F);
        this.neck.addChild(leftPlate1);
        this.setRotateAngle(leftPlate1, 0.0886F, 0.2178F, 0.0078F);
        this.leftPlate1.cubeList.add(new ModelBox(leftPlate1, 71, 81, 0.0F, -1.7819F, -0.8333F, 0, 2, 2, 0.0F, false));

        this.rightPlate1 = new AdvancedModelRenderer(this);
        this.rightPlate1.setRotationPoint(0.1F, -0.4014F, -4.0074F);
        this.neck.addChild(rightPlate1);
        this.setRotateAngle(rightPlate1, 0.0886F, -0.2178F, -0.0078F);
        this.rightPlate1.cubeList.add(new ModelBox(rightPlate1, 71, 81, 0.0F, -1.7819F, -0.8333F, 0, 2, 2, 0.0F, true));

        this.frontleftleg = new AdvancedModelRenderer(this);
        this.frontleftleg.setRotationPoint(6.25F, 14.304F, -3.1548F);
        this.upperbody.addChild(frontleftleg);
        this.setRotateAngle(frontleftleg, 0.5236F, 0.0F, -0.2618F);
        this.frontleftleg.cubeList.add(new ModelBox(frontleftleg, 68, 96, -2.5F, -2.0597F, -2.9263F, 5, 14, 6, 0.0F, false));

        this.frontleftleg2 = new AdvancedModelRenderer(this);
        this.frontleftleg2.setRotationPoint(0.0F, 11.9403F, 0.9737F);
        this.frontleftleg.addChild(frontleftleg2);
        this.setRotateAngle(frontleftleg2, -0.5977F, 0.1096F, 0.2382F);
        this.frontleftleg2.cubeList.add(new ModelBox(frontleftleg2, 23, 104, -2.0F, -1.436F, -3.3169F, 4, 12, 5, -0.01F, false));

        this.frontleftleg3 = new AdvancedModelRenderer(this);
        this.frontleftleg3.setRotationPoint(0.5F, 9.664F, -0.5669F);
        this.frontleftleg2.addChild(frontleftleg3);
        this.setRotateAngle(frontleftleg3, 0.1745F, 0.0873F, 0.0F);
        this.frontleftleg3.cubeList.add(new ModelBox(frontleftleg3, 51, 0, -3.0F, 0.0F, -4.0F, 5, 2, 6, 0.0F, false));

        this.frontrightleg = new AdvancedModelRenderer(this);
        this.frontrightleg.setRotationPoint(-6.25F, 14.304F, -3.1548F);
        this.upperbody.addChild(frontrightleg);
        this.setRotateAngle(frontrightleg, 0.5236F, 0.0F, 0.2618F);
        this.frontrightleg.cubeList.add(new ModelBox(frontrightleg, 68, 96, -2.5F, -2.0597F, -2.9263F, 5, 14, 6, 0.0F, true));

        this.frontrightleg2 = new AdvancedModelRenderer(this);
        this.frontrightleg2.setRotationPoint(0.0F, 11.9403F, 0.9737F);
        this.frontrightleg.addChild(frontrightleg2);
        this.setRotateAngle(frontrightleg2, -0.5977F, -0.1096F, -0.2382F);
        this.frontrightleg2.cubeList.add(new ModelBox(frontrightleg2, 23, 104, -2.0F, -1.436F, -3.3169F, 4, 12, 5, -0.01F, true));

        this.frontrightleg3 = new AdvancedModelRenderer(this);
        this.frontrightleg3.setRotationPoint(-0.5F, 9.664F, -0.5669F);
        this.frontrightleg2.addChild(frontrightleg3);
        this.setRotateAngle(frontrightleg3, 0.1745F, -0.0873F, 0.0F);
        this.frontrightleg3.cubeList.add(new ModelBox(frontrightleg3, 51, 0, -2.0F, 0.0F, -4.0F, 5, 2, 6, 0.0F, true));

        this.tail = new AdvancedModelRenderer(this);
        this.tail.setRotationPoint(0.0F, -6.85F, 4.45F);
        this.body.addChild(tail);
        this.tail.cubeList.add(new ModelBox(tail, 67, 0, -5.0F, 0.0F, -0.95F, 10, 12, 9, 0.0F, false));

        this.leftPlate34 = new AdvancedModelRenderer(this);
        this.leftPlate34.setRotationPoint(3.0F, 3.4305F, 2.9259F);
        this.tail.addChild(leftPlate34);
        this.setRotateAngle(leftPlate34, -0.398F, 0.2298F, 0.184F);
        this.leftPlate34.cubeList.add(new ModelBox(leftPlate34, 58, 117, -1.5936F, -18.2609F, -0.8644F, 1, 19, 1, -0.002F, false));

        this.cube_r270 = new AdvancedModelRenderer(this);
        this.cube_r270.setRotationPoint(-1.0936F, -9.1031F, -1.3027F);
        this.leftPlate34.addChild(cube_r270);
        this.setRotateAngle(cube_r270, -0.0524F, 0.0F, 0.0F);
        this.cube_r270.cubeList.add(new ModelBox(cube_r270, 42, 117, -0.5F, -9.3298F, -0.0228F, 1, 19, 1, 0.0F, false));

        this.rightPlate34 = new AdvancedModelRenderer(this);
        this.rightPlate34.setRotationPoint(-3.0F, 3.4305F, 2.9259F);
        this.tail.addChild(rightPlate34);
        this.setRotateAngle(rightPlate34, -0.398F, -0.2298F, -0.184F);
        this.rightPlate34.cubeList.add(new ModelBox(rightPlate34, 58, 117, 0.5936F, -18.2609F, -0.8644F, 1, 19, 1, -0.002F, true));

        this.cube_r271 = new AdvancedModelRenderer(this);
        this.cube_r271.setRotationPoint(1.0936F, -9.1031F, -1.3027F);
        this.rightPlate34.addChild(cube_r271);
        this.setRotateAngle(cube_r271, -0.0524F, 0.0F, 0.0F);
        this.cube_r271.cubeList.add(new ModelBox(cube_r271, 42, 117, -0.5F, -9.3298F, -0.0228F, 1, 19, 1, 0.0F, true));

        this.leftPlate11 = new AdvancedModelRenderer(this);
        this.leftPlate11.setRotationPoint(2.2F, 3.9305F, 5.6759F);
        this.tail.addChild(leftPlate11);
        this.setRotateAngle(leftPlate11, -0.4907F, 0.2411F, 0.1981F);
        this.leftPlate11.cubeList.add(new ModelBox(leftPlate11, 69, 117, -1.5936F, -18.2976F, -0.8636F, 1, 19, 1, -0.002F, false));

        this.cube_r272 = new AdvancedModelRenderer(this);
        this.cube_r272.setRotationPoint(-1.0936F, -9.1031F, -1.3027F);
        this.leftPlate11.addChild(cube_r272);
        this.setRotateAngle(cube_r272, -0.0524F, 0.0F, 0.0F);
        this.cube_r272.cubeList.add(new ModelBox(cube_r272, 64, 116, -0.5F, -9.3298F, -0.0228F, 1, 20, 1, 0.0F, false));

        this.rightPlate11 = new AdvancedModelRenderer(this);
        this.rightPlate11.setRotationPoint(-2.2F, 3.9305F, 5.6759F);
        this.tail.addChild(rightPlate11);
        this.setRotateAngle(rightPlate11, -0.4907F, -0.2411F, -0.1981F);
        this.rightPlate11.cubeList.add(new ModelBox(rightPlate11, 69, 117, 0.5936F, -18.2976F, -0.8636F, 1, 19, 1, -0.002F, true));

        this.cube_r273 = new AdvancedModelRenderer(this);
        this.cube_r273.setRotationPoint(1.0936F, -9.1031F, -1.3027F);
        this.rightPlate11.addChild(cube_r273);
        this.setRotateAngle(cube_r273, -0.0524F, 0.0F, 0.0F);
        this.cube_r273.cubeList.add(new ModelBox(cube_r273, 64, 116, -0.5F, -9.3298F, -0.0228F, 1, 20, 1, 0.0F, true));

        this.tail2 = new AdvancedModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, 2.5F, 7.05F);
        this.tail.addChild(tail2);
        this.setRotateAngle(tail2, -0.0873F, 0.0F, 0.0F);
        this.tail2.cubeList.add(new ModelBox(tail2, 68, 78, -3.5F, -2.0F, 0.0F, 7, 9, 8, 0.0F, false));

        this.leftPlate35 = new AdvancedModelRenderer(this);
        this.leftPlate35.setRotationPoint(1.6F, 1.6305F, 1.5259F);
        this.tail2.addChild(leftPlate35);
        this.setRotateAngle(leftPlate35, -0.5147F, 0.2424F, 0.2076F);
        this.leftPlate35.cubeList.add(new ModelBox(leftPlate35, 74, 117, -1.5936F, -18.3425F, -0.8564F, 1, 19, 1, -0.002F, false));

        this.cube_r274 = new AdvancedModelRenderer(this);
        this.cube_r274.setRotationPoint(-1.0936F, -9.1031F, -1.3027F);
        this.leftPlate35.addChild(cube_r274);
        this.setRotateAngle(cube_r274, -0.0524F, 0.0F, 0.0F);
        this.cube_r274.cubeList.add(new ModelBox(cube_r274, 116, 102, -0.5F, -9.3298F, -0.0228F, 1, 20, 1, 0.0F, false));

        this.rightPlate35 = new AdvancedModelRenderer(this);
        this.rightPlate35.setRotationPoint(-1.6F, 1.6305F, 1.5259F);
        this.tail2.addChild(rightPlate35);
        this.setRotateAngle(rightPlate35, -0.5147F, -0.2424F, -0.2076F);
        this.rightPlate35.cubeList.add(new ModelBox(rightPlate35, 74, 117, 0.5936F, -18.3425F, -0.8564F, 1, 19, 1, -0.002F, true));

        this.cube_r275 = new AdvancedModelRenderer(this);
        this.cube_r275.setRotationPoint(1.0936F, -9.1031F, -1.3027F);
        this.rightPlate35.addChild(cube_r275);
        this.setRotateAngle(cube_r275, -0.0524F, 0.0F, 0.0F);
        this.cube_r275.cubeList.add(new ModelBox(cube_r275, 116, 102, -0.5F, -9.3298F, -0.0228F, 1, 20, 1, 0.0F, true));

        this.leftPlate36 = new AdvancedModelRenderer(this);
        this.leftPlate36.setRotationPoint(1.7F, 0.8305F, 5.5259F);
        this.tail2.addChild(leftPlate36);
        this.setRotateAngle(leftPlate36, -0.5576F, 0.2393F, 0.2099F);


        this.cube_r276 = new AdvancedModelRenderer(this);
        this.cube_r276.setRotationPoint(-1.0936F, -7.5031F, -0.7027F);
        this.leftPlate36.addChild(cube_r276);
        this.setRotateAngle(cube_r276, -0.0873F, 0.0F, 0.0F);
        this.cube_r276.cubeList.add(new ModelBox(cube_r276, 5, 118, -0.5F, -8.8962F, -0.6057F, 1, 18, 1, 0.0F, false));

        this.cube_r277 = new AdvancedModelRenderer(this);
        this.cube_r277.setRotationPoint(-1.0936F, -16.4031F, 0.4973F);
        this.leftPlate36.addChild(cube_r277);
        this.setRotateAngle(cube_r277, -0.0349F, 0.0F, 0.0F);
        this.cube_r277.cubeList.add(new ModelBox(cube_r277, 10, 118, -0.5F, 0.1029F, -1.0316F, 1, 17, 1, -0.002F, false));

        this.rightPlate36 = new AdvancedModelRenderer(this);
        this.rightPlate36.setRotationPoint(-1.7F, 0.8305F, 5.5259F);
        this.tail2.addChild(rightPlate36);
        this.setRotateAngle(rightPlate36, -0.5576F, -0.2393F, -0.2099F);


        this.cube_r278 = new AdvancedModelRenderer(this);
        this.cube_r278.setRotationPoint(1.0936F, -7.5031F, -0.7027F);
        this.rightPlate36.addChild(cube_r278);
        this.setRotateAngle(cube_r278, -0.0873F, 0.0F, 0.0F);
        this.cube_r278.cubeList.add(new ModelBox(cube_r278, 5, 118, -0.5F, -8.8962F, -0.6057F, 1, 18, 1, 0.0F, true));

        this.cube_r279 = new AdvancedModelRenderer(this);
        this.cube_r279.setRotationPoint(1.0936F, -16.4031F, 0.4973F);
        this.rightPlate36.addChild(cube_r279);
        this.setRotateAngle(cube_r279, -0.0349F, 0.0F, 0.0F);
        this.cube_r279.cubeList.add(new ModelBox(cube_r279, 10, 118, -0.5F, 0.1029F, -1.0316F, 1, 17, 1, -0.002F, true));

        this.tail3 = new AdvancedModelRenderer(this);
        this.tail3.setRotationPoint(0.0F, 0.55F, 8.0F);
        this.tail2.addChild(tail3);
        this.setRotateAngle(tail3, -0.0873F, 0.0F, 0.0F);
        this.tail3.cubeList.add(new ModelBox(tail3, 0, 69, -2.5F, -2.1305F, -2.0086F, 5, 7, 13, 0.0F, false));

        this.leftPlate13 = new AdvancedModelRenderer(this);
        this.leftPlate13.setRotationPoint(0.8F, -0.7195F, 9.7259F);
        this.tail3.addChild(leftPlate13);
        this.setRotateAngle(leftPlate13, -0.486F, 0.3691F, 0.4147F);


        this.cube_r280 = new AdvancedModelRenderer(this);
        this.cube_r280.setRotationPoint(-0.1576F, -10.354F, 0.3268F);
        this.leftPlate13.addChild(cube_r280);
        this.setRotateAngle(cube_r280, -0.0349F, 0.0F, 0.0F);
        this.cube_r280.cubeList.add(new ModelBox(cube_r280, 121, 94, -0.5F, -0.3186F, -0.484F, 1, 11, 1, -0.002F, false));

        this.cube_r281 = new AdvancedModelRenderer(this);
        this.cube_r281.setRotationPoint(-0.1576F, -7.854F, -0.6732F);
        this.leftPlate13.addChild(cube_r281);
        this.setRotateAngle(cube_r281, -0.0873F, 0.0F, 0.0F);
        this.cube_r281.cubeList.add(new ModelBox(cube_r281, 121, 107, -0.5F, -2.8962F, 0.2943F, 1, 11, 1, 0.0F, false));

        this.rightPlate13 = new AdvancedModelRenderer(this);
        this.rightPlate13.setRotationPoint(-0.8F, -0.7195F, 9.7259F);
        this.tail3.addChild(rightPlate13);
        this.setRotateAngle(rightPlate13, -0.486F, -0.3691F, -0.4147F);


        this.cube_r282 = new AdvancedModelRenderer(this);
        this.cube_r282.setRotationPoint(0.1576F, -10.354F, 0.3268F);
        this.rightPlate13.addChild(cube_r282);
        this.setRotateAngle(cube_r282, -0.0349F, 0.0F, 0.0F);
        this.cube_r282.cubeList.add(new ModelBox(cube_r282, 121, 94, -0.5F, -0.3186F, -0.484F, 1, 11, 1, -0.002F, true));

        this.cube_r283 = new AdvancedModelRenderer(this);
        this.cube_r283.setRotationPoint(0.1576F, -7.854F, -0.6732F);
        this.rightPlate13.addChild(cube_r283);
        this.setRotateAngle(cube_r283, -0.0873F, 0.0F, 0.0F);
        this.cube_r283.cubeList.add(new ModelBox(cube_r283, 121, 107, -0.5F, -2.8962F, 0.2943F, 1, 11, 1, 0.0F, true));

        this.leftPlate37 = new AdvancedModelRenderer(this);
        this.leftPlate37.setRotationPoint(0.9F, -1.0195F, 6.3259F);
        this.tail3.addChild(leftPlate37);
        this.setRotateAngle(leftPlate37, -0.4849F, 0.3225F, 0.315F);


        this.cube_r284 = new AdvancedModelRenderer(this);
        this.cube_r284.setRotationPoint(-0.1576F, -11.704F, 0.6768F);
        this.leftPlate37.addChild(cube_r284);
        this.setRotateAngle(cube_r284, -0.0175F, 0.0F, 0.0F);
        this.cube_r284.cubeList.add(new ModelBox(cube_r284, 121, 63, -0.5F, 0.0601F, -0.9702F, 1, 12, 1, -0.002F, false));

        this.cube_r285 = new AdvancedModelRenderer(this);
        this.cube_r285.setRotationPoint(-0.1576F, -7.854F, -0.6732F);
        this.leftPlate37.addChild(cube_r285);
        this.setRotateAngle(cube_r285, -0.0873F, 0.0F, 0.0F);
        this.cube_r285.cubeList.add(new ModelBox(cube_r285, 94, 63, -0.5F, -3.8962F, -0.0057F, 1, 13, 1, 0.0F, false));

        this.rightPlate37 = new AdvancedModelRenderer(this);
        this.rightPlate37.setRotationPoint(-0.9F, -1.0195F, 6.3259F);
        this.tail3.addChild(rightPlate37);
        this.setRotateAngle(rightPlate37, -0.4849F, -0.3225F, -0.315F);


        this.cube_r286 = new AdvancedModelRenderer(this);
        this.cube_r286.setRotationPoint(0.1576F, -11.704F, 0.6768F);
        this.rightPlate37.addChild(cube_r286);
        this.setRotateAngle(cube_r286, -0.0175F, 0.0F, 0.0F);
        this.cube_r286.cubeList.add(new ModelBox(cube_r286, 121, 63, -0.5F, 0.0601F, -0.9702F, 1, 12, 1, -0.002F, true));

        this.cube_r287 = new AdvancedModelRenderer(this);
        this.cube_r287.setRotationPoint(0.1576F, -7.854F, -0.6732F);
        this.rightPlate37.addChild(cube_r287);
        this.setRotateAngle(cube_r287, -0.0873F, 0.0F, 0.0F);
        this.cube_r287.cubeList.add(new ModelBox(cube_r287, 94, 63, -0.5F, -3.8962F, -0.0057F, 1, 13, 1, 0.0F, true));

        this.leftPlate12 = new AdvancedModelRenderer(this);
        this.leftPlate12.setRotationPoint(2.1F, -0.9195F, 1.9259F);
        this.tail3.addChild(leftPlate12);
        this.setRotateAngle(leftPlate12, -0.5085F, 0.2678F, 0.2331F);


        this.cube_r288 = new AdvancedModelRenderer(this);
        this.cube_r288.setRotationPoint(-1.0936F, -13.4031F, 0.3973F);
        this.leftPlate12.addChild(cube_r288);
        this.setRotateAngle(cube_r288, -0.0175F, 0.0F, 0.0F);
        this.cube_r288.cubeList.add(new ModelBox(cube_r288, 11, 0, -0.5F, 0.1386F, -0.9867F, 1, 14, 1, -0.002F, false));

        this.cube_r289 = new AdvancedModelRenderer(this);
        this.cube_r289.setRotationPoint(-1.0936F, -7.5031F, -0.7027F);
        this.leftPlate12.addChild(cube_r289);
        this.setRotateAngle(cube_r289, -0.0873F, 0.0F, 0.0F);
        this.cube_r289.cubeList.add(new ModelBox(cube_r289, 98, 118, -0.5F, -5.8962F, -0.4057F, 1, 15, 1, 0.0F, false));

        this.rightPlate12 = new AdvancedModelRenderer(this);
        this.rightPlate12.setRotationPoint(-2.1F, -0.9195F, 1.9259F);
        this.tail3.addChild(rightPlate12);
        this.setRotateAngle(rightPlate12, -0.5085F, -0.2678F, -0.2331F);


        this.cube_r290 = new AdvancedModelRenderer(this);
        this.cube_r290.setRotationPoint(1.0936F, -13.4031F, 0.3973F);
        this.rightPlate12.addChild(cube_r290);
        this.setRotateAngle(cube_r290, -0.0175F, 0.0F, 0.0F);
        this.cube_r290.cubeList.add(new ModelBox(cube_r290, 11, 0, -0.5F, 0.1386F, -0.9867F, 1, 14, 1, -0.002F, true));

        this.cube_r291 = new AdvancedModelRenderer(this);
        this.cube_r291.setRotationPoint(1.0936F, -7.5031F, -0.7027F);
        this.rightPlate12.addChild(cube_r291);
        this.setRotateAngle(cube_r291, -0.0873F, 0.0F, 0.0F);
        this.cube_r291.cubeList.add(new ModelBox(cube_r291, 98, 118, -0.5F, -5.8962F, -0.4057F, 1, 15, 1, 0.0F, true));

        this.tail4 = new AdvancedModelRenderer(this);
        this.tail4.setRotationPoint(0.0F, 0.3695F, 10.9914F);
        this.tail3.addChild(tail4);
        this.setRotateAngle(tail4, -0.1309F, 0.0F, 0.0F);
        this.tail4.cubeList.add(new ModelBox(tail4, 88, 85, -2.0F, -2.0F, -2.0F, 4, 5, 11, 0.0F, false));

        this.leftPlate15 = new AdvancedModelRenderer(this);
        this.leftPlate15.setRotationPoint(0.7F, -0.289F, 6.0344F);
        this.tail4.addChild(leftPlate15);
        this.setRotateAngle(leftPlate15, -0.3095F, 0.4477F, 0.616F);
        this.leftPlate15.cubeList.add(new ModelBox(leftPlate15, 124, 37, -0.6576F, -8.6631F, -0.3751F, 1, 9, 1, -0.002F, false));

        this.cube_r292 = new AdvancedModelRenderer(this);
        this.cube_r292.setRotationPoint(-0.1576F, -7.854F, -0.6732F);
        this.leftPlate15.addChild(cube_r292);
        this.setRotateAngle(cube_r292, -0.0873F, 0.0F, 0.0F);
        this.cube_r292.cubeList.add(new ModelBox(cube_r292, 112, 123, -0.5F, -0.8962F, 0.2943F, 1, 9, 1, 0.0F, false));

        this.rightPlate15 = new AdvancedModelRenderer(this);
        this.rightPlate15.setRotationPoint(-0.7F, -0.289F, 6.0344F);
        this.tail4.addChild(rightPlate15);
        this.setRotateAngle(rightPlate15, -0.3095F, -0.4477F, -0.616F);
        this.rightPlate15.cubeList.add(new ModelBox(rightPlate15, 124, 37, -0.3424F, -8.6631F, -0.3751F, 1, 9, 1, -0.002F, true));

        this.cube_r293 = new AdvancedModelRenderer(this);
        this.cube_r293.setRotationPoint(0.1576F, -7.854F, -0.6732F);
        this.rightPlate15.addChild(cube_r293);
        this.setRotateAngle(cube_r293, -0.0873F, 0.0F, 0.0F);
        this.cube_r293.cubeList.add(new ModelBox(cube_r293, 112, 123, -0.5F, -0.8962F, 0.2943F, 1, 9, 1, 0.0F, true));

        this.leftPlate14 = new AdvancedModelRenderer(this);
        this.leftPlate14.setRotationPoint(0.4F, 0.211F, 2.0344F);
        this.tail4.addChild(leftPlate14);
        this.setRotateAngle(leftPlate14, -0.3062F, 0.2456F, 0.5768F);


        this.cube_r294 = new AdvancedModelRenderer(this);
        this.cube_r294.setRotationPoint(-0.1576F, -10.454F, 0.3268F);
        this.leftPlate14.addChild(cube_r294);
        this.setRotateAngle(cube_r294, -0.0175F, 0.0F, 0.0F);
        this.cube_r294.cubeList.add(new ModelBox(cube_r294, 120, 9, -0.5F, -0.219F, -0.4753F, 1, 11, 1, -0.002F, false));

        this.cube_r295 = new AdvancedModelRenderer(this);
        this.cube_r295.setRotationPoint(-0.1576F, -7.854F, -0.6732F);
        this.leftPlate14.addChild(cube_r295);
        this.setRotateAngle(cube_r295, -0.0873F, 0.0F, 0.0F);
        this.cube_r295.cubeList.add(new ModelBox(cube_r295, 121, 120, -0.5F, -2.8962F, 0.2943F, 1, 11, 1, 0.0F, false));

        this.rightPlate14 = new AdvancedModelRenderer(this);
        this.rightPlate14.setRotationPoint(-0.4F, 0.211F, 2.0344F);
        this.tail4.addChild(rightPlate14);
        this.setRotateAngle(rightPlate14, -0.3062F, -0.2456F, -0.5768F);


        this.cube_r296 = new AdvancedModelRenderer(this);
        this.cube_r296.setRotationPoint(0.1576F, -10.454F, 0.3268F);
        this.rightPlate14.addChild(cube_r296);
        this.setRotateAngle(cube_r296, -0.0175F, 0.0F, 0.0F);
        this.cube_r296.cubeList.add(new ModelBox(cube_r296, 120, 9, -0.5F, -0.219F, -0.4753F, 1, 11, 1, -0.002F, true));

        this.cube_r297 = new AdvancedModelRenderer(this);
        this.cube_r297.setRotationPoint(0.1576F, -7.854F, -0.6732F);
        this.rightPlate14.addChild(cube_r297);
        this.setRotateAngle(cube_r297, -0.0873F, 0.0F, 0.0F);
        this.cube_r297.cubeList.add(new ModelBox(cube_r297, 121, 120, -0.5F, -2.8962F, 0.2943F, 1, 11, 1, 0.0F, true));

        this.tail5 = new AdvancedModelRenderer(this);
        this.tail5.setRotationPoint(0.0F, -0.25F, 9.0F);
        this.tail4.addChild(tail5);
        this.setRotateAngle(tail5, -0.0873F, 0.0F, 0.0F);
        this.tail5.cubeList.add(new ModelBox(tail5, 42, 105, -1.5F, -1.25F, -1.0F, 3, 3, 8, 0.0F, false));

        this.leftPlate16 = new AdvancedModelRenderer(this);
        this.leftPlate16.setRotationPoint(0.0F, 0.661F, 0.7344F);
        this.tail5.addChild(leftPlate16);
        this.setRotateAngle(leftPlate16, -0.1998F, 0.4857F, 0.705F);


        this.cube_r298 = new AdvancedModelRenderer(this);
        this.cube_r298.setRotationPoint(-0.1576F, -7.854F, 0.6268F);
        this.leftPlate16.addChild(cube_r298);
        this.setRotateAngle(cube_r298, -0.0436F, 0.0F, 0.0F);
        this.cube_r298.cubeList.add(new ModelBox(cube_r298, 126, 69, -0.5F, 0.2171F, -1.0008F, 1, 8, 1, -0.002F, false));

        this.cube_r299 = new AdvancedModelRenderer(this);
        this.cube_r299.setRotationPoint(-0.1576F, -7.854F, -0.6732F);
        this.leftPlate16.addChild(cube_r299);
        this.setRotateAngle(cube_r299, -0.0873F, 0.0F, 0.0F);
        this.cube_r299.cubeList.add(new ModelBox(cube_r299, 126, 86, -0.5F, 0.1038F, 0.2943F, 1, 8, 1, 0.0F, false));

        this.rightPlate16 = new AdvancedModelRenderer(this);
        this.rightPlate16.setRotationPoint(0.0F, 0.661F, 0.7344F);
        this.tail5.addChild(rightPlate16);
        this.setRotateAngle(rightPlate16, -0.1998F, -0.4857F, -0.705F);


        this.cube_r300 = new AdvancedModelRenderer(this);
        this.cube_r300.setRotationPoint(0.1576F, -7.854F, 0.6268F);
        this.rightPlate16.addChild(cube_r300);
        this.setRotateAngle(cube_r300, -0.0436F, 0.0F, 0.0F);
        this.cube_r300.cubeList.add(new ModelBox(cube_r300, 126, 69, -0.5F, 0.2171F, -1.0008F, 1, 8, 1, -0.002F, true));

        this.cube_r301 = new AdvancedModelRenderer(this);
        this.cube_r301.setRotationPoint(0.1576F, -7.854F, -0.6732F);
        this.rightPlate16.addChild(cube_r301);
        this.setRotateAngle(cube_r301, -0.0873F, 0.0F, 0.0F);
        this.cube_r301.cubeList.add(new ModelBox(cube_r301, 126, 86, -0.5F, 0.1038F, 0.2943F, 1, 8, 1, 0.0F, true));

        this.lefttailSpike = new AdvancedModelRenderer(this);
        this.lefttailSpike.setRotationPoint(1.65F, -0.4962F, 5.2572F);
        this.tail5.addChild(lefttailSpike);
        this.setRotateAngle(lefttailSpike, -0.0432F, -0.0152F, 1.0025F);


        this.babyskewer_r1 = new AdvancedModelRenderer(this);
        this.babyskewer_r1.setRotationPoint(0.0F, -2.1057F, 0.3298F);
        this.lefttailSpike.addChild(babyskewer_r1);
        this.setRotateAngle(babyskewer_r1, -0.624F, 0.0F, 0.0F);
        this.babyskewer_r1.cubeList.add(new ModelBox(babyskewer_r1, 126, 59, -0.5F, -3.625F, 0.55F, 1, 8, 1, -0.01F, false));

        this.cube_r302 = new AdvancedModelRenderer(this);
        this.cube_r302.setRotationPoint(0.0F, -13.1057F, 9.9298F);
        this.lefttailSpike.addChild(cube_r302);
        this.setRotateAngle(cube_r302, -0.5629F, 0.0F, 0.0F);
        this.cube_r302.cubeList.add(new ModelBox(cube_r302, 0, 118, -0.5F, 0.0399F, -1.0202F, 1, 18, 1, 0.0F, false));

        this.cube_r303 = new AdvancedModelRenderer(this);
        this.cube_r303.setRotationPoint(0.0F, 0.623F, -1.0056F);
        this.lefttailSpike.addChild(cube_r303);
        this.setRotateAngle(cube_r303, -0.6545F, 0.0F, 0.0F);
        this.cube_r303.cubeList.add(new ModelBox(cube_r303, 84, 117, -0.5F, -17.5878F, -0.6862F, 1, 19, 1, 0.01F, false));

        this.righttailSpike = new AdvancedModelRenderer(this);
        this.righttailSpike.setRotationPoint(-1.65F, -0.4962F, 5.2572F);
        this.tail5.addChild(righttailSpike);
        this.setRotateAngle(righttailSpike, -0.0432F, 0.0152F, -1.0025F);


        this.babyskewer_r2 = new AdvancedModelRenderer(this);
        this.babyskewer_r2.setRotationPoint(0.0F, -2.1057F, 0.3298F);
        this.righttailSpike.addChild(babyskewer_r2);
        this.setRotateAngle(babyskewer_r2, -0.624F, 0.0F, 0.0F);
        this.babyskewer_r2.cubeList.add(new ModelBox(babyskewer_r2, 126, 59, -0.5F, -3.625F, 0.55F, 1, 8, 1, -0.01F, true));

        this.cube_r304 = new AdvancedModelRenderer(this);
        this.cube_r304.setRotationPoint(0.0F, -13.1057F, 9.9298F);
        this.righttailSpike.addChild(cube_r304);
        this.setRotateAngle(cube_r304, -0.5629F, 0.0F, 0.0F);
        this.cube_r304.cubeList.add(new ModelBox(cube_r304, 0, 118, -0.5F, 0.0399F, -1.0202F, 1, 18, 1, 0.0F, true));

        this.cube_r305 = new AdvancedModelRenderer(this);
        this.cube_r305.setRotationPoint(0.0F, 0.623F, -1.0056F);
        this.righttailSpike.addChild(cube_r305);
        this.setRotateAngle(cube_r305, -0.6545F, 0.0F, 0.0F);
        this.cube_r305.cubeList.add(new ModelBox(cube_r305, 84, 117, -0.5F, -17.5878F, -0.6862F, 1, 19, 1, 0.01F, true));

        this.tail6 = new AdvancedModelRenderer(this);
        this.tail6.setRotationPoint(0.0F, -0.1F, 7.0F);
        this.tail5.addChild(tail6);
        this.setRotateAngle(tail6, -0.2618F, 0.0F, 0.0F);
        this.tail6.cubeList.add(new ModelBox(tail6, 24, 70, -1.0F, -0.9312F, -0.3239F, 2, 2, 8, 0.0F, false));

        this.lefttailSpike2 = new AdvancedModelRenderer(this);
        this.lefttailSpike2.setRotationPoint(0.85F, -0.1962F, 3.3572F);
        this.tail6.addChild(lefttailSpike2);
        this.setRotateAngle(lefttailSpike2, -0.2863F, 0.0036F, 1.0995F);


        this.babyskewer_r3 = new AdvancedModelRenderer(this);
        this.babyskewer_r3.setRotationPoint(0.0F, -2.1057F, 0.3298F);
        this.lefttailSpike2.addChild(babyskewer_r3);
        this.setRotateAngle(babyskewer_r3, -0.624F, 0.0F, 0.0F);
        this.babyskewer_r3.cubeList.add(new ModelBox(babyskewer_r3, 37, 69, -0.5F, -3.625F, 0.55F, 1, 6, 1, -0.01F, false));

        this.cube_r306 = new AdvancedModelRenderer(this);
        this.cube_r306.setRotationPoint(0.0F, -13.1057F, 9.9298F);
        this.lefttailSpike2.addChild(cube_r306);
        this.setRotateAngle(cube_r306, -0.5629F, 0.0F, 0.0F);
        this.cube_r306.cubeList.add(new ModelBox(cube_r306, 15, 118, -0.5F, 0.0399F, -1.0202F, 1, 16, 1, 0.0F, false));

        this.cube_r307 = new AdvancedModelRenderer(this);
        this.cube_r307.setRotationPoint(0.0F, 0.623F, -1.0056F);
        this.lefttailSpike2.addChild(cube_r307);
        this.setRotateAngle(cube_r307, -0.6545F, 0.0F, 0.0F);
        this.cube_r307.cubeList.add(new ModelBox(cube_r307, 79, 117, -0.5F, -17.5878F, -0.6862F, 1, 19, 1, 0.01F, false));

        this.righttailSpike2 = new AdvancedModelRenderer(this);
        this.righttailSpike2.setRotationPoint(-0.85F, -0.1962F, 3.3572F);
        this.tail6.addChild(righttailSpike2);
        this.setRotateAngle(righttailSpike2, -0.2863F, -0.0036F, -1.0995F);


        this.babyskewer_r4 = new AdvancedModelRenderer(this);
        this.babyskewer_r4.setRotationPoint(0.0F, -2.1057F, 0.3298F);
        this.righttailSpike2.addChild(babyskewer_r4);
        this.setRotateAngle(babyskewer_r4, -0.624F, 0.0F, 0.0F);
        this.babyskewer_r4.cubeList.add(new ModelBox(babyskewer_r4, 37, 69, -0.5F, -3.625F, 0.55F, 1, 6, 1, -0.01F, true));

        this.cube_r308 = new AdvancedModelRenderer(this);
        this.cube_r308.setRotationPoint(0.0F, -13.1057F, 9.9298F);
        this.righttailSpike2.addChild(cube_r308);
        this.setRotateAngle(cube_r308, -0.5629F, 0.0F, 0.0F);
        this.cube_r308.cubeList.add(new ModelBox(cube_r308, 15, 118, -0.5F, 0.0399F, -1.0202F, 1, 16, 1, 0.0F, true));

        this.cube_r309 = new AdvancedModelRenderer(this);
        this.cube_r309.setRotationPoint(0.0F, 0.623F, -1.0056F);
        this.righttailSpike2.addChild(cube_r309);
        this.setRotateAngle(cube_r309, -0.6545F, 0.0F, 0.0F);
        this.cube_r309.cubeList.add(new ModelBox(cube_r309, 79, 117, -0.5F, -17.5878F, -0.6862F, 1, 19, 1, 0.01F, true));

        updateDefaultPose();
        animator = ModelAnimator.create();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        //this.main.rotateAngleY = (float)Math.toRadians(((EntityPrehistoricFloraMiragaia)entity).getRotationAngle());
        animate((IAnimatedEntity) entity, f, f1, f2, f3, f4, f5);
        this.main.render(f5);
    }

    public void renderStaticWall(float f) {

        resetToDefaultPose();
    }

    public void renderStaticBook(float f) {
        //Rotations, positions and sizing:
        this.main.offsetY = 0.1F;
        this.main.offsetX = -0.2F;
        this.main.rotateAngleY = (float)Math.toRadians(255);
        this.main.rotateAngleX = (float)Math.toRadians(5);
        this.main.rotateAngleZ = (float)Math.toRadians(-10);
        this.main.scaleChildren = true;
        float scaler = 0.825F;
        this.main.setScale(scaler, scaler, scaler);
        //Start of pose:
        this.setRotateAngle(body, -0.1309F, 0.0F, 0.0F);
        this.setRotateAngle(leftPlate10, -0.2965F, 0.2424F, 0.2076F);
        this.setRotateAngle(cube_r1, 0.0087F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r2, 0.096F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r3, 0.1309F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r4, -0.1134F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r5, -0.0698F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r6, -0.2793F, 0.0F, 0.0F);
        this.setRotateAngle(rightPlate10, -0.2965F, -0.2424F, -0.2076F);
        this.setRotateAngle(cube_r7, 0.0087F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r8, 0.096F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r9, 0.1309F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r10, -0.1134F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r11, -0.0698F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r12, -0.2793F, 0.0F, 0.0F);
        this.setRotateAngle(leftPlate33, -0.3896F, 0.2325F, 0.1827F);
        this.setRotateAngle(cube_r13, 0.0087F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r14, 0.1309F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r15, -0.096F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r16, 0.0087F, 0.0F, 0.0F);
        this.setRotateAngle(rightPlate33, -0.3896F, -0.2325F, -0.1827F);
        this.setRotateAngle(cube_r17, 0.0087F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r18, 0.1309F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r19, -0.096F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r20, 0.0087F, 0.0F, 0.0F);
        this.setRotateAngle(backleftleg, -0.1745F, 0.0F, 0.0F);
        this.setRotateAngle(backleftleg2, 0.5236F, 0.0F, 0.0F);
        this.setRotateAngle(backleftleg3, -0.5672F, 0.0F, 0.0F);
        this.setRotateAngle(backleftleg4, 0.3491F, 0.0F, 0.0F);
        this.setRotateAngle(backrightleg, 0.1309F, 0.0F, 0.0F);
        this.setRotateAngle(backrightleg2, 0.6981F, 0.0F, 0.0F);
        this.setRotateAngle(backrightleg3, -0.5672F, 0.0F, 0.0F);
        this.setRotateAngle(backrightleg4, 0.3054F, 0.0F, 0.0F);
        this.setRotateAngle(body2, 0.1309F, 0.0F, 0.0F);
        this.setRotateAngle(leftPlate31, -0.2342F, 0.3258F, 0.1807F);
        this.setRotateAngle(cube_r21, 0.0087F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r22, -0.0524F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r23, 0.1396F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r24, 0.5847F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r25, -0.1134F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r26, -0.6458F, 0.0F, 0.0F);
        this.setRotateAngle(rightPlate31, -0.2342F, -0.3258F, -0.1807F);
        this.setRotateAngle(cube_r27, 0.0087F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r28, -0.0524F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r29, 0.1396F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r30, 0.5847F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r31, -0.1134F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r32, -0.6458F, 0.0F, 0.0F);
        this.setRotateAngle(leftPlate9, -0.3389F, 0.3258F, 0.1807F);
        this.setRotateAngle(cube_r33, 0.0087F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r34, 0.1484F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r35, 0.3403F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r36, -0.1134F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r37, -0.4189F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r38, 1.4224F, 0.0F, 0.0F);
        this.setRotateAngle(rightPlate9, -0.3389F, -0.3258F, -0.1807F);
        this.setRotateAngle(cube_r39, 0.0087F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r40, 0.1484F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r41, 0.3403F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r42, -0.1134F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r43, -0.4189F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r44, 1.4224F, 0.0F, 0.0F);
        this.setRotateAngle(leftPlate32, -0.4125F, 0.2851F, 0.1973F);
        this.setRotateAngle(cube_r45, 0.0087F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r46, 0.1396F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r47, 0.3403F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r48, -0.1134F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r49, -0.4363F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r50, 1.3788F, 0.0F, 0.0F);
        this.setRotateAngle(rightPlate32, -0.4125F, -0.2851F, -0.1973F);
        this.setRotateAngle(cube_r51, 0.0087F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r52, 0.1396F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r53, 0.3403F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r54, -0.1134F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r55, -0.4363F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r56, 1.3788F, 0.0F, 0.0F);
        this.setRotateAngle(leftPlate8, -0.1906F, 0.3258F, 0.1807F);
        this.setRotateAngle(cube_r57, -0.0524F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r58, 0.1134F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r59, 0.5498F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r60, -0.1309F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r61, -0.6632F, 0.0F, 0.0F);
        this.setRotateAngle(rightPlate8, -0.1906F, -0.3258F, -0.1807F);
        this.setRotateAngle(cube_r62, -0.0524F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r63, 0.1134F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r64, 0.5498F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r65, -0.1309F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r66, -0.6632F, 0.0F, 0.0F);
        this.setRotateAngle(leftPlate30, -0.1033F, 0.3258F, 0.1807F);
        this.setRotateAngle(cube_r67, -0.0524F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r68, -0.0524F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r69, 0.096F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r70, 0.5498F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r71, -0.1484F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r72, -0.6458F, 0.0F, 0.0F);
        this.setRotateAngle(rightPlate30, -0.1033F, -0.3258F, -0.1807F);
        this.setRotateAngle(cube_r73, -0.0524F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r74, -0.0524F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r75, 0.096F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r76, 0.5498F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r77, -0.1484F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r78, -0.6458F, 0.0F, 0.0F);
        this.setRotateAngle(upperbody, -0.0873F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r79, 0.48F, 0.0F, 0.0F);
        this.setRotateAngle(leftPlate29, 0.0538F, 0.3258F, 0.1807F);
        this.setRotateAngle(cube_r80, 0.0349F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r81, -0.0524F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r82, 0.096F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r83, 0.5498F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r84, -0.2793F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r85, -0.6632F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r86, -0.2356F, 0.0F, 0.0F);
        this.setRotateAngle(rightPlate29, 0.0538F, -0.3258F, -0.1807F);
        this.setRotateAngle(cube_r87, 0.0349F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r88, -0.0524F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r89, 0.096F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r90, 0.5498F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r91, -0.2793F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r92, -0.6632F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r93, -0.2356F, 0.0F, 0.0F);
        this.setRotateAngle(leftPlate7, 0.1497F, 0.3258F, 0.1807F);
        this.setRotateAngle(cube_r94, 0.0349F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r95, -0.0524F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r96, 0.096F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r97, 0.5498F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r98, -0.2793F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r99, -0.6458F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r100, -0.2967F, 0.0F, 0.0F);
        this.setRotateAngle(rightPlate7, 0.1497F, -0.3258F, -0.1807F);
        this.setRotateAngle(cube_r101, 0.0349F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r102, -0.0524F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r103, 0.096F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r104, 0.5498F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r105, -0.2793F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r106, -0.6458F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r107, -0.2967F, 0.0F, 0.0F);
        this.setRotateAngle(leftPlate6, 0.1934F, 0.3258F, 0.1807F);
        this.setRotateAngle(cube_r108, -0.0524F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r109, 0.096F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r110, 0.5498F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r111, -0.3491F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r112, -0.0175F, 0.0F, 0.0F);
        this.setRotateAngle(rightPlate6, 0.1934F, -0.3258F, -0.1807F);
        this.setRotateAngle(cube_r113, -0.0524F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r114, 0.096F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r115, 0.5498F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r116, -0.3491F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r117, -0.0175F, 0.0F, 0.0F);
        this.setRotateAngle(leftPlate28, 0.3587F, 0.3628F, 0.2583F);
        this.setRotateAngle(cube_r118, 0.1745F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r119, -0.192F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r120, 0.096F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r121, -1.0297F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r122, 0.5498F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r123, -0.3491F, 0.0F, 0.0F);
        this.setRotateAngle(rightPlate28, 0.3587F, -0.3628F, -0.2583F);
        this.setRotateAngle(cube_r124, 0.1745F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r125, -0.192F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r126, 0.096F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r127, -1.0297F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r128, 0.5498F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r129, -0.3491F, 0.0F, 0.0F);
        this.setRotateAngle(neck4, -0.0852F, -0.3051F, -0.0138F);
        this.setRotateAngle(cube_r130, 0.4363F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r131, 0.192F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r132, 0.0873F, 0.0F, 0.0F);
        this.setRotateAngle(leftPlate3, 0.277F, 0.3798F, 0.2493F);
        this.setRotateAngle(cube_r133, 0.3142F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r134, -0.2967F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r135, 2.0769F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r136, 0.5498F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r137, -0.3491F, 0.0F, 0.0F);
        this.setRotateAngle(rightPlate3, 0.277F, -0.3798F, -0.2493F);
        this.setRotateAngle(cube_r138, 0.3142F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r139, -0.2967F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r140, 2.0769F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r141, 0.5498F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r142, -0.3491F, 0.0F, 0.0F);
        this.setRotateAngle(leftPlate25, 0.2307F, 0.3809F, 0.2412F);
        this.setRotateAngle(cube_r143, 0.3142F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r144, -0.2967F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r145, -0.8465F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r146, 0.5498F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r147, -0.3491F, 0.0F, 0.0F);
        this.setRotateAngle(rightPlate25, 0.2307F, -0.3809F, -0.2412F);
        this.setRotateAngle(cube_r148, 0.3142F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r149, -0.2967F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r150, -0.8465F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r151, 0.5498F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r152, -0.3491F, 0.0F, 0.0F);
        this.setRotateAngle(leftPlate4, 0.1974F, 0.4443F, 0.2922F);
        this.setRotateAngle(cube_r153, 0.3142F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r154, -0.2967F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r155, 0.5585F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r156, 0.5498F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r157, -0.3491F, 0.0F, 0.0F);
        this.setRotateAngle(rightPlate4, 0.1974F, -0.4443F, -0.2922F);
        this.setRotateAngle(cube_r158, 0.3142F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r159, -0.2967F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r160, 0.5585F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r161, 0.5498F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r162, -0.3491F, 0.0F, 0.0F);
        this.setRotateAngle(leftPlate26, 0.372F, 0.4443F, 0.2922F);
        this.setRotateAngle(cube_r163, 0.3142F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r164, -0.2967F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r165, 0.5061F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r166, 0.5498F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r167, -0.3491F, 0.0F, 0.0F);
        this.setRotateAngle(rightPlate26, 0.372F, -0.4443F, -0.2922F);
        this.setRotateAngle(cube_r168, 0.3142F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r169, -0.2967F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r170, 0.5061F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r171, 0.5498F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r172, -0.3491F, 0.0F, 0.0F);
        this.setRotateAngle(leftPlate27, 0.372F, 0.4443F, 0.2922F);
        this.setRotateAngle(cube_r173, 0.3142F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r174, -0.1222F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r175, 0.5411F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r176, 0.5498F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r177, -0.3491F, 0.0F, 0.0F);
        this.setRotateAngle(rightPlate27, 0.372F, -0.4443F, -0.2922F);
        this.setRotateAngle(cube_r178, 0.3142F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r179, -0.1222F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r180, 0.5411F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r181, 0.5498F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r182, -0.3491F, 0.0F, 0.0F);
        this.setRotateAngle(leftPlate5, 0.372F, 0.4443F, 0.2922F);
        this.setRotateAngle(cube_r183, 0.1745F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r184, -0.1222F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r185, 0.5498F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r186, 0.5498F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r187, -0.3491F, 0.0F, 0.0F);
        this.setRotateAngle(rightPlate5, 0.372F, -0.4443F, -0.2922F);
        this.setRotateAngle(cube_r188, 0.1745F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r189, -0.1222F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r190, 0.5498F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r191, 0.5498F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r192, -0.3491F, 0.0F, 0.0F);
        this.setRotateAngle(neck3, -0.3667F, -0.4293F, 0.0808F);
        this.setRotateAngle(leftPlate18, 0.1142F, 0.2941F, 0.2322F);
        this.setRotateAngle(cube_r193, 0.3142F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r194, -0.2967F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r195, 0.3316F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r196, -0.3491F, 0.0F, 0.0F);
        this.setRotateAngle(rightPlate18, 0.1142F, -0.2941F, -0.2322F);
        this.setRotateAngle(cube_r197, 0.3142F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r198, -0.2967F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r199, 0.3316F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r200, -0.3491F, 0.0F, 0.0F);
        this.setRotateAngle(leftPlate2, 0.1142F, 0.2941F, 0.2322F);
        this.setRotateAngle(cube_r201, 0.3142F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r202, -0.2967F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r203, 0.3316F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r204, -0.3491F, 0.0F, 0.0F);
        this.setRotateAngle(rightPlate2, 0.1142F, -0.2941F, -0.2322F);
        this.setRotateAngle(cube_r205, 0.3142F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r206, -0.2967F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r207, 0.3316F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r208, -0.3491F, 0.0F, 0.0F);
        this.setRotateAngle(leftPlate24, 0.0532F, 0.2941F, 0.2322F);
        this.setRotateAngle(cube_r209, 0.3142F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r210, -0.2967F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r211, 0.5498F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r212, -0.3491F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r213, -0.7592F, 0.0F, 0.0F);
        this.setRotateAngle(rightPlate24, 0.0532F, -0.2941F, -0.2322F);
        this.setRotateAngle(cube_r214, 0.3142F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r215, -0.2967F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r216, 0.5498F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r217, -0.3491F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r218, -0.7592F, 0.0F, 0.0F);
        this.setRotateAngle(neck2, -0.1595F, -0.3232F, -0.0752F);
        this.setRotateAngle(cube_r219, 0.0873F, 0.0F, 0.0F);
        this.setRotateAngle(leftPlate23, 0.0793F, 0.2941F, 0.2322F);
        this.setRotateAngle(cube_r220, 0.3142F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r221, -0.2967F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r222, 0.3316F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r223, -0.3491F, 0.0F, 0.0F);
        this.setRotateAngle(rightPlate23, 0.0793F, -0.2941F, -0.2322F);
        this.setRotateAngle(cube_r224, 0.3142F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r225, -0.2967F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r226, 0.3316F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r227, -0.3491F, 0.0F, 0.0F);
        this.setRotateAngle(leftPlate22, 0.0793F, 0.2941F, 0.2322F);
        this.setRotateAngle(cube_r228, 0.3142F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r229, -0.2967F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r230, 0.3316F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r231, -0.3491F, 0.0F, 0.0F);
        this.setRotateAngle(rightPlate22, 0.0793F, -0.2941F, -0.2322F);
        this.setRotateAngle(cube_r232, 0.3142F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r233, -0.2967F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r234, 0.3316F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r235, -0.3491F, 0.0F, 0.0F);
        this.setRotateAngle(leftPlate21, 0.067F, 0.3408F, 0.1897F);
        this.setRotateAngle(cube_r236, 0.3142F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r237, -0.2967F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r238, 0.3316F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r239, -0.3491F, 0.0F, 0.0F);
        this.setRotateAngle(rightPlate21, 0.067F, -0.3408F, -0.1897F);
        this.setRotateAngle(cube_r240, 0.3142F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r241, -0.2967F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r242, 0.3316F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r243, -0.3491F, 0.0F, 0.0F);
        this.setRotateAngle(leftPlate19, 0.0646F, 0.2102F, 0.1808F);
        this.setRotateAngle(cube_r244, 0.3142F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r245, -0.2967F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r246, 0.3316F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r247, -0.3491F, 0.0F, 0.0F);
        this.setRotateAngle(rightPlate19, 0.0646F, -0.2102F, -0.1808F);
        this.setRotateAngle(cube_r248, 0.3142F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r249, -0.2967F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r250, 0.3316F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r251, -0.3491F, 0.0F, 0.0F);
        this.setRotateAngle(neck, 0.4476F, -0.2457F, -0.0914F);
        this.setRotateAngle(cube_r252, -0.0262F, 0.0F, 0.0F);
        this.setRotateAngle(head, -0.151F, -0.2626F, -0.3035F);
        this.setRotateAngle(cube_r253, 0.2356F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r254, 0.2531F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r255, 0.3229F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r256, 0.0873F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r257, 0.0F, -0.0873F, 0.0F);
        this.setRotateAngle(cube_r258, 0.0F, 0.0873F, 0.0F);
        this.setRotateAngle(cube_r259, 0.0F, 0.0F, 1.3963F);
        this.setRotateAngle(cube_r260, 0.0F, 0.0F, -1.3963F);
        this.setRotateAngle(jaw, 0.3927F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r261, 0.0436F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r262, 0.0436F, -0.0436F, 0.0019F);
        this.setRotateAngle(cube_r263, 0.0436F, 0.0436F, -0.0019F);
        this.setRotateAngle(cube_r264, -0.0436F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r265, -0.4363F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r266, -0.1484F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r267, -0.3403F, 0.0F, 0.0F);
        this.setRotateAngle(leftPlate20, 0.0F, 0.3491F, 0.0F);
        this.setRotateAngle(cube_r268, -0.2618F, 0.0F, 0.0F);
        this.setRotateAngle(rightPlate20, 0.0F, -0.3491F, 0.0F);
        this.setRotateAngle(cube_r269, -0.2618F, 0.0F, 0.0F);
        this.setRotateAngle(leftPlate17, 0.0F, 0.2182F, 0.0F);
        this.setRotateAngle(rightPlate17, 0.0F, -0.2182F, 0.0F);
        this.setRotateAngle(leftPlate1, 0.0886F, 0.2178F, 0.0078F);
        this.setRotateAngle(rightPlate1, 0.0886F, -0.2178F, -0.0078F);
        this.setRotateAngle(frontleftleg, 0.9163F, 0.0F, -0.2618F);
        this.setRotateAngle(frontleftleg2, -1.2086F, 0.1096F, 0.2382F);
        this.setRotateAngle(frontleftleg3, 0.7418F, 0.0873F, 0.0F);
        this.setRotateAngle(frontrightleg, 0.5236F, 0.0F, 0.2618F);
        this.setRotateAngle(frontrightleg2, -0.5977F, -0.1096F, -0.2382F);
        this.setRotateAngle(frontrightleg3, 0.1745F, -0.0873F, 0.0F);
        this.setRotateAngle(tail, 0.0475F, 0.346F, 0.1392F);
        this.setRotateAngle(leftPlate34, -0.398F, 0.2298F, 0.184F);
        this.setRotateAngle(cube_r270, -0.0524F, 0.0F, 0.0F);
        this.setRotateAngle(rightPlate34, -0.398F, -0.2298F, -0.184F);
        this.setRotateAngle(cube_r271, -0.0524F, 0.0F, 0.0F);
        this.setRotateAngle(leftPlate11, -0.4907F, 0.2411F, 0.1981F);
        this.setRotateAngle(cube_r272, -0.0524F, 0.0F, 0.0F);
        this.setRotateAngle(rightPlate11, -0.4907F, -0.2411F, -0.1981F);
        this.setRotateAngle(cube_r273, -0.0524F, 0.0F, 0.0F);
        this.setRotateAngle(tail2, -0.0915F, 0.3042F, -0.0275F);
        this.setRotateAngle(leftPlate35, -0.5147F, 0.2424F, 0.2076F);
        this.setRotateAngle(cube_r274, -0.0524F, 0.0F, 0.0F);
        this.setRotateAngle(rightPlate35, -0.5147F, -0.2424F, -0.2076F);
        this.setRotateAngle(cube_r275, -0.0524F, 0.0F, 0.0F);
        this.setRotateAngle(leftPlate36, -0.5576F, 0.2393F, 0.2099F);
        this.setRotateAngle(cube_r276, -0.0873F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r277, -0.0349F, 0.0F, 0.0F);
        this.setRotateAngle(rightPlate36, -0.5576F, -0.2393F, -0.2099F);
        this.setRotateAngle(cube_r278, -0.0873F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r279, -0.0349F, 0.0F, 0.0F);
        this.setRotateAngle(tail3, -0.0498F, 0.3135F, 0.1096F);
        this.setRotateAngle(leftPlate13, -0.486F, 0.3691F, 0.4147F);
        this.setRotateAngle(cube_r280, -0.0349F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r281, -0.0873F, 0.0F, 0.0F);
        this.setRotateAngle(rightPlate13, -0.486F, -0.3691F, -0.4147F);
        this.setRotateAngle(cube_r282, -0.0349F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r283, -0.0873F, 0.0F, 0.0F);
        this.setRotateAngle(leftPlate37, -0.4849F, 0.3225F, 0.315F);
        this.setRotateAngle(cube_r284, -0.0175F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r285, -0.0873F, 0.0F, 0.0F);
        this.setRotateAngle(rightPlate37, -0.4849F, -0.3225F, -0.315F);
        this.setRotateAngle(cube_r286, -0.0175F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r287, -0.0873F, 0.0F, 0.0F);
        this.setRotateAngle(leftPlate12, -0.5085F, 0.2678F, 0.2331F);
        this.setRotateAngle(cube_r288, -0.0175F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r289, -0.0873F, 0.0F, 0.0F);
        this.setRotateAngle(rightPlate12, -0.5085F, -0.2678F, -0.2331F);
        this.setRotateAngle(cube_r290, -0.0175F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r291, -0.0873F, 0.0F, 0.0F);
        this.setRotateAngle(tail4, -0.1372F, 0.3027F, -0.0411F);
        this.setRotateAngle(leftPlate15, -0.3095F, 0.4477F, 0.616F);
        this.setRotateAngle(cube_r292, -0.0873F, 0.0F, 0.0F);
        this.setRotateAngle(rightPlate15, -0.3095F, -0.4477F, -0.616F);
        this.setRotateAngle(cube_r293, -0.0873F, 0.0F, 0.0F);
        this.setRotateAngle(leftPlate14, -0.3062F, 0.2456F, 0.5768F);
        this.setRotateAngle(cube_r294, -0.0175F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r295, -0.0873F, 0.0F, 0.0F);
        this.setRotateAngle(rightPlate14, -0.3062F, -0.2456F, -0.5768F);
        this.setRotateAngle(cube_r296, -0.0175F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r297, -0.0873F, 0.0F, 0.0F);
        this.setRotateAngle(tail5, -0.0928F, 0.3477F, -0.0317F);
        this.setRotateAngle(leftPlate16, -0.1998F, 0.4857F, 0.705F);
        this.setRotateAngle(cube_r298, -0.0436F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r299, -0.0873F, 0.0F, 0.0F);
        this.setRotateAngle(rightPlate16, -0.1998F, -0.4857F, -0.705F);
        this.setRotateAngle(cube_r300, -0.0436F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r301, -0.0873F, 0.0F, 0.0F);
        this.setRotateAngle(lefttailSpike, -0.0432F, -0.0152F, 1.0025F);
        this.setRotateAngle(babyskewer_r1, -0.624F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r302, -0.5629F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r303, -0.6545F, 0.0F, 0.0F);
        this.setRotateAngle(righttailSpike, -0.0432F, 0.0152F, -1.0025F);
        this.setRotateAngle(babyskewer_r2, -0.624F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r304, -0.5629F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r305, -0.6545F, 0.0F, 0.0F);
        this.setRotateAngle(tail6, -0.2778F, 0.3367F, -0.0939F);
        this.setRotateAngle(lefttailSpike2, -0.2863F, 0.0036F, 1.0995F);
        this.setRotateAngle(babyskewer_r3, -0.624F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r306, -0.5629F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r307, -0.6545F, 0.0F, 0.0F);
        this.setRotateAngle(righttailSpike2, -0.2863F, -0.0036F, -1.0995F);
        this.setRotateAngle(babyskewer_r4, -0.624F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r308, -0.5629F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r309, -0.6545F, 0.0F, 0.0F);
        //End of pose, now render the model:
        this.main.render(f);
        //Reset rotations, positions and sizing:
        this.main.setScale(1.0F, 1.0F, 1.0F);
        this.main.scaleChildren = false;
        resetToDefaultPose();
    }

    public void renderStaticFloor(float f) {
        this.setRotateAngle(body, -0.1309F, 0.0F, 0.0F);
        this.setRotateAngle(leftPlate10, -0.2965F, 0.2424F, 0.2076F);
        this.setRotateAngle(cube_r1, 0.0087F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r2, 0.096F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r3, 0.1309F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r4, -0.1134F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r5, -0.0698F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r6, -0.2793F, 0.0F, 0.0F);
        this.setRotateAngle(rightPlate10, -0.2965F, -0.2424F, -0.2076F);
        this.setRotateAngle(cube_r7, 0.0087F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r8, 0.096F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r9, 0.1309F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r10, -0.1134F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r11, -0.0698F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r12, -0.2793F, 0.0F, 0.0F);
        this.setRotateAngle(leftPlate33, -0.3896F, 0.2325F, 0.1827F);
        this.setRotateAngle(cube_r13, 0.0087F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r14, 0.1309F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r15, -0.096F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r16, 0.0087F, 0.0F, 0.0F);
        this.setRotateAngle(rightPlate33, -0.3896F, -0.2325F, -0.1827F);
        this.setRotateAngle(cube_r17, 0.0087F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r18, 0.1309F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r19, -0.096F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r20, 0.0087F, 0.0F, 0.0F);
        this.setRotateAngle(backleftleg, -0.1745F, 0.0F, 0.0F);
        this.setRotateAngle(backleftleg2, 0.5236F, 0.0F, 0.0F);
        this.setRotateAngle(backleftleg3, -0.5672F, 0.0F, 0.0F);
        this.setRotateAngle(backleftleg4, 0.3491F, 0.0F, 0.0F);
        this.setRotateAngle(backrightleg, 0.1309F, 0.0F, 0.0F);
        this.setRotateAngle(backrightleg2, 0.6981F, 0.0F, 0.0F);
        this.setRotateAngle(backrightleg3, -0.5672F, 0.0F, 0.0F);
        this.setRotateAngle(backrightleg4, 0.3054F, 0.0F, 0.0F);
        this.setRotateAngle(body2, 0.1309F, 0.0F, 0.0F);
        this.setRotateAngle(leftPlate31, -0.2342F, 0.3258F, 0.1807F);
        this.setRotateAngle(cube_r21, 0.0087F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r22, -0.0524F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r23, 0.1396F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r24, 0.5847F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r25, -0.1134F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r26, -0.6458F, 0.0F, 0.0F);
        this.setRotateAngle(rightPlate31, -0.2342F, -0.3258F, -0.1807F);
        this.setRotateAngle(cube_r27, 0.0087F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r28, -0.0524F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r29, 0.1396F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r30, 0.5847F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r31, -0.1134F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r32, -0.6458F, 0.0F, 0.0F);
        this.setRotateAngle(leftPlate9, -0.3389F, 0.3258F, 0.1807F);
        this.setRotateAngle(cube_r33, 0.0087F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r34, 0.1484F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r35, 0.3403F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r36, -0.1134F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r37, -0.4189F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r38, 1.4224F, 0.0F, 0.0F);
        this.setRotateAngle(rightPlate9, -0.3389F, -0.3258F, -0.1807F);
        this.setRotateAngle(cube_r39, 0.0087F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r40, 0.1484F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r41, 0.3403F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r42, -0.1134F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r43, -0.4189F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r44, 1.4224F, 0.0F, 0.0F);
        this.setRotateAngle(leftPlate32, -0.4125F, 0.2851F, 0.1973F);
        this.setRotateAngle(cube_r45, 0.0087F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r46, 0.1396F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r47, 0.3403F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r48, -0.1134F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r49, -0.4363F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r50, 1.3788F, 0.0F, 0.0F);
        this.setRotateAngle(rightPlate32, -0.4125F, -0.2851F, -0.1973F);
        this.setRotateAngle(cube_r51, 0.0087F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r52, 0.1396F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r53, 0.3403F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r54, -0.1134F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r55, -0.4363F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r56, 1.3788F, 0.0F, 0.0F);
        this.setRotateAngle(leftPlate8, -0.1906F, 0.3258F, 0.1807F);
        this.setRotateAngle(cube_r57, -0.0524F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r58, 0.1134F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r59, 0.5498F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r60, -0.1309F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r61, -0.6632F, 0.0F, 0.0F);
        this.setRotateAngle(rightPlate8, -0.1906F, -0.3258F, -0.1807F);
        this.setRotateAngle(cube_r62, -0.0524F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r63, 0.1134F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r64, 0.5498F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r65, -0.1309F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r66, -0.6632F, 0.0F, 0.0F);
        this.setRotateAngle(leftPlate30, -0.1033F, 0.3258F, 0.1807F);
        this.setRotateAngle(cube_r67, -0.0524F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r68, -0.0524F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r69, 0.096F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r70, 0.5498F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r71, -0.1484F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r72, -0.6458F, 0.0F, 0.0F);
        this.setRotateAngle(rightPlate30, -0.1033F, -0.3258F, -0.1807F);
        this.setRotateAngle(cube_r73, -0.0524F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r74, -0.0524F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r75, 0.096F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r76, 0.5498F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r77, -0.1484F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r78, -0.6458F, 0.0F, 0.0F);
        this.setRotateAngle(upperbody, -0.0873F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r79, 0.48F, 0.0F, 0.0F);
        this.setRotateAngle(leftPlate29, 0.0538F, 0.3258F, 0.1807F);
        this.setRotateAngle(cube_r80, 0.0349F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r81, -0.0524F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r82, 0.096F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r83, 0.5498F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r84, -0.2793F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r85, -0.6632F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r86, -0.2356F, 0.0F, 0.0F);
        this.setRotateAngle(rightPlate29, 0.0538F, -0.3258F, -0.1807F);
        this.setRotateAngle(cube_r87, 0.0349F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r88, -0.0524F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r89, 0.096F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r90, 0.5498F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r91, -0.2793F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r92, -0.6632F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r93, -0.2356F, 0.0F, 0.0F);
        this.setRotateAngle(leftPlate7, 0.1497F, 0.3258F, 0.1807F);
        this.setRotateAngle(cube_r94, 0.0349F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r95, -0.0524F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r96, 0.096F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r97, 0.5498F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r98, -0.2793F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r99, -0.6458F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r100, -0.2967F, 0.0F, 0.0F);
        this.setRotateAngle(rightPlate7, 0.1497F, -0.3258F, -0.1807F);
        this.setRotateAngle(cube_r101, 0.0349F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r102, -0.0524F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r103, 0.096F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r104, 0.5498F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r105, -0.2793F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r106, -0.6458F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r107, -0.2967F, 0.0F, 0.0F);
        this.setRotateAngle(leftPlate6, 0.1934F, 0.3258F, 0.1807F);
        this.setRotateAngle(cube_r108, -0.0524F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r109, 0.096F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r110, 0.5498F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r111, -0.3491F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r112, -0.0175F, 0.0F, 0.0F);
        this.setRotateAngle(rightPlate6, 0.1934F, -0.3258F, -0.1807F);
        this.setRotateAngle(cube_r113, -0.0524F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r114, 0.096F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r115, 0.5498F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r116, -0.3491F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r117, -0.0175F, 0.0F, 0.0F);
        this.setRotateAngle(leftPlate28, 0.3587F, 0.3628F, 0.2583F);
        this.setRotateAngle(cube_r118, 0.1745F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r119, -0.192F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r120, 0.096F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r121, -1.0297F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r122, 0.5498F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r123, -0.3491F, 0.0F, 0.0F);
        this.setRotateAngle(rightPlate28, 0.3587F, -0.3628F, -0.2583F);
        this.setRotateAngle(cube_r124, 0.1745F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r125, -0.192F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r126, 0.096F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r127, -1.0297F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r128, 0.5498F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r129, -0.3491F, 0.0F, 0.0F);
        this.setRotateAngle(neck4, -0.0852F, -0.3051F, -0.0138F);
        this.setRotateAngle(cube_r130, 0.4363F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r131, 0.192F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r132, 0.0873F, 0.0F, 0.0F);
        this.setRotateAngle(leftPlate3, 0.277F, 0.3798F, 0.2493F);
        this.setRotateAngle(cube_r133, 0.3142F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r134, -0.2967F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r135, 2.0769F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r136, 0.5498F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r137, -0.3491F, 0.0F, 0.0F);
        this.setRotateAngle(rightPlate3, 0.277F, -0.3798F, -0.2493F);
        this.setRotateAngle(cube_r138, 0.3142F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r139, -0.2967F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r140, 2.0769F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r141, 0.5498F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r142, -0.3491F, 0.0F, 0.0F);
        this.setRotateAngle(leftPlate25, 0.2307F, 0.3809F, 0.2412F);
        this.setRotateAngle(cube_r143, 0.3142F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r144, -0.2967F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r145, -0.8465F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r146, 0.5498F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r147, -0.3491F, 0.0F, 0.0F);
        this.setRotateAngle(rightPlate25, 0.2307F, -0.3809F, -0.2412F);
        this.setRotateAngle(cube_r148, 0.3142F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r149, -0.2967F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r150, -0.8465F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r151, 0.5498F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r152, -0.3491F, 0.0F, 0.0F);
        this.setRotateAngle(leftPlate4, 0.1974F, 0.4443F, 0.2922F);
        this.setRotateAngle(cube_r153, 0.3142F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r154, -0.2967F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r155, 0.5585F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r156, 0.5498F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r157, -0.3491F, 0.0F, 0.0F);
        this.setRotateAngle(rightPlate4, 0.1974F, -0.4443F, -0.2922F);
        this.setRotateAngle(cube_r158, 0.3142F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r159, -0.2967F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r160, 0.5585F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r161, 0.5498F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r162, -0.3491F, 0.0F, 0.0F);
        this.setRotateAngle(leftPlate26, 0.372F, 0.4443F, 0.2922F);
        this.setRotateAngle(cube_r163, 0.3142F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r164, -0.2967F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r165, 0.5061F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r166, 0.5498F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r167, -0.3491F, 0.0F, 0.0F);
        this.setRotateAngle(rightPlate26, 0.372F, -0.4443F, -0.2922F);
        this.setRotateAngle(cube_r168, 0.3142F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r169, -0.2967F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r170, 0.5061F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r171, 0.5498F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r172, -0.3491F, 0.0F, 0.0F);
        this.setRotateAngle(leftPlate27, 0.372F, 0.4443F, 0.2922F);
        this.setRotateAngle(cube_r173, 0.3142F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r174, -0.1222F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r175, 0.5411F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r176, 0.5498F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r177, -0.3491F, 0.0F, 0.0F);
        this.setRotateAngle(rightPlate27, 0.372F, -0.4443F, -0.2922F);
        this.setRotateAngle(cube_r178, 0.3142F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r179, -0.1222F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r180, 0.5411F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r181, 0.5498F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r182, -0.3491F, 0.0F, 0.0F);
        this.setRotateAngle(leftPlate5, 0.372F, 0.4443F, 0.2922F);
        this.setRotateAngle(cube_r183, 0.1745F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r184, -0.1222F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r185, 0.5498F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r186, 0.5498F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r187, -0.3491F, 0.0F, 0.0F);
        this.setRotateAngle(rightPlate5, 0.372F, -0.4443F, -0.2922F);
        this.setRotateAngle(cube_r188, 0.1745F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r189, -0.1222F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r190, 0.5498F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r191, 0.5498F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r192, -0.3491F, 0.0F, 0.0F);
        this.setRotateAngle(neck3, -0.3667F, -0.4293F, 0.0808F);
        this.setRotateAngle(leftPlate18, 0.1142F, 0.2941F, 0.2322F);
        this.setRotateAngle(cube_r193, 0.3142F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r194, -0.2967F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r195, 0.3316F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r196, -0.3491F, 0.0F, 0.0F);
        this.setRotateAngle(rightPlate18, 0.1142F, -0.2941F, -0.2322F);
        this.setRotateAngle(cube_r197, 0.3142F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r198, -0.2967F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r199, 0.3316F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r200, -0.3491F, 0.0F, 0.0F);
        this.setRotateAngle(leftPlate2, 0.1142F, 0.2941F, 0.2322F);
        this.setRotateAngle(cube_r201, 0.3142F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r202, -0.2967F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r203, 0.3316F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r204, -0.3491F, 0.0F, 0.0F);
        this.setRotateAngle(rightPlate2, 0.1142F, -0.2941F, -0.2322F);
        this.setRotateAngle(cube_r205, 0.3142F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r206, -0.2967F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r207, 0.3316F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r208, -0.3491F, 0.0F, 0.0F);
        this.setRotateAngle(leftPlate24, 0.0532F, 0.2941F, 0.2322F);
        this.setRotateAngle(cube_r209, 0.3142F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r210, -0.2967F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r211, 0.5498F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r212, -0.3491F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r213, -0.7592F, 0.0F, 0.0F);
        this.setRotateAngle(rightPlate24, 0.0532F, -0.2941F, -0.2322F);
        this.setRotateAngle(cube_r214, 0.3142F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r215, -0.2967F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r216, 0.5498F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r217, -0.3491F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r218, -0.7592F, 0.0F, 0.0F);
        this.setRotateAngle(neck2, -0.1595F, -0.3232F, -0.0752F);
        this.setRotateAngle(cube_r219, 0.0873F, 0.0F, 0.0F);
        this.setRotateAngle(leftPlate23, 0.0793F, 0.2941F, 0.2322F);
        this.setRotateAngle(cube_r220, 0.3142F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r221, -0.2967F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r222, 0.3316F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r223, -0.3491F, 0.0F, 0.0F);
        this.setRotateAngle(rightPlate23, 0.0793F, -0.2941F, -0.2322F);
        this.setRotateAngle(cube_r224, 0.3142F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r225, -0.2967F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r226, 0.3316F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r227, -0.3491F, 0.0F, 0.0F);
        this.setRotateAngle(leftPlate22, 0.0793F, 0.2941F, 0.2322F);
        this.setRotateAngle(cube_r228, 0.3142F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r229, -0.2967F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r230, 0.3316F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r231, -0.3491F, 0.0F, 0.0F);
        this.setRotateAngle(rightPlate22, 0.0793F, -0.2941F, -0.2322F);
        this.setRotateAngle(cube_r232, 0.3142F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r233, -0.2967F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r234, 0.3316F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r235, -0.3491F, 0.0F, 0.0F);
        this.setRotateAngle(leftPlate21, 0.067F, 0.3408F, 0.1897F);
        this.setRotateAngle(cube_r236, 0.3142F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r237, -0.2967F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r238, 0.3316F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r239, -0.3491F, 0.0F, 0.0F);
        this.setRotateAngle(rightPlate21, 0.067F, -0.3408F, -0.1897F);
        this.setRotateAngle(cube_r240, 0.3142F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r241, -0.2967F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r242, 0.3316F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r243, -0.3491F, 0.0F, 0.0F);
        this.setRotateAngle(leftPlate19, 0.0646F, 0.2102F, 0.1808F);
        this.setRotateAngle(cube_r244, 0.3142F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r245, -0.2967F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r246, 0.3316F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r247, -0.3491F, 0.0F, 0.0F);
        this.setRotateAngle(rightPlate19, 0.0646F, -0.2102F, -0.1808F);
        this.setRotateAngle(cube_r248, 0.3142F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r249, -0.2967F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r250, 0.3316F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r251, -0.3491F, 0.0F, 0.0F);
        this.setRotateAngle(neck, 0.4476F, -0.2457F, -0.0914F);
        this.setRotateAngle(cube_r252, -0.0262F, 0.0F, 0.0F);
        this.setRotateAngle(head, -0.151F, -0.2626F, -0.3035F);
        this.setRotateAngle(cube_r253, 0.2356F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r254, 0.2531F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r255, 0.3229F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r256, 0.0873F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r257, 0.0F, -0.0873F, 0.0F);
        this.setRotateAngle(cube_r258, 0.0F, 0.0873F, 0.0F);
        this.setRotateAngle(cube_r259, 0.0F, 0.0F, 1.3963F);
        this.setRotateAngle(cube_r260, 0.0F, 0.0F, -1.3963F);
        this.setRotateAngle(jaw, 0.3927F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r261, 0.0436F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r262, 0.0436F, -0.0436F, 0.0019F);
        this.setRotateAngle(cube_r263, 0.0436F, 0.0436F, -0.0019F);
        this.setRotateAngle(cube_r264, -0.0436F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r265, -0.4363F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r266, -0.1484F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r267, -0.3403F, 0.0F, 0.0F);
        this.setRotateAngle(leftPlate20, 0.0F, 0.3491F, 0.0F);
        this.setRotateAngle(cube_r268, -0.2618F, 0.0F, 0.0F);
        this.setRotateAngle(rightPlate20, 0.0F, -0.3491F, 0.0F);
        this.setRotateAngle(cube_r269, -0.2618F, 0.0F, 0.0F);
        this.setRotateAngle(leftPlate17, 0.0F, 0.2182F, 0.0F);
        this.setRotateAngle(rightPlate17, 0.0F, -0.2182F, 0.0F);
        this.setRotateAngle(leftPlate1, 0.0886F, 0.2178F, 0.0078F);
        this.setRotateAngle(rightPlate1, 0.0886F, -0.2178F, -0.0078F);
        this.setRotateAngle(frontleftleg, 0.9163F, 0.0F, -0.2618F);
        this.setRotateAngle(frontleftleg2, -1.2086F, 0.1096F, 0.2382F);
        this.setRotateAngle(frontleftleg3, 0.7418F, 0.0873F, 0.0F);
        this.setRotateAngle(frontrightleg, 0.5236F, 0.0F, 0.2618F);
        this.setRotateAngle(frontrightleg2, -0.5977F, -0.1096F, -0.2382F);
        this.setRotateAngle(frontrightleg3, 0.1745F, -0.0873F, 0.0F);
        this.setRotateAngle(tail, 0.0475F, 0.346F, 0.1392F);
        this.setRotateAngle(leftPlate34, -0.398F, 0.2298F, 0.184F);
        this.setRotateAngle(cube_r270, -0.0524F, 0.0F, 0.0F);
        this.setRotateAngle(rightPlate34, -0.398F, -0.2298F, -0.184F);
        this.setRotateAngle(cube_r271, -0.0524F, 0.0F, 0.0F);
        this.setRotateAngle(leftPlate11, -0.4907F, 0.2411F, 0.1981F);
        this.setRotateAngle(cube_r272, -0.0524F, 0.0F, 0.0F);
        this.setRotateAngle(rightPlate11, -0.4907F, -0.2411F, -0.1981F);
        this.setRotateAngle(cube_r273, -0.0524F, 0.0F, 0.0F);
        this.setRotateAngle(tail2, -0.0915F, 0.3042F, -0.0275F);
        this.setRotateAngle(leftPlate35, -0.5147F, 0.2424F, 0.2076F);
        this.setRotateAngle(cube_r274, -0.0524F, 0.0F, 0.0F);
        this.setRotateAngle(rightPlate35, -0.5147F, -0.2424F, -0.2076F);
        this.setRotateAngle(cube_r275, -0.0524F, 0.0F, 0.0F);
        this.setRotateAngle(leftPlate36, -0.5576F, 0.2393F, 0.2099F);
        this.setRotateAngle(cube_r276, -0.0873F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r277, -0.0349F, 0.0F, 0.0F);
        this.setRotateAngle(rightPlate36, -0.5576F, -0.2393F, -0.2099F);
        this.setRotateAngle(cube_r278, -0.0873F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r279, -0.0349F, 0.0F, 0.0F);
        this.setRotateAngle(tail3, -0.0498F, 0.3135F, 0.1096F);
        this.setRotateAngle(leftPlate13, -0.486F, 0.3691F, 0.4147F);
        this.setRotateAngle(cube_r280, -0.0349F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r281, -0.0873F, 0.0F, 0.0F);
        this.setRotateAngle(rightPlate13, -0.486F, -0.3691F, -0.4147F);
        this.setRotateAngle(cube_r282, -0.0349F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r283, -0.0873F, 0.0F, 0.0F);
        this.setRotateAngle(leftPlate37, -0.4849F, 0.3225F, 0.315F);
        this.setRotateAngle(cube_r284, -0.0175F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r285, -0.0873F, 0.0F, 0.0F);
        this.setRotateAngle(rightPlate37, -0.4849F, -0.3225F, -0.315F);
        this.setRotateAngle(cube_r286, -0.0175F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r287, -0.0873F, 0.0F, 0.0F);
        this.setRotateAngle(leftPlate12, -0.5085F, 0.2678F, 0.2331F);
        this.setRotateAngle(cube_r288, -0.0175F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r289, -0.0873F, 0.0F, 0.0F);
        this.setRotateAngle(rightPlate12, -0.5085F, -0.2678F, -0.2331F);
        this.setRotateAngle(cube_r290, -0.0175F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r291, -0.0873F, 0.0F, 0.0F);
        this.setRotateAngle(tail4, -0.1372F, 0.3027F, -0.0411F);
        this.setRotateAngle(leftPlate15, -0.3095F, 0.4477F, 0.616F);
        this.setRotateAngle(cube_r292, -0.0873F, 0.0F, 0.0F);
        this.setRotateAngle(rightPlate15, -0.3095F, -0.4477F, -0.616F);
        this.setRotateAngle(cube_r293, -0.0873F, 0.0F, 0.0F);
        this.setRotateAngle(leftPlate14, -0.3062F, 0.2456F, 0.5768F);
        this.setRotateAngle(cube_r294, -0.0175F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r295, -0.0873F, 0.0F, 0.0F);
        this.setRotateAngle(rightPlate14, -0.3062F, -0.2456F, -0.5768F);
        this.setRotateAngle(cube_r296, -0.0175F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r297, -0.0873F, 0.0F, 0.0F);
        this.setRotateAngle(tail5, -0.0928F, 0.3477F, -0.0317F);
        this.setRotateAngle(leftPlate16, -0.1998F, 0.4857F, 0.705F);
        this.setRotateAngle(cube_r298, -0.0436F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r299, -0.0873F, 0.0F, 0.0F);
        this.setRotateAngle(rightPlate16, -0.1998F, -0.4857F, -0.705F);
        this.setRotateAngle(cube_r300, -0.0436F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r301, -0.0873F, 0.0F, 0.0F);
        this.setRotateAngle(lefttailSpike, -0.0432F, -0.0152F, 1.0025F);
        this.setRotateAngle(babyskewer_r1, -0.624F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r302, -0.5629F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r303, -0.6545F, 0.0F, 0.0F);
        this.setRotateAngle(righttailSpike, -0.0432F, 0.0152F, -1.0025F);
        this.setRotateAngle(babyskewer_r2, -0.624F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r304, -0.5629F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r305, -0.6545F, 0.0F, 0.0F);
        this.setRotateAngle(tail6, -0.2778F, 0.3367F, -0.0939F);
        this.setRotateAngle(lefttailSpike2, -0.2863F, 0.0036F, 1.0995F);
        this.setRotateAngle(babyskewer_r3, -0.624F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r306, -0.5629F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r307, -0.6545F, 0.0F, 0.0F);
        this.setRotateAngle(righttailSpike2, -0.2863F, -0.0036F, -1.0995F);
        this.setRotateAngle(babyskewer_r4, -0.624F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r308, -0.5629F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r309, -0.6545F, 0.0F, 0.0F);

        this.main.render(f);
        this.main.setScale(1F,1F,1F);
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

        EntityPrehistoricFloraMiragaia miragaia = (EntityPrehistoricFloraMiragaia) e;
        if (miragaia.getIsSneaking()) {
            this.faceTarget(f3, f4, 1, main);
        }
        this.faceTarget(f3, f4, 14, neck);
        this.faceTarget(f3, f4, 14, neck2);
        this.faceTarget(f3, f4, 14, neck3);
        this.faceTarget(f3, f4, 14, neck4);
        this.faceTarget(f3, f4, 14, head);

        AdvancedModelRenderer[] Tail = {this.tail, this.tail2, this.tail3, this.tail4, this.tail5, this.tail6};
        AdvancedModelRenderer[] Neck = {this.neck, this.neck2, this.neck3, this.neck4, this.head};
        //AdvancedModelRenderer[] ArmL = {this.leftarm, this.leftarm2, this.leftarm3};
        //AdvancedModelRenderer[] ArmR = {this.rightarm, this.rightarm2, this.rightarm3};

        miragaia.tailBuffer.applyChainSwingBuffer(Tail);

        if (miragaia.getAnimation() == miragaia.LAY_ANIMATION) {
            this.chainSwing(Neck, 0.5F, 0.10F, 0.5, f2, 0.8F);
            this.chainWave(Neck, 0.5F * 2, -0.02F, 0.5F, f2, 0.8F);
        }
        else {
            if (!miragaia.isReallyInWater()) {

                if (f3 == 0.0F || !miragaia.getIsMoving()) {
                    if (miragaia.getAnimation() != miragaia.EAT_ANIMATION
                            && miragaia.getAnimation() != miragaia.DRINK_ANIMATION
                            && miragaia.getAnimation() != miragaia.ATTACK_ANIMATION) {
                        this.chainSwing(Neck, 0.05F, 0.10F, 0.5, f2, 0.8F);
                        this.chainWave(Neck, 0.05F * 2, -0.02F, 0.5F, f2, 0.8F);
                    }

                    if (miragaia.getAnimation() != miragaia.ATTACK_ANIMATION) {
                        this.chainWave(Tail, (0.15F * 0.35F), 0.125F * 0.15F, 0.2F, f2, 1F);
                        this.chainSwing(Tail, (0.15F * 0.35F) * 4F, 0.05F * 0.35F, 0.12F, f2, 1F);
                    }

                    return;
                }

                if (miragaia.getIsFast()) { //Running
                    if (miragaia.getIsSneaking()) {

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

        EntityPrehistoricFloraMiragaia ee = (EntityPrehistoricFloraMiragaia) entitylivingbaseIn;

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
            animDrink(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.GRAZE_ANIMATION) {
            animGraze(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.ROAR_ANIMATION) { //The roar/warn anim
            animRoar(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.NOISE_ANIMATION) { //The ambient noise anim
            animNoise(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.IDLE_1) { //The ambient noise anim
            animIdle1(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.IDLE_2) { //The ambient noise anim
            animIdle2(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.IDLE_3) { //The ambient noise anim
            animIdle3(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }

    }

    public void animGraze(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraMiragaia entity = (EntityPrehistoricFloraMiragaia) entitylivingbaseIn;

        int animCycle = 130;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (2.25-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 40) {
            xx = 2.25 + (((tickAnim - 18) / 22) * (-13.75-(2.25)));
            yy = 0 + (((tickAnim - 18) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 22) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 97) {
            xx = -13.75 + (((tickAnim - 40) / 57) * (-13.75-(-13.75)));
            yy = 0 + (((tickAnim - 40) / 57) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 57) * (0-(0)));
        }
        else if (tickAnim >= 97 && tickAnim < 130) {
            xx = -13.75 + (((tickAnim - 97) / 33) * (0-(-13.75)));
            yy = 0 + (((tickAnim - 97) / 33) * (0-(0)));
            zz = 0 + (((tickAnim - 97) / 33) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(xx), body.rotateAngleY + (float) Math.toRadians(yy), body.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (-1.075-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 97) {
            xx = 0 + (((tickAnim - 40) / 57) * (0-(0)));
            yy = -1.075 + (((tickAnim - 40) / 57) * (-1.075-(-1.075)));
            zz = 0 + (((tickAnim - 40) / 57) * (0-(0)));
        }
        else if (tickAnim >= 97 && tickAnim < 130) {
            xx = 0 + (((tickAnim - 97) / 33) * (0-(0)));
            yy = -1.075 + (((tickAnim - 97) / 33) * (0-(-1.075)));
            zz = 0 + (((tickAnim - 97) / 33) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.body.rotationPointX = this.body.rotationPointX + (float)(xx);
        this.body.rotationPointY = this.body.rotationPointY - (float)(yy);
        this.body.rotationPointZ = this.body.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (-1-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 40) {
            xx = -1 + (((tickAnim - 18) / 22) * (13.5-(-1)));
            yy = 0 + (((tickAnim - 18) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 22) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 97) {
            xx = 13.5 + (((tickAnim - 40) / 57) * (13.5-(13.5)));
            yy = 0 + (((tickAnim - 40) / 57) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 57) * (0-(0)));
        }
        else if (tickAnim >= 97 && tickAnim < 130) {
            xx = 13.5 + (((tickAnim - 97) / 33) * (0-(13.5)));
            yy = 0 + (((tickAnim - 97) / 33) * (0-(0)));
            zz = 0 + (((tickAnim - 97) / 33) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backleftleg, backleftleg.rotateAngleX + (float) Math.toRadians(xx), backleftleg.rotateAngleY + (float) Math.toRadians(yy), backleftleg.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0.475-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 18) / 22) * (0-(0)));
            yy = 0.475 + (((tickAnim - 18) / 22) * (1.005-(0.475)));
            zz = 0 + (((tickAnim - 18) / 22) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 97) {
            xx = 0 + (((tickAnim - 40) / 57) * (0-(0)));
            yy = 1.005 + (((tickAnim - 40) / 57) * (1.005-(1.005)));
            zz = 0 + (((tickAnim - 40) / 57) * (0-(0)));
        }
        else if (tickAnim >= 97 && tickAnim < 130) {
            xx = 0 + (((tickAnim - 97) / 33) * (0-(0)));
            yy = 1.005 + (((tickAnim - 97) / 33) * (0-(1.005)));
            zz = 0 + (((tickAnim - 97) / 33) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.backleftleg.rotationPointX = this.backleftleg.rotationPointX + (float)(xx);
        this.backleftleg.rotationPointY = this.backleftleg.rotationPointY - (float)(yy);
        this.backleftleg.rotationPointZ = this.backleftleg.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 18) / 22) * (2.75-(0)));
            yy = 0 + (((tickAnim - 18) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 22) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 97) {
            xx = 2.75 + (((tickAnim - 40) / 57) * (2.75-(2.75)));
            yy = 0 + (((tickAnim - 40) / 57) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 57) * (0-(0)));
        }
        else if (tickAnim >= 97 && tickAnim < 130) {
            xx = 2.75 + (((tickAnim - 97) / 33) * (0-(2.75)));
            yy = 0 + (((tickAnim - 97) / 33) * (0-(0)));
            zz = 0 + (((tickAnim - 97) / 33) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backleftleg2, backleftleg2.rotateAngleX + (float) Math.toRadians(xx), backleftleg2.rotateAngleY + (float) Math.toRadians(yy), backleftleg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 18) / 22) * (5.25-(0)));
            yy = 0 + (((tickAnim - 18) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 22) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 97) {
            xx = 5.25 + (((tickAnim - 40) / 57) * (5.25-(5.25)));
            yy = 0 + (((tickAnim - 40) / 57) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 57) * (0-(0)));
        }
        else if (tickAnim >= 97 && tickAnim < 130) {
            xx = 5.25 + (((tickAnim - 97) / 33) * (0-(5.25)));
            yy = 0 + (((tickAnim - 97) / 33) * (0-(0)));
            zz = 0 + (((tickAnim - 97) / 33) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backleftleg3, backleftleg3.rotateAngleX + (float) Math.toRadians(xx), backleftleg3.rotateAngleY + (float) Math.toRadians(yy), backleftleg3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 18) / 22) * (-6-(0)));
            yy = 0 + (((tickAnim - 18) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 22) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 97) {
            xx = -6 + (((tickAnim - 40) / 57) * (-6-(-6)));
            yy = 0 + (((tickAnim - 40) / 57) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 57) * (0-(0)));
        }
        else if (tickAnim >= 97 && tickAnim < 130) {
            xx = -6 + (((tickAnim - 97) / 33) * (0-(-6)));
            yy = 0 + (((tickAnim - 97) / 33) * (0-(0)));
            zz = 0 + (((tickAnim - 97) / 33) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backleftleg4, backleftleg4.rotateAngleX + (float) Math.toRadians(xx), backleftleg4.rotateAngleY + (float) Math.toRadians(yy), backleftleg4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 21) {
            xx = 0 + (((tickAnim - 7) / 14) * (-12.5-(0)));
            yy = 0 + (((tickAnim - 7) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 14) * (0-(0)));
        }
        else if (tickAnim >= 21 && tickAnim < 40) {
            xx = -12.5 + (((tickAnim - 21) / 19) * (0.5-(-12.5)));
            yy = 0 + (((tickAnim - 21) / 19) * (0-(0)));
            zz = 0 + (((tickAnim - 21) / 19) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 97) {
            xx = 0.5 + (((tickAnim - 40) / 57) * (0.5-(0.5)));
            yy = 0 + (((tickAnim - 40) / 57) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 57) * (0-(0)));
        }
        else if (tickAnim >= 97 && tickAnim < 130) {
            xx = 0.5 + (((tickAnim - 97) / 33) * (0-(0.5)));
            yy = 0 + (((tickAnim - 97) / 33) * (0-(0)));
            zz = 0 + (((tickAnim - 97) / 33) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backrightleg, backrightleg.rotateAngleX + (float) Math.toRadians(xx), backrightleg.rotateAngleY + (float) Math.toRadians(yy), backrightleg.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (-0.25-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 7) / 7) * (0-(0)));
            yy = -0.25 + (((tickAnim - 7) / 7) * (2.845-(-0.25)));
            zz = 0 + (((tickAnim - 7) / 7) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 21) {
            xx = 0 + (((tickAnim - 14) / 7) * (0-(0)));
            yy = 2.845 + (((tickAnim - 14) / 7) * (-0.725-(2.845)));
            zz = 0 + (((tickAnim - 14) / 7) * (0-(0)));
        }
        else if (tickAnim >= 21 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 21) / 19) * (0-(0)));
            yy = -0.725 + (((tickAnim - 21) / 19) * (-0.725-(-0.725)));
            zz = 0 + (((tickAnim - 21) / 19) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 97) {
            xx = 0 + (((tickAnim - 40) / 57) * (0-(0)));
            yy = -0.725 + (((tickAnim - 40) / 57) * (-0.725-(-0.725)));
            zz = 0 + (((tickAnim - 40) / 57) * (0-(0)));
        }
        else if (tickAnim >= 97 && tickAnim < 130) {
            xx = 0 + (((tickAnim - 97) / 33) * (0-(0)));
            yy = -0.725 + (((tickAnim - 97) / 33) * (0-(-0.725)));
            zz = 0 + (((tickAnim - 97) / 33) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.backrightleg.rotationPointX = this.backrightleg.rotationPointX + (float)(xx);
        this.backrightleg.rotationPointY = this.backrightleg.rotationPointY - (float)(yy);
        this.backrightleg.rotationPointZ = this.backrightleg.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 7) / 7) * (-8.25-(0)));
            yy = 0 + (((tickAnim - 7) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 7) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 21) {
            xx = -8.25 + (((tickAnim - 14) / 7) * (-1.75-(-8.25)));
            yy = 0 + (((tickAnim - 14) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 7) * (0-(0)));
        }
        else if (tickAnim >= 21 && tickAnim < 40) {
            xx = -1.75 + (((tickAnim - 21) / 19) * (0.75-(-1.75)));
            yy = 0 + (((tickAnim - 21) / 19) * (0-(0)));
            zz = 0 + (((tickAnim - 21) / 19) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 97) {
            xx = 0.75 + (((tickAnim - 40) / 57) * (0.75-(0.75)));
            yy = 0 + (((tickAnim - 40) / 57) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 57) * (0-(0)));
        }
        else if (tickAnim >= 97 && tickAnim < 130) {
            xx = 0.75 + (((tickAnim - 97) / 33) * (0-(0.75)));
            yy = 0 + (((tickAnim - 97) / 33) * (0-(0)));
            zz = 0 + (((tickAnim - 97) / 33) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backrightleg2, backrightleg2.rotateAngleX + (float) Math.toRadians(xx), backrightleg2.rotateAngleY + (float) Math.toRadians(yy), backrightleg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 21) {
            xx = 0 + (((tickAnim - 0) / 21) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 21) * (1.1-(0)));
            zz = 0 + (((tickAnim - 0) / 21) * (-0.225-(0)));
        }
        else if (tickAnim >= 21 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 21) / 19) * (0-(0)));
            yy = 1.1 + (((tickAnim - 21) / 19) * (1.1-(1.1)));
            zz = -0.225 + (((tickAnim - 21) / 19) * (0-(-0.225)));
        }
        else if (tickAnim >= 40 && tickAnim < 97) {
            xx = 0 + (((tickAnim - 40) / 57) * (0-(0)));
            yy = 1.1 + (((tickAnim - 40) / 57) * (1.1-(1.1)));
            zz = 0 + (((tickAnim - 40) / 57) * (0-(0)));
        }
        else if (tickAnim >= 97 && tickAnim < 130) {
            xx = 0 + (((tickAnim - 97) / 33) * (0-(0)));
            yy = 1.1 + (((tickAnim - 97) / 33) * (0-(1.1)));
            zz = 0 + (((tickAnim - 97) / 33) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.backrightleg2.rotationPointX = this.backrightleg2.rotationPointX + (float)(xx);
        this.backrightleg2.rotationPointY = this.backrightleg2.rotationPointY - (float)(yy);
        this.backrightleg2.rotationPointZ = this.backrightleg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 7) / 7) * (4.39-(0)));
            yy = 0 + (((tickAnim - 7) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 7) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 21) {
            xx = 4.39 + (((tickAnim - 14) / 7) * (24-(4.39)));
            yy = 0 + (((tickAnim - 14) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 7) * (0-(0)));
        }
        else if (tickAnim >= 21 && tickAnim < 40) {
            xx = 24 + (((tickAnim - 21) / 19) * (24-(24)));
            yy = 0 + (((tickAnim - 21) / 19) * (0-(0)));
            zz = 0 + (((tickAnim - 21) / 19) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 97) {
            xx = 24 + (((tickAnim - 40) / 57) * (24-(24)));
            yy = 0 + (((tickAnim - 40) / 57) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 57) * (0-(0)));
        }
        else if (tickAnim >= 97 && tickAnim < 130) {
            xx = 24 + (((tickAnim - 97) / 33) * (0-(24)));
            yy = 0 + (((tickAnim - 97) / 33) * (0-(0)));
            zz = 0 + (((tickAnim - 97) / 33) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backrightleg3, backrightleg3.rotateAngleX + (float) Math.toRadians(xx), backrightleg3.rotateAngleY + (float) Math.toRadians(yy), backrightleg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 7 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 7) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 7) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 7) * (0.15-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 21) {
            xx = 0 + (((tickAnim - 14) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 14) / 7) * (0-(0)));
            zz = 0.15 + (((tickAnim - 14) / 7) * (-0.725-(0.15)));
        }
        else if (tickAnim >= 21 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 21) / 19) * (0-(0)));
            yy = 0 + (((tickAnim - 21) / 19) * (0-(0)));
            zz = -0.725 + (((tickAnim - 21) / 19) * (-0.725-(-0.725)));
        }
        else if (tickAnim >= 40 && tickAnim < 97) {
            xx = 0 + (((tickAnim - 40) / 57) * (0-(0)));
            yy = 0 + (((tickAnim - 40) / 57) * (0-(0)));
            zz = -0.725 + (((tickAnim - 40) / 57) * (-0.725-(-0.725)));
        }
        else if (tickAnim >= 97 && tickAnim < 130) {
            xx = 0 + (((tickAnim - 97) / 33) * (0-(0)));
            yy = 0 + (((tickAnim - 97) / 33) * (0-(0)));
            zz = -0.725 + (((tickAnim - 97) / 33) * (0-(-0.725)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.backrightleg3.rotationPointX = this.backrightleg3.rotationPointX + (float)(xx);
        this.backrightleg3.rotationPointY = this.backrightleg3.rotationPointY - (float)(yy);
        this.backrightleg3.rotationPointZ = this.backrightleg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 7) / 7) * (17-(0)));
            yy = 0 + (((tickAnim - 7) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 7) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 18) {
            xx = 17 + (((tickAnim - 14) / 4) * (-10.12-(17)));
            yy = 0 + (((tickAnim - 14) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 4) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 21) {
            xx = -10.12 + (((tickAnim - 18) / 3) * (-10-(-10.12)));
            yy = 0 + (((tickAnim - 18) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 3) * (0-(0)));
        }
        else if (tickAnim >= 21 && tickAnim < 40) {
            xx = -10 + (((tickAnim - 21) / 19) * (-10-(-10)));
            yy = 0 + (((tickAnim - 21) / 19) * (0-(0)));
            zz = 0 + (((tickAnim - 21) / 19) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 97) {
            xx = -10 + (((tickAnim - 40) / 57) * (-10-(-10)));
            yy = 0 + (((tickAnim - 40) / 57) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 57) * (0-(0)));
        }
        else if (tickAnim >= 97 && tickAnim < 130) {
            xx = -10 + (((tickAnim - 97) / 33) * (0-(-10)));
            yy = 0 + (((tickAnim - 97) / 33) * (0-(0)));
            zz = 0 + (((tickAnim - 97) / 33) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backrightleg4, backrightleg4.rotateAngleX + (float) Math.toRadians(xx), backrightleg4.rotateAngleY + (float) Math.toRadians(yy), backrightleg4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (5-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 40) {
            xx = 5 + (((tickAnim - 18) / 22) * (-3-(5)));
            yy = 0 + (((tickAnim - 18) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 22) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 97) {
            xx = -3 + (((tickAnim - 40) / 57) * (-3-(-3)));
            yy = 0 + (((tickAnim - 40) / 57) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 57) * (0-(0)));
        }
        else if (tickAnim >= 97 && tickAnim < 107) {
            xx = -3 + (((tickAnim - 97) / 10) * (0.87363-(-3)));
            yy = 0 + (((tickAnim - 97) / 10) * (-0.32783-(0)));
            zz = 0 + (((tickAnim - 97) / 10) * (2.226-(0)));
        }
        else if (tickAnim >= 107 && tickAnim < 120) {
            xx = 0.87363 + (((tickAnim - 107) / 13) * (0.36687-(0.87363)));
            yy = -0.32783 + (((tickAnim - 107) / 13) * (0.3732-(-0.32783)));
            zz = 2.226 + (((tickAnim - 107) / 13) * (-2.76067-(2.226)));
        }
        else if (tickAnim >= 120 && tickAnim < 130) {
            xx = 0.36687 + (((tickAnim - 120) / 10) * (0-(0.36687)));
            yy = 0.3732 + (((tickAnim - 120) / 10) * (0-(0.3732)));
            zz = -2.76067 + (((tickAnim - 120) / 10) * (0-(-2.76067)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body2, body2.rotateAngleX + (float) Math.toRadians(xx), body2.rotateAngleY + (float) Math.toRadians(yy), body2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 107 && tickAnim < 113) {
            xx = 0 + (((tickAnim - 107) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 107) / 6) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*2440))*-0.05-(0)));
            zz = 0 + (((tickAnim - 107) / 6) * (0-(0)));
        }
        else if (tickAnim >= 113 && tickAnim < 120) {
            xx = 0 + (((tickAnim - 113) / 7) * (0-(0)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*2440))*-0.05 + (((tickAnim - 113) / 7) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*2440))*-0.05)));
            zz = 0 + (((tickAnim - 113) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.body2.rotationPointX = this.body2.rotationPointX + (float)(xx);
        this.body2.rotationPointY = this.body2.rotationPointY - (float)(yy);
        this.body2.rotationPointZ = this.body2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (-4.25-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 40) {
            xx = -4.25 + (((tickAnim - 18) / 22) * (2.25-(-4.25)));
            yy = 0 + (((tickAnim - 18) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 22) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 97) {
            xx = 2.25 + (((tickAnim - 40) / 57) * (2.25-(2.25)));
            yy = 0 + (((tickAnim - 40) / 57) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 57) * (0-(0)));
        }
        else if (tickAnim >= 97 && tickAnim < 107) {
            xx = 2.25 + (((tickAnim - 97) / 10) * (-3.08767-(2.25)));
            yy = 0 + (((tickAnim - 97) / 10) * (-0.29791-(0)));
            zz = 0 + (((tickAnim - 97) / 10) * (-4.74067-(0)));
        }
        else if (tickAnim >= 107 && tickAnim < 120) {
            xx = -3.08767 + (((tickAnim - 107) / 13) * (0.60471-(-3.08767)));
            yy = -0.29791 + (((tickAnim - 107) / 13) * (0.18197-(-0.29791)));
            zz = -4.74067 + (((tickAnim - 107) / 13) * (2.17112-(-4.74067)));
        }
        else if (tickAnim >= 120 && tickAnim < 130) {
            xx = 0.60471 + (((tickAnim - 120) / 10) * (0-(0.60471)));
            yy = 0.18197 + (((tickAnim - 120) / 10) * (0-(0.18197)));
            zz = 2.17112 + (((tickAnim - 120) / 10) * (0-(2.17112)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(upperbody, upperbody.rotateAngleX + (float) Math.toRadians(xx), upperbody.rotateAngleY + (float) Math.toRadians(yy), upperbody.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 97 && tickAnim < 107) {
            xx = 0 + (((tickAnim - 97) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 97) / 10) * (-0.45-(0)));
            zz = 0 + (((tickAnim - 97) / 10) * (0-(0)));
        }
        else if (tickAnim >= 107 && tickAnim < 113) {
            xx = 0 + (((tickAnim - 107) / 6) * (0-(0)));
            yy = -0.45 + (((tickAnim - 107) / 6) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*2440))*0.03-(-0.45)));
            zz = 0 + (((tickAnim - 107) / 6) * (0-(0)));
        }
        else if (tickAnim >= 113 && tickAnim < 120) {
            xx = 0 + (((tickAnim - 113) / 7) * (0-(0)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*2440))*0.03 + (((tickAnim - 113) / 7) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*2440))*0.03)));
            zz = 0 + (((tickAnim - 113) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.upperbody.rotationPointX = this.upperbody.rotationPointX + (float)(xx);
        this.upperbody.rotationPointY = this.upperbody.rotationPointY - (float)(yy);
        this.upperbody.rotationPointZ = this.upperbody.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (7.75-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 23) {
            xx = 7.75 + (((tickAnim - 18) / 5) * (0.69-(7.75)));
            yy = 0 + (((tickAnim - 18) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 5) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 40) {
            xx = 0.69 + (((tickAnim - 23) / 17) * (-2.25-(0.69)));
            yy = 0 + (((tickAnim - 23) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 17) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 47) {
            xx = -2.25 + (((tickAnim - 40) / 7) * (-0.5-(-2.25)));
            yy = 0 + (((tickAnim - 40) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 7) * (0-(0)));
        }
        else if (tickAnim >= 47 && tickAnim < 53) {
            xx = -0.5 + (((tickAnim - 47) / 6) * (0-(-0.5)));
            yy = 0 + (((tickAnim - 47) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 47) / 6) * (0-(0)));
        }
        else if (tickAnim >= 53 && tickAnim < 63) {
            xx = 0 + (((tickAnim - 53) / 10) * (-4.48-(0)));
            yy = 0 + (((tickAnim - 53) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 53) / 10) * (0-(0)));
        }
        else if (tickAnim >= 63 && tickAnim < 97) {
            xx = -4.48 + (((tickAnim - 63) / 34) * (-2.25-(-4.48)));
            yy = 0 + (((tickAnim - 63) / 34) * (0-(0)));
            zz = 0 + (((tickAnim - 63) / 34) * (0-(0)));
        }
        else if (tickAnim >= 97 && tickAnim < 110) {
            xx = -2.25 + (((tickAnim - 97) / 13) * (1.67+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*-1-(-2.25)));
            yy = 0 + (((tickAnim - 97) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 97) / 13) * (0-(0)));
        }
        else if (tickAnim >= 110 && tickAnim < 130) {
            xx = 1.67+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*-1 + (((tickAnim - 110) / 20) * (0-(1.67+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*-1)));
            yy = 0 + (((tickAnim - 110) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 110) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck4, neck4.rotateAngleX + (float) Math.toRadians(xx), neck4.rotateAngleY + (float) Math.toRadians(yy), neck4.rotateAngleZ + (float) Math.toRadians(zz));

        this.neck4.rotationPointX = this.neck4.rotationPointX + (float)(0);
        this.neck4.rotationPointY = this.neck4.rotationPointY - (float)(0);
        this.neck4.rotationPointZ = this.neck4.rotationPointZ + (float)(0);



        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (4.5-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 39) {
            xx = 4.5 + (((tickAnim - 18) / 21) * (0-(4.5)));
            yy = 0 + (((tickAnim - 18) / 21) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 21) * (0-(0)));
        }
        else if (tickAnim >= 39 && tickAnim < 46) {
            xx = 0 + (((tickAnim - 39) / 7) * (3.50301-(0)));
            yy = 0 + (((tickAnim - 39) / 7) * (-0.19808-(0)));
            zz = 0 + (((tickAnim - 39) / 7) * (-1.73876-(0)));
        }
        else if (tickAnim >= 46 && tickAnim < 53) {
            xx = 3.50301 + (((tickAnim - 46) / 7) * (0-(3.50301)));
            yy = -0.19808 + (((tickAnim - 46) / 7) * (0-(-0.19808)));
            zz = -1.73876 + (((tickAnim - 46) / 7) * (0-(-1.73876)));
        }
        else if (tickAnim >= 53 && tickAnim < 63) {
            xx = 0 + (((tickAnim - 53) / 10) * (-2.25-(0)));
            yy = 0 + (((tickAnim - 53) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 53) / 10) * (0-(0)));
        }
        else if (tickAnim >= 63 && tickAnim < 88) {
            xx = -2.25 + (((tickAnim - 63) / 25) * (-0.61075-(-2.25)));
            yy = 0 + (((tickAnim - 63) / 25) * (0.41451-(0)));
            zz = 0 + (((tickAnim - 63) / 25) * (2.21151-(0)));
        }
        else if (tickAnim >= 88 && tickAnim < 97) {
            xx = -0.61075 + (((tickAnim - 88) / 9) * (0-(-0.61075)));
            yy = 0.41451 + (((tickAnim - 88) / 9) * (0-(0.41451)));
            zz = 2.21151 + (((tickAnim - 88) / 9) * (0-(2.21151)));
        }
        else if (tickAnim >= 97 && tickAnim < 111) {
            xx = 0 + (((tickAnim - 97) / 14) * (1.93+Math.sin((Math.PI/180)*(((double)tickAnim/20)*450))*1-(0)));
            yy = 0 + (((tickAnim - 97) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 97) / 14) * (0-(0)));
        }
        else if (tickAnim >= 111 && tickAnim < 130) {
            xx = 1.93+Math.sin((Math.PI/180)*(((double)tickAnim/20)*450))*1 + (((tickAnim - 111) / 19) * (0-(1.93+Math.sin((Math.PI/180)*(((double)tickAnim/20)*450))*1)));
            yy = 0 + (((tickAnim - 111) / 19) * (0-(0)));
            zz = 0 + (((tickAnim - 111) / 19) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(xx), neck3.rotateAngleY + (float) Math.toRadians(yy), neck3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 39) {
            xx = 0 + (((tickAnim - 18) / 21) * (0-(0)));
            yy = 0 + (((tickAnim - 18) / 21) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 21) * (0-(0)));
        }
        else if (tickAnim >= 39 && tickAnim < 46) {
            xx = 0 + (((tickAnim - 39) / 7) * (8.25846-(0)));
            yy = 0 + (((tickAnim - 39) / 7) * (-0.21568-(0)));
            zz = 0 + (((tickAnim - 39) / 7) * (-4.49484-(0)));
        }
        else if (tickAnim >= 46 && tickAnim < 53) {
            xx = 8.25846 + (((tickAnim - 46) / 7) * (0-(8.25846)));
            yy = -0.21568 + (((tickAnim - 46) / 7) * (0-(-0.21568)));
            zz = -4.49484 + (((tickAnim - 46) / 7) * (0-(-4.49484)));
        }
        else if (tickAnim >= 53 && tickAnim < 62) {
            xx = 0 + (((tickAnim - 53) / 9) * (-2-(0)));
            yy = 0 + (((tickAnim - 53) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 53) / 9) * (0-(0)));
        }
        else if (tickAnim >= 62 && tickAnim < 78) {
            xx = -2 + (((tickAnim - 62) / 16) * (-1.55-(-2)));
            yy = 0 + (((tickAnim - 62) / 16) * (0-(0)));
            zz = 0 + (((tickAnim - 62) / 16) * (0-(0)));
        }
        else if (tickAnim >= 78 && tickAnim < 88) {
            xx = -1.55 + (((tickAnim - 78) / 10) * (10.61107-(-1.55)));
            yy = 0 + (((tickAnim - 78) / 10) * (0.0289-(0)));
            zz = 0 + (((tickAnim - 78) / 10) * (4.2499-(0)));
        }
        else if (tickAnim >= 88 && tickAnim < 97) {
            xx = 10.61107 + (((tickAnim - 88) / 9) * (0-(10.61107)));
            yy = 0.0289 + (((tickAnim - 88) / 9) * (0-(0.0289)));
            zz = 4.2499 + (((tickAnim - 88) / 9) * (0-(4.2499)));
        }
        else if (tickAnim >= 97 && tickAnim < 113) {
            xx = 0 + (((tickAnim - 97) / 16) * (3.07+Math.sin((Math.PI/180)*(((double)tickAnim/20)*350))*-2-(0)));
            yy = 0 + (((tickAnim - 97) / 16) * (0-(0)));
            zz = 0 + (((tickAnim - 97) / 16) * (0-(0)));
        }
        else if (tickAnim >= 113 && tickAnim < 130) {
            xx = 3.07+Math.sin((Math.PI/180)*(((double)tickAnim/20)*350))*-2 + (((tickAnim - 113) / 17) * (0-(3.07+Math.sin((Math.PI/180)*(((double)tickAnim/20)*350))*-2)));
            yy = 0 + (((tickAnim - 113) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 113) / 17) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(xx), neck2.rotateAngleY + (float) Math.toRadians(yy), neck2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (-15-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 39) {
            xx = -15 + (((tickAnim - 18) / 21) * (16.25-(-15)));
            yy = 0 + (((tickAnim - 18) / 21) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 21) * (0-(0)));
        }
        else if (tickAnim >= 39 && tickAnim < 46) {
            xx = 16.25 + (((tickAnim - 39) / 7) * (9.7194-(16.25)));
            yy = 0 + (((tickAnim - 39) / 7) * (0.89911-(0)));
            zz = 0 + (((tickAnim - 39) / 7) * (-3.8978-(0)));
        }
        else if (tickAnim >= 46 && tickAnim < 53) {
            xx = 9.7194 + (((tickAnim - 46) / 7) * (23.75-(9.7194)));
            yy = 0.89911 + (((tickAnim - 46) / 7) * (0-(0.89911)));
            zz = -3.8978 + (((tickAnim - 46) / 7) * (0-(-3.8978)));
        }
        else if (tickAnim >= 53 && tickAnim < 62) {
            xx = 23.75 + (((tickAnim - 53) / 9) * (18.22-(23.75)));
            yy = 0 + (((tickAnim - 53) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 53) / 9) * (0-(0)));
        }
        else if (tickAnim >= 62 && tickAnim < 67) {
            xx = 18.22 + (((tickAnim - 62) / 5) * (16.47-(18.22)));
            yy = 0 + (((tickAnim - 62) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 62) / 5) * (0-(0)));
        }
        else if (tickAnim >= 67 && tickAnim < 78) {
            xx = 16.47 + (((tickAnim - 67) / 11) * (25.78-(16.47)));
            yy = 0 + (((tickAnim - 67) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 67) / 11) * (0-(0)));
        }
        else if (tickAnim >= 78 && tickAnim < 88) {
            xx = 25.78 + (((tickAnim - 78) / 10) * (20.76214-(25.78)));
            yy = 0 + (((tickAnim - 78) / 10) * (-1.52781-(0)));
            zz = 0 + (((tickAnim - 78) / 10) * (3.42507-(0)));
        }
        else if (tickAnim >= 88 && tickAnim < 92) {
            xx = 20.76214 + (((tickAnim - 88) / 4) * (19.07481-(20.76214)));
            yy = -1.52781 + (((tickAnim - 88) / 4) * (-0.83335-(-1.52781)));
            zz = 3.42507 + (((tickAnim - 88) / 4) * (1.86822-(3.42507)));
        }
        else if (tickAnim >= 92 && tickAnim < 97) {
            xx = 19.07481 + (((tickAnim - 92) / 5) * (11-(19.07481)));
            yy = -0.83335 + (((tickAnim - 92) / 5) * (0-(-0.83335)));
            zz = 1.86822 + (((tickAnim - 92) / 5) * (0-(1.86822)));
        }
        else if (tickAnim >= 97 && tickAnim < 99) {
            xx = 11 + (((tickAnim - 97) / 2) * (7.25-(11)));
            yy = 0 + (((tickAnim - 97) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 97) / 2) * (0-(0)));
        }
        else if (tickAnim >= 99 && tickAnim < 113) {
            xx = 7.25 + (((tickAnim - 99) / 14) * (3.07+Math.sin((Math.PI/180)*(((double)tickAnim/20)*350))*-3-(7.25)));
            yy = 0 + (((tickAnim - 99) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 99) / 14) * (0-(0)));
        }
        else if (tickAnim >= 113 && tickAnim < 130) {
            xx = 3.07+Math.sin((Math.PI/180)*(((double)tickAnim/20)*350))*-3 + (((tickAnim - 113) / 17) * (0-(3.07+Math.sin((Math.PI/180)*(((double)tickAnim/20)*350))*-3)));
            yy = 0 + (((tickAnim - 113) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 113) / 17) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(xx), neck.rotateAngleY + (float) Math.toRadians(yy), neck.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0.775-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 39) {
            xx = 0 + (((tickAnim - 18) / 21) * (0-(0)));
            yy = 0 + (((tickAnim - 18) / 21) * (0-(0)));
            zz = 0.775 + (((tickAnim - 18) / 21) * (0-(0.775)));
        }
        else if (tickAnim >= 39 && tickAnim < 97) {
            xx = 0 + (((tickAnim - 39) / 58) * (0-(0)));
            yy = 0 + (((tickAnim - 39) / 58) * (0-(0)));
            zz = 0 + (((tickAnim - 39) / 58) * (0-(0)));
        }
        else if (tickAnim >= 97 && tickAnim < 99) {
            xx = 0 + (((tickAnim - 97) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 97) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 97) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.neck.rotationPointX = this.neck.rotationPointX + (float)(xx);
        this.neck.rotationPointY = this.neck.rotationPointY - (float)(yy);
        this.neck.rotationPointZ = this.neck.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (-15-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 39) {
            xx = -15 + (((tickAnim - 18) / 21) * (11.5-(-15)));
            yy = 0 + (((tickAnim - 18) / 21) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 21) * (0-(0)));
        }
        else if (tickAnim >= 39 && tickAnim < 46) {
            xx = 11.5 + (((tickAnim - 39) / 7) * (-6.25-(11.5)));
            yy = 0 + (((tickAnim - 39) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 39) / 7) * (0-(0)));
        }
        else if (tickAnim >= 46 && tickAnim < 53) {
            xx = -6.25 + (((tickAnim - 46) / 7) * (5.99-(-6.25)));
            yy = 0 + (((tickAnim - 46) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 46) / 7) * (0-(0)));
        }
        else if (tickAnim >= 53 && tickAnim < 62) {
            xx = 5.99 + (((tickAnim - 53) / 9) * (-6.57-(5.99)));
            yy = 0 + (((tickAnim - 53) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 53) / 9) * (0-(0)));
        }
        else if (tickAnim >= 62 && tickAnim < 67) {
            xx = -6.57 + (((tickAnim - 62) / 5) * (-11.32-(-6.57)));
            yy = 0 + (((tickAnim - 62) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 62) / 5) * (0-(0)));
        }
        else if (tickAnim >= 67 && tickAnim < 78) {
            xx = -11.32 + (((tickAnim - 67) / 11) * (8.25-(-11.32)));
            yy = 0 + (((tickAnim - 67) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 67) / 11) * (0-(0)));
        }
        else if (tickAnim >= 78 && tickAnim < 88) {
            xx = 8.25 + (((tickAnim - 78) / 10) * (-12.62-(8.25)));
            yy = 0 + (((tickAnim - 78) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 78) / 10) * (0-(0)));
        }
        else if (tickAnim >= 88 && tickAnim < 92) {
            xx = -12.62 + (((tickAnim - 88) / 4) * (-4.41-(-12.62)));
            yy = 0 + (((tickAnim - 88) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 88) / 4) * (0-(0)));
        }
        else if (tickAnim >= 92 && tickAnim < 97) {
            xx = -4.41 + (((tickAnim - 92) / 5) * (-5-(-4.41)));
            yy = 0 + (((tickAnim - 92) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 92) / 5) * (0-(0)));
        }
        else if (tickAnim >= 97 && tickAnim < 99) {
            xx = -5 + (((tickAnim - 97) / 2) * (-10-(-5)));
            yy = 0 + (((tickAnim - 97) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 97) / 2) * (0-(0)));
        }
        else if (tickAnim >= 99 && tickAnim < 113) {
            xx = -10 + (((tickAnim - 99) / 14) * (-6+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*5-(-10)));
            yy = 0 + (((tickAnim - 99) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 99) / 14) * (0-(0)));
        }
        else if (tickAnim >= 113 && tickAnim < 130) {
            xx = -6+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*5 + (((tickAnim - 113) / 17) * (0-(-6+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*5)));
            yy = 0 + (((tickAnim - 113) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 113) / 17) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 39 && tickAnim < 78) {
            xx = 0 + (((tickAnim - 39) / 39) * (0-(0)));
            yy = 0 + (((tickAnim - 39) / 39) * (0-(0)));
            zz = 0 + (((tickAnim - 39) / 39) * (0.25-(0)));
        }
        else if (tickAnim >= 78 && tickAnim < 97) {
            xx = 0 + (((tickAnim - 78) / 19) * (0-(0)));
            yy = 0 + (((tickAnim - 78) / 19) * (0-(0)));
            zz = 0.25 + (((tickAnim - 78) / 19) * (0.25-(0.25)));
        }
        else if (tickAnim >= 97 && tickAnim < 99) {
            xx = 0 + (((tickAnim - 97) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 97) / 2) * (0-(0)));
            zz = 0.25 + (((tickAnim - 97) / 2) * (0.25-(0.25)));
        }
        else if (tickAnim >= 99 && tickAnim < 113) {
            xx = 0 + (((tickAnim - 99) / 14) * (0-(0)));
            yy = 0 + (((tickAnim - 99) / 14) * (-0.15-(0)));
            zz = 0.25 + (((tickAnim - 99) / 14) * (0.13-(0.25)));
        }
        else if (tickAnim >= 113 && tickAnim < 130) {
            xx = 0 + (((tickAnim - 113) / 17) * (0-(0)));
            yy = -0.15 + (((tickAnim - 113) / 17) * (0-(-0.15)));
            zz = 0.13 + (((tickAnim - 113) / 17) * (0-(0.13)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.head.rotationPointX = this.head.rotationPointX + (float)(xx);
        this.head.rotationPointY = this.head.rotationPointY - (float)(yy);
        this.head.rotationPointZ = this.head.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (-2-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 40) {
            xx = -2 + (((tickAnim - 18) / 22) * (12.5-(-2)));
            yy = 0 + (((tickAnim - 18) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 22) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 96) {
            xx = 12.5 + (((tickAnim - 40) / 56) * (12.5-(12.5)));
            yy = 0 + (((tickAnim - 40) / 56) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 56) * (0-(0)));
        }
        else if (tickAnim >= 96 && tickAnim < 110) {
            xx = 12.5 + (((tickAnim - 96) / 14) * (10.33-(12.5)));
            yy = 0 + (((tickAnim - 96) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 96) / 14) * (0-(0)));
        }
        else if (tickAnim >= 110 && tickAnim < 123) {
            xx = 10.33 + (((tickAnim - 110) / 13) * (2.64-(10.33)));
            yy = 0 + (((tickAnim - 110) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 110) / 13) * (0-(0)));
        }
        else if (tickAnim >= 123 && tickAnim < 130) {
            xx = 2.64 + (((tickAnim - 123) / 7) * (0-(2.64)));
            yy = 0 + (((tickAnim - 123) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 123) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontleftleg, frontleftleg.rotateAngleX + (float) Math.toRadians(xx), frontleftleg.rotateAngleY + (float) Math.toRadians(yy), frontleftleg.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (1.975-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 18) / 22) * (0-(0)));
            yy = 1.975 + (((tickAnim - 18) / 22) * (0-(1.975)));
            zz = 0 + (((tickAnim - 18) / 22) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 96) {
            xx = 0 + (((tickAnim - 40) / 56) * (0-(0)));
            yy = 0 + (((tickAnim - 40) / 56) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 56) * (0-(0)));
        }
        else if (tickAnim >= 96 && tickAnim < 107) {
            xx = 0 + (((tickAnim - 96) / 11) * (0-(0)));
            yy = 0 + (((tickAnim - 96) / 11) * (-3.18-(0)));
            zz = 0 + (((tickAnim - 96) / 11) * (0-(0)));
        }
        else if (tickAnim >= 107 && tickAnim < 110) {
            xx = 0 + (((tickAnim - 107) / 3) * (0-(0)));
            yy = -3.18 + (((tickAnim - 107) / 3) * (-3.025-(-3.18)));
            zz = 0 + (((tickAnim - 107) / 3) * (0-(0)));
        }
        else if (tickAnim >= 110 && tickAnim < 116) {
            xx = 0 + (((tickAnim - 110) / 6) * (0-(0)));
            yy = -3.025 + (((tickAnim - 110) / 6) * (-2.925+Math.sin((Math.PI/180)*(((double)tickAnim/20)*2550))*0.1-(-3.025)));
            zz = 0 + (((tickAnim - 110) / 6) * (0-(0)));
        }
        else if (tickAnim >= 116 && tickAnim < 123) {
            xx = 0 + (((tickAnim - 116) / 7) * (0-(0)));
            yy = -2.925+Math.sin((Math.PI/180)*(((double)tickAnim/20)*2550))*0.1 + (((tickAnim - 116) / 7) * (-1.3-(-2.925+Math.sin((Math.PI/180)*(((double)tickAnim/20)*2550))*0.1)));
            zz = 0 + (((tickAnim - 116) / 7) * (0-(0)));
        }
        else if (tickAnim >= 123 && tickAnim < 130) {
            xx = 0 + (((tickAnim - 123) / 7) * (0-(0)));
            yy = -1.3 + (((tickAnim - 123) / 7) * (0-(-1.3)));
            zz = 0 + (((tickAnim - 123) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.frontleftleg.rotationPointX = this.frontleftleg.rotationPointX + (float)(xx);
        this.frontleftleg.rotationPointY = this.frontleftleg.rotationPointY - (float)(yy);
        this.frontleftleg.rotationPointZ = this.frontleftleg.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 18) / 22) * (16.25-(0)));
            yy = 0 + (((tickAnim - 18) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 22) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 96) {
            xx = 16.25 + (((tickAnim - 40) / 56) * (16.25-(16.25)));
            yy = 0 + (((tickAnim - 40) / 56) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 56) * (0-(0)));
        }
        else if (tickAnim >= 96 && tickAnim < 103) {
            xx = 16.25 + (((tickAnim - 96) / 7) * (19.75-(16.25)));
            yy = 0 + (((tickAnim - 96) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 96) / 7) * (0-(0)));
        }
        else if (tickAnim >= 103 && tickAnim < 114) {
            xx = 19.75 + (((tickAnim - 103) / 11) * (0.95-(19.75)));
            yy = 0 + (((tickAnim - 103) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 103) / 11) * (0-(0)));
        }
        else if (tickAnim >= 114 && tickAnim < 130) {
            xx = 0.95 + (((tickAnim - 114) / 16) * (0-(0.95)));
            yy = 0 + (((tickAnim - 114) / 16) * (0-(0)));
            zz = 0 + (((tickAnim - 114) / 16) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontleftleg2, frontleftleg2.rotateAngleX + (float) Math.toRadians(xx), frontleftleg2.rotateAngleY + (float) Math.toRadians(yy), frontleftleg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 103) {
            xx = 0 + (((tickAnim - 0) / 103) * (-0.525-(0)));
            yy = 0 + (((tickAnim - 0) / 103) * (0.75-(0)));
            zz = 0 + (((tickAnim - 0) / 103) * (0-(0)));
        }
        else if (tickAnim >= 103 && tickAnim < 130) {
            xx = -0.525 + (((tickAnim - 103) / 27) * (0-(-0.525)));
            yy = 0.75 + (((tickAnim - 103) / 27) * (0-(0.75)));
            zz = 0 + (((tickAnim - 103) / 27) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.frontleftleg2.rotationPointX = this.frontleftleg2.rotationPointX + (float)(xx);
        this.frontleftleg2.rotationPointY = this.frontleftleg2.rotationPointY - (float)(yy);
        this.frontleftleg2.rotationPointZ = this.frontleftleg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 18 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 18) / 22) * (34-(0)));
            yy = 0 + (((tickAnim - 18) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 22) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 96) {
            xx = 34 + (((tickAnim - 40) / 56) * (34-(34)));
            yy = 0 + (((tickAnim - 40) / 56) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 56) * (0-(0)));
        }
        else if (tickAnim >= 96 && tickAnim < 103) {
            xx = 34 + (((tickAnim - 96) / 7) * (22.25-(34)));
            yy = 0 + (((tickAnim - 96) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 96) / 7) * (0-(0)));
        }
        else if (tickAnim >= 103 && tickAnim < 112) {
            xx = 22.25 + (((tickAnim - 103) / 9) * (-5.75-(22.25)));
            yy = 0 + (((tickAnim - 103) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 103) / 9) * (0-(0)));
        }
        else if (tickAnim >= 112 && tickAnim < 121) {
            xx = -5.75 + (((tickAnim - 112) / 9) * (-1.75+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150))*1-(-5.75)));
            yy = 0 + (((tickAnim - 112) / 9) * (-0.62743-(0)));
            zz = 0 + (((tickAnim - 112) / 9) * (1.67373-(0)));
        }
        else if (tickAnim >= 121 && tickAnim < 130) {
            xx = -1.75+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150))*1 + (((tickAnim - 121) / 9) * (0-(-1.75+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150))*1)));
            yy = -0.62743 + (((tickAnim - 121) / 9) * (0-(-0.62743)));
            zz = 1.67373 + (((tickAnim - 121) / 9) * (0-(1.67373)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontleftleg3, frontleftleg3.rotateAngleX + (float) Math.toRadians(xx), frontleftleg3.rotateAngleY + (float) Math.toRadians(yy), frontleftleg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 18 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 18) / 22) * (0-(0)));
            yy = 0 + (((tickAnim - 18) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 22) * (-1.075-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 96) {
            xx = 0 + (((tickAnim - 40) / 56) * (0-(0)));
            yy = 0 + (((tickAnim - 40) / 56) * (0-(0)));
            zz = -1.075 + (((tickAnim - 40) / 56) * (-1.075-(-1.075)));
        }
        else if (tickAnim >= 96 && tickAnim < 103) {
            xx = 0 + (((tickAnim - 96) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 96) / 7) * (0-(0)));
            zz = -1.075 + (((tickAnim - 96) / 7) * (-0.875-(-1.075)));
        }
        else if (tickAnim >= 103 && tickAnim < 112) {
            xx = 0 + (((tickAnim - 103) / 9) * (0-(0)));
            yy = 0 + (((tickAnim - 103) / 9) * (0-(0)));
            zz = -0.875 + (((tickAnim - 103) / 9) * (0-(-0.875)));
        }
        else if (tickAnim >= 112 && tickAnim < 130) {
            xx = 0 + (((tickAnim - 112) / 18) * (0-(0)));
            yy = 0 + (((tickAnim - 112) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 112) / 18) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.frontleftleg3.rotationPointX = this.frontleftleg3.rotationPointX + (float)(xx);
        this.frontleftleg3.rotationPointY = this.frontleftleg3.rotationPointY - (float)(yy);
        this.frontleftleg3.rotationPointZ = this.frontleftleg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (-1.5-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 40) {
            xx = -1.5 + (((tickAnim - 18) / 22) * (3.5-(-1.5)));
            yy = 0 + (((tickAnim - 18) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 22) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 96) {
            xx = 3.5 + (((tickAnim - 40) / 56) * (3.5-(3.5)));
            yy = 0 + (((tickAnim - 40) / 56) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 56) * (0-(0)));
        }
        else if (tickAnim >= 96 && tickAnim < 107) {
            xx = 3.5 + (((tickAnim - 96) / 11) * (-24.75-(3.5)));
            yy = 0 + (((tickAnim - 96) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 96) / 11) * (0-(0)));
        }
        else if (tickAnim >= 107 && tickAnim < 115) {
            xx = -24.75 + (((tickAnim - 107) / 8) * (-24.75-(-24.75)));
            yy = 0 + (((tickAnim - 107) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 107) / 8) * (0-(0)));
        }
        else if (tickAnim >= 115 && tickAnim < 123) {
            xx = -24.75 + (((tickAnim - 115) / 8) * (-3.75-(-24.75)));
            yy = 0 + (((tickAnim - 115) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 115) / 8) * (0-(0)));
        }
        else if (tickAnim >= 123 && tickAnim < 130) {
            xx = -3.75 + (((tickAnim - 123) / 7) * (0-(-3.75)));
            yy = 0 + (((tickAnim - 123) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 123) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontrightleg, frontrightleg.rotateAngleX + (float) Math.toRadians(xx), frontrightleg.rotateAngleY + (float) Math.toRadians(yy), frontrightleg.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (1.975-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 18) / 22) * (0-(0)));
            yy = 1.975 + (((tickAnim - 18) / 22) * (1.125-(1.975)));
            zz = 0 + (((tickAnim - 18) / 22) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 96) {
            xx = 0 + (((tickAnim - 40) / 56) * (0-(0)));
            yy = 1.125 + (((tickAnim - 40) / 56) * (1.125-(1.125)));
            zz = 0 + (((tickAnim - 40) / 56) * (0-(0)));
        }
        else if (tickAnim >= 96 && tickAnim < 107) {
            xx = 0 + (((tickAnim - 96) / 11) * (0-(0)));
            yy = 1.125 + (((tickAnim - 96) / 11) * (-0.385-(1.125)));
            zz = 0 + (((tickAnim - 96) / 11) * (0-(0)));
        }
        else if (tickAnim >= 107 && tickAnim < 111) {
            xx = 0 + (((tickAnim - 107) / 4) * (0-(0)));
            yy = -0.385 + (((tickAnim - 107) / 4) * (-1.91+Math.sin((Math.PI/180)*(((double)tickAnim/20)*2550))*0.2-(-0.385)));
            zz = 0 + (((tickAnim - 107) / 4) * (0-(0)));
        }
        else if (tickAnim >= 111 && tickAnim < 113) {
            xx = 0 + (((tickAnim - 111) / 2) * (0-(0)));
            yy = -1.91+Math.sin((Math.PI/180)*(((double)tickAnim/20)*2550))*0.2 + (((tickAnim - 111) / 2) * (-2.235-(-1.91+Math.sin((Math.PI/180)*(((double)tickAnim/20)*2550))*0.2)));
            zz = 0 + (((tickAnim - 111) / 2) * (0-(0)));
        }
        else if (tickAnim >= 113 && tickAnim < 115) {
            xx = 0 + (((tickAnim - 113) / 2) * (0-(0)));
            yy = -2.235 + (((tickAnim - 113) / 2) * (-2.35-(-2.235)));
            zz = 0 + (((tickAnim - 113) / 2) * (0-(0)));
        }
        else if (tickAnim >= 115 && tickAnim < 123) {
            xx = 0 + (((tickAnim - 115) / 8) * (0-(0)));
            yy = -2.35 + (((tickAnim - 115) / 8) * (1.42-(-2.35)));
            zz = 0 + (((tickAnim - 115) / 8) * (0-(0)));
        }
        else if (tickAnim >= 123 && tickAnim < 130) {
            xx = 0 + (((tickAnim - 123) / 7) * (0-(0)));
            yy = 1.42 + (((tickAnim - 123) / 7) * (0-(1.42)));
            zz = 0 + (((tickAnim - 123) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.frontrightleg.rotationPointX = this.frontrightleg.rotationPointX + (float)(xx);
        this.frontrightleg.rotationPointY = this.frontrightleg.rotationPointY - (float)(yy);
        this.frontrightleg.rotationPointZ = this.frontrightleg.rotationPointZ + (float)(zz);




        if (tickAnim >= 18 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 18) / 22) * (21.75-(0)));
            yy = 0 + (((tickAnim - 18) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 22) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 95) {
            xx = 21.75 + (((tickAnim - 40) / 55) * (21.75-(21.75)));
            yy = 0 + (((tickAnim - 40) / 55) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 55) * (0-(0)));
        }
        else if (tickAnim >= 95 && tickAnim < 107) {
            xx = 21.75 + (((tickAnim - 95) / 12) * (23.94-(21.75)));
            yy = 0 + (((tickAnim - 95) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 95) / 12) * (0-(0)));
        }
        else if (tickAnim >= 107 && tickAnim < 123) {
            xx = 23.94 + (((tickAnim - 107) / 16) * (-10.53-(23.94)));
            yy = 0 + (((tickAnim - 107) / 16) * (0-(0)));
            zz = 0 + (((tickAnim - 107) / 16) * (0-(0)));
        }
        else if (tickAnim >= 123 && tickAnim < 130) {
            xx = -10.53 + (((tickAnim - 123) / 7) * (0-(-10.53)));
            yy = 0 + (((tickAnim - 123) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 123) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontrightleg2, frontrightleg2.rotateAngleX + (float) Math.toRadians(xx), frontrightleg2.rotateAngleY + (float) Math.toRadians(yy), frontrightleg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 95 && tickAnim < 99) {
            xx = 0 + (((tickAnim - 95) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 95) / 4) * (0.945-(0)));
            zz = 0 + (((tickAnim - 95) / 4) * (0-(0)));
        }
        else if (tickAnim >= 99 && tickAnim < 107) {
            xx = 0 + (((tickAnim - 99) / 8) * (0-(0)));
            yy = 0.945 + (((tickAnim - 99) / 8) * (-0.525-(0.945)));
            zz = 0 + (((tickAnim - 99) / 8) * (0-(0)));
        }
        else if (tickAnim >= 107 && tickAnim < 115) {
            xx = 0 + (((tickAnim - 107) / 8) * (0-(0)));
            yy = -0.525 + (((tickAnim - 107) / 8) * (-0.08-(-0.525)));
            zz = 0 + (((tickAnim - 107) / 8) * (0-(0)));
        }
        else if (tickAnim >= 115 && tickAnim < 123) {
            xx = 0 + (((tickAnim - 115) / 8) * (0-(0)));
            yy = -0.08 + (((tickAnim - 115) / 8) * (0.37-(-0.08)));
            zz = 0 + (((tickAnim - 115) / 8) * (0-(0)));
        }
        else if (tickAnim >= 123 && tickAnim < 130) {
            xx = 0 + (((tickAnim - 123) / 7) * (0-(0)));
            yy = 0.37 + (((tickAnim - 123) / 7) * (0-(0.37)));
            zz = 0 + (((tickAnim - 123) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.frontrightleg2.rotationPointX = this.frontrightleg2.rotationPointX + (float)(xx);
        this.frontrightleg2.rotationPointY = this.frontrightleg2.rotationPointY - (float)(yy);
        this.frontrightleg2.rotationPointZ = this.frontrightleg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 18) / 22) * (24.25-(0)));
            yy = 0 + (((tickAnim - 18) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 22) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 95) {
            xx = 24.25 + (((tickAnim - 40) / 55) * (24.25-(24.25)));
            yy = 0 + (((tickAnim - 40) / 55) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 55) * (0-(0)));
        }
        else if (tickAnim >= 95 && tickAnim < 107) {
            xx = 24.25 + (((tickAnim - 95) / 12) * (7.75-(24.25)));
            yy = 0 + (((tickAnim - 95) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 95) / 12) * (0-(0)));
        }
        else if (tickAnim >= 107 && tickAnim < 115) {
            xx = 7.75 + (((tickAnim - 107) / 8) * (22.54188-(7.75)));
            yy = 0 + (((tickAnim - 107) / 8) * (2.14546-(0)));
            zz = 0 + (((tickAnim - 107) / 8) * (-3.38409-(0)));
        }
        else if (tickAnim >= 115 && tickAnim < 123) {
            xx = 22.54188 + (((tickAnim - 115) / 8) * (27.88-(22.54188)));
            yy = 2.14546 + (((tickAnim - 115) / 8) * (0-(2.14546)));
            zz = -3.38409 + (((tickAnim - 115) / 8) * (0-(-3.38409)));
        }
        else if (tickAnim >= 123 && tickAnim < 130) {
            xx = 27.88 + (((tickAnim - 123) / 7) * (0-(27.88)));
            yy = 0 + (((tickAnim - 123) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 123) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontrightleg3, frontrightleg3.rotateAngleX + (float) Math.toRadians(xx), frontrightleg3.rotateAngleY + (float) Math.toRadians(yy), frontrightleg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (-0.575-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 95) {
            xx = 0 + (((tickAnim - 40) / 55) * (0-(0)));
            yy = 0 + (((tickAnim - 40) / 55) * (0-(0)));
            zz = -0.575 + (((tickAnim - 40) / 55) * (-0.575-(-0.575)));
        }
        else if (tickAnim >= 95 && tickAnim < 107) {
            xx = 0 + (((tickAnim - 95) / 12) * (0-(0)));
            yy = 0 + (((tickAnim - 95) / 12) * (0-(0)));
            zz = -0.575 + (((tickAnim - 95) / 12) * (0-(-0.575)));
        }
        else if (tickAnim >= 107 && tickAnim < 123) {
            xx = 0 + (((tickAnim - 107) / 16) * (0-(0)));
            yy = 0 + (((tickAnim - 107) / 16) * (0-(0)));
            zz = 0 + (((tickAnim - 107) / 16) * (-0.75-(0)));
        }
        else if (tickAnim >= 123 && tickAnim < 130) {
            xx = 0 + (((tickAnim - 123) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 123) / 7) * (0-(0)));
            zz = -0.75 + (((tickAnim - 123) / 7) * (0-(-0.75)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.frontrightleg3.rotationPointX = this.frontrightleg3.rotationPointX + (float)(xx);
        this.frontrightleg3.rotationPointY = this.frontrightleg3.rotationPointY - (float)(yy);
        this.frontrightleg3.rotationPointZ = this.frontrightleg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (3.51598-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (-0.66026-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0.23119-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 40) {
            xx = 3.51598 + (((tickAnim - 18) / 22) * (-13-(3.51598)));
            yy = -0.66026 + (((tickAnim - 18) / 22) * (0-(-0.66026)));
            zz = 0.23119 + (((tickAnim - 18) / 22) * (0-(0.23119)));
        }
        else if (tickAnim >= 40 && tickAnim < 96) {
            xx = -13 + (((tickAnim - 40) / 56) * (-13-(-13)));
            yy = 0 + (((tickAnim - 40) / 56) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 56) * (0-(0)));
        }
        else if (tickAnim >= 96 && tickAnim < 130) {
            xx = -13 + (((tickAnim - 96) / 34) * (0-(-13)));
            yy = 0 + (((tickAnim - 96) / 34) * (0-(0)));
            zz = 0 + (((tickAnim - 96) / 34) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail, tail.rotateAngleX + (float) Math.toRadians(xx), tail.rotateAngleY + (float) Math.toRadians(yy), tail.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (-0.25-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 40) {
            xx = -0.25 + (((tickAnim - 18) / 22) * (-5-(-0.25)));
            yy = 0 + (((tickAnim - 18) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 22) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 96) {
            xx = -5 + (((tickAnim - 40) / 56) * (-5-(-5)));
            yy = 0 + (((tickAnim - 40) / 56) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 56) * (0-(0)));
        }
        else if (tickAnim >= 96 && tickAnim < 130) {
            xx = -5 + (((tickAnim - 96) / 34) * (0-(-5)));
            yy = 0 + (((tickAnim - 96) / 34) * (0-(0)));
            zz = 0 + (((tickAnim - 96) / 34) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(xx), tail2.rotateAngleY + (float) Math.toRadians(yy), tail2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (-1.25-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 40) {
            xx = -1.25 + (((tickAnim - 18) / 22) * (-5-(-1.25)));
            yy = 0 + (((tickAnim - 18) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 22) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 96) {
            xx = -5 + (((tickAnim - 40) / 56) * (-5-(-5)));
            yy = 0 + (((tickAnim - 40) / 56) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 56) * (0-(0)));
        }
        else if (tickAnim >= 96 && tickAnim < 130) {
            xx = -5 + (((tickAnim - 96) / 34) * (0-(-5)));
            yy = 0 + (((tickAnim - 96) / 34) * (0-(0)));
            zz = 0 + (((tickAnim - 96) / 34) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(xx), tail3.rotateAngleY + (float) Math.toRadians(yy), tail3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (2.08-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 34) {
            xx = 2.08 + (((tickAnim - 18) / 16) * (4.58-(2.08)));
            yy = 0 + (((tickAnim - 18) / 16) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 16) * (0-(0)));
        }
        else if (tickAnim >= 34 && tickAnim < 40) {
            xx = 4.58 + (((tickAnim - 34) / 6) * (16-(4.58)));
            yy = 0 + (((tickAnim - 34) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 34) / 6) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 96) {
            xx = 16 + (((tickAnim - 40) / 56) * (16-(16)));
            yy = 0 + (((tickAnim - 40) / 56) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 56) * (0-(0)));
        }
        else if (tickAnim >= 96 && tickAnim < 107) {
            xx = 16 + (((tickAnim - 96) / 11) * (6.43-(16)));
            yy = 0 + (((tickAnim - 96) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 96) / 11) * (0-(0)));
        }
        else if (tickAnim >= 107 && tickAnim < 130) {
            xx = 6.43 + (((tickAnim - 107) / 23) * (0-(6.43)));
            yy = 0 + (((tickAnim - 107) / 23) * (0-(0)));
            zz = 0 + (((tickAnim - 107) / 23) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(xx), tail4.rotateAngleY + (float) Math.toRadians(yy), tail4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (2.95-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 35) {
            xx = 2.95 + (((tickAnim - 18) / 17) * (9.24-(2.95)));
            yy = 0 + (((tickAnim - 18) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 17) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 40) {
            xx = 9.24 + (((tickAnim - 35) / 5) * (24-(9.24)));
            yy = 0 + (((tickAnim - 35) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 5) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 96) {
            xx = 24 + (((tickAnim - 40) / 56) * (24-(24)));
            yy = 0 + (((tickAnim - 40) / 56) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 56) * (0-(0)));
        }
        else if (tickAnim >= 96 && tickAnim < 107) {
            xx = 24 + (((tickAnim - 96) / 11) * (11.39-(24)));
            yy = 0 + (((tickAnim - 96) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 96) / 11) * (0-(0)));
        }
        else if (tickAnim >= 107 && tickAnim < 114) {
            xx = 11.39 + (((tickAnim - 107) / 7) * (4.73-(11.39)));
            yy = 0 + (((tickAnim - 107) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 107) / 7) * (0-(0)));
        }
        else if (tickAnim >= 114 && tickAnim < 130) {
            xx = 4.73 + (((tickAnim - 114) / 16) * (0-(4.73)));
            yy = 0 + (((tickAnim - 114) / 16) * (0-(0)));
            zz = 0 + (((tickAnim - 114) / 16) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail5, tail5.rotateAngleX + (float) Math.toRadians(xx), tail5.rotateAngleY + (float) Math.toRadians(yy), tail5.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (14.3-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 31) {
            xx = 14.3 + (((tickAnim - 18) / 13) * (17.74-(14.3)));
            yy = 0 + (((tickAnim - 18) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 13) * (0-(0)));
        }
        else if (tickAnim >= 31 && tickAnim < 35) {
            xx = 17.74 + (((tickAnim - 31) / 4) * (36.22-(17.74)));
            yy = 0 + (((tickAnim - 31) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 31) / 4) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 40) {
            xx = 36.22 + (((tickAnim - 35) / 5) * (43-(36.22)));
            yy = 0 + (((tickAnim - 35) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 5) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 96) {
            xx = 43 + (((tickAnim - 40) / 56) * (43-(43)));
            yy = 0 + (((tickAnim - 40) / 56) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 56) * (0-(0)));
        }
        else if (tickAnim >= 96 && tickAnim < 107) {
            xx = 43 + (((tickAnim - 96) / 11) * (26.62-(43)));
            yy = 0 + (((tickAnim - 96) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 96) / 11) * (0-(0)));
        }
        else if (tickAnim >= 107 && tickAnim < 114) {
            xx = 26.62 + (((tickAnim - 107) / 7) * (13.06-(26.62)));
            yy = 0 + (((tickAnim - 107) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 107) / 7) * (0-(0)));
        }
        else if (tickAnim >= 114 && tickAnim < 130) {
            xx = 13.06 + (((tickAnim - 114) / 16) * (0-(13.06)));
            yy = 0 + (((tickAnim - 114) / 16) * (0-(0)));
            zz = 0 + (((tickAnim - 114) / 16) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail6, tail6.rotateAngleX + (float) Math.toRadians(xx), tail6.rotateAngleY + (float) Math.toRadians(yy), tail6.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 18) / 22) * (0-(0)));
            yy = 0 + (((tickAnim - 18) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 22) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.tail6.rotationPointX = this.tail6.rotationPointX + (float)(xx);
        this.tail6.rotationPointY = this.tail6.rotationPointY - (float)(yy);
        this.tail6.rotationPointZ = this.tail6.rotationPointZ + (float)(zz);




        if (tickAnim >= 40 && tickAnim < 46) {
            xx = 0 + (((tickAnim - 40) / 6) * (20-(0)));
            yy = 0 + (((tickAnim - 40) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 6) * (0-(0)));
        }
        else if (tickAnim >= 46 && tickAnim < 53) {
            xx = 20 + (((tickAnim - 46) / 7) * (0-(20)));
            yy = 0 + (((tickAnim - 46) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 46) / 7) * (0-(0)));
        }
        else if (tickAnim >= 53 && tickAnim < 80) {
            xx = 0 + (((tickAnim - 53) / 27) * (0-(0)));
            yy = 0 + (((tickAnim - 53) / 27) * (0-(0)));
            zz = 0 + (((tickAnim - 53) / 27) * (0-(0)));
        }
        else if (tickAnim >= 80 && tickAnim < 88) {
            xx = 0 + (((tickAnim - 80) / 8) * (13.75-(0)));
            yy = 0 + (((tickAnim - 80) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 80) / 8) * (0-(0)));
        }
        else if (tickAnim >= 88 && tickAnim < 92) {
            xx = 13.75 + (((tickAnim - 88) / 4) * (0-(13.75)));
            yy = 0 + (((tickAnim - 88) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 88) / 4) * (0-(0)));
        }
        else if (tickAnim >= 92 && tickAnim < 96) {
            xx = 0 + (((tickAnim - 92) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 92) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 92) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(xx), jaw.rotateAngleY + (float) Math.toRadians(yy), jaw.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 36 && tickAnim < 43) {
            xx = 1 + (((tickAnim - 36) / 7) * (1-(1)));
            yy = 1 + (((tickAnim - 36) / 7) * (0.035-(1)));
            zz = 1 + (((tickAnim - 36) / 7) * (1-(1)));
        }
        else if (tickAnim >= 43 && tickAnim < 50) {
            xx = 1 + (((tickAnim - 43) / 7) * (1-(1)));
            yy = 0.035 + (((tickAnim - 43) / 7) * (1-(0.035)));
            zz = 1 + (((tickAnim - 43) / 7) * (1-(1)));
        }
        else if (tickAnim >= 50 && tickAnim < 82) {
            xx = 1 + (((tickAnim - 50) / 32) * (1-(1)));
            yy = 1 + (((tickAnim - 50) / 32) * (1-(1)));
            zz = 1 + (((tickAnim - 50) / 32) * (1-(1)));
        }
        else if (tickAnim >= 82 && tickAnim < 89) {
            xx = 1 + (((tickAnim - 82) / 7) * (1-(1)));
            yy = 1 + (((tickAnim - 82) / 7) * (0.035-(1)));
            zz = 1 + (((tickAnim - 82) / 7) * (1-(1)));
        }
        else if (tickAnim >= 89 && tickAnim < 96) {
            xx = 1 + (((tickAnim - 89) / 7) * (1-(1)));
            yy = 0.035 + (((tickAnim - 89) / 7) * (1-(0.035)));
            zz = 1 + (((tickAnim - 89) / 7) * (1-(1)));
        }
        else {
            xx = 1;
            yy = 1;
            zz = 1;
        }
        this.Eye.setScale((float)xx, (float)yy, (float)zz);




        if (tickAnim >= 32 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 32) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 32) / 1) * (-0.1-(0)));
            zz = 0 + (((tickAnim - 32) / 1) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 33) / 0) * (0-(0)));
            yy = -0.1 + (((tickAnim - 33) / 0) * (0-(-0.1)));
            zz = 0 + (((tickAnim - 33) / 0) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 34) {
            xx = 0 + (((tickAnim - 33) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 33) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 1) * (0-(0)));
        }
        else if (tickAnim >= 34 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 34) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 34) / 1) * (-0.1-(0)));
            zz = 0 + (((tickAnim - 34) / 1) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 36) {
            xx = 0 + (((tickAnim - 35) / 1) * (0-(0)));
            yy = -0.1 + (((tickAnim - 35) / 1) * (0-(-0.1)));
            zz = 0 + (((tickAnim - 35) / 1) * (0-(0)));
        }
        else if (tickAnim >= 36 && tickAnim < 37) {
            xx = 0 + (((tickAnim - 36) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 36) / 1) * (-0.1-(0)));
            zz = 0 + (((tickAnim - 36) / 1) * (0-(0)));
        }
        else if (tickAnim >= 37 && tickAnim < 38) {
            xx = 0 + (((tickAnim - 37) / 1) * (0-(0)));
            yy = -0.1 + (((tickAnim - 37) / 1) * (0-(-0.1)));
            zz = 0 + (((tickAnim - 37) / 1) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 38) {
            xx = 0 + (((tickAnim - 38) / 0) * (0-(0)));
            yy = 0 + (((tickAnim - 38) / 0) * (-0.1-(0)));
            zz = 0 + (((tickAnim - 38) / 0) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 39) {
            xx = 0 + (((tickAnim - 38) / 1) * (0-(0)));
            yy = -0.1 + (((tickAnim - 38) / 1) * (0-(-0.1)));
            zz = 0 + (((tickAnim - 38) / 1) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.lefttailSpike2.rotationPointX = this.lefttailSpike2.rotationPointX + (float)(xx);
        this.lefttailSpike2.rotationPointY = this.lefttailSpike2.rotationPointY - (float)(yy);
        this.lefttailSpike2.rotationPointZ = this.lefttailSpike2.rotationPointZ + (float)(zz);




        if (tickAnim >= 32 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 32) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 32) / 1) * (-0.1-(0)));
            zz = 0 + (((tickAnim - 32) / 1) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 33) / 0) * (0-(0)));
            yy = -0.1 + (((tickAnim - 33) / 0) * (0-(-0.1)));
            zz = 0 + (((tickAnim - 33) / 0) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 34) {
            xx = 0 + (((tickAnim - 33) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 33) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 1) * (0-(0)));
        }
        else if (tickAnim >= 34 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 34) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 34) / 1) * (-0.1-(0)));
            zz = 0 + (((tickAnim - 34) / 1) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 36) {
            xx = 0 + (((tickAnim - 35) / 1) * (0-(0)));
            yy = -0.1 + (((tickAnim - 35) / 1) * (0-(-0.1)));
            zz = 0 + (((tickAnim - 35) / 1) * (0-(0)));
        }
        else if (tickAnim >= 36 && tickAnim < 37) {
            xx = 0 + (((tickAnim - 36) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 36) / 1) * (-0.1-(0)));
            zz = 0 + (((tickAnim - 36) / 1) * (0-(0)));
        }
        else if (tickAnim >= 37 && tickAnim < 38) {
            xx = 0 + (((tickAnim - 37) / 1) * (0-(0)));
            yy = -0.1 + (((tickAnim - 37) / 1) * (0-(-0.1)));
            zz = 0 + (((tickAnim - 37) / 1) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 38) {
            xx = 0 + (((tickAnim - 38) / 0) * (0-(0)));
            yy = 0 + (((tickAnim - 38) / 0) * (-0.1-(0)));
            zz = 0 + (((tickAnim - 38) / 0) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 39) {
            xx = 0 + (((tickAnim - 38) / 1) * (0-(0)));
            yy = -0.1 + (((tickAnim - 38) / 1) * (0-(-0.1)));
            zz = 0 + (((tickAnim - 38) / 1) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.righttailSpike2.rotationPointX = this.righttailSpike2.rotationPointX + (float)(xx);
        this.righttailSpike2.rotationPointY = this.righttailSpike2.rotationPointY - (float)(yy);
        this.righttailSpike2.rotationPointZ = this.righttailSpike2.rotationPointZ + (float)(zz);

    }

    public void animDrink(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraMiragaia entity = (EntityPrehistoricFloraMiragaia) entitylivingbaseIn;

        int animCycle = 82;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        if (tickAnim >= 0 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 0) / 28) * (7.25-(0)));
            yy = 0 + (((tickAnim - 0) / 28) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 28) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 60) {
            xx = 7.25 + (((tickAnim - 28) / 32) * (7.25-(7.25)));
            yy = 0 + (((tickAnim - 28) / 32) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 32) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 83) {
            xx = 7.25 + (((tickAnim - 60) / 23) * (0-(7.25)));
            yy = 0 + (((tickAnim - 60) / 23) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 23) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body2, body2.rotateAngleX + (float) Math.toRadians(xx), body2.rotateAngleY + (float) Math.toRadians(yy), body2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 0) / 28) * (6-(0)));
            yy = 0 + (((tickAnim - 0) / 28) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 28) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 60) {
            xx = 6 + (((tickAnim - 28) / 32) * (6-(6)));
            yy = 0 + (((tickAnim - 28) / 32) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 32) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 83) {
            xx = 6 + (((tickAnim - 60) / 23) * (0-(6)));
            yy = 0 + (((tickAnim - 60) / 23) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 23) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(upperbody, upperbody.rotateAngleX + (float) Math.toRadians(xx), upperbody.rotateAngleY + (float) Math.toRadians(yy), upperbody.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 0) / 28) * (7.78845-(0)));
            yy = 0 + (((tickAnim - 0) / 28) * (0.16763-(0)));
            zz = 0 + (((tickAnim - 0) / 28) * (-0.45687-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 60) {
            xx = 7.78845 + (((tickAnim - 28) / 32) * (0-(7.78845)));
            yy = 0.16763 + (((tickAnim - 28) / 32) * (0-(0.16763)));
            zz = -0.45687 + (((tickAnim - 28) / 32) * (0-(-0.45687)));
        }
        else if (tickAnim >= 60 && tickAnim < 83) {
            xx = 0 + (((tickAnim - 60) / 23) * (0-(0)));
            yy = 0 + (((tickAnim - 60) / 23) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 23) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(xx), neck2.rotateAngleY + (float) Math.toRadians(yy), neck2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 0) / 28) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 28) * (-0.1-(0)));
            zz = 0 + (((tickAnim - 0) / 28) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 28) / 32) * (0-(0)));
            yy = -0.1 + (((tickAnim - 28) / 32) * (-0.1-(-0.1)));
            zz = 0 + (((tickAnim - 28) / 32) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 83) {
            xx = 0 + (((tickAnim - 60) / 23) * (0-(0)));
            yy = -0.1 + (((tickAnim - 60) / 23) * (0-(-0.1)));
            zz = 0 + (((tickAnim - 60) / 23) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.neck2.rotationPointX = this.neck2.rotationPointX + (float)(xx);
        this.neck2.rotationPointY = this.neck2.rotationPointY - (float)(yy);
        this.neck2.rotationPointZ = this.neck2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 0) / 28) * (12.25-(0)));
            yy = 0 + (((tickAnim - 0) / 28) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 28) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 60) {
            xx = 12.25 + (((tickAnim - 28) / 32) * (12.25-(12.25)));
            yy = 0 + (((tickAnim - 28) / 32) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 32) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 68) {
            xx = 12.25 + (((tickAnim - 60) / 8) * (-5.6-(12.25)));
            yy = 0 + (((tickAnim - 60) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 8) * (0-(0)));
        }
        else if (tickAnim >= 68 && tickAnim < 76) {
            xx = -5.6 + (((tickAnim - 68) / 8) * (0-(-5.6)));
            yy = 0 + (((tickAnim - 68) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 68) / 8) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backrightleg, backrightleg.rotateAngleX + (float) Math.toRadians(xx), backrightleg.rotateAngleY + (float) Math.toRadians(yy), backrightleg.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 76) {
            xx = 0 + (((tickAnim - 0) / 76) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 76) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 76) * (0-(0)));
        }
        else if (tickAnim >= 76 && tickAnim < 78) {
            xx = 0 + (((tickAnim - 76) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 76) / 2) * (-0.1-(0)));
            zz = 0 + (((tickAnim - 76) / 2) * (0-(0)));
        }
        else if (tickAnim >= 78 && tickAnim < 79) {
            xx = 0 + (((tickAnim - 78) / 1) * (0-(0)));
            yy = -0.1 + (((tickAnim - 78) / 1) * (0-(-0.1)));
            zz = 0 + (((tickAnim - 78) / 1) * (0-(0)));
        }
        else if (tickAnim >= 79 && tickAnim < 81) {
            xx = 0 + (((tickAnim - 79) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 79) / 2) * (-0.1-(0)));
            zz = 0 + (((tickAnim - 79) / 2) * (0-(0)));
        }
        else if (tickAnim >= 81 && tickAnim < 83) {
            xx = 0 + (((tickAnim - 81) / 2) * (0-(0)));
            yy = -0.1 + (((tickAnim - 81) / 2) * (0-(-0.1)));
            zz = 0 + (((tickAnim - 81) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.backrightleg.rotationPointX = this.backrightleg.rotationPointX + (float)(xx);
        this.backrightleg.rotationPointY = this.backrightleg.rotationPointY - (float)(yy);
        this.backrightleg.rotationPointZ = this.backrightleg.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 0) / 28) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 28) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 28) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 28) / 32) * (0-(0)));
            yy = 0 + (((tickAnim - 28) / 32) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 32) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 68) {
            xx = 0 + (((tickAnim - 60) / 8) * (30.44-(0)));
            yy = 0 + (((tickAnim - 60) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 8) * (0-(0)));
        }
        else if (tickAnim >= 68 && tickAnim < 73) {
            xx = 30.44 + (((tickAnim - 68) / 5) * (6.65-(30.44)));
            yy = 0 + (((tickAnim - 68) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 68) / 5) * (0-(0)));
        }
        else if (tickAnim >= 73 && tickAnim < 76) {
            xx = 6.65 + (((tickAnim - 73) / 3) * (0-(6.65)));
            yy = 0 + (((tickAnim - 73) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 73) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backrightleg2, backrightleg2.rotateAngleX + (float) Math.toRadians(xx), backrightleg2.rotateAngleY + (float) Math.toRadians(yy), backrightleg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 28 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 28) / 32) * (0-(0)));
            yy = 0 + (((tickAnim - 28) / 32) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 32) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 68) {
            xx = 0 + (((tickAnim - 60) / 8) * (-0.25-(0)));
            yy = 0 + (((tickAnim - 60) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 8) * (0-(0)));
        }
        else if (tickAnim >= 68 && tickAnim < 76) {
            xx = -0.25 + (((tickAnim - 68) / 8) * (0-(-0.25)));
            yy = 0 + (((tickAnim - 68) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 68) / 8) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.backrightleg2.rotationPointX = this.backrightleg2.rotationPointX + (float)(xx);
        this.backrightleg2.rotationPointY = this.backrightleg2.rotationPointY - (float)(yy);
        this.backrightleg2.rotationPointZ = this.backrightleg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 28 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 28) / 32) * (0-(0)));
            yy = 0 + (((tickAnim - 28) / 32) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 32) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 68) {
            xx = 0 + (((tickAnim - 60) / 8) * (-15.5-(0)));
            yy = 0 + (((tickAnim - 60) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 8) * (0-(0)));
        }
        else if (tickAnim >= 68 && tickAnim < 73) {
            xx = -15.5 + (((tickAnim - 68) / 5) * (1.63-(-15.5)));
            yy = 0 + (((tickAnim - 68) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 68) / 5) * (0-(0)));
        }
        else if (tickAnim >= 73 && tickAnim < 76) {
            xx = 1.63 + (((tickAnim - 73) / 3) * (0-(1.63)));
            yy = 0 + (((tickAnim - 73) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 73) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backrightleg3, backrightleg3.rotateAngleX + (float) Math.toRadians(xx), backrightleg3.rotateAngleY + (float) Math.toRadians(yy), backrightleg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 28 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 28) / 32) * (0-(0)));
            yy = -0.3 + (((tickAnim - 28) / 32) * (-0.3-(-0.3)));
            zz = 0.425 + (((tickAnim - 28) / 32) * (0.425-(0.425)));
        }
        else if (tickAnim >= 60 && tickAnim < 76) {
            xx = 0 + (((tickAnim - 60) / 16) * (0-(0)));
            yy = -0.3 + (((tickAnim - 60) / 16) * (-0.3-(-0.3)));
            zz = 0.425 + (((tickAnim - 60) / 16) * (0.425-(0.425)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.backrightleg3.rotationPointX = this.backrightleg3.rotationPointX + (float)(xx);
        this.backrightleg3.rotationPointY = this.backrightleg3.rotationPointY - (float)(yy);
        this.backrightleg3.rotationPointZ = this.backrightleg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 0) / 28) * (-12.5-(0)));
            yy = 0 + (((tickAnim - 0) / 28) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 28) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 60) {
            xx = -12.5 + (((tickAnim - 28) / 32) * (-12.5-(-12.5)));
            yy = 0 + (((tickAnim - 28) / 32) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 32) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 68) {
            xx = -12.5 + (((tickAnim - 60) / 8) * (6.16-(-12.5)));
            yy = 0 + (((tickAnim - 60) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 8) * (0-(0)));
        }
        else if (tickAnim >= 68 && tickAnim < 73) {
            xx = 6.16 + (((tickAnim - 68) / 5) * (-14.36-(6.16)));
            yy = 0 + (((tickAnim - 68) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 68) / 5) * (0-(0)));
        }
        else if (tickAnim >= 73 && tickAnim < 76) {
            xx = -14.36 + (((tickAnim - 73) / 3) * (0-(-14.36)));
            yy = 0 + (((tickAnim - 73) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 73) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backrightleg4, backrightleg4.rotateAngleX + (float) Math.toRadians(xx), backrightleg4.rotateAngleY + (float) Math.toRadians(yy), backrightleg4.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 0) / 28) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 28) * (-0.975-(0)));
            zz = 0 + (((tickAnim - 0) / 28) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 28) / 32) * (0-(0)));
            yy = -0.975 + (((tickAnim - 28) / 32) * (-0.975-(-0.975)));
            zz = 0 + (((tickAnim - 28) / 32) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 76) {
            xx = 0 + (((tickAnim - 60) / 16) * (0-(0)));
            yy = -0.975 + (((tickAnim - 60) / 16) * (0-(-0.975)));
            zz = 0 + (((tickAnim - 60) / 16) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.backrightleg4.rotationPointX = this.backrightleg4.rotationPointX + (float)(xx);
        this.backrightleg4.rotationPointY = this.backrightleg4.rotationPointY - (float)(yy);
        this.backrightleg4.rotationPointZ = this.backrightleg4.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 0) / 28) * (21.63119-(0)));
            yy = 0 + (((tickAnim - 0) / 28) * (1.01848-(0)));
            zz = 0 + (((tickAnim - 0) / 28) * (-4.35723-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 37) {
            xx = 21.63119 + (((tickAnim - 28) / 9) * (18.88119-(21.63119)));
            yy = 1.01848 + (((tickAnim - 28) / 9) * (1.01848-(1.01848)));
            zz = -4.35723 + (((tickAnim - 28) / 9) * (-4.35723-(-4.35723)));
        }
        else if (tickAnim >= 37 && tickAnim < 60) {
            xx = 18.88119 + (((tickAnim - 37) / 23) * (-1-(18.88119)));
            yy = 1.01848 + (((tickAnim - 37) / 23) * (0-(1.01848)));
            zz = -4.35723 + (((tickAnim - 37) / 23) * (0-(-4.35723)));
        }
        else if (tickAnim >= 60 && tickAnim < 83) {
            xx = -1 + (((tickAnim - 60) / 23) * (0-(-1)));
            yy = 0 + (((tickAnim - 60) / 23) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 23) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(xx), neck3.rotateAngleY + (float) Math.toRadians(yy), neck3.rotateAngleZ + (float) Math.toRadians(zz));

        this.neck3.rotationPointX = this.neck3.rotationPointX + (float)(0);
        this.neck3.rotationPointY = this.neck3.rotationPointY - (float)(0);
        this.neck3.rotationPointZ = this.neck3.rotationPointZ + (float)(0);



        if (tickAnim >= 0 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 0) / 28) * (4.25-(0)));
            yy = 0 + (((tickAnim - 0) / 28) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 28) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 37) {
            xx = 4.25 + (((tickAnim - 28) / 9) * (-1.5-(4.25)));
            yy = 0 + (((tickAnim - 28) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 9) * (0-(0)));
        }
        else if (tickAnim >= 37 && tickAnim < 60) {
            xx = -1.5 + (((tickAnim - 37) / 23) * (0-(-1.5)));
            yy = 0 + (((tickAnim - 37) / 23) * (0-(0)));
            zz = 0 + (((tickAnim - 37) / 23) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 83) {
            xx = 0 + (((tickAnim - 60) / 23) * (0-(0)));
            yy = 0 + (((tickAnim - 60) / 23) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 23) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(xx), neck.rotateAngleY + (float) Math.toRadians(yy), neck.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 0) / 28) * (-11.75-(0)));
            yy = 0 + (((tickAnim - 0) / 28) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 28) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 37) {
            xx = -11.75 + (((tickAnim - 28) / 9) * (-22.5-(-11.75)));
            yy = 0 + (((tickAnim - 28) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 9) * (0-(0)));
        }
        else if (tickAnim >= 37 && tickAnim < 60) {
            xx = -22.5 + (((tickAnim - 37) / 23) * (-12.5-(-22.5)));
            yy = 0 + (((tickAnim - 37) / 23) * (0-(0)));
            zz = 0 + (((tickAnim - 37) / 23) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 83) {
            xx = -12.5 + (((tickAnim - 60) / 23) * (0-(-12.5)));
            yy = 0 + (((tickAnim - 60) / 23) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 23) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 0) / 28) * (2.75-(0)));
            yy = 0 + (((tickAnim - 0) / 28) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 28) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 37) {
            xx = 2.75 + (((tickAnim - 28) / 9) * (14.11-(2.75)));
            yy = 0 + (((tickAnim - 28) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 9) * (0-(0)));
        }
        else if (tickAnim >= 37 && tickAnim < 49) {
            xx = 14.11 + (((tickAnim - 37) / 12) * (0-(14.11)));
            yy = 0 + (((tickAnim - 37) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 37) / 12) * (0-(0)));
        }
        else if (tickAnim >= 49 && tickAnim < 83) {
            xx = 0 + (((tickAnim - 49) / 34) * (0-(0)));
            yy = 0 + (((tickAnim - 49) / 34) * (0-(0)));
            zz = 0 + (((tickAnim - 49) / 34) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(xx), jaw.rotateAngleY + (float) Math.toRadians(yy), jaw.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (1.5-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 22) {
            xx = 1.5 + (((tickAnim - 8) / 14) * (6.75-(1.5)));
            yy = 0 + (((tickAnim - 8) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 14) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 29) {
            xx = 6.75 + (((tickAnim - 22) / 7) * (0.5-(6.75)));
            yy = 0 + (((tickAnim - 22) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 22) / 7) * (0-(0)));
        }
        else if (tickAnim >= 29 && tickAnim < 60) {
            xx = 0.5 + (((tickAnim - 29) / 31) * (0.5-(0.5)));
            yy = 0 + (((tickAnim - 29) / 31) * (0-(0)));
            zz = 0 + (((tickAnim - 29) / 31) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 79) {
            xx = 0.5 + (((tickAnim - 60) / 19) * (-4.5-(0.5)));
            yy = 0 + (((tickAnim - 60) / 19) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 19) * (0-(0)));
        }
        else if (tickAnim >= 79 && tickAnim < 83) {
            xx = -4.5 + (((tickAnim - 79) / 4) * (0-(-4.5)));
            yy = 0 + (((tickAnim - 79) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 79) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontleftleg, frontleftleg.rotateAngleX + (float) Math.toRadians(xx), frontleftleg.rotateAngleY + (float) Math.toRadians(yy), frontleftleg.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0.575-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 22) {
            xx = 0 + (((tickAnim - 8) / 14) * (0-(0)));
            yy = 0.575 + (((tickAnim - 8) / 14) * (0-(0.575)));
            zz = 0 + (((tickAnim - 8) / 14) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 24) {
            xx = 0 + (((tickAnim - 22) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 22) / 2) * (-0.15-(0)));
            zz = 0 + (((tickAnim - 22) / 2) * (0-(0)));
        }
        else if (tickAnim >= 24 && tickAnim < 27) {
            xx = 0 + (((tickAnim - 24) / 3) * (0-(0)));
            yy = -0.15 + (((tickAnim - 24) / 3) * (0-(-0.15)));
            zz = 0 + (((tickAnim - 24) / 3) * (0-(0)));
        }
        else if (tickAnim >= 27 && tickAnim < 29) {
            xx = 0 + (((tickAnim - 27) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 27) / 2) * (-0.15-(0)));
            zz = 0 + (((tickAnim - 27) / 2) * (0-(0)));
        }
        else if (tickAnim >= 29 && tickAnim < 32) {
            xx = 0 + (((tickAnim - 29) / 3) * (0-(0)));
            yy = -0.15 + (((tickAnim - 29) / 3) * (0-(-0.15)));
            zz = 0 + (((tickAnim - 29) / 3) * (0-(0)));
        }
        else if (tickAnim >= 32 && tickAnim < 79) {
            xx = 0 + (((tickAnim - 32) / 47) * (0-(0)));
            yy = 0 + (((tickAnim - 32) / 47) * (0-(0)));
            zz = 0 + (((tickAnim - 32) / 47) * (0-(0)));
        }
        else if (tickAnim >= 79 && tickAnim < 83) {
            xx = 0 + (((tickAnim - 79) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 79) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 79) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.frontleftleg.rotationPointX = this.frontleftleg.rotationPointX + (float)(xx);
        this.frontleftleg.rotationPointY = this.frontleftleg.rotationPointY - (float)(yy);
        this.frontleftleg.rotationPointZ = this.frontleftleg.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (-29.5-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 22) {
            xx = -29.5 + (((tickAnim - 8) / 14) * (-5.75-(-29.5)));
            yy = 0 + (((tickAnim - 8) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 14) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 29) {
            xx = -5.75 + (((tickAnim - 22) / 7) * (-5.75-(-5.75)));
            yy = 0 + (((tickAnim - 22) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 22) / 7) * (0-(0)));
        }
        else if (tickAnim >= 29 && tickAnim < 60) {
            xx = -5.75 + (((tickAnim - 29) / 31) * (-5.75-(-5.75)));
            yy = 0 + (((tickAnim - 29) / 31) * (0-(0)));
            zz = 0 + (((tickAnim - 29) / 31) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 68) {
            xx = -5.75 + (((tickAnim - 60) / 8) * (-27.98-(-5.75)));
            yy = 0 + (((tickAnim - 60) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 8) * (0-(0)));
        }
        else if (tickAnim >= 68 && tickAnim < 79) {
            xx = -27.98 + (((tickAnim - 68) / 11) * (-0.25-(-27.98)));
            yy = 0 + (((tickAnim - 68) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 68) / 11) * (0-(0)));
        }
        else if (tickAnim >= 79 && tickAnim < 83) {
            xx = -0.25 + (((tickAnim - 79) / 4) * (0-(-0.25)));
            yy = 0 + (((tickAnim - 79) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 79) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontleftleg2, frontleftleg2.rotateAngleX + (float) Math.toRadians(xx), frontleftleg2.rotateAngleY + (float) Math.toRadians(yy), frontleftleg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 0) / 11) * (-0.475-(0)));
            yy = 0 + (((tickAnim - 0) / 11) * (0.76-(0)));
            zz = 0 + (((tickAnim - 0) / 11) * (0.415-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 22) {
            xx = -0.475 + (((tickAnim - 11) / 11) * (0-(-0.475)));
            yy = 0.76 + (((tickAnim - 11) / 11) * (0-(0.76)));
            zz = 0.415 + (((tickAnim - 11) / 11) * (0-(0.415)));
        }
        else if (tickAnim >= 22 && tickAnim < 29) {
            xx = 0 + (((tickAnim - 22) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 22) / 7) * (0.625-(0)));
            zz = 0 + (((tickAnim - 22) / 7) * (0.25-(0)));
        }
        else if (tickAnim >= 29 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 29) / 31) * (0-(0)));
            yy = 0.625 + (((tickAnim - 29) / 31) * (0.625-(0.625)));
            zz = 0.25 + (((tickAnim - 29) / 31) * (0.25-(0.25)));
        }
        else if (tickAnim >= 60 && tickAnim < 68) {
            xx = 0 + (((tickAnim - 60) / 8) * (0-(0)));
            yy = 0.625 + (((tickAnim - 60) / 8) * (1.42-(0.625)));
            zz = 0.25 + (((tickAnim - 60) / 8) * (0.93-(0.25)));
        }
        else if (tickAnim >= 68 && tickAnim < 79) {
            xx = 0 + (((tickAnim - 68) / 11) * (0-(0)));
            yy = 1.42 + (((tickAnim - 68) / 11) * (0.575-(1.42)));
            zz = 0.93 + (((tickAnim - 68) / 11) * (0-(0.93)));
        }
        else if (tickAnim >= 79 && tickAnim < 83) {
            xx = 0 + (((tickAnim - 79) / 4) * (0-(0)));
            yy = 0.575 + (((tickAnim - 79) / 4) * (0-(0.575)));
            zz = 0 + (((tickAnim - 79) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.frontleftleg2.rotationPointX = this.frontleftleg2.rotationPointX + (float)(xx);
        this.frontleftleg2.rotationPointY = this.frontleftleg2.rotationPointY - (float)(yy);
        this.frontleftleg2.rotationPointZ = this.frontleftleg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (32.75-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 19) {
            xx = 32.75 + (((tickAnim - 8) / 11) * (-15.51-(32.75)));
            yy = 0 + (((tickAnim - 8) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 11) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 22) {
            xx = -15.51 + (((tickAnim - 19) / 3) * (-11.75-(-15.51)));
            yy = 0 + (((tickAnim - 19) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 19) / 3) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 29) {
            xx = -11.75 + (((tickAnim - 22) / 7) * (-7.25-(-11.75)));
            yy = 0 + (((tickAnim - 22) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 22) / 7) * (0-(0)));
        }
        else if (tickAnim >= 29 && tickAnim < 60) {
            xx = -7.25 + (((tickAnim - 29) / 31) * (-7.25-(-7.25)));
            yy = 0 + (((tickAnim - 29) / 31) * (0-(0)));
            zz = 0 + (((tickAnim - 29) / 31) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 68) {
            xx = -7.25 + (((tickAnim - 60) / 8) * (35.99-(-7.25)));
            yy = 0 + (((tickAnim - 60) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 8) * (0-(0)));
        }
        else if (tickAnim >= 68 && tickAnim < 75) {
            xx = 35.99 + (((tickAnim - 68) / 7) * (-3.4-(35.99)));
            yy = 0 + (((tickAnim - 68) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 68) / 7) * (0-(0)));
        }
        else if (tickAnim >= 75 && tickAnim < 79) {
            xx = -3.4 + (((tickAnim - 75) / 4) * (4.75-(-3.4)));
            yy = 0 + (((tickAnim - 75) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 75) / 4) * (0-(0)));
        }
        else if (tickAnim >= 79 && tickAnim < 83) {
            xx = 4.75 + (((tickAnim - 79) / 4) * (0-(4.75)));
            yy = 0 + (((tickAnim - 79) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 79) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontleftleg3, frontleftleg3.rotateAngleX + (float) Math.toRadians(xx), frontleftleg3.rotateAngleY + (float) Math.toRadians(yy), frontleftleg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0.05-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (-0.925-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 22) {
            xx = 0 + (((tickAnim - 8) / 14) * (0-(0)));
            yy = 0.05 + (((tickAnim - 8) / 14) * (0.15-(0.05)));
            zz = -0.925 + (((tickAnim - 8) / 14) * (0-(-0.925)));
        }
        else if (tickAnim >= 22 && tickAnim < 29) {
            xx = 0 + (((tickAnim - 22) / 7) * (0-(0)));
            yy = 0.15 + (((tickAnim - 22) / 7) * (0.35-(0.15)));
            zz = 0 + (((tickAnim - 22) / 7) * (0-(0)));
        }
        else if (tickAnim >= 29 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 29) / 31) * (0-(0)));
            yy = 0.35 + (((tickAnim - 29) / 31) * (0.35-(0.35)));
            zz = 0 + (((tickAnim - 29) / 31) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 63) {
            xx = 0 + (((tickAnim - 60) / 3) * (0-(0)));
            yy = 0.35 + (((tickAnim - 60) / 3) * (1.06-(0.35)));
            zz = 0 + (((tickAnim - 60) / 3) * (0-(0)));
        }
        else if (tickAnim >= 63 && tickAnim < 68) {
            xx = 0 + (((tickAnim - 63) / 5) * (0-(0)));
            yy = 1.06 + (((tickAnim - 63) / 5) * (-0.02-(1.06)));
            zz = 0 + (((tickAnim - 63) / 5) * (-1.05-(0)));
        }
        else if (tickAnim >= 68 && tickAnim < 79) {
            xx = 0 + (((tickAnim - 68) / 11) * (0-(0)));
            yy = -0.02 + (((tickAnim - 68) / 11) * (0-(-0.02)));
            zz = -1.05 + (((tickAnim - 68) / 11) * (0-(-1.05)));
        }
        else if (tickAnim >= 79 && tickAnim < 83) {
            xx = 0 + (((tickAnim - 79) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 79) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 79) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.frontleftleg3.rotationPointX = this.frontleftleg3.rotationPointX + (float)(xx);
        this.frontleftleg3.rotationPointY = this.frontleftleg3.rotationPointY - (float)(yy);
        this.frontleftleg3.rotationPointZ = this.frontleftleg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 29) {
            xx = 0 + (((tickAnim - 0) / 29) * (-37.75-(0)));
            yy = 0 + (((tickAnim - 0) / 29) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 29) * (0-(0)));
        }
        else if (tickAnim >= 29 && tickAnim < 60) {
            xx = -37.75 + (((tickAnim - 29) / 31) * (-37.75-(-37.75)));
            yy = 0 + (((tickAnim - 29) / 31) * (0-(0)));
            zz = 0 + (((tickAnim - 29) / 31) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 83) {
            xx = -37.75 + (((tickAnim - 60) / 23) * (0-(-37.75)));
            yy = 0 + (((tickAnim - 60) / 23) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 23) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontrightleg, frontrightleg.rotateAngleX + (float) Math.toRadians(xx), frontrightleg.rotateAngleY + (float) Math.toRadians(yy), frontrightleg.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            yy = -0.05 + (((tickAnim - 0) / 6) * (0.565-(-0.05)));
            zz = 0 + (((tickAnim - 0) / 6) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 6) / 7) * (0-(0)));
            yy = 0.565 + (((tickAnim - 6) / 7) * (0.875-(0.565)));
            zz = 0 + (((tickAnim - 6) / 7) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 21) {
            xx = 0 + (((tickAnim - 13) / 8) * (0-(0)));
            yy = 0.875 + (((tickAnim - 13) / 8) * (0.7-(0.875)));
            zz = 0 + (((tickAnim - 13) / 8) * (0-(0)));
        }
        else if (tickAnim >= 21 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 21) / 7) * (0-(0)));
            yy = 0.7 + (((tickAnim - 21) / 7) * (0.255-(0.7)));
            zz = 0 + (((tickAnim - 21) / 7) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 29) {
            xx = 0 + (((tickAnim - 28) / 1) * (0-(0)));
            yy = 0.255 + (((tickAnim - 28) / 1) * (-0.075-(0.255)));
            zz = 0 + (((tickAnim - 28) / 1) * (0-(0)));
        }
        else if (tickAnim >= 29 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 29) / 31) * (0-(0)));
            yy = -0.075 + (((tickAnim - 29) / 31) * (-0.075-(-0.075)));
            zz = 0 + (((tickAnim - 29) / 31) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 66) {
            xx = 0 + (((tickAnim - 60) / 6) * (0-(0)));
            yy = -0.075 + (((tickAnim - 60) / 6) * (0.605-(-0.075)));
            zz = 0 + (((tickAnim - 60) / 6) * (0-(0)));
        }
        else if (tickAnim >= 66 && tickAnim < 71) {
            xx = 0 + (((tickAnim - 66) / 5) * (0-(0)));
            yy = 0.605 + (((tickAnim - 66) / 5) * (0.865-(0.605)));
            zz = 0 + (((tickAnim - 66) / 5) * (0-(0)));
        }
        else if (tickAnim >= 71 && tickAnim < 77) {
            xx = 0 + (((tickAnim - 71) / 6) * (0-(0)));
            yy = 0.865 + (((tickAnim - 71) / 6) * (0.61-(0.865)));
            zz = 0 + (((tickAnim - 71) / 6) * (0-(0)));
        }
        else if (tickAnim >= 77 && tickAnim < 83) {
            xx = 0 + (((tickAnim - 77) / 6) * (0-(0)));
            yy = 0.61 + (((tickAnim - 77) / 6) * (-0.05-(0.61)));
            zz = 0 + (((tickAnim - 77) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.frontrightleg.rotationPointX = this.frontrightleg.rotationPointX + (float)(xx);
        this.frontrightleg.rotationPointY = this.frontrightleg.rotationPointY - (float)(yy);
        this.frontrightleg.rotationPointZ = this.frontrightleg.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 29) {
            xx = 0 + (((tickAnim - 0) / 29) * (-16-(0)));
            yy = 0 + (((tickAnim - 0) / 29) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 29) * (0-(0)));
        }
        else if (tickAnim >= 29 && tickAnim < 60) {
            xx = -16 + (((tickAnim - 29) / 31) * (-16-(-16)));
            yy = 0 + (((tickAnim - 29) / 31) * (0-(0)));
            zz = 0 + (((tickAnim - 29) / 31) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 83) {
            xx = -16 + (((tickAnim - 60) / 23) * (0-(-16)));
            yy = 0 + (((tickAnim - 60) / 23) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 23) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontrightleg2, frontrightleg2.rotateAngleX + (float) Math.toRadians(xx), frontrightleg2.rotateAngleY + (float) Math.toRadians(yy), frontrightleg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 29 && tickAnim < 60) {
            xx = 0.1 + (((tickAnim - 29) / 31) * (0.1-(0.1)));
            yy = 0 + (((tickAnim - 29) / 31) * (0-(0)));
            zz = 0 + (((tickAnim - 29) / 31) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.frontrightleg2.rotationPointX = this.frontrightleg2.rotationPointX + (float)(xx);
        this.frontrightleg2.rotationPointY = this.frontrightleg2.rotationPointY - (float)(yy);
        this.frontrightleg2.rotationPointZ = this.frontrightleg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 29) {
            xx = 0 + (((tickAnim - 0) / 29) * (41.64705-(0)));
            yy = 0 + (((tickAnim - 0) / 29) * (4.33145-(0)));
            zz = 0 + (((tickAnim - 0) / 29) * (-2.97101-(0)));
        }
        else if (tickAnim >= 29 && tickAnim < 60) {
            xx = 41.64705 + (((tickAnim - 29) / 31) * (41.64705-(41.64705)));
            yy = 4.33145 + (((tickAnim - 29) / 31) * (4.33145-(4.33145)));
            zz = -2.97101 + (((tickAnim - 29) / 31) * (-2.97101-(-2.97101)));
        }
        else if (tickAnim >= 60 && tickAnim < 83) {
            xx = 41.64705 + (((tickAnim - 60) / 23) * (0-(41.64705)));
            yy = 4.33145 + (((tickAnim - 60) / 23) * (0-(4.33145)));
            zz = -2.97101 + (((tickAnim - 60) / 23) * (0-(-2.97101)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontrightleg3, frontrightleg3.rotateAngleX + (float) Math.toRadians(xx), frontrightleg3.rotateAngleY + (float) Math.toRadians(yy), frontrightleg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 29 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 29) / 31) * (0-(0)));
            yy = 0 + (((tickAnim - 29) / 31) * (0-(0)));
            zz = -0.9 + (((tickAnim - 29) / 31) * (-0.9-(-0.9)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.frontrightleg3.rotationPointX = this.frontrightleg3.rotationPointX + (float)(xx);
        this.frontrightleg3.rotationPointY = this.frontrightleg3.rotationPointY - (float)(yy);
        this.frontrightleg3.rotationPointZ = this.frontrightleg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 0) / 28) * (10.84961-(0)));
            yy = 0 + (((tickAnim - 0) / 28) * (1.14454-(0)));
            zz = 0 + (((tickAnim - 0) / 28) * (-3.042-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 37) {
            xx = 10.84961 + (((tickAnim - 28) / 9) * (15.84961-(10.84961)));
            yy = 1.14454 + (((tickAnim - 28) / 9) * (1.14454-(1.14454)));
            zz = -3.042 + (((tickAnim - 28) / 9) * (-3.042-(-3.042)));
        }
        else if (tickAnim >= 37 && tickAnim < 60) {
            xx = 15.84961 + (((tickAnim - 37) / 23) * (5.75-(15.84961)));
            yy = 1.14454 + (((tickAnim - 37) / 23) * (0-(1.14454)));
            zz = -3.042 + (((tickAnim - 37) / 23) * (0-(-3.042)));
        }
        else if (tickAnim >= 60 && tickAnim < 83) {
            xx = 5.75 + (((tickAnim - 60) / 23) * (0-(5.75)));
            yy = 0 + (((tickAnim - 60) / 23) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 23) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck4, neck4.rotateAngleX + (float) Math.toRadians(xx), neck4.rotateAngleY + (float) Math.toRadians(yy), neck4.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 0) / 28) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 28) * (-0.85-(0)));
            zz = 0 + (((tickAnim - 0) / 28) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 28) / 32) * (0-(0)));
            yy = -0.85 + (((tickAnim - 28) / 32) * (-0.85-(-0.85)));
            zz = 0 + (((tickAnim - 28) / 32) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 83) {
            xx = 0 + (((tickAnim - 60) / 23) * (0-(0)));
            yy = -0.85 + (((tickAnim - 60) / 23) * (0-(-0.85)));
            zz = 0 + (((tickAnim - 60) / 23) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.neck4.rotationPointX = this.neck4.rotationPointX + (float)(xx);
        this.neck4.rotationPointY = this.neck4.rotationPointY - (float)(yy);
        this.neck4.rotationPointZ = this.neck4.rotationPointZ + (float)(zz);


    }

    public void animIdle1(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraMiragaia entity = (EntityPrehistoricFloraMiragaia) entitylivingbaseIn;

        int animCycle = 130;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (2.25-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 40) {
            xx = 2.25 + (((tickAnim - 18) / 22) * (-13.75-(2.25)));
            yy = 0 + (((tickAnim - 18) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 22) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 97) {
            xx = -13.75 + (((tickAnim - 40) / 57) * (-13.75-(-13.75)));
            yy = 0 + (((tickAnim - 40) / 57) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 57) * (0-(0)));
        }
        else if (tickAnim >= 97 && tickAnim < 130) {
            xx = -13.75 + (((tickAnim - 97) / 33) * (0-(-13.75)));
            yy = 0 + (((tickAnim - 97) / 33) * (0-(0)));
            zz = 0 + (((tickAnim - 97) / 33) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(xx), body.rotateAngleY + (float) Math.toRadians(yy), body.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (-1.075-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 97) {
            xx = 0 + (((tickAnim - 40) / 57) * (0-(0)));
            yy = -1.075 + (((tickAnim - 40) / 57) * (-1.075-(-1.075)));
            zz = 0 + (((tickAnim - 40) / 57) * (0-(0)));
        }
        else if (tickAnim >= 97 && tickAnim < 130) {
            xx = 0 + (((tickAnim - 97) / 33) * (0-(0)));
            yy = -1.075 + (((tickAnim - 97) / 33) * (0-(-1.075)));
            zz = 0 + (((tickAnim - 97) / 33) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.body.rotationPointX = this.body.rotationPointX + (float)(xx);
        this.body.rotationPointY = this.body.rotationPointY - (float)(yy);
        this.body.rotationPointZ = this.body.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (-1-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 40) {
            xx = -1 + (((tickAnim - 18) / 22) * (13.5-(-1)));
            yy = 0 + (((tickAnim - 18) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 22) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 97) {
            xx = 13.5 + (((tickAnim - 40) / 57) * (13.5-(13.5)));
            yy = 0 + (((tickAnim - 40) / 57) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 57) * (0-(0)));
        }
        else if (tickAnim >= 97 && tickAnim < 130) {
            xx = 13.5 + (((tickAnim - 97) / 33) * (0-(13.5)));
            yy = 0 + (((tickAnim - 97) / 33) * (0-(0)));
            zz = 0 + (((tickAnim - 97) / 33) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backleftleg, backleftleg.rotateAngleX + (float) Math.toRadians(xx), backleftleg.rotateAngleY + (float) Math.toRadians(yy), backleftleg.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0.475-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 18) / 22) * (0-(0)));
            yy = 0.475 + (((tickAnim - 18) / 22) * (1.005-(0.475)));
            zz = 0 + (((tickAnim - 18) / 22) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 97) {
            xx = 0 + (((tickAnim - 40) / 57) * (0-(0)));
            yy = 1.005 + (((tickAnim - 40) / 57) * (1.005-(1.005)));
            zz = 0 + (((tickAnim - 40) / 57) * (0-(0)));
        }
        else if (tickAnim >= 97 && tickAnim < 130) {
            xx = 0 + (((tickAnim - 97) / 33) * (0-(0)));
            yy = 1.005 + (((tickAnim - 97) / 33) * (0-(1.005)));
            zz = 0 + (((tickAnim - 97) / 33) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.backleftleg.rotationPointX = this.backleftleg.rotationPointX + (float)(xx);
        this.backleftleg.rotationPointY = this.backleftleg.rotationPointY - (float)(yy);
        this.backleftleg.rotationPointZ = this.backleftleg.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 18) / 22) * (2.75-(0)));
            yy = 0 + (((tickAnim - 18) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 22) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 97) {
            xx = 2.75 + (((tickAnim - 40) / 57) * (2.75-(2.75)));
            yy = 0 + (((tickAnim - 40) / 57) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 57) * (0-(0)));
        }
        else if (tickAnim >= 97 && tickAnim < 130) {
            xx = 2.75 + (((tickAnim - 97) / 33) * (0-(2.75)));
            yy = 0 + (((tickAnim - 97) / 33) * (0-(0)));
            zz = 0 + (((tickAnim - 97) / 33) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backleftleg2, backleftleg2.rotateAngleX + (float) Math.toRadians(xx), backleftleg2.rotateAngleY + (float) Math.toRadians(yy), backleftleg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 18) / 22) * (5.25-(0)));
            yy = 0 + (((tickAnim - 18) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 22) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 97) {
            xx = 5.25 + (((tickAnim - 40) / 57) * (5.25-(5.25)));
            yy = 0 + (((tickAnim - 40) / 57) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 57) * (0-(0)));
        }
        else if (tickAnim >= 97 && tickAnim < 130) {
            xx = 5.25 + (((tickAnim - 97) / 33) * (0-(5.25)));
            yy = 0 + (((tickAnim - 97) / 33) * (0-(0)));
            zz = 0 + (((tickAnim - 97) / 33) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backleftleg3, backleftleg3.rotateAngleX + (float) Math.toRadians(xx), backleftleg3.rotateAngleY + (float) Math.toRadians(yy), backleftleg3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 18) / 22) * (-6-(0)));
            yy = 0 + (((tickAnim - 18) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 22) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 97) {
            xx = -6 + (((tickAnim - 40) / 57) * (-6-(-6)));
            yy = 0 + (((tickAnim - 40) / 57) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 57) * (0-(0)));
        }
        else if (tickAnim >= 97 && tickAnim < 130) {
            xx = -6 + (((tickAnim - 97) / 33) * (0-(-6)));
            yy = 0 + (((tickAnim - 97) / 33) * (0-(0)));
            zz = 0 + (((tickAnim - 97) / 33) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backleftleg4, backleftleg4.rotateAngleX + (float) Math.toRadians(xx), backleftleg4.rotateAngleY + (float) Math.toRadians(yy), backleftleg4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 21) {
            xx = 0 + (((tickAnim - 7) / 14) * (-12.5-(0)));
            yy = 0 + (((tickAnim - 7) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 14) * (0-(0)));
        }
        else if (tickAnim >= 21 && tickAnim < 40) {
            xx = -12.5 + (((tickAnim - 21) / 19) * (0.5-(-12.5)));
            yy = 0 + (((tickAnim - 21) / 19) * (0-(0)));
            zz = 0 + (((tickAnim - 21) / 19) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 97) {
            xx = 0.5 + (((tickAnim - 40) / 57) * (0.5-(0.5)));
            yy = 0 + (((tickAnim - 40) / 57) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 57) * (0-(0)));
        }
        else if (tickAnim >= 97 && tickAnim < 130) {
            xx = 0.5 + (((tickAnim - 97) / 33) * (0-(0.5)));
            yy = 0 + (((tickAnim - 97) / 33) * (0-(0)));
            zz = 0 + (((tickAnim - 97) / 33) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backrightleg, backrightleg.rotateAngleX + (float) Math.toRadians(xx), backrightleg.rotateAngleY + (float) Math.toRadians(yy), backrightleg.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (-0.25-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 7) / 7) * (0-(0)));
            yy = -0.25 + (((tickAnim - 7) / 7) * (2.845-(-0.25)));
            zz = 0 + (((tickAnim - 7) / 7) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 21) {
            xx = 0 + (((tickAnim - 14) / 7) * (0-(0)));
            yy = 2.845 + (((tickAnim - 14) / 7) * (-0.725-(2.845)));
            zz = 0 + (((tickAnim - 14) / 7) * (0-(0)));
        }
        else if (tickAnim >= 21 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 21) / 19) * (0-(0)));
            yy = -0.725 + (((tickAnim - 21) / 19) * (-0.725-(-0.725)));
            zz = 0 + (((tickAnim - 21) / 19) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 97) {
            xx = 0 + (((tickAnim - 40) / 57) * (0-(0)));
            yy = -0.725 + (((tickAnim - 40) / 57) * (-0.725-(-0.725)));
            zz = 0 + (((tickAnim - 40) / 57) * (0-(0)));
        }
        else if (tickAnim >= 97 && tickAnim < 130) {
            xx = 0 + (((tickAnim - 97) / 33) * (0-(0)));
            yy = -0.725 + (((tickAnim - 97) / 33) * (0-(-0.725)));
            zz = 0 + (((tickAnim - 97) / 33) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.backrightleg.rotationPointX = this.backrightleg.rotationPointX + (float)(xx);
        this.backrightleg.rotationPointY = this.backrightleg.rotationPointY - (float)(yy);
        this.backrightleg.rotationPointZ = this.backrightleg.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 7) / 7) * (-8.25-(0)));
            yy = 0 + (((tickAnim - 7) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 7) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 21) {
            xx = -8.25 + (((tickAnim - 14) / 7) * (-1.75-(-8.25)));
            yy = 0 + (((tickAnim - 14) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 7) * (0-(0)));
        }
        else if (tickAnim >= 21 && tickAnim < 40) {
            xx = -1.75 + (((tickAnim - 21) / 19) * (0.75-(-1.75)));
            yy = 0 + (((tickAnim - 21) / 19) * (0-(0)));
            zz = 0 + (((tickAnim - 21) / 19) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 97) {
            xx = 0.75 + (((tickAnim - 40) / 57) * (0.75-(0.75)));
            yy = 0 + (((tickAnim - 40) / 57) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 57) * (0-(0)));
        }
        else if (tickAnim >= 97 && tickAnim < 130) {
            xx = 0.75 + (((tickAnim - 97) / 33) * (0-(0.75)));
            yy = 0 + (((tickAnim - 97) / 33) * (0-(0)));
            zz = 0 + (((tickAnim - 97) / 33) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backrightleg2, backrightleg2.rotateAngleX + (float) Math.toRadians(xx), backrightleg2.rotateAngleY + (float) Math.toRadians(yy), backrightleg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 21) {
            xx = 0 + (((tickAnim - 0) / 21) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 21) * (1.1-(0)));
            zz = 0 + (((tickAnim - 0) / 21) * (-0.225-(0)));
        }
        else if (tickAnim >= 21 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 21) / 19) * (0-(0)));
            yy = 1.1 + (((tickAnim - 21) / 19) * (1.1-(1.1)));
            zz = -0.225 + (((tickAnim - 21) / 19) * (0-(-0.225)));
        }
        else if (tickAnim >= 40 && tickAnim < 97) {
            xx = 0 + (((tickAnim - 40) / 57) * (0-(0)));
            yy = 1.1 + (((tickAnim - 40) / 57) * (1.1-(1.1)));
            zz = 0 + (((tickAnim - 40) / 57) * (0-(0)));
        }
        else if (tickAnim >= 97 && tickAnim < 130) {
            xx = 0 + (((tickAnim - 97) / 33) * (0-(0)));
            yy = 1.1 + (((tickAnim - 97) / 33) * (0-(1.1)));
            zz = 0 + (((tickAnim - 97) / 33) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.backrightleg2.rotationPointX = this.backrightleg2.rotationPointX + (float)(xx);
        this.backrightleg2.rotationPointY = this.backrightleg2.rotationPointY - (float)(yy);
        this.backrightleg2.rotationPointZ = this.backrightleg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 7) / 7) * (4.39-(0)));
            yy = 0 + (((tickAnim - 7) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 7) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 21) {
            xx = 4.39 + (((tickAnim - 14) / 7) * (24-(4.39)));
            yy = 0 + (((tickAnim - 14) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 7) * (0-(0)));
        }
        else if (tickAnim >= 21 && tickAnim < 40) {
            xx = 24 + (((tickAnim - 21) / 19) * (24-(24)));
            yy = 0 + (((tickAnim - 21) / 19) * (0-(0)));
            zz = 0 + (((tickAnim - 21) / 19) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 97) {
            xx = 24 + (((tickAnim - 40) / 57) * (24-(24)));
            yy = 0 + (((tickAnim - 40) / 57) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 57) * (0-(0)));
        }
        else if (tickAnim >= 97 && tickAnim < 130) {
            xx = 24 + (((tickAnim - 97) / 33) * (0-(24)));
            yy = 0 + (((tickAnim - 97) / 33) * (0-(0)));
            zz = 0 + (((tickAnim - 97) / 33) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backrightleg3, backrightleg3.rotateAngleX + (float) Math.toRadians(xx), backrightleg3.rotateAngleY + (float) Math.toRadians(yy), backrightleg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 7 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 7) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 7) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 7) * (0.15-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 21) {
            xx = 0 + (((tickAnim - 14) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 14) / 7) * (0-(0)));
            zz = 0.15 + (((tickAnim - 14) / 7) * (-0.725-(0.15)));
        }
        else if (tickAnim >= 21 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 21) / 19) * (0-(0)));
            yy = 0 + (((tickAnim - 21) / 19) * (0-(0)));
            zz = -0.725 + (((tickAnim - 21) / 19) * (-0.725-(-0.725)));
        }
        else if (tickAnim >= 40 && tickAnim < 97) {
            xx = 0 + (((tickAnim - 40) / 57) * (0-(0)));
            yy = 0 + (((tickAnim - 40) / 57) * (0-(0)));
            zz = -0.725 + (((tickAnim - 40) / 57) * (-0.725-(-0.725)));
        }
        else if (tickAnim >= 97 && tickAnim < 130) {
            xx = 0 + (((tickAnim - 97) / 33) * (0-(0)));
            yy = 0 + (((tickAnim - 97) / 33) * (0-(0)));
            zz = -0.725 + (((tickAnim - 97) / 33) * (0-(-0.725)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.backrightleg3.rotationPointX = this.backrightleg3.rotationPointX + (float)(xx);
        this.backrightleg3.rotationPointY = this.backrightleg3.rotationPointY - (float)(yy);
        this.backrightleg3.rotationPointZ = this.backrightleg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 7) / 7) * (17-(0)));
            yy = 0 + (((tickAnim - 7) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 7) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 18) {
            xx = 17 + (((tickAnim - 14) / 4) * (-10.12-(17)));
            yy = 0 + (((tickAnim - 14) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 4) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 21) {
            xx = -10.12 + (((tickAnim - 18) / 3) * (-10-(-10.12)));
            yy = 0 + (((tickAnim - 18) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 3) * (0-(0)));
        }
        else if (tickAnim >= 21 && tickAnim < 40) {
            xx = -10 + (((tickAnim - 21) / 19) * (-10-(-10)));
            yy = 0 + (((tickAnim - 21) / 19) * (0-(0)));
            zz = 0 + (((tickAnim - 21) / 19) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 97) {
            xx = -10 + (((tickAnim - 40) / 57) * (-10-(-10)));
            yy = 0 + (((tickAnim - 40) / 57) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 57) * (0-(0)));
        }
        else if (tickAnim >= 97 && tickAnim < 130) {
            xx = -10 + (((tickAnim - 97) / 33) * (0-(-10)));
            yy = 0 + (((tickAnim - 97) / 33) * (0-(0)));
            zz = 0 + (((tickAnim - 97) / 33) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backrightleg4, backrightleg4.rotateAngleX + (float) Math.toRadians(xx), backrightleg4.rotateAngleY + (float) Math.toRadians(yy), backrightleg4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (5-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 40) {
            xx = 5 + (((tickAnim - 18) / 22) * (-3-(5)));
            yy = 0 + (((tickAnim - 18) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 22) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 97) {
            xx = -3 + (((tickAnim - 40) / 57) * (-3-(-3)));
            yy = 0 + (((tickAnim - 40) / 57) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 57) * (0-(0)));
        }
        else if (tickAnim >= 97 && tickAnim < 107) {
            xx = -3 + (((tickAnim - 97) / 10) * (0.87363-(-3)));
            yy = 0 + (((tickAnim - 97) / 10) * (-0.32783-(0)));
            zz = 0 + (((tickAnim - 97) / 10) * (2.226-(0)));
        }
        else if (tickAnim >= 107 && tickAnim < 120) {
            xx = 0.87363 + (((tickAnim - 107) / 13) * (0.36687-(0.87363)));
            yy = -0.32783 + (((tickAnim - 107) / 13) * (0.3732-(-0.32783)));
            zz = 2.226 + (((tickAnim - 107) / 13) * (-2.76067-(2.226)));
        }
        else if (tickAnim >= 120 && tickAnim < 130) {
            xx = 0.36687 + (((tickAnim - 120) / 10) * (0-(0.36687)));
            yy = 0.3732 + (((tickAnim - 120) / 10) * (0-(0.3732)));
            zz = -2.76067 + (((tickAnim - 120) / 10) * (0-(-2.76067)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body2, body2.rotateAngleX + (float) Math.toRadians(xx), body2.rotateAngleY + (float) Math.toRadians(yy), body2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 107 && tickAnim < 113) {
            xx = 0 + (((tickAnim - 107) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 107) / 6) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*2440))*-0.05-(0)));
            zz = 0 + (((tickAnim - 107) / 6) * (0-(0)));
        }
        else if (tickAnim >= 113 && tickAnim < 120) {
            xx = 0 + (((tickAnim - 113) / 7) * (0-(0)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*2440))*-0.05 + (((tickAnim - 113) / 7) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*2440))*-0.05)));
            zz = 0 + (((tickAnim - 113) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.body2.rotationPointX = this.body2.rotationPointX + (float)(xx);
        this.body2.rotationPointY = this.body2.rotationPointY - (float)(yy);
        this.body2.rotationPointZ = this.body2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (-4.25-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 40) {
            xx = -4.25 + (((tickAnim - 18) / 22) * (2.25-(-4.25)));
            yy = 0 + (((tickAnim - 18) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 22) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 97) {
            xx = 2.25 + (((tickAnim - 40) / 57) * (2.25-(2.25)));
            yy = 0 + (((tickAnim - 40) / 57) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 57) * (0-(0)));
        }
        else if (tickAnim >= 97 && tickAnim < 107) {
            xx = 2.25 + (((tickAnim - 97) / 10) * (-3.08767-(2.25)));
            yy = 0 + (((tickAnim - 97) / 10) * (-0.29791-(0)));
            zz = 0 + (((tickAnim - 97) / 10) * (-4.74067-(0)));
        }
        else if (tickAnim >= 107 && tickAnim < 120) {
            xx = -3.08767 + (((tickAnim - 107) / 13) * (0.60471-(-3.08767)));
            yy = -0.29791 + (((tickAnim - 107) / 13) * (0.18197-(-0.29791)));
            zz = -4.74067 + (((tickAnim - 107) / 13) * (2.17112-(-4.74067)));
        }
        else if (tickAnim >= 120 && tickAnim < 130) {
            xx = 0.60471 + (((tickAnim - 120) / 10) * (0-(0.60471)));
            yy = 0.18197 + (((tickAnim - 120) / 10) * (0-(0.18197)));
            zz = 2.17112 + (((tickAnim - 120) / 10) * (0-(2.17112)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(upperbody, upperbody.rotateAngleX + (float) Math.toRadians(xx), upperbody.rotateAngleY + (float) Math.toRadians(yy), upperbody.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 97 && tickAnim < 107) {
            xx = 0 + (((tickAnim - 97) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 97) / 10) * (-0.45-(0)));
            zz = 0 + (((tickAnim - 97) / 10) * (0-(0)));
        }
        else if (tickAnim >= 107 && tickAnim < 113) {
            xx = 0 + (((tickAnim - 107) / 6) * (0-(0)));
            yy = -0.45 + (((tickAnim - 107) / 6) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*2440))*0.03-(-0.45)));
            zz = 0 + (((tickAnim - 107) / 6) * (0-(0)));
        }
        else if (tickAnim >= 113 && tickAnim < 120) {
            xx = 0 + (((tickAnim - 113) / 7) * (0-(0)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*2440))*0.03 + (((tickAnim - 113) / 7) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*2440))*0.03)));
            zz = 0 + (((tickAnim - 113) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.upperbody.rotationPointX = this.upperbody.rotationPointX + (float)(xx);
        this.upperbody.rotationPointY = this.upperbody.rotationPointY - (float)(yy);
        this.upperbody.rotationPointZ = this.upperbody.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (7.75-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 40) {
            xx = 7.75 + (((tickAnim - 18) / 22) * (-2.21188-(7.75)));
            yy = 0 + (((tickAnim - 18) / 22) * (-1.24177-(0)));
            zz = 0 + (((tickAnim - 18) / 22) * (-1.75585-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 75) {
            xx = -2.21188 + (((tickAnim - 40) / 35) * (-1.21188-(-2.21188)));
            yy = -1.24177 + (((tickAnim - 40) / 35) * (-1.24177-(-1.24177)));
            zz = -1.75585 + (((tickAnim - 40) / 35) * (-1.75585-(-1.75585)));
        }
        else if (tickAnim >= 75 && tickAnim < 88) {
            xx = -1.21188 + (((tickAnim - 75) / 13) * (-2.96188-(-1.21188)));
            yy = -1.24177 + (((tickAnim - 75) / 13) * (-1.24177-(-1.24177)));
            zz = -1.75585 + (((tickAnim - 75) / 13) * (-1.75585-(-1.75585)));
        }
        else if (tickAnim >= 88 && tickAnim < 110) {
            xx = -2.96188 + (((tickAnim - 88) / 22) * (5.2311+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*-1-(-2.96188)));
            yy = -1.24177 + (((tickAnim - 88) / 22) * (7.18479-(-1.24177)));
            zz = -1.75585 + (((tickAnim - 88) / 22) * (0.97274-(-1.75585)));
        }
        else if (tickAnim >= 110 && tickAnim < 118) {
            xx = 5.2311+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*-1 + (((tickAnim - 110) / 8) * (3.2311+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*-1-(5.2311+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*-1)));
            yy = 7.18479 + (((tickAnim - 110) / 8) * (7.18479-(7.18479)));
            zz = 0.97274 + (((tickAnim - 110) / 8) * (0.97274-(0.97274)));
        }
        else if (tickAnim >= 118 && tickAnim < 130) {
            xx = 3.2311+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*-1 + (((tickAnim - 118) / 12) * (0-(3.2311+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*-1)));
            yy = 7.18479 + (((tickAnim - 118) / 12) * (0-(7.18479)));
            zz = 0.97274 + (((tickAnim - 118) / 12) * (0-(0.97274)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck4, neck4.rotateAngleX + (float) Math.toRadians(xx), neck4.rotateAngleY + (float) Math.toRadians(yy), neck4.rotateAngleZ + (float) Math.toRadians(zz));

        this.neck4.rotationPointX = this.neck4.rotationPointX + (float)(0);
        this.neck4.rotationPointY = this.neck4.rotationPointY - (float)(0);
        this.neck4.rotationPointZ = this.neck4.rotationPointZ + (float)(0);



        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (4.5-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 40) {
            xx = 4.5 + (((tickAnim - 18) / 22) * (-2.3628-(4.5)));
            yy = 0 + (((tickAnim - 18) / 22) * (-6.46559-(0)));
            zz = 0 + (((tickAnim - 18) / 22) * (-1.23889-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 75) {
            xx = -2.3628 + (((tickAnim - 40) / 35) * (1.1372-(-2.3628)));
            yy = -6.46559 + (((tickAnim - 40) / 35) * (-6.46559-(-6.46559)));
            zz = -1.23889 + (((tickAnim - 40) / 35) * (-1.23889-(-1.23889)));
        }
        else if (tickAnim >= 75 && tickAnim < 88) {
            xx = 1.1372 + (((tickAnim - 75) / 13) * (-0.8628-(1.1372)));
            yy = -6.46559 + (((tickAnim - 75) / 13) * (-6.46559-(-6.46559)));
            zz = -1.23889 + (((tickAnim - 75) / 13) * (-1.23889-(-1.23889)));
        }
        else if (tickAnim >= 88 && tickAnim < 111) {
            xx = -0.8628 + (((tickAnim - 88) / 23) * (9.1757+Math.sin((Math.PI/180)*(((double)tickAnim/20)*450))*1-(-0.8628)));
            yy = -6.46559 + (((tickAnim - 88) / 23) * (4.74884-(-6.46559)));
            zz = -1.23889 + (((tickAnim - 88) / 23) * (-0.10487-(-1.23889)));
        }
        else if (tickAnim >= 111 && tickAnim < 130) {
            xx = 9.1757+Math.sin((Math.PI/180)*(((double)tickAnim/20)*450))*1 + (((tickAnim - 111) / 19) * (0-(9.1757+Math.sin((Math.PI/180)*(((double)tickAnim/20)*450))*1)));
            yy = 4.74884 + (((tickAnim - 111) / 19) * (0-(4.74884)));
            zz = -0.10487 + (((tickAnim - 111) / 19) * (0-(-0.10487)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(xx), neck3.rotateAngleY + (float) Math.toRadians(yy), neck3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 18) / 22) * (-3.83499-(0)));
            yy = 0 + (((tickAnim - 18) / 22) * (-6.53411-(0)));
            zz = 0 + (((tickAnim - 18) / 22) * (-1.48206-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 75) {
            xx = -3.83499 + (((tickAnim - 40) / 35) * (-5.08499-(-3.83499)));
            yy = -6.53411 + (((tickAnim - 40) / 35) * (-6.53411-(-6.53411)));
            zz = -1.48206 + (((tickAnim - 40) / 35) * (-1.48206-(-1.48206)));
        }
        else if (tickAnim >= 75 && tickAnim < 88) {
            xx = -5.08499 + (((tickAnim - 75) / 13) * (-5.08499-(-5.08499)));
            yy = -6.53411 + (((tickAnim - 75) / 13) * (-6.53411-(-6.53411)));
            zz = -1.48206 + (((tickAnim - 75) / 13) * (-1.48206-(-1.48206)));
        }
        else if (tickAnim >= 88 && tickAnim < 113) {
            xx = -5.08499 + (((tickAnim - 88) / 25) * (2.9682+Math.sin((Math.PI/180)*(((double)tickAnim/20)*350))*-2-(-5.08499)));
            yy = -6.53411 + (((tickAnim - 88) / 25) * (9.16337-(-6.53411)));
            zz = -1.48206 + (((tickAnim - 88) / 25) * (-1.2684-(-1.48206)));
        }
        else if (tickAnim >= 113 && tickAnim < 130) {
            xx = 2.9682+Math.sin((Math.PI/180)*(((double)tickAnim/20)*350))*-2 + (((tickAnim - 113) / 17) * (0-(2.9682+Math.sin((Math.PI/180)*(((double)tickAnim/20)*350))*-2)));
            yy = 9.16337 + (((tickAnim - 113) / 17) * (0-(9.16337)));
            zz = -1.2684 + (((tickAnim - 113) / 17) * (0-(-1.2684)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(xx), neck2.rotateAngleY + (float) Math.toRadians(yy), neck2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (-15-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 40) {
            xx = -15 + (((tickAnim - 18) / 22) * (16.54718-(-15)));
            yy = 0 + (((tickAnim - 18) / 22) * (-4.25691-(0)));
            zz = 0 + (((tickAnim - 18) / 22) * (-4.43895-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 75) {
            xx = 16.54718 + (((tickAnim - 40) / 35) * (19.04718-(16.54718)));
            yy = -4.25691 + (((tickAnim - 40) / 35) * (-4.25691-(-4.25691)));
            zz = -4.43895 + (((tickAnim - 40) / 35) * (-4.43895-(-4.43895)));
        }
        else if (tickAnim >= 75 && tickAnim < 88) {
            xx = 19.04718 + (((tickAnim - 75) / 13) * (19.12842-(19.04718)));
            yy = -4.25691 + (((tickAnim - 75) / 13) * (-3.78181-(-4.25691)));
            zz = -4.43895 + (((tickAnim - 75) / 13) * (-5.598-(-4.43895)));
        }
        else if (tickAnim >= 88 && tickAnim < 104) {
            xx = 19.12842 + (((tickAnim - 88) / 16) * (7.25-(19.12842)));
            yy = -3.78181 + (((tickAnim - 88) / 16) * (0-(-3.78181)));
            zz = -5.598 + (((tickAnim - 88) / 16) * (0-(-5.598)));
        }
        else if (tickAnim >= 104 && tickAnim < 113) {
            xx = 7.25 + (((tickAnim - 104) / 9) * (3.1184+Math.sin((Math.PI/180)*(((double)tickAnim/20)*350))*-3-(7.25)));
            yy = 0 + (((tickAnim - 104) / 9) * (6.95486-(0)));
            zz = 0 + (((tickAnim - 104) / 9) * (0.79566-(0)));
        }
        else if (tickAnim >= 113 && tickAnim < 130) {
            xx = 3.1184+Math.sin((Math.PI/180)*(((double)tickAnim/20)*350))*-3 + (((tickAnim - 113) / 17) * (0-(3.1184+Math.sin((Math.PI/180)*(((double)tickAnim/20)*350))*-3)));
            yy = 6.95486 + (((tickAnim - 113) / 17) * (0-(6.95486)));
            zz = 0.79566 + (((tickAnim - 113) / 17) * (0-(0.79566)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(xx), neck.rotateAngleY + (float) Math.toRadians(yy), neck.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0.775-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 104) {
            xx = 0 + (((tickAnim - 18) / 86) * (0-(0)));
            yy = 0 + (((tickAnim - 18) / 86) * (0-(0)));
            zz = 0.775 + (((tickAnim - 18) / 86) * (0-(0.775)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.neck.rotationPointX = this.neck.rotationPointX + (float)(xx);
        this.neck.rotationPointY = this.neck.rotationPointY - (float)(yy);
        this.neck.rotationPointZ = this.neck.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (-15-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 40) {
            xx = -15 + (((tickAnim - 18) / 22) * (11.76024-(-15)));
            yy = 0 + (((tickAnim - 18) / 22) * (-6.62553-(0)));
            zz = 0 + (((tickAnim - 18) / 22) * (-4.49361-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 75) {
            xx = 11.76024 + (((tickAnim - 40) / 35) * (14.26024-(11.76024)));
            yy = -6.62553 + (((tickAnim - 40) / 35) * (-6.62553-(-6.62553)));
            zz = -4.49361 + (((tickAnim - 40) / 35) * (-4.49361-(-4.49361)));
        }
        else if (tickAnim >= 75 && tickAnim < 88) {
            xx = 14.26024 + (((tickAnim - 75) / 13) * (14.76923-(14.26024)));
            yy = -6.62553 + (((tickAnim - 75) / 13) * (-0.14162-(-6.62553)));
            zz = -4.49361 + (((tickAnim - 75) / 13) * (-13.08771-(-4.49361)));
        }
        else if (tickAnim >= 88 && tickAnim < 104) {
            xx = 14.76923 + (((tickAnim - 88) / 16) * (-10-(14.76923)));
            yy = -0.14162 + (((tickAnim - 88) / 16) * (0-(-0.14162)));
            zz = -13.08771 + (((tickAnim - 88) / 16) * (0-(-13.08771)));
        }
        else if (tickAnim >= 104 && tickAnim < 113) {
            xx = -10 + (((tickAnim - 104) / 9) * (1.5824+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*5-(-10)));
            yy = 0 + (((tickAnim - 104) / 9) * (6.59763-(0)));
            zz = 0 + (((tickAnim - 104) / 9) * (1.42929-(0)));
        }
        else if (tickAnim >= 113 && tickAnim < 122) {
            xx = 1.5824+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*5 + (((tickAnim - 113) / 9) * (-11.4176+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*5-(1.5824+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*5)));
            yy = 6.59763 + (((tickAnim - 113) / 9) * (6.59763-(6.59763)));
            zz = 1.42929 + (((tickAnim - 113) / 9) * (1.42929-(1.42929)));
        }
        else if (tickAnim >= 122 && tickAnim < 130) {
            xx = -11.4176+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*5 + (((tickAnim - 122) / 8) * (0-(-11.4176+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*5)));
            yy = 6.59763 + (((tickAnim - 122) / 8) * (0-(6.59763)));
            zz = 1.42929 + (((tickAnim - 122) / 8) * (0-(1.42929)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0.3-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 75) {
            xx = 0 + (((tickAnim - 40) / 35) * (0-(0)));
            yy = 0 + (((tickAnim - 40) / 35) * (0-(0)));
            zz = 0.3 + (((tickAnim - 40) / 35) * (0.3-(0.3)));
        }
        else if (tickAnim >= 75 && tickAnim < 88) {
            xx = 0 + (((tickAnim - 75) / 13) * (0-(0)));
            yy = 0 + (((tickAnim - 75) / 13) * (0-(0)));
            zz = 0.3 + (((tickAnim - 75) / 13) * (0.3-(0.3)));
        }
        else if (tickAnim >= 88 && tickAnim < 104) {
            xx = 0 + (((tickAnim - 88) / 16) * (0-(0)));
            yy = 0 + (((tickAnim - 88) / 16) * (0-(0)));
            zz = 0.3 + (((tickAnim - 88) / 16) * (0.25-(0.3)));
        }
        else if (tickAnim >= 104 && tickAnim < 113) {
            xx = 0 + (((tickAnim - 104) / 9) * (0-(0)));
            yy = 0 + (((tickAnim - 104) / 9) * (-0.15-(0)));
            zz = 0.25 + (((tickAnim - 104) / 9) * (0.13-(0.25)));
        }
        else if (tickAnim >= 113 && tickAnim < 122) {
            xx = 0 + (((tickAnim - 113) / 9) * (0-(0)));
            yy = -0.15 + (((tickAnim - 113) / 9) * (-0.15-(-0.15)));
            zz = 0.13 + (((tickAnim - 113) / 9) * (0.13-(0.13)));
        }
        else if (tickAnim >= 122 && tickAnim < 130) {
            xx = 0 + (((tickAnim - 122) / 8) * (0-(0)));
            yy = -0.15 + (((tickAnim - 122) / 8) * (0-(-0.15)));
            zz = 0.13 + (((tickAnim - 122) / 8) * (0-(0.13)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.head.rotationPointX = this.head.rotationPointX + (float)(xx);
        this.head.rotationPointY = this.head.rotationPointY - (float)(yy);
        this.head.rotationPointZ = this.head.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (-2-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 40) {
            xx = -2 + (((tickAnim - 18) / 22) * (12.5-(-2)));
            yy = 0 + (((tickAnim - 18) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 22) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 96) {
            xx = 12.5 + (((tickAnim - 40) / 56) * (12.5-(12.5)));
            yy = 0 + (((tickAnim - 40) / 56) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 56) * (0-(0)));
        }
        else if (tickAnim >= 96 && tickAnim < 110) {
            xx = 12.5 + (((tickAnim - 96) / 14) * (10.33-(12.5)));
            yy = 0 + (((tickAnim - 96) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 96) / 14) * (0-(0)));
        }
        else if (tickAnim >= 110 && tickAnim < 123) {
            xx = 10.33 + (((tickAnim - 110) / 13) * (2.64-(10.33)));
            yy = 0 + (((tickAnim - 110) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 110) / 13) * (0-(0)));
        }
        else if (tickAnim >= 123 && tickAnim < 130) {
            xx = 2.64 + (((tickAnim - 123) / 7) * (0-(2.64)));
            yy = 0 + (((tickAnim - 123) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 123) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontleftleg, frontleftleg.rotateAngleX + (float) Math.toRadians(xx), frontleftleg.rotateAngleY + (float) Math.toRadians(yy), frontleftleg.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (1.975-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 18) / 22) * (0-(0)));
            yy = 1.975 + (((tickAnim - 18) / 22) * (0-(1.975)));
            zz = 0 + (((tickAnim - 18) / 22) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 96) {
            xx = 0 + (((tickAnim - 40) / 56) * (0-(0)));
            yy = 0 + (((tickAnim - 40) / 56) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 56) * (0-(0)));
        }
        else if (tickAnim >= 96 && tickAnim < 107) {
            xx = 0 + (((tickAnim - 96) / 11) * (0-(0)));
            yy = 0 + (((tickAnim - 96) / 11) * (-3.18-(0)));
            zz = 0 + (((tickAnim - 96) / 11) * (0-(0)));
        }
        else if (tickAnim >= 107 && tickAnim < 110) {
            xx = 0 + (((tickAnim - 107) / 3) * (0-(0)));
            yy = -3.18 + (((tickAnim - 107) / 3) * (-3.025-(-3.18)));
            zz = 0 + (((tickAnim - 107) / 3) * (0-(0)));
        }
        else if (tickAnim >= 110 && tickAnim < 116) {
            xx = 0 + (((tickAnim - 110) / 6) * (0-(0)));
            yy = -3.025 + (((tickAnim - 110) / 6) * (-2.925+Math.sin((Math.PI/180)*(((double)tickAnim/20)*2550))*0.1-(-3.025)));
            zz = 0 + (((tickAnim - 110) / 6) * (0-(0)));
        }
        else if (tickAnim >= 116 && tickAnim < 123) {
            xx = 0 + (((tickAnim - 116) / 7) * (0-(0)));
            yy = -2.925+Math.sin((Math.PI/180)*(((double)tickAnim/20)*2550))*0.1 + (((tickAnim - 116) / 7) * (-1.3-(-2.925+Math.sin((Math.PI/180)*(((double)tickAnim/20)*2550))*0.1)));
            zz = 0 + (((tickAnim - 116) / 7) * (0-(0)));
        }
        else if (tickAnim >= 123 && tickAnim < 130) {
            xx = 0 + (((tickAnim - 123) / 7) * (0-(0)));
            yy = -1.3 + (((tickAnim - 123) / 7) * (0-(-1.3)));
            zz = 0 + (((tickAnim - 123) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.frontleftleg.rotationPointX = this.frontleftleg.rotationPointX + (float)(xx);
        this.frontleftleg.rotationPointY = this.frontleftleg.rotationPointY - (float)(yy);
        this.frontleftleg.rotationPointZ = this.frontleftleg.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 18) / 22) * (16.25-(0)));
            yy = 0 + (((tickAnim - 18) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 22) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 96) {
            xx = 16.25 + (((tickAnim - 40) / 56) * (16.25-(16.25)));
            yy = 0 + (((tickAnim - 40) / 56) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 56) * (0-(0)));
        }
        else if (tickAnim >= 96 && tickAnim < 103) {
            xx = 16.25 + (((tickAnim - 96) / 7) * (19.75-(16.25)));
            yy = 0 + (((tickAnim - 96) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 96) / 7) * (0-(0)));
        }
        else if (tickAnim >= 103 && tickAnim < 114) {
            xx = 19.75 + (((tickAnim - 103) / 11) * (0.95-(19.75)));
            yy = 0 + (((tickAnim - 103) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 103) / 11) * (0-(0)));
        }
        else if (tickAnim >= 114 && tickAnim < 130) {
            xx = 0.95 + (((tickAnim - 114) / 16) * (0-(0.95)));
            yy = 0 + (((tickAnim - 114) / 16) * (0-(0)));
            zz = 0 + (((tickAnim - 114) / 16) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontleftleg2, frontleftleg2.rotateAngleX + (float) Math.toRadians(xx), frontleftleg2.rotateAngleY + (float) Math.toRadians(yy), frontleftleg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 103) {
            xx = 0 + (((tickAnim - 0) / 103) * (-0.525-(0)));
            yy = 0 + (((tickAnim - 0) / 103) * (0.75-(0)));
            zz = 0 + (((tickAnim - 0) / 103) * (0-(0)));
        }
        else if (tickAnim >= 103 && tickAnim < 130) {
            xx = -0.525 + (((tickAnim - 103) / 27) * (0-(-0.525)));
            yy = 0.75 + (((tickAnim - 103) / 27) * (0-(0.75)));
            zz = 0 + (((tickAnim - 103) / 27) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.frontleftleg2.rotationPointX = this.frontleftleg2.rotationPointX + (float)(xx);
        this.frontleftleg2.rotationPointY = this.frontleftleg2.rotationPointY - (float)(yy);
        this.frontleftleg2.rotationPointZ = this.frontleftleg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 18 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 18) / 22) * (34-(0)));
            yy = 0 + (((tickAnim - 18) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 22) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 96) {
            xx = 34 + (((tickAnim - 40) / 56) * (34-(34)));
            yy = 0 + (((tickAnim - 40) / 56) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 56) * (0-(0)));
        }
        else if (tickAnim >= 96 && tickAnim < 103) {
            xx = 34 + (((tickAnim - 96) / 7) * (22.25-(34)));
            yy = 0 + (((tickAnim - 96) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 96) / 7) * (0-(0)));
        }
        else if (tickAnim >= 103 && tickAnim < 112) {
            xx = 22.25 + (((tickAnim - 103) / 9) * (-5.75-(22.25)));
            yy = 0 + (((tickAnim - 103) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 103) / 9) * (0-(0)));
        }
        else if (tickAnim >= 112 && tickAnim < 121) {
            xx = -5.75 + (((tickAnim - 112) / 9) * (-1.75+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150))*1-(-5.75)));
            yy = 0 + (((tickAnim - 112) / 9) * (-0.62743-(0)));
            zz = 0 + (((tickAnim - 112) / 9) * (1.67373-(0)));
        }
        else if (tickAnim >= 121 && tickAnim < 130) {
            xx = -1.75+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150))*1 + (((tickAnim - 121) / 9) * (0-(-1.75+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150))*1)));
            yy = -0.62743 + (((tickAnim - 121) / 9) * (0-(-0.62743)));
            zz = 1.67373 + (((tickAnim - 121) / 9) * (0-(1.67373)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontleftleg3, frontleftleg3.rotateAngleX + (float) Math.toRadians(xx), frontleftleg3.rotateAngleY + (float) Math.toRadians(yy), frontleftleg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 18 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 18) / 22) * (0-(0)));
            yy = 0 + (((tickAnim - 18) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 22) * (-1.075-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 96) {
            xx = 0 + (((tickAnim - 40) / 56) * (0-(0)));
            yy = 0 + (((tickAnim - 40) / 56) * (0-(0)));
            zz = -1.075 + (((tickAnim - 40) / 56) * (-1.075-(-1.075)));
        }
        else if (tickAnim >= 96 && tickAnim < 103) {
            xx = 0 + (((tickAnim - 96) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 96) / 7) * (0-(0)));
            zz = -1.075 + (((tickAnim - 96) / 7) * (-0.875-(-1.075)));
        }
        else if (tickAnim >= 103 && tickAnim < 112) {
            xx = 0 + (((tickAnim - 103) / 9) * (0-(0)));
            yy = 0 + (((tickAnim - 103) / 9) * (0-(0)));
            zz = -0.875 + (((tickAnim - 103) / 9) * (0-(-0.875)));
        }
        else if (tickAnim >= 112 && tickAnim < 130) {
            xx = 0 + (((tickAnim - 112) / 18) * (0-(0)));
            yy = 0 + (((tickAnim - 112) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 112) / 18) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.frontleftleg3.rotationPointX = this.frontleftleg3.rotationPointX + (float)(xx);
        this.frontleftleg3.rotationPointY = this.frontleftleg3.rotationPointY - (float)(yy);
        this.frontleftleg3.rotationPointZ = this.frontleftleg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (-1.5-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 40) {
            xx = -1.5 + (((tickAnim - 18) / 22) * (3.5-(-1.5)));
            yy = 0 + (((tickAnim - 18) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 22) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 96) {
            xx = 3.5 + (((tickAnim - 40) / 56) * (3.5-(3.5)));
            yy = 0 + (((tickAnim - 40) / 56) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 56) * (0-(0)));
        }
        else if (tickAnim >= 96 && tickAnim < 107) {
            xx = 3.5 + (((tickAnim - 96) / 11) * (-24.75-(3.5)));
            yy = 0 + (((tickAnim - 96) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 96) / 11) * (0-(0)));
        }
        else if (tickAnim >= 107 && tickAnim < 115) {
            xx = -24.75 + (((tickAnim - 107) / 8) * (-24.75-(-24.75)));
            yy = 0 + (((tickAnim - 107) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 107) / 8) * (0-(0)));
        }
        else if (tickAnim >= 115 && tickAnim < 123) {
            xx = -24.75 + (((tickAnim - 115) / 8) * (-3.75-(-24.75)));
            yy = 0 + (((tickAnim - 115) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 115) / 8) * (0-(0)));
        }
        else if (tickAnim >= 123 && tickAnim < 130) {
            xx = -3.75 + (((tickAnim - 123) / 7) * (0-(-3.75)));
            yy = 0 + (((tickAnim - 123) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 123) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontrightleg, frontrightleg.rotateAngleX + (float) Math.toRadians(xx), frontrightleg.rotateAngleY + (float) Math.toRadians(yy), frontrightleg.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (1.975-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 18) / 22) * (0-(0)));
            yy = 1.975 + (((tickAnim - 18) / 22) * (1.125-(1.975)));
            zz = 0 + (((tickAnim - 18) / 22) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 96) {
            xx = 0 + (((tickAnim - 40) / 56) * (0-(0)));
            yy = 1.125 + (((tickAnim - 40) / 56) * (1.125-(1.125)));
            zz = 0 + (((tickAnim - 40) / 56) * (0-(0)));
        }
        else if (tickAnim >= 96 && tickAnim < 107) {
            xx = 0 + (((tickAnim - 96) / 11) * (0-(0)));
            yy = 1.125 + (((tickAnim - 96) / 11) * (-0.385-(1.125)));
            zz = 0 + (((tickAnim - 96) / 11) * (0-(0)));
        }
        else if (tickAnim >= 107 && tickAnim < 111) {
            xx = 0 + (((tickAnim - 107) / 4) * (0-(0)));
            yy = -0.385 + (((tickAnim - 107) / 4) * (-1.91+Math.sin((Math.PI/180)*(((double)tickAnim/20)*2550))*0.2-(-0.385)));
            zz = 0 + (((tickAnim - 107) / 4) * (0-(0)));
        }
        else if (tickAnim >= 111 && tickAnim < 113) {
            xx = 0 + (((tickAnim - 111) / 2) * (0-(0)));
            yy = -1.91+Math.sin((Math.PI/180)*(((double)tickAnim/20)*2550))*0.2 + (((tickAnim - 111) / 2) * (-2.235-(-1.91+Math.sin((Math.PI/180)*(((double)tickAnim/20)*2550))*0.2)));
            zz = 0 + (((tickAnim - 111) / 2) * (0-(0)));
        }
        else if (tickAnim >= 113 && tickAnim < 115) {
            xx = 0 + (((tickAnim - 113) / 2) * (0-(0)));
            yy = -2.235 + (((tickAnim - 113) / 2) * (-2.35-(-2.235)));
            zz = 0 + (((tickAnim - 113) / 2) * (0-(0)));
        }
        else if (tickAnim >= 115 && tickAnim < 123) {
            xx = 0 + (((tickAnim - 115) / 8) * (0-(0)));
            yy = -2.35 + (((tickAnim - 115) / 8) * (1.42-(-2.35)));
            zz = 0 + (((tickAnim - 115) / 8) * (0-(0)));
        }
        else if (tickAnim >= 123 && tickAnim < 130) {
            xx = 0 + (((tickAnim - 123) / 7) * (0-(0)));
            yy = 1.42 + (((tickAnim - 123) / 7) * (0-(1.42)));
            zz = 0 + (((tickAnim - 123) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.frontrightleg.rotationPointX = this.frontrightleg.rotationPointX + (float)(xx);
        this.frontrightleg.rotationPointY = this.frontrightleg.rotationPointY - (float)(yy);
        this.frontrightleg.rotationPointZ = this.frontrightleg.rotationPointZ + (float)(zz);




        if (tickAnim >= 18 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 18) / 22) * (21.75-(0)));
            yy = 0 + (((tickAnim - 18) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 22) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 95) {
            xx = 21.75 + (((tickAnim - 40) / 55) * (21.75-(21.75)));
            yy = 0 + (((tickAnim - 40) / 55) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 55) * (0-(0)));
        }
        else if (tickAnim >= 95 && tickAnim < 107) {
            xx = 21.75 + (((tickAnim - 95) / 12) * (23.94-(21.75)));
            yy = 0 + (((tickAnim - 95) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 95) / 12) * (0-(0)));
        }
        else if (tickAnim >= 107 && tickAnim < 123) {
            xx = 23.94 + (((tickAnim - 107) / 16) * (-10.53-(23.94)));
            yy = 0 + (((tickAnim - 107) / 16) * (0-(0)));
            zz = 0 + (((tickAnim - 107) / 16) * (0-(0)));
        }
        else if (tickAnim >= 123 && tickAnim < 130) {
            xx = -10.53 + (((tickAnim - 123) / 7) * (0-(-10.53)));
            yy = 0 + (((tickAnim - 123) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 123) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontrightleg2, frontrightleg2.rotateAngleX + (float) Math.toRadians(xx), frontrightleg2.rotateAngleY + (float) Math.toRadians(yy), frontrightleg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 95 && tickAnim < 99) {
            xx = 0 + (((tickAnim - 95) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 95) / 4) * (0.945-(0)));
            zz = 0 + (((tickAnim - 95) / 4) * (0-(0)));
        }
        else if (tickAnim >= 99 && tickAnim < 107) {
            xx = 0 + (((tickAnim - 99) / 8) * (0-(0)));
            yy = 0.945 + (((tickAnim - 99) / 8) * (-0.525-(0.945)));
            zz = 0 + (((tickAnim - 99) / 8) * (0-(0)));
        }
        else if (tickAnim >= 107 && tickAnim < 115) {
            xx = 0 + (((tickAnim - 107) / 8) * (0-(0)));
            yy = -0.525 + (((tickAnim - 107) / 8) * (-0.08-(-0.525)));
            zz = 0 + (((tickAnim - 107) / 8) * (0-(0)));
        }
        else if (tickAnim >= 115 && tickAnim < 123) {
            xx = 0 + (((tickAnim - 115) / 8) * (0-(0)));
            yy = -0.08 + (((tickAnim - 115) / 8) * (0.37-(-0.08)));
            zz = 0 + (((tickAnim - 115) / 8) * (0-(0)));
        }
        else if (tickAnim >= 123 && tickAnim < 130) {
            xx = 0 + (((tickAnim - 123) / 7) * (0-(0)));
            yy = 0.37 + (((tickAnim - 123) / 7) * (0-(0.37)));
            zz = 0 + (((tickAnim - 123) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.frontrightleg2.rotationPointX = this.frontrightleg2.rotationPointX + (float)(xx);
        this.frontrightleg2.rotationPointY = this.frontrightleg2.rotationPointY - (float)(yy);
        this.frontrightleg2.rotationPointZ = this.frontrightleg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 18) / 22) * (24.25-(0)));
            yy = 0 + (((tickAnim - 18) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 22) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 95) {
            xx = 24.25 + (((tickAnim - 40) / 55) * (24.25-(24.25)));
            yy = 0 + (((tickAnim - 40) / 55) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 55) * (0-(0)));
        }
        else if (tickAnim >= 95 && tickAnim < 107) {
            xx = 24.25 + (((tickAnim - 95) / 12) * (7.75-(24.25)));
            yy = 0 + (((tickAnim - 95) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 95) / 12) * (0-(0)));
        }
        else if (tickAnim >= 107 && tickAnim < 115) {
            xx = 7.75 + (((tickAnim - 107) / 8) * (22.54188-(7.75)));
            yy = 0 + (((tickAnim - 107) / 8) * (2.14546-(0)));
            zz = 0 + (((tickAnim - 107) / 8) * (-3.38409-(0)));
        }
        else if (tickAnim >= 115 && tickAnim < 123) {
            xx = 22.54188 + (((tickAnim - 115) / 8) * (27.88-(22.54188)));
            yy = 2.14546 + (((tickAnim - 115) / 8) * (0-(2.14546)));
            zz = -3.38409 + (((tickAnim - 115) / 8) * (0-(-3.38409)));
        }
        else if (tickAnim >= 123 && tickAnim < 130) {
            xx = 27.88 + (((tickAnim - 123) / 7) * (0-(27.88)));
            yy = 0 + (((tickAnim - 123) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 123) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontrightleg3, frontrightleg3.rotateAngleX + (float) Math.toRadians(xx), frontrightleg3.rotateAngleY + (float) Math.toRadians(yy), frontrightleg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (-0.575-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 95) {
            xx = 0 + (((tickAnim - 40) / 55) * (0-(0)));
            yy = 0 + (((tickAnim - 40) / 55) * (0-(0)));
            zz = -0.575 + (((tickAnim - 40) / 55) * (-0.575-(-0.575)));
        }
        else if (tickAnim >= 95 && tickAnim < 107) {
            xx = 0 + (((tickAnim - 95) / 12) * (0-(0)));
            yy = 0 + (((tickAnim - 95) / 12) * (0-(0)));
            zz = -0.575 + (((tickAnim - 95) / 12) * (0-(-0.575)));
        }
        else if (tickAnim >= 107 && tickAnim < 123) {
            xx = 0 + (((tickAnim - 107) / 16) * (0-(0)));
            yy = 0 + (((tickAnim - 107) / 16) * (0-(0)));
            zz = 0 + (((tickAnim - 107) / 16) * (-0.75-(0)));
        }
        else if (tickAnim >= 123 && tickAnim < 130) {
            xx = 0 + (((tickAnim - 123) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 123) / 7) * (0-(0)));
            zz = -0.75 + (((tickAnim - 123) / 7) * (0-(-0.75)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.frontrightleg3.rotationPointX = this.frontrightleg3.rotationPointX + (float)(xx);
        this.frontrightleg3.rotationPointY = this.frontrightleg3.rotationPointY - (float)(yy);
        this.frontrightleg3.rotationPointZ = this.frontrightleg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (3.51598-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (-0.66026-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0.23119-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 40) {
            xx = 3.51598 + (((tickAnim - 18) / 22) * (-13-(3.51598)));
            yy = -0.66026 + (((tickAnim - 18) / 22) * (0-(-0.66026)));
            zz = 0.23119 + (((tickAnim - 18) / 22) * (0-(0.23119)));
        }
        else if (tickAnim >= 40 && tickAnim < 96) {
            xx = -13 + (((tickAnim - 40) / 56) * (-13-(-13)));
            yy = 0 + (((tickAnim - 40) / 56) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 56) * (0-(0)));
        }
        else if (tickAnim >= 96 && tickAnim < 130) {
            xx = -13 + (((tickAnim - 96) / 34) * (0-(-13)));
            yy = 0 + (((tickAnim - 96) / 34) * (0-(0)));
            zz = 0 + (((tickAnim - 96) / 34) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail, tail.rotateAngleX + (float) Math.toRadians(xx), tail.rotateAngleY + (float) Math.toRadians(yy), tail.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (-0.25-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 40) {
            xx = -0.25 + (((tickAnim - 18) / 22) * (-5-(-0.25)));
            yy = 0 + (((tickAnim - 18) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 22) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 96) {
            xx = -5 + (((tickAnim - 40) / 56) * (-5-(-5)));
            yy = 0 + (((tickAnim - 40) / 56) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 56) * (0-(0)));
        }
        else if (tickAnim >= 96 && tickAnim < 130) {
            xx = -5 + (((tickAnim - 96) / 34) * (0-(-5)));
            yy = 0 + (((tickAnim - 96) / 34) * (0-(0)));
            zz = 0 + (((tickAnim - 96) / 34) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(xx), tail2.rotateAngleY + (float) Math.toRadians(yy), tail2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (-1.25-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 40) {
            xx = -1.25 + (((tickAnim - 18) / 22) * (-5-(-1.25)));
            yy = 0 + (((tickAnim - 18) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 22) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 96) {
            xx = -5 + (((tickAnim - 40) / 56) * (-5-(-5)));
            yy = 0 + (((tickAnim - 40) / 56) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 56) * (0-(0)));
        }
        else if (tickAnim >= 96 && tickAnim < 130) {
            xx = -5 + (((tickAnim - 96) / 34) * (0-(-5)));
            yy = 0 + (((tickAnim - 96) / 34) * (0-(0)));
            zz = 0 + (((tickAnim - 96) / 34) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(xx), tail3.rotateAngleY + (float) Math.toRadians(yy), tail3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (2.08-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 34) {
            xx = 2.08 + (((tickAnim - 18) / 16) * (4.58-(2.08)));
            yy = 0 + (((tickAnim - 18) / 16) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 16) * (0-(0)));
        }
        else if (tickAnim >= 34 && tickAnim < 40) {
            xx = 4.58 + (((tickAnim - 34) / 6) * (16-(4.58)));
            yy = 0 + (((tickAnim - 34) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 34) / 6) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 96) {
            xx = 16 + (((tickAnim - 40) / 56) * (16-(16)));
            yy = 0 + (((tickAnim - 40) / 56) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 56) * (0-(0)));
        }
        else if (tickAnim >= 96 && tickAnim < 107) {
            xx = 16 + (((tickAnim - 96) / 11) * (6.43-(16)));
            yy = 0 + (((tickAnim - 96) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 96) / 11) * (0-(0)));
        }
        else if (tickAnim >= 107 && tickAnim < 130) {
            xx = 6.43 + (((tickAnim - 107) / 23) * (0-(6.43)));
            yy = 0 + (((tickAnim - 107) / 23) * (0-(0)));
            zz = 0 + (((tickAnim - 107) / 23) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(xx), tail4.rotateAngleY + (float) Math.toRadians(yy), tail4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (2.95-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 35) {
            xx = 2.95 + (((tickAnim - 18) / 17) * (9.24-(2.95)));
            yy = 0 + (((tickAnim - 18) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 17) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 40) {
            xx = 9.24 + (((tickAnim - 35) / 5) * (24-(9.24)));
            yy = 0 + (((tickAnim - 35) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 5) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 96) {
            xx = 24 + (((tickAnim - 40) / 56) * (24-(24)));
            yy = 0 + (((tickAnim - 40) / 56) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 56) * (0-(0)));
        }
        else if (tickAnim >= 96 && tickAnim < 107) {
            xx = 24 + (((tickAnim - 96) / 11) * (11.39-(24)));
            yy = 0 + (((tickAnim - 96) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 96) / 11) * (0-(0)));
        }
        else if (tickAnim >= 107 && tickAnim < 114) {
            xx = 11.39 + (((tickAnim - 107) / 7) * (4.73-(11.39)));
            yy = 0 + (((tickAnim - 107) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 107) / 7) * (0-(0)));
        }
        else if (tickAnim >= 114 && tickAnim < 130) {
            xx = 4.73 + (((tickAnim - 114) / 16) * (0-(4.73)));
            yy = 0 + (((tickAnim - 114) / 16) * (0-(0)));
            zz = 0 + (((tickAnim - 114) / 16) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail5, tail5.rotateAngleX + (float) Math.toRadians(xx), tail5.rotateAngleY + (float) Math.toRadians(yy), tail5.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (14.3-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 31) {
            xx = 14.3 + (((tickAnim - 18) / 13) * (17.74-(14.3)));
            yy = 0 + (((tickAnim - 18) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 13) * (0-(0)));
        }
        else if (tickAnim >= 31 && tickAnim < 35) {
            xx = 17.74 + (((tickAnim - 31) / 4) * (36.97-(17.74)));
            yy = 0 + (((tickAnim - 31) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 31) / 4) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 40) {
            xx = 36.97 + (((tickAnim - 35) / 5) * (43-(36.97)));
            yy = 0 + (((tickAnim - 35) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 5) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 96) {
            xx = 43 + (((tickAnim - 40) / 56) * (43-(43)));
            yy = 0 + (((tickAnim - 40) / 56) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 56) * (0-(0)));
        }
        else if (tickAnim >= 96 && tickAnim < 107) {
            xx = 43 + (((tickAnim - 96) / 11) * (26.62-(43)));
            yy = 0 + (((tickAnim - 96) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 96) / 11) * (0-(0)));
        }
        else if (tickAnim >= 107 && tickAnim < 114) {
            xx = 26.62 + (((tickAnim - 107) / 7) * (13.06-(26.62)));
            yy = 0 + (((tickAnim - 107) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 107) / 7) * (0-(0)));
        }
        else if (tickAnim >= 114 && tickAnim < 130) {
            xx = 13.06 + (((tickAnim - 114) / 16) * (0-(13.06)));
            yy = 0 + (((tickAnim - 114) / 16) * (0-(0)));
            zz = 0 + (((tickAnim - 114) / 16) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail6, tail6.rotateAngleX + (float) Math.toRadians(xx), tail6.rotateAngleY + (float) Math.toRadians(yy), tail6.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 18) / 22) * (0-(0)));
            yy = 0 + (((tickAnim - 18) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 22) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.tail6.rotationPointX = this.tail6.rotationPointX + (float)(xx);
        this.tail6.rotationPointY = this.tail6.rotationPointY - (float)(yy);
        this.tail6.rotationPointZ = this.tail6.rotationPointZ + (float)(zz);




        if (tickAnim >= 40 && tickAnim < 96) {
            xx = 0 + (((tickAnim - 40) / 56) * (0-(0)));
            yy = 0 + (((tickAnim - 40) / 56) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 56) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(xx), jaw.rotateAngleY + (float) Math.toRadians(yy), jaw.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 34 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 34) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 34) / 1) * (-0.1-(0)));
            zz = 0 + (((tickAnim - 34) / 1) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 36) {
            xx = 0 + (((tickAnim - 35) / 1) * (0-(0)));
            yy = -0.1 + (((tickAnim - 35) / 1) * (0-(-0.1)));
            zz = 0 + (((tickAnim - 35) / 1) * (0-(0)));
        }
        else if (tickAnim >= 36 && tickAnim < 37) {
            xx = 0 + (((tickAnim - 36) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 36) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 36) / 1) * (0-(0)));
        }
        else if (tickAnim >= 37 && tickAnim < 38) {
            xx = 0 + (((tickAnim - 37) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 37) / 1) * (-0.1-(0)));
            zz = 0 + (((tickAnim - 37) / 1) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 38) {
            xx = 0 + (((tickAnim - 38) / 0) * (0-(0)));
            yy = -0.1 + (((tickAnim - 38) / 0) * (0-(-0.1)));
            zz = 0 + (((tickAnim - 38) / 0) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 39) {
            xx = 0 + (((tickAnim - 38) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 38) / 1) * (-0.1-(0)));
            zz = 0 + (((tickAnim - 38) / 1) * (0-(0)));
        }
        else if (tickAnim >= 39 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 39) / 1) * (0-(0)));
            yy = -0.1 + (((tickAnim - 39) / 1) * (0-(-0.1)));
            zz = 0 + (((tickAnim - 39) / 1) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 41) {
            xx = 0 + (((tickAnim - 40) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 40) / 1) * (-0.1-(0)));
            zz = 0 + (((tickAnim - 40) / 1) * (0-(0)));
        }
        else if (tickAnim >= 41 && tickAnim < 42) {
            xx = 0 + (((tickAnim - 41) / 1) * (0-(0)));
            yy = -0.1 + (((tickAnim - 41) / 1) * (0-(-0.1)));
            zz = 0 + (((tickAnim - 41) / 1) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.lefttailSpike2.rotationPointX = this.lefttailSpike2.rotationPointX + (float)(xx);
        this.lefttailSpike2.rotationPointY = this.lefttailSpike2.rotationPointY - (float)(yy);
        this.lefttailSpike2.rotationPointZ = this.lefttailSpike2.rotationPointZ + (float)(zz);




        if (tickAnim >= 34 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 34) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 34) / 1) * (-0.1-(0)));
            zz = 0 + (((tickAnim - 34) / 1) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 36) {
            xx = 0 + (((tickAnim - 35) / 1) * (0-(0)));
            yy = -0.1 + (((tickAnim - 35) / 1) * (0-(-0.1)));
            zz = 0 + (((tickAnim - 35) / 1) * (0-(0)));
        }
        else if (tickAnim >= 36 && tickAnim < 37) {
            xx = 0 + (((tickAnim - 36) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 36) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 36) / 1) * (0-(0)));
        }
        else if (tickAnim >= 37 && tickAnim < 38) {
            xx = 0 + (((tickAnim - 37) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 37) / 1) * (-0.1-(0)));
            zz = 0 + (((tickAnim - 37) / 1) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 38) {
            xx = 0 + (((tickAnim - 38) / 0) * (0-(0)));
            yy = -0.1 + (((tickAnim - 38) / 0) * (0-(-0.1)));
            zz = 0 + (((tickAnim - 38) / 0) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 39) {
            xx = 0 + (((tickAnim - 38) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 38) / 1) * (-0.1-(0)));
            zz = 0 + (((tickAnim - 38) / 1) * (0-(0)));
        }
        else if (tickAnim >= 39 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 39) / 1) * (0-(0)));
            yy = -0.1 + (((tickAnim - 39) / 1) * (0-(-0.1)));
            zz = 0 + (((tickAnim - 39) / 1) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 41) {
            xx = 0 + (((tickAnim - 40) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 40) / 1) * (-0.1-(0)));
            zz = 0 + (((tickAnim - 40) / 1) * (0-(0)));
        }
        else if (tickAnim >= 41 && tickAnim < 42) {
            xx = 0 + (((tickAnim - 41) / 1) * (0-(0)));
            yy = -0.1 + (((tickAnim - 41) / 1) * (0-(-0.1)));
            zz = 0 + (((tickAnim - 41) / 1) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.righttailSpike2.rotationPointX = this.righttailSpike2.rotationPointX + (float)(xx);
        this.righttailSpike2.rotationPointY = this.righttailSpike2.rotationPointY - (float)(yy);
        this.righttailSpike2.rotationPointZ = this.righttailSpike2.rotationPointZ + (float)(zz);




        if (tickAnim >= 28 && tickAnim < 35) {
            xx = 1 + (((tickAnim - 28) / 7) * (1-(1)));
            yy = 1 + (((tickAnim - 28) / 7) * (0.035-(1)));
            zz = 1 + (((tickAnim - 28) / 7) * (1-(1)));
        }
        else if (tickAnim >= 35 && tickAnim < 42) {
            xx = 1 + (((tickAnim - 35) / 7) * (1-(1)));
            yy = 0.035 + (((tickAnim - 35) / 7) * (1-(0.035)));
            zz = 1 + (((tickAnim - 35) / 7) * (1-(1)));
        }
        else if (tickAnim >= 42 && tickAnim < 75) {
            xx = 1 + (((tickAnim - 42) / 33) * (1-(1)));
            yy = 1 + (((tickAnim - 42) / 33) * (1-(1)));
            zz = 1 + (((tickAnim - 42) / 33) * (1-(1)));
        }
        else if (tickAnim >= 75 && tickAnim < 83) {
            xx = 1 + (((tickAnim - 75) / 8) * (1-(1)));
            yy = 1 + (((tickAnim - 75) / 8) * (0.035-(1)));
            zz = 1 + (((tickAnim - 75) / 8) * (1-(1)));
        }
        else if (tickAnim >= 83 && tickAnim < 89) {
            xx = 1 + (((tickAnim - 83) / 6) * (1-(1)));
            yy = 0.035 + (((tickAnim - 83) / 6) * (1-(0.035)));
            zz = 1 + (((tickAnim - 83) / 6) * (1-(1)));
        }
        else {
            xx = 1;
            yy = 1;
            zz = 1;
        }
        this.Eye.setScale((float)xx, (float)yy, (float)zz);

    }

    public void animIdle2(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraMiragaia entity = (EntityPrehistoricFloraMiragaia) entitylivingbaseIn;

        int animCycle = 200;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (-15.8063+Math.sin((Math.PI/180)*(((double)tickAnim/20)*380+90))*0.5-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (3.09028-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (-0.83328-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 39) {
            xx = -15.8063+Math.sin((Math.PI/180)*(((double)tickAnim/20)*380+90))*0.5 + (((tickAnim - 18) / 21) * (-7.64968-(-15.8063+Math.sin((Math.PI/180)*(((double)tickAnim/20)*380+90))*0.5)));
            yy = 3.09028 + (((tickAnim - 18) / 21) * (7.96703-(3.09028)));
            zz = -0.83328 + (((tickAnim - 18) / 21) * (-2.14913-(-0.83328)));
        }
        else if (tickAnim >= 39 && tickAnim < 152) {
            xx = -7.64968 + (((tickAnim - 39) / 113) * (-7.64968-(-7.64968)));
            yy = 7.96703 + (((tickAnim - 39) / 113) * (7.96703-(7.96703)));
            zz = -2.14913 + (((tickAnim - 39) / 113) * (-2.14913-(-2.14913)));
        }
        else if (tickAnim >= 152 && tickAnim < 166) {
            xx = -7.64968 + (((tickAnim - 152) / 14) * (-11.00632-(-7.64968)));
            yy = 7.96703 + (((tickAnim - 152) / 14) * (6.11437-(7.96703)));
            zz = -2.14913 + (((tickAnim - 152) / 14) * (2.24365-(-2.14913)));
        }
        else if (tickAnim >= 166 && tickAnim < 180) {
            xx = -11.00632 + (((tickAnim - 166) / 14) * (-6.59282-(-11.00632)));
            yy = 6.11437 + (((tickAnim - 166) / 14) * (2.87153-(6.11437)));
            zz = 2.24365 + (((tickAnim - 166) / 14) * (-1.66946-(2.24365)));
        }
        else if (tickAnim >= 180 && tickAnim < 200) {
            xx = -6.59282 + (((tickAnim - 180) / 20) * (0-(-6.59282)));
            yy = 2.87153 + (((tickAnim - 180) / 20) * (0-(2.87153)));
            zz = -1.66946 + (((tickAnim - 180) / 20) * (0-(-1.66946)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(xx), body.rotateAngleY + (float) Math.toRadians(yy), body.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (-9.75-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 39) {
            xx = 0 + (((tickAnim - 18) / 21) * (0-(0)));
            yy = -9.75 + (((tickAnim - 18) / 21) * (-12.525-(-9.75)));
            zz = 0 + (((tickAnim - 18) / 21) * (0-(0)));
        }
        else if (tickAnim >= 39 && tickAnim < 152) {
            xx = 0 + (((tickAnim - 39) / 113) * (0-(0)));
            yy = -12.525 + (((tickAnim - 39) / 113) * (-12.525-(-12.525)));
            zz = 0 + (((tickAnim - 39) / 113) * (0-(0)));
        }
        else if (tickAnim >= 152 && tickAnim < 166) {
            xx = 0 + (((tickAnim - 152) / 14) * (0-(0)));
            yy = -12.525 + (((tickAnim - 152) / 14) * (-7.85-(-12.525)));
            zz = 0 + (((tickAnim - 152) / 14) * (-1.75-(0)));
        }
        else if (tickAnim >= 166 && tickAnim < 200) {
            xx = 0 + (((tickAnim - 166) / 34) * (0-(0)));
            yy = -7.85 + (((tickAnim - 166) / 34) * (0-(-7.85)));
            zz = -1.75 + (((tickAnim - 166) / 34) * (0-(-1.75)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.body.rotationPointX = this.body.rotationPointX + (float)(xx);
        this.body.rotationPointY = this.body.rotationPointY - (float)(yy);
        this.body.rotationPointZ = this.body.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 0) / 11) * (28.42-(0)));
            yy = 0 + (((tickAnim - 0) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 11) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 24) {
            xx = 28.42 + (((tickAnim - 11) / 13) * (43.49-(28.42)));
            yy = 0 + (((tickAnim - 11) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 13) * (0-(0)));
        }
        else if (tickAnim >= 24 && tickAnim < 38) {
            xx = 43.49 + (((tickAnim - 24) / 14) * (37.5-(43.49)));
            yy = 0 + (((tickAnim - 24) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 24) / 14) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 152) {
            xx = 37.5 + (((tickAnim - 38) / 114) * (37.5-(37.5)));
            yy = 0 + (((tickAnim - 38) / 114) * (0-(0)));
            zz = 0 + (((tickAnim - 38) / 114) * (0-(0)));
        }
        else if (tickAnim >= 152 && tickAnim < 166) {
            xx = 37.5 + (((tickAnim - 152) / 14) * (26.46889-(37.5)));
            yy = 0 + (((tickAnim - 152) / 14) * (1.42332-(0)));
            zz = 0 + (((tickAnim - 152) / 14) * (-3.19785-(0)));
        }
        else if (tickAnim >= 166 && tickAnim < 200) {
            xx = 26.46889 + (((tickAnim - 166) / 34) * (0-(26.46889)));
            yy = 1.42332 + (((tickAnim - 166) / 34) * (0-(1.42332)));
            zz = -3.19785 + (((tickAnim - 166) / 34) * (0-(-3.19785)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backleftleg, backleftleg.rotateAngleX + (float) Math.toRadians(xx), backleftleg.rotateAngleY + (float) Math.toRadians(yy), backleftleg.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 0) / 11) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 11) * (-0.165-(0)));
            zz = 0 + (((tickAnim - 0) / 11) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 24) {
            xx = 0 + (((tickAnim - 11) / 13) * (0-(0)));
            yy = -0.165 + (((tickAnim - 11) / 13) * (-3.225-(-0.165)));
            zz = 0 + (((tickAnim - 11) / 13) * (-1.45-(0)));
        }
        else if (tickAnim >= 24 && tickAnim < 38) {
            xx = 0 + (((tickAnim - 24) / 14) * (0-(0)));
            yy = -3.225 + (((tickAnim - 24) / 14) * (-2-(-3.225)));
            zz = -1.45 + (((tickAnim - 24) / 14) * (-1.45-(-1.45)));
        }
        else if (tickAnim >= 38 && tickAnim < 152) {
            xx = 0 + (((tickAnim - 38) / 114) * (0-(0)));
            yy = -2 + (((tickAnim - 38) / 114) * (-2-(-2)));
            zz = -1.45 + (((tickAnim - 38) / 114) * (-1.45-(-1.45)));
        }
        else if (tickAnim >= 152 && tickAnim < 162) {
            xx = 0 + (((tickAnim - 152) / 10) * (0-(0)));
            yy = -2 + (((tickAnim - 152) / 10) * (-4.32-(-2)));
            zz = -1.45 + (((tickAnim - 152) / 10) * (-0.03-(-1.45)));
        }
        else if (tickAnim >= 162 && tickAnim < 174) {
            xx = 0 + (((tickAnim - 162) / 12) * (0-(0)));
            yy = -4.32 + (((tickAnim - 162) / 12) * (3.21-(-4.32)));
            zz = -0.03 + (((tickAnim - 162) / 12) * (-0.02-(-0.03)));
        }
        else if (tickAnim >= 174 && tickAnim < 200) {
            xx = 0 + (((tickAnim - 174) / 26) * (0-(0)));
            yy = 3.21 + (((tickAnim - 174) / 26) * (0-(3.21)));
            zz = -0.02 + (((tickAnim - 174) / 26) * (0-(-0.02)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.backleftleg.rotationPointX = this.backleftleg.rotationPointX + (float)(xx);
        this.backleftleg.rotationPointY = this.backleftleg.rotationPointY - (float)(yy);
        this.backleftleg.rotationPointZ = this.backleftleg.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 0) / 11) * (22.72-(0)));
            yy = 0 + (((tickAnim - 0) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 11) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 24) {
            xx = 22.72 + (((tickAnim - 11) / 13) * (37.94-(22.72)));
            yy = 0 + (((tickAnim - 11) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 13) * (0-(0)));
        }
        else if (tickAnim >= 24 && tickAnim < 38) {
            xx = 37.94 + (((tickAnim - 24) / 14) * (42.25-(37.94)));
            yy = 0 + (((tickAnim - 24) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 24) / 14) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 152) {
            xx = 42.25 + (((tickAnim - 38) / 114) * (42.25-(42.25)));
            yy = 0 + (((tickAnim - 38) / 114) * (0-(0)));
            zz = 0 + (((tickAnim - 38) / 114) * (0-(0)));
        }
        else if (tickAnim >= 152 && tickAnim < 162) {
            xx = 42.25 + (((tickAnim - 152) / 10) * (53.15-(42.25)));
            yy = 0 + (((tickAnim - 152) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 152) / 10) * (0-(0)));
        }
        else if (tickAnim >= 162 && tickAnim < 174) {
            xx = 53.15 + (((tickAnim - 162) / 12) * (-16.25-(53.15)));
            yy = 0 + (((tickAnim - 162) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 162) / 12) * (0-(0)));
        }
        else if (tickAnim >= 174 && tickAnim < 200) {
            xx = -16.25 + (((tickAnim - 174) / 26) * (0-(-16.25)));
            yy = 0 + (((tickAnim - 174) / 26) * (0-(0)));
            zz = 0 + (((tickAnim - 174) / 26) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backleftleg2, backleftleg2.rotateAngleX + (float) Math.toRadians(xx), backleftleg2.rotateAngleY + (float) Math.toRadians(yy), backleftleg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 24) {
            xx = 0 + (((tickAnim - 0) / 24) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 24) * (-0.6-(0)));
            zz = 0 + (((tickAnim - 0) / 24) * (0.6-(0)));
        }
        else if (tickAnim >= 24 && tickAnim < 38) {
            xx = 0 + (((tickAnim - 24) / 14) * (0-(0)));
            yy = -0.6 + (((tickAnim - 24) / 14) * (0-(-0.6)));
            zz = 0.6 + (((tickAnim - 24) / 14) * (0-(0.6)));
        }
        else if (tickAnim >= 38 && tickAnim < 152) {
            xx = 0 + (((tickAnim - 38) / 114) * (0-(0)));
            yy = 0 + (((tickAnim - 38) / 114) * (0-(0)));
            zz = 0 + (((tickAnim - 38) / 114) * (0-(0)));
        }
        else if (tickAnim >= 152 && tickAnim < 162) {
            xx = 0 + (((tickAnim - 152) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 152) / 10) * (-1.15-(0)));
            zz = 0 + (((tickAnim - 152) / 10) * (0-(0)));
        }
        else if (tickAnim >= 162 && tickAnim < 174) {
            xx = 0 + (((tickAnim - 162) / 12) * (0-(0)));
            yy = -1.15 + (((tickAnim - 162) / 12) * (4.7-(-1.15)));
            zz = 0 + (((tickAnim - 162) / 12) * (0-(0)));
        }
        else if (tickAnim >= 174 && tickAnim < 181) {
            xx = 0 + (((tickAnim - 174) / 7) * (0-(0)));
            yy = 4.7 + (((tickAnim - 174) / 7) * (1.625-(4.7)));
            zz = 0 + (((tickAnim - 174) / 7) * (-0.3-(0)));
        }
        else if (tickAnim >= 181 && tickAnim < 200) {
            xx = 0 + (((tickAnim - 181) / 19) * (0-(0)));
            yy = 1.625 + (((tickAnim - 181) / 19) * (0-(1.625)));
            zz = -0.3 + (((tickAnim - 181) / 19) * (0-(-0.3)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.backleftleg2.rotationPointX = this.backleftleg2.rotationPointX + (float)(xx);
        this.backleftleg2.rotationPointY = this.backleftleg2.rotationPointY - (float)(yy);
        this.backleftleg2.rotationPointZ = this.backleftleg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 0) / 11) * (12.25-(0)));
            yy = 0 + (((tickAnim - 0) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 11) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 24) {
            xx = 12.25 + (((tickAnim - 11) / 13) * (23.57-(12.25)));
            yy = 0 + (((tickAnim - 11) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 13) * (0-(0)));
        }
        else if (tickAnim >= 24 && tickAnim < 38) {
            xx = 23.57 + (((tickAnim - 24) / 14) * (15.5-(23.57)));
            yy = 0 + (((tickAnim - 24) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 24) / 14) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 152) {
            xx = 15.5 + (((tickAnim - 38) / 114) * (15.5-(15.5)));
            yy = 0 + (((tickAnim - 38) / 114) * (0-(0)));
            zz = 0 + (((tickAnim - 38) / 114) * (0-(0)));
        }
        else if (tickAnim >= 152 && tickAnim < 174) {
            xx = 15.5 + (((tickAnim - 152) / 22) * (0-(15.5)));
            yy = 0 + (((tickAnim - 152) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 152) / 22) * (0-(0)));
        }
        else if (tickAnim >= 174 && tickAnim < 181) {
            xx = 0 + (((tickAnim - 174) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 174) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 174) / 7) * (0-(0)));
        }
        else if (tickAnim >= 181 && tickAnim < 200) {
            xx = 0 + (((tickAnim - 181) / 19) * (0-(0)));
            yy = 0 + (((tickAnim - 181) / 19) * (0-(0)));
            zz = 0 + (((tickAnim - 181) / 19) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backleftleg3, backleftleg3.rotateAngleX + (float) Math.toRadians(xx), backleftleg3.rotateAngleY + (float) Math.toRadians(yy), backleftleg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 0) / 11) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 11) * (-0.275-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 24) {
            xx = 0 + (((tickAnim - 11) / 13) * (0-(0)));
            yy = 0 + (((tickAnim - 11) / 13) * (0-(0)));
            zz = -0.275 + (((tickAnim - 11) / 13) * (-0.875-(-0.275)));
        }
        else if (tickAnim >= 24 && tickAnim < 38) {
            xx = 0 + (((tickAnim - 24) / 14) * (0-(0)));
            yy = 0 + (((tickAnim - 24) / 14) * (0-(0)));
            zz = -0.875 + (((tickAnim - 24) / 14) * (-0.6-(-0.875)));
        }
        else if (tickAnim >= 38 && tickAnim < 152) {
            xx = 0 + (((tickAnim - 38) / 114) * (0-(0)));
            yy = 0 + (((tickAnim - 38) / 114) * (0-(0)));
            zz = -0.6 + (((tickAnim - 38) / 114) * (-0.6-(-0.6)));
        }
        else if (tickAnim >= 152 && tickAnim < 174) {
            xx = 0 + (((tickAnim - 152) / 22) * (0-(0)));
            yy = 0 + (((tickAnim - 152) / 22) * (0-(0)));
            zz = -0.6 + (((tickAnim - 152) / 22) * (0-(-0.6)));
        }
        else if (tickAnim >= 174 && tickAnim < 181) {
            xx = 0 + (((tickAnim - 174) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 174) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 174) / 7) * (0-(0)));
        }
        else if (tickAnim >= 181 && tickAnim < 200) {
            xx = 0 + (((tickAnim - 181) / 19) * (0-(0)));
            yy = 0 + (((tickAnim - 181) / 19) * (0-(0)));
            zz = 0 + (((tickAnim - 181) / 19) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.backleftleg3.rotationPointX = this.backleftleg3.rotationPointX + (float)(xx);
        this.backleftleg3.rotationPointY = this.backleftleg3.rotationPointY - (float)(yy);
        this.backleftleg3.rotationPointZ = this.backleftleg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 0) / 11) * (-13.88-(0)));
            yy = 0 + (((tickAnim - 0) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 11) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 38) {
            xx = -13.88 + (((tickAnim - 11) / 27) * (81-(-13.88)));
            yy = 0 + (((tickAnim - 11) / 27) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 27) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 152) {
            xx = 81 + (((tickAnim - 38) / 114) * (81-(81)));
            yy = 0 + (((tickAnim - 38) / 114) * (0-(0)));
            zz = 0 + (((tickAnim - 38) / 114) * (0-(0)));
        }
        else if (tickAnim >= 152 && tickAnim < 162) {
            xx = 81 + (((tickAnim - 152) / 10) * (74.57-(81)));
            yy = 0 + (((tickAnim - 152) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 152) / 10) * (0-(0)));
        }
        else if (tickAnim >= 162 && tickAnim < 174) {
            xx = 74.57 + (((tickAnim - 162) / 12) * (8.75-(74.57)));
            yy = 0 + (((tickAnim - 162) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 162) / 12) * (0-(0)));
        }
        else if (tickAnim >= 174 && tickAnim < 181) {
            xx = 8.75 + (((tickAnim - 174) / 7) * (4.25-(8.75)));
            yy = 0 + (((tickAnim - 174) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 174) / 7) * (0-(0)));
        }
        else if (tickAnim >= 181 && tickAnim < 200) {
            xx = 4.25 + (((tickAnim - 181) / 19) * (0-(4.25)));
            yy = 0 + (((tickAnim - 181) / 19) * (0-(0)));
            zz = 0 + (((tickAnim - 181) / 19) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backleftleg4, backleftleg4.rotateAngleX + (float) Math.toRadians(xx), backleftleg4.rotateAngleY + (float) Math.toRadians(yy), backleftleg4.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 0) / 11) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 11) * (-0.09-(0)));
            zz = 0 + (((tickAnim - 0) / 11) * (0.035-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 38) {
            xx = 0 + (((tickAnim - 11) / 27) * (0-(0)));
            yy = -0.09 + (((tickAnim - 11) / 27) * (-0.45-(-0.09)));
            zz = 0.035 + (((tickAnim - 11) / 27) * (-1.05-(0.035)));
        }
        else if (tickAnim >= 38 && tickAnim < 152) {
            xx = 0 + (((tickAnim - 38) / 114) * (0-(0)));
            yy = -0.45 + (((tickAnim - 38) / 114) * (-0.45-(-0.45)));
            zz = -1.05 + (((tickAnim - 38) / 114) * (-1.05-(-1.05)));
        }
        else if (tickAnim >= 152 && tickAnim < 200) {
            xx = 0 + (((tickAnim - 152) / 48) * (0-(0)));
            yy = -0.45 + (((tickAnim - 152) / 48) * (0-(-0.45)));
            zz = -1.05 + (((tickAnim - 152) / 48) * (0-(-1.05)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.backleftleg4.rotationPointX = this.backleftleg4.rotationPointX + (float)(xx);
        this.backleftleg4.rotationPointY = this.backleftleg4.rotationPointY - (float)(yy);
        this.backleftleg4.rotationPointZ = this.backleftleg4.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (0.00782-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0.48883-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (2.57923-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 39) {
            xx = 0.00782 + (((tickAnim - 18) / 21) * (-8.19716-(0.00782)));
            yy = 0.48883 + (((tickAnim - 18) / 21) * (1.07078-(0.48883)));
            zz = 2.57923 + (((tickAnim - 18) / 21) * (5.64975-(2.57923)));
        }
        else if (tickAnim >= 39 && tickAnim < 152) {
            xx = -8.19716 + (((tickAnim - 39) / 113) * (-8.19716-(-8.19716)));
            yy = 1.07078 + (((tickAnim - 39) / 113) * (1.07078-(1.07078)));
            zz = 5.64975 + (((tickAnim - 39) / 113) * (5.64975-(5.64975)));
        }
        else if (tickAnim >= 152 && tickAnim < 166) {
            xx = -8.19716 + (((tickAnim - 152) / 14) * (8.74172-(-8.19716)));
            yy = 1.07078 + (((tickAnim - 152) / 14) * (2.32597-(1.07078)));
            zz = 5.64975 + (((tickAnim - 152) / 14) * (2.72922-(5.64975)));
        }
        else if (tickAnim >= 166 && tickAnim < 180) {
            xx = 8.74172 + (((tickAnim - 166) / 14) * (5.16849-(8.74172)));
            yy = 2.32597 + (((tickAnim - 166) / 14) * (1.25778-(2.32597)));
            zz = 2.72922 + (((tickAnim - 166) / 14) * (3.84579-(2.72922)));
        }
        else if (tickAnim >= 180 && tickAnim < 200) {
            xx = 5.16849 + (((tickAnim - 180) / 20) * (0-(5.16849)));
            yy = 1.25778 + (((tickAnim - 180) / 20) * (0-(1.25778)));
            zz = 3.84579 + (((tickAnim - 180) / 20) * (0-(3.84579)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backrightleg, backrightleg.rotateAngleX + (float) Math.toRadians(xx), backrightleg.rotateAngleY + (float) Math.toRadians(yy), backrightleg.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (-3.65-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 39) {
            xx = 0 + (((tickAnim - 18) / 21) * (0-(0)));
            yy = -3.65 + (((tickAnim - 18) / 21) * (-3.175-(-3.65)));
            zz = 0 + (((tickAnim - 18) / 21) * (0-(0)));
        }
        else if (tickAnim >= 39 && tickAnim < 152) {
            xx = 0 + (((tickAnim - 39) / 113) * (0-(0)));
            yy = -3.175 + (((tickAnim - 39) / 113) * (-3.175-(-3.175)));
            zz = 0 + (((tickAnim - 39) / 113) * (0-(0)));
        }
        else if (tickAnim >= 152 && tickAnim < 166) {
            xx = 0 + (((tickAnim - 152) / 14) * (0-(0)));
            yy = -3.175 + (((tickAnim - 152) / 14) * (3.45-(-3.175)));
            zz = 0 + (((tickAnim - 152) / 14) * (0-(0)));
        }
        else if (tickAnim >= 166 && tickAnim < 180) {
            xx = 0 + (((tickAnim - 166) / 14) * (0-(0)));
            yy = 3.45 + (((tickAnim - 166) / 14) * (2.175-(3.45)));
            zz = 0 + (((tickAnim - 166) / 14) * (0-(0)));
        }
        else if (tickAnim >= 180 && tickAnim < 200) {
            xx = 0 + (((tickAnim - 180) / 20) * (0-(0)));
            yy = 2.175 + (((tickAnim - 180) / 20) * (0-(2.175)));
            zz = 0 + (((tickAnim - 180) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.backrightleg.rotationPointX = this.backrightleg.rotationPointX + (float)(xx);
        this.backrightleg.rotationPointY = this.backrightleg.rotationPointY - (float)(yy);
        this.backrightleg.rotationPointZ = this.backrightleg.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (-18.28311-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (13.7907-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (-80.03073-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 39) {
            xx = -18.28311 + (((tickAnim - 18) / 21) * (-30.82667-(-18.28311)));
            yy = 13.7907 + (((tickAnim - 18) / 21) * (4.67767-(13.7907)));
            zz = -80.03073 + (((tickAnim - 18) / 21) * (-100.03376-(-80.03073)));
        }
        else if (tickAnim >= 39 && tickAnim < 152) {
            xx = -30.82667 + (((tickAnim - 39) / 113) * (-30.82667-(-30.82667)));
            yy = 4.67767 + (((tickAnim - 39) / 113) * (4.67767-(4.67767)));
            zz = -100.03376 + (((tickAnim - 39) / 113) * (-100.03376-(-100.03376)));
        }
        else if (tickAnim >= 152 && tickAnim < 166) {
            xx = -30.82667 + (((tickAnim - 152) / 14) * (-15.06044-(-30.82667)));
            yy = 4.67767 + (((tickAnim - 152) / 14) * (-7.83317-(4.67767)));
            zz = -100.03376 + (((tickAnim - 152) / 14) * (-2.35927-(-100.03376)));
        }
        else if (tickAnim >= 166 && tickAnim < 200) {
            xx = -15.06044 + (((tickAnim - 166) / 34) * (0-(-15.06044)));
            yy = -7.83317 + (((tickAnim - 166) / 34) * (0-(-7.83317)));
            zz = -2.35927 + (((tickAnim - 166) / 34) * (0-(-2.35927)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backrightleg2, backrightleg2.rotateAngleX + (float) Math.toRadians(xx), backrightleg2.rotateAngleY + (float) Math.toRadians(yy), backrightleg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (-0.525-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0.45-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 39) {
            xx = 0 + (((tickAnim - 18) / 21) * (0.08-(0)));
            yy = -0.525 + (((tickAnim - 18) / 21) * (0.3-(-0.525)));
            zz = 0.45 + (((tickAnim - 18) / 21) * (0.37-(0.45)));
        }
        else if (tickAnim >= 39 && tickAnim < 152) {
            xx = 0.08 + (((tickAnim - 39) / 113) * (0-(0.08)));
            yy = 0.3 + (((tickAnim - 39) / 113) * (0-(0.3)));
            zz = 0.37 + (((tickAnim - 39) / 113) * (0-(0.37)));
        }
        else if (tickAnim >= 152 && tickAnim < 166) {
            xx = 0 + (((tickAnim - 152) / 14) * (0.475-(0)));
            yy = 0 + (((tickAnim - 152) / 14) * (2.025-(0)));
            zz = 0 + (((tickAnim - 152) / 14) * (0.025-(0)));
        }
        else if (tickAnim >= 166 && tickAnim < 200) {
            xx = 0.475 + (((tickAnim - 166) / 34) * (0-(0.475)));
            yy = 2.025 + (((tickAnim - 166) / 34) * (0-(2.025)));
            zz = 0.025 + (((tickAnim - 166) / 34) * (0-(0.025)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.backrightleg2.rotationPointX = this.backrightleg2.rotationPointX + (float)(xx);
        this.backrightleg2.rotationPointY = this.backrightleg2.rotationPointY - (float)(yy);
        this.backrightleg2.rotationPointZ = this.backrightleg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (7.81325-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (-0.83559-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (-1.81715-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 39) {
            xx = 7.81325 + (((tickAnim - 18) / 21) * (19.5-(7.81325)));
            yy = -0.83559 + (((tickAnim - 18) / 21) * (0-(-0.83559)));
            zz = -1.81715 + (((tickAnim - 18) / 21) * (0-(-1.81715)));
        }
        else if (tickAnim >= 39 && tickAnim < 152) {
            xx = 19.5 + (((tickAnim - 39) / 113) * (19.5-(19.5)));
            yy = 0 + (((tickAnim - 39) / 113) * (0-(0)));
            zz = 0 + (((tickAnim - 39) / 113) * (0-(0)));
        }
        else if (tickAnim >= 152 && tickAnim < 166) {
            xx = 19.5 + (((tickAnim - 152) / 14) * (6.05-(19.5)));
            yy = 0 + (((tickAnim - 152) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 152) / 14) * (0-(0)));
        }
        else if (tickAnim >= 166 && tickAnim < 200) {
            xx = 6.05 + (((tickAnim - 166) / 34) * (0-(6.05)));
            yy = 0 + (((tickAnim - 166) / 34) * (0-(0)));
            zz = 0 + (((tickAnim - 166) / 34) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backrightleg3, backrightleg3.rotateAngleX + (float) Math.toRadians(xx), backrightleg3.rotateAngleY + (float) Math.toRadians(yy), backrightleg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 39) {
            xx = 0 + (((tickAnim - 0) / 39) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 39) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 39) * (-0.525-(0)));
        }
        else if (tickAnim >= 39 && tickAnim < 152) {
            xx = 0 + (((tickAnim - 39) / 113) * (0-(0)));
            yy = 0 + (((tickAnim - 39) / 113) * (0-(0)));
            zz = -0.525 + (((tickAnim - 39) / 113) * (-0.525-(-0.525)));
        }
        else if (tickAnim >= 152 && tickAnim < 166) {
            xx = 0 + (((tickAnim - 152) / 14) * (0-(0)));
            yy = 0 + (((tickAnim - 152) / 14) * (0-(0)));
            zz = -0.525 + (((tickAnim - 152) / 14) * (0-(-0.525)));
        }
        else if (tickAnim >= 166 && tickAnim < 200) {
            xx = 0 + (((tickAnim - 166) / 34) * (0-(0)));
            yy = 0 + (((tickAnim - 166) / 34) * (0-(0)));
            zz = 0 + (((tickAnim - 166) / 34) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.backrightleg3.rotationPointX = this.backrightleg3.rotationPointX + (float)(xx);
        this.backrightleg3.rotationPointY = this.backrightleg3.rotationPointY - (float)(yy);
        this.backrightleg3.rotationPointZ = this.backrightleg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (12.33102-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (-10.95673-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (22.33088-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 39) {
            xx = 12.33102 + (((tickAnim - 18) / 21) * (46.5-(12.33102)));
            yy = -10.95673 + (((tickAnim - 18) / 21) * (0-(-10.95673)));
            zz = 22.33088 + (((tickAnim - 18) / 21) * (0-(22.33088)));
        }
        else if (tickAnim >= 39 && tickAnim < 152) {
            xx = 46.5 + (((tickAnim - 39) / 113) * (46.5-(46.5)));
            yy = 0 + (((tickAnim - 39) / 113) * (0-(0)));
            zz = 0 + (((tickAnim - 39) / 113) * (0-(0)));
        }
        else if (tickAnim >= 152 && tickAnim < 166) {
            xx = 46.5 + (((tickAnim - 152) / 14) * (10.23055-(46.5)));
            yy = 0 + (((tickAnim - 152) / 14) * (0.96652-(0)));
            zz = 0 + (((tickAnim - 152) / 14) * (-2.30572-(0)));
        }
        else if (tickAnim >= 166 && tickAnim < 200) {
            xx = 10.23055 + (((tickAnim - 166) / 34) * (0-(10.23055)));
            yy = 0.96652 + (((tickAnim - 166) / 34) * (0-(0.96652)));
            zz = -2.30572 + (((tickAnim - 166) / 34) * (0-(-2.30572)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backrightleg4, backrightleg4.rotateAngleX + (float) Math.toRadians(xx), backrightleg4.rotateAngleY + (float) Math.toRadians(yy), backrightleg4.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 39) {
            xx = 0 + (((tickAnim - 0) / 39) * (-0.25-(0)));
            yy = 0 + (((tickAnim - 0) / 39) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 39) * (0-(0)));
        }
        else if (tickAnim >= 39 && tickAnim < 152) {
            xx = -0.25 + (((tickAnim - 39) / 113) * (-0.25-(-0.25)));
            yy = 0 + (((tickAnim - 39) / 113) * (0-(0)));
            zz = 0 + (((tickAnim - 39) / 113) * (0-(0)));
        }
        else if (tickAnim >= 152 && tickAnim < 166) {
            xx = -0.25 + (((tickAnim - 152) / 14) * (-0.16-(-0.25)));
            yy = 0 + (((tickAnim - 152) / 14) * (2.875-(0)));
            zz = 0 + (((tickAnim - 152) / 14) * (0-(0)));
        }
        else if (tickAnim >= 166 && tickAnim < 200) {
            xx = -0.16 + (((tickAnim - 166) / 34) * (0-(-0.16)));
            yy = 2.875 + (((tickAnim - 166) / 34) * (0-(2.875)));
            zz = 0 + (((tickAnim - 166) / 34) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.backrightleg4.rotationPointX = this.backrightleg4.rotationPointX + (float)(xx);
        this.backrightleg4.rotationPointY = this.backrightleg4.rotationPointY - (float)(yy);
        this.backrightleg4.rotationPointZ = this.backrightleg4.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (4.4264+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-150))*-3-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (-3.77537-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (-1.01927-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 39) {
            xx = 4.4264+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-150))*-3 + (((tickAnim - 18) / 21) * (7.66854-(4.4264+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-150))*-3)));
            yy = -3.77537 + (((tickAnim - 18) / 21) * (-8.44963-(-3.77537)));
            zz = -1.01927 + (((tickAnim - 18) / 21) * (-2.28123-(-1.01927)));
        }
        else if (tickAnim >= 39 && tickAnim < 152) {
            xx = 7.66854 + (((tickAnim - 39) / 113) * (7.66854-(7.66854)));
            yy = -8.44963 + (((tickAnim - 39) / 113) * (-8.44963-(-8.44963)));
            zz = -2.28123 + (((tickAnim - 39) / 113) * (-2.28123-(-2.28123)));
        }
        else if (tickAnim >= 152 && tickAnim < 200) {
            xx = 7.66854 + (((tickAnim - 152) / 48) * (0-(7.66854)));
            yy = -8.44963 + (((tickAnim - 152) / 48) * (0-(-8.44963)));
            zz = -2.28123 + (((tickAnim - 152) / 48) * (0-(-2.28123)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body2, body2.rotateAngleX + (float) Math.toRadians(xx), body2.rotateAngleY + (float) Math.toRadians(yy), body2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 111 && tickAnim < 133) {
            xx = 0 + (((tickAnim - 111) / 22) * (0-(0)));
            yy = 0 + (((tickAnim - 111) / 22) * (-0.15-(0)));
            zz = 0 + (((tickAnim - 111) / 22) * (0-(0)));
        }
        else if (tickAnim >= 133 && tickAnim < 152) {
            xx = 0 + (((tickAnim - 133) / 19) * (0-(0)));
            yy = -0.15 + (((tickAnim - 133) / 19) * (0-(-0.15)));
            zz = 0 + (((tickAnim - 133) / 19) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.body2.rotationPointX = this.body2.rotationPointX + (float)(xx);
        this.body2.rotationPointY = this.body2.rotationPointY - (float)(yy);
        this.body2.rotationPointZ = this.body2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (3.06494-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (-2.39488-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (-0.28197-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 41) {
            xx = 3.06494 + (((tickAnim - 18) / 23) * (0-(3.06494)));
            yy = -2.39488 + (((tickAnim - 18) / 23) * (-2.5-(-2.39488)));
            zz = -0.28197 + (((tickAnim - 18) / 23) * (0-(-0.28197)));
        }
        else if (tickAnim >= 41 && tickAnim < 152) {
            xx = 0 + (((tickAnim - 41) / 111) * (0-(0)));
            yy = -2.5 + (((tickAnim - 41) / 111) * (-2.5-(-2.5)));
            zz = 0 + (((tickAnim - 41) / 111) * (0-(0)));
        }
        else if (tickAnim >= 152 && tickAnim < 200) {
            xx = 0 + (((tickAnim - 152) / 48) * (0-(0)));
            yy = -2.5 + (((tickAnim - 152) / 48) * (0-(-2.5)));
            zz = 0 + (((tickAnim - 152) / 48) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(upperbody, upperbody.rotateAngleX + (float) Math.toRadians(xx), upperbody.rotateAngleY + (float) Math.toRadians(yy), upperbody.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 41 && tickAnim < 111) {
            xx = 0 + (((tickAnim - 41) / 70) * (0-(0)));
            yy = 0 + (((tickAnim - 41) / 70) * (-0.35-(0)));
            zz = 0 + (((tickAnim - 41) / 70) * (0-(0)));
        }
        else if (tickAnim >= 111 && tickAnim < 115) {
            xx = 0 + (((tickAnim - 111) / 4) * (0-(0)));
            yy = -0.35 + (((tickAnim - 111) / 4) * (-0.35-(-0.35)));
            zz = 0 + (((tickAnim - 111) / 4) * (0-(0)));
        }
        else if (tickAnim >= 115 && tickAnim < 133) {
            xx = 0 + (((tickAnim - 115) / 18) * (0-(0)));
            yy = -0.35 + (((tickAnim - 115) / 18) * (-0.055-(-0.35)));
            zz = 0 + (((tickAnim - 115) / 18) * (0-(0)));
        }
        else if (tickAnim >= 133 && tickAnim < 152) {
            xx = 0 + (((tickAnim - 133) / 19) * (0-(0)));
            yy = -0.055 + (((tickAnim - 133) / 19) * (-0.35-(-0.055)));
            zz = 0 + (((tickAnim - 133) / 19) * (0-(0)));
        }
        else if (tickAnim >= 152 && tickAnim < 200) {
            xx = 0 + (((tickAnim - 152) / 48) * (0-(0)));
            yy = -0.35 + (((tickAnim - 152) / 48) * (0-(-0.35)));
            zz = 0 + (((tickAnim - 152) / 48) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.upperbody.rotationPointX = this.upperbody.rotationPointX + (float)(xx);
        this.upperbody.rotationPointY = this.upperbody.rotationPointY - (float)(yy);
        this.upperbody.rotationPointZ = this.upperbody.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (-2.14292-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (-3.70369-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (-1.96163-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 41) {
            xx = -2.14292 + (((tickAnim - 18) / 23) * (8.10708-(-2.14292)));
            yy = -3.70369 + (((tickAnim - 18) / 23) * (-3.70369-(-3.70369)));
            zz = -1.96163 + (((tickAnim - 18) / 23) * (-1.96163-(-1.96163)));
        }
        else if (tickAnim >= 41 && tickAnim < 67) {
            xx = 8.10708 + (((tickAnim - 41) / 26) * (7.87961-(8.10708)));
            yy = -3.70369 + (((tickAnim - 41) / 26) * (-4.56354-(-3.70369)));
            zz = -1.96163 + (((tickAnim - 41) / 26) * (-2.24839-(-1.96163)));
        }
        else if (tickAnim >= 67 && tickAnim < 94) {
            xx = 7.87961 + (((tickAnim - 67) / 27) * (7.55833-(7.87961)));
            yy = -4.56354 + (((tickAnim - 67) / 27) * (-3.65266-(-4.56354)));
            zz = -2.24839 + (((tickAnim - 67) / 27) * (-2.7762+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440+60))*0.2-(-2.24839)));
        }
        else if (tickAnim >= 94 && tickAnim < 111) {
            xx = 7.55833 + (((tickAnim - 94) / 17) * (7.21899-(7.55833)));
            yy = -3.65266 + (((tickAnim - 94) / 17) * (-3.02245-(-3.65266)));
            zz = -2.7762+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440+60))*0.2 + (((tickAnim - 94) / 17) * (-2.31274-(-2.7762+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440+60))*0.2)));
        }
        else if (tickAnim >= 111 && tickAnim < 140) {
            xx = 7.21899 + (((tickAnim - 111) / 29) * (5.87916-(7.21899)));
            yy = -3.02245 + (((tickAnim - 111) / 29) * (-1.64648-(-3.02245)));
            zz = -2.31274 + (((tickAnim - 111) / 29) * (-2.37019-(-2.31274)));
        }
        else if (tickAnim >= 140 && tickAnim < 152) {
            xx = 5.87916 + (((tickAnim - 140) / 12) * (6.39323-(5.87916)));
            yy = -1.64648 + (((tickAnim - 140) / 12) * (-1.0961-(-1.64648)));
            zz = -2.37019 + (((tickAnim - 140) / 12) * (-2.39318-(-2.37019)));
        }
        else if (tickAnim >= 152 && tickAnim < 166) {
            xx = 6.39323 + (((tickAnim - 152) / 14) * (10.90945-(6.39323)));
            yy = -1.0961 + (((tickAnim - 152) / 14) * (-0.88457-(-1.0961)));
            zz = -2.39318 + (((tickAnim - 152) / 14) * (-1.93133-(-2.39318)));
        }
        else if (tickAnim >= 166 && tickAnim < 200) {
            xx = 10.90945 + (((tickAnim - 166) / 34) * (0-(10.90945)));
            yy = -0.88457 + (((tickAnim - 166) / 34) * (0-(-0.88457)));
            zz = -1.93133 + (((tickAnim - 166) / 34) * (0-(-1.93133)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck4, neck4.rotateAngleX + (float) Math.toRadians(xx), neck4.rotateAngleY + (float) Math.toRadians(yy), neck4.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 67 && tickAnim < 152) {
            xx = 0 + (((tickAnim - 67) / 85) * (0-(0)));
            yy = 0 + (((tickAnim - 67) / 85) * (0-(0)));
            zz = 0 + (((tickAnim - 67) / 85) * (0-(0)));
        }
        else if (tickAnim >= 152 && tickAnim < 166) {
            xx = 0 + (((tickAnim - 152) / 14) * (0-(0)));
            yy = 0 + (((tickAnim - 152) / 14) * (-0.4-(0)));
            zz = 0 + (((tickAnim - 152) / 14) * (0-(0)));
        }
        else if (tickAnim >= 166 && tickAnim < 200) {
            xx = 0 + (((tickAnim - 166) / 34) * (0-(0)));
            yy = -0.4 + (((tickAnim - 166) / 34) * (0-(-0.4)));
            zz = 0 + (((tickAnim - 166) / 34) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.neck4.rotationPointX = this.neck4.rotationPointX + (float)(xx);
        this.neck4.rotationPointY = this.neck4.rotationPointY - (float)(yy);
        this.neck4.rotationPointZ = this.neck4.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (-0.0729-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (-9.71254-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0.858-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 41) {
            xx = -0.0729 + (((tickAnim - 18) / 23) * (4.9271-(-0.0729)));
            yy = -9.71254 + (((tickAnim - 18) / 23) * (-9.71254-(-9.71254)));
            zz = 0.858 + (((tickAnim - 18) / 23) * (0.858-(0.858)));
        }
        else if (tickAnim >= 41 && tickAnim < 67) {
            xx = 4.9271 + (((tickAnim - 41) / 26) * (10.19519-(4.9271)));
            yy = -9.71254 + (((tickAnim - 41) / 26) * (-9.97749-(-9.71254)));
            zz = 0.858 + (((tickAnim - 41) / 26) * (0.89953-(0.858)));
        }
        else if (tickAnim >= 67 && tickAnim < 90) {
            xx = 10.19519 + (((tickAnim - 67) / 23) * (6.63683-(10.19519)));
            yy = -9.97749 + (((tickAnim - 67) / 23) * (-6.08822-(-9.97749)));
            zz = 0.89953 + (((tickAnim - 67) / 23) * (-0.8524+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440+60))*0.5-(0.89953)));
        }
        else if (tickAnim >= 90 && tickAnim < 113) {
            xx = 6.63683 + (((tickAnim - 90) / 23) * (6.99537-(6.63683)));
            yy = -6.08822 + (((tickAnim - 90) / 23) * (-4.49402-(-6.08822)));
            zz = -0.8524+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440+60))*0.5 + (((tickAnim - 90) / 23) * (-0.493-(-0.8524+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440+60))*0.5)));
        }
        else if (tickAnim >= 113 && tickAnim < 152) {
            xx = 6.99537 + (((tickAnim - 113) / 39) * (8.75754-(6.99537)));
            yy = -4.49402 + (((tickAnim - 113) / 39) * (2.4798-(-4.49402)));
            zz = -0.493 + (((tickAnim - 113) / 39) * (0.02001-(-0.493)));
        }
        else if (tickAnim >= 152 && tickAnim < 166) {
            xx = 8.75754 + (((tickAnim - 152) / 14) * (15.81749-(8.75754)));
            yy = 2.4798 + (((tickAnim - 152) / 14) * (2.00124-(2.4798)));
            zz = 0.02001 + (((tickAnim - 152) / 14) * (0.01614-(0.02001)));
        }
        else if (tickAnim >= 166 && tickAnim < 200) {
            xx = 15.81749 + (((tickAnim - 166) / 34) * (0-(15.81749)));
            yy = 2.00124 + (((tickAnim - 166) / 34) * (0-(2.00124)));
            zz = 0.01614 + (((tickAnim - 166) / 34) * (0-(0.01614)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(xx), neck3.rotateAngleY + (float) Math.toRadians(yy), neck3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (5.25-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 28) {
            xx = 5.25 + (((tickAnim - 18) / 10) * (-1.64-(5.25)));
            yy = 0 + (((tickAnim - 18) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 10) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 41) {
            xx = -1.64 + (((tickAnim - 28) / 13) * (0-(-1.64)));
            yy = 0 + (((tickAnim - 28) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 13) * (0-(0)));
        }
        else if (tickAnim >= 41 && tickAnim < 58) {
            xx = 0 + (((tickAnim - 41) / 17) * (1.90018-(0)));
            yy = 0 + (((tickAnim - 41) / 17) * (-2.78192-(0)));
            zz = 0 + (((tickAnim - 41) / 17) * (0.55781-(0)));
        }
        else if (tickAnim >= 58 && tickAnim < 67) {
            xx = 1.90018 + (((tickAnim - 58) / 9) * (4.28824-(1.90018)));
            yy = -2.78192 + (((tickAnim - 58) / 9) * (-3.67213-(-2.78192)));
            zz = 0.55781 + (((tickAnim - 58) / 9) * (0.73631-(0.55781)));
        }
        else if (tickAnim >= 67 && tickAnim < 86) {
            xx = 4.28824 + (((tickAnim - 67) / 19) * (-5.49664-(4.28824)));
            yy = -3.67213 + (((tickAnim - 67) / 19) * (-1.82148-(-3.67213)));
            zz = 0.73631 + (((tickAnim - 67) / 19) * (-1.2136+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440+60))*1-(0.73631)));
        }
        else if (tickAnim >= 86 && tickAnim < 114) {
            xx = -5.49664 + (((tickAnim - 86) / 28) * (-1.61709-(-5.49664)));
            yy = -1.82148 + (((tickAnim - 86) / 28) * (-0.76683-(-1.82148)));
            zz = -1.2136+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440+60))*1 + (((tickAnim - 86) / 28) * (-1.14779-(-1.2136+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440+60))*1)));
        }
        else if (tickAnim >= 114 && tickAnim < 152) {
            xx = -1.61709 + (((tickAnim - 114) / 38) * (-3.09144-(-1.61709)));
            yy = -0.76683 + (((tickAnim - 114) / 38) * (3.47949-(-0.76683)));
            zz = -1.14779 + (((tickAnim - 114) / 38) * (-0.75823-(-1.14779)));
        }
        else if (tickAnim >= 152 && tickAnim < 167) {
            xx = -3.09144 + (((tickAnim - 152) / 15) * (6.50515-(-3.09144)));
            yy = 3.47949 + (((tickAnim - 152) / 15) * (2.80801-(3.47949)));
            zz = -0.75823 + (((tickAnim - 152) / 15) * (-0.61191-(-0.75823)));
        }
        else if (tickAnim >= 167 && tickAnim < 200) {
            xx = 6.50515 + (((tickAnim - 167) / 33) * (0-(6.50515)));
            yy = 2.80801 + (((tickAnim - 167) / 33) * (0-(2.80801)));
            zz = -0.61191 + (((tickAnim - 167) / 33) * (0-(-0.61191)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(xx), neck2.rotateAngleY + (float) Math.toRadians(yy), neck2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (14.75-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 28) {
            xx = 14.75 + (((tickAnim - 18) / 10) * (1.68-(14.75)));
            yy = 0 + (((tickAnim - 18) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 10) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 41) {
            xx = 1.68 + (((tickAnim - 28) / 13) * (3.5-(1.68)));
            yy = 0 + (((tickAnim - 28) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 13) * (0-(0)));
        }
        else if (tickAnim >= 41 && tickAnim < 67) {
            xx = 3.5 + (((tickAnim - 41) / 26) * (11.83535-(3.5)));
            yy = 0 + (((tickAnim - 41) / 26) * (0.20584-(0)));
            zz = 0 + (((tickAnim - 41) / 26) * (-0.03252-(0)));
        }
        else if (tickAnim >= 67 && tickAnim < 83) {
            xx = 11.83535 + (((tickAnim - 67) / 16) * (1.65178-(11.83535)));
            yy = 0.20584 + (((tickAnim - 67) / 16) * (3.03233-(0.20584)));
            zz = -0.03252 + (((tickAnim - 67) / 16) * (-0.6803+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440+60))*2-(-0.03252)));
        }
        else if (tickAnim >= 83 && tickAnim < 116) {
            xx = 1.65178 + (((tickAnim - 83) / 33) * (9.86678-(1.65178)));
            yy = 3.03233 + (((tickAnim - 83) / 33) * (5.88259-(3.03233)));
            zz = -0.6803+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440+60))*2 + (((tickAnim - 83) / 33) * (-1.49642-(-0.6803+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440+60))*2)));
        }
        else if (tickAnim >= 116 && tickAnim < 152) {
            xx = 9.86678 + (((tickAnim - 116) / 36) * (5.88672-(9.86678)));
            yy = 5.88259 + (((tickAnim - 116) / 36) * (11.94984-(5.88259)));
            zz = -1.49642 + (((tickAnim - 116) / 36) * (1.07599-(-1.49642)));
        }
        else if (tickAnim >= 152 && tickAnim < 182) {
            xx = 5.88672 + (((tickAnim - 152) / 30) * (14.97025-(5.88672)));
            yy = 11.94984 + (((tickAnim - 152) / 30) * (5.29335-(11.94984)));
            zz = 1.07599 + (((tickAnim - 152) / 30) * (0.47662-(1.07599)));
        }
        else if (tickAnim >= 182 && tickAnim < 200) {
            xx = 14.97025 + (((tickAnim - 182) / 18) * (0-(14.97025)));
            yy = 5.29335 + (((tickAnim - 182) / 18) * (0-(5.29335)));
            zz = 0.47662 + (((tickAnim - 182) / 18) * (0-(0.47662)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(xx), neck.rotateAngleY + (float) Math.toRadians(yy), neck.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 152) {
            xx = 0 + (((tickAnim - 0) / 152) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 152) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 152) * (0.35-(0)));
        }
        else if (tickAnim >= 152 && tickAnim < 200) {
            xx = 0 + (((tickAnim - 152) / 48) * (0-(0)));
            yy = 0 + (((tickAnim - 152) / 48) * (0-(0)));
            zz = 0.35 + (((tickAnim - 152) / 48) * (0-(0.35)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.neck.rotationPointX = this.neck.rotationPointX + (float)(xx);
        this.neck.rotationPointY = this.neck.rotationPointY - (float)(yy);
        this.neck.rotationPointZ = this.neck.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (13.75-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 34) {
            xx = 13.75 + (((tickAnim - 18) / 16) * (-6.93-(13.75)));
            yy = 0 + (((tickAnim - 18) / 16) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 16) * (0-(0)));
        }
        else if (tickAnim >= 34 && tickAnim < 43) {
            xx = -6.93 + (((tickAnim - 34) / 9) * (0-(-6.93)));
            yy = 0 + (((tickAnim - 34) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 34) / 9) * (0-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 52) {
            xx = 0 + (((tickAnim - 43) / 9) * (-0.28576-(0)));
            yy = 0 + (((tickAnim - 43) / 9) * (-1.23378-(0)));
            zz = 0 + (((tickAnim - 43) / 9) * (-0.31352-(0)));
        }
        else if (tickAnim >= 52 && tickAnim < 58) {
            xx = -0.28576 + (((tickAnim - 52) / 6) * (-6.28576-(-0.28576)));
            yy = -1.23378 + (((tickAnim - 52) / 6) * (-1.23378-(-1.23378)));
            zz = -0.31352 + (((tickAnim - 52) / 6) * (-0.31352-(-0.31352)));
        }
        else if (tickAnim >= 58 && tickAnim < 67) {
            xx = -6.28576 + (((tickAnim - 58) / 9) * (-18.03576-(-6.28576)));
            yy = -1.23378 + (((tickAnim - 58) / 9) * (-1.23378-(-1.23378)));
            zz = -0.31352 + (((tickAnim - 58) / 9) * (-0.31352-(-0.31352)));
        }
        else if (tickAnim >= 67 && tickAnim < 74) {
            xx = -18.03576 + (((tickAnim - 67) / 7) * (-5.53576-(-18.03576)));
            yy = -1.23378 + (((tickAnim - 67) / 7) * (-1.23378-(-1.23378)));
            zz = -0.31352 + (((tickAnim - 67) / 7) * (-0.31352-(-0.31352)));
        }
        else if (tickAnim >= 74 && tickAnim < 82) {
            xx = -5.53576 + (((tickAnim - 74) / 8) * (-13.75623-(-5.53576)));
            yy = -1.23378 + (((tickAnim - 74) / 8) * (1.23532-(-1.23378)));
            zz = -0.31352 + (((tickAnim - 74) / 8) * (0.5008+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440+60))*3-(-0.31352)));
        }
        else if (tickAnim >= 82 && tickAnim < 118) {
            xx = -13.75623 + (((tickAnim - 82) / 36) * (-11.43233-(-13.75623)));
            yy = 1.23532 + (((tickAnim - 82) / 36) * (2.96509-(1.23532)));
            zz = 0.5008+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440+60))*3 + (((tickAnim - 82) / 36) * (1.01787-(0.5008+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440+60))*3)));
        }
        else if (tickAnim >= 118 && tickAnim < 140) {
            xx = -11.43233 + (((tickAnim - 118) / 22) * (-9.15918-(-11.43233)));
            yy = 2.96509 + (((tickAnim - 118) / 22) * (4.05123-(2.96509)));
            zz = 1.01787 + (((tickAnim - 118) / 22) * (2.9739-(1.01787)));
        }
        else if (tickAnim >= 140 && tickAnim < 152) {
            xx = -9.15918 + (((tickAnim - 140) / 12) * (-2.2504-(-9.15918)));
            yy = 4.05123 + (((tickAnim - 140) / 12) * (4.79723-(4.05123)));
            zz = 2.9739 + (((tickAnim - 140) / 12) * (3.43618-(2.9739)));
        }
        else if (tickAnim >= 152 && tickAnim < 200) {
            xx = -2.2504 + (((tickAnim - 152) / 48) * (0-(-2.2504)));
            yy = 4.79723 + (((tickAnim - 152) / 48) * (0-(4.79723)));
            zz = 3.43618 + (((tickAnim - 152) / 48) * (0-(3.43618)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0.375-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 43) {
            xx = 0 + (((tickAnim - 18) / 25) * (0-(0)));
            yy = 0 + (((tickAnim - 18) / 25) * (0-(0)));
            zz = 0.375 + (((tickAnim - 18) / 25) * (0-(0.375)));
        }
        else if (tickAnim >= 43 && tickAnim < 200) {
            xx = 0 + (((tickAnim - 43) / 157) * (0-(0)));
            yy = 0 + (((tickAnim - 43) / 157) * (0-(0)));
            zz = 0 + (((tickAnim - 43) / 157) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.head.rotationPointX = this.head.rotationPointX + (float)(xx);
        this.head.rotationPointY = this.head.rotationPointY - (float)(yy);
        this.head.rotationPointZ = this.head.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 26) {
            xx = 0 + (((tickAnim - 0) / 26) * (-30.50816-(0)));
            yy = 0 + (((tickAnim - 0) / 26) * (-5.24368-(0)));
            zz = 0 + (((tickAnim - 0) / 26) * (-13.26095-(0)));
        }
        else if (tickAnim >= 26 && tickAnim < 39) {
            xx = -30.50816 + (((tickAnim - 26) / 13) * (-39.62869-(-30.50816)));
            yy = -5.24368 + (((tickAnim - 26) / 13) * (-7.09439-(-5.24368)));
            zz = -13.26095 + (((tickAnim - 26) / 13) * (-17.94128-(-13.26095)));
        }
        else if (tickAnim >= 39 && tickAnim < 152) {
            xx = -39.62869 + (((tickAnim - 39) / 113) * (-39.62869-(-39.62869)));
            yy = -7.09439 + (((tickAnim - 39) / 113) * (-7.09439-(-7.09439)));
            zz = -17.94128 + (((tickAnim - 39) / 113) * (-17.94128-(-17.94128)));
        }
        else if (tickAnim >= 152 && tickAnim < 166) {
            xx = -39.62869 + (((tickAnim - 152) / 14) * (-25.58559-(-39.62869)));
            yy = -7.09439 + (((tickAnim - 152) / 14) * (-3.47264-(-7.09439)));
            zz = -17.94128 + (((tickAnim - 152) / 14) * (-22.32798-(-17.94128)));
        }
        else if (tickAnim >= 166 && tickAnim < 176) {
            xx = -25.58559 + (((tickAnim - 166) / 10) * (-28.75888-(-25.58559)));
            yy = -3.47264 + (((tickAnim - 166) / 10) * (-2.83864-(-3.47264)));
            zz = -22.32798 + (((tickAnim - 166) / 10) * (-19.17383-(-22.32798)));
        }
        else if (tickAnim >= 176 && tickAnim < 182) {
            xx = -28.75888 + (((tickAnim - 176) / 6) * (-12.35185-(-28.75888)));
            yy = -2.83864 + (((tickAnim - 176) / 6) * (-2.29789-(-2.83864)));
            zz = -19.17383 + (((tickAnim - 176) / 6) * (-5.81123-(-19.17383)));
        }
        else if (tickAnim >= 182 && tickAnim < 188) {
            xx = -12.35185 + (((tickAnim - 182) / 6) * (0-(-12.35185)));
            yy = -2.29789 + (((tickAnim - 182) / 6) * (0-(-2.29789)));
            zz = -5.81123 + (((tickAnim - 182) / 6) * (0-(-5.81123)));
        }
        else if (tickAnim >= 188 && tickAnim < 200) {
            xx = 0 + (((tickAnim - 188) / 12) * (0-(0)));
            yy = 0 + (((tickAnim - 188) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 188) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontleftleg, frontleftleg.rotateAngleX + (float) Math.toRadians(xx), frontleftleg.rotateAngleY + (float) Math.toRadians(yy), frontleftleg.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 0) / 11) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 11) * (1.705-(0)));
            zz = 0 + (((tickAnim - 0) / 11) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 39) {
            xx = 0 + (((tickAnim - 11) / 28) * (0-(0)));
            yy = 1.705 + (((tickAnim - 11) / 28) * (0.5-(1.705)));
            zz = 0 + (((tickAnim - 11) / 28) * (0-(0)));
        }
        else if (tickAnim >= 39 && tickAnim < 111) {
            xx = 0 + (((tickAnim - 39) / 72) * (0-(0)));
            yy = 0.5 + (((tickAnim - 39) / 72) * (1-(0.5)));
            zz = 0 + (((tickAnim - 39) / 72) * (0-(0)));
        }
        else if (tickAnim >= 111 && tickAnim < 129) {
            xx = 0 + (((tickAnim - 111) / 18) * (0-(0)));
            yy = 1 + (((tickAnim - 111) / 18) * (1-(1)));
            zz = 0 + (((tickAnim - 111) / 18) * (0-(0)));
        }
        else if (tickAnim >= 129 && tickAnim < 152) {
            xx = 0 + (((tickAnim - 129) / 23) * (0-(0)));
            yy = 1 + (((tickAnim - 129) / 23) * (1-(1)));
            zz = 0 + (((tickAnim - 129) / 23) * (0-(0)));
        }
        else if (tickAnim >= 152 && tickAnim < 166) {
            xx = 0 + (((tickAnim - 152) / 14) * (0-(0)));
            yy = 1 + (((tickAnim - 152) / 14) * (0.06-(1)));
            zz = 0 + (((tickAnim - 152) / 14) * (0-(0)));
        }
        else if (tickAnim >= 166 && tickAnim < 176) {
            xx = 0 + (((tickAnim - 166) / 10) * (0-(0)));
            yy = 0.06 + (((tickAnim - 166) / 10) * (-0.425-(0.06)));
            zz = 0 + (((tickAnim - 166) / 10) * (0-(0)));
        }
        else if (tickAnim >= 176 && tickAnim < 182) {
            xx = 0 + (((tickAnim - 176) / 6) * (0-(0)));
            yy = -0.425 + (((tickAnim - 176) / 6) * (2.635-(-0.425)));
            zz = 0 + (((tickAnim - 176) / 6) * (0-(0)));
        }
        else if (tickAnim >= 182 && tickAnim < 188) {
            xx = 0 + (((tickAnim - 182) / 6) * (0-(0)));
            yy = 2.635 + (((tickAnim - 182) / 6) * (0.925-(2.635)));
            zz = 0 + (((tickAnim - 182) / 6) * (0-(0)));
        }
        else if (tickAnim >= 188 && tickAnim < 200) {
            xx = 0 + (((tickAnim - 188) / 12) * (0-(0)));
            yy = 0.925 + (((tickAnim - 188) / 12) * (0-(0.925)));
            zz = 0 + (((tickAnim - 188) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.frontleftleg.rotationPointX = this.frontleftleg.rotationPointX + (float)(xx);
        this.frontleftleg.rotationPointY = this.frontleftleg.rotationPointY - (float)(yy);
        this.frontleftleg.rotationPointZ = this.frontleftleg.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 17) {
            xx = 0 + (((tickAnim - 0) / 17) * (-1.31191-(0)));
            yy = 0 + (((tickAnim - 0) / 17) * (0.81967-(0)));
            zz = 0 + (((tickAnim - 0) / 17) * (-1.15445-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 39) {
            xx = -1.31191 + (((tickAnim - 17) / 22) * (-32.29329-(-1.31191)));
            yy = 0.81967 + (((tickAnim - 17) / 22) * (-7.51113-(0.81967)));
            zz = -1.15445 + (((tickAnim - 17) / 22) * (10.32016-(-1.15445)));
        }
        else if (tickAnim >= 39 && tickAnim < 152) {
            xx = -32.29329 + (((tickAnim - 39) / 113) * (-32.29329-(-32.29329)));
            yy = -7.51113 + (((tickAnim - 39) / 113) * (-7.51113-(-7.51113)));
            zz = 10.32016 + (((tickAnim - 39) / 113) * (10.32016-(10.32016)));
        }
        else if (tickAnim >= 152 && tickAnim < 166) {
            xx = -32.29329 + (((tickAnim - 152) / 14) * (-7.07681-(-32.29329)));
            yy = -7.51113 + (((tickAnim - 152) / 14) * (1.19312-(-7.51113)));
            zz = 10.32016 + (((tickAnim - 152) / 14) * (-1.68045-(10.32016)));
        }
        else if (tickAnim >= 166 && tickAnim < 176) {
            xx = -7.07681 + (((tickAnim - 166) / 10) * (0.42738-(-7.07681)));
            yy = 1.19312 + (((tickAnim - 166) / 10) * (0.84392-(1.19312)));
            zz = -1.68045 + (((tickAnim - 166) / 10) * (-1.18861-(-1.68045)));
        }
        else if (tickAnim >= 176 && tickAnim < 182) {
            xx = 0.42738 + (((tickAnim - 176) / 6) * (-14.91984-(0.42738)));
            yy = 0.84392 + (((tickAnim - 176) / 6) * (1.95064-(0.84392)));
            zz = -1.18861 + (((tickAnim - 176) / 6) * (-2.42593-(-1.18861)));
        }
        else if (tickAnim >= 182 && tickAnim < 188) {
            xx = -14.91984 + (((tickAnim - 182) / 6) * (0-(-14.91984)));
            yy = 1.95064 + (((tickAnim - 182) / 6) * (0-(1.95064)));
            zz = -2.42593 + (((tickAnim - 182) / 6) * (0-(-2.42593)));
        }
        else if (tickAnim >= 188 && tickAnim < 200) {
            xx = 0 + (((tickAnim - 188) / 12) * (0-(0)));
            yy = 0 + (((tickAnim - 188) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 188) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontleftleg2, frontleftleg2.rotateAngleX + (float) Math.toRadians(xx), frontleftleg2.rotateAngleY + (float) Math.toRadians(yy), frontleftleg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 17) {
            xx = 0 + (((tickAnim - 0) / 17) * (-0.5-(0)));
            yy = 0 + (((tickAnim - 0) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 17) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 39) {
            xx = -0.5 + (((tickAnim - 17) / 22) * (-1.1-(-0.5)));
            yy = 0 + (((tickAnim - 17) / 22) * (1.3-(0)));
            zz = 0 + (((tickAnim - 17) / 22) * (0-(0)));
        }
        else if (tickAnim >= 39 && tickAnim < 152) {
            xx = -1.1 + (((tickAnim - 39) / 113) * (-1.1-(-1.1)));
            yy = 1.3 + (((tickAnim - 39) / 113) * (1.3-(1.3)));
            zz = 0 + (((tickAnim - 39) / 113) * (0-(0)));
        }
        else if (tickAnim >= 152 && tickAnim < 200) {
            xx = -1.1 + (((tickAnim - 152) / 48) * (0-(-1.1)));
            yy = 1.3 + (((tickAnim - 152) / 48) * (0-(1.3)));
            zz = 0 + (((tickAnim - 152) / 48) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.frontleftleg2.rotationPointX = this.frontleftleg2.rotationPointX + (float)(xx);
        this.frontleftleg2.rotationPointY = this.frontleftleg2.rotationPointY - (float)(yy);
        this.frontleftleg2.rotationPointZ = this.frontleftleg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 17) {
            xx = 0 + (((tickAnim - 0) / 17) * (31.58243-(0)));
            yy = 0 + (((tickAnim - 0) / 17) * (-15.70972-(0)));
            zz = 0 + (((tickAnim - 0) / 17) * (9.39484-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 39) {
            xx = 31.58243 + (((tickAnim - 17) / 22) * (76.67751-(31.58243)));
            yy = -15.70972 + (((tickAnim - 17) / 22) * (-17.97089-(-15.70972)));
            zz = 9.39484 + (((tickAnim - 17) / 22) * (1.0301-(9.39484)));
        }
        else if (tickAnim >= 39 && tickAnim < 152) {
            xx = 76.67751 + (((tickAnim - 39) / 113) * (76.67751-(76.67751)));
            yy = -17.97089 + (((tickAnim - 39) / 113) * (-17.97089-(-17.97089)));
            zz = 1.0301 + (((tickAnim - 39) / 113) * (1.0301-(1.0301)));
        }
        else if (tickAnim >= 152 && tickAnim < 166) {
            xx = 76.67751 + (((tickAnim - 152) / 14) * (35.17673-(76.67751)));
            yy = -17.97089 + (((tickAnim - 152) / 14) * (-16.41582-(-17.97089)));
            zz = 1.0301 + (((tickAnim - 152) / 14) * (17.9614-(1.0301)));
        }
        else if (tickAnim >= 166 && tickAnim < 176) {
            xx = 35.17673 + (((tickAnim - 166) / 10) * (30.53607-(35.17673)));
            yy = -16.41582 + (((tickAnim - 166) / 10) * (-11.77994-(-16.41582)));
            zz = 17.9614 + (((tickAnim - 166) / 10) * (13.63578-(17.9614)));
        }
        else if (tickAnim >= 176 && tickAnim < 182) {
            xx = 30.53607 + (((tickAnim - 176) / 6) * (47.01539-(30.53607)));
            yy = -11.77994 + (((tickAnim - 176) / 6) * (-10.09363-(-11.77994)));
            zz = 13.63578 + (((tickAnim - 176) / 6) * (4.20879-(13.63578)));
        }
        else if (tickAnim >= 182 && tickAnim < 188) {
            xx = 47.01539 + (((tickAnim - 182) / 6) * (0-(47.01539)));
            yy = -10.09363 + (((tickAnim - 182) / 6) * (0-(-10.09363)));
            zz = 4.20879 + (((tickAnim - 182) / 6) * (0-(4.20879)));
        }
        else if (tickAnim >= 188 && tickAnim < 200) {
            xx = 0 + (((tickAnim - 188) / 12) * (0-(0)));
            yy = 0 + (((tickAnim - 188) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 188) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontleftleg3, frontleftleg3.rotateAngleX + (float) Math.toRadians(xx), frontleftleg3.rotateAngleY + (float) Math.toRadians(yy), frontleftleg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 17) {
            xx = 0 + (((tickAnim - 0) / 17) * (0.18-(0)));
            yy = 0 + (((tickAnim - 0) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 17) * (-1.275-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 26) {
            xx = 0.18 + (((tickAnim - 17) / 9) * (0.275-(0.18)));
            yy = 0 + (((tickAnim - 17) / 9) * (0-(0)));
            zz = -1.275 + (((tickAnim - 17) / 9) * (-0.55-(-1.275)));
        }
        else if (tickAnim >= 26 && tickAnim < 39) {
            xx = 0.275 + (((tickAnim - 26) / 13) * (0.23-(0.275)));
            yy = 0 + (((tickAnim - 26) / 13) * (0.085-(0)));
            zz = -0.55 + (((tickAnim - 26) / 13) * (-0.5-(-0.55)));
        }
        else if (tickAnim >= 39 && tickAnim < 152) {
            xx = 0.23 + (((tickAnim - 39) / 113) * (0.23-(0.23)));
            yy = 0.085 + (((tickAnim - 39) / 113) * (0.085-(0.085)));
            zz = -0.5 + (((tickAnim - 39) / 113) * (-0.5-(-0.5)));
        }
        else if (tickAnim >= 152 && tickAnim < 166) {
            xx = 0.23 + (((tickAnim - 152) / 14) * (0.05-(0.23)));
            yy = 0.085 + (((tickAnim - 152) / 14) * (0.04-(0.085)));
            zz = -0.5 + (((tickAnim - 152) / 14) * (-0.51-(-0.5)));
        }
        else if (tickAnim >= 166 && tickAnim < 176) {
            xx = 0.05 + (((tickAnim - 166) / 10) * (0-(0.05)));
            yy = 0.04 + (((tickAnim - 166) / 10) * (0-(0.04)));
            zz = -0.51 + (((tickAnim - 166) / 10) * (0-(-0.51)));
        }
        else if (tickAnim >= 176 && tickAnim < 182) {
            xx = 0 + (((tickAnim - 176) / 6) * (0.08-(0)));
            yy = 0 + (((tickAnim - 176) / 6) * (0.03-(0)));
            zz = 0 + (((tickAnim - 176) / 6) * (-1.195-(0)));
        }
        else if (tickAnim >= 182 && tickAnim < 188) {
            xx = 0.08 + (((tickAnim - 182) / 6) * (0-(0.08)));
            yy = 0.03 + (((tickAnim - 182) / 6) * (0-(0.03)));
            zz = -1.195 + (((tickAnim - 182) / 6) * (0-(-1.195)));
        }
        else if (tickAnim >= 188 && tickAnim < 200) {
            xx = 0 + (((tickAnim - 188) / 12) * (0-(0)));
            yy = 0 + (((tickAnim - 188) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 188) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.frontleftleg3.rotationPointX = this.frontleftleg3.rotationPointX + (float)(xx);
        this.frontleftleg3.rotationPointY = this.frontleftleg3.rotationPointY - (float)(yy);
        this.frontleftleg3.rotationPointZ = this.frontleftleg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 26) {
            xx = 0 + (((tickAnim - 0) / 26) * (-38.71-(0)));
            yy = 0 + (((tickAnim - 0) / 26) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 26) * (0-(0)));
        }
        else if (tickAnim >= 26 && tickAnim < 39) {
            xx = -38.71 + (((tickAnim - 26) / 13) * (-55.75-(-38.71)));
            yy = 0 + (((tickAnim - 26) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 26) / 13) * (0-(0)));
        }
        else if (tickAnim >= 39 && tickAnim < 152) {
            xx = -55.75 + (((tickAnim - 39) / 113) * (-55.75-(-55.75)));
            yy = 0 + (((tickAnim - 39) / 113) * (0-(0)));
            zz = 0 + (((tickAnim - 39) / 113) * (0-(0)));
        }
        else if (tickAnim >= 152 && tickAnim < 166) {
            xx = -55.75 + (((tickAnim - 152) / 14) * (-31.31-(-55.75)));
            yy = 0 + (((tickAnim - 152) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 152) / 14) * (0-(0)));
        }
        else if (tickAnim >= 166 && tickAnim < 176) {
            xx = -31.31 + (((tickAnim - 166) / 10) * (-34.14229-(-31.31)));
            yy = 0 + (((tickAnim - 166) / 10) * (0.25313-(0)));
            zz = 0 + (((tickAnim - 166) / 10) * (3.49085-(0)));
        }
        else if (tickAnim >= 176 && tickAnim < 188) {
            xx = -34.14229 + (((tickAnim - 176) / 12) * (-34.14229-(-34.14229)));
            yy = 0.25313 + (((tickAnim - 176) / 12) * (0.25313-(0.25313)));
            zz = 3.49085 + (((tickAnim - 176) / 12) * (3.49085-(3.49085)));
        }
        else if (tickAnim >= 188 && tickAnim < 200) {
            xx = -34.14229 + (((tickAnim - 188) / 12) * (0-(-34.14229)));
            yy = 0.25313 + (((tickAnim - 188) / 12) * (0-(0.25313)));
            zz = 3.49085 + (((tickAnim - 188) / 12) * (0-(3.49085)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontrightleg, frontrightleg.rotateAngleX + (float) Math.toRadians(xx), frontrightleg.rotateAngleY + (float) Math.toRadians(yy), frontrightleg.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 0) / 11) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 11) * (2.19-(0)));
            zz = 0 + (((tickAnim - 0) / 11) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 26) {
            xx = 0 + (((tickAnim - 11) / 15) * (0-(0)));
            yy = 2.19 + (((tickAnim - 11) / 15) * (0-(2.19)));
            zz = 0 + (((tickAnim - 11) / 15) * (0-(0)));
        }
        else if (tickAnim >= 26 && tickAnim < 39) {
            xx = 0 + (((tickAnim - 26) / 13) * (0-(0)));
            yy = 0 + (((tickAnim - 26) / 13) * (2.15-(0)));
            zz = 0 + (((tickAnim - 26) / 13) * (0-(0)));
        }
        else if (tickAnim >= 39 && tickAnim < 111) {
            xx = 0 + (((tickAnim - 39) / 72) * (0-(0)));
            yy = 2.15 + (((tickAnim - 39) / 72) * (2.375-(2.15)));
            zz = 0 + (((tickAnim - 39) / 72) * (0-(0)));
        }
        else if (tickAnim >= 111 && tickAnim < 129) {
            xx = 0 + (((tickAnim - 111) / 18) * (0-(0)));
            yy = 2.375 + (((tickAnim - 111) / 18) * (2.375-(2.375)));
            zz = 0 + (((tickAnim - 111) / 18) * (0-(0)));
        }
        else if (tickAnim >= 129 && tickAnim < 152) {
            xx = 0 + (((tickAnim - 129) / 23) * (0-(0)));
            yy = 2.375 + (((tickAnim - 129) / 23) * (2.15-(2.375)));
            zz = 0 + (((tickAnim - 129) / 23) * (0-(0)));
        }
        else if (tickAnim >= 152 && tickAnim < 166) {
            xx = 0 + (((tickAnim - 152) / 14) * (0-(0)));
            yy = 2.15 + (((tickAnim - 152) / 14) * (0.975-(2.15)));
            zz = 0 + (((tickAnim - 152) / 14) * (0.375-(0)));
        }
        else if (tickAnim >= 166 && tickAnim < 176) {
            xx = 0 + (((tickAnim - 166) / 10) * (0-(0)));
            yy = 0.975 + (((tickAnim - 166) / 10) * (1.265-(0.975)));
            zz = 0.375 + (((tickAnim - 166) / 10) * (0.21-(0.375)));
        }
        else if (tickAnim >= 176 && tickAnim < 188) {
            xx = 0 + (((tickAnim - 176) / 12) * (0-(0)));
            yy = 1.265 + (((tickAnim - 176) / 12) * (-0.36-(1.265)));
            zz = 0.21 + (((tickAnim - 176) / 12) * (0.21-(0.21)));
        }
        else if (tickAnim >= 188 && tickAnim < 194) {
            xx = 0 + (((tickAnim - 188) / 6) * (0-(0)));
            yy = -0.36 + (((tickAnim - 188) / 6) * (2.115-(-0.36)));
            zz = 0.21 + (((tickAnim - 188) / 6) * (0.06-(0.21)));
        }
        else if (tickAnim >= 194 && tickAnim < 200) {
            xx = 0 + (((tickAnim - 194) / 6) * (0-(0)));
            yy = 2.115 + (((tickAnim - 194) / 6) * (0-(2.115)));
            zz = 0.06 + (((tickAnim - 194) / 6) * (0-(0.06)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.frontrightleg.rotationPointX = this.frontrightleg.rotationPointX + (float)(xx);
        this.frontrightleg.rotationPointY = this.frontrightleg.rotationPointY - (float)(yy);
        this.frontrightleg.rotationPointZ = this.frontrightleg.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 17) {
            xx = 0 + (((tickAnim - 0) / 17) * (-2.66603-(0)));
            yy = 0 + (((tickAnim - 0) / 17) * (-1.03231-(0)));
            zz = 0 + (((tickAnim - 0) / 17) * (1.40443-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 39) {
            xx = -2.66603 + (((tickAnim - 17) / 22) * (-19.4216-(-2.66603)));
            yy = -1.03231 + (((tickAnim - 17) / 22) * (-2.38226-(-1.03231)));
            zz = 1.40443 + (((tickAnim - 17) / 22) * (3.24099-(1.40443)));
        }
        else if (tickAnim >= 39 && tickAnim < 152) {
            xx = -19.4216 + (((tickAnim - 39) / 113) * (-19.4216-(-19.4216)));
            yy = -2.38226 + (((tickAnim - 39) / 113) * (-2.38226-(-2.38226)));
            zz = 3.24099 + (((tickAnim - 39) / 113) * (3.24099-(3.24099)));
        }
        else if (tickAnim >= 152 && tickAnim < 166) {
            xx = -19.4216 + (((tickAnim - 152) / 14) * (-1.2249-(-19.4216)));
            yy = -2.38226 + (((tickAnim - 152) / 14) * (-1.44648-(-2.38226)));
            zz = 3.24099 + (((tickAnim - 152) / 14) * (1.96788-(3.24099)));
        }
        else if (tickAnim >= 166 && tickAnim < 176) {
            xx = -1.2249 + (((tickAnim - 166) / 10) * (8.1336-(-1.2249)));
            yy = -1.44648 + (((tickAnim - 166) / 10) * (-1.02312-(-1.44648)));
            zz = 1.96788 + (((tickAnim - 166) / 10) * (1.39192-(1.96788)));
        }
        else if (tickAnim >= 176 && tickAnim < 188) {
            xx = 8.1336 + (((tickAnim - 176) / 12) * (6.75-(8.1336)));
            yy = -1.02312 + (((tickAnim - 176) / 12) * (0-(-1.02312)));
            zz = 1.39192 + (((tickAnim - 176) / 12) * (0-(1.39192)));
        }
        else if (tickAnim >= 188 && tickAnim < 194) {
            xx = 6.75 + (((tickAnim - 188) / 6) * (-8.03672-(6.75)));
            yy = 0 + (((tickAnim - 188) / 6) * (-0.24696-(0)));
            zz = 0 + (((tickAnim - 188) / 6) * (0.33598-(0)));
        }
        else if (tickAnim >= 194 && tickAnim < 200) {
            xx = -8.03672 + (((tickAnim - 194) / 6) * (0-(-8.03672)));
            yy = -0.24696 + (((tickAnim - 194) / 6) * (0-(-0.24696)));
            zz = 0.33598 + (((tickAnim - 194) / 6) * (0-(0.33598)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontrightleg2, frontrightleg2.rotateAngleX + (float) Math.toRadians(xx), frontrightleg2.rotateAngleY + (float) Math.toRadians(yy), frontrightleg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 39) {
            xx = 0 + (((tickAnim - 0) / 39) * (0.06-(0)));
            yy = 0 + (((tickAnim - 0) / 39) * (0.595-(0)));
            zz = 0 + (((tickAnim - 0) / 39) * (0-(0)));
        }
        else if (tickAnim >= 39 && tickAnim < 152) {
            xx = 0.06 + (((tickAnim - 39) / 113) * (0.06-(0.06)));
            yy = 0.595 + (((tickAnim - 39) / 113) * (0.595-(0.595)));
            zz = 0 + (((tickAnim - 39) / 113) * (0-(0)));
        }
        else if (tickAnim >= 152 && tickAnim < 200) {
            xx = 0.06 + (((tickAnim - 152) / 48) * (0-(0.06)));
            yy = 0.595 + (((tickAnim - 152) / 48) * (0-(0.595)));
            zz = 0 + (((tickAnim - 152) / 48) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.frontrightleg2.rotationPointX = this.frontrightleg2.rotationPointX + (float)(xx);
        this.frontrightleg2.rotationPointY = this.frontrightleg2.rotationPointY - (float)(yy);
        this.frontrightleg2.rotationPointZ = this.frontrightleg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 39) {
            xx = 0 + (((tickAnim - 0) / 39) * (74.44158-(0)));
            yy = 0 + (((tickAnim - 0) / 39) * (14.68212-(0)));
            zz = 0 + (((tickAnim - 0) / 39) * (-1.41851-(0)));
        }
        else if (tickAnim >= 39 && tickAnim < 152) {
            xx = 74.44158 + (((tickAnim - 39) / 113) * (74.44158-(74.44158)));
            yy = 14.68212 + (((tickAnim - 39) / 113) * (14.68212-(14.68212)));
            zz = -1.41851 + (((tickAnim - 39) / 113) * (-1.41851-(-1.41851)));
        }
        else if (tickAnim >= 152 && tickAnim < 166) {
            xx = 74.44158 + (((tickAnim - 152) / 14) * (41.88479-(74.44158)));
            yy = 14.68212 + (((tickAnim - 152) / 14) * (14.16011-(14.68212)));
            zz = -1.41851 + (((tickAnim - 152) / 14) * (-5.15672-(-1.41851)));
        }
        else if (tickAnim >= 166 && tickAnim < 188) {
            xx = 41.88479 + (((tickAnim - 166) / 22) * (29.97902-(41.88479)));
            yy = 14.16011 + (((tickAnim - 166) / 22) * (2.94749-(14.16011)));
            zz = -5.15672 + (((tickAnim - 166) / 22) * (-0.28477-(-5.15672)));
        }
        else if (tickAnim >= 188 && tickAnim < 194) {
            xx = 29.97902 + (((tickAnim - 188) / 6) * (50.48951-(29.97902)));
            yy = 2.94749 + (((tickAnim - 188) / 6) * (1.47374-(2.94749)));
            zz = -0.28477 + (((tickAnim - 188) / 6) * (-0.14239-(-0.28477)));
        }
        else if (tickAnim >= 194 && tickAnim < 200) {
            xx = 50.48951 + (((tickAnim - 194) / 6) * (0-(50.48951)));
            yy = 1.47374 + (((tickAnim - 194) / 6) * (0-(1.47374)));
            zz = -0.14239 + (((tickAnim - 194) / 6) * (0-(-0.14239)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontrightleg3, frontrightleg3.rotateAngleX + (float) Math.toRadians(xx), frontrightleg3.rotateAngleY + (float) Math.toRadians(yy), frontrightleg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 39) {
            xx = 0 + (((tickAnim - 0) / 39) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 39) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 39) * (-1.225-(0)));
        }
        else if (tickAnim >= 39 && tickAnim < 152) {
            xx = 0 + (((tickAnim - 39) / 113) * (0-(0)));
            yy = 0 + (((tickAnim - 39) / 113) * (0-(0)));
            zz = -1.225 + (((tickAnim - 39) / 113) * (-1.225-(-1.225)));
        }
        else if (tickAnim >= 152 && tickAnim < 166) {
            xx = 0 + (((tickAnim - 152) / 14) * (0-(0)));
            yy = 0 + (((tickAnim - 152) / 14) * (0-(0)));
            zz = -1.225 + (((tickAnim - 152) / 14) * (-1.905-(-1.225)));
        }
        else if (tickAnim >= 166 && tickAnim < 194) {
            xx = 0 + (((tickAnim - 166) / 28) * (0-(0)));
            yy = 0 + (((tickAnim - 166) / 28) * (0-(0)));
            zz = -1.905 + (((tickAnim - 166) / 28) * (-1.105-(-1.905)));
        }
        else if (tickAnim >= 194 && tickAnim < 200) {
            xx = 0 + (((tickAnim - 194) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 194) / 6) * (0-(0)));
            zz = -1.105 + (((tickAnim - 194) / 6) * (0-(-1.105)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.frontrightleg3.rotationPointX = this.frontrightleg3.rotationPointX + (float)(xx);
        this.frontrightleg3.rotationPointY = this.frontrightleg3.rotationPointY - (float)(yy);
        this.frontrightleg3.rotationPointZ = this.frontrightleg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 43) {
            xx = 0 + (((tickAnim - 0) / 43) * (-2.5-(0)));
            yy = 0 + (((tickAnim - 0) / 43) * (4-(0)));
            zz = 0 + (((tickAnim - 0) / 43) * (0-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 69) {
            xx = -2.5 + (((tickAnim - 43) / 26) * (-2.5-(-2.5)));
            yy = 4 + (((tickAnim - 43) / 26) * (4-(4)));
            zz = 0 + (((tickAnim - 43) / 26) * (0-(0)));
        }
        else if (tickAnim >= 69 && tickAnim < 89) {
            xx = -2.5 + (((tickAnim - 69) / 20) * (-2.5016-(-2.5)));
            yy = 4 + (((tickAnim - 69) / 20) * (-4.49193-(4)));
            zz = 0 + (((tickAnim - 69) / 20) * (0.37055-(0)));
        }
        else if (tickAnim >= 89 && tickAnim < 153) {
            xx = -2.5016 + (((tickAnim - 89) / 64) * (-2.59759-(-2.5016)));
            yy = -4.49193 + (((tickAnim - 89) / 64) * (-16.23798-(-4.49193)));
            zz = 0.37055 + (((tickAnim - 89) / 64) * (0.55232-(0.37055)));
        }
        else if (tickAnim >= 153 && tickAnim < 200) {
            xx = -2.59759 + (((tickAnim - 153) / 47) * (0-(-2.59759)));
            yy = -16.23798 + (((tickAnim - 153) / 47) * (0-(-16.23798)));
            zz = 0.55232 + (((tickAnim - 153) / 47) * (0-(0.55232)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail, tail.rotateAngleX + (float) Math.toRadians(xx), tail.rotateAngleY + (float) Math.toRadians(yy), tail.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 43) {
            xx = 0 + (((tickAnim - 0) / 43) * (-1.52052-(0)));
            yy = 0 + (((tickAnim - 0) / 43) * (3.69576-(0)));
            zz = 0 + (((tickAnim - 0) / 43) * (-0.63594-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 69) {
            xx = -1.52052 + (((tickAnim - 43) / 26) * (-1.52052-(-1.52052)));
            yy = 3.69576 + (((tickAnim - 43) / 26) * (3.69576-(3.69576)));
            zz = -0.63594 + (((tickAnim - 43) / 26) * (-0.63594-(-0.63594)));
        }
        else if (tickAnim >= 69 && tickAnim < 89) {
            xx = -1.52052 + (((tickAnim - 69) / 20) * (-1.52885-(-1.52052)));
            yy = 3.69576 + (((tickAnim - 69) / 20) * (4.68928-(3.69576)));
            zz = -0.63594 + (((tickAnim - 69) / 20) * (-0.74988-(-0.63594)));
        }
        else if (tickAnim >= 89 && tickAnim < 153) {
            xx = -1.52885 + (((tickAnim - 89) / 64) * (-1.68409-(-1.52885)));
            yy = 4.68928 + (((tickAnim - 89) / 64) * (-13.19315-(4.68928)));
            zz = -0.74988 + (((tickAnim - 89) / 64) * (1.31831-(-0.74988)));
        }
        else if (tickAnim >= 153 && tickAnim < 172) {
            xx = -1.68409 + (((tickAnim - 153) / 19) * (-5.41413-(-1.68409)));
            yy = -13.19315 + (((tickAnim - 153) / 19) * (-8.24648-(-13.19315)));
            zz = 1.31831 + (((tickAnim - 153) / 19) * (0.82402-(1.31831)));
        }
        else if (tickAnim >= 172 && tickAnim < 200) {
            xx = -5.41413 + (((tickAnim - 172) / 28) * (0-(-5.41413)));
            yy = -8.24648 + (((tickAnim - 172) / 28) * (0-(-8.24648)));
            zz = 0.82402 + (((tickAnim - 172) / 28) * (0-(0.82402)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(xx), tail2.rotateAngleY + (float) Math.toRadians(yy), tail2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 43) {
            xx = 0 + (((tickAnim - 0) / 43) * (-2.17686-(0)));
            yy = 0 + (((tickAnim - 0) / 43) * (8.0452-(0)));
            zz = 0 + (((tickAnim - 0) / 43) * (-2.99938-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 69) {
            xx = -2.17686 + (((tickAnim - 43) / 26) * (-2.17686-(-2.17686)));
            yy = 8.0452 + (((tickAnim - 43) / 26) * (8.0452-(8.0452)));
            zz = -2.99938 + (((tickAnim - 43) / 26) * (-2.99938-(-2.99938)));
        }
        else if (tickAnim >= 69 && tickAnim < 89) {
            xx = -2.17686 + (((tickAnim - 69) / 20) * (-1.30512-(-2.17686)));
            yy = 8.0452 + (((tickAnim - 69) / 20) * (9.24667-(8.0452)));
            zz = -2.99938 + (((tickAnim - 69) / 20) * (2.96824-(-2.99938)));
        }
        else if (tickAnim >= 89 && tickAnim < 153) {
            xx = -1.30512 + (((tickAnim - 89) / 64) * (-4.28275-(-1.30512)));
            yy = 9.24667 + (((tickAnim - 89) / 64) * (-7.9009-(9.24667)));
            zz = 2.96824 + (((tickAnim - 89) / 64) * (4.85242-(2.96824)));
        }
        else if (tickAnim >= 153 && tickAnim < 172) {
            xx = -4.28275 + (((tickAnim - 153) / 19) * (-11.45079-(-4.28275)));
            yy = -7.9009 + (((tickAnim - 153) / 19) * (-5.08989-(-7.9009)));
            zz = 4.85242 + (((tickAnim - 153) / 19) * (3.12601-(4.85242)));
        }
        else if (tickAnim >= 172 && tickAnim < 200) {
            xx = -11.45079 + (((tickAnim - 172) / 28) * (0-(-11.45079)));
            yy = -5.08989 + (((tickAnim - 172) / 28) * (0-(-5.08989)));
            zz = 3.12601 + (((tickAnim - 172) / 28) * (0-(3.12601)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(xx), tail3.rotateAngleY + (float) Math.toRadians(yy), tail3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 43) {
            xx = 0 + (((tickAnim - 0) / 43) * (4.59647-(0)));
            yy = 0 + (((tickAnim - 0) / 43) * (4.79437-(0)));
            zz = 0 + (((tickAnim - 0) / 43) * (-0.99207-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 69) {
            xx = 4.59647 + (((tickAnim - 43) / 26) * (4.59647-(4.59647)));
            yy = 4.79437 + (((tickAnim - 43) / 26) * (4.79437-(4.79437)));
            zz = -0.99207 + (((tickAnim - 43) / 26) * (-0.99207-(-0.99207)));
        }
        else if (tickAnim >= 69 && tickAnim < 89) {
            xx = 4.59647 + (((tickAnim - 69) / 20) * (3.72522-(4.59647)));
            yy = 4.79437 + (((tickAnim - 69) / 20) * (12.22781-(4.79437)));
            zz = -0.99207 + (((tickAnim - 69) / 20) * (-1.68296-(-0.99207)));
        }
        else if (tickAnim >= 89 && tickAnim < 115) {
            xx = 3.72522 + (((tickAnim - 89) / 26) * (10.41787-(3.72522)));
            yy = 12.22781 + (((tickAnim - 89) / 26) * (6.65553-(12.22781)));
            zz = -1.68296 + (((tickAnim - 89) / 26) * (1.06161-(-1.68296)));
        }
        else if (tickAnim >= 115 && tickAnim < 153) {
            xx = 10.41787 + (((tickAnim - 115) / 38) * (9.10075-(10.41787)));
            yy = 6.65553 + (((tickAnim - 115) / 38) * (-1.43328-(6.65553)));
            zz = 1.06161 + (((tickAnim - 115) / 38) * (5.04567-(1.06161)));
        }
        else if (tickAnim >= 153 && tickAnim < 172) {
            xx = 9.10075 + (((tickAnim - 153) / 19) * (9.78935-(9.10075)));
            yy = -1.43328 + (((tickAnim - 153) / 19) * (-0.89021-(-1.43328)));
            zz = 5.04567 + (((tickAnim - 153) / 19) * (3.13389-(5.04567)));
        }
        else if (tickAnim >= 172 && tickAnim < 200) {
            xx = 9.78935 + (((tickAnim - 172) / 28) * (0-(9.78935)));
            yy = -0.89021 + (((tickAnim - 172) / 28) * (0-(-0.89021)));
            zz = 3.13389 + (((tickAnim - 172) / 28) * (0-(3.13389)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(xx), tail4.rotateAngleY + (float) Math.toRadians(yy), tail4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 43) {
            xx = 0 + (((tickAnim - 0) / 43) * (20.7971-(0)));
            yy = 0 + (((tickAnim - 0) / 43) * (7.5551-(0)));
            zz = 0 + (((tickAnim - 0) / 43) * (-2.77139-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 69) {
            xx = 20.7971 + (((tickAnim - 43) / 26) * (20.7971-(20.7971)));
            yy = 7.5551 + (((tickAnim - 43) / 26) * (7.5551-(7.5551)));
            zz = -2.77139 + (((tickAnim - 43) / 26) * (-2.77139-(-2.77139)));
        }
        else if (tickAnim >= 69 && tickAnim < 89) {
            xx = 20.7971 + (((tickAnim - 69) / 20) * (21.28758-(20.7971)));
            yy = 7.5551 + (((tickAnim - 69) / 20) * (3.83995-(7.5551)));
            zz = -2.77139 + (((tickAnim - 69) / 20) * (1.121-(-2.77139)));
        }
        else if (tickAnim >= 89 && tickAnim < 153) {
            xx = 21.28758 + (((tickAnim - 89) / 64) * (17.25-(21.28758)));
            yy = 3.83995 + (((tickAnim - 89) / 64) * (0-(3.83995)));
            zz = 1.121 + (((tickAnim - 89) / 64) * (0-(1.121)));
        }
        else if (tickAnim >= 153 && tickAnim < 172) {
            xx = 17.25 + (((tickAnim - 153) / 19) * (25.11-(17.25)));
            yy = 0 + (((tickAnim - 153) / 19) * (0-(0)));
            zz = 0 + (((tickAnim - 153) / 19) * (0-(0)));
        }
        else if (tickAnim >= 172 && tickAnim < 188) {
            xx = 25.11 + (((tickAnim - 172) / 16) * (-2.26-(25.11)));
            yy = 0 + (((tickAnim - 172) / 16) * (0-(0)));
            zz = 0 + (((tickAnim - 172) / 16) * (0-(0)));
        }
        else if (tickAnim >= 188 && tickAnim < 200) {
            xx = -2.26 + (((tickAnim - 188) / 12) * (0-(-2.26)));
            yy = 0 + (((tickAnim - 188) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 188) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail5, tail5.rotateAngleX + (float) Math.toRadians(xx), tail5.rotateAngleY + (float) Math.toRadians(yy), tail5.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 43) {
            xx = 0 + (((tickAnim - 0) / 43) * (27.75272-(0)));
            yy = 0 + (((tickAnim - 0) / 43) * (4.65002-(0)));
            zz = 0 + (((tickAnim - 0) / 43) * (-3.56213-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 69) {
            xx = 27.75272 + (((tickAnim - 43) / 26) * (27.75272-(27.75272)));
            yy = 4.65002 + (((tickAnim - 43) / 26) * (4.65002-(4.65002)));
            zz = -3.56213 + (((tickAnim - 43) / 26) * (-3.56213-(-3.56213)));
        }
        else if (tickAnim >= 69 && tickAnim < 89) {
            xx = 27.75272 + (((tickAnim - 69) / 20) * (27.90364-(27.75272)));
            yy = 4.65002 + (((tickAnim - 69) / 20) * (8.77631-(4.65002)));
            zz = -3.56213 + (((tickAnim - 69) / 20) * (2.00196-(-3.56213)));
        }
        else if (tickAnim >= 89 && tickAnim < 138) {
            xx = 27.90364 + (((tickAnim - 89) / 49) * (31.98937-(27.90364)));
            yy = 8.77631 + (((tickAnim - 89) / 49) * (11.83246-(8.77631)));
            zz = 2.00196 + (((tickAnim - 89) / 49) * (-3.94592-(2.00196)));
        }
        else if (tickAnim >= 138 && tickAnim < 153) {
            xx = 31.98937 + (((tickAnim - 138) / 15) * (27.64166-(31.98937)));
            yy = 11.83246 + (((tickAnim - 138) / 15) * (9.46284-(11.83246)));
            zz = -3.94592 + (((tickAnim - 138) / 15) * (-10.18243-(-3.94592)));
        }
        else if (tickAnim >= 153 && tickAnim < 172) {
            xx = 27.64166 + (((tickAnim - 153) / 19) * (22.66596-(27.64166)));
            yy = 9.46284 + (((tickAnim - 153) / 19) * (5.8396-(9.46284)));
            zz = -10.18243 + (((tickAnim - 153) / 19) * (-6.28367-(-10.18243)));
        }
        else if (tickAnim >= 172 && tickAnim < 188) {
            xx = 22.66596 + (((tickAnim - 172) / 16) * (12.19381-(22.66596)));
            yy = 5.8396 + (((tickAnim - 172) / 16) * (2.24747-(5.8396)));
            zz = -6.28367 + (((tickAnim - 172) / 16) * (-2.41838-(-6.28367)));
        }
        else if (tickAnim >= 188 && tickAnim < 200) {
            xx = 12.19381 + (((tickAnim - 188) / 12) * (0-(12.19381)));
            yy = 2.24747 + (((tickAnim - 188) / 12) * (0-(2.24747)));
            zz = -2.41838 + (((tickAnim - 188) / 12) * (0-(-2.41838)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail6, tail6.rotateAngleX + (float) Math.toRadians(xx), tail6.rotateAngleY + (float) Math.toRadians(yy), tail6.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 52 && tickAnim < 58) {
            xx = 0 + (((tickAnim - 52) / 6) * (13.25-(0)));
            yy = 0 + (((tickAnim - 52) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 52) / 6) * (0-(0)));
        }
        else if (tickAnim >= 58 && tickAnim < 67) {
            xx = 13.25 + (((tickAnim - 58) / 9) * (17.05-(13.25)));
            yy = 0 + (((tickAnim - 58) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 58) / 9) * (0-(0)));
        }
        else if (tickAnim >= 67 && tickAnim < 74) {
            xx = 17.05 + (((tickAnim - 67) / 7) * (0-(17.05)));
            yy = 0 + (((tickAnim - 67) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 67) / 7) * (0-(0)));
        }
        else if (tickAnim >= 74 && tickAnim < 107) {
            xx = 0 + (((tickAnim - 74) / 33) * (0-(0)));
            yy = 0 + (((tickAnim - 74) / 33) * (0-(0)));
            zz = 0 + (((tickAnim - 74) / 33) * (0-(0)));
        }
        else if (tickAnim >= 107 && tickAnim < 111) {
            xx = 0 + (((tickAnim - 107) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 107) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 107) / 4) * (0-(0)));
        }
        else if (tickAnim >= 111 && tickAnim < 129) {
            xx = 0 + (((tickAnim - 111) / 18) * (0-(0)));
            yy = 0 + (((tickAnim - 111) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 111) / 18) * (0-(0)));
        }
        else if (tickAnim >= 129 && tickAnim < 140) {
            xx = 0 + (((tickAnim - 129) / 11) * (3.75-(0)));
            yy = 0 + (((tickAnim - 129) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 129) / 11) * (0-(0)));
        }
        else if (tickAnim >= 140 && tickAnim < 153) {
            xx = 3.75 + (((tickAnim - 140) / 13) * (0-(3.75)));
            yy = 0 + (((tickAnim - 140) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 140) / 13) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(xx), jaw.rotateAngleY + (float) Math.toRadians(yy), jaw.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 48 && tickAnim < 63) {
            xx = 1 + (((tickAnim - 48) / 15) * (1-(1)));
            yy = 1 + (((tickAnim - 48) / 15) * (0.035-(1)));
            zz = 1 + (((tickAnim - 48) / 15) * (1-(1)));
        }
        else if (tickAnim >= 63 && tickAnim < 79) {
            xx = 1 + (((tickAnim - 63) / 16) * (1-(1)));
            yy = 0.035 + (((tickAnim - 63) / 16) * (1-(0.035)));
            zz = 1 + (((tickAnim - 63) / 16) * (1-(1)));
        }
        else if (tickAnim >= 79 && tickAnim < 124) {
            xx = 1 + (((tickAnim - 79) / 45) * (1-(1)));
            yy = 1 + (((tickAnim - 79) / 45) * (1-(1)));
            zz = 1 + (((tickAnim - 79) / 45) * (1-(1)));
        }
        else if (tickAnim >= 124 && tickAnim < 132) {
            xx = 1 + (((tickAnim - 124) / 8) * (1-(1)));
            yy = 1 + (((tickAnim - 124) / 8) * (0.035-(1)));
            zz = 1 + (((tickAnim - 124) / 8) * (1-(1)));
        }
        else if (tickAnim >= 132 && tickAnim < 138) {
            xx = 1 + (((tickAnim - 132) / 6) * (1-(1)));
            yy = 0.035 + (((tickAnim - 132) / 6) * (1-(0.035)));
            zz = 1 + (((tickAnim - 132) / 6) * (1-(1)));
        }
        else {
            xx = 1;
            yy = 1;
            zz = 1;
        }
        this.Eye.setScale((float)xx, (float)yy, (float)zz);

    }

    public void animIdle3(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraMiragaia entity = (EntityPrehistoricFloraMiragaia) entitylivingbaseIn;

        int animCycle = 130;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (2.25-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 40) {
            xx = 2.25 + (((tickAnim - 18) / 22) * (-13.75-(2.25)));
            yy = 0 + (((tickAnim - 18) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 22) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 97) {
            xx = -13.75 + (((tickAnim - 40) / 57) * (-13.75-(-13.75)));
            yy = 0 + (((tickAnim - 40) / 57) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 57) * (0-(0)));
        }
        else if (tickAnim >= 97 && tickAnim < 130) {
            xx = -13.75 + (((tickAnim - 97) / 33) * (0-(-13.75)));
            yy = 0 + (((tickAnim - 97) / 33) * (0-(0)));
            zz = 0 + (((tickAnim - 97) / 33) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(xx), body.rotateAngleY + (float) Math.toRadians(yy), body.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (-1.075-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 97) {
            xx = 0 + (((tickAnim - 40) / 57) * (0-(0)));
            yy = -1.075 + (((tickAnim - 40) / 57) * (-1.075-(-1.075)));
            zz = 0 + (((tickAnim - 40) / 57) * (0-(0)));
        }
        else if (tickAnim >= 97 && tickAnim < 130) {
            xx = 0 + (((tickAnim - 97) / 33) * (0-(0)));
            yy = -1.075 + (((tickAnim - 97) / 33) * (0-(-1.075)));
            zz = 0 + (((tickAnim - 97) / 33) * (0-(0)));
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
            yy = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 21) {
            xx = 0 + (((tickAnim - 7) / 14) * (-12.5-(0)));
            yy = 0 + (((tickAnim - 7) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 14) * (0-(0)));
        }
        else if (tickAnim >= 21 && tickAnim < 40) {
            xx = -12.5 + (((tickAnim - 21) / 19) * (0.5-(-12.5)));
            yy = 0 + (((tickAnim - 21) / 19) * (0-(0)));
            zz = 0 + (((tickAnim - 21) / 19) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 97) {
            xx = 0.5 + (((tickAnim - 40) / 57) * (0.5-(0.5)));
            yy = 0 + (((tickAnim - 40) / 57) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 57) * (0-(0)));
        }
        else if (tickAnim >= 97 && tickAnim < 130) {
            xx = 0.5 + (((tickAnim - 97) / 33) * (0-(0.5)));
            yy = 0 + (((tickAnim - 97) / 33) * (0-(0)));
            zz = 0 + (((tickAnim - 97) / 33) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backleftleg, backleftleg.rotateAngleX + (float) Math.toRadians(xx), backleftleg.rotateAngleY + (float) Math.toRadians(yy), backleftleg.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (-0.25-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 7) / 7) * (0-(0)));
            yy = -0.25 + (((tickAnim - 7) / 7) * (2.845-(-0.25)));
            zz = 0 + (((tickAnim - 7) / 7) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 21) {
            xx = 0 + (((tickAnim - 14) / 7) * (0-(0)));
            yy = 2.845 + (((tickAnim - 14) / 7) * (-0.725-(2.845)));
            zz = 0 + (((tickAnim - 14) / 7) * (0-(0)));
        }
        else if (tickAnim >= 21 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 21) / 19) * (0-(0)));
            yy = -0.725 + (((tickAnim - 21) / 19) * (-0.725-(-0.725)));
            zz = 0 + (((tickAnim - 21) / 19) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 97) {
            xx = 0 + (((tickAnim - 40) / 57) * (0-(0)));
            yy = -0.725 + (((tickAnim - 40) / 57) * (-0.725-(-0.725)));
            zz = 0 + (((tickAnim - 40) / 57) * (0-(0)));
        }
        else if (tickAnim >= 97 && tickAnim < 130) {
            xx = 0 + (((tickAnim - 97) / 33) * (0-(0)));
            yy = -0.725 + (((tickAnim - 97) / 33) * (0-(-0.725)));
            zz = 0 + (((tickAnim - 97) / 33) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.backleftleg.rotationPointX = this.backleftleg.rotationPointX + (float)(xx);
        this.backleftleg.rotationPointY = this.backleftleg.rotationPointY - (float)(yy);
        this.backleftleg.rotationPointZ = this.backleftleg.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 7) / 7) * (-8.25-(0)));
            yy = 0 + (((tickAnim - 7) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 7) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 18) {
            xx = -8.25 + (((tickAnim - 14) / 4) * (0-(-8.25)));
            yy = 0 + (((tickAnim - 14) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 4) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 21) {
            xx = 0 + (((tickAnim - 18) / 3) * (-1.75-(0)));
            yy = 0 + (((tickAnim - 18) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 3) * (0-(0)));
        }
        else if (tickAnim >= 21 && tickAnim < 40) {
            xx = -1.75 + (((tickAnim - 21) / 19) * (0.75-(-1.75)));
            yy = 0 + (((tickAnim - 21) / 19) * (0-(0)));
            zz = 0 + (((tickAnim - 21) / 19) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 97) {
            xx = 0.75 + (((tickAnim - 40) / 57) * (0.75-(0.75)));
            yy = 0 + (((tickAnim - 40) / 57) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 57) * (0-(0)));
        }
        else if (tickAnim >= 97 && tickAnim < 130) {
            xx = 0.75 + (((tickAnim - 97) / 33) * (0-(0.75)));
            yy = 0 + (((tickAnim - 97) / 33) * (0-(0)));
            zz = 0 + (((tickAnim - 97) / 33) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backleftleg2, backleftleg2.rotateAngleX + (float) Math.toRadians(xx), backleftleg2.rotateAngleY + (float) Math.toRadians(yy), backleftleg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 21) {
            xx = 0 + (((tickAnim - 0) / 21) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 21) * (1.1-(0)));
            zz = 0 + (((tickAnim - 0) / 21) * (-0.225-(0)));
        }
        else if (tickAnim >= 21 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 21) / 19) * (0-(0)));
            yy = 1.1 + (((tickAnim - 21) / 19) * (1.1-(1.1)));
            zz = -0.225 + (((tickAnim - 21) / 19) * (0-(-0.225)));
        }
        else if (tickAnim >= 40 && tickAnim < 97) {
            xx = 0 + (((tickAnim - 40) / 57) * (0-(0)));
            yy = 1.1 + (((tickAnim - 40) / 57) * (1.1-(1.1)));
            zz = 0 + (((tickAnim - 40) / 57) * (0-(0)));
        }
        else if (tickAnim >= 97 && tickAnim < 130) {
            xx = 0 + (((tickAnim - 97) / 33) * (0-(0)));
            yy = 1.1 + (((tickAnim - 97) / 33) * (0-(1.1)));
            zz = 0 + (((tickAnim - 97) / 33) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.backleftleg2.rotationPointX = this.backleftleg2.rotationPointX + (float)(xx);
        this.backleftleg2.rotationPointY = this.backleftleg2.rotationPointY - (float)(yy);
        this.backleftleg2.rotationPointZ = this.backleftleg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 7) / 7) * (4.39-(0)));
            yy = 0 + (((tickAnim - 7) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 7) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 18) {
            xx = 4.39 + (((tickAnim - 14) / 4) * (0-(4.39)));
            yy = 0 + (((tickAnim - 14) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 4) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 21) {
            xx = 0 + (((tickAnim - 18) / 3) * (24-(0)));
            yy = 0 + (((tickAnim - 18) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 3) * (0-(0)));
        }
        else if (tickAnim >= 21 && tickAnim < 40) {
            xx = 24 + (((tickAnim - 21) / 19) * (24-(24)));
            yy = 0 + (((tickAnim - 21) / 19) * (0-(0)));
            zz = 0 + (((tickAnim - 21) / 19) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 97) {
            xx = 24 + (((tickAnim - 40) / 57) * (24-(24)));
            yy = 0 + (((tickAnim - 40) / 57) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 57) * (0-(0)));
        }
        else if (tickAnim >= 97 && tickAnim < 130) {
            xx = 24 + (((tickAnim - 97) / 33) * (0-(24)));
            yy = 0 + (((tickAnim - 97) / 33) * (0-(0)));
            zz = 0 + (((tickAnim - 97) / 33) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backleftleg3, backleftleg3.rotateAngleX + (float) Math.toRadians(xx), backleftleg3.rotateAngleY + (float) Math.toRadians(yy), backleftleg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 7 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 7) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 7) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 7) * (0.15-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 21) {
            xx = 0 + (((tickAnim - 14) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 14) / 7) * (0-(0)));
            zz = 0.15 + (((tickAnim - 14) / 7) * (-0.725-(0.15)));
        }
        else if (tickAnim >= 21 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 21) / 19) * (0-(0)));
            yy = 0 + (((tickAnim - 21) / 19) * (0-(0)));
            zz = -0.725 + (((tickAnim - 21) / 19) * (-0.725-(-0.725)));
        }
        else if (tickAnim >= 40 && tickAnim < 97) {
            xx = 0 + (((tickAnim - 40) / 57) * (0-(0)));
            yy = 0 + (((tickAnim - 40) / 57) * (0-(0)));
            zz = -0.725 + (((tickAnim - 40) / 57) * (-0.725-(-0.725)));
        }
        else if (tickAnim >= 97 && tickAnim < 130) {
            xx = 0 + (((tickAnim - 97) / 33) * (0-(0)));
            yy = 0 + (((tickAnim - 97) / 33) * (0-(0)));
            zz = -0.725 + (((tickAnim - 97) / 33) * (0-(-0.725)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.backleftleg3.rotationPointX = this.backleftleg3.rotationPointX + (float)(xx);
        this.backleftleg3.rotationPointY = this.backleftleg3.rotationPointY - (float)(yy);
        this.backleftleg3.rotationPointZ = this.backleftleg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 7) / 7) * (17-(0)));
            yy = 0 + (((tickAnim - 7) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 7) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 18) {
            xx = 17 + (((tickAnim - 14) / 4) * (0-(17)));
            yy = 0 + (((tickAnim - 14) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 4) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 18) / 0) * (-10.12-(0)));
            yy = 0 + (((tickAnim - 18) / 0) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 0) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 21) {
            xx = -10.12 + (((tickAnim - 18) / 3) * (-10-(-10.12)));
            yy = 0 + (((tickAnim - 18) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 3) * (0-(0)));
        }
        else if (tickAnim >= 21 && tickAnim < 40) {
            xx = -10 + (((tickAnim - 21) / 19) * (-10-(-10)));
            yy = 0 + (((tickAnim - 21) / 19) * (0-(0)));
            zz = 0 + (((tickAnim - 21) / 19) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 97) {
            xx = -10 + (((tickAnim - 40) / 57) * (-10-(-10)));
            yy = 0 + (((tickAnim - 40) / 57) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 57) * (0-(0)));
        }
        else if (tickAnim >= 97 && tickAnim < 130) {
            xx = -10 + (((tickAnim - 97) / 33) * (0-(-10)));
            yy = 0 + (((tickAnim - 97) / 33) * (0-(0)));
            zz = 0 + (((tickAnim - 97) / 33) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backleftleg4, backleftleg4.rotateAngleX + (float) Math.toRadians(xx), backleftleg4.rotateAngleY + (float) Math.toRadians(yy), backleftleg4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (-1-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 40) {
            xx = -1 + (((tickAnim - 18) / 22) * (13.5-(-1)));
            yy = 0 + (((tickAnim - 18) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 22) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 97) {
            xx = 13.5 + (((tickAnim - 40) / 57) * (13.5-(13.5)));
            yy = 0 + (((tickAnim - 40) / 57) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 57) * (0-(0)));
        }
        else if (tickAnim >= 97 && tickAnim < 130) {
            xx = 13.5 + (((tickAnim - 97) / 33) * (0-(13.5)));
            yy = 0 + (((tickAnim - 97) / 33) * (0-(0)));
            zz = 0 + (((tickAnim - 97) / 33) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backrightleg, backrightleg.rotateAngleX + (float) Math.toRadians(xx), backrightleg.rotateAngleY + (float) Math.toRadians(yy), backrightleg.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0.475-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 18) / 22) * (0-(0)));
            yy = 0.475 + (((tickAnim - 18) / 22) * (1.005-(0.475)));
            zz = 0 + (((tickAnim - 18) / 22) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 97) {
            xx = 0 + (((tickAnim - 40) / 57) * (0-(0)));
            yy = 1.005 + (((tickAnim - 40) / 57) * (1.005-(1.005)));
            zz = 0 + (((tickAnim - 40) / 57) * (0-(0)));
        }
        else if (tickAnim >= 97 && tickAnim < 130) {
            xx = 0 + (((tickAnim - 97) / 33) * (0-(0)));
            yy = 1.005 + (((tickAnim - 97) / 33) * (0-(1.005)));
            zz = 0 + (((tickAnim - 97) / 33) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.backrightleg.rotationPointX = this.backrightleg.rotationPointX + (float)(xx);
        this.backrightleg.rotationPointY = this.backrightleg.rotationPointY - (float)(yy);
        this.backrightleg.rotationPointZ = this.backrightleg.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 18) / 22) * (2.75-(0)));
            yy = 0 + (((tickAnim - 18) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 22) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 97) {
            xx = 2.75 + (((tickAnim - 40) / 57) * (2.75-(2.75)));
            yy = 0 + (((tickAnim - 40) / 57) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 57) * (0-(0)));
        }
        else if (tickAnim >= 97 && tickAnim < 130) {
            xx = 2.75 + (((tickAnim - 97) / 33) * (0-(2.75)));
            yy = 0 + (((tickAnim - 97) / 33) * (0-(0)));
            zz = 0 + (((tickAnim - 97) / 33) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backrightleg2, backrightleg2.rotateAngleX + (float) Math.toRadians(xx), backrightleg2.rotateAngleY + (float) Math.toRadians(yy), backrightleg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 18) / 22) * (5.25-(0)));
            yy = 0 + (((tickAnim - 18) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 22) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 97) {
            xx = 5.25 + (((tickAnim - 40) / 57) * (5.25-(5.25)));
            yy = 0 + (((tickAnim - 40) / 57) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 57) * (0-(0)));
        }
        else if (tickAnim >= 97 && tickAnim < 130) {
            xx = 5.25 + (((tickAnim - 97) / 33) * (0-(5.25)));
            yy = 0 + (((tickAnim - 97) / 33) * (0-(0)));
            zz = 0 + (((tickAnim - 97) / 33) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backrightleg3, backrightleg3.rotateAngleX + (float) Math.toRadians(xx), backrightleg3.rotateAngleY + (float) Math.toRadians(yy), backrightleg3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 18) / 22) * (-6-(0)));
            yy = 0 + (((tickAnim - 18) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 22) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 97) {
            xx = -6 + (((tickAnim - 40) / 57) * (-6-(-6)));
            yy = 0 + (((tickAnim - 40) / 57) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 57) * (0-(0)));
        }
        else if (tickAnim >= 97 && tickAnim < 130) {
            xx = -6 + (((tickAnim - 97) / 33) * (0-(-6)));
            yy = 0 + (((tickAnim - 97) / 33) * (0-(0)));
            zz = 0 + (((tickAnim - 97) / 33) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backrightleg4, backrightleg4.rotateAngleX + (float) Math.toRadians(xx), backrightleg4.rotateAngleY + (float) Math.toRadians(yy), backrightleg4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (5-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 40) {
            xx = 5 + (((tickAnim - 18) / 22) * (-3-(5)));
            yy = 0 + (((tickAnim - 18) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 22) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 97) {
            xx = -3 + (((tickAnim - 40) / 57) * (-3-(-3)));
            yy = 0 + (((tickAnim - 40) / 57) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 57) * (0-(0)));
        }
        else if (tickAnim >= 97 && tickAnim < 107) {
            xx = -3 + (((tickAnim - 97) / 10) * (0.87363-(-3)));
            yy = 0 + (((tickAnim - 97) / 10) * (0.32783-(0)));
            zz = 0 + (((tickAnim - 97) / 10) * (-2.226-(0)));
        }
        else if (tickAnim >= 107 && tickAnim < 120) {
            xx = 0.87363 + (((tickAnim - 107) / 13) * (0.36687-(0.87363)));
            yy = 0.32783 + (((tickAnim - 107) / 13) * (-0.3732-(0.32783)));
            zz = -2.226 + (((tickAnim - 107) / 13) * (2.76067-(-2.226)));
        }
        else if (tickAnim >= 120 && tickAnim < 130) {
            xx = 0.36687 + (((tickAnim - 120) / 10) * (0-(0.36687)));
            yy = -0.3732 + (((tickAnim - 120) / 10) * (0-(-0.3732)));
            zz = 2.76067 + (((tickAnim - 120) / 10) * (0-(2.76067)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body2, body2.rotateAngleX + (float) Math.toRadians(xx), body2.rotateAngleY + (float) Math.toRadians(yy), body2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 107 && tickAnim < 113) {
            xx = 0 + (((tickAnim - 107) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 107) / 6) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*2440))*-0.05-(0)));
            zz = 0 + (((tickAnim - 107) / 6) * (0-(0)));
        }
        else if (tickAnim >= 113 && tickAnim < 120) {
            xx = 0 + (((tickAnim - 113) / 7) * (0-(0)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*2440))*-0.05 + (((tickAnim - 113) / 7) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*2440))*-0.05)));
            zz = 0 + (((tickAnim - 113) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.body2.rotationPointX = this.body2.rotationPointX + (float)(xx);
        this.body2.rotationPointY = this.body2.rotationPointY - (float)(yy);
        this.body2.rotationPointZ = this.body2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (-4.25-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 40) {
            xx = -4.25 + (((tickAnim - 18) / 22) * (2.25-(-4.25)));
            yy = 0 + (((tickAnim - 18) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 22) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 97) {
            xx = 2.25 + (((tickAnim - 40) / 57) * (2.25-(2.25)));
            yy = 0 + (((tickAnim - 40) / 57) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 57) * (0-(0)));
        }
        else if (tickAnim >= 97 && tickAnim < 107) {
            xx = 2.25 + (((tickAnim - 97) / 10) * (-3.08767-(2.25)));
            yy = 0 + (((tickAnim - 97) / 10) * (0.29791-(0)));
            zz = 0 + (((tickAnim - 97) / 10) * (4.74067-(0)));
        }
        else if (tickAnim >= 107 && tickAnim < 120) {
            xx = -3.08767 + (((tickAnim - 107) / 13) * (0.60471-(-3.08767)));
            yy = 0.29791 + (((tickAnim - 107) / 13) * (-0.18197-(0.29791)));
            zz = 4.74067 + (((tickAnim - 107) / 13) * (-2.17112-(4.74067)));
        }
        else if (tickAnim >= 120 && tickAnim < 130) {
            xx = 0.60471 + (((tickAnim - 120) / 10) * (0-(0.60471)));
            yy = -0.18197 + (((tickAnim - 120) / 10) * (0-(-0.18197)));
            zz = -2.17112 + (((tickAnim - 120) / 10) * (0-(-2.17112)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(upperbody, upperbody.rotateAngleX + (float) Math.toRadians(xx), upperbody.rotateAngleY + (float) Math.toRadians(yy), upperbody.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 97 && tickAnim < 107) {
            xx = 0 + (((tickAnim - 97) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 97) / 10) * (-0.45-(0)));
            zz = 0 + (((tickAnim - 97) / 10) * (0-(0)));
        }
        else if (tickAnim >= 107 && tickAnim < 113) {
            xx = 0 + (((tickAnim - 107) / 6) * (0-(0)));
            yy = -0.45 + (((tickAnim - 107) / 6) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*2440))*0.03-(-0.45)));
            zz = 0 + (((tickAnim - 107) / 6) * (0-(0)));
        }
        else if (tickAnim >= 113 && tickAnim < 120) {
            xx = 0 + (((tickAnim - 113) / 7) * (0-(0)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*2440))*0.03 + (((tickAnim - 113) / 7) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*2440))*0.03)));
            zz = 0 + (((tickAnim - 113) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.upperbody.rotationPointX = this.upperbody.rotationPointX + (float)(xx);
        this.upperbody.rotationPointY = this.upperbody.rotationPointY - (float)(yy);
        this.upperbody.rotationPointZ = this.upperbody.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (7.75-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 40) {
            xx = 7.75 + (((tickAnim - 18) / 22) * (-2.21188-(7.75)));
            yy = 0 + (((tickAnim - 18) / 22) * (1.24177-(0)));
            zz = 0 + (((tickAnim - 18) / 22) * (1.75585-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 75) {
            xx = -2.21188 + (((tickAnim - 40) / 35) * (-4.96188-(-2.21188)));
            yy = 1.24177 + (((tickAnim - 40) / 35) * (1.24177-(1.24177)));
            zz = 1.75585 + (((tickAnim - 40) / 35) * (1.75585-(1.75585)));
        }
        else if (tickAnim >= 75 && tickAnim < 88) {
            xx = -4.96188 + (((tickAnim - 75) / 13) * (-2.96188-(-4.96188)));
            yy = 1.24177 + (((tickAnim - 75) / 13) * (1.24177-(1.24177)));
            zz = 1.75585 + (((tickAnim - 75) / 13) * (1.75585-(1.75585)));
        }
        else if (tickAnim >= 88 && tickAnim < 110) {
            xx = -2.96188 + (((tickAnim - 88) / 22) * (5.2311+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*-1-(-2.96188)));
            yy = 1.24177 + (((tickAnim - 88) / 22) * (-7.18479-(1.24177)));
            zz = 1.75585 + (((tickAnim - 88) / 22) * (-0.97274-(1.75585)));
        }
        else if (tickAnim >= 110 && tickAnim < 130) {
            xx = 5.2311+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*-1 + (((tickAnim - 110) / 20) * (0-(5.2311+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*-1)));
            yy = -7.18479 + (((tickAnim - 110) / 20) * (0-(-7.18479)));
            zz = -0.97274 + (((tickAnim - 110) / 20) * (0-(-0.97274)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck4, neck4.rotateAngleX + (float) Math.toRadians(xx), neck4.rotateAngleY + (float) Math.toRadians(yy), neck4.rotateAngleZ + (float) Math.toRadians(zz));

        this.neck4.rotationPointX = this.neck4.rotationPointX + (float)(0);
        this.neck4.rotationPointY = this.neck4.rotationPointY - (float)(0);
        this.neck4.rotationPointZ = this.neck4.rotationPointZ + (float)(0);



        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (4.5-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 40) {
            xx = 4.5 + (((tickAnim - 18) / 22) * (-2.3628-(4.5)));
            yy = 0 + (((tickAnim - 18) / 22) * (6.46559-(0)));
            zz = 0 + (((tickAnim - 18) / 22) * (1.23889-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 75) {
            xx = -2.3628 + (((tickAnim - 40) / 35) * (1.3872-(-2.3628)));
            yy = 6.46559 + (((tickAnim - 40) / 35) * (6.46559-(6.46559)));
            zz = 1.23889 + (((tickAnim - 40) / 35) * (1.23889-(1.23889)));
        }
        else if (tickAnim >= 75 && tickAnim < 88) {
            xx = 1.3872 + (((tickAnim - 75) / 13) * (-0.8628-(1.3872)));
            yy = 6.46559 + (((tickAnim - 75) / 13) * (6.46559-(6.46559)));
            zz = 1.23889 + (((tickAnim - 75) / 13) * (1.23889-(1.23889)));
        }
        else if (tickAnim >= 88 && tickAnim < 111) {
            xx = -0.8628 + (((tickAnim - 88) / 23) * (9.1757+Math.sin((Math.PI/180)*(((double)tickAnim/20)*450))*1-(-0.8628)));
            yy = 6.46559 + (((tickAnim - 88) / 23) * (-4.74884-(6.46559)));
            zz = 1.23889 + (((tickAnim - 88) / 23) * (0.10487-(1.23889)));
        }
        else if (tickAnim >= 111 && tickAnim < 130) {
            xx = 9.1757+Math.sin((Math.PI/180)*(((double)tickAnim/20)*450))*1 + (((tickAnim - 111) / 19) * (0-(9.1757+Math.sin((Math.PI/180)*(((double)tickAnim/20)*450))*1)));
            yy = -4.74884 + (((tickAnim - 111) / 19) * (0-(-4.74884)));
            zz = 0.10487 + (((tickAnim - 111) / 19) * (0-(0.10487)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(xx), neck3.rotateAngleY + (float) Math.toRadians(yy), neck3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 18) / 22) * (-3.83499-(0)));
            yy = 0 + (((tickAnim - 18) / 22) * (6.53411-(0)));
            zz = 0 + (((tickAnim - 18) / 22) * (1.48206-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 75) {
            xx = -3.83499 + (((tickAnim - 40) / 35) * (-5.08499-(-3.83499)));
            yy = 6.53411 + (((tickAnim - 40) / 35) * (6.53411-(6.53411)));
            zz = 1.48206 + (((tickAnim - 40) / 35) * (1.48206-(1.48206)));
        }
        else if (tickAnim >= 75 && tickAnim < 88) {
            xx = -5.08499 + (((tickAnim - 75) / 13) * (-5.08499-(-5.08499)));
            yy = 6.53411 + (((tickAnim - 75) / 13) * (6.53411-(6.53411)));
            zz = 1.48206 + (((tickAnim - 75) / 13) * (1.48206-(1.48206)));
        }
        else if (tickAnim >= 88 && tickAnim < 113) {
            xx = -5.08499 + (((tickAnim - 88) / 25) * (2.9682+Math.sin((Math.PI/180)*(((double)tickAnim/20)*350))*-2-(-5.08499)));
            yy = 6.53411 + (((tickAnim - 88) / 25) * (-9.16337-(6.53411)));
            zz = 1.48206 + (((tickAnim - 88) / 25) * (1.2684-(1.48206)));
        }
        else if (tickAnim >= 113 && tickAnim < 130) {
            xx = 2.9682+Math.sin((Math.PI/180)*(((double)tickAnim/20)*350))*-2 + (((tickAnim - 113) / 17) * (0-(2.9682+Math.sin((Math.PI/180)*(((double)tickAnim/20)*350))*-2)));
            yy = -9.16337 + (((tickAnim - 113) / 17) * (0-(-9.16337)));
            zz = 1.2684 + (((tickAnim - 113) / 17) * (0-(1.2684)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(xx), neck2.rotateAngleY + (float) Math.toRadians(yy), neck2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (-15-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 40) {
            xx = -15 + (((tickAnim - 18) / 22) * (16.54718-(-15)));
            yy = 0 + (((tickAnim - 18) / 22) * (4.25691-(0)));
            zz = 0 + (((tickAnim - 18) / 22) * (4.43895-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 75) {
            xx = 16.54718 + (((tickAnim - 40) / 35) * (19.04718-(16.54718)));
            yy = 4.25691 + (((tickAnim - 40) / 35) * (4.25691-(4.25691)));
            zz = 4.43895 + (((tickAnim - 40) / 35) * (4.43895-(4.43895)));
        }
        else if (tickAnim >= 75 && tickAnim < 88) {
            xx = 19.04718 + (((tickAnim - 75) / 13) * (19.12842-(19.04718)));
            yy = 4.25691 + (((tickAnim - 75) / 13) * (3.78181-(4.25691)));
            zz = 4.43895 + (((tickAnim - 75) / 13) * (5.598-(4.43895)));
        }
        else if (tickAnim >= 88 && tickAnim < 104) {
            xx = 19.12842 + (((tickAnim - 88) / 16) * (7.25-(19.12842)));
            yy = 3.78181 + (((tickAnim - 88) / 16) * (0-(3.78181)));
            zz = 5.598 + (((tickAnim - 88) / 16) * (0-(5.598)));
        }
        else if (tickAnim >= 104 && tickAnim < 113) {
            xx = 7.25 + (((tickAnim - 104) / 9) * (3.1184+Math.sin((Math.PI/180)*(((double)tickAnim/20)*350))*-3-(7.25)));
            yy = 0 + (((tickAnim - 104) / 9) * (-6.95486-(0)));
            zz = 0 + (((tickAnim - 104) / 9) * (-0.79566-(0)));
        }
        else if (tickAnim >= 113 && tickAnim < 130) {
            xx = 3.1184+Math.sin((Math.PI/180)*(((double)tickAnim/20)*350))*-3 + (((tickAnim - 113) / 17) * (0-(3.1184+Math.sin((Math.PI/180)*(((double)tickAnim/20)*350))*-3)));
            yy = -6.95486 + (((tickAnim - 113) / 17) * (0-(-6.95486)));
            zz = -0.79566 + (((tickAnim - 113) / 17) * (0-(-0.79566)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(xx), neck.rotateAngleY + (float) Math.toRadians(yy), neck.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0.775-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 104) {
            xx = 0 + (((tickAnim - 18) / 86) * (0-(0)));
            yy = 0 + (((tickAnim - 18) / 86) * (0-(0)));
            zz = 0.775 + (((tickAnim - 18) / 86) * (0-(0.775)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.neck.rotationPointX = this.neck.rotationPointX + (float)(xx);
        this.neck.rotationPointY = this.neck.rotationPointY - (float)(yy);
        this.neck.rotationPointZ = this.neck.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (-15-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 40) {
            xx = -15 + (((tickAnim - 18) / 22) * (11.76024-(-15)));
            yy = 0 + (((tickAnim - 18) / 22) * (6.62553-(0)));
            zz = 0 + (((tickAnim - 18) / 22) * (4.49361-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 75) {
            xx = 11.76024 + (((tickAnim - 40) / 35) * (14.26024-(11.76024)));
            yy = 6.62553 + (((tickAnim - 40) / 35) * (6.62553-(6.62553)));
            zz = 4.49361 + (((tickAnim - 40) / 35) * (4.49361-(4.49361)));
        }
        else if (tickAnim >= 75 && tickAnim < 88) {
            xx = 14.26024 + (((tickAnim - 75) / 13) * (14.76923-(14.26024)));
            yy = 6.62553 + (((tickAnim - 75) / 13) * (0.14162-(6.62553)));
            zz = 4.49361 + (((tickAnim - 75) / 13) * (13.08771-(4.49361)));
        }
        else if (tickAnim >= 88 && tickAnim < 104) {
            xx = 14.76923 + (((tickAnim - 88) / 16) * (-10-(14.76923)));
            yy = 0.14162 + (((tickAnim - 88) / 16) * (0-(0.14162)));
            zz = 13.08771 + (((tickAnim - 88) / 16) * (0-(13.08771)));
        }
        else if (tickAnim >= 104 && tickAnim < 113) {
            xx = -10 + (((tickAnim - 104) / 9) * (1.5824+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*5-(-10)));
            yy = 0 + (((tickAnim - 104) / 9) * (-6.59763-(0)));
            zz = 0 + (((tickAnim - 104) / 9) * (-1.42929-(0)));
        }
        else if (tickAnim >= 113 && tickAnim < 122) {
            xx = 1.5824+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*5 + (((tickAnim - 113) / 9) * (-11.4176+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*5-(1.5824+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*5)));
            yy = -6.59763 + (((tickAnim - 113) / 9) * (-6.59763-(-6.59763)));
            zz = -1.42929 + (((tickAnim - 113) / 9) * (-1.42929-(-1.42929)));
        }
        else if (tickAnim >= 122 && tickAnim < 130) {
            xx = -11.4176+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*5 + (((tickAnim - 122) / 8) * (0-(-11.4176+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*5)));
            yy = -6.59763 + (((tickAnim - 122) / 8) * (0-(-6.59763)));
            zz = -1.42929 + (((tickAnim - 122) / 8) * (0-(-1.42929)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0.3-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 75) {
            xx = 0 + (((tickAnim - 40) / 35) * (0-(0)));
            yy = 0 + (((tickAnim - 40) / 35) * (0-(0)));
            zz = 0.3 + (((tickAnim - 40) / 35) * (0.3-(0.3)));
        }
        else if (tickAnim >= 75 && tickAnim < 88) {
            xx = 0 + (((tickAnim - 75) / 13) * (0-(0)));
            yy = 0 + (((tickAnim - 75) / 13) * (0-(0)));
            zz = 0.3 + (((tickAnim - 75) / 13) * (0.3-(0.3)));
        }
        else if (tickAnim >= 88 && tickAnim < 104) {
            xx = 0 + (((tickAnim - 88) / 16) * (0-(0)));
            yy = 0 + (((tickAnim - 88) / 16) * (0-(0)));
            zz = 0.3 + (((tickAnim - 88) / 16) * (0.25-(0.3)));
        }
        else if (tickAnim >= 104 && tickAnim < 113) {
            xx = 0 + (((tickAnim - 104) / 9) * (0-(0)));
            yy = 0 + (((tickAnim - 104) / 9) * (-0.15-(0)));
            zz = 0.25 + (((tickAnim - 104) / 9) * (0.13-(0.25)));
        }
        else if (tickAnim >= 113 && tickAnim < 122) {
            xx = 0 + (((tickAnim - 113) / 9) * (0-(0)));
            yy = -0.15 + (((tickAnim - 113) / 9) * (-0.15-(-0.15)));
            zz = 0.13 + (((tickAnim - 113) / 9) * (0.13-(0.13)));
        }
        else if (tickAnim >= 122 && tickAnim < 130) {
            xx = 0 + (((tickAnim - 122) / 8) * (0-(0)));
            yy = -0.15 + (((tickAnim - 122) / 8) * (0-(-0.15)));
            zz = 0.13 + (((tickAnim - 122) / 8) * (0-(0.13)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.head.rotationPointX = this.head.rotationPointX + (float)(xx);
        this.head.rotationPointY = this.head.rotationPointY - (float)(yy);
        this.head.rotationPointZ = this.head.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (-1.5-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 40) {
            xx = -1.5 + (((tickAnim - 18) / 22) * (3.5-(-1.5)));
            yy = 0 + (((tickAnim - 18) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 22) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 96) {
            xx = 3.5 + (((tickAnim - 40) / 56) * (3.5-(3.5)));
            yy = 0 + (((tickAnim - 40) / 56) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 56) * (0-(0)));
        }
        else if (tickAnim >= 96 && tickAnim < 107) {
            xx = 3.5 + (((tickAnim - 96) / 11) * (-24.75-(3.5)));
            yy = 0 + (((tickAnim - 96) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 96) / 11) * (0-(0)));
        }
        else if (tickAnim >= 107 && tickAnim < 115) {
            xx = -24.75 + (((tickAnim - 107) / 8) * (-24.75-(-24.75)));
            yy = 0 + (((tickAnim - 107) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 107) / 8) * (0-(0)));
        }
        else if (tickAnim >= 115 && tickAnim < 123) {
            xx = -24.75 + (((tickAnim - 115) / 8) * (-3.75-(-24.75)));
            yy = 0 + (((tickAnim - 115) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 115) / 8) * (0-(0)));
        }
        else if (tickAnim >= 123 && tickAnim < 130) {
            xx = -3.75 + (((tickAnim - 123) / 7) * (0-(-3.75)));
            yy = 0 + (((tickAnim - 123) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 123) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontleftleg, frontleftleg.rotateAngleX + (float) Math.toRadians(xx), frontleftleg.rotateAngleY + (float) Math.toRadians(yy), frontleftleg.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (1.975-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 18) / 22) * (0-(0)));
            yy = 1.975 + (((tickAnim - 18) / 22) * (1.125-(1.975)));
            zz = 0 + (((tickAnim - 18) / 22) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 96) {
            xx = 0 + (((tickAnim - 40) / 56) * (0-(0)));
            yy = 1.125 + (((tickAnim - 40) / 56) * (1.125-(1.125)));
            zz = 0 + (((tickAnim - 40) / 56) * (0-(0)));
        }
        else if (tickAnim >= 96 && tickAnim < 107) {
            xx = 0 + (((tickAnim - 96) / 11) * (0-(0)));
            yy = 1.125 + (((tickAnim - 96) / 11) * (-0.385-(1.125)));
            zz = 0 + (((tickAnim - 96) / 11) * (0-(0)));
        }
        else if (tickAnim >= 107 && tickAnim < 111) {
            xx = 0 + (((tickAnim - 107) / 4) * (0-(0)));
            yy = -0.385 + (((tickAnim - 107) / 4) * (-1.91+Math.sin((Math.PI/180)*(((double)tickAnim/20)*2550))*0.2-(-0.385)));
            zz = 0 + (((tickAnim - 107) / 4) * (0-(0)));
        }
        else if (tickAnim >= 111 && tickAnim < 113) {
            xx = 0 + (((tickAnim - 111) / 2) * (0-(0)));
            yy = -1.91+Math.sin((Math.PI/180)*(((double)tickAnim/20)*2550))*0.2 + (((tickAnim - 111) / 2) * (-2.235-(-1.91+Math.sin((Math.PI/180)*(((double)tickAnim/20)*2550))*0.2)));
            zz = 0 + (((tickAnim - 111) / 2) * (0-(0)));
        }
        else if (tickAnim >= 113 && tickAnim < 115) {
            xx = 0 + (((tickAnim - 113) / 2) * (0-(0)));
            yy = -2.235 + (((tickAnim - 113) / 2) * (-2.35-(-2.235)));
            zz = 0 + (((tickAnim - 113) / 2) * (0-(0)));
        }
        else if (tickAnim >= 115 && tickAnim < 123) {
            xx = 0 + (((tickAnim - 115) / 8) * (0-(0)));
            yy = -2.35 + (((tickAnim - 115) / 8) * (1.42-(-2.35)));
            zz = 0 + (((tickAnim - 115) / 8) * (0-(0)));
        }
        else if (tickAnim >= 123 && tickAnim < 130) {
            xx = 0 + (((tickAnim - 123) / 7) * (0-(0)));
            yy = 1.42 + (((tickAnim - 123) / 7) * (0-(1.42)));
            zz = 0 + (((tickAnim - 123) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.frontleftleg.rotationPointX = this.frontleftleg.rotationPointX + (float)(xx);
        this.frontleftleg.rotationPointY = this.frontleftleg.rotationPointY - (float)(yy);
        this.frontleftleg.rotationPointZ = this.frontleftleg.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 18) / 22) * (21.75-(0)));
            yy = 0 + (((tickAnim - 18) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 22) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 95) {
            xx = 21.75 + (((tickAnim - 40) / 55) * (21.75-(21.75)));
            yy = 0 + (((tickAnim - 40) / 55) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 55) * (0-(0)));
        }
        else if (tickAnim >= 95 && tickAnim < 107) {
            xx = 21.75 + (((tickAnim - 95) / 12) * (23.94-(21.75)));
            yy = 0 + (((tickAnim - 95) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 95) / 12) * (0-(0)));
        }
        else if (tickAnim >= 107 && tickAnim < 123) {
            xx = 23.94 + (((tickAnim - 107) / 16) * (-10.53-(23.94)));
            yy = 0 + (((tickAnim - 107) / 16) * (0-(0)));
            zz = 0 + (((tickAnim - 107) / 16) * (0-(0)));
        }
        else if (tickAnim >= 123 && tickAnim < 130) {
            xx = -10.53 + (((tickAnim - 123) / 7) * (0-(-10.53)));
            yy = 0 + (((tickAnim - 123) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 123) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontleftleg2, frontleftleg2.rotateAngleX + (float) Math.toRadians(xx), frontleftleg2.rotateAngleY + (float) Math.toRadians(yy), frontleftleg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 95) {
            xx = 0 + (((tickAnim - 0) / 95) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 95) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 95) * (0-(0)));
        }
        else if (tickAnim >= 95 && tickAnim < 99) {
            xx = 0 + (((tickAnim - 95) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 95) / 4) * (0.945-(0)));
            zz = 0 + (((tickAnim - 95) / 4) * (0-(0)));
        }
        else if (tickAnim >= 99 && tickAnim < 107) {
            xx = 0 + (((tickAnim - 99) / 8) * (0-(0)));
            yy = 0.945 + (((tickAnim - 99) / 8) * (-0.525-(0.945)));
            zz = 0 + (((tickAnim - 99) / 8) * (0-(0)));
        }
        else if (tickAnim >= 107 && tickAnim < 115) {
            xx = 0 + (((tickAnim - 107) / 8) * (0-(0)));
            yy = -0.525 + (((tickAnim - 107) / 8) * (-0.08-(-0.525)));
            zz = 0 + (((tickAnim - 107) / 8) * (0-(0)));
        }
        else if (tickAnim >= 115 && tickAnim < 123) {
            xx = 0 + (((tickAnim - 115) / 8) * (0-(0)));
            yy = -0.08 + (((tickAnim - 115) / 8) * (0.37-(-0.08)));
            zz = 0 + (((tickAnim - 115) / 8) * (0-(0)));
        }
        else if (tickAnim >= 123 && tickAnim < 130) {
            xx = 0 + (((tickAnim - 123) / 7) * (0-(0)));
            yy = 0.37 + (((tickAnim - 123) / 7) * (0-(0.37)));
            zz = 0 + (((tickAnim - 123) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.frontleftleg2.rotationPointX = this.frontleftleg2.rotationPointX + (float)(xx);
        this.frontleftleg2.rotationPointY = this.frontleftleg2.rotationPointY - (float)(yy);
        this.frontleftleg2.rotationPointZ = this.frontleftleg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 18) / 22) * (24.25-(0)));
            yy = 0 + (((tickAnim - 18) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 22) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 95) {
            xx = 24.25 + (((tickAnim - 40) / 55) * (24.25-(24.25)));
            yy = 0 + (((tickAnim - 40) / 55) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 55) * (0-(0)));
        }
        else if (tickAnim >= 95 && tickAnim < 107) {
            xx = 24.25 + (((tickAnim - 95) / 12) * (7.75-(24.25)));
            yy = 0 + (((tickAnim - 95) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 95) / 12) * (0-(0)));
        }
        else if (tickAnim >= 107 && tickAnim < 115) {
            xx = 7.75 + (((tickAnim - 107) / 8) * (22.54188-(7.75)));
            yy = 0 + (((tickAnim - 107) / 8) * (2.14546-(0)));
            zz = 0 + (((tickAnim - 107) / 8) * (-3.38409-(0)));
        }
        else if (tickAnim >= 115 && tickAnim < 123) {
            xx = 22.54188 + (((tickAnim - 115) / 8) * (27.88-(22.54188)));
            yy = 2.14546 + (((tickAnim - 115) / 8) * (0-(2.14546)));
            zz = -3.38409 + (((tickAnim - 115) / 8) * (0-(-3.38409)));
        }
        else if (tickAnim >= 123 && tickAnim < 130) {
            xx = 27.88 + (((tickAnim - 123) / 7) * (0-(27.88)));
            yy = 0 + (((tickAnim - 123) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 123) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontleftleg3, frontleftleg3.rotateAngleX + (float) Math.toRadians(xx), frontleftleg3.rotateAngleY + (float) Math.toRadians(yy), frontleftleg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 18) / 22) * (0-(0)));
            yy = 0 + (((tickAnim - 18) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 22) * (-0.575-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 95) {
            xx = 0 + (((tickAnim - 40) / 55) * (0-(0)));
            yy = 0 + (((tickAnim - 40) / 55) * (0-(0)));
            zz = -0.575 + (((tickAnim - 40) / 55) * (-0.575-(-0.575)));
        }
        else if (tickAnim >= 95 && tickAnim < 107) {
            xx = 0 + (((tickAnim - 95) / 12) * (0-(0)));
            yy = 0 + (((tickAnim - 95) / 12) * (0-(0)));
            zz = -0.575 + (((tickAnim - 95) / 12) * (0-(-0.575)));
        }
        else if (tickAnim >= 107 && tickAnim < 123) {
            xx = 0 + (((tickAnim - 107) / 16) * (0-(0)));
            yy = 0 + (((tickAnim - 107) / 16) * (0-(0)));
            zz = 0 + (((tickAnim - 107) / 16) * (-0.75-(0)));
        }
        else if (tickAnim >= 123 && tickAnim < 130) {
            xx = 0 + (((tickAnim - 123) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 123) / 7) * (0-(0)));
            zz = -0.75 + (((tickAnim - 123) / 7) * (0-(-0.75)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.frontleftleg3.rotationPointX = this.frontleftleg3.rotationPointX + (float)(xx);
        this.frontleftleg3.rotationPointY = this.frontleftleg3.rotationPointY - (float)(yy);
        this.frontleftleg3.rotationPointZ = this.frontleftleg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (-2-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 40) {
            xx = -2 + (((tickAnim - 18) / 22) * (12.5-(-2)));
            yy = 0 + (((tickAnim - 18) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 22) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 96) {
            xx = 12.5 + (((tickAnim - 40) / 56) * (12.5-(12.5)));
            yy = 0 + (((tickAnim - 40) / 56) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 56) * (0-(0)));
        }
        else if (tickAnim >= 96 && tickAnim < 110) {
            xx = 12.5 + (((tickAnim - 96) / 14) * (10.33-(12.5)));
            yy = 0 + (((tickAnim - 96) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 96) / 14) * (0-(0)));
        }
        else if (tickAnim >= 110 && tickAnim < 123) {
            xx = 10.33 + (((tickAnim - 110) / 13) * (2.64-(10.33)));
            yy = 0 + (((tickAnim - 110) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 110) / 13) * (0-(0)));
        }
        else if (tickAnim >= 123 && tickAnim < 130) {
            xx = 2.64 + (((tickAnim - 123) / 7) * (0-(2.64)));
            yy = 0 + (((tickAnim - 123) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 123) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontrightleg, frontrightleg.rotateAngleX + (float) Math.toRadians(xx), frontrightleg.rotateAngleY + (float) Math.toRadians(yy), frontrightleg.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (1.975-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 18) / 22) * (0-(0)));
            yy = 1.975 + (((tickAnim - 18) / 22) * (0-(1.975)));
            zz = 0 + (((tickAnim - 18) / 22) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 96) {
            xx = 0 + (((tickAnim - 40) / 56) * (0-(0)));
            yy = 0 + (((tickAnim - 40) / 56) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 56) * (0-(0)));
        }
        else if (tickAnim >= 96 && tickAnim < 107) {
            xx = 0 + (((tickAnim - 96) / 11) * (0-(0)));
            yy = 0 + (((tickAnim - 96) / 11) * (-3.18-(0)));
            zz = 0 + (((tickAnim - 96) / 11) * (0-(0)));
        }
        else if (tickAnim >= 107 && tickAnim < 110) {
            xx = 0 + (((tickAnim - 107) / 3) * (0-(0)));
            yy = -3.18 + (((tickAnim - 107) / 3) * (-3.025-(-3.18)));
            zz = 0 + (((tickAnim - 107) / 3) * (0-(0)));
        }
        else if (tickAnim >= 110 && tickAnim < 116) {
            xx = 0 + (((tickAnim - 110) / 6) * (0-(0)));
            yy = -3.025 + (((tickAnim - 110) / 6) * (-2.925+Math.sin((Math.PI/180)*(((double)tickAnim/20)*2550))*0.1-(-3.025)));
            zz = 0 + (((tickAnim - 110) / 6) * (0-(0)));
        }
        else if (tickAnim >= 116 && tickAnim < 123) {
            xx = 0 + (((tickAnim - 116) / 7) * (0-(0)));
            yy = -2.925+Math.sin((Math.PI/180)*(((double)tickAnim/20)*2550))*0.1 + (((tickAnim - 116) / 7) * (-1.3-(-2.925+Math.sin((Math.PI/180)*(((double)tickAnim/20)*2550))*0.1)));
            zz = 0 + (((tickAnim - 116) / 7) * (0-(0)));
        }
        else if (tickAnim >= 123 && tickAnim < 130) {
            xx = 0 + (((tickAnim - 123) / 7) * (0-(0)));
            yy = -1.3 + (((tickAnim - 123) / 7) * (0-(-1.3)));
            zz = 0 + (((tickAnim - 123) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.frontrightleg.rotationPointX = this.frontrightleg.rotationPointX + (float)(xx);
        this.frontrightleg.rotationPointY = this.frontrightleg.rotationPointY - (float)(yy);
        this.frontrightleg.rotationPointZ = this.frontrightleg.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 18) / 22) * (16.25-(0)));
            yy = 0 + (((tickAnim - 18) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 22) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 96) {
            xx = 16.25 + (((tickAnim - 40) / 56) * (16.25-(16.25)));
            yy = 0 + (((tickAnim - 40) / 56) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 56) * (0-(0)));
        }
        else if (tickAnim >= 96 && tickAnim < 103) {
            xx = 16.25 + (((tickAnim - 96) / 7) * (19.75-(16.25)));
            yy = 0 + (((tickAnim - 96) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 96) / 7) * (0-(0)));
        }
        else if (tickAnim >= 103 && tickAnim < 114) {
            xx = 19.75 + (((tickAnim - 103) / 11) * (0.95-(19.75)));
            yy = 0 + (((tickAnim - 103) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 103) / 11) * (0-(0)));
        }
        else if (tickAnim >= 114 && tickAnim < 130) {
            xx = 0.95 + (((tickAnim - 114) / 16) * (0-(0.95)));
            yy = 0 + (((tickAnim - 114) / 16) * (0-(0)));
            zz = 0 + (((tickAnim - 114) / 16) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontrightleg2, frontrightleg2.rotateAngleX + (float) Math.toRadians(xx), frontrightleg2.rotateAngleY + (float) Math.toRadians(yy), frontrightleg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 103) {
            xx = 0 + (((tickAnim - 0) / 103) * (0.225-(0)));
            yy = 0 + (((tickAnim - 0) / 103) * (0.75-(0)));
            zz = 0 + (((tickAnim - 0) / 103) * (0-(0)));
        }
        else if (tickAnim >= 103 && tickAnim < 130) {
            xx = 0.225 + (((tickAnim - 103) / 27) * (0-(0.225)));
            yy = 0.75 + (((tickAnim - 103) / 27) * (0-(0.75)));
            zz = 0 + (((tickAnim - 103) / 27) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.frontrightleg2.rotationPointX = this.frontrightleg2.rotationPointX + (float)(xx);
        this.frontrightleg2.rotationPointY = this.frontrightleg2.rotationPointY - (float)(yy);
        this.frontrightleg2.rotationPointZ = this.frontrightleg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 18) / 22) * (34-(0)));
            yy = 0 + (((tickAnim - 18) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 22) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 96) {
            xx = 34 + (((tickAnim - 40) / 56) * (34-(34)));
            yy = 0 + (((tickAnim - 40) / 56) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 56) * (0-(0)));
        }
        else if (tickAnim >= 96 && tickAnim < 103) {
            xx = 34 + (((tickAnim - 96) / 7) * (22.25-(34)));
            yy = 0 + (((tickAnim - 96) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 96) / 7) * (0-(0)));
        }
        else if (tickAnim >= 103 && tickAnim < 112) {
            xx = 22.25 + (((tickAnim - 103) / 9) * (-5.75-(22.25)));
            yy = 0 + (((tickAnim - 103) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 103) / 9) * (0-(0)));
        }
        else if (tickAnim >= 112 && tickAnim < 121) {
            xx = -5.75 + (((tickAnim - 112) / 9) * (-1.75+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150))*1-(-5.75)));
            yy = 0 + (((tickAnim - 112) / 9) * (-0.62743-(0)));
            zz = 0 + (((tickAnim - 112) / 9) * (1.67373-(0)));
        }
        else if (tickAnim >= 121 && tickAnim < 130) {
            xx = -1.75+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150))*1 + (((tickAnim - 121) / 9) * (0-(-1.75+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150))*1)));
            yy = -0.62743 + (((tickAnim - 121) / 9) * (0-(-0.62743)));
            zz = 1.67373 + (((tickAnim - 121) / 9) * (0-(1.67373)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontrightleg3, frontrightleg3.rotateAngleX + (float) Math.toRadians(xx), frontrightleg3.rotateAngleY + (float) Math.toRadians(yy), frontrightleg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 18) / 22) * (0-(0)));
            yy = 0 + (((tickAnim - 18) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 22) * (-1.075-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 96) {
            xx = 0 + (((tickAnim - 40) / 56) * (0-(0)));
            yy = 0 + (((tickAnim - 40) / 56) * (0-(0)));
            zz = -1.075 + (((tickAnim - 40) / 56) * (-1.075-(-1.075)));
        }
        else if (tickAnim >= 96 && tickAnim < 103) {
            xx = 0 + (((tickAnim - 96) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 96) / 7) * (0-(0)));
            zz = -1.075 + (((tickAnim - 96) / 7) * (-0.875-(-1.075)));
        }
        else if (tickAnim >= 103 && tickAnim < 112) {
            xx = 0 + (((tickAnim - 103) / 9) * (0-(0)));
            yy = 0 + (((tickAnim - 103) / 9) * (0-(0)));
            zz = -0.875 + (((tickAnim - 103) / 9) * (0-(-0.875)));
        }
        else if (tickAnim >= 112 && tickAnim < 130) {
            xx = 0 + (((tickAnim - 112) / 18) * (0-(0)));
            yy = 0 + (((tickAnim - 112) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 112) / 18) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.frontrightleg3.rotationPointX = this.frontrightleg3.rotationPointX + (float)(xx);
        this.frontrightleg3.rotationPointY = this.frontrightleg3.rotationPointY - (float)(yy);
        this.frontrightleg3.rotationPointZ = this.frontrightleg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (3.51598-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0.66026-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (-0.23119-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 40) {
            xx = 3.51598 + (((tickAnim - 18) / 22) * (-13-(3.51598)));
            yy = 0.66026 + (((tickAnim - 18) / 22) * (0-(0.66026)));
            zz = -0.23119 + (((tickAnim - 18) / 22) * (0-(-0.23119)));
        }
        else if (tickAnim >= 40 && tickAnim < 96) {
            xx = -13 + (((tickAnim - 40) / 56) * (-13-(-13)));
            yy = 0 + (((tickAnim - 40) / 56) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 56) * (0-(0)));
        }
        else if (tickAnim >= 96 && tickAnim < 130) {
            xx = -13 + (((tickAnim - 96) / 34) * (0-(-13)));
            yy = 0 + (((tickAnim - 96) / 34) * (0-(0)));
            zz = 0 + (((tickAnim - 96) / 34) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail, tail.rotateAngleX + (float) Math.toRadians(xx), tail.rotateAngleY + (float) Math.toRadians(yy), tail.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (-0.25-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 40) {
            xx = -0.25 + (((tickAnim - 18) / 22) * (-5-(-0.25)));
            yy = 0 + (((tickAnim - 18) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 22) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 96) {
            xx = -5 + (((tickAnim - 40) / 56) * (-5-(-5)));
            yy = 0 + (((tickAnim - 40) / 56) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 56) * (0-(0)));
        }
        else if (tickAnim >= 96 && tickAnim < 130) {
            xx = -5 + (((tickAnim - 96) / 34) * (0-(-5)));
            yy = 0 + (((tickAnim - 96) / 34) * (0-(0)));
            zz = 0 + (((tickAnim - 96) / 34) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(xx), tail2.rotateAngleY + (float) Math.toRadians(yy), tail2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (-1.25-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 40) {
            xx = -1.25 + (((tickAnim - 18) / 22) * (-5-(-1.25)));
            yy = 0 + (((tickAnim - 18) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 22) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 96) {
            xx = -5 + (((tickAnim - 40) / 56) * (-5-(-5)));
            yy = 0 + (((tickAnim - 40) / 56) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 56) * (0-(0)));
        }
        else if (tickAnim >= 96 && tickAnim < 130) {
            xx = -5 + (((tickAnim - 96) / 34) * (0-(-5)));
            yy = 0 + (((tickAnim - 96) / 34) * (0-(0)));
            zz = 0 + (((tickAnim - 96) / 34) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(xx), tail3.rotateAngleY + (float) Math.toRadians(yy), tail3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (2.08-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 34) {
            xx = 2.08 + (((tickAnim - 18) / 16) * (4.58-(2.08)));
            yy = 0 + (((tickAnim - 18) / 16) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 16) * (0-(0)));
        }
        else if (tickAnim >= 34 && tickAnim < 40) {
            xx = 4.58 + (((tickAnim - 34) / 6) * (16-(4.58)));
            yy = 0 + (((tickAnim - 34) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 34) / 6) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 96) {
            xx = 16 + (((tickAnim - 40) / 56) * (16-(16)));
            yy = 0 + (((tickAnim - 40) / 56) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 56) * (0-(0)));
        }
        else if (tickAnim >= 96 && tickAnim < 107) {
            xx = 16 + (((tickAnim - 96) / 11) * (6.43-(16)));
            yy = 0 + (((tickAnim - 96) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 96) / 11) * (0-(0)));
        }
        else if (tickAnim >= 107 && tickAnim < 130) {
            xx = 6.43 + (((tickAnim - 107) / 23) * (0-(6.43)));
            yy = 0 + (((tickAnim - 107) / 23) * (0-(0)));
            zz = 0 + (((tickAnim - 107) / 23) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(xx), tail4.rotateAngleY + (float) Math.toRadians(yy), tail4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (2.95-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 35) {
            xx = 2.95 + (((tickAnim - 18) / 17) * (9.24-(2.95)));
            yy = 0 + (((tickAnim - 18) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 17) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 40) {
            xx = 9.24 + (((tickAnim - 35) / 5) * (24-(9.24)));
            yy = 0 + (((tickAnim - 35) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 5) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 96) {
            xx = 24 + (((tickAnim - 40) / 56) * (24-(24)));
            yy = 0 + (((tickAnim - 40) / 56) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 56) * (0-(0)));
        }
        else if (tickAnim >= 96 && tickAnim < 107) {
            xx = 24 + (((tickAnim - 96) / 11) * (11.39-(24)));
            yy = 0 + (((tickAnim - 96) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 96) / 11) * (0-(0)));
        }
        else if (tickAnim >= 107 && tickAnim < 114) {
            xx = 11.39 + (((tickAnim - 107) / 7) * (4.73-(11.39)));
            yy = 0 + (((tickAnim - 107) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 107) / 7) * (0-(0)));
        }
        else if (tickAnim >= 114 && tickAnim < 130) {
            xx = 4.73 + (((tickAnim - 114) / 16) * (0-(4.73)));
            yy = 0 + (((tickAnim - 114) / 16) * (0-(0)));
            zz = 0 + (((tickAnim - 114) / 16) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail5, tail5.rotateAngleX + (float) Math.toRadians(xx), tail5.rotateAngleY + (float) Math.toRadians(yy), tail5.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (14.3-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 31) {
            xx = 14.3 + (((tickAnim - 18) / 13) * (17.74-(14.3)));
            yy = 0 + (((tickAnim - 18) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 13) * (0-(0)));
        }
        else if (tickAnim >= 31 && tickAnim < 35) {
            xx = 17.74 + (((tickAnim - 31) / 4) * (36.97-(17.74)));
            yy = 0 + (((tickAnim - 31) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 31) / 4) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 40) {
            xx = 36.97 + (((tickAnim - 35) / 5) * (43-(36.97)));
            yy = 0 + (((tickAnim - 35) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 5) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 96) {
            xx = 43 + (((tickAnim - 40) / 56) * (43-(43)));
            yy = 0 + (((tickAnim - 40) / 56) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 56) * (0-(0)));
        }
        else if (tickAnim >= 96 && tickAnim < 107) {
            xx = 43 + (((tickAnim - 96) / 11) * (26.62-(43)));
            yy = 0 + (((tickAnim - 96) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 96) / 11) * (0-(0)));
        }
        else if (tickAnim >= 107 && tickAnim < 114) {
            xx = 26.62 + (((tickAnim - 107) / 7) * (13.06-(26.62)));
            yy = 0 + (((tickAnim - 107) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 107) / 7) * (0-(0)));
        }
        else if (tickAnim >= 114 && tickAnim < 130) {
            xx = 13.06 + (((tickAnim - 114) / 16) * (0-(13.06)));
            yy = 0 + (((tickAnim - 114) / 16) * (0-(0)));
            zz = 0 + (((tickAnim - 114) / 16) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail6, tail6.rotateAngleX + (float) Math.toRadians(xx), tail6.rotateAngleY + (float) Math.toRadians(yy), tail6.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 18) / 22) * (0-(0)));
            yy = 0 + (((tickAnim - 18) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 22) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.tail6.rotationPointX = this.tail6.rotationPointX + (float)(xx);
        this.tail6.rotationPointY = this.tail6.rotationPointY - (float)(yy);
        this.tail6.rotationPointZ = this.tail6.rotationPointZ + (float)(zz);




        if (tickAnim >= 40 && tickAnim < 96) {
            xx = 0 + (((tickAnim - 40) / 56) * (0-(0)));
            yy = 0 + (((tickAnim - 40) / 56) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 56) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(xx), jaw.rotateAngleY + (float) Math.toRadians(yy), jaw.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 28 && tickAnim < 35) {
            xx = 1 + (((tickAnim - 28) / 7) * (1-(1)));
            yy = 1 + (((tickAnim - 28) / 7) * (0.035-(1)));
            zz = 1 + (((tickAnim - 28) / 7) * (1-(1)));
        }
        else if (tickAnim >= 35 && tickAnim < 42) {
            xx = 1 + (((tickAnim - 35) / 7) * (1-(1)));
            yy = 0.035 + (((tickAnim - 35) / 7) * (1-(0.035)));
            zz = 1 + (((tickAnim - 35) / 7) * (1-(1)));
        }
        else if (tickAnim >= 42 && tickAnim < 75) {
            xx = 1 + (((tickAnim - 42) / 33) * (1-(1)));
            yy = 1 + (((tickAnim - 42) / 33) * (1-(1)));
            zz = 1 + (((tickAnim - 42) / 33) * (1-(1)));
        }
        else if (tickAnim >= 75 && tickAnim < 83) {
            xx = 1 + (((tickAnim - 75) / 8) * (1-(1)));
            yy = 1 + (((tickAnim - 75) / 8) * (0.035-(1)));
            zz = 1 + (((tickAnim - 75) / 8) * (1-(1)));
        }
        else if (tickAnim >= 83 && tickAnim < 89) {
            xx = 1 + (((tickAnim - 83) / 6) * (1-(1)));
            yy = 0.035 + (((tickAnim - 83) / 6) * (1-(0.035)));
            zz = 1 + (((tickAnim - 83) / 6) * (1-(1)));
        }
        else {
            xx = 1;
            yy = 1;
            zz = 1;
        }
        this.Eye.setScale((float)xx, (float)yy, (float)zz);




        if (tickAnim >= 34 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 34) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 34) / 1) * (-0.1-(0)));
            zz = 0 + (((tickAnim - 34) / 1) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 36) {
            xx = 0 + (((tickAnim - 35) / 1) * (0-(0)));
            yy = -0.1 + (((tickAnim - 35) / 1) * (0-(-0.1)));
            zz = 0 + (((tickAnim - 35) / 1) * (0-(0)));
        }
        else if (tickAnim >= 36 && tickAnim < 37) {
            xx = 0 + (((tickAnim - 36) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 36) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 36) / 1) * (0-(0)));
        }
        else if (tickAnim >= 37 && tickAnim < 38) {
            xx = 0 + (((tickAnim - 37) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 37) / 1) * (-0.1-(0)));
            zz = 0 + (((tickAnim - 37) / 1) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 38) {
            xx = 0 + (((tickAnim - 38) / 0) * (0-(0)));
            yy = -0.1 + (((tickAnim - 38) / 0) * (0-(-0.1)));
            zz = 0 + (((tickAnim - 38) / 0) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 39) {
            xx = 0 + (((tickAnim - 38) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 38) / 1) * (-0.1-(0)));
            zz = 0 + (((tickAnim - 38) / 1) * (0-(0)));
        }
        else if (tickAnim >= 39 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 39) / 1) * (0-(0)));
            yy = -0.1 + (((tickAnim - 39) / 1) * (0-(-0.1)));
            zz = 0 + (((tickAnim - 39) / 1) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 41) {
            xx = 0 + (((tickAnim - 40) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 40) / 1) * (-0.1-(0)));
            zz = 0 + (((tickAnim - 40) / 1) * (0-(0)));
        }
        else if (tickAnim >= 41 && tickAnim < 42) {
            xx = 0 + (((tickAnim - 41) / 1) * (0-(0)));
            yy = -0.1 + (((tickAnim - 41) / 1) * (0-(-0.1)));
            zz = 0 + (((tickAnim - 41) / 1) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.lefttailSpike2.rotationPointX = this.lefttailSpike2.rotationPointX + (float)(xx);
        this.lefttailSpike2.rotationPointY = this.lefttailSpike2.rotationPointY - (float)(yy);
        this.lefttailSpike2.rotationPointZ = this.lefttailSpike2.rotationPointZ + (float)(zz);




        if (tickAnim >= 34 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 34) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 34) / 1) * (-0.1-(0)));
            zz = 0 + (((tickAnim - 34) / 1) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 36) {
            xx = 0 + (((tickAnim - 35) / 1) * (0-(0)));
            yy = -0.1 + (((tickAnim - 35) / 1) * (0-(-0.1)));
            zz = 0 + (((tickAnim - 35) / 1) * (0-(0)));
        }
        else if (tickAnim >= 36 && tickAnim < 37) {
            xx = 0 + (((tickAnim - 36) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 36) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 36) / 1) * (0-(0)));
        }
        else if (tickAnim >= 37 && tickAnim < 38) {
            xx = 0 + (((tickAnim - 37) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 37) / 1) * (-0.1-(0)));
            zz = 0 + (((tickAnim - 37) / 1) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 38) {
            xx = 0 + (((tickAnim - 38) / 0) * (0-(0)));
            yy = -0.1 + (((tickAnim - 38) / 0) * (0-(-0.1)));
            zz = 0 + (((tickAnim - 38) / 0) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 39) {
            xx = 0 + (((tickAnim - 38) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 38) / 1) * (-0.1-(0)));
            zz = 0 + (((tickAnim - 38) / 1) * (0-(0)));
        }
        else if (tickAnim >= 39 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 39) / 1) * (0-(0)));
            yy = -0.1 + (((tickAnim - 39) / 1) * (0-(-0.1)));
            zz = 0 + (((tickAnim - 39) / 1) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 41) {
            xx = 0 + (((tickAnim - 40) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 40) / 1) * (-0.1-(0)));
            zz = 0 + (((tickAnim - 40) / 1) * (0-(0)));
        }
        else if (tickAnim >= 41 && tickAnim < 42) {
            xx = 0 + (((tickAnim - 41) / 1) * (0-(0)));
            yy = -0.1 + (((tickAnim - 41) / 1) * (0-(-0.1)));
            zz = 0 + (((tickAnim - 41) / 1) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.righttailSpike2.rotationPointX = this.righttailSpike2.rotationPointX + (float)(xx);
        this.righttailSpike2.rotationPointY = this.righttailSpike2.rotationPointY - (float)(yy);
        this.righttailSpike2.rotationPointZ = this.righttailSpike2.rotationPointZ + (float)(zz);

    }

    public void animNoise(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraMiragaia entity = (EntityPrehistoricFloraMiragaia) entitylivingbaseIn;

        int animCycle = 44;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;

        if (tickAnim >= 0 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 0) / 9) * (4-(0)));
            yy = 0 + (((tickAnim - 0) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 9) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 17) {
            xx = 4 + (((tickAnim - 9) / 8) * (2.94-(4)));
            yy = 0 + (((tickAnim - 9) / 8) * (1-(0)));
            zz = 0 + (((tickAnim - 9) / 8) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 19) {
            xx = 2.94 + (((tickAnim - 17) / 2) * (2.59-(2.94)));
            yy = 1 + (((tickAnim - 17) / 2) * (0-(1)));
            zz = 0 + (((tickAnim - 17) / 2) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 22) {
            xx = 2.59 + (((tickAnim - 19) / 3) * (2.24-(2.59)));
            yy = 0 + (((tickAnim - 19) / 3) * (-1-(0)));
            zz = 0 + (((tickAnim - 19) / 3) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 24) {
            xx = 2.24 + (((tickAnim - 22) / 2) * (1.89-(2.24)));
            yy = -1 + (((tickAnim - 22) / 2) * (0-(-1)));
            zz = 0 + (((tickAnim - 22) / 2) * (0-(0)));
        }
        else if (tickAnim >= 24 && tickAnim < 28) {
            xx = 1.89 + (((tickAnim - 24) / 4) * (1.54-(1.89)));
            yy = 0 + (((tickAnim - 24) / 4) * (1-(0)));
            zz = 0 + (((tickAnim - 24) / 4) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 32) {
            xx = 1.54 + (((tickAnim - 28) / 4) * (1.18-(1.54)));
            yy = 1 + (((tickAnim - 28) / 4) * (0-(1)));
            zz = 0 + (((tickAnim - 28) / 4) * (0-(0)));
        }
        else if (tickAnim >= 32 && tickAnim < 38) {
            xx = 1.18 + (((tickAnim - 32) / 6) * (0-(1.18)));
            yy = 0 + (((tickAnim - 32) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 32) / 6) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 44) {
            xx = 0 + (((tickAnim - 38) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 38) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 38) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(xx), neck.rotateAngleY + (float) Math.toRadians(yy), neck.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (10-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (-2-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 18) {
            xx = 10 + (((tickAnim - 10) / 8) * (7.8-(10)));
            yy = -2 + (((tickAnim - 10) / 8) * (0-(-2)));
            zz = 0 + (((tickAnim - 10) / 8) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = 7.8 + (((tickAnim - 18) / 2) * (7.07-(7.8)));
            yy = 0 + (((tickAnim - 18) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 2) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 23) {
            xx = 7.07 + (((tickAnim - 20) / 3) * (6.34-(7.07)));
            yy = 0 + (((tickAnim - 20) / 3) * (-1-(0)));
            zz = 0 + (((tickAnim - 20) / 3) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 25) {
            xx = 6.34 + (((tickAnim - 23) / 2) * (5.61-(6.34)));
            yy = -1 + (((tickAnim - 23) / 2) * (0-(-1)));
            zz = 0 + (((tickAnim - 23) / 2) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 28) {
            xx = 5.61 + (((tickAnim - 25) / 3) * (4.88-(5.61)));
            yy = 0 + (((tickAnim - 25) / 3) * (1-(0)));
            zz = 0 + (((tickAnim - 25) / 3) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 33) {
            xx = 4.88 + (((tickAnim - 28) / 5) * (4.15-(4.88)));
            yy = 1 + (((tickAnim - 28) / 5) * (0-(1)));
            zz = 0 + (((tickAnim - 28) / 5) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 44) {
            xx = 4.15 + (((tickAnim - 33) / 11) * (0-(4.15)));
            yy = 0 + (((tickAnim - 33) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 11) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(xx), neck2.rotateAngleY + (float) Math.toRadians(yy), neck2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 0) / 9) * (-9-(0)));
            yy = 0 + (((tickAnim - 0) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 9) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 18) {
            xx = -9 + (((tickAnim - 9) / 9) * (0-(-9)));
            yy = 0 + (((tickAnim - 9) / 9) * (-1-(0)));
            zz = 0 + (((tickAnim - 9) / 9) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 18) / 2) * (0.5-(0)));
            yy = -1 + (((tickAnim - 18) / 2) * (0-(-1)));
            zz = 0 + (((tickAnim - 18) / 2) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 21) {
            xx = 0.5 + (((tickAnim - 20) / 1) * (0.5-(0.5)));
            yy = 0 + (((tickAnim - 20) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 1) * (0-(0)));
        }
        else if (tickAnim >= 21 && tickAnim < 23) {
            xx = 0.5 + (((tickAnim - 21) / 2) * (1-(0.5)));
            yy = 0 + (((tickAnim - 21) / 2) * (1-(0)));
            zz = 0 + (((tickAnim - 21) / 2) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 26) {
            xx = 1 + (((tickAnim - 23) / 3) * (2-(1)));
            yy = 1 + (((tickAnim - 23) / 3) * (0-(1)));
            zz = 0 + (((tickAnim - 23) / 3) * (0-(0)));
        }
        else if (tickAnim >= 26 && tickAnim < 29) {
            xx = 2 + (((tickAnim - 26) / 3) * (1-(2)));
            yy = 0 + (((tickAnim - 26) / 3) * (-1-(0)));
            zz = 0 + (((tickAnim - 26) / 3) * (0-(0)));
        }
        else if (tickAnim >= 29 && tickAnim < 34) {
            xx = 1 + (((tickAnim - 29) / 5) * (2-(1)));
            yy = -1 + (((tickAnim - 29) / 5) * (0-(-1)));
            zz = 0 + (((tickAnim - 29) / 5) * (0-(0)));
        }
        else if (tickAnim >= 34 && tickAnim < 44) {
            xx = 2 + (((tickAnim - 34) / 10) * (0-(2)));
            yy = 0 + (((tickAnim - 34) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 34) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(xx), neck3.rotateAngleY + (float) Math.toRadians(yy), neck3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (-6-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = -6 + (((tickAnim - 20) / 10) * (-6.52-(-6)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 44) {
            xx = -6.52 + (((tickAnim - 30) / 14) * (0-(-6.52)));
            yy = 0 + (((tickAnim - 30) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 14) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 0) / 9) * (4-(0)));
            yy = 0 + (((tickAnim - 0) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 9) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 17) {
            xx = 4 + (((tickAnim - 9) / 8) * (2-(4)));
            yy = 0 + (((tickAnim - 9) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 8) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 34) {
            xx = 2 + (((tickAnim - 17) / 17) * (7-(2)));
            yy = 0 + (((tickAnim - 17) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 17) / 17) * (0-(0)));
        }
        else if (tickAnim >= 34 && tickAnim < 39) {
            xx = 7 + (((tickAnim - 34) / 5) * (0-(7)));
            yy = 0 + (((tickAnim - 34) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 34) / 5) * (0-(0)));
        }
        else if (tickAnim >= 39 && tickAnim < 44) {
            xx = 0 + (((tickAnim - 39) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 39) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 39) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(xx), jaw.rotateAngleY + (float) Math.toRadians(yy), jaw.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 17 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 17) / 2) * (0-(0)));
            yy = -0.1 + (((tickAnim - 17) / 2) * (0-(-0.1)));
            zz = 0 + (((tickAnim - 17) / 2) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 22) {
            xx = 0 + (((tickAnim - 19) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 19) / 3) * (-0.1-(0)));
            zz = 0 + (((tickAnim - 19) / 3) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 24) {
            xx = 0 + (((tickAnim - 22) / 2) * (0-(0)));
            yy = -0.1 + (((tickAnim - 22) / 2) * (0-(-0.1)));
            zz = 0 + (((tickAnim - 22) / 2) * (0-(0)));
        }
        else if (tickAnim >= 24 && tickAnim < 27) {
            xx = 0 + (((tickAnim - 24) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 24) / 3) * (-0.1-(0)));
            zz = 0 + (((tickAnim - 24) / 3) * (0-(0)));
        }
        else if (tickAnim >= 27 && tickAnim < 29) {
            xx = 0 + (((tickAnim - 27) / 2) * (0-(0)));
            yy = -0.1 + (((tickAnim - 27) / 2) * (0-(-0.1)));
            zz = 0 + (((tickAnim - 27) / 2) * (0-(0)));
        }
        else if (tickAnim >= 29 && tickAnim < 32) {
            xx = 0 + (((tickAnim - 29) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 29) / 3) * (-0.1-(0)));
            zz = 0 + (((tickAnim - 29) / 3) * (0-(0)));
        }
        else if (tickAnim >= 32 && tickAnim < 34) {
            xx = 0 + (((tickAnim - 32) / 2) * (0-(0)));
            yy = -0.1 + (((tickAnim - 32) / 2) * (0-(-0.1)));
            zz = 0 + (((tickAnim - 32) / 2) * (0-(0)));
        }
        else if (tickAnim >= 34 && tickAnim < 39) {
            xx = 0 + (((tickAnim - 34) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 34) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 34) / 5) * (0-(0)));
        }
        else if (tickAnim >= 39 && tickAnim < 41) {
            xx = 0 + (((tickAnim - 39) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 39) / 2) * (-0.1-(0)));
            zz = 0 + (((tickAnim - 39) / 2) * (0-(0)));
        }
        else if (tickAnim >= 41 && tickAnim < 43) {
            xx = 0 + (((tickAnim - 41) / 2) * (0-(0)));
            yy = -0.1 + (((tickAnim - 41) / 2) * (0-(-0.1)));
            zz = 0 + (((tickAnim - 41) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.jaw.rotationPointX = this.jaw.rotationPointX + (float)(xx);
        this.jaw.rotationPointY = this.jaw.rotationPointY - (float)(yy);
        this.jaw.rotationPointZ = this.jaw.rotationPointZ + (float)(zz);

    }

    public void animRoar(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraMiragaia entity = (EntityPrehistoricFloraMiragaia) entitylivingbaseIn;

        int animCycle = 44;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        if (tickAnim >= 0 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 0) / 9) * (-9-(0)));
            yy = 0 + (((tickAnim - 0) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 9) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 20) {
            xx = -9 + (((tickAnim - 9) / 11) * (-6-(-9)));
            yy = 0 + (((tickAnim - 9) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 11) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 44) {
            xx = -6 + (((tickAnim - 20) / 24) * (0-(-6)));
            yy = 0 + (((tickAnim - 20) / 24) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 24) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(xx), neck2.rotateAngleY + (float) Math.toRadians(yy), neck2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (11-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 44) {
            xx = 11 + (((tickAnim - 20) / 24) * (0-(11)));
            yy = 0 + (((tickAnim - 20) / 24) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 24) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(xx), neck3.rotateAngleY + (float) Math.toRadians(yy), neck3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 0) / 9) * (7.5-(0)));
            yy = 0 + (((tickAnim - 0) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 9) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 20) {
            xx = 7.5 + (((tickAnim - 9) / 11) * (0-(7.5)));
            yy = 0 + (((tickAnim - 9) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 11) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(xx), neck.rotateAngleY + (float) Math.toRadians(yy), neck.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (-6-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = -6 + (((tickAnim - 20) / 10) * (-6.52-(-6)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 44) {
            xx = -6.52 + (((tickAnim - 30) / 14) * (0-(-6.52)));
            yy = 0 + (((tickAnim - 30) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 14) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 0) / 9) * (10-(0)));
            yy = 0 + (((tickAnim - 0) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 9) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 17) {
            xx = 10 + (((tickAnim - 9) / 8) * (24-(10)));
            yy = 0 + (((tickAnim - 9) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 8) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 34) {
            xx = 24 + (((tickAnim - 17) / 17) * (24-(24)));
            yy = 0 + (((tickAnim - 17) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 17) / 17) * (0-(0)));
        }
        else if (tickAnim >= 34 && tickAnim < 39) {
            xx = 24 + (((tickAnim - 34) / 5) * (0-(24)));
            yy = 0 + (((tickAnim - 34) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 34) / 5) * (0-(0)));
        }
        else if (tickAnim >= 39 && tickAnim < 44) {
            xx = 0 + (((tickAnim - 39) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 39) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 39) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(xx), jaw.rotateAngleY + (float) Math.toRadians(yy), jaw.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 17) {
            xx = 0 + (((tickAnim - 0) / 17) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 17) * (-0.1-(0)));
            zz = 0 + (((tickAnim - 0) / 17) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 17) / 2) * (0-(0)));
            yy = -0.1 + (((tickAnim - 17) / 2) * (0-(-0.1)));
            zz = 0 + (((tickAnim - 17) / 2) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 22) {
            xx = 0 + (((tickAnim - 19) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 19) / 3) * (-0.1-(0)));
            zz = 0 + (((tickAnim - 19) / 3) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 24) {
            xx = 0 + (((tickAnim - 22) / 2) * (0-(0)));
            yy = -0.1 + (((tickAnim - 22) / 2) * (0-(-0.1)));
            zz = 0 + (((tickAnim - 22) / 2) * (0-(0)));
        }
        else if (tickAnim >= 24 && tickAnim < 27) {
            xx = 0 + (((tickAnim - 24) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 24) / 3) * (-0.1-(0)));
            zz = 0 + (((tickAnim - 24) / 3) * (0-(0)));
        }
        else if (tickAnim >= 27 && tickAnim < 29) {
            xx = 0 + (((tickAnim - 27) / 2) * (0-(0)));
            yy = -0.1 + (((tickAnim - 27) / 2) * (0-(-0.1)));
            zz = 0 + (((tickAnim - 27) / 2) * (0-(0)));
        }
        else if (tickAnim >= 29 && tickAnim < 32) {
            xx = 0 + (((tickAnim - 29) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 29) / 3) * (-0.1-(0)));
            zz = 0 + (((tickAnim - 29) / 3) * (0-(0)));
        }
        else if (tickAnim >= 32 && tickAnim < 34) {
            xx = 0 + (((tickAnim - 32) / 2) * (0-(0)));
            yy = -0.1 + (((tickAnim - 32) / 2) * (0-(-0.1)));
            zz = 0 + (((tickAnim - 32) / 2) * (0-(0)));
        }
        else if (tickAnim >= 34 && tickAnim < 39) {
            xx = 0 + (((tickAnim - 34) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 34) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 34) / 5) * (0-(0)));
        }
        else if (tickAnim >= 39 && tickAnim < 41) {
            xx = 0 + (((tickAnim - 39) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 39) / 2) * (-0.1-(0)));
            zz = 0 + (((tickAnim - 39) / 2) * (0-(0)));
        }
        else if (tickAnim >= 41 && tickAnim < 43) {
            xx = 0 + (((tickAnim - 41) / 2) * (0-(0)));
            yy = -0.1 + (((tickAnim - 41) / 2) * (0-(-0.1)));
            zz = 0 + (((tickAnim - 41) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.jaw.rotationPointX = this.jaw.rotationPointX + (float)(xx);
        this.jaw.rotationPointY = this.jaw.rotationPointY - (float)(yy);
        this.jaw.rotationPointZ = this.jaw.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 0) / 9) * (-4-(0)));
            yy = 0 + (((tickAnim - 0) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 9) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 25) {
            xx = -4 + (((tickAnim - 9) / 16) * (0-(-4)));
            yy = 0 + (((tickAnim - 9) / 16) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 16) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 44) {
            xx = 0 + (((tickAnim - 25) / 19) * (0-(0)));
            yy = 0 + (((tickAnim - 25) / 19) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 19) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck4, neck4.rotateAngleX + (float) Math.toRadians(xx), neck4.rotateAngleY + (float) Math.toRadians(yy), neck4.rotateAngleZ + (float) Math.toRadians(zz));

    }


    public void animLay(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraMiragaia entity = (EntityPrehistoricFloraMiragaia) entitylivingbaseIn;

        int animCycle = 50;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        if (tickAnim >= 0 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 0) / 19) * (-11.5-(0)));
            yy = 0 + (((tickAnim - 0) / 19) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 19) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 31) {
            xx = -11.5 + (((tickAnim - 19) / 12) * (-11.5-(-11.5)));
            yy = 0 + (((tickAnim - 19) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 19) / 12) * (0-(0)));
        }
        else if (tickAnim >= 31 && tickAnim < 50) {
            xx = -11.5 + (((tickAnim - 31) / 19) * (0-(-11.5)));
            yy = 0 + (((tickAnim - 31) / 19) * (0-(0)));
            zz = 0 + (((tickAnim - 31) / 19) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(xx), body.rotateAngleY + (float) Math.toRadians(yy), body.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 0) / 19) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 19) * (-3.225-(0)));
            zz = 0 + (((tickAnim - 0) / 19) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 31) {
            xx = 0 + (((tickAnim - 19) / 12) * (0-(0)));
            yy = -3.225 + (((tickAnim - 19) / 12) * (-3.225-(-3.225)));
            zz = 0 + (((tickAnim - 19) / 12) * (0-(0)));
        }
        else if (tickAnim >= 31 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 31) / 19) * (0-(0)));
            yy = -3.225 + (((tickAnim - 31) / 19) * (0-(-3.225)));
            zz = 0 + (((tickAnim - 31) / 19) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.body.rotationPointX = this.body.rotationPointX + (float)(xx);
        this.body.rotationPointY = this.body.rotationPointY - (float)(yy);
        this.body.rotationPointZ = this.body.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 0) / 19) * (4.25-(0)));
            yy = 0 + (((tickAnim - 0) / 19) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 19) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 31) {
            xx = 4.25 + (((tickAnim - 19) / 12) * (4.25-(4.25)));
            yy = 0 + (((tickAnim - 19) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 19) / 12) * (0-(0)));
        }
        else if (tickAnim >= 31 && tickAnim < 50) {
            xx = 4.25 + (((tickAnim - 31) / 19) * (0-(4.25)));
            yy = 0 + (((tickAnim - 31) / 19) * (0-(0)));
            zz = 0 + (((tickAnim - 31) / 19) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body2, body2.rotateAngleX + (float) Math.toRadians(xx), body2.rotateAngleY + (float) Math.toRadians(yy), body2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 0) / 19) * (5-(0)));
            yy = 0 + (((tickAnim - 0) / 19) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 19) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 31) {
            xx = 5 + (((tickAnim - 19) / 12) * (5-(5)));
            yy = 0 + (((tickAnim - 19) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 19) / 12) * (0-(0)));
        }
        else if (tickAnim >= 31 && tickAnim < 50) {
            xx = 5 + (((tickAnim - 31) / 19) * (0-(5)));
            yy = 0 + (((tickAnim - 31) / 19) * (0-(0)));
            zz = 0 + (((tickAnim - 31) / 19) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(upperbody, upperbody.rotateAngleX + (float) Math.toRadians(xx), upperbody.rotateAngleY + (float) Math.toRadians(yy), upperbody.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 16) {
            xx = 0 + (((tickAnim - 0) / 16) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 16) * (-7.25-(0)));
            zz = 0 + (((tickAnim - 0) / 16) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 27) {
            xx = 0 + (((tickAnim - 16) / 11) * (0-(0)));
            yy = -7.25 + (((tickAnim - 16) / 11) * (-13.5-(-7.25)));
            zz = 0 + (((tickAnim - 16) / 11) * (0-(0)));
        }
        else if (tickAnim >= 27 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 27) / 8) * (0-(0)));
            yy = -13.5 + (((tickAnim - 27) / 8) * (-19.5-(-13.5)));
            zz = 0 + (((tickAnim - 27) / 8) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            yy = -19.5 + (((tickAnim - 35) / 15) * (0-(-19.5)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(xx), neck2.rotateAngleY + (float) Math.toRadians(yy), neck2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 0) / 19) * (17-(0)));
            yy = 0 + (((tickAnim - 0) / 19) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 19) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 31) {
            xx = 17 + (((tickAnim - 19) / 12) * (17-(17)));
            yy = 0 + (((tickAnim - 19) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 19) / 12) * (0-(0)));
        }
        else if (tickAnim >= 31 && tickAnim < 50) {
            xx = 17 + (((tickAnim - 31) / 19) * (0-(17)));
            yy = 0 + (((tickAnim - 31) / 19) * (0-(0)));
            zz = 0 + (((tickAnim - 31) / 19) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backleftleg, backleftleg.rotateAngleX + (float) Math.toRadians(xx), backleftleg.rotateAngleY + (float) Math.toRadians(yy), backleftleg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 0) / 19) * (21.75-(0)));
            yy = 0 + (((tickAnim - 0) / 19) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 19) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 31) {
            xx = 21.75 + (((tickAnim - 19) / 12) * (21.75-(21.75)));
            yy = 0 + (((tickAnim - 19) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 19) / 12) * (0-(0)));
        }
        else if (tickAnim >= 31 && tickAnim < 50) {
            xx = 21.75 + (((tickAnim - 31) / 19) * (0-(21.75)));
            yy = 0 + (((tickAnim - 31) / 19) * (0-(0)));
            zz = 0 + (((tickAnim - 31) / 19) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backleftleg2, backleftleg2.rotateAngleX + (float) Math.toRadians(xx), backleftleg2.rotateAngleY + (float) Math.toRadians(yy), backleftleg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 0) / 19) * (-2.25-(0)));
            yy = 0 + (((tickAnim - 0) / 19) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 19) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 31) {
            xx = -2.25 + (((tickAnim - 19) / 12) * (-2.25-(-2.25)));
            yy = 0 + (((tickAnim - 19) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 19) / 12) * (0-(0)));
        }
        else if (tickAnim >= 31 && tickAnim < 50) {
            xx = -2.25 + (((tickAnim - 31) / 19) * (0-(-2.25)));
            yy = 0 + (((tickAnim - 31) / 19) * (0-(0)));
            zz = 0 + (((tickAnim - 31) / 19) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backleftleg3, backleftleg3.rotateAngleX + (float) Math.toRadians(xx), backleftleg3.rotateAngleY + (float) Math.toRadians(yy), backleftleg3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 0) / 19) * (-24.75-(0)));
            yy = 0 + (((tickAnim - 0) / 19) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 19) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 31) {
            xx = -24.75 + (((tickAnim - 19) / 12) * (-24.75-(-24.75)));
            yy = 0 + (((tickAnim - 19) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 19) / 12) * (0-(0)));
        }
        else if (tickAnim >= 31 && tickAnim < 50) {
            xx = -24.75 + (((tickAnim - 31) / 19) * (0-(-24.75)));
            yy = 0 + (((tickAnim - 31) / 19) * (0-(0)));
            zz = 0 + (((tickAnim - 31) / 19) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backleftleg4, backleftleg4.rotateAngleX + (float) Math.toRadians(xx), backleftleg4.rotateAngleY + (float) Math.toRadians(yy), backleftleg4.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 0) / 19) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 19) * (-1.05-(0)));
            zz = 0 + (((tickAnim - 0) / 19) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 31) {
            xx = 0 + (((tickAnim - 19) / 12) * (0-(0)));
            yy = -1.05 + (((tickAnim - 19) / 12) * (-1.05-(-1.05)));
            zz = 0 + (((tickAnim - 19) / 12) * (0-(0)));
        }
        else if (tickAnim >= 31 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 31) / 19) * (0-(0)));
            yy = -1.05 + (((tickAnim - 31) / 19) * (0-(-1.05)));
            zz = 0 + (((tickAnim - 31) / 19) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.backleftleg4.rotationPointX = this.backleftleg4.rotationPointX + (float)(xx);
        this.backleftleg4.rotationPointY = this.backleftleg4.rotationPointY - (float)(yy);
        this.backleftleg4.rotationPointZ = this.backleftleg4.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 0) / 19) * (17-(0)));
            yy = 0 + (((tickAnim - 0) / 19) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 19) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 31) {
            xx = 17 + (((tickAnim - 19) / 12) * (17-(17)));
            yy = 0 + (((tickAnim - 19) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 19) / 12) * (0-(0)));
        }
        else if (tickAnim >= 31 && tickAnim < 50) {
            xx = 17 + (((tickAnim - 31) / 19) * (0-(17)));
            yy = 0 + (((tickAnim - 31) / 19) * (0-(0)));
            zz = 0 + (((tickAnim - 31) / 19) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backrightleg, backrightleg.rotateAngleX + (float) Math.toRadians(xx), backrightleg.rotateAngleY + (float) Math.toRadians(yy), backrightleg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 0) / 19) * (21.75-(0)));
            yy = 0 + (((tickAnim - 0) / 19) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 19) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 31) {
            xx = 21.75 + (((tickAnim - 19) / 12) * (21.75-(21.75)));
            yy = 0 + (((tickAnim - 19) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 19) / 12) * (0-(0)));
        }
        else if (tickAnim >= 31 && tickAnim < 50) {
            xx = 21.75 + (((tickAnim - 31) / 19) * (0-(21.75)));
            yy = 0 + (((tickAnim - 31) / 19) * (0-(0)));
            zz = 0 + (((tickAnim - 31) / 19) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backrightleg2, backrightleg2.rotateAngleX + (float) Math.toRadians(xx), backrightleg2.rotateAngleY + (float) Math.toRadians(yy), backrightleg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 0) / 19) * (-2.25-(0)));
            yy = 0 + (((tickAnim - 0) / 19) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 19) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 31) {
            xx = -2.25 + (((tickAnim - 19) / 12) * (-2.25-(-2.25)));
            yy = 0 + (((tickAnim - 19) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 19) / 12) * (0-(0)));
        }
        else if (tickAnim >= 31 && tickAnim < 50) {
            xx = -2.25 + (((tickAnim - 31) / 19) * (0-(-2.25)));
            yy = 0 + (((tickAnim - 31) / 19) * (0-(0)));
            zz = 0 + (((tickAnim - 31) / 19) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backrightleg3, backrightleg3.rotateAngleX + (float) Math.toRadians(xx), backrightleg3.rotateAngleY + (float) Math.toRadians(yy), backrightleg3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 0) / 19) * (-24.75-(0)));
            yy = 0 + (((tickAnim - 0) / 19) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 19) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 31) {
            xx = -24.75 + (((tickAnim - 19) / 12) * (-24.75-(-24.75)));
            yy = 0 + (((tickAnim - 19) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 19) / 12) * (0-(0)));
        }
        else if (tickAnim >= 31 && tickAnim < 50) {
            xx = -24.75 + (((tickAnim - 31) / 19) * (0-(-24.75)));
            yy = 0 + (((tickAnim - 31) / 19) * (0-(0)));
            zz = 0 + (((tickAnim - 31) / 19) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backrightleg4, backrightleg4.rotateAngleX + (float) Math.toRadians(xx), backrightleg4.rotateAngleY + (float) Math.toRadians(yy), backrightleg4.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 0) / 19) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 19) * (-1.05-(0)));
            zz = 0 + (((tickAnim - 0) / 19) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 31) {
            xx = 0 + (((tickAnim - 19) / 12) * (0-(0)));
            yy = -1.05 + (((tickAnim - 19) / 12) * (-1.05-(-1.05)));
            zz = 0 + (((tickAnim - 19) / 12) * (0-(0)));
        }
        else if (tickAnim >= 31 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 31) / 19) * (0-(0)));
            yy = -1.05 + (((tickAnim - 31) / 19) * (0-(-1.05)));
            zz = 0 + (((tickAnim - 31) / 19) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.backrightleg4.rotationPointX = this.backrightleg4.rotationPointX + (float)(xx);
        this.backrightleg4.rotationPointY = this.backrightleg4.rotationPointY - (float)(yy);
        this.backrightleg4.rotationPointZ = this.backrightleg4.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 16) {
            xx = 0 + (((tickAnim - 0) / 16) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 16) * (-5-(0)));
            zz = 0 + (((tickAnim - 0) / 16) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 27) {
            xx = 0 + (((tickAnim - 16) / 11) * (0-(0)));
            yy = -5 + (((tickAnim - 16) / 11) * (-14-(-5)));
            zz = 0 + (((tickAnim - 16) / 11) * (0-(0)));
        }
        else if (tickAnim >= 27 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 27) / 8) * (0-(0)));
            yy = -14 + (((tickAnim - 27) / 8) * (-19.75-(-14)));
            zz = 0 + (((tickAnim - 27) / 8) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            yy = -19.75 + (((tickAnim - 35) / 15) * (0-(-19.75)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(xx), neck3.rotateAngleY + (float) Math.toRadians(yy), neck3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 16) {
            xx = 0 + (((tickAnim - 0) / 16) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 16) * (-6-(0)));
            zz = 0 + (((tickAnim - 0) / 16) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 27) {
            xx = 0 + (((tickAnim - 16) / 11) * (0-(0)));
            yy = -6 + (((tickAnim - 16) / 11) * (-12-(-6)));
            zz = 0 + (((tickAnim - 16) / 11) * (0-(0)));
        }
        else if (tickAnim >= 27 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 27) / 8) * (0-(0)));
            yy = -12 + (((tickAnim - 27) / 8) * (-13.75-(-12)));
            zz = 0 + (((tickAnim - 27) / 8) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            yy = -13.75 + (((tickAnim - 35) / 15) * (0-(-13.75)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(xx), neck.rotateAngleY + (float) Math.toRadians(yy), neck.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 16) {
            xx = 0 + (((tickAnim - 0) / 16) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 16) * (-7.5-(0)));
            zz = 0 + (((tickAnim - 0) / 16) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 27) {
            xx = 0 + (((tickAnim - 16) / 11) * (0-(0)));
            yy = -7.5 + (((tickAnim - 16) / 11) * (-12.25-(-7.5)));
            zz = 0 + (((tickAnim - 16) / 11) * (0-(0)));
        }
        else if (tickAnim >= 27 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 27) / 8) * (0-(0)));
            yy = -12.25 + (((tickAnim - 27) / 8) * (-12.25-(-12.25)));
            zz = 0 + (((tickAnim - 27) / 8) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            yy = -12.25 + (((tickAnim - 35) / 15) * (0-(-12.25)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));



        this.setRotateAngle(frontleftleg2, frontleftleg2.rotateAngleX + (float) Math.toRadians(0), frontleftleg2.rotateAngleY + (float) Math.toRadians(0), frontleftleg2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(frontrightleg2, frontrightleg2.rotateAngleX + (float) Math.toRadians(0), frontrightleg2.rotateAngleY + (float) Math.toRadians(0), frontrightleg2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tail, tail.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*108/0.75+50))*-1), tail.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*108/0.75+150))*-3), tail.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*108/0.75+50))*-1));


        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*108/0.75-170))*-1), tail2.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*108/0.75-170))*2.5), tail2.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*108/0.75-170))*-3));



        if (tickAnim >= 0 && tickAnim < 29) {
            xx = 0 + (((tickAnim - 0) / 29) * (-4.5-(0)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*108/0.75+190))*2.5 + (((tickAnim - 0) / 29) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*108/0.75+190))*2.5-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*108/0.75+190))*2.5)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*108/0.75+190))*-3 + (((tickAnim - 0) / 29) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*108/0.75+190))*-3-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*108/0.75+190))*-3)));
        }
        else if (tickAnim >= 29 && tickAnim < 50) {
            xx = -4.5 + (((tickAnim - 29) / 21) * (0-(-4.5)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*108/0.75+190))*2.5 + (((tickAnim - 29) / 21) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*108/0.75+190))*2.5-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*108/0.75+190))*2.5)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*108/0.75+190))*-3 + (((tickAnim - 29) / 21) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*108/0.75+190))*-3-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*108/0.75+190))*-3)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(xx), tail3.rotateAngleY + (float) Math.toRadians(yy), tail3.rotateAngleZ + (float) Math.toRadians(zz));



        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(0), tail4.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*108/0.75+200))*3.5), tail4.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*108/0.75+200))*-5));



        if (tickAnim >= 0 && tickAnim < 29) {
            xx = 0 + (((tickAnim - 0) / 29) * (7.75-(0)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*108/0.75+220))*3 + (((tickAnim - 0) / 29) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*108/0.75+220))*3-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*108/0.75+220))*3)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*108/0.75+220))*-5 + (((tickAnim - 0) / 29) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*108/0.75+220))*-5-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*108/0.75+220))*-5)));
        }
        else if (tickAnim >= 29 && tickAnim < 50) {
            xx = 7.75 + (((tickAnim - 29) / 21) * (0-(7.75)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*108/0.75+220))*3 + (((tickAnim - 29) / 21) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*108/0.75+220))*3-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*108/0.75+220))*3)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*108/0.75+220))*-5 + (((tickAnim - 29) / 21) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*108/0.75+220))*-5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*108/0.75+220))*-5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail5, tail5.rotateAngleX + (float) Math.toRadians(xx), tail5.rotateAngleY + (float) Math.toRadians(yy), tail5.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (26.32857-(0)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*108/0.75+50))*1 + (((tickAnim - 0) / 18) * (-0.0349-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*108/0.75+50))*1)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*108/0.75+50))*-1 + (((tickAnim - 0) / 18) * (0.0349-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*108/0.75+50))*-1)));
        }
        else if (tickAnim >= 18 && tickAnim < 29) {
            xx = 26.32857 + (((tickAnim - 18) / 11) * (30.75-(26.32857)));
            yy = -0.0349 + (((tickAnim - 18) / 11) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*108/0.75+50))*1-(-0.0349)));
            zz = 0.0349 + (((tickAnim - 18) / 11) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*108/0.75+50))*-1-(0.0349)));
        }
        else if (tickAnim >= 29 && tickAnim < 50) {
            xx = 30.75 + (((tickAnim - 29) / 21) * (0-(30.75)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*108/0.75+50))*1 + (((tickAnim - 29) / 21) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*108/0.75+50))*1-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*108/0.75+50))*1)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*108/0.75+50))*-1 + (((tickAnim - 29) / 21) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*108/0.75+50))*-1-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*108/0.75+50))*-1)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail6, tail6.rotateAngleX + (float) Math.toRadians(xx), tail6.rotateAngleY + (float) Math.toRadians(yy), tail6.rotateAngleZ + (float) Math.toRadians(zz));

    }

    public void animNest(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraMiragaia entity = (EntityPrehistoricFloraMiragaia) entitylivingbaseIn;

        int animCycle = 50;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;


        this.setRotateAngle(body2, body2.rotateAngleX + (float) Math.toRadians(0), body2.rotateAngleY + (float) Math.toRadians(0), body2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(upperbody, upperbody.rotateAngleX + (float) Math.toRadians(0), upperbody.rotateAngleY + (float) Math.toRadians(0), upperbody.rotateAngleZ + (float) Math.toRadians(0));



        if (tickAnim >= 0 && tickAnim < 16) {
            xx = 0 + (((tickAnim - 0) / 16) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 16) * (-23-(0)));
            zz = 0 + (((tickAnim - 0) / 16) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 16) / 17) * (0-(0)));
            yy = -23 + (((tickAnim - 16) / 17) * (-23-(-23)));
            zz = 0 + (((tickAnim - 16) / 17) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 33) / 17) * (0-(0)));
            yy = -23 + (((tickAnim - 33) / 17) * (0-(-23)));
            zz = 0 + (((tickAnim - 33) / 17) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(xx), neck2.rotateAngleY + (float) Math.toRadians(yy), neck2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 0) / 14) * (18.5-(0)));
            yy = 0 + (((tickAnim - 0) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 14) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 27) {
            xx = 18.5 + (((tickAnim - 14) / 13) * (0-(18.5)));
            yy = 0 + (((tickAnim - 14) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 13) * (0-(0)));
        }
        else if (tickAnim >= 27 && tickAnim < 38) {
            xx = 0 + (((tickAnim - 27) / 11) * (18.5-(0)));
            yy = 0 + (((tickAnim - 27) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 27) / 11) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 50) {
            xx = 18.5 + (((tickAnim - 38) / 12) * (0-(18.5)));
            yy = 0 + (((tickAnim - 38) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 38) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backleftleg, backleftleg.rotateAngleX + (float) Math.toRadians(xx), backleftleg.rotateAngleY + (float) Math.toRadians(yy), backleftleg.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 0) / 11) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 11) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 11) / 9) * (0-(0)));
            yy = 0 + (((tickAnim - 11) / 9) * (1.425-(0)));
            zz = 0 + (((tickAnim - 11) / 9) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 27) {
            xx = 0 + (((tickAnim - 20) / 7) * (0-(0)));
            yy = 1.425 + (((tickAnim - 20) / 7) * (0-(1.425)));
            zz = 0 + (((tickAnim - 20) / 7) * (0-(0)));
        }
        else if (tickAnim >= 27 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 27) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 27) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 27) / 8) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 43) {
            xx = 0 + (((tickAnim - 35) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 35) / 8) * (1.425-(0)));
            zz = 0 + (((tickAnim - 35) / 8) * (0-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 43) / 7) * (0-(0)));
            yy = 1.425 + (((tickAnim - 43) / 7) * (0-(1.425)));
            zz = 0 + (((tickAnim - 43) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.backleftleg.rotationPointX = this.backleftleg.rotationPointX + (float)(xx);
        this.backleftleg.rotationPointY = this.backleftleg.rotationPointY - (float)(yy);
        this.backleftleg.rotationPointZ = this.backleftleg.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (24-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 27) {
            xx = 24 + (((tickAnim - 20) / 7) * (0-(24)));
            yy = 0 + (((tickAnim - 20) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 7) * (0-(0)));
        }
        else if (tickAnim >= 27 && tickAnim < 43) {
            xx = 0 + (((tickAnim - 27) / 16) * (24-(0)));
            yy = 0 + (((tickAnim - 27) / 16) * (0-(0)));
            zz = 0 + (((tickAnim - 27) / 16) * (0-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 50) {
            xx = 24 + (((tickAnim - 43) / 7) * (0-(24)));
            yy = 0 + (((tickAnim - 43) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 43) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backleftleg2, backleftleg2.rotateAngleX + (float) Math.toRadians(xx), backleftleg2.rotateAngleY + (float) Math.toRadians(yy), backleftleg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (-0.25-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 27) {
            xx = 0 + (((tickAnim - 8) / 19) * (0-(0)));
            yy = -0.25 + (((tickAnim - 8) / 19) * (0-(-0.25)));
            zz = 0 + (((tickAnim - 8) / 19) * (0-(0)));
        }
        else if (tickAnim >= 27 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 27) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 27) / 6) * (-0.25-(0)));
            zz = 0 + (((tickAnim - 27) / 6) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 33) / 17) * (0-(0)));
            yy = -0.25 + (((tickAnim - 33) / 17) * (0-(-0.25)));
            zz = 0 + (((tickAnim - 33) / 17) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.backleftleg2.rotationPointX = this.backleftleg2.rotationPointX + (float)(xx);
        this.backleftleg2.rotationPointY = this.backleftleg2.rotationPointY - (float)(yy);
        this.backleftleg2.rotationPointZ = this.backleftleg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (8-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 20) {
            xx = 8 + (((tickAnim - 8) / 12) * (0.25-(8)));
            yy = 0 + (((tickAnim - 8) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 12) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 27) {
            xx = 0.25 + (((tickAnim - 20) / 7) * (0-(0.25)));
            yy = 0 + (((tickAnim - 20) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 7) * (0-(0)));
        }
        else if (tickAnim >= 27 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 27) / 6) * (-9.5-(0)));
            yy = 0 + (((tickAnim - 27) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 27) / 6) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 43) {
            xx = -9.5 + (((tickAnim - 33) / 10) * (0.25-(-9.5)));
            yy = 0 + (((tickAnim - 33) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 10) * (0-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 50) {
            xx = 0.25 + (((tickAnim - 43) / 7) * (0-(0.25)));
            yy = 0 + (((tickAnim - 43) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 43) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backleftleg3, backleftleg3.rotateAngleX + (float) Math.toRadians(xx), backleftleg3.rotateAngleY + (float) Math.toRadians(yy), backleftleg3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 0) / 9) * (0.55-(0)));
            yy = 0 + (((tickAnim - 0) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 9) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 20) {
            xx = 0.55 + (((tickAnim - 9) / 11) * (15.75-(0.55)));
            yy = 0 + (((tickAnim - 9) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 11) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 23) {
            xx = 15.75 + (((tickAnim - 20) / 3) * (-11.62-(15.75)));
            yy = 0 + (((tickAnim - 20) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 3) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 25) {
            xx = -11.62 + (((tickAnim - 23) / 2) * (-14.81-(-11.62)));
            yy = 0 + (((tickAnim - 23) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 2) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 27) {
            xx = -14.81 + (((tickAnim - 25) / 2) * (0-(-14.81)));
            yy = 0 + (((tickAnim - 25) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 2) * (0-(0)));
        }
        else if (tickAnim >= 27 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 27) / 6) * (0.55-(0)));
            yy = 0 + (((tickAnim - 27) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 27) / 6) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 43) {
            xx = 0.55 + (((tickAnim - 33) / 10) * (15.75-(0.55)));
            yy = 0 + (((tickAnim - 33) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 10) * (0-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 47) {
            xx = 15.75 + (((tickAnim - 43) / 4) * (-11.62-(15.75)));
            yy = 0 + (((tickAnim - 43) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 43) / 4) * (0-(0)));
        }
        else if (tickAnim >= 47 && tickAnim < 48) {
            xx = -11.62 + (((tickAnim - 47) / 1) * (-14.81-(-11.62)));
            yy = 0 + (((tickAnim - 47) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 47) / 1) * (0-(0)));
        }
        else if (tickAnim >= 48 && tickAnim < 50) {
            xx = -14.81 + (((tickAnim - 48) / 2) * (0-(-14.81)));
            yy = 0 + (((tickAnim - 48) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 48) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backleftleg4, backleftleg4.rotateAngleX + (float) Math.toRadians(xx), backleftleg4.rotateAngleY + (float) Math.toRadians(yy), backleftleg4.rotateAngleZ + (float) Math.toRadians(zz));



        this.setRotateAngle(backrightleg, backrightleg.rotateAngleX + (float) Math.toRadians(0), backrightleg.rotateAngleY + (float) Math.toRadians(0), backrightleg.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(backrightleg2, backrightleg2.rotateAngleX + (float) Math.toRadians(0), backrightleg2.rotateAngleY + (float) Math.toRadians(0), backrightleg2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(backrightleg3, backrightleg3.rotateAngleX + (float) Math.toRadians(0), backrightleg3.rotateAngleY + (float) Math.toRadians(0), backrightleg3.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(backrightleg4, backrightleg4.rotateAngleX + (float) Math.toRadians(0), backrightleg4.rotateAngleY + (float) Math.toRadians(0), backrightleg4.rotateAngleZ + (float) Math.toRadians(0));



        if (tickAnim >= 0 && tickAnim < 16) {
            xx = 0 + (((tickAnim - 0) / 16) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 16) * (-28-(0)));
            zz = 0 + (((tickAnim - 0) / 16) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 16) / 17) * (0-(0)));
            yy = -28 + (((tickAnim - 16) / 17) * (-28-(-28)));
            zz = 0 + (((tickAnim - 16) / 17) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 33) / 17) * (0-(0)));
            yy = -28 + (((tickAnim - 33) / 17) * (0-(-28)));
            zz = 0 + (((tickAnim - 33) / 17) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(xx), neck3.rotateAngleY + (float) Math.toRadians(yy), neck3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 16) {
            xx = 0 + (((tickAnim - 0) / 16) * (0.30588-(0)));
            yy = 0 + (((tickAnim - 0) / 16) * (-8.65742-(0)));
            zz = 0 + (((tickAnim - 0) / 16) * (-2.02113-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 33) {
            xx = 0.30588 + (((tickAnim - 16) / 17) * (0.6592-(0.30588)));
            yy = -8.65742 + (((tickAnim - 16) / 17) * (-10.03833-(-8.65742)));
            zz = -2.02113 + (((tickAnim - 16) / 17) * (-4.37723-(-2.02113)));
        }
        else if (tickAnim >= 33 && tickAnim < 50) {
            xx = 0.6592 + (((tickAnim - 33) / 17) * (0-(0.6592)));
            yy = -10.03833 + (((tickAnim - 33) / 17) * (0-(-10.03833)));
            zz = -4.37723 + (((tickAnim - 33) / 17) * (0-(-4.37723)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(xx), neck.rotateAngleY + (float) Math.toRadians(yy), neck.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 16) {
            xx = 0 + (((tickAnim - 0) / 16) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 16) * (-2-(0)));
            zz = 0 + (((tickAnim - 0) / 16) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 16) / 17) * (0-(0)));
            yy = -2 + (((tickAnim - 16) / 17) * (-2-(-2)));
            zz = 0 + (((tickAnim - 16) / 17) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 33) / 17) * (0-(0)));
            yy = -2 + (((tickAnim - 33) / 17) * (0-(-2)));
            zz = 0 + (((tickAnim - 33) / 17) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));



        this.setRotateAngle(frontleftleg, frontleftleg.rotateAngleX + (float) Math.toRadians(0), frontleftleg.rotateAngleY + (float) Math.toRadians(0), frontleftleg.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(frontleftleg2, frontleftleg2.rotateAngleX + (float) Math.toRadians(0), frontleftleg2.rotateAngleY + (float) Math.toRadians(0), frontleftleg2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(frontleftleg3, frontleftleg3.rotateAngleX + (float) Math.toRadians(0), frontleftleg3.rotateAngleY + (float) Math.toRadians(0), frontleftleg3.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(frontrightleg, frontrightleg.rotateAngleX + (float) Math.toRadians(0), frontrightleg.rotateAngleY + (float) Math.toRadians(0), frontrightleg.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(frontrightleg2, frontrightleg2.rotateAngleX + (float) Math.toRadians(0), frontrightleg2.rotateAngleY + (float) Math.toRadians(0), frontrightleg2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(frontrightleg3, frontrightleg3.rotateAngleX + (float) Math.toRadians(0), frontrightleg3.rotateAngleY + (float) Math.toRadians(0), frontrightleg3.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tail, tail.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*108/0.75+50))*-1), tail.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*108/0.75+150))*-3), tail.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*108/0.75+50))*-1));


        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*108/0.75-170))*-1), tail2.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*108/0.75-170))*2.5), tail2.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*108/0.75-170))*-3));


        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(0), tail3.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*108/0.75+190))*2.5), tail3.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*108/0.75+190))*-3));


        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(0), tail4.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*108/0.75+200))*3.5), tail4.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*108/0.75+200))*-5));


        this.setRotateAngle(tail5, tail5.rotateAngleX + (float) Math.toRadians(0), tail5.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*108/0.75+220))*3), tail5.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*108/0.75+220))*-5));


        this.setRotateAngle(tail6, tail6.rotateAngleX + (float) Math.toRadians(0), tail6.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*108/0.75+50))*1), tail6.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*108/0.75+50))*-1));



    }

    public void animEat(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraMiragaia entity = (EntityPrehistoricFloraMiragaia) entitylivingbaseIn;

        int animCycle = 70;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        if (tickAnim >= 0 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 0) / 28) * (7.25-(0)));
            yy = 0 + (((tickAnim - 0) / 28) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 28) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 48) {
            xx = 7.25 + (((tickAnim - 28) / 20) * (7.25-(7.25)));
            yy = 0 + (((tickAnim - 28) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 20) * (0-(0)));
        }
        else if (tickAnim >= 48 && tickAnim < 70) {
            xx = 7.25 + (((tickAnim - 48) / 22) * (0-(7.25)));
            yy = 0 + (((tickAnim - 48) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 48) / 22) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body2, body2.rotateAngleX + (float) Math.toRadians(xx), body2.rotateAngleY + (float) Math.toRadians(yy), body2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 0) / 28) * (6-(0)));
            yy = 0 + (((tickAnim - 0) / 28) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 28) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 48) {
            xx = 6 + (((tickAnim - 28) / 20) * (6-(6)));
            yy = 0 + (((tickAnim - 28) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 20) * (0-(0)));
        }
        else if (tickAnim >= 48 && tickAnim < 70) {
            xx = 6 + (((tickAnim - 48) / 22) * (0-(6)));
            yy = 0 + (((tickAnim - 48) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 48) / 22) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(upperbody, upperbody.rotateAngleX + (float) Math.toRadians(xx), upperbody.rotateAngleY + (float) Math.toRadians(yy), upperbody.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 0) / 28) * (3.03845-(0)));
            yy = 0 + (((tickAnim - 0) / 28) * (0.16763-(0)));
            zz = 0 + (((tickAnim - 0) / 28) * (-0.45687-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 36) {
            xx = 3.03845 + (((tickAnim - 28) / 8) * (7.28766-(3.03845)));
            yy = 0.16763 + (((tickAnim - 28) / 8) * (1.33795-(0.16763)));
            zz = -0.45687 + (((tickAnim - 28) / 8) * (-5.33527-(-0.45687)));
        }
        else if (tickAnim >= 36 && tickAnim < 48) {
            xx = 7.28766 + (((tickAnim - 36) / 12) * (3.03845-(7.28766)));
            yy = 1.33795 + (((tickAnim - 36) / 12) * (0.16763-(1.33795)));
            zz = -5.33527 + (((tickAnim - 36) / 12) * (-0.45687-(-5.33527)));
        }
        else if (tickAnim >= 48 && tickAnim < 70) {
            xx = 3.03845 + (((tickAnim - 48) / 22) * (0-(3.03845)));
            yy = 0.16763 + (((tickAnim - 48) / 22) * (0-(0.16763)));
            zz = -0.45687 + (((tickAnim - 48) / 22) * (0-(-0.45687)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(xx), neck2.rotateAngleY + (float) Math.toRadians(yy), neck2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 0) / 28) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 28) * (-0.1-(0)));
            zz = 0 + (((tickAnim - 0) / 28) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 48) {
            xx = 0 + (((tickAnim - 28) / 20) * (0-(0)));
            yy = -0.1 + (((tickAnim - 28) / 20) * (-0.1-(-0.1)));
            zz = 0 + (((tickAnim - 28) / 20) * (0-(0)));
        }
        else if (tickAnim >= 48 && tickAnim < 70) {
            xx = 0 + (((tickAnim - 48) / 22) * (0-(0)));
            yy = -0.1 + (((tickAnim - 48) / 22) * (0-(-0.1)));
            zz = 0 + (((tickAnim - 48) / 22) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.neck2.rotationPointX = this.neck2.rotationPointX + (float)(xx);
        this.neck2.rotationPointY = this.neck2.rotationPointY - (float)(yy);
        this.neck2.rotationPointZ = this.neck2.rotationPointZ + (float)(zz);

        if (tickAnim >= 0 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 0) / 28) * (12.25-(0)));
            yy = 0 + (((tickAnim - 0) / 28) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 28) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 48) {
            xx = 12.25 + (((tickAnim - 28) / 20) * (12.25-(12.25)));
            yy = 0 + (((tickAnim - 28) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 20) * (0-(0)));
        }
        else if (tickAnim >= 48 && tickAnim < 56) {
            xx = 12.25 + (((tickAnim - 48) / 8) * (-5.6-(12.25)));
            yy = 0 + (((tickAnim - 48) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 48) / 8) * (0-(0)));
        }
        else if (tickAnim >= 56 && tickAnim < 63) {
            xx = -5.6 + (((tickAnim - 56) / 7) * (0-(-5.6)));
            yy = 0 + (((tickAnim - 56) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 56) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backrightleg, backrightleg.rotateAngleX + (float) Math.toRadians(xx), backrightleg.rotateAngleY + (float) Math.toRadians(yy), backrightleg.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 63) {
            xx = 0 + (((tickAnim - 0) / 63) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 63) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 63) * (0-(0)));
        }
        else if (tickAnim >= 63 && tickAnim < 65) {
            xx = 0 + (((tickAnim - 63) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 63) / 2) * (-0.1-(0)));
            zz = 0 + (((tickAnim - 63) / 2) * (0-(0)));
        }
        else if (tickAnim >= 65 && tickAnim < 67) {
            xx = 0 + (((tickAnim - 65) / 2) * (0-(0)));
            yy = -0.1 + (((tickAnim - 65) / 2) * (0-(-0.1)));
            zz = 0 + (((tickAnim - 65) / 2) * (0-(0)));
        }
        else if (tickAnim >= 67 && tickAnim < 68) {
            xx = 0 + (((tickAnim - 67) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 67) / 1) * (-0.1-(0)));
            zz = 0 + (((tickAnim - 67) / 1) * (0-(0)));
        }
        else if (tickAnim >= 68 && tickAnim < 70) {
            xx = 0 + (((tickAnim - 68) / 2) * (0-(0)));
            yy = -0.1 + (((tickAnim - 68) / 2) * (0-(-0.1)));
            zz = 0 + (((tickAnim - 68) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.backrightleg.rotationPointX = this.backrightleg.rotationPointX + (float)(xx);
        this.backrightleg.rotationPointY = this.backrightleg.rotationPointY - (float)(yy);
        this.backrightleg.rotationPointZ = this.backrightleg.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 0) / 28) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 28) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 28) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 48) {
            xx = 0 + (((tickAnim - 28) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 28) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 20) * (0-(0)));
        }
        else if (tickAnim >= 48 && tickAnim < 56) {
            xx = 0 + (((tickAnim - 48) / 8) * (30.44-(0)));
            yy = 0 + (((tickAnim - 48) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 48) / 8) * (0-(0)));
        }
        else if (tickAnim >= 56 && tickAnim < 60) {
            xx = 30.44 + (((tickAnim - 56) / 4) * (6.65-(30.44)));
            yy = 0 + (((tickAnim - 56) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 56) / 4) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 63) {
            xx = 6.65 + (((tickAnim - 60) / 3) * (0-(6.65)));
            yy = 0 + (((tickAnim - 60) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backrightleg2, backrightleg2.rotateAngleX + (float) Math.toRadians(xx), backrightleg2.rotateAngleY + (float) Math.toRadians(yy), backrightleg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 28 && tickAnim < 48) {
            xx = 0 + (((tickAnim - 28) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 28) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 20) * (0-(0)));
        }
        else if (tickAnim >= 48 && tickAnim < 56) {
            xx = 0 + (((tickAnim - 48) / 8) * (-0.25-(0)));
            yy = 0 + (((tickAnim - 48) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 48) / 8) * (0-(0)));
        }
        else if (tickAnim >= 56 && tickAnim < 63) {
            xx = -0.25 + (((tickAnim - 56) / 7) * (0-(-0.25)));
            yy = 0 + (((tickAnim - 56) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 56) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.backrightleg2.rotationPointX = this.backrightleg2.rotationPointX + (float)(xx);
        this.backrightleg2.rotationPointY = this.backrightleg2.rotationPointY - (float)(yy);
        this.backrightleg2.rotationPointZ = this.backrightleg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 28 && tickAnim < 48) {
            xx = 0 + (((tickAnim - 28) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 28) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 20) * (0-(0)));
        }
        else if (tickAnim >= 48 && tickAnim < 56) {
            xx = 0 + (((tickAnim - 48) / 8) * (-15.5-(0)));
            yy = 0 + (((tickAnim - 48) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 48) / 8) * (0-(0)));
        }
        else if (tickAnim >= 56 && tickAnim < 60) {
            xx = -15.5 + (((tickAnim - 56) / 4) * (1.63-(-15.5)));
            yy = 0 + (((tickAnim - 56) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 56) / 4) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 63) {
            xx = 1.63 + (((tickAnim - 60) / 3) * (0-(1.63)));
            yy = 0 + (((tickAnim - 60) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backrightleg3, backrightleg3.rotateAngleX + (float) Math.toRadians(xx), backrightleg3.rotateAngleY + (float) Math.toRadians(yy), backrightleg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 28 && tickAnim < 48) {
            xx = 0 + (((tickAnim - 28) / 20) * (0-(0)));
            yy = -0.3 + (((tickAnim - 28) / 20) * (-0.3-(-0.3)));
            zz = 0.425 + (((tickAnim - 28) / 20) * (0.425-(0.425)));
        }
        else if (tickAnim >= 48 && tickAnim < 63) {
            xx = 0 + (((tickAnim - 48) / 15) * (0-(0)));
            yy = -0.3 + (((tickAnim - 48) / 15) * (-0.3-(-0.3)));
            zz = 0.425 + (((tickAnim - 48) / 15) * (0.425-(0.425)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.backrightleg3.rotationPointX = this.backrightleg3.rotationPointX + (float)(xx);
        this.backrightleg3.rotationPointY = this.backrightleg3.rotationPointY - (float)(yy);
        this.backrightleg3.rotationPointZ = this.backrightleg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 0) / 28) * (-12.5-(0)));
            yy = 0 + (((tickAnim - 0) / 28) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 28) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 48) {
            xx = -12.5 + (((tickAnim - 28) / 20) * (-12.5-(-12.5)));
            yy = 0 + (((tickAnim - 28) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 20) * (0-(0)));
        }
        else if (tickAnim >= 48 && tickAnim < 56) {
            xx = -12.5 + (((tickAnim - 48) / 8) * (6.16-(-12.5)));
            yy = 0 + (((tickAnim - 48) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 48) / 8) * (0-(0)));
        }
        else if (tickAnim >= 56 && tickAnim < 61) {
            xx = 6.16 + (((tickAnim - 56) / 5) * (-14.36-(6.16)));
            yy = 0 + (((tickAnim - 56) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 56) / 5) * (0-(0)));
        }
        else if (tickAnim >= 61 && tickAnim < 63) {
            xx = -14.36 + (((tickAnim - 61) / 2) * (0-(-14.36)));
            yy = 0 + (((tickAnim - 61) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 61) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backrightleg4, backrightleg4.rotateAngleX + (float) Math.toRadians(xx), backrightleg4.rotateAngleY + (float) Math.toRadians(yy), backrightleg4.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 0) / 28) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 28) * (-0.975-(0)));
            zz = 0 + (((tickAnim - 0) / 28) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 48) {
            xx = 0 + (((tickAnim - 28) / 20) * (0-(0)));
            yy = -0.975 + (((tickAnim - 28) / 20) * (-0.975-(-0.975)));
            zz = 0 + (((tickAnim - 28) / 20) * (0-(0)));
        }
        else if (tickAnim >= 48 && tickAnim < 63) {
            xx = 0 + (((tickAnim - 48) / 15) * (0-(0)));
            yy = -0.975 + (((tickAnim - 48) / 15) * (0-(-0.975)));
            zz = 0 + (((tickAnim - 48) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.backrightleg4.rotationPointX = this.backrightleg4.rotationPointX + (float)(xx);
        this.backrightleg4.rotationPointY = this.backrightleg4.rotationPointY - (float)(yy);
        this.backrightleg4.rotationPointZ = this.backrightleg4.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 0) / 28) * (14.88119-(0)));
            yy = 0 + (((tickAnim - 0) / 28) * (1.01848-(0)));
            zz = 0 + (((tickAnim - 0) / 28) * (-4.35723-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 36) {
            xx = 14.88119 + (((tickAnim - 28) / 8) * (15.631-(14.88119)));
            yy = 1.01848 + (((tickAnim - 28) / 8) * (1.02138-(1.01848)));
            zz = -4.35723 + (((tickAnim - 28) / 8) * (-4.36967-(-4.35723)));
        }
        else if (tickAnim >= 36 && tickAnim < 48) {
            xx = 15.631 + (((tickAnim - 36) / 12) * (14.88119-(15.631)));
            yy = 1.02138 + (((tickAnim - 36) / 12) * (1.01848-(1.02138)));
            zz = -4.36967 + (((tickAnim - 36) / 12) * (-4.35723-(-4.36967)));
        }
        else if (tickAnim >= 48 && tickAnim < 70) {
            xx = 14.88119 + (((tickAnim - 48) / 22) * (0-(14.88119)));
            yy = 1.01848 + (((tickAnim - 48) / 22) * (0-(1.01848)));
            zz = -4.35723 + (((tickAnim - 48) / 22) * (0-(-4.35723)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(xx), neck3.rotateAngleY + (float) Math.toRadians(yy), neck3.rotateAngleZ + (float) Math.toRadians(zz));

        this.neck3.rotationPointX = this.neck3.rotationPointX + (float)(0);
        this.neck3.rotationPointY = this.neck3.rotationPointY - (float)(0);
        this.neck3.rotationPointZ = this.neck3.rotationPointZ + (float)(0);



        if (tickAnim >= 28 && tickAnim < 36) {
            xx = 4.25 + (((tickAnim - 28) / 8) * (10.75-(4.25)));
            yy = 0 + (((tickAnim - 28) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 8) * (0-(0)));
        }
        else if (tickAnim >= 36 && tickAnim < 48) {
            xx = 10.75 + (((tickAnim - 36) / 12) * (4.25-(10.75)));
            yy = 0 + (((tickAnim - 36) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 36) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(xx), neck.rotateAngleY + (float) Math.toRadians(yy), neck.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 29) {
            xx = 0 + (((tickAnim - 0) / 29) * (8-(0)));
            yy = 0 + (((tickAnim - 0) / 29) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 29) * (0-(0)));
        }
        else if (tickAnim >= 29 && tickAnim < 36) {
            xx = 8 + (((tickAnim - 29) / 7) * (0-(8)));
            yy = 0 + (((tickAnim - 29) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 29) / 7) * (0-(0)));
        }
        else if (tickAnim >= 36 && tickAnim < 43) {
            xx = 0 + (((tickAnim - 36) / 7) * (8-(0)));
            yy = 0 + (((tickAnim - 36) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 36) / 7) * (0-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 70) {
            xx = 8 + (((tickAnim - 43) / 27) * (0-(8)));
            yy = 0 + (((tickAnim - 43) / 27) * (0-(0)));
            zz = 0 + (((tickAnim - 43) / 27) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 29) {
            xx = 0 + (((tickAnim - 0) / 29) * (2.75-(0)));
            yy = 0 + (((tickAnim - 0) / 29) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 29) * (0-(0)));
        }
        else if (tickAnim >= 29 && tickAnim < 36) {
            xx = 2.75 + (((tickAnim - 29) / 7) * (20.03-(2.75)));
            yy = 0 + (((tickAnim - 29) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 29) / 7) * (0-(0)));
        }
        else if (tickAnim >= 36 && tickAnim < 43) {
            xx = 20.03 + (((tickAnim - 36) / 7) * (0-(20.03)));
            yy = 0 + (((tickAnim - 36) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 36) / 7) * (0-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 70) {
            xx = 0 + (((tickAnim - 43) / 27) * (0-(0)));
            yy = 0 + (((tickAnim - 43) / 27) * (0-(0)));
            zz = 0 + (((tickAnim - 43) / 27) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(xx), jaw.rotateAngleY + (float) Math.toRadians(yy), jaw.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (1.5-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 22) {
            xx = 1.5 + (((tickAnim - 8) / 14) * (6.75-(1.5)));
            yy = 0 + (((tickAnim - 8) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 14) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 29) {
            xx = 6.75 + (((tickAnim - 22) / 7) * (0.5-(6.75)));
            yy = 0 + (((tickAnim - 22) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 22) / 7) * (0-(0)));
        }
        else if (tickAnim >= 29 && tickAnim < 48) {
            xx = 0.5 + (((tickAnim - 29) / 19) * (0.5-(0.5)));
            yy = 0 + (((tickAnim - 29) / 19) * (0-(0)));
            zz = 0 + (((tickAnim - 29) / 19) * (0-(0)));
        }
        else if (tickAnim >= 48 && tickAnim < 67) {
            xx = 0.5 + (((tickAnim - 48) / 19) * (-4.5-(0.5)));
            yy = 0 + (((tickAnim - 48) / 19) * (0-(0)));
            zz = 0 + (((tickAnim - 48) / 19) * (0-(0)));
        }
        else if (tickAnim >= 67 && tickAnim < 70) {
            xx = -4.5 + (((tickAnim - 67) / 3) * (0-(-4.5)));
            yy = 0 + (((tickAnim - 67) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 67) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontleftleg, frontleftleg.rotateAngleX + (float) Math.toRadians(xx), frontleftleg.rotateAngleY + (float) Math.toRadians(yy), frontleftleg.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0.575-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 22) {
            xx = 0 + (((tickAnim - 8) / 14) * (0-(0)));
            yy = 0.575 + (((tickAnim - 8) / 14) * (0-(0.575)));
            zz = 0 + (((tickAnim - 8) / 14) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 24) {
            xx = 0 + (((tickAnim - 22) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 22) / 2) * (-0.15-(0)));
            zz = 0 + (((tickAnim - 22) / 2) * (0-(0)));
        }
        else if (tickAnim >= 24 && tickAnim < 27) {
            xx = 0 + (((tickAnim - 24) / 3) * (0-(0)));
            yy = -0.15 + (((tickAnim - 24) / 3) * (0-(-0.15)));
            zz = 0 + (((tickAnim - 24) / 3) * (0-(0)));
        }
        else if (tickAnim >= 27 && tickAnim < 29) {
            xx = 0 + (((tickAnim - 27) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 27) / 2) * (-0.15-(0)));
            zz = 0 + (((tickAnim - 27) / 2) * (0-(0)));
        }
        else if (tickAnim >= 29 && tickAnim < 32) {
            xx = 0 + (((tickAnim - 29) / 3) * (0-(0)));
            yy = -0.15 + (((tickAnim - 29) / 3) * (0-(-0.15)));
            zz = 0 + (((tickAnim - 29) / 3) * (0-(0)));
        }
        else if (tickAnim >= 32 && tickAnim < 67) {
            xx = 0 + (((tickAnim - 32) / 35) * (0-(0)));
            yy = 0 + (((tickAnim - 32) / 35) * (0-(0)));
            zz = 0 + (((tickAnim - 32) / 35) * (0-(0)));
        }
        else if (tickAnim >= 67 && tickAnim < 70) {
            xx = 0 + (((tickAnim - 67) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 67) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 67) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.frontleftleg.rotationPointX = this.frontleftleg.rotationPointX + (float)(xx);
        this.frontleftleg.rotationPointY = this.frontleftleg.rotationPointY - (float)(yy);
        this.frontleftleg.rotationPointZ = this.frontleftleg.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (-29.5-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 22) {
            xx = -29.5 + (((tickAnim - 8) / 14) * (-5.75-(-29.5)));
            yy = 0 + (((tickAnim - 8) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 14) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 29) {
            xx = -5.75 + (((tickAnim - 22) / 7) * (-5.75-(-5.75)));
            yy = 0 + (((tickAnim - 22) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 22) / 7) * (0-(0)));
        }
        else if (tickAnim >= 29 && tickAnim < 48) {
            xx = -5.75 + (((tickAnim - 29) / 19) * (-5.75-(-5.75)));
            yy = 0 + (((tickAnim - 29) / 19) * (0-(0)));
            zz = 0 + (((tickAnim - 29) / 19) * (0-(0)));
        }
        else if (tickAnim >= 48 && tickAnim < 55) {
            xx = -5.75 + (((tickAnim - 48) / 7) * (-27.98-(-5.75)));
            yy = 0 + (((tickAnim - 48) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 48) / 7) * (0-(0)));
        }
        else if (tickAnim >= 55 && tickAnim < 67) {
            xx = -27.98 + (((tickAnim - 55) / 12) * (-0.25-(-27.98)));
            yy = 0 + (((tickAnim - 55) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 55) / 12) * (0-(0)));
        }
        else if (tickAnim >= 67 && tickAnim < 70) {
            xx = -0.25 + (((tickAnim - 67) / 3) * (0-(-0.25)));
            yy = 0 + (((tickAnim - 67) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 67) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontleftleg2, frontleftleg2.rotateAngleX + (float) Math.toRadians(xx), frontleftleg2.rotateAngleY + (float) Math.toRadians(yy), frontleftleg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 0) / 11) * (-0.475-(0)));
            yy = 0 + (((tickAnim - 0) / 11) * (0.76-(0)));
            zz = 0 + (((tickAnim - 0) / 11) * (0.415-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 22) {
            xx = -0.475 + (((tickAnim - 11) / 11) * (0-(-0.475)));
            yy = 0.76 + (((tickAnim - 11) / 11) * (0-(0.76)));
            zz = 0.415 + (((tickAnim - 11) / 11) * (0-(0.415)));
        }
        else if (tickAnim >= 22 && tickAnim < 29) {
            xx = 0 + (((tickAnim - 22) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 22) / 7) * (0.625-(0)));
            zz = 0 + (((tickAnim - 22) / 7) * (0.25-(0)));
        }
        else if (tickAnim >= 29 && tickAnim < 48) {
            xx = 0 + (((tickAnim - 29) / 19) * (0-(0)));
            yy = 0.625 + (((tickAnim - 29) / 19) * (0.625-(0.625)));
            zz = 0.25 + (((tickAnim - 29) / 19) * (0.25-(0.25)));
        }
        else if (tickAnim >= 48 && tickAnim < 55) {
            xx = 0 + (((tickAnim - 48) / 7) * (0-(0)));
            yy = 0.625 + (((tickAnim - 48) / 7) * (1.42-(0.625)));
            zz = 0.25 + (((tickAnim - 48) / 7) * (0.93-(0.25)));
        }
        else if (tickAnim >= 55 && tickAnim < 67) {
            xx = 0 + (((tickAnim - 55) / 12) * (0-(0)));
            yy = 1.42 + (((tickAnim - 55) / 12) * (0.575-(1.42)));
            zz = 0.93 + (((tickAnim - 55) / 12) * (0-(0.93)));
        }
        else if (tickAnim >= 67 && tickAnim < 70) {
            xx = 0 + (((tickAnim - 67) / 3) * (0-(0)));
            yy = 0.575 + (((tickAnim - 67) / 3) * (0-(0.575)));
            zz = 0 + (((tickAnim - 67) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.frontleftleg2.rotationPointX = this.frontleftleg2.rotationPointX + (float)(xx);
        this.frontleftleg2.rotationPointY = this.frontleftleg2.rotationPointY - (float)(yy);
        this.frontleftleg2.rotationPointZ = this.frontleftleg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (32.75-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 19) {
            xx = 32.75 + (((tickAnim - 8) / 11) * (-15.51-(32.75)));
            yy = 0 + (((tickAnim - 8) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 11) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 22) {
            xx = -15.51 + (((tickAnim - 19) / 3) * (-11.75-(-15.51)));
            yy = 0 + (((tickAnim - 19) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 19) / 3) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 29) {
            xx = -11.75 + (((tickAnim - 22) / 7) * (-7.25-(-11.75)));
            yy = 0 + (((tickAnim - 22) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 22) / 7) * (0-(0)));
        }
        else if (tickAnim >= 29 && tickAnim < 48) {
            xx = -7.25 + (((tickAnim - 29) / 19) * (-7.25-(-7.25)));
            yy = 0 + (((tickAnim - 29) / 19) * (0-(0)));
            zz = 0 + (((tickAnim - 29) / 19) * (0-(0)));
        }
        else if (tickAnim >= 48 && tickAnim < 55) {
            xx = -7.25 + (((tickAnim - 48) / 7) * (35.99-(-7.25)));
            yy = 0 + (((tickAnim - 48) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 48) / 7) * (0-(0)));
        }
        else if (tickAnim >= 55 && tickAnim < 63) {
            xx = 35.99 + (((tickAnim - 55) / 8) * (-3.4-(35.99)));
            yy = 0 + (((tickAnim - 55) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 55) / 8) * (0-(0)));
        }
        else if (tickAnim >= 63 && tickAnim < 67) {
            xx = -3.4 + (((tickAnim - 63) / 4) * (4.75-(-3.4)));
            yy = 0 + (((tickAnim - 63) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 63) / 4) * (0-(0)));
        }
        else if (tickAnim >= 67 && tickAnim < 70) {
            xx = 4.75 + (((tickAnim - 67) / 3) * (0-(4.75)));
            yy = 0 + (((tickAnim - 67) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 67) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontleftleg3, frontleftleg3.rotateAngleX + (float) Math.toRadians(xx), frontleftleg3.rotateAngleY + (float) Math.toRadians(yy), frontleftleg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0.05-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (-0.925-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 22) {
            xx = 0 + (((tickAnim - 8) / 14) * (0-(0)));
            yy = 0.05 + (((tickAnim - 8) / 14) * (0.15-(0.05)));
            zz = -0.925 + (((tickAnim - 8) / 14) * (0-(-0.925)));
        }
        else if (tickAnim >= 22 && tickAnim < 29) {
            xx = 0 + (((tickAnim - 22) / 7) * (0-(0)));
            yy = 0.15 + (((tickAnim - 22) / 7) * (0.35-(0.15)));
            zz = 0 + (((tickAnim - 22) / 7) * (0-(0)));
        }
        else if (tickAnim >= 29 && tickAnim < 48) {
            xx = 0 + (((tickAnim - 29) / 19) * (0-(0)));
            yy = 0.35 + (((tickAnim - 29) / 19) * (0.35-(0.35)));
            zz = 0 + (((tickAnim - 29) / 19) * (0-(0)));
        }
        else if (tickAnim >= 48 && tickAnim < 51) {
            xx = 0 + (((tickAnim - 48) / 3) * (0-(0)));
            yy = 0.35 + (((tickAnim - 48) / 3) * (1.06-(0.35)));
            zz = 0 + (((tickAnim - 48) / 3) * (0-(0)));
        }
        else if (tickAnim >= 51 && tickAnim < 55) {
            xx = 0 + (((tickAnim - 51) / 4) * (0-(0)));
            yy = 1.06 + (((tickAnim - 51) / 4) * (-0.02-(1.06)));
            zz = 0 + (((tickAnim - 51) / 4) * (-1.05-(0)));
        }
        else if (tickAnim >= 55 && tickAnim < 67) {
            xx = 0 + (((tickAnim - 55) / 12) * (0-(0)));
            yy = -0.02 + (((tickAnim - 55) / 12) * (0-(-0.02)));
            zz = -1.05 + (((tickAnim - 55) / 12) * (0-(-1.05)));
        }
        else if (tickAnim >= 67 && tickAnim < 70) {
            xx = 0 + (((tickAnim - 67) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 67) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 67) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.frontleftleg3.rotationPointX = this.frontleftleg3.rotationPointX + (float)(xx);
        this.frontleftleg3.rotationPointY = this.frontleftleg3.rotationPointY - (float)(yy);
        this.frontleftleg3.rotationPointZ = this.frontleftleg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 29) {
            xx = 0 + (((tickAnim - 0) / 29) * (-37.75-(0)));
            yy = 0 + (((tickAnim - 0) / 29) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 29) * (0-(0)));
        }
        else if (tickAnim >= 29 && tickAnim < 48) {
            xx = -37.75 + (((tickAnim - 29) / 19) * (-37.75-(-37.75)));
            yy = 0 + (((tickAnim - 29) / 19) * (0-(0)));
            zz = 0 + (((tickAnim - 29) / 19) * (0-(0)));
        }
        else if (tickAnim >= 48 && tickAnim < 70) {
            xx = -37.75 + (((tickAnim - 48) / 22) * (0-(-37.75)));
            yy = 0 + (((tickAnim - 48) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 48) / 22) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontrightleg, frontrightleg.rotateAngleX + (float) Math.toRadians(xx), frontrightleg.rotateAngleY + (float) Math.toRadians(yy), frontrightleg.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            yy = -0.05 + (((tickAnim - 0) / 6) * (0.565-(-0.05)));
            zz = 0 + (((tickAnim - 0) / 6) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 6) / 7) * (0-(0)));
            yy = 0.565 + (((tickAnim - 6) / 7) * (0.875-(0.565)));
            zz = 0 + (((tickAnim - 6) / 7) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 21) {
            xx = 0 + (((tickAnim - 13) / 8) * (0-(0)));
            yy = 0.875 + (((tickAnim - 13) / 8) * (0.7-(0.875)));
            zz = 0 + (((tickAnim - 13) / 8) * (0-(0)));
        }
        else if (tickAnim >= 21 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 21) / 7) * (0-(0)));
            yy = 0.7 + (((tickAnim - 21) / 7) * (0.255-(0.7)));
            zz = 0 + (((tickAnim - 21) / 7) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 29) {
            xx = 0 + (((tickAnim - 28) / 1) * (0-(0)));
            yy = 0.255 + (((tickAnim - 28) / 1) * (-0.075-(0.255)));
            zz = 0 + (((tickAnim - 28) / 1) * (0-(0)));
        }
        else if (tickAnim >= 29 && tickAnim < 48) {
            xx = 0 + (((tickAnim - 29) / 19) * (0-(0)));
            yy = -0.075 + (((tickAnim - 29) / 19) * (-0.075-(-0.075)));
            zz = 0 + (((tickAnim - 29) / 19) * (0-(0)));
        }
        else if (tickAnim >= 48 && tickAnim < 53) {
            xx = 0 + (((tickAnim - 48) / 5) * (0-(0)));
            yy = -0.075 + (((tickAnim - 48) / 5) * (0.605-(-0.075)));
            zz = 0 + (((tickAnim - 48) / 5) * (0-(0)));
        }
        else if (tickAnim >= 53 && tickAnim < 58) {
            xx = 0 + (((tickAnim - 53) / 5) * (0-(0)));
            yy = 0.605 + (((tickAnim - 53) / 5) * (0.865-(0.605)));
            zz = 0 + (((tickAnim - 53) / 5) * (0-(0)));
        }
        else if (tickAnim >= 58 && tickAnim < 64) {
            xx = 0 + (((tickAnim - 58) / 6) * (0-(0)));
            yy = 0.865 + (((tickAnim - 58) / 6) * (0.61-(0.865)));
            zz = 0 + (((tickAnim - 58) / 6) * (0-(0)));
        }
        else if (tickAnim >= 64 && tickAnim < 70) {
            xx = 0 + (((tickAnim - 64) / 6) * (0-(0)));
            yy = 0.61 + (((tickAnim - 64) / 6) * (-0.05-(0.61)));
            zz = 0 + (((tickAnim - 64) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.frontrightleg.rotationPointX = this.frontrightleg.rotationPointX + (float)(xx);
        this.frontrightleg.rotationPointY = this.frontrightleg.rotationPointY - (float)(yy);
        this.frontrightleg.rotationPointZ = this.frontrightleg.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 29) {
            xx = 0 + (((tickAnim - 0) / 29) * (-16-(0)));
            yy = 0 + (((tickAnim - 0) / 29) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 29) * (0-(0)));
        }
        else if (tickAnim >= 29 && tickAnim < 48) {
            xx = -16 + (((tickAnim - 29) / 19) * (-16-(-16)));
            yy = 0 + (((tickAnim - 29) / 19) * (0-(0)));
            zz = 0 + (((tickAnim - 29) / 19) * (0-(0)));
        }
        else if (tickAnim >= 48 && tickAnim < 70) {
            xx = -16 + (((tickAnim - 48) / 22) * (0-(-16)));
            yy = 0 + (((tickAnim - 48) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 48) / 22) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontrightleg2, frontrightleg2.rotateAngleX + (float) Math.toRadians(xx), frontrightleg2.rotateAngleY + (float) Math.toRadians(yy), frontrightleg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 29 && tickAnim < 48) {
            xx = 0.1 + (((tickAnim - 29) / 19) * (0.1-(0.1)));
            yy = 0 + (((tickAnim - 29) / 19) * (0-(0)));
            zz = 0 + (((tickAnim - 29) / 19) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.frontrightleg2.rotationPointX = this.frontrightleg2.rotationPointX + (float)(xx);
        this.frontrightleg2.rotationPointY = this.frontrightleg2.rotationPointY - (float)(yy);
        this.frontrightleg2.rotationPointZ = this.frontrightleg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 29) {
            xx = 0 + (((tickAnim - 0) / 29) * (41.64705-(0)));
            yy = 0 + (((tickAnim - 0) / 29) * (4.33145-(0)));
            zz = 0 + (((tickAnim - 0) / 29) * (-2.97101-(0)));
        }
        else if (tickAnim >= 29 && tickAnim < 48) {
            xx = 41.64705 + (((tickAnim - 29) / 19) * (41.64705-(41.64705)));
            yy = 4.33145 + (((tickAnim - 29) / 19) * (4.33145-(4.33145)));
            zz = -2.97101 + (((tickAnim - 29) / 19) * (-2.97101-(-2.97101)));
        }
        else if (tickAnim >= 48 && tickAnim < 70) {
            xx = 41.64705 + (((tickAnim - 48) / 22) * (0-(41.64705)));
            yy = 4.33145 + (((tickAnim - 48) / 22) * (0-(4.33145)));
            zz = -2.97101 + (((tickAnim - 48) / 22) * (0-(-2.97101)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontrightleg3, frontrightleg3.rotateAngleX + (float) Math.toRadians(xx), frontrightleg3.rotateAngleY + (float) Math.toRadians(yy), frontrightleg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 29 && tickAnim < 48) {
            xx = 0 + (((tickAnim - 29) / 19) * (0-(0)));
            yy = 0 + (((tickAnim - 29) / 19) * (0-(0)));
            zz = -0.9 + (((tickAnim - 29) / 19) * (-0.9-(-0.9)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.frontrightleg3.rotationPointX = this.frontrightleg3.rotationPointX + (float)(xx);
        this.frontrightleg3.rotationPointY = this.frontrightleg3.rotationPointY - (float)(yy);
        this.frontrightleg3.rotationPointZ = this.frontrightleg3.rotationPointZ + (float)(zz);



        this.setRotateAngle(tail, tail.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*154/0.75+50))*-1), tail.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*154/0.75+150))*-3), tail.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*154/0.75+50))*-1));


        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*154/0.75-170))*-1), tail2.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*154/0.75-170))*2.5), tail2.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*154/0.75-170))*-3));


        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(0), tail3.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*154/0.75+190))*2.5), tail3.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*154/0.75+190))*-3));


        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(0), tail4.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*154/0.75+200))*3.5), tail4.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*154/0.75+200))*-5));


        this.setRotateAngle(tail5, tail5.rotateAngleX + (float) Math.toRadians(0), tail5.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*154/0.75+220))*3), tail5.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*154/0.75+220))*-5));


        this.setRotateAngle(tail6, tail6.rotateAngleX + (float) Math.toRadians(0), tail6.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*154/0.75+250))*1), tail6.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*154/0.75+250))*-1));



        if (tickAnim >= 0 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 0) / 28) * (9.09961-(0)));
            yy = 0 + (((tickAnim - 0) / 28) * (1.14454-(0)));
            zz = 0 + (((tickAnim - 0) / 28) * (-3.042-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 36) {
            xx = 9.09961 + (((tickAnim - 28) / 8) * (7.84961-(9.09961)));
            yy = 1.14454 + (((tickAnim - 28) / 8) * (1.14454-(1.14454)));
            zz = -3.042 + (((tickAnim - 28) / 8) * (-3.042-(-3.042)));
        }
        else if (tickAnim >= 36 && tickAnim < 48) {
            xx = 7.84961 + (((tickAnim - 36) / 12) * (9.09961-(7.84961)));
            yy = 1.14454 + (((tickAnim - 36) / 12) * (1.14454-(1.14454)));
            zz = -3.042 + (((tickAnim - 36) / 12) * (-3.042-(-3.042)));
        }
        else if (tickAnim >= 48 && tickAnim < 70) {
            xx = 9.09961 + (((tickAnim - 48) / 22) * (0-(9.09961)));
            yy = 1.14454 + (((tickAnim - 48) / 22) * (0-(1.14454)));
            zz = -3.042 + (((tickAnim - 48) / 22) * (0-(-3.042)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck4, neck4.rotateAngleX + (float) Math.toRadians(xx), neck4.rotateAngleY + (float) Math.toRadians(yy), neck4.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 0) / 28) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 28) * (-0.85-(0)));
            zz = 0 + (((tickAnim - 0) / 28) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 36) {
            xx = 0 + (((tickAnim - 28) / 8) * (0-(0)));
            yy = -0.85 + (((tickAnim - 28) / 8) * (-1.03-(-0.85)));
            zz = 0 + (((tickAnim - 28) / 8) * (0-(0)));
        }
        else if (tickAnim >= 36 && tickAnim < 48) {
            xx = 0 + (((tickAnim - 36) / 12) * (0-(0)));
            yy = -1.03 + (((tickAnim - 36) / 12) * (-0.85-(-1.03)));
            zz = 0 + (((tickAnim - 36) / 12) * (0-(0)));
        }
        else if (tickAnim >= 48 && tickAnim < 70) {
            xx = 0 + (((tickAnim - 48) / 22) * (0-(0)));
            yy = -0.85 + (((tickAnim - 48) / 22) * (0-(-0.85)));
            zz = 0 + (((tickAnim - 48) / 22) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.neck4.rotationPointX = this.neck4.rotationPointX + (float)(xx);
        this.neck4.rotationPointY = this.neck4.rotationPointY - (float)(yy);
        this.neck4.rotationPointZ = this.neck4.rotationPointZ + (float)(zz);

    }

    public void animAttack(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraMiragaia entity = (EntityPrehistoricFloraMiragaia) entitylivingbaseIn;

        int animCycle = 25;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (0.06177-(0)));
            yy = 0 + (((tickAnim - 0) / 4) * (-3.62999-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (-0.99344-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 15) {
            xx = 0.06177 + (((tickAnim - 4) / 11) * (1.00599-(0.06177)));
            yy = -3.62999 + (((tickAnim - 4) / 11) * (26.99367-(-3.62999)));
            zz = -0.99344 + (((tickAnim - 4) / 11) * (2.22543-(-0.99344)));
        }
        else if (tickAnim >= 15 && tickAnim < 25) {
            xx = 1.00599 + (((tickAnim - 15) / 10) * (0-(1.00599)));
            yy = 26.99367 + (((tickAnim - 15) / 10) * (0-(26.99367)));
            zz = 2.22543 + (((tickAnim - 15) / 10) * (0-(2.22543)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(xx), body.rotateAngleY + (float) Math.toRadians(yy), body.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 8.5869 + (((tickAnim - 0) / 7) * (8.35974-(8.5869)));
            yy = -23.2364+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-150))*-3 + (((tickAnim - 0) / 7) * (-30.12731-(-23.2364+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-150))*-3)));
            zz = 0.69791 + (((tickAnim - 0) / 7) * (1.19202-(0.69791)));
        }
        else if (tickAnim >= 7 && tickAnim < 15) {
            xx = 8.35974 + (((tickAnim - 7) / 8) * (8.37873-(8.35974)));
            yy = -30.12731 + (((tickAnim - 7) / 8) * (-32.4775+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-150))*-3-(-30.12731)));
            zz = 1.19202 + (((tickAnim - 7) / 8) * (1.15369-(1.19202)));
        }
        else if (tickAnim >= 15 && tickAnim < 25) {
            xx = 8.37873 + (((tickAnim - 15) / 10) * (8.6818-(8.37873)));
            yy = -32.4775+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-150))*-3 + (((tickAnim - 15) / 10) * (-18.5004+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-150))*-3-(-32.4775+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-150))*-3)));
            zz = 1.15369 + (((tickAnim - 15) / 10) * (0.46145-(1.15369)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(xx), neck2.rotateAngleY + (float) Math.toRadians(yy), neck2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 4) * (2-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 4) / 11) * (0-(0)));
            yy = 2 + (((tickAnim - 4) / 11) * (-22.75-(2)));
            zz = 0 + (((tickAnim - 4) / 11) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 15) / 10) * (0-(0)));
            yy = -22.75 + (((tickAnim - 15) / 10) * (0-(-22.75)));
            zz = 0 + (((tickAnim - 15) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body2, body2.rotateAngleX + (float) Math.toRadians(xx), body2.rotateAngleY + (float) Math.toRadians(yy), body2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 4) / 11) * (0-(0)));
            yy = 0 + (((tickAnim - 4) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 11) * (1-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 15) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 15) / 10) * (0-(0)));
            zz = 1 + (((tickAnim - 15) / 10) * (0-(1)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.body2.rotationPointX = this.body2.rotationPointX + (float)(xx);
        this.body2.rotationPointY = this.body2.rotationPointY - (float)(yy);
        this.body2.rotationPointZ = this.body2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (0.09855-(0)));
            yy = 0 + (((tickAnim - 0) / 4) * (2.6142-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (2.24377-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 15) {
            xx = 0.09855 + (((tickAnim - 4) / 11) * (0.71882-(0.09855)));
            yy = 2.6142 + (((tickAnim - 4) / 11) * (-8.40479-(2.6142)));
            zz = 2.24377 + (((tickAnim - 4) / 11) * (-5.03514-(2.24377)));
        }
        else if (tickAnim >= 15 && tickAnim < 25) {
            xx = 0.71882 + (((tickAnim - 15) / 10) * (0-(0.71882)));
            yy = -8.40479 + (((tickAnim - 15) / 10) * (0-(-8.40479)));
            zz = -5.03514 + (((tickAnim - 15) / 10) * (0-(-5.03514)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(upperbody, upperbody.rotateAngleX + (float) Math.toRadians(xx), upperbody.rotateAngleY + (float) Math.toRadians(yy), upperbody.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 4) / 11) * (0-(0)));
            yy = 0 + (((tickAnim - 4) / 11) * (-0.65-(0)));
            zz = 0 + (((tickAnim - 4) / 11) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 15) / 10) * (0-(0)));
            yy = -0.65 + (((tickAnim - 15) / 10) * (0-(-0.65)));
            zz = 0 + (((tickAnim - 15) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.upperbody.rotationPointX = this.upperbody.rotationPointX + (float)(xx);
        this.upperbody.rotationPointY = this.upperbody.rotationPointY - (float)(yy);
        this.upperbody.rotationPointZ = this.upperbody.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 4.11521 + (((tickAnim - 0) / 7) * (3.79614-(4.11521)));
            yy = -31.7168+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-150))*3 + (((tickAnim - 0) / 7) * (-37.92131-(-31.7168+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-150))*3)));
            zz = 0.77155 + (((tickAnim - 0) / 7) * (1.24526-(0.77155)));
        }
        else if (tickAnim >= 7 && tickAnim < 15) {
            xx = 3.79614 + (((tickAnim - 7) / 8) * (4.64663-(3.79614)));
            yy = -37.92131 + (((tickAnim - 7) / 8) * (-21.267+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-150))*3-(-37.92131)));
            zz = 1.24526 + (((tickAnim - 7) / 8) * (-0.38349-(1.24526)));
        }
        else if (tickAnim >= 15 && tickAnim < 25) {
            xx = 4.64663 + (((tickAnim - 15) / 10) * (4.14273-(4.64663)));
            yy = -21.267+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-150))*3 + (((tickAnim - 15) / 10) * (-36.493+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-150))*3-(-21.267+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-150))*3)));
            zz = -0.38349 + (((tickAnim - 15) / 10) * (0.75845-(-0.38349)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(xx), neck3.rotateAngleY + (float) Math.toRadians(yy), neck3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 0) / 25) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 25) * (0-(0)));
            zz = 0.45 + (((tickAnim - 0) / 25) * (0.45-(0.45)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.neck3.rotationPointX = this.neck3.rotationPointX + (float)(xx);
        this.neck3.rotationPointY = this.neck3.rotationPointY - (float)(yy);
        this.neck3.rotationPointZ = this.neck3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 9.25 + (((tickAnim - 0) / 15) * (9.64613-(9.25)));
            yy = -13+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-150))*3 + (((tickAnim - 0) / 15) * (-18.8535+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-150))*3-(-13+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-150))*3)));
            zz = 0 + (((tickAnim - 0) / 15) * (-1.37638-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 25) {
            xx = 9.64613 + (((tickAnim - 15) / 10) * (9.32301-(9.64613)));
            yy = -18.8535+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-150))*3 + (((tickAnim - 15) / 10) * (-17.4334+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-150))*3-(-18.8535+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-150))*3)));
            zz = -1.37638 + (((tickAnim - 15) / 10) * (-0.3868-(-1.37638)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(xx), neck.rotateAngleY + (float) Math.toRadians(yy), neck.rotateAngleZ + (float) Math.toRadians(zz));

        this.neck.rotationPointX = this.neck.rotationPointX + (float)(0);
        this.neck.rotationPointY = this.neck.rotationPointY - (float)(0);
        this.neck.rotationPointZ = this.neck.rotationPointZ + (float)(0.225);



        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            yy = -12.25 + (((tickAnim - 0) / 15) * (-18-(-12.25)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 15) / 10) * (0-(0)));
            yy = -18 + (((tickAnim - 15) / 10) * (-12.25-(-18)));
            zz = 0 + (((tickAnim - 15) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 0) / 25) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 25) * (0-(0)));
            zz = 0.5 + (((tickAnim - 0) / 25) * (0.5-(0.5)));
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
            xx = 0 + (((tickAnim - 0) / 4) * (-4-(0)));
            yy = 0 + (((tickAnim - 0) / 4) * (-7.25-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 8) {
            xx = -4 + (((tickAnim - 4) / 4) * (-5.70434-(-4)));
            yy = -7.25 + (((tickAnim - 4) / 4) * (6.78797-(-7.25)));
            zz = 0 + (((tickAnim - 4) / 4) * (-1.85663-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 15) {
            xx = -5.70434 + (((tickAnim - 8) / 7) * (-1.69041-(-5.70434)));
            yy = 6.78797 + (((tickAnim - 8) / 7) * (26.44113-(6.78797)));
            zz = -1.85663 + (((tickAnim - 8) / 7) * (-4.4559-(-1.85663)));
        }
        else if (tickAnim >= 15 && tickAnim < 25) {
            xx = -1.69041 + (((tickAnim - 15) / 10) * (0-(-1.69041)));
            yy = 26.44113 + (((tickAnim - 15) / 10) * (0-(26.44113)));
            zz = -4.4559 + (((tickAnim - 15) / 10) * (0-(-4.4559)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail, tail.rotateAngleX + (float) Math.toRadians(xx), tail.rotateAngleY + (float) Math.toRadians(yy), tail.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (-2.75-(0)));
            yy = 0 + (((tickAnim - 0) / 4) * (-4.75-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 8) {
            xx = -2.75 + (((tickAnim - 4) / 4) * (-5.48098-(-2.75)));
            yy = -4.75 + (((tickAnim - 4) / 4) * (5.50068-(-4.75)));
            zz = 0 + (((tickAnim - 4) / 4) * (-4.25562-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 15) {
            xx = -5.48098 + (((tickAnim - 8) / 7) * (1.24564-(-5.48098)));
            yy = 5.50068 + (((tickAnim - 8) / 7) * (19.85164-(5.50068)));
            zz = -4.25562 + (((tickAnim - 8) / 7) * (-10.21348-(-4.25562)));
        }
        else if (tickAnim >= 15 && tickAnim < 25) {
            xx = 1.24564 + (((tickAnim - 15) / 10) * (0-(1.24564)));
            yy = 19.85164 + (((tickAnim - 15) / 10) * (0-(19.85164)));
            zz = -10.21348 + (((tickAnim - 15) / 10) * (0-(-10.21348)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(xx), tail2.rotateAngleY + (float) Math.toRadians(yy), tail2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 4 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 4) / 11) * (0-(0)));
            yy = 0 + (((tickAnim - 4) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 11) * (-0.5-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 15) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 15) / 10) * (0-(0)));
            zz = -0.5 + (((tickAnim - 15) / 10) * (0-(-0.5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.tail2.rotationPointX = this.tail2.rotationPointX + (float)(xx);
        this.tail2.rotationPointY = this.tail2.rotationPointY - (float)(yy);
        this.tail2.rotationPointZ = this.tail2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (-3.72708-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (-10.66379-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (5.76669-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 15) {
            xx = -3.72708 + (((tickAnim - 8) / 7) * (11.13606-(-3.72708)));
            yy = -10.66379 + (((tickAnim - 8) / 7) * (23.74028-(-10.66379)));
            zz = 5.76669 + (((tickAnim - 8) / 7) * (0.74387-(5.76669)));
        }
        else if (tickAnim >= 15 && tickAnim < 25) {
            xx = 11.13606 + (((tickAnim - 15) / 10) * (0-(11.13606)));
            yy = 23.74028 + (((tickAnim - 15) / 10) * (0-(23.74028)));
            zz = 0.74387 + (((tickAnim - 15) / 10) * (0-(0.74387)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(xx), tail3.rotateAngleY + (float) Math.toRadians(yy), tail3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 4) * (-9.5-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 4) / 5) * (2.81055-(0)));
            yy = -9.5 + (((tickAnim - 4) / 5) * (-8.01914-(-9.5)));
            zz = 0 + (((tickAnim - 4) / 5) * (6.59715-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 15) {
            xx = 2.81055 + (((tickAnim - 9) / 6) * (12.67998-(2.81055)));
            yy = -8.01914 + (((tickAnim - 9) / 6) * (32.7493-(-8.01914)));
            zz = 6.59715 + (((tickAnim - 9) / 6) * (-0.16636-(6.59715)));
        }
        else if (tickAnim >= 15 && tickAnim < 18) {
            xx = 12.67998 + (((tickAnim - 15) / 3) * (7.71788-(12.67998)));
            yy = 32.7493 + (((tickAnim - 15) / 3) * (13.33315-(32.7493)));
            zz = -0.16636 + (((tickAnim - 15) / 3) * (-0.04349-(-0.16636)));
        }
        else if (tickAnim >= 18 && tickAnim < 25) {
            xx = 7.71788 + (((tickAnim - 18) / 7) * (0-(7.71788)));
            yy = 13.33315 + (((tickAnim - 18) / 7) * (0-(13.33315)));
            zz = -0.04349 + (((tickAnim - 18) / 7) * (0-(-0.04349)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(xx), tail4.rotateAngleY + (float) Math.toRadians(yy), tail4.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 9 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 9) / 6) * (0.275-(0)));
            yy = 0 + (((tickAnim - 9) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 6) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 25) {
            xx = 0.275 + (((tickAnim - 15) / 10) * (0-(0.275)));
            yy = 0 + (((tickAnim - 15) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 10) * (0-(0)));
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
            xx = 0 + (((tickAnim - 0) / 2) * (1.5806-(0)));
            yy = 0 + (((tickAnim - 0) / 2) * (0.41562-(0)));
            zz = 0 + (((tickAnim - 0) / 2) * (-0.08104-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 4) {
            xx = 1.5806 + (((tickAnim - 2) / 2) * (3.1395-(1.5806)));
            yy = 0.41562 + (((tickAnim - 2) / 2) * (-9.15091-(0.41562)));
            zz = -0.08104 + (((tickAnim - 2) / 2) * (0.4355-(-0.08104)));
        }
        else if (tickAnim >= 4 && tickAnim < 9) {
            xx = 3.1395 + (((tickAnim - 4) / 5) * (5.84525-(3.1395)));
            yy = -9.15091 + (((tickAnim - 4) / 5) * (-3.71637-(-9.15091)));
            zz = 0.4355 + (((tickAnim - 4) / 5) * (7.38393-(0.4355)));
        }
        else if (tickAnim >= 9 && tickAnim < 12) {
            xx = 5.84525 + (((tickAnim - 9) / 3) * (8.20563-(5.84525)));
            yy = -3.71637 + (((tickAnim - 9) / 3) * (1.20879-(-3.71637)));
            zz = 7.38393 + (((tickAnim - 9) / 3) * (-0.04504-(7.38393)));
        }
        else if (tickAnim >= 12 && tickAnim < 15) {
            xx = 8.20563 + (((tickAnim - 12) / 3) * (14.07178-(8.20563)));
            yy = 1.20879 + (((tickAnim - 12) / 3) * (16.73843-(1.20879)));
            zz = -0.04504 + (((tickAnim - 12) / 3) * (0.27291-(-0.04504)));
        }
        else if (tickAnim >= 15 && tickAnim < 19) {
            xx = 14.07178 + (((tickAnim - 15) / 4) * (9.74324-(14.07178)));
            yy = 16.73843 + (((tickAnim - 15) / 4) * (11.57186-(16.73843)));
            zz = 0.27291 + (((tickAnim - 15) / 4) * (0.25973-(0.27291)));
        }
        else if (tickAnim >= 19 && tickAnim < 25) {
            xx = 9.74324 + (((tickAnim - 19) / 6) * (0-(9.74324)));
            yy = 11.57186 + (((tickAnim - 19) / 6) * (0-(11.57186)));
            zz = 0.25973 + (((tickAnim - 19) / 6) * (0-(0.25973)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail5, tail5.rotateAngleX + (float) Math.toRadians(xx), tail5.rotateAngleY + (float) Math.toRadians(yy), tail5.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 0) / 2) * (3.18307-(0)));
            yy = 0 + (((tickAnim - 0) / 2) * (1.93444-(0)));
            zz = 0 + (((tickAnim - 0) / 2) * (-0.40674-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 4) {
            xx = 3.18307 + (((tickAnim - 2) / 2) * (6.13847-(3.18307)));
            yy = 1.93444 + (((tickAnim - 2) / 2) * (-16.19475-(1.93444)));
            zz = -0.40674 + (((tickAnim - 2) / 2) * (3.40526-(-0.40674)));
        }
        else if (tickAnim >= 4 && tickAnim < 9) {
            xx = 6.13847 + (((tickAnim - 4) / 5) * (11.94642-(6.13847)));
            yy = -16.19475 + (((tickAnim - 4) / 5) * (-7.52543-(-16.19475)));
            zz = 3.40526 + (((tickAnim - 4) / 5) * (7.58462-(3.40526)));
        }
        else if (tickAnim >= 9 && tickAnim < 12) {
            xx = 11.94642 + (((tickAnim - 9) / 3) * (16.54501-(11.94642)));
            yy = -7.52543 + (((tickAnim - 9) / 3) * (-11.12794-(-7.52543)));
            zz = 7.58462 + (((tickAnim - 9) / 3) * (0.37246-(7.58462)));
        }
        else if (tickAnim >= 12 && tickAnim < 15) {
            xx = 16.54501 + (((tickAnim - 12) / 3) * (25.11848-(16.54501)));
            yy = -11.12794 + (((tickAnim - 12) / 3) * (21.5146-(-11.12794)));
            zz = 0.37246 + (((tickAnim - 12) / 3) * (-0.33465-(0.37246)));
        }
        else if (tickAnim >= 15 && tickAnim < 19) {
            xx = 25.11848 + (((tickAnim - 15) / 4) * (21.19424-(25.11848)));
            yy = 21.5146 + (((tickAnim - 15) / 4) * (21.23588-(21.5146)));
            zz = -0.33465 + (((tickAnim - 15) / 4) * (-1.30454-(-0.33465)));
        }
        else if (tickAnim >= 19 && tickAnim < 25) {
            xx = 21.19424 + (((tickAnim - 19) / 6) * (0-(21.19424)));
            yy = 21.23588 + (((tickAnim - 19) / 6) * (0-(21.23588)));
            zz = -1.30454 + (((tickAnim - 19) / 6) * (0-(-1.30454)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail6, tail6.rotateAngleX + (float) Math.toRadians(xx), tail6.rotateAngleY + (float) Math.toRadians(yy), tail6.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0.62292 + (((tickAnim - 0) / 15) * (1.26363-(0.62292)));
            yy = -6.3161+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-120))*3.5 + (((tickAnim - 0) / 15) * (-1.0067+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-150))*3-(-6.3161+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-120))*3.5)));
            zz = -3.797+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+50))*1 + (((tickAnim - 0) / 15) * (0.1691+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+50))*1-(-3.797+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+50))*1)));
        }
        else if (tickAnim >= 15 && tickAnim < 25) {
            xx = 1.26363 + (((tickAnim - 15) / 10) * (0.58059-(1.26363)));
            yy = -1.0067+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-150))*3 + (((tickAnim - 15) / 10) * (-12.4129+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-120))*3.5-(-1.0067+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-150))*3)));
            zz = 0.1691+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+50))*1 + (((tickAnim - 15) / 10) * (-2.112+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+50))*1-(0.1691+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+50))*1)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck4, neck4.rotateAngleX + (float) Math.toRadians(xx), neck4.rotateAngleY + (float) Math.toRadians(yy), neck4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (21.61615-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (-18.16673-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (-8.41459-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 19) {
            xx = 21.61615 + (((tickAnim - 15) / 4) * (4.55807-(21.61615)));
            yy = -18.16673 + (((tickAnim - 15) / 4) * (-9.08336-(-18.16673)));
            zz = -8.41459 + (((tickAnim - 15) / 4) * (-4.2073-(-8.41459)));
        }
        else if (tickAnim >= 19 && tickAnim < 25) {
            xx = 4.55807 + (((tickAnim - 19) / 6) * (0-(4.55807)));
            yy = -9.08336 + (((tickAnim - 19) / 6) * (0-(-9.08336)));
            zz = -4.2073 + (((tickAnim - 19) / 6) * (0-(-4.2073)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backleftleg, backleftleg.rotateAngleX + (float) Math.toRadians(xx), backleftleg.rotateAngleY + (float) Math.toRadians(yy), backleftleg.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (1.625-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 15) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 15) / 4) * (2.075-(0)));
            zz = 1.625 + (((tickAnim - 15) / 4) * (0-(1.625)));
        }
        else if (tickAnim >= 19 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 19) / 6) * (0-(0)));
            yy = 2.075 + (((tickAnim - 19) / 6) * (0-(2.075)));
            zz = 0 + (((tickAnim - 19) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.backleftleg.rotationPointX = this.backleftleg.rotationPointX + (float)(xx);
        this.backleftleg.rotationPointY = this.backleftleg.rotationPointY - (float)(yy);
        this.backleftleg.rotationPointZ = this.backleftleg.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (-11.25-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (6-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 19) {
            xx = -11.25 + (((tickAnim - 15) / 4) * (2.875-(-11.25)));
            yy = 0 + (((tickAnim - 15) / 4) * (0-(0)));
            zz = 6 + (((tickAnim - 15) / 4) * (3-(6)));
        }
        else if (tickAnim >= 19 && tickAnim < 25) {
            xx = 2.875 + (((tickAnim - 19) / 6) * (0-(2.875)));
            yy = 0 + (((tickAnim - 19) / 6) * (0-(0)));
            zz = 3 + (((tickAnim - 19) / 6) * (0-(3)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backleftleg2, backleftleg2.rotateAngleX + (float) Math.toRadians(xx), backleftleg2.rotateAngleY + (float) Math.toRadians(yy), backleftleg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (2.29488-(0)));
            yy = 0 + (((tickAnim - 0) / 4) * (2.73091-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0.30961-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 15) {
            xx = 2.29488 + (((tickAnim - 4) / 11) * (-1.27167-(2.29488)));
            yy = 2.73091 + (((tickAnim - 4) / 11) * (-28.10503-(2.73091)));
            zz = 0.30961 + (((tickAnim - 4) / 11) * (-3.67888-(0.30961)));
        }
        else if (tickAnim >= 15 && tickAnim < 25) {
            xx = -1.27167 + (((tickAnim - 15) / 10) * (0-(-1.27167)));
            yy = -28.10503 + (((tickAnim - 15) / 10) * (0-(-28.10503)));
            zz = -3.67888 + (((tickAnim - 15) / 10) * (0-(-3.67888)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backrightleg, backrightleg.rotateAngleX + (float) Math.toRadians(xx), backrightleg.rotateAngleY + (float) Math.toRadians(yy), backrightleg.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (-0.55-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (-2.275-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 15) / 10) * (0-(0)));
            yy = -0.55 + (((tickAnim - 15) / 10) * (0-(-0.55)));
            zz = -2.275 + (((tickAnim - 15) / 10) * (0-(-2.275)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.backrightleg.rotationPointX = this.backrightleg.rotationPointX + (float)(xx);
        this.backrightleg.rotationPointY = this.backrightleg.rotationPointY - (float)(yy);
        this.backrightleg.rotationPointZ = this.backrightleg.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (1.40478-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0.5571-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (-3.10573-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 25) {
            xx = 1.40478 + (((tickAnim - 15) / 10) * (0-(1.40478)));
            yy = 0.5571 + (((tickAnim - 15) / 10) * (0-(0.5571)));
            zz = -3.10573 + (((tickAnim - 15) / 10) * (0-(-3.10573)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backrightleg2, backrightleg2.rotateAngleX + (float) Math.toRadians(xx), backrightleg2.rotateAngleY + (float) Math.toRadians(yy), backrightleg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (-12.5-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 25) {
            xx = -12.5 + (((tickAnim - 15) / 10) * (0-(-12.5)));
            yy = 0 + (((tickAnim - 15) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backrightleg3, backrightleg3.rotateAngleX + (float) Math.toRadians(xx), backrightleg3.rotateAngleY + (float) Math.toRadians(yy), backrightleg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (-0.325-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0.925-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 15) / 10) * (0-(0)));
            yy = -0.325 + (((tickAnim - 15) / 10) * (0-(-0.325)));
            zz = 0.925 + (((tickAnim - 15) / 10) * (0-(0.925)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.backrightleg3.rotationPointX = this.backrightleg3.rotationPointX + (float)(xx);
        this.backrightleg3.rotationPointY = this.backrightleg3.rotationPointY - (float)(yy);
        this.backrightleg3.rotationPointZ = this.backrightleg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (13.25-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 25) {
            xx = 13.25 + (((tickAnim - 15) / 10) * (0-(13.25)));
            yy = 0 + (((tickAnim - 15) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backrightleg4, backrightleg4.rotateAngleX + (float) Math.toRadians(xx), backrightleg4.rotateAngleY + (float) Math.toRadians(yy), backrightleg4.rotateAngleZ + (float) Math.toRadians(zz));

        this.backrightleg4.rotationPointX = this.backrightleg4.rotationPointX + (float)(0);
        this.backrightleg4.rotationPointY = this.backrightleg4.rotationPointY - (float)(-0.575);
        this.backrightleg4.rotationPointZ = this.backrightleg4.rotationPointZ + (float)(0);



        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (5-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 25) {
            xx = 5 + (((tickAnim - 15) / 10) * (0-(5)));
            yy = 0 + (((tickAnim - 15) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(xx), jaw.rotateAngleY + (float) Math.toRadians(yy), jaw.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (2-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 4) / 11) * (9.5-(0)));
            yy = 0 + (((tickAnim - 4) / 11) * (0-(0)));
            zz = 2 + (((tickAnim - 4) / 11) * (-10.25-(2)));
        }
        else if (tickAnim >= 15 && tickAnim < 25) {
            xx = 9.5 + (((tickAnim - 15) / 10) * (0-(9.5)));
            yy = 0 + (((tickAnim - 15) / 10) * (0-(0)));
            zz = -10.25 + (((tickAnim - 15) / 10) * (0-(-10.25)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontleftleg, frontleftleg.rotateAngleX + (float) Math.toRadians(xx), frontleftleg.rotateAngleY + (float) Math.toRadians(yy), frontleftleg.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 4) / 11) * (0-(0)));
            yy = 0 + (((tickAnim - 4) / 11) * (1-(0)));
            zz = 0 + (((tickAnim - 4) / 11) * (-0.825-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 15) / 10) * (0-(0)));
            yy = 1 + (((tickAnim - 15) / 10) * (0-(1)));
            zz = -0.825 + (((tickAnim - 15) / 10) * (0-(-0.825)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.frontleftleg.rotationPointX = this.frontleftleg.rotationPointX + (float)(xx);
        this.frontleftleg.rotationPointY = this.frontleftleg.rotationPointY - (float)(yy);
        this.frontleftleg.rotationPointZ = this.frontleftleg.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (-7.5-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 4) / 11) * (-36.30206-(0)));
            yy = 0 + (((tickAnim - 4) / 11) * (7.40955-(0)));
            zz = -7.5 + (((tickAnim - 4) / 11) * (2.22949-(-7.5)));
        }
        else if (tickAnim >= 15 && tickAnim < 25) {
            xx = -36.30206 + (((tickAnim - 15) / 10) * (0-(-36.30206)));
            yy = 7.40955 + (((tickAnim - 15) / 10) * (0-(7.40955)));
            zz = 2.22949 + (((tickAnim - 15) / 10) * (0-(2.22949)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontleftleg2, frontleftleg2.rotateAngleX + (float) Math.toRadians(xx), frontleftleg2.rotateAngleY + (float) Math.toRadians(yy), frontleftleg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 4) / 11) * (-0.375-(0)));
            yy = 0 + (((tickAnim - 4) / 11) * (0.65-(0)));
            zz = 0 + (((tickAnim - 4) / 11) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 25) {
            xx = -0.375 + (((tickAnim - 15) / 10) * (0-(-0.375)));
            yy = 0.65 + (((tickAnim - 15) / 10) * (0-(0.65)));
            zz = 0 + (((tickAnim - 15) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.frontleftleg2.rotationPointX = this.frontleftleg2.rotationPointX + (float)(xx);
        this.frontleftleg2.rotationPointY = this.frontleftleg2.rotationPointY - (float)(yy);
        this.frontleftleg2.rotationPointZ = this.frontleftleg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (0.17851-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (2.49487-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (3.0335-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 25) {
            xx = 0.17851 + (((tickAnim - 15) / 10) * (0-(0.17851)));
            yy = 2.49487 + (((tickAnim - 15) / 10) * (0-(2.49487)));
            zz = 3.0335 + (((tickAnim - 15) / 10) * (0-(3.0335)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontrightleg, frontrightleg.rotateAngleX + (float) Math.toRadians(xx), frontrightleg.rotateAngleY + (float) Math.toRadians(yy), frontrightleg.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 4) * (-0.625-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 4) / 11) * (0-(0)));
            yy = -0.625 + (((tickAnim - 4) / 11) * (0.605-(-0.625)));
            zz = 0 + (((tickAnim - 4) / 11) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 15) / 10) * (0-(0)));
            yy = 0.605 + (((tickAnim - 15) / 10) * (0-(0.605)));
            zz = 0 + (((tickAnim - 15) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.frontrightleg.rotationPointX = this.frontrightleg.rotationPointX + (float)(xx);
        this.frontrightleg.rotationPointY = this.frontrightleg.rotationPointY - (float)(yy);
        this.frontrightleg.rotationPointZ = this.frontrightleg.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (-15.85115-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (-8.6028-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0.97215-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 25) {
            xx = -15.85115 + (((tickAnim - 15) / 10) * (0-(-15.85115)));
            yy = -8.6028 + (((tickAnim - 15) / 10) * (0-(-8.6028)));
            zz = 0.97215 + (((tickAnim - 15) / 10) * (0-(0.97215)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontrightleg2, frontrightleg2.rotateAngleX + (float) Math.toRadians(xx), frontrightleg2.rotateAngleY + (float) Math.toRadians(yy), frontrightleg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (0.325-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (-0.725-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (-0.225-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 25) {
            xx = 0.325 + (((tickAnim - 15) / 10) * (0-(0.325)));
            yy = -0.725 + (((tickAnim - 15) / 10) * (0-(-0.725)));
            zz = -0.225 + (((tickAnim - 15) / 10) * (0-(-0.225)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.frontrightleg2.rotationPointX = this.frontrightleg2.rotationPointX + (float)(xx);
        this.frontrightleg2.rotationPointY = this.frontrightleg2.rotationPointY - (float)(yy);
        this.frontrightleg2.rotationPointZ = this.frontrightleg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (15.25-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 25) {
            xx = 15.25 + (((tickAnim - 15) / 10) * (0-(15.25)));
            yy = 0 + (((tickAnim - 15) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontrightleg3, frontrightleg3.rotateAngleX + (float) Math.toRadians(xx), frontrightleg3.rotateAngleY + (float) Math.toRadians(yy), frontrightleg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0.525-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 15) / 10) * (0-(0)));
            yy = 0.525 + (((tickAnim - 15) / 10) * (0-(0.525)));
            zz = 0 + (((tickAnim - 15) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.frontrightleg3.rotationPointX = this.frontrightleg3.rotationPointX + (float)(xx);
        this.frontrightleg3.rotationPointY = this.frontrightleg3.rotationPointY - (float)(yy);
        this.frontrightleg3.rotationPointZ = this.frontrightleg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (-5-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 19) {
            xx = -5 + (((tickAnim - 15) / 4) * (13.5-(-5)));
            yy = 0 + (((tickAnim - 15) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 4) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 23) {
            xx = 13.5 + (((tickAnim - 19) / 4) * (-0.71-(13.5)));
            yy = 0 + (((tickAnim - 19) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 19) / 4) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 25) {
            xx = -0.71 + (((tickAnim - 23) / 2) * (0-(-0.71)));
            yy = 0 + (((tickAnim - 23) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backleftleg4, backleftleg4.rotateAngleX + (float) Math.toRadians(xx), backleftleg4.rotateAngleY + (float) Math.toRadians(yy), backleftleg4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 4) / 11) * (71.25-(0)));
            yy = 0 + (((tickAnim - 4) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 11) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 21) {
            xx = 71.25 + (((tickAnim - 15) / 6) * (-5.59-(71.25)));
            yy = 0 + (((tickAnim - 15) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 6) * (0-(0)));
        }
        else if (tickAnim >= 21 && tickAnim < 25) {
            xx = -5.59 + (((tickAnim - 21) / 4) * (0-(-5.59)));
            yy = 0 + (((tickAnim - 21) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 21) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontleftleg3, frontleftleg3.rotateAngleX + (float) Math.toRadians(xx), frontleftleg3.rotateAngleY + (float) Math.toRadians(yy), frontleftleg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 4) / 11) * (0-(0)));
            yy = 0 + (((tickAnim - 4) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 11) * (-1.05-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 15) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 15) / 10) * (0-(0)));
            zz = -1.05 + (((tickAnim - 15) / 10) * (0-(-1.05)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.frontleftleg3.rotationPointX = this.frontleftleg3.rotationPointX + (float)(xx);
        this.frontleftleg3.rotationPointY = this.frontleftleg3.rotationPointY - (float)(yy);
        this.frontleftleg3.rotationPointZ = this.frontleftleg3.rotationPointZ + (float)(zz);


    }

    public void animWalking(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraMiragaia entity = (EntityPrehistoricFloraMiragaia) entitylivingbaseIn;

        int animCycle = 40;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;

        this.setRotateAngle(body2, body2.rotateAngleX + (float) Math.toRadians(-2.25+Math.sin((Math.PI/180)*(135/0.75-10))*2), body2.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*135/0.75+150))*-1), body2.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*135/0.75+180))*1));

        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (-0.075-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 3) / 4) * (0-(0)));
            yy = -0.075 + (((tickAnim - 3) / 4) * (0-(-0.075)));
            zz = 0 + (((tickAnim - 3) / 4) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 7) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 7) / 3) * (-0.075-(0)));
            zz = 0 + (((tickAnim - 7) / 3) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            yy = -0.075 + (((tickAnim - 10) / 3) * (0-(-0.075)));
            zz = 0 + (((tickAnim - 10) / 3) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 13) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 13) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 5) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 21) {
            xx = 0 + (((tickAnim - 18) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 18) / 3) * (-0.075-(0)));
            zz = 0 + (((tickAnim - 18) / 3) * (0-(0)));
        }
        else if (tickAnim >= 21 && tickAnim < 24) {
            xx = 0 + (((tickAnim - 21) / 3) * (0-(0)));
            yy = -0.075 + (((tickAnim - 21) / 3) * (0-(-0.075)));
            zz = 0 + (((tickAnim - 21) / 3) * (0-(0)));
        }
        else if (tickAnim >= 24 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 24) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 24) / 4) * (-0.075-(0)));
            zz = 0 + (((tickAnim - 24) / 4) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 31) {
            xx = 0 + (((tickAnim - 28) / 3) * (0-(0)));
            yy = -0.075 + (((tickAnim - 28) / 3) * (0-(-0.075)));
            zz = 0 + (((tickAnim - 28) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.body2.rotationPointX = this.body2.rotationPointX + (float)(xx);
        this.body2.rotationPointY = this.body2.rotationPointY - (float)(yy);
        this.body2.rotationPointZ = this.body2.rotationPointZ + (float)(zz);



        this.setRotateAngle(upperbody, upperbody.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*135/0.75-360))*1), upperbody.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*135/0.75+50))*2), upperbody.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*135/0.75-120))*1));


        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-10))*0.5), neck2.rotateAngleY + (float) Math.toRadians(0), neck2.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*135/0.75-150))*1));


        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(0), body.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*135/0.75-55))*1), body.rotateAngleZ + (float) Math.toRadians(0));



        if (tickAnim >= 0 && tickAnim < 18) {
            xx = -8 + (((tickAnim - 0) / 18) * (18-(-8)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 28) {
            xx = 18 + (((tickAnim - 18) / 10) * (3-(18)));
            yy = 0 + (((tickAnim - 18) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 10) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 40) {
            xx = 3 + (((tickAnim - 28) / 12) * (-8-(3)));
            yy = 0 + (((tickAnim - 28) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backleftleg, backleftleg.rotateAngleX + (float) Math.toRadians(xx), backleftleg.rotateAngleY + (float) Math.toRadians(yy), backleftleg.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (-0.075-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 3) / 5) * (0-(0)));
            yy = -0.075 + (((tickAnim - 3) / 5) * (0.3-(-0.075)));
            zz = 0 + (((tickAnim - 3) / 5) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 8) / 3) * (0-(0)));
            yy = 0.3 + (((tickAnim - 8) / 3) * (-0.075-(0.3)));
            zz = 0 + (((tickAnim - 8) / 3) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 11) / 3) * (0-(0)));
            yy = -0.075 + (((tickAnim - 11) / 3) * (0.325-(-0.075)));
            zz = 0 + (((tickAnim - 11) / 3) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 14) / 4) * (0-(0)));
            yy = 0.325 + (((tickAnim - 14) / 4) * (-0.075-(0.325)));
            zz = 0 + (((tickAnim - 14) / 4) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 18) / 5) * (0-(0)));
            yy = -0.075 + (((tickAnim - 18) / 5) * (0.9-(-0.075)));
            zz = 0 + (((tickAnim - 18) / 5) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 23) / 5) * (0-(0)));
            yy = 0.9 + (((tickAnim - 23) / 5) * (1.2-(0.9)));
            zz = 0 + (((tickAnim - 23) / 5) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 28) / 12) * (0-(0)));
            yy = 1.2 + (((tickAnim - 28) / 12) * (0-(1.2)));
            zz = 0 + (((tickAnim - 28) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.backleftleg.rotationPointX = this.backleftleg.rotationPointX + (float)(xx);
        this.backleftleg.rotationPointY = this.backleftleg.rotationPointY - (float)(yy);
        this.backleftleg.rotationPointZ = this.backleftleg.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (1-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 28) {
            xx = 1 + (((tickAnim - 18) / 10) * (13-(1)));
            yy = 0 + (((tickAnim - 18) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 10) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 40) {
            xx = 13 + (((tickAnim - 28) / 12) * (0-(13)));
            yy = 0 + (((tickAnim - 28) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backleftleg2, backleftleg2.rotateAngleX + (float) Math.toRadians(xx), backleftleg2.rotateAngleY + (float) Math.toRadians(yy), backleftleg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0.05 + (((tickAnim - 0) / 18) * (0-(0.05)));
            yy = -0.325 + (((tickAnim - 0) / 18) * (-0.3-(-0.325)));
            zz = 0.1 + (((tickAnim - 0) / 18) * (0-(0.1)));
        }
        else if (tickAnim >= 18 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 18) / 10) * (-0.175-(0)));
            yy = -0.3 + (((tickAnim - 18) / 10) * (-0.125-(-0.3)));
            zz = 0 + (((tickAnim - 18) / 10) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 40) {
            xx = -0.175 + (((tickAnim - 28) / 12) * (0.05-(-0.175)));
            yy = -0.125 + (((tickAnim - 28) / 12) * (-0.325-(-0.125)));
            zz = 0 + (((tickAnim - 28) / 12) * (0.1-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.backleftleg2.rotationPointX = this.backleftleg2.rotationPointX + (float)(xx);
        this.backleftleg2.rotationPointY = this.backleftleg2.rotationPointY - (float)(yy);
        this.backleftleg2.rotationPointZ = this.backleftleg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 6 + (((tickAnim - 0) / 18) * (4.29-(6)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 23) {
            xx = 4.29 + (((tickAnim - 18) / 5) * (-7-(4.29)));
            yy = 0 + (((tickAnim - 18) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 5) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 32) {
            xx = -7 + (((tickAnim - 23) / 9) * (-17-(-7)));
            yy = 0 + (((tickAnim - 23) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 9) * (0-(0)));
        }
        else if (tickAnim >= 32 && tickAnim < 40) {
            xx = -17 + (((tickAnim - 32) / 8) * (6-(-17)));
            yy = 0 + (((tickAnim - 32) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 32) / 8) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backleftleg3, backleftleg3.rotateAngleX + (float) Math.toRadians(xx), backleftleg3.rotateAngleY + (float) Math.toRadians(yy), backleftleg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            yy = 1.3 + (((tickAnim - 0) / 18) * (-0.32-(1.3)));
            zz = 0 + (((tickAnim - 0) / 18) * (-0.025-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 18) / 10) * (0-(0)));
            yy = -0.32 + (((tickAnim - 18) / 10) * (-0.4-(-0.32)));
            zz = -0.025 + (((tickAnim - 18) / 10) * (0.925-(-0.025)));
        }
        else if (tickAnim >= 28 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 28) / 12) * (0-(0)));
            yy = -0.4 + (((tickAnim - 28) / 12) * (1.3-(-0.4)));
            zz = 0.925 + (((tickAnim - 28) / 12) * (0-(0.925)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.backleftleg3.rotationPointX = this.backleftleg3.rotationPointX + (float)(xx);
        this.backleftleg3.rotationPointY = this.backleftleg3.rotationPointY - (float)(yy);
        this.backleftleg3.rotationPointZ = this.backleftleg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 1 + (((tickAnim - 0) / 18) * (-24-(1)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 28) {
            xx = -24 + (((tickAnim - 18) / 10) * (13.16-(-24)));
            yy = 0 + (((tickAnim - 18) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 10) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 37) {
            xx = 13.16 + (((tickAnim - 28) / 9) * (-13.18-(13.16)));
            yy = 0 + (((tickAnim - 28) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 9) * (0-(0)));
        }
        else if (tickAnim >= 37 && tickAnim < 40) {
            xx = -13.18 + (((tickAnim - 37) / 3) * (1-(-13.18)));
            yy = 0 + (((tickAnim - 37) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 37) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backleftleg4, backleftleg4.rotateAngleX + (float) Math.toRadians(xx), backleftleg4.rotateAngleY + (float) Math.toRadians(yy), backleftleg4.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = -1 + (((tickAnim - 0) / 5) * (-0.6-(-1)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 5) / 8) * (0-(0)));
            yy = -0.6 + (((tickAnim - 5) / 8) * (-0.57-(-0.6)));
            zz = 0 + (((tickAnim - 5) / 8) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 13) / 5) * (0-(0)));
            yy = -0.57 + (((tickAnim - 13) / 5) * (-1.7-(-0.57)));
            zz = 0 + (((tickAnim - 13) / 5) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 18) / 10) * (0-(0)));
            yy = -1.7 + (((tickAnim - 18) / 10) * (-0.43-(-1.7)));
            zz = 0 + (((tickAnim - 18) / 10) * (0.425-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 28) / 12) * (0-(0)));
            yy = -0.43 + (((tickAnim - 28) / 12) * (-1-(-0.43)));
            zz = 0.425 + (((tickAnim - 28) / 12) * (0-(0.425)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.backleftleg4.rotationPointX = this.backleftleg4.rotationPointX + (float)(xx);
        this.backleftleg4.rotationPointY = this.backleftleg4.rotationPointY - (float)(yy);
        this.backleftleg4.rotationPointZ = this.backleftleg4.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 18 + (((tickAnim - 0) / 8) * (3-(18)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 18) {
            xx = 3 + (((tickAnim - 8) / 10) * (-7-(3)));
            yy = 0 + (((tickAnim - 8) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 10) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 40) {
            xx = -7 + (((tickAnim - 18) / 22) * (18-(-7)));
            yy = 0 + (((tickAnim - 18) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 22) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backrightleg, backrightleg.rotateAngleX + (float) Math.toRadians(xx), backrightleg.rotateAngleY + (float) Math.toRadians(yy), backrightleg.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            yy = -0.75 + (((tickAnim - 0) / 4) * (0.9-(-0.75)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 4) / 4) * (0-(0)));
            yy = 0.9 + (((tickAnim - 4) / 4) * (1.2-(0.9)));
            zz = 0 + (((tickAnim - 4) / 4) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 8) / 10) * (0-(0)));
            yy = 1.2 + (((tickAnim - 8) / 10) * (0-(1.2)));
            zz = 0 + (((tickAnim - 8) / 10) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 18) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 18) / 5) * (-0.075-(0)));
            zz = 0 + (((tickAnim - 18) / 5) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 26) {
            xx = 0 + (((tickAnim - 23) / 3) * (0-(0)));
            yy = -0.075 + (((tickAnim - 23) / 3) * (0.25-(-0.075)));
            zz = 0 + (((tickAnim - 23) / 3) * (0-(0)));
        }
        else if (tickAnim >= 26 && tickAnim < 29) {
            xx = 0 + (((tickAnim - 26) / 3) * (0-(0)));
            yy = 0.25 + (((tickAnim - 26) / 3) * (-0.075-(0.25)));
            zz = 0 + (((tickAnim - 26) / 3) * (0-(0)));
        }
        else if (tickAnim >= 29 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 29) / 4) * (0-(0)));
            yy = -0.075 + (((tickAnim - 29) / 4) * (0.25-(-0.075)));
            zz = 0 + (((tickAnim - 29) / 4) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 37) {
            xx = 0 + (((tickAnim - 33) / 4) * (0-(0)));
            yy = 0.25 + (((tickAnim - 33) / 4) * (-0.075-(0.25)));
            zz = 0 + (((tickAnim - 33) / 4) * (0-(0)));
        }
        else if (tickAnim >= 37 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 37) / 3) * (0-(0)));
            yy = -0.075 + (((tickAnim - 37) / 3) * (-0.75-(-0.075)));
            zz = 0 + (((tickAnim - 37) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.backrightleg.rotationPointX = this.backrightleg.rotationPointX + (float)(xx);
        this.backrightleg.rotationPointY = this.backrightleg.rotationPointY - (float)(yy);
        this.backrightleg.rotationPointZ = this.backrightleg.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 1 + (((tickAnim - 0) / 6) * (13-(1)));
            yy = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 15) {
            xx = 13 + (((tickAnim - 6) / 9) * (0-(13)));
            yy = 0 + (((tickAnim - 6) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 9) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 15) / 25) * (1-(0)));
            yy = 0 + (((tickAnim - 15) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 25) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backrightleg2, backrightleg2.rotateAngleX + (float) Math.toRadians(xx), backrightleg2.rotateAngleY + (float) Math.toRadians(yy), backrightleg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 0) / 6) * (-0.15-(0)));
            yy = -0.25 + (((tickAnim - 0) / 6) * (-0.125-(-0.25)));
            zz = 0 + (((tickAnim - 0) / 6) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = -0.15 + (((tickAnim - 6) / 2) * (-0.16-(-0.15)));
            yy = -0.125 + (((tickAnim - 6) / 2) * (-0.355-(-0.125)));
            zz = 0 + (((tickAnim - 6) / 2) * (0.03-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 15) {
            xx = -0.16 + (((tickAnim - 8) / 7) * (0.05-(-0.16)));
            yy = -0.355 + (((tickAnim - 8) / 7) * (-0.325-(-0.355)));
            zz = 0.03 + (((tickAnim - 8) / 7) * (0.1-(0.03)));
        }
        else if (tickAnim >= 15 && tickAnim < 40) {
            xx = 0.05 + (((tickAnim - 15) / 25) * (0-(0.05)));
            yy = -0.325 + (((tickAnim - 15) / 25) * (-0.25-(-0.325)));
            zz = 0.1 + (((tickAnim - 15) / 25) * (0-(0.1)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.backrightleg2.rotationPointX = this.backrightleg2.rotationPointX + (float)(xx);
        this.backrightleg2.rotationPointY = this.backrightleg2.rotationPointY - (float)(yy);
        this.backrightleg2.rotationPointZ = this.backrightleg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = -7 + (((tickAnim - 0) / 8) * (-17-(-7)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 18) {
            xx = -17 + (((tickAnim - 8) / 10) * (6-(-17)));
            yy = 0 + (((tickAnim - 8) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 10) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 40) {
            xx = 6 + (((tickAnim - 18) / 22) * (-7-(6)));
            yy = 0 + (((tickAnim - 18) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 22) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backrightleg3, backrightleg3.rotateAngleX + (float) Math.toRadians(xx), backrightleg3.rotateAngleY + (float) Math.toRadians(yy), backrightleg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            yy = -0.35 + (((tickAnim - 0) / 8) * (-0.53-(-0.35)));
            zz = 0.75 + (((tickAnim - 0) / 8) * (1.135-(0.75)));
        }
        else if (tickAnim >= 8 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 8) / 10) * (0-(0)));
            yy = -0.53 + (((tickAnim - 8) / 10) * (1.3-(-0.53)));
            zz = 1.135 + (((tickAnim - 8) / 10) * (0-(1.135)));
        }
        else if (tickAnim >= 18 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 18) / 22) * (0-(0)));
            yy = 1.3 + (((tickAnim - 18) / 22) * (-0.35-(1.3)));
            zz = 0 + (((tickAnim - 18) / 22) * (0.75-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.backrightleg3.rotationPointX = this.backrightleg3.rotationPointX + (float)(xx);
        this.backrightleg3.rotationPointY = this.backrightleg3.rotationPointY - (float)(yy);
        this.backrightleg3.rotationPointZ = this.backrightleg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = -12 + (((tickAnim - 0) / 8) * (17.91-(-12)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 15) {
            xx = 17.91 + (((tickAnim - 8) / 7) * (-9.75-(17.91)));
            yy = 0 + (((tickAnim - 8) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 7) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 18) {
            xx = -9.75 + (((tickAnim - 15) / 3) * (1-(-9.75)));
            yy = 0 + (((tickAnim - 15) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 3) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 40) {
            xx = 1 + (((tickAnim - 18) / 22) * (-12-(1)));
            yy = 0 + (((tickAnim - 18) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 22) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backrightleg4, backrightleg4.rotateAngleX + (float) Math.toRadians(xx), backrightleg4.rotateAngleY + (float) Math.toRadians(yy), backrightleg4.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            yy = -1.45 + (((tickAnim - 0) / 8) * (-0.025-(-1.45)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 8) / 10) * (0-(0)));
            yy = -0.025 + (((tickAnim - 8) / 10) * (-1-(-0.025)));
            zz = 0 + (((tickAnim - 8) / 10) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 29) {
            xx = 0 + (((tickAnim - 18) / 11) * (0-(0)));
            yy = -1 + (((tickAnim - 18) / 11) * (-1-(-1)));
            zz = 0 + (((tickAnim - 18) / 11) * (0-(0)));
        }
        else if (tickAnim >= 29 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 29) / 11) * (0-(0)));
            yy = -1 + (((tickAnim - 29) / 11) * (-1.45-(-1)));
            zz = 0 + (((tickAnim - 29) / 11) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.backrightleg4.rotationPointX = this.backrightleg4.rotationPointX + (float)(xx);
        this.backrightleg4.rotationPointY = this.backrightleg4.rotationPointY - (float)(yy);
        this.backrightleg4.rotationPointZ = this.backrightleg4.rotationPointZ + (float)(zz);



        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(5.25+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-10))*0.5), neck3.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*135/0.75+150))*1), neck3.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*135/0.75+150))*1));


        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-10))*0.5), neck.rotateAngleY + (float) Math.toRadians(0), neck.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*135/0.75-150))*1));


        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(0), head.rotateAngleY + (float) Math.toRadians(0), head.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-10))*0.5), jaw.rotateAngleY + (float) Math.toRadians(0), jaw.rotateAngleZ + (float) Math.toRadians(0));



        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 11 + (((tickAnim - 0) / 5) * (12.59-(11)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 11) {
            xx = 12.59 + (((tickAnim - 5) / 6) * (3-(12.59)));
            yy = 0 + (((tickAnim - 5) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 6) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 18) {
            xx = 3 + (((tickAnim - 11) / 7) * (-20-(3)));
            yy = 0 + (((tickAnim - 11) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 7) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 40) {
            xx = -20 + (((tickAnim - 18) / 22) * (11-(-20)));
            yy = 0 + (((tickAnim - 18) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 22) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontleftleg, frontleftleg.rotateAngleX + (float) Math.toRadians(xx), frontleftleg.rotateAngleY + (float) Math.toRadians(yy), frontleftleg.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = -1.35 + (((tickAnim - 0) / 5) * (-0.41-(-1.35)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 5) / 13) * (0-(0)));
            yy = -0.41 + (((tickAnim - 5) / 13) * (0-(-0.41)));
            zz = 0 + (((tickAnim - 5) / 13) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 22) {
            xx = 0 + (((tickAnim - 18) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 18) / 4) * (-0.2-(0)));
            zz = 0 + (((tickAnim - 18) / 4) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 27) {
            xx = 0 + (((tickAnim - 22) / 5) * (0-(0)));
            yy = -0.2 + (((tickAnim - 22) / 5) * (-0.61-(-0.2)));
            zz = 0 + (((tickAnim - 22) / 5) * (0-(0)));
        }
        else if (tickAnim >= 27 && tickAnim < 32) {
            xx = 0 + (((tickAnim - 27) / 5) * (0-(0)));
            yy = -0.61 + (((tickAnim - 27) / 5) * (-0.8-(-0.61)));
            zz = 0 + (((tickAnim - 27) / 5) * (0-(0)));
        }
        else if (tickAnim >= 32 && tickAnim < 36) {
            xx = 0 + (((tickAnim - 32) / 4) * (0-(0)));
            yy = -0.8 + (((tickAnim - 32) / 4) * (-1.285-(-0.8)));
            zz = 0 + (((tickAnim - 32) / 4) * (0-(0)));
        }
        else if (tickAnim >= 36 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 36) / 4) * (0-(0)));
            yy = -1.285 + (((tickAnim - 36) / 4) * (-1.35-(-1.285)));
            zz = 0 + (((tickAnim - 36) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.frontleftleg.rotationPointX = this.frontleftleg.rotationPointX + (float)(xx);
        this.frontleftleg.rotationPointY = this.frontleftleg.rotationPointY - (float)(yy);
        this.frontleftleg.rotationPointZ = this.frontleftleg.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 2 + (((tickAnim - 0) / 13) * (-43.21559-(2)));
            yy = 0 + (((tickAnim - 0) / 13) * (2.12681-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (-3.39477-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
            xx = -43.21559 + (((tickAnim - 13) / 5) * (0-(-43.21559)));
            yy = 2.12681 + (((tickAnim - 13) / 5) * (0-(2.12681)));
            zz = -3.39477 + (((tickAnim - 13) / 5) * (0-(-3.39477)));
        }
        else if (tickAnim >= 18 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 18) / 22) * (2-(0)));
            yy = 0 + (((tickAnim - 18) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 22) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontleftleg2, frontleftleg2.rotateAngleX + (float) Math.toRadians(xx), frontleftleg2.rotateAngleY + (float) Math.toRadians(yy), frontleftleg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (-0.3-(0)));
            yy = -0.1 + (((tickAnim - 0) / 13) * (0.2-(-0.1)));
            zz = 0 + (((tickAnim - 0) / 13) * (0.2-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
            xx = -0.3 + (((tickAnim - 13) / 5) * (0-(-0.3)));
            yy = 0.2 + (((tickAnim - 13) / 5) * (0.25-(0.2)));
            zz = 0.2 + (((tickAnim - 13) / 5) * (-0.325-(0.2)));
        }
        else if (tickAnim >= 18 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 18) / 22) * (0-(0)));
            yy = 0.25 + (((tickAnim - 18) / 22) * (-0.1-(0.25)));
            zz = -0.325 + (((tickAnim - 18) / 22) * (0-(-0.325)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.frontleftleg2.rotationPointX = this.frontleftleg2.rotationPointX + (float)(xx);
        this.frontleftleg2.rotationPointY = this.frontleftleg2.rotationPointY - (float)(yy);
        this.frontleftleg2.rotationPointZ = this.frontleftleg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = -11.25 + (((tickAnim - 0) / 3) * (-4-(-11.25)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 13) {
            xx = -4 + (((tickAnim - 3) / 10) * (57.61-(-4)));
            yy = 0 + (((tickAnim - 3) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 10) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
            xx = 57.61 + (((tickAnim - 13) / 5) * (7.79-(57.61)));
            yy = 0 + (((tickAnim - 13) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 5) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 22) {
            xx = 7.79 + (((tickAnim - 18) / 4) * (18-(7.79)));
            yy = 0 + (((tickAnim - 18) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 4) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 31) {
            xx = 18 + (((tickAnim - 22) / 9) * (5.8536-(18)));
            yy = 0 + (((tickAnim - 22) / 9) * (0.20406-(0)));
            zz = 0 + (((tickAnim - 22) / 9) * (-1.98957-(0)));
        }
        else if (tickAnim >= 31 && tickAnim < 40) {
            xx = 5.8536 + (((tickAnim - 31) / 9) * (-11.25-(5.8536)));
            yy = 0.20406 + (((tickAnim - 31) / 9) * (0-(0.20406)));
            zz = -1.98957 + (((tickAnim - 31) / 9) * (0-(-1.98957)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontleftleg3, frontleftleg3.rotateAngleX + (float) Math.toRadians(xx), frontleftleg3.rotateAngleY + (float) Math.toRadians(yy), frontleftleg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0.1-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 3) / 10) * (0-(0)));
            yy = 0.1 + (((tickAnim - 3) / 10) * (0.06-(0.1)));
            zz = 0 + (((tickAnim - 3) / 10) * (-0.75-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 22) {
            xx = 0 + (((tickAnim - 13) / 9) * (0-(0)));
            yy = 0.06 + (((tickAnim - 13) / 9) * (0.025-(0.06)));
            zz = -0.75 + (((tickAnim - 13) / 9) * (0-(-0.75)));
        }
        else if (tickAnim >= 22 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 22) / 3) * (0-(0)));
            yy = 0.025 + (((tickAnim - 22) / 3) * (0.4-(0.025)));
            zz = 0 + (((tickAnim - 22) / 3) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 25) / 3) * (0-(0)));
            yy = 0.4 + (((tickAnim - 25) / 3) * (0.5-(0.4)));
            zz = 0 + (((tickAnim - 25) / 3) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 31) {
            xx = 0 + (((tickAnim - 28) / 3) * (0-(0)));
            yy = 0.5 + (((tickAnim - 28) / 3) * (0.7-(0.5)));
            zz = 0 + (((tickAnim - 28) / 3) * (0-(0)));
        }
        else if (tickAnim >= 31 && tickAnim < 36) {
            xx = 0 + (((tickAnim - 31) / 5) * (0-(0)));
            yy = 0.7 + (((tickAnim - 31) / 5) * (0.45-(0.7)));
            zz = 0 + (((tickAnim - 31) / 5) * (0-(0)));
        }
        else if (tickAnim >= 36 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 36) / 4) * (0-(0)));
            yy = 0.45 + (((tickAnim - 36) / 4) * (0-(0.45)));
            zz = 0 + (((tickAnim - 36) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.frontleftleg3.rotationPointX = this.frontleftleg3.rotationPointX + (float)(xx);
        this.frontleftleg3.rotationPointY = this.frontleftleg3.rotationPointY - (float)(yy);
        this.frontleftleg3.rotationPointZ = this.frontleftleg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 22) {
            xx = -20 + (((tickAnim - 0) / 22) * (11-(-20)));
            yy = 0 + (((tickAnim - 0) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 22) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 24) {
            xx = 11 + (((tickAnim - 22) / 2) * (12.59-(11)));
            yy = 0 + (((tickAnim - 22) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 22) / 2) * (0-(0)));
        }
        else if (tickAnim >= 24 && tickAnim < 32) {
            xx = 12.59 + (((tickAnim - 24) / 8) * (3-(12.59)));
            yy = 0 + (((tickAnim - 24) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 24) / 8) * (0-(0)));
        }
        else if (tickAnim >= 32 && tickAnim < 40) {
            xx = 3 + (((tickAnim - 32) / 8) * (-20-(3)));
            yy = 0 + (((tickAnim - 32) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 32) / 8) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontrightleg, frontrightleg.rotateAngleX + (float) Math.toRadians(xx), frontrightleg.rotateAngleY + (float) Math.toRadians(yy), frontrightleg.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = -1 + (((tickAnim - 0) / 3) * (-0.545-(-1)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            yy = -0.545 + (((tickAnim - 3) / 2) * (-0.345-(-0.545)));
            zz = 0 + (((tickAnim - 3) / 2) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            yy = -0.345 + (((tickAnim - 5) / 5) * (-0.25-(-0.345)));
            zz = 0 + (((tickAnim - 5) / 5) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 16) {
            xx = 0 + (((tickAnim - 10) / 6) * (0-(0)));
            yy = -0.25 + (((tickAnim - 10) / 6) * (-0.54-(-0.25)));
            zz = 0 + (((tickAnim - 10) / 6) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 22) {
            xx = 0 + (((tickAnim - 16) / 6) * (0-(0)));
            yy = -0.54 + (((tickAnim - 16) / 6) * (-1.425-(-0.54)));
            zz = 0 + (((tickAnim - 16) / 6) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 24) {
            xx = 0 + (((tickAnim - 22) / 2) * (0-(0)));
            yy = -1.425 + (((tickAnim - 22) / 2) * (-0.565-(-1.425)));
            zz = 0 + (((tickAnim - 22) / 2) * (0-(0)));
        }
        else if (tickAnim >= 24 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 24) / 16) * (0-(0)));
            yy = -0.565 + (((tickAnim - 24) / 16) * (-1-(-0.565)));
            zz = 0 + (((tickAnim - 24) / 16) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.frontrightleg.rotationPointX = this.frontrightleg.rotationPointX + (float)(xx);
        this.frontrightleg.rotationPointY = this.frontrightleg.rotationPointY - (float)(yy);
        this.frontrightleg.rotationPointZ = this.frontrightleg.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 22) {
            xx = 0 + (((tickAnim - 0) / 22) * (2-(0)));
            yy = 0 + (((tickAnim - 0) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 22) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 32) {
            xx = 2 + (((tickAnim - 22) / 10) * (-43.21559-(2)));
            yy = 0 + (((tickAnim - 22) / 10) * (2.12681-(0)));
            zz = 0 + (((tickAnim - 22) / 10) * (-3.39477-(0)));
        }
        else if (tickAnim >= 32 && tickAnim < 40) {
            xx = -43.21559 + (((tickAnim - 32) / 8) * (0-(-43.21559)));
            yy = 2.12681 + (((tickAnim - 32) / 8) * (0-(2.12681)));
            zz = -3.39477 + (((tickAnim - 32) / 8) * (0-(-3.39477)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontrightleg2, frontrightleg2.rotateAngleX + (float) Math.toRadians(xx), frontrightleg2.rotateAngleY + (float) Math.toRadians(yy), frontrightleg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = 0.075 + (((tickAnim - 0) / 5) * (0.64-(0.075)));
            zz = -0.25 + (((tickAnim - 0) / 5) * (-0.275-(-0.25)));
        }
        else if (tickAnim >= 5 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 5) / 8) * (0-(0)));
            yy = 0.64 + (((tickAnim - 5) / 8) * (-0.1-(0.64)));
            zz = -0.275 + (((tickAnim - 5) / 8) * (-0.25-(-0.275)));
        }
        else if (tickAnim >= 13 && tickAnim < 22) {
            xx = 0 + (((tickAnim - 13) / 9) * (0-(0)));
            yy = -0.1 + (((tickAnim - 13) / 9) * (0.125-(-0.1)));
            zz = -0.25 + (((tickAnim - 13) / 9) * (-0.325-(-0.25)));
        }
        else if (tickAnim >= 22 && tickAnim < 32) {
            xx = 0 + (((tickAnim - 22) / 10) * (0.4-(0)));
            yy = 0.125 + (((tickAnim - 22) / 10) * (0.2-(0.125)));
            zz = -0.325 + (((tickAnim - 22) / 10) * (0.2-(-0.325)));
        }
        else if (tickAnim >= 32 && tickAnim < 40) {
            xx = 0.4 + (((tickAnim - 32) / 8) * (0-(0.4)));
            yy = 0.2 + (((tickAnim - 32) / 8) * (0.075-(0.2)));
            zz = 0.2 + (((tickAnim - 32) / 8) * (-0.25-(0.2)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.frontrightleg2.rotationPointX = this.frontrightleg2.rotationPointX + (float)(xx);
        this.frontrightleg2.rotationPointY = this.frontrightleg2.rotationPointY - (float)(yy);
        this.frontrightleg2.rotationPointZ = this.frontrightleg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 22) {
            xx = 20 + (((tickAnim - 0) / 22) * (-13-(20)));
            yy = 0 + (((tickAnim - 0) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 22) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 27) {
            xx = -13 + (((tickAnim - 22) / 5) * (25.6-(-13)));
            yy = 0 + (((tickAnim - 22) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 22) / 5) * (0-(0)));
        }
        else if (tickAnim >= 27 && tickAnim < 32) {
            xx = 25.6 + (((tickAnim - 27) / 5) * (59.75-(25.6)));
            yy = 0 + (((tickAnim - 27) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 27) / 5) * (0-(0)));
        }
        else if (tickAnim >= 32 && tickAnim < 36) {
            xx = 59.75 + (((tickAnim - 32) / 4) * (16.12-(59.75)));
            yy = 0 + (((tickAnim - 32) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 32) / 4) * (0-(0)));
        }
        else if (tickAnim >= 36 && tickAnim < 40) {
            xx = 16.12 + (((tickAnim - 36) / 4) * (20-(16.12)));
            yy = 0 + (((tickAnim - 36) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 36) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontrightleg3, frontrightleg3.rotateAngleX + (float) Math.toRadians(xx), frontrightleg3.rotateAngleY + (float) Math.toRadians(yy), frontrightleg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = 0.3 + (((tickAnim - 0) / 5) * (-0.375-(0.3)));
            zz = 0.1 + (((tickAnim - 0) / 5) * (0-(0.1)));
        }
        else if (tickAnim >= 5 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 5) / 6) * (0-(0)));
            yy = -0.375 + (((tickAnim - 5) / 6) * (0.15-(-0.375)));
            zz = 0 + (((tickAnim - 5) / 6) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 11) / 4) * (0-(0)));
            yy = 0.15 + (((tickAnim - 11) / 4) * (0.175-(0.15)));
            zz = 0 + (((tickAnim - 11) / 4) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 15) / 3) * (0-(0)));
            yy = 0.175 + (((tickAnim - 15) / 3) * (0-(0.175)));
            zz = 0 + (((tickAnim - 15) / 3) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 22) {
            xx = 0 + (((tickAnim - 18) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 18) / 4) * (-0.1-(0)));
            zz = 0 + (((tickAnim - 18) / 4) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 32) {
            xx = 0 + (((tickAnim - 22) / 10) * (0-(0)));
            yy = -0.1 + (((tickAnim - 22) / 10) * (0.15-(-0.1)));
            zz = 0 + (((tickAnim - 22) / 10) * (-0.85-(0)));
        }
        else if (tickAnim >= 32 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 32) / 8) * (0-(0)));
            yy = 0.15 + (((tickAnim - 32) / 8) * (0.35-(0.15)));
            zz = -0.85 + (((tickAnim - 32) / 8) * (0.1-(-0.85)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.frontrightleg3.rotationPointX = this.frontrightleg3.rotationPointX + (float)(xx);
        this.frontrightleg3.rotationPointY = this.frontrightleg3.rotationPointY - (float)(yy);
        this.frontrightleg3.rotationPointZ = this.frontrightleg3.rotationPointZ + (float)(zz);



        this.setRotateAngle(tail, tail.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*135/0.75+50))*-1), tail.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*135/0.75+150))*-3), tail.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*135/0.75+50))*-1));


        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*135/0.75-170))*-1), tail2.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*135/0.75-170))*2.5), tail2.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*135/0.75-170))*-3));


        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(0), tail3.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*135/0.75+190))*2.5), tail3.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*135/0.75+190))*-3));


        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(0), tail4.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*135/0.75+200))*3.5), tail4.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*135/0.75+200))*-5));


        this.setRotateAngle(tail5, tail5.rotateAngleX + (float) Math.toRadians(0), tail5.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*135/0.75+220))*3), tail5.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*135/0.75+220))*-5));


        this.setRotateAngle(tail6, tail6.rotateAngleX + (float) Math.toRadians(0), tail6.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*135/0.75+250))*1), tail6.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*135/0.75+250))*-1));


        this.setRotateAngle(neck4, neck4.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-10))*0.5), neck4.rotateAngleY + (float) Math.toRadians(0), neck4.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*135/0.75+55))*1.5));



        if (tickAnim >= 13 && tickAnim < 20) {
            xx = 1 + (((tickAnim - 13) / 7) * (1-(1)));
            yy = 1 + (((tickAnim - 13) / 7) * (0.035-(1)));
            zz = 1 + (((tickAnim - 13) / 7) * (1-(1)));
        }
        else if (tickAnim >= 20 && tickAnim < 27) {
            xx = 1 + (((tickAnim - 20) / 7) * (1-(1)));
            yy = 0.035 + (((tickAnim - 20) / 7) * (1-(0.035)));
            zz = 1 + (((tickAnim - 20) / 7) * (1-(1)));
        }
        else {
            xx = 1;
            yy = 1;
            zz = 1;
        }
        this.Eye.setScale((float)xx, (float)yy, (float)zz);




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 1 + (((tickAnim - 0) / 5) * (2-(1)));
        }
        else if (tickAnim >= 5 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 5) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 5) / 20) * (0-(0)));
            zz = 2 + (((tickAnim - 5) / 20) * (-2-(2)));
        }
        else if (tickAnim >= 25 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 25) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 25) / 15) * (0-(0)));
            zz = -2 + (((tickAnim - 25) / 15) * (1-(-2)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(main, main.rotateAngleX + (float) Math.toRadians(xx), main.rotateAngleY + (float) Math.toRadians(yy), main.rotateAngleZ + (float) Math.toRadians(zz));


    }

    public void animRunning(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraMiragaia entity = (EntityPrehistoricFloraMiragaia) entitylivingbaseIn;

        int animCycle = 20;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;

        this.setRotateAngle(upperbody, upperbody.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*270/0.75-360))*1), upperbody.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*270/0.75-250))*1.5), upperbody.rotateAngleZ + (float) Math.toRadians(0));

        this.setRotateAngle(body2, body2.rotateAngleX + (float) Math.toRadians(-0.5), body2.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*270/0.75-250))*1), body2.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*270/0.75+250))*2));

        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            yy = -0.225 + (((tickAnim - 0) / 2) * (0-(-0.225)));
            zz = 0 + (((tickAnim - 0) / 2) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 2) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 2) / 1) * (-0.225-(0)));
            zz = 0 + (((tickAnim - 2) / 1) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            yy = -0.225 + (((tickAnim - 3) / 2) * (0-(-0.225)));
            zz = 0 + (((tickAnim - 3) / 2) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 5) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 5) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 4) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 9) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 9) / 2) * (-0.225-(0)));
            zz = 0 + (((tickAnim - 9) / 2) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 11) / 2) * (0-(0)));
            yy = -0.225 + (((tickAnim - 11) / 2) * (0-(-0.225)));
            zz = 0 + (((tickAnim - 11) / 2) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 13) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 13) / 1) * (-0.225-(0)));
            zz = 0 + (((tickAnim - 13) / 1) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 16) {
            xx = 0 + (((tickAnim - 14) / 2) * (0-(0)));
            yy = -0.225 + (((tickAnim - 14) / 2) * (0-(-0.225)));
            zz = 0 + (((tickAnim - 14) / 2) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 16) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 16) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 16) / 2) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 18) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 18) / 2) * (-0.225-(0)));
            zz = 0 + (((tickAnim - 18) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.body2.rotationPointX = this.body2.rotationPointX + (float)(xx);
        this.body2.rotationPointY = this.body2.rotationPointY - (float)(yy);
        this.body2.rotationPointZ = this.body2.rotationPointZ + (float)(zz);



        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(0), body.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*270/0.75+250))*1), body.rotateAngleZ + (float) Math.toRadians(0));

        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 2) * (-0.1-(0)));
            zz = 0 + (((tickAnim - 0) / 2) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 2) / 1) * (0-(0)));
            yy = -0.1 + (((tickAnim - 2) / 1) * (0-(-0.1)));
            zz = 0 + (((tickAnim - 2) / 1) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 3) / 2) * (-0.1-(0)));
            zz = 0 + (((tickAnim - 3) / 2) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 5) / 2) * (0-(0)));
            yy = -0.1 + (((tickAnim - 5) / 2) * (0-(-0.1)));
            zz = 0 + (((tickAnim - 5) / 2) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 7) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 7) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 6) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 13) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 13) / 2) * (-0.1-(0)));
            zz = 0 + (((tickAnim - 13) / 2) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 17) {
            xx = 0 + (((tickAnim - 15) / 2) * (0-(0)));
            yy = -0.1 + (((tickAnim - 15) / 2) * (0-(-0.1)));
            zz = 0 + (((tickAnim - 15) / 2) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 17) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 17) / 1) * (-0.1-(0)));
            zz = 0 + (((tickAnim - 17) / 1) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 18) / 2) * (0-(0)));
            yy = -0.1 + (((tickAnim - 18) / 2) * (0-(-0.1)));
            zz = 0 + (((tickAnim - 18) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.body.rotationPointX = this.body.rotationPointX + (float)(xx);
        this.body.rotationPointY = this.body.rotationPointY - (float)(yy);
        this.body.rotationPointZ = this.body.rotationPointZ + (float)(zz);



        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(0), neck2.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*270/0.75-750))*0.5), neck2.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*270/0.75-750))*2));



        if (tickAnim >= 0 && tickAnim < 1) {
            xx = 15.75 + (((tickAnim - 0) / 1) * (18.75-(15.75)));
            yy = 0 + (((tickAnim - 0) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 1) * (0-(0)));
        }
        else if (tickAnim >= 1 && tickAnim < 4) {
            xx = 18.75 + (((tickAnim - 1) / 3) * (3-(18.75)));
            yy = 0 + (((tickAnim - 1) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 1) / 3) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 9) {
            xx = 3 + (((tickAnim - 4) / 5) * (-6.5-(3)));
            yy = 0 + (((tickAnim - 4) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 5) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 11) {
            xx = -6.5 + (((tickAnim - 9) / 2) * (-6.25-(-6.5)));
            yy = 0 + (((tickAnim - 9) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 2) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 20) {
            xx = -6.25 + (((tickAnim - 11) / 9) * (15.75-(-6.25)));
            yy = 0 + (((tickAnim - 11) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 9) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backleftleg, backleftleg.rotateAngleX + (float) Math.toRadians(xx), backleftleg.rotateAngleY + (float) Math.toRadians(yy), backleftleg.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 4) * (0.725-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 4) / 7) * (0-(0)));
            yy = 0.725 + (((tickAnim - 4) / 7) * (0-(0.725)));
            zz = 0 + (((tickAnim - 4) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.backleftleg.rotationPointX = this.backleftleg.rotationPointX + (float)(xx);
        this.backleftleg.rotationPointY = this.backleftleg.rotationPointY - (float)(yy);
        this.backleftleg.rotationPointZ = this.backleftleg.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 1) {
            xx = -0.5 + (((tickAnim - 0) / 1) * (-3-(-0.5)));
            yy = 0 + (((tickAnim - 0) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 1) * (0-(0)));
        }
        else if (tickAnim >= 1 && tickAnim < 4) {
            xx = -3 + (((tickAnim - 1) / 3) * (27.75-(-3)));
            yy = 0 + (((tickAnim - 1) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 1) / 3) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 7) {
            xx = 27.75 + (((tickAnim - 4) / 3) * (-3.5-(27.75)));
            yy = 0 + (((tickAnim - 4) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 3) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 9) {
            xx = -3.5 + (((tickAnim - 7) / 2) * (-15.25-(-3.5)));
            yy = 0 + (((tickAnim - 7) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 2) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 11) {
            xx = -15.25 + (((tickAnim - 9) / 2) * (0-(-15.25)));
            yy = 0 + (((tickAnim - 9) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 2) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 11) / 9) * (-0.5-(0)));
            yy = 0 + (((tickAnim - 11) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 9) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backleftleg2, backleftleg2.rotateAngleX + (float) Math.toRadians(xx), backleftleg2.rotateAngleY + (float) Math.toRadians(yy), backleftleg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 1) {
            xx = 0 + (((tickAnim - 0) / 1) * (0-(0)));
            yy = -0.35 + (((tickAnim - 0) / 1) * (-0.425-(-0.35)));
            zz = 0 + (((tickAnim - 0) / 1) * (0-(0)));
        }
        else if (tickAnim >= 1 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 1) / 3) * (0-(0)));
            yy = -0.425 + (((tickAnim - 1) / 3) * (0-(-0.425)));
            zz = 0 + (((tickAnim - 1) / 3) * (-0.05-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 4) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 4) / 3) * (2-(0)));
            zz = -0.05 + (((tickAnim - 4) / 3) * (-0.2-(-0.05)));
        }
        else if (tickAnim >= 7 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 7) / 2) * (0-(0)));
            yy = 2 + (((tickAnim - 7) / 2) * (1.125-(2)));
            zz = -0.2 + (((tickAnim - 7) / 2) * (-0.3-(-0.2)));
        }
        else if (tickAnim >= 9 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 9) / 2) * (0-(0)));
            yy = 1.125 + (((tickAnim - 9) / 2) * (-0.3-(1.125)));
            zz = -0.3 + (((tickAnim - 9) / 2) * (0-(-0.3)));
        }
        else if (tickAnim >= 11 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 11) / 4) * (0-(0)));
            yy = -0.3 + (((tickAnim - 11) / 4) * (-0.415-(-0.3)));
            zz = 0 + (((tickAnim - 11) / 4) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 15) / 5) * (0-(0)));
            yy = -0.415 + (((tickAnim - 15) / 5) * (-0.35-(-0.415)));
            zz = 0 + (((tickAnim - 15) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.backleftleg2.rotationPointX = this.backleftleg2.rotationPointX + (float)(xx);
        this.backleftleg2.rotationPointY = this.backleftleg2.rotationPointY - (float)(yy);
        this.backleftleg2.rotationPointZ = this.backleftleg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 1) {
            xx = -3.75 + (((tickAnim - 0) / 1) * (-3.77-(-3.75)));
            yy = 0 + (((tickAnim - 0) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 1) * (0-(0)));
        }
        else if (tickAnim >= 1 && tickAnim < 4) {
            xx = -3.77 + (((tickAnim - 1) / 3) * (3.5-(-3.77)));
            yy = 0 + (((tickAnim - 1) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 1) / 3) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 7) {
            xx = 3.5 + (((tickAnim - 4) / 3) * (2.59-(3.5)));
            yy = 0 + (((tickAnim - 4) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 3) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 11) {
            xx = 2.59 + (((tickAnim - 7) / 4) * (1.25-(2.59)));
            yy = 0 + (((tickAnim - 7) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 4) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 15) {
            xx = 1.25 + (((tickAnim - 11) / 4) * (1.25-(1.25)));
            yy = 0 + (((tickAnim - 11) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 4) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = 1.25 + (((tickAnim - 15) / 5) * (-3.75-(1.25)));
            yy = 0 + (((tickAnim - 15) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backleftleg3, backleftleg3.rotateAngleX + (float) Math.toRadians(xx), backleftleg3.rotateAngleY + (float) Math.toRadians(yy), backleftleg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 0) / 9) * (0-(0)));
            yy = -0.45 + (((tickAnim - 0) / 9) * (0.645-(-0.45)));
            zz = 0.325 + (((tickAnim - 0) / 9) * (0.39-(0.325)));
        }
        else if (tickAnim >= 9 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 9) / 2) * (0-(0)));
            yy = 0.645 + (((tickAnim - 9) / 2) * (-0.125-(0.645)));
            zz = 0.39 + (((tickAnim - 9) / 2) * (0.4-(0.39)));
        }
        else if (tickAnim >= 11 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 11) / 3) * (0-(0)));
            yy = -0.125 + (((tickAnim - 11) / 3) * (-0.045-(-0.125)));
            zz = 0.4 + (((tickAnim - 11) / 3) * (0.475-(0.4)));
        }
        else if (tickAnim >= 14 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 14) / 6) * (0-(0)));
            yy = -0.045 + (((tickAnim - 14) / 6) * (-0.45-(-0.045)));
            zz = 0.475 + (((tickAnim - 14) / 6) * (0.325-(0.475)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.backleftleg3.rotationPointX = this.backleftleg3.rotationPointX + (float)(xx);
        this.backleftleg3.rotationPointY = this.backleftleg3.rotationPointY - (float)(yy);
        this.backleftleg3.rotationPointZ = this.backleftleg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 1) {
            xx = -11.5 + (((tickAnim - 0) / 1) * (-11.75-(-11.5)));
            yy = 0 + (((tickAnim - 0) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 1) * (0-(0)));
        }
        else if (tickAnim >= 1 && tickAnim < 3) {
            xx = -11.75 + (((tickAnim - 1) / 2) * (-8.37-(-11.75)));
            yy = 0 + (((tickAnim - 1) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 1) / 2) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 3) {
            xx = -8.37 + (((tickAnim - 3) / 0) * (-1.5-(-8.37)));
            yy = 0 + (((tickAnim - 3) / 0) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 0) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = -1.5 + (((tickAnim - 3) / 1) * (11.25-(-1.5)));
            yy = 0 + (((tickAnim - 3) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 1) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 6) {
            xx = 11.25 + (((tickAnim - 4) / 2) * (11.9-(11.25)));
            yy = 0 + (((tickAnim - 4) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 2) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = 11.9 + (((tickAnim - 6) / 2) * (9.41-(11.9)));
            yy = 0 + (((tickAnim - 6) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 2) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 9) {
            xx = 9.41 + (((tickAnim - 8) / 1) * (-4.5-(9.41)));
            yy = 0 + (((tickAnim - 8) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 1) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 11) {
            xx = -4.5 + (((tickAnim - 9) / 2) * (4.58-(-4.5)));
            yy = 0 + (((tickAnim - 9) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 2) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 16) {
            xx = 4.58 + (((tickAnim - 11) / 5) * (-5.15-(4.58)));
            yy = 0 + (((tickAnim - 11) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 5) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 20) {
            xx = -5.15 + (((tickAnim - 16) / 4) * (-11.5-(-5.15)));
            yy = 0 + (((tickAnim - 16) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 16) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backleftleg4, backleftleg4.rotateAngleX + (float) Math.toRadians(xx), backleftleg4.rotateAngleY + (float) Math.toRadians(yy), backleftleg4.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            yy = -0.85 + (((tickAnim - 0) / 6) * (-0.3-(-0.85)));
            zz = 0 + (((tickAnim - 0) / 6) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 6) / 7) * (0-(0)));
            yy = -0.3 + (((tickAnim - 6) / 7) * (0.01-(-0.3)));
            zz = 0 + (((tickAnim - 6) / 7) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 13) / 7) * (0-(0)));
            yy = 0.01 + (((tickAnim - 13) / 7) * (-0.85-(0.01)));
            zz = 0 + (((tickAnim - 13) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.backleftleg4.rotationPointX = this.backleftleg4.rotationPointX + (float)(xx);
        this.backleftleg4.rotationPointY = this.backleftleg4.rotationPointY - (float)(yy);
        this.backleftleg4.rotationPointZ = this.backleftleg4.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 9) {
            xx = -7.25 + (((tickAnim - 0) / 9) * (18.75-(-7.25)));
            yy = 0 + (((tickAnim - 0) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 9) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 20) {
            xx = 18.75 + (((tickAnim - 9) / 11) * (-7.25-(18.75)));
            yy = 0 + (((tickAnim - 9) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 11) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backrightleg, backrightleg.rotateAngleX + (float) Math.toRadians(xx), backrightleg.rotateAngleY + (float) Math.toRadians(yy), backrightleg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 0) / 9) * (-3-(0)));
            yy = 0 + (((tickAnim - 0) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 9) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 13) {
            xx = -3 + (((tickAnim - 9) / 4) * (16.37-(-3)));
            yy = 0 + (((tickAnim - 9) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 4) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
            xx = 16.37 + (((tickAnim - 13) / 5) * (-6.45-(16.37)));
            yy = 0 + (((tickAnim - 13) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 5) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = -6.45 + (((tickAnim - 18) / 2) * (0-(-6.45)));
            yy = 0 + (((tickAnim - 18) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backrightleg2, backrightleg2.rotateAngleX + (float) Math.toRadians(xx), backrightleg2.rotateAngleY + (float) Math.toRadians(yy), backrightleg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 2) {
            xx = -0.15 + (((tickAnim - 0) / 2) * (-0.13-(-0.15)));
            yy = -0.35 + (((tickAnim - 0) / 2) * (-0.165-(-0.35)));
            zz = 0 + (((tickAnim - 0) / 2) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = -0.13 + (((tickAnim - 2) / 1) * (-0.11-(-0.13)));
            yy = -0.165 + (((tickAnim - 2) / 1) * (-0.125-(-0.165)));
            zz = 0 + (((tickAnim - 2) / 1) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = -0.11 + (((tickAnim - 3) / 1) * (-0.07-(-0.11)));
            yy = -0.125 + (((tickAnim - 3) / 1) * (-0.12-(-0.125)));
            zz = 0 + (((tickAnim - 3) / 1) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 6) {
            xx = -0.07 + (((tickAnim - 4) / 2) * (-0.06-(-0.07)));
            yy = -0.12 + (((tickAnim - 4) / 2) * (-0.105-(-0.12)));
            zz = 0 + (((tickAnim - 4) / 2) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = -0.06 + (((tickAnim - 6) / 2) * (-0.05-(-0.06)));
            yy = -0.105 + (((tickAnim - 6) / 2) * (-0.195-(-0.105)));
            zz = 0 + (((tickAnim - 6) / 2) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 8) {
            xx = -0.05 + (((tickAnim - 8) / 0) * (-0.02-(-0.05)));
            yy = -0.195 + (((tickAnim - 8) / 0) * (-0.575-(-0.195)));
            zz = 0 + (((tickAnim - 8) / 0) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 9) {
            xx = -0.02 + (((tickAnim - 8) / 1) * (0-(-0.02)));
            yy = -0.575 + (((tickAnim - 8) / 1) * (-0.95-(-0.575)));
            zz = 0 + (((tickAnim - 8) / 1) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 9) / 4) * (-0.06-(0)));
            yy = -0.95 + (((tickAnim - 9) / 4) * (0.87-(-0.95)));
            zz = 0 + (((tickAnim - 9) / 4) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 16) {
            xx = -0.06 + (((tickAnim - 13) / 3) * (-0.1-(-0.06)));
            yy = 0.87 + (((tickAnim - 13) / 3) * (1.215-(0.87)));
            zz = 0 + (((tickAnim - 13) / 3) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 20) {
            xx = -0.1 + (((tickAnim - 16) / 4) * (-0.15-(-0.1)));
            yy = 1.215 + (((tickAnim - 16) / 4) * (-0.35-(1.215)));
            zz = 0 + (((tickAnim - 16) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.backrightleg2.rotationPointX = this.backrightleg2.rotationPointX + (float)(xx);
        this.backrightleg2.rotationPointY = this.backrightleg2.rotationPointY - (float)(yy);
        this.backrightleg2.rotationPointZ = this.backrightleg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 9) {
            xx = 4.5 + (((tickAnim - 0) / 9) * (-3.77-(4.5)));
            yy = 0 + (((tickAnim - 0) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 9) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 13) {
            xx = -3.77 + (((tickAnim - 9) / 4) * (6.15-(-3.77)));
            yy = 0 + (((tickAnim - 9) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 4) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
            xx = 6.15 + (((tickAnim - 13) / 5) * (0.13-(6.15)));
            yy = 0 + (((tickAnim - 13) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 5) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = 0.13 + (((tickAnim - 18) / 2) * (4.5-(0.13)));
            yy = 0 + (((tickAnim - 18) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backrightleg3, backrightleg3.rotateAngleX + (float) Math.toRadians(xx), backrightleg3.rotateAngleY + (float) Math.toRadians(yy), backrightleg3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 9) {
            xx = 3.25 + (((tickAnim - 0) / 9) * (-11.75-(3.25)));
            yy = 2 + (((tickAnim - 0) / 9) * (0-(2)));
            zz = 0 + (((tickAnim - 0) / 9) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 13) {
            xx = -11.75 + (((tickAnim - 9) / 4) * (6.22114-(-11.75)));
            yy = 0 + (((tickAnim - 9) / 4) * (0.89807-(0)));
            zz = 0 + (((tickAnim - 9) / 4) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = 6.22114 + (((tickAnim - 13) / 2) * (7.75487-(6.22114)));
            yy = 0.89807 + (((tickAnim - 13) / 2) * (1.99805-(0.89807)));
            zz = 0 + (((tickAnim - 13) / 2) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 18) {
            xx = 7.75487 + (((tickAnim - 15) / 3) * (-9.44081-(7.75487)));
            yy = 1.99805 + (((tickAnim - 15) / 3) * (1.99883-(1.99805)));
            zz = 0 + (((tickAnim - 15) / 3) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = -9.44081 + (((tickAnim - 18) / 2) * (3.25-(-9.44081)));
            yy = 1.99883 + (((tickAnim - 18) / 2) * (2-(1.99883)));
            zz = 0 + (((tickAnim - 18) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backrightleg4, backrightleg4.rotateAngleX + (float) Math.toRadians(xx), backrightleg4.rotateAngleY + (float) Math.toRadians(yy), backrightleg4.rotateAngleZ + (float) Math.toRadians(zz));



        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(4.5), neck3.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*270/0.75-750))*2), neck3.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*270/0.75-750))*5));


        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*270/0.75-360))*-3), neck.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*270/0.75-750))*-5), neck.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*270/0.75-750))*-5));



        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 7.75 + (((tickAnim - 0) / 5) * (4.75-(7.75)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 4.75 + (((tickAnim - 5) / 5) * (7.75-(4.75)));
            yy = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 5) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = 7.75 + (((tickAnim - 10) / 5) * (4.75-(7.75)));
            yy = 0 + (((tickAnim - 10) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 5) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = 4.75 + (((tickAnim - 15) / 5) * (7.75-(4.75)));
            yy = 0 + (((tickAnim - 15) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(xx), jaw.rotateAngleY + (float) Math.toRadians(yy), jaw.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 9) {
            xx = 1.09511 + (((tickAnim - 0) / 9) * (-4.60233-(1.09511)));
            yy = -2.01529 + (((tickAnim - 0) / 9) * (-1.00574-(-2.01529)));
            zz = -5.65384 + (((tickAnim - 0) / 9) * (-2.82828-(-5.65384)));
        }
        else if (tickAnim >= 9 && tickAnim < 16) {
            xx = -4.60233 + (((tickAnim - 9) / 7) * (-38.75-(-4.60233)));
            yy = -1.00574 + (((tickAnim - 9) / 7) * (0-(-1.00574)));
            zz = -2.82828 + (((tickAnim - 9) / 7) * (0-(-2.82828)));
        }
        else if (tickAnim >= 16 && tickAnim < 20) {
            xx = -38.75 + (((tickAnim - 16) / 4) * (1.09511-(-38.75)));
            yy = 0 + (((tickAnim - 16) / 4) * (-2.01529-(0)));
            zz = 0 + (((tickAnim - 16) / 4) * (-5.65384-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontleftleg2, frontleftleg2.rotateAngleX + (float) Math.toRadians(xx), frontleftleg2.rotateAngleY + (float) Math.toRadians(yy), frontleftleg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 0) / 9) * (-0.25-(0)));
            yy = 0 + (((tickAnim - 0) / 9) * (-0.025-(0)));
            zz = -0.2 + (((tickAnim - 0) / 9) * (-0.5-(-0.2)));
        }
        else if (tickAnim >= 9 && tickAnim < 16) {
            xx = -0.25 + (((tickAnim - 9) / 7) * (-0.25-(-0.25)));
            yy = -0.025 + (((tickAnim - 9) / 7) * (0-(-0.025)));
            zz = -0.5 + (((tickAnim - 9) / 7) * (0-(-0.5)));
        }
        else if (tickAnim >= 16 && tickAnim < 20) {
            xx = -0.25 + (((tickAnim - 16) / 4) * (0-(-0.25)));
            yy = 0 + (((tickAnim - 16) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 16) / 4) * (-0.2-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.frontleftleg2.rotationPointX = this.frontleftleg2.rotationPointX + (float)(xx);
        this.frontleftleg2.rotationPointY = this.frontleftleg2.rotationPointY - (float)(yy);
        this.frontleftleg2.rotationPointZ = this.frontleftleg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 20.64136 + (((tickAnim - 0) / 4) * (2.82-(20.64136)));
            yy = -3.20811 + (((tickAnim - 0) / 4) * (-1.04717-(-3.20811)));
            zz = 8.29784 + (((tickAnim - 0) / 4) * (4.63339-(8.29784)));
        }
        else if (tickAnim >= 4 && tickAnim < 7) {
            xx = 2.82 + (((tickAnim - 4) / 3) * (-3.54237-(2.82)));
            yy = -1.04717 + (((tickAnim - 4) / 3) * (-1.04717-(-1.04717)));
            zz = 4.63339 + (((tickAnim - 4) / 3) * (4.63339-(4.63339)));
        }
        else if (tickAnim >= 7 && tickAnim < 9) {
            xx = -3.54237 + (((tickAnim - 7) / 2) * (-11.79237-(-3.54237)));
            yy = -1.04717 + (((tickAnim - 7) / 2) * (-1.04717-(-1.04717)));
            zz = 4.63339 + (((tickAnim - 7) / 2) * (4.63339-(4.63339)));
        }
        else if (tickAnim >= 9 && tickAnim < 16) {
            xx = -11.79237 + (((tickAnim - 9) / 7) * (52.25-(-11.79237)));
            yy = -1.04717 + (((tickAnim - 9) / 7) * (0-(-1.04717)));
            zz = 4.63339 + (((tickAnim - 9) / 7) * (0-(4.63339)));
        }
        else if (tickAnim >= 16 && tickAnim < 18) {
            xx = 52.25 + (((tickAnim - 16) / 2) * (8.07458-(52.25)));
            yy = 0 + (((tickAnim - 16) / 2) * (-0.6283-(0)));
            zz = 0 + (((tickAnim - 16) / 2) * (2.78004-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = 8.07458 + (((tickAnim - 18) / 2) * (20.64136-(8.07458)));
            yy = -0.6283 + (((tickAnim - 18) / 2) * (-3.20811-(-0.6283)));
            zz = 2.78004 + (((tickAnim - 18) / 2) * (8.29784-(2.78004)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontleftleg3, frontleftleg3.rotateAngleX + (float) Math.toRadians(xx), frontleftleg3.rotateAngleY + (float) Math.toRadians(yy), frontleftleg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            yy = 0.75 + (((tickAnim - 0) / 4) * (0.485-(0.75)));
            zz = 0.275 + (((tickAnim - 0) / 4) * (0-(0.275)));
        }
        else if (tickAnim >= 4 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 4) / 5) * (0-(0)));
            yy = 0.485 + (((tickAnim - 4) / 5) * (-0.02-(0.485)));
            zz = 0 + (((tickAnim - 4) / 5) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 16) {
            xx = 0 + (((tickAnim - 9) / 7) * (0-(0)));
            yy = -0.02 + (((tickAnim - 9) / 7) * (0.07-(-0.02)));
            zz = 0 + (((tickAnim - 9) / 7) * (-0.375-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 16) / 4) * (0-(0)));
            yy = 0.07 + (((tickAnim - 16) / 4) * (0.75-(0.07)));
            zz = -0.375 + (((tickAnim - 16) / 4) * (0.275-(-0.375)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.frontleftleg3.rotationPointX = this.frontleftleg3.rotationPointX + (float)(xx);
        this.frontleftleg3.rotationPointY = this.frontleftleg3.rotationPointY - (float)(yy);
        this.frontleftleg3.rotationPointZ = this.frontleftleg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = -0.5 + (((tickAnim - 0) / 3) * (-38.75-(-0.5)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 9) {
            xx = -38.75 + (((tickAnim - 3) / 6) * (1.09511-(-38.75)));
            yy = 0 + (((tickAnim - 3) / 6) * (-2.01529-(0)));
            zz = 0 + (((tickAnim - 3) / 6) * (-5.65384-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 20) {
            xx = 1.09511 + (((tickAnim - 9) / 11) * (-0.5-(1.09511)));
            yy = -2.01529 + (((tickAnim - 9) / 11) * (0-(-2.01529)));
            zz = -5.65384 + (((tickAnim - 9) / 11) * (0-(-5.65384)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontrightleg2, frontrightleg2.rotateAngleX + (float) Math.toRadians(xx), frontrightleg2.rotateAngleY + (float) Math.toRadians(yy), frontrightleg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0.15-(0)));
            yy = 0.575 + (((tickAnim - 0) / 3) * (0.35-(0.575)));
            zz = -0.325 + (((tickAnim - 0) / 3) * (0-(-0.325)));
        }
        else if (tickAnim >= 3 && tickAnim < 9) {
            xx = 0.15 + (((tickAnim - 3) / 6) * (0-(0.15)));
            yy = 0.35 + (((tickAnim - 3) / 6) * (0-(0.35)));
            zz = 0 + (((tickAnim - 3) / 6) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 9) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 9) / 3) * (0.46-(0)));
            zz = 0 + (((tickAnim - 9) / 3) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 12) / 3) * (0-(0)));
            yy = 0.46 + (((tickAnim - 12) / 3) * (0.8-(0.46)));
            zz = 0 + (((tickAnim - 12) / 3) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 15) / 5) * (0-(0)));
            yy = 0.8 + (((tickAnim - 15) / 5) * (0.575-(0.8)));
            zz = 0 + (((tickAnim - 15) / 5) * (-0.325-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.frontrightleg2.rotationPointX = this.frontrightleg2.rotationPointX + (float)(xx);
        this.frontrightleg2.rotationPointY = this.frontrightleg2.rotationPointY - (float)(yy);
        this.frontrightleg2.rotationPointZ = this.frontrightleg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = -16 + (((tickAnim - 0) / 3) * (52-(-16)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 8) {
            xx = 52 + (((tickAnim - 3) / 5) * (2.25-(52)));
            yy = 0 + (((tickAnim - 3) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 5) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 9) {
            xx = 2.25 + (((tickAnim - 8) / 1) * (20.45763-(2.25)));
            yy = 0 + (((tickAnim - 8) / 1) * (-1.04717-(0)));
            zz = 0 + (((tickAnim - 8) / 1) * (4.63339-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 20) {
            xx = 20.45763 + (((tickAnim - 9) / 11) * (-16-(20.45763)));
            yy = -1.04717 + (((tickAnim - 9) / 11) * (0-(-1.04717)));
            zz = 4.63339 + (((tickAnim - 9) / 11) * (0-(4.63339)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontrightleg3, frontrightleg3.rotateAngleX + (float) Math.toRadians(xx), frontrightleg3.rotateAngleY + (float) Math.toRadians(yy), frontrightleg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            yy = -0.325 + (((tickAnim - 0) / 2) * (0.4-(-0.325)));
            zz = 0 + (((tickAnim - 0) / 2) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 2) / 6) * (0-(0)));
            yy = 0.4 + (((tickAnim - 2) / 6) * (-0.175-(0.4)));
            zz = 0 + (((tickAnim - 2) / 6) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 8) / 1) * (0-(0)));
            yy = -0.175 + (((tickAnim - 8) / 1) * (0.125-(-0.175)));
            zz = 0 + (((tickAnim - 8) / 1) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 16) {
            xx = 0 + (((tickAnim - 9) / 7) * (0-(0)));
            yy = 0.125 + (((tickAnim - 9) / 7) * (0.065-(0.125)));
            zz = 0 + (((tickAnim - 9) / 7) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 16) / 4) * (0-(0)));
            yy = 0.065 + (((tickAnim - 16) / 4) * (-0.325-(0.065)));
            zz = 0 + (((tickAnim - 16) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.frontrightleg3.rotationPointX = this.frontrightleg3.rotationPointX + (float)(xx);
        this.frontrightleg3.rotationPointY = this.frontrightleg3.rotationPointY - (float)(yy);
        this.frontrightleg3.rotationPointZ = this.frontrightleg3.rotationPointZ + (float)(zz);



        this.setRotateAngle(tail, tail.rotateAngleX + (float) Math.toRadians(0), tail.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*270/0.75-360))*7), tail.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*270/0.75+360))*2));

        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 2) * (-0.1-(0)));
            zz = 0 + (((tickAnim - 0) / 2) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 2) / 1) * (0-(0)));
            yy = -0.1 + (((tickAnim - 2) / 1) * (0-(-0.1)));
            zz = 0 + (((tickAnim - 2) / 1) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 3) / 2) * (-0.1-(0)));
            zz = 0 + (((tickAnim - 3) / 2) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 5) / 2) * (0-(0)));
            yy = -0.1 + (((tickAnim - 5) / 2) * (0-(-0.1)));
            zz = 0 + (((tickAnim - 5) / 2) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 7) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 7) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 6) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 13) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 13) / 2) * (-0.1-(0)));
            zz = 0 + (((tickAnim - 13) / 2) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 17) {
            xx = 0 + (((tickAnim - 15) / 2) * (0-(0)));
            yy = -0.1 + (((tickAnim - 15) / 2) * (0-(-0.1)));
            zz = 0 + (((tickAnim - 15) / 2) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 17) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 17) / 1) * (-0.1-(0)));
            zz = 0 + (((tickAnim - 17) / 1) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 18) / 2) * (0-(0)));
            yy = -0.1 + (((tickAnim - 18) / 2) * (0-(-0.1)));
            zz = 0 + (((tickAnim - 18) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.tail.rotationPointX = this.tail.rotationPointX + (float)(xx);
        this.tail.rotationPointY = this.tail.rotationPointY - (float)(yy);
        this.tail.rotationPointZ = this.tail.rotationPointZ + (float)(zz);






        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(0), tail3.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*270/0.75-750))*6), tail3.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*270/0.75-750))*5));


        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(0), tail4.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*270/0.75-750))*7), tail4.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*270/0.75-750))*5));


        this.setRotateAngle(tail5, tail5.rotateAngleX + (float) Math.toRadians(0), tail5.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*270/0.75-850))*8), tail5.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*270/0.75-750))*7));


        this.setRotateAngle(tail6, tail6.rotateAngleX + (float) Math.toRadians(0), tail6.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*270/0.75-750))*10), tail6.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*270/0.75-750))*9));


        this.setRotateAngle(neck4, neck4.rotateAngleX + (float) Math.toRadians(1.25), neck4.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*270/0.75-360))*3), neck4.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*270/0.75+360))*2));



        if (tickAnim >= 0 && tickAnim < 9) {
            xx = -21.45582 + (((tickAnim - 0) / 9) * (16.00269-(-21.45582)));
            yy = 0.43416 + (((tickAnim - 0) / 9) * (1.05576-(0.43416)));
            zz = 1.96229 + (((tickAnim - 0) / 9) * (-1.228-(1.96229)));
        }
        else if (tickAnim >= 9 && tickAnim < 15) {
            xx = 16.00269 + (((tickAnim - 9) / 6) * (-0.54003-(16.00269)));
            yy = 1.05576 + (((tickAnim - 9) / 6) * (1.43677-(1.05576)));
            zz = -1.228 + (((tickAnim - 9) / 6) * (-3.19184-(-1.228)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = -0.54003 + (((tickAnim - 15) / 5) * (-21.45582-(-0.54003)));
            yy = 1.43677 + (((tickAnim - 15) / 5) * (0.43416-(1.43677)));
            zz = -3.19184 + (((tickAnim - 15) / 5) * (1.96229-(-3.19184)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontleftleg, frontleftleg.rotateAngleX + (float) Math.toRadians(xx), frontleftleg.rotateAngleY + (float) Math.toRadians(yy), frontleftleg.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            yy = -0.3 + (((tickAnim - 0) / 6) * (-0.47-(-0.3)));
            zz = 0 + (((tickAnim - 0) / 6) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 6) / 3) * (0-(0)));
            yy = -0.47 + (((tickAnim - 6) / 3) * (-1.23-(-0.47)));
            zz = 0 + (((tickAnim - 6) / 3) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 9) / 3) * (0-(0)));
            yy = -1.23 + (((tickAnim - 9) / 3) * (-0.515-(-1.23)));
            zz = 0 + (((tickAnim - 9) / 3) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 12) / 3) * (0-(0)));
            yy = -0.515 + (((tickAnim - 12) / 3) * (0-(-0.515)));
            zz = 0 + (((tickAnim - 12) / 3) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 15) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 15) / 5) * (-0.3-(0)));
            zz = 0 + (((tickAnim - 15) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.frontleftleg.rotationPointX = this.frontleftleg.rotationPointX + (float)(xx);
        this.frontleftleg.rotationPointY = this.frontleftleg.rotationPointY - (float)(yy);
        this.frontleftleg.rotationPointZ = this.frontleftleg.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 17.25 + (((tickAnim - 0) / 3) * (6.70997-(17.25)));
            yy = 0 + (((tickAnim - 0) / 3) * (1.43677-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (-3.19184-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 9) {
            xx = 6.70997 + (((tickAnim - 3) / 6) * (-21.45582-(6.70997)));
            yy = 1.43677 + (((tickAnim - 3) / 6) * (0.43416-(1.43677)));
            zz = -3.19184 + (((tickAnim - 3) / 6) * (1.96229-(-3.19184)));
        }
        else if (tickAnim >= 9 && tickAnim < 20) {
            xx = -21.45582 + (((tickAnim - 9) / 11) * (17.25-(-21.45582)));
            yy = 0.43416 + (((tickAnim - 9) / 11) * (0-(0.43416)));
            zz = 1.96229 + (((tickAnim - 9) / 11) * (0-(1.96229)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontrightleg, frontrightleg.rotateAngleX + (float) Math.toRadians(xx), frontrightleg.rotateAngleY + (float) Math.toRadians(yy), frontrightleg.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = -1.2 + (((tickAnim - 0) / 3) * (0-(-1.2)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 3) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 3) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 6) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 9) / 11) * (0-(0)));
            yy = 0 + (((tickAnim - 9) / 11) * (-1.2-(0)));
            zz = 0 + (((tickAnim - 9) / 11) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.frontrightleg.rotationPointX = this.frontrightleg.rotationPointX + (float)(xx);
        this.frontrightleg.rotationPointY = this.frontrightleg.rotationPointY - (float)(yy);
        this.frontrightleg.rotationPointZ = this.frontrightleg.rotationPointZ + (float)(zz);


    }

    public void animSneaking(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraMiragaia entity = (EntityPrehistoricFloraMiragaia) entitylivingbaseIn;

        int animCycle = 40;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;

        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            zz = 10.5 + (((tickAnim - 0) / 6) * (12-(10.5)));
        }
        else if (tickAnim >= 6 && tickAnim < 21) {
            xx = 0 + (((tickAnim - 6) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 6) / 15) * (0-(0)));
            zz = 12 + (((tickAnim - 6) / 15) * (-10-(12)));
        }
        else if (tickAnim >= 21 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 21) / 19) * (0-(0)));
            yy = 0 + (((tickAnim - 21) / 19) * (0-(0)));
            zz = -10 + (((tickAnim - 21) / 19) * (10.5-(-10)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontleftleg, frontleftleg.rotateAngleX + (float) Math.toRadians(xx), frontleftleg.rotateAngleY + (float) Math.toRadians(yy), frontleftleg.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 6) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 6) / 7) * (2.02-(0)));
            zz = 0 + (((tickAnim - 6) / 7) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 21) {
            xx = 0 + (((tickAnim - 13) / 8) * (0-(0)));
            yy = 2.02 + (((tickAnim - 13) / 8) * (-1-(2.02)));
            zz = 0 + (((tickAnim - 13) / 8) * (0-(0)));
        }
        else if (tickAnim >= 21 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 21) / 19) * (0-(0)));
            yy = -1 + (((tickAnim - 21) / 19) * (0-(-1)));
            zz = 0 + (((tickAnim - 21) / 19) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.frontleftleg.rotationPointX = this.frontleftleg.rotationPointX + (float)(xx);
        this.frontleftleg.rotationPointY = this.frontleftleg.rotationPointY - (float)(yy);
        this.frontleftleg.rotationPointZ = this.frontleftleg.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 0) / 6) * (-3.75-(0)));
            yy = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 13) {
            xx = -3.75 + (((tickAnim - 6) / 7) * (-12.83466-(-3.75)));
            yy = 0 + (((tickAnim - 6) / 7) * (6.99551-(0)));
            zz = 0 + (((tickAnim - 6) / 7) * (-0.34286-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 21) {
            xx = -12.83466 + (((tickAnim - 13) / 8) * (0-(-12.83466)));
            yy = 6.99551 + (((tickAnim - 13) / 8) * (0-(6.99551)));
            zz = -0.34286 + (((tickAnim - 13) / 8) * (9.5-(-0.34286)));
        }
        else if (tickAnim >= 21 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 21) / 19) * (0-(0)));
            yy = 0 + (((tickAnim - 21) / 19) * (0-(0)));
            zz = 9.5 + (((tickAnim - 21) / 19) * (0-(9.5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontleftleg2, frontleftleg2.rotateAngleX + (float) Math.toRadians(xx), frontleftleg2.rotateAngleY + (float) Math.toRadians(yy), frontleftleg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 21) {
            xx = 0 + (((tickAnim - 6) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 6) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 15) * (0-(0)));
        }
        else if (tickAnim >= 21 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 21) / 19) * (0-(0)));
            yy = 0 + (((tickAnim - 21) / 19) * (0-(0)));
            zz = 0 + (((tickAnim - 21) / 19) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.frontleftleg2.rotationPointX = this.frontleftleg2.rotationPointX + (float)(xx);
        this.frontleftleg2.rotationPointY = this.frontleftleg2.rotationPointY - (float)(yy);
        this.frontleftleg2.rotationPointZ = this.frontleftleg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 0) / 6) * (3.25-(0)));
            yy = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            zz = -12.75 + (((tickAnim - 0) / 6) * (-12.75-(-12.75)));
        }
        else if (tickAnim >= 6 && tickAnim < 13) {
            xx = 3.25 + (((tickAnim - 6) / 7) * (18.9809-(3.25)));
            yy = 0 + (((tickAnim - 6) / 7) * (-3.7803-(0)));
            zz = -12.75 + (((tickAnim - 6) / 7) * (1.38141-(-12.75)));
        }
        else if (tickAnim >= 13 && tickAnim < 19) {
            xx = 18.9809 + (((tickAnim - 13) / 6) * (-3.31357-(18.9809)));
            yy = -3.7803 + (((tickAnim - 13) / 6) * (-6.86102-(-3.7803)));
            zz = 1.38141 + (((tickAnim - 13) / 6) * (-4.49519-(1.38141)));
        }
        else if (tickAnim >= 19 && tickAnim < 21) {
            xx = -3.31357 + (((tickAnim - 19) / 2) * (0-(-3.31357)));
            yy = -6.86102 + (((tickAnim - 19) / 2) * (0-(-6.86102)));
            zz = -4.49519 + (((tickAnim - 19) / 2) * (0-(-4.49519)));
        }
        else if (tickAnim >= 21 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 21) / 19) * (0-(0)));
            yy = 0 + (((tickAnim - 21) / 19) * (0-(0)));
            zz = 0 + (((tickAnim - 21) / 19) * (-12.75-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontleftleg3, frontleftleg3.rotateAngleX + (float) Math.toRadians(xx), frontleftleg3.rotateAngleY + (float) Math.toRadians(yy), frontleftleg3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = -9.10138 + (((tickAnim - 0) / 8) * (-9.61051-(-9.10138)));
            yy = 1.87585 + (((tickAnim - 0) / 8) * (-5.39444-(1.87585)));
            zz = 9.05942 + (((tickAnim - 0) / 8) * (0.00362-(9.05942)));
        }
        else if (tickAnim >= 8 && tickAnim < 15) {
            xx = -9.61051 + (((tickAnim - 8) / 7) * (-7.35841-(-9.61051)));
            yy = -5.39444 + (((tickAnim - 8) / 7) * (-1.68515-(-5.39444)));
            zz = 0.00362 + (((tickAnim - 8) / 7) * (-9.60466-(0.00362)));
        }
        else if (tickAnim >= 15 && tickAnim < 40) {
            xx = -7.35841 + (((tickAnim - 15) / 25) * (-9.10138-(-7.35841)));
            yy = -1.68515 + (((tickAnim - 15) / 25) * (1.87585-(-1.68515)));
            zz = -9.60466 + (((tickAnim - 15) / 25) * (9.05942-(-9.60466)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backleftleg, backleftleg.rotateAngleX + (float) Math.toRadians(xx), backleftleg.rotateAngleY + (float) Math.toRadians(yy), backleftleg.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (2.375-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 8) / 7) * (0-(0)));
            yy = 2.375 + (((tickAnim - 8) / 7) * (0-(2.375)));
            zz = 0 + (((tickAnim - 8) / 7) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 15) / 25) * (0-(0)));
            yy = 0 + (((tickAnim - 15) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 25) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.backleftleg.rotationPointX = this.backleftleg.rotationPointX + (float)(xx);
        this.backleftleg.rotationPointY = this.backleftleg.rotationPointY - (float)(yy);
        this.backleftleg.rotationPointZ = this.backleftleg.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = -16 + (((tickAnim - 0) / 8) * (6-(-16)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 15) {
            xx = 6 + (((tickAnim - 8) / 7) * (-10.74763-(6)));
            yy = 0 + (((tickAnim - 8) / 7) * (-3.15825-(0)));
            zz = 0 + (((tickAnim - 8) / 7) * (8.9642-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 40) {
            xx = -10.74763 + (((tickAnim - 15) / 25) * (-16-(-10.74763)));
            yy = -3.15825 + (((tickAnim - 15) / 25) * (0-(-3.15825)));
            zz = 8.9642 + (((tickAnim - 15) / 25) * (0-(8.9642)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backleftleg2, backleftleg2.rotateAngleX + (float) Math.toRadians(xx), backleftleg2.rotateAngleY + (float) Math.toRadians(yy), backleftleg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 10.75 + (((tickAnim - 0) / 15) * (18-(10.75)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 40) {
            xx = 18 + (((tickAnim - 15) / 25) * (10.75-(18)));
            yy = 0 + (((tickAnim - 15) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 25) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backleftleg3, backleftleg3.rotateAngleX + (float) Math.toRadians(xx), backleftleg3.rotateAngleY + (float) Math.toRadians(yy), backleftleg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0.575-(0)));
            zz = -0.2 + (((tickAnim - 0) / 8) * (-0.21-(-0.2)));
        }
        else if (tickAnim >= 8 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 8) / 7) * (0-(0)));
            yy = 0.575 + (((tickAnim - 8) / 7) * (0.875-(0.575)));
            zz = -0.21 + (((tickAnim - 8) / 7) * (-0.525-(-0.21)));
        }
        else if (tickAnim >= 15 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 15) / 25) * (0-(0)));
            yy = 0.875 + (((tickAnim - 15) / 25) * (0-(0.875)));
            zz = -0.525 + (((tickAnim - 15) / 25) * (-0.2-(-0.525)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.backleftleg3.rotationPointX = this.backleftleg3.rotationPointX + (float)(xx);
        this.backleftleg3.rotationPointY = this.backleftleg3.rotationPointY - (float)(yy);
        this.backleftleg3.rotationPointZ = this.backleftleg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 12.79821 + (((tickAnim - 0) / 3) * (5.29815-(12.79821)));
            yy = 4.96887 + (((tickAnim - 0) / 3) * (2.43762-(4.96887)));
            zz = -10.38419 + (((tickAnim - 0) / 3) * (-5.09426-(-10.38419)));
        }
        else if (tickAnim >= 3 && tickAnim < 8) {
            xx = 5.29815 + (((tickAnim - 3) / 5) * (19.5-(5.29815)));
            yy = 2.43762 + (((tickAnim - 3) / 5) * (0-(2.43762)));
            zz = -5.09426 + (((tickAnim - 3) / 5) * (0-(-5.09426)));
        }
        else if (tickAnim >= 8 && tickAnim < 15) {
            xx = 19.5 + (((tickAnim - 8) / 7) * (0-(19.5)));
            yy = 0 + (((tickAnim - 8) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 7) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 15) / 25) * (12.79821-(0)));
            yy = 0 + (((tickAnim - 15) / 25) * (4.96887-(0)));
            zz = 0 + (((tickAnim - 15) / 25) * (-10.38419-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backleftleg4, backleftleg4.rotateAngleX + (float) Math.toRadians(xx), backleftleg4.rotateAngleY + (float) Math.toRadians(yy), backleftleg4.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            yy = 0.15 + (((tickAnim - 0) / 15) * (0-(0.15)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 15) / 25) * (0-(0)));
            yy = 0 + (((tickAnim - 15) / 25) * (0.15-(0)));
            zz = 0 + (((tickAnim - 15) / 25) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.backleftleg4.rotationPointX = this.backleftleg4.rotationPointX + (float)(xx);
        this.backleftleg4.rotationPointY = this.backleftleg4.rotationPointY - (float)(yy);
        this.backleftleg4.rotationPointZ = this.backleftleg4.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 7.49882 + (((tickAnim - 0) / 15) * (0-(7.49882)));
            yy = 0.10894 + (((tickAnim - 0) / 15) * (0-(0.10894)));
            zz = -1.24524 + (((tickAnim - 0) / 15) * (10.75-(-1.24524)));
        }
        else if (tickAnim >= 15 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 15) / 10) * (3.49009-(0)));
            yy = 0 + (((tickAnim - 15) / 10) * (-2.27627-(0)));
            zz = 10.75 + (((tickAnim - 15) / 10) * (3.13319-(10.75)));
        }
        else if (tickAnim >= 25 && tickAnim < 34) {
            xx = 3.49009 + (((tickAnim - 25) / 9) * (7.4771-(3.49009)));
            yy = -2.27627 + (((tickAnim - 25) / 9) * (0.47863-(-2.27627)));
            zz = 3.13319 + (((tickAnim - 25) / 9) * (-5.4792-(3.13319)));
        }
        else if (tickAnim >= 34 && tickAnim < 40) {
            xx = 7.4771 + (((tickAnim - 34) / 6) * (7.49882-(7.4771)));
            yy = 0.47863 + (((tickAnim - 34) / 6) * (0.10894-(0.47863)));
            zz = -5.4792 + (((tickAnim - 34) / 6) * (-1.24524-(-5.4792)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backrightleg, backrightleg.rotateAngleX + (float) Math.toRadians(xx), backrightleg.rotateAngleY + (float) Math.toRadians(yy), backrightleg.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 15) / 10) * (0.675-(0)));
            yy = 0 + (((tickAnim - 15) / 10) * (3.75-(0)));
            zz = 0 + (((tickAnim - 15) / 10) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 34) {
            xx = 0.675 + (((tickAnim - 25) / 9) * (0-(0.675)));
            yy = 3.75 + (((tickAnim - 25) / 9) * (0-(3.75)));
            zz = 0 + (((tickAnim - 25) / 9) * (0-(0)));
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
        this.backrightleg.rotationPointX = this.backrightleg.rotationPointX + (float)(xx);
        this.backrightleg.rotationPointY = this.backrightleg.rotationPointY - (float)(yy);
        this.backrightleg.rotationPointZ = this.backrightleg.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = -9.25 + (((tickAnim - 0) / 15) * (0-(-9.25)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (-11.25-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 15) / 10) * (14.16667-(0)));
            yy = 0 + (((tickAnim - 15) / 10) * (0-(0)));
            zz = -11.25 + (((tickAnim - 15) / 10) * (-3.08333-(-11.25)));
        }
        else if (tickAnim >= 25 && tickAnim < 34) {
            xx = 14.16667 + (((tickAnim - 25) / 9) * (-8.75-(14.16667)));
            yy = 0 + (((tickAnim - 25) / 9) * (0-(0)));
            zz = -3.08333 + (((tickAnim - 25) / 9) * (6.25-(-3.08333)));
        }
        else if (tickAnim >= 34 && tickAnim < 40) {
            xx = -8.75 + (((tickAnim - 34) / 6) * (-9.25-(-8.75)));
            yy = 0 + (((tickAnim - 34) / 6) * (0-(0)));
            zz = 6.25 + (((tickAnim - 34) / 6) * (0-(6.25)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backrightleg2, backrightleg2.rotateAngleX + (float) Math.toRadians(xx), backrightleg2.rotateAngleY + (float) Math.toRadians(yy), backrightleg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0.25 + (((tickAnim - 0) / 15) * (0.25-(0.25)));
            yy = 0 + (((tickAnim - 0) / 15) * (-0.65-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 34) {
            xx = 0.25 + (((tickAnim - 15) / 19) * (0.25-(0.25)));
            yy = -0.65 + (((tickAnim - 15) / 19) * (0-(-0.65)));
            zz = 0 + (((tickAnim - 15) / 19) * (0-(0)));
        }
        else if (tickAnim >= 34 && tickAnim < 40) {
            xx = 0.25 + (((tickAnim - 34) / 6) * (0.25-(0.25)));
            yy = 0 + (((tickAnim - 34) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 34) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.backrightleg2.rotationPointX = this.backrightleg2.rotationPointX + (float)(xx);
        this.backrightleg2.rotationPointY = this.backrightleg2.rotationPointY - (float)(yy);
        this.backrightleg2.rotationPointZ = this.backrightleg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 34) {
            xx = 0 + (((tickAnim - 15) / 19) * (0-(0)));
            yy = 0 + (((tickAnim - 15) / 19) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 19) * (0-(0)));
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
        this.setRotateAngle(backrightleg3, backrightleg3.rotateAngleX + (float) Math.toRadians(xx), backrightleg3.rotateAngleY + (float) Math.toRadians(yy), backrightleg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            yy = -0.075 + (((tickAnim - 0) / 15) * (0-(-0.075)));
            zz = 0.55 + (((tickAnim - 0) / 15) * (0-(0.55)));
        }
        else if (tickAnim >= 15 && tickAnim < 34) {
            xx = 0 + (((tickAnim - 15) / 19) * (0-(0)));
            yy = 0 + (((tickAnim - 15) / 19) * (-0.075-(0)));
            zz = 0 + (((tickAnim - 15) / 19) * (0.55-(0)));
        }
        else if (tickAnim >= 34 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 34) / 6) * (0-(0)));
            yy = -0.075 + (((tickAnim - 34) / 6) * (-0.075-(-0.075)));
            zz = 0.55 + (((tickAnim - 34) / 6) * (0.55-(0.55)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.backrightleg3.rotationPointX = this.backrightleg3.rotationPointX + (float)(xx);
        this.backrightleg3.rotationPointY = this.backrightleg3.rotationPointY - (float)(yy);
        this.backrightleg3.rotationPointZ = this.backrightleg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 15 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 15) / 10) * (22.25-(0)));
            yy = 0 + (((tickAnim - 15) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 10) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 34) {
            xx = 22.25 + (((tickAnim - 25) / 9) * (0-(22.25)));
            yy = 0 + (((tickAnim - 25) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 9) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backrightleg4, backrightleg4.rotateAngleX + (float) Math.toRadians(xx), backrightleg4.rotateAngleY + (float) Math.toRadians(yy), backrightleg4.rotateAngleZ + (float) Math.toRadians(zz));



        this.setRotateAngle(body2, body2.rotateAngleX + (float) Math.toRadians(0), body2.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*135/0.75+150))*-1), body2.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*135/0.75+180))*1));


        this.setRotateAngle(upperbody, upperbody.rotateAngleX + (float) Math.toRadians(0), upperbody.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*135/0.75+50))*2), upperbody.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*135/0.75-120))*1));


        this.setRotateAngle(neck4, neck4.rotateAngleX + (float) Math.toRadians(0.5818), neck4.rotateAngleY + (float) Math.toRadians(-6.3296+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-120))*3.5), neck4.rotateAngleZ + (float) Math.toRadians(-3.544+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180+50))*1));


        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(4.11521), neck3.rotateAngleY + (float) Math.toRadians(-31.7168+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-150))*3), neck3.rotateAngleZ + (float) Math.toRadians(0.77155));
        this.neck3.rotationPointX = this.neck3.rotationPointX + (float)(0);
        this.neck3.rotationPointY = this.neck3.rotationPointY - (float)(0);
        this.neck3.rotationPointZ = this.neck3.rotationPointZ + (float)(0.45);


        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(8.5869), neck2.rotateAngleY + (float) Math.toRadians(-23.2364+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-150))*-3), neck2.rotateAngleZ + (float) Math.toRadians(0.69791));


        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(9.25), neck.rotateAngleY + (float) Math.toRadians(-13+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-150))*3), neck.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(0), head.rotateAngleY + (float) Math.toRadians(-12.25), head.rotateAngleZ + (float) Math.toRadians(0));
        this.head.rotationPointX = this.head.rotationPointX + (float)(0);
        this.head.rotationPointY = this.head.rotationPointY - (float)(0);
        this.head.rotationPointZ = this.head.rotationPointZ + (float)(0.5);



        if (tickAnim >= 0 && tickAnim < 23) {
            xx = -20.44961 + (((tickAnim - 0) / 23) * (0-(-20.44961)));
            yy = 3.73929 + (((tickAnim - 0) / 23) * (0-(3.73929)));
            zz = -21.18752 + (((tickAnim - 0) / 23) * (11.5-(-21.18752)));
        }
        else if (tickAnim >= 23 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 23) / 17) * (-20.44961-(0)));
            yy = 0 + (((tickAnim - 23) / 17) * (3.73929-(0)));
            zz = 11.5 + (((tickAnim - 23) / 17) * (-21.18752-(11.5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontrightleg, frontrightleg.rotateAngleX + (float) Math.toRadians(xx), frontrightleg.rotateAngleY + (float) Math.toRadians(yy), frontrightleg.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 23 && tickAnim < 32) {
            xx = 0 + (((tickAnim - 23) / 9) * (0-(0)));
            yy = -1.675 + (((tickAnim - 23) / 9) * (1.18-(-1.675)));
            zz = 0 + (((tickAnim - 23) / 9) * (0-(0)));
        }
        else if (tickAnim >= 32 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 32) / 8) * (0-(0)));
            yy = 1.18 + (((tickAnim - 32) / 8) * (-1.675-(1.18)));
            zz = 0 + (((tickAnim - 32) / 8) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.frontrightleg.rotationPointX = this.frontrightleg.rotationPointX + (float)(xx);
        this.frontrightleg.rotationPointY = this.frontrightleg.rotationPointY - (float)(yy);
        this.frontrightleg.rotationPointZ = this.frontrightleg.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 23) {
            xx = 11.25 + (((tickAnim - 0) / 23) * (0-(11.25)));
            yy = 0 + (((tickAnim - 0) / 23) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 23) * (-14-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 32) {
            xx = 0 + (((tickAnim - 23) / 9) * (-1.29978-(0)));
            yy = 0 + (((tickAnim - 23) / 9) * (-7.23939-(0)));
            zz = -14 + (((tickAnim - 23) / 9) * (-2.64745-(-14)));
        }
        else if (tickAnim >= 32 && tickAnim < 40) {
            xx = -1.29978 + (((tickAnim - 32) / 8) * (11.25-(-1.29978)));
            yy = -7.23939 + (((tickAnim - 32) / 8) * (0-(-7.23939)));
            zz = -2.64745 + (((tickAnim - 32) / 8) * (0-(-2.64745)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontrightleg2, frontrightleg2.rotateAngleX + (float) Math.toRadians(xx), frontrightleg2.rotateAngleY + (float) Math.toRadians(yy), frontrightleg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 23) {
            xx = -0.195 + (((tickAnim - 0) / 23) * (0.375-(-0.195)));
            yy = 0.73 + (((tickAnim - 0) / 23) * (0.725-(0.73)));
            zz = -0.32 + (((tickAnim - 0) / 23) * (-0.325-(-0.32)));
        }
        else if (tickAnim >= 23 && tickAnim < 32) {
            xx = 0.375 + (((tickAnim - 23) / 9) * (-0.195-(0.375)));
            yy = 0.725 + (((tickAnim - 23) / 9) * (0.73-(0.725)));
            zz = -0.325 + (((tickAnim - 23) / 9) * (-0.32-(-0.325)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.frontrightleg2.rotationPointX = this.frontrightleg2.rotationPointX + (float)(xx);
        this.frontrightleg2.rotationPointY = this.frontrightleg2.rotationPointY - (float)(yy);
        this.frontrightleg2.rotationPointZ = this.frontrightleg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 23) {
            xx = 11.8796 + (((tickAnim - 0) / 23) * (0-(11.8796)));
            yy = -6.27187 + (((tickAnim - 0) / 23) * (0-(-6.27187)));
            zz = 14.8779 + (((tickAnim - 0) / 23) * (0-(14.8779)));
        }
        else if (tickAnim >= 23 && tickAnim < 32) {
            xx = 0 + (((tickAnim - 23) / 9) * (39.886-(0)));
            yy = 0 + (((tickAnim - 23) / 9) * (4.187-(0)));
            zz = 0 + (((tickAnim - 23) / 9) * (2.2465-(0)));
        }
        else if (tickAnim >= 32 && tickAnim < 40) {
            xx = 39.886 + (((tickAnim - 32) / 8) * (11.8796-(39.886)));
            yy = 4.187 + (((tickAnim - 32) / 8) * (-6.27187-(4.187)));
            zz = 2.2465 + (((tickAnim - 32) / 8) * (14.8779-(2.2465)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontrightleg3, frontrightleg3.rotateAngleX + (float) Math.toRadians(xx), frontrightleg3.rotateAngleY + (float) Math.toRadians(yy), frontrightleg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 12) {
            xx = 0.375 + (((tickAnim - 0) / 12) * (0.2-(0.375)));
            yy = 0.875 + (((tickAnim - 0) / 12) * (1.21-(0.875)));
            zz = 0 + (((tickAnim - 0) / 12) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 23) {
            xx = 0.2 + (((tickAnim - 12) / 11) * (0-(0.2)));
            yy = 1.21 + (((tickAnim - 12) / 11) * (0-(1.21)));
            zz = 0 + (((tickAnim - 12) / 11) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 32) {
            xx = 0 + (((tickAnim - 23) / 9) * (0.2-(0)));
            yy = 0 + (((tickAnim - 23) / 9) * (0.46-(0)));
            zz = 0 + (((tickAnim - 23) / 9) * (-0.775-(0)));
        }
        else if (tickAnim >= 32 && tickAnim < 40) {
            xx = 0.2 + (((tickAnim - 32) / 8) * (0.375-(0.2)));
            yy = 0.46 + (((tickAnim - 32) / 8) * (0.875-(0.46)));
            zz = -0.775 + (((tickAnim - 32) / 8) * (0-(-0.775)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.frontrightleg3.rotationPointX = this.frontrightleg3.rotationPointX + (float)(xx);
        this.frontrightleg3.rotationPointY = this.frontrightleg3.rotationPointY - (float)(yy);
        this.frontrightleg3.rotationPointZ = this.frontrightleg3.rotationPointZ + (float)(zz);



        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(0), body.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*135/0.75-55))*1), body.rotateAngleZ + (float) Math.toRadians(0));



        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 2+Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/0.75+50))*-1 + (((tickAnim - 0) / 15) * (2.0082+Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/0.75+50))*-1-(2+Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/0.75+50))*-1)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/0.75+150))*-3 + (((tickAnim - 0) / 15) * (3.4988+Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/0.75+150))*-3-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/0.75+150))*-3)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/0.75+50))*-1 + (((tickAnim - 0) / 15) * (0.0916+Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/0.75+50))*-1-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/0.75+50))*-1)));
        }
        else if (tickAnim >= 15 && tickAnim < 40) {
            xx = 2.0082+Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/0.75+50))*-1 + (((tickAnim - 15) / 25) * (2+Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/0.75+50))*-1-(2.0082+Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/0.75+50))*-1)));
            yy = 3.4988+Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/0.75+150))*-3 + (((tickAnim - 15) / 25) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/0.75+150))*-3-(3.4988+Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/0.75+150))*-3)));
            zz = 0.0916+Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/0.75+50))*-1 + (((tickAnim - 15) / 25) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/0.75+50))*-1-(0.0916+Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/0.75+50))*-1)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail, tail.rotateAngleX + (float) Math.toRadians(xx), tail.rotateAngleY + (float) Math.toRadians(yy), tail.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 23) {
            xx = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/0.75-170))*-1 + (((tickAnim - 0) / 23) * (-0.0535+Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/0.75-170))*-1-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/0.75-170))*-1)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/0.75-170))*2.5 + (((tickAnim - 0) / 23) * (4.7149+Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/0.75-170))*2.5-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/0.75-170))*2.5)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/0.75-170))*-3 + (((tickAnim - 0) / 23) * (-0.6893+Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/0.75-170))*-3-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/0.75-170))*-3)));
        }
        else if (tickAnim >= 23 && tickAnim < 40) {
            xx = -0.0535+Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/0.75-170))*-1 + (((tickAnim - 23) / 17) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/0.75-170))*-1-(-0.0535+Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/0.75-170))*-1)));
            yy = 4.7149+Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/0.75-170))*2.5 + (((tickAnim - 23) / 17) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/0.75-170))*2.5-(4.7149+Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/0.75-170))*2.5)));
            zz = -0.6893+Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/0.75-170))*- + (((tickAnim - 23) / 17) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/0.75-170))*-3-(-0.6893+Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/0.75-170))*-3)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(xx), tail2.rotateAngleY + (float) Math.toRadians(yy), tail2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 0) / 19) * (-0.09895-(0)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/0.75+190))*2.5 + (((tickAnim - 0) / 19) * (5.7045+Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/0.75+190))*2.5-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/0.75+190))*2.5)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/0.75+190))*-3 + (((tickAnim - 0) / 19) * (-1.0379+Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/0.75+190))-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/0.75+190))*-3)));
        }
        else if (tickAnim >= 19 && tickAnim < 40) {
            xx = -0.09895 + (((tickAnim - 19) / 21) * (0-(-0.09895)));
            yy = 5.7045+Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/0.75+190))*2.5 + (((tickAnim - 19) / 21) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/0.75+190))*2.5-(5.7045+Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/0.75+190))*2.5)));
            zz = -1.0379+Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/0.75+190)) + (((tickAnim - 19) / 21) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/0.75+190))*-3-(-1.0379+Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/0.75+190)))));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(xx), tail3.rotateAngleY + (float) Math.toRadians(yy), tail3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 23) {
            xx = 3 + (((tickAnim - 0) / 23) * (6.48796-(3)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/0.75+200))*3.5 + (((tickAnim - 0) / 23) * (3.2411+Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/0.75+200))*3.5-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/0.75+200))*3.5)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/0.75+200))*-5 + (((tickAnim - 0) / 23) * (-0.1708+Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/0.75+200))-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/0.75+200))*-5)));
        }
        else if (tickAnim >= 23 && tickAnim < 40) {
            xx = 6.48796 + (((tickAnim - 23) / 17) * (3-(6.48796)));
            yy = 3.2411+Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/0.75+200))*3.5 + (((tickAnim - 23) / 17) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/0.75+200))*3.5-(3.2411+Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/0.75+200))*3.5)));
            zz = -0.1708+Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/0.75+200)) + (((tickAnim - 23) / 17) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/0.75+200))*-5-(-0.1708+Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/0.75+200)))));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(xx), tail4.rotateAngleY + (float) Math.toRadians(yy), tail4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 21) {
            xx = 4 + (((tickAnim - 0) / 21) * (8.52947-(4)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/0.75+220))*3 + (((tickAnim - 0) / 21) * (7.4816+Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/0.75+220))*3-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/0.75+220))*3)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/0.75+220))*-5 + (((tickAnim - 0) / 21) * (0.1274+Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/0.75+220))*-5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/0.75+220))*-5)));
        }
        else if (tickAnim >= 21 && tickAnim < 40) {
            xx = 8.52947 + (((tickAnim - 21) / 19) * (4-(8.52947)));
            yy = 7.4816+Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/0.75+220))*3 + (((tickAnim - 21) / 19) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/0.75+220))*3-(7.4816+Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/0.75+220))*3)));
            zz = 0.1274+Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/0.75+220))*-5 + (((tickAnim - 21) / 19) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/0.75+220))*-5-(0.1274+Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/0.75+220))*-5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail5, tail5.rotateAngleX + (float) Math.toRadians(xx), tail5.rotateAngleY + (float) Math.toRadians(yy), tail5.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 22) {
            xx = 12.5 + (((tickAnim - 0) / 22) * (13.5957-(12.5)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/0.75+250))*1 + (((tickAnim - 0) / 22) * (4.7503+Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/0.75+250))*1-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/0.75+250))*1)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/0.75+250))*-1 + (((tickAnim - 0) / 22) * (-1.9819+Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/0.75+250))*-1-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/0.75+250))*-1)));
        }
        else if (tickAnim >= 22 && tickAnim < 40) {
            xx = 13.5957 + (((tickAnim - 22) / 18) * (12.5-(13.5957)));
            yy = 4.7503+Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/0.75+250))*1 + (((tickAnim - 22) / 18) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/0.75+250))*1-(4.7503+Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/0.75+250))*1)));
            zz = -1.9819+Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/0.75+250))*- + (((tickAnim - 22) / 18) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/0.75+250))*-1-(-1.9819+Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/0.75+250))*-1)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail6, tail6.rotateAngleX + (float) Math.toRadians(xx), tail6.rotateAngleY + (float) Math.toRadians(yy), tail6.rotateAngleZ + (float) Math.toRadians(zz));



        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-150))*1), jaw.rotateAngleY + (float) Math.toRadians(0), jaw.rotateAngleZ + (float) Math.toRadians(0));


    }


    public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        EntityPrehistoricFloraMiragaia e = (EntityPrehistoricFloraMiragaia) entity;
        animator.update(entity);

        animator.setAnimation(e.HURT_ANIMATION);
        animator.startKeyframe(5);
        animator.rotate(this.neck, (float) Math.toRadians(-4), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.neck2, (float) Math.toRadians(-4), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.neck3, (float) Math.toRadians(-4), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.neck4, (float) Math.toRadians(-4), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.head, (float) Math.toRadians(-5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.jaw, (float) Math.toRadians(30), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(15);
        animator.resetKeyframe(10);

    }
}
