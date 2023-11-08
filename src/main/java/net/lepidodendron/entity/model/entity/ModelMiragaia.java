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
        this.Eye.cubeList.add(new ModelBox(Eye, 57, 37, -2.675F, -0.5F, -0.5F, 3, 1, 1, 0.01F, false));

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
        animate((IAnimatedEntity) entity, f, f1, f2, f3, f4, f5);
        this.main.render(f5);
    }

    public void renderStaticWall(float f) {

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


    }


    @Override
    public void setLivingAnimations(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        super.setLivingAnimations(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
        this.resetToDefaultPose();


    }


    public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        EntityPrehistoricFloraMiragaia e = (EntityPrehistoricFloraMiragaia) entity;
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
