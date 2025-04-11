package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.EntityPrehistoricFloraKunbarrasaurus;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;

public class ModelKunbarrasaurus extends ModelBasePalaeopedia {
    private final AdvancedModelRenderer base;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer hipOsteodermsleft;
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
    private final AdvancedModelRenderer hipOsteodermsright;
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
    private final AdvancedModelRenderer cube_r26;
    private final AdvancedModelRenderer cube_r27;
    private final AdvancedModelRenderer rightleg;
    private final AdvancedModelRenderer cube_r28;
    private final AdvancedModelRenderer cube_r29;
    private final AdvancedModelRenderer cube_r30;
    private final AdvancedModelRenderer cube_r31;
    private final AdvancedModelRenderer rightleg2;
    private final AdvancedModelRenderer cube_r32;
    private final AdvancedModelRenderer cube_r33;
    private final AdvancedModelRenderer rightleg3;
    private final AdvancedModelRenderer cube_r34;
    private final AdvancedModelRenderer rightfoot;
    private final AdvancedModelRenderer leftleg;
    private final AdvancedModelRenderer cube_r35;
    private final AdvancedModelRenderer cube_r36;
    private final AdvancedModelRenderer cube_r37;
    private final AdvancedModelRenderer cube_r38;
    private final AdvancedModelRenderer leftleg2;
    private final AdvancedModelRenderer cube_r39;
    private final AdvancedModelRenderer cube_r40;
    private final AdvancedModelRenderer leftleg3;
    private final AdvancedModelRenderer cube_r41;
    private final AdvancedModelRenderer leftfoot;
    private final AdvancedModelRenderer body;
    private final AdvancedModelRenderer bodyOsteodermsLeft;
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
    private final AdvancedModelRenderer cube_r56;
    private final AdvancedModelRenderer bodyOsteodermsRight;
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
    private final AdvancedModelRenderer chest;
    private final AdvancedModelRenderer cube_r72;
    private final AdvancedModelRenderer cube_r73;
    private final AdvancedModelRenderer cube_r74;
    private final AdvancedModelRenderer chestOsteodermsLeft;
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
    private final AdvancedModelRenderer chestOsteodermsRight;
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
    private final AdvancedModelRenderer rightarm;
    private final AdvancedModelRenderer cube_r111;
    private final AdvancedModelRenderer cube_r112;
    private final AdvancedModelRenderer cube_r113;
    private final AdvancedModelRenderer rightarm2;
    private final AdvancedModelRenderer cube_r114;
    private final AdvancedModelRenderer righthand;
    private final AdvancedModelRenderer leftarm;
    private final AdvancedModelRenderer cube_r115;
    private final AdvancedModelRenderer cube_r116;
    private final AdvancedModelRenderer cube_r117;
    private final AdvancedModelRenderer leftarm2;
    private final AdvancedModelRenderer cube_r118;
    private final AdvancedModelRenderer lefthand;
    private final AdvancedModelRenderer neck;
    private final AdvancedModelRenderer cube_r119;
    private final AdvancedModelRenderer cube_r120;
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
    private final AdvancedModelRenderer neck2;
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
    private final AdvancedModelRenderer cube_r147;
    private final AdvancedModelRenderer cube_r148;
    private final AdvancedModelRenderer cube_r149;
    private final AdvancedModelRenderer cube_r150;
    private final AdvancedModelRenderer cube_r151;
    private final AdvancedModelRenderer head;
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
    private final AdvancedModelRenderer jaw;
    private final AdvancedModelRenderer cube_r165;
    private final AdvancedModelRenderer cube_r166;
    private final AdvancedModelRenderer cube_r167;
    private final AdvancedModelRenderer cube_r168;
    private final AdvancedModelRenderer cube_r169;
    private final AdvancedModelRenderer tail1;
    private final AdvancedModelRenderer cube_r170;
    private final AdvancedModelRenderer tailOsteodermsRight1;
    private final AdvancedModelRenderer cube_r171;
    private final AdvancedModelRenderer cube_r172;
    private final AdvancedModelRenderer cube_r173;
    private final AdvancedModelRenderer cube_r174;
    private final AdvancedModelRenderer cube_r175;
    private final AdvancedModelRenderer cube_r176;
    private final AdvancedModelRenderer cube_r177;
    private final AdvancedModelRenderer tailOsteodermsLeft1;
    private final AdvancedModelRenderer cube_r178;
    private final AdvancedModelRenderer cube_r179;
    private final AdvancedModelRenderer cube_r180;
    private final AdvancedModelRenderer cube_r181;
    private final AdvancedModelRenderer cube_r182;
    private final AdvancedModelRenderer cube_r183;
    private final AdvancedModelRenderer cube_r184;
    private final AdvancedModelRenderer tail2;
    private final AdvancedModelRenderer cube_r185;
    private final AdvancedModelRenderer tailOsteodermsRight2;
    private final AdvancedModelRenderer cube_r186;
    private final AdvancedModelRenderer cube_r187;
    private final AdvancedModelRenderer cube_r188;
    private final AdvancedModelRenderer cube_r189;
    private final AdvancedModelRenderer cube_r190;
    private final AdvancedModelRenderer cube_r191;
    private final AdvancedModelRenderer cube_r192;
    private final AdvancedModelRenderer cube_r193;
    private final AdvancedModelRenderer cube_r194;
    private final AdvancedModelRenderer tailOsteodermsLeft2;
    private final AdvancedModelRenderer cube_r195;
    private final AdvancedModelRenderer cube_r196;
    private final AdvancedModelRenderer cube_r197;
    private final AdvancedModelRenderer cube_r198;
    private final AdvancedModelRenderer cube_r199;
    private final AdvancedModelRenderer cube_r200;
    private final AdvancedModelRenderer cube_r201;
    private final AdvancedModelRenderer cube_r202;
    private final AdvancedModelRenderer cube_r203;
    private final AdvancedModelRenderer tail3;
    private final AdvancedModelRenderer cube_r204;
    private final AdvancedModelRenderer cube_r205;
    private final AdvancedModelRenderer tailOsteodermsRight3;
    private final AdvancedModelRenderer cube_r206;
    private final AdvancedModelRenderer cube_r207;
    private final AdvancedModelRenderer tailOsteodermsLeft3;
    private final AdvancedModelRenderer cube_r208;
    private final AdvancedModelRenderer cube_r209;

    private ModelAnimator animator;

    public ModelKunbarrasaurus() {
        this.textureWidth = 100;
        this.textureHeight = 98;

        this.base = new AdvancedModelRenderer(this);
        this.base.setRotationPoint(0.0F, 12.061F, 8.1542F);


        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(2.0F, 1.289F, 0.3458F);
        this.base.addChild(cube_r1);
        this.setRotateAngle(cube_r1, -0.1309F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 25, 62, -5.0F, -3.475F, 0.25F, 6, 8, 3, 0.0F, false));
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 0, 19, -7.5F, -3.475F, -4.75F, 11, 9, 5, 0.0F, false));

        this.hipOsteodermsleft = new AdvancedModelRenderer(this);
        this.hipOsteodermsleft.setRotationPoint(-0.5F, 1.289F, 0.3458F);
        this.base.addChild(hipOsteodermsleft);


        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(5.7446F, -2.6678F, -1.7647F);
        this.hipOsteodermsleft.addChild(cube_r2);
        this.setRotateAngle(cube_r2, -0.2628F, -0.0843F, -0.4573F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 92, 26, -0.5F, -0.6F, -0.7F, 1, 1, 1, 0.0F, false));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(2.2F, -3.9435F, -3.5285F);
        this.hipOsteodermsleft.addChild(cube_r3);
        this.setRotateAngle(cube_r3, -0.08F, 0.1037F, 0.8727F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 10, 94, -0.175F, -0.5F, -0.5F, 1, 1, 1, 0.0F, false));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(1.8F, -3.7434F, -1.8285F);
        this.hipOsteodermsleft.addChild(cube_r4);
        this.setRotateAngle(cube_r4, -0.08F, 0.1037F, 0.8727F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 20, 94, -0.1F, -0.5F, -0.5F, 1, 1, 1, 0.0F, false));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(4.3F, -3.5594F, -0.9619F);
        this.hipOsteodermsleft.addChild(cube_r5);
        this.setRotateAngle(cube_r5, -0.0248F, -0.2527F, -0.4475F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 85, 27, -0.5F, -0.175F, -1.5F, 1, 1, 2, 0.0F, false));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(1.5F, -3.5434F, -0.1285F);
        this.hipOsteodermsleft.addChild(cube_r6);
        this.setRotateAngle(cube_r6, -0.08F, 0.1037F, 0.8727F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 93, 55, -0.1F, -0.5F, -0.5F, 1, 1, 1, 0.0F, false));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(5.6696F, -1.4678F, -3.7647F);
        this.hipOsteodermsleft.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.0F, 0.0F, -0.48F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 40, 92, -0.5F, -0.5F, -0.5F, 1, 1, 1, 0.0F, false));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(5.6696F, -3.0678F, -3.2647F);
        this.hipOsteodermsleft.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.0F, 0.0F, -0.48F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 92, 32, -0.5F, -0.5F, -0.6F, 1, 1, 1, 0.0F, false));

        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(4.9088F, -2.074F, 1.2255F);
        this.hipOsteodermsleft.addChild(cube_r9);
        this.setRotateAngle(cube_r9, -0.1876F, 0.8184F, -0.0789F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 85, 75, 0.6086F, -0.4938F, -1.6882F, 1, 1, 2, 0.0F, false));
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 85, 71, -0.0914F, -0.4938F, -1.4882F, 1, 1, 2, -0.001F, false));

        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(4.9088F, -2.074F, 1.2255F);
        this.hipOsteodermsleft.addChild(cube_r10);
        this.setRotateAngle(cube_r10, -0.1279F, -0.0451F, 0.0646F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 86, 87, 0.219F, -0.4938F, -1.0606F, 1, 1, 2, -0.002F, false));

        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(6.0879F, -2.4475F, -0.6678F);
        this.hipOsteodermsleft.addChild(cube_r11);
        this.setRotateAngle(cube_r11, -0.5434F, 0.9579F, -0.4847F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 85, 79, -0.5F, -0.5F, -1.0F, 1, 1, 2, 0.0F, false));

        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(4.3838F, -2.074F, 1.1255F);
        this.hipOsteodermsleft.addChild(cube_r12);
        this.setRotateAngle(cube_r12, -0.1169F, 0.3114F, 0.0501F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 9, 82, -1.0553F, -0.4938F, -1.5547F, 1, 1, 3, 0.0F, false));

        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(4.3838F, -2.074F, 1.1255F);
        this.hipOsteodermsleft.addChild(cube_r13);
        this.setRotateAngle(cube_r13, -0.1164F, -0.2956F, 0.1201F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 85, 31, -0.2275F, -0.4938F, 1.166F, 1, 1, 2, -0.002F, false));

        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(4.3838F, -2.074F, 1.1255F);
        this.hipOsteodermsleft.addChild(cube_r14);
        this.setRotateAngle(cube_r14, -0.1187F, 0.3547F, 0.0447F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 18, 82, -1.9437F, -0.4938F, -0.894F, 1, 1, 3, -0.001F, false));

        this.hipOsteodermsright = new AdvancedModelRenderer(this);
        this.hipOsteodermsright.setRotationPoint(0.5F, 1.289F, 0.3458F);
        this.base.addChild(hipOsteodermsright);


        this.cube_r15 = new AdvancedModelRenderer(this);
        this.cube_r15.setRotationPoint(-5.7446F, -2.6678F, -1.7647F);
        this.hipOsteodermsright.addChild(cube_r15);
        this.setRotateAngle(cube_r15, -0.2628F, 0.0843F, 0.4573F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 92, 26, -0.5F, -0.6F, -0.7F, 1, 1, 1, 0.0F, true));

        this.cube_r16 = new AdvancedModelRenderer(this);
        this.cube_r16.setRotationPoint(-2.2F, -3.9435F, -3.5285F);
        this.hipOsteodermsright.addChild(cube_r16);
        this.setRotateAngle(cube_r16, -0.08F, -0.1037F, -0.8727F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 10, 94, -0.825F, -0.5F, -0.5F, 1, 1, 1, 0.0F, true));

        this.cube_r17 = new AdvancedModelRenderer(this);
        this.cube_r17.setRotationPoint(-1.8F, -3.7434F, -1.8285F);
        this.hipOsteodermsright.addChild(cube_r17);
        this.setRotateAngle(cube_r17, -0.08F, -0.1037F, -0.8727F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 20, 94, -0.9F, -0.5F, -0.5F, 1, 1, 1, 0.0F, true));

        this.cube_r18 = new AdvancedModelRenderer(this);
        this.cube_r18.setRotationPoint(-4.3F, -3.5594F, -0.9619F);
        this.hipOsteodermsright.addChild(cube_r18);
        this.setRotateAngle(cube_r18, -0.0248F, 0.2527F, 0.4475F);
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 85, 27, -0.5F, -0.175F, -1.5F, 1, 1, 2, 0.0F, true));

        this.cube_r19 = new AdvancedModelRenderer(this);
        this.cube_r19.setRotationPoint(-1.5F, -3.5434F, -0.1285F);
        this.hipOsteodermsright.addChild(cube_r19);
        this.setRotateAngle(cube_r19, -0.08F, -0.1037F, -0.8727F);
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 93, 55, -0.9F, -0.5F, -0.5F, 1, 1, 1, 0.0F, true));

        this.cube_r20 = new AdvancedModelRenderer(this);
        this.cube_r20.setRotationPoint(-5.6696F, -1.4678F, -3.7647F);
        this.hipOsteodermsright.addChild(cube_r20);
        this.setRotateAngle(cube_r20, 0.0F, 0.0F, 0.48F);
        this.cube_r20.cubeList.add(new ModelBox(cube_r20, 40, 92, -0.5F, -0.5F, -0.5F, 1, 1, 1, 0.0F, true));

        this.cube_r21 = new AdvancedModelRenderer(this);
        this.cube_r21.setRotationPoint(-5.6696F, -3.0678F, -3.2647F);
        this.hipOsteodermsright.addChild(cube_r21);
        this.setRotateAngle(cube_r21, 0.0F, 0.0F, 0.48F);
        this.cube_r21.cubeList.add(new ModelBox(cube_r21, 92, 32, -0.5F, -0.5F, -0.6F, 1, 1, 1, 0.0F, true));

        this.cube_r22 = new AdvancedModelRenderer(this);
        this.cube_r22.setRotationPoint(-4.9088F, -2.074F, 1.2255F);
        this.hipOsteodermsright.addChild(cube_r22);
        this.setRotateAngle(cube_r22, -0.1876F, -0.8184F, 0.0789F);
        this.cube_r22.cubeList.add(new ModelBox(cube_r22, 85, 75, -1.6086F, -0.4938F, -1.6882F, 1, 1, 2, 0.0F, true));
        this.cube_r22.cubeList.add(new ModelBox(cube_r22, 85, 71, -0.9086F, -0.4938F, -1.4882F, 1, 1, 2, -0.001F, true));

        this.cube_r23 = new AdvancedModelRenderer(this);
        this.cube_r23.setRotationPoint(-4.9088F, -2.074F, 1.2255F);
        this.hipOsteodermsright.addChild(cube_r23);
        this.setRotateAngle(cube_r23, -0.1279F, 0.0451F, -0.0646F);
        this.cube_r23.cubeList.add(new ModelBox(cube_r23, 86, 87, -1.219F, -0.4938F, -1.0606F, 1, 1, 2, -0.002F, true));

        this.cube_r24 = new AdvancedModelRenderer(this);
        this.cube_r24.setRotationPoint(-6.0879F, -2.4475F, -0.6678F);
        this.hipOsteodermsright.addChild(cube_r24);
        this.setRotateAngle(cube_r24, -0.5434F, -0.9579F, 0.4847F);
        this.cube_r24.cubeList.add(new ModelBox(cube_r24, 85, 79, -0.5F, -0.5F, -1.0F, 1, 1, 2, 0.0F, true));

        this.cube_r25 = new AdvancedModelRenderer(this);
        this.cube_r25.setRotationPoint(-4.3838F, -2.074F, 1.1255F);
        this.hipOsteodermsright.addChild(cube_r25);
        this.setRotateAngle(cube_r25, -0.1169F, -0.3114F, -0.0501F);
        this.cube_r25.cubeList.add(new ModelBox(cube_r25, 9, 82, 0.0553F, -0.4938F, -1.5547F, 1, 1, 3, 0.0F, true));

        this.cube_r26 = new AdvancedModelRenderer(this);
        this.cube_r26.setRotationPoint(-4.3838F, -2.074F, 1.1255F);
        this.hipOsteodermsright.addChild(cube_r26);
        this.setRotateAngle(cube_r26, -0.1164F, 0.2956F, -0.1201F);
        this.cube_r26.cubeList.add(new ModelBox(cube_r26, 85, 31, -0.7725F, -0.4938F, 1.166F, 1, 1, 2, -0.002F, true));

        this.cube_r27 = new AdvancedModelRenderer(this);
        this.cube_r27.setRotationPoint(-4.3838F, -2.074F, 1.1255F);
        this.hipOsteodermsright.addChild(cube_r27);
        this.setRotateAngle(cube_r27, -0.1187F, -0.3547F, -0.0447F);
        this.cube_r27.cubeList.add(new ModelBox(cube_r27, 18, 82, 0.9437F, -0.4938F, -0.894F, 1, 1, 3, -0.001F, true));

        this.rightleg = new AdvancedModelRenderer(this);
        this.rightleg.setRotationPoint(-4.3889F, 1.3423F, -0.3401F);
        this.base.addChild(rightleg);
        this.setRotateAngle(rightleg, 0.0F, 0.2094F, 0.0F);


        this.cube_r28 = new AdvancedModelRenderer(this);
        this.cube_r28.setRotationPoint(-1.2696F, 0.8789F, -0.1853F);
        this.rightleg.addChild(cube_r28);
        this.setRotateAngle(cube_r28, -0.4537F, -0.4715F, 0.0414F);
        this.cube_r28.cubeList.add(new ModelBox(cube_r28, 92, 74, -0.5F, -0.5F, -0.5F, 1, 1, 1, 0.0F, true));

        this.cube_r29 = new AdvancedModelRenderer(this);
        this.cube_r29.setRotationPoint(-1.3696F, 0.4789F, 1.0147F);
        this.rightleg.addChild(cube_r29);
        this.setRotateAngle(cube_r29, -0.2863F, -0.23F, 0.1349F);
        this.cube_r29.cubeList.add(new ModelBox(cube_r29, 59, 15, -0.5F, -1.3F, -0.3F, 1, 2, 1, 0.0F, true));

        this.cube_r30 = new AdvancedModelRenderer(this);
        this.cube_r30.setRotationPoint(-1.0696F, -0.4211F, 0.2147F);
        this.rightleg.addChild(cube_r30);
        this.setRotateAngle(cube_r30, -0.4671F, -0.3546F, 0.0843F);
        this.cube_r30.cubeList.add(new ModelBox(cube_r30, 92, 71, -0.5F, -0.5F, -0.5F, 1, 1, 1, 0.0F, true));

        this.cube_r31 = new AdvancedModelRenderer(this);
        this.cube_r31.setRotationPoint(0.5F, 1.0967F, -1.0206F);
        this.rightleg.addChild(cube_r31);
        this.setRotateAngle(cube_r31, -0.3927F, 0.0F, 0.0F);
        this.cube_r31.cubeList.add(new ModelBox(cube_r31, 68, 25, -2.0F, -3.0F, -2.0F, 3, 7, 5, 0.01F, true));

        this.rightleg2 = new AdvancedModelRenderer(this);
        this.rightleg2.setRotationPoint(0.0F, 3.9948F, -4.1816F);
        this.rightleg.addChild(rightleg2);


        this.cube_r32 = new AdvancedModelRenderer(this);
        this.cube_r32.setRotationPoint(-0.876F, 1.6729F, 2.5616F);
        this.rightleg2.addChild(cube_r32);
        this.setRotateAngle(cube_r32, -0.9797F, -0.2996F, 0.4143F);
        this.cube_r32.cubeList.add(new ModelBox(cube_r32, 94, 41, -0.5F, -0.5F, -0.5F, 1, 1, 1, 0.001F, true));

        this.cube_r33 = new AdvancedModelRenderer(this);
        this.cube_r33.setRotationPoint(0.999F, 1.4977F, 2.1973F);
        this.rightleg2.addChild(cube_r33);
        this.setRotateAngle(cube_r33, 0.6545F, 0.0F, 0.0F);
        this.cube_r33.cubeList.add(new ModelBox(cube_r33, 76, 71, -1.999F, -2.5F, -1.0F, 2, 6, 2, 0.01F, true));

        this.rightleg3 = new AdvancedModelRenderer(this);
        this.rightleg3.setRotationPoint(0.0F, 3.6246F, 5.0866F);
        this.rightleg2.addChild(rightleg3);


        this.cube_r34 = new AdvancedModelRenderer(this);
        this.cube_r34.setRotationPoint(0.999F, 1.1057F, -1.4447F);
        this.rightleg3.addChild(cube_r34);
        this.setRotateAngle(cube_r34, -0.3491F, 0.0F, 0.0F);
        this.cube_r34.cubeList.add(new ModelBox(cube_r34, 0, 80, -1.998F, -1.5F, -1.0F, 2, 3, 2, -0.01F, true));

        this.rightfoot = new AdvancedModelRenderer(this);
        this.rightfoot.setRotationPoint(0.0F, 2.225F, -1.5F);
        this.rightleg3.addChild(rightfoot);
        this.rightfoot.cubeList.add(new ModelBox(rightfoot, 75, 66, -1.501F, -0.1693F, -2.4197F, 3, 1, 3, 0.001F, true));

        this.leftleg = new AdvancedModelRenderer(this);
        this.leftleg.setRotationPoint(4.3889F, 1.3423F, -0.3401F);
        this.base.addChild(leftleg);
        this.setRotateAngle(leftleg, 0.0F, -0.2094F, 0.0F);


        this.cube_r35 = new AdvancedModelRenderer(this);
        this.cube_r35.setRotationPoint(1.2696F, 0.8789F, -0.1853F);
        this.leftleg.addChild(cube_r35);
        this.setRotateAngle(cube_r35, -0.4537F, 0.4715F, -0.0414F);
        this.cube_r35.cubeList.add(new ModelBox(cube_r35, 92, 74, -0.5F, -0.5F, -0.5F, 1, 1, 1, 0.0F, false));

        this.cube_r36 = new AdvancedModelRenderer(this);
        this.cube_r36.setRotationPoint(1.3696F, 0.4789F, 1.0147F);
        this.leftleg.addChild(cube_r36);
        this.setRotateAngle(cube_r36, -0.2863F, 0.23F, -0.1349F);
        this.cube_r36.cubeList.add(new ModelBox(cube_r36, 59, 15, -0.5F, -1.3F, -0.3F, 1, 2, 1, 0.0F, false));

        this.cube_r37 = new AdvancedModelRenderer(this);
        this.cube_r37.setRotationPoint(1.0696F, -0.4211F, 0.2147F);
        this.leftleg.addChild(cube_r37);
        this.setRotateAngle(cube_r37, -0.4671F, 0.3546F, -0.0843F);
        this.cube_r37.cubeList.add(new ModelBox(cube_r37, 92, 71, -0.5F, -0.5F, -0.5F, 1, 1, 1, 0.0F, false));

        this.cube_r38 = new AdvancedModelRenderer(this);
        this.cube_r38.setRotationPoint(-0.5F, 1.0967F, -1.0206F);
        this.leftleg.addChild(cube_r38);
        this.setRotateAngle(cube_r38, -0.3927F, 0.0F, 0.0F);
        this.cube_r38.cubeList.add(new ModelBox(cube_r38, 68, 25, -1.0F, -3.0F, -2.0F, 3, 7, 5, 0.01F, false));

        this.leftleg2 = new AdvancedModelRenderer(this);
        this.leftleg2.setRotationPoint(0.0F, 3.9948F, -4.1816F);
        this.leftleg.addChild(leftleg2);


        this.cube_r39 = new AdvancedModelRenderer(this);
        this.cube_r39.setRotationPoint(0.876F, 1.6729F, 2.5616F);
        this.leftleg2.addChild(cube_r39);
        this.setRotateAngle(cube_r39, -0.9797F, 0.2996F, -0.4143F);
        this.cube_r39.cubeList.add(new ModelBox(cube_r39, 94, 41, -0.5F, -0.5F, -0.5F, 1, 1, 1, 0.001F, false));

        this.cube_r40 = new AdvancedModelRenderer(this);
        this.cube_r40.setRotationPoint(-0.999F, 1.4977F, 2.1973F);
        this.leftleg2.addChild(cube_r40);
        this.setRotateAngle(cube_r40, 0.6545F, 0.0F, 0.0F);
        this.cube_r40.cubeList.add(new ModelBox(cube_r40, 76, 71, -0.001F, -2.5F, -1.0F, 2, 6, 2, 0.01F, false));

        this.leftleg3 = new AdvancedModelRenderer(this);
        this.leftleg3.setRotationPoint(0.0F, 3.6246F, 5.0866F);
        this.leftleg2.addChild(leftleg3);


        this.cube_r41 = new AdvancedModelRenderer(this);
        this.cube_r41.setRotationPoint(-0.999F, 1.1057F, -1.4447F);
        this.leftleg3.addChild(cube_r41);
        this.setRotateAngle(cube_r41, -0.3491F, 0.0F, 0.0F);
        this.cube_r41.cubeList.add(new ModelBox(cube_r41, 0, 80, -0.002F, -1.5F, -1.0F, 2, 3, 2, -0.01F, false));

        this.leftfoot = new AdvancedModelRenderer(this);
        this.leftfoot.setRotationPoint(0.0F, 2.225F, -1.5F);
        this.leftleg3.addChild(leftfoot);
        this.leftfoot.cubeList.add(new ModelBox(leftfoot, 75, 66, -1.499F, -0.1693F, -2.4197F, 3, 1, 3, 0.001F, false));

        this.body = new AdvancedModelRenderer(this);
        this.body.setRotationPoint(0.0F, -1.961F, -3.6542F);
        this.base.addChild(body);
        this.body.cubeList.add(new ModelBox(body, 0, 0, -6.0F, -1.25F, -8.0F, 12, 10, 8, 0.0F, false));

        this.bodyOsteodermsLeft = new AdvancedModelRenderer(this);
        this.bodyOsteodermsLeft.setRotationPoint(0.0F, 1.2F, -13.5F);
        this.body.addChild(bodyOsteodermsLeft);


        this.cube_r42 = new AdvancedModelRenderer(this);
        this.cube_r42.setRotationPoint(5.65F, -0.6F, 10.55F);
        this.bodyOsteodermsLeft.addChild(cube_r42);
        this.setRotateAngle(cube_r42, 0.0F, 0.0F, -0.48F);
        this.cube_r42.cubeList.add(new ModelBox(cube_r42, 92, 29, -0.5F, -0.5F, -0.5F, 1, 1, 1, 0.0F, false));

        this.cube_r43 = new AdvancedModelRenderer(this);
        this.cube_r43.setRotationPoint(3.35F, -2.1F, 6.25F);
        this.bodyOsteodermsLeft.addChild(cube_r43);
        this.setRotateAngle(cube_r43, 0.0F, 0.0F, 0.8727F);
        this.cube_r43.cubeList.add(new ModelBox(cube_r43, 30, 94, -0.5F, -0.5F, -0.5F, 1, 1, 1, 0.0F, false));

        this.cube_r44 = new AdvancedModelRenderer(this);
        this.cube_r44.setRotationPoint(3.65F, -2.1F, 7.85F);
        this.bodyOsteodermsLeft.addChild(cube_r44);
        this.setRotateAngle(cube_r44, 0.0F, 0.0F, 0.8727F);
        this.cube_r44.cubeList.add(new ModelBox(cube_r44, 71, 93, -0.5F, -0.5F, -0.5F, 1, 1, 1, 0.0F, false));
        this.cube_r44.cubeList.add(new ModelBox(cube_r44, 59, 94, -0.5F, -0.5F, 1.1F, 1, 1, 1, 0.0F, false));

        this.cube_r45 = new AdvancedModelRenderer(this);
        this.cube_r45.setRotationPoint(3.25F, -2.1F, 11.15F);
        this.bodyOsteodermsLeft.addChild(cube_r45);
        this.setRotateAngle(cube_r45, 0.0F, 0.0F, 0.8727F);
        this.cube_r45.cubeList.add(new ModelBox(cube_r45, 93, 86, -0.5F, -0.5F, -0.5F, 1, 1, 1, 0.0F, false));

        this.cube_r46 = new AdvancedModelRenderer(this);
        this.cube_r46.setRotationPoint(5.65F, -2.1F, 6.45F);
        this.bodyOsteodermsLeft.addChild(cube_r46);
        this.setRotateAngle(cube_r46, 0.0F, 0.0F, 0.8727F);
        this.cube_r46.cubeList.add(new ModelBox(cube_r46, 25, 94, -0.5F, -0.5F, -0.5F, 1, 1, 1, 0.0F, false));
        this.cube_r46.cubeList.add(new ModelBox(cube_r46, 94, 38, -0.5F, -0.5F, 0.9F, 1, 1, 1, 0.0F, false));
        this.cube_r46.cubeList.add(new ModelBox(cube_r46, 76, 94, -0.5F, -0.5F, 2.4F, 1, 1, 1, 0.0F, false));

        this.cube_r47 = new AdvancedModelRenderer(this);
        this.cube_r47.setRotationPoint(5.65F, -0.2F, 7.65F);
        this.bodyOsteodermsLeft.addChild(cube_r47);
        this.setRotateAngle(cube_r47, 0.0F, 0.0F, -0.5236F);
        this.cube_r47.cubeList.add(new ModelBox(cube_r47, 66, 93, -0.5F, -0.5F, -0.5F, 1, 1, 1, 0.0F, false));

        this.cube_r48 = new AdvancedModelRenderer(this);
        this.cube_r48.setRotationPoint(5.65F, -0.2F, 6.15F);
        this.bodyOsteodermsLeft.addChild(cube_r48);
        this.setRotateAngle(cube_r48, 0.0F, 0.0F, -0.5672F);
        this.cube_r48.cubeList.add(new ModelBox(cube_r48, 69, 90, -0.5F, -0.5F, -0.5F, 1, 1, 1, 0.0F, false));

        this.cube_r49 = new AdvancedModelRenderer(this);
        this.cube_r49.setRotationPoint(5.65F, 2.0F, 6.35F);
        this.bodyOsteodermsLeft.addChild(cube_r49);
        this.setRotateAngle(cube_r49, 0.0F, 0.0F, -0.48F);
        this.cube_r49.cubeList.add(new ModelBox(cube_r49, 0, 90, -0.5F, -0.5F, -0.5F, 1, 1, 1, 0.0F, false));

        this.cube_r50 = new AdvancedModelRenderer(this);
        this.cube_r50.setRotationPoint(5.65F, 3.9F, 6.85F);
        this.bodyOsteodermsLeft.addChild(cube_r50);
        this.setRotateAngle(cube_r50, 0.0F, 0.0F, -0.48F);
        this.cube_r50.cubeList.add(new ModelBox(cube_r50, 64, 25, 0.5F, -0.5F, -0.5F, 0, 1, 1, 0.0F, false));

        this.cube_r51 = new AdvancedModelRenderer(this);
        this.cube_r51.setRotationPoint(5.65F, 1.9F, 8.15F);
        this.bodyOsteodermsLeft.addChild(cube_r51);
        this.setRotateAngle(cube_r51, 0.0F, 0.0F, -0.48F);
        this.cube_r51.cubeList.add(new ModelBox(cube_r51, 74, 90, -0.5F, -0.5F, -0.5F, 1, 1, 1, 0.0F, false));

        this.cube_r52 = new AdvancedModelRenderer(this);
        this.cube_r52.setRotationPoint(5.65F, -0.2F, 9.05F);
        this.bodyOsteodermsLeft.addChild(cube_r52);
        this.setRotateAngle(cube_r52, 0.0F, 0.0F, -0.48F);
        this.cube_r52.cubeList.add(new ModelBox(cube_r52, 93, 52, -0.5F, -0.5F, -0.5F, 1, 1, 1, 0.0F, false));

        this.cube_r53 = new AdvancedModelRenderer(this);
        this.cube_r53.setRotationPoint(5.65F, 1.6F, 10.05F);
        this.bodyOsteodermsLeft.addChild(cube_r53);
        this.setRotateAngle(cube_r53, 0.4235F, 0.233F, -0.4733F);
        this.cube_r53.cubeList.add(new ModelBox(cube_r53, 93, 68, -0.5F, -0.5F, -0.5F, 1, 1, 1, 0.0F, false));

        this.cube_r54 = new AdvancedModelRenderer(this);
        this.cube_r54.setRotationPoint(5.65F, 0.8F, 11.65F);
        this.bodyOsteodermsLeft.addChild(cube_r54);
        this.setRotateAngle(cube_r54, 0.4235F, 0.233F, -0.4733F);
        this.cube_r54.cubeList.add(new ModelBox(cube_r54, 15, 94, -0.5F, -0.5F, -0.5F, 1, 1, 1, 0.0F, false));

        this.cube_r55 = new AdvancedModelRenderer(this);
        this.cube_r55.setRotationPoint(5.65F, -1.0F, 12.35F);
        this.bodyOsteodermsLeft.addChild(cube_r55);
        this.setRotateAngle(cube_r55, 0.0F, 0.0F, -0.48F);
        this.cube_r55.cubeList.add(new ModelBox(cube_r55, 88, 68, -0.5F, -0.5F, -0.6F, 1, 1, 1, 0.0F, false));

        this.cube_r56 = new AdvancedModelRenderer(this);
        this.cube_r56.setRotationPoint(0.9F, -2.35F, 9.5F);
        this.bodyOsteodermsLeft.addChild(cube_r56);
        this.setRotateAngle(cube_r56, 0.0F, 0.0F, 1.2741F);
        this.cube_r56.cubeList.add(new ModelBox(cube_r56, 0, 70, 0.0F, -1.0F, -4.6F, 0, 1, 8, 0.0F, false));

        this.bodyOsteodermsRight = new AdvancedModelRenderer(this);
        this.bodyOsteodermsRight.setRotationPoint(0.0F, 1.2F, -13.5F);
        this.body.addChild(bodyOsteodermsRight);


        this.cube_r57 = new AdvancedModelRenderer(this);
        this.cube_r57.setRotationPoint(-5.65F, -0.6F, 10.55F);
        this.bodyOsteodermsRight.addChild(cube_r57);
        this.setRotateAngle(cube_r57, 0.0F, 0.0F, 0.48F);
        this.cube_r57.cubeList.add(new ModelBox(cube_r57, 92, 29, -0.5F, -0.5F, -0.5F, 1, 1, 1, 0.0F, true));

        this.cube_r58 = new AdvancedModelRenderer(this);
        this.cube_r58.setRotationPoint(-3.35F, -2.1F, 6.25F);
        this.bodyOsteodermsRight.addChild(cube_r58);
        this.setRotateAngle(cube_r58, 0.0F, 0.0F, -0.8727F);
        this.cube_r58.cubeList.add(new ModelBox(cube_r58, 30, 94, -0.5F, -0.5F, -0.5F, 1, 1, 1, 0.0F, true));

        this.cube_r59 = new AdvancedModelRenderer(this);
        this.cube_r59.setRotationPoint(-3.65F, -2.1F, 7.85F);
        this.bodyOsteodermsRight.addChild(cube_r59);
        this.setRotateAngle(cube_r59, 0.0F, 0.0F, -0.8727F);
        this.cube_r59.cubeList.add(new ModelBox(cube_r59, 71, 93, -0.5F, -0.5F, -0.5F, 1, 1, 1, 0.0F, true));
        this.cube_r59.cubeList.add(new ModelBox(cube_r59, 59, 94, -0.5F, -0.5F, 1.1F, 1, 1, 1, 0.0F, true));

        this.cube_r60 = new AdvancedModelRenderer(this);
        this.cube_r60.setRotationPoint(-3.25F, -2.1F, 11.15F);
        this.bodyOsteodermsRight.addChild(cube_r60);
        this.setRotateAngle(cube_r60, 0.0F, 0.0F, -0.8727F);
        this.cube_r60.cubeList.add(new ModelBox(cube_r60, 93, 86, -0.5F, -0.5F, -0.5F, 1, 1, 1, 0.0F, true));

        this.cube_r61 = new AdvancedModelRenderer(this);
        this.cube_r61.setRotationPoint(-5.65F, -2.1F, 6.45F);
        this.bodyOsteodermsRight.addChild(cube_r61);
        this.setRotateAngle(cube_r61, 0.0F, 0.0F, -0.8727F);
        this.cube_r61.cubeList.add(new ModelBox(cube_r61, 25, 94, -0.5F, -0.5F, -0.5F, 1, 1, 1, 0.0F, true));
        this.cube_r61.cubeList.add(new ModelBox(cube_r61, 94, 38, -0.5F, -0.5F, 0.9F, 1, 1, 1, 0.0F, true));
        this.cube_r61.cubeList.add(new ModelBox(cube_r61, 76, 94, -0.5F, -0.5F, 2.4F, 1, 1, 1, 0.0F, true));

        this.cube_r62 = new AdvancedModelRenderer(this);
        this.cube_r62.setRotationPoint(-5.65F, -0.2F, 7.65F);
        this.bodyOsteodermsRight.addChild(cube_r62);
        this.setRotateAngle(cube_r62, 0.0F, 0.0F, 0.5236F);
        this.cube_r62.cubeList.add(new ModelBox(cube_r62, 66, 93, -0.5F, -0.5F, -0.5F, 1, 1, 1, 0.0F, true));

        this.cube_r63 = new AdvancedModelRenderer(this);
        this.cube_r63.setRotationPoint(-5.65F, -0.2F, 6.15F);
        this.bodyOsteodermsRight.addChild(cube_r63);
        this.setRotateAngle(cube_r63, 0.0F, 0.0F, 0.5672F);
        this.cube_r63.cubeList.add(new ModelBox(cube_r63, 69, 90, -0.5F, -0.5F, -0.5F, 1, 1, 1, 0.0F, true));

        this.cube_r64 = new AdvancedModelRenderer(this);
        this.cube_r64.setRotationPoint(-5.65F, 2.0F, 6.35F);
        this.bodyOsteodermsRight.addChild(cube_r64);
        this.setRotateAngle(cube_r64, 0.0F, 0.0F, 0.48F);
        this.cube_r64.cubeList.add(new ModelBox(cube_r64, 0, 90, -0.5F, -0.5F, -0.5F, 1, 1, 1, 0.0F, true));

        this.cube_r65 = new AdvancedModelRenderer(this);
        this.cube_r65.setRotationPoint(-5.65F, 3.9F, 6.85F);
        this.bodyOsteodermsRight.addChild(cube_r65);
        this.setRotateAngle(cube_r65, 0.0F, 0.0F, 0.48F);
        this.cube_r65.cubeList.add(new ModelBox(cube_r65, 64, 25, -0.5F, -0.5F, -0.5F, 0, 1, 1, 0.0F, true));

        this.cube_r66 = new AdvancedModelRenderer(this);
        this.cube_r66.setRotationPoint(-5.65F, 1.9F, 8.15F);
        this.bodyOsteodermsRight.addChild(cube_r66);
        this.setRotateAngle(cube_r66, 0.0F, 0.0F, 0.48F);
        this.cube_r66.cubeList.add(new ModelBox(cube_r66, 74, 90, -0.5F, -0.5F, -0.5F, 1, 1, 1, 0.0F, true));

        this.cube_r67 = new AdvancedModelRenderer(this);
        this.cube_r67.setRotationPoint(-5.65F, -0.2F, 9.05F);
        this.bodyOsteodermsRight.addChild(cube_r67);
        this.setRotateAngle(cube_r67, 0.0F, 0.0F, 0.48F);
        this.cube_r67.cubeList.add(new ModelBox(cube_r67, 93, 52, -0.5F, -0.5F, -0.5F, 1, 1, 1, 0.0F, true));

        this.cube_r68 = new AdvancedModelRenderer(this);
        this.cube_r68.setRotationPoint(-5.65F, 1.6F, 10.05F);
        this.bodyOsteodermsRight.addChild(cube_r68);
        this.setRotateAngle(cube_r68, 0.4235F, -0.233F, 0.4733F);
        this.cube_r68.cubeList.add(new ModelBox(cube_r68, 93, 68, -0.5F, -0.5F, -0.5F, 1, 1, 1, 0.0F, true));

        this.cube_r69 = new AdvancedModelRenderer(this);
        this.cube_r69.setRotationPoint(-5.65F, 0.8F, 11.65F);
        this.bodyOsteodermsRight.addChild(cube_r69);
        this.setRotateAngle(cube_r69, 0.4235F, -0.233F, 0.4733F);
        this.cube_r69.cubeList.add(new ModelBox(cube_r69, 15, 94, -0.5F, -0.5F, -0.5F, 1, 1, 1, 0.0F, true));

        this.cube_r70 = new AdvancedModelRenderer(this);
        this.cube_r70.setRotationPoint(-5.65F, -1.0F, 12.35F);
        this.bodyOsteodermsRight.addChild(cube_r70);
        this.setRotateAngle(cube_r70, 0.0F, 0.0F, 0.48F);
        this.cube_r70.cubeList.add(new ModelBox(cube_r70, 88, 68, -0.5F, -0.5F, -0.6F, 1, 1, 1, 0.0F, true));

        this.cube_r71 = new AdvancedModelRenderer(this);
        this.cube_r71.setRotationPoint(-0.9F, -2.35F, 9.5F);
        this.bodyOsteodermsRight.addChild(cube_r71);
        this.setRotateAngle(cube_r71, 0.0F, 0.0F, -1.2741F);
        this.cube_r71.cubeList.add(new ModelBox(cube_r71, 0, 70, 0.0F, -1.0F, -4.6F, 0, 1, 8, 0.0F, true));

        this.chest = new AdvancedModelRenderer(this);
        this.chest.setRotationPoint(0.0F, -0.929F, -7.9756F);
        this.body.addChild(chest);


        this.cube_r72 = new AdvancedModelRenderer(this);
        this.cube_r72.setRotationPoint(-0.5F, 6.9311F, -5.9861F);
        this.chest.addChild(cube_r72);
        this.setRotateAngle(cube_r72, -0.3054F, 0.0F, 0.0F);
        this.cube_r72.cubeList.add(new ModelBox(cube_r72, 0, 35, -4.0F, -2.9F, -0.3F, 9, 3, 8, -0.01F, false));

        this.cube_r73 = new AdvancedModelRenderer(this);
        this.cube_r73.setRotationPoint(-0.5F, 2.129F, -5.5244F);
        this.chest.addChild(cube_r73);
        this.setRotateAngle(cube_r73, 0.1309F, 0.0F, 0.0F);
        this.cube_r73.cubeList.add(new ModelBox(cube_r73, 35, 35, -5.0F, -1.45F, 1.0F, 11, 7, 5, 0.0F, false));

        this.cube_r74 = new AdvancedModelRenderer(this);
        this.cube_r74.setRotationPoint(-0.5F, 2.229F, -5.5244F);
        this.chest.addChild(cube_r74);
        this.setRotateAngle(cube_r74, 0.2182F, 0.0F, 0.0F);
        this.cube_r74.cubeList.add(new ModelBox(cube_r74, 0, 60, -4.0F, -1.45F, -1.8F, 9, 6, 3, 0.0F, false));

        this.chestOsteodermsLeft = new AdvancedModelRenderer(this);
        this.chestOsteodermsLeft.setRotationPoint(0.0F, 1.1F, 0.1F);
        this.chest.addChild(chestOsteodermsLeft);


        this.cube_r75 = new AdvancedModelRenderer(this);
        this.cube_r75.setRotationPoint(4.1F, 2.3959F, -5.1025F);
        this.chestOsteodermsLeft.addChild(cube_r75);
        this.setRotateAngle(cube_r75, 0.1687F, 0.1095F, -0.5522F);
        this.cube_r75.cubeList.add(new ModelBox(cube_r75, 49, 91, -0.5F, -0.5F, -0.5F, 1, 1, 1, 0.0F, false));

        this.cube_r76 = new AdvancedModelRenderer(this);
        this.cube_r76.setRotationPoint(5.1F, 2.3529F, -2.4233F);
        this.chestOsteodermsLeft.addChild(cube_r76);
        this.setRotateAngle(cube_r76, -0.2223F, -0.1395F, -0.5516F);
        this.cube_r76.cubeList.add(new ModelBox(cube_r76, 20, 91, -0.5F, -0.5F, -0.5F, 1, 1, 1, 0.0F, false));

        this.cube_r77 = new AdvancedModelRenderer(this);
        this.cube_r77.setRotationPoint(5.1F, 4.3529F, -2.3233F);
        this.chestOsteodermsLeft.addChild(cube_r77);
        this.setRotateAngle(cube_r77, -0.2223F, -0.1395F, -0.5516F);
        this.cube_r77.cubeList.add(new ModelBox(cube_r77, 64, 31, 0.5F, -0.5F, -0.5F, 0, 1, 1, 0.0F, false));

        this.cube_r78 = new AdvancedModelRenderer(this);
        this.cube_r78.setRotationPoint(5.1F, 4.7529F, -0.9233F);
        this.chestOsteodermsLeft.addChild(cube_r78);
        this.setRotateAngle(cube_r78, -0.2223F, -0.1395F, -0.5516F);
        this.cube_r78.cubeList.add(new ModelBox(cube_r78, 64, 28, 0.5F, -0.5F, -0.5F, 0, 1, 1, 0.0F, false));

        this.cube_r79 = new AdvancedModelRenderer(this);
        this.cube_r79.setRotationPoint(5.1F, 2.7529F, -1.0233F);
        this.chestOsteodermsLeft.addChild(cube_r79);
        this.setRotateAngle(cube_r79, -0.2223F, -0.1395F, -0.5516F);
        this.cube_r79.cubeList.add(new ModelBox(cube_r79, 5, 91, -0.5F, -0.5F, -0.5F, 1, 1, 1, 0.0F, false));

        this.cube_r80 = new AdvancedModelRenderer(this);
        this.cube_r80.setRotationPoint(5.1F, 2.1232F, -3.7388F);
        this.chestOsteodermsLeft.addChild(cube_r80);
        this.setRotateAngle(cube_r80, 0.0368F, 0.0234F, -0.5668F);
        this.cube_r80.cubeList.add(new ModelBox(cube_r80, 25, 91, -0.5F, -0.5F, -0.5F, 1, 1, 1, 0.0F, false));

        this.cube_r81 = new AdvancedModelRenderer(this);
        this.cube_r81.setRotationPoint(5.1F, 0.7232F, -2.4388F);
        this.chestOsteodermsLeft.addChild(cube_r81);
        this.setRotateAngle(cube_r81, 0.0368F, 0.0234F, -0.5668F);
        this.cube_r81.cubeList.add(new ModelBox(cube_r81, 10, 91, -0.5F, -0.5F, -0.5F, 1, 1, 1, 0.0F, false));

        this.cube_r82 = new AdvancedModelRenderer(this);
        this.cube_r82.setRotationPoint(5.1F, 0.9232F, -0.9388F);
        this.chestOsteodermsLeft.addChild(cube_r82);
        this.setRotateAngle(cube_r82, 0.0368F, 0.0234F, -0.5668F);
        this.cube_r82.cubeList.add(new ModelBox(cube_r82, 79, 91, -0.5F, -0.5F, -0.5F, 1, 1, 1, 0.0F, false));

        this.cube_r83 = new AdvancedModelRenderer(this);
        this.cube_r83.setRotationPoint(5.1F, 0.4232F, -3.8388F);
        this.chestOsteodermsLeft.addChild(cube_r83);
        this.setRotateAngle(cube_r83, 0.0368F, 0.0234F, -0.5668F);
        this.cube_r83.cubeList.add(new ModelBox(cube_r83, 15, 91, -0.5F, -0.5F, -0.5F, 1, 1, 1, 0.0F, false));

        this.cube_r84 = new AdvancedModelRenderer(this);
        this.cube_r84.setRotationPoint(4.1F, 0.6959F, -4.7025F);
        this.chestOsteodermsLeft.addChild(cube_r84);
        this.setRotateAngle(cube_r84, 0.0368F, 0.0234F, -0.5668F);
        this.cube_r84.cubeList.add(new ModelBox(cube_r84, 35, 91, -0.5F, -0.5F, -0.5F, 1, 1, 1, 0.0F, false));

        this.cube_r85 = new AdvancedModelRenderer(this);
        this.cube_r85.setRotationPoint(4.2F, 2.8529F, -6.4254F);
        this.chestOsteodermsLeft.addChild(cube_r85);
        this.setRotateAngle(cube_r85, 0.4404F, 0.1395F, -0.5516F);
        this.cube_r85.cubeList.add(new ModelBox(cube_r85, 88, 62, -0.5F, -0.5F, -0.5F, 1, 1, 1, 0.0F, false));

        this.cube_r86 = new AdvancedModelRenderer(this);
        this.cube_r86.setRotationPoint(4.2F, 1.2346F, -6.3149F);
        this.chestOsteodermsLeft.addChild(cube_r86);
        this.setRotateAngle(cube_r86, 0.2151F, 0.1502F, -0.5405F);
        this.cube_r86.cubeList.add(new ModelBox(cube_r86, 65, 83, -0.5F, -0.5F, -1.0F, 1, 1, 2, 0.0F, false));

        this.cube_r87 = new AdvancedModelRenderer(this);
        this.cube_r87.setRotationPoint(4.65F, -0.771F, -0.6744F);
        this.chestOsteodermsLeft.addChild(cube_r87);
        this.setRotateAngle(cube_r87, 0.0F, 0.0F, -2.2689F);
        this.cube_r87.cubeList.add(new ModelBox(cube_r87, 81, 94, -0.5F, -0.5F, -0.5F, 1, 1, 1, 0.0F, false));

        this.cube_r88 = new AdvancedModelRenderer(this);
        this.cube_r88.setRotationPoint(3.25F, -0.842F, -0.9167F);
        this.chestOsteodermsLeft.addChild(cube_r88);
        this.setRotateAngle(cube_r88, 0.1074F, 0.0749F, -0.6068F);
        this.cube_r88.cubeList.add(new ModelBox(cube_r88, 45, 94, -0.5F, -0.5F, -0.5F, 1, 1, 1, 0.0F, false));

        this.cube_r89 = new AdvancedModelRenderer(this);
        this.cube_r89.setRotationPoint(2.95F, -0.642F, -2.6167F);
        this.chestOsteodermsLeft.addChild(cube_r89);
        this.setRotateAngle(cube_r89, 0.1074F, 0.0749F, -0.6068F);
        this.cube_r89.cubeList.add(new ModelBox(cube_r89, 84, 91, -0.5F, -0.5F, -0.5F, 1, 1, 1, 0.0F, false));

        this.cube_r90 = new AdvancedModelRenderer(this);
        this.cube_r90.setRotationPoint(2.55F, -0.342F, -4.3167F);
        this.chestOsteodermsLeft.addChild(cube_r90);
        this.setRotateAngle(cube_r90, 0.1074F, 0.0749F, -0.6068F);
        this.cube_r90.cubeList.add(new ModelBox(cube_r90, 94, 35, -0.5F, -0.5F, -0.5F, 1, 1, 1, 0.0F, false));

        this.cube_r91 = new AdvancedModelRenderer(this);
        this.cube_r91.setRotationPoint(1.65F, -0.042F, -5.9167F);
        this.chestOsteodermsLeft.addChild(cube_r91);
        this.setRotateAngle(cube_r91, 0.1074F, 0.0749F, -0.6068F);
        this.cube_r91.cubeList.add(new ModelBox(cube_r91, 5, 94, -0.5F, -0.5F, -0.5F, 1, 1, 1, 0.0F, false));

        this.cube_r92 = new AdvancedModelRenderer(this);
        this.cube_r92.setRotationPoint(0.9F, -1.021F, -0.1244F);
        this.chestOsteodermsLeft.addChild(cube_r92);
        this.setRotateAngle(cube_r92, 0.1843F, -0.0629F, 1.1424F);
        this.cube_r92.cubeList.add(new ModelBox(cube_r92, 17, 74, 0.0F, -1.0F, -6.0F, 0, 1, 6, 0.0F, false));

        this.chestOsteodermsRight = new AdvancedModelRenderer(this);
        this.chestOsteodermsRight.setRotationPoint(0.0F, 1.1F, 0.1F);
        this.chest.addChild(chestOsteodermsRight);


        this.cube_r93 = new AdvancedModelRenderer(this);
        this.cube_r93.setRotationPoint(-4.1F, 2.3959F, -5.1025F);
        this.chestOsteodermsRight.addChild(cube_r93);
        this.setRotateAngle(cube_r93, 0.1687F, -0.1095F, 0.5522F);
        this.cube_r93.cubeList.add(new ModelBox(cube_r93, 49, 91, -0.5F, -0.5F, -0.5F, 1, 1, 1, 0.0F, true));

        this.cube_r94 = new AdvancedModelRenderer(this);
        this.cube_r94.setRotationPoint(-5.1F, 2.3529F, -2.4233F);
        this.chestOsteodermsRight.addChild(cube_r94);
        this.setRotateAngle(cube_r94, -0.2223F, 0.1395F, 0.5516F);
        this.cube_r94.cubeList.add(new ModelBox(cube_r94, 20, 91, -0.5F, -0.5F, -0.5F, 1, 1, 1, 0.0F, true));

        this.cube_r95 = new AdvancedModelRenderer(this);
        this.cube_r95.setRotationPoint(-5.1F, 4.3529F, -2.3233F);
        this.chestOsteodermsRight.addChild(cube_r95);
        this.setRotateAngle(cube_r95, -0.2223F, 0.1395F, 0.5516F);
        this.cube_r95.cubeList.add(new ModelBox(cube_r95, 64, 31, -0.5F, -0.5F, -0.5F, 0, 1, 1, 0.0F, true));

        this.cube_r96 = new AdvancedModelRenderer(this);
        this.cube_r96.setRotationPoint(-5.1F, 4.7529F, -0.9233F);
        this.chestOsteodermsRight.addChild(cube_r96);
        this.setRotateAngle(cube_r96, -0.2223F, 0.1395F, 0.5516F);
        this.cube_r96.cubeList.add(new ModelBox(cube_r96, 64, 28, -0.5F, -0.5F, -0.5F, 0, 1, 1, 0.0F, true));

        this.cube_r97 = new AdvancedModelRenderer(this);
        this.cube_r97.setRotationPoint(-5.1F, 2.7529F, -1.0233F);
        this.chestOsteodermsRight.addChild(cube_r97);
        this.setRotateAngle(cube_r97, -0.2223F, 0.1395F, 0.5516F);
        this.cube_r97.cubeList.add(new ModelBox(cube_r97, 5, 91, -0.5F, -0.5F, -0.5F, 1, 1, 1, 0.0F, true));

        this.cube_r98 = new AdvancedModelRenderer(this);
        this.cube_r98.setRotationPoint(-5.1F, 2.1232F, -3.7388F);
        this.chestOsteodermsRight.addChild(cube_r98);
        this.setRotateAngle(cube_r98, 0.0368F, -0.0234F, 0.5668F);
        this.cube_r98.cubeList.add(new ModelBox(cube_r98, 25, 91, -0.5F, -0.5F, -0.5F, 1, 1, 1, 0.0F, true));

        this.cube_r99 = new AdvancedModelRenderer(this);
        this.cube_r99.setRotationPoint(-5.1F, 0.7232F, -2.4388F);
        this.chestOsteodermsRight.addChild(cube_r99);
        this.setRotateAngle(cube_r99, 0.0368F, -0.0234F, 0.5668F);
        this.cube_r99.cubeList.add(new ModelBox(cube_r99, 10, 91, -0.5F, -0.5F, -0.5F, 1, 1, 1, 0.0F, true));

        this.cube_r100 = new AdvancedModelRenderer(this);
        this.cube_r100.setRotationPoint(-5.1F, 0.9232F, -0.9388F);
        this.chestOsteodermsRight.addChild(cube_r100);
        this.setRotateAngle(cube_r100, 0.0368F, -0.0234F, 0.5668F);
        this.cube_r100.cubeList.add(new ModelBox(cube_r100, 79, 91, -0.5F, -0.5F, -0.5F, 1, 1, 1, 0.0F, true));

        this.cube_r101 = new AdvancedModelRenderer(this);
        this.cube_r101.setRotationPoint(-5.1F, 0.4232F, -3.8388F);
        this.chestOsteodermsRight.addChild(cube_r101);
        this.setRotateAngle(cube_r101, 0.0368F, -0.0234F, 0.5668F);
        this.cube_r101.cubeList.add(new ModelBox(cube_r101, 15, 91, -0.5F, -0.5F, -0.5F, 1, 1, 1, 0.0F, true));

        this.cube_r102 = new AdvancedModelRenderer(this);
        this.cube_r102.setRotationPoint(-4.1F, 0.6959F, -4.7025F);
        this.chestOsteodermsRight.addChild(cube_r102);
        this.setRotateAngle(cube_r102, 0.0368F, -0.0234F, 0.5668F);
        this.cube_r102.cubeList.add(new ModelBox(cube_r102, 35, 91, -0.5F, -0.5F, -0.5F, 1, 1, 1, 0.0F, true));

        this.cube_r103 = new AdvancedModelRenderer(this);
        this.cube_r103.setRotationPoint(-4.2F, 2.8529F, -6.4254F);
        this.chestOsteodermsRight.addChild(cube_r103);
        this.setRotateAngle(cube_r103, 0.4404F, -0.1395F, 0.5516F);
        this.cube_r103.cubeList.add(new ModelBox(cube_r103, 88, 62, -0.5F, -0.5F, -0.5F, 1, 1, 1, 0.0F, true));

        this.cube_r104 = new AdvancedModelRenderer(this);
        this.cube_r104.setRotationPoint(-4.2F, 1.2346F, -6.3149F);
        this.chestOsteodermsRight.addChild(cube_r104);
        this.setRotateAngle(cube_r104, 0.2151F, -0.1502F, 0.5405F);
        this.cube_r104.cubeList.add(new ModelBox(cube_r104, 65, 83, -0.5F, -0.5F, -1.0F, 1, 1, 2, 0.0F, true));

        this.cube_r105 = new AdvancedModelRenderer(this);
        this.cube_r105.setRotationPoint(-4.65F, -0.771F, -0.6744F);
        this.chestOsteodermsRight.addChild(cube_r105);
        this.setRotateAngle(cube_r105, 0.0F, 0.0F, 2.2689F);
        this.cube_r105.cubeList.add(new ModelBox(cube_r105, 81, 94, -0.5F, -0.5F, -0.5F, 1, 1, 1, 0.0F, true));

        this.cube_r106 = new AdvancedModelRenderer(this);
        this.cube_r106.setRotationPoint(-3.25F, -0.842F, -0.9167F);
        this.chestOsteodermsRight.addChild(cube_r106);
        this.setRotateAngle(cube_r106, 0.1074F, -0.0749F, 0.6068F);
        this.cube_r106.cubeList.add(new ModelBox(cube_r106, 45, 94, -0.5F, -0.5F, -0.5F, 1, 1, 1, 0.0F, true));

        this.cube_r107 = new AdvancedModelRenderer(this);
        this.cube_r107.setRotationPoint(-2.95F, -0.642F, -2.6167F);
        this.chestOsteodermsRight.addChild(cube_r107);
        this.setRotateAngle(cube_r107, 0.1074F, -0.0749F, 0.6068F);
        this.cube_r107.cubeList.add(new ModelBox(cube_r107, 84, 91, -0.5F, -0.5F, -0.5F, 1, 1, 1, 0.0F, true));

        this.cube_r108 = new AdvancedModelRenderer(this);
        this.cube_r108.setRotationPoint(-2.55F, -0.342F, -4.3167F);
        this.chestOsteodermsRight.addChild(cube_r108);
        this.setRotateAngle(cube_r108, 0.1074F, -0.0749F, 0.6068F);
        this.cube_r108.cubeList.add(new ModelBox(cube_r108, 94, 35, -0.5F, -0.5F, -0.5F, 1, 1, 1, 0.0F, true));

        this.cube_r109 = new AdvancedModelRenderer(this);
        this.cube_r109.setRotationPoint(-1.65F, -0.042F, -5.9167F);
        this.chestOsteodermsRight.addChild(cube_r109);
        this.setRotateAngle(cube_r109, 0.1074F, -0.0749F, 0.6068F);
        this.cube_r109.cubeList.add(new ModelBox(cube_r109, 5, 94, -0.5F, -0.5F, -0.5F, 1, 1, 1, 0.0F, true));

        this.cube_r110 = new AdvancedModelRenderer(this);
        this.cube_r110.setRotationPoint(-0.9F, -1.021F, -0.1244F);
        this.chestOsteodermsRight.addChild(cube_r110);
        this.setRotateAngle(cube_r110, 0.1843F, 0.0629F, -1.1424F);
        this.cube_r110.cubeList.add(new ModelBox(cube_r110, 17, 74, 0.0F, -1.0F, -6.0F, 0, 1, 6, 0.0F, true));

        this.rightarm = new AdvancedModelRenderer(this);
        this.rightarm.setRotationPoint(-4.4237F, 5.1941F, -4.6363F);
        this.chest.addChild(rightarm);
        this.setRotateAngle(rightarm, 0.0F, -0.2007F, 0.0F);


        this.cube_r111 = new AdvancedModelRenderer(this);
        this.cube_r111.setRotationPoint(-0.45F, 3.8861F, 0.3718F);
        this.rightarm.addChild(cube_r111);
        this.setRotateAngle(cube_r111, 1.3701F, 0.0F, 0.0F);
        this.cube_r111.cubeList.add(new ModelBox(cube_r111, 61, 91, -0.5F, -0.5F, -0.5F, 1, 1, 1, 0.001F, true));

        this.cube_r112 = new AdvancedModelRenderer(this);
        this.cube_r112.setRotationPoint(-0.95F, 0.2611F, -0.0532F);
        this.rightarm.addChild(cube_r112);
        this.setRotateAngle(cube_r112, 0.5823F, -0.251F, 0.3607F);
        this.cube_r112.cubeList.add(new ModelBox(cube_r112, 88, 65, -0.5F, -0.5F, -0.5F, 1, 1, 1, 0.001F, true));

        this.cube_r113 = new AdvancedModelRenderer(this);
        this.cube_r113.setRotationPoint(0.8F, 0.5349F, -0.5309F);
        this.rightarm.addChild(cube_r113);
        this.setRotateAngle(cube_r113, 0.4974F, 0.0F, 0.0F);
        this.cube_r113.cubeList.add(new ModelBox(cube_r113, 70, 0, -2.0F, -1.0F, -1.0F, 3, 7, 3, 0.01F, true));

        this.rightarm2 = new AdvancedModelRenderer(this);
        this.rightarm2.setRotationPoint(0.3F, 4.6F, 3.8F);
        this.rightarm.addChild(rightarm2);


        this.cube_r114 = new AdvancedModelRenderer(this);
        this.cube_r114.setRotationPoint(0.074F, 1.4104F, -1.3405F);
        this.rightarm2.addChild(cube_r114);
        this.setRotateAngle(cube_r114, -0.3491F, 0.0F, 0.0F);
        this.cube_r114.cubeList.add(new ModelBox(cube_r114, 77, 46, -0.999F, -1.5F, -1.0F, 2, 5, 2, 0.0F, true));

        this.righthand = new AdvancedModelRenderer(this);
        this.righthand.setRotationPoint(0.1563F, 4.3576F, -2.3191F);
        this.rightarm2.addChild(righthand);
        this.setRotateAngle(righthand, 0.0F, 0.1745F, 0.0F);
        this.righthand.cubeList.add(new ModelBox(righthand, 75, 61, -1.676F, -0.1895F, -2.5155F, 3, 1, 3, 0.002F, true));

        this.leftarm = new AdvancedModelRenderer(this);
        this.leftarm.setRotationPoint(4.4237F, 5.1941F, -4.6363F);
        this.chest.addChild(leftarm);
        this.setRotateAngle(leftarm, 0.0F, 0.2007F, 0.0F);


        this.cube_r115 = new AdvancedModelRenderer(this);
        this.cube_r115.setRotationPoint(0.45F, 3.8861F, 0.3718F);
        this.leftarm.addChild(cube_r115);
        this.setRotateAngle(cube_r115, 1.3701F, 0.0F, 0.0F);
        this.cube_r115.cubeList.add(new ModelBox(cube_r115, 61, 91, -0.5F, -0.5F, -0.5F, 1, 1, 1, 0.001F, false));

        this.cube_r116 = new AdvancedModelRenderer(this);
        this.cube_r116.setRotationPoint(0.95F, 0.2611F, -0.0532F);
        this.leftarm.addChild(cube_r116);
        this.setRotateAngle(cube_r116, 0.5823F, 0.251F, -0.3607F);
        this.cube_r116.cubeList.add(new ModelBox(cube_r116, 88, 65, -0.5F, -0.5F, -0.5F, 1, 1, 1, 0.001F, false));

        this.cube_r117 = new AdvancedModelRenderer(this);
        this.cube_r117.setRotationPoint(-0.8F, 0.5349F, -0.5309F);
        this.leftarm.addChild(cube_r117);
        this.setRotateAngle(cube_r117, 0.4974F, 0.0F, 0.0F);
        this.cube_r117.cubeList.add(new ModelBox(cube_r117, 70, 0, -1.0F, -1.0F, -1.0F, 3, 7, 3, 0.01F, false));

        this.leftarm2 = new AdvancedModelRenderer(this);
        this.leftarm2.setRotationPoint(-0.3F, 4.6F, 3.8F);
        this.leftarm.addChild(leftarm2);


        this.cube_r118 = new AdvancedModelRenderer(this);
        this.cube_r118.setRotationPoint(-0.074F, 1.4104F, -1.3405F);
        this.leftarm2.addChild(cube_r118);
        this.setRotateAngle(cube_r118, -0.3491F, 0.0F, 0.0F);
        this.cube_r118.cubeList.add(new ModelBox(cube_r118, 77, 46, -1.001F, -1.5F, -1.0F, 2, 5, 2, 0.0F, false));

        this.lefthand = new AdvancedModelRenderer(this);
        this.lefthand.setRotationPoint(-0.1563F, 4.3576F, -2.3191F);
        this.leftarm2.addChild(lefthand);
        this.setRotateAngle(lefthand, 0.0F, -0.1745F, 0.0F);
        this.lefthand.cubeList.add(new ModelBox(lefthand, 75, 61, -1.324F, -0.1895F, -2.5155F, 3, 1, 3, 0.002F, false));

        this.neck = new AdvancedModelRenderer(this);
        this.neck.setRotationPoint(0.0F, 2.8324F, -6.9065F);
        this.chest.addChild(neck);


        this.cube_r119 = new AdvancedModelRenderer(this);
        this.cube_r119.setRotationPoint(-3.0213F, 1.1518F, -2.1929F);
        this.neck.addChild(cube_r119);
        this.setRotateAngle(cube_r119, 0.48F, 0.0F, -1.9635F);
        this.cube_r119.cubeList.add(new ModelBox(cube_r119, 92, 77, -0.5F, -0.7864F, -0.5846F, 1, 1, 1, 0.001F, false));

        this.cube_r120 = new AdvancedModelRenderer(this);
        this.cube_r120.setRotationPoint(-3.0213F, 1.1518F, -2.1929F);
        this.neck.addChild(cube_r120);
        this.setRotateAngle(cube_r120, -0.3927F, 0.0F, -1.9635F);
        this.cube_r120.cubeList.add(new ModelBox(cube_r120, 92, 80, -0.5F, -0.0533F, -1.0166F, 1, 1, 1, 0.0F, false));

        this.cube_r121 = new AdvancedModelRenderer(this);
        this.cube_r121.setRotationPoint(-3.0213F, 1.1518F, -2.1929F);
        this.neck.addChild(cube_r121);
        this.setRotateAngle(cube_r121, -0.5236F, 0.0F, -1.9635F);
        this.cube_r121.cubeList.add(new ModelBox(cube_r121, 85, 83, -0.5F, -0.7125F, -0.3742F, 1, 1, 2, -0.001F, false));

        this.cube_r122 = new AdvancedModelRenderer(this);
        this.cube_r122.setRotationPoint(-3.1213F, -0.3982F, -2.1929F);
        this.neck.addChild(cube_r122);
        this.setRotateAngle(cube_r122, 0.48F, 0.0F, -1.3963F);
        this.cube_r122.cubeList.add(new ModelBox(cube_r122, 92, 0, -0.5F, -0.7864F, -0.5846F, 1, 1, 1, 0.01F, false));

        this.cube_r123 = new AdvancedModelRenderer(this);
        this.cube_r123.setRotationPoint(-3.1213F, -0.3982F, -2.1929F);
        this.neck.addChild(cube_r123);
        this.setRotateAngle(cube_r123, -0.3927F, 0.0F, -1.3963F);
        this.cube_r123.cubeList.add(new ModelBox(cube_r123, 54, 93, -0.5F, -0.0533F, -1.0166F, 1, 1, 1, 0.0F, false));

        this.cube_r124 = new AdvancedModelRenderer(this);
        this.cube_r124.setRotationPoint(-3.1213F, -0.3982F, -2.1929F);
        this.neck.addChild(cube_r124);
        this.setRotateAngle(cube_r124, -0.5236F, 0.0F, -1.3963F);
        this.cube_r124.cubeList.add(new ModelBox(cube_r124, 0, 86, -0.5F, -0.7125F, -0.3742F, 1, 1, 2, -0.001F, false));

        this.cube_r125 = new AdvancedModelRenderer(this);
        this.cube_r125.setRotationPoint(3.0213F, 1.1518F, -2.1929F);
        this.neck.addChild(cube_r125);
        this.setRotateAngle(cube_r125, 0.48F, 0.0F, 1.9635F);
        this.cube_r125.cubeList.add(new ModelBox(cube_r125, 92, 20, -0.5F, -0.7864F, -0.5846F, 1, 1, 1, 0.001F, false));

        this.cube_r126 = new AdvancedModelRenderer(this);
        this.cube_r126.setRotationPoint(3.0213F, 1.1518F, -2.1929F);
        this.neck.addChild(cube_r126);
        this.setRotateAngle(cube_r126, -0.3927F, 0.0F, 1.9635F);
        this.cube_r126.cubeList.add(new ModelBox(cube_r126, 92, 23, -0.5F, -0.0533F, -1.0166F, 1, 1, 1, 0.0F, false));

        this.cube_r127 = new AdvancedModelRenderer(this);
        this.cube_r127.setRotationPoint(3.0213F, 1.1518F, -2.1929F);
        this.neck.addChild(cube_r127);
        this.setRotateAngle(cube_r127, -0.5236F, 0.0F, 1.9635F);
        this.cube_r127.cubeList.add(new ModelBox(cube_r127, 85, 23, -0.5F, -0.7125F, -0.3742F, 1, 1, 2, -0.001F, false));

        this.cube_r128 = new AdvancedModelRenderer(this);
        this.cube_r128.setRotationPoint(3.1213F, -0.3982F, -2.1929F);
        this.neck.addChild(cube_r128);
        this.setRotateAngle(cube_r128, 0.48F, 0.0F, 1.3963F);
        this.cube_r128.cubeList.add(new ModelBox(cube_r128, 89, 91, -0.5F, -0.7864F, -0.5846F, 1, 1, 1, 0.01F, false));

        this.cube_r129 = new AdvancedModelRenderer(this);
        this.cube_r129.setRotationPoint(3.1213F, -0.3982F, -2.1929F);
        this.neck.addChild(cube_r129);
        this.setRotateAngle(cube_r129, -0.3927F, 0.0F, 1.3963F);
        this.cube_r129.cubeList.add(new ModelBox(cube_r129, 93, 49, -0.5F, -0.0533F, -1.0166F, 1, 1, 1, 0.0F, false));

        this.cube_r130 = new AdvancedModelRenderer(this);
        this.cube_r130.setRotationPoint(3.1213F, -0.3982F, -2.1929F);
        this.neck.addChild(cube_r130);
        this.setRotateAngle(cube_r130, -0.5236F, 0.0F, 1.3963F);
        this.cube_r130.cubeList.add(new ModelBox(cube_r130, 85, 19, -0.5F, -0.7125F, -0.3742F, 1, 1, 2, -0.001F, false));

        this.cube_r131 = new AdvancedModelRenderer(this);
        this.cube_r131.setRotationPoint(1.167F, -1.5339F, -1.6014F);
        this.neck.addChild(cube_r131);
        this.setRotateAngle(cube_r131, 0.5672F, 0.0F, 0.2182F);
        this.cube_r131.cubeList.add(new ModelBox(cube_r131, 85, 15, 0.0F, -0.7F, -1.8F, 1, 1, 2, 0.0F, false));

        this.cube_r132 = new AdvancedModelRenderer(this);
        this.cube_r132.setRotationPoint(-1.225F, -1.7956F, -4.6807F);
        this.neck.addChild(cube_r132);
        this.setRotateAngle(cube_r132, -0.5236F, 0.0F, -0.2182F);
        this.cube_r132.cubeList.add(new ModelBox(cube_r132, 87, 35, -1.0F, -1.8075F, 2.3007F, 1, 1, 2, -0.001F, false));

        this.cube_r133 = new AdvancedModelRenderer(this);
        this.cube_r133.setRotationPoint(-1.167F, -1.5339F, -1.6014F);
        this.neck.addChild(cube_r133);
        this.setRotateAngle(cube_r133, 0.5672F, 0.0F, -0.2182F);
        this.cube_r133.cubeList.add(new ModelBox(cube_r133, 87, 39, -1.0F, -0.7F, -1.8F, 1, 1, 2, 0.0F, false));

        this.cube_r134 = new AdvancedModelRenderer(this);
        this.cube_r134.setRotationPoint(1.225F, -1.7956F, -4.6807F);
        this.neck.addChild(cube_r134);
        this.setRotateAngle(cube_r134, -0.5236F, 0.0F, 0.2182F);
        this.cube_r134.cubeList.add(new ModelBox(cube_r134, 55, 84, 0.0F, -1.8075F, 2.3007F, 1, 1, 2, -0.001F, false));

        this.cube_r135 = new AdvancedModelRenderer(this);
        this.cube_r135.setRotationPoint(-1.0F, -0.1034F, -5.1679F);
        this.neck.addChild(cube_r135);
        this.setRotateAngle(cube_r135, -0.1309F, 0.0F, 0.0F);
        this.cube_r135.cubeList.add(new ModelBox(cube_r135, 52, 61, -2.0F, -1.9F, 1.5F, 6, 4, 5, 0.0F, false));

        this.neck2 = new AdvancedModelRenderer(this);
        this.neck2.setRotationPoint(0.0F, -0.5035F, -3.4222F);
        this.neck.addChild(neck2);


        this.cube_r136 = new AdvancedModelRenderer(this);
        this.cube_r136.setRotationPoint(-2.4205F, 0.8319F, -1.2879F);
        this.neck2.addChild(cube_r136);
        this.setRotateAngle(cube_r136, -0.5007F, 0.1289F, -1.9184F);
        this.cube_r136.cubeList.add(new ModelBox(cube_r136, 92, 83, -0.5F, -0.5287F, -0.3044F, 1, 1, 1, -0.001F, false));

        this.cube_r137 = new AdvancedModelRenderer(this);
        this.cube_r137.setRotationPoint(-2.4205F, 0.8319F, -1.2879F);
        this.neck2.addChild(cube_r137);
        this.setRotateAngle(cube_r137, 1.8555F, 0.1289F, -1.9184F);
        this.cube_r137.cubeList.add(new ModelBox(cube_r137, 40, 95, -0.5F, -0.7859F, -0.4084F, 1, 1, 1, 0.0F, false));

        this.cube_r138 = new AdvancedModelRenderer(this);
        this.cube_r138.setRotationPoint(-2.6F, -0.092F, -1.2585F);
        this.neck2.addChild(cube_r138);
        this.setRotateAngle(cube_r138, -0.5236F, 0.0F, -1.3963F);
        this.cube_r138.cubeList.add(new ModelBox(cube_r138, 0, 93, 0.0F, -0.3075F, -0.2993F, 1, 1, 1, -0.001F, false));

        this.cube_r139 = new AdvancedModelRenderer(this);
        this.cube_r139.setRotationPoint(-2.6F, -0.092F, -1.2585F);
        this.neck2.addChild(cube_r139);
        this.setRotateAngle(cube_r139, 1.3526F, 0.0F, -1.3963F);
        this.cube_r139.cubeList.add(new ModelBox(cube_r139, 95, 58, 0.0F, -1.1384F, -0.5608F, 1, 1, 1, 0.0F, false));

        this.cube_r140 = new AdvancedModelRenderer(this);
        this.cube_r140.setRotationPoint(0.85F, -1.292F, -1.2585F);
        this.neck2.addChild(cube_r140);
        this.setRotateAngle(cube_r140, 0.8727F, 0.0F, 0.2182F);
        this.cube_r140.cubeList.add(new ModelBox(cube_r140, 94, 89, 0.0F, -0.9384F, -1.1608F, 1, 1, 1, 0.0F, false));

        this.cube_r141 = new AdvancedModelRenderer(this);
        this.cube_r141.setRotationPoint(0.85F, -1.292F, -1.2585F);
        this.neck2.addChild(cube_r141);
        this.setRotateAngle(cube_r141, 0.4363F, 0.0F, 0.2182F);
        this.cube_r141.cubeList.add(new ModelBox(cube_r141, 92, 6, 0.0F, -0.7546F, -0.5149F, 1, 1, 1, -0.001F, false));

        this.cube_r142 = new AdvancedModelRenderer(this);
        this.cube_r142.setRotationPoint(0.85F, -1.292F, -1.2585F);
        this.neck2.addChild(cube_r142);
        this.setRotateAngle(cube_r142, -0.5236F, 0.0F, 0.2182F);
        this.cube_r142.cubeList.add(new ModelBox(cube_r142, 35, 87, 0.0F, -0.8075F, -0.2993F, 1, 1, 2, 0.0F, false));

        this.cube_r143 = new AdvancedModelRenderer(this);
        this.cube_r143.setRotationPoint(-0.85F, -1.292F, -1.2585F);
        this.neck2.addChild(cube_r143);
        this.setRotateAngle(cube_r143, 0.8727F, 0.0F, -0.2182F);
        this.cube_r143.cubeList.add(new ModelBox(cube_r143, 86, 94, -1.0F, -0.9384F, -1.1608F, 1, 1, 1, 0.0F, false));

        this.cube_r144 = new AdvancedModelRenderer(this);
        this.cube_r144.setRotationPoint(-0.85F, -1.292F, -1.2585F);
        this.neck2.addChild(cube_r144);
        this.setRotateAngle(cube_r144, 0.4363F, 0.0F, -0.2182F);
        this.cube_r144.cubeList.add(new ModelBox(cube_r144, 92, 3, -1.0F, -0.7546F, -0.5149F, 1, 1, 1, -0.001F, false));

        this.cube_r145 = new AdvancedModelRenderer(this);
        this.cube_r145.setRotationPoint(-0.85F, -1.292F, -1.2585F);
        this.neck2.addChild(cube_r145);
        this.setRotateAngle(cube_r145, -0.5236F, 0.0F, -0.2182F);
        this.cube_r145.cubeList.add(new ModelBox(cube_r145, 28, 87, -1.0F, -0.8075F, -0.2993F, 1, 1, 2, 0.0F, false));

        this.cube_r146 = new AdvancedModelRenderer(this);
        this.cube_r146.setRotationPoint(2.4205F, 0.8319F, -1.2879F);
        this.neck2.addChild(cube_r146);
        this.setRotateAngle(cube_r146, -0.5007F, -0.1289F, 1.9184F);
        this.cube_r146.cubeList.add(new ModelBox(cube_r146, 92, 17, -0.5F, -0.5287F, -0.3044F, 1, 1, 1, -0.001F, false));

        this.cube_r147 = new AdvancedModelRenderer(this);
        this.cube_r147.setRotationPoint(2.4205F, 0.8319F, -1.2879F);
        this.neck2.addChild(cube_r147);
        this.setRotateAngle(cube_r147, 1.8555F, -0.1289F, 1.9184F);
        this.cube_r147.cubeList.add(new ModelBox(cube_r147, 95, 9, -0.5F, -0.7859F, -0.4084F, 1, 1, 1, 0.0F, false));

        this.cube_r148 = new AdvancedModelRenderer(this);
        this.cube_r148.setRotationPoint(2.6F, -0.092F, -1.2585F);
        this.neck2.addChild(cube_r148);
        this.setRotateAngle(cube_r148, -0.5236F, 0.0F, 1.3963F);
        this.cube_r148.cubeList.add(new ModelBox(cube_r148, 92, 14, -1.0F, -0.3075F, -0.2993F, 1, 1, 1, -0.001F, false));

        this.cube_r149 = new AdvancedModelRenderer(this);
        this.cube_r149.setRotationPoint(2.6F, -0.092F, -1.2585F);
        this.neck2.addChild(cube_r149);
        this.setRotateAngle(cube_r149, 1.3526F, 0.0F, 1.3963F);
        this.cube_r149.cubeList.add(new ModelBox(cube_r149, 91, 94, -1.0F, -1.1384F, -0.5608F, 1, 1, 1, 0.0F, false));

        this.cube_r150 = new AdvancedModelRenderer(this);
        this.cube_r150.setRotationPoint(-1.0F, 3.0001F, -1.7456F);
        this.neck2.addChild(cube_r150);
        this.setRotateAngle(cube_r150, -0.0873F, 0.0F, 0.0F);
        this.cube_r150.cubeList.add(new ModelBox(cube_r150, 44, 71, -1.0F, -1.7F, -2.0F, 4, 1, 4, 0.0F, false));

        this.cube_r151 = new AdvancedModelRenderer(this);
        this.cube_r151.setRotationPoint(-0.5F, 0.4001F, -1.7456F);
        this.neck2.addChild(cube_r151);
        this.setRotateAngle(cube_r151, -0.0873F, 0.0F, 0.0F);
        this.cube_r151.cubeList.add(new ModelBox(cube_r151, 68, 38, -2.0F, -1.7F, -2.0F, 5, 3, 4, 0.0F, false));

        this.head = new AdvancedModelRenderer(this);
        this.head.setRotationPoint(0.0F, -0.5002F, -3.5904F);
        this.neck2.addChild(head);


        this.cube_r152 = new AdvancedModelRenderer(this);
        this.cube_r152.setRotationPoint(-0.7873F, 0.8323F, -2.5586F);
        this.head.addChild(cube_r152);
        this.setRotateAngle(cube_r152, 0.2633F, -0.654F, -0.0918F);
        this.cube_r152.cubeList.add(new ModelBox(cube_r152, 77, 54, -1.0F, -1.0F, -1.5F, 2, 2, 3, 0.0F, false));

        this.cube_r153 = new AdvancedModelRenderer(this);
        this.cube_r153.setRotationPoint(-2.25F, -0.6741F, -0.7039F);
        this.head.addChild(cube_r153);
        this.setRotateAngle(cube_r153, 0.0873F, -0.1745F, 0.0F);
        this.cube_r153.cubeList.add(new ModelBox(cube_r153, 30, 81, -0.5F, -0.3567F, -1.5339F, 2, 3, 2, 0.0F, false));
        this.cube_r153.cubeList.add(new ModelBox(cube_r153, 93, 65, -0.6F, 0.6433F, -1.4839F, 1, 1, 1, 0.0F, false));

        this.cube_r154 = new AdvancedModelRenderer(this);
        this.cube_r154.setRotationPoint(-2.225F, -0.6741F, -0.7039F);
        this.head.addChild(cube_r154);
        this.setRotateAngle(cube_r154, 0.5236F, -0.1745F, 0.0F);
        this.cube_r154.cubeList.add(new ModelBox(cube_r154, 83, 5, -0.5F, -0.4043F, -0.9555F, 2, 2, 2, -0.001F, false));

        this.cube_r155 = new AdvancedModelRenderer(this);
        this.cube_r155.setRotationPoint(2.225F, -0.6741F, -0.7039F);
        this.head.addChild(cube_r155);
        this.setRotateAngle(cube_r155, 0.5236F, 0.1745F, 0.0F);
        this.cube_r155.cubeList.add(new ModelBox(cube_r155, 83, 0, -1.5F, -0.4043F, -0.9555F, 2, 2, 2, -0.001F, false));

        this.cube_r156 = new AdvancedModelRenderer(this);
        this.cube_r156.setRotationPoint(0.0F, 1.1968F, -4.7119F);
        this.head.addChild(cube_r156);
        this.setRotateAngle(cube_r156, -0.6981F, 0.0F, 0.0F);
        this.cube_r156.cubeList.add(new ModelBox(cube_r156, 87, 43, -1.0F, -0.7F, -1.1F, 2, 1, 1, 0.001F, false));

        this.cube_r157 = new AdvancedModelRenderer(this);
        this.cube_r157.setRotationPoint(2.25F, -0.6741F, -0.7039F);
        this.head.addChild(cube_r157);
        this.setRotateAngle(cube_r157, 0.0873F, 0.1745F, 0.0F);
        this.cube_r157.cubeList.add(new ModelBox(cube_r157, 93, 62, -0.4F, 0.6433F, -1.4839F, 1, 1, 1, 0.0F, false));
        this.cube_r157.cubeList.add(new ModelBox(cube_r157, 76, 80, -1.5F, -0.3567F, -1.5339F, 2, 3, 2, 0.0F, false));

        this.cube_r158 = new AdvancedModelRenderer(this);
        this.cube_r158.setRotationPoint(0.0F, 0.1968F, -4.7119F);
        this.head.addChild(cube_r158);
        this.setRotateAngle(cube_r158, 0.2182F, 0.0F, 0.0F);
        this.cube_r158.cubeList.add(new ModelBox(cube_r158, 30, 74, -1.0F, -0.4F, -0.35F, 2, 2, 4, 0.0F, false));

        this.cube_r159 = new AdvancedModelRenderer(this);
        this.cube_r159.setRotationPoint(0.0F, 1.6968F, -4.7119F);
        this.head.addChild(cube_r159);
        this.setRotateAngle(cube_r159, 0.0873F, 0.0F, 0.0F);
        this.cube_r159.cubeList.add(new ModelBox(cube_r159, 48, 84, -1.0F, -1.1F, -1.0F, 2, 2, 1, 0.0025F, false));

        this.cube_r160 = new AdvancedModelRenderer(this);
        this.cube_r160.setRotationPoint(0.0F, 2.3088F, -4.9963F);
        this.head.addChild(cube_r160);
        this.setRotateAngle(cube_r160, 0.1309F, 0.0F, 0.0F);
        this.cube_r160.cubeList.add(new ModelBox(cube_r160, 88, 59, -1.0F, -0.5F, -0.7F, 2, 1, 1, 0.015F, false));

        this.cube_r161 = new AdvancedModelRenderer(this);
        this.cube_r161.setRotationPoint(0.0F, 2.8064F, -4.6527F);
        this.head.addChild(cube_r161);
        this.setRotateAngle(cube_r161, 0.3622F, 0.0F, 0.0F);
        this.cube_r161.cubeList.add(new ModelBox(cube_r161, 69, 10, -1.0F, -1.05F, 0.025F, 2, 1, 3, 0.013F, false));

        this.cube_r162 = new AdvancedModelRenderer(this);
        this.cube_r162.setRotationPoint(0.7873F, 0.8323F, -2.5586F);
        this.head.addChild(cube_r162);
        this.setRotateAngle(cube_r162, 0.2633F, 0.654F, 0.0918F);
        this.cube_r162.cubeList.add(new ModelBox(cube_r162, 43, 77, -1.0F, -1.0F, -1.5F, 2, 2, 3, 0.0F, false));

        this.cube_r163 = new AdvancedModelRenderer(this);
        this.cube_r163.setRotationPoint(1.5F, 0.8003F, -3.4052F);
        this.head.addChild(cube_r163);
        this.setRotateAngle(cube_r163, 0.2618F, 0.0F, 0.0F);
        this.cube_r163.cubeList.add(new ModelBox(cube_r163, 65, 78, -3.0F, -0.75F, 1.95F, 3, 2, 2, 0.0F, false));

        this.cube_r164 = new AdvancedModelRenderer(this);
        this.cube_r164.setRotationPoint(0.0F, -1.1839F, -1.2098F);
        this.head.addChild(cube_r164);
        this.setRotateAngle(cube_r164, 0.2967F, 0.0F, 0.0F);
        this.cube_r164.cubeList.add(new ModelBox(cube_r164, 54, 78, -1.0F, 0.0201F, -1.9431F, 2, 2, 3, -0.01F, false));

        this.jaw = new AdvancedModelRenderer(this);
        this.jaw.setRotationPoint(0.0F, 1.1491F, 0.3217F);
        this.head.addChild(jaw);
        this.setRotateAngle(jaw, -0.1309F, 0.0F, 0.0F);


        this.cube_r165 = new AdvancedModelRenderer(this);
        this.cube_r165.setRotationPoint(0.0F, 2.0446F, -3.9656F);
        this.jaw.addChild(cube_r165);
        this.setRotateAngle(cube_r165, 0.48F, 0.0F, 0.0F);
        this.cube_r165.cubeList.add(new ModelBox(cube_r165, 49, 14, -1.0F, -0.4F, -0.4F, 2, 1, 3, 0.01F, false));

        this.cube_r166 = new AdvancedModelRenderer(this);
        this.cube_r166.setRotationPoint(0.0F, 2.0446F, -3.9656F);
        this.jaw.addChild(cube_r166);
        this.setRotateAngle(cube_r166, 0.1745F, 0.0F, 0.0F);
        this.cube_r166.cubeList.add(new ModelBox(cube_r166, 49, 88, -1.0F, -0.3F, -1.2F, 2, 1, 1, 0.0F, false));

        this.cube_r167 = new AdvancedModelRenderer(this);
        this.cube_r167.setRotationPoint(-0.9421F, 1.1862F, -2.6937F);
        this.jaw.addChild(cube_r167);
        this.setRotateAngle(cube_r167, 0.2934F, -0.4623F, -0.1339F);
        this.cube_r167.cubeList.add(new ModelBox(cube_r167, 56, 88, -0.5F, -2.0F, -1.0F, 0, 2, 2, 0.0F, false));
        this.cube_r167.cubeList.add(new ModelBox(cube_r167, 79, 87, -0.5F, 0.0F, -1.0F, 1, 1, 2, 0.0F, false));

        this.cube_r168 = new AdvancedModelRenderer(this);
        this.cube_r168.setRotationPoint(0.9421F, 1.1862F, -2.6937F);
        this.jaw.addChild(cube_r168);
        this.setRotateAngle(cube_r168, 0.2934F, 0.4623F, 0.1339F);
        this.cube_r168.cubeList.add(new ModelBox(cube_r168, 62, 87, -0.5F, 0.0F, -1.0F, 1, 1, 2, 0.0F, false));
        this.cube_r168.cubeList.add(new ModelBox(cube_r168, 88, 54, 0.5F, -2.0F, -1.0F, 0, 2, 2, 0.0F, false));

        this.cube_r169 = new AdvancedModelRenderer(this);
        this.cube_r169.setRotationPoint(0.0F, -0.3487F, -3.7269F);
        this.jaw.addChild(cube_r169);
        this.setRotateAngle(cube_r169, 0.2618F, 0.0F, 0.0F);
        this.cube_r169.cubeList.add(new ModelBox(cube_r169, 39, 83, -1.0F, 1.75F, -0.45F, 2, 1, 2, 0.005F, false));
        this.cube_r169.cubeList.add(new ModelBox(cube_r169, 61, 71, -2.0F, -0.25F, 1.15F, 4, 3, 3, 0.001F, false));

        this.tail1 = new AdvancedModelRenderer(this);
        this.tail1.setRotationPoint(0.0F, -1.4585F, 3.6452F);
        this.base.addChild(tail1);


        this.cube_r170 = new AdvancedModelRenderer(this);
        this.cube_r170.setRotationPoint(-1.5F, 1.6976F, 5.2006F);
        this.tail1.addChild(cube_r170);
        this.setRotateAngle(cube_r170, -0.2618F, 0.0F, 0.0F);
        this.cube_r170.cubeList.add(new ModelBox(cube_r170, 52, 48, 0.0F, -0.5F, -5.5F, 3, 3, 9, 0.0F, false));

        this.tailOsteodermsRight1 = new AdvancedModelRenderer(this);
        this.tailOsteodermsRight1.setRotationPoint(-1.0F, -0.0285F, 1.379F);
        this.tail1.addChild(tailOsteodermsRight1);


        this.cube_r171 = new AdvancedModelRenderer(this);
        this.cube_r171.setRotationPoint(-0.1F, 2.4182F, -0.5427F);
        this.tailOsteodermsRight1.addChild(cube_r171);
        this.setRotateAngle(cube_r171, -0.2668F, -1.0377F, 0.0576F);
        this.cube_r171.cubeList.add(new ModelBox(cube_r171, 72, 86, -0.1768F, -1.5659F, -0.0113F, 1, 1, 2, 0.0F, true));

        this.cube_r172 = new AdvancedModelRenderer(this);
        this.cube_r172.setRotationPoint(-1.7F, 2.4682F, 0.8573F);
        this.tailOsteodermsRight1.addChild(cube_r172);
        this.setRotateAngle(cube_r172, -1.3444F, -1.3993F, 1.1741F);
        this.cube_r172.cubeList.add(new ModelBox(cube_r172, 86, 50, -0.5349F, -1.1823F, -1.7557F, 1, 1, 2, 0.0F, true));

        this.cube_r173 = new AdvancedModelRenderer(this);
        this.cube_r173.setRotationPoint(-0.4909F, 2.2032F, 1.8199F);
        this.tailOsteodermsRight1.addChild(cube_r173);
        this.setRotateAngle(cube_r173, -0.3568F, -1.0227F, 0.1727F);
        this.cube_r173.cubeList.add(new ModelBox(cube_r173, 42, 88, -0.0322F, -0.7374F, -0.0887F, 1, 1, 2, 0.0F, true));

        this.cube_r174 = new AdvancedModelRenderer(this);
        this.cube_r174.setRotationPoint(-1.35F, 2.7682F, 3.0323F);
        this.tailOsteodermsRight1.addChild(cube_r174);
        this.setRotateAngle(cube_r174, -1.327F, -1.3993F, 1.1741F);
        this.cube_r174.cubeList.add(new ModelBox(cube_r174, 88, 10, -0.4923F, -0.931F, -1.7618F, 1, 1, 2, 0.0F, true));

        this.cube_r175 = new AdvancedModelRenderer(this);
        this.cube_r175.setRotationPoint(-0.9F, 3.6182F, 4.8573F);
        this.tailOsteodermsRight1.addChild(cube_r175);
        this.setRotateAngle(cube_r175, -0.3566F, -0.8388F, 0.2804F);
        this.cube_r175.cubeList.add(new ModelBox(cube_r175, 44, 62, -0.4728F, -1.2277F, -1.6477F, 1, 1, 2, 0.0F, true));

        this.cube_r176 = new AdvancedModelRenderer(this);
        this.cube_r176.setRotationPoint(-1.3584F, 3.6687F, 5.3138F);
        this.tailOsteodermsRight1.addChild(cube_r176);
        this.setRotateAngle(cube_r176, -2.3798F, -1.2438F, 2.412F);
        this.cube_r176.cubeList.add(new ModelBox(cube_r176, 86, 46, -0.5349F, -1.1823F, -1.7557F, 1, 1, 2, 0.0F, true));

        this.cube_r177 = new AdvancedModelRenderer(this);
        this.cube_r177.setRotationPoint(0.5F, 0.9842F, 2.985F);
        this.tailOsteodermsRight1.addChild(cube_r177);
        this.setRotateAngle(cube_r177, -0.2223F, 0.1395F, 0.5516F);
        this.cube_r177.cubeList.add(new ModelBox(cube_r177, 64, 15, -0.6F, 0.0F, -4.5F, 1, 0, 9, 0.0F, true));

        this.tailOsteodermsLeft1 = new AdvancedModelRenderer(this);
        this.tailOsteodermsLeft1.setRotationPoint(1.0F, -0.0285F, 1.379F);
        this.tail1.addChild(tailOsteodermsLeft1);


        this.cube_r178 = new AdvancedModelRenderer(this);
        this.cube_r178.setRotationPoint(0.1F, 2.4182F, -0.5427F);
        this.tailOsteodermsLeft1.addChild(cube_r178);
        this.setRotateAngle(cube_r178, -0.2668F, 1.0377F, -0.0576F);
        this.cube_r178.cubeList.add(new ModelBox(cube_r178, 72, 86, -0.8232F, -1.5659F, -0.0113F, 1, 1, 2, 0.0F, false));

        this.cube_r179 = new AdvancedModelRenderer(this);
        this.cube_r179.setRotationPoint(1.7F, 2.4682F, 0.8573F);
        this.tailOsteodermsLeft1.addChild(cube_r179);
        this.setRotateAngle(cube_r179, -1.3444F, 1.3993F, -1.1741F);
        this.cube_r179.cubeList.add(new ModelBox(cube_r179, 86, 50, -0.4651F, -1.1823F, -1.7557F, 1, 1, 2, 0.0F, false));

        this.cube_r180 = new AdvancedModelRenderer(this);
        this.cube_r180.setRotationPoint(0.4909F, 2.2032F, 1.8199F);
        this.tailOsteodermsLeft1.addChild(cube_r180);
        this.setRotateAngle(cube_r180, -0.3568F, 1.0227F, -0.1727F);
        this.cube_r180.cubeList.add(new ModelBox(cube_r180, 42, 88, -0.9678F, -0.7374F, -0.0887F, 1, 1, 2, 0.0F, false));

        this.cube_r181 = new AdvancedModelRenderer(this);
        this.cube_r181.setRotationPoint(1.35F, 2.7682F, 3.0323F);
        this.tailOsteodermsLeft1.addChild(cube_r181);
        this.setRotateAngle(cube_r181, -1.327F, 1.3993F, -1.1741F);
        this.cube_r181.cubeList.add(new ModelBox(cube_r181, 88, 10, -0.5077F, -0.931F, -1.7618F, 1, 1, 2, 0.0F, false));

        this.cube_r182 = new AdvancedModelRenderer(this);
        this.cube_r182.setRotationPoint(0.9F, 3.6182F, 4.8573F);
        this.tailOsteodermsLeft1.addChild(cube_r182);
        this.setRotateAngle(cube_r182, -0.3566F, 0.8388F, -0.2804F);
        this.cube_r182.cubeList.add(new ModelBox(cube_r182, 44, 62, -0.5272F, -1.2277F, -1.6477F, 1, 1, 2, 0.0F, false));

        this.cube_r183 = new AdvancedModelRenderer(this);
        this.cube_r183.setRotationPoint(1.3584F, 3.6687F, 5.3138F);
        this.tailOsteodermsLeft1.addChild(cube_r183);
        this.setRotateAngle(cube_r183, -2.3798F, 1.2438F, -2.412F);
        this.cube_r183.cubeList.add(new ModelBox(cube_r183, 86, 46, -0.4651F, -1.1823F, -1.7557F, 1, 1, 2, 0.0F, false));

        this.cube_r184 = new AdvancedModelRenderer(this);
        this.cube_r184.setRotationPoint(-0.5F, 0.9842F, 2.985F);
        this.tailOsteodermsLeft1.addChild(cube_r184);
        this.setRotateAngle(cube_r184, -0.2223F, -0.1395F, -0.5516F);
        this.cube_r184.cubeList.add(new ModelBox(cube_r184, 64, 15, -0.4F, 0.0F, -4.5F, 1, 0, 9, 0.0F, false));

        this.tail2 = new AdvancedModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, 2.7461F, 8.1911F);
        this.tail1.addChild(tail2);


        this.cube_r185 = new AdvancedModelRenderer(this);
        this.cube_r185.setRotationPoint(1.0F, -1.0486F, -2.9905F);
        this.tail2.addChild(cube_r185);
        this.setRotateAngle(cube_r185, -0.0873F, 0.0F, 0.0F);
        this.cube_r185.cubeList.add(new ModelBox(cube_r185, 33, 19, -2.0F, 0.5F, 2.25F, 2, 2, 13, 0.0F, false));

        this.tailOsteodermsRight2 = new AdvancedModelRenderer(this);
        this.tailOsteodermsRight2.setRotationPoint(-1.5629F, 0.6115F, 1.072F);
        this.tail2.addChild(tailOsteodermsRight2);


        this.cube_r186 = new AdvancedModelRenderer(this);
        this.cube_r186.setRotationPoint(0.4F, 0.0F, -0.7F);
        this.tailOsteodermsRight2.addChild(cube_r186);
        this.setRotateAngle(cube_r186, -0.2645F, -0.8445F, 0.1259F);
        this.cube_r186.cubeList.add(new ModelBox(cube_r186, 41, 15, -0.7425F, -0.443F, -1.1457F, 2, 1, 2, 0.0F, true));

        this.cube_r187 = new AdvancedModelRenderer(this);
        this.cube_r187.setRotationPoint(-0.7719F, -0.3691F, -0.6522F);
        this.tailOsteodermsRight2.addChild(cube_r187);
        this.setRotateAngle(cube_r187, -2.6761F, -1.1148F, 2.6151F);
        this.cube_r187.cubeList.add(new ModelBox(cube_r187, 21, 87, 0.0F, 0.0F, -2.0F, 1, 1, 2, 0.0F, true));

        this.cube_r188 = new AdvancedModelRenderer(this);
        this.cube_r188.setRotationPoint(0.3F, 0.3F, 2.2F);
        this.tailOsteodermsRight2.addChild(cube_r188);
        this.setRotateAngle(cube_r188, -0.2129F, -0.9277F, 0.0521F);
        this.cube_r188.cubeList.add(new ModelBox(cube_r188, 93, 46, 0.2575F, -0.443F, -0.4457F, 1, 1, 1, 0.0F, true));
        this.cube_r188.cubeList.add(new ModelBox(cube_r188, 17, 70, -0.7425F, -0.443F, -1.1457F, 1, 1, 2, 0.0F, true));

        this.cube_r189 = new AdvancedModelRenderer(this);
        this.cube_r189.setRotationPoint(-0.8736F, -0.0141F, 2.1627F);
        this.tailOsteodermsRight2.addChild(cube_r189);
        this.setRotateAngle(cube_r189, -2.7854F, -1.2098F, 2.6797F);
        this.cube_r189.cubeList.add(new ModelBox(cube_r189, 14, 87, 0.0F, 0.0F, -2.0F, 1, 1, 2, 0.0F, true));

        this.cube_r190 = new AdvancedModelRenderer(this);
        this.cube_r190.setRotationPoint(0.2F, 0.5F, 5.0F);
        this.tailOsteodermsRight2.addChild(cube_r190);
        this.setRotateAngle(cube_r190, -0.1473F, -0.8836F, 0.0396F);
        this.cube_r190.cubeList.add(new ModelBox(cube_r190, 44, 66, -0.5675F, -0.393F, -1.2457F, 1, 1, 2, 0.0F, true));

        this.cube_r191 = new AdvancedModelRenderer(this);
        this.cube_r191.setRotationPoint(-0.1357F, 0.2085F, 5.8442F);
        this.tailOsteodermsRight2.addChild(cube_r191);
        this.setRotateAngle(cube_r191, -2.9157F, -1.1297F, 2.8576F);
        this.cube_r191.cubeList.add(new ModelBox(cube_r191, 7, 87, -1.0F, 0.0115F, -2.0F, 1, 1, 2, 0.0F, true));

        this.cube_r192 = new AdvancedModelRenderer(this);
        this.cube_r192.setRotationPoint(0.7061F, 0.9842F, 9.2273F);
        this.tailOsteodermsRight2.addChild(cube_r192);
        this.setRotateAngle(cube_r192, 0.0288F, -0.6079F, -0.0197F);
        this.cube_r192.cubeList.add(new ModelBox(cube_r192, 35, 94, -0.2534F, -0.5011F, -0.1638F, 1, 1, 1, 0.0F, true));

        this.cube_r193 = new AdvancedModelRenderer(this);
        this.cube_r193.setRotationPoint(0.7135F, 0.7941F, 7.3096F);
        this.tailOsteodermsRight2.addChild(cube_r193);
        this.setRotateAngle(cube_r193, -3.0017F, -0.8044F, 2.9847F);
        this.cube_r193.cubeList.add(new ModelBox(cube_r193, 79, 11, -1.1F, -0.5F, -1.425F, 2, 1, 2, 0.0F, true));

        this.cube_r194 = new AdvancedModelRenderer(this);
        this.cube_r194.setRotationPoint(1.5629F, -0.8874F, -0.9681F);
        this.tailOsteodermsRight2.addChild(cube_r194);
        this.setRotateAngle(cube_r194, -0.0695F, 0.0729F, 0.5628F);
        this.cube_r194.cubeList.add(new ModelBox(cube_r194, 0, 47, -0.9F, 0.2F, 0.075F, 1, 0, 12, 0.0F, true));

        this.tailOsteodermsLeft2 = new AdvancedModelRenderer(this);
        this.tailOsteodermsLeft2.setRotationPoint(1.5629F, 0.6115F, 1.072F);
        this.tail2.addChild(tailOsteodermsLeft2);


        this.cube_r195 = new AdvancedModelRenderer(this);
        this.cube_r195.setRotationPoint(-0.4F, 0.0F, -0.7F);
        this.tailOsteodermsLeft2.addChild(cube_r195);
        this.setRotateAngle(cube_r195, -0.2645F, 0.8445F, -0.1259F);
        this.cube_r195.cubeList.add(new ModelBox(cube_r195, 41, 15, -1.2575F, -0.443F, -1.1457F, 2, 1, 2, 0.0F, false));

        this.cube_r196 = new AdvancedModelRenderer(this);
        this.cube_r196.setRotationPoint(0.7719F, -0.3691F, -0.6522F);
        this.tailOsteodermsLeft2.addChild(cube_r196);
        this.setRotateAngle(cube_r196, -2.6761F, 1.1148F, -2.6151F);
        this.cube_r196.cubeList.add(new ModelBox(cube_r196, 21, 87, -1.0F, 0.0F, -2.0F, 1, 1, 2, 0.0F, false));

        this.cube_r197 = new AdvancedModelRenderer(this);
        this.cube_r197.setRotationPoint(-0.3F, 0.3F, 2.2F);
        this.tailOsteodermsLeft2.addChild(cube_r197);
        this.setRotateAngle(cube_r197, -0.2129F, 0.9277F, -0.0521F);
        this.cube_r197.cubeList.add(new ModelBox(cube_r197, 93, 46, -1.2575F, -0.443F, -0.4457F, 1, 1, 1, 0.0F, false));
        this.cube_r197.cubeList.add(new ModelBox(cube_r197, 17, 70, -0.2575F, -0.443F, -1.1457F, 1, 1, 2, 0.0F, false));

        this.cube_r198 = new AdvancedModelRenderer(this);
        this.cube_r198.setRotationPoint(0.8736F, -0.0141F, 2.1627F);
        this.tailOsteodermsLeft2.addChild(cube_r198);
        this.setRotateAngle(cube_r198, -2.7854F, 1.2098F, -2.6797F);
        this.cube_r198.cubeList.add(new ModelBox(cube_r198, 14, 87, -1.0F, 0.0F, -2.0F, 1, 1, 2, 0.0F, false));

        this.cube_r199 = new AdvancedModelRenderer(this);
        this.cube_r199.setRotationPoint(-0.2F, 0.5F, 5.0F);
        this.tailOsteodermsLeft2.addChild(cube_r199);
        this.setRotateAngle(cube_r199, -0.1473F, 0.8836F, -0.0396F);
        this.cube_r199.cubeList.add(new ModelBox(cube_r199, 44, 66, -0.4325F, -0.393F, -1.2457F, 1, 1, 2, 0.0F, false));

        this.cube_r200 = new AdvancedModelRenderer(this);
        this.cube_r200.setRotationPoint(0.1357F, 0.2085F, 5.8442F);
        this.tailOsteodermsLeft2.addChild(cube_r200);
        this.setRotateAngle(cube_r200, -2.9157F, 1.1297F, -2.8576F);
        this.cube_r200.cubeList.add(new ModelBox(cube_r200, 7, 87, 0.0F, 0.0115F, -2.0F, 1, 1, 2, 0.0F, false));

        this.cube_r201 = new AdvancedModelRenderer(this);
        this.cube_r201.setRotationPoint(-0.7061F, 0.9842F, 9.2273F);
        this.tailOsteodermsLeft2.addChild(cube_r201);
        this.setRotateAngle(cube_r201, 0.0288F, 0.6079F, 0.0197F);
        this.cube_r201.cubeList.add(new ModelBox(cube_r201, 35, 94, -0.7466F, -0.5011F, -0.1638F, 1, 1, 1, 0.0F, false));

        this.cube_r202 = new AdvancedModelRenderer(this);
        this.cube_r202.setRotationPoint(-0.7135F, 0.7941F, 7.3096F);
        this.tailOsteodermsLeft2.addChild(cube_r202);
        this.setRotateAngle(cube_r202, -3.0017F, 0.8044F, -2.9847F);
        this.cube_r202.cubeList.add(new ModelBox(cube_r202, 79, 11, -0.9F, -0.5F, -1.425F, 2, 1, 2, 0.0F, false));

        this.cube_r203 = new AdvancedModelRenderer(this);
        this.cube_r203.setRotationPoint(-1.5629F, -0.8874F, -0.9681F);
        this.tailOsteodermsLeft2.addChild(cube_r203);
        this.setRotateAngle(cube_r203, -0.0695F, -0.0729F, -0.5628F);
        this.cube_r203.cubeList.add(new ModelBox(cube_r203, 0, 47, -0.1F, 0.2F, 0.075F, 1, 0, 12, 0.0F, false));

        this.tail3 = new AdvancedModelRenderer(this);
        this.tail3.setRotationPoint(0.0F, 1.6755F, 11.939F);
        this.tail2.addChild(tail3);


        this.cube_r204 = new AdvancedModelRenderer(this);
        this.cube_r204.setRotationPoint(-1.0F, -0.6162F, 9.8975F);
        this.tail3.addChild(cube_r204);
        this.setRotateAngle(cube_r204, 0.0873F, 0.0F, 0.0F);
        this.cube_r204.cubeList.add(new ModelBox(cube_r204, 27, 48, 1.0F, -1.15F, -9.5F, 0, 1, 12, 0.0F, false));

        this.cube_r205 = new AdvancedModelRenderer(this);
        this.cube_r205.setRotationPoint(-0.5F, 0.8838F, 9.1975F);
        this.tail3.addChild(cube_r205);
        this.setRotateAngle(cube_r205, 0.0873F, 0.0F, 0.0F);
        this.cube_r205.cubeList.add(new ModelBox(cube_r205, 41, 0, 0.0F, -2.25F, -9.5F, 1, 1, 13, 0.0F, false));

        this.tailOsteodermsRight3 = new AdvancedModelRenderer(this);
        this.tailOsteodermsRight3.setRotationPoint(1.0F, -0.6162F, 9.8975F);
        this.tail3.addChild(tailOsteodermsRight3);


        this.cube_r206 = new AdvancedModelRenderer(this);
        this.cube_r206.setRotationPoint(-1.5642F, 0.9112F, -7.9702F);
        this.tailOsteodermsRight3.addChild(cube_r206);
        this.setRotateAngle(cube_r206, 0.15F, -0.7332F, -0.1033F);
        this.cube_r206.cubeList.add(new ModelBox(cube_r206, 95, 12, 5.9864F, -0.2054F, 6.173F, 1, 0, 1, 0.0F, true));
        this.cube_r206.cubeList.add(new ModelBox(cube_r206, 94, 92, 4.6325F, -0.1937F, 4.6875F, 1, 0, 1, 0.0F, true));
        this.cube_r206.cubeList.add(new ModelBox(cube_r206, 68, 46, 3.6203F, -0.2346F, 3.5767F, 1, 0, 1, 0.0F, true));
        this.cube_r206.cubeList.add(new ModelBox(cube_r206, 9, 80, 2.6752F, -0.2663F, 2.5395F, 1, 0, 1, 0.0F, true));
        this.cube_r206.cubeList.add(new ModelBox(cube_r206, 94, 44, 1.8706F, -0.3787F, 1.6563F, 1, 0, 1, 0.0F, true));
        this.cube_r206.cubeList.add(new ModelBox(cube_r206, 50, 96, 0.7125F, -0.389F, 0.6823F, 1, 0, 1, 0.0F, true));
        this.cube_r206.cubeList.add(new ModelBox(cube_r206, 0, 96, -0.4326F, -0.4002F, -0.5741F, 1, 0, 1, 0.0F, true));

        this.cube_r207 = new AdvancedModelRenderer(this);
        this.cube_r207.setRotationPoint(-1.5642F, 0.9373F, -9.47F);
        this.tailOsteodermsRight3.addChild(cube_r207);
        this.setRotateAngle(cube_r207, 0.118F, -0.6482F, -0.0733F);
        this.cube_r207.cubeList.add(new ModelBox(cube_r207, 64, 96, -0.6115F, -0.3006F, -0.6101F, 1, 0, 1, 0.0F, true));

        this.tailOsteodermsLeft3 = new AdvancedModelRenderer(this);
        this.tailOsteodermsLeft3.setRotationPoint(-1.0F, -0.6162F, 9.8975F);
        this.tail3.addChild(tailOsteodermsLeft3);


        this.cube_r208 = new AdvancedModelRenderer(this);
        this.cube_r208.setRotationPoint(1.5642F, 0.9112F, -7.9702F);
        this.tailOsteodermsLeft3.addChild(cube_r208);
        this.setRotateAngle(cube_r208, 0.15F, 0.7332F, 0.1033F);
        this.cube_r208.cubeList.add(new ModelBox(cube_r208, 95, 12, -6.9864F, -0.2054F, 6.173F, 1, 0, 1, 0.0F, false));
        this.cube_r208.cubeList.add(new ModelBox(cube_r208, 94, 92, -5.6325F, -0.1937F, 4.6875F, 1, 0, 1, 0.0F, false));
        this.cube_r208.cubeList.add(new ModelBox(cube_r208, 68, 46, -4.6203F, -0.2346F, 3.5767F, 1, 0, 1, 0.0F, false));
        this.cube_r208.cubeList.add(new ModelBox(cube_r208, 9, 80, -3.6752F, -0.2663F, 2.5395F, 1, 0, 1, 0.0F, false));
        this.cube_r208.cubeList.add(new ModelBox(cube_r208, 94, 44, -2.8706F, -0.3787F, 1.6563F, 1, 0, 1, 0.0F, false));
        this.cube_r208.cubeList.add(new ModelBox(cube_r208, 50, 96, -1.7125F, -0.389F, 0.6823F, 1, 0, 1, 0.0F, false));
        this.cube_r208.cubeList.add(new ModelBox(cube_r208, 0, 96, -0.5674F, -0.4002F, -0.5741F, 1, 0, 1, 0.0F, false));

        this.cube_r209 = new AdvancedModelRenderer(this);
        this.cube_r209.setRotationPoint(1.5642F, 0.9373F, -9.47F);
        this.tailOsteodermsLeft3.addChild(cube_r209);
        this.setRotateAngle(cube_r209, 0.118F, 0.6482F, 0.0733F);
        this.cube_r209.cubeList.add(new ModelBox(cube_r209, 64, 96, -0.3885F, -0.3006F, -0.6101F, 1, 0, 1, 0.0F, false));
        updateDefaultPose();
        animator = ModelAnimator.create();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        animate((IAnimatedEntity) entity, f, f1, f2, f3, f4, f5);
        this.base.render(f5);
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
        this.base.offsetY = 0.16F;
        this.base.offsetX = -0.03F;
        this.base.rotateAngleY = (float)Math.toRadians(150);
        this.base.rotateAngleX = (float)Math.toRadians(2);
        this.base.rotateAngleZ = (float)Math.toRadians(0);
        this.base.scaleChildren = true;
        float scaler = 0.646F;
        this.base.setScale(scaler, scaler, scaler);
        //Start of pose:

        //End of pose, now render the model:
        this.base.render(f);
        //Reset rotations, positions and sizing:
        this.base.setScale(1.0F, 1.0F, 1.0F);
        this.base.scaleChildren = false;
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

        EntityPrehistoricFloraKunbarrasaurus entityYuxi = (EntityPrehistoricFloraKunbarrasaurus) e;

        if (entityYuxi.getAnimation() == entityYuxi.HIDE_ANIMATION) {
            return;
        }

        AdvancedModelRenderer[] Tail = {this.tail1, this.tail2, this.tail3};
        AdvancedModelRenderer[] Neck = {this.neck, this.neck2, this.head};
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
    public void setLivingAnimations(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        super.setLivingAnimations(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
        this.resetToDefaultPose();

        EntityPrehistoricFloraKunbarrasaurus ee = (EntityPrehistoricFloraKunbarrasaurus) entitylivingbaseIn;

        if (ee.getAnimation() != ee.HIDE_ANIMATION) {
            if (!ee.isReallyInWater()) {
                if (ee.getIsMoving()) {
                    if (ee.getIsFast()) { //Running
                        animRunning(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
                    } else { //Walking
                        animWalking(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
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
            animEat(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.ATTACK_ANIMATION) {
            //animAttack(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
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
        else if (ee.getAnimation() == ee.ALERT_ANIMATION) { //The noise anim
            animAlert(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.HIDE_ANIMATION) { //The hiding and unhiding anim
            animHide(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }

    }
    
    public void animHide(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraKunbarrasaurus entity = (EntityPrehistoricFloraKunbarrasaurus) entitylivingbaseIn;
        int animCycle = 160;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 31) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+30))*-2 + (((tickAnim - 0) / 31) * (-6-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+30))*-2)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+60))*3 + (((tickAnim - 0) / 31) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+60))*3)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+60))*3 + (((tickAnim - 0) / 31) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+60))*3)));
        }
        else if (tickAnim >= 31 && tickAnim < 117) {
            xx = -6 + (((tickAnim - 31) / 86) * (-6-(-6)));
            yy = 0 + (((tickAnim - 31) / 86) * (0-(0)));
            zz = 0 + (((tickAnim - 31) / 86) * (0-(0)));
        }
        else if (tickAnim >= 117 && tickAnim < 160) {
            xx = -6 + (((tickAnim - 117) / 43) * (0-(-6)));
            yy = 0 + (((tickAnim - 117) / 43) * (0-(0)));
            zz = 0 + (((tickAnim - 117) / 43) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(base, base.rotateAngleX + (float) Math.toRadians(xx), base.rotateAngleY + (float) Math.toRadians(yy), base.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 3) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 3) / 10) * (-1.6-(0)));
            zz = 0 + (((tickAnim - 3) / 10) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 31) {
            xx = 0 + (((tickAnim - 13) / 18) * (0-(0)));
            yy = -1.6 + (((tickAnim - 13) / 18) * (-3.5-(-1.6)));
            zz = 0 + (((tickAnim - 13) / 18) * (0-(0)));
        }
        else if (tickAnim >= 31 && tickAnim < 117) {
            xx = 0 + (((tickAnim - 31) / 86) * (0-(0)));
            yy = -3.5 + (((tickAnim - 31) / 86) * (-3.5-(-3.5)));
            zz = 0 + (((tickAnim - 31) / 86) * (0-(0)));
        }
        else if (tickAnim >= 117 && tickAnim < 160) {
            xx = 0 + (((tickAnim - 117) / 43) * (0-(0)));
            yy = -3.5 + (((tickAnim - 117) / 43) * (0-(-3.5)));
            zz = 0 + (((tickAnim - 117) / 43) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.base.rotationPointX = this.base.rotationPointX + (float)(xx);
        this.base.rotationPointY = this.base.rotationPointY - (float)(yy);
        this.base.rotationPointZ = this.base.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (37.4-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 23) {
            xx = 37.4 + (((tickAnim - 10) / 13) * (7.1908-(37.4)));
            yy = 0 + (((tickAnim - 10) / 13) * (-9.67477-(0)));
            zz = 0 + (((tickAnim - 10) / 13) * (-1.21465-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 33) {
            xx = 7.1908 + (((tickAnim - 23) / 10) * (-8.25-(7.1908)));
            yy = -9.67477 + (((tickAnim - 23) / 10) * (0-(-9.67477)));
            zz = -1.21465 + (((tickAnim - 23) / 10) * (0-(-1.21465)));
        }
        else if (tickAnim >= 33 && tickAnim < 117) {
            xx = -8.25 + (((tickAnim - 33) / 84) * (-8.25-(-8.25)));
            yy = 0 + (((tickAnim - 33) / 84) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 84) * (0-(0)));
        }
        else if (tickAnim >= 117 && tickAnim < 139) {
            xx = -8.25 + (((tickAnim - 117) / 22) * (5.12-(-8.25)));
            yy = 0 + (((tickAnim - 117) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 117) / 22) * (0-(0)));
        }
        else if (tickAnim >= 139 && tickAnim < 150) {
            xx = 5.12 + (((tickAnim - 139) / 11) * (-0.6-(5.12)));
            yy = 0 + (((tickAnim - 139) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 139) / 11) * (0-(0)));
        }
        else if (tickAnim >= 150 && tickAnim < 160) {
            xx = -0.6 + (((tickAnim - 150) / 10) * (0-(-0.6)));
            yy = 0 + (((tickAnim - 150) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 150) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftleg, leftleg.rotateAngleX + (float) Math.toRadians(xx), leftleg.rotateAngleY + (float) Math.toRadians(yy), leftleg.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 10) / 13) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 13) * (1-(0)));
            zz = 0 + (((tickAnim - 10) / 13) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 23) / 10) * (0-(0)));
            yy = 1 + (((tickAnim - 23) / 10) * (0-(1)));
            zz = 0 + (((tickAnim - 23) / 10) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 117) {
            xx = 0 + (((tickAnim - 33) / 84) * (0-(0)));
            yy = 0 + (((tickAnim - 33) / 84) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 84) * (0-(0)));
        }
        else if (tickAnim >= 117 && tickAnim < 139) {
            xx = 0 + (((tickAnim - 117) / 22) * (0-(0)));
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
        this.leftleg.rotationPointX = this.leftleg.rotationPointX + (float)(xx);
        this.leftleg.rotationPointY = this.leftleg.rotationPointY - (float)(yy);
        this.leftleg.rotationPointZ = this.leftleg.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (4.82-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = 4.82 + (((tickAnim - 10) / 5) * (24.51-(4.82)));
            yy = 0 + (((tickAnim - 10) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 5) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 23) {
            xx = 24.51 + (((tickAnim - 15) / 8) * (0.69-(24.51)));
            yy = 0 + (((tickAnim - 15) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 8) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 33) {
            xx = 0.69 + (((tickAnim - 23) / 10) * (39.75-(0.69)));
            yy = 0 + (((tickAnim - 23) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 10) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 117) {
            xx = 39.75 + (((tickAnim - 33) / 84) * (39.75-(39.75)));
            yy = 0 + (((tickAnim - 33) / 84) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 84) * (0-(0)));
        }
        else if (tickAnim >= 117 && tickAnim < 139) {
            xx = 39.75 + (((tickAnim - 117) / 22) * (17.22-(39.75)));
            yy = 0 + (((tickAnim - 117) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 117) / 22) * (0-(0)));
        }
        else if (tickAnim >= 139 && tickAnim < 150) {
            xx = 17.22 + (((tickAnim - 139) / 11) * (23.27-(17.22)));
            yy = 0 + (((tickAnim - 139) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 139) / 11) * (0-(0)));
        }
        else if (tickAnim >= 150 && tickAnim < 160) {
            xx = 23.27 + (((tickAnim - 150) / 10) * (0-(23.27)));
            yy = 0 + (((tickAnim - 150) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 150) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftleg2, leftleg2.rotateAngleX + (float) Math.toRadians(xx), leftleg2.rotateAngleY + (float) Math.toRadians(yy), leftleg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 10) / 13) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 13) * (0.975-(0)));
            zz = 0 + (((tickAnim - 10) / 13) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 23) / 10) * (0-(0)));
            yy = 0.975 + (((tickAnim - 23) / 10) * (0-(0.975)));
            zz = 0 + (((tickAnim - 23) / 10) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 117) {
            xx = 0 + (((tickAnim - 33) / 84) * (0-(0)));
            yy = 0 + (((tickAnim - 33) / 84) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 84) * (0-(0)));
        }
        else if (tickAnim >= 117 && tickAnim < 139) {
            xx = 0 + (((tickAnim - 117) / 22) * (0-(0)));
            yy = 0 + (((tickAnim - 117) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 117) / 22) * (0-(0)));
        }
        else if (tickAnim >= 139 && tickAnim < 150) {
            xx = 0 + (((tickAnim - 139) / 11) * (0-(0)));
            yy = 0 + (((tickAnim - 139) / 11) * (0.6-(0)));
            zz = 0 + (((tickAnim - 139) / 11) * (0-(0)));
        }
        else if (tickAnim >= 150 && tickAnim < 157) {
            xx = 0 + (((tickAnim - 150) / 7) * (0-(0)));
            yy = 0.6 + (((tickAnim - 150) / 7) * (0-(0.6)));
            zz = 0 + (((tickAnim - 150) / 7) * (0-(0)));
        }
        else if (tickAnim >= 157 && tickAnim < 160) {
            xx = 0 + (((tickAnim - 157) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 157) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 157) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftleg2.rotationPointX = this.leftleg2.rotationPointX + (float)(xx);
        this.leftleg2.rotationPointY = this.leftleg2.rotationPointY - (float)(yy);
        this.leftleg2.rotationPointZ = this.leftleg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (-38.95-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = -38.95 + (((tickAnim - 10) / 5) * (30.17-(-38.95)));
            yy = 0 + (((tickAnim - 10) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 5) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 23) {
            xx = 30.17 + (((tickAnim - 15) / 8) * (-27.69-(30.17)));
            yy = 0 + (((tickAnim - 15) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 8) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 33) {
            xx = -27.69 + (((tickAnim - 23) / 10) * (-25.5-(-27.69)));
            yy = 0 + (((tickAnim - 23) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 10) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 117) {
            xx = -25.5 + (((tickAnim - 33) / 84) * (-25.5-(-25.5)));
            yy = 0 + (((tickAnim - 33) / 84) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 84) * (0-(0)));
        }
        else if (tickAnim >= 117 && tickAnim < 139) {
            xx = -25.5 + (((tickAnim - 117) / 22) * (-20.22-(-25.5)));
            yy = 0 + (((tickAnim - 117) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 117) / 22) * (0-(0)));
        }
        else if (tickAnim >= 139 && tickAnim < 150) {
            xx = -20.22 + (((tickAnim - 139) / 11) * (19.48-(-20.22)));
            yy = 0 + (((tickAnim - 139) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 139) / 11) * (0-(0)));
        }
        else if (tickAnim >= 150 && tickAnim < 157) {
            xx = 19.48 + (((tickAnim - 150) / 7) * (-15.01-(19.48)));
            yy = 0 + (((tickAnim - 150) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 150) / 7) * (0-(0)));
        }
        else if (tickAnim >= 157 && tickAnim < 160) {
            xx = -15.01 + (((tickAnim - 157) / 3) * (0-(-15.01)));
            yy = 0 + (((tickAnim - 157) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 157) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftfoot, leftfoot.rotateAngleX + (float) Math.toRadians(xx), leftfoot.rotateAngleY + (float) Math.toRadians(yy), leftfoot.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0.1-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0.075-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 10) / 13) * (0-(0)));
            yy = 0.1 + (((tickAnim - 10) / 13) * (0.55-(0.1)));
            zz = 0.075 + (((tickAnim - 10) / 13) * (0.08-(0.075)));
        }
        else if (tickAnim >= 23 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 23) / 10) * (0-(0)));
            yy = 0.55 + (((tickAnim - 23) / 10) * (0-(0.55)));
            zz = 0.08 + (((tickAnim - 23) / 10) * (0-(0.08)));
        }
        else if (tickAnim >= 33 && tickAnim < 117) {
            xx = 0 + (((tickAnim - 33) / 84) * (0-(0)));
            yy = 0 + (((tickAnim - 33) / 84) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 84) * (0-(0)));
        }
        else if (tickAnim >= 117 && tickAnim < 139) {
            xx = 0 + (((tickAnim - 117) / 22) * (0-(0)));
            yy = 0 + (((tickAnim - 117) / 22) * (0.175-(0)));
            zz = 0 + (((tickAnim - 117) / 22) * (0-(0)));
        }
        else if (tickAnim >= 139 && tickAnim < 160) {
            xx = 0 + (((tickAnim - 139) / 21) * (0-(0)));
            yy = 0.175 + (((tickAnim - 139) / 21) * (0-(0.175)));
            zz = 0 + (((tickAnim - 139) / 21) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftfoot.rotationPointX = this.leftfoot.rotationPointX + (float)(xx);
        this.leftfoot.rotationPointY = this.leftfoot.rotationPointY - (float)(yy);
        this.leftfoot.rotationPointZ = this.leftfoot.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 0) / 14) * (3-(0)));
            yy = 0 + (((tickAnim - 0) / 14) * (0-(0)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150/0.75-10))*1.9 + (((tickAnim - 0) / 14) * (0.81612-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150/0.75-10))*1.9)));
        }
        else if (tickAnim >= 14 && tickAnim < 33) {
            xx = 3 + (((tickAnim - 14) / 19) * (0-(3)));
            yy = 0 + (((tickAnim - 14) / 19) * (0-(0)));
            zz = 0.81612 + (((tickAnim - 14) / 19) * (0-(0.81612)));
        }
        else if (tickAnim >= 33 && tickAnim < 117) {
            xx = 0 + (((tickAnim - 33) / 84) * (0-(0)));
            yy = 0 + (((tickAnim - 33) / 84) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 84) * (0-(0)));
        }
        else if (tickAnim >= 117 && tickAnim < 160) {
            xx = 0 + (((tickAnim - 117) / 43) * (0-(0)));
            yy = 0 + (((tickAnim - 117) / 43) * (0-(0)));
            zz = 0 + (((tickAnim - 117) / 43) * (-1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150/0.75-10))*1.9-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(xx), body.rotateAngleY + (float) Math.toRadians(yy), body.rotateAngleZ + (float) Math.toRadians(zz));


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
        this.body.rotationPointX = this.body.rotationPointX + (float)(xx);
        this.body.rotationPointY = this.body.rotationPointY - (float)(yy);
        this.body.rotationPointZ = this.body.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = -2 + (((tickAnim - 0) / 8) * (-2-(-2)));
        }
        else if (tickAnim >= 8 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 8) / 12) * (8-(0)));
            yy = 0 + (((tickAnim - 8) / 12) * (0-(0)));
            zz = -2 + (((tickAnim - 8) / 12) * (0-(-2)));
        }
        else if (tickAnim >= 20 && tickAnim < 33) {
            xx = 8 + (((tickAnim - 20) / 13) * (6.6604-(8)));
            yy = 0 + (((tickAnim - 20) / 13) * (0.08058-(0)));
            zz = 0 + (((tickAnim - 20) / 13) * (-0.4051+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120/0.75-50))*0.1-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 117) {
            xx = 6.6604 + (((tickAnim - 33) / 84) * (6.6604-(6.6604)));
            yy = 0.08058 + (((tickAnim - 33) / 84) * (0.08058-(0.08058)));
            zz = -0.4051+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120/0.75-50))*0.1 + (((tickAnim - 33) / 84) * (-0.4051+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120/0.75-50))*0.1-(-0.4051+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120/0.75-50))*0.1)));
        }
        else if (tickAnim >= 117 && tickAnim < 160) {
            xx = 6.6604 + (((tickAnim - 117) / 43) * (0-(6.6604)));
            yy = 0.08058 + (((tickAnim - 117) / 43) * (0-(0.08058)));
            zz = -0.4051+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120/0.75-50))*0.1 + (((tickAnim - 117) / 43) * (-2-(-0.4051+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120/0.75-50))*0.1)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(xx), chest.rotateAngleY + (float) Math.toRadians(yy), chest.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 33 && tickAnim < 117) {
            xx = 0 + (((tickAnim - 33) / 84) * (0-(0)));
            yy = 0 + (((tickAnim - 33) / 84) * (0-(0)));
            zz = -0.475 + (((tickAnim - 33) / 84) * (-0.475-(-0.475)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.chest.rotationPointX = this.chest.rotationPointX + (float)(xx);
        this.chest.rotationPointY = this.chest.rotationPointY - (float)(yy);
        this.chest.rotationPointZ = this.chest.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 0) / 12) * (31.97-(0)));
            yy = 0 + (((tickAnim - 0) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 12) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 17) {
            xx = 31.97 + (((tickAnim - 12) / 5) * (11.73635-(31.97)));
            yy = 0 + (((tickAnim - 12) / 5) * (4.34025-(0)));
            zz = 0 + (((tickAnim - 12) / 5) * (-16.38793-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 21) {
            xx = 11.73635 + (((tickAnim - 17) / 4) * (1.25-(11.73635)));
            yy = 4.34025 + (((tickAnim - 17) / 4) * (0-(4.34025)));
            zz = -16.38793 + (((tickAnim - 17) / 4) * (0-(-16.38793)));
        }
        else if (tickAnim >= 21 && tickAnim < 33) {
            xx = 1.25 + (((tickAnim - 21) / 12) * (6.75-(1.25)));
            yy = 0 + (((tickAnim - 21) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 21) / 12) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 117) {
            xx = 6.75 + (((tickAnim - 33) / 84) * (15-(6.75)));
            yy = 0 + (((tickAnim - 33) / 84) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 84) * (0-(0)));
        }
        else if (tickAnim >= 117 && tickAnim < 129) {
            xx = 15 + (((tickAnim - 117) / 12) * (17.56-(15)));
            yy = 0 + (((tickAnim - 117) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 117) / 12) * (0-(0)));
        }
        else if (tickAnim >= 129 && tickAnim < 141) {
            xx = 17.56 + (((tickAnim - 129) / 12) * (0-(17.56)));
            yy = 0 + (((tickAnim - 129) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 129) / 12) * (0-(0)));
        }
        else if (tickAnim >= 141 && tickAnim < 160) {
            xx = 0 + (((tickAnim - 141) / 19) * (0-(0)));
            yy = 0 + (((tickAnim - 141) / 19) * (0-(0)));
            zz = 0 + (((tickAnim - 141) / 19) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftarm, leftarm.rotateAngleX + (float) Math.toRadians(xx), leftarm.rotateAngleY + (float) Math.toRadians(yy), leftarm.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 17) {
            xx = 0 + (((tickAnim - 0) / 17) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 17) * (0.57-(0)));
            zz = 0 + (((tickAnim - 0) / 17) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 21) {
            xx = 0 + (((tickAnim - 17) / 4) * (0-(0)));
            yy = 0.57 + (((tickAnim - 17) / 4) * (-0.1-(0.57)));
            zz = 0 + (((tickAnim - 17) / 4) * (0-(0)));
        }
        else if (tickAnim >= 21 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 21) / 12) * (0-(0)));
            yy = -0.1 + (((tickAnim - 21) / 12) * (-0.1-(-0.1)));
            zz = 0 + (((tickAnim - 21) / 12) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 117) {
            xx = 0 + (((tickAnim - 33) / 84) * (0-(0)));
            yy = -0.1 + (((tickAnim - 33) / 84) * (0-(-0.1)));
            zz = 0 + (((tickAnim - 33) / 84) * (0-(0)));
        }
        else if (tickAnim >= 117 && tickAnim < 129) {
            xx = 0 + (((tickAnim - 117) / 12) * (0-(0)));
            yy = 0 + (((tickAnim - 117) / 12) * (0.6-(0)));
            zz = 0 + (((tickAnim - 117) / 12) * (0-(0)));
        }
        else if (tickAnim >= 129 && tickAnim < 141) {
            xx = 0 + (((tickAnim - 129) / 12) * (0-(0)));
            yy = 0.6 + (((tickAnim - 129) / 12) * (0-(0.6)));
            zz = 0 + (((tickAnim - 129) / 12) * (0-(0)));
        }
        else if (tickAnim >= 141 && tickAnim < 160) {
            xx = 0 + (((tickAnim - 141) / 19) * (0-(0)));
            yy = 0 + (((tickAnim - 141) / 19) * (0-(0)));
            zz = 0 + (((tickAnim - 141) / 19) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftarm.rotationPointX = this.leftarm.rotationPointX + (float)(xx);
        this.leftarm.rotationPointY = this.leftarm.rotationPointY - (float)(yy);
        this.leftarm.rotationPointZ = this.leftarm.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 0) / 12) * (-23.93-(0)));
            yy = 0 + (((tickAnim - 0) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 12) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 21) {
            xx = -23.93 + (((tickAnim - 12) / 9) * (-35.5-(-23.93)));
            yy = 0 + (((tickAnim - 12) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 9) * (0-(0)));
        }
        else if (tickAnim >= 21 && tickAnim < 33) {
            xx = -35.5 + (((tickAnim - 21) / 12) * (-35.5-(-35.5)));
            yy = 0 + (((tickAnim - 21) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 21) / 12) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 117) {
            xx = -35.5 + (((tickAnim - 33) / 84) * (-40.75-(-35.5)));
            yy = 0 + (((tickAnim - 33) / 84) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 84) * (0-(0)));
        }
        else if (tickAnim >= 117 && tickAnim < 129) {
            xx = -40.75 + (((tickAnim - 117) / 12) * (-22.39-(-40.75)));
            yy = 0 + (((tickAnim - 117) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 117) / 12) * (0-(0)));
        }
        else if (tickAnim >= 129 && tickAnim < 141) {
            xx = -22.39 + (((tickAnim - 129) / 12) * (0-(-22.39)));
            yy = 0 + (((tickAnim - 129) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 129) / 12) * (2.75-(0)));
        }
        else if (tickAnim >= 141 && tickAnim < 160) {
            xx = 0 + (((tickAnim - 141) / 19) * (0-(0)));
            yy = 0 + (((tickAnim - 141) / 19) * (0-(0)));
            zz = 2.75 + (((tickAnim - 141) / 19) * (0-(2.75)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftarm2, leftarm2.rotateAngleX + (float) Math.toRadians(xx), leftarm2.rotateAngleY + (float) Math.toRadians(yy), leftarm2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 129 && tickAnim < 141) {
            xx = 0 + (((tickAnim - 129) / 12) * (0-(0)));
            yy = 0 + (((tickAnim - 129) / 12) * (0.45-(0)));
            zz = 0 + (((tickAnim - 129) / 12) * (0-(0)));
        }
        else if (tickAnim >= 141 && tickAnim < 160) {
            xx = 0 + (((tickAnim - 141) / 19) * (0-(0)));
            yy = 0.45 + (((tickAnim - 141) / 19) * (0-(0.45)));
            zz = 0 + (((tickAnim - 141) / 19) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftarm2.rotationPointX = this.leftarm2.rotationPointX + (float)(xx);
        this.leftarm2.rotationPointY = this.leftarm2.rotationPointY - (float)(yy);
        this.leftarm2.rotationPointZ = this.leftarm2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 0) / 12) * (66.89-(0)));
            yy = 0 + (((tickAnim - 0) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 12) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 17) {
            xx = 66.89 + (((tickAnim - 12) / 5) * (12.4-(66.89)));
            yy = 0 + (((tickAnim - 12) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 5) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 21) {
            xx = 12.4 + (((tickAnim - 17) / 4) * (30.25-(12.4)));
            yy = 0 + (((tickAnim - 17) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 17) / 4) * (0-(0)));
        }
        else if (tickAnim >= 21 && tickAnim < 33) {
            xx = 30.25 + (((tickAnim - 21) / 12) * (26.25-(30.25)));
            yy = 0 + (((tickAnim - 21) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 21) / 12) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 117) {
            xx = 26.25 + (((tickAnim - 33) / 84) * (26.25-(26.25)));
            yy = 0 + (((tickAnim - 33) / 84) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 84) * (0-(0)));
        }
        else if (tickAnim >= 117 && tickAnim < 129) {
            xx = 26.25 + (((tickAnim - 117) / 12) * (87.16-(26.25)));
            yy = 0 + (((tickAnim - 117) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 117) / 12) * (0-(0)));
        }
        else if (tickAnim >= 129 && tickAnim < 141) {
            xx = 87.16 + (((tickAnim - 129) / 12) * (0-(87.16)));
            yy = 0 + (((tickAnim - 129) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 129) / 12) * (0-(0)));
        }
        else if (tickAnim >= 141 && tickAnim < 160) {
            xx = 0 + (((tickAnim - 141) / 19) * (0-(0)));
            yy = 0 + (((tickAnim - 141) / 19) * (0-(0)));
            zz = 0 + (((tickAnim - 141) / 19) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(lefthand, lefthand.rotateAngleX + (float) Math.toRadians(xx), lefthand.rotateAngleY + (float) Math.toRadians(yy), lefthand.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 129) {
            xx = 0 + (((tickAnim - 0) / 129) * (-0.025-(0)));
            yy = 0 + (((tickAnim - 0) / 129) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 129) * (0-(0)));
        }
        else if (tickAnim >= 129 && tickAnim < 141) {
            xx = -0.025 + (((tickAnim - 129) / 12) * (0-(-0.025)));
            yy = 0 + (((tickAnim - 129) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 129) / 12) * (0-(0)));
        }
        else if (tickAnim >= 141 && tickAnim < 160) {
            xx = 0 + (((tickAnim - 141) / 19) * (0-(0)));
            yy = 0 + (((tickAnim - 141) / 19) * (0-(0)));
            zz = 0 + (((tickAnim - 141) / 19) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.lefthand.rotationPointX = this.lefthand.rotationPointX + (float)(xx);
        this.lefthand.rotationPointY = this.lefthand.rotationPointY - (float)(yy);
        this.lefthand.rotationPointZ = this.lefthand.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (5.81671-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (10.83085-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (9.06678-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 29) {
            xx = 5.81671 + (((tickAnim - 13) / 16) * (16.5-(5.81671)));
            yy = 10.83085 + (((tickAnim - 13) / 16) * (0-(10.83085)));
            zz = 9.06678 + (((tickAnim - 13) / 16) * (0-(9.06678)));
        }
        else if (tickAnim >= 29 && tickAnim < 117) {
            xx = 16.5 + (((tickAnim - 29) / 88) * (16.5-(16.5)));
            yy = 0 + (((tickAnim - 29) / 88) * (0-(0)));
            zz = 0 + (((tickAnim - 29) / 88) * (0-(0)));
        }
        else if (tickAnim >= 117 && tickAnim < 160) {
            xx = 16.5 + (((tickAnim - 117) / 43) * (0-(16.5)));
            yy = 0 + (((tickAnim - 117) / 43) * (0-(0)));
            zz = 0 + (((tickAnim - 117) / 43) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(xx), neck.rotateAngleY + (float) Math.toRadians(yy), neck.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 8) / 5) * (0.5-(0)));
            yy = 0 + (((tickAnim - 8) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 5) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 20) {
            xx = 0.5 + (((tickAnim - 13) / 7) * (13-(0.5)));
            yy = 0 + (((tickAnim - 13) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 7) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 29) {
            xx = 13 + (((tickAnim - 20) / 9) * (23-(13)));
            yy = 0 + (((tickAnim - 20) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 9) * (0-(0)));
        }
        else if (tickAnim >= 29 && tickAnim < 117) {
            xx = 23 + (((tickAnim - 29) / 88) * (23-(23)));
            yy = 0 + (((tickAnim - 29) / 88) * (0-(0)));
            zz = 0 + (((tickAnim - 29) / 88) * (0-(0)));
        }
        else if (tickAnim >= 117 && tickAnim < 160) {
            xx = 23 + (((tickAnim - 117) / 43) * (0-(23)));
            yy = 0 + (((tickAnim - 117) / 43) * (0-(0)));
            zz = 0 + (((tickAnim - 117) / 43) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(xx), neck2.rotateAngleY + (float) Math.toRadians(yy), neck2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (-20-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 20) {
            xx = -20 + (((tickAnim - 8) / 12) * (12-(-20)));
            yy = 0 + (((tickAnim - 8) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 12) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 29) {
            xx = 12 + (((tickAnim - 20) / 9) * (12-(12)));
            yy = 0 + (((tickAnim - 20) / 9) * (0.42902-(0)));
            zz = 0 + (((tickAnim - 20) / 9) * (-0.33008-(0)));
        }
        else if (tickAnim >= 29 && tickAnim < 117) {
            xx = 12 + (((tickAnim - 29) / 88) * (12-(12)));
            yy = 0.42902 + (((tickAnim - 29) / 88) * (0.42902-(0.42902)));
            zz = -0.33008 + (((tickAnim - 29) / 88) * (-0.33008-(-0.33008)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (20-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 17) {
            xx = 20 + (((tickAnim - 8) / 9) * (0-(20)));
            yy = 0 + (((tickAnim - 8) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 9) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 17) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 17) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 17) / 3) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 160) {
            xx = 0 + (((tickAnim - 20) / 140) * (0-(0)));
            yy = 0 + (((tickAnim - 20) / 140) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 140) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(xx), jaw.rotateAngleY + (float) Math.toRadians(yy), jaw.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 1 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 1) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 1) / 2) * (-0.2-(0)));
            zz = 0 + (((tickAnim - 1) / 2) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 3) / 3) * (0-(0)));
            yy = -0.2 + (((tickAnim - 3) / 3) * (0-(-0.2)));
            zz = 0 + (((tickAnim - 3) / 3) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 6) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 6) / 2) * (-0.2-(0)));
            zz = 0 + (((tickAnim - 6) / 2) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            yy = -0.2 + (((tickAnim - 8) / 2) * (0-(-0.2)));
            zz = 0 + (((tickAnim - 8) / 2) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 10) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 2) * (-0.2-(0)));
            zz = 0 + (((tickAnim - 10) / 2) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 12) / 2) * (0-(0)));
            yy = -0.2 + (((tickAnim - 12) / 2) * (0-(-0.2)));
            zz = 0 + (((tickAnim - 12) / 2) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 160) {
            xx = 0 + (((tickAnim - 14) / 146) * (0-(0)));
            yy = 0 + (((tickAnim - 14) / 146) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 146) * (0-(0)));
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
            xx = 0 + (((tickAnim - 0) / 9) * (0.10353-(0)));
            yy = 0 + (((tickAnim - 0) / 9) * (-1.82071-(0)));
            zz = 0 + (((tickAnim - 0) / 9) * (-4.75113-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 24) {
            xx = 0.10353 + (((tickAnim - 9) / 15) * (0.10353-(0.10353)));
            yy = -1.82071 + (((tickAnim - 9) / 15) * (-1.24571-(-1.82071)));
            zz = -4.75113 + (((tickAnim - 9) / 15) * (4.7511-(-4.75113)));
        }
        else if (tickAnim >= 24 && tickAnim < 38) {
            xx = 0.10353 + (((tickAnim - 24) / 14) * (1.5-(0.10353)));
            yy = -1.24571 + (((tickAnim - 24) / 14) * (0-(-1.24571)));
            zz = 4.7511 + (((tickAnim - 24) / 14) * (0-(4.7511)));
        }
        else if (tickAnim >= 38 && tickAnim < 117) {
            xx = 1.5 + (((tickAnim - 38) / 79) * (1.5-(1.5)));
            yy = 0 + (((tickAnim - 38) / 79) * (0-(0)));
            zz = 0 + (((tickAnim - 38) / 79) * (0-(0)));
        }
        else if (tickAnim >= 117 && tickAnim < 160) {
            xx = 1.5 + (((tickAnim - 117) / 43) * (0-(1.5)));
            yy = 0 + (((tickAnim - 117) / 43) * (0-(0)));
            zz = 0 + (((tickAnim - 117) / 43) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail1, tail1.rotateAngleX + (float) Math.toRadians(xx), tail1.rotateAngleY + (float) Math.toRadians(yy), tail1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 0) / 9) * (-0.48199-(0)));
            yy = 0 + (((tickAnim - 0) / 9) * (0.5726+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-50))*3-(0)));
            zz = 0 + (((tickAnim - 0) / 9) * (-6.51777-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 24) {
            xx = -0.48199 + (((tickAnim - 9) / 15) * (-0.48199-(-0.48199)));
            yy = 0.5726+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-50))*3 + (((tickAnim - 9) / 15) * (4.22263-(0.5726+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-50))*3)));
            zz = -6.51777 + (((tickAnim - 9) / 15) * (6.5178-(-6.51777)));
        }
        else if (tickAnim >= 24 && tickAnim < 38) {
            xx = -0.48199 + (((tickAnim - 24) / 14) * (-4.25-(-0.48199)));
            yy = 4.22263 + (((tickAnim - 24) / 14) * (0-(4.22263)));
            zz = 6.5178 + (((tickAnim - 24) / 14) * (0-(6.5178)));
        }
        else if (tickAnim >= 38 && tickAnim < 117) {
            xx = -4.25 + (((tickAnim - 38) / 79) * (-4.25-(-4.25)));
            yy = 0 + (((tickAnim - 38) / 79) * (0-(0)));
            zz = 0 + (((tickAnim - 38) / 79) * (0-(0)));
        }
        else if (tickAnim >= 117 && tickAnim < 160) {
            xx = -4.25 + (((tickAnim - 117) / 43) * (0-(-4.25)));
            yy = 0 + (((tickAnim - 117) / 43) * (0-(0)));
            zz = 0 + (((tickAnim - 117) / 43) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(xx), tail2.rotateAngleY + (float) Math.toRadians(yy), tail2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 0) / 9) * (-0.10139-(0)));
            yy = 0 + (((tickAnim - 0) / 9) * (-1.3494+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-30))*3-(0)));
            zz = 0 + (((tickAnim - 0) / 9) * (-1.99496-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 24) {
            xx = -0.10139 + (((tickAnim - 9) / 15) * (1.88179-(-0.10139)));
            yy = -1.3494+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-30))*3 + (((tickAnim - 9) / 15) * (4.0581+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-50))*-5-(-1.3494+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-30))*3)));
            zz = -1.99496 + (((tickAnim - 9) / 15) * (2.19416-(-1.99496)));
        }
        else if (tickAnim >= 24 && tickAnim < 38) {
            xx = 1.88179 + (((tickAnim - 24) / 14) * (1.74805-(1.88179)));
            yy = 4.0581+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-50))*-5 + (((tickAnim - 24) / 14) * (1.9969-(4.0581+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-50))*-5)));
            zz = 2.19416 + (((tickAnim - 24) / 14) * (0.11171-(2.19416)));
        }
        else if (tickAnim >= 38 && tickAnim < 117) {
            xx = 1.74805 + (((tickAnim - 38) / 79) * (1.74805-(1.74805)));
            yy = 1.9969 + (((tickAnim - 38) / 79) * (1.9969-(1.9969)));
            zz = 0.11171 + (((tickAnim - 38) / 79) * (0.11171-(0.11171)));
        }
        else if (tickAnim >= 117 && tickAnim < 131) {
            xx = 1.74805 + (((tickAnim - 117) / 14) * (-6.57343-(1.74805)));
            yy = 1.9969 + (((tickAnim - 117) / 14) * (1.34407-(1.9969)));
            zz = 0.11171 + (((tickAnim - 117) / 14) * (0.07519-(0.11171)));
        }
        else if (tickAnim >= 131 && tickAnim < 160) {
            xx = -6.57343 + (((tickAnim - 131) / 29) * (0-(-6.57343)));
            yy = 1.34407 + (((tickAnim - 131) / 29) * (0-(1.34407)));
            zz = 0.07519 + (((tickAnim - 131) / 29) * (0-(0.07519)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(xx), tail3.rotateAngleY + (float) Math.toRadians(yy), tail3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 21) {
            xx = 0 + (((tickAnim - 0) / 21) * (-25.53648-(0)));
            yy = 0 + (((tickAnim - 0) / 21) * (1.52885-(0)));
            zz = 0 + (((tickAnim - 0) / 21) * (3.22834-(0)));
        }
        else if (tickAnim >= 21 && tickAnim < 33) {
            xx = -25.53648 + (((tickAnim - 21) / 12) * (-18.75-(-25.53648)));
            yy = 1.52885 + (((tickAnim - 21) / 12) * (0-(1.52885)));
            zz = 3.22834 + (((tickAnim - 21) / 12) * (0-(3.22834)));
        }
        else if (tickAnim >= 33 && tickAnim < 117) {
            xx = -18.75 + (((tickAnim - 33) / 84) * (-18.75-(-18.75)));
            yy = 0 + (((tickAnim - 33) / 84) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 84) * (0-(0)));
        }
        else if (tickAnim >= 117 && tickAnim < 160) {
            xx = -18.75 + (((tickAnim - 117) / 43) * (0-(-18.75)));
            yy = 0 + (((tickAnim - 117) / 43) * (0-(0)));
            zz = 0 + (((tickAnim - 117) / 43) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightleg, rightleg.rotateAngleX + (float) Math.toRadians(xx), rightleg.rotateAngleY + (float) Math.toRadians(yy), rightleg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 21) {
            xx = 0 + (((tickAnim - 0) / 21) * (-0.5-(0)));
            yy = 0 + (((tickAnim - 0) / 21) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 21) * (0-(0)));
        }
        else if (tickAnim >= 21 && tickAnim < 33) {
            xx = -0.5 + (((tickAnim - 21) / 12) * (16-(-0.5)));
            yy = 0 + (((tickAnim - 21) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 21) / 12) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 117) {
            xx = 16 + (((tickAnim - 33) / 84) * (16-(16)));
            yy = 0 + (((tickAnim - 33) / 84) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 84) * (0-(0)));
        }
        else if (tickAnim >= 117 && tickAnim < 160) {
            xx = 16 + (((tickAnim - 117) / 43) * (0-(16)));
            yy = 0 + (((tickAnim - 117) / 43) * (0-(0)));
            zz = 0 + (((tickAnim - 117) / 43) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightleg2, rightleg2.rotateAngleX + (float) Math.toRadians(xx), rightleg2.rotateAngleY + (float) Math.toRadians(yy), rightleg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 21) {
            xx = 0 + (((tickAnim - 0) / 21) * (-7-(0)));
            yy = 0 + (((tickAnim - 0) / 21) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 21) * (0-(0)));
        }
        else if (tickAnim >= 21 && tickAnim < 33) {
            xx = -7 + (((tickAnim - 21) / 12) * (-39-(-7)));
            yy = 0 + (((tickAnim - 21) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 21) / 12) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 117) {
            xx = -39 + (((tickAnim - 33) / 84) * (-39-(-39)));
            yy = 0 + (((tickAnim - 33) / 84) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 84) * (0-(0)));
        }
        else if (tickAnim >= 117 && tickAnim < 160) {
            xx = -39 + (((tickAnim - 117) / 43) * (0-(-39)));
            yy = 0 + (((tickAnim - 117) / 43) * (0-(0)));
            zz = 0 + (((tickAnim - 117) / 43) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightleg3, rightleg3.rotateAngleX + (float) Math.toRadians(xx), rightleg3.rotateAngleY + (float) Math.toRadians(yy), rightleg3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 21) {
            xx = 0 + (((tickAnim - 0) / 21) * (36.25-(0)));
            yy = 0 + (((tickAnim - 0) / 21) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 21) * (0-(0)));
        }
        else if (tickAnim >= 21 && tickAnim < 33) {
            xx = 36.25 + (((tickAnim - 21) / 12) * (47.25-(36.25)));
            yy = 0 + (((tickAnim - 21) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 21) / 12) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 117) {
            xx = 47.25 + (((tickAnim - 33) / 84) * (47.25-(47.25)));
            yy = 0 + (((tickAnim - 33) / 84) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 84) * (0-(0)));
        }
        else if (tickAnim >= 117 && tickAnim < 160) {
            xx = 47.25 + (((tickAnim - 117) / 43) * (0-(47.25)));
            yy = 0 + (((tickAnim - 117) / 43) * (0-(0)));
            zz = 0 + (((tickAnim - 117) / 43) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightfoot, rightfoot.rotateAngleX + (float) Math.toRadians(xx), rightfoot.rotateAngleY + (float) Math.toRadians(yy), rightfoot.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 21) {
            xx = 0 + (((tickAnim - 0) / 21) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 21) * (0.4-(0)));
            zz = 0 + (((tickAnim - 0) / 21) * (0-(0)));
        }
        else if (tickAnim >= 21 && tickAnim < 117) {
            xx = 0 + (((tickAnim - 21) / 96) * (0-(0)));
            yy = 0.4 + (((tickAnim - 21) / 96) * (0-(0.4)));
            zz = 0 + (((tickAnim - 21) / 96) * (0-(0)));
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
        this.rightfoot.rotationPointX = this.rightfoot.rotationPointX + (float)(xx);
        this.rightfoot.rotationPointY = this.rightfoot.rotationPointY - (float)(yy);
        this.rightfoot.rotationPointZ = this.rightfoot.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 21) {
            xx = 0 + (((tickAnim - 0) / 21) * (-24.5-(0)));
            yy = 0 + (((tickAnim - 0) / 21) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 21) * (0-(0)));
        }
        else if (tickAnim >= 21 && tickAnim < 33) {
            xx = -24.5 + (((tickAnim - 21) / 12) * (0-(-24.5)));
            yy = 0 + (((tickAnim - 21) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 21) / 12) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 117) {
            xx = 0 + (((tickAnim - 33) / 84) * (0-(0)));
            yy = 0 + (((tickAnim - 33) / 84) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 84) * (0-(0)));
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
        this.setRotateAngle(rightarm, rightarm.rotateAngleX + (float) Math.toRadians(xx), rightarm.rotateAngleY + (float) Math.toRadians(yy), rightarm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 21) {
            xx = 0 + (((tickAnim - 0) / 21) * (-28-(0)));
            yy = 0 + (((tickAnim - 0) / 21) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 21) * (0-(0)));
        }
        else if (tickAnim >= 21 && tickAnim < 33) {
            xx = -28 + (((tickAnim - 21) / 12) * (-36.5-(-28)));
            yy = 0 + (((tickAnim - 21) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 21) / 12) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 117) {
            xx = -36.5 + (((tickAnim - 33) / 84) * (-36.5-(-36.5)));
            yy = 0 + (((tickAnim - 33) / 84) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 84) * (0-(0)));
        }
        else if (tickAnim >= 117 && tickAnim < 160) {
            xx = -36.5 + (((tickAnim - 117) / 43) * (0-(-36.5)));
            yy = 0 + (((tickAnim - 117) / 43) * (0-(0)));
            zz = 0 + (((tickAnim - 117) / 43) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightarm2, rightarm2.rotateAngleX + (float) Math.toRadians(xx), rightarm2.rotateAngleY + (float) Math.toRadians(yy), rightarm2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 6) * (-0.525-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 6) / 6) * (0-(0)));
            yy = -0.525 + (((tickAnim - 6) / 6) * (0.725-(-0.525)));
            zz = 0 + (((tickAnim - 6) / 6) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 21) {
            xx = 0 + (((tickAnim - 12) / 9) * (0-(0)));
            yy = 0.725 + (((tickAnim - 12) / 9) * (0-(0.725)));
            zz = 0 + (((tickAnim - 12) / 9) * (0-(0)));
        }
        else if (tickAnim >= 21 && tickAnim < 160) {
            xx = 0 + (((tickAnim - 21) / 139) * (0-(0)));
            yy = 0 + (((tickAnim - 21) / 139) * (0-(0)));
            zz = 0 + (((tickAnim - 21) / 139) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightarm2.rotationPointX = this.rightarm2.rotationPointX + (float)(xx);
        this.rightarm2.rotationPointY = this.rightarm2.rotationPointY - (float)(yy);
        this.rightarm2.rotationPointZ = this.rightarm2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 21) {
            xx = 0 + (((tickAnim - 0) / 21) * (46.07136-(0)));
            yy = 0 + (((tickAnim - 0) / 21) * (-5.5904-(0)));
            zz = 0 + (((tickAnim - 0) / 21) * (4.28183-(0)));
        }
        else if (tickAnim >= 21 && tickAnim < 33) {
            xx = 46.07136 + (((tickAnim - 21) / 12) * (32.82136-(46.07136)));
            yy = -5.5904 + (((tickAnim - 21) / 12) * (-5.5904-(-5.5904)));
            zz = 4.28183 + (((tickAnim - 21) / 12) * (4.28183-(4.28183)));
        }
        else if (tickAnim >= 33 && tickAnim < 117) {
            xx = 32.82136 + (((tickAnim - 33) / 84) * (32.82136-(32.82136)));
            yy = -5.5904 + (((tickAnim - 33) / 84) * (-5.5904-(-5.5904)));
            zz = 4.28183 + (((tickAnim - 33) / 84) * (4.28183-(4.28183)));
        }
        else if (tickAnim >= 117 && tickAnim < 160) {
            xx = 32.82136 + (((tickAnim - 117) / 43) * (0-(32.82136)));
            yy = -5.5904 + (((tickAnim - 117) / 43) * (0-(-5.5904)));
            zz = 4.28183 + (((tickAnim - 117) / 43) * (0-(4.28183)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(righthand, righthand.rotateAngleX + (float) Math.toRadians(xx), righthand.rotateAngleY + (float) Math.toRadians(yy), righthand.rotateAngleZ + (float) Math.toRadians(zz));

        this.righthand.rotationPointX = this.righthand.rotationPointX + (float)(0);
        this.righthand.rotationPointY = this.righthand.rotationPointY - (float)(0);
        this.righthand.rotationPointZ = this.righthand.rotationPointZ + (float)(0);
        
        
    }
    public void animLay(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraKunbarrasaurus entity = (EntityPrehistoricFloraKunbarrasaurus) entitylivingbaseIn;
        int animCycle = 50;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (-3.25-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 32) {
            xx = -3.25 + (((tickAnim - 15) / 17) * (-3.25-(-3.25)));
            yy = 0 + (((tickAnim - 15) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 17) * (0-(0)));
        }
        else if (tickAnim >= 32 && tickAnim < 50) {
            xx = -3.25 + (((tickAnim - 32) / 18) * (0-(-3.25)));
            yy = 0 + (((tickAnim - 32) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 32) / 18) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(base, base.rotateAngleX + (float) Math.toRadians(xx), base.rotateAngleY + (float) Math.toRadians(yy), base.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (-2.95-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 32) {
            xx = 0 + (((tickAnim - 15) / 17) * (0-(0)));
            yy = -2.95 + (((tickAnim - 15) / 17) * (-2.95-(-2.95)));
            zz = 0 + (((tickAnim - 15) / 17) * (0-(0)));
        }
        else if (tickAnim >= 32 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 32) / 18) * (0-(0)));
            yy = -2.95 + (((tickAnim - 32) / 18) * (0-(-2.95)));
            zz = 0 + (((tickAnim - 32) / 18) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.base.rotationPointX = this.base.rotationPointX + (float)(xx);
        this.base.rotationPointY = this.base.rotationPointY - (float)(yy);
        this.base.rotationPointZ = this.base.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (27.25-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (-11.5-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 32) {
            xx = 27.25 + (((tickAnim - 15) / 17) * (27.25-(27.25)));
            yy = -11.5 + (((tickAnim - 15) / 17) * (-11.5-(-11.5)));
            zz = 0 + (((tickAnim - 15) / 17) * (0-(0)));
        }
        else if (tickAnim >= 32 && tickAnim < 50) {
            xx = 27.25 + (((tickAnim - 32) / 18) * (0-(27.25)));
            yy = -11.5 + (((tickAnim - 32) / 18) * (0-(-11.5)));
            zz = 0 + (((tickAnim - 32) / 18) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftleg, leftleg.rotateAngleX + (float) Math.toRadians(xx), leftleg.rotateAngleY + (float) Math.toRadians(yy), leftleg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (16.5-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 32) {
            xx = 16.5 + (((tickAnim - 15) / 17) * (16.5-(16.5)));
            yy = 0 + (((tickAnim - 15) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 17) * (0-(0)));
        }
        else if (tickAnim >= 32 && tickAnim < 38) {
            xx = 16.5 + (((tickAnim - 32) / 6) * (31.85-(16.5)));
            yy = 0 + (((tickAnim - 32) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 32) / 6) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 42) {
            xx = 31.85 + (((tickAnim - 38) / 4) * (23.98-(31.85)));
            yy = 0 + (((tickAnim - 38) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 38) / 4) * (0-(0)));
        }
        else if (tickAnim >= 42 && tickAnim < 50) {
            xx = 23.98 + (((tickAnim - 42) / 8) * (0-(23.98)));
            yy = 0 + (((tickAnim - 42) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 42) / 8) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftleg2, leftleg2.rotateAngleX + (float) Math.toRadians(xx), leftleg2.rotateAngleY + (float) Math.toRadians(yy), leftleg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (20-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 32) {
            xx = 20 + (((tickAnim - 15) / 17) * (20-(20)));
            yy = 0 + (((tickAnim - 15) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 17) * (0-(0)));
        }
        else if (tickAnim >= 32 && tickAnim < 42) {
            xx = 20 + (((tickAnim - 32) / 10) * (-18.41-(20)));
            yy = 0 + (((tickAnim - 32) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 32) / 10) * (0-(0)));
        }
        else if (tickAnim >= 42 && tickAnim < 50) {
            xx = -18.41 + (((tickAnim - 42) / 8) * (0-(-18.41)));
            yy = 0 + (((tickAnim - 42) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 42) / 8) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftleg3, leftleg3.rotateAngleX + (float) Math.toRadians(xx), leftleg3.rotateAngleY + (float) Math.toRadians(yy), leftleg3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (-60.25-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 32) {
            xx = -60.25 + (((tickAnim - 15) / 17) * (-60.25-(-60.25)));
            yy = 0 + (((tickAnim - 15) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 17) * (0-(0)));
        }
        else if (tickAnim >= 32 && tickAnim < 37) {
            xx = -60.25 + (((tickAnim - 32) / 5) * (-48.57-(-60.25)));
            yy = 0 + (((tickAnim - 32) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 32) / 5) * (0-(0)));
        }
        else if (tickAnim >= 37 && tickAnim < 42) {
            xx = -48.57 + (((tickAnim - 37) / 5) * (-6.39-(-48.57)));
            yy = 0 + (((tickAnim - 37) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 37) / 5) * (0-(0)));
        }
        else if (tickAnim >= 42 && tickAnim < 50) {
            xx = -6.39 + (((tickAnim - 42) / 8) * (0-(-6.39)));
            yy = 0 + (((tickAnim - 42) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 42) / 8) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftfoot, leftfoot.rotateAngleX + (float) Math.toRadians(xx), leftfoot.rotateAngleY + (float) Math.toRadians(yy), leftfoot.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (7.25-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 32) {
            xx = 7.25 + (((tickAnim - 15) / 17) * (7.25-(7.25)));
            yy = 0 + (((tickAnim - 15) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 17) * (0-(0)));
        }
        else if (tickAnim >= 32 && tickAnim < 50) {
            xx = 7.25 + (((tickAnim - 32) / 18) * (0-(7.25)));
            yy = 0 + (((tickAnim - 32) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 32) / 18) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(xx), body.rotateAngleY + (float) Math.toRadians(yy), body.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (4.25-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 32) {
            xx = 4.25 + (((tickAnim - 15) / 17) * (4.25-(4.25)));
            yy = 0 + (((tickAnim - 15) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 17) * (0-(0)));
        }
        else if (tickAnim >= 32 && tickAnim < 50) {
            xx = 4.25 + (((tickAnim - 32) / 18) * (0-(4.25)));
            yy = 0 + (((tickAnim - 32) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 32) / 18) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(xx), chest.rotateAngleY + (float) Math.toRadians(yy), chest.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (6.27794-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (9.01579-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (-17.98852-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 32) {
            xx = 6.27794 + (((tickAnim - 15) / 17) * (6.27794-(6.27794)));
            yy = 9.01579 + (((tickAnim - 15) / 17) * (9.01579-(9.01579)));
            zz = -17.98852 + (((tickAnim - 15) / 17) * (-17.98852-(-17.98852)));
        }
        else if (tickAnim >= 32 && tickAnim < 50) {
            xx = 6.27794 + (((tickAnim - 32) / 18) * (0-(6.27794)));
            yy = 9.01579 + (((tickAnim - 32) / 18) * (0-(9.01579)));
            zz = -17.98852 + (((tickAnim - 32) / 18) * (0-(-17.98852)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftarm, leftarm.rotateAngleX + (float) Math.toRadians(xx), leftarm.rotateAngleY + (float) Math.toRadians(yy), leftarm.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (1.4-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 32) {
            xx = 0 + (((tickAnim - 15) / 17) * (0-(0)));
            yy = 1.4 + (((tickAnim - 15) / 17) * (1.4-(1.4)));
            zz = 0 + (((tickAnim - 15) / 17) * (0-(0)));
        }
        else if (tickAnim >= 32 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 32) / 18) * (0-(0)));
            yy = 1.4 + (((tickAnim - 32) / 18) * (0-(1.4)));
            zz = 0 + (((tickAnim - 32) / 18) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftarm.rotationPointX = this.leftarm.rotationPointX + (float)(xx);
        this.leftarm.rotationPointY = this.leftarm.rotationPointY - (float)(yy);
        this.leftarm.rotationPointZ = this.leftarm.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (-35.24717-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0.3461-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (12.4382-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 32) {
            xx = -35.24717 + (((tickAnim - 15) / 17) * (-35.24717-(-35.24717)));
            yy = 0.3461 + (((tickAnim - 15) / 17) * (0.3461-(0.3461)));
            zz = 12.4382 + (((tickAnim - 15) / 17) * (12.4382-(12.4382)));
        }
        else if (tickAnim >= 32 && tickAnim < 50) {
            xx = -35.24717 + (((tickAnim - 32) / 18) * (0-(-35.24717)));
            yy = 0.3461 + (((tickAnim - 32) / 18) * (0-(0.3461)));
            zz = 12.4382 + (((tickAnim - 32) / 18) * (0-(12.4382)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftarm2, leftarm2.rotateAngleX + (float) Math.toRadians(xx), leftarm2.rotateAngleY + (float) Math.toRadians(yy), leftarm2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (11.25-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 32) {
            xx = 11.25 + (((tickAnim - 15) / 17) * (11.25-(11.25)));
            yy = 0 + (((tickAnim - 15) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 17) * (0-(0)));
        }
        else if (tickAnim >= 32 && tickAnim < 50) {
            xx = 11.25 + (((tickAnim - 32) / 18) * (0-(11.25)));
            yy = 0 + (((tickAnim - 32) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 32) / 18) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(lefthand, lefthand.rotateAngleX + (float) Math.toRadians(xx), lefthand.rotateAngleY + (float) Math.toRadians(yy), lefthand.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 0) / 23) * (0.55+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120+50))*3-(0)));
            yy = 0 + (((tickAnim - 0) / 23) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 23) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 50) {
            xx = 0.55+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120+50))*3 + (((tickAnim - 23) / 27) * (0-(0.55+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120+50))*3)));
            yy = 0 + (((tickAnim - 23) / 27) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 27) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(xx), neck.rotateAngleY + (float) Math.toRadians(yy), neck.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (-5.5-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 23) {
            xx = -5.5 + (((tickAnim - 15) / 8) * (-7.75-(-5.5)));
            yy = 0 + (((tickAnim - 15) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 8) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 50) {
            xx = -7.75 + (((tickAnim - 23) / 27) * (0-(-7.75)));
            yy = 0 + (((tickAnim - 23) / 27) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 27) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(xx), neck2.rotateAngleY + (float) Math.toRadians(yy), neck2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (6-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 23) {
            xx = 6 + (((tickAnim - 15) / 8) * (8.5-(6)));
            yy = 0 + (((tickAnim - 15) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 8) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 32) {
            xx = 8.5 + (((tickAnim - 23) / 9) * (6-(8.5)));
            yy = 0 + (((tickAnim - 23) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 9) * (0-(0)));
        }
        else if (tickAnim >= 32 && tickAnim < 50) {
            xx = 6 + (((tickAnim - 32) / 18) * (0-(6)));
            yy = 0 + (((tickAnim - 32) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 32) / 18) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 29) {
            xx = 0 + (((tickAnim - 15) / 14) * (6+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120+50))*3-(0)));
            yy = 0 + (((tickAnim - 15) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 14) * (0-(0)));
        }
        else if (tickAnim >= 29 && tickAnim < 43) {
            xx = 6+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120+50))*3 + (((tickAnim - 29) / 14) * (0-(6+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120+50))*3)));
            yy = 0 + (((tickAnim - 29) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 29) / 14) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(xx), jaw.rotateAngleY + (float) Math.toRadians(yy), jaw.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (-9.0594-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (-7.69988-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0.88265-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 32) {
            xx = -9.0594 + (((tickAnim - 15) / 17) * (-9.0594-(-9.0594)));
            yy = -7.69988 + (((tickAnim - 15) / 17) * (-7.69988-(-7.69988)));
            zz = 0.88265 + (((tickAnim - 15) / 17) * (0.88265-(0.88265)));
        }
        else if (tickAnim >= 32 && tickAnim < 50) {
            xx = -9.0594 + (((tickAnim - 32) / 18) * (0-(-9.0594)));
            yy = -7.69988 + (((tickAnim - 32) / 18) * (0-(-7.69988)));
            zz = 0.88265 + (((tickAnim - 32) / 18) * (0-(0.88265)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail1, tail1.rotateAngleX + (float) Math.toRadians(xx), tail1.rotateAngleY + (float) Math.toRadians(yy), tail1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (-5.40624-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (-15.77436-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (-0.32505-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 32) {
            xx = -5.40624 + (((tickAnim - 15) / 17) * (-5.40624-(-5.40624)));
            yy = -15.77436 + (((tickAnim - 15) / 17) * (-15.77436-(-15.77436)));
            zz = -0.32505 + (((tickAnim - 15) / 17) * (-0.32505-(-0.32505)));
        }
        else if (tickAnim >= 32 && tickAnim < 41) {
            xx = -5.40624 + (((tickAnim - 32) / 9) * (-11.70312-(-5.40624)));
            yy = -15.77436 + (((tickAnim - 32) / 9) * (-7.88718-(-15.77436)));
            zz = -0.32505 + (((tickAnim - 32) / 9) * (-0.16252-(-0.32505)));
        }
        else if (tickAnim >= 41 && tickAnim < 50) {
            xx = -11.70312 + (((tickAnim - 41) / 9) * (0-(-11.70312)));
            yy = -7.88718 + (((tickAnim - 41) / 9) * (0-(-7.88718)));
            zz = -0.16252 + (((tickAnim - 41) / 9) * (0-(-0.16252)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(xx), tail2.rotateAngleY + (float) Math.toRadians(yy), tail2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (8.24072-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (-12.43459-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (-2.29548-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 32) {
            xx = 8.24072 + (((tickAnim - 15) / 17) * (8.24072-(8.24072)));
            yy = -12.43459 + (((tickAnim - 15) / 17) * (-12.43459-(-12.43459)));
            zz = -2.29548 + (((tickAnim - 15) / 17) * (-2.29548-(-2.29548)));
        }
        else if (tickAnim >= 32 && tickAnim < 41) {
            xx = 8.24072 + (((tickAnim - 32) / 9) * (-1.37964-(8.24072)));
            yy = -12.43459 + (((tickAnim - 32) / 9) * (-6.2173-(-12.43459)));
            zz = -2.29548 + (((tickAnim - 32) / 9) * (-1.14774-(-2.29548)));
        }
        else if (tickAnim >= 41 && tickAnim < 50) {
            xx = -1.37964 + (((tickAnim - 41) / 9) * (0-(-1.37964)));
            yy = -6.2173 + (((tickAnim - 41) / 9) * (0-(-6.2173)));
            zz = -1.14774 + (((tickAnim - 41) / 9) * (0-(-1.14774)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(xx), tail3.rotateAngleY + (float) Math.toRadians(yy), tail3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (28.94302-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (1.85016-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0.08611-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 32) {
            xx = 28.94302 + (((tickAnim - 15) / 17) * (28.94302-(28.94302)));
            yy = 1.85016 + (((tickAnim - 15) / 17) * (1.85016-(1.85016)));
            zz = 0.08611 + (((tickAnim - 15) / 17) * (0.08611-(0.08611)));
        }
        else if (tickAnim >= 32 && tickAnim < 50) {
            xx = 28.94302 + (((tickAnim - 32) / 18) * (0-(28.94302)));
            yy = 1.85016 + (((tickAnim - 32) / 18) * (0-(1.85016)));
            zz = 0.08611 + (((tickAnim - 32) / 18) * (0-(0.08611)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightleg, rightleg.rotateAngleX + (float) Math.toRadians(xx), rightleg.rotateAngleY + (float) Math.toRadians(yy), rightleg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (11.25-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 32) {
            xx = 11.25 + (((tickAnim - 15) / 17) * (11.25-(11.25)));
            yy = 0 + (((tickAnim - 15) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 17) * (0-(0)));
        }
        else if (tickAnim >= 32 && tickAnim < 50) {
            xx = 11.25 + (((tickAnim - 32) / 18) * (0-(11.25)));
            yy = 0 + (((tickAnim - 32) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 32) / 18) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightleg2, rightleg2.rotateAngleX + (float) Math.toRadians(xx), rightleg2.rotateAngleY + (float) Math.toRadians(yy), rightleg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (-23.5-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 32) {
            xx = -23.5 + (((tickAnim - 15) / 17) * (-23.5-(-23.5)));
            yy = 0 + (((tickAnim - 15) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 17) * (0-(0)));
        }
        else if (tickAnim >= 32 && tickAnim < 50) {
            xx = -23.5 + (((tickAnim - 32) / 18) * (0-(-23.5)));
            yy = 0 + (((tickAnim - 32) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 32) / 18) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightleg3, rightleg3.rotateAngleX + (float) Math.toRadians(xx), rightleg3.rotateAngleY + (float) Math.toRadians(yy), rightleg3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (-13.25-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 32) {
            xx = -13.25 + (((tickAnim - 15) / 17) * (-13.25-(-13.25)));
            yy = 0 + (((tickAnim - 15) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 17) * (0-(0)));
        }
        else if (tickAnim >= 32 && tickAnim < 50) {
            xx = -13.25 + (((tickAnim - 32) / 18) * (0-(-13.25)));
            yy = 0 + (((tickAnim - 32) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 32) / 18) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightfoot, rightfoot.rotateAngleX + (float) Math.toRadians(xx), rightfoot.rotateAngleY + (float) Math.toRadians(yy), rightfoot.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0.8-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 32) {
            xx = 0 + (((tickAnim - 15) / 17) * (0-(0)));
            yy = 0.8 + (((tickAnim - 15) / 17) * (0.8-(0.8)));
            zz = 0 + (((tickAnim - 15) / 17) * (0-(0)));
        }
        else if (tickAnim >= 32 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 32) / 18) * (0-(0)));
            yy = 0.8 + (((tickAnim - 32) / 18) * (0-(0.8)));
            zz = 0 + (((tickAnim - 32) / 18) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightfoot.rotationPointX = this.rightfoot.rotationPointX + (float)(xx);
        this.rightfoot.rotationPointY = this.rightfoot.rotationPointY - (float)(yy);
        this.rightfoot.rotationPointZ = this.rightfoot.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (31.16305-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (-3.355-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (10.22105-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 32) {
            xx = 31.16305 + (((tickAnim - 15) / 17) * (31.16305-(31.16305)));
            yy = -3.355 + (((tickAnim - 15) / 17) * (-3.355-(-3.355)));
            zz = 10.22105 + (((tickAnim - 15) / 17) * (10.22105-(10.22105)));
        }
        else if (tickAnim >= 32 && tickAnim < 50) {
            xx = 31.16305 + (((tickAnim - 32) / 18) * (0-(31.16305)));
            yy = -3.355 + (((tickAnim - 32) / 18) * (0-(-3.355)));
            zz = 10.22105 + (((tickAnim - 32) / 18) * (0-(10.22105)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightarm, rightarm.rotateAngleX + (float) Math.toRadians(xx), rightarm.rotateAngleY + (float) Math.toRadians(yy), rightarm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (-35.5-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 32) {
            xx = -35.5 + (((tickAnim - 15) / 17) * (-35.5-(-35.5)));
            yy = 0 + (((tickAnim - 15) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 17) * (0-(0)));
        }
        else if (tickAnim >= 32 && tickAnim < 50) {
            xx = -35.5 + (((tickAnim - 32) / 18) * (0-(-35.5)));
            yy = 0 + (((tickAnim - 32) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 32) / 18) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightarm2, rightarm2.rotateAngleX + (float) Math.toRadians(xx), rightarm2.rotateAngleY + (float) Math.toRadians(yy), rightarm2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (-2.51104-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0.5133-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (-7.25444-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 32) {
            xx = -2.51104 + (((tickAnim - 15) / 17) * (-2.51104-(-2.51104)));
            yy = 0.5133 + (((tickAnim - 15) / 17) * (0.5133-(0.5133)));
            zz = -7.25444 + (((tickAnim - 15) / 17) * (-7.25444-(-7.25444)));
        }
        else if (tickAnim >= 32 && tickAnim < 50) {
            xx = -2.51104 + (((tickAnim - 32) / 18) * (0-(-2.51104)));
            yy = 0.5133 + (((tickAnim - 32) / 18) * (0-(0.5133)));
            zz = -7.25444 + (((tickAnim - 32) / 18) * (0-(-7.25444)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(righthand, righthand.rotateAngleX + (float) Math.toRadians(xx), righthand.rotateAngleY + (float) Math.toRadians(yy), righthand.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0.375-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 32) {
            xx = 0 + (((tickAnim - 15) / 17) * (0-(0)));
            yy = 0.375 + (((tickAnim - 15) / 17) * (0.375-(0.375)));
            zz = 0 + (((tickAnim - 15) / 17) * (0-(0)));
        }
        else if (tickAnim >= 32 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 32) / 18) * (0-(0)));
            yy = 0.375 + (((tickAnim - 32) / 18) * (0-(0.375)));
            zz = 0 + (((tickAnim - 32) / 18) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.righthand.rotationPointX = this.righthand.rotationPointX + (float)(xx);
        this.righthand.rotationPointY = this.righthand.rotationPointY - (float)(yy);
        this.righthand.rotationPointZ = this.righthand.rotationPointZ + (float)(zz);


    }
    public void animNest(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraKunbarrasaurus entity = (EntityPrehistoricFloraKunbarrasaurus) entitylivingbaseIn;
        int animCycle = 50;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (-0.75-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (1.25-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 39) {
            xx = 0 + (((tickAnim - 18) / 21) * (0-(0)));
            yy = -0.75 + (((tickAnim - 18) / 21) * (0-(-0.75)));
            zz = 1.25 + (((tickAnim - 18) / 21) * (0-(1.25)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(base, base.rotateAngleX + (float) Math.toRadians(xx), base.rotateAngleY + (float) Math.toRadians(yy), base.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (33.75-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 28) {
            xx = 33.75 + (((tickAnim - 18) / 10) * (3.25798-(33.75)));
            yy = 0 + (((tickAnim - 18) / 10) * (-2.47252-(0)));
            zz = 0 + (((tickAnim - 18) / 10) * (-0.36975-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 39) {
            xx = 3.25798 + (((tickAnim - 28) / 11) * (-16.75-(3.25798)));
            yy = -2.47252 + (((tickAnim - 28) / 11) * (0-(-2.47252)));
            zz = -0.36975 + (((tickAnim - 28) / 11) * (0-(-0.36975)));
        }
        else if (tickAnim >= 39 && tickAnim < 50) {
            xx = -16.75 + (((tickAnim - 39) / 11) * (0-(-16.75)));
            yy = 0 + (((tickAnim - 39) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 39) / 11) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftleg, leftleg.rotateAngleX + (float) Math.toRadians(xx), leftleg.rotateAngleY + (float) Math.toRadians(yy), leftleg.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 18) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 18) / 10) * (0.33-(0)));
            zz = 0 + (((tickAnim - 18) / 10) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 39) {
            xx = 0 + (((tickAnim - 28) / 11) * (0-(0)));
            yy = 0.33 + (((tickAnim - 28) / 11) * (-0.8-(0.33)));
            zz = 0 + (((tickAnim - 28) / 11) * (0-(0)));
        }
        else if (tickAnim >= 39 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 39) / 11) * (0-(0)));
            yy = -0.8 + (((tickAnim - 39) / 11) * (0-(-0.8)));
            zz = 0 + (((tickAnim - 39) / 11) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftleg.rotationPointX = this.leftleg.rotationPointX + (float)(xx);
        this.leftleg.rotationPointY = this.leftleg.rotationPointY - (float)(yy);
        this.leftleg.rotationPointZ = this.leftleg.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (20.5-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 28) {
            xx = 20.5 + (((tickAnim - 18) / 10) * (16.13-(20.5)));
            yy = 0 + (((tickAnim - 18) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 10) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 39) {
            xx = 16.13 + (((tickAnim - 28) / 11) * (4.25-(16.13)));
            yy = 0 + (((tickAnim - 28) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 11) * (0-(0)));
        }
        else if (tickAnim >= 39 && tickAnim < 50) {
            xx = 4.25 + (((tickAnim - 39) / 11) * (0-(4.25)));
            yy = 0 + (((tickAnim - 39) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 39) / 11) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftleg2, leftleg2.rotateAngleX + (float) Math.toRadians(xx), leftleg2.rotateAngleY + (float) Math.toRadians(yy), leftleg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 18) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 18) / 10) * (0.46-(0)));
            zz = 0 + (((tickAnim - 18) / 10) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 39) {
            xx = 0 + (((tickAnim - 28) / 11) * (0-(0)));
            yy = 0.46 + (((tickAnim - 28) / 11) * (-0.325-(0.46)));
            zz = 0 + (((tickAnim - 28) / 11) * (0-(0)));
        }
        else if (tickAnim >= 39 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 39) / 11) * (0-(0)));
            yy = -0.325 + (((tickAnim - 39) / 11) * (0-(-0.325)));
            zz = 0 + (((tickAnim - 39) / 11) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftleg2.rotationPointX = this.leftleg2.rotationPointX + (float)(xx);
        this.leftleg2.rotationPointY = this.leftleg2.rotationPointY - (float)(yy);
        this.leftleg2.rotationPointZ = this.leftleg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (-12.72-(0)));
            yy = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 18) {
            xx = -12.72 + (((tickAnim - 4) / 14) * (32.5-(-12.72)));
            yy = 0 + (((tickAnim - 4) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 14) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 28) {
            xx = 32.5 + (((tickAnim - 18) / 10) * (25.63-(32.5)));
            yy = 0 + (((tickAnim - 18) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 10) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 34) {
            xx = 25.63 + (((tickAnim - 28) / 6) * (-18.48-(25.63)));
            yy = 0 + (((tickAnim - 28) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 6) * (0-(0)));
        }
        else if (tickAnim >= 34 && tickAnim < 39) {
            xx = -18.48 + (((tickAnim - 34) / 5) * (12.75-(-18.48)));
            yy = 0 + (((tickAnim - 34) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 34) / 5) * (0-(0)));
        }
        else if (tickAnim >= 39 && tickAnim < 50) {
            xx = 12.75 + (((tickAnim - 39) / 11) * (0-(12.75)));
            yy = 0 + (((tickAnim - 39) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 39) / 11) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftfoot, leftfoot.rotateAngleX + (float) Math.toRadians(xx), leftfoot.rotateAngleY + (float) Math.toRadians(yy), leftfoot.rotateAngleZ + (float) Math.toRadians(zz));

        this.leftfoot.rotationPointX = this.leftfoot.rotationPointX + (float)(0);
        this.leftfoot.rotationPointY = this.leftfoot.rotationPointY - (float)(0);
        this.leftfoot.rotationPointZ = this.leftfoot.rotationPointZ + (float)(0);



        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (0.01812-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (1.38265-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (-1.28815-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 39) {
            xx = 0.01812 + (((tickAnim - 18) / 21) * (0-(0.01812)));
            yy = 1.38265 + (((tickAnim - 18) / 21) * (0-(1.38265)));
            zz = -1.28815 + (((tickAnim - 18) / 21) * (0-(-1.28815)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(xx), body.rotateAngleY + (float) Math.toRadians(yy), body.rotateAngleZ + (float) Math.toRadians(zz));



        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(0), chest.rotateAngleY + (float) Math.toRadians(0), chest.rotateAngleZ + (float) Math.toRadians(0));



        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (-4.5-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 39) {
            xx = 0 + (((tickAnim - 18) / 21) * (0-(0)));
            yy = -4.5 + (((tickAnim - 18) / 21) * (0-(-4.5)));
            zz = 0 + (((tickAnim - 18) / 21) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftarm, leftarm.rotateAngleX + (float) Math.toRadians(xx), leftarm.rotateAngleY + (float) Math.toRadians(yy), leftarm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0.575+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+20))*1-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 39) {
            xx = 0 + (((tickAnim - 18) / 21) * (0-(0)));
            yy = 0.575+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+20))*1 + (((tickAnim - 18) / 21) * (0-(0.575+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+20))*1)));
            zz = 0 + (((tickAnim - 18) / 21) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail1, tail1.rotateAngleX + (float) Math.toRadians(xx), tail1.rotateAngleY + (float) Math.toRadians(yy), tail1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0.575+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+40))*1-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 39) {
            xx = 0 + (((tickAnim - 18) / 21) * (0-(0)));
            yy = 0.575+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+40))*1 + (((tickAnim - 18) / 21) * (0-(0.575+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+40))*1)));
            zz = 0 + (((tickAnim - 18) / 21) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(xx), tail2.rotateAngleY + (float) Math.toRadians(yy), tail2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (-0.15+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+60))*-1-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 39) {
            xx = 0 + (((tickAnim - 18) / 21) * (0-(0)));
            yy = -0.15+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+60))*-1 + (((tickAnim - 18) / 21) * (0-(-0.15+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+60))*-1)));
            zz = 0 + (((tickAnim - 18) / 21) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(xx), tail3.rotateAngleY + (float) Math.toRadians(yy), tail3.rotateAngleZ + (float) Math.toRadians(zz));


    }
    public void animEat(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraKunbarrasaurus entity = (EntityPrehistoricFloraKunbarrasaurus) entitylivingbaseIn;
        int animCycle = 35;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (9-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = 9 + (((tickAnim - 15) / 5) * (9-(9)));
            yy = 0 + (((tickAnim - 15) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 5) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 35) {
            xx = 9 + (((tickAnim - 20) / 15) * (0-(9)));
            yy = 0 + (((tickAnim - 20) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(xx), body.rotateAngleY + (float) Math.toRadians(yy), body.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (6.5-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = 6.5 + (((tickAnim - 15) / 5) * (6.5-(6.5)));
            yy = 0 + (((tickAnim - 15) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 5) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 35) {
            xx = 6.5 + (((tickAnim - 20) / 15) * (0-(6.5)));
            yy = 0 + (((tickAnim - 20) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(xx), chest.rotateAngleY + (float) Math.toRadians(yy), chest.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (-36.7386-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (-0.9888-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (-20.2621-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = -36.7386 + (((tickAnim - 15) / 5) * (-36.7386-(-36.7386)));
            yy = -0.9888 + (((tickAnim - 15) / 5) * (-0.9888-(-0.9888)));
            zz = -20.2621 + (((tickAnim - 15) / 5) * (-20.2621-(-20.2621)));
        }
        else if (tickAnim >= 20 && tickAnim < 35) {
            xx = -36.7386 + (((tickAnim - 20) / 15) * (0-(-36.7386)));
            yy = -0.9888 + (((tickAnim - 20) / 15) * (0-(-0.9888)));
            zz = -20.2621 + (((tickAnim - 20) / 15) * (0-(-20.2621)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftarm, leftarm.rotateAngleX + (float) Math.toRadians(xx), leftarm.rotateAngleY + (float) Math.toRadians(yy), leftarm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (-21.47343-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (-5.13445-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (12.43555-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = -21.47343 + (((tickAnim - 15) / 5) * (-21.47343-(-21.47343)));
            yy = -5.13445 + (((tickAnim - 15) / 5) * (-5.13445-(-5.13445)));
            zz = 12.43555 + (((tickAnim - 15) / 5) * (12.43555-(12.43555)));
        }
        else if (tickAnim >= 20 && tickAnim < 35) {
            xx = -21.47343 + (((tickAnim - 20) / 15) * (0-(-21.47343)));
            yy = -5.13445 + (((tickAnim - 20) / 15) * (0-(-5.13445)));
            zz = 12.43555 + (((tickAnim - 20) / 15) * (0-(12.43555)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftarm2, leftarm2.rotateAngleX + (float) Math.toRadians(xx), leftarm2.rotateAngleY + (float) Math.toRadians(yy), leftarm2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (-0.375-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0.3-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = -0.375 + (((tickAnim - 15) / 5) * (-0.375-(-0.375)));
            yy = 0.3 + (((tickAnim - 15) / 5) * (0.3-(0.3)));
            zz = 0 + (((tickAnim - 15) / 5) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 35) {
            xx = -0.375 + (((tickAnim - 20) / 15) * (0-(-0.375)));
            yy = 0.3 + (((tickAnim - 20) / 15) * (0-(0.3)));
            zz = 0 + (((tickAnim - 20) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftarm2.rotationPointX = this.leftarm2.rotationPointX + (float)(xx);
        this.leftarm2.rotationPointY = this.leftarm2.rotationPointY - (float)(yy);
        this.leftarm2.rotationPointZ = this.leftarm2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (35.26853-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (-2.12389-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0.77225-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = 35.26853 + (((tickAnim - 15) / 5) * (35.26853-(35.26853)));
            yy = -2.12389 + (((tickAnim - 15) / 5) * (-2.12389-(-2.12389)));
            zz = 0.77225 + (((tickAnim - 15) / 5) * (0.77225-(0.77225)));
        }
        else if (tickAnim >= 20 && tickAnim < 35) {
            xx = 35.26853 + (((tickAnim - 20) / 15) * (0-(35.26853)));
            yy = -2.12389 + (((tickAnim - 20) / 15) * (0-(-2.12389)));
            zz = 0.77225 + (((tickAnim - 20) / 15) * (0-(0.77225)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(lefthand, lefthand.rotateAngleX + (float) Math.toRadians(xx), lefthand.rotateAngleY + (float) Math.toRadians(yy), lefthand.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (19-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = 19 + (((tickAnim - 15) / 5) * (8.5-(19)));
            yy = 0 + (((tickAnim - 15) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 5) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 35) {
            xx = 8.5 + (((tickAnim - 20) / 15) * (0-(8.5)));
            yy = 0 + (((tickAnim - 20) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(xx), neck.rotateAngleY + (float) Math.toRadians(yy), neck.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (1.35729-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (2.38457-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (-6.84861-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = 1.35729 + (((tickAnim - 15) / 5) * (19.25-(1.35729)));
            yy = 2.38457 + (((tickAnim - 15) / 5) * (0-(2.38457)));
            zz = -6.84861 + (((tickAnim - 15) / 5) * (0-(-6.84861)));
        }
        else if (tickAnim >= 20 && tickAnim < 35) {
            xx = 19.25 + (((tickAnim - 20) / 15) * (0-(19.25)));
            yy = 0 + (((tickAnim - 20) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(xx), neck2.rotateAngleY + (float) Math.toRadians(yy), neck2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (-13.42353-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (-1.2246-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (-7.14637-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = -13.42353 + (((tickAnim - 15) / 5) * (-9.75-(-13.42353)));
            yy = -1.2246 + (((tickAnim - 15) / 5) * (0-(-1.2246)));
            zz = -7.14637 + (((tickAnim - 15) / 5) * (0-(-7.14637)));
        }
        else if (tickAnim >= 20 && tickAnim < 35) {
            xx = -9.75 + (((tickAnim - 20) / 15) * (0-(-9.75)));
            yy = 0 + (((tickAnim - 20) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 15) * (0-(0)));
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
        else if (tickAnim >= 7 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 7) / 8) * (22.5-(0)));
            yy = 0 + (((tickAnim - 7) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 8) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = 22.5 + (((tickAnim - 15) / 5) * (0-(22.5)));
            yy = 0 + (((tickAnim - 15) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(xx), jaw.rotateAngleY + (float) Math.toRadians(yy), jaw.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (-36.7386-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (-0.9888-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (20.2621-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = -36.7386 + (((tickAnim - 15) / 5) * (-36.7386-(-36.7386)));
            yy = -0.9888 + (((tickAnim - 15) / 5) * (-0.9888-(-0.9888)));
            zz = 20.2621 + (((tickAnim - 15) / 5) * (20.2621-(20.2621)));
        }
        else if (tickAnim >= 20 && tickAnim < 35) {
            xx = -36.7386 + (((tickAnim - 20) / 15) * (0-(-36.7386)));
            yy = -0.9888 + (((tickAnim - 20) / 15) * (0-(-0.9888)));
            zz = 20.2621 + (((tickAnim - 20) / 15) * (0-(20.2621)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightarm, rightarm.rotateAngleX + (float) Math.toRadians(xx), rightarm.rotateAngleY + (float) Math.toRadians(yy), rightarm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (-21.47343-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (5.13445-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (-12.43555-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = -21.47343 + (((tickAnim - 15) / 5) * (-21.47343-(-21.47343)));
            yy = 5.13445 + (((tickAnim - 15) / 5) * (5.13445-(5.13445)));
            zz = -12.43555 + (((tickAnim - 15) / 5) * (-12.43555-(-12.43555)));
        }
        else if (tickAnim >= 20 && tickAnim < 35) {
            xx = -21.47343 + (((tickAnim - 20) / 15) * (0-(-21.47343)));
            yy = 5.13445 + (((tickAnim - 20) / 15) * (0-(5.13445)));
            zz = -12.43555 + (((tickAnim - 20) / 15) * (0-(-12.43555)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightarm2, rightarm2.rotateAngleX + (float) Math.toRadians(xx), rightarm2.rotateAngleY + (float) Math.toRadians(yy), rightarm2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (-0.375-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0.3-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = -0.375 + (((tickAnim - 15) / 5) * (-0.375-(-0.375)));
            yy = 0.3 + (((tickAnim - 15) / 5) * (0.3-(0.3)));
            zz = 0 + (((tickAnim - 15) / 5) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 35) {
            xx = -0.375 + (((tickAnim - 20) / 15) * (0-(-0.375)));
            yy = 0.3 + (((tickAnim - 20) / 15) * (0-(0.3)));
            zz = 0 + (((tickAnim - 20) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightarm2.rotationPointX = this.rightarm2.rotationPointX + (float)(xx);
        this.rightarm2.rotationPointY = this.rightarm2.rotationPointY - (float)(yy);
        this.rightarm2.rotationPointZ = this.rightarm2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (35.26853-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (-2.12389-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0.77225-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = 35.26853 + (((tickAnim - 15) / 5) * (35.26853-(35.26853)));
            yy = -2.12389 + (((tickAnim - 15) / 5) * (-2.12389-(-2.12389)));
            zz = 0.77225 + (((tickAnim - 15) / 5) * (0.77225-(0.77225)));
        }
        else if (tickAnim >= 20 && tickAnim < 35) {
            xx = 35.26853 + (((tickAnim - 20) / 15) * (0-(35.26853)));
            yy = -2.12389 + (((tickAnim - 20) / 15) * (0-(-2.12389)));
            zz = 0.77225 + (((tickAnim - 20) / 15) * (0-(0.77225)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(righthand, righthand.rotateAngleX + (float) Math.toRadians(xx), righthand.rotateAngleY + (float) Math.toRadians(yy), righthand.rotateAngleZ + (float) Math.toRadians(zz));


    }
    public void animNoise(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraKunbarrasaurus entity = (EntityPrehistoricFloraKunbarrasaurus) entitylivingbaseIn;
        int animCycle = 30;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 0) / 6) * (0.55+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150-50))*8-(0)));
            yy = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 20) {
            xx = 0.55+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150-50))*8 + (((tickAnim - 6) / 14) * (0-(0.55+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150-50))*8)));
            yy = 0 + (((tickAnim - 6) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 14) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-20))*4-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-20))*4 + (((tickAnim - 20) / 10) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-20))*4)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(xx), neck.rotateAngleY + (float) Math.toRadians(yy), neck.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 0) / 6) * (-0.8+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150-50))*-5-(0)));
            yy = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 10) {
            xx = -0.8+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150-50))*-5 + (((tickAnim - 6) / 4) * (-2.05-(-0.8+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150-50))*-5)));
            yy = 0 + (((tickAnim - 6) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 4) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = -2.05 + (((tickAnim - 10) / 10) * (0-(-2.05)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*820-50))*5-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*820-50))*5 + (((tickAnim - 20) / 10) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*820-50))*5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(xx), neck2.rotateAngleY + (float) Math.toRadians(yy), neck2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 0) / 6) * (-0.425-Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-50))*10-(0)));
            yy = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 10) {
            xx = -0.425-Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-50))*10 + (((tickAnim - 6) / 4) * (-2.475-(-0.425-Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-50))*10)));
            yy = 0 + (((tickAnim - 6) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 4) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = -2.475 + (((tickAnim - 10) / 10) * (0-(-2.475)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*950-70))*10-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*950-70))*10 + (((tickAnim - 20) / 10) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*950-70))*10)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 0) / 9) * (10.475+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150-50))*20-(0)));
            yy = 0 + (((tickAnim - 0) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 9) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 17) {
            xx = 10.475+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150-50))*20 + (((tickAnim - 9) / 8) * (0-(10.475+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150-50))*20)));
            yy = 0 + (((tickAnim - 9) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 8) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(xx), jaw.rotateAngleY + (float) Math.toRadians(yy), jaw.rotateAngleZ + (float) Math.toRadians(zz));


    }
    public void animAlert(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraKunbarrasaurus entity = (EntityPrehistoricFloraKunbarrasaurus) entitylivingbaseIn;
        int animCycle = 140;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;


        this.setRotateAngle(leftleg, leftleg.rotateAngleX + (float) Math.toRadians(0), leftleg.rotateAngleY + (float) Math.toRadians(0), leftleg.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(leftleg2, leftleg2.rotateAngleX + (float) Math.toRadians(0), leftleg2.rotateAngleY + (float) Math.toRadians(0), leftleg2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(leftfoot, leftfoot.rotateAngleX + (float) Math.toRadians(0), leftfoot.rotateAngleY + (float) Math.toRadians(0), leftfoot.rotateAngleZ + (float) Math.toRadians(0));



        if (tickAnim >= 0 && tickAnim < 68) {
            xx = 0 + (((tickAnim - 0) / 68) * (-2.5-(0)));
            yy = 0 + (((tickAnim - 0) / 68) * (-1.25-(0)));
            zz = 0 + (((tickAnim - 0) / 68) * (0-(0)));
        }
        else if (tickAnim >= 68 && tickAnim < 120) {
            xx = -2.5 + (((tickAnim - 68) / 52) * (-2.5-(-2.5)));
            yy = -1.25 + (((tickAnim - 68) / 52) * (-1.25-(-1.25)));
            zz = 0 + (((tickAnim - 68) / 52) * (0-(0)));
        }
        else if (tickAnim >= 120 && tickAnim < 141) {
            xx = -2.5 + (((tickAnim - 120) / 21) * (0-(-2.5)));
            yy = -1.25 + (((tickAnim - 120) / 21) * (0-(-1.25)));
            zz = 0 + (((tickAnim - 120) / 21) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(xx), body.rotateAngleY + (float) Math.toRadians(yy), body.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 68) {
            xx = 0 + (((tickAnim - 0) / 68) * (-2.25-(0)));
            yy = 0 + (((tickAnim - 0) / 68) * (-0.75-(0)));
            zz = 0 + (((tickAnim - 0) / 68) * (0-(0)));
        }
        else if (tickAnim >= 68 && tickAnim < 120) {
            xx = -2.25 + (((tickAnim - 68) / 52) * (-2.25-(-2.25)));
            yy = -0.75 + (((tickAnim - 68) / 52) * (-0.75-(-0.75)));
            zz = 0 + (((tickAnim - 68) / 52) * (0-(0)));
        }
        else if (tickAnim >= 120 && tickAnim < 141) {
            xx = -2.25 + (((tickAnim - 120) / 21) * (0-(-2.25)));
            yy = -0.75 + (((tickAnim - 120) / 21) * (0-(-0.75)));
            zz = 0 + (((tickAnim - 120) / 21) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(xx), chest.rotateAngleY + (float) Math.toRadians(yy), chest.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 0) / 14) * (9.17361-(0)));
            yy = 0 + (((tickAnim - 0) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 14) * (-2.00694-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 30) {
            xx = 9.17361 + (((tickAnim - 14) / 16) * (14.25-(9.17361)));
            yy = 0 + (((tickAnim - 14) / 16) * (0-(0)));
            zz = -2.00694 + (((tickAnim - 14) / 16) * (-4.25-(-2.00694)));
        }
        else if (tickAnim >= 30 && tickAnim < 68) {
            xx = 14.25 + (((tickAnim - 30) / 38) * (11.5-(14.25)));
            yy = 0 + (((tickAnim - 30) / 38) * (0-(0)));
            zz = -4.25 + (((tickAnim - 30) / 38) * (-4.25-(-4.25)));
        }
        else if (tickAnim >= 68 && tickAnim < 120) {
            xx = 11.5 + (((tickAnim - 68) / 52) * (11.5-(11.5)));
            yy = 0 + (((tickAnim - 68) / 52) * (0-(0)));
            zz = -4.25 + (((tickAnim - 68) / 52) * (-4.25-(-4.25)));
        }
        else if (tickAnim >= 120 && tickAnim < 130) {
            xx = 11.5 + (((tickAnim - 120) / 10) * (2.23221-(11.5)));
            yy = 0 + (((tickAnim - 120) / 10) * (2.6523-(0)));
            zz = -4.25 + (((tickAnim - 120) / 10) * (-15.47534-(-4.25)));
        }
        else if (tickAnim >= 130 && tickAnim < 141) {
            xx = 2.23221 + (((tickAnim - 130) / 11) * (0-(2.23221)));
            yy = 2.6523 + (((tickAnim - 130) / 11) * (0-(2.6523)));
            zz = -15.47534 + (((tickAnim - 130) / 11) * (0-(-15.47534)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftarm, leftarm.rotateAngleX + (float) Math.toRadians(xx), leftarm.rotateAngleY + (float) Math.toRadians(yy), leftarm.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 0) / 14) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 14) * (0.275-(0)));
            zz = 0 + (((tickAnim - 0) / 14) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 14) / 16) * (0-(0)));
            yy = 0.275 + (((tickAnim - 14) / 16) * (-0.275-(0.275)));
            zz = 0 + (((tickAnim - 14) / 16) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 68) {
            xx = 0 + (((tickAnim - 30) / 38) * (0-(0)));
            yy = -0.275 + (((tickAnim - 30) / 38) * (-0.305-(-0.275)));
            zz = 0 + (((tickAnim - 30) / 38) * (0.25-(0)));
        }
        else if (tickAnim >= 68 && tickAnim < 120) {
            xx = 0 + (((tickAnim - 68) / 52) * (0-(0)));
            yy = -0.305 + (((tickAnim - 68) / 52) * (-0.305-(-0.305)));
            zz = 0.25 + (((tickAnim - 68) / 52) * (0.25-(0.25)));
        }
        else if (tickAnim >= 120 && tickAnim < 130) {
            xx = 0 + (((tickAnim - 120) / 10) * (0-(0)));
            yy = -0.305 + (((tickAnim - 120) / 10) * (0.09-(-0.305)));
            zz = 0.25 + (((tickAnim - 120) / 10) * (0.13-(0.25)));
        }
        else if (tickAnim >= 130 && tickAnim < 141) {
            xx = 0 + (((tickAnim - 130) / 11) * (0-(0)));
            yy = 0.09 + (((tickAnim - 130) / 11) * (0-(0.09)));
            zz = 0.13 + (((tickAnim - 130) / 11) * (0-(0.13)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftarm.rotationPointX = this.leftarm.rotationPointX + (float)(xx);
        this.leftarm.rotationPointY = this.leftarm.rotationPointY - (float)(yy);
        this.leftarm.rotationPointZ = this.leftarm.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 0) / 14) * (-19.25-(0)));
            yy = 0 + (((tickAnim - 0) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 14) * (2.71528-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 30) {
            xx = -19.25 + (((tickAnim - 14) / 16) * (10.24349-(-19.25)));
            yy = 0 + (((tickAnim - 14) / 16) * (0.53138-(0)));
            zz = 2.71528 + (((tickAnim - 14) / 16) * (4.34726-(2.71528)));
        }
        else if (tickAnim >= 30 && tickAnim < 68) {
            xx = 10.24349 + (((tickAnim - 30) / 38) * (18.99349-(10.24349)));
            yy = 0.53138 + (((tickAnim - 30) / 38) * (0.53138-(0.53138)));
            zz = 4.34726 + (((tickAnim - 30) / 38) * (4.34726-(4.34726)));
        }
        else if (tickAnim >= 68 && tickAnim < 120) {
            xx = 18.99349 + (((tickAnim - 68) / 52) * (18.99349-(18.99349)));
            yy = 0.53138 + (((tickAnim - 68) / 52) * (0.53138-(0.53138)));
            zz = 4.34726 + (((tickAnim - 68) / 52) * (4.34726-(4.34726)));
        }
        else if (tickAnim >= 120 && tickAnim < 130) {
            xx = 18.99349 + (((tickAnim - 120) / 10) * (-25.37947-(18.99349)));
            yy = 0.53138 + (((tickAnim - 120) / 10) * (-5.15952-(0.53138)));
            zz = 4.34726 + (((tickAnim - 120) / 10) * (14.08477-(4.34726)));
        }
        else if (tickAnim >= 130 && tickAnim < 141) {
            xx = -25.37947 + (((tickAnim - 130) / 11) * (0-(-25.37947)));
            yy = -5.15952 + (((tickAnim - 130) / 11) * (0-(-5.15952)));
            zz = 14.08477 + (((tickAnim - 130) / 11) * (0-(14.08477)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftarm2, leftarm2.rotateAngleX + (float) Math.toRadians(xx), leftarm2.rotateAngleY + (float) Math.toRadians(yy), leftarm2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 30) * (-0.5-(0)));
            zz = 0 + (((tickAnim - 0) / 30) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 68) {
            xx = 0 + (((tickAnim - 30) / 38) * (0-(0)));
            yy = -0.5 + (((tickAnim - 30) / 38) * (-0.455-(-0.5)));
            zz = 0 + (((tickAnim - 30) / 38) * (0-(0)));
        }
        else if (tickAnim >= 68 && tickAnim < 120) {
            xx = 0 + (((tickAnim - 68) / 52) * (0-(0)));
            yy = -0.455 + (((tickAnim - 68) / 52) * (-0.455-(-0.455)));
            zz = 0 + (((tickAnim - 68) / 52) * (0-(0)));
        }
        else if (tickAnim >= 120 && tickAnim < 141) {
            xx = 0 + (((tickAnim - 120) / 21) * (0-(0)));
            yy = -0.455 + (((tickAnim - 120) / 21) * (0-(-0.455)));
            zz = 0 + (((tickAnim - 120) / 21) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftarm2.rotationPointX = this.leftarm2.rotationPointX + (float)(xx);
        this.leftarm2.rotationPointY = this.leftarm2.rotationPointY - (float)(yy);
        this.leftarm2.rotationPointZ = this.leftarm2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 0) / 14) * (75.96-(0)));
            yy = 0 + (((tickAnim - 0) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 14) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 30) {
            xx = 75.96 + (((tickAnim - 14) / 16) * (-17.5-(75.96)));
            yy = 0 + (((tickAnim - 14) / 16) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 16) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 68) {
            xx = -17.5 + (((tickAnim - 30) / 38) * (-27.75-(-17.5)));
            yy = 0 + (((tickAnim - 30) / 38) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 38) * (0-(0)));
        }
        else if (tickAnim >= 68 && tickAnim < 120) {
            xx = -27.75 + (((tickAnim - 68) / 52) * (-27.75-(-27.75)));
            yy = 0 + (((tickAnim - 68) / 52) * (0-(0)));
            zz = 0 + (((tickAnim - 68) / 52) * (0-(0)));
        }
        else if (tickAnim >= 120 && tickAnim < 130) {
            xx = -27.75 + (((tickAnim - 120) / 10) * (72.57-(-27.75)));
            yy = 0 + (((tickAnim - 120) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 120) / 10) * (0-(0)));
        }
        else if (tickAnim >= 130 && tickAnim < 141) {
            xx = 72.57 + (((tickAnim - 130) / 11) * (0-(72.57)));
            yy = 0 + (((tickAnim - 130) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 130) / 11) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(lefthand, lefthand.rotateAngleX + (float) Math.toRadians(xx), lefthand.rotateAngleY + (float) Math.toRadians(yy), lefthand.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 30) * (0.25-(0)));
            zz = 0 + (((tickAnim - 0) / 30) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 68) {
            xx = 0 + (((tickAnim - 30) / 38) * (0-(0)));
            yy = 0.25 + (((tickAnim - 30) / 38) * (0.22-(0.25)));
            zz = 0 + (((tickAnim - 30) / 38) * (0-(0)));
        }
        else if (tickAnim >= 68 && tickAnim < 120) {
            xx = 0 + (((tickAnim - 68) / 52) * (0-(0)));
            yy = 0.22 + (((tickAnim - 68) / 52) * (0.22-(0.22)));
            zz = 0 + (((tickAnim - 68) / 52) * (0-(0)));
        }
        else if (tickAnim >= 120 && tickAnim < 141) {
            xx = 0 + (((tickAnim - 120) / 21) * (0-(0)));
            yy = 0.22 + (((tickAnim - 120) / 21) * (0-(0.22)));
            zz = 0 + (((tickAnim - 120) / 21) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.lefthand.rotationPointX = this.lefthand.rotationPointX + (float)(xx);
        this.lefthand.rotationPointY = this.lefthand.rotationPointY - (float)(yy);
        this.lefthand.rotationPointZ = this.lefthand.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 0) / 30) * (-2.92675-(0)));
            yy = 0 + (((tickAnim - 0) / 30) * (-11.2256-(0)));
            zz = 0 + (((tickAnim - 0) / 30) * (-0.74535-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 45) {
            xx = -2.92675 + (((tickAnim - 30) / 15) * (-1.92675-(-2.92675)));
            yy = -11.2256 + (((tickAnim - 30) / 15) * (-11.2256-(-11.2256)));
            zz = -0.74535 + (((tickAnim - 30) / 15) * (-0.74535-(-0.74535)));
        }
        else if (tickAnim >= 45 && tickAnim < 62) {
            xx = -1.92675 + (((tickAnim - 45) / 17) * (-2.92675-(-1.92675)));
            yy = -11.2256 + (((tickAnim - 45) / 17) * (-11.2256-(-11.2256)));
            zz = -0.74535 + (((tickAnim - 45) / 17) * (-0.74535-(-0.74535)));
        }
        else if (tickAnim >= 62 && tickAnim < 68) {
            xx = -2.92675 + (((tickAnim - 62) / 6) * (-2.42675-(-2.92675)));
            yy = -11.2256 + (((tickAnim - 62) / 6) * (-11.2256-(-11.2256)));
            zz = -0.74535 + (((tickAnim - 62) / 6) * (-0.74535-(-0.74535)));
        }
        else if (tickAnim >= 68 && tickAnim < 88) {
            xx = -2.42675 + (((tickAnim - 68) / 20) * (0.45745-(-2.42675)));
            yy = -11.2256 + (((tickAnim - 68) / 20) * (-2.36727-(-11.2256)));
            zz = -0.74535 + (((tickAnim - 68) / 20) * (1.137+Math.sin((Math.PI/180)*(((double)tickAnim/20)*620-10))*4-(-0.74535)));
        }
        else if (tickAnim >= 88 && tickAnim < 110) {
            xx = 0.45745 + (((tickAnim - 88) / 22) * (0.34028-(0.45745)));
            yy = -2.36727 + (((tickAnim - 88) / 22) * (3.9911-(-2.36727)));
            zz = 1.137+Math.sin((Math.PI/180)*(((double)tickAnim/20)*620-10))*4 + (((tickAnim - 88) / 22) * (3.00443-(1.137+Math.sin((Math.PI/180)*(((double)tickAnim/20)*620-10))*4)));
        }
        else if (tickAnim >= 110 && tickAnim < 120) {
            xx = 0.34028 + (((tickAnim - 110) / 10) * (-2.90835-(0.34028)));
            yy = 3.9911 + (((tickAnim - 110) / 10) * (6.49105-(3.9911)));
            zz = 3.00443 + (((tickAnim - 110) / 10) * (3.01937-(3.00443)));
        }
        else if (tickAnim >= 120 && tickAnim < 141) {
            xx = -2.90835 + (((tickAnim - 120) / 21) * (0-(-2.90835)));
            yy = 6.49105 + (((tickAnim - 120) / 21) * (0-(6.49105)));
            zz = 3.01937 + (((tickAnim - 120) / 21) * (0-(3.01937)));
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
            zz = 0 + (((tickAnim - 0) / 30) * (0.6-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 62) {
            xx = 0 + (((tickAnim - 30) / 32) * (0-(0)));
            yy = 0 + (((tickAnim - 30) / 32) * (0-(0)));
            zz = 0.6 + (((tickAnim - 30) / 32) * (0.6-(0.6)));
        }
        else if (tickAnim >= 62 && tickAnim < 68) {
            xx = 0 + (((tickAnim - 62) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 62) / 6) * (0-(0)));
            zz = 0.6 + (((tickAnim - 62) / 6) * (0.6-(0.6)));
        }
        else if (tickAnim >= 68 && tickAnim < 120) {
            xx = 0 + (((tickAnim - 68) / 52) * (0-(0)));
            yy = 0 + (((tickAnim - 68) / 52) * (0-(0)));
            zz = 0.6 + (((tickAnim - 68) / 52) * (0.6-(0.6)));
        }
        else if (tickAnim >= 120 && tickAnim < 141) {
            xx = 0 + (((tickAnim - 120) / 21) * (0-(0)));
            yy = 0 + (((tickAnim - 120) / 21) * (0-(0)));
            zz = 0.6 + (((tickAnim - 120) / 21) * (0-(0.6)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.neck.rotationPointX = this.neck.rotationPointX + (float)(xx);
        this.neck.rotationPointY = this.neck.rotationPointY - (float)(yy);
        this.neck.rotationPointZ = this.neck.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 0) / 30) * (-6.71488-(0)));
            yy = 0 + (((tickAnim - 0) / 30) * (-12.21133-(0)));
            zz = 0 + (((tickAnim - 0) / 30) * (-3.00807-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 45) {
            xx = -6.71488 + (((tickAnim - 30) / 15) * (-7.96488-(-6.71488)));
            yy = -12.21133 + (((tickAnim - 30) / 15) * (-12.21133-(-12.21133)));
            zz = -3.00807 + (((tickAnim - 30) / 15) * (-3.00807-(-3.00807)));
        }
        else if (tickAnim >= 45 && tickAnim < 62) {
            xx = -7.96488 + (((tickAnim - 45) / 17) * (-6.71488-(-7.96488)));
            yy = -12.21133 + (((tickAnim - 45) / 17) * (-12.21133-(-12.21133)));
            zz = -3.00807 + (((tickAnim - 45) / 17) * (-3.00807-(-3.00807)));
        }
        else if (tickAnim >= 62 && tickAnim < 68) {
            xx = -6.71488 + (((tickAnim - 62) / 6) * (-7.71488-(-6.71488)));
            yy = -12.21133 + (((tickAnim - 62) / 6) * (-12.21133-(-12.21133)));
            zz = -3.00807 + (((tickAnim - 62) / 6) * (-3.00807-(-3.00807)));
        }
        else if (tickAnim >= 68 && tickAnim < 88) {
            xx = -7.71488 + (((tickAnim - 68) / 20) * (-7.50574-(-7.71488)));
            yy = -12.21133 + (((tickAnim - 68) / 20) * (-1.43362-(-12.21133)));
            zz = -3.00807 + (((tickAnim - 68) / 20) * (1.137+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-30))*6-(-3.00807)));
        }
        else if (tickAnim >= 88 && tickAnim < 110) {
            xx = -7.50574 + (((tickAnim - 88) / 22) * (-7.74238-(-7.50574)));
            yy = -1.43362 + (((tickAnim - 88) / 22) * (7.79017-(-1.43362)));
            zz = 1.137+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-30))*6 + (((tickAnim - 88) / 22) * (-0.55152-(1.137+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-30))*6)));
        }
        else if (tickAnim >= 110 && tickAnim < 120) {
            xx = -7.74238 + (((tickAnim - 110) / 10) * (-3.8551-(-7.74238)));
            yy = 7.79017 + (((tickAnim - 110) / 10) * (9.6713-(7.79017)));
            zz = -0.55152 + (((tickAnim - 110) / 10) * (2.25774-(-0.55152)));
        }
        else if (tickAnim >= 120 && tickAnim < 141) {
            xx = -3.8551 + (((tickAnim - 120) / 21) * (0-(-3.8551)));
            yy = 9.6713 + (((tickAnim - 120) / 21) * (0-(9.6713)));
            zz = 2.25774 + (((tickAnim - 120) / 21) * (0-(2.25774)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(xx), neck2.rotateAngleY + (float) Math.toRadians(yy), neck2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 30) * (0.15-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 62) {
            xx = 0 + (((tickAnim - 30) / 32) * (0-(0)));
            yy = 0 + (((tickAnim - 30) / 32) * (0-(0)));
            zz = 0.15 + (((tickAnim - 30) / 32) * (0.15-(0.15)));
        }
        else if (tickAnim >= 62 && tickAnim < 68) {
            xx = 0 + (((tickAnim - 62) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 62) / 6) * (0-(0)));
            zz = 0.15 + (((tickAnim - 62) / 6) * (0.15-(0.15)));
        }
        else if (tickAnim >= 68 && tickAnim < 120) {
            xx = 0 + (((tickAnim - 68) / 52) * (0-(0)));
            yy = 0 + (((tickAnim - 68) / 52) * (0-(0)));
            zz = 0.15 + (((tickAnim - 68) / 52) * (0.15-(0.15)));
        }
        else if (tickAnim >= 120 && tickAnim < 141) {
            xx = 0 + (((tickAnim - 120) / 21) * (0-(0)));
            yy = 0 + (((tickAnim - 120) / 21) * (0-(0)));
            zz = 0.15 + (((tickAnim - 120) / 21) * (0-(0.15)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.neck2.rotationPointX = this.neck2.rotationPointX + (float)(xx);
        this.neck2.rotationPointY = this.neck2.rotationPointY - (float)(yy);
        this.neck2.rotationPointZ = this.neck2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 0) / 30) * (0.99525-(0)));
            yy = 0 + (((tickAnim - 0) / 30) * (-10.70437-(0)));
            zz = 0 + (((tickAnim - 0) / 30) * (-5.34324-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 45) {
            xx = 0.99525 + (((tickAnim - 30) / 15) * (-4.00475-(0.99525)));
            yy = -10.70437 + (((tickAnim - 30) / 15) * (-10.70437-(-10.70437)));
            zz = -5.34324 + (((tickAnim - 30) / 15) * (-5.34324-(-5.34324)));
        }
        else if (tickAnim >= 45 && tickAnim < 62) {
            xx = -4.00475 + (((tickAnim - 45) / 17) * (0.99525-(-4.00475)));
            yy = -10.70437 + (((tickAnim - 45) / 17) * (-10.70437-(-10.70437)));
            zz = -5.34324 + (((tickAnim - 45) / 17) * (-5.34324-(-5.34324)));
        }
        else if (tickAnim >= 62 && tickAnim < 68) {
            xx = 0.99525 + (((tickAnim - 62) / 6) * (0.99525-(0.99525)));
            yy = -10.70437 + (((tickAnim - 62) / 6) * (-10.70437-(-10.70437)));
            zz = -5.34324 + (((tickAnim - 62) / 6) * (-5.34324-(-5.34324)));
        }
        else if (tickAnim >= 68 && tickAnim < 88) {
            xx = 0.99525 + (((tickAnim - 68) / 20) * (5.08248-(0.99525)));
            yy = -10.70437 + (((tickAnim - 68) / 20) * (1.02226-(-10.70437)));
            zz = -5.34324 + (((tickAnim - 68) / 20) * (1.137+Math.sin((Math.PI/180)*(((double)tickAnim/20)*820-50))*8-(-5.34324)));
        }
        else if (tickAnim >= 88 && tickAnim < 110) {
            xx = 5.08248 + (((tickAnim - 88) / 22) * (0.16695-(5.08248)));
            yy = 1.02226 + (((tickAnim - 88) / 22) * (7.49891-(1.02226)));
            zz = 1.137+Math.sin((Math.PI/180)*(((double)tickAnim/20)*820-50))*8 + (((tickAnim - 88) / 22) * (0.7533-(1.137+Math.sin((Math.PI/180)*(((double)tickAnim/20)*820-50))*8)));
        }
        else if (tickAnim >= 110 && tickAnim < 120) {
            xx = 0.16695 + (((tickAnim - 110) / 10) * (9.1697-(0.16695)));
            yy = 7.49891 + (((tickAnim - 110) / 10) * (12.74889-(7.49891)));
            zz = 0.7533 + (((tickAnim - 110) / 10) * (0.76896-(0.7533)));
        }
        else if (tickAnim >= 120 && tickAnim < 141) {
            xx = 9.1697 + (((tickAnim - 120) / 21) * (0-(9.1697)));
            yy = 12.74889 + (((tickAnim - 120) / 21) * (0-(12.74889)));
            zz = 0.76896 + (((tickAnim - 120) / 21) * (0-(0.76896)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 141) {
            xx = 0 + (((tickAnim - 0) / 141) * (-0.08261-(0)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150-30))*-3 + (((tickAnim - 0) / 141) * (-1.001+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150-30))*-3-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150-30))*-3)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*2 + (((tickAnim - 0) / 141) * (-1.7501+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*2-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*2)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail1, tail1.rotateAngleX + (float) Math.toRadians(xx), tail1.rotateAngleY + (float) Math.toRadians(yy), tail1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 141) {
            xx = 0 + (((tickAnim - 0) / 141) * (0.1062-(0)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150-80))*-5 + (((tickAnim - 0) / 141) * (-0.0011+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150-80))*-5-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150-80))*-5)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-50))*5 + (((tickAnim - 0) / 141) * (1.2545+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-50))*-5-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-50))*5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(xx), tail2.rotateAngleY + (float) Math.toRadians(yy), tail2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 141) {
            xx = 0 + (((tickAnim - 0) / 141) * (-0.8904-(0)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150-100))*-8 + (((tickAnim - 0) / 141) * (2.4021+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150-100))*-8-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150-100))*-8)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-80))*5 + (((tickAnim - 0) / 141) * (-9.098+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-80))*5-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-80))*5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(xx), tail3.rotateAngleY + (float) Math.toRadians(yy), tail3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 68) {
            xx = 0 + (((tickAnim - 0) / 68) * (5.25-(0)));
            yy = 0 + (((tickAnim - 0) / 68) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 68) * (0-(0)));
        }
        else if (tickAnim >= 68 && tickAnim < 120) {
            xx = 5.25 + (((tickAnim - 68) / 52) * (5.25-(5.25)));
            yy = 0 + (((tickAnim - 68) / 52) * (0-(0)));
            zz = 0 + (((tickAnim - 68) / 52) * (0-(0)));
        }
        else if (tickAnim >= 120 && tickAnim < 141) {
            xx = 5.25 + (((tickAnim - 120) / 21) * (0-(5.25)));
            yy = 0 + (((tickAnim - 120) / 21) * (0-(0)));
            zz = 0 + (((tickAnim - 120) / 21) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightarm, rightarm.rotateAngleX + (float) Math.toRadians(xx), rightarm.rotateAngleY + (float) Math.toRadians(yy), rightarm.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 68) {
            xx = 0 + (((tickAnim - 0) / 68) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 68) * (-0.125-(0)));
            zz = 0 + (((tickAnim - 0) / 68) * (0-(0)));
        }
        else if (tickAnim >= 68 && tickAnim < 120) {
            xx = 0 + (((tickAnim - 68) / 52) * (0-(0)));
            yy = -0.125 + (((tickAnim - 68) / 52) * (-0.125-(-0.125)));
            zz = 0 + (((tickAnim - 68) / 52) * (0-(0)));
        }
        else if (tickAnim >= 120 && tickAnim < 141) {
            xx = 0 + (((tickAnim - 120) / 21) * (0-(0)));
            yy = -0.125 + (((tickAnim - 120) / 21) * (0-(-0.125)));
            zz = 0 + (((tickAnim - 120) / 21) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightarm.rotationPointX = this.rightarm.rotationPointX + (float)(xx);
        this.rightarm.rotationPointY = this.rightarm.rotationPointY - (float)(yy);
        this.rightarm.rotationPointZ = this.rightarm.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 68) {
            xx = 0 + (((tickAnim - 0) / 68) * (15.25-(0)));
            yy = 0 + (((tickAnim - 0) / 68) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 68) * (0-(0)));
        }
        else if (tickAnim >= 68 && tickAnim < 120) {
            xx = 15.25 + (((tickAnim - 68) / 52) * (15.25-(15.25)));
            yy = 0 + (((tickAnim - 68) / 52) * (0-(0)));
            zz = 0 + (((tickAnim - 68) / 52) * (0-(0)));
        }
        else if (tickAnim >= 120 && tickAnim < 141) {
            xx = 15.25 + (((tickAnim - 120) / 21) * (0-(15.25)));
            yy = 0 + (((tickAnim - 120) / 21) * (0-(0)));
            zz = 0 + (((tickAnim - 120) / 21) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightarm2, rightarm2.rotateAngleX + (float) Math.toRadians(xx), rightarm2.rotateAngleY + (float) Math.toRadians(yy), rightarm2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 68) {
            xx = 0 + (((tickAnim - 0) / 68) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 68) * (-0.1-(0)));
            zz = 0 + (((tickAnim - 0) / 68) * (0-(0)));
        }
        else if (tickAnim >= 68 && tickAnim < 120) {
            xx = 0 + (((tickAnim - 68) / 52) * (0-(0)));
            yy = -0.1 + (((tickAnim - 68) / 52) * (-0.1-(-0.1)));
            zz = 0 + (((tickAnim - 68) / 52) * (0-(0)));
        }
        else if (tickAnim >= 120 && tickAnim < 141) {
            xx = 0 + (((tickAnim - 120) / 21) * (0-(0)));
            yy = -0.1 + (((tickAnim - 120) / 21) * (0-(-0.1)));
            zz = 0 + (((tickAnim - 120) / 21) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightarm2.rotationPointX = this.rightarm2.rotationPointX + (float)(xx);
        this.rightarm2.rotationPointY = this.rightarm2.rotationPointY - (float)(yy);
        this.rightarm2.rotationPointZ = this.rightarm2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 68) {
            xx = 0 + (((tickAnim - 0) / 68) * (-15.13403-(0)));
            yy = 0 + (((tickAnim - 0) / 68) * (-2.45278-(0)));
            zz = 0 + (((tickAnim - 0) / 68) * (-5.81529-(0)));
        }
        else if (tickAnim >= 68 && tickAnim < 120) {
            xx = -15.13403 + (((tickAnim - 68) / 52) * (-15.13403-(-15.13403)));
            yy = -2.45278 + (((tickAnim - 68) / 52) * (-2.45278-(-2.45278)));
            zz = -5.81529 + (((tickAnim - 68) / 52) * (-5.81529-(-5.81529)));
        }
        else if (tickAnim >= 120 && tickAnim < 141) {
            xx = -15.13403 + (((tickAnim - 120) / 21) * (0-(-15.13403)));
            yy = -2.45278 + (((tickAnim - 120) / 21) * (0-(-2.45278)));
            zz = -5.81529 + (((tickAnim - 120) / 21) * (0-(-5.81529)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(righthand, righthand.rotateAngleX + (float) Math.toRadians(xx), righthand.rotateAngleY + (float) Math.toRadians(yy), righthand.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 68) {
            xx = 0 + (((tickAnim - 0) / 68) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 68) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 68) * (0-(0)));
        }
        else if (tickAnim >= 68 && tickAnim < 120) {
            xx = 0 + (((tickAnim - 68) / 52) * (0-(0)));
            yy = 0 + (((tickAnim - 68) / 52) * (0-(0)));
            zz = 0 + (((tickAnim - 68) / 52) * (0-(0)));
        }
        else if (tickAnim >= 120 && tickAnim < 141) {
            xx = 0 + (((tickAnim - 120) / 21) * (0-(0)));
            yy = 0 + (((tickAnim - 120) / 21) * (0-(0)));
            zz = 0 + (((tickAnim - 120) / 21) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.righthand.rotationPointX = this.righthand.rotationPointX + (float)(xx);
        this.righthand.rotationPointY = this.righthand.rotationPointY - (float)(yy);
        this.righthand.rotationPointZ = this.righthand.rotationPointZ + (float)(zz);


    }
    public void animWalking(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraKunbarrasaurus entity = (EntityPrehistoricFloraKunbarrasaurus) entitylivingbaseIn;
        int animCycle = 30;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        this.setRotateAngle(base, base.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240/0.5-80))*-2), base.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240-50))*-0.5), base.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240-20))*-2.5));
        this.base.rotationPointX = this.base.rotationPointX + (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240-50))*0.1);
        this.base.rotationPointY = this.base.rotationPointY - (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240/0.5-90))*-0.1);
        this.base.rotationPointZ = this.base.rotationPointZ + (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240/0.5))*0.3);



        if (tickAnim >= 0 && tickAnim < 15) {
            xx = -9.70844 + (((tickAnim - 0) / 15) * (20.25-(-9.70844)));
            yy = -2.24929 + (((tickAnim - 0) / 15) * (0-(-2.24929)));
            zz = 1.68944 + (((tickAnim - 0) / 15) * (0-(1.68944)));
        }
        else if (tickAnim >= 15 && tickAnim < 28) {
            xx = 20.25 + (((tickAnim - 15) / 13) * (-14.61124-(20.25)));
            yy = 0 + (((tickAnim - 15) / 13) * (-3.00085-(0)));
            zz = 0 + (((tickAnim - 15) / 13) * (2.38374-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 30) {
            xx = -14.61124 + (((tickAnim - 28) / 2) * (-9.70844-(-14.61124)));
            yy = -3.00085 + (((tickAnim - 28) / 2) * (-2.24929-(-3.00085)));
            zz = 2.38374 + (((tickAnim - 28) / 2) * (1.68944-(2.38374)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightleg, rightleg.rotateAngleX + (float) Math.toRadians(xx), rightleg.rotateAngleY + (float) Math.toRadians(yy), rightleg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = -9.75 + (((tickAnim - 0) / 15) * (4.25-(-9.75)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 21) {
            xx = 4.25 + (((tickAnim - 15) / 6) * (25.5-(4.25)));
            yy = 0 + (((tickAnim - 15) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 6) * (0-(0)));
        }
        else if (tickAnim >= 21 && tickAnim < 28) {
            xx = 25.5 + (((tickAnim - 21) / 7) * (-11.75-(25.5)));
            yy = 0 + (((tickAnim - 21) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 21) / 7) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 30) {
            xx = -11.75 + (((tickAnim - 28) / 2) * (-9.75-(-11.75)));
            yy = 0 + (((tickAnim - 28) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightleg2, rightleg2.rotateAngleX + (float) Math.toRadians(xx), rightleg2.rotateAngleY + (float) Math.toRadians(yy), rightleg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 6) * (0.075-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (-0.05-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 6) / 9) * (0-(0)));
            yy = 0.075 + (((tickAnim - 6) / 9) * (-0.2-(0.075)));
            zz = -0.05 + (((tickAnim - 6) / 9) * (-0.2-(-0.05)));
        }
        else if (tickAnim >= 15 && tickAnim < 21) {
            xx = 0 + (((tickAnim - 15) / 6) * (0-(0)));
            yy = -0.2 + (((tickAnim - 15) / 6) * (-0.525-(-0.2)));
            zz = -0.2 + (((tickAnim - 15) / 6) * (-0.475-(-0.2)));
        }
        else if (tickAnim >= 21 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 21) / 7) * (0-(0)));
            yy = -0.525 + (((tickAnim - 21) / 7) * (0-(-0.525)));
            zz = -0.475 + (((tickAnim - 21) / 7) * (0-(-0.475)));
        }
        else if (tickAnim >= 28 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 28) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 28) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightleg2.rotationPointX = this.rightleg2.rotationPointX + (float)(xx);
        this.rightleg2.rotationPointY = this.rightleg2.rotationPointY - (float)(yy);
        this.rightleg2.rotationPointZ = this.rightleg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 5.5 + (((tickAnim - 0) / 15) * (21.75-(5.5)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 18) {
            xx = 21.75 + (((tickAnim - 15) / 3) * (14.25-(21.75)));
            yy = 0 + (((tickAnim - 15) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 3) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 22) {
            xx = 14.25 + (((tickAnim - 18) / 4) * (-20.75-(14.25)));
            yy = 0 + (((tickAnim - 18) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 4) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 24) {
            xx = -20.75 + (((tickAnim - 22) / 2) * (-27-(-20.75)));
            yy = 0 + (((tickAnim - 22) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 22) / 2) * (0-(0)));
        }
        else if (tickAnim >= 24 && tickAnim < 28) {
            xx = -27 + (((tickAnim - 24) / 4) * (14.75-(-27)));
            yy = 0 + (((tickAnim - 24) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 24) / 4) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 30) {
            xx = 14.75 + (((tickAnim - 28) / 2) * (5.5-(14.75)));
            yy = 0 + (((tickAnim - 28) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightleg3, rightleg3.rotateAngleX + (float) Math.toRadians(xx), rightleg3.rotateAngleY + (float) Math.toRadians(yy), rightleg3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 14.25 + (((tickAnim - 0) / 6) * (-10.09-(14.25)));
            yy = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 15) {
            xx = -10.09 + (((tickAnim - 6) / 9) * (-18.75-(-10.09)));
            yy = 0 + (((tickAnim - 6) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 9) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 22) {
            xx = -18.75 + (((tickAnim - 15) / 7) * (72.5-(-18.75)));
            yy = 0 + (((tickAnim - 15) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 7) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 24) {
            xx = 72.5 + (((tickAnim - 22) / 2) * (72.5-(72.5)));
            yy = 0 + (((tickAnim - 22) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 22) / 2) * (0-(0)));
        }
        else if (tickAnim >= 24 && tickAnim < 28) {
            xx = 72.5 + (((tickAnim - 24) / 4) * (12.5-(72.5)));
            yy = 0 + (((tickAnim - 24) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 24) / 4) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 30) {
            xx = 12.5 + (((tickAnim - 28) / 2) * (14.25-(12.5)));
            yy = 0 + (((tickAnim - 28) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightfoot, rightfoot.rotateAngleX + (float) Math.toRadians(xx), rightfoot.rotateAngleY + (float) Math.toRadians(yy), rightfoot.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            yy = 0.3 + (((tickAnim - 0) / 6) * (0.475-(0.3)));
            zz = 0 + (((tickAnim - 0) / 6) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 6) / 9) * (0-(0)));
            yy = 0.475 + (((tickAnim - 6) / 9) * (-0.025-(0.475)));
            zz = 0 + (((tickAnim - 6) / 9) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 15) / 3) * (0-(0)));
            yy = -0.025 + (((tickAnim - 15) / 3) * (0.535-(-0.025)));
            zz = 0 + (((tickAnim - 15) / 3) * (0.125-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 22) {
            xx = 0 + (((tickAnim - 18) / 4) * (0-(0)));
            yy = 0.535 + (((tickAnim - 18) / 4) * (0.6-(0.535)));
            zz = 0.125 + (((tickAnim - 18) / 4) * (-0.525-(0.125)));
        }
        else if (tickAnim >= 22 && tickAnim < 24) {
            xx = 0 + (((tickAnim - 22) / 2) * (0-(0)));
            yy = 0.6 + (((tickAnim - 22) / 2) * (0.6-(0.6)));
            zz = -0.525 + (((tickAnim - 22) / 2) * (-0.525-(-0.525)));
        }
        else if (tickAnim >= 24 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 24) / 4) * (0-(0)));
            yy = 0.6 + (((tickAnim - 24) / 4) * (0.3-(0.6)));
            zz = -0.525 + (((tickAnim - 24) / 4) * (0-(-0.525)));
        }
        else if (tickAnim >= 28 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 28) / 2) * (0-(0)));
            yy = 0.3 + (((tickAnim - 28) / 2) * (0.3-(0.3)));
            zz = 0 + (((tickAnim - 28) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightfoot.rotationPointX = this.rightfoot.rotationPointX + (float)(xx);
        this.rightfoot.rotationPointY = this.rightfoot.rotationPointY - (float)(yy);
        this.rightfoot.rotationPointZ = this.rightfoot.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 12) {
            xx = 20.25 + (((tickAnim - 0) / 12) * (-14.61124-(20.25)));
            yy = 0 + (((tickAnim - 0) / 12) * (-3.00085-(0)));
            zz = 0 + (((tickAnim - 0) / 12) * (2.38374-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 30) {
            xx = -14.61124 + (((tickAnim - 12) / 18) * (20.25-(-14.61124)));
            yy = -3.00085 + (((tickAnim - 12) / 18) * (0-(-3.00085)));
            zz = 2.38374 + (((tickAnim - 12) / 18) * (0-(2.38374)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftleg, leftleg.rotateAngleX + (float) Math.toRadians(xx), leftleg.rotateAngleY + (float) Math.toRadians(yy), leftleg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 4.25 + (((tickAnim - 0) / 4) * (25.5-(4.25)));
            yy = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 12) {
            xx = 25.5 + (((tickAnim - 4) / 8) * (-11.75-(25.5)));
            yy = 0 + (((tickAnim - 4) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 8) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 30) {
            xx = -11.75 + (((tickAnim - 12) / 18) * (4.25-(-11.75)));
            yy = 0 + (((tickAnim - 12) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 18) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftleg2, leftleg2.rotateAngleX + (float) Math.toRadians(xx), leftleg2.rotateAngleY + (float) Math.toRadians(yy), leftleg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            yy = -0.2 + (((tickAnim - 0) / 4) * (-0.525-(-0.2)));
            zz = -0.2 + (((tickAnim - 0) / 4) * (-0.475-(-0.2)));
        }
        else if (tickAnim >= 4 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 4) / 8) * (0-(0)));
            yy = -0.525 + (((tickAnim - 4) / 8) * (0-(-0.525)));
            zz = -0.475 + (((tickAnim - 4) / 8) * (0-(-0.475)));
        }
        else if (tickAnim >= 12 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 12) / 18) * (0-(0)));
            yy = 0 + (((tickAnim - 12) / 18) * (-0.2-(0)));
            zz = 0 + (((tickAnim - 12) / 18) * (-0.2-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftleg2.rotationPointX = this.leftleg2.rotationPointX + (float)(xx);
        this.leftleg2.rotationPointY = this.leftleg2.rotationPointY - (float)(yy);
        this.leftleg2.rotationPointZ = this.leftleg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 21.75 + (((tickAnim - 0) / 5) * (-20.75-(21.75)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = -20.75 + (((tickAnim - 5) / 3) * (-27-(-20.75)));
            yy = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 3) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 12) {
            xx = -27 + (((tickAnim - 8) / 4) * (14.75-(-27)));
            yy = 0 + (((tickAnim - 8) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 4) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 30) {
            xx = 14.75 + (((tickAnim - 12) / 18) * (21.75-(14.75)));
            yy = 0 + (((tickAnim - 12) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 18) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftleg3, leftleg3.rotateAngleX + (float) Math.toRadians(xx), leftleg3.rotateAngleY + (float) Math.toRadians(yy), leftleg3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = -18.75 + (((tickAnim - 0) / 5) * (72.5-(-18.75)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 72.5 + (((tickAnim - 5) / 3) * (72.5-(72.5)));
            yy = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 3) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 12) {
            xx = 72.5 + (((tickAnim - 8) / 4) * (12.5-(72.5)));
            yy = 0 + (((tickAnim - 8) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 4) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 20) {
            xx = 12.5 + (((tickAnim - 12) / 8) * (-15.45-(12.5)));
            yy = 0 + (((tickAnim - 12) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 8) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = -15.45 + (((tickAnim - 20) / 10) * (-18.75-(-15.45)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftfoot, leftfoot.rotateAngleX + (float) Math.toRadians(xx), leftfoot.rotateAngleY + (float) Math.toRadians(yy), leftfoot.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            yy = -0.3 + (((tickAnim - 0) / 2) * (0.535-(-0.3)));
            zz = 0 + (((tickAnim - 0) / 2) * (0.125-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 2) / 3) * (0-(0)));
            yy = 0.535 + (((tickAnim - 2) / 3) * (0.6-(0.535)));
            zz = 0.125 + (((tickAnim - 2) / 3) * (-0.525-(0.125)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            yy = 0.6 + (((tickAnim - 5) / 3) * (0.6-(0.6)));
            zz = -0.525 + (((tickAnim - 5) / 3) * (-0.525-(-0.525)));
        }
        else if (tickAnim >= 8 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 8) / 4) * (0-(0)));
            yy = 0.6 + (((tickAnim - 8) / 4) * (0.3-(0.6)));
            zz = -0.525 + (((tickAnim - 8) / 4) * (0-(-0.525)));
        }
        else if (tickAnim >= 12 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 12) / 8) * (0-(0)));
            yy = 0.3 + (((tickAnim - 12) / 8) * (0.705-(0.3)));
            zz = 0 + (((tickAnim - 12) / 8) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            yy = 0.705 + (((tickAnim - 20) / 10) * (-0.3-(0.705)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftfoot.rotationPointX = this.leftfoot.rotationPointX + (float)(xx);
        this.leftfoot.rotationPointY = this.leftfoot.rotationPointY - (float)(yy);
        this.leftfoot.rotationPointZ = this.leftfoot.rotationPointZ + (float)(zz);



        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240/0.5-50))*2), body.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240-130))*0.5), body.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240-150))*-2));


        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240/0.5+80))*-2), chest.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240-130))*-0.5), chest.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240-135))*2.5));



        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 19.5 + (((tickAnim - 0) / 15) * (-34-(19.5)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 30) {
            xx = -34 + (((tickAnim - 15) / 15) * (19.5-(-34)));
            yy = 0 + (((tickAnim - 15) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightarm, rightarm.rotateAngleX + (float) Math.toRadians(xx), rightarm.rotateAngleY + (float) Math.toRadians(yy), rightarm.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0.55-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 15) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 15) / 15) * (0-(0)));
            zz = 0.55 + (((tickAnim - 15) / 15) * (0-(0.55)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightarm.rotationPointX = this.rightarm.rotationPointX + (float)(xx);
        this.rightarm.rotationPointY = this.rightarm.rotationPointY - (float)(yy);
        this.rightarm.rotationPointZ = this.rightarm.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 14 + (((tickAnim - 0) / 8) * (-31.73014-(14)));
            yy = 0 + (((tickAnim - 0) / 8) * (0.31113-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (-1.29656-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 15) {
            xx = -31.73014 + (((tickAnim - 8) / 7) * (17.48217-(-31.73014)));
            yy = 0.31113 + (((tickAnim - 8) / 7) * (0.70003-(0.31113)));
            zz = -1.29656 + (((tickAnim - 8) / 7) * (-2.91725-(-1.29656)));
        }
        else if (tickAnim >= 15 && tickAnim < 30) {
            xx = 17.48217 + (((tickAnim - 15) / 15) * (14-(17.48217)));
            yy = 0.70003 + (((tickAnim - 15) / 15) * (0-(0.70003)));
            zz = -2.91725 + (((tickAnim - 15) / 15) * (0-(-2.91725)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightarm2, rightarm2.rotateAngleX + (float) Math.toRadians(xx), rightarm2.rotateAngleY + (float) Math.toRadians(yy), rightarm2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0.66-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (-0.225-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 3) / 5) * (0-(0)));
            yy = 0.66 + (((tickAnim - 3) / 5) * (0.075-(0.66)));
            zz = -0.225 + (((tickAnim - 3) / 5) * (0.38-(-0.225)));
        }
        else if (tickAnim >= 8 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 8) / 7) * (0-(0)));
            yy = 0.075 + (((tickAnim - 8) / 7) * (0.105-(0.075)));
            zz = 0.38 + (((tickAnim - 8) / 7) * (-0.035-(0.38)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 15) / 5) * (0-(0)));
            yy = 0.105 + (((tickAnim - 15) / 5) * (0-(0.105)));
            zz = -0.035 + (((tickAnim - 15) / 5) * (0-(-0.035)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightarm2.rotationPointX = this.rightarm2.rotationPointX + (float)(xx);
        this.rightarm2.rotationPointY = this.rightarm2.rotationPointY - (float)(yy);
        this.rightarm2.rotationPointZ = this.rightarm2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 53.50091 + (((tickAnim - 0) / 3) * (62.09256-(53.50091)));
            yy = -9.62043 + (((tickAnim - 0) / 3) * (-8.51654-(-9.62043)));
            zz = -2.74351 + (((tickAnim - 0) / 3) * (-1.31415-(-2.74351)));
        }
        else if (tickAnim >= 3 && tickAnim < 8) {
            xx = 62.09256 + (((tickAnim - 3) / 5) * (84.4953-(62.09256)));
            yy = -8.51654 + (((tickAnim - 3) / 5) * (-6.67673-(-8.51654)));
            zz = -1.31415 + (((tickAnim - 3) / 5) * (1.06811-(-1.31415)));
        }
        else if (tickAnim >= 8 && tickAnim < 15) {
            xx = 84.4953 + (((tickAnim - 8) / 7) * (16.11329-(84.4953)));
            yy = -6.67673 + (((tickAnim - 8) / 7) * (-2.9971-(-6.67673)));
            zz = 1.06811 + (((tickAnim - 8) / 7) * (5.83263-(1.06811)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = 16.11329 + (((tickAnim - 15) / 5) * (2.75-(16.11329)));
            yy = -2.9971 + (((tickAnim - 15) / 5) * (0-(-2.9971)));
            zz = 5.83263 + (((tickAnim - 15) / 5) * (2.75-(5.83263)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 2.75 + (((tickAnim - 20) / 10) * (53.50091-(2.75)));
            yy = 0 + (((tickAnim - 20) / 10) * (-9.62043-(0)));
            zz = 2.75 + (((tickAnim - 20) / 10) * (-2.74351-(2.75)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(righthand, righthand.rotateAngleX + (float) Math.toRadians(xx), righthand.rotateAngleY + (float) Math.toRadians(yy), righthand.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0.85 + (((tickAnim - 0) / 3) * (1.49-(0.85)));
            zz = 0.575 + (((tickAnim - 0) / 3) * (-0.01-(0.575)));
        }
        else if (tickAnim >= 3 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 3) / 5) * (0-(0)));
            yy = 1.49 + (((tickAnim - 3) / 5) * (0.775-(1.49)));
            zz = -0.01 + (((tickAnim - 3) / 5) * (-0.365-(-0.01)));
        }
        else if (tickAnim >= 8 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 8) / 7) * (0-(0)));
            yy = 0.775 + (((tickAnim - 8) / 7) * (0.375-(0.775)));
            zz = -0.365 + (((tickAnim - 8) / 7) * (0-(-0.365)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 15) / 5) * (0-(0)));
            yy = 0.375 + (((tickAnim - 15) / 5) * (0.75-(0.375)));
            zz = 0 + (((tickAnim - 15) / 5) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 20) / 5) * (0-(0)));
            yy = 0.75 + (((tickAnim - 20) / 5) * (0.96-(0.75)));
            zz = 0 + (((tickAnim - 20) / 5) * (0.1-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 25) / 5) * (0-(0)));
            yy = 0.96 + (((tickAnim - 25) / 5) * (0.85-(0.96)));
            zz = 0.1 + (((tickAnim - 25) / 5) * (0.575-(0.1)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.righthand.rotationPointX = this.righthand.rotationPointX + (float)(xx);
        this.righthand.rotationPointY = this.righthand.rotationPointY - (float)(yy);
        this.righthand.rotationPointZ = this.righthand.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = -34 + (((tickAnim - 0) / 15) * (19.5-(-34)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 30) {
            xx = 19.5 + (((tickAnim - 15) / 15) * (-34-(19.5)));
            yy = 0 + (((tickAnim - 15) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftarm, leftarm.rotateAngleX + (float) Math.toRadians(xx), leftarm.rotateAngleY + (float) Math.toRadians(yy), leftarm.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0.55 + (((tickAnim - 0) / 15) * (0-(0.55)));
        }
        else if (tickAnim >= 15 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 15) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 15) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 15) * (0.55-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftarm.rotationPointX = this.leftarm.rotationPointX + (float)(xx);
        this.leftarm.rotationPointY = this.leftarm.rotationPointY - (float)(yy);
        this.leftarm.rotationPointZ = this.leftarm.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 13.48217 + (((tickAnim - 0) / 15) * (14-(13.48217)));
            yy = -0.70003 + (((tickAnim - 0) / 15) * (0-(-0.70003)));
            zz = 2.91725 + (((tickAnim - 0) / 15) * (0-(2.91725)));
        }
        else if (tickAnim >= 15 && tickAnim < 23) {
            xx = 14 + (((tickAnim - 15) / 8) * (-31.73014-(14)));
            yy = 0 + (((tickAnim - 15) / 8) * (0.31113-(0)));
            zz = 0 + (((tickAnim - 15) / 8) * (-1.29656-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 30) {
            xx = -31.73014 + (((tickAnim - 23) / 7) * (13.48217-(-31.73014)));
            yy = 0.31113 + (((tickAnim - 23) / 7) * (-0.70003-(0.31113)));
            zz = -1.29656 + (((tickAnim - 23) / 7) * (2.91725-(-1.29656)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftarm2, leftarm2.rotateAngleX + (float) Math.toRadians(xx), leftarm2.rotateAngleY + (float) Math.toRadians(yy), leftarm2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 15 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 15) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 15) / 3) * (0.66-(0)));
            zz = 0 + (((tickAnim - 15) / 3) * (-0.225-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 18) / 5) * (0-(0)));
            yy = 0.66 + (((tickAnim - 18) / 5) * (0.075-(0.66)));
            zz = -0.225 + (((tickAnim - 18) / 5) * (0.38-(-0.225)));
        }
        else if (tickAnim >= 23 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 23) / 7) * (0-(0)));
            yy = 0.075 + (((tickAnim - 23) / 7) * (0-(0.075)));
            zz = 0.38 + (((tickAnim - 23) / 7) * (0-(0.38)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftarm2.rotationPointX = this.leftarm2.rotationPointX + (float)(xx);
        this.leftarm2.rotationPointY = this.leftarm2.rotationPointY - (float)(yy);
        this.leftarm2.rotationPointZ = this.leftarm2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 21.86329 + (((tickAnim - 0) / 8) * (-5.80161-(21.86329)));
            yy = 2.9971 + (((tickAnim - 0) / 8) * (7.1523-(2.9971)));
            zz = -5.83263 + (((tickAnim - 0) / 8) * (-0.45233-(-5.83263)));
        }
        else if (tickAnim >= 8 && tickAnim < 15) {
            xx = -5.80161 + (((tickAnim - 8) / 7) * (53.50091-(-5.80161)));
            yy = 7.1523 + (((tickAnim - 8) / 7) * (9.62043-(7.1523)));
            zz = -0.45233 + (((tickAnim - 8) / 7) * (2.74351-(-0.45233)));
        }
        else if (tickAnim >= 15 && tickAnim < 18) {
            xx = 53.50091 + (((tickAnim - 15) / 3) * (62.09256-(53.50091)));
            yy = 9.62043 + (((tickAnim - 15) / 3) * (8.51654-(9.62043)));
            zz = 2.74351 + (((tickAnim - 15) / 3) * (1.31415-(2.74351)));
        }
        else if (tickAnim >= 18 && tickAnim < 23) {
            xx = 62.09256 + (((tickAnim - 18) / 5) * (84.4953-(62.09256)));
            yy = 8.51654 + (((tickAnim - 18) / 5) * (6.67673-(8.51654)));
            zz = 1.31415 + (((tickAnim - 18) / 5) * (1.06811-(1.31415)));
        }
        else if (tickAnim >= 23 && tickAnim < 30) {
            xx = 84.4953 + (((tickAnim - 23) / 7) * (21.86329-(84.4953)));
            yy = 6.67673 + (((tickAnim - 23) / 7) * (2.9971-(6.67673)));
            zz = 1.06811 + (((tickAnim - 23) / 7) * (-5.83263-(1.06811)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(lefthand, lefthand.rotateAngleX + (float) Math.toRadians(xx), lefthand.rotateAngleY + (float) Math.toRadians(yy), lefthand.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0.2 + (((tickAnim - 0) / 3) * (0.815-(0.2)));
            zz = 0 + (((tickAnim - 0) / 3) * (0.13-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 3) / 5) * (0-(0)));
            yy = 0.815 + (((tickAnim - 3) / 5) * (0.745-(0.815)));
            zz = 0.13 + (((tickAnim - 3) / 5) * (0.29-(0.13)));
        }
        else if (tickAnim >= 8 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 8) / 7) * (0-(0)));
            yy = 0.745 + (((tickAnim - 8) / 7) * (0.85-(0.745)));
            zz = 0.29 + (((tickAnim - 8) / 7) * (0.575-(0.29)));
        }
        else if (tickAnim >= 15 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 15) / 3) * (0-(0)));
            yy = 0.85 + (((tickAnim - 15) / 3) * (1.49-(0.85)));
            zz = 0.575 + (((tickAnim - 15) / 3) * (-0.01-(0.575)));
        }
        else if (tickAnim >= 18 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 18) / 5) * (0-(0)));
            yy = 1.49 + (((tickAnim - 18) / 5) * (0.775-(1.49)));
            zz = -0.01 + (((tickAnim - 18) / 5) * (-0.365-(-0.01)));
        }
        else if (tickAnim >= 23 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 23) / 7) * (0-(0)));
            yy = 0.775 + (((tickAnim - 23) / 7) * (0.2-(0.775)));
            zz = -0.365 + (((tickAnim - 23) / 7) * (0-(-0.365)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.lefthand.rotationPointX = this.lefthand.rotationPointX + (float)(xx);
        this.lefthand.rotationPointY = this.lefthand.rotationPointY - (float)(yy);
        this.lefthand.rotationPointZ = this.lefthand.rotationPointZ + (float)(zz);



        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240/0.5+50))*-1), neck.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240-130))*1), neck.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240-150))*2.5));


        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240/0.5+80))*1), neck2.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240-130))*-1), neck2.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240-200))*-2.5));


        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240/0.5+130))*2), head.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240-130))*1), head.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240-200))*-2.5));


        this.setRotateAngle(tail1, tail1.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240/0.5-80))*-0.5), tail1.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240-100))*-2), tail1.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240-20))*-2.5));


        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240/0.5-140))*-1), tail2.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240-150))*-4), tail2.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240-30))*-3));


        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240/0.5-200))*-3), tail3.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240-200))*-6), tail3.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240-30))*-3));
       
        
    }
    public void animRunning(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraKunbarrasaurus entity = (EntityPrehistoricFloraKunbarrasaurus) entitylivingbaseIn;
        int animCycle = 17;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        this.setRotateAngle(base, base.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*246/0.3-80))*-3), base.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*246/0.6-50))*-2), base.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*246/0.598-20))*-4));

        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*246/0.3-50))*0.1 + (((tickAnim - 0) / 5) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*246/0.3-50))*0.1-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*246/0.3-50))*0.1)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*246/0.3-90))*-0.5 + (((tickAnim - 0) / 5) * (0.65+Math.sin((Math.PI/180)*(((double)tickAnim/20)*246/0.3-90))*-0.5-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*246/0.3-90))*-0.5)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*246/0.3))*0.5 + (((tickAnim - 0) / 5) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*246/0.3))*0.5-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*246/0.3))*0.5)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*246/0.3-50))*0.1 + (((tickAnim - 5) / 3) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*246/0.3-50))*0.1-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*246/0.3-50))*0.1)));
            yy = 0.65+Math.sin((Math.PI/180)*(((double)tickAnim/20)*246/0.3-90))*-0.5 + (((tickAnim - 5) / 3) * (0.025+Math.sin((Math.PI/180)*(((double)tickAnim/20)*246/0.3-90))*-0.5-(0.65+Math.sin((Math.PI/180)*(((double)tickAnim/20)*246/0.3-90))*-0.5)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*246/0.3))*0.5 + (((tickAnim - 5) / 3) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*246/0.3))*0.5-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*246/0.3))*0.5)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*246/0.3-50))*0.1 + (((tickAnim - 8) / 5) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*246/0.3-50))*0.1-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*246/0.3-50))*0.1)));
            yy = 0.025+Math.sin((Math.PI/180)*(((double)tickAnim/20)*246/0.3-90))*-0.5 + (((tickAnim - 8) / 5) * (0.65+Math.sin((Math.PI/180)*(((double)tickAnim/20)*246/0.3-90))*-0.5-(0.025+Math.sin((Math.PI/180)*(((double)tickAnim/20)*246/0.3-90))*-0.5)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*246/0.3))*0.5 + (((tickAnim - 8) / 5) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*246/0.3))*0.5-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*246/0.3))*0.5)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
            xx = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*246/0.3-50))*0.1 + (((tickAnim - 13) / 5) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*246/0.3-50))*0.1-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*246/0.3-50))*0.1)));
            yy = 0.65+Math.sin((Math.PI/180)*(((double)tickAnim/20)*246/0.3-90))*-0.5 + (((tickAnim - 13) / 5) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*246/0.3-90))*-0.5-(0.65+Math.sin((Math.PI/180)*(((double)tickAnim/20)*246/0.3-90))*-0.5)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*246/0.3))*0.5 + (((tickAnim - 13) / 5) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*246/0.3))*0.5-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*246/0.3))*0.5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.base.rotationPointX = this.base.rotationPointX + (float)(xx);
        this.base.rotationPointY = this.base.rotationPointY - (float)(yy);
        this.base.rotationPointZ = this.base.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 9) {
            xx = -16.86124 + (((tickAnim - 0) / 9) * (24.5-(-16.86124)));
            yy = -3.00085 + (((tickAnim - 0) / 9) * (0-(-3.00085)));
            zz = 2.38374 + (((tickAnim - 0) / 9) * (0-(2.38374)));
        }
        else if (tickAnim >= 9 && tickAnim < 18) {
            xx = 24.5 + (((tickAnim - 9) / 9) * (-16.86124-(24.5)));
            yy = 0 + (((tickAnim - 9) / 9) * (-3.00085-(0)));
            zz = 0 + (((tickAnim - 9) / 9) * (2.38374-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightleg, rightleg.rotateAngleX + (float) Math.toRadians(xx), rightleg.rotateAngleY + (float) Math.toRadians(yy), rightleg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 9) {
            xx = -16.9684 + (((tickAnim - 0) / 9) * (5.75-(-16.9684)));
            yy = 0.476 + (((tickAnim - 0) / 9) * (0-(0.476)));
            zz = 0.30228 + (((tickAnim - 0) / 9) * (0-(0.30228)));
        }
        else if (tickAnim >= 9 && tickAnim < 13) {
            xx = 5.75 + (((tickAnim - 9) / 4) * (25.5-(5.75)));
            yy = 0 + (((tickAnim - 9) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 4) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
            xx = 25.5 + (((tickAnim - 13) / 5) * (-16.9684-(25.5)));
            yy = 0 + (((tickAnim - 13) / 5) * (0.476-(0)));
            zz = 0 + (((tickAnim - 13) / 5) * (0.30228-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightleg2, rightleg2.rotateAngleX + (float) Math.toRadians(xx), rightleg2.rotateAngleY + (float) Math.toRadians(yy), rightleg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 4) * (0.075-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (-0.05-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 4) / 5) * (0-(0)));
            yy = 0.075 + (((tickAnim - 4) / 5) * (-0.2-(0.075)));
            zz = -0.05 + (((tickAnim - 4) / 5) * (-0.2-(-0.05)));
        }
        else if (tickAnim >= 9 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 9) / 4) * (0-(0)));
            yy = -0.2 + (((tickAnim - 9) / 4) * (-0.525-(-0.2)));
            zz = -0.2 + (((tickAnim - 9) / 4) * (-0.475-(-0.2)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 13) / 5) * (0-(0)));
            yy = -0.525 + (((tickAnim - 13) / 5) * (0-(-0.525)));
            zz = -0.475 + (((tickAnim - 13) / 5) * (0-(-0.475)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightleg2.rotationPointX = this.rightleg2.rotationPointX + (float)(xx);
        this.rightleg2.rotationPointY = this.rightleg2.rotationPointY - (float)(yy);
        this.rightleg2.rotationPointZ = this.rightleg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 9) {
            xx = 22 + (((tickAnim - 0) / 9) * (21.75-(22)));
            yy = 0 + (((tickAnim - 0) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 9) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 11) {
            xx = 21.75 + (((tickAnim - 9) / 2) * (14.25-(21.75)));
            yy = 0 + (((tickAnim - 9) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 2) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 13) {
            xx = 14.25 + (((tickAnim - 11) / 2) * (-20.75-(14.25)));
            yy = 0 + (((tickAnim - 11) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 2) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = -20.75 + (((tickAnim - 13) / 2) * (-27-(-20.75)));
            yy = 0 + (((tickAnim - 13) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 2) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 18) {
            xx = -27 + (((tickAnim - 15) / 3) * (22-(-27)));
            yy = 0 + (((tickAnim - 15) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightleg3, rightleg3.rotateAngleX + (float) Math.toRadians(xx), rightleg3.rotateAngleY + (float) Math.toRadians(yy), rightleg3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 12.47408 + (((tickAnim - 0) / 4) * (-10.09-(12.47408)));
            yy = 0.8111 + (((tickAnim - 0) / 4) * (0-(0.8111)));
            zz = -3.66135 + (((tickAnim - 0) / 4) * (0-(-3.66135)));
        }
        else if (tickAnim >= 4 && tickAnim < 9) {
            xx = -10.09 + (((tickAnim - 4) / 5) * (0.5-(-10.09)));
            yy = 0 + (((tickAnim - 4) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 5) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 13) {
            xx = 0.5 + (((tickAnim - 9) / 4) * (72.5-(0.5)));
            yy = 0 + (((tickAnim - 9) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 4) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = 72.5 + (((tickAnim - 13) / 2) * (72.5-(72.5)));
            yy = 0 + (((tickAnim - 13) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 2) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 18) {
            xx = 72.5 + (((tickAnim - 15) / 3) * (12.47408-(72.5)));
            yy = 0 + (((tickAnim - 15) / 3) * (0.8111-(0)));
            zz = 0 + (((tickAnim - 15) / 3) * (-3.66135-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightfoot, rightfoot.rotateAngleX + (float) Math.toRadians(xx), rightfoot.rotateAngleY + (float) Math.toRadians(yy), rightfoot.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            yy = 0.2 + (((tickAnim - 0) / 4) * (0.475-(0.2)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 4) / 5) * (0-(0)));
            yy = 0.475 + (((tickAnim - 4) / 5) * (-0.025-(0.475)));
            zz = 0 + (((tickAnim - 4) / 5) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 9) / 2) * (0-(0)));
            yy = -0.025 + (((tickAnim - 9) / 2) * (0.535-(-0.025)));
            zz = 0 + (((tickAnim - 9) / 2) * (0.125-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 11) / 2) * (0-(0)));
            yy = 0.535 + (((tickAnim - 11) / 2) * (0.6-(0.535)));
            zz = 0.125 + (((tickAnim - 11) / 2) * (-0.525-(0.125)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 13) / 2) * (0-(0)));
            yy = 0.6 + (((tickAnim - 13) / 2) * (0.6-(0.6)));
            zz = -0.525 + (((tickAnim - 13) / 2) * (-0.525-(-0.525)));
        }
        else if (tickAnim >= 15 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 15) / 3) * (0-(0)));
            yy = 0.6 + (((tickAnim - 15) / 3) * (0.2-(0.6)));
            zz = -0.525 + (((tickAnim - 15) / 3) * (0-(-0.525)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightfoot.rotationPointX = this.rightfoot.rotationPointX + (float)(xx);
        this.rightfoot.rotationPointY = this.rightfoot.rotationPointY - (float)(yy);
        this.rightfoot.rotationPointZ = this.rightfoot.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 26.5 + (((tickAnim - 0) / 8) * (-17.36124-(26.5)));
            yy = 0 + (((tickAnim - 0) / 8) * (-3.00085-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (2.38374-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 18) {
            xx = -17.36124 + (((tickAnim - 8) / 10) * (26.5-(-17.36124)));
            yy = -3.00085 + (((tickAnim - 8) / 10) * (0-(-3.00085)));
            zz = 2.38374 + (((tickAnim - 8) / 10) * (0-(2.38374)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftleg, leftleg.rotateAngleX + (float) Math.toRadians(xx), leftleg.rotateAngleY + (float) Math.toRadians(yy), leftleg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 4.25 + (((tickAnim - 0) / 3) * (25.5-(4.25)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 8) {
            xx = 25.5 + (((tickAnim - 3) / 5) * (-21.16467-(25.5)));
            yy = 0 + (((tickAnim - 3) / 5) * (1.26747-(0)));
            zz = 0 + (((tickAnim - 3) / 5) * (0.04381-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 18) {
            xx = -21.16467 + (((tickAnim - 8) / 10) * (4.25-(-21.16467)));
            yy = 1.26747 + (((tickAnim - 8) / 10) * (0-(1.26747)));
            zz = 0.04381 + (((tickAnim - 8) / 10) * (0-(0.04381)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftleg2, leftleg2.rotateAngleX + (float) Math.toRadians(xx), leftleg2.rotateAngleY + (float) Math.toRadians(yy), leftleg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = -0.2 + (((tickAnim - 0) / 3) * (-0.525-(-0.2)));
            zz = -0.2 + (((tickAnim - 0) / 3) * (-0.475-(-0.2)));
        }
        else if (tickAnim >= 3 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 3) / 5) * (0-(0)));
            yy = -0.525 + (((tickAnim - 3) / 5) * (0-(-0.525)));
            zz = -0.475 + (((tickAnim - 3) / 5) * (0-(-0.475)));
        }
        else if (tickAnim >= 8 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 8) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 8) / 10) * (-0.2-(0)));
            zz = 0 + (((tickAnim - 8) / 10) * (-0.2-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftleg2.rotationPointX = this.leftleg2.rotationPointX + (float)(xx);
        this.leftleg2.rotationPointY = this.leftleg2.rotationPointY - (float)(yy);
        this.leftleg2.rotationPointZ = this.leftleg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 21.75 + (((tickAnim - 0) / 3) * (-20.75-(21.75)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 6) {
            xx = -20.75 + (((tickAnim - 3) / 3) * (-27-(-20.75)));
            yy = 0 + (((tickAnim - 3) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 3) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = -27 + (((tickAnim - 6) / 2) * (17.75-(-27)));
            yy = 0 + (((tickAnim - 6) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 2) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 18) {
            xx = 17.75 + (((tickAnim - 8) / 10) * (21.75-(17.75)));
            yy = 0 + (((tickAnim - 8) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftleg3, leftleg3.rotateAngleX + (float) Math.toRadians(xx), leftleg3.rotateAngleY + (float) Math.toRadians(yy), leftleg3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = -0.75 + (((tickAnim - 0) / 3) * (72.5-(-0.75)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 6) {
            xx = 72.5 + (((tickAnim - 3) / 3) * (72.5-(72.5)));
            yy = 0 + (((tickAnim - 3) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 3) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = 72.5 + (((tickAnim - 6) / 2) * (19.25-(72.5)));
            yy = 0 + (((tickAnim - 6) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 2) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 12) {
            xx = 19.25 + (((tickAnim - 8) / 4) * (-9.41468-(19.25)));
            yy = 0 + (((tickAnim - 8) / 4) * (-0.81992-(0)));
            zz = 0 + (((tickAnim - 8) / 4) * (-4.93248-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 18) {
            xx = -9.41468 + (((tickAnim - 12) / 6) * (-0.75-(-9.41468)));
            yy = -0.81992 + (((tickAnim - 12) / 6) * (0-(-0.81992)));
            zz = -4.93248 + (((tickAnim - 12) / 6) * (0-(-4.93248)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftfoot, leftfoot.rotateAngleX + (float) Math.toRadians(xx), leftfoot.rotateAngleY + (float) Math.toRadians(yy), leftfoot.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            yy = -0.3 + (((tickAnim - 0) / 2) * (0.535-(-0.3)));
            zz = 0 + (((tickAnim - 0) / 2) * (0.125-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 2) / 1) * (0-(0)));
            yy = 0.535 + (((tickAnim - 2) / 1) * (0.6-(0.535)));
            zz = 0.125 + (((tickAnim - 2) / 1) * (-0.525-(0.125)));
        }
        else if (tickAnim >= 3 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 3) / 3) * (0-(0)));
            yy = 0.6 + (((tickAnim - 3) / 3) * (0.6-(0.6)));
            zz = -0.525 + (((tickAnim - 3) / 3) * (-0.525-(-0.525)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 6) / 2) * (0-(0)));
            yy = 0.6 + (((tickAnim - 6) / 2) * (0.3-(0.6)));
            zz = -0.525 + (((tickAnim - 6) / 2) * (0-(-0.525)));
        }
        else if (tickAnim >= 8 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 8) / 4) * (0-(0)));
            yy = 0.3 + (((tickAnim - 8) / 4) * (1.23-(0.3)));
            zz = 0 + (((tickAnim - 8) / 4) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 12) / 6) * (0-(0)));
            yy = 1.23 + (((tickAnim - 12) / 6) * (-0.3-(1.23)));
            zz = 0 + (((tickAnim - 12) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftfoot.rotationPointX = this.leftfoot.rotationPointX + (float)(xx);
        this.leftfoot.rotationPointY = this.leftfoot.rotationPointY - (float)(yy);
        this.leftfoot.rotationPointZ = this.leftfoot.rotationPointZ + (float)(zz);



        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*246/0.3-90))*3), body.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*246/0.6-130))*2), body.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*246/0.6-150))*-4));


        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*246/0.3+80))*-3), chest.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*246/0.6-130))*-1), chest.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*246/0.598-135))*4));



        if (tickAnim >= 0 && tickAnim < 9) {
            xx = 19.5 + (((tickAnim - 0) / 9) * (-34-(19.5)));
            yy = 0 + (((tickAnim - 0) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 9) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 18) {
            xx = -34 + (((tickAnim - 9) / 9) * (19.5-(-34)));
            yy = 0 + (((tickAnim - 9) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 9) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightarm, rightarm.rotateAngleX + (float) Math.toRadians(xx), rightarm.rotateAngleY + (float) Math.toRadians(yy), rightarm.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 0) / 9) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 9) * (0.55-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 9) / 9) * (0-(0)));
            yy = 0 + (((tickAnim - 9) / 9) * (0-(0)));
            zz = 0.55 + (((tickAnim - 9) / 9) * (0-(0.55)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightarm.rotationPointX = this.rightarm.rotationPointX + (float)(xx);
        this.rightarm.rotationPointY = this.rightarm.rotationPointY - (float)(yy);
        this.rightarm.rotationPointZ = this.rightarm.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 14 + (((tickAnim - 0) / 5) * (-31.73014-(14)));
            yy = 0 + (((tickAnim - 0) / 5) * (0.31113-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (-1.29656-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 9) {
            xx = -31.73014 + (((tickAnim - 5) / 4) * (17.48217-(-31.73014)));
            yy = 0.31113 + (((tickAnim - 5) / 4) * (0.70003-(0.31113)));
            zz = -1.29656 + (((tickAnim - 5) / 4) * (-2.91725-(-1.29656)));
        }
        else if (tickAnim >= 9 && tickAnim < 18) {
            xx = 17.48217 + (((tickAnim - 9) / 9) * (14-(17.48217)));
            yy = 0.70003 + (((tickAnim - 9) / 9) * (0-(0.70003)));
            zz = -2.91725 + (((tickAnim - 9) / 9) * (0-(-2.91725)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightarm2, rightarm2.rotateAngleX + (float) Math.toRadians(xx), rightarm2.rotateAngleY + (float) Math.toRadians(yy), rightarm2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0.66-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (-0.225-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            yy = 0.66 + (((tickAnim - 3) / 2) * (0.075-(0.66)));
            zz = -0.225 + (((tickAnim - 3) / 2) * (0.38-(-0.225)));
        }
        else if (tickAnim >= 5 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 5) / 4) * (0-(0)));
            yy = 0.075 + (((tickAnim - 5) / 4) * (0.105-(0.075)));
            zz = 0.38 + (((tickAnim - 5) / 4) * (-0.035-(0.38)));
        }
        else if (tickAnim >= 9 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 9) / 3) * (0-(0)));
            yy = 0.105 + (((tickAnim - 9) / 3) * (0-(0.105)));
            zz = -0.035 + (((tickAnim - 9) / 3) * (0-(-0.035)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightarm2.rotationPointX = this.rightarm2.rotationPointX + (float)(xx);
        this.rightarm2.rotationPointY = this.rightarm2.rotationPointY - (float)(yy);
        this.rightarm2.rotationPointZ = this.rightarm2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 53.50091 + (((tickAnim - 0) / 3) * (62.09256-(53.50091)));
            yy = -9.62043 + (((tickAnim - 0) / 3) * (-8.51654-(-9.62043)));
            zz = -2.74351 + (((tickAnim - 0) / 3) * (-1.31415-(-2.74351)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 62.09256 + (((tickAnim - 3) / 2) * (84.4953-(62.09256)));
            yy = -8.51654 + (((tickAnim - 3) / 2) * (-6.67673-(-8.51654)));
            zz = -1.31415 + (((tickAnim - 3) / 2) * (1.06811-(-1.31415)));
        }
        else if (tickAnim >= 5 && tickAnim < 9) {
            xx = 84.4953 + (((tickAnim - 5) / 4) * (16.11329-(84.4953)));
            yy = -6.67673 + (((tickAnim - 5) / 4) * (-2.9971-(-6.67673)));
            zz = 1.06811 + (((tickAnim - 5) / 4) * (5.83263-(1.06811)));
        }
        else if (tickAnim >= 9 && tickAnim < 12) {
            xx = 16.11329 + (((tickAnim - 9) / 3) * (2.75-(16.11329)));
            yy = -2.9971 + (((tickAnim - 9) / 3) * (0-(-2.9971)));
            zz = 5.83263 + (((tickAnim - 9) / 3) * (2.75-(5.83263)));
        }
        else if (tickAnim >= 12 && tickAnim < 18) {
            xx = 2.75 + (((tickAnim - 12) / 6) * (53.50091-(2.75)));
            yy = 0 + (((tickAnim - 12) / 6) * (-9.62043-(0)));
            zz = 2.75 + (((tickAnim - 12) / 6) * (-2.74351-(2.75)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(righthand, righthand.rotateAngleX + (float) Math.toRadians(xx), righthand.rotateAngleY + (float) Math.toRadians(yy), righthand.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0.85 + (((tickAnim - 0) / 3) * (1.49-(0.85)));
            zz = 0.575 + (((tickAnim - 0) / 3) * (-0.01-(0.575)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            yy = 1.49 + (((tickAnim - 3) / 2) * (0.775-(1.49)));
            zz = -0.01 + (((tickAnim - 3) / 2) * (-0.365-(-0.01)));
        }
        else if (tickAnim >= 5 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 5) / 4) * (0-(0)));
            yy = 0.775 + (((tickAnim - 5) / 4) * (0.375-(0.775)));
            zz = -0.365 + (((tickAnim - 5) / 4) * (0-(-0.365)));
        }
        else if (tickAnim >= 9 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 9) / 3) * (0-(0)));
            yy = 0.375 + (((tickAnim - 9) / 3) * (0.75-(0.375)));
            zz = 0 + (((tickAnim - 9) / 3) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 12) / 3) * (0-(0)));
            yy = 0.75 + (((tickAnim - 12) / 3) * (0.96-(0.75)));
            zz = 0 + (((tickAnim - 12) / 3) * (0.1-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 15) / 3) * (0-(0)));
            yy = 0.96 + (((tickAnim - 15) / 3) * (0.85-(0.96)));
            zz = 0.1 + (((tickAnim - 15) / 3) * (0.575-(0.1)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.righthand.rotationPointX = this.righthand.rotationPointX + (float)(xx);
        this.righthand.rotationPointY = this.righthand.rotationPointY - (float)(yy);
        this.righthand.rotationPointZ = this.righthand.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 9) {
            xx = -34 + (((tickAnim - 0) / 9) * (19.5-(-34)));
            yy = 0 + (((tickAnim - 0) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 9) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 18) {
            xx = 19.5 + (((tickAnim - 9) / 9) * (-34-(19.5)));
            yy = 0 + (((tickAnim - 9) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 9) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftarm, leftarm.rotateAngleX + (float) Math.toRadians(xx), leftarm.rotateAngleY + (float) Math.toRadians(yy), leftarm.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 0) / 9) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 9) * (0-(0)));
            zz = 0.55 + (((tickAnim - 0) / 9) * (0-(0.55)));
        }
        else if (tickAnim >= 9 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 9) / 9) * (0-(0)));
            yy = 0 + (((tickAnim - 9) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 9) * (0.55-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftarm.rotationPointX = this.leftarm.rotationPointX + (float)(xx);
        this.leftarm.rotationPointY = this.leftarm.rotationPointY - (float)(yy);
        this.leftarm.rotationPointZ = this.leftarm.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 9) {
            xx = 13.48217 + (((tickAnim - 0) / 9) * (14-(13.48217)));
            yy = -0.70003 + (((tickAnim - 0) / 9) * (0-(-0.70003)));
            zz = 2.91725 + (((tickAnim - 0) / 9) * (0-(2.91725)));
        }
        else if (tickAnim >= 9 && tickAnim < 13) {
            xx = 14 + (((tickAnim - 9) / 4) * (-31.73014-(14)));
            yy = 0 + (((tickAnim - 9) / 4) * (0.31113-(0)));
            zz = 0 + (((tickAnim - 9) / 4) * (-1.29656-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
            xx = -31.73014 + (((tickAnim - 13) / 5) * (13.48217-(-31.73014)));
            yy = 0.31113 + (((tickAnim - 13) / 5) * (-0.70003-(0.31113)));
            zz = -1.29656 + (((tickAnim - 13) / 5) * (2.91725-(-1.29656)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftarm2, leftarm2.rotateAngleX + (float) Math.toRadians(xx), leftarm2.rotateAngleY + (float) Math.toRadians(yy), leftarm2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 9 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 9) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 9) / 2) * (0.66-(0)));
            zz = 0 + (((tickAnim - 9) / 2) * (-0.225-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 11) / 2) * (0-(0)));
            yy = 0.66 + (((tickAnim - 11) / 2) * (0.075-(0.66)));
            zz = -0.225 + (((tickAnim - 11) / 2) * (0.38-(-0.225)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 13) / 5) * (0-(0)));
            yy = 0.075 + (((tickAnim - 13) / 5) * (0-(0.075)));
            zz = 0.38 + (((tickAnim - 13) / 5) * (0-(0.38)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftarm2.rotationPointX = this.leftarm2.rotationPointX + (float)(xx);
        this.leftarm2.rotationPointY = this.leftarm2.rotationPointY - (float)(yy);
        this.leftarm2.rotationPointZ = this.leftarm2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 21.86329 + (((tickAnim - 0) / 5) * (-5.80161-(21.86329)));
            yy = 2.9971 + (((tickAnim - 0) / 5) * (7.1523-(2.9971)));
            zz = -5.83263 + (((tickAnim - 0) / 5) * (-0.45233-(-5.83263)));
        }
        else if (tickAnim >= 5 && tickAnim < 9) {
            xx = -5.80161 + (((tickAnim - 5) / 4) * (53.50091-(-5.80161)));
            yy = 7.1523 + (((tickAnim - 5) / 4) * (9.62043-(7.1523)));
            zz = -0.45233 + (((tickAnim - 5) / 4) * (2.74351-(-0.45233)));
        }
        else if (tickAnim >= 9 && tickAnim < 11) {
            xx = 53.50091 + (((tickAnim - 9) / 2) * (62.09256-(53.50091)));
            yy = 9.62043 + (((tickAnim - 9) / 2) * (8.51654-(9.62043)));
            zz = 2.74351 + (((tickAnim - 9) / 2) * (1.31415-(2.74351)));
        }
        else if (tickAnim >= 11 && tickAnim < 13) {
            xx = 62.09256 + (((tickAnim - 11) / 2) * (84.4953-(62.09256)));
            yy = 8.51654 + (((tickAnim - 11) / 2) * (6.67673-(8.51654)));
            zz = 1.31415 + (((tickAnim - 11) / 2) * (1.06811-(1.31415)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
            xx = 84.4953 + (((tickAnim - 13) / 5) * (21.86329-(84.4953)));
            yy = 6.67673 + (((tickAnim - 13) / 5) * (2.9971-(6.67673)));
            zz = 1.06811 + (((tickAnim - 13) / 5) * (-5.83263-(1.06811)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(lefthand, lefthand.rotateAngleX + (float) Math.toRadians(xx), lefthand.rotateAngleY + (float) Math.toRadians(yy), lefthand.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0.2 + (((tickAnim - 0) / 3) * (0.815-(0.2)));
            zz = 0 + (((tickAnim - 0) / 3) * (0.13-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            yy = 0.815 + (((tickAnim - 3) / 2) * (0.745-(0.815)));
            zz = 0.13 + (((tickAnim - 3) / 2) * (0.29-(0.13)));
        }
        else if (tickAnim >= 5 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 5) / 4) * (0-(0)));
            yy = 0.745 + (((tickAnim - 5) / 4) * (0.85-(0.745)));
            zz = 0.29 + (((tickAnim - 5) / 4) * (0.575-(0.29)));
        }
        else if (tickAnim >= 9 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 9) / 2) * (0-(0)));
            yy = 0.85 + (((tickAnim - 9) / 2) * (1.49-(0.85)));
            zz = 0.575 + (((tickAnim - 9) / 2) * (-0.01-(0.575)));
        }
        else if (tickAnim >= 11 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 11) / 2) * (0-(0)));
            yy = 1.49 + (((tickAnim - 11) / 2) * (0.775-(1.49)));
            zz = -0.01 + (((tickAnim - 11) / 2) * (-0.365-(-0.01)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 13) / 5) * (0-(0)));
            yy = 0.775 + (((tickAnim - 13) / 5) * (0.2-(0.775)));
            zz = -0.365 + (((tickAnim - 13) / 5) * (0-(-0.365)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.lefthand.rotationPointX = this.lefthand.rotationPointX + (float)(xx);
        this.lefthand.rotationPointY = this.lefthand.rotationPointY - (float)(yy);
        this.lefthand.rotationPointZ = this.lefthand.rotationPointZ + (float)(zz);



        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*246/0.3+50))*4), neck.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*246/0.6-130))*1), neck.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*246/0.6-150))*2.5));


        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*246/0.3+80))*2), neck2.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*246/0.6-130))*-1), neck2.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*246/0.6-200))*-2.5));


        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*246/0.3+130))*2), head.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*246/0.6-130))*1), head.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*246/0.6-200))*-2.5));


        this.setRotateAngle(tail1, tail1.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*246/0.3-80))*-0.5), tail1.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*246/0.6-100))*-4), tail1.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*246/0.6-20))*-2.5));


        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*246/0.3-140))*-3), tail2.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*246/0.6-150))*-6), tail2.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*246/0.6-30))*-3));


        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*246/0.3-200))*-6), tail3.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*246/0.6-200))*-8), tail3.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*246/0.6-30))*-3));
        
        
    }

        public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        EntityPrehistoricFloraKunbarrasaurus e = (EntityPrehistoricFloraKunbarrasaurus) entity;
        animator.update(entity);


    }
}
